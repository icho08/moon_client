/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bsh_4 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ujpe85tb2pj0zc;

    private bsh_4() {
    }

    private static int thhd_3(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 13) * 210958043;
        int n4 = (n3 ^ n3 >>> 17) * -1970599047;
        return n4 ^ n4 >>> 23;
    }

    public static int zghd_4(int n) {
        return bsh_4.thhd_3((n ^ bsh_4.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int zwz_3(int n, int n2) {
        return bsh_4.thhd_3(n + n2 ^ Integer.rotateLeft(n, 5));
    }

    public static boolean jfa(int n, int n2) {
        return ((bsh_4.zwz_3(n, n2) ^ (int)System.nanoTime()) * 381061867 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

