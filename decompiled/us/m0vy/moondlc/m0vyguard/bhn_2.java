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
import us.m0vy.moondlc.m0vyguard.bdz;

public class bhn_2 {
    private long dhkhm;
    private float sty_3;
    private bdz sfw;
    private long shsdh_2;
    private float rzz_3;
    private float dsd_2;
    private boolean thkl;
    private boolean sfk;
    private static final int zankzny = 0x77727237;
    private static final int yyiptqlkih2 = -774248360;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kuh47dq6dwz;

    public bhn_2(long l, float f, bdz bdz2) {
        this.dhkhm = l;
        this.sfw = bdz2;
        this.sty_3 = f;
        this.rzz_3 = f;
        this.dsd_2 = f;
        this.thkl = true;
    }

    public bhn_2(long l, bdz bdz2) {
        this(l, 0.0f, bdz2);
    }

    public void sby_2(boolean bl) {
        this.thdhsh(bl ? 1.0f : 0.0f);
    }

    public float thdhsh(float f) {
        long l;
        long l2 = System.currentTimeMillis();
        if (f != this.dsd_2) {
            this.rzz_3 = this.sty_3;
            this.dsd_2 = f;
            this.shsdh_2 = l2;
            this.thkl = false;
        }
        if ((l = l2 - this.shsdh_2) >= this.dhkhm) {
            this.sty_3 = this.dsd_2;
            this.thkl = true;
            return this.sty_3;
        }
        float f2 = (float)l / (float)this.dhkhm;
        float f3 = this.sfw.ease(f2, 0.0f, 1.0f, 1.0f);
        this.sty_3 = this.rzz_3 + (this.dsd_2 - this.rzz_3) * f3;
        return this.sty_3;
    }

    public void dhht_2(float f) {
        this.sty_3 = f;
        this.rzz_3 = f;
        this.dsd_2 = f;
        this.thkl = true;
    }

    public void say_4(float f) {
        this.sty_3 = f;
        this.rzz_3 = f;
        this.dsd_2 = f;
        this.thkl = true;
    }

    public void bzs_2() {
        this.say_4(0.0f);
    }

    public void abf(float f) {
        if (f != this.dsd_2) {
            this.rzz_3 = this.sty_3;
            this.dsd_2 = f;
            this.shsdh_2 = System.currentTimeMillis();
            this.thkl = false;
        }
    }

    public float dghm() {
        return this.thdhsh(this.dsd_2);
    }

    @Generated
    public long dhshl() {
        return this.dhkhm;
    }

    @Generated
    public float hnf() {
        return this.sty_3;
    }

    @Generated
    public bdz drr() {
        return this.sfw;
    }

    @Generated
    public long tsgh_2() {
        return this.shsdh_2;
    }

    @Generated
    public float kth() {
        return this.rzz_3;
    }

    @Generated
    public float bghq() {
        return this.dsd_2;
    }

    @Generated
    public boolean ztd_4() {
        return this.thkl;
    }

    @Generated
    public boolean dhqh_2() {
        return this.sfk;
    }

    @Generated
    public void sqm(long l) {
        this.dhkhm = l;
    }

    @Generated
    public void htgh(bdz bdz2) {
        this.sfw = bdz2;
    }

    @Generated
    public void thnt(long l) {
        this.shsdh_2 = l;
    }

    @Generated
    public void sfm_2(float f) {
        this.rzz_3 = f;
    }

    @Generated
    public void zlgh_2(float f) {
        this.dsd_2 = f;
    }

    @Generated
    public void shab(boolean bl) {
        this.thkl = bl;
    }

    @Generated
    public void shdhr(boolean bl) {
        this.sfk = bl;
    }

    private static String[] jj9godadgszmc(String string) {
        return string.split("\b\u001e", -1);
    }

    private static CallSite ug1icyka3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ zankzny ^ string.hashCode()) + (n2 + yyiptqlkih2) + i ^ zankzny, 15) + yyiptqlkih2);
            }
            String[] stringArray = bhn_2.jj9godadgszmc(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

