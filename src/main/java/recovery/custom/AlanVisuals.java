package recovery.custom;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.reflect.*;
import java.nio.*;
import java.util.*;
import javax.imageio.ImageIO;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;

/** Alan portrait rendering. Images stretch directly to each surface; no ratio controls. */
public final class AlanVisuals {
    private static final String RESOURCE="/assets/augustus/alan/portrait.png";
    private static int texture;
    private static Object capeLocation;
    public static Object menuMode;
    private static final Set<Object> INITIALIZED=Collections.newSetFromMap(new IdentityHashMap<Object,Boolean>());
    private AlanVisuals() {}
    public static boolean legacyCape(boolean custom,Object player){Object module=ClientAccess.module("net.47He");return custom&&!(ClientAccess.enabled(module)&&ClientAccess.choice(ClientAccess.get(module,"46")).equals("Alan")&&player==ClientAccess.get(ClientAccess.minecraft(),"42P"));}
    public static void initializeModule(Object module) {
        if(!INITIALIZED.add(module))return;
        try{
            if(module.getClass().getName().equals("net.47H2"))ClientAccess.choices(ClientAccess.get(module,"47"),"Alan");
            if(module.getClass().getName().equals("net.47He"))ClientAccess.choices(ClientAccess.get(module,"46"),"Alan");
            if(module.getClass().getName().equals("net.47kr"))menuMode=ModuleCustomization.newChoice(module,"MainMenuBackground","Alan",new String[]{"Alan","Original"});
        }catch(Throwable error){ClientAccess.warn("Alan settings",error);}
    }
    private static BufferedImage portrait()throws IOException {
        try(InputStream in=AlanVisuals.class.getResourceAsStream(RESOURCE)){
            if(in==null)throw new FileNotFoundException(RESOURCE);BufferedImage image=ImageIO.read(in);if(image==null)throw new IOException("Invalid Alan portrait");return image;
        }
    }
    private static int texture()throws IOException {
        if(texture!=0)return texture;BufferedImage img=portrait();int w=img.getWidth(),h=img.getHeight();ByteBuffer pixels=BufferUtils.createByteBuffer(w*h*4);
        for(int y=0;y<h;y++)for(int x=0;x<w;x++){int c=img.getRGB(x,y);pixels.put((byte)(c>>>16)).put((byte)(c>>>8)).put((byte)c).put((byte)(c>>>24));}pixels.flip();
        int old=GL11.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);texture=GL11.glGenTextures();GL11.glBindTexture(GL11.GL_TEXTURE_2D,texture);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MIN_FILTER,GL11.GL_LINEAR);GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_MAG_FILTER,GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_WRAP_S,33071);GL11.glTexParameteri(GL11.GL_TEXTURE_2D,GL11.GL_TEXTURE_WRAP_T,33071);
        GL11.glTexImage2D(GL11.GL_TEXTURE_2D,0,GL11.GL_RGBA8,w,h,0,GL11.GL_RGBA,GL11.GL_UNSIGNED_BYTE,pixels);GL11.glBindTexture(GL11.GL_TEXTURE_2D,old);return texture;
    }
    public static void image(double x,double y,double width,double height) {
        try{
            int id=texture();GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
            try{GL11.glEnable(GL11.GL_TEXTURE_2D);GL11.glDisable(GL11.GL_LIGHTING);GL11.glDisable(GL11.GL_DEPTH_TEST);GL11.glDisable(GL11.GL_ALPHA_TEST);GL11.glEnable(GL11.GL_BLEND);GL11.glBlendFunc(GL11.GL_SRC_ALPHA,GL11.GL_ONE_MINUS_SRC_ALPHA);GL11.glColor4f(1,1,1,1);GL11.glBindTexture(GL11.GL_TEXTURE_2D,id);
                GL11.glBegin(GL11.GL_QUADS);GL11.glTexCoord2f(0,0);GL11.glVertex2d(x,y);GL11.glTexCoord2f(0,1);GL11.glVertex2d(x,y+height);GL11.glTexCoord2f(1,1);GL11.glVertex2d(x+width,y+height);GL11.glTexCoord2f(1,0);GL11.glVertex2d(x+width,y);GL11.glEnd();
            }finally{GL11.glPopAttrib();}
        }catch(Throwable error){ClientAccess.warn("Alan portrait rendering",error);}
    }
    public static boolean background(Object screen) {
        if(menuMode!=null&&!ClientAccess.choice(menuMode).equals("Alan"))return false;
        try{image(0,0,((Number)ClientAccess.get(screen,"43t")).intValue(),((Number)ClientAccess.get(screen,"49")).intValue());return true;}
        catch(Throwable error){ClientAccess.warn("Alan main menu",error);return false;}
    }
    public static boolean watermark(Object hud,Object resolution) {
        if(!ClientAccess.choice(ClientAccess.get(hud,"47")).equals("Alan"))return false;
        Object mc=ClientAccess.minecraft();int width=((Number)ClientAccess.get(mc,"44f")).intValue(),height=((Number)ClientAccess.get(mc,"44g")).intValue();
        float gui=((Number)ClientAccess.call(resolution,"40",int.class,new Class<?>[0])).floatValue();
        double x=ClientAccess.number(ClientAccess.get(hud,"45"),1)/100.0*width,y=ClientAccess.number(ClientAccess.get(hud,"42"),1)/100.0*height;
        double size=256*ClientAccess.number(ClientAccess.get(hud,"48"),.6);
        Object arrayList=ClientAccess.module("net.47QI");
        boolean sameSide=arrayList!=null&&ClientAccess.choice(ClientAccess.get(hud,"46")).equals(ClientAccess.choice(ClientAccess.get(arrayList,"46")));
        float reservedHeight=sameSide?(int)((float)size+1.0F)+1:0;
        ClientAccess.set(ClientAccess.type("net.47LS"),"47",reservedHeight);
        if(ClientAccess.choice(ClientAccess.get(hud,"46")).equals("Right"))x+=width-size;
        GL11.glPushMatrix();try{GL11.glScaled(1.0/gui,1.0/gui,1);image(x,y,size,size);}finally{GL11.glPopMatrix();}return true;
    }
    public static boolean imageWatermark(boolean original,Object hud) {
        return original||ClientAccess.choice(ClientAccess.get(hud,"47")).equals("Alan");
    }
    public static Object cape(Object player) {
        Object module=ClientAccess.module("net.47He");if(!ClientAccess.enabled(module)||!ClientAccess.choice(ClientAccess.get(module,"46")).equals("Alan"))return null;
        if(player!=ClientAccess.get(ClientAccess.minecraft(),"42P"))return null;
        try{
            if(capeLocation==null){
                // Vanilla cape atlas: front occupies 1..11 by 1..17 in a 64x32 texture.
                // Fill every face with the same photo so the back never exposes empty pixels.
                BufferedImage photo=portrait(),atlas=new BufferedImage(64,32,BufferedImage.TYPE_INT_ARGB);Graphics2D g=atlas.createGraphics();
                try{g.drawImage(photo,0,0,64,32,null);g.drawImage(photo,1,1,11,17,0,0,photo.getWidth(),photo.getHeight(),null);g.drawImage(photo,12,1,22,17,0,0,photo.getWidth(),photo.getHeight(),null);}finally{g.dispose();}
                Object mc=ClientAccess.minecraft(),manager=ClientAccess.call(mc,"43",ClientAccess.type("net.43b"),new Class<?>[0]);
                Class<?> dynamic=ClientAccess.type("net.47xe");Object image=dynamic.getConstructor(BufferedImage.class).newInstance(atlas);
                Method register=null;for(Method m:manager.getClass().getMethods())if(m.getReturnType().getName().equals("net.47or")&&m.getParameterTypes().length==2&&m.getParameterTypes()[0]==String.class&&m.getParameterTypes()[1].isAssignableFrom(dynamic)){register=m;break;}
                if(register==null)throw new IllegalStateException("Missing dynamic texture registration");capeLocation=register.invoke(manager,"alan-cape",image);
            }return capeLocation;
        }catch(Throwable error){ClientAccess.warn("Alan cape",error);return null;}
    }
    public static void entities(float partialTicks) {
        try{
            Object mc=ClientAccess.minecraft(),world=ClientAccess.get(mc,"44Q"),self=ClientAccess.get(mc,"42P");
            Object camera=ClientAccess.call(mc,"41",ClientAccess.type("net.47MQ"),new Class<?>[0]);
            if(camera==null)camera=self;if(world==null||camera==null)return;
            Class<?> living=ClientAccess.type("net.47aK");
            // World.loadedEntityList includes players, hostile mobs and passive animals.
            Collection<?> entities=(Collection<?>)ClientAccess.getDeclared("net.47jl",world,"44Q");
            if(entities==null)return;int id=texture();double cx=interpolate(camera,"48u","48Q",partialTicks),cy=interpolate(camera,"48O","48j",partialTicks),cz=interpolate(camera,"48l","42o",partialTicks);
            FloatBuffer view=BufferUtils.createFloatBuffer(16);GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX,view);
            double rx=view.get(0),ry=view.get(4),rz=view.get(8),ux=view.get(1),uy=view.get(5),uz=view.get(9);
            double rightLength=Math.sqrt(rx*rx+ry*ry+rz*rz),upLength=Math.sqrt(ux*ux+uy*uy+uz*uz);
            if(rightLength<1e-8||upLength<1e-8)return;rx/=rightLength;ry/=rightLength;rz/=rightLength;ux/=upLength;uy/=upLength;uz/=upLength;
            int activeTexture=GL11.glGetInteger(GL13.GL_ACTIVE_TEXTURE);
            GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
            try{GL13.glActiveTexture(GL13.GL_TEXTURE1);GL11.glDisable(GL11.GL_TEXTURE_2D);GL13.glActiveTexture(GL13.GL_TEXTURE0);GL11.glEnable(GL11.GL_TEXTURE_2D);GL11.glDisable(GL11.GL_DEPTH_TEST);GL11.glDepthMask(false);GL11.glDisable(GL11.GL_ALPHA_TEST);GL11.glDisable(GL11.GL_FOG);GL11.glDisable(GL11.GL_LIGHTING);GL11.glDisable(GL11.GL_CULL_FACE);GL11.glEnable(GL11.GL_BLEND);GL11.glBlendFunc(GL11.GL_SRC_ALPHA,GL11.GL_ONE_MINUS_SRC_ALPHA);GL11.glColor4f(1,1,1,1);GL11.glBindTexture(GL11.GL_TEXTURE_2D,id);
                for(Object entity:entities.toArray()){if(entity==null||entity==self||!living.isInstance(entity))continue;
                    double x=interpolate(entity,"48u","48Q",partialTicks)-cx,y=interpolate(entity,"48O","48j",partialTicks)-cy,z=interpolate(entity,"48l","42o",partialTicks)-cz;
                    double w=Math.max(.1,ClientAccess.coordinate(entity,"48w")),h=Math.max(.1,ClientAccess.coordinate(entity,"48"));
                    double centerY=y+h*.5,halfWidth=w*.5,halfHeight=h*.5;
                    GL11.glBegin(GL11.GL_QUADS);
                    GL11.glTexCoord2f(0,1);GL11.glVertex3d(x-rx*halfWidth-ux*halfHeight,centerY-ry*halfWidth-uy*halfHeight,z-rz*halfWidth-uz*halfHeight);
                    GL11.glTexCoord2f(1,1);GL11.glVertex3d(x+rx*halfWidth-ux*halfHeight,centerY+ry*halfWidth-uy*halfHeight,z+rz*halfWidth-uz*halfHeight);
                    GL11.glTexCoord2f(1,0);GL11.glVertex3d(x+rx*halfWidth+ux*halfHeight,centerY+ry*halfWidth+uy*halfHeight,z+rz*halfWidth+uz*halfHeight);
                    GL11.glTexCoord2f(0,0);GL11.glVertex3d(x-rx*halfWidth+ux*halfHeight,centerY-ry*halfWidth+uy*halfHeight,z-rz*halfWidth+uz*halfHeight);
                    GL11.glEnd();
                }
            }finally{GL11.glPopAttrib();GL13.glActiveTexture(activeTexture);}
        }catch(Throwable error){ClientAccess.warn("AlanESP",error);}
    }
    private static double interpolate(Object e,String previous,String current,float t){double a=ClientAccess.coordinate(e,previous);return a+(ClientAccess.coordinate(e,current)-a)*t;}
}
