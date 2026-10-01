/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bhz_3 {
    private static final int ddhh_2 = 751532191;
    private static final int dkha = 1330942600;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int cwsy1ue736iyn1;

    private bhz_3() {
    }

    private static int ghra_2(int n) {
        int n2 = n ^ ddhh_2;
        int n3 = (n2 ^ n2 >>> 11) * 1725738395;
        int n4 = (n3 ^ n3 >>> 9) * 948648737;
        return (n4 ^ n4 >>> 21) + dkha;
    }

    public static int hash_2(int n) {
        return bhz_3.ghra_2((n ^ bhz_3.class.getName().hashCode()) + Thread.currentThread().hashCode() ^ ddhh_2);
    }

    public static int dzsh_3(int n, int n2) {
        return bhz_3.ghra_2((n2 - n ^ 0xFC2BC713) + dkha ^ ddhh_2);
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

