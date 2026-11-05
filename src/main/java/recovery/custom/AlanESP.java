package recovery.custom;

import java.awt.Color;
import client.module.Module;
import client.event.RenderListener;
import net.minecraft.client.gui.ScaledResolution;
import client.module.Category;

/** Editable Render module. Every living target receives the Alan portrait at its body dimensions. */
public final class AlanESP extends Module implements RenderListener {
    public AlanESP(long constructorKey){super("AlanESP","AlanESP",constructorKey,new Color(91,184,255),Category.RENDER);}
    @Override public void method_43_$e45a9973e5(long eventKey) {}
    @Override public void method_43y$e45a9973e5(long eventKey) {}
    @Override public void method_43x$c973149af1(short high,int middle,char low) {}
    @Override public void onRender3D(long eventKey,float partialTicks){if(ClientAccess.enabled(this))AlanVisuals.entities(partialTicks);}
    @Override public void onRender2D(int high,float partialTicks,char middle,int low,ScaledResolution resolution) {}
    @Override public void onRenderOverlay(float partialTicks,long eventKey,ScaledResolution resolution,byte phase) {}
}
