/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tjd {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int h4eujylje3cw9m;

    private tjd() {
    }

    private static int tsy_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 9) * -35891955;
        int n4 = (n3 ^ n3 >>> 11) * -2063609069;
        return n4 ^ n4 >>> 18;
    }

    public static int dhby(int n) {
        return tjd.tsy_2(Integer.rotateLeft(n ^ (int)System.nanoTime(), 6) * 1119915489);
    }

    public static int ghshl(int n, int n2) {
        return tjd.tsy_2(Integer.rotateRight(n * 35533841 ^ n2, 9));
    }

    public static boolean akht_2(int n, int n2) {
        return ((tjd.ghshl(n, n2) + Thread.currentThread().hashCode()) * -1759100047 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

