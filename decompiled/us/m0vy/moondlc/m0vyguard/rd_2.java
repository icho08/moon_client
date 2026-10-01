/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class rd_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int vtzyeglcrczf;

    private rd_2() {
    }

    public static int athw(int n) {
        int n2 = n ^ System.identityHashCode(rd_2.class) ^ (int)Thread.currentThread().getId() * 1019394483;
        int n3 = (n2 ^ n2 >>> 18) * -551536987;
        int n4 = (n3 ^ n3 >>> 8) * -1952303101;
        return n4 ^ n4 >>> 14;
    }

    public static int ghthr(int n, int n2) {
        int n3 = n2 - n ^ 0x57F03BF8;
        int n4 = (n3 ^ n3 >>> 17) * -909684121;
        int n5 = (n4 ^ n4 >>> 13) * 742727721;
        return n5 ^ n5 >>> 18;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

