/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zd_2 {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ti93jt9kjeohmj;

    private zd_2() {
    }

    private static int shkha_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 15) * -667976227;
        int n4 = (n3 ^ n3 >>> 10) * 1284645055;
        return n4 ^ n4 >>> 24;
    }

    public static int dhmb(int n) {
        return zd_2.shkha_2(Integer.rotateRight(n * 1165411453 - System.identityHashCode(zd_2.class), 26));
    }

    public static int fkh(int n, int n2) {
        return zd_2.shkha_2(Integer.rotateLeft(n ^ n2, 6) * 565143429);
    }

    public static boolean bkhth(int n, int n2) {
        return ((zd_2.fkh(n, n2) + Thread.currentThread().hashCode()) * 587820987 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

