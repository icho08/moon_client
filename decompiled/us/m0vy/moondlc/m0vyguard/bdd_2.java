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
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bmgh;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.thh_6;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="FallingStars", category=bzw.OTHER, desc="Falling stars with ground physics")
public class bdd_2
extends bnq {
    private static bdd_2 khz_2;
    private final tay ssl = new tay(this, "Amount").shth_7(Float.intBitsToFloat(544752744 - -539474840)).dhbs_2(Float.intBitsToFloat(0x854A3757 ^ 0xC7823757)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(-151519768 + 1257767448));
    private final tay dhrt = new tay(this, "Speed").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(2115929861 + -1023313669)).rkh_3(Float.intBitsToFloat(Integer.reverse(1478446704) ^ 0x3172F81A)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xDBB77808 ^ 0xDBB37C08, 12)));
    private final tay dwa_2 = new tay(this, "Size").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(42115571) ^ 0x8E854140)).rkh_3(Float.intBitsToFloat(Integer.reverse(1410479675) ^ 0xE36C482A)).ssd_5(Float.intBitsToFloat(Integer.reverse(-1462668673) ^ 0xBE0E8B15));
    private final tay thmm = new tay(this, "Trail").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(0x8D38D70 ^ 0x49A38D70)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.reverse(-2062598296) ^ 0x563CF0A1));
    private final tay bwth = new tay(this, "Opacity").shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x6296BFB ^ 0xE606BFB, 3))).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xC8AD87E ^ 0x1772D87C, 29))).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x79BA6D46 ^ 0x69926D46, 2))).ssd_5(Float.intBitsToFloat(696898674 + 431893390));
    private final tay thdf = new tay(this, "Radius").shth_7(Float.intBitsToFloat(0xA2EFF5E4 ^ 0xE24FF5E4)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x2E242F77 ^ 0xE242E7E, 22))).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(0xD78FD43F ^ 0x962FD43F));
    private final tay jshs = new tay(this, "Height").shth_7(Float.intBitsToFloat(306285972 + 777941612)).dhbs_2(Float.intBitsToFloat(484383802 - -625009606)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(1834857959 + -736998887));
    private final badh_2 htkh = new badh_2(this, "Physics").bts(true);
    private final tay tza_3 = new tay((hy)this, "Bounciness", this::that).shth_7(Float.intBitsToFloat(1344428980 - 307597031)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xD01C0978 ^ 0xB67A779E, 15))).rkh_3(Float.intBitsToFloat(669266981 + 359176360)).ssd_5(Float.intBitsToFloat(-735492250 + 1794134580));
    private final tay shdhkh = new tay((hy)this, "Friction", this::khsl_2).shth_7(Float.intBitsToFloat(2127719244 + -1070754636)).dhbs_2(Float.intBitsToFloat(0x9316DBA2 ^ 0xAC6BAB06)).rkh_3(Float.intBitsToFloat(0xD226DA65 ^ 0xEF6A16A8)).ssd_5(Float.intBitsToFloat(Integer.reverse(4474211) ^ 0xF9FBBB9A));
    private final badh_2 bjm = new badh_2(this, "Theme Color").bts(true);
    private final bzw_2 jthd = new bzw_2(this, "Color", this::rmn).dhshy(new byq(Float.intBitsToFloat(540679969 + 591716575), Float.intBitsToFloat(Integer.rotateLeft(0x38BB6B7D ^ 0x389AF17D, 9)), Float.intBitsToFloat(1609208824 - 476812280), Float.intBitsToFloat(-1681057152 - 1481513600)));
    private final badh_2 khzz_2 = new badh_2(this, "Glow").bts(true);
    private final CopyOnWriteArrayList rd_2 = new CopyOnWriteArrayList();
    private long zbm = 0L;
    private static final class_2960 bta_4;
    private static final class_2960 zwk;
    private final bql<btt> rydh = this::adhl;
    private final bql<shw_3> khww = this::by_2;
    private static final int hkh_4 = -545131431;
    private static final int khlh = 1071413969;
    private static final int zfsh = -814344012;
    private static final int dhtdh = -314543375;
    private static final int q5v6xfg = -1357175357;
    private static final int qyv5qi4e8j = 1124063861;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int x3w8jekan8gq;

    public bdd_2() {
        khz_2 = this;
    }

    @Override
    public void nc() {
        int n = -155936431;
        int n2 = (n = Integer.rotateLeft(n * -892083015, 9) ^ 0xAB677646) ^ 0xD5BE5435;
        if ((n2 ^ n) != -708946891) {
            int cfr_ignored_0 = (0x230ACD64 ^ n) - 1812151653;
        }
        this.rd_2.clear();
    }

    private void khdgh() {
        int n = -989706561;
        n = Integer.rotateLeft(n * 1480010831, 4) ^ 0xFDBFA2A6;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 29);
        int n2 = n ^ 0x25FDE07B;
        if ((n2 ^ n) != 637395067) {
            int cfr_ignored_0 = (0xE0FFA6C4 ^ n) - -304570206;
        }
        if (bdd_2.mc.field_1724 == null) {
            return;
        }
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        float f = bdd_2.jzb(this.thdf);
        float f2 = this.jshs.hkj();
        double d = bdd_2.mc.field_1724.method_23317() + threadLocalRandom.nextDouble(-f, f);
        double d2 = bdd_2.mc.field_1724.method_23318() + threadLocalRandom.nextDouble((double)f2 * Double.longBitsToDouble(0x3F65A1C4F43C16BAL ^ 0x85A1C4F43C16BAL), f2);
        double d3 = bdd_2.jsd(bdd_2.mc.field_1724) + threadLocalRandom.nextDouble(-f, f);
        float f3 = this.dhrt.hkj();
        float f4 = threadLocalRandom.nextFloat(Float.intBitsToFloat(-392727910 + -737385360), Float.intBitsToFloat(Integer.rotateLeft(0x77FF7FCB ^ 0xA0F54368, 16))) * f3;
        float f5 = -bdd_2.tght(threadLocalRandom, Float.intBitsToFloat(0x113626E7 ^ 0x2C7AEA2A), Float.intBitsToFloat(Integer.rotateLeft(0xF446445A ^ 0x7991872, 4))) * f3;
        float f6 = threadLocalRandom.nextFloat(bdd_2.ghthd_2(Integer.rotateLeft(0x94B70F86 ^ 0xBC42CD29, 26)), Float.intBitsToFloat(0xF126FDCB ^ 0xCD852AC1)) * f3;
        byq byq2 = this.tddh(threadLocalRandom.nextInt(-227907758 - -227908118));
        float f7 = threadLocalRandom.nextFloat(0.0f, bdd_2.shrf(Integer.reverse(1079354344) ^ 0x5471AA02));
        float f8 = threadLocalRandom.nextFloat(Float.intBitsToFloat(2122525478 - 1016277798), bdd_2.tagh_4(Integer.reverse(-168534991) ^ 0xCEF22FAF)) * (float)(threadLocalRandom.nextBoolean() ? 1 : -1);
        float f9 = threadLocalRandom.nextFloat(bdd_2.ahw(bdd_2.syn(-2065543748) ^ 0x7DF24721), Float.intBitsToFloat(0x3885FF5E ^ 0x7865FF5E));
        this.rd_2.add(new thh_6(this, (float)d, (float)d2, (float)d3, f4, f5, f6, byq2, f7, f8, f9));
    }

    private byq tddh(int n) {
        byq byq2 = null;
        int n2 = 0;
        int n3 = 1403473080;
        n3 = Integer.rotateLeft(n3 * 30722615, 20) ^ 0xEAB2ED35;
        n3 = System.identityHashCode(this) ^ n3;
        int n4 = 380223135 + n3 + -267442877 - -267442877;
        while (true) {
            block23: {
                block22: {
                    block37: {
                        block28: {
                            block32: {
                                block39: {
                                    block26: {
                                        block33: {
                                            block21: {
                                                block38: {
                                                    block31: {
                                                        block27: {
                                                            block36: {
                                                                block25: {
                                                                    block20: {
                                                                        block34: {
                                                                            block35: {
                                                                                block29: {
                                                                                    block30: {
                                                                                        block18: {
                                                                                            block24: {
                                                                                                block19: {
                                                                                                    if ((n2 = n4 - n3) > -416073230) break block18;
                                                                                                    if (n2 > -1587592421) break block19;
                                                                                                    if (n2 == -2141764101) break block20;
                                                                                                    if (n2 == -1760335143) break block21;
                                                                                                    int cfr_ignored_0 = (Integer.rotateRight(0xE8A72552 ^ n3, 16) + 815473705) * -391699117;
                                                                                                    if (n2 == -1587592421) break block22;
                                                                                                    break block23;
                                                                                                }
                                                                                                if (n2 > -761681076) break block24;
                                                                                                if (n2 == -1468419744) break block25;
                                                                                                if (n2 == -761681076) break block26;
                                                                                                int cfr_ignored_1 = Integer.rotateRight(0xC18421A6 ^ n3, 11) - 1935520341;
                                                                                                break block23;
                                                                                            }
                                                                                            if (n2 == -724772371) break block27;
                                                                                            if (n2 == -416073230) break block28;
                                                                                            break block23;
                                                                                        }
                                                                                        if (n2 > 380223135) break block29;
                                                                                        if (n2 > 208213876) break block30;
                                                                                        if (n2 == 193549734) break block31;
                                                                                        if (n2 == 208213876) break block32;
                                                                                        break block23;
                                                                                    }
                                                                                    if (n2 == 313324162) break block33;
                                                                                    if (n2 == 380223135) break block34;
                                                                                    break block23;
                                                                                }
                                                                                if (n2 > 882563609) break block35;
                                                                                if (n2 == 750462508) break block36;
                                                                                if (n2 == 882563609) break block37;
                                                                                break block23;
                                                                            }
                                                                            if (n2 == 988903315) break block38;
                                                                            if (n2 == 1827163642) break block39;
                                                                            int cfr_ignored_2 = (Integer.rotateLeft(0x321BDD91 ^ n3, 9) + 364737482) * 840686993;
                                                                            int cfr_ignored_3 = (int)(0xF0A973AC27D4EB4FL ^ (long)n3 ^ 0x1A28831A2DB84C83L);
                                                                            break block23;
                                                                        }
                                                                        int cfr_ignored_4 = Integer.rotateLeft(0x5284A805 ^ n3, 13) - 40761302;
                                                                        int cfr_ignored_5 = (int)(0x9036063827D4EB4FL ^ (long)n3 ^ 0xF100831A2DB88DBDL);
                                                                        if (bdd_2.trt_4(this.bjm)) {
                                                                            int cfr_ignored_6 = (int)(0x3084E7E91B8A2985L ^ (long)n3 ^ 0x32A2FBA7A82DCCD8L);
                                                                            n4 = Integer.reverse(Integer.reverse(-1737645247 + n3));
                                                                            int cfr_ignored_7 = (int)(0x12C5BF1B58DBA524L ^ (long)n3 ^ 0x83467D04B16F885AL);
                                                                            n4 = Integer.reverse(Integer.reverse(-2141764101 + n3));
                                                                            n2 += 5;
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            n4 = (int)((long)(-1468419744 + n3) ^ 0x88E88E6E24944B9CL ^ 0x88E88E6E24944B9CL);
                                                                        }
                                                                        catch (ArithmeticException arithmeticException) {
                                                                            n4 = (int)((long)(-1468419744 + n3) ^ 0xCB78CD963B2158F9L ^ 0xCB78CD963B2158F9L);
                                                                        }
                                                                        n2 += 4;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_8 = Integer.rotateRight(0xF62657C2 ^ n3, 17) + -754827335;
                                                                    byq2 = bdd_2.zqk(bdd_2.skz_2(n).getRGB());
                                                                    try {
                                                                        n2 -= 2;
                                                                        if ((0x74ACD192F6614ED9L ^ (long)n3 | 1L) == 0L) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                        n4 = -1587592421 + n3 + -756515975 - -756515975;
                                                                    }
                                                                    catch (IllegalStateException illegalStateException) {
                                                                        n4 = (int)((long)(-1587592421 + n3) ^ 0x11BF465287C654EL ^ 0x11BF465287C654EL);
                                                                    }
                                                                    n2 -= 5;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_9 = Integer.rotateRight(0x9B6076B ^ n3, 4) + 828933424;
                                                                byq2 = bdd_2.tht_2(this.jthd);
                                                                int cfr_ignored_10 = (int)(0x34F9E19BF145E24AL ^ (long)n3 ^ 0x3E472E383FB3C422L);
                                                                n4 = Integer.reverse(Integer.reverse(-1587592421 + n3));
                                                                n2 += 3;
                                                                continue;
                                                            }
                                                            int cfr_ignored_11 = (Integer.rotateRight(0x5046EDBA ^ n3, 13) + -1124833087) * 1346825659;
                                                            n4 = -2056789714 + n3 + -2064126875 - -2064126875;
                                                            int cfr_ignored_12 = Integer.rotateRight(0x85B09C07 ^ n3, 3) - 885031956;
                                                            n4 = 380223135 + n3;
                                                            continue;
                                                        }
                                                        int cfr_ignored_13 = (Integer.rotateRight(0x61C4DAD3 ^ n3, 15) + -617341240) * 1640291027;
                                                        n4 = Integer.reverse(Integer.reverse(380223135 + n3));
                                                        continue;
                                                    }
                                                    int cfr_ignored_14 = Integer.rotateRight(0xA928564E ^ n3, 8) - -2143284563;
                                                    try {
                                                        n2 += 4;
                                                        if ((0xC8E78761E1D5B459L ^ (long)n3 | 1L) == 0L) {
                                                            throw new ArithmeticException();
                                                        }
                                                        n4 = 380223135 + n3;
                                                    }
                                                    catch (ArithmeticException arithmeticException) {
                                                        n4 = Integer.reverse(Integer.reverse(380223135 + n3));
                                                    }
                                                    n2 -= 3;
                                                    continue;
                                                }
                                                int cfr_ignored_15 = Integer.rotateRight(0x40E2AB42 ^ n3, 11) + -539993031;
                                                n4 = (int)((long)(-355429222 + n3) ^ 0x5AFAFBCE0924B8CAL ^ 0x5AFAFBCE0924B8CAL);
                                                int cfr_ignored_16 = (Integer.rotateLeft(0x9F5F673D ^ n3, 6) - 1357586334) * -1621137603;
                                                int cfr_ignored_17 = (int)(0x5DEDC90027D4EB4FL ^ (long)n3 ^ 0x6F70831A2DB9160AL);
                                                try {
                                                    n4 = 380223135 + n3 ^ 0x1550F2D4 ^ 0x1550F2D4;
                                                }
                                                catch (NoSuchElementException noSuchElementException) {
                                                    n4 = 380223135 + n3 + -448135405 - -448135405;
                                                }
                                                ++n2;
                                                continue;
                                            }
                                            int cfr_ignored_18 = Integer.rotateRight(0xEBE7D4A6 ^ n3, 16) - -1787797675;
                                            n4 = 76016316 + n3 + -2051281703 - -2051281703;
                                            int cfr_ignored_19 = (Integer.rotateRight(0xF526D2F7 ^ n3, 17) - -1273943260) * -182005001;
                                            int cfr_ignored_20 = (int)(0x21850E114B568AB0L ^ (long)n3 ^ 0xE1525A1EEE47EEDBL);
                                            n4 = Integer.reverse(Integer.reverse(380223135 + n3));
                                            continue;
                                        }
                                        int cfr_ignored_21 = Integer.rotateRight(0x88A2024B ^ n3, 4) + -1879316912;
                                        try {
                                            n2 += 5;
                                            n4 = (int)((long)(380223135 + n3) ^ 0xF9D3FE8D1B2DEBF2L ^ 0xF9D3FE8D1B2DEBF2L);
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            n4 = 380223135 + n3;
                                        }
                                        n2 -= 4;
                                        continue;
                                    }
                                    int cfr_ignored_22 = Integer.rotateLeft(0x9C49F02C ^ n3, 6) - -246303601;
                                    try {
                                        n2 += 3;
                                        n4 = 380223135 + n3 ^ 0x19F938E1 ^ 0x19F938E1;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        n4 = 380223135 + n3;
                                    }
                                    continue;
                                }
                                int cfr_ignored_23 = (Integer.rotateLeft(0x97E7DC95 ^ n3, 5) - 1769035078) * -1746412395;
                                int cfr_ignored_24 = (int)(0x555572A827D4EB4FL ^ (long)n3 ^ 0x1820831A2DB9077BL);
                                n4 = 380223135 + n3;
                                int cfr_ignored_25 = (Integer.rotateRight(0xD1166E7B ^ n3, 13) + 1444216864) * -787059077;
                                n2 -= 2;
                                continue;
                            }
                            int cfr_ignored_26 = Integer.rotateRight(0xE4EBC66 ^ n3, 4) - -1075417195;
                            int cfr_ignored_27 = (int)(0xAD59BDC3D4AD215DL ^ (long)n3 ^ 0x86F765E9B99CF762L);
                            n4 = 454307410 + n3 ^ 0xFC5548DE ^ 0xFC5548DE;
                            int cfr_ignored_28 = (int)(0xE9F473E7ADDAF146L ^ (long)n3 ^ 0x1ABF970619AA7E39L);
                            n4 = Integer.reverse(Integer.reverse(380223135 + n3));
                            n2 -= 3;
                            continue;
                        }
                        int cfr_ignored_29 = Integer.rotateRight(0xDE0F1E86 ^ n3, 14) - -399355531;
                        n4 = 818909203 + n3 ^ 0xE65551D4 ^ 0xE65551D4;
                        int cfr_ignored_30 = Integer.rotateRight(0xF5FF4AE3 ^ n3, 17) + -834162504;
                        try {
                            n2 -= 5;
                            n4 = 380223135 + n3;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n4 = 380223135 + n3 + 1823627452 - 1823627452;
                        }
                        n2 += 4;
                        continue;
                    }
                    int cfr_ignored_31 = (Integer.rotateRight(0x3CD70EF7 ^ n3, 10) - 1651011364) * 1020727031;
                    n4 = 197268145 + n3 + -2012839664 - -2012839664;
                    int cfr_ignored_32 = (Integer.rotateLeft(0xDEA89EF5 ^ n3, 14) - -87499034) * -559374603;
                    int cfr_ignored_33 = (int)(0x1C1A30C827D4EB4FL ^ (long)n3 ^ 0x9CE0831A2DB995E5L);
                    n4 = Integer.reverse(Integer.reverse(-1331709788 + n3));
                    int cfr_ignored_34 = (Integer.rotateLeft(0xB354425D ^ n3, 9) - -1148082050) * -1286323619;
                    int cfr_ignored_35 = (int)(0x71E6EC6027D4EB4FL ^ (long)n3 ^ 0x25B0831A2DB94E1CL);
                    n4 = (int)((long)(380223135 + n3) ^ 0xC6141A12DE0FD6FAL ^ 0xC6141A12DE0FD6FAL);
                    ++n2;
                    continue;
                }
                return byq2;
            }
            int cfr_ignored_36 = Integer.rotateRight(0x5F0B07C7 ^ n3, 14) - -2035052460;
            n4 = 380223135 + n3 + 909540464 - 909540464;
        }
    }

    private void jsa(class_4587 class_45872, class_287 class_2872, thh_6 thh2_2, float f) {
        float f2 = this.dwa_2.hkj();
        float f3 = 0.07f;
        double d = bdd_2.zyq_2(thh2_2.hfm, thh2_2.thhdh, f) - bdd_2.mc.method_1561().field_4686.method_19326().method_10216();
        double d2 = bdd_2.zyq_2(thh2_2.bfkh, thh2_2.zz_4, f) - bdd_2.mc.method_1561().field_4686.method_19326().method_10214();
        double d3 = bdd_2.zyq_2(thh2_2.fsh, thh2_2.bskh_2, f) - bdd_2.mc.method_1561().field_4686.method_19326().method_10215();
        float f4 = (float)(System.currentTimeMillis() - thh2_2.dhyz_2) / (thh2_2.khthgh * 1000.0f);
        float f5 = f4 < 0.1f ? f4 / 0.1f : (f4 > 0.7f ? Math.max(0.0f, (1.0f - f4) / 0.3f) : 1.0f);
        int n = thh2_2.tdhth.rk();
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        int n5 = (int)((f5 *= this.bwth.hkj() / 255.0f) * 255.0f);
        int n6 = n5 << 24 | n2 << 16 | n3 << 8 | n4;
        class_45872.method_22903();
        class_45872.method_22904(d, d2, d3);
        class_45872.method_22905(f3, f3, f3);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-bdd_2.mc.field_1773.method_19418().method_19330()));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(bdd_2.mc.field_1773.method_19418().method_19329()));
        class_45872.method_22907(class_7833.field_40718.rotationDegrees(thh2_2.skdh));
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f6 = f2 / 2.0f;
        class_2872.method_22918(matrix4f, -f6, f6, 0.0f).method_22913(0.0f, 1.0f).method_39415(n6);
        class_2872.method_22918(matrix4f, f6, f6, 0.0f).method_22913(1.0f, 1.0f).method_39415(n6);
        class_2872.method_22918(matrix4f, f6, -f6, 0.0f).method_22913(1.0f, 0.0f).method_39415(n6);
        class_2872.method_22918(matrix4f, -f6, -f6, 0.0f).method_22913(0.0f, 0.0f).method_39415(n6);
        class_45872.method_22909();
    }

    private void tks_4(class_4587 class_45872, class_287 class_2872, thh_6 thh2_2, float f) {
        float f2 = this.dwa_2.hkj() * 2.5f;
        float f3 = 0.07f;
        double d = bdd_2.zyq_2(thh2_2.hfm, thh2_2.thhdh, f) - bdd_2.mc.method_1561().field_4686.method_19326().method_10216();
        double d2 = bdd_2.zyq_2(thh2_2.bfkh, thh2_2.zz_4, f) - bdd_2.mc.method_1561().field_4686.method_19326().method_10214();
        double d3 = bdd_2.zyq_2(thh2_2.fsh, thh2_2.bskh_2, f) - bdd_2.mc.method_1561().field_4686.method_19326().method_10215();
        float f4 = (float)(System.currentTimeMillis() - thh2_2.dhyz_2) / (thh2_2.khthgh * 1000.0f);
        float f5 = f4 < 0.1f ? f4 / 0.1f : (f4 > 0.7f ? Math.max(0.0f, (1.0f - f4) / 0.3f) : 1.0f);
        int n = thh2_2.tdhth.rk();
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        int n5 = (int)((f5 *= this.bwth.hkj() / 255.0f * 0.3f) * 255.0f);
        int n6 = n5 << 24 | n2 << 16 | n3 << 8 | n4;
        class_45872.method_22903();
        class_45872.method_22904(d, d2, d3);
        class_45872.method_22905(f3, f3, f3);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-bdd_2.mc.field_1773.method_19418().method_19330()));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(bdd_2.mc.field_1773.method_19418().method_19329()));
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f6 = f2 / 2.0f;
        class_2872.method_22918(matrix4f, -f6, f6, 0.0f).method_22913(0.0f, 1.0f).method_39415(n6);
        class_2872.method_22918(matrix4f, f6, f6, 0.0f).method_22913(1.0f, 1.0f).method_39415(n6);
        class_2872.method_22918(matrix4f, f6, -f6, 0.0f).method_22913(1.0f, 0.0f).method_39415(n6);
        class_2872.method_22918(matrix4f, -f6, -f6, 0.0f).method_22913(0.0f, 0.0f).method_39415(n6);
        class_45872.method_22909();
    }

    private void ghskh_2(class_4587 class_45872, float f) {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)false);
        for (thh_6 thh2_2 : this.rd_2) {
            int n;
            int n2;
            int n3;
            double d;
            double d2;
            if (thh2_2.jma.isEmpty()) continue;
            float f2 = (float)(System.currentTimeMillis() - thh2_2.dhyz_2) / (thh2_2.khthgh * 1000.0f);
            float f3 = f2 < 0.1f ? f2 / 0.1f : (f2 > 0.7f ? Math.max(0.0f, (1.0f - f2) / 0.3f) : 1.0f);
            f3 *= this.bwth.hkj() / 255.0f;
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29345, class_290.field_1576);
            for (int i = 0; i < thh2_2.jma.size(); ++i) {
                float[] fArray = (float[])thh2_2.jma.get(i);
                d2 = (double)fArray[0] - bdd_2.mc.method_1561().field_4686.method_19326().method_10216();
                d = (double)fArray[1] - bdd_2.mc.method_1561().field_4686.method_19326().method_10214();
                double d3 = (double)fArray[2] - bdd_2.mc.method_1561().field_4686.method_19326().method_10215();
                float f4 = f3 * ((float)(i + 1) / (float)thh2_2.jma.size()) * 0.7f;
                n3 = thh2_2.tdhth.rk();
                n2 = n3 >> 16 & 0xFF;
                n = n3 >> 8 & 0xFF;
                int n4 = n3 & 0xFF;
                int n5 = (int)(f4 * 255.0f);
                int n6 = n5 << 24 | n2 << 16 | n << 8 | n4;
                Matrix4f matrix4f = class_45872.method_23760().method_23761();
                class_2872.method_22918(matrix4f, (float)d2, (float)d, (float)d3).method_39415(n6);
            }
            double d4 = bdd_2.zyq_2(thh2_2.hfm, thh2_2.thhdh, f) - bdd_2.mc.method_1561().field_4686.method_19326().method_10216();
            d2 = bdd_2.zyq_2(thh2_2.bfkh, thh2_2.zz_4, f) - bdd_2.mc.method_1561().field_4686.method_19326().method_10214();
            d = bdd_2.zyq_2(thh2_2.fsh, thh2_2.bskh_2, f) - bdd_2.mc.method_1561().field_4686.method_19326().method_10215();
            int n7 = thh2_2.tdhth.rk();
            int n8 = n7 >> 16 & 0xFF;
            int n9 = n7 >> 8 & 0xFF;
            n3 = n7 & 0xFF;
            n2 = (int)(f3 * 255.0f);
            n = n2 << 24 | n8 << 16 | n9 << 8 | n3;
            class_2872.method_22918(class_45872.method_23760().method_23761(), (float)d4, (float)d2, (float)d).method_39415(n);
            class_9801 class_98012 = class_2872.method_60794();
            if (class_98012 == null) continue;
            class_286.method_43433((class_9801)class_98012);
        }
        RenderSystem.defaultBlendFunc();
    }

    private static double zyq_2(double d, double d2, double d3) {
        block0: {
            int n = -1063835763;
            int n2 = (n = Integer.rotateLeft(n * 883718667, 8) ^ 0x3049F82) ^ 0x4822CC42;
            if ((n2 ^ n) == 1210240066) break block0;
            int cfr_ignored_0 = (0x88B5EBCF ^ n) + 65005542;
        }
        return d + (d2 - d) * d3;
    }

    @Generated
    public static bdd_2 kn() {
        block0: {
            int n = -1459420038;
            int n2 = (n = Integer.rotateLeft(n * -1247077091, 7) ^ 0x3874718) ^ 0xEE295113;
            if ((n2 ^ n) == -299282157) break block0;
            int cfr_ignored_0 = (0x472A5569 ^ n) + 242492506;
        }
        return khz_2;
    }

    private void by_2(shw_3 shw2) {
        int n = -1631835966;
        n = Integer.rotateLeft(n * 1855742235, 22) ^ 0x98138923;
        n = System.identityHashCode(this) ^ n;
        shw_3 shw3 = shw2;
        n = Integer.rotateLeft((shw3 != null ? System.identityHashCode(shw3) : 0) ^ n, 5);
        int n2 = n ^ 0xD141E5B5;
        if ((n2 ^ n) != -784210507) {
            int cfr_ignored_0 = (0x4FFDCD77 ^ n) - 1040701519;
        }
        if (this.rd_2.isEmpty() || mc.method_1561() == null || bdd_2.mc.method_1561().field_4686 == null) {
            return;
        }
        try {
            class_4587 class_45872 = shw2.ssha_2();
            float f = shw2.skz_4();
            class_45872.method_22903();
            this.ghskh_2(class_45872, f);
            RenderSystem.enableBlend();
            RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask((boolean)false);
            RenderSystem.setShaderTexture((int)0, (class_2960)bta_4);
            RenderSystem.setShader((class_10156)class_10142.field_53880);
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            for (thh_6 thh2_2 : this.rd_2) {
                this.jsa(class_45872, class_2872, thh2_2, f);
            }
            class_9801 class_98012 = class_2872.method_60794();
            if (class_98012 != null) {
                class_286.method_43433((class_9801)class_98012);
            }
            if (this.khzz_2.shzl()) {
                thh_6 thh2_2;
                RenderSystem.setShaderTexture((int)0, (class_2960)zwk);
                RenderSystem.setShader((class_10156)class_10142.field_53880);
                thh2_2 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
                for (thh_6 thh3_2 : this.rd_2) {
                    this.tks_4(class_45872, (class_287)thh2_2, thh3_2, f);
                }
                class_9801 class_98013 = thh2_2.method_60794();
                if (class_98013 != null) {
                    class_286.method_43433((class_9801)class_98013);
                }
            }
            RenderSystem.depthMask((boolean)true);
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableDepthTest();
            RenderSystem.disableBlend();
            class_45872.method_22909();
        }
        catch (Exception exception) {
            Moondlc.dhrn.error("Error rendering FallingStars", (Throwable)exception);
        }
    }

    private void adhl(btt btt2) {
        int n = 1892919907;
        n = Integer.rotateLeft(n * 549125031, 20) ^ 0x3A78FBAD;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
        btt btt3 = btt2;
        n = Integer.rotateRight((btt3 != null ? System.identityHashCode(btt3) : 0) ^ n, 20);
        int n2 = n ^ 0xFF0CFA3C;
        if ((n2 ^ n) != -15926724) {
            int cfr_ignored_0 = (0x8FDF505F ^ n) - 1410385342;
        }
        if (bdd_2.mc.field_1724 == null || bdd_2.mc.field_1687 == null) {
            return;
        }
        try {
            this.rd_2.removeIf(thh_6::rjk);
            long l = System.currentTimeMillis();
            if (l - this.zbm > (0xD01030B0403A4855L ^ 0xD01030B0403A4831L)) {
                this.zbm = l;
                int n3 = (int)this.ssl.hkj();
                int n4 = Math.min(n3 - this.rd_2.size(), 3);
                for (int i = 0; i < n4; ++i) {
                    this.khdgh();
                }
            }
            for (thh_6 thh2_2 : this.rd_2) {
                thh2_2.zzw();
            }
        }
        catch (Exception exception) {
            Moondlc.dhrn.error("Error in FallingStars tick listener", (Throwable)exception);
        }
    }

    private boolean rmn() {
        block0: {
            int n = 207527619;
            n = Integer.rotateLeft(n * -1515705667, 4) ^ 0xA42C96D8;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
            int n2 = n ^ 0x90BBB1A1;
            if ((n2 ^ n) == -1866747487) break block0;
            int cfr_ignored_0 = (0x9CE52F62 ^ n) + 620810313;
        }
        return this.bjm.shzl();
    }

    private boolean khsl_2() {
        int n = 2143049133;
        n = Integer.rotateLeft(n * 475096097, 5) ^ 0x4F954215;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 21);
        int n2 = n ^ 0x615F2563;
        if ((n2 ^ n) != 1633625443) {
            int cfr_ignored_0 = (0x1EE370CE ^ n) - -19844214;
        }
        return !this.htkh.shzl();
    }

    private boolean that() {
        int n = 1412231046;
        n = Integer.rotateLeft(n * -162073727, 10) ^ 0x6260914E;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xFC90FD12;
        if ((n2 ^ n) != -57606894) {
            int cfr_ignored_0 = (0xA8BC1294 ^ n) - 348599695;
        }
        return !this.htkh.shzl();
    }

    private static String khrsh(String string, int n, int n2, int n3) {
        int n4 = bmgh.skj(1508461599);
        n4 = Integer.rotateRight(n ^ n4, 10);
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 27)) ^ 0x885F204C;
        if ((n5 ^ n4) != -2007031732) {
            int cfr_ignored_0 = (Integer.rotateRight(0xD1B66C53 ^ n4, 13) + 1769258312) * -776573869;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0xF430F9FA) + n2 ^ i * 79424647) ^ hkh_4) + khlh);
        }
        return new String(cArray);
    }

    private static float jzb(tay tay2) {
        block0: {
            int n = -1950973961;
            n = Integer.rotateLeft(n * 1243250885, 28) ^ 0xED5E756C;
            tay tay3 = tay2;
            n = (tay3 != null ? System.identityHashCode(tay3) : 0) ^ n;
            int n2 = n ^ 0x1FA544B;
            if ((n2 ^ n) == 33182795) break block0;
            int cfr_ignored_0 = (0x8A4C2BBC ^ n) - -1799489857;
        }
        return tay2.hkj();
    }

    private static double jsd(class_746 class_7462) {
        block0: {
            int n = bmgh.skj(1666123424);
            int n2 = n ^ 0xCC26F03E;
            if ((n2 ^ n) == -869863362) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xAF69F69E ^ n, 8) - 1110604893) * -1352010081;
        }
        return class_7462.method_23321();
    }

    private static float tght(ThreadLocalRandom threadLocalRandom, float f, float f2) {
        block0: {
            int n = 2050069093;
            n = Integer.rotateLeft(n * 941644183, 13) ^ 0x39BE153D;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 24);
            int n2 = n ^ 0x50E28FBF;
            if ((n2 ^ n) == 1357025215) break block0;
            int cfr_ignored_0 = (0x2AD31DDA ^ n) - -383334375;
        }
        return threadLocalRandom.nextFloat(f, f2);
    }

    private static float ghthd_2(int n) {
        block0: {
            int n2 = bmgh.skj(-255950482);
            int n3 = n2 ^ 0xF5CCA16;
            if ((n3 ^ n2) == 257739286) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xFFE24B78 ^ n2, 18) + 12894915) * -1946759;
        }
        return Float.intBitsToFloat(n);
    }

    private static float shrf(int n) {
        block0: {
            int n2 = 603794019;
            n2 = Integer.rotateLeft(n2 * -1647746233, 13) ^ 0x6A01559E;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 2)) ^ 0xCC762E7A;
            if ((n3 ^ n2) == -864670086) break block0;
            int cfr_ignored_0 = (0xEF8B0419 ^ n2) - -1928121293;
        }
        return Float.intBitsToFloat(n);
    }

    private static float tagh_4(int n) {
        block0: {
            int n2 = -1196843048;
            int n3 = (n2 = Integer.rotateLeft(n2 * 78472211, 18) ^ 0xA817E0F8) ^ 0x5E940F43;
            if ((n3 ^ n2) == 1586761539) break block0;
            int cfr_ignored_0 = (0xE63D909B ^ n2) + 527171850;
        }
        return Float.intBitsToFloat(n);
    }

    private static int syn(int n) {
        block0: {
            int n2 = 1063972427;
            n2 = Integer.rotateLeft(n2 * 1965595179, 24) ^ 0xF1DFC610;
            int n3 = (n2 = n ^ n2) ^ 0x8EEC7B4F;
            if ((n3 ^ n2) == -1897104561) break block0;
            int cfr_ignored_0 = (0xB1869504 ^ n2) - 1881743509;
        }
        return Integer.reverse(n);
    }

    private static float ahw(int n) {
        block0: {
            int n2 = 451167895;
            n2 = Integer.rotateLeft(n2 * -413381079, 8) ^ 0x2D157BC2;
            int n3 = (n2 = n ^ n2) ^ 0xACD2B2E7;
            if ((n3 ^ n2) == -1395477785) break block0;
            int cfr_ignored_0 = (0xB636F470 ^ n2) - 1331900268;
        }
        return Float.intBitsToFloat(n);
    }

    private static boolean trt_4(badh_2 badh2) {
        block0: {
            int n = 740232406;
            n = Integer.rotateLeft(n * 1618362047, 15) ^ 0xD313ECC;
            badh_2 badh3 = badh2;
            n = (badh3 != null ? System.identityHashCode(badh3) : 0) ^ n;
            int n2 = n ^ 0x75B4666D;
            if ((n2 ^ n) == 1974756973) break block0;
            int cfr_ignored_0 = (0x59AB6ABB ^ n) + -1155660841;
        }
        return badh2.shzl();
    }

    private static Color skz_2(int n) {
        block0: {
            int n2 = -1302361293;
            int n3 = (n2 = Integer.rotateLeft(n2 * 308052291, 18) ^ 0xA3308309) ^ 0x4740A7F5;
            if ((n3 ^ n2) == 1195419637) break block0;
            int cfr_ignored_0 = (0xF51F2CC6 ^ n2) - -1641835894;
        }
        return bas_4.hmq(n);
    }

    private static byq zqk(int n) {
        block0: {
            int n2 = 1703921104;
            n2 = Integer.rotateLeft(n2 * -940368075, 11) ^ 0xB3B8C02E;
            int n3 = (n2 = n ^ n2) ^ 0xF546478E;
            if ((n3 ^ n2) == -179943538) break block0;
            int cfr_ignored_0 = (0x90C9825E ^ n2) - 1493580342;
        }
        return byq.tkhw(n);
    }

    private static byq tht_2(bzw_2 bzw2_2) {
        block0: {
            int n = 730761593;
            n = Integer.rotateLeft(n * 1414502645, 16) ^ 0xB24BF24E;
            bzw_2 bzw3_2 = bzw2_2;
            n = Integer.rotateLeft((bzw3_2 != null ? System.identityHashCode(bzw3_2) : 0) ^ n, 23);
            int n2 = n ^ 0x5A1873FF;
            if ((n2 ^ n) == 1511551999) break block0;
            int cfr_ignored_0 = (0x7196FA86 ^ n) - -1945741124;
        }
        return bzw2_2.sdsh_4();
    }

    private static String[] ayn(String string) {
        block0: {
            int n = -193844734;
            n = Integer.rotateLeft(n * -999186259, 24) ^ 0xA0C57C2B;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 26);
            int n2 = n ^ 0xA654AB1E;
            if ((n2 ^ n) == -1504400610) break block0;
            int cfr_ignored_0 = (0x5226811C ^ n) - -2136491508;
        }
        return string.split("\u0004\u001f", -1);
    }

    private static CallSite sdhgh_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1299376730;
            n3 = Integer.rotateLeft(n3 * -1518739723, 26) ^ 0xB6BE92B2;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 7);
            int n4 = n3 ^ 0x3CDE61C9;
            if ((n4 ^ n3) != 1021206985) {
                int cfr_ignored_0 = (0x8E53746F ^ n3) - 242389398;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ zfsh ^ string.hashCode() ^ n2 + dhtdh ^ i * -665453903 ^ zfsh, 24) ^ dhtdh));
            }
            String[] stringArray = bdd_2.ayn(new String(cArray));
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

    private static String[] bv59r9ri6(String string) {
        return string.split("\b\u0015", -1);
    }

    private static CallSite u9k085owfm072u(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ q5v6xfg ^ string.hashCode() ^ n2 + qyv5qi4e8j ^ i * 1721394617 ^ q5v6xfg, 7) ^ qyv5qi4e8j));
            }
            String[] stringArray = bdd_2.bv59r9ri6(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

