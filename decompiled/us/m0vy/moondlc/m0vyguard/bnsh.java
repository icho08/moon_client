/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;

public final class bnsh
extends Enum {
    public static final /* enum */ bnsh sta;
    public static final /* enum */ bnsh ghn;
    public static final /* enum */ bnsh stb_3;
    private static final bnsh[] zsw_2;
    private static final int shfs = -1269830214;
    private static final int tzsh_2 = -414422845;
    private static final int pdkwsituf = 1451708563;
    private static final int cnvpml913qi4 = -849821015;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";

    public static bnsh[] values() {
        block0: {
            int n = 1274208646;
            int n2 = (n = Integer.rotateLeft(n * -79881249, 18) ^ 0xDBC74028) ^ 0x752818D6;
            if ((n2 ^ n) == 1965562070) break block0;
            int cfr_ignored_0 = (0x3EDAF950 ^ n) + 241539482;
        }
        return (bnsh[])zsw_2.clone();
    }

    public static bnsh valueOf(String string) {
        block0: {
            int n = -2084964478;
            n = Integer.rotateLeft(n * -550705803, 25) ^ 0x7D974C15;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 19);
            int n2 = n ^ 0xC8FFBAD5;
            if ((n2 ^ n) == -922764587) break block0;
            int cfr_ignored_0 = (0x4B464D57 ^ n) + 120495620;
        }
        return Enum.valueOf(bnsh.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bnsh() {
        void var2_-1;
        void var1_-1;
    }

    private static bnsh[] $values() {
        int n = -529311509;
        int n2 = (n = Integer.rotateLeft(n * -1430467707, 8) ^ 0x7DC3BB62) ^ 0x83BF95AA;
        if ((n2 ^ n) != -2084596310) {
            int cfr_ignored_0 = (0x63CCCD41 ^ n) - -267257189;
        }
        return new bnsh[]{sta, ghn, stb_3};
    }

    private static String[] ng9wrp6eracoh(String string) {
        block0: {
            int n = -362142195;
            int n2 = (n = Integer.rotateLeft(n * 1795151845, 4) ^ 0x8AABBE) ^ 0x549ECD27;
            if ((n2 ^ n) == 1419693351) break block0;
            int cfr_ignored_0 = (0xBEF4EB2A ^ n) + -222005429;
        }
        return string.split("\u0002\u001d", -1);
    }

    private static CallSite wvl41mayi8d8eo(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1030181869;
            n3 = Integer.rotateLeft(n3 * 206563805, 12) ^ 0xF6A1ABCF;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 4);
            int n4 = n3 ^ 0x4452CDF7;
            if ((n4 ^ n3) != 1146277367) {
                int cfr_ignored_0 = (0x86CA61E4 ^ n3) + 1456082382;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ shfs ^ string.hashCode() ^ n2 + tzsh_2 + i * -884594269) + shfs) ^ tzsh_2));
            }
            String[] stringArray = bnsh.ng9wrp6eracoh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] i6f3jwsp4(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite zsae3pu7slfnam(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ pdkwsituf ^ string.hashCode() ^ n2 + cnvpml913qi4 ^ i * -1186511481 ^ pdkwsituf, 21) ^ cnvpml913qi4));
            }
            String[] stringArray = bnsh.i6f3jwsp4(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

