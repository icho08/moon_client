/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class zm {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int gb81cq0719t6;

    private zm() {
    }

    public static int drb_2(int n) {
        int n2 = (n ^ zm.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 14) * -1326139345;
        int n4 = (n3 ^ n3 >>> 7) * 1955524823;
        return n4 ^ n4 >>> 17;
    }

    public static int thtd_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 15) * 1489030071;
        int n4 = (n3 ^ n3 >>> 17) * 715353635;
        int n5 = (n4 ^ n4 >>> 14) * -1936642977;
        return n5 ^ n5 >>> 12;
    }

    public static boolean bjt(int n, int n2) {
        return ((zm.thtd_2(n, n2) ^ (int)System.nanoTime()) * 1227124895 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

