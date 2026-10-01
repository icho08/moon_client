/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1297
 *  net.minecraft.class_1303
 *  net.minecraft.class_1309
 *  net.minecraft.class_1531
 *  net.minecraft.class_1541
 *  net.minecraft.class_1542
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_5498
 *  net.minecraft.class_9801
 *  org.joml.Vector2f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1303;
import net.minecraft.class_1309;
import net.minecraft.class_1531;
import net.minecraft.class_1541;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_5498;
import net.minecraft.class_9801;
import org.joml.Vector2f;
import us.m0vy.moondlc.m0vyguard.bbd_2;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.bthw;
import us.m0vy.moondlc.m0vyguard.bkha_2;
import us.m0vy.moondlc.m0vyguard.bdht;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.blh_2;
import us.m0vy.moondlc.m0vyguard.bmn;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tbh;
import us.m0vy.moondlc.m0vyguard.tthgh;
import us.m0vy.moondlc.m0vyguard.jk;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.dhd_5;
import us.m0vy.moondlc.m0vyguard.shk_3;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.tth_8;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.zth_8;
import us.m0vy.moondlc.m0vyguard.ghdh_3;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="ESP", category=bzw.OTHER, desc="Renders players, items, and entities through walls.")
public class bghb
extends bnq {
    private final bbd_2 shah_2 = new bbd_2(this, "Entities");
    private final s_3 haa_2 = new s_3(this.shah_2, "Players").thst();
    private final s_3 shtt = new s_3(this.shah_2, "Items").thst();
    private final s_3 bhdh = new s_3(this.shah_2, "TNT");
    private final bbd_2 rwgh = new bbd_2((hy)this, "Player Vi".concat("suals"), this::ajt);
    private final s_3 bzk_2 = new s_3(this.rwgh, "Corner 2D");
    private final s_3 tmsh = new s_3(this.rwgh, "Full 2D").thst();
    private final s_3 thghdh = new s_3(this.rwgh, "3D Box").thst();
    private final s_3 tbd = new s_3(this.rwgh, "Skeleton");
    private final s_3 tzq_2 = new s_3(this.rwgh, "HP Bar").thst();
    private final s_3 tsl_2 = new s_3(this.rwgh, "Eye Line").thst();
    private final bbd_2 tshy = new bbd_2((hy)this, "Labels", this::sza_3);
    private final s_3 rzw_2 = new s_3(this.tshy, "Item Label").thst();
    private final s_3 ddf_2 = new s_3(this.tshy, "TNT Label").thst();
    private final khd sghj = new khd((hy)this, "Color Mode", this::hshs_2);
    private final fy thyd_2 = new fy(this.sghj, "Theme");
    private final fy hz = new fy(this.sghj, "Custom");
    private final fy dhdl_2 = new fy(this.sghj, "Animated");
    private final bzw_2 hthh = new bzw_2(this, "Player".concat(" Color"), this::dhyd_2).dhshy(new byq(Float.intBitsToFloat(0x340E75CA ^ 0x777175CA), Float.intBitsToFloat(697650401 - -424063775), Float.intBitsToFloat(Integer.rotateLeft(0xDF80000F ^ 0xDF05400F, 7)), Float.intBitsToFloat(1257656809 - 125260265)));
    private final bzw_2 dhhf = new bzw_2(this, "Secondary Color", this::thsl_2).dhshy(new byq(Float.intBitsToFloat(Integer.rotateLeft(0xF3FD237C ^ 0xE42D237E, 29)), Float.intBitsToFloat(Integer.reverse(56558976) ^ 0x4294FAC0), Float.intBitsToFloat(Integer.reverse(-789214272) ^ 0x40AEAF0B), Float.intBitsToFloat(0x52751D1A ^ 0x110A1D1A)));
    private final bzw_2 tdy = new bzw_2(this, "Friend Color", this::zzh_5).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-629830084) ^ 0x7EDBAE5B), Float.intBitsToFloat(Integer.rotateLeft(0x3C2E16D7 ^ 0x3C2E558B, 16)), Float.intBitsToFloat(1059821970 + 59926126), Float.intBitsToFloat(0x1F1BF8A5 ^ 0x5C64F8A5)));
    private final bzw_2 thhs = new bzw_2(this, "Item Color", this::zzs_2).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-158247433) ^ 0xACD5896F), Float.intBitsToFloat(1219524500 + -87127956), Float.intBitsToFloat(1899811852 - 767415308), Float.intBitsToFloat(221544460 - -910852084)));
    private final bzw_2 sbw = new bzw_2(this, "TNT Color", this::dtq_3).dhshy(new byq(Float.intBitsToFloat(711025429 + 421371115), Float.intBitsToFloat(Integer.rotateLeft(0xEDCAA8AA ^ 0xEDCAB81A, 18)), Float.intBitsToFloat(Integer.reverse(1780541626) ^ 0x1FD70456), Float.intBitsToFloat(1083299504 - -49097040)));
    private final badh_2 zghkh = new badh_2((hy)this, "Backdrop", this::ddw).bts(true);
    private final tay saq_2 = new tay((hy)this, "2D F".concat("ill Alpha"), this::bdhq).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(0xEA574DD3 ^ 0xA9634DD3)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x3A348CE6 ^ 0x3A34ADFC, 17)));
    private final tay shw_4 = new tay((hy)this, "2D Line Width", this::zha_6).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(-2099101833 + -1113735031)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x8E75421A ^ 0x17ECE5A3, 19))).ssd_5(Float.intBitsToFloat(0x8C66B707 ^ 0xB3A6B707));
    private final tay dhjj = new tay((hy)this, "3D Fil".concat("l Alpha"), this::tqth_2).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(-484755947 - -1613548011)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(0xB6B39FF ^ 0x494339FF));
    private final tay dthz_2 = new tay((hy)this, "3D Line".concat(" Width"), this::rmz_2).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(-363040724 - -1447268308)).rkh_3(Float.intBitsToFloat(-553470429 + 1590302378)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x28673BE3 ^ 0x86408D0, 1)));
    private final tay dhsz_2 = new tay((hy)this, "Skeleto".concat("n Width"), this::dhat_3).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(47983695 - -1036243889)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x62454CBD ^ 0xFCA32ADB, 1))).ssd_5(Float.intBitsToFloat(Integer.reverse(2043013499) ^ 0x9EA490AD));
    private final tay sdh_6 = new tay((hy)this, "HP Bar ".concat("Width"), this::tgha).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x35A97AEB ^ 0x35A978EE, 21))).rkh_3(Float.intBitsToFloat(0x1AAAC81F ^ 0x276604D2)).ssd_5(Float.intBitsToFloat(0x16329741 ^ 0x562B0EDB));
    private final tay tjl = new tay((hy)this, "Animation Speed", this::bshs).shth_7(2.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xAE4F75F3 ^ 0xAA5075F3, 4))).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.reverse(1951468297) ^ 0xD1908A2E));
    private final bql<shw_3> dz_4 = this::byh_2;
    private final bql<bbgh> rtd_3 = this::zkth_2;
    private static final int khddh = -1849859144;
    private static final int jzr_2 = 999306144;
    private static final int dbt = 1424953590;
    private static final int thdn_2 = 1292949059;
    private static final int e3wz4l0 = -376096801;
    private static final int o30p6yoa = -276987222;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int tawd2xszqpv;

    private boolean snm_2(class_1297 class_12972) {
        if (class_12972 == null || !class_12972.method_5805() || class_12972 instanceof class_1531 || class_12972 instanceof class_1303) {
            return false;
        }
        if (class_12972 == bghb.mc.field_1724 && bghb.mc.field_1690.method_31044() == class_5498.field_26664) {
            return false;
        }
        if (class_12972 instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_12972;
            if (!this.haa_2.alh()) {
                return false;
            }
            blh_2 blh2_2 = (blh_2)Moondlc.getInstance().getModuleManager().dfr_2(blh_2.class);
            return blh2_2 == null || !blh2_2.rgha_2() || !blh_2.dhwj(class_16572);
        }
        if (class_12972 instanceof class_1542) {
            return this.shtt.alh();
        }
        if (class_12972 instanceof class_1541) {
            return this.bhdh.alh();
        }
        return false;
    }

    private void ddhr(class_1657 class_16572, jk jk2, float f, class_4587 class_45872) {
        class_287 class_2872;
        double d = class_3532.method_16436((double)f, (double)class_16572.field_6014, (double)class_16572.method_23317());
        double d2 = class_3532.method_16436((double)f, (double)class_16572.field_6036, (double)class_16572.method_23318());
        double d3 = class_3532.method_16436((double)f, (double)class_16572.field_5969, (double)class_16572.method_23321());
        class_238 class_2383 = class_16572.method_5829().method_989(d - class_16572.method_23317(), d2 - class_16572.method_23318(), d3 - class_16572.method_23321());
        float f2 = this.dthz_2.thw_5();
        byq byq2 = jk2.dhthkh;
        byq byq3 = jk2.sdd_4.tkhl_2(Math.min(255.0f, byq2.tzdh_2()));
        byq byq4 = jk2.dhthkh.dkhw_2(jk2.sdd_4, 0.5f).tkhl_2(this.dhjj.thw_5());
        shk_3.thsh_9(false);
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        if (f2 > 0.0f) {
            RenderSystem.lineWidth((float)f2);
        }
        class_45872.method_22903();
        shk_3.tsh(class_45872);
        class_289 class_2892 = class_289.method_1348();
        if (byq4.tzdh_2() > 0.0f) {
            class_2872 = class_2892.method_60827(class_293.class_5596.field_27382, class_290.field_1576);
            tth_8.khldh(class_45872, class_2872, class_2383, byq4);
            shk_3.tbgh_2(class_2872);
        }
        if (f2 > 0.0f) {
            class_2872 = class_2892.method_60827(class_293.class_5596.field_29344, class_290.field_1576);
            tth_8.zsz_6(class_45872, class_2872, class_2383, byq2);
            shk_3.tbgh_2(class_2872);
            RenderSystem.lineWidth((float)Math.max(0.5f, f2 - 0.35f));
            class_287 class_2873 = class_2892.method_60827(class_293.class_5596.field_29344, class_290.field_1576);
            tth_8.zsz_6(class_45872, class_2873, class_2383.method_1014(0.005), byq3.tkhl_2(145.0f));
            shk_3.tbgh_2(class_2873);
        }
        class_45872.method_22909();
        shk_3.tsd_6();
        RenderSystem.lineWidth((float)1.0f);
    }

    private void ghkhf(ghdh_3 ghdh2, class_1657 class_16572, dhd_5 dhd2) {
        jk jk2 = this.dhhd_2((class_1297)class_16572);
        if (this.bzk_2.alh()) {
            this.dhlsh(ghdh2, dhd2, jk2);
        }
        if (this.tmsh.alh()) {
            this.db_2(ghdh2, dhd2, jk2);
        }
        if (this.tzq_2.alh()) {
            this.dqz_3(ghdh2, class_16572, dhd2);
        }
    }

    private void dhlsh(ghdh_3 ghdh2, dhd_5 dhd2, jk jk2) {
        float f;
        float f2;
        float f3;
        float f4;
        int n;
        float f5 = dhd2.shml;
        float f6 = dhd2.shs_5;
        float f7 = dhd2.tld_2;
        float f8 = dhd2.thdk_2;
        float f9 = f7 - f5;
        float f10 = f8 - f6;
        if (f9 <= 0.0f || f10 <= 0.0f) {
            return;
        }
        this.ghaa_2(ghdh2, f5, f6, f7, f8, jk2);
        float f11 = Math.max(0.5f, this.shw_4.thw_5());
        float f12 = Math.min(f9, f10) * 0.25f;
        byq byq2 = new byq(0.0f, 0.0f, 0.0f, 255.0f);
        if (this.zghkh.shzl()) {
            for (n = 0; n < 4; ++n) {
                f4 = (n & 1) == 0 ? f5 : f7;
                f3 = (n & 2) == 0 ? f6 : f8;
                f2 = (n & 1) == 0 ? 1.0f : -1.0f;
                f = (n & 2) == 0 ? 1.0f : -1.0f;
                this.stht_4(ghdh2, f4, f3, f2 * f12, 0.0f, f11, true, byq2);
                this.stht_4(ghdh2, f4, f3, 0.0f, f * f12, f11, true, byq2);
            }
        }
        for (n = 0; n < 4; ++n) {
            f4 = (n & 1) == 0 ? f5 : f7;
            f3 = (n & 2) == 0 ? f6 : f8;
            f2 = (n & 1) == 0 ? 1.0f : -1.0f;
            f = (n & 2) == 0 ? 1.0f : -1.0f;
            byq byq3 = (n & 1) == 0 ? jk2.dhthkh : jk2.sdd_4;
            this.stht_4(ghdh2, f4, f3, f2 * f12, 0.0f, f11, false, byq3);
            this.stht_4(ghdh2, f4, f3, 0.0f, f * f12, f11, false, byq3);
        }
    }

    private void db_2(ghdh_3 ghdh2, dhd_5 dhd2, jk jk2) {
        float f;
        float f2;
        float f3;
        float f4;
        int n;
        float f5 = dhd2.shml;
        float f6 = dhd2.shs_5;
        float f7 = dhd2.tld_2;
        float f8 = dhd2.thdk_2;
        float f9 = f7 - f5;
        float f10 = f8 - f6;
        if (f9 <= 0.0f || f10 <= 0.0f) {
            return;
        }
        this.ghaa_2(ghdh2, f5, f6, f7, f8, jk2);
        float f11 = Math.max(0.5f, this.shw_4.thw_5());
        float f12 = Math.min(f9, f10) * 0.5f;
        byq byq2 = new byq(0.0f, 0.0f, 0.0f, 255.0f);
        if (this.zghkh.shzl()) {
            for (n = 0; n < 4; ++n) {
                f4 = (n & 1) == 0 ? f5 : f7;
                f3 = (n & 2) == 0 ? f6 : f8;
                f2 = (n & 1) == 0 ? 1.0f : -1.0f;
                f = (n & 2) == 0 ? 1.0f : -1.0f;
                this.stht_4(ghdh2, f4, f3, f2 * f12, 0.0f, f11, true, byq2);
                this.stht_4(ghdh2, f4, f3, 0.0f, f * f12, f11, true, byq2);
            }
        }
        for (n = 0; n < 4; ++n) {
            f4 = (n & 1) == 0 ? f5 : f7;
            f3 = (n & 2) == 0 ? f6 : f8;
            f2 = (n & 1) == 0 ? 1.0f : -1.0f;
            f = (n & 2) == 0 ? 1.0f : -1.0f;
            byq byq3 = (n & 1) == 0 ? jk2.dhthkh : jk2.sdd_4;
            this.stht_4(ghdh2, f4, f3, f2 * f12, 0.0f, f11, false, byq3);
            this.stht_4(ghdh2, f4, f3, 0.0f, f * f12, f11, false, byq3);
        }
    }

    private void stht_4(ghdh_3 ghdh2, float f, float f2, float f3, float f4, float f5, boolean bl, byq byq2) {
        float f6;
        float f7 = Math.min(f, f + f3) - (f3 == 0.0f ? 0.25f : 0.0f);
        float f8 = Math.min(f2, f2 + f4) - (f4 == 0.0f ? 0.25f : 0.0f);
        float f9 = f3 == 0.0f ? f5 : Math.abs(f3);
        float f10 = f6 = f4 == 0.0f ? f5 : Math.abs(f4);
        if (bl) {
            this.thshw(ghdh2, f7 - f5, f8 - f5, f9 + 1.0f, f6 + 1.0f, byq2);
        } else {
            this.thshw(ghdh2, f7, f8, f9, f6, byq2);
        }
    }

    private void ghaa_2(ghdh_3 ghdh2, float f, float f2, float f3, float f4, jk jk2) {
        float f5 = this.saq_2.thw_5();
        if (f5 <= 0.0f) {
            return;
        }
        float f6 = this.shw_4.thw_5();
        float f7 = Math.max(0.0f, f3 - f - f6);
        float f8 = Math.max(0.0f, f4 - f2 - f6);
        if (f7 <= 0.0f || f8 <= 0.0f) {
            return;
        }
        this.dhnth(ghdh2, f + f6 * 0.5f, f2 + f6 * 0.5f, f7, f8, jk2.dhthkh.tkhl_2(f5), jk2.sdd_4.tkhl_2(f5), jk2.sdd_4.tkhl_2(f5), jk2.dhthkh.tkhl_2(f5));
    }

    private void shdhgh(ghdh_3 ghdh2, String string, dhd_5 dhd2, byq byq2) {
        float f = 5.8f;
        float f2 = bmn.sdha_2.dzh_3(string, f);
        float f3 = dhd2.centerX() - f2 * 0.5f;
        float f4 = dhd2.shs_5 - 9.5f;
        this.thshw(ghdh2, f3 - 3.0f, f4 - 2.0f, f2 + 6.0f, 8.5f, new byq(15.0f, 15.0f, 15.0f, 145.0f));
        tbh.thal_2(bmn.sdha_2, string, f, byq2.rk(), ghdh2.method_51448().method_23760().method_23761(), f3, f4, 0.0f);
    }

    private void dqz_3(ghdh_3 ghdh2, class_1657 class_16572, dhd_5 dhd2) {
        float f = Math.max(0.5f, this.sdh_6.thw_5() * 0.5f);
        float f2 = dhd2.thdk_2 - dhd2.shs_5;
        if (f2 <= 0.0f) {
            return;
        }
        float f3 = dhd2.shml - 2.0f - f;
        float f4 = class_3532.method_15363((float)(class_16572.method_6032() / Math.max(1.0f, class_16572.method_6063())), (float)0.0f, (float)1.0f);
        byq byq2 = new byq(0.0f, 0.0f, 0.0f, 255.0f);
        byq byq3 = new byq(255.0f, 0.0f, 0.0f, 255.0f);
        byq byq4 = new byq(0.0f, 255.0f, 0.0f, 255.0f);
        byq byq5 = byq3.dkhw_2(byq4, f4);
        this.thshw(ghdh2, f3 - f, dhd2.shs_5 - f, 1.5f + (f - 0.5f), f2 + 1.5f, byq2);
        this.thshw(ghdh2, f3, dhd2.shs_5 + f2 * (1.0f - f4), f, f2 * f4 + f, byq5);
        if (class_16572.method_6067() > 0.0f) {
            float f5 = class_3532.method_15363((float)(class_16572.method_6067() / Math.max(1.0f, class_16572.method_6063())), (float)0.0f, (float)0.4f);
            float f6 = f2 * f5;
            this.thshw(ghdh2, f3, Math.max(dhd2.shs_5, dhd2.shs_5 + f2 * (1.0f - f4) - f6), f, Math.min(f6, f2), new byq(255.0f, 215.0f, 0.0f, 255.0f));
        }
    }

    private String jya_2(class_1542 class_15422) {
        int n = -1460312701;
        n = Integer.rotateLeft(n * -332381033, 16) ^ 0x9451FB1E;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 17);
        class_1542 class_15423 = class_15422;
        n = (class_15423 != null ? System.identityHashCode(class_15423) : 0) ^ n;
        int n2 = n ^ 0x7638BB49;
        if ((n2 ^ n) != 1983429449) {
            int cfr_ignored_0 = (0xDECDDECA ^ n) + -765314060;
        }
        Object object = bghb.tkhq(class_15422).method_7964().getString();
        if (bghb.khkhf(class_15422.method_6983()) > 1) {
            object = (String)object + " x" + bghb.hfz(class_15422).method_7947();
        }
        return object;
    }

    private dhd_5 jnq(class_1297 class_12972, float f) {
        int n = tthgh.rzh(1214366707);
        class_1297 class_12973 = class_12972;
        n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 25);
        int n2 = n ^ 0x2326E3AE;
        if ((n2 ^ n) != 589751214) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x6B47205D ^ n, 16) - 33196670) * 1799823453;
            int cfr_ignored_1 = (int)(0xA9F58E6027D4EB4FL ^ (long)n ^ 0xE1B0831A2DB8FE3AL);
        }
        double d = bghb.shr_4(f, class_12972.field_6014, class_12972.method_23317());
        double d2 = class_3532.method_16436((double)f, (double)class_12972.field_6036, (double)class_12972.method_23318());
        double d3 = class_3532.method_16436((double)f, (double)class_12972.field_5969, (double)class_12972.method_23321());
        class_238 class_2383 = bghb.dtf_4(class_12972).method_989(d - class_12972.method_23317(), d2 - bghb.dhbj(class_12972), d3 - bghb.jay(class_12972));
        float f2 = bghb.thrm(1826016748 - -313078291);
        float f3 = Float.intBitsToFloat(-2085640394 + -70231863);
        float f4 = Float.intBitsToFloat(bghb.szd_5(-1598043779) ^ 0x41EC02FA);
        float f5 = Float.intBitsToFloat(Integer.rotateLeft(0xD2DAF51A ^ 0x2D250AE1, 21));
        boolean bl = false;
        for (int i = 0; i < Integer.rotateLeft(0xD0400F63 ^ 0xD0480F63, 16); ++i) {
            double d4 = (i & 1) == 0 ? class_2383.field_1323 : class_2383.field_1320;
            double d5 = (i & 2) == 0 ? class_2383.field_1322 : class_2383.field_1325;
            double d6 = (i & 4) == 0 ? class_2383.field_1321 : class_2383.field_1324;
            Vector2f vector2f = bghb.azs_2(d4, d5, d6);
            if (vector2f.x == Float.intBitsToFloat(Integer.reverse(-1338737069) ^ 0xB501D3F2) || vector2f.y == bghb.adhsh(Integer.reverse(939413890) ^ 0x3EF58013)) continue;
            bl = true;
            f2 = Math.min(f2, vector2f.x);
            f3 = Math.min(f3, vector2f.y);
            f4 = Math.max(f4, vector2f.x);
            f5 = Math.max(f5, vector2f.y);
        }
        return bl ? new dhd_5(f2, f3, f4, f5) : null;
    }

    private void dka(class_4587 class_45872, class_1657 class_16572, float f, byq byq2) {
        class_243 class_2432 = new class_243(class_3532.method_16436((double)f, (double)class_16572.field_6014, (double)class_16572.method_23317()), class_3532.method_16436((double)f, (double)class_16572.field_6036, (double)class_16572.method_23318()), class_3532.method_16436((double)f, (double)class_16572.field_5969, (double)class_16572.method_23321()));
        float f2 = this.dhsz_2.thw_5();
        if (f2 <= 0.0f) {
            return;
        }
        float f3 = class_16572.field_42108.method_48572(f);
        float f4 = class_16572.field_42108.method_48570(f);
        float f5 = class_3532.method_17821((float)f, (float)class_16572.field_6220, (float)class_16572.field_6283);
        float f6 = (float)Math.toRadians(-f5 + 90.0f);
        boolean bl = class_16572.method_5681() || class_16572.method_6128();
        float f7 = class_16572.method_5715() ? 0.2f : 0.0f;
        float f8 = bl ? 0.6f : 0.0f;
        class_243 class_2433 = class_2432.method_1031(0.0, (double)(1.62f - f7 - f8), 0.0);
        class_243 class_2434 = class_2432.method_1031(0.0, (double)(1.4f - f7 - f8), 0.0);
        class_243 class_2435 = class_2432.method_1031(0.0, (double)(0.9f - f7 - f8), 0.0);
        class_243 class_2436 = class_2432.method_1031(0.0, (double)(0.6f - f7 - f8), 0.0);
        this.dzd(class_45872, class_2433, class_2434, byq2, f2);
        this.dzd(class_45872, class_2434, class_2435, byq2, f2);
        this.dzd(class_45872, class_2435, class_2436, byq2, f2);
        float f9 = class_3532.method_15362((float)(f3 * 0.6662f)) * f4 * 0.5f;
        float f10 = class_3532.method_15362((float)(f3 * 0.6662f + (float)Math.PI)) * f4 * 0.5f;
        float f11 = class_3532.method_15362((float)(f3 * 0.6662f + (float)Math.PI)) * f4 * 0.7f;
        float f12 = class_3532.method_15362((float)(f3 * 0.6662f)) * f4 * 0.7f;
        class_243 class_2437 = class_2434.method_1031(Math.sin(f6) * 0.3, -0.1, Math.cos(f6) * 0.3);
        class_243 class_2438 = class_2437.method_1031(Math.sin(f6) * 0.05 + Math.sin((double)f6 + 1.5707963267948966) * (double)f9 * 0.15, -0.25 - (double)Math.abs(f9) * 0.1, Math.cos(f6) * 0.05 + Math.cos((double)f6 + 1.5707963267948966) * (double)f9 * 0.15);
        class_243 class_2439 = class_2438.method_1031(Math.sin((double)f6 + 1.5707963267948966) * (double)f9 * 0.1, -0.25 - (double)Math.abs(f9) * 0.05, Math.cos((double)f6 + 1.5707963267948966) * (double)f9 * 0.1);
        class_243 class_24310 = class_2434.method_1031(-Math.sin(f6) * 0.3, -0.1, -Math.cos(f6) * 0.3);
        class_243 class_24311 = class_24310.method_1031(-Math.sin(f6) * 0.05 + Math.sin((double)f6 + 1.5707963267948966) * (double)f10 * 0.15, -0.25 - (double)Math.abs(f10) * 0.1, -Math.cos(f6) * 0.05 + Math.cos((double)f6 + 1.5707963267948966) * (double)f10 * 0.15);
        class_243 class_24312 = class_24311.method_1031(Math.sin((double)f6 + 1.5707963267948966) * (double)f10 * 0.1, -0.25 - (double)Math.abs(f10) * 0.05, Math.cos((double)f6 + 1.5707963267948966) * (double)f10 * 0.1);
        class_243 class_24313 = class_2436.method_1031(Math.sin(f6) * 0.15, 0.0, Math.cos(f6) * 0.15);
        class_243 class_24314 = class_24313.method_1031(Math.sin((double)f6 + 1.5707963267948966) * (double)f11 * 0.1, -0.35 + (double)Math.max(0.0f, f11) * 0.05, Math.cos((double)f6 + 1.5707963267948966) * (double)f11 * 0.1);
        class_243 class_24315 = class_24314.method_1031(Math.sin((double)f6 + 1.5707963267948966) * (double)f11 * 0.08, -0.35 - (double)Math.max(0.0f, -f11) * 0.05, Math.cos((double)f6 + 1.5707963267948966) * (double)f11 * 0.08);
        class_243 class_24316 = class_2436.method_1031(-Math.sin(f6) * 0.15, 0.0, -Math.cos(f6) * 0.15);
        class_243 class_24317 = class_24316.method_1031(Math.sin((double)f6 + 1.5707963267948966) * (double)f12 * 0.1, -0.35 + (double)Math.max(0.0f, f12) * 0.05, Math.cos((double)f6 + 1.5707963267948966) * (double)f12 * 0.1);
        class_243 class_24318 = class_24317.method_1031(Math.sin((double)f6 + 1.5707963267948966) * (double)f12 * 0.08, -0.35 - (double)Math.max(0.0f, -f12) * 0.05, Math.cos((double)f6 + 1.5707963267948966) * (double)f12 * 0.08);
        this.dzd(class_45872, class_2437, class_2438, byq2, f2);
        this.dzd(class_45872, class_2438, class_2439, byq2, f2);
        this.dzd(class_45872, class_24310, class_24311, byq2, f2);
        this.dzd(class_45872, class_24311, class_24312, byq2, f2);
        this.dzd(class_45872, class_24313, class_24314, byq2, f2);
        this.dzd(class_45872, class_24314, class_24315, byq2, f2);
        this.dzd(class_45872, class_24316, class_24317, byq2, f2);
        this.dzd(class_45872, class_24317, class_24318, byq2, f2);
        this.dzd(class_45872, class_2437, class_24310, byq2, f2);
        this.dzd(class_45872, class_24313, class_24316, byq2, f2);
    }

    private void tts_4(class_4587 class_45872, class_1657 class_16572, float f, byq byq2) {
        class_243 class_2432 = new class_243(class_3532.method_16436((double)f, (double)class_16572.field_6014, (double)class_16572.method_23317()), class_3532.method_16436((double)f, (double)class_16572.field_6036, (double)class_16572.method_23318()) + (double)class_16572.method_18381(class_16572.method_18376()), class_3532.method_16436((double)f, (double)class_16572.field_5969, (double)class_16572.method_23321()));
        class_243 class_2433 = class_16572.method_5828(f).method_1021(0.85);
        this.dzd(class_45872, class_2432, class_2432.method_1019(class_2433), byq2, Math.max(1.0f, this.dhsz_2.thw_5() - 0.8f));
    }

    private void dzd(class_4587 class_45872, class_243 class_2432, class_243 class_2433, byq byq2, float f) {
        class_243 class_2434 = bghb.mc.field_1773.method_19418().method_19326();
        class_243 class_2435 = class_2432.method_1020(class_2434);
        class_243 class_2436 = class_2433.method_1020(class_2434);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader((class_10156)class_10142.field_53864);
        RenderSystem.lineWidth((float)f);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27377, class_290.field_29337);
        tth_8.zbdh_2(class_45872, class_2872, class_2435, class_2436, byq2);
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.lineWidth((float)1.0f);
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private void thshw(ghdh_3 ghdh2, float f, float f2, float f3, float f4, byq byq2) {
        ghdh2.drawRect(f, f2, f3, f4, byq2);
    }

    private void dhnth(ghdh_3 ghdh2, float f, float f2, float f3, float f4, byq byq2, byq byq3, byq byq4, byq byq5) {
        bdht.sbd_3(ghdh2.method_51448(), f, f2, f3, f4, zth_8.tjs, bkha_2.thtl_2(byq2, byq3, byq4, byq5));
    }

    private jk dhhd_2(class_1297 class_12972) {
        Object object;
        try {
            int n = -1750193989;
            n = Integer.rotateLeft(n * 52199811, 6) ^ 0x275C053D;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 3);
            int n2 = n ^ 0x9ED19C2B;
            if ((n2 ^ n) != -1630430165) {
                int cfr_ignored_0 = (0x97FB490 ^ n) - -747387919;
            }
            if ((0x287 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (class_12972 instanceof class_1657) {
            object = (class_1657)class_12972;
            if (bghb.dkhb(Moondlc.getInstance()).adhj(bghb.shaz_3(object).getString())) {
                byq byq2 = this.khghsh(bghb.dta_8(this.tdy), class_12972);
                return new jk(byq2, byq2.dkhw_2(byq.brz_2, Float.intBitsToFloat(1109108341 - 69592038)));
            }
        }
        if (this.thyd_2.shghkh()) {
            object = bhj_2.ths();
            return new jk((byq)object, object.dkhw_2(byq.dhww, Float.intBitsToFloat(Integer.rotateLeft(0x94DF6D ^ 0x34E8EC5E, 7))));
        }
        if (this.dhdl_2.shghkh()) {
            object = this.khghsh(this.rsha_2(class_12972, 0.0f), class_12972);
            byq byq3 = this.khghsh(bghb.sjy(this, class_12972, Float.intBitsToFloat(-1653107762 + -1592276901)), class_12972);
            return new jk((byq)object, byq3);
        }
        object = this.khghsh(this.hthh.sdsh_4(), class_12972);
        return new jk((byq)object, bghb.hdhw((byq)object, byq.brz_2, Float.intBitsToFloat(-416566628 + 1445009969)));
    }

    private byq khghsh(byq byq2, class_1297 class_12972) {
        int n = tthgh.rzh(-926932017);
        n = System.identityHashCode(this) ^ n;
        byq byq3 = byq2;
        n = (byq3 != null ? System.identityHashCode(byq3) : 0) ^ n;
        int n2 = n ^ 0x2E7E5BB6;
        if ((n2 ^ n) != 780032950) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xE6BE7879 ^ n, 15) + -177326622) * -423724935;
            int cfr_ignored_1 = (int)(0x240CD64427D4EB4FL ^ (long)n ^ 0x51F8831A2DB9E5C8L);
        }
        if (class_12972 instanceof class_1309) {
            class_1309 class_13092 = (class_1309)class_12972;
            if (class_13092.field_6235 > 0) {
                float f = bghb.tkf((float)class_13092.field_6235 / Float.intBitsToFloat(1823649944 - 733130904), 0.0f, 1.0f);
                return byq.rghk(bghb.jtkh_2("啿⤺ⴺⅩ╬㥩㵬", 0xAC0BC594 ^ 0x1860B839, 1034665146 + 899881082, bghb.jmh_2(-1094897058) ^ 0xF6CCE5DD)).tkhl_2(byq2.tzdh_2()).dkhw_2(byq2, f);
            }
        }
        return byq2;
    }

    private byq rsha_2(class_1297 class_12972, float f) {
        double d = 0.0;
        double d2 = 0.0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        byq byq2 = null;
        int n = 0;
        int n2 = 1957587692;
        n2 = Integer.rotateLeft(n2 * -59529443, 20) ^ 0x7BF093FF;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 28);
        class_1297 class_12973 = class_12972;
        n2 = Integer.rotateLeft((class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n2, 13);
        int n3 = 770603469 + n2;
        while (true) {
            block22: {
                block24: {
                    block33: {
                        block26: {
                            block34: {
                                block36: {
                                    block29: {
                                        block25: {
                                            block27: {
                                                block21: {
                                                    block20: {
                                                        block19: {
                                                            block31: {
                                                                block30: {
                                                                    block35: {
                                                                        block32: {
                                                                            block28: {
                                                                                block17: {
                                                                                    block23: {
                                                                                        block18: {
                                                                                            if ((n = n3 - n2) > 45167918) break block17;
                                                                                            if (n > -1371893390) break block18;
                                                                                            if (n == -1983434247) break block19;
                                                                                            if (n == -1567922531) break block20;
                                                                                            if (n == -1371893390) break block21;
                                                                                            break block22;
                                                                                        }
                                                                                        if (n > -614375621) break block23;
                                                                                        if (n == -1277949520) break block24;
                                                                                        if (n == -614375621) break block25;
                                                                                        int cfr_ignored_0 = Integer.rotateLeft(0xEAD29A0D ^ n2, 16) - 1943946958;
                                                                                        int cfr_ignored_1 = (int)(0x2860343027D4EB4FL ^ (long)n2 ^ 0x9510831A2DB9FD11L);
                                                                                        break block22;
                                                                                    }
                                                                                    if (n == -119671665) break block26;
                                                                                    if (n == 45167918) break block27;
                                                                                    break block22;
                                                                                }
                                                                                if (n > 770603469) break block28;
                                                                                if (n == 330050567) break block29;
                                                                                if (n == 542838477) break block30;
                                                                                int cfr_ignored_2 = (Integer.rotateRight(0x776CCBDA ^ n2, 17) + 2055884449) * 2003618779;
                                                                                if (n == 770603469) break block31;
                                                                                break block22;
                                                                            }
                                                                            if (n > 1252746131) break block32;
                                                                            if (n == 802129850) break block33;
                                                                            if (n == 1252746131) break block34;
                                                                            int cfr_ignored_3 = Integer.rotateRight(0x4C611EE ^ n2, 3) - -1738945779;
                                                                            break block22;
                                                                        }
                                                                        if (n == 1372697252) break block35;
                                                                        if (n == 2139244860) break block36;
                                                                        break block22;
                                                                    }
                                                                    int cfr_ignored_4 = Integer.rotateRight(0xE620FBAF ^ n2, 15) - -497280660;
                                                                    d = (double)this.tjl.thw_5() * Double.longBitsToDouble(0x2257F0D9C9BD33F5L ^ 0x1DE9488822382D4DL);
                                                                    d2 = (double)bghb.zrl() / Double.longBitsToDouble(0xDA8C242F9886B330L ^ 0x9A03642F9886B330L) * d + (double)class_12972.method_5628() * Double.longBitsToDouble(0x7AD34C6E4F4D6B80L ^ 0x45168EE113659E43L) + (double)f;
                                                                    f2 = (float)((Math.sin(d2 * bghb.jsth_2(0x4EBC05FC5C3FA1CL ^ 0x44E2E1A49187D704L) * Double.longBitsToDouble(0x3C4F0DCBAD27D0EEL ^ 0x7C4F0DCBAD27D0EEL)) + 1.0) * bghb.asth_2(0x228733EFA9CB8FACL ^ 0x1D6733EFA9CB8FACL));
                                                                    f3 = f2 * f2 * (Float.intBitsToFloat(-177428268 + 1255364396) - 2.0f * f2);
                                                                    byq2 = this.hthh.sdsh_4().dkhw_2(this.dhhf.sdsh_4(), f3);
                                                                    int cfr_ignored_5 = (int)(0x3B18597107956C6CL ^ (long)n2 ^ 0x4F92C39923FFDBE1L);
                                                                    n3 = (int)((long)(1232978219 + n2) ^ 0xD64D408792418BF8L ^ 0xD64D408792418BF8L);
                                                                    int cfr_ignored_6 = (int)(0x49DED23FC2079106L ^ (long)n2 ^ 0x590F48BCD92B3E6CL);
                                                                    n3 = (int)((long)(-1277949520 + n2) ^ 0x77A99AEAFFFE9E58L ^ 0x77A99AEAFFFE9E58L);
                                                                    continue;
                                                                }
                                                                int cfr_ignored_7 = (Integer.rotateLeft(0x6A1BC5F1 ^ n2, 16) + -574974102) * 1780205041;
                                                                int cfr_ignored_8 = (int)(0xA8A96BCC27D4EB4FL ^ (long)n2 ^ 0x2AE8831A2DB8FC83L);
                                                                yf.athz_2();
                                                                n3 = 1372697252 + n2 ^ 0xD35C0F64 ^ 0xD35C0F64;
                                                                continue;
                                                            }
                                                            int cfr_ignored_9 = (Integer.rotateLeft(0x46C1C7D8 ^ n2, 11) + -1781214621) * 1187104729;
                                                            if (yf.khdha_2()) {
                                                                int cfr_ignored_10 = (int)(0xE9718E72E473ED7CL ^ (long)n2 ^ 0xE195045421DE7F32L);
                                                                n3 = 1372697252 + n2 ^ 0xD48EFB98 ^ 0xD48EFB98;
                                                                --n;
                                                                continue;
                                                            }
                                                            int cfr_ignored_11 = (int)(0xA430B90166AA6C1CL ^ (long)n2 ^ 0x8F7201E7231EE5B0L);
                                                            n3 = 542838477 + n2;
                                                            n -= 2;
                                                            continue;
                                                        }
                                                        int cfr_ignored_12 = Integer.rotateLeft(0xF57115E1 ^ n2, 17) + -1123072646;
                                                        int cfr_ignored_13 = (int)(0x37C3BBDC27D4EB4FL ^ (long)n2 ^ 0x8AC8831A2DB9C256L);
                                                        n3 = (int)((long)(-537887309 + n2) ^ 0x627E868515050522L ^ 0x627E868515050522L);
                                                        int cfr_ignored_14 = Integer.rotateLeft(0x5503BF48 ^ n2, 13) + 1339148531;
                                                        try {
                                                            n -= 2;
                                                            if ((0x4B00414EFEAA9D1DL ^ (long)n2 | 1L) == 0L) {
                                                                throw new IllegalStateException();
                                                            }
                                                            n3 = 770603469 + n2;
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            n3 = 770603469 + n2 + -1058514738 - -1058514738;
                                                        }
                                                        continue;
                                                    }
                                                    int cfr_ignored_15 = (Integer.rotateRight(0xE678063A ^ n2, 15) + -320446399) * -428341701;
                                                    n3 = Integer.reverse(Integer.reverse(-1806847659 + n2));
                                                    int cfr_ignored_16 = Integer.rotateRight(0x7B7546C2 ^ n2, 18) + -141479751;
                                                    try {
                                                        n += 3;
                                                        n3 = 770603469 + n2 ^ 0x278A0581 ^ 0x278A0581;
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        n3 = 770603469 + n2;
                                                    }
                                                    n -= 3;
                                                    continue;
                                                }
                                                int cfr_ignored_17 = (Integer.rotateLeft(0xC2BD75B1 ^ n2, 11) + -1722884182) * -1027770959;
                                                int cfr_ignored_18 = (int)(0xFDB8C27D4EB4FL ^ (long)n2 ^ 0x4A68831A2DB9ADCEL);
                                                n3 = (int)((long)(788661276 + n2) ^ 0x494354DC1CF99A57L ^ 0x494354DC1CF99A57L);
                                                int cfr_ignored_19 = (Integer.rotateLeft(0x3F749054 ^ n2, 10) - -1283778201) * 1064603733;
                                                try {
                                                    n3 = Integer.reverse(Integer.reverse(770603469 + n2));
                                                }
                                                catch (ArithmeticException arithmeticException) {
                                                    n3 = 770603469 + n2 ^ 0x2B6A7D62 ^ 0x2B6A7D62;
                                                }
                                                n += 4;
                                                continue;
                                            }
                                            int cfr_ignored_20 = Integer.rotateRight(0xC754E8E7 ^ n2, 11) - 665178932;
                                            n3 = -1972690356 + n2 + 1293886197 - 1293886197;
                                            int cfr_ignored_21 = (Integer.rotateLeft(0xF983D89C ^ n2, 18) - 995416607) * -108799843;
                                            n3 = 770603469 + n2;
                                            continue;
                                        }
                                        int cfr_ignored_22 = Integer.rotateRight(0xF623E5CB ^ n2, 17) + -759794992;
                                        n3 = 1625876188 + n2 ^ 0x5D7C113A ^ 0x5D7C113A;
                                        int cfr_ignored_23 = Integer.rotateLeft(0x5F579D29 ^ n2, 14) + -1879464142;
                                        int cfr_ignored_24 = (int)(0x9DE5331427D4EB4FL ^ (long)n2 ^ 0x9B58831A2DB8961BL);
                                        try {
                                            if ((0x353BE4621212B96BL ^ (long)n2 | 1L) == 0L) {
                                                throw new UnsupportedOperationException();
                                            }
                                            n3 = 770603469 + n2 ^ 0xA2F7434 ^ 0xA2F7434;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            n3 = (int)((long)(770603469 + n2) ^ 0x2986C362711960BEL ^ 0x2986C362711960BEL);
                                        }
                                        ++n;
                                        continue;
                                    }
                                    int cfr_ignored_25 = Integer.rotateLeft(0x9AB1FECC ^ n2, 6) - -1075086865;
                                    n3 = Integer.reverse(Integer.reverse(770603469 + n2));
                                    n -= 3;
                                    continue;
                                }
                                int cfr_ignored_26 = Integer.rotateLeft(0x36B9EC09 ^ n2, 9) + -1528744878;
                                int cfr_ignored_27 = (int)(0xF40B423427D4EB4FL ^ (long)n2 ^ 0x7918831A2DB845C7L);
                                n3 = -378419555 + n2;
                                int cfr_ignored_28 = Integer.rotateLeft(0x63D82D45 ^ n2, 15) - 462101142;
                                int cfr_ignored_29 = (int)(0xA16A837827D4EB4FL ^ (long)n2 ^ 0xFB80831A2DB8EF04L);
                                try {
                                    ++n;
                                    if ((0x527D29DCB49B59BBL ^ (long)n2 | 1L) == 0L) {
                                        throw new UnsupportedOperationException();
                                    }
                                    n3 = 770603469 + n2 ^ 0x6BAD023C ^ 0x6BAD023C;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    n3 = 770603469 + n2;
                                }
                                n += 5;
                                continue;
                            }
                            int cfr_ignored_30 = Integer.rotateLeft(0x17BE35E0 ^ n2, 5) + -463067813;
                            try {
                                n -= 2;
                                n3 = 770603469 + n2 ^ 0x8F646F4B ^ 0x8F646F4B;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                n3 = 770603469 + n2 + -2120018806 - -2120018806;
                            }
                            continue;
                        }
                        int cfr_ignored_31 = (Integer.rotateLeft(0xBD0294D1 ^ n2, 10) + -408050550) * -1123904303;
                        int cfr_ignored_32 = (int)(0x7FB03AEC27D4EB4FL ^ (long)n2 ^ 0x88A8831A2DB952B1L);
                        n3 = Integer.reverse(Integer.reverse(-613503087 + n2));
                        int cfr_ignored_33 = (Integer.rotateLeft(0x597AA7FC ^ n2, 14) - -633866561) * 1501210621;
                        n3 = Integer.reverse(Integer.reverse(770603469 + n2));
                        n += 5;
                        continue;
                    }
                    int cfr_ignored_34 = Integer.rotateRight(0x3576BE6E ^ n2, 9) - 2109648525;
                    int cfr_ignored_35 = (int)(0x5778297C7685DB89L ^ (long)n2 ^ 0xAF8821B84C350321L);
                    n3 = 1761001051 + n2;
                    int cfr_ignored_36 = (int)(0x424247E770120BABL ^ (long)n2 ^ 0x72BE2C97EC712955L);
                    n3 = 770603469 + n2 + 104082063 - 104082063;
                    n += 2;
                    continue;
                }
                return byq2;
            }
            int cfr_ignored_37 = Integer.rotateLeft(0x148CBDA4 ^ n2, 5) - -2123852265;
            n3 = (int)((long)(770603469 + n2) ^ 0x2A6CD9A048C44979L ^ 0x2A6CD9A048C44979L);
        }
    }

    private boolean rkh_2() {
        int n = -778374570;
        n = Integer.rotateLeft(n * 845045433, 14) ^ 0xD6F0B332;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 17);
        int n2 = n ^ 0xD902E66E;
        if ((n2 ^ n) != -654121362) {
            int cfr_ignored_0 = (0x8981438 ^ n) - 1211865410;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return bghb.ztb(this.haa_2) && (bghb.jkhm(this.bzk_2) || bghb.zah_7(this.tmsh));
    }

    private boolean ththdh() {
        int n = tthgh.rzh(270322187);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 20);
        int n2 = n ^ 0x7494582F;
        if ((n2 ^ n) != 1955878959) {
            int cfr_ignored_0 = Integer.rotateLeft(0x64889224 ^ n, 15) - 820466071;
        }
        return bghb.swn_2(this.haa_2) && bghb.jst_4(this.thghdh);
    }

    private boolean twk_2() {
        int n;
        block4: {
            try {
                int n2 = -87625424;
                n2 = Integer.rotateLeft(n2 * -1668302339, 20) ^ 0x69025B8C;
                n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 21);
                int n3 = n2 ^ 0xA5F771B;
                if ((n3 ^ n2) != 174028571) {
                    int cfr_ignored_0 = (0xF099862B ^ n2) + 317396196;
                }
                if ((0x2DE & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = this.haa_2.alh() && this.tbd.alh() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block4;
            n = n ^ 0x5C17;
        }
        return n != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void zkth_2(bbgh bbgh2) {
        int n = 2111937945;
        n = Integer.rotateLeft(n * -1237531055, 24) ^ 0x19516014;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xEF8738;
        if ((n2 ^ n) != 15697720) {
            int cfr_ignored_0 = (0x7D0E1AA1 ^ n) - -1599708558;
        }
        if (bghb.mc.field_1724 == null || bghb.mc.field_1687 == null || bghb.mc.field_1690.field_1842) {
            return;
        }
        bthw.tnj_2();
        try {
            for (class_1297 class_12972 : bghb.mc.field_1687.method_18112()) {
                dhd_5 dhd2;
                if (!this.snm_2(class_12972) || (dhd2 = this.jnq(class_12972, bbgh2.bhw())) == null) continue;
                if (class_12972 instanceof class_1657) {
                    class_1657 class_16572 = (class_1657)class_12972;
                    this.ghkhf(bbgh2.dtn(), class_16572, dhd2);
                    continue;
                }
                if (class_12972 instanceof class_1542) {
                    class_1542 class_15422 = (class_1542)class_12972;
                    if (this.shtt.alh() && this.rzw_2.alh()) {
                        this.shdhgh(bbgh2.dtn(), this.jya_2(class_15422), dhd2, this.khghsh(this.thhs.sdsh_4(), (class_1297)class_15422));
                        continue;
                    }
                }
                if (!(class_12972 instanceof class_1541) || !this.bhdh.alh() || !this.ddf_2.alh()) continue;
                this.shdhgh(bbgh2.dtn(), "TNT", dhd2, this.khghsh(this.sbw.sdsh_4(), class_12972));
            }
        }
        finally {
            bthw.dwy();
        }
    }

    private void byh_2(shw_3 shw2) {
        int n = -1486608124;
        n = Integer.rotateLeft(n * 2023363081, 16) ^ 0xCE907089;
        shw_3 shw3 = shw2;
        n = Integer.rotateRight((shw3 != null ? System.identityHashCode(shw3) : 0) ^ n, 9);
        int n2 = n ^ 0x71A2731E;
        if ((n2 ^ n) != 1906471710) {
            int cfr_ignored_0 = (0xD6C65A1A ^ n) + -1655808694;
        }
        if (bghb.mc.field_1724 == null || bghb.mc.field_1687 == null || !this.haa_2.alh()) {
            return;
        }
        for (class_1297 class_12972 : bghb.mc.field_1687.method_18112()) {
            if (!(class_12972 instanceof class_1657)) continue;
            class_1657 class_16572 = (class_1657)class_12972;
            if (!this.snm_2(class_12972)) continue;
            jk jk2 = this.dhhd_2((class_1297)class_16572);
            if (this.thghdh.alh()) {
                this.ddhr(class_16572, jk2, shw2.skz_4(), shw2.ssha_2());
            }
            if (this.tbd.alh()) {
                this.dka(shw2.ssha_2(), class_16572, shw2.skz_4(), jk2.dhthkh);
            }
            if (!this.tsl_2.alh()) continue;
            this.tts_4(shw2.ssha_2(), class_16572, shw2.skz_4(), jk2.sdd_4);
        }
    }

    private boolean bshs() {
        try {
            int n = 640308187;
            n = Integer.rotateLeft(n * -1794630441, 19) ^ 0xB6A10FFB;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xDA9A071C;
            if ((n2 ^ n) != -627439844) {
                int cfr_ignored_0 = (0xFCB054C7 ^ n) - -2075033172;
            }
            if ((0x35C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.haa_2.alh() || !this.dhdl_2.shghkh();
    }

    private boolean tgha() {
        int n = -361618028;
        int n2 = (n = Integer.rotateLeft(n * 984241151, 18) ^ 0xA82E6CC6) ^ 0x70D6305;
        if ((n2 ^ n) != 118317829) {
            int cfr_ignored_0 = (0xED7F4691 ^ n) - 619094001;
        }
        return !this.haa_2.alh() || !this.tzq_2.alh();
    }

    private boolean dhat_3() {
        int n = tthgh.rzh(926782508);
        int n2 = n ^ 0x9D5A000D;
        if ((n2 ^ n) != -1655046131) {
            int cfr_ignored_0 = Integer.rotateLeft(0xAA679421 ^ n, 8) + -1494708422;
            int cfr_ignored_1 = (int)(0x68D53A1C27D4EB4FL ^ (long)n ^ 0x8948831A2DB97C7BL);
        }
        return !this.twk_2();
    }

    private boolean rmz_2() {
        int n = 1836173980;
        int n2 = (n = Integer.rotateLeft(n * -1359645917, 5) ^ 0x322CA16B) ^ 0xBAF21EA8;
        if ((n2 ^ n) != -1158537560) {
            int cfr_ignored_0 = (0xD783D434 ^ n) - -229661707;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return !this.ththdh();
    }

    private boolean tqth_2() {
        int n = -680858667;
        n = Integer.rotateLeft(n * -543615899, 16) ^ 0x9C62801;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 5);
        int n2 = n ^ 0xCBF4DBAC;
        if ((n2 ^ n) != -873145428) {
            int cfr_ignored_0 = (0x1C9E3079 ^ n) - 1303305887;
        }
        return !this.ththdh();
    }

    private boolean zha_6() {
        int n;
        block1: {
            int n2 = tthgh.rzh(990466315);
            n2 = System.identityHashCode(this) ^ n2;
            int n3 = n2 ^ 0x14ECC649;
            if ((n3 ^ n2) != 351061577) {
                int cfr_ignored_0 = Integer.rotateRight(0x2FE59742 ^ n2, 8) + -785715143;
            }
            n = !this.rkh_2() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0xDC0B;
        }
        return n != 0;
    }

    private boolean bdhq() {
        int n = -1911679494;
        n = Integer.rotateLeft(n * -1489468683, 19) ^ 0xCE33298;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
        int n2 = n ^ 0xC31D346;
        if ((n2 ^ n) != 204591942) {
            int cfr_ignored_0 = (0x823FC6BC ^ n) + 1470505031;
        }
        return !this.rkh_2();
    }

    private boolean ddw() {
        int n = -1140888119;
        n = Integer.rotateLeft(n * -1400198203, 18) ^ 0xD79615E7;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x745007A7;
        if ((n2 ^ n) != 1951401895) {
            int cfr_ignored_0 = (0xCFAF6A6E ^ n) + -1900133491;
        }
        return !this.rkh_2();
    }

    private boolean dtq_3() {
        int n = -223980817;
        n = Integer.rotateLeft(n * -50527031, 21) ^ 0x5C90EA9B;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xAAB511D5;
        if ((n2 ^ n) != -1430973995) {
            int cfr_ignored_0 = (0x5813433A ^ n) + -818886548;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return !this.bhdh.alh();
    }

    private boolean zzs_2() {
        int n;
        block1: {
            int n2 = tthgh.rzh(-582187911);
            int n3 = n2 ^ 0xF7C0AA98;
            if ((n3 ^ n2) != -138368360) {
                int cfr_ignored_0 = Integer.rotateLeft(0x2A8C2EE1 ^ n2, 8) + 727141498;
                int cfr_ignored_1 = (int)(0xE83E80DC27D4EB4FL ^ (long)n2 ^ 0xFCC8831A2DB87DACL);
            }
            n = !this.shtt.alh() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x9E0F;
        }
        return n != 0;
    }

    private boolean zzh_5() {
        try {
            int n = -2005577369;
            n = Integer.rotateLeft(n * -196072355, 17) ^ 0x37563574;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x1A774A12;
            if ((n2 ^ n) != 444025362) {
                int cfr_ignored_0 = (0x92021B75 ^ n) + 1652677487;
            }
            if ((0xD9 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.haa_2.alh();
    }

    private boolean thsl_2() {
        try {
            int n = -754989956;
            n = Integer.rotateLeft(n * 970667339, 19) ^ 0xFD7D519D;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x14CA0A12;
            if ((n2 ^ n) != 348785170) {
                int cfr_ignored_0 = (0xC635CE6E ^ n) - 976192298;
            }
            if ((0x355 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.haa_2.alh() || !this.dhdl_2.shghkh();
    }

    private boolean dhyd_2() {
        try {
            int n = -477089906;
            n = Integer.rotateLeft(n * 1749383819, 26) ^ 0x40E7FFEF;
            int n2 = n ^ 0x4C39FB26;
            if ((n2 ^ n) != 1278868262) {
                int cfr_ignored_0 = (0xAFA9D4A8 ^ n) - 1018625509;
            }
            if ((0x1F8 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.haa_2.alh() || this.thyd_2.shghkh();
    }

    private boolean hshs_2() {
        int n = 1727535047;
        n = Integer.rotateLeft(n * -105737677, 11) ^ 0xD97D4555;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x1D7B236F;
        if ((n2 ^ n) != 494609263) {
            int cfr_ignored_0 = (0x7B8334A8 ^ n) + 107413162;
        }
        return !this.haa_2.alh();
    }

    private boolean sza_3() {
        int n = 170675114;
        n = Integer.rotateLeft(n * -86506377, 13) ^ 0x6DB9910D;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 8);
        int n2 = n ^ 0x11D4E31C;
        if ((n2 ^ n) != 299164444) {
            int cfr_ignored_0 = (0x1BF8A8B6 ^ n) + -1470181489;
        }
        return !this.shtt.alh() && !this.bhdh.alh();
    }

    private boolean ajt() {
        int n = tthgh.rzh(-219468312);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x21853C3A;
        if ((n2 ^ n) != 562379834) {
            int cfr_ignored_0 = (Integer.rotateRight(0xD36E11D2 ^ n, 13) + -1632516183) * -747761197;
        }
        return !this.haa_2.alh();
    }

    private static String dhb_3(String string, int n, int n2, int n3) {
        int n4 = 300439353;
        n4 = Integer.rotateLeft(n4 * 229443449, 25) ^ 0x34829ECE;
        n4 = Integer.rotateLeft(n ^ n4, 9);
        int n5 = (n4 = n2 ^ n4) ^ 0xB6268BD;
        if ((n5 ^ n4) != 190998717) {
            int cfr_ignored_0 = (0x1A8A3F84 ^ n4) + -1916891473;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xCB72B5A2) + i ^ khddh, 22) ^ n2 + jzr_2));
        }
        return new String(cArray);
    }

    private static class_1799 tkhq(class_1542 class_15422) {
        block0: {
            int n = tthgh.rzh(-238297044);
            int n2 = n ^ 0x4947B6B0;
            if ((n2 ^ n) == 1229436592) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xB88C569C ^ n, 10) - 1566317599) * -1198762339;
        }
        return class_15422.method_6983();
    }

    private static int khkhf(class_1799 class_17992) {
        block0: {
            int n = -1407700952;
            int n2 = (n = Integer.rotateLeft(n * 2073054841, 15) ^ 0xE1F75CC7) ^ 0xCF405C60;
            if ((n2 ^ n) == -817865632) break block0;
            int cfr_ignored_0 = (0x63586C48 ^ n) + -1163797275;
        }
        return class_17992.method_7947();
    }

    private static class_1799 hfz(class_1542 class_15422) {
        block0: {
            int n = 999170180;
            int n2 = (n = Integer.rotateLeft(n * -1148085249, 5) ^ 0xEB55E2BD) ^ 0xFDB1D3C2;
            if ((n2 ^ n) == -38677566) break block0;
            int cfr_ignored_0 = (0xC63FF346 ^ n) - -2095462923;
        }
        return class_15422.method_6983();
    }

    private static double shr_4(double d, double d2, double d3) {
        block0: {
            int n = 69126907;
            n = Integer.rotateLeft(n * -1770174911, 4) ^ 0xC6A41B02;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d2) ^ n, 23);
            int n2 = n ^ 0x76DC52FA;
            if ((n2 ^ n) == 1994150650) break block0;
            int cfr_ignored_0 = (0x72C29801 ^ n) + 1828852688;
        }
        return class_3532.method_16436((double)d, (double)d2, (double)d3);
    }

    private static class_238 dtf_4(class_1297 class_12972) {
        block0: {
            int n = 1483437510;
            n = Integer.rotateLeft(n * 419477217, 28) ^ 0xABBB197B;
            class_1297 class_12973 = class_12972;
            n = Integer.rotateRight((class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n, 12);
            int n2 = n ^ 0xEC2D24B7;
            if ((n2 ^ n) == -332585801) break block0;
            int cfr_ignored_0 = (0xB4465171 ^ n) - 1338996863;
        }
        return class_12972.method_5829();
    }

    private static double dhbj(class_1297 class_12972) {
        block0: {
            int n = tthgh.rzh(736595535);
            int n2 = n ^ 0x6701583F;
            if ((n2 ^ n) == 1728141375) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x4CE6D670 ^ n, 12) + 1414633163) * 1290196593;
        }
        return class_12972.method_23318();
    }

    private static double jay(class_1297 class_12972) {
        block0: {
            int n = tthgh.rzh(425769512);
            class_1297 class_12973 = class_12972;
            n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
            int n2 = n ^ 0x743A1C14;
            if ((n2 ^ n) == 1949965332) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x6D5AA63C ^ n, 16) - 1113047167) * 1834657341;
        }
        return class_12972.method_23321();
    }

    private static float thrm(int n) {
        block0: {
            int n2 = 688672424;
            n2 = Integer.rotateLeft(n2 * -1426346773, 4) ^ 0xCAFC6280;
            int n3 = (n2 = n ^ n2) ^ 0x9A07464A;
            if ((n3 ^ n2) == -1710799286) break block0;
            int cfr_ignored_0 = (0xB30B08E2 ^ n2) - -1286866085;
        }
        return Float.intBitsToFloat(n);
    }

    private static int szd_5(int n) {
        block0: {
            int n2 = -449190985;
            n2 = Integer.rotateLeft(n2 * 2040893503, 9) ^ 0xA26E8EDB;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 19)) ^ 0xA3D33E24;
            if ((n3 ^ n2) == -1546437084) break block0;
            int cfr_ignored_0 = (0x46EADD93 ^ n2) - -1989508719;
        }
        return Integer.reverse(n);
    }

    private static Vector2f azs_2(double d, double d2, double d3) {
        block0: {
            int n = -713478994;
            n = Integer.rotateLeft(n * -711671467, 9) ^ 0x5C2509EF;
            n = (int)Double.doubleToLongBits(d) ^ n;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d2) ^ n, 27);
            int n2 = n ^ 0xC26FDA27;
            if ((n2 ^ n) == -1032857049) break block0;
            int cfr_ignored_0 = (0x1716F689 ^ n) + -1248273760;
        }
        return bthw.ragh_2(d, d2, d3);
    }

    private static float adhsh(int n) {
        block0: {
            int n2 = 1269980317;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1214814567, 10) ^ 0x826A8667) ^ 0x48E3167B;
            if ((n3 ^ n2) == 1222841979) break block0;
            int cfr_ignored_0 = (0x3514AE6 ^ n2) + -1648587875;
        }
        return Float.intBitsToFloat(n);
    }

    private static kh_3 dkhb(Moondlc moondlc) {
        block0: {
            int n = 607878884;
            int n2 = (n = Integer.rotateLeft(n * -1285464591, 12) ^ 0xAD077371) ^ 0x241E498A;
            if ((n2 ^ n) == 605964682) break block0;
            int cfr_ignored_0 = (0x25376E ^ n) - 1559070047;
        }
        return moondlc.getFriendManager();
    }

    private static class_2561 shaz_3(class_1657 class_16572) {
        block0: {
            int n = -533125119;
            int n2 = (n = Integer.rotateLeft(n * 1540071641, 8) ^ 0x741A7837) ^ 0xE90B0ADE;
            if ((n2 ^ n) == -385152290) break block0;
            int cfr_ignored_0 = (0x93222DF ^ n) - -219550805;
        }
        return class_16572.method_5477();
    }

    private static byq dta_8(bzw_2 bzw2_2) {
        block0: {
            int n = tthgh.rzh(-1489748505);
            int n2 = n ^ 0xFCF8F982;
            if ((n2 ^ n) == -50792062) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x5BCCC465 ^ n, 14) - 573138806;
            int cfr_ignored_1 = (int)(0x997E6A5827D4EB4FL ^ (long)n ^ 0x29C0831A2DB89F2DL);
        }
        return bzw2_2.sdsh_4();
    }

    private static byq sjy(bghb bghb2, class_1297 class_12972, float f) {
        block0: {
            int n = -118943000;
            n = Integer.rotateLeft(n * 1379041649, 7) ^ 0x4471A432;
            bghb bghb3 = bghb2;
            n = Integer.rotateRight((bghb3 != null ? System.identityHashCode(bghb3) : 0) ^ n, 12);
            class_1297 class_12973 = class_12972;
            n = Integer.rotateRight((class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n, 20);
            int n2 = n ^ 0x9343A1A9;
            if ((n2 ^ n) == -1824284247) break block0;
            int cfr_ignored_0 = (0x6BAAB341 ^ n) + 1598311733;
        }
        return bghb2.rsha_2(class_12972, f);
    }

    private static byq hdhw(byq byq2, byq byq3, float f) {
        block0: {
            int n = 1099034422;
            n = Integer.rotateLeft(n * -401237461, 20) ^ 0x69705AFE;
            byq byq4 = byq2;
            n = Integer.rotateRight((byq4 != null ? System.identityHashCode(byq4) : 0) ^ n, 9);
            byq byq5 = byq3;
            n = Integer.rotateLeft((byq5 != null ? System.identityHashCode(byq5) : 0) ^ n, 13);
            int n2 = n ^ 0x75CFE192;
            if ((n2 ^ n) == 1976557970) break block0;
            int cfr_ignored_0 = (0x344E0EA4 ^ n) + 2050010728;
        }
        return byq2.dkhw_2(byq3, f);
    }

    private static float tkf(float f, float f2, float f3) {
        block0: {
            int n = tthgh.rzh(-716707912);
            n = Float.floatToIntBits(f3) ^ n;
            int n2 = n ^ 0xDDD999A7;
            if ((n2 ^ n) == -572941913) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x89E7E1F ^ n, 4) - 261022972) * 144604703;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static int jmh_2(int n) {
        block0: {
            int n2 = -395260195;
            n2 = Integer.rotateLeft(n2 * -989312233, 25) ^ 0xBF96BE6;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 7)) ^ 0x5171BA5F;
            if ((n3 ^ n2) == 1366407775) break block0;
            int cfr_ignored_0 = (0xB9017482 ^ n2) + 1924108969;
        }
        return Integer.reverse(n);
    }

    private static String jtkh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tthgh.rzh(960075722);
            int n5 = (n4 = n3 ^ n4) ^ 0x63E906DF;
            if ((n5 ^ n4) == 1676216031) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x5AD09115 ^ n4, 14) - 60764358) * 1523618069;
            int cfr_ignored_1 = (int)(0x98623F2827D4EB4FL ^ (long)n4 ^ 0x8320831A2DB89D15L);
        }
        return bghb.dhb_3(string, n, n2, n3);
    }

    private static long zrl() {
        block0: {
            int n = 770901610;
            int n2 = (n = Integer.rotateLeft(n * 810443307, 19) ^ 0x14502679) ^ 0x15AC39AE;
            if ((n2 ^ n) == 363608494) break block0;
            int cfr_ignored_0 = (0x385F3FC4 ^ n) - 258233170;
        }
        return System.currentTimeMillis();
    }

    private static double jsth_2(long l) {
        block0: {
            int n = -177141232;
            n = Integer.rotateLeft(n * 1896488855, 23) ^ 0x751DB0D;
            int n2 = (n = (int)l ^ n) ^ 0x351A2820;
            if ((n2 ^ n) == 890906656) break block0;
            int cfr_ignored_0 = (0xC06B2230 ^ n) - 1606075140;
        }
        return Double.longBitsToDouble(l);
    }

    private static double asth_2(long l) {
        block0: {
            int n = 522942819;
            int n2 = (n = Integer.rotateLeft(n * 411584685, 15) ^ 0xC241462D) ^ 0x5E7634F4;
            if ((n2 ^ n) == 1584805108) break block0;
            int cfr_ignored_0 = (0x415D4D97 ^ n) - 174323999;
        }
        return Double.longBitsToDouble(l);
    }

    private static boolean ztb(s_3 s2) {
        block0: {
            int n = -1127347833;
            n = Integer.rotateLeft(n * 330330389, 23) ^ 0x792A6B5D;
            s_3 s3 = s2;
            n = Integer.rotateLeft((s3 != null ? System.identityHashCode(s3) : 0) ^ n, 6);
            int n2 = n ^ 0xE0CE51B6;
            if ((n2 ^ n) == -523349578) break block0;
            int cfr_ignored_0 = (0x5C005831 ^ n) + -128828513;
        }
        return s2.alh();
    }

    private static boolean jkhm(s_3 s2) {
        block0: {
            int n = -1208485576;
            int n2 = (n = Integer.rotateLeft(n * -1588591181, 26) ^ 0xB05E31A0) ^ 0x76F8223A;
            if ((n2 ^ n) == 1995973178) break block0;
            int cfr_ignored_0 = (0xC10FDB02 ^ n) + -789135891;
        }
        return s2.alh();
    }

    private static boolean zah_7(s_3 s2) {
        block0: {
            int n = -484654835;
            n = Integer.rotateLeft(n * 491457645, 19) ^ 0x4F456543;
            s_3 s3 = s2;
            n = (s3 != null ? System.identityHashCode(s3) : 0) ^ n;
            int n2 = n ^ 0x52B75457;
            if ((n2 ^ n) == 1387746391) break block0;
            int cfr_ignored_0 = (0xB1AB955A ^ n) - 443534228;
        }
        return s2.alh();
    }

    private static boolean swn_2(s_3 s2) {
        block0: {
            int n = tthgh.rzh(-1177115511);
            int n2 = n ^ 0x513E3E91;
            if ((n2 ^ n) == 1363033745) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xE8E89A18 ^ n, 16) + 948455459) * -387409383;
        }
        return s2.alh();
    }

    private static boolean jst_4(s_3 s2) {
        block0: {
            int n = -726791136;
            n = Integer.rotateLeft(n * 743361215, 5) ^ 0x9A023C8D;
            s_3 s3 = s2;
            n = Integer.rotateLeft((s3 != null ? System.identityHashCode(s3) : 0) ^ n, 4);
            int n2 = n ^ 0xB6ADBB25;
            if ((n2 ^ n) == -1230128347) break block0;
            int cfr_ignored_0 = (0x6203B705 ^ n) - -568014492;
        }
        return s2.alh();
    }

    private static String[] bds_2(String string) {
        block0: {
            int n = tthgh.rzh(2013469332);
            int n2 = n ^ 0x70980565;
            if ((n2 ^ n) == 1889011045) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x89B1FF1 ^ n, 4) + 254180714) * 144383985;
            int cfr_ignored_1 = (int)(0xCA29B1CC27D4EB4FL ^ (long)n ^ 0x9EE8831A2DB83982L);
        }
        return string.split("\u0001\u0011", -1);
    }

    private static CallSite shkh_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1821744388;
            n3 = Integer.rotateLeft(n3 * -1149801265, 4) ^ 0xE19521ED;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 20);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x42EC5686;
            if ((n4 ^ n3) != 1122784902) {
                int cfr_ignored_0 = (0x2E79CB82 ^ n3) + -1402299132;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ dbt ^ string.hashCode() ^ n2 + thdn_2 + i * -676541901) + dbt) ^ thdn_2));
            }
            String[] stringArray = bghb.bds_2(new String(cArray));
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

    private static String[] du18pmuh(String string) {
        return string.split("\u0002\u0019", -1);
    }

    private static CallSite yd9aeshs23esks(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ e3wz4l0 ^ string.hashCode()) + (n2 + o30p6yoa) + i ^ e3wz4l0, 20) + o30p6yoa);
            }
            String[] stringArray = bghb.du18pmuh(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
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

