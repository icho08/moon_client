/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tdsh {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int l3h9zhwufe;

    private tdsh() {
    }

    public static int zshq_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 10) * 200069657;
        int n3 = (n2 ^ n2 >>> 13) * -2109168075;
        int n4 = (n3 ^ n3 >>> 8) * 2137101229;
        return n4 ^ n4 >>> 13;
    }

    public static int rdw_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 8) * -371426153;
        int n4 = (n3 ^ n3 >>> 13) * 1284860471;
        int n5 = (n4 ^ n4 >>> 11) * -1409682831;
        return n5 ^ n5 >>> 20;
    }

    public static boolean bwa(int n, int n2) {
        return ((tdsh.rdw_2(n, n2) + Thread.currentThread().hashCode()) * 1235005019 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

