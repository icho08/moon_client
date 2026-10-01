/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class rd {
    private static final int khah = -2038506000;
    private static final int hwd = 156542397;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int e1itr6sjsh1;

    private rd() {
    }

    private static int khthm(int n) {
        int n2 = n ^ khah;
        int n3 = (n2 ^ n2 >>> 10) * -2113292509;
        int n4 = (n3 ^ n3 >>> 17) * -938988979;
        return (n4 ^ n4 >>> 14) + hwd;
    }

    public static int zghth(int n) {
        return rd.khthm((n ^ khah ^ rd.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int zdb_4(int n, int n2) {
        return rd.khthm(n2 ^ Integer.rotateLeft(n, n2 & 0xD) ^ hwd);
    }

    public static boolean tkm_2(int n, int n2) {
        return ((rd.zdb_4(n, n2) ^ (int)System.nanoTime()) * -566004785 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

