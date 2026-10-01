/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class rb {
    private static final int khdr = 700922413;
    private static final int dz_3 = 1801265322;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vi88fu9h7ds78c;

    private rb() {
    }

    private static int rjd_2(int n) {
        int n2 = n ^ khdr;
        int n3 = (n2 ^ n2 >>> 12) * -1651635399;
        int n4 = (n3 ^ n3 >>> 13) * -640053289;
        return (n4 ^ n4 >>> 23) + dz_3;
    }

    public static int sat_8(int n) {
        return rb.rjd_2(Integer.rotateRight((n ^ khdr) * -754732969 - System.identityHashCode(rb.class), 17));
    }

    public static int jthr(int n, int n2) {
        return rb.rjd_2(Integer.rotateRight(n * 93826437 ^ n2, 7) ^ dz_3);
    }

    public static boolean shhk_2(int n, int n2) {
        return ((rb.jthr(n, n2) + Thread.currentThread().hashCode()) * -946141319 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

