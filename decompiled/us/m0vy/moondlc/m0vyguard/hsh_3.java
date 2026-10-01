/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hsh_3 {
    private static final int dzr = 769663105;
    private static final int thght = 1532052926;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int vqo0si5vjzn8q;

    private hsh_3() {
    }

    public static int rqsh(int n) {
        int n2 = Integer.rotateRight(n * -1374735257 - System.identityHashCode(hsh_3.class), 7) ^ dzr;
        int n3 = (n2 ^ n2 >>> 14) * -840191853;
        int n4 = (n3 ^ n3 >>> 13) * -603330253;
        return n4 ^ n4 >>> 13 ^ thght;
    }

    public static int shwb(int n, int n2) {
        int n3 = (n2 - n ^ 0xCF43145B) + thght ^ dzr;
        int n4 = (n3 ^ n3 >>> 12) * 304732979;
        int n5 = (n4 ^ n4 >>> 17) * 1733085285;
        return n5 ^ n5 >>> 12 ^ thght;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

