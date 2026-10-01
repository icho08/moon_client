/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class shkh_3 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int r4bph5fbf6uy;

    private shkh_3() {
    }

    private static int bwn(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 7) * -1341052709;
        int n4 = (n3 ^ n3 >>> 11) * 2060170185;
        return n4 ^ n4 >>> 19;
    }

    public static int thqa_2(int n) {
        return shkh_3.bwn(Integer.rotateRight(n * -3642273 - System.identityHashCode(shkh_3.class), 15));
    }

    public static int tqh(int n, int n2) {
        return shkh_3.bwn(n2 - n ^ 0x4FE141C);
    }

    public static boolean ana(int n, int n2) {
        return ((shkh_3.tqh(n, n2) + Thread.currentThread().hashCode()) * 19505963 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

