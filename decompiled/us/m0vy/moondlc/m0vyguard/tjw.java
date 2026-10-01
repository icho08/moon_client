/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1297
 *  net.minecraft.class_1937
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bdhth;
import us.m0vy.moondlc.m0vyguard.bzk;
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
import us.m0vy.moondlc.m0vyguard.zj;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="World Particles", category=bzw.OTHER, desc="Animated ambient particles with block collisions")
public final class tjw
extends bnq {
    private static final int thr_2 = 12;
    private static final int jf = 8;
    private static final int thd_5 = 18;
    private static final double dbh = 0.012;
    private static final bzk[] bdsh;
    private final khd zyd = new khd(this, "Part".concat("icle Type"));
    private final fy stgh_3 = new fy(this.zyd, "Star");
    private final fy qh_2 = new fy(this.zyd, "Heart");
    private final fy jdh_2 = new fy(this.zyd, "Bloom");
    private final fy khal_2 = new fy(this.zyd, "Snowflake");
    private final fy khnj = new fy(this.zyd, "Spark");
    private final fy thzj = new fy(this.zyd, "Rhombus");
    private final fy dhzl = new fy(this.zyd, "Random");
    private final tay dhkj = new tay(this, "Amount").shth_7(Float.intBitsToFloat(Integer.reverse(-8465568) ^ 0x47EB7EFF)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x23A9F6EA ^ 0x2BDB36EA, 3))).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(1719028884 + -599936148));
    private final tay std_5 = new tay(this, "Size").shth_7(Float.intBitsToFloat(Integer.reverse(-586775346) ^ 0x4E6DAC76)).dhbs_2(Float.intBitsToFloat(Integer.reverse(963396007) ^ 0xDAC2369C)).rkh_3(Float.intBitsToFloat(Integer.reverse(-1593809968) ^ 0x37E5D78F)).ssd_5(Float.intBitsToFloat(640767088 - -405795646));
    private final tay zdhs = new tay(this, "Speed").shth_7(Float.intBitsToFloat(744692751 - -255900411)).dhbs_2(Float.intBitsToFloat(0xBBA864E8 ^ 0x865DA667)).rkh_3(Float.intBitsToFloat(Integer.reverse(1549302975) ^ 0xC69DCD30)).ssd_5(Float.intBitsToFloat(-1356254755 - 1915973454));
    private final tay sbd_3 = new tay(this, "Gravity").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x86A6D078 ^ 0xD743CEC0, 5))).rkh_3(Float.intBitsToFloat(1467521949 - 485853486)).ssd_5(0.0f);
    private final tay dhwb = new tay(this, "Lifetime").shth_7(Float.intBitsToFloat(-635842286 + 0x66262EEE)).dhbs_2(Float.intBitsToFloat(306299781 + 799947899)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(620311144 - -476499352)).ghshz_2("s");
    private final tay dghn = new tay(this, "Spawn D".concat("istance")).shth_7(Float.intBitsToFloat(0xE5C80E58 ^ 0xA5480E58)).dhbs_2(Float.intBitsToFloat(-580640126 - -1687936382)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(1356567361 + -260805441));
    private final tay jtn = new tay(this, "Maximum Distance").shth_7(Float.intBitsToFloat(0x254368A ^ 0x4314368A)).dhbs_2(Float.intBitsToFloat(743094749 + 376784419)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(-999581350 - -2108450470));
    private final tay mm = new tay(this, "Vertic".concat("al Range")).shth_7(2.0f).dhbs_2(Float.intBitsToFloat(1819072752 + -715970800)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.reverse(-1250318346) ^ 0x2EE59EAD));
    private final tay thql = new tay(this, "Air Resis".concat("tance")).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x6817436A ^ 0x5B247291, 21))).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(-1557571322 - 1736802812)).ssd_5(Float.intBitsToFloat(1166964882 - 101863324));
    private final tay yz_2 = new tay(this, "Rotati".concat("on Speed")).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(0x9AB5618D ^ 0xDBF5618D)).rkh_3(Float.intBitsToFloat(393079272 - -663885336)).ssd_5(Float.intBitsToFloat(0xA676890 ^ 0x4A076890));
    private final badh_2 tzt = new badh_2(this, "Block Collision").bts(true);
    private final tay shdhl = new tay((hy)this, "Bounciness", this::jtk).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x5D2982BC ^ 0xC48E3B25, 11))).dhbs_2(Float.intBitsToFloat(Integer.reverse(617652284) ^ 0x3763817)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x627F88D5 ^ 0xC5D6114C, 3))).ssd_5(Float.intBitsToFloat(Integer.reverse(-1319174172) ^ 0x18E1C2DF));
    private final tay thhk = new tay((hy)this, "Surface Friction", this::dkhz_2).shth_7(Float.intBitsToFloat(-1231578716 + -2009779415)).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(-1514311912 - 1752212043)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x887E6200 ^ 0xC7AA18E1, 2)));
    private final badh_2 dhbd_2 = new badh_2(this, "Glow").bts(true);
    private final tay sthr = new tay((hy)this, "Glow Strength", this::zqr).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x35878EE1 ^ 0xD3E1E87F, 25))).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(70232951 - -958210390)).ssd_5(Float.intBitsToFloat(-92223837 + 1147510723));
    private final khd bdhq = new khd(this, "Color Mode");
    private final fy hdj = new fy(this.bdhq, "Theme");
    private final fy rdj = new fy(this.bdhq, "Custom");
    private final fy szz_4 = new fy(this.bdhq, "Rainbow");
    private final bzw_2 shjy = new bzw_2(this, "Color", this::dsh_6).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(38908257) ^ 0xC5C78A40), Float.intBitsToFloat(Integer.rotateLeft(0x953A794 ^ 0x95795E4, 12)), Float.intBitsToFloat(1647183783 + -514787239), Float.intBitsToFloat(Integer.rotateLeft(0x4705AC81 ^ 0xB905AC07, 23))));
    private final ArrayList sshsh = new ArrayList(Integer.rotateLeft(0xC2E98E96 ^ 0x2E98E84, 4));
    private final bql<btt> dsdh_2 = this::swf;
    private final bql<shw_3> dhtq_2 = this::hlf;
    private static final int khty = 326353009;
    private static final int jas_3 = -1685967009;
    private static final int bgh = -1285078125;
    private static final int khzb = 984790294;
    private static final int chyp1nm4hnzeg = -512573891;
    private static final int r7b2etrep2 = -101391379;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int xm2y1ree8bkqyk;

    @Override
    public void nt() {
        int n = bdhth.thwq(268930047);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
        int n2 = n ^ 0xB75BA844;
        if ((n2 ^ n) != -1218729916) {
            int cfr_ignored_0 = (Integer.rotateRight(0xA75C23BB ^ n, 7) + 1216738016) * -1487133765;
        }
        this.sshsh.clear();
    }

    @Override
    public void nc() {
        int n = -2068019128;
        n = Integer.rotateLeft(n * 1461637141, 17) ^ 0xB901FD53;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 19);
        int n2 = n ^ 0xBA08EFEB;
        if ((n2 ^ n) != -1173819413) {
            int cfr_ignored_0 = (0x3EB467A3 ^ n) - 1441587119;
        }
        tjw.dhjkh(this.sshsh);
    }

    private void skhm() {
        if (tjw.mc.field_1724 == null || tjw.mc.field_1687 == null) {
            this.sshsh.clear();
            return;
        }
        try {
            int n = Math.round(this.dhkj.thw_5());
            this.shshsh(n);
            double d = Math.max((double)this.jtn.thw_5(), (double)this.dghn.thw_5() + 2.0);
            double d2 = d * d;
            double d3 = this.zdhs.thw_5();
            double d4 = Math.max(0.035, d3 * 2.6);
            double d5 = this.sbd_3.thw_5();
            double d6 = this.thql.thw_5();
            double d7 = this.yz_2.thw_5();
            int n2 = Math.max(20, Math.round(this.dhwb.thw_5() * 20.0f));
            class_243 class_2432 = tjw.mc.field_1724.method_19538();
            Iterator iterator = this.sshsh.iterator();
            while (iterator.hasNext()) {
                zj zj2 = (zj)iterator.next();
                if (!zj2.adz_4((class_1937)tjw.mc.field_1687, (class_1297)tjw.mc.field_1724, class_2432.field_1352, class_2432.field_1351, class_2432.field_1350, d2, d3, d4, d5, d6, d7, this.tzt.shzl(), this.shdhl.thw_5(), this.thhk.thw_5())) continue;
                iterator.remove();
            }
            int n3 = n - this.sshsh.size();
            for (int i = 0; i < Math.min(n3, 12); ++i) {
                this.dfgh(class_2432, n2);
            }
        }
        catch (RuntimeException runtimeException) {
            this.sshsh.clear();
            Moondlc.dhrn.error("Unable to update World Particles; the particle cache was cleared.", (Throwable)runtimeException);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void shshsh(int var1_1) {
        var2_2 = 0;
        var5_3 = 0;
        var3_4 = -1158128756;
        var3_4 = Integer.rotateLeft(var3_4 * 1912712135, 21) ^ -1084279219;
        var3_4 = System.identityHashCode(this) ^ var3_4;
        var3_4 = Integer.rotateLeft(var1_1 ^ var3_4, 8);
        var4_5 = (565592401 * 125949485 + 863113197 ^ var3_4) + 1467146707 - 1467146707;
        while (true) {
            block45: {
                block54: {
                    block46: {
                        block49: {
                            block52: {
                                block48: {
                                    block51: {
                                        block50: {
                                            block47: {
                                                block43: {
                                                    block55: {
                                                        block44: {
                                                            block53: {
                                                                var5_3 = ((var4_5 ^ var3_4) - 863113197) * -2111116891;
                                                                switch (var5_3 & 7) {
                                                                    case 0: {
                                                                        if (var5_3 != 1609998056) {
                                                                            ** break;
                                                                        }
                                                                        break block43;
                                                                    }
                                                                    case 1: {
                                                                        if (var5_3 == 565592401) break;
                                                                        if (var5_3 == -875309439) break block44;
                                                                        if (var5_3 != 615887857) {
                                                                            ** break;
                                                                        }
                                                                        break block45;
                                                                    }
                                                                    case 2: {
                                                                        if (var5_3 == -936437358) break block46;
                                                                        if (var5_3 != -864063390) {
                                                                            Integer.rotateRight(963912515 ^ var3_4, 10) + -110238632;
                                                                            ** break;
                                                                        }
                                                                        break block47;
                                                                    }
                                                                    case 3: {
                                                                        if (var5_3 != 835430219) {
                                                                            ** break;
                                                                        }
                                                                        break block48;
                                                                    }
                                                                    case 5: {
                                                                        if (var5_3 == -257666795) break block49;
                                                                        if (var5_3 != -1036848123) {
                                                                            (Integer.rotateRight(549152595 ^ var3_4, 7) + -82894264) * 549152595;
                                                                            ** break;
                                                                        }
                                                                        break block50;
                                                                    }
                                                                    case 6: {
                                                                        if (var5_3 != -129567074) {
                                                                            ** break;
                                                                        }
                                                                        break block51;
                                                                    }
                                                                    case 7: {
                                                                        if (var5_3 == -800369945) break block52;
                                                                        if (var5_3 == -429366937) break block53;
                                                                        (Integer.rotateRight(1889267606 ^ var3_4, 17) - -1489001883) * 1889267607;
                                                                        if (var5_3 == -1650307193) break block54;
                                                                        if (var5_3 != 66452735) {
                                                                            ** break;
                                                                        }
                                                                        break block55;
                                                                    }
                                                                }
                                                                (Integer.rotateLeft(1599215805 ^ var3_4, 14) - -1890673122) * 1599215805;
                                                                (int)(-7070450753431344305L ^ (long)var3_4 ^ -8038781186396875248L);
                                                                var2_2 = this.sshsh.size() - 1;
                                                                try {
                                                                    var5_3 += 4;
                                                                    var4_5 = -429366937 * 125949485 + 863113197 ^ var3_4;
                                                                }
                                                                catch (IllegalArgumentException v0) {
                                                                    var4_5 = (int)((long)(-429366937 * 125949485 + 863113197 ^ var3_4) ^ 7825324693403913534L ^ 7825324693403913534L);
                                                                }
                                                                var5_3 += 2;
                                                                continue;
                                                            }
                                                            Integer.rotateRight(311507875 ^ var3_4, 5) + 1140054008;
                                                            if (var2_2 >= var1_1) {
                                                                (int)(-6491392098764903528L ^ (long)var3_4 ^ 2305299977910806018L);
                                                                var4_5 = 0x29C9C229 * 125949485 + 863113197 ^ var3_4 ^ -995741892 ^ -995741892;
                                                                (int)(-1771899322644930584L ^ (long)var3_4 ^ 1772346014225031936L);
                                                                var4_5 = (int)((long)(-875309439 * 125949485 + 863113197 ^ var3_4) ^ 6771667508543463764L ^ 6771667508543463764L);
                                                                var5_3 += 3;
                                                                continue;
                                                            }
                                                            (int)(3796356206166023431L ^ (long)var3_4 ^ 5099981828507944079L);
                                                            var4_5 = (int)((long)(-341044098 * 125949485 + 863113197 ^ var3_4) ^ 4194917989470589597L ^ 4194917989470589597L);
                                                            (int)(-4322557654583790716L ^ (long)var3_4 ^ -7197079353871686185L);
                                                            var4_5 = Integer.reverse(Integer.reverse(66452735 * 125949485 + 863113197 ^ var3_4));
                                                            var5_3 += 5;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(-2054288002 ^ var3_4, 3) - 814825853) * -2054288001;
                                                        this.sshsh.remove(var2_2);
                                                        --var2_2;
                                                        var4_5 = -429366937 * 125949485 + 863113197 ^ var3_4;
                                                        (Integer.rotateLeft(239113724 ^ var3_4, 4) - -1104164673) * 239113725;
                                                        continue;
                                                    }
                                                    Integer.rotateRight(228576931 ^ var3_4, 4) + -1430805256;
                                                    return;
                                                }
                                                Integer.rotateLeft(-1273599324 ^ var3_4, 9) - -753628905;
                                                try {
                                                    var5_3 -= 2;
                                                    if ((7294222006730544623L ^ (long)var3_4 | 1L) == 0L) {
                                                        throw new ArithmeticException();
                                                    }
                                                    var4_5 = (565592401 * 125949485 + 863113197 ^ var3_4) + 343499772 - 343499772;
                                                }
                                                catch (ArithmeticException v1) {
                                                    var4_5 = (int)((long)(565592401 * 125949485 + 863113197 ^ var3_4) ^ -2920968716840464760L ^ -2920968716840464760L);
                                                }
                                                var5_3 -= 3;
                                                continue;
                                            }
                                            Integer.rotateRight(324285838 ^ var3_4, 5) - 1536170861;
                                            var4_5 = (-765958613 * 125949485 + 863113197 ^ var3_4) + 1018832612 - 1018832612;
                                            (Integer.rotateRight(822047738 ^ var3_4, 9) + -213079423) * 822047739;
                                            try {
                                                if ((8040468552784238737L ^ (long)var3_4 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                var4_5 = 565592401 * 125949485 + 863113197 ^ var3_4;
                                            }
                                            catch (NoSuchElementException v2) {
                                                var4_5 = 565592401 * 125949485 + 863113197 ^ var3_4 ^ 2066296416 ^ 2066296416;
                                            }
                                            continue;
                                        }
                                        (Integer.rotateLeft(513858708 ^ var3_4, 6) - -1177004761) * 513858709;
                                        var4_5 = 1397853324 * 125949485 + 863113197 ^ var3_4;
                                        Integer.rotateLeft(284115113 ^ var3_4, 5) + 290878386;
                                        (int)(-3288209832819758257L ^ (long)var3_4 ^ 2330756955623655786L);
                                        var4_5 = (int)((long)(1321627315 * 125949485 + 863113197 ^ var3_4) ^ -7236386360945315080L ^ -7236386360945315080L);
                                        (Integer.rotateRight(-817914126 ^ var3_4, 12) + 487710345) * -817914125;
                                        var4_5 = 565592401 * 125949485 + 863113197 ^ var3_4;
                                        --var5_3;
                                        continue;
                                    }
                                    (Integer.rotateRight(836152922 ^ var3_4, 9) + 224181281) * 836152923;
                                    var4_5 = Integer.reverse(Integer.reverse(-1363135106 * 125949485 + 863113197 ^ var3_4));
                                    Integer.rotateRight(1239884678 ^ var3_4, 12) - -145036171;
                                    try {
                                        var5_3 += 4;
                                        if ((-237365458163719675L ^ (long)var3_4 | 1L) == 0L) {
                                            throw new IllegalStateException();
                                        }
                                        var4_5 = Integer.reverse(Integer.reverse(565592401 * 125949485 + 863113197 ^ var3_4));
                                    }
                                    catch (IllegalStateException v3) {
                                        var4_5 = 565592401 * 125949485 + 863113197 ^ var3_4 ^ 1389036945 ^ 1389036945;
                                    }
                                    var5_3 += 3;
                                    continue;
                                }
                                (Integer.rotateRight(312491575 ^ var3_4, 5) - 1170548708) * 312491575;
                                var4_5 = -1476637173 * 125949485 + 863113197 ^ var3_4 ^ -911911689 ^ -911911689;
                                (Integer.rotateLeft(-1052264140 ^ var3_4, 11) - 1812794503) * -1052264139;
                                try {
                                    var5_3 -= 2;
                                    var4_5 = Integer.reverse(Integer.reverse(565592401 * 125949485 + 863113197 ^ var3_4));
                                }
                                catch (NoSuchElementException v4) {
                                    var4_5 = (int)((long)(565592401 * 125949485 + 863113197 ^ var3_4) ^ 2193498065856257545L ^ 2193498065856257545L);
                                }
                                var5_3 -= 2;
                                continue;
                            }
                            (Integer.rotateRight(1187605562 ^ var3_4, 11) + -1765688767) * 1187605563;
                            try {
                                ++var5_3;
                                if ((4140429919692040009L ^ (long)var3_4 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                var4_5 = 565592401 * 125949485 + 863113197 ^ var3_4;
                            }
                            catch (IllegalStateException v5) {
                                var4_5 = 565592401 * 125949485 + 863113197 ^ var3_4 ^ 2026337471 ^ 2026337471;
                            }
                            --var5_3;
                            continue;
                        }
                        Integer.rotateLeft(-1432693079 ^ var3_4, 8) + -1390568014;
                        (int)(7505381356731689807L ^ (long)var3_4 ^ 889605074865192321L);
                        var4_5 = (-2049998206 * 125949485 + 863113197 ^ var3_4) + -1480502372 - -1480502372;
                        (Integer.rotateLeft(-424861287 ^ var3_4, 15) + -212553534) * -424861287;
                        (int)(2602957044849109839L ^ (long)var3_4 ^ -2145821073982495250L);
                        try {
                            if ((710701550483001131L ^ (long)var3_4 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            var4_5 = Integer.reverse(Integer.reverse(565592401 * 125949485 + 863113197 ^ var3_4));
                        }
                        catch (NoSuchElementException v6) {
                            var4_5 = (565592401 * 125949485 + 863113197 ^ var3_4) + 1117077090 - 1117077090;
                        }
                        var5_3 += 5;
                        continue;
                    }
                    Integer.rotateRight(1129882083 ^ var3_4, 11) + 739850680;
                    try {
                        var5_3 += 4;
                        if ((-1455572321440814051L ^ (long)var3_4 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var4_5 = Integer.reverse(Integer.reverse(565592401 * 125949485 + 863113197 ^ var3_4));
                    }
                    catch (ArithmeticException v7) {
                        var4_5 = 565592401 * 125949485 + 863113197 ^ var3_4 ^ 2040866897 ^ 2040866897;
                    }
                    continue;
                }
                Integer.rotateLeft(999750189 ^ var3_4, 10) - 1000729262;
                (int)(-494177630739436721L ^ (long)var3_4 ^ 6147557639820173209L);
                var4_5 = -598120565 * 125949485 + 863113197 ^ var3_4;
                (Integer.rotateLeft(-2126529416 ^ var3_4, 3) + -1424657981) * -2126529415;
                var4_5 = (565592401 * 125949485 + 863113197 ^ var3_4) + 1579840257 - 1579840257;
                Integer.rotateLeft(-661579003 ^ var3_4, 14) - 1039131862;
                (int)(1883548321962060623L ^ (long)var3_4 ^ -7565903225522906730L);
                var5_3 += 4;
                continue;
            }
            Integer.rotateLeft(1689373125 ^ var3_4, 15) - 904203798;
            (int)(-6484224722965566641L ^ (long)var3_4 ^ 3639052647374840279L);
            var4_5 = Integer.reverse(Integer.reverse(1723912306 * 125949485 + 863113197 ^ var3_4));
            (Integer.rotateLeft(715685369 ^ var3_4, 8) + 784654434) * 715685369;
            (int)(-1721831068080477361L ^ (long)var3_4 ^ 6555133406097210852L);
            try {
                if ((9103978448088738773L ^ (long)var3_4 | 1L) == 0L) {
                    throw new NoSuchElementException();
                }
                var4_5 = Integer.reverse(Integer.reverse(565592401 * 125949485 + 863113197 ^ var3_4));
            }
            catch (NoSuchElementException v8) {
                var4_5 = 565592401 * 125949485 + 863113197 ^ var3_4 ^ -668893563 ^ -668893563;
            }
            --var5_3;
            continue;
lbl248:
            // 8 sources

            Integer.rotateLeft(-1412895899 ^ var3_4, 8) - -776855434;
            (int)(7600463566068837199L ^ (long)var3_4 ^ 8629041034501390117L);
            var4_5 = 565592401 * 125949485 + 863113197 ^ var3_4 ^ -174430931 ^ -174430931;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void dfgh(class_243 var1_1, int var2_2) {
        var4_3 = 0.0;
        var6_4 = 0.0;
        var8_5 = 0.0;
        var10_6 = 0.0;
        var12_7 = 0.0;
        var14_8 = 0.0;
        var16_9 = 0.0;
        var18_10 = 0.0;
        var20_11 = 0.0;
        var22_12 = 0.0;
        var24_13 = 0.0;
        var28_14 = 0;
        var26_15 = 2009778620;
        var26_15 = Integer.rotateLeft(var26_15 * -865285705, 4) ^ 528222398;
        v0 = var1_1;
        var26_15 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var26_15;
        var26_15 = Integer.rotateRight(var2_2 ^ var26_15, 26);
        var27_16 = Integer.reverse(var26_15 ^ 154261803 ^ 1423916574) ^ 46604025 ^ 46604025;
        while (true) {
            block33: {
                block29: {
                    block31: {
                        block34: {
                            block28: {
                                block27: {
                                    block35: {
                                        block37: {
                                            block30: {
                                                block32: {
                                                    block36: {
                                                        var28_14 = Integer.reverse(var27_16) ^ var26_15 ^ 1423916574;
                                                        switch (var28_14 & 7) {
                                                            case 0: {
                                                                if (var28_14 == -1180330648) break block27;
                                                                if (var28_14 != -1331598232) {
                                                                    (Integer.rotateRight(569340178 ^ var26_15, 7) + 542920809) * 569340179;
                                                                    ** break;
                                                                }
                                                                break block28;
                                                            }
                                                            case 1: {
                                                                if (var28_14 == 1081866945) break block29;
                                                                if (var28_14 == 20024745) break block30;
                                                                (Integer.rotateRight(-438507778 ^ var26_15, 15) - -635594755) * -438507777;
                                                                if (var28_14 == 1337371497) break block31;
                                                                if (var28_14 != 1996286265) {
                                                                    ** break;
                                                                }
                                                                break block32;
                                                            }
                                                            case 2: {
                                                                if (var28_14 != -654459030) {
                                                                    ** break;
                                                                }
                                                                break block33;
                                                            }
                                                            case 3: {
                                                                if (var28_14 == 154261803) break;
                                                                ** break;
                                                            }
                                                            case 5: {
                                                                if (var28_14 == 130748621) break block34;
                                                                if (var28_14 != -721455347) {
                                                                    (Integer.rotateRight(1901758939 ^ var26_15, 17) + -1101770560) * 1901758939;
                                                                    ** break;
                                                                }
                                                                break block35;
                                                            }
                                                            case 6: {
                                                                if (var28_14 == -225348682) break block36;
                                                                if (var28_14 != 160893206) {
                                                                    Integer.rotateRight(145763074 ^ var26_15, 4) + 296932473;
                                                                    ** break;
                                                                }
                                                                break block37;
                                                            }
                                                            case 7: {
                                                                if (var28_14 != 145697463) ** break;
                                                                Integer.rotateRight(-1391788254 ^ var26_15, 8) + -122518439;
                                                                var3_17 = tjw.szh_5();
                                                                var4_3 = this.dghn.thw_5();
                                                                var6_4 = var3_17.nextDouble(var4_3 * tjw.syq_2(-2260107540733792660L ^ -2342240252742229343L), var4_3);
                                                                var8_5 = var3_17.nextDouble(0.0, Double.longBitsToDouble(2830430351453846L ^ 4617086517820310414L));
                                                                var10_6 = this.zdhs.thw_5();
                                                                var12_7 = var3_17.nextDouble(0.0, Double.longBitsToDouble(-2376634935816179593L ^ -6981319507606200977L));
                                                                var14_8 = var1_1.field_1352 + Math.cos(var8_5) * var6_4;
                                                                var16_9 = var1_1.field_1351 + var3_17.nextDouble(Double.longBitsToDouble(-6770247745919301223L ^ -2158561727491913319L), (double)this.mm.thw_5() + Double.longBitsToDouble(4532691155534777859L ^ 9144377173962165763L));
                                                                var18_10 = var1_1.field_1350 + Math.sin(var8_5) * var6_4;
                                                                var20_11 = Math.cos(var12_7) * var10_6;
                                                                var22_12 = var3_17.nextDouble(-var10_6 * Double.longBitsToDouble(268813771357651049L ^ 4353578633382690921L), var10_6 * tjw.jdhf(7869169597491064558L ^ 5968801778770884468L));
                                                                var24_13 = tjw.zwth(var12_7) * var10_6;
                                                                this.sshsh.add(new zj(tjw.thyj(this, var3_17), var14_8, var16_9, var18_10, var20_11, var22_12, var24_13, tjw.stw_4(var3_17, Float.intBitsToFloat(1340359229 - 279200317), Float.intBitsToFloat(Integer.rotateLeft(1339219963 ^ 1210507259, 3))), var3_17.nextFloat(0.0f, tjw.shhf_2(44127111 - -1091742841)), tjw.zzth(var3_17, Float.intBitsToFloat(-1331839801 - -249709369), 1.0f), var3_17.nextFloat(0.0f, Float.intBitsToFloat(Integer.reverse(619007265) ^ -998528769)), var2_2));
                                                                return;
                                                            }
                                                        }
                                                        (Integer.rotateRight(-814831074 ^ var26_15, 12) - 583284957) * -814831073;
                                                        if (yf.khdha_2()) {
                                                            try {
                                                                if ((-3281130663340217859L ^ (long)var26_15 | 1L) == 0L) {
                                                                    throw new UnsupportedOperationException();
                                                                }
                                                                var27_16 = Integer.reverse(var26_15 ^ 145697463 ^ 1423916574) ^ -684869360 ^ -684869360;
                                                            }
                                                            catch (UnsupportedOperationException v1) {
                                                                var27_16 = Integer.reverse(var26_15 ^ 145697463 ^ 1423916574) + -583219785 - -583219785;
                                                            }
                                                            var28_14 -= 2;
                                                            continue;
                                                        }
                                                        var27_16 = Integer.reverse(var26_15 ^ -225348682 ^ 1423916574) + 2017207936 - 2017207936;
                                                        Integer.rotateRight(1451180327 ^ var26_15, 13) - 2110161652;
                                                        ++var28_14;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(-799816556 ^ var26_15, 13) - 1048735015) * -799816555;
                                                    tjw.tyth();
                                                    throw null;
                                                }
                                                Integer.rotateRight(729363247 ^ var26_15, 8) - 1208668652;
                                                (int)(8089758707411576444L ^ (long)var26_15 ^ -3734188378889958056L);
                                                var27_16 = Integer.reverse(var26_15 ^ 1418265240 ^ 1423916574) ^ -1155884336 ^ -1155884336;
                                                (int)(6357523415463831016L ^ (long)var26_15 ^ 1641974749078166949L);
                                                var27_16 = Integer.reverse(var26_15 ^ 154261803 ^ 1423916574) + -435173856 - -435173856;
                                                continue;
                                            }
                                            (Integer.rotateLeft(-407108899 ^ var26_15, 15) - 337770494) * -407108899;
                                            (int)(2670261707818199887L ^ (long)var26_15 ^ -6579614907128748084L);
                                            var27_16 = Integer.reverse(var26_15 ^ 349594364 ^ 1423916574);
                                            Integer.rotateLeft(-933033275 ^ var26_15, 12) - 1213984022;
                                            (int)(779585596238916431L ^ (long)var26_15 ^ -5440204201404024718L);
                                            var27_16 = Integer.reverse(var26_15 ^ 165304625 ^ 1423916574) ^ 1415051651 ^ 1415051651;
                                            Integer.rotateLeft(-885199584 ^ var26_15, 12) + -1598138853;
                                            var27_16 = Integer.reverse(Integer.reverse(Integer.reverse(var26_15 ^ 154261803 ^ 1423916574)));
                                            continue;
                                        }
                                        (Integer.rotateLeft(1467070749 ^ var26_15, 13) - -1692202562) * 1467070749;
                                        (int)(-7655249514725053617L ^ (long)var26_15 ^ -3228936784365189545L);
                                        var27_16 = Integer.reverse(var26_15 ^ 807917128 ^ 1423916574);
                                        (Integer.rotateRight(644628730 ^ var26_15, 7) + -1418101375) * 644628731;
                                        var27_16 = Integer.reverse(Integer.reverse(Integer.reverse(var26_15 ^ 154261803 ^ 1423916574)));
                                        (Integer.rotateLeft(-28216519 ^ var26_15, 18) + -801467614) * -28216519;
                                        (int)(4387593471906868047L ^ (long)var26_15 ^ 5150010322357703702L);
                                        ++var28_14;
                                        continue;
                                    }
                                    Integer.rotateLeft(-1606720472 ^ var26_15, 7) + 1804517395;
                                    try {
                                        if ((5501563939893306291L ^ (long)var26_15 | 1L) == 0L) {
                                            throw new ArithmeticException();
                                        }
                                        var27_16 = Integer.reverse(Integer.reverse(Integer.reverse(var26_15 ^ 154261803 ^ 1423916574)));
                                    }
                                    catch (ArithmeticException v2) {
                                        var27_16 = Integer.reverse(var26_15 ^ 154261803 ^ 1423916574) ^ -1494857739 ^ -1494857739;
                                    }
                                    var28_14 -= 4;
                                    continue;
                                }
                                Integer.rotateLeft(-2132076019 ^ var26_15, 3) - -1596602674;
                                (int)(4781050598350187343L ^ (long)var26_15 ^ -7705514813971420830L);
                                var27_16 = Integer.reverse(var26_15 ^ 389541428 ^ 1423916574) + -693169003 - -693169003;
                                (Integer.rotateLeft(-1226068803 ^ var26_15, 9) - 719817246) * -1226068803;
                                (int)(8383734930774223695L ^ (long)var26_15 ^ -544791406452325021L);
                                (int)(434723336700887061L ^ (long)var26_15 ^ 1753127249811186113L);
                                var27_16 = Integer.reverse(Integer.reverse(Integer.reverse(var26_15 ^ 154261803 ^ 1423916574)));
                                --var28_14;
                                continue;
                            }
                            Integer.rotateRight(-1460137597 ^ var26_15, 8) + 2053619224;
                            var27_16 = Integer.reverse(var26_15 ^ 1283063967 ^ 1423916574) ^ -72327712 ^ -72327712;
                            (Integer.rotateLeft(1926893244 ^ var26_15, 17) - -322607105) * 1926893245;
                            var27_16 = Integer.reverse(var26_15 ^ 154261803 ^ 1423916574);
                            --var28_14;
                            continue;
                        }
                        (Integer.rotateRight(-1822898118 ^ var26_15, 5) + -602022335) * -1822898117;
                        try {
                            var28_14 += 3;
                            var27_16 = Integer.reverse(Integer.reverse(Integer.reverse(var26_15 ^ 154261803 ^ 1423916574)));
                        }
                        catch (UnsupportedOperationException v3) {
                            var27_16 = Integer.reverse(var26_15 ^ 154261803 ^ 1423916574) + -381105615 - -381105615;
                        }
                        var28_14 += 2;
                        continue;
                    }
                    (Integer.rotateRight(1957827454 ^ var26_15, 17) - 636353405) * 1957827455;
                    var27_16 = Integer.reverse(var26_15 ^ -554593336 ^ 1423916574) ^ 1865241885 ^ 1865241885;
                    (Integer.rotateLeft(-707264451 ^ var26_15, 13) - -377117026) * -707264451;
                    (int)(1687352326095170383L ^ (long)var26_15 ^ -6813802087752039676L);
                    try {
                        var28_14 += 2;
                        if ((-7515521269228935811L ^ (long)var26_15 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var27_16 = Integer.reverse(var26_15 ^ 154261803 ^ 1423916574) + -1122222665 - -1122222665;
                    }
                    catch (IllegalStateException v4) {
                        var27_16 = Integer.reverse(var26_15 ^ 154261803 ^ 1423916574);
                    }
                    var28_14 += 4;
                    continue;
                }
                Integer.rotateRight(33569670 ^ var26_15, 3) - 1113904245;
                var27_16 = Integer.reverse(var26_15 ^ -399130113 ^ 1423916574) + 550849307 - 550849307;
                Integer.rotateRight(-1350362 ^ var26_15, 18) - 31383253;
                var27_16 = Integer.reverse(var26_15 ^ 154261803 ^ 1423916574) ^ -1621608007 ^ -1621608007;
                var28_14 += 3;
                continue;
            }
            Integer.rotateRight(455450831 ^ var26_15, 6) - 1307318348;
            var27_16 = Integer.reverse(var26_15 ^ -1953247517 ^ 1423916574) ^ 14089169 ^ 14089169;
            Integer.rotateLeft(1372253928 ^ var26_15, 13) + -336556717;
            (int)(-8031679989125709950L ^ (long)var26_15 ^ -8771382962888209214L);
            var27_16 = (int)((long)Integer.reverse(var26_15 ^ -114002898 ^ 1423916574) ^ -1286610622818236485L ^ -1286610622818236485L);
            (int)(-3885432810508067557L ^ (long)var26_15 ^ -6083383731273319943L);
            var27_16 = Integer.reverse(var26_15 ^ 154261803 ^ 1423916574) ^ -160869549 ^ -160869549;
            var28_14 += 2;
            continue;
lbl228:
            // 8 sources

            (Integer.rotateLeft(618278992 ^ var26_15, 7) + 2060024043) * 618278993;
            var27_16 = Integer.reverse(var26_15 ^ 154261803 ^ 1423916574) ^ -761837111 ^ -761837111;
        }
    }

    /*
     * Unable to fully structure code
     */
    private bzk jthgh(ThreadLocalRandom var1_1) {
        var2_2 = null;
        var5_3 = 0;
        var3_4 = -1728527881;
        var3_4 = Integer.rotateLeft(var3_4 * 1539789603, 10) ^ -355077029;
        var3_4 = System.identityHashCode(this) ^ var3_4;
        var4_5 = Integer.reverse(Integer.reverse(1217274662 * -1691558275 + 897402156 ^ var3_4));
        block64: while (true) {
            if ((var5_3 = ((var4_5 ^ var3_4) - 897402156) * -570291499) == 382147654) ** GOTO lbl-1000
            if (var5_3 != -1642601541) {
                switch (var5_3) {
                    case 1217274662: {
                        (Integer.rotateRight(-1162599210 ^ var3_4, 10) - -1607592667) * -1162599209;
                        if (this.dhzl.shghkh()) {
                            var4_5 = 566450578 * -1691558275 + 897402156 ^ var3_4 ^ -2117876330 ^ -2117876330;
                            (Integer.rotateLeft(-2115278320 ^ var3_4, 3) + -1075874005) * -2115278319;
                            var5_3 -= 3;
                            continue block64;
                        }
                        var4_5 = (int)((long)(-88514808 * -1691558275 + 897402156 ^ var3_4) ^ -7931125390774962114L ^ -7931125390774962114L);
                        Integer.rotateRight(1139964779 ^ var3_4, 11) + 1052414256;
                        var4_5 = -716368776 * -1691558275 + 897402156 ^ var3_4 ^ -1317311636 ^ -1317311636;
                        var5_3 -= 4;
                        continue block64;
                    }
                    case 1408707723: {
                        (Integer.rotateRight(858129503 ^ var3_4, 9) - 905455292) * 858129503;
                        if (!this.khnj.shghkh()) {
                            (int)(1422992091979665574L ^ (long)var3_4 ^ 790854478875822767L);
                            var4_5 = (-750633896 * -1691558275 + 897402156 ^ var3_4) + -1350523863 - -1350523863;
                            var5_3 += 3;
                            continue block64;
                        }
                        try {
                            var5_3 += 4;
                            if ((-1336663468798898047L ^ (long)var3_4 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            var4_5 = 1552606703 * -1691558275 + 897402156 ^ var3_4;
                        }
                        catch (NoSuchElementException v0) {
                            var4_5 = 1552606703 * -1691558275 + 897402156 ^ var3_4 ^ 1046429165 ^ 1046429165;
                        }
                        var5_3 -= 5;
                        continue block64;
                    }
                    case -750633896: {
                        (Integer.rotateLeft(-1301141035 ^ var3_4, 9) - -1607421946) * -1301141035;
                        (int)(8124643158946802511L ^ (long)var3_4 ^ -963626171797779376L);
                        if (this.thzj.shghkh()) {
                            var4_5 = -853363119 * -1691558275 + 897402156 ^ var3_4;
                            Integer.rotateLeft(-489438807 ^ var3_4, 15) + 2080510642;
                            (int)(2333268764068735823L ^ (long)var3_4 ^ 2474872143699635475L);
                            continue block64;
                        }
                        var4_5 = 1812821178 * -1691558275 + 897402156 ^ var3_4;
                        Integer.rotateLeft(94387244 ^ var3_4, 3) - -1295718257;
                        var4_5 = 23471903 * -1691558275 + 897402156 ^ var3_4 ^ -6256554 ^ -6256554;
                        --var5_3;
                        continue block64;
                    }
                    case -716368776: {
                        Integer.rotateLeft(-96071348 ^ var3_4, 18) - 1389999983;
                        if (this.qh_2.shghkh()) {
                            var4_5 = Integer.reverse(Integer.reverse(288472586 * -1691558275 + 897402156 ^ var3_4));
                            --var5_3;
                            continue block64;
                        }
                        try {
                            var5_3 -= 5;
                            if ((-5611803577125674631L ^ (long)var3_4 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var4_5 = Integer.reverse(Integer.reverse(-1442303949 * -1691558275 + 897402156 ^ var3_4));
                        }
                        catch (ArithmeticException v1) {
                            var4_5 = Integer.reverse(Integer.reverse(-1442303949 * -1691558275 + 897402156 ^ var3_4));
                        }
                        var5_3 -= 3;
                        continue block64;
                    }
                    case -957600353: {
                        (Integer.rotateRight(496621274 ^ var3_4, 6) + -1711365215) * 496621275;
                        var2_2 = bzk.h_3;
                        (int)(-7373761601746941109L ^ (long)var3_4 ^ -5136084511063236985L);
                        var4_5 = -1378311742 * -1691558275 + 897402156 ^ var3_4;
                        ++var5_3;
                        continue block64;
                    }
                    case 315238838: {
                        Integer.rotateLeft(-1255333587 ^ var3_4, 9) - -187391058;
                        (int)(8619765511360932687L ^ (long)var3_4 ^ -2067008080503553298L);
                        var2_2 = bzk.h_3;
                        var4_5 = (int)((long)(-1378311742 * -1691558275 + 897402156 ^ var3_4) ^ 2282551026313948952L ^ 2282551026313948952L);
                        (Integer.rotateRight(-2113327493 ^ var3_4, 3) + -1015398368) * -2113327493;
                        continue block64;
                    }
                    case -1442303949: {
                        (Integer.rotateLeft(-1911128200 ^ var3_4, 4) + 957812419) * -1911128199;
                        if (!this.jdh_2.shghkh()) {
                            var4_5 = Integer.reverse(Integer.reverse(-1214920915 * -1691558275 + 897402156 ^ var3_4));
                            var5_3 += 3;
                            continue block64;
                        }
                        var4_5 = Integer.reverse(Integer.reverse(-1801874826 * -1691558275 + 897402156 ^ var3_4));
                        Integer.rotateLeft(1626457696 ^ var3_4, 15) + -1046174501;
                        var4_5 = Integer.reverse(Integer.reverse(1498354713 * -1691558275 + 897402156 ^ var3_4));
                        var5_3 += 2;
                        continue block64;
                    }
                    case 23471903: {
                        (Integer.rotateRight(34171066 ^ var3_4, 3) + 1132547521) * 34171067;
                        var2_2 = bzk.jkn;
                        try {
                            var5_3 -= 3;
                            if ((4380822078605553443L ^ (long)var3_4 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            var4_5 = (-1378311742 * -1691558275 + 897402156 ^ var3_4) + 795259236 - 795259236;
                        }
                        catch (NoSuchElementException v2) {
                            var4_5 = (-1378311742 * -1691558275 + 897402156 ^ var3_4) + 1881490569 - 1881490569;
                        }
                        ++var5_3;
                        continue block64;
                    }
                    case 1498354713: {
                        (Integer.rotateRight(487088855 ^ var3_4, 6) - -2006870204) * 487088855;
                        var2_2 = bzk.zrh;
                        var4_5 = Integer.reverse(Integer.reverse(-367037521 * -1691558275 + 897402156 ^ var3_4));
                        Integer.rotateRight(-1905096338 ^ var3_4, 4) - 1144800141;
                        var4_5 = -1378311742 * -1691558275 + 897402156 ^ var3_4;
                        var5_3 -= 4;
                        continue block64;
                    }
                    case 1552606703: {
                        (Integer.rotateRight(-626068706 ^ var3_4, 14) - 2139951069) * -626068705;
                        var2_2 = bzk.sbh;
                        var4_5 = Integer.reverse(Integer.reverse(-347471801 * -1691558275 + 897402156 ^ var3_4));
                        (Integer.rotateLeft(-1294886152 ^ var3_4, 9) + -1413520573) * -1294886151;
                        var4_5 = Integer.reverse(Integer.reverse(-1378311742 * -1691558275 + 897402156 ^ var3_4));
                        var5_3 -= 2;
                        continue block64;
                    }
                    case -1214920915: {
                        (Integer.rotateLeft(1237658901 ^ var3_4, 12) - -214035258) * 1237658901;
                        (int)(-8397098771718804657L ^ (long)var3_4 ^ -351136622475429058L);
                        if (!this.khal_2.shghkh()) {
                            try {
                                var4_5 = 1408707723 * -1691558275 + 897402156 ^ var3_4 ^ 592917343 ^ 592917343;
                            }
                            catch (IllegalStateException v3) {
                                var4_5 = Integer.reverse(Integer.reverse(1408707723 * -1691558275 + 897402156 ^ var3_4));
                            }
                            var5_3 -= 4;
                            continue block64;
                        }
                        try {
                            var5_3 += 3;
                            if ((2450654095545476051L ^ (long)var3_4 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var4_5 = 315238838 * -1691558275 + 897402156 ^ var3_4;
                        }
                        catch (ArithmeticException v4) {
                            var4_5 = (int)((long)(315238838 * -1691558275 + 897402156 ^ var3_4) ^ -1691002598095576031L ^ -1691002598095576031L);
                        }
                        var5_3 += 3;
                        continue block64;
                    }
                    case -853363119: {
                        (Integer.rotateRight(-1860566478 ^ var3_4, 5) + -1769741495) * -1860566477;
                        var2_2 = bzk.ddj;
                        try {
                            --var5_3;
                            if ((-6057971336279559463L ^ (long)var3_4 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            var4_5 = -1378311742 * -1691558275 + 897402156 ^ var3_4;
                        }
                        catch (IllegalArgumentException v5) {
                            var4_5 = (int)((long)(-1378311742 * -1691558275 + 897402156 ^ var3_4) ^ 6647294535904412722L ^ 6647294535904412722L);
                        }
                        --var5_3;
                        continue block64;
                    }
                    case 566450578: {
                        Integer.rotateLeft(1283708005 ^ var3_4, 12) - 1213486966;
                        (int)(-8200638927420986545L ^ (long)var3_4 ^ 702705690329264563L);
                        var2_2 = tjw.bdsh[var1_1.nextInt(tjw.bdsh.length)];
                        var4_5 = -2033029926 * -1691558275 + 897402156 ^ var3_4;
                        (Integer.rotateLeft(-462758027 ^ var3_4, 15) - -1387352474) * -462758027;
                        (int)(2799111723130612559L ^ (long)var3_4 ^ 2296979958418497633L);
                        var4_5 = (-1378311742 * -1691558275 + 897402156 ^ var3_4) + 901033539 - 901033539;
                        continue block64;
                    }
                    case 288472586: {
                        Integer.rotateLeft(1238737856 ^ var3_4, 12) + -180587653;
                        var2_2 = bzk.fz_2;
                        var4_5 = 1763703772 * -1691558275 + 897402156 ^ var3_4 ^ 1423055826 ^ 1423055826;
                        (Integer.rotateRight(916570523 ^ var3_4, 9) + -1577840384) * 916570523;
                        var4_5 = Integer.reverse(Integer.reverse(-1378311742 * -1691558275 + 897402156 ^ var3_4));
                        continue block64;
                    }
                    case 1375030270: {
                        (Integer.rotateRight(-1425387753 ^ var3_4, 8) - -1164102908) * -1425387753;
                        var4_5 = -746970409 * -1691558275 + 897402156 ^ var3_4;
                        (Integer.rotateLeft(1185928573 ^ var3_4, 11) - -1817675426) * 1185928573;
                        (int)(-8926843370902066353L ^ (long)var3_4 ^ 860331677287228907L);
                        var4_5 = (int)((long)(1217274662 * -1691558275 + 897402156 ^ var3_4) ^ 3063081007883590209L ^ 3063081007883590209L);
                        var5_3 += 3;
                        continue block64;
                    }
                    case -323419210: {
                        (Integer.rotateRight(1976200414 ^ var3_4, 17) - 1205915165) * 1976200415;
                        var4_5 = (int)((long)(-1446072192 * -1691558275 + 897402156 ^ var3_4) ^ 6934922849406639344L ^ 6934922849406639344L);
                        (Integer.rotateLeft(589107125 ^ var3_4, 7) - 1155696166) * 589107125;
                        (int)(-2184349688095511729L ^ (long)var3_4 ^ -4728635460279570802L);
                        var4_5 = (int)((long)(291504471 * -1691558275 + 897402156 ^ var3_4) ^ 6184185117912229414L ^ 6184185117912229414L);
                        Integer.rotateRight(-141235345 ^ var3_4, 17) - -10083924;
                        var4_5 = 1217274662 * -1691558275 + 897402156 ^ var3_4 ^ -1436533393 ^ -1436533393;
                        continue block64;
                    }
                    case 282944899: {
                        Integer.rotateRight(-573247793 ^ var3_4, 14) - -517567924;
                        try {
                            var5_3 -= 3;
                            if ((-5785909221627001549L ^ (long)var3_4 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            var4_5 = (int)((long)(1217274662 * -1691558275 + 897402156 ^ var3_4) ^ 5253661389772831622L ^ 5253661389772831622L);
                        }
                        catch (NoSuchElementException v6) {
                            var4_5 = (int)((long)(1217274662 * -1691558275 + 897402156 ^ var3_4) ^ -6551743925098078774L ^ -6551743925098078774L);
                        }
                        var5_3 += 5;
                        continue block64;
                    }
                }
            }
            ** GOTO lbl372
lbl-1000:
            // 1 sources

            {
                (Integer.rotateRight(1128551127 ^ var3_4, 11) - 698591044) * 1128551127;
                var4_5 = -1768222133 * -1691558275 + 897402156 ^ var3_4 ^ 1972467537 ^ 1972467537;
                (Integer.rotateLeft(-1062297671 ^ var3_4, 11) + 1501755042) * -1062297671;
                (int)(152050931097463631L ^ (long)var3_4 ^ -7027723070052128279L);
                try {
                    var4_5 = Integer.reverse(Integer.reverse(1217274662 * -1691558275 + 897402156 ^ var3_4));
                }
                catch (IllegalStateException v7) {
                    var4_5 = 1217274662 * -1691558275 + 897402156 ^ var3_4;
                }
                var5_3 -= 4;
                continue block64;
                case -1206778338: {
                    Integer.rotateRight(1927111498 ^ var3_4, 17) + -315841231;
                    var4_5 = -1513788036 * -1691558275 + 897402156 ^ var3_4 ^ 14147638 ^ 14147638;
                    (Integer.rotateRight(8206719 ^ var3_4, 3) - 327652764) * 8206719;
                    try {
                        var5_3 += 5;
                        var4_5 = (1217274662 * -1691558275 + 897402156 ^ var3_4) + 1583889158 - 1583889158;
                    }
                    catch (IllegalStateException v8) {
                        var4_5 = (int)((long)(1217274662 * -1691558275 + 897402156 ^ var3_4) ^ 6798779150253982390L ^ 6798779150253982390L);
                    }
                    var5_3 -= 2;
                    continue block64;
                }
                case 1101833579: {
                    (Integer.rotateLeft(-849405955 ^ var3_4, 12) - -488536354) * -849405955;
                    (int)(1147777715002469199L ^ (long)var3_4 ^ -8146867577453694454L);
                    try {
                        var5_3 += 3;
                        var4_5 = (1217274662 * -1691558275 + 897402156 ^ var3_4) + 1969612612 - 1969612612;
                    }
                    catch (NoSuchElementException v9) {
                        var4_5 = 1217274662 * -1691558275 + 897402156 ^ var3_4 ^ -1672187724 ^ -1672187724;
                    }
                    var5_3 += 2;
                    continue block64;
                }
                case -1098019518: {
                    (Integer.rotateRight(1273910299 ^ var3_4, 12) + 909758080) * 1273910299;
                    var4_5 = Integer.reverse(Integer.reverse(700179929 * -1691558275 + 897402156 ^ var3_4));
                    (Integer.rotateRight(1965358551 ^ var3_4, 17) - 869817412) * 1965358551;
                    var4_5 = (int)((long)(1628993203 * -1691558275 + 897402156 ^ var3_4) ^ 7140778132451447521L ^ 7140778132451447521L);
                    (Integer.rotateRight(-1348484233 ^ var3_4, 8) - 1219906212) * -1348484233;
                    var4_5 = Integer.reverse(Integer.reverse(1217274662 * -1691558275 + 897402156 ^ var3_4));
                    ++var5_3;
                    continue block64;
                }
                case -182838992: {
                    (Integer.rotateRight(-506592742 ^ var3_4, 15) + 1548738657) * -506592741;
                    (int)(-5485997532208580520L ^ (long)var3_4 ^ 6480170379927538282L);
                    var4_5 = (1217274662 * -1691558275 + 897402156 ^ var3_4) + -1846794173 - -1846794173;
                    continue block64;
                }
                case 1805189657: {
                    (Integer.rotateRight(1194723547 ^ var3_4, 11) + -1545031232) * 1194723547;
                    try {
                        var5_3 += 3;
                        if ((-5455838323082836211L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var4_5 = 1217274662 * -1691558275 + 897402156 ^ var3_4 ^ 1942123524 ^ 1942123524;
                    }
                    catch (IllegalStateException v10) {
                        var4_5 = 1217274662 * -1691558275 + 897402156 ^ var3_4 ^ 874834247 ^ 874834247;
                    }
                    var5_3 -= 5;
                    continue block64;
                }
                case -565313523: {
                    Integer.rotateRight(776146439 ^ var3_4, 8) - -1636019692;
                    var4_5 = -1242981613 * -1691558275 + 897402156 ^ var3_4;
                    (Integer.rotateLeft(-2000143620 ^ var3_4, 4) - -1801665601) * -2000143619;
                    try {
                        ++var5_3;
                        if ((2051061451518613939L ^ (long)var3_4 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var4_5 = 1217274662 * -1691558275 + 897402156 ^ var3_4;
                    }
                    catch (UnsupportedOperationException v11) {
                        var4_5 = (1217274662 * -1691558275 + 897402156 ^ var3_4) + -902242231 - -902242231;
                    }
                    ++var5_3;
                    continue block64;
                }
                case 240572337: {
                    (Integer.rotateRight(-1357003726 ^ var3_4, 8) + 955801929) * -1357003725;
                    try {
                        if ((2799881429044548741L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var4_5 = (1217274662 * -1691558275 + 897402156 ^ var3_4) + -654927857 - -654927857;
                    }
                    catch (IllegalArgumentException v12) {
                        var4_5 = 1217274662 * -1691558275 + 897402156 ^ var3_4;
                    }
                    --var5_3;
                    continue block64;
                }
                case 2087524686: {
                    (Integer.rotateLeft(-859050063 ^ var3_4, 12) + -787503702) * -859050063;
                    (int)(1042936858932472655L ^ (long)var3_4 ^ 9108674394816360739L);
                    var4_5 = (722587812 * -1691558275 + 897402156 ^ var3_4) + -213805322 - -213805322;
                    (Integer.rotateLeft(86759153 ^ var3_4, 3) + -1532189078) * 86759153;
                    (int)(-4064084370488235185L ^ (long)var3_4 ^ 930137471511438051L);
                    (int)(-7545980291354488828L ^ (long)var3_4 ^ 7547834912438387551L);
                    var4_5 = Integer.reverse(Integer.reverse(-614801590 * -1691558275 + 897402156 ^ var3_4));
                    (int)(-344907813410600791L ^ (long)var3_4 ^ -5393246934243451972L);
                    var4_5 = 1217274662 * -1691558275 + 897402156 ^ var3_4;
                    continue block64;
                }
                case 870199905: {
                    (Integer.rotateRight(-944873222 ^ var3_4, 11) + 846945665) * -944873221;
                    try {
                        var5_3 -= 4;
                        var4_5 = 1217274662 * -1691558275 + 897402156 ^ var3_4;
                    }
                    catch (UnsupportedOperationException v13) {
                        var4_5 = Integer.reverse(Integer.reverse(1217274662 * -1691558275 + 897402156 ^ var3_4));
                    }
                    --var5_3;
                    continue block64;
                }
lbl372:
                // 1 sources

                (Integer.rotateLeft(2081712977 ^ var3_4, 18) + 181837322) * 2081712977;
                (int)(-4708859292053869745L ^ (long)var3_4 ^ 8622285635060289692L);
                try {
                    var5_3 -= 2;
                    if ((2965681174620741989L ^ (long)var3_4 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    var4_5 = Integer.reverse(Integer.reverse(1217274662 * -1691558275 + 897402156 ^ var3_4));
                }
                catch (NoSuchElementException v14) {
                    var4_5 = 1217274662 * -1691558275 + 897402156 ^ var3_4;
                }
                var5_3 -= 3;
                continue block64;
                case 2001007892: {
                    Integer.rotateRight(-694291858 ^ var3_4, 13) - 25033357;
                    try {
                        if ((-6013594946116452247L ^ (long)var3_4 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var4_5 = 1217274662 * -1691558275 + 897402156 ^ var3_4;
                    }
                    catch (ArithmeticException v15) {
                        var4_5 = 1217274662 * -1691558275 + 897402156 ^ var3_4;
                    }
                    var5_3 += 5;
                    continue block64;
                }
                case 824475419: {
                    (Integer.rotateRight(230027326 ^ var3_4, 4) - -1385843011) * 230027327;
                    var4_5 = (int)((long)(-798080536 * -1691558275 + 897402156 ^ var3_4) ^ 1507481045877033777L ^ 1507481045877033777L);
                    Integer.rotateRight(-1148289725 ^ var3_4, 10) + -1163998632;
                    var4_5 = (1217274662 * -1691558275 + 897402156 ^ var3_4) + -54442679 - -54442679;
                    var5_3 += 4;
                    continue block64;
                }
                case 1344386773: {
                    (Integer.rotateLeft(-1897059247 ^ var3_4, 4) + 1393949962) * -1897059247;
                    (int)(5503260670706379599L ^ (long)var3_4 ^ -456971213718604434L);
                    var4_5 = -1784481279 * -1691558275 + 897402156 ^ var3_4 ^ 976875262 ^ 976875262;
                    (Integer.rotateRight(526972631 ^ var3_4, 6) - -770473148) * 526972631;
                    var4_5 = (1217274662 * -1691558275 + 897402156 ^ var3_4) + -944139085 - -944139085;
                    continue block64;
                }
                case -1378311742: {
                    return var2_2;
                }
            }
            (Integer.rotateRight(640928279 ^ var3_4, 7) - -1532815356) * 640928279;
            var4_5 = Integer.reverse(Integer.reverse(1217274662 * -1691558275 + 897402156 ^ var3_4));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void hlf(shw_3 shw2) {
        if (this.sshsh.isEmpty()) {
            return;
        }
        class_4184 class_41842 = shw2.dhal();
        if (class_41842 == null) {
            return;
        }
        class_243 class_2432 = class_41842.method_19326();
        float f = (float)Math.toRadians(-class_41842.method_19330());
        float f2 = (float)Math.toRadians(class_41842.method_19329());
        Matrix4f matrix4f = shw2.ssha_2().method_23760().method_23761();
        float f3 = class_3532.method_15374((float)f);
        float f4 = class_3532.method_15362((float)f);
        float f5 = class_3532.method_15374((float)f2);
        float f6 = class_3532.method_15362((float)f2);
        int n = this.bghd_2();
        long l = System.currentTimeMillis();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableCull();
        try {
            for (bzk bzk2 : bdsh) {
                this.thny(bzk2.hshh_2, shw2.skz_4(), class_2432, matrix4f, f3, f4, f5, f6, n, l, bzk2, 1.0f);
            }
            if (this.dhbd_2.shzl()) {
                this.thny(bzk.khqw.hshh_2, shw2.skz_4(), class_2432, matrix4f, f3, f4, f5, f6, n, l, null, this.sthr.thw_5());
            }
        }
        catch (RuntimeException runtimeException) {
            Moondlc.dhrn.error("Unable to render World Particles.", (Throwable)runtimeException);
        }
        finally {
            RenderSystem.depthMask((boolean)true);
            RenderSystem.defaultBlendFunc();
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
        }
    }

    private void thny(class_2960 class_29602, float f, class_243 class_2432, Matrix4f matrix4f, float f2, float f3, float f4, float f5, int n, long l, bzk bzk2, float f6) {
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        for (zj zj2 : this.sshsh) {
            float f7;
            if (bzk2 != null && zj2.shqgh != bzk2 || (f7 = zj2.dhsq() * f6) <= 0.01f) continue;
            double d = tjw.ath_4(zj2.rysh, zj2.htd_4, f) - class_2432.field_1352;
            double d2 = tjw.ath_4(zj2.tgha_2, zj2.bsn_2, f) - class_2432.field_1351;
            double d3 = tjw.ath_4(zj2.blq, zj2.qz, f) - class_2432.field_1350;
            float f8 = 0.92f + 0.08f * class_3532.method_15374((float)((float)zj2.khfj * 0.22f + zj2.tadh));
            float f9 = this.std_5.thw_5() * zj2.btt_4 * f8 * 0.5f;
            int n2 = this.bfj(n, zj2, l, f7);
            tjw.dhdr_2(class_2872, matrix4f, d, d2, d3, f2, f3, f4, f5, f9, zj2.khskh_2, n2);
        }
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
    }

    /*
     * Unable to fully structure code
     */
    private int bghd_2() {
        var1_1 = 0;
        var4_2 = 0;
        var2_3 = -1322576298;
        var2_3 = Integer.rotateLeft(var2_3 * 1363069639, 10) ^ 191964730;
        var2_3 = Integer.rotateLeft(System.identityHashCode(this) ^ var2_3, 23);
        var3_4 = (var2_3 ^ 71082668) + -1613143318 - -1613143318;
        while (true) {
            block30: {
                block32: {
                    block39: {
                        block40: {
                            block33: {
                                block37: {
                                    block34: {
                                        block38: {
                                            block31: {
                                                block42: {
                                                    block35: {
                                                        block41: {
                                                            block29: {
                                                                block36: {
                                                                    var4_2 = var3_4 ^ var2_3;
                                                                    switch (var4_2 & 7) {
                                                                        case 0: {
                                                                            if (var4_2 == 767122392) break block29;
                                                                            if (var4_2 != 689875576) {
                                                                                ** break;
                                                                            }
                                                                            break block30;
                                                                        }
                                                                        case 1: {
                                                                            if (var4_2 == -1076641911) break block31;
                                                                            if (var4_2 == 868164937) break block32;
                                                                            (Integer.rotateRight(-1077503726 ^ var2_3, 10) + 1030367337) * -1077503725;
                                                                            if (var4_2 != 1608375657) {
                                                                                ** break;
                                                                            }
                                                                            break block33;
                                                                        }
                                                                        case 2: {
                                                                            if (var4_2 != -1626364246) {
                                                                                ** break;
                                                                            }
                                                                            break block34;
                                                                        }
                                                                        case 3: {
                                                                            if (var4_2 != 1743233587) {
                                                                                ** break;
                                                                            }
                                                                            break block35;
                                                                        }
                                                                        case 4: {
                                                                            if (var4_2 == 71082668) break;
                                                                            if (var4_2 == -332170988) break block36;
                                                                            Integer.rotateRight(554761606 ^ var2_3, 7) - 90985077;
                                                                            if (var4_2 == 24450684) break block37;
                                                                            if (var4_2 != 255899748) {
                                                                                ** break;
                                                                            }
                                                                            break block38;
                                                                        }
                                                                        case 6: {
                                                                            if (var4_2 == 1141295374) break block39;
                                                                            if (var4_2 == -1896438010) break block40;
                                                                            Integer.rotateLeft(423675917 ^ var2_3, 6) - 322296014;
                                                                            (int)(-2597901678026626225L ^ (long)var2_3 ^ 3535469855945267765L);
                                                                            if (var4_2 != -893723106) {
                                                                                ** break;
                                                                            }
                                                                            break block41;
                                                                        }
                                                                        case 7: {
                                                                            if (var4_2 != 513979847) {
                                                                                ** break;
                                                                            }
                                                                            break block42;
                                                                        }
                                                                    }
                                                                    Integer.rotateRight(-13731773 ^ var2_3, 18) + -352440488;
                                                                    if (this.hdj.shghkh()) {
                                                                        (int)(-6928890080426791352L ^ (long)var2_3 ^ -4959232374761680258L);
                                                                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 2064165107));
                                                                        (int)(4142147592077616746L ^ (long)var2_3 ^ 5180052985257123622L);
                                                                        var3_4 = (var2_3 ^ 767122392) + 2147025708 - 2147025708;
                                                                        var4_2 -= 4;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        if ((1780306764942864909L ^ (long)var2_3 | 1L) == 0L) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                        var3_4 = (var2_3 ^ -332170988) + 625079442 - 625079442;
                                                                    }
                                                                    catch (IllegalStateException v0) {
                                                                        var3_4 = (int)((long)(var2_3 ^ -332170988) ^ 4506459925428466972L ^ 4506459925428466972L);
                                                                    }
                                                                    var4_2 -= 2;
                                                                    continue;
                                                                }
                                                                (Integer.rotateRight(1541059986 ^ var2_3, 14) + 601463785) * 1541059987;
                                                                var1_1 = tjw.ayd(this.shjy).rk();
                                                                var3_4 = var2_3 ^ 689875576 ^ 1522037316 ^ 1522037316;
                                                                (Integer.rotateLeft(1883754680 ^ var2_3, 17) + -1659902589) * 1883754681;
                                                                continue;
                                                            }
                                                            Integer.rotateRight(-1499243581 ^ var2_3, 7) + 841333720;
                                                            var1_1 = bhj_2.ths().rk();
                                                            (int)(2694594826070096786L ^ (long)var2_3 ^ -4458643117854955749L);
                                                            var3_4 = (var2_3 ^ 689875576) + 555499053 - 555499053;
                                                            var4_2 -= 2;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(-1448830797 ^ var2_3, 8) + -1890837272) * -1448830797;
                                                        try {
                                                            var4_2 -= 4;
                                                            var3_4 = var2_3 ^ 71082668 ^ 675670865 ^ 675670865;
                                                        }
                                                        catch (ArithmeticException v1) {
                                                            var3_4 = (var2_3 ^ 71082668) + 2035911248 - 2035911248;
                                                        }
                                                        var4_2 += 4;
                                                        continue;
                                                    }
                                                    Integer.rotateRight(-1973413017 ^ var2_3, 4) - -973016908;
                                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 1331837333));
                                                    Integer.rotateRight(2141679075 ^ var2_3, 18) + 2040786360;
                                                    (int)(683577957349292221L ^ (long)var2_3 ^ -2270002653710926040L);
                                                    var3_4 = (var2_3 ^ 71082668) + -30571496 - -30571496;
                                                    var4_2 -= 2;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(-1152382448 ^ var2_3, 10) + -1290873045) * -1152382447;
                                                var3_4 = var2_3 ^ -1687386634;
                                                (Integer.rotateLeft(-767084836 ^ var2_3, 13) - 2063418335) * -767084835;
                                                try {
                                                    var4_2 += 3;
                                                    var3_4 = var2_3 ^ 71082668;
                                                }
                                                catch (NoSuchElementException v2) {
                                                    var3_4 = var2_3 ^ 71082668;
                                                }
                                                var4_2 -= 5;
                                                continue;
                                            }
                                            Integer.rotateLeft(-421165652 ^ var2_3, 15) - -97988849;
                                            try {
                                                var4_2 += 3;
                                                var3_4 = var2_3 ^ 71082668;
                                            }
                                            catch (ArithmeticException v3) {
                                                var3_4 = var2_3 ^ 71082668 ^ 427963023 ^ 427963023;
                                            }
                                            var4_2 += 5;
                                            continue;
                                        }
                                        Integer.rotateLeft(-149455028 ^ var2_3, 17) - -264894097;
                                        var3_4 = var2_3 ^ 165859669;
                                        Integer.rotateRight(1981312747 ^ var2_3, 17) + 1364397488;
                                        var3_4 = (var2_3 ^ 71082668) + 1251018267 - 1251018267;
                                        continue;
                                    }
                                    Integer.rotateLeft(559776077 ^ var2_3, 7) - 246433678;
                                    (int)(-2022345548914955441L ^ (long)var2_3 ^ -6660679700421514737L);
                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 71082668));
                                    var4_2 -= 5;
                                    continue;
                                }
                                (Integer.rotateLeft(1704159640 ^ var2_3, 15) + 1362585763) * 1704159641;
                                try {
                                    --var4_2;
                                    var3_4 = (var2_3 ^ 71082668) + 1355702620 - 1355702620;
                                }
                                catch (UnsupportedOperationException v4) {
                                    var3_4 = var2_3 ^ 71082668 ^ -323127105 ^ -323127105;
                                }
                                var4_2 += 2;
                                continue;
                            }
                            (Integer.rotateLeft(38167132 ^ var2_3, 3) - 1256425567) * 38167133;
                            var3_4 = var2_3 ^ -1157369418 ^ 1955734626 ^ 1955734626;
                            (Integer.rotateRight(661871415 ^ var2_3, 7) - -883578140) * 661871415;
                            var3_4 = var2_3 ^ 71082668 ^ 1778620098 ^ 1778620098;
                            --var4_2;
                            continue;
                        }
                        (Integer.rotateRight(-1832632838 ^ var2_3, 5) + -903798655) * -1832632837;
                        var3_4 = var2_3 ^ 826230519 ^ -932782509 ^ -932782509;
                        Integer.rotateRight(-843561270 ^ var2_3, 12) + -307351119;
                        (int)(1339260430952108329L ^ (long)var2_3 ^ -434423684800345859L);
                        var3_4 = var2_3 ^ 71082668 ^ -1353068996 ^ -1353068996;
                        ++var4_2;
                        continue;
                    }
                    (Integer.rotateRight(285649074 ^ var2_3, 5) + 338431177) * 285649075;
                    var3_4 = var2_3 ^ 1400429522 ^ -160896360 ^ -160896360;
                    (Integer.rotateRight(-661092393 ^ var2_3, 14) - 1054216772) * -661092393;
                    var3_4 = var2_3 ^ 71082668 ^ -1863011070 ^ -1863011070;
                    Integer.rotateRight(-1519610 ^ var2_3, 18) - 26136565;
                    var4_2 -= 3;
                    continue;
                }
                (Integer.rotateLeft(1273515828 ^ var2_3, 12) - 897529479) * 1273515829;
                (int)(-4936522147791113453L ^ (long)var2_3 ^ 2014545734841457450L);
                var3_4 = (int)((long)(var2_3 ^ 71082668) ^ -485650632886168746L ^ -485650632886168746L);
                var4_2 += 3;
                continue;
            }
            return var1_1;
lbl206:
            // 8 sources

            Integer.rotateRight(873831587 ^ var2_3, 9) + 1392219896;
            var3_4 = var2_3 ^ 71082668 ^ -1684295468 ^ -1684295468;
        }
    }

    private int bfj(int n, zj zj2, long l, float f) {
        int n2;
        block2: {
            int n3 = 318695118;
            n3 = Integer.rotateLeft(n3 * 1919808869, 13) ^ 0x8C15F67C;
            n3 = Integer.rotateRight(System.identityHashCode(this) ^ n3, 15);
            int n4 = (n3 = Integer.rotateLeft(n ^ n3, 14)) ^ 0x8D6FB0BC;
            if ((n4 ^ n3) != -1922060100) {
                int cfr_ignored_0 = (0x9F915672 ^ n3) + -1328366477;
            }
            int n5 = n;
            if (this.szz_4.shghkh()) {
                float f2 = (zj2.wq + (float)l * Float.intBitsToFloat(1174580630 + -224061418)) % 1.0f;
                n5 = Color.HSBtoRGB(f2, Float.intBitsToFloat(Integer.rotateLeft(0x52026982 ^ 0xDD639040, 13)), 1.0f);
            }
            int n6 = n5 >>> Integer.rotateLeft(0x9A8A31FE ^ 0x9A8A3DFE, 25) & (0xDC95DE58 ^ 0xDC95DEA7);
            int n7 = class_3532.method_15340((int)tjw.jlt((float)n6 * f), (int)0, (int)(Integer.reverse(-1343648808) ^ 0x1BD1970A));
            n2 = n7 << Integer.rotateLeft(0xCA6619DA ^ 0xCA7E19DA, 16) | n5 & (0xC208A2FB ^ 0xC2F75D04);
            if (yf.tdhth_2() != 0) break block2;
            n2 = n2 ^ 0xFEDC;
        }
        return n2;
    }

    private static void dhdr_2(class_287 class_2872, Matrix4f matrix4f, double d, double d2, double d3, float f, float f2, float f3, float f4, float f5, float f6, int n) {
        int n2 = -1825655729;
        n2 = Integer.rotateLeft(n2 * 354915067, 17) ^ 0x33992D9A;
        class_287 class_2873 = class_2872;
        n2 = Integer.rotateLeft((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n2, 14);
        Matrix4f matrix4f2 = matrix4f;
        n2 = (matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n2;
        int n3 = n2 ^ 0x4A4962AF;
        if ((n3 ^ n2) != 1246323375) {
            int cfr_ignored_0 = (0xD967D6E0 ^ n2) + 496232705;
        }
        float f7 = (float)(n >>> Integer.rotateLeft(0x304A571A ^ 0x304A551A, 27) & 563198390 - 563198135) / Float.intBitsToFloat(-127435415 + 1259831959);
        float f8 = (float)(n >>> -1762256221 + 1762256229 & -332374196 + 332374451) / Float.intBitsToFloat(-1278032724 - 1884538028);
        float f9 = (float)(n & -668215012 - -668215267) / tjw.zhz_8(Integer.reverse(-148244225) ^ 0xBC6094EF);
        float f10 = (float)(n >>> (Integer.reverse(-1983228010) ^ 0x69EA5389) & 1884437949 + -1884437694) / Float.intBitsToFloat(Integer.rotateLeft(0x8610C856 ^ 0x7610CC61, 20));
        float f11 = class_3532.method_15374((float)f6);
        float f12 = tjw.rhd_3(f6);
        tjw.dzth(class_2872, matrix4f, d, d2, d3, -f5, f5, f, f2, f3, f4, f11, f12, 0.0f, 1.0f, f7, f8, f9, f10);
        tjw.dqgh(class_2872, matrix4f, d, d2, d3, f5, f5, f, f2, f3, f4, f11, f12, 1.0f, 1.0f, f7, f8, f9, f10);
        tjw.dzth(class_2872, matrix4f, d, d2, d3, f5, -f5, f, f2, f3, f4, f11, f12, 1.0f, 0.0f, f7, f8, f9, f10);
        tjw.taz_4(class_2872, matrix4f, d, d2, d3, -f5, -f5, f, f2, f3, f4, f11, f12, 0.0f, 0.0f, f7, f8, f9, f10);
    }

    private static void dzth(class_287 class_2872, Matrix4f matrix4f, double d, double d2, double d3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        int n = bdhth.thwq(1009823498);
        class_287 class_2873 = class_2872;
        n = Integer.rotateLeft((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n, 12);
        n = (int)Double.doubleToLongBits(d2) ^ n;
        int n2 = n ^ 0xA7FBEDA8;
        if ((n2 ^ n) != -1476661848) {
            int cfr_ignored_0 = Integer.rotateRight(0x9BCB42A2 ^ n, 6) + -503664423;
        }
        float f15 = f * f8 - f2 * f7;
        float f16 = f * f7 + f2 * f8;
        float f17 = f16 * f6;
        float f18 = f16 * f5;
        float f19 = f15 * f4 + f18 * f3;
        float f20 = -f15 * f3 + f18 * f4;
        class_2872.method_22918(matrix4f, (float)d + f19, (float)d2 + f17, (float)d3 + f20).method_22913(f9, f10).method_22915(f11, f12, f13, f14);
    }

    private static double ath_4(double d, double d2, float f) {
        block0: {
            int n = 660974478;
            int n2 = (n = Integer.rotateLeft(n * -2074967947, 6) ^ 0x4FF7EBF4) ^ 0xF666354A;
            if ((n2 ^ n) == -161073846) break block0;
            int cfr_ignored_0 = (0xD1039EC4 ^ n) - 2112462726;
        }
        return d + (d2 - d) * (double)f;
    }

    private void swf(btt btt2) {
        int n = -1532993845;
        n = Integer.rotateLeft(n * -575064033, 14) ^ 0xAEDD3B20;
        btt btt3 = btt2;
        n = Integer.rotateLeft((btt3 != null ? System.identityHashCode(btt3) : 0) ^ n, 19);
        int n2 = n ^ 0xA3FCA9B5;
        if ((n2 ^ n) != -1543722571) {
            int cfr_ignored_0 = (0x75CF77E ^ n) - -1280445159;
        }
        this.skhm();
    }

    private boolean dsh_6() {
        int n = bdhth.thwq(-94373360);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 24);
        int n2 = n ^ 0x914F80ED;
        if ((n2 ^ n) != -1857060627) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x6B107AFD ^ n, 16) - -77823010) * 1796242173;
            int cfr_ignored_1 = (int)(0xA9A2D4C027D4EB4FL ^ (long)n ^ 0x54F0831A2DB8FE94L);
        }
        return !this.rdj.shghkh();
    }

    private boolean zqr() {
        int n = -1921218870;
        n = Integer.rotateLeft(n * -1278829279, 21) ^ 0xEBF18C84;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 19);
        int n2 = n ^ 0x28231CF1;
        if ((n2 ^ n) != 673389809) {
            int cfr_ignored_0 = (0xA55F9A3B ^ n) - 1018179289;
        }
        return !this.dhbd_2.shzl();
    }

    private boolean dkhz_2() {
        int n = 1305995274;
        n = Integer.rotateLeft(n * 1189817299, 6) ^ 0x32118809;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x5BFAD323;
        if ((n2 ^ n) != 1543164707) {
            int cfr_ignored_0 = (0x162D3B29 ^ n) - 1939433743;
        }
        return !this.tzt.shzl();
    }

    private boolean jtk() {
        int n = bdhth.thwq(936556925);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 29);
        int n2 = n ^ 0xE84E2920;
        if ((n2 ^ n) != -397530848) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xDF9C905D ^ n, 14) - 408099454) * -543387555;
            int cfr_ignored_1 = (int)(0x1D2E3E6027D4EB4FL ^ (long)n ^ 0x81B0831A2DB9978DL);
        }
        return !this.tzt.shzl();
    }

    private static String ttha_3(String string, int n, int n2, int n3) {
        int n4 = bdhth.thwq(-519873975);
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 15);
        int n5 = (n4 = n ^ n4) ^ 0x137536FF;
        if ((n5 ^ n4) != 326448895) {
            int cfr_ignored_0 = (Integer.rotateRight(0xF2766CB6 ^ n4, 17) - 1622460741) * -227119945;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xB878C71B ^ n2 - i) + jas_3, 16) ^ khty + i * -1631244775));
        }
        return new String(cArray);
    }

    private static void dhjkh(ArrayList arrayList) {
        int n = -947861985;
        int n2 = (n = Integer.rotateLeft(n * 576220057, 11) ^ 0xF113B1EE) ^ 0x1340AFE0;
        if ((n2 ^ n) != 323006432) {
            int cfr_ignored_0 = (0xD4C069FF ^ n) + -1299540880;
        }
        arrayList.clear();
    }

    private static void tyth() {
        int n = -49579198;
        int n2 = (n = Integer.rotateLeft(n * -391435765, 23) ^ 0xA1026C96) ^ 0xAA63F638;
        if ((n2 ^ n) != -1436289480) {
            int cfr_ignored_0 = (0x57688D7A ^ n) - -1830497799;
        }
        yf.athz_2();
    }

    private static ThreadLocalRandom szh_5() {
        block0: {
            int n = -1470614192;
            int n2 = (n = Integer.rotateLeft(n * 1983697375, 3) ^ 0x79F89FFF) ^ 0x51FC0065;
            if ((n2 ^ n) == 1375469669) break block0;
            int cfr_ignored_0 = (0xF9A43535 ^ n) - 507251819;
        }
        return ThreadLocalRandom.current();
    }

    private static double syq_2(long l) {
        block0: {
            int n = 916530200;
            int n2 = (n = Integer.rotateLeft(n * 132512729, 23) ^ 0xBA16166C) ^ 0x98299A26;
            if ((n2 ^ n) == -1742104026) break block0;
            int cfr_ignored_0 = (0xAE88BE3E ^ n) - 1482947850;
        }
        return Double.longBitsToDouble(l);
    }

    private static double jdhf(long l) {
        block0: {
            int n = bdhth.thwq(34129967);
            int n2 = (n = Integer.rotateRight((int)l ^ n, 28)) ^ 0xE1B2D87C;
            if ((n2 ^ n) == -508372868) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xE3BA1053 ^ n, 15) + -1746560696) * -474345389;
        }
        return Double.longBitsToDouble(l);
    }

    private static double zwth(double d) {
        block0: {
            int n = bdhth.thwq(144241952);
            int n2 = n ^ 0xEB93C997;
            if ((n2 ^ n) == -342636137) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xE30B3CB7 ^ n, 15) - -2101741212) * -485802825;
        }
        return Math.sin(d);
    }

    private static bzk thyj(tjw tjw2, ThreadLocalRandom threadLocalRandom) {
        block0: {
            int n = 1109098140;
            n = Integer.rotateLeft(n * -1662105431, 24) ^ 0x640ABE22;
            tjw tjw3 = tjw2;
            n = Integer.rotateRight((tjw3 != null ? System.identityHashCode(tjw3) : 0) ^ n, 29);
            int n2 = n ^ 0x4A452C09;
            if ((n2 ^ n) == 1246047241) break block0;
            int cfr_ignored_0 = (0x85E5295 ^ n) + -738981738;
        }
        return tjw2.jthgh(threadLocalRandom);
    }

    private static float stw_4(ThreadLocalRandom threadLocalRandom, float f, float f2) {
        block0: {
            int n = bdhth.thwq(782416892);
            ThreadLocalRandom threadLocalRandom2 = threadLocalRandom;
            n = (threadLocalRandom2 != null ? System.identityHashCode(threadLocalRandom2) : 0) ^ n;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 23);
            int n2 = n ^ 0xEF748571;
            if ((n2 ^ n) == -277576335) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xC1D63E8D ^ n, 11) - 2102342222;
            int cfr_ignored_1 = (int)(0x36490B027D4EB4FL ^ (long)n ^ 0xDC10831A2DB9AB18L);
        }
        return threadLocalRandom.nextFloat(f, f2);
    }

    private static float shhf_2(int n) {
        block0: {
            int n2 = -855892698;
            n2 = Integer.rotateLeft(n2 * 0xF1A11A1, 23) ^ 0x37AB784C;
            int n3 = (n2 = n ^ n2) ^ 0xC673F47D;
            if ((n3 ^ n2) == -965479299) break block0;
            int cfr_ignored_0 = (0xA8FE95B ^ n2) + -1521786559;
        }
        return Float.intBitsToFloat(n);
    }

    private static float zzth(ThreadLocalRandom threadLocalRandom, float f, float f2) {
        block0: {
            int n = -1464854727;
            n = Integer.rotateLeft(n * -136371329, 23) ^ 0x623EFA7;
            ThreadLocalRandom threadLocalRandom2 = threadLocalRandom;
            n = (threadLocalRandom2 != null ? System.identityHashCode(threadLocalRandom2) : 0) ^ n;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x2F6F2E65;
            if ((n2 ^ n) == 795815525) break block0;
            int cfr_ignored_0 = (0x87DF395C ^ n) + -1522795732;
        }
        return threadLocalRandom.nextFloat(f, f2);
    }

    private static byq ayd(bzw_2 bzw2_2) {
        block0: {
            int n = 11992221;
            n = Integer.rotateLeft(n * 981433767, 17) ^ 0x49B539CB;
            bzw_2 bzw3_2 = bzw2_2;
            n = (bzw3_2 != null ? System.identityHashCode(bzw3_2) : 0) ^ n;
            int n2 = n ^ 0x5468453;
            if ((n2 ^ n) == 88507475) break block0;
            int cfr_ignored_0 = (0x5F078CE ^ n) - 463376954;
        }
        return bzw2_2.sdsh_4();
    }

    private static int jlt(float f) {
        block0: {
            int n = -374139166;
            n = Integer.rotateLeft(n * 389688075, 27) ^ 0x6812ED7B;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 16);
            int n2 = n ^ 0x417D0139;
            if ((n2 ^ n) == 1098711353) break block0;
            int cfr_ignored_0 = (0xA8CE17DB ^ n) + 574953205;
        }
        return Math.round(f);
    }

    private static float zhz_8(int n) {
        block0: {
            int n2 = -2080772966;
            n2 = Integer.rotateLeft(n2 * 1973396627, 22) ^ 0x3D7F431B;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 4)) ^ 0x3F734ECF;
            if ((n3 ^ n2) == 1064521423) break block0;
            int cfr_ignored_0 = (0xBC8AA255 ^ n2) - 1545778328;
        }
        return Float.intBitsToFloat(n);
    }

    private static float rhd_3(float f) {
        block0: {
            int n = -1307159476;
            n = Integer.rotateLeft(n * -911336061, 27) ^ 0xA1F94C97;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x8ED8CF94;
            if ((n2 ^ n) == -1898393708) break block0;
            int cfr_ignored_0 = (0x3CCE9BD8 ^ n) + -1490635165;
        }
        return class_3532.method_15362((float)f);
    }

    private static void dqgh(class_287 class_2872, Matrix4f matrix4f, double d, double d2, double d3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        int n = 5839066;
        n = Integer.rotateLeft(n * -1636031265, 10) ^ 0xB4117387;
        class_287 class_2873 = class_2872;
        n = Integer.rotateRight((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n, 16);
        n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 27);
        int n2 = n ^ 0x453B26AB;
        if ((n2 ^ n) != 1161504427) {
            int cfr_ignored_0 = (0x45623E71 ^ n) - 451774790;
        }
        tjw.dzth(class_2872, matrix4f, d, d2, d3, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14);
    }

    private static void taz_4(class_287 class_2872, Matrix4f matrix4f, double d, double d2, double d3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        int n = bdhth.thwq(1774223300);
        class_287 class_2873 = class_2872;
        n = Integer.rotateLeft((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n, 19);
        n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 18);
        int n2 = n ^ 0xD4C99B6B;
        if ((n2 ^ n) != -724984981) {
            int cfr_ignored_0 = Integer.rotateRight(0xBD09E4AF ^ n, 10) - -393195412;
        }
        tjw.dzth(class_2872, matrix4f, d, d2, d3, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14);
    }

    private static String[] zda_6(String string) {
        block0: {
            int n = bdhth.thwq(-2003530980);
            int n2 = n ^ 0x829533C9;
            if ((n2 ^ n) == -2104151095) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xA01B8D5 ^ n, 4) - 982712582) * 167885013;
            int cfr_ignored_1 = (int)(0xC8B316E827D4EB4FL ^ (long)n ^ 0xD0A0831A2DB83CB7L);
        }
        return string.split("\u0005\u000f", -1);
    }

    private static CallSite swq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -2072740866;
            n3 = Integer.rotateLeft(n3 * -1323064941, 25) ^ 0x217FF073;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 4);
            int n4 = n3 ^ 0x57ECC3A5;
            if ((n4 ^ n3) != 1475134373) {
                int cfr_ignored_0 = (0xD398B85B ^ n3) - -277122299;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ bgh ^ string.hashCode() ^ n2 + khzb ^ i * -1294831311 ^ bgh, 22) ^ khzb));
            }
            String[] stringArray = tjw.zda_6(new String(cArray));
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

    private static String[] crhtccl018da(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite s5r2cm4nzs5e(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ chyp1nm4hnzeg ^ string.hashCode() ^ n2 + r7b2etrep2 + i * 333529309) + chyp1nm4hnzeg) ^ r7b2etrep2));
            }
            String[] stringArray = tjw.crhtccl018da(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

