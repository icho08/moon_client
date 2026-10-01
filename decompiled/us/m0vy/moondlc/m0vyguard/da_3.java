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

public final class da_3
extends Enum {
    public static final /* enum */ da_3 dfs;
    public static final /* enum */ da_3 khdr_2;
    public static final /* enum */ da_3 zshs;
    public static final /* enum */ da_3 thdh_5;
    public static final /* enum */ da_3 rtz_4;
    public static final /* enum */ da_3 hya;
    public static final /* enum */ da_3 dhkd;
    private final int tyw;
    private static final da_3[] khdh_3;
    private static final int lnflpvnf2y = -1315463932;
    private static final int ihflvs40 = -1616359568;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";

    public static da_3[] values() {
        return (da_3[])khdh_3.clone();
    }

    public static da_3 valueOf(String string) {
        return Enum.valueOf(da_3.class, string);
    }

    public static da_3 fromButtonIndex(int n) {
        for (da_3 da2_2 : da_3.values()) {
            if (da2_2.getButtonIndex() != n) continue;
            return da2_2;
        }
        return dfs;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    @Generated
    private da_3() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.tyw = var3_2;
    }

    @Generated
    public int getButtonIndex() {
        return this.tyw;
    }

    private static da_3[] $values() {
        return new da_3[]{dfs, khdr_2, zshs, thdh_5, rtz_4, hya, dhkd};
    }

    private static String[] iso4g1ou3(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite bkb5usnn1q(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ lnflpvnf2y ^ string.hashCode() ^ n2 + ihflvs40 + i * -1930792493) + lnflpvnf2y) ^ ihflvs40));
            }
            String[] stringArray = da_3.iso4g1ou3(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

