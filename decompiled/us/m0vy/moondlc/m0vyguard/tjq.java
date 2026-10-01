/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.regex.Pattern;
import lombok.Generated;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bza;
import us.m0vy.moondlc.m0vyguard.bkt;

public final class tjq {
    public static final int dzk_2;
    private static final Pattern rsha;
    private static final int mquj675z = 1053085587;
    private static final int s17so0g1pg = -950438445;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ydq2wwgh5b5;

    public static int tdhb(int n) {
        return n >> 16 & 0xFF;
    }

    public static int hbs(int n) {
        return n >> 8 & 0xFF;
    }

    public static int hsb_2(int n) {
        return n & 0xFF;
    }

    public static int ghzy_2(int n) {
        return n >> 24 & 0xFF;
    }

    public static float sth_6(int n) {
        return (float)tjq.tdhb(n) / 255.0f;
    }

    public static float dsk_2(int n) {
        return (float)tjq.hbs(n) / 255.0f;
    }

    public static float rsm(int n) {
        return (float)tjq.hsb_2(n) / 255.0f;
    }

    public static float thq_5(int n) {
        return (float)tjq.ghzy_2(n) / 255.0f;
    }

    public static int[] tas_5(int n) {
        return new int[]{tjq.tdhb(n), tjq.hbs(n), tjq.hsb_2(n), tjq.ghzy_2(n)};
    }

    public static int[] jhdh_2(int n) {
        return new int[]{tjq.tdhb(n), tjq.hbs(n), tjq.hsb_2(n)};
    }

    public static float[] thhh_4(int n) {
        return new float[]{tjq.sth_6(n), tjq.dsk_2(n), tjq.rsm(n), tjq.thq_5(n)};
    }

    public static float[] jfb(int n) {
        return new float[]{tjq.sth_6(n), tjq.dsk_2(n), tjq.rsm(n)};
    }

    public static boolean jjh(String string) {
        return string != null && string.matches("(?i)^[a-f0-9]{6}$");
    }

    public static bkt tkhs_3(String string, bkt bkt2) {
        if (!tjq.jjh(string)) {
            return bkt2;
        }
        int n = Integer.parseInt(string, 16);
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        return new bkt(new Color(n2, n3, n4));
    }

    public static String ghhr(bkt bkt2) {
        int n = bkt2.btkh();
        return String.format("%06X", n & 0xFFFFFF);
    }

    public static bkt twa_4(int n, int n2, bkt bkt2, bkt bkt3) {
        int n3 = (int)((System.currentTimeMillis() / (long)n + (long)n2) % 360L);
        n3 = (n3 >= 180 ? 360 - n3 : n3) * 2;
        return tjq.ttdh_4(bkt2, bkt3, (float)n3 / 360.0f);
    }

    public static bkt zas_7(int n, int n2, bkt ... bktArray) {
        int n3 = (int)((System.currentTimeMillis() / (long)n + (long)n2) % 360L);
        n3 = (n3 > 180 ? 360 - n3 : n3) + 180;
        int n4 = (int)((float)n3 / 360.0f * (float)bktArray.length);
        if (n4 == bktArray.length) {
            --n4;
        }
        bkt bkt2 = bktArray[n4];
        bkt bkt3 = bktArray[n4 == bktArray.length - 1 ? 0 : n4 + 1];
        return tjq.ttdh_4(bkt2, bkt3, (float)n3 / 360.0f * (float)bktArray.length - (float)n4);
    }

    public static bkt ttdh_4(bkt bkt2, bkt bkt3, float f) {
        return bkt2.ttz_8(bkt3, f);
    }

    public static String ham(String string) {
        return string != null && !string.isEmpty() ? rsha.matcher(string).replaceAll("") : null;
    }

    public static int bwk(int n, float f) {
        return tjq.zms(tjq.tdhb(n), tjq.hbs(n), tjq.hsb_2(n), Math.round((float)tjq.ghzy_2(n) * f));
    }

    private static int zms(int n, int n2, int n3, int n4) {
        return class_3532.method_15340((int)n4, (int)0, (int)255) << 24 | class_3532.method_15340((int)n, (int)0, (int)255) << 16 | class_3532.method_15340((int)n2, (int)0, (int)255) << 8 | class_3532.method_15340((int)n3, (int)0, (int)255);
    }

    public static int zrdh_2(int n) {
        return bza.getInstance().getThemeManager().jthth(n).btkh();
    }

    @Generated
    private tjq() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String[] s630xdc1d(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite kqy5dn6h(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ mquj675z ^ string.hashCode() ^ n2 + s17so0g1pg + i * 1284018073) + mquj675z) ^ s17so0g1pg));
            }
            String[] stringArray = tjq.s630xdc1d(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

