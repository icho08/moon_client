/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdhs {
    private static final int hy_2 = 115917149;
    private static final int jkhb = -350012041;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int p4cwmqfu2b;

    private bdhs() {
    }

    private static int sdhb(int n) {
        int n2 = n ^ hy_2;
        int n3 = (n2 ^ n2 >>> 11) * -182899971;
        int n4 = (n3 ^ n3 >>> 17) * -677295015;
        return (n4 ^ n4 >>> 11) + jkhb;
    }

    public static int js_2(int n) {
        return bdhs.sdhb(Integer.rotateRight(n * 1197341071 - System.identityHashCode(bdhs.class), 6) ^ hy_2);
    }

    public static int khmb(int n, int n2) {
        return bdhs.sdhb((n2 - n ^ 0x5143D366) + jkhb ^ hy_2);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

