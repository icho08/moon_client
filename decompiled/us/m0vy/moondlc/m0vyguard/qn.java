/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class qn {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ltv18z57rez;

    private qn() {
    }

    private static int sqh_3(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 12) * 660311881;
        int n4 = (n3 ^ n3 >>> 10) * -1896227109;
        return n4 ^ n4 >>> 23;
    }

    public static int dhkl(int n) {
        return qn.sqh_3(n ^ System.identityHashCode(qn.class) ^ (int)Thread.currentThread().getId() * 1926329959);
    }

    public static int ghda(int n, int n2) {
        return qn.sqh_3(n2 ^ Integer.rotateLeft(n, n2 & 0x15));
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

