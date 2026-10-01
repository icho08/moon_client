/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class btkh {
    private static final int rash = 1025089716;
    private static final int shmf = -794903699;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int tdbpl621jb6vc;

    private btkh() {
    }

    public static int jthq(int n) {
        int n2 = n ^ rash ^ System.identityHashCode(btkh.class) ^ (int)Thread.currentThread().getId() * -1634698465;
        int n3 = (n2 ^ n2 >>> 11) * -1474729695;
        int n4 = (n3 ^ n3 >>> 15) * 667941835;
        return n4 ^ n4 >>> 18;
    }

    public static int snh(int n, int n2) {
        int n3 = n + n2 ^ Integer.rotateLeft(n, 8) ^ shmf;
        int n4 = (n3 ^ n3 >>> 17) * -2037882151;
        int n5 = (n4 ^ n4 >>> 16) * -558082605;
        return n5 ^ n5 >>> 18;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

