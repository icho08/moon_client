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
import us.m0vy.moondlc.m0vyguard.tdha;

public class bsn
implements tdha {
    private double tzgh;
    private double shn_4 = 0.0;
    private double dhnw = 0.0;
    private double zsth = 8.0;
    private static final double zza_3 = 0.4;
    public static final double hjy = 1.0;
    private static final int f0huwnv1ce282 = 1589429241;
    private static final int oo0lgmvma = -891098628;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int f3o2undbwpspk;

    public void byj() {
        this.dhnw = Math.max(Math.min(this.dhnw, 0.0), -this.tzgh);
        double d = this.dhnw - this.shn_4;
        this.shn_4 += d * 0.4;
        if (Math.abs(d) < 0.1) {
            this.shn_4 = this.dhnw;
        }
    }

    public double shshh_2() {
        return -this.shn_4;
    }

    public void ghsth_2(double d) {
        this.dhnw += d * this.zsth;
    }

    @Generated
    public double dlt() {
        return this.tzgh;
    }

    @Generated
    public double thghsh() {
        return this.dhnw;
    }

    @Generated
    public double ahs_2() {
        return this.zsth;
    }

    @Generated
    public void dmh_4(double d) {
        this.tzgh = d;
    }

    @Generated
    public void zdn_3(double d) {
        this.shn_4 = d;
    }

    @Generated
    public void rfm(double d) {
        this.dhnw = d;
    }

    @Generated
    public void tkq(double d) {
        this.zsth = d;
    }

    private static String[] ay37a62bh6(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite z0ivx9pfi6zpuk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ f0huwnv1ce282 ^ string.hashCode() ^ n2 + oo0lgmvma + i * -430248493) + f0huwnv1ce282) ^ oo0lgmvma));
            }
            String[] stringArray = bsn.ay37a62bh6(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

