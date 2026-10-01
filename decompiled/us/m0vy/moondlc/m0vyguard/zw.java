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
import us.m0vy.moondlc.m0vyguard.bthj;
import us.m0vy.moondlc.m0vyguard.bay_2;
import us.m0vy.moondlc.m0vyguard.yf;

public final class zw {
    private static bay_2 hsz_2;
    private static bay_2 htm;
    private static final int lkh = 1952082991;
    private static final int tjh_2 = -440461186;
    private static final int hwh_2 = -1648375533;
    private static final int tnsh = 1508479800;
    private static final int fixmgvkjl = 1791493271;
    private static final int lw0hs56wkujx8 = -1423264707;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ffawacg4;

    public static void hdhth(bay_2 bay2) {
        int n = 2114921287;
        n = Integer.rotateLeft(n * 2027889347, 8) ^ 0xEA14358C;
        bay_2 bay3 = bay2;
        n = (bay3 != null ? System.identityHashCode((Object)bay3) : 0) ^ n;
        int n2 = n ^ 0x23D3C18C;
        if ((n2 ^ n) != 601080204) {
            int cfr_ignored_0 = (0x5DDCE2CB ^ n) + -81674922;
        }
        hsz_2 = bay2;
    }

    @Generated
    private zw() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    @Generated
    public static bay_2 sda_5() {
        block0: {
            int n = bthj.zta_7(-4710272);
            int n2 = n ^ 0x5E580ED0;
            if ((n2 ^ n) == 1582829264) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xA1E02E50 ^ n, 7) + -1635566869) * -1579143599;
        }
        return hsz_2;
    }

    @Generated
    public static bay_2 ttw_4() {
        block0: {
            int n = -1952534944;
            int n2 = (n = Integer.rotateLeft(n * -565189439, 12) ^ 0xE55B20B1) ^ 0x908FC24F;
            if ((n2 ^ n) == -1869626801) break block0;
            int cfr_ignored_0 = (0x1B116C2F ^ n) - 500032192;
        }
        return htm;
    }

    @Generated
    public static void dst_5(bay_2 bay2) {
        int n = 81826322;
        int n2 = (n = Integer.rotateLeft(n * -1010273723, 28) ^ 0x81A5ECE) ^ 0x89F74453;
        if ((n2 ^ n) != -1980283821) {
            int cfr_ignored_0 = (0x8D17D641 ^ n) - -1809420499;
        }
        htm = bay2;
    }

    private static String dhmz_2(String string, int n, int n2, int n3) {
        try {
            int n4 = 1933714536;
            n4 = Integer.rotateLeft(n4 * -203042305, 13) ^ 0xC5C3AB82;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 22);
            n4 = n2 ^ n4;
            int n5 = n4 ^ 0x644AE4B9;
            if ((n5 ^ n4) != 1682629817) {
                int cfr_ignored_0 = (0x1708C0D1 ^ n4) - -52501318;
            }
            if ((0x2B7 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x509746CB) + lkh ^ Integer.reverse(n2 + i * 652934333), 8) - tjh_2);
        }
        return new String(cArray);
    }

    private static String[] dhrz_2(String string) {
        block0: {
            int n = -1010378972;
            n = Integer.rotateLeft(n * -724623899, 28) ^ 0x687B5A87;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 8);
            int n2 = n ^ 0x825C6229;
            if ((n2 ^ n) == -2107874775) break block0;
            int cfr_ignored_0 = (0x419AB50D ^ n) + -51571011;
        }
        return string.split("\u0006\u0011", -1);
    }

    private static CallSite dkht_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -2054452175;
            n3 = Integer.rotateLeft(n3 * -254981835, 10) ^ 0x8284DF72;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x322B0645;
            if ((n4 ^ n3) != 841680453) {
                int cfr_ignored_0 = (0xB7A08A74 ^ n3) - 59850667;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ hwh_2 ^ string.hashCode() ^ n2 + tnsh ^ i * 1496991491 ^ hwh_2, 7) ^ tnsh));
            }
            String[] stringArray = zw.dhrz_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] pkialc8rc(String string) {
        return string.split("\u0004\u0015", -1);
    }

    private static CallSite vrwkmz5l3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ fixmgvkjl ^ string.hashCode() ^ n2 + lw0hs56wkujx8 + i * -647190335) + fixmgvkjl) ^ lw0hs56wkujx8));
            }
            String[] stringArray = zw.pkialc8rc(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

