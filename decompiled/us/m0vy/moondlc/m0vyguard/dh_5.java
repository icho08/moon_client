/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_2561
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import us.m0vy.moondlc.m0vyguard.bths_2;
import us.m0vy.moondlc.m0vyguard.bthn;
import us.m0vy.moondlc.m0vyguard.bdht_2;
import us.m0vy.moondlc.m0vyguard.brz;
import us.m0vy.moondlc.m0vyguard.bsj;
import us.m0vy.moondlc.m0vyguard.bzh_4;
import us.m0vy.moondlc.m0vyguard.byd;
import us.m0vy.moondlc.m0vyguard.rz;
import us.m0vy.moondlc.m0vyguard.ah_2;
import us.m0vy.moondlc.m0vyguard.ghkh;
import us.m0vy.moondlc.m0vyguard.nh_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class dh_5 {
    private static final int byr = -697407292;
    private static final int thjf = -2004151531;
    private static final int sds_4 = -1783680074;
    private static final int sdh_3 = 1397375103;
    private static final int xwwjn68t1f2x = 343727488;
    private static final int qveieq8m = 2079510838;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int b7r6aj29;

    public bthn thth_7() {
        block0: {
            int n = 1779685505;
            n = Integer.rotateLeft(n * 1223409319, 23) ^ 0x5D54A4C5;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0xF759415C;
            if ((n2 ^ n) == -145145508) break block0;
            int cfr_ignored_0 = (0x9D4A99DD ^ n) - 2001465953;
        }
        return dh_5.sdhk(bdht_2.jngh("macro", this::dhad));
    }

    private void tqd_3(bths_2 bths2) {
        int n = 1859789629;
        n = Integer.rotateLeft(n * -1024801395, 10) ^ 0xA90DB8AB;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x2FF1E5DD;
        if ((n2 ^ n) != 804382173) {
            int cfr_ignored_0 = (0x412BC6E0 ^ n) + -99233974;
        }
        String string = (String)dh_5.zshw_2(bths2).get(0);
        String string2 = (String)dh_5.zm_2(bths2).get(1);
        String string3 = (String)bths2.arguments().get(2);
        List list = (List)dh_5.szs_2(bths2).get(3);
        byd byd2 = byd.bykh();
        String string4 = string.toLowerCase();
        int n3 = -1;
        switch (dh_5.zh_3(string4)) {
            case 96417: {
                if (!string4.equals("add")) break;
                n3 = 0;
                break;
            }
            case -934610812: {
                if (!string4.equals("remove")) break;
                n3 = 1;
                break;
            }
            case 94746189: {
                if (!dh_5.shw_2(string4, "clear")) break;
                n3 = 2;
                break;
            }
            case 3322014: {
                if (!string4.equals("list")) break;
                n3 = 3;
            }
        }
        switch (n3) {
            case 0: {
                if (string2 == null || string3 == null || list == null || list.isEmpty()) {
                    bzh_4.dhght_2(class_2561.method_30163((String)dh_5.sghz_4("Usage: .macro", " add <name> <k").concat("ey> <message>")));
                    return;
                }
                int n4 = brz.zya_4(string3);
                if (n4 == -1) {
                    bzh_4.dhght_2(class_2561.method_30163((String)("Key " + string3 + " not found!")));
                    return;
                }
                if (dh_5.tdw_4(byd2, string2)) {
                    dh_5.hsth(class_2561.method_30163((String)dh_5.tdhn_2("防鰮駏ꂉ钯麇靂ꅁ镈鳢驢鿒鐲鷔预ꊬᚊᬑᤱ•ᓫṿម≱ᗈᲗ᪬἖ፋᴚ᠞홠\udbd5\uda67풚\udee6", dh_5.szw(695706458) ^ 0x4B47BE85, Integer.rotateLeft(0x92DB5111 ^ 0x7592F07F, 5), Integer.reverse(1899586377) ^ 0x98EAC7A2)));
                    return;
                }
                String string5 = String.join((CharSequence)" ", list);
                byd2.tdr(string2, string5, n4);
                bzh_4.ttht_3(class_2561.method_30163((String)("Added macro named " + string2 + " with button " + string3 + " with command " + string5)));
                break;
            }
            case 1: {
                if (string2 == null) {
                    bzh_4.dhght_2(class_2561.method_30163((String)dh_5.khskh_2("妑恮困子圾愜哞廼媝忽噦尛塎抯卉崳\ud947횦\udb91ힵ퐉\ude7e\udafe\udf53핤", dh_5.shwz_2(-890526371) ^ 0x9CF3EBEE, -132687226 + -1763305768, 1351091635 - 1180412551)));
                    return;
                }
                if (!dh_5.ashdh(byd2, string2)) {
                    bzh_4.dhght_2(class_2561.method_30163((String)("Macro with name '" + string2 + "' not found!")));
                    return;
                }
                byd2.shhq_2(string2);
                dh_5.dthh(class_2561.method_30163((String)("Macro " + string2 + " was successfully deleted!")));
                break;
            }
            case 2: {
                dh_5.atr_2(byd2);
                bzh_4.ttht_3(class_2561.method_30163((String)dh_5.khkd_2("絗瓗芋瞁箐疵耿穚绥獍腓祸糒", Integer.rotateLeft(0xFEA3474B ^ 0x84362677, 4), dh_5.dlh(-902182504) ^ 0xC35AF2D9, dh_5.tym_2(864518647) ^ 0xE5ADBAE0).concat("re deleted.")));
                break;
            }
            case 3: {
                if (byd2.khakh().isEmpty()) {
                    bzh_4.ttht_3(dh_5.tjl_2(dh_5.ghzy("List", dh_5.khkd_2("\uda79\udbd7훆\ud89a\udd5f팗\udf44", dh_5.zq(2088614226) ^ 0x8F3A701, -1952200841 - -1790056709, Integer.rotateLeft(0xEE3585AC ^ 0xEB23A83A, 1)))));
                    return;
                }
                dh_5.thd_10(byd2).forEach(dh_5::ahn);
            }
        }
    }

    private static void ahn(nh_2 nh2) {
        try {
            int n = 908988160;
            n = Integer.rotateLeft(n * 880887763, 26) ^ 0x6032EC24;
            nh_2 nh3 = nh2;
            n = Integer.rotateRight((nh3 != null ? System.identityHashCode(nh3) : 0) ^ n, 6);
            int n2 = n ^ 0x386F5C5;
            if ((n2 ^ n) != 59176389) {
                int cfr_ignored_0 = (0x35A8FAC5 ^ n) - -1189750841;
            }
            if ((0x3C6 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        bzh_4.ttht_3(class_2561.method_30163((String)("Name: " + String.valueOf(class_124.field_1080) + nh2.getName() + String.valueOf(class_124.field_1070) + ", Command: " + String.valueOf(class_124.field_1080) + nh2.hhdh() + String.valueOf(class_124.field_1070) + ", Button: " + String.valueOf(class_124.field_1080) + brz.adq(nh2.sshj_2()))));
    }

    /*
     * Unable to fully structure code
     */
    private void dhad(bdht_2 var1_1) {
        var4_2 = 0;
        var2_3 = -1262331756;
        var2_3 = Integer.rotateLeft(var2_3 * -885181415, 12) ^ -319924212;
        var2_3 = System.identityHashCode(this) ^ var2_3;
        var3_4 = var2_3 - -470267486 ^ -851766395 ^ -851766395;
        block24: while (true) {
            if ((var4_2 = var2_3 - var3_4) == 864728039) ** GOTO lbl76
            if (var4_2 == -2108605095) ** GOTO lbl55
            switch (var4_2) {
                case 1218252395: {
                    Integer.rotateRight(481516586 ^ var2_3, 6) + 2115356753;
                    var1_1.brsh("commands.macro.description").dqdh_2("action", (Consumer<bsj>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, zds_7(us.m0vy.moondlc.m0vyguard.bsj ), (Lus/m0vy/moondlc/m0vyguard/bsj;)V)()).dqdh_2("name", (Consumer<bsj>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, hdhz(us.m0vy.moondlc.m0vyguard.bsj ), (Lus/m0vy/moondlc/m0vyguard/bsj;)V)()).dqdh_2("key", (Consumer<bsj>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, sghm(us.m0vy.moondlc.m0vyguard.bsj ), (Lus/m0vy/moondlc/m0vyguard/bsj;)V)()).dqdh_2("message", (Consumer<bsj>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, ghtb(us.m0vy.moondlc.m0vyguard.bsj ), (Lus/m0vy/moondlc/m0vyguard/bsj;)V)()).jmz((ghkh)LambdaMetafactory.metafactory(null, null, null, (Lus/m0vy/moondlc/m0vyguard/bths_2;)V, tqd_3(us.m0vy.moondlc.m0vyguard.bths_2 ), (Lus/m0vy/moondlc/m0vyguard/bths_2;)V)((dh_5)this));
                    return;
                }
                case -470267486: {
                    Integer.rotateLeft(1750013929 ^ var2_3, 16) + -1510898574;
                    (int)(-6125535597301535921L ^ (long)var2_3 ^ -8153622976894797782L);
                    if (yf.khdha_2()) {
                        try {
                            if ((-4456157949402347725L ^ (long)var2_3 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            var3_4 = var2_3 - 1218252395 + -233496418 - -233496418;
                        }
                        catch (IllegalArgumentException v0) {
                            var3_4 = var2_3 - 1218252395 ^ -1164879029 ^ -1164879029;
                        }
                        var4_2 += 3;
                        continue block24;
                    }
                    var3_4 = (int)((long)(var2_3 - 570802099) ^ -7662992502023551158L ^ -7662992502023551158L);
                    Integer.rotateLeft(-1039866552 ^ var2_3, 11) + -2097847565;
                    var3_4 = var2_3 - -791872105 ^ -24155109 ^ -24155109;
                    continue block24;
                }
                case -791872105: {
                    (Integer.rotateLeft(1333617181 ^ var2_3, 12) - -1534295874) * 1333617181;
                    (int)(-8228133555703321777L ^ (long)var2_3 ^ 7291471945172301390L);
                    yf.athz_2();
                    throw null;
                }
                case 995682396: {
                    (Integer.rotateLeft(1191261972 ^ var2_3, 11) - -1652340057) * 1191261973;
                    var3_4 = var2_3 - -669705315 + -362004199 - -362004199;
                    (Integer.rotateRight(1120949562 ^ var2_3, 11) + 462942529) * 1120949563;
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - 269186429));
                    Integer.rotateLeft(-1362543296 ^ var2_3, 8) + 784075259;
                    var3_4 = var2_3 - -470267486;
                    var4_2 -= 5;
                    continue block24;
                }
lbl55:
                // 1 sources

                (Integer.rotateRight(1027383031 ^ var2_3, 10) - 1857347364) * 1027383031;
                (int)(5551922396224534735L ^ (long)var2_3 ^ 3851354265355892681L);
                var3_4 = (int)((long)(var2_3 - 291721418) ^ -8537672851090969428L ^ -8537672851090969428L);
                (int)(786267748311910922L ^ (long)var2_3 ^ 4162192777661364227L);
                var3_4 = var2_3 - -470267486 + -929250077 - -929250077;
                var4_2 += 3;
                continue block24;
                case 1862436075: {
                    Integer.rotateRight(-495956306 ^ var2_3, 15) - 1878468173;
                    var3_4 = var2_3 - 1531077542 + 1288566150 - 1288566150;
                    Integer.rotateRight(1684365614 ^ var2_3, 15) - 748970957;
                    var3_4 = (int)((long)(var2_3 - 1328737038) ^ -1924848280618361847L ^ -1924848280618361847L);
                    (Integer.rotateLeft(-1058414668 ^ var2_3, 11) - 1622128135) * -1058414667;
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - -470267486));
                    continue block24;
                }
lbl76:
                // 1 sources

                (Integer.rotateLeft(1720928784 ^ var2_3, 15) + 1882429227) * 1720928785;
                var3_4 = (int)((long)(var2_3 - -383035656) ^ -5928738930146935625L ^ -5928738930146935625L);
                (Integer.rotateRight(1310746903 ^ var2_3, 12) - 2051692804) * 1310746903;
                var3_4 = var2_3 - -470267486;
                continue block24;
                case -1138248274: {
                    Integer.rotateRight(-2022940305 ^ var2_3, 3) - 1786604460;
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - 1276776377));
                    (Integer.rotateLeft(92714909 ^ var2_3, 3) - -1347560642) * 92714909;
                    (int)(-4092617985719211185L ^ (long)var2_3 ^ -3589224754554854471L);
                    try {
                        var4_2 -= 5;
                        var3_4 = (int)((long)(var2_3 - -470267486) ^ 6289643052986713725L ^ 6289643052986713725L);
                    }
                    catch (NoSuchElementException v1) {
                        var3_4 = var2_3 - -470267486 + 1736083317 - 1736083317;
                    }
                    continue block24;
                }
                case -1456601254: {
                    (Integer.rotateRight(267518039 ^ var2_3, 4) - -223630908) * 267518039;
                    var3_4 = var2_3 - -1209957812;
                    (Integer.rotateRight(-1404276681 ^ var2_3, 8) - -509659676) * -1404276681;
                    try {
                        ++var4_2;
                        if ((3129366684269802369L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var3_4 = Integer.reverse(Integer.reverse(var2_3 - -470267486));
                    }
                    catch (IllegalStateException v2) {
                        var3_4 = var2_3 - -470267486 ^ -1011084663 ^ -1011084663;
                    }
                    var4_2 -= 3;
                    continue block24;
                }
                case -1606714581: {
                    Integer.rotateRight(-998897905 ^ var2_3, 11) - -827819508;
                    var3_4 = (int)((long)(var2_3 - 1380104157) ^ 8291853555369488328L ^ 8291853555369488328L);
                    (Integer.rotateLeft(846924604 ^ var2_3, 9) - 558103423) * 846924605;
                    try {
                        var4_2 += 5;
                        if ((-4424105545998932673L ^ (long)var2_3 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var3_4 = var2_3 - -470267486 + -1881414131 - -1881414131;
                    }
                    catch (UnsupportedOperationException v3) {
                        var3_4 = var2_3 - -470267486;
                    }
                    var4_2 += 3;
                    continue block24;
                }
                case -781266029: {
                    (Integer.rotateLeft(1022217620 ^ var2_3, 10) - 1697219623) * 1022217621;
                    (int)(3723544983241617720L ^ (long)var2_3 ^ -7084458909769414008L);
                    var3_4 = var2_3 - -162366919 + -901304494 - -901304494;
                    (int)(-9123428841873399590L ^ (long)var2_3 ^ -2383501954734969065L);
                    var3_4 = var2_3 - -470267486;
                    --var4_2;
                    continue block24;
                }
                case 208478361: {
                    (Integer.rotateRight(-1951501581 ^ var2_3, 4) + -293762392) * -1951501581;
                    var3_4 = var2_3 - -1475781636 ^ -2028728732 ^ -2028728732;
                    (Integer.rotateLeft(830850204 ^ var2_3, 9) - 59797023) * 830850205;
                    try {
                        var4_2 -= 5;
                        if ((1601175282778528209L ^ (long)var2_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var3_4 = Integer.reverse(Integer.reverse(var2_3 - -470267486));
                    }
                    catch (ArithmeticException v4) {
                        var3_4 = Integer.reverse(Integer.reverse(var2_3 - -470267486));
                    }
                    continue block24;
                }
                case -1180359399: {
                    (Integer.rotateLeft(335464080 ^ var2_3, 5) + 1882696363) * 335464081;
                    (int)(-5506227470834387049L ^ (long)var2_3 ^ 2009577838361496314L);
                    var3_4 = var2_3 - -470267486 + -1927229989 - -1927229989;
                    var4_2 -= 3;
                    continue block24;
                }
                case -458021176: {
                    (Integer.rotateRight(1004247327 ^ var2_3, 10) - 1140140540) * 1004247327;
                    var3_4 = var2_3 - 411848163;
                    Integer.rotateRight(-450053877 ^ var2_3, 15) + -993523824;
                    var3_4 = var2_3 - -470267486 + 1738695540 - 1738695540;
                    var4_2 += 2;
                    continue block24;
                }
            }
            (Integer.rotateLeft(500557688 ^ var2_3, 6) + -1589336381) * 500557689;
            var3_4 = Integer.reverse(Integer.reverse(var2_3 - -470267486));
        }
    }

    private static void ghtb(bsj bsj2) {
        try {
            int n = -1677896478;
            n = Integer.rotateLeft(n * 753105935, 13) ^ 0xE9186271;
            int n2 = n ^ 0x8F0053EB;
            if ((n2 ^ n) != -1895803925) {
                int cfr_ignored_0 = (0x14FD0709 ^ n) + 649218893;
            }
            if ((0x172 & 0) != 0) {
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
        bsj2.tkn().dhjn().tkk_2(ah_2::tsy);
    }

    private static void sghm(bsj bsj2) {
        int n = -1185189666;
        n = Integer.rotateLeft(n * -1632125033, 23) ^ 0x1C577B41;
        bsj bsj3 = bsj2;
        n = (bsj3 != null ? System.identityHashCode(bsj3) : 0) ^ n;
        int n2 = n ^ 0xE88473A;
        if ((n2 ^ n) != 243812154) {
            int cfr_ignored_0 = (0xB7D337E4 ^ n) + -1939868138;
        }
        bsj2.tkn().tkk_2(ah_2::tsy);
    }

    private static void hdhz(bsj bsj2) {
        int n = rz.sygh(18093759);
        int n2 = n ^ 0x3BE9E8D6;
        if ((n2 ^ n) != 1005185238) {
            int cfr_ignored_0 = Integer.rotateLeft(0x3AFDFE69 ^ n, 10) + 689925618;
            int cfr_ignored_1 = (int)(0xF84F505427D4EB4FL ^ (long)n ^ 0x5DD8831A2DB85D4FL);
        }
        bsj2.tkn().tkk_2(ah_2::tsy);
    }

    private static void zds_7(bsj bsj2) {
        try {
            int n = 2009174958;
            n = Integer.rotateLeft(n * 451438503, 9) ^ 0x277B4431;
            int n2 = n ^ 0x780DF472;
            if ((n2 ^ n) != 2014180466) {
                int cfr_ignored_0 = (0xFCC67DC ^ n) + 1411884934;
            }
            if ((0x331 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        bsj2.dby_2("add", "remove", "clear", "list");
    }

    private static String khkd_2(String string, int n, int n2, int n3) {
        int n4 = -863930614;
        n4 = Integer.rotateLeft(n4 * -168375193, 19) ^ 0x172FCAA;
        String string2 = string;
        n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 18);
        int n5 = n4 ^ 0x483DC742;
        if ((n5 ^ n4) != 1212008258) {
            int cfr_ignored_0 = (0x84BCB048 ^ n4) + -1467078669;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x6B0D6138) + n2 ^ i * -439349031) ^ byr) + thjf);
        }
        return new String(cArray);
    }

    private static bthn sdhk(bdht_2 bdht2) {
        block0: {
            int n = 127553799;
            n = Integer.rotateLeft(n * -75201427, 17) ^ 0xBDD8E983;
            bdht_2 bdht3 = bdht2;
            n = Integer.rotateRight((bdht3 != null ? System.identityHashCode(bdht3) : 0) ^ n, 24);
            int n2 = n ^ 0x1AE6A79;
            if ((n2 ^ n) == 28207737) break block0;
            int cfr_ignored_0 = (0x6343B7E ^ n) - -876818985;
        }
        return bdht2.szy_2();
    }

    private static List zshw_2(bths_2 bths2) {
        block0: {
            int n = -1440952206;
            n = Integer.rotateLeft(n * 1871972291, 9) ^ 0x2FF0078B;
            bths_2 bths3 = bths2;
            n = (bths3 != null ? System.identityHashCode(bths3) : 0) ^ n;
            int n2 = n ^ 0xB3520AB0;
            if ((n2 ^ n) == -1286468944) break block0;
            int cfr_ignored_0 = (0x194EDAC2 ^ n) + -543505675;
        }
        return bths2.arguments();
    }

    private static List zm_2(bths_2 bths2) {
        block0: {
            int n = -1998442397;
            int n2 = (n = Integer.rotateLeft(n * 6377879, 19) ^ 0x11104B32) ^ 0xD1344CA0;
            if ((n2 ^ n) == -785101664) break block0;
            int cfr_ignored_0 = (0x59D67CC3 ^ n) + -1212202532;
        }
        return bths2.arguments();
    }

    private static List szs_2(bths_2 bths2) {
        block0: {
            int n = -1959135236;
            int n2 = (n = Integer.rotateLeft(n * -2119732863, 27) ^ 0x20E01D0F) ^ 0x80BA5F80;
            if ((n2 ^ n) == -2135269504) break block0;
            int cfr_ignored_0 = (0xB83A87C ^ n) - -1190048840;
        }
        return bths2.arguments();
    }

    private static int zh_3(String string) {
        block0: {
            int n = -1484641198;
            n = Integer.rotateLeft(n * 62586063, 18) ^ 0x71C7E94E;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xE43ECCC0;
            if ((n2 ^ n) == -465646400) break block0;
            int cfr_ignored_0 = (0x43BCE092 ^ n) - -1306944816;
        }
        return string.hashCode();
    }

    private static String dfd_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -352835490;
            n4 = Integer.rotateLeft(n4 * -597514609, 4) ^ 0x4AAB071C;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 26);
            int n5 = (n4 = n3 ^ n4) ^ 0xA00F0AB4;
            if ((n5 ^ n4) == -1609626956) break block0;
            int cfr_ignored_0 = (0x4AF722EA ^ n4) + -2118416897;
        }
        return dh_5.khkd_2(string, n, n2, n3);
    }

    private static boolean shw_2(String string, Object object) {
        block0: {
            int n = rz.sygh(-695680488);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 25);
            Object object2 = object;
            n = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 5);
            int n2 = n ^ 0xE66868AF;
            if ((n2 ^ n) == -429365073) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x30E0AAB7 ^ n, 9) - -275625116) * 820030135;
        }
        return string.equals(object);
    }

    private static String shza_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = rz.sygh(472519137);
            n4 = Integer.rotateLeft(n2 ^ n4, 23);
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 12)) ^ 0x35E70D7D;
            if ((n5 ^ n4) == 904334717) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x29CD1C9C ^ n4, 8) - 338957855) * 701308061;
        }
        return dh_5.khkd_2(string, n, n2, n3);
    }

    private static String sghz_4(String string, String string2) {
        block0: {
            int n = 707908372;
            n = Integer.rotateLeft(n * -404463925, 27) ^ 0xE302A8A5;
            String string3 = string2;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0xA42FE6BB;
            if ((n2 ^ n) == -1540364613) break block0;
            int cfr_ignored_0 = (0x8E1E35AF ^ n) + 823953261;
        }
        return string.concat(string2);
    }

    private static boolean tdw_4(byd byd2, String string) {
        block0: {
            int n = -522858494;
            n = Integer.rotateLeft(n * -765236557, 27) ^ 0x1BBE4DFB;
            byd byd3 = byd2;
            n = (byd3 != null ? System.identityHashCode(byd3) : 0) ^ n;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 13);
            int n2 = n ^ 0xF05AA5BF;
            if ((n2 ^ n) == -262494785) break block0;
            int cfr_ignored_0 = (0x108F75BD ^ n) - -1552179002;
        }
        return byd2.zqj(string);
    }

    private static int szw(int n) {
        block0: {
            int n2 = -1399471125;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1262220775, 22) ^ 0x4584D6EC) ^ 0x35E81AC3;
            if ((n3 ^ n2) == 904403651) break block0;
            int cfr_ignored_0 = (0x997DD928 ^ n2) - -1172701995;
        }
        return Integer.reverse(n);
    }

    private static String tdhn_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1800696069;
            n4 = Integer.rotateLeft(n4 * 866270273, 14) ^ 0xE42A52D6;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 22);
            int n5 = (n4 = n ^ n4) ^ 0x28CF09C5;
            if ((n5 ^ n4) == 684657093) break block0;
            int cfr_ignored_0 = (0xBC64873E ^ n4) + 1967717603;
        }
        return dh_5.khkd_2(string, n, n2, n3);
    }

    private static void hsth(class_2561 class_25612) {
        int n = 424249658;
        int n2 = (n = Integer.rotateLeft(n * -1236945619, 22) ^ 0x20F7B2CD) ^ 0x3F0EDBFF;
        if ((n2 ^ n) != 1057938431) {
            int cfr_ignored_0 = (0x264752C5 ^ n) - -1122949471;
        }
        bzh_4.dhght_2(class_25612);
    }

    private static String tdt_7(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -458721178;
            n4 = Integer.rotateLeft(n4 * -1005393369, 19) ^ 0x60DFD895;
            n4 = n ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x702E1527;
            if ((n5 ^ n4) == 1882068263) break block0;
            int cfr_ignored_0 = (0x94866D41 ^ n4) - 408136353;
        }
        return dh_5.khkd_2(string, n, n2, n3);
    }

    private static int shwz_2(int n) {
        block0: {
            int n2 = -1322354572;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1784666921, 6) ^ 0x2837F518) ^ 0x8B078BC0;
            if ((n3 ^ n2) == -1962439744) break block0;
            int cfr_ignored_0 = (0x3A29F3B4 ^ n2) - 1012165605;
        }
        return Integer.reverse(n);
    }

    private static String khskh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 2054472663;
            n4 = Integer.rotateLeft(n4 * -369283677, 4) ^ 0x1197723D;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 5)) ^ 0x4540CBB8;
            if ((n5 ^ n4) == 1161874360) break block0;
            int cfr_ignored_0 = (0x3F34086F ^ n4) - -675493320;
        }
        return dh_5.khkd_2(string, n, n2, n3);
    }

    private static boolean ashdh(byd byd2, String string) {
        block0: {
            int n = rz.sygh(-1370501591);
            byd byd3 = byd2;
            n = Integer.rotateRight((byd3 != null ? System.identityHashCode(byd3) : 0) ^ n, 29);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x43BF5C79;
            if ((n2 ^ n) == 1136614521) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xEDF09250 ^ n, 16) + -729852181) * -303001007;
        }
        return byd2.zqj(string);
    }

    private static void dthh(class_2561 class_25612) {
        int n = -1344319302;
        n = Integer.rotateLeft(n * 1317368119, 28) ^ 0x384DA1CF;
        class_2561 class_25613 = class_25612;
        n = (class_25613 != null ? System.identityHashCode(class_25613) : 0) ^ n;
        int n2 = n ^ 0xF78A5100;
        if ((n2 ^ n) != -141930240) {
            int cfr_ignored_0 = (0x585501BA ^ n) + 814386345;
        }
        bzh_4.ttht_3(class_25612);
    }

    private static void atr_2(byd byd2) {
        int n = -1406176016;
        n = Integer.rotateLeft(n * -814179185, 14) ^ 0xBE0B4AA2;
        byd byd3 = byd2;
        n = (byd3 != null ? System.identityHashCode(byd3) : 0) ^ n;
        int n2 = n ^ 0xF68181CE;
        if ((n2 ^ n) != -159284786) {
            int cfr_ignored_0 = (0x5AAEF53E ^ n) + -355346831;
        }
        byd2.thdhw();
    }

    private static int dlh(int n) {
        block0: {
            int n2 = rz.sygh(1557415504);
            int n3 = (n2 = n ^ n2) ^ 0x2511F2DA;
            if ((n3 ^ n2) == 621933274) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x79C5B48A ^ n2, 18) + -1018266639;
        }
        return Integer.reverse(n);
    }

    private static int tym_2(int n) {
        block0: {
            int n2 = -1498368038;
            n2 = Integer.rotateLeft(n2 * 610954815, 25) ^ 0xF0C15286;
            int n3 = (n2 = n ^ n2) ^ 0x9CE779DE;
            if ((n3 ^ n2) == -1662551586) break block0;
            int cfr_ignored_0 = (0x3A57CE04 ^ n2) - -1439737736;
        }
        return Integer.reverse(n);
    }

    private static int zq(int n) {
        block0: {
            int n2 = rz.sygh(2076118503);
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 16)) ^ 0x9F2D26EB;
            if ((n3 ^ n2) == -1624430869) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xE4922B0C ^ n2, 15) - -1307519569;
        }
        return Integer.reverse(n);
    }

    private static String ghzy(String string, String string2) {
        block0: {
            int n = -411624953;
            int n2 = (n = Integer.rotateLeft(n * 743948243, 4) ^ 0x36A34CA4) ^ 0x4E1397C5;
            if ((n2 ^ n) == 1309906885) break block0;
            int cfr_ignored_0 = (0xA9648DC2 ^ n) + -458954341;
        }
        return string.concat(string2);
    }

    private static class_2561 tjl_2(String string) {
        block0: {
            int n = -167202527;
            int n2 = (n = Integer.rotateLeft(n * -306967971, 3) ^ 0x56526D2E) ^ 0x75DD932;
            if ((n2 ^ n) == 123590962) break block0;
            int cfr_ignored_0 = (0xF1556813 ^ n) - 1810938005;
        }
        return class_2561.method_30163((String)string);
    }

    private static List thd_10(byd byd2) {
        block0: {
            int n = 2113652764;
            n = Integer.rotateLeft(n * -2059121329, 13) ^ 0x8C4A0684;
            byd byd3 = byd2;
            n = Integer.rotateRight((byd3 != null ? System.identityHashCode(byd3) : 0) ^ n, 29);
            int n2 = n ^ 0x91B7AA1E;
            if ((n2 ^ n) == -1850234338) break block0;
            int cfr_ignored_0 = (0xEC4C6202 ^ n) + 1351710761;
        }
        return byd2.khakh();
    }

    private static String[] hhsh(String string) {
        int n = 1918349774;
        int n2 = (n = Integer.rotateLeft(n * 372689629, 22) ^ 0x2872001F) ^ 0xD2EF037C;
        if ((n2 ^ n) != -756087940) {
            int cfr_ignored_0 = (0xA0B8B2B2 ^ n) + 1162751009;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite kht_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1234062300;
            n3 = Integer.rotateLeft(n3 * 313695167, 28) ^ 0x470B5C57;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 27);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xAC41B9BA;
            if ((n4 ^ n3) != -1404978758) {
                int cfr_ignored_0 = (0xE5CFF266 ^ n3) - 1801271805;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ sds_4 ^ string.hashCode()) + (n2 + sdh_3) + i ^ sds_4, 18) + sdh_3);
            }
            String[] stringArray = dh_5.hhsh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] n0a75clleb7igx(String string) {
        return string.split("\b\u001b", -1);
    }

    private static CallSite iuzqorjbn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ xwwjn68t1f2x ^ string.hashCode()) + (n2 + qveieq8m) + i ^ xwwjn68t1f2x, 19) + qveieq8m);
            }
            String[] stringArray = dh_5.n0a75clleb7igx(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

