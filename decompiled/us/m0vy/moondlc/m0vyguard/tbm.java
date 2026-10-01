/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.commons.lang3.StringUtils
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.function.Function;
import lombok.Generated;
import org.apache.commons.lang3.StringUtils;

public final class tbm
extends Enum {
    public static final /* enum */ tbm bthth;
    public static final /* enum */ tbm thtt;
    public static final /* enum */ tbm shkhdh;
    public static final /* enum */ tbm sl_2;
    public static final /* enum */ tbm ssf_2;
    public static final /* enum */ tbm qq;
    public static final /* enum */ tbm srdh;
    public static final /* enum */ tbm la;
    public static final /* enum */ tbm byy;
    public static final /* enum */ tbm hdd_2;
    public static final /* enum */ tbm rshdh;
    public static final /* enum */ tbm hthr;
    public static final /* enum */ tbm dqf;
    public static final /* enum */ tbm bzk;
    public static final /* enum */ tbm dhzf_2;
    public static final /* enum */ tbm hrkh;
    public static final /* enum */ tbm shat;
    public static final /* enum */ tbm zqk;
    public static final /* enum */ tbm hash_3;
    public static final /* enum */ tbm tkhn;
    public static final /* enum */ tbm ghm;
    public static final /* enum */ tbm sza_2;
    public static final /* enum */ tbm thz_6;
    public static final /* enum */ tbm bghz_2;
    public static final /* enum */ tbm tba;
    public static final /* enum */ tbm jhth_2;
    public static final /* enum */ tbm khnk;
    public static final /* enum */ tbm khjsh;
    public static final /* enum */ tbm dab_2;
    public static final /* enum */ tbm bzh_4;
    private final Function zqh_2;
    private static final tbm[] zlz;
    private static final int cmtlpxx2i = -530700777;
    private static final int afs3a72 = 907077618;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";

    public static tbm[] values() {
        return (tbm[])zlz.clone();
    }

    public static tbm valueOf(String string) {
        return Enum.valueOf(tbm.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private tbm() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zqh_2 = var3_2;
    }

    public double apply(double d) {
        return (Double)this.getFunction().apply(d);
    }

    public float apply(float f) {
        return ((Double)this.getFunction().apply(Double.valueOf(f))).floatValue();
    }

    public String toString() {
        return StringUtils.capitalize((String)super.toString().toLowerCase().replace("_", " "));
    }

    @Generated
    public Function getFunction() {
        return this.zqh_2;
    }

    private static Double lambda$static$29(Double d) {
        float f = 1.3f;
        float f2 = f + 1.0f;
        return Math.max(0.0, 1.0 + (double)f2 * Math.pow(d - 1.0, 3.0) + (double)f * Math.pow(d - 1.0, 2.0));
    }

    private static Double lambda$static$28(Double d) {
        return d == 0.0 ? 0.0 : (d == 1.0 ? 1.0 : (d < 0.5 ? -(Math.pow(2.0, 20.0 * d - 10.0) * Math.sin((20.0 * d - 11.125) * 0.6981317007977318)) : (Math.pow(2.0, -20.0 * d + 10.0) * Math.sin((20.0 * d - 11.125) * 0.6981317007977318) + 2.0) / 2.0));
    }

    private static Double lambda$static$27(Double d) {
        return d == 0.0 ? 0.0 : (d == 1.0 ? 1.0 : Math.pow(2.0, -10.0 * d) * Math.sin((d * 10.0 - 0.75) * 2.0943951023931953) + 1.0);
    }

    private static Double lambda$static$26(Double d) {
        return d == 0.0 ? 0.0 : (d == 1.0 ? 1.0 : -Math.pow(2.0, 10.0 * d - 10.0) * Math.sin((d * 10.0 - 10.75) * 2.0943951023931953));
    }

    private static Double lambda$static$25(Double d) {
        double d2 = 2.5949095;
        double d3 = d2 + 1.0;
        return d < 0.5 ? Math.pow(2.0 * d, 2.0) * (d3 * 2.0 * d - d2) / 2.0 : (Math.pow(2.0 * d - 2.0, 2.0) * (d3 * (2.0 * d - 2.0) + d2) + 2.0) / 2.0;
    }

    private static Double lambda$static$24(Double d) {
        return 1.0 + 2.70158 * Math.pow(d - 1.0, 3.0) + 1.70158 * Math.pow(d - 1.0, 2.0);
    }

    private static Double lambda$static$23(Double d) {
        return 2.70158 * d * d * d - 1.70158 * d * d;
    }

    private static Double lambda$static$22(Double d) {
        return d < 0.5 ? (1.0 - Math.sqrt(1.0 - 4.0 * d * d)) / 2.0 : (Math.sqrt(1.0 - 4.0 * (d - 1.0) * d) + 1.0) / 2.0;
    }

    private static Double lambda$static$21(Double d) {
        d = d - 1.0;
        return Math.sqrt(1.0 - d * d);
    }

    private static Double lambda$static$20(Double d) {
        return 1.0 - Math.sqrt(1.0 - d * d);
    }

    private static Double lambda$static$19(Double d) {
        return d == 0.0 ? 0.0 : (d == 1.0 ? 1.0 : (d < 0.5 ? Math.pow(2.0, 20.0 * d - 10.0) / 2.0 : (2.0 - Math.pow(2.0, -20.0 * d + 10.0)) / 2.0));
    }

    private static Double lambda$static$18(Double d) {
        return d == 1.0 ? 1.0 : 1.0 - Math.pow(2.0, -10.0 * d);
    }

    private static Double lambda$static$17(Double d) {
        return d == 0.0 ? 0.0 : Math.pow(2.0, 10.0 * d - 10.0);
    }

    private static Double lambda$static$16(Double d) {
        return (1.0 - Math.cos(Math.PI * d)) / 2.0;
    }

    private static Double lambda$static$15(Double d) {
        return Math.sin(d * Math.PI / 2.0);
    }

    private static Double lambda$static$14(Double d) {
        return 1.0 - Math.cos(d * Math.PI / 2.0);
    }

    private static Double lambda$static$13(Double d) {
        double d2;
        if (d < 0.5) {
            d2 = 16.0 * d * d * d * d * d;
        } else {
            d = d - 1.0;
            d2 = 1.0 + 16.0 * d * d * d * d * d;
        }
        return d2;
    }

    private static Double lambda$static$12(Double d) {
        d = d - 1.0;
        return 1.0 + d * d * d * d * d;
    }

    private static Double lambda$static$11(Double d) {
        return d * d * d * d * d;
    }

    private static Double lambda$static$10(Double d) {
        double d2;
        if (d < 0.5) {
            d2 = 8.0 * d * d * d * d;
        } else {
            d = d - 1.0;
            d2 = 1.0 - 8.0 * d * d * d * d;
        }
        return d2;
    }

    private static Double lambda$static$9(Double d) {
        d = d - 1.0;
        return 1.0 - d * d * d * d;
    }

    private static Double lambda$static$8(Double d) {
        return d * d * d * d;
    }

    private static Double lambda$static$7(Double d) {
        return d < 0.5 ? 4.0 * d * d * d : (d - 1.0) * (2.0 * d - 2.0) * (2.0 * d - 2.0) + 1.0;
    }

    private static Double lambda$static$6(Double d) {
        d = d - 1.0;
        return d * d * d + 1.0;
    }

    private static Double lambda$static$5(Double d) {
        return d * d * d;
    }

    private static Double lambda$static$4(Double d) {
        return d < 0.5 ? 2.0 * d * d : -1.0 + (4.0 - 2.0 * d) * d;
    }

    private static Double lambda$static$3(Double d) {
        return d * (2.0 - d);
    }

    private static Double lambda$static$2(Double d) {
        return d * d;
    }

    private static Double lambda$static$1(Double d) {
        return 1.0 / (1.0 + Math.exp(-d.doubleValue()));
    }

    private static Double lambda$static$0(Double d) {
        return d;
    }

    private static tbm[] $values() {
        return new tbm[]{bthth, thtt, shkhdh, sl_2, ssf_2, qq, srdh, la, byy, hdd_2, rshdh, hthr, dqf, bzk, dhzf_2, hrkh, shat, zqk, hash_3, tkhn, ghm, sza_2, thz_6, bghz_2, tba, jhth_2, khnk, khjsh, dab_2, bzh_4};
    }

    private static String[] m9ra238wc(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite lw83k1gi33obi2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ cmtlpxx2i ^ string.hashCode() ^ n2 + afs3a72 + i * -246364301) + cmtlpxx2i) ^ afs3a72));
            }
            String[] stringArray = tbm.m9ra238wc(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

