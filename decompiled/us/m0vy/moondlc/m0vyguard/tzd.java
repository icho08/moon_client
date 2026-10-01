/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tzd {
    private static final int tsk = 934946790;
    private static final int zkw = -1794646343;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int a54gqkrzq;

    private tzd() {
    }

    public static int zqkh_2(int n) {
        int n2 = Integer.rotateRight(n * -129638323 - System.identityHashCode(tzd.class), 22) ^ tsk;
        int n3 = (n2 ^ n2 >>> 18) * -890622981;
        int n4 = (n3 ^ n3 >>> 13) * -232948247;
        return n4 ^ n4 >>> 17 ^ zkw;
    }

    public static int zjd_4(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 13)) + zkw ^ tsk;
        int n4 = (n3 ^ n3 >>> 10) * -168048167;
        int n5 = (n4 ^ n4 >>> 18) * 1887703883;
        return n5 ^ n5 >>> 22 ^ zkw;
    }

    public static boolean ththn(int n, int n2) {
        return ((tzd.zjd_4(n, n2) + Thread.currentThread().hashCode()) * 1555780421 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

