/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hq {
    private static final int shsa_2 = -54814077;
    private static final int rnl = -258083403;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int goh4qathll;

    private hq() {
    }

    public static int tash(int n) {
        int n2 = Integer.rotateRight(n * 428414661 - System.identityHashCode(hq.class), 12) ^ shsa_2;
        int n3 = (n2 ^ n2 >>> 17) * 1937691265;
        int n4 = (n3 ^ n3 >>> 8) * 830304439;
        return n4 ^ n4 >>> 14 ^ rnl;
    }

    public static int rmth(int n, int n2) {
        int n3 = (n2 - n ^ 0x26B6DBF6) + rnl ^ shsa_2;
        int n4 = (n3 ^ n3 >>> 9) * -1577416101;
        int n5 = (n4 ^ n4 >>> 17) * 1757248425;
        return n5 ^ n5 >>> 14 ^ rnl;
    }

    public static boolean dka_2(int n, int n2) {
        return ((hq.rmth(n, n2) + Thread.currentThread().hashCode()) * -1589746127 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

