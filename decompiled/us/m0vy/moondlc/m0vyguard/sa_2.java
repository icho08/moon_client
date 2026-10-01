/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class sa_2 {
    private static final int dkhz = -1184435194;
    private static final int sqa_2 = 460484606;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int g16g1uj9e8d5;

    private sa_2() {
    }

    public static int thshs(int n) {
        int n2 = (n ^ sa_2.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ dkhz;
        int n3 = (n2 ^ n2 >>> 14) * 375226319;
        int n4 = (n3 ^ n3 >>> 11) * 432106385;
        return n4 ^ n4 >>> 16 ^ sqa_2;
    }

    public static int hld_2(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 8)) + sqa_2 ^ dkhz;
        int n4 = (n3 ^ n3 >>> 11) * -385977727;
        int n5 = (n4 ^ n4 >>> 14) * -1509269759;
        return n5 ^ n5 >>> 23 ^ sqa_2;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

