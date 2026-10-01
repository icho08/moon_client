/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btl {
    private static final int thns_2 = 458298021;
    private static final int shaz = 1829822460;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int z42jm6r2eu;

    private btl() {
    }

    public static int tdq_3(int n) {
        int n2 = Integer.rotateLeft(n ^ thns_2 ^ (int)System.nanoTime(), 22) * 1707250701;
        int n3 = (n2 ^ n2 >>> 16) * -68881035;
        int n4 = (n3 ^ n3 >>> 9) * -1473463381;
        return n4 ^ n4 >>> 19;
    }

    public static int zsh_7(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 3) ^ shaz;
        int n4 = (n3 ^ n3 >>> 14) * 1033508847;
        int n5 = (n4 ^ n4 >>> 13) * -1097611355;
        return n5 ^ n5 >>> 18;
    }

    public static boolean khfsh(int n, int n2) {
        return ((btl.zsh_7(n, n2) + Thread.currentThread().hashCode()) * -1808696245 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

