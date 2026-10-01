/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bdh;
import us.m0vy.moondlc.m0vyguard.yf;

public abstract class bal_2 {
    public static final int dshy = 500;
    public static final int khqr = 500;
    public static final int rkh_3 = 1000;
    public static final int sdt_6 = 1000;
    public static final int shjb = 1000;
    public static final int thwz_2 = 10000;
    public static final int fth = 5000;
    public static final int dhgh_3 = 5000;
    public static final char[] dhas_2;
    private final int dddh_2;
    private final boolean dhd_6;
    private final String da_3;
    private final int skht_4;
    private static final int sc3gpr2gg = 1617201659;
    private static final int ljmxvohp = 1306841073;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int jbg4npwnhk;

    public bal_2(String string, int n, boolean bl, int n2) {
        this.dddh_2 = n;
        this.dhd_6 = bl;
        this.da_3 = string;
        this.skht_4 = n2;
    }

    public static boolean khrj(char c) {
        try {
            int n = 1845439816;
            n = Integer.rotateLeft(n * -416190977, 14) ^ 0x14A03B87;
            n = c ^ n;
            int n2 = n ^ 0x5189BDEA;
            if ((n2 ^ n) != 1367981546) {
                int cfr_ignored_0 = (0x3C7690A2 ^ n) + -1464262272;
            }
            if ((0x279 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        for (char c2 : dhas_2) {
            if (c != c2) continue;
            int n = 1;
            if (yf.tdhth_2() == 0) {
                n = n ^ 0x2E1B;
            }
            return n != 0;
        }
        return false;
    }

    public boolean shsh_4() {
        block0: {
            int n = bdh.abk(380181121);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 15);
            int n2 = n ^ 0x996557;
            if ((n2 ^ n) == 10052951) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x16307FD6 ^ n, 5) - -1271064027) * 372277207;
        }
        return this.dhd_6;
    }

    public int ty() {
        block0: {
            int n = 1828066256;
            n = Integer.rotateLeft(n * 149095191, 25) ^ 0x295AAE20;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xE7F0B1D5;
            if ((n2 ^ n) == -403656235) break block0;
            int cfr_ignored_0 = (0x8B06A205 ^ n) + -767322231;
        }
        return this.skht_4;
    }

    public abstract double sd_3(double ... var1);

    public String dhsh_7() {
        block0: {
            int n = 1236891616;
            n = Integer.rotateLeft(n * -606951207, 15) ^ 0xBC4066C;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 8);
            int n2 = n ^ 0x71E7ABE1;
            if ((n2 ^ n) == 1911008225) break block0;
            int cfr_ignored_0 = (0x385EDC01 ^ n) + 2037575148;
        }
        return this.da_3;
    }

    public int zbn_2() {
        block0: {
            int n = 1299650914;
            n = Integer.rotateLeft(n * 608092335, 6) ^ 0xD9C321AB;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 3);
            int n2 = n ^ 0x7E32213B;
            if ((n2 ^ n) == 2117214523) break block0;
            int cfr_ignored_0 = (0x33453859 ^ n) - -303526649;
        }
        return this.dddh_2;
    }

    private static String[] fb63i4rv878ob(String string) {
        return string.split("\u0002\u0010", -1);
    }

    private static CallSite m84vayfg6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ sc3gpr2gg ^ string.hashCode()) + (n2 + ljmxvohp) + i ^ sc3gpr2gg, 20) + ljmxvohp);
            }
            String[] stringArray = bal_2.fb63i4rv878ob(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
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

