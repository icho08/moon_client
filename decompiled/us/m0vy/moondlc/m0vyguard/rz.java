/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class rz {
    private static final int sa_3 = 432879960;
    private static final int khtb_2 = -2060620953;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int nczfhentfw0fi;

    private rz() {
    }

    private static int drd_2(int n) {
        int n2 = n ^ sa_3;
        int n3 = (n2 ^ n2 >>> 16) * 2145368751;
        int n4 = (n3 ^ n3 >>> 15) * 377593217;
        return (n4 ^ n4 >>> 11) + khtb_2;
    }

    public static int sygh(int n) {
        return rz.drd_2(Integer.rotateRight((n ^ sa_3) * 1174779963 - System.identityHashCode(rz.class), 26));
    }

    public static int dghk(int n, int n2) {
        return rz.drd_2(n + n2 ^ Integer.rotateLeft(n, 12) ^ khtb_2);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

