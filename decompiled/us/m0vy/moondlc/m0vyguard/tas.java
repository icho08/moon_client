/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tas {
    private static final int shth_5 = -1203770698;
    private static final int bty_2 = 880894481;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int gisr9xcgfiyv;

    private tas() {
    }

    public static int dsr_2(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 6) * 1577891205 ^ shth_5;
        int n3 = (n2 ^ n2 >>> 15) * 885459887;
        int n4 = (n3 ^ n3 >>> 16) * -815472539;
        return n4 ^ n4 >>> 15 ^ bty_2;
    }

    public static int tam_4(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0x11)) + bty_2 ^ shth_5;
        int n4 = (n3 ^ n3 >>> 9) * 1128725165;
        int n5 = (n4 ^ n4 >>> 11) * 1212524071;
        return n5 ^ n5 >>> 19 ^ bty_2;
    }

    public static boolean hghm(int n, int n2) {
        return ((tas.tam_4(n, n2) + Thread.currentThread().hashCode()) * -569133451 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

