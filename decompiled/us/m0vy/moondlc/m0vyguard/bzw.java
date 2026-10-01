/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.tsha;

public final class bzw
extends Enum {
    public static final /* enum */ bzw ththa;
    public static final /* enum */ bzw jsz_3;
    public static final /* enum */ bzw bad_3;
    public static final /* enum */ bzw jsh_4;
    public static final /* enum */ bzw rah_4;
    private static final bzw[] zq_2;
    private static final int hath_2 = -705143327;
    private static final int bsh = -396213542;
    private static final int oblc1d6ic = 1285451938;
    private static final int hnbx9dhvf = 1348940182;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";

    public static bzw[] values() {
        block0: {
            int n = -1061747166;
            int n2 = (n = Integer.rotateLeft(n * 1110628431, 24) ^ 0xF9E1342B) ^ 0x6B2B3626;
            if ((n2 ^ n) == 1797994022) break block0;
            int cfr_ignored_0 = (0xAB9C3004 ^ n) + 2004100235;
        }
        return (bzw[])zq_2.clone();
    }

    public static bzw valueOf(String string) {
        block0: {
            int n = tsha.jjq(-1526578437);
            int n2 = n ^ 0x1AD09C51;
            if ((n2 ^ n) == 449879121) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xBFD2DEAA ^ n, 10) + 1055299025;
        }
        return Enum.valueOf(bzw.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bzw() {
        void var2_-1;
        void var1_-1;
    }

    private static bzw[] $values() {
        int n = -1417348867;
        int n2 = (n = Integer.rotateLeft(n * 1864787917, 23) ^ 0xFDB4F4C4) ^ 0xF412385C;
        if ((n2 ^ n) != -200132516) {
            int cfr_ignored_0 = (0x5F96C0A1 ^ n) + 400129193;
        }
        return new bzw[]{ththa, jsz_3, bad_3, jsh_4, rah_4};
    }

    private static String[] p9d9w6elr5ax(String string) {
        int n = -1368759322;
        n = Integer.rotateLeft(n * -1941246657, 5) ^ 0xB115334C;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x1F036B8C;
        if ((n2 ^ n) != 520317836) {
            int cfr_ignored_0 = (0xB169086A ^ n) + -2026955027;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite ept1wdzv1gckp(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1181818442;
            n3 = Integer.rotateLeft(n3 * 1961607649, 12) ^ 0xB300C783;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 13);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xFC64F658;
            if ((n4 ^ n3) != -60492200) {
                int cfr_ignored_0 = (0x45EA17EE ^ n3) - 746590855;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ hath_2 ^ string.hashCode() ^ n2 + bsh + i * -601677161) + hath_2) ^ bsh));
            }
            String[] stringArray = bzw.p9d9w6elr5ax(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] lvmb35xcvjgmf(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite utqt588o(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ oblc1d6ic ^ string.hashCode() ^ n2 + hnbx9dhvf + i * -1769900765) + oblc1d6ic) ^ hnbx9dhvf));
            }
            String[] stringArray = bzw.lvmb35xcvjgmf(new String(cArray));
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

