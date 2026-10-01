/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class brt_2 {
    private static final int tdj = -2020122214;
    private static final int jht = 2116675211;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int lb746asot13a;

    private brt_2() {
    }

    public static int khqz_2(int n) {
        int n2 = n ^ System.identityHashCode(brt_2.class) ^ (int)Thread.currentThread().getId() * 920827869 ^ tdj;
        int n3 = (n2 ^ n2 >>> 16) * -2140811981;
        int n4 = (n3 ^ n3 >>> 13) * -2065586867;
        return n4 ^ n4 >>> 17 ^ jht;
    }

    public static int tqh_3(int n, int n2) {
        int n3 = Integer.rotateRight(n * 1363300687 ^ n2, 8) + jht ^ tdj;
        int n4 = (n3 ^ n3 >>> 9) * 1405408383;
        int n5 = (n4 ^ n4 >>> 13) * 2007645097;
        return n5 ^ n5 >>> 22 ^ jht;
    }

    public static boolean zaa_4(int n, int n2) {
        return ((brt_2.tqh_3(n, n2) ^ (int)System.nanoTime()) * 2134619033 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

