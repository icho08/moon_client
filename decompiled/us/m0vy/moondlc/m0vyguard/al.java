/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class al {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int m9l04iwz5wxnk;

    private al() {
    }

    public static int blh(int n) {
        int n2 = (n ^ al.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 18) * -1108610149;
        int n4 = (n3 ^ n3 >>> 10) * -1746902075;
        return n4 ^ n4 >>> 18;
    }

    public static int rsj(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 14) * -127394679;
        int n4 = (n3 ^ n3 >>> 9) * -807488563;
        int n5 = (n4 ^ n4 >>> 15) * -873423963;
        return n5 ^ n5 >>> 20;
    }

    public static boolean srf(int n, int n2) {
        return ((al.rsj(n, n2) ^ (int)System.nanoTime()) * -330637799 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

