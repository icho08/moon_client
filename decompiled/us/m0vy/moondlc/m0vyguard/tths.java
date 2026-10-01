/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class tths {
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int r7rhuw3235;

    private tths() {
    }

    private static int khsl(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 15) * 1147265599;
        int n4 = (n3 ^ n3 >>> 17) * -132530489;
        return n4 ^ n4 >>> 19;
    }

    public static int rza_2(int n) {
        return tths.khsl((n ^ tths.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int jnz_2(int n, int n2) {
        return tths.khsl(n2 - n ^ 0xF107B92B);
    }

    public static boolean jyl(int n, int n2) {
        return ((tths.jnz_2(n, n2) ^ (int)System.nanoTime()) * -1319813021 & 1) != 0;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

