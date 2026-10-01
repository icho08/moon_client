/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_2394
 *  net.minecraft.class_2586
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2394;
import net.minecraft.class_2586;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bla_2;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Optimization", category=bzw.OTHER, desc="Reduces expensive client rendering work")
public class ttm
extends bnq {
    private final badh_2 shjsh = new badh_2(this, "Disable Particles").bts(false);
    private final badh_2 kr = new badh_2(this, "Particl".concat("e Budget")).bts(true);
    private final tay shda_2 = new tay((hy)this, "Particles Per Tick", this::khja).shth_7(Float.intBitsToFloat(-580697836 + 1679605484)).dhbs_2(Float.intBitsToFloat(0xB3D61F0 ^ 0x4FBD61F0)).rkh_3(Float.intBitsToFloat(Integer.reverse(-298678878) ^ 0x4214C77)).ssd_5(Float.intBitsToFloat(-1817577621 - 1344927595));
    private final badh_2 zsd_2 = new badh_2(this, "Disable Block Entities").bts(false);
    private final badh_2 thtj_2 = new badh_2(this, "Block Entity Distance").bts(true);
    private final tay szh_4 = new tay((hy)this, "Block En".concat("tity Range"), this::rfn).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x59B73C4B ^ 0x59B7385B, 20))).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x21AB1587 ^ 0x21AB1DE7, 19))).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x786EAA4A ^ 0x7A6AAA4A, 5))).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xED43E7B6 ^ 0xED42EDB6, 14)));
    private final badh_2 hsk_2 = new badh_2(this, "Entity D".concat("istance")).bts(false);
    private final tay stf_3 = new tay((hy)this, "Entity Range", this::str_3).shth_7(Float.intBitsToFloat(0x837CA8BA ^ 0xC2FCA8BA)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x7EAABA9B ^ 0xFEAABAD8, 24))).rkh_3(Float.intBitsToFloat(-1896875726 - 1307572530)).ssd_5(Float.intBitsToFloat(Integer.reverse(844512169) ^ 0xD6DC6A4C));
    private final badh_2 jzsh = new badh_2(this, "Cull Invisibl".concat("e Entities")).bts(false);
    private final badh_2 zwl = new badh_2(this, "Disable Weather").bts(false);
    private final badh_2 thf_2 = new badh_2(this, "Disable ".concat("Clouds")).bts(false);
    private final badh_2 sls_2 = new badh_2(this, "Disable E".concat("nchant Glint")).bts(false);
    private final badh_2 shzz_4 = new badh_2(this, "Disable Nausea").bts(true);
    private int rtd_2;
    private static ttm hny;
    private final bql<btt> khdh_4 = this::dyd_2;
    private static final int dfa_2 = 11398020;
    private static final int shghj = 948421357;
    private static final int hwd_2 = 438931448;
    private static final int jdn = 1756512858;
    private static final int t42wmdrt03o = 807587452;
    private static final int sotsm3b09 = 741934312;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int mpnmwazkbmln;

    public ttm() {
        hny = this;
    }

    public static ttm zkhh_3() {
        block0: {
            int n = 1703957098;
            int n2 = (n = Integer.rotateLeft(n * 990854495, 21) ^ 0xE8384AEA) ^ 0xDABF6161;
            if ((n2 ^ n) == -624991903) break block0;
            int cfr_ignored_0 = (0xBF2F330B ^ n) + -184295383;
        }
        return hny;
    }

    /*
     * Unable to fully structure code
     */
    public boolean sshk(class_2394 var1_1) {
        var2_2 = false;
        var5_3 = 0;
        var3_4 = bla_2.ws(642063236);
        var3_4 = System.identityHashCode(this) ^ var3_4;
        var4_5 = -1784188395 + var3_4;
        block42: while (true) {
            block54: {
                block53: {
                    if ((var5_3 = var4_5 - var3_4) == 1005035437) ** GOTO lbl169
                    if (var5_3 == 1006663515) break block53;
                    if (var5_3 == 494459023) ** GOTO lbl266
                    if (var5_3 == 1261271149) ** GOTO lbl283
                    if (var5_3 == -1677221384) ** GOTO lbl298
                    break block54;
                }
                (Integer.rotateLeft(294572572 ^ var3_4, 5) - 615059615) * 294572573;
                if (!this.kr.shzl()) {
                    var4_5 = 295558180 + var3_4 ^ -255292936 ^ -255292936;
                    (Integer.rotateLeft(-530444547 ^ var3_4, 15) - 809332702) * -530444547;
                    (int)(2508681739607796559L ^ (long)var3_4 ^ -4832218251708995472L);
                    var5_3 -= 5;
                    continue;
                }
                var4_5 = -1073467366 + var3_4;
                (Integer.rotateLeft(-1103689540 ^ var3_4, 10) - 218607103) * -1103689539;
                var4_5 = 1316332425 + var3_4;
                continue;
            }
            switch (var5_3) {
                case 1006566359: {
                    (Integer.rotateLeft(-1501762823 ^ var3_4, 7) + 763237218) * -1501762823;
                    (int)(7263818858267732815L ^ (long)var3_4 ^ 8428630851083396173L);
                    if (!this.kr.shzl()) {
                        (int)(5288130608405460027L ^ (long)var3_4 ^ -8000007628693356777L);
                        var4_5 = 295558180 + var3_4 ^ -2106282000 ^ -2106282000;
                        var5_3 += 4;
                        continue block42;
                    }
                    try {
                        var5_3 -= 4;
                        if ((5120006172769459301L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var4_5 = 1316332425 + var3_4 ^ 57298460 ^ 57298460;
                    }
                    catch (IllegalArgumentException v0) {
                        var4_5 = 1316332425 + var3_4 + -367045117 - -367045117;
                    }
                    var5_3 -= 3;
                    continue block42;
                }
                case -1784188395: {
                    bla_2.smt_3(-1729728384, var3_4);
                    (int)(491183976913468437L ^ (long)var3_4 ^ -1224361005555015565L);
                    if (this.rgha_2()) {
                        (int)(-8431421567751654603L ^ (long)var3_4 ^ -2814149970137139158L);
                        var4_5 = Integer.reverse(Integer.reverse(-546460383 + var3_4));
                        (int)(-2553034884120902167L ^ (long)var3_4 ^ 7343573453686183154L);
                        var4_5 = -1021039606 + var3_4;
                        var5_3 += 2;
                        continue block42;
                    }
                    try {
                        var5_3 += 5;
                        var4_5 = (int)((long)(1517805126 + var3_4) ^ -8995867339182988994L ^ -8995867339182988994L);
                    }
                    catch (ArithmeticException v1) {
                        var4_5 = Integer.reverse(Integer.reverse(1517805126 + var3_4));
                    }
                    var5_3 -= 5;
                    continue block42;
                }
                case -1021039606: {
                    (Integer.rotateLeft(1063769881 ^ var3_4, 10) + -1309627582) * 1063769881;
                    (int)(-156085415880365233L ^ (long)var3_4 ^ 1096770657724159611L);
                    if (!this.shjsh.shzl()) {
                        var4_5 = Integer.reverse(Integer.reverse(1006663515 + var3_4));
                        Integer.rotateLeft(-646516991 ^ var3_4, 14) + 1506054234;
                        (int)(2000795861081451343L ^ (long)var3_4 ^ 9153710391090059865L);
                        --var5_3;
                        continue block42;
                    }
                    var4_5 = Integer.reverse(Integer.reverse(-2110637805 + var3_4));
                    continue block42;
                }
                case 1517805126: {
                    Integer.rotateRight(-312628318 ^ var3_4, 16) + -1028298791;
                    var2_2 = true;
                    try {
                        var5_3 += 2;
                        var4_5 = Integer.reverse(Integer.reverse(787559012 + var3_4));
                    }
                    catch (IllegalStateException v2) {
                        var4_5 = 787559012 + var3_4 + -1417920388 - -1417920388;
                    }
                    continue block42;
                }
                case -1656448692: {
                    (Integer.rotateLeft(-1275689667 ^ var3_4, 9) - -818429538) * -1275689667;
                    (int)(8161695704370441039L ^ (long)var3_4 ^ -6093226147372773543L);
                    var2_2 = false;
                    var4_5 = Integer.reverse(Integer.reverse(787559012 + var3_4));
                    Integer.rotateRight(-822973201 ^ var3_4, 12) - 330879020;
                    var5_3 -= 2;
                    continue block42;
                }
                case 295558180: {
                    Integer.rotateLeft(-1462202520 ^ var3_4, 8) + 1989606611;
                    var2_2 = true;
                    try {
                        var5_3 -= 3;
                        var4_5 = 787559012 + var3_4;
                    }
                    catch (IllegalStateException v3) {
                        var4_5 = 787559012 + var3_4 ^ -1298645132 ^ -1298645132;
                    }
                    var5_3 += 5;
                    continue block42;
                }
                case -1460098399: {
                    Integer.rotateLeft(-1693408600 ^ var3_4, 6) + -882814573;
                    ++this.rtd_2;
                    var2_2 = true;
                    try {
                        var4_5 = 787559012 + var3_4 + 333118956 - 333118956;
                    }
                    catch (IllegalArgumentException v4) {
                        var4_5 = 787559012 + var3_4;
                    }
                    var5_3 += 3;
                    continue block42;
                }
                case 1316332425: {
                    (Integer.rotateLeft(-1494441571 ^ var3_4, 7) - 990196030) * -1494441571;
                    (int)(7232235232141044559L ^ (long)var3_4 ^ -2148072873796213395L);
                    if (this.rtd_2 < ttm.sab_3(this.shda_2.hkj())) {
                        var4_5 = -2031158601 + var3_4 + -536375875 - -536375875;
                        Integer.rotateRight(1213685411 ^ var3_4, 12) + -957213448;
                        var4_5 = Integer.reverse(Integer.reverse(-1460098399 + var3_4));
                        var5_3 -= 2;
                        continue block42;
                    }
                    try {
                        var5_3 -= 5;
                        if ((6406949449428858277L ^ (long)var3_4 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var4_5 = -1656448692 + var3_4 ^ 906482954 ^ 906482954;
                    }
                    catch (UnsupportedOperationException v5) {
                        var4_5 = -1656448692 + var3_4 + 1538831094 - 1538831094;
                    }
                    var5_3 -= 3;
                    continue block42;
                }
                case -2110637805: {
                    (Integer.rotateRight(-1277361962 ^ var3_4, 9) - -870270683) * -1277361961;
                    var2_2 = false;
                    var4_5 = 986026190 + var3_4;
                    Integer.rotateLeft(-160124723 ^ var3_4, 17) - -595654642;
                    (int)(3802760952170212175L ^ (long)var3_4 ^ -4571009473321515939L);
                    var4_5 = (int)((long)(787559012 + var3_4) ^ -2434204039257042058L ^ -2434204039257042058L);
                    ++var5_3;
                    continue block42;
                }
lbl169:
                // 1 sources

                Integer.rotateLeft(-496404411 ^ var3_4, 15) - 1864576918;
                (int)(2367721840666012495L ^ (long)var3_4 ^ 5872838062550674534L);
                var4_5 = (int)((long)(-2055780301 + var3_4) ^ 4747671784677768339L ^ 4747671784677768339L);
                bla_2.smt_3(-930578336, var3_4);
                (int)(6250989520352345109L ^ (long)var3_4 ^ 1063467605149155502L);
                (int)(8556014245448837433L ^ (long)var3_4 ^ -2427705309610557269L);
                var4_5 = -1784188395 + var3_4 ^ -1179517784 ^ -1179517784;
                var5_3 += 4;
                continue block42;
                case -1918338344: {
                    (Integer.rotateRight(1476608094 ^ var3_4, 14) - -1396544867) * 1476608095;
                    try {
                        var4_5 = Integer.reverse(Integer.reverse(-1784188395 + var3_4));
                    }
                    catch (IllegalArgumentException v6) {
                        var4_5 = -1784188395 + var3_4 ^ -1671962658 ^ -1671962658;
                    }
                    continue block42;
                }
                case 698523174: {
                    Integer.rotateRight(669689354 ^ var3_4, 7) + -641222031;
                    var4_5 = Integer.reverse(Integer.reverse(1480699714 + var3_4));
                    Integer.rotateLeft(-640235028 ^ var3_4, 14) - 1700795087;
                    var4_5 = Integer.reverse(Integer.reverse(1637394843 + var3_4));
                    Integer.rotateRight(818419267 ^ var3_4, 9) + -325562024;
                    var4_5 = Integer.reverse(Integer.reverse(-1784188395 + var3_4));
                    var5_3 -= 3;
                    continue block42;
                }
                case -453825051: {
                    Integer.rotateLeft(-2044781460 ^ var3_4, 3) - 1109528655;
                    var4_5 = 2040191185 + var3_4 ^ 2066160945 ^ 2066160945;
                    (Integer.rotateLeft(-1081651951 ^ var3_4, 10) + 901772362) * -1081651951;
                    (int)(9022367207292988239L ^ (long)var3_4 ^ 4262801195765684154L);
                    try {
                        --var5_3;
                        if ((7513673543592919921L ^ (long)var3_4 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var4_5 = -1784188395 + var3_4 ^ 503031785 ^ 503031785;
                    }
                    catch (NoSuchElementException v7) {
                        var4_5 = (int)((long)(-1784188395 + var3_4) ^ 5843200080448257978L ^ 5843200080448257978L);
                    }
                    var5_3 -= 5;
                    continue block42;
                }
                case -1576025743: {
                    (Integer.rotateLeft(2067311573 ^ var3_4, 18) - -264606202) * 2067311573;
                    (int)(-5077239135247996081L ^ (long)var3_4 ^ -675395795646095675L);
                    var4_5 = (int)((long)(-1784188395 + var3_4) ^ 8885352008317030201L ^ 8885352008317030201L);
                    continue block42;
                }
                case 1018769880: {
                    (Integer.rotateRight(-1313948362 ^ var3_4, 9) - -2004449083) * -1313948361;
                    var4_5 = (int)((long)(-1033605281 + var3_4) ^ 6117353333714708528L ^ 6117353333714708528L);
                    (Integer.rotateLeft(-1662921516 ^ var3_4, 6) - 62285031) * -1662921515;
                    try {
                        var5_3 -= 3;
                        if ((2599974985863325789L ^ (long)var3_4 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var4_5 = -1784188395 + var3_4 + 1920089081 - 1920089081;
                    }
                    catch (ArithmeticException v8) {
                        var4_5 = -1784188395 + var3_4 ^ 1577698436 ^ 1577698436;
                    }
                    continue block42;
                }
                case 1064421002: {
                    Integer.rotateRight(1044110443 ^ var3_4, 10) + -1919070160;
                    var4_5 = 1355613789 + var3_4 ^ -587065912 ^ -587065912;
                    (Integer.rotateRight(222498359 ^ var3_4, 4) - -1619240988) * 222498359;
                    var4_5 = Integer.reverse(Integer.reverse(-1784188395 + var3_4));
                    ++var5_3;
                    continue block42;
                }
                case -153189863: {
                    Integer.rotateLeft(667211757 ^ var3_4, 7) - -718027538;
                    (int)(-1912207056843773105L ^ (long)var3_4 ^ 1067497260146255677L);
                    var4_5 = (int)((long)(-1634202593 + var3_4) ^ -9059629094232637034L ^ -9059629094232637034L);
                    (Integer.rotateLeft(-1507849932 ^ var3_4, 7) - 574536839) * -1507849931;
                    (int)(2552625616796149583L ^ (long)var3_4 ^ -8970475741565555960L);
                    var4_5 = -1784188395 + var3_4 + 804669802 - 804669802;
                    var5_3 -= 3;
                    continue block42;
                }
lbl266:
                // 1 sources

                (Integer.rotateRight(1084282899 ^ var3_4, 11) + -673724024) * 1084282899;
                (int)(-657616469809813130L ^ (long)var3_4 ^ -6346467256833523602L);
                var4_5 = Integer.reverse(Integer.reverse(713764214 + var3_4));
                (int)(-8315715955326962256L ^ (long)var3_4 ^ -5351516797285255968L);
                var4_5 = -1784188395 + var3_4 + -154681727 - -154681727;
                continue block42;
                case 771719398: {
                    (Integer.rotateRight(1895995447 ^ var3_4, 17) - -1280438812) * 1895995447;
                    var4_5 = 97527063 + var3_4 + 1140394681 - 1140394681;
                    (Integer.rotateLeft(-828589828 ^ var3_4, 12) - 156763583) * -828589827;
                    var4_5 = -1784188395 + var3_4 + -923101753 - -923101753;
                    continue block42;
                }
lbl283:
                // 1 sources

                (Integer.rotateLeft(891661397 ^ var3_4, 9) - 1944944006) * 891661397;
                (int)(-606012978489922737L ^ (long)var3_4 ^ -459223013532351745L);
                var4_5 = 896576717 + var3_4 ^ -1902651600 ^ -1902651600;
                Integer.rotateRight(66385519 ^ var3_4, 3) - 2131195564;
                var4_5 = Integer.reverse(Integer.reverse(754665788 + var3_4));
                (Integer.rotateLeft(1240698417 ^ var3_4, 12) + -119810262) * 1240698417;
                (int)(-8412407392371414193L ^ (long)var3_4 ^ -4798441254503793837L);
                var4_5 = -1784188395 + var3_4 ^ -147436865 ^ -147436865;
                var5_3 += 3;
                continue block42;
lbl298:
                // 1 sources

                (Integer.rotateRight(1822308378 ^ var3_4, 16) + 730229345) * 1822308379;
                try {
                    var5_3 -= 4;
                    if ((-2960532269488801467L ^ (long)var3_4 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    var4_5 = (int)((long)(-1784188395 + var3_4) ^ 4081566023916859534L ^ 4081566023916859534L);
                }
                catch (NoSuchElementException v9) {
                    var4_5 = Integer.reverse(Integer.reverse(-1784188395 + var3_4));
                }
                var5_3 += 2;
                continue block42;
                case -1613136617: {
                    Integer.rotateLeft(-753300891 ^ var3_4, 13) - -1804246666;
                    (int)(1273151280706284367L ^ (long)var3_4 ^ -5350132208856625529L);
                    var4_5 = (int)((long)(1470592253 + var3_4) ^ -2128935940437421551L ^ -2128935940437421551L);
                    (Integer.rotateRight(2044015322 ^ var3_4, 18) + -986789983) * 2044015323;
                    (int)(3764245122817942145L ^ (long)var3_4 ^ 7822029818163479979L);
                    var4_5 = -1793993305 + var3_4 ^ 621513499 ^ 621513499;
                    (int)(-6907678258758686773L ^ (long)var3_4 ^ 216589824322235796L);
                    var4_5 = (int)((long)(-1784188395 + var3_4) ^ 4799709016480357877L ^ 4799709016480357877L);
                    continue block42;
                }
                case 1813674969: {
                    (Integer.rotateLeft(-736532652 ^ var3_4, 13) - -1284431257) * -736532651;
                    var4_5 = 129373998 + var3_4 ^ 503598415 ^ 503598415;
                    Integer.rotateLeft(187277960 ^ var3_4, 4) + 1583893939;
                    var4_5 = -1784188395 + var3_4;
                    Integer.rotateLeft(100226724 ^ var3_4, 3) - -1114694377;
                    --var5_3;
                    continue block42;
                }
                case 787559012: {
                    return var2_2;
                }
            }
            (Integer.rotateLeft(-1536211856 ^ var3_4, 7) + -304682805) * -1536211855;
            var4_5 = -1784188395 + var3_4;
        }
    }

    public boolean dhtn_2(class_2586 class_25862) {
        if (!this.rgha_2() || class_25862 == null) {
            return true;
        }
        if (this.zsd_2.shzl()) {
            return false;
        }
        if (!this.thtj_2.shzl() || ttm.mc.field_1724 == null) {
            return true;
        }
        double d = this.szh_4.hkj();
        return ttm.mc.field_1724.method_5707(class_25862.method_11016().method_46558()) <= d * d;
    }

    public boolean ghjz(class_1297 class_12972) {
        if (!this.rgha_2() || class_12972 == null || class_12972 == ttm.mc.field_1724 || class_12972 instanceof class_1657) {
            return true;
        }
        if (this.jzsh.shzl() && class_12972.method_5767()) {
            return false;
        }
        if (!this.hsk_2.shzl() || ttm.mc.field_1724 == null) {
            return true;
        }
        double d = this.stf_3.hkj();
        return ttm.mc.field_1724.method_5858(class_12972) <= d * d;
    }

    public boolean dzb_3() {
        int n = 1347055868;
        n = Integer.rotateLeft(n * 540416045, 27) ^ 0xDE09FD41;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
        int n2 = n ^ 0x2AE3926;
        if ((n2 ^ n) != 44972326) {
            int cfr_ignored_0 = (0x52E449DA ^ n) + 1372738533;
        }
        return this.rgha_2() && this.sls_2.shzl();
    }

    public boolean sddh_2() {
        int n = bla_2.ws(1601651988);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x6B077DD7;
        if ((n2 ^ n) != 1795653079) {
            int cfr_ignored_0 = Integer.rotateRight(0x347038C3 ^ n, 9) + 1576304344;
        }
        return this.rgha_2() && this.shjsh.shzl();
    }

    public boolean ths_7() {
        int n = -1818133427;
        n = Integer.rotateLeft(n * 1775851755, 6) ^ 0x7BB2CE35;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 29);
        int n2 = n ^ 0x271958C4;
        if ((n2 ^ n) != 655972548) {
            int cfr_ignored_0 = (0xB4B82489 ^ n) + 369938626;
        }
        return this.rgha_2() && this.shzz_4.shzl();
    }

    public boolean ans_2() {
        int n = -585711279;
        n = Integer.rotateLeft(n * 1707479485, 14) ^ 0x9E233851;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 26);
        int n2 = n ^ 0x1B46B240;
        if ((n2 ^ n) != 457617984) {
            int cfr_ignored_0 = (0xC6507311 ^ n) + 277341634;
        }
        return ttm.sas_4(this) && this.zwl.shzl();
    }

    public boolean tmz_3() {
        int n = -1879789532;
        n = Integer.rotateLeft(n * 1547982503, 9) ^ 0x653D430A;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x8855DF58;
        if ((n2 ^ n) != -2007638184) {
            int cfr_ignored_0 = (0x7A16F7C ^ n) - 1164984114;
        }
        return this.rgha_2() && this.thf_2.shzl();
    }

    private void dyd_2(btt btt2) {
        int n = -1615868135;
        n = Integer.rotateLeft(n * -1070309523, 9) ^ 0x1060BE09;
        btt btt3 = btt2;
        n = (btt3 != null ? System.identityHashCode(btt3) : 0) ^ n;
        int n2 = n ^ 0xCF7432D6;
        if ((n2 ^ n) != -814468394) {
            int cfr_ignored_0 = (0x50DBFDCF ^ n) + 885589515;
        }
        this.rtd_2 = 0;
    }

    private boolean str_3() {
        int n = 1306999643;
        n = Integer.rotateLeft(n * -2066444847, 27) ^ 0x19623F70;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x1E406359;
        if ((n2 ^ n) != 507536217) {
            int cfr_ignored_0 = (0x53A75802 ^ n) + -1117280720;
        }
        return !this.hsk_2.shzl();
    }

    private boolean rfn() {
        try {
            int n = -1747263712;
            n = Integer.rotateLeft(n * 316214211, 6) ^ 0x363F481B;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xDD2B217D;
            if ((n2 ^ n) != -584375939) {
                int cfr_ignored_0 = (0x4AF1FE5D ^ n) + 1860393184;
            }
            if ((0x317 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.thtj_2.shzl() || this.zsd_2.shzl();
    }

    private boolean khja() {
        int n;
        block1: {
            int n2 = bla_2.ws(-426803824);
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 14);
            int n3 = n2 ^ 0x1F6DE985;
            if ((n3 ^ n2) != 527296901) {
                int cfr_ignored_0 = (Integer.rotateLeft(0xF9E29415 ^ n2, 18) - 1187876294) * -102591467;
                int cfr_ignored_1 = (int)(0x3B503A2827D4EB4FL ^ (long)n2 ^ 0x8920831A2DB9DB71L);
            }
            n = !this.kr.shzl() || this.shjsh.shzl() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0xAD5;
        }
        return n != 0;
    }

    private static String sdr_2(String string, int n, int n2, int n3) {
        int n4 = -1809039946;
        n4 = Integer.rotateLeft(n4 * 808807261, 21) ^ 0x2D8F4389;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = n ^ n4) ^ 0x5968227F;
        if ((n5 ^ n4) != 1499996799) {
            int cfr_ignored_0 = (0xCD441FC9 ^ n4) + -2144922899;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0xF7DE0BD0) + n2 ^ i * -381242823) ^ dfa_2) + shghj);
        }
        return new String(cArray);
    }

    private static int sab_3(float f) {
        block0: {
            int n = bla_2.ws(-1807271913);
            int n2 = n ^ 0xFFA178A1;
            if ((n2 ^ n) == -6195039) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x6BE640B6 ^ n, 16) - 356480325) * 1810251959;
        }
        return Math.round(f);
    }

    private static boolean sas_4(ttm ttm2) {
        block0: {
            int n = bla_2.ws(1768671099);
            int n2 = n ^ 0x3FEDEB5F;
            if ((n2 ^ n) == 1072556895) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x56862C24 ^ n, 13) - 2124216215;
        }
        return ttm2.rgha_2();
    }

    private static String[] hhl_2(String string) {
        int n = bla_2.ws(-785433318);
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 14);
        int n2 = n ^ 0xDC6299AD;
        if ((n2 ^ n) != -597517907) {
            int cfr_ignored_0 = (Integer.rotateRight(0xD4DA4B7 ^ n, 4) - -1597730460) * 223192247;
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

    private static CallSite zh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1797947202;
            n3 = Integer.rotateLeft(n3 * 1642651073, 16) ^ 0x8D042AFF;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 23);
            int n4 = n3 ^ 0xDFA5436F;
            if ((n4 ^ n3) != -542817425) {
                int cfr_ignored_0 = (0x4B70C3D1 ^ n3) + 542074158;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ hwd_2 ^ string.hashCode() ^ n2 + jdn + i * -710891117) + hwd_2) ^ jdn));
            }
            String[] stringArray = ttm.hhl_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType3) : lookup.findVirtual(clazz, stringArray[1], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] lo4t5778v587v(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite qcvs57emf(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ t42wmdrt03o ^ string.hashCode() ^ n2 + sotsm3b09 ^ i * 979152587 ^ t42wmdrt03o, 15) ^ sotsm3b09));
            }
            String[] stringArray = ttm.lo4t5778v587v(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

