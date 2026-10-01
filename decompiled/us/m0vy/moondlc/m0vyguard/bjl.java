/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3966
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_3966;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.bdht;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzt_4;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="CrossHair", category=bzw.OTHER, desc="Custom crosshair with dynamic hit animation")
public class bjl
extends bnq {
    private final tay skhh = new tay(this, "Size on hit").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(-724588793) ^ 0xA145F32B)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(0x5E3431DB ^ 0x1EF431DB));
    private final tay dkhk = new tay(this, "Affinity").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(659542417 + 424685167)).rkh_3(1.0f).ssd_5(2.0f);
    private final tay thdf_2 = new tay(this, "Line height").shth_7(2.0f).dhbs_2(Float.intBitsToFloat(495552118 - -597064074)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(-708580287 + 1794905023));
    private final tay khda_4 = new tay(this, "Line thickness").shth_7(2.0f).dhbs_2(Float.intBitsToFloat(-1564387076 + -1648449788)).rkh_3(1.0f).ssd_5(2.0f);
    private float hthj = 0.0f;
    private final bql<bbgh> jrn = this::btk;
    private static final int hzl_2 = 879144707;
    private static final int khkj = 1089356322;
    private static final int bqh_2 = -1243664546;
    private static final int tkhs_2 = -1692771703;
    private static final int qn9bo3rk7757 = -1524727798;
    private static final int e5tmm9vlbxt4 = 586022701;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int sreug15qq4uu;

    private void zkgh(class_4587 class_45872, float f) {
        if (bjl.mc.field_1690.field_1842) {
            return;
        }
        this.hthj = this.ghsa_2(2.0f, this.hthj, bjl.mc.field_1765 instanceof class_3966 ? 5.0f : 1.0f);
        Color color = Color.WHITE;
        int n = this.rm(color.getRGB(), this.hthj);
        int n2 = Color.BLACK.getRGB();
        float f2 = (float)mc.method_22683().method_4486() / 2.0f;
        float f3 = (float)mc.method_22683().method_4502() / 2.0f;
        float f4 = bjl.mc.field_1724 != null ? this.skhh.thw_5() - this.skhh.thw_5() * bjl.mc.field_1724.method_7261(f) : 0.0f;
        float f5 = this.thdf_2.thw_5();
        float f6 = this.khda_4.thw_5();
        float f7 = f6 / 2.0f;
        float f8 = this.dkhk.thw_5() + f4;
        this.alth(class_45872, f2, f3, f5, f6, 1.0f, f8, f7, byq.tkhw(n2));
        this.alth(class_45872, f2, f3, f5, f6, 0.0f, f8, f7, byq.tkhw(n));
    }

    private void alth(class_4587 class_45872, float f, float f2, float f3, float f4, float f5, float f6, float f7, byq byq2) {
        bdht.tqkh(class_45872, f - f7 - f5 / 2.0f, f2 - f3 - f6 - f5 / 2.0f, f4 + f5, f3 + f5, byq2);
        bdht.tqkh(class_45872, f - f7 - f5 / 2.0f, f2 + f6 - f5 / 2.0f, f4 + f5, f3 + f5, byq2);
        bdht.tqkh(class_45872, f - f3 - f6 - f5 / 2.0f, f2 - f7 - f5 / 2.0f, f3 + f5, f4 + f5, byq2);
        bdht.tqkh(class_45872, f + f6 - f5 / 2.0f, f2 - f7 - f5 / 2.0f, f3 + f5, f4 + f5, byq2);
    }

    /*
     * Unable to fully structure code
     */
    private float ghsa_2(float var1_1, float var2_2, float var3_3) {
        var4_4 = 0.0f;
        var5_5 = 0.0f;
        var8_6 = 0;
        var6_7 = 1013423252;
        var6_7 = Integer.rotateLeft(var6_7 * 1656099371, 26) ^ 1761758905;
        var6_7 = System.identityHashCode(this) ^ var6_7;
        var6_7 = Float.floatToIntBits(var2_2) ^ var6_7;
        var7_8 = Integer.reverse(var6_7 ^ 604987467 ^ 179724670);
        while (true) {
            block51: {
                block43: {
                    block40: {
                        block53: {
                            block52: {
                                block50: {
                                    block48: {
                                        block42: {
                                            block44: {
                                                block49: {
                                                    block46: {
                                                        block41: {
                                                            block47: {
                                                                block45: {
                                                                    var8_6 = Integer.reverse(var7_8) ^ var6_7 ^ 179724670;
                                                                    switch (var8_6 & 7) {
                                                                        case 0: {
                                                                            if (var8_6 == 537496032) break block40;
                                                                            if (var8_6 == -63933184) break block41;
                                                                            Integer.rotateRight(-1601730233 ^ var6_7, 7) - 1959214804;
                                                                            if (var8_6 != 37587208) {
                                                                                ** break;
                                                                            }
                                                                            break block42;
                                                                        }
                                                                        case 2: {
                                                                            if (var8_6 == -1351508038) break block43;
                                                                            if (var8_6 == 1667517762) break block44;
                                                                            if (var8_6 != 712022506) {
                                                                                ** break;
                                                                            }
                                                                            break block45;
                                                                        }
                                                                        case 3: {
                                                                            if (var8_6 == -155112237) break block46;
                                                                            if (var8_6 != 604987467) {
                                                                                if (var8_6 == 1519333787) break;
                                                                                ** break;
                                                                            }
                                                                            break block47;
                                                                        }
                                                                        case 6: {
                                                                            if (var8_6 == -1062196202) break block48;
                                                                            if (var8_6 == 1521422582) break block49;
                                                                            Integer.rotateLeft(-105123539 ^ var6_7, 18) - 1109382062;
                                                                            (int)(4254035846020524879L ^ (long)var6_7 ^ 4850520947137567683L);
                                                                            if (var8_6 != -241812538) {
                                                                                ** break;
                                                                            }
                                                                            break block50;
                                                                        }
                                                                        case 7: {
                                                                            if (var8_6 == -140528545) break block51;
                                                                            if (var8_6 == -1220963161) break block52;
                                                                            if (var8_6 != 665395527) {
                                                                                ** break;
                                                                            }
                                                                            break block53;
                                                                        }
                                                                    }
                                                                    (Integer.rotateRight(1620773883 ^ var6_7, 15) + -1222372704) * 1620773883;
                                                                    var5_5 = var3_3;
                                                                    try {
                                                                        var8_6 += 5;
                                                                        if ((6315742817943495433L ^ (long)var6_7 | 1L) == 0L) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                        var7_8 = Integer.reverse(var6_7 ^ -140528545 ^ 179724670) ^ 940148988 ^ 940148988;
                                                                    }
                                                                    catch (IllegalStateException v0) {
                                                                        var7_8 = Integer.reverse(var6_7 ^ -140528545 ^ 179724670) + -946521338 - -946521338;
                                                                    }
                                                                    --var8_6;
                                                                    continue;
                                                                }
                                                                (Integer.rotateRight(1696154266 ^ var6_7, 15) + 1114419169) * 1696154267;
                                                                var5_5 = var2_2 + var4_4 * (var1_1 * Float.intBitsToFloat(-2030011849 ^ -1160988934));
                                                                try {
                                                                    var8_6 += 3;
                                                                    if ((-4099203103179384961L ^ (long)var6_7 | 1L) == 0L) {
                                                                        throw new UnsupportedOperationException();
                                                                    }
                                                                    var7_8 = Integer.reverse(var6_7 ^ -140528545 ^ 179724670) + -1411178115 - -1411178115;
                                                                }
                                                                catch (UnsupportedOperationException v1) {
                                                                    var7_8 = Integer.reverse(var6_7 ^ -140528545 ^ 179724670) + 1951875609 - 1951875609;
                                                                }
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(2116969156 ^ var6_7, 18) - 1274778871;
                                                            var4_4 = var3_3 - var2_2;
                                                            if (Math.abs(var4_4) < Float.intBitsToFloat(-321370434 ^ -778794381)) {
                                                                var7_8 = Integer.reverse(Integer.reverse(Integer.reverse(var6_7 ^ -850725398 ^ 179724670)));
                                                                (Integer.rotateRight(-685768993 ^ var6_7, 13) - 289242172) * -685768993;
                                                                var7_8 = Integer.reverse(var6_7 ^ 1519333787 ^ 179724670) ^ 1584935122 ^ 1584935122;
                                                                --var8_6;
                                                                continue;
                                                            }
                                                            try {
                                                                var8_6 += 2;
                                                                if ((-2808009900468880739L ^ (long)var6_7 | 1L) == 0L) {
                                                                    throw new UnsupportedOperationException();
                                                                }
                                                                var7_8 = Integer.reverse(var6_7 ^ 712022506 ^ 179724670) ^ -1112321687 ^ -1112321687;
                                                            }
                                                            catch (UnsupportedOperationException v2) {
                                                                var7_8 = Integer.reverse(Integer.reverse(Integer.reverse(var6_7 ^ 712022506 ^ 179724670)));
                                                            }
                                                            var8_6 += 4;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(1996145367 ^ var6_7, 17) - 1824208708) * 1996145367;
                                                        var7_8 = Integer.reverse(Integer.reverse(Integer.reverse(var6_7 ^ 693351545 ^ 179724670)));
                                                        (Integer.rotateLeft(307890996 ^ var6_7, 5) - 1027930759) * 307890997;
                                                        try {
                                                            var8_6 += 2;
                                                            if ((2861345960082311025L ^ (long)var6_7 | 1L) == 0L) {
                                                                throw new ArithmeticException();
                                                            }
                                                            var7_8 = Integer.reverse(var6_7 ^ 604987467 ^ 179724670) ^ 1929750530 ^ 1929750530;
                                                        }
                                                        catch (ArithmeticException v3) {
                                                            var7_8 = Integer.reverse(var6_7 ^ 604987467 ^ 179724670) ^ 351850706 ^ 351850706;
                                                        }
                                                        continue;
                                                    }
                                                    (Integer.rotateRight(-532189602 ^ var6_7, 15) - 755235997) * -532189601;
                                                    var7_8 = Integer.reverse(var6_7 ^ -877371762 ^ 179724670) + -1914979996 - -1914979996;
                                                    Integer.rotateLeft(857836585 ^ var6_7, 9) + 896374834;
                                                    (int)(-1039449619029497009L ^ (long)var6_7 ^ -5091175230282903817L);
                                                    var7_8 = Integer.reverse(var6_7 ^ 830324856 ^ 179724670);
                                                    (Integer.rotateLeft(-1942261988 ^ var6_7, 4) - -7335009) * -1942261987;
                                                    var7_8 = Integer.reverse(var6_7 ^ 604987467 ^ 179724670) + 582505321 - 582505321;
                                                    --var8_6;
                                                    continue;
                                                }
                                                (Integer.rotateRight(1250396247 ^ var6_7, 12) - 180822468) * 1250396247;
                                                var7_8 = Integer.reverse(Integer.reverse(Integer.reverse(var6_7 ^ 1301580285 ^ 179724670)));
                                                (Integer.rotateLeft(862435197 ^ var6_7, 9) - 1038931806) * 862435197;
                                                (int)(-1020881977192682673L ^ (long)var6_7 ^ -3463123964988469637L);
                                                (int)(8101547615481348162L ^ (long)var6_7 ^ 590820273157262605L);
                                                var7_8 = Integer.reverse(var6_7 ^ 1391148088 ^ 179724670) + -213327769 - -213327769;
                                                (int)(-4865651731422857913L ^ (long)var6_7 ^ -8466790120468982494L);
                                                var7_8 = (int)((long)Integer.reverse(var6_7 ^ 604987467 ^ 179724670) ^ 7465288928058030289L ^ 7465288928058030289L);
                                                var8_6 -= 2;
                                                continue;
                                            }
                                            (Integer.rotateLeft(1565785489 ^ var6_7, 14) + 1367954378) * 1565785489;
                                            (int)(-6926162753051366577L ^ (long)var6_7 ^ 6496586610941399571L);
                                            var7_8 = Integer.reverse(var6_7 ^ -1834595011 ^ 179724670) ^ -361676068 ^ -361676068;
                                            Integer.rotateLeft(-1964481696 ^ var6_7, 4) + -696145957;
                                            var7_8 = (int)((long)Integer.reverse(var6_7 ^ 604987467 ^ 179724670) ^ -7061950081018784973L ^ -7061950081018784973L);
                                            var8_6 += 5;
                                            continue;
                                        }
                                        Integer.rotateLeft(736928677 ^ var6_7, 8) - 1443196982;
                                        (int)(-1630851067907085489L ^ (long)var6_7 ^ -1855338898017190035L);
                                        try {
                                            if ((-3907259887249631123L ^ (long)var6_7 | 1L) == 0L) {
                                                throw new IllegalArgumentException();
                                            }
                                            var7_8 = Integer.reverse(var6_7 ^ 604987467 ^ 179724670) ^ 1147808310 ^ 1147808310;
                                        }
                                        catch (IllegalArgumentException v4) {
                                            var7_8 = Integer.reverse(var6_7 ^ 604987467 ^ 179724670) + 1325100002 - 1325100002;
                                        }
                                        var8_6 -= 5;
                                        continue;
                                    }
                                    (Integer.rotateRight(1318431159 ^ var6_7, 12) - -2005062556) * 1318431159;
                                    try {
                                        if ((-7691685908897811139L ^ (long)var6_7 | 1L) == 0L) {
                                            throw new IllegalStateException();
                                        }
                                        var7_8 = Integer.reverse(var6_7 ^ 604987467 ^ 179724670);
                                    }
                                    catch (IllegalStateException v5) {
                                        var7_8 = Integer.reverse(var6_7 ^ 604987467 ^ 179724670);
                                    }
                                    ++var8_6;
                                    continue;
                                }
                                (Integer.rotateLeft(1201265176 ^ var6_7, 11) + -1342240733) * 1201265177;
                                var7_8 = Integer.reverse(var6_7 ^ 1203961738 ^ 179724670) + -1710556536 - -1710556536;
                                Integer.rotateLeft(124504140 ^ var6_7, 3) - -362094481;
                                try {
                                    var8_6 += 3;
                                    if ((4447083942938421095L ^ (long)var6_7 | 1L) == 0L) {
                                        throw new ArithmeticException();
                                    }
                                    var7_8 = Integer.reverse(var6_7 ^ 604987467 ^ 179724670) ^ -1243294869 ^ -1243294869;
                                }
                                catch (ArithmeticException v6) {
                                    var7_8 = Integer.reverse(var6_7 ^ 604987467 ^ 179724670) + -1420358338 - -1420358338;
                                }
                                var8_6 -= 4;
                                continue;
                            }
                            Integer.rotateLeft(-2059865848 ^ var6_7, 3) + 641912627;
                            try {
                                ++var8_6;
                                if ((-8270124833082842387L ^ (long)var6_7 | 1L) == 0L) {
                                    throw new NoSuchElementException();
                                }
                                var7_8 = Integer.reverse(Integer.reverse(Integer.reverse(var6_7 ^ 604987467 ^ 179724670)));
                            }
                            catch (NoSuchElementException v7) {
                                var7_8 = Integer.reverse(Integer.reverse(Integer.reverse(var6_7 ^ 604987467 ^ 179724670)));
                            }
                            ++var8_6;
                            continue;
                        }
                        (Integer.rotateLeft(-800933155 ^ var6_7, 13) - 1014120446) * -800933155;
                        (int)(1364613640066755407L ^ (long)var6_7 ^ -3120850393308231631L);
                        var7_8 = (int)((long)Integer.reverse(var6_7 ^ 604987467 ^ 179724670) ^ 5187348262207859781L ^ 5187348262207859781L);
                        Integer.rotateRight(-1470119413 ^ var6_7, 8) + 1744182928;
                        continue;
                    }
                    (Integer.rotateLeft(-913492840 ^ var6_7, 12) + 1819737507) * -913492839;
                    var7_8 = Integer.reverse(Integer.reverse(Integer.reverse(var6_7 ^ 12278733 ^ 179724670)));
                    (Integer.rotateRight(749579602 ^ var6_7, 8) + 1835375657) * 749579603;
                    var7_8 = (int)((long)Integer.reverse(var6_7 ^ 1917541703 ^ 179724670) ^ -8682288157303852627L ^ -8682288157303852627L);
                    (Integer.rotateLeft(1191023132 ^ var6_7, 11) - -1659744097) * 1191023133;
                    var7_8 = Integer.reverse(var6_7 ^ 604987467 ^ 179724670) ^ 1600301077 ^ 1600301077;
                    var8_6 += 2;
                    continue;
                }
                (Integer.rotateRight(-830658054 ^ var6_7, 12) + 92648577) * -830658053;
                var7_8 = (int)((long)Integer.reverse(var6_7 ^ -634193290 ^ 179724670) ^ 1814562443011371413L ^ 1814562443011371413L);
                Integer.rotateLeft(-1812332600 ^ var6_7, 5) + -274491277;
                try {
                    var7_8 = Integer.reverse(Integer.reverse(Integer.reverse(var6_7 ^ 604987467 ^ 179724670)));
                }
                catch (UnsupportedOperationException v8) {
                    var7_8 = Integer.reverse(var6_7 ^ 604987467 ^ 179724670);
                }
                var8_6 -= 2;
                continue;
            }
            return var5_5;
lbl242:
            // 6 sources

            (Integer.rotateRight(-1729449990 ^ var6_7, 6) + -2000097663) * -1729449989;
            var7_8 = (int)((long)Integer.reverse(var6_7 ^ 604987467 ^ 179724670) ^ -6549519930436983275L ^ -6549519930436983275L);
        }
    }

    private int rm(int n, float f) {
        int n2 = bzt_4.dhsh_3(-647723861);
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (n2 = Integer.rotateLeft(n ^ n2, 24)) ^ 0x1908E41D;
        if ((n3 ^ n2) != 420013085) {
            int cfr_ignored_0 = (Integer.rotateRight(0xC06C60B6 ^ n2, 11) - 1367168325) * -1066639177;
        }
        Color color = new Color(n);
        int n4 = Math.min(-251013279 + 251013534, bjl.sys_4(0, (int)((float)color.getRed() * f)));
        int n5 = bjl.thaa(Integer.reverse(2137297158) ^ 0x60892601, bjl.sfb_2(0, (int)((float)color.getGreen() / f)));
        int n6 = Math.min(Integer.reverse(-1017055722) ^ 0x686F063C, Math.max(0, (int)((float)color.getBlue() / f)));
        return new Color(n4, n5, n6, color.getAlpha()).getRGB();
    }

    private void btk(bbgh bbgh2) {
        try {
            int n = -1658819091;
            n = Integer.rotateLeft(n * 980357447, 17) ^ 0x54A172FA;
            int n2 = n ^ 0x106203ED;
            if ((n2 ^ n) != 274858989) {
                int cfr_ignored_0 = (0x8D426E00 ^ n) - 739229044;
            }
            if ((0x1FE & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        this.zkgh(bbgh2.dtn().method_51448(), bbgh2.bhw());
    }

    private static String tshs_3(String string, int n, int n2, int n3) {
        int n4 = 1317846986;
        n4 = Integer.rotateLeft(n4 * -163516545, 17) ^ 0xBFEAFB33;
        String string2 = string;
        n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 18);
        int n5 = (n4 = n3 ^ n4) ^ 0x712DC72A;
        if ((n5 ^ n4) != 1898825514) {
            int cfr_ignored_0 = (0x3FA178E0 ^ n4) - -1225681543;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xCDD94462) + i ^ hzl_2, 25) ^ n2 + khkj));
        }
        return new String(cArray);
    }

    private static int sys_4(int n, int n2) {
        block0: {
            int n3 = 1505730160;
            n3 = Integer.rotateLeft(n3 * -835161259, 14) ^ 0xC98F6A05;
            n3 = Integer.rotateRight(n ^ n3, 15);
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 24)) ^ 0x40474638;
            if ((n4 ^ n3) == 1078412856) break block0;
            int cfr_ignored_0 = (0x19F8D848 ^ n3) - 1613805300;
        }
        return Math.max(n, n2);
    }

    private static int sfb_2(int n, int n2) {
        block0: {
            int n3 = 91809453;
            int n4 = (n3 = Integer.rotateLeft(n3 * 1394075993, 4) ^ 0xCDB143FE) ^ 0xAD4CB6C8;
            if ((n4 ^ n3) == -1387481400) break block0;
            int cfr_ignored_0 = (0xA8345065 ^ n3) - -964284766;
        }
        return Math.max(n, n2);
    }

    private static int thaa(int n, int n2) {
        block0: {
            int n3 = 1577278598;
            n3 = Integer.rotateLeft(n3 * 1893754619, 25) ^ 0x5FBE98F;
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 7)) ^ 0xFFCF2967;
            if ((n4 ^ n3) == -3200665) break block0;
            int cfr_ignored_0 = (0xA1CC75E1 ^ n3) - -2076385240;
        }
        return Math.min(n, n2);
    }

    private static String[] ztsh_2(String string) {
        int n = -900286380;
        n = Integer.rotateLeft(n * 541863465, 9) ^ 0xC8EA938;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 20);
        int n2 = n ^ 0xE1D8CEDD;
        if ((n2 ^ n) != -505884963) {
            int cfr_ignored_0 = (0x2B8E7689 ^ n) + 1441660105;
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

    private static CallSite zhf_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -205202470;
            n3 = Integer.rotateLeft(n3 * 1430387151, 22) ^ 0xEFA15464;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xD9BC1DE2;
            if ((n4 ^ n3) != -641983006) {
                int cfr_ignored_0 = (0x2A78C638 ^ n3) - 500174781;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bqh_2 ^ string.hashCode()) + (n2 + tkhs_2) + i ^ bqh_2, 22) + tkhs_2);
            }
            String[] stringArray = bjl.ztsh_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType3) : lookup.findVirtual(clazz, stringArray[0], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ykbwyd8tu86tv(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite l8e2y1sn252(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ qn9bo3rk7757 ^ string.hashCode() ^ n2 + e5tmm9vlbxt4 ^ i * 1442697821 ^ qn9bo3rk7757, 14) ^ e5tmm9vlbxt4));
            }
            String[] stringArray = bjl.ykbwyd8tu86tv(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

