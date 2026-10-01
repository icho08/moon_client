/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_4587
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import us.m0vy.moondlc.m0vyguard.byq;

public final class zkh_4 {
    private static final Vector3f[] shgha;
    private static final int[][] rghsh;
    private static final float[] shfn;
    private static final int hidoipnyliv = 735958412;
    private static final int bk79b0j9mvdos = 1646498047;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int k33t6txl3;

    public static void asn(class_4587 class_45872, class_287 class_2872, float f, float f2, float f3, float f4, byq byq2) {
        class_45872.method_22903();
        class_45872.method_46416(f, f2, f3);
        class_45872.method_22905(f4, f4, f4);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        for (int i = 0; i < rghsh.length; ++i) {
            int[] nArray = rghsh[i];
            float f5 = shfn[i];
            Vector3f vector3f = shgha[nArray[0]];
            Vector3f vector3f2 = shgha[nArray[1]];
            Vector3f vector3f3 = shgha[nArray[2]];
            int n = zkh_4.rh_2(byq2.rk(), f5);
            class_2872.method_22918(matrix4f, vector3f.x, vector3f.y, vector3f.z).method_39415(n);
            class_2872.method_22918(matrix4f, vector3f2.x, vector3f2.y, vector3f2.z).method_39415(n);
            class_2872.method_22918(matrix4f, vector3f3.x, vector3f3.y, vector3f3.z).method_39415(n);
        }
        class_45872.method_22909();
    }

    public static class_287 khkhb() {
        zkh_4.dhdh_9();
        return class_289.method_1348().method_60827(class_293.class_5596.field_27379, class_290.field_1576);
    }

    private static void dhdh_9() {
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private static int rh_2(int n, float f) {
        int n2 = n >> 24 & 0xFF;
        int n3 = (int)((float)(n >> 16 & 0xFF) * f);
        int n4 = (int)((float)(n >> 8 & 0xFF) * f);
        int n5 = (int)((float)(n & 0xFF) * f);
        n3 = Math.min(255, Math.max(0, n3));
        n4 = Math.min(255, Math.max(0, n4));
        n5 = Math.min(255, Math.max(0, n5));
        return n2 << 24 | n3 << 16 | n4 << 8 | n5;
    }

    @Generated
    private zkh_4() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String[] ev5elts28z8qy(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite j2ntpw38yf(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ hidoipnyliv ^ string.hashCode()) + (n2 + bk79b0j9mvdos) + i ^ hidoipnyliv, 18) + bk79b0j9mvdos);
            }
            String[] stringArray = zkh_4.ev5elts28z8qy(new String(cArray));
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

