/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import java.util.Random;
import us.m0vy.moondlc.m0vyguard.ba;
import us.m0vy.moondlc.m0vyguard.yf;

public class bwn {
    private final int[] dhskh = new int[0x4D846535 ^ 0x4D846735];
    private static final int hzk = -1826759165;
    private static final int jbd_2 = -1306943128;
    private static final int n4408iib7qs9 = -1445773198;
    private static final int xyn39xism4 = 394523463;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int i9gc6y6nnyj6;

    public bwn() {
        this(System.currentTimeMillis());
    }

    public bwn(long l) {
        int n;
        Random random = new Random(l);
        int[] nArray = new int[0xC1658E2C ^ 0xC1658F2C];
        int n2 = 0;
        while (n2 < 2037800099 + -2037799843) {
            nArray[n2] = n2++;
        }
        for (n = 0; n < (Integer.reverse(-1830290171) ^ 0xA0BFE649); ++n) {
            int n3 = random.nextInt(-1414458066 + 1414458322 - n) + n;
            int n4 = nArray[n];
            nArray[n] = nArray[n3];
            nArray[n3] = n4;
        }
        for (n = 0; n < (0xB63DCEE4 ^ 0xB63DCFE4); ++n) {
            int n5 = nArray[n];
            this.dhskh[n + (Integer.reverse((int)743463429) ^ 0xA05A0B34)] = n5;
            this.dhskh[n] = n5;
        }
    }

    public double ttq_4(double d) {
        block0: {
            int n = -1731896650;
            n = Integer.rotateLeft(n * -849198815, 26) ^ 0xAA82E9D0;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 29);
            int n2 = n ^ 0x90A06C26;
            if ((n2 ^ n) == -1868534746) break block0;
            int cfr_ignored_0 = (0x8653690 ^ n) - -1146387638;
        }
        return this.khthd_2(d, 0.0, 0.0);
    }

    public double dhthgh(double d, double d2) {
        block0: {
            int n = 763405215;
            n = Integer.rotateLeft(n * 629320949, 20) ^ 0xAF0ACED6;
            n = System.identityHashCode(this) ^ n;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 19);
            int n2 = n ^ 0x456FBD1A;
            if ((n2 ^ n) == 1164950810) break block0;
            int cfr_ignored_0 = (0x68EF1E85 ^ n) - 371748982;
        }
        return bwn.ama(this, d, d2, 0.0);
    }

    public double khthd_2(double d, double d2, double d3) {
        try {
            int n = 1017341980;
            n = Integer.rotateLeft(n * 660186937, 12) ^ 0x156B4F24;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 19);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d2) ^ n, 10);
            int n2 = n ^ 0xA1CCFD72;
            if ((n2 ^ n) != -1580401294) {
                int cfr_ignored_0 = (0x9D6F956E ^ n) - -1714725575;
            }
            if ((0xD0 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            bwn.shkhn();
        }
        int n = (int)bwn.khdt_3(d) & (bwn.ayk(-977226727) ^ 0x982D035C);
        int n3 = (int)Math.floor(d2) & (0xC45A73B6 ^ 0xC45A7349);
        int n4 = (int)Math.floor(d3) & -1525722073 + 1525722328;
        d -= Math.floor(d);
        d2 -= Math.floor(d2);
        d3 -= bwn.dhghs(d3);
        double d4 = bwn.raj_2(d);
        double d5 = bwn.daf(d2);
        double d6 = bwn.raj_2(d3);
        int n5 = this.dhskh[n] + n3;
        int n6 = this.dhskh[n5] + n4;
        int n7 = this.dhskh[n5 + 1] + n4;
        int n8 = this.dhskh[n + 1] + n3;
        int n9 = this.dhskh[n8] + n4;
        int n10 = this.dhskh[n8 + 1] + n4;
        return bwn.dhds_4(d6, bwn.dhds_4(d5, bwn.dhds_4(d4, bwn.zns_2(this.dhskh[n6], d, d2, d3), bwn.zns_2(this.dhskh[n9], d - 1.0, d2, d3)), bwn.dhds_4(d4, bwn.zns_2(this.dhskh[n7], d, d2 - 1.0, d3), bwn.jln(this.dhskh[n10], d - 1.0, d2 - 1.0, d3))), bwn.dhds_4(d5, bwn.dhds_4(d4, bwn.zns_2(this.dhskh[n6 + 1], d, d2, d3 - 1.0), bwn.zns_2(this.dhskh[n9 + 1], d - 1.0, d2, d3 - 1.0)), bwn.dhds_4(d4, bwn.khkh_2(this.dhskh[n7 + 1], d, d2 - 1.0, d3 - 1.0), bwn.zns_2(this.dhskh[n10 + 1], d - 1.0, d2 - 1.0, d3 - 1.0))));
    }

    private static double raj_2(double d) {
        block0: {
            int n = -1932221699;
            int n2 = (n = Integer.rotateLeft(n * -486070347, 20) ^ 0xCD78F8BE) ^ 0x6BB510F0;
            if ((n2 ^ n) == 1807028464) break block0;
            int cfr_ignored_0 = (0xE761B20D ^ n) + 800107067;
        }
        return d * d * d * (d * (d * Double.longBitsToDouble(0xDA29780A07E94560L ^ 0x9A31780A07E94560L) - bwn.tkl_2(0x3C637A89C3E07250L ^ 0x7C4D7A89C3E07250L)) + bwn.dhtdh(0xD21B9A83C78E6025L ^ 0x923F9A83C78E6025L));
    }

    private static double dhds_4(double d, double d2, double d3) {
        double d4 = 0.0;
        int n = 0;
        int n2 = -165596506;
        n2 = Integer.rotateLeft(n2 * 239404339, 16) ^ 0x33C2FAC5;
        n2 = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n2, 24);
        n2 = (int)Double.doubleToLongBits(d3) ^ n2;
        int n3 = n2 ^ 0xA50B4981;
        block24: while (true) {
            switch (n3 ^ n2) {
                case 966505075: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x31DC0D36 ^ n2, 9) - 235092165) * 836504887;
                    yf.athz_2();
                    throw null;
                }
                case -1640852781: {
                    int cfr_ignored_1 = (Integer.rotateLeft(0x9C6AE1F8 ^ n2, 6) + -179372989) * -1670716935;
                    d4 = d2 + d * (d3 - d2);
                    n3 = n2 ^ 0xC9DFC59E;
                    int cfr_ignored_2 = (Integer.rotateRight(0x8F9A49B7 ^ n2, 4) - 1745652836) * -1885713993;
                    n3 = n2 ^ 0xE53884EE ^ 0x91DC24ED ^ 0x91DC24ED;
                    n -= 2;
                    continue block24;
                }
                case -1525986943: {
                    int cfr_ignored_3 = (Integer.rotateLeft(0xF298679D ^ n2, 17) - 1691495230) * -224893027;
                    int cfr_ignored_4 = (int)(0x302AC9A027D4EB4FL ^ (long)n2 ^ 0x6E30831A2DB9CD84L);
                    if (yf.khdha_2()) {
                        try {
                            --n;
                            if ((0x59E55DE45889CDD3L ^ (long)n2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n3 = n2 ^ 0x9E3292D3;
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = (int)((long)(n2 ^ 0x9E3292D3) ^ 0x93A111797312BDCFL ^ 0x93A111797312BDCFL);
                        }
                        continue block24;
                    }
                    try {
                        n -= 5;
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x399BB273));
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 ^ 0x399BB273;
                    }
                    n += 4;
                    continue block24;
                }
                case 497086723: {
                    int cfr_ignored_5 = (Integer.rotateLeft(0x9053BAB0 ^ n2, 5) + 2122398347) * -1873560911;
                    n3 = n2 ^ 0x81EA2987 ^ 0xF6B049BE ^ 0xF6B049BE;
                    int cfr_ignored_6 = Integer.rotateLeft(0x37446E1 ^ n2, 3) + 1869755514;
                    int cfr_ignored_7 = (int)(0xC1C6E8DC27D4EB4FL ^ (long)n2 ^ 0x2CC8831A2DB82E5CL);
                    int cfr_ignored_8 = (int)(0x2459C4D793D088DAL ^ (long)n2 ^ 0x74DFEB12EA93E562L);
                    n3 = n2 ^ 0x381742B6 ^ 0x2F6F25C5 ^ 0x2F6F25C5;
                    int cfr_ignored_9 = (int)(0x11655A967A674601L ^ (long)n2 ^ 0x485C387D77258F1BL);
                    n3 = (int)((long)(n2 ^ 0xA50B4981) ^ 0x5D50CFE6C9D6272BL ^ 0x5D50CFE6C9D6272BL);
                    n += 4;
                    continue block24;
                }
                case 1684741805: {
                    int cfr_ignored_10 = Integer.rotateRight(0x4AEA920E ^ n2, 12) - 382029549;
                    n3 = n2 ^ 0xA50B4981 ^ 0xE38FC5D7 ^ 0xE38FC5D7;
                    int cfr_ignored_11 = Integer.rotateLeft(0xB40CD9E4 ^ n2, 9) - -773062185;
                    ++n;
                    continue block24;
                }
                case 220270030: {
                    int cfr_ignored_12 = Integer.rotateLeft(0x50DA5649 ^ n2, 13) + -825355758;
                    int cfr_ignored_13 = (int)(0x9268F87427D4EB4FL ^ (long)n2 ^ 0xD98831A2DB88900L);
                    n3 = n2 ^ 0x354DA837;
                    int cfr_ignored_14 = Integer.rotateRight(0x7B2AA1E2 ^ n2, 18) + -293127783;
                    int cfr_ignored_15 = (int)(0x5CA005E13BCDFF0AL ^ (long)n2 ^ 0xF6B2BB2805331491L);
                    n3 = (int)((long)(n2 ^ 0x42AC8F0C) ^ 0x6D37A0CAE5EB2BCAL ^ 0x6D37A0CAE5EB2BCAL);
                    int cfr_ignored_16 = (int)(0xA71608564530102CL ^ (long)n2 ^ 0xEDDC46D3DB7EE3FDL);
                    n3 = (n2 ^ 0xA50B4981) + 1183632904 - 1183632904;
                    n += 5;
                    continue block24;
                }
                case 1529222114: {
                    int cfr_ignored_17 = Integer.rotateRight(0x7051FF26 ^ n2, 17) - -1639217963;
                    n3 = (n2 ^ 0x49F85112) + -1883678914 - -1883678914;
                    int cfr_ignored_18 = (Integer.rotateLeft(0x6E52609D ^ n2, 16) - 1616335422) * 1850892445;
                    int cfr_ignored_19 = (int)(0xACE0CEA027D4EB4FL ^ (long)n2 ^ 0x6030831A2DB8F410L);
                    int cfr_ignored_20 = (int)(0x5E90F6DE66235DB4L ^ (long)n2 ^ 0x10CC00F5404F10F0L);
                    n3 = n2 ^ 0xA50B4981 ^ 0x856666CA ^ 0x856666CA;
                    ++n;
                    continue block24;
                }
                case 2090629082: {
                    int cfr_ignored_21 = Integer.rotateRight(0xCD2DB6E ^ n2, 4) - -1847185011;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA82F0E6B));
                    int cfr_ignored_22 = Integer.rotateRight(0x3B3BF98E ^ n2, 10) - 815847277;
                    n3 = n2 ^ 0xA50B4981 ^ 0x3FD46D0E ^ 0x3FD46D0E;
                    continue block24;
                }
                case -98686927: {
                    int cfr_ignored_23 = Integer.rotateRight(0xA6631603 ^ n2, 7) + 710756760;
                    n3 = (n2 ^ 0xA50B4981) + -1418558260 - -1418558260;
                    int cfr_ignored_24 = Integer.rotateLeft(0xFC741D60 ^ n2, 18) + -1771229733;
                    n += 3;
                    continue block24;
                }
                case -525071894: {
                    int cfr_ignored_25 = (Integer.rotateRight(0x1A620BA ^ n2, 3) + 930846145) * 27664571;
                    try {
                        n -= 4;
                        n3 = n2 ^ 0xA50B4981;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA50B4981));
                    }
                    continue block24;
                }
                case 117144209: {
                    int cfr_ignored_26 = (Integer.rotateLeft(0xBD186751 ^ n2, 10) + -363716086) * -1122474159;
                    int cfr_ignored_27 = (int)(0x7FAAC96C27D4EB4FL ^ (long)n2 ^ 0x6FA8831A2DB95284L);
                    try {
                        n3 = (int)((long)(n2 ^ 0xA50B4981) ^ 0x7AC7527CFB990816L ^ 0x7AC7527CFB990816L);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 ^ 0xA50B4981;
                    }
                    n += 5;
                    continue block24;
                }
                case 1908039863: {
                    int cfr_ignored_28 = Integer.rotateLeft(0x473BDB04 ^ n2, 11) - -1533205321;
                    n3 = (int)((long)(n2 ^ 0x5DB3830D) ^ 0xFA3B004D62D6E1BBL ^ 0xFA3B004D62D6E1BBL);
                    int cfr_ignored_29 = (Integer.rotateLeft(0xBA1E001D ^ n2, 10) - -1912626498) * -1172439011;
                    int cfr_ignored_30 = (int)(0x78ACAE2027D4EB4FL ^ (long)n2 ^ 0xA130831A2DB95C88L);
                    int cfr_ignored_31 = (int)(0xBC95DEB1C4E15A7CL ^ (long)n2 ^ 0x401345714FDED4FAL);
                    n3 = n2 ^ 0xA50B4981 ^ 0xEF02E32 ^ 0xEF02E32;
                    n -= 2;
                    continue block24;
                }
                case -1643043078: {
                    int cfr_ignored_32 = (Integer.rotateRight(0x31343417 ^ n2, 9) - -105910780) * 825504791;
                    n3 = n2 ^ 0xD65BCBE;
                    int cfr_ignored_33 = (Integer.rotateLeft(0x7CC33D5C ^ n2, 18) - 537005407) * 2093170013;
                    n3 = n2 ^ 0x3B90FE15 ^ 0x4669ED1E ^ 0x4669ED1E;
                    int cfr_ignored_34 = Integer.rotateRight(0xB412C87 ^ n2, 4) - 1631716244;
                    n3 = (n2 ^ 0xA50B4981) + -1251693213 - -1251693213;
                    continue block24;
                }
                case -449280786: {
                    return d4;
                }
            }
            int cfr_ignored_35 = Integer.rotateLeft(0x834D72EC ^ n2, 3) - -356611633;
            n3 = (int)((long)(n2 ^ 0xA50B4981) ^ 0xF048A524D629657CL ^ 0xF048A524D629657CL);
        }
    }

    private static double zns_2(int n, double d, double d2, double d3) {
        double d4;
        int n2 = ba.szt_5(-1755289765);
        n2 = Integer.rotateRight(n ^ n2, 25);
        n2 = (int)Double.doubleToLongBits(d) ^ n2;
        int n3 = n2 ^ 0x26C4EC40;
        if ((n3 ^ n2) != 650439744) {
            int cfr_ignored_0 = (Integer.rotateRight(0xB1A48B1B ^ n2, 9) + -2025162880) * -1314616549;
        }
        if (yf.dnkh()) {
            throw null;
        }
        int n4 = n & (Integer.reverse(1489086022) ^ 0x62658315);
        double d5 = d4 = n4 < Integer.rotateLeft(0x1B013CA4 ^ 0x19013CA4, 10) ? d : d2;
        double d6 = n4 < 4 ? d2 : (n4 != Integer.rotateLeft(0xCCF3EB49 ^ 0xCCF0EB49, 18) && n4 != Integer.rotateLeft(0x7DABC734 ^ 0x7DA5C734, 16) ? d3 : d);
        return ((n4 & 1) == 0 ? d4 : -d4) + ((n4 & 2) == 0 ? d6 : -d6);
    }

    private static double ama(bwn bwn2, double d, double d2, double d3) {
        block0: {
            int n = ba.szt_5(-1969304192);
            n = (int)Double.doubleToLongBits(d) ^ n;
            n = (int)Double.doubleToLongBits(d3) ^ n;
            int n2 = n ^ 0x111D450C;
            if ((n2 ^ n) == 287130892) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x9B83888C ^ n, 6) - -649385937;
        }
        return bwn2.khthd_2(d, d2, d3);
    }

    private static void shkhn() {
        int n = -2019600760;
        int n2 = (n = Integer.rotateLeft(n * 817913399, 25) ^ 0x44A56A4C) ^ 0x60EBE080;
        if ((n2 ^ n) != 1626071168) {
            int cfr_ignored_0 = (0xE774B608 ^ n) + -910004590;
        }
        yf.athz_2();
    }

    private static double khdt_3(double d) {
        block0: {
            int n = 2098750105;
            n = Integer.rotateLeft(n * 1826877041, 15) ^ 0x806DEE9D;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 15);
            int n2 = n ^ 0xB4F39880;
            if ((n2 ^ n) == -1259104128) break block0;
            int cfr_ignored_0 = (0xC9EBFA19 ^ n) - 1130967330;
        }
        return Math.floor(d);
    }

    private static int ayk(int n) {
        block0: {
            int n2 = ba.szt_5(43220250);
            int n3 = (n2 = n ^ n2) ^ 0x379F7F14;
            if ((n3 ^ n2) == 933199636) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x350C020E ^ n2, 9) - 1892802285;
        }
        return Integer.reverse(n);
    }

    private static double dhghs(double d) {
        block0: {
            int n = ba.szt_5(202946898);
            int n2 = n ^ 0x8FFF2C2C;
            if ((n2 ^ n) == -1879102420) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x83E7957E ^ n, 3) - -43468419) * -2081974913;
        }
        return Math.floor(d);
    }

    private static double daf(double d) {
        block0: {
            int n = 1985315631;
            n = Integer.rotateLeft(n * 50571421, 20) ^ 0x91336F6D;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0xC0940922;
            if ((n2 ^ n) == -1064040158) break block0;
            int cfr_ignored_0 = (0xB6C18A0D ^ n) - 1980417771;
        }
        return bwn.raj_2(d);
    }

    private static double jln(int n, double d, double d2, double d3) {
        block0: {
            int n2 = -1654108534;
            n2 = Integer.rotateLeft(n2 * -1742152541, 7) ^ 0x36DE720F;
            n2 = (int)Double.doubleToLongBits(d2) ^ n2;
            int n3 = n2 ^ 0xBD32FA3B;
            if ((n3 ^ n2) == -1120732613) break block0;
            int cfr_ignored_0 = (0x205AB4B1 ^ n2) - 167906659;
        }
        return bwn.zns_2(n, d, d2, d3);
    }

    private static double khkh_2(int n, double d, double d2, double d3) {
        block0: {
            int n2 = -2047016089;
            n2 = Integer.rotateLeft(n2 * -735432799, 17) ^ 0xC96238E1;
            n2 = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n2, 28);
            n2 = (int)Double.doubleToLongBits(d2) ^ n2;
            int n3 = n2 ^ 0xA677DE05;
            if ((n3 ^ n2) == -1502093819) break block0;
            int cfr_ignored_0 = (0x238ADD62 ^ n2) - -1145652125;
        }
        return bwn.zns_2(n, d, d2, d3);
    }

    private static double tkl_2(long l) {
        block0: {
            int n = -1381418418;
            n = Integer.rotateLeft(n * -1996876327, 14) ^ 0xB12EBF3F;
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 4)) ^ 0x262776BF;
            if ((n2 ^ n) == 640120511) break block0;
            int cfr_ignored_0 = (0x8B8E4CF1 ^ n) - 912030970;
        }
        return Double.longBitsToDouble(l);
    }

    private static double dhtdh(long l) {
        block0: {
            int n = -2081545019;
            int n2 = (n = Integer.rotateLeft(n * 238967193, 24) ^ 0xAF2A4CC3) ^ 0xDF40D78E;
            if ((n2 ^ n) == -549398642) break block0;
            int cfr_ignored_0 = (0x5CAEF34B ^ n) - 509364868;
        }
        return Double.longBitsToDouble(l);
    }

    private static String[] thfw(String string) {
        int n = 1481771352;
        int n2 = (n = Integer.rotateLeft(n * 1455923859, 25) ^ 0x81A3E2F3) ^ 0xA30B5C29;
        if ((n2 ^ n) != -1559536599) {
            int cfr_ignored_0 = (0xFB595571 ^ n) - -626353218;
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

    private static CallSite dal_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1912424089;
            n3 = Integer.rotateLeft(n3 * 1194855011, 10) ^ 0x742F3CBD;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 19);
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 12);
            int n4 = n3 ^ 0xFD2ED9CF;
            if ((n4 ^ n3) != -47261233) {
                int cfr_ignored_0 = (0x732C60A8 ^ n3) - -1113823021;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ hzk ^ string.hashCode() ^ n2 + jbd_2 + i * -349575951) + hzk) ^ jbd_2));
            }
            String[] stringArray = bwn.thfw(new String(cArray));
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

    private static String[] tvevpmxx5(String string) {
        return string.split("\u0007\u0012", -1);
    }

    private static CallSite vychgr087(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n4408iib7qs9 ^ string.hashCode() ^ n2 + xyn39xism4 + i * -802040777) + n4408iib7qs9) ^ xyn39xism4));
            }
            String[] stringArray = bwn.tvevpmxx5(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

