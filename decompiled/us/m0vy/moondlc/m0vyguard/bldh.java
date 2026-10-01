/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_2561
 *  net.minecraft.class_2596
 *  net.minecraft.class_2824
 *  net.minecraft.class_2828
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_3532
 *  net.minecraft.class_5250
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2828;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3532;
import net.minecraft.class_5250;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bjb;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bdsh_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bks_2;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tkhdh;
import us.m0vy.moondlc.m0vyguard.tdht;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.sj;
import us.m0vy.moondlc.m0vyguard.shd_5;
import us.m0vy.moondlc.m0vyguard.shn_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.ghdh_3;
import us.m0vy.moondlc.m0vyguard.ghh_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.wd;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Physics Auditor", category=bzw.OTHER, desc="Enterprise-grade real-time Polar AntiCheat & ML behavioral auditor for Aura debugging")
public class bldh
extends bnq {
    public final badh_2 hzkh = new badh_2(this, "Aim Kinematics (Jerk/B\u00e9zier)").bts(true);
    public final badh_2 dhtd_4 = new badh_2(this, "Post-Attack".concat(" (post(default))")).bts(true);
    public final badh_2 ky = new badh_2(this, "GCD & Sensitivity").bts(true);
    public final badh_2 shghd_2 = new badh_2(this, "ML & Ent".concat("ropy / Lock")).bts(true);
    public final badh_2 db = new badh_2(this, "Combat / Rea".concat("ch / Raycast")).bts(true);
    public final badh_2 hnf = new badh_2(this, "Clicker Distribution").bts(true);
    public final badh_2 thls_2 = new badh_2(this, "Protocol & Order").bts(true);
    public final badh_2 jsb_2 = new badh_2(this, "Movement & Gravity").bts(true);
    public final khd khwl = new khd(this, "Strictness ".concat("Profile"));
    public final fy saa_4 = new fy(this.khwl, "Polar ".concat("Enterprise")).rhh_3();
    public final fy bft_2 = new fy(this.khwl, "Strict");
    public final fy shmz_2 = new fy(this.khwl, "Standard");
    public final fy shsw_2 = new fy(this.khwl, "Lenient");
    public final badh_2 jqz_2 = new badh_2(this, "Chat Alerts").bts(true);
    public final badh_2 dby = new badh_2(this, "Sound Alert").bts(true);
    public final badh_2 sdq_3 = new badh_2(this, "Telemet".concat("ry HUD")).bts(true);
    public final badh_2 shtha = new badh_2(this, "Fix Advice in Chat").bts(true);
    public final tay shsk = new tay(this, "VL Buffer Threshold").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(294961665 + 789265919)).rkh_3(1.0f).ssd_5(1.0f);
    private final tdht tbsh = new tdht();
    private final shn_3 sdhs = new shn_3();
    private final bdsh_2 shghn = new bdsh_2();
    private final wd rra = new wd();
    private final bks_2 ztk = new bks_2();
    private final shd_5 sm = new shd_5();
    private float zghn = 0.0f;
    private float akh = 0.0f;
    private boolean rndh = false;
    private final Map yj = new HashMap();
    private final Map dhsa_4 = new HashMap();
    private final bql<btt> rls = this::hzm_2;
    private final bql<ghh_2> thhb = this::dln_2;
    private final bql<bbgh> shsz_4 = this::ansh;
    private static final int khkhr = 234282884;
    private static final int zkhd = -1237121080;
    private static final int jta_2 = 1183214472;
    private static final int baf = 1889365533;
    private static final int s4qa2cq8vupe = 1350384611;
    private static final int va0sivonvv3 = -1809741745;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int w6l4t61xk;

    @Override
    public void nt() {
        int n = 1809787925;
        n = Integer.rotateLeft(n * 1200399625, 9) ^ 0xA5E71EA9;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 16);
        int n2 = n ^ 0x147B1608;
        if ((n2 ^ n) != 343610888) {
            int cfr_ignored_0 = (0x7FA43A1D ^ n) - -1627252909;
        }
        bldh.dma_3(this);
        this.skh_6("\u00a7aEnabled\u00a7f. Polar Enterprise ML, Kinematics, Protocol & Statistical Auditing active.");
    }

    @Override
    public void nc() {
        int n = 920120677;
        n = Integer.rotateLeft(n * -1147152451, 3) ^ 0xFA5FBB5E;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x2E103A52;
        if ((n2 ^ n) != 772815442) {
            int cfr_ignored_0 = (0x18C7D737 ^ n) - -657151791;
        }
        this.shtd_4();
    }

    private void shtd_4() {
        int n = 0;
        int n2 = 845668471;
        n2 = Integer.rotateLeft(n2 * 367213795, 8) ^ 0xFFC2F6FE;
        int n3 = Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6) ^ 0xC04AEFCB ^ 0xC04AEFCB;
        block36: while (true) {
            switch (Integer.rotateRight(n3, 6) ^ n2) {
                case -1019529259: {
                    int cfr_ignored_0 = Integer.rotateLeft(0xA51904C8 ^ n2, 7) + 40186739;
                    throw null;
                }
                case 1032970074: {
                    int cfr_ignored_1 = (Integer.rotateRight(0x8B0F9CDE ^ n2, 4) - -616456675) * -1961911073;
                    if (!yf.dnkh()) {
                        try {
                            if ((0xD876AC17A49EC847L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x4D343DB6, 6) ^ 0x37E37C6BCC976DFBL ^ 0x37E37C6BCC976DFBL);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = Integer.rotateLeft(n2 ^ 0x4D343DB6, 6);
                        }
                        n += 3;
                        continue block36;
                    }
                    try {
                        n -= 2;
                        if ((0x870EE24FD8FC1D59L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0xC33B37D5, 6) + -270407334 - -270407334;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xC33B37D5, 6) ^ 0x208A6308C74ACC8BL ^ 0x208A6308C74ACC8BL);
                    }
                    continue block36;
                }
                case 1295269302: {
                    int cfr_ignored_2 = Integer.rotateRight(0x59ADA26F ^ n2, 14) - -530298196;
                    this.rndh = false;
                    this.tbsh.dshd_2();
                    bldh.zdd(this.sdhs);
                    this.shghn.thdht();
                    bldh.dkhf_2(this.rra);
                    bldh.thsd(this.ztk);
                    this.sm.dhghd_2();
                    this.yj.clear();
                    this.dhsa_4.clear();
                    return;
                }
                case -1483916303: {
                    int cfr_ignored_3 = Integer.rotateLeft(0xDA3EB460 ^ n2, 14) + 1911912155;
                    n3 = Integer.rotateLeft(n2 ^ 0xB4483BCC, 6);
                    int cfr_ignored_4 = (Integer.rotateLeft(0xAE3EDA5D ^ n2, 8) - 502927486) * -1371612579;
                    int cfr_ignored_5 = (int)(0x6C8C746027D4EB4FL ^ (long)n2 ^ 0x15B0831A2DB974C9L);
                    try {
                        n3 = Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6) + 1991247691 - 1991247691;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6);
                    }
                    ++n;
                    continue block36;
                }
                case -820002972: {
                    int cfr_ignored_6 = (Integer.rotateLeft(0xE8DEFB7C ^ n2, 16) - 928912191) * -388039811;
                    n3 = Integer.rotateLeft(n2 ^ 0x65AC6FF0, 6) + 1610765798 - 1610765798;
                    int cfr_ignored_7 = (Integer.rotateRight(0x9881D09A ^ n2, 6) + 2081808865) * -1736322917;
                    try {
                        n -= 2;
                        if ((0x33CC1ED6B154DE5L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6) ^ 0x3D0CBD681509B801L ^ 0x3D0CBD681509B801L);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6);
                    }
                    n -= 4;
                    continue block36;
                }
                case -1456406957: {
                    int cfr_ignored_8 = (Integer.rotateRight(0x4CD75736 ^ n2, 12) - 1383149253) * 1289180983;
                    n3 = Integer.rotateLeft(n2 ^ 0x5F9C2617, 6) ^ 0xAC3D0D81 ^ 0xAC3D0D81;
                    int cfr_ignored_9 = (Integer.rotateLeft(0x59A51191 ^ n2, 14) + -547700790) * 1503990161;
                    int cfr_ignored_10 = (int)(0x9B17BFAC27D4EB4FL ^ (long)n2 ^ 0x8228831A2DB89BFEL);
                    try {
                        if ((0xFCDC2DF9954EC47L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6) + 2121483293 - 2121483293;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6) ^ 0x6D6ABFBF ^ 0x6D6ABFBF;
                    }
                    ++n;
                    continue block36;
                }
                case -1462763862: {
                    int cfr_ignored_11 = (Integer.rotateLeft(0x6C85B1B1 ^ n2, 16) + 680403882) * 1820701105;
                    int cfr_ignored_12 = (int)(0xAE371F8C27D4EB4FL ^ (long)n2 ^ 0xC268831A2DB8F1BFL);
                    try {
                        n -= 2;
                        if ((0x9271C34E5C5F3789L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6)));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6)));
                    }
                    n += 4;
                    continue block36;
                }
                case 2132171653: {
                    int cfr_ignored_13 = Integer.rotateRight(0x53E85D83 ^ n2, 13) + 763425304;
                    n3 = Integer.rotateLeft(n2 ^ 0x537E99EF, 6);
                    int cfr_ignored_14 = Integer.rotateLeft(0xEDDE04A1 ^ n2, 16) + -767545670;
                    int cfr_ignored_15 = (int)(0x2F6CAA9C27D4EB4FL ^ (long)n2 ^ 0xA848831A2DB9F308L);
                    int cfr_ignored_16 = (int)(0x9425C4911B1871EFL ^ (long)n2 ^ 0x7452FA8318F8859AL);
                    n3 = Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6);
                    continue block36;
                }
                case 1759431023: {
                    int cfr_ignored_17 = (Integer.rotateRight(0xC6D208DA ^ n2, 11) + 399290785) * -959313701;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xFE881F8C, 6)));
                    int cfr_ignored_18 = Integer.rotateLeft(0x7035902C ^ n2, 17) - -1696983921;
                    try {
                        n += 2;
                        n3 = Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6) + 1754446831 - 1754446831;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6) + 217695925 - 217695925;
                    }
                    ++n;
                    continue block36;
                }
                case 1816070997: {
                    int cfr_ignored_19 = (Integer.rotateRight(0x416C0053 ^ n2, 11) + -260986552) * 1097597011;
                    try {
                        n += 5;
                        if ((0x88CDEF3F9F163CF5L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6) ^ 0x60BBEC75C0167E19L ^ 0x60BBEC75C0167E19L);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6)));
                    }
                    continue block36;
                }
                case -1675042425: {
                    int cfr_ignored_20 = Integer.rotateRight(0x300761A3 ^ n2, 9) + -717065736;
                    n3 = Integer.rotateLeft(n2 ^ 0x6C90622F, 6) + 888183293 - 888183293;
                    int cfr_ignored_21 = (Integer.rotateRight(0xAE0D0F6 ^ n2, 4) - 1435954437) * 182505719;
                    try {
                        n -= 4;
                        if ((0x5643894930CE3273L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6);
                    }
                    --n;
                    continue block36;
                }
                case 624477792: {
                    int cfr_ignored_22 = Integer.rotateLeft(0xD6DDCCED ^ n2, 13) - 154759150;
                    int cfr_ignored_23 = (int)(0x146F62D027D4EB4FL ^ (long)n2 ^ 0x38D0831A2DB9850FL);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x27A04419, 6)));
                    int cfr_ignored_24 = Integer.rotateLeft(0xD5171D2C ^ n2, 13) - -768989297;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xCE60AF2, 6)));
                    int cfr_ignored_25 = Integer.rotateLeft(0x5A720605 ^ n2, 14) - -131311146;
                    int cfr_ignored_26 = (int)(0x98C0A83827D4EB4FL ^ (long)n2 ^ 0xAD00831A2DB89C50L);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6)));
                    ++n;
                    continue block36;
                }
                case 2087540558: {
                    int cfr_ignored_27 = Integer.rotateRight(0xCB33460F ^ n2, 12) - -1617749236;
                    try {
                        n -= 5;
                        if ((0x9405071D81FDB937L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6) ^ 0x4C216227312B834EL ^ 0x4C216227312B834EL);
                    }
                    --n;
                    continue block36;
                }
                case -1741293099: {
                    int cfr_ignored_28 = (Integer.rotateRight(0xF84A20FA ^ n2, 18) + 358063489) * -129359621;
                    n3 = Integer.rotateLeft(n2 ^ 0x38100E13, 6) ^ 0x7639CAA0 ^ 0x7639CAA0;
                    int cfr_ignored_29 = Integer.rotateLeft(0xA2AB8D61 ^ n2, 7) + -1222394374;
                    int cfr_ignored_30 = (int)(0x6019235C27D4EB4FL ^ (long)n2 ^ 0xBBC8831A2DB96DE3L);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6) ^ 0x585E2C5B205990C7L ^ 0x585E2C5B205990C7L);
                    ++n;
                    continue block36;
                }
            }
            int cfr_ignored_31 = (Integer.rotateLeft(0xA757D4B5 ^ n2, 7) - 1207984422) * -1487416139;
            int cfr_ignored_32 = (int)(0x65E57A8827D4EB4FL ^ (long)n2 ^ 0x860831A2DB9661BL);
            n3 = Integer.rotateLeft(n2 ^ 0x3D91DF5A, 6) + -86657104 - -86657104;
        }
    }

    private class_1309 dh() {
        tkhdh tkhdh2;
        int n = bjb.ttb_3(1073601603);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x48DD5860;
        if ((n2 ^ n) != 1222465632) {
            int cfr_ignored_0 = Integer.rotateRight(0x77208423 ^ n, 17) + 1900912504;
        }
        if ((tkhdh2 = bldh.hnd()) != null && tkhdh2.rgha_2()) {
            return tkhdh2.rkhh_2();
        }
        return null;
    }

    private void zkkh(List list) {
        int n = 77188737;
        n = Integer.rotateLeft(n * -917492069, 22) ^ 0x63AFC586;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 9);
        List list2 = list;
        n = (list2 != null ? System.identityHashCode(list2) : 0) ^ n;
        int n2 = n ^ 0xB71A2B09;
        if ((n2 ^ n) != -1223021815) {
            int cfr_ignored_0 = (0xB383E588 ^ n) - 2054967261;
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        float f = bldh.blsh(this.shsk);
        for (sj sj2 : list) {
            String string = sj2.tds();
            float f2 = this.yj.getOrDefault(string, Float.valueOf(0.0f)).floatValue() + bldh.tlk_2(sj2);
            this.yj.put(string, Float.valueOf(f2));
            if (!(f2 >= f)) continue;
            bldh.tjs_3(this, sj2, f2);
        }
    }

    private void tfa(sj sj2, float f) {
        int n = -2081716025;
        n = Integer.rotateLeft(n * -522317245, 3) ^ 0x2DE16363;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 24);
        sj sj3 = sj2;
        n = (sj3 != null ? System.identityHashCode(sj3) : 0) ^ n;
        int n2 = n ^ 0xBBE49BDC;
        if ((n2 ^ n) != -1142645796) {
            int cfr_ignored_0 = (0x380F131B ^ n) + -212427094;
        }
        if (!yf.khdha_2()) {
            bldh.dzd_7();
            throw null;
        }
        long l = System.currentTimeMillis();
        String string = sj2.tds() + "_" + String.valueOf((Object)sj2.khkhj());
        Long l2 = (Long)this.dhsa_4.get(string);
        if (l2 != null && l - l2 < (0xBE05D7FE3A6B2F29L ^ 0xBE05D7FE3A6B2A51L)) {
            return;
        }
        this.dhsa_4.put(string, l);
        if (this.jqz_2.shzl() && bldh.mc.field_1724 != null) {
            String string2 = bldh.ddhd_3(sj2, this.shtha.shzl());
            bldh.jjw(bldh.mc.field_1724, (class_2561)class_2561.method_43470((String)string2), false);
        }
        if (this.dby.shzl() && bldh.mc.field_1724 != null && bldh.mc.field_1687 != null) {
            bldh.mc.field_1687.method_43128((class_1657)bldh.mc.field_1724, bldh.mc.field_1724.method_23317(), bldh.mc.field_1724.method_23318(), bldh.jjj(bldh.mc.field_1724), (class_3414)class_3417.field_14622.comp_349(), class_3419.field_15248, Float.intBitsToFloat(109008595 + 951311456), Float.intBitsToFloat(Integer.rotateLeft(0x5EA2EE34 ^ 0x38CB1152, 13)));
        }
    }

    /*
     * Unable to fully structure code
     */
    private void skh_6(String var1_1) {
        var4_2 = 0;
        var2_3 = -1314442595;
        var2_3 = Integer.rotateLeft(var2_3 * 1198537605, 25) ^ 344939738;
        var2_3 = System.identityHashCode(this) ^ var2_3;
        v0 = var1_1;
        var2_3 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var2_3;
        var3_4 = (-426671594 * 504361465 + 804699062 ^ var2_3) + 1448090246 - 1448090246;
        while (true) {
            block40: {
                block37: {
                    block43: {
                        block42: {
                            block31: {
                                block35: {
                                    block38: {
                                        block36: {
                                            block39: {
                                                block33: {
                                                    block34: {
                                                        block32: {
                                                            block41: {
                                                                var4_2 = ((var3_4 ^ var2_3) - 804699062) * 907280457;
                                                                switch (var4_2 & 7) {
                                                                    case 0: {
                                                                        if (var4_2 == 1370366912) break block31;
                                                                        if (var4_2 != 1934046880) {
                                                                            ** break;
                                                                        }
                                                                        break block32;
                                                                    }
                                                                    case 3: {
                                                                        if (var4_2 == 173775539) break block33;
                                                                        if (var4_2 == -469868101) break block34;
                                                                        Integer.rotateRight(712253807 ^ var2_3, 8) - 678276012;
                                                                        if (var4_2 != -499067453) {
                                                                            ** break;
                                                                        }
                                                                        break block35;
                                                                    }
                                                                    case 4: {
                                                                        if (var4_2 == -1351385900) break block36;
                                                                        if (var4_2 == -1239223636) break block37;
                                                                        if (var4_2 == 44151884) break block38;
                                                                        if (var4_2 != 1107797476) {
                                                                            ** break;
                                                                        }
                                                                        break block39;
                                                                    }
                                                                    case 5: {
                                                                        if (var4_2 != 335176477) {
                                                                            if (var4_2 == 435019093) break;
                                                                            ** break;
                                                                        }
                                                                        break block40;
                                                                    }
                                                                    case 6: {
                                                                        if (var4_2 == -426671594) break block41;
                                                                        if (var4_2 != 1543449358) {
                                                                            (Integer.rotateLeft(429344409 ^ var2_3, 6) + 498019266) * 429344409;
                                                                            (int)(-2655460613524493489L ^ (long)var2_3 ^ 3186440884824054682L);
                                                                            ** break;
                                                                        }
                                                                        break block42;
                                                                    }
                                                                    case 7: {
                                                                        if (var4_2 != -900552289) {
                                                                            ** break;
                                                                        }
                                                                        break block43;
                                                                    }
                                                                }
                                                                (Integer.rotateRight(-150751746 ^ var2_3, 17) - -305092355) * -150751745;
                                                                bldh.mc.field_1724.method_7353((class_2561)bldh.dshq_2("§8[§6PhysicsAuditor§8] §f" + var1_1), false);
                                                                var3_4 = 1934046880 * 504361465 + 804699062 ^ var2_3 ^ -1428682639 ^ -1428682639;
                                                                (Integer.rotateRight(1632785722 ^ var2_3, 15) + -850005695) * 1632785723;
                                                                continue;
                                                            }
                                                            (Integer.rotateLeft(818761180 ^ var2_3, 9) - -314962721) * 818761181;
                                                            if (bldh.mc.field_1724 == null) {
                                                                try {
                                                                    if ((4386871936702559461L ^ (long)var2_3 | 1L) == 0L) {
                                                                        throw new NoSuchElementException();
                                                                    }
                                                                    var3_4 = 1934046880 * 504361465 + 804699062 ^ var2_3;
                                                                }
                                                                catch (NoSuchElementException v1) {
                                                                    var3_4 = (int)((long)(1934046880 * 504361465 + 804699062 ^ var2_3) ^ 8510718132314350404L ^ 8510718132314350404L);
                                                                }
                                                                continue;
                                                            }
                                                            try {
                                                                if ((6647639921364801771L ^ (long)var2_3 | 1L) == 0L) {
                                                                    throw new IllegalArgumentException();
                                                                }
                                                                var3_4 = (435019093 * 504361465 + 804699062 ^ var2_3) + -12504238 - -12504238;
                                                            }
                                                            catch (IllegalArgumentException v2) {
                                                                var3_4 = (int)((long)(435019093 * 504361465 + 804699062 ^ var2_3) ^ -7130371333752855921L ^ -7130371333752855921L);
                                                            }
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(-1680431388 ^ var2_3, 6) - -480521001;
                                                        return;
                                                    }
                                                    Integer.rotateRight(-56465465 ^ var2_3, 18) - -1677184940;
                                                    var3_4 = -663139033 * 504361465 + 804699062 ^ var2_3;
                                                    Integer.rotateLeft(292246536 ^ var2_3, 5) + 542952499;
                                                    var3_4 = Integer.reverse(Integer.reverse(-426671594 * 504361465 + 804699062 ^ var2_3));
                                                    (Integer.rotateLeft(-371718147 ^ var2_3, 16) - 1434883806) * -371718147;
                                                    (int)(3128499533929311055L ^ (long)var2_3 ^ -5841024568239981820L);
                                                    var4_2 += 4;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(1988257116 ^ var2_3, 17) - 1579672927) * 1988257117;
                                                var3_4 = Integer.reverse(Integer.reverse(-2138616742 * 504361465 + 804699062 ^ var2_3));
                                                Integer.rotateRight(1772844547 ^ var2_3, 16) + -803149416;
                                                (int)(6510672777575760024L ^ (long)var2_3 ^ -2181408147366274716L);
                                                var3_4 = Integer.reverse(Integer.reverse(-1797874968 * 504361465 + 804699062 ^ var2_3));
                                                (int)(3205278199214153142L ^ (long)var2_3 ^ 2478282023774188839L);
                                                var3_4 = -426671594 * 504361465 + 804699062 ^ var2_3 ^ 425350469 ^ 425350469;
                                                var4_2 += 3;
                                                continue;
                                            }
                                            Integer.rotateRight(-1892989598 ^ var2_3, 4) + 1520109081;
                                            var3_4 = (-116899856 * 504361465 + 804699062 ^ var2_3) + 1097347161 - 1097347161;
                                            Integer.rotateLeft(-498076892 ^ var2_3, 15) - 1812730007;
                                            var3_4 = (int)((long)(-426671594 * 504361465 + 804699062 ^ var2_3) ^ 3654920174565584816L ^ 3654920174565584816L);
                                            continue;
                                        }
                                        (Integer.rotateRight(190599763 ^ var2_3, 4) + 1686869832) * 190599763;
                                        try {
                                            var4_2 += 4;
                                            var3_4 = -426671594 * 504361465 + 804699062 ^ var2_3 ^ 1300334495 ^ 1300334495;
                                        }
                                        catch (UnsupportedOperationException v3) {
                                            var3_4 = Integer.reverse(Integer.reverse(-426671594 * 504361465 + 804699062 ^ var2_3));
                                        }
                                        var4_2 -= 4;
                                        continue;
                                    }
                                    (Integer.rotateRight(-243920557 ^ var2_3, 17) + 1101641800) * -243920557;
                                    var3_4 = 178063701 * 504361465 + 804699062 ^ var2_3;
                                    Integer.rotateLeft(-1807338904 ^ var2_3, 5) + -119686701;
                                    try {
                                        if ((-4620095466676293421L ^ (long)var2_3 | 1L) == 0L) {
                                            throw new ArithmeticException();
                                        }
                                        var3_4 = -426671594 * 504361465 + 804699062 ^ var2_3;
                                    }
                                    catch (ArithmeticException v4) {
                                        var3_4 = (-426671594 * 504361465 + 804699062 ^ var2_3) + 731006047 - 731006047;
                                    }
                                    var4_2 -= 2;
                                    continue;
                                }
                                Integer.rotateRight(906959275 ^ var2_3, 9) + -1875789072;
                                var3_4 = (-426671594 * 504361465 + 804699062 ^ var2_3) + -1116902155 - -1116902155;
                                Integer.rotateLeft(2125194668 ^ var2_3, 18) - 1529769743;
                                continue;
                            }
                            (Integer.rotateLeft(821214268 ^ var2_3, 9) - -238916993) * 821214269;
                            try {
                                var4_2 += 5;
                                var3_4 = (int)((long)(-426671594 * 504361465 + 804699062 ^ var2_3) ^ -8776311843244742977L ^ -8776311843244742977L);
                            }
                            catch (IllegalStateException v5) {
                                var3_4 = (int)((long)(-426671594 * 504361465 + 804699062 ^ var2_3) ^ 6667224010699839772L ^ 6667224010699839772L);
                            }
                            var4_2 += 4;
                            continue;
                        }
                        (Integer.rotateRight(-432030249 ^ var2_3, 15) - -434791356) * -432030249;
                        var3_4 = 1585649381 * 504361465 + 804699062 ^ var2_3;
                        Integer.rotateLeft(-1879447251 ^ var2_3, 4) - 1939921838;
                        (int)(5569623498887064399L ^ (long)var2_3 ^ 8309285460958066503L);
                        var3_4 = (int)((long)(-426671594 * 504361465 + 804699062 ^ var2_3) ^ -84752272540648297L ^ -84752272540648297L);
                        Integer.rotateRight(783544771 ^ var2_3, 8) + -1406671400;
                        continue;
                    }
                    (Integer.rotateLeft(558766928 ^ var2_3, 7) + 215150059) * 558766929;
                    var3_4 = Integer.reverse(Integer.reverse(311708384 * 504361465 + 804699062 ^ var2_3));
                    (Integer.rotateRight(-1103331946 ^ var2_3, 10) - 229692517) * -1103331945;
                    var3_4 = Integer.reverse(Integer.reverse(-426671594 * 504361465 + 804699062 ^ var2_3));
                    var4_2 += 4;
                    continue;
                }
                (Integer.rotateLeft(-532589447 ^ var2_3, 15) + 742840802) * -532589447;
                (int)(2518631787263224655L ^ (long)var2_3 ^ 718468289025140790L);
                var3_4 = -1151535621 * 504361465 + 804699062 ^ var2_3 ^ -1260158658 ^ -1260158658;
                Integer.rotateLeft(1080188077 ^ var2_3, 11) - -800663506;
                (int)(-9020443352665625777L ^ (long)var2_3 ^ 1752044403506587760L);
                try {
                    ++var4_2;
                    var3_4 = Integer.reverse(Integer.reverse(-426671594 * 504361465 + 804699062 ^ var2_3));
                }
                catch (IllegalArgumentException v6) {
                    var3_4 = Integer.reverse(Integer.reverse(-426671594 * 504361465 + 804699062 ^ var2_3));
                }
                ++var4_2;
                continue;
            }
            (Integer.rotateRight(-1699864522 ^ var2_3, 6) - -1082948155) * -1699864521;
            (int)(5780373668734750953L ^ (long)var2_3 ^ -359303519209714271L);
            var3_4 = -271106757 * 504361465 + 804699062 ^ var2_3 ^ 1419549819 ^ 1419549819;
            (int)(-3331484505372580231L ^ (long)var2_3 ^ -7094196723251933607L);
            var3_4 = -426671594 * 504361465 + 804699062 ^ var2_3;
            continue;
lbl208:
            // 7 sources

            Integer.rotateRight(-1037169214 ^ var2_3, 11) + -2014230087;
            var3_4 = Integer.reverse(Integer.reverse(-426671594 * 504361465 + 804699062 ^ var2_3));
        }
    }

    private void ansh(bbgh bbgh2) {
        int n = -256251661;
        int n2 = (n = Integer.rotateLeft(n * -927501473, 16) ^ 0xCA1A8849) ^ 0x14FE28AD;
        if ((n2 ^ n) != 352200877) {
            int cfr_ignored_0 = (0xE447C05E ^ n) - -1297620429;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (!this.sdq_3.shzl() || bldh.mc.field_1724 == null || bldh.mc.field_1772 == null) {
            return;
        }
        ghdh_3 ghdh2 = bbgh2.dtn();
        int n3 = 212641707 - 212641701;
        int n4 = Integer.rotateLeft(0x7B27F775 ^ 0x7B279375, 23);
        int n5 = Integer.rotateLeft(0xEC5D4B50 ^ 0xF61D4B50, 11);
        int n6 = 1510382864 + -1510382726;
        ghdh2.method_25294(n3, n4, n3 + n5, n4 + n6, 50791955 - 854913529);
        ghdh2.method_25294(n3, n4, n3 + n5, n4 + 1, 875387293 + -887292981);
        ghdh2.method_25294(n3, n4, n3 + 1, n4 + n6, 2146388220 + 2136673388);
        ghdh2.method_25294(n3 + n5 - 1, n4, n3 + n5, n4 + n6, 0xFF686EBC ^ 0x223BD4);
        ghdh2.method_25294(n3, n4 + n6 - 1, n3 + n5, n4 + n6, -2099890117 + 2087984429);
        ghdh2.method_51433(bldh.mc.field_1772, "\u00a76[Polar ML Auditor] \u00a77Telemetry", n3 + Integer.rotateLeft(0xA3457884 ^ 0xA0457884, 9), n4 + 5, Integer.reverse(-531689128) ^ 0x1A770DF8, true);
        ghdh2.method_51433(bldh.mc.field_1772, "§8Profile: §f" + (this.khwl.sdh_2() != null ? this.khwl.sdh_2().getName() : "Polar"), n3 + Integer.rotateLeft(0xC07ABB58 ^ 0xC07A4B58, 23), n4 + 5, 0xAEEB7671 ^ 0xAE14898E, true);
        ghdh2.method_25294(n3 + 4, n4 + (295625777 - 295625761), n3 + n5 - 4, n4 + (-801809706 + 801809723), Integer.rotateLeft(0x791D3514 ^ 0x9CBBDC0B, 27));
        int n7 = n4 + (556415562 + -556415541);
        int n8 = Integer.rotateLeft(0x44903776 ^ 0x449B3776, 16);
        float f = this.tbsh.khyr;
        String string = f > Float.intBitsToFloat(Integer.reverse(-461576185) ^ 0xA2E73E27) ? "\u00a7c" : (f > Float.intBitsToFloat(-948651952 - -2066433968) ? "\u00a7e" : "\u00a7a");
        ghdh2.method_51433(bldh.mc.field_1772, "Angular Je".concat("rk (j):"), n3 + (-512091114 - -512091120), n7, 0x8E4133D7 ^ 0x8E8DFF1B, true);
        ghdh2.method_51433(bldh.mc.field_1772, String.format("%s%.1f\u00b0/t\u00b2", string, Float.valueOf(f)), n3 + (Integer.reverse(-495285190) ^ 0x5C315EC5), n7, 1097905712 - 1081128497, true);
        float f2 = this.tbsh.tml;
        String string2 = f2 > Float.intBitsToFloat(0x455B1236 ^ 0x7A266292) ? "\u00a7c" : (f2 > Float.intBitsToFloat(Integer.rotateLeft(0x7F1E9C3A ^ 0xDCC6E2CA, 15)) ? "\u00a7e" : "\u00a7a");
        ghdh2.method_51433(bldh.mc.field_1772, "B\u00e9zier Linear".concat("ity (R\u00b2):"), n3 + Integer.rotateLeft(0x1E923AF5 ^ 0x1E92FAF5, 19), n7 += n8, Integer.rotateLeft(0x38A49AA ^ 0xCF8A8566, 8), true);
        ghdh2.method_51433(bldh.mc.field_1772, String.format("%s%.4f", string2, Float.valueOf(f2)), n3 + Integer.rotateLeft(0xE40108F1 ^ 0xEC0108F3, 6), n7, -279277595 + 296054810, true);
        float f3 = this.tbsh.bkhkh;
        String string3 = f3 < Float.intBitsToFloat(-395534102 - -1437399216) ? "\u00a7c" : (f3 < Float.intBitsToFloat(-144201841 + 1196133284) ? "\u00a7e" : "\u00a7a");
        ghdh2.method_51433(bldh.mc.field_1772, "Post-Attack Ratio (R):", n3 + Integer.rotateLeft(0xF462DB7C ^ 0xF462DBBC, 27), n7 += n8, 0x129C81F1 ^ 0x12504D3D, true);
        ghdh2.method_51433(bldh.mc.field_1772, String.format("%s%.3f", string3, Float.valueOf(f3)), n3 + Integer.rotateLeft(0x2F71E42B ^ 0xAD71E42B, 8), n7, 573522411 + -556745196, true);
        float f4 = this.sdhs.shdht_2 * Float.intBitsToFloat(Integer.rotateLeft(0x28E4F85C ^ 0x4CE4F87D, 25));
        String string4 = f4 > Float.intBitsToFloat(570983909 + 521632283) ? "\u00a7c" : (f4 > Float.intBitsToFloat(Integer.rotateLeft(0xD36DD6C3 ^ 0xFB6DD6D3, 26)) ? "\u00a7e" : "\u00a7a");
        ghdh2.method_51433(bldh.mc.field_1772, "GCD Err".concat("or (%):"), n3 + (0xC1DF7568 ^ 0xC1DF756E), n7 += n8, -1060969769 - -1074391541, true);
        ghdh2.method_51433(bldh.mc.field_1772, String.format("%s%.1f%%", string4, Float.valueOf(f4)), n3 + (-598472139 - -598472269), n7, 0xBEF199D7 ^ 0xBE0E6628, true);
        float f5 = this.shghn.byth;
        String string5 = f5 > Float.intBitsToFloat(-472036042 + 1549133309) ? "\u00a7c" : (f5 > Float.intBitsToFloat(0x3212DB77 ^ 0x7232DB77) ? "\u00a7e" : "\u00a7a");
        ghdh2.method_51433(bldh.mc.field_1772, "Noise Ent".concat("ropy (H):"), n3 + (0xDF679D34 ^ 0xDF679D32), n7 += n8, 1379676632 + -1366254860, true);
        ghdh2.method_51433(bldh.mc.field_1772, String.format("%s%.2f", string5, Float.valueOf(f5)), n3 + (1254475634 - 1254475504), n7, -770130370 + 786907585, true);
        float f6 = this.shghn.bzl_2;
        String string6 = f6 < Float.intBitsToFloat(Integer.reverse(1943328257) ^ 0xBCA7E703) ? "\u00a7c" : (f6 < Float.intBitsToFloat(0x9616BEC6 ^ 0xAB637C49) ? "\u00a7e" : "\u00a7a");
        ghdh2.method_51433(bldh.mc.field_1772, "Target Lock ".concat("Var (\u03c3\u00b2):"), n3 + (-2042559320 - -2042559326), n7 += n8, -983265096 + 996686868, true);
        ghdh2.method_51433(bldh.mc.field_1772, String.format("%s%.4f", string6, Float.valueOf(f6)), n3 + Integer.rotateLeft(0x6A163B32 ^ 0x6A167A32, 25), n7, Integer.reverse(424728799) ^ 0xFBE4F567, true);
        double d = this.ztk.thmd_2;
        double d2 = this.ztk.sshd;
        String string7 = d < Double.longBitsToDouble(0x62C306C14F02A0BBL ^ 0xDD3306C14F02A0BBL) ? "\u00a7c" : (d < 0.0 ? "\u00a7e" : "\u00a7a");
        ghdh2.method_51433(bldh.mc.field_1772, "Kurtosis ".concat("/ Skew:"), n3 + (590895201 + -590895195), n7 += n8, Integer.rotateLeft(0x2F8D6265 ^ 0x3614FBE5, 27), true);
        ghdh2.method_51433(bldh.mc.field_1772, String.format("%s%.2f \u00a77/ \u00a7f%.2f", string7, d, d2), n3 + (580599016 - 580598886), n7, -157057668 + 173834883, true);
        long l = this.rra.jtz_3;
        String string8 = l > 0L && l < (0x3008607C027FE0CFL ^ 0x3008607C027FE0D1L) ? "\u00a7c" : (l < (0x5D43E4FFCD3209DEL ^ 0x5D43E4FFCD3209E9L) && l > 0L ? "\u00a7e" : "\u00a7a");
        ghdh2.method_51433(bldh.mc.field_1772, "Bot-8 Delay (ms):", n3 + Integer.rotateLeft(0x4955452A ^ 0xC955452B, 2), n7 += n8, 1624583809 - 1611162037, true);
        ghdh2.method_51433(bldh.mc.field_1772, String.format("%s%dms", string8, l), n3 + (1242248632 + -1242248502), n7, 0x9269B7A9 ^ 0x92964856, true);
        double d3 = this.rra.tah;
        String string9 = d3 > Double.longBitsToDouble(0xF683D79D4ED4FD23L ^ 0xB6C5579D4ED4FD23L) ? "\u00a7c" : (d3 > Double.longBitsToDouble(0x60D458883EAB33E3L ^ 0x20FA58883EAB33E3L) ? "\u00a7e" : "\u00a7a");
        ghdh2.method_51433(bldh.mc.field_1772, "Silent M".concat("ove Angle:"), n3 + (0x4B86AD41 ^ 0x4B86AD47), n7 += n8, -1242279053 - -1255700825, true);
        ghdh2.method_51433(bldh.mc.field_1772, String.format("%s%.1f\u00b0", string9, d3), n3 + (1175681591 - 1175681461), n7, Integer.rotateLeft(0xC0D9CCC3 ^ 0xCF263333, 28), true);
    }

    private void dln_2(ghh_2 ghh2) {
        Object object;
        String string;
        class_746 class_7462;
        int n = bjb.ttb_3(128949760);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xB6844064;
        if ((n2 ^ n) != -1232846748) {
            int cfr_ignored_0 = Integer.rotateLeft(0xB12BDE64 ^ n, 9) - 2024639831;
        }
        if ((class_7462 = bldh.mc.field_1724) == null || bldh.mc.field_1687 == null || !this.rndh) {
            return;
        }
        class_2596 class_25962 = ghh2.zjd();
        String string2 = string = this.khwl.sdh_2() != null ? this.khwl.sdh_2().getName() : "Polar ".concat("Enterprise");
        if (class_25962 instanceof class_2828) {
            object = (class_2828)class_25962;
            if (object.method_36172()) {
                List list;
                float f = object.method_12271(this.zghn);
                float f2 = object.method_12270(this.akh);
                float f3 = class_3532.method_15393((float)(f - this.zghn));
                float f4 = f2 - this.akh;
                if (this.hzkh.shzl() || this.dhtd_4.shzl()) {
                    list = this.tbsh.zas_6(class_7462, f3, f4, string, false);
                    this.zkkh(list);
                }
                if (this.ky.shzl()) {
                    list = this.sdhs.dddh(mc, f3, f4, string);
                    this.zkkh(list);
                }
                if (this.shghd_2.shzl()) {
                    list = this.dh();
                    List list2 = this.shghn.khts(class_7462, (class_1309)list, f, f2, f3, f4, string);
                    this.zkkh(list2);
                }
                this.zghn = f;
                this.akh = f2;
            }
            if (this.jsb_2.shzl()) {
                List list = this.sm.rqw(mc, class_7462, (class_2828)object, string);
                this.zkkh(list);
            }
        }
        if (class_25962 instanceof class_2824) {
            this.tbsh.stt_2(this.zghn, this.akh);
            this.shghn.bkhkh(this.zghn);
            if (this.hnf.shzl()) {
                object = this.ztk.jrw(string);
                this.zkkh((List)object);
            }
        }
        if (this.db.shzl() || this.thls_2.shzl()) {
            object = this.rra.tkhdh_2(mc, class_25962, string);
            this.zkkh((List)object);
        }
    }

    private void hzm_2(btt btt2) {
        class_746 class_7462;
        int n = -2120793820;
        n = Integer.rotateLeft(n * -1678371499, 9) ^ 0xAB6664A5;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 18);
        btt btt3 = btt2;
        n = (btt3 != null ? System.identityHashCode(btt3) : 0) ^ n;
        int n2 = n ^ 0xC993050A;
        if ((n2 ^ n) != -913111798) {
            int cfr_ignored_0 = (0x4804442E ^ n) - 1053664417;
        }
        if ((class_7462 = bldh.mc.field_1724) == null || bldh.mc.field_1687 == null) {
            return;
        }
        if (!this.rndh) {
            this.zghn = class_7462.method_36454();
            this.akh = class_7462.method_36455();
            this.rndh = true;
        }
        this.rra.dwj(class_7462);
        if (!this.yj.isEmpty()) {
            this.yj.entrySet().removeIf(bldh::shs_7);
        }
    }

    private static boolean shs_7(Map.Entry entry) {
        try {
            int n = -1129556171;
            n = Integer.rotateLeft(n * 1860534883, 23) ^ 0xFA2120D9;
            int n2 = n ^ 0x543F10CE;
            if ((n2 ^ n) != 1413419214) {
                int cfr_ignored_0 = (0xE89347FB ^ n) + 839494723;
            }
            if ((0xE9 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        float f = ((Float)entry.getValue()).floatValue() - Float.intBitsToFloat(592107729 + 436335612);
        if (f <= 0.0f) {
            return true;
        }
        entry.setValue(Float.valueOf(f));
        return false;
    }

    private static String bdh_3(String string, int n, int n2, int n3) {
        int n4 = -1885332413;
        n4 = Integer.rotateLeft(n4 * -256705305, 27) ^ 0xD8B2ED9B;
        int n5 = (n4 = n3 ^ n4) ^ 0xFEF8440A;
        if ((n5 ^ n4) != -17284086) {
            int cfr_ignored_0 = (0x71585849 ^ n4) + -862321265;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x2072F05A) + n2 ^ i * -179144779) ^ khkhr) + zkhd);
        }
        return new String(cArray);
    }

    private static void dma_3(bldh bldh2) {
        int n = 1748380953;
        int n2 = (n = Integer.rotateLeft(n * 1511670197, 22) ^ 0xA0FE0FF8) ^ 0xC693E11B;
        if ((n2 ^ n) != -963387109) {
            int cfr_ignored_0 = (0xAEA5CC02 ^ n) + -1250641590;
        }
        bldh2.shtd_4();
    }

    private static String thdhkh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bjb.ttb_3(237548082);
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 5)) ^ 0x3994D956;
            if ((n5 ^ n4) == 966056278) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x37BC6B64 ^ n4, 9) - -1003577257;
        }
        return bldh.bdh_3(string, n, n2, n3);
    }

    private static void zdd(shn_3 shn2) {
        int n = bjb.ttb_3(-1368702814);
        shn_3 shn3 = shn2;
        n = (shn3 != null ? System.identityHashCode(shn3) : 0) ^ n;
        int n2 = n ^ 0xC9731FA5;
        if ((n2 ^ n) != -915202139) {
            int cfr_ignored_0 = Integer.rotateRight(0x67185F07 ^ n, 15) - -2142166764;
        }
        shn2.thss_2();
    }

    private static void dkhf_2(wd wd2) {
        int n = 2091584710;
        n = Integer.rotateLeft(n * 194597761, 11) ^ 0x7EA95E7A;
        wd wd3 = wd2;
        n = (wd3 != null ? System.identityHashCode(wd3) : 0) ^ n;
        int n2 = n ^ 0xF04F13D6;
        if ((n2 ^ n) != -263253034) {
            int cfr_ignored_0 = (0x8CE41F10 ^ n) - 1537112912;
        }
        wd2.khqz();
    }

    private static void thsd(bks_2 bks2) {
        int n = -1690525839;
        int n2 = (n = Integer.rotateLeft(n * -378904343, 28) ^ 0x2ED36BD2) ^ 0xEF10C852;
        if ((n2 ^ n) != -284112814) {
            int cfr_ignored_0 = (0x742C5723 ^ n) + 1585032596;
        }
        bks2.hbh();
    }

    private static tkhdh hnd() {
        block0: {
            int n = bjb.ttb_3(-798729941);
            int n2 = n ^ 0xA4E892C5;
            if ((n2 ^ n) == -1528261947) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x748CCBEE ^ n, 17) - 560615693;
        }
        return tkhdh.zkhr_2();
    }

    private static float blsh(tay tay2) {
        block0: {
            int n = bjb.ttb_3(-1318667593);
            tay tay3 = tay2;
            n = (tay3 != null ? System.identityHashCode(tay3) : 0) ^ n;
            int n2 = n ^ 0xD82A9D65;
            if ((n2 ^ n) == -668295835) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x694C27D2 ^ n, 16) + -996773463) * 1766598611;
        }
        return tay2.hkj();
    }

    private static float tlk_2(sj sj2) {
        block0: {
            int n = bjb.ttb_3(2071186129);
            sj sj3 = sj2;
            n = Integer.rotateLeft((sj3 != null ? System.identityHashCode(sj3) : 0) ^ n, 7);
            int n2 = n ^ 0xC2ECC3E0;
            if ((n2 ^ n) == -1024670752) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xB99F0931 ^ n, 10) + 2124397610) * -1180759759;
            int cfr_ignored_1 = (int)(0x7B2DA70C27D4EB4FL ^ (long)n ^ 0xB368831A2DB95B8AL);
        }
        return sj2.shmd();
    }

    private static void tjs_3(bldh bldh2, sj sj2, float f) {
        int n = bjb.ttb_3(17620262);
        int n2 = n ^ 0x12EA95CB;
        if ((n2 ^ n) != 317363659) {
            int cfr_ignored_0 = Integer.rotateLeft(0x13E648ED ^ n, 5) - 1832940526;
            int cfr_ignored_1 = (int)(0xD154E6D027D4EB4FL ^ (long)n ^ 0x30D0831A2DB80F78L);
        }
        bldh2.tfa(sj2, f);
    }

    private static void dzd_7() {
        int n = 1815269880;
        int n2 = (n = Integer.rotateLeft(n * 2057459233, 24) ^ 0x320C65DF) ^ 0x7626E25C;
        if ((n2 ^ n) != 1982259804) {
            int cfr_ignored_0 = (0x1A1433A4 ^ n) - -1724956856;
        }
        yf.athz_2();
    }

    private static String ddhd_3(sj sj2, boolean bl) {
        block0: {
            int n = -376295559;
            int n2 = (n = Integer.rotateLeft(n * 1621874355, 8) ^ 0x5A9825C4) ^ 0x8631A390;
            if ((n2 ^ n) == -2043567216) break block0;
            int cfr_ignored_0 = (0x6FA38CE9 ^ n) + 1135542228;
        }
        return sj2.jtz_4(bl);
    }

    private static void jjw(class_746 class_7462, class_2561 class_25612, boolean bl) {
        int n = bjb.ttb_3(1420540801);
        class_746 class_7463 = class_7462;
        n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 29);
        int n2 = (n = Integer.rotateLeft(bl ^ n, 6)) ^ 0xE78DA647;
        if ((n2 ^ n) != -410147257) {
            int cfr_ignored_0 = Integer.rotateRight(0xB3261DC6 ^ n, 9) - -1241826763;
        }
        class_7462.method_7353(class_25612, bl);
    }

    private static double jjj(class_746 class_7462) {
        block0: {
            int n = -805643602;
            int n2 = (n = Integer.rotateLeft(n * 534771901, 23) ^ 0x93B2E56A) ^ 0x9CD87A21;
            if ((n2 ^ n) == -1663534559) break block0;
            int cfr_ignored_0 = (0x5322A08F ^ n) - 1952442417;
        }
        return class_7462.method_23321();
    }

    private static class_5250 dshq_2(String string) {
        block0: {
            int n = 2064488129;
            int n2 = (n = Integer.rotateLeft(n * -797747021, 17) ^ 0x9EE9C327) ^ 0x61D0DCE7;
            if ((n2 ^ n) == 1641077991) break block0;
            int cfr_ignored_0 = (0x1ADD4A26 ^ n) + 1106120567;
        }
        return class_2561.method_43470((String)string);
    }

    private static String[] tthb(String string) {
        int n = bjb.ttb_3(1002710062);
        int n2 = n ^ 0x7AD693B7;
        if ((n2 ^ n) != 2060882871) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x4112B799 ^ n, 11) + -442377534) * 1091745689;
            int cfr_ignored_1 = (int)(0x83A019A427D4EB4FL ^ (long)n ^ 0xCE38831A2DB8AA91L);
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

    private static CallSite tdhth(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -373444358;
            n3 = Integer.rotateLeft(n3 * 641912561, 10) ^ 0x11306381;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 23);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x2928E8B7;
            if ((n4 ^ n3) != 690546871) {
                int cfr_ignored_0 = (0xC095584D ^ n3) + 881978501;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ jta_2 ^ string.hashCode() ^ n2 + baf ^ i * 1724838219 ^ jta_2, 11) ^ baf));
            }
            String[] stringArray = bldh.tthb(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType3) : lookup.findVirtual(clazz, stringArray[1], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] sxt7msv1cd2z(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite g6ae115pq5r4j(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ s4qa2cq8vupe ^ string.hashCode() ^ n2 + va0sivonvv3 + i * -1025456409) + s4qa2cq8vupe) ^ va0sivonvv3));
            }
            String[] stringArray = bldh.sxt7msv1cd2z(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

