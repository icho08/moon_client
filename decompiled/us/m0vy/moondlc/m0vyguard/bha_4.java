/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bha_4 {
    private static final int jyq = 395975675;
    private static final int jkh = -444142698;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int vzfpbau65vd5;

    private bha_4() {
    }

    public static int dhthd_2(int n) {
        int n2 = Integer.rotateRight((n ^ jyq) * 58121163 - System.identityHashCode(bha_4.class), 22);
        int n3 = (n2 ^ n2 >>> 12) * 56925797;
        int n4 = (n3 ^ n3 >>> 7) * -707237429;
        return n4 ^ n4 >>> 21;
    }

    public static int ya_2(int n, int n2) {
        int n3 = n2 ^ Integer.rotateLeft(n, n2 & 0xA) ^ jkh;
        int n4 = (n3 ^ n3 >>> 15) * 628397583;
        int n5 = (n4 ^ n4 >>> 18) * -1133064299;
        return n5 ^ n5 >>> 12;
    }

    public static boolean srz_4(int n, int n2) {
        return ((bha_4.ya_2(n, n2) + Thread.currentThread().hashCode()) * -150212165 & 1) != 0;
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

