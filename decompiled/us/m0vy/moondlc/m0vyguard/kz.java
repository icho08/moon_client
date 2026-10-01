/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1306
 *  net.minecraft.class_1309
 *  net.minecraft.class_1764
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_4608
 *  net.minecraft.class_742
 *  net.minecraft.class_7833
 *  net.minecraft.class_811
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1764;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_742;
import net.minecraft.class_7833;
import net.minecraft.class_811;
import us.m0vy.moondlc.m0vyguard.bjd;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tthh;
import us.m0vy.moondlc.m0vyguard.thm;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.qh_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="SwingAnimation", category=bzw.OTHER, desc="Changes first-person item swing animations")
public class kz
extends bnq {
    private static kz rjj;
    public final khd tghy = new khd(this, "Mode");
    public final fy zdhy = new fy(this.tghy, "Mode 1");
    public final fy sngh = new fy(this.tghy, "Mode 2");
    public final fy bts = new fy(this.tghy, "Mode 3");
    public final fy khfs_2 = new fy(this.tghy, "Mode 4");
    public final fy tth_5 = new fy(this.tghy, "Mode 5");
    public final fy th_4 = new fy(this.tghy, "Module 1");
    public final fy sjt_3 = new fy(this.tghy, "Module 2");
    public final fy shghm = new fy(this.tghy, "Module 3");
    public final fy zths_2 = new fy(this.tghy, "Module 4");
    public final fy zygh = new fy(this.tghy, "Module 5");
    public final fy thaz = new fy(this.tghy, "Module 6");
    public final fy djs = new fy(this.tghy, "Module 7");
    public final fy bthb = new fy(this.tghy, "Module 8");
    public final fy shshl = new fy(this.tghy, "360");
    public final fy tff = new fy(this.tghy, "Slant");
    public final fy khakh = new fy(this.tghy, "Triangle");
    public final fy zkhh_2 = new fy(this.tghy, "Shift");
    public final fy ssy_2 = new fy(this.tghy, "Break");
    public final fy shtb = new fy(this.tghy, "Lunge");
    public final fy rhsh_2 = new fy(this.tghy, "Spear");
    public final fy ddh_2 = new fy(this.tghy, "Down");
    public final fy dthdh = new fy(this.tghy, "Jelly");
    public final fy zf_2 = new fy(this.tghy, "Shake");
    public final badh_2 wdh = new badh_2(this, "Only wi".concat("th aura")).bts(false);
    public final tay jshgh = new tay((hy)this, "Legacy Strength", this::jth_5).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x70F0D9B3 ^ 0x71F659B3, 6))).dhbs_2(Float.intBitsToFloat(1965279343 + -848152687)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x77CC20DA ^ 0x44FF142D, 22))).ssd_5(Float.intBitsToFloat(0x9621CD8E ^ 0xD781CD8E));
    private final tay thqdh = new tay(this, "Swing St".concat("rength")).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(648837689 + 443778503)).rkh_3(Float.intBitsToFloat(Integer.reverse(873097881) ^ 0xA49A9CE1)).ssd_5(Float.intBitsToFloat(1134588559 + -44069519));
    private final tay tfd = new tay((hy)this, "Angle", this::ars).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(76789799 + 1059080153)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(-2075953010 + -1098610830));
    private final tay hzgh_2 = new tay((hy)this, "Turn", this::sdt_3).shth_7(Float.intBitsToFloat(Integer.reverse(-1527064608) ^ 0xC55F5F25)).dhbs_2(Float.intBitsToFloat(1756816339 + -637723603)).rkh_3(Float.intBitsToFloat(Integer.reverse(-1188515069) ^ 0xFFCD149D)).ssd_5(0.0f);
    private final tay rghz = new tay(this, "Down St".concat("rength")).shth_7(0.0f).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x8E092AFB ^ 0x2790B35C, 27))).ssd_5(0.0f);
    private final tay hlz_2 = new tay(this, "Distance").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x18CE42C2 ^ 0xD41DB60E, 12))).rkh_3(Float.intBitsToFloat(-1531301701 - 1754683825)).ssd_5(Float.intBitsToFloat(1561755144 + -513179144));
    private final badh_2 tyn = new badh_2(this, "Smooth Motion").bts(true);
    private final tay shlm = new tay((hy)this, "Smooth Amount", this::hghl).shth_7(0.0f).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(-1276998555) ^ 0x9B7D8B00)).ssd_5(Float.intBitsToFloat(-326731603 - -1386212793));
    private final tay sbdh = new tay(this, "Motion Curve").shth_7(Float.intBitsToFloat(Integer.reverse(-63632562) ^ 0x4C36CA59)).dhbs_2(Float.intBitsToFloat(-1477239507 - 1741888813)).rkh_3(Float.intBitsToFloat(Integer.reverse(-536886671) ^ 0xB30F3336)).ssd_5(1.0f);
    private final badh_2 dtz = new badh_2(this, "Custom Position").bts(false);
    private final badh_2 sdt_4 = new badh_2((hy)this, "Offsets onl".concat("y with aura"), this::dhwh_2).bts(false);
    private final tay shshj = new tay((hy)this, "Right X", this::thhq).shth_7(Float.intBitsToFloat(-1046445870 + -25198802)).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1577109510) ^ 0x1FCCFF85)).rkh_3(Float.intBitsToFloat(0x80C8690D ^ 0xBD84A5C0)).ssd_5(0.0f);
    private final tay dhdl = new tay((hy)this, "Right Y", this::taz_8).shth_7(Float.intBitsToFloat(Integer.reverse(1950635613) ^ 0x7A6A222E)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x232CCC1B ^ 0xBAB55661, 23))).ssd_5(0.0f);
    private final tay zqa = new tay((hy)this, "Right Z", this::rlt).shth_7(Float.intBitsToFloat(935410223 + -2009152047)).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(-262175537) ^ 0xCE6D36C2)).ssd_5(0.0f);
    private final tay rdz_4 = new tay((hy)this, "Left X", this::sts_8).shth_7(Float.intBitsToFloat(0x2E3AD32A ^ 0xEE1AD32A)).dhbs_2(Float.intBitsToFloat(356785601 + 719053375)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x597F798 ^ 0x9C305E01, 11))).ssd_5(0.0f);
    private final tay zlz_2 = new tay((hy)this, "Left Y", this::dgha).shth_7(Float.intBitsToFloat(Integer.reverse(1751597841) ^ 0x48C2E616)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(1272261930 + -243818589)).ssd_5(0.0f);
    private final tay jad_3 = new tay((hy)this, "Left Z", this::ssd_3).shth_7(Float.intBitsToFloat(0x3215D75 ^ 0xC3215D75)).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x6555619E ^ 0xC3330700, 25))).ssd_5(0.0f);
    private final badh_2 dhfb = new badh_2(this, "Item 360").bts(false);
    private final khd shty_2 = new khd((hy)this, "Spin Axis", this::dkq);
    private final fy zlh_2 = new fy(this.shty_2, "X");
    private final fy zbw = new fy(this.shty_2, "Y");
    private final fy tql = new fy(this.shty_2, "Z");
    private final tay khnl = new tay((hy)this, "Spin Speed", this::jdhgh).shth_7(Float.intBitsToFloat(Integer.reverse(-1439792800) ^ 0x38CDB898)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x3174579F ^ 0x3174D51F, 15))).rkh_3(Float.intBitsToFloat(-804879325 - -1841711274)).ssd_5(Float.intBitsToFloat(0x87097873 ^ 0xC76F1E15));
    public final badh_2 rda_4 = new badh_2(this, "Slow").bts(false);
    public final tay zmz_2 = new tay((hy)this, "Speed", this::btl).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x78D48E30 ^ 0x78D58710, 14))).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(166815861 - -927897483));
    private boolean thqgh = true;
    private int ddkh = 0;
    private int dmt_2 = 0;
    private static final int hms = 789934498;
    private static final int bds_4 = 2095122996;
    private static final int dwj = -2113209461;
    private static final int thbf = -1586595426;
    private static final int tf4a4x43nf = 439879839;
    private static final int gp5ahlk = -2074726131;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int hw2qm26c4x0yv;

    public static kz shdsh() {
        block0: {
            int n = -2031935065;
            int n2 = (n = Integer.rotateLeft(n * 408487587, 10) ^ 0xF664786) ^ 0xC9B0EAC6;
            if ((n2 ^ n) == -911152442) break block0;
            int cfr_ignored_0 = (0x4F53CB61 ^ n) - -521026536;
        }
        return rjj;
    }

    public kz() {
        rjj = this;
    }

    private void ask_2(class_4587 class_45872, float f, class_1306 class_13062) {
        float f2 = this.thh_9(f);
        float f3 = class_3532.method_15374((float)(class_3532.method_15355((float)f2) * (float)Math.PI));
        float f4 = (float)Math.sin((double)f2 * Math.PI);
        float f5 = class_13062 == class_1306.field_6182 ? -1.0f : 1.0f;
        float f6 = this.thqdh.thw_5() * 10.0f;
        if (this.tghy.sdh_2() == this.zdhy) {
            this.jsz_3(class_45872, class_13062, 0.0f);
            this.tshj_2(class_45872, class_13062, f2);
        } else if (this.tghy.sdh_2() == this.sngh) {
            this.jsz_3(class_45872, class_13062, 0.0f);
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(50.0f));
            class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * -60.0f));
            class_45872.method_22907(class_7833.field_40718.rotationDegrees(f5 * (110.0f + this.jshgh.thw_5() * f3)));
        } else if (this.tghy.sdh_2() == this.bts) {
            this.jsz_3(class_45872, class_13062, 0.0f);
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(50.0f));
            class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * (-30.0f * (1.0f - f3) - 30.0f + (this.jshgh.thw_5() - 20.0f) * f3)));
            class_45872.method_22907(class_7833.field_40718.rotationDegrees(f5 * 110.0f));
        } else if (this.tghy.sdh_2() == this.khfs_2) {
            this.jsz_3(class_45872, class_13062, 0.0f);
            class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * 90.0f));
            class_45872.method_22907(class_7833.field_40718.rotationDegrees(f5 * -30.0f));
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(-90.0f - this.jshgh.thw_5() * f4 + 10.0f));
        } else if (this.tghy.sdh_2() == this.tth_5) {
            this.jsz_3(class_45872, class_13062, 0.0f);
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(f2 * -360.0f));
        } else if (this.tghy.sdh_2() == this.bthb) {
            this.khghf(class_45872, class_13062, f2);
            this.jsz_3(class_45872, class_13062, 0.0f);
            this.tshj_2(class_45872, class_13062, f2);
        } else {
            this.jsz_3(class_45872, class_13062, 0.0f);
            if (this.rghz.thw_5() > 0.0f) {
                class_45872.method_46416(0.0f, -this.rghz.thw_5() * 0.18f * f4, 0.0f);
            }
            if (this.tghy.sdh_2() == this.th_4) {
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * (-45.0f + f3 * -20.0f)));
                class_45872.method_22907(class_7833.field_40718.rotationDegrees(f5 * f3 * -20.0f));
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(f3 * -80.0f));
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * 45.0f));
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(-f6 * f4));
            } else if (this.tghy.sdh_2() == this.sjt_3) {
                class_45872.method_46416(0.0f, 0.15f, -0.3f - this.hlz_2.thw_5());
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * 90.0f));
                class_45872.method_22907(class_7833.field_40718.rotationDegrees(f5 * -60.0f));
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(-this.tfd.thw_5() - f6 * f4));
            } else if (this.tghy.sdh_2() == this.shghm) {
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(f2 * (float)Math.PI - f6 * f4));
            } else if (this.tghy.sdh_2() == this.zths_2) {
                class_45872.method_46416(0.0f, 0.15f, -0.3f - this.hlz_2.thw_5());
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * 70.0f));
                class_45872.method_22907(class_7833.field_40718.rotationDegrees(f5 * -30.0f));
                class_45872.method_22905(0.9f, 0.9f, 0.9f);
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(-this.tfd.thw_5() - f6 * f4));
            } else if (this.tghy.sdh_2() == this.zygh) {
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * 45.0f));
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(f4 * -20.0f));
                class_45872.method_22907(class_7833.field_40718.rotationDegrees(f5 * f4 * -20.0f));
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(f4 * -80.0f));
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * -45.0f));
            } else if (this.tghy.sdh_2() == this.thaz) {
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * (45.0f + f4 * -20.0f)));
                class_45872.method_22907(class_7833.field_40718.rotationDegrees(f5 * f4 * -20.0f));
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(f4 * -80.0f));
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * -45.0f));
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(-f6 * f4));
            } else if (this.tghy.sdh_2() == this.djs) {
                class_45872.method_46416(0.0f, 0.0f, this.thqdh.thw_5() * -0.1f * f4);
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * 75.0f));
                class_45872.method_22907(class_7833.field_40718.rotationDegrees(f5 * (-37.5f * f4 - 60.0f)));
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(-75.0f));
            } else if (this.tghy.sdh_2() == this.shshl) {
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(-360.0f * f2));
            } else if (this.tghy.sdh_2() == this.tff) {
                class_45872.method_46416(0.0f, 0.0f, -0.3f * f4 - this.hlz_2.thw_5() * f4);
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(-35.0f * f4));
                class_45872.method_22907(class_7833.field_40718.rotationDegrees(f5 * 35.0f * f4));
            } else if (this.tghy.sdh_2() == this.khakh) {
                float f7 = this.dqgh_2(f, f2);
                class_45872.method_46416(0.0f, 0.02f * f4, -this.hlz_2.thw_5() * 0.35f * f4);
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * 45.0f));
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(-f7));
                class_45872.method_22907(class_7833.field_40718.rotationDegrees(f5 * 10.0f * f4));
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * -45.0f));
            } else if (this.tghy.sdh_2() == this.zkhh_2) {
                class_45872.method_46416(f5 * 0.18f, 0.17f, -0.35f - this.hlz_2.thw_5());
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * 90.0f));
                class_45872.method_22907(class_7833.field_40718.rotationDegrees(f5 * -60.0f));
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(-90.0f - f6 * f4 + this.hzgh_2.thw_5()));
            } else if (this.tghy.sdh_2() == this.ssy_2) {
                class_45872.method_46416(f5 * 0.18f, 0.17f, -0.35f - this.hlz_2.thw_5());
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * 90.0f));
                class_45872.method_22907(class_7833.field_40718.rotationDegrees(f5 * -30.0f));
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(-90.0f - f6 * f4 + this.hzgh_2.thw_5()));
            } else if (this.tghy.sdh_2() == this.shtb) {
                float f8 = this.thqdh.thw_5() * 10.0f;
                class_45872.method_46416(f5 * (0.22f + 0.2f * f4), -0.04f + 0.1f * f4, -0.35f - this.hlz_2.thw_5() - 0.28f * f4);
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * (45.0f - f4 * f8 * 0.35f)));
                class_45872.method_22907(class_7833.field_40718.rotationDegrees(f5 * f4 * -f8 * 0.3f));
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(f4 * -f8));
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * 30.0f));
            } else if (this.tghy.sdh_2() == this.rhsh_2) {
                class_45872.method_46416(0.0f, 0.07f, -0.18f - this.hlz_2.thw_5() - f4 * 0.22f);
                class_45872.method_22905(1.0f, 1.0f, 1.0f + f4 * this.thqdh.thw_5() * 0.03f);
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(-90.0f));
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * 20.0f));
            } else if (this.tghy.sdh_2() == this.ddh_2) {
                class_45872.method_46416(f5 * (-0.18f * f4), 0.05f + f4 * 0.18f, -0.22f - this.hlz_2.thw_5());
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * 65.0f));
                class_45872.method_22907(class_7833.field_40718.rotationDegrees(f5 * 5.0f));
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(-110.0f - 80.0f * f4));
            } else if (this.tghy.sdh_2() == this.dthdh) {
                class_45872.method_46416(0.0f, 0.04f, -0.2f - this.hlz_2.thw_5() - f4 * 0.2f);
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * 35.0f));
                class_45872.method_22905(1.0f, 1.0f, 1.0f + f4 * f2 * this.thqdh.thw_5() * 0.06f);
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(-90.0f));
            } else if (this.tghy.sdh_2() == this.zf_2) {
                float f9 = (float)Math.sin((double)f2 * Math.PI * 8.0) * this.thqdh.thw_5();
                class_45872.method_46416(0.0f, 0.04f * f4, -0.2f - this.hlz_2.thw_5() * 0.5f);
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * (110.0f + f9)));
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(-110.0f));
                class_45872.method_22907(class_7833.field_40716.rotationDegrees(f5 * 75.0f));
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(35.0f + f9));
            }
        }
    }

    public void ddk_4(class_742 class_7423, float f, float f2, class_1268 class_12682, float f3, class_1799 class_17992, float f4, class_4587 class_45872, class_4597 class_45972, int n) {
        if (class_7423.method_31550()) {
            return;
        }
        boolean bl = class_12682 == class_1268.field_5808;
        class_1306 class_13062 = bl ? class_7423.method_6068() : class_7423.method_6068().method_5928();
        class_45872.method_22903();
        if (class_17992.method_31574(class_1802.field_8399)) {
            this.dfa(class_7423, f, class_12682, f3, class_17992, f4, class_45872, class_45972, n, class_13062, bl);
        } else {
            this.khght(class_7423, f, class_12682, f3, class_17992, f4, class_45872, class_45972, n, class_13062);
        }
        class_45872.method_22909();
    }

    private void dfa(class_742 class_7423, float f, class_1268 class_12682, float f2, class_1799 class_17992, float f3, class_4587 class_45872, class_4597 class_45972, int n, class_1306 class_13062, boolean bl) {
        boolean bl2 = class_1764.method_7781((class_1799)class_17992);
        boolean bl3 = class_13062 == class_1306.field_6183;
        int n2 = bl3 ? 1 : -1;
        this.ghzt_2(class_45872, class_13062);
        if (class_7423.method_6115() && class_7423.method_6014() > 0 && class_7423.method_6058() == class_12682) {
            this.jsz_3(class_45872, class_13062, f3);
            class_45872.method_46416((float)n2 * -0.4785682f, -0.094387f, 0.05731531f);
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(-11.935f));
            class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n2 * 65.3f));
            class_45872.method_22907(class_7833.field_40718.rotationDegrees((float)n2 * -9.785f));
            float f4 = (float)class_17992.method_7935((class_1309)kz.mc.field_1724) - ((float)kz.mc.field_1724.method_6014() - f + 1.0f);
            float f5 = f4 / (float)class_1764.method_7775((class_1799)class_17992, (class_1309)kz.mc.field_1724);
            f5 = class_3532.method_15363((float)f5, (float)0.0f, (float)1.0f);
            if (f5 > 0.1f) {
                float f6 = class_3532.method_15374((float)((f4 - 0.1f) * 1.3f));
                float f7 = f5 - 0.1f;
                class_45872.method_46416(0.0f, f6 * f7 * 0.004f, 0.0f);
            }
            class_45872.method_46416(0.0f, 0.0f, f5 * 0.04f);
            class_45872.method_22905(1.0f, 1.0f, 1.0f + f5 * 0.2f);
            class_45872.method_22907(class_7833.field_40715.rotationDegrees((float)n2 * 45.0f));
        } else {
            this.khghf(class_45872, class_13062, f2);
            this.jsz_3(class_45872, class_13062, f3);
            this.tshj_2(class_45872, class_13062, f2);
            if (bl2 && f2 < 0.001f && bl) {
                class_45872.method_46416((float)n2 * -0.641864f, 0.0f, 0.0f);
                class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n2 * 10.0f));
            }
        }
        this.sft_2(class_45872);
        this.tfr((class_1309)class_7423, class_17992, bl3 ? class_811.field_4322 : class_811.field_4321, !bl3, class_45872, class_45972, n);
    }

    private void khght(class_742 class_7423, float f, class_1268 class_12682, float f2, class_1799 class_17992, float f3, class_4587 class_45872, class_4597 class_45972, int n, class_1306 class_13062) {
        boolean bl = class_13062 == class_1306.field_6183;
        this.dhsj_2(class_45872, bl);
        this.ghzt_2(class_45872, class_13062);
        if (class_7423.method_6115() && class_7423.method_6014() > 0 && class_7423.method_6058() == class_12682) {
            this.khnm(class_7423, f, class_13062, class_17992, f3, class_45872);
        } else if (class_7423.method_6123()) {
            this.jsz_3(class_45872, class_13062, f3);
            int n2 = bl ? 1 : -1;
            class_45872.method_46416((float)n2 * -0.4f, 0.8f, 0.3f);
            class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n2 * 65.0f));
            class_45872.method_22907(class_7833.field_40718.rotationDegrees((float)n2 * -85.0f));
        } else if (class_13062 == kz.mc.field_1690.method_42552().method_41753() && this.tlf_2()) {
            this.ask_2(class_45872, f2, class_13062);
        } else {
            this.khghf(class_45872, class_13062, f2);
            this.jsz_3(class_45872, class_13062, f3);
            this.tshj_2(class_45872, class_13062, f2);
        }
        this.sft_2(class_45872);
        this.tfr((class_1309)class_7423, class_17992, bl ? class_811.field_4322 : class_811.field_4321, !bl, class_45872, class_45972, n);
    }

    private void khnm(class_742 class_7423, float f, class_1306 class_13062, class_1799 class_17992, float f2, class_4587 class_45872) {
        int n = class_13062 == class_1306.field_6183 ? 1 : -1;
        switch (tthh.ddh_5[class_17992.method_7976().ordinal()]) {
            case 1: 
            case 2: {
                this.jsz_3(class_45872, class_13062, f2);
                break;
            }
            case 3: 
            case 4: {
                this.dmq(class_45872, f, class_13062, class_17992);
                this.jsz_3(class_45872, class_13062, f2);
                break;
            }
            case 5: {
                this.jsz_3(class_45872, class_13062, f2);
                class_45872.method_46416((float)n * -0.2785682f, 0.18344387f, 0.15731531f);
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(-13.935f));
                class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n * 35.3f));
                class_45872.method_22907(class_7833.field_40718.rotationDegrees((float)n * -9.785f));
                float f3 = (float)class_17992.method_7935((class_1309)kz.mc.field_1724) - ((float)kz.mc.field_1724.method_6014() - f + 1.0f);
                float f4 = f3 / 20.0f;
                f4 = (f4 * f4 + f4 * 2.0f) / 3.0f;
                f4 = Math.min(f4, 1.0f);
                if (f4 > 0.1f) {
                    float f5 = class_3532.method_15374((float)((f3 - 0.1f) * 1.3f));
                    float f6 = f4 - 0.1f;
                    class_45872.method_46416(0.0f, f5 * f6 * 0.004f, 0.0f);
                }
                class_45872.method_46416(0.0f, 0.0f, f4 * 0.04f);
                class_45872.method_22905(1.0f, 1.0f, 1.0f + f4 * 0.2f);
                class_45872.method_22907(class_7833.field_40715.rotationDegrees((float)n * 45.0f));
                break;
            }
            case 6: {
                this.jsz_3(class_45872, class_13062, f2);
                class_45872.method_46416((float)n * -0.5f, 0.7f, 0.1f);
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(-55.0f));
                class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n * 35.3f));
                class_45872.method_22907(class_7833.field_40718.rotationDegrees((float)n * -9.785f));
                float f7 = (float)class_17992.method_7935((class_1309)kz.mc.field_1724) - ((float)kz.mc.field_1724.method_6014() - f + 1.0f);
                float f8 = Math.min(f7 / 10.0f, 1.0f);
                if (f8 > 0.1f) {
                    float f9 = class_3532.method_15374((float)((f7 - 0.1f) * 1.3f));
                    float f10 = f8 - 0.1f;
                    class_45872.method_46416(0.0f, f9 * f10 * 0.004f, 0.0f);
                }
                class_45872.method_46416(0.0f, 0.0f, f8 * 0.2f);
                class_45872.method_22905(1.0f, 1.0f, 1.0f + f8 * 0.2f);
                class_45872.method_22907(class_7833.field_40715.rotationDegrees((float)n * 45.0f));
                break;
            }
            case 7: {
                this.khlj(class_45872, f, class_13062, class_17992, f2);
                break;
            }
            default: {
                this.jsz_3(class_45872, class_13062, f2);
            }
        }
    }

    private float thh_9(float f) {
        try {
            int n = -1193146262;
            n = Integer.rotateLeft(n * -2081576967, 26) ^ 0xADAEE150;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x7A4757E9;
            if ((n2 ^ n) != 2051495913) {
                int cfr_ignored_0 = (0xC2A55F83 ^ n) + 595236001;
            }
            if ((0x37D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        float f2 = kz.dzsh_2(f, 0.0f, 1.0f);
        float f3 = this.sbdh.thw_5();
        if (kz.dhbk(f3 - 1.0f) > Float.intBitsToFloat(-1252918392 - 2060380441)) {
            f2 = (float)Math.pow(f2, f3);
        }
        if (!this.tyn.shzl()) {
            return f2;
        }
        float f4 = this.shshd_2(f2);
        float f5 = class_3532.method_15363((float)this.shlm.thw_5(), (float)0.0f, (float)1.0f);
        return f2 + (f4 - f2) * f5;
    }

    private float shshd_2(float f) {
        int n = 924360302;
        n = Integer.rotateLeft(n * 446686651, 19) ^ 0xCD9B4138;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x6091F04F;
        if ((n2 ^ n) != 1620176975) {
            int cfr_ignored_0 = (0x57896E21 ^ n) + -510149817;
        }
        return f < Float.intBitsToFloat(97736254 - -959228354) ? Float.intBitsToFloat(Integer.reverse(729616403) ^ 0x8888BED4) * f * f * f : 1.0f - (float)Math.pow(Float.intBitsToFloat(-970394656 + -103347168) * f + 2.0f, Double.longBitsToDouble(0x196E04FABBBE530L ^ 0x419EE04FABBBE530L)) / 2.0f;
    }

    /*
     * Unable to fully structure code
     */
    private float dqgh_2(float var1_1, float var2_2) {
        var3_3 = 0.0f;
        var6_4 = 0;
        var4_5 = -1364348248;
        var4_5 = Integer.rotateLeft(var4_5 * -622615013, 18) ^ 1937608310;
        var4_5 = System.identityHashCode(this) ^ var4_5;
        var4_5 = Float.floatToIntBits(var1_1) ^ var4_5;
        var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -868997977, 22) ^ -1672739092424492452L ^ -1672739092424492452L);
        while (true) {
            block74: {
                block77: {
                    block67: {
                        block63: {
                            block75: {
                                block61: {
                                    block71: {
                                        block78: {
                                            block64: {
                                                block65: {
                                                    block69: {
                                                        block60: {
                                                            block76: {
                                                                block68: {
                                                                    block66: {
                                                                        block72: {
                                                                            block59: {
                                                                                block62: {
                                                                                    block70: {
                                                                                        block73: {
                                                                                            block58: {
                                                                                                var6_4 = Integer.rotateRight(var5_6, 22) ^ var4_5;
                                                                                                switch (var6_4 & 15) {
                                                                                                    case 0: {
                                                                                                        if (var6_4 == -1891590336) break block58;
                                                                                                        if (var6_4 != 537677856) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block59;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        if (var6_4 == 2081183810) break block60;
                                                                                                        if (var6_4 == 1552835266) break block61;
                                                                                                        (Integer.rotateRight(-1000052397 ^ var4_5, 11) + -863608760) * -1000052397;
                                                                                                        if (var6_4 == 1844334802) break block62;
                                                                                                        if (var6_4 != -132484718) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block63;
                                                                                                    }
                                                                                                    case 3: {
                                                                                                        if (var6_4 != 2091970579) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block64;
                                                                                                    }
                                                                                                    case 4: {
                                                                                                        if (var6_4 == -539347852) break block65;
                                                                                                        if (var6_4 == -1546101692) break block66;
                                                                                                        (Integer.rotateRight(-1933496609 ^ var4_5, 4) - 264391740) * -1933496609;
                                                                                                        if (var6_4 != -541979484) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block67;
                                                                                                    }
                                                                                                    case 5: {
                                                                                                        if (var6_4 != -355912843) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block68;
                                                                                                    }
                                                                                                    case 6: {
                                                                                                        if (var6_4 != 11799734) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block69;
                                                                                                    }
                                                                                                    case 7: {
                                                                                                        if (var6_4 == -868997977) break block70;
                                                                                                        if (var6_4 != -287387497) {
                                                                                                            (Integer.rotateLeft(-871310027 ^ var4_5, 12) - -1167562586) * -871310027;
                                                                                                            (int)(1054531741623315279L ^ (long)var4_5 ^ 1972720785247809685L);
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block71;
                                                                                                    }
                                                                                                    case 9: {
                                                                                                        if (var6_4 != -591614791) {
                                                                                                            if (var6_4 == 1692995049) break;
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block72;
                                                                                                    }
                                                                                                    case 10: {
                                                                                                        if (var6_4 == -1250215910) break block73;
                                                                                                        if (var6_4 != -46509494) {
                                                                                                            Integer.rotateRight(-91352721 ^ var4_5, 18) - 1536277420;
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block74;
                                                                                                    }
                                                                                                    case 12: {
                                                                                                        if (var6_4 != -1935088116) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block75;
                                                                                                    }
                                                                                                    case 13: {
                                                                                                        if (var6_4 != -1653313427) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block76;
                                                                                                    }
                                                                                                    case 14: {
                                                                                                        if (var6_4 != 681660286) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block77;
                                                                                                    }
                                                                                                    case 15: {
                                                                                                        if (var6_4 != 134611887) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block78;
                                                                                                    }
                                                                                                }
                                                                                                (Integer.rotateLeft(-409432583 ^ var4_5, 15) + 265736290) * -409432583;
                                                                                                (int)(2677992253814008655L ^ (long)var4_5 ^ -4974081639971166331L);
                                                                                                if (var1_1 > kz.brf(Integer.rotateLeft(792002521 ^ -1604580837, 2))) {
                                                                                                    (int)(-2703967638009604398L ^ (long)var4_5 ^ -2669486543558534878L);
                                                                                                    var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ 1288325041, 22) ^ 1888690325032324104L ^ 1888690325032324104L);
                                                                                                    (int)(-199431646541924733L ^ (long)var4_5 ^ 1045522826232092583L);
                                                                                                    var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ -1250215910, 22)));
                                                                                                    --var6_4;
                                                                                                    continue;
                                                                                                }
                                                                                                try {
                                                                                                    ++var6_4;
                                                                                                    if ((-6976753320787011953L ^ (long)var4_5 | 1L) == 0L) {
                                                                                                        throw new NoSuchElementException();
                                                                                                    }
                                                                                                    var5_6 = Integer.rotateLeft(var4_5 ^ -1891590336, 22) ^ -1515503445 ^ -1515503445;
                                                                                                }
                                                                                                catch (NoSuchElementException v0) {
                                                                                                    var5_6 = Integer.rotateLeft(var4_5 ^ -1891590336, 22) + -1470210233 - -1470210233;
                                                                                                }
                                                                                                continue;
                                                                                            }
                                                                                            (Integer.rotateRight(206153430 ^ var4_5, 4) - -2125933787) * 206153431;
                                                                                            var3_3 = (float)this.dmt_2 * Float.intBitsToFloat(Integer.reverse(-194025401) ^ -1595476433) + var2_2 * Float.intBitsToFloat(1772189590 + -649164694);
                                                                                            var5_6 = Integer.rotateLeft(var4_5 ^ 331056088, 22) + -1981898048 - -1981898048;
                                                                                            (Integer.rotateLeft(727660593 ^ var4_5, 8) + 1155886378) * 727660593;
                                                                                            (int)(-1590450114439877809L ^ (long)var4_5 ^ -3357289373745250806L);
                                                                                            var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ -46509494, 22)));
                                                                                            var6_4 += 2;
                                                                                            continue;
                                                                                        }
                                                                                        (Integer.rotateLeft(275544312 ^ var4_5, 5) + 25183555) * 275544313;
                                                                                        this.dmt_2 = this.ddkh;
                                                                                        this.ddkh = (this.ddkh + 1) % 3;
                                                                                        this.thqgh = false;
                                                                                        (int)(8815097435836165865L ^ (long)var4_5 ^ -746618686525843078L);
                                                                                        var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -1891590336, 22) ^ 1367193035010172283L ^ 1367193035010172283L);
                                                                                        continue;
                                                                                    }
                                                                                    Integer.rotateRight(-311496758 ^ var4_5, 16) + -993220431;
                                                                                    if (!(var1_1 < kz.dhas_4(484635880 + 538103207))) {
                                                                                        try {
                                                                                            var6_4 -= 2;
                                                                                            if ((9110372591618847401L ^ (long)var4_5 | 1L) == 0L) {
                                                                                                throw new NoSuchElementException();
                                                                                            }
                                                                                            var5_6 = Integer.rotateLeft(var4_5 ^ -591614791, 22) + 890045636 - 890045636;
                                                                                        }
                                                                                        catch (NoSuchElementException v1) {
                                                                                            var5_6 = Integer.rotateLeft(var4_5 ^ -591614791, 22) + 1584259363 - 1584259363;
                                                                                        }
                                                                                        var6_4 -= 5;
                                                                                        continue;
                                                                                    }
                                                                                    try {
                                                                                        var6_4 -= 3;
                                                                                        var5_6 = Integer.rotateLeft(var4_5 ^ 537677856, 22) ^ -1513642620 ^ -1513642620;
                                                                                    }
                                                                                    catch (IllegalArgumentException v2) {
                                                                                        var5_6 = Integer.rotateLeft(var4_5 ^ 537677856, 22) ^ 828611388 ^ 828611388;
                                                                                    }
                                                                                    var6_4 += 3;
                                                                                    continue;
                                                                                }
                                                                                Integer.rotateLeft(-479816920 ^ var4_5, 15) + -1916178157;
                                                                                if (!(var1_1 < kz.dhas_4(484635880 + 538103207))) {
                                                                                    var5_6 = Integer.rotateLeft(var4_5 ^ -591614791, 22) ^ -710158928 ^ -710158928;
                                                                                    (Integer.rotateRight(-1603937261 ^ var4_5, 7) + 1890796936) * -1603937261;
                                                                                    ++var6_4;
                                                                                    continue;
                                                                                }
                                                                                (int)(-6962043810377787384L ^ (long)var4_5 ^ 5288417561668915986L);
                                                                                var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ -373823329, 22)));
                                                                                (int)(3588907420975828461L ^ (long)var4_5 ^ 5035414426039995981L);
                                                                                var5_6 = Integer.rotateLeft(var4_5 ^ 537677856, 22);
                                                                                var6_4 += 5;
                                                                                continue;
                                                                            }
                                                                            Integer.rotateLeft(651564065 ^ var4_5, 7) + -1203105990;
                                                                            (int)(-1989260505300800689L ^ (long)var4_5 ^ -8554443343730809576L);
                                                                            this.thqgh = true;
                                                                            var3_3 = (float)this.ddkh * Float.intBitsToFloat(1778265842 - 655240946);
                                                                            try {
                                                                                var6_4 -= 4;
                                                                                var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -46509494, 22) ^ -2591303193929516581L ^ -2591303193929516581L);
                                                                            }
                                                                            catch (IllegalArgumentException v3) {
                                                                                var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ -46509494, 22)));
                                                                            }
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateRight(674548767 ^ var4_5, 8) - -490580228) * 674548767;
                                                                        if (this.thqgh) {
                                                                            try {
                                                                                var6_4 += 5;
                                                                                if ((5194709586809202267L ^ (long)var4_5 | 1L) == 0L) {
                                                                                    throw new IllegalStateException();
                                                                                }
                                                                                var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ 1692995049, 22) ^ -5078358801233643393L ^ -5078358801233643393L);
                                                                            }
                                                                            catch (IllegalStateException v4) {
                                                                                var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ 1692995049, 22) ^ -4115720788805134809L ^ -4115720788805134809L);
                                                                            }
                                                                            var6_4 -= 2;
                                                                            continue;
                                                                        }
                                                                        var5_6 = Integer.rotateLeft(var4_5 ^ 325681707, 22) + -577367804 - -577367804;
                                                                        (Integer.rotateRight(-204993894 ^ var4_5, 17) + -1986598943) * -204993893;
                                                                        var5_6 = Integer.rotateLeft(var4_5 ^ -1891590336, 22);
                                                                        var6_4 -= 2;
                                                                        continue;
                                                                    }
                                                                    (Integer.rotateRight(-1760282310 ^ var4_5, 5) + 1339067713) * -1760282309;
                                                                    var5_6 = Integer.rotateLeft(var4_5 ^ 1014066396, 22) + -1779013662 - -1779013662;
                                                                    (Integer.rotateRight(161445595 ^ var4_5, 4) + 783090624) * 161445595;
                                                                    var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -868997977, 22) ^ 4625451229618121005L ^ 4625451229618121005L);
                                                                    continue;
                                                                }
                                                                Integer.rotateRight(498489995 ^ var4_5, 6) + -1653434864;
                                                                var5_6 = Integer.rotateLeft(var4_5 ^ 1600254116, 22) ^ 1538115461 ^ 1538115461;
                                                                (Integer.rotateRight(-1997932874 ^ var4_5, 4) - -1733132475) * -1997932873;
                                                                (int)(708306646840655991L ^ (long)var4_5 ^ 3402528116794048121L);
                                                                var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ -868997977, 22)));
                                                                ++var6_4;
                                                                continue;
                                                            }
                                                            (Integer.rotateLeft(-2000501539 ^ var4_5, 4) - -1812761090) * -2000501539;
                                                            (int)(5363904667171744591L ^ (long)var4_5 ^ 2931987505877694769L);
                                                            var5_6 = Integer.rotateLeft(var4_5 ^ -606554904, 22) ^ 1200560376 ^ 1200560376;
                                                            (Integer.rotateRight(-1007857029 ^ var4_5, 11) + -1105552352) * -1007857029;
                                                            (int)(4116294604653786647L ^ (long)var4_5 ^ -777918984664522863L);
                                                            var5_6 = Integer.rotateLeft(var4_5 ^ -868997977, 22) + -1992840535 - -1992840535;
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(1192701941 ^ var4_5, 11) - -1607701018) * 1192701941;
                                                        (int)(-8816497998846170289L ^ (long)var4_5 ^ -80920644833204582L);
                                                        (int)(5006959454812409992L ^ (long)var4_5 ^ 7728728309180606249L);
                                                        var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ -868997977, 22)));
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(-86970892 ^ var4_5, 18) - 1672114119) * -86970891;
                                                    var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ -1681885009, 22)));
                                                    Integer.rotateLeft(194652616 ^ var4_5, 4) + 1812508275;
                                                    try {
                                                        --var6_4;
                                                        if ((-8313755082659116213L ^ (long)var4_5 | 1L) == 0L) {
                                                            throw new IllegalStateException();
                                                        }
                                                        var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -868997977, 22) ^ 3520992297631699000L ^ 3520992297631699000L);
                                                    }
                                                    catch (IllegalStateException v5) {
                                                        var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -868997977, 22) ^ 9121966586914917972L ^ 9121966586914917972L);
                                                    }
                                                    ++var6_4;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(-1585570127 ^ var4_5, 7) + -1834789206) * -1585570127;
                                                (int)(7191316821014014799L ^ (long)var4_5 ^ -7176341857755370936L);
                                                var5_6 = Integer.rotateLeft(var4_5 ^ 1012568257, 22);
                                                Integer.rotateLeft(540838016 ^ var4_5, 7) + -340646213;
                                                var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -868997977, 22) ^ 8011304608944392369L ^ 8011304608944392369L);
                                                Integer.rotateRight(381658918 ^ var4_5, 5) - -980230955;
                                                ++var6_4;
                                                continue;
                                            }
                                            (Integer.rotateRight(1292269470 ^ var4_5, 12) - 1478892381) * 1292269471;
                                            var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ 1912607678, 22) ^ 9046869354673728539L ^ 9046869354673728539L);
                                            (Integer.rotateLeft(2106160632 ^ var4_5, 18) + 939714627) * 2106160633;
                                            try {
                                                if ((-364058961671783541L ^ (long)var4_5 | 1L) == 0L) {
                                                    throw new ArithmeticException();
                                                }
                                                var5_6 = Integer.rotateLeft(var4_5 ^ -868997977, 22) + 298205154 - 298205154;
                                            }
                                            catch (ArithmeticException v6) {
                                                var5_6 = Integer.rotateLeft(var4_5 ^ -868997977, 22) ^ -2125145310 ^ -2125145310;
                                            }
                                            ++var6_4;
                                            continue;
                                        }
                                        Integer.rotateLeft(-496164288 ^ var4_5, 15) + 1872020731;
                                        var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ 66841017, 22)));
                                        (Integer.rotateLeft(-1720148239 ^ var4_5, 6) + -1711743382) * -1720148239;
                                        (int)(6614152656146721615L ^ (long)var4_5 ^ -7140313060736427451L);
                                        var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ -868997977, 22)));
                                        var6_4 -= 3;
                                        continue;
                                    }
                                    Integer.rotateRight(1030332839 ^ var4_5, 10) - 1948791412;
                                    (int)(-5276467340428091509L ^ (long)var4_5 ^ -8313331442793791395L);
                                    var5_6 = Integer.rotateLeft(var4_5 ^ 185595669, 22) + 1685604828 - 1685604828;
                                    (int)(-1296662211073648083L ^ (long)var4_5 ^ 6079114179723948499L);
                                    var5_6 = Integer.rotateLeft(var4_5 ^ -868997977, 22) + -652465861 - -652465861;
                                    continue;
                                }
                                Integer.rotateRight(-151297534 ^ var4_5, 17) + -322011783;
                                var5_6 = Integer.rotateLeft(var4_5 ^ 752336388, 22);
                                Integer.rotateRight(-125112853 ^ var4_5, 18) + 489713328;
                                var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ -868997977, 22)));
                                continue;
                            }
                            Integer.rotateRight(-1822470130 ^ var4_5, 5) - -588754707;
                            var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ 904051904, 22) ^ -8583205431560853463L ^ -8583205431560853463L);
                            (Integer.rotateLeft(732287792 ^ var4_5, 8) + 1299329547) * 732287793;
                            (int)(-1116307740449688868L ^ (long)var4_5 ^ -3063502970170749739L);
                            var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -868997977, 22) ^ 6747417685168213547L ^ 6747417685168213547L);
                            var6_4 -= 2;
                            continue;
                        }
                        Integer.rotateRight(1310414982 ^ var4_5, 12) - 2041403253;
                        var5_6 = Integer.rotateLeft(var4_5 ^ -550399889, 22);
                        Integer.rotateLeft(1083821953 ^ var4_5, 11) + -688013350;
                        (int)(-9067045964030350513L ^ (long)var4_5 ^ 4469966778624682375L);
                        try {
                            if ((311380440567281989L ^ (long)var4_5 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var5_6 = Integer.rotateLeft(var4_5 ^ -868997977, 22);
                        }
                        catch (ArithmeticException v7) {
                            var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -868997977, 22) ^ -28634105015645941L ^ -28634105015645941L);
                        }
                        continue;
                    }
                    (Integer.rotateRight(2113887419 ^ var4_5, 18) + 1179245024) * 2113887419;
                    var5_6 = Integer.rotateLeft(var4_5 ^ -629100159, 22) ^ 380341658 ^ 380341658;
                    (Integer.rotateLeft(1981974609 ^ var4_5, 17) + 1384915210) * 1981974609;
                    (int)(-5435802504269599921L ^ (long)var4_5 ^ -5645117984449444623L);
                    (int)(-1450833744628154308L ^ (long)var4_5 ^ -3910810955673601430L);
                    var5_6 = Integer.rotateLeft(var4_5 ^ -261484186, 22) ^ -1735663982 ^ -1735663982;
                    (int)(-5226336993833877507L ^ (long)var4_5 ^ 6418544997198250785L);
                    var5_6 = Integer.rotateLeft(var4_5 ^ -868997977, 22) + -313834696 - -313834696;
                    ++var6_4;
                    continue;
                }
                (Integer.rotateLeft(-1514329324 ^ var4_5, 7) - 373675687) * -1514329323;
                var5_6 = Integer.rotateLeft(var4_5 ^ -1641725075, 22);
                Integer.rotateRight(1534346318 ^ var4_5, 14) - 393340077;
                try {
                    if ((8677269109275212355L ^ (long)var4_5 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ -868997977, 22)));
                }
                catch (ArithmeticException v8) {
                    var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -868997977, 22) ^ 2308500594183741960L ^ 2308500594183741960L);
                }
                ++var6_4;
                continue;
            }
            return var3_3;
lbl372:
            // 14 sources

            Integer.rotateRight(1091021415 ^ var4_5, 11) - -464830028;
            var5_6 = Integer.rotateLeft(var4_5 ^ -868997977, 22) ^ 1895568385 ^ 1895568385;
        }
    }

    private void dhsj_2(class_4587 class_45872, boolean bl) {
        qh_2 qh2_2 = qh_2.dhdz();
        if (qh2_2 == null) {
            return;
        }
        qh2_2.zght_2(class_45872, bl ? class_1306.field_6183 : class_1306.field_6182);
    }

    private void ghzt_2(class_4587 class_45872, class_1306 class_13062) {
        if (!this.dtz.shzl() || !this.zta_6()) {
            return;
        }
        if (class_13062 == class_1306.field_6183) {
            class_45872.method_46416(this.shshj.thw_5(), this.dhdl.thw_5(), this.zqa.thw_5());
        } else {
            class_45872.method_46416(-this.rdz_4.thw_5(), this.zlz_2.thw_5(), this.jad_3.thw_5());
        }
    }

    private void sft_2(class_4587 class_45872) {
        if (!this.dhfb.shzl()) {
            return;
        }
        float f = (float)System.nanoTime() / 1.0E9f * this.khnl.thw_5() * 90.0f;
        if (this.shty_2.sdh_2() == this.zbw) {
            class_45872.method_22907(class_7833.field_40716.rotationDegrees(f));
        } else if (this.shty_2.sdh_2() == this.tql) {
            class_45872.method_22907(class_7833.field_40718.rotationDegrees(f));
        } else {
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(f));
        }
    }

    private void khghf(class_4587 class_45872, class_1306 class_13062, float f) {
        int n = class_13062 == class_1306.field_6183 ? 1 : -1;
        float f2 = -0.4f * class_3532.method_15374((float)(class_3532.method_15355((float)f) * (float)Math.PI));
        float f3 = 0.2f * class_3532.method_15374((float)(class_3532.method_15355((float)f) * ((float)Math.PI * 2)));
        float f4 = -0.2f * class_3532.method_15374((float)(f * (float)Math.PI));
        class_45872.method_46416((float)n * f2, f3, f4);
    }

    private void khlj(class_4587 class_45872, float f, class_1306 class_13062, class_1799 class_17992, float f2) {
        this.jsz_3(class_45872, class_13062, f2);
        float f3 = kz.mc.field_1724.method_6014() % 10;
        float f4 = f3 - f + 1.0f;
        float f5 = 1.0f - f4 / 10.0f;
        float f6 = -15.0f + 75.0f * class_3532.method_15362((float)(f5 * 2.0f * (float)Math.PI));
        if (class_13062 != class_1306.field_6183) {
            class_45872.method_22904(0.1, 0.83, 0.35);
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(-80.0f));
            class_45872.method_22907(class_7833.field_40716.rotationDegrees(-90.0f));
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(f6));
            class_45872.method_22904(-0.3, 0.22, 0.35);
        } else {
            class_45872.method_22904(-0.25, 0.22, 0.35);
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(-80.0f));
            class_45872.method_22907(class_7833.field_40716.rotationDegrees(90.0f));
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(f6));
        }
    }

    private void dmq(class_4587 class_45872, float f, class_1306 class_13062, class_1799 class_17992) {
        float f2;
        float f3 = (float)kz.mc.field_1724.method_6014() - f + 1.0f;
        float f4 = f3 / (float)class_17992.method_7935((class_1309)kz.mc.field_1724);
        if (f4 < 0.8f) {
            f2 = class_3532.method_15379((float)(class_3532.method_15362((float)(f3 / 4.0f * (float)Math.PI)) * 0.1f));
            class_45872.method_46416(0.0f, f2, 0.0f);
        }
        f2 = 1.0f - (float)Math.pow(f4, 27.0);
        int n = class_13062 == class_1306.field_6183 ? 1 : -1;
        class_45872.method_46416(f2 * 0.6f * (float)n, f2 * -0.5f, f2 * 0.0f);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n * f2 * 90.0f));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(f2 * 10.0f));
        class_45872.method_22907(class_7833.field_40718.rotationDegrees((float)n * f2 * 30.0f));
    }

    private void jsz_3(class_4587 class_45872, class_1306 class_13062, float f) {
        int n = class_13062 == class_1306.field_6183 ? 1 : -1;
        class_45872.method_46416((float)n * 0.56f, -0.52f + f * -0.6f, -0.72f);
    }

    private void tshj_2(class_4587 class_45872, class_1306 class_13062, float f) {
        int n = class_13062 == class_1306.field_6183 ? 1 : -1;
        float f2 = class_3532.method_15374((float)(f * f * (float)Math.PI));
        float f3 = class_3532.method_15374((float)(class_3532.method_15355((float)f) * (float)Math.PI));
        class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n * (45.0f + f2 * -20.0f)));
        class_45872.method_22907(class_7833.field_40718.rotationDegrees((float)n * f3 * -20.0f));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(f3 * -80.0f));
        class_45872.method_22907(class_7833.field_40716.rotationDegrees((float)n * -45.0f));
    }

    public void tfr(class_1309 class_13092, class_1799 class_17992, class_811 class_8112, boolean bl, class_4587 class_45872, class_4597 class_45972, int n) {
        if (!class_17992.method_7960()) {
            mc.method_1480().method_23177(class_13092, class_17992, class_8112, bl, class_45872, class_45972, class_13092.method_37908(), n, class_4608.field_21444, class_13092.method_5628() + class_8112.ordinal());
        }
    }

    public boolean tlf_2() {
        try {
            int n = 1608543779;
            n = Integer.rotateLeft(n * -754453551, 23) ^ 0x44ED98C3;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 8);
            int n2 = n ^ 0xBBD527D4;
            if ((n2 ^ n) != -1143658540) {
                int cfr_ignored_0 = (0xE43549F7 ^ n) - 451968482;
            }
            if ((0xDD & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (kz.dhrsh()) {
            throw null;
        }
        return !kz.skhs_2(this.wdh) || kz.hs_4() != null;
    }

    private boolean zta_6() {
        int n = 2112041363;
        int n2 = (n = Integer.rotateLeft(n * -953131575, 21) ^ 0xD58B8D8) ^ 0x72C6E35F;
        if ((n2 ^ n) != 1925636959) {
            int cfr_ignored_0 = (0xF25D2CC ^ n) - -1224936513;
        }
        return !this.sdt_4.shzl() || bjd.shfn() != null;
    }

    private boolean zqs_4() {
        int n = -492325117;
        n = Integer.rotateLeft(n * 1926808741, 13) ^ 0xBAF14B14;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 3);
        int n2 = n ^ 0x752956B1;
        if ((n2 ^ n) != 1965643441) {
            int cfr_ignored_0 = (0x978EE1B2 ^ n) + -110778904;
        }
        return this.tghy.sdh_2() == this.sngh || this.tghy.sdh_2() == this.bts || this.tghy.sdh_2() == this.khfs_2;
    }

    private boolean shh_5() {
        int n = -1032440954;
        n = Integer.rotateLeft(n * -650714027, 14) ^ 0x7BCED5F8;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 8);
        int n2 = n ^ 0x48664D4E;
        if ((n2 ^ n) != 1214664014) {
            int cfr_ignored_0 = (0x8A107EC8 ^ n) - 449625566;
        }
        return kz.tht_6(this.tghy) == this.sjt_3 || this.tghy.sdh_2() == this.zths_2;
    }

    private boolean bjsh() {
        int n = -2134077253;
        n = Integer.rotateLeft(n * 2114591421, 5) ^ 0x68A6521C;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xF205E35D;
        if ((n2 ^ n) != -234495139) {
            int cfr_ignored_0 = (0x72C973E6 ^ n) + -462107518;
        }
        return kz.khaj_2(this.tghy) == this.zkhh_2 || kz.dhdh_3(this.tghy) == this.ssy_2;
    }

    private boolean btl() {
        try {
            int n = -2135632464;
            n = Integer.rotateLeft(n * -1212953523, 5) ^ 0x8F0E1EB8;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 19);
            int n2 = n ^ 0xB9A979B3;
            if ((n2 ^ n) != -1180075597) {
                int cfr_ignored_0 = (0x391DAC03 ^ n) + 1455352990;
            }
            if ((0x13A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.rda_4.shzl();
    }

    private boolean jdhgh() {
        int n = 170869222;
        n = Integer.rotateLeft(n * 1025924423, 24) ^ 0x7D93BB3D;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xB574AF83;
        if ((n2 ^ n) != -1250644093) {
            int cfr_ignored_0 = (0xBF5BEE65 ^ n) - -1039400705;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.dhfb.shzl();
    }

    private boolean dkq() {
        try {
            int n = -220728244;
            n = Integer.rotateLeft(n * -602699621, 12) ^ 0xF7CD196F;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xB5586F1A;
            if ((n2 ^ n) != -1252495590) {
                int cfr_ignored_0 = (0x478F9B56 ^ n) + -1755598411;
            }
            if ((0x30A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.dhfb.shzl();
    }

    private boolean ssd_3() {
        int n = -2123443680;
        int n2 = (n = Integer.rotateLeft(n * -738336181, 20) ^ 0x490F34B0) ^ 0x2F6FB9BD;
        if ((n2 ^ n) != 795851197) {
            int cfr_ignored_0 = (0xAE016B9D ^ n) + 426348214;
        }
        return !this.dtz.shzl();
    }

    private boolean dgha() {
        try {
            int n = 1863388049;
            n = Integer.rotateLeft(n * 287611883, 21) ^ 0x2E1D0A46;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 3);
            int n2 = n ^ 0x980F9FE4;
            if ((n2 ^ n) != -1743806492) {
                int cfr_ignored_0 = (0xF71E9475 ^ n) - 1820853493;
            }
            if ((0x143 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.dtz.shzl();
    }

    private boolean sts_8() {
        int n = -1759208402;
        int n2 = (n = Integer.rotateLeft(n * -880377893, 25) ^ 0xAA509766) ^ 0x1BA502F6;
        if ((n2 ^ n) != 463799030) {
            int cfr_ignored_0 = (0x8C819ED8 ^ n) - -282539384;
        }
        return !this.dtz.shzl();
    }

    private boolean rlt() {
        int n = 149668316;
        int n2 = (n = Integer.rotateLeft(n * -1470116507, 17) ^ 0xF3461DE) ^ 0x5BAB282A;
        if ((n2 ^ n) != 1537943594) {
            int cfr_ignored_0 = (0x5340E9F6 ^ n) + 1650093802;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return !this.dtz.shzl();
    }

    private boolean taz_8() {
        int n = -385702053;
        n = Integer.rotateLeft(n * 1746253231, 26) ^ 0x60BD21B;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xA7678E59;
        if ((n2 ^ n) != -1486385575) {
            int cfr_ignored_0 = (0x4E652902 ^ n) + -917347191;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.dtz.shzl();
    }

    private boolean thhq() {
        try {
            int n = -1070215085;
            n = Integer.rotateLeft(n * 1173138803, 26) ^ 0xDD3FC360;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 19);
            int n2 = n ^ 0x2DD58D2A;
            if ((n2 ^ n) != 768970026) {
                int cfr_ignored_0 = (0xEDE05D79 ^ n) + -1554729054;
            }
            if ((0x68 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.dtz.shzl();
    }

    private boolean dhwh_2() {
        int n = thm.asz_2(-1504170423);
        int n2 = n ^ 0x23D6AA26;
        if ((n2 ^ n) != 601270822) {
            int cfr_ignored_0 = Integer.rotateRight(0x858E846F ^ n, 3) - 815769772;
        }
        return !this.dtz.shzl();
    }

    private boolean hghl() {
        try {
            int n = 877916678;
            n = Integer.rotateLeft(n * -455656621, 27) ^ 0xAA9BC164;
            int n2 = n ^ 0xC93E1964;
            if ((n2 ^ n) != -918677148) {
                int cfr_ignored_0 = (0xFD6DEB62 ^ n) + 32616657;
            }
            if ((0x203 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return !this.tyn.shzl();
    }

    private boolean sdt_3() {
        int n = -987580257;
        n = Integer.rotateLeft(n * -1903619595, 9) ^ 0x535BFFEA;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xF1FD4DFB;
        if ((n2 ^ n) != -235057669) {
            int cfr_ignored_0 = (0x34DFF564 ^ n) - -1517341621;
        }
        return !this.bjsh();
    }

    private boolean ars() {
        int n = thm.asz_2(-1318516944);
        int n2 = n ^ 0xB8AC742A;
        if ((n2 ^ n) != -1196657622) {
            int cfr_ignored_0 = (Integer.rotateRight(0x9C5731A ^ n, 4) + 860262241) * 163935003;
        }
        return !this.shh_5();
    }

    private boolean jth_5() {
        int n = thm.asz_2(136139486);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x478007E8;
        if ((n2 ^ n) != 1199572968) {
            int cfr_ignored_0 = (Integer.rotateRight(0x4F9D5536 ^ n, 12) - -1469386555) * 1335711031;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.zqs_4();
    }

    private static String dfh_4(String string, int n, int n2, int n3) {
        int n4 = -695101832;
        n4 = Integer.rotateLeft(n4 * 1969894927, 28) ^ 0x385ED998;
        n4 = Integer.rotateRight(n ^ n4, 12);
        int n5 = (n4 = n2 ^ n4) ^ 0x367E0501;
        if ((n5 ^ n4) != 914228481) {
            int cfr_ignored_0 = (0xE0EF9379 ^ n4) - -463152763;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x147A7606 ^ n2 ^ i * -1634554049 ^ hms, 7) ^ bds_4));
        }
        return new String(cArray);
    }

    private static float dzsh_2(float f, float f2, float f3) {
        block0: {
            int n = thm.asz_2(-476150589);
            int n2 = n ^ 0x4EAC5D22;
            if ((n2 ^ n) == 1319918882) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xAD32D9E1 ^ n, 8) + -41549446;
            int cfr_ignored_1 = (int)(0x6F8077DC27D4EB4FL ^ (long)n ^ 0x12C8831A2DB972D1L);
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static float dhbk(float f) {
        block0: {
            int n = 371239468;
            n = Integer.rotateLeft(n * -1462937921, 7) ^ 0xAA19A235;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xB3B4D2DE;
            if ((n2 ^ n) == -1279995170) break block0;
            int cfr_ignored_0 = (0xA59478F2 ^ n) - 1285125630;
        }
        return Math.abs(f);
    }

    private static float dhas_4(int n) {
        block0: {
            int n2 = -1511059745;
            n2 = Integer.rotateLeft(n2 * 125539077, 17) ^ 0xF40C8D5B;
            int n3 = (n2 = n ^ n2) ^ 0x3393F2B0;
            if ((n3 ^ n2) == 865333936) break block0;
            int cfr_ignored_0 = (0x967CFC6F ^ n2) + -1946002708;
        }
        return Float.intBitsToFloat(n);
    }

    private static float brf(int n) {
        block0: {
            int n2 = 2089615544;
            n2 = Integer.rotateLeft(n2 * 1793730367, 15) ^ 0x2AE0F08A;
            int n3 = (n2 = n ^ n2) ^ 0xDBCF1DE5;
            if ((n3 ^ n2) == -607183387) break block0;
            int cfr_ignored_0 = (0xA7421D5D ^ n2) - 1531705221;
        }
        return Float.intBitsToFloat(n);
    }

    private static boolean dhrsh() {
        block0: {
            int n = thm.asz_2(-32805467);
            int n2 = n ^ 0xBE473154;
            if ((n2 ^ n) == -1102630572) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x404C5CF1 ^ n, 11) + -845356950) * 1078746353;
            int cfr_ignored_1 = (int)(0x82FEF2CC27D4EB4FL ^ (long)n ^ 0x18E8831A2DB8A82CL);
        }
        return yf.dnkh();
    }

    private static boolean skhs_2(badh_2 badh2) {
        block0: {
            int n = -2030612900;
            int n2 = (n = Integer.rotateLeft(n * -2135402465, 18) ^ 0x2FCEA21E) ^ 0xD17F557D;
            if ((n2 ^ n) == -780184195) break block0;
            int cfr_ignored_0 = (0x57881B21 ^ n) + 758596486;
        }
        return badh2.shzl();
    }

    private static class_1309 hs_4() {
        block0: {
            int n = -1107059975;
            int n2 = (n = Integer.rotateLeft(n * -1291966663, 17) ^ 0xA0FC4A6F) ^ 0x9C792608;
            if ((n2 ^ n) == -1669782008) break block0;
            int cfr_ignored_0 = (0x227ABCF1 ^ n) + -1947589394;
        }
        return bjd.shfn();
    }

    private static fy tht_6(khd khd2) {
        block0: {
            int n = -1888023193;
            int n2 = (n = Integer.rotateLeft(n * 518730719, 18) ^ 0x517558E8) ^ 0xFA48418E;
            if ((n2 ^ n) == -95927922) break block0;
            int cfr_ignored_0 = (0x753F4CE9 ^ n) + 744588530;
        }
        return khd2.sdh_2();
    }

    private static fy khaj_2(khd khd2) {
        block0: {
            int n = -974517823;
            int n2 = (n = Integer.rotateLeft(n * 1994079225, 8) ^ 0xC7D4587B) ^ 0x566B1658;
            if ((n2 ^ n) == 1449858648) break block0;
            int cfr_ignored_0 = (0x93811F99 ^ n) + -234678673;
        }
        return khd2.sdh_2();
    }

    private static fy dhdh_3(khd khd2) {
        block0: {
            int n = 1129426737;
            int n2 = (n = Integer.rotateLeft(n * 1400131983, 26) ^ 0xC74E30E5) ^ 0xD8654AB6;
            if ((n2 ^ n) == -664450378) break block0;
            int cfr_ignored_0 = (0x9B34E587 ^ n) + 1748372681;
        }
        return khd2.sdh_2();
    }

    private static String[] zqd_4(String string) {
        block0: {
            int n = thm.asz_2(226211135);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 14);
            int n2 = n ^ 0x979FF6EC;
            if ((n2 ^ n) == -1751124244) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x9AE443D3 ^ n, 6) + -972958264) * -1696316461;
        }
        return string.split("\u0005\u001b", -1);
    }

    private static CallSite ghza(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 123488461;
            n3 = Integer.rotateLeft(n3 * 1995443707, 15) ^ 0x61A416CA;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            Class clazz2 = clazz;
            n3 = (clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n3;
            int n4 = n3 ^ 0x98A615B2;
            if ((n4 ^ n3) != -1733945934) {
                int cfr_ignored_0 = (0x9FFA5D7F ^ n3) + -127951840;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ dwj ^ string.hashCode() ^ n2 + thbf + i * -1656700605) + dwj) ^ thbf));
            }
            String[] stringArray = kz.zqd_4(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] h04fv5msz0(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite k47diibxvxf(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ tf4a4x43nf ^ string.hashCode() ^ n2 + gp5ahlk + i * 880011441) + tf4a4x43nf) ^ gp5ahlk));
            }
            String[] stringArray = kz.h04fv5msz0(new String(cArray));
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

