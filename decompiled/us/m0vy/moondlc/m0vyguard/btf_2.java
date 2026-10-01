/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import us.m0vy.moondlc.m0vyguard.bry;
import us.m0vy.moondlc.m0vyguard.tsd;
import us.m0vy.moondlc.m0vyguard.ghm;
import us.m0vy.moondlc.m0vyguard.ll;

public interface btf_2 {
    public static final btf_2 shjm;
    public static final btf_2 rhn;
    public static final btf_2 khshz_2;
    public static final btf_2 tghz_2;
    public static final btf_2 tmd_2;
    public static final btf_2 dhthq;
    public static final btf_2 zdq;
    public static final btf_2 hshh;
    public static final btf_2 khkhn;
    public static final btf_2 zqj;
    public static final btf_2 jakh;
    public static final btf_2 shdq;
    public static final btf_2 khbsh;
    public static final btf_2 saz_4;
    public static final btf_2 sdhr;
    public static final btf_2 bdhh_2;
    public static final btf_2 rjf;
    public static final btf_2 thhj_2;
    public static final btf_2 shghz;
    public static final btf_2 jjsh;
    public static final btf_2 jsht;
    public static final btf_2 thdhh;
    public static final btf_2 sdhb;
    public static final btf_2 bay_2;
    public static final btf_2 htd_3;
    public static final btf_2 dhml;
    public static final btf_2 khhq;
    public static final btf_2 dhnl;
    public static final btf_2 dhkh_5;
    public static final btf_2 zsa_2;
    public static final btf_2 twsh;
    public static final ll khaz_3;
    public static final ll tfd_2;
    public static final ll tash;
    public static final tsd zdhkh;
    public static final tsd rnd_2;
    public static final tsd zdz_4;
    public static final btf_2 jzh;
    public static final btf_2 yn;
    public static final btf_2 tta_2;

    public static btf_2 generate(double d, double d2, double d3, double d4) {
        return new bry(d, d3, d2, d4);
    }

    public float ease(float var1, float var2, float var3, float var4);

    private static float lambda$static$26(float f, float f2, float f3, float f4) {
        return f < f4 / 2.0f ? yn.ease(f * 2.0f, 0.0f, f3, f4) * 0.5f + f2 : jzh.ease(f * 2.0f - f4, 0.0f, f3, f4) * 0.5f + f3 * 0.5f + f2;
    }

    private static float lambda$static$25(float f, float f2, float f3, float f4) {
        return f3 - jzh.ease(f4 - f, 0.0f, f3, f4) + f2;
    }

    private static float lambda$static$24(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        f /= f4;
        if (f6 < 0.36363637f) {
            return f3 * (7.5625f * f * f) + f2;
        }
        if (f < 0.72727275f) {
            float f7 = f - 0.54545456f;
            return f3 * (7.5625f * f7 * f7 + 0.75f) + f2;
        }
        if (f < 0.90909094f) {
            float f8 = f - 0.8181818f;
            f5 = f3 * (7.5625f * f8 * f8 + 0.9375f) + f2;
        } else {
            float f9 = f - 0.95454544f;
            f5 = f3 * (7.5625f * f9 * f9 + 0.984375f) + f2;
        }
        return f5;
    }

    private static float lambda$static$23(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7 = f / (f4 / 2.0f);
        if (f6 < 1.0f) {
            f5 = -f3 / 2.0f * ((float)Math.sqrt(1.0f - f7 * f7) - 1.0f) + f2;
        } else {
            float f8 = f7 - 2.0f;
            f5 = f3 / 2.0f * ((float)Math.sqrt(1.0f - f8 * f8) + 1.0f) + f2;
        }
        return f5;
    }

    private static float lambda$static$22(float f, float f2, float f3, float f4) {
        float f5 = f / f4 - 1.0f;
        return f3 * (float)Math.sqrt(1.0f - f5 * f5) + f2;
    }

    private static float lambda$static$21(float f, float f2, float f3, float f4) {
        float f5 = f / f4;
        return -f3 * ((float)Math.sqrt(1.0f - f5 * f5) - 1.0f) + f2;
    }

    private static float lambda$static$20(float f, float f2, float f3, float f4) {
        float f5;
        if (f == 0.0f) {
            return f2;
        }
        if (f == f4) {
            return f2 + f3;
        }
        float f6 = f / (f4 / 2.0f);
        return f5 < 1.0f ? f3 / 2.0f * (float)Math.pow(2.0, 10.0f * (f6 - 1.0f)) + f2 : f3 / 2.0f * (-((float)Math.pow(2.0, -10.0f * (f6 -= 1.0f))) + 2.0f) + f2;
    }

    private static float lambda$static$19(float f, float f2, float f3, float f4) {
        return f == f4 ? f2 + f3 : f3 * (-((float)Math.pow(2.0, -10.0f * f / f4)) + 1.0f) + f2;
    }

    private static float lambda$static$18(float f, float f2, float f3, float f4) {
        return f == 0.0f ? f2 : f3 * (float)Math.pow(2.0, 10.0f * (f / f4 - 1.0f)) + f2;
    }

    private static float lambda$static$17(float f, float f2, float f3, float f4) {
        return -f3 / 2.0f * ((float)ghm.shtr_2(Math.PI * (double)f / (double)f4) - 1.0f) + f2;
    }

    private static float lambda$static$16(float f, float f2, float f3, float f4) {
        return f3 * (float)ghm.ghrth((double)(f / f4) * 1.5707963267948966) + f2;
    }

    private static float lambda$static$15(float f, float f2, float f3, float f4) {
        return -f3 * (float)ghm.shtr_2((double)(f / f4) * 1.5707963267948966) + f3 + f2;
    }

    private static float lambda$static$14(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7 = f / (f4 / 2.0f);
        if (f6 < 1.0f) {
            f5 = f3 / 2.0f * f7 * f7 * f7 * f7 * f7 + f2;
        } else {
            float f8 = f7 - 2.0f;
            f5 = f3 / 2.0f * (f8 * f8 * f8 * f8 * f8 + 2.0f) + f2;
        }
        return f5;
    }

    private static float lambda$static$13(float f, float f2, float f3, float f4) {
        float f5 = f / f4 - 1.0f;
        return f3 * (f5 * f5 * f5 * f5 * f5 + 1.0f) + f2;
    }

    private static float lambda$static$12(float f, float f2, float f3, float f4) {
        float f5 = f / f4;
        return f3 * f5 * f5 * f5 * f5 * f5 + f2;
    }

    private static float lambda$static$11(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7 = f / (f4 / 2.0f);
        if (f6 < 1.0f) {
            f5 = f3 / 2.0f * f7 * f7 * f7 * f7 + f2;
        } else {
            float f8 = f7 - 2.0f;
            f5 = -f3 / 2.0f * (f8 * f8 * f8 * f8 - 2.0f) + f2;
        }
        return f5;
    }

    private static float lambda$static$10(float f, float f2, float f3, float f4) {
        float f5 = f / f4 - 1.0f;
        return -f3 * (f5 * f5 * f5 * f5 - 1.0f) + f2;
    }

    private static float lambda$static$9(float f, float f2, float f3, float f4) {
        float f5 = f / f4;
        return f3 * f5 * f5 * f5 * f5 + f2;
    }

    private static float lambda$static$8(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7 = f / (f4 / 2.0f);
        if (f6 < 1.0f) {
            f5 = f3 / 2.0f * f7 * f7 * f7 + f2;
        } else {
            float f8 = f7 - 2.0f;
            f5 = f3 / 2.0f * (f8 * f8 * f8 + 2.0f) + f2;
        }
        return f5;
    }

    private static float lambda$static$7(float f, float f2, float f3, float f4) {
        float f5 = f / f4 - 1.0f;
        return f3 * (f5 * f5 * f5 + 1.0f) + f2;
    }

    private static float lambda$static$6(float f, float f2, float f3, float f4) {
        float f5 = f / f4;
        return f3 * f5 * f5 * f5 + f2;
    }

    private static float lambda$static$5(float f, float f2, float f3, float f4) {
        float f5;
        float f6 = f / (f4 / 2.0f);
        return f5 < 1.0f ? f3 / 2.0f * f6 * f6 + f2 : -f3 / 2.0f * ((f6 -= 1.0f) * (f6 - 2.0f) - 1.0f) + f2;
    }

    private static float lambda$static$4(float f, float f2, float f3, float f4) {
        float f5 = f / f4;
        return -f3 * f5 * (f5 - 2.0f) + f2;
    }

    private static float lambda$static$3(float f, float f2, float f3, float f4) {
        float f5 = f / f4;
        return f3 * f5 * f5 + f2;
    }

    private static float lambda$static$2(float f, float f2, float f3, float f4) {
        return f3 * f / f4 + f2;
    }

    private static float lambda$static$1(float f, float f2, float f3, float f4) {
        float f5 = f3 * f / f4 + f2;
        return (double)f5 < 0.5 ? 4.0f * f5 * f5 * f5 : (float)(1.0 - Math.pow(-2.0f * f5 + 2.0f, 3.0) / 2.0);
    }

    private static float lambda$static$0(float f, float f2, float f3, float f4) {
        float f5 = f3 * f / f4 + f2;
        return (float)(-2.0 * Math.pow(f5, 3.0) + 3.0 * Math.pow(f5, 2.0));
    }
}

