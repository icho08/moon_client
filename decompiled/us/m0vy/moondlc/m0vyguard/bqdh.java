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
import us.m0vy.moondlc.m0vyguard.bkhj;

public class bqdh {
    private float twth;
    private float bsz_3;
    private final float dsl;
    private final float thtr_2;
    private boolean tkr;
    private static final int ddq_2 = 1142022330;
    private static final int jkhd = 492809884;
    private static final int l0h3c5fgg = 1691930665;
    private static final int cxzwylzz2otg6 = -1129139573;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int a92i8q8s5eyy;

    public bqdh(float f, float f2, boolean bl) {
        this.twth = f;
        this.bsz_3 = f2;
        this.dsl = f;
        this.thtr_2 = f2;
        this.tkr = bl;
    }

    public boolean dhdsh_2() {
        int n = -133352403;
        int n2 = (n = Integer.rotateLeft(n * 861228931, 13) ^ 0x500C3CF1) ^ 0x80787A7C;
        if ((n2 ^ n) != -2139587972) {
            int cfr_ignored_0 = (0x78754E51 ^ n) + 464291580;
        }
        return this.twth != this.dsl || this.bsz_3 != this.thtr_2;
    }

    /*
     * Unable to fully structure code
     */
    public void rwd_2(float var1_1) {
        var4_2 = 0;
        var2_3 = 2019713980;
        var2_3 = Integer.rotateLeft(var2_3 * -1163906287, 9) ^ -252762175;
        var2_3 = System.identityHashCode(this) ^ var2_3;
        var2_3 = Integer.rotateLeft(Float.floatToIntBits(var1_1) ^ var2_3, 2);
        var3_4 = (var2_3 ^ -173818859 ^ 230279100) + 230279100 ^ 544468935 ^ 544468935;
        block33: while (true) {
            if ((var4_2 = var3_4 - 230279100 ^ 230279100 ^ var2_3) == -295515554) ** GOTO lbl-1000
            if (var4_2 != -1888244993) {
                (Integer.rotateLeft(-756726951 ^ var2_3, 13) + -1910454526) * -756726951;
                (int)(1177670842001451855L ^ (long)var2_3 ^ 2862181711653473662L);
                switch (var4_2) {
                    case 606779554: {
                        bkhj.bzy_2(536894304, var2_3);
                        (int)(-4740281765245322219L ^ (long)var2_3 ^ -5133485482112659009L);
                        return;
                    }
                    case -1508342647: {
                        Integer.rotateLeft(-111764635 ^ var2_3, 18) - 903508086;
                        (int)(4315632995669437263L ^ (long)var2_3 ^ -7511860029994444263L);
                        this.twth = bqdh.hsy_2(Float.intBitsToFloat(bqdh.bsk(355450352 ^ 371551728, 6)), Math.min(Float.intBitsToFloat(-289858056 - -1408950792), var1_1));
                        (int)(3812068752058037207L ^ (long)var2_3 ^ -7072147705936886753L);
                        var3_4 = (var2_3 ^ -430451516 ^ 230279100) + 230279100;
                        (int)(749649186743097321L ^ (long)var2_3 ^ 7970702033495111967L);
                        var3_4 = (var2_3 ^ 606779554 ^ 230279100) + 230279100;
                        var4_2 -= 4;
                        continue block33;
                    }
                    case -1815777111: {
                        (Integer.rotateRight(-1018437445 ^ var2_3, 11) + -1433545248) * -1018437445;
                        if (Float.isInfinite(var1_1)) {
                            try {
                                var4_2 += 3;
                                if ((6120485354751810739L ^ (long)var2_3 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                var3_4 = (var2_3 ^ 606779554 ^ 230279100) + 230279100 ^ -1228025614 ^ -1228025614;
                            }
                            catch (IllegalStateException v0) {
                                var3_4 = (var2_3 ^ 606779554 ^ 230279100) + 230279100 ^ -1992933490 ^ -1992933490;
                            }
                            var4_2 -= 4;
                            continue block33;
                        }
                        try {
                            --var4_2;
                            if ((-3656962732402993591L ^ (long)var2_3 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            var3_4 = (var2_3 ^ -1508342647 ^ 230279100) + 230279100;
                        }
                        catch (UnsupportedOperationException v1) {
                            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1508342647 ^ 230279100) + 230279100));
                        }
                        continue block33;
                    }
                    case -173818859: {
                        Integer.rotateRight(653667463 ^ var2_3, 7) - -1137900652;
                        if (Float.isNaN(var1_1)) {
                            (int)(-8251483178136520110L ^ (long)var2_3 ^ 5979054813034493736L);
                            var3_4 = (var2_3 ^ 606779554 ^ 230279100) + 230279100;
                            var4_2 -= 2;
                            continue block33;
                        }
                        try {
                            var4_2 -= 4;
                            if ((2767264457453597135L ^ (long)var2_3 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1815777111 ^ 230279100) + 230279100));
                        }
                        catch (IllegalArgumentException v2) {
                            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1815777111 ^ 230279100) + 230279100));
                        }
                        var4_2 += 5;
                        continue block33;
                    }
                    case -767600683: {
                        (Integer.rotateLeft(2054749140 ^ var2_3, 18) - -654041625) * 2054749141;
                        var3_4 = (var2_3 ^ 1151422318 ^ 230279100) + 230279100 + -72549925 - -72549925;
                        (Integer.rotateRight(1307349211 ^ var2_3, 12) + 1946364352) * 1307349211;
                        try {
                            var3_4 = (var2_3 ^ -173818859 ^ 230279100) + 230279100;
                        }
                        catch (UnsupportedOperationException v3) {
                            var3_4 = (int)((long)((var2_3 ^ -173818859 ^ 230279100) + 230279100) ^ 14591323895738455L ^ 14591323895738455L);
                        }
                        continue block33;
                    }
                    case 1888408073: {
                        bkhj.bzy_2(-329003840, var2_3);
                        (int)(8238409151798737941L ^ (long)var2_3 ^ -7529400483873732232L);
                        (int)(8471160830501619037L ^ (long)var2_3 ^ -3838863265717467442L);
                        var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -2084647451 ^ 230279100) + 230279100));
                        (int)(4154714147215042630L ^ (long)var2_3 ^ -544094814330954112L);
                        var3_4 = (var2_3 ^ -173818859 ^ 230279100) + 230279100;
                        continue block33;
                    }
                    case 1243869203: {
                        (Integer.rotateRight(1322370742 ^ var2_3, 12) - -1882935483) * 1322370743;
                        try {
                            var4_2 += 4;
                            var3_4 = (var2_3 ^ -173818859 ^ 230279100) + 230279100 ^ 1936418908 ^ 1936418908;
                        }
                        catch (UnsupportedOperationException v4) {
                            var3_4 = (var2_3 ^ -173818859 ^ 230279100) + 230279100;
                        }
                        var4_2 -= 5;
                        continue block33;
                    }
                    case -1946474679: {
                        Integer.rotateRight(386948579 ^ var2_3, 5) + -816251464;
                        try {
                            var4_2 += 3;
                            var3_4 = (var2_3 ^ -173818859 ^ 230279100) + 230279100;
                        }
                        catch (NoSuchElementException v5) {
                            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -173818859 ^ 230279100) + 230279100));
                        }
                        var4_2 += 5;
                        continue block33;
                    }
                }
            }
            ** GOTO lbl175
lbl-1000:
            // 1 sources

            {
                Integer.rotateRight(2040834382 ^ var2_3, 18) - -1085399123;
                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1235625303 ^ 230279100) + 230279100));
                Integer.rotateRight(1812214243 ^ var2_3, 16) + 417311160;
                try {
                    var3_4 = (var2_3 ^ -173818859 ^ 230279100) + 230279100 ^ -1336849673 ^ -1336849673;
                }
                catch (UnsupportedOperationException v6) {
                    var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -173818859 ^ 230279100) + 230279100));
                }
                continue block33;
                case 265160075: {
                    Integer.rotateRight(1636942443 ^ var2_3, 15) + -721147344;
                    var3_4 = (int)((long)((var2_3 ^ 489838916 ^ 230279100) + 230279100) ^ -7208945026621949345L ^ -7208945026621949345L);
                    (Integer.rotateRight(495305178 ^ var2_3, 6) + -1752164191) * 495305179;
                    var3_4 = (var2_3 ^ 1130391981 ^ 230279100) + 230279100 + -983735637 - -983735637;
                    Integer.rotateLeft(-1709620471 ^ var2_3, 6) + -1385382574;
                    (int)(6389461304617528143L ^ (long)var2_3 ^ 2817145715379739782L);
                    var3_4 = (var2_3 ^ -173818859 ^ 230279100) + 230279100;
                    var4_2 += 2;
                    continue block33;
                }
                case 298056577: {
                    Integer.rotateLeft(697429517 ^ var2_3, 8) - 218723022;
                    (int)(-1503287275040740529L ^ (long)var2_3 ^ 9011847002827815831L);
                    try {
                        var4_2 -= 5;
                        if ((906028216395321067L ^ (long)var2_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var3_4 = (var2_3 ^ -173818859 ^ 230279100) + 230279100 ^ -2066042683 ^ -2066042683;
                    }
                    catch (ArithmeticException v7) {
                        var3_4 = (var2_3 ^ -173818859 ^ 230279100) + 230279100 ^ -454429038 ^ -454429038;
                    }
                    continue block33;
                }
                case -662517175: {
                    Integer.rotateRight(-730785458 ^ var2_3, 13) - -1106268243;
                    var3_4 = (var2_3 ^ -1811148178 ^ 230279100) + 230279100 ^ -1531844522 ^ -1531844522;
                    Integer.rotateLeft(1248232872 ^ var2_3, 12) + 113757843;
                    var3_4 = (var2_3 ^ -1878783864 ^ 230279100) + 230279100;
                    (Integer.rotateRight(-749640778 ^ var2_3, 13) - -1690783163) * -749640777;
                    var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -173818859 ^ 230279100) + 230279100));
                    var4_2 -= 2;
                    continue block33;
                }
lbl175:
                // 1 sources

                Integer.rotateLeft(665494244 ^ var2_3, 7) - -771270441;
                var3_4 = (var2_3 ^ -330851730 ^ 230279100) + 230279100;
                Integer.rotateLeft(1996164161 ^ var2_3, 17) + 1824791322;
                (int)(-5455650819454735537L ^ (long)var2_3 ^ -5077664431400762046L);
                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -173818859 ^ 230279100) + 230279100));
                --var4_2;
                continue block33;
                case 1247172789: {
                    (Integer.rotateLeft(-1004656752 ^ var2_3, 11) + -1006343765) * -1004656751;
                    var3_4 = (var2_3 ^ -1768452806 ^ 230279100) + 230279100 + -813400719 - -813400719;
                    Integer.rotateLeft(326487497 ^ var2_3, 5) + 1604422290;
                    (int)(-3330583499125757105L ^ (long)var2_3 ^ 4222268799119265375L);
                    (int)(-4015019882055334422L ^ (long)var2_3 ^ 7787264027997125982L);
                    var3_4 = (int)((long)((var2_3 ^ -1317157129 ^ 230279100) + 230279100) ^ -265715155248394176L ^ -265715155248394176L);
                    (int)(4772201856014827478L ^ (long)var2_3 ^ 8496987108186728869L);
                    var3_4 = (var2_3 ^ -173818859 ^ 230279100) + 230279100 + 1008865388 - 1008865388;
                    --var4_2;
                    continue block33;
                }
                case -1092780836: {
                    bkhj.bzy_2(-1010662752, var2_3);
                    (int)(6770593701749750805L ^ (long)var2_3 ^ 811266026016413242L);
                    try {
                        var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -173818859 ^ 230279100) + 230279100));
                    }
                    catch (IllegalArgumentException v8) {
                        var3_4 = (int)((long)((var2_3 ^ -173818859 ^ 230279100) + 230279100) ^ -5797159016422700441L ^ -5797159016422700441L);
                    }
                    var4_2 += 3;
                }
            }
            (Integer.rotateLeft(-1622251107 ^ var2_3, 6) - 1323067710) * -1622251107;
            (int)(6772507430335343439L ^ (long)var2_3 ^ 8228220667665389096L);
            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -173818859 ^ 230279100) + 230279100));
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void shkhj(float var1_1) {
        var4_2 = 0;
        var2_3 = 1422473527;
        var2_3 = Integer.rotateLeft(var2_3 * 1008750827, 10) ^ 466352427;
        var2_3 = System.identityHashCode(this) ^ var2_3;
        var2_3 = Integer.rotateRight(Float.floatToIntBits(var1_1) ^ var2_3, 16);
        var3_4 = -1046083181 + var2_3 ^ 94665974 ^ 94665974;
        block25: while (true) {
            if ((var4_2 = var3_4 - var2_3) == 61952120) ** GOTO lbl166
            if (var4_2 == -299283885) ** GOTO lbl46
            switch (var4_2) {
                case 1737301114: {
                    Integer.rotateRight(-1817538778 ^ var2_3, 5) - -435882795;
                    if (!bqdh.bja_2(var1_1)) {
                        var3_4 = (int)((long)(1385536626 + var2_3) ^ 5829005853889718780L ^ 5829005853889718780L);
                        Integer.rotateRight(1799488042 ^ var2_3, 16) + 22798929;
                        var3_4 = -299283885 + var2_3;
                        var4_2 -= 5;
                        continue block25;
                    }
                    try {
                        var4_2 -= 3;
                        if ((-6435939727590761055L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var3_4 = -2113205250 + var2_3 ^ 74184225 ^ 74184225;
                    }
                    catch (IllegalArgumentException v0) {
                        var3_4 = Integer.reverse(Integer.reverse(-2113205250 + var2_3));
                    }
                    continue block25;
                }
                case -1046083181: {
                    Integer.rotateRight(235975051 ^ var2_3, 4) + -1201463536;
                    if (Float.isNaN(var1_1)) {
                        try {
                            var3_4 = (int)((long)(-2113205250 + var2_3) ^ 2396195518673678594L ^ 2396195518673678594L);
                        }
                        catch (NoSuchElementException v1) {
                            var3_4 = -2113205250 + var2_3;
                        }
                        continue block25;
                    }
                    var3_4 = 833865038 + var2_3;
                    Integer.rotateLeft(740141984 ^ var2_3, 8) + 1542809499;
                    var3_4 = 1737301114 + var2_3 + 1478517769 - 1478517769;
                    ++var4_2;
                    continue block25;
                }
lbl46:
                // 1 sources

                (Integer.rotateRight(-1410804909 ^ var2_3, 8) + -712034744) * -1410804909;
                this.bsz_3 = var1_1;
                try {
                    var4_2 += 3;
                    if ((1892558471553824795L ^ (long)var2_3 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    var3_4 = -2113205250 + var2_3 ^ -784720124 ^ -784720124;
                }
                catch (ArithmeticException v2) {
                    var3_4 = -2113205250 + var2_3;
                }
                continue block25;
                case 730037350: {
                    (Integer.rotateLeft(202422968 ^ var2_3, 4) + 2053389187) * 202422969;
                    try {
                        var4_2 -= 2;
                        var3_4 = Integer.reverse(Integer.reverse(-1046083181 + var2_3));
                    }
                    catch (IllegalStateException v3) {
                        var3_4 = (int)((long)(-1046083181 + var2_3) ^ -3354749093930410436L ^ -3354749093930410436L);
                    }
                    --var4_2;
                    continue block25;
                }
                case -1596884184: {
                    Integer.rotateLeft(-759532567 ^ var2_3, 13) + -1997428622;
                    (int)(1155417207691602767L ^ (long)var2_3 ^ 5104974326083980736L);
                    var3_4 = 671190390 + var2_3 + -240701890 - -240701890;
                    (Integer.rotateLeft(379865368 ^ var2_3, 5) + -1035831005) * 379865369;
                    var3_4 = -1046083181 + var2_3 + 738468322 - 738468322;
                    var4_2 += 2;
                    continue block25;
                }
                case 1526504284: {
                    Integer.rotateRight(755214094 ^ var2_3, 8) - 2010044909;
                    var3_4 = 1259503991 + var2_3 + 542872902 - 542872902;
                    Integer.rotateRight(-87079933 ^ var2_3, 18) + 1668733848;
                    var3_4 = (int)((long)(-1046083181 + var2_3) ^ -745811256391735683L ^ -745811256391735683L);
                    var4_2 += 5;
                    continue block25;
                }
                case -1610921021: {
                    Integer.rotateLeft(-264403924 ^ var2_3, 17) - 466657423;
                    var3_4 = -2049435870 + var2_3;
                    Integer.rotateLeft(-1491550899 ^ var2_3, 7) - 1079806862;
                    (int)(7325689116297063247L ^ (long)var2_3 ^ -2625454434297485691L);
                    var3_4 = (int)((long)(-949113909 + var2_3) ^ -5407336689881828516L ^ -5407336689881828516L);
                    Integer.rotateLeft(120786349 ^ var2_3, 3) - -477346002;
                    (int)(-4214907936703190193L ^ (long)var2_3 ^ -5021369436058671406L);
                    var3_4 = -1046083181 + var2_3;
                    var4_2 -= 3;
                    continue block25;
                }
                case 1861829986: {
                    Integer.rotateRight(-1701912350 ^ var2_3, 6) + -1146430823;
                    var3_4 = -1496317556 + var2_3 + 2060797608 - 2060797608;
                    (Integer.rotateRight(-1552041985 ^ var2_3, 7) - -795416804) * -1552041985;
                    var3_4 = Integer.reverse(Integer.reverse(-1046083181 + var2_3));
                    var4_2 += 3;
                    continue block25;
                }
                case 1483879953: {
                    Integer.rotateRight(-2025497854 ^ var2_3, 3) + 1707320441;
                    var3_4 = -1046083181 + var2_3 + -22680340 - -22680340;
                    (Integer.rotateLeft(572319836 ^ var2_3, 7) - 635290207) * 572319837;
                    var4_2 += 5;
                    continue block25;
                }
                case 417409618: {
                    Integer.rotateLeft(1312575845 ^ var2_3, 12) - 2108390006;
                    (int)(-8318430707616257201L ^ (long)var2_3 ^ 270360126101697740L);
                    try {
                        if ((5929496456258686501L ^ (long)var2_3 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var3_4 = (int)((long)(-1046083181 + var2_3) ^ 2629560147729093569L ^ 2629560147729093569L);
                    }
                    catch (UnsupportedOperationException v4) {
                        var3_4 = -1046083181 + var2_3;
                    }
                    var4_2 -= 3;
                    continue block25;
                }
                case -38208778: {
                    Integer.rotateLeft(-1779304147 ^ var2_3, 5) - 749390766;
                    (int)(6287965231638702927L ^ (long)var2_3 ^ 6003442451744359255L);
                    var3_4 = (int)((long)(31283641 + var2_3) ^ -7951406381704009661L ^ -7951406381704009661L);
                    (Integer.rotateLeft(-1070295976 ^ var2_3, 11) + 1253807587) * -1070295975;
                    var3_4 = -1046083181 + var2_3;
                    continue block25;
                }
                case -484262254: {
                    (Integer.rotateLeft(-661663848 ^ var2_3, 14) + 1036501667) * -661663847;
                    var3_4 = 1949305233 + var2_3;
                    Integer.rotateRight(1652826082 ^ var2_3, 15) + -228754535;
                    (int)(-6609268590914579151L ^ (long)var2_3 ^ -5834687695585745569L);
                    var3_4 = (int)((long)(-1046083181 + var2_3) ^ -2664421375316614339L ^ -2664421375316614339L);
                    var4_2 -= 2;
                    continue block25;
                }
                case 577871298: {
                    (Integer.rotateRight(1909522335 ^ var2_3, 17) - -861105284) * 1909522335;
                    var3_4 = -729425002 + var2_3;
                    Integer.rotateRight(-760391065 ^ var2_3, 13) - -2024042060;
                    var3_4 = -1046083181 + var2_3;
                    var4_2 -= 2;
                    continue block25;
                }
lbl166:
                // 1 sources

                Integer.rotateLeft(1076673192 ^ var2_3, 11) + -909624941;
                var3_4 = (int)((long)(-1569199777 + var2_3) ^ -6078439149666154123L ^ -6078439149666154123L);
                Integer.rotateLeft(844544576 ^ var2_3, 9) + 484322555;
                var3_4 = -1046083181 + var2_3;
                var4_2 += 5;
                continue block25;
                default: {
                    Integer.rotateRight(1822027951 ^ var2_3, 16) - 721536108;
                    var3_4 = Integer.reverse(Integer.reverse(-1046083181 + var2_3));
                    continue block25;
                }
                case -2113205250: 
            }
            break;
        }
        Integer.rotateLeft(-220454463 ^ var2_3, 17) + 1829090714;
        (int)(3489885074421508943L ^ (long)var2_3 ^ -2123303075845649140L);
    }

    public float tskh_4() {
        block0: {
            int n = bkhj.hkf(1907699538);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xBEFC98B5;
            if ((n2 ^ n) == -1090742091) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xCF49B7E7 ^ n, 12) - 508224564;
        }
        return this.twth;
    }

    public float stha() {
        block0: {
            int n = 197041433;
            n = Integer.rotateLeft(n * -862509885, 14) ^ 0xF00ACAEE;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x6DE3CD49;
            if ((n2 ^ n) == 1843645769) break block0;
            int cfr_ignored_0 = (0x665D5050 ^ n) - -1615985722;
        }
        return this.bsz_3;
    }

    public float ztgh_2() {
        block0: {
            int n = -1033939735;
            n = Integer.rotateLeft(n * -1090612727, 3) ^ 0xEFA62673;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 5);
            int n2 = n ^ 0x187185C;
            if ((n2 ^ n) == 25630812) break block0;
            int cfr_ignored_0 = (0xC3D84CB5 ^ n) + -1037068543;
        }
        return this.dsl;
    }

    public float dst_8() {
        block0: {
            int n = bkhj.hkf(-101765721);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x92B99A19;
            if ((n2 ^ n) == -1833330151) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x6B56B7BE ^ n, 16) - 0x3DDDF3D) * 1800845247;
        }
        return this.thtr_2;
    }

    public void zsm_3(boolean bl) {
        int n = bkhj.hkf(-152483369);
        int n2 = n ^ 0x41627106;
        if ((n2 ^ n) != 1096970502) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xB78B38D1 ^ n, 9) + 1043955850) * -1215612719;
            int cfr_ignored_1 = (int)(0x753996EC27D4EB4FL ^ (long)n ^ 0xD0A8831A2DB947A2L);
        }
        this.tkr = bl;
    }

    public boolean bdht() {
        block0: {
            int n = 135173604;
            int n2 = (n = Integer.rotateLeft(n * -1928654937, 19) ^ 0x9728262) ^ 0xDDBF8B3F;
            if ((n2 ^ n) == -574649537) break block0;
            int cfr_ignored_0 = (0xD5B11EDB ^ n) + -2021837344;
        }
        return this.tkr;
    }

    private static int bsk(int n, int n2) {
        block0: {
            int n3 = -35784386;
            int n4 = (n3 = Integer.rotateLeft(n3 * -1450497367, 9) ^ 0xC98A7515) ^ 0xEE397EB4;
            if ((n4 ^ n3) == -298221900) break block0;
            int cfr_ignored_0 = (0x13E4878A ^ n3) - -1669390437;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float hsy_2(float f, float f2) {
        block0: {
            int n = bkhj.hkf(484718664);
            int n2 = n ^ 0xF108842B;
            if ((n2 ^ n) == -251100117) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xEDECBC63 ^ n, 16) + -737644744;
        }
        return Math.max(f, f2);
    }

    private static boolean bja_2(float f) {
        block0: {
            int n = 1556929056;
            int n2 = (n = Integer.rotateLeft(n * 1832018669, 7) ^ 0xCFA861AF) ^ 0x45BE125E;
            if ((n2 ^ n) == 1170084446) break block0;
            int cfr_ignored_0 = (0x1972C87E ^ n) - 788558837;
        }
        return Float.isInfinite(f);
    }

    private static String[] thhz_4(String string) {
        int n = bkhj.hkf(567062995);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x9E1A5CF7;
        if ((n2 ^ n) != -1642439433) {
            int cfr_ignored_0 = Integer.rotateLeft(0xBFD6ED24 ^ n, 10) - 1063540375;
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

    private static CallSite stk_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -438986726;
            n3 = Integer.rotateLeft(n3 * -1885755051, 17) ^ 0xD7E209AD;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 19);
            n3 = n ^ n3;
            int n4 = n3 ^ 0xA2E86F08;
            if ((n4 ^ n3) != -1561825528) {
                int cfr_ignored_0 = (0x473DF712 ^ n3) - -402453789;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ddq_2 ^ string.hashCode() ^ n2 + jkhd ^ i * 657161165 ^ ddq_2, 15) ^ jkhd));
            }
            String[] stringArray = bqdh.thhz_4(new String(cArray));
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

    private static String[] gub2d9kvc2wa(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite z2x7mwa4n9sr4f(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ l0h3c5fgg ^ string.hashCode()) + (n2 + cxzwylzz2otg6) + i ^ l0h3c5fgg, 22) + cxzwylzz2otg6);
            }
            String[] stringArray = bqdh.gub2d9kvc2wa(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

