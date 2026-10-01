/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bhd_2 {
    private static final int dhkh = -1281238155;
    private static final int skhy = 1528858742;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int v26aq8327cn7ep;

    private bhd_2() {
    }

    public static int shwm(int n) {
        int n2 = (n ^ dhkh ^ bhd_2.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 14) * -716599025;
        int n4 = (n3 ^ n3 >>> 7) * 130598333;
        return n4 ^ n4 >>> 17;
    }

    public static int jar_2(int n, int n2) {
        int n3 = n2 - n ^ 0xD9E566CC ^ skhy;
        int n4 = (n3 ^ n3 >>> 9) * 1053185789;
        int n5 = (n4 ^ n4 >>> 15) * 473485467;
        return n5 ^ n5 >>> 20;
    }

    public static boolean sadh_3(int n, int n2) {
        return ((bhd_2.jar_2(n, n2) ^ (int)System.nanoTime()) * -2099268381 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

