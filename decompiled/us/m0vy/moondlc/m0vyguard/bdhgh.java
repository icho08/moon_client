/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bdhgh {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int eo28qx54suo;

    private bdhgh() {
    }

    private static int jbl(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 9) * 1241668445;
        int n4 = (n3 ^ n3 >>> 9) * -593239947;
        return n4 ^ n4 >>> 22;
    }

    public static int dwz_4(int n) {
        return bdhgh.jbl(Integer.rotateRight(n * 1611875405 - System.identityHashCode(bdhgh.class), 11));
    }

    public static int shyj(int n, int n2) {
        return bdhgh.jbl(Integer.rotateLeft(n ^ n2, 14) * 1554615207);
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

