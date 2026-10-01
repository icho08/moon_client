/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1308
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1743
 *  net.minecraft.class_1799
 *  net.minecraft.class_1829
 *  net.minecraft.class_1835
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_746
 *  net.minecraft.class_9362
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1308;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1799;
import net.minecraft.class_1829;
import net.minecraft.class_1835;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_746;
import net.minecraft.class_9362;
import us.m0vy.moondlc.m0vyguard.baf;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bjd_2;
import us.m0vy.moondlc.m0vyguard.bdh_3;
import us.m0vy.moondlc.m0vyguard.brz;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.btj_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bkm;
import us.m0vy.moondlc.m0vyguard.blh_2;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Hitbox", category=bzw.OTHER, desc="Expands targeting bounds with reach-safe aim correction")
public final class bsz_3
extends bnq {
    private static final float tbw = 0.4f;
    private static final long dhn_3 = 1000L;
    private static final double sdq_2 = 0.1;
    private static bsz_3 rbm;
    private final khd dhdy = new khd(this, "Target Scope");
    private final fy dhht_2 = new fy(this.dhdy, "Players").rhh_3();
    private final fy dhqr = new fy(this.dhdy, "Creatures");
    private final fy bddh = new fy(this.dhdy, "Any Living");
    private final badh_2 khms_2 = new badh_2(this, "Combat Item Check").bts(false);
    private final badh_2 szj = new badh_2((hy)this, "Protected Pl".concat("ayers Only"), this::shrd_2).bts(false);
    private final badh_2 zghj = new badh_2(this, "Remember Struck Target").bts(false);
    private final tay jaq_2 = new tay((hy)this, "Targe".concat("t Memory"), this::dhrz).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(1148730011) ^ 0x99BC1E22)).rkh_3(Float.intBitsToFloat(Integer.reverse(9684217) ^ 0xA023C900)).ssd_5(Float.intBitsToFloat(1038971543 - -38964585));
    private final badh_2 khjt_2 = new badh_2(this, "Concealed Debug Box").bts(false);
    private final badh_2 sam_3 = new badh_2(this, "Suppress Exten".concat("ded Indicator")).bts(true);
    private final badh_2 khln = new badh_2(this, "Preset Expansion").bts(true);
    private final tay ztdh = new tay((hy)this, "Preset Amount", this::hzq).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(-132709932 + 1196385426)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x778ABAAF ^ 0xEE131D06, 19))).ssd_5(Float.intBitsToFloat(1204309745 + -150700580));
    private final tay hfsh = new tay((hy)this, "Adjustabl".concat("e Amount"), this.khln::shzl).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(1369409259 + -285810821)).rkh_3(Float.intBitsToFloat(Integer.reverse(869981887) ^ 0xC0379701)).ssd_5(Float.intBitsToFloat(1618896464 + -565287299));
    private final tay dhdhs = new tay((hy)this, "Adjustment".concat(" Floor"), this.khln::shzl).shth_7(0.0f).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(479834169 + 548609172)).ssd_5(0.0f);
    private final tay shfj = new tay((hy)this, "Adjustment Ceiling", this.khln::shzl).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x74DD1490 ^ 0x74DD6A90, 15))).dhbs_2(Float.intBitsToFloat(680884370 - -402714068)).rkh_3(Float.intBitsToFloat(707454085 + 329377864)).ssd_5(Float.intBitsToFloat(-740199227 + 1811424469));
    private final tay bqd = new tay((hy)this, "Adjustment Increment", this.khln::shzl).shth_7(Float.intBitsToFloat(0x536E1832 ^ 0x6E22D4FF)).dhbs_2(Float.intBitsToFloat(-1848370711 + -1389631977)).rkh_3(Float.intBitsToFloat(2120758369 - 1092315028)).ssd_5(Float.intBitsToFloat(-1064984690 + 2101816639));
    private final badh_2 sdz = new badh_2(this, "Debug Box Tr".concat("ansition")).bts(true);
    private final tay khhkh_2 = new tay((hy)this, "Transition Re".concat("sponsiveness"), this::bqdh).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(1304543065 - 206683993)).rkh_3(Float.intBitsToFloat(-2005315187 - 1232687501)).ssd_5(Float.intBitsToFloat(Integer.reverse(-60360965) ^ 0x9FAF663F));
    private final bdh_3 bwa_2 = new bdh_3(this, "Grow Key");
    private final bdh_3 dhhy = new bdh_3(this, "Shrink Key");
    private final bdh_3 rah = new bdh_3(this, "Restore Key");
    private final badh_2 thdh_2 = new badh_2(this, "Reset While Using").bts(true);
    private final badh_2 zath_2 = new badh_2(this, "Server Bo".concat("x Correction")).bts(true);
    private final khd shthz_2 = new khd((hy)this, "Correction".concat(" Profile"), this::zkn_2);
    private final fy srb = new fy(this.shthz_2, "Smooth Pull").rhh_3();
    private final fy khmd_2 = new fy(this.shthz_2, "Humani".concat("zed Pull"));
    private final tay khhk_2 = new tay((hy)this, "Correctio".concat("n Scan Range"), this::srk_2).shth_7(Float.intBitsToFloat(Integer.reverse(-28381976) ^ 0x5777727F)).dhbs_2(Float.intBitsToFloat(1128034312 + -35418120)).rkh_3(Float.intBitsToFloat(-1363682267 + -1874320421)).ssd_5(Float.intBitsToFloat(Integer.reverse(278580697) ^ 0xDB135908));
    private final tay daj = new tay((hy)this, "Correction Pull", this::sdsh_2).shth_7(Float.intBitsToFloat(1166956864 - 130124915)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(0x2E5A81ED ^ 0x13164D20)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xA0BE224E ^ 0x938D65A5, 19)));
    private final tay thsz_2 = new tay((hy)this, "Correction".concat(" Tracking"), this::dhw_2).shth_7(Float.intBitsToFloat(1413788433 - 376956484)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(-2135971681 - 1130552274)).ssd_5(Float.intBitsToFloat(1309763633 - 246926999));
    private final badh_2 thzd_4 = new badh_2(this, "Server R".concat("each Guard")).bts(true);
    private final tay zbn = new tay((hy)this, "Accepted ".concat("Server Reach"), this::jdhn).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1234179586) ^ 0x3FD7F66D)).rkh_3(Float.intBitsToFloat(991689676 + 17292094)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xF8A71EA4 ^ 0xF87E873D, 30)));
    private final badh_2 zdhd_2 = new badh_2((hy)this, "Animate Rejected Hit", this::zh_4).bts(true);
    private class_1309 zghsh;
    private long shht;
    private boolean shk;
    private float thzs_4;
    private long htt_3;
    private boolean khay_2;
    private class_1309 ssz;
    private long da_4;
    private float zthm;
    private float bbr;
    private boolean jyn;
    private boolean bsr_2;
    private boolean zrd_2;
    private boolean zzgh;
    private final bql<btt> dal_2 = this::tnl_2;
    private final bql<bjd_2> shhz_2 = this::bqth;
    private static final int jfs = 1174262794;
    private static final int khsd_3 = -1455799186;
    private static final int jhth = -1544942330;
    private static final int sk_2 = 435821400;
    private static final int wqdxd04u = -630143530;
    private static final int zvkb0y2qr2cm = -397922236;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int o7cd526usdvwzt;

    public bsz_3() {
        rbm = this;
    }

    public static bsz_3 skhy() {
        block0: {
            int n = bkm.sdhs_4(908969768);
            int n2 = n ^ 0x5BA88B58;
            if ((n2 ^ n) == 1537772376) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x6D854C70 ^ n, 16) + 1199694027) * 1837452401;
        }
        return rbm;
    }

    @Override
    public void nt() {
        int n = -903232945;
        n = Integer.rotateLeft(n * -1287775947, 10) ^ 0xA024FC8;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 25);
        int n2 = n ^ 0x8F3B68D9;
        if ((n2 ^ n) != -1891931943) {
            int cfr_ignored_0 = (0x4512AA96 ^ n) - -329355402;
        }
        this.rab();
        this.zlh_2();
        this.stw_3();
        bsz_3.dhsz(this);
        bsz_3.bbgh(this);
    }

    @Override
    public void nc() {
        try {
            int n = -1585514386;
            n = Integer.rotateLeft(n * 155722349, 22) ^ 0xBD9BAB81;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 8);
            int n2 = n ^ 0x7E8B503E;
            if ((n2 ^ n) != 2123059262) {
                int cfr_ignored_0 = (0xDFF5A850 ^ n) - -988122040;
            }
            if ((0x3D7 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bsz_3.khds_4()) {
            throw null;
        }
        bsz_3.jrk(this);
        bsz_3.hyz_2(this);
        this.stw_3();
        this.zshgh();
        this.shk = false;
    }

    public float shjn(class_1297 class_12972) {
        class_1309 class_13092;
        int n = bkm.sdhs_4(444586540);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 15);
        int n2 = n ^ 0x4AEF2F93;
        if ((n2 ^ n) != 1257189267) {
            int cfr_ignored_0 = (Integer.rotateRight(0x5090F5BF ^ n, 13) - -974429860) * 1351677375;
        }
        if (!bsz_3.khwa_2(this) || this.shk || !(class_12972 instanceof class_1309) || !this.jths(class_13092 = (class_1309)class_12972)) {
            return 0.0f;
        }
        return this.khdsh();
    }

    public class_238 dhds_3(class_1297 class_12972, class_238 class_2383, float f) {
        class_1309 class_13092;
        try {
            int n = -485290507;
            n = Integer.rotateLeft(n * 1437411251, 3) ^ 0xBF774DF4;
            n = System.identityHashCode(this) ^ n;
            class_1297 class_12973 = class_12972;
            n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
            int n2 = n ^ 0x1EF5E6DD;
            if ((n2 ^ n) != 519431901) {
                int cfr_ignored_0 = (0xFDE6EB28 ^ n) + 819901973;
            }
            if ((0x1A6 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (class_2383 == null || !this.rgha_2() || this.khjt_2.shzl() || !(class_12972 instanceof class_1309) || !bsz_3.ttd_5(this, class_13092 = (class_1309)class_12972)) {
            return class_2383;
        }
        if (!this.khay_2) {
            this.khay_2 = true;
            this.thzs_4 = 0.0f;
            this.htt_3 = System.nanoTime();
        }
        float f2 = this.shk ? 0.0f : bsz_3.hdha(this);
        this.zyj_2(f2);
        if (this.thzs_4 <= Float.intBitsToFloat(Integer.reverse(-505988755) ^ 0x8E4D5C90)) {
            return class_2383;
        }
        return bsz_3.thml(class_2383, this.thzs_4);
    }

    public void zdq_4(class_1297 class_12972) {
        class_1309 class_13092;
        try {
            int n = 743682223;
            n = Integer.rotateLeft(n * -1578229853, 13) ^ 0xBD04A60A;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
            class_1297 class_12973 = class_12972;
            n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
            int n2 = n ^ 0xE821F124;
            if ((n2 ^ n) != -400428764) {
                int cfr_ignored_0 = (0xC472418B ^ n) - -481863808;
            }
            if ((0x12B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bsz_3.ghah_2()) {
            throw null;
        }
        if (!(bsz_3.tdh_8(this) && this.zghj.shzl() && class_12972 instanceof class_1309 && this.dsdh(class_13092 = (class_1309)class_12972))) {
            return;
        }
        this.zghsh = class_13092;
        this.shht = System.currentTimeMillis() + (long)Math.round(bsz_3.dna(this.jaq_2) * Float.intBitsToFloat(Integer.rotateLeft(0xD3449F50 ^ 0x27449FD8, 23)));
    }

    public boolean jzb_2(class_1297 class_12972) {
        class_1309 class_13092;
        int n = bkm.sdhs_4(977982873);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 22);
        int n2 = n ^ 0x890883D6;
        if ((n2 ^ n) != -1995930666) {
            int cfr_ignored_0 = Integer.rotateRight(0xB342564F ^ n, 9) - -1184492852;
        }
        if (!this.rgha_2() || bsz_3.mc.field_1724 == null || !(class_12972 instanceof class_1309) || this.shjn((class_1297)(class_13092 = (class_1309)class_12972)) <= 0.0f) {
            return false;
        }
        if (this.thzd_4.shzl() && bsz_3.shbl(bsz_3.shd_9(bsz_3.mc.field_1724), bsz_3.khaw_2(class_13092)) > (double)bsz_3.jta_2(this.zbn.thw_5())) {
            return true;
        }
        if (!this.zath_2.shzl() || !bsz_3.ryd(this, class_13092)) {
            return false;
        }
        return this.ssz != class_13092 || !this.jyn || !this.ghsy_2(class_13092.method_5829(), bsz_3.mc.field_1724.method_33571(), bsz_3.dlth_2(this.zthm, this.bbr), this.khhk_2.thw_5());
    }

    /*
     * Unable to fully structure code
     */
    public void sjf() {
        var3_1 = 0;
        var1_2 = 1423857743;
        var1_2 = Integer.rotateLeft(var1_2 * 585530263, 18) ^ -2069821990;
        var1_2 = System.identityHashCode(this) ^ var1_2;
        var2_3 = 1184795566 * -2096158131 + 454962349 ^ var1_2;
        while (true) {
            block41: {
                block39: {
                    block45: {
                        block47: {
                            block43: {
                                block46: {
                                    block42: {
                                        block44: {
                                            block40: {
                                                block50: {
                                                    block48: {
                                                        block51: {
                                                            block49: {
                                                                var3_1 = ((var2_3 ^ var1_2) - 454962349) * -1412292987;
                                                                switch (var3_1 & 7) {
                                                                    case 0: {
                                                                        if (var3_1 == 1057548120) break block39;
                                                                        if (var3_1 == -1138065984) break block40;
                                                                        if (var3_1 != -1002397720) {
                                                                            ** break;
                                                                        }
                                                                        break block41;
                                                                    }
                                                                    case 1: {
                                                                        if (var3_1 != 1644575049) {
                                                                            ** break;
                                                                        }
                                                                        break block42;
                                                                    }
                                                                    case 2: {
                                                                        if (var3_1 == 198600378) break;
                                                                        ** break;
                                                                    }
                                                                    case 3: {
                                                                        if (var3_1 == 293233971) break block43;
                                                                        if (var3_1 != -724824869) {
                                                                            Integer.rotateRight(-517709141 ^ var1_2, 15) + 1204130288;
                                                                            ** break;
                                                                        }
                                                                        break block44;
                                                                    }
                                                                    case 4: {
                                                                        if (var3_1 == 1216312452) break block45;
                                                                        if (var3_1 == 1731898972) break block46;
                                                                        Integer.rotateLeft(-736883995 ^ var1_2, 13) - -1295322890;
                                                                        (int)(1632173163256539983L ^ (long)var1_2 ^ -5422189802894557028L);
                                                                        if (var3_1 != -786332892) {
                                                                            ** break;
                                                                        }
                                                                        break block47;
                                                                    }
                                                                    case 5: {
                                                                        if (var3_1 != 1458709917) {
                                                                            ** break;
                                                                        }
                                                                        break block48;
                                                                    }
                                                                    case 6: {
                                                                        if (var3_1 == 1184795566) break block49;
                                                                        if (var3_1 != -9339690) {
                                                                            ** break;
                                                                        }
                                                                        break block50;
                                                                    }
                                                                    case 7: {
                                                                        if (var3_1 != -1114355481) {
                                                                            ** break;
                                                                        }
                                                                        break block51;
                                                                    }
                                                                }
                                                                Integer.rotateLeft(-1989296475 ^ var1_2, 4) - -1465404106;
                                                                (int)(5467106718340410191L ^ (long)var1_2 ^ -2575914838396421521L);
                                                                return;
                                                            }
                                                            Integer.rotateLeft(-1493823219 ^ var1_2, 7) - 1009364942;
                                                            (int)(7225109915756718927L ^ (long)var1_2 ^ -9002551506654108328L);
                                                            if (this.zdhd_2.shzl()) {
                                                                var2_3 = Integer.reverse(Integer.reverse(1458709917 * -2096158131 + 454962349 ^ var1_2));
                                                                (Integer.rotateLeft(-969300748 ^ var1_2, 11) - 89692359) * -969300747;
                                                                var3_1 -= 4;
                                                                continue;
                                                            }
                                                            var2_3 = 198600378 * -2096158131 + 454962349 ^ var1_2 ^ -768879363 ^ -768879363;
                                                            (Integer.rotateLeft(-53604391 ^ var1_2, 18) + -1588491646) * -53604391;
                                                            (int)(4502651728756534095L ^ (long)var1_2 ^ -4703865662328942296L);
                                                            var3_1 += 4;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(-209525498 ^ var1_2, 17) - -2127078667;
                                                        bsz_3.zns_3(bsz_3.mc.field_1724, class_1268.field_5808);
                                                        bsz_3.tssh(bsz_3.mc.field_1724);
                                                        try {
                                                            if ((-6215152227678344309L ^ (long)var1_2 | 1L) == 0L) {
                                                                throw new IllegalArgumentException();
                                                            }
                                                            var2_3 = Integer.reverse(Integer.reverse(198600378 * -2096158131 + 454962349 ^ var1_2));
                                                        }
                                                        catch (IllegalArgumentException v0) {
                                                            var2_3 = 198600378 * -2096158131 + 454962349 ^ var1_2 ^ -54082509 ^ -54082509;
                                                        }
                                                        var3_1 -= 3;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(-890026311 ^ var1_2, 12) + -1747767390) * -890026311;
                                                    (int)(595012280091208527L ^ (long)var1_2 ^ 3204455283333643602L);
                                                    if (bsz_3.mc.field_1724 == null) {
                                                        var2_3 = (int)((long)(259646736 * -2096158131 + 454962349 ^ var1_2) ^ -7462906626242509257L ^ -7462906626242509257L);
                                                        (Integer.rotateLeft(-73469347 ^ var1_2, 18) - 2090662014) * -73469347;
                                                        (int)(4119769327192042319L ^ (long)var1_2 ^ 5021657732977647497L);
                                                        var2_3 = Integer.reverse(Integer.reverse(198600378 * -2096158131 + 454962349 ^ var1_2));
                                                        var3_1 += 3;
                                                        continue;
                                                    }
                                                    try {
                                                        var3_1 -= 5;
                                                        if ((-4566687418177484193L ^ (long)var1_2 | 1L) == 0L) {
                                                            throw new ArithmeticException();
                                                        }
                                                        var2_3 = (int)((long)(-1114355481 * -2096158131 + 454962349 ^ var1_2) ^ -1462763071117994001L ^ -1462763071117994001L);
                                                    }
                                                    catch (ArithmeticException v1) {
                                                        var2_3 = (-1114355481 * -2096158131 + 454962349 ^ var1_2) + 1736420475 - 1736420475;
                                                    }
                                                    var3_1 += 3;
                                                    continue;
                                                }
                                                Integer.rotateLeft(1092611404 ^ var1_2, 11) - -415540369;
                                                var2_3 = 1304036027 * -2096158131 + 454962349 ^ var1_2 ^ -1057926638 ^ -1057926638;
                                                (Integer.rotateLeft(-263073579 ^ var1_2, 17) - 507898118) * -263073579;
                                                (int)(3666914057175493455L ^ (long)var1_2 ^ 45180144733243415L);
                                                var2_3 = 1184795566 * -2096158131 + 454962349 ^ var1_2 ^ 1213430202 ^ 1213430202;
                                                Integer.rotateRight(779896290 ^ var1_2, 8) + -1519774311;
                                                var3_1 -= 3;
                                                continue;
                                            }
                                            (Integer.rotateRight(-1932759817 ^ var1_2, 4) - 287232292) * -1932759817;
                                            try {
                                                var3_1 += 2;
                                                if ((-3977138350881787919L ^ (long)var1_2 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                var2_3 = 1184795566 * -2096158131 + 454962349 ^ var1_2 ^ 1854844345 ^ 1854844345;
                                            }
                                            catch (NoSuchElementException v2) {
                                                var2_3 = Integer.reverse(Integer.reverse(1184795566 * -2096158131 + 454962349 ^ var1_2));
                                            }
                                            ++var3_1;
                                            continue;
                                        }
                                        (Integer.rotateLeft(-79421831 ^ var1_2, 18) + 1906135010) * -79421831;
                                        (int)(4176719511205243727L ^ (long)var1_2 ^ -7063751867071078852L);
                                        var2_3 = (int)((long)(1215302901 * -2096158131 + 454962349 ^ var1_2) ^ -2927079921648905555L ^ -2927079921648905555L);
                                        (Integer.rotateRight(1447145658 ^ var1_2, 13) + 1985086913) * 1447145659;
                                        try {
                                            if ((4804127777291724051L ^ (long)var1_2 | 1L) == 0L) {
                                                throw new IllegalStateException();
                                            }
                                            var2_3 = (int)((long)(1184795566 * -2096158131 + 454962349 ^ var1_2) ^ 138528825385364005L ^ 138528825385364005L);
                                        }
                                        catch (IllegalStateException v3) {
                                            var2_3 = 1184795566 * -2096158131 + 454962349 ^ var1_2 ^ 835071474 ^ 835071474;
                                        }
                                        var3_1 -= 3;
                                        continue;
                                    }
                                    Integer.rotateLeft(10332833 ^ var1_2, 3) + 393562298;
                                    (int)(-4454336437716456625L ^ (long)var1_2 ^ -844280781672535665L);
                                    var2_3 = (int)((long)(-323040824 * -2096158131 + 454962349 ^ var1_2) ^ 5105622333188271690L ^ 5105622333188271690L);
                                    (Integer.rotateLeft(-1422748483 ^ var1_2, 8) - -1082285538) * -1422748483;
                                    (int)(7602140493099887439L ^ (long)var1_2 ^ -8615241938700239151L);
                                    var2_3 = (1184795566 * -2096158131 + 454962349 ^ var1_2) + 1161404923 - 1161404923;
                                    var3_1 -= 2;
                                    continue;
                                }
                                (Integer.rotateRight(-1425552961 ^ var1_2, 8) - -1169224356) * -1425552961;
                                var2_3 = Integer.reverse(Integer.reverse(-1867942596 * -2096158131 + 454962349 ^ var1_2));
                                (Integer.rotateLeft(-383182576 ^ var1_2, 16) + 1079486507) * -383182575;
                                (int)(7553768433543603690L ^ (long)var1_2 ^ 4452940085208513657L);
                                var2_3 = (int)((long)(1184795566 * -2096158131 + 454962349 ^ var1_2) ^ -8774973276076801332L ^ -8774973276076801332L);
                                var3_1 += 4;
                                continue;
                            }
                            (Integer.rotateLeft(-2106114316 ^ var1_2, 3) - -791789881) * -2106114315;
                            try {
                                var3_1 -= 4;
                                var2_3 = (int)((long)(1184795566 * -2096158131 + 454962349 ^ var1_2) ^ -5742688892595572299L ^ -5742688892595572299L);
                            }
                            catch (ArithmeticException v4) {
                                var2_3 = 1184795566 * -2096158131 + 454962349 ^ var1_2 ^ -1059868328 ^ -1059868328;
                            }
                            var3_1 -= 5;
                            continue;
                        }
                        (Integer.rotateLeft(929048432 ^ var1_2, 9) + -1191025205) * 929048433;
                        var2_3 = 369232298 * -2096158131 + 454962349 ^ var1_2 ^ 1146085352 ^ 1146085352;
                        (Integer.rotateRight(-728860078 ^ var1_2, 13) + -1046581463) * -728860077;
                        var2_3 = 1184795566 * -2096158131 + 454962349 ^ var1_2 ^ 2050788975 ^ 2050788975;
                        continue;
                    }
                    Integer.rotateRight(1942776294 ^ var1_2, 17) - 169767445;
                    var2_3 = (-1692273848 * -2096158131 + 454962349 ^ var1_2) + -2137666662 - -2137666662;
                    Integer.rotateLeft(1002445448 ^ var1_2, 10) + 1084282291;
                    var2_3 = (1184795566 * -2096158131 + 454962349 ^ var1_2) + -990895050 - -990895050;
                    var3_1 += 4;
                    continue;
                }
                Integer.rotateRight(-698690329 ^ var1_2, 13) - -111319244;
                var2_3 = (int)((long)(1203310029 * -2096158131 + 454962349 ^ var1_2) ^ 3165260401422567585L ^ 3165260401422567585L);
                Integer.rotateLeft(1261920357 ^ var1_2, 12) - 538069878;
                (int)(-8537190640590197937L ^ (long)var1_2 ^ 7043773965666926298L);
                try {
                    var3_1 += 5;
                    var2_3 = 1184795566 * -2096158131 + 454962349 ^ var1_2;
                }
                catch (IllegalArgumentException v5) {
                    var2_3 = 1184795566 * -2096158131 + 454962349 ^ var1_2;
                }
                var3_1 -= 5;
                continue;
            }
            (Integer.rotateLeft(-693660496 ^ var1_2, 13) + 44605579) * -693660495;
            try {
                var3_1 -= 3;
                if ((1112054116676599469L ^ (long)var1_2 | 1L) == 0L) {
                    throw new UnsupportedOperationException();
                }
                var2_3 = 1184795566 * -2096158131 + 454962349 ^ var1_2 ^ -1987540763 ^ -1987540763;
            }
            catch (UnsupportedOperationException v6) {
                var2_3 = Integer.reverse(Integer.reverse(1184795566 * -2096158131 + 454962349 ^ var1_2));
            }
            var3_1 += 5;
            continue;
lbl237:
            // 9 sources

            Integer.rotateLeft(-132772499 ^ var1_2, 18) - 252264302;
            (int)(4225681915041344335L ^ (long)var1_2 ^ -4913283045001668456L);
            var2_3 = 1184795566 * -2096158131 + 454962349 ^ var1_2;
        }
    }

    public boolean jdhw() {
        class_1309 class_13092;
        class_1297 class_12972;
        int n = -1176253177;
        n = Integer.rotateLeft(n * 1021942435, 7) ^ 0x2325A168;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x50ACD31E;
        if ((n2 ^ n) != 1353503518) {
            int cfr_ignored_0 = (0xE94F1E19 ^ n) + -975063192;
        }
        return bsz_3.ttt_2(this) && this.sam_3.shzl() && (class_12972 = bsz_3.mc.field_1692) instanceof class_1309 && this.jths(class_13092 = (class_1309)class_12972) && this.dss_2(class_13092);
    }

    private void jzh_3() {
        if (bsz_3.mc.field_1724 == null || bsz_3.mc.field_1690 == null) {
            this.shk = false;
            return;
        }
        boolean bl = this.shk = this.thdh_2.shzl() && (bsz_3.mc.field_1724.method_6115() || bsz_3.mc.field_1690.field_1904 != null && bsz_3.mc.field_1690.field_1904.method_1434());
        if (this.shk) {
            this.zlh_2();
        }
    }

    private void khzn() {
        boolean bl = mc.method_1561().method_3958();
        if (bl && !this.khay_2) {
            this.thzs_4 = 0.0f;
            this.htt_3 = System.nanoTime();
        } else if (!bl) {
            this.thzs_4 = 0.0f;
            this.htt_3 = 0L;
        }
        this.khay_2 = bl;
    }

    private void zyj_2(float f) {
        if (!this.sdz.shzl()) {
            this.thzs_4 = f;
            this.htt_3 = System.nanoTime();
            return;
        }
        long l = System.nanoTime();
        if (this.htt_3 == 0L) {
            this.htt_3 = l;
            this.thzs_4 = 0.0f;
            return;
        }
        double d = Math.min(0.1, (double)(l - this.htt_3) / 1.0E9);
        if (d < 0.001) {
            return;
        }
        this.htt_3 = l;
        float f2 = 1.0f - (float)Math.exp((double)(-this.khhkh_2.thw_5()) * d);
        this.thzs_4 += (f - this.thzs_4) * f2;
        if (Math.abs(f - this.thzs_4) < 1.0E-4f) {
            this.thzs_4 = f;
        }
    }

    private void azk_2() {
        float f;
        class_243 class_2432;
        float[] fArray;
        float f2;
        double d;
        if (!this.zath_2.shzl() || this.shk || bsz_3.mc.field_1724 == null || bsz_3.mc.field_1687 == null) {
            this.zlh_2();
            return;
        }
        if (btj_2.dhsw_2 != null) {
            this.zlh_2();
            return;
        }
        class_1309 class_13092 = this.zak();
        if (class_13092 == null) {
            this.zlh_2();
            return;
        }
        long l = System.currentTimeMillis();
        if (class_13092 != this.ssz) {
            this.ssz = class_13092;
            this.da_4 = l;
            this.zthm = bsz_3.mc.field_1724.method_36454();
            this.bbr = bsz_3.mc.field_1724.method_36455();
            this.jyn = true;
        }
        float f3 = (d = Math.hypot(f2 = class_3532.method_15393((float)((fArray = this.rzd_3(class_2432 = this.tww_2(class_13092)))[0] - this.zthm)), f = fArray[1] - this.bbr)) > 2.0 ? this.daj.thw_5() : this.thsz_2.thw_5();
        double d2 = class_3532.method_15363((float)f3, (float)0.05f, (float)1.0f);
        if (this.khmd_2.shghkh()) {
            double d3 = class_3532.method_15350((double)((double)(l - this.da_4) / 200.0), (double)0.0, (double)1.0);
            double d4 = d3 * d3 * (3.0 - 2.0 * d3);
            double d5 = class_3532.method_15350((double)(d / 15.0), (double)0.15, (double)1.0);
            d2 = class_3532.method_15350((double)((double)f3 * d4 * d5 * ThreadLocalRandom.current().nextDouble(0.9, 1.1)), (double)0.01, (double)1.0);
        }
        float f4 = Math.max(baf.tssh_3(), 1.0E-4f);
        float f5 = bsz_3.tjw((float)((double)f2 * d2), f4);
        float f6 = bsz_3.tjw((float)((double)f * d2), f4);
        if (f5 == 0.0f && Math.abs(f2) > f4) {
            f5 = Math.copySign(f4, f2);
        }
        if (f6 == 0.0f && Math.abs(f) > f4) {
            f6 = Math.copySign(f4, f);
        }
        this.zthm += Math.copySign(Math.min(Math.abs(f5), Math.abs(f2)), f2);
        this.bbr = class_3532.method_15363((float)(this.bbr + Math.copySign(Math.min(Math.abs(f6), Math.abs(f)), f)), (float)-90.0f, (float)90.0f);
        btj_2.sdd_3(this.zthm, this.bbr);
    }

    private class_1309 zak() {
        int n = 2027092650;
        n = Integer.rotateLeft(n * 910370777, 15) ^ 0xD7764E56;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xB13FA1D5;
        if ((n2 ^ n) != -1321229867) {
            int cfr_ignored_0 = (0xC9ED5B7F ^ n) - 426201923;
        }
        class_243 class_2432 = bsz_3.mc.field_1724.method_33571();
        class_243 class_2433 = bsz_3.mc.field_1724.method_5828(1.0f);
        double d = this.khhk_2.thw_5();
        class_1309 class_13092 = null;
        double d2 = d * d;
        for (class_1297 class_12972 : bsz_3.mc.field_1687.method_18112()) {
            double d3;
            class_238 class_2383;
            float f;
            class_1309 class_13093;
            if (!(class_12972 instanceof class_1309) || !bsz_3.sda(this, class_13093 = (class_1309)class_12972) || (f = bsz_3.shwy(this, (class_1297)class_13093)) <= 0.0f || bsz_3.tjz_4(this, class_2383 = bsz_3.bhm(class_13093), class_2432, class_2433, d) || !this.ghsy_2(bsz_3.shbt(class_2383, f), class_2432, class_2433, d) || !((d3 = bsz_3.mc.field_1724.method_5858((class_1297)class_13093)) < d2)) continue;
            d2 = d3;
            class_13092 = class_13093;
        }
        return class_13092;
    }

    private class_243 tww_2(class_1309 class_13092) {
        int n = bkm.sdhs_4(-15011564);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xA4A1A0F6;
        if ((n2 ^ n) != -1532911370) {
            int cfr_ignored_0 = Integer.rotateRight(0x5BBB51E2 ^ n, 14) + 537692569;
        }
        class_238 class_2383 = bsz_3.tfs_2(class_13092);
        float f = this.shjn((class_1297)class_13092);
        class_243 class_2432 = bsz_3.rsh_2(bsz_3.mc.field_1724);
        class_243 class_2433 = bsz_3.mc.field_1724.method_5828(1.0f);
        class_243 class_2434 = class_2432.method_1019(bsz_3.ghzn(class_2433, bsz_3.twr(this.khhk_2)));
        class_243 class_2435 = bsz_3.thja(bsz_3.khjt(class_2383, f), class_2432, class_2434).orElse(class_2383.method_1005());
        double d = bsz_3.rdkh_2(Double.longBitsToDouble(0xED7BDF5043118415L ^ 0xD2B246C9DA881D8FL), Math.min(class_2383.method_17939(), class_2383.method_17941()) * bsz_3.aghh(0x6B54199EEF75F348L ^ 0x5484199EEF75F348L));
        class_243 class_2436 = class_2435.method_1019(class_13092.method_18798().method_1021(Double.longBitsToDouble(0x2906E42632D1D73DL ^ 0x16BF7DBFAB484EA7L)));
        return new class_243(class_3532.method_15350((double)class_2436.field_1352, (double)(class_2383.field_1323 + d), (double)(class_2383.field_1320 - d)), class_3532.method_15350((double)class_2436.field_1351, (double)(class_2383.field_1322 + Double.longBitsToDouble(0x6842C1434AB37C9EL ^ 0x57EB58DAD32AE504L)), (double)(class_2383.field_1325 - Double.longBitsToDouble(0x9AD86684031BF78DL ^ 0xA571FF1D9A826E17L))), class_3532.method_15350((double)class_2436.field_1350, (double)(class_2383.field_1321 + d), (double)(class_2383.field_1324 - d)));
    }

    private float[] rzd_3(class_243 class_2432) {
        class_243 class_2433 = bsz_3.mc.field_1724.method_33571();
        double d = class_2432.field_1352 - class_2433.field_1352;
        double d2 = class_2432.field_1351 - class_2433.field_1351;
        double d3 = class_2432.field_1350 - class_2433.field_1350;
        double d4 = Math.sqrt(d * d + d3 * d3);
        return new float[]{(float)Math.toDegrees(Math.atan2(d3, d)) - 90.0f, (float)(-Math.toDegrees(Math.atan2(d2, d4)))};
    }

    private boolean dss_2(class_1309 class_13092) {
        try {
            int n = -969743746;
            n = Integer.rotateLeft(n * -970949331, 23) ^ 0xB0A6733C;
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0x6A31BFE6;
            if ((n2 ^ n) != 1781645286) {
                int cfr_ignored_0 = (0xAC035D98 ^ n) - 1540980339;
            }
            if ((0x128 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        float f = this.shjn((class_1297)class_13092);
        if (f <= 0.0f || bsz_3.mc.field_1724 == null) {
            return false;
        }
        class_243 class_2432 = bsz_3.mc.field_1724.method_33571();
        class_243 class_2433 = bsz_3.mc.field_1724.method_5828(1.0f);
        double d = this.khhk_2.thw_5();
        class_238 class_2383 = class_13092.method_5829();
        return !this.ghsy_2(class_2383, class_2432, class_2433, d) && this.ghsy_2(bsz_3.thml(class_2383, f), class_2432, class_2433, d);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean jths(class_1309 class_13092) {
        int n = -633941725;
        n = Integer.rotateLeft(n * 1243306027, 11) ^ 0xDA185977;
        n = System.identityHashCode(this) ^ n;
        class_1309 class_13093 = class_13092;
        n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
        int n2 = n ^ 0x3A4C3C43;
        if ((n2 ^ n) != 978074691) {
            int cfr_ignored_0 = (0xE07AED60 ^ n) + -670959252;
        }
        if (!this.dsdh(class_13092)) return false;
        if (this.khms_2.shzl() && !this.dghn_2()) {
            return false;
        }
        if (this.zghj.shzl() && class_13092 != this.zghsh) {
            return false;
        }
        if (!(class_13092 instanceof class_1657)) return true;
        class_1657 class_16572 = (class_1657)class_13092;
        if (!this.szj.shzl()) return true;
        if (!this.jydh(class_16572)) return false;
        return true;
    }

    private boolean dsdh(class_1309 class_13092) {
        class_1657 class_16572;
        int n = bkm.sdhs_4(665618903);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 22);
        class_1309 class_13093 = class_13092;
        n = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 12);
        int n2 = n ^ 0x185CD091;
        if ((n2 ^ n) != 408735889) {
            int cfr_ignored_0 = Integer.rotateRight(0x3FF05946 ^ n, 10) - -1032294731;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        if (bsz_3.mc.field_1724 == null || class_13092 == bsz_3.mc.field_1724 || !class_13092.method_5805() || class_13092.method_31481()) {
            return false;
        }
        if (class_13092 instanceof class_1657 && ((class_16572 = (class_1657)class_13092).method_7325() || blh_2.dhwj(class_16572) || Moondlc.getInstance().getFriendManager().adhj(class_16572.method_7334().getName()))) {
            return false;
        }
        if (this.bddh.shghkh()) {
            return true;
        }
        if (this.dhht_2.shghkh()) {
            return class_13092 instanceof class_1657;
        }
        return this.dhqr.shghkh() && class_13092 instanceof class_1308;
    }

    private boolean dghn_2() {
        int n = -519811050;
        n = Integer.rotateLeft(n * -554316713, 19) ^ 0xD8360E58;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xED5648CE;
        if ((n2 ^ n) != -313112370) {
            int cfr_ignored_0 = (0xC5218D8 ^ n) + -308561176;
        }
        return this.dbs(bsz_3.mc.field_1724.method_6047()) || this.dbs(bsz_3.mc.field_1724.method_6079());
    }

    private boolean dbs(class_1799 class_17992) {
        int n = 546871443;
        n = Integer.rotateLeft(n * 658633445, 25) ^ 0x46711C9E;
        n = System.identityHashCode(this) ^ n;
        class_1799 class_17993 = class_17992;
        n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
        int n2 = n ^ 0xC3C11CBC;
        if ((n2 ^ n) != -1010754372) {
            int cfr_ignored_0 = (0xE359842F ^ n) + -2113421442;
        }
        return !class_17992.method_7960() && (class_17992.method_7909() instanceof class_1829 || class_17992.method_7909() instanceof class_1743 || class_17992.method_7909() instanceof class_1835 || class_17992.method_7909() instanceof class_9362);
    }

    private boolean jydh(class_1657 class_16572) {
        int n = 0;
        boolean bl = false;
        int n2 = 0;
        int n3 = 847424759;
        n3 = Integer.rotateLeft(n3 * 1120043251, 12) ^ 0xED29D5BA;
        n3 = System.identityHashCode(this) ^ n3;
        class_1657 class_16573 = class_16572;
        n3 = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n3;
        int n4 = (int)((long)Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19) ^ 0x4D059A7441178639L ^ 0x4D059A7441178639L);
        while (true) {
            block39: {
                block54: {
                    block52: {
                        block53: {
                            block46: {
                                block55: {
                                    block41: {
                                        block42: {
                                            block57: {
                                                block62: {
                                                    block60: {
                                                        block59: {
                                                            block40: {
                                                                block38: {
                                                                    block58: {
                                                                        block48: {
                                                                            block61: {
                                                                                block44: {
                                                                                    block47: {
                                                                                        block51: {
                                                                                            block45: {
                                                                                                block37: {
                                                                                                    block56: {
                                                                                                        block49: {
                                                                                                            block50: {
                                                                                                                block34: {
                                                                                                                    block43: {
                                                                                                                        block35: {
                                                                                                                            block36: {
                                                                                                                                if ((n2 = Integer.rotateRight(n4, 19) ^ n3) > 369437697) break block34;
                                                                                                                                if (n2 > -659652768) break block35;
                                                                                                                                if (n2 > -1704416348) break block36;
                                                                                                                                if (n2 == -2048759949) break block37;
                                                                                                                                if (n2 == -1704416348) break block38;
                                                                                                                                break block39;
                                                                                                                            }
                                                                                                                            if (n2 == -884416609) break block40;
                                                                                                                            if (n2 == -707598466) break block41;
                                                                                                                            if (n2 == -659652768) break block42;
                                                                                                                            break block39;
                                                                                                                        }
                                                                                                                        if (n2 > -193557534) break block43;
                                                                                                                        if (n2 == -471274939) break block44;
                                                                                                                        if (n2 == -193557534) break block45;
                                                                                                                        break block39;
                                                                                                                    }
                                                                                                                    if (n2 == -39967094) break block46;
                                                                                                                    if (n2 == 100484831) break block47;
                                                                                                                    if (n2 == 369437697) break block48;
                                                                                                                    break block39;
                                                                                                                }
                                                                                                                if (n2 > 1201293426) break block49;
                                                                                                                if (n2 > 804791755) break block50;
                                                                                                                if (n2 == 375139287) break block51;
                                                                                                                if (n2 == 804791755) break block52;
                                                                                                                int cfr_ignored_0 = (Integer.rotateLeft(0xF2A7B0FC ^ n3, 17) - 1722551743) * -223891203;
                                                                                                                break block39;
                                                                                                            }
                                                                                                            if (n2 == 855533527) break block53;
                                                                                                            if (n2 == 891039494) break block54;
                                                                                                            int cfr_ignored_1 = Integer.rotateRight(0x49F21547 ^ n3, 12) - -122801452;
                                                                                                            if (n2 == 1201293426) break block55;
                                                                                                            break block39;
                                                                                                        }
                                                                                                        if (n2 > 1483063332) break block56;
                                                                                                        if (n2 == 1320743561) break block57;
                                                                                                        if (n2 == 1449840714) break block58;
                                                                                                        if (n2 == 1483063332) break block59;
                                                                                                        break block39;
                                                                                                    }
                                                                                                    if (n2 == 1522165088) break block60;
                                                                                                    if (n2 == 1918057466) break block61;
                                                                                                    int cfr_ignored_2 = Integer.rotateLeft(0x8F7D1749 ^ n3, 4) + 1686335762;
                                                                                                    int cfr_ignored_3 = (int)(0x4DCFB97427D4EB4FL ^ (long)n3 ^ 0x8F98831A2DB9364EL);
                                                                                                    if (n2 == 1959706317) break block62;
                                                                                                    break block39;
                                                                                                }
                                                                                                int cfr_ignored_4 = (Integer.rotateLeft(0x2A608A30 ^ n3, 8) + 638475019) * 710969905;
                                                                                                bl = false;
                                                                                                n4 = Integer.rotateLeft(n3 ^ 0x351C2F06, 19) ^ 0xD15619E6 ^ 0xD15619E6;
                                                                                                ++n2;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_5 = Integer.rotateRight(0x4FA3AB46 ^ n3, 12) - -1456513867;
                                                                                            bl = true;
                                                                                            try {
                                                                                                if ((0xAEBE9FA48CCFAC3FL ^ (long)n3 | 1L) == 0L) {
                                                                                                    throw new NoSuchElementException();
                                                                                                }
                                                                                                n4 = (int)((long)Integer.rotateLeft(n3 ^ 0x351C2F06, 19) ^ 0xFBC640984A901EB7L ^ 0xFBC640984A901EB7L);
                                                                                            }
                                                                                            catch (NoSuchElementException noSuchElementException) {
                                                                                                n4 = Integer.rotateLeft(n3 ^ 0x351C2F06, 19);
                                                                                            }
                                                                                            n2 += 3;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_6 = Integer.rotateRight(0x7F0BEFAE ^ n3, 18) - 1724884301;
                                                                                        ++n;
                                                                                        int cfr_ignored_7 = (int)(0x593A65FB86EA4238L ^ (long)n3 ^ 0x3687C1677F571FA5L);
                                                                                        n4 = (int)((long)Integer.rotateLeft(n3 ^ 0x5FD46DF, 19) ^ 0xC02A51DBBA4DB774L ^ 0xC02A51DBBA4DB774L);
                                                                                        n2 += 2;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_8 = Integer.rotateRight(0x5838BD47 ^ n3, 14) - -1287877932;
                                                                                    if (n >= class_16572.method_31548().field_7548.size()) {
                                                                                        try {
                                                                                            ++n2;
                                                                                            if ((0x881C3475949C3601L ^ (long)n3 | 1L) == 0L) {
                                                                                                throw new NoSuchElementException();
                                                                                            }
                                                                                            n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x85E26773, 19)));
                                                                                        }
                                                                                        catch (NoSuchElementException noSuchElementException) {
                                                                                            n4 = Integer.rotateLeft(n3 ^ 0x85E26773, 19) + 909343530 - 909343530;
                                                                                        }
                                                                                        n2 -= 4;
                                                                                        continue;
                                                                                    }
                                                                                    n4 = Integer.rotateLeft(n3 ^ 0x16052C01, 19) + -1864888598 - -1864888598;
                                                                                    int cfr_ignored_9 = (Integer.rotateLeft(0xEF27D3D4 ^ n3, 16) - -97499673) * -282602539;
                                                                                    n2 -= 5;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_10 = Integer.rotateRight(0x26827566 ^ n3, 7) - -1372989803;
                                                                                n = 0;
                                                                                try {
                                                                                    if ((0x6FC380A73265B231L ^ (long)n3 | 1L) == 0L) {
                                                                                        throw new ArithmeticException();
                                                                                    }
                                                                                    n4 = Integer.rotateLeft(n3 ^ 0x5FD46DF, 19);
                                                                                }
                                                                                catch (ArithmeticException arithmeticException) {
                                                                                    n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x5FD46DF, 19)));
                                                                                }
                                                                                n2 -= 2;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_11 = (Integer.rotateRight(0x5AEDCBB7 ^ n3, 14) - 120146532) * 1525533623;
                                                                            if (!((class_1799)class_16572.method_31548().field_7548.get(n)).method_7960()) {
                                                                                n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x8FB919C3, 19)));
                                                                                int cfr_ignored_12 = (Integer.rotateRight(0x83ACBAD7 ^ n3, 3) - -163037372) * -2085831977;
                                                                                n4 = Integer.rotateLeft(n3 ^ 0xF4768BE2, 19);
                                                                                n2 += 2;
                                                                                continue;
                                                                            }
                                                                            try {
                                                                                n2 -= 3;
                                                                                n4 = Integer.rotateLeft(n3 ^ 0x165C2BD7, 19) + 213071185 - 213071185;
                                                                            }
                                                                            catch (NoSuchElementException noSuchElementException) {
                                                                                n4 = (int)((long)Integer.rotateLeft(n3 ^ 0x165C2BD7, 19) ^ 0x44D0DFA13118BEECL ^ 0x44D0DFA13118BEECL);
                                                                            }
                                                                            n2 += 4;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_13 = Integer.rotateLeft(0x6ECD7DA1 ^ n3, 16) + 1866454458;
                                                                        int cfr_ignored_14 = (int)(0xAC7FD39C27D4EB4FL ^ (long)n3 ^ 0x5A48831A2DB8F52EL);
                                                                        if (((class_1799)class_16572.method_31548().field_7548.get(n)).method_7960()) {
                                                                            try {
                                                                                n2 += 5;
                                                                                if ((0x5258FC1094C03143L ^ (long)n3 | 1L) == 0L) {
                                                                                    throw new UnsupportedOperationException();
                                                                                }
                                                                                n4 = (int)((long)Integer.rotateLeft(n3 ^ 0x165C2BD7, 19) ^ 0xD0F720229CB7BA6BL ^ 0xD0F720229CB7BA6BL);
                                                                            }
                                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                n4 = Integer.rotateLeft(n3 ^ 0x165C2BD7, 19) + 1150456012 - 1150456012;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        n4 = Integer.rotateLeft(n3 ^ 0xA0CDA7EF, 19);
                                                                        int cfr_ignored_15 = Integer.rotateLeft(0x7B37F565 ^ n3, 18) - -266054026;
                                                                        int cfr_ignored_16 = (int)(0xB9855B5827D4EB4FL ^ (long)n3 ^ 0x4BC0831A2DB8DEDBL);
                                                                        n4 = Integer.rotateLeft(n3 ^ 0xF4768BE2, 19);
                                                                        n2 -= 3;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_17 = Integer.rotateRight(0x3E32D58B ^ n3, 10) + -1937409264;
                                                                    try {
                                                                        if ((0xE2C6F80C47BAEFE1L ^ (long)n3 | 1L) == 0L) {
                                                                            throw new ArithmeticException();
                                                                        }
                                                                        n4 = Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19) + 2019417434 - 2019417434;
                                                                    }
                                                                    catch (ArithmeticException arithmeticException) {
                                                                        n4 = Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19) + -867324612 - -867324612;
                                                                    }
                                                                    continue;
                                                                }
                                                                int cfr_ignored_18 = Integer.rotateLeft(0xCBA33CC8 ^ n3, 12) + -1390281869;
                                                                try {
                                                                    n2 -= 4;
                                                                    if ((0x995FDA8C9BD1F193L ^ (long)n3 | 1L) == 0L) {
                                                                        throw new NoSuchElementException();
                                                                    }
                                                                    n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19)));
                                                                }
                                                                catch (NoSuchElementException noSuchElementException) {
                                                                    n4 = (int)((long)Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19) ^ 0xAC6D2E5EDE2D67B7L ^ 0xAC6D2E5EDE2D67B7L);
                                                                }
                                                                continue;
                                                            }
                                                            int cfr_ignored_19 = (Integer.rotateLeft(0x300142D4 ^ n3, 9) - -729499929) * 805389013;
                                                            try {
                                                                ++n2;
                                                                if ((0x847B95BCE52F370BL ^ (long)n3 | 1L) == 0L) {
                                                                    throw new ArithmeticException();
                                                                }
                                                                n4 = Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19);
                                                            }
                                                            catch (ArithmeticException arithmeticException) {
                                                                n4 = (int)((long)Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19) ^ 0x7547F92F2E9FF87L ^ 0x7547F92F2E9FF87L);
                                                            }
                                                            n2 += 5;
                                                            continue;
                                                        }
                                                        int cfr_ignored_20 = (Integer.rotateRight(0x10771152 ^ n3, 5) + 46708777) * 276238675;
                                                        n4 = Integer.rotateLeft(n3 ^ 0xB39945BC, 19);
                                                        int cfr_ignored_21 = Integer.rotateRight(0x6992E4E ^ n3, 3) - -789955923;
                                                        try {
                                                            n2 += 5;
                                                            n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19)));
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19)));
                                                        }
                                                        continue;
                                                    }
                                                    int cfr_ignored_22 = (Integer.rotateRight(0x2DEED692 ^ n3, 8) + -1807115543) * 770627219;
                                                    n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19)));
                                                    continue;
                                                }
                                                int cfr_ignored_23 = Integer.rotateRight(0xBC845FA7 ^ n3, 10) - -664456076;
                                                n4 = Integer.rotateLeft(n3 ^ 0x6327DE70, 19);
                                                int cfr_ignored_24 = Integer.rotateRight(0x46A51CCE ^ n3, 11) - -1839457235;
                                                n4 = Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19) ^ 0x2917A0C7 ^ 0x2917A0C7;
                                                int cfr_ignored_25 = (Integer.rotateRight(0xF053FE73 ^ n3, 17) + 512323368) * -262930829;
                                                n2 -= 4;
                                                continue;
                                            }
                                            int cfr_ignored_26 = Integer.rotateLeft(0x5219FD44 ^ n3, 13) - -175945097;
                                            n4 = (int)((long)Integer.rotateLeft(n3 ^ 0x2E6AF469, 19) ^ 0x1B81AF22F2E5FF20L ^ 0x1B81AF22F2E5FF20L);
                                            int cfr_ignored_27 = (Integer.rotateLeft(0x96E4E9BC ^ n3, 5) - 1242950911) * -1763382851;
                                            n4 = (int)((long)Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19) ^ 0x678A3D522B1552F6L ^ 0x678A3D522B1552F6L);
                                            continue;
                                        }
                                        int cfr_ignored_28 = Integer.rotateRight(0xD4F908AF ^ n3, 13) - -830100372;
                                        n4 = Integer.rotateLeft(n3 ^ 0x95A16BEF, 19);
                                        int cfr_ignored_29 = Integer.rotateLeft(0xE6B358A4 ^ n3, 15) - -199927017;
                                        n4 = Integer.rotateLeft(n3 ^ 0x1161B012, 19) ^ 0xA50FB248 ^ 0xA50FB248;
                                        int cfr_ignored_30 = (Integer.rotateRight(0x4A12EE32 ^ n3, 12) + -56068279) * 1242754611;
                                        n4 = Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19) ^ 0x988D2F69 ^ 0x988D2F69;
                                        n2 += 3;
                                        continue;
                                    }
                                    int cfr_ignored_31 = Integer.rotateLeft(0x36389881 ^ n3, 9) + -1791486246;
                                    int cfr_ignored_32 = (int)(0xF48A36BC27D4EB4FL ^ (long)n3 ^ 0x9008831A2DB844C5L);
                                    n4 = Integer.rotateLeft(n3 ^ 0x5A274961, 19);
                                    int cfr_ignored_33 = (Integer.rotateRight(0xC8992C16 ^ n3, 12) - 1323955685) * -929485801;
                                    n4 = Integer.rotateLeft(n3 ^ 0x7EA2F348, 19);
                                    int cfr_ignored_34 = (Integer.rotateRight(0xF4F53B7A ^ n3, 17) + -1374694655) * -185255045;
                                    n4 = Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19) + -761871706 - -761871706;
                                    continue;
                                }
                                int cfr_ignored_35 = (Integer.rotateLeft(0x80C8F6BD ^ n3, 3) - -1665957858) * -2134313283;
                                int cfr_ignored_36 = (int)(0x427A588027D4EB4FL ^ (long)n3 ^ 0x4C70831A2DB92925L);
                                int cfr_ignored_37 = (int)(0xB34D2DA60EB477A0L ^ (long)n3 ^ 0xA63CD1DB1466CB4BL);
                                n4 = Integer.rotateLeft(n3 ^ 0x600411D6, 19) + -1902406355 - -1902406355;
                                int cfr_ignored_38 = (int)(0x9CC7D6EB730384B0L ^ (long)n3 ^ 0x50A62AB4F246945EL);
                                n4 = (int)((long)Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19) ^ 0x948821D5B60D0FF8L ^ 0x948821D5B60D0FF8L);
                                n2 -= 3;
                                continue;
                            }
                            int cfr_ignored_39 = Integer.rotateRight(0xC0E15B4F ^ n3, 11) - 1604824524;
                            n4 = Integer.rotateLeft(n3 ^ 0x73903608, 19) ^ 0xD4973F5E ^ 0xD4973F5E;
                            int cfr_ignored_40 = Integer.rotateLeft(0x1A2E07CD ^ n3, 6) - 804294926;
                            int cfr_ignored_41 = (int)(0xD89CA9F027D4EB4FL ^ (long)n3 ^ 0xAE90831A2DB81CE8L);
                            int cfr_ignored_42 = (int)(0xE1C6E4307F1AF7B2L ^ (long)n3 ^ 0x3510328614426E5CL);
                            n4 = Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19) ^ 0x8F20E3E8 ^ 0x8F20E3E8;
                            n2 += 2;
                            continue;
                        }
                        int cfr_ignored_43 = Integer.rotateRight(0x66AAE1AE ^ n3, 15) - 1930359629;
                        try {
                            ++n2;
                            if ((0x7A4BDA9DA01EDD65L ^ (long)n3 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n4 = (int)((long)Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19) ^ 0xDBB6396D0D31E2B8L ^ 0xDBB6396D0D31E2B8L);
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19)));
                        }
                        n2 += 2;
                        continue;
                    }
                    int cfr_ignored_44 = (Integer.rotateLeft(0x110D35FC ^ n3, 5) - 351742143) * 286078461;
                    try {
                        n2 -= 2;
                        n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19)));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n4 = (int)((long)Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19) ^ 0x619CE7B64741B863L ^ 0x619CE7B64741B863L);
                    }
                    n2 += 3;
                    continue;
                }
                return bl;
            }
            int cfr_ignored_45 = (Integer.rotateLeft(0x46EDE6B4 ^ n3, 11) - -1691578617) * 1189996213;
            n4 = Integer.rotateLeft(n3 ^ 0xE3E8EA45, 19) ^ 0xCC097909 ^ 0xCC097909;
        }
    }

    private float khdsh() {
        int n = 734554497;
        n = Integer.rotateLeft(n * -194227651, 20) ^ 0xCC496BC4;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xC53B195E;
        if ((n2 ^ n) != -985982626) {
            int cfr_ignored_0 = (0xEEF370DF ^ n) - -163757596;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return Math.max(0.0f, this.khln.shzl() ? this.ztdh.thw_5() : this.hfsh.thw_5());
    }

    private void ztw_2() {
        if (!this.zghj.shzl()) {
            this.rab();
            return;
        }
        if (this.zghsh != null && (!this.zghsh.method_5805() || this.zghsh.method_31481() || System.currentTimeMillis() >= this.shht)) {
            this.rab();
        }
    }

    private void tsh_4() {
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        int n = 0;
        int n2 = 1718994321;
        n2 = Integer.rotateLeft(n2 * -1351275381, 4) ^ 0x4E695444;
        int n3 = Integer.reverse(Integer.reverse(-1951036981 * -369482171 + 559096840 ^ n2));
        block54: while (true) {
            switch (((n3 ^ n2) - 559096840) * 548011149) {
                case -1951036981: {
                    int cfr_ignored_0 = (Integer.rotateRight(0xFF4564F7 ^ n2, 18) - -305866460) * -12229385;
                    bl = this.sfm(this.bwa_2);
                    bl2 = this.sfm(this.dhhy);
                    bl3 = this.sfm(this.rah);
                    if (this.khln.shzl()) {
                        n3 = -889034578 * -369482171 + 559096840 ^ n2 ^ 0xBC9FDB9 ^ 0xBC9FDB9;
                        int cfr_ignored_1 = (Integer.rotateLeft(0x4E221318 ^ n2, 12) + 2055073571) * 1310855961;
                        n += 3;
                        continue block54;
                    }
                    try {
                        ++n;
                        if ((0x4F9D9723591D454FL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = 1850735715 * -369482171 + 559096840 ^ n2;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = 1850735715 * -369482171 + 559096840 ^ n2 ^ 0xC2DCA216 ^ 0xC2DCA216;
                    }
                    n += 2;
                    continue block54;
                }
                case -889034578: {
                    int cfr_ignored_2 = (Integer.rotateRight(0xE47026DA ^ n2, 15) + -1376627807) * -462412069;
                    this.bsr_2 = bl;
                    this.zrd_2 = bl2;
                    this.zzgh = bl3;
                    return;
                }
                case 2057158910: {
                    int cfr_ignored_3 = Integer.rotateRight(0xE1D37DC2 ^ n2, 15) + 1559878073;
                    this.hfsh.shjl(Math.max(f, this.hfsh.thw_5() - this.bqd.thw_5()));
                    n3 = (int)((long)(-578415235 * -369482171 + 559096840 ^ n2) ^ 0xFB9847DCBF843CL ^ 0xFB9847DCBF843CL);
                    int cfr_ignored_4 = Integer.rotateRight(0x878E8EAE ^ n2, 3) - 1856038477;
                    n3 = Integer.reverse(Integer.reverse(29397949 * -369482171 + 559096840 ^ n2));
                    ++n;
                    continue block54;
                }
                case 29397949: {
                    int cfr_ignored_5 = (Integer.rotateRight(0xA3D1999F ^ n2, 7) - -625002116) * -1546544737;
                    if (!bl3) {
                        try {
                            n += 5;
                            if ((0xDB5BFE0B1A0E19D1L ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = (-889034578 * -369482171 + 559096840 ^ n2) + -1481927781 - -1481927781;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = (-889034578 * -369482171 + 559096840 ^ n2) + 1822156347 - 1822156347;
                        }
                        continue block54;
                    }
                    n3 = (int)((long)(755509633 * -369482171 + 559096840 ^ n2) ^ 0x6B26E434787B5BFL ^ 0x6B26E434787B5BFL);
                    continue block54;
                }
                case 343635309: {
                    int cfr_ignored_6 = (Integer.rotateLeft(0x660E3A74 ^ n2, 15) - 1612100423) * 1712208501;
                    if (this.zrd_2) {
                        try {
                            n -= 2;
                            if ((0xEC7A3F8B545CFAF1L ^ (long)n2 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n3 = (29397949 * -369482171 + 559096840 ^ n2) + -95744772 - -95744772;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n3 = (29397949 * -369482171 + 559096840 ^ n2) + 11099685 - 11099685;
                        }
                        n -= 5;
                        continue block54;
                    }
                    int cfr_ignored_7 = (int)(0x2F8585487F4838ECL ^ (long)n2 ^ 0xF7E032238AFFF2DAL);
                    n3 = Integer.reverse(Integer.reverse(-1223671602 * -369482171 + 559096840 ^ n2));
                    int cfr_ignored_8 = (int)(0x46F7E20BECF19F6L ^ (long)n2 ^ 0x131B12DC8CBA50FL);
                    n3 = (int)((long)(2057158910 * -369482171 + 559096840 ^ n2) ^ 0xE31DFD27FB81794AL ^ 0xE31DFD27FB81794AL);
                    ++n;
                    continue block54;
                }
                case 1850735715: {
                    int cfr_ignored_9 = (Integer.rotateRight(0x187B81F ^ n2, 3) - 869067516) * 25671711;
                    f = Math.min(this.dhdhs.thw_5(), this.shfj.thw_5());
                    f2 = Math.max(this.dhdhs.thw_5(), this.shfj.thw_5());
                    if (bl) {
                        try {
                            if ((0xFD7C1AA481073B13L ^ (long)n2 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n3 = Integer.reverse(Integer.reverse(-531995122 * -369482171 + 559096840 ^ n2));
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n3 = (-531995122 * -369482171 + 559096840 ^ n2) + 1797098407 - 1797098407;
                        }
                        ++n;
                        continue block54;
                    }
                    try {
                        n -= 3;
                        if ((0x89B1DF0054423BD9L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = 2122446533 * -369482171 + 559096840 ^ n2;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = 2122446533 * -369482171 + 559096840 ^ n2 ^ 0xB36F74 ^ 0xB36F74;
                    }
                    continue block54;
                }
                case -531995122: {
                    int cfr_ignored_10 = (Integer.rotateLeft(0x3F6D178 ^ n2, 3) + 2134965443) * 66507129;
                    if (!this.bsr_2) {
                        n3 = (int)((long)(-1247993584 * -369482171 + 559096840 ^ n2) ^ 0x55267E49F3DEDF3L ^ 0x55267E49F3DEDF3L);
                        n += 2;
                        continue block54;
                    }
                    n3 = Integer.reverse(Integer.reverse(2122446533 * -369482171 + 559096840 ^ n2));
                    n -= 4;
                    continue block54;
                }
                case -894690980: {
                    int cfr_ignored_11 = (Integer.rotateLeft(0xF05840FD ^ n2, 17) - 520977886) * -262651651;
                    int cfr_ignored_12 = (int)(0x32EAEEC027D4EB4FL ^ (long)n2 ^ 0x20F0831A2DB9C804L);
                    this.hfsh.shjl(Float.intBitsToFloat(Integer.reverse(-567587927) ^ 0xAB1E18B6));
                    n3 = -889034578 * -369482171 + 559096840 ^ n2 ^ 0xB70B1CCA ^ 0xB70B1CCA;
                    n += 5;
                    continue block54;
                }
                case 755509633: {
                    int cfr_ignored_13 = (Integer.rotateRight(0x2E93F672 ^ n2, 8) + -1471645943) * 781448819;
                    if (this.zzgh) {
                        try {
                            ++n;
                            if ((0x2A28C829988A3857L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n3 = -889034578 * -369482171 + 559096840 ^ n2;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = -889034578 * -369482171 + 559096840 ^ n2 ^ 0x8A00CFDE ^ 0x8A00CFDE;
                        }
                        n -= 5;
                        continue block54;
                    }
                    n3 = -2113845562 * -369482171 + 559096840 ^ n2;
                    int cfr_ignored_14 = (Integer.rotateLeft(0x22BB1955 ^ n2, 7) - 956674182) * 582687061;
                    int cfr_ignored_15 = (int)(0xE009B76827D4EB4FL ^ (long)n2 ^ 0x93A0831A2DB86DC2L);
                    n3 = -894690980 * -369482171 + 559096840 ^ n2;
                    n -= 4;
                    continue block54;
                }
                case -83085987: {
                    int cfr_ignored_16 = Integer.rotateLeft(0x3AE38D40 ^ n2, 10) + 636205563;
                    if (!this.zzgh) {
                        int cfr_ignored_17 = (int)(0x97A90EF769BBF3D4L ^ (long)n2 ^ 0xE09E1FC41C8E8283L);
                        n3 = (int)((long)(1003735701 * -369482171 + 559096840 ^ n2) ^ 0xFA3C793993A38D20L ^ 0xFA3C793993A38D20L);
                        int cfr_ignored_18 = (int)(0xF2018D7C4EDC61AAL ^ (long)n2 ^ 0xE788510B387249D2L);
                        n3 = (-894690980 * -369482171 + 559096840 ^ n2) + -1302586936 - -1302586936;
                        n += 4;
                        continue block54;
                    }
                    try {
                        if ((0xBAB3D01D111B2651L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = -889034578 * -369482171 + 559096840 ^ n2 ^ 0xD220210F ^ 0xD220210F;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)(-889034578 * -369482171 + 559096840 ^ n2) ^ 0xA262618BF155F379L ^ 0xA262618BF155F379L);
                    }
                    n += 4;
                    continue block54;
                }
                case 2122446533: {
                    int cfr_ignored_19 = Integer.rotateLeft(0x2ADA5E89 ^ n2, 8) + 885985746;
                    int cfr_ignored_20 = (int)(0xE868F0B427D4EB4FL ^ (long)n2 ^ 0x1C18831A2DB87D00L);
                    if (!bl2) {
                        n3 = Integer.reverse(Integer.reverse(-1099218758 * -369482171 + 559096840 ^ n2));
                        int cfr_ignored_21 = Integer.rotateLeft(0x4D2C0985 ^ n2, 12) - 1555220054;
                        int cfr_ignored_22 = (int)(0x8F9EA7B827D4EB4FL ^ (long)n2 ^ 0xB200831A2DB8B2ECL);
                        n3 = (29397949 * -369482171 + 559096840 ^ n2) + 487463762 - 487463762;
                        --n;
                        continue block54;
                    }
                    n3 = (343635309 * -369482171 + 559096840 ^ n2) + -845456897 - -845456897;
                    n -= 3;
                    continue block54;
                }
                case -1247993584: {
                    int cfr_ignored_23 = (Integer.rotateRight(0x8A76EE5A ^ n2, 4) + -926647263) * -1971917221;
                    this.hfsh.shjl(Math.min(f2, this.hfsh.thw_5() + this.bqd.thw_5()));
                    try {
                        if ((0x45F786D25DA42579L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (2122446533 * -369482171 + 559096840 ^ n2) + 448783796 - 448783796;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = 2122446533 * -369482171 + 559096840 ^ n2 ^ 0x8C5E3406 ^ 0x8C5E3406;
                    }
                    ++n;
                    continue block54;
                }
                case -1970596579: {
                    int cfr_ignored_24 = Integer.rotateRight(0xE659B9E2 ^ n2, 15) + -382000743;
                    int cfr_ignored_25 = (int)(0xC2AB93C84B457EFEL ^ (long)n2 ^ 0xDAE05A3906DA2886L);
                    n3 = (int)((long)(1217064530 * -369482171 + 559096840 ^ n2) ^ 0xF654B9C8D0C0D7BBL ^ 0xF654B9C8D0C0D7BBL);
                    int cfr_ignored_26 = (int)(0xDA7661B5122A890BL ^ (long)n2 ^ 0x3E1AE8E6E930193DL);
                    n3 = (int)((long)(-1951036981 * -369482171 + 559096840 ^ n2) ^ 0x2229276E6BF70863L ^ 0x2229276E6BF70863L);
                    n += 3;
                    continue block54;
                }
                case -546438221: {
                    int cfr_ignored_27 = Integer.rotateLeft(0xA34C622D ^ n2, 7) - -895647058;
                    int cfr_ignored_28 = (int)(0x61FECC1027D4EB4FL ^ (long)n2 ^ 0x6550831A2DB96E2CL);
                    n3 = Integer.reverse(Integer.reverse(-1347468909 * -369482171 + 559096840 ^ n2));
                    int cfr_ignored_29 = Integer.rotateRight(0xEB910CC3 ^ n2, 16) + -1964102952;
                    try {
                        n -= 2;
                        if ((0xF9513732EF47D20BL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(-1951036981 * -369482171 + 559096840 ^ n2));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(-1951036981 * -369482171 + 559096840 ^ n2));
                    }
                    continue block54;
                }
                case -1716494919: {
                    int cfr_ignored_30 = (Integer.rotateRight(0x385F735B ^ n2, 10) + -672360640) * 945779547;
                    n3 = -1951036981 * -369482171 + 559096840 ^ n2;
                    n += 5;
                    continue block54;
                }
                case -2087851458: {
                    int cfr_ignored_31 = Integer.rotateRight(0x22319FE3 ^ n2, 7) + 677379000;
                    try {
                        if ((0x248F5C4878801A3FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = -1951036981 * -369482171 + 559096840 ^ n2 ^ 0x6246B58B ^ 0x6246B58B;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = -1951036981 * -369482171 + 559096840 ^ n2 ^ 0xBC8E3FC6 ^ 0xBC8E3FC6;
                    }
                    ++n;
                    continue block54;
                }
                case -478393572: {
                    int cfr_ignored_32 = Integer.rotateLeft(0x9FE9C109 ^ n2, 6) + 1638661970;
                    int cfr_ignored_33 = (int)(0x5D5B6F3427D4EB4FL ^ (long)n2 ^ 0x2318831A2DB91767L);
                    n3 = -1528402342 * -369482171 + 559096840 ^ n2;
                    int cfr_ignored_34 = Integer.rotateLeft(0x35B2AB8D ^ n2, 9) - -2063571634;
                    int cfr_ignored_35 = (int)(0xF70005B027D4EB4FL ^ (long)n2 ^ 0xF610831A2DB843D1L);
                    n3 = (-121686397 * -369482171 + 559096840 ^ n2) + 2020007817 - 2020007817;
                    int cfr_ignored_36 = Integer.rotateLeft(0x59DB58EC ^ n2, 14) - -437427249;
                    n3 = (int)((long)(-1951036981 * -369482171 + 559096840 ^ n2) ^ 0x846028838F1E1FE0L ^ 0x846028838F1E1FE0L);
                    n -= 3;
                    continue block54;
                }
                case 294402545: {
                    int cfr_ignored_37 = (Integer.rotateRight(0x33FB21F ^ n2, 3) - 1762930940) * 54506015;
                    n3 = Integer.reverse(Integer.reverse(-837746439 * -369482171 + 559096840 ^ n2));
                    int cfr_ignored_38 = Integer.rotateLeft(0x6E07D5CD ^ n2, 16) - 1464894222;
                    int cfr_ignored_39 = (int)(0xACB57BF027D4EB4FL ^ (long)n2 ^ 0xA90831A2DB8F4BBL);
                    n3 = -1951036981 * -369482171 + 559096840 ^ n2;
                    int cfr_ignored_40 = (Integer.rotateLeft(0x1E3C7755 ^ n2, 6) - -1380969850) * 507279189;
                    int cfr_ignored_41 = (int)(0xDC8ED96827D4EB4FL ^ (long)n2 ^ 0x4FA0831A2DB814CCL);
                    n -= 5;
                    continue block54;
                }
                case -2092367147: {
                    int cfr_ignored_42 = (Integer.rotateRight(0x20B5D23F ^ n2, 7) - -94235428) * 548786751;
                    n3 = Integer.reverse(Integer.reverse(-1251821523 * -369482171 + 559096840 ^ n2));
                    int cfr_ignored_43 = (Integer.rotateRight(0x3256BE9B ^ n2, 9) + 484357120) * 844545691;
                    try {
                        n += 2;
                        if ((0x78909D89C667900BL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(-1951036981 * -369482171 + 559096840 ^ n2));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = -1951036981 * -369482171 + 559096840 ^ n2;
                    }
                    n -= 5;
                    continue block54;
                }
                case 1866689817: {
                    int cfr_ignored_44 = (Integer.rotateLeft(0xD85157D1 ^ n2, 14) + 909590922) * -665757743;
                    int cfr_ignored_45 = (int)(0x1AE3F9EC27D4EB4FL ^ (long)n2 ^ 0xEA8831A2DB99816L);
                    n3 = -1951036981 * -369482171 + 559096840 ^ n2;
                    --n;
                    continue block54;
                }
                case 2112663598: {
                    int cfr_ignored_46 = (Integer.rotateRight(0x343CE612 ^ n2, 9) + 1472035689) * 876406291;
                    int cfr_ignored_47 = (int)(0x60C905C96FA23952L ^ (long)n2 ^ 0xF6E213F789836C43L);
                    n3 = 1634433494 * -369482171 + 559096840 ^ n2 ^ 0xA2C5D86C ^ 0xA2C5D86C;
                    int cfr_ignored_48 = (int)(0xF3B8C81ACA60E6F7L ^ (long)n2 ^ 0x6D45587236C84AA0L);
                    n3 = Integer.reverse(Integer.reverse(-1951036981 * -369482171 + 559096840 ^ n2));
                    n -= 2;
                    continue block54;
                }
                case 879497449: {
                    int cfr_ignored_49 = (Integer.rotateLeft(0x12AAF475 ^ n2, 5) - 1192311142) * 313193589;
                    int cfr_ignored_50 = (int)(0xD0185A4827D4EB4FL ^ (long)n2 ^ 0x49E0831A2DB80DE1L);
                    try {
                        n -= 4;
                        if ((0xACF611EB4C83E137L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = -1951036981 * -369482171 + 559096840 ^ n2 ^ 0x622E8992 ^ 0x622E8992;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)(-1951036981 * -369482171 + 559096840 ^ n2) ^ 0x4C950F04F7976031L ^ 0x4C950F04F7976031L);
                    }
                    n += 4;
                    continue block54;
                }
                case 523331820: {
                    int cfr_ignored_51 = (Integer.rotateRight(0xC46A73F7 ^ n2, 11) - -851334620) * -999656457;
                    try {
                        n += 5;
                        n3 = (int)((long)(-1951036981 * -369482171 + 559096840 ^ n2) ^ 0xE8DCA3D4CA265D25L ^ 0xE8DCA3D4CA265D25L);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)(-1951036981 * -369482171 + 559096840 ^ n2) ^ 0x6EC9DDAF1C02C862L ^ 0x6EC9DDAF1C02C862L);
                    }
                    n += 4;
                    continue block54;
                }
                case 1945320633: {
                    int cfr_ignored_52 = (Integer.rotateLeft(0xC2DD5F99 ^ n2, 11) + -1658047806) * -1025679463;
                    int cfr_ignored_53 = (int)(0x6FF1A427D4EB4FL ^ (long)n2 ^ 0x1E38831A2DB9AD0EL);
                    try {
                        n += 4;
                        if ((0x6B36D810807A2321L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = -1951036981 * -369482171 + 559096840 ^ n2;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = -1951036981 * -369482171 + 559096840 ^ n2;
                    }
                    n -= 2;
                    continue block54;
                }
            }
            int cfr_ignored_54 = Integer.rotateLeft(0x2839EB2C ^ n2, 8) - -480175729;
            n3 = (-1951036981 * -369482171 + 559096840 ^ n2) + -1194171190 - -1194171190;
        }
    }

    private boolean sfm(bdh_3 bdh2_2) {
        int n = -1607541132;
        n = Integer.rotateLeft(n * 2125056057, 9) ^ 0x11252802;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 12);
        bdh_3 bdh3 = bdh2_2;
        n = (bdh3 != null ? System.identityHashCode(bdh3) : 0) ^ n;
        int n2 = n ^ 0x974E26FE;
        if ((n2 ^ n) != -1756485890) {
            int cfr_ignored_0 = (0x3760F88A ^ n) + -1451623160;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return bdh2_2.sdhkh() != -1 && brz.rzdh(bdh2_2.sdhkh()) && bsz_3.mc.field_1755 == null;
    }

    private boolean ghsy_2(class_238 class_2383, class_243 class_2432, class_243 class_2433, double d) {
        return class_2383.method_1006(class_2432) || class_2383.method_992(class_2432, class_2432.method_1019(class_2433.method_1021(d))).isPresent();
    }

    private static class_243 shht_2(float f, float f2) {
        int n = bkm.sdhs_4(-1030239937);
        n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 12);
        int n2 = n ^ 0xF8A11DB3;
        if ((n2 ^ n) != -123658829) {
            int cfr_ignored_0 = Integer.rotateLeft(0x3A36D48C ^ n, 10) - 285301807;
        }
        float f3 = f2 * Float.intBitsToFloat(Integer.rotateLeft(0x8C6EA238 ^ 0x532805A9, 19));
        float f4 = -f * Float.intBitsToFloat(-68499241 - -1084502366);
        float f5 = class_3532.method_15362((float)f3);
        return new class_243((double)(class_3532.method_15374((float)f4) * f5), (double)(-class_3532.method_15374((float)f3)), (double)(class_3532.method_15362((float)f4) * f5));
    }

    private static class_238 thml(class_238 class_2383, double d) {
        int n = bkm.sdhs_4(-1049554875);
        class_238 class_2384 = class_2383;
        n = (class_2384 != null ? System.identityHashCode(class_2384) : 0) ^ n;
        int n2 = n ^ 0xD75227C5;
        if ((n2 ^ n) != -682481723) {
            int cfr_ignored_0 = Integer.rotateLeft(0x16233780 ^ n, 5) + -1298049093;
        }
        return new class_238(class_2383.field_1323 - d, class_2383.field_1322, class_2383.field_1321 - d, class_2383.field_1320 + d, class_2383.field_1325, class_2383.field_1324 + d);
    }

    private static double shbl(class_243 class_2432, class_238 class_2383) {
        try {
            int n = 311079848;
            n = Integer.rotateLeft(n * -83672843, 9) ^ 0x1C38089E;
            int n2 = n ^ 0x237C5066;
            if ((n2 ^ n) != 595349606) {
                int cfr_ignored_0 = (0x31F6E3CE ^ n) - -814553715;
            }
            if ((0x34A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        double d = class_2432.field_1352 - class_3532.method_15350((double)class_2432.field_1352, (double)class_2383.field_1323, (double)class_2383.field_1320);
        double d2 = class_2432.field_1351 - class_3532.method_15350((double)class_2432.field_1351, (double)class_2383.field_1322, (double)class_2383.field_1325);
        double d3 = class_2432.field_1350 - class_3532.method_15350((double)class_2432.field_1350, (double)class_2383.field_1321, (double)class_2383.field_1324);
        return d * d + d2 * d2 + d3 * d3;
    }

    private static float tjw(float f, float f2) {
        block0: {
            int n = bkm.sdhs_4(-2094687177);
            n = Float.floatToIntBits(f) ^ n;
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0x6897E67F;
            if ((n2 ^ n) == 1754785407) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xEBB27A48 ^ n, 16) + -1896190477;
        }
        return (float)Math.round(f / f2) * f2;
    }

    private void rab() {
        int n = -256097981;
        n = Integer.rotateLeft(n * 933990757, 15) ^ 0x73F977E0;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 3);
        int n2 = n ^ 0x530ECC8B;
        if ((n2 ^ n) != 1393478795) {
            int cfr_ignored_0 = (0xA3B28DC8 ^ n) + -1680613379;
        }
        this.zghsh = null;
        this.shht = 0L;
    }

    private void zlh_2() {
        int n = bkm.sdhs_4(793277195);
        int n2 = n ^ 0xFE281A86;
        if ((n2 ^ n) != -30926202) {
            int cfr_ignored_0 = Integer.rotateLeft(0xD160698D ^ n, 13) - 1594517326;
            int cfr_ignored_1 = (int)(0x13D2C7B027D4EB4FL ^ (long)n ^ 0x7210831A2DB98A74L);
        }
        this.ssz = null;
        this.da_4 = 0L;
        this.zthm = 0.0f;
        this.bbr = 0.0f;
        this.jyn = false;
    }

    private void stw_3() {
        int n = bkm.sdhs_4(1187832663);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 10);
        int n2 = n ^ 0xBB31D77D;
        if ((n2 ^ n) != -1154361475) {
            int cfr_ignored_0 = Integer.rotateRight(0xFDFD342A ^ n, 18) + -972623791;
        }
        this.thzs_4 = 0.0f;
        this.htt_3 = 0L;
        this.khay_2 = false;
    }

    /*
     * Unable to fully structure code
     */
    private void zshgh() {
        var3_1 = 0;
        var1_2 = 6063774;
        var1_2 = Integer.rotateLeft(var1_2 * -1734110325, 25) ^ -101741498;
        var2_3 = Integer.reverse(var1_2 ^ -567603324 ^ -569617297);
        while (true) {
            block35: {
                block45: {
                    block43: {
                        block38: {
                            block36: {
                                block37: {
                                    block42: {
                                        block33: {
                                            block41: {
                                                block39: {
                                                    block34: {
                                                        block40: {
                                                            block44: {
                                                                var3_1 = Integer.reverse(var2_3) ^ var1_2 ^ -569617297;
                                                                switch (var3_1 & 7) {
                                                                    case 0: {
                                                                        if (var3_1 == -571287400) break block33;
                                                                        if (var3_1 != 406341320) {
                                                                            ** break;
                                                                        }
                                                                        break block34;
                                                                    }
                                                                    case 1: {
                                                                        if (var3_1 == 1631838273) break block35;
                                                                        if (var3_1 != -1108801911) {
                                                                            ** break;
                                                                        }
                                                                        break block36;
                                                                    }
                                                                    case 3: {
                                                                        if (var3_1 == -2122187261) break block37;
                                                                        if (var3_1 == 1895574219) break block38;
                                                                        if (var3_1 == 1640555939) break;
                                                                        if (var3_1 != -11338341) {
                                                                            ** break;
                                                                        }
                                                                        break block39;
                                                                    }
                                                                    case 4: {
                                                                        if (var3_1 != -567603324) {
                                                                            ** break;
                                                                        }
                                                                        break block40;
                                                                    }
                                                                    case 5: {
                                                                        if (var3_1 == -975794971) break block41;
                                                                        if (var3_1 != -359734435) {
                                                                            Integer.rotateLeft(-266988992 ^ var1_2, 17) + 386520315;
                                                                            ** break;
                                                                        }
                                                                        break block42;
                                                                    }
                                                                    case 6: {
                                                                        if (var3_1 != 1082494918) {
                                                                            ** break;
                                                                        }
                                                                        break block43;
                                                                    }
                                                                    case 7: {
                                                                        if (var3_1 == 1224321719) break block44;
                                                                        if (var3_1 != 1434675783) {
                                                                            ** break;
                                                                        }
                                                                        break block45;
                                                                    }
                                                                }
                                                                Integer.rotateLeft(-1071241688 ^ var1_2, 11) + 1224490515;
                                                                this.bsr_2 = false;
                                                                this.zrd_2 = false;
                                                                this.zzgh = false;
                                                                return;
                                                            }
                                                            (Integer.rotateRight(-137273966 ^ var1_2, 17) + 112718825) * -137273965;
                                                            throw null;
                                                        }
                                                        Integer.rotateLeft(1110581088 ^ var1_2, 11) + 141519835;
                                                        if (yf.dnkh()) {
                                                            var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ -292586683 ^ -569617297)));
                                                            Integer.rotateRight(1612610018 ^ var1_2, 15) + -1475452519;
                                                            var2_3 = Integer.reverse(var1_2 ^ 1224321719 ^ -569617297) + 731330804 - 731330804;
                                                            continue;
                                                        }
                                                        var2_3 = Integer.reverse(var1_2 ^ 1640555939 ^ -569617297) + 1110597616 - 1110597616;
                                                        (Integer.rotateRight(-727048258 ^ var1_2, 13) - -990415043) * -727048257;
                                                        var3_1 += 2;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(68767628 ^ var1_2, 3) - -2089926353;
                                                    var2_3 = Integer.reverse(var1_2 ^ -1445593394 ^ -569617297) + -1883720298 - -1883720298;
                                                    Integer.rotateLeft(-463577015 ^ var1_2, 15) + -1412741102;
                                                    (int)(2804843666224769871L ^ (long)var1_2 ^ 7032514966598574088L);
                                                    var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ -567603324 ^ -569617297)));
                                                    (Integer.rotateLeft(1242478417 ^ var1_2, 12) + -64630262) * 1242478417;
                                                    (int)(-8593966036614321329L ^ (long)var1_2 ^ -3483390163311608663L);
                                                    continue;
                                                }
                                                Integer.rotateLeft(387100577 ^ var1_2, 5) + -811539526;
                                                (int)(-3053438777162405041L ^ (long)var1_2 ^ -123704841293265263L);
                                                var2_3 = (int)((long)Integer.reverse(var1_2 ^ 1934171969 ^ -569617297) ^ 2925847637415910944L ^ 2925847637415910944L);
                                                (Integer.rotateLeft(-1871863751 ^ var1_2, 5) + -2119956958) * -1871863751;
                                                (int)(5971507041927490383L ^ (long)var1_2 ^ -2199864269510997905L);
                                                try {
                                                    var3_1 += 4;
                                                    var2_3 = (int)((long)Integer.reverse(var1_2 ^ -567603324 ^ -569617297) ^ 4837912441406678798L ^ 4837912441406678798L);
                                                }
                                                catch (IllegalArgumentException v0) {
                                                    var2_3 = Integer.reverse(var1_2 ^ -567603324 ^ -569617297) ^ -123638426 ^ -123638426;
                                                }
                                                var3_1 -= 4;
                                                continue;
                                            }
                                            Integer.rotateRight(-1822664029 ^ var1_2, 5) + -594765576;
                                            var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 880042518 ^ -569617297)));
                                            (Integer.rotateRight(-1727697353 ^ var1_2, 6) - -1945765916) * -1727697353;
                                            var2_3 = Integer.reverse(var1_2 ^ -567603324 ^ -569617297) + -123432438 - -123432438;
                                            continue;
                                        }
                                        Integer.rotateRight(-1545799961 ^ var1_2, 7) - -601914060;
                                        var2_3 = (int)((long)Integer.reverse(var1_2 ^ -1563896987 ^ -569617297) ^ 977389705118240074L ^ 977389705118240074L);
                                        (Integer.rotateRight(960496347 ^ var1_2, 10) + -216139840) * 960496347;
                                        try {
                                            var3_1 += 4;
                                            var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ -567603324 ^ -569617297)));
                                        }
                                        catch (ArithmeticException v1) {
                                            var2_3 = (int)((long)Integer.reverse(var1_2 ^ -567603324 ^ -569617297) ^ 4832785595438276905L ^ 4832785595438276905L);
                                        }
                                        continue;
                                    }
                                    (Integer.rotateLeft(350390261 ^ var1_2, 5) - -1949559322) * 350390261;
                                    (int)(-3003855011817657521L ^ (long)var1_2 ^ -5845528167867481743L);
                                    var2_3 = Integer.reverse(var1_2 ^ 411517623 ^ -569617297) ^ -1382991313 ^ -1382991313;
                                    (Integer.rotateLeft(-1296668748 ^ var1_2, 9) - -1468781049) * -1296668747;
                                    var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ -567603324 ^ -569617297)));
                                    Integer.rotateLeft(1245368421 ^ var1_2, 12) - 24959862;
                                    (int)(-8608491770628215985L ^ (long)var1_2 ^ 126244938025843905L);
                                    var3_1 -= 5;
                                    continue;
                                }
                                (Integer.rotateLeft(-917305103 ^ var1_2, 12) + 1701557354) * -917305103;
                                (int)(856148799948909391L ^ (long)var1_2 ^ -5699161179977827822L);
                                var2_3 = (int)((long)Integer.reverse(var1_2 ^ 100598057 ^ -569617297) ^ 2389020819098474283L ^ 2389020819098474283L);
                                (Integer.rotateLeft(-1343456711 ^ var1_2, 8) + 1375759394) * -1343456711;
                                (int)(7880969512258169679L ^ (long)var1_2 ^ 6158816638888671084L);
                                var2_3 = Integer.reverse(var1_2 ^ -567603324 ^ -569617297) + -2026175542 - -2026175542;
                                var3_1 -= 4;
                                continue;
                            }
                            Integer.rotateLeft(855907041 ^ var1_2, 9) + 836558970;
                            (int)(-1029436607153509553L ^ (long)var1_2 ^ -7725781012294644036L);
                            var2_3 = Integer.reverse(var1_2 ^ -1980065763 ^ -569617297) ^ -365257927 ^ -365257927;
                            Integer.rotateLeft(-1778080471 ^ var1_2, 5) + 787324722;
                            (int)(6104078526142802767L ^ (long)var1_2 ^ -1488295528386460483L);
                            try {
                                var3_1 += 3;
                                if ((-3815409250553797831L ^ (long)var1_2 | 1L) == 0L) {
                                    throw new UnsupportedOperationException();
                                }
                                var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ -567603324 ^ -569617297)));
                            }
                            catch (UnsupportedOperationException v2) {
                                var2_3 = Integer.reverse(var1_2 ^ -567603324 ^ -569617297) + -2141954117 - -2141954117;
                            }
                            ++var3_1;
                            continue;
                        }
                        Integer.rotateLeft(-1046903483 ^ var1_2, 11) - 1978974870;
                        (int)(228324001176677199L ^ (long)var1_2 ^ -6088722547745379449L);
                        var2_3 = Integer.reverse(var1_2 ^ 175570656 ^ -569617297) ^ 1266393780 ^ 1266393780;
                        (Integer.rotateRight(1677749143 ^ var1_2, 15) - 543860356) * 1677749143;
                        try {
                            --var3_1;
                            if ((-5684550754303226793L ^ (long)var1_2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var2_3 = Integer.reverse(var1_2 ^ -567603324 ^ -569617297);
                        }
                        catch (IllegalStateException v3) {
                            var2_3 = (int)((long)Integer.reverse(var1_2 ^ -567603324 ^ -569617297) ^ -7757311839699623309L ^ -7757311839699623309L);
                        }
                        var3_1 -= 5;
                        continue;
                    }
                    Integer.rotateRight(257827234 ^ var1_2, 4) + -524045863;
                    try {
                        var3_1 += 5;
                        var2_3 = Integer.reverse(var1_2 ^ -567603324 ^ -569617297) + -390392267 - -390392267;
                    }
                    catch (IllegalArgumentException v4) {
                        var2_3 = Integer.reverse(var1_2 ^ -567603324 ^ -569617297);
                    }
                    --var3_1;
                    continue;
                }
                Integer.rotateLeft(-855375068 ^ var1_2, 12) - -673578857;
                (int)(-8641582148158264374L ^ (long)var1_2 ^ 2365603549992369652L);
                var2_3 = (int)((long)Integer.reverse(var1_2 ^ -567603324 ^ -569617297) ^ -4752708459753042992L ^ -4752708459753042992L);
                var3_1 += 2;
                continue;
            }
            Integer.rotateLeft(-847311347 ^ var1_2, 12) - -423603506;
            (int)(1138742409481743183L ^ (long)var1_2 ^ -4823211052454268342L);
            try {
                var3_1 += 5;
                if ((5530570940502803143L ^ (long)var1_2 | 1L) == 0L) {
                    throw new IllegalStateException();
                }
                var2_3 = Integer.reverse(var1_2 ^ -567603324 ^ -569617297);
            }
            catch (IllegalStateException v5) {
                var2_3 = (int)((long)Integer.reverse(var1_2 ^ -567603324 ^ -569617297) ^ -1370226144307637041L ^ -1370226144307637041L);
            }
            continue;
lbl221:
            // 8 sources

            (Integer.rotateRight(-2123027526 ^ var1_2, 3) + -1316099391) * -2123027525;
            var2_3 = Integer.reverse(var1_2 ^ -567603324 ^ -569617297) ^ -989976189 ^ -989976189;
        }
    }

    private void bqth(bjd_2 bjd2) {
        int n = 2009351352;
        n = Integer.rotateLeft(n * -515146013, 4) ^ 0xA4D4E425;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x3ACE3DDD;
        if ((n2 ^ n) != 986594781) {
            int cfr_ignored_0 = (0x4D0A7965 ^ n) - -664017003;
        }
        this.azk_2();
    }

    /*
     * Unable to fully structure code
     */
    private void tnl_2(btt var1_1) {
        var4_2 = 0;
        var2_3 = -189796912;
        var2_3 = Integer.rotateLeft(var2_3 * 1570491491, 27) ^ 390730480;
        var2_3 = System.identityHashCode(this) ^ var2_3;
        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -1866098150));
        block31: while (true) {
            if ((var4_2 = var3_4 ^ var2_3) == -460579214) ** GOTO lbl-1000
            if (var4_2 != 1549627891) {
                switch (var4_2) {
                    case -283823458: {
                        Integer.rotateLeft(-676638039 ^ var2_3, 13) + 572301746;
                        (int)(1520524062467877711L ^ (long)var2_3 ^ 313144322561771490L);
                        this.rab();
                        this.zlh_2();
                        this.stw_3();
                        this.zshgh();
                        this.shk = false;
                        return;
                    }
                    case -1513884603: {
                        Integer.rotateRight(1148203951 ^ var2_3, 11) - 1307828588;
                        this.ztw_2();
                        this.jzh_3();
                        this.khzn();
                        this.tsh_4();
                        return;
                    }
                }
            }
            ** GOTO lbl71
lbl-1000:
            // 1 sources

            {
                Integer.rotateRight(-307650685 ^ var2_3, 16) + -873992168;
                if (bsz_3.mc.field_1687 == null) {
                    try {
                        var4_2 += 5;
                        if ((4989160080235203405L ^ (long)var2_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var3_4 = var2_3 ^ -283823458 ^ -1512262497 ^ -1512262497;
                    }
                    catch (ArithmeticException v0) {
                        var3_4 = (var2_3 ^ -283823458) + 1906960944 - 1906960944;
                    }
                    continue block31;
                }
                (int)(6970481654477794323L ^ (long)var2_3 ^ -4813031067462046551L);
                var3_4 = (int)((long)(var2_3 ^ -19423953) ^ -6522731177984163784L ^ -6522731177984163784L);
                (int)(1234238600442156564L ^ (long)var2_3 ^ 4008004037592977296L);
                var3_4 = (int)((long)(var2_3 ^ -1513884603) ^ -2768692670993293734L ^ -2768692670993293734L);
                var4_2 += 3;
                continue block31;
                case -1866098150: {
                    (Integer.rotateLeft(1133503417 ^ var2_3, 11) + 852112034) * 1133503417;
                    (int)(-9134059239238210737L ^ (long)var2_3 ^ 7383795737533394859L);
                    if (bsz_3.mc.field_1724 == null) {
                        (int)(-6868509733216156405L ^ (long)var2_3 ^ -5700587226099815283L);
                        var3_4 = (int)((long)(var2_3 ^ -1192536938) ^ -6821304436772326276L ^ -6821304436772326276L);
                        (int)(300955648237707345L ^ (long)var2_3 ^ -7614927238285908597L);
                        var3_4 = (var2_3 ^ -283823458) + -811935330 - -811935330;
                        continue block31;
                    }
                    try {
                        if ((-1429332354637917445L ^ (long)var2_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -460579214));
                    }
                    catch (ArithmeticException v1) {
                        var3_4 = (int)((long)(var2_3 ^ -460579214) ^ -3740611960625903095L ^ -3740611960625903095L);
                    }
                    continue block31;
                }
lbl71:
                // 1 sources

                Integer.rotateRight(-1467960186 ^ var2_3, 8) - 1811118965;
                try {
                    var4_2 -= 3;
                    if ((2223753852686451885L ^ (long)var2_3 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -1866098150));
                }
                catch (ArithmeticException v2) {
                    var3_4 = var2_3 ^ -1866098150;
                }
                var4_2 += 3;
                continue block31;
                case -1154348448: {
                    (Integer.rotateRight(26123930 ^ var2_3, 3) + 883086305) * 26123931;
                    try {
                        --var4_2;
                        if ((6998472535915744359L ^ (long)var2_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var3_4 = (var2_3 ^ -1866098150) + -450575731 - -450575731;
                    }
                    catch (ArithmeticException v3) {
                        var3_4 = (var2_3 ^ -1866098150) + 1417719036 - 1417719036;
                    }
                    continue block31;
                }
                case 618890342: {
                    Integer.rotateRight(269598403 ^ var2_3, 5) + -159139624;
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 1262947357));
                    Integer.rotateLeft(1560938216 ^ var2_3, 14) + 1217688915;
                    try {
                        var4_2 -= 5;
                        if ((-7457310396797966517L ^ (long)var2_3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var3_4 = (var2_3 ^ -1866098150) + 1221436545 - 1221436545;
                    }
                    catch (NoSuchElementException v4) {
                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -1866098150));
                    }
                    continue block31;
                }
                case -561392921: {
                    (Integer.rotateLeft(999041049 ^ var2_3, 10) + 978745922) * 999041049;
                    (int)(-486804219864224945L ^ (long)var2_3 ^ -1064957163413676116L);
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 1388859258));
                    (Integer.rotateRight(-1318894241 ^ var2_3, 9) - 2137195964) * -1318894241;
                    try {
                        if ((-928305102934863455L ^ (long)var2_3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var3_4 = var2_3 ^ -1866098150 ^ 2040725794 ^ 2040725794;
                    }
                    catch (NoSuchElementException v5) {
                        var3_4 = var2_3 ^ -1866098150;
                    }
                    continue block31;
                }
                case -1923718385: {
                    Integer.rotateLeft(-1474726299 ^ var2_3, 8) - 1601369462;
                    (int)(7686475062174870351L ^ (long)var2_3 ^ 5602622084908415110L);
                    var3_4 = var2_3 ^ 1457485665 ^ -1734754509 ^ -1734754509;
                    (Integer.rotateRight(-819875942 ^ var2_3, 12) + 426894049) * -819875941;
                    var3_4 = var2_3 ^ 515872622;
                    (Integer.rotateLeft(-1550181959 ^ var2_3, 7) + -737755998) * -1550181959;
                    (int)(7001047398979267407L ^ (long)var2_3 ^ -7892414198507278464L);
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -1866098150));
                    var4_2 -= 3;
                    continue block31;
                }
                case -1820634168: {
                    Integer.rotateLeft(-1448767808 ^ var2_3, 8) + -1888884613;
                    var3_4 = (var2_3 ^ -1369265232) + -1237287585 - -1237287585;
                    Integer.rotateLeft(1401217729 ^ var2_3, 13) + 561321114;
                    (int)(-7983108643583890609L ^ (long)var2_3 ^ 7244184149084901309L);
                    var3_4 = var2_3 ^ -1866098150;
                    var4_2 += 2;
                    continue block31;
                }
                case 0x7A77A787: {
                    Integer.rotateLeft(-1389294936 ^ var2_3, 8) + -45225581;
                    try {
                        var3_4 = var2_3 ^ -1866098150;
                    }
                    catch (UnsupportedOperationException v6) {
                        var3_4 = var2_3 ^ -1866098150 ^ 1265111772 ^ 1265111772;
                    }
                    var4_2 -= 3;
                    continue block31;
                }
                case 1721785081: {
                    Integer.rotateLeft(-1841611196 ^ var2_3, 5) - -1182127753;
                    var3_4 = (var2_3 ^ -533911606) + -867361264 - -867361264;
                    Integer.rotateRight(-458458329 ^ var2_3, 15) - -1254061836;
                    var3_4 = var2_3 ^ -278285729;
                    (Integer.rotateLeft(494227516 ^ var2_3, 6) - -1785571713) * 494227517;
                    var3_4 = var2_3 ^ -1866098150 ^ 2141166151 ^ 2141166151;
                    --var4_2;
                    continue block31;
                }
                case 214144188: {
                    (Integer.rotateRight(1519472603 ^ var2_3, 14) + -67745088) * 1519472603;
                    var3_4 = (var2_3 ^ -1391145757) + 1130194204 - 1130194204;
                    (Integer.rotateRight(1754214806 ^ var2_3, 16) - -1380671387) * 1754214807;
                    (int)(5484572368736600932L ^ (long)var2_3 ^ -4146334916907420181L);
                    var3_4 = (int)((long)(var2_3 ^ -1866098150) ^ -4144220523374205021L ^ -4144220523374205021L);
                    var4_2 -= 2;
                    continue block31;
                }
                case 638316556: {
                    (Integer.rotateRight(1117068635 ^ var2_3, 11) + 342633792) * 1117068635;
                    (int)(3481389516443993152L ^ (long)var2_3 ^ 4599042048965201265L);
                    var3_4 = var2_3 ^ -1866098150;
                    ++var4_2;
                    continue block31;
                }
                case 1888549548: {
                    (Integer.rotateLeft(-12254339 ^ var2_3, 18) - -306640034) * -12254339;
                    (int)(4465228046618913615L ^ (long)var2_3 ^ -6345427726505486786L);
                    var3_4 = (var2_3 ^ -1981889753) + -1869378585 - -1869378585;
                    (Integer.rotateLeft(58616020 ^ var2_3, 3) - 1890341095) * 58616021;
                    try {
                        var4_2 -= 5;
                        if ((3460327489524229535L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var3_4 = var2_3 ^ -1866098150;
                    }
                    catch (IllegalStateException v7) {
                        var3_4 = (var2_3 ^ -1866098150) + 1039779373 - 1039779373;
                    }
                    var4_2 += 4;
                }
            }
            (Integer.rotateRight(-79009838 ^ var2_3, 18) + 1918906793) * -79009837;
            var3_4 = var2_3 ^ -1866098150 ^ 1786961668 ^ 1786961668;
        }
    }

    private boolean zh_4() {
        int n = bkm.sdhs_4(1131357611);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x42C2FE7A;
        if ((n2 ^ n) != 1120075386) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x1ADDBD1 ^ n, 3) + 946552202) * 28171217;
            int cfr_ignored_1 = (int)(0xC31F75EC27D4EB4FL ^ (long)n ^ 0x16A8831A2DB82BEFL);
        }
        return !this.thzd_4.shzl() && !this.zath_2.shzl();
    }

    private boolean jdhn() {
        int n = -485327316;
        n = Integer.rotateLeft(n * -119231357, 18) ^ 0x297A29B2;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x86C4B5BF;
        if ((n2 ^ n) != -2033928769) {
            int cfr_ignored_0 = (0x65D6CB93 ^ n) + 2011966718;
        }
        return !this.thzd_4.shzl();
    }

    private boolean dhw_2() {
        int n = -1613793323;
        int n2 = (n = Integer.rotateLeft(n * 649925959, 12) ^ 0x4F77C6B5) ^ 0x2056985;
        if ((n2 ^ n) != 33909125) {
            int cfr_ignored_0 = (0x9DCA1E50 ^ n) - -1502751047;
        }
        return !this.zath_2.shzl();
    }

    private boolean sdsh_2() {
        try {
            int n = 2021568634;
            n = Integer.rotateLeft(n * -1949871035, 21) ^ 0xD23C5B45;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xAAD91771;
            if ((n2 ^ n) != -1428613263) {
                int cfr_ignored_0 = (0xD2A7A70B ^ n) - -1247111216;
            }
            if ((0x3C2 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.zath_2.shzl();
    }

    private boolean srk_2() {
        int n = -243430320;
        n = Integer.rotateLeft(n * -1544055813, 4) ^ 0x2EA99CEE;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x69ECA957;
        if ((n2 ^ n) != 1777117527) {
            int cfr_ignored_0 = (0x98912507 ^ n) - -1228074641;
        }
        return !this.zath_2.shzl();
    }

    private boolean zkn_2() {
        int n = 1120336802;
        n = Integer.rotateLeft(n * -1552490949, 16) ^ 0x4D1CB227;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xC2876AFC;
        if ((n2 ^ n) != -1031312644) {
            int cfr_ignored_0 = (0x8041915E ^ n) - -1848418853;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return !this.zath_2.shzl();
    }

    private boolean bqdh() {
        int n = bkm.sdhs_4(2125731605);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x5D18D721;
        if ((n2 ^ n) != 1561909025) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x23ACC034 ^ n, 7) - 1447617927) * 598523957;
        }
        return !this.sdz.shzl();
    }

    private boolean hzq() {
        int n = -1754728617;
        n = Integer.rotateLeft(n * 667563043, 27) ^ 0xC35CE2DC;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 29);
        int n2 = n ^ 0xF001F42C;
        if ((n2 ^ n) != -268307412) {
            int cfr_ignored_0 = (0x6769037B ^ n) - -419533568;
        }
        return !this.khln.shzl();
    }

    private boolean dhrz() {
        int n = -1567257013;
        n = Integer.rotateLeft(n * 1357371757, 11) ^ 0x4388C118;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 19);
        int n2 = n ^ 0xFC454181;
        if ((n2 ^ n) != -62570111) {
            int cfr_ignored_0 = (0x5ED0CFCA ^ n) - 599151708;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.zghj.shzl();
    }

    private boolean shrd_2() {
        block0: {
            int n = -615343121;
            n = Integer.rotateLeft(n * 1386984519, 26) ^ 0xE038CF5B;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x30378445;
            if ((n2 ^ n) == 808944709) break block0;
            int cfr_ignored_0 = (0xEB651FAA ^ n) - -1994796469;
        }
        return this.dhqr.shghkh();
    }

    private static String jtt_2(String string, int n, int n2, int n3) {
        int n4 = 1977992463;
        n4 = Integer.rotateLeft(n4 * 143248555, 8) ^ 0x184AAB3A;
        n4 = Integer.rotateLeft(n2 ^ n4, 12);
        int n5 = (n4 = n3 ^ n4) ^ 0x458D4788;
        if ((n5 ^ n4) != 1166886792) {
            int cfr_ignored_0 = (0x30688287 ^ n4) + 2030053592;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0xC0A0B26D) + jfs ^ Integer.reverse(n2 + i * -712361471), 5) - khsd_3);
        }
        return new String(cArray);
    }

    private static void dhsz(bsz_3 bsz2) {
        int n = bkm.sdhs_4(-334004070);
        bsz_3 bsz3 = bsz2;
        n = Integer.rotateRight((bsz3 != null ? System.identityHashCode(bsz3) : 0) ^ n, 13);
        int n2 = n ^ 0xF01EAE4;
        if ((n2 ^ n) != 251783908) {
            int cfr_ignored_0 = (Integer.rotateRight(0xE3166A7E ^ n, 15) - -2079030147) * -485070209;
        }
        bsz2.zshgh();
    }

    private static void bbgh(bsz_3 bsz2) {
        int n = bkm.sdhs_4(268931232);
        int n2 = n ^ 0x14D52288;
        if ((n2 ^ n) != 349512328) {
            int cfr_ignored_0 = Integer.rotateLeft(0x4D2B228 ^ n, 3) + -1713294829;
        }
        bsz2.jzh_3();
    }

    private static boolean khds_4() {
        block0: {
            int n = -1851314250;
            int n2 = (n = Integer.rotateLeft(n * 120544351, 20) ^ 0x7324A53B) ^ 0x41F03165;
            if ((n2 ^ n) == 1106260325) break block0;
            int cfr_ignored_0 = (0xD0571ED3 ^ n) - 106768957;
        }
        return yf.dnkh();
    }

    private static void jrk(bsz_3 bsz2) {
        int n = bkm.sdhs_4(1405865621);
        int n2 = n ^ 0x6495EF14;
        if ((n2 ^ n) != 1687547668) {
            int cfr_ignored_0 = Integer.rotateLeft(0x375E2181 ^ n, 9) + -1195135526;
            int cfr_ignored_1 = (int)(0xF5EC8FBC27D4EB4FL ^ (long)n ^ 0xE208831A2DB84608L);
        }
        bsz2.rab();
    }

    private static void hyz_2(bsz_3 bsz2) {
        int n = bkm.sdhs_4(-1078071268);
        int n2 = n ^ 0xFBC9F04;
        if ((n2 ^ n) != 264019716) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xB0016F18 ^ n, 9) + 1418335011) * -1342083303;
        }
        bsz2.zlh_2();
    }

    private static boolean khwa_2(bsz_3 bsz2) {
        block0: {
            int n = 35072042;
            n = Integer.rotateLeft(n * 32075833, 5) ^ 0xA9269140;
            bsz_3 bsz3 = bsz2;
            n = Integer.rotateLeft((bsz3 != null ? System.identityHashCode(bsz3) : 0) ^ n, 3);
            int n2 = n ^ 0x3153EFDB;
            if ((n2 ^ n) == 827584475) break block0;
            int cfr_ignored_0 = (0x3344C7F1 ^ n) + 1910771884;
        }
        return bsz2.rgha_2();
    }

    private static boolean ttd_5(bsz_3 bsz2, class_1309 class_13092) {
        block0: {
            int n = bkm.sdhs_4(2033164670);
            bsz_3 bsz3 = bsz2;
            n = (bsz3 != null ? System.identityHashCode(bsz3) : 0) ^ n;
            class_1309 class_13093 = class_13092;
            n = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 2);
            int n2 = n ^ 0x925BA6C9;
            if ((n2 ^ n) == -1839487287) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xEB7407B7 ^ n, 16) - -2023059868) * -344717385;
        }
        return bsz2.jths(class_13092);
    }

    private static float hdha(bsz_3 bsz2) {
        block0: {
            int n = -940115909;
            int n2 = (n = Integer.rotateLeft(n * -610337045, 12) ^ 0xC4E7A3AC) ^ 0xF11F31DF;
            if ((n2 ^ n) == -249613857) break block0;
            int cfr_ignored_0 = (0x36E9C9E4 ^ n) + -1730192415;
        }
        return bsz2.khdsh();
    }

    private static boolean ghah_2() {
        block0: {
            int n = 1997211740;
            int n2 = (n = Integer.rotateLeft(n * -1594567255, 19) ^ 0x14DBF9B2) ^ 0x845B1FF9;
            if ((n2 ^ n) == -2074402823) break block0;
            int cfr_ignored_0 = (0xF35017A5 ^ n) - -526181649;
        }
        return yf.dnkh();
    }

    private static boolean tdh_8(bsz_3 bsz2) {
        block0: {
            int n = -1826787286;
            n = Integer.rotateLeft(n * 196358961, 8) ^ 0xE340BA23;
            bsz_3 bsz3 = bsz2;
            n = Integer.rotateLeft((bsz3 != null ? System.identityHashCode(bsz3) : 0) ^ n, 16);
            int n2 = n ^ 0xEA6BBD53;
            if ((n2 ^ n) == -362037933) break block0;
            int cfr_ignored_0 = (0x7976CD79 ^ n) - 1853564915;
        }
        return bsz2.rgha_2();
    }

    private static float dna(tay tay2) {
        block0: {
            int n = -2032061916;
            int n2 = (n = Integer.rotateLeft(n * -1324273783, 4) ^ 0xE91A6DC5) ^ 0x87522A2E;
            if ((n2 ^ n) == -2024658386) break block0;
            int cfr_ignored_0 = (0x1B3180A ^ n) - 831946442;
        }
        return tay2.thw_5();
    }

    private static class_243 shd_9(class_746 class_7462) {
        block0: {
            int n = 708206387;
            int n2 = (n = Integer.rotateLeft(n * 645592767, 5) ^ 0x1509E1C8) ^ 0x8D78DF0A;
            if ((n2 ^ n) == -1921458422) break block0;
            int cfr_ignored_0 = (0xA74E8039 ^ n) + -1357940321;
        }
        return class_7462.method_33571();
    }

    private static class_238 khaw_2(class_1309 class_13092) {
        block0: {
            int n = 250386526;
            n = Integer.rotateLeft(n * -694014705, 18) ^ 0x38CB2A10;
            class_1309 class_13093 = class_13092;
            n = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 17);
            int n2 = n ^ 0x436A75FA;
            if ((n2 ^ n) == 1131050490) break block0;
            int cfr_ignored_0 = (0x4D86EDA4 ^ n) + -1073208160;
        }
        return class_13092.method_5829();
    }

    private static float jta_2(float f) {
        block0: {
            int n = -679686964;
            n = Integer.rotateLeft(n * -700305665, 20) ^ 0x2787CE20;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 19);
            int n2 = n ^ 0x54A8FC75;
            if ((n2 ^ n) == 1420360821) break block0;
            int cfr_ignored_0 = (0x83D430B9 ^ n) + -23730348;
        }
        return class_3532.method_27285((float)f);
    }

    private static boolean ryd(bsz_3 bsz2, class_1309 class_13092) {
        block0: {
            int n = 1633473649;
            n = Integer.rotateLeft(n * -1346049785, 6) ^ 0xE9CB4D84;
            bsz_3 bsz3 = bsz2;
            n = Integer.rotateRight((bsz3 != null ? System.identityHashCode(bsz3) : 0) ^ n, 17);
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0xE341171F;
            if ((n2 ^ n) == -482273505) break block0;
            int cfr_ignored_0 = (0x821DC36E ^ n) - 539246733;
        }
        return bsz2.dss_2(class_13092);
    }

    private static class_243 dlth_2(float f, float f2) {
        block0: {
            int n = -569900714;
            n = Integer.rotateLeft(n * 2053496097, 3) ^ 0x2074705A;
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 18);
            int n2 = n ^ 0x43D3F969;
            if ((n2 ^ n) == 1137965417) break block0;
            int cfr_ignored_0 = (0x9DDBF83F ^ n) - 196131847;
        }
        return bsz_3.shht_2(f, f2);
    }

    private static void zns_3(class_746 class_7462, class_1268 class_12682) {
        int n = -1980098881;
        n = Integer.rotateLeft(n * -935244067, 17) ^ 0x43E698FE;
        class_746 class_7463 = class_7462;
        n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 3);
        class_1268 class_12683 = class_12682;
        n = (class_12683 != null ? System.identityHashCode(class_12683) : 0) ^ n;
        int n2 = n ^ 0x53198B15;
        if ((n2 ^ n) != 1394182933) {
            int cfr_ignored_0 = (0xDAE39DAA ^ n) - -831359820;
        }
        class_7462.method_6104(class_12682);
    }

    private static void tssh(class_746 class_7462) {
        int n = bkm.sdhs_4(144776533);
        class_746 class_7463 = class_7462;
        n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
        int n2 = n ^ 0xFCCB552E;
        if ((n2 ^ n) != -53783250) {
            int cfr_ignored_0 = (Integer.rotateRight(0xF46A487B ^ n, 17) + -1656986080) * -194361221;
        }
        class_7462.method_7350();
    }

    private static boolean ttt_2(bsz_3 bsz2) {
        block0: {
            int n = 1002245302;
            n = Integer.rotateLeft(n * -1970640987, 10) ^ 0x6E188DE1;
            bsz_3 bsz3 = bsz2;
            n = (bsz3 != null ? System.identityHashCode(bsz3) : 0) ^ n;
            int n2 = n ^ 0xC8A4F3F2;
            if ((n2 ^ n) == -928713742) break block0;
            int cfr_ignored_0 = (0xF319FF44 ^ n) - -1673088808;
        }
        return bsz2.rgha_2();
    }

    private static boolean sda(bsz_3 bsz2, class_1309 class_13092) {
        block0: {
            int n = 2071271026;
            n = Integer.rotateLeft(n * -1428368425, 4) ^ 0xA0E7FDCA;
            bsz_3 bsz3 = bsz2;
            n = (bsz3 != null ? System.identityHashCode(bsz3) : 0) ^ n;
            int n2 = n ^ 0xDA2E3F3E;
            if ((n2 ^ n) == -634503362) break block0;
            int cfr_ignored_0 = (0xA15B294C ^ n) + 1459002436;
        }
        return bsz2.jths(class_13092);
    }

    private static float shwy(bsz_3 bsz2, class_1297 class_12972) {
        block0: {
            int n = 2042853352;
            int n2 = (n = Integer.rotateLeft(n * -1213665855, 22) ^ 0x98ACBB53) ^ 0xBD56FBDD;
            if ((n2 ^ n) == -1118372899) break block0;
            int cfr_ignored_0 = (0xC4958C35 ^ n) - 832938238;
        }
        return bsz2.shjn(class_12972);
    }

    private static class_238 bhm(class_1309 class_13092) {
        block0: {
            int n = -516166296;
            int n2 = (n = Integer.rotateLeft(n * -183888137, 20) ^ 0x777B86A) ^ 0xE8DB802E;
            if ((n2 ^ n) == -388267986) break block0;
            int cfr_ignored_0 = (0x9E06D46 ^ n) + 1532488992;
        }
        return class_13092.method_5829();
    }

    private static boolean tjz_4(bsz_3 bsz2, class_238 class_2383, class_243 class_2432, class_243 class_2433, double d) {
        block0: {
            int n = 1213658452;
            n = Integer.rotateLeft(n * -1472875707, 9) ^ 0xE650D261;
            bsz_3 bsz3 = bsz2;
            n = (bsz3 != null ? System.identityHashCode(bsz3) : 0) ^ n;
            class_243 class_2434 = class_2432;
            n = Integer.rotateRight((class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n, 2);
            int n2 = n ^ 0x4354F467;
            if ((n2 ^ n) == 1129641063) break block0;
            int cfr_ignored_0 = (0xB020133 ^ n) + 1513820008;
        }
        return bsz2.ghsy_2(class_2383, class_2432, class_2433, d);
    }

    private static class_238 shbt(class_238 class_2383, double d) {
        block0: {
            int n = -1849805185;
            n = Integer.rotateLeft(n * -1335671935, 9) ^ 0xB0FF96B8;
            class_238 class_2384 = class_2383;
            n = (class_2384 != null ? System.identityHashCode(class_2384) : 0) ^ n;
            int n2 = n ^ 0xE5EAFB54;
            if ((n2 ^ n) == -437585068) break block0;
            int cfr_ignored_0 = (0x7454CD2B ^ n) - 2147144001;
        }
        return bsz_3.thml(class_2383, d);
    }

    private static class_238 tfs_2(class_1309 class_13092) {
        block0: {
            int n = -720145402;
            int n2 = (n = Integer.rotateLeft(n * -768759263, 27) ^ 0x768D5E14) ^ 0xB08E9D4C;
            if ((n2 ^ n) == -1332830900) break block0;
            int cfr_ignored_0 = (0x659DE94A ^ n) + 1467998835;
        }
        return class_13092.method_5829();
    }

    private static class_243 rsh_2(class_746 class_7462) {
        block0: {
            int n = 1788696884;
            int n2 = (n = Integer.rotateLeft(n * 1291779763, 11) ^ 0x4A60BD29) ^ 0xFC58C121;
            if ((n2 ^ n) == -61292255) break block0;
            int cfr_ignored_0 = (0x96C59815 ^ n) - 1962657122;
        }
        return class_7462.method_33571();
    }

    private static float twr(tay tay2) {
        block0: {
            int n = bkm.sdhs_4(833022892);
            tay tay3 = tay2;
            n = Integer.rotateRight((tay3 != null ? System.identityHashCode(tay3) : 0) ^ n, 9);
            int n2 = n ^ 0x98DC365D;
            if ((n2 ^ n) == -1730398627) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xA97ADDF1 ^ n, 8) + -1975615638) * -1451565583;
            int cfr_ignored_1 = (int)(0x6BC873CC27D4EB4FL ^ (long)n ^ 0x1AE8831A2DB97A41L);
        }
        return tay2.thw_5();
    }

    private static class_243 ghzn(class_243 class_2432, double d) {
        block0: {
            int n = 1759317685;
            n = Integer.rotateLeft(n * -38396055, 4) ^ 0xC15E0332;
            class_243 class_2433 = class_2432;
            n = Integer.rotateRight((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 28);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 11);
            int n2 = n ^ 0x346BE40A;
            if ((n2 ^ n) == 879485962) break block0;
            int cfr_ignored_0 = (0x5CB6EABF ^ n) - -1374968902;
        }
        return class_2432.method_1021(d);
    }

    private static class_238 khjt(class_238 class_2383, double d) {
        block0: {
            int n = -2005916397;
            n = Integer.rotateLeft(n * 805058593, 4) ^ 0xC9049B89;
            class_238 class_2384 = class_2383;
            n = (class_2384 != null ? System.identityHashCode(class_2384) : 0) ^ n;
            int n2 = n ^ 0x19D626A2;
            if ((n2 ^ n) == 433464994) break block0;
            int cfr_ignored_0 = (0x91A603B1 ^ n) + -1490572979;
        }
        return bsz_3.thml(class_2383, d);
    }

    private static Optional thja(class_238 class_2383, class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = bkm.sdhs_4(909389064);
            class_238 class_2384 = class_2383;
            n = Integer.rotateRight((class_2384 != null ? System.identityHashCode(class_2384) : 0) ^ n, 11);
            int n2 = n ^ 0xFC29353D;
            if ((n2 ^ n) == -64408259) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xCA1D1835 ^ n, 12) - 2112064934) * -904062923;
            int cfr_ignored_1 = (int)(0x8AFB60827D4EB4FL ^ (long)n ^ 0x9160831A2DB9BC8EL);
        }
        return class_2383.method_992(class_2432, class_2433);
    }

    private static double aghh(long l) {
        block0: {
            int n = 710784415;
            n = Integer.rotateLeft(n * 1228543343, 22) ^ 0xF2C3835C;
            int n2 = (n = (int)l ^ n) ^ 0x7789D526;
            if ((n2 ^ n) == 2005521702) break block0;
            int cfr_ignored_0 = (0x5DD460B9 ^ n) - -127355321;
        }
        return Double.longBitsToDouble(l);
    }

    private static double rdkh_2(double d, double d2) {
        block0: {
            int n = 1747174474;
            n = Integer.rotateLeft(n * -945171183, 8) ^ 0xCC36046C;
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0xFA74C4B;
            if ((n2 ^ n) == 262622283) break block0;
            int cfr_ignored_0 = (0x67848801 ^ n) + 1491578291;
        }
        return Math.min(d, d2);
    }

    private static String[] shbs(String string) {
        block0: {
            int n = 650917548;
            n = Integer.rotateLeft(n * -1653154609, 21) ^ 0xC1E2CD5F;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xE51B0816;
            if ((n2 ^ n) == -451213290) break block0;
            int cfr_ignored_0 = (0xC3D73EBA ^ n) - 1813724143;
        }
        return string.split("\u0006\u0018", -1);
    }

    private static CallSite akhl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1380596455;
            n3 = Integer.rotateLeft(n3 * 544479273, 6) ^ 0xB9B0727D;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 10);
            int n4 = n3 ^ 0x68E5A811;
            if ((n4 ^ n3) != 1759881233) {
                int cfr_ignored_0 = (0x3AAF92F6 ^ n3) - 568812286;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ jhth ^ string.hashCode() ^ n2 + sk_2 + i * -4291647) + jhth) ^ sk_2));
            }
            String[] stringArray = bsz_3.shbs(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType3) : lookup.findVirtual(clazz, stringArray[3], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] y0jw5jmnnk(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite rtrni42u(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ wqdxd04u ^ string.hashCode()) + (n2 + zvkb0y2qr2cm) + i ^ wqdxd04u, 7) + zvkb0y2qr2cm);
            }
            String[] stringArray = bsz_3.y0jw5jmnnk(new String(cArray));
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

