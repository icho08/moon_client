/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class r_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int rnmzemsyv4s72;

    private r_2() {
    }

    public static int zjt_2(int n) {
        int n2 = (n ^ r_2.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 15) * -1292442757;
        int n4 = (n3 ^ n3 >>> 13) * 512615417;
        return n4 ^ n4 >>> 18;
    }

    public static int shzdh_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0x13);
        int n4 = (n3 ^ n3 >>> 14) * -1270078157;
        int n5 = (n4 ^ n4 >>> 17) * -49660067;
        return n5 ^ n5 >>> 14;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

