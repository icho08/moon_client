/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class as {
    private static final int lr = 125201272;
    private static final int jjb = 1601533807;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int m4ve0yhn;

    private as() {
    }

    public static int thka_2(int n) {
        int n2 = n ^ System.identityHashCode(as.class) ^ (int)Thread.currentThread().getId() * -1252265305 ^ lr;
        int n3 = (n2 ^ n2 >>> 11) * -1545605875;
        int n4 = (n3 ^ n3 >>> 8) * 1696512543;
        return n4 ^ n4 >>> 13 ^ jjb;
    }

    public static int adt_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 17) * -1193978081 + jjb ^ lr;
        int n4 = (n3 ^ n3 >>> 15) * 425033459;
        int n5 = (n4 ^ n4 >>> 15) * -1630978131;
        return n5 ^ n5 >>> 18 ^ jjb;
    }

    public static boolean tshk_2(int n, int n2) {
        return ((as.adt_2(n, n2) ^ (int)System.nanoTime()) * -983748129 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

