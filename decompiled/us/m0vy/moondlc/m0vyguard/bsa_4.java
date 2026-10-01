/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bsa_4 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int rcdja3ufz61;

    private bsa_4() {
    }

    public static int zzth_3(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 14) * -370989795;
        int n3 = (n2 ^ n2 >>> 17) * -1357067521;
        int n4 = (n3 ^ n3 >>> 8) * 548972541;
        return n4 ^ n4 >>> 16;
    }

    public static int zhkh_4(int n, int n2) {
        int n3 = Integer.rotateRight(n * 640605319 ^ n2, 7);
        int n4 = (n3 ^ n3 >>> 9) * -1590564481;
        int n5 = (n4 ^ n4 >>> 18) * 1611404917;
        return n5 ^ n5 >>> 21;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

