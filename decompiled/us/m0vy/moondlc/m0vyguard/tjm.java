/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tjm {
    private static final int khthkh = 1672284646;
    private static final int jat_3 = -825204027;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int dwj3fqt7;

    private tjm() {
    }

    private static int ghdh_3(int n) {
        int n2 = n ^ khthkh;
        int n3 = (n2 ^ n2 >>> 15) * -1402388261;
        int n4 = (n3 ^ n3 >>> 19) * -1279329465;
        return (n4 ^ n4 >>> 16) + jat_3;
    }

    public static int khdhz(int n) {
        return tjm.ghdh_3(n ^ khthkh ^ System.identityHashCode(tjm.class) ^ (int)Thread.currentThread().getId() * -1007461837);
    }

    public static int jsz(int n, int n2) {
        return tjm.ghdh_3(n2 - n ^ 0xA92723DB ^ jat_3);
    }

    public static boolean zta_2(int n, int n2) {
        return ((tjm.jsz(n, n2) ^ (int)System.nanoTime()) * -1349508951 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

