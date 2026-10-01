/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_241
 *  net.minecraft.class_2596
 *  net.minecraft.class_2708
 *  net.minecraft.class_2828
 *  net.minecraft.class_3532
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_241;
import net.minecraft.class_2596;
import net.minecraft.class_2708;
import net.minecraft.class_2828;
import net.minecraft.class_3532;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.bad_2;
import us.m0vy.moondlc.m0vyguard.baf;
import us.m0vy.moondlc.m0vyguard.bda;
import us.m0vy.moondlc.m0vyguard.btj_2;
import us.m0vy.moondlc.m0vyguard.bghr;
import us.m0vy.moondlc.m0vyguard.bghh_2;
import us.m0vy.moondlc.m0vyguard.bky;
import us.m0vy.moondlc.m0vyguard.bwk;
import us.m0vy.moondlc.m0vyguard.taj;
import us.m0vy.moondlc.m0vyguard.tbs_2;
import us.m0vy.moondlc.m0vyguard.tts_2;
import us.m0vy.moondlc.m0vyguard.tha;
import us.m0vy.moondlc.m0vyguard.tkhk;
import us.m0vy.moondlc.m0vyguard.tdhj;
import us.m0vy.moondlc.m0vyguard.tsa;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.dhd_6;
import us.m0vy.moondlc.m0vyguard.zth_3;
import us.m0vy.moondlc.m0vyguard.ss_2;
import us.m0vy.moondlc.m0vyguard.ghd_2;
import us.m0vy.moondlc.m0vyguard.lq;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.mixin.accessors.EntityAccessor;

public class kq
implements dl {
    private static final kq thaf;
    private bwk shya;
    private final tts_2 dhkt = new tts_2();
    private taj jqn;
    private taj lt;
    private taj jhh_4 = taj.dlq;
    private static final int ssm = -1240350334;
    private static final int khna = 748787529;
    private static final int a8b74kjkv = 1264234307;
    private static final int ode80ggmkj = -427735403;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int gairon90x8bk;

    public void dhzs_4() {
        int n = -198947496;
        int n2 = (n = Integer.rotateLeft(n * -1734232475, 4) ^ 0x68229C32) ^ 0x84A2292D;
        if ((n2 ^ n) != -2069747411) {
            int cfr_ignored_0 = (0x70866475 ^ n) - 575561509;
        }
        kq.hlt_2(bghh_2.ha_4(), new lq(this::dnt_3));
        zth_3.dzgh_3().jkhh_2(new lq(this::tsha));
        kq.dhbh_2().jkhh_2(new lq(kq::hyf));
        kq.dhhh_3(tha.thf_3(), new lq(this::shdht));
    }

    private void dqa_3(taj taj2) {
        int n = -734391161;
        n = Integer.rotateLeft(n * 1449275669, 3) ^ 0x7A64735B;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 25);
        taj taj3 = taj2;
        n = (taj3 != null ? System.identityHashCode(taj3) : 0) ^ n;
        int n2 = n ^ 0x3DB8EEC6;
        if ((n2 ^ n) != 1035529926) {
            int cfr_ignored_0 = (0xE982FA41 ^ n) + -955921869;
        }
        this.lt = taj2 == null ? (this.jqn != null ? this.jqn : (kq.mc.field_1724 != null ? new taj(kq.mc.field_1724.method_36454(), kq.tls(kq.mc.field_1724)) : taj.dlq)) : this.jqn;
        this.jqn = taj2;
    }

    public taj hls_2() {
        try {
            int n = 1742998452;
            n = Integer.rotateLeft(n * -2079870187, 10) ^ 0x34F2003B;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 27);
            int n2 = n ^ 0x339DE5CF;
            if ((n2 ^ n) != 865985999) {
                int cfr_ignored_0 = (0x5479EE7B ^ n) + -204213947;
            }
            if ((0x100 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            kq.khwz();
            throw null;
        }
        if (kq.mc.field_1724 == null) {
            return taj.dlq;
        }
        return this.jqn != null ? this.jqn : tkhk.dghh_4(kq.dha_7(kq.mc.field_1724));
    }

    public taj ghrn() {
        int n = -1959750848;
        int n2 = (n = Integer.rotateLeft(n * -329208655, 16) ^ 0xE4CEA2E0) ^ 0x8AEFCBAA;
        if ((n2 ^ n) != -1963996246) {
            int cfr_ignored_0 = (0x1DF58EA ^ n) - -967091200;
        }
        if (kq.mc.field_1724 == null) {
            return taj.dlq;
        }
        return this.lt != null ? this.lt : tkhk.dghh_4(kq.mc.field_1724.method_5802());
    }

    public bwk jwj() {
        int n = bghr.ztt_5(-156712503);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 29);
        int n2 = n ^ 0x9D0627F2;
        if ((n2 ^ n) != -1660540942) {
            int cfr_ignored_0 = (Integer.rotateRight(0x6BAEE63B ^ n, 16) + 244023392) * 1806624315;
        }
        return this.dhkt.rghf() != null ? (bwk)kq.dkh(this.dhkt) : this.shya;
    }

    public void hshgh(tdhj tdhj2, class_1309 class_13092, ss_2 ss2, bda bda2, Object object) {
        int n = bghr.ztt_5(-1490537797);
        tdhj tdhj3 = tdhj2;
        n = (tdhj3 != null ? System.identityHashCode(tdhj3) : 0) ^ n;
        class_1309 class_13093 = class_13092;
        n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
        int n2 = n ^ 0x3E3C99A3;
        if ((n2 ^ n) != 1044158883) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x9914AB18 ^ n, 6) + -1914808541) * -1726698727;
        }
        this.khbth(ss2.shml(kq.thzr(tdhj2), tdhj2.vec(), (class_1297)class_13092, object), bda2, object);
    }

    public void hja(taj taj2, ss_2 ss2, bda bda2, Object object) {
        int n = bghr.ztt_5(1600438408);
        ss_2 ss3 = ss2;
        n = Integer.rotateRight((ss3 != null ? System.identityHashCode(ss3) : 0) ^ n, 13);
        bda bda3 = bda2;
        n = Integer.rotateLeft((bda3 != null ? System.identityHashCode((Object)bda3) : 0) ^ n, 6);
        int n2 = n ^ 0xFAF59C4;
        if ((n2 ^ n) != 263150020) {
            int cfr_ignored_0 = Integer.rotateLeft(0x50CB994C ^ n, 13) - -855298193;
        }
        kq.sbt_3(this, ss2.khmj(taj2, object), bda2, object);
    }

    private void khbth(bwk bwk2, bda bda2, Object object) {
        int n = 0;
        int n2 = 1368138793;
        n2 = Integer.rotateLeft(n2 * 407302421, 23) ^ 0x2FCC4A65;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 24);
        bwk bwk3 = bwk2;
        n2 = (bwk3 != null ? System.identityHashCode(bwk3) : 0) ^ n2;
        int n3 = n2 - 1136093422;
        block34: while (true) {
            switch (n2 - n3) {
                case -976465492: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0xAE5937D5 ^ n2, 8) - 556491270) * -1369884715;
                    int cfr_ignored_1 = (int)(0x6CEB99E827D4EB4FL ^ (long)n2 ^ 0xCEA0831A2DB97406L);
                    throw null;
                }
                case 1136093422: {
                    int cfr_ignored_2 = Integer.rotateRight(0xD645D7CA ^ n2, 13) + -153960271;
                    if (!kq.znh_2()) {
                        try {
                            n += 2;
                            if ((0x30B3517017BCCBC3L ^ (long)n2 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n3 = n2 - -1029819114;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n3 = n2 - -1029819114 + -1716778164 - -1716778164;
                        }
                        continue block34;
                    }
                    try {
                        n -= 2;
                        if ((0xD1794F09D7B4673FL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = n2 - -976465492;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 - -976465492;
                    }
                    n += 2;
                    continue block34;
                }
                case -1029819114: {
                    int cfr_ignored_3 = Integer.rotateLeft(0x83EA7A09 ^ n2, 3) + -37591470;
                    int cfr_ignored_4 = (int)(0x4158D43427D4EB4FL ^ (long)n2 ^ 0x5518831A2DB92F60L);
                    this.dhkt.zww(new bad_2(bwk2.alb(), bda2.getPriority(), object, bwk2));
                    return;
                }
                case 1866275500: {
                    int cfr_ignored_5 = Integer.rotateRight(0x129F5AAF ^ n2, 5) - 1168743020;
                    n3 = n2 - -1943747997 + 2110712240 - 2110712240;
                    int cfr_ignored_6 = (Integer.rotateRight(0xC0134F2 ^ n2, 4) + 2021853321) * 201405683;
                    int cfr_ignored_7 = (int)(0xBA7263D7F6C387C9L ^ (long)n2 ^ 0x3ADF2134F4B4D935L);
                    n3 = n2 - 1136093422 + 1585360142 - 1585360142;
                    n -= 5;
                    continue block34;
                }
                case -293004574: {
                    int cfr_ignored_8 = (Integer.rotateRight(0x20D817FA ^ n2, 7) + -24607103) * 551032827;
                    n3 = Integer.reverse(Integer.reverse(n2 - 1477744909));
                    int cfr_ignored_9 = (Integer.rotateLeft(0xF7420C18 ^ n2, 17) + -178448861) * -146666471;
                    try {
                        n += 3;
                        if ((0xD9CFF1B6020D68A7L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = n2 - 1136093422 ^ 0xDD664767 ^ 0xDD664767;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 - 1136093422;
                    }
                    ++n;
                    continue block34;
                }
                case -1255052995: {
                    int cfr_ignored_10 = Integer.rotateRight(0xE1817F6F ^ n2, 15) - 1393298860;
                    try {
                        if ((0xC81EDEDFEB781101L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 - 1136093422));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 - 1136093422 + -972323629 - -972323629;
                    }
                    n += 5;
                    continue block34;
                }
                case -1180956800: {
                    int cfr_ignored_11 = Integer.rotateRight(0x34F7B5C6 ^ n2, 9) - 1851564597;
                    try {
                        n -= 4;
                        n3 = n2 - 1136093422 ^ 0xF06BA016 ^ 0xF06BA016;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - 1136093422));
                    }
                    continue block34;
                }
                case 648910191: {
                    int cfr_ignored_12 = (Integer.rotateRight(0x54F1907B ^ n2, 13) + 1302208032) * 1425117307;
                    n3 = n2 - -529640468;
                    int cfr_ignored_13 = Integer.rotateLeft(0x4A99908D ^ n2, 12) - 217456718;
                    int cfr_ignored_14 = (int)(0x882B3EB027D4EB4FL ^ (long)n2 ^ 0x8010831A2DB8BD87L);
                    try {
                        n -= 4;
                        if ((0x2CF59716C90AF331L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = n2 - 1136093422 + 1509177057 - 1509177057;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - 1136093422));
                    }
                    continue block34;
                }
                case 446193313: {
                    int cfr_ignored_15 = (Integer.rotateRight(0x216E0756 ^ n2, 7) - 280003237) * 560858967;
                    try {
                        n += 5;
                        if ((0xABF083950F0AF4F1L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = n2 - 1136093422 ^ 0x9B683295 ^ 0x9B683295;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 - 1136093422 + 1396823144 - 1396823144;
                    }
                    ++n;
                    continue block34;
                }
                case 34824640: {
                    int cfr_ignored_16 = Integer.rotateLeft(0x2C92C280 ^ n2, 8) + 1780690107;
                    n3 = n2 - -1446197583;
                    int cfr_ignored_17 = Integer.rotateRight(0xC13CF66A ^ n2, 11) + 1790932497;
                    int cfr_ignored_18 = (int)(0xCBD32A651F02F253L ^ (long)n2 ^ 0xA9BAF2B61F803A77L);
                    n3 = n2 - 1136093422 ^ 0x772076B4 ^ 0x772076B4;
                    continue block34;
                }
                case 465078973: {
                    int cfr_ignored_19 = (Integer.rotateRight(0x6D29983A ^ n2, 16) + 1013386817) * 1831442491;
                    n3 = n2 - -1445155871 + -1587837284 - -1587837284;
                    int cfr_ignored_20 = (Integer.rotateLeft(0x64E3DBB4 ^ n2, 15) - 1005926919) * 1692654517;
                    try {
                        n -= 3;
                        if ((0x5002A083FBF8BDB7L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = n2 - 1136093422 + 1962594851 - 1962594851;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 - 1136093422;
                    }
                    continue block34;
                }
                case -1035995119: {
                    int cfr_ignored_21 = (Integer.rotateLeft(0x3FE97399 ^ n2, 10) + -1046307134) * 1072264089;
                    int cfr_ignored_22 = (int)(0xFD5BDDA427D4EB4FL ^ (long)n2 ^ 0x4638831A2DB85766L);
                    n3 = Integer.reverse(Integer.reverse(n2 - 1136093422));
                    int cfr_ignored_23 = (Integer.rotateLeft(0x23D0A90 ^ n2, 3) + 1237444267) * 37554833;
                    --n;
                    continue block34;
                }
                case -1380463003: {
                    int cfr_ignored_24 = Integer.rotateRight(0xE8E5E1CE ^ n2, 16) - 942929709;
                    try {
                        n -= 3;
                        if ((0xEC7320ECC0F7B8E9L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 - 1136093422));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)(n2 - 1136093422) ^ 0xD3F91F181CD2787CL ^ 0xD3F91F181CD2787CL);
                    }
                    --n;
                    continue block34;
                }
                case 663543209: {
                    int cfr_ignored_25 = (Integer.rotateRight(0x31072C33 ^ n2, 9) + -197396120) * 822553651;
                    n3 = n2 - -520774172 + 1539730107 - 1539730107;
                    int cfr_ignored_26 = Integer.rotateLeft(0x674EB4E9 ^ n2, 15) + -2031777934;
                    int cfr_ignored_27 = (int)(0xA5FC1AD427D4EB4FL ^ (long)n2 ^ 0xC8D8831A2DB8E629L);
                    int cfr_ignored_28 = (int)(0xB2852903C30AE3C3L ^ (long)n2 ^ 0xAF774AA63CA0C8DBL);
                    n3 = n2 - 1136093422 + 1731186819 - 1731186819;
                    n += 4;
                    continue block34;
                }
            }
            int cfr_ignored_29 = (Integer.rotateLeft(0xB18D150 ^ n2, 4) + 1549727723) * 186175825;
            n3 = Integer.reverse(Integer.reverse(n2 - 1136093422));
        }
    }

    public void aghq(Object object) {
        bwk bwk2;
        int n = -1774420729;
        n = Integer.rotateLeft(n * -497325891, 13) ^ 0x8581ECA4;
        Object object2 = object;
        n = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 11);
        int n2 = n ^ 0x84B393BD;
        if ((n2 ^ n) != -2068606019) {
            int cfr_ignored_0 = (0x128FEEBA ^ n) + -1348059177;
        }
        kq.aqa(this.dhkt, object);
        if (this.shya != null && kq.dhghz(this.shya) == object) {
            this.shya = null;
        }
        if ((bwk2 = (bwk)this.dhkt.rghf()) == null || kq.zdhj_2(bwk2) == object) {
            this.dqa_3(null);
        }
    }

    public void stk_3() {
        int n = 0;
        int n2 = 1411722819;
        n2 = Integer.rotateLeft(n2 * 891702665, 11) ^ 0x9195B939;
        int n3 = Integer.reverse(Integer.reverse(508580137 + n2));
        block17: while (true) {
            switch (n3 - n2) {
                case 1164155020: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x8839DB08 ^ n2, 4) + -2090916557;
                    return;
                }
                case 508580137: {
                    int cfr_ignored_1 = Integer.rotateRight(0x3B12E0CF ^ n2, 10) - 732354636;
                    if (kq.mc.field_1724 != null) {
                        int cfr_ignored_2 = (int)(0x13C469BC9E88C9A0L ^ (long)n2 ^ 0x2E09F1A268678A59L);
                        n3 = Integer.reverse(Integer.reverse(-1859147041 + n2));
                        n -= 4;
                        continue block17;
                    }
                    n3 = (int)((long)(1164155020 + n2) ^ 0x178F99F5ADBE27D4L ^ 0x178F99F5ADBE27D4L);
                    continue block17;
                }
                case -1859147041: {
                    int cfr_ignored_3 = Integer.rotateLeft(0x5F1A6B29 ^ n2, 14) + -2003789518;
                    int cfr_ignored_4 = (int)(0x9DA8C51427D4EB4FL ^ (long)n2 ^ 0x7758831A2DB89680L);
                    this.tnn_2(false);
                    return;
                }
                case -2126320721: {
                    int cfr_ignored_5 = Integer.rotateLeft(0x41B881C1 ^ n2, 11) + -105556582;
                    int cfr_ignored_6 = (int)(0x830A2FFC27D4EB4FL ^ (long)n2 ^ 0xA288831A2DB8ABC5L);
                    n3 = 508580137 + n2;
                    ++n;
                    continue block17;
                }
                case -1054308143: {
                    int cfr_ignored_7 = Integer.rotateLeft(0x13EC4C61 ^ n2, 5) + 1845157626;
                    int cfr_ignored_8 = (int)(0xD15EE25C27D4EB4FL ^ (long)n2 ^ 0x39C8831A2DB80F6CL);
                    n3 = -1925864580 + n2;
                    int cfr_ignored_9 = Integer.rotateLeft(0x1874A38C ^ n2, 6) - -92443345;
                    n3 = 508580137 + n2;
                    continue block17;
                }
                case 702722173: {
                    int cfr_ignored_10 = (Integer.rotateLeft(0x652B07D ^ n2, 3) - -933167522) * 106082429;
                    int cfr_ignored_11 = (int)(0xC4E01E4027D4EB4FL ^ (long)n2 ^ 0xC1F0831A2DB82411L);
                    n3 = 1979206257 + n2 ^ 0x90ECCCDC ^ 0x90ECCCDC;
                    int cfr_ignored_12 = Integer.rotateRight(0xFE5B1DEA ^ n2, 18) + -781828463;
                    n3 = 508580137 + n2 + -1607828810 - -1607828810;
                    n += 3;
                    continue block17;
                }
                case -1927847537: {
                    int cfr_ignored_13 = Integer.rotateRight(0xE7035D46 ^ n2, 15) - -37360971;
                    try {
                        n3 = 508580137 + n2 ^ 0x3A5874B ^ 0x3A5874B;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = 508580137 + n2;
                    }
                    continue block17;
                }
                case -145984668: {
                    int cfr_ignored_14 = (Integer.rotateLeft(0x5004F69D ^ n2, 13) - -1258849218) * 1342502557;
                    int cfr_ignored_15 = (int)(0x92B658A027D4EB4FL ^ (long)n2 ^ 0x4C30831A2DB888BDL);
                    n3 = 950235204 + n2;
                    int cfr_ignored_16 = Integer.rotateLeft(0x3088DD24 ^ n2, 9) - -454007145;
                    int cfr_ignored_17 = (int)(0x4A17D099F6FEFED4L ^ (long)n2 ^ 0x5C43214E068F39FEL);
                    n3 = -922306210 + n2 + -1016649475 - -1016649475;
                    int cfr_ignored_18 = (int)(0xC21650FA46626482L ^ (long)n2 ^ 0x5C844077322229FDL);
                    n3 = 508580137 + n2 + 1882539101 - 1882539101;
                    n += 3;
                    continue block17;
                }
                case -1886542733: {
                    int cfr_ignored_19 = Integer.rotateLeft(0x62274961 ^ n2, 15) + -417365510;
                    int cfr_ignored_20 = (int)(0xA095E75C27D4EB4FL ^ (long)n2 ^ 0x33C8831A2DB8ECFAL);
                    int cfr_ignored_21 = (int)(0xDE114BA1E05535AL ^ (long)n2 ^ 0xD404F0B95D93B613L);
                    n3 = (int)((long)(1424875031 + n2) ^ 0x743409A7EE9D6D36L ^ 0x743409A7EE9D6D36L);
                    int cfr_ignored_22 = (int)(0xF3FF70362C371BC9L ^ (long)n2 ^ 0x1D1C94DDCCB44A2FL);
                    n3 = Integer.reverse(Integer.reverse(508580137 + n2));
                    continue block17;
                }
                case 331776761: {
                    int cfr_ignored_23 = (Integer.rotateLeft(0x2FFACFB4 ^ n2, 8) - -742603257) * 804966325;
                    int cfr_ignored_24 = (int)(0x479C06D44DB1949DL ^ (long)n2 ^ 0xF0D857D0D21D22E9L);
                    n3 = 508580137 + n2 + -1378726765 - -1378726765;
                    n += 3;
                    continue block17;
                }
                case 779068082: {
                    int cfr_ignored_25 = Integer.rotateRight(0x33AE1023 ^ n2, 9) + 1181848440;
                    n3 = (int)((long)(-1742506170 + n2) ^ 0x3F3A0813279CFA4DL ^ 0x3F3A0813279CFA4DL);
                    int cfr_ignored_26 = Integer.rotateRight(0xE4E2930A ^ n2, 15) + -1144165007;
                    n3 = -468873298 + n2 ^ 0x674327D1 ^ 0x674327D1;
                    int cfr_ignored_27 = (Integer.rotateRight(0xE061C23F ^ n2, 15) - 808723676) * -530464193;
                    n3 = 508580137 + n2;
                    n += 3;
                    continue block17;
                }
                case 2036797038: {
                    int cfr_ignored_28 = (Integer.rotateRight(0xA446AD7B ^ n2, 7) + -387145440) * -1538871941;
                    n3 = 871144984 + n2;
                    int cfr_ignored_29 = (Integer.rotateLeft(0xE6F30E79 ^ n2, 15) + -70492190) * -420278663;
                    int cfr_ignored_30 = (int)(0x2441A04427D4EB4FL ^ (long)n2 ^ 0xBDF8831A2DB9E552L);
                    n3 = Integer.reverse(Integer.reverse(508580137 + n2));
                    continue block17;
                }
                case 56390236: {
                    int cfr_ignored_31 = (Integer.rotateRight(0x974C9BFA ^ n2, 5) + 1453621889) * -1756587013;
                    n3 = Integer.reverse(Integer.reverse(508580137 + n2));
                    int cfr_ignored_32 = Integer.rotateLeft(0x4EE9F284 ^ n2, 12) - -1833829065;
                    continue block17;
                }
            }
            int cfr_ignored_33 = Integer.rotateLeft(0x46B82F81 ^ n2, 11) + -1800708134;
            int cfr_ignored_34 = (int)(0x840A81BC27D4EB4FL ^ (long)n2 ^ 0xFE08831A2DB8A5C4L);
            n3 = 508580137 + n2 + -1828085272 - -1828085272;
        }
    }

    private void zfj() {
        this.tnn_2(true);
    }

    private void tnn_2(boolean bl) {
        double d;
        int n = 2141056202;
        n = Integer.rotateLeft(n * -1414361109, 17) ^ 0xD911CF93;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 2);
        int n2 = n ^ 0xDFA00CEA;
        if ((n2 ^ n) != -543159062) {
            int cfr_ignored_0 = (0xA03DE020 ^ n) + -1404827259;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        bwk bwk2 = this.jwj();
        if (bwk2 == null) {
            return;
        }
        taj taj2 = kq.khrs_2(kq.mc.field_1724.method_5802());
        bwk bwk3 = (bwk)this.dhkt.rghf();
        if (bwk3 == null && (d = kq.ghthl(this, this.jhh_4, taj2)) < (double)bwk2.ghts_2()) {
            if (this.jqn != null) {
                float f = baf.tssh_3();
                float f2 = kq.dbdh_2(kq.mc.field_1724) - this.jqn.dda_3();
                float f3 = kq.mc.field_1724.method_36455() - this.jqn.shyq();
                long l = kq.tdd_6(f2 / f);
                long l2 = Math.round(f3 / f);
                kq.mc.field_1724.method_36456(this.jqn.dda_3() + (float)l * f);
                kq.mc.field_1724.method_36457(kq.shthh_2(this.jqn) + (float)l2 * f);
            }
            this.dqa_3(null);
            this.shya = null;
            return;
        }
        taj taj3 = kq.khnt(kq.zthh_3(bwk2, this.jqn != null ? this.jqn : taj2, bwk3 == null));
        this.dqa_3(taj3);
        if (bwk2.hmkh()) {
            kq.mc.field_1724.method_36456(taj3.dda_3());
            kq.mc.field_1724.method_36457(taj3.shyq());
        }
        this.shya = bwk2;
        if (bl) {
            kq.ddr_2(this.dhkt, 1);
        }
    }

    private double drt_3(taj taj2, taj taj3) {
        block0: {
            int n = 459366406;
            n = Integer.rotateLeft(n * 2099202913, 15) ^ 0x3B9309F9;
            n = System.identityHashCode(this) ^ n;
            taj taj4 = taj2;
            n = Integer.rotateRight((taj4 != null ? System.identityHashCode(taj4) : 0) ^ n, 22);
            int n2 = n ^ 0xA431DC3D;
            if ((n2 ^ n) == -1540236227) break block0;
            int cfr_ignored_0 = (0xBF50BC3B ^ n) - -893261548;
        }
        return Math.hypot(class_3532.method_15379((float)this.tqn(kq.zrk_2(taj2), taj3.dda_3())), kq.rtl_2(this.tqn(taj2.shyq(), taj3.shyq())));
    }

    private float tqn(float f, float f2) {
        block0: {
            int n = -575920798;
            n = Integer.rotateLeft(n * 1618146423, 20) ^ 0x127E1784;
            n = System.identityHashCode(this) ^ n;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x69DFE31A;
            if ((n2 ^ n) == 1776280346) break block0;
            int cfr_ignored_0 = (0xB473C678 ^ n) - -1999328743;
        }
        return class_3532.method_15393((float)(f - f2));
    }

    @Generated
    public bwk zfh_3() {
        block0: {
            int n = -633953608;
            int n2 = (n = Integer.rotateLeft(n * -1547309417, 5) ^ 0xA741718B) ^ 0x2D1670F1;
            if ((n2 ^ n) == 756445425) break block0;
            int cfr_ignored_0 = (0xF720D249 ^ n) + -629897403;
        }
        return this.shya;
    }

    @Generated
    public tts_2 khaq_2() {
        block0: {
            int n = 1394505148;
            n = Integer.rotateLeft(n * -1167753481, 3) ^ 0x93937BCB;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x29B1FEBD;
            if ((n2 ^ n) == 699530941) break block0;
            int cfr_ignored_0 = (0x7AAF8B01 ^ n) - -855002982;
        }
        return this.dhkt;
    }

    @Generated
    public taj tthw() {
        block0: {
            int n = 454342442;
            n = Integer.rotateLeft(n * 175629539, 27) ^ 0x7B4B946B;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x6FB1FA93;
            if ((n2 ^ n) == 1873934995) break block0;
            int cfr_ignored_0 = (0x74A54DB9 ^ n) - 814712324;
        }
        return this.jqn;
    }

    @Generated
    public taj jty() {
        block0: {
            int n = bghr.ztt_5(-1760133099);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x35D073BD;
            if ((n2 ^ n) == 902853565) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xA2C6F3A8 ^ n, 7) + -1166729069;
        }
        return this.jhh_4;
    }

    @Generated
    public void sskh_4(bwk bwk2) {
        int n = bghr.ztt_5(-158226647);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x989A47AB;
        if ((n2 ^ n) != -1734719573) {
            int cfr_ignored_0 = Integer.rotateRight(0x6E0BE082 ^ n, 16) + 1473105657;
        }
        this.shya = bwk2;
    }

    @Generated
    public void zdth_4(taj taj2) {
        int n = bghr.ztt_5(48550711);
        int n2 = n ^ 0xD47E8379;
        if ((n2 ^ n) != -729906311) {
            int cfr_ignored_0 = Integer.rotateRight(0xD69A504E ^ n, 13) - 17651885;
        }
        this.jqn = taj2;
    }

    @Generated
    public void thdd_3(taj taj2) {
        int n = -195642678;
        int n2 = (n = Integer.rotateLeft(n * 850418687, 24) ^ 0xDE278247) ^ 0xE8379CD;
        if ((n2 ^ n) != 243497421) {
            int cfr_ignored_0 = (0xFAD5C307 ^ n) + -547475131;
        }
        this.lt = taj2;
    }

    @Generated
    public void thh_10(taj taj2) {
        int n = -905902198;
        n = Integer.rotateLeft(n * -1895912543, 11) ^ 0x28F4DBFE;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 29);
        taj taj3 = taj2;
        n = Integer.rotateRight((taj3 != null ? System.identityHashCode(taj3) : 0) ^ n, 7);
        int n2 = n ^ 0xCB034E4C;
        if ((n2 ^ n) != -888975796) {
            int cfr_ignored_0 = (0x10249C6 ^ n) - -1544516698;
        }
        this.jhh_4 = taj2;
    }

    @Generated
    public static kq thzt_2() {
        block0: {
            int n = -427738306;
            int n2 = (n = Integer.rotateLeft(n * -1785663159, 8) ^ 0xC44D5C46) ^ 0x53F35C82;
            if ((n2 ^ n) == 1408457858) break block0;
            int cfr_ignored_0 = (0xB57267BC ^ n) + 1206924049;
        }
        return thaf;
    }

    private void shdht(tha tha2) {
        int n = 0;
        int n2 = 1499210134;
        n2 = Integer.rotateLeft(n2 * 1846632745, 6) ^ 0x7F7E3C1E;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x6EB39027, 8) ^ 0x4145BC2E0EEF5C1CL ^ 0x4145BC2E0EEF5C1CL);
        block28: while (true) {
            switch (Integer.rotateRight(n3, 8) ^ n2) {
                case -1465886830: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x3EC20B20 ^ n2, 10) + -1646462949;
                    return;
                }
                case 646304825: {
                    int cfr_ignored_1 = (Integer.rotateLeft(0x7081A955 ^ n2, 17) - -1542381434) * 1887545685;
                    int cfr_ignored_2 = (int)(0xB233076827D4EB4FL ^ (long)n2 ^ 0xF3A0831A2DB8C9B7L);
                    this.zfj();
                    return;
                }
                case 1857261607: {
                    int cfr_ignored_3 = Integer.rotateRight(0xE0868F87 ^ n2, 15) - 883490964;
                    if (kq.mc.field_1724 != null) {
                        int cfr_ignored_4 = (int)(0x403398B10BBE4EEDL ^ (long)n2 ^ 0xCC12DBCF66FD2DB6L);
                        n3 = Integer.rotateLeft(n2 ^ 0x2685D439, 8);
                        n -= 5;
                        continue block28;
                    }
                    int cfr_ignored_5 = (int)(0x4FAF0C67867EE5EBL ^ (long)n2 ^ 0xE5BFC04E30F1328FL);
                    n3 = Integer.rotateLeft(n2 ^ 0xA8A05792, 8) ^ 0xB2246C44 ^ 0xB2246C44;
                    continue block28;
                }
                case 1868263573: {
                    int cfr_ignored_6 = Integer.rotateRight(0x9CAA30EA ^ n2, 6) + -50754671;
                    n3 = Integer.rotateLeft(n2 ^ 0x9F9DC451, 8) + 770934767 - 770934767;
                    int cfr_ignored_7 = Integer.rotateRight(0x9CCE894A ^ n2, 6) + 23084849;
                    int cfr_ignored_8 = (int)(0x6F8F5FB60C654A46L ^ (long)n2 ^ 0x421CD4796FAB72CFL);
                    n3 = Integer.rotateLeft(n2 ^ 0x9147F0E, 8);
                    int cfr_ignored_9 = (int)(0x1867B786FEB8D0C7L ^ (long)n2 ^ 0x927D31C25AA99D1EL);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x6EB39027, 8)));
                    ++n;
                    continue block28;
                }
                case 1447262596: {
                    int cfr_ignored_10 = Integer.rotateLeft(0x6BE51B0C ^ n2, 16) - 354149807;
                    n3 = Integer.rotateLeft(n2 ^ 0xE694D0F9, 8);
                    int cfr_ignored_11 = Integer.rotateLeft(0xE872A424 ^ n2, 16) - 708804503;
                    int cfr_ignored_12 = (int)(0x382344874D2A7C71L ^ (long)n2 ^ 0x747E56E703C5DD97L);
                    n3 = Integer.rotateLeft(n2 ^ 0x6EB39027, 8);
                    continue block28;
                }
                case 111070524: {
                    int cfr_ignored_13 = (Integer.rotateLeft(0x44F18491 ^ n2, 11) + 1570548938) * 1156678801;
                    int cfr_ignored_14 = (int)(0x86432AAC27D4EB4FL ^ (long)n2 ^ 0xA828831A2DB8A157L);
                    n3 = Integer.rotateLeft(n2 ^ 0x3EFA53AE, 8);
                    int cfr_ignored_15 = (Integer.rotateRight(0x74798F5A ^ n2, 17) + 521534241) * 1954123611;
                    try {
                        n -= 3;
                        if ((0xE48A8A77A99F07C5L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x6EB39027, 8) + 1589147424 - 1589147424;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x6EB39027, 8) ^ 0x920CAE5C ^ 0x920CAE5C;
                    }
                    n -= 4;
                    continue block28;
                }
                case 1101217433: {
                    int cfr_ignored_16 = Integer.rotateRight(0xBB4909C6 ^ n2, 10) - -1305096651;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x6EB39027, 8) ^ 0xCD44CEF280DF7CAFL ^ 0xCD44CEF280DF7CAFL);
                    int cfr_ignored_17 = (Integer.rotateLeft(0x679536B4 ^ n2, 15) - -1888534777) * 1737832117;
                    n -= 3;
                    continue block28;
                }
                case -1145927043: {
                    int cfr_ignored_18 = Integer.rotateRight(0x418373EE ^ n2, 11) - -213341939;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x9AC701E5, 8)));
                    int cfr_ignored_19 = Integer.rotateLeft(0xF0ADBEA5 ^ n2, 17) - 694662454;
                    int cfr_ignored_20 = (int)(0x321F109827D4EB4FL ^ (long)n2 ^ 0xDC40831A2DB9C9EFL);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x6EB39027, 8) ^ 0xA1D390BF3B850C19L ^ 0xA1D390BF3B850C19L);
                    int cfr_ignored_21 = (Integer.rotateRight(0x58773FF ^ n2, 3) - -1346065636) * 92763135;
                    continue block28;
                }
                case 1492961441: {
                    int cfr_ignored_22 = Integer.rotateRight(0x383B314B ^ n2, 10) + -746023088;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xA0988F74, 8)));
                    int cfr_ignored_23 = Integer.rotateRight(0x1D8B3D6A ^ n2, 6) + -1741025519;
                    try {
                        n -= 5;
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x6EB39027, 8)));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x6EB39027, 8) + 1570152436 - 1570152436;
                    }
                    n -= 4;
                    continue block28;
                }
                case 1229548579: {
                    int cfr_ignored_24 = (Integer.rotateLeft(0x59E0D371 ^ n2, 14) + -426296854) * 1507906417;
                    int cfr_ignored_25 = (int)(0x9B527D4C27D4EB4FL ^ (long)n2 ^ 0x7E8831A2DB89B75L);
                    try {
                        n += 2;
                        if ((0x82B49671B02D0F2DL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x6EB39027, 8);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x6EB39027, 8) ^ 0x7A87F7A1858420D1L ^ 0x7A87F7A1858420D1L);
                    }
                    n += 5;
                    continue block28;
                }
                case 1099951705: {
                    int cfr_ignored_26 = (Integer.rotateLeft(0x11474ED1 ^ n2, 5) + 469772938) * 289885905;
                    int cfr_ignored_27 = (int)(0xD3F5E0EC27D4EB4FL ^ (long)n2 ^ 0x3CA8831A2DB80A3AL);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x32AFCA4, 8) ^ 0x6D4DE49846CB11C2L ^ 0x6D4DE49846CB11C2L);
                    int cfr_ignored_28 = Integer.rotateRight(0x174EE60E ^ n2, 5) - -689210643;
                    try {
                        if ((0xBCF954E42B4C851L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x6EB39027, 8) + 1755754977 - 1755754977;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x6EB39027, 8) ^ 0xA53AEA15691A8F26L ^ 0xA53AEA15691A8F26L);
                    }
                    n += 2;
                    continue block28;
                }
                case -1527515009: {
                    int cfr_ignored_29 = Integer.rotateLeft(0x175C028C ^ n2, 5) - -662573521;
                    n3 = Integer.rotateLeft(n2 ^ 0x326F9263, 8) + 1574812415 - 1574812415;
                    int cfr_ignored_30 = Integer.rotateLeft(0x3B4F6F88 ^ n2, 10) + 855384243;
                    try {
                        ++n;
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x6EB39027, 8)));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x6EB39027, 8) ^ 0x3B322586753C2BB4L ^ 0x3B322586753C2BB4L);
                    }
                    ++n;
                    continue block28;
                }
                case 1494180163: {
                    int cfr_ignored_31 = (Integer.rotateRight(0x8409499E ^ n2, 3) - 25004381) * -2079766113;
                    try {
                        n -= 5;
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x6EB39027, 8)));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x6EB39027, 8) ^ 0xA0B8712EA45E4L ^ 0xA0B8712EA45E4L);
                    }
                    n -= 2;
                    continue block28;
                }
                case 693390350: {
                    int cfr_ignored_32 = (Integer.rotateLeft(0xB0DE427D ^ n2, 9) - 1866968158) * -1327611267;
                    int cfr_ignored_33 = (int)(0x726CEC4027D4EB4FL ^ (long)n2 ^ 0x25F0831A2DB94908L);
                    n3 = Integer.rotateLeft(n2 ^ 0x17453CEA, 8) ^ 0xFB00FF06 ^ 0xFB00FF06;
                    int cfr_ignored_34 = Integer.rotateRight(0xF0E5DC0F ^ n2, 17) - 808666380;
                    int cfr_ignored_35 = (int)(0xC012726A1A303C9BL ^ (long)n2 ^ 0x19A4F8D382102DF5L);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xF25BB25C, 8)));
                    int cfr_ignored_36 = (int)(0xD8BFAFE13F8AB8C8L ^ (long)n2 ^ 0xA2B2B3A68AB61CAEL);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x6EB39027, 8)));
                    n += 3;
                    continue block28;
                }
            }
            int cfr_ignored_37 = Integer.rotateRight(0x957E9843 ^ n2, 5) + 514985816;
            n3 = Integer.rotateLeft(n2 ^ 0x6EB39027, 8);
        }
    }

    private static void hyf(bky bky2) {
        block0: {
            int n = 322783631;
            int n2 = (n = Integer.rotateLeft(n * -988376007, 26) ^ 0xBAA8AC7C) ^ 0xCF3EF76D;
            if ((n2 ^ n) == -817957011) break block0;
            int cfr_ignored_0 = (0xDC03BEE2 ^ n) + 71298710;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void tsha(ghd_2 ghd2_2) {
        taj taj2;
        try {
            int n = -814371766;
            n = Integer.rotateLeft(n * 1403324303, 7) ^ 0x33A12044;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x336B8F77;
            if ((n2 ^ n) != 862687095) {
                int cfr_ignored_0 = (0xFC1E233D ^ n) - -1622739275;
            }
            if ((0x21F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (!ghd2_2.isSend()) return;
        class_2596 class_25962 = ghd2_2.packet();
        if (class_25962 instanceof class_2828) {
            class_2828 class_28282 = (class_2828)class_25962;
            if (!class_28282.method_36172()) return;
            taj2 = new taj(class_28282.method_12271(1.0f), class_28282.method_12270(1.0f));
        } else {
            class_25962 = ghd2_2.packet();
            if (!(class_25962 instanceof class_2708)) return;
            class_2708 class_27082 = (class_2708)class_25962;
            taj2 = new taj(class_27082.comp_3228().comp_3150(), class_27082.comp_3228().comp_3151());
        }
        if (zth_3.dzgh_3().tbdh_2()) return;
        this.jhh_4 = taj2;
    }

    private void dnt_3(dhd_6 dhd2_2) {
        int n = 0;
        int n2 = 1684802032;
        n2 = Integer.rotateLeft(n2 * -1503063909, 10) ^ 0x71311FFD;
        dhd_6 dhd3 = dhd2_2;
        n2 = Integer.rotateRight((dhd3 != null ? System.identityHashCode(dhd3) : 0) ^ n2, 8);
        int n3 = Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0) + 1954278977 - 1954278977;
        while (true) {
            block33: {
                block42: {
                    block53: {
                        block47: {
                            block55: {
                                block54: {
                                    block32: {
                                        block35: {
                                            block40: {
                                                block45: {
                                                    block52: {
                                                        block48: {
                                                            block31: {
                                                                block49: {
                                                                    block39: {
                                                                        block36: {
                                                                            block38: {
                                                                                block41: {
                                                                                    block46: {
                                                                                        block51: {
                                                                                            block34: {
                                                                                                block50: {
                                                                                                    block43: {
                                                                                                        block44: {
                                                                                                            block28: {
                                                                                                                block37: {
                                                                                                                    block29: {
                                                                                                                        block30: {
                                                                                                                            if ((n = Integer.reverse(n3) ^ n2 ^ 0xA588BAA0) > 495860655) break block28;
                                                                                                                            if (n > -1291387175) break block29;
                                                                                                                            if (n > -1985915263) break block30;
                                                                                                                            if (n == -2144083659) break block31;
                                                                                                                            if (n == -1985915263) break block32;
                                                                                                                            int cfr_ignored_0 = (Integer.rotateRight(0x10D8D0F2 ^ n2, 5) + 245296265) * 282644723;
                                                                                                                            break block33;
                                                                                                                        }
                                                                                                                        if (n == -1889653940) break block34;
                                                                                                                        if (n == -1441219121) break block35;
                                                                                                                        int cfr_ignored_1 = Integer.rotateLeft(0xAEA3CBE8 ^ n2, 8) + 708005971;
                                                                                                                        if (n == -1291387175) break block36;
                                                                                                                        break block33;
                                                                                                                    }
                                                                                                                    if (n > -1074241405) break block37;
                                                                                                                    if (n == -1185262618) break block38;
                                                                                                                    if (n == -1074241405) break block39;
                                                                                                                    break block33;
                                                                                                                }
                                                                                                                if (n == -179011099) break block40;
                                                                                                                if (n == 201815415) break block41;
                                                                                                                if (n == 495860655) break block42;
                                                                                                                break block33;
                                                                                                            }
                                                                                                            if (n > 1071954327) break block43;
                                                                                                            if (n > 626814894) break block44;
                                                                                                            if (n == 543871608) break block45;
                                                                                                            if (n == 626814894) break block46;
                                                                                                            break block33;
                                                                                                        }
                                                                                                        if (n == 874628037) break block47;
                                                                                                        if (n == 1023798992) break block48;
                                                                                                        if (n == 1071954327) break block49;
                                                                                                        break block33;
                                                                                                    }
                                                                                                    if (n > 1489232323) break block50;
                                                                                                    if (n == 1311692490) break block51;
                                                                                                    if (n == 1489232323) break block52;
                                                                                                    break block33;
                                                                                                }
                                                                                                if (n == 1685832687) break block53;
                                                                                                if (n == 1932974467) break block54;
                                                                                                int cfr_ignored_2 = (Integer.rotateRight(0xF6DA413A ^ n2, 17) + -389315263) * -153468613;
                                                                                                if (n == 2057016319) break block55;
                                                                                                break block33;
                                                                                            }
                                                                                            int cfr_ignored_3 = Integer.rotateLeft(0x9BBEFF25 ^ n2, 6) - -528579402;
                                                                                            int cfr_ignored_4 = (int)(0x590C511827D4EB4FL ^ (long)n2 ^ 0x5F40831A2DB91FC9L);
                                                                                            if (this.jwj() != null) {
                                                                                                n3 = Integer.reverse(n2 ^ 0x4E2ED6CA ^ 0xA588BAA0) + -1542421107 - -1542421107;
                                                                                                --n;
                                                                                                continue;
                                                                                            }
                                                                                            try {
                                                                                                n += 4;
                                                                                                if ((0xE93DDA268CB6DF13L ^ (long)n2 | 1L) == 0L) {
                                                                                                    throw new ArithmeticException();
                                                                                                }
                                                                                                n3 = Integer.reverse(n2 ^ 0xBFF86083 ^ 0xA588BAA0);
                                                                                            }
                                                                                            catch (ArithmeticException arithmeticException) {
                                                                                                n3 = Integer.reverse(n2 ^ 0xBFF86083 ^ 0xA588BAA0) ^ 0xDCCB67CD ^ 0xDCCB67CD;
                                                                                            }
                                                                                            n += 5;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_5 = (Integer.rotateRight(0xA8B1A73F ^ n2, 8) - 1910562780) * -1464752321;
                                                                                        if (this.jwj().khbh()) {
                                                                                            n3 = Integer.reverse(n2 ^ 0x5C2B775B ^ 0xA588BAA0) + -2015801157 - -2015801157;
                                                                                            int cfr_ignored_6 = (Integer.rotateLeft(0x58185639 ^ n2, 14) + -1353707486) * 1477989945;
                                                                                            int cfr_ignored_7 = (int)(0x9AAAF80427D4EB4FL ^ (long)n2 ^ 0xD78831A2DB89884L);
                                                                                            n3 = Integer.reverse(n2 ^ 0xC077577 ^ 0xA588BAA0);
                                                                                            n -= 2;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_8 = (int)(0xF6B0CADE4D0B4D0BL ^ (long)n2 ^ 0x68CC56A5613040B0L);
                                                                                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xDBA7DC55 ^ 0xA588BAA0)));
                                                                                        int cfr_ignored_9 = (int)(0xDEE9BAFA25974DFAL ^ (long)n2 ^ 0x8884879D60D21002L);
                                                                                        n3 = Integer.reverse(n2 ^ 0xBFF86083 ^ 0xA588BAA0) + 1066310471 - 1066310471;
                                                                                        n -= 3;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_10 = (Integer.rotateLeft(0xD9BBE531 ^ n2, 14) + 1646157866) * -641997519;
                                                                                    int cfr_ignored_11 = (int)(0x1B094B0C27D4EB4FL ^ (long)n2 ^ 0x6B68831A2DB99BC3L);
                                                                                    if (btj_2.rsj_2 != null) {
                                                                                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xB95A53E6 ^ 0xA588BAA0)));
                                                                                        n += 2;
                                                                                        continue;
                                                                                    }
                                                                                    try {
                                                                                        n += 3;
                                                                                        if ((0x24EF2428A9221459L ^ (long)n2 | 1L) == 0L) {
                                                                                            throw new NoSuchElementException();
                                                                                        }
                                                                                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x8F5E2B4C ^ 0xA588BAA0)));
                                                                                    }
                                                                                    catch (NoSuchElementException noSuchElementException) {
                                                                                        n3 = (int)((long)Integer.reverse(n2 ^ 0x8F5E2B4C ^ 0xA588BAA0) ^ 0x9CC6F5B2CDC9BDC1L ^ 0x9CC6F5B2CDC9BDC1L);
                                                                                    }
                                                                                    n -= 2;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_12 = (Integer.rotateRight(0x139C417F ^ n2, 5) - 1682541980) * 329007487;
                                                                                dhd2_2.tdhdh_2(EntityAccessor.callMovementInputToVelocity(dhd2_2.rtq(), dhd2_2.thmy(), this.hls_2().dda_3()));
                                                                                n3 = Integer.reverse(n2 ^ 0xB306FED9 ^ 0xA588BAA0) ^ 0x238ECEC6 ^ 0x238ECEC6;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_13 = Integer.rotateRight(0xD2911F62 ^ n2, 13) + -2081395687;
                                                                            dhd2_2.tdhdh_2(EntityAccessor.callMovementInputToVelocity(dhd2_2.rtq(), dhd2_2.thmy(), btj_2.rsj_2.floatValue()));
                                                                            return;
                                                                        }
                                                                        int cfr_ignored_14 = (Integer.rotateRight(0xF2489B53 ^ n2, 17) + 1529376328) * -230122669;
                                                                        return;
                                                                    }
                                                                    int cfr_ignored_15 = Integer.rotateLeft(0x80DD18A8 ^ n2, 3) + -1625056365;
                                                                    return;
                                                                }
                                                                int cfr_ignored_16 = (Integer.rotateRight(0x85673EF6 ^ n2, 3) - 735985413) * -2056831241;
                                                                n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xBE3DB629 ^ 0xA588BAA0)));
                                                                int cfr_ignored_17 = Integer.rotateRight(0xA792EAAB ^ n2, 7) + 1328024048;
                                                                try {
                                                                    n += 5;
                                                                    n3 = Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0) ^ 0xFF6DC145 ^ 0xFF6DC145;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    n3 = Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0) ^ 0x18100A83 ^ 0x18100A83;
                                                                }
                                                                n += 2;
                                                                continue;
                                                            }
                                                            int cfr_ignored_18 = Integer.rotateLeft(0xE1716FEC ^ n2, 15) - 1360669903;
                                                            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x1A44D065 ^ 0xA588BAA0)));
                                                            int cfr_ignored_19 = (Integer.rotateRight(0xFFFA7956 ^ n2, 18) - 62017701) * -362153;
                                                            n3 = Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0);
                                                            n += 4;
                                                            continue;
                                                        }
                                                        int cfr_ignored_20 = Integer.rotateRight(0x535309C6 ^ n2, 13) - 460049973;
                                                        try {
                                                            n3 = Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0) + 355430128 - 355430128;
                                                        }
                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                            n3 = Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0) + -489588863 - -489588863;
                                                        }
                                                        continue;
                                                    }
                                                    int cfr_ignored_21 = Integer.rotateLeft(0xE474D989 ^ n2, 15) + -1367083310;
                                                    int cfr_ignored_22 = (int)(0x26C677B427D4EB4FL ^ (long)n2 ^ 0x1218831A2DB9E05DL);
                                                    try {
                                                        if ((0x5FBD492CD5AD3CBFL ^ (long)n2 | 1L) == 0L) {
                                                            throw new NoSuchElementException();
                                                        }
                                                        n3 = Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0) + 1561605680 - 1561605680;
                                                    }
                                                    catch (NoSuchElementException noSuchElementException) {
                                                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0)));
                                                    }
                                                    --n;
                                                    continue;
                                                }
                                                int cfr_ignored_23 = Integer.rotateLeft(0xE2F7D4A0 ^ n2, 15) + -2141167973;
                                                try {
                                                    n -= 5;
                                                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0)));
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    n3 = (int)((long)Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0) ^ 0x98091785F02F9735L ^ 0x98091785F02F9735L);
                                                }
                                                continue;
                                            }
                                            int cfr_ignored_24 = (Integer.rotateRight(0xCEA4F8D3 ^ n2, 12) + 173523144) * -828049197;
                                            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x60213C4D ^ 0xA588BAA0)));
                                            int cfr_ignored_25 = (Integer.rotateLeft(0x11FE8935 ^ n2, 5) - 842022054) * 301893941;
                                            int cfr_ignored_26 = (int)(0xD34C270827D4EB4FL ^ (long)n2 ^ 0xB360831A2DB80B49L);
                                            n3 = Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0);
                                            n += 5;
                                            continue;
                                        }
                                        int cfr_ignored_27 = (Integer.rotateRight(0x4757D77 ^ n2, 3) - -1902653276) * 74808695;
                                        try {
                                            if ((0x7B879F482F95250DL ^ (long)n2 | 1L) == 0L) {
                                                throw new UnsupportedOperationException();
                                            }
                                            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0)));
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            n3 = Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0) + -388802071 - -388802071;
                                        }
                                        continue;
                                    }
                                    int cfr_ignored_28 = (Integer.rotateLeft(0x4BC3FE5D ^ n2, 12) - 823749758) * 1271135837;
                                    int cfr_ignored_29 = (int)(0x8971506027D4EB4FL ^ (long)n2 ^ 0x5DB0831A2DB8BF33L);
                                    n3 = Integer.reverse(n2 ^ 0x8189BAA2 ^ 0xA588BAA0);
                                    int cfr_ignored_30 = (Integer.rotateLeft(0xD9924619 ^ n2, 14) + 1561599042) * -644725223;
                                    int cfr_ignored_31 = (int)(0x1B20E82427D4EB4FL ^ (long)n2 ^ 0x2D38831A2DB99B90L);
                                    try {
                                        n -= 2;
                                        if ((0xEB464D89EA614FE9L ^ (long)n2 | 1L) == 0L) {
                                            throw new IllegalStateException();
                                        }
                                        n3 = Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0);
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        n3 = Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0) ^ 0x28E71D16 ^ 0x28E71D16;
                                    }
                                    n -= 5;
                                    continue;
                                }
                                int cfr_ignored_32 = Integer.rotateRight(0x74122F26 ^ n2, 17) - 311514325;
                                n3 = Integer.reverse(n2 ^ 0x17876276 ^ 0xA588BAA0) + -560475143 - -560475143;
                                int cfr_ignored_33 = Integer.rotateRight(0xA9599502 ^ n2, 8) + -2043237767;
                                int cfr_ignored_34 = (int)(0x46338672672D67F3L ^ (long)n2 ^ 0xF19402E934C121B6L);
                                n3 = Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0) ^ 0x1B718743 ^ 0x1B718743;
                                n += 3;
                                continue;
                            }
                            int cfr_ignored_35 = (Integer.rotateLeft(0x9EFCCD9D ^ n2, 6) - 1157268798) * -1627599459;
                            int cfr_ignored_36 = (int)(0x5C4E63A027D4EB4FL ^ (long)n2 ^ 0x3A30831A2DB9154DL);
                            n3 = (int)((long)Integer.reverse(n2 ^ 0x39603844 ^ 0xA588BAA0) ^ 0x3D2ADA728046EFE5L ^ 0x3D2ADA728046EFE5L);
                            int cfr_ignored_37 = Integer.rotateLeft(0xA64829C5 ^ n2, 7) - 656059926;
                            int cfr_ignored_38 = (int)(0x64FA87F827D4EB4FL ^ (long)n2 ^ 0xF280831A2DB96424L);
                            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0)));
                            int cfr_ignored_39 = (Integer.rotateLeft(0xCF7EE6BC ^ n2, 12) - 616271871) * -813766979;
                            n -= 2;
                            continue;
                        }
                        int cfr_ignored_40 = Integer.rotateLeft(0xFCACAF0D ^ n2, 18) - -1656303154;
                        int cfr_ignored_41 = (int)(0x3E1E013027D4EB4FL ^ (long)n2 ^ 0xFF10831A2DB9D1EDL);
                        try {
                            n += 2;
                            if ((0x468F70092B896F75L ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0)));
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0)));
                        }
                        n += 4;
                        continue;
                    }
                    int cfr_ignored_42 = (Integer.rotateLeft(0x9730B075 ^ n2, 5) - 1396899174) * -1758416779;
                    int cfr_ignored_43 = (int)(0x55821E4827D4EB4FL ^ (long)n2 ^ 0xC1E0831A2DB906D5L);
                    n3 = Integer.reverse(n2 ^ 0x5CC1AF75 ^ 0xA588BAA0) + -1300411374 - -1300411374;
                    int cfr_ignored_44 = Integer.rotateLeft(0xF71C2DC5 ^ n2, 17) - -255383018;
                    int cfr_ignored_45 = (int)(0x35AE83F827D4EB4FL ^ (long)n2 ^ 0xFA80831A2DB9C68CL);
                    n3 = Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0);
                    n += 4;
                    continue;
                }
                int cfr_ignored_46 = (Integer.rotateRight(0x85DC9B5F ^ n2, 3) - 974417852) * -2049139873;
                n3 = Integer.reverse(n2 ^ 0xD3914D84 ^ 0xA588BAA0) ^ 0x51916247 ^ 0x51916247;
                int cfr_ignored_47 = (Integer.rotateRight(0x212F4A9E ^ n2, 7) - 152545373) * 556747423;
                n3 = Integer.reverse(n2 ^ 0x588CF024 ^ 0xA588BAA0) ^ 0xC969C260 ^ 0xC969C260;
                int cfr_ignored_48 = Integer.rotateRight(0xD2AAF9EF ^ n2, 13) - -2028870868;
                n3 = Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0);
                n += 5;
                continue;
            }
            int cfr_ignored_49 = Integer.rotateRight(0x64AD358B ^ n2, 15) + 894901008;
            n3 = (int)((long)Integer.reverse(n2 ^ 0x255C6FAE ^ 0xA588BAA0) ^ 0x223C127E82F47B52L ^ 0x223C127E82F47B52L);
        }
    }

    private static tbs_2 hlt_2(bghh_2 bghh2, lq lq2) {
        block0: {
            int n = bghr.ztt_5(105409911);
            bghh_2 bghh3 = bghh2;
            n = (bghh3 != null ? System.identityHashCode(bghh3) : 0) ^ n;
            lq lq3 = lq2;
            n = (lq3 != null ? System.identityHashCode(lq3) : 0) ^ n;
            int n2 = n ^ 0x4D146082;
            if ((n2 ^ n) == 1293181058) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x4B5C0DF5 ^ n, 12) - 612585446) * 1264324085;
            int cfr_ignored_1 = (int)(0x89EEA3C827D4EB4FL ^ (long)n ^ 0xBAE0831A2DB8BE0CL);
        }
        return bghh2.jkhh_2(lq2);
    }

    private static tsa dhbh_2() {
        block0: {
            int n = 1634354970;
            int n2 = (n = Integer.rotateLeft(n * 2069050639, 27) ^ 0xCD269D09) ^ 0xE6B14ABE;
            if ((n2 ^ n) == -424588610) break block0;
            int cfr_ignored_0 = (0x87DB0DA4 ^ n) + -2052429451;
        }
        return tsa.asa_3();
    }

    private static tbs_2 dhhh_3(tha tha2, lq lq2) {
        block0: {
            int n = bghr.ztt_5(639812525);
            int n2 = n ^ 0x53249B3C;
            if ((n2 ^ n) == 1394907964) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x75065891 ^ n, 17) + 807557322) * 1963350161;
            int cfr_ignored_1 = (int)(0xB7B4F6AC27D4EB4FL ^ (long)n ^ 0x1028831A2DB8C2B8L);
        }
        return tha2.jkhh_2(lq2);
    }

    private static float tls(class_746 class_7462) {
        block0: {
            int n = 1747564309;
            n = Integer.rotateLeft(n * 725969741, 25) ^ 0xF4D5BFB8;
            class_746 class_7463 = class_7462;
            n = Integer.rotateLeft((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 9);
            int n2 = n ^ 0x8769E0E6;
            if ((n2 ^ n) == -2023104282) break block0;
            int cfr_ignored_0 = (0xEF4057F3 ^ n) - 902880174;
        }
        return class_7462.method_36455();
    }

    private static void khwz() {
        int n = -1594899586;
        int n2 = (n = Integer.rotateLeft(n * 1755332463, 3) ^ 0xB1A43D47) ^ 0xFB35D125;
        if ((n2 ^ n) != -80359131) {
            int cfr_ignored_0 = (0x5BDA125B ^ n) - 1495511126;
        }
        yf.athz_2();
    }

    private static class_241 dha_7(class_746 class_7462) {
        block0: {
            int n = -706749299;
            n = Integer.rotateLeft(n * -679906977, 8) ^ 0x22CCCB19;
            class_746 class_7463 = class_7462;
            n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 7);
            int n2 = n ^ 0xF3241CE2;
            if ((n2 ^ n) == -215737118) break block0;
            int cfr_ignored_0 = (0x26FBC06F ^ n) + -2043529694;
        }
        return class_7462.method_5802();
    }

    private static Object dkh(tts_2 tts2_2) {
        block0: {
            int n = bghr.ztt_5(632373209);
            int n2 = n ^ 0x40749DD7;
            if ((n2 ^ n) == 1081384407) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x65C5A20E ^ n, 15) - 1464614637;
        }
        return tts2_2.rghf();
    }

    private static taj thzr(tdhj tdhj2) {
        block0: {
            int n = -2106105234;
            int n2 = (n = Integer.rotateLeft(n * 1290204705, 20) ^ 0x7BC76CD5) ^ 0x23B7518C;
            if ((n2 ^ n) == 599216524) break block0;
            int cfr_ignored_0 = (0xA1C033E2 ^ n) - -1387178395;
        }
        return tdhj2.rotation();
    }

    private static void sbt_3(kq kq2, bwk bwk2, bda bda2, Object object) {
        int n = 534889228;
        n = Integer.rotateLeft(n * 1925791115, 24) ^ 0xCB514201;
        kq kq3 = kq2;
        n = (kq3 != null ? System.identityHashCode(kq3) : 0) ^ n;
        bwk bwk3 = bwk2;
        n = (bwk3 != null ? System.identityHashCode(bwk3) : 0) ^ n;
        int n2 = n ^ 0x5845BDEE;
        if ((n2 ^ n) != 1480965614) {
            int cfr_ignored_0 = (0x47A47EE2 ^ n) + 2007458816;
        }
        kq2.khbth(bwk2, bda2, object);
    }

    private static boolean znh_2() {
        block0: {
            int n = bghr.ztt_5(-136660147);
            int n2 = n ^ 0x374066C1;
            if ((n2 ^ n) == 926967489) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xC09ADD8C ^ n, 11) - 1461613359;
        }
        return yf.dnkh();
    }

    private static void aqa(tts_2 tts2_2, Object object) {
        int n = -1058314630;
        n = Integer.rotateLeft(n * 1531367479, 18) ^ 0xDC871E62;
        Object object2 = object;
        n = (object2 != null ? System.identityHashCode(object2) : 0) ^ n;
        int n2 = n ^ 0xBBF6E95;
        if ((n2 ^ n) != 197095061) {
            int cfr_ignored_0 = (0xCB5408EF ^ n) + -830308988;
        }
        tts2_2.hsh_4(object);
    }

    private static Object dhghz(bwk bwk2) {
        block0: {
            int n = -1687459650;
            int n2 = (n = Integer.rotateLeft(n * -1574030153, 10) ^ 0x9031BBF3) ^ 0x23E78EFE;
            if ((n2 ^ n) == 602377982) break block0;
            int cfr_ignored_0 = (0xB88CE640 ^ n) - 2068553174;
        }
        return bwk2.blm();
    }

    private static Object zdhj_2(bwk bwk2) {
        block0: {
            int n = -1315166352;
            n = Integer.rotateLeft(n * -714408353, 7) ^ 0x9F99BE33;
            bwk bwk3 = bwk2;
            n = Integer.rotateRight((bwk3 != null ? System.identityHashCode(bwk3) : 0) ^ n, 27);
            int n2 = n ^ 0x7FD59B62;
            if ((n2 ^ n) == 2144705378) break block0;
            int cfr_ignored_0 = (0xCE49BC12 ^ n) + -888822316;
        }
        return bwk2.blm();
    }

    private static taj khrs_2(class_241 class_2412) {
        block0: {
            int n = -680462509;
            int n2 = (n = Integer.rotateLeft(n * 857218343, 12) ^ 0x92918887) ^ 0x39A3050;
            if ((n2 ^ n) == 60436560) break block0;
            int cfr_ignored_0 = (0xD4EAC703 ^ n) - 1624946107;
        }
        return tkhk.dghh_4(class_2412);
    }

    private static double ghthl(kq kq2, taj taj2, taj taj3) {
        block0: {
            int n = 1079661538;
            n = Integer.rotateLeft(n * -1465137553, 8) ^ 0xFD60508;
            kq kq3 = kq2;
            n = Integer.rotateRight((kq3 != null ? System.identityHashCode(kq3) : 0) ^ n, 7);
            taj taj4 = taj2;
            n = (taj4 != null ? System.identityHashCode(taj4) : 0) ^ n;
            int n2 = n ^ 0x7DA15282;
            if ((n2 ^ n) == 2107724418) break block0;
            int cfr_ignored_0 = (0x3DFB0160 ^ n) - 1826737229;
        }
        return kq2.drt_3(taj2, taj3);
    }

    private static float dbdh_2(class_746 class_7462) {
        block0: {
            int n = 171833411;
            n = Integer.rotateLeft(n * 937108529, 7) ^ 0xF5D353B5;
            class_746 class_7463 = class_7462;
            n = Integer.rotateLeft((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 17);
            int n2 = n ^ 0x9F6FE45E;
            if ((n2 ^ n) == -1620056994) break block0;
            int cfr_ignored_0 = (0x95521C1D ^ n) - -1941309160;
        }
        return class_7462.method_36454();
    }

    private static int tdd_6(float f) {
        block0: {
            int n = bghr.ztt_5(1625804984);
            int n2 = n ^ 0x907F4403;
            if ((n2 ^ n) == -1870707709) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xF09894BB ^ n, 17) + 651665888) * -258435909;
        }
        return Math.round(f);
    }

    private static float shthh_2(taj taj2) {
        block0: {
            int n = 1383603129;
            int n2 = (n = Integer.rotateLeft(n * -1293122409, 12) ^ 0x56A73A89) ^ 0xE2AA2125;
            if ((n2 ^ n) == -492166875) break block0;
            int cfr_ignored_0 = (0xB0D23A9C ^ n) - 1295762633;
        }
        return taj2.shyq();
    }

    private static taj zthh_3(bwk bwk2, taj taj2, boolean bl) {
        block0: {
            int n = 435896421;
            int n2 = (n = Integer.rotateLeft(n * 375026701, 8) ^ 0xACE95769) ^ 0xAD3A2477;
            if ((n2 ^ n) == -1388698505) break block0;
            int cfr_ignored_0 = (0xB4C16412 ^ n) + 1015138305;
        }
        return bwk2.khnr(taj2, bl);
    }

    private static taj khnt(taj taj2) {
        block0: {
            int n = -1038369905;
            n = Integer.rotateLeft(n * 913108327, 7) ^ 0x917B6AFC;
            taj taj3 = taj2;
            n = (taj3 != null ? System.identityHashCode(taj3) : 0) ^ n;
            int n2 = n ^ 0xFC2FAAB3;
            if ((n2 ^ n) == -63984973) break block0;
            int cfr_ignored_0 = (0x3E34113C ^ n) - 1008080529;
        }
        return taj2.jhm_2();
    }

    private static void ddr_2(tts_2 tts2_2, int n) {
        int n2 = bghr.ztt_5(-1926445908);
        int n3 = (n2 = n ^ n2) ^ 0x3DA0BCFA;
        if ((n3 ^ n2) != 1033944314) {
            int cfr_ignored_0 = (Integer.rotateRight(0xB08C7856 ^ n2, 9) - 1700802981) * -1332971433;
        }
        tts2_2.hhk_2(n);
    }

    private static float zrk_2(taj taj2) {
        block0: {
            int n = bghr.ztt_5(-284371170);
            int n2 = n ^ 0x3E7378CC;
            if ((n2 ^ n) == 1047754956) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xD17FAFD2 ^ n, 13) + 1658055081) * -780161069;
        }
        return taj2.dda_3();
    }

    private static float rtl_2(float f) {
        block0: {
            int n = -1132830717;
            int n2 = (n = Integer.rotateLeft(n * 1828859519, 3) ^ 0x28D6C04F) ^ 0x91529955;
            if ((n2 ^ n) == -1856857771) break block0;
            int cfr_ignored_0 = (0x2D28F956 ^ n) - 1527849257;
        }
        return class_3532.method_15379((float)f);
    }

    private static String[] zbd_2(String string) {
        block0: {
            int n = bghr.ztt_5(1323589576);
            int n2 = n ^ 0x20D0EE4;
            if ((n2 ^ n) == 34410212) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x4CE9512C ^ n, 12) - 1419670415;
        }
        return string.split("\u0004\u000f", -1);
    }

    private static CallSite zhf(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1515209935;
            n3 = Integer.rotateLeft(n3 * -1173812725, 10) ^ 0xFB67BF2E;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 7);
            int n4 = n3 ^ 0x55AE5E6B;
            if ((n4 ^ n3) != 1437490795) {
                int cfr_ignored_0 = (0xFFE1AA4 ^ n3) - 1898940198;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ssm ^ string.hashCode()) + (n2 + khna) + i ^ ssm, 6) + khna);
            }
            String[] stringArray = kq.zbd_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] r0dajeyscpo(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite axv6rd8o4cm(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ a8b74kjkv ^ string.hashCode()) + (n2 + ode80ggmkj) + i ^ a8b74kjkv, 8) + ode80ggmkj);
            }
            String[] stringArray = kq.r0dajeyscpo(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

