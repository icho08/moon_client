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
import us.m0vy.moondlc.m0vyguard.dl;
import us.movy.moondlc.mixin.accessors.FramebufferAccessor;

public class ft_2
implements dl {
    private static final int ertpuhpj = 1509166244;
    private static final int zj8kh4chii7m = -2017531485;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int hd3cp4lqjk3xbv;

    public static void dna_4() {
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

    public static void tnk(int n) {
        GL11.glColorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GL11.glStencilFunc((int)514, (int)n, (int)1);
        GL11.glStencilOp((int)7680, (int)7680, (int)7680);
    }

    public static void ghthth() {
        GL11.glDisable((int)2960);
        GL11.glEnable((int)2929);
    }

    private static String[] htvxpz9nmu755(String string) {
        return string.split("\u0005\u0012", -1);
    }

    private static CallSite xcgxcgvxnjro(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ertpuhpj ^ string.hashCode() ^ n2 + zj8kh4chii7m + i * -888355817) + ertpuhpj) ^ zj8kh4chii7m));
            }
            String[] stringArray = ft_2.htvxpz9nmu755(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

