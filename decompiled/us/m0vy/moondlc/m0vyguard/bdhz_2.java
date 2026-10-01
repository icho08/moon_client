/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;
import net.minecraft.class_1309;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bghdh;
import us.m0vy.moondlc.m0vyguard.bmd_2;
import us.m0vy.moondlc.m0vyguard.ttkh;
import us.m0vy.moondlc.m0vyguard.lb;

public class bdhz_2
implements bmd_2 {
    private final float[] thnn = new float[Integer.rotateLeft(0xEE7DBBFB ^ 0x1E7DBBFB, 5)];
    private int shthk = 0;
    private int ztht_2 = 0;
    private int rmf = 0;
    private final Random hts_2 = new Random();
    private static final int skhdh = -800397525;
    private static final int khrj = 1668557835;
    private static final int zocigugtri = -120518120;
    private static final int mwodk2oboo7 = -554499736;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int s3mop0ax2lov31;

    public bdhz_2() {
        this.tf();
    }

    @Override
    public lb ysh(lb lb2, lb lb3, class_1309 class_13092, boolean bl, boolean bl2) {
        boolean bl3;
        if (lb2 == null || lb3 == null) {
            return lb2 != null ? lb2 : lb3;
        }
        System.arraycopy(this.thnn, 0, this.thnn, 1, 29);
        this.thnn[0] = lb3.khdhd_2();
        ++this.shthk;
        if (bl) {
            this.rmf = 2;
        } else if (this.rmf > 0) {
            --this.rmf;
        }
        float f = (float)(bdhz_2.mc.field_1724 != null ? bdhz_2.mc.field_1724.field_6012 : 0) + (mc.method_61966() != null ? mc.method_61966().method_60637(false) : 0.0f);
        float f2 = (float)(Math.sin((double)f * 0.4000000008323731) * 3.0 + Math.sin((double)f * 0.9500002390239708 + 1.4000004888461306) * 2.0);
        float f3 = (float)(Math.cos((double)f * 0.5 + 0.7000001555309916) * 0.5 + Math.cos((double)f * 0.7800000620494261 + 3.10000031689524) * 1.5);
        int n = class_3532.method_15340((int)(10 - this.shthk), (int)0, (int)29);
        float f4 = this.thnn[n] + f3 * 1.5f;
        float f5 = this.hsl_2(lb2.khdhd_2(), f4, this.dkb_2(0.1f, 0.5f));
        float f6 = this.hsl_2(lb2.sry(), lb3.sry() + f2, this.dkb_2(0.1f, 0.4f));
        boolean bl4 = bl3 = bl || this.rmf > 0;
        if (bl3) {
            if (!bl2) {
                f6 = lb3.sry();
                f5 = lb3.khdhd_2();
            }
            f2 = class_3532.method_15363((float)f2, (float)-0.05f, (float)0.05f);
            f3 = class_3532.method_15363((float)f3, (float)-0.05f, (float)0.05f);
        }
        if (this.shthk <= 4 && this.ztht_2 % 2 == 0 && bdhz_2.mc.field_1724 != null && !bl) {
            f6 = bdhz_2.mc.field_1724.method_36454();
        }
        if (bl) {
            ++this.ztht_2;
            this.shthk = 0;
        }
        float f7 = f6 + f2;
        float f8 = class_3532.method_15363((float)(f5 + f3), (float)-90.0f, (float)90.0f);
        return new lb(f7, f8);
    }

    private float hsl_2(float f, float f2, float f3) {
        int n = -556481366;
        n = Integer.rotateLeft(n * 1017831573, 23) ^ 0x130167F;
        n = Float.floatToIntBits(f) ^ n;
        n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 13);
        int n2 = n ^ 0x9C714F39;
        if ((n2 ^ n) != -1670295751) {
            int cfr_ignored_0 = (0x42A58B93 ^ n) - 914171589;
        }
        float f4 = class_3532.method_15363((float)f3, (float)0.0f, (float)1.0f);
        float f5 = bghdh.ttb_2(f, f2);
        if (bdhz_2.hjf(f5) < Float.intBitsToFloat(0xFE7B1CB1 ^ 0xC17B1CB1)) {
            return f2;
        }
        float f6 = f + f5 * f4;
        float f7 = this.bmz_2(f, f6);
        float f8 = bdhz_2.zthkh_2(f7, f2);
        return Math.abs(f8) < Float.intBitsToFloat(Integer.rotateLeft(0x7A0B0AB0 ^ 0x820B0AB1, 29)) ? f2 : f7;
    }

    /*
     * Unable to fully structure code
     */
    private float bmz_2(float var1_1, float var2_2) {
        var3_3 = 0.0f;
        var4_4 = 0.0f;
        var5_5 = 0;
        var6_6 = 0.0f;
        var9_7 = 0;
        var7_8 = -813564551;
        var7_8 = Integer.rotateLeft(var7_8 * -1756110373, 9) ^ -1887627089;
        var8_9 = (var7_8 ^ 1026989995) + 1523230956 - 1523230956;
        while (true) {
            block54: {
                block49: {
                    block55: {
                        block48: {
                            block52: {
                                block44: {
                                    block50: {
                                        block46: {
                                            block43: {
                                                block47: {
                                                    block42: {
                                                        block41: {
                                                            block51: {
                                                                block45: {
                                                                    block53: {
                                                                        var9_7 = var8_9 ^ var7_8;
                                                                        switch (var9_7 & 7) {
                                                                            case 4: {
                                                                                if (var9_7 != 1371240908) {
                                                                                    ** break;
                                                                                }
                                                                                break block41;
                                                                            }
                                                                            case 6: {
                                                                                if (var9_7 == 1689335998) break block42;
                                                                                if (var9_7 != -1039055338) {
                                                                                    ** break;
                                                                                }
                                                                                break block43;
                                                                            }
                                                                            case 7: {
                                                                                if (var9_7 == 1991559575) break block44;
                                                                                if (var9_7 == 1186019191) break block45;
                                                                                if (var9_7 != 1122588679) {
                                                                                    ** break;
                                                                                }
                                                                                break block46;
                                                                            }
                                                                            case 2: {
                                                                                if (var9_7 == 570357530) break block47;
                                                                                if (var9_7 != 548014362) {
                                                                                    ** break;
                                                                                }
                                                                                break block48;
                                                                            }
                                                                            case 3: {
                                                                                if (var9_7 == 1012475699) break block49;
                                                                                if (var9_7 == 1487815419) break;
                                                                                if (var9_7 == 306507987) break block50;
                                                                                if (var9_7 == 1026989995) break block51;
                                                                                if (var9_7 != -946016477) {
                                                                                    ** break;
                                                                                }
                                                                                break block52;
                                                                            }
                                                                            case 1: {
                                                                                if (var9_7 != 111212177) {
                                                                                    ** break;
                                                                                }
                                                                                break block53;
                                                                            }
                                                                            case 0: {
                                                                                if (var9_7 != 858274192) {
                                                                                    ** break;
                                                                                }
                                                                                break block54;
                                                                            }
                                                                            case 5: {
                                                                                if (var9_7 != 321528317) {
                                                                                    ** break;
                                                                                }
                                                                                break block55;
                                                                            }
                                                                        }
                                                                        (Integer.rotateLeft(1886045749 ^ var7_8, 17) - -1588879450) * 1886045749;
                                                                        (int)(-5559579355751584945L ^ (long)var7_8 ^ 3269757477930453089L);
                                                                        if (!Float.isFinite(var3_3)) {
                                                                            (int)(-4568248764670062779L ^ (long)var7_8 ^ 6816000954566716645L);
                                                                            var8_9 = var7_8 ^ -810257419;
                                                                            (int)(718515701221654084L ^ (long)var7_8 ^ -6844718246534332896L);
                                                                            var8_9 = Integer.reverse(Integer.reverse(var7_8 ^ 111212177));
                                                                            var9_7 -= 3;
                                                                            continue;
                                                                        }
                                                                        (int)(-5085704056967036849L ^ (long)var7_8 ^ 1965042632719130374L);
                                                                        var8_9 = var7_8 ^ -1697414641;
                                                                        (int)(-1705959505922084083L ^ (long)var7_8 ^ -8012840436756611721L);
                                                                        var8_9 = var7_8 ^ 1186019191 ^ -564274448 ^ -564274448;
                                                                        continue;
                                                                    }
                                                                    (Integer.rotateRight(1082924474 ^ var7_8, 11) + -715835199) * 1082924475;
                                                                    var6_6 = var2_2;
                                                                    var8_9 = var7_8 ^ 2112408057;
                                                                    (Integer.rotateLeft(-1924937264 ^ var7_8, 4) + 529731435) * -1924937263;
                                                                    var8_9 = Integer.reverse(Integer.reverse(var7_8 ^ 858274192));
                                                                    var9_7 -= 5;
                                                                    continue;
                                                                }
                                                                Integer.rotateLeft(-72112147 ^ var7_8, 18) - 2132735214;
                                                                (int)(4107575124764715855L ^ (long)var7_8 ^ -1238345749067341869L);
                                                                var4_4 = var2_2 - var1_1;
                                                                var5_5 = Math.round(var4_4 / var3_3);
                                                                var6_6 = var1_1 + (float)var5_5 * var3_3;
                                                                try {
                                                                    if ((586348983113237697L ^ (long)var7_8 | 1L) == 0L) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                    var8_9 = (int)((long)(var7_8 ^ 858274192) ^ 2492769312297815570L ^ 2492769312297815570L);
                                                                }
                                                                catch (IllegalStateException v0) {
                                                                    var8_9 = (int)((long)(var7_8 ^ 858274192) ^ -1285880577280744354L ^ -1285880577280744354L);
                                                                }
                                                                continue;
                                                            }
                                                            (Integer.rotateRight(630683799 ^ var7_8, 7) - -1850394236) * 630683799;
                                                            var3_3 = bghdh.ryz();
                                                            if (var3_3 <= Float.intBitsToFloat(-2049135677 - 1347843078)) {
                                                                var8_9 = (var7_8 ^ 53397869) + -1034014123 - -1034014123;
                                                                Integer.rotateLeft(-1992677215 ^ var7_8, 4) + -1570207046;
                                                                (int)(5442748154918529871L ^ (long)var7_8 ^ -1132511157824177472L);
                                                                var8_9 = (int)((long)(var7_8 ^ 111212177) ^ -9067369739621054779L ^ -9067369739621054779L);
                                                                var9_7 += 5;
                                                                continue;
                                                            }
                                                            try {
                                                                --var9_7;
                                                                if ((1629581005189895433L ^ (long)var7_8 | 1L) == 0L) {
                                                                    throw new NoSuchElementException();
                                                                }
                                                                var8_9 = (var7_8 ^ 1487815419) + 2045522816 - 2045522816;
                                                            }
                                                            catch (NoSuchElementException v1) {
                                                                var8_9 = (int)((long)(var7_8 ^ 1487815419) ^ 769666405637934812L ^ 769666405637934812L);
                                                            }
                                                            var9_7 += 5;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(466149856 ^ var7_8, 6) + 1638988123;
                                                        var8_9 = (var7_8 ^ 1026989995) + 531559847 - 531559847;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(470466097 ^ var7_8, 6) + 1772791594) * 470466097;
                                                    (int)(-2398149157180871857L ^ (long)var7_8 ^ -2492598245290143583L);
                                                    (int)(-6660833362289278765L ^ (long)var7_8 ^ 1423478234124708558L);
                                                    var8_9 = var7_8 ^ 1026989995;
                                                    var9_7 += 4;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(-223029323 ^ var7_8, 17) - 1749270054) * -223029323;
                                                (int)(3460586989371583311L ^ (long)var7_8 ^ 1035972062754754013L);
                                                var8_9 = Integer.reverse(Integer.reverse(var7_8 ^ 1401344031));
                                                (Integer.rotateRight(-1925615010 ^ var7_8, 4) - 508721309) * -1925615009;
                                                try {
                                                    var9_7 -= 3;
                                                    if ((8685543587479766373L ^ (long)var7_8 | 1L) == 0L) {
                                                        throw new UnsupportedOperationException();
                                                    }
                                                    var8_9 = (int)((long)(var7_8 ^ 1026989995) ^ 5502297577728641447L ^ 5502297577728641447L);
                                                }
                                                catch (UnsupportedOperationException v2) {
                                                    var8_9 = var7_8 ^ 1026989995 ^ 2069773226 ^ 2069773226;
                                                }
                                                continue;
                                            }
                                            Integer.rotateRight(-891544666 ^ var7_8, 12) - -1794836395;
                                            (int)(-4190762726972316017L ^ (long)var7_8 ^ 3058239983094081151L);
                                            var8_9 = Integer.reverse(Integer.reverse(var7_8 ^ 115466929));
                                            (int)(-711557199169418805L ^ (long)var7_8 ^ -1617239806504320623L);
                                            var8_9 = var7_8 ^ 1026989995 ^ -1446863639 ^ -1446863639;
                                            --var9_7;
                                            continue;
                                        }
                                        Integer.rotateLeft(-1633131131 ^ var7_8, 6) - 985786966;
                                        (int)(6636840992686533455L ^ (long)var7_8 ^ 7638249116479854052L);
                                        var8_9 = (var7_8 ^ 1026989995) + 1462605295 - 1462605295;
                                        (Integer.rotateRight(-752348997 ^ var7_8, 13) + -1774737952) * -752348997;
                                        var9_7 += 4;
                                        continue;
                                    }
                                    (Integer.rotateLeft(1280506332 ^ var7_8, 12) - 1114235103) * 1280506333;
                                    try {
                                        var9_7 -= 4;
                                        if ((-4641512124703027263L ^ (long)var7_8 | 1L) == 0L) {
                                            throw new ArithmeticException();
                                        }
                                        var8_9 = (int)((long)(var7_8 ^ 1026989995) ^ -2476496696964811948L ^ -2476496696964811948L);
                                    }
                                    catch (ArithmeticException v3) {
                                        var8_9 = (var7_8 ^ 1026989995) + -1265530722 - -1265530722;
                                    }
                                    var9_7 += 4;
                                    continue;
                                }
                                (Integer.rotateLeft(-1157162819 ^ var7_8, 10) - -1439064546) * -1157162819;
                                (int)(8770116510914243407L ^ (long)var7_8 ^ -8038781186396823878L);
                                var8_9 = var7_8 ^ -1509395086;
                                Integer.rotateRight(938570055 ^ var7_8, 9) - -895854892;
                                var8_9 = var7_8 ^ 1026989995;
                                var9_7 -= 4;
                                continue;
                            }
                            Integer.rotateRight(-1599896186 ^ var7_8, 7) - 2016070261;
                            var8_9 = var7_8 ^ 232240027 ^ 434849213 ^ 434849213;
                            Integer.rotateRight(253079279 ^ var7_8, 4) - -671232468;
                            try {
                                var9_7 += 3;
                                if ((-5361746087830231773L ^ (long)var7_8 | 1L) == 0L) {
                                    throw new ArithmeticException();
                                }
                                var8_9 = var7_8 ^ 1026989995;
                            }
                            catch (ArithmeticException v4) {
                                var8_9 = (var7_8 ^ 1026989995) + 66211245 - 66211245;
                            }
                            continue;
                        }
                        (Integer.rotateLeft(1466605048 ^ var7_8, 13) + -1706639293) * 1466605049;
                        try {
                            --var9_7;
                            var8_9 = (int)((long)(var7_8 ^ 1026989995) ^ 5577989306428232065L ^ 5577989306428232065L);
                        }
                        catch (ArithmeticException v5) {
                            var8_9 = (int)((long)(var7_8 ^ 1026989995) ^ 7268809237409275297L ^ 7268809237409275297L);
                        }
                        var9_7 -= 3;
                        continue;
                    }
                    (Integer.rotateRight(-1852394410 ^ var7_8, 5) - -1516407387) * -1852394409;
                    var8_9 = (int)((long)(var7_8 ^ -93479698) ^ 4102983794106315249L ^ 4102983794106315249L);
                    Integer.rotateLeft(-269174647 ^ var7_8, 16) + 318765010;
                    (int)(3262319943094692687L ^ (long)var7_8 ^ -3451864965919934627L);
                    try {
                        ++var9_7;
                        if ((8319680791694653095L ^ (long)var7_8 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var8_9 = var7_8 ^ 1026989995 ^ 109868703 ^ 109868703;
                    }
                    catch (IllegalArgumentException v6) {
                        var8_9 = var7_8 ^ 1026989995;
                    }
                    var9_7 += 3;
                    continue;
                }
                Integer.rotateRight(-1516773725 ^ var7_8, 7) + 297899256;
                var8_9 = var7_8 ^ -713894348;
                (Integer.rotateRight(1380842811 ^ var7_8, 13) + -70301344) * 1380842811;
                var8_9 = (var7_8 ^ 1026989995) + -231915892 - -231915892;
                var9_7 -= 3;
                continue;
            }
            return var6_6;
lbl253:
            // 9 sources

            (Integer.rotateRight(-2083769958 ^ var7_8, 3) + -99114783) * -2083769957;
            var8_9 = (int)((long)(var7_8 ^ 1026989995) ^ 8668803319928202040L ^ 8668803319928202040L);
        }
    }

    private float dkb_2(float f, float f2) {
        block0: {
            int n = 1567630409;
            n = Integer.rotateLeft(n * -911870435, 16) ^ 0x8B8D44C8;
            n = System.identityHashCode(this) ^ n;
            n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 20);
            int n2 = n ^ 0xDC0F092D;
            if ((n2 ^ n) == -602994387) break block0;
            int cfr_ignored_0 = (0x817F2D64 ^ n) - -1194789598;
        }
        return f + this.hts_2.nextFloat() * (f2 - f);
    }

    @Override
    public int hbdh(lb lb2, lb lb3) {
        if (lb2 == null || lb3 == null) {
            return 0;
        }
        float f = Math.abs(bghdh.ttb_2(lb2.sry(), lb3.sry()));
        float f2 = Math.abs(lb3.khdhd_2() - lb2.khdhd_2());
        int n = (int)Math.ceil(Math.max(f / 45.0f, f2 / 25.0f));
        return class_3532.method_15340((int)n, (int)0, (int)8);
    }

    @Override
    public float shgh_3() {
        block0: {
            int n = 160578600;
            n = Integer.rotateLeft(n * 541635639, 8) ^ 0x89FCBB84;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x73D919D9;
            if ((n2 ^ n) == 1943607769) break block0;
            int cfr_ignored_0 = (0x7A4B25F1 ^ n) - 1998094467;
        }
        return bdhz_2.tft_4(-787525772 + 1898229900);
    }

    @Override
    public float hghs() {
        block0: {
            int n = ttkh.bqh_2(-2046830526);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x35C24590;
            if ((n2 ^ n) == 901924240) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xB03D9DD2 ^ n, 9) + 1540602793) * -1338139181;
        }
        return bdhz_2.dash_3(0xD04E3CA4 ^ 0x91863CA4);
    }

    @Override
    public void tf() {
        int n = ttkh.bqh_2(-544216129);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 9);
        int n2 = n ^ 0x3401FBC0;
        if ((n2 ^ n) != 872545216) {
            int cfr_ignored_0 = (Integer.rotateRight(0xEB8E107F ^ n, 16) - -1970168164) * -343011201;
        }
        float f = bdhz_2.mc.field_1724 != null ? bdhz_2.mc.field_1724.method_36455() : 0.0f;
        Arrays.fill(this.thnn, f);
        this.shthk = 0;
        this.ztht_2 = 0;
        this.rmf = 0;
    }

    @Override
    public void mgh(class_1309 class_13092) {
        int n = ttkh.bqh_2(-1196870204);
        n = System.identityHashCode(this) ^ n;
        class_1309 class_13093 = class_13092;
        n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
        int n2 = n ^ 0x2A9E1D49;
        if ((n2 ^ n) != 715005257) {
            int cfr_ignored_0 = Integer.rotateLeft(0x9237288D ^ n, 5) - -1190426546;
            int cfr_ignored_1 = (int)(0x508586B027D4EB4FL ^ (long)n ^ 0xF010831A2DB90CDAL);
        }
        float f = bdhz_2.mc.field_1724 != null ? bdhz_2.mc.field_1724.method_36455() : 0.0f;
        Arrays.fill(this.thnn, f);
        this.shthk = 0;
    }

    private static float hjf(float f) {
        block0: {
            int n = 1984657154;
            n = Integer.rotateLeft(n * -1701459485, 9) ^ 0x60BA09D8;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x78177701;
            if ((n2 ^ n) == 2014803713) break block0;
            int cfr_ignored_0 = (0xE5C0003 ^ n) - -1917776145;
        }
        return Math.abs(f);
    }

    private static float zthkh_2(float f, float f2) {
        block0: {
            int n = 980323314;
            n = Integer.rotateLeft(n * -580287811, 22) ^ 0xCC44B9ED;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 20);
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0xCFE5B35;
            if ((n2 ^ n) == 217996085) break block0;
            int cfr_ignored_0 = (0x3690D0C7 ^ n) + -1812012105;
        }
        return bghdh.ttb_2(f, f2);
    }

    private static float tft_4(int n) {
        block0: {
            int n2 = -1030922870;
            int n3 = (n2 = Integer.rotateLeft(n2 * -704119211, 7) ^ 0x848C2175) ^ 0xC1394A78;
            if ((n3 ^ n2) == -1053209992) break block0;
            int cfr_ignored_0 = (0x3B417F2 ^ n2) + 202671810;
        }
        return Float.intBitsToFloat(n);
    }

    private static float dash_3(int n) {
        block0: {
            int n2 = -753608030;
            n2 = Integer.rotateLeft(n2 * 732392413, 6) ^ 0x392E5B22;
            int n3 = (n2 = n ^ n2) ^ 0x28542DC4;
            if ((n3 ^ n2) == 676605380) break block0;
            int cfr_ignored_0 = (0xFB40F766 ^ n2) - 1674210040;
        }
        return Float.intBitsToFloat(n);
    }

    private static String[] ghkhh(String string) {
        int n = -1540310464;
        n = Integer.rotateLeft(n * 2023936163, 19) ^ 0xAAF5378C;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xF420CC4B;
        if ((n2 ^ n) != -199177141) {
            int cfr_ignored_0 = (0x5010760B ^ n) + -1768646460;
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

    private static CallSite arn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1220605577;
            n3 = Integer.rotateLeft(n3 * -2069931833, 27) ^ 0x2834434F;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 23);
            int n4 = n3 ^ 0xCF467A36;
            if ((n4 ^ n3) != -817464778) {
                int cfr_ignored_0 = (0x87868CBF ^ n3) + 550363453;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ skhdh ^ string.hashCode()) + (n2 + khrj) + i ^ skhdh, 12) + khrj);
            }
            String[] stringArray = bdhz_2.ghkhh(new String(cArray));
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

    private static String[] qs4oq01qe6xms(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite p3y9cvsn0xb(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ zocigugtri ^ string.hashCode()) + (n2 + mwodk2oboo7) + i ^ zocigugtri, 28) + mwodk2oboo7);
            }
            String[] stringArray = bdhz_2.qs4oq01qe6xms(new String(cArray));
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

