/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dh {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int rogoc6e0;

    private dh() {
    }

    private static int dkht_3(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 14) * 337598663;
        int n4 = (n3 ^ n3 >>> 18) * 629497301;
        return n4 ^ n4 >>> 23;
    }

    public static int skhz(int n) {
        return dh.dkht_3((n ^ dh.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int jrdh(int n, int n2) {
        return dh.dkht_3(n2 - n ^ 0x6AC9F397);
    }

    public static boolean stf(int n, int n2) {
        return ((dh.jrdh(n, n2) ^ (int)System.nanoTime()) * -1606492775 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

