/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bshy {
    private static final int hyw = -1043253471;
    private static final int dhbq = 1533823684;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int d6n67i0716ahb8;

    private bshy() {
    }

    public static int rkhz(int n) {
        int n2 = (n ^ hyw ^ bshy.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 13) * -1784266149;
        int n4 = (n3 ^ n3 >>> 7) * -1695988777;
        return n4 ^ n4 >>> 15;
    }

    public static int tthn(int n, int n2) {
        int n3 = n2 - n ^ 0x6EEB0673 ^ dhbq;
        int n4 = (n3 ^ n3 >>> 9) * 1485988431;
        int n5 = (n4 ^ n4 >>> 15) * -460041171;
        return n5 ^ n5 >>> 17;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

