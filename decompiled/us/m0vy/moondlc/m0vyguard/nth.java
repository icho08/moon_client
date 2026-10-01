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
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_5498
 *  net.minecraft.class_746
 *  net.minecraft.class_7833
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;
import lombok.Generated;
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
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_5498;
import net.minecraft.class_746;
import net.minecraft.class_7833;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bmh_2;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bhs_4;
import us.m0vy.moondlc.m0vyguard.byj;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.ttb;
import us.m0vy.moondlc.m0vyguard.tthm;
import us.m0vy.moondlc.m0vyguard.tds;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.ya_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="DashTrail", category=bzw.OTHER, desc="Vega dash cubic trail")
public class nth
extends bnq {
    private static final String tshs_2 = "Self";
    private static final String shmd = "Players";
    private static final String tjs_2 = "Friends";
    private static final String hkhsh = "RandomPalette";
    private static final String thyth = "Custom";
    private static final String bsn = "Client";
    private static final String jay_2 = "Rainbow";
    private static final String tsa_4 = "Mixed";
    private static final String bhn = "Animated";
    private static final String rmkh = "Static";
    private static final String hkhm = "vegaline/modules/dashtrail/";
    private static final String thrth = "vegaline/modules/dashtrail/dashcubics/";
    private static final String shtw_2 = "vegaline/modules/dashtrail/dashcubics/group_dashs/";
    private static final int[] zsa_3;
    private static final int khhw_2 = 21;
    private static final double at_2 = 0.08;
    private static final float shtha_2 = 0.04f;
    private static nth dhth;
    public final badh_2 tzd_2 = new badh_2(this, "Self").bts(true);
    public final badh_2 rdhd_2 = new badh_2(this, "Players").bts(false);
    public final badh_2 wd_2 = new badh_2(this, "Friends").bts(true);
    public final khd btn = new khd(this, "ColorMode");
    private final fy yl = new fy(this.btn, "RandomPalette");
    private final fy hky = new fy(this.btn, "Custom");
    private final fy dzz_2 = new fy(this.btn, "Client");
    private final fy dnt = new fy(this.btn, "Rainbow");
    public final bzw_2 dss_2 = new bzw_2(this, "PickColor").dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-1432718470) ^ 0x1DE45955), Float.intBitsToFloat(Integer.rotateLeft(0x7441BB00 ^ 0x6541BB02, 29)), Float.intBitsToFloat(Integer.reverse(-1514565767) ^ 0xDD8E9DA5), Float.intBitsToFloat(Integer.rotateLeft(0x9EEA80A5 ^ 0x9EE89B5D, 13))));
    public final tay dyz_2 = new tay(this, "MaxDistT".concat("oEntity")).shth_7(Float.intBitsToFloat(1672944881 - 575085809)).dhbs_2(Float.intBitsToFloat(0x9A601346 ^ 0xD8A81346)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(0x4316C8E0 ^ 0x2DEC8E0));
    public final badh_2 dhyr = new badh_2(this, "MotionsSmo".concat("othing")).bts(false);
    public final badh_2 han_2 = new badh_2(this, "DashSegments").bts(false);
    public final badh_2 khsth = new badh_2(this, "DashDots").bts(true);
    public final badh_2 rtkh = new badh_2(this, "Lighting").bts(true);
    public final tay shrn = new tay(this, "DashLength").shth_7(Float.intBitsToFloat(1473753844 + -416789236)).dhbs_2(Float.intBitsToFloat(Integer.reverse(-893038126) ^ 0x744AA353)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x65D1B6B2 ^ 0x8FB7D0DB, 29))).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x1FAD68E4 ^ 0xE5AD68E5, 29)));
    public final khd zdj_2 = new khd(this, "Texture Mode");
    private final fy zaa_2 = new fy(this.zdj_2, "Mixed");
    private final fy khdf_2 = new fy(this.zdj_2, "Animated");
    private final fy khdhgh = new fy(this.zdj_2, "Static");
    public final badh_2 hbd_2 = new badh_2(this, "First Pe".concat("rson Self")).bts(true);
    public final badh_2 hzm = new badh_2(this, "Through".concat(" Walls")).bts(false);
    public final tay bdq_2 = new tay(this, "Dash Size").shth_7(Float.intBitsToFloat(-496582813 + 1545158813)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x563545E4 ^ 0x16354564, 23))).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x1F6C1C5D ^ 0x86F666C4, 15))).ssd_5(1.0f);
    public final tay dght = new tay(this, "Bloom Size").shth_7(Float.intBitsToFloat(Integer.reverse(340761194) ^ 0x68D9F228)).dhbs_2(Float.intBitsToFloat(0x538FE2B0 ^ 0x13CFE2B0)).rkh_3(Float.intBitsToFloat(0xF7164008 ^ 0xCA5A8CC5)).ssd_5(1.0f);
    public final tay bst_3 = new tay(this, "Alpha").shth_7(Float.intBitsToFloat(Integer.reverse(-632887262) ^ 0x79DBAE96)).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(-2038100807 - 1228423148)).ssd_5(1.0f);
    public final tay bys_2 = new tay(this, "Spark Amount").shth_7(Float.intBitsToFloat(Integer.reverse(-1662026907) ^ 0x985EF739)).dhbs_2(Float.intBitsToFloat(-385600009 - -1467730441)).rkh_3(Float.intBitsToFloat(-217893700 + 1266469700)).ssd_5(1.0f);
    public final tay ththf = new tay(this, "Dot Size").shth_7(Float.intBitsToFloat(Integer.reverse(-288440699) ^ 0x9D5EA47D)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x3216EEB0 ^ 0x9C02975F, 21))).rkh_3(Float.intBitsToFloat(Integer.reverse(690623973) ^ 0x9C0B839E)).ssd_5(Float.intBitsToFloat(0xE21BCDB1 ^ 0xDF149198));
    public final tay thrt = new tay(this, "Segment ".concat("Width")).shth_7(Float.intBitsToFloat(-408082326 + 1465046934)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x403B0CA3 ^ 0x403B4C23, 16))).rkh_3(Float.intBitsToFloat(Integer.reverse(-972382207) ^ 0xBE855063)).ssd_5(1.0f);
    public final tay dhws_2 = new tay(this, "Spawn Multiplier").shth_7(Float.intBitsToFloat(Integer.reverse(1425038584) ^ 0x21BA0F2A)).dhbs_2(Float.intBitsToFloat(-904273830 + 1982209958)).rkh_3(Float.intBitsToFloat(0xB54F692 ^ 0x35D4F692)).ssd_5(1.0f);
    public final tay radh_2 = new tay(this, "Min Speed").shth_7(Float.intBitsToFloat(0x251CFFF0 ^ 0x19E93D7F)).dhbs_2(Float.intBitsToFloat(-1219057259 - 2029347303)).rkh_3(Float.intBitsToFloat(1626784854 - 617803084)).ssd_5(Float.intBitsToFloat(0x2B1477AA ^ 0x16B7A0A0));
    public final tay zdhsh = new tay(this, "Max Cubics").shth_7(Float.intBitsToFloat(Integer.reverse(-526461113) ^ 0xA09B7907)).dhbs_2(Float.intBitsToFloat(226467429 + 920740251)).rkh_3(Float.intBitsToFloat(0xD7C8D5A0 ^ 0x9668D5A0)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xF9078C9E ^ 0xF903B1BE, 12)));
    private final List dhjd_2 = new ArrayList();
    private final List thzh_2 = new ArrayList();
    private final List khmb = new ArrayList(-1164013511 + 1164014411);
    private final List jtkh = new ArrayList(0xBAD07E9F ^ 0xBAD07D1B);
    private final Map tz_3 = new HashMap();
    private final Set shdy_2 = new HashSet();
    private final Random jdb = new Random(0x74F9D148690940CEL ^ 0x74F9D148209F421DL);
    private final ttb dll = new ttb(class_2960.method_60655((String)"minecraft", (String)"vegaline/modul".concat("es/dashtrail/das").concat("hbloomsample.png")));
    private final bql<ya_2> hhz = this::dfth;
    private final bql<shw_3> jzdh = this::zrr_2;
    private static final int fb = 1750852176;
    private static final int rght = -1495538739;
    private static final int khdh = 1718548938;
    private static final int zth_4 = -873690285;
    private static final int tr6eqs0 = 526388979;
    private static final int jmflm48 = -1179244939;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int n2r0xhxv;

    public nth() {
        dhth = this;
        this.ghhd_2();
    }

    @Override
    public void nt() {
        int n = 0;
        int n2 = -709563106;
        n2 = Integer.rotateLeft(n2 * -1174989523, 10) ^ 0x35BCEB67;
        int n3 = (-2059053517 * -1929857833 + -1413953183 ^ n2) + 115457828 - 115457828;
        block28: while (true) {
            switch (((n3 ^ n2) - -1413953183) * 1285914343) {
                case -2059053517: {
                    int cfr_ignored_0 = Integer.rotateLeft(0xC071C504 ^ n2, 11) - 1378122423;
                    if (!nth.zbs_2()) {
                        try {
                            n += 2;
                            if ((0xA6EB9B0C6A4B87F5L ^ (long)n2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n3 = -1064176171 * -1929857833 + -1413953183 ^ n2 ^ 0xD6671416 ^ 0xD6671416;
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = -1064176171 * -1929857833 + -1413953183 ^ n2;
                        }
                        ++n;
                        continue block28;
                    }
                    try {
                        n -= 2;
                        if ((0x677A39F657D89A33L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (int)((long)(1966493128 * -1929857833 + -1413953183 ^ n2) ^ 0xBDA508C906707A1BL ^ 0xBDA508C906707A1BL);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)(1966493128 * -1929857833 + -1413953183 ^ n2) ^ 0x19A00645DEE0CDB2L ^ 0x19A00645DEE0CDB2L);
                    }
                    ++n;
                    continue block28;
                }
                case -1064176171: {
                    int cfr_ignored_1 = Integer.rotateRight(0xD73B6887 ^ n2, 13) - 344934292;
                    yf.athz_2();
                    try {
                        --n;
                        if ((0x8D2F3D8DB7C55F4BL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = 1966493128 * -1929857833 + -1413953183 ^ n2;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)(1966493128 * -1929857833 + -1413953183 ^ n2) ^ 0xE07D1263BBB03643L ^ 0xE07D1263BBB03643L);
                    }
                    n -= 4;
                    continue block28;
                }
                case 1966493128: {
                    int cfr_ignored_2 = (Integer.rotateLeft(0x22FAFC74 ^ n2, 7) - 1086468423) * 586873973;
                    this.khmb.clear();
                    this.jtkh.clear();
                    this.tz_3.clear();
                    this.shdy_2.clear();
                    return;
                }
                case -2082811516: {
                    int cfr_ignored_3 = Integer.rotateLeft(0x1F37384 ^ n2, 3) - 1087937591;
                    n3 = Integer.reverse(Integer.reverse(-1768908782 * -1929857833 + -1413953183 ^ n2));
                    int cfr_ignored_4 = (Integer.rotateLeft(0x6F01BEF1 ^ n2, 16) + 1972616810) * 1862385393;
                    int cfr_ignored_5 = (int)(0xADB310CC27D4EB4FL ^ (long)n2 ^ 0xDCE8831A2DB8F6B7L);
                    n3 = -2059053517 * -1929857833 + -1413953183 ^ n2 ^ 0xB43EB36 ^ 0xB43EB36;
                    int cfr_ignored_6 = (Integer.rotateRight(0x2D4BF1F6 ^ n2, 8) - -2138051579) * 759951863;
                    continue block28;
                }
                case -1321850462: {
                    int cfr_ignored_7 = (Integer.rotateRight(0xD6AB1E12 ^ n2, 13) + 51790697) * -693428717;
                    n3 = -2059053517 * -1929857833 + -1413953183 ^ n2;
                    ++n;
                    continue block28;
                }
                case 836864806: {
                    int cfr_ignored_8 = (Integer.rotateLeft(0xC7CB327C ^ n2, 11) - 905493567) * -942984579;
                    try {
                        n -= 4;
                        if ((0xADC5D91AB9C4A647L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(Integer.reverse(-2059053517 * -1929857833 + -1413953183 ^ n2));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (-2059053517 * -1929857833 + -1413953183 ^ n2) + -729346919 - -729346919;
                    }
                    n -= 4;
                    continue block28;
                }
                case -408966936: {
                    int cfr_ignored_9 = Integer.rotateLeft(0x4EA2AA09 ^ n2, 12) + -1978649006;
                    int cfr_ignored_10 = (int)(0x8C10043427D4EB4FL ^ (long)n2 ^ 0xF518831A2DB8B5F1L);
                    n3 = (1920572851 * -1929857833 + -1413953183 ^ n2) + -484416507 - -484416507;
                    int cfr_ignored_11 = (Integer.rotateRight(0x6A9ACD13 ^ n2, 16) + -316902264) * 1788529939;
                    n3 = -2059053517 * -1929857833 + -1413953183 ^ n2 ^ 0x94805255 ^ 0x94805255;
                    --n;
                    continue block28;
                }
                case 953871649: {
                    int cfr_ignored_12 = Integer.rotateLeft(0xCD8AB6A0 ^ n2, 12) + -399917925;
                    n3 = Integer.reverse(Integer.reverse(1260810831 * -1929857833 + -1413953183 ^ n2));
                    int cfr_ignored_13 = (Integer.rotateRight(0xBFCA66DE ^ n2, 10) - 1038095389) * -1077254433;
                    int cfr_ignored_14 = (int)(0xE2A04125D1509DC9L ^ (long)n2 ^ 0x7F3B6E12C0B46891L);
                    n3 = -2059053517 * -1929857833 + -1413953183 ^ n2;
                    n += 5;
                    continue block28;
                }
                case 162686334: {
                    int cfr_ignored_15 = (Integer.rotateRight(0x30E3741F ^ n2, 9) - -269963524) * 820212767;
                    n3 = Integer.reverse(Integer.reverse(-2060168259 * -1929857833 + -1413953183 ^ n2));
                    int cfr_ignored_16 = (Integer.rotateLeft(0x6E6D6551 ^ n2, 16) + 1671226378) * 1852663121;
                    int cfr_ignored_17 = (int)(0xACDFCB6C27D4EB4FL ^ (long)n2 ^ 0x6BA8831A2DB8F46EL);
                    n3 = Integer.reverse(Integer.reverse(-2059053517 * -1929857833 + -1413953183 ^ n2));
                    --n;
                    continue block28;
                }
                case -1304128467: {
                    int cfr_ignored_18 = (Integer.rotateLeft(0x30B3BDC ^ n2, 3) - 1656348383) * 51067869;
                    n3 = -2059053517 * -1929857833 + -1413953183 ^ n2 ^ 0xECF24B75 ^ 0xECF24B75;
                    int cfr_ignored_19 = Integer.rotateRight(0x26C08C07 ^ n2, 7) - -1246850028;
                    --n;
                    continue block28;
                }
                case 1192523938: {
                    int cfr_ignored_20 = Integer.rotateLeft(0xFE016109 ^ n2, 18) + -964141230;
                    int cfr_ignored_21 = (int)(0x3CB3CF3427D4EB4FL ^ (long)n2 ^ 0x6318831A2DB9D4B6L);
                    try {
                        n += 4;
                        n3 = Integer.reverse(Integer.reverse(-2059053517 * -1929857833 + -1413953183 ^ n2));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)(-2059053517 * -1929857833 + -1413953183 ^ n2) ^ 0x43279E33FC221FE9L ^ 0x43279E33FC221FE9L);
                    }
                    n -= 2;
                    continue block28;
                }
                case 1876293563: {
                    int cfr_ignored_22 = (Integer.rotateRight(0xCD15B21E ^ n2, 12) - -637652771) * -854216161;
                    n3 = (-2059053517 * -1929857833 + -1413953183 ^ n2) + -174046378 - -174046378;
                    n -= 4;
                    continue block28;
                }
                case 979768738: {
                    int cfr_ignored_23 = (Integer.rotateRight(0x8C6FCFF7 ^ n2, 4) - 99077668) * -1938829321;
                    n3 = -622056566 * -1929857833 + -1413953183 ^ n2 ^ 0x3381B0A7 ^ 0x3381B0A7;
                    int cfr_ignored_24 = (Integer.rotateLeft(0x6933C6D8 ^ n2, 16) + -1046301853) * 1765000921;
                    try {
                        n += 2;
                        n3 = -2059053517 * -1929857833 + -1413953183 ^ n2 ^ 0x50EB2533 ^ 0x50EB2533;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = -2059053517 * -1929857833 + -1413953183 ^ n2;
                    }
                    continue block28;
                }
                case -1179426644: {
                    int cfr_ignored_25 = Integer.rotateRight(0xE02C572B ^ n2, 15) + 700198256;
                    n3 = -1041176100 * -1929857833 + -1413953183 ^ n2;
                    int cfr_ignored_26 = Integer.rotateLeft(0x39FA048 ^ n2, 3) + 1957824499;
                    n3 = -2059053517 * -1929857833 + -1413953183 ^ n2 ^ 0x2B9AC629 ^ 0x2B9AC629;
                    n -= 5;
                    continue block28;
                }
            }
            int cfr_ignored_27 = (Integer.rotateLeft(0x9EF38FD1 ^ n2, 6) + 1138493834) * -1628205103;
            int cfr_ignored_28 = (int)(0x5C4121EC27D4EB4FL ^ (long)n2 ^ 0xBEA8831A2DB91553L);
            n3 = (int)((long)(-2059053517 * -1929857833 + -1413953183 ^ n2) ^ 0xF00E3468C3F49035L ^ 0xF00E3468C3F49035L);
        }
    }

    @Override
    public void nc() {
        try {
            int n = 639219905;
            n = Integer.rotateLeft(n * 1983707095, 12) ^ 0x870505F6;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 8);
            int n2 = n ^ 0x5B6C0FB5;
            if ((n2 ^ n) != 1533808565) {
                int cfr_ignored_0 = (0x7D75B774 ^ n) + -233493740;
            }
            if ((0x2B6 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        this.khmb.clear();
        this.jtkh.clear();
        this.tz_3.clear();
        this.shdy_2.clear();
    }

    private void ghhd_2() {
        int n;
        int n2 = 659092432;
        n2 = Integer.rotateLeft(n2 * 706110383, 21) ^ 0x4945B20E;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = n2 ^ 0x76309520;
        if ((n3 ^ n2) != 1982895392) {
            int cfr_ignored_0 = (0x517866F0 ^ n2) + 1018966348;
        }
        this.dhjd_2.clear();
        this.thzh_2.clear();
        for (n = 1; n <= (0xCC83E76C ^ 0xCC83E779); ++n) {
            this.dhjd_2.add(new ttb(class_2960.method_60655((String)"minecraft", (String)("vegaline/modules/dashtrail/dashcubics/dashcubic" + n + ".png"))));
        }
        for (n = 1; n <= zsa_3.length; ++n) {
            ArrayList<ttb> arrayList = new ArrayList<ttb>();
            for (int i = 1; i <= zsa_3[n - 1]; ++i) {
                arrayList.add(new ttb(nth.djz_3("minecraft", "vegaline/modules/dashtrail/dashcubics/group_dashs/group" + n + "/dashcubic" + i + ".png")));
            }
            this.thzh_2.add(arrayList);
        }
    }

    private void jft_2() {
        if (nth.mc.field_1687 == null || nth.mc.field_1724 == null) {
            this.khmb.clear();
            this.jtkh.clear();
            this.tz_3.clear();
            this.shdy_2.clear();
            return;
        }
        if (!this.dlq_2()) {
            this.khmb.clear();
            this.jtkh.clear();
            this.tz_3.clear();
            this.shdy_2.clear();
            return;
        }
        this.shdy_2.clear();
        for (class_1657 class_16572 : nth.mc.field_1687.method_18456()) {
            if (!this.shth_8(class_16572)) continue;
            int n = class_16572.method_5628();
            class_243 class_2432 = class_16572.method_19538();
            class_243 class_2433 = (class_243)this.tz_3.get(n);
            if (class_2433 == null) {
                class_2433 = new class_243(class_16572.field_6014, class_16572.field_6036, class_16572.field_5969);
            }
            this.rsa_4(class_16572, class_2433, class_2432);
            this.tz_3.put(n, class_2432);
            this.shdy_2.add(n);
        }
        this.tz_3.keySet().removeIf(this::thjn);
        this.shnm();
    }

    private void rsa_4(class_1657 class_16572, class_243 class_2432, class_243 class_2433) {
        double d;
        int n = tthm.dsa_3(898487033);
        n = System.identityHashCode(this) ^ n;
        class_243 class_2434 = class_2432;
        n = Integer.rotateRight((class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n, 4);
        int n2 = n ^ 0x4CF98FDD;
        if ((n2 ^ n) != 1291423709) {
            int cfr_ignored_0 = Integer.rotateLeft(0x79745D24 ^ n, 18) - -1183521129;
        }
        double d2 = class_2433.field_1352 - class_2432.field_1352;
        double d3 = class_2433.field_1351 - class_2432.field_1351;
        double d4 = class_2433.field_1350 - class_2432.field_1350;
        double d5 = nth.hths_2(d2 * d2 + d3 * d3 + d4 * d4);
        double d6 = Math.sqrt(d2 * d2 + d4 * d4);
        if (d6 < (d = Math.max(Double.longBitsToDouble(0x67403B310AE1EF1EL ^ 0x5810597CD81046E2L), (double)this.radh_2.thw_5()))) {
            return;
        }
        boolean bl = this.han_2.shzl() || this.khsth.shzl();
        int n3 = class_3532.method_15340((int)((int)(d5 / nth.zzt_4(0x91A986FE02532E87L ^ 0xAE1DFC1F45FD3AFCL) * (double)this.dhws_2.thw_5())), (int)1, (int)(0x10C84D4B ^ 0x10C84D5B));
        for (int i = 0; i < n3; ++i) {
            bmh_2 bmh2 = new bmh_2(this, class_16572, class_2432, class_2433, Float.intBitsToFloat(Integer.rotateLeft(0x53439AD ^ 0x1B8C6844, 21)), new byj(this), (float)i / (float)n3, nth.jkq(this));
            this.khmb.add(new bhs_4(this, bmh2, bl));
        }
        this.bth_5();
    }

    private void shnm() {
        for (bhs_4 bhs2 : this.khmb) {
            if (bhs2.aaz_3() >= 1.0f) {
                bhs2.dhdhl = 0.0f;
            }
            bhs2.khky();
        }
        this.khmb.removeIf(nth::rld_2);
        List list = this.ghzz_2();
        int n = this.dhyr.shzl() ? list.size() : -1;
        for (int i = 0; i < list.size(); ++i) {
            bhs_4 bhs3 = i + 1 < n ? (bhs_4)list.get(i + 1) : null;
            ((bhs_4)list.get(i)).tzy_4(bhs3);
        }
        this.bth_5();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void bth_5() {
        var1_1 = 0;
        var2_2 = 0;
        var5_3 = 0;
        var3_4 = -2099960818;
        var3_4 = Integer.rotateLeft(var3_4 * -1910429945, 13) ^ 1239090211;
        var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ 1990296882, 15)));
        block31: while (true) {
            if ((var5_3 = Integer.rotateRight(var4_5, 15) ^ var3_4) == -18014305) ** GOTO lbl-1000
            if (var5_3 == 764092112) ** GOTO lbl101
            if (var5_3 != 1147474458) {
                switch (var5_3) {
                    case 1990296882: {
                        (Integer.rotateLeft(-594920367 ^ var3_4, 14) + -1189417718) * -594920367;
                        (int)(2177651413056023375L ^ (long)var3_4 ^ -2762814222932274784L);
                        if (yf.khdha_2()) {
                            var4_5 = Integer.rotateLeft(var3_4 ^ -2106892261, 15) + 1908092162 - 1908092162;
                            Integer.rotateLeft(1437558336 ^ var3_4, 13) + 1687879931;
                            var4_5 = (int)((long)Integer.rotateLeft(var3_4 ^ -587100710, 15) ^ -3272824922988872505L ^ -3272824922988872505L);
                            var5_3 += 3;
                            continue block31;
                        }
                        try {
                            var5_3 += 3;
                            if ((-1944657485043695313L ^ (long)var3_4 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            var4_5 = Integer.rotateLeft(var3_4 ^ -1367799048, 15);
                        }
                        catch (NoSuchElementException v0) {
                            var4_5 = Integer.rotateLeft(var3_4 ^ -1367799048, 15);
                        }
                        var5_3 -= 4;
                        continue block31;
                    }
                    case -1367799048: {
                        (Integer.rotateRight(-987079297 ^ var3_4, 11) - -461442660) * -987079297;
                        yf.athz_2();
                        try {
                            var5_3 += 4;
                            if ((-4363285452743765527L ^ (long)var3_4 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            var4_5 = Integer.rotateLeft(var3_4 ^ -587100710, 15) ^ 557822550 ^ 557822550;
                        }
                        catch (NoSuchElementException v1) {
                            var4_5 = Integer.rotateLeft(var3_4 ^ -587100710, 15) + -432897552 - -432897552;
                        }
                        var5_3 += 3;
                        continue block31;
                    }
                    case 1848011862: {
                        (Integer.rotateLeft(388632733 ^ var3_4, 5) - -764042690) * 388632733;
                        (int)(-3055482752098571441L ^ (long)var3_4 ^ -9209717089513240864L);
                        this.khmb.subList(0, var2_2).clear();
                        (int)(528963783968615552L ^ (long)var3_4 ^ 9148033835700036479L);
                        var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ -878621924, 15)));
                        (int)(-7340737118580779399L ^ (long)var3_4 ^ 1263081971204266385L);
                        var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ 1773133386, 15)));
                        continue block31;
                    }
                    case -587100710: {
                        (Integer.rotateLeft(-1277240587 ^ var3_4, 9) - -866508058) * -1277240587;
                        (int)(8173035826781154127L ^ (long)var3_4 ^ 1504346424001253129L);
                        var1_1 = Math.max(1, Math.round(this.zdhsh.thw_5()));
                        var2_2 = this.khmb.size() - var1_1;
                        if (var2_2 > 0) {
                            var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ 1848011862, 15)));
                            (Integer.rotateRight(35362487 ^ var3_4, 3) - 1169481572) * 35362487;
                            ++var5_3;
                            continue block31;
                        }
                        var4_5 = Integer.rotateLeft(var3_4 ^ -1169876853, 15) ^ 1150424193 ^ 1150424193;
                        (Integer.rotateLeft(-1210771019 ^ var3_4, 9) - 1194048550) * -1210771019;
                        (int)(8459932220450466639L ^ (long)var3_4 ^ -7899169597948344546L);
                        var4_5 = Integer.rotateLeft(var3_4 ^ 1773133386, 15) ^ 1630670380 ^ 1630670380;
                        var5_3 += 4;
                        continue block31;
                    }
                    case 1622687372: {
                        Integer.rotateRight(-1887364310 ^ var3_4, 4) + 1694493009;
                        var4_5 = Integer.rotateLeft(var3_4 ^ -292928021, 15) + -181282030 - -181282030;
                        Integer.rotateRight(34257031 ^ var3_4, 3) - 1135212436;
                        var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15);
                        var5_3 -= 2;
                        continue block31;
                    }
                }
            }
            ** GOTO lbl235
lbl-1000:
            // 1 sources

            {
                Integer.rotateLeft(-1721737527 ^ var3_4, 6) + -1761011310;
                (int)(6616615733991631695L ^ (long)var3_4 ^ 2060540977981495924L);
                var4_5 = (int)((long)Integer.rotateLeft(var3_4 ^ 2104186658, 15) ^ 3459359316179155359L ^ 3459359316179155359L);
                Integer.rotateLeft(-1052232540 ^ var3_4, 11) - 1813774103;
                var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15) + -1581470938 - -1581470938;
                continue block31;
lbl101:
                // 1 sources

                (Integer.rotateLeft(-571913135 ^ var3_4, 14) + -476193526) * -571913135;
                (int)(2259648592209046351L ^ (long)var3_4 ^ 4154714804708807526L);
                var4_5 = Integer.rotateLeft(var3_4 ^ -1207899857, 15) ^ -94529387 ^ -94529387;
                Integer.rotateLeft(1161065352 ^ var3_4, 11) + 1706532019;
                var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15) + -660896289 - -660896289;
                Integer.rotateLeft(-836138003 ^ var3_4, 12) - -77229842;
                (int)(908361325796977487L ^ (long)var3_4 ^ -5273571015191317273L);
                var5_3 += 3;
                continue block31;
                case -456169620: {
                    (Integer.rotateLeft(-717732976 ^ var3_4, 13) + -701641301) * -717732975;
                    var4_5 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var3_4 ^ 1518414184, 15)));
                    (Integer.rotateLeft(-440754983 ^ var3_4, 15) + -705258110) * -440754983;
                    (int)(2812553922795072335L ^ (long)var3_4 ^ -7442054235770199103L);
                    try {
                        --var5_3;
                        if ((-1887552907026802967L ^ (long)var3_4 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15);
                    }
                    catch (UnsupportedOperationException v2) {
                        var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15) + -1763106537 - -1763106537;
                    }
                    var5_3 += 3;
                    continue block31;
                }
                case 1485838794: {
                    (Integer.rotateLeft(387429909 ^ var3_4, 5) - -801330234) * 387429909;
                    (int)(-3052006611727619249L ^ (long)var3_4 ^ -3665785948220160357L);
                    var4_5 = (int)((long)Integer.rotateLeft(var3_4 ^ 741354210, 15) ^ 4812615004056689852L ^ 4812615004056689852L);
                    (Integer.rotateRight(11690686 ^ var3_4, 3) - 435655741) * 11690687;
                    (int)(8512593250802314279L ^ (long)var3_4 ^ 7033411336837611924L);
                    var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15);
                    var5_3 -= 2;
                    continue block31;
                }
                case -1642105044: {
                    (Integer.rotateLeft(1841364565 ^ var3_4, 16) - 1320971142) * 1841364565;
                    (int)(-5804488561452061873L ^ (long)var3_4 ^ 6746536390260486965L);
                    var4_5 = Integer.rotateLeft(var3_4 ^ 614734279, 15) ^ 762389016 ^ 762389016;
                    (Integer.rotateLeft(661172340 ^ var3_4, 7) - -905249465) * 661172341;
                    try {
                        var5_3 += 3;
                        if ((-3708754731134897973L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15) ^ -1040827482 ^ -1040827482;
                    }
                    catch (IllegalArgumentException v3) {
                        var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15) ^ 723699106 ^ 723699106;
                    }
                    var5_3 -= 5;
                    continue block31;
                }
                case 943799538: {
                    Integer.rotateLeft(-649178836 ^ var3_4, 14) - 1423537039;
                    (int)(-505676768848982508L ^ (long)var3_4 ^ 1017839484886998055L);
                    var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15) + -730989100 - -730989100;
                    var5_3 += 4;
                    continue block31;
                }
                case 1903241259: {
                    Integer.rotateLeft(952129737 ^ var3_4, 10) + -475504750;
                    (int)(-399985888381834417L ^ (long)var3_4 ^ 1195849849526311220L);
                    var4_5 = Integer.rotateLeft(var3_4 ^ 374894935, 15) + 1736927611 - 1736927611;
                    Integer.rotateRight(-1859721269 ^ var3_4, 5) + -1743540016;
                    try {
                        var5_3 -= 2;
                        if ((3976310591932676621L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15);
                    }
                    catch (IllegalArgumentException v4) {
                        var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15) + 67522008 - 67522008;
                    }
                    var5_3 += 3;
                    continue block31;
                }
                case 1110245439: {
                    (Integer.rotateLeft(1652769432 ^ var3_4, 15) + -230510685) * 1652769433;
                    var4_5 = Integer.rotateLeft(var3_4 ^ -1589269868, 15);
                    (Integer.rotateRight(-1632754533 ^ var3_4, 6) + 997461504) * -1632754533;
                    (int)(-5572077002949129481L ^ (long)var3_4 ^ -33468567302649719L);
                    var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15);
                    var5_3 -= 4;
                    continue block31;
                }
                case -509310644: {
                    (Integer.rotateLeft(-508065936 ^ var3_4, 15) + 1503069643) * -508065935;
                    (int)(-131060082938233695L ^ (long)var3_4 ^ 4497368439465464205L);
                    var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15) ^ 1185162289 ^ 1185162289;
                    var5_3 += 5;
                    continue block31;
                }
                case -1054567301: {
                    Integer.rotateLeft(1784693253 ^ var3_4, 16) - -435839530;
                    (int)(-6281698804297831601L ^ (long)var3_4 ^ 2666275127862819956L);
                    try {
                        var5_3 -= 4;
                        var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15);
                    }
                    catch (UnsupportedOperationException v5) {
                        var4_5 = (int)((long)Integer.rotateLeft(var3_4 ^ 1990296882, 15) ^ 4537978485011393727L ^ 4537978485011393727L);
                    }
                    var5_3 += 5;
                    continue block31;
                }
                case -397152160: {
                    (Integer.rotateLeft(482074452 ^ var3_4, 6) - 2132650599) * 482074453;
                    try {
                        var5_3 -= 2;
                        if ((2401827974693808913L ^ (long)var3_4 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15) ^ -1333841108 ^ -1333841108;
                    }
                    catch (ArithmeticException v6) {
                        var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15);
                    }
                    --var5_3;
                    continue block31;
                }
lbl235:
                // 1 sources

                (Integer.rotateLeft(1308839481 ^ var3_4, 12) + 1992562722) * 1308839481;
                (int)(-8308613529069098161L ^ (long)var3_4 ^ 4429434381978350770L);
                var4_5 = Integer.rotateLeft(var3_4 ^ 145079110, 15) + 1052691262 - 1052691262;
                Integer.rotateRight(114133926 ^ var3_4, 3) - -683571115;
                var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15) ^ 1271125973 ^ 1271125973;
                var5_3 += 5;
                continue block31;
                default: {
                    Integer.rotateRight(95662763 ^ var3_4, 3) + -1256177168;
                    var4_5 = Integer.rotateLeft(var3_4 ^ 1990296882, 15) + 2071121656 - 2071121656;
                    continue block31;
                }
                ** case 1773133386:
            }
            break;
        }
lbl251:
        // 1 sources

        Integer.rotateRight(1446610018 ^ var3_4, 13) + 1968482073;
    }

    private void hth_5(class_4587 class_45872, float f) {
        if (this.khmb.isEmpty() || nth.mc.field_1773 == null) {
            return;
        }
        List list = this.ghzz_2();
        if (list.isEmpty()) {
            return;
        }
        class_4184 class_41842 = nth.mc.field_1773.method_19418();
        class_243 class_2432 = class_41842.method_19326();
        this.zzn(false);
        if (this.khsth.shzl()) {
            this.shtj_2(class_45872, class_41842, class_2432, list, f);
        }
        if (this.han_2.shzl()) {
            this.zdd_3(class_45872, class_2432, list, f);
        }
        this.shdd_2();
        this.zzn(true);
        this.zhm_4(class_45872, class_41842, class_2432, list, f);
        this.dhqm(class_45872, class_41842, class_2432, list, f);
        this.shdd_2();
    }

    private void shtj_2(class_4587 class_45872, class_4184 class_41842, class_243 class_2432, List list, float f) {
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)this.dll.shtz_2());
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        boolean bl = false;
        for (bhs_4 bhs2 : list) {
            class_243 class_2433 = bhs2.syh_4(f);
            for (tds tds2 : bhs2.zss) {
                class_243 class_2434 = tds2.dlk(f);
                float f2 = this.dhth((float)(tds2.jdm_2() * (double)bhs2.shdgh)) * this.bst_3.thw_5();
                int n = this.amj(this.khdhdh(bhs2.slsh, -1, f2), f2 / 1.33333f);
                this.thfj(class_2872, class_45872, class_2433.method_1019(class_2434).method_1020(class_2432), class_41842, this.ththf.thw_5(), n);
                this.thfj(class_2872, class_45872, class_2433.method_1020(class_2434).method_1020(class_2432), class_41842, this.ththf.thw_5(), n);
                bl = true;
            }
        }
        this.akh(class_2872, bl);
    }

    private void zdd_3(class_4587 class_45872, class_243 class_2432, List list, float f) {
        RenderSystem.setShader((class_10156)class_10142.field_53864);
        RenderSystem.lineWidth((float)this.thrt.thw_5());
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27377, class_290.field_29337);
        boolean bl = false;
        for (bhs_4 bhs2 : list) {
            class_243 class_2433 = bhs2.syh_4(f);
            for (tds tds2 : bhs2.zss) {
                class_243 class_2434 = tds2.dlk(f);
                float f2 = this.dhth((float)(tds2.jdm_2() * (double)bhs2.shdgh)) * this.bst_3.thw_5();
                int n = this.amj(this.khdhdh(bhs2.slsh, -1, 1.0f - f2), f2 / 3.0f);
                this.tmh_2(class_45872, (class_4588)class_2872, class_2433.method_1019(class_2434).method_1020(class_2432), class_2433.method_1020(class_2434).method_1020(class_2432), n);
                bl = true;
            }
        }
        this.akh(class_2872, bl);
        RenderSystem.lineWidth((float)1.0f);
    }

    private void zhm_4(class_4587 class_45872, class_4184 class_41842, class_243 class_2432, List list, float f) {
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_2960 class_29602 = null;
        class_287 class_2872 = null;
        boolean bl = false;
        for (bhs_4 bhs2 : list) {
            ttb ttb2 = bhs2.hthk.thd_4.tqgh_2();
            if (ttb2 == null) continue;
            if (!ttb2.shtz_2().equals(class_29602)) {
                if (bl && class_2872 != null) {
                    this.akh(class_2872, bl);
                }
                class_29602 = ttb2.shtz_2();
                RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
                class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
                bl = false;
            }
            bl |= this.bmt(class_2872, class_45872, class_41842, class_2432, bhs2, ttb2, f);
        }
        if (class_2872 != null) {
            this.akh(class_2872, bl);
        }
    }

    private void dhqm(class_4587 class_45872, class_4184 class_41842, class_243 class_2432, List list, float f) {
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)this.dll.shtz_2());
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        boolean bl = false;
        for (bhs_4 bhs2 : list) {
            bl |= this.hh_2(class_2872, class_45872, class_41842, class_2432, bhs2, f);
        }
        this.akh(class_2872, bl);
    }

    private boolean bmt(class_287 class_2872, class_4587 class_45872, class_4184 class_41842, class_243 class_2432, bhs_4 bhs2, ttb ttb2, float f) {
        float f2 = bhs2.shdgh * this.bst_3.thw_5();
        if (f2 <= 0.01f) {
            return false;
        }
        float f3 = 0.033f * f2 * this.bdq_2.thw_5();
        float f4 = (float)ttb2.anh() * f3;
        float f5 = (float)ttb2.had_4() * f3;
        int n = this.amj(this.bfs_2(this.khdhdh(bhs2.slsh, -1, 0.4f), 0.55f + 0.45f * f2), f2);
        class_45872.method_22903();
        class_243 class_2433 = bhs2.syh_4(f).method_1020(class_2432);
        class_45872.method_22904(class_2433.field_1352, class_2433.field_1351, class_2433.field_1350);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-bhs2.dhn_2));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(bhs2.bwq));
        class_45872.method_22905(-0.1f, -0.1f, 0.1f);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        this.zysh_2(class_2872, matrix4f, -f4 / 2.0f, -f5 / 2.0f, f4 / 2.0f, f5 / 2.0f, n);
        class_45872.method_22909();
        return true;
    }

    private boolean hh_2(class_287 class_2872, class_4587 class_45872, class_4184 class_41842, class_243 class_2432, bhs_4 bhs2, float f) {
        ttb ttb2 = bhs2.hthk.thd_4.tqgh_2();
        if (ttb2 == null) {
            return false;
        }
        float f2 = bhs2.shdgh * this.bst_3.thw_5();
        if (f2 <= 0.01f) {
            return false;
        }
        float f3 = 0.033f * f2 * this.bdq_2.thw_5();
        float f4 = (float)ttb2.anh() * f3;
        float f5 = (float)ttb2.had_4() * f3;
        float f6 = (float)Math.sqrt(f4 * f4 + f5 * f5) * this.dght.thw_5();
        float f7 = class_3532.method_15363((float)(1.0f - bhs2.aaz_3()), (float)0.0f, (float)1.0f);
        int n = this.khdhdh(bhs2.slsh, -1, 0.15f);
        class_45872.method_22903();
        class_243 class_2433 = bhs2.syh_4(f).method_1020(class_2432);
        class_45872.method_22904(class_2433.field_1352, class_2433.field_1351, class_2433.field_1350);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-class_41842.method_19330()));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(class_41842.method_19329()));
        class_45872.method_22905(-0.1f, -0.1f, 0.1f);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f8 = f6 / 1.75f;
        this.zysh_2(class_2872, matrix4f, -f8, -f8, f8, f8, this.amj(n, 0.21568628f * f2));
        if (this.rtkh.shzl()) {
            float f9 = f2;
            float f10 = f6 * (1.0f + 6.0f * f7 * f9);
            int n2 = this.amj(this.bfs_2(n, f9 / 4.0f), 0.3529412f * f9);
            this.zysh_2(class_2872, matrix4f, -f10 / 2.0f, -f10 / 2.0f, f10 / 2.0f, f10 / 2.0f, n2);
        }
        class_45872.method_22909();
        return true;
    }

    private void akh(class_287 class_2872, boolean bl) {
        class_9801 class_98012 = class_2872.method_60794();
        if (bl && class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
    }

    private void zysh_2(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, int n) {
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        int n5 = n >> 24 & 0xFF;
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22913(0.0f, 0.0f).method_1336(n2, n3, n4, n5);
        class_2872.method_22918(matrix4f, f, f4, 0.0f).method_22913(0.0f, 1.0f).method_1336(n2, n3, n4, n5);
        class_2872.method_22918(matrix4f, f3, f4, 0.0f).method_22913(1.0f, 1.0f).method_1336(n2, n3, n4, n5);
        class_2872.method_22918(matrix4f, f3, f2, 0.0f).method_22913(1.0f, 0.0f).method_1336(n2, n3, n4, n5);
    }

    private void thfj(class_287 class_2872, class_4587 class_45872, class_243 class_2432, class_4184 class_41842, float f, int n) {
        class_45872.method_22903();
        class_45872.method_22904(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(180.0f - class_41842.method_19330()));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(-class_41842.method_19329()));
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        int n5 = n >> 24 & 0xFF;
        class_2872.method_22918(matrix4f, -f, -f, 0.0f).method_22913(0.0f, 0.0f).method_1336(n2, n3, n4, n5);
        class_2872.method_22918(matrix4f, -f, f, 0.0f).method_22913(0.0f, 1.0f).method_1336(n2, n3, n4, n5);
        class_2872.method_22918(matrix4f, f, f, 0.0f).method_22913(1.0f, 1.0f).method_1336(n2, n3, n4, n5);
        class_2872.method_22918(matrix4f, f, -f, 0.0f).method_22913(1.0f, 0.0f).method_1336(n2, n3, n4, n5);
        class_45872.method_22909();
    }

    private void tmh_2(class_4587 class_45872, class_4588 class_45882, class_243 class_2432, class_243 class_2433, int n) {
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        Matrix4f matrix4f = class_46652.method_23761();
        Vector3f vector3f = this.thjd_2(class_2432, class_2433);
        int n2 = n >> 16 & 0xFF;
        int n3 = n >> 8 & 0xFF;
        int n4 = n & 0xFF;
        int n5 = n >> 24 & 0xFF;
        class_45882.method_22918(matrix4f, (float)class_2432.field_1352, (float)class_2432.field_1351, (float)class_2432.field_1350).method_1336(n2, n3, n4, n5).method_60831(class_46652, vector3f.x(), vector3f.y(), vector3f.z());
        class_45882.method_22918(matrix4f, (float)class_2433.field_1352, (float)class_2433.field_1351, (float)class_2433.field_1350).method_1336(n2, n3, n4, n5).method_60831(class_46652, vector3f.x(), vector3f.y(), vector3f.z());
    }

    private Vector3f thjd_2(class_243 class_2432, class_243 class_2433) {
        try {
            int n = 742151463;
            n = Integer.rotateLeft(n * -326674443, 14) ^ 0x2688FA5B;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x21D2FCD;
            if ((n2 ^ n) != 35467213) {
                int cfr_ignored_0 = (0x2E217AEA ^ n) + -956998440;
            }
            if ((0x19F & 0) != 0) {
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
        float f = (float)(class_2433.field_1352 - class_2432.field_1352);
        float f2 = (float)(class_2433.field_1351 - class_2432.field_1351);
        float f3 = (float)(class_2433.field_1350 - class_2432.field_1350);
        float f4 = class_3532.method_15355((float)(f * f + f2 * f2 + f3 * f3));
        if (f4 <= Float.intBitsToFloat(1767160083 + -813892092)) {
            return new Vector3f(0.0f, 1.0f, 0.0f);
        }
        return new Vector3f(f / f4, f2 / f4, f3 / f4);
    }

    private void zzn(boolean bl) {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)(bl ? GlStateManager.class_4534.ONE : GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA));
        RenderSystem.disableCull();
        if (this.hzm.shzl()) {
            RenderSystem.disableDepthTest();
        } else {
            RenderSystem.enableDepthTest();
        }
        RenderSystem.depthMask((boolean)false);
    }

    private void shdd_2() {
        RenderSystem.depthMask((boolean)true);
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        RenderSystem.lineWidth((float)1.0f);
    }

    private List ghzz_2() {
        try {
            int n = -1552917707;
            n = Integer.rotateLeft(n * 1247178165, 18) ^ 0x8D84BDBD;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x5CFAD104;
            if ((n2 ^ n) != 1559941380) {
                int cfr_ignored_0 = (0xFF8A8A31 ^ n) - 825374604;
            }
            if ((0x271 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        this.jtkh.clear();
        for (bhs_4 bhs2 : this.khmb) {
            if (bhs2 == null || !(bhs2.shdgh > Float.intBitsToFloat(Integer.reverse(639062004) ^ 0x12BE24A9))) continue;
            this.jtkh.add(bhs2);
        }
        return this.jtkh;
    }

    private boolean shth_8(class_1657 class_16572) {
        try {
            int n = -1287164245;
            n = Integer.rotateLeft(n * -1563940741, 4) ^ 0x4152A9A4;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 22);
            class_1657 class_16573 = class_16572;
            n = Integer.rotateRight((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 22);
            int n2 = n ^ 0x9328ADF3;
            if ((n2 ^ n) != -1826050573) {
                int cfr_ignored_0 = (0x206FC358 ^ n) + -226156224;
            }
            if ((0x135 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (class_16572 == null || !class_16572.method_5805() || class_16572.method_5767()) {
            return false;
        }
        if (class_16572 == nth.mc.field_1724) {
            return this.tzd_2.shzl() && (nth.jhsh(this.hbd_2) || nth.mc.field_1690.method_31044() != class_5498.field_26664);
        }
        if (nth.mc.field_1724 == null || nth.thzgh_2(nth.mc.field_1724, (class_1297)class_16572) > nth.tkw(this.dyz_2)) {
            return false;
        }
        boolean bl = nth.dhdh_2(nth.shdd_3().getFriendManager(), class_16572.method_5477().getString());
        return bl && nth.ghrz(this.wd_2) || !bl && this.rdhd_2.shzl();
    }

    private boolean dlq_2() {
        try {
            int n = -769428408;
            n = Integer.rotateLeft(n * -277733887, 19) ^ 0xDF33D476;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0xD11045F4;
            if ((n2 ^ n) != -787462668) {
                int cfr_ignored_0 = (0x33331BC ^ n) + -332147333;
            }
            if ((0x31F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return nth.atj_2(this.tzd_2) || this.rdhd_2.shzl() || nth.dnj_2(this.wd_2);
    }

    private int tshz_2() {
        block0: {
            int n = tthm.dsa_3(-1932895241);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
            int n2 = n ^ 0x51279C40;
            if ((n2 ^ n) == 1361550400) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xDDEDC7B7 ^ n, 14) - -467087772) * -571619401;
        }
        return (int)((float)(-1822196734 - -1822197284 + this.jdb.nextInt(Integer.rotateLeft(0x3BFE7293 ^ 0x1E7E7293, 11))) * this.shrn.thw_5());
    }

    private int slh_2() {
        int n = -868353807;
        n = Integer.rotateLeft(n * 486276159, 12) ^ 0x4A97813;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 6);
        int n2 = n ^ 0x2E794ECC;
        if ((n2 ^ n) != 779701964) {
            int cfr_ignored_0 = (0xE244B63D ^ n) - 1757501326;
        }
        String string = nth.shshb(nth.sfdh_2(this.btn));
        int n3 = -1;
        switch (nth.shsth(string)) {
            case 2021122027: {
                if (!string.equals("Client")) break;
                n3 = 0;
                break;
            }
            case 2029746065: {
                if (!string.equals("Custom")) break;
                n3 = 1;
                break;
            }
            case -1656737386: {
                if (!string.equals("Rainbow")) break;
                n3 = 2;
            }
        }
        switch (n3) {
            case 0: {
                return nth.ath_5(nth.wt(this.jdb.nextInt(Integer.reverse(-727555088) ^ 0xFC64443)));
            }
            case 1: {
                return nth.tsj_3(this.dss_2.sdsh_4());
            }
            case 2: {
                return Color.getHSBColor((float)(System.currentTimeMillis() % (0x5468EEE2C3ABB5ACL ^ 0x5468EEE2C3ABB644L)) / Float.intBitsToFloat(2109940390 + -961094310), Float.intBitsToFloat(0x9DAB3A14 ^ 0xA2E7F6D9), 1.0f).getRGB();
            }
        }
        return nth.thf(Color.getHSBColor((float)this.jdb.nextInt(1372618473 + -1372618218) / nth.daa_7(1346984128 + -214587584), 1.0f, 1.0f));
    }

    /*
     * Unable to fully structure code
     */
    private ttb shq_2() {
        var1_1 = null;
        var4_2 = 0;
        var2_3 = -272295129;
        var2_3 = Integer.rotateLeft(var2_3 * -250902135, 7) ^ -602960711;
        var2_3 = Integer.rotateRight(System.identityHashCode(this) ^ var2_3, 20);
        var3_4 = Integer.reverse(var2_3 ^ 1028544061 ^ -188941077);
        block18: while (true) {
            if ((var4_2 = Integer.reverse(var3_4) ^ var2_3 ^ -188941077) == -629205018) ** GOTO lbl105
            if (var4_2 == 1858418623) ** GOTO lbl82
            Integer.rotateLeft(-1127216699 ^ var2_3, 10) - -510734826;
            (int)(9107026080758557519L ^ (long)var2_3 ^ -5584319389479907052L);
            if (var4_2 == 353343265) ** GOTO lbl65
            switch (var4_2) {
                case 1989386760: {
                    Integer.rotateLeft(98342596 ^ var2_3, 3) - -1173102345;
                    var1_1 = null;
                    var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ -1352215643 ^ -188941077)));
                    --var4_2;
                    continue block18;
                }
                case 1028544061: {
                    Integer.rotateRight(-34208594 ^ var2_3, 18) - -987221939;
                    if (this.dhjd_2.isEmpty()) {
                        var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ 2143697618 ^ -188941077)));
                        (Integer.rotateLeft(-975550608 ^ var2_3, 11) + -104053301) * -975550607;
                        var3_4 = Integer.reverse(var2_3 ^ 1989386760 ^ -188941077) + -767438857 - -767438857;
                        continue block18;
                    }
                    var3_4 = (int)((long)Integer.reverse(var2_3 ^ 411803206 ^ -188941077) ^ -7873501884359615732L ^ -7873501884359615732L);
                    Integer.rotateLeft(-1145225056 ^ var2_3, 10) + -1068993893;
                    continue block18;
                }
                case 411803206: {
                    Integer.rotateLeft(-622030807 ^ var2_3, 14) + -2029841358;
                    (int)(1755909161009605455L ^ (long)var2_3 ^ -9126400496406782611L);
                    var1_1 = (ttb)this.dhjd_2.get(nth.jhsh_2(this.jdb, this.dhjd_2.size()));
                    try {
                        if ((5017194530961260449L ^ (long)var2_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var3_4 = Integer.reverse(var2_3 ^ -1352215643 ^ -188941077);
                    }
                    catch (ArithmeticException v0) {
                        var3_4 = Integer.reverse(var2_3 ^ -1352215643 ^ -188941077) + 2094444195 - 2094444195;
                    }
                    var4_2 += 4;
                    continue block18;
                }
                case 778004848: {
                    (Integer.rotateLeft(-256103627 ^ var2_3, 17) - 723966630) * -256103627;
                    (int)(3606966621644843855L ^ (long)var2_3 ^ -621352600117589556L);
                    var3_4 = Integer.reverse(var2_3 ^ -1121486412 ^ -188941077) ^ -1968455766 ^ -1968455766;
                    Integer.rotateRight(2045848838 ^ var2_3, 18) - -929950987;
                    var3_4 = Integer.reverse(var2_3 ^ 1926687814 ^ -188941077) + 1368700832 - 1368700832;
                    (Integer.rotateRight(683043223 ^ var2_3, 8) - -227252092) * 683043223;
                    var3_4 = (int)((long)Integer.reverse(var2_3 ^ 1028544061 ^ -188941077) ^ -3268790774950901742L ^ -3268790774950901742L);
                    var4_2 += 3;
                    continue block18;
                }
lbl65:
                // 1 sources

                Integer.rotateLeft(-1993048511 ^ var2_3, 4) + -1581717222;
                (int)(5442266431386610511L ^ (long)var2_3 ^ 6739780990819449564L);
                var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ -1007565908 ^ -188941077)));
                Integer.rotateLeft(522926440 ^ var2_3, 6) + -895905069;
                try {
                    var4_2 -= 5;
                    if ((-3560758875574296047L ^ (long)var2_3 | 1L) == 0L) {
                        throw new UnsupportedOperationException();
                    }
                    var3_4 = Integer.reverse(var2_3 ^ 1028544061 ^ -188941077);
                }
                catch (UnsupportedOperationException v1) {
                    var3_4 = Integer.reverse(var2_3 ^ 1028544061 ^ -188941077);
                }
                var4_2 += 2;
                continue block18;
lbl82:
                // 1 sources

                (Integer.rotateRight(-1063316706 ^ var2_3, 11) - 1470164957) * -1063316705;
                var3_4 = Integer.reverse(var2_3 ^ 1028544061 ^ -188941077) + -1124336264 - -1124336264;
                Integer.rotateLeft(1677229740 ^ var2_3, 15) - 527758863;
                var4_2 += 2;
                continue block18;
                case -1445577479: {
                    Integer.rotateRight(293329194 ^ var2_3, 5) + 576514897;
                    var3_4 = Integer.reverse(var2_3 ^ 1028544061 ^ -188941077) + 1265208733 - 1265208733;
                    continue block18;
                }
                case -1369229394: {
                    (Integer.rotateLeft(742298000 ^ var2_3, 8) + 1609645995) * 742298001;
                    var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ 965785114 ^ -188941077)));
                    (Integer.rotateRight(595839419 ^ var2_3, 7) + 1364397280) * 595839419;
                    (int)(-7539750895436562281L ^ (long)var2_3 ^ 2626937341142926187L);
                    var3_4 = Integer.reverse(var2_3 ^ 1028544061 ^ -188941077) ^ -1983054161 ^ -1983054161;
                    var4_2 -= 4;
                    continue block18;
                }
lbl105:
                // 1 sources

                (Integer.rotateRight(1733955542 ^ var2_3, 15) - -2008708571) * 1733955543;
                var3_4 = Integer.reverse(var2_3 ^ 1623252455 ^ -188941077) + -1544572235 - -1544572235;
                Integer.rotateLeft(1201793281 ^ var2_3, 11) + -1325869478;
                (int)(-8857657718415758513L ^ (long)var2_3 ^ 8289019262634862583L);
                var3_4 = Integer.reverse(var2_3 ^ 1028544061 ^ -188941077) + -1568040566 - -1568040566;
                var4_2 -= 4;
                continue block18;
                case 752730498: {
                    (Integer.rotateLeft(-956915207 ^ var2_3, 11) + 473644130) * -956915207;
                    (int)(307388009724308303L ^ (long)var2_3 ^ -2091777878454065831L);
                    var3_4 = Integer.reverse(var2_3 ^ -52593993 ^ -188941077) + -1886052398 - -1886052398;
                    (Integer.rotateLeft(48854964 ^ var2_3, 3) - 1587748359) * 48854965;
                    var3_4 = Integer.reverse(var2_3 ^ 1028544061 ^ -188941077) + 1407255327 - 1407255327;
                    continue block18;
                }
                case -4937868: {
                    (Integer.rotateRight(-1778533158 ^ var2_3, 5) + 773291425) * -1778533157;
                    var3_4 = (int)((long)Integer.reverse(var2_3 ^ 857690295 ^ -188941077) ^ 8950088681997578087L ^ 8950088681997578087L);
                    Integer.rotateLeft(1159044128 ^ var2_3, 11) + 1643874075;
                    var3_4 = Integer.reverse(var2_3 ^ 650937251 ^ -188941077) + 1691469844 - 1691469844;
                    (Integer.rotateRight(821702426 ^ var2_3, 9) + -223784095) * 821702427;
                    var3_4 = Integer.reverse(var2_3 ^ 1028544061 ^ -188941077);
                    ++var4_2;
                    continue block18;
                }
                case 2138609249: {
                    (Integer.rotateRight(220910035 ^ var2_3, 4) + -1668479032) * 220910035;
                    var3_4 = Integer.reverse(var2_3 ^ 1028544061 ^ -188941077) ^ 772694925 ^ 772694925;
                    var4_2 += 4;
                    continue block18;
                }
                case 330409366: {
                    Integer.rotateRight(2010739523 ^ var2_3, 17) + -2018339752;
                    var3_4 = (int)((long)Integer.reverse(var2_3 ^ 1028544061 ^ -188941077) ^ -5711349096911406507L ^ -5711349096911406507L);
                    var4_2 -= 4;
                    continue block18;
                }
                case -391680249: {
                    (Integer.rotateRight(218800439 ^ var2_3, 4) - -1733876508) * 218800439;
                    var3_4 = (int)((long)Integer.reverse(var2_3 ^ -1842708367 ^ -188941077) ^ 3877345501028142877L ^ 3877345501028142877L);
                    Integer.rotateRight(1402984390 ^ var2_3, 13) - 616087605;
                    (int)(8451060841303719732L ^ (long)var2_3 ^ -7246654031449340095L);
                    var3_4 = (int)((long)Integer.reverse(var2_3 ^ 1028544061 ^ -188941077) ^ 2232816972294832192L ^ 2232816972294832192L);
                    --var4_2;
                    continue block18;
                }
                case -1352215643: {
                    return var1_1;
                }
            }
            (Integer.rotateRight(-2055028742 ^ var2_3, 3) + 791862913) * -2055028741;
            var3_4 = Integer.reverse(var2_3 ^ 1028544061 ^ -188941077) + 547802926 - 547802926;
        }
    }

    /*
     * Unable to fully structure code
     */
    private List shjsh() {
        var1_1 = null;
        var4_2 = 0;
        var2_3 = -878375685;
        var2_3 = Integer.rotateLeft(var2_3 * -1479766417, 20) ^ -1511234179;
        var3_4 = Integer.reverse(Integer.reverse(1218605070 + var2_3));
        block30: while (true) {
            if ((var4_2 = var3_4 - var2_3) == -92485107) ** GOTO lbl128
            if (var4_2 == -654559335) ** GOTO lbl97
            Integer.rotateRight(-791929014 ^ var2_3, 13) + 1293248817;
            if (var4_2 == 1218605070) ** GOTO lbl26
            switch (var4_2) {
                case -2140207125: {
                    Integer.rotateLeft(-912191988 ^ var2_3, 12) - 1860063919;
                    var1_1 = (List)this.thzh_2.get(nth.zysh(this.jdb, this.thzh_2.size()));
                    try {
                        var4_2 -= 2;
                        if ((-8848314459032635387L ^ (long)var2_3 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var3_4 = 877979702 + var2_3;
                    }
                    catch (UnsupportedOperationException v0) {
                        var3_4 = 877979702 + var2_3;
                    }
                    continue block30;
                }
lbl26:
                // 1 sources

                (Integer.rotateRight(684324022 ^ var2_3, 8) - -187547323) * 684324023;
                if (this.thzh_2.isEmpty()) {
                    try {
                        var4_2 += 2;
                        if ((3076929447278211477L ^ (long)var2_3 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var3_4 = 1554122206 + var2_3 + 424066552 - 424066552;
                    }
                    catch (UnsupportedOperationException v1) {
                        var3_4 = 1554122206 + var2_3;
                    }
                    continue block30;
                }
                (int)(4949635969036613030L ^ (long)var2_3 ^ -5039027245399989072L);
                var3_4 = (int)((long)(-2140207125 + var2_3) ^ -2755411911102250800L ^ -2755411911102250800L);
                var4_2 += 5;
                continue block30;
                case 1554122206: {
                    (Integer.rotateRight(-1661129605 ^ var2_3, 6) + 117834272) * -1661129605;
                    var1_1 = List.of();
                    try {
                        var4_2 -= 5;
                        if ((-9029539689995707639L ^ (long)var2_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var3_4 = 877979702 + var2_3 + 165589427 - 165589427;
                    }
                    catch (ArithmeticException v2) {
                        var3_4 = 877979702 + var2_3 + -1720545234 - -1720545234;
                    }
                    var4_2 -= 2;
                    continue block30;
                }
                case 1045943611: {
                    (Integer.rotateLeft(-1068585328 ^ var2_3, 11) + 1306837675) * -1068585327;
                    var3_4 = -458920324 + var2_3 + 1286380148 - 1286380148;
                    (Integer.rotateRight(-18895562 ^ var2_3, 18) - -512517947) * -18895561;
                    try {
                        var3_4 = Integer.reverse(Integer.reverse(1218605070 + var2_3));
                    }
                    catch (UnsupportedOperationException v3) {
                        var3_4 = 1218605070 + var2_3;
                    }
                    var4_2 -= 4;
                    continue block30;
                }
                case -1645105903: {
                    Integer.rotateLeft(1508473641 ^ var2_3, 14) + -408712910;
                    (int)(-7251968492405724337L ^ (long)var2_3 ^ 6293924627709729638L);
                    var3_4 = Integer.reverse(Integer.reverse(-295827107 + var2_3));
                    Integer.rotateLeft(-976561527 ^ var2_3, 11) + -135391790;
                    (int)(538308472581974863L ^ (long)var2_3 ^ 1448051428659143457L);
                    var3_4 = -518666176 + var2_3 ^ -2042005860 ^ -2042005860;
                    Integer.rotateRight(-1704012094 ^ var2_3, 6) + -1211522887;
                    var3_4 = 1218605070 + var2_3;
                    var4_2 += 3;
                    continue block30;
                }
                case -1715430404: {
                    Integer.rotateRight(-467961429 ^ var2_3, 15) + -1548657936;
                    (int)(-3091654640534568783L ^ (long)var2_3 ^ -8824555201491630111L);
                    var3_4 = -638969714 + var2_3 ^ -1372583776 ^ -1372583776;
                    (int)(-462628876222853034L ^ (long)var2_3 ^ 3425338809968647929L);
                    var3_4 = Integer.reverse(Integer.reverse(1218605070 + var2_3));
                    var4_2 -= 3;
                    continue block30;
                }
lbl97:
                // 1 sources

                (Integer.rotateLeft(-1491397955 ^ var2_3, 7) - 1084548126) * -1491397955;
                (int)(7325593527504923471L ^ (long)var2_3 ^ -8903472314851957118L);
                var3_4 = (int)((long)(868372071 + var2_3) ^ 6906127131842424633L ^ 6906127131842424633L);
                Integer.rotateRight(-254112666 ^ var2_3, 17) - 785686421;
                (int)(-146360633516009211L ^ (long)var2_3 ^ -649027517781617119L);
                var3_4 = -2139855635 + var2_3 + -1132556057 - -1132556057;
                (int)(-883693365199244149L ^ (long)var2_3 ^ 455203758439156393L);
                var3_4 = (int)((long)(1218605070 + var2_3) ^ -8476028384389502262L ^ -8476028384389502262L);
                var4_2 -= 2;
                continue block30;
                case -1583435887: {
                    Integer.rotateLeft(-2047143071 ^ var2_3, 3) + 1036318714;
                    (int)(5136845053495667535L ^ (long)var2_3 ^ -8662529734787652798L);
                    var3_4 = Integer.reverse(Integer.reverse(1245154158 + var2_3));
                    Integer.rotateRight(-1856934810 ^ var2_3, 5) - -1657159787;
                    try {
                        var4_2 -= 3;
                        var3_4 = 1218605070 + var2_3 ^ -1996054293 ^ -1996054293;
                    }
                    catch (IllegalStateException v4) {
                        var3_4 = 1218605070 + var2_3 + 626983799 - 626983799;
                    }
                    var4_2 -= 5;
                    continue block30;
                }
lbl128:
                // 1 sources

                Integer.rotateLeft(1393811781 ^ var2_3, 13) - 331736726;
                (int)(-7952988089476650161L ^ (long)var2_3 ^ 7169874755233287827L);
                var3_4 = Integer.reverse(Integer.reverse(41008070 + var2_3));
                (Integer.rotateRight(288461751 ^ var2_3, 5) - 425624164) * 288461751;
                try {
                    var4_2 += 5;
                    if ((5355085734631643169L ^ (long)var2_3 | 1L) == 0L) {
                        throw new UnsupportedOperationException();
                    }
                    var3_4 = 1218605070 + var2_3;
                }
                catch (UnsupportedOperationException v5) {
                    var3_4 = 1218605070 + var2_3;
                }
                var4_2 -= 3;
                continue block30;
                case -1803636749: {
                    Integer.rotateLeft(1482837956 ^ var2_3, 14) - -1203419145;
                    (int)(2556780427029408589L ^ (long)var2_3 ^ -436339852980655322L);
                    var3_4 = Integer.reverse(Integer.reverse(-307737024 + var2_3));
                    (int)(-4105547661515361905L ^ (long)var2_3 ^ -6251531392359324707L);
                    var3_4 = Integer.reverse(Integer.reverse(1218605070 + var2_3));
                    --var4_2;
                    continue block30;
                }
                case 1926347548: {
                    (Integer.rotateRight(481310523 ^ var2_3, 6) + 2108968800) * 481310523;
                    var3_4 = (int)((long)(1097036263 + var2_3) ^ -1125537274872153123L ^ -1125537274872153123L);
                    Integer.rotateRight(-1359326874 ^ var2_3, 8) - 883784341;
                    (int)(-1325694517628549056L ^ (long)var2_3 ^ -6716955491925854491L);
                    var3_4 = 797856822 + var2_3;
                    (int)(-3415517159153310796L ^ (long)var2_3 ^ -5257367181375697694L);
                    var3_4 = (int)((long)(1218605070 + var2_3) ^ -7234296678843262364L ^ -7234296678843262364L);
                    var4_2 -= 3;
                    continue block30;
                }
                case 20870926: {
                    (Integer.rotateRight(1439053942 ^ var2_3, 13) - 1734243717) * 1439053943;
                    var3_4 = Integer.reverse(Integer.reverse(684006623 + var2_3));
                    Integer.rotateLeft(1818460648 ^ var2_3, 16) + 610949715;
                    try {
                        var4_2 += 4;
                        var3_4 = 1218605070 + var2_3 ^ 902160613 ^ 902160613;
                    }
                    catch (IllegalArgumentException v6) {
                        var3_4 = 1218605070 + var2_3 ^ -1137228937 ^ -1137228937;
                    }
                    var4_2 -= 3;
                    continue block30;
                }
                case -118176327: {
                    (Integer.rotateRight(-1333047209 ^ var2_3, 9) - 1698453956) * -1333047209;
                    (int)(-7360326103110745809L ^ (long)var2_3 ^ 4737539052695756388L);
                    var3_4 = Integer.reverse(Integer.reverse(-1132540578 + var2_3));
                    (int)(6169133732690387648L ^ (long)var2_3 ^ -6227557494153607445L);
                    var3_4 = 1218605070 + var2_3;
                    var4_2 += 2;
                    continue block30;
                }
                case -866740184: {
                    (Integer.rotateRight(1877705267 ^ var2_3, 16) + -1847434392) * 1877705267;
                    var3_4 = (int)((long)(-1214029690 + var2_3) ^ 3019839300710746904L ^ 3019839300710746904L);
                    Integer.rotateLeft(-1875005851 ^ var2_3, 5) - 2077605238;
                    (int)(5948974011405101903L ^ (long)var2_3 ^ -161985438125848369L);
                    try {
                        var4_2 += 3;
                        var3_4 = 1218605070 + var2_3 + -165899039 - -165899039;
                    }
                    catch (IllegalStateException v7) {
                        var3_4 = Integer.reverse(Integer.reverse(1218605070 + var2_3));
                    }
                    var4_2 += 2;
                    continue block30;
                }
                case 877979702: {
                    return var1_1;
                }
            }
            Integer.rotateRight(-239378993 ^ var2_3, 17) - 1242430284;
            var3_4 = 1218605070 + var2_3 + -1702137604 - -1702137604;
        }
    }

    private boolean dhba_2() {
        int n = 1497024118;
        n = Integer.rotateLeft(n * 1956918521, 16) ^ 0xE58A250C;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x722B0FDB;
        if ((n2 ^ n) != 1915424731) {
            int cfr_ignored_0 = (0x2B11C9AD ^ n) + 1830762814;
        }
        String string = this.zdj_2.sdh_2().getName();
        int n3 = -1;
        switch (string.hashCode()) {
            case -730559037: {
                if (!nth.hshj(string, "Animated")) break;
                n3 = 0;
                break;
            }
            case -1808614770: {
                if (!string.equals("Static")) break;
                n3 = 1;
            }
        }
        switch (n3) {
            case 0: {
                return true;
            }
            case 1: {
                return false;
            }
        }
        return this.jdb.nextInt(-1964981920 - -1964982020) > Integer.rotateLeft(0x1C0782E ^ 0x41C0782F, 5);
    }

    private float dhth(float f) {
        if ((f = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f)) < 0.5f) {
            return 2.0f * f * f;
        }
        return 1.0f - (float)Math.pow(-2.0f * f + 2.0f, 2.0) / 2.0f;
    }

    private int amj(int n, float f) {
        int n2 = 9131773;
        n2 = Integer.rotateLeft(n2 * 1385343405, 24) ^ 0xA9BAB380;
        n2 = Integer.rotateLeft(Float.floatToIntBits(f) ^ n2, 9);
        int n3 = n2 ^ 0x2711AA41;
        if ((n3 ^ n2) != 655469121) {
            int cfr_ignored_0 = (0x279AFCBC ^ n2) + -1580220392;
        }
        int n4 = nth.htd_3(Math.round(class_3532.method_15363((float)f, (float)0.0f, (float)1.0f) * Float.intBitsToFloat(0xAA0C9A6E ^ 0xE9739A6E)), 0, Integer.rotateLeft(0x5E35C14A ^ 0x51C5C14A, 12));
        return n4 << -1565893049 - -1565893073 | n & 905814668 + -889037453;
    }

    private int khdhdh(int n, int n2, float f) {
        int n3 = 1758121587;
        int n4 = (n3 = Integer.rotateLeft(n3 * -123263927, 17) ^ 0xD0FEBE88) ^ 0xA5728CB9;
        if ((n4 ^ n3) != -1519219527) {
            int cfr_ignored_0 = (0xCDB842CA ^ n3) + 1518073304;
        }
        f = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        float f2 = 1.0f - f;
        int n5 = class_3532.method_15340((int)Math.round((float)(n >> (0xB6199BC7 ^ 0xB6199BD7) & (0x2805AD07 ^ 0x2805ADF8)) * f2 + (float)(n2 >> 440502925 + -440502909 & 717676206 + -717675951) * f), (int)0, (int)Integer.rotateLeft(0x5642BCD2 ^ 0x563D3CD2, 17));
        int n6 = nth.zls_3(Math.round((float)(n >> nth.sthgh(0x45080FDA ^ 0x44080FDA, 11) & 1881584241 + -1881583986) * f2 + (float)(n2 >> (0xFA320F84 ^ 0xFA320F8C) & (0x3AB021E ^ 0x3AB02E1)) * f), 0, 1806029845 - 1806029590);
        int n7 = class_3532.method_15340((int)Math.round((float)(n & -1610037467 - -1610037722) * f2 + (float)(n2 & 1674867740 - 1674867485) * f), (int)0, (int)(0xC73D0057 ^ 0xC73D00A8));
        int n8 = nth.rwgh(Math.round((float)(n >> -1302404106 + 1302404130 & nth.dshs_4(0x5ED5B62D ^ 0x9ED5B612, 2)) * f2 + (float)(n2 >> -1230583738 - -1230583762 & 1874537005 - 1874536750) * f), 0, Integer.reverse(6223698) ^ 0x4AEF7AFF);
        return n8 << (Integer.reverse(-488201986) ^ 0x7F05675F) | n5 << (0x103B36BA ^ 0x103B36AA) | n6 << -436787209 + 436787217 | n7;
    }

    private int bfs_2(int n, float f) {
        int n2;
        block1: {
            int n3 = -2066236937;
            n3 = Integer.rotateLeft(n3 * -441496749, 13) ^ 0x3DFB4803;
            n3 = System.identityHashCode(this) ^ n3;
            n3 = Float.floatToIntBits(f) ^ n3;
            int n4 = n3 ^ 0x50025CC4;
            if ((n4 ^ n3) != 1342332100) {
                int cfr_ignored_0 = (0xD4D5E533 ^ n3) + -1897970491;
            }
            f = nth.djth_2(f, 0.0f, 1.0f);
            int n5 = class_3532.method_15340((int)Math.round((float)(n >> (Integer.reverse(295880419) ^ 0xC7634598) & -229718924 - -229719179) * f), (int)0, (int)(-593164031 - -593164286));
            int n6 = class_3532.method_15340((int)Math.round((float)(n >> (0x13CE1445 ^ 0x13CE144D) & Integer.rotateLeft(0xCA3BDB67 ^ 0xCA3C2367, 21)) * f), (int)0, (int)(0xB51E8069 ^ 0xB51E8096));
            int n7 = class_3532.method_15340((int)Math.round((float)(n & Integer.rotateLeft(0xA20FBEF9 ^ 0xA20F41F9, 24)) * f), (int)0, (int)(Integer.reverse(1738036319) ^ 0xFA2A1919));
            n2 = n & (Integer.reverse(755723356) ^ 0xC536D0B4) | n5 << -270553948 - -270553964 | n6 << -1306502739 + 1306502747 | n7;
            if (yf.tdhth_2() != 0) break block1;
            n2 = n2 ^ 0xBA18;
        }
        return n2;
    }

    private float athn(float f, float f2) {
        block0: {
            int n = tthm.dsa_3(-1007529697);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 15);
            int n2 = n ^ 0x626CBDD;
            if ((n2 ^ n) == 103205853) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xC5D49AC2 ^ n, 11) + -115581767;
        }
        return Math.abs(class_3532.method_15393((float)(f - f2)));
    }

    private float dtha(double d, double d2) {
        float f;
        int n = tthm.dsa_3(-376293052);
        n = System.identityHashCode(this) ^ n;
        n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 10);
        int n2 = n ^ 0xE4320545;
        if ((n2 ^ n) != -466483899) {
            int cfr_ignored_0 = Integer.rotateLeft(0xDA03C01 ^ n, 4) + -1429937318;
            int cfr_ignored_1 = (int)(0xCF12923C27D4EB4FL ^ (long)n ^ 0xD908831A2DB833F4L);
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return (f = (float)Math.toDegrees(Math.atan2(d2, d) - Double.longBitsToDouble(0xDCC7A119C5F207BAL ^ 0x9C912119C5F207BAL))) < 0.0f ? f + Float.intBitsToFloat(Integer.rotateLeft(0xDFECC716 ^ 0x6BECC755, 24)) : f;
    }

    private double ashw(double d, double d2) {
        block0: {
            int n = -618396094;
            n = Integer.rotateLeft(n * -1427506835, 14) ^ 0x59851A2B;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 27);
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0x612176B1;
            if ((n2 ^ n) == 1629583025) break block0;
            int cfr_ignored_0 = (0xBA0570F3 ^ n) + 1000245978;
        }
        return d + this.jdb.nextDouble() * (d2 - d);
    }

    @Generated
    public static nth tfn() {
        block0: {
            int n = 1846044018;
            int n2 = (n = Integer.rotateLeft(n * -1017926507, 10) ^ 0xC6FFF383) ^ 0xB2DCF31;
            if ((n2 ^ n) == 187551537) break block0;
            int cfr_ignored_0 = (0x6525AA43 ^ n) + -206342462;
        }
        return dhth;
    }

    private static boolean rld_2(bhs_4 bhs2) {
        return bhs2.aaz_3() >= 1.0f && bhs2.dhdhl == 0.0f && bhs2.shdgh < 0.02f;
    }

    private boolean thjn(Integer n) {
        return !this.shdy_2.contains(n);
    }

    private void zrr_2(shw_3 shw2) {
        int n = 0;
        int n2 = -864076401;
        n2 = Integer.rotateLeft(n2 * -262817351, 14) ^ 0x154BDB3F;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 25);
        shw_3 shw3 = shw2;
        n2 = Integer.rotateRight((shw3 != null ? System.identityHashCode(shw3) : 0) ^ n2, 24);
        int n3 = Integer.reverse(n2 ^ 0xC0E64966 ^ 0xF3174EEE) ^ 0xF97B75B2 ^ 0xF97B75B2;
        while (true) {
            block18: {
                block30: {
                    block21: {
                        block17: {
                            block31: {
                                block16: {
                                    block22: {
                                        block29: {
                                            block23: {
                                                block32: {
                                                    block26: {
                                                        block25: {
                                                            block20: {
                                                                block15: {
                                                                    block27: {
                                                                        block28: {
                                                                            block24: {
                                                                                block13: {
                                                                                    block19: {
                                                                                        block14: {
                                                                                            if ((n = Integer.reverse(n3) ^ n2 ^ 0xF3174EEE) > 189949178) break block13;
                                                                                            if (n > -1617160832) break block14;
                                                                                            if (n == -1956885032) break block15;
                                                                                            if (n == -1914611112) break block16;
                                                                                            int cfr_ignored_0 = (Integer.rotateRight(0xA9320CFA ^ n2, 8) + -2123550335) * -1456337669;
                                                                                            if (n == -1617160832) break block17;
                                                                                            break block18;
                                                                                        }
                                                                                        if (n > -459409848) break block19;
                                                                                        if (n == -1058649754) break block20;
                                                                                        if (n == -459409848) break block21;
                                                                                        int cfr_ignored_1 = (Integer.rotateRight(0xC5D40656 ^ n2, 11) - -116759643) * -975960489;
                                                                                        break block18;
                                                                                    }
                                                                                    if (n == -69428649) break block22;
                                                                                    if (n == 189949178) break block23;
                                                                                    break block18;
                                                                                }
                                                                                if (n > 289413187) break block24;
                                                                                if (n == 208458887) break block25;
                                                                                if (n == 233817056) break block26;
                                                                                if (n == 289413187) break block27;
                                                                                break block18;
                                                                            }
                                                                            if (n > 1043267180) break block28;
                                                                            if (n == 431721491) break block29;
                                                                            if (n == 1043267180) break block30;
                                                                            break block18;
                                                                        }
                                                                        if (n == 1548556625) break block31;
                                                                        if (n == 1835022177) break block32;
                                                                        break block18;
                                                                    }
                                                                    int cfr_ignored_2 = (Integer.rotateRight(0xEFDA1F37 ^ n2, 16) - 264726244) * -270917833;
                                                                    this.hth_5(shw2.ssha_2(), shw2.skz_4());
                                                                    return;
                                                                }
                                                                int cfr_ignored_3 = (Integer.rotateRight(0x3A8668BE ^ n2, 10) - 446975549) * 981887167;
                                                                throw null;
                                                            }
                                                            int cfr_ignored_4 = (Integer.rotateRight(0xDCCCAE93 ^ n2, 14) + -1054424312) * -590565741;
                                                            if (yf.dnkh()) {
                                                                n3 = Integer.reverse(n2 ^ 0x8BB55F41 ^ 0xF3174EEE);
                                                                tthm.zzr_3(-810619776, n2);
                                                                int cfr_ignored_5 = (int)(0x519995397F4A7C15L ^ (long)n2 ^ 0xD7023227030D0EE2L);
                                                                n3 = Integer.reverse(n2 ^ 0x8B5C4DD8 ^ 0xF3174EEE) + 168958010 - 168958010;
                                                                n -= 4;
                                                                continue;
                                                            }
                                                            try {
                                                                n += 2;
                                                                if ((0x3EE8D17142C32ED5L ^ (long)n2 | 1L) == 0L) {
                                                                    throw new UnsupportedOperationException();
                                                                }
                                                                n3 = Integer.reverse(n2 ^ 0x11401843 ^ 0xF3174EEE);
                                                            }
                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x11401843 ^ 0xF3174EEE)));
                                                            }
                                                            continue;
                                                        }
                                                        int cfr_ignored_6 = (Integer.rotateRight(0xC9191833 ^ n2, 12) + 1583844712) * -921102285;
                                                        n3 = (int)((long)Integer.reverse(n2 ^ 0x4F099CC0 ^ 0xF3174EEE) ^ 0x8FAB9A317461905DL ^ 0x8FAB9A317461905DL);
                                                        int cfr_ignored_7 = Integer.rotateRight(0xB781AD8F ^ n2, 9) - 1024566156;
                                                        n3 = (int)((long)Integer.reverse(n2 ^ 0xC0E64966 ^ 0xF3174EEE) ^ 0xCC6E95121D519898L ^ 0xCC6E95121D519898L);
                                                        --n;
                                                        continue;
                                                    }
                                                    int cfr_ignored_8 = Integer.rotateLeft(0x6238BF25 ^ n2, 15) - -381893450;
                                                    int cfr_ignored_9 = (int)(0xA08A111827D4EB4FL ^ (long)n2 ^ 0xDF40831A2DB8ECC5L);
                                                    n3 = Integer.reverse(n2 ^ 0xC0E64966 ^ 0xF3174EEE);
                                                    n += 5;
                                                    continue;
                                                }
                                                int cfr_ignored_10 = (Integer.rotateLeft(0x331F3C1D ^ n2, 9) - 891676350) * 857685021;
                                                int cfr_ignored_11 = (int)(0xF1AD922027D4EB4FL ^ (long)n2 ^ 0xD930831A2DB84E8AL);
                                                n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x42AB45B0 ^ 0xF3174EEE)));
                                                int cfr_ignored_12 = Integer.rotateLeft(0xABC58CE1 ^ n2, 8) + -783700358;
                                                int cfr_ignored_13 = (int)(0x697722DC27D4EB4FL ^ (long)n2 ^ 0xB8C8831A2DB97F3FL);
                                                try {
                                                    if ((0x540C485C8EF5B079L ^ (long)n2 | 1L) == 0L) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    n3 = (int)((long)Integer.reverse(n2 ^ 0xC0E64966 ^ 0xF3174EEE) ^ 0x858A6BF28853CEEAL ^ 0x858A6BF28853CEEAL);
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    n3 = Integer.reverse(n2 ^ 0xC0E64966 ^ 0xF3174EEE) ^ 0xF646F9B0 ^ 0xF646F9B0;
                                                }
                                                continue;
                                            }
                                            int cfr_ignored_14 = (Integer.rotateRight(0xD3D09CBB ^ n2, 13) + -1432315424) * -741303109;
                                            n3 = Integer.reverse(n2 ^ 0xC0E64966 ^ 0xF3174EEE) ^ 0x4BFBCE87 ^ 0x4BFBCE87;
                                            n += 4;
                                            continue;
                                        }
                                        int cfr_ignored_15 = Integer.rotateLeft(0x7B0E778D ^ n2, 18) - -350348978;
                                        int cfr_ignored_16 = (int)(0xB9BCD9B027D4EB4FL ^ (long)n2 ^ 0x4E10831A2DB8DEA8L);
                                        n3 = Integer.reverse(n2 ^ 0x3986FF13 ^ 0xF3174EEE) ^ 0x37BA3ED8 ^ 0x37BA3ED8;
                                        int cfr_ignored_17 = (Integer.rotateRight(0x9BA5C59B ^ n2, 6) + -579826432) * -1683634789;
                                        n3 = Integer.reverse(n2 ^ 0xC0E64966 ^ 0xF3174EEE) + -329727342 - -329727342;
                                        n -= 2;
                                        continue;
                                    }
                                    int cfr_ignored_18 = (Integer.rotateRight(0xF65A34D2 ^ n2, 17) + -649460567) * -161860397;
                                    int cfr_ignored_19 = (int)(0x61FBC83E70AF4150L ^ (long)n2 ^ 0x6D0C2DED79876E26L);
                                    n3 = Integer.reverse(n2 ^ 0x275C3F24 ^ 0xF3174EEE) + 1966386548 - 1966386548;
                                    int cfr_ignored_20 = (int)(0xCE430C97A641EAF0L ^ (long)n2 ^ 0xE45F80302EC63157L);
                                    n3 = Integer.reverse(n2 ^ 0xC0E64966 ^ 0xF3174EEE);
                                    n -= 5;
                                    continue;
                                }
                                int cfr_ignored_21 = (Integer.rotateLeft(0xB55E85DC ^ n2, 9) - -87042849) * -1252096547;
                                int cfr_ignored_22 = (int)(0xF208D4001C2ECB62L ^ (long)n2 ^ 0x5570F4EE6DE249C0L);
                                n3 = Integer.reverse(n2 ^ 0x7F77441C ^ 0xF3174EEE);
                                int cfr_ignored_23 = (int)(0x7AA793D3999D3929L ^ (long)n2 ^ 0xDAD7FF898975589EL);
                                n3 = Integer.reverse(n2 ^ 0xC0E64966 ^ 0xF3174EEE) ^ 0x62ED315D ^ 0x62ED315D;
                                n -= 2;
                                continue;
                            }
                            int cfr_ignored_24 = (Integer.rotateLeft(0xF3D4E97C ^ n2, 17) - -1960450753) * -204150403;
                            n3 = Integer.reverse(n2 ^ 0xC0E64966 ^ 0xF3174EEE);
                            int cfr_ignored_25 = (Integer.rotateLeft(0xA5334754 ^ n2, 7) - 93536871) * -1523366059;
                            n += 5;
                            continue;
                        }
                        int cfr_ignored_26 = (Integer.rotateLeft(0xA561C654 ^ n2, 7) - 187999079) * -1520318891;
                        n3 = Integer.reverse(n2 ^ 0xF928CE3D ^ 0xF3174EEE);
                        int cfr_ignored_27 = Integer.rotateLeft(0xD016F1E4 ^ n2, 13) - 925166039;
                        int cfr_ignored_28 = (int)(0x9C14CD3318FDAFB9L ^ (long)n2 ^ 0x6716FD48A45495F8L);
                        n3 = Integer.reverse(n2 ^ 0xC0E64966 ^ 0xF3174EEE) ^ 0xE5DF6111 ^ 0xE5DF6111;
                        n -= 2;
                        continue;
                    }
                    int cfr_ignored_29 = (Integer.rotateRight(0x51DEC337 ^ n2, 13) - -296271132) * 1373553463;
                    try {
                        if ((0x4D5379F046282841L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(n2 ^ 0xC0E64966 ^ 0xF3174EEE);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xC0E64966 ^ 0xF3174EEE)));
                    }
                    continue;
                }
                int cfr_ignored_30 = (Integer.rotateRight(0x1DEEECDF ^ n2, 6) - -1538503108) * 502197471;
                n3 = Integer.reverse(n2 ^ 0xEA95DC7F ^ 0xF3174EEE) ^ 0x7660BABA ^ 0x7660BABA;
                int cfr_ignored_31 = (Integer.rotateLeft(0x6720E511 ^ n2, 15) + -2124850102) * 1730209041;
                int cfr_ignored_32 = (int)(0xA5924B2C27D4EB4FL ^ (long)n2 ^ 0x6B28831A2DB8E6F5L);
                try {
                    n -= 4;
                    n3 = Integer.reverse(n2 ^ 0xC0E64966 ^ 0xF3174EEE) + -985443816 - -985443816;
                }
                catch (ArithmeticException arithmeticException) {
                    n3 = Integer.reverse(n2 ^ 0xC0E64966 ^ 0xF3174EEE) + -1224114102 - -1224114102;
                }
                ++n;
                continue;
            }
            int cfr_ignored_33 = (Integer.rotateRight(0xEC66C772 ^ n2, 16) + -1529887223) * -328808589;
            n3 = (int)((long)Integer.reverse(n2 ^ 0xC0E64966 ^ 0xF3174EEE) ^ 0x5DA1C6A6AC3FD54BL ^ 0x5DA1C6A6AC3FD54BL);
        }
    }

    private void dfth(ya_2 ya2) {
        int n = 1855133204;
        n = Integer.rotateLeft(n * 1868864369, 12) ^ 0xC15551E3;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x8EE838BE;
        if ((n2 ^ n) != -1897383746) {
            int cfr_ignored_0 = (0xE07B2EAA ^ n) + -2314160;
        }
        this.jft_2();
    }

    private static String zkdh(String string, int n, int n2, int n3) {
        try {
            int n4 = -851742933;
            n4 = Integer.rotateLeft(n4 * 914767545, 20) ^ 0x6719847F;
            int n5 = n4 ^ 0xCAB82998;
            if ((n5 ^ n4) != -893900392) {
                int cfr_ignored_0 = (0x78346B3 ^ n4) - -2097564680;
            }
            if ((0xF3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x3B5B95B4 ^ n2 ^ i * -1635150109 ^ fb, 26) ^ rght));
        }
        return new String(cArray);
    }

    private static boolean zbs_2() {
        block0: {
            int n = 781979369;
            int n2 = (n = Integer.rotateLeft(n * -1253069339, 12) ^ 0x9579482) ^ 0x8E9B0ECE;
            if ((n2 ^ n) == -1902440754) break block0;
            int cfr_ignored_0 = (0xA0070027 ^ n) + 446638700;
        }
        return yf.khdha_2();
    }

    private static class_2960 djz_3(String string, String string2) {
        block0: {
            int n = 145111180;
            n = Integer.rotateLeft(n * -1953590091, 25) ^ 0x749A85F;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0x235AC851;
            if ((n2 ^ n) == 593152081) break block0;
            int cfr_ignored_0 = (0x2BFCF0DD ^ n) + -1170045042;
        }
        return class_2960.method_60655((String)string, (String)string2);
    }

    private static double hths_2(double d) {
        block0: {
            int n = 1436574411;
            n = Integer.rotateLeft(n * 136146915, 10) ^ 0x3691B440;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x3F9B58CF;
            if ((n2 ^ n) == 1067145423) break block0;
            int cfr_ignored_0 = (0x6A3B3A04 ^ n) + -235815097;
        }
        return Math.sqrt(d);
    }

    private static double zzt_4(long l) {
        block0: {
            int n = tthm.dsa_3(-835305465);
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 20)) ^ 0xF37BC27F;
            if ((n2 ^ n) == -209993089) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x3D4D8278 ^ n, 10) + 1891658691) * 1028489849;
        }
        return Double.longBitsToDouble(l);
    }

    private static int jkq(nth nth2) {
        block0: {
            int n = -1890051405;
            int n2 = (n = Integer.rotateLeft(n * 911683517, 16) ^ 0xCCFBBAF3) ^ 0x616122A8;
            if ((n2 ^ n) == 1633755816) break block0;
            int cfr_ignored_0 = (0xEE39381B ^ n) - 1129994407;
        }
        return nth2.tshz_2();
    }

    private static boolean jhsh(badh_2 badh2) {
        block0: {
            int n = 316578546;
            n = Integer.rotateLeft(n * -1193708915, 27) ^ 0xF78F283;
            badh_2 badh3 = badh2;
            n = (badh3 != null ? System.identityHashCode(badh3) : 0) ^ n;
            int n2 = n ^ 0xC5C8B865;
            if ((n2 ^ n) == -976701339) break block0;
            int cfr_ignored_0 = (0xD7162297 ^ n) + 1135204042;
        }
        return badh2.shzl();
    }

    private static float thzgh_2(class_746 class_7462, class_1297 class_12972) {
        block0: {
            int n = -2142974538;
            n = Integer.rotateLeft(n * 38238911, 16) ^ 0x7A4AA334;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0xB5CC1A06;
            if ((n2 ^ n) == -1244915194) break block0;
            int cfr_ignored_0 = (0x3588D7B0 ^ n) - 37977660;
        }
        return class_7462.method_5739(class_12972);
    }

    private static float tkw(tay tay2) {
        block0: {
            int n = 649001787;
            n = Integer.rotateLeft(n * 356882109, 24) ^ 0x46CE78F1;
            tay tay3 = tay2;
            n = Integer.rotateRight((tay3 != null ? System.identityHashCode(tay3) : 0) ^ n, 7);
            int n2 = n ^ 0x2F83080F;
            if ((n2 ^ n) == 797116431) break block0;
            int cfr_ignored_0 = (0x92DF334 ^ n) + 1160641287;
        }
        return tay2.thw_5();
    }

    private static Moondlc shdd_3() {
        block0: {
            int n = 1815938565;
            int n2 = (n = Integer.rotateLeft(n * -1152308879, 18) ^ 0xDABF5790) ^ 0x85F7724;
            if ((n2 ^ n) == 140474148) break block0;
            int cfr_ignored_0 = (0x64627121 ^ n) - 1347305567;
        }
        return Moondlc.getInstance();
    }

    private static boolean dhdh_2(kh_3 kh2, String string) {
        block0: {
            int n = -1360734048;
            n = Integer.rotateLeft(n * -585648801, 6) ^ 0x2ECB89BE;
            kh_3 kh3 = kh2;
            n = (kh3 != null ? System.identityHashCode(kh3) : 0) ^ n;
            int n2 = n ^ 0x7224415A;
            if ((n2 ^ n) == 1914978650) break block0;
            int cfr_ignored_0 = (0xDCC099FA ^ n) + 1572788304;
        }
        return kh2.adhj(string);
    }

    private static boolean ghrz(badh_2 badh2) {
        block0: {
            int n = 1962716509;
            n = Integer.rotateLeft(n * -1148448373, 5) ^ 0x7A4267C1;
            badh_2 badh3 = badh2;
            n = (badh3 != null ? System.identityHashCode(badh3) : 0) ^ n;
            int n2 = n ^ 0x3BEA1047;
            if ((n2 ^ n) == 1005195335) break block0;
            int cfr_ignored_0 = (0x4F16BD1A ^ n) - 1729174000;
        }
        return badh2.shzl();
    }

    private static boolean atj_2(badh_2 badh2) {
        block0: {
            int n = -911646066;
            n = Integer.rotateLeft(n * 1614499493, 7) ^ 0x566A10E3;
            badh_2 badh3 = badh2;
            n = Integer.rotateRight((badh3 != null ? System.identityHashCode(badh3) : 0) ^ n, 2);
            int n2 = n ^ 0xFD17443E;
            if ((n2 ^ n) == -48806850) break block0;
            int cfr_ignored_0 = (0x34BE26B0 ^ n) - 115635553;
        }
        return badh2.shzl();
    }

    private static boolean dnj_2(badh_2 badh2) {
        block0: {
            int n = 248030436;
            n = Integer.rotateLeft(n * -148674649, 10) ^ 0xA633FC30;
            badh_2 badh3 = badh2;
            n = Integer.rotateLeft((badh3 != null ? System.identityHashCode(badh3) : 0) ^ n, 23);
            int n2 = n ^ 0x8A39D04E;
            if ((n2 ^ n) == -1975922610) break block0;
            int cfr_ignored_0 = (0x84F174AA ^ n) - -866887863;
        }
        return badh2.shzl();
    }

    private static fy sfdh_2(khd khd2) {
        block0: {
            int n = -1044507460;
            int n2 = (n = Integer.rotateLeft(n * 805476211, 14) ^ 0x7B346C26) ^ 0x5A219882;
            if ((n2 ^ n) == 1512151170) break block0;
            int cfr_ignored_0 = (0x9B9F8C3E ^ n) + 1991699564;
        }
        return khd2.sdh_2();
    }

    private static String shshb(fy fy2) {
        block0: {
            int n = -1696555698;
            int n2 = (n = Integer.rotateLeft(n * -243670003, 4) ^ 0x8323E0DF) ^ 0x8E585005;
            if ((n2 ^ n) == -1906814971) break block0;
            int cfr_ignored_0 = (0x14B8CD4B ^ n) - 556765828;
        }
        return fy2.getName();
    }

    private static int shsth(String string) {
        block0: {
            int n = tthm.dsa_3(-392960826);
            int n2 = n ^ 0xC6706210;
            if ((n2 ^ n) == -965713392) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x2EE386D6 ^ n, 8) - -1310002395) * 786663127;
        }
        return string.hashCode();
    }

    private static String rza_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tthm.dsa_3(937180905);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0x5F864710;
            if ((n5 ^ n4) == 1602635536) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x685A79F9 ^ n4, 16) + -1487772574) * 1750759929;
            int cfr_ignored_1 = (int)(0xAAE8D7C427D4EB4FL ^ (long)n4 ^ 0x52F8831A2DB8F800L);
        }
        return nth.zkdh(string, n, n2, n3);
    }

    private static String bwt(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -450217769;
            n4 = Integer.rotateLeft(n4 * 1878719681, 17) ^ 0xCF9FA505;
            n4 = Integer.rotateLeft(n2 ^ n4, 28);
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 22)) ^ 0x887DB734;
            if ((n5 ^ n4) == -2005027020) break block0;
            int cfr_ignored_0 = (0x6D578FE3 ^ n4) + -1728737733;
        }
        return nth.zkdh(string, n, n2, n3);
    }

    private static Color wt(int n) {
        block0: {
            int n2 = -678331133;
            n2 = Integer.rotateLeft(n2 * 855259155, 20) ^ 0xF4747F25;
            int n3 = (n2 = n ^ n2) ^ 0xEA6B30AA;
            if ((n3 ^ n2) == -362073942) break block0;
            int cfr_ignored_0 = (0x3DFA4DA9 ^ n2) - -916198794;
        }
        return bas_4.hmq(n);
    }

    private static int ath_5(Color color) {
        block0: {
            int n = 1790693694;
            int n2 = (n = Integer.rotateLeft(n * 1754240013, 19) ^ 0xFDF561C1) ^ 0xABB6C210;
            if ((n2 ^ n) == -1414086128) break block0;
            int cfr_ignored_0 = (0xC10D132E ^ n) - -1087072981;
        }
        return color.getRGB();
    }

    private static int tsj_3(byq byq2) {
        block0: {
            int n = -310574256;
            n = Integer.rotateLeft(n * -1270674825, 18) ^ 0xD67AFDC6;
            byq byq3 = byq2;
            n = Integer.rotateRight((byq3 != null ? System.identityHashCode(byq3) : 0) ^ n, 8);
            int n2 = n ^ 0x7ED4BEAB;
            if ((n2 ^ n) == 2127871659) break block0;
            int cfr_ignored_0 = (0x93A9BDFB ^ n) - -1232669620;
        }
        return byq2.rk();
    }

    private static float daa_7(int n) {
        block0: {
            int n2 = 1380818172;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1623279145, 21) ^ 0xFD01D03E) ^ 0x6A2F04E0;
            if ((n3 ^ n2) == 1781466336) break block0;
            int cfr_ignored_0 = (0x3862981C ^ n2) - -1288950683;
        }
        return Float.intBitsToFloat(n);
    }

    private static int thf(Color color) {
        block0: {
            int n = -204709914;
            int n2 = (n = Integer.rotateLeft(n * -1439305659, 17) ^ 0x65E45AAA) ^ 0xC5663594;
            if ((n2 ^ n) == -983157356) break block0;
            int cfr_ignored_0 = (0x36AA6A72 ^ n) + -1762031151;
        }
        return color.getRGB();
    }

    private static int jhsh_2(Random random, int n) {
        block0: {
            int n2 = -642003452;
            n2 = Integer.rotateLeft(n2 * 1502904749, 27) ^ 0x77E0D705;
            Random random2 = random;
            n2 = (random2 != null ? System.identityHashCode(random2) : 0) ^ n2;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 6)) ^ 0xEC3BDAD6;
            if ((n3 ^ n2) == -331621674) break block0;
            int cfr_ignored_0 = (0x358014D2 ^ n2) - -564728967;
        }
        return random.nextInt(n);
    }

    private static int zysh(Random random, int n) {
        block0: {
            int n2 = tthm.dsa_3(-96322342);
            Random random2 = random;
            n2 = Integer.rotateRight((random2 != null ? System.identityHashCode(random2) : 0) ^ n2, 2);
            int n3 = n2 ^ 0x35AD4968;
            if ((n3 ^ n2) == 900548968) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xCFEF75B2 ^ n2, 12) + 844947401) * -806390349;
        }
        return random.nextInt(n);
    }

    private static boolean hshj(String string, Object object) {
        block0: {
            int n = -141648529;
            n = Integer.rotateLeft(n * -91573489, 11) ^ 0x3CB89DA9;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            Object object2 = object;
            n = Integer.rotateLeft((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 3);
            int n2 = n ^ 0x6EFC0C7B;
            if ((n2 ^ n) == 1862012027) break block0;
            int cfr_ignored_0 = (0x99729114 ^ n) + 496106306;
        }
        return string.equals(object);
    }

    private static int htd_3(int n, int n2, int n3) {
        block0: {
            int n4 = -1996650964;
            n4 = Integer.rotateLeft(n4 * 1207654187, 23) ^ 0x43465BE8;
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 9)) ^ 0xAD464835;
            if ((n5 ^ n4) == -1387902923) break block0;
            int cfr_ignored_0 = (0x25BBCE19 ^ n4) + 1208390833;
        }
        return class_3532.method_15340((int)n, (int)n2, (int)n3);
    }

    private static int sthgh(int n, int n2) {
        block0: {
            int n3 = 565317893;
            n3 = Integer.rotateLeft(n3 * -1260784455, 15) ^ 0x833B00A;
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0xB3A74D40;
            if ((n4 ^ n3) == -1280881344) break block0;
            int cfr_ignored_0 = (0x92155C45 ^ n3) + 887215862;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int zls_3(int n, int n2, int n3) {
        block0: {
            int n4 = -1963373308;
            n4 = Integer.rotateLeft(n4 * -1962883859, 6) ^ 0x3078E4C7;
            n4 = Integer.rotateRight(n2 ^ n4, 6);
            int n5 = (n4 = n3 ^ n4) ^ 0xFA8EE16B;
            if ((n5 ^ n4) == -91299477) break block0;
            int cfr_ignored_0 = (0x7077AC6F ^ n4) + -1652594853;
        }
        return class_3532.method_15340((int)n, (int)n2, (int)n3);
    }

    private static int dshs_4(int n, int n2) {
        block0: {
            int n3 = 332455896;
            int n4 = (n3 = Integer.rotateLeft(n3 * -1231871391, 24) ^ 0x13687BE4) ^ 0xA488786F;
            if ((n4 ^ n3) == -1534560145) break block0;
            int cfr_ignored_0 = (0xB758A7B7 ^ n3) - 500495083;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int rwgh(int n, int n2, int n3) {
        block0: {
            int n4 = tthm.dsa_3(-1565449407);
            int n5 = (n4 = n3 ^ n4) ^ 0x2DD8BC22;
            if ((n5 ^ n4) == 769178658) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x8F699F63 ^ n4, 4) + 1646783544;
        }
        return class_3532.method_15340((int)n, (int)n2, (int)n3);
    }

    private static float djth_2(float f, float f2, float f3) {
        block0: {
            int n = -698149119;
            int n2 = (n = Integer.rotateLeft(n * -393112009, 11) ^ 0x15C97604) ^ 0x5AC1A2C;
            if ((n2 ^ n) == 95164972) break block0;
            int cfr_ignored_0 = (0xD3CF0D2D ^ n) - 1277339960;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static String[] thsha_2(String string) {
        int n = tthm.dsa_3(-1896492115);
        int n2 = n ^ 0xE82CB11B;
        if ((n2 ^ n) != -399724261) {
            int cfr_ignored_0 = (Integer.rotateRight(0x66D962B6 ^ n, 15) - 2024837957) * 1725522615;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite khss_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1332611120;
            n3 = Integer.rotateLeft(n3 * 1204473219, 8) ^ 0x75C4C81F;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            n3 = n ^ n3;
            int n4 = n3 ^ 0xCFE37C43;
            if ((n4 ^ n3) != -807175101) {
                int cfr_ignored_0 = (0x7F728B93 ^ n3) + 174524466;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ khdh ^ string.hashCode() ^ n2 + zth_4 + i * -1862923167) + khdh) ^ zth_4));
            }
            String[] stringArray = nth.thsha_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] cc79aj83h(String string) {
        return string.split("\u0001\u0013", -1);
    }

    private static CallSite fibc2v08p(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ tr6eqs0 ^ string.hashCode() ^ n2 + jmflm48 ^ i * 813016229 ^ tr6eqs0, 3) ^ jmflm48));
            }
            String[] stringArray = nth.cc79aj83h(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

