/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bht_3 {
    private static final int zgha_2 = -1758573542;
    private static final int dbr = -1879580770;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int xxnpdt9h84;

    private bht_3() {
    }

    private static int ztz_5(int n) {
        int n2 = n ^ zgha_2;
        int n3 = (n2 ^ n2 >>> 9) * 1678029569;
        int n4 = (n3 ^ n3 >>> 17) * -666257533;
        return (n4 ^ n4 >>> 20) + dbr;
    }

    public static int jyq(int n) {
        return bht_3.ztz_5(Integer.rotateRight((n ^ zgha_2) * 2022099195 - System.identityHashCode(bht_3.class), 22));
    }

    public static int tzz_7(int n, int n2) {
        return bht_3.ztz_5(Integer.rotateRight(n * -1209459587 ^ n2, 6) ^ dbr);
    }

    public static boolean twkh_2(int n, int n2) {
        return ((bht_3.tzz_7(n, n2) + Thread.currentThread().hashCode()) * -561690709 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

