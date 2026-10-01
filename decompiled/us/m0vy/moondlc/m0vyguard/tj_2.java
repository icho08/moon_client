/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tj_2 {
    private static final int thdz_4 = -1938219482;
    private static final int khght = 856239802;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int j75s88sea488;

    private tj_2() {
    }

    private static int daz_5(int n) {
        int n2 = n ^ thdz_4;
        int n3 = (n2 ^ n2 >>> 7) * -1226764075;
        int n4 = (n3 ^ n3 >>> 18) * 637526361;
        return (n4 ^ n4 >>> 21) + khght;
    }

    public static int slq(int n) {
        return tj_2.daz_5(n ^ thdz_4 ^ System.identityHashCode(tj_2.class) ^ (int)Thread.currentThread().getId() * 92504765);
    }

    public static int jrd(int n, int n2) {
        return tj_2.daz_5(n2 - n ^ 0x73A42293 ^ khght);
    }

    public static boolean shghz_2(int n, int n2) {
        return ((tj_2.jrd(n, n2) ^ (int)System.nanoTime()) * 1591247169 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

