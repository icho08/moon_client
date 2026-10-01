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
import us.m0vy.moondlc.m0vyguard.bthq;

public final class bgha
extends Enum {
    public static final /* enum */ bgha skhsh;
    public static final /* enum */ bgha zdhs_2;
    public static final /* enum */ bgha jfd_2;
    public static final /* enum */ bgha tdkh;
    public static final /* enum */ bgha dsj;
    public static final /* enum */ bgha st_5;
    public static final /* enum */ bgha shnt_2;
    public static final /* enum */ bgha khnf;
    public static final /* enum */ bgha shyw;
    public static final /* enum */ bgha rwk;
    public static final /* enum */ bgha rdd_4;
    private final bthq thdh;
    public final float shf_3;
    private static final bgha[] shah_4;
    private static final int zj51zj8p583 = -956993604;
    private static final int earacm2ym = -1053539652;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";

    public static bgha[] values() {
        return (bgha[])shah_4.clone();
    }

    public static bgha valueOf(String string) {
        return Enum.valueOf(bgha.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bgha() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.thdh = var3_2;
        this.shf_3 = var3_2.rwr;
        var3_2.rwr += var3_2.getStep();
    }

    @Generated
    public bthq getTexture() {
        return this.thdh;
    }

    @Generated
    public float getX() {
        return this.shf_3;
    }

    private static bgha[] $values() {
        return new bgha[]{skhsh, zdhs_2, jfd_2, tdkh, dsj, st_5, shnt_2, khnf, shyw, rwk, rdd_4};
    }

    private static String[] r9k90mqz(String string) {
        return string.split("\u0003\u001f", -1);
    }

    private static CallSite tq4ip9mc5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ zj51zj8p583 ^ string.hashCode() ^ n2 + earacm2ym + i * 2138375333) + zj51zj8p583) ^ earacm2ym));
            }
            String[] stringArray = bgha.r9k90mqz(new String(cArray));
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

