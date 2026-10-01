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
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.fa_2;

public class bwr
implements tthy {
    private double sn_2;
    private double jath = 0.0;
    private double zk = 0.0;
    private double han = 28.0;
    public static final double dhfl = 1.0;
    private final fa_2 thth_3 = new fa_2(100L, jkh.hd_2);
    private static final int x6woguvnxd = 981679194;
    private static final int kk46gf7cd = 984177230;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int nrj8hqe5hcu;

    public void dzl_2() {
        this.zk = Math.min(Math.max(this.zk, this.sn_2), 0.0);
        double d = (this.zk - this.jath) * 0.18;
        this.jath += d;
        if (Math.abs(this.zk - this.jath) < 0.05) {
            this.jath = this.zk;
        }
    }

    public double shtt_4() {
        return -this.jath;
    }

    public void zdhl() {
        this.jath = 0.0;
        this.zk = 0.0;
    }

    public void jhd(double d) {
        this.zk = Math.min(Math.max(this.zk + d * this.han, this.sn_2), 0.0);
    }

    public void dhqkh(int n) {
        if (n == 265) {
            this.jhd(1.0);
        } else if (n == 264) {
            this.jhd(-1.0);
        }
    }

    public void khrs(class_4587 class_45872, double d, double d2, double d3, double d4, double d5) {
        if (!(d5 <= d4)) {
            double d6 = 50.0;
            double d7 = d2 + this.jath / this.sn_2 * (d4 - d6);
        }
    }

    @Generated
    public double shky() {
        return this.sn_2;
    }

    @Generated
    public double shlsh() {
        return this.zk;
    }

    @Generated
    public double abkh() {
        return this.han;
    }

    @Generated
    public fa_2 tjz_2() {
        return this.thth_3;
    }

    @Generated
    public void srb_2(double d) {
        this.sn_2 = d;
        this.zk = Math.min(Math.max(this.zk, this.sn_2), 0.0);
    }

    @Generated
    public void zthj_2(double d) {
        this.jath = d;
    }

    @Generated
    public void khdgh_2(double d) {
        this.zk = d;
    }

    @Generated
    public void ghzz(double d) {
        this.han = d;
    }

    private static String[] w6p8yyxw(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite n9yevltcnp0sd(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ x6woguvnxd ^ string.hashCode()) + (n2 + kk46gf7cd) + i ^ x6woguvnxd, 17) + kk46gf7cd);
            }
            String[] stringArray = bwr.w6p8yyxw(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

