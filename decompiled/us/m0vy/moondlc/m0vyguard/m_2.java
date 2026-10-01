/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class m_2 {
    private static final int bsf_2 = 385900735;
    private static final int thghs_2 = -49930725;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int zs868px41;

    private m_2() {
    }

    public static int thgh_4(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 14) * 127101849 ^ bsf_2;
        int n3 = (n2 ^ n2 >>> 15) * 1626590483;
        int n4 = (n3 ^ n3 >>> 11) * 1896620133;
        return n4 ^ n4 >>> 21 ^ thghs_2;
    }

    public static int hza_3(int n, int n2) {
        int n3 = Integer.rotateRight(n * -40378261 ^ n2, 19) + thghs_2 ^ bsf_2;
        int n4 = (n3 ^ n3 >>> 10) * 1945997703;
        int n5 = (n4 ^ n4 >>> 16) * -67233911;
        return n5 ^ n5 >>> 16 ^ thghs_2;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

