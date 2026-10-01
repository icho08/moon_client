/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_276
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_276;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import us.m0vy.moondlc.m0vyguard.tshth;
import us.movy.moondlc.mixin.accessors.FramebufferAccessor;

public class btd
implements tshth {
    private static final int j70ghez = 111871296;
    private static final int wfyolqs4b97 = -864027484;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int igqbsatc8yfyg;

    public static void dlj_2() {
        class_276 class_2762 = mc.method_1522();
        FramebufferAccessor framebufferAccessor = (FramebufferAccessor)class_2762;
        if (framebufferAccessor.getDepthAttachment() > -1) {
            mc.method_1522().method_1235(false);
            EXTFramebufferObject.glDeleteRenderbuffersEXT((int)framebufferAccessor.getDepthAttachment());
            int n = EXTFramebufferObject.glGenRenderbuffersEXT();
            EXTFramebufferObject.glBindRenderbufferEXT((int)36161, (int)n);
            EXTFramebufferObject.glRenderbufferStorageEXT((int)36161, (int)34041, (int)mc.method_22683().method_4480(), (int)mc.method_22683().method_4507());
            EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36128, (int)36161, (int)n);
            EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36096, (int)36161, (int)n);
            framebufferAccessor.setDepthAttachment(-1);
        }
        GL11.glStencilMask((int)255);
        GL11.glClear((int)1024);
        GL11.glEnable((int)2960);
        GL11.glStencilFunc((int)519, (int)1, (int)1);
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glDisable((int)2929);
        GL11.glColorMask((boolean)false, (boolean)false, (boolean)false, (boolean)false);
    }

    public static void htgh_2(int n) {
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GL11.glStencilFunc((int)514, (int)n, (int)1);
        GL11.glStencilOp((int)7680, (int)7680, (int)7680);
    }

    public static void dnth_2() {
        GL11.glDisable((int)2960);
        GL11.glEnable((int)2929);
    }

    private static String[] vevghpz1u0m(String string) {
        return string.split("\u0006\u001c", -1);
    }

    private static CallSite g69n58epkpo(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ j70ghez ^ string.hashCode() ^ n2 + wfyolqs4b97 + i * 1992491225) + j70ghez) ^ wfyolqs4b97));
            }
            String[] stringArray = btd.vevghpz1u0m(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

