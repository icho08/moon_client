/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bakh {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int sp97557vy7ct6;

    private bakh() {
    }

    public static int bdh_5(int n) {
        int n2 = n ^ System.identityHashCode(bakh.class) ^ (int)Thread.currentThread().getId() * -865329703;
        int n3 = (n2 ^ n2 >>> 14) * -686891015;
        int n4 = (n3 ^ n3 >>> 8) * -1603105831;
        return n4 ^ n4 >>> 21;
    }

    public static int bts_3(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0xE);
        int n4 = (n3 ^ n3 >>> 8) * 1412225547;
        int n5 = (n4 ^ n4 >>> 12) * 1471946351;
        return n5 ^ n5 >>> 23;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

