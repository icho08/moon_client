/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.ngh;

public class brb {
    private static final int vn9v9o2u = -1522645636;
    private static final int lf2pkrfem = -472213217;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int sbjgm9ptg6l3s;

    public static float[] rdz_2(Color color) {
        return new float[]{(float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f};
    }

    public static float[] adk(int n) {
        int[] nArray = brb.ddz_7(n);
        return new float[]{(float)nArray[0] / 255.0f, (float)nArray[1] / 255.0f, (float)nArray[2] / 255.0f, (float)nArray[3] / 255.0f};
    }

    public static int[] ddz_7(int n) {
        return new int[]{n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, n >> 24 & 0xFF};
    }

    public static Color zmn_2(Color color, int n) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), class_3532.method_15340((int)n, (int)0, (int)255));
    }

    public static int zj_2(int n, int n2) {
        int n3 = n >> 16 & 0xFF;
        int n4 = n >> 8 & 0xFF;
        int n5 = n & 0xFF;
        int n6 = class_3532.method_15340((int)n2, (int)0, (int)255);
        return n6 << 24 | n3 << 16 | n4 << 8 | n5;
    }

    public static Color jma(int n, int n2, Color ... colorArray) {
        int n3 = (int)((System.currentTimeMillis() / (long)n + (long)n2) % 360L);
        n3 = (n3 > 180 ? 360 - n3 : n3) + 180;
        int n4 = (int)((float)n3 / 360.0f * (float)colorArray.length);
        if (n4 == colorArray.length) {
            --n4;
        }
        Color color = colorArray[n4];
        Color color2 = colorArray[n4 == colorArray.length - 1 ? 0 : n4 + 1];
        return brb.tal(color, color2, (float)n3 / 360.0f * (float)colorArray.length - (float)n4);
    }

    public static Color dja_3(Color color, Color color2, double d) {
        return brb.tal(color, color2, (float)d);
    }

    public static Color tal(Color color, Color color2, float f) {
        float f2 = 1.0f - class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        int n = color.getRed();
        int n2 = color.getGreen();
        int n3 = color.getBlue();
        int n4 = color.getAlpha();
        int n5 = color2.getRed();
        int n6 = color2.getGreen();
        int n7 = color2.getBlue();
        int n8 = color2.getAlpha();
        int n9 = ngh.dmy_2(n, n5, f2);
        int n10 = ngh.dmy_2(n2, n6, f2);
        int n11 = ngh.dmy_2(n3, n7, f2);
        int n12 = ngh.dmy_2(n4, n8, f2);
        return new Color(n9, n10, n11, n12);
    }

    public static int rgh(int n, int n2, float f) {
        float f2 = 1.0f - class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        int n3 = n >> 24 & 0xFF;
        int n4 = n >> 16 & 0xFF;
        int n5 = n >> 8 & 0xFF;
        int n6 = n & 0xFF;
        int n7 = n2 >> 24 & 0xFF;
        int n8 = n2 >> 16 & 0xFF;
        int n9 = n2 >> 8 & 0xFF;
        int n10 = n2 & 0xFF;
        int n11 = ngh.dmy_2(n3, n7, f2);
        int n12 = ngh.dmy_2(n4, n8, f2);
        int n13 = ngh.dmy_2(n5, n9, f2);
        int n14 = ngh.dmy_2(n6, n10, f2);
        return n11 << 24 | n12 << 16 | n13 << 8 | n14;
    }

    public static int tjdh(int n, float f) {
        int n2 = class_3532.method_15340((int)((int)((float)(n >> 16 & 0xFF) * f)), (int)0, (int)255);
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        int n5 = n >> 24 & 0xFF;
        return n5 << 24 | n2 << 16 | n3 << 8 | n4;
    }

    public static Color tka_2(float f, Color color, Color color2) {
        if ((f < 0.0f || f > 1.0f) && (f %= 1.0f) < 0.0f) {
            f += 1.0f;
        }
        int n = (int)((float)color.getRed() + (float)(color2.getRed() - color.getRed()) * f);
        int n2 = (int)((float)color.getGreen() + (float)(color2.getGreen() - color.getGreen()) * f);
        int n3 = (int)((float)color.getBlue() + (float)(color2.getBlue() - color.getBlue()) * f);
        return new Color(n, n2, n3);
    }

    public static int trsh_2(int n, int n2, float f, float f2, float f3, float f4) {
        float f5 = 18.0f / f4;
        float f6 = (f3 + f / (f2 * f5)) % 1.0f;
        float f7 = (float)Math.sin((double)f6 * Math.PI * 2.0) * 0.5f + 0.5f;
        int n3 = n >> 24 & 0xFF;
        int n4 = n >> 16 & 0xFF;
        int n5 = n >> 8 & 0xFF;
        int n6 = n & 0xFF;
        int n7 = n2 >> 24 & 0xFF;
        int n8 = n2 >> 16 & 0xFF;
        int n9 = n2 >> 8 & 0xFF;
        int n10 = n2 & 0xFF;
        int n11 = (int)((float)n3 + (float)(n7 - n3) * f7);
        int n12 = (int)((float)n4 + (float)(n8 - n4) * f7);
        int n13 = (int)((float)n5 + (float)(n9 - n5) * f7);
        int n14 = (int)((float)n6 + (float)(n10 - n6) * f7);
        return n11 << 24 | n12 << 16 | n13 << 8 | n14;
    }

    public static Color thlsh(Color color, Color color2) {
        return brb.rghz_2(color, color2, 1.0f);
    }

    public static Color rghz_2(Color color, Color color2, float f) {
        double d = (double)(System.currentTimeMillis() % 1000L) / 1000.0;
        float f2 = (float)(Math.sin(d * Math.PI * 2.0) * 0.5 + 0.5);
        return brb.thsr_2(color, color2, f, f2);
    }

    public static int jss_3(int n, int n2, float f, float f2) {
        int n3 = n >> 24 & 0xFF;
        int n4 = n >> 16 & 0xFF;
        int n5 = n >> 8 & 0xFF;
        int n6 = n & 0xFF;
        int n7 = n2 >> 24 & 0xFF;
        int n8 = n2 >> 16 & 0xFF;
        int n9 = n2 >> 8 & 0xFF;
        int n10 = n2 & 0xFF;
        int n11 = (int)((float)n4 * f2 + (float)n8 * (1.0f - f2));
        int n12 = (int)((float)n5 * f2 + (float)n9 * (1.0f - f2));
        int n13 = (int)((float)n6 * f2 + (float)n10 * (1.0f - f2));
        int n14 = (int)(f * 255.0f);
        return n14 << 24 | n11 << 16 | n12 << 8 | n13;
    }

    public static Color thsr_2(Color color, Color color2, float f, float f2) {
        return new Color(brb.jss_3(color.getRGB(), color2.getRGB(), f, f2), true);
    }

    private static String[] mva54x5dbze(String string) {
        return string.split("\u0002\u0013", -1);
    }

    private static CallSite rzy4fzf2gefro(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ vn9v9o2u ^ string.hashCode() ^ n2 + lf2pkrfem ^ i * -986990393 ^ vn9v9o2u, 18) ^ lf2pkrfem));
            }
            String[] stringArray = brb.mva54x5dbze(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
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

