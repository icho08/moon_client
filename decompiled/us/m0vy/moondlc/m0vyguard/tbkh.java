/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 *  org.joml.Vector4f
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_4587;
import org.joml.Vector4f;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.bdht;
import us.m0vy.moondlc.m0vyguard.brb;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bsh_2;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.zth_8;

public final class tbkh {
    public static final float jal_2 = 5.0f;
    public static final Vector4f sty;
    private static final int wq6gvwiwz55m = 1344080396;
    private static final int z75ie5b8jt1 = 655503843;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int zkj02bl0xoi;

    private tbkh() {
    }

    public static Color djd_3(float f) {
        return brb.zmn_2(bas_4.zsz_4(), Math.round(255.0f * f));
    }

    public static Color hkdh(float f) {
        return new Color(255, 255, 255, Math.round(255.0f * f));
    }

    public static int ajn(float f) {
        return tbkh.hkdh(f).getRGB();
    }

    public static Color thty_2(float f) {
        return new Color(170, 170, 170, Math.round(255.0f * f));
    }

    public static float rmh_2(String string, String string2) {
        return 9.0f + brz_2.shjh_2.shdf_2(string, 6.5f) + 8.0f + brz_2.tsf.shdf_2(string2, 9.0f) + 8.0f;
    }

    public static void shdt_2(class_4587 class_45872, float f, float f2, float f3, String string, String string2, float f4) {
        tbkh.dmkh_2(class_45872, f, f2, f3, string, string2, brz_2.tsf, f4, 1.0f);
    }

    public static void jys(class_4587 class_45872, float f, float f2, float f3, String string, String string2, bsh_2 bsh2, float f4) {
        tbkh.dmkh_2(class_45872, f, f2, f3, string, string2, bsh2, f4, 1.0f);
    }

    public static void dmkh_2(class_4587 class_45872, float f, float f2, float f3, String string, String string2, bsh_2 bsh2, float f4, float f5) {
        float f6 = 9.0f;
        float f7 = bsh2.shdf_2(string2, f6);
        float f8 = f + 7.0f;
        float f9 = f + f3 - 8.0f - f7;
        float f10 = f8 * (1.0f - f5) + f9 * f5;
        float f11 = f + 7.0f + f7 + 4.5f;
        float f12 = f + 9.0f;
        float f13 = f11 * (1.0f - f5) + f12 * f5;
        brz_2.shjh_2.zskh_4(class_45872, string, f13, f2 + 5.05f, 6.5f, tbkh.hkdh(f4), 0.0f);
        if (bsh2 == brz_2.tsf) {
            bsh2.jdz(class_45872, string2, f10, f2 + 3.6f, f6, tbkh.djd_3(f4), tbkh.djd_3(f4), 1.1f);
        } else {
            bsh2.zskh_4(class_45872, string2, f10, f2 + 3.6f, f6, tbkh.djd_3(f4), 0.0f);
        }
    }

    public static Color zq_2(float f) {
        Color color = bas_4.zsz_4();
        int n = Math.round((86.0f + 40.0f * tbkh.dhq_4()) * f);
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), n);
    }

    public static Color yh(float f) {
        return brb.zmn_2(bas_4.zsz_4(), Math.round((95.0f + 40.0f * tbkh.dhq_4()) * f));
    }

    public static void sqy(class_4587 class_45872, float f, float f2, float f3, float f4, float f5) {
        tbkh.bsdh_2(class_45872, f, f2, f3, f4, f5, 5.0f);
    }

    public static void bsdh_2(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, float f6) {
        if (bza_4.aar()) {
            float f7 = 7.0f;
            zth_8 zth2 = new zth_8(f6 * f7 / 2.0f, f6 * f7 / 2.0f, f6 * f7 / 2.0f, f6 * f7 / 2.0f);
            byq byq2 = byq.brz_2.tkhl_2(255.0f * f5);
            bdht.zkb_2(class_45872, f, f2, f3, f4, zth2, byq2, f5, 25.0f + (f4 == 240.0f ? 2.0f : 1.0f), byq2.tkhl_2(255.0f), 1.0f, true, 0.0f, 0.08f, f7, false);
            zth_8 zth3 = zth_8.all(f6);
            byq byq3 = bhj_2.khhy_2().tkhl_2(51.0f * f5);
            bdht.tzs_5(class_45872, f, f2, f3, f4, f7, zth3, byq3);
            return;
        }
        float f8 = tbkh.dhq_4();
        int n = bza_4.dhhh() ? Math.round(255.0f * f5) : Math.round((82.0f + 92.0f * f8) * f5);
        int n2 = bza_4.dhhh() ? 10 : 15;
        bjgh.jghs.hrj(class_45872, f, f2, f3, f4, f6, new Color(n2, n2, n2, n));
    }

    public static void ja_2(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        bjgh.jghs.hrj(class_45872, f, f2, f3, f4, f5, new Color(0, 0, 0, tbkh.qt(f6, f7)));
    }

    public static void tzy_2(class_4587 class_45872, float f, float f2, float f3, float f4, Vector4f vector4f, float f5, float f6) {
        bjgh.jghs.bzm_2(class_45872, f, f2, f3, f4, vector4f, new Color(0, 0, 0, tbkh.qt(f5, f6)));
    }

    public static void sshth_2(class_4587 class_45872, float f, float f2, float f3, float f4) {
        bjgh.jghs.hrj(class_45872, f, f2, f3, 0.8f, 0.0f, new Color(255, 255, 255, Math.round((5.0f - tbkh.dhq_4()) * f4)));
    }

    private static int qt(float f, float f2) {
        float f3 = 0.82f + tbkh.dhq_4() * 0.78f;
        return Math.round(255.0f * Math.min(0.85f, f * f3) * f2);
    }

    private static float dhq_4() {
        return Math.max(0.0f, Math.min(1.0f, bza_4.hjl() / 100.0f));
    }

    private static String[] im7vs9vlx3(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite pe4zl3lj5pq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ wq6gvwiwz55m ^ string.hashCode() ^ n2 + z75ie5b8jt1 ^ i * -1907635673 ^ wq6gvwiwz55m, 19) ^ z75ie5b8jt1));
            }
            String[] stringArray = tbkh.im7vs9vlx3(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

