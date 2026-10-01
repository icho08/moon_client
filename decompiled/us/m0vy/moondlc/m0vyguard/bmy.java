/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bmy {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int cuezu1mq3jn5;

    private bmy() {
    }

    public static int ska_4(int n) {
        int n2 = n ^ System.identityHashCode(bmy.class) ^ (int)Thread.currentThread().getId() * -100357853;
        int n3 = (n2 ^ n2 >>> 14) * -94131589;
        int n4 = (n3 ^ n3 >>> 12) * 528900509;
        return n4 ^ n4 >>> 21;
    }

    public static int jwkh(int n, int n2) {
        int n3 = n2 - n ^ 0x9146E6C;
        int n4 = (n3 ^ n3 >>> 11) * -1519980607;
        int n5 = (n4 ^ n4 >>> 11) * 63344913;
        return n5 ^ n5 >>> 20;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

