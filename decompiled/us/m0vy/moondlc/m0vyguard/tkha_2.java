/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tkha_2 {
    private static final int khgh = 198051805;
    private static final int djy = 1136688475;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int m0v5qv46r9g;

    private tkha_2() {
    }

    public static int khna(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 5) * 2049542791 ^ khgh;
        int n3 = (n2 ^ n2 >>> 14) * 1436130061;
        int n4 = (n3 ^ n3 >>> 12) * -283382271;
        return n4 ^ n4 >>> 21 ^ djy;
    }

    public static int shta_3(int n, int n2) {
        int n3 = (n2 ^ Integer.rotateLeft(n, n2 & 0xE)) + djy ^ khgh;
        int n4 = (n3 ^ n3 >>> 15) * 1468342387;
        int n5 = (n4 ^ n4 >>> 13) * 1477624917;
        return n5 ^ n5 >>> 23 ^ djy;
    }

    public static boolean khtd_2(int n, int n2) {
        return ((tkha_2.shta_3(n, n2) + Thread.currentThread().hashCode()) * -1322016119 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

