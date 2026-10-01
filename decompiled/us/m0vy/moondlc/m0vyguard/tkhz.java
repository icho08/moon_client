/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tkhz {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int wo1j6fcq3f3ke;

    private tkhz() {
    }

    public static int hha(int n) {
        int n2 = Integer.rotateRight(n * 1715328041 - System.identityHashCode(tkhz.class), 15);
        int n3 = (n2 ^ n2 >>> 15) * 475398105;
        int n4 = (n3 ^ n3 >>> 16) * -1520266011;
        return n4 ^ n4 >>> 13;
    }

    public static int hat_4(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 4);
        int n4 = (n3 ^ n3 >>> 17) * 1418371599;
        int n5 = (n4 ^ n4 >>> 14) * -123121769;
        return n5 ^ n5 >>> 22;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

