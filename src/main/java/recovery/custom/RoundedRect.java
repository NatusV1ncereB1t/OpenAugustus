package recovery.custom;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

public final class RoundedRect {
    private static final class Buffers {
        final FloatBuffer model=BufferUtils.createFloatBuffer(16);
        final FloatBuffer projection=BufferUtils.createFloatBuffer(16);
        final IntBuffer viewport=BufferUtils.createIntBuffer(16);
    }
    private static final ThreadLocal<Buffers> BUFFERS=new ThreadLocal<Buffers>() {
        protected Buffers initialValue(){return new Buffers();}
    };
    private RoundedRect() {}

    private static double[] pixelPosition(Buffers buffers,double x,double y) {
        FloatBuffer m=buffers.model,p=buffers.projection;
        double ex=m.get(0)*x+m.get(4)*y+m.get(12),ey=m.get(1)*x+m.get(5)*y+m.get(13);
        double ez=m.get(2)*x+m.get(6)*y+m.get(14),ew=m.get(3)*x+m.get(7)*y+m.get(15);
        double cx=p.get(0)*ex+p.get(4)*ey+p.get(8)*ez+p.get(12)*ew;
        double cy=p.get(1)*ex+p.get(5)*ey+p.get(9)*ez+p.get(13)*ew;
        double cw=p.get(3)*ex+p.get(7)*ey+p.get(11)*ez+p.get(15)*ew;
        if(Math.abs(cw)<1e-10)return new double[]{x,y};
        return new double[]{cx/cw*buffers.viewport.get(2)*.5,cy/cw*buffers.viewport.get(3)*.5};
    }
    public static void draw(float x1,float y1,float x2,float y2,float radius,int argb) {
        drawCorners(x1,y1,x2,y2,radius,argb,true,true,true,true);
    }
    public static void drawSize(double x,double y,double width,double height,double radius,java.awt.Color color) {
        draw((float)x,(float)y,(float)(x+width),(float)(y+height),(float)radius,color.getRGB());
    }
    public static void drawCorners(float x1,float y1,float x2,float y2,float radius,int argb,boolean topLeft,boolean topRight,boolean bottomLeft,boolean bottomRight) {
        if(!Float.isFinite(x1)||!Float.isFinite(y1)||!Float.isFinite(x2)||!Float.isFinite(y2)||!Float.isFinite(radius))return;
        float left=Math.min(x1,x2),right=Math.max(x1,x2),top=Math.min(y1,y2),bottom=Math.max(y1,y2);
        if(left==right||top==bottom||(argb>>>24)==0)return;
        double r=Math.max(0,Math.min(radius,Math.min(right-left,bottom-top)*.5));
        Buffers buffers=BUFFERS.get();buffers.model.clear();buffers.projection.clear();buffers.viewport.clear();
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX,buffers.model);GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX,buffers.projection);GL11.glGetInteger(GL11.GL_VIEWPORT,buffers.viewport);
        double[] center=pixelPosition(buffers,(left+right)*.5,(top+bottom)*.5);
        double[] dx=pixelPosition(buffers,(left+right)*.5+1,(top+bottom)*.5),dy=pixelPosition(buffers,(left+right)*.5,(top+bottom)*.5+1);
        double scaleX=Math.max(.001,Math.hypot(dx[0]-center[0],dx[1]-center[1]));
        double scaleY=Math.max(.001,Math.hypot(dy[0]-center[0],dy[1]-center[1]));
        // Stencil writes ignore fragment alpha. A transparent AA fringe would still
        // replace stencil bits and let blur/bloom leak outside the visible outline.
        boolean stencilWrite=GL11.glIsEnabled(GL11.GL_STENCIL_TEST)
            && GL11.glGetInteger(GL11.GL_STENCIL_WRITEMASK)!=0
            && (GL11.glGetInteger(GL11.GL_STENCIL_FAIL)!=GL11.GL_KEEP
                || GL11.glGetInteger(GL11.GL_STENCIL_PASS_DEPTH_FAIL)!=GL11.GL_KEEP
                || GL11.glGetInteger(GL11.GL_STENCIL_PASS_DEPTH_PASS)!=GL11.GL_KEEP);
        double featherX=stencilWrite?0:Math.min(.5/scaleX,(right-left)*.25);
        double featherY=stencilWrite?0:Math.min(.5/scaleY,(bottom-top)*.25);
        int segments=Math.max(8,Math.min(64,(int)Math.ceil(Math.PI*.5*Math.sqrt(Math.max(1,r*Math.max(scaleX,scaleY))/.1))));
        int capacity=(segments+1)*4;
        int points=0;boolean[] rounded={bottomRight,topRight,topLeft,bottomLeft};
        double[] innerX=new double[capacity],innerY=new double[capacity],outerX=new double[capacity],outerY=new double[capacity];
        for(int corner=0;corner<4;corner++) {
            if(!rounded[corner]) {
                double cx=corner<2?right:left,cy=corner==0||corner==3?bottom:top;
                double sx=corner<2?1:-1,sy=corner==0||corner==3?1:-1;
                innerX[points]=cx-sx*featherX;innerY[points]=cy-sy*featherY;
                outerX[points]=cx+sx*featherX;outerY[points]=cy+sy*featherY;points++;continue;
            }
            double cx=(corner<2?right-r:left+r),cy=(corner==0||corner==3?bottom-r:top+r);
            for(int step=0;step<=segments;step++,points++) {
                double angle=Math.toRadians(corner*90+step*90.0/segments),sx=Math.sin(angle),sy=Math.cos(angle);
                innerX[points]=cx+sx*Math.max(0,r-featherX);innerY[points]=cy+sy*Math.max(0,r-featherY);
                outerX[points]=cx+sx*(r+featherX);outerY[points]=cy+sy*(r+featherY);
            }
        }
        float red=(argb>>16&255)/255f,green=(argb>>8&255)/255f,blue=(argb&255)/255f,alpha=(argb>>>24)/255f;
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        try {
            GL11.glDisable(GL11.GL_TEXTURE_2D);GL11.glDisable(GL11.GL_ALPHA_TEST);GL11.glDisable(GL11.GL_LIGHTING);GL11.glDisable(GL11.GL_CULL_FACE);
            GL11.glEnable(GL11.GL_BLEND);GL14.glBlendFuncSeparate(GL11.GL_SRC_ALPHA,GL11.GL_ONE_MINUS_SRC_ALPHA,GL11.GL_ONE,GL11.GL_ONE_MINUS_SRC_ALPHA);GL11.glDisable(GL11.GL_POLYGON_SMOOTH);GL11.glShadeModel(GL11.GL_SMOOTH);
            GL11.glColor4f(red,green,blue,alpha);
            if(r==0){GL11.glBegin(GL11.GL_QUADS);GL11.glVertex2d(left,top);GL11.glVertex2d(right,top);GL11.glVertex2d(right,bottom);GL11.glVertex2d(left,bottom);GL11.glEnd();return;}
            GL11.glBegin(GL11.GL_TRIANGLE_FAN);GL11.glVertex2d((left+right)*.5,(top+bottom)*.5);
            for(int i=0;i<=points;i++)GL11.glVertex2d(innerX[i%points],innerY[i%points]);GL11.glEnd();
            if(stencilWrite)return;
            GL11.glDepthMask(false);
            GL11.glBegin(GL11.GL_QUAD_STRIP);
            for(int i=0;i<=points;i++){int index=i%points;GL11.glColor4f(red,green,blue,alpha);GL11.glVertex2d(innerX[index],innerY[index]);GL11.glColor4f(red,green,blue,0);GL11.glVertex2d(outerX[index],outerY[index]);}
            GL11.glEnd();
        } finally {GL11.glPopAttrib();}
    }
}
