/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class sb {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int a9fauh6h14;

    private sb() {
    }

    private static int khkkh(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 10) * 146773689;
        int n4 = (n3 ^ n3 >>> 11) * 1625018327;
        return n4 ^ n4 >>> 13;
    }

    public static int rhd_4(int n) {
        return sb.khkkh(n ^ System.identityHashCode(sb.class) ^ (int)Thread.currentThread().getId() * -521869109);
    }

    public static int ska_3(int n, int n2) {
        return sb.khkkh(n2 ^ Integer.rotateLeft(n, n2 & 0x15));
    }

    public static boolean ghdha_2(int n, int n2) {
        return ((sb.ska_3(n, n2) ^ (int)System.nanoTime()) * 1611965535 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

