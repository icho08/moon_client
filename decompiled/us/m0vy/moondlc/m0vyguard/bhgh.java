/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

public final class bhgh {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int s3es3d0y1;

    private bhgh() {
    }

    public static int shkhh_2(int n) {
        int n2 = (n ^ bhgh.class.getName().hashCode()) + Thread.currentThread().hashCode();
        int n3 = (n2 ^ n2 >>> 16) * -1781926619;
        int n4 = (n3 ^ n3 >>> 13) * -2036374707;
        return n4 ^ n4 >>> 15;
    }

    public static int ztb_2(int n, int n2) {
        int n3 = Integer.rotateLeft(n ^ n2, 14) * -969099661;
        int n4 = (n3 ^ n3 >>> 12) * -73961787;
        int n5 = (n4 ^ n4 >>> 13) * 1611064381;
        return n5 ^ n5 >>> 17;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

