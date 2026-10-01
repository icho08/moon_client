/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import us.m0vy.moondlc.m0vyguard.bsl_2;
import us.m0vy.moondlc.m0vyguard.tkhs;
import us.m0vy.moondlc.m0vyguard.khq;
import us.m0vy.moondlc.m0vyguard.ghs_2;

public interface bdz {
    public static final bdz bjk;
    public static final bdz sthy;
    public static final bdz jkhgh;
    public static final bdz dsht;
    public static final bdz shzsh_2;
    public static final bdz jadh_2;
    public static final bdz thghth;
    public static final bdz byd_2;
    public static final bdz hay;
    public static final bdz dmz_2;
    public static final bdz shll;
    public static final bdz dam_2;
    public static final bdz haq;
    public static final bdz znf;
    public static final bdz dhthh;
    public static final bdz bqz;
    public static final bdz bqth;
    public static final bdz zrb;
    public static final bdz khdhd;
    public static final bdz khdy;
    public static final bdz jzn_2;
    public static final bdz hwz;
    public static final bdz rym;
    public static final bdz jsj;
    public static final bdz jft;
    public static final bdz bthm;
    public static final bdz bth_3;
    public static final ghs_2 dhth_2;
    public static final ghs_2 jshb;
    public static final ghs_2 dzq_2;
    public static final khq nm;
    public static final khq znq;
    public static final khq dnt_2;
    public static final bdz khtt_3;
    public static final bdz rdhq;
    public static final bdz shst;

    public static bdz cubicBezier(double d, double d2, double d3, double d4) {
        return new bsl_2(d, d3, d2, d4);
    }

    public float ease(float var1, float var2, float var3, float var4);

    private static float lambda$static$26(float f, float f2, float f3, float f4) {
        return f < f4 / 2.0f ? rdhq.ease(f * 2.0f, 0.0f, f3, f4) * 0.5f + f2 : khtt_3.ease(f * 2.0f - f4, 0.0f, f3, f4) * 0.5f + f3 * 0.5f + f2;
    }

    private static float lambda$static$25(float f, float f2, float f3, float f4) {
        return f3 - khtt_3.ease(f4 - f, 0.0f, f3, f4) + f2;
    }

    private static float lambda$static$24(float f, float f2, float f3, float f4) {
        float f5;
        f /= f4;
        if (f5 < 0.36363637f) {
            return f3 * 7.5625f * f * f + f2;
        }
        if (f < 0.72727275f) {
            return f3 * (7.5625f * (f -= 0.54545456f) * f + 0.75f) + f2;
        }
        return f < 0.90909094f ? f3 * (7.5625f * (f -= 0.8181818f) * f + 0.9375f) + f2 : f3 * (7.5625f * (f -= 0.95454544f) * f + 0.984375f) + f2;
    }

    private static float lambda$static$23(float f, float f2, float f3, float f4) {
        float f5;
        f /= f4 / 2.0f;
        return f5 < 1.0f ? -f3 / 2.0f * ((float)Math.sqrt(1.0f - f * f) - 1.0f) + f2 : f3 / 2.0f * ((float)Math.sqrt(1.0f - (f -= 2.0f) * f) + 1.0f) + f2;
    }

    private static float lambda$static$22(float f, float f2, float f3, float f4) {
        f = f / f4 - 1.0f;
        return f3 * (float)Math.sqrt(1.0f - f * f) + f2;
    }

    private static float lambda$static$21(float f, float f2, float f3, float f4) {
        return -f3 * ((float)Math.sqrt(1.0f - (f /= f4) * f) - 1.0f) + f2;
    }

    private static float lambda$static$20(float f, float f2, float f3, float f4) {
        float f5;
        if (f == 0.0f) {
            return f2;
        }
        if (f == f4) {
            return f2 + f3;
        }
        f /= f4 / 2.0f;
        return f5 < 1.0f ? f3 / 2.0f * (float)Math.pow(2.0, 10.0f * (f - 1.0f)) + f2 : f3 / 2.0f * (-((float)Math.pow(2.0, -10.0f * (f -= 1.0f))) + 2.0f) + f2;
    }

    private static float lambda$static$19(float f, float f2, float f3, float f4) {
        return f == f4 ? f2 + f3 : f3 * (-((float)Math.pow(2.0, -10.0f * f / f4)) + 1.0f) + f2;
    }

    private static float lambda$static$18(float f, float f2, float f3, float f4) {
        return f == 0.0f ? f2 : f3 * (float)Math.pow(2.0, 10.0f * (f / f4 - 1.0f)) + f2;
    }

    private static float lambda$static$17(float f, float f2, float f3, float f4) {
        return -f3 / 2.0f * ((float)tkhs.bnd_2(Math.PI * (double)f / (double)f4) - 1.0f) + f2;
    }

    private static float lambda$static$16(float f, float f2, float f3, float f4) {
        return f3 * (float)tkhs.btz((double)(f / f4) * 1.5707963267948966) + f2;
    }

    private static float lambda$static$15(float f, float f2, float f3, float f4) {
        return -f3 * (float)tkhs.bnd_2((double)(f / f4) * 1.5707963267948966) + f3 + f2;
    }

    private static float lambda$static$14(float f, float f2, float f3, float f4) {
        float f5;
        f /= f4 / 2.0f;
        return f5 < 1.0f ? f3 / 2.0f * f * f * f * f * f + f2 : f3 / 2.0f * ((f -= 2.0f) * f * f * f * f + 2.0f) + f2;
    }

    private static float lambda$static$13(float f, float f2, float f3, float f4) {
        f = f / f4 - 1.0f;
        return f3 * (f * f * f * f * f + 1.0f) + f2;
    }

    private static float lambda$static$12(float f, float f2, float f3, float f4) {
        return f3 * (f /= f4) * f * f * f * f + f2;
    }

    private static float lambda$static$11(float f, float f2, float f3, float f4) {
        float f5;
        f /= f4 / 2.0f;
        return f5 < 1.0f ? f3 / 2.0f * f * f * f * f + f2 : -f3 / 2.0f * ((f -= 2.0f) * f * f * f - 2.0f) + f2;
    }

    private static float lambda$static$10(float f, float f2, float f3, float f4) {
        f = f / f4 - 1.0f;
        return -f3 * (f * f * f * f - 1.0f) + f2;
    }

    private static float lambda$static$9(float f, float f2, float f3, float f4) {
        return f3 * (f /= f4) * f * f * f + f2;
    }

    private static float lambda$static$8(float f, float f2, float f3, float f4) {
        float f5;
        f /= f4 / 2.0f;
        return f5 < 1.0f ? f3 / 2.0f * f * f * f + f2 : f3 / 2.0f * ((f -= 2.0f) * f * f + 2.0f) + f2;
    }

    private static float lambda$static$7(float f, float f2, float f3, float f4) {
        f = f / f4 - 1.0f;
        return f3 * (f * f * f + 1.0f) + f2;
    }

    private static float lambda$static$6(float f, float f2, float f3, float f4) {
        return f3 * (f /= f4) * f * f + f2;
    }

    private static float lambda$static$5(float f, float f2, float f3, float f4) {
        float f5;
        f /= f4 / 2.0f;
        return f5 < 1.0f ? f3 / 2.0f * f * f + f2 : -f3 / 2.0f * ((f -= 1.0f) * (f - 2.0f) - 1.0f) + f2;
    }

    private static float lambda$static$4(float f, float f2, float f3, float f4) {
        return -f3 * (f /= f4) * (f - 2.0f) + f2;
    }

    private static float lambda$static$3(float f, float f2, float f3, float f4) {
        return f3 * (f /= f4) * f + f2;
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

