/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_742
 *  net.minecraft.class_7833
 *  org.jetbrains.annotations.NotNull
 *  org.joml.Quaternionfc
 *  org.joml.Vector2f
 *  org.joml.Vector3f
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_742;
import net.minecraft.class_7833;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionfc;
import org.joml.Vector2f;
import org.joml.Vector3f;
import us.m0vy.moondlc.m0vyguard.bkth;
import us.m0vy.moondlc.m0vyguard.tdhth;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.mixin.accessors.GameRendererAccessor;

public class dhs_5
implements dl {
    private static float rfh_2;
    private static float khdh_2;
    private static final tdhth drd;
    private static final tdhth jdn_2;
    private static int shs_7;
    private static final int xguvvqjk = 2088159816;
    private static final int dfy75yaszs3 = 1979093089;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kidmpler;

    /*
     * Unable to fully structure code
     */
    public static void dft_3() {
        var2 = 0;
        var0_1 = bkth.tt_3(448187544);
        var1_2 = (int)((long)((var0_1 ^ -677600117 ^ -455657894) + -455657894) ^ -654590086429305137L ^ -654590086429305137L);
        block29: while (true) {
            if ((var2 = var1_2 - -455657894 ^ -455657894 ^ var0_1) == -993995405) ** GOTO lbl79
            if (var2 == -164772849) ** GOTO lbl-1000
            if (var2 != -2047895540) {
                switch (var2) {
                    case -896797406: {
                        (Integer.rotateRight(1698629982 ^ var0_1, 15) - 1191166365) * 1698629983;
                        dhs_5.byh(dhs_5.drd);
                        (int)(3772254961720072103L ^ (long)var0_1 ^ -8737744427639257758L);
                        var1_2 = Integer.reverse(Integer.reverse((var0_1 ^ -794220087 ^ -455657894) + -455657894));
                        (int)(-8221961224277364898L ^ (long)var0_1 ^ -8153530313111587302L);
                        var1_2 = Integer.reverse(Integer.reverse((var0_1 ^ -778410742 ^ -455657894) + -455657894));
                        continue block29;
                    }
                    case -778410742: {
                        (Integer.rotateRight(-1126980142 ^ var0_1, 10) + -503401559) * -1126980141;
                        return;
                    }
                    case -677600117: {
                        (Integer.rotateRight(1486006814 ^ var0_1, 14) - -1105184547) * 1486006815;
                        if (dhs_5.shs_7++ == 0) {
                            try {
                                var2 += 3;
                                if ((-6970789787080925895L ^ (long)var0_1 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                var1_2 = (int)((long)((var0_1 ^ -896797406 ^ -455657894) + -455657894) ^ -5821792598729377730L ^ -5821792598729377730L);
                            }
                            catch (IllegalStateException v0) {
                                var1_2 = (var0_1 ^ -896797406 ^ -455657894) + -455657894;
                            }
                            var2 -= 2;
                            continue block29;
                        }
                        (int)(2683154011191022731L ^ (long)var0_1 ^ 704296411536156585L);
                        var1_2 = (var0_1 ^ -778410742 ^ -455657894) + -455657894 ^ 536173622 ^ 536173622;
                        continue block29;
                    }
                }
            }
            ** GOTO lbl108
lbl-1000:
            // 1 sources

            {
                (Integer.rotateRight(-567175853 ^ var0_1, 14) + -329337784) * -567175853;
                var1_2 = (var0_1 ^ -876440693 ^ -455657894) + -455657894 ^ 311655794 ^ 311655794;
                (Integer.rotateRight(96850134 ^ var0_1, 3) - -1219368667) * 96850135;
                var1_2 = (var0_1 ^ -677600117 ^ -455657894) + -455657894 + -1466171912 - -1466171912;
                var2 -= 4;
                continue block29;
                case 158495715: {
                    (Integer.rotateRight(1896748018 ^ var0_1, 17) + -1257109111) * 1896748019;
                    try {
                        var2 -= 4;
                        if ((4380795171582665043L ^ (long)var0_1 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var1_2 = Integer.reverse(Integer.reverse((var0_1 ^ -677600117 ^ -455657894) + -455657894));
                    }
                    catch (NoSuchElementException v1) {
                        var1_2 = (var0_1 ^ -677600117 ^ -455657894) + -455657894;
                    }
                    var2 += 2;
                    continue block29;
                }
                case -333054692: {
                    Integer.rotateLeft(100077004 ^ var0_1, 3) - -1119335697;
                    var1_2 = (int)((long)((var0_1 ^ -289590747 ^ -455657894) + -455657894) ^ -3493812556621742210L ^ -3493812556621742210L);
                    Integer.rotateRight(1363667202 ^ var0_1, 13) + -602745223;
                    try {
                        if ((4968445110598957403L ^ (long)var0_1 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var1_2 = (var0_1 ^ -677600117 ^ -455657894) + -455657894;
                    }
                    catch (UnsupportedOperationException v2) {
                        var1_2 = (var0_1 ^ -677600117 ^ -455657894) + -455657894 ^ -366125877 ^ -366125877;
                    }
                    var2 -= 4;
                    continue block29;
                }
lbl79:
                // 1 sources

                (Integer.rotateLeft(-1302457232 ^ var0_1, 9) + -1648224053) * -1302457231;
                var1_2 = Integer.reverse(Integer.reverse((var0_1 ^ 380200195 ^ -455657894) + -455657894));
                (Integer.rotateLeft(-963325968 ^ var0_1, 11) + 274910539) * -963325967;
                try {
                    var2 += 5;
                    if ((3063918263130231621L ^ (long)var0_1 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    var1_2 = (var0_1 ^ -677600117 ^ -455657894) + -455657894 ^ -1932055839 ^ -1932055839;
                }
                catch (ArithmeticException v3) {
                    var1_2 = Integer.reverse(Integer.reverse((var0_1 ^ -677600117 ^ -455657894) + -455657894));
                }
                var2 -= 5;
                continue block29;
                case 1358804126: {
                    (Integer.rotateLeft(-1390505324 ^ var0_1, 8) - -82747609) * -1390505323;
                    var1_2 = (var0_1 ^ 610741067 ^ -455657894) + -455657894;
                    Integer.rotateLeft(-1054731647 ^ var0_1, 11) + 1736301786;
                    (int)(256912695068257103L ^ (long)var0_1 ^ -8932745712429847824L);
                    var1_2 = Integer.reverse(Integer.reverse((var0_1 ^ -677600117 ^ -455657894) + -455657894));
                    (Integer.rotateLeft(-1521984227 ^ var0_1, 7) - 136373694) * -1521984227;
                    (int)(7492568249517009743L ^ (long)var0_1 ^ 1959209986365678116L);
                    continue block29;
                }
lbl108:
                // 1 sources

                (Integer.rotateRight(1691725174 ^ var0_1, 15) - 977117317) * 1691725175;
                (int)(1063120625622796434L ^ (long)var0_1 ^ 1177651674672771152L);
                var1_2 = (int)((long)((var0_1 ^ 1858897111 ^ -455657894) + -455657894) ^ -6880787033810873758L ^ -6880787033810873758L);
                (int)(2158658674081224329L ^ (long)var0_1 ^ -3732978962835073477L);
                var1_2 = (int)((long)((var0_1 ^ -677600117 ^ -455657894) + -455657894) ^ -4776361785633769417L ^ -4776361785633769417L);
                continue block29;
                case -1106754531: {
                    Integer.rotateRight(482983174 ^ var0_1, 6) - -2134146315;
                    var1_2 = (int)((long)((var0_1 ^ -1477139479 ^ -455657894) + -455657894) ^ -2419801990115782350L ^ -2419801990115782350L);
                    (Integer.rotateRight(1696534102 ^ var0_1, 15) - 1126194085) * 1696534103;
                    try {
                        if ((4926092324707327659L ^ (long)var0_1 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var1_2 = (int)((long)((var0_1 ^ -677600117 ^ -455657894) + -455657894) ^ -5688537100995200287L ^ -5688537100995200287L);
                    }
                    catch (NoSuchElementException v4) {
                        var1_2 = (var0_1 ^ -677600117 ^ -455657894) + -455657894;
                    }
                    var2 += 4;
                    continue block29;
                }
                case -947609447: {
                    (Integer.rotateLeft(-66151087 ^ var0_1, 18) + -1977439222) * -66151087;
                    (int)(4520544665590885199L ^ (long)var0_1 ^ -7230385053283790679L);
                    var1_2 = (var0_1 ^ 737603327 ^ -455657894) + -455657894 ^ 804727859 ^ 804727859;
                    (Integer.rotateRight(-1587409130 ^ var0_1, 7) - -1891798299) * -1587409129;
                    try {
                        var2 += 4;
                        if ((8172777903559230265L ^ (long)var0_1 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var1_2 = (int)((long)((var0_1 ^ -677600117 ^ -455657894) + -455657894) ^ -5502656413747874901L ^ -5502656413747874901L);
                    }
                    catch (UnsupportedOperationException v5) {
                        var1_2 = (int)((long)((var0_1 ^ -677600117 ^ -455657894) + -455657894) ^ -8640967801782563449L ^ -8640967801782563449L);
                    }
                    continue block29;
                }
                case 1467201840: {
                    Integer.rotateRight(994466690 ^ var0_1, 10) + 836940793;
                    (int)(3888757982173129875L ^ (long)var0_1 ^ -5413100827659090370L);
                    var1_2 = (int)((long)((var0_1 ^ -677600117 ^ -455657894) + -455657894) ^ -4004103726765211488L ^ -4004103726765211488L);
                    var2 += 3;
                    continue block29;
                }
                case -348276281: {
                    (Integer.rotateRight(-303653121 ^ var0_1, 16) - -750067684) * -303653121;
                    try {
                        ++var2;
                        if ((-2823012890314956347L ^ (long)var0_1 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var1_2 = Integer.reverse(Integer.reverse((var0_1 ^ -677600117 ^ -455657894) + -455657894));
                    }
                    catch (IllegalStateException v6) {
                        var1_2 = (var0_1 ^ -677600117 ^ -455657894) + -455657894 + 628045060 - 628045060;
                    }
                    var2 += 3;
                    continue block29;
                }
                case -20617217: {
                    (Integer.rotateRight(1616352922 ^ var0_1, 15) + -1359422495) * 1616352923;
                    var1_2 = (var0_1 ^ -1865573755 ^ -455657894) + -455657894 ^ -1516034313 ^ -1516034313;
                    (Integer.rotateRight(-157491905 ^ var0_1, 17) - -514037284) * -157491905;
                    try {
                        var2 -= 5;
                        var1_2 = Integer.reverse(Integer.reverse((var0_1 ^ -677600117 ^ -455657894) + -455657894));
                    }
                    catch (IllegalStateException v7) {
                        var1_2 = (var0_1 ^ -677600117 ^ -455657894) + -455657894 ^ 150369563 ^ 150369563;
                    }
                }
            }
            Integer.rotateRight(-1212105298 ^ var0_1, 9) - 1152685901;
            var1_2 = Integer.reverse(Integer.reverse((var0_1 ^ -677600117 ^ -455657894) + -455657894));
        }
    }

    public static void zlk() {
        int n = 0;
        int n2 = 797159988;
        n2 = Integer.rotateLeft(n2 * 859214809, 23) ^ 0x1200250;
        int n3 = Integer.reverse(Integer.reverse((n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348));
        while (true) {
            block26: {
                block27: {
                    block42: {
                        block31: {
                            block32: {
                                block25: {
                                    block39: {
                                        block24: {
                                            block28: {
                                                block45: {
                                                    block36: {
                                                        block44: {
                                                            block37: {
                                                                block43: {
                                                                    block41: {
                                                                        block33: {
                                                                            block30: {
                                                                                block38: {
                                                                                    block40: {
                                                                                        block34: {
                                                                                            block35: {
                                                                                                block21: {
                                                                                                    block29: {
                                                                                                        block22: {
                                                                                                            block23: {
                                                                                                                if ((n = n3 - 545714348 ^ 0x2086F0AC ^ n2) > -1519676375) break block21;
                                                                                                                if (n > -1878494873) break block22;
                                                                                                                if (n > -2052651097) break block23;
                                                                                                                if (n == -2130017635) break block24;
                                                                                                                if (n == -2052651097) break block25;
                                                                                                                int cfr_ignored_0 = (Integer.rotateLeft(0x3B3BB515 ^ n2, 10) - 815303878) * 993768725;
                                                                                                                int cfr_ignored_1 = (int)(0xF9891B2827D4EB4FL ^ (long)n2 ^ 0xCB20831A2DB85EC3L);
                                                                                                                break block26;
                                                                                                            }
                                                                                                            if (n == -1929290261) break block27;
                                                                                                            if (n == -1878494873) break block28;
                                                                                                            break block26;
                                                                                                        }
                                                                                                        if (n > -1857533600) break block29;
                                                                                                        if (n == -1861500625) break block30;
                                                                                                        if (n == -1857533600) break block31;
                                                                                                        int cfr_ignored_2 = Integer.rotateRight(0x2BFCFDCA ^ n2, 8) + 1476418225;
                                                                                                        break block26;
                                                                                                    }
                                                                                                    if (n == -1821405595) break block32;
                                                                                                    if (n == -1519676375) break block33;
                                                                                                    break block26;
                                                                                                }
                                                                                                if (n > -696152822) break block34;
                                                                                                if (n > -941126524) break block35;
                                                                                                if (n == -966501323) break block36;
                                                                                                if (n == -941126524) break block37;
                                                                                                break block26;
                                                                                            }
                                                                                            if (n == -881768416) break block38;
                                                                                            if (n == -696152822) break block39;
                                                                                            int cfr_ignored_3 = Integer.rotateLeft(0xBAF9C74C ^ n2, 10) - -1466121873;
                                                                                            break block26;
                                                                                        }
                                                                                        if (n > 417777779) break block40;
                                                                                        if (n == -501764125) break block41;
                                                                                        if (n == 417777779) break block42;
                                                                                        break block26;
                                                                                    }
                                                                                    if (n == 497044260) break block43;
                                                                                    if (n == 951590651) break block44;
                                                                                    if (n == 1927875429) break block45;
                                                                                    break block26;
                                                                                }
                                                                                int cfr_ignored_4 = (Integer.rotateRight(0x9A97141A ^ n2, 6) + -1129771423) * -1701374949;
                                                                                return;
                                                                            }
                                                                            int cfr_ignored_5 = (Integer.rotateLeft(0x6CA67E5C ^ n2, 16) - 747039839) * 1822850653;
                                                                            --shs_7;
                                                                            try {
                                                                                if ((0xDEDE77377B811239L ^ (long)n2 | 1L) == 0L) {
                                                                                    throw new IllegalArgumentException();
                                                                                }
                                                                                n3 = (n2 ^ 0xCB714820 ^ 0x2086F0AC) + 545714348 + 734547213 - 734547213;
                                                                            }
                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                n3 = (n2 ^ 0xCB714820 ^ 0x2086F0AC) + 545714348 ^ 0xB062754A ^ 0xB062754A;
                                                                            }
                                                                            --n;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_6 = (Integer.rotateLeft(0x2E33F031 ^ n2, 8) + -1666730710) * 775155761;
                                                                        int cfr_ignored_7 = (int)(0xEC815E0C27D4EB4FL ^ (long)n2 ^ 0x4168831A2DB874D3L);
                                                                        if (dhs_5.jfs_2()) {
                                                                            try {
                                                                                n -= 5;
                                                                                n3 = (n2 ^ 0x1DA04B24 ^ 0x2086F0AC) + 545714348 + 479330841 - 479330841;
                                                                            }
                                                                            catch (NoSuchElementException noSuchElementException) {
                                                                                n3 = (n2 ^ 0x1DA04B24 ^ 0x2086F0AC) + 545714348 + -423919529 - -423919529;
                                                                            }
                                                                            n -= 4;
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            if ((0xE3948263DC53124DL ^ (long)n2 | 1L) == 0L) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            n3 = (int)((long)((n2 ^ 0xE217AFE3 ^ 0x2086F0AC) + 545714348) ^ 0xD2159779710D2CAL ^ 0xD2159779710D2CAL);
                                                                        }
                                                                        catch (IllegalStateException illegalStateException) {
                                                                            n3 = (int)((long)((n2 ^ 0xE217AFE3 ^ 0x2086F0AC) + 545714348) ^ 0xCF52D1F19235A07EL ^ 0xCF52D1F19235A07EL);
                                                                        }
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_8 = (Integer.rotateRight(0x8DA3A91F ^ n2, 4) - 724507132) * -1918654177;
                                                                    if (shs_7 > 0) {
                                                                        int cfr_ignored_9 = (int)(0xF749A6046D11EDA2L ^ (long)n2 ^ 0xB178169020624342L);
                                                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x910BC12F ^ 0x2086F0AC) + 545714348));
                                                                        continue;
                                                                    }
                                                                    n3 = (n2 ^ 0xA2917DE1 ^ 0x2086F0AC) + 545714348 ^ 0xE7D80E9 ^ 0xE7D80E9;
                                                                    int cfr_ignored_10 = Integer.rotateRight(0x4D9A25E3 ^ n2, 12) + 1778922936;
                                                                    n3 = (n2 ^ 0xCB714820 ^ 0x2086F0AC) + 545714348 + 1600017415 - 1600017415;
                                                                    --n;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_11 = (Integer.rotateRight(0x1E707E32 ^ n2, 6) + -1275271351) * 510688819;
                                                                throw null;
                                                            }
                                                            int cfr_ignored_12 = Integer.rotateRight(0x614C046B ^ n2, 15) + -862836688;
                                                            n3 = (n2 ^ 0xAE2B8C25 ^ 0x2086F0AC) + 545714348 + -1033368091 - -1033368091;
                                                            int cfr_ignored_13 = (Integer.rotateLeft(0xC437AB11 ^ n2, 11) + -954509750) * -1002984687;
                                                            int cfr_ignored_14 = (int)(0x685052C27D4EB4FL ^ (long)n2 ^ 0xF728831A2DB9A0DBL);
                                                            try {
                                                                --n;
                                                                n3 = (n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348;
                                                            }
                                                            catch (ArithmeticException arithmeticException) {
                                                                n3 = (int)((long)((n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348) ^ 0xE7C84AC6460248F2L ^ 0xE7C84AC6460248F2L);
                                                            }
                                                            n += 2;
                                                            continue;
                                                        }
                                                        int cfr_ignored_15 = Integer.rotateLeft(0xC0380548 ^ n2, 11) + 1260798707;
                                                        n3 = (n2 ^ 0xDBFACC34 ^ 0x2086F0AC) + 545714348;
                                                        int cfr_ignored_16 = (Integer.rotateLeft(0xE9881975 ^ n2, 16) - 1272493158) * -376956555;
                                                        int cfr_ignored_17 = (int)(0x2B3AB74827D4EB4FL ^ (long)n2 ^ 0x93E0831A2DB9FBA4L);
                                                        n3 = (n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348;
                                                        continue;
                                                    }
                                                    int cfr_ignored_18 = (Integer.rotateRight(0x73405CBE ^ n2, 17) - -114763203) * 1933597887;
                                                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x87747973 ^ 0x2086F0AC) + 545714348));
                                                    int cfr_ignored_19 = Integer.rotateRight(0xF6CA0A2A ^ n2, 17) + -422258095;
                                                    try {
                                                        n += 3;
                                                        if ((0xB83D3DAB7C9E95A7L ^ (long)n2 | 1L) == 0L) {
                                                            throw new IllegalArgumentException();
                                                        }
                                                        n3 = (n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348 ^ 0x99F647D ^ 0x99F647D;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348));
                                                    }
                                                    n -= 2;
                                                    continue;
                                                }
                                                int cfr_ignored_20 = (Integer.rotateLeft(0x23974C11 ^ n2, 7) + 1404032330) * 597117969;
                                                int cfr_ignored_21 = (int)(0xE125E22C27D4EB4FL ^ (long)n2 ^ 0x3928831A2DB86F9AL);
                                                n3 = (int)((long)((n2 ^ 0xE8CA1562 ^ 0x2086F0AC) + 545714348) ^ 0xD33121248E38CE4BL ^ 0xD33121248E38CE4BL);
                                                int cfr_ignored_22 = (Integer.rotateLeft(0xBAC1CF7C ^ n2, 10) - -1579827393) * -1161703555;
                                                try {
                                                    if ((0xD36E83A4A35993A1L ^ (long)n2 | 1L) == 0L) {
                                                        throw new UnsupportedOperationException();
                                                    }
                                                    n3 = (n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    n3 = (n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348 + 1462973479 - 1462973479;
                                                }
                                                continue;
                                            }
                                            int cfr_ignored_23 = Integer.rotateRight(0x45ECB5E7 ^ n2, 11) - 2080876084;
                                            n3 = (n2 ^ 0xB482A15E ^ 0x2086F0AC) + 545714348;
                                            int cfr_ignored_24 = Integer.rotateRight(0xDF24C78A ^ n2, 14) + 164743409;
                                            n3 = (int)((long)((n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348) ^ 0x7A81B4ACDE3E3877L ^ 0x7A81B4ACDE3E3877L);
                                            --n;
                                            continue;
                                        }
                                        int cfr_ignored_25 = (Integer.rotateLeft(0x7A552218 ^ n2, 18) + -726876125) * 2052399641;
                                        n3 = (n2 ^ 0xF3956B92 ^ 0x2086F0AC) + 545714348;
                                        int cfr_ignored_26 = (Integer.rotateLeft(0x71E66A11 ^ n2, 17) + -817596598) * 1910925841;
                                        int cfr_ignored_27 = (int)(0xB354C42C27D4EB4FL ^ (long)n2 ^ 0x7528831A2DB8CB78L);
                                        n3 = (n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348 + -1695855200 - -1695855200;
                                        continue;
                                    }
                                    int cfr_ignored_28 = (Integer.rotateRight(0x7A0A1377 ^ n2, 18) - -879363420) * 2047480695;
                                    n3 = (n2 ^ 0x890FB47D ^ 0x2086F0AC) + 545714348;
                                    int cfr_ignored_29 = (Integer.rotateRight(0x25885F1E ^ n2, 7) - -1881070627) * 629694239;
                                    try {
                                        n3 = (n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        n3 = (n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348;
                                    }
                                    continue;
                                }
                                int cfr_ignored_30 = Integer.rotateLeft(0x8C16F188 ^ n2, 4) + -81469773;
                                n3 = Integer.reverse(Integer.reverse((n2 ^ 0x979BD0F8 ^ 0x2086F0AC) + 545714348));
                                int cfr_ignored_31 = (Integer.rotateRight(0xD961E73E ^ n2, 14) - 1463328701) * -647895233;
                                int cfr_ignored_32 = (int)(0x46294103D4621104L ^ (long)n2 ^ 0x7F776477D92F2183L);
                                n3 = (n2 ^ 0x9B4B54C ^ 0x2086F0AC) + 545714348 + -1704642371 - -1704642371;
                                int cfr_ignored_33 = (int)(0xF33011D6F5F4814L ^ (long)n2 ^ 0xFF4A120D6B0FB3B7L);
                                n3 = (n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348 ^ 0x8231FF1 ^ 0x8231FF1;
                                n -= 4;
                                continue;
                            }
                            int cfr_ignored_34 = Integer.rotateRight(0x7199DC47 ^ n2, 17) - -973124652;
                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0xC22C4CF3 ^ 0x2086F0AC) + 545714348));
                            int cfr_ignored_35 = (Integer.rotateRight(0x27EEA8B2 ^ n2, 7) + -633074487) * 669952179;
                            int cfr_ignored_36 = (int)(0xA816C96F8C9A4AF5L ^ (long)n2 ^ 0x6FAFD5876ECCFDFCL);
                            n3 = (n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348;
                            ++n;
                            continue;
                        }
                        int cfr_ignored_37 = (Integer.rotateRight(0x76D5E7D7 ^ n2, 17) - 1749332548) * 1993730007;
                        n3 = (int)((long)((n2 ^ 0x9BA89E37 ^ 0x2086F0AC) + 545714348) ^ 0x23B8B918466F592CL ^ 0x23B8B918466F592CL);
                        int cfr_ignored_38 = Integer.rotateLeft(0x6AD2AAA9 ^ n2, 16) + -203404878;
                        int cfr_ignored_39 = (int)(0xA860049427D4EB4FL ^ (long)n2 ^ 0xF458831A2DB8FD11L);
                        n3 = (n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348 + -1849608965 - -1849608965;
                        n += 5;
                        continue;
                    }
                    int cfr_ignored_40 = Integer.rotateRight(0xD63065C2 ^ n2, 13) + -197529159;
                    n3 = (int)((long)((n2 ^ 0x3C7A054 ^ 0x2086F0AC) + 545714348) ^ 0x536ECA4B8D23D23CL ^ 0x536ECA4B8D23D23CL);
                    int cfr_ignored_41 = Integer.rotateRight(0x6AF42DEB ^ n2, 16) + -135319888;
                    int cfr_ignored_42 = (int)(0xBE9C964FF1B61FFL ^ (long)n2 ^ 0x6FB9328538D9BA02L);
                    n3 = (n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348;
                    --n;
                    continue;
                }
                int cfr_ignored_43 = Integer.rotateRight(0xCB824FC7 ^ n2, 12) - -1457174444;
                n3 = (int)((long)((n2 ^ 0x401F3DA8 ^ 0x2086F0AC) + 545714348) ^ 0xFE68D938EC9C83A6L ^ 0xFE68D938EC9C83A6L);
                int cfr_ignored_44 = Integer.rotateLeft(0xD50376AC ^ n2, 13) - -808911345;
                n3 = (n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348 ^ 0xEE0E89CF ^ 0xEE0E89CF;
                int cfr_ignored_45 = Integer.rotateLeft(0x65152DE8 ^ n2, 15) + 1106128467;
                n += 4;
                continue;
            }
            int cfr_ignored_46 = (Integer.rotateLeft(0x6486B1BD ^ n2, 15) - 816653598) * 1686548925;
            int cfr_ignored_47 = (int)(0xA6341F8027D4EB4FL ^ (long)n2 ^ 0xC270831A2DB8E1B9L);
            n3 = Integer.reverse(Integer.reverse((n2 ^ 0xA56B9429 ^ 0x2086F0AC) + 545714348));
        }
    }

    public static Vector2f tdhkh(@NotNull class_243 class_2432) {
        block0: {
            int n = -2037925262;
            n = Integer.rotateLeft(n * 439966505, 22) ^ 0x86D11CF3;
            class_243 class_2433 = class_2432;
            n = Integer.rotateLeft((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 9);
            int n2 = n ^ 0xE59D7741;
            if ((n2 ^ n) == -442665151) break block0;
            int cfr_ignored_0 = (0x631ACD33 ^ n) + -1037241560;
        }
        return dhs_5.ghdhkh(class_2432.method_10216(), class_2432.method_10214(), dhs_5.zjn(class_2432));
    }

    public static Vector2f zrb_2(double d, double d2, double d3) {
        int n = 526893568;
        n = Integer.rotateLeft(n * -1956123085, 25) ^ 0x2BA97EE8;
        n = (int)Double.doubleToLongBits(d) ^ n;
        n = (int)Double.doubleToLongBits(d2) ^ n;
        int n2 = n ^ 0x6C7128D8;
        if ((n2 ^ n) != 1819355352) {
            int cfr_ignored_0 = (0x7316EAD8 ^ n) - -676123534;
        }
        tdhth tdhth2 = dhs_5.drsh();
        Vector3f vector3f = new Vector3f((float)(tdhth2.zdth_2 - d), (float)(tdhth2.that_2 - d2), (float)(tdhth2.tkk - d3));
        dhs_5.khsw(vector3f, (Quaternionfc)tdhth2.ssd);
        if (tdhth2.rnt) {
            dhs_5.shmd_2(tdhth2, vector3f);
        }
        return dhs_5.dak_3(vector3f, tdhth2.thqj);
    }

    private static tdhth tkhd_4() {
        tdhth tdhth2 = null;
        int n = 0;
        int n2 = -1204330807;
        n2 = Integer.rotateLeft(n2 * -46127567, 24) ^ 0xFC689788;
        int n3 = Integer.rotateLeft(n2 ^ 0xDE6099F3, 8);
        block32: while (true) {
            switch (Integer.rotateRight(n3, 8) ^ n2) {
                case 529071778: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0xCFA11B1 ^ n2, 4) + -1767521366) * 217715121;
                    int cfr_ignored_1 = (int)(0xCE48BF8C27D4EB4FL ^ (long)n2 ^ 0x8268831A2DB83140L);
                    tdhth2 = drd;
                    try {
                        n3 = Integer.rotateLeft(n2 ^ 0xE81C17DF, 8);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.rotateLeft(n2 ^ 0xE81C17DF, 8) ^ 0x20F1E5BB ^ 0x20F1E5BB;
                    }
                    continue block32;
                }
                case 988821582: {
                    int cfr_ignored_2 = (Integer.rotateRight(0x6E72685A ^ n2, 16) + 1681408545) * 1852991579;
                    dhs_5.shw_4(jdn_2);
                    tdhth2 = jdn_2;
                    n3 = Integer.rotateLeft(n2 ^ 0xE81C17DF, 8);
                    int cfr_ignored_3 = Integer.rotateLeft(0x4BD25C65 ^ n2, 12) - 852938614;
                    int cfr_ignored_4 = (int)(0x8960F25827D4EB4FL ^ (long)n2 ^ 0x19C0831A2DB8BF10L);
                    ++n;
                    continue block32;
                }
                case -564094477: {
                    int cfr_ignored_5 = (Integer.rotateLeft(0x806B4E34 ^ n2, 3) - -1856235641) * -2140451275;
                    if (shs_7 <= 0) {
                        try {
                            n -= 2;
                            n3 = Integer.rotateLeft(n2 ^ 0x3AF0384E, 8);
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x3AF0384E, 8) ^ 0x721A8BDF10E6C1DCL ^ 0x721A8BDF10E6C1DCL);
                        }
                        continue block32;
                    }
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x1F88FEA2, 8)));
                    continue block32;
                }
                case -773573073: {
                    int cfr_ignored_6 = (Integer.rotateRight(0x649F0092 ^ n2, 15) + 866037993) * 1688141971;
                    try {
                        n -= 5;
                        if ((0x9C5F440B8CD0D00FL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0xDE6099F3, 8) ^ 0x775C63C ^ 0x775C63C;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.rotateLeft(n2 ^ 0xDE6099F3, 8) ^ 0xBC4FA74B ^ 0xBC4FA74B;
                    }
                    n += 2;
                    continue block32;
                }
                case -1793702902: {
                    int cfr_ignored_7 = Integer.rotateRight(0xAB05004E ^ n2, 8) - -1174886227;
                    try {
                        n -= 3;
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xDE6099F3, 8)));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.rotateLeft(n2 ^ 0xDE6099F3, 8) ^ 0x38D22E7E ^ 0x38D22E7E;
                    }
                    n -= 5;
                    continue block32;
                }
                case -710451682: {
                    int cfr_ignored_8 = Integer.rotateLeft(0x5F87CFE5 ^ n2, 14) - -1781543946;
                    int cfr_ignored_9 = (int)(0x9D3561D827D4EB4FL ^ (long)n2 ^ 0x3EC0831A2DB897BBL);
                    n3 = Integer.rotateLeft(n2 ^ 0x820AC2D9, 8) ^ 0x8DB57B8D ^ 0x8DB57B8D;
                    int cfr_ignored_10 = (Integer.rotateLeft(0xBA49B395 ^ n2, 10) - -1823842746) * -1169575019;
                    int cfr_ignored_11 = (int)(0x78FB1DA827D4EB4FL ^ (long)n2 ^ 0xC620831A2DB95C27L);
                    int cfr_ignored_12 = (int)(0xF22077F9AD1E4F1EL ^ (long)n2 ^ 0x1283968F651A4991L);
                    n3 = Integer.rotateLeft(n2 ^ 0x2E3B5E2D, 8) + 558274016 - 558274016;
                    int cfr_ignored_13 = (int)(0x74DDC635684AAB2L ^ (long)n2 ^ 0x45B661BAAE43A34AL);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xDE6099F3, 8) ^ 0xEB5D0A611318A998L ^ 0xEB5D0A611318A998L);
                    n -= 5;
                    continue block32;
                }
                case 1564220071: {
                    int cfr_ignored_14 = (Integer.rotateRight(0xEC430A7A ^ n2, 16) + -1602493439) * -331150725;
                    try {
                        n -= 3;
                        if ((0x9DB09FEEB4BCEA25L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0xDE6099F3, 8) + 1406362703 - 1406362703;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xDE6099F3, 8)));
                    }
                    n += 2;
                    continue block32;
                }
                case 588019761: {
                    int cfr_ignored_15 = (Integer.rotateLeft(0x4F4328B4 ^ n2, 12) - -1652585209) * 1329801397;
                    n3 = Integer.rotateLeft(n2 ^ 0xEF002196, 8) ^ 0xFA2BD0BA ^ 0xFA2BD0BA;
                    int cfr_ignored_16 = Integer.rotateRight(0xCE0349E7 ^ n2, 12) - -154955212;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xDE6099F3, 8) ^ 0x55BE85199328FF71L ^ 0x55BE85199328FF71L);
                    int cfr_ignored_17 = (Integer.rotateRight(0x3721693 ^ n2, 3) + 1865308936) * 57808531;
                    continue block32;
                }
                case 30298437: {
                    int cfr_ignored_18 = Integer.rotateLeft(0xCAA2008C ^ n2, 12) - -1912885201;
                    n3 = Integer.rotateLeft(n2 ^ 0xE24F49D3, 8) ^ 0xDD3586C ^ 0xDD3586C;
                    int cfr_ignored_19 = (Integer.rotateLeft(0x908CA5FC ^ n2, 5) - -2056931137) * -1869830659;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xDE6099F3, 8) ^ 0xA1079BDF22A172DCL ^ 0xA1079BDF22A172DCL);
                    ++n;
                    continue block32;
                }
                case -2020196454: {
                    int cfr_ignored_20 = Integer.rotateLeft(0xC27E88C1 ^ n2, 11) + -1850724710;
                    int cfr_ignored_21 = (int)(0xCC26FC27D4EB4FL ^ (long)n2 ^ 0xB088831A2DB9AC49L);
                    n3 = Integer.rotateLeft(n2 ^ 0xA9CA4BB5, 8) + 276155909 - 276155909;
                    int cfr_ignored_22 = (Integer.rotateLeft(0xFFED9051 ^ n2, 18) + 35789066) * -1208239;
                    int cfr_ignored_23 = (int)(0x3D5F3E6C27D4EB4FL ^ (long)n2 ^ 0x81A8831A2DB9D76FL);
                    try {
                        ++n;
                        if ((0x3EB64FA53FA074D5L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xDE6099F3, 8) ^ 0xCF41809C1805F75L ^ 0xCF41809C1805F75L);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.rotateLeft(n2 ^ 0xDE6099F3, 8) + -379435438 - -379435438;
                    }
                    n += 4;
                    continue block32;
                }
                case 69596217: {
                    int cfr_ignored_24 = (Integer.rotateLeft(0x76416351 ^ n2, 17) + 1447601674) * 1983996753;
                    int cfr_ignored_25 = (int)(0xB4F3CD6C27D4EB4FL ^ (long)n2 ^ 0x67A8831A2DB8C436L);
                    n3 = Integer.rotateLeft(n2 ^ 0x537488AD, 8) ^ 0x6FC55E60 ^ 0x6FC55E60;
                    int cfr_ignored_26 = (Integer.rotateRight(0x4FD0769A ^ n2, 12) + -1365509151) * 1339061915;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xDE6099F3, 8)));
                    continue block32;
                }
                case 516878995: {
                    int cfr_ignored_27 = Integer.rotateLeft(0xD77070A8 ^ n2, 13) + 452674451;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x90F1E7E3, 8) ^ 0xCD2B7E2A36017CD3L ^ 0xCD2B7E2A36017CD3L);
                    int cfr_ignored_28 = (Integer.rotateLeft(0xAD873D55 ^ n2, 8) - 129895558) * -1383645867;
                    int cfr_ignored_29 = (int)(0x6F35936827D4EB4FL ^ (long)n2 ^ 0xDBA0831A2DB973BAL);
                    try {
                        n -= 3;
                        if ((0x50F78906D73384F3L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0xDE6099F3, 8);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.rotateLeft(n2 ^ 0xDE6099F3, 8);
                    }
                    continue block32;
                }
                case 335743113: {
                    int cfr_ignored_30 = Integer.rotateLeft(0xE8019061 ^ n2, 16) + 479075066;
                    int cfr_ignored_31 = (int)(0x2AB33E5C27D4EB4FL ^ (long)n2 ^ 0x81C8831A2DB9F8B7L);
                    try {
                        n -= 2;
                        n3 = Integer.rotateLeft(n2 ^ 0xDE6099F3, 8) + -1057492329 - -1057492329;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xDE6099F3, 8)));
                    }
                    continue block32;
                }
                case -400812065: {
                    return tdhth2;
                }
            }
            int cfr_ignored_32 = Integer.rotateRight(0xDC331C87 ^ n2, 14) - -1366420588;
            n3 = Integer.rotateLeft(n2 ^ 0xDE6099F3, 8);
        }
    }

    private static void rthj(tdhth tdhth2) {
        class_1297 class_12972;
        class_4184 class_41842 = dhs_5.mc.method_1561().field_4686;
        class_243 class_2432 = class_41842.method_19326();
        tdhth2.zdth_2 = class_2432.method_10216();
        tdhth2.that_2 = class_2432.method_10214();
        tdhth2.tkk = class_2432.method_10215();
        class_7833.field_40716.rotationDegrees(-class_41842.method_19330()).mul((Quaternionfc)class_7833.field_40714.rotationDegrees(class_41842.method_19329()), tdhth2.ssd);
        tdhth2.ssd.conjugate();
        tdhth2.thqj = ((GameRendererAccessor)dhs_5.mc.field_1773).callGetFov(class_41842, mc.method_61966().method_60637(false), true);
        tdhth2.rnt = false;
        tdhth2.zhsh_2 = false;
        tdhth2.sadh_2 = false;
        if (((Boolean)dhs_5.mc.field_1690.method_42448().method_41753()).booleanValue() && (class_12972 = mc.method_1560()) instanceof class_742) {
            class_742 class_7423 = (class_742)class_12972;
            dhs_5.dyth_2(tdhth2, class_7423);
        }
    }

    private static void dyth_2(tdhth tdhth2, class_742 class_7423) {
        float f = mc.method_61966().method_60637(false);
        float f2 = class_7423.field_53039;
        float f3 = class_7423.field_53038;
        float f4 = f2 - f3;
        float f5 = -(f2 + f4 * f);
        float f6 = class_3532.method_16439((float)f, (float)class_7423.field_7505, (float)class_7423.field_7483);
        float f7 = class_3532.method_15374((float)(f5 * (float)Math.PI)) * f6 * 0.5f;
        float f8 = -Math.abs(class_3532.method_15362((float)(f5 * (float)Math.PI)) * f6);
        float f9 = class_3532.method_15374((float)(f5 * (float)Math.PI)) * f6 * 3.0f;
        float f10 = Math.abs(class_3532.method_15362((float)(f5 * (float)Math.PI - 0.2f)) * f6) * 5.0f;
        float f11 = f9 * ((float)Math.PI / 180);
        float f12 = f10 * ((float)Math.PI / 180);
        boolean bl = tdhth2.zhsh_2 = f11 != 0.0f;
        if (tdhth2.zhsh_2) {
            tdhth2.rat_4.setAngleAxis(f11, 0.0f, 0.0f, 1.0f).conjugate();
        }
        boolean bl2 = tdhth2.sadh_2 = f12 != 0.0f;
        if (tdhth2.sadh_2) {
            tdhth2.khtq.setAngleAxis(f12, 1.0f, 0.0f, 0.0f).conjugate();
        }
        tdhth2.slw = f7;
        tdhth2.bbgh = -f8;
        tdhth2.rnt = true;
    }

    private static void shmd_2(tdhth tdhth2, Vector3f vector3f) {
        int n = 0;
        int n2 = -1241863857;
        n2 = Integer.rotateLeft(n2 * 1024765297, 28) ^ 0x7B3CB3;
        tdhth tdhth3 = tdhth2;
        n2 = Integer.rotateLeft((tdhth3 != null ? System.identityHashCode(tdhth3) : 0) ^ n2, 11);
        Vector3f vector3f2 = vector3f;
        n2 = Integer.rotateRight((vector3f2 != null ? System.identityHashCode(vector3f2) : 0) ^ n2, 8);
        int n3 = Integer.rotateLeft(n2 ^ 0x1061B0E, 8) + -163362236 - -163362236;
        block34: while (true) {
            switch (Integer.rotateRight(n3, 8) ^ n2) {
                case 17177358: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0xB13539 ^ n2, 3) + 433262882) * 11613497;
                    int cfr_ignored_1 = (int)(0xC2039B0427D4EB4FL ^ (long)n2 ^ 0xCB78831A2DB829D6L);
                    if (tdhth2.zhsh_2) {
                        try {
                            n += 4;
                            if ((0xA35DDDB69F2DE8B3L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = Integer.rotateLeft(n2 ^ 0x1061B0C, 8);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = Integer.rotateLeft(n2 ^ 0x1061B0C, 8);
                        }
                        continue block34;
                    }
                    n3 = Integer.rotateLeft(n2 ^ 0xB282BDF7, 8) ^ 0xE6F70A0E ^ 0xE6F70A0E;
                    int cfr_ignored_2 = (Integer.rotateRight(0xB7B78976 ^ n2, 9) - 1133986949) * -1212708489;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x1061B0B, 8) ^ 0x183672CA339F1128L ^ 0x183672CA339F1128L);
                    n -= 3;
                    continue block34;
                }
                case 17177356: {
                    int cfr_ignored_3 = (Integer.rotateRight(0xE55D6C17 ^ n2, 15) - -894585340) * -446862313;
                    dhs_5.dha_4(vector3f, (Quaternionfc)tdhth2.rat_4);
                    n3 = Integer.rotateLeft(n2 ^ 0x1061B0B, 8) ^ 0x1CBF6535 ^ 0x1CBF6535;
                    n -= 2;
                    continue block34;
                }
                case 17177359: {
                    int cfr_ignored_4 = (Integer.rotateRight(0x9FA45D33 ^ n2, 6) + 1497688168) * -1616618189;
                    vector3f.add(tdhth2.slw, tdhth2.bbgh, 0.0f);
                    return;
                }
                case 17177357: {
                    int cfr_ignored_5 = (Integer.rotateLeft(0x92A205F4 ^ n2, 5) - -973318201) * -1834875403;
                    dhs_5.bssh(vector3f, (Quaternionfc)tdhth2.khtq);
                    n3 = Integer.rotateLeft(n2 ^ 0x1061B0F, 8) + 134431915 - 134431915;
                    ++n;
                    continue block34;
                }
                case 17177355: {
                    int cfr_ignored_6 = Integer.rotateLeft(0xD1E1E2E9 ^ n2, 13) + 1857558898;
                    int cfr_ignored_7 = (int)(0x13534CD427D4EB4FL ^ (long)n2 ^ 0x64D8831A2DB98B77L);
                    if (!tdhth2.sadh_2) {
                        try {
                            if ((0x866166A244DC7487L ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = Integer.rotateLeft(n2 ^ 0x1061B0F, 8) ^ 0x24F1B1F3 ^ 0x24F1B1F3;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = Integer.rotateLeft(n2 ^ 0x1061B0F, 8) ^ 0x28829C19 ^ 0x28829C19;
                        }
                        ++n;
                        continue block34;
                    }
                    try {
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x1061B0D, 8) ^ 0x30CCC2667F910EF5L ^ 0x30CCC2667F910EF5L);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x1061B0D, 8) ^ 0xAD423F52 ^ 0xAD423F52;
                    }
                    n += 4;
                    continue block34;
                }
                case 17177360: {
                    int cfr_ignored_8 = Integer.rotateRight(0x30CFBAC2 ^ n2, 9) + -310035271;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x13003B24, 8)));
                    int cfr_ignored_9 = (Integer.rotateLeft(0x75353994 ^ n2, 17) - 902797351) * 1966422421;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x1061B0E, 8)));
                    int cfr_ignored_10 = Integer.rotateRight(0xDCE67AAB ^ n2, 14) + -1002014224;
                    n -= 3;
                    continue block34;
                }
                case 17177361: {
                    int cfr_ignored_11 = Integer.rotateRight(0xC348F14A ^ n2, 11) + -1439508687;
                    n3 = Integer.rotateLeft(n2 ^ 0x5BB60979, 8);
                    int cfr_ignored_12 = Integer.rotateRight(0x12FFFF03 ^ n2, 5) + 1365082264;
                    try {
                        if ((0x6DAEBCED0A33BCD5L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x1061B0E, 8) + 735553355 - 735553355;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x1061B0E, 8);
                    }
                    --n;
                    continue block34;
                }
                case 17177362: {
                    int cfr_ignored_13 = Integer.rotateRight(0x2A2EA087 ^ n2, 8) - 537071508;
                    n3 = Integer.rotateLeft(n2 ^ 0x7733276B, 8);
                    int cfr_ignored_14 = (Integer.rotateLeft(0xCC6B565D ^ n2, 12) - -983755650) * -865380771;
                    int cfr_ignored_15 = (int)(0xED9F86027D4EB4FL ^ (long)n2 ^ 0xDB0831A2DB9B062L);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xEBFBC37C, 8) ^ 0xFE8599E27E5AAA92L ^ 0xFE8599E27E5AAA92L);
                    int cfr_ignored_16 = (Integer.rotateRight(0xC4CC061E ^ n2, 11) - -653108003) * -993262049;
                    n3 = Integer.rotateLeft(n2 ^ 0x1061B0E, 8);
                    ++n;
                    continue block34;
                }
                case 17177363: {
                    int cfr_ignored_17 = (Integer.rotateLeft(0xB8388E7D ^ n2, 10) - 1396105310) * -1204253059;
                    int cfr_ignored_18 = (int)(0x7A8A204027D4EB4FL ^ (long)n2 ^ 0xBDF0831A2DB958C5L);
                    n3 = Integer.rotateLeft(n2 ^ 0x1061B0E, 8) + 1533785528 - 1533785528;
                    int cfr_ignored_19 = (Integer.rotateRight(0xEA84B3F2 ^ n2, 16) + 1785686409) * -360401933;
                    n += 2;
                    continue block34;
                }
                case 17177364: {
                    int cfr_ignored_20 = (Integer.rotateLeft(0x18B093BC ^ n2, 6) - 29328127) * 414225341;
                    int cfr_ignored_21 = (int)(0x207644089CC6F5AFL ^ (long)n2 ^ 0x7561F53E1079ED3DL);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xEA7CA796, 8)));
                    int cfr_ignored_22 = (int)(0x2D655145F75AA6C2L ^ (long)n2 ^ 0x5FFB2206B6A3F71BL);
                    n3 = Integer.rotateLeft(n2 ^ 0x1061B0E, 8) + -1678227200 - -1678227200;
                    continue block34;
                }
                case 17177365: {
                    int cfr_ignored_23 = Integer.rotateLeft(0x21972860 ^ n2, 7) + 363561691;
                    int cfr_ignored_24 = (int)(0xC7C144E58FB7D2E1L ^ (long)n2 ^ 0x74BBD3DC5EE42253L);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x1061B0E, 8) ^ 0xE790D1375115D1F4L ^ 0xE790D1375115D1F4L);
                    continue block34;
                }
                case 17177366: {
                    int cfr_ignored_25 = (Integer.rotateRight(0xBA53C833 ^ n2, 10) + -1803362968) * -1168914381;
                    n3 = Integer.rotateLeft(n2 ^ 0x62F8866D, 8);
                    int cfr_ignored_26 = (Integer.rotateLeft(0x8A437351 ^ n2, 4) + -1031236086) * -1975291055;
                    int cfr_ignored_27 = (int)(0x48F1DD6C27D4EB4FL ^ (long)n2 ^ 0x47A8831A2DB93C32L);
                    n3 = Integer.rotateLeft(n2 ^ 0x1061B0E, 8) + 1371343325 - 1371343325;
                    int cfr_ignored_28 = Integer.rotateLeft(0xED81B628 ^ n2, 16) + -955077101;
                    continue block34;
                }
                case 17177367: {
                    int cfr_ignored_29 = (Integer.rotateLeft(0xB285105D ^ n2, 9) - -1569023362) * -1299902371;
                    int cfr_ignored_30 = (int)(0x7037BE6027D4EB4FL ^ (long)n2 ^ 0x81B0831A2DB94DBEL);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xBDB17F47, 8)));
                    int cfr_ignored_31 = Integer.rotateLeft(0xACAEA7C1 ^ n2, 8) + -310120550;
                    int cfr_ignored_32 = (int)(0x6E1C09FC27D4EB4FL ^ (long)n2 ^ 0xEE88831A2DB971E9L);
                    int cfr_ignored_33 = (int)(0x277F6856C8C3D830L ^ (long)n2 ^ 0x2DDD5D344B47E32FL);
                    n3 = Integer.rotateLeft(n2 ^ 0xE791A28E, 8) ^ 0x99D6A570 ^ 0x99D6A570;
                    int cfr_ignored_34 = (int)(0x1FE321638FDEB5B1L ^ (long)n2 ^ 0xBFB7D30E90459217L);
                    n3 = Integer.rotateLeft(n2 ^ 0x1061B0E, 8);
                    n += 3;
                    continue block34;
                }
                case 17177368: {
                    int cfr_ignored_35 = (Integer.rotateRight(0x76643152 ^ n2, 17) + 1518311465) * 1986277715;
                    n3 = Integer.rotateLeft(n2 ^ 0xDAF78BAF, 8) ^ 0xA2194F3A ^ 0xA2194F3A;
                    int cfr_ignored_36 = Integer.rotateRight(0xFDFDE08E ^ n2, 18) - -971255699;
                    try {
                        --n;
                        if ((0xB5BD3A1ED2609B6BL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x1061B0E, 8) + 818856284 - 818856284;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x1061B0E, 8);
                    }
                    n -= 2;
                    continue block34;
                }
                case 17177369: {
                    int cfr_ignored_37 = (Integer.rotateLeft(0x83C4D090 ^ n2, 3) + -114106197) * -2084253551;
                    n3 = Integer.rotateLeft(n2 ^ 0x88CE3561, 8);
                    int cfr_ignored_38 = Integer.rotateLeft(0xCB15A18D ^ n2, 12) - -1677971634;
                    int cfr_ignored_39 = (int)(0x9A70FB027D4EB4FL ^ (long)n2 ^ 0xE210831A2DB9BE9FL);
                    n3 = Integer.rotateLeft(n2 ^ 0x1061B0E, 8) ^ 0x9106EDE0 ^ 0x9106EDE0;
                    n -= 3;
                    continue block34;
                }
                case 17177370: {
                    int cfr_ignored_40 = (Integer.rotateRight(0xCE26F0FA ^ n2, 12) + -82522751) * -836308741;
                    try {
                        n -= 5;
                        if ((0x1F983E9397E8CA2BL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x1061B0E, 8) ^ 0x76A6754D ^ 0x76A6754D;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x1061B0E, 8) ^ 0x97ECE4D0 ^ 0x97ECE4D0;
                    }
                    n -= 4;
                    continue block34;
                }
                case 17177371: {
                    int cfr_ignored_41 = Integer.rotateRight(0xF50BD126 ^ n2, 17) - -1328811307;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x518D40F5, 8) ^ 0x649C37CA3379625AL ^ 0x649C37CA3379625AL);
                    int cfr_ignored_42 = (Integer.rotateRight(0x52ADD457 ^ n2, 13) - 124409284) * 1387123799;
                    int cfr_ignored_43 = (int)(0x5DAA9F3618CB70B7L ^ (long)n2 ^ 0xC31CFD251A491684L);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x1061B0E, 8)));
                    n += 5;
                    continue block34;
                }
                case 17177372: {
                    int cfr_ignored_44 = (Integer.rotateRight(0xC867AB96 ^ n2, 12) - 1223386725) * -932729961;
                    try {
                        ++n;
                        if ((0x7F2504CAF417EE99L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x1061B0E, 8) ^ 0xD917E9E ^ 0xD917E9E;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x1061B0E, 8);
                    }
                    n += 2;
                    continue block34;
                }
            }
            int cfr_ignored_45 = (Integer.rotateLeft(0x4F1EFA1C ^ n2, 12) - -1726093153) * 1327430173;
            n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x1061B0E, 8) ^ 0x6D9E87824BD8CE3DL ^ 0x6D9E87824BD8CE3DL);
        }
    }

    private static Vector2f hms(Vector3f vector3f, double d) {
        float f = (float)mc.method_22683().method_4486() / 2.0f;
        float f2 = (float)mc.method_22683().method_4502() / 2.0f;
        float f3 = vector3f.x;
        float f4 = vector3f.y;
        float f5 = vector3f.z;
        double d2 = (double)f2 / ((double)f5 * Math.tan(Math.toRadians(d / 2.0)));
        return f5 < 0.0f ? new Vector2f((float)((double)(-f3) * d2 + (double)f), (float)((double)f2 - (double)f4 * d2)) : new Vector2f(Float.MAX_VALUE, Float.MAX_VALUE);
    }

    private static void byh(tdhth tdhth2) {
        int n = 1071847423;
        int n2 = (n = Integer.rotateLeft(n * -1529579137, 3) ^ 0xA49235B7) ^ 0x1E3F8E60;
        if ((n2 ^ n) != 507481696) {
            int cfr_ignored_0 = (0x21DC999F ^ n) - -1021566767;
        }
        dhs_5.rthj(tdhth2);
    }

    private static boolean jfs_2() {
        block0: {
            int n = -937295935;
            int n2 = (n = Integer.rotateLeft(n * 550473481, 5) ^ 0x8D8C63A4) ^ 0xA9DDD691;
            if ((n2 ^ n) == -1445079407) break block0;
            int cfr_ignored_0 = (0x61FC2950 ^ n) + 1664120366;
        }
        return yf.dnkh();
    }

    private static double zjn(class_243 class_2432) {
        block0: {
            int n = bkth.tt_3(-2096869997);
            class_243 class_2433 = class_2432;
            n = Integer.rotateRight((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 27);
            int n2 = n ^ 0x1DBB43A5;
            if ((n2 ^ n) == 498811813) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x9EBF0E36 ^ n, 6) - 1031821253) * -1631646153;
        }
        return class_2432.method_10215();
    }

    private static Vector2f ghdhkh(double d, double d2, double d3) {
        block0: {
            int n = 1685097656;
            n = Integer.rotateLeft(n * 1614729327, 13) ^ 0xAD7EF064;
            n = (int)Double.doubleToLongBits(d) ^ n;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d2) ^ n, 14);
            int n2 = n ^ 0x1720504E;
            if ((n2 ^ n) == 387993678) break block0;
            int cfr_ignored_0 = (0x7350DCF6 ^ n) - 1487031677;
        }
        return dhs_5.zrb_2(d, d2, d3);
    }

    private static tdhth drsh() {
        block0: {
            int n = bkth.tt_3(-749228097);
            int n2 = n ^ 0xA533998F;
            if ((n2 ^ n) == -1523345009) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x76643630 ^ n, 17) + 1518350091) * 1986278961;
        }
        return dhs_5.tkhd_4();
    }

    private static Vector3f khsw(Vector3f vector3f, Quaternionfc quaternionfc) {
        block0: {
            int n = 920804100;
            n = Integer.rotateLeft(n * -1696657133, 17) ^ 0x490A210B;
            Vector3f vector3f2 = vector3f;
            n = Integer.rotateLeft((vector3f2 != null ? System.identityHashCode(vector3f2) : 0) ^ n, 5);
            int n2 = n ^ 0x2EC39D80;
            if ((n2 ^ n) == 784571776) break block0;
            int cfr_ignored_0 = (0x1821C684 ^ n) - -46360878;
        }
        return vector3f.rotate(quaternionfc);
    }

    private static Vector2f dak_3(Vector3f vector3f, double d) {
        block0: {
            int n = -1182414944;
            int n2 = (n = Integer.rotateLeft(n * 476639789, 27) ^ 0x8B8F0094) ^ 0x6E201F28;
            if ((n2 ^ n) == 1847598888) break block0;
            int cfr_ignored_0 = (0xD7A5D888 ^ n) - -788480590;
        }
        return dhs_5.hms(vector3f, d);
    }

    private static void shw_4(tdhth tdhth2) {
        int n = 623733286;
        int n2 = (n = Integer.rotateLeft(n * 782435049, 10) ^ 0xB91C83DC) ^ 0xDE2C3616;
        if ((n2 ^ n) != -567527914) {
            int cfr_ignored_0 = (0xFB015C30 ^ n) + -1468041850;
        }
        dhs_5.rthj(tdhth2);
    }

    private static Vector3f dha_4(Vector3f vector3f, Quaternionfc quaternionfc) {
        block0: {
            int n = 13353571;
            n = Integer.rotateLeft(n * 1518459275, 27) ^ 0x3496EE9B;
            Vector3f vector3f2 = vector3f;
            n = (vector3f2 != null ? System.identityHashCode(vector3f2) : 0) ^ n;
            Quaternionfc quaternionfc2 = quaternionfc;
            n = Integer.rotateLeft((quaternionfc2 != null ? System.identityHashCode(quaternionfc2) : 0) ^ n, 6);
            int n2 = n ^ 0x28AF22D6;
            if ((n2 ^ n) == 682566358) break block0;
            int cfr_ignored_0 = (0x2864E0B5 ^ n) - 51564242;
        }
        return vector3f.rotate(quaternionfc);
    }

    private static Vector3f bssh(Vector3f vector3f, Quaternionfc quaternionfc) {
        block0: {
            int n = bkth.tt_3(1286419270);
            Vector3f vector3f2 = vector3f;
            n = Integer.rotateRight((vector3f2 != null ? System.identityHashCode(vector3f2) : 0) ^ n, 13);
            Quaternionfc quaternionfc2 = quaternionfc;
            n = Integer.rotateLeft((quaternionfc2 != null ? System.identityHashCode(quaternionfc2) : 0) ^ n, 15);
            int n2 = n ^ 0xDEAC132;
            if ((n2 ^ n) == 233488690) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x4147F274 ^ n, 11) - -334234809) * 1095234165;
        }
        return vector3f.rotate(quaternionfc);
    }

    private static String[] ukp0aiw5rc4fi(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite lmt34lxp(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ xguvvqjk ^ string.hashCode()) + (n2 + dfy75yaszs3) + i ^ xguvvqjk, 12) + dfy75yaszs3);
            }
            String[] stringArray = dhs_5.ukp0aiw5rc4fi(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

