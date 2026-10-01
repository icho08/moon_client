/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import us.m0vy.moondlc.m0vyguard.bthn;
import us.m0vy.moondlc.m0vyguard.bsj;
import us.m0vy.moondlc.m0vyguard.rgh;
import us.m0vy.moondlc.m0vyguard.rq;
import us.m0vy.moondlc.m0vyguard.ghkh;
import us.m0vy.moondlc.m0vyguard.yf;

public class bdht_2 {
    private final List rlj = new ArrayList();
    private String rat = "";
    private final List rdw_2 = new ArrayList();
    private final List thht_3 = new ArrayList();
    private boolean shfs_2 = true;
    private ghkh dty_2;
    private static final int dtn = -1425402438;
    private static final int shl_3 = 621584158;
    private static final int imgok5q7ibvu = -1353762429;
    private static final int l9x1le7vk = 1620109747;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int n1f55nh9o;

    private bdht_2(String string) {
        this.rlj.add(string);
    }

    public static bdht_2 ssht_2(String string) {
        int n = rq.ghsk(-692909339);
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 8);
        int n2 = n ^ 0x8D5A0288;
        if ((n2 ^ n) != -1923480952) {
            int cfr_ignored_0 = Integer.rotateLeft(0x5BE9086D ^ n, 14) - 630563950;
            int cfr_ignored_1 = (int)(0x995BA65027D4EB4FL ^ (long)n ^ 0xB1D0831A2DB89F66L);
        }
        return new bdht_2(string);
    }

    public static bdht_2 jngh(String string, Consumer consumer) {
        try {
            int n = 1902960148;
            n = Integer.rotateLeft(n * -1736738241, 9) ^ 0xB4CE9705;
            Consumer consumer2 = consumer;
            n = (consumer2 != null ? System.identityHashCode(consumer2) : 0) ^ n;
            int n2 = n ^ 0xE03CA19C;
            if ((n2 ^ n) != -532897380) {
                int cfr_ignored_0 = (0x91507F88 ^ n) - 1059766139;
            }
            if ((0x200 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        bdht_2 bdht2 = new bdht_2(string);
        consumer.accept(bdht2);
        return bdht2;
    }

    public bdht_2 bkhd(String ... stringArray) {
        int n = -1210410273;
        int n2 = (n = Integer.rotateLeft(n * -348508149, 3) ^ 0x311BAAB4) ^ 0xBE1CA938;
        if ((n2 ^ n) != -1105417928) {
            int cfr_ignored_0 = (0x9C633E7 ^ n) + -996774872;
        }
        this.rlj.addAll(Arrays.asList(stringArray));
        return this;
    }

    public bdht_2 brsh(String string) {
        int n = 1535590993;
        n = Integer.rotateLeft(n * 1183856613, 27) ^ 0x1335F327;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xB3868200;
        if ((n2 ^ n) != -1283030528) {
            int cfr_ignored_0 = (0xE801C051 ^ n) - -1149886015;
        }
        this.rat = string;
        return this;
    }

    public bdht_2 dqdh_2(String string, Consumer consumer) {
        int n = 0;
        int n2 = 1763735926;
        n2 = Integer.rotateLeft(n2 * -418485273, 5) ^ 0x436ADA3D;
        n2 = System.identityHashCode(this) ^ n2;
        String string2 = string;
        n2 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n2, 25);
        int n3 = (int)((long)(1005757629 * -944699531 + 1139867768 ^ n2) ^ 0xAE66B38F3CF903B8L ^ 0xAE66B38F3CF903B8L);
        block28: while (true) {
            switch (((n3 ^ n2) - 1139867768) * 1064849629) {
                case 1589148425: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0xBF638B34 ^ n2, 10) - 829127303) * -1083995339;
                    bsj bsj2 = bdht_2.ghrs_2(string);
                    consumer.accept(bsj2);
                    this.rdw_2.add(bsj2.ddgh_3());
                    return this;
                }
                case 1005757629: {
                    int cfr_ignored_1 = Integer.rotateRight(0xBA69384E ^ n2, 10) - -1759809363;
                    if (!yf.khdha_2()) {
                        try {
                            n -= 4;
                            n3 = -1682993163 * -944699531 + 1139867768 ^ n2;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = -1682993163 * -944699531 + 1139867768 ^ n2;
                        }
                        continue block28;
                    }
                    try {
                        n += 5;
                        n3 = (1589148425 * -944699531 + 1139867768 ^ n2) + 1457774810 - 1457774810;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (1589148425 * -944699531 + 1139867768 ^ n2) + 426249321 - 426249321;
                    }
                    n -= 4;
                    continue block28;
                }
                case -1682993163: {
                    int cfr_ignored_2 = (Integer.rotateRight(0xB75958F7 ^ n2, 9) - 942630180) * -1218881289;
                    yf.athz_2();
                    throw null;
                }
                case -1522809065: {
                    int cfr_ignored_3 = (Integer.rotateLeft(0xD62040D8 ^ n2, 13) + -230327965) * -702529319;
                    try {
                        n -= 3;
                        if ((0x4C93D9B1CBB21C3DL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.reverse(Integer.reverse(1005757629 * -944699531 + 1139867768 ^ n2));
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = 1005757629 * -944699531 + 1139867768 ^ n2 ^ 0x2A67B48C ^ 0x2A67B48C;
                    }
                    n -= 5;
                    continue block28;
                }
                case -129979820: {
                    int cfr_ignored_4 = (Integer.rotateLeft(0xD1DCCF54 ^ n2, 13) - 1847245415) * -774058155;
                    n3 = 1005757629 * -944699531 + 1139867768 ^ n2;
                    n -= 5;
                    continue block28;
                }
                case 456709047: {
                    int cfr_ignored_5 = Integer.rotateRight(0xBAB7FD03 ^ n2, 10) + -1599782248;
                    n3 = (2063755743 * -944699531 + 1139867768 ^ n2) + 1719775400 - 1719775400;
                    int cfr_ignored_6 = Integer.rotateRight(0x6AE47323 ^ n2, 16) + -167276424;
                    n3 = (-959565047 * -944699531 + 1139867768 ^ n2) + 210024970 - 210024970;
                    int cfr_ignored_7 = (Integer.rotateLeft(0x5BC84451 ^ n2, 14) + 563995914) * 1539851345;
                    int cfr_ignored_8 = (int)(0x997AEA6C27D4EB4FL ^ (long)n2 ^ 0x29A8831A2DB89F24L);
                    n3 = 1005757629 * -944699531 + 1139867768 ^ n2 ^ 0x9598265E ^ 0x9598265E;
                    continue block28;
                }
                case 254147952: {
                    int cfr_ignored_9 = Integer.rotateRight(0xD18982EA ^ n2, 13) + 1678014865;
                    n3 = -52168603 * -944699531 + 1139867768 ^ n2;
                    int cfr_ignored_10 = Integer.rotateRight(0xFAEB9A07 ^ n2, 18) - 1726301716;
                    try {
                        --n;
                        if ((0xBBEBE05CF9A08E31L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = 1005757629 * -944699531 + 1139867768 ^ n2;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(1005757629 * -944699531 + 1139867768 ^ n2));
                    }
                    continue block28;
                }
                case 1678731126: {
                    int cfr_ignored_11 = Integer.rotateLeft(0x10A7EE64 ^ n2, 5) - 145980759;
                    n3 = -285272754 * -944699531 + 1139867768 ^ n2 ^ 0x1AACF878 ^ 0x1AACF878;
                    int cfr_ignored_12 = Integer.rotateRight(0x200734E2 ^ n2, 7) + -448985447;
                    try {
                        n3 = 1005757629 * -944699531 + 1139867768 ^ n2;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(1005757629 * -944699531 + 1139867768 ^ n2));
                    }
                    --n;
                    continue block28;
                }
                case -838324807: {
                    int cfr_ignored_13 = (Integer.rotateRight(0x3CA55957 ^ n2, 10) - 1550020804) * 1017469271;
                    n3 = (-882457639 * -944699531 + 1139867768 ^ n2) + -1774569936 - -1774569936;
                    int cfr_ignored_14 = Integer.rotateRight(0x5D512AAA ^ n2, 14) + 1362217425;
                    n3 = 917104662 * -944699531 + 1139867768 ^ n2;
                    int cfr_ignored_15 = (Integer.rotateLeft(0x369E94BC ^ n2, 9) - -1584291329) * 916362429;
                    n3 = (1005757629 * -944699531 + 1139867768 ^ n2) + -1508788474 - -1508788474;
                    n -= 4;
                    continue block28;
                }
                case 938864413: {
                    int cfr_ignored_16 = Integer.rotateRight(0x12926A4F ^ n2, 5) - 1142456012;
                    int cfr_ignored_17 = (int)(0x2880AB7F93D5ED8BL ^ (long)n2 ^ 0xAB8FEB182031FCD0L);
                    n3 = 1005757629 * -944699531 + 1139867768 ^ n2 ^ 0x422D4273 ^ 0x422D4273;
                    continue block28;
                }
                case 1884443167: {
                    int cfr_ignored_18 = Integer.rotateRight(0xA2F462EE ^ n2, 7) - -1074423283;
                    n3 = -2025870024 * -944699531 + 1139867768 ^ n2;
                    int cfr_ignored_19 = (Integer.rotateRight(0x1AFB9EDA ^ n2, 6) + 1221974945) * 452697819;
                    n3 = (int)((long)(1005757629 * -944699531 + 1139867768 ^ n2) ^ 0xF467C675C1857BEDL ^ 0xF467C675C1857BEDL);
                    n += 4;
                    continue block28;
                }
                case 463788967: {
                    int cfr_ignored_20 = Integer.rotateLeft(0xE0CD030C ^ n2, 15) - 1026620847;
                    n3 = (-260904668 * -944699531 + 1139867768 ^ n2) + -94403639 - -94403639;
                    int cfr_ignored_21 = Integer.rotateRight(0x94D2E526 ^ n2, 5) - 166158037;
                    n3 = Integer.reverse(Integer.reverse(1005757629 * -944699531 + 1139867768 ^ n2));
                    continue block28;
                }
                case 1121007306: {
                    int cfr_ignored_22 = (Integer.rotateRight(0xAE7514BB ^ n2, 8) + 613097952) * -1368058693;
                    n3 = -1298800213 * -944699531 + 1139867768 ^ n2;
                    int cfr_ignored_23 = (Integer.rotateRight(0xA0EB243A ^ n2, 7) + -2133392831) * -1595202501;
                    n3 = Integer.reverse(Integer.reverse(-1273405008 * -944699531 + 1139867768 ^ n2));
                    int cfr_ignored_24 = Integer.rotateLeft(0x31EC390C ^ n2, 9) - 267945903;
                    n3 = (1005757629 * -944699531 + 1139867768 ^ n2) + -1900645901 - -1900645901;
                    n -= 5;
                    continue block28;
                }
                case -252747836: {
                    int cfr_ignored_25 = Integer.rotateLeft(0x8C6DEA28 ^ n2, 4) + 95222291;
                    n3 = 750669504 * -944699531 + 1139867768 ^ n2 ^ 0x943BCEAA ^ 0x943BCEAA;
                    int cfr_ignored_26 = (Integer.rotateLeft(0x8546AF50 ^ n2, 3) + 669833707) * -2058965167;
                    try {
                        n += 2;
                        n3 = 1005757629 * -944699531 + 1139867768 ^ n2;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (1005757629 * -944699531 + 1139867768 ^ n2) + 1120926441 - 1120926441;
                    }
                    n -= 2;
                    continue block28;
                }
            }
            int cfr_ignored_27 = (Integer.rotateLeft(0xC81BAB74 ^ n2, 12) - 1068982855) * -937710731;
            n3 = (int)((long)(1005757629 * -944699531 + 1139867768 ^ n2) ^ 0x530C8813AA44299BL ^ 0x530C8813AA44299BL);
        }
    }

    public bdht_2 zdht(bthn bthn2) {
        int n = rq.ghsk(-1200824529);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
        bthn bthn3 = bthn2;
        n = Integer.rotateRight((bthn3 != null ? System.identityHashCode(bthn3) : 0) ^ n, 10);
        int n2 = n ^ 0xA3C617F8;
        if ((n2 ^ n) != -1547298824) {
            int cfr_ignored_0 = (Integer.rotateRight(0x1BAAC8D7 ^ n, 6) - 1577840964) * 464177367;
        }
        this.thht_3.add(bthn2);
        return this;
    }

    /*
     * Unable to fully structure code
     */
    public bdht_2 dnf_2() {
        var1_1 = null;
        var4_2 = 0;
        var2_3 = -932330283;
        var2_3 = Integer.rotateLeft(var2_3 * 1768947265, 22) ^ 1124607003;
        var2_3 = System.identityHashCode(this) ^ var2_3;
        var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 1428042338, 21)));
        while (true) {
            block41: {
                block44: {
                    block38: {
                        block39: {
                            block49: {
                                block50: {
                                    block47: {
                                        block45: {
                                            block40: {
                                                block48: {
                                                    block43: {
                                                        block46: {
                                                            block42: {
                                                                var4_2 = Integer.rotateRight(var3_4, 21) ^ var2_3;
                                                                switch (var4_2 & 7) {
                                                                    case 1: {
                                                                        if (var4_2 != -513499279) {
                                                                            ** break;
                                                                        }
                                                                        break block38;
                                                                    }
                                                                    case 2: {
                                                                        if (var4_2 != -1042797670) {
                                                                            if (var4_2 == 1428042338) break;
                                                                            ** break;
                                                                        }
                                                                        break block39;
                                                                    }
                                                                    case 3: {
                                                                        if (var4_2 == 1676656843) break block40;
                                                                        if (var4_2 == 1224051251) break block41;
                                                                        Integer.rotateRight(846422446 ^ var2_3, 9) - 542536525;
                                                                        if (var4_2 != -2017325941) {
                                                                            ** break;
                                                                        }
                                                                        break block42;
                                                                    }
                                                                    case 4: {
                                                                        if (var4_2 == 2144210604) break block43;
                                                                        if (var4_2 == -1835533556) break block44;
                                                                        (Integer.rotateRight(617378806 ^ var2_3, 7) - 2032118277) * 617378807;
                                                                        if (var4_2 != 1467116684) {
                                                                            ** break;
                                                                        }
                                                                        break block45;
                                                                    }
                                                                    case 5: {
                                                                        if (var4_2 == 1605127141) break block46;
                                                                        if (var4_2 != 1891149709) {
                                                                            (Integer.rotateLeft(-2139282664 ^ var2_3, 3) + -1820008669) * -2139282663;
                                                                            ** break;
                                                                        }
                                                                        break block47;
                                                                    }
                                                                    case 6: {
                                                                        if (var4_2 != 1209674654) {
                                                                            ** break;
                                                                        }
                                                                        break block48;
                                                                    }
                                                                    case 7: {
                                                                        if (var4_2 == -789123585) ** GOTO lbl52
                                                                        if (var4_2 == -2066947217) break block49;
                                                                        if (var4_2 != -1008250201) {
                                                                            ** break;
                                                                        }
                                                                        break block50;
lbl52:
                                                                        // 1 sources

                                                                        (Integer.rotateRight(-1452908645 ^ var2_3, 8) + -2017250560) * -1452908645;
                                                                        throw null;
                                                                    }
                                                                }
                                                                (Integer.rotateRight(592313406 ^ var2_3, 7) - 1255090877) * 592313407;
                                                                if (!bdht_2.mkh()) {
                                                                    try {
                                                                        var4_2 -= 5;
                                                                        if ((-3346954839107346591L ^ (long)var2_3 | 1L) == 0L) {
                                                                            throw new ArithmeticException();
                                                                        }
                                                                        var3_4 = Integer.rotateLeft(var2_3 ^ -2017325941, 21) ^ 1363197402 ^ 1363197402;
                                                                    }
                                                                    catch (ArithmeticException v0) {
                                                                        var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -2017325941, 21)));
                                                                    }
                                                                    continue;
                                                                }
                                                                var3_4 = Integer.rotateLeft(var2_3 ^ -1718265101, 21);
                                                                (Integer.rotateLeft(365737488 ^ var2_3, 5) + -1473795285) * 365737489;
                                                                var3_4 = Integer.rotateLeft(var2_3 ^ -789123585, 21) ^ 858324443 ^ 858324443;
                                                                var4_2 -= 2;
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(-495078463 ^ var2_3, 15) + 1905681306;
                                                            (int)(2364141298230029135L ^ (long)var2_3 ^ -4140915708907623345L);
                                                            this.shfs_2 = false;
                                                            var1_1 = this;
                                                            try {
                                                                var4_2 -= 2;
                                                                if ((2708383181084721745L ^ (long)var2_3 | 1L) == 0L) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 1224051251, 21) ^ -5601190101989824460L ^ -5601190101989824460L);
                                                            }
                                                            catch (IllegalStateException v1) {
                                                                var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 1224051251, 21) ^ 5797340777347333361L ^ 5797340777347333361L);
                                                            }
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(1428237869 ^ var2_3, 13) - 1398945454;
                                                        (int)(-7524529745529869489L ^ (long)var2_3 ^ -193510635517476106L);
                                                        try {
                                                            var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 1428042338, 21)));
                                                        }
                                                        catch (ArithmeticException v2) {
                                                            var3_4 = Integer.rotateLeft(var2_3 ^ 1428042338, 21) ^ 505969726 ^ 505969726;
                                                        }
                                                        continue;
                                                    }
                                                    Integer.rotateRight(944071471 ^ var2_3, 10) - -725310996;
                                                    (int)(-6433072111627454133L ^ (long)var2_3 ^ -5147637182345715549L);
                                                    var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 1428042338, 21) ^ 5612820521465972817L ^ 5612820521465972817L);
                                                    --var4_2;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(537345084 ^ var2_3, 7) - -448927105) * 537345085;
                                                try {
                                                    var4_2 -= 2;
                                                    if ((902526873617063921L ^ (long)var2_3 | 1L) == 0L) {
                                                        throw new IllegalStateException();
                                                    }
                                                    var3_4 = Integer.rotateLeft(var2_3 ^ 1428042338, 21);
                                                }
                                                catch (IllegalStateException v3) {
                                                    var3_4 = Integer.rotateLeft(var2_3 ^ 1428042338, 21) + -1647285453 - -1647285453;
                                                }
                                                continue;
                                            }
                                            (Integer.rotateLeft(-1771423408 ^ var2_3, 5) + 993693675) * -1771423407;
                                            var3_4 = Integer.rotateLeft(var2_3 ^ -1639965406, 21) + -1878787831 - -1878787831;
                                            Integer.rotateRight(-1649677210 ^ var2_3, 6) - 472858517;
                                            (int)(-4073459336672939919L ^ (long)var2_3 ^ -6209987200142793951L);
                                            var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 1428042338, 21)));
                                            continue;
                                        }
                                        Integer.rotateRight(123329031 ^ var2_3, 3) - -398522860;
                                        var3_4 = Integer.rotateLeft(var2_3 ^ -2109227261, 21) + -1775803623 - -1775803623;
                                        (Integer.rotateLeft(602395096 ^ var2_3, 7) + 1567623267) * 602395097;
                                        var3_4 = Integer.rotateLeft(var2_3 ^ 1428042338, 21) ^ 1770520651 ^ 1770520651;
                                        var4_2 -= 5;
                                        continue;
                                    }
                                    Integer.rotateRight(1492545795 ^ var2_3, 14) + -902476136;
                                    var3_4 = Integer.rotateLeft(var2_3 ^ 1428042338, 21) + -1022319699 - -1022319699;
                                    Integer.rotateRight(-1479785178 ^ var2_3, 7) - 1444544213;
                                    var4_2 -= 5;
                                    continue;
                                }
                                Integer.rotateRight(1907850603 ^ var2_3, 17) + -912928976;
                                try {
                                    ++var4_2;
                                    if ((3709554394760282087L ^ (long)var2_3 | 1L) == 0L) {
                                        throw new IllegalStateException();
                                    }
                                    var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 1428042338, 21) ^ 2098421563759103181L ^ 2098421563759103181L);
                                }
                                catch (IllegalStateException v4) {
                                    var3_4 = Integer.rotateLeft(var2_3 ^ 1428042338, 21);
                                }
                                var4_2 -= 2;
                                continue;
                            }
                            (Integer.rotateRight(-1486889070 ^ var2_3, 7) + 1224323561) * -1486889069;
                            var3_4 = Integer.rotateLeft(var2_3 ^ -529738004, 21) + 1458041626 - 1458041626;
                            (Integer.rotateRight(217954239 ^ var2_3, 4) - -1760108708) * 217954239;
                            var3_4 = Integer.rotateLeft(var2_3 ^ 1428042338, 21) ^ -1263184384 ^ -1263184384;
                            var4_2 -= 3;
                            continue;
                        }
                        Integer.rotateLeft(-223164696 ^ var2_3, 17) + 1745073491;
                        try {
                            if ((-361351919335158803L ^ (long)var2_3 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var3_4 = Integer.rotateLeft(var2_3 ^ 1428042338, 21) ^ -1576219126 ^ -1576219126;
                        }
                        catch (IllegalStateException v5) {
                            var3_4 = Integer.rotateLeft(var2_3 ^ 1428042338, 21) ^ -1005229779 ^ -1005229779;
                        }
                        var4_2 -= 3;
                        continue;
                    }
                    Integer.rotateLeft(-1387810547 ^ var2_3, 8) - 790478;
                    (int)(8067388599191268175L ^ (long)var2_3 ^ -4390865488226717125L);
                    try {
                        var4_2 -= 5;
                        if ((8492160692922417699L ^ (long)var2_3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var3_4 = Integer.rotateLeft(var2_3 ^ 1428042338, 21);
                    }
                    catch (NoSuchElementException v6) {
                        var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 1428042338, 21) ^ 7280161787472829280L ^ 7280161787472829280L);
                    }
                    --var4_2;
                    continue;
                }
                Integer.rotateRight(180067654 ^ var2_3, 4) - 1360374453;
                var3_4 = Integer.rotateLeft(var2_3 ^ 486245512, 21) ^ -1835006907 ^ -1835006907;
                (Integer.rotateLeft(1182937744 ^ var2_3, 11) + -1910391125) * 1182937745;
                var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 1428042338, 21) ^ -5118798206435355496L ^ -5118798206435355496L);
                Integer.rotateLeft(1550111904 ^ var2_3, 14) + 882073243;
                continue;
            }
            return var1_1;
lbl208:
            // 8 sources

            Integer.rotateLeft(-683029183 ^ var2_3, 13) + 374176282;
            (int)(1583969078846221135L ^ (long)var2_3 ^ 4289822793529919015L);
            var3_4 = Integer.rotateLeft(var2_3 ^ 1428042338, 21) ^ -745859376 ^ -745859376;
        }
    }

    public bdht_2 jmz(ghkh ghkh2) {
        try {
            int n = 1261203789;
            n = Integer.rotateLeft(n * 368174943, 19) ^ 0x4B4176DF;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 11);
            int n2 = n ^ 0xEE19E613;
            if ((n2 ^ n) != -300292589) {
                int cfr_ignored_0 = (0xA535975E ^ n) - 1276978522;
            }
            if ((0x171 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            bdht_2.sdj();
            throw null;
        }
        this.dty_2 = ghkh2;
        return this;
    }

    public bthn szy_2() {
        if (this.shfs_2 && this.dty_2 == null) {
            throw new IllegalStateException("Executable command requires handler");
        }
        if (!this.shfs_2 && this.dty_2 != null) {
            throw new IllegalStateException("Hub command cannot have handler");
        }
        return new rgh(this.rlj, this.rat, this.rdw_2, this.thht_3, this.shfs_2, this.dty_2);
    }

    private static bsj ghrs_2(String string) {
        block0: {
            int n = -1066894248;
            n = Integer.rotateLeft(n * 1172811583, 13) ^ 0xA9E7C9C7;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x8B13495;
            if ((n2 ^ n) == 145831061) break block0;
            int cfr_ignored_0 = (0xC8D948CD ^ n) - -2084917374;
        }
        return bsj.ths_9(string);
    }

    private static boolean mkh() {
        block0: {
            int n = -1535506056;
            int n2 = (n = Integer.rotateLeft(n * 1233604825, 19) ^ 0x3B5FE749) ^ 0xBA57F7C8;
            if ((n2 ^ n) == -1168640056) break block0;
            int cfr_ignored_0 = (0x1E2DFEB0 ^ n) - 76427549;
        }
        return yf.dnkh();
    }

    private static void sdj() {
        int n = -1753286197;
        int n2 = (n = Integer.rotateLeft(n * 1608146265, 22) ^ 0x642D933F) ^ 0x4662D4FB;
        if ((n2 ^ n) != 1180882171) {
            int cfr_ignored_0 = (0xD11C2D30 ^ n) + 1152248452;
        }
        yf.athz_2();
    }

    private static String[] zhz_4(String string) {
        int n = -488115840;
        n = Integer.rotateLeft(n * 1604607897, 20) ^ 0xEF345148;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xAE91EBE1;
        if ((n2 ^ n) != -1366168607) {
            int cfr_ignored_0 = (0x4C761A61 ^ n) - -2112677270;
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

    private static CallSite dtb_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -741682467;
            n3 = Integer.rotateLeft(n3 * -921363063, 19) ^ 0x8EDB0E7C;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x9D12B3A;
            if ((n4 ^ n3) != 164703034) {
                int cfr_ignored_0 = (0xDA1BF9E7 ^ n3) - -2112847087;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dtn ^ string.hashCode() ^ n2 + shl_3 ^ i * 237032843 ^ dtn, 16) ^ shl_3));
            }
            String[] stringArray = bdht_2.zhz_4(new String(cArray));
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

    private static String[] c4g7ov3rez6y7(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite qzqnksbz0oubhf(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ imgok5q7ibvu ^ string.hashCode() ^ n2 + l9x1le7vk ^ i * 2001594403 ^ imgok5q7ibvu, 12) ^ l9x1le7vk));
            }
            String[] stringArray = bdht_2.c4g7ov3rez6y7(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

