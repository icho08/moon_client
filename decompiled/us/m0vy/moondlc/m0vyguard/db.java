/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class db {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ujir1fxp6wm0d4;

    private db() {
    }

    private static int tha_6(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 9) * -1187892639;
        int n4 = (n3 ^ n3 >>> 18) * -764285331;
        return n4 ^ n4 >>> 13;
    }

    public static int ghshr(int n) {
        return db.tha_6(Integer.rotateRight(n * -697688931 - System.identityHashCode(db.class), 7));
    }

    public static int bnk(int n, int n2) {
        return db.tha_6(n2 - n ^ 0x2DBEB99F);
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

