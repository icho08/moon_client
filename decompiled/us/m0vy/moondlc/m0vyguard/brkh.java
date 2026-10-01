/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class brkh {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int tamq9cgzi3ed89;

    private brkh() {
    }

    public static int jkz_2(int n) {
        int n2 = Integer.rotateRight(n * 1944492935 - System.identityHashCode(brkh.class), 17);
        int n3 = (n2 ^ n2 >>> 14) * -1495004211;
        int n4 = (n3 ^ n3 >>> 10) * -1535648561;
        return n4 ^ n4 >>> 13;
    }

    public static int ast_2(int n, int n2) {
        int n3 = Integer.rotateRight(n * -2007215619 ^ n2, 13);
        int n4 = (n3 ^ n3 >>> 16) * -387531281;
        int n5 = (n4 ^ n4 >>> 13) * -1797653515;
        return n5 ^ n5 >>> 18;
    }

    public static boolean tzkh_4(int n, int n2) {
        return ((brkh.ast_2(n, n2) + Thread.currentThread().hashCode()) * -1092641235 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

