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
import us.m0vy.moondlc.m0vyguard.brq;
import us.m0vy.moondlc.m0vyguard.tbm;

public class bbw {
    private final brq zhh_4 = new brq();
    private int kt_2;
    private double khmz = 1.0;
    private boolean khfn;
    private tbm dzl;
    private static final int gvuqrax0rb0 = -831857167;
    private static final int in0fwbl4a3rht = -1091058958;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vz6rhvtr82;

    public boolean dhzq(boolean bl) {
        return this.zhh_4.sza(this.kt_2) && (bl ? this.khfn : !this.khfn);
    }

    public boolean dhtz_3() {
        return this.zhh_4.sza(this.kt_2) && this.khfn;
    }

    public bbw qj(boolean bl) {
        if (this.khfn != bl) {
            this.khfn = bl;
            this.zhh_4.dhty_2((long)((double)System.currentTimeMillis() - (this.khmz - Math.min(this.khmz, (double)this.zhh_4.shagh()))));
        }
        return this;
    }

    public bbw sath_2() {
        this.zhh_4.dhty_2(System.currentTimeMillis() - (long)this.kt_2);
        return this;
    }

    public bbw aty(tbm tbm2) {
        this.dzl = tbm2;
        return this;
    }

    public bbw skha_3(int n) {
        this.kt_2 = n;
        return this;
    }

    public bbw awh_2(float f) {
        this.khmz = f;
        return this;
    }

    public float sts_7() {
        if (this.khfn) {
            if (this.zhh_4.sza(this.kt_2)) {
                return (float)this.khmz;
            }
            return (float)((double)this.zhh_4.shagh() / (double)this.kt_2 * this.khmz);
        }
        if (this.zhh_4.sza(this.kt_2)) {
            return 0.0f;
        }
        return (float)((1.0 - (double)this.zhh_4.shagh() / (double)this.kt_2) * this.khmz);
    }

    public float szw_3() {
        if (this.khfn) {
            if (this.zhh_4.sza(this.kt_2)) {
                return (float)this.khmz;
            }
            return (float)(this.dzl.apply((double)this.zhh_4.shagh() / (double)this.kt_2) * this.khmz);
        }
        if (this.zhh_4.sza(this.kt_2)) {
            return 0.0f;
        }
        return (float)((1.0 - this.dzl.apply((double)this.zhh_4.shagh() / (double)this.kt_2)) * this.khmz);
    }

    public float ddt_8() {
        return 1.0f - this.szw_3();
    }

    public void dhz() {
        this.zhh_4.tshf_2();
    }

    public void thhm_2() {
        if (this.dhtz_3()) {
            this.qj(false);
        } else if (this.dhzq(false)) {
            this.qj(true);
        }
    }

    @Generated
    public brq asdh_2() {
        return this.zhh_4;
    }

    @Generated
    public int hzk_2() {
        return this.kt_2;
    }

    @Generated
    public double khjm() {
        return this.khmz;
    }

    @Generated
    public tbm tss_3() {
        return this.dzl;
    }

    @Generated
    public boolean dthq() {
        return this.khfn;
    }

    private static String[] jfp13yyds(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite a2einalpuwhl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ gvuqrax0rb0 ^ string.hashCode() ^ n2 + in0fwbl4a3rht + i * -1069726555) + gvuqrax0rb0) ^ in0fwbl4a3rht));
            }
            String[] stringArray = bbw.jfp13yyds(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
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

