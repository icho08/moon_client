/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1511
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1713
 *  net.minecraft.class_1735
 *  net.minecraft.class_1747
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2824
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 *  net.minecraft.class_286
 *  net.minecraft.class_2868
 *  net.minecraft.class_287
 *  net.minecraft.class_2885
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_636
 *  net.minecraft.class_7439
 *  net.minecraft.class_746
 *  net.minecraft.class_7827
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
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2828;
import net.minecraft.class_2848;
import net.minecraft.class_286;
import net.minecraft.class_2868;
import net.minecraft.class_287;
import net.minecraft.class_2885;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_636;
import net.minecraft.class_7439;
import net.minecraft.class_746;
import net.minecraft.class_7827;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bbd_2;
import us.m0vy.moondlc.m0vyguard.bt;
import us.m0vy.moondlc.m0vyguard.bkhz;
import us.m0vy.moondlc.m0vyguard.bzkh;
import us.m0vy.moondlc.m0vyguard.btj_2;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bghdh;
import us.m0vy.moondlc.m0vyguard.bfn;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bqn;
import us.m0vy.moondlc.m0vyguard.bksh;
import us.m0vy.moondlc.m0vyguard.bmm;
import us.m0vy.moondlc.m0vyguard.bnsh;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.byl;
import us.m0vy.moondlc.m0vyguard.tab;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.thdh;
import us.m0vy.moondlc.m0vyguard.jth_3;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.khs_2;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.qk;
import us.m0vy.moondlc.m0vyguard.kf;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public abstract class bda_4
extends bnq {
    public final khd thfd_2 = new khd(this, "Timing");
    public final fy jkh_2 = new fy(this.thfd_2, "Vanilla");
    public final fy hdhr = new fy(this.thfd_2, "Instant");
    public final tay rzr_2 = new tay(this, "Blocks Per Action").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(1429876833 - 337260641)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(1361759029 - 279628597));
    public final tay brq = new tay((hy)this, "Delay Per Action", this::sf).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(-667042358 - -1768047158)).rkh_3(1.0f).ssd_5(0.0f);
    public final badh_2 sad_2 = new badh_2(this, "Client Look").bts(true);
    public final khd sry = new khd(this, "Rotatio".concat("n Mode"));
    public final fy ddhs_2 = new fy(this.sry, "Grim Silent");
    public final fy tzt_3 = new fy(this.sry, "Packet");
    public final fy dhsht = new fy(this.sry, "Custom");
    public final fy skh_2 = new fy(this.sry, "None");
    public final khd dghsh = new khd((hy)this, "Custom Rotation Style", this::haa_2);
    public final fy sbsh_2 = new fy(this.dghsh, "Silent");
    public final fy tsq = new fy(this.dghsh, "Packet");
    public final khd bssh_2 = new khd((hy)this, "Custom Move Correction", this::tdn);
    public final fy wz = new fy(this.bssh_2, "Silent");
    public final fy dja = new fy(this.bssh_2, "Direct");
    public final fy shghy = new fy(this.bssh_2, "None");
    public final tay tshd = new tay((hy)this, "Custom Ya".concat("w Speed"), this::thqj).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(153727679 - -973753665)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x90B062E9 ^ 0x90B27B49, 13)));
    public final tay khyw = new tay((hy)this, "Custom Pitch Speed", this::jmsh).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(-1190255677 - 1977230275)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(1055257680 + 72223664));
    public final tay shsq = new tay((hy)this, "Custom Y".concat("aw Random"), this::zyh).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(524895253) ^ 0xE98292F8)).rkh_3(Float.intBitsToFloat(Integer.reverse(-1343710208) ^ 0x3DF5DB38)).ssd_5(0.0f);
    public final tay khth_5 = new tay((hy)this, "Custom Pitch Random", this::shbf).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1768082535) ^ 0xD86CB969)).rkh_3(Float.intBitsToFloat(580907468 + 455924481)).ssd_5(0.0f);
    public final khd dthb = new khd((hy)this, "Custom Jit".concat("ter Mode"), this::ant);
    public final fy ttf_2 = new fy(this.dthb, "None");
    public final fy shhl = new fy(this.dthb, "Random");
    public final fy khds_2 = new fy(this.dthb, "Sine Wave");
    public final fy dwa = new fy(this.dthb, "Noise");
    public final tay hdhs_2 = new tay((hy)this, "Custom Jitter Freq", this::zz).shth_7(Float.intBitsToFloat(Integer.reverse(-278422277) ^ 0xE2F52A3A)).dhbs_2(Float.intBitsToFloat(0x1F0B55A3 ^ 0x5E2B55A3)).rkh_3(Float.intBitsToFloat(1915294566 - 878462617)).ssd_5(1.0f);
    public final tay zn = new tay((hy)this, "Custom Smoothness", this::khshsh).shth_7(Float.intBitsToFloat(-1877776863 + -1388747092)).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(1856828259 + -828384918)).ssd_5(1.0f);
    public final tay hka_2 = new tay((hy)this, "Custom Ac".concat("celeration"), this::hys).shth_7(Float.intBitsToFloat(-2045982546 - 1220541409)).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(-1052441259 - -2080884600)).ssd_5(1.0f);
    public final tay zsz_4 = new tay((hy)this, "Custom Return Speed", this::dtf_3).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(1878433501 + -750952157)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(0xF74337D5 ^ 0xB47737D5));
    public final tay tzf = new tay((hy)this, "Custom Min Pitch", this::adhs).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x5E6F828F ^ 0x5E77D40F, 11))).dhbs_2(Float.intBitsToFloat(-1386065910 + -1789808650)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(-1135703070 - -107312158));
    public final tay thagh = new tay((hy)this, "Custom M".concat("ax Pitch"), this::zthw_2).shth_7(Float.intBitsToFloat(-1335741218 - -307350306)).dhbs_2(Float.intBitsToFloat(-188962810 - -1308055546)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(0x9EBF8996 ^ 0xDC0B8996));
    public final khd skhm_2 = new khd(this, "Place Mode");
    public final fy tys_2 = new fy(this.skhm_2, "Packet");
    public final fy jam = new fy(this.skhm_2, "Normal");
    public final khd zjb = new khd(this, "Interact Mode");
    public final fy hjs_2 = new fy(this.zjb, "Grim");
    public final fy dbb = new fy(this.zjb, "Strict");
    public final fy hwh = new fy(this.zjb, "Vanilla");
    public final fy dqb = new fy(this.zjb, "Airplace");
    public final khd ddhz = new khd(this, "Switch Mode");
    public final fy shzkh_2 = new fy(this.ddhz, "Silent");
    public final fy zmsh = new fy(this.ddhz, "Normal");
    public final fy dhqj = new fy(this.ddhz, "Alternative");
    public final fy tdsh_2 = new fy(this.ddhz, "None");
    public final tay dhmd = new tay(this, "Range").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(-11864671) ^ 0xC56F52FF)).rkh_3(Float.intBitsToFloat(0x7EFB0720 ^ 0x4337CBED)).ssd_5(Float.intBitsToFloat(-1634088247 + -1578538902));
    public final tay zghs_2 = new tay(this, "Wall Range").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(-759519817) ^ 0xAD655D4B)).rkh_3(Float.intBitsToFloat(-667568335 + 1704400284)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xDF6C7401 ^ 0xEC5E7032, 13)));
    public final badh_2 zsth_2 = new badh_2(this, "Thro".concat("ugh Walls")).bts(true);
    public final badh_2 hgha = new badh_2(this, "Alternati".concat("ve Block")).bts(false);
    public final byl tkhy = new byl(this, "Alterna".concat("tive Blocks"), this::mf).zz_2(class_2246.field_10161);
    public final bbd_2 skha_4 = new bbd_2(this, "Pause");
    public final s_3 drf = new s_3(this.skha_4, "Mining").thst();
    public final s_3 zzw = new s_3(this.skha_4, "Eating").thst();
    public final s_3 jra = new s_3(this.skha_4, "Inventory").thst();
    public final s_3 tfdh = new s_3(this.skha_4, "On Flag").thst();
    public final khd zkhsh = new khd(this, "Render Mode");
    public final fy khth_2 = new fy(this.zkhsh, "Both");
    public final fy zshw = new fy(this.zkhsh, "Outline");
    public final fy zmk = new fy(this.zkhsh, "Fill");
    public final fy khlkh = new fy(this.zkhsh, "None");
    public final khd sal_3 = new khd(this, "Render An".concat("imation"));
    public final fy shrm = new fy(this.sal_3, "Fade");
    public final fy dhlw = new fy(this.sal_3, "Slide");
    public final fy ssj_2 = new fy(this.sal_3, "None");
    public final badh_2 ryn = new badh_2(this, "Sync Colors").bts(false);
    public final bzw_2 dtth_2 = new bzw_2(this, "Fill Color").dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-1176054124) ^ 0x6A14679D), Float.intBitsToFloat(-382687438 + 1515083982), Float.intBitsToFloat(Integer.reverse(1623102575) ^ 0xB5567D06), Float.intBitsToFloat(0x604B4D86 ^ 0x23344D86)));
    public final bzw_2 khak = new bzw_2(this, "Outline Color").dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-695670772) ^ 0x7368116B), Float.intBitsToFloat(Integer.reverse(-1449399747) ^ 0xFF28D995), Float.intBitsToFloat(Integer.rotateLeft(0xE8D1A22F ^ 0x28D1B2F0, 18)), Float.intBitsToFloat(Integer.reverse(593509638) ^ 0x23C306C4)));
    protected long khthj = 0L;
    protected final List zsm_2 = new CopyOnWriteArrayList();
    protected float hbb = 0.0f;
    protected float shdhth = 0.0f;
    public static int say_2;
    private final bql<bqn> thtm = bda_4::dysh_2;
    protected int ssm_2 = 0;
    protected long rtht = 0L;
    protected boolean thds_4 = false;
    private final bql<bksh> ddd_4 = this::sns_4;
    private final bql<shw_3> dhjz_2 = this::ztn;
    private static final int sda_5 = -1229128525;
    private static final int zzl_2 = 233879412;
    private static final int zda_2 = -2063663769;
    private static final int khghh = 2109455595;
    private static final int dxaqjx4ks = -1974372147;
    private static final int phiplrptnh = -332683996;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int au5ngphd04xas;

    public static void hjz() {
        int n = 584879187;
        int n2 = (n = Integer.rotateLeft(n * 2134210051, 28) ^ 0x5A037C8A) ^ 0x95F41394;
        if ((n2 ^ n) != -1779166316) {
            int cfr_ignored_0 = (0xB7289FC7 ^ n) + 1202407424;
        }
        class_310 class_3102 = bda_4.tar_3();
        if (class_3102.field_1724 == null || class_3102.field_1761 == null) {
            return;
        }
        if (say_2 != -1) {
            int n3 = say_2;
            say_2 = -1;
            bda_4.sfgh_2(n3);
        }
    }

    @Override
    public void nt() {
        int n = -596090836;
        n = Integer.rotateLeft(n * -1817452993, 11) ^ 0x412D66DF;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 9);
        int n2 = n ^ 0xDD537F62;
        if ((n2 ^ n) != -581730462) {
            int cfr_ignored_0 = (0x12B1F4E ^ n) - 238499064;
        }
        this.ssm_2 = 0;
        this.thds_4 = false;
        this.khthj = 0L;
        this.hbb = 0.0f;
        this.shdhth = 0.0f;
        super.nt();
    }

    @Override
    public void nc() {
        int n = bkhz.hta_3(-1873629581);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xE42CAC94;
        if ((n2 ^ n) != -466834284) {
            int cfr_ignored_0 = Integer.rotateRight(0x747E02E7 ^ n, 17) - 530577716;
        }
        bda_4.hjz();
        this.ssm_2 = 0;
        this.thds_4 = false;
        this.hbb = 0.0f;
        this.shdhth = 0.0f;
        super.nc();
    }

    protected boolean tght_2() {
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null || class_3102.field_1687 == null) {
            return true;
        }
        if (this.tfdh.alh() && this.thds_4) {
            if (System.currentTimeMillis() - this.rtht > 5000L) {
                this.thds_4 = false;
                this.ssm_2 = 0;
                Moondlc.getInstance().getNotificationManager().khdhz_2(qk.zhh_2, "Resuming placement after flag cooldown.");
            } else {
                return true;
            }
        }
        if (this.jra.alh() && class_3102.field_1755 != null) {
            return true;
        }
        if (this.zzw.alh() && kf.bsy_2()) {
            return true;
        }
        return this.drf.alh() && class_3102.field_1761 != null && class_3102.field_1761.method_2923();
    }

    protected boolean zqa_3(class_2338 class_23382) {
        int n = 380897115;
        n = Integer.rotateLeft(n * -1613794171, 17) ^ 0x6301F233;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 3);
        class_2338 class_23383 = class_23382;
        n = Integer.rotateRight((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 11);
        int n2 = n ^ 0x837E2E9B;
        if ((n2 ^ n) != -2088882533) {
            int cfr_ignored_0 = (0x95CA29C0 ^ n) - 859913317;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1687 == null) {
            int n3 = 0;
            if (yf.tdhth_2() == 0) {
                n3 = n3 ^ 0x7133;
            }
            return n3 != 0;
        }
        class_238 class_2383 = new class_238(class_23382);
        List list = class_3102.field_1687.method_8390(class_1309.class, class_2383, bda_4::taa_2);
        return !list.isEmpty();
    }

    private class_1511 shzb_2(class_2338 class_23382) {
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1687 == null) {
            return null;
        }
        class_238 class_2383 = new class_238(class_23382);
        List list = class_3102.field_1687.method_8390(class_1511.class, class_2383, bda_4::jan);
        return list.isEmpty() ? null : (class_1511)list.get(0);
    }

    protected boolean dhfa(List list, List list2) {
        return this.sht_3(list, list2, true);
    }

    private void zmh_3() {
        int n = -169307727;
        int n2 = (n = Integer.rotateLeft(n * -1061185675, 25) ^ 0x4B28F10F) ^ 0xD2588299;
        if ((n2 ^ n) != -765951335) {
            int cfr_ignored_0 = (0x27B01328 ^ n) + -1820416200;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null) {
            return;
        }
        class_3102.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2830(class_3102.field_1724.method_23317(), class_3102.field_1724.method_23318(), bda_4.tbn_2(class_3102.field_1724), bda_4.zhw(class_3102.field_1724), class_3102.field_1724.method_36455(), class_3102.field_1724.method_24828(), class_3102.field_1724.field_5976));
    }

    protected boolean sht_3(List list, List list2, boolean bl) {
        boolean bl2;
        int n;
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null || class_3102.field_1687 == null) {
            return false;
        }
        if (list.isEmpty() || list2.isEmpty() || this.tght_2()) {
            return false;
        }
        long l = class_3102.field_1687.method_8510();
        if (l < this.khthj) {
            this.khthj = 0L;
        }
        if (this.thfd_2.dhbn("Vanilla") && (float)(l - this.khthj) < this.brq.thw_5()) {
            return false;
        }
        int n2 = n = class_3102.field_1724.method_31548().field_7545;
        int n3 = 0;
        boolean bl3 = false;
        ArrayList arrayList = new ArrayList(list);
        ArrayList<class_2338> arrayList2 = new ArrayList<class_2338>();
        do {
            bl2 = false;
            ArrayList<class_2338> arrayList3 = new ArrayList<class_2338>();
            for (class_2338 class_23382 : arrayList) {
                Object object;
                jth_3 jth2;
                bzkh bzkh2;
                khs_2 khs2;
                int n4;
                List list3;
                if ((float)n3 >= this.rzr_2.thw_5() || bl && this.sry.dhbn("Grim Silent") && !this.thfd_2.dhbn("Instant") && n3 >= 1) break;
                if (!class_3102.field_1687.method_8320(class_23382).method_45474()) {
                    arrayList3.add(class_23382);
                    continue;
                }
                class_1511 class_15112 = this.shzb_2(class_23382);
                if (class_15112 != null) {
                    list3 = class_2824.method_34206((class_1297)class_15112, (boolean)class_3102.field_1724.method_5715());
                    class_3102.field_1724.field_3944.method_52787((class_2596)list3);
                    class_3102.field_1724.method_6104(class_1268.field_5808);
                    continue;
                }
                list3 = list2;
                if (this.hgha.shzl() && !bt.thagh(class_23382)) {
                    list3 = this.tkhy.tzs_8();
                }
                if ((n4 = this.szj_4(list3)) == -1) continue;
                if (n2 != n4 && !this.ddhz.dhbn("None")) {
                    if (this.ddhz.dhbn("Silent")) {
                        bfn.shkz(n4);
                        say_2 = n;
                        bl3 = true;
                    } else if (this.ddhz.dhbn("Normal")) {
                        bfn.awy(n4);
                    } else {
                        this.aah_3(n4, list3);
                        bl3 = true;
                    }
                    n2 = n4;
                }
                if ((khs2 = bt.md_2(class_23382, n4, bzkh2 = this.jnl(), jth2 = jth_3.khdt, this.dhmd.thw_5(), this.dhmd.thw_5(), arrayList2, this.zsth_2.shzl())) == null) continue;
                if (bl) {
                    if (this.sry.dhbn("Grim Silent")) {
                        btj_2.sdd_3(khs2.yaw(), khs2.pitch());
                        if (this.sad_2.shzl()) {
                            lb lb2 = new lb(khs2.yaw(), khs2.pitch());
                            Moondlc.getInstance().getRotationHandler().dzj_4(lb2, bnsh.stb_3, 180.0f, 180.0f, 180.0f, bmm.zst_4);
                        }
                    } else if (this.sry.dhbn("Packet")) {
                        if (this.sad_2.shzl()) {
                            lb lb3 = new lb(khs2.yaw(), khs2.pitch());
                            Moondlc.getInstance().getRotationHandler().dzj_4(lb3, bnsh.stb_3, 180.0f, 180.0f, 180.0f, bmm.zst_4);
                        }
                        this.tfs_4(khs2.yaw(), khs2.pitch());
                    } else if (this.sry.dhbn("Custom")) {
                        float f = khs2.yaw();
                        float f2 = khs2.pitch();
                        if (class_3102.field_1724 != null) {
                            float f3 = class_3102.field_1724.method_36454();
                            float f4 = class_3102.field_1724.method_36455();
                            float f5 = bghdh.ttb_2(f3, f);
                            float f6 = f2 - f4;
                            float f7 = this.tshd.thw_5();
                            float f8 = this.khyw.thw_5();
                            float f9 = this.hka_2.thw_5();
                            this.hbb = Math.min(f7, this.hbb + f7 * f9);
                            this.shdhth = Math.min(f8, this.shdhth + f8 * f9);
                            if (Math.abs(f5) < 1.0f) {
                                this.hbb = 0.0f;
                            }
                            if (Math.abs(f6) < 1.0f) {
                                this.shdhth = 0.0f;
                            }
                            float f10 = Math.max(-this.hbb, Math.min(this.hbb, f5));
                            float f11 = Math.max(-this.shdhth, Math.min(this.shdhth, f6));
                            float f12 = this.zn.thw_5();
                            f10 *= f12;
                            f11 *= f12;
                            float f13 = 0.0f;
                            float f14 = 0.0f;
                            float f15 = this.shsq.thw_5();
                            float f16 = this.khth_5.thw_5();
                            if (this.dthb.dhbn("Random")) {
                                if (f15 > 0.0f) {
                                    f13 = (float)ThreadLocalRandom.current().nextDouble(-f15, f15);
                                }
                                if (f16 > 0.0f) {
                                    f14 = (float)ThreadLocalRandom.current().nextDouble(-f16, f16);
                                }
                            } else if (this.dthb.dhbn("Sine Wave")) {
                                var39_46 = (float)(System.currentTimeMillis() % 100000L) * 0.001f * this.hdhs_2.thw_5();
                                f13 = (float)Math.sin(var39_46) * f15;
                                f14 = (float)Math.cos(var39_46 * 1.2f) * f16;
                            } else if (this.dthb.dhbn("Noise")) {
                                var39_46 = (float)(System.currentTimeMillis() % 100000L) * 0.001f * this.hdhs_2.thw_5();
                                f13 = (float)(Math.sin(var39_46) * Math.sin(var39_46 * 1.567f) + Math.cos(var39_46 * 0.345f)) * 0.5f * f15;
                                f14 = (float)(Math.cos(var39_46 * 0.987f) * Math.sin(var39_46 * 1.234f) + Math.sin(var39_46 * 0.456f)) * 0.5f * f16;
                            }
                            f = f3 + (f10 += f13);
                            f2 = Math.max(this.tzf.thw_5(), Math.min(this.thagh.thw_5(), f4 + (f11 += f14)));
                        }
                        object = bnsh.stb_3;
                        if (this.bssh_2.dhbn("Direct")) {
                            object = bnsh.ghn;
                        } else if (this.bssh_2.dhbn("None")) {
                            object = bnsh.sta;
                        }
                        if (this.dghsh.dhbn("Silent")) {
                            btj_2.sdd_3(f, f2);
                            if (this.sad_2.shzl()) {
                                lb lb4 = new lb(f, f2);
                                Moondlc.getInstance().getRotationHandler().dzj_4(lb4, (bnsh)((Object)object), this.tshd.thw_5(), this.khyw.thw_5(), this.zsz_4.thw_5(), bmm.zst_4);
                            }
                        } else if (this.dghsh.dhbn("Packet")) {
                            if (this.sad_2.shzl()) {
                                lb lb5 = new lb(f, f2);
                                Moondlc.getInstance().getRotationHandler().dzj_4(lb5, (bnsh)((Object)object), this.tshd.thw_5(), this.khyw.thw_5(), this.zsz_4.thw_5(), bmm.zst_4);
                            }
                            this.tfs_4(f, f2);
                        }
                    }
                }
                this.thjq(khs2.hitResult());
                ++n3;
                bl2 = true;
                arrayList2.add(class_23382);
                arrayList3.add(class_23382);
                if (bl && (this.sry.dhbn("Packet") || this.sry.dhbn("Custom") && this.dghsh.dhbn("Packet"))) {
                    this.tfs_4(class_3102.field_1724.method_36454(), class_3102.field_1724.method_36455());
                }
                if (this.zkhsh.dhbn("None")) continue;
                boolean bl4 = this.zkhsh.dhbn("Both") || this.zkhsh.dhbn("Fill");
                boolean bl5 = this.zkhsh.dhbn("Both") || this.zkhsh.dhbn("Outline");
                object = bl4 ? this.dtth_2.sdsh_4() : new byq(0.0f, 0.0f, 0.0f, 0.0f);
                byq byq2 = bl5 ? this.khak.sdsh_4() : new byq(0.0f, 0.0f, 0.0f, 0.0f);
                this.zsm_2.add(new tab(class_23382, (byq)object, byq2, !this.sal_3.dhbn("None")));
            }
            arrayList.removeAll(arrayList3);
        } while (!((float)n3 >= this.rzr_2.thw_5() || bl && this.sry.dhbn("Grim Silent") && !this.thfd_2.dhbn("Instant") && n3 >= 1 || !bl2) && !arrayList.isEmpty());
        if (bl3 && n2 != n && !this.ddhz.dhbn("Silent")) {
            this.hd_4(n);
        }
        if (n3 > 0) {
            this.khthj = l;
            return true;
        }
        return false;
    }

    protected int szj_4(List list) {
        try {
            int n = 602069758;
            n = Integer.rotateLeft(n * -1813293025, 3) ^ 0x3ED3C20D;
            int n2 = n ^ 0x753C5463;
            if ((n2 ^ n) != 1966888035) {
                int cfr_ignored_0 = (0x56DE8E9D ^ n) - -380229137;
            }
            if ((0x382 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bda_4.sfr_2()) {
            throw null;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null) {
            return -1;
        }
        for (int i = 0; i <= (Integer.reverse(-1795172990) ^ 0x41ABFF21); ++i) {
            class_1747 class_17472;
            class_1792 class_17922;
            class_1799 class_17992 = bda_4.jrkh(class_3102.field_1724.method_31548(), i);
            if (class_17992.method_7960() || !((class_17922 = bda_4.zyth_2(class_17992)) instanceof class_1747) || !list.contains(bda_4.jzj_2(class_17472 = (class_1747)class_17922))) continue;
            return i;
        }
        return -1;
    }

    private int zrn_2(List list) {
        int n = bkhz.hta_3(554236688);
        List list2 = list;
        n = (list2 != null ? System.identityHashCode(list2) : 0) ^ n;
        int n2 = n ^ 0x842C13EA;
        if ((n2 ^ n) != -2077486102) {
            int cfr_ignored_0 = (Integer.rotateRight(0xA524E8FA ^ n, 7) + 64345473) * -1524307717;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null) {
            int n3 = -1;
            if (yf.tdhth_2() == 0) {
                n3 = n3 ^ 0xA9D9;
            }
            return n3;
        }
        for (int i = 0xCEFD6586 ^ 0xCEFD658F; i <= 600681699 - 600681655; ++i) {
            class_1747 class_17472;
            class_1792 class_17922;
            class_1799 class_17992 = bda_4.rthth(class_3102.field_1724.field_7512.method_7611(i));
            if (class_17992.method_7960() || !((class_17922 = class_17992.method_7909()) instanceof class_1747) || !list.contains((class_17472 = (class_1747)class_17922).method_7711())) continue;
            return i;
        }
        return -1;
    }

    private void aah_3(int n, List list) {
        try {
            int n2 = -1626799844;
            n2 = Integer.rotateLeft(n2 * -1689202881, 6) ^ 0xF71A360C;
            n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 14);
            n2 = Integer.rotateRight(n ^ n2, 12);
            int n3 = n2 ^ 0x67FB2EA0;
            if ((n3 ^ n2) != 1744514720) {
                int cfr_ignored_0 = (0xF8F22FBC ^ n2) + 1477296921;
            }
            if ((0x6A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null || class_3102.field_1761 == null) {
            return;
        }
        if (this.ddhz.dhbn("Alternative")) {
            int n4 = this.zrn_2(list);
            if (n4 != -1) {
                bda_4.hghf(class_3102.field_1761, class_3102.field_1724.field_7512.field_7763, n4, 0, class_1713.field_7791, (class_1657)class_3102.field_1724);
                bda_4.zza_2((class_746)class_3102.field_1724).field_7545 = 0;
            }
        } else {
            class_3102.field_1724.method_31548().field_7545 = n;
            class_3102.field_1724.field_3944.method_52787((class_2596)new class_2868(n));
        }
    }

    private void hd_4(int n) {
        int n2 = -1146621604;
        int n3 = (n2 = Integer.rotateLeft(n2 * 1755943189, 22) ^ 0x3F757ED0) ^ 0x8DD7E8C2;
        if ((n3 ^ n2) != -1915230014) {
            int cfr_ignored_0 = (0x3670199E ^ n2) + 1062080836;
        }
        if (!bda_4.shzm()) {
            yf.athz_2();
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null || class_3102.field_1761 == null) {
            return;
        }
        if (bda_4.sghf(this.ddhz, "Alternative")) {
            class_3102.field_1761.method_2906(class_3102.field_1724.field_7512.field_7763, n, 0, class_1713.field_7791, (class_1657)class_3102.field_1724);
        } else {
            bda_4.zat_8((class_746)class_3102.field_1724).field_7545 = n;
            class_3102.field_1724.field_3944.method_52787((class_2596)new class_2868(n));
        }
    }

    private void tfs_4(float f, float f2) {
        int n = bkhz.hta_3(-270868119);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 3);
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0xB068B289;
        if ((n2 ^ n) != -1335315831) {
            int cfr_ignored_0 = Integer.rotateLeft(0x5FB253E0 ^ n, 14) + -1695168677;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null) {
            return;
        }
        class_3102.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2830(class_3102.field_1724.method_23317(), class_3102.field_1724.method_23318(), class_3102.field_1724.method_23321(), f, f2, bda_4.shbh_2(class_3102.field_1724), class_3102.field_1724.field_5976));
    }

    private void thjq(class_3965 class_39652) {
        boolean bl;
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null || class_3102.field_1761 == null) {
            return;
        }
        class_2248 class_22482 = class_3102.field_1687.method_8320(class_39652.method_17777()).method_26204();
        boolean bl2 = bl = btj_2.ghzm(class_22482) && !class_3102.field_1724.method_5715();
        if (bl) {
            class_3102.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)class_3102.field_1724, class_2848.class_2849.field_12979));
        }
        if (this.skhm_2.dhbn("Packet") || this.ddhz.dhbn("Silent")) {
            thdh.adhq(arg_0 -> bda_4.zdhd_3(class_39652, arg_0));
        } else {
            class_3102.field_1761.method_2896(class_3102.field_1724, class_1268.field_5808, class_39652);
        }
        class_3102.field_1724.method_6104(class_1268.field_5808);
        if (bl) {
            class_3102.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)class_3102.field_1724, class_2848.class_2849.field_12984));
        }
    }

    /*
     * Unable to fully structure code
     */
    protected bzkh jnl() {
        var1_1 = null;
        var4_2 = 0;
        var2_3 = bkhz.hta_3(905210262);
        var2_3 = Integer.rotateLeft(System.identityHashCode(this) ^ var2_3, 6);
        var3_4 = Integer.reverse(Integer.reverse(2973802 + var2_3));
        while (true) {
            block58: {
                block70: {
                    block62: {
                        block73: {
                            block69: {
                                block63: {
                                    block64: {
                                        block61: {
                                            block59: {
                                                block68: {
                                                    block56: {
                                                        block57: {
                                                            block71: {
                                                                block60: {
                                                                    block54: {
                                                                        block55: {
                                                                            block65: {
                                                                                block72: {
                                                                                    block67: {
                                                                                        block66: {
                                                                                            block74: {
                                                                                                var4_2 = var3_4 - var2_3;
                                                                                                switch (var4_2 & 15) {
                                                                                                    case 0: {
                                                                                                        if (var4_2 != 267312416) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block54;
                                                                                                    }
                                                                                                    case 1: {
                                                                                                        if (var4_2 != 403312961) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block55;
                                                                                                    }
                                                                                                    case 2: {
                                                                                                        if (var4_2 == -788940350) break block56;
                                                                                                        if (var4_2 == 212745442) break block57;
                                                                                                        if (var4_2 == -1967373310) break block58;
                                                                                                        if (var4_2 != -610115070) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block59;
                                                                                                    }
                                                                                                    case 3: {
                                                                                                        if (var4_2 == -1439657613) break block60;
                                                                                                        if (var4_2 != 271525939) {
                                                                                                            (Integer.rotateLeft(-1435146319 ^ var2_3, 8) + -1466618454) * -1435146319;
                                                                                                            (int)(7550224904110795599L ^ (long)var2_3 ^ 7955752890209500254L);
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block61;
                                                                                                    }
                                                                                                    case 5: {
                                                                                                        if (var4_2 == -721018651) break block62;
                                                                                                        if (var4_2 != -671935467) {
                                                                                                            (Integer.rotateLeft(-637115339 ^ var2_3, 14) - 1797505446) * -637115339;
                                                                                                            (int)(1780269889095002959L ^ (long)var2_3 ^ 7593213120206183608L);
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block63;
                                                                                                    }
                                                                                                    case 6: {
                                                                                                        if (var4_2 != -872383626) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block64;
                                                                                                    }
                                                                                                    case 7: {
                                                                                                        if (var4_2 == -1190223993) break;
                                                                                                        if (var4_2 != -1419920009) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block65;
                                                                                                    }
                                                                                                    case 10: {
                                                                                                        if (var4_2 != 2973802) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block66;
                                                                                                    }
                                                                                                    case 11: {
                                                                                                        if (var4_2 == -2066538325) break block67;
                                                                                                        if (var4_2 != 1024617579) {
                                                                                                            (Integer.rotateLeft(-962319748 ^ var2_3, 11) - 306103359) * -962319747;
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block68;
                                                                                                    }
                                                                                                    case 12: {
                                                                                                        if (var4_2 == 1632156652) break block69;
                                                                                                        if (var4_2 != 442275324) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block70;
                                                                                                    }
                                                                                                    case 13: {
                                                                                                        if (var4_2 != -549605363) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block71;
                                                                                                    }
                                                                                                    case 14: {
                                                                                                        if (var4_2 != 3315614) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block72;
                                                                                                    }
                                                                                                    case 15: {
                                                                                                        if (var4_2 == 528277199) break block73;
                                                                                                        if (var4_2 != 732406367) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block74;
                                                                                                    }
                                                                                                }
                                                                                                Integer.rotateLeft(-1384034328 ^ var2_3, 8) + 117853267;
                                                                                                var1_1 = bzkh.szn;
                                                                                                (int)(-1407155000069683762L ^ (long)var2_3 ^ 8252834699013682464L);
                                                                                                var3_4 = -569404826 + var2_3 + -492560279 - -492560279;
                                                                                                (int)(-5470539904625061608L ^ (long)var2_3 ^ -8894201614331099656L);
                                                                                                var3_4 = Integer.reverse(Integer.reverse(-1967373310 + var2_3));
                                                                                                var4_2 -= 4;
                                                                                                continue;
                                                                                            }
                                                                                            (Integer.rotateRight(-2040334145 ^ var2_3, 3) - 1247395420) * -2040334145;
                                                                                            var1_1 = bzkh.szn;
                                                                                            var3_4 = (int)((long)(-1967373310 + var2_3) ^ -1063798092102030828L ^ -1063798092102030828L);
                                                                                            continue;
                                                                                        }
                                                                                        (Integer.rotateLeft(-1213734255 ^ var2_3, 9) + 1102188234) * -1213734255;
                                                                                        (int)(8436733779234843471L ^ (long)var2_3 ^ 7217162551320725499L);
                                                                                        if (bda_4.zghr_2(this.zjb, "Grim")) {
                                                                                            var3_4 = -133803401 + var2_3;
                                                                                            Integer.rotateRight(382844334 ^ var2_3, 5) - -943483059;
                                                                                            var3_4 = (int)((long)(267312416 + var2_3) ^ 8325331153623255511L ^ 8325331153623255511L);
                                                                                            continue;
                                                                                        }
                                                                                        try {
                                                                                            ++var4_2;
                                                                                            if ((7012925651371375851L ^ (long)var2_3 | 1L) == 0L) {
                                                                                                throw new ArithmeticException();
                                                                                            }
                                                                                            var3_4 = (int)((long)(-2066538325 + var2_3) ^ 8688969086465593131L ^ 8688969086465593131L);
                                                                                        }
                                                                                        catch (ArithmeticException v0) {
                                                                                            var3_4 = -2066538325 + var2_3;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    Integer.rotateRight(1509984230 ^ var2_3, 14) - -361884651;
                                                                                    if (this.zjb.dhbn(bda_4.shd_4("떞둹됿들뒮띹", 174254298 - -1431883599, bda_4.tykh(1878099265 ^ 986000491, 1), 125270547 + -759520302))) {
                                                                                        (int)(8201930282456317264L ^ (long)var2_3 ^ -4236356643244781961L);
                                                                                        var3_4 = -1294713634 + var2_3 + -503337844 - -503337844;
                                                                                        (int)(-3669446432988693167L ^ (long)var2_3 ^ -98372794210568202L);
                                                                                        var3_4 = 3315614 + var2_3;
                                                                                        ++var4_2;
                                                                                        continue;
                                                                                    }
                                                                                    try {
                                                                                        if ((5063290457383680011L ^ (long)var2_3 | 1L) == 0L) {
                                                                                            throw new IllegalStateException();
                                                                                        }
                                                                                        var3_4 = Integer.reverse(Integer.reverse(403312961 + var2_3));
                                                                                    }
                                                                                    catch (IllegalStateException v1) {
                                                                                        var3_4 = Integer.reverse(Integer.reverse(403312961 + var2_3));
                                                                                    }
                                                                                    --var4_2;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateLeft(-924797636 ^ var2_3, 12) - 1469288831) * -924797635;
                                                                                var1_1 = bzkh.dar_2;
                                                                                try {
                                                                                    var4_2 += 3;
                                                                                    var3_4 = -1967373310 + var2_3;
                                                                                }
                                                                                catch (ArithmeticException v2) {
                                                                                    var3_4 = Integer.reverse(Integer.reverse(-1967373310 + var2_3));
                                                                                }
                                                                                var4_2 += 2;
                                                                                continue;
                                                                            }
                                                                            (Integer.rotateRight(-1487817034 ^ var2_3, 7) - 1195556677) * -1487817033;
                                                                            var1_1 = bzkh.thfa_2;
                                                                            var3_4 = (int)((long)(-133312076 + var2_3) ^ -2872584005149564507L ^ -2872584005149564507L);
                                                                            Integer.rotateLeft(1777239777 ^ var2_3, 16) + -666897286;
                                                                            (int)(-6098954869340312753L ^ (long)var2_3 ^ -5996398755384329367L);
                                                                            var3_4 = -1967373310 + var2_3 + -683198037 - -683198037;
                                                                            var4_2 += 5;
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateLeft(535876345 ^ var2_3, 6) + -494458014) * 535876345;
                                                                        (int)(-2503301260940874929L ^ (long)var2_3 ^ 358180318835382101L);
                                                                        if (!bda_4.thfsh(this.zjb, "Vanilla")) {
                                                                            try {
                                                                                var4_2 -= 5;
                                                                                if ((8078557587790735727L ^ (long)var2_3 | 1L) == 0L) {
                                                                                    throw new UnsupportedOperationException();
                                                                                }
                                                                                var3_4 = -1190223993 + var2_3 + 758172481 - 758172481;
                                                                            }
                                                                            catch (UnsupportedOperationException v3) {
                                                                                var3_4 = -1190223993 + var2_3 + -1768633765 - -1768633765;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        (int)(-8680124536450226921L ^ (long)var2_3 ^ -287507150081056059L);
                                                                        var3_4 = -1419920009 + var2_3 ^ 1484882988 ^ 1484882988;
                                                                        continue;
                                                                    }
                                                                    (Integer.rotateLeft(1584616593 ^ var2_3, 14) + 1951718602) * 1584616593;
                                                                    (int)(-7151159115978052785L ^ (long)var2_3 ^ 587863899831309394L);
                                                                    var1_1 = bzkh.rkhm;
                                                                    try {
                                                                        var4_2 -= 2;
                                                                        if ((-539072357941922607L ^ (long)var2_3 | 1L) == 0L) {
                                                                            throw new UnsupportedOperationException();
                                                                        }
                                                                        var3_4 = -1967373310 + var2_3 + -570688379 - -570688379;
                                                                    }
                                                                    catch (UnsupportedOperationException v4) {
                                                                        var3_4 = -1967373310 + var2_3;
                                                                    }
                                                                    continue;
                                                                }
                                                                (Integer.rotateLeft(-1649354371 ^ var2_3, 6) - 482866526) * -1649354371;
                                                                (int)(6846165500986452815L ^ (long)var2_3 ^ 1436792429590680533L);
                                                                var3_4 = (int)((long)(2973802 + var2_3) ^ -6292251993085580364L ^ -6292251993085580364L);
                                                                continue;
                                                            }
                                                            Integer.rotateRight(549192846 ^ var2_3, 7) - -81646483;
                                                            var3_4 = (int)((long)(2973802 + var2_3) ^ 1965104435794297900L ^ 1965104435794297900L);
                                                            Integer.rotateRight(-66363962 ^ var2_3, 18) - -1984038347;
                                                            var4_2 += 5;
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(1742268916 ^ var2_3, 15) - -1750993977) * 1742268917;
                                                        var3_4 = 1673854098 + var2_3 ^ 1011075451 ^ 1011075451;
                                                        Integer.rotateLeft(1132251009 ^ var2_3, 11) + 813287386;
                                                        (int)(-9093214340771419313L ^ (long)var2_3 ^ 3317045274017836621L);
                                                        var3_4 = -15484614 + var2_3;
                                                        (Integer.rotateRight(196318546 ^ var2_3, 4) + 1864152105) * 196318547;
                                                        var3_4 = 2973802 + var2_3 ^ 1166417675 ^ 1166417675;
                                                        var4_2 -= 4;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(1096139705 ^ var2_3, 11) + -306163038) * 1096139705;
                                                    (int)(-8942058120749454513L ^ (long)var2_3 ^ 2772109719106005535L);
                                                    var3_4 = Integer.reverse(Integer.reverse(411519536 + var2_3));
                                                    Integer.rotateRight(-1093690682 ^ var2_3, 10) - 528571701;
                                                    var3_4 = 2973802 + var2_3;
                                                    Integer.rotateLeft(-1668868380 ^ var2_3, 6) - -122067753;
                                                    continue;
                                                }
                                                Integer.rotateRight(-198329654 ^ var2_3, 17) + -1780007503;
                                                try {
                                                    var4_2 -= 2;
                                                    if ((8453016528127389543L ^ (long)var2_3 | 1L) == 0L) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    var3_4 = Integer.reverse(Integer.reverse(2973802 + var2_3));
                                                }
                                                catch (IllegalArgumentException v5) {
                                                    var3_4 = (int)((long)(2973802 + var2_3) ^ 8663159212181414416L ^ 8663159212181414416L);
                                                }
                                                var4_2 -= 4;
                                                continue;
                                            }
                                            (Integer.rotateLeft(-1468143248 ^ var2_3, 8) + 1805444043) * -1468143247;
                                            var3_4 = Integer.reverse(Integer.reverse(-195433969 + var2_3));
                                            Integer.rotateRight(-685576629 ^ var2_3, 13) + 295205456;
                                            try {
                                                var4_2 += 3;
                                                if ((9186345483086703779L ^ (long)var2_3 | 1L) == 0L) {
                                                    throw new ArithmeticException();
                                                }
                                                var3_4 = (int)((long)(2973802 + var2_3) ^ 657209227504084125L ^ 657209227504084125L);
                                            }
                                            catch (ArithmeticException v6) {
                                                var3_4 = Integer.reverse(Integer.reverse(2973802 + var2_3));
                                            }
                                            var4_2 += 2;
                                            continue;
                                        }
                                        (Integer.rotateLeft(1126169520 ^ var2_3, 11) + 624761227) * 1126169521;
                                        var3_4 = (int)((long)(-701747552 + var2_3) ^ 1247793341775852051L ^ 1247793341775852051L);
                                        (Integer.rotateRight(1713073075 ^ var2_3, 15) + 1638902248) * 1713073075;
                                        var3_4 = 2973802 + var2_3 + 840360817 - 840360817;
                                        var4_2 += 4;
                                        continue;
                                    }
                                    (Integer.rotateRight(94293398 ^ var2_3, 3) - -1298627483) * 94293399;
                                    try {
                                        var4_2 += 4;
                                        var3_4 = Integer.reverse(Integer.reverse(2973802 + var2_3));
                                    }
                                    catch (IllegalStateException v7) {
                                        var3_4 = (int)((long)(2973802 + var2_3) ^ 873750582418294211L ^ 873750582418294211L);
                                    }
                                    var4_2 += 3;
                                    continue;
                                }
                                (Integer.rotateLeft(-1348618960 ^ var2_3, 8) + 1215729675) * -1348618959;
                                var3_4 = -47747774 + var2_3 ^ -909189448 ^ -909189448;
                                (Integer.rotateRight(1092959419 ^ var2_3, 11) + -404751904) * 1092959419;
                                var3_4 = -1486845375 + var2_3 + -86477501 - -86477501;
                                Integer.rotateLeft(-102240504 ^ var2_3, 18) + 1198756147;
                                var3_4 = 2973802 + var2_3 ^ 1305895158 ^ 1305895158;
                                ++var4_2;
                                continue;
                            }
                            Integer.rotateLeft(-1151905235 ^ var2_3, 10) - -1276079442;
                            (int)(8783703794573962063L ^ (long)var2_3 ^ 382950116786003482L);
                            var3_4 = 2973802 + var2_3 ^ -1536658749 ^ -1536658749;
                            (Integer.rotateLeft(1899166097 ^ var2_3, 17) + -1182148662) * 1899166097;
                            (int)(-5512309546987230385L ^ (long)var2_3 ^ 5920125858637990609L);
                            var4_2 -= 5;
                            continue;
                        }
                        (Integer.rotateLeft(535798069 ^ var2_3, 6) - -496884570) * 535798069;
                        (int)(-2495822090790966449L ^ (long)var2_3 ^ -2062504480876259477L);
                        var3_4 = 349272435 + var2_3 + 1868130970 - 1868130970;
                        Integer.rotateLeft(-425778163 ^ var2_3, 15) - -240976690;
                        (int)(2606891698748713807L ^ (long)var2_3 ^ -1652676914785426038L);
                        var3_4 = Integer.reverse(Integer.reverse(2973802 + var2_3));
                        continue;
                    }
                    (Integer.rotateRight(-1509803822 ^ var2_3, 7) + 513966249) * -1509803821;
                    (int)(6062112081936206858L ^ (long)var2_3 ^ 1788822273783956880L);
                    var3_4 = 2973802 + var2_3;
                    var4_2 -= 5;
                    continue;
                }
                Integer.rotateLeft(1891375464 ^ var2_3, 17) + -1423658285;
                var3_4 = (int)((long)(1561975119 + var2_3) ^ 3361454817079461532L ^ 3361454817079461532L);
                (Integer.rotateRight(372232246 ^ var2_3, 5) - -1272457787) * 372232247;
                var3_4 = 2973802 + var2_3;
                (Integer.rotateLeft(1312276213 ^ var2_3, 12) - 2099101414) * 1312276213;
                (int)(-8321226284649354417L ^ (long)var2_3 ^ -2530878842122750757L);
                var4_2 += 3;
                continue;
            }
            return var1_1;
lbl345:
            // 14 sources

            (Integer.rotateRight(1322022167 ^ var2_3, 12) - -1893741308) * 1322022167;
            var3_4 = 2973802 + var2_3 ^ -1670994132 ^ -1670994132;
        }
    }

    private void thlq(class_287 class_2872, Matrix4f matrix4f, double d, double d2, double d3, double d4, double d5, double d6, byq byq2) {
        try {
            int n = -385514286;
            n = Integer.rotateLeft(n * -1214188565, 6) ^ 0xBE685121;
            class_287 class_2873 = class_2872;
            n = Integer.rotateRight((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n, 17);
            Matrix4f matrix4f2 = matrix4f;
            n = (matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n;
            int n2 = n ^ 0x70285330;
            if ((n2 ^ n) != 1881690928) {
                int cfr_ignored_0 = (0x992DD7E2 ^ n) - 1072646507;
            }
            if ((0x342 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        int n = (int)byq2.sbk();
        int n3 = (int)byq2.srl();
        int n4 = (int)byq2.shsl_2();
        int n5 = (int)byq2.tzdh_2();
        class_2872.method_22918(matrix4f, (float)d, (float)d2, (float)d3).method_1336(n, n3, n4, n5);
        class_2872.method_22918(matrix4f, (float)d4, (float)d5, (float)d6).method_1336(n, n3, n4, n5);
    }

    private void ththa(class_287 class_2872, Matrix4f matrix4f, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, byq byq2) {
        try {
            int n = -998096817;
            n = Integer.rotateLeft(n * -616235919, 20) ^ 0x18A7533;
            n = System.identityHashCode(this) ^ n;
            class_287 class_2873 = class_2872;
            n = (class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n;
            int n2 = n ^ 0x8FAA5CEB;
            if ((n2 ^ n) != -1884660501) {
                int cfr_ignored_0 = (0x4B281CA4 ^ n) + 230263010;
            }
            if ((0x372 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        int n = (int)byq2.sbk();
        int n3 = (int)byq2.srl();
        int n4 = (int)byq2.shsl_2();
        int n5 = (int)bda_4.rdkh(byq2);
        class_2872.method_22918(matrix4f, (float)d, (float)d2, (float)d3).method_1336(n, n3, n4, n5);
        class_2872.method_22918(matrix4f, (float)d4, (float)d5, (float)d6).method_1336(n, n3, n4, n5);
        bda_4.dmw(class_2872, matrix4f, (float)d7, (float)d8, (float)d9).method_1336(n, n3, n4, n5);
        class_2872.method_22918(matrix4f, (float)d10, (float)d11, (float)d12).method_1336(n, n3, n4, n5);
    }

    private void ztn(shw_3 shw2) {
        int n = 1332053120;
        n = Integer.rotateLeft(n * 529100903, 22) ^ 0x88E67A04;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xA2A90FB4;
        if ((n2 ^ n) != -1565978700) {
            int cfr_ignored_0 = (0xEDCC8B34 ^ n) + 28366870;
        }
        if (yf.dnkh()) {
            throw null;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1687 == null || this.zkhsh.dhbn("None")) {
            this.zsm_2.clear();
            return;
        }
        long l = System.currentTimeMillis();
        long l2 = 0xB572B3E78B24951DL ^ 0xB572B3E78B2494E9L;
        this.zsm_2.removeIf(arg_0 -> bda_4.dhfgh(l, l2, arg_0));
        class_4587 class_45872 = shw2.ssha_2();
        class_243 class_2432 = class_3102.field_1773.method_19418().method_19326();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        for (tab tab2 : this.zsm_2) {
            class_287 class_2872;
            double d = l - tab2.khl;
            double d2 = d / (double)l2;
            float f = tab2.jthz_2 && this.shrm.shghkh() ? (float)(1.0 - d2) : 1.0f;
            class_238 class_2383 = new class_238(tab2.sthk_2);
            if (tab2.jthz_2 && this.dhlw.shghkh()) {
                double d3 = Double.longBitsToDouble(0xA272FAA66410393DL ^ 0x9D92FAA66410393DL) * d2;
                class_2383 = class_2383.method_1002(d3, d3, d3);
            }
            class_238 class_2384 = class_2383.method_989(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350);
            byq byq2 = tab2.srkh;
            byq byq3 = tab2.hhs_2;
            if (f < 1.0f) {
                byq2 = byq2.tkhl_2(byq2.tzdh_2() * f);
                byq3 = byq3.tkhl_2(byq3.tzdh_2() * f);
            }
            if (byq2.tzdh_2() > 0.0f) {
                class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
                this.ththa(class_2872, matrix4f, class_2384.field_1323, class_2384.field_1322, class_2384.field_1321, class_2384.field_1320, class_2384.field_1322, class_2384.field_1321, class_2384.field_1320, class_2384.field_1325, class_2384.field_1321, class_2384.field_1323, class_2384.field_1325, class_2384.field_1321, byq2);
                this.ththa(class_2872, matrix4f, class_2384.field_1323, class_2384.field_1322, class_2384.field_1324, class_2384.field_1320, class_2384.field_1322, class_2384.field_1324, class_2384.field_1320, class_2384.field_1325, class_2384.field_1324, class_2384.field_1323, class_2384.field_1325, class_2384.field_1324, byq2);
                this.ththa(class_2872, matrix4f, class_2384.field_1323, class_2384.field_1322, class_2384.field_1321, class_2384.field_1323, class_2384.field_1322, class_2384.field_1324, class_2384.field_1323, class_2384.field_1325, class_2384.field_1324, class_2384.field_1323, class_2384.field_1325, class_2384.field_1321, byq2);
                this.ththa(class_2872, matrix4f, class_2384.field_1320, class_2384.field_1322, class_2384.field_1321, class_2384.field_1320, class_2384.field_1322, class_2384.field_1324, class_2384.field_1320, class_2384.field_1325, class_2384.field_1324, class_2384.field_1320, class_2384.field_1325, class_2384.field_1321, byq2);
                this.ththa(class_2872, matrix4f, class_2384.field_1323, class_2384.field_1322, class_2384.field_1321, class_2384.field_1320, class_2384.field_1322, class_2384.field_1321, class_2384.field_1320, class_2384.field_1322, class_2384.field_1324, class_2384.field_1323, class_2384.field_1322, class_2384.field_1324, byq2);
                this.ththa(class_2872, matrix4f, class_2384.field_1323, class_2384.field_1325, class_2384.field_1321, class_2384.field_1320, class_2384.field_1325, class_2384.field_1321, class_2384.field_1320, class_2384.field_1325, class_2384.field_1324, class_2384.field_1323, class_2384.field_1325, class_2384.field_1324, byq2);
                class_286.method_43433((class_9801)class_2872.method_60800());
            }
            if (!(byq3.tzdh_2() > 0.0f)) continue;
            RenderSystem.lineWidth((float)Float.intBitsToFloat(Integer.rotateLeft(0xBFACAE13 ^ 0xBF936E13, 8)));
            class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
            this.thlq(class_2872, matrix4f, class_2384.field_1323, class_2384.field_1322, class_2384.field_1321, class_2384.field_1320, class_2384.field_1322, class_2384.field_1321, byq3);
            this.thlq(class_2872, matrix4f, class_2384.field_1320, class_2384.field_1322, class_2384.field_1321, class_2384.field_1320, class_2384.field_1322, class_2384.field_1324, byq3);
            this.thlq(class_2872, matrix4f, class_2384.field_1320, class_2384.field_1322, class_2384.field_1324, class_2384.field_1323, class_2384.field_1322, class_2384.field_1324, byq3);
            this.thlq(class_2872, matrix4f, class_2384.field_1323, class_2384.field_1322, class_2384.field_1324, class_2384.field_1323, class_2384.field_1322, class_2384.field_1321, byq3);
            this.thlq(class_2872, matrix4f, class_2384.field_1323, class_2384.field_1325, class_2384.field_1321, class_2384.field_1320, class_2384.field_1325, class_2384.field_1321, byq3);
            this.thlq(class_2872, matrix4f, class_2384.field_1320, class_2384.field_1325, class_2384.field_1321, class_2384.field_1320, class_2384.field_1325, class_2384.field_1324, byq3);
            this.thlq(class_2872, matrix4f, class_2384.field_1320, class_2384.field_1325, class_2384.field_1324, class_2384.field_1323, class_2384.field_1325, class_2384.field_1324, byq3);
            this.thlq(class_2872, matrix4f, class_2384.field_1323, class_2384.field_1325, class_2384.field_1324, class_2384.field_1323, class_2384.field_1325, class_2384.field_1321, byq3);
            this.thlq(class_2872, matrix4f, class_2384.field_1323, class_2384.field_1322, class_2384.field_1321, class_2384.field_1323, class_2384.field_1325, class_2384.field_1321, byq3);
            this.thlq(class_2872, matrix4f, class_2384.field_1320, class_2384.field_1322, class_2384.field_1321, class_2384.field_1320, class_2384.field_1325, class_2384.field_1321, byq3);
            this.thlq(class_2872, matrix4f, class_2384.field_1323, class_2384.field_1322, class_2384.field_1324, class_2384.field_1323, class_2384.field_1325, class_2384.field_1324, byq3);
            this.thlq(class_2872, matrix4f, class_2384.field_1320, class_2384.field_1322, class_2384.field_1324, class_2384.field_1320, class_2384.field_1325, class_2384.field_1324, byq3);
            class_286.method_43433((class_9801)class_2872.method_60800());
            RenderSystem.lineWidth((float)1.0f);
        }
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private static boolean dhfgh(long l, long l2, tab tab2) {
        int n = 2138498453;
        n = Integer.rotateLeft(n * -26302579, 8) ^ 0x614FA08A;
        tab tab3 = tab2;
        n = Integer.rotateRight((tab3 != null ? System.identityHashCode(tab3) : 0) ^ n, 7);
        int n2 = n ^ 0x1DEEEAF3;
        if ((n2 ^ n) != 502196979) {
            int cfr_ignored_0 = (0x62980F66 ^ n) + 1321750729;
        }
        return l - tab2.khl > l2;
    }

    private static class_2596 zdhd_3(class_3965 class_39652, int n) {
        return new class_2885(class_1268.field_5808, class_39652, n);
    }

    private static boolean jan(class_1511 class_15112) {
        return true;
    }

    private static boolean taa_2(class_1309 class_13092) {
        int n;
        block1: {
            int n2 = -1675493860;
            n2 = Integer.rotateLeft(n2 * 1971361385, 17) ^ 0x61730B;
            class_1309 class_13093 = class_13092;
            n2 = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n2;
            int n3 = n2 ^ 0x6FFBD678;
            if ((n3 ^ n2) != 1878775416) {
                int cfr_ignored_0 = (0xF3DA2864 ^ n2) - -1817351270;
            }
            n = !class_13092.method_7325() && class_13092.method_5805() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0xC16B;
        }
        return n != 0;
    }

    private void sns_4(bksh bksh2) {
        Object object;
        Object object2;
        int n = 1111122817;
        n = Integer.rotateLeft(n * -1568264807, 21) ^ 0x52859820;
        bksh bksh3 = bksh2;
        n = Integer.rotateLeft((bksh3 != null ? System.identityHashCode(bksh3) : 0) ^ n, 6);
        int n2 = n ^ 0x8A4711DB;
        if ((n2 ^ n) != -1975053861) {
            int cfr_ignored_0 = (0xC87D725A ^ n) - 258153087;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null) {
            return;
        }
        String string = null;
        class_2596 class_25962 = bksh2.asw();
        if (class_25962 instanceof class_7439) {
            object2 = (class_7439)class_25962;
            string = object2.comp_763().getString();
        } else {
            class_25962 = bksh2.asw();
            if (class_25962 instanceof class_7827) {
                object = (class_7827)class_25962;
                string = object.comp_1097().getString();
            }
        }
        if (string != null && ((String)(object2 = string.toLowerCase(Locale.ROOT))).contains((CharSequence)(object = class_3102.field_1724.method_5477().getString().toLowerCase(Locale.ROOT))) && (((String)object2).contains("failed") || ((String)object2).contains("flagged")) && this.tfdh.alh()) {
            long l = System.currentTimeMillis();
            if (l - this.rtht > (0x85F5E6A05F61063AL ^ 0x85F5E6A05F61212AL)) {
                this.ssm_2 = 0;
            }
            ++this.ssm_2;
            this.rtht = l;
            Moondlc.getInstance().getNotificationManager().khdhz_2(qk.shtdh_2, "Flag detected! (" + this.ssm_2 + "/3)");
            if (this.ssm_2 >= 3) {
                this.thds_4 = true;
                Moondlc.getInstance().getNotificationManager().khdhz_2(qk.tghs, "Pausing placeme".concat("nt for 5 secon").concat("ds due to repe").concat("ated flags!"));
            }
        }
    }

    private static void dysh_2(bqn bqn2) {
        int n = -1403952751;
        n = Integer.rotateLeft(n * 1813228307, 3) ^ 0xED369564;
        bqn bqn3 = bqn2;
        n = (bqn3 != null ? System.identityHashCode(bqn3) : 0) ^ n;
        int n2 = n ^ 0xA0634261;
        if ((n2 ^ n) != -1604107679) {
            int cfr_ignored_0 = (0xC3223F0 ^ n) - 118357368;
        }
        bda_4.hjz();
    }

    private boolean mf() {
        int n = -695406947;
        int n2 = (n = Integer.rotateLeft(n * 705790449, 21) ^ 0x2A82BB64) ^ 0x9B5D8ADA;
        if ((n2 ^ n) != -1688368422) {
            int cfr_ignored_0 = (0x4DD16447 ^ n) + -691180796;
        }
        return !this.hgha.shzl();
    }

    private boolean zthw_2() {
        int n = 2082406891;
        n = Integer.rotateLeft(n * -1388523511, 10) ^ 0xF963476F;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 13);
        int n2 = n ^ 0x15508A03;
        if ((n2 ^ n) != 357599747) {
            int cfr_ignored_0 = (0x694F8BE8 ^ n) + -805017047;
        }
        return !this.sry.dhbn("Custom");
    }

    private boolean adhs() {
        int n = bkhz.hta_3(-636431129);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x70C9F624;
        if ((n2 ^ n) != 1892283940) {
            int cfr_ignored_0 = Integer.rotateRight(0xAAD922C3 ^ n, 8) + -1264003880;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.sry.dhbn("Custom");
    }

    private boolean dtf_3() {
        try {
            int n = -1508494298;
            n = Integer.rotateLeft(n * 630612619, 11) ^ 0xCB65FBCB;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 5);
            int n2 = n ^ 0xA31C9708;
            if ((n2 ^ n) != -1558407416) {
                int cfr_ignored_0 = (0x50AA32E ^ n) + -1917484386;
            }
            if ((0x2A8 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.sry.dhbn("Custom");
    }

    private boolean hys() {
        int n;
        block1: {
            int n2 = bkhz.hta_3(1221739495);
            n2 = System.identityHashCode(this) ^ n2;
            int n3 = n2 ^ 0x1A1979AA;
            if ((n3 ^ n2) != 437877162) {
                int cfr_ignored_0 = Integer.rotateLeft(0x52CB3A4D ^ n2, 13) - 184135310;
                int cfr_ignored_1 = (int)(0x9079947027D4EB4FL ^ (long)n2 ^ 0xD590831A2DB88D22L);
            }
            n = !this.sry.dhbn("Custom") ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x7733;
        }
        return n != 0;
    }

    private boolean khshsh() {
        int n = 2129737406;
        n = Integer.rotateLeft(n * 970674819, 27) ^ 0x17507810;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 23);
        int n2 = n ^ 0xD96E2646;
        if ((n2 ^ n) != -647092666) {
            int cfr_ignored_0 = (0xA79F10F8 ^ n) + 1321150847;
        }
        return !this.sry.dhbn("Custom");
    }

    private boolean zz() {
        int n = 261079909;
        n = Integer.rotateLeft(n * 1522153991, 3) ^ 0x102B2895;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x7517A96F;
        if ((n2 ^ n) != 1964484975) {
            int cfr_ignored_0 = (0x7A986A0A ^ n) - 600581143;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.sry.dhbn("Custom") || this.dthb.dhbn("None") || this.dthb.dhbn("Random");
    }

    private boolean ant() {
        int n = bkhz.hta_3(741847685);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 28);
        int n2 = n ^ 0x3FD8BCE3;
        if ((n2 ^ n) != 1071168739) {
            int cfr_ignored_0 = Integer.rotateRight(0x13EF0E66 ^ n, 5) - 1850760597;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return !this.sry.dhbn("Custom");
    }

    private boolean shbf() {
        int n = bkhz.hta_3(1170934002);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 2);
        int n2 = n ^ 0x8E3681FB;
        if ((n2 ^ n) != -1909030405) {
            int cfr_ignored_0 = Integer.rotateLeft(0xCBFD8909 ^ n, 12) + -1206831278;
            int cfr_ignored_1 = (int)(0x94F273427D4EB4FL ^ (long)n ^ 0xB318831A2DB9BF4FL);
        }
        return !this.sry.dhbn("Custom");
    }

    private boolean zyh() {
        int n;
        block4: {
            try {
                int n2 = 746538240;
                n2 = Integer.rotateLeft(n2 * 1097741107, 26) ^ 0x164B4F12;
                n2 = System.identityHashCode(this) ^ n2;
                int n3 = n2 ^ 0x7E572197;
                if ((n3 ^ n2) != 2119639447) {
                    int cfr_ignored_0 = (0x52286497 ^ n2) - 2133950080;
                }
                if ((0x95 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = !this.sry.dhbn("Custom") ? 1 : 0;
            if (yf.tdhth_2() != 0) break block4;
            n = n ^ 0xB3CC;
        }
        return n != 0;
    }

    private boolean jmsh() {
        int n = -2134669552;
        n = Integer.rotateLeft(n * -371220881, 17) ^ 0xEE132FE2;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xDF8FA601;
        if ((n2 ^ n) != -544233983) {
            int cfr_ignored_0 = (0x5F4C2111 ^ n) + -1737379610;
        }
        return !this.sry.dhbn("Custom");
    }

    private boolean thqj() {
        try {
            int n = -1596567969;
            n = Integer.rotateLeft(n * -2070923601, 23) ^ 0xE72E067E;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 2);
            int n2 = n ^ 0x6023BB46;
            if ((n2 ^ n) != 1612954438) {
                int cfr_ignored_0 = (0xC0F5F519 ^ n) + 1929310810;
            }
            if ((0x222 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.sry.dhbn("Custom");
    }

    private boolean tdn() {
        int n = -343410893;
        n = Integer.rotateLeft(n * 1745956243, 6) ^ 0x78B3B7C1;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x3B6EFC8D;
        if ((n2 ^ n) != 997129357) {
            int cfr_ignored_0 = (0xD0E90BBE ^ n) + -226127828;
        }
        return !this.sry.dhbn("Custom");
    }

    private boolean haa_2() {
        int n = 1964721256;
        n = Integer.rotateLeft(n * -2043522775, 19) ^ 0x1C6FF998;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 23);
        int n2 = n ^ 0xA4A18074;
        if ((n2 ^ n) != -1532919692) {
            int cfr_ignored_0 = (0xD1BAC41C ^ n) + 1890874238;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.sry.dhbn("Custom");
    }

    private boolean sf() {
        int n = -488438542;
        n = Integer.rotateLeft(n * -249397485, 8) ^ 0xDB520852;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 17);
        int n2 = n ^ 0xFDF45580;
        if ((n2 ^ n) != -34318976) {
            int cfr_ignored_0 = (0x1F175172 ^ n) - -39998099;
        }
        return !this.thfd_2.dhbn("Vanilla");
    }

    private static String shd_4(String string, int n, int n2, int n3) {
        try {
            int n4 = -2011655288;
            n4 = Integer.rotateLeft(n4 * 454002457, 24) ^ 0xD6638103;
            n4 = Integer.rotateLeft(n ^ n4, 2);
            n4 = Integer.rotateRight(n2 ^ n4, 8);
            int n5 = n4 ^ 0xA42B203;
            if ((n5 ^ n4) != 172143107) {
                int cfr_ignored_0 = (0x825A218B ^ n4) - 2105856642;
            }
            if ((0x3A4 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x25547F8F) + i ^ sda_5, 26) ^ n2 + zzl_2));
        }
        return new String(cArray);
    }

    private static class_310 tar_3() {
        block0: {
            int n = -2100044603;
            int n2 = (n = Integer.rotateLeft(n * 221006637, 18) ^ 0x19E7A624) ^ 0x24C18481;
            if ((n2 ^ n) == 616662145) break block0;
            int cfr_ignored_0 = (0xA6125844 ^ n) + -475217401;
        }
        return class_310.method_1551();
    }

    private static void sfgh_2(int n) {
        int n2 = bkhz.hta_3(-1802364341);
        int n3 = n2 ^ 0xDC930CD0;
        if ((n3 ^ n2) != -594342704) {
            int cfr_ignored_0 = (Integer.rotateRight(0x4801169B ^ n2, 12) + -1132504064) * 1208030875;
        }
        bfn.shkz(n);
    }

    private static double tbn_2(class_746 class_7462) {
        block0: {
            int n = 1850492310;
            n = Integer.rotateLeft(n * -1081428575, 8) ^ 0xA45D5549;
            class_746 class_7463 = class_7462;
            n = Integer.rotateLeft((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 27);
            int n2 = n ^ 0x10F3C8F3;
            if ((n2 ^ n) == 284412147) break block0;
            int cfr_ignored_0 = (0x7EBF8D65 ^ n) + -54237721;
        }
        return class_7462.method_23321();
    }

    private static float zhw(class_746 class_7462) {
        block0: {
            int n = 133344922;
            int n2 = (n = Integer.rotateLeft(n * 1465866495, 18) ^ 0x59367AE) ^ 0x59265A4F;
            if ((n2 ^ n) == 1495685711) break block0;
            int cfr_ignored_0 = (0x5ED4F4D5 ^ n) + -1869772183;
        }
        return class_7462.method_36454();
    }

    private static boolean sfr_2() {
        block0: {
            int n = -484234060;
            int n2 = (n = Integer.rotateLeft(n * 1662988071, 13) ^ 0x6B0D79CF) ^ 0x5160BE49;
            if ((n2 ^ n) == 1365294665) break block0;
            int cfr_ignored_0 = (0xB24392FD ^ n) + -115223266;
        }
        return yf.dnkh();
    }

    private static class_1799 jrkh(class_1661 class_16612, int n) {
        block0: {
            int n2 = -1331544181;
            n2 = Integer.rotateLeft(n2 * -838984027, 3) ^ 0xAE6AA72C;
            class_1661 class_16613 = class_16612;
            n2 = Integer.rotateRight((class_16613 != null ? System.identityHashCode(class_16613) : 0) ^ n2, 9);
            int n3 = (n2 = n ^ n2) ^ 0x39BBCFB1;
            if ((n3 ^ n2) == 968609713) break block0;
            int cfr_ignored_0 = (0x8919F03A ^ n2) - 1438966393;
        }
        return class_16612.method_5438(n);
    }

    private static class_1792 zyth_2(class_1799 class_17992) {
        block0: {
            int n = bkhz.hta_3(454925103);
            int n2 = n ^ 0x6E5B801C;
            if ((n2 ^ n) == 1851490332) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x75461B33 ^ n, 17) + 937093736) * 1967528755;
        }
        return class_17992.method_7909();
    }

    private static class_2248 jzj_2(class_1747 class_17472) {
        block0: {
            int n = 464892864;
            n = Integer.rotateLeft(n * 1793404841, 11) ^ 0xC44BBB20;
            class_1747 class_17473 = class_17472;
            n = Integer.rotateRight((class_17473 != null ? System.identityHashCode(class_17473) : 0) ^ n, 14);
            int n2 = n ^ 0x5D0A8DD;
            if ((n2 ^ n) == 97560797) break block0;
            int cfr_ignored_0 = (0x1E651B1D ^ n) + 700893781;
        }
        return class_17472.method_7711();
    }

    private static class_1799 rthth(class_1735 class_17352) {
        block0: {
            int n = bkhz.hta_3(-207936342);
            int n2 = n ^ 0xC991371E;
            if ((n2 ^ n) == -913230050) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x3A0A13B4 ^ n, 10) - 194380295) * 973738933;
        }
        return class_17352.method_7677();
    }

    private static String bshd(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bkhz.hta_3(1663106130);
            n4 = n ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x3D199A28;
            if ((n5 ^ n4) == 1025088040) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x5E39667A ^ n4, 14) + 1834027009) * 1580820091;
        }
        return bda_4.shd_4(string, n, n2, n3);
    }

    private static void hghf(class_636 class_6362, int n, int n2, int n3, class_1713 class_17132, class_1657 class_16572) {
        int n4 = -1724998620;
        n4 = Integer.rotateLeft(n4 * -281821727, 4) ^ 0x9A4E8E7D;
        class_636 class_6363 = class_6362;
        n4 = (class_6363 != null ? System.identityHashCode(class_6363) : 0) ^ n4;
        int n5 = (n4 = n ^ n4) ^ 0x54CA2374;
        if ((n5 ^ n4) != 1422533492) {
            int cfr_ignored_0 = (0xCDE4BF50 ^ n4) + 1602853219;
        }
        class_6362.method_2906(n, n2, n3, class_17132, class_16572);
    }

    private static class_1661 zza_2(class_746 class_7462) {
        block0: {
            int n = bkhz.hta_3(-1686300949);
            class_746 class_7463 = class_7462;
            n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 24);
            int n2 = n ^ 0x81CB70E9;
            if ((n2 ^ n) == -2117373719) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x1AB66602 ^ n, 6) + 1081342329;
        }
        return class_7462.method_31548();
    }

    private static boolean shzm() {
        block0: {
            int n = -1624082252;
            int n2 = (n = Integer.rotateLeft(n * -1549458931, 6) ^ 0x60EFBAA9) ^ 0x2AAC5509;
            if ((n2 ^ n) == 715937033) break block0;
            int cfr_ignored_0 = (0xB59E2DBD ^ n) + 1778501854;
        }
        return yf.khdha_2();
    }

    private static String dhthh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1044296121;
            n4 = Integer.rotateLeft(n4 * 117978779, 15) ^ 0xCB119959;
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 4)) ^ 0x68AD7DE4;
            if ((n5 ^ n4) == 1756200420) break block0;
            int cfr_ignored_0 = (0x5693CC5D ^ n4) - -324149608;
        }
        return bda_4.shd_4(string, n, n2, n3);
    }

    private static boolean sghf(khd khd2, String string) {
        block0: {
            int n = -809081650;
            int n2 = (n = Integer.rotateLeft(n * 1380133317, 14) ^ 0xD4E5FDCE) ^ 0x927522AF;
            if ((n2 ^ n) == -1837817169) break block0;
            int cfr_ignored_0 = (0x5DB34661 ^ n) + 1587552704;
        }
        return khd2.dhbn(string);
    }

    private static class_1661 zat_8(class_746 class_7462) {
        block0: {
            int n = -1054759155;
            n = Integer.rotateLeft(n * 757002511, 27) ^ 0x4D0E2EC7;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0x89FB7DC4;
            if ((n2 ^ n) == -1980006972) break block0;
            int cfr_ignored_0 = (0x48DADAC9 ^ n) + 952980568;
        }
        return class_7462.method_31548();
    }

    private static boolean shbh_2(class_746 class_7462) {
        block0: {
            int n = -760461547;
            n = Integer.rotateLeft(n * -115809569, 28) ^ 0xDF5BD099;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0x8B4C6475;
            if ((n2 ^ n) == -1957927819) break block0;
            int cfr_ignored_0 = (0x59E02360 ^ n) - -767339566;
        }
        return class_7462.method_24828();
    }

    private static String ry(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1536787902;
            n4 = Integer.rotateLeft(n4 * -1682947733, 3) ^ 0x1ABA7753;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 18);
            int n5 = (n4 = n ^ n4) ^ 0x7FC83D63;
            if ((n5 ^ n4) == 2143829347) break block0;
            int cfr_ignored_0 = (0xDBAE4721 ^ n4) - 1456019969;
        }
        return bda_4.shd_4(string, n, n2, n3);
    }

    private static boolean zghr_2(khd khd2, String string) {
        block0: {
            int n = -1525409662;
            n = Integer.rotateLeft(n * 1411199765, 18) ^ 0xD066495E;
            khd khd3 = khd2;
            n = (khd3 != null ? System.identityHashCode(khd3) : 0) ^ n;
            int n2 = n ^ 0x76A25A5F;
            if ((n2 ^ n) == 1990351455) break block0;
            int cfr_ignored_0 = (0xD3B642DD ^ n) - -1943796860;
        }
        return khd2.dhbn(string);
    }

    private static int tykh(int n, int n2) {
        block0: {
            int n3 = 1319037685;
            n3 = Integer.rotateLeft(n3 * 217210439, 14) ^ 0xF4B77458;
            int n4 = (n3 = n ^ n3) ^ 0x44DC8C7E;
            if ((n4 ^ n3) == 1155304574) break block0;
            int cfr_ignored_0 = (0xA42668B ^ n3) + 1157741993;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static boolean thfsh(khd khd2, String string) {
        block0: {
            int n = -247563431;
            int n2 = (n = Integer.rotateLeft(n * 335756955, 7) ^ 0x69519335) ^ 0x4AAA7EF3;
            if ((n2 ^ n) == 1252687603) break block0;
            int cfr_ignored_0 = (0xBB9405AA ^ n) - -1100400806;
        }
        return khd2.dhbn(string);
    }

    private static float rdkh(byq byq2) {
        block0: {
            int n = -546332481;
            int n2 = (n = Integer.rotateLeft(n * 252767715, 23) ^ 0xFDE89AF0) ^ 0x1CFFAEA3;
            if ((n2 ^ n) == 486518435) break block0;
            int cfr_ignored_0 = (0xC3900E1C ^ n) - -1895091420;
        }
        return byq2.tzdh_2();
    }

    private static class_4588 dmw(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3) {
        block0: {
            int n = 834302535;
            n = Integer.rotateLeft(n * -1826412227, 8) ^ 0x732F4DA;
            class_287 class_2873 = class_2872;
            n = (class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n;
            Matrix4f matrix4f2 = matrix4f;
            n = (matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n;
            int n2 = n ^ 0x621916C5;
            if ((n2 ^ n) == 1645811397) break block0;
            int cfr_ignored_0 = (0x53A36482 ^ n) - 805518317;
        }
        return class_2872.method_22918(matrix4f, f, f2, f3);
    }

    private static String[] dthh_3(String string) {
        int n = -909324982;
        n = Integer.rotateLeft(n * -377239865, 17) ^ 0x5AC0AEE7;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 5);
        int n2 = n ^ 0x62650384;
        if ((n2 ^ n) != 1650787204) {
            int cfr_ignored_0 = (0xABA9CECE ^ n) + 1766502237;
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

    private static CallSite khts_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1623820927;
            n3 = Integer.rotateLeft(n3 * -506589025, 24) ^ 0x3EA6216C;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 16);
            n3 = Integer.rotateLeft(n ^ n3, 5);
            int n4 = n3 ^ 0x33275649;
            if ((n4 ^ n3) != 858216009) {
                int cfr_ignored_0 = (0x53EEDC36 ^ n3) + 731757439;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ zda_2 ^ string.hashCode() ^ n2 + khghh + i * 1250292089) + zda_2) ^ khghh));
            }
            String[] stringArray = bda_4.dthh_3(new String(cArray));
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

    private static String[] f61tbu4e2ik(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite qx3e1oy4mq60(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dxaqjx4ks ^ string.hashCode()) + (n2 + phiplrptnh) + i ^ dxaqjx4ks, 4) + phiplrptnh);
            }
            String[] stringArray = bda_4.f61tbu4e2ik(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

