/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bwz_2 {
    private static final int tjt_2 = -348607246;
    private static final int jwdh = 1722491117;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int urru2xm5xuspn1;

    private bwz_2() {
    }

    public static int rdgh(int n) {
        int n2 = Integer.rotateRight(n * -115213961 - System.identityHashCode(bwz_2.class), 25) ^ tjt_2;
        int n3 = (n2 ^ n2 >>> 15) * -412641195;
        int n4 = (n3 ^ n3 >>> 10) * 527079531;
        return n4 ^ n4 >>> 20 ^ jwdh;
    }

    public static int try_2(int n, int n2) {
        int n3 = (n2 - n ^ 0x65537ED3) + jwdh ^ tjt_2;
        int n4 = (n3 ^ n3 >>> 10) * -1460443175;
        int n5 = (n4 ^ n4 >>> 18) * 1191318481;
        return n5 ^ n5 >>> 22 ^ jwdh;
    }

    public static boolean thtn_2(int n, int n2) {
        return ((bwz_2.try_2(n, n2) + Thread.currentThread().hashCode()) * -1017695691 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

