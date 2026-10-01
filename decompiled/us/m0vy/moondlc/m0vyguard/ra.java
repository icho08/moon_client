/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10055
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_5498
 *  net.minecraft.class_572
 *  net.minecraft.class_591
 *  net.minecraft.class_7833
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_10055;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_5498;
import net.minecraft.class_572;
import net.minecraft.class_591;
import net.minecraft.class_7833;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.taa_2;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.trm;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="FriendRender", category=bzw.OTHER, desc="Renders extra friend visuals")
public class ra
extends bnq {
    private static ra jdhsh;
    private final badh_2 dfdh = new badh_2(this, "Crystal Marker").bts(true);
    private final bzw_2 dhws = new bzw_2(this, "Marker Color", this::zab_3).dhshy(new byq(Float.intBitsToFloat(210724088 + 902601480), Float.intBitsToFloat(Integer.rotateLeft(0x42EC7D5 ^ 0x40F7855, 9)), Float.intBitsToFloat(854490397 + 265257699), Float.intBitsToFloat(287044064 + 845352480)));
    private final tay tht_2 = new tay((hy)this, "Marker Alpha", this::ay).shth_7(Float.intBitsToFloat(Integer.reverse(-1776556582) ^ 0x666B14A4)).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(-1516873009 - 1749650946)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x383576 ^ 0x1EFFDEF3, 11)));
    private final tay shra_2 = new tay((hy)this, "Marker Size", this::radh).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0xEBEF5EEF ^ 0x9B4C9192, 18))).dhbs_2(Float.intBitsToFloat(0xDF196096 ^ 0xE0596096)).rkh_3(Float.intBitsToFloat(-1678275396 - 1599321522)).ssd_5(Float.intBitsToFloat(0x16F71632 ^ 0x28784A1B));
    private final tay thta_3 = new tay((hy)this, "Marke".concat("r Height"), this::shydh).shth_7(Float.intBitsToFloat(0xF015961D ^ 0xCE8C0F87)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(-1294694165) ^ 0xEA5DE780)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xC173BD41 ^ 0xC173BCBC, 21)));
    private final tay zyt = new tay((hy)this, "Spin Speed", this::smj).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xA55E800A ^ 0xA45C800A, 6))).rkh_3(Float.intBitsToFloat(416088122 + 620743827)).ssd_5(0.0f);
    private final tay szk = new tay((hy)this, "Bob Amount", this::tbt_4).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(0x4C8C2C72 ^ 0x7215B5E8)).rkh_3(Float.intBitsToFloat(1847223905 - 838242135)).ssd_5(Float.intBitsToFloat(-394638401 + 1423081742));
    private final badh_2 tghb = new badh_2((hy)this, "Pulse", this::jad_3).bts(true);
    private final badh_2 zjl = new badh_2((hy)this, "Marker Outline", this::bsd_2).bts(true);
    private final tay dhbgh = new tay((hy)this, "Outline Width", this::hba).shth_7(Float.intBitsToFloat(1442923687 + -385959079)).dhbs_2(Float.intBitsToFloat(1958495545 - 876365113)).rkh_3(Float.intBitsToFloat(Integer.reverse(-2056871578) ^ 0x5B49AA6C)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x45A15A4B ^ 0x45BEBA4B, 9)));
    private final badh_2 zaj_2 = new badh_2((hy)this, "Through Walls", this::sbgh_2).bts(false);
    private final badh_2 snt = new badh_2(this, "Stylized Model").bts(true);
    private final tay jsl = new tay((hy)this, "Body Scale", this::khyj).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0xD80CECB0 ^ 0xD80CE310, 18))).dhbs_2(Float.intBitsToFloat(Integer.reverse(1837810677) ^ 0x904F9D7B)).rkh_3(Float.intBitsToFloat(-163840280 - -1192283621)).ssd_5(Float.intBitsToFloat(-1652561379 + -1584602448));
    private final tay rnh = new tay((hy)this, "Head Scale", this::thzgh).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(951540241) ^ 0xC869DE2F)).rkh_3(Float.intBitsToFloat(-184233468 - -1212676809)).ssd_5(Float.intBitsToFloat(Integer.reverse(697382983) ^ 0xDDEFBAA7));
    private final tay ash_2 = new tay((hy)this, "Skin Laye".concat("r Scale"), this::aqt_2).shth_7(Float.intBitsToFloat(-1008748274 - -2070746047)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(-385233895) ^ 0xA57F5C5A)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x82173BF7 ^ 0xDFFCE35, 2)));
    private final tay jdz_2 = new tay((hy)this, "Arm Scale", this::dsm_3).shth_7(Float.intBitsToFloat(-1245046726 - 1997989127)).dhbs_2(Float.intBitsToFloat(-1711376865 + -1516559493)).rkh_3(Float.intBitsToFloat(-1717230860 + -1549293095)).ssd_5(1.0f);
    private final tay rthgh = new tay((hy)this, "Leg Scale", this::zfw).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x94B53AC1 ^ 0x5879F63B, 22))).dhbs_2(Float.intBitsToFloat(1864683914 + -797652976)).rkh_3(Float.intBitsToFloat(Integer.reverse(-1299844793) ^ 0xDFC36D80)).ssd_5(1.0f);
    private final badh_2 taq_2 = new badh_2(this, "Render Invisible").bts(false);
    private final badh_2 wm = new badh_2(this, "Incl".concat("ude Self")).bts(false);
    private final tay rna_2 = new tay(this, "Max ".concat("Distance")).shth_7(Float.intBitsToFloat(-1945698699 + -1258749557)).dhbs_2(Float.intBitsToFloat(-1550261747 + -1612243469)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xDB7412BC ^ 0xD97012BC, 5))).ssd_5(Float.intBitsToFloat(667395632 + 452483536));
    private long zthy;
    private final bql<shw_3> shsz_2 = this::ajsh;
    private static final int shsl = -1130501938;
    private static final int htkh_2 = -526706458;
    private static final int kl = 247425515;
    private static final int hqz = -1636684916;
    private static final int asebydi = 241804120;
    private static final int ptx7snqie = -377664244;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int slfi1159k1gc;

    public ra() {
        jdhsh = this;
    }

    public static ra hdkh() {
        block0: {
            int n = trm.dkw(-1124851271);
            int n2 = n ^ 0xF18F949C;
            if ((n2 ^ n) == -242248548) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x4D7BB525 ^ n, 12) - 1717079734;
            int cfr_ignored_1 = (int)(0x8FC91B1827D4EB4FL ^ (long)n ^ 0xCB40831A2DB8B243L);
        }
        return jdhsh;
    }

    @Override
    public void nt() {
        int n = trm.dkw(894817438);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xD1F71D92;
        if ((n2 ^ n) != -772334190) {
            int cfr_ignored_0 = Integer.rotateLeft(0xE4A2C90C ^ n, 15) - -1273759825;
        }
        this.zthy = System.nanoTime();
    }

    public boolean dmz(class_10055 class_100552) {
        try {
            int n = -122873503;
            n = Integer.rotateLeft(n * 1185665025, 16) ^ 0x9DBAF690;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 20);
            int n2 = n ^ 0xF9431A7E;
            if ((n2 ^ n) != -113042818) {
                int cfr_ignored_0 = (0x1EE031F ^ n) - 1031895551;
            }
            if ((0x231 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!this.rgha_2() || !this.snt.shzl() || class_100552 == null || ra.mc.field_1724 == null || ra.mc.field_1687 == null) {
            int n = 0;
            if (yf.tdhth_2() == 0) {
                n = n ^ 0x86F4;
            }
            return n != 0;
        }
        if (class_100552.field_53333 && !this.taq_2.shzl() || class_100552.field_53542 || class_100552.field_53529 == null) {
            return false;
        }
        if (class_100552.field_53528 == ra.mc.field_1724.method_5628()) {
            return this.wm.shzl() && ra.mc.field_1690.method_31044() != class_5498.field_26664 && ra.zzkh_3(this, class_100552.field_53529);
        }
        return this.tzj_4(class_100552.field_53529);
    }

    public taa_2 tll_2(class_4587 class_45872, class_572 class_5722) {
        if (class_45872 == null || class_5722 == null) {
            return taa_2.fb();
        }
        taa_2 taa2_2 = new taa_2();
        float f = this.jsl.thw_5();
        float f2 = this.jdz_2.thw_5();
        float f3 = this.rthgh.thw_5();
        taa2_2.zsgh(class_45872);
        class_45872.method_46416(0.0f, 1.5f * (1.0f - f), 0.0f);
        class_45872.method_22905(f, f, f);
        taa2_2.jz(class_5722.field_3398, this.rnh.thw_5());
        taa2_2.jz(class_5722.field_3401, f2);
        taa2_2.jz(class_5722.field_27433, f2);
        taa2_2.jz(class_5722.field_3392, f3);
        taa2_2.jz(class_5722.field_3397, f3);
        if (class_5722 instanceof class_591) {
            class_591 class_5912 = (class_591)class_5722;
            taa2_2.jz(class_5912.field_3394, this.ash_2.thw_5());
            taa2_2.jz(class_5912.field_3486, f2);
            taa2_2.jz(class_5912.field_3484, f2);
            taa2_2.jz(class_5912.field_3479, f3);
            taa2_2.jz(class_5912.field_3482, f3);
        }
        return taa2_2;
    }

    private void jnk(class_4587 class_45872, float f) {
        class_4184 class_41842 = ra.mc.field_1773.method_19418();
        double d = class_3532.method_27285((float)this.rna_2.thw_5());
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.depthMask((boolean)false);
        if (this.zaj_2.shzl()) {
            RenderSystem.disableDepthTest();
        } else {
            RenderSystem.enableDepthTest();
        }
        for (class_1657 class_16572 : ra.mc.field_1687.method_18456()) {
            if (!this.alz(class_16572, d)) continue;
            this.jry(class_45872, class_16572, class_41842, f);
        }
        RenderSystem.lineWidth((float)1.0f);
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private boolean alz(class_1657 class_16572, double d) {
        if (class_16572 == null || class_16572.method_31481() || class_16572.method_7325()) {
            return false;
        }
        if (class_16572.method_5767() && !this.taq_2.shzl()) {
            return false;
        }
        if (class_16572 == ra.mc.field_1724) {
            return this.wm.shzl() && ra.mc.field_1690.method_31044() != class_5498.field_26664 && this.tzj_4(class_16572.method_5477().getString());
        }
        return this.tzj_4(class_16572.method_5477().getString()) && ra.mc.field_1724.method_5858((class_1297)class_16572) <= d;
    }

    private boolean tzj_4(String string) {
        int n = 1620507610;
        n = Integer.rotateLeft(n * 1178355007, 18) ^ 0x7B624B41;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xD191DEEC;
        if ((n2 ^ n) != -778969364) {
            int cfr_ignored_0 = (0xB1072536 ^ n) - 1551762866;
        }
        return string != null && ra.shdhsh(Moondlc.getInstance()).adhj(string);
    }

    private void jry(class_4587 class_45872, class_1657 class_16572, class_4184 class_41842, float f) {
        class_243 class_2432 = class_41842.method_19326();
        double d = class_3532.method_16436((double)f, (double)class_16572.field_6014, (double)class_16572.method_23317()) - class_2432.field_1352;
        double d2 = class_3532.method_16436((double)f, (double)class_16572.field_6036, (double)class_16572.method_23318()) - class_2432.field_1351 + (double)class_16572.method_17682() + (double)this.thta_3.thw_5();
        double d3 = class_3532.method_16436((double)f, (double)class_16572.field_5969, (double)class_16572.method_23321()) - class_2432.field_1350;
        double d4 = (double)(System.nanoTime() - this.zthy) / 1.0E9;
        double d5 = d4 * 2.15 + (double)class_16572.method_5628() * 0.73;
        float f2 = this.szk.thw_5() <= 0.0f ? 0.0f : (float)Math.sin(d5) * this.szk.thw_5();
        float f3 = (float)class_16572.method_5628() * 19.0f;
        float f4 = this.tghb.shzl() ? (float)(0.9 + 0.1 * Math.sin(d4 * 2.65 + (double)class_16572.method_5628() * 0.4)) : 1.0f;
        float f5 = this.tghb.shzl() ? (float)(1.0 + 0.055 * Math.sin(d4 * 2.25 + (double)class_16572.method_5628() * 0.55)) : 1.0f;
        byq byq2 = this.dhws.sdsh_4();
        float f6 = this.shqs_2(byq2.sbk() / 255.0f * f4);
        float f7 = this.shqs_2(byq2.srl() / 255.0f * f4);
        float f8 = this.shqs_2(byq2.shsl_2() / 255.0f * f4);
        float f9 = this.tht_2.thw_5();
        class_45872.method_22903();
        class_45872.method_22904(d, d2 + (double)f2, d3);
        if (this.zyt.thw_5() > 0.001f) {
            class_45872.method_22907(class_7833.field_40716.rotationDegrees(f3 += (float)(d4 * 120.0 * (double)this.zyt.thw_5())));
        }
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f10 = this.shra_2.thw_5() * f5;
        this.zjkh_2(matrix4f, f10, f6, f7, f8, f9);
        if (this.zjl.shzl()) {
            this.zff_2(matrix4f, f10, f6, f7, f8, Math.min(1.0f, f9 + 0.18f));
        }
        class_45872.method_22909();
    }

    private void zjkh_2(Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5) {
        float f6 = f * 0.44f;
        float f7 = f * 0.78f;
        float f8 = -f * 0.64f;
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27379, class_290.field_1576);
        for (int i = 0; i < 4; ++i) {
            float f9 = (float)(1.5707963267948966 * (double)i + 0.7853981633974483);
            float f10 = f9 + 1.5707964f;
            float f11 = class_3532.method_15362((float)f9) * f6;
            float f12 = class_3532.method_15374((float)f9) * f6;
            float f13 = class_3532.method_15362((float)f10) * f6;
            float f14 = class_3532.method_15374((float)f10) * f6;
            class_2872.method_22918(matrix4f, 0.0f, f7, 0.0f).method_22915(this.shqs_2(f2 * 1.12f), this.shqs_2(f3 * 1.12f), this.shqs_2(f4 * 1.12f), f5);
            class_2872.method_22918(matrix4f, f11, 0.0f, f12).method_22915(f2, f3, f4, f5);
            class_2872.method_22918(matrix4f, f13, 0.0f, f14).method_22915(f2, f3, f4, f5);
            class_2872.method_22918(matrix4f, 0.0f, f8, 0.0f).method_22915(this.shqs_2(f2 * 0.82f), this.shqs_2(f3 * 0.82f), this.shqs_2(f4 * 0.82f), f5);
            class_2872.method_22918(matrix4f, f13, 0.0f, f14).method_22915(f2, f3, f4, f5);
            class_2872.method_22918(matrix4f, f11, 0.0f, f12).method_22915(f2, f3, f4, f5);
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    private void zff_2(Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5) {
        float f6 = f * 0.44f;
        float f7 = f * 0.78f;
        float f8 = -f * 0.64f;
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        RenderSystem.lineWidth((float)this.dhbgh.thw_5());
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
        for (int i = 0; i < 4; ++i) {
            float f9 = (float)(1.5707963267948966 * (double)i + 0.7853981633974483);
            float f10 = f9 + 1.5707964f;
            float f11 = class_3532.method_15362((float)f9) * f6;
            float f12 = class_3532.method_15374((float)f9) * f6;
            float f13 = class_3532.method_15362((float)f10) * f6;
            float f14 = class_3532.method_15374((float)f10) * f6;
            this.jsy_2(class_2872, matrix4f, 0.0f, f7, 0.0f, f11, 0.0f, f12, f2, f3, f4, f5);
            this.jsy_2(class_2872, matrix4f, 0.0f, f8, 0.0f, f11, 0.0f, f12, f2, f3, f4, f5);
            this.jsy_2(class_2872, matrix4f, f11, 0.0f, f12, f13, 0.0f, f14, f2, f3, f4, f5);
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    /*
     * Unable to fully structure code
     */
    private void jsy_2(class_287 var1_1, Matrix4f var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, float var9_9, float var10_10, float var11_11, float var12_12) {
        var15_13 = 0;
        var13_14 = 1841798108;
        var13_14 = Integer.rotateLeft(var13_14 * 1115325237, 11) ^ -304196869;
        v0 = var1_1;
        var13_14 = Integer.rotateLeft((v0 != null ? System.identityHashCode(v0) : 0) ^ var13_14, 5);
        v1 = var2_2;
        var13_14 = (v1 != null ? System.identityHashCode(v1) : 0) ^ var13_14;
        var14_15 = Integer.reverse(Integer.reverse(Integer.reverse(var13_14 ^ 367872302 ^ 1584711148)));
        block20: while (true) {
            if ((var15_13 = Integer.reverse(var14_15) ^ var13_14 ^ 1584711148) == 1780868586) ** GOTO lbl-1000
            if (var15_13 != -337545650) {
                Integer.rotateLeft(495042188 ^ var13_14, 6) - -1760316881;
                switch (var15_13) {
                    case 367872302: {
                        Integer.rotateLeft(2033912512 ^ var13_14, 18) + -1299977093;
                        if (!ra.qt_2()) {
                            var14_15 = Integer.reverse(var13_14 ^ 1780868586 ^ 1584711148) ^ -411205678 ^ -411205678;
                            Integer.rotateRight(-1371497301 ^ var13_14, 8) + 506501104;
                            continue block20;
                        }
                        try {
                            if ((4942378375217948463L ^ (long)var13_14 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            var14_15 = Integer.reverse(var13_14 ^ -199402100 ^ 1584711148);
                        }
                        catch (IllegalArgumentException v2) {
                            var14_15 = Integer.reverse(Integer.reverse(Integer.reverse(var13_14 ^ -199402100 ^ 1584711148)));
                        }
                        var15_13 += 3;
                        continue block20;
                    }
                }
            }
            ** GOTO lbl109
lbl-1000:
            // 1 sources

            {
                Integer.rotateRight(-1158959925 ^ var13_14, 10) + -1494774832;
                yf.athz_2();
                throw null;
                case -199402100: {
                    Integer.rotateLeft(-1397767220 ^ var13_14, 8) - -307866385;
                    var1_1.method_22918(var2_2, var3_3, var4_4, var5_5).method_22915(var9_9, var10_10, var11_11, var12_12);
                    ra.daw_2(var1_1, var2_2, var6_6, var7_7, var8_8).method_22915(var9_9, var10_10, var11_11, var12_12);
                    return;
                }
                case 558157180: {
                    Integer.rotateRight(-397567541 ^ var13_14, 16) + 633552592;
                    var14_15 = Integer.reverse(var13_14 ^ 1622504042 ^ 1584711148) ^ -1692482485 ^ -1692482485;
                    (Integer.rotateRight(-1567876358 ^ var13_14, 7) + -1286282367) * -1567876357;
                    (int)(1497019503475688464L ^ (long)var13_14 ^ 859573674704340061L);
                    var14_15 = Integer.reverse(var13_14 ^ 367872302 ^ 1584711148) + 135882527 - 135882527;
                    continue block20;
                }
                case 1425094640: {
                    Integer.rotateRight(-883971378 ^ var13_14, 12) - -1560064467;
                    var14_15 = Integer.reverse(var13_14 ^ -1230314598 ^ 1584711148) + -1950898112 - -1950898112;
                    (Integer.rotateRight(1889847218 ^ var13_14, 17) + -1471033911) * 1889847219;
                    var14_15 = Integer.reverse(var13_14 ^ 367872302 ^ 1584711148);
                    var15_13 += 3;
                    continue block20;
                }
                case 118738119: {
                    Integer.rotateRight(-1853115802 ^ var13_14, 5) - -1538770539;
                    try {
                        var15_13 -= 4;
                        var14_15 = Integer.reverse(var13_14 ^ 367872302 ^ 1584711148) ^ -1749084023 ^ -1749084023;
                    }
                    catch (NoSuchElementException v3) {
                        var14_15 = (int)((long)Integer.reverse(var13_14 ^ 367872302 ^ 1584711148) ^ -3762950556660704737L ^ -3762950556660704737L);
                    }
                    continue block20;
                }
                case -2515525: {
                    (Integer.rotateRight(486079002 ^ var13_14, 6) + -2038175647) * 486079003;
                    var14_15 = Integer.reverse(Integer.reverse(Integer.reverse(var13_14 ^ 1589858069 ^ 1584711148)));
                    (Integer.rotateLeft(775820501 ^ var13_14, 8) - -1646123770) * 775820501;
                    (int)(-1401539877755622577L ^ (long)var13_14 ^ -8601731139818195768L);
                    var14_15 = Integer.reverse(var13_14 ^ 367872302 ^ 1584711148) + -2024714374 - -2024714374;
                    var15_13 += 4;
                    continue block20;
                }
                case -545668806: {
                    Integer.rotateRight(158850210 ^ var13_14, 4) + 702633689;
                    var14_15 = (int)((long)Integer.reverse(var13_14 ^ 1133293541 ^ 1584711148) ^ -7202714062436521080L ^ -7202714062436521080L);
                    (Integer.rotateRight(-623710881 ^ var13_14, 14) - -2081923652) * -623710881;
                    (int)(-751076102890822044L ^ (long)var13_14 ^ -5334580402689521930L);
                    var14_15 = (int)((long)Integer.reverse(var13_14 ^ 367872302 ^ 1584711148) ^ -12911541634997267L ^ -12911541634997267L);
                    --var15_13;
                    continue block20;
                }
                case 1941098234: {
                    Integer.rotateRight(-1637229437 ^ var13_14, 6) + 858739480;
                    var14_15 = Integer.reverse(var13_14 ^ 1174603675 ^ 1584711148) + 1519305845 - 1519305845;
                    (Integer.rotateLeft(-2034127948 ^ var13_14, 3) - 1439787527) * -2034127947;
                    var14_15 = (int)((long)Integer.reverse(var13_14 ^ -1949979790 ^ 1584711148) ^ -4456046365094193879L ^ -4456046365094193879L);
                    Integer.rotateLeft(887946085 ^ var13_14, 9) - 1829769334;
                    (int)(-694023455454729393L ^ (long)var13_14 ^ 6323198025287614829L);
                    var14_15 = Integer.reverse(var13_14 ^ 367872302 ^ 1584711148);
                    continue block20;
                }
lbl109:
                // 1 sources

                Integer.rotateRight(302982470 ^ var13_14, 5) - 875766453;
                var14_15 = Integer.reverse(var13_14 ^ 1100505300 ^ 1584711148);
                Integer.rotateRight(10637419 ^ var13_14, 3) + 403004464;
                var14_15 = Integer.reverse(Integer.reverse(Integer.reverse(var13_14 ^ 1169392845 ^ 1584711148)));
                Integer.rotateRight(605667846 ^ var13_14, 7) - 1669078517;
                var14_15 = Integer.reverse(var13_14 ^ 367872302 ^ 1584711148) + -1166796498 - -1166796498;
                var15_13 += 3;
                continue block20;
                case -495143982: {
                    (Integer.rotateRight(-1184022446 ^ var13_14, 10) + 2023254313) * -1184022445;
                    try {
                        var14_15 = Integer.reverse(var13_14 ^ 367872302 ^ 1584711148);
                    }
                    catch (IllegalStateException v4) {
                        var14_15 = Integer.reverse(var13_14 ^ 367872302 ^ 1584711148);
                    }
                    --var15_13;
                    continue block20;
                }
                case 1297132678: {
                    Integer.rotateLeft(-1706710748 ^ var13_14, 6) - -1295181161;
                    (int)(-5094674127290588295L ^ (long)var13_14 ^ -3112070618744037559L);
                    var14_15 = Integer.reverse(var13_14 ^ 367872302 ^ 1584711148) + -861080241 - -861080241;
                    continue block20;
                }
                case -736889482: {
                    Integer.rotateLeft(-400530647 ^ var13_14, 16) + 541696306;
                    (int)(3067739782644034383L ^ (long)var13_14 ^ 7446846132316666100L);
                    var14_15 = Integer.reverse(var13_14 ^ 367872302 ^ 1584711148) ^ -1135277473 ^ -1135277473;
                    Integer.rotateRight(-1222943634 ^ var13_14, 9) - 816697485;
                    var15_13 -= 3;
                    continue block20;
                }
                case 635521263: {
                    (Integer.rotateLeft(-837322640 ^ var13_14, 12) + -113953589) * -837322639;
                    var14_15 = Integer.reverse(Integer.reverse(Integer.reverse(var13_14 ^ -1854173445 ^ 1584711148)));
                    (Integer.rotateRight(-1390791621 ^ var13_14, 8) + -91622816) * -1390791621;
                    var14_15 = Integer.reverse(var13_14 ^ 1163036427 ^ 1584711148) + 595746288 - 595746288;
                    Integer.rotateRight(2065664067 ^ var13_14, 18) + -315678888;
                    var14_15 = Integer.reverse(var13_14 ^ 367872302 ^ 1584711148) ^ -1522343590 ^ -1522343590;
                    var15_13 += 2;
                }
            }
            (Integer.rotateLeft(985224632 ^ var13_14, 10) + 550436995) * 985224633;
            var14_15 = (int)((long)Integer.reverse(var13_14 ^ 367872302 ^ 1584711148) ^ -5318837862288883819L ^ -5318837862288883819L);
        }
    }

    private float shqs_2(float f) {
        block0: {
            int n = trm.dkw(1341116593);
            n = System.identityHashCode(this) ^ n;
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 25);
            int n2 = n ^ 0x600C95E2;
            if ((n2 ^ n) == 1611437538) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x2FE34553 ^ n, 8) + -790428600) * 803423571;
        }
        return ra.jad_4(f, 0.0f, 1.0f);
    }

    private void ajsh(shw_3 shw2) {
        int n = 0;
        int n2 = -1790578872;
        n2 = Integer.rotateLeft(n2 * 2142346387, 19) ^ 0x24EA830E;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 22);
        int n3 = (n2 ^ 0xEDB2305B) + 503238986 - 503238986;
        while (true) {
            block22: {
                block30: {
                    block26: {
                        block41: {
                            block42: {
                                block23: {
                                    block28: {
                                        block21: {
                                            block34: {
                                                block36: {
                                                    block40: {
                                                        block35: {
                                                            block27: {
                                                                block29: {
                                                                    block39: {
                                                                        block20: {
                                                                            block24: {
                                                                                block33: {
                                                                                    block38: {
                                                                                        block37: {
                                                                                            block31: {
                                                                                                block32: {
                                                                                                    block17: {
                                                                                                        block25: {
                                                                                                            block18: {
                                                                                                                block19: {
                                                                                                                    if ((n = n3 ^ n2) > -1195136484) break block17;
                                                                                                                    if (n > -1631234892) break block18;
                                                                                                                    if (n > -2065786755) break block19;
                                                                                                                    if (n == -2098422848) break block20;
                                                                                                                    if (n == -2065786755) break block21;
                                                                                                                    int cfr_ignored_0 = Integer.rotateLeft(0x805F0D61 ^ n2, 3) + -1881129478;
                                                                                                                    int cfr_ignored_1 = (int)(0x42EDA35C27D4EB4FL ^ (long)n2 ^ 0xBBC8831A2DB9280AL);
                                                                                                                    break block22;
                                                                                                                }
                                                                                                                if (n == -1730153025) break block23;
                                                                                                                if (n == -1631234892) break block24;
                                                                                                                break block22;
                                                                                                            }
                                                                                                            if (n > -1410493624) break block25;
                                                                                                            if (n == -1550655236) break block26;
                                                                                                            if (n == -1410493624) break block27;
                                                                                                            int cfr_ignored_2 = Integer.rotateRight(0x47C83867 ^ n2, 11) - -1248037964;
                                                                                                            break block22;
                                                                                                        }
                                                                                                        if (n == -1223881836) break block28;
                                                                                                        if (n == -1218884775) break block29;
                                                                                                        int cfr_ignored_3 = (Integer.rotateLeft(0x46475854 ^ n2, 11) - -2029956761) * 1179080789;
                                                                                                        if (n == -1195136484) break block30;
                                                                                                        break block22;
                                                                                                    }
                                                                                                    if (n > -479780969) break block31;
                                                                                                    if (n > -656053543) break block32;
                                                                                                    if (n == -1124082544) break block33;
                                                                                                    if (n == -656053543) break block34;
                                                                                                    int cfr_ignored_4 = (Integer.rotateLeft(0xD740C7B8 ^ n2, 13) + 355847811) * -683620423;
                                                                                                    break block22;
                                                                                                }
                                                                                                if (n == -562415741) break block35;
                                                                                                if (n == -479780969) break block36;
                                                                                                break block22;
                                                                                            }
                                                                                            if (n > 852973922) break block37;
                                                                                            if (n == -307089317) break block38;
                                                                                            if (n == 852973922) break block39;
                                                                                            int cfr_ignored_5 = (Integer.rotateRight(0xD6F6115E ^ n2, 13) - 204061085) * -688516769;
                                                                                            break block22;
                                                                                        }
                                                                                        if (n == 1067018988) break block40;
                                                                                        if (n == 1437919288) break block41;
                                                                                        int cfr_ignored_6 = Integer.rotateRight(0xD84F5426 ^ n2, 14) - 905498581;
                                                                                        if (n == 1538590146) break block42;
                                                                                        break block22;
                                                                                    }
                                                                                    int cfr_ignored_7 = Integer.rotateRight(0xEA0411A3 ^ n2, 16) + 1524351480;
                                                                                    if (!this.dfdh.shzl()) {
                                                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xC0B6751));
                                                                                        int cfr_ignored_8 = Integer.rotateRight(0x1122160B ^ n2, 5) + 394152592;
                                                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x32D75962));
                                                                                        --n;
                                                                                        continue;
                                                                                    }
                                                                                    n3 = (int)((long)(n2 ^ 0xBCFFDC90) ^ 0x34F591307AFDE2B0L ^ 0x34F591307AFDE2B0L);
                                                                                    --n;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_9 = Integer.rotateRight(0x16A09883 ^ n2, 5) + -1043327208;
                                                                                if (ra.mc.field_1724 == null) {
                                                                                    int cfr_ignored_10 = (int)(0x1AF2FA8944DF386L ^ (long)n2 ^ 0xA221E4281C2BAE8FL);
                                                                                    n3 = n2 ^ 0x32D75962 ^ 0x554F0DA6 ^ 0x554F0DA6;
                                                                                    n -= 4;
                                                                                    continue;
                                                                                }
                                                                                n3 = (int)((long)(n2 ^ 0x9EC554B4) ^ 0x2856B11EEFB376EAL ^ 0x2856B11EEFB376EAL);
                                                                                int cfr_ignored_11 = Integer.rotateLeft(0xC9A926C4 ^ n2, 12) - 1876513015;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_12 = Integer.rotateRight(0x852DFBA3 ^ n2, 3) + 619649016;
                                                                            if (ra.mc.field_1687 != null) {
                                                                                int cfr_ignored_13 = (int)(0x384C896B23871645L ^ (long)n2 ^ 0xEFA68BBDD7ADDD48L);
                                                                                n3 = (n2 ^ 0x82EC9BC0) + 61578337 - 61578337;
                                                                                ++n;
                                                                                continue;
                                                                            }
                                                                            n3 = n2 ^ 0x32D75962;
                                                                            n -= 4;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_14 = (Integer.rotateRight(0xB717585A ^ n2, 9) + 808538657) * -1223206821;
                                                                        this.jnk(shw2.ssha_2(), shw2.skz_4());
                                                                        int cfr_ignored_15 = (int)(0xFB27FD2799A447B1L ^ (long)n2 ^ 0x73FFFFB74445B9EL);
                                                                        n3 = n2 ^ 0x4DEE2A27;
                                                                        int cfr_ignored_16 = (int)(0x81F4808F39D8FABBL ^ (long)n2 ^ 0xFC6EBF020E50AE38L);
                                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x32D75962));
                                                                        --n;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_17 = (Integer.rotateRight(0x495AC91A ^ n2, 12) + -430179999) * 1230686491;
                                                                    return;
                                                                }
                                                                int cfr_ignored_18 = (Integer.rotateLeft(0xA2DD995 ^ n2, 4) - 1072363590) * 170776981;
                                                                int cfr_ignored_19 = (int)(0xC89F77A827D4EB4FL ^ (long)n2 ^ 0x1220831A2DB83CEFL);
                                                                n3 = n2 ^ 0xEDB2305B;
                                                                --n;
                                                                continue;
                                                            }
                                                            int cfr_ignored_20 = Integer.rotateLeft(0x6FFA3E45 ^ n2, 16) - -1817499242;
                                                            int cfr_ignored_21 = (int)(0xAD48907827D4EB4FL ^ (long)n2 ^ 0xDD80831A2DB8F740L);
                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x31C1AED2));
                                                            int cfr_ignored_22 = Integer.rotateLeft(0xFB6D809 ^ n2, 4) + -343816110;
                                                            int cfr_ignored_23 = (int)(0xCD04763427D4EB4FL ^ (long)n2 ^ 0x1118831A2DB837D9L);
                                                            int cfr_ignored_24 = (int)(0xFCC72FF209315FCL ^ (long)n2 ^ 0x188E8D95D0DFB249L);
                                                            n3 = (int)((long)(n2 ^ 0xB5D8BD0) ^ 0xB60C249052624B6EL ^ 0xB60C249052624B6EL);
                                                            int cfr_ignored_25 = (int)(0x6EEC8D7259208960L ^ (long)n2 ^ 0xE7947EF2E9E77008L);
                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xEDB2305B));
                                                            n -= 4;
                                                            continue;
                                                        }
                                                        int cfr_ignored_26 = (Integer.rotateLeft(0xFDD9C1DD ^ n2, 18) - -1044637442) * -36060707;
                                                        int cfr_ignored_27 = (int)(0x3F6B6FE027D4EB4FL ^ (long)n2 ^ 0x22B0831A2DB9D307L);
                                                        try {
                                                            n -= 4;
                                                            if ((0x1910FFD7CFBB3679L ^ (long)n2 | 1L) == 0L) {
                                                                throw new ArithmeticException();
                                                            }
                                                            n3 = n2 ^ 0xEDB2305B;
                                                        }
                                                        catch (ArithmeticException arithmeticException) {
                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xEDB2305B));
                                                        }
                                                        continue;
                                                    }
                                                    int cfr_ignored_28 = Integer.rotateLeft(0xAB9D7C64 ^ n2, 8) - -865095849;
                                                    int cfr_ignored_29 = (int)(0xEECF006CD7615AFDL ^ (long)n2 ^ 0xFDA962714EDC704FL);
                                                    n3 = n2 ^ 0xEDB2305B ^ 0xBC62CF99 ^ 0xBC62CF99;
                                                    continue;
                                                }
                                                int cfr_ignored_30 = (Integer.rotateRight(0x431444D3 ^ n2, 11) + 600962248) * 1125401811;
                                                try {
                                                    n -= 5;
                                                    n3 = n2 ^ 0xEDB2305B ^ 0x80ED216F ^ 0x80ED216F;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    n3 = n2 ^ 0xEDB2305B;
                                                }
                                                n += 4;
                                                continue;
                                            }
                                            int cfr_ignored_31 = (Integer.rotateLeft(0x740BC95D ^ n2, 17) - 298516862) * 1946929501;
                                            int cfr_ignored_32 = (int)(0xB6B9676027D4EB4FL ^ (long)n2 ^ 0x33B0831A2DB8C0A3L);
                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xBBCCBC62));
                                            int cfr_ignored_33 = Integer.rotateRight(0xC9ACD8CB ^ n2, 12) + 1884020688;
                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xEDB2305B));
                                            int cfr_ignored_34 = (Integer.rotateRight(0xE67672B7 ^ n2, 15) - -323648668) * -428445001;
                                            n += 3;
                                            continue;
                                        }
                                        int cfr_ignored_35 = Integer.rotateLeft(0xC63B5965 ^ n2, 11) - 93155958;
                                        int cfr_ignored_36 = (int)(0x489F75827D4EB4FL ^ (long)n2 ^ 0x13C0831A2DB9A4C2L);
                                        n3 = (int)((long)(n2 ^ 0x104D845B) ^ 0xDA62931F5FAD0609L ^ 0xDA62931F5FAD0609L);
                                        int cfr_ignored_37 = Integer.rotateLeft(0xD1960164 ^ n2, 13) - 1703397975;
                                        n3 = (n2 ^ 0xEDB2305B) + -946487440 - -946487440;
                                        ++n;
                                        continue;
                                    }
                                    int cfr_ignored_38 = Integer.rotateRight(0xCC5164CF ^ n2, 12) - -1036463028;
                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xEDB2305B));
                                    int cfr_ignored_39 = Integer.rotateLeft(0x7000FF2C ^ n2, 17) - -1803778673;
                                    continue;
                                }
                                int cfr_ignored_40 = Integer.rotateRight(0x3786BAEF ^ n2, 9) - -1112653268;
                                n3 = n2 ^ 0xE82A47F2;
                                int cfr_ignored_41 = (Integer.rotateLeft(0xEBFEDC31 ^ n2, 16) + -1741010646) * -335619023;
                                int cfr_ignored_42 = (int)(0x294C720C27D4EB4FL ^ (long)n2 ^ 0x1968831A2DB9FF49L);
                                try {
                                    ++n;
                                    if ((0xEC9DBD0352F365BFL ^ (long)n2 | 1L) == 0L) {
                                        throw new IllegalArgumentException();
                                    }
                                    n3 = n2 ^ 0xEDB2305B;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    n3 = (int)((long)(n2 ^ 0xEDB2305B) ^ 0x8BAA3A383C5181F9L ^ 0x8BAA3A383C5181F9L);
                                }
                                continue;
                            }
                            int cfr_ignored_43 = Integer.rotateRight(0x7EFED067 ^ n2, 18) - 1698225076;
                            n3 = n2 ^ 0xAFACB4EE ^ 0xAC3D29C1 ^ 0xAC3D29C1;
                            int cfr_ignored_44 = Integer.rotateLeft(0x813EEC85 ^ n2, 3) - -1426308266;
                            int cfr_ignored_45 = (int)(0x438C42B827D4EB4FL ^ (long)n2 ^ 0x7800831A2DB92AC9L);
                            try {
                                n += 2;
                                n3 = n2 ^ 0xEDB2305B ^ 0x9427D3C1 ^ 0x9427D3C1;
                            }
                            catch (ArithmeticException arithmeticException) {
                                n3 = (int)((long)(n2 ^ 0xEDB2305B) ^ 0xF8EFC7583D2CB10CL ^ 0xF8EFC7583D2CB10CL);
                            }
                            n += 2;
                            continue;
                        }
                        int cfr_ignored_46 = Integer.rotateLeft(0xF0C52421 ^ n2, 17) + 742195002;
                        int cfr_ignored_47 = (int)(0x32778A1C27D4EB4FL ^ (long)n2 ^ 0xE948831A2DB9C93EL);
                        n3 = n2 ^ 0x373C8F6C ^ 0xA5F321FF ^ 0xA5F321FF;
                        int cfr_ignored_48 = (Integer.rotateLeft(0xE97FBD18 ^ n2, 16) + 1255507235) * -377504487;
                        try {
                            if ((0x2D4326D3CB46C32FL ^ (long)n2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n3 = n2 ^ 0xEDB2305B;
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = (n2 ^ 0xEDB2305B) + 105146005 - 105146005;
                        }
                        n += 4;
                        continue;
                    }
                    int cfr_ignored_49 = (Integer.rotateLeft(0x8B29D235 ^ n2, 4) - -563211354) * -1960193483;
                    int cfr_ignored_50 = (int)(0x499B7C0827D4EB4FL ^ (long)n2 ^ 0x560831A2DB93EE7L);
                    n3 = n2 ^ 0xF4E11DC2 ^ 0xD844B517 ^ 0xD844B517;
                    int cfr_ignored_51 = (Integer.rotateRight(0x3CA1CE3E ^ n2, 10) - 1542822077) * 1017237055;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xDA2D7DC7));
                    int cfr_ignored_52 = (Integer.rotateRight(0xB922C2D2 ^ n2, 10) + 1871918761) * -1188904237;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xEDB2305B));
                    continue;
                }
                int cfr_ignored_53 = (Integer.rotateLeft(0x8ECFF111 ^ n2, 4) + 1334562890) * -1898974959;
                int cfr_ignored_54 = (int)(0x4C7D5F2C27D4EB4FL ^ (long)n2 ^ 0x4328831A2DB9352BL);
                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x191C3530));
                int cfr_ignored_55 = (Integer.rotateLeft(0xF13A451 ^ n2, 4) + -675379958) * 252945489;
                int cfr_ignored_56 = (int)(0xCDA10A6C27D4EB4FL ^ (long)n2 ^ 0xE9A8831A2DB83693L);
                n3 = (n2 ^ 0x52345365) + -568101925 - -568101925;
                int cfr_ignored_57 = (Integer.rotateLeft(0xC14FDCB8 ^ n2, 11) + 1829329283) * -1051730759;
                n3 = n2 ^ 0xEDB2305B;
                n -= 5;
                continue;
            }
            int cfr_ignored_58 = (Integer.rotateRight(0x71C4EB93 ^ n2, 17) + -885643768) * 1908730771;
            n3 = (int)((long)(n2 ^ 0xEDB2305B) ^ 0xCC87C0D9A223FD6CL ^ 0xCC87C0D9A223FD6CL);
        }
    }

    private boolean zfw() {
        int n = trm.dkw(-149624904);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 6);
        int n2 = n ^ 0xADC2B126;
        if ((n2 ^ n) != -1379749594) {
            int cfr_ignored_0 = (Integer.rotateRight(0x5AD6569E ^ n, 14) - 72490077) * 1523996319;
        }
        return !this.snt.shzl();
    }

    private boolean dsm_3() {
        int n = trm.dkw(-886941454);
        int n2 = n ^ 0x7A660DA6;
        if ((n2 ^ n) != 2053508518) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xB1445554 ^ n, 9) - 2074342503) * -1320921771;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.snt.shzl();
    }

    private boolean aqt_2() {
        int n = trm.dkw(1065522327);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 24);
        int n2 = n ^ 0x34DA1449;
        if ((n2 ^ n) != 886707273) {
            int cfr_ignored_0 = (Integer.rotateRight(0xB5880DE ^ n, 4) - 1679112733) * 190349535;
        }
        return !this.snt.shzl();
    }

    private boolean thzgh() {
        int n;
        block1: {
            int n2 = trm.dkw(-792376722);
            int n3 = n2 ^ 0x5DF8A4B;
            if ((n3 ^ n2) != 98536011) {
                int cfr_ignored_0 = Integer.rotateLeft(0xD51AC025 ^ n2, 13) - -761601098;
                int cfr_ignored_1 = (int)(0x17A86E1827D4EB4FL ^ (long)n2 ^ 0x2140831A2DB98281L);
            }
            n = !this.snt.shzl() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x83C5;
        }
        return n != 0;
    }

    private boolean khyj() {
        try {
            int n = 367367870;
            n = Integer.rotateLeft(n * 1690062603, 24) ^ 0x498CF89A;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 29);
            int n2 = n ^ 0x679DE362;
            if ((n2 ^ n) != 1738400610) {
                int cfr_ignored_0 = (0x727875DC ^ n) + -1795339765;
            }
            if ((0xA1 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.snt.shzl();
    }

    private boolean sbgh_2() {
        int n;
        block1: {
            int n2 = 1775480555;
            n2 = Integer.rotateLeft(n2 * 1266590567, 5) ^ 0xBAB029C5;
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 29);
            int n3 = n2 ^ 0xC0B5825B;
            if ((n3 ^ n2) != -1061846437) {
                int cfr_ignored_0 = (0xA9662CB0 ^ n2) - -1230760171;
            }
            n = !this.dfdh.shzl() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0xE2EE;
        }
        return n != 0;
    }

    private boolean hba() {
        int n = 1542718487;
        n = Integer.rotateLeft(n * 1911012987, 27) ^ 0x3C92AE9D;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 10);
        int n2 = n ^ 0x64956904;
        if ((n2 ^ n) != 1687513348) {
            int cfr_ignored_0 = (0x3F616D13 ^ n) - 1000692787;
        }
        return !this.dfdh.shzl() || !this.zjl.shzl();
    }

    private boolean bsd_2() {
        int n = -659880997;
        n = Integer.rotateLeft(n * 1603151651, 23) ^ 0xA6DA4669;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 10);
        int n2 = n ^ 0xF1A381AD;
        if ((n2 ^ n) != -240942675) {
            int cfr_ignored_0 = (0x29088276 ^ n) - 1889825950;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.dfdh.shzl();
    }

    private boolean jad_3() {
        int n;
        block1: {
            int n2 = trm.dkw(461299878);
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 28);
            int n3 = n2 ^ 0xCE64F8E5;
            if ((n3 ^ n2) != -832243483) {
                int cfr_ignored_0 = Integer.rotateRight(0xD51A1843 ^ n2, 13) + -762933416;
            }
            n = !this.dfdh.shzl() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0xF919;
        }
        return n != 0;
    }

    private boolean tbt_4() {
        try {
            int n = 2052257218;
            n = Integer.rotateLeft(n * -1312029297, 3) ^ 0x43D874F6;
            int n2 = n ^ 0x44D431F8;
            if ((n2 ^ n) != 1154757112) {
                int cfr_ignored_0 = (0x3E86C43A ^ n) - -444378671;
            }
            if ((0x1F7 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.dfdh.shzl();
    }

    private boolean smj() {
        int n = -1997382880;
        n = Integer.rotateLeft(n * -940979635, 22) ^ 0x97A72F6D;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 15);
        int n2 = n ^ 0x55919E0F;
        if ((n2 ^ n) != 1435606543) {
            int cfr_ignored_0 = (0xDD63C52F ^ n) + -1298100143;
        }
        return !this.dfdh.shzl();
    }

    private boolean shydh() {
        int n = -782155911;
        n = Integer.rotateLeft(n * -691900371, 28) ^ 0x2AA54358;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x29957C3D;
        if ((n2 ^ n) != 697662525) {
            int cfr_ignored_0 = (0xF8F44344 ^ n) - -1116573370;
        }
        return !this.dfdh.shzl();
    }

    private boolean radh() {
        int n = -1855040575;
        n = Integer.rotateLeft(n * -2110978021, 9) ^ 0x623F7083;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x5807CBC3;
        if ((n2 ^ n) != 1476905923) {
            int cfr_ignored_0 = (0xC9699802 ^ n) + 1004637053;
        }
        return !this.dfdh.shzl();
    }

    private boolean ay() {
        int n = 1482986184;
        int n2 = (n = Integer.rotateLeft(n * 860061687, 9) ^ 0xA97D6F0D) ^ 0x9F055967;
        if ((n2 ^ n) != -1627039385) {
            int cfr_ignored_0 = (0xC761CBAF ^ n) + -100640945;
        }
        return !this.dfdh.shzl();
    }

    private boolean zab_3() {
        try {
            int n = 1341964037;
            n = Integer.rotateLeft(n * -34206047, 23) ^ 0xC0AEFEA8;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x7CA89243;
            if ((n2 ^ n) != 2091422275) {
                int cfr_ignored_0 = (0x33542D46 ^ n) - -207681225;
            }
            if ((0x27B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.dfdh.shzl();
    }

    private static String aas(String string, int n, int n2, int n3) {
        try {
            int n4 = 1098863482;
            n4 = Integer.rotateLeft(n4 * 551440205, 9) ^ 0xE55DF8CA;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            n4 = n2 ^ n4;
            int n5 = n4 ^ 0xE7ECE7A3;
            if ((n5 ^ n4) != -403904605) {
                int cfr_ignored_0 = (0xA693B4D9 ^ n4) + 1483455697;
            }
            if ((0x1CE & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xC0323DB4 ^ n2 ^ i * 2040015275 ^ shsl, 6) ^ htkh_2));
        }
        return new String(cArray);
    }

    private static boolean zzkh_3(ra ra2, String string) {
        block0: {
            int n = trm.dkw(-1919904288);
            ra ra3 = ra2;
            n = (ra3 != null ? System.identityHashCode(ra3) : 0) ^ n;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 28);
            int n2 = n ^ 0x4752BEDE;
            if ((n2 ^ n) == 1196605150) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xCAC22B3E ^ n, 12) - -1847534659) * -893244609;
        }
        return ra2.tzj_4(string);
    }

    private static kh_3 shdhsh(Moondlc moondlc) {
        block0: {
            int n = 940041471;
            n = Integer.rotateLeft(n * 1833054661, 25) ^ 0x2806E8BB;
            Moondlc moondlc2 = moondlc;
            n = (moondlc2 != null ? System.identityHashCode(moondlc2) : 0) ^ n;
            int n2 = n ^ 0xDA725D3A;
            if ((n2 ^ n) == -630039238) break block0;
            int cfr_ignored_0 = (0xE275B9C5 ^ n) - -1667277106;
        }
        return moondlc.getFriendManager();
    }

    private static boolean qt_2() {
        block0: {
            int n = -1140531063;
            int n2 = (n = Integer.rotateLeft(n * 1385722889, 20) ^ 0xB68A516E) ^ 0x18D0C4AD;
            if ((n2 ^ n) == 416335021) break block0;
            int cfr_ignored_0 = (0xA4D42424 ^ n) - 1863323012;
        }
        return yf.khdha_2();
    }

    private static class_4588 daw_2(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3) {
        block0: {
            int n = -1373110698;
            n = Integer.rotateLeft(n * -137944181, 12) ^ 0xAF9D106B;
            n = Float.floatToIntBits(f) ^ n;
            n = Integer.rotateLeft(Float.floatToIntBits(f3) ^ n, 3);
            int n2 = n ^ 0x5645359E;
            if ((n2 ^ n) == 1447376286) break block0;
            int cfr_ignored_0 = (0xF862CBC8 ^ n) - 247111143;
        }
        return class_2872.method_22918(matrix4f, f, f2, f3);
    }

    private static float jad_4(float f, float f2, float f3) {
        block0: {
            int n = 930963229;
            n = Integer.rotateLeft(n * -1145968563, 7) ^ 0xD548F806;
            n = Integer.rotateRight(Float.floatToIntBits(f3) ^ n, 3);
            int n2 = n ^ 0xE52222B8;
            if ((n2 ^ n) == -450747720) break block0;
            int cfr_ignored_0 = (0xD25F7DA5 ^ n) - -626356150;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static String[] swt(String string) {
        block0: {
            int n = trm.dkw(-1107686687);
            int n2 = n ^ 0x254A74E9;
            if ((n2 ^ n) == 625636585) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x98B07E08 ^ n, 6) + -2118327757;
        }
        return string.split("\u0001\u001c", -1);
    }

    private static CallSite sdn_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -75377652;
            n3 = Integer.rotateLeft(n3 * -1093873293, 19) ^ 0x8AA92736;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 12);
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x85BA2E6F;
            if ((n4 ^ n3) != -2051395985) {
                int cfr_ignored_0 = (0x7E3BFA63 ^ n3) + -1051147638;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ kl ^ string.hashCode() ^ n2 + hqz ^ i * -884528039 ^ kl, 8) ^ hqz));
            }
            String[] stringArray = ra.swt(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] w5m3sbm2fw7w(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite bk8c5ibp5j(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ asebydi ^ string.hashCode() ^ n2 + ptx7snqie ^ i * -1311482305 ^ asebydi, 26) ^ ptx7snqie));
            }
            String[] stringArray = ra.w5m3sbm2fw7w(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

