/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bhj {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ghbes0roapug;

    private bhj() {
    }

    public static int dsht(int n) {
        int n2 = Integer.rotateRight(n * 1181979035 - System.identityHashCode(bhj.class), 16);
        int n3 = (n2 ^ n2 >>> 12) * -469935177;
        int n4 = (n3 ^ n3 >>> 15) * 147309093;
        return n4 ^ n4 >>> 22;
    }

    public static int tdf_2(int n, int n2) {
        int n3 = n2 - n ^ 0xBCE47E04;
        int n4 = (n3 ^ n3 >>> 12) * 2100825867;
        int n5 = (n4 ^ n4 >>> 18) * 173792773;
        return n5 ^ n5 >>> 20;
    }

    public static boolean rhq_2(int n, int n2) {
        return ((bhj.tdf_2(n, n2) + Thread.currentThread().hashCode()) * 1845322699 & 1) != 0;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

