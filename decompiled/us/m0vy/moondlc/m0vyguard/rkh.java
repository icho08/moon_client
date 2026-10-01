/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1296
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1421
 *  net.minecraft.class_1657
 *  net.minecraft.class_1937
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_7833
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1296;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1421;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bbd_2;
import us.m0vy.moondlc.m0vyguard.bdhz;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzz_3;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bkdh;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.ksh;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.ny;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Hit Marker", category=bzw.OTHER, desc="Draws a cube attached to the hit position")
public class rkh
extends bnq {
    private final khd thmb = new khd(this, "Style");
    private final fy hnl = new fy(this.thmb, "Filled");
    private final fy tdr_2 = new fy(this.thmb, "Outline");
    private final fy shah_3 = new fy(this.thmb, "Mixed").rhh_3();
    private final khd jrz = new khd(this, "Color");
    private final fy shsz = new fy(this.jrz, "Theme").rhh_3();
    private final fy jhf_2 = new fy(this.jrz, "Custom");
    private final fy dhshsh = new fy(this.jrz, "Rainbow");
    private final bbd_2 khzkh_2 = new bbd_2(this, "Targets");
    private final s_3 rjb = new s_3(this.khzkh_2, "Players").thst();
    private final s_3 rzl_2 = new s_3(this.khzkh_2, "Mobs").thst();
    private final s_3 bza_2 = new s_3(this.khzkh_2, "Animals").thst();
    private final bzw_2 tghh = new bzw_2(this, "Custom Color", this::thza_2).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-1732066992) ^ 0x49FC4319), Float.intBitsToFloat(Integer.rotateLeft(0x3E31AB2B ^ 0x1F6BAB2B, 1)), Float.intBitsToFloat(1374626893 - 251601997), Float.intBitsToFloat(962262981 + 170133563)));
    private final tay bdb = new tay(this, "Lifetime").shth_7(Float.intBitsToFloat(449916220 + 675599044)).dhbs_2(Float.intBitsToFloat(-1968267392 + -1165172608)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xB112C82E ^ 0x2112C8AA, 23))).ssd_5(Float.intBitsToFloat(-1209929241 - 1940287975)).ghshz_2("ms");
    private final tay rdz_3 = new tay(this, "Size").shth_7(Float.intBitsToFloat(Integer.reverse(570501270) ^ 0x5437574E)).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1568182417) ^ 0xC9F6E145)).rkh_3(Float.intBitsToFloat(0x61D26F0E ^ 0x5DF1B804)).ssd_5(Float.intBitsToFloat(-77036204 - -1119572406));
    private final tay thhq = new tay(this, "Grow").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xE0D5902C ^ 0xE0A8902C, 7))).rkh_3(Float.intBitsToFloat(0x18DB2906 ^ 0x24F8FE0C)).ssd_5(Float.intBitsToFloat(705344674 + 320414312));
    private final tay byz_2 = new tay(this, "Opacity").shth_7(Float.intBitsToFloat(Integer.reverse(-1345619173) ^ 0x992ED3F5)).dhbs_2(Float.intBitsToFloat(-647009754 + 1779406298)).rkh_3(Float.intBitsToFloat(0xEF1DCCD ^ 0x4E51DCCD)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x301A5C14 ^ 0xF01A5478, 19)));
    private final tay sksh = new tay((hy)this, "Outline Width", this::tzz_2).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(-2039796148 + -1173040716)).rkh_3(Float.intBitsToFloat(Integer.reverse(225250718) ^ 0x46B0B6B0)).ssd_5(Float.intBitsToFloat(0x39C83AA5 ^ 0x6083AA5));
    private final tay thmy = new tay(this, "Spin").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(0x9AD9B07A ^ 0xD96DB07A)).rkh_3(Float.intBitsToFloat(1382671961 + -298444377)).ssd_5(0.0f);
    private final badh_2 zma = new badh_2(this, "Body Ro".concat("tation")).bts(true);
    private final badh_2 ths_3 = new badh_2(this, "Random".concat(" Rotation")).bts(false);
    private final badh_2 zqh = new badh_2(this, "Throug".concat("h Walls")).bts(false);
    private final CopyOnWriteArrayList tndh = new CopyOnWriteArrayList();
    private int hbdh;
    private final bql<ksh> zta_3 = this::khwn;
    private final bql<shw_3> rzz_4 = this::dtq_4;
    private static final int bldh = 168618295;
    private static final int jghj = -1390123759;
    private static final int khza_3 = 1868390843;
    private static final int btb_2 = 479751648;
    private static final int ohe5tdj8j = -1435240069;
    private static final int v90nq0v = -607400025;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int e1zo6eug;

    @Override
    public void nc() {
        int n = bkdh.shadh_2(87794827);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
        int n2 = n ^ 0x340E8FE9;
        if ((n2 ^ n) != 873369577) {
            int cfr_ignored_0 = Integer.rotateRight(0x31352B62 ^ n, 9) + -103948263;
        }
        this.tndh.clear();
    }

    private boolean bks(class_1309 class_13092) {
        boolean bl = false;
        int n = 0;
        int n2 = 2027339736;
        n2 = Integer.rotateLeft(n2 * 723334843, 24) ^ 0xD09CD4B5;
        n2 = System.identityHashCode(this) ^ n2;
        class_1309 class_13093 = class_13092;
        n2 = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n2;
        int n3 = Integer.reverse(Integer.reverse((n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044));
        while (true) {
            block63: {
                block49: {
                    block43: {
                        block55: {
                            block60: {
                                block56: {
                                    block53: {
                                        block54: {
                                            block59: {
                                                block44: {
                                                    block47: {
                                                        block62: {
                                                            block48: {
                                                                block58: {
                                                                    block61: {
                                                                        block41: {
                                                                            block57: {
                                                                                block52: {
                                                                                    block50: {
                                                                                        block45: {
                                                                                            block46: {
                                                                                                block42: {
                                                                                                    block51: {
                                                                                                        if ((n = n3 - 1312882044 ^ 0x4E40FD7C ^ n2) == 521922775) break block41;
                                                                                                        if (n == -1556410149) break block42;
                                                                                                        int cfr_ignored_0 = (Integer.rotateRight(0xAC4C29BB ^ n2, 8) + -510219040) * -1404294725;
                                                                                                        if (n == 267194403) break block43;
                                                                                                        if (n == 1419015655) break block44;
                                                                                                        if (n == -2064612998) break block45;
                                                                                                        int cfr_ignored_1 = Integer.rotateLeft(0xEB00D5E1 ^ n2, 16) + 2037876090;
                                                                                                        int cfr_ignored_2 = (int)(0x29B27BDC27D4EB4FL ^ (long)n2 ^ 0xAC8831A2DB9FEB5L);
                                                                                                        if (n == 1420657393) break block46;
                                                                                                        if (n == -1474059600) break block47;
                                                                                                        if (n == -790843594) break block48;
                                                                                                        if (n == 1770659617) break block49;
                                                                                                        if (n == -1021474621) break block50;
                                                                                                        if (n == -1354757364) break block51;
                                                                                                        int cfr_ignored_3 = Integer.rotateLeft(0x117D9B09 ^ n2, 5) + 580085074;
                                                                                                        int cfr_ignored_4 = (int)(0xD3CF353427D4EB4FL ^ (long)n2 ^ 0x9718831A2DB80A4FL);
                                                                                                        if (n == -1686172379) break block52;
                                                                                                        if (n == 243651411) break block53;
                                                                                                        if (n == -409496522) break block54;
                                                                                                        if (n == -2134562695) break block55;
                                                                                                        if (n == 1119102519) break block56;
                                                                                                        if (n == -782120863) break block57;
                                                                                                        int cfr_ignored_5 = (Integer.rotateRight(0x6D7C80FA ^ n2, 16) + 1181826433) * 1836876027;
                                                                                                        if (n == -302102077) break block58;
                                                                                                        if (n == -1149592207) break block59;
                                                                                                        if (n == -556266413) break block60;
                                                                                                        if (n == 1040273704) break block61;
                                                                                                        if (n == 856347462) break block62;
                                                                                                        break block63;
                                                                                                    }
                                                                                                    int cfr_ignored_6 = (Integer.rotateRight(0xE9EA389A ^ n2, 16) + 1471838689) * -370526053;
                                                                                                    bl = this.bza_2.alh();
                                                                                                    n3 = (n2 ^ 0x19771351 ^ 0x4E40FD7C) + 1312882044 + 24950703 - 24950703;
                                                                                                    int cfr_ignored_7 = (Integer.rotateRight(0xB3A580F7 ^ n2, 9) - -983024348) * -1280999177;
                                                                                                    n3 = (int)((long)((n2 ^ 0x698A1F21 ^ 0x4E40FD7C) + 1312882044) ^ 0x323047D9B3909E8BL ^ 0x323047D9B3909E8BL);
                                                                                                    n -= 2;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_8 = Integer.rotateRight(0xA9A6B50B ^ n2, 8) + -1886549104;
                                                                                                if (!(class_13092 instanceof class_1421)) {
                                                                                                    try {
                                                                                                        if ((0xFE837370E496EBD3L ^ (long)n2 | 1L) == 0L) {
                                                                                                            throw new UnsupportedOperationException();
                                                                                                        }
                                                                                                        n3 = (n2 ^ 0xD161C861 ^ 0x4E40FD7C) + 1312882044 + -1163634389 - -1163634389;
                                                                                                    }
                                                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                        n3 = (int)((long)((n2 ^ 0xD161C861 ^ 0x4E40FD7C) + 1312882044) ^ 0x2DA44F64A1BEFA0FL ^ 0x2DA44F64A1BEFA0FL);
                                                                                                    }
                                                                                                    n -= 4;
                                                                                                    continue;
                                                                                                }
                                                                                                try {
                                                                                                    if ((0xC15BB47F9EA6E491L ^ (long)n2 | 1L) == 0L) {
                                                                                                        throw new IllegalArgumentException();
                                                                                                    }
                                                                                                    n3 = (n2 ^ 0xAF400B0C ^ 0x4E40FD7C) + 1312882044 + -1731512777 - -1731512777;
                                                                                                }
                                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                                    n3 = (int)((long)((n2 ^ 0xAF400B0C ^ 0x4E40FD7C) + 1312882044) ^ 0xA30C1BCB6BEFF07CL ^ 0xA30C1BCB6BEFF07CL);
                                                                                                }
                                                                                                --n;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_9 = Integer.rotateRight(0xFF5E6F63 ^ n2, 18) + -254993352;
                                                                                            if (class_13092 instanceof class_1296) {
                                                                                                try {
                                                                                                    --n;
                                                                                                    if ((0x1BE5BE4896A0DB61L ^ (long)n2 | 1L) == 0L) {
                                                                                                        throw new UnsupportedOperationException();
                                                                                                    }
                                                                                                    n3 = (int)((long)((n2 ^ 0xAF400B0C ^ 0x4E40FD7C) + 1312882044) ^ 0x4504FC944137578BL ^ 0x4504FC944137578BL);
                                                                                                }
                                                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                    n3 = (n2 ^ 0xAF400B0C ^ 0x4E40FD7C) + 1312882044 + 1899980595 - 1899980595;
                                                                                                }
                                                                                                n += 4;
                                                                                                continue;
                                                                                            }
                                                                                            try {
                                                                                                n += 3;
                                                                                                if ((0x66723AF08811C585L ^ (long)n2 | 1L) == 0L) {
                                                                                                    throw new ArithmeticException();
                                                                                                }
                                                                                                n3 = (n2 ^ 0xA33B10DB ^ 0x4E40FD7C) + 1312882044 + -849515925 - -849515925;
                                                                                            }
                                                                                            catch (ArithmeticException arithmeticException) {
                                                                                                n3 = (n2 ^ 0xA33B10DB ^ 0x4E40FD7C) + 1312882044;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_10 = (Integer.rotateLeft(0xBA55591C ^ n2, 10) - -1800181345) * -1168811747;
                                                                                        bl = this.rjb.alh();
                                                                                        n3 = (n2 ^ 0x698A1F21 ^ 0x4E40FD7C) + 1312882044;
                                                                                        int cfr_ignored_11 = (Integer.rotateRight(0xF573083A ^ n2, 17) + -1119117759) * -177010629;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_12 = (Integer.rotateLeft(0xC568D994 ^ n2, 11) - -334497753) * -982984299;
                                                                                    bl = this.rjb.alh();
                                                                                    try {
                                                                                        if ((0x1F4840D72038D837L ^ (long)n2 | 1L) == 0L) {
                                                                                            throw new ArithmeticException();
                                                                                        }
                                                                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x698A1F21 ^ 0x4E40FD7C) + 1312882044));
                                                                                    }
                                                                                    catch (ArithmeticException arithmeticException) {
                                                                                        n3 = (n2 ^ 0x698A1F21 ^ 0x4E40FD7C) + 1312882044 + 1647482763 - 1647482763;
                                                                                    }
                                                                                    n += 5;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_13 = (Integer.rotateRight(0x9B9945DE ^ n2, 6) - -605219555) * -1684453921;
                                                                                if (!(class_13092 instanceof class_1657)) {
                                                                                    try {
                                                                                        n += 3;
                                                                                        if ((0x772DCDCB39D08D4DL ^ (long)n2 | 1L) == 0L) {
                                                                                            throw new IllegalArgumentException();
                                                                                        }
                                                                                        n3 = (n2 ^ 0x54AD82F1 ^ 0x4E40FD7C) + 1312882044 ^ 0x23535567 ^ 0x23535567;
                                                                                    }
                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                        n3 = (n2 ^ 0x54AD82F1 ^ 0x4E40FD7C) + 1312882044;
                                                                                    }
                                                                                    ++n;
                                                                                    continue;
                                                                                }
                                                                                try {
                                                                                    n += 5;
                                                                                    if ((0x1487195167423BBFL ^ (long)n2 | 1L) == 0L) {
                                                                                        throw new ArithmeticException();
                                                                                    }
                                                                                    n3 = (n2 ^ 0xC31D88C3 ^ 0x4E40FD7C) + 1312882044;
                                                                                }
                                                                                catch (ArithmeticException arithmeticException) {
                                                                                    n3 = (n2 ^ 0xC31D88C3 ^ 0x4E40FD7C) + 1312882044;
                                                                                }
                                                                                n += 2;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_14 = Integer.rotateRight(0x586C7CA2 ^ n2, 14) + -1182746919;
                                                                            bl = rkh.khtd_3(this.rzl_2);
                                                                            n3 = (n2 ^ 0x9C7D6311 ^ 0x4E40FD7C) + 1312882044;
                                                                            int cfr_ignored_15 = (Integer.rotateRight(0x9F10B3DF ^ n2, 6) - 1197696828) * -1626295329;
                                                                            n3 = (int)((long)((n2 ^ 0x698A1F21 ^ 0x4E40FD7C) + 1312882044) ^ 0xFA4B6B9972554E54L ^ 0xFA4B6B9972554E54L);
                                                                            n -= 2;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_16 = Integer.rotateLeft(0x980CF3E0 ^ n2, 6) + 1844389723;
                                                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x4E309968 ^ 0x4E40FD7C) + 1312882044));
                                                                        int cfr_ignored_17 = (Integer.rotateRight(0xBCE69893 ^ n2, 10) + -464905976) * -1125738349;
                                                                        try {
                                                                            n -= 2;
                                                                            if ((0xDFB9D758F28F8063L ^ (long)n2 | 1L) == 0L) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            n3 = (n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044 + 235735025 - 235735025;
                                                                        }
                                                                        catch (IllegalStateException illegalStateException) {
                                                                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044));
                                                                        }
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_18 = (Integer.rotateRight(0xC78CF5F7 ^ n2, 11) - 779053092) * -947063305;
                                                                    n3 = (n2 ^ 0xFF32EE4A ^ 0x4E40FD7C) + 1312882044 ^ 0x4983EBB5 ^ 0x4983EBB5;
                                                                    int cfr_ignored_19 = (Integer.rotateRight(0x5AA78436 ^ n2, 14) - -22634043) * 1520927799;
                                                                    try {
                                                                        n += 4;
                                                                        if ((0xAE7DF1B31515DF47L ^ (long)n2 | 1L) == 0L) {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044));
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044));
                                                                    }
                                                                    continue;
                                                                }
                                                                int cfr_ignored_20 = (Integer.rotateLeft(0x8A4C30D1 ^ n2, 4) + -1013479286) * -1974718255;
                                                                int cfr_ignored_21 = (int)(0x48FE9EEC27D4EB4FL ^ (long)n2 ^ 0xC0A8831A2DB93C2CL);
                                                                try {
                                                                    n3 = (n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044 + 1265589507 - 1265589507;
                                                                }
                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                    n3 = (n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044;
                                                                }
                                                                n -= 2;
                                                                continue;
                                                            }
                                                            int cfr_ignored_22 = (Integer.rotateLeft(0x1E8B5455 ^ n2, 6) - -1220749946) * 512447573;
                                                            int cfr_ignored_23 = (int)(0xDC39FA6827D4EB4FL ^ (long)n2 ^ 0x9A0831A2DB815A2L);
                                                            n3 = (n2 ^ 0x7795BF1C ^ 0x4E40FD7C) + 1312882044 + -2019145902 - -2019145902;
                                                            int cfr_ignored_24 = Integer.rotateRight(0x4BF42366 ^ n2, 12) - 921561237;
                                                            n3 = (int)((long)((n2 ^ 0x60B5DC63 ^ 0x4E40FD7C) + 1312882044) ^ 0xC63BA88CBBD5D2C1L ^ 0xC63BA88CBBD5D2C1L);
                                                            int cfr_ignored_25 = Integer.rotateLeft(0xCBA88749 ^ n2, 12) + -1379532526;
                                                            int cfr_ignored_26 = (int)(0x91A297427D4EB4FL ^ (long)n2 ^ 0xAF98831A2DB9BFE5L);
                                                            n3 = (int)((long)((n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044) ^ 0xB066E0D9E497A7FDL ^ 0xB066E0D9E497A7FDL);
                                                            n -= 3;
                                                            continue;
                                                        }
                                                        int cfr_ignored_27 = Integer.rotateLeft(0xE04D4EA5 ^ n2, 15) - 767173942;
                                                        int cfr_ignored_28 = (int)(0x22FFE09827D4EB4FL ^ (long)n2 ^ 0x3C40831A2DB9E82EL);
                                                        n3 = (n2 ^ 0x23651999 ^ 0x4E40FD7C) + 1312882044 ^ 0xB7B5BFD3 ^ 0xB7B5BFD3;
                                                        int cfr_ignored_29 = (Integer.rotateLeft(0xC98F318 ^ n2, 4) + -1964830941) * 211350297;
                                                        try {
                                                            n += 3;
                                                            n3 = (int)((long)((n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044) ^ 0xBA3C2C0C566FF42AL ^ 0xBA3C2C0C566FF42AL);
                                                        }
                                                        catch (ArithmeticException arithmeticException) {
                                                            n3 = (n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044 ^ 0xF730EAD4 ^ 0xF730EAD4;
                                                        }
                                                        continue;
                                                    }
                                                    int cfr_ignored_30 = Integer.rotateLeft(0x915D2B44 ^ n2, 5) - -1633297289;
                                                    n3 = (n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044;
                                                    int cfr_ignored_31 = (Integer.rotateLeft(0xE2E94374 ^ n2, 15) - 2124204615) * -488029323;
                                                    n -= 3;
                                                    continue;
                                                }
                                                int cfr_ignored_32 = Integer.rotateLeft(0xFBF30980 ^ n2, 18) + -2033465925;
                                                n3 = (n2 ^ 0xDD0A4064 ^ 0x4E40FD7C) + 1312882044 + 436213481 - 436213481;
                                                int cfr_ignored_33 = Integer.rotateLeft(0xBED096AC ^ n2, 10) - 530570767;
                                                n3 = (n2 ^ 0x66A8258 ^ 0x4E40FD7C) + 1312882044 + -370038909 - -370038909;
                                                int cfr_ignored_34 = (Integer.rotateRight(0xF56C3DD3 ^ n2, 17) + -1132913720) * -177455661;
                                                n3 = (n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044 + 1919137918 - 1919137918;
                                                --n;
                                                continue;
                                            }
                                            int cfr_ignored_35 = Integer.rotateLeft(0x7D69D3AC ^ n2, 18) - 875446543;
                                            int cfr_ignored_36 = (int)(0x64D754938C96A26DL ^ (long)n2 ^ 0x5457D59EBFFD647FL);
                                            n3 = (int)((long)((n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044) ^ 0x1784C6FB04478830L ^ 0x1784C6FB04478830L);
                                            n += 4;
                                            continue;
                                        }
                                        int cfr_ignored_37 = Integer.rotateLeft(0x40BCDFAC ^ n2, 11) - -616778481;
                                        n3 = (n2 ^ 0x46FF3F14 ^ 0x4E40FD7C) + 1312882044 ^ 0xE10D336F ^ 0xE10D336F;
                                        int cfr_ignored_38 = (Integer.rotateRight(0x17D194D7 ^ n2, 5) - -423713468) * 399611095;
                                        n3 = (n2 ^ 0x1FBAB83B ^ 0x4E40FD7C) + 1312882044 + -2014433363 - -2014433363;
                                        int cfr_ignored_39 = Integer.rotateLeft(0x820A67A5 ^ n2, 3) - -1012913098;
                                        int cfr_ignored_40 = (int)(0x40B8C99827D4EB4FL ^ (long)n2 ^ 0x6E40831A2DB92CA0L);
                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044));
                                        continue;
                                    }
                                    int cfr_ignored_41 = (Integer.rotateRight(0x142E5077 ^ n2, 5) - 1979276708) * 338579575;
                                    n3 = (n2 ^ 0x800FAE19 ^ 0x4E40FD7C) + 1312882044 + 640077698 - 640077698;
                                    int cfr_ignored_42 = Integer.rotateLeft(0x62361409 ^ n2, 15) + -387314606;
                                    int cfr_ignored_43 = (int)(0xA084BA3427D4EB4FL ^ (long)n2 ^ 0x8918831A2DB8ECD8L);
                                    n3 = (n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044 ^ 0x32BB38A ^ 0x32BB38A;
                                    int cfr_ignored_44 = Integer.rotateRight(0xA2E832EF ^ n2, 7) - -1099183572;
                                    ++n;
                                    continue;
                                }
                                int cfr_ignored_45 = (Integer.rotateRight(0xE31BA75F ^ n2, 15) - -2068388932) * -484726945;
                                try {
                                    n += 5;
                                    if ((0x568729BDF9D45BABL ^ (long)n2 | 1L) == 0L) {
                                        throw new UnsupportedOperationException();
                                    }
                                    n3 = (n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044 + -1143731330 - -1143731330;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    n3 = (n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044;
                                }
                                continue;
                            }
                            int cfr_ignored_46 = Integer.rotateRight(0x1CA7B963 ^ n2, 6) + 2091717176;
                            n3 = (int)((long)((n2 ^ 0x29C03D6 ^ 0x4E40FD7C) + 1312882044) ^ 0xC2225BBBA362484BL ^ 0xC2225BBBA362484BL);
                            int cfr_ignored_47 = (Integer.rotateRight(0xCFF41192 ^ n2, 12) + 854310889) * -806088301;
                            try {
                                if ((0x3E3B6F8DCB4EA001L ^ (long)n2 | 1L) == 0L) {
                                    throw new UnsupportedOperationException();
                                }
                                n3 = (n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044 + -2065095583 - -2065095583;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                n3 = (n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044 + 742617519 - 742617519;
                            }
                            n += 4;
                            continue;
                        }
                        int cfr_ignored_48 = Integer.rotateLeft(0x61183149 ^ n2, 15) + -968124654;
                        int cfr_ignored_49 = (int)(0xA3AA9F7427D4EB4FL ^ (long)n2 ^ 0xC398831A2DB8EA84L);
                        n3 = (n2 ^ 0x81703269 ^ 0x4E40FD7C) + 1312882044;
                        int cfr_ignored_50 = (Integer.rotateRight(0x53E501B6 ^ n2, 13) - 756601925) * 1407517111;
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xB5989F98 ^ 0x4E40FD7C) + 1312882044));
                        int cfr_ignored_51 = (Integer.rotateRight(0x35F6D3F2 ^ n2, 9) + -1925101175) * 905368563;
                        n3 = (int)((long)((n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044) ^ 0xA53B762638FA196EL ^ 0xA53B762638FA196EL);
                        n -= 5;
                        continue;
                    }
                    int cfr_ignored_52 = Integer.rotateRight(0x8A272822 ^ n2, 4) + -1088717991;
                    int cfr_ignored_53 = (int)(0xF8DDEBDAE59C8714L ^ (long)n2 ^ 0x2AC5078AF50E5C6AL);
                    n3 = (int)((long)((n2 ^ 0x8C3DE13F ^ 0x4E40FD7C) + 1312882044) ^ 0x590CE1B0D83DEC13L ^ 0x590CE1B0D83DEC13L);
                    int cfr_ignored_54 = (int)(0xEE23D0A3BA17455DL ^ (long)n2 ^ 0x5C37B89D719C7196L);
                    n3 = (n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044 ^ 0x2062D2D2 ^ 0x2062D2D2;
                    --n;
                    continue;
                }
                return bl;
            }
            int cfr_ignored_55 = (Integer.rotateLeft(0x7292B0F0 ^ n2, 17) + -467596213) * 1922216177;
            n3 = (n2 ^ 0x9B7F0D25 ^ 0x4E40FD7C) + 1312882044;
        }
    }

    private void zyh_3(class_1309 class_13092) {
        int n = -1377472040;
        n = Integer.rotateLeft(n * 1574757525, 18) ^ 0xD32DC88C;
        n = System.identityHashCode(this) ^ n;
        class_1309 class_13093 = class_13092;
        n = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 14);
        int n2 = n ^ 0x967FF0E2;
        if ((n2 ^ n) != -1770000158) {
            int cfr_ignored_0 = (0x3B9A813A ^ n) - 1634495509;
        }
        class_243 class_2432 = this.shry(class_13092);
        float f = class_13092.field_6283;
        double d = Math.toRadians(f);
        double d2 = Math.cos(d);
        double d3 = Math.sin(d);
        double d4 = -Math.sin(d);
        double d5 = rkh.rf(d);
        double d6 = class_2432.field_1352 - rkh.rkw(class_13092);
        double d7 = class_2432.field_1350 - class_13092.method_23321();
        double d8 = d6 * d2 + d7 * d3;
        double d9 = d6 * d4 + d7 * d5;
        double d10 = rkh.dkht(class_2432.field_1351 - rkh.shngh(class_13092), Double.longBitsToDouble(0xAEC5FA84B8423464L ^ 0x916C631D21DBADFEL), Math.max(rkh.ghzdh_2(0x257242C70DBF199AL ^ 0x1ADBDB5E94268000L), (double)rkh.zshr(class_13092) - Double.longBitsToDouble(0x91A9875D75E92786L ^ 0xAE001EC4EC70BE1CL)));
        float f2 = rkh.zghy(this.ths_3) ? (float)ThreadLocalRandom.current().nextDouble(0.0, Double.longBitsToDouble(0x4FF4002967EA69F5L ^ 0xF82802967EA69F5L)) : 0.0f;
        this.tndh.add(new bdhz(class_13092, d8, d10, d9, f2, this.hbdh++, class_2432));
    }

    private class_243 shry(class_1309 class_13092) {
        int n = 692158869;
        n = Integer.rotateLeft(n * 972498621, 24) ^ 0xA79DE6A2;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 28);
        int n2 = n ^ 0xD18A7141;
        if ((n2 ^ n) != -779456191) {
            int cfr_ignored_0 = (0xF8CBF0D4 ^ n) + -383386225;
        }
        class_243 class_2432 = rkh.mc.field_1724.method_33571();
        class_243 class_2433 = rkh.shfm(this);
        double d = rkh.sam_3(Double.longBitsToDouble(0x58C5F8CD9E3651DFL ^ 0x18CDF8CD9E3651DFL), class_2432.method_1022(rkh.rmd_2(class_13092.method_5829())) + 1.0);
        class_238 class_2383 = rkh.aghs(class_13092).method_1014((double)class_13092.method_5871() + Double.longBitsToDouble(0xD749B28631F8FC5L ^ 0x32D0E1C924B19BBEL));
        return rkh.tzsh_2(class_2383, class_2432, rkh.thdth(class_2432, class_2433.method_1021(d))).orElse(rkh.hmh(class_2383));
    }

    private class_243 a_2() {
        ny ny2;
        int n = 1977018346;
        n = Integer.rotateLeft(n * -469965167, 24) ^ 0xA02278AD;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 21);
        int n2 = n ^ 0x12252FAC;
        if ((n2 ^ n) != 304426924) {
            int cfr_ignored_0 = (0x67F3C846 ^ n) - 445086869;
        }
        if ((ny2 = Moondlc.getInstance().getRotationHandler()) != null && !rkh.dhnh(ny2)) {
            lb lb2 = ny2.dhdf();
            return rkh.tnd_4(this, rkh.rwh(lb2), lb2.khdhd_2());
        }
        return rkh.mc.field_1724.method_5828(1.0f);
    }

    /*
     * Unable to fully structure code
     */
    private class_243 sdht_3(float var1_1, float var2_2) {
        var3_3 = 0.0f;
        var4_4 = 0.0f;
        var5_5 = 0.0f;
        var6_6 = 0.0f;
        var7_7 = 0.0f;
        var8_8 = 0.0f;
        var11_9 = 0;
        var9_10 = -198853250;
        var9_10 = Integer.rotateLeft(var9_10 * 1723863405, 25) ^ 1519924306;
        var9_10 = Integer.rotateLeft(System.identityHashCode(this) ^ var9_10, 23);
        var10_11 = -581958448 + var9_10 + 601700834 - 601700834;
        while (true) {
            block39: {
                block32: {
                    block30: {
                        block38: {
                            block37: {
                                block34: {
                                    block28: {
                                        block29: {
                                            block31: {
                                                block35: {
                                                    block36: {
                                                        block27: {
                                                            block33: {
                                                                var11_9 = var10_11 - var9_10;
                                                                switch (var11_9 & 7) {
                                                                    case 0: {
                                                                        if (var11_9 != -581958448) {
                                                                            ** break;
                                                                        }
                                                                        break block27;
                                                                    }
                                                                    case 1: {
                                                                        if (var11_9 != -554038903) {
                                                                            ** break;
                                                                        }
                                                                        break block28;
                                                                    }
                                                                    case 2: {
                                                                        if (var11_9 == -1079631782) break;
                                                                        if (var11_9 != -856394998) {
                                                                            ** break;
                                                                        }
                                                                        break block29;
                                                                    }
                                                                    case 3: {
                                                                        if (var11_9 == -1401861965) break block30;
                                                                        if (var11_9 == 650424211) break block31;
                                                                        Integer.rotateRight(-921855825 ^ var9_10, 12) - 1560484972;
                                                                        if (var11_9 == 45115915) break block32;
                                                                        if (var11_9 == -476415461) break block33;
                                                                        if (var11_9 == 1524039979) break block34;
                                                                        if (var11_9 != 1050814219) {
                                                                            ** break;
                                                                        }
                                                                        break block35;
                                                                    }
                                                                    case 5: {
                                                                        if (var11_9 == -1396611699) break block36;
                                                                        if (var11_9 != 1676110533) {
                                                                            (Integer.rotateRight(1496299295 ^ var9_10, 14) - -786117636) * 1496299295;
                                                                            ** break;
                                                                        }
                                                                        break block37;
                                                                    }
                                                                    case 7: {
                                                                        if (var11_9 == 1067336863) break block38;
                                                                        if (var11_9 != -510758297) {
                                                                            ** break;
                                                                        }
                                                                        break block39;
                                                                    }
                                                                }
                                                                Integer.rotateRight(-279149562 ^ var9_10, 16) - 9542645;
                                                                throw null;
                                                            }
                                                            (Integer.rotateRight(-1814369134 ^ var9_10, 5) + -337623831) * -1814369133;
                                                            var3_3 = var2_2 * rkh.tdhh_3(-1075177343 + 2091180468);
                                                            var4_4 = -var1_1 * Float.intBitsToFloat(rkh.sha_6(-201430922 ^ -1719175806, 7));
                                                            var5_5 = class_3532.method_15362((float)var4_4);
                                                            var6_6 = rkh.sjy_2(var4_4);
                                                            var7_7 = class_3532.method_15362((float)var3_3);
                                                            var8_8 = rkh.sya_3(var3_3);
                                                            return new class_243((double)(var6_6 * var7_7), (double)(-var8_8), (double)(var5_5 * var7_7));
                                                        }
                                                        (Integer.rotateRight(1504006559 ^ var9_10, 14) - -547192452) * 1504006559;
                                                        if (!yf.dnkh()) {
                                                            var10_11 = (int)((long)(538780536 + var9_10) ^ -3685675593947374537L ^ -3685675593947374537L);
                                                            (Integer.rotateLeft(-16582512 ^ var9_10, 18) + -440813397) * -16582511;
                                                            var10_11 = (int)((long)(-476415461 + var9_10) ^ -1229402861251748768L ^ -1229402861251748768L);
                                                            continue;
                                                        }
                                                        var10_11 = -1155794894 + var9_10;
                                                        (Integer.rotateRight(0x3199313 ^ var9_10, 3) + 1685483144) * 0x3199313;
                                                        var10_11 = -1079631782 + var9_10;
                                                        ++var11_9;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(-1354250652 ^ var9_10, 8) - 1041147223;
                                                    var10_11 = Integer.reverse(Integer.reverse(-581958448 + var9_10));
                                                    continue;
                                                }
                                                Integer.rotateLeft(-275848888 ^ var9_10, 16) + 111863539;
                                                try {
                                                    if ((6625371472229134217L ^ (long)var9_10 | 1L) == 0L) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    var10_11 = -581958448 + var9_10 ^ 1330042723 ^ 1330042723;
                                                }
                                                catch (IllegalArgumentException v0) {
                                                    var10_11 = Integer.reverse(Integer.reverse(-581958448 + var9_10));
                                                }
                                                ++var11_9;
                                                continue;
                                            }
                                            (Integer.rotateRight(1686193662 ^ var9_10, 15) - 805640445) * 1686193663;
                                            var10_11 = Integer.reverse(Integer.reverse(-915813669 + var9_10));
                                            (Integer.rotateRight(-2022016361 ^ var9_10, 3) - 1815246724) * -2022016361;
                                            var10_11 = -935583525 + var9_10 + 957676528 - 957676528;
                                            Integer.rotateLeft(-1266447680 ^ var9_10, 9) + -531927941;
                                            var10_11 = -581958448 + var9_10 + -973224517 - -973224517;
                                            continue;
                                        }
                                        Integer.rotateRight(334500775 ^ var9_10, 5) - 1852833908;
                                        var10_11 = -581958448 + var9_10;
                                        var11_9 -= 4;
                                        continue;
                                    }
                                    (Integer.rotateRight(-1546699626 ^ var9_10, 7) - -629803675) * -1546699625;
                                    var10_11 = 1353152052 + var9_10 + -2014669243 - -2014669243;
                                    Integer.rotateRight(-105612862 ^ var9_10, 18) + 1094213049;
                                    var10_11 = (int)((long)(-581958448 + var9_10) ^ -6102342294919737359L ^ -6102342294919737359L);
                                    continue;
                                }
                                Integer.rotateRight(1328597898 ^ var9_10, 12) + -1689893647;
                                var10_11 = -2012733366 + var9_10 ^ 828820992 ^ 828820992;
                                (Integer.rotateRight(-917064874 ^ var9_10, 12) - 1709004453) * -917064873;
                                try {
                                    var11_9 += 5;
                                    var10_11 = (int)((long)(-581958448 + var9_10) ^ 6467804428237720932L ^ 6467804428237720932L);
                                }
                                catch (IllegalStateException v1) {
                                    var10_11 = -581958448 + var9_10;
                                }
                                var11_9 -= 4;
                                continue;
                            }
                            (Integer.rotateLeft(1608392913 ^ var9_10, 14) + -1606182774) * 1608392913;
                            (int)(-7103145367338423473L ^ (long)var9_10 ^ -2258411064666843384L);
                            var10_11 = -1250286902 + var9_10 + 1314364475 - 1314364475;
                            Integer.rotateRight(-276878130 ^ var9_10, 16) - 79957037;
                            (int)(-1185012550612229897L ^ (long)var9_10 ^ 561534273057223370L);
                            var10_11 = 1547861756 + var9_10 + -1774783535 - -1774783535;
                            (int)(3858241027061843093L ^ (long)var9_10 ^ -8143727433375430969L);
                            var10_11 = -581958448 + var9_10;
                            continue;
                        }
                        (Integer.rotateLeft(1635643420 ^ var9_10, 15) - -761417057) * 1635643421;
                        try {
                            ++var11_9;
                            if ((3263950099816197097L ^ (long)var9_10 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var10_11 = Integer.reverse(Integer.reverse(-581958448 + var9_10));
                        }
                        catch (IllegalStateException v2) {
                            var10_11 = -581958448 + var9_10;
                        }
                        var11_9 -= 2;
                        continue;
                    }
                    Integer.rotateLeft(544704773 ^ var9_10, 7) - -220776746;
                    (int)(-2106234128585921713L ^ (long)var9_10 ^ -5548290592461002661L);
                    var10_11 = -1253899407 + var9_10 + 342443869 - 342443869;
                    (Integer.rotateRight(1244274131 ^ var9_10, 12) + -8963128) * 1244274131;
                    var10_11 = (int)((long)(-581958448 + var9_10) ^ -1399440401392815903L ^ -1399440401392815903L);
                    (Integer.rotateRight(206301303 ^ var9_10, 4) - -2121349724) * 206301303;
                    continue;
                }
                (Integer.rotateLeft(1120070644 ^ var9_10, 11) - 435696071) * 1120070645;
                var10_11 = -581958448 + var9_10 + -627654911 - -627654911;
                var11_9 += 5;
                continue;
            }
            Integer.rotateRight(-697638066 ^ var9_10, 13) - -78699091;
            try {
                var11_9 += 2;
                if ((1923183873205406103L ^ (long)var9_10 | 1L) == 0L) {
                    throw new UnsupportedOperationException();
                }
                var10_11 = Integer.reverse(Integer.reverse(-581958448 + var9_10));
            }
            catch (UnsupportedOperationException v3) {
                var10_11 = -581958448 + var9_10 + -2059809088 - -2059809088;
            }
            var11_9 += 5;
            continue;
lbl194:
            // 7 sources

            Integer.rotateRight(1481293122 ^ var9_10, 14) + -1251308999;
            var10_11 = Integer.reverse(Integer.reverse(-581958448 + var9_10));
        }
    }

    private void dtq_4(shw_3 shw2) {
        class_287 class_2872;
        boolean bl;
        bdhz bdhz22;
        if (this.tndh.isEmpty() || rkh.mc.field_1687 == null || rkh.mc.field_1773 == null) {
            return;
        }
        long l = System.currentTimeMillis();
        long l2 = Math.max(1L, (long)Math.round(this.bdb.thw_5()));
        for (bdhz bdhz22 : this.tndh) {
            if (l - bdhz22.tdhy < l2) continue;
            this.tndh.remove(bdhz22);
        }
        if (this.tndh.isEmpty()) {
            return;
        }
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA);
        RenderSystem.disableCull();
        RenderSystem.depthMask((boolean)false);
        if (this.zqh.shzl()) {
            RenderSystem.disableDepthTest();
        } else {
            RenderSystem.enableDepthTest();
        }
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        bdhz22 = shw2.dhal();
        class_243 class_2432 = bdhz22.method_19326();
        boolean bl2 = this.hnl.shghkh() || this.shah_3.shghkh();
        boolean bl3 = bl = this.tdr_2.shghkh() || this.shah_3.shghkh();
        if (bl2) {
            class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
            for (bdhz bdhz3 : this.tndh) {
                this.dab_3(class_2872, shw2.ssha_2(), class_2432, bdhz3, l, l2, shw2.skz_4());
            }
            class_286.method_43433((class_9801)class_2872.method_60800());
        }
        if (bl) {
            RenderSystem.lineWidth((float)this.sksh.thw_5());
            class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
            for (bdhz bdhz3 : this.tndh) {
                this.has_4(class_2872, shw2.ssha_2(), class_2432, bdhz3, l, l2, shw2.skz_4());
            }
            class_286.method_43433((class_9801)class_2872.method_60800());
            RenderSystem.lineWidth((float)1.0f);
        }
        RenderSystem.defaultBlendFunc();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private void dab_3(class_287 class_2872, class_4587 class_45872, class_243 class_2432, bdhz bdhz2, long l, long l2, float f) {
        bzz_3 bzz2_2 = this.thdj(bdhz2, l, l2, f);
        if (bzz2_2 == null) {
            return;
        }
        int n = this.ghdn(bdhz2.hthz, bzz2_2.khghth * (this.shah_3.shghkh() ? 0.42f : 1.0f));
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        int n5 = n >> 24 & 0xFF;
        class_45872.method_22903();
        this.jkhd_2(class_45872, class_2432, bdhz2, bzz2_2);
        this.kj(class_2872, class_45872.method_23760().method_23761(), bzz2_2.zgh, n2, n3, n4, n5);
        class_45872.method_22909();
    }

    private void has_4(class_287 class_2872, class_4587 class_45872, class_243 class_2432, bdhz bdhz2, long l, long l2, float f) {
        bzz_3 bzz2_2 = this.thdj(bdhz2, l, l2, f);
        if (bzz2_2 == null) {
            return;
        }
        int n = this.ghdn(bdhz2.hthz, bzz2_2.khghth);
        class_45872.method_22903();
        this.jkhd_2(class_45872, class_2432, bdhz2, bzz2_2);
        this.sbt(class_2872, class_45872.method_23760().method_23761(), bzz2_2.zgh, n);
        class_45872.method_22909();
    }

    private bzz_3 thdj(bdhz bdhz2, long l, long l2, float f) {
        float f2 = class_3532.method_15363((float)((float)(l - bdhz2.tdhy) / (float)l2), (float)0.0f, (float)1.0f);
        float f3 = 1.0f - (float)Math.pow(1.0f - f2, 3.0);
        float f4 = (float)Math.pow(1.0f - f2, 1.35);
        if (f4 <= 0.01f) {
            return null;
        }
        class_243 class_2432 = this.sja(bdhz2, f);
        if (class_2432 == null) {
            return null;
        }
        float f5 = class_3532.method_15363((float)(this.byz_2.thw_5() / 255.0f * f4), (float)0.0f, (float)1.0f);
        float f6 = this.rdz_3.thw_5() + this.thhq.thw_5() * f3;
        float f7 = bdhz2.bghy;
        float f8 = bdhz2.zshq + this.thmy.thw_5() * ((float)(l - bdhz2.tdhy) / 1000.0f);
        return new bzz_3(class_2432, f6, f5, f7, f8);
    }

    private class_243 sja(bdhz bdhz2, float f) {
        class_243 class_2432;
        class_1309 class_13092;
        int n = 1600435833;
        n = Integer.rotateLeft(n * -497767415, 17) ^ 0xE7FC26E7;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xA9048428;
        if ((n2 ^ n) != -1459321816) {
            int cfr_ignored_0 = (0xF6603251 ^ n) + -540407416;
        }
        if ((class_13092 = bdhz2.bhl_2) == null || rkh.tzq_2(class_13092) || rkh.dyh(class_13092) != rkh.mc.field_1687) {
            return bdhz2.dhfj;
        }
        double d = class_3532.method_16436((double)f, (double)class_13092.field_6014, (double)class_13092.method_23317());
        double d2 = class_3532.method_16436((double)f, (double)class_13092.field_6036, (double)class_13092.method_23318());
        double d3 = class_3532.method_16436((double)f, (double)class_13092.field_5969, (double)rkh.zlgh(class_13092));
        float f2 = class_3532.method_17821((float)f, (float)class_13092.field_6220, (float)class_13092.field_6283);
        double d4 = Math.toRadians(f2);
        double d5 = rkh.khhz_4(d4);
        double d6 = Math.sin(d4);
        double d7 = -rkh.khab(d4);
        double d8 = Math.cos(d4);
        double d9 = class_3532.method_15350((double)bdhz2.dhwa_2, (double)Double.longBitsToDouble(0xC8944C8CA681EFC4L ^ 0xF730366DE12FFBBFL), (double)Math.max(Double.longBitsToDouble(0xD161CA6F2C32C99AL ^ 0xEEC5B08E6B9CDDE1L), (double)class_13092.method_17682() - Double.longBitsToDouble(0xBE3C27F037033BEBL ^ 0x81985D1170AD2F90L)));
        bdhz2.dhfj = class_2432 = new class_243(d + d5 * bdhz2.rlq + d7 * bdhz2.jdl, d2 + d9, d3 + d6 * bdhz2.rlq + d8 * bdhz2.jdl);
        bdhz2.bghy = f2;
        return class_2432;
    }

    private void jkhd_2(class_4587 class_45872, class_243 class_2432, bdhz bdhz2, bzz_3 bzz2_2) {
        class_45872.method_22904(bzz2_2.tkhm.field_1352 - class_2432.field_1352, bzz2_2.tkhm.field_1351 - class_2432.field_1351, bzz2_2.tkhm.field_1350 - class_2432.field_1350);
        if (this.zma.shzl()) {
            class_45872.method_22907(class_7833.field_40716.rotationDegrees(-bzz2_2.sdw_2));
        }
        if (bzz2_2.dhygh != 0.0f) {
            class_45872.method_22907(class_7833.field_40716.rotationDegrees(bzz2_2.dhygh));
        }
        bdhz2.bghy = bzz2_2.sdw_2;
    }

    private void kj(class_287 class_2872, Matrix4f matrix4f, float f, int n, int n2, int n3, int n4) {
        int n5 = -1271469342;
        n5 = Integer.rotateLeft(n5 * -1100142583, 22) ^ 0xC6D4CF01;
        n5 = System.identityHashCode(this) ^ n5;
        class_287 class_2873 = class_2872;
        n5 = Integer.rotateLeft((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n5, 10);
        int n6 = n5 ^ 0xD70DB887;
        if ((n6 ^ n5) != -686966649) {
            int cfr_ignored_0 = (0x633B5265 ^ n5) + 16607461;
        }
        float f2 = f * Float.intBitsToFloat(Integer.rotateLeft(0x2ED1994B ^ 0x2D21994B, 4));
        rkh.akk(this, class_2872, matrix4f, -f2, -f2, f2, f2, -f2, f2, f2, f2, f2, -f2, f2, f2, rkh.zzz_2(this, n, Float.intBitsToFloat(Integer.rotateLeft(0xE697002C ^ 0x7CE819B5, 7))), this.rjl(n2, Float.intBitsToFloat(-821855284 - -1888047361)), this.rjl(n3, Float.intBitsToFloat(Integer.reverse(400904842) ^ 0x6EC66B25)), n4);
        rkh.skhl(this, class_2872, matrix4f, f2, -f2, -f2, -f2, -f2, -f2, -f2, f2, -f2, f2, f2, -f2, this.rjl(n, Float.intBitsToFloat(Integer.rotateLeft(0x60A1A227 ^ 0x60AE7227, 10))), rkh.ghkht(this, n2, Float.intBitsToFloat(-1007002708 - -2068161620)), this.rjl(n3, Float.intBitsToFloat(Integer.rotateLeft(0x1EDB5AA2 ^ 0x1EDB5572, 18))), n4);
        this.dta_6(class_2872, matrix4f, -f2, -f2, -f2, -f2, -f2, f2, -f2, f2, f2, -f2, f2, -f2, rkh.shbz_2(this, n, Float.intBitsToFloat(0xEF965A4F ^ 0xD0F71DE1)), this.rjl(n2, Float.intBitsToFloat(0x95AC7D4 ^ 0x363B807A)), this.rjl(n3, Float.intBitsToFloat(Integer.rotateLeft(0xC7C01EAF ^ 0xA687B090, 24))), n4);
        this.dta_6(class_2872, matrix4f, f2, -f2, f2, f2, -f2, -f2, f2, f2, -f2, f2, f2, f2, this.rjl(n, Float.intBitsToFloat(Integer.reverse(425770503) ^ 0xDF168387)), this.rjl(n2, Float.intBitsToFloat(Integer.rotateLeft(0x6354504B ^ 0x32A7A6F3, 12))), this.rjl(n3, Float.intBitsToFloat(Integer.rotateLeft(0xD0D16103 ^ 0xC4AD9CAD, 14))), n4);
        this.dta_6(class_2872, matrix4f, -f2, f2, f2, f2, f2, f2, f2, f2, -f2, -f2, f2, -f2, this.rjl(n, Float.intBitsToFloat(2072696436 + -1005833271)), this.rjl(n2, Float.intBitsToFloat(1063876681 + 2986484)), this.rjl(n3, Float.intBitsToFloat(0xC93211A ^ 0x33042B27)), n4);
        this.dta_6(class_2872, matrix4f, -f2, -f2, -f2, f2, -f2, -f2, f2, -f2, f2, -f2, -f2, f2, this.rjl(n, Float.intBitsToFloat(Integer.rotateLeft(0x9CC1DE04 ^ 0x19E22FEF, 12))), this.rjl(n2, Float.intBitsToFloat(Integer.reverse(-1444300922) ^ 0x5EF32FC7)), this.rjl(n3, Float.intBitsToFloat(Integer.reverse(1386824423) ^ 0xD85C2D18)), n4);
    }

    private void dta_6(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int n, int n2, int n3, int n4) {
        int n5 = bkdh.shadh_2(-673613904);
        n5 = Integer.rotateRight(System.identityHashCode(this) ^ n5, 24);
        Matrix4f matrix4f2 = matrix4f;
        n5 = (matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n5;
        int n6 = n5 ^ 0x26C578E9;
        if ((n6 ^ n5) != 650475753) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xF11C0F59 ^ n5, 17) + 918780674) * -249819303;
            int cfr_ignored_1 = (int)(0x33AEA16427D4EB4FL ^ (long)n5 ^ 0xBFB8831A2DB9CA8CL);
        }
        class_2872.method_22918(matrix4f, f, f2, f3).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f4, f5, f6).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f7, f8, f9).method_1336(n, n2, n3, n4);
        class_2872.method_22918(matrix4f, f10, f11, f12).method_1336(n, n2, n3, n4);
    }

    private void sbt(class_287 class_2872, Matrix4f matrix4f, float f, int n) {
        int n2 = bkdh.shadh_2(-619563258);
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 29);
        class_287 class_2873 = class_2872;
        n2 = (class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n2;
        int n3 = n2 ^ 0xACD809CF;
        if ((n3 ^ n2) != -1395127857) {
            int cfr_ignored_0 = Integer.rotateLeft(0x77CA3EC9 ^ n2, 17) + -2049230446;
            int cfr_ignored_1 = (int)(0xB57890F427D4EB4FL ^ (long)n2 ^ 0xDC98831A2DB8C720L);
        }
        float f2 = f * Float.intBitsToFloat(Integer.reverse(719446423) ^ 0xD6878754);
        this.jlq(class_2872, matrix4f, -f2, -f2, -f2, f2, -f2, -f2, n);
        this.jlq(class_2872, matrix4f, f2, -f2, -f2, f2, -f2, f2, n);
        this.jlq(class_2872, matrix4f, f2, -f2, f2, -f2, -f2, f2, n);
        this.jlq(class_2872, matrix4f, -f2, -f2, f2, -f2, -f2, -f2, n);
        this.jlq(class_2872, matrix4f, -f2, f2, -f2, f2, f2, -f2, n);
        this.jlq(class_2872, matrix4f, f2, f2, -f2, f2, f2, f2, n);
        this.jlq(class_2872, matrix4f, f2, f2, f2, -f2, f2, f2, n);
        this.jlq(class_2872, matrix4f, -f2, f2, f2, -f2, f2, -f2, n);
        this.jlq(class_2872, matrix4f, -f2, -f2, -f2, -f2, f2, -f2, n);
        this.jlq(class_2872, matrix4f, f2, -f2, -f2, f2, f2, -f2, n);
        this.jlq(class_2872, matrix4f, f2, -f2, f2, f2, f2, f2, n);
        this.jlq(class_2872, matrix4f, -f2, -f2, f2, -f2, f2, f2, n);
    }

    private void jlq(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, int n) {
        int n2 = bkdh.shadh_2(-480870974);
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 19);
        Matrix4f matrix4f2 = matrix4f;
        n2 = (matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n2;
        int n3 = n2 ^ 0x485F0137;
        if ((n3 ^ n2) != 1214185783) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xAB097CF5 ^ n2, 8) - -1165770522) * -1425441547;
            int cfr_ignored_1 = (int)(0x69BBD2C827D4EB4FL ^ (long)n2 ^ 0x58E0831A2DB97EA6L);
        }
        class_2872.method_22918(matrix4f, f, f2, f3).method_39415(n);
        class_2872.method_22918(matrix4f, f4, f5, f6).method_39415(n);
    }

    private int rjl(int n, float f) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 776624072;
        n4 = Integer.rotateLeft(n4 * 128862011, 17) ^ 0x4C79B510;
        n4 = Integer.rotateRight(System.identityHashCode(this) ^ n4, 28);
        n4 = n ^ n4;
        int n5 = (int)((long)(n4 ^ 0xE5D808A7) ^ 0xC2C52AC70B8D78BEL ^ 0xC2C52AC70B8D78BEL);
        while (true) {
            block18: {
                block17: {
                    block25: {
                        block15: {
                            block32: {
                                block23: {
                                    block22: {
                                        block30: {
                                            block27: {
                                                block20: {
                                                    block31: {
                                                        block29: {
                                                            block16: {
                                                                block21: {
                                                                    block26: {
                                                                        block28: {
                                                                            block24: {
                                                                                block13: {
                                                                                    block19: {
                                                                                        block14: {
                                                                                            if ((n3 = n5 ^ n4) > -961546115) break block13;
                                                                                            if (n3 > -1940022149) break block14;
                                                                                            if (n3 == -2058028130) break block15;
                                                                                            if (n3 == -2043617528) break block16;
                                                                                            int cfr_ignored_0 = Integer.rotateLeft(0x2401B20C ^ n4, 7) - 1620192943;
                                                                                            if (n3 == -1940022149) break block17;
                                                                                            break block18;
                                                                                        }
                                                                                        if (n3 > -1737283943) break block19;
                                                                                        if (n3 == -1748882632) break block20;
                                                                                        if (n3 == -1737283943) break block21;
                                                                                        int cfr_ignored_1 = (Integer.rotateRight(0xEBB529F2 ^ n4, 16) + -1890733175) * -340448781;
                                                                                        break block18;
                                                                                    }
                                                                                    if (n3 == -1596789470) break block22;
                                                                                    if (n3 == -961546115) break block23;
                                                                                    int cfr_ignored_2 = (Integer.rotateRight(0x73B80712 ^ n4, 17) + 128350825) * 1941440275;
                                                                                    break block18;
                                                                                }
                                                                                if (n3 > -92201359) break block24;
                                                                                if (n3 == -843539230) break block25;
                                                                                if (n3 == -438826841) break block26;
                                                                                if (n3 == -92201359) break block27;
                                                                                break block18;
                                                                            }
                                                                            if (n3 > 147179125) break block28;
                                                                            if (n3 == 69730864) break block29;
                                                                            if (n3 == 147179125) break block30;
                                                                            break block18;
                                                                        }
                                                                        if (n3 == 185842017) break block31;
                                                                        if (n3 == 1004810411) break block32;
                                                                        int cfr_ignored_3 = (Integer.rotateRight(0x43A0BA53 ^ n4, 11) + 886320968) * 1134606931;
                                                                        break block18;
                                                                    }
                                                                    bkdh.tms(-2041251872, n4);
                                                                    int cfr_ignored_4 = (int)(0x18638E597F4A7C15L ^ (long)n4 ^ 0xE1C23227030D9D16L);
                                                                    if (yf.khdha_2()) {
                                                                        n5 = n4 ^ 0xFAD40BB6;
                                                                        int cfr_ignored_5 = Integer.rotateLeft(0x3EA4C804 ^ n4, 10) - -1705912393;
                                                                        n5 = n4 ^ 0x98732699 ^ 0x48E60A75 ^ 0x48E60A75;
                                                                        n3 += 4;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_6 = (int)(0x68AF9DBA0642D3D5L ^ (long)n4 ^ 0xC604C0365C8D7C8EL);
                                                                    n5 = Integer.reverse(Integer.reverse(n4 ^ 0x8630DF08));
                                                                    ++n3;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_7 = Integer.rotateRight(0xA6B12EA6 ^ n4, 7) - 869418325;
                                                                n2 = class_3532.method_15340((int)Math.round((float)n * f), (int)0, (int)(0x68C19E67 ^ 0x68C19E98));
                                                                int cfr_ignored_8 = (int)(0xE9D3C40B44374CD9L ^ (long)n4 ^ 0x756644DD62947E76L);
                                                                n5 = n4 ^ 0x8C5D9C7B ^ 0x3DFACDEC ^ 0x3DFACDEC;
                                                                continue;
                                                            }
                                                            int cfr_ignored_9 = (Integer.rotateRight(0xEB11E05B ^ n4, 16) + 2072496704) * -351149989;
                                                            yf.athz_2();
                                                            throw null;
                                                        }
                                                        int cfr_ignored_10 = (Integer.rotateLeft(0x2F82E491 ^ n4, 8) + -986231606) * 797107345;
                                                        int cfr_ignored_11 = (int)(0xED304AAC27D4EB4FL ^ (long)n4 ^ 0x6828831A2DB877B1L);
                                                        n5 = (int)((long)(n4 ^ 0x5E0555AE) ^ 0x321B434C5E5CD3A9L ^ 0x321B434C5E5CD3A9L);
                                                        int cfr_ignored_12 = (Integer.rotateRight(0xD2E98552 ^ n4, 13) + -1901804503) * -756447917;
                                                        n5 = (n4 ^ 0xE5D808A7) + 1984453791 - 1984453791;
                                                        n3 -= 2;
                                                        continue;
                                                    }
                                                    int cfr_ignored_13 = (Integer.rotateRight(0x5DD880DF ^ n4, 14) - 1637169724) * 1574469855;
                                                    n5 = Integer.reverse(Integer.reverse(n4 ^ 0x84D06C64));
                                                    int cfr_ignored_14 = Integer.rotateRight(0x15D3D782 ^ n4, 5) + -1459308551;
                                                    try {
                                                        n5 = (n4 ^ 0xE5D808A7) + 1306573294 - 1306573294;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        n5 = (int)((long)(n4 ^ 0xE5D808A7) ^ 0x3FBDAC3A4C70C6D8L ^ 0x3FBDAC3A4C70C6D8L);
                                                    }
                                                    n3 += 4;
                                                    continue;
                                                }
                                                int cfr_ignored_15 = (Integer.rotateLeft(0xB33F7FD ^ n4, 4) - 1604888286) * 187955197;
                                                int cfr_ignored_16 = (int)(0xC98159C027D4EB4FL ^ (long)n4 ^ 0x4EF0831A2DB83ED3L);
                                                n5 = Integer.reverse(Integer.reverse(n4 ^ 0x1B244C4A));
                                                int cfr_ignored_17 = (Integer.rotateRight(0xAA348956 ^ n4, 8) - -1598406491) * -1439397545;
                                                n5 = Integer.reverse(Integer.reverse(n4 ^ 0xCBF788C6));
                                                int cfr_ignored_18 = Integer.rotateRight(0x66CCEEE2 ^ n4, 15) + 1999539353;
                                                n5 = n4 ^ 0xE5D808A7;
                                                n3 += 3;
                                                continue;
                                            }
                                            int cfr_ignored_19 = (Integer.rotateLeft(0x58D9E814 ^ n4, 14) - -960448089) * 1490675733;
                                            n5 = n4 ^ 0xBED6A77A ^ 0xD15C8F0D ^ 0xD15C8F0D;
                                            int cfr_ignored_20 = (Integer.rotateRight(0xEA3A45D2 ^ n4, 16) + 1634472873) * -365279789;
                                            try {
                                                if ((0xC6EC27475F5D40BL ^ (long)n4 | 1L) == 0L) {
                                                    throw new ArithmeticException();
                                                }
                                                n5 = Integer.reverse(Integer.reverse(n4 ^ 0xE5D808A7));
                                            }
                                            catch (ArithmeticException arithmeticException) {
                                                n5 = (int)((long)(n4 ^ 0xE5D808A7) ^ 0x31C84A04D101FF0AL ^ 0x31C84A04D101FF0AL);
                                            }
                                            --n3;
                                            continue;
                                        }
                                        int cfr_ignored_21 = (Integer.rotateRight(0x8DAA42F6 ^ n4, 4) - 737917701) * -1918221577;
                                        n5 = (int)((long)(n4 ^ 0x127D14DD) ^ 0x1F6DDE05E3ADCEBDL ^ 0x1F6DDE05E3ADCEBDL);
                                        int cfr_ignored_22 = Integer.rotateRight(0x8312BCEF ^ n4, 3) - -475889620;
                                        try {
                                            if ((0x1352837ED71D802FL ^ (long)n4 | 1L) == 0L) {
                                                throw new IllegalStateException();
                                            }
                                            n5 = n4 ^ 0xE5D808A7 ^ 0xC495B1A6 ^ 0xC495B1A6;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            n5 = n4 ^ 0xE5D808A7 ^ 0x719159FB ^ 0x719159FB;
                                        }
                                        continue;
                                    }
                                    int cfr_ignored_23 = (Integer.rotateLeft(0x5948EB71 ^ n4, 14) + -734912022) * 1497951089;
                                    int cfr_ignored_24 = (int)(0x9BFA454C27D4EB4FL ^ (long)n4 ^ 0x77E8831A2DB89A25L);
                                    n5 = n4 ^ 0x6B788C66;
                                    int cfr_ignored_25 = (Integer.rotateRight(0x6EC82B37 ^ n4, 16) - 1855642340) * 1858612023;
                                    n5 = n4 ^ 0xE5D808A7 ^ 0xC5D67F93 ^ 0xC5D67F93;
                                    ++n3;
                                    continue;
                                }
                                int cfr_ignored_26 = (Integer.rotateLeft(0xF295C45D ^ n4, 17) - 1686136446) * -225065891;
                                int cfr_ignored_27 = (int)(0x30276A6027D4EB4FL ^ (long)n4 ^ 0x29B0831A2DB9CD9FL);
                                n5 = Integer.reverse(Integer.reverse(n4 ^ 0xE5D808A7));
                                n3 -= 5;
                                continue;
                            }
                            int cfr_ignored_28 = (Integer.rotateLeft(0xFEF77D95 ^ n4, 18) - -464137146) * -17334891;
                            int cfr_ignored_29 = (int)(0x3C45D3A827D4EB4FL ^ (long)n4 ^ 0x5A20831A2DB9D55AL);
                            n5 = (int)((long)(n4 ^ 0x1F0242C6) ^ 0x1441116F8896909EL ^ 0x1441116F8896909EL);
                            int cfr_ignored_30 = (Integer.rotateRight(0xCACCB516 ^ n4, 12) - -1826124571) * -892553961;
                            n5 = (int)((long)(n4 ^ 0xA5FC664F) ^ 0x7D089B17C4401255L ^ 0x7D089B17C4401255L);
                            int cfr_ignored_31 = (Integer.rotateRight(0xC5C8256 ^ n4, 4) - -2087622747) * 207389271;
                            n5 = n4 ^ 0xE5D808A7;
                            --n3;
                            continue;
                        }
                        int cfr_ignored_32 = Integer.rotateLeft(0xDEDEA289 ^ n4, 14) + 22236626;
                        int cfr_ignored_33 = (int)(0x1C6C0CB427D4EB4FL ^ (long)n4 ^ 0xE418831A2DB99509L);
                        n5 = Integer.reverse(Integer.reverse(n4 ^ 0xE5D808A7));
                        --n3;
                        continue;
                    }
                    int cfr_ignored_34 = Integer.rotateLeft(0x9DDF30A9 ^ n4, 6) + 577012658;
                    int cfr_ignored_35 = (int)(0x5F6D9E9427D4EB4FL ^ (long)n4 ^ 0xC058831A2DB9130AL);
                    n5 = Integer.reverse(Integer.reverse(n4 ^ 0xF8DDD2E8));
                    int cfr_ignored_36 = Integer.rotateRight(0x545B9DC3 ^ n4, 13) + 997571032;
                    try {
                        ++n3;
                        if ((0xF81469C167D0B5DDL ^ (long)n4 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n5 = n4 ^ 0xE5D808A7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n5 = Integer.reverse(Integer.reverse(n4 ^ 0xE5D808A7));
                    }
                    n3 += 2;
                    continue;
                }
                return n2;
            }
            int cfr_ignored_37 = Integer.rotateLeft(0x8C3BC4ED ^ n4, 4) - -6653970;
            int cfr_ignored_38 = (int)(0x4E896AD027D4EB4FL ^ (long)n4 ^ 0x28D0831A2DB930C3L);
            n5 = (int)((long)(n4 ^ 0xE5D808A7) ^ 0xC9B5AA5F40BA9002L ^ 0xC9B5AA5F40BA9002L);
        }
    }

    private int ghdn(int n, float f) {
        byq byq2;
        try {
            int n2 = -1307228683;
            n2 = Integer.rotateLeft(n2 * 679982595, 9) ^ 0xD0624F16;
            n2 = System.identityHashCode(this) ^ n2;
            n2 = Integer.rotateRight(n ^ n2, 14);
            int n3 = n2 ^ 0xCC9B69B2;
            if ((n3 ^ n2) != -862230094) {
                int cfr_ignored_0 = (0x7E8E2C47 ^ n2) + 427670246;
            }
            if ((0x14E & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (this.dhshsh.shghkh()) {
            float f2 = (float)((System.currentTimeMillis() / (0xFFC87719F8F24D7AL ^ 0xFFC87719F8F24D76L) + (long)n * (0x31363CD030506480L ^ 0x31363CD03050649BL)) % (0x13933A8C0D7FE6AAL ^ 0x13933A8C0D7FE7C2L)) / Float.intBitsToFloat(0xE781E144 ^ 0xA435E144);
            byq2 = byq.slz_2(f2, Float.intBitsToFloat(Integer.rotateLeft(0xDC325096 ^ 0x1FC1D588, 4)), 1.0f);
        } else {
            byq2 = this.jhf_2.shghkh() ? this.tghh.sdsh_4() : bhj_2.ths();
        }
        return byq2.tkhl_2(class_3532.method_15363((float)(f * Float.intBitsToFloat(Integer.rotateLeft(0xBEC50AF8 ^ 0x7EC51A27, 18))), (float)0.0f, (float)Float.intBitsToFloat(346162473 - -786234071))).rk();
    }

    private void khwn(ksh ksh2) {
        class_1297 class_12972;
        int n = bkdh.shadh_2(-313092180);
        n = System.identityHashCode(this) ^ n;
        ksh ksh3 = ksh2;
        n = (ksh3 != null ? System.identityHashCode(ksh3) : 0) ^ n;
        int n2 = n ^ 0x70985CDC;
        if ((n2 ^ n) != 1889033436) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x9DCECB70 ^ n, 6) + 543703499) * -1647391887;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (rkh.mc.field_1724 == null || rkh.mc.field_1687 == null || !((class_12972 = ksh2.jthm()) instanceof class_1309)) {
            return;
        }
        class_1309 class_13092 = (class_1309)class_12972;
        if (class_13092 == rkh.mc.field_1724 || !this.bks(class_13092)) {
            return;
        }
        this.zyh_3(class_13092);
    }

    private boolean tzz_2() {
        block0: {
            int n = bkdh.shadh_2(-1535218986);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 27);
            int n2 = n ^ 0xBFBE738D;
            if ((n2 ^ n) == -1078037619) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x1BC0195B ^ n, 6) + 1621143872) * 465574235;
        }
        return this.hnl.shghkh();
    }

    private boolean thza_2() {
        int n = bkdh.shadh_2(1659349552);
        int n2 = n ^ 0x40078B78;
        if ((n2 ^ n) != 1074236280) {
            int cfr_ignored_0 = Integer.rotateLeft(0x22E02148 ^ n, 7) + 1031907059;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.jhf_2.shghkh();
    }

    private static String zlz(String string, int n, int n2, int n3) {
        int n4 = 2140022466;
        n4 = Integer.rotateLeft(n4 * -172930893, 3) ^ 0xA33231D1;
        int n5 = (n4 = n3 ^ n4) ^ 0x110854C1;
        if ((n5 ^ n4) != 285758657) {
            int cfr_ignored_0 = (0x6E867203 ^ n4) - -847368367;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xD30171CD ^ n2 - i) + jghj, 26) ^ bldh + i * -655907051));
        }
        return new String(cArray);
    }

    private static boolean khtd_3(s_3 s2) {
        block0: {
            int n = 662916374;
            n = Integer.rotateLeft(n * -389814637, 14) ^ 0xF7F358A1;
            s_3 s3 = s2;
            n = (s3 != null ? System.identityHashCode(s3) : 0) ^ n;
            int n2 = n ^ 0x7733CD38;
            if ((n2 ^ n) == 1999883576) break block0;
            int cfr_ignored_0 = (0x50B0802E ^ n) - -2047331278;
        }
        return s2.alh();
    }

    private static double rf(double d) {
        block0: {
            int n = -490663950;
            n = Integer.rotateLeft(n * 858240193, 12) ^ 0xE777DED1;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x4C113DCA;
            if ((n2 ^ n) == 1276198346) break block0;
            int cfr_ignored_0 = (0xAED03238 ^ n) + -50300712;
        }
        return Math.cos(d);
    }

    private static double rkw(class_1309 class_13092) {
        block0: {
            int n = bkdh.shadh_2(438664122);
            int n2 = n ^ 0x8A90AA3D;
            if ((n2 ^ n) == -1970230723) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x90B5D187 ^ n, 5) - -1973289324;
        }
        return class_13092.method_23317();
    }

    private static double shngh(class_1309 class_13092) {
        block0: {
            int n = 1087114165;
            n = Integer.rotateLeft(n * 1591950879, 3) ^ 0x48B068B1;
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0xEF43F0E6;
            if ((n2 ^ n) == -280760090) break block0;
            int cfr_ignored_0 = (0xAF8FFB53 ^ n) + -1597864717;
        }
        return class_13092.method_23318();
    }

    private static double ghzdh_2(long l) {
        block0: {
            int n = 2047248495;
            n = Integer.rotateLeft(n * -1670044583, 10) ^ 0xD367BA9A;
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 22)) ^ 0x9A0E6A86;
            if ((n2 ^ n) == -1710331258) break block0;
            int cfr_ignored_0 = (0xE008E2E9 ^ n) - 1932504500;
        }
        return Double.longBitsToDouble(l);
    }

    private static float zshr(class_1309 class_13092) {
        block0: {
            int n = bkdh.shadh_2(1860562101);
            int n2 = n ^ 0x1EC89BCD;
            if ((n2 ^ n) == 516463565) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x702D7778 ^ n, 17) + -1713432893) * 1882027897;
        }
        return class_13092.method_17682();
    }

    private static double dkht(double d, double d2, double d3) {
        block0: {
            int n = -1043773431;
            n = Integer.rotateLeft(n * 1153257239, 23) ^ 0x5F8508B;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 6);
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0xBB97CBC5;
            if ((n2 ^ n) == -1147679803) break block0;
            int cfr_ignored_0 = (0x7A5E83CC ^ n) + -1109727418;
        }
        return class_3532.method_15350((double)d, (double)d2, (double)d3);
    }

    private static boolean zghy(badh_2 badh2) {
        block0: {
            int n = bkdh.shadh_2(-1607234250);
            int n2 = n ^ 0xED1E91E0;
            if ((n2 ^ n) == -316763680) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x4D2D1CD6 ^ n, 12) - 1557404965) * 1294802135;
        }
        return badh2.shzl();
    }

    private static class_243 shfm(rkh rkh2) {
        block0: {
            int n = bkdh.shadh_2(-1240219406);
            int n2 = n ^ 0x6FE8A4F6;
            if ((n2 ^ n) == 1877517558) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xD9FB6404 ^ n, 14) - 1775156151;
        }
        return rkh2.a_2();
    }

    private static class_243 rmd_2(class_238 class_2383) {
        block0: {
            int n = bkdh.shadh_2(2134858097);
            int n2 = n ^ 0x66E21EBD;
            if ((n2 ^ n) == 1726095037) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x19DD47CC ^ n, 6) - 640241903;
        }
        return class_2383.method_1005();
    }

    private static double sam_3(double d, double d2) {
        block0: {
            int n = 76724384;
            int n2 = (n = Integer.rotateLeft(n * 972780895, 19) ^ 0xD122F22) ^ 0x757E644D;
            if ((n2 ^ n) == 1971217485) break block0;
            int cfr_ignored_0 = (0x71ECDCED ^ n) - 602829123;
        }
        return Math.max(d, d2);
    }

    private static class_238 aghs(class_1309 class_13092) {
        block0: {
            int n = bkdh.shadh_2(-1635523050);
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0xFBD2D46F;
            if ((n2 ^ n) == -70069137) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x65513279 ^ n, 15) + 1228061666) * 1699820153;
            int cfr_ignored_1 = (int)(0xA7E39C4427D4EB4FL ^ (long)n ^ 0xC5F8831A2DB8E216L);
        }
        return class_13092.method_5829();
    }

    private static class_243 thdth(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = bkdh.shadh_2(990863752);
            class_243 class_2434 = class_2432;
            n = (class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n;
            class_243 class_2435 = class_2433;
            n = (class_2435 != null ? System.identityHashCode(class_2435) : 0) ^ n;
            int n2 = n ^ 0xAA45D513;
            if ((n2 ^ n) == -1438264045) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x914AB49B ^ n, 5) + -1670808064) * -1857375077;
        }
        return class_2432.method_1019(class_2433);
    }

    private static Optional tzsh_2(class_238 class_2383, class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = -860691198;
            n = Integer.rotateLeft(n * 428553857, 20) ^ 0xF1566DF2;
            class_238 class_2384 = class_2383;
            n = (class_2384 != null ? System.identityHashCode(class_2384) : 0) ^ n;
            class_243 class_2434 = class_2433;
            n = Integer.rotateRight((class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n, 23);
            int n2 = n ^ 0xCE08FE39;
            if ((n2 ^ n) == -838271431) break block0;
            int cfr_ignored_0 = (0x2BA1B3B ^ n) - 1466713344;
        }
        return class_2383.method_992(class_2432, class_2433);
    }

    private static class_243 hmh(class_238 class_2383) {
        block0: {
            int n = 569129082;
            n = Integer.rotateLeft(n * 661977097, 15) ^ 0xCA0AA6BD;
            class_238 class_2384 = class_2383;
            n = Integer.rotateRight((class_2384 != null ? System.identityHashCode(class_2384) : 0) ^ n, 2);
            int n2 = n ^ 0xAEDA3E67;
            if ((n2 ^ n) == -1361428889) break block0;
            int cfr_ignored_0 = (0x8F36061D ^ n) + 1128930590;
        }
        return class_2383.method_1005();
    }

    private static boolean dhnh(ny ny2) {
        block0: {
            int n = -323452457;
            int n2 = (n = Integer.rotateLeft(n * 1246234965, 4) ^ 0x3510B99B) ^ 0xCBBF4DC2;
            if ((n2 ^ n) == -876655166) break block0;
            int cfr_ignored_0 = (0x2707CC15 ^ n) - -639433869;
        }
        return ny2.smf();
    }

    private static float rwh(lb lb2) {
        block0: {
            int n = -1478587854;
            int n2 = (n = Integer.rotateLeft(n * -1155524779, 7) ^ 0xAE55F6A5) ^ 0x70F3A11E;
            if ((n2 ^ n) == 1895014686) break block0;
            int cfr_ignored_0 = (0xD72D2B2C ^ n) + 1360893952;
        }
        return lb2.sry();
    }

    private static class_243 tnd_4(rkh rkh2, float f, float f2) {
        block0: {
            int n = 1410973991;
            n = Integer.rotateLeft(n * -1020449657, 28) ^ 0x5B86AE1;
            rkh rkh3 = rkh2;
            n = Integer.rotateLeft((rkh3 != null ? System.identityHashCode(rkh3) : 0) ^ n, 13);
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 25);
            int n2 = n ^ 0x11A9D257;
            if ((n2 ^ n) == 296342103) break block0;
            int cfr_ignored_0 = (0x45B01370 ^ n) - -858226311;
        }
        return rkh2.sdht_3(f, f2);
    }

    private static float tdhh_3(int n) {
        block0: {
            int n2 = 1844374874;
            n2 = Integer.rotateLeft(n2 * -1154361377, 25) ^ 0x1789A574;
            int n3 = (n2 = n ^ n2) ^ 0x3CF365BA;
            if ((n3 ^ n2) == 1022584250) break block0;
            int cfr_ignored_0 = (0x511D88E0 ^ n2) + 836026726;
        }
        return Float.intBitsToFloat(n);
    }

    private static int sha_6(int n, int n2) {
        block0: {
            int n3 = -1263060212;
            n3 = Integer.rotateLeft(n3 * -1860217343, 4) ^ 0x1A346B46;
            int n4 = (n3 = Integer.rotateRight(n ^ n3, 28)) ^ 0x7E24536;
            if ((n4 ^ n3) == 132269366) break block0;
            int cfr_ignored_0 = (0xB3557E3A ^ n3) + -1026537867;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float sjy_2(float f) {
        block0: {
            int n = -395121463;
            n = Integer.rotateLeft(n * 192219785, 7) ^ 0x1BC08A55;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xB60E975A;
            if ((n2 ^ n) == -1240557734) break block0;
            int cfr_ignored_0 = (0x5E7C7B93 ^ n) - 150801318;
        }
        return class_3532.method_15374((float)f);
    }

    private static float sya_3(float f) {
        block0: {
            int n = -1163961432;
            n = Integer.rotateLeft(n * 535799993, 18) ^ 0xF571AD2;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x8E32277B;
            if ((n2 ^ n) == -1909315717) break block0;
            int cfr_ignored_0 = (0x34AD7CD3 ^ n) + 802033948;
        }
        return class_3532.method_15374((float)f);
    }

    private static boolean tzq_2(class_1309 class_13092) {
        block0: {
            int n = -1478214310;
            n = Integer.rotateLeft(n * 2011821525, 15) ^ 0x32668A8C;
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0xF7E084F8;
            if ((n2 ^ n) == -136280840) break block0;
            int cfr_ignored_0 = (0x5004B9A2 ^ n) + 96154225;
        }
        return class_13092.method_31481();
    }

    private static class_1937 dyh(class_1309 class_13092) {
        block0: {
            int n = -82798687;
            int n2 = (n = Integer.rotateLeft(n * -238234727, 26) ^ 0x1EC428C4) ^ 0xC74B4BB1;
            if ((n2 ^ n) == -951366735) break block0;
            int cfr_ignored_0 = (0x3C5BDC10 ^ n) - -602431267;
        }
        return class_13092.method_37908();
    }

    private static double zlgh(class_1309 class_13092) {
        block0: {
            int n = bkdh.shadh_2(1109422397);
            class_1309 class_13093 = class_13092;
            n = Integer.rotateLeft((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 24);
            int n2 = n ^ 0xA0C7965;
            if ((n2 ^ n) == 168589669) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x482C0858 ^ n, 12) + -1045257757) * 1210845273;
        }
        return class_13092.method_23321();
    }

    private static double khhz_4(double d) {
        block0: {
            int n = bkdh.shadh_2(1883468997);
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 28);
            int n2 = n ^ 0x1A52BCDE;
            if ((n2 ^ n) == 441629918) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x6A11C81B ^ n, 16) + -595273088) * 1779550235;
        }
        return Math.cos(d);
    }

    private static double khab(double d) {
        block0: {
            int n = bkdh.shadh_2(-707548866);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 20);
            int n2 = n ^ 0xC6E47099;
            if ((n2 ^ n) == -958107495) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x1337D9A7 ^ n, 5) - 1478556276;
        }
        return Math.sin(d);
    }

    private static int zzz_2(rkh rkh2, int n, float f) {
        block0: {
            int n2 = bkdh.shadh_2(-548698493);
            rkh rkh3 = rkh2;
            n2 = Integer.rotateLeft((rkh3 != null ? System.identityHashCode(rkh3) : 0) ^ n2, 13);
            int n3 = (n2 = n ^ n2) ^ 0x79AE7D5C;
            if ((n3 ^ n2) == 2041478492) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xA6E5FBDF ^ n2, 7) - 976691004) * -1494877217;
        }
        return rkh2.rjl(n, f);
    }

    private static void akk(rkh rkh2, class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int n, int n2, int n3, int n4) {
        int n5 = 720477626;
        n5 = Integer.rotateLeft(n5 * -1837255301, 21) ^ 0x6A521596;
        class_287 class_2873 = class_2872;
        n5 = Integer.rotateLeft((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n5, 25);
        n5 = Integer.rotateRight(Float.floatToIntBits(f) ^ n5, 28);
        int n6 = n5 ^ 0xE161B11;
        if ((n6 ^ n5) != 236329745) {
            int cfr_ignored_0 = (0x24E786AB ^ n5) - 1918819647;
        }
        rkh2.dta_6(class_2872, matrix4f, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, n, n2, n3, n4);
    }

    private static int ghkht(rkh rkh2, int n, float f) {
        block0: {
            int n2 = -509741117;
            n2 = Integer.rotateLeft(n2 * 893179907, 12) ^ 0xE82A5510;
            rkh rkh3 = rkh2;
            n2 = (rkh3 != null ? System.identityHashCode(rkh3) : 0) ^ n2;
            n2 = Float.floatToIntBits(f) ^ n2;
            int n3 = n2 ^ 0xB562257C;
            if ((n3 ^ n2) == -1251859076) break block0;
            int cfr_ignored_0 = (0x54FFD2BF ^ n2) - -903161414;
        }
        return rkh2.rjl(n, f);
    }

    private static void skhl(rkh rkh2, class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int n, int n2, int n3, int n4) {
        int n5 = bkdh.shadh_2(-1865600175);
        rkh rkh3 = rkh2;
        n5 = (rkh3 != null ? System.identityHashCode(rkh3) : 0) ^ n5;
        class_287 class_2873 = class_2872;
        n5 = (class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n5;
        int n6 = n5 ^ 0xD4A20338;
        if ((n6 ^ n5) != -727579848) {
            int cfr_ignored_0 = Integer.rotateLeft(0x446F3069 ^ n5, 11) + 1305770994;
            int cfr_ignored_1 = (int)(0x86DD9E5427D4EB4FL ^ (long)n5 ^ 0xC1D8831A2DB8A06AL);
        }
        rkh2.dta_6(class_2872, matrix4f, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, n, n2, n3, n4);
    }

    private static int shbz_2(rkh rkh2, int n, float f) {
        block0: {
            int n2 = bkdh.shadh_2(113047722);
            int n3 = (n2 = n ^ n2) ^ 0x39BB89B1;
            if ((n3 ^ n2) == 968591793) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x3F07711B ^ n2, 10) + -1505472128) * 1057452315;
        }
        return rkh2.rjl(n, f);
    }

    private static String[] thts_2(String string) {
        block0: {
            int n = -731404691;
            n = Integer.rotateLeft(n * -1814587955, 15) ^ 0xE85EEE5E;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x221905B9;
            if ((n2 ^ n) == 572065209) break block0;
            int cfr_ignored_0 = (0xF67EA3D4 ^ n) + 1852896596;
        }
        return string.split("\u0001\u0012", -1);
    }

    private static CallSite rrgh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1235696753;
            n3 = Integer.rotateLeft(n3 * -2090862499, 13) ^ 0x9ACDB251;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x94E9B7FB;
            if ((n4 ^ n3) != -1796622341) {
                int cfr_ignored_0 = (0xDD4E8B8A ^ n3) + 1867702218;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ khza_3 ^ string.hashCode()) + (n2 + btb_2) + i ^ khza_3, 14) + btb_2);
            }
            String[] stringArray = rkh.thts_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ptgo7xsnbe8cy(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite guovld2f1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ohe5tdj8j ^ string.hashCode() ^ n2 + v90nq0v ^ i * -2098559301 ^ ohe5tdj8j, 17) ^ v90nq0v));
            }
            String[] stringArray = rkh.ptgo7xsnbe8cy(new String(cArray));
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

