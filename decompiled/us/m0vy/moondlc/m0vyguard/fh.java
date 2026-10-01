/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bhh;

public class fh {
    public static final fh rkhy;
    protected float thmt_2;
    protected float thtd;
    protected float ryw;
    protected float khss_2;
    private static final int gwh2e1kf = -598927200;
    private static final int afscvhdwqv = -1151369858;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int o1brnne25x;

    public void hdhq(float f, float f2, float f3, float f4) {
        this.thmt_2 = f;
        this.thtd = f2;
        this.ryw = f3;
        this.khss_2 = f4;
    }

    public fh hrh(float f) {
        return new fh(f, this.thtd, this.ryw, this.khss_2);
    }

    public fh shghk(float f) {
        return new fh(this.thmt_2, f, this.ryw, this.khss_2);
    }

    public fh sdhw_2(float f) {
        return new fh(this.thmt_2, this.thtd, f, this.khss_2);
    }

    public fh ththm(float f) {
        return new fh(this.thmt_2, this.thtd, this.ryw, f);
    }

    public fh hzs(float f) {
        return new fh(this.thmt_2 + f, this.thtd + f, this.ryw - f * 2.0f, this.khss_2 - f * 2.0f);
    }

    public static fh drh_2(fh fh2, fh fh3, double d) {
        float f = (float)((double)fh2.thmt_2 + (double)(fh3.thmt_2 - fh2.thmt_2) * d);
        float f2 = (float)((double)fh2.thtd + (double)(fh3.thtd - fh2.thtd) * d);
        float f3 = (float)((double)fh2.ryw + (double)(fh3.ryw - fh2.ryw) * d);
        float f4 = (float)((double)fh2.khss_2 + (double)(fh3.khss_2 - fh2.khss_2) * d);
        return new fh(f, f2, f3, f4);
    }

    public boolean lz(fh fh2) {
        return this.tfkh(fh2.khdb_2(), fh2.sw(), fh2.shfz(), fh2.khll());
    }

    public boolean tfkh(float f, float f2, float f3, float f4) {
        return this.thmt_2 + this.ryw > f && this.thmt_2 < f + f3 && this.thtd + this.khss_2 > f2 && this.thtd < f2 + f4;
    }

    public boolean dhkw(fh fh2) {
        return this.htt_3(fh2.khdb_2(), fh2.sw(), fh2.shfz(), fh2.khll());
    }

    public boolean htt_3(float f, float f2, float f3, float f4) {
        return this.thmt_2 > f && this.thmt_2 + this.ryw < f + f3 && this.thtd > f2 && this.thtd + this.khss_2 < f2 + f4;
    }

    public boolean wth(double d, double d2) {
        return bhh.thsb_2(this.thmt_2, this.thtd, this.ryw, this.khss_2, d, d2);
    }

    @Generated
    public float khdb_2() {
        return this.thmt_2;
    }

    @Generated
    public float sw() {
        return this.thtd;
    }

    @Generated
    public float shfz() {
        return this.ryw;
    }

    @Generated
    public float khll() {
        return this.khss_2;
    }

    @Generated
    public void khtd(float f) {
        this.thmt_2 = f;
    }

    @Generated
    public void thtk_2(float f) {
        this.thtd = f;
    }

    @Generated
    public void sht(float f) {
        this.ryw = f;
    }

    @Generated
    public void rl(float f) {
        this.khss_2 = f;
    }

    @Generated
    public fh() {
    }

    @Generated
    public fh(float f, float f2, float f3, float f4) {
        this.thmt_2 = f;
        this.thtd = f2;
        this.ryw = f3;
        this.khss_2 = f4;
    }

    private static String[] df6ha12uo78(String string) {
        return string.split("\u0001\u000f", -1);
    }

    private static CallSite qe649c22m6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ gwh2e1kf ^ string.hashCode() ^ n2 + afscvhdwqv ^ i * 373987055 ^ gwh2e1kf, 15) ^ afscvhdwqv));
            }
            String[] stringArray = fh.df6ha12uo78(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

