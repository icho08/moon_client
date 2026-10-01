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
import java.util.function.Supplier;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bmt;
import us.m0vy.moondlc.m0vyguard.sth_3;
import us.m0vy.moondlc.m0vyguard.ngh;

public class tbz
extends bmt {
    private float jnt_2 = Float.MIN_VALUE;
    private float jzz_2 = Float.MAX_VALUE;
    private float zkth = 1.0f;
    private static final int ypwp78q = 991166350;
    private static final int bt187nps6imff = 1860242777;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int s0mumw1nluyjk6;

    public tbz(String string) {
        super(string);
        this.jsn_2 = new sth_3(0.0f, 0.0f);
    }

    public tbz thwf(float f, float f2) {
        this.bth(new sth_3(f, f2));
        return this;
    }

    public tbz td_3(sth_3 sth2) {
        this.bth(sth2);
        return this;
    }

    public void bth(sth_3 sth2) {
        sth_3 sth3;
        float f;
        if (sth2 == null) {
            return;
        }
        float f2 = this.zbs(sth2.lower());
        if (f2 > (f = this.zbs(sth2.upper()))) {
            float f3 = f2;
            f2 = f;
            f = f3;
        }
        if (this.hlj(sth3 = new sth_3(f2, f))) {
            return;
        }
        super.bth(sth3);
        this.zkhn();
    }

    protected boolean hlj(sth_3 sth2) {
        return this.jsn_2 != null && sth2 != null && Float.compare(((sth_3)this.jsn_2).lower(), sth2.lower()) == 0 && Float.compare(((sth_3)this.jsn_2).upper(), sth2.upper()) == 0;
    }

    @Override
    public tbz qh(Supplier supplier) {
        return (tbz)super.qh(supplier);
    }

    @Override
    public tbz dk(Runnable runnable) {
        return (tbz)super.dk(runnable);
    }

    public tbz ghdr_2(float f, float f2) {
        this.jnt_2 = f;
        this.jzz_2 = f2;
        this.bth((sth_3)this.dms_4());
        return this;
    }

    public tbz zyf_2(float f) {
        this.zkth = f;
        this.bth((sth_3)this.dms_4());
        return this;
    }

    public float ghjd() {
        return ((sth_3)this.jsn_2).lower();
    }

    public float rshgh() {
        return ((sth_3)this.jsn_2).upper();
    }

    public void tjf_2(float f) {
        this.bth(new sth_3(f, this.rshgh()));
    }

    public void btth_2(float f) {
        this.bth(new sth_3(this.ghjd(), f));
    }

    public boolean khfz_2() {
        return Float.compare(this.ghjd(), this.rshgh()) == 0;
    }

    public float dhj_2() {
        if (this.khfz_2()) {
            return this.ghjd();
        }
        return this.zbs(ngh.zthw(this.ghjd(), this.rshgh()));
    }

    private float zbs(float f) {
        return ngh.ttm_3(Math.max(this.jnt_2, Math.min(this.jzz_2, f)), this.zkth);
    }

    @Generated
    public float zhs() {
        return this.jnt_2;
    }

    @Generated
    public float bld() {
        return this.jzz_2;
    }

    @Generated
    public float dsb_4() {
        return this.zkth;
    }

    private static String[] mclor6ghw(String string) {
        return string.split("\u0005\u000e", -1);
    }

    private static CallSite ujscd8kxke8jeq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ypwp78q ^ string.hashCode() ^ n2 + bt187nps6imff ^ i * -791592771 ^ ypwp78q, 14) ^ bt187nps6imff));
            }
            String[] stringArray = tbz.mclor6ghw(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

