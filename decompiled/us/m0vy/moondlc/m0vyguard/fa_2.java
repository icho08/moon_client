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
import us.m0vy.moondlc.m0vyguard.jkh;

public class fa_2 {
    private long dna_2;
    private float tyz_2;
    private jkh dhrd_2;
    private long jhz;
    private float dhzz_3;
    private float tlt_2;
    private boolean swz;
    private boolean thdhm;
    private static final int zn8kc4rsi4sxm = -1076032945;
    private static final int r57oxrk9uzgpw = -1310735268;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int dx88yjs9r;

    public fa_2(long l, float f, jkh jkh2) {
        this.dna_2 = l;
        this.dhrd_2 = jkh2;
        this.tyz_2 = f;
        this.dhzz_3 = f;
        this.tlt_2 = f;
        this.swz = true;
    }

    public fa_2(long l, jkh jkh2) {
        this(l, 0.0f, jkh2);
    }

    public void ddt_6(boolean bl) {
        this.khmf(bl ? 1.0f : 0.0f);
    }

    public float khmf(float f) {
        long l;
        long l2 = System.currentTimeMillis();
        if (f != this.tlt_2) {
            this.dhzz_3 = this.tyz_2;
            this.tlt_2 = f;
            this.jhz = l2;
            this.swz = false;
        }
        if ((l = l2 - this.jhz) >= this.dna_2) {
            this.tyz_2 = this.tlt_2;
            this.swz = true;
            return this.tyz_2;
        }
        float f2 = (float)l / (float)this.dna_2;
        float f3 = this.dhrd_2.ease(f2, 0.0f, 1.0f, 1.0f);
        this.tyz_2 = this.dhzz_3 + (this.tlt_2 - this.dhzz_3) * f3;
        return this.tyz_2;
    }

    public void atth_2(float f) {
        this.tyz_2 = f;
        this.dhzz_3 = f;
        this.tlt_2 = f;
        this.swz = true;
    }

    public void dbl(float f) {
        this.tyz_2 = f;
        this.dhzz_3 = f;
        this.tlt_2 = f;
        this.swz = true;
    }

    public void zzth_2() {
        this.dbl(0.0f);
    }

    public void sba_3() {
        if (this.thdhm) {
            this.khmf(1.0f);
        } else {
            this.khmf(0.0f);
        }
        if (this.tyz_2 == 1.0f) {
            this.thdhm = false;
        } else if (this.tyz_2 == 0.0f) {
            this.thdhm = true;
        }
    }

    @Generated
    public long shrdh() {
        return this.dna_2;
    }

    @Generated
    public float tssh_2() {
        return this.tyz_2;
    }

    @Generated
    public jkh khzkh() {
        return this.dhrd_2;
    }

    @Generated
    public long ghzd() {
        return this.jhz;
    }

    @Generated
    public float srd_2() {
        return this.dhzz_3;
    }

    @Generated
    public float sghw() {
        return this.tlt_2;
    }

    @Generated
    public boolean thjd() {
        return this.swz;
    }

    @Generated
    public boolean saa_3() {
        return this.thdhm;
    }

    @Generated
    public void zkhdh(long l) {
        this.dna_2 = l;
    }

    @Generated
    public void dam_2(jkh jkh2) {
        this.dhrd_2 = jkh2;
    }

    @Generated
    public void rqdh(long l) {
        this.jhz = l;
    }

    @Generated
    public void jqt(float f) {
        this.dhzz_3 = f;
    }

    @Generated
    public void dtdh_4(float f) {
        this.tlt_2 = f;
    }

    @Generated
    public void khls_2(boolean bl) {
        this.swz = bl;
    }

    @Generated
    public void tdhs(boolean bl) {
        this.thdhm = bl;
    }

    private static String[] jktswal8y(String string) {
        return string.split("\u0005\u0016", -1);
    }

    private static CallSite ygv0vatl7y(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ zn8kc4rsi4sxm ^ string.hashCode()) + (n2 + r57oxrk9uzgpw) + i ^ zn8kc4rsi4sxm, 10) + r57oxrk9uzgpw);
            }
            String[] stringArray = fa_2.jktswal8y(new String(cArray));
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

