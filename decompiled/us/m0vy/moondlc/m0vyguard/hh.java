/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hh {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int i0qdhjm3thcar;

    private hh() {
    }

    public static int ztt_8(int n) {
        int n2 = (n ^ hh.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 13) * 1955790245;
        int n4 = (n3 ^ n3 >>> 13) * 1952412783;
        return n4 ^ n4 >>> 15;
    }

    public static int tfd_3(int n, int n2) {
        int n3 = Integer.rotateRight(n * -1821688851 ^ n2, 8);
        int n4 = (n3 ^ n3 >>> 11) * -2061035977;
        int n5 = (n4 ^ n4 >>> 11) * -1372180709;
        return n5 ^ n5 >>> 15;
    }

    public static boolean khssh(int n, int n2) {
        return ((hh.tfd_3(n, n2) ^ (int)System.nanoTime()) * -1421067013 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

