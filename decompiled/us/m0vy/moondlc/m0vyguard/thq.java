/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class thq {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int v2r8zvjgygr;

    private thq() {
    }

    public static int stl_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 8) * 1621384985;
        int n3 = (n2 ^ n2 >>> 15) * 79562795;
        int n4 = (n3 ^ n3 >>> 7) * 16453603;
        return n4 ^ n4 >>> 14;
    }

    public static int hhr_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * -1645185905 ^ n2, 5);
        int n4 = (n3 ^ n3 >>> 9) * -1415008145;
        int n5 = (n4 ^ n4 >>> 16) * 1357701061;
        return n5 ^ n5 >>> 14;
    }

    public static boolean dhd(int n, int n2) {
        return ((thq.hhr_2(n, n2) + Thread.currentThread().hashCode()) * -439214949 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

