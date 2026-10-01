/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.shh_5;
import us.m0vy.moondlc.m0vyguard.yf;

public abstract class zk {
    public static final int ht_3 = 500;
    public static final int bnl = 500;
    public static final int sdd_5 = 1000;
    public static final int shak_2 = 1000;
    public static final int bnz = 1000;
    public static final int shrt = 10000;
    public static final int hat = 5000;
    public static final int jthgh = 5000;
    public static final char[] jaw_2;
    private final int shnw;
    private final boolean hba_2;
    private final String thas_3;
    private final int dhhw_2;
    private static final int uzp8bpnwqqbpi = -1438886564;
    private static final int dkocn17b3ug = -2121548873;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int vqsoruk3ict7ro;

    public zk(String string, int n, boolean bl, int n2) {
        this.shnw = n;
        this.hba_2 = bl;
        this.thas_3 = string;
        this.dhhw_2 = n2;
    }

    public static boolean thdn(char c) {
        try {
            int n = 1486665132;
            n = Integer.rotateLeft(n * -27110367, 3) ^ 0xED0784A9;
            n = c ^ n;
            int n2 = n ^ 0x6AFBD8CB;
            if ((n2 ^ n) != 1794889931) {
                int cfr_ignored_0 = (0x32676D67 ^ n) + 409495993;
            }
            if ((0x229 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            zk.shn_5();
            throw null;
        }
        for (char c2 : jaw_2) {
            if (c != c2) continue;
            return true;
        }
        return false;
    }

    public boolean thfl() {
        block0: {
            int n = shh_5.saa(-769925067);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xFE65339D;
            if ((n2 ^ n) == -26922083) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x2C7ED3A8 ^ n, 8) + 1740193939;
        }
        return this.hba_2;
    }

    public int jthf() {
        block0: {
            int n = 1145433497;
            n = Integer.rotateLeft(n * 734161431, 13) ^ 0x1CD536B9;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x546D73A5;
            if ((n2 ^ n) == 1416459173) break block0;
            int cfr_ignored_0 = (0x10289E3C ^ n) + -1525604734;
        }
        return this.dhhw_2;
    }

    public abstract double baz_2(double ... var1);

    public String rsw() {
        block0: {
            int n = -1371916051;
            n = Integer.rotateLeft(n * -1161531987, 25) ^ 0xA32E15BA;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x533B7469;
            if ((n2 ^ n) == 1396405353) break block0;
            int cfr_ignored_0 = (0xFD014C84 ^ n) - 1642550230;
        }
        return this.thas_3;
    }

    public int tss() {
        block0: {
            int n = 1303963046;
            int n2 = (n = Integer.rotateLeft(n * -721213797, 22) ^ 0x8E74F172) ^ 0xBEABF613;
            if ((n2 ^ n) == -1096026605) break block0;
            int cfr_ignored_0 = (0xF31313B5 ^ n) + 459242076;
        }
        return this.shnw;
    }

    private static void shn_5() {
        int n = shh_5.saa(984984277);
        int n2 = n ^ 0xBCA22E98;
        if ((n2 ^ n) != -1130221928) {
            int cfr_ignored_0 = Integer.rotateLeft(0x8617844D ^ n, 3) - 1094100110;
            int cfr_ignored_1 = (int)(0x44A52A7027D4EB4FL ^ (long)n ^ 0xA990831A2DB9249BL);
        }
        yf.athz_2();
    }

    private static String[] hd9c1xl0y(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite gnc30m3s3a3ufv(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ uzp8bpnwqqbpi ^ string.hashCode()) + (n2 + dkocn17b3ug) + i ^ uzp8bpnwqqbpi, 10) + dkocn17b3ug);
            }
            String[] stringArray = zk.hd9c1xl0y(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

