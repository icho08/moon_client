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
import us.m0vy.moondlc.m0vyguard.bagh_2;
import us.m0vy.moondlc.m0vyguard.tzb;
import us.m0vy.moondlc.m0vyguard.dh_3;
import us.m0vy.moondlc.m0vyguard.q;

public final class kj
implements dh_3 {
    private static final int fxomsgg09sqo = 323311645;
    private static final int ihb4ai8d5h = 385517969;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int m4e0xwp6;

    public static float zjdh_2(float f, float f2) {
        return (float)Math.ceil(f2 / 2.0f - f / 2.0f);
    }

    public static double ghrl(double d, double d2) {
        return Math.ceil(d2 / 2.0 - d / 2.0);
    }

    public static boolean sms_2(double d, double d2, double d3, double d4, int n, int n2) {
        return (double)n >= d && (double)n < d + d3 && (double)n2 >= d2 && (double)n2 < d2 + d4;
    }

    public static boolean thath_2(double d, double d2, double d3, double d4, bagh_2 bagh2) {
        return kj.sms_2(d, d2, d3, d4, bagh2.getMouseX(), bagh2.getMouseY());
    }

    public static boolean ajd_2(q q2, double d, double d2) {
        return kj.hsha(q2.ghdhw(), q2.thkhh_2(), q2.thn(), q2.jdth(), d, d2);
    }

    public static boolean thq_2(tzb tzb2, double d, double d2) {
        return kj.hsha(tzb2.tad_4(), tzb2.dhshkh(), tzb2.zsq_3(), tzb2.thb_3(), d, d2);
    }

    public static boolean hsha(double d, double d2, double d3, double d4, double d5, double d6) {
        return d5 >= d && d5 < d + d3 && d6 >= d2 && d6 < d2 + d4;
    }

    public static float ghaz_2(float f, float f2, float f3, float f4, double d) {
        return (float)(Math.min(1.0, Math.max(0.0, (d - (double)f3) / (double)f4)) * (double)(f2 - f)) + f;
    }

    public static float jfh_2(float f, float f2, float f3, float f4, double d) {
        return (float)((d - (double)f3) / (double)f4 * (double)(f2 - f)) + f;
    }

    public static float dhrt(float f, float f2, float f3) {
        return (f - f2) / (f3 - f2);
    }

    public static class_5611 zdd_8() {
        if (mc.method_22683() == null) {
            return new class_5611(0.0f, 0.0f);
        }
        return new class_5611((float)(kj.mc.field_1729.method_1603() / mc.method_22683().method_4495()), (float)(kj.mc.field_1729.method_1604() / mc.method_22683().method_4495()));
    }

    @Generated
    private kj() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String[] hfwluiukne(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite vsptboq8gpcyto(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ fxomsgg09sqo ^ string.hashCode() ^ n2 + ihb4ai8d5h + i * 1568994451) + fxomsgg09sqo) ^ ihb4ai8d5h));
            }
            String[] stringArray = kj.hfwluiukne(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

