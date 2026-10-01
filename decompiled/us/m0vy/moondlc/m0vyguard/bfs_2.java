/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bfs_2 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int g6mu1pt5g3;

    private bfs_2() {
    }

    public static int shdf(int n) {
        int n2 = (n ^ bfs_2.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 16) * 129111765;
        int n4 = (n3 ^ n3 >>> 14) * -1113798015;
        return n4 ^ n4 >>> 19;
    }

    public static int hql(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 10) * -387399139;
        int n4 = (n3 ^ n3 >>> 8) * -1536799299;
        int n5 = (n4 ^ n4 >>> 15) * 2018286447;
        return n5 ^ n5 >>> 14;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

