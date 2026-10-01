/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdhh_2 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int sbjgm9ptg6l3s;

    private bdhh_2() {
    }

    public static int zra_2(int n) {
        int n2 = (n ^ bdhh_2.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 13) * -1939326813;
        int n4 = (n3 ^ n3 >>> 12) * -399127075;
        return n4 ^ n4 >>> 21;
    }

    public static int zqgh_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0xE);
        int n4 = (n3 ^ n3 >>> 10) * 2006441957;
        int n5 = (n4 ^ n4 >>> 9) * -494994611;
        return n5 ^ n5 >>> 20;
    }

    public static boolean tyz_4(int n, int n2) {
        return ((bdhh_2.zqgh_2(n, n2) ^ (int)System.nanoTime()) * 1022425157 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

