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
import java.util.List;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bkt;

public class bsw_2 {
    protected final bkt dad_3;
    protected final bkt khdk_2;
    protected final bkt dtth;
    protected final bkt dhghkh;
    private static final int md39b1s = 1041120033;
    private static final int yzjiqyz0 = 390311623;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int l13wlhxk6g3;

    protected bsw_2(bkt bkt2, bkt bkt3, bkt bkt4, bkt bkt5) {
        this.dad_3 = bkt2;
        this.khdk_2 = bkt3;
        this.dtth = bkt4;
        this.dhghkh = bkt5;
    }

    public static bsw_2 shtl_2(bkt bkt2, bkt bkt3, bkt bkt4, bkt bkt5) {
        return new bsw_2(bkt2, bkt3, bkt4, bkt5);
    }

    public static bsw_2 khshh(List list) {
        return new bsw_2((bkt)list.get(0), (bkt)list.get(1), (bkt)list.get(2), (bkt)list.get(3));
    }

    public bsw_2 zjq() {
        return this;
    }

    public bsw_2 khth_3(float f) {
        return new bsw_2(this.dad_3.shbm(f), this.khdk_2.shbm(f), this.dtth.shbm(f), this.dhghkh.shbm(f));
    }

    @Generated
    public bkt t_2() {
        return this.dad_3;
    }

    @Generated
    public bkt aqz() {
        return this.khdk_2;
    }

    @Generated
    public bkt dfgh_2() {
        return this.dtth;
    }

    @Generated
    public bkt thtr_2() {
        return this.dhghkh;
    }

    private static String[] kbmo5osuolunq3(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite rzdt68k4bxo(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ md39b1s ^ string.hashCode()) + (n2 + yzjiqyz0) + i ^ md39b1s, 13) + yzjiqyz0);
            }
            String[] stringArray = bsw_2.kbmo5osuolunq3(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

