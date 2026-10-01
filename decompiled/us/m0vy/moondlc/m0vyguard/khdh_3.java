/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_238
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.bthb;
import us.m0vy.moondlc.m0vyguard.btb_2;
import us.m0vy.moondlc.m0vyguard.bghdh;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.yf;

public final class khdh_3
implements tthy {
    private static class_243 hst_3;
    private static class_243 say_3;
    private static int dhdhkh;
    private static final int stz_4 = 1462024525;
    private static final int shhh_4 = 306725605;
    private static final int zi8aygs3mqpl = -1054599122;
    private static final int dgefi88awla = -1783279104;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int jqit4go4ov21d;

    private khdh_3() {
    }

    public static class_243 rzt_4() {
        block0: {
            int n = -753246436;
            int n2 = (n = Integer.rotateLeft(n * -1555297103, 9) ^ 0xF02CC70F) ^ 0xB6E86519;
            if ((n2 ^ n) == -1226283751) break block0;
            int cfr_ignored_0 = (0x65F23A05 ^ n) + -300123661;
        }
        return hst_3;
    }

    public static class_243 dsht_4(class_1297 class_12972) {
        block0: {
            int n = -315759129;
            n = Integer.rotateLeft(n * 2129943343, 17) ^ 0xA8452B8B;
            class_1297 class_12973 = class_12972;
            n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
            int n2 = n ^ 0xD210BE7;
            if ((n2 ^ n) == 220269543) break block0;
            int cfr_ignored_0 = (0xE00CEE00 ^ n) + -15983958;
        }
        return khdh_3.rdd_4(class_12972.method_5829());
    }

    public static class_243 rdd_4(class_238 class_2383) {
        int n = bthb.hnz(8756534);
        int n2 = n ^ 0x19386135;
        if ((n2 ^ n) != 423125301) {
            int cfr_ignored_0 = Integer.rotateRight(0x19BDFC03 ^ n, 6) + 576660376;
        }
        if (khdh_3.dfd_3()) {
            throw null;
        }
        if (khdh_3.mc.field_1724 == null) {
            return class_2383.method_1005();
        }
        double d = Double.longBitsToDouble(0xA8EE6F8063A2CD87L ^ 0x9757F619FA3B541DL);
        class_243 class_2432 = null;
        double d2 = Double.longBitsToDouble(0xB8CC4AAFDD0B8C11L ^ 0xC723B55022F473EEL);
        for (double d3 = class_2383.field_1323; d3 <= class_2383.field_1320; d3 += d) {
            for (double d4 = class_2383.field_1322; d4 <= class_2383.field_1325; d4 += d) {
                for (double d5 = class_2383.field_1321; d5 <= class_2383.field_1324; d5 += d) {
                    class_243 class_2433 = new class_243(d3, d4, d5);
                    double d6 = khdh_3.ttkh(khdh_3.mc.field_1724).method_1022(class_2433);
                    if (!(d6 < d2)) continue;
                    d2 = d6;
                    class_2432 = class_2433;
                }
            }
        }
        return class_2432 != null ? class_2432 : khdh_3.sjz_3(class_2383);
    }

    public static class_243 tlb_2(class_1297 class_12972) {
        int n = bthb.hnz(812371674);
        class_1297 class_12973 = class_12972;
        n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
        int n2 = n ^ 0xB9AA8B60;
        if ((n2 ^ n) != -1180005536) {
            int cfr_ignored_0 = (Integer.rotateRight(0x89C145BA ^ n, 4) + -1295707967) * -1983822405;
        }
        class_238 class_2383 = class_12972.method_5829();
        double d = class_2383.field_1320 - class_2383.field_1323;
        double d2 = class_2383.field_1325 - class_2383.field_1322;
        double d3 = class_2383.field_1324 - class_2383.field_1321;
        double d4 = class_2383.field_1323 + d / Double.longBitsToDouble(0xFA2045329E286E95L ^ 0xBA2045329E286E95L);
        double d5 = class_2383.field_1322 + d2 * Double.longBitsToDouble(0xA594A2E78BCE9080L ^ 0x9A72C481EDA8F6E6L);
        double d6 = class_2383.field_1321 + d3 / Double.longBitsToDouble(0xFB1CE7F3A88752B2L ^ 0xBB1CE7F3A88752B2L);
        double d7 = (double)System.currentTimeMillis() / Double.longBitsToDouble(0xDB3CD9A1105C4D5L ^ 0x4DFACD9A1105C4D5L);
        int n3 = class_12972.method_5628();
        double d8 = Math.sin(d7 + (double)n3) * (d * Double.longBitsToDouble(0x5A380E0A87378421L ^ 0x65E4C2C64BFB48ECL));
        double d9 = Math.cos(d7 * Double.longBitsToDouble(0xB21348258A35C822L ^ 0x8DFAD1BC13AC51B8L) + (double)n3) * (d2 * khdh_3.ghdt_4(0x1AD382238ADDD481L ^ 0x256A1BBA13444D1BL));
        double d10 = Math.cos(d7 * khdh_3.ghby(0xC43B0AE43AC83F80L ^ 0xFBC839D709FB0CB3L) + (double)n3) * (d3 * Double.longBitsToDouble(0xA1B6D1CFB1B47530L ^ 0x9E6A1D037D78B9FDL));
        return new class_243(d4 + d8, d5 + d9, d6 + d10);
    }

    /*
     * Unable to fully structure code
     */
    public static class_243 ryb(class_1297 var0) {
        var2_1 = 0.0;
        var4_2 = 0.0;
        var6_3 = 0.0;
        var8_4 = 0.0;
        var10_5 = 0.0;
        var12_6 = 0.0;
        var14_7 = 0.0;
        var16_8 = 0;
        var17_9 = 0.0;
        var19_10 = 0.0;
        var21_11 = 0.0;
        var25_12 = 0;
        var23_13 = -1096126456;
        var23_13 = Integer.rotateLeft(var23_13 * -886981071, 11) ^ -1508114515;
        v0 = var0;
        var23_13 = Integer.rotateRight((v0 != null ? System.identityHashCode(v0) : 0) ^ var23_13, 25);
        var24_14 = Integer.rotateLeft(var23_13 ^ 1386055587, 20) ^ -1293927796 ^ -1293927796;
        while (true) {
            block31: {
                block38: {
                    block29: {
                        block36: {
                            block28: {
                                block27: {
                                    block34: {
                                        block37: {
                                            block30: {
                                                block32: {
                                                    block39: {
                                                        block35: {
                                                            block33: {
                                                                var25_12 = Integer.rotateRight(var24_14, 20) ^ var23_13;
                                                                switch (var25_12 & 7) {
                                                                    case 0: {
                                                                        if (var25_12 == -1620580360) break block27;
                                                                        if (var25_12 == -270232208) break;
                                                                        if (var25_12 != 1846255152) {
                                                                            ** break;
                                                                        }
                                                                        break block28;
                                                                    }
                                                                    case 2: {
                                                                        if (var25_12 == 1735133194) break block29;
                                                                        if (var25_12 == -908838750) break block30;
                                                                        (Integer.rotateRight(1221112274 ^ var23_13, 12) + -726980695) * 1221112275;
                                                                        if (var25_12 != 2018185898) {
                                                                            ** break;
                                                                        }
                                                                        break block31;
                                                                    }
                                                                    case 3: {
                                                                        if (var25_12 == 1388419755) break block32;
                                                                        if (var25_12 != 1386055587) {
                                                                            (Integer.rotateRight(-32494761 ^ var23_13, 18) - -934093116) * -32494761;
                                                                            ** break;
                                                                        }
                                                                        break block33;
                                                                    }
                                                                    case 4: {
                                                                        if (var25_12 == -1535649796) break block34;
                                                                        if (var25_12 != -1348122268) {
                                                                            Integer.rotateRight(-1398902582 ^ var23_13, 8) + -343062607;
                                                                            ** break;
                                                                        }
                                                                        break block35;
                                                                    }
                                                                    case 6: {
                                                                        if (var25_12 == 1341942494) break block36;
                                                                        if (var25_12 == -730343978) break block37;
                                                                        (Integer.rotateLeft(-93108396 ^ var23_13, 18) - 1481851495) * -93108395;
                                                                        if (var25_12 != 1616189222) {
                                                                            ** break;
                                                                        }
                                                                        break block38;
                                                                    }
                                                                    case 7: {
                                                                        if (var25_12 != -391112777) {
                                                                            ** break;
                                                                        }
                                                                        break block39;
                                                                    }
                                                                }
                                                                Integer.rotateLeft(397162440 ^ var23_13, 5) + -499621773;
                                                                var1_15 = var0.method_5829();
                                                                var2_1 = var1_15.field_1320 - var1_15.field_1323;
                                                                var4_2 = var1_15.field_1325 - var1_15.field_1322;
                                                                var6_3 = var1_15.field_1324 - var1_15.field_1321;
                                                                var8_4 = var1_15.field_1323 + var2_1 / Double.longBitsToDouble(-593094348574441622L ^ -5204780367001829526L);
                                                                var10_5 = var1_15.field_1322 + var4_2 * Double.longBitsToDouble(-3620051610836841128L ^ -998054253799833195L);
                                                                var12_6 = var1_15.field_1321 + var6_3 / Double.longBitsToDouble(-9219174150854185963L ^ -4607488132426798059L);
                                                                var14_7 = (double)System.currentTimeMillis() / Double.longBitsToDouble(1437959592118806533L ^ 6027197981153519621L);
                                                                var16_8 = var0.method_5628();
                                                                var17_9 = Math.sin(var14_7 + (double)var16_8) * (var2_1 * Double.longBitsToDouble(175856102516493328L ^ 4437912981333011062L));
                                                                var19_10 = Math.cos(var14_7 * Double.longBitsToDouble(-1834162320755853435L ^ -2782619220592464353L) + (double)var16_8) * (var4_2 * khdh_3.jghm(2230247569323142121L ^ 2389994958614868595L));
                                                                var21_11 = khdh_3.zak_3(var14_7 * Double.longBitsToDouble(-8988522074178669359L ^ -4849978806407952414L) + (double)var16_8) * (var6_3 * Double.longBitsToDouble(-6639194715188252329L ^ -7189238195879684303L));
                                                                return new class_243(var8_4 + var17_9, var10_5 + var19_10, var12_6 + var21_11);
                                                            }
                                                            (Integer.rotateRight(1076821946 ^ var23_13, 11) + -905013567) * 1076821947;
                                                            if (khdh_3.shdhy()) {
                                                                var24_14 = Integer.rotateLeft(var23_13 ^ -1205572509, 20);
                                                                Integer.rotateLeft(-1773973376 ^ var23_13, 5) + 914644667;
                                                                var24_14 = Integer.rotateLeft(var23_13 ^ -1348122268, 20);
                                                                var25_12 += 3;
                                                                continue;
                                                            }
                                                            (int)(-1941458931765063546L ^ (long)var23_13 ^ -1750113585793964084L);
                                                            var24_14 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var23_13 ^ -183191903, 20)));
                                                            (int)(401076536900315055L ^ (long)var23_13 ^ 3209016959622031088L);
                                                            var24_14 = (int)((long)Integer.rotateLeft(var23_13 ^ -270232208, 20) ^ 7269806957633603256L ^ 7269806957633603256L);
                                                            var25_12 += 4;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(1598181637 ^ var23_13, 14) - -1922732330;
                                                        (int)(-7065867198692791473L ^ (long)var23_13 ^ 216316930573243952L);
                                                        throw null;
                                                    }
                                                    (Integer.rotateLeft(118456884 ^ var23_13, 3) - -549559417) * 118456885;
                                                    var24_14 = Integer.rotateLeft(var23_13 ^ -692515764, 20) + 1651687323 - 1651687323;
                                                    Integer.rotateRight(-2059685565 ^ var23_13, 3) + 647501400;
                                                    var24_14 = Integer.rotateLeft(var23_13 ^ 1386055587, 20) + -1818487187 - -1818487187;
                                                    var25_12 += 2;
                                                    continue;
                                                }
                                                (Integer.rotateRight(1406090367 ^ var23_13, 13) - 712372892) * 1406090367;
                                                var24_14 = Integer.rotateLeft(var23_13 ^ -1320756881, 20) + 1617874916 - 1617874916;
                                                (Integer.rotateLeft(-1419675843 ^ var23_13, 8) - -987033698) * -1419675843;
                                                (int)(7625677188759874383L ^ (long)var23_13 ^ 5724219274847420022L);
                                                var24_14 = Integer.rotateLeft(var23_13 ^ 1386055587, 20) + 1296815452 - 1296815452;
                                                continue;
                                            }
                                            Integer.rotateRight(1560272331 ^ var23_13, 14) + 1197046480;
                                            try {
                                                var25_12 += 4;
                                                if ((7891705256450361247L ^ (long)var23_13 | 1L) == 0L) {
                                                    throw new ArithmeticException();
                                                }
                                                var24_14 = Integer.rotateLeft(var23_13 ^ 1386055587, 20) ^ -2007645577 ^ -2007645577;
                                            }
                                            catch (ArithmeticException v1) {
                                                var24_14 = Integer.rotateLeft(var23_13 ^ 1386055587, 20) + 133258866 - 133258866;
                                            }
                                            ++var25_12;
                                            continue;
                                        }
                                        Integer.rotateLeft(-449661727 ^ var23_13, 15) + -981367174;
                                        (int)(2846304497361546063L ^ (long)var23_13 ^ -3978786122322287919L);
                                        try {
                                            if ((6740046681898919107L ^ (long)var23_13 | 1L) == 0L) {
                                                throw new UnsupportedOperationException();
                                            }
                                            var24_14 = Integer.rotateLeft(var23_13 ^ 1386055587, 20) ^ 267781892 ^ 267781892;
                                        }
                                        catch (UnsupportedOperationException v2) {
                                            var24_14 = (int)((long)Integer.rotateLeft(var23_13 ^ 1386055587, 20) ^ 406578290401676925L ^ 406578290401676925L);
                                        }
                                        var25_12 += 4;
                                        continue;
                                    }
                                    (Integer.rotateRight(1287195227 ^ var23_13, 12) + 1321590848) * 1287195227;
                                    var24_14 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var23_13 ^ 1764551454, 20)));
                                    (Integer.rotateLeft(-806067879 ^ var23_13, 12) + 854944002) * -806067879;
                                    (int)(956679999934753615L ^ (long)var23_13 ^ 7185637353929160540L);
                                    var24_14 = (int)((long)Integer.rotateLeft(var23_13 ^ 1386055587, 20) ^ -4797135293874293658L ^ -4797135293874293658L);
                                    (Integer.rotateLeft(-1722147011 ^ var23_13, 6) - -1773705314) * -1722147011;
                                    (int)(6622737866274696015L ^ (long)var23_13 ^ -6957917275827922432L);
                                    var25_12 -= 4;
                                    continue;
                                }
                                (Integer.rotateLeft(1598144656 ^ var23_13, 14) + -1923878741) * 1598144657;
                                var24_14 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var23_13 ^ 587180224, 20)));
                                Integer.rotateLeft(1928719788 ^ var23_13, 17) - -265984241;
                                var24_14 = (int)((long)Integer.rotateLeft(var23_13 ^ 1386055587, 20) ^ -1346856449248928331L ^ -1346856449248928331L);
                                var25_12 += 5;
                                continue;
                            }
                            Integer.rotateRight(-873427794 ^ var23_13, 12) - -1233213363;
                            var24_14 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var23_13 ^ 2105870637, 20)));
                            (Integer.rotateRight(-135102442 ^ var23_13, 17) - 180036069) * -135102441;
                            (int)(-2371766711544317227L ^ (long)var23_13 ^ 7497125759149675514L);
                            var24_14 = (int)((long)Integer.rotateLeft(var23_13 ^ 1386055587, 20) ^ 6891410033090991631L ^ 6891410033090991631L);
                            ++var25_12;
                            continue;
                        }
                        Integer.rotateRight(316766826 ^ var23_13, 5) + 1303081489;
                        var24_14 = Integer.rotateLeft(var23_13 ^ -2105895100, 20);
                        (Integer.rotateRight(-1724772582 ^ var23_13, 6) + -1855098015) * -1724772581;
                        if (!bthb.dhk_2(var23_13, -2080235529)) {
                            (Integer.rotateLeft(-694183852 ^ var23_13, 13) - 28381543) * -694183851;
                        }
                        var24_14 = Integer.rotateLeft(var23_13 ^ 1386055587, 20) + 1370798208 - 1370798208;
                        continue;
                    }
                    Integer.rotateLeft(-1670131611 ^ var23_13, 6) - -161227914;
                    (int)(6827877427160869711L ^ (long)var23_13 ^ 126244938025865299L);
                    try {
                        var25_12 += 3;
                        var24_14 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var23_13 ^ 1386055587, 20)));
                    }
                    catch (IllegalArgumentException v3) {
                        var24_14 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var23_13 ^ 1386055587, 20)));
                    }
                    var25_12 -= 2;
                    continue;
                }
                (Integer.rotateLeft(1987054452 ^ var23_13, 17) - 1542390343) * 1987054453;
                if (bthb.dhk_2(var23_13, -986019045)) {
                    (Integer.rotateLeft(-1750659912 ^ var23_13, 5) + 1637362051) * -1750659911;
                }
                var24_14 = Integer.rotateLeft(var23_13 ^ 1386055587, 20) + 1813875221 - 1813875221;
                var25_12 -= 5;
                continue;
            }
            Integer.rotateRight(-697489118 ^ var23_13, 13) + -74081703;
            var24_14 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var23_13 ^ -1151212771, 20)));
            (Integer.rotateLeft(-1692334791 ^ var23_13, 6) + -849526494) * -1692334791;
            (int)(6454690725288536911L ^ (long)var23_13 ^ -6090974347559100682L);
            if (bthb.dhk_2(var23_13, 1775720969)) {
                Integer.rotateRight(994762154 ^ var23_13, 10) + 846100177;
            }
            var24_14 = Integer.rotateLeft(var23_13 ^ 1386055587, 20) + 2015159436 - 2015159436;
            continue;
lbl227:
            // 7 sources

            (Integer.rotateRight(-1210272390 ^ var23_13, 9) + 1209506049) * -1210272389;
            var24_14 = Integer.rotateLeft(var23_13 ^ 1386055587, 20) + -1466243603 - -1466243603;
        }
    }

    public static class_243 thbth(class_238 class_2383, class_243 class_2432, double d) {
        if (class_2432 == null || khdh_3.mc.field_1724 == null || khdh_3.mc.field_1687 == null) {
            return class_2432;
        }
        if (khdh_3.shsh_5(class_2383, class_2432, d)) {
            return class_2432;
        }
        double d2 = 0.12;
        class_243 class_2433 = null;
        double d3 = Double.MAX_VALUE;
        for (double d4 = class_2383.field_1323; d4 <= class_2383.field_1320; d4 += d2) {
            for (double d5 = class_2383.field_1322; d5 <= class_2383.field_1325; d5 += d2) {
                for (double d6 = class_2383.field_1321; d6 <= class_2383.field_1324; d6 += d2) {
                    double d7;
                    class_243 class_2434 = new class_243(d4, d5, d6);
                    if (!khdh_3.shsh_5(class_2383, class_2434, d) || !((d7 = class_2434.method_1025(class_2432)) < d3)) continue;
                    d3 = d7;
                    class_2433 = class_2434;
                }
            }
        }
        return class_2433 != null ? class_2433 : class_2432;
    }

    private static boolean shsh_5(class_238 class_2383, class_243 class_2432, double d) {
        if (khdh_3.mc.field_1724 == null) {
            return false;
        }
        class_243 class_2433 = khdh_3.mc.field_1724.method_33571();
        double d2 = class_2433.method_1022(class_2432);
        if (d2 > d) {
            return false;
        }
        class_243 class_2434 = class_2432.method_1020(class_2433).method_1029();
        if (!btb_2.khtw(class_2434, d2 + 0.2, class_2383)) {
            return false;
        }
        class_3965 class_39652 = btb_2.zaq_3(class_2433, class_2432, class_3959.class_3960.field_17558, (class_1297)khdh_3.mc.field_1724);
        return class_39652 == null || class_39652.method_17783() == class_239.class_240.field_1333 || class_2433.method_1025(class_39652.method_17784()) >= class_2433.method_1025(class_2432) - 1.0E-4;
    }

    public static class_243 jykh(class_1297 class_12972, class_238 class_2383, double d) {
        try {
            int n = 41834054;
            n = Integer.rotateLeft(n * -1357577271, 23) ^ 0xC148E67E;
            class_1297 class_12973 = class_12972;
            n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
            class_238 class_2384 = class_2383;
            n = (class_2384 != null ? System.identityHashCode(class_2384) : 0) ^ n;
            int n2 = n ^ 0x3DA6F94E;
            if ((n2 ^ n) != 1034352974) {
                int cfr_ignored_0 = (0x3FD8AF08 ^ n) - 113890882;
            }
            if ((0x1EB & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (khdh_3.mc.field_1724 == null) {
            return khdh_3.dth_6(class_2383);
        }
        float f = Float.intBitsToFloat(-1809183344 - 1485190790);
        float f2 = khdh_3.anq(khdh_3.szs_6(0xCFD319C6 ^ 0xF322CECC, 6));
        float f3 = Float.intBitsToFloat(0xA81A16D9 ^ 0x92DE8D7F);
        float f4 = Float.intBitsToFloat(1039793842 - 25443363);
        double d2 = class_2383.method_17939();
        double d3 = class_2383.method_17940();
        double d4 = class_2383.method_17941();
        if (dhdhkh != class_12972.method_5628()) {
            dhdhkh = class_12972.method_5628();
            hst_3 = new class_243(0.0, d3 * Double.longBitsToDouble(0x2324A5D1D544D2E2L ^ 0x1CC53C484CDD4B78L), 0.0);
            say_3 = new class_243((double)khdh_3.sqkh(Float.intBitsToFloat(0x8ED41D51 ^ 0x3277CA5B), Float.intBitsToFloat(99822154 + 917548224)), (double)khdh_3.thmk(Float.intBitsToFloat(0x4D23933B ^ 0xF1804431), Float.intBitsToFloat(0xAA10AEB3 ^ 0x96B379B9)), (double)khdh_3.sqkh(Float.intBitsToFloat(Integer.rotateLeft(0x7736CFC6 ^ 0xDD79852, 19)), Float.intBitsToFloat(Integer.rotateLeft(0xEC5C5E7F ^ 0x7D9402E, 17))));
        }
        hst_3 = hst_3.method_1019(say_3);
        double d5 = (d2 - Double.longBitsToDouble(0x39B450B6E9D7474FL ^ 0x60DC92F704EDED5L)) / khdh_3.dhml(0x141A8195DC59564DL ^ 0x541A8195DC59564DL);
        double d6 = (d4 - Double.longBitsToDouble(0x1C432DD98467D972L ^ 0x23FAB4401DFE40E8L)) / khdh_3.tzt_5(0xFF12910BCBB95111L ^ 0xBF12910BCBB95111L);
        if (khdh_3.hst_3.field_1352 >= d5) {
            say_3 = new class_243((double)(-khdh_3.sqkh(f, f2)), say_3.method_10214(), say_3.method_10215());
        } else if (khdh_3.hst_3.field_1352 <= -d5) {
            say_3 = new class_243((double)khdh_3.sqkh(f, f2), say_3.method_10214(), say_3.method_10215());
        }
        if (khdh_3.hst_3.field_1351 >= d3 * khdh_3.jtb_2(0xF698B03B9CE19855L ^ 0xC970B03B9CE19855L)) {
            say_3 = new class_243(khdh_3.dhqq(say_3), (double)(-khdh_3.dthb(f3, f4)), say_3.method_10215());
        } else if (khdh_3.hst_3.field_1351 <= d3 * Double.longBitsToDouble(0x5D2E4E7FEC28B406L ^ 0x62FD7D4CDF1B8735L)) {
            say_3 = new class_243(say_3.method_10216(), (double)khdh_3.sqkh(f3, f4), say_3.method_10215());
        }
        if (khdh_3.hst_3.field_1350 >= d6) {
            say_3 = new class_243(say_3.method_10216(), khdh_3.bthn(say_3), (double)(-khdh_3.sqkh(f, f2)));
        } else if (khdh_3.hst_3.field_1350 <= -d6) {
            say_3 = new class_243(khdh_3.bdm(say_3), say_3.method_10214(), (double)khdh_3.zwn(f, f2));
        }
        hst_3 = hst_3.method_1031((double)khdh_3.sqkh(Float.intBitsToFloat(Integer.rotateLeft(0xDEC17113 ^ 0x45BBE88A, 7)), Float.intBitsToFloat(0xA5402F36 ^ 0x980CE3FB)), 0.0, (double)khdh_3.sqkh(Float.intBitsToFloat(khdh_3.dbq_2(185828826) ^ 0xE6ED041D), Float.intBitsToFloat(0xC627A1CD ^ 0xFB6B6D00)));
        hst_3 = new class_243(khdh_3.tzl_2(khdh_3.hst_3.field_1352, -d5, d5), class_3532.method_15350((double)khdh_3.hst_3.field_1351, (double)(d3 * Double.longBitsToDouble(0xBB331D141FFC8A65L ^ 0x84E02E272CCFB956L)), (double)(d3 * Double.longBitsToDouble(0x4237A445661A4764L ^ 0x7DDFA445661A4764L))), class_3532.method_15350((double)khdh_3.hst_3.field_1350, (double)(-d6), (double)d6));
        class_243 class_2432 = new class_243(khdh_3.stth_3((class_238)class_2383).field_1352, class_2383.field_1322, class_2383.method_1005().field_1350);
        class_243 class_2433 = khdh_3.tnd_2(class_2432, hst_3);
        if (!btb_2.khtw(khdh_3.dhzz_3(bghdh.dss(class_2433)), d, class_2383)) {
            float f5 = (float)(d2 / Double.longBitsToDouble(0xE09B9BDE8B6CFBF8L ^ 0xA09B9BDE8B6CFBF8L)) * Float.intBitsToFloat(1100903030 - 38905257);
            for (float f6 = -f5; f6 <= f5; f6 += Float.intBitsToFloat(1600609704 + -563777755)) {
                for (float f7 = -f5; f7 <= f5; f7 += Float.intBitsToFloat(Integer.reverse(1572011665) ^ 0xB4B38177)) {
                    float f8 = (float)(d3 * Double.longBitsToDouble(0xCE4AA79965DC09B0L ^ 0xF1A66B55A910C57DL));
                    while ((double)f8 >= d3 * Double.longBitsToDouble(0xE3A86409C3E5A362L ^ 0xDC7B573AF0D69051L)) {
                        class_243 class_2434 = class_2432.method_1031((double)f6, (double)f8, (double)f7);
                        lb lb2 = bghdh.dss(class_2434);
                        if (khdh_3.taz_7(lb2.tshd_2(), d, class_2383)) {
                            hst_3 = new class_243((double)f6, (double)f8, (double)f7);
                            return class_2432.method_1019(hst_3);
                        }
                        f8 -= Float.intBitsToFloat(-1805489326 - 1452646021);
                    }
                }
            }
        }
        return class_2433;
    }

    public static void dhbr() {
        int n = 0;
        int n2 = 1240222434;
        n2 = Integer.rotateLeft(n2 * 235457651, 7) ^ 0x21E83896;
        int n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xEDFE6D32, 18) ^ 0x70E59C6A353747B4L ^ 0x70E59C6A353747B4L);
        while (true) {
            block20: {
                block32: {
                    block18: {
                        block31: {
                            block21: {
                                block23: {
                                    block19: {
                                        block22: {
                                            block29: {
                                                block26: {
                                                    block17: {
                                                        block30: {
                                                            block25: {
                                                                block27: {
                                                                    block28: {
                                                                        block24: {
                                                                            block15: {
                                                                                block16: {
                                                                                    if ((n = Integer.rotateRight(n3, 18) ^ n2) > -578812538) break block15;
                                                                                    if (n > -1095076911) break block16;
                                                                                    if (n == -1870783942) break block17;
                                                                                    if (n == -1383564701) break block18;
                                                                                    int cfr_ignored_0 = (Integer.rotateLeft(0xA80B8555 ^ n2, 8) - 1573045382) * -1475639979;
                                                                                    int cfr_ignored_1 = (int)(0x6AB92B6827D4EB4FL ^ (long)n2 ^ 0xABA0831A2DB978A3L);
                                                                                    if (n == -1095076911) break block19;
                                                                                    break block20;
                                                                                }
                                                                                if (n == -862689684) break block21;
                                                                                if (n == -694622872) break block22;
                                                                                if (n == -578812538) break block23;
                                                                                break block20;
                                                                            }
                                                                            if (n > -111384019) break block24;
                                                                            if (n == -302093006) break block25;
                                                                            if (n == -262917834) break block26;
                                                                            int cfr_ignored_2 = Integer.rotateRight(0x983DBA2E ^ n2, 6) - 1943481037;
                                                                            if (n == -111384019) break block27;
                                                                            break block20;
                                                                        }
                                                                        if (n > 662551170) break block28;
                                                                        if (n == -105049116) break block29;
                                                                        if (n == 662551170) break block30;
                                                                        int cfr_ignored_3 = (Integer.rotateLeft(0xA1CF1DB4 ^ n2, 7) - -1670236153) * -1580261963;
                                                                        break block20;
                                                                    }
                                                                    if (n == 715974955) break block31;
                                                                    if (n == 986011290) break block32;
                                                                    break block20;
                                                                }
                                                                int cfr_ignored_4 = (Integer.rotateRight(0x1885CBF7 ^ n2, 6) - -57585116) * 411421687;
                                                                dhdhkh = 966310043 - -1181173605;
                                                                hst_3 = class_243.field_1353;
                                                                say_3 = class_243.field_1353;
                                                                return;
                                                            }
                                                            int cfr_ignored_5 = (Integer.rotateRight(0x97AA861A ^ n2, 5) + 1644420193) * -1750432229;
                                                            if (yf.khdha_2()) {
                                                                int cfr_ignored_6 = (int)(0x19C82F92DADECDFAL ^ (long)n2 ^ 0xA255790E60D39E41L);
                                                                n3 = Integer.rotateLeft(n2 ^ 0xC87E1C5F, 18) ^ 0x718D920 ^ 0x718D920;
                                                                int cfr_ignored_7 = (int)(0x9675C837005346BCL ^ (long)n2 ^ 0x6D1ECC15765E813AL);
                                                                n3 = Integer.rotateLeft(n2 ^ 0xF95C6A2D, 18) ^ 0x56E8F05D ^ 0x56E8F05D;
                                                                continue;
                                                            }
                                                            try {
                                                                n -= 3;
                                                                if ((0xDEED400FE11351CFL ^ (long)n2 | 1L) == 0L) {
                                                                    throw new IllegalArgumentException();
                                                                }
                                                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x277DBA82, 18)));
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                n3 = Integer.rotateLeft(n2 ^ 0x277DBA82, 18);
                                                            }
                                                            continue;
                                                        }
                                                        int cfr_ignored_8 = (Integer.rotateRight(0x788CB05E ^ n2, 18) - -1654195555) * 2022486111;
                                                        yf.athz_2();
                                                        int cfr_ignored_9 = (int)(0x1B8BB0CC00EF3934L ^ (long)n2 ^ 0x9CE8CD6D894F9AC6L);
                                                        n3 = Integer.rotateLeft(n2 ^ 0x5F463D8A, 18) + 78821361 - 78821361;
                                                        int cfr_ignored_10 = (int)(0xCFCA35DFDDFF2D74L ^ (long)n2 ^ 0x96CF774DA1CE3245L);
                                                        n3 = Integer.rotateLeft(n2 ^ 0xF95C6A2D, 18) + -1935879636 - -1935879636;
                                                        n += 4;
                                                        continue;
                                                    }
                                                    int cfr_ignored_11 = Integer.rotateRight(0xC21B46C3 ^ n2, 11) + -2052378408;
                                                    n3 = Integer.rotateLeft(n2 ^ 0xE0B52760, 18) + -498158283 - -498158283;
                                                    int cfr_ignored_12 = (Integer.rotateRight(0xFA03E737 ^ n2, 18) - 1255579364) * -100407497;
                                                    n3 = Integer.rotateLeft(n2 ^ 0xEDFE6D32, 18) ^ 0xAEB4433B ^ 0xAEB4433B;
                                                    int cfr_ignored_13 = (Integer.rotateLeft(0x32420079 ^ n2, 9) + 442215906) * 843186297;
                                                    int cfr_ignored_14 = (int)(0xF0F0AE4427D4EB4FL ^ (long)n2 ^ 0xA1F8831A2DB84C30L);
                                                    n -= 4;
                                                    continue;
                                                }
                                                int cfr_ignored_15 = Integer.rotateRight(0xD5EC40A ^ n2, 4) + -1562944399;
                                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x7320FC6D, 18)));
                                                int cfr_ignored_16 = (Integer.rotateLeft(0x2C640490 ^ n2, 8) + 1685728427) * 744752273;
                                                n3 = Integer.rotateLeft(n2 ^ 0xEDFE6D32, 18) + -1008118729 - -1008118729;
                                                n -= 5;
                                                continue;
                                            }
                                            int cfr_ignored_17 = (Integer.rotateLeft(0xF3E44198 ^ n2, 17) + -1929277277) * -203144807;
                                            try {
                                                n += 2;
                                                if ((0x454131BECB6D5D31L ^ (long)n2 | 1L) == 0L) {
                                                    throw new ArithmeticException();
                                                }
                                                n3 = Integer.rotateLeft(n2 ^ 0xEDFE6D32, 18) ^ 0x88C87DD6 ^ 0x88C87DD6;
                                            }
                                            catch (ArithmeticException arithmeticException) {
                                                n3 = Integer.rotateLeft(n2 ^ 0xEDFE6D32, 18) + -611046800 - -611046800;
                                            }
                                            ++n;
                                            continue;
                                        }
                                        int cfr_ignored_18 = Integer.rotateRight(0x461870C2 ^ n2, 11) + -2125248839;
                                        try {
                                            ++n;
                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xEDFE6D32, 18)));
                                        }
                                        catch (NoSuchElementException noSuchElementException) {
                                            n3 = Integer.rotateLeft(n2 ^ 0xEDFE6D32, 18) ^ 0x2E874805 ^ 0x2E874805;
                                        }
                                        n -= 2;
                                        continue;
                                    }
                                    int cfr_ignored_19 = (Integer.rotateLeft(0x9449B731 ^ n2, 5) + -112538070) * -1807108303;
                                    int cfr_ignored_20 = (int)(0x56FB190C27D4EB4FL ^ (long)n2 ^ 0xCF68831A2DB90027L);
                                    n3 = Integer.rotateLeft(n2 ^ 0xB3B76CC2, 18) + 618116582 - 618116582;
                                    int cfr_ignored_21 = (Integer.rotateLeft(0xB709CE78 ^ n2, 9) + 781033411) * -1224094087;
                                    int cfr_ignored_22 = (int)(0xFAE890B2F92FCAD7L ^ (long)n2 ^ 0xDC153EEC6E885800L);
                                    n3 = Integer.rotateLeft(n2 ^ 0xFD0986E3, 18) ^ 0x3AC59019 ^ 0x3AC59019;
                                    int cfr_ignored_23 = (int)(0xE3613895F9730A70L ^ (long)n2 ^ 0x8C5B3E55EFC66B13L);
                                    n3 = Integer.rotateLeft(n2 ^ 0xEDFE6D32, 18) + -1084267586 - -1084267586;
                                    continue;
                                }
                                int cfr_ignored_24 = Integer.rotateRight(0xAADDA106 ^ n2, 8) - -1254875403;
                                n3 = Integer.rotateLeft(n2 ^ 0x707A1E6C, 18);
                                int cfr_ignored_25 = (Integer.rotateRight(0xD37B949B ^ n2, 13) + -1605067264) * -746875749;
                                int cfr_ignored_26 = (int)(0x9C7115D518B34C8FL ^ (long)n2 ^ 0xD6DAFDD562389533L);
                                n3 = Integer.rotateLeft(n2 ^ 0xEDFE6D32, 18) ^ 0xB09A9624 ^ 0xB09A9624;
                                n += 5;
                                continue;
                            }
                            int cfr_ignored_27 = Integer.rotateLeft(0x4C5C26E4 ^ n2, 12) - 1132877015;
                            n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xED291F5, 18) ^ 0x5BFE3E35E2503416L ^ 0x5BFE3E35E2503416L);
                            int cfr_ignored_28 = (Integer.rotateLeft(0xA153B2DC ^ n2, 7) - -1920972833) * -1588350243;
                            try {
                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xEDFE6D32, 18)));
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xEDFE6D32, 18)));
                            }
                            continue;
                        }
                        int cfr_ignored_29 = (Integer.rotateRight(0x447B41B2 ^ n2, 11) + 1330287561) * 1148928435;
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x12F03B76, 18)));
                        int cfr_ignored_30 = Integer.rotateLeft(0x39164144 ^ n2, 10) - -300972425;
                        try {
                            ++n;
                            if ((0xAF12DEB8950E48ADL ^ (long)n2 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xEDFE6D32, 18)));
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n3 = Integer.rotateLeft(n2 ^ 0xEDFE6D32, 18) ^ 0x618A51C ^ 0x618A51C;
                        }
                        n += 5;
                        continue;
                    }
                    int cfr_ignored_31 = Integer.rotateLeft(0x7FE6BFCC ^ n2, 18) - -2125539089;
                    n3 = Integer.rotateLeft(n2 ^ 0x41826800, 18);
                    int cfr_ignored_32 = Integer.rotateRight(0xFC49A86B ^ n2, 18) + -1857485776;
                    int cfr_ignored_33 = (int)(0x6E43D9378BB7E255L ^ (long)n2 ^ 0x4F1FDBDC3F8D7156L);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xEDFE6D32, 18)));
                    continue;
                }
                int cfr_ignored_34 = (Integer.rotateRight(0xEF6F811F ^ n2, 16) - 48120316) * -277905121;
                n3 = Integer.rotateLeft(n2 ^ 0x149D1130, 18);
                int cfr_ignored_35 = Integer.rotateRight(0x10684562 ^ n2, 5) + 16647705;
                int cfr_ignored_36 = (int)(0x94FA025F21BFC124L ^ (long)n2 ^ 0xF9CE8FCC796E8425L);
                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x5DB95A92, 18) ^ 0xE1BA795F8C7E3868L ^ 0xE1BA795F8C7E3868L);
                int cfr_ignored_37 = (int)(0x534D2CEFAE1CB705L ^ (long)n2 ^ 0xA4AF908A952D0B4BL);
                n3 = Integer.rotateLeft(n2 ^ 0xEDFE6D32, 18);
                n += 4;
                continue;
            }
            int cfr_ignored_38 = (Integer.rotateLeft(0xEB32D45D ^ n2, 16) - 2139444862) * -348990371;
            int cfr_ignored_39 = (int)(0x29807A6027D4EB4FL ^ (long)n2 ^ 0x9B0831A2DB9FED1L);
            n3 = Integer.rotateLeft(n2 ^ 0xEDFE6D32, 18);
        }
    }

    private static float sqkh(float f, float f2) {
        try {
            int n = -527870374;
            n = Integer.rotateLeft(n * -115941753, 24) ^ 0x6E79BA24;
            n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 4);
            int n2 = n ^ 0xD31EB38F;
            if ((n2 ^ n) != -752962673) {
                int cfr_ignored_0 = (0x3397E5D5 ^ n) - 2005046621;
            }
            if ((0x1FF & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return (float)(ThreadLocalRandom.current().nextDouble() * (double)(f2 - f) + (double)f);
    }

    private static boolean dfd_3() {
        block0: {
            int n = -1312123306;
            int n2 = (n = Integer.rotateLeft(n * -905653657, 10) ^ 0xAFA58395) ^ 0xFD701276;
            if ((n2 ^ n) == -42986890) break block0;
            int cfr_ignored_0 = (0x4CBA8420 ^ n) + -1344953343;
        }
        return yf.dnkh();
    }

    private static class_243 ttkh(class_746 class_7462) {
        block0: {
            int n = -1228046664;
            n = Integer.rotateLeft(n * -1369483595, 6) ^ 0x42A4B8;
            class_746 class_7463 = class_7462;
            n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 19);
            int n2 = n ^ 0x72DBC750;
            if ((n2 ^ n) == 1927006032) break block0;
            int cfr_ignored_0 = (0xC416B9E8 ^ n) + -118598790;
        }
        return class_7462.method_33571();
    }

    private static class_243 sjz_3(class_238 class_2383) {
        block0: {
            int n = 1814101347;
            int n2 = (n = Integer.rotateLeft(n * 1544708193, 9) ^ 0x75DCB00B) ^ 0x92818B65;
            if ((n2 ^ n) == -1837003931) break block0;
            int cfr_ignored_0 = (0xFEA17606 ^ n) + 1744446168;
        }
        return class_2383.method_1005();
    }

    private static double ghdt_4(long l) {
        block0: {
            int n = bthb.hnz(1548874432);
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 14)) ^ 0x16B056E0;
            if ((n2 ^ n) == 380655328) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x4AE1A420 ^ n, 12) + 363888411;
        }
        return Double.longBitsToDouble(l);
    }

    private static double ghby(long l) {
        block0: {
            int n = -1117192405;
            int n2 = (n = Integer.rotateLeft(n * -1046033437, 24) ^ 0x14D6C26D) ^ 0xA15A7536;
            if ((n2 ^ n) == -1587907274) break block0;
            int cfr_ignored_0 = (0x1C328A1D ^ n) + -541873233;
        }
        return Double.longBitsToDouble(l);
    }

    private static boolean shdhy() {
        block0: {
            int n = bthb.hnz(940523394);
            int n2 = n ^ 0x503B65CE;
            if ((n2 ^ n) == 1346069966) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x68345A4C ^ n, 16) - -1565225361;
        }
        return yf.dnkh();
    }

    private static double jghm(long l) {
        block0: {
            int n = 952072457;
            int n2 = (n = Integer.rotateLeft(n * -300076683, 24) ^ 0x44642092) ^ 0xCD182AEF;
            if ((n2 ^ n) == -854054161) break block0;
            int cfr_ignored_0 = (0xF5A753E6 ^ n) - 19626939;
        }
        return Double.longBitsToDouble(l);
    }

    private static double zak_3(double d) {
        block0: {
            int n = 2034187197;
            int n2 = (n = Integer.rotateLeft(n * 1487839749, 6) ^ 0xD94117E9) ^ 0x1B558E43;
            if ((n2 ^ n) == 458591811) break block0;
            int cfr_ignored_0 = (0x626AB5FE ^ n) - -1661320296;
        }
        return Math.cos(d);
    }

    private static class_243 dth_6(class_238 class_2383) {
        block0: {
            int n = 1474433225;
            int n2 = (n = Integer.rotateLeft(n * -721792699, 9) ^ 0x69E54A3F) ^ 0xB2A6E1A;
            if ((n2 ^ n) == 187330074) break block0;
            int cfr_ignored_0 = (0x5CC87ED3 ^ n) + -1794989772;
        }
        return class_2383.method_1005();
    }

    private static int szs_6(int n, int n2) {
        block0: {
            int n3 = 1453045122;
            n3 = Integer.rotateLeft(n3 * -1025967595, 9) ^ 0xCD74D733;
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 8)) ^ 0x33516223;
            if ((n4 ^ n3) == 860971555) break block0;
            int cfr_ignored_0 = (0x65CAD7A1 ^ n3) - 1687843125;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float anq(int n) {
        block0: {
            int n2 = -1121665979;
            n2 = Integer.rotateLeft(n2 * 1332802817, 21) ^ 0x45A2463E;
            int n3 = (n2 = n ^ n2) ^ 0x12FD3227;
            if ((n3 ^ n2) == 318583335) break block0;
            int cfr_ignored_0 = (0xAFD98E62 ^ n2) - -1145948100;
        }
        return Float.intBitsToFloat(n);
    }

    private static float thmk(float f, float f2) {
        block0: {
            int n = bthb.hnz(1115808386);
            int n2 = n ^ 0x73249CF6;
            if ((n2 ^ n) == 1931779318) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x31A57E74 ^ n, 9) - 124251975) * 832929397;
        }
        return khdh_3.sqkh(f, f2);
    }

    private static double dhml(long l) {
        block0: {
            int n = -428089795;
            int n2 = (n = Integer.rotateLeft(n * -1423018321, 9) ^ 0xEC19B46D) ^ 0x8A051BEB;
            if ((n2 ^ n) == -1979376661) break block0;
            int cfr_ignored_0 = (0x6C7EC5D6 ^ n) + 1795752537;
        }
        return Double.longBitsToDouble(l);
    }

    private static double tzt_5(long l) {
        block0: {
            int n = bthb.hnz(519411760);
            int n2 = (n = (int)l ^ n) ^ 0x802CAD18;
            if ((n2 ^ n) == -2144555752) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x9ED93528 ^ n, 6) + 1084952339;
        }
        return Double.longBitsToDouble(l);
    }

    private static double jtb_2(long l) {
        block0: {
            int n = 1954652784;
            n = Integer.rotateLeft(n * 706338163, 10) ^ 0xB2ECC772;
            int n2 = (n = Integer.rotateRight((int)l ^ n, 19)) ^ 0x699D720B;
            if ((n2 ^ n) == 1771926027) break block0;
            int cfr_ignored_0 = (0x1D1CD07B ^ n) + 1109628456;
        }
        return Double.longBitsToDouble(l);
    }

    private static double dhqq(class_243 class_2432) {
        block0: {
            int n = 1682722267;
            int n2 = (n = Integer.rotateLeft(n * -1618239567, 5) ^ 0x213ED8E3) ^ 0xDD78287B;
            if ((n2 ^ n) == -579327877) break block0;
            int cfr_ignored_0 = (0xB93465A0 ^ n) + 2037994843;
        }
        return class_2432.method_10216();
    }

    private static float dthb(float f, float f2) {
        block0: {
            int n = 1957979892;
            int n2 = (n = Integer.rotateLeft(n * 17787831, 5) ^ 0x76C7ED73) ^ 0xB4514AAE;
            if ((n2 ^ n) == -1269740882) break block0;
            int cfr_ignored_0 = (0xC0E52C5A ^ n) + -1432871103;
        }
        return khdh_3.sqkh(f, f2);
    }

    private static double bthn(class_243 class_2432) {
        block0: {
            int n = 1454811430;
            int n2 = (n = Integer.rotateLeft(n * 1476913669, 10) ^ 0xA60E9952) ^ 0xBE1D2906;
            if ((n2 ^ n) == -1105385210) break block0;
            int cfr_ignored_0 = (0xE8AB8020 ^ n) + 968573620;
        }
        return class_2432.method_10214();
    }

    private static double bdm(class_243 class_2432) {
        block0: {
            int n = -1139603575;
            int n2 = (n = Integer.rotateLeft(n * -1481850019, 12) ^ 0x66DFA38A) ^ 0x62F75EE0;
            if ((n2 ^ n) == 1660378848) break block0;
            int cfr_ignored_0 = (0xDEE45969 ^ n) + -890400141;
        }
        return class_2432.method_10216();
    }

    private static float zwn(float f, float f2) {
        block0: {
            int n = 1504523539;
            int n2 = (n = Integer.rotateLeft(n * 1800852415, 22) ^ 0xA9F9FD51) ^ 0x648AB109;
            if ((n2 ^ n) == 1686810889) break block0;
            int cfr_ignored_0 = (0x3D27841A ^ n) + 1715292452;
        }
        return khdh_3.sqkh(f, f2);
    }

    private static int dbq_2(int n) {
        block0: {
            int n2 = -1052123883;
            n2 = Integer.rotateLeft(n2 * 723513927, 21) ^ 0x3A6CC1AD;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 10)) ^ 0x5537D4C0;
            if ((n3 ^ n2) == 1429722304) break block0;
            int cfr_ignored_0 = (0x947E09D5 ^ n2) + -159998858;
        }
        return Integer.reverse(n);
    }

    private static double tzl_2(double d, double d2, double d3) {
        block0: {
            int n = -957563340;
            n = Integer.rotateLeft(n * -1023736815, 5) ^ 0xF63DA599;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d2) ^ n, 22);
            int n2 = n ^ 0xB919EFC6;
            if ((n2 ^ n) == -1189482554) break block0;
            int cfr_ignored_0 = (0x7FF551F2 ^ n) + -466996495;
        }
        return class_3532.method_15350((double)d, (double)d2, (double)d3);
    }

    private static class_243 stth_3(class_238 class_2383) {
        block0: {
            int n = bthb.hnz(269084227);
            int n2 = n ^ 0x29D5E870;
            if ((n2 ^ n) == 701884528) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x39DC0E33 ^ n, 10) + 100882280) * 970722867;
        }
        return class_2383.method_1005();
    }

    private static class_243 tnd_2(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = bthb.hnz(-743378528);
            class_243 class_2434 = class_2432;
            n = Integer.rotateLeft((class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n, 5);
            int n2 = n ^ 0xE69897AF;
            if ((n2 ^ n) == -426207313) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x3528660F ^ n, 9) - 1950481164;
        }
        return class_2432.method_1019(class_2433);
    }

    private static class_243 dhzz_3(lb lb2) {
        block0: {
            int n = bthb.hnz(-585452432);
            lb lb3 = lb2;
            n = (lb3 != null ? System.identityHashCode(lb3) : 0) ^ n;
            int n2 = n ^ 0xB182055B;
            if ((n2 ^ n) == -1316879013) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x6C98B12B ^ n, 16) + 719000432;
        }
        return lb2.tshd_2();
    }

    private static boolean taz_7(class_243 class_2432, double d, class_238 class_2383) {
        block0: {
            int n = 1923922331;
            n = Integer.rotateLeft(n * 1767578361, 20) ^ 0xB1A6BB26;
            class_243 class_2433 = class_2432;
            n = Integer.rotateRight((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 13);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 6);
            int n2 = n ^ 0x48D587;
            if ((n2 ^ n) == 4773255) break block0;
            int cfr_ignored_0 = (0x72E46C1C ^ n) - 395630283;
        }
        return btb_2.khtw(class_2432, d, class_2383);
    }

    private static String[] thht(String string) {
        int n = 858385422;
        int n2 = (n = Integer.rotateLeft(n * -1488805363, 5) ^ 0x53F78553) ^ 0xD1C5D1A4;
        if ((n2 ^ n) != -775564892) {
            int cfr_ignored_0 = (0xE2EC3DAA ^ n) - -59615516;
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite akl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1653923485;
            n3 = Integer.rotateLeft(n3 * 1431373867, 27) ^ 0x5BCA113A;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 12);
            n3 = Integer.rotateRight(n2 ^ n3, 23);
            int n4 = n3 ^ 0xCEBB8059;
            if ((n4 ^ n3) != -826572711) {
                int cfr_ignored_0 = (0x53D0A13A ^ n3) + -586526847;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ stz_4 ^ string.hashCode()) + (n2 + shhh_4) + i ^ stz_4, 8) + shhh_4);
            }
            String[] stringArray = khdh_3.thht(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] q04bal0hztfs(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite smomqrezqf(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ zi8aygs3mqpl ^ string.hashCode()) + (n2 + dgefi88awla) + i ^ zi8aygs3mqpl, 4) + dgefi88awla);
            }
            String[] stringArray = khdh_3.q04bal0hztfs(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

