/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class hn_2 {
    private static final int jlf = -533381422;
    private static final int dhfd_2 = -85574015;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int pfsorznjdkk;

    private hn_2() {
    }

    private static int tbd_2(int n) {
        int n2 = n ^ jlf;
        int n3 = (n2 ^ n2 >>> 9) * -715059863;
        int n4 = (n3 ^ n3 >>> 9) * -61883743;
        return (n4 ^ n4 >>> 16) + dhfd_2;
    }

    public static int ssy(int n) {
        return hn_2.tbd_2((n ^ hn_2.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ jlf);
    }

    public static int dmt_2(int n, int n2) {
        return hn_2.tbd_2((n2 - n ^ 0xF7809B3F) + dhfd_2 ^ jlf);
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

