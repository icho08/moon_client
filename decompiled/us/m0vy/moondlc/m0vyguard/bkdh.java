/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bkdh {
    private static final int tkz_2 = 1742584114;
    private static final int san = -942238729;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int wl00v4cyu;

    private bkdh() {
    }

    public static int shadh_2(int n) {
        int n2 = n ^ System.identityHashCode(bkdh.class) ^ (int)Thread.currentThread().getId() * 1685143607 ^ tkz_2;
        int n3 = (n2 ^ n2 >>> 12) * 1027668353;
        int n4 = (n3 ^ n3 >>> 15) * 1645380235;
        return n4 ^ n4 >>> 17 ^ san;
    }

    public static int tms(int n, int n2) {
        int n3 = Integer.rotateRight(n * 838580627 ^ n2, 18) + san ^ tkz_2;
        int n4 = (n3 ^ n3 >>> 10) * 737249983;
        int n5 = (n4 ^ n4 >>> 11) * -1913036401;
        return n5 ^ n5 >>> 18 ^ san;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

