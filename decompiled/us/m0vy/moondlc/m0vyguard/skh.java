/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class skh {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int r007jebo5nf;

    private skh() {
    }

    private static int szth_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 12) * -985038471;
        int n4 = (n3 ^ n3 >>> 10) * -1708594227;
        return n4 ^ n4 >>> 14;
    }

    public static int htkh_2(int n) {
        return skh.szth_2((n ^ skh.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int jsd_2(int n, int n2) {
        return skh.szth_2(n2 - n ^ 0xA768CDDF);
    }

    public static boolean aghsh(int n, int n2) {
        return ((skh.jsd_2(n, n2) ^ (int)System.nanoTime()) * 1940587769 & 1) != 0;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

