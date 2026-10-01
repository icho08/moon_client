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
import us.m0vy.moondlc.m0vyguard.bzj;
import us.m0vy.moondlc.m0vyguard.blb;

public final class khw {
    public static final bzj zdt_2;
    public static final bzj hml;
    public static final bzj sbkh_2;
    public static final bzj hthn;
    public static final bzj thzgh_2;
    public static final bzj sah_2;
    public static final bzj zzgh_2;
    public static final bzj dhfs;
    public static final bzj ghs;
    public static final bzj zkhw;
    public static final bzj zhd;
    public static final bzj dah;
    public static final bzj shal;
    public static final bzj jls;
    private static final int thwb = -1653081492;
    private static final int hsz = -1406372634;
    private static final int hds = -1987801912;
    private static final int khkha = -1154725359;
    private static final int apvr6zz3 = -1040834427;
    private static final int lgplzhcsvm = -1418960841;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ymunuix0xi;

    @Generated
    private khw() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String dsm(String string, int n, int n2, int n3) {
        int n4 = blb.tthz_3(-2087533324);
        n4 = Integer.rotateRight(n ^ n4, 16);
        int n5 = (n4 = n3 ^ n4) ^ 0xDA9D4C3A;
        if ((n5 ^ n4) != -627225542) {
            int cfr_ignored_0 = Integer.rotateRight(0x590F88CE ^ n4, 14) - -851496915;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0xCB13AC0A) + thwb ^ Integer.reverse(n2 + i * -1568890049), 7) - hsz);
        }
        return new String(cArray);
    }

    private static String[] dkd(String string) {
        int n = -687540574;
        int n2 = (n = Integer.rotateLeft(n * 1853329309, 21) ^ 0xFCEBF10C) ^ 0xEDC1B04E;
        if ((n2 ^ n) != -306073522) {
            int cfr_ignored_0 = (0x3AC546EC ^ n) + -602337334;
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite ghdm(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 986957158;
            n3 = Integer.rotateLeft(n3 * 1056629557, 18) ^ 0x55692D4F;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 22);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 11);
            int n4 = n3 ^ 0xC28B09D9;
            if ((n4 ^ n3) != -1031075367) {
                int cfr_ignored_0 = (0xF858CCBF ^ n3) - -1651629180;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ hds ^ string.hashCode() ^ n2 + khkha + i * 32180537) + hds) ^ khkha));
            }
            String[] stringArray = khw.dkd(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType3) : lookup.findVirtual(clazz, stringArray[0], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] aeu8w3sq(String string) {
        return string.split("\u0005\u0015", -1);
    }

    private static CallSite uz9utdbtru(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ apvr6zz3 ^ string.hashCode() ^ n2 + lgplzhcsvm ^ i * 197074501 ^ apvr6zz3, 10) ^ lgplzhcsvm));
            }
            String[] stringArray = khw.aeu8w3sq(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

