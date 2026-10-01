/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class lh {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int fdj5mdydns2pso;

    private lh() {
    }

    public static int dkhdh(int n) {
        int n2 = Integer.rotateRight(n * 1099041773 - System.identityHashCode(lh.class), 24);
        int n3 = (n2 ^ n2 >>> 16) * 2147178317;
        int n4 = (n3 ^ n3 >>> 13) * -742927309;
        return n4 ^ n4 >>> 18;
    }

    public static int khls(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 4);
        int n4 = (n3 ^ n3 >>> 12) * 1592446417;
        int n5 = (n4 ^ n4 >>> 12) * -1727100387;
        return n5 ^ n5 >>> 15;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

