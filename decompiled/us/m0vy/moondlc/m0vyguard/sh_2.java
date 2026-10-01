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
import us.m0vy.moondlc.m0vyguard.tkhs;

public class sh_2 {
    public float jma_2;
    public float had_2;
    public float khnd;
    public float zrkh;
    private static final int pzne0svq03 = -1197658774;
    private static final int gims1sz = -1113041277;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int y0uxgvm4w6kb7v;

    public boolean abb(double d, double d2) {
        return tkhs.hd_3(d, d2, this.jma_2, this.had_2, this.khnd, this.zrkh);
    }

    @Generated
    public sh_2(float f, float f2, float f3, float f4) {
        this.jma_2 = f;
        this.had_2 = f2;
        this.khnd = f3;
        this.zrkh = f4;
    }

    @Generated
    public float swa() {
        return this.jma_2;
    }

    @Generated
    public float ttd_8() {
        return this.had_2;
    }

    @Generated
    public float thdk_2() {
        return this.khnd;
    }

    @Generated
    public float hwd_2() {
        return this.zrkh;
    }

    @Generated
    public void adm_2(float f) {
        this.jma_2 = f;
    }

    @Generated
    public void shjd(float f) {
        this.had_2 = f;
    }

    @Generated
    public void hkhr(float f) {
        this.khnd = f;
    }

    @Generated
    public void dhkkh(float f) {
        this.zrkh = f;
    }

    @Generated
    public boolean khdl(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof sh_2)) {
            return false;
        }
        sh_2 sh2 = (sh_2)object;
        if (!sh2.thj_2(this)) {
            return false;
        }
        if (Float.compare(this.swa(), sh2.swa()) != 0) {
            return false;
        }
        if (Float.compare(this.ttd_8(), sh2.ttd_8()) != 0) {
            return false;
        }
        if (Float.compare(this.thdk_2(), sh2.thdk_2()) != 0) {
            return false;
        }
        return Float.compare(this.hwd_2(), sh2.hwd_2()) == 0;
    }

    @Generated
    protected boolean thj_2(Object object) {
        return object instanceof sh_2;
    }

    @Generated
    public int khkhth() {
        boolean bl = true;
        int n = 1;
        n = n * 59 + Float.floatToIntBits(this.swa());
        n = n * 59 + Float.floatToIntBits(this.ttd_8());
        n = n * 59 + Float.floatToIntBits(this.thdk_2());
        n = n * 59 + Float.floatToIntBits(this.hwd_2());
        return n;
    }

    @Generated
    public String sthkh_2() {
        float f = this.swa();
        return "ChangeRect(x=" + f + ", y=" + this.ttd_8() + ", width=" + this.thdk_2() + ", height=" + this.hwd_2() + ")";
    }

    private static String[] vxqi59517jkj11(String string) {
        return string.split("\b\u000f", -1);
    }

    private static CallSite rpm43u16pfr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ pzne0svq03 ^ string.hashCode() ^ n2 + gims1sz ^ i * -1087642929 ^ pzne0svq03, 15) ^ gims1sz));
            }
            String[] stringArray = sh_2.vxqi59517jkj11(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

