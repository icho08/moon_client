/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class s_2 {
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int v65iu5a8;

    private s_2() {
    }

    private static int tkhz_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 10) * -298038251;
        int n4 = (n3 ^ n3 >>> 10) * -604751801;
        return n4 ^ n4 >>> 19;
    }

    public static int thql(int n) {
        return s_2.tkhz_2(Integer.rotateRight(n * -277577081 - System.identityHashCode(s_2.class), 20));
    }

    public static int dtk_3(int n, int n2) {
        return s_2.tkhz_2(n2 - n ^ 0x107F4A08);
    }

    public static boolean ssm_4(int n, int n2) {
        return ((s_2.dtk_3(n, n2) + Thread.currentThread().hashCode()) * 186800595 & 1) != 0;
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

