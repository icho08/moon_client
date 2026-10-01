/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import us.m0vy.moondlc.m0vyguard.bar;
import us.m0vy.moondlc.m0vyguard.yf;

public class tts {
    private double[] sdm_2;
    private int thda;
    private static final int khkhs_2 = 226838478;
    private static final int jfdh = -373871819;
    private static final int khkw = -968721048;
    private static final int jzh_3 = 1240923786;
    private static final int qu61yxeamq4 = -1910785752;
    private static final int rj6v4kx9v = -1918326698;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int gb71ilkm22cb;

    public tts() {
        this(5);
    }

    public tts(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Stack's capacity ".concat("must be positive"));
        }
        this.sdm_2 = new double[n];
        this.thda = -1;
    }

    public void dhhth_2(double d) {
        try {
            int n = -374049932;
            n = Integer.rotateLeft(n * 1135903149, 16) ^ 0xCFD3010E;
            int n2 = n ^ 0x51711CE8;
            if ((n2 ^ n) != 1366367464) {
                int cfr_ignored_0 = (0xB8C56F9C ^ n) + 1388186278;
            }
            if ((0x20F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (tts.sst_2()) {
            throw null;
        }
        if (this.thda + 1 == this.sdm_2.length) {
            double[] dArray = new double[(int)((double)this.sdm_2.length * tts.ghth(0xD7ACF28BB717B73AL ^ 0xE85FC1B884248409L)) + 1];
            System.arraycopy(this.sdm_2, 0, dArray, 0, this.sdm_2.length);
            this.sdm_2 = dArray;
        }
        this.sdm_2[++this.thda] = d;
    }

    /*
     * Unable to fully structure code
     */
    public double hhw() {
        var3_1 = 0;
        var1_2 = -1010516042;
        var1_2 = Integer.rotateLeft(var1_2 * 501261189, 5) ^ 1660143442;
        var1_2 = System.identityHashCode(this) ^ var1_2;
        var2_3 = (int)((long)(-1310719224 * 1663025515 + -2008839491 ^ var1_2) ^ 4195382272076240310L ^ 4195382272076240310L);
        while (true) {
            block33: {
                block35: {
                    block37: {
                        block39: {
                            block36: {
                                block32: {
                                    block42: {
                                        block34: {
                                            block41: {
                                                block38: {
                                                    block43: {
                                                        block40: {
                                                            var3_1 = ((var2_3 ^ var1_2) - -2008839491) * 967598915;
                                                            switch (var3_1 & 7) {
                                                                case 3: {
                                                                    if (var3_1 == -1624476573) break block32;
                                                                    if (var3_1 == -51079157) break block33;
                                                                    if (var3_1 != 2081958467) {
                                                                        ** break;
                                                                    }
                                                                    break block34;
                                                                }
                                                                case 2: {
                                                                    if (var3_1 == -1038374030) break block35;
                                                                    if (var3_1 == -707753702) break block36;
                                                                    if (var3_1 != 658399970) {
                                                                        ** break;
                                                                    }
                                                                    break block37;
                                                                }
                                                                case 0: {
                                                                    if (var3_1 == -1310719224) break;
                                                                    if (var3_1 != -500761016) {
                                                                        (Integer.rotateRight(-335433317 ^ var1_2, 16) + -1735253760) * -335433317;
                                                                        ** break;
                                                                    }
                                                                    break block38;
                                                                }
                                                                case 1: {
                                                                    if (var3_1 != 205920633) {
                                                                        ** break;
                                                                    }
                                                                    break block39;
                                                                }
                                                                case 7: {
                                                                    if (var3_1 == -1980562417) break block40;
                                                                    if (var3_1 != 1838467335) {
                                                                        ** break;
                                                                    }
                                                                    break block41;
                                                                }
                                                                case 4: {
                                                                    if (var3_1 == 1705042436) break block42;
                                                                    if (var3_1 != 211673300) {
                                                                        ** break;
                                                                    }
                                                                    break block43;
                                                                }
                                                            }
                                                            (Integer.rotateLeft(1507935121 ^ var1_2, 14) + -425407030) * 1507935121;
                                                            (int)(-7254193251105313969L ^ (long)var1_2 ^ 2749591720969149302L);
                                                            if (this.thda != -1) {
                                                                (int)(2213922844692369557L ^ (long)var1_2 ^ 2540330040194601123L);
                                                                var2_3 = Integer.reverse(Integer.reverse(1762985002 * 1663025515 + -2008839491 ^ var1_2));
                                                                (int)(-93072941509345157L ^ (long)var1_2 ^ 5782326114190905531L);
                                                                var2_3 = (int)((long)(-1980562417 * 1663025515 + -2008839491 ^ var1_2) ^ -5089294398594065395L ^ -5089294398594065395L);
                                                                --var3_1;
                                                                continue;
                                                            }
                                                            var2_3 = (int)((long)(181733971 * 1663025515 + -2008839491 ^ var1_2) ^ 3152197445932765514L ^ 3152197445932765514L);
                                                            (Integer.rotateRight(-115106602 ^ var1_2, 18) - 799907109) * -115106601;
                                                            var2_3 = Integer.reverse(Integer.reverse(211673300 * 1663025515 + -2008839491 ^ var1_2));
                                                            var3_1 += 3;
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(-1697412775 ^ var1_2, 6) + -1006943998) * -1697412775;
                                                        (int)(6368414659197070159L ^ (long)var1_2 ^ -5496499196746195693L);
                                                        return this.sdm_2[this.thda];
                                                    }
                                                    Integer.rotateLeft(-1261396764 ^ var1_2, 9) - -375349545;
                                                    throw new EmptyStackException();
                                                }
                                                (Integer.rotateRight(-1174516361 ^ var1_2, 10) - -1977024348) * -1174516361;
                                                try {
                                                    var3_1 -= 4;
                                                    if ((6997954734822820229L ^ (long)var1_2 | 1L) == 0L) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    var2_3 = Integer.reverse(Integer.reverse(-1310719224 * 1663025515 + -2008839491 ^ var1_2));
                                                }
                                                catch (IllegalArgumentException v0) {
                                                    var2_3 = (int)((long)(-1310719224 * 1663025515 + -2008839491 ^ var1_2) ^ 370762241132678622L ^ 370762241132678622L);
                                                }
                                                var3_1 += 3;
                                                continue;
                                            }
                                            Integer.rotateRight(1924129955 ^ var1_2, 17) + -408269064;
                                            var2_3 = Integer.reverse(Integer.reverse(1385184944 * 1663025515 + -2008839491 ^ var1_2));
                                            (Integer.rotateRight(-2008142318 ^ var1_2, 4) + -2049625239) * -2008142317;
                                            try {
                                                var3_1 += 3;
                                                if ((6849191232088923557L ^ (long)var1_2 | 1L) == 0L) {
                                                    throw new IllegalStateException();
                                                }
                                                var2_3 = Integer.reverse(Integer.reverse(-1310719224 * 1663025515 + -2008839491 ^ var1_2));
                                            }
                                            catch (IllegalStateException v1) {
                                                var2_3 = Integer.reverse(Integer.reverse(-1310719224 * 1663025515 + -2008839491 ^ var1_2));
                                            }
                                            var3_1 -= 2;
                                            continue;
                                        }
                                        (Integer.rotateRight(99229882 ^ var1_2, 3) + -1145596479) * 99229883;
                                        (int)(-5781994533130488375L ^ (long)var1_2 ^ -8627010465258212779L);
                                        var2_3 = -970565960 * 1663025515 + -2008839491 ^ var1_2 ^ -417262901 ^ -417262901;
                                        (int)(-8917171208561974940L ^ (long)var1_2 ^ 5584230539083031982L);
                                        var2_3 = Integer.reverse(Integer.reverse(-1310719224 * 1663025515 + -2008839491 ^ var1_2));
                                        var3_1 += 2;
                                        continue;
                                    }
                                    (Integer.rotateRight(-322320362 ^ var1_2, 16) - -1328752155) * -322320361;
                                    try {
                                        var2_3 = (-1310719224 * 1663025515 + -2008839491 ^ var1_2) + 1302781994 - 1302781994;
                                    }
                                    catch (UnsupportedOperationException v2) {
                                        var2_3 = -1310719224 * 1663025515 + -2008839491 ^ var1_2;
                                    }
                                    continue;
                                }
                                Integer.rotateLeft(1413905284 ^ var1_2, 13) - 954635319;
                                (int)(-6334713250618243261L ^ (long)var1_2 ^ -2681839345721082372L);
                                var2_3 = -356920375 * 1663025515 + -2008839491 ^ var1_2 ^ 1233568770 ^ 1233568770;
                                (int)(-6926718545018112433L ^ (long)var1_2 ^ 5272957156008170095L);
                                var2_3 = (-1310719224 * 1663025515 + -2008839491 ^ var1_2) + -1488407224 - -1488407224;
                                ++var3_1;
                                continue;
                            }
                            Integer.rotateLeft(906607393 ^ var1_2, 9) + -1886697414;
                            (int)(-812032097138709681L ^ (long)var1_2 ^ -2933951008772438873L);
                            (int)(2735890652887701793L ^ (long)var1_2 ^ 5866949989269628478L);
                            var2_3 = -1310719224 * 1663025515 + -2008839491 ^ var1_2;
                            continue;
                        }
                        (Integer.rotateLeft(67133909 ^ var1_2, 3) - -2140571642) * 67133909;
                        (int)(-4129009312337695921L ^ (long)var1_2 ^ 7106824360450072756L);
                        try {
                            if ((-1318335369840632829L ^ (long)var1_2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var2_3 = (-1310719224 * 1663025515 + -2008839491 ^ var1_2) + -479119713 - -479119713;
                        }
                        catch (IllegalStateException v3) {
                            var2_3 = (-1310719224 * 1663025515 + -2008839491 ^ var1_2) + 639707670 - 639707670;
                        }
                        continue;
                    }
                    Integer.rotateRight(1836116110 ^ var1_2, 16) - 1158269037;
                    var2_3 = -433381700 * 1663025515 + -2008839491 ^ var1_2 ^ 1937759920 ^ 1937759920;
                    Integer.rotateRight(-860895153 ^ var1_2, 12) - -844701492;
                    (int)(-6996245205594796325L ^ (long)var1_2 ^ 5578817888901435393L);
                    var2_3 = Integer.reverse(Integer.reverse(555329097 * 1663025515 + -2008839491 ^ var1_2));
                    (int)(-9156353822544862347L ^ (long)var1_2 ^ -3739326435281818611L);
                    var2_3 = -1310719224 * 1663025515 + -2008839491 ^ var1_2;
                    ++var3_1;
                    continue;
                }
                (Integer.rotateRight(-1207385633 ^ var1_2, 10) - 1298995516) * -1207385633;
                try {
                    var3_1 -= 4;
                    var2_3 = Integer.reverse(Integer.reverse(-1310719224 * 1663025515 + -2008839491 ^ var1_2));
                }
                catch (NoSuchElementException v4) {
                    var2_3 = (-1310719224 * 1663025515 + -2008839491 ^ var1_2) + 414012943 - 414012943;
                }
                var3_1 += 3;
                continue;
            }
            Integer.rotateLeft(2142964484 ^ var1_2, 18) - 2080634039;
            var2_3 = (1703291580 * 1663025515 + -2008839491 ^ var1_2) + 1351682905 - 1351682905;
            (Integer.rotateLeft(223457176 ^ var1_2, 4) + -1589517661) * 223457177;
            try {
                var3_1 -= 4;
                if ((5498357655785272615L ^ (long)var1_2 | 1L) == 0L) {
                    throw new ArithmeticException();
                }
                var2_3 = Integer.reverse(Integer.reverse(-1310719224 * 1663025515 + -2008839491 ^ var1_2));
            }
            catch (ArithmeticException v5) {
                var2_3 = (-1310719224 * 1663025515 + -2008839491 ^ var1_2) + 2132504827 - 2132504827;
            }
            var3_1 -= 2;
            continue;
lbl194:
            // 7 sources

            (Integer.rotateLeft(1054232285 ^ var1_2, 10) - -1605293058) * 1054232285;
            (int)(-259835625135084721L ^ (long)var1_2 ^ 4373139386636195096L);
            var2_3 = -1310719224 * 1663025515 + -2008839491 ^ var1_2;
        }
    }

    public double bthk() {
        int n = 0;
        int n2 = -283463112;
        n2 = Integer.rotateLeft(n2 * 1691176989, 8) ^ 0x6A379FE9;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317;
        block38: while (true) {
            switch (n3 - 1553741317 ^ 0x5C9C3605 ^ n2) {
                case 1009321115: {
                    int cfr_ignored_0 = Integer.rotateRight(0x700E3FE2 ^ n2, 17) + -1776854119;
                    throw new EmptyStackException();
                }
                case -599847919: {
                    int cfr_ignored_1 = Integer.rotateLeft(0x96D4AA41 ^ n2, 5) + 1209941274;
                    int cfr_ignored_2 = (int)(0x5466047C27D4EB4FL ^ (long)n2 ^ 0xF588831A2DB9051DL);
                    return this.sdm_2[this.thda--];
                }
                case 1065056104: {
                    int cfr_ignored_3 = Integer.rotateLeft(0x952E7188 ^ n2, 5) + 352149171;
                    if (tts.tb()) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x30584913 ^ 0x5C9C3605) + 1553741317));
                        int cfr_ignored_4 = (Integer.rotateLeft(0x7B638A91 ^ n2, 18) + -177510710) * 2070121105;
                        int cfr_ignored_5 = (int)(0xB9D124AC27D4EB4FL ^ (long)n2 ^ 0xB428831A2DB8DE73L);
                        n3 = (int)((long)((n2 ^ 0xE85B12FB ^ 0x5C9C3605) + 1553741317) ^ 0xA8D5A775378CD4FAL ^ 0xA8D5A775378CD4FAL);
                        continue block38;
                    }
                    try {
                        n += 4;
                        if ((0x19A90B76A05C83E1L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (n2 ^ 0x8BAF5C84 ^ 0x5C9C3605) + 1553741317;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (n2 ^ 0x8BAF5C84 ^ 0x5C9C3605) + 1553741317 + -1825295375 - -1825295375;
                    }
                    n += 3;
                    continue block38;
                }
                case -1951441788: {
                    int cfr_ignored_6 = Integer.rotateLeft(0xDE3406A1 ^ n2, 14) + -324375366;
                    int cfr_ignored_7 = (int)(0x1C86A89C27D4EB4FL ^ (long)n2 ^ 0xAC48831A2DB994DCL);
                    yf.athz_2();
                    throw null;
                }
                case -396684549: {
                    int cfr_ignored_8 = (Integer.rotateRight(0xB535A75E ^ n2, 9) - -170073187) * -1254774945;
                    if (this.thda != -1) {
                        try {
                            n -= 4;
                            if ((0x8110B486C6D36709L ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = (int)((long)((n2 ^ 0xDC3F0C11 ^ 0x5C9C3605) + 1553741317) ^ 0xD82986D578A68F1BL ^ 0xD82986D578A68F1BL);
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0xDC3F0C11 ^ 0x5C9C3605) + 1553741317));
                        }
                        ++n;
                        continue block38;
                    }
                    n3 = (n2 ^ 0x3C29049B ^ 0x5C9C3605) + 1553741317 + -86850179 - -86850179;
                    int cfr_ignored_9 = (Integer.rotateLeft(0x8B284A15 ^ n2, 4) - -566323258) * -1960293867;
                    int cfr_ignored_10 = (int)(0x499AE42827D4EB4FL ^ (long)n2 ^ 0x3520831A2DB93EE4L);
                    ++n;
                    continue block38;
                }
                case -1597624842: {
                    int cfr_ignored_11 = Integer.rotateLeft(0x4526248 ^ n2, 3) + -1973975565;
                    n3 = (n2 ^ 0xC32F4376 ^ 0x5C9C3605) + 1553741317 ^ 0x9BC2C47C ^ 0x9BC2C47C;
                    int cfr_ignored_12 = (Integer.rotateLeft(0xA54F7CD5 ^ n2, 7) - 150846726) * -1521517355;
                    int cfr_ignored_13 = (int)(0x67FDD2E827D4EB4FL ^ (long)n2 ^ 0x58A0831A2DB9622AL);
                    n3 = (n2 ^ 0x8F484D02 ^ 0x5C9C3605) + 1553741317 ^ 0x16E0BADF ^ 0x16E0BADF;
                    int cfr_ignored_14 = Integer.rotateLeft(0xBF746EC1 ^ n2, 10) + 863439002;
                    int cfr_ignored_15 = (int)(0x7DC6C0FC27D4EB4FL ^ (long)n2 ^ 0x7C88831A2DB9565CL);
                    n3 = (int)((long)((n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317) ^ 0x551C4A01C20BBD64L ^ 0x551C4A01C20BBD64L);
                    ++n;
                    continue block38;
                }
                case -550717494: {
                    int cfr_ignored_16 = (Integer.rotateLeft(0x54D2274 ^ n2, 3) - -1464546489) * 88941173;
                    n3 = (n2 ^ 0xEAE9CD7E ^ 0x5C9C3605) + 1553741317 ^ 0x6D1CFB14 ^ 0x6D1CFB14;
                    int cfr_ignored_17 = (Integer.rotateRight(0x25D5F1F7 ^ n2, 7) - -1723470812) * 634778103;
                    int cfr_ignored_18 = (int)(0x3862B039B1DDC13EL ^ (long)n2 ^ 0x9D03AF08795BDD14L);
                    n3 = (int)((long)((n2 ^ 0xDE07CDC0 ^ 0x5C9C3605) + 1553741317) ^ 0x227573F49BD2877FL ^ 0x227573F49BD2877FL);
                    int cfr_ignored_19 = (int)(0xBE132FB40128BB4EL ^ (long)n2 ^ 0xA218CEE28DBAD1F7L);
                    n3 = (n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317 + 756215744 - 756215744;
                    continue block38;
                }
                case 966895355: {
                    int cfr_ignored_20 = Integer.rotateLeft(0x157E8AD ^ n2, 3) - 771935278;
                    int cfr_ignored_21 = (int)(0xC3E5469027D4EB4FL ^ (long)n2 ^ 0x7050831A2DB82A1BL);
                    n3 = (int)((long)((n2 ^ 0x2FB2CA5 ^ 0x5C9C3605) + 1553741317) ^ 0x846F471A1F492BE7L ^ 0x846F471A1F492BE7L);
                    int cfr_ignored_22 = Integer.rotateLeft(0x2804EAA4 ^ n2, 8) - -587855593;
                    n3 = (n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317;
                    int cfr_ignored_23 = (Integer.rotateRight(0x4F5C01F7 ^ n2, 12) - -1602102236) * 1331429879;
                    n += 2;
                    continue block38;
                }
                case -1493791844: {
                    int cfr_ignored_24 = (Integer.rotateRight(0x100174FF ^ n2, 5) - -192230884) * 268530943;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xBBA476C6 ^ 0x5C9C3605) + 1553741317));
                    int cfr_ignored_25 = (Integer.rotateLeft(0xEA68E074 ^ n2, 16) - 1729154375) * -362225547;
                    try {
                        if ((0x79BF8DB4573D874FL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317 ^ 0xE6915F09 ^ 0xE6915F09;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)((n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317) ^ 0xAE6F165E9A1D26FBL ^ 0xAE6F165E9A1D26FBL);
                    }
                    n += 3;
                    continue block38;
                }
                case 702081973: {
                    int cfr_ignored_26 = Integer.rotateRight(0xDF818E0E ^ n2, 14) - 353227501;
                    try {
                        if ((0x44A575117E4A0983L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)((n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317) ^ 0xB88FBE93DCC8E382L ^ 0xB88FBE93DCC8E382L);
                    }
                    continue block38;
                }
                case -425971521: {
                    int cfr_ignored_27 = Integer.rotateRight(0xBFDBB406 ^ n2, 10) - 1073245173;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x9B4D0351 ^ 0x5C9C3605) + 1553741317));
                    int cfr_ignored_28 = (Integer.rotateLeft(0xF17C7058 ^ n2, 17) + 1114585571) * -243503015;
                    n3 = (n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317;
                    continue block38;
                }
                case 831736201: {
                    int cfr_ignored_29 = Integer.rotateRight(0xEDD81CA2 ^ n2, 16) + -779544871;
                    n3 = (n2 ^ 0x3EE978CC ^ 0x5C9C3605) + 1553741317;
                    int cfr_ignored_30 = Integer.rotateLeft(0xB602BA28 ^ n2, 9) + 246557203;
                    try {
                        n3 = (n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317 + -1878956842 - -1878956842;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)((n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317) ^ 0x809E7C7FC9BA3D7DL ^ 0x809E7C7FC9BA3D7DL);
                    }
                    continue block38;
                }
                case -107147652: {
                    int cfr_ignored_31 = (Integer.rotateLeft(0xB8D5E434 ^ n2, 10) - 1715749255) * -1193941963;
                    n3 = (n2 ^ 0x9E3AB0B3 ^ 0x5C9C3605) + 1553741317 + 315469546 - 315469546;
                    int cfr_ignored_32 = (Integer.rotateLeft(0x8FF0E650 ^ n2, 4) + 1921614571) * -1880037807;
                    int cfr_ignored_33 = (int)(0x38E18AECC9C5E67BL ^ (long)n2 ^ 0xE8A95F3837D1DC12L);
                    n3 = (n2 ^ 0xCFC2AE26 ^ 0x5C9C3605) + 1553741317;
                    int cfr_ignored_34 = (int)(0xE99AEFB9CB4E61DCL ^ (long)n2 ^ 0x22035A2F389E7EE4L);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317));
                    continue block38;
                }
                case 307368405: {
                    int cfr_ignored_35 = (Integer.rotateLeft(0x749F4B78 ^ n2, 17) + 598196931) * 1956596601;
                    int cfr_ignored_36 = (int)(0x1C258CEEADF56AE2L ^ (long)n2 ^ 0xE4AD97592EE3959AL);
                    n3 = (n2 ^ 0xDA20D0F2 ^ 0x5C9C3605) + 1553741317 ^ 0xE6147043 ^ 0xE6147043;
                    int cfr_ignored_37 = (int)(0xC99A664255D2C318L ^ (long)n2 ^ 0x31F467167D163EE5L);
                    n3 = (n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317 ^ 0xC7EF74EC ^ 0xC7EF74EC;
                    n += 4;
                    continue block38;
                }
                case 671596526: {
                    int cfr_ignored_38 = Integer.rotateLeft(0xA9DB764C ^ n2, 8) - -1779371409;
                    n3 = (int)((long)((n2 ^ 0x170E1759 ^ 0x5C9C3605) + 1553741317) ^ 0x37083A3786CA8F98L ^ 0x37083A3786CA8F98L);
                    int cfr_ignored_39 = (Integer.rotateLeft(0x4121A2FD ^ n2, 11) - -412066850) * 1092723453;
                    int cfr_ignored_40 = (int)(0x83930CC027D4EB4FL ^ (long)n2 ^ 0xE4F0831A2DB8AAF7L);
                    try {
                        n += 4;
                        if ((0x3BFB1E55885571L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317));
                    }
                    n += 4;
                    continue block38;
                }
                case 425155448: {
                    int cfr_ignored_41 = Integer.rotateLeft(0xB7F126C4 ^ n2, 9) - 1251037431;
                    try {
                        n -= 4;
                        if ((0x970B8DE9561815D5L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317 ^ 0x3FCB6108 ^ 0x3FCB6108;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317 + 1262477279 - 1262477279;
                    }
                    --n;
                    continue block38;
                }
                case 888242380: {
                    int cfr_ignored_42 = (Integer.rotateRight(0x2C9388DA ^ n2, 8) + 1782264225) * 747866331;
                    try {
                        --n;
                        if ((0x3551219336379637L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317 ^ 0x665DDB8A ^ 0x665DDB8A;
                    }
                    continue block38;
                }
                case -1652005483: {
                    int cfr_ignored_43 = Integer.rotateLeft(0x422DC385 ^ n2, 11) - 132664406;
                    int cfr_ignored_44 = (int)(0x809F6DB827D4EB4FL ^ (long)n2 ^ 0x2600831A2DB8ACEFL);
                    try {
                        n -= 2;
                        n3 = (n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317 ^ 0x570B6247 ^ 0x570B6247;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317 ^ 0x2A65B343 ^ 0x2A65B343;
                    }
                    continue block38;
                }
            }
            int cfr_ignored_45 = Integer.rotateLeft(0xD2AC8B09 ^ n2, 13) + -2025687726;
            int cfr_ignored_46 = (int)(0x101E253427D4EB4FL ^ (long)n2 ^ 0xB718831A2DB98DEDL);
            n3 = (int)((long)((n2 ^ 0x3F7B7768 ^ 0x5C9C3605) + 1553741317) ^ 0xADB489B060B8678L ^ 0xADB489B060B8678L);
        }
    }

    public boolean dtj() {
        int n = -2093938041;
        n = Integer.rotateLeft(n * 776365289, 16) ^ 0x51F7F457;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x56EE0198;
        if ((n2 ^ n) != 1458438552) {
            int cfr_ignored_0 = (0xD5DF0B1F ^ n) + 1063348705;
        }
        return this.thda == -1;
    }

    public int thm_4() {
        block0: {
            int n = bar.dhr_4(1376182774);
            int n2 = n ^ 0xE4096710;
            if ((n2 ^ n) == -469145840) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xB60F86E6 ^ n, 9) - 272561429;
        }
        return this.thda + 1;
    }

    private static String hmh_2(String string, int n, int n2, int n3) {
        int n4 = 1721753442;
        n4 = Integer.rotateLeft(n4 * 587138019, 18) ^ 0xEF93EB05;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 24)) ^ 0x2D5FF24E;
        if ((n5 ^ n4) != 761262670) {
            int cfr_ignored_0 = (0x4BC02D2C ^ n4) - 1575392425;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x6C76CC24) + i ^ khkhs_2, 8) ^ n2 + jfdh));
        }
        return new String(cArray);
    }

    private static boolean sst_2() {
        block0: {
            int n = -1159588156;
            int n2 = (n = Integer.rotateLeft(n * -171913929, 9) ^ 0x696B7291) ^ 0xBDE06851;
            if ((n2 ^ n) == -1109366703) break block0;
            int cfr_ignored_0 = (0x7027E95 ^ n) - -2142877511;
        }
        return yf.dnkh();
    }

    private static double ghth(long l) {
        block0: {
            int n = 1055372275;
            n = Integer.rotateLeft(n * 791443919, 23) ^ 0x66AF90;
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 29)) ^ 0xB16FFF57;
            if ((n2 ^ n) == -1318060201) break block0;
            int cfr_ignored_0 = (0x8F884CA4 ^ n) - 1750284050;
        }
        return Double.longBitsToDouble(l);
    }

    private static boolean tb() {
        block0: {
            int n = bar.dhr_4(1573652346);
            int n2 = n ^ 0x4743CBD;
            if ((n2 ^ n) == 74726589) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x59B83BC7 ^ n, 14) - -508765100;
        }
        return yf.khdha_2();
    }

    private static String[] ghjj(String string) {
        block0: {
            int n = 1864853680;
            int n2 = (n = Integer.rotateLeft(n * 351449311, 10) ^ 0xC50B7CDA) ^ 0x74807062;
            if ((n2 ^ n) == 1954574434) break block0;
            int cfr_ignored_0 = (0x1BA718D2 ^ n) - 1160269450;
        }
        return string.split("\u0002\u000f", -1);
    }

    private static CallSite tfh_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1098908978;
            n3 = Integer.rotateLeft(n3 * -1284260847, 3) ^ 0xE7DEB;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x9C9B8F61;
            if ((n4 ^ n3) != -1667526815) {
                int cfr_ignored_0 = (0x22E475AF ^ n3) + -2055875213;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ khkw ^ string.hashCode() ^ n2 + jzh_3 ^ i * -1588279859 ^ khkw, 22) ^ jzh_3));
            }
            String[] stringArray = tts.ghjj(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ddypqmp3k(String string) {
        return string.split("\u0001\u0015", -1);
    }

    private static CallSite fkixdtdjn1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ qu61yxeamq4 ^ string.hashCode()) + (n2 + rj6v4kx9v) + i ^ qu61yxeamq4, 20) + rj6v4kx9v);
            }
            String[] stringArray = tts.ddypqmp3k(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
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

