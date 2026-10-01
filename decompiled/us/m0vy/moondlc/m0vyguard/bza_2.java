/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bsh_2;
import us.m0vy.moondlc.m0vyguard.btf_2;
import us.m0vy.moondlc.m0vyguard.tdq;
import us.m0vy.moondlc.m0vyguard.tzm;

public final class bza_2 {
    private static final int shthr = 4;
    private final bsh_2 zad;
    private final String blth;
    private final float sma;
    private final tdq[] rdha_2;
    private final char[] shwa = new char[4];
    private final char[] dhq = new char[4];
    private final int[] khtq_2 = new int[4];
    private int thzl_2;
    private int jza_3;
    private int ddh_3 = -1;
    private static final int zm4rmkuk = 1758102184;
    private static final int wev1l27u = -1514463124;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int i6f83qi3avqj2a;

    public bza_2(bsh_2 bsh2, String string, float f, long l, btf_2 btf2) {
        this.zad = bsh2;
        this.blth = string;
        this.sma = f;
        this.rdha_2 = new tdq[4];
        for (int i = 0; i < 4; ++i) {
            this.rdha_2[i] = new tdq(l, 1.0f, btf2);
        }
    }

    public void rtb(int n) {
        int n2 = Math.max(0, Math.min(9999, n));
        if (n2 == this.ddh_3) {
            return;
        }
        this.ddh_3 = n2;
        this.jza_3 = this.thzl_2;
        String string = Integer.toString(n2);
        int n3 = string.length();
        int n4 = 4 - n3;
        for (int i = 0; i < 4; ++i) {
            char c;
            char c2 = i < n4 ? (char)'\u0000' : string.charAt(i - n4);
            if (c2 == (c = this.shwa[i])) continue;
            this.dhq[i] = c;
            this.shwa[i] = c2;
            this.rdha_2[i].khadh_2(0.0f);
            this.khtq_2[i] = c == '\u0000' || c2 == '\u0000' ? 1 : (c2 > c ? 1 : -1);
        }
        this.thzl_2 = n3;
    }

    public void zzdh(class_4587 class_45872, float f, float f2, float f3, Color color) {
        int n;
        for (tdq tdq2 : this.rdha_2) {
            tdq2.znl_2(1.0f);
        }
        float f4 = this.zad.khmw(f3);
        float f5 = f3 * 0.25f;
        float f6 = f;
        for (int i = n = 4 - Math.max(this.thzl_2, this.jza_3); i < 4; ++i) {
            float f7;
            char c = this.shwa[i];
            char c2 = this.dhq[i];
            float f8 = this.rdha_2[i].swd();
            int n2 = this.khtq_2[i];
            if (c == '\u0000' && c2 == '\u0000') continue;
            float f9 = f7 = this.sdh_3(c, c2, f3);
            tzm.hds_2(class_45872, f6 - 0.5f, f2 - f5, f9 + 1.0f, f4 + f5 * 2.0f);
            if (f8 >= 0.999f) {
                if (c != '\u0000') {
                    this.khsa(class_45872, c, f6, f2, f3, color);
                }
            } else {
                float f10 = this.sma * (float)n2;
                float f11 = f2 + f10 * f8;
                float f12 = f2 - f10 + f10 * f8;
                int n3 = Math.round((float)color.getAlpha() / 255.0f * (1.0f - f8) * 255.0f);
                int n4 = Math.round((float)color.getAlpha() / 255.0f * f8 * 255.0f);
                Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), bza_2.skha_2(n3));
                Color color3 = new Color(color.getRed(), color.getGreen(), color.getBlue(), bza_2.skha_2(n4));
                if (c2 != '\u0000') {
                    this.khsa(class_45872, c2, f6, f11, f3, color2);
                }
                if (c != '\u0000') {
                    this.khsa(class_45872, c, f6, f12, f3, color3);
                }
            }
            tzm.jdz_4(class_45872);
            f6 += f9;
        }
        if (!this.blth.isEmpty()) {
            this.zad.zskh_4(class_45872, this.blth, f6, f2, f3, color, 0.0f);
        }
    }

    public float skhd_3(float f) {
        int n;
        float f2 = 0.0f;
        for (int i = n = 4 - Math.max(this.thzl_2, this.jza_3); i < 4; ++i) {
            f2 += this.sdh_3(this.shwa[i], this.dhq[i], f);
        }
        return f2 += this.zad.shdf_2(this.blth, f);
    }

    public float dhfw(float f) {
        return this.zad.shdf_2("9999" + this.blth, f);
    }

    private float sdh_3(char c, char c2, float f) {
        float f2 = c != '\u0000' ? this.zad.sdk_3(String.valueOf(c), f) : 0.0f;
        float f3 = c2 != '\u0000' ? this.zad.sdk_3(String.valueOf(c2), f) : 0.0f;
        return Math.max(f2, f3);
    }

    private void khsa(class_4587 class_45872, char c, float f, float f2, float f3, Color color) {
        this.zad.ttm_2(class_45872, String.valueOf(c), f, f2, f3, color, 0.0f);
    }

    private static int skha_2(int n) {
        return Math.max(0, Math.min(255, n));
    }

    private static String[] pokxwouf1yr6pw(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite sjw5suz82b(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ zm4rmkuk ^ string.hashCode() ^ n2 + wev1l27u ^ i * 1478791143 ^ zm4rmkuk, 15) ^ wev1l27u));
            }
            String[] stringArray = bza_2.pokxwouf1yr6pw(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

