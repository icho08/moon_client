/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class fs {
    private static final int thjn = 1710817042;
    private static final int rqz = -674795271;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int eozzipqcu;

    private fs() {
    }

    public static int khrr(int n) {
        int n2 = Integer.rotateLeft(n ^ (int)System.nanoTime(), 13) * 366255403 ^ thjn;
        int n3 = (n2 ^ n2 >>> 14) * -439041507;
        int n4 = (n3 ^ n3 >>> 14) * 1443836787;
        return n4 ^ n4 >>> 22 ^ rqz;
    }

    public static int jja(int n, int n2) {
        int n3 = (n + n2 ^ Integer.rotateLeft(n, 7)) + rqz ^ thjn;
        int n4 = (n3 ^ n3 >>> 14) * 1329460829;
        int n5 = (n4 ^ n4 >>> 18) * 1353731575;
        return n5 ^ n5 >>> 12 ^ rqz;
    }

    public static boolean jghs(int n, int n2) {
        return ((fs.jja(n, n2) + Thread.currentThread().hashCode()) * 498483437 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

