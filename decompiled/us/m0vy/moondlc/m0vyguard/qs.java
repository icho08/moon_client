/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class qs {
    private static final int shdh_5 = -20009129;
    private static final int bnd_2 = -1184352753;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int bdnop3iqkg;

    private qs() {
    }

    public static int khfa_2(int n) {
        int n2 = (n ^ qs.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ shdh_5;
        int n3 = (n2 ^ n2 >>> 16) * 5005463;
        int n4 = (n3 ^ n3 >>> 7) * 855906989;
        return n4 ^ n4 >>> 15 ^ bnd_2;
    }

    public static int zadh_4(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1888525239 ^ n2, 13) + bnd_2 ^ shdh_5;
        int n4 = (n3 ^ n3 >>> 13) * -1092637619;
        int n5 = (n4 ^ n4 >>> 18) * -1795576779;
        return n5 ^ n5 >>> 17 ^ bnd_2;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

