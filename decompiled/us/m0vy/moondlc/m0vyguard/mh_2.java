/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.Kernel;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Hashtable;
import org.jetbrains.annotations.NotNull;

public class mh_2 {
    protected float sfj;
    protected Kernel sght_2;
    private static final int c48qtl6h4 = 537558247;
    private static final int q4p727wkvg = -569988458;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int aiizzosc9;

    public mh_2(float f) {
        this.slk(f);
    }

    public static void tzl_3(@NotNull Kernel kernel, int[] nArray, int[] nArray2, int n, int n2, boolean bl, boolean bl2, boolean bl3, int n3) {
        float[] fArray = kernel.getKernelData(null);
        int n4 = kernel.getWidth();
        int n5 = n4 / 2;
        for (int i = 0; i < n2; ++i) {
            int n6 = i;
            int n7 = i * n;
            for (int j = 0; j < n; ++j) {
                int n8;
                int n9;
                float f;
                int n10;
                float f2 = 0.0f;
                float f3 = 0.0f;
                float f4 = 0.0f;
                float f5 = 0.0f;
                int n11 = n5;
                for (n10 = -n5; n10 <= n5; ++n10) {
                    f = fArray[n11 + n10];
                    if (f == 0.0f) continue;
                    n9 = j + n10;
                    if (n9 < 0) {
                        if (n3 == 1) {
                            n9 = 0;
                        } else if (n3 == 2) {
                            n9 = (j + n) % n;
                        }
                    } else if (n9 >= n) {
                        if (n3 == 1) {
                            n9 = n - 1;
                        } else if (n3 == 2) {
                            n9 = (j + n) % n;
                        }
                    }
                    n8 = nArray[n7 + n9];
                    int n12 = n8 >> 24 & 0xFF;
                    int n13 = n8 >> 16 & 0xFF;
                    int n14 = n8 >> 8 & 0xFF;
                    int n15 = n8 & 0xFF;
                    if (bl2) {
                        float f6 = (float)n12 * 0.003921569f;
                        n13 = (int)((float)n13 * f6);
                        n14 = (int)((float)n14 * f6);
                        n15 = (int)((float)n15 * f6);
                    }
                    f5 += f * (float)n12;
                    f2 += f * (float)n13;
                    f3 += f * (float)n14;
                    f4 += f * (float)n15;
                }
                if (bl3 && f5 != 0.0f && f5 != 255.0f) {
                    f = 255.0f / f5;
                    f2 *= f;
                    f3 *= f;
                    f4 *= f;
                }
                n10 = bl ? mh_2.jhth_2((int)((double)f5 + 0.5)) : 255;
                int n16 = mh_2.jhth_2((int)((double)f2 + 0.5));
                n9 = mh_2.jhth_2((int)((double)f3 + 0.5));
                n8 = mh_2.jhth_2((int)((double)f4 + 0.5));
                nArray2[n6] = n10 << 24 | n16 << 16 | n9 << 8 | n8;
                n6 += n2;
            }
        }
    }

    public static int jhth_2(int n) {
        return n < 0 ? 0 : Math.min(n, 255);
    }

    public static Kernel thhl(float f) {
        int n;
        int n2 = (int)Math.ceil(f);
        int n3 = n2 * 2 + 1;
        float[] fArray = new float[n3];
        float f2 = f / 3.0f;
        float f3 = 2.0f * f2 * f2;
        float f4 = (float)Math.PI * 2 * f2;
        float f5 = (float)Math.sqrt(f4);
        float f6 = f * f;
        float f7 = 0.0f;
        int n4 = 0;
        for (n = -n2; n <= n2; ++n) {
            float f8 = n * n;
            fArray[n4] = f8 > f6 ? 0.0f : (float)Math.exp(-f8 / f3) / f5;
            f7 += fArray[n4];
            ++n4;
        }
        n = 0;
        while (n < n3) {
            int n5 = n++;
            fArray[n5] = fArray[n5] / f7;
        }
        return new Kernel(n3, 1, fArray);
    }

    public void slk(float f) {
        this.sfj = f;
        this.sght_2 = mh_2.thhl(f);
    }

    public BufferedImage dfz_4(BufferedImage bufferedImage, BufferedImage bufferedImage2) {
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        if (bufferedImage2 == null) {
            bufferedImage2 = this.bzq(bufferedImage, null);
        }
        int[] nArray = new int[n * n2];
        int[] nArray2 = new int[n * n2];
        bufferedImage.getRGB(0, 0, n, n2, nArray, 0, n);
        if (this.sfj > 0.0f) {
            mh_2.tzl_3(this.sght_2, nArray, nArray2, n, n2, true, true, false, 1);
            mh_2.tzl_3(this.sght_2, nArray2, nArray, n2, n, true, false, true, 1);
        }
        bufferedImage2.setRGB(0, 0, n, n2, nArray, 0, n);
        return bufferedImage2;
    }

    public BufferedImage bzq(BufferedImage bufferedImage, ColorModel colorModel) {
        if (colorModel == null) {
            colorModel = bufferedImage.getColorModel();
        }
        return new BufferedImage(colorModel, colorModel.createCompatibleWritableRaster(bufferedImage.getWidth(), bufferedImage.getHeight()), colorModel.isAlphaPremultiplied(), (Hashtable)null);
    }

    private static String[] h99qv8lg(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite gkwswecr5xk0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ c48qtl6h4 ^ string.hashCode() ^ n2 + q4p727wkvg + i * 846004793) + c48qtl6h4) ^ q4p727wkvg));
            }
            String[] stringArray = mh_2.h99qv8lg(new String(cArray));
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

