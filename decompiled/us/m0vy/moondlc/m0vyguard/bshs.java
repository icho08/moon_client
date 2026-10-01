/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bshs {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ia5prh4pe;

    private bshs() {
    }

    public static int btn(int n) {
        int n2 = n ^ System.identityHashCode(bshs.class) ^ (int)Thread.currentThread().getId() * -240056513;
        int n3 = (n2 ^ n2 >>> 11) * -2125467195;
        int n4 = (n3 ^ n3 >>> 12) * 1353321575;
        return n4 ^ n4 >>> 19;
    }

    public static int shkb(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 13) * -1039364399;
        int n4 = (n3 ^ n3 >>> 13) * 253261107;
        int n5 = (n4 ^ n4 >>> 17) * 968229423;
        return n5 ^ n5 >>> 19;
    }

    public static boolean sqm_2(int n, int n2) {
        return ((bshs.shkb(n, n2) ^ (int)System.nanoTime()) * -1015507675 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

