/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class dd_4 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int dziiz0gnibtw58;

    private dd_4() {
    }

    public static int dsh_5(int n) {
        int n2 = Integer.rotateRight(n * 680626631 - System.identityHashCode(dd_4.class), 23);
        int n3 = (n2 ^ n2 >>> 13) * 689729659;
        int n4 = (n3 ^ n3 >>> 10) * -2010126679;
        return n4 ^ n4 >>> 19;
    }

    public static int wb(int n, int n2) {
        int n3 = n2 - n ^ 0x10A46725;
        int n4 = (n3 ^ n3 >>> 13) * -41714281;
        int n5 = (n4 ^ n4 >>> 10) * 1062129581;
        return n5 ^ n5 >>> 18;
    }

    public static boolean hhth_2(int n, int n2) {
        return ((dd_4.wb(n, n2) + Thread.currentThread().hashCode()) * -962638391 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

