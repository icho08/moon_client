/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587
 *  net.minecraft.class_746
 *  net.minecraft.class_7833
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Generated;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_746;
import net.minecraft.class_7833;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bdd_4;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.ja_2;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Comets", category=bzw.OTHER, desc="Horizontal comet streaks flying across the sky")
public class nm
extends bnq {
    private static nm skhf;
    private final tay skb = new tay(this, "Amount").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(259646734) ^ 0x32EF9EF0)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(-684871150 - -1775390190));
    private final tay zja = new tay(this, "Speed").shth_7(Float.intBitsToFloat(0x54B650ED ^ 0x6BB650ED)).dhbs_2(Float.intBitsToFloat(0x602E0FC3 ^ 0x212E0FC3)).rkh_3(Float.intBitsToFloat(Integer.reverse(899189883) ^ 0xE3FDD561)).ssd_5(Float.intBitsToFloat(-112771989 + 1188610965));
    private final tay dhmth = new tay(this, "Lifetime").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(230252966 + 867606106)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x4A1ADB73 ^ 0x4A1ADB0D, 23))).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xBD460891 ^ 0xBD562091, 10)));
    private final khd dhnh_2 = new khd(this, "Direction");
    private final fy hghs = new fy(this.dhnh_2, "North");
    private final fy dwz = new fy(this.dhnh_2, "South");
    private final fy thysh = new fy(this.dhnh_2, "East");
    private final fy f_2 = new fy(this.dhnh_2, "West");
    private final fy dthd_2 = new fy(this.dhnh_2, "North-East");
    private final fy zwh_2 = new fy(this.dhnh_2, "North-West");
    private final fy khsdh_2 = new fy(this.dhnh_2, "South-East");
    private final fy rnn = new fy(this.dhnh_2, "South-West");
    private final tay tna_2 = new tay(this, "Base Height").shth_7(Float.intBitsToFloat(Integer.reverse(1188214500) ^ 0x67CD4B62)).dhbs_2(Float.intBitsToFloat(0x6A7AA99B ^ 0x280AA99B)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.reverse(-929363271) ^ 0xDCF0D913));
    private final tay dhzy_2 = new tay(this, "Height ".concat("Variance")).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xAEC81EBD ^ 0xACC51EBD, 5))).rkh_3(Float.intBitsToFloat(277303963 + 779660645)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x7EB04AF ^ 0x56B04AE, 30)));
    private final tay dhbf = new tay(this, "Spawn ".concat("Radius")).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x78D6157 ^ 0x39F6157, 4))).dhbs_2(Float.intBitsToFloat(-354482503 + 1472264519)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.reverse(801695498) ^ 0x12C713F4));
    private final tay tkhkh = new tay(this, "Trail Length").shth_7(Float.intBitsToFloat(Integer.reverse(1975999500) ^ 0x709AE3AE)).dhbs_2(Float.intBitsToFloat(0xD7C90283 ^ 0x95690283)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x83D7BB3A ^ 0x8353A33A, 7)));
    private final tay tns = new tay(this, "Trail Width").shth_7(Float.intBitsToFloat(-384336255 - -1393318025)).dhbs_2(Float.intBitsToFloat(-1012649893 - -2062903615)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x677933E4 ^ 0xB0730847, 16))).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x2F9B84A ^ 0xAC41E9AD, 27)));
    private final tay khkz_2 = new tay(this, "Head Size").shth_7(Float.intBitsToFloat(-747847166 + 1804811774)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xB5EF2400 ^ 0xB1E32400, 4))).rkh_3(Float.intBitsToFloat(0x32E65DF5 ^ 0xC665DF5)).ssd_5(Float.intBitsToFloat(Integer.reverse(74511771) ^ 0x998F0E20));
    private final badh_2 dza_4 = new badh_2(this, "Head Glow").bts(true);
    private final tay srh_2 = new tay(this, "Opacity").shth_7(Float.intBitsToFloat(831272098 + 280742750)).dhbs_2(Float.intBitsToFloat(0xEE686DB2 ^ 0xAD176DB2)).rkh_3(Float.intBitsToFloat(881976674 - -202250910)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x4A15310E ^ 0x5AC2310E, 2)));
    private final badh_2 ss_2 = new badh_2(this, "Theme Color").bts(true);
    private final bzw_2 tghm = new bzw_2(this, "Color", this::khzgh_2).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(1381349987) ^ 0x8515AA4A), Float.intBitsToFloat(-1144253051 + -2020611461), Float.intBitsToFloat(-1723300781 + -1439269971), Float.intBitsToFloat(Integer.reverse(976876529) ^ 0xCCB09C5C)));
    private final CopyOnWriteArrayList dnr = new CopyOnWriteArrayList();
    private long dsha = 0L;
    private static final class_2960 tha_4;
    private static final class_2960 tkha;
    private static final float drr = 1.5707964f;
    private final bql<btt> baa_4 = this::jdhs_2;
    private final bql<shw_3> khdz = this::tdhr_2;
    private static final int thdt_4 = 1998841418;
    private static final int sjdh = -634657710;
    private static final int sthsh = -1890962553;
    private static final int jka_2 = -356774786;
    private static final int askj0phkq = 15560897;
    private static final int i5f87oj1tjqj = -2067958904;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int k6bcxdz5b14;

    public nm() {
        skhf = this;
    }

    @Override
    public void nc() {
        int n = 1172673040;
        n = Integer.rotateLeft(n * 7967017, 23) ^ 0xC00951AA;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x751835B4;
        if ((n2 ^ n) != 1964520884) {
            int cfr_ignored_0 = (0x30FDA7A4 ^ n) + -329071293;
        }
        this.dnr.clear();
    }

    private void stt_3() {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        int n = 0;
        int n2 = -1176373157;
        n2 = Integer.rotateLeft(n2 * -292157611, 22) ^ 0x1C91DAA6;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 20);
        int n3 = (int)((long)(-1896454912 * 275614767 + -618602417 ^ n2) ^ 0x101262E51375CCDAL ^ 0x101262E51375CCDAL);
        while (true) {
            block18: {
                block28: {
                    block20: {
                        block25: {
                            block16: {
                                block27: {
                                    block19: {
                                        block21: {
                                            block17: {
                                                block30: {
                                                    block29: {
                                                        block23: {
                                                            block15: {
                                                                block24: {
                                                                    block26: {
                                                                        block22: {
                                                                            block13: {
                                                                                block14: {
                                                                                    if ((n = ((n3 ^ n2) - -618602417) * -39372081) > -649352771) break block13;
                                                                                    if (n > -1701103857) break block14;
                                                                                    if (n == -1896454912) break block15;
                                                                                    if (n == -1889291922) break block16;
                                                                                    int cfr_ignored_0 = Integer.rotateRight(0xC081BB6E ^ n2, 11) - 1410552205;
                                                                                    if (n == -1701103857) break block17;
                                                                                    break block18;
                                                                                }
                                                                                if (n == -1073119255) break block19;
                                                                                if (n == -727671802) break block20;
                                                                                int cfr_ignored_1 = (Integer.rotateRight(0x2884325E ^ n2, 8) - -329271139) * 679752287;
                                                                                if (n == -649352771) break block21;
                                                                                break block18;
                                                                            }
                                                                            if (n > 1081559002) break block22;
                                                                            if (n == -352323178) break block23;
                                                                            if (n == -131626027) break block24;
                                                                            int cfr_ignored_2 = Integer.rotateLeft(0xBB7B214D ^ n2, 10) - -1203329138;
                                                                            int cfr_ignored_3 = (int)(0x79C98F7027D4EB4FL ^ (long)n2 ^ 0xE390831A2DB95E42L);
                                                                            if (n == 1081559002) break block25;
                                                                            break block18;
                                                                        }
                                                                        if (n > 1481798584) break block26;
                                                                        if (n == 1219440337) break block27;
                                                                        if (n == 1481798584) break block28;
                                                                        break block18;
                                                                    }
                                                                    if (n == 1695568339) break block29;
                                                                    if (n == 1793119538) break block30;
                                                                    break block18;
                                                                }
                                                                int cfr_ignored_4 = (Integer.rotateLeft(0x6894B990 ^ n2, 16) + -1369434197) * 1754577297;
                                                                ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
                                                                f = this.dhbf.hkj();
                                                                f2 = this.dhzy_2.hkj();
                                                                f3 = this.tna_2.hkj();
                                                                f4 = this.tad_5();
                                                                f5 = this.dhhdh();
                                                                f6 = -f5;
                                                                f7 = f4;
                                                                f8 = threadLocalRandom.nextFloat(-f, f);
                                                                f9 = threadLocalRandom.nextFloat(f * nm.shm_5(0x192EA6F1 ^ 0x27B73F6B), f);
                                                                d = nm.mc.field_1724.method_23317() - (double)(f4 * f9) + (double)(f6 * f8);
                                                                d2 = nm.thrj(nm.mc.field_1724) - (double)(f5 * f9) + (double)(f7 * f8);
                                                                d3 = nm.mc.field_1724.method_23318() + (double)f3 + nm.dsn_4(threadLocalRandom, -f2, f2);
                                                                f10 = this.zja.hkj();
                                                                f11 = f4 * f10 * threadLocalRandom.nextFloat(nm.rqy(Integer.rotateLeft(0x217E051E ^ 0xCAFB1BCF, 17)), Float.intBitsToFloat(-496952427 - -1538146452));
                                                                f12 = f5 * f10 * threadLocalRandom.nextFloat(nm.shm_3(0x73EA7BFA ^ 0x4E49ACF0), Float.intBitsToFloat(Integer.rotateLeft(0x1E2B6A76 ^ 0x235BCE8E, 22)));
                                                                f13 = threadLocalRandom.nextFloat(Float.intBitsToFloat(-749726780 + -407699797), nm.khda_2(Integer.reverse(2065969891) ^ 0xFC4F36B1));
                                                                byq byq2 = this.sbf_2(threadLocalRandom.nextInt(-649713374 + 649713734));
                                                                f14 = nm.znh(this.dhmth) + threadLocalRandom.nextFloat(Float.intBitsToFloat(74940342 + -1165459382), nm.sght(nm.dzq_3(0x1DC1EB5F ^ 0x1DDE6B5F, 9)));
                                                                this.dnr.add(new bdd_4(this, (float)d, (float)d3, (float)d2, f11, f13, f12, byq2, Math.max(1.0f, f14)));
                                                                return;
                                                            }
                                                            int cfr_ignored_5 = Integer.rotateRight(0x265A6BCE ^ n2, 7) - -1454330579;
                                                            if (nm.mc.field_1724 == null) {
                                                                int cfr_ignored_6 = (int)(0x53575EE09D6A56E4L ^ (long)n2 ^ 0x40B1F66756EF0B7FL);
                                                                n3 = -352323178 * 275614767 + -618602417 ^ n2;
                                                                continue;
                                                            }
                                                            try {
                                                                n -= 3;
                                                                n3 = (int)((long)(-131626027 * 275614767 + -618602417 ^ n2) ^ 0x2F9611ED7B848C15L ^ 0x2F9611ED7B848C15L);
                                                            }
                                                            catch (NoSuchElementException noSuchElementException) {
                                                                n3 = (-131626027 * 275614767 + -618602417 ^ n2) + -691967613 - -691967613;
                                                            }
                                                            n += 3;
                                                            continue;
                                                        }
                                                        int cfr_ignored_7 = (Integer.rotateRight(0x2FDC1F16 ^ n2, 8) - -804953371) * 802955031;
                                                        return;
                                                    }
                                                    int cfr_ignored_8 = (Integer.rotateRight(0xA7E030FB ^ n2, 7) + 1485016480) * -1478479621;
                                                    n3 = -1082357617 * 275614767 + -618602417 ^ n2 ^ 0x7C6AAF4 ^ 0x7C6AAF4;
                                                    int cfr_ignored_9 = Integer.rotateLeft(0xC9FCB888 ^ n2, 12) + 2046293939;
                                                    n3 = Integer.reverse(Integer.reverse(-415848421 * 275614767 + -618602417 ^ n2));
                                                    int cfr_ignored_10 = Integer.rotateLeft(0x6719B560 ^ n2, 15) + -2139449893;
                                                    n3 = -1896454912 * 275614767 + -618602417 ^ n2;
                                                    n -= 5;
                                                    continue;
                                                }
                                                int cfr_ignored_11 = (Integer.rotateLeft(0xFCF48E55 ^ n2, 18) - -1510286458) * -51081643;
                                                int cfr_ignored_12 = (int)(0x3E46206827D4EB4FL ^ (long)n2 ^ 0xBDA0831A2DB9D15DL);
                                                try {
                                                    if ((0x2D4A63C6E36EEF95L ^ (long)n2 | 1L) == 0L) {
                                                        throw new ArithmeticException();
                                                    }
                                                    n3 = Integer.reverse(Integer.reverse(-1896454912 * 275614767 + -618602417 ^ n2));
                                                }
                                                catch (ArithmeticException arithmeticException) {
                                                    n3 = -1896454912 * 275614767 + -618602417 ^ n2;
                                                }
                                                continue;
                                            }
                                            int cfr_ignored_13 = Integer.rotateRight(0xB7A25E2F ^ n2, 9) - 1090979564;
                                            int cfr_ignored_14 = (int)(0xCEE827E88026C1C5L ^ (long)n2 ^ 0xB2A1CCFE78AC3001L);
                                            n3 = (int)((long)(-782648912 * 275614767 + -618602417 ^ n2) ^ 0xD1DE128D0F963353L ^ 0xD1DE128D0F963353L);
                                            int cfr_ignored_15 = (int)(0xADA73712EE87527DL ^ (long)n2 ^ 0x935511BD5FDCF69FL);
                                            n3 = -1896454912 * 275614767 + -618602417 ^ n2 ^ 0x3C10B504 ^ 0x3C10B504;
                                            n -= 4;
                                            continue;
                                        }
                                        int cfr_ignored_16 = (Integer.rotateLeft(0xD238C2F5 ^ n2, 13) - 2034055910) * -768032011;
                                        int cfr_ignored_17 = (int)(0x108A6CC827D4EB4FL ^ (long)n2 ^ 0x24E0831A2DB98CC5L);
                                        n3 = (1327058702 * 275614767 + -618602417 ^ n2) + -473586032 - -473586032;
                                        int cfr_ignored_18 = Integer.rotateRight(0x276A8A0B ^ n2, 7) + -901491056;
                                        int cfr_ignored_19 = (int)(0x2D7DE2E8E3933BAAL ^ (long)n2 ^ 0x38A10B958C73F72AL);
                                        n3 = Integer.reverse(Integer.reverse(-1896454912 * 275614767 + -618602417 ^ n2));
                                        ++n;
                                        continue;
                                    }
                                    int cfr_ignored_20 = Integer.rotateRight(0x155477C3 ^ n2, 5) + -1718083624;
                                    n3 = Integer.reverse(Integer.reverse(678573275 * 275614767 + -618602417 ^ n2));
                                    int cfr_ignored_21 = Integer.rotateLeft(0x6537EF2D ^ n2, 15) - 1176737198;
                                    int cfr_ignored_22 = (int)(0xA785411027D4EB4FL ^ (long)n2 ^ 0x7F50831A2DB8E2DBL);
                                    n3 = (-1896454912 * 275614767 + -618602417 ^ n2) + -1283740731 - -1283740731;
                                    n -= 3;
                                    continue;
                                }
                                int cfr_ignored_23 = (Integer.rotateRight(0xD2A19057 ^ n2, 13) - -2047993404) * -761163689;
                                n3 = -1896454912 * 275614767 + -618602417 ^ n2 ^ 0x565452A7 ^ 0x565452A7;
                                int cfr_ignored_24 = (Integer.rotateRight(0xC424935E ^ n2, 11) - -993298531) * -1004235937;
                                ++n;
                                continue;
                            }
                            int cfr_ignored_25 = (Integer.rotateLeft(0x217B71D1 ^ n2, 7) + 307259274) * 561738193;
                            int cfr_ignored_26 = (int)(0xE3C9DFEC27D4EB4FL ^ (long)n2 ^ 0x42A8831A2DB86A42L);
                            n3 = 697918779 * 275614767 + -618602417 ^ n2 ^ 0x43829B6E ^ 0x43829B6E;
                            int cfr_ignored_27 = Integer.rotateLeft(0xD567985 ^ n2, 4) - -1579788714;
                            int cfr_ignored_28 = (int)(0xCFE4D7B827D4EB4FL ^ (long)n2 ^ 0x5200831A2DB83218L);
                            try {
                                n -= 5;
                                if ((0x93A283C69DD7665BL ^ (long)n2 | 1L) == 0L) {
                                    throw new IllegalArgumentException();
                                }
                                n3 = (-1896454912 * 275614767 + -618602417 ^ n2) + -791350841 - -791350841;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                n3 = (int)((long)(-1896454912 * 275614767 + -618602417 ^ n2) ^ 0xACBB5C13D470D0B9L ^ 0xACBB5C13D470D0B9L);
                            }
                            --n;
                            continue;
                        }
                        int cfr_ignored_29 = Integer.rotateLeft(0xFB447FE8 ^ n2, 18) + 1906908243;
                        n3 = -1896454912 * 275614767 + -618602417 ^ n2;
                        n -= 2;
                        continue;
                    }
                    int cfr_ignored_30 = Integer.rotateLeft(0xE56AB36D ^ n2, 15) - -867608210;
                    int cfr_ignored_31 = (int)(0x27D81D5027D4EB4FL ^ (long)n2 ^ 0xC7D0831A2DB9E261L);
                    try {
                        n -= 5;
                        if ((0x79BD4E87E74391DDL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = -1896454912 * 275614767 + -618602417 ^ n2 ^ 0x806F5543 ^ 0x806F5543;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (-1896454912 * 275614767 + -618602417 ^ n2) + 1468510816 - 1468510816;
                    }
                    ++n;
                    continue;
                }
                int cfr_ignored_32 = Integer.rotateLeft(0xC063228C ^ n2, 11) - 1348390447;
                n3 = (int)((long)(1714024680 * 275614767 + -618602417 ^ n2) ^ 0xFEEFCDC452658B08L ^ 0xFEEFCDC452658B08L);
                int cfr_ignored_33 = (Integer.rotateLeft(0xBFB203D ^ n2, 4) - 2009499294) * 201007165;
                int cfr_ignored_34 = (int)(0xC9498E0027D4EB4FL ^ (long)n2 ^ 0xE170831A2DB83F42L);
                int cfr_ignored_35 = (int)(0xE3B05A820B3BC641L ^ (long)n2 ^ 0x4874DAC477A46AB1L);
                n3 = -34468097 * 275614767 + -618602417 ^ n2;
                int cfr_ignored_36 = (int)(0x1C270CE3F7193A0CL ^ (long)n2 ^ 0xE4B722818F3F959FL);
                n3 = (int)((long)(-1896454912 * 275614767 + -618602417 ^ n2) ^ 0x78529AB41D29ADAFL ^ 0x78529AB41D29ADAFL);
                continue;
            }
            int cfr_ignored_37 = Integer.rotateLeft(0x80617BC9 ^ n2, 3) + -1876190062;
            int cfr_ignored_38 = (int)(0x42D3D5F427D4EB4FL ^ (long)n2 ^ 0x5698831A2DB92876L);
            n3 = -1896454912 * 275614767 + -618602417 ^ n2;
        }
    }

    private float tad_5() {
        if (this.hghs.shghkh()) {
            return 0.0f;
        }
        if (this.dwz.shghkh()) {
            return 0.0f;
        }
        if (this.thysh.shghkh()) {
            return 1.0f;
        }
        if (this.f_2.shghkh()) {
            return -1.0f;
        }
        if (this.dthd_2.shghkh()) {
            return 0.7071f;
        }
        if (this.zwh_2.shghkh()) {
            return -0.7071f;
        }
        if (this.khsdh_2.shghkh()) {
            return 0.7071f;
        }
        if (this.rnn.shghkh()) {
            return -0.7071f;
        }
        return 0.0f;
    }

    private float dhhdh() {
        if (this.hghs.shghkh()) {
            return -1.0f;
        }
        if (this.dwz.shghkh()) {
            return 1.0f;
        }
        if (this.thysh.shghkh()) {
            return 0.0f;
        }
        if (this.f_2.shghkh()) {
            return 0.0f;
        }
        if (this.dthd_2.shghkh()) {
            return -0.7071f;
        }
        if (this.zwh_2.shghkh()) {
            return -0.7071f;
        }
        if (this.khsdh_2.shghkh()) {
            return 0.7071f;
        }
        if (this.rnn.shghkh()) {
            return 0.7071f;
        }
        return -1.0f;
    }

    /*
     * Unable to fully structure code
     */
    private byq sbf_2(int var1_1) {
        var2_2 = null;
        var5_3 = 0;
        var3_4 = 1825052348;
        var3_4 = Integer.rotateLeft(var3_4 * 73709771, 22) ^ 663513555;
        var4_5 = (int)((long)(1253039634 + var3_4) ^ 7101496776955614339L ^ 7101496776955614339L);
        block38: while (true) {
            if ((var5_3 = var4_5 - var3_4) == -724792021) ** GOTO lbl193
            if (var5_3 == 1428670328) ** GOTO lbl58
            switch (var5_3) {
                case 1253039634: {
                    Integer.rotateRight(1590039695 ^ var3_4, 14) - 2119834764;
                    if (nm.zkw_2()) {
                        try {
                            if ((-3978217636664581143L ^ (long)var3_4 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            var4_5 = 1404866735 + var3_4 ^ -646353669 ^ -646353669;
                        }
                        catch (IllegalArgumentException v0) {
                            var4_5 = Integer.reverse(Integer.reverse(1404866735 + var3_4));
                        }
                        var5_3 -= 3;
                        continue block38;
                    }
                    var4_5 = Integer.reverse(Integer.reverse(-1887326730 + var3_4));
                    Integer.rotateRight(479221763 ^ var3_4, 6) + 2044217240;
                    var4_5 = Integer.reverse(Integer.reverse(1428670328 + var3_4));
                    continue block38;
                }
                case 397989282: {
                    (Integer.rotateRight(-1186374926 ^ var3_4, 10) + 1950327433) * -1186374925;
                    var2_2 = this.tghm.sdsh_4();
                    try {
                        ++var5_3;
                        var4_5 = (int)((long)(437594142 + var3_4) ^ -4114974393357418744L ^ -4114974393357418744L);
                    }
                    catch (UnsupportedOperationException v1) {
                        var4_5 = (int)((long)(437594142 + var3_4) ^ -4147209868425478630L ^ -4147209868425478630L);
                    }
                    var5_3 += 2;
                    continue block38;
                }
                case -88686892: {
                    Integer.rotateLeft(-1032860379 ^ var3_4, 11) - -1880656202;
                    (int)(62314925251685199L ^ (long)var3_4 ^ 4269556595206761579L);
                    var2_2 = byq.tkhw(nm.amd_2(var1_1).getRGB());
                    (int)(-8504580936022775718L ^ (long)var3_4 ^ -6046754126672249310L);
                    var4_5 = -1339533149 + var3_4 ^ 547932652 ^ 547932652;
                    (int)(2696920058585123553L ^ (long)var3_4 ^ 4067581268817471243L);
                    var4_5 = 437594142 + var3_4 + 2018951494 - 2018951494;
                    ++var5_3;
                    continue block38;
                }
                case 1404866735: {
                    (Integer.rotateRight(-99591337 ^ var3_4, 18) - 1280880324) * -99591337;
                    throw null;
                }
lbl58:
                // 1 sources

                (Integer.rotateLeft(2077400441 ^ var3_4, 18) + 48148706) * 2077400441;
                (int)(-5089011211109602481L ^ (long)var3_4 ^ -7207867055147000047L);
                if (!this.ss_2.shzl()) {
                    (int)(-7698887041404471921L ^ (long)var3_4 ^ -2054280490877679743L);
                    var4_5 = 397989282 + var3_4 + 1399946907 - 1399946907;
                    var5_3 -= 4;
                    continue block38;
                }
                try {
                    --var5_3;
                    if ((-702851688713058025L ^ (long)var3_4 | 1L) == 0L) {
                        throw new UnsupportedOperationException();
                    }
                    var4_5 = -88686892 + var3_4 + -276726325 - -276726325;
                }
                catch (UnsupportedOperationException v2) {
                    var4_5 = (int)((long)(-88686892 + var3_4) ^ 8675207976540692701L ^ 8675207976540692701L);
                }
                continue block38;
                case -871591685: {
                    Integer.rotateRight(-267917433 ^ var3_4, 17) - 357738644;
                    var4_5 = -1543947787 + var3_4 + 827605740 - 827605740;
                    (Integer.rotateRight(1150489111 ^ var3_4, 11) - 1378668548) * 1150489111;
                    var4_5 = 1341589171 + var3_4 ^ 1117184101 ^ 1117184101;
                    (Integer.rotateLeft(1995865981 ^ var3_4, 17) - 1815547742) * 1995865981;
                    (int)(-5457006774989821105L ^ (long)var3_4 ^ 6913169576473183576L);
                    var4_5 = Integer.reverse(Integer.reverse(1253039634 + var3_4));
                    var5_3 -= 5;
                    continue block38;
                }
                case 1863858494: {
                    (Integer.rotateRight(-75173674 ^ var3_4, 18) - 2037827877) * -75173673;
                    try {
                        var5_3 += 4;
                        if ((5909690378427764897L ^ (long)var3_4 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var4_5 = Integer.reverse(Integer.reverse(1253039634 + var3_4));
                    }
                    catch (ArithmeticException v3) {
                        var4_5 = 1253039634 + var3_4;
                    }
                    var5_3 += 3;
                    continue block38;
                }
                case 975216302: {
                    Integer.rotateRight(-1236777877 ^ var3_4, 9) + 387835952;
                    var4_5 = -106725504 + var3_4;
                    Integer.rotateRight(-77581617 ^ var3_4, 18) - 1963181644;
                    (int)(6937986819560027580L ^ (long)var3_4 ^ -6777507473552085696L);
                    var4_5 = -804877583 + var3_4;
                    (int)(5820697056313702070L ^ (long)var3_4 ^ 8589641886057827423L);
                    var4_5 = (int)((long)(1253039634 + var3_4) ^ 7283282314701477706L ^ 7283282314701477706L);
                    var5_3 += 3;
                    continue block38;
                }
                case -1592889628: {
                    Integer.rotateLeft(-1217930747 ^ var3_4, 9) - 972096982;
                    (int)(8490820457012194127L ^ (long)var3_4 ^ 1513353623255991931L);
                    var4_5 = -131601391 + var3_4 + 353316575 - 353316575;
                    Integer.rotateLeft(1222053665 ^ var3_4, 12) + -697797574;
                    (int)(-8474189981528298673L ^ (long)var3_4 ^ -4663333265682679526L);
                    try {
                        if ((-6954855885054088333L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var4_5 = 1253039634 + var3_4 ^ -1501013943 ^ -1501013943;
                    }
                    catch (IllegalStateException v4) {
                        var4_5 = 1253039634 + var3_4 + 1831548189 - 1831548189;
                    }
                    var5_3 += 3;
                    continue block38;
                }
                case -2126927654: {
                    (Integer.rotateLeft(-154604932 ^ var3_4, 17) - -424541121) * -154604931;
                    try {
                        var5_3 -= 4;
                        if ((7347776785906268893L ^ (long)var3_4 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var4_5 = 1253039634 + var3_4 + 0x5A52A225 - 0x5A52A225;
                    }
                    catch (ArithmeticException v5) {
                        var4_5 = 1253039634 + var3_4 ^ -1466740573 ^ -1466740573;
                    }
                    continue block38;
                }
                case 951479960: {
                    Integer.rotateLeft(716144556 ^ var3_4, 8) - 798889231;
                    var4_5 = -1293437744 + var3_4 ^ -780871316 ^ -780871316;
                    Integer.rotateLeft(-581082108 ^ var3_4, 14) - -760431689;
                    try {
                        var5_3 += 2;
                        if ((7717525659119762527L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var4_5 = 1253039634 + var3_4;
                    }
                    catch (IllegalArgumentException v6) {
                        var4_5 = 1253039634 + var3_4 ^ -874614545 ^ -874614545;
                    }
                    var5_3 -= 2;
                    continue block38;
                }
                case 1617236199: {
                    (Integer.rotateLeft(2125779732 ^ var3_4, 18) - 1547906727) * 2125779733;
                    try {
                        var5_3 += 2;
                        if ((9005748684678349805L ^ (long)var3_4 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var4_5 = 1253039634 + var3_4 ^ -89919908 ^ -89919908;
                    }
                    catch (UnsupportedOperationException v7) {
                        var4_5 = 1253039634 + var3_4;
                    }
                    var5_3 -= 3;
                    continue block38;
                }
                case -910764592: {
                    Integer.rotateRight(1259289923 ^ var3_4, 12) + 456526424;
                    var4_5 = -389604439 + var3_4 ^ 1135320491 ^ 1135320491;
                    Integer.rotateLeft(585208937 ^ var3_4, 7) + 1034852338;
                    (int)(-2282416453026780337L ^ (long)var3_4 ^ -8513910947084472969L);
                    (int)(286656901815167333L ^ (long)var3_4 ^ 3219271662015719973L);
                    var4_5 = (int)((long)(872313133 + var3_4) ^ 4868274731731484961L ^ 4868274731731484961L);
                    (int)(-8509239698511415550L ^ (long)var3_4 ^ -3866560639482544637L);
                    var4_5 = Integer.reverse(Integer.reverse(1253039634 + var3_4));
                    continue block38;
                }
lbl193:
                // 1 sources

                (Integer.rotateLeft(526467672 ^ var3_4, 6) + -786126877) * 526467673;
                var4_5 = 696633332 + var3_4 ^ 1152779843 ^ 1152779843;
                Integer.rotateLeft(1760970980 ^ var3_4, 16) - -1171229993;
                try {
                    var5_3 += 2;
                    if ((-1084198246491850865L ^ (long)var3_4 | 1L) == 0L) {
                        throw new IllegalArgumentException();
                    }
                    var4_5 = 1253039634 + var3_4 ^ -1944452607 ^ -1944452607;
                }
                catch (IllegalArgumentException v8) {
                    var4_5 = Integer.reverse(Integer.reverse(1253039634 + var3_4));
                }
                var5_3 += 5;
                continue block38;
                case 1592776962: {
                    (Integer.rotateRight(1984509818 ^ var3_4, 17) + 1463506689) * 1984509819;
                    var4_5 = (int)((long)(1257375633 + var3_4) ^ -6232561894093436999L ^ -6232561894093436999L);
                    (Integer.rotateLeft(735402936 ^ var3_4, 8) + 1395899011) * 735402937;
                    try {
                        ++var5_3;
                        var4_5 = Integer.reverse(Integer.reverse(1253039634 + var3_4));
                    }
                    catch (ArithmeticException v9) {
                        var4_5 = 1253039634 + var3_4 + -461150049 - -461150049;
                    }
                    var5_3 -= 4;
                    continue block38;
                }
                case 1039372436: {
                    Integer.rotateLeft(778582373 ^ var3_4, 8) - -1560505738;
                    (int)(-1379623930954454193L ^ (long)var3_4 ^ -3188404387718859676L);
                    var4_5 = (int)((long)(1253039634 + var3_4) ^ 4628416497031993371L ^ 4628416497031993371L);
                    var5_3 += 4;
                    continue block38;
                }
                case 1704318882: {
                    (Integer.rotateLeft(1557897213 ^ var3_4, 14) - 1123417822) * 1557897213;
                    (int)(-7032034641790571697L ^ (long)var3_4 ^ -6993946072846921469L);
                    var4_5 = -263603731 + var3_4 + -1899118688 - -1899118688;
                    Integer.rotateRight(-1095982553 ^ var3_4, 10) - 457523700;
                    var4_5 = 1253039634 + var3_4;
                    var5_3 -= 5;
                    continue block38;
                }
                case 437594142: {
                    return var2_2;
                }
            }
            Integer.rotateLeft(-699257907 ^ var3_4, 13) - -128914162;
            (int)(1504349542048656207L ^ (long)var3_4 ^ -679899395273423856L);
            var4_5 = Integer.reverse(Integer.reverse(1253039634 + var3_4));
        }
    }

    private void dld_3(class_4587 class_45872, float f, class_243 class_2432) {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)false);
        float f2 = this.tns.hkj();
        for (bdd_4 bdd2_2 : this.dnr) {
            float f3;
            float f4;
            float f5;
            if (bdd2_2.tjdh.size() < 2 || (f5 = nm.zha_5(f4 = bdd2_2.tjt_4()) * (this.srh_2.hkj() / 255.0f)) <= 0.001f) continue;
            int n = bdd2_2.tjdh.size();
            int n2 = bdd2_2.ld.rk() >> 16 & 0xFF;
            int n3 = bdd2_2.ld.rk() >> 8 & 0xFF;
            int n4 = bdd2_2.ld.rk() & 0xFF;
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27380, class_290.field_1576);
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            for (int i = 0; i < n; ++i) {
                float[] fArray = (float[])bdd2_2.tjdh.get(i);
                f3 = fArray[0] - (float)class_2432.field_1352;
                float f6 = fArray[1] - (float)class_2432.field_1351;
                float f7 = fArray[2] - (float)class_2432.field_1350;
                float f8 = (float)(i + 1) / (float)n;
                float f9 = f5 * f8 * f8;
                float f10 = f2 * f8;
                int n5 = Math.min(255, (int)(f9 * 255.0f));
                int n6 = n5 << 24 | n2 << 16 | n3 << 8 | n4;
                class_2872.method_22918(matrix4f, f3, f6 + f10, f7).method_39415(n6);
                class_2872.method_22918(matrix4f, f3, f6 - f10, f7).method_39415(n6);
            }
            float f11 = nm.dhrt_2(bdd2_2.dhdb_2, bdd2_2.khsht_2, f) - (float)class_2432.field_1352;
            float f12 = nm.dhrt_2(bdd2_2.rds, bdd2_2.dkhsh, f) - (float)class_2432.field_1351;
            f3 = nm.dhrt_2(bdd2_2.rmth, bdd2_2.dyy, f) - (float)class_2432.field_1350;
            int n7 = Math.min(255, (int)(f5 * 255.0f));
            int n8 = n7 << 24 | n2 << 16 | n3 << 8 | n4;
            class_2872.method_22918(matrix4f, f11, f12 + f2, f3).method_39415(n8);
            class_2872.method_22918(matrix4f, f11, f12 - f2, f3).method_39415(n8);
            class_9801 class_98012 = class_2872.method_60794();
            if (class_98012 == null) continue;
            class_286.method_43433((class_9801)class_98012);
        }
        RenderSystem.defaultBlendFunc();
    }

    private void tsht_4(class_4587 class_45872, class_287 class_2872, bdd_4 bdd2_2, float f, class_243 class_2432) {
        float f2 = this.khkz_2.hkj();
        float f3 = 0.07f;
        float f4 = nm.dhrt_2(bdd2_2.dhdb_2, bdd2_2.khsht_2, f) - (float)class_2432.field_1352;
        float f5 = nm.dhrt_2(bdd2_2.rds, bdd2_2.dkhsh, f) - (float)class_2432.field_1351;
        float f6 = nm.dhrt_2(bdd2_2.rmth, bdd2_2.dyy, f) - (float)class_2432.field_1350;
        float f7 = bdd2_2.tjt_4();
        float f8 = nm.zha_5(f7) * (this.srh_2.hkj() / 255.0f);
        if (f8 <= 0.001f) {
            return;
        }
        int n = bdd2_2.ld.rk();
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        int n5 = (int)(f8 * 255.0f);
        int n6 = n5 << 24 | n2 << 16 | n3 << 8 | n4;
        class_45872.method_22903();
        class_45872.method_46416(f4, f5, f6);
        class_45872.method_22905(f3, f3, f3);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-nm.mc.field_1773.method_19418().method_19330()));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(nm.mc.field_1773.method_19418().method_19329()));
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f9 = f2 / 2.0f;
        class_2872.method_22918(matrix4f, -f9, f9, 0.0f).method_22913(0.0f, 1.0f).method_39415(n6);
        class_2872.method_22918(matrix4f, f9, f9, 0.0f).method_22913(1.0f, 1.0f).method_39415(n6);
        class_2872.method_22918(matrix4f, f9, -f9, 0.0f).method_22913(1.0f, 0.0f).method_39415(n6);
        class_2872.method_22918(matrix4f, -f9, -f9, 0.0f).method_22913(0.0f, 0.0f).method_39415(n6);
        class_45872.method_22909();
    }

    private void sbs_4(class_4587 class_45872, class_287 class_2872, bdd_4 bdd2_2, float f, class_243 class_2432) {
        float f2 = this.khkz_2.hkj() * 3.0f;
        float f3 = 0.07f;
        float f4 = nm.dhrt_2(bdd2_2.dhdb_2, bdd2_2.khsht_2, f) - (float)class_2432.field_1352;
        float f5 = nm.dhrt_2(bdd2_2.rds, bdd2_2.dkhsh, f) - (float)class_2432.field_1351;
        float f6 = nm.dhrt_2(bdd2_2.rmth, bdd2_2.dyy, f) - (float)class_2432.field_1350;
        float f7 = bdd2_2.tjt_4();
        float f8 = nm.zha_5(f7) * (this.srh_2.hkj() / 255.0f) * 0.35f;
        if (f8 <= 0.001f) {
            return;
        }
        int n = bdd2_2.ld.rk();
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        int n5 = (int)(f8 * 255.0f);
        int n6 = n5 << 24 | n2 << 16 | n3 << 8 | n4;
        class_45872.method_22903();
        class_45872.method_46416(f4, f5, f6);
        class_45872.method_22905(f3, f3, f3);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-nm.mc.field_1773.method_19418().method_19330()));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(nm.mc.field_1773.method_19418().method_19329()));
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f9 = f2 / 2.0f;
        class_2872.method_22918(matrix4f, -f9, f9, 0.0f).method_22913(0.0f, 1.0f).method_39415(n6);
        class_2872.method_22918(matrix4f, f9, f9, 0.0f).method_22913(1.0f, 1.0f).method_39415(n6);
        class_2872.method_22918(matrix4f, f9, -f9, 0.0f).method_22913(1.0f, 0.0f).method_39415(n6);
        class_2872.method_22918(matrix4f, -f9, -f9, 0.0f).method_22913(0.0f, 0.0f).method_39415(n6);
        class_45872.method_22909();
    }

    /*
     * Unable to fully structure code
     */
    private static float zha_5(float var0) {
        var1_1 = 0.0f;
        var4_2 = 0;
        var2_3 = -2082838692;
        var2_3 = Integer.rotateLeft(var2_3 * 48693123, 5) ^ -1022611525;
        var2_3 = Float.floatToIntBits(var0) ^ var2_3;
        var3_4 = var2_3 ^ -1886038414;
        while (true) {
            block53: {
                block59: {
                    block47: {
                        block48: {
                            block50: {
                                block61: {
                                    block57: {
                                        block60: {
                                            block56: {
                                                block51: {
                                                    block55: {
                                                        block62: {
                                                            block52: {
                                                                block46: {
                                                                    block54: {
                                                                        block58: {
                                                                            block49: {
                                                                                var4_2 = var3_4 ^ var2_3;
                                                                                switch (var4_2 & 15) {
                                                                                    case 0: {
                                                                                        if (var4_2 == 326488368) break block46;
                                                                                        if (var4_2 == 1697234864) break;
                                                                                        if (var4_2 != -1970447216) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block47;
                                                                                    }
                                                                                    case 1: {
                                                                                        if (var4_2 != 1698927393) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block48;
                                                                                    }
                                                                                    case 2: {
                                                                                        if (var4_2 == -1886038414) break block49;
                                                                                        if (var4_2 != 478634418) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block50;
                                                                                    }
                                                                                    case 3: {
                                                                                        if (var4_2 == -207555325) break block51;
                                                                                        if (var4_2 == 1004223619) break block52;
                                                                                        if (var4_2 != 221247923) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block53;
                                                                                    }
                                                                                    case 6: {
                                                                                        if (var4_2 == -1306539706) break block54;
                                                                                        if (var4_2 != 1097976678) {
                                                                                            Integer.rotateLeft(-872194872 ^ var2_3, 12) + -1194992781;
                                                                                            ** break;
                                                                                        }
                                                                                        break block55;
                                                                                    }
                                                                                    case 7: {
                                                                                        if (var4_2 != 278509223) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block56;
                                                                                    }
                                                                                    case 9: {
                                                                                        if (var4_2 != -626355431) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block57;
                                                                                    }
                                                                                    case 12: {
                                                                                        if (var4_2 != 323752428) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block58;
                                                                                    }
                                                                                    case 13: {
                                                                                        if (var4_2 != -1813971651) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block59;
                                                                                    }
                                                                                    case 14: {
                                                                                        if (var4_2 == -2079255666) break block60;
                                                                                        if (var4_2 != -891677266) {
                                                                                            Integer.rotateLeft(-2017952092 ^ var2_3, 3) - 1941239063;
                                                                                            ** break;
                                                                                        }
                                                                                        break block61;
                                                                                    }
                                                                                    case 15: {
                                                                                        if (var4_2 != -534470689) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block62;
                                                                                    }
                                                                                }
                                                                                Integer.rotateLeft(-995117724 ^ var2_3, 11) - -710633897;
                                                                                var1_1 = Math.max(0.0f, (1.0f - var0) / Float.intBitsToFloat(nm.ghab_2(190369026 ^ -614937339, 27)));
                                                                                var3_4 = (int)((long)(var2_3 ^ -819854227) ^ -2615504596259016877L ^ -2615504596259016877L);
                                                                                (Integer.rotateLeft(865227997 ^ var2_3, 9) - 1125508606) * 865227997;
                                                                                (int)(-1071580870666294449L ^ (long)var2_3 ^ 626144496663941008L);
                                                                                var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 221247923));
                                                                                var4_2 += 5;
                                                                                continue;
                                                                            }
                                                                            (Integer.rotateLeft(2086974420 ^ var2_3, 18) - 344942055) * 2086974421;
                                                                            if (!(var0 < Float.intBitsToFloat(Integer.reverse(1265624414) ^ 1198209567))) {
                                                                                var3_4 = var2_3 ^ -1474505420;
                                                                                (Integer.rotateLeft(27501757 ^ var2_3, 3) - 925798942) * 27501757;
                                                                                (int)(-4390716616169166001L ^ (long)var2_3 ^ -1697712911059244045L);
                                                                                var3_4 = var2_3 ^ 323752428;
                                                                                var4_2 -= 5;
                                                                                continue;
                                                                            }
                                                                            try {
                                                                                var4_2 -= 5;
                                                                                if ((5100494337406639655L ^ (long)var2_3 | 1L) == 0L) {
                                                                                    throw new IllegalStateException();
                                                                                }
                                                                                var3_4 = var2_3 ^ 326488368 ^ 1113229515 ^ 1113229515;
                                                                            }
                                                                            catch (IllegalStateException v0) {
                                                                                var3_4 = var2_3 ^ 326488368;
                                                                            }
                                                                            var4_2 -= 3;
                                                                            continue;
                                                                        }
                                                                        Integer.rotateRight(-1858954874 ^ var2_3, 5) - -1719781771;
                                                                        if (!(var0 > Float.intBitsToFloat(1848014142 - 786855230))) {
                                                                            var3_4 = (var2_3 ^ -1306539706) + 1484867838 - 1484867838;
                                                                            continue;
                                                                        }
                                                                        var3_4 = (int)((long)(var2_3 ^ 1697234864) ^ -1898513723232132948L ^ -1898513723232132948L);
                                                                        (Integer.rotateLeft(-868416811 ^ var2_3, 12) - -1077872890) * -868416811;
                                                                        (int)(1049247351301270351L ^ (long)var2_3 ^ -6584118506756132658L);
                                                                        continue;
                                                                    }
                                                                    (Integer.rotateRight(-2020265829 ^ var2_3, 3) + 1869513216) * -2020265829;
                                                                    var1_1 = 1.0f;
                                                                    var3_4 = var2_3 ^ 221247923;
                                                                    var4_2 -= 2;
                                                                    continue;
                                                                }
                                                                (Integer.rotateLeft(-1321522735 ^ var2_3, 9) + 2055712650) * -1321522735;
                                                                (int)(8325334834521369423L ^ (long)var2_3 ^ -961374371984094526L);
                                                                var1_1 = var0 / Float.intBitsToFloat(Integer.reverse(2028546427) ^ -480748589);
                                                                (int)(9053354249734126910L ^ (long)var2_3 ^ 1009561586552755862L);
                                                                var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 123856580));
                                                                (int)(7333816781025977228L ^ (long)var2_3 ^ 1906127684786677340L);
                                                                var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 221247923));
                                                                --var4_2;
                                                                continue;
                                                            }
                                                            (Integer.rotateLeft(1589485244 ^ var2_3, 14) - 2102646783) * 1589485245;
                                                            var3_4 = (int)((long)(var2_3 ^ -509884870) ^ 3991037807879115235L ^ 3991037807879115235L);
                                                            Integer.rotateLeft(-1850235060 ^ var2_3, 5) - -1449467537;
                                                            var3_4 = (int)((long)(var2_3 ^ -1886038414) ^ 4162799328639335297L ^ 4162799328639335297L);
                                                            var4_2 += 4;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(-1397206261 ^ var2_3, 8) + -290476656;
                                                        try {
                                                            if ((-638202764931507539L ^ (long)var2_3 | 1L) == 0L) {
                                                                throw new NoSuchElementException();
                                                            }
                                                            var3_4 = var2_3 ^ -1886038414;
                                                        }
                                                        catch (NoSuchElementException v1) {
                                                            var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -1886038414));
                                                        }
                                                        ++var4_2;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(1961983525 ^ var2_3, 17) - 765191606;
                                                    (int)(-5313174333200995505L ^ (long)var2_3 ^ 6719514792496251222L);
                                                    var3_4 = (int)((long)(var2_3 ^ -663680339) ^ 8186256039120768725L ^ 8186256039120768725L);
                                                    (Integer.rotateLeft(-305847016 ^ var2_3, 16) + -818078429) * -305847015;
                                                    try {
                                                        var4_2 += 2;
                                                        if ((2781859732435685881L ^ (long)var2_3 | 1L) == 0L) {
                                                            throw new UnsupportedOperationException();
                                                        }
                                                        var3_4 = var2_3 ^ -1886038414 ^ -1834738269 ^ -1834738269;
                                                    }
                                                    catch (UnsupportedOperationException v2) {
                                                        var3_4 = var2_3 ^ -1886038414 ^ 466186886 ^ 466186886;
                                                    }
                                                    var4_2 += 5;
                                                    continue;
                                                }
                                                Integer.rotateLeft(2070917448 ^ var2_3, 18) + -152824077;
                                                var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -703470277));
                                                Integer.rotateLeft(481679172 ^ var2_3, 6) - 2120396919;
                                                var3_4 = var2_3 ^ -1163019742 ^ -291873402 ^ -291873402;
                                                (Integer.rotateLeft(1374056344 ^ var2_3, 13) + -280681821) * 1374056345;
                                                var3_4 = (var2_3 ^ -1886038414) + -891198491 - -891198491;
                                                var4_2 += 2;
                                                continue;
                                            }
                                            (Integer.rotateRight(-1303720586 ^ var2_3, 9) - -1687388027) * -1303720585;
                                            var3_4 = var2_3 ^ 1923555996;
                                            Integer.rotateLeft(1719624645 ^ var2_3, 15) - 1842000918;
                                            (int)(-6571369815559836849L ^ (long)var2_3 ^ 7386047537347093578L);
                                            try {
                                                var4_2 -= 4;
                                                var3_4 = (int)((long)(var2_3 ^ -1886038414) ^ -7123370837065973924L ^ -7123370837065973924L);
                                            }
                                            catch (UnsupportedOperationException v3) {
                                                var3_4 = var2_3 ^ -1886038414;
                                            }
                                            var4_2 -= 4;
                                            continue;
                                        }
                                        (Integer.rotateRight(680651323 ^ var2_3, 8) + -301400992) * 680651323;
                                        var3_4 = var2_3 ^ 1753068191;
                                        Integer.rotateLeft(-1862330715 ^ var2_3, 5) - -1824432842;
                                        (int)(5930599247959616335L ^ (long)var2_3 ^ -8340522361430668982L);
                                        var3_4 = var2_3 ^ -1886038414 ^ 1182442739 ^ 1182442739;
                                        Integer.rotateLeft(1901569893 ^ var2_3, 17) - -1107630986;
                                        (int)(-5483966697023673521L ^ (long)var2_3 ^ -1170791754656855525L);
                                        continue;
                                    }
                                    (Integer.rotateLeft(-1251053960 ^ var2_3, 9) + -54722621) * -1251053959;
                                    var3_4 = (var2_3 ^ 543538044) + 1194403597 - 1194403597;
                                    (Integer.rotateLeft(-1737695695 ^ var2_3, 6) + 2039252778) * -1737695695;
                                    (int)(6547794105753463631L ^ (long)var2_3 ^ 2119087773137311853L);
                                    var3_4 = (int)((long)(var2_3 ^ -1886038414) ^ 2997284643641090849L ^ 2997284643641090849L);
                                    var4_2 -= 3;
                                    continue;
                                }
                                (Integer.rotateLeft(714008497 ^ var2_3, 8) + 732671402) * 714008497;
                                (int)(-1712412891995116721L ^ (long)var2_3 ^ 7955752890209435049L);
                                try {
                                    ++var4_2;
                                    var3_4 = var2_3 ^ -1886038414 ^ -791173047 ^ -791173047;
                                }
                                catch (ArithmeticException v4) {
                                    var3_4 = var2_3 ^ -1886038414;
                                }
                                var4_2 -= 4;
                                continue;
                            }
                            (Integer.rotateLeft(-427639312 ^ var2_3, 15) + -298672309) * -427639311;
                            var3_4 = var2_3 ^ 1142206521 ^ -1764225016 ^ -1764225016;
                            (Integer.rotateLeft(1109770933 ^ var2_3, 11) - 116405030) * 1109770933;
                            (int)(-9180749983331849393L ^ (long)var2_3 ^ 2621239131589094655L);
                            var3_4 = (int)((long)(var2_3 ^ -1886038414) ^ 8557726720242407761L ^ 8557726720242407761L);
                            Integer.rotateRight(-1416720466 ^ var2_3, 8) - -895417011;
                            var4_2 += 3;
                            continue;
                        }
                        (Integer.rotateLeft(-1719197232 ^ var2_3, 6) + -1682262165) * -1719197231;
                        var3_4 = var2_3 ^ 1390813329 ^ 909308256 ^ 909308256;
                        (Integer.rotateLeft(-1826721932 ^ var2_3, 5) - -720560569) * -1826721931;
                        try {
                            var4_2 += 2;
                            if ((-8058518591839336071L ^ (long)var2_3 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -1886038414));
                        }
                        catch (NoSuchElementException v5) {
                            var3_4 = var2_3 ^ -1886038414 ^ 1543626455 ^ 1543626455;
                        }
                        continue;
                    }
                    (Integer.rotateLeft(1324089945 ^ var2_3, 12) + -1829640190) * 1324089945;
                    (int)(-8332032714423866545L ^ (long)var2_3 ^ -6505305513277213332L);
                    try {
                        ++var4_2;
                        if ((-5576023440342224483L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var3_4 = var2_3 ^ -1886038414 ^ -691833876 ^ -691833876;
                    }
                    catch (IllegalArgumentException v6) {
                        var3_4 = (int)((long)(var2_3 ^ -1886038414) ^ 1168200629339178977L ^ 1168200629339178977L);
                    }
                    var4_2 += 4;
                    continue;
                }
                Integer.rotateLeft(-1709360447 ^ var2_3, 6) + -1377321830;
                (int)(6390490206982957903L ^ (long)var2_3 ^ -3132109392376685426L);
                var3_4 = var2_3 ^ -1886038414;
                Integer.rotateLeft(-762787828 ^ var2_3, 13) - -2098341713;
                continue;
            }
            return var1_1;
lbl290:
            // 12 sources

            (Integer.rotateLeft(-170366147 ^ var2_3, 17) - -913138786) * -170366147;
            (int)(3993220624076303183L ^ (long)var2_3 ^ 8606523036364555012L);
            var3_4 = (var2_3 ^ -1886038414) + -490236884 - -490236884;
        }
    }

    private static float dhrt_2(float f, float f2, float f3) {
        float f4 = 0.0f;
        int n = 0;
        int n2 = 1302185655;
        n2 = Integer.rotateLeft(n2 * 1662111021, 24) ^ 0xE83BD9A2;
        n2 = Integer.rotateRight(Float.floatToIntBits(f) ^ n2, 22);
        n2 = Float.floatToIntBits(f2) ^ n2;
        int n3 = Integer.reverse(Integer.reverse(n2 ^ 0x76DCA2E2));
        block22: while (true) {
            switch (n3 ^ n2) {
                case 297210627: {
                    int cfr_ignored_0 = (Integer.rotateRight(0xA09755B7 ^ n2, 7) - 1991311460) * -1600694857;
                    f4 = f + (f2 - f) * f3;
                    int cfr_ignored_1 = (int)(0xC7BDCC12DB131ADL ^ (long)n2 ^ 0x44F297D1987DB526L);
                    n3 = n2 ^ 0xEEB506F3;
                    int cfr_ignored_2 = (int)(0xCABF3ADF1A31E948L ^ (long)n2 ^ 0x88CEF8D029B638AFL);
                    n3 = (int)((long)(n2 ^ 0xEC198E1C) ^ 0xA2D14437529CBB66L ^ 0xA2D14437529CBB66L);
                    --n;
                    continue block22;
                }
                case 1994171106: {
                    int cfr_ignored_3 = (Integer.rotateLeft(0xFA4EC7B8 ^ n2, 18) + 1407700611) * -95500359;
                    if (!yf.dnkh()) {
                        n3 = n2 ^ 0x11B71303;
                        int cfr_ignored_4 = (Integer.rotateRight(0x1796DA1B ^ n2, 5) + -543029120) * 395762203;
                        --n;
                        continue block22;
                    }
                    int cfr_ignored_5 = (int)(0x38BF302E2CC9FB45L ^ (long)n2 ^ 0x9D2C95200DADDCAFL);
                    n3 = (n2 ^ 0x3C7BE8BB) + 871664948 - 871664948;
                    int cfr_ignored_6 = (int)(0xCBE5310F3B59920BL ^ (long)n2 ^ 0x9F6EBA00DF303A1BL);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x3974B6DD));
                    n -= 4;
                    continue block22;
                }
                case 963950301: {
                    int cfr_ignored_7 = (Integer.rotateLeft(0x2DE76055 ^ n2, 8) - -1822275194) * 770138197;
                    int cfr_ignored_8 = (int)(0xEF55CE6827D4EB4FL ^ (long)n2 ^ 0x61A0831A2DB8737AL);
                    throw null;
                }
                case 203083140: {
                    int cfr_ignored_9 = (Integer.rotateRight(0xD875317A ^ n2, 14) + 982424833) * -663408261;
                    n3 = n2 ^ 0x42C1E743 ^ 0x75A079E2 ^ 0x75A079E2;
                    int cfr_ignored_10 = (Integer.rotateRight(0x2F673B72 ^ n2, 8) + -1042427383) * 795294579;
                    n3 = (n2 ^ 0x708EDCB) + 1660356560 - 1660356560;
                    int cfr_ignored_11 = Integer.rotateRight(0x97116747 ^ n2, 5) - 1333338324;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x76DCA2E2));
                    --n;
                    continue block22;
                }
                case -2144941967: {
                    int cfr_ignored_12 = (Integer.rotateRight(0xB7CF67FA ^ n2, 9) + 1182480001) * -1211144197;
                    try {
                        n += 4;
                        n3 = (n2 ^ 0x76DCA2E2) + 347456948 - 347456948;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)(n2 ^ 0x76DCA2E2) ^ 0x510C4BEE77D6BB71L ^ 0x510C4BEE77D6BB71L);
                    }
                    n += 5;
                    continue block22;
                }
                case 1094710500: {
                    int cfr_ignored_13 = (Integer.rotateRight(0x7BA89B9E ^ n2, 18) - -37193891) * 2074647455;
                    n3 = n2 ^ 0xFA743EE8;
                    int cfr_ignored_14 = Integer.rotateLeft(0x55B83720 ^ n2, 13) + 1705790491;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x76DCA2E2));
                    --n;
                    continue block22;
                }
                case 2024413339: {
                    int cfr_ignored_15 = Integer.rotateLeft(0x5F3EC9C9 ^ n2, 14) + -1929900398;
                    int cfr_ignored_16 = (int)(0x9D8C67F427D4EB4FL ^ (long)n2 ^ 0x3298831A2DB896C9L);
                    n3 = n2 ^ 0xE7D850C;
                    int cfr_ignored_17 = Integer.rotateLeft(0x8D846CC1 ^ n2, 4) + 661047962;
                    int cfr_ignored_18 = (int)(0x4F36C2FC27D4EB4FL ^ (long)n2 ^ 0x7888831A2DB933BCL);
                    n3 = (n2 ^ 0xC85D1645) + -558184948 - -558184948;
                    int cfr_ignored_19 = (Integer.rotateRight(0x8805DA7E ^ n2, 4) - 2098402429) * -2012882305;
                    n3 = n2 ^ 0x76DCA2E2 ^ 0x45868C8A ^ 0x45868C8A;
                    n -= 5;
                    continue block22;
                }
                case -2081482124: {
                    int cfr_ignored_20 = (Integer.rotateLeft(0x6784C495 ^ n2, 15) - -1921946298) * 1736754325;
                    int cfr_ignored_21 = (int)(0xA5366AA827D4EB4FL ^ (long)n2 ^ 0x2820831A2DB8E7BDL);
                    try {
                        n3 = n2 ^ 0x76DCA2E2 ^ 0x6DACB406 ^ 0x6DACB406;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x76DCA2E2));
                    }
                    continue block22;
                }
                case -1044928496: {
                    int cfr_ignored_22 = (Integer.rotateLeft(0xB95699C ^ n2, 4) - 1802856735) * 194341277;
                    n3 = (int)((long)(n2 ^ 0x76DCA2E2) ^ 0xCD092B180AAAC06AL ^ 0xCD092B180AAAC06AL);
                    n -= 4;
                    continue block22;
                }
                case -759847027: {
                    int cfr_ignored_23 = (Integer.rotateLeft(0xDDD9D4B4 ^ n2, 14) - -507617017) * -572926795;
                    n3 = (int)((long)(n2 ^ 0x3902B4E1) ^ 0xF1388831ABF14B31L ^ 0xF1388831ABF14B31L);
                    int cfr_ignored_24 = Integer.rotateRight(0x365C494A ^ n2, 9) + -1718976719;
                    try {
                        if ((0x17D47FA28A455D0BL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = n2 ^ 0x76DCA2E2;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 ^ 0x76DCA2E2 ^ 0xBB9C7948 ^ 0xBB9C7948;
                    }
                    ++n;
                    continue block22;
                }
                case 1527013561: {
                    int cfr_ignored_25 = (Integer.rotateLeft(0xCDA18275 ^ n2, 12) - -353604762) * -845053323;
                    int cfr_ignored_26 = (int)(0xF132C4827D4EB4FL ^ (long)n2 ^ 0xA5E0831A2DB9B3F7L);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x756005D6));
                    int cfr_ignored_27 = (Integer.rotateRight(0x9360FC13 ^ n2, 5) + -585357944) * -1822360557;
                    n3 = (n2 ^ 0x76DCA2E2) + -1131763296 - -1131763296;
                    n -= 2;
                    continue block22;
                }
                case 1577483867: {
                    int cfr_ignored_28 = (Integer.rotateLeft(0x8C773A94 ^ n2, 4) - 114145063) * -1938343275;
                    n3 = n2 ^ 0xB927B175 ^ 0x80E26B05 ^ 0x80E26B05;
                    int cfr_ignored_29 = Integer.rotateLeft(0xCB6A3CC1 ^ n2, 12) + -1506084198;
                    int cfr_ignored_30 = (int)(0x9D892FC27D4EB4FL ^ (long)n2 ^ 0xD888831A2DB9BE60L);
                    n3 = (n2 ^ 0x76DCA2E2) + -246373207 - -246373207;
                    n -= 4;
                    continue block22;
                }
                case -508429351: {
                    int cfr_ignored_31 = (Integer.rotateRight(0xA668C33A ^ n2, 7) + 722289473) * -1503083717;
                    n3 = n2 ^ 0xF0C4169D ^ 0x95824DB ^ 0x95824DB;
                    int cfr_ignored_32 = Integer.rotateRight(0x96084B8E ^ n2, 5) - 794740077;
                    n3 = n2 ^ 0x17B59F ^ 0x8FD4190C ^ 0x8FD4190C;
                    int cfr_ignored_33 = Integer.rotateRight(0x169FC98E ^ n2, 5) - -1044969619;
                    n3 = n2 ^ 0x76DCA2E2;
                    continue block22;
                }
                case -333869540: {
                    return f4;
                }
            }
            int cfr_ignored_34 = (Integer.rotateRight(0x15798817 ^ n2, 5) - -1642784252) * 360286231;
            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x76DCA2E2));
        }
    }

    @Generated
    public static nm zka() {
        block0: {
            int n = -146108538;
            int n2 = (n = Integer.rotateLeft(n * -1186850967, 10) ^ 0x4E54DD22) ^ 0x31605BBB;
            if ((n2 ^ n) == 828398523) break block0;
            int cfr_ignored_0 = (0xC62AD43D ^ n) + 2030175540;
        }
        return skhf;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void tdhr_2(shw_3 shw2) {
        int n = -1442377558;
        n = Integer.rotateLeft(n * 1671951863, 18) ^ 0x756344C4;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 18);
        int n2 = n ^ 0x1E2F6EDB;
        if ((n2 ^ n) != 506425051) {
            int cfr_ignored_0 = (0xB4287E71 ^ n) + 675981510;
        }
        if (this.dnr.isEmpty()) {
            return;
        }
        if (mc.method_1561() == null || nm.mc.method_1561().field_4686 == null) {
            return;
        }
        class_4587 class_45872 = shw2.ssha_2();
        class_45872.method_22903();
        try {
            float f = shw2.skz_4();
            class_243 class_2432 = nm.mc.method_1561().field_4686.method_19326();
            RenderSystem.disableCull();
            this.dld_3(class_45872, f, class_2432);
            RenderSystem.enableBlend();
            RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask((boolean)false);
            RenderSystem.setShaderTexture((int)0, (class_2960)tkha);
            RenderSystem.setShader((class_10156)class_10142.field_53880);
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            for (bdd_4 bdd2_2 : this.dnr) {
                this.tsht_4(class_45872, class_2872, bdd2_2, f, class_2432);
            }
            class_9801 class_98012 = class_2872.method_60794();
            if (class_98012 != null) {
                class_286.method_43433((class_9801)class_98012);
            }
            if (this.dza_4.shzl()) {
                bdd_4 bdd2_2;
                RenderSystem.setShaderTexture((int)0, (class_2960)tha_4);
                RenderSystem.setShader((class_10156)class_10142.field_53880);
                bdd2_2 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
                for (bdd_4 bdd3 : this.dnr) {
                    this.sbs_4(class_45872, (class_287)bdd2_2, bdd3, f, class_2432);
                }
                class_9801 class_98013 = bdd2_2.method_60794();
                if (class_98013 != null) {
                    class_286.method_43433((class_9801)class_98013);
                }
            }
        }
        catch (Exception exception) {
            Moondlc.dhrn.error("Error rende".concat("ring Comets"), (Throwable)exception);
        }
        finally {
            RenderSystem.depthMask((boolean)true);
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableDepthTest();
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
            class_45872.method_22909();
        }
    }

    private void jdhs_2(btt btt2) {
        int n = 488735359;
        n = Integer.rotateLeft(n * 2123786349, 23) ^ 0x9005C25E;
        n = System.identityHashCode(this) ^ n;
        btt btt3 = btt2;
        n = (btt3 != null ? System.identityHashCode(btt3) : 0) ^ n;
        int n2 = n ^ 0xB58EDCBF;
        if ((n2 ^ n) != -1248928577) {
            int cfr_ignored_0 = (0xA8AF5EC0 ^ n) - -1827595330;
        }
        if (nm.mc.field_1724 == null || nm.mc.field_1687 == null) {
            return;
        }
        try {
            this.dnr.removeIf(bdd_4::dza_5);
            long l = System.currentTimeMillis();
            if (l - this.dsha > (0xB5FE2A0F4B69E262L ^ 0xB5FE2A0F4B69E2F4L)) {
                this.dsha = l;
                int n3 = (int)this.skb.hkj();
                int n4 = Math.min(n3 - this.dnr.size(), 2);
                for (int i = 0; i < n4; ++i) {
                    this.stt_3();
                }
            }
            for (bdd_4 bdd2_2 : this.dnr) {
                bdd2_2.ghsh_2();
            }
        }
        catch (Exception exception) {
            Moondlc.dhrn.error("Error in".concat(" Comets tick"), (Throwable)exception);
        }
    }

    private boolean khzgh_2() {
        block0: {
            int n = 154313311;
            n = Integer.rotateLeft(n * -926372723, 23) ^ 0x39CF5A59;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 23);
            int n2 = n ^ 0x11D5509A;
            if ((n2 ^ n) == 299192474) break block0;
            int cfr_ignored_0 = (0x18E7F2C5 ^ n) + 1324863377;
        }
        return this.ss_2.shzl();
    }

    private static String alsh(String string, int n, int n2, int n3) {
        int n4 = -741589722;
        n4 = Integer.rotateLeft(n4 * -535355549, 7) ^ 0xEECB64B;
        n4 = Integer.rotateRight(n ^ n4, 26);
        int n5 = (n4 = n2 ^ n4) ^ 0x97C3A3A;
        if ((n5 ^ n4) != 159136314) {
            int cfr_ignored_0 = (0xDAB0071C ^ n4) + 1770892822;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x780E6863) + thdt_4 ^ Integer.reverse(n2 + i * 1044782615), 17) - sjdh);
        }
        return new String(cArray);
    }

    private static float shm_5(int n) {
        block0: {
            int n2 = 967261326;
            int n3 = (n2 = Integer.rotateLeft(n2 * 202384121, 3) ^ 0x71DE4462) ^ 0xE00E0DBA;
            if ((n3 ^ n2) == -535949894) break block0;
            int cfr_ignored_0 = (0xD9A93134 ^ n2) + -1139260255;
        }
        return Float.intBitsToFloat(n);
    }

    private static double thrj(class_746 class_7462) {
        block0: {
            int n = -310641047;
            n = Integer.rotateLeft(n * 1078946733, 26) ^ 0x61435AE5;
            class_746 class_7463 = class_7462;
            n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 5);
            int n2 = n ^ 0x9D25D57D;
            if ((n2 ^ n) == -1658464899) break block0;
            int cfr_ignored_0 = (0x705E2B14 ^ n) + 700294699;
        }
        return class_7462.method_23321();
    }

    private static double dsn_4(ThreadLocalRandom threadLocalRandom, double d, double d2) {
        block0: {
            int n = ja_2.bnm(238971044);
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x6F2E609C;
            if ((n2 ^ n) == 1865310364) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x61100838 ^ n, 15) + -984703485) * 1628440633;
        }
        return threadLocalRandom.nextDouble(d, d2);
    }

    private static float rqy(int n) {
        block0: {
            int n2 = ja_2.bnm(172154154);
            int n3 = n2 ^ 0xF9DA9CC6;
            if ((n3 ^ n2) == -103113530) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xF39841EC ^ n2, 17) - -2083677489;
        }
        return Float.intBitsToFloat(n);
    }

    private static float shm_3(int n) {
        block0: {
            int n2 = 1810495840;
            n2 = Integer.rotateLeft(n2 * -739928559, 8) ^ 0x70F3855D;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 14)) ^ 0xC4EE7872;
            if ((n3 ^ n2) == -991004558) break block0;
            int cfr_ignored_0 = (0xAF078112 ^ n2) - -1541100039;
        }
        return Float.intBitsToFloat(n);
    }

    private static float khda_2(int n) {
        block0: {
            int n2 = 556977717;
            int n3 = (n2 = Integer.rotateLeft(n2 * 909870531, 28) ^ 0x8CBDED91) ^ 0xA6A31D7B;
            if ((n3 ^ n2) == -1499259525) break block0;
            int cfr_ignored_0 = (0x8791D34E ^ n2) + -1798844924;
        }
        return Float.intBitsToFloat(n);
    }

    private static float znh(tay tay2) {
        block0: {
            int n = -1736068724;
            n = Integer.rotateLeft(n * -767582649, 18) ^ 0xE17713BE;
            tay tay3 = tay2;
            n = (tay3 != null ? System.identityHashCode(tay3) : 0) ^ n;
            int n2 = n ^ 0xA7D893DE;
            if ((n2 ^ n) == -1478978594) break block0;
            int cfr_ignored_0 = (0x3F5D2252 ^ n) - 1541652459;
        }
        return tay2.hkj();
    }

    private static int dzq_3(int n, int n2) {
        block0: {
            int n3 = 150251640;
            n3 = Integer.rotateLeft(n3 * -272173345, 12) ^ 0xCA521276;
            n3 = n ^ n3;
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 18)) ^ 0x2F59973E;
            if ((n4 ^ n3) == 794400574) break block0;
            int cfr_ignored_0 = (0x27AD3F46 ^ n3) + 1281118628;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float sght(int n) {
        block0: {
            int n2 = 231567868;
            n2 = Integer.rotateLeft(n2 * -1393066955, 23) ^ 0x956EF058;
            int n3 = (n2 = n ^ n2) ^ 0xA4C80110;
            if ((n3 ^ n2) == -1530396400) break block0;
            int cfr_ignored_0 = (0xA90570EC ^ n2) - -1413417964;
        }
        return Float.intBitsToFloat(n);
    }

    private static boolean zkw_2() {
        block0: {
            int n = -291847979;
            int n2 = (n = Integer.rotateLeft(n * 942709313, 14) ^ 0xA53F679) ^ 0x62E5A913;
            if ((n2 ^ n) == 1659218195) break block0;
            int cfr_ignored_0 = (0x8C7F69C6 ^ n) - 1390741772;
        }
        return yf.dnkh();
    }

    private static Color amd_2(int n) {
        block0: {
            int n2 = ja_2.bnm(1621460891);
            int n3 = n2 ^ 0x80D8AF76;
            if ((n3 ^ n2) == -2133282954) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xE07D28ED ^ n2, 15) - 864392174;
            int cfr_ignored_1 = (int)(0x22CF86D027D4EB4FL ^ (long)n2 ^ 0xF0D0831A2DB9E84EL);
        }
        return bas_4.hmq(n);
    }

    private static int ghab_2(int n, int n2) {
        block0: {
            int n3 = ja_2.bnm(-2068865392);
            n3 = Integer.rotateRight(n ^ n3, 22);
            int n4 = (n3 = n2 ^ n3) ^ 0x5F34BC3B;
            if ((n4 ^ n3) == 1597291579) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xDB9B22AB ^ n3, 14) + -1675177488;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String[] bjh_2(String string) {
        block0: {
            int n = ja_2.bnm(142449813);
            int n2 = n ^ 0x28C800B9;
            if ((n2 ^ n) == 684196025) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x20B59C2C ^ n, 7) - -94664561;
        }
        return string.split("\u0001\u0011", -1);
    }

    private static CallSite thkhb(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1184351257;
            n3 = Integer.rotateLeft(n3 * 937764391, 17) ^ 0x1A0344E6;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x752C8171;
            if ((n4 ^ n3) != 1965850993) {
                int cfr_ignored_0 = (0x33BB4568 ^ n3) - 555980321;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ sthsh ^ string.hashCode() ^ n2 + jka_2 ^ i * -795702391 ^ sthsh, 3) ^ jka_2));
            }
            String[] stringArray = nm.bjh_2(new String(cArray));
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

    private static String[] bjudwwc4fs1e(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite e2z7t1gmfzs(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ askj0phkq ^ string.hashCode() ^ n2 + i5f87oj1tjqj ^ i * 721259037 ^ askj0phkq, 4) ^ i5f87oj1tjqj));
            }
            String[] stringArray = nm.bjudwwc4fs1e(new String(cArray));
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

