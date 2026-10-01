/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_2561
 *  net.minecraft.class_320
 *  net.minecraft.class_638
 *  org.jetbrains.annotations.Nullable
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.StreamSupport;
import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_2561;
import net.minecraft.class_320;
import net.minecraft.class_638;
import org.jetbrains.annotations.Nullable;
import us.m0vy.moondlc.m0vyguard.bzh_4;
import us.m0vy.moondlc.m0vyguard.byt;
import us.m0vy.moondlc.m0vyguard.bysh;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tr_2;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class tzk
implements tthy {
    @Nullable
    private class_1297 dhfz = null;
    private final List sgha = new ArrayList();
    private static final int nw = 1513881329;
    private static final int jssh_2 = 1231839401;
    private static final int hts_3 = -454670497;
    private static final int tdf = -1813086093;
    private static final int wv2gb589whq5n = 1680011762;
    private static final int iult1ahmb = -783771465;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int occo60wwqttvl5;

    public void sghth_2(byt byt2) {
        this.dhfz = this.jbj(byt2);
    }

    public void khmn(String string) {
        try {
            int n = -38447496;
            n = Integer.rotateLeft(n * 1883532197, 26) ^ 0x99B115B2;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xD7FA7E1E;
            if ((n2 ^ n) != -671449570) {
                int cfr_ignored_0 = (0x2A4F2866 ^ n) + -997460260;
            }
            if ((0x7F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            tzk.khy();
            throw null;
        }
        if (tzk.hkh(Moondlc.getInstance()).hkha_2().contains(string)) {
            bzh_4.dhght_2(class_2561.method_30163((String)tr_2.ttq_3("commands.target.".concat("friend_error"))));
        } else if (this.sgha.contains(string)) {
            bzh_4.dhght_2(class_2561.method_30163((String)tr_2.zza_3("commands.target.already_exists", string)));
        } else if (string.equalsIgnoreCase(tzk.ahdh(mc.method_1548()))) {
            bzh_4.dhght_2(tzk.zkhq_2(tr_2.ttq_3("commands.target.self_error")));
        } else {
            this.sgha.add(string);
            bzh_4.ttht_3(tzk.drj_2(tzk.saa_5(tzk.shwl("commands.", "target.added"), new Object[]{string})));
        }
    }

    /*
     * Unable to fully structure code
     */
    public void shwf(String var1_1) {
        var4_2 = 0;
        var2_3 = -1744171393;
        var2_3 = Integer.rotateLeft(var2_3 * 1670282345, 22) ^ 28613132;
        var2_3 = System.identityHashCode(this) ^ var2_3;
        var3_4 = var2_3 ^ -1480303542 ^ -212597179 ^ -212597179;
        block31: while (true) {
            if ((var4_2 = var3_4 ^ var2_3) == -1480303542) ** GOTO lbl41
            if (var4_2 == -953766116) ** GOTO lbl23
            (Integer.rotateRight(904387134 ^ var2_3, 9) - -1955525443) * 904387135;
            switch (var4_2) {
                case -1606946565: {
                    Integer.rotateLeft(-2014283735 ^ var2_3, 3) + 2054958130;
                    (int)(4990786719135886159L ^ (long)var2_3 ^ 5861579063482197844L);
                    bzh_4.dhght_2(tzk.slj_2(tzk.shat_4("commands.ta".concat("rget.not_found"), new Object[]{var1_1})));
                    var3_4 = var2_3 ^ -455174564 ^ 1756852949 ^ 1756852949;
                    (Integer.rotateRight(110704314 ^ var2_3, 3) + -789889087) * 110704315;
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -953766116));
                    continue block31;
                }
lbl23:
                // 1 sources

                (Integer.rotateLeft(414105968 ^ var2_3, 6) + 25627595) * 414105969;
                return;
                case 318695645: {
                    (Integer.rotateLeft(14945144 ^ var2_3, 3) + 536543939) * 14945145;
                    this.sgha.remove(var1_1);
                    bzh_4.ttht_3(class_2561.method_30163((String)tr_2.zza_3("commands.target.removed", new Object[]{var1_1})));
                    try {
                        if ((-3274860320220875025L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -953766116));
                    }
                    catch (IllegalArgumentException v0) {
                        var3_4 = (var2_3 ^ -953766116) + -1966565471 - -1966565471;
                    }
                    var4_2 -= 4;
                    continue block31;
                }
lbl41:
                // 1 sources

                (Integer.rotateRight(-1511920226 ^ var2_3, 7) - 448357725) * -1511920225;
                if (this.sgha.contains(var1_1)) {
                    try {
                        var4_2 -= 5;
                        var3_4 = (var2_3 ^ 318695645) + 513450446 - 513450446;
                    }
                    catch (UnsupportedOperationException v1) {
                        var3_4 = (int)((long)(var2_3 ^ 318695645) ^ -1669508779863486429L ^ -1669508779863486429L);
                    }
                    var4_2 -= 5;
                    continue block31;
                }
                var3_4 = (int)((long)(var2_3 ^ 1321282252) ^ -131923594166420507L ^ -131923594166420507L);
                Integer.rotateLeft(-626045464 ^ var2_3, 14) + 2140671571;
                var3_4 = (var2_3 ^ -1606946565) + -608093006 - -608093006;
                var4_2 += 3;
                continue block31;
                case 1128244522: {
                    (Integer.rotateRight(1457401471 ^ var2_3, 13) - -1991950180) * 1457401471;
                    var3_4 = (var2_3 ^ -1654491152) + -472415009 - -472415009;
                    (Integer.rotateLeft(-767307152 ^ var2_3, 13) + 2056526539) * -767307151;
                    try {
                        var4_2 -= 2;
                        if ((2494215561694443503L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var3_4 = var2_3 ^ -1480303542 ^ 451703977 ^ 451703977;
                    }
                    catch (IllegalStateException v2) {
                        var3_4 = var2_3 ^ -1480303542;
                    }
                    continue block31;
                }
                case 1836768159: {
                    Integer.rotateLeft(-221825083 ^ var2_3, 17) - 1786601494;
                    (int)(3491866377194892111L ^ (long)var2_3 ^ -3566706756417893062L);
                    try {
                        var4_2 -= 3;
                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -1480303542));
                    }
                    catch (IllegalStateException v3) {
                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -1480303542));
                    }
                    var4_2 += 2;
                    continue block31;
                }
                case 683585443: {
                    Integer.rotateRight(839118670 ^ var2_3, 9) - 316119469;
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 170197773));
                    (Integer.rotateRight(-484286790 ^ var2_3, 15) + -2054744127) * -484286789;
                    try {
                        var3_4 = var2_3 ^ -1480303542 ^ 461035377 ^ 461035377;
                    }
                    catch (IllegalArgumentException v4) {
                        var3_4 = var2_3 ^ -1480303542 ^ -1326723543 ^ -1326723543;
                    }
                    var4_2 += 2;
                    continue block31;
                }
                case -2068181924: {
                    Integer.rotateLeft(1756579556 ^ var2_3, 16) - -1307364137;
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 1091792883));
                    Integer.rotateLeft(-1699754559 ^ var2_3, 6) + -1079539302;
                    (int)(6349340984313441103L ^ (long)var2_3 ^ 4217765199491964395L);
                    (int)(2466058794464006023L ^ (long)var2_3 ^ -7232778590399895133L);
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 1178331922));
                    (int)(-3695678937596733327L ^ (long)var2_3 ^ 7087748809169843389L);
                    var3_4 = var2_3 ^ -1480303542;
                    var4_2 += 2;
                    continue block31;
                }
                case 1032432612: {
                    (Integer.rotateLeft(1819628113 ^ var2_3, 16) + 647141130) * 1819628113;
                    (int)(-5852431649289737393L ^ (long)var2_3 ^ 407719914736513118L);
                    var3_4 = (var2_3 ^ -1480303542) + 1611821782 - 1611821782;
                    (Integer.rotateLeft(1934759633 ^ var2_3, 17) + -78749046) * 1934759633;
                    (int)(-5629296209793062065L ^ (long)var2_3 ^ -8311248963852775920L);
                    continue block31;
                }
                case 1434686427: {
                    Integer.rotateLeft(-1359559352 ^ var2_3, 8) + 876577523;
                    var3_4 = var2_3 ^ 1093735167 ^ -208821862 ^ -208821862;
                    Integer.rotateRight(958497102 ^ var2_3, 10) - -278116435;
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -1480303542));
                    Integer.rotateLeft(-1900108920 ^ var2_3, 4) + 1299410099;
                    var4_2 -= 5;
                    continue block31;
                }
                case 1191895012: {
                    Integer.rotateRight(1998531086 ^ var2_3, 17) - 1898165997;
                    var3_4 = var2_3 ^ 158894520;
                    Integer.rotateRight(191461666 ^ var2_3, 4) + 1713588825;
                    try {
                        var4_2 -= 2;
                        var3_4 = (var2_3 ^ -1480303542) + -289442884 - -289442884;
                    }
                    catch (NoSuchElementException v5) {
                        var3_4 = var2_3 ^ -1480303542 ^ -426742515 ^ -426742515;
                    }
                    var4_2 += 4;
                    continue block31;
                }
                case -1557003337: {
                    (Integer.rotateLeft(20601980 ^ var2_3, 3) - 711905855) * 20601981;
                    var3_4 = var2_3 ^ -169623892 ^ -1573849945 ^ -1573849945;
                    Integer.rotateRight(866904263 ^ var2_3, 9) - 1177472852;
                    var3_4 = (int)((long)(var2_3 ^ -1480303542) ^ 574877307693125050L ^ 574877307693125050L);
                    Integer.rotateRight(-1037820757 ^ var2_3, 11) + -2034427920;
                    var4_2 += 2;
                    continue block31;
                }
                case -67992584: {
                    Integer.rotateLeft(130254700 ^ var2_3, 3) - -183827121;
                    var3_4 = (int)((long)(var2_3 ^ -1871772752) ^ 8930039248801766607L ^ 8930039248801766607L);
                    Integer.rotateLeft(1914600576 ^ var2_3, 17) + -703679813;
                    try {
                        var3_4 = (int)((long)(var2_3 ^ -1480303542) ^ 3854502979542060897L ^ 3854502979542060897L);
                    }
                    catch (IllegalStateException v6) {
                        var3_4 = var2_3 ^ -1480303542 ^ 938985654 ^ 938985654;
                    }
                    continue block31;
                }
                case 593327169: {
                    Integer.rotateRight(456838083 ^ var2_3, 6) + 1350323160;
                    var3_4 = var2_3 ^ 1840759588;
                    Integer.rotateLeft(1801046824 ^ var2_3, 16) + 71121171;
                    (int)(-1382123970573341775L ^ (long)var2_3 ^ -7614346260463192974L);
                    var3_4 = var2_3 ^ -1480303542 ^ -1862691221 ^ -1862691221;
                    continue block31;
                }
                case -2046200978: {
                    (Integer.rotateRight(1963361690 ^ var2_3, 17) + 807914721) * 1963361691;
                    try {
                        var4_2 += 2;
                        var3_4 = var2_3 ^ -1480303542 ^ -2023367260 ^ -2023367260;
                    }
                    catch (UnsupportedOperationException v7) {
                        var3_4 = (int)((long)(var2_3 ^ -1480303542) ^ 8579010146397136141L ^ 8579010146397136141L);
                    }
                    continue block31;
                }
            }
            (Integer.rotateRight(1522466102 ^ var2_3, 14) - 25053381) * 1522466103;
            var3_4 = var2_3 ^ -1480303542 ^ 352737645 ^ 352737645;
        }
    }

    public void dyt_4(class_1309 class_13092) {
        int n = -177394632;
        n = Integer.rotateLeft(n * -13372215, 28) ^ 0x6A5E7494;
        n = System.identityHashCode(this) ^ n;
        class_1309 class_13093 = class_13092;
        n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
        int n2 = n ^ 0x79D45ED9;
        if ((n2 ^ n) != 2043961049) {
            int cfr_ignored_0 = (0x8CB972E1 ^ n) - 726877169;
        }
        this.dhfz = class_13092;
    }

    public void hjk() {
        int n = bysh.khsj(-188706908);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x9AE6E127;
        if ((n2 ^ n) != -1696145113) {
            int cfr_ignored_0 = Integer.rotateRight(0x6E266E83 ^ n, 16) + 1527054616;
        }
        this.dhfz = null;
    }

    /*
     * Unable to fully structure code
     */
    public void thdhr() {
        var3_1 = 0;
        var1_2 = bysh.khsj(2083320803);
        var2_3 = Integer.reverse(var1_2 ^ 911013814 ^ -1985840102) ^ 801008266 ^ 801008266;
        block32: while (true) {
            if ((var3_1 = Integer.reverse(var2_3) ^ var1_2 ^ -1985840102) == 309047512) ** GOTO lbl209
            if (var3_1 == -797453358) ** GOTO lbl217
            if (var3_1 == 476632642) ** GOTO lbl91
            switch (var3_1) {
                case -1584746734: {
                    Integer.rotateRight(-1862583449 ^ var1_2, 5) - -1832267596;
                    if (!this.sgha.isEmpty()) {
                        try {
                            var3_1 -= 5;
                            if ((-2345126970734730867L ^ (long)var1_2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            var2_3 = Integer.reverse(var1_2 ^ 110058051 ^ -1985840102);
                        }
                        catch (IllegalArgumentException v0) {
                            var2_3 = (int)((long)Integer.reverse(var1_2 ^ 110058051 ^ -1985840102) ^ -7244087764252050008L ^ -7244087764252050008L);
                        }
                        var3_1 += 5;
                        continue block32;
                    }
                    try {
                        var3_1 -= 4;
                        if ((7653745619183849567L ^ (long)var1_2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 846962921 ^ -1985840102)));
                    }
                    catch (NoSuchElementException v1) {
                        var2_3 = Integer.reverse(var1_2 ^ 846962921 ^ -1985840102) ^ 1979993963 ^ 1979993963;
                    }
                    continue block32;
                }
                case -1317977382: {
                    Integer.rotateLeft(999408041 ^ var1_2, 10) + 990122674;
                    (int)(-494428851966514353L ^ (long)var1_2 ^ 2474872143699533719L);
                    yf.athz_2();
                    try {
                        var3_1 += 5;
                        var2_3 = Integer.reverse(var1_2 ^ -1584746734 ^ -1985840102);
                    }
                    catch (UnsupportedOperationException v2) {
                        var2_3 = Integer.reverse(var1_2 ^ -1584746734 ^ -1985840102) ^ 1472158492 ^ 1472158492;
                    }
                    continue block32;
                }
                case 1578381575: {
                    (Integer.rotateRight(112253079 ^ var1_2, 3) - -741877372) * 112253079;
                    return;
                }
                case 1467739733: {
                    (Integer.rotateLeft(-81090924 ^ var1_2, 18) - 1854393127) * -81090923;
                    return;
                }
                case 846962921: {
                    (Integer.rotateLeft(1223627285 ^ var1_2, 12) - -649015354) * 1223627285;
                    (int)(-8476412042988426417L ^ (long)var1_2 ^ -8853932718950925974L);
                    tzk.jkhdh(tzk.khfm(tr_2.ttq_3(tzk.bdth_2("跐䅙Ꙕᐶ\udef4俬禺㝩讞쉉ꏘᔇ\udc94匏硪㒿踀뿅", tzk.tar(-2004059780 ^ 482590010, 26), Integer.rotateLeft(120959564 ^ -673258093, 27), Integer.reverse(-1936811141) ^ 1487266655))));
                    var2_3 = (int)((long)Integer.reverse(var1_2 ^ 1467739733 ^ -1985840102) ^ 2761580091874058998L ^ 2761580091874058998L);
                    ++var3_1;
                    continue block32;
                }
                case 911013814: {
                    (Integer.rotateRight(-1404508421 ^ var1_2, 8) + -516843616) * -1404508421;
                    if (yf.khdha_2()) {
                        var2_3 = (int)((long)Integer.reverse(var1_2 ^ -1465108547 ^ -1985840102) ^ 5275821956861218958L ^ 5275821956861218958L);
                        Integer.rotateLeft(-708437748 ^ var1_2, 13) - -413489233;
                        var2_3 = Integer.reverse(var1_2 ^ -1584746734 ^ -1985840102) + -1565846997 - -1565846997;
                        var3_1 -= 3;
                        continue block32;
                    }
                    var2_3 = Integer.reverse(var1_2 ^ -1967217153 ^ -1985840102) + 395518212 - 395518212;
                    (Integer.rotateRight(-343939402 ^ var1_2, 16) - -1998942395) * -343939401;
                    var2_3 = Integer.reverse(var1_2 ^ -1317977382 ^ -1985840102);
                    ++var3_1;
                    continue block32;
                }
                case 110058051: {
                    Integer.rotateRight(-1355763133 ^ var1_2, 8) + 994260312;
                    this.sgha.clear();
                    bzh_4.ttht_3(class_2561.method_30163((String)tzk.dhdhw(tzk.bdth_2("编첼롹ቄ麍厢旷⢃ȟ춏뭪࿾鰪嚒摞⦗ŕ쬐룷㋄", 1877019810 ^ -2035913089, tzk.shz_7(1431465129) ^ 339910962, Integer.rotateLeft(1461402429 ^ -982139583, 16)))));
                    (int)(1063048343628248302L ^ (long)var1_2 ^ -7720041961478180784L);
                    var2_3 = (int)((long)Integer.reverse(var1_2 ^ -1249930509 ^ -1985840102) ^ -1479715929779030486L ^ -1479715929779030486L);
                    (int)(-8547296826997570766L ^ (long)var1_2 ^ 3518513397262106386L);
                    var2_3 = (int)((long)Integer.reverse(var1_2 ^ 1467739733 ^ -1985840102) ^ 3441410770642348957L ^ 3441410770642348957L);
                    var3_1 += 4;
                    continue block32;
                }
lbl91:
                // 1 sources

                Integer.rotateLeft(-1425547839 ^ var1_2, 8) + -1169065574;
                (int)(7617121871604280143L ^ (long)var1_2 ^ 1911922190278295227L);
                var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ -30367787 ^ -1985840102)));
                Integer.rotateLeft(2013635969 ^ var1_2, 18) + -1928549926;
                (int)(-4992508759166882993L ^ (long)var1_2 ^ -1582871120561252161L);
                var2_3 = (int)((long)Integer.reverse(var1_2 ^ 658840834 ^ -1985840102) ^ -5538276656457190603L ^ -5538276656457190603L);
                Integer.rotateLeft(-1257356632 ^ var1_2, 9) + -250105453;
                var2_3 = Integer.reverse(var1_2 ^ 911013814 ^ -1985840102) + 1102525692 - 1102525692;
                var3_1 -= 2;
                continue block32;
                case 1808196004: {
                    (Integer.rotateRight(-668422377 ^ var1_2, 14) - 826987268) * -668422377;
                    try {
                        ++var3_1;
                        var2_3 = (int)((long)Integer.reverse(var1_2 ^ 911013814 ^ -1985840102) ^ 7315628708818321793L ^ 7315628708818321793L);
                    }
                    catch (ArithmeticException v3) {
                        var2_3 = Integer.reverse(var1_2 ^ 911013814 ^ -1985840102) + -1765492580 - -1765492580;
                    }
                    --var3_1;
                    continue block32;
                }
                case 2007739950: {
                    (Integer.rotateRight(-881574925 ^ var1_2, 12) + -1485774424) * -881574925;
                    var2_3 = Integer.reverse(var1_2 ^ 911013814 ^ -1985840102) + 920027382 - 920027382;
                    (Integer.rotateLeft(-1922658859 ^ var1_2, 4) - 600361990) * -1922658859;
                    (int)(5752262104066616143L ^ (long)var1_2 ^ -4998851437921750407L);
                    var3_1 -= 2;
                    continue block32;
                }
                case -1284334971: {
                    Integer.rotateLeft(-1184562807 ^ var1_2, 10) + 2006503122;
                    (int)(8923794374955166543L ^ (long)var1_2 ^ -6766514291664659842L);
                    var2_3 = Integer.reverse(var1_2 ^ -1615909194 ^ -1985840102) + 1213423332 - 1213423332;
                    Integer.rotateLeft(1695897544 ^ var1_2, 15) + 1106460787;
                    var2_3 = Integer.reverse(var1_2 ^ 911013814 ^ -1985840102) ^ -1798007062 ^ -1798007062;
                    ++var3_1;
                    continue block32;
                }
                case 1534900113: {
                    Integer.rotateLeft(136245540 ^ var1_2, 4) - 1888919;
                    var2_3 = Integer.reverse(var1_2 ^ 1263178650 ^ -1985840102) ^ -393146822 ^ -393146822;
                    (Integer.rotateRight(1644241239 ^ var1_2, 15) - -494884668) * 1644241239;
                    var2_3 = Integer.reverse(var1_2 ^ 911013814 ^ -1985840102) ^ -408505541 ^ -408505541;
                    var3_1 -= 5;
                    continue block32;
                }
                case -696941275: {
                    (Integer.rotateLeft(-279869251 ^ var1_2, 16) - -12767714) * -279869251;
                    (int)(3306528883286010703L ^ (long)var1_2 ^ -5732938177183091177L);
                    var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 796950642 ^ -1985840102)));
                    (Integer.rotateLeft(-1707902659 ^ var1_2, 6) - -1332130402) * -1707902659;
                    (int)(6377614943001570127L ^ (long)var1_2 ^ 6012449650999106770L);
                    var2_3 = Integer.reverse(var1_2 ^ 911013814 ^ -1985840102) ^ 1755918423 ^ 1755918423;
                    --var3_1;
                    continue block32;
                }
                case -3425991: {
                    Integer.rotateRight(864972847 ^ var1_2, 9) - 1117598956;
                    (int)(-1775269808196110148L ^ (long)var1_2 ^ 1042309872669844328L);
                    var2_3 = Integer.reverse(var1_2 ^ -1380228044 ^ -1985840102);
                    (int)(4001735984329253123L ^ (long)var1_2 ^ -708999061232827709L);
                    var2_3 = Integer.reverse(var1_2 ^ 911013814 ^ -1985840102) + -1776499689 - -1776499689;
                    var3_1 -= 4;
                    continue block32;
                }
                case -248381990: {
                    Integer.rotateLeft(-516818712 ^ var1_2, 15) + 1231733587;
                    var2_3 = Integer.reverse(var1_2 ^ -1806166033 ^ -1985840102) ^ 1740846461 ^ 1740846461;
                    (Integer.rotateLeft(1690429628 ^ var1_2, 15) - 936955391) * 1690429629;
                    try {
                        ++var3_1;
                        var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 911013814 ^ -1985840102)));
                    }
                    catch (UnsupportedOperationException v4) {
                        var2_3 = (int)((long)Integer.reverse(var1_2 ^ 911013814 ^ -1985840102) ^ -5105986618769514879L ^ -5105986618769514879L);
                    }
                    var3_1 -= 2;
                    continue block32;
                }
                case -1682909015: {
                    Integer.rotateRight(-51703957 ^ var1_2, 18) + -1529578192;
                    var2_3 = Integer.reverse(var1_2 ^ 911013814 ^ -1985840102);
                    var3_1 -= 2;
                    continue block32;
                }
                case -117333117: {
                    (Integer.rotateLeft(109031057 ^ var1_2, 3) + -841760054) * 109031057;
                    (int)(-4265752532647351473L ^ (long)var1_2 ^ -276827228623854517L);
                    var2_3 = (int)((long)Integer.reverse(var1_2 ^ -1614230995 ^ -1985840102) ^ -3845893898671626198L ^ -3845893898671626198L);
                    (Integer.rotateLeft(780717585 ^ var1_2, 8) + -1494314166) * 780717585;
                    (int)(-1424720589346247857L ^ (long)var1_2 ^ 4406916383841482149L);
                    (int)(-5276344692858251850L ^ (long)var1_2 ^ -5937213364583612324L);
                    var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ -201069516 ^ -1985840102)));
                    (int)(8453437089304148534L ^ (long)var1_2 ^ -5400411235427858576L);
                    var2_3 = Integer.reverse(var1_2 ^ 911013814 ^ -1985840102) ^ 922811308 ^ 922811308;
                    var3_1 -= 4;
                    continue block32;
                }
lbl209:
                // 1 sources

                (Integer.rotateRight(-435519914 ^ var1_2, 15) - -542970971) * -435519913;
                var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ -371267698 ^ -1985840102)));
                (Integer.rotateRight(-393822690 ^ var1_2, 16) - 749642973) * -393822689;
                var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 911013814 ^ -1985840102)));
                var3_1 += 5;
                continue block32;
lbl217:
                // 1 sources

                (Integer.rotateRight(-666789893 ^ var1_2, 14) + 877594272) * -666789893;
                try {
                    var3_1 -= 5;
                    if ((-4558322454824436425L ^ (long)var1_2 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    var2_3 = Integer.reverse(var1_2 ^ 911013814 ^ -1985840102) + 821621793 - 821621793;
                }
                catch (IllegalStateException v5) {
                    var2_3 = Integer.reverse(var1_2 ^ 911013814 ^ -1985840102) + -1309023449 - -1309023449;
                }
                var3_1 += 2;
                continue block32;
                case 1346171117: {
                    Integer.rotateRight(-1043117013 ^ var1_2, 11) + 2096355440;
                    var2_3 = Integer.reverse(var1_2 ^ 1373416807 ^ -1985840102) ^ -22634447 ^ -22634447;
                    (Integer.rotateLeft(2097890192 ^ var1_2, 18) + 683330987) * 2097890193;
                    var2_3 = Integer.reverse(var1_2 ^ 911013814 ^ -1985840102);
                    var3_1 += 4;
                    continue block32;
                }
                case 1233633723: {
                    Integer.rotateLeft(2142080364 ^ var1_2, 18) - 2053226319;
                    var2_3 = (int)((long)Integer.reverse(var1_2 ^ 911013814 ^ -1985840102) ^ -3914091644567808712L ^ -3914091644567808712L);
                    Integer.rotateRight(2026206443 ^ var1_2, 18) + -1538865232;
                    var3_1 += 5;
                    continue block32;
                }
            }
            Integer.rotateRight(-628325533 ^ var1_2, 14) + 2069989432;
            var2_3 = Integer.reverse(var1_2 ^ 911013814 ^ -1985840102) ^ -575276225 ^ -575276225;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void dsdh_4() {
        var1_1 = 0;
        var5_2 = 0;
        var3_3 = -1368474617;
        var3_3 = Integer.rotateLeft(var3_3 * 1953746169, 16) ^ 1799031285;
        var3_3 = Integer.rotateLeft(System.identityHashCode(this) ^ var3_3, 29);
        var4_4 = (var3_3 ^ 1204040186 ^ -914472426) + -914472426 ^ -1460786283 ^ -1460786283;
        while (true) {
            block37: {
                block44: {
                    block48: {
                        block38: {
                            block43: {
                                block42: {
                                    block32: {
                                        block41: {
                                            block50: {
                                                block35: {
                                                    block33: {
                                                        block39: {
                                                            block36: {
                                                                block46: {
                                                                    block45: {
                                                                        block34: {
                                                                            block47: {
                                                                                block49: {
                                                                                    block40: {
                                                                                        var5_2 = var4_4 - -914472426 ^ -914472426 ^ var3_3;
                                                                                        switch (var5_2 & 7) {
                                                                                            case 2: {
                                                                                                if (var5_2 == -1750932742) break block32;
                                                                                                if (var5_2 == 692981826) break block33;
                                                                                                (Integer.rotateLeft(-362042947 ^ var3_3, 16) - 1734815006) * -362042947;
                                                                                                (int)(2943392078468803407L ^ (long)var3_3 ^ -977136970679845789L);
                                                                                                if (var5_2 != 1204040186) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block34;
                                                                                            }
                                                                                            case 6: {
                                                                                                if (var5_2 == 468391750) break;
                                                                                                if (var5_2 == 1548756566) break block35;
                                                                                                Integer.rotateRight(-664014581 ^ var3_3, 14) + 963628944;
                                                                                                if (var5_2 != 948579030) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block36;
                                                                                            }
                                                                                            case 1: {
                                                                                                if (var5_2 == -366020103) break block37;
                                                                                                if (var5_2 == 1618474665) break block38;
                                                                                                if (var5_2 != 217194289) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block39;
                                                                                            }
                                                                                            case 3: {
                                                                                                if (var5_2 == -948240845) break block40;
                                                                                                if (var5_2 != -168115469) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block41;
                                                                                            }
                                                                                            case 4: {
                                                                                                if (var5_2 == 152418740) break block42;
                                                                                                if (var5_2 != -1366221580) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block43;
                                                                                            }
                                                                                            case 5: {
                                                                                                if (var5_2 == 1339108621) break block44;
                                                                                                if (var5_2 == 327933845) break block45;
                                                                                                if (var5_2 == 1674695973) break block46;
                                                                                                if (var5_2 != -2036300931) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block47;
                                                                                            }
                                                                                            case 0: {
                                                                                                if (var5_2 == -1548072768) break block48;
                                                                                                if (var5_2 == -1147463080) break block49;
                                                                                                Integer.rotateLeft(-129552383 ^ var3_3, 18) + 352087898;
                                                                                                (int)(4248475804697422671L ^ (long)var3_3 ^ -4537232476116232134L);
                                                                                                if (var5_2 != 128138424) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block50;
                                                                                            }
                                                                                        }
                                                                                        (Integer.rotateLeft(-674136304 ^ var3_3, 13) + 649855531) * -674136303;
                                                                                        if (var1_1 >= this.sgha.size()) {
                                                                                            var4_4 = (var3_3 ^ -1147463080 ^ -914472426) + -914472426;
                                                                                            var5_2 -= 4;
                                                                                            continue;
                                                                                        }
                                                                                        try {
                                                                                            var5_2 += 3;
                                                                                            var4_4 = (var3_3 ^ -948240845 ^ -914472426) + -914472426 + 1047065564 - 1047065564;
                                                                                        }
                                                                                        catch (ArithmeticException v0) {
                                                                                            var4_4 = (var3_3 ^ -948240845 ^ -914472426) + -914472426 ^ -1729302704 ^ -1729302704;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    (Integer.rotateLeft(-109049512 ^ var3_3, 18) + 987676899) * -109049511;
                                                                                    var2_5 = (String)this.sgha.get(var1_1);
                                                                                    bzh_4.ttht_3(class_2561.method_30163((String)String.format(tr_2.ttq_3("commands.targ".concat(tzk.bdth_2("นㆉ砝嚚鴽࿦ꋗ얁ఫㅷ秚匐", tzk.ghrq(-2136801700) ^ -1248413374, -2050107740 - -2021199071, tzk.zab_2(1200658570 ^ 1818686092, 14)))), new Object[]{tzk.trdh(var1_1 + 1), var2_5})));
                                                                                    ++var1_1;
                                                                                    var4_4 = (int)((long)((var3_3 ^ 468391750 ^ -914472426) + -914472426) ^ 5233611098396428333L ^ 5233611098396428333L);
                                                                                    Integer.rotateRight(174261163 ^ var3_3, 4) + 1180373232;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateRight(-1153299850 ^ var3_3, 10) - -1319312507) * -1153299849;
                                                                                return;
                                                                            }
                                                                            (Integer.rotateRight(-670488934 ^ var3_3, 14) + 762924001) * -670488933;
                                                                            return;
                                                                        }
                                                                        (Integer.rotateLeft(-1999433900 ^ var3_3, 4) - -1779664281) * -1999433899;
                                                                        if (this.sgha.isEmpty()) {
                                                                            var4_4 = Integer.reverse(Integer.reverse((var3_3 ^ 593340415 ^ -914472426) + -914472426));
                                                                            (Integer.rotateLeft(1686763920 ^ var3_3, 15) + 823318443) * 1686763921;
                                                                            var4_4 = (int)((long)((var3_3 ^ 1674695973 ^ -914472426) + -914472426) ^ -5367591884521265692L ^ -5367591884521265692L);
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            var5_2 -= 5;
                                                                            if ((-8813695948167537723L ^ (long)var3_3 | 1L) == 0L) {
                                                                                throw new UnsupportedOperationException();
                                                                            }
                                                                            var4_4 = (int)((long)((var3_3 ^ 327933845 ^ -914472426) + -914472426) ^ 822249174672927645L ^ 822249174672927645L);
                                                                        }
                                                                        catch (UnsupportedOperationException v1) {
                                                                            var4_4 = (var3_3 ^ 327933845 ^ -914472426) + -914472426;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    Integer.rotateLeft(-767851103 ^ var3_3, 13) + 2039664058;
                                                                    (int)(1191531526099364687L ^ (long)var3_3 ^ -6176542740479111997L);
                                                                    var1_1 = 0;
                                                                    try {
                                                                        var5_2 += 4;
                                                                        if ((6721921452893011395L ^ (long)var3_3 | 1L) == 0L) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                        var4_4 = (int)((long)((var3_3 ^ 468391750 ^ -914472426) + -914472426) ^ 3112957045313642810L ^ 3112957045313642810L);
                                                                    }
                                                                    catch (IllegalStateException v2) {
                                                                        var4_4 = (var3_3 ^ 468391750 ^ -914472426) + -914472426 ^ -2072200710 ^ -2072200710;
                                                                    }
                                                                    var5_2 -= 2;
                                                                    continue;
                                                                }
                                                                Integer.rotateLeft(-523824252 ^ var3_3, 15) - 1014561847;
                                                                tzk.rdn(class_2561.method_30163((String)tzk.dhjsh("commands.target.empty")));
                                                                (int)(5812170560782750015L ^ (long)var3_3 ^ 709790089292090496L);
                                                                var4_4 = (int)((long)((var3_3 ^ -1147463080 ^ -914472426) + -914472426) ^ 7971115852390920746L ^ 7971115852390920746L);
                                                                var5_2 += 2;
                                                                continue;
                                                            }
                                                            Integer.rotateRight(1343974027 ^ var3_3, 13) + -1213233648;
                                                            var4_4 = (var3_3 ^ 1479296442 ^ -914472426) + -914472426 ^ 1868913230 ^ 1868913230;
                                                            (Integer.rotateLeft(1820370588 ^ var3_3, 16) - 670157855) * 1820370589;
                                                            (int)(-175731659916001153L ^ (long)var3_3 ^ -6590515137678387506L);
                                                            var4_4 = (var3_3 ^ -2148235 ^ -914472426) + -914472426 ^ 16674507 ^ 16674507;
                                                            (int)(7985835631696713246L ^ (long)var3_3 ^ 4257229114196062327L);
                                                            var4_4 = Integer.reverse(Integer.reverse((var3_3 ^ 1204040186 ^ -914472426) + -914472426));
                                                            var5_2 -= 3;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(916549174 ^ var3_3, 9) - -1578502203) * 916549175;
                                                        var4_4 = (var3_3 ^ -1374271689 ^ -914472426) + -914472426 ^ 1294406784 ^ 1294406784;
                                                        (Integer.rotateLeft(349502393 ^ var3_3, 5) + -1977083230) * 349502393;
                                                        (int)(-2997614475876177073L ^ (long)var3_3 ^ 6230874232926503197L);
                                                        (int)(-1497333398688226803L ^ (long)var3_3 ^ 3682472299572525985L);
                                                        var4_4 = (var3_3 ^ 1204040186 ^ -914472426) + -914472426 + -433163850 - -433163850;
                                                        var5_2 -= 2;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(-1643332247 ^ var3_3, 6) + 669552370;
                                                    (int)(6682800149230840655L ^ (long)var3_3 ^ -2605188235974339411L);
                                                    var4_4 = (var3_3 ^ 955378555 ^ -914472426) + -914472426 + 1125249966 - 1125249966;
                                                    Integer.rotateLeft(985019717 ^ var3_3, 10) - 544084630;
                                                    (int)(-575163912029934769L ^ (long)var3_3 ^ -3782879538531770920L);
                                                    var4_4 = (var3_3 ^ -764114353 ^ -914472426) + -914472426 ^ -1361348689 ^ -1361348689;
                                                    (Integer.rotateLeft(-2120467619 ^ var3_3, 3) - -1236742274) * -2120467619;
                                                    (int)(4840970889687526223L ^ (long)var3_3 ^ -2904677611194471540L);
                                                    var4_4 = (int)((long)((var3_3 ^ 1204040186 ^ -914472426) + -914472426) ^ -7588335014049902679L ^ -7588335014049902679L);
                                                    var5_2 -= 5;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(-105589611 ^ var3_3, 18) - 1094933830) * -105589611;
                                                (int)(4253221760739371855L ^ (long)var3_3 ^ 585612100017707997L);
                                                (int)(-8141962437651512002L ^ (long)var3_3 ^ 2155780397141242834L);
                                                var4_4 = (var3_3 ^ -723445567 ^ -914472426) + -914472426;
                                                (int)(-2933676602480190946L ^ (long)var3_3 ^ 299614881934082883L);
                                                var4_4 = (var3_3 ^ 1204040186 ^ -914472426) + -914472426;
                                                var5_2 += 3;
                                                continue;
                                            }
                                            (Integer.rotateRight(-1596427237 ^ var3_3, 7) + 2123607680) * -1596427237;
                                            var4_4 = (var3_3 ^ -388845475 ^ -914472426) + -914472426 + 1740381163 - 1740381163;
                                            (Integer.rotateRight(1816153790 ^ var3_3, 16) - 539437117) * 1816153791;
                                            try {
                                                var5_2 += 3;
                                                var4_4 = (int)((long)((var3_3 ^ 1204040186 ^ -914472426) + -914472426) ^ 397658751094789412L ^ 397658751094789412L);
                                            }
                                            catch (IllegalStateException v3) {
                                                var4_4 = (var3_3 ^ 1204040186 ^ -914472426) + -914472426 + 1724560804 - 1724560804;
                                            }
                                            continue;
                                        }
                                        (Integer.rotateRight(-856812098 ^ var3_3, 12) - -718126787) * -856812097;
                                        var4_4 = Integer.reverse(Integer.reverse((var3_3 ^ 1204040186 ^ -914472426) + -914472426));
                                        Integer.rotateRight(-561663218 ^ var3_3, 14) - -158446099;
                                        var5_2 -= 4;
                                        continue;
                                    }
                                    Integer.rotateLeft(759131876 ^ var3_3, 8) - 2131496151;
                                    var4_4 = Integer.reverse(Integer.reverse((var3_3 ^ 1204040186 ^ -914472426) + -914472426));
                                    Integer.rotateRight(-1517102166 ^ var3_3, 7) + 287717585;
                                    --var5_2;
                                    continue;
                                }
                                (Integer.rotateRight(-662168937 ^ var3_3, 14) - 1020843908) * -662168937;
                                try {
                                    if ((3949411577087940893L ^ (long)var3_3 | 1L) == 0L) {
                                        throw new UnsupportedOperationException();
                                    }
                                    var4_4 = Integer.reverse(Integer.reverse((var3_3 ^ 1204040186 ^ -914472426) + -914472426));
                                }
                                catch (UnsupportedOperationException v4) {
                                    var4_4 = (var3_3 ^ 1204040186 ^ -914472426) + -914472426 + -831736476 - -831736476;
                                }
                                var5_2 -= 2;
                                continue;
                            }
                            Integer.rotateRight(-535967570 ^ var3_3, 15) - 638118989;
                            var4_4 = (var3_3 ^ -1128125659 ^ -914472426) + -914472426 + 499914140 - 499914140;
                            (Integer.rotateRight(1428724055 ^ var3_3, 13) - 1414017220) * 1428724055;
                            var4_4 = (int)((long)((var3_3 ^ 1204040186 ^ -914472426) + -914472426) ^ 1030122091564697334L ^ 1030122091564697334L);
                            continue;
                        }
                        (Integer.rotateRight(1405124094 ^ var3_3, 13) - 682418429) * 1405124095;
                        var4_4 = (var3_3 ^ 1762416192 ^ -914472426) + -914472426 + -99823493 - -99823493;
                        Integer.rotateLeft(-1262739284 ^ var3_3, 9) - -416967665;
                        var4_4 = (var3_3 ^ 1204040186 ^ -914472426) + -914472426 + -1830371604 - -1830371604;
                        var5_2 += 2;
                        continue;
                    }
                    Integer.rotateLeft(-175628375 ^ var3_3, 17) + -1076267854;
                    (int)(3979688470616795983L ^ (long)var3_3 ^ -7036730269306862684L);
                    (int)(-345684941100760680L ^ (long)var3_3 ^ 4589623537946745782L);
                    var4_4 = (var3_3 ^ 1514414718 ^ -914472426) + -914472426;
                    (int)(7392596090947573511L ^ (long)var3_3 ^ 8107760319724085502L);
                    var4_4 = (var3_3 ^ 1204040186 ^ -914472426) + -914472426 + 1317531941 - 1317531941;
                    var5_2 += 3;
                    continue;
                }
                (Integer.rotateRight(-1691553889 ^ var3_3, 6) - -825318532) * -1691553889;
                (int)(-8485830793035667414L ^ (long)var3_3 ^ 8558465060260985257L);
                var4_4 = (var3_3 ^ 1578990725 ^ -914472426) + -914472426 + 1564659176 - 1564659176;
                (int)(-8321433228473966277L ^ (long)var3_3 ^ 6076017705500062937L);
                var4_4 = (var3_3 ^ 1204040186 ^ -914472426) + -914472426 + 182771800 - 182771800;
                continue;
            }
            Integer.rotateLeft(1340799757 ^ var3_3, 12) - -1311636018;
            (int)(-8261759851096118449L ^ (long)var3_3 ^ 6273658429386569569L);
            var4_4 = (int)((long)((var3_3 ^ 1204040186 ^ -914472426) + -914472426) ^ -8266228171803102291L ^ -8266228171803102291L);
            Integer.rotateRight(-526570966 ^ var3_3, 15) + 929413713;
            var5_2 += 4;
            continue;
lbl284:
            // 8 sources

            Integer.rotateRight(-767483186 ^ var3_3, 13) - 2051069485;
            var4_4 = (var3_3 ^ 1204040186 ^ -914472426) + -914472426 ^ -1695350558 ^ -1695350558;
        }
    }

    @Nullable
    public class_1297 jbj(byt byt2) {
        class_1297 class_12972 = null;
        int n = 0;
        int n2 = 858669716;
        n2 = Integer.rotateLeft(n2 * -195200061, 28) ^ 0x173AB616;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 2);
        byt byt3 = byt2;
        n2 = (byt3 != null ? System.identityHashCode(byt3) : 0) ^ n2;
        int n3 = 1775806401 + n2 ^ 0x9D6B6F5D ^ 0x9D6B6F5D;
        block29: while (true) {
            switch (n3 - n2) {
                case 1538678452: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x81D9FA24 ^ n2, 3) - -1111299689;
                    class_12972 = null;
                    n3 = -2014265573 + n2 ^ 0xED18267F ^ 0xED18267F;
                    n -= 5;
                    continue block29;
                }
                case 1775806401: {
                    int cfr_ignored_1 = (Integer.rotateLeft(0xBF211B3D ^ n2, 10) - 694152094) * -1088349379;
                    int cfr_ignored_2 = (int)(0x7D93B50027D4EB4FL ^ (long)n2 ^ 0x9770831A2DB956F6L);
                    if (tzk.mc.field_1687 != null) {
                        n3 = 768745053 + n2 ^ 0x993B84A7 ^ 0x993B84A7;
                        int cfr_ignored_3 = (Integer.rotateLeft(0x4FCAA4D9 ^ n2, 12) + -1377331838) * 1338680537;
                        int cfr_ignored_4 = (int)(0x8D780AE427D4EB4FL ^ (long)n2 ^ 0xE8B8831A2DB8B721L);
                        n3 = (int)((long)(1436473731 + n2) ^ 0xA4EF3E123F6ABC56L ^ 0xA4EF3E123F6ABC56L);
                        n -= 3;
                        continue block29;
                    }
                    try {
                        n -= 4;
                        n3 = 1538678452 + n2;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = 1538678452 + n2 + -217052237 - -217052237;
                    }
                    n -= 2;
                    continue block29;
                }
                case 1436473731: {
                    int cfr_ignored_5 = (Integer.rotateRight(0x527613D7 ^ n2, 13) - 11142724) * 1383470039;
                    Comparator<class_1297> comparator = Comparator.comparing(this::dda_6).thenComparing(byt2.hqa());
                    class_12972 = StreamSupport.stream(tzk.khsdh(tzk.mc.field_1687).spliterator(), false).filter(byt2::sdh_6).min(comparator).orElse(null);
                    n3 = (int)((long)(-2113779396 + n2) ^ 0xD675A55160FCCF9FL ^ 0xD675A55160FCCF9FL);
                    int cfr_ignored_6 = Integer.rotateLeft(0xF87A48EC ^ n2, 18) - 455898063;
                    n3 = -2014265573 + n2 ^ 0x5F518BB3 ^ 0x5F518BB3;
                    n -= 5;
                    continue block29;
                }
                case -975670606: {
                    int cfr_ignored_7 = (Integer.rotateRight(0xA87D42BA ^ n2, 8) + 1804121025) * -1468185925;
                    n3 = 1151366223 + n2;
                    int cfr_ignored_8 = (Integer.rotateRight(0xB88F9A93 ^ n2, 10) + 1572951816) * -1198548333;
                    n3 = 1775806401 + n2;
                    n -= 2;
                    continue block29;
                }
                case -1417770709: {
                    int cfr_ignored_9 = Integer.rotateLeft(0x22BC0A25 ^ n2, 7) - 958585270;
                    int cfr_ignored_10 = (int)(0xE00EA41827D4EB4FL ^ (long)n2 ^ 0xB540831A2DB86DCCL);
                    try {
                        n -= 4;
                        n3 = (int)((long)(1775806401 + n2) ^ 0x97BFA03FCBC4E9EAL ^ 0x97BFA03FCBC4E9EAL);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = 1775806401 + n2;
                    }
                    n += 3;
                    continue block29;
                }
                case 748836509: {
                    int cfr_ignored_11 = Integer.rotateLeft(0xFD68DAED ^ n2, 18) - -1274011154;
                    int cfr_ignored_12 = (int)(0x3FDA74D027D4EB4FL ^ (long)n2 ^ 0x14D0831A2DB9D265L);
                    n3 = Integer.reverse(Integer.reverse(458537155 + n2));
                    int cfr_ignored_13 = Integer.rotateRight(0xF09C2827 ^ n2, 17) - 658930676;
                    n3 = -1426879747 + n2 ^ 0x630F46D5 ^ 0x630F46D5;
                    int cfr_ignored_14 = (Integer.rotateRight(0x4434C7BF ^ n2, 11) - 1187106652) * 1144309695;
                    n3 = Integer.reverse(Integer.reverse(1775806401 + n2));
                    continue block29;
                }
                case -256462314: {
                    int cfr_ignored_15 = Integer.rotateLeft(0xB3298769 ^ n2, 9) + -1234893582;
                    int cfr_ignored_16 = (int)(0x719B295427D4EB4FL ^ (long)n2 ^ 0xAFD8831A2DB94EE7L);
                    try {
                        if ((0x6539BA4A3A482953L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (int)((long)(1775806401 + n2) ^ 0xE69920F210B821B3L ^ 0xE69920F210B821B3L);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = 1775806401 + n2 + 1152712425 - 1152712425;
                    }
                    n += 3;
                    continue block29;
                }
                case 1263430764: {
                    int cfr_ignored_17 = Integer.rotateLeft(0xBA4AE848 ^ n2, 10) + -1821392909;
                    try {
                        n -= 4;
                        if ((0xFD8D312B081F76E1L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.reverse(Integer.reverse(1775806401 + n2));
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (int)((long)(1775806401 + n2) ^ 0x7A83E7E3AB8251F0L ^ 0x7A83E7E3AB8251F0L);
                    }
                    n -= 2;
                    continue block29;
                }
                case -720508681: {
                    int cfr_ignored_18 = Integer.rotateRight(0x2803EA0F ^ n2, 8) - -589891828;
                    n3 = -211998185 + n2 + -98748950 - -98748950;
                    int cfr_ignored_19 = (Integer.rotateLeft(0x771843FC ^ n2, 17) - 1884150463) * 1998078973;
                    n3 = Integer.reverse(Integer.reverse(1775806401 + n2));
                    n += 4;
                    continue block29;
                }
                case -1327480301: {
                    int cfr_ignored_20 = (Integer.rotateRight(0x1A531473 ^ n2, 6) + 879565096) * 441652339;
                    n3 = Integer.reverse(Integer.reverse(1061472310 + n2));
                    int cfr_ignored_21 = (Integer.rotateLeft(0x79304F5 ^ n2, 3) - -282380058) * 127075573;
                    int cfr_ignored_22 = (int)(0xC521AAC827D4EB4FL ^ (long)n2 ^ 0xA8E0831A2DB82792L);
                    try {
                        --n;
                        n3 = 1775806401 + n2 ^ 0x16D71D03 ^ 0x16D71D03;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(1775806401 + n2));
                    }
                    continue block29;
                }
                case -2099347666: {
                    int cfr_ignored_23 = (Integer.rotateLeft(0x1B9FDAF5 ^ n2, 6) - 1555636966) * 463461109;
                    int cfr_ignored_24 = (int)(0xD92D74C827D4EB4FL ^ (long)n2 ^ 0x14E0831A2DB81F8BL);
                    n3 = Integer.reverse(Integer.reverse(-168034572 + n2));
                    int cfr_ignored_25 = Integer.rotateLeft(0x4E5F2A65 ^ n2, 12) - -2115780234;
                    int cfr_ignored_26 = (int)(0x8CED845827D4EB4FL ^ (long)n2 ^ 0xF5C0831A2DB8B40AL);
                    n3 = -819003199 + n2 + 1544972070 - 1544972070;
                    int cfr_ignored_27 = (Integer.rotateRight(0xE98FA233 ^ n2, 16) + 1287799656) * -376462797;
                    n3 = Integer.reverse(Integer.reverse(1775806401 + n2));
                    n -= 4;
                    continue block29;
                }
                case -432681275: {
                    int cfr_ignored_28 = (Integer.rotateLeft(0x29231111 ^ n2, 8) + -6508470) * 690163985;
                    int cfr_ignored_29 = (int)(0xEB91BF2C27D4EB4FL ^ (long)n2 ^ 0x8328831A2DB87AF2L);
                    n3 = Integer.reverse(Integer.reverse(-680513941 + n2));
                    int cfr_ignored_30 = (Integer.rotateRight(0x49D5011F ^ n2, 12) - -181878276) * 1238696223;
                    n3 = 1775806401 + n2 + -1430783709 - -1430783709;
                    int cfr_ignored_31 = Integer.rotateLeft(0xBDB05CC ^ n2, 4) - 1944277743;
                    n += 5;
                    continue block29;
                }
                case -1238828461: {
                    int cfr_ignored_32 = Integer.rotateRight(0x85910242 ^ n2, 3) + 820831545;
                    n3 = (int)((long)(513509227 + n2) ^ 0x3CC0A85667A85DCBL ^ 0x3CC0A85667A85DCBL);
                    int cfr_ignored_33 = Integer.rotateLeft(0x382BB44 ^ n2, 3) - 1899121783;
                    n3 = 1775806401 + n2;
                    int cfr_ignored_34 = (Integer.rotateRight(0xE4A53BD3 ^ n2, 15) + -1268785720) * -458933293;
                    --n;
                    continue block29;
                }
                case -542071573: {
                    int cfr_ignored_35 = Integer.rotateLeft(0x23750D85 ^ n2, 7) - 1334461014;
                    int cfr_ignored_36 = (int)(0xE1C7A3B827D4EB4FL ^ (long)n2 ^ 0xBA00831A2DB86E5EL);
                    n3 = Integer.reverse(Integer.reverse(-427627743 + n2));
                    int cfr_ignored_37 = Integer.rotateRight(0x588460CF ^ n2, 14) - -1134208948;
                    try {
                        n -= 3;
                        if ((0x2991BF83EA8E9B3L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (int)((long)(1775806401 + n2) ^ 0x2C0CF8327D6F36B7L ^ 0x2C0CF8327D6F36B7L);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(1775806401 + n2));
                    }
                    ++n;
                    continue block29;
                }
                case -2014265573: {
                    return class_12972;
                }
            }
            int cfr_ignored_38 = (Integer.rotateLeft(0xF1238E79 ^ n2, 17) + 934010850) * -249328007;
            int cfr_ignored_39 = (int)(0x3391204427D4EB4FL ^ (long)n2 ^ 0xBDF8831A2DB9CAF3L);
            n3 = 1775806401 + n2 + -1825733151 - -1825733151;
        }
    }

    public void ghdf() {
        int n = -165496180;
        n = Integer.rotateLeft(n * -2111176281, 15) ^ 0x9AAE8B48;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x7A194576;
        if ((n2 ^ n) != 2048476534) {
            int cfr_ignored_0 = (0x8C3BFFFA ^ n) - -1353772671;
        }
        this.dhfz = null;
    }

    public boolean thaa_2(String string) {
        block0: {
            int n = -301132369;
            n = Integer.rotateLeft(n * 1556811767, 21) ^ 0x8F59912B;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 9);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xFB331778;
            if ((n2 ^ n) == -80537736) break block0;
            int cfr_ignored_0 = (0x153E02D7 ^ n) - -423752074;
        }
        return this.sgha.contains(string);
    }

    public class_1309 br() {
        class_1309 class_13092;
        class_1297 class_12972;
        int n = -555539240;
        int n2 = (n = Integer.rotateLeft(n * 650573775, 10) ^ 0x4BBD4DBE) ^ 0xB2328CB8;
        if ((n2 ^ n) != -1305310024) {
            int cfr_ignored_0 = (0x6CD1A860 ^ n) + -423205145;
        }
        return (class_12972 = tzk.bz(tzk.dlw().getTargetManager())) instanceof class_1309 ? (class_13092 = (class_1309)class_12972) : null;
    }

    @Nullable
    @Generated
    public class_1297 dhqs_2() {
        block0: {
            int n = -1292339137;
            n = Integer.rotateLeft(n * -2104665863, 12) ^ 0xA5AE4089;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0xA72ADFB1;
            if ((n2 ^ n) == -1490362447) break block0;
            int cfr_ignored_0 = (0x15D2A78E ^ n) + 650473375;
        }
        return this.dhfz;
    }

    @Generated
    public List zlr_2() {
        return this.sgha;
    }

    private Boolean dda_6(class_1297 class_12972) {
        int n = 803228795;
        n = Integer.rotateLeft(n * 486272269, 19) ^ 0x4FC2FD11;
        n = System.identityHashCode(this) ^ n;
        class_1297 class_12973 = class_12972;
        n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
        int n2 = n ^ 0x83A7FA5A;
        if ((n2 ^ n) != -2086143398) {
            int cfr_ignored_0 = (0xAC47B621 ^ n) - -1982263997;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return !this.sgha.contains(class_12972.method_5477().getString());
    }

    private static String bdth_2(String string, int n, int n2, int n3) {
        int n4 = -1507410430;
        n4 = Integer.rotateLeft(n4 * 1707948839, 23) ^ 0x77CEBDEF;
        String string2 = string;
        n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 18);
        int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 17)) ^ 0x1569161F;
        if ((n5 ^ n4) != 359208479) {
            int cfr_ignored_0 = (0xB34FA81D ^ n4) - 583210589;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x65C8DAF6) + nw ^ Integer.reverse(n2 + i * -1963378447), 26) - jssh_2);
        }
        return new String(cArray);
    }

    private static void khy() {
        int n = 702886408;
        int n2 = (n = Integer.rotateLeft(n * 383125905, 27) ^ 0xA351BDF7) ^ 0x9D0BFDFC;
        if ((n2 ^ n) != -1660158468) {
            int cfr_ignored_0 = (0xB4EECFF4 ^ n) - -560412729;
        }
        yf.athz_2();
    }

    private static kh_3 hkh(Moondlc moondlc) {
        block0: {
            int n = 1347394312;
            n = Integer.rotateLeft(n * -1882706565, 8) ^ 0x9C4AE307;
            Moondlc moondlc2 = moondlc;
            n = Integer.rotateLeft((moondlc2 != null ? System.identityHashCode(moondlc2) : 0) ^ n, 14);
            int n2 = n ^ 0xFD36627E;
            if ((n2 ^ n) == -46767490) break block0;
            int cfr_ignored_0 = (0xAD79F976 ^ n) - 1194034212;
        }
        return moondlc.getFriendManager();
    }

    private static String azt_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1757279420;
            n4 = Integer.rotateLeft(n4 * 876730585, 25) ^ 0xEF1D63B0;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 27);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 23)) ^ 0x169CC763;
            if ((n5 ^ n4) == 379373411) break block0;
            int cfr_ignored_0 = (0x7E2133DF ^ n4) - 401770929;
        }
        return tzk.bdth_2(string, n, n2, n3);
    }

    private static String ahdh(class_320 class_3202) {
        block0: {
            int n = -205133570;
            n = Integer.rotateLeft(n * 1207954617, 8) ^ 0x3A370121;
            class_320 class_3203 = class_3202;
            n = (class_3203 != null ? System.identityHashCode(class_3203) : 0) ^ n;
            int n2 = n ^ 0x25C4B044;
            if ((n2 ^ n) == 633647172) break block0;
            int cfr_ignored_0 = (0xD60158BA ^ n) - -233672049;
        }
        return class_3202.method_1676();
    }

    private static class_2561 zkhq_2(String string) {
        block0: {
            int n = bysh.khsj(133769253);
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 4);
            int n2 = n ^ 0xE4F88478;
            if ((n2 ^ n) == -453475208) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xE301AC5D ^ n, 15) - -2121171330) * -486429603;
            int cfr_ignored_1 = (int)(0x21B3026027D4EB4FL ^ (long)n ^ 0xF9B0831A2DB9EEB7L);
        }
        return class_2561.method_30163((String)string);
    }

    private static String thth_9(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 2119966175;
            n4 = Integer.rotateLeft(n4 * -148493251, 11) ^ 0x19DF094B;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 18);
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 16)) ^ 0xC0C6F387;
            if ((n5 ^ n4) == -1060703353) break block0;
            int cfr_ignored_0 = (0xBE9AEE58 ^ n4) + 849895669;
        }
        return tzk.bdth_2(string, n, n2, n3);
    }

    private static String shwl(String string, String string2) {
        block0: {
            int n = 546515470;
            n = Integer.rotateLeft(n * -1476324757, 8) ^ 0xCBFBC194;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            String string4 = string2;
            n = (string4 != null ? System.identityHashCode(string4) : 0) ^ n;
            int n2 = n ^ 0x1CEB948A;
            if ((n2 ^ n) == 485201034) break block0;
            int cfr_ignored_0 = (0x3C78BE84 ^ n) - -1162156623;
        }
        return string.concat(string2);
    }

    private static String saa_5(String string, Object[] objectArray) {
        block0: {
            int n = -415712670;
            int n2 = (n = Integer.rotateLeft(n * -162741331, 13) ^ 0x5F5CCF76) ^ 0xD0D85509;
            if ((n2 ^ n) == -791128823) break block0;
            int cfr_ignored_0 = (0x37E0EF6B ^ n) - 1833924517;
        }
        return tr_2.zza_3(string, objectArray);
    }

    private static class_2561 drj_2(String string) {
        block0: {
            int n = 856896362;
            n = Integer.rotateLeft(n * 57373349, 8) ^ 0xE74E554B;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x667F427A;
            if ((n2 ^ n) == 1719616122) break block0;
            int cfr_ignored_0 = (0x556C7110 ^ n) + -12177101;
        }
        return class_2561.method_30163((String)string);
    }

    private static String shat_4(String string, Object[] objectArray) {
        block0: {
            int n = bysh.khsj(-442427740);
            n = Integer.rotateLeft((objectArray != null ? System.identityHashCode(objectArray) : 0) ^ n, 25);
            int n2 = n ^ 0x5CBA61F;
            if ((n2 ^ n) == 97232415) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xE06AB0BB ^ n, 15) + 826869216) * -529878853;
        }
        return tr_2.zza_3(string, objectArray);
    }

    private static class_2561 slj_2(String string) {
        block0: {
            int n = bysh.khsj(-182406756);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 8);
            int n2 = n ^ 0x6FACC50B;
            if ((n2 ^ n) == 1873593611) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x9A8C7497 ^ n, 6) - -1151353468) * -1702071145;
        }
        return class_2561.method_30163((String)string);
    }

    private static int tar(int n, int n2) {
        block0: {
            int n3 = bysh.khsj(-884703558);
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 18)) ^ 0xB3DAA6EB;
            if ((n4 ^ n3) == -1277516053) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x789ED851 ^ n3, 18) + -1617309430) * 2023675985;
            int cfr_ignored_1 = (int)(0xBA2C766C27D4EB4FL ^ (long)n3 ^ 0x11A8831A2DB8D989L);
        }
        return Integer.rotateLeft(n, n2);
    }

    private static class_2561 khfm(String string) {
        block0: {
            int n = 1188448263;
            n = Integer.rotateLeft(n * -96328581, 28) ^ 0xF084FD1B;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x34A174DE;
            if ((n2 ^ n) == 882996446) break block0;
            int cfr_ignored_0 = (0x72773CD9 ^ n) - -1851324527;
        }
        return class_2561.method_30163((String)string);
    }

    private static void jkhdh(class_2561 class_25612) {
        int n = bysh.khsj(-1315069561);
        int n2 = n ^ 0xB730E9A9;
        if ((n2 ^ n) != -1221531223) {
            int cfr_ignored_0 = Integer.rotateRight(0x6AD482E ^ n, 3) - -749118259;
        }
        bzh_4.ttht_3(class_25612);
    }

    private static int shz_7(int n) {
        block0: {
            int n2 = bysh.khsj(1081939568);
            int n3 = (n2 = n ^ n2) ^ 0xD10BF444;
            if ((n3 ^ n2) == -787745724) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x9176E234 ^ n2, 5) - -1581055097) * -1854479819;
        }
        return Integer.reverse(n);
    }

    private static String dhdhw(String string) {
        block0: {
            int n = 819503881;
            int n2 = (n = Integer.rotateLeft(n * -1039095057, 23) ^ 0x7583B0E8) ^ 0x14C5B912;
            if ((n2 ^ n) == 348502290) break block0;
            int cfr_ignored_0 = (0x241D1A1B ^ n) + 842005846;
        }
        return tr_2.ttq_3(string);
    }

    private static String dhjsh(String string) {
        block0: {
            int n = 869315860;
            n = Integer.rotateLeft(n * -35588203, 20) ^ 0xED584284;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 15);
            int n2 = n ^ 0xFDF57FE7;
            if ((n2 ^ n) == -34242585) break block0;
            int cfr_ignored_0 = (0xCE25CAF3 ^ n) - -2058738485;
        }
        return tr_2.ttq_3(string);
    }

    private static void rdn(class_2561 class_25612) {
        int n = bysh.khsj(1408416007);
        int n2 = n ^ 0x417306AF;
        if ((n2 ^ n) != 1098057391) {
            int cfr_ignored_0 = Integer.rotateLeft(0x1281BFA8 ^ n, 5) + 1108595859;
        }
        bzh_4.ttht_3(class_25612);
    }

    private static int ghrq(int n) {
        block0: {
            int n2 = bysh.khsj(1296184782);
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 17)) ^ 0x8B0AA097;
            if ((n3 ^ n2) == -1962237801) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xC6489559 ^ n2, 11) + 120042754) * -968321703;
            int cfr_ignored_1 = (int)(0x4FA3B6427D4EB4FL ^ (long)n2 ^ 0x8BB8831A2DB9A425L);
        }
        return Integer.reverse(n);
    }

    private static int zab_2(int n, int n2) {
        block0: {
            int n3 = 1040079789;
            n3 = Integer.rotateLeft(n3 * -973855207, 22) ^ 0xA1D0C21;
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 20)) ^ 0xDE90E504;
            if ((n4 ^ n3) == -560929532) break block0;
            int cfr_ignored_0 = (0xE36EBEA9 ^ n3) + 1193681878;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static Integer trdh(int n) {
        block0: {
            int n2 = 1543845633;
            n2 = Integer.rotateLeft(n2 * -633938853, 20) ^ 0x18CCF148;
            int n3 = (n2 = n ^ n2) ^ 0x5D4E017;
            if ((n3 ^ n2) == 97837079) break block0;
            int cfr_ignored_0 = (0x59D1D716 ^ n2) + -856627451;
        }
        return n;
    }

    private static Iterable khsdh(class_638 class_6382) {
        block0: {
            int n = -760022575;
            n = Integer.rotateLeft(n * 1931166061, 25) ^ 0xD7E51B08;
            class_638 class_6383 = class_6382;
            n = (class_6383 != null ? System.identityHashCode(class_6383) : 0) ^ n;
            int n2 = n ^ 0xF60B33CB;
            if ((n2 ^ n) == -167038005) break block0;
            int cfr_ignored_0 = (0x24B9CA1A ^ n) + -1657517093;
        }
        return class_6382.method_18112();
    }

    private static Moondlc dlw() {
        block0: {
            int n = -1517706488;
            int n2 = (n = Integer.rotateLeft(n * -1770249747, 14) ^ 0xC4A6D4C9) ^ 0xEF908E6E;
            if ((n2 ^ n) == -275739026) break block0;
            int cfr_ignored_0 = (0x4A192D66 ^ n) - -342303333;
        }
        return Moondlc.getInstance();
    }

    private static class_1297 bz(tzk tzk2) {
        block0: {
            int n = 1827605317;
            int n2 = (n = Integer.rotateLeft(n * 1820152907, 28) ^ 0x59A252BB) ^ 0x8FD2F9E8;
            if ((n2 ^ n) == -1881998872) break block0;
            int cfr_ignored_0 = (0xE33DF2AD ^ n) + 439586209;
        }
        return tzk2.dhqs_2();
    }

    private static String[] ashd(String string) {
        block0: {
            int n = 293092257;
            int n2 = (n = Integer.rotateLeft(n * -1251888103, 26) ^ 0x9E1FB291) ^ 0xD437CEE2;
            if ((n2 ^ n) == -734540062) break block0;
            int cfr_ignored_0 = (0xC54FF543 ^ n) + 1401766723;
        }
        return string.split("\u0006\u0016", -1);
    }

    private static CallSite dhgha_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1201047993;
            n3 = Integer.rotateLeft(n3 * -377802897, 14) ^ 0x7715DCB7;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 16);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x836731FA;
            if ((n4 ^ n3) != -2090388998) {
                int cfr_ignored_0 = (0xC4F1B843 ^ n3) + 44381849;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ hts_3 ^ string.hashCode() ^ n2 + tdf ^ i * -288749991 ^ hts_3, 8) ^ tdf));
            }
            String[] stringArray = tzk.ashd(new String(cArray));
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

    private static String[] i8uaelq6yd(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ji82tvhk9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ wv2gb589whq5n ^ string.hashCode() ^ n2 + iult1ahmb ^ i * 1226621289 ^ wv2gb589whq5n, 27) ^ iult1ahmb));
            }
            String[] stringArray = tzk.i8uaelq6yd(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

