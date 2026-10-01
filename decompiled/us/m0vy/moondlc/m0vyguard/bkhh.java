/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;

public final class bkhh
extends Enum {
    public static final /* enum */ bkhh ghz_2;
    public static final /* enum */ bkhh shy_4;
    public static final /* enum */ bkhh dhyh;
    public static final /* enum */ bkhh sdhj;
    public static final /* enum */ bkhh dhm;
    public static final /* enum */ bkhh sjj;
    public static final /* enum */ bkhh dthgh;
    public static final /* enum */ bkhh dmkh;
    public static final /* enum */ bkhh baf_2;
    public static final /* enum */ bkhh dhsh_3;
    public static final /* enum */ bkhh hbsh;
    public static final /* enum */ bkhh hzth;
    public static final /* enum */ bkhh bka;
    public static final /* enum */ bkhh zwt_2;
    public static final /* enum */ bkhh sks_2;
    public static final /* enum */ bkhh qgh;
    public static final /* enum */ bkhh thkht;
    public static final /* enum */ bkhh trs;
    public static final /* enum */ bkhh hdhkh;
    private final String khaa;
    private static final bkhh[] khwkh;
    private static final int ifc2hcmr5j = 1796347167;
    private static final int gsu7y7nwbm = 1200635667;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";

    public static bkhh[] values() {
        return (bkhh[])khwkh.clone();
    }

    public static bkhh valueOf(String string) {
        return Enum.valueOf(bkhh.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bkhh() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.khaa = var3_2;
    }

    public String getLetter() {
        return this.khaa;
    }

    public static bkhh find(String string) {
        try {
            return bkhh.valueOf(string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    private static bkhh[] $values() {
        return new bkhh[]{ghz_2, shy_4, dhyh, sdhj, dhm, sjj, dthgh, dmkh, baf_2, dhsh_3, hbsh, hzth, bka, zwt_2, sks_2, qgh, thkht, trs, hdhkh};
    }

    private static String[] uf4fwqhu(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite edvxky05cp136(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ifc2hcmr5j ^ string.hashCode()) + (n2 + gsu7y7nwbm) + i ^ ifc2hcmr5j, 8) + gsu7y7nwbm);
            }
            String[] stringArray = bkhh.uf4fwqhu(new String(cArray));
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

