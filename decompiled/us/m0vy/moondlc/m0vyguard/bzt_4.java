/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bzt_4 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int brnluwah1;

    private bzt_4() {
    }

    private static int tla_3(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 16) * -1002163221;
        int n4 = (n3 ^ n3 >>> 13) * -364782083;
        return n4 ^ n4 >>> 12;
    }

    public static int dhsh_3(int n) {
        return bzt_4.tla_3(Integer.rotateRight(n * -1538757269 - System.identityHashCode(bzt_4.class), 10));
    }

    public static int syh_2(int n, int n2) {
        return bzt_4.tla_3(n2 - n ^ 0x38C7C68B);
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

