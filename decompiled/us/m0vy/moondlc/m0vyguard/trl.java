/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class trl {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int kzhewpbj;

    private trl() {
    }

    private static int hzkh(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 12) * 756120305;
        int n4 = (n3 ^ n3 >>> 18) * 1554749225;
        return n4 ^ n4 >>> 13;
    }

    public static int athq(int n) {
        return trl.hzkh(n ^ System.identityHashCode(trl.class) ^ (int)Thread.currentThread().getId() * -472933691);
    }

    public static int thby(int n, int n2) {
        return trl.hzkh(n2 ^ Integer.rotateLeft(n, n2 & 9));
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

