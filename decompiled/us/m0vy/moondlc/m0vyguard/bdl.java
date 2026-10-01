/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdl {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int eyybvs7kiassd;

    private bdl() {
    }

    private static int thw_4(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 13) * 111952185;
        int n4 = (n3 ^ n3 >>> 19) * 247489727;
        return n4 ^ n4 >>> 17;
    }

    public static int hghj(int n) {
        return bdl.thw_4(Integer.rotateLeft(n ^ (int)System.nanoTime(), 11) * -1405020771);
    }

    public static int bkkh(int n, int n2) {
        return bdl.thw_4(Integer.rotateRight(n * -519142111 ^ n2, 9));
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

