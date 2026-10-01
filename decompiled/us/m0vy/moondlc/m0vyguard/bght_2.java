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

public final class bght_2 {
    public static List sma_2;
    private static final int khhdh_2 = 1054615740;
    private static final int sqt_2 = -13339319;
    private static final int khthk = 2096099105;
    private static final int nth = 784824512;
    private static final int oh37vwqh86x = 1218883849;
    private static final int gzk7yxfytgkt = 1475256611;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int s2pf4cn3vu6bd;

    @Generated
    private bght_2() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String thshn(String string, int n, int n2, int n3) {
        int n4 = 1454030509;
        n4 = Integer.rotateLeft(n4 * -1496185413, 28) ^ 0xF865CB09;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateRight(n ^ n4, 19)) ^ 0xA7D29C9;
        if ((n5 ^ n4) != 175974857) {
            int cfr_ignored_0 = (0x5CD79764 ^ n4) + -1108835796;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xEBA2C4E7 ^ n2 ^ i * -757630073 ^ khhdh_2, 10) ^ sqt_2));
        }
        return new String(cArray);
    }

    private static String[] tqsh_2(String string) {
        block0: {
            int n = 1631209814;
            int n2 = (n = Integer.rotateLeft(n * -304615461, 6) ^ 0x8506FD86) ^ 0xCF2F1D13;
            if ((n2 ^ n) == -818995949) break block0;
            int cfr_ignored_0 = (0xAE155445 ^ n) + 872350390;
        }
        return string.split("\u0002\u001d", -1);
    }

    private static CallSite thj_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -601113873;
            n3 = Integer.rotateLeft(n3 * 1533581149, 22) ^ 0x5DBA3DFF;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 19);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 15);
            int n4 = n3 ^ 0xBC9A9D5;
            if ((n4 ^ n3) != 197765589) {
                int cfr_ignored_0 = (0xD7E2133A ^ n3) - 1814209292;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ khthk ^ string.hashCode() ^ n2 + nth + i * -500795811) + khthk) ^ nth));
            }
            String[] stringArray = bght_2.tqsh_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType3) : lookup.findVirtual(clazz, stringArray[3], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] zyuh46nulp(String string) {
        return string.split("\u0001\u000e", -1);
    }

    private static CallSite d227fimoy2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ oh37vwqh86x ^ string.hashCode() ^ n2 + gzk7yxfytgkt ^ i * -1718276591 ^ oh37vwqh86x, 8) ^ gzk7yxfytgkt));
            }
            String[] stringArray = bght_2.zyuh46nulp(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

