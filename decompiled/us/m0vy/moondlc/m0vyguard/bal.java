/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bal {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int j9az6kopa1k;

    private bal() {
    }

    public static int zzt_5(int n) {
        int n2 = (n ^ bal.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 12) * -522523457;
        int n4 = (n3 ^ n3 >>> 8) * 1905570947;
        return n4 ^ n4 >>> 18;
    }

    public static int dbj(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 8);
        int n4 = (n3 ^ n3 >>> 17) * 316402643;
        int n5 = (n4 ^ n4 >>> 18) * 1997778589;
        return n5 ^ n5 >>> 20;
    }

    public static boolean zbt_2(int n, int n2) {
        return ((bal.dbj(n, n2) ^ (int)System.nanoTime()) * 670035275 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

