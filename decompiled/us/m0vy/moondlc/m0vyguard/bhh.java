/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_5611
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_5611;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.byh;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.fh;
import us.m0vy.moondlc.m0vyguard.nt_3;

public final class bhh {
    private static final int zw28uitpb9b0 = -1225852752;
    private static final int r16ym2bi = -1995023052;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vzl5rtwwu579;

    public static float khrth(float f, float f2) {
        return (float)Math.ceil(f2 / 2.0f - f / 2.0f);
    }

    public static double srf_2(double d, double d2) {
        return Math.ceil(d2 / 2.0 - d / 2.0);
    }

    public static boolean rkhl(double d, double d2, double d3, double d4, int n, int n2) {
        return (double)n >= d && (double)n < d + d3 && (double)n2 >= d2 && (double)n2 < d2 + d4;
    }

    public static boolean zzy_3(double d, double d2, double d3, double d4, bzth bzth2) {
        return bhh.rkhl(d, d2, d3, d4, bzth2.getMouseX(), bzth2.getMouseY());
    }

    public static boolean dfw_2(fh fh2, double d, double d2) {
        return bhh.thsb_2(fh2.khdb_2(), fh2.sw(), fh2.shfz(), fh2.khll(), d, d2);
    }

    public static boolean dhzr(nt_3 nt2, double d, double d2) {
        return bhh.thsb_2(nt2.shjgh(), nt2.stk(), nt2.thbkh(), nt2.jfn(), d, d2);
    }

    public static boolean thsb_2(double d, double d2, double d3, double d4, double d5, double d6) {
        return d5 >= d && d5 < d + d3 && d6 >= d2 && d6 < d2 + d4;
    }

    public static float tad(float f, float f2, float f3, float f4, double d) {
        return (float)(Math.min(1.0, Math.max(0.0, (d - (double)f3) / (double)f4)) * (double)(f2 - f)) + f;
    }

    public static float tah_4(float f, float f2, float f3, float f4, double d) {
        return (float)((d - (double)f3) / (double)f4 * (double)(f2 - f)) + f;
    }

    public static float zrgh(float f, float f2, float f3) {
        return (f - f2) / (f3 - f2);
    }

    public static class_5611 yh_2() {
        return new class_5611((float)(tthy.mc.field_1729.method_1603() / byh.tdw.khrz_2()), (float)(tthy.mc.field_1729.method_1604() / byh.tdw.khrz_2()));
    }

    @Generated
    private bhh() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String[] l8z0ud2kuoi(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite wo5gfcwu(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ zw28uitpb9b0 ^ string.hashCode() ^ n2 + r16ym2bi + i * 337976921) + zw28uitpb9b0) ^ r16ym2bi));
            }
            String[] stringArray = bhh.l8z0ud2kuoi(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

