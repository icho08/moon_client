/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class ghn {
    private static final int khdt_4 = -103222359;
    private static final int rdl_2 = 1902484605;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ov2dhpxfvq8;

    private ghn() {
    }

    private static int thshh_2(int n) {
        int n2 = n ^ khdt_4;
        int n3 = (n2 ^ n2 >>> 12) * 718998203;
        int n4 = (n3 ^ n3 >>> 17) * 1133170151;
        return (n4 ^ n4 >>> 24) + rdl_2;
    }

    public static int tths_4(int n) {
        return ghn.thshh_2(Integer.rotateRight((n ^ khdt_4) * -162155999 - System.identityHashCode(ghn.class), 24));
    }

    public static int thwd_2(int n, int n2) {
        return ghn.thshh_2(Integer.rotateRight(n * 5712859 ^ n2, 6) ^ rdl_2);
    }

    public static boolean thk_4(int n, int n2) {
        return ((ghn.thwd_2(n, n2) + Thread.currentThread().hashCode()) * 130237531 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

