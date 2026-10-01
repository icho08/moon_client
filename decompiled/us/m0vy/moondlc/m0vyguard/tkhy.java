/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tkhy {
    private static final int shdgh_2 = -1129271631;
    private static final int tldh = -574299356;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int gnmb1end3d;

    private tkhy() {
    }

    public static int shas_2(int n) {
        int n2 = Integer.rotateRight((n ^ shdgh_2) * 738645381 - System.identityHashCode(tkhy.class), 24);
        int n3 = (n2 ^ n2 >>> 14) * 1475372589;
        int n4 = (n3 ^ n3 >>> 9) * 1763735519;
        return n4 ^ n4 >>> 13;
    }

    public static int sdn(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 5) * -1802345669 ^ tldh;
        int n4 = (n3 ^ n3 >>> 9) * -173218533;
        int n5 = (n4 ^ n4 >>> 12) * -921059855;
        return n5 ^ n5 >>> 22;
    }

    public static boolean tdh_4(int n, int n2) {
        return ((tkhy.sdn(n, n2) + Thread.currentThread().hashCode()) * -340922919 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

