/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class rw {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int sv4kphiu;

    private rw() {
    }

    public static int dhkhn(int n) {
        int n2 = n ^ System.identityHashCode(rw.class) ^ (int)Thread.currentThread().getId() * -610721761;
        int n3 = (n2 ^ n2 >>> 11) * -788548893;
        int n4 = (n3 ^ n3 >>> 9) * 691855613;
        return n4 ^ n4 >>> 19;
    }

    public static int das_3(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 11);
        int n4 = (n3 ^ n3 >>> 11) * -972391921;
        int n5 = (n4 ^ n4 >>> 13) * -1178016171;
        return n5 ^ n5 >>> 22;
    }

    public static boolean ghthm(int n, int n2) {
        return ((rw.das_3(n, n2) ^ (int)System.nanoTime()) * -1811584697 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

