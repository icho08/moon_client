/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.btf_2;
import us.m0vy.moondlc.m0vyguard.tdq;
import us.m0vy.moondlc.m0vyguard.dh_3;

public class st_5
implements dh_3 {
    private double sjr_2;
    private double jthm = 0.0;
    private double hdhh = 0.0;
    private double khat = 20.0;
    private static final double dhddh = 0.4;
    public static final double jkz_2 = 1.0;
    private final tdq dhzm = new tdq(100L, btf_2.shjm);
    private static final int sxtwo23 = -427790460;
    private static final int rstj1ln9 = -1851226283;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int vxibhe8v5rd4;

    public void tnl() {
        this.dhzm.zaz_5(300L);
        this.hdhh = Math.min(Math.max(this.hdhh, this.sjr_2), 0.0);
        double d = this.hdhh - this.jthm;
        this.jthm += d;
        if (d > 0.0) {
            this.dhzm.zzb_4(Math.abs(d) > 21.0 ? btf_2.thhj_2 : btf_2.shjm);
        }
        this.dhzm.znl_2((float)this.jthm);
    }

    public double thha_4() {
        return -this.dhzm.swd();
    }

    public void bghth() {
        this.jthm = 0.0;
        this.hdhh = 0.0;
        this.dhzm.sdd_5();
    }

    public void bdf(double d) {
        this.hdhh += d * this.khat;
    }

    public void dthd_4(int n) {
        if (n == 265) {
            this.bdf(1.0);
        } else if (n == 264) {
            this.bdf(-1.0);
        }
    }

    public void bbs(class_4587 class_45872, double d, double d2, double d3, double d4, double d5) {
        if (!(d5 <= d4)) {
            double d6 = 50.0;
            double d7 = d2 + this.jthm / this.sjr_2 * (d4 - d6);
        }
    }

    @Generated
    public double djk() {
        return this.sjr_2;
    }

    @Generated
    public double shn_2() {
        return this.hdhh;
    }

    @Generated
    public double zsf() {
        return this.khat;
    }

    @Generated
    public tdq szh_2() {
        return this.dhzm;
    }

    @Generated
    public void ztr_3(double d) {
        this.sjr_2 = d;
    }

    @Generated
    public void ghdhz_2(double d) {
        this.jthm = d;
    }

    @Generated
    public void khha_2(double d) {
        this.hdhh = d;
    }

    @Generated
    public void sq_2(double d) {
        this.khat = d;
    }

    private static String[] bn7ovak2rvvl(String string) {
        return string.split("\u0001\u001f", -1);
    }

    private static CallSite fufhcew11vz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ sxtwo23 ^ string.hashCode() ^ n2 + rstj1ln9 ^ i * -68030155 ^ sxtwo23, 10) ^ rstj1ln9));
            }
            String[] stringArray = st_5.bn7ovak2rvvl(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

