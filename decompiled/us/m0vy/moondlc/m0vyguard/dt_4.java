/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10042
 *  net.minecraft.class_10055
 *  net.minecraft.class_1007
 *  net.minecraft.class_1297
 *  net.minecraft.class_1799
 *  net.minecraft.class_1921
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_4597$class_4598
 *  net.minecraft.class_5498
 *  net.minecraft.class_591
 *  net.minecraft.class_742
 *  net.minecraft.class_897
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import net.minecraft.class_10042;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_5498;
import net.minecraft.class_591;
import net.minecraft.class_742;
import net.minecraft.class_897;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bdt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.kd;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.mr;
import us.m0vy.moondlc.m0vyguard.hr_2;
import us.m0vy.moondlc.m0vyguard.ygh;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Position Render", category=bzw.OTHER, desc="Periodically renders static player models at their past positions")
public class dt_4
extends bnq {
    private static dt_4 dsm;
    private static final String shzb = "Texture";
    private static final String jkj = "Classic";
    private static final String sfd_2 = "Detailed";
    private static final String dhns = "Mirror";
    private static final String dghj = "Liquid";
    private static final String bkz_2 = "Glass";
    private static final String sadh = "Smoke";
    private static final String sthl = "Solid";
    private static final ThreadLocal sss_4;
    private final khd taa_3 = new khd(this, "Style");
    private final fy tdt_4 = new fy(this.taa_3, "Texture");
    private final fy thmh_2 = new fy(this.taa_3, "Classic");
    private final fy khdkh = new fy(this.taa_3, "Detailed");
    private final fy jam_2 = new fy(this.taa_3, "Mirror");
    private final fy znsh = new fy(this.taa_3, "Liquid");
    private final fy st_2 = new fy(this.taa_3, "Glass");
    private final fy shqn = new fy(this.taa_3, "Smoke");
    private final fy rza_3 = new fy(this.taa_3, "Solid");
    private final badh_2 jkz = new badh_2(this, "Self").bts(true);
    private final badh_2 khml = new badh_2(this, "Friends").bts(false);
    private final badh_2 jsd = new badh_2(this, "Others").bts(false);
    private final badh_2 bbd = new badh_2((hy)this, "Self F".concat("irst Person"), this::htha).bts(false);
    private final khd shls_2 = new khd(this, "Color Mode");
    private final fy shzd = new fy(this.shls_2, "Target");
    private final fy dngh = new fy(this.shls_2, "Theme");
    private final fy rnq = new fy(this.shls_2, "Custom");
    private final bzw_2 thqs = new bzw_2(this, "Custom C".concat("olor"), this::dhkh_4).dhshy(new byq(Float.intBitsToFloat(0x2401E7D ^ 0x409C1E7D), Float.intBitsToFloat(0xC9C825C5 ^ 0x8AF125C5), Float.intBitsToFloat(477459493 + 654937051), Float.intBitsToFloat(Integer.rotateLeft(0x2FA2B751 ^ 0x2FA231F5, 15))));
    private final bzw_2 hqgh = new bzw_2(this, "Self Color", this::thn_2).dhshy(new byq(Float.intBitsToFloat(-625485588 + 1750017812), Float.intBitsToFloat(Integer.reverse(1894481094) ^ 0x2000D70E), Float.intBitsToFloat(-176099832 - -1308496376), Float.intBitsToFloat(Integer.rotateLeft(0x2DF4321 ^ 0xACDF4300, 25))));
    private final bzw_2 jhj = new bzw_2(this, "Frie".concat("nd Color"), this::tlsh_2).dhshy(new byq(Float.intBitsToFloat(Integer.rotateLeft(0x656DA38F ^ 0x6565F6CF, 11)), Float.intBitsToFloat(Integer.reverse(-1791952520) ^ 0x5DF40CA9), Float.intBitsToFloat(-935643939 - -2058668835), Float.intBitsToFloat(0x1715718 ^ 0x422D5718)));
    private final bzw_2 sly = new bzw_2(this, "Other Color", this::zthj).dhshy(new byq(Float.intBitsToFloat(0xD08634FF ^ 0x93F934FF), Float.intBitsToFloat(0xB9CE5E0D ^ 0xFB705E0D), Float.intBitsToFloat(1519765929 + -398051753), Float.intBitsToFloat(-1300818867 + -1864045645)));
    private final tay tsj_2 = new tay(this, "Interval (ms)").shth_7(Float.intBitsToFloat(Integer.reverse(-1980452163) ^ 0xFF052F91)).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1582442037) ^ 0x9607F585)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x64B7ADD7 ^ 0x64F5E5D7, 8))).ssd_5(Float.intBitsToFloat(0xD962AE6E ^ 0x9A98AE6E));
    private final tay jms_2 = new tay(this, "Durati".concat("on (s)")).shth_7(Float.intBitsToFloat(Integer.reverse(1341766829) ^ 0x8A3D9FF2)).dhbs_2(Float.intBitsToFloat(Integer.reverse(-22473176) ^ 0x5548957F)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xE2AF180E ^ 0xD1E06B3D, 10))).ssd_5(2.0f);
    private final tay bdz_2 = new tay(this, "Alpha").shth_7(Float.intBitsToFloat(0x11884709 ^ 0x50A84709)).dhbs_2(Float.intBitsToFloat(Integer.reverse(67838433) ^ 0xC4FBD020)).rkh_3(Float.intBitsToFloat(0xE3BB5041 ^ 0xA31B5041)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xEF1EC3DF ^ 0xF7C6C3DD, 29)));
    private final tay dra_2 = new tay(this, "Scale").shth_7(Float.intBitsToFloat(1349462849 + -292498241)).dhbs_2(Float.intBitsToFloat(Integer.reverse(47951323) ^ 0xE475DB40)).rkh_3(Float.intBitsToFloat(0x9E4AB162 ^ 0xA3067DAF)).ssd_5(1.0f);
    private final tay zb_2 = new tay(this, "Fade Time".concat(" (ms)")).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(-690490704) ^ 0x49B5EB6B)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xD2161064 ^ 0xF6161045, 25))).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x97F5DC50 ^ 0x97F5D429, 19)));
    private final tay jzk = new tay(this, "Max Distance").shth_7(Float.intBitsToFloat(1437487395 - 338579747)).dhbs_2(Float.intBitsToFloat(2075699394 - 949528770)).rkh_3(Float.intBitsToFloat(-1765248406 + -1447588458)).ssd_5(Float.intBitsToFloat(0xE1F79F4A ^ 0xA3679F4A));
    private final tay zshkh = new tay(this, "Max Ghosts").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(0xB777B9AB ^ 0xF5BFB9AB)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.reverse(1774780012) ^ 0x778F1396));
    private final badh_2 jar_2 = new badh_2(this, "Thro".concat("ugh Walls")).bts(true);
    private final badh_2 har_2 = new badh_2(this, "Full Bright").bts(true);
    private final badh_2 zkhs_2 = new badh_2(this, "Equipment").bts(false);
    private final badh_2 thjz = new badh_2(this, "Only When Moving").bts(true);
    private final tay ddhh = new tay((hy)this, "Fill Alpha", this::sfl_2).shth_7(Float.intBitsToFloat(1382038680 + -297811096)).dhbs_2(Float.intBitsToFloat(619094884 + 509697180)).rkh_3(Float.intBitsToFloat(Integer.reverse(-1853163940) ^ 0x7ACF5189)).ssd_5(Float.intBitsToFloat(-1724865 - -1112428993));
    private final tay ssa_3 = new tay((hy)this, "Line Width", this::dhqb).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(-818551789) ^ 0x8887ACF3)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x3B039B2D ^ 0x52EDFD4B, 5))).ssd_5(Float.intBitsToFloat(Integer.reverse(129375902) ^ 0x46CB5ED3));
    private final tay khhh_2 = new tay((hy)this, "Layers", this::dhl_3).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1481443424) ^ 0x45AF4DE5)).rkh_3(1.0f).ssd_5(1.0f);
    private final tay khha = new tay((hy)this, "Tint ".concat("Strength"), this::tdsh_3).shth_7(0.0f).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(-1039292100 - -2067735441)).ssd_5(Float.intBitsToFloat(-1476868900 - 1766502497));
    private final tay thyl = new tay((hy)this, "Color Opacity", this::zth_9).shth_7(0.0f).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(-1377746959) ^ 0xB2B04B78)).ssd_5(Float.intBitsToFloat(-2020868595 + -1212939789));
    private final tay jym = new tay((hy)this, "Liquid ".concat("Distortion"), this::ll).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(0x24279C5E ^ 0x19844B54)).rkh_3(Float.intBitsToFloat(0x10AF6B9A ^ 0x2BAC79F5)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x9569B180 ^ 0xD91038B7, 7)));
    private final tay zar_2 = new tay((hy)this, "Liquid Speed", this::rjb).shth_7(Float.intBitsToFloat(0x76E5D49E ^ 0x4BA91853)).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(1037360209 + -28378439)).ssd_5(Float.intBitsToFloat(0x13853DA3 ^ 0x2DA6EAA9));
    private final bzw_2 hjr = new bzw_2(this, "Solid Color", this::shjf).dhshy(new byq(Float.intBitsToFloat(Integer.rotateLeft(0x60FA9A5 ^ 0x860FB90A, 18)), Float.intBitsToFloat(-1697534237 + -1469624035), Float.intBitsToFloat(-1394426361 + -1768144391), Float.intBitsToFloat(Integer.reverse(-793592626) ^ 0x30614D0B)));
    private final tay khzz_4 = new tay((hy)this, "Glass Blur", this::sthj).shth_7(Float.intBitsToFloat(0x3EAE8D16 ^ 0x7E2E8D16)).dhbs_2(Float.intBitsToFloat(-1185083055 + -1986859345)).rkh_3(2.0f).ssd_5(Float.intBitsToFloat(Integer.reverse(609344072) ^ 0x504B8A24));
    private final tay thkhd = new tay((hy)this, "Glass Re".concat("fraction"), this::dath_4).shth_7(0.0f).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(-35816022) ^ 0x68F27772)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x80E1F2C4 ^ 0x19786A38, 22)));
    private final tay bskh = new tay((hy)this, "Glass Brightness", this::jjsh).shth_7(Float.intBitsToFloat(563802768 + 493161840)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(-1383084053 + -1883439902)).ssd_5(Float.intBitsToFloat(1100910850 - 34551001));
    private final badh_2 dhnz_2 = new badh_2((hy)this, "Glass ".concat("Chromatic"), this::dqn).bts(true);
    private final bzw_2 rhm_2 = new bzw_2(this, "Smoke Color", this::khsz_4).dhshy(new byq(Float.intBitsToFloat(0x2DF68246 ^ 0x6EED8246), Float.intBitsToFloat(Integer.reverse(-1014444193) ^ 0xB9D911C3), Float.intBitsToFloat(1815886495 + -688405151), Float.intBitsToFloat(1404082905 - 274635481)));
    private final tay dshf = new tay((hy)this, "Smoke".concat(" Intensity"), this::rnw).shth_7(Float.intBitsToFloat(90192379 - -946639570)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xB25CDB16 ^ 0xBA5CDB1E, 27))).rkh_3(Float.intBitsToFloat(-453046735 - -1481490076)).ssd_5(1.0f);
    private final tay skhkh_2 = new tay((hy)this, "Smoke Speed", this::akh_3).shth_7(Float.intBitsToFloat(96194700 + 932248641)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(195033262 - -813948508)).ssd_5(Float.intBitsToFloat(1408609286 + -353322400));
    private final List hwgh = new ArrayList();
    private final Map zjsh = new WeakHashMap();
    private final Map dbdh = new WeakHashMap();
    private final hr_2 rld = new hr_2();
    private final bql<btt> dsk = this::tshh;
    private final bql<shw_3> khtht_2 = this::rygh;
    private static final int dh_2 = 1523495626;
    private static final int bka_2 = -1229467275;
    private static final int shjdh = -1999747368;
    private static final int bshd_2 = -463378103;
    private static final int vzdhy1u = -362394776;
    private static final int gp5rsyrtxm = 105786618;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int oogdvo2jb4;

    public static dt_4 khzs_4() {
        block0: {
            int n = 1941699235;
            int n2 = (n = Integer.rotateLeft(n * 7152379, 10) ^ 0x8C1EE418) ^ 0xE65BF747;
            if ((n2 ^ n) == -430180537) break block0;
            int cfr_ignored_0 = (0x95E00DE4 ^ n) + 1877948641;
        }
        return dsm;
    }

    public dt_4() {
        dsm = this;
    }

    @Override
    public void nt() {
        int n = -4787820;
        n = Integer.rotateLeft(n * -1127063187, 22) ^ 0xDEB65CC0;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 21);
        int n2 = n ^ 0xFA028925;
        if ((n2 ^ n) != -100497115) {
            int cfr_ignored_0 = (0x5B478B1 ^ n) + 514238174;
        }
        this.hwgh.clear();
        this.zjsh.clear();
        this.dbdh.clear();
    }

    @Override
    public void nc() {
        int n = 385701527;
        n = Integer.rotateLeft(n * -2031201077, 5) ^ 0x248DCB16;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 27);
        int n2 = n ^ 0xF755F437;
        if ((n2 ^ n) != -145361865) {
            int cfr_ignored_0 = (0xE1A8A2A0 ^ n) - 411595262;
        }
        this.hwgh.clear();
        this.zjsh.clear();
        this.dbdh.clear();
        dt_4.shrm(this.rld);
        sss_4.remove();
    }

    private void dkhq(class_742 class_7423, mr mr2, long l) {
        int n = -1428382675;
        n = Integer.rotateLeft(n * 890962903, 17) ^ 0x41FB4946;
        n = System.identityHashCode(this) ^ n;
        class_742 class_7424 = class_7423;
        n = Integer.rotateLeft((class_7424 != null ? System.identityHashCode(class_7424) : 0) ^ n, 10);
        int n2 = n ^ 0xF6D062F3;
        if ((n2 ^ n) != -154115341) {
            int cfr_ignored_0 = (0x5C0CFEDE ^ n) + -1142079584;
        }
        if (mr2 == mr.sms && !this.bbd.shzl() && dt_4.mc.field_1690.method_31044() == class_5498.field_26664) {
            return;
        }
        class_897 class_8972 = mc.method_1561().method_3953((class_1297)class_7423);
        if (!(class_8972 instanceof class_1007)) {
            return;
        }
        class_1007 class_10072 = (class_1007)class_8972;
        class_10055 class_100552 = class_10072.method_62608();
        dt_4.zsr_2(class_10072, class_7423, class_100552, 1.0f);
        class_243 class_2432 = new class_243(class_100552.field_53325, class_100552.field_53326, class_100552.field_53327);
        dt_4.zthth(this, class_100552);
        this.hwgh.add(new kd(class_7423, class_10072, class_100552, class_2432, mr2, class_7423.method_5477().getString(), l));
        dt_4.jtz(this);
    }

    private void dhkhz(class_10055 class_100552) {
        class_100552.field_53337 = null;
        class_100552.field_53464 = null;
        class_100552.field_53338 = null;
        class_100552.field_53324 = null;
        class_100552.field_53335 = false;
        class_100552.field_53460 = false;
        class_100552.field_53462 = false;
        class_100552.field_53333 = false;
        class_100552.field_53461 = false;
        class_100552.field_53336 = class_243.field_1353;
        class_100552.field_53539 = 0;
        class_100552.field_53540 = 0;
        class_100552.field_53522 = false;
        class_100552.field_53532 = false;
        if (!this.zkhs_2.shzl()) {
            class_100552.field_55309 = class_1799.field_8037;
            class_100552.field_53418 = class_1799.field_8037;
            class_100552.field_53419 = class_1799.field_8037;
            class_100552.field_53420 = class_1799.field_8037;
            class_100552.field_55305.method_65605();
            class_100552.field_55307.method_65605();
            class_100552.field_53467.method_65605();
            class_100552.field_55317.method_65605();
        }
    }

    private void thsh_5() {
        int n = 0;
        int n2 = 0;
        int n3 = -2127150143;
        n3 = Integer.rotateLeft(n3 * 1506997047, 17) ^ 0x48AE009A;
        n3 = System.identityHashCode(this) ^ n3;
        int n4 = Integer.reverse(Integer.reverse(n3 ^ 0x17AF9859));
        block43: while (true) {
            switch (n4 ^ n3) {
                case 1709666391: {
                    int cfr_ignored_0 = (Integer.rotateRight(0xE460C6D2 ^ n3, 15) + -1407864151) * -463419693;
                    return;
                }
                case 1718072167: {
                    int cfr_ignored_1 = (Integer.rotateRight(0xB24EFB1A ^ n3, 9) + -1678899359) * -1303446757;
                    return;
                }
                case 335088118: {
                    int cfr_ignored_2 = Integer.rotateLeft(0xB61951ED ^ n3, 9) - 292457198;
                    int cfr_ignored_3 = (int)(0x74ABFFD027D4EB4FL ^ (long)n3 ^ 0x2D0831A2DB94486L);
                    if (this.hwgh.size() > n) {
                        try {
                            n2 += 5;
                            n4 = n3 ^ 0xEEEDE726;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n4 = n3 ^ 0xEEEDE726;
                        }
                        continue block43;
                    }
                    int cfr_ignored_4 = (int)(0x5B20F9B6D88103CFL ^ (long)n3 ^ 0xE1D7DB1FCB91B90L);
                    n4 = n3 ^ 0xCDF7C581 ^ 0xBED4A8E0 ^ 0xBED4A8E0;
                    n2 -= 2;
                    continue block43;
                }
                case 1695020091: {
                    int cfr_ignored_5 = (Integer.rotateRight(0xD9A00453 ^ n3, 14) + 1589519688) * -643824557;
                    this.hwgh.sort(Comparator.comparingLong(kd::spawnTime));
                    try {
                        n2 -= 5;
                        if ((0x202C4306DD0B3271L ^ (long)n3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n4 = n3 ^ 0x13F909F6;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n4 = n3 ^ 0x13F909F6 ^ 0x16DF3AD3 ^ 0x16DF3AD3;
                    }
                    n2 += 2;
                    continue block43;
                }
                case -286398682: {
                    int cfr_ignored_6 = Integer.rotateLeft(0xE0BAEBA1 ^ n3, 15) + 989865914;
                    int cfr_ignored_7 = (int)(0x2208459C27D4EB4FL ^ (long)n3 ^ 0x7648831A2DB9E9C1L);
                    this.hwgh.removeFirst();
                    n4 = (int)((long)(n3 ^ 0x13F909F6) ^ 0xC22D2FFB719E07A4L ^ 0xC22D2FFB719E07A4L);
                    n2 -= 5;
                    continue block43;
                }
                case -839400063: {
                    int cfr_ignored_8 = Integer.rotateLeft(0xA68BECED ^ n3, 7) - 793726958;
                    int cfr_ignored_9 = (int)(0x643942D027D4EB4FL ^ (long)n3 ^ 0x78D0831A2DB965A3L);
                    return;
                }
                case 397383769: {
                    int cfr_ignored_10 = Integer.rotateRight(0xFBEB370E ^ n3, 18) - -2049357331;
                    n = Math.max(1, dt_4.sdhm(dt_4.zhr_3(this.zshkh)));
                    if (this.hwgh.size() <= n) {
                        n4 = n3 ^ 0x7FBF8BBE ^ 0x2B4ED11C ^ 0x2B4ED11C;
                        int cfr_ignored_11 = Integer.rotateRight(0x6A7605A3 ^ n3, 16) + -391623176;
                        n4 = n3 ^ 0x6667B367;
                        continue block43;
                    }
                    n4 = (int)((long)(n3 ^ 0x6507F43B) ^ 0x8D5C42EC87382F84L ^ 0x8D5C42EC87382F84L);
                    continue block43;
                }
                case -2057274071: {
                    int cfr_ignored_12 = (Integer.rotateLeft(0x6750BBF0 ^ n3, 15) + -2027658933) * 1733344241;
                    n4 = Integer.reverse(Integer.reverse(n3 ^ 0x2887CF1F));
                    int cfr_ignored_13 = (Integer.rotateRight(0x79E289E ^ n3, 3) - -259749283) * 127805599;
                    try {
                        if ((0x3C267EDA5D0527B9L ^ (long)n3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n4 = n3 ^ 0x17AF9859 ^ 0xA15DBE29 ^ 0xA15DBE29;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n4 = n3 ^ 0x17AF9859;
                    }
                    --n2;
                    continue block43;
                }
                case 1431861825: {
                    int cfr_ignored_14 = Integer.rotateLeft(0x21338C25 ^ n3, 7) - 161191862;
                    int cfr_ignored_15 = (int)(0xE381221827D4EB4FL ^ (long)n3 ^ 0xB940831A2DB86AD3L);
                    n4 = (int)((long)(n3 ^ 0xA65CAF05) ^ 0x3E5BC3F5AEA692CBL ^ 0x3E5BC3F5AEA692CBL);
                    int cfr_ignored_16 = Integer.rotateRight(0x7BB73466 ^ n3, 18) - -7538795;
                    try {
                        if ((0x195BA1664A878BBL ^ (long)n3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n4 = n3 ^ 0x17AF9859 ^ 0xE5338A8E ^ 0xE5338A8E;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n4 = Integer.reverse(Integer.reverse(n3 ^ 0x17AF9859));
                    }
                    n2 -= 4;
                    continue block43;
                }
                case 1967038308: {
                    int cfr_ignored_17 = (Integer.rotateLeft(0xC54C9F50 ^ n3, 11) + -391845397) * -984834223;
                    n4 = Integer.reverse(Integer.reverse(n3 ^ 0x2218D01C));
                    int cfr_ignored_18 = (Integer.rotateRight(0x241AEBDF ^ n3, 7) - 1671442236) * 605744095;
                    try {
                        if ((0xCEE7C50D826C7FBBL ^ (long)n3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n4 = n3 ^ 0x17AF9859;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n4 = n3 ^ 0x17AF9859 ^ 0x97ACE29 ^ 0x97ACE29;
                    }
                    continue block43;
                }
                case -1818073868: {
                    int cfr_ignored_19 = Integer.rotateLeft(0x8C3D24A8 ^ n3, 4) + -3862637;
                    n4 = (int)((long)(n3 ^ 0x5E722D85) ^ 0xC5C0CAE108449FC5L ^ 0xC5C0CAE108449FC5L);
                    int cfr_ignored_20 = (Integer.rotateRight(0x898862FA ^ n3, 4) + -1411277951) * -1987550469;
                    try {
                        n2 += 5;
                        if ((0x7804524D85C33581L ^ (long)n3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n4 = n3 ^ 0x17AF9859;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n4 = (int)((long)(n3 ^ 0x17AF9859) ^ 0x6F57454DB356D1C0L ^ 0x6F57454DB356D1C0L);
                    }
                    continue block43;
                }
                case -53051936: {
                    int cfr_ignored_21 = Integer.rotateLeft(0xC4B78445 ^ n3, 11) - -694770794;
                    int cfr_ignored_22 = (int)(0x6052A7827D4EB4FL ^ (long)n3 ^ 0xA980831A2DB9A1DBL);
                    n4 = n3 ^ 0x3D265A26 ^ 0xF7D41EB8 ^ 0xF7D41EB8;
                    int cfr_ignored_23 = (Integer.rotateLeft(0xDE39191C ^ n3, 14) - -314070625) * -566683363;
                    n4 = n3 ^ 0x17AF9859 ^ 0x7F73547F ^ 0x7F73547F;
                    n2 -= 4;
                    continue block43;
                }
                case -582690178: {
                    int cfr_ignored_24 = Integer.rotateLeft(0x7DEC802C ^ n3, 18) - 1140925583;
                    n4 = (n3 ^ 0x17AF9859) + 879303074 - 879303074;
                    continue block43;
                }
                case 2065841383: {
                    int cfr_ignored_25 = Integer.rotateRight(0xA207AECB ^ n3, 7) + -1555314224;
                    int cfr_ignored_26 = (int)(0x8B4270EF4718E897L ^ (long)n3 ^ 0x1CAE42822A08BB55L);
                    n4 = (n3 ^ 0x900BCB77) + -986431496 - -986431496;
                    int cfr_ignored_27 = (int)(0x59561B1A06DEDL ^ (long)n3 ^ 0xD7B3AFF320FDADDAL);
                    n4 = n3 ^ 0x17AF9859 ^ 0x82D93F24 ^ 0x82D93F24;
                    n2 -= 3;
                    continue block43;
                }
                case -1377312405: {
                    int cfr_ignored_28 = Integer.rotateLeft(0x9FFB8340 ^ n3, 6) + 1674740731;
                    try {
                        n2 += 3;
                        n4 = (int)((long)(n3 ^ 0x17AF9859) ^ 0xA1830B546598CF45L ^ 0xA1830B546598CF45L);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n4 = (int)((long)(n3 ^ 0x17AF9859) ^ 0x2D12C02A3829207EL ^ 0x2D12C02A3829207EL);
                    }
                    ++n2;
                    continue block43;
                }
                case 2111022133: {
                    int cfr_ignored_29 = (Integer.rotateLeft(0x7FD34D94 ^ n3, 18) - 2129921063) * 2144554389;
                    n4 = Integer.reverse(Integer.reverse(n3 ^ 0x2CBC7747));
                    int cfr_ignored_30 = Integer.rotateLeft(0x602C2F44 ^ n3, 15) - -1447602057;
                    n4 = (n3 ^ 0x17AF9859) + 70890251 - 70890251;
                    n2 += 3;
                    continue block43;
                }
                case -481021768: {
                    int cfr_ignored_31 = Integer.rotateRight(0xF87B5707 ^ n3, 18) - 458041620;
                    n4 = n3 ^ 0xA8DD8B15;
                    int cfr_ignored_32 = (Integer.rotateLeft(0xCB3BABFC ^ n3, 12) - -1600687425) * -885281795;
                    n4 = (n3 ^ 0x37A080ED) + 218781008 - 218781008;
                    int cfr_ignored_33 = Integer.rotateRight(0xC15EDECE ^ n3, 11) - 1859820077;
                    n4 = n3 ^ 0x17AF9859;
                    n2 += 4;
                    continue block43;
                }
                case 906597726: {
                    int cfr_ignored_34 = Integer.rotateRight(0xCEB2ACC7 ^ n3, 12) - 201362260;
                    n4 = n3 ^ 0xB5282A88 ^ 0xCF03F0A ^ 0xCF03F0A;
                    int cfr_ignored_35 = (Integer.rotateLeft(0x9C70BDDC ^ n3, 6) - -167469857) * -1670332963;
                    n4 = (n3 ^ 0x48BAEAB7) + -823973830 - -823973830;
                    int cfr_ignored_36 = (Integer.rotateLeft(0xE5D8D734 ^ n3, 15) - -643846521) * -438773963;
                    n4 = Integer.reverse(Integer.reverse(n3 ^ 0x17AF9859));
                    ++n2;
                    continue block43;
                }
                case -400687594: {
                    int cfr_ignored_37 = Integer.rotateLeft(0xFDE49789 ^ n3, 18) + -1022625582;
                    int cfr_ignored_38 = (int)(0x3F5639B427D4EB4FL ^ (long)n3 ^ 0x8E18831A2DB9D37DL);
                    n4 = n3 ^ 0x41C5C024 ^ 0xC9B7E335 ^ 0xC9B7E335;
                    int cfr_ignored_39 = Integer.rotateRight(0x95FA2F42 ^ n3, 5) + 766072889;
                    try {
                        ++n2;
                        n4 = (int)((long)(n3 ^ 0x17AF9859) ^ 0x23718FFE016D3B6DL ^ 0x23718FFE016D3B6DL);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n4 = n3 ^ 0x17AF9859;
                    }
                    n2 += 5;
                    continue block43;
                }
                case -2073568018: {
                    int cfr_ignored_40 = Integer.rotateRight(0x41B6D3CA ^ n3, 11) + -108968783;
                    n4 = (int)((long)(n3 ^ 0xA2356431) ^ 0x38C962EF119553EL ^ 0x38C962EF119553EL);
                    int cfr_ignored_41 = Integer.rotateLeft(0x857FDE4C ^ n3, 3) - 786008687;
                    try {
                        n2 += 2;
                        n4 = (int)((long)(n3 ^ 0x17AF9859) ^ 0x2D2881D3A4A5B3FAL ^ 0x2D2881D3A4A5B3FAL);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n4 = (int)((long)(n3 ^ 0x17AF9859) ^ 0x2260247A72A67024L ^ 0x2260247A72A67024L);
                    }
                    continue block43;
                }
                case -89865031: {
                    int cfr_ignored_42 = Integer.rotateLeft(0xD8EE4980 ^ n3, 14) + 1228441019;
                    try {
                        if ((0x45263D5E2DF88465L ^ (long)n3 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n4 = Integer.reverse(Integer.reverse(n3 ^ 0x17AF9859));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n4 = n3 ^ 0x17AF9859 ^ 0xEF0E2C0E ^ 0xEF0E2C0E;
                    }
                    n2 += 5;
                    continue block43;
                }
            }
            int cfr_ignored_43 = Integer.rotateLeft(0xBC7748EC ^ n3, 10) - -691047473;
            n4 = (n3 ^ 0x17AF9859) + -23690382 - -23690382;
        }
    }

    private void rbd_2(kd kd2, float f) {
        sss_4.set(new ygh(this, kd2, f));
    }

    private void jta_3() {
        sss_4.remove();
    }

    public static boolean zhh_7() {
        return sss_4.get() != null;
    }

    public static ygh jwr() {
        return (ygh)sss_4.get();
    }

    public static class_1921 dkhb_2(class_2960 class_29602, class_1921 class_19212) {
        ygh ygh2 = (ygh)sss_4.get();
        if (ygh2 == null) {
            return class_19212;
        }
        return ygh2.sd_4(class_29602, class_19212);
    }

    public static int swm(int n) {
        ygh ygh2;
        int n2 = bdt.saf_4(-1141912250);
        int n3 = (n2 = n ^ n2) ^ 0x308DC5B;
        if ((n3 ^ n2) != 50912347) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xB8E7111D ^ n2, 10) - 1750643134) * -1192816355;
            int cfr_ignored_1 = (int)(0x7A55BF2027D4EB4FL ^ (long)n2 ^ 0x8330831A2DB9597AL);
        }
        return (ygh2 = (ygh)sss_4.get()) == null ? n : ygh2.tas_7(n);
    }

    public static boolean fz() {
        ygh ygh2 = (ygh)sss_4.get();
        return ygh2 != null && ygh2.tfkh_2();
    }

    public void jkhkh(class_4587 class_45872, class_591 class_5912, class_10055 class_100552) {
        ygh ygh2 = (ygh)sss_4.get();
        if (ygh2 == null || !ygh2.zba()) {
            return;
        }
        this.rld.smd_2(class_45872, class_5912, ygh2);
    }

    private mr sad_2(class_742 class_7423) {
        int n = -1346037715;
        n = Integer.rotateLeft(n * -29318865, 8) ^ 0xE553B16A;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 20);
        int n2 = n ^ 0xC2728770;
        if ((n2 ^ n) != -1032681616) {
            int cfr_ignored_0 = (0x6DB79F5D ^ n) + 1600297539;
        }
        if (class_7423 == dt_4.mc.field_1724) {
            return mr.sms;
        }
        boolean bl = dt_4.zjz_4(dt_4.zka_3()).adhj(dt_4.dsn_3(class_7423).getString());
        return bl ? mr.khsm : mr.ddhw;
    }

    private byq rkhgh(kd kd2) {
        int n = bdt.saf_4(1393183367);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 24);
        int n2 = n ^ 0xBF3FF66F;
        if ((n2 ^ n) != -1086327185) {
            int cfr_ignored_0 = Integer.rotateLeft(0xEC35BCE8 ^ n, 16) + -1629520045;
        }
        if (this.shls_2.sdh_2() == this.dngh) {
            return bhj_2.ths();
        }
        if (dt_4.ddn(this.shls_2) == this.rnq) {
            return this.thqs.sdsh_4();
        }
        return switch (dt_4.dhzt_2(kd2).ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> dt_4.khygh(this.hqgh);
            case 1 -> this.jhj.sdsh_4();
            case 2 -> dt_4.tat_8(this.sly);
        };
    }

    private int tkdh_2() {
        block0: {
            int n = bdt.saf_4(1588818406);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 11);
            int n2 = n ^ 0xCD6A4BF1;
            if ((n2 ^ n) == -848671759) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x93D93A17 ^ n, 5) - -341071868) * -1814480361;
        }
        return Math.max(1, Math.round(dt_4.bas_3(this.jms_2) * Float.intBitsToFloat(dt_4.trdh_2(-2106978732) ^ 0x6E0A5641)));
    }

    private int sghs_2() {
        block0: {
            int n = 1543999636;
            n = Integer.rotateLeft(n * -405404563, 5) ^ 0xCA1AF80A;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 23);
            int n2 = n ^ 0x64A1D554;
            if ((n2 ^ n) == 1688327508) break block0;
            int cfr_ignored_0 = (0x38A645C0 ^ n) + -117866630;
        }
        return Math.max(1, Math.round(this.tsj_2.thw_5()));
    }

    public boolean dwd_4() {
        int n = bdt.saf_4(1393232699);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x90724E47;
        if ((n2 ^ n) != -1871557049) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xC379457C ^ n, 11) - -1341322945) * -1015462531;
        }
        if (!dt_4.khghdh()) {
            dt_4.tyd_3();
        }
        return this.taa_3.sdh_2() == this.khdkh;
    }

    public boolean shsh_6() {
        try {
            int n = -1967762361;
            n = Integer.rotateLeft(n * 2067259285, 14) ^ 0xD8E6E60A;
            int n2 = n ^ 0x1EB4C79;
            if ((n2 ^ n) != 32197753) {
                int cfr_ignored_0 = (0x8B5D183E ^ n) - 77455774;
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
            throw null;
        }
        return dt_4.rdl_2(this.taa_3) == this.jam_2;
    }

    public boolean rkhb() {
        try {
            int n = -1063934067;
            n = Integer.rotateLeft(n * -1046437785, 10) ^ 0x4F4AE8BC;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 12);
            int n2 = n ^ 0x91CEF9C4;
            if ((n2 ^ n) != -1848706620) {
                int cfr_ignored_0 = (0x515B5E49 ^ n) - -206490337;
            }
            if ((0x19F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (dt_4.ajs_2()) {
            throw null;
        }
        return this.taa_3.sdh_2() == this.znsh;
    }

    public boolean shsht() {
        int n = 2103841339;
        n = Integer.rotateLeft(n * 1497689911, 28) ^ 0x9CE7AAB4;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 2);
        int n2 = n ^ 0xC3FBF042;
        if ((n2 ^ n) != -1006899134) {
            int cfr_ignored_0 = (0xBE9DE279 ^ n) + 2125347796;
        }
        return dt_4.tkb(this.taa_3) == this.st_2;
    }

    public boolean zl_2() {
        int n = bdt.saf_4(44427407);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x1721D406;
        if ((n2 ^ n) != 388092934) {
            int cfr_ignored_0 = Integer.rotateLeft(0x15843C89 ^ n, 5) + -1621036078;
            int cfr_ignored_1 = (int)(0xD73692B427D4EB4FL ^ (long)n ^ 0xD818831A2DB803BCL);
        }
        return this.taa_3.sdh_2() == this.shqn;
    }

    public boolean hky() {
        try {
            int n = -250089544;
            n = Integer.rotateLeft(n * -1993731175, 8) ^ 0xB40FE46D;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0xAD1A6502;
            if ((n2 ^ n) != -1390779134) {
                int cfr_ignored_0 = (0x5C0D8ABA ^ n) - 797417657;
            }
            if ((0xFB & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return this.taa_3.sdh_2() == this.rza_3;
    }

    public boolean khhh_2() {
        int n;
        block1: {
            int n2 = -675931691;
            n2 = Integer.rotateLeft(n2 * -1790383103, 7) ^ 0xA1396514;
            n2 = System.identityHashCode(this) ^ n2;
            int n3 = n2 ^ 0x443196AD;
            if ((n3 ^ n2) != 1144100525) {
                int cfr_ignored_0 = (0x93878F78 ^ n2) - -685892756;
            }
            n = this.shsh_6() || dt_4.athth(this) || this.shsht() || this.zl_2() ? 1 : 0;
            if (dt_4.anth() != 0) break block1;
            n = n ^ 0x86DD;
        }
        return n != 0;
    }

    public boolean tst_5() {
        int n = bdt.saf_4(-165050057);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 12);
        int n2 = n ^ 0x407F9BA7;
        if ((n2 ^ n) != 1082104743) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xB6561290 ^ n, 9) + 415882923) * -1235873135;
        }
        return this.dwd_4() || this.khhh_2() || this.hky();
    }

    private static float dyf_2(float f) {
        int n = 592943686;
        n = Integer.rotateLeft(n * 2038333157, 3) ^ 0xEEA50CBA;
        n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 16);
        int n2 = n ^ 0xD0F6627E;
        if ((n2 ^ n) != -789159298) {
            int cfr_ignored_0 = (0xF3A1F838 ^ n) - 1312871782;
        }
        float f2 = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        return 1.0f - (float)Math.pow(1.0f - f2, Double.longBitsToDouble(0xF5E429A710D1C054L ^ 0xB5EC29A710D1C054L));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void rygh(shw_3 shw2) {
        try {
            int n = -159447698;
            n = Integer.rotateLeft(n * -1112881373, 25) ^ 0xC98AE6C2;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 5);
            shw_3 shw3 = shw2;
            n = (shw3 != null ? System.identityHashCode(shw3) : 0) ^ n;
            int n2 = n ^ 0x70BC2BB;
            if ((n2 ^ n) != 118211259) {
                int cfr_ignored_0 = (0xF174C7D5 ^ n) + 874246410;
            }
            if ((0x225 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (this.hwgh.isEmpty() || dt_4.mc.field_1773 == null) {
            return;
        }
        class_243 class_2432 = dt_4.mc.field_1773.method_19418().method_19326();
        class_4597.class_4598 class_45982 = mc.method_22940().method_23000();
        long l = System.currentTimeMillis();
        long l2 = this.tkdh_2();
        for (kd kd2 : List.copyOf(this.hwgh)) {
            float f = kd2.alphaFactor(l, l2, this.zb_2.thw_5());
            if (f <= Float.intBitsToFloat(1124808119 - 115826349)) continue;
            int n = this.har_2.shzl() ? 0xE5210279 ^ 0xE5D10289 : mc.method_1561().method_23839((class_1297)kd2.player(), shw2.skz_4());
            shw2.ssha_2().method_22903();
            shw2.ssha_2().method_22904(kd2.position().field_1352 - class_2432.field_1352, kd2.position().field_1351 - class_2432.field_1351, kd2.position().field_1350 - class_2432.field_1350);
            float f2 = this.dra_2.thw_5();
            if (f2 != 1.0f) {
                shw2.ssha_2().method_22905(f2, f2, f2);
            }
            this.rbd_2(kd2, f);
            try {
                kd2.renderer().method_4054((class_10042)kd2.state(), shw2.ssha_2(), (class_4597)class_45982, n);
            }
            finally {
                this.jta_3();
                shw2.ssha_2().method_22909();
            }
        }
        class_45982.method_22993();
    }

    private void tshh(btt btt2) {
        try {
            int n = 811109726;
            n = Integer.rotateLeft(n * -1929521951, 26) ^ 0x2C524B7;
            btt btt3 = btt2;
            n = Integer.rotateRight((btt3 != null ? System.identityHashCode(btt3) : 0) ^ n, 14);
            int n2 = n ^ 0x907EACF3;
            if ((n2 ^ n) != -1870746381) {
                int cfr_ignored_0 = (0xA02621AD ^ n) - -1083852543;
            }
            if ((0xF9 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (dt_4.mc.field_1724 == null || dt_4.mc.field_1687 == null) {
            this.hwgh.clear();
            this.zjsh.clear();
            this.dbdh.clear();
            return;
        }
        long l = System.currentTimeMillis();
        long l2 = this.tkdh_2();
        double d = this.jzk.thw_5() * this.jzk.thw_5();
        class_243 class_2432 = dt_4.mc.field_1724.method_19538();
        Iterator iterator = this.hwgh.iterator();
        while (iterator.hasNext()) {
            kd kd2 = (kd)iterator.next();
            if (l - kd2.spawnTime() < l2 && !(kd2.position().method_1025(class_2432) > d)) continue;
            iterator.remove();
        }
        long l3 = this.sghs_2();
        for (class_742 class_7423 : dt_4.mc.field_1687.method_18456()) {
            long l4;
            mr mr2 = this.sad_2(class_7423);
            if (mr2 == null || mr2 == mr.sms && !this.jkz.shzl() || mr2 == mr.khsm && !this.khml.shzl() || mr2 == mr.ddhw && !this.jsd.shzl() || class_7423.method_5767() || !class_7423.method_5805() || l - (l4 = this.zjsh.getOrDefault(class_7423, 0L).longValue()) < l3) continue;
            class_243 class_2433 = class_7423.method_19538();
            class_243 class_2434 = (class_243)this.dbdh.get(class_7423);
            if (this.thjz.shzl() && class_2434 != null && class_2433.method_1025(class_2434) < Double.longBitsToDouble(0xFF2440869F612BC0L ^ 0xC0A03A67D8CF3FBBL)) continue;
            this.dkhq(class_7423, mr2, l);
            this.zjsh.put(class_7423, l);
            this.dbdh.put(class_7423, class_2433);
        }
        this.thsh_5();
    }

    private boolean akh_3() {
        int n = bdt.saf_4(1857858912);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 26);
        int n2 = n ^ 0xE12CF71F;
        if ((n2 ^ n) != -517146849) {
            int cfr_ignored_0 = (Integer.rotateRight(0x8F905A7F ^ n, 4) - 1725469852) * -1886365057;
        }
        return !this.zl_2();
    }

    private boolean rnw() {
        int n = 856755192;
        int n2 = (n = Integer.rotateLeft(n * 698066227, 16) ^ 0xAF0B04B5) ^ 0xD90F1F1C;
        if ((n2 ^ n) != -653320420) {
            int cfr_ignored_0 = (0xEA1E14E4 ^ n) - 455427591;
        }
        return !this.zl_2();
    }

    private boolean khsz_4() {
        int n = 6557023;
        n = Integer.rotateLeft(n * -704166405, 22) ^ 0x4F00258;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x57B6379;
        if ((n2 ^ n) != 91972473) {
            int cfr_ignored_0 = (0x51F6E26 ^ n) - 1463863214;
        }
        return !this.zl_2();
    }

    private boolean dqn() {
        int n = bdt.saf_4(-1369907112);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 9);
        int n2 = n ^ 0xD3895E76;
        if ((n2 ^ n) != -745972106) {
            int cfr_ignored_0 = Integer.rotateRight(0x7DD1BE2E ^ n, 18) - 1086564045;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.shsht();
    }

    private boolean jjsh() {
        int n = -1698092250;
        n = Integer.rotateLeft(n * -609482523, 19) ^ 0x7F89EF9A;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
        int n2 = n ^ 0x465F843B;
        if ((n2 ^ n) != 1180664891) {
            int cfr_ignored_0 = (0xDC96AF1D ^ n) - -18039170;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return !this.shsht();
    }

    private boolean dath_4() {
        int n = 373350264;
        n = Integer.rotateLeft(n * 772577101, 12) ^ 0xD6096444;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xB154D65B;
        if ((n2 ^ n) != -1319840165) {
            int cfr_ignored_0 = (0xA7140923 ^ n) + -977921862;
        }
        return !this.shsht();
    }

    private boolean sthj() {
        int n = bdt.saf_4(-880588741);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 21);
        int n2 = n ^ 0x19D222D4;
        if ((n2 ^ n) != 433201876) {
            int cfr_ignored_0 = Integer.rotateRight(0xD2516AEF ^ n, 13) - 2084147756;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return !this.shsht();
    }

    private boolean shjf() {
        int n = -40755683;
        n = Integer.rotateLeft(n * 579054469, 19) ^ 0x8A881337;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 16);
        int n2 = n ^ 0x36833685;
        if ((n2 ^ n) != 914568837) {
            int cfr_ignored_0 = (0xCB112898 ^ n) + -1924605004;
        }
        return !this.hky();
    }

    private boolean rjb() {
        int n = 1624314570;
        int n2 = (n = Integer.rotateLeft(n * 2050622139, 7) ^ 0xD405955E) ^ 0x681FD2D0;
        if ((n2 ^ n) != 1746916048) {
            int cfr_ignored_0 = (0x8CEC01A ^ n) - 764156159;
        }
        return !this.rkhb();
    }

    private boolean ll() {
        int n = bdt.saf_4(-171626941);
        int n2 = n ^ 0xFB2940DE;
        if ((n2 ^ n) != -81182498) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xEEC6E9D ^ n, 4) - -755039170) * 250375837;
            int cfr_ignored_1 = (int)(0xCC5EC0A027D4EB4FL ^ (long)n ^ 0x7C30831A2DB8356CL);
        }
        return !this.rkhb();
    }

    private boolean zth_9() {
        int n = -588942382;
        n = Integer.rotateLeft(n * -1682973669, 25) ^ 0x6DB16807;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xD4FF0832;
        if ((n2 ^ n) != -721483726) {
            int cfr_ignored_0 = (0x81A7BE0 ^ n) - 1528788906;
        }
        return !this.khhh_2();
    }

    private boolean tdsh_3() {
        int n = 677253347;
        n = Integer.rotateLeft(n * -512358013, 3) ^ 0x653FF;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x201BCB;
        if ((n2 ^ n) != 2104267) {
            int cfr_ignored_0 = (0x287E0B28 ^ n) - -2081076490;
        }
        return !this.khhh_2();
    }

    private boolean dhl_3() {
        int n = -151096053;
        n = Integer.rotateLeft(n * -2009471437, 5) ^ 0xBFAD7BB9;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 13);
        int n2 = n ^ 0x27847F97;
        if ((n2 ^ n) != 662994839) {
            int cfr_ignored_0 = (0xD17A0A9C ^ n) - 53791207;
        }
        return !this.tst_5();
    }

    private boolean dhqb() {
        int n = 624435934;
        n = Integer.rotateLeft(n * -856978353, 4) ^ 0x28017DCE;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 20);
        int n2 = n ^ 0xD6FF5708;
        if ((n2 ^ n) != -687909112) {
            int cfr_ignored_0 = (0xF3C775D6 ^ n) - 66581878;
        }
        return !this.dwd_4();
    }

    private boolean sfl_2() {
        try {
            int n = 919659172;
            n = Integer.rotateLeft(n * 2093357751, 10) ^ 0xCE606023;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 2);
            int n2 = n ^ 0xB1142D48;
            if ((n2 ^ n) != -1324077752) {
                int cfr_ignored_0 = (0x87C4CFEC ^ n) + 1120981542;
            }
            if ((0x10E & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.dwd_4();
    }

    private boolean zthj() {
        int n = 132406020;
        int n2 = (n = Integer.rotateLeft(n * 195773377, 25) ^ 0x69FFE4D0) ^ 0x3EABCAD1;
        if ((n2 ^ n) != 1051445969) {
            int cfr_ignored_0 = (0x394F91D5 ^ n) + 907756575;
        }
        return this.shls_2.sdh_2() != this.shzd;
    }

    private boolean tlsh_2() {
        try {
            int n = -1049569948;
            n = Integer.rotateLeft(n * 1779489235, 12) ^ 0x122053F1;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 23);
            int n2 = n ^ 0x8BA481EA;
            if ((n2 ^ n) != -1952153110) {
                int cfr_ignored_0 = (0x4AD4548E ^ n) + 145091978;
            }
            if ((0x1FC & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return this.shls_2.sdh_2() != this.shzd;
    }

    private boolean thn_2() {
        try {
            int n = 993655080;
            n = Integer.rotateLeft(n * 1377781023, 6) ^ 0x15F61206;
            int n2 = n ^ 0xFB1D1A00;
            if ((n2 ^ n) != -81978880) {
                int cfr_ignored_0 = (0xC024E328 ^ n) - -901167162;
            }
            if ((0x294 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return this.shls_2.sdh_2() != this.shzd;
    }

    private boolean dhkh_4() {
        int n = bdt.saf_4(-397342016);
        int n2 = n ^ 0x59D3E3DE;
        if ((n2 ^ n) != 1507058654) {
            int cfr_ignored_0 = (Integer.rotateRight(0xB182E91E ^ n, 9) - -2093491747) * -1316820705;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return this.shls_2.sdh_2() != this.rnq;
    }

    private boolean htha() {
        int n = 1080352206;
        int n2 = (n = Integer.rotateLeft(n * -134480553, 25) ^ 0x43E0AE4B) ^ 0xCC1FE252;
        if ((n2 ^ n) != -870325678) {
            int cfr_ignored_0 = (0x8C7B3F9C ^ n) - 514256166;
        }
        return !this.jkz.shzl();
    }

    private static String rssh_2(String string, int n, int n2, int n3) {
        int n4 = 1227157882;
        n4 = Integer.rotateLeft(n4 * -1484644317, 16) ^ 0x78900C14;
        int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 19)) ^ 0xA5903BE4;
        if ((n5 ^ n4) != -1517274140) {
            int cfr_ignored_0 = (0xECB4CA9E ^ n4) - 924118743;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x3430FFFF ^ n2 - i) + bka_2, 21) ^ dh_2 + i * 496344807));
        }
        return new String(cArray);
    }

    private static void shrm(hr_2 hr2) {
        int n = bdt.saf_4(1222491066);
        int n2 = n ^ 0x11CAEA9E;
        if ((n2 ^ n) != 298511006) {
            int cfr_ignored_0 = Integer.rotateLeft(0x59175124 ^ n, 14) - -835685737;
        }
        hr2.zkha_3();
    }

    private static void zsr_2(class_1007 class_10072, class_742 class_7423, class_10055 class_100552, float f) {
        int n = 1223746387;
        n = Integer.rotateLeft(n * -1568979733, 23) ^ 0xB6A3BB1E;
        class_742 class_7424 = class_7423;
        n = Integer.rotateLeft((class_7424 != null ? System.identityHashCode(class_7424) : 0) ^ n, 3);
        int n2 = n ^ 0xD9A67E33;
        if ((n2 ^ n) != -643400141) {
            int cfr_ignored_0 = (0x91569D60 ^ n) + -1020342001;
        }
        class_10072.method_62604(class_7423, class_100552, f);
    }

    private static void zthth(dt_4 dt2, class_10055 class_100552) {
        int n = bdt.saf_4(679277512);
        int n2 = n ^ 0xB8F08EEB;
        if ((n2 ^ n) != -1192194325) {
            int cfr_ignored_0 = Integer.rotateRight(0x908C7D23 ^ n, 5) + -2057255304;
        }
        dt2.dhkhz(class_100552);
    }

    private static void jtz(dt_4 dt2) {
        int n = bdt.saf_4(640118652);
        dt_4 dt3 = dt2;
        n = (dt3 != null ? System.identityHashCode(dt3) : 0) ^ n;
        int n2 = n ^ 0x84D7A943;
        if ((n2 ^ n) != -2066241213) {
            int cfr_ignored_0 = (Integer.rotateRight(0xA2F0C63F ^ n, 7) - -1081761572) * -1561278913;
        }
        dt2.thsh_5();
    }

    private static float zhr_3(tay tay2) {
        block0: {
            int n = bdt.saf_4(-1011345717);
            int n2 = n ^ 0xF00346AD;
            if ((n2 ^ n) == -268220755) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x33BB5066 ^ n, 9) - 1208769429;
        }
        return tay2.thw_5();
    }

    private static int sdhm(float f) {
        block0: {
            int n = 707981144;
            int n2 = (n = Integer.rotateLeft(n * -1992905383, 12) ^ 0x6D0DBC14) ^ 0x46A02CDB;
            if ((n2 ^ n) == 1184902363) break block0;
            int cfr_ignored_0 = (0x6C92C383 ^ n) - 1173326920;
        }
        return Math.round(f);
    }

    private static Moondlc zka_3() {
        block0: {
            int n = -1424584954;
            int n2 = (n = Integer.rotateLeft(n * -1993315795, 19) ^ 0x73EEA1C6) ^ 0x6675CC23;
            if ((n2 ^ n) == 1718996003) break block0;
            int cfr_ignored_0 = (0xCD634325 ^ n) - 1027539422;
        }
        return Moondlc.getInstance();
    }

    private static kh_3 zjz_4(Moondlc moondlc) {
        block0: {
            int n = -303629135;
            n = Integer.rotateLeft(n * -525721265, 21) ^ 0x2CCAC0A5;
            Moondlc moondlc2 = moondlc;
            n = (moondlc2 != null ? System.identityHashCode(moondlc2) : 0) ^ n;
            int n2 = n ^ 0xE7A06B6D;
            if ((n2 ^ n) == -408917139) break block0;
            int cfr_ignored_0 = (0xA4697DC ^ n) - -1504556562;
        }
        return moondlc.getFriendManager();
    }

    private static class_2561 dsn_3(class_742 class_7423) {
        block0: {
            int n = 1238869824;
            int n2 = (n = Integer.rotateLeft(n * 2071199271, 28) ^ 0x4B5F079D) ^ 0xF388B622;
            if ((n2 ^ n) == -209144286) break block0;
            int cfr_ignored_0 = (0xBA5F1162 ^ n) - -429434039;
        }
        return class_7423.method_5477();
    }

    private static fy ddn(khd khd2) {
        block0: {
            int n = 892179467;
            int n2 = (n = Integer.rotateLeft(n * 972097697, 28) ^ 0x49C8CF2B) ^ 0x134D18A6;
            if ((n2 ^ n) == 323819686) break block0;
            int cfr_ignored_0 = (0x26608CAD ^ n) - -1884013322;
        }
        return khd2.sdh_2();
    }

    private static mr dhzt_2(kd kd2) {
        block0: {
            int n = bdt.saf_4(-2053778904);
            int n2 = n ^ 0x5E8FA72C;
            if ((n2 ^ n) == 1586472748) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xDB1A7504 ^ n, 14) - -1936602441;
        }
        return kd2.target();
    }

    private static byq khygh(bzw_2 bzw2_2) {
        block0: {
            int n = -434960327;
            n = Integer.rotateLeft(n * 222687333, 14) ^ 0xC1511F15;
            bzw_2 bzw3_2 = bzw2_2;
            n = (bzw3_2 != null ? System.identityHashCode(bzw3_2) : 0) ^ n;
            int n2 = n ^ 0x37F75483;
            if ((n2 ^ n) == 938955907) break block0;
            int cfr_ignored_0 = (0xD1E45CBA ^ n) + 769731320;
        }
        return bzw2_2.sdsh_4();
    }

    private static byq tat_8(bzw_2 bzw2_2) {
        block0: {
            int n = -1460827952;
            int n2 = (n = Integer.rotateLeft(n * -1140386083, 12) ^ 0xEB10FC0A) ^ 0xD42F3BD6;
            if ((n2 ^ n) == -735101994) break block0;
            int cfr_ignored_0 = (0x7CC2B306 ^ n) + 855213062;
        }
        return bzw2_2.sdsh_4();
    }

    private static float bas_3(tay tay2) {
        block0: {
            int n = 372878621;
            n = Integer.rotateLeft(n * -501851533, 14) ^ 0x70CF33AB;
            tay tay3 = tay2;
            n = Integer.rotateRight((tay3 != null ? System.identityHashCode(tay3) : 0) ^ n, 18);
            int n2 = n ^ 0xB32170EA;
            if ((n2 ^ n) == -1289654038) break block0;
            int cfr_ignored_0 = (0xA518DDF7 ^ n) - -559911496;
        }
        return tay2.thw_5();
    }

    private static int trdh_2(int n) {
        block0: {
            int n2 = -1160029087;
            int n3 = (n2 = Integer.rotateLeft(n2 * -483426561, 26) ^ 0x838C7312) ^ 0x9050A085;
            if ((n3 ^ n2) == -1873764219) break block0;
            int cfr_ignored_0 = (0x2A8BFCE4 ^ n2) + -742995538;
        }
        return Integer.reverse(n);
    }

    private static boolean khghdh() {
        block0: {
            int n = -657547545;
            int n2 = (n = Integer.rotateLeft(n * 181460239, 4) ^ 0x85367FE2) ^ 0x6D94D708;
            if ((n2 ^ n) == 1838470920) break block0;
            int cfr_ignored_0 = (0xB55A49EF ^ n) - -1832218958;
        }
        return yf.khdha_2();
    }

    private static void tyd_3() {
        int n = -760803557;
        int n2 = (n = Integer.rotateLeft(n * -1313236467, 6) ^ 0xB57C28FE) ^ 0x19AFE6FE;
        if ((n2 ^ n) != 430958334) {
            int cfr_ignored_0 = (0xCB08E9E5 ^ n) + -1613404390;
        }
        yf.athz_2();
    }

    private static fy rdl_2(khd khd2) {
        block0: {
            int n = -1739586436;
            n = Integer.rotateLeft(n * 477482973, 14) ^ 0x9EB2B497;
            khd khd3 = khd2;
            n = Integer.rotateLeft((khd3 != null ? System.identityHashCode(khd3) : 0) ^ n, 10);
            int n2 = n ^ 0xACB2154A;
            if ((n2 ^ n) == -1397615286) break block0;
            int cfr_ignored_0 = (0x34E21136 ^ n) - 642722502;
        }
        return khd2.sdh_2();
    }

    private static boolean ajs_2() {
        block0: {
            int n = 412065323;
            int n2 = (n = Integer.rotateLeft(n * 1332742947, 22) ^ 0xAA5AF23) ^ 0x4635101E;
            if ((n2 ^ n) == 1177882654) break block0;
            int cfr_ignored_0 = (0x5EBA8E35 ^ n) + 458245970;
        }
        return yf.dnkh();
    }

    private static fy tkb(khd khd2) {
        block0: {
            int n = bdt.saf_4(-458898896);
            khd khd3 = khd2;
            n = Integer.rotateLeft((khd3 != null ? System.identityHashCode(khd3) : 0) ^ n, 14);
            int n2 = n ^ 0xE314BCBB;
            if ((n2 ^ n) == -485180229) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x7B17E8B ^ n, 3) + -220466672;
        }
        return khd2.sdh_2();
    }

    private static boolean athth(dt_4 dt2) {
        block0: {
            int n = bdt.saf_4(-640123834);
            dt_4 dt3 = dt2;
            n = Integer.rotateRight((dt3 != null ? System.identityHashCode(dt3) : 0) ^ n, 18);
            int n2 = n ^ 0xD87E1B33;
            if ((n2 ^ n) == -662824141) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x1A66775 ^ n, 3) - 931407462) * 27682677;
            int cfr_ignored_1 = (int)(0xC314C94827D4EB4FL ^ (long)n ^ 0x6FE0831A2DB82BF8L);
        }
        return dt2.rkhb();
    }

    private static int anth() {
        block0: {
            int n = -758955089;
            int n2 = (n = Integer.rotateLeft(n * -1996107927, 3) ^ 0xC2961761) ^ 0xD0DEDEA0;
            if ((n2 ^ n) == -790700384) break block0;
            int cfr_ignored_0 = (0x21D9D0F ^ n) - 569502164;
        }
        return yf.tdhth_2();
    }

    private static String[] dms(String string) {
        block0: {
            int n = 410874833;
            int n2 = (n = Integer.rotateLeft(n * 769965749, 15) ^ 0x1E077103) ^ 0x34E223FB;
            if ((n2 ^ n) == 887235579) break block0;
            int cfr_ignored_0 = (0x2C9F502A ^ n) + -861796217;
        }
        return string.split("\u0007\u000f", -1);
    }

    private static CallSite bshgh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1666072452;
            n3 = Integer.rotateLeft(n3 * -633955575, 11) ^ 0xE296BAB9;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 12);
            n3 = Integer.rotateLeft(n2 ^ n3, 17);
            int n4 = n3 ^ 0xA9B0346A;
            if ((n4 ^ n3) != -1448070038) {
                int cfr_ignored_0 = (0xCAFE0BEE ^ n3) + 1955091134;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ shjdh ^ string.hashCode()) + (n2 + bshd_2) + i ^ shjdh, 14) + bshd_2);
            }
            String[] stringArray = dt_4.dms(new String(cArray));
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

    private static String[] twbj8xq6(String string) {
        return string.split("\u0004\u000e", -1);
    }

    private static CallSite ofgqjy5u(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ vzdhy1u ^ string.hashCode()) + (n2 + gp5rsyrtxm) + i ^ vzdhy1u, 13) + gp5rsyrtxm);
            }
            String[] stringArray = dt_4.twbj8xq6(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

