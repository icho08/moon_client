/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class rt {
    private static final int zkhdh = 2081304629;
    private static final int rzth = 1007349168;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int bwzdw5k9wf0m;

    private rt() {
    }

    public static int dkr_2(int n) {
        int n2 = n ^ zkhdh ^ System.identityHashCode(rt.class) ^ (int)Thread.currentThread().getId() * -174072441;
        int n3 = (n2 ^ n2 >>> 17) * 860713555;
        int n4 = (n3 ^ n3 >>> 15) * 27961117;
        return n4 ^ n4 >>> 18;
    }

    public static int tkhkh(int n, int n2) {
        int n3 = Integer.rotateRight(n * 100336509 ^ n2, 5) ^ rzth;
        int n4 = (n3 ^ n3 >>> 8) * 1774946045;
        int n5 = (n4 ^ n4 >>> 15) * -1506254841;
        return n5 ^ n5 >>> 21;
    }

    public static boolean rhd_2(int n, int n2) {
        return ((rt.tkhkh(n, n2) ^ (int)System.nanoTime()) * -288033765 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

