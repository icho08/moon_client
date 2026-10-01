/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class qa {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int dz4n84kzpvpcju;

    private qa() {
    }

    public static int rdth(int n) {
        int n2 = Integer.rotateRight(n * 106542745 - System.identityHashCode(qa.class), 22);
        int n3 = (n2 ^ n2 >>> 17) * -33606451;
        int n4 = (n3 ^ n3 >>> 8) * 1290978129;
        return n4 ^ n4 >>> 17;
    }

    public static int dqkh_2(int n, int n2) {
        int n3 = n2 - n ^ 0x78A7F929;
        int n4 = (n3 ^ n3 >>> 15) * 1295114403;
        int n5 = (n4 ^ n4 >>> 15) * 264800759;
        return n5 ^ n5 >>> 15;
    }

    public static boolean thad_4(int n, int n2) {
        return ((qa.dqkh_2(n, n2) + Thread.currentThread().hashCode()) * -1884265741 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

