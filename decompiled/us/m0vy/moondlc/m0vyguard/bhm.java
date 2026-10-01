/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_4587
 *  org.joml.Matrix4f
 *  org.lwjgl.opengl.GL11
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Deque;
import lombok.Generated;
import net.minecraft.class_4587;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import us.m0vy.moondlc.m0vyguard.bkhz_2;
import us.m0vy.moondlc.m0vyguard.rth_3;

public final class bhm
implements bkhz_2 {
    private static final Deque ja;
    private static final int b75frco6u49 = 731447132;
    private static final int p7bzzh69 = -408533111;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int c1c0xgc55s;

    private static void zqs_3(rth_3 rth2) {
        int n = bdn_2.method_4506();
        double d = bdn_2.method_4495();
        float f = rth2.tsth * (float)d;
        float f2 = rth2.bdgh_2 * (float)d;
        float f3 = (rth2.tsth + rth2.thkhd_2) * (float)d;
        float f4 = (rth2.bdgh_2 + rth2.bdw_2) * (float)d;
        int n2 = (int)Math.floor(f);
        int n3 = (int)Math.floor((double)n - Math.ceil(f4) + 0.5);
        int n4 = (int)Math.max(0.0f, (float)((int)Math.ceil(f3) - n2));
        int n5 = (int)Math.max(0.0f, (float)((int)Math.ceil(f4) - (int)Math.floor(f2)) - 1.0f);
        GL11.glEnable((int)3089);
        GL11.glScissor((int)n2, (int)n3, (int)n4, (int)n5);
    }

    public static void bqj(float f, float f2, float f3, float f4) {
        rth_3 rth2 = new rth_3(f, f2, f3, f4);
        bhm.tha_4(rth2);
    }

    public static void dar_2(class_4587 class_45872, float f, float f2, float f3, float f4) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        rth_3 rth2 = new rth_3(f, f2, f3, f4).rda_3(matrix4f);
        bhm.tha_4(rth2);
    }

    public static void rza_4(Matrix4f matrix4f, float f, float f2, float f3, float f4) {
        rth_3 rth2 = new rth_3(f, f2, f3, f4);
        if (matrix4f != null) {
            rth2 = rth2.rda_3(matrix4f);
        }
        bhm.tha_4(rth2);
    }

    private static void tha_4(rth_3 rth2) {
        if (!ja.isEmpty()) {
            rth2 = bhm.hzdh_2((rth_3)ja.peek(), rth2);
        }
        ja.push(rth2);
        bhm.zqs_3(rth2);
    }

    public static void sdhsh_2() {
        if (!ja.isEmpty()) {
            ja.pop();
        }
        if (!ja.isEmpty()) {
            bhm.zqs_3((rth_3)ja.peek());
        } else {
            GL11.glDisable((int)3089);
        }
    }

    private static rth_3 hzdh_2(rth_3 rth2, rth_3 rth3) {
        float f = Math.max(rth2.dkh_3(), rth3.dkh_3());
        float f2 = Math.max(rth2.ttt_7(), rth3.ttt_7());
        float f3 = Math.min(rth2.thths_2(), rth3.thths_2());
        float f4 = Math.min(rth2.shdhh_2(), rth3.shdhh_2());
        float f5 = Math.max(0.0f, f3 - f);
        float f6 = Math.max(0.0f, f4 - f2);
        return new rth_3(f, f2, f5, f6);
    }

    public static boolean akhf() {
        return !ja.isEmpty();
    }

    public static void dmy() {
        ja.clear();
        GL11.glDisable((int)3089);
    }

    public static int jrth() {
        return ja.size();
    }

    @Deprecated
    public static void djf(float f, float f2, float f3, float f4) {
        bhm.bqj(f, f2, f3, f4);
    }

    @Deprecated
    public static void rdw(float f, float f2, float f3, float f4, class_4587 class_45872) {
        if (class_45872 != null) {
            bhm.dar_2(class_45872, f, f2, f3, f4);
        } else {
            bhm.bqj(f, f2, f3, f4);
        }
    }

    @Deprecated
    public static void sshq_2(float f, float f2, float f3, float f4, Matrix4f matrix4f) {
        bhm.rza_4(matrix4f, f, f2, f3, f4);
    }

    @Deprecated
    public static void zlsh_2() {
        bhm.sdhsh_2();
    }

    @Generated
    private bhm() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String[] gfaqz7i2g(String string) {
        return string.split("\b\u0019", -1);
    }

    private static CallSite e55wyq0a1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ b75frco6u49 ^ string.hashCode() ^ n2 + p7bzzh69 ^ i * 1245811 ^ b75frco6u49, 4) ^ p7bzzh69));
            }
            String[] stringArray = bhm.gfaqz7i2g(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

