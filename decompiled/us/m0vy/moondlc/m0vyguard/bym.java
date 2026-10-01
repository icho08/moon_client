/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bym {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int go2ba4f7;

    private bym() {
    }

    private static int dgha_2(int n) {
        int n2 = n;
        int n3 = (n2 ^ n2 >>> 12) * 537893531;
        int n4 = (n3 ^ n3 >>> 18) * 1321878803;
        return n4 ^ n4 >>> 22;
    }

    public static int rash(int n) {
        return bym.dgha_2((n ^ bym.class.getName().hashCode()) + Thread.currentThread().hashCode());
    }

    public static int shkt_2(int n, int n2) {
        return bym.dgha_2(n2 - n ^ 0x34C88DCC);
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

