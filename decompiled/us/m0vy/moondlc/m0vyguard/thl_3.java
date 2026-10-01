/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class thl_3 {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int k4a0g6hte6sp;

    private thl_3() {
    }

    private static int ddq_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 11) * -1794541733;
        int n4 = (n3 ^ n3 >>> 20) * 452814863;
        return n4 ^ n4 >>> 21;
    }

    public static int thht_3(int n) {
        return thl_3.ddq_2(Integer.rotateRight(n * 1534017145 - System.identityHashCode(thl_3.class), 15));
    }

    public static int bys_2(int n, int n2) {
        return thl_3.ddq_2(Integer.rotateLeft(n ^ n2, 7) * 1951888573);
    }

    public static boolean rtf_2(int n, int n2) {
        return ((thl_3.bys_2(n, n2) + Thread.currentThread().hashCode()) * -1673044751 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

