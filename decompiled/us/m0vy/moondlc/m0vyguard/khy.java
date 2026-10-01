/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class khy {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int sg2trb5olwf9;

    private khy() {
    }

    public static int dhkhkh(int n) {
        int n2 = n ^ System.identityHashCode(khy.class) ^ (int)Thread.currentThread().getId() * 1412260951;
        int n3 = (n2 ^ n2 >>> 14) * 1705541245;
        int n4 = (n3 ^ n3 >>> 7) * 2107799863;
        return n4 ^ n4 >>> 16;
    }

    public static int tbm_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x14);
        int n4 = (n3 ^ n3 >>> 11) * 1566386779;
        int n5 = (n4 ^ n4 >>> 17) * -1430364143;
        return n5 ^ n5 >>> 17;
    }

    public static boolean jth_3(int n, int n2) {
        return ((khy.tbm_2(n, n2) ^ (int)System.nanoTime()) * -67499423 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

