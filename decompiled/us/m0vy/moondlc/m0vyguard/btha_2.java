/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Random;
import us.m0vy.moondlc.m0vyguard.bthd;
import us.m0vy.moondlc.m0vyguard.yf;

public class btha_2 {
    private final int[] dhdth_2 = new int[Integer.reverse(-1972072845) ^ 0xCE712C51];
    private static final int bdhd = -2036495569;
    private static final int dhysh = 393137719;
    private static final int pvnn56m5 = 1394122480;
    private static final int tjn10ve = -56108989;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ivjlvi3rtnk;

    public btha_2() {
        this(System.currentTimeMillis());
    }

    public btha_2(long l) {
        int n;
        Random random = new Random(l);
        int[] nArray = new int[1810723359 + -1810723103];
        int n2 = 0;
        while (n2 < Integer.rotateLeft(0xBA8C4221 ^ 0x3A8C4221, 9)) {
            nArray[n2] = n2++;
        }
        for (n = 0; n < (0x442F771D ^ 0x442F761D); ++n) {
            int n3 = random.nextInt(-1748479702 + 1748479958 - n) + n;
            int n4 = nArray[n];
            nArray[n] = nArray[n3];
            nArray[n3] = n4;
        }
        for (n = 0; n < -699370873 - -699371129; ++n) {
            int n5 = nArray[n];
            this.dhdth_2[n + (Integer.reverse((int)-470177824) ^ 0x7E59EC7)] = n5;
            this.dhdth_2[n] = n5;
        }
    }

    public double thdhz(double d) {
        block0: {
            int n = bthd.tts_5(1255667850);
            int n2 = n ^ 0x6C35A5DD;
            if ((n2 ^ n) == 1815455197) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x26E25D57 ^ n, 7) - -1178145596) * 652369239;
        }
        return this.zfa_4(d, 0.0, 0.0);
    }

    public double ghsgh(double d, double d2) {
        block0: {
            int n = bthd.tts_5(1491754192);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x2E120A8;
            if ((n2 ^ n) == 48308392) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x5A0B7C78 ^ n, 14) + -339627581) * 1510702201;
        }
        return this.zfa_4(d, d2, 0.0);
    }

    /*
     * Unable to fully structure code
     */
    public double zfa_4(double var1_1, double var3_2, double var5_3) {
        var7_4 = 0;
        var8_5 = 0;
        var9_6 = 0;
        var10_7 = 0.0;
        var12_8 = 0.0;
        var14_9 = 0.0;
        var16_10 = 0;
        var17_11 = 0;
        var18_12 = 0;
        var19_13 = 0;
        var20_14 = 0;
        var21_15 = 0;
        var24_16 = 0;
        var22_17 = -186425991;
        var22_17 = Integer.rotateLeft(var22_17 * 1603029943, 10) ^ -1184780566;
        var22_17 = Integer.rotateRight(System.identityHashCode(this) ^ var22_17, 12);
        var22_17 = (int)Double.doubleToLongBits(var1_1) ^ var22_17;
        var23_18 = -1532110600 * -856380183 + -803917904 ^ var22_17;
        while (true) {
            block25: {
                block26: {
                    block29: {
                        block31: {
                            block30: {
                                block32: {
                                    block33: {
                                        block34: {
                                            block27: {
                                                block23: {
                                                    block24: {
                                                        block28: {
                                                            var24_16 = ((var23_18 ^ var22_17) - -803917904) * 684125017;
                                                            switch (var24_16 & 7) {
                                                                case 6: {
                                                                    if (var24_16 != 860994838) {
                                                                        ** break;
                                                                    }
                                                                    break block23;
                                                                }
                                                                case 0: {
                                                                    if (var24_16 == -1532110600) break block24;
                                                                    if (var24_16 == -346955144) break block25;
                                                                    if (var24_16 != -175878328) {
                                                                        ** break;
                                                                    }
                                                                    break block26;
                                                                }
                                                                case 5: {
                                                                    if (var24_16 == -1881245539) break block27;
                                                                    if (var24_16 == -31826251) break block28;
                                                                    Integer.rotateLeft(1169458432 ^ var22_17, 11) + 1966717499;
                                                                    if (var24_16 != -1959451979) {
                                                                        ** break;
                                                                    }
                                                                    break block29;
                                                                }
                                                                case 3: {
                                                                    if (var24_16 == -1514795301) break block30;
                                                                    if (var24_16 == -1039113837) break block31;
                                                                    if (var24_16 != -807473493) {
                                                                        ** break;
                                                                    }
                                                                    break block32;
                                                                }
                                                                case 7: {
                                                                    if (var24_16 == -1370071577) break;
                                                                    if (var24_16 != -1808900041) {
                                                                        (Integer.rotateLeft(-1696676400 ^ var22_17, 6) + -984116373) * -1696676399;
                                                                        ** break;
                                                                    }
                                                                    break block33;
                                                                }
                                                                case 2: {
                                                                    if (var24_16 != -865525814) {
                                                                        ** break;
                                                                    }
                                                                    break block34;
                                                                }
                                                            }
                                                            Integer.rotateLeft(308810380 ^ var22_17, 5) - 1056431663;
                                                            yf.athz_2();
                                                            try {
                                                                var24_16 += 5;
                                                                if ((2637638896097013715L ^ (long)var22_17 | 1L) == 0L) {
                                                                    throw new UnsupportedOperationException();
                                                                }
                                                                var23_18 = (int)((long)(-31826251 * -856380183 + -803917904 ^ var22_17) ^ -288641516803847078L ^ -288641516803847078L);
                                                            }
                                                            catch (UnsupportedOperationException v0) {
                                                                var23_18 = (int)((long)(-31826251 * -856380183 + -803917904 ^ var22_17) ^ -5133896768159937345L ^ -5133896768159937345L);
                                                            }
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(-1059082466 ^ var22_17, 11) - 1601426397) * -1059082465;
                                                        var7_4 = (int)Math.floor(var1_1) & (Integer.reverse(872305670) ^ 1613397811);
                                                        var8_5 = (int)Math.floor(var3_2) & (-448775747 ^ -448775870);
                                                        var9_6 = (int)Math.floor(var5_3) & 813346009 - 813345754;
                                                        var1_1 -= Math.floor(var1_1);
                                                        var3_2 -= Math.floor(var3_2);
                                                        var5_3 -= Math.floor(var5_3);
                                                        var10_7 = btha_2.dhwz(var1_1);
                                                        var12_8 = btha_2.dhwz(var3_2);
                                                        var14_9 = btha_2.dhwz(var5_3);
                                                        var16_10 = this.dhdth_2[var7_4] + var8_5;
                                                        var17_11 = this.dhdth_2[var16_10] + var9_6;
                                                        var18_12 = this.dhdth_2[var16_10 + 1] + var9_6;
                                                        var19_13 = this.dhdth_2[var7_4 + 1] + var8_5;
                                                        var20_14 = this.dhdth_2[var19_13] + var9_6;
                                                        var21_15 = this.dhdth_2[var19_13 + 1] + var9_6;
                                                        return btha_2.afa_2(var14_9, btha_2.tzd_4(var12_8, btha_2.saa_6(var10_7, btha_2.rta_2(this.dhdth_2[var17_11], var1_1, var3_2, var5_3), btha_2.rta_2(this.dhdth_2[var20_14], var1_1 - 1.0, var3_2, var5_3)), btha_2.afa_2(var10_7, btha_2.rta_2(this.dhdth_2[var18_12], var1_1, var3_2 - 1.0, var5_3), btha_2.thzdh(this.dhdth_2[var21_15], var1_1 - 1.0, var3_2 - 1.0, var5_3))), btha_2.sqn_2(var12_8, btha_2.khmth(var10_7, btha_2.zjgh_2(this.dhdth_2[var17_11 + 1], var1_1, var3_2, var5_3 - 1.0), btha_2.rta_2(this.dhdth_2[var20_14 + 1], var1_1 - 1.0, var3_2, var5_3 - 1.0)), btha_2.afa_2(var10_7, btha_2.rta_2(this.dhdth_2[var18_12 + 1], var1_1, var3_2 - 1.0, var5_3 - 1.0), btha_2.rta_2(this.dhdth_2[var21_15 + 1], var1_1 - 1.0, var3_2 - 1.0, var5_3 - 1.0))));
                                                    }
                                                    Integer.rotateLeft(-705891612 ^ var22_17, 13) - -334559017;
                                                    if (yf.khdha_2()) {
                                                        var23_18 = (1266847688 * -856380183 + -803917904 ^ var22_17) + -434768618 - -434768618;
                                                        Integer.rotateRight(-1577633426 ^ var22_17, 7) - -1588751475;
                                                        var23_18 = (int)((long)(-31826251 * -856380183 + -803917904 ^ var22_17) ^ -4600159306033982157L ^ -4600159306033982157L);
                                                        continue;
                                                    }
                                                    try {
                                                        var24_16 += 4;
                                                        var23_18 = (int)((long)(-1370071577 * -856380183 + -803917904 ^ var22_17) ^ -7712086800741193820L ^ -7712086800741193820L);
                                                    }
                                                    catch (ArithmeticException v1) {
                                                        var23_18 = -1370071577 * -856380183 + -803917904 ^ var22_17 ^ 764460070 ^ 764460070;
                                                    }
                                                    var24_16 += 5;
                                                    continue;
                                                }
                                                Integer.rotateRight(1929027535 ^ var22_17, 17) - -256444084;
                                                var23_18 = 1211399182 * -856380183 + -803917904 ^ var22_17 ^ 1153675744 ^ 1153675744;
                                                (Integer.rotateRight(-380593986 ^ var22_17, 16) - 1159732797) * -380593985;
                                                var23_18 = Integer.reverse(Integer.reverse(-1532110600 * -856380183 + -803917904 ^ var22_17));
                                                (Integer.rotateLeft(2008836696 ^ var22_17, 17) + -2077327389) * 2008836697;
                                                var24_16 += 5;
                                                continue;
                                            }
                                            Integer.rotateLeft(-974159287 ^ var22_17, 11) + -60922350;
                                            (int)(530629208495680335L ^ (long)var22_17 ^ -6514312712531893397L);
                                            (int)(4522213792448842805L ^ (long)var22_17 ^ -4645218778503851947L);
                                            var23_18 = Integer.reverse(Integer.reverse(-1532110600 * -856380183 + -803917904 ^ var22_17));
                                            var24_16 -= 5;
                                            continue;
                                        }
                                        (Integer.rotateRight(1963089778 ^ var22_17, 17) + 799485449) * 1963089779;
                                        (int)(3065106836311367818L ^ (long)var22_17 ^ 1849833035155110083L);
                                        var23_18 = Integer.reverse(Integer.reverse(1919124546 * -856380183 + -803917904 ^ var22_17));
                                        (int)(3585211488565133606L ^ (long)var22_17 ^ -8591243466213962157L);
                                        var23_18 = Integer.reverse(Integer.reverse(-1532110600 * -856380183 + -803917904 ^ var22_17));
                                        continue;
                                    }
                                    Integer.rotateLeft(-1476189696 ^ var22_17, 8) + 1556004155;
                                    (int)(8493002168792988624L ^ (long)var22_17 ^ -7673065325142260117L);
                                    var23_18 = -1532110600 * -856380183 + -803917904 ^ var22_17;
                                    var24_16 -= 4;
                                    continue;
                                }
                                Integer.rotateRight(-1314976981 ^ var22_17, 9) + -2036336272;
                                try {
                                    var24_16 += 4;
                                    var23_18 = -1532110600 * -856380183 + -803917904 ^ var22_17;
                                }
                                catch (IllegalArgumentException v2) {
                                    var23_18 = (-1532110600 * -856380183 + -803917904 ^ var22_17) + 1963609038 - 1963609038;
                                }
                                var24_16 -= 3;
                                continue;
                            }
                            Integer.rotateRight(1995376459 ^ var22_17, 17) + 1800372560;
                            var23_18 = 1750526674 * -856380183 + -803917904 ^ var22_17 ^ -629209735 ^ -629209735;
                            (Integer.rotateRight(1303997183 ^ var22_17, 12) - 1842451484) * 1303997183;
                            var23_18 = (int)((long)(-1532110600 * -856380183 + -803917904 ^ var22_17) ^ -1782269747234966404L ^ -1782269747234966404L);
                            var24_16 -= 4;
                            continue;
                        }
                        Integer.rotateRight(-748965746 ^ var22_17, 13) - -1669857171;
                        (int)(-579874864673886808L ^ (long)var22_17 ^ 4662568586722034230L);
                        var23_18 = -802206472 * -856380183 + -803917904 ^ var22_17;
                        (int)(8726326971291712157L ^ (long)var22_17 ^ -5387950906109239323L);
                        var23_18 = -1532110600 * -856380183 + -803917904 ^ var22_17 ^ 2130053780 ^ 2130053780;
                        var24_16 -= 3;
                        continue;
                    }
                    (Integer.rotateRight(1130757815 ^ var22_17, 11) - 766998372) * 1130757815;
                    var23_18 = (-1532110600 * -856380183 + -803917904 ^ var22_17) + -237727505 - -237727505;
                    Integer.rotateLeft(-782244852 ^ var22_17, 13) - 1593457839;
                    var24_16 += 4;
                    continue;
                }
                Integer.rotateLeft(-736620955 ^ var22_17, 13) - -1287168650;
                (int)(1633294115361057615L ^ (long)var22_17 ^ -4773671456553205628L);
                var23_18 = Integer.reverse(Integer.reverse(381088837 * -856380183 + -803917904 ^ var22_17));
                Integer.rotateLeft(1216383340 ^ var22_17, 12) - -873577649;
                var23_18 = Integer.reverse(Integer.reverse(-1532110600 * -856380183 + -803917904 ^ var22_17));
                (Integer.rotateRight(-974103373 ^ var22_17, 11) + -59189016) * -974103373;
                var24_16 += 4;
                continue;
            }
            Integer.rotateLeft(195754145 ^ var22_17, 4) + 1846655674;
            (int)(-3956317043961828529L ^ (long)var22_17 ^ 5785017869816840161L);
            var23_18 = Integer.reverse(Integer.reverse(-201695453 * -856380183 + -803917904 ^ var22_17));
            Integer.rotateRight(1470870543 ^ var22_17, 13) - -1574408948;
            var23_18 = -1532110600 * -856380183 + -803917904 ^ var22_17 ^ -1833116170 ^ -1833116170;
            var24_16 -= 5;
            continue;
lbl207:
            // 7 sources

            (Integer.rotateLeft(-1450660136 ^ var22_17, 8) + -1947546781) * -1450660135;
            var23_18 = -1532110600 * -856380183 + -803917904 ^ var22_17;
        }
    }

    private static double dhwz(double d) {
        try {
            int n = 962665031;
            n = Integer.rotateLeft(n * -555022413, 17) ^ 0x49943782;
            int n2 = n ^ 0x4F3689AE;
            if ((n2 ^ n) != 1328974254) {
                int cfr_ignored_0 = (0x765793E9 ^ n) - 1547697275;
            }
            if ((0x121 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return d * d * d * (d * (d * Double.longBitsToDouble(0x5BBB23288A345017L ^ 0x1BA323288A345017L) - Double.longBitsToDouble(0x6F87A25EFEB14C4FL ^ 0x2FA9A25EFEB14C4FL)) + Double.longBitsToDouble(0xDC37C09FF9DC02B2L ^ 0x9C13C09FF9DC02B2L));
    }

    private static double afa_2(double d, double d2, double d3) {
        block0: {
            int n = bthd.tts_5(-571151185);
            n = (int)Double.doubleToLongBits(d) ^ n;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d2) ^ n, 22);
            int n2 = n ^ 0xC0FFDEBF;
            if ((n2 ^ n) == -1056973121) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x1D0B3210 ^ n, 6) + -2001162453) * 487272977;
        }
        return d2 + d * (d3 - d2);
    }

    private static double rta_2(int n, double d, double d2, double d3) {
        int n2;
        double d4;
        int n3 = 1506580368;
        n3 = Integer.rotateLeft(n3 * -423795739, 18) ^ 0x84B052CB;
        n3 = (int)Double.doubleToLongBits(d3) ^ n3;
        int n4 = n3 ^ 0xF6EE6717;
        if ((n4 ^ n3) != -152148201) {
            int cfr_ignored_0 = (0xAF22F087 ^ n3) - 1382503312;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        double d5 = d4 = (n2 = n & (Integer.reverse(203300236) ^ 0x31B8783F)) < -213212626 + 213212634 ? d : d2;
        double d6 = n2 < 4 ? d2 : (n2 != (Integer.reverse(1156654010) ^ 0x5DC48F2E) && n2 != -807586288 + 807586302 ? d3 : d);
        return ((n2 & 1) == 0 ? d4 : -d4) + ((n2 & 2) == 0 ? d6 : -d6);
    }

    private static double saa_6(double d, double d2, double d3) {
        block0: {
            int n = -1140814188;
            n = Integer.rotateLeft(n * -539003967, 20) ^ 0xDA0D6A35;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d2) ^ n, 8);
            int n2 = n ^ 0x4706A327;
            if ((n2 ^ n) == 1191617319) break block0;
            int cfr_ignored_0 = (0xFB062DB3 ^ n) + -611303091;
        }
        return btha_2.afa_2(d, d2, d3);
    }

    private static double thzdh(int n, double d, double d2, double d3) {
        block0: {
            int n2 = bthd.tts_5(-1880049661);
            n2 = Integer.rotateLeft((int)Double.doubleToLongBits(d3) ^ n2, 22);
            int n3 = n2 ^ 0x4D1235F7;
            if ((n3 ^ n2) == 1293039095) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xC2E28DF4 ^ n2, 11) - -1647521849) * -1025339915;
        }
        return btha_2.rta_2(n, d, d2, d3);
    }

    private static double tzd_4(double d, double d2, double d3) {
        block0: {
            int n = 1181704454;
            n = Integer.rotateLeft(n * -1963998489, 25) ^ 0xF27CDD8A;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 5);
            int n2 = n ^ 0x712548D2;
            if ((n2 ^ n) == 1898268882) break block0;
            int cfr_ignored_0 = (0x374A29D4 ^ n) + 630714591;
        }
        return btha_2.afa_2(d, d2, d3);
    }

    private static double zjgh_2(int n, double d, double d2, double d3) {
        block0: {
            int n2 = bthd.tts_5(-1448466469);
            n2 = Integer.rotateLeft(n ^ n2, 22);
            n2 = Integer.rotateRight((int)Double.doubleToLongBits(d3) ^ n2, 3);
            int n3 = n2 ^ 0x9339EB10;
            if ((n3 ^ n2) == -1824920816) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x3A93CCCB ^ n2, 10) + 474180560;
        }
        return btha_2.rta_2(n, d, d2, d3);
    }

    private static double khmth(double d, double d2, double d3) {
        block0: {
            int n = -1340320394;
            n = Integer.rotateLeft(n * -1379802325, 20) ^ 0xE94EE3AA;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d2) ^ n, 2);
            int n2 = n ^ 0x663C67AE;
            if ((n2 ^ n) == 1715234734) break block0;
            int cfr_ignored_0 = (0xD62032D8 ^ n) - -1206949772;
        }
        return btha_2.afa_2(d, d2, d3);
    }

    private static double sqn_2(double d, double d2, double d3) {
        block0: {
            int n = bthd.tts_5(494850367);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d3) ^ n, 13);
            int n2 = n ^ 0x25693519;
            if ((n2 ^ n) == 627651865) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x3817E426 ^ n, 10) - -817741867;
        }
        return btha_2.afa_2(d, d2, d3);
    }

    private static String[] khay(String string) {
        int n = 1729570600;
        n = Integer.rotateLeft(n * 1830715885, 10) ^ 0xEB4AD8C6;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xD86EA255;
        if ((n2 ^ n) != -663838123) {
            int cfr_ignored_0 = (0xBF79857D ^ n) + 299813002;
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

    private static CallSite zmy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1377164360;
            n3 = Integer.rotateLeft(n3 * -652222791, 16) ^ 0x6467A6D9;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            n3 = Integer.rotateLeft(n2 ^ n3, 2);
            int n4 = n3 ^ 0xD59AEB2D;
            if ((n4 ^ n3) != -711267539) {
                int cfr_ignored_0 = (0x7870C895 ^ n3) + -1592255563;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ bdhd ^ string.hashCode() ^ n2 + dhysh + i * -329618079) + bdhd) ^ dhysh));
            }
            String[] stringArray = btha_2.khay(new String(cArray));
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

    private static String[] qcd9yxx6ig(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite rkzq9uycn5dv(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ pvnn56m5 ^ string.hashCode() ^ n2 + tjn10ve + i * 1385851237) + pvnn56m5) ^ tjn10ve));
            }
            String[] stringArray = btha_2.qcd9yxx6ig(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

