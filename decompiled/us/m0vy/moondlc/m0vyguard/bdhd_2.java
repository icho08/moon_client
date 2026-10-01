/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1297
 *  net.minecraft.class_1802
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_2382
 *  net.minecraft.class_239
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_304
 *  net.minecraft.class_310
 *  net.minecraft.class_315
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_4587
 *  net.minecraft.class_7172
 *  net.minecraft.class_746
 *  net.minecraft.class_9779
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4587;
import net.minecraft.class_7172;
import net.minecraft.class_746;
import net.minecraft.class_9779;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bkhr;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.btj_2;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bfd_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tdb;
import us.m0vy.moondlc.m0vyguard.tsf;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.shk_3;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tth_8;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="FreeCam", category=bzw.OTHER, desc="Detaches the camera from your player")
public class bdhd_2
extends bnq {
    private static bdhd_2 shzm;
    public final tay dkth = new tay(this, "Speed").shth_7(Float.intBitsToFloat(0x35FE7C8 ^ 0x3E932B05)).dhbs_2(Float.intBitsToFloat(Integer.reverse(50584016) ^ 0x4B3BC0C0)).rkh_3(Float.intBitsToFloat(Integer.reverse(-1211244549) ^ 0xE2B77F20)).ssd_5(Float.intBitsToFloat(Integer.reverse(-1877140882) ^ 0x49012193));
    public final tay sab = new tay(this, "Motion Y").shth_7(Float.intBitsToFloat(Integer.rotateLeft(0xF52F673 ^ 0x693B1815, 13))).dhbs_2(Float.intBitsToFloat(0x346CAD8E ^ 0x74CCAD8E)).rkh_3(Float.intBitsToFloat(1977404088 - 948960747)).ssd_5(Float.intBitsToFloat(-954793862 + 2005047584));
    public final badh_2 jnl = new badh_2(this, "No Chunk Cull").bts(false);
    public final khd dhhkh_2 = new khd(this, "Render P".concat("osition"));
    public final fy jll = new fy(this.dhhkh_2, "Hitbox").rhh_3();
    public final fy ql = new fy(this.dhhkh_2, "Player");
    public final bzw_2 ka = new bzw_2(this, "Hitbox Fill", this::tthh_3).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-104446143) ^ 0xC19D639F), Float.intBitsToFloat(Integer.reverse(1109243776) ^ 0x43A5B842), Float.intBitsToFloat(Integer.reverse(-1085950423) ^ 0xD77BA2FD), Float.intBitsToFloat(Integer.reverse(1362031391) ^ 0xBA07748A)));
    public final bzw_2 das_2 = new bzw_2(this, "Hitbo".concat("x Outline"), this::tst_3).dhshy(new byq(Float.intBitsToFloat(-1270910430 - 1912042018), Float.intBitsToFloat(0xFB6377F6 ^ 0xB87577F6), Float.intBitsToFloat(Integer.rotateLeft(0x26EDC2BE ^ 0xC6EDCAD1, 19)), Float.intBitsToFloat(Integer.rotateLeft(0x309CD5BD ^ 0x112355BD, 1))));
    private boolean dhghh;
    private boolean jhz_2;
    private boolean dhth_6;
    private float thnl;
    private float hhq;
    private float sthh_3;
    private float shwm;
    private double thtf;
    private double bmd_2;
    private double wk;
    private double dhny;
    private double rkd;
    private double drt_2;
    private float thyd;
    private float sna_2;
    private final bql<tsf> jdj = bdhd_2::jtt_4;
    private final bql<tdb> szb = this::rdb;
    private final bql<shw_3> htz_2 = this::khgha_2;
    private final bql<btt> jmf = this::dmn_2;
    private static final int zkhm = -160290377;
    private static final int tqk = 1038713110;
    private static final int rhb_2 = -1102331929;
    private static final int jrt_2 = -1508455974;
    private static final int w7bb8uhr = 691665494;
    private static final int rlhcagx4kb9 = -832131882;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int htawik11a;

    public static bdhd_2 bfz() {
        block0: {
            int n = bfd_2.sns_3(952525448);
            int n2 = n ^ 0xCEF4DD4E;
            if ((n2 ^ n) == -822813362) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xF632BFC6 ^ n, 17) - -729622475;
        }
        return shzm;
    }

    public bdhd_2() {
        shzm = this;
    }

    @Override
    public void nt() {
        try {
            int n = -57864038;
            n = Integer.rotateLeft(n * 575315829, 3) ^ 0x3D8E1C3;
            int n2 = n ^ 0x7559BCEA;
            if ((n2 ^ n) != 1968815338) {
                int cfr_ignored_0 = (0x89D4AC70 ^ n) - 663553513;
            }
            if ((0x312 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (bdhd_2.mc.field_1724 == null || bdhd_2.mc.field_1687 == null) {
            this.tba(false);
            return;
        }
        this.dhghh = bdhd_2.azm(bdhd_2.mc.field_1724);
        bdhd_2.mc.field_1724.method_5875(true);
        this.jhz_2 = (Boolean)bdhd_2.mc.field_1690.method_42448().method_41753();
        bdhd_2.dhdh_5(bdhd_2.mc.field_1690).method_41748((Object)false);
        if (this.jnl.shzl()) {
            bdhd_2.mc.field_1730 = false;
        }
        this.thnl = bdhd_2.mc.field_1724.method_36454();
        this.hhq = bdhd_2.mc.field_1724.method_36455();
        this.sthh_3 = this.thnl;
        this.shwm = this.hhq;
        this.thtf = bdhd_2.jkhs(bdhd_2.mc.field_1724);
        this.bmd_2 = bdhd_2.mc.field_1724.method_23320();
        this.wk = bdhd_2.mc.field_1724.method_23321();
        this.dhny = this.thtf;
        this.rkd = this.bmd_2;
        this.drt_2 = this.wk;
        this.dhth_6 = bdhd_2.sghdh_2(bdhd_2.mc.field_1724);
        this.thyd = bdhd_2.mc.field_1724.method_36454();
        this.sna_2 = bdhd_2.dhja(bdhd_2.mc.field_1724);
        bdhd_2.mc.field_1724.method_18799(class_243.field_1353);
    }

    @Override
    public void nc() {
        try {
            int n = 899251372;
            n = Integer.rotateLeft(n * -659121855, 10) ^ 0xE23E91F6;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x68AB38FD;
            if ((n2 ^ n) != 1756051709) {
                int cfr_ignored_0 = (0x5D324451 ^ n) + 245535880;
            }
            if ((0x274 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (bdhd_2.mc.field_1724 != null) {
            bdhd_2.mc.field_1724.method_5875(this.dhghh);
            bdhd_2.mc.field_1724.method_18799(class_243.field_1353);
        }
        bdhd_2.tld_2(bdhd_2.mc.field_1690).method_41748((Object)this.jhz_2);
        bdhd_2.mc.field_1730 = true;
    }

    public class_3965 dfy(class_3965 class_39652) {
        int n = 924821792;
        n = Integer.rotateLeft(n * -200546653, 9) ^ 0xE568C4D4;
        n = System.identityHashCode(this) ^ n;
        class_3965 class_39653 = class_39652;
        n = (class_39653 != null ? System.identityHashCode(class_39653) : 0) ^ n;
        int n2 = n ^ 0xF6A9F9DF;
        if ((n2 ^ n) != -156632609) {
            int cfr_ignored_0 = (0xC1B650FF ^ n) + -788557352;
        }
        if (bdhd_2.mc.field_1724 == null || bdhd_2.mc.field_1687 == null || class_39652 == null) {
            return null;
        }
        class_2338 class_23382 = class_39652.method_17777();
        class_243 class_2432 = btj_2.sbz((class_1297)bdhd_2.mc.field_1724);
        double d = bdhd_2.mc.field_1724.method_55754();
        double d2 = d * d;
        class_243 class_2433 = bdhd_2.tdhz_4(class_23382, class_2432);
        if (bdhd_2.zqf(class_2432, class_2433) > d2) {
            return null;
        }
        class_3965 class_39654 = bdhd_2.mc.field_1687.method_17742(new class_3959(class_2432, class_39652.method_17784(), class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)bdhd_2.mc.field_1724));
        if (bdhd_2.kl(class_39654) == class_239.class_240.field_1332 && bdhd_2.thfm(class_39654).equals((Object)class_23382)) {
            return class_39654;
        }
        class_39654 = bdhd_2.mc.field_1687.method_17742(new class_3959(class_2432, class_243.method_24953((class_2382)class_23382), class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)bdhd_2.mc.field_1724));
        if (class_39654.method_17783() == class_239.class_240.field_1332 && class_39654.method_17777().equals((Object)class_23382)) {
            return class_39654;
        }
        class_243 class_2434 = bdhd_2.thd_3(class_23382, class_39652.method_17780());
        if (bdhd_2.ds_4(class_2432, class_2434) > d2) {
            return null;
        }
        return new class_3965(class_2434, class_39652.method_17780(), class_23382, false);
    }

    public boolean rlr() {
        class_243 class_2432;
        int n = -817664921;
        n = Integer.rotateLeft(n * 960867965, 13) ^ 0xBBC4B54B;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x8243F38F;
        if ((n2 ^ n) != -2109475953) {
            int cfr_ignored_0 = (0x4D009FE8 ^ n) - -1749904675;
        }
        if (bdhd_2.mc.field_1724 == null) {
            return false;
        }
        class_243 class_2433 = btj_2.sbz((class_1297)bdhd_2.mc.field_1724);
        return class_2433.method_1025(class_2432 = new class_243(this.thtf, this.bmd_2, this.wk)) > 1.0;
    }

    public float trj_2() {
        block0: {
            int n = 611290591;
            int n2 = (n = Integer.rotateLeft(n * -1983773583, 3) ^ 0xA74BA329) ^ 0xCE59EB8C;
            if ((n2 ^ n) == -832967796) break block0;
            int cfr_ignored_0 = (0xEA366653 ^ n) - 1876704761;
        }
        return class_3532.method_15393((float)this.thyd);
    }

    public float tthl_2() {
        block0: {
            int n = bfd_2.sns_3(-2132278123);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8037AAE;
            if ((n2 ^ n) == 134445742) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x88EB7E3B ^ n, 4) + -1730025376) * -1997832645;
        }
        return class_3532.method_15363((float)this.sna_2, (float)Float.intBitsToFloat(Integer.rotateLeft(0xA9A47BEA ^ 0x4A47BDA, 26)), (float)Float.intBitsToFloat(1308915743 + -189823007));
    }

    /*
     * Unable to fully structure code
     */
    private void trs(class_243 var1_1) {
        var5_2 = 0;
        var3_3 = -584871757;
        var3_3 = Integer.rotateLeft(var3_3 * 1746640773, 23) ^ 1380938548;
        var3_3 = System.identityHashCode(this) ^ var3_3;
        var4_4 = (int)((long)Integer.reverse(var3_3 ^ 1068244997 ^ -355924106) ^ -679055240079863643L ^ -679055240079863643L);
        block28: while (true) {
            if ((var5_2 = Integer.reverse(var4_4) ^ var3_3 ^ -355924106) == 559647976) ** GOTO lbl134
            if (var5_2 == 1050902167) ** GOTO lbl60
            switch (var5_2) {
                case -561221121: {
                    Integer.rotateLeft(1192605321 ^ var3_3, 11) + -1610696238;
                    (int)(-8816050583513011377L ^ (long)var3_3 ^ -3740095342071732577L);
                    var2_5 = bdhd_2.zym(btj_2.sbz((class_1297)bdhd_2.mc.field_1724), var1_1);
                    this.thyd = var2_5[0];
                    this.sna_2 = var2_5[1];
                    return;
                }
                case 1068244997: {
                    Integer.rotateLeft(-777325372 ^ var3_3, 13) - 1745961719;
                    if (!bdhd_2.rtm_2()) {
                        try {
                            var5_2 -= 3;
                            var4_4 = Integer.reverse(var3_3 ^ -561221121 ^ -355924106) + 1964401516 - 1964401516;
                        }
                        catch (IllegalArgumentException v0) {
                            var4_4 = (int)((long)Integer.reverse(var3_3 ^ -561221121 ^ -355924106) ^ 1362699034027783360L ^ 1362699034027783360L);
                        }
                        continue block28;
                    }
                    (int)(4603679197384200704L ^ (long)var3_3 ^ -1811103104860958186L);
                    var4_4 = Integer.reverse(var3_3 ^ 208634265 ^ -355924106) + 322742870 - 322742870;
                    --var5_2;
                    continue block28;
                }
                case 208634265: {
                    (Integer.rotateLeft(1958884337 ^ var3_3, 17) + 669116778) * 1958884337;
                    (int)(-5300563261247919281L ^ (long)var3_3 ^ -4113894111143476944L);
                    throw null;
                }
                case -227623230: {
                    (Integer.rotateRight(-914708321 ^ var3_3, 12) - 1782057596) * -914708321;
                    (int)(-9120495751091656960L ^ (long)var3_3 ^ 553773163979648779L);
                    var4_4 = Integer.reverse(var3_3 ^ 1068244997 ^ -355924106);
                    continue block28;
                }
                case -1895929001: {
                    (Integer.rotateLeft(-759393192 ^ var3_3, 13) + -1993107997) * -759393191;
                    try {
                        if ((756309082539699467L ^ (long)var3_3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var4_4 = (int)((long)Integer.reverse(var3_3 ^ 1068244997 ^ -355924106) ^ -3401409333202594551L ^ -3401409333202594551L);
                    }
                    catch (IllegalStateException v1) {
                        var4_4 = (int)((long)Integer.reverse(var3_3 ^ 1068244997 ^ -355924106) ^ 1408597955869034035L ^ 1408597955869034035L);
                    }
                    var5_2 += 2;
                    continue block28;
                }
lbl60:
                // 1 sources

                (Integer.rotateLeft(488356977 ^ var3_3, 6) + -1967558422) * 488356977;
                (int)(-2330311213892441265L ^ (long)var3_3 ^ -2744799824422890877L);
                var4_4 = Integer.reverse(var3_3 ^ -462603489 ^ -355924106);
                Integer.rotateRight(396223394 ^ var3_3, 5) + -528732199;
                var4_4 = Integer.reverse(var3_3 ^ 1068244997 ^ -355924106);
                var5_2 += 4;
                continue block28;
                case 1507137440: {
                    Integer.rotateLeft(-334510004 ^ var3_3, 16) - -1706631057;
                    var4_4 = Integer.reverse(var3_3 ^ -1564501449 ^ -355924106) ^ -226814205 ^ -226814205;
                    Integer.rotateLeft(-1879094676 ^ var3_3, 4) - 1950851663;
                    var4_4 = (int)((long)Integer.reverse(var3_3 ^ 334212433 ^ -355924106) ^ 4751751683045500109L ^ 4751751683045500109L);
                    (Integer.rotateLeft(1589927248 ^ var3_3, 14) + 2116348907) * 1589927249;
                    var4_4 = Integer.reverse(var3_3 ^ 1068244997 ^ -355924106);
                    continue block28;
                }
                case 681752813: {
                    Integer.rotateLeft(421910020 ^ var3_3, 6) - 267553207;
                    var4_4 = Integer.reverse(Integer.reverse(Integer.reverse(var3_3 ^ -102329689 ^ -355924106)));
                    (Integer.rotateRight(-1430088613 ^ var3_3, 8) + -1309829568) * -1430088613;
                    try {
                        if ((-2014873593456578483L ^ (long)var3_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var4_4 = Integer.reverse(var3_3 ^ 1068244997 ^ -355924106) ^ 1964262629 ^ 1964262629;
                    }
                    catch (ArithmeticException v2) {
                        var4_4 = Integer.reverse(var3_3 ^ 1068244997 ^ -355924106);
                    }
                    continue block28;
                }
                case -1664295212: {
                    (Integer.rotateRight(-1495257390 ^ var3_3, 7) + 964905641) * -1495257389;
                    try {
                        var5_2 -= 3;
                        if ((2939410042728323647L ^ (long)var3_3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var4_4 = Integer.reverse(var3_3 ^ 1068244997 ^ -355924106) ^ 1903170418 ^ 1903170418;
                    }
                    catch (IllegalArgumentException v3) {
                        var4_4 = Integer.reverse(var3_3 ^ 1068244997 ^ -355924106) + 364624491 - 364624491;
                    }
                    --var5_2;
                    continue block28;
                }
                case 1971262280: {
                    Integer.rotateLeft(457160292 ^ var3_3, 6) - 1360311639;
                    try {
                        var5_2 -= 3;
                        if ((9200449123395376675L ^ (long)var3_3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var4_4 = Integer.reverse(var3_3 ^ 1068244997 ^ -355924106);
                    }
                    catch (NoSuchElementException v4) {
                        var4_4 = Integer.reverse(var3_3 ^ 1068244997 ^ -355924106);
                    }
                    var5_2 += 5;
                    continue block28;
                }
                case -333195104: {
                    (Integer.rotateRight(1627504255 ^ var3_3, 15) - -1013731172) * 1627504255;
                    try {
                        ++var5_2;
                        if ((6439575223578741155L ^ (long)var3_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var4_4 = Integer.reverse(var3_3 ^ 1068244997 ^ -355924106) + 1781685136 - 1781685136;
                    }
                    catch (ArithmeticException v5) {
                        var4_4 = Integer.reverse(Integer.reverse(Integer.reverse(var3_3 ^ 1068244997 ^ -355924106)));
                    }
                    var5_2 -= 5;
                    continue block28;
                }
lbl134:
                // 1 sources

                (Integer.rotateLeft(1875489560 ^ var3_3, 16) + -1916121309) * 1875489561;
                var4_4 = Integer.reverse(var3_3 ^ -942750032 ^ -355924106) + -767588838 - -767588838;
                Integer.rotateRight(-1426630677 ^ var3_3, 8) + -1202633552;
                (int)(2925383145062670489L ^ (long)var3_3 ^ -1908964994031682333L);
                var4_4 = Integer.reverse(var3_3 ^ 1068244997 ^ -355924106);
                --var5_2;
                continue block28;
                case -418733326: {
                    (Integer.rotateRight(-1125290113 ^ var3_3, 10) - -451010660) * -1125290113;
                    var4_4 = (int)((long)Integer.reverse(var3_3 ^ -2054904996 ^ -355924106) ^ 7359296037248486404L ^ 7359296037248486404L);
                    Integer.rotateLeft(1846204429 ^ var3_3, 16) - 1471006926;
                    (int)(-6000916554272412849L ^ (long)var3_3 ^ 1229626846731629729L);
                    try {
                        var5_2 -= 5;
                        if ((-2709605421977730043L ^ (long)var3_3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var4_4 = Integer.reverse(var3_3 ^ 1068244997 ^ -355924106);
                    }
                    catch (NoSuchElementException v6) {
                        var4_4 = (int)((long)Integer.reverse(var3_3 ^ 1068244997 ^ -355924106) ^ -2982876542366807408L ^ -2982876542366807408L);
                    }
                    continue block28;
                }
                case 616240544: {
                    Integer.rotateRight(-1335468854 ^ var3_3, 9) + 1623382961;
                    var4_4 = Integer.reverse(Integer.reverse(Integer.reverse(var3_3 ^ -1220672527 ^ -355924106)));
                    (Integer.rotateRight(-642062145 ^ var3_3, 14) - 1644154460) * -642062145;
                    (int)(-8004292632251602002L ^ (long)var3_3 ^ -1588596354937353209L);
                    var4_4 = Integer.reverse(var3_3 ^ 869940655 ^ -355924106) + 1699186613 - 1699186613;
                    (int)(-1346787616151862805L ^ (long)var3_3 ^ -9013917215070587057L);
                    var4_4 = Integer.reverse(Integer.reverse(Integer.reverse(var3_3 ^ 1068244997 ^ -355924106)));
                    continue block28;
                }
            }
            (Integer.rotateLeft(-552157227 ^ var3_3, 14) - 136239622) * -552157227;
            (int)(2135851812078807887L ^ (long)var3_3 ^ -2404778052556319079L);
            var4_4 = (int)((long)Integer.reverse(var3_3 ^ 1068244997 ^ -355924106) ^ 5819368243829137620L ^ 5819368243829137620L);
        }
    }

    private static class_243 tdhz_4(class_2338 class_23382, class_243 class_2432) {
        int n = -854640737;
        n = Integer.rotateLeft(n * -528465611, 21) ^ 0x2659E561;
        class_2338 class_23383 = class_23382;
        n = Integer.rotateLeft((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 9);
        class_243 class_2433 = class_2432;
        n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
        int n2 = n ^ 0x191CB227;
        if ((n2 ^ n) != 421311015) {
            int cfr_ignored_0 = (0xD41385B8 ^ n) - -355518869;
        }
        double d = bdhd_2.nq(class_2432.field_1352, class_23382.method_10263(), (double)class_23382.method_10263() + 1.0);
        double d2 = bdhd_2.tqk(class_2432.field_1351, bdhd_2.adb(class_23382), (double)class_23382.method_10264() + 1.0);
        double d3 = bdhd_2.bmn(class_2432.field_1350, class_23382.method_10260(), (double)class_23382.method_10260() + 1.0);
        return new class_243(d, d2, d3);
    }

    private static class_243 thd_3(class_2338 class_23382, class_2350 class_23502) {
        int n = -942410793;
        int n2 = (n = Integer.rotateLeft(n * -1548057121, 23) ^ 0x91247E57) ^ 0x1C9078AA;
        if ((n2 ^ n) != 479230122) {
            int cfr_ignored_0 = (0xDB438B7D ^ n) + 1134609601;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        double d = (double)class_23382.method_10263() + Double.longBitsToDouble(0xB6583DC1A07BA9C4L ^ 0x89B83DC1A07BA9C4L);
        double d2 = (double)class_23382.method_10264() + Double.longBitsToDouble(0x82AD55782D42C699L ^ 0xBD4D55782D42C699L);
        double d3 = (double)class_23382.method_10260() + Double.longBitsToDouble(0xF01D62C9DE575437L ^ 0xCFFD62C9DE575437L);
        return switch (bkhr.tdhl[class_23502.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> new class_243(d, (double)class_23382.method_10264() + 1.0, d3);
            case 2 -> new class_243(d, (double)bdhd_2.thhy_2(class_23382), d3);
            case 3 -> new class_243(d, d2, (double)bdhd_2.jaf(class_23382));
            case 4 -> new class_243(d, d2, (double)class_23382.method_10260() + 1.0);
            case 5 -> new class_243((double)class_23382.method_10263(), d2, d3);
            case 6 -> new class_243((double)bdhd_2.ddw_3(class_23382) + 1.0, d2, d3);
        };
    }

    /*
     * Unable to fully structure code
     */
    private class_243 dhghl() {
        var3_1 = null;
        var6_2 = 0;
        var4_3 = 1619469863;
        var4_3 = Integer.rotateLeft(var4_3 * 1942344535, 12) ^ -1341134635;
        var5_4 = var4_3 ^ 1313603554;
        block19: while (true) {
            if ((var6_2 = var5_4 ^ var4_3) == -1654386949) ** GOTO lbl186
            if (var6_2 == 1987648554) ** GOTO lbl153
            (Integer.rotateLeft(-988630768 ^ var4_3, 11) + -509538261) * -988630767;
            switch (var6_2) {
                case 1313603554: {
                    Integer.rotateRight(-1085283801 ^ var4_3, 10) - 789185012;
                    if (bdhd_2.mc.field_1765 != null) {
                        (int)(-5450007194431514507L ^ (long)var4_3 ^ -6639768614401686166L);
                        var5_4 = (var4_3 ^ 1931922911) + 1026345042 - 1026345042;
                        (int)(-8821410088570652543L ^ (long)var4_3 ^ -2164395416565274887L);
                        var5_4 = var4_3 ^ -412966381;
                        var6_2 += 3;
                        continue block19;
                    }
                    var5_4 = var4_3 ^ -996889142;
                    (Integer.rotateLeft(1339350905 ^ var4_3, 12) + -1356550430) * 1339350905;
                    (int)(-8257788329197245617L ^ (long)var4_3 ^ 2303735357859477277L);
                    var5_4 = (var4_3 ^ -1917728368) + -991541641 - -991541641;
                    var6_2 -= 3;
                    continue block19;
                }
                case -412966381: {
                    Integer.rotateLeft(1606090145 ^ var4_3, 14) + -1677568582;
                    (int)(-7131358079792911537L ^ (long)var4_3 ^ 6505593810196142017L);
                    if (bdhd_2.sar_4(bdhd_2.mc.field_1765) == class_239.class_240.field_1333) {
                        try {
                            var6_2 += 2;
                            var5_4 = var4_3 ^ -1917728368 ^ -1910501538 ^ -1910501538;
                        }
                        catch (NoSuchElementException v0) {
                            var5_4 = (var4_3 ^ -1917728368) + -916783722 - -916783722;
                        }
                        var6_2 += 3;
                        continue block19;
                    }
                    var5_4 = (var4_3 ^ 1366118236) + -983993752 - -983993752;
                    Integer.rotateRight(-1788384958 ^ var4_3, 5) + 467885625;
                    var5_4 = (var4_3 ^ 419641551) + 2072895764 - 2072895764;
                    var6_2 -= 3;
                    continue block19;
                }
                case -1917728368: {
                    Integer.rotateLeft(-89034620 ^ var4_3, 18) - 1608138551;
                    var1_5 = new class_243(this.thtf, this.bmd_2, this.wk);
                    var2_6 = bdhd_2.thkh(this.thnl, this.hhq);
                    var3_1 = var1_5.method_1019(var2_6.method_1021(Double.longBitsToDouble(2002577239039593215L ^ 6594560009097235199L)));
                    (int)(-2657553398816670549L ^ (long)var4_3 ^ 1150664752736771053L);
                    var5_4 = (int)((long)(var4_3 ^ 1604179731) ^ 5496718286684453365L ^ 5496718286684453365L);
                    (int)(-482659977086792433L ^ (long)var4_3 ^ -8940366192582303925L);
                    var5_4 = Integer.reverse(Integer.reverse(var4_3 ^ -874988140));
                    var6_2 += 3;
                    continue block19;
                }
                case 419641551: {
                    Integer.rotateLeft(279240301 ^ var4_3, 5) - 139759214;
                    (int)(-3308333386689090737L ^ (long)var4_3 ^ 2148361170715150845L);
                    var3_1 = bdhd_2.mc.field_1765.method_17784();
                    try {
                        var6_2 += 3;
                        var5_4 = var4_3 ^ -874988140 ^ -2010987179 ^ -2010987179;
                    }
                    catch (UnsupportedOperationException v1) {
                        var5_4 = (int)((long)(var4_3 ^ -874988140) ^ -4501957632652856448L ^ -4501957632652856448L);
                    }
                    var6_2 += 2;
                    continue block19;
                }
                case -44891230: {
                    (Integer.rotateRight(1389052122 ^ var4_3, 13) + 184187297) * 1389052123;
                    var5_4 = Integer.reverse(Integer.reverse(var4_3 ^ 1313603554));
                    (Integer.rotateLeft(570528540 ^ var4_3, 7) - 579760031) * 570528541;
                    --var6_2;
                    continue block19;
                }
                case -1917859995: {
                    (Integer.rotateLeft(844509304 ^ var4_3, 9) + 483229123) * 844509305;
                    var5_4 = Integer.reverse(Integer.reverse(var4_3 ^ 1313603554));
                    Integer.rotateLeft(604729285 ^ var4_3, 7) - 1639983126;
                    (int)(-1821211302730339505L ^ (long)var4_3 ^ 9115429794257330338L);
                    var6_2 -= 3;
                    continue block19;
                }
                case 405678610: {
                    (Integer.rotateRight(-1269930689 ^ var4_3, 9) - -639901220) * -1269930689;
                    var5_4 = (var4_3 ^ -701531481) + 1195152104 - 1195152104;
                    (Integer.rotateLeft(-205650287 ^ var4_3, 17) + -2006947126) * -205650287;
                    (int)(3534385264935103311L ^ (long)var4_3 ^ -6041434751657979960L);
                    var5_4 = (var4_3 ^ 1903726455) + 1885262917 - 1885262917;
                    Integer.rotateLeft(1576855233 ^ var4_3, 14) + 1711116442;
                    (int)(-6967551325658354865L ^ (long)var4_3 ^ 7820644901388325709L);
                    var5_4 = var4_3 ^ 1313603554 ^ -2059195376 ^ -2059195376;
                    --var6_2;
                    continue block19;
                }
                case 777279796: {
                    (Integer.rotateRight(1323599223 ^ var4_3, 12) - -1844852572) * 1323599223;
                    (int)(7109066538574271474L ^ (long)var4_3 ^ 703445653854054529L);
                    var5_4 = (var4_3 ^ -1054734800) + -1241863866 - -1241863866;
                    (int)(-2045075989611817844L ^ (long)var4_3 ^ 2378680914289781485L);
                    var5_4 = Integer.reverse(Integer.reverse(var4_3 ^ 1313603554));
                    continue block19;
                }
                case -1459534569: {
                    Integer.rotateRight(35898855 ^ var4_3, 3) - 1186108980;
                    var5_4 = var4_3 ^ 580579256;
                    Integer.rotateRight(-1086265145 ^ var4_3, 10) - 758763348;
                    (int)(8280141049925150327L ^ (long)var4_3 ^ 983096873013823488L);
                    var5_4 = var4_3 ^ -1118293283;
                    (int)(2148922549082347002L ^ (long)var4_3 ^ -132773238947998092L);
                    var5_4 = (int)((long)(var4_3 ^ 1313603554) ^ -2285243721871696588L ^ -2285243721871696588L);
                    continue block19;
                }
                case -1254507460: {
                    Integer.rotateRight(-2062178706 ^ var4_3, 3) - 570214029;
                    var5_4 = (var4_3 ^ 679128523) + -1325092099 - -1325092099;
                    (Integer.rotateLeft(1001555005 ^ var4_3, 10) - 1056678558) * 1001555005;
                    (int)(-504356978108863665L ^ (long)var4_3 ^ -6237341335448690735L);
                    (int)(-7322543943472678968L ^ (long)var4_3 ^ -3506009922528175853L);
                    var5_4 = var4_3 ^ 1474627144;
                    (int)(3925652932012628399L ^ (long)var4_3 ^ -8330229287173373660L);
                    var5_4 = (var4_3 ^ 1313603554) + 915780307 - 915780307;
                    var6_2 -= 2;
                    continue block19;
                }
lbl153:
                // 1 sources

                (Integer.rotateRight(80110431 ^ var4_3, 3) - -1738299460) * 80110431;
                var5_4 = var4_3 ^ 1420801222 ^ -194581023 ^ -194581023;
                (Integer.rotateLeft(724602813 ^ var4_3, 8) - 1061095198) * 724602813;
                (int)(-1620696081592161457L ^ (long)var4_3 ^ -4724131860652196139L);
                var5_4 = (var4_3 ^ 1313603554) + 1584905175 - 1584905175;
                continue block19;
                case -1117711717: {
                    Integer.rotateLeft(954693005 ^ var4_3, 10) - -396043442;
                    (int)(-408178641578169521L ^ (long)var4_3 ^ 5336909706893482362L);
                    var5_4 = var4_3 ^ -1307683282 ^ 941400285 ^ 941400285;
                    Integer.rotateLeft(1241339533 ^ var4_3, 12) - -99935666;
                    (int)(-8408228543811228849L ^ (long)var4_3 ^ 869338876541975374L);
                    var5_4 = var4_3 ^ 1313603554;
                    var6_2 -= 4;
                    continue block19;
                }
                case 1727821962: {
                    (Integer.rotateLeft(1012424284 ^ var4_3, 10) - 1393626207) * 1012424285;
                    var5_4 = (var4_3 ^ 280342824) + -1492510589 - -1492510589;
                    (Integer.rotateRight(-1687263589 ^ var4_3, 6) + -692319232) * -1687263589;
                    (int)(3141583874019697396L ^ (long)var4_3 ^ -5280969020910077213L);
                    var5_4 = (int)((long)(var4_3 ^ 1313603554) ^ -4688092617748517103L ^ -4688092617748517103L);
                    ++var6_2;
                    continue block19;
                }
lbl186:
                // 1 sources

                (Integer.rotateLeft(-574244871 ^ var4_3, 14) + -548477342) * -574244871;
                (int)(2267309267676883791L ^ (long)var4_3 ^ -3532929759212629185L);
                (int)(-5048052210806344650L ^ (long)var4_3 ^ -7785085253293777358L);
                var5_4 = var4_3 ^ 1994273560 ^ -1783762922 ^ -1783762922;
                (int)(-7699053561425119726L ^ (long)var4_3 ^ 1321601614636812191L);
                var5_4 = var4_3 ^ 1313603554 ^ 583351519 ^ 583351519;
                var6_2 -= 5;
                continue block19;
                case -874988140: {
                    return var3_1;
                }
            }
            (Integer.rotateLeft(282637272 ^ var4_3, 5) + 245065315) * 282637273;
            var5_4 = Integer.reverse(Integer.reverse(var4_3 ^ 1313603554));
        }
    }

    private static class_243 thkh(float f, float f2) {
        int n = bfd_2.sns_3(-1910737217);
        n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 19);
        n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 25);
        int n2 = n ^ 0x62BAED41;
        if ((n2 ^ n) != 1656417601) {
            int cfr_ignored_0 = (Integer.rotateRight(0xECA69BFE ^ n, 16) - -1400208643) * -324625409;
        }
        float f3 = (float)Math.toRadians(f);
        float f4 = (float)Math.toRadians(f2);
        float f5 = bdhd_2.dhghd(-f4);
        return new class_243((double)(-class_3532.method_15374((float)f3) * f5), (double)(-bdhd_2.tdb_3(-f4)), (double)(class_3532.method_15362((float)f3) * f5));
    }

    /*
     * Unable to fully structure code
     */
    private void zqz_4() {
        var1_1 = 0.0;
        var3_2 = 0.0;
        var5_3 = 0.0;
        var7_4 = 0.0;
        var11_5 = 0;
        var9_6 = 719684674;
        var9_6 = Integer.rotateLeft(var9_6 * 2060220753, 6) ^ 1004478782;
        var9_6 = Integer.rotateRight(System.identityHashCode(this) ^ var9_6, 5);
        var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736;
        block59: while (true) {
            block124: {
                block117: {
                    block127: {
                        block100: {
                            block106: {
                                block122: {
                                    block99: {
                                        block119: {
                                            block110: {
                                                block111: {
                                                    block116: {
                                                        block101: {
                                                            block128: {
                                                                block115: {
                                                                    block118: {
                                                                        block104: {
                                                                            block114: {
                                                                                block109: {
                                                                                    block108: {
                                                                                        block126: {
                                                                                            block125: {
                                                                                                block121: {
                                                                                                    block107: {
                                                                                                        block102: {
                                                                                                            block105: {
                                                                                                                block123: {
                                                                                                                    block129: {
                                                                                                                        block120: {
                                                                                                                            block113: {
                                                                                                                                block112: {
                                                                                                                                    block103: {
                                                                                                                                        var11_5 = var10_7 - -452004736 ^ -452004736 ^ var9_6;
                                                                                                                                        switch (var11_5 & 31) {
                                                                                                                                            case 3: {
                                                                                                                                                if (var11_5 == -525303581) break block99;
                                                                                                                                                if (var11_5 != -378815165) {
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block100;
                                                                                                                                            }
                                                                                                                                            case 5: {
                                                                                                                                                if (var11_5 != 14916197) {
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block101;
                                                                                                                                            }
                                                                                                                                            case 6: {
                                                                                                                                                if (var11_5 != -19656986) {
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block102;
                                                                                                                                            }
                                                                                                                                            case 7: {
                                                                                                                                                if (var11_5 == -1749102329) break;
                                                                                                                                                if (var11_5 != 1420135) {
                                                                                                                                                    Integer.rotateLeft(-1336554047 ^ var9_6, 9) + 1589741978;
                                                                                                                                                    (int)(8279696374595119951L ^ (long)var9_6 ^ 4217765199491975199L);
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block103;
                                                                                                                                            }
                                                                                                                                            case 8: {
                                                                                                                                                if (var11_5 != -87868920) {
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block104;
                                                                                                                                            }
                                                                                                                                            case 10: {
                                                                                                                                                if (var11_5 == 1179792458) break block105;
                                                                                                                                                if (var11_5 != 903887754) {
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block106;
                                                                                                                                            }
                                                                                                                                            case 11: {
                                                                                                                                                if (var11_5 == -324952853) break block107;
                                                                                                                                                if (var11_5 != -1279218805) {
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block108;
                                                                                                                                            }
                                                                                                                                            case 16: {
                                                                                                                                                if (var11_5 != 1296590832) {
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block109;
                                                                                                                                            }
                                                                                                                                            case 20: {
                                                                                                                                                if (var11_5 != -1446971116) {
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block110;
                                                                                                                                            }
                                                                                                                                            case 21: {
                                                                                                                                                if (var11_5 == -927523787) break block111;
                                                                                                                                                if (var11_5 != 788114741) {
                                                                                                                                                    (Integer.rotateRight(1531624755 ^ var9_6, 14) + 308971624) * 1531624755;
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block112;
                                                                                                                                            }
                                                                                                                                            case 23: {
                                                                                                                                                if (var11_5 != 1967344983) {
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block113;
                                                                                                                                            }
                                                                                                                                            case 24: {
                                                                                                                                                if (var11_5 == 1509618136) break block114;
                                                                                                                                                if (var11_5 != -1307194472) {
                                                                                                                                                    (Integer.rotateLeft(-968138248 ^ var9_6, 11) + 125729859) * -968138247;
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block115;
                                                                                                                                            }
                                                                                                                                            case 25: {
                                                                                                                                                if (var11_5 == -1563602727) break block116;
                                                                                                                                                if (var11_5 != -2076885639) {
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block117;
                                                                                                                                            }
                                                                                                                                            case 26: {
                                                                                                                                                if (var11_5 != 1551403642) {
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block118;
                                                                                                                                            }
                                                                                                                                            case 27: {
                                                                                                                                                if (var11_5 != -958294853) {
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block119;
                                                                                                                                            }
                                                                                                                                            case 28: {
                                                                                                                                                if (var11_5 == 122431004) break block120;
                                                                                                                                                if (var11_5 == -1256654820) break block121;
                                                                                                                                                (Integer.rotateLeft(-180908011 ^ var9_6, 17) - -1239936570) * -180908011;
                                                                                                                                                (int)(4000672186176432975L ^ (long)var9_6 ^ -9142163095102569765L);
                                                                                                                                                if (var11_5 != 1291709436) {
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block122;
                                                                                                                                            }
                                                                                                                                            case 29: {
                                                                                                                                                if (var11_5 == 1600287293) break block123;
                                                                                                                                                if (var11_5 != -624915363) {
                                                                                                                                                    (Integer.rotateLeft(1669793620 ^ var9_6, 15) - 297239143) * 1669793621;
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block124;
                                                                                                                                            }
                                                                                                                                            case 30: {
                                                                                                                                                if (var11_5 == -981922146) break block125;
                                                                                                                                                if (var11_5 == -384040226) break block126;
                                                                                                                                                (Integer.rotateLeft(1746579925 ^ var9_6, 16) - -1617352698) * 1746579925;
                                                                                                                                                (int)(-6149630209213273265L ^ (long)var9_6 ^ -4422390685618341759L);
                                                                                                                                                if (var11_5 != 205131966) {
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block127;
                                                                                                                                            }
                                                                                                                                            case 31: {
                                                                                                                                                if (var11_5 == 227312479) ** GOTO lbl123
                                                                                                                                                if (var11_5 == -1678894113) break block128;
                                                                                                                                                (Integer.rotateLeft(-66117764 ^ var9_6, 18) - -1976406209) * -66117763;
                                                                                                                                                if (var11_5 != -1704198273) {
                                                                                                                                                    ** break;
                                                                                                                                                }
                                                                                                                                                break block129;
lbl123:
                                                                                                                                                // 1 sources

                                                                                                                                                Integer.rotateLeft(-281472576 ^ var9_6, 16) + -62470789;
                                                                                                                                                this.bmd_2 -= (double)bdhd_2.bb(this.sab);
                                                                                                                                                var10_7 = Integer.reverse(Integer.reverse((var9_6 ^ -956114079 ^ -452004736) + -452004736));
                                                                                                                                                Integer.rotateRight(68444903 ^ var9_6, 3) - -2099930828;
                                                                                                                                                var10_7 = Integer.reverse(Integer.reverse((var9_6 ^ -324952853 ^ -452004736) + -452004736));
                                                                                                                                                var11_5 += 4;
                                                                                                                                                continue block59;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        Integer.rotateRight(-165241758 ^ var9_6, 17) + -754282727;
                                                                                                                                        this.bmd_2 += (double)this.sab.hkj();
                                                                                                                                        var10_7 = (var9_6 ^ 952174317 ^ -452004736) + -452004736 ^ -1144853383 ^ -1144853383;
                                                                                                                                        Integer.rotateLeft(1905186404 ^ var9_6, 17) - -995519145;
                                                                                                                                        var10_7 = (var9_6 ^ 1600287293 ^ -452004736) + -452004736 ^ 876083492 ^ 876083492;
                                                                                                                                        var11_5 -= 3;
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                    (Integer.rotateLeft(1593857656 ^ var9_6, 14) + -2056775741) * 1593857657;
                                                                                                                                    if (!bdhd_2.khad(bdhd_2.mc.field_1690.field_1903)) {
                                                                                                                                        var10_7 = (var9_6 ^ 1600287293 ^ -452004736) + -452004736 ^ -1241729815 ^ -1241729815;
                                                                                                                                        Integer.rotateRight(1840194914 ^ var9_6, 16) + 1284711961;
                                                                                                                                        var11_5 -= 3;
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                    var10_7 = (int)((long)((var9_6 ^ 317901549 ^ -452004736) + -452004736) ^ 4214542443698469862L ^ 4214542443698469862L);
                                                                                                                                    Integer.rotateLeft(-127287744 ^ var9_6, 18) + 422291707;
                                                                                                                                    var10_7 = (var9_6 ^ -1749102329 ^ -452004736) + -452004736 ^ -1191290736 ^ -1191290736;
                                                                                                                                    var11_5 -= 4;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                (Integer.rotateLeft(883023281 ^ var9_6, 9) + 1677162410) * 883023281;
                                                                                                                                (int)(-715100870020895921L ^ (long)var9_6 ^ 1902914991023473143L);
                                                                                                                                if (bdhd_2.zlq_2(bdhd_2.mc.field_1690.field_1881)) {
                                                                                                                                    try {
                                                                                                                                        if ((-3461348958539793301L ^ (long)var9_6 | 1L) == 0L) {
                                                                                                                                            throw new NoSuchElementException();
                                                                                                                                        }
                                                                                                                                        var10_7 = (var9_6 ^ 1296590832 ^ -452004736) + -452004736;
                                                                                                                                    }
                                                                                                                                    catch (NoSuchElementException v0) {
                                                                                                                                        var10_7 = (var9_6 ^ 1296590832 ^ -452004736) + -452004736;
                                                                                                                                    }
                                                                                                                                    var11_5 += 3;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    var11_5 += 4;
                                                                                                                                    if ((-1757736343481916767L ^ (long)var9_6 | 1L) == 0L) {
                                                                                                                                        throw new ArithmeticException();
                                                                                                                                    }
                                                                                                                                    var10_7 = (int)((long)((var9_6 ^ -87868920 ^ -452004736) + -452004736) ^ -6053832374127517908L ^ -6053832374127517908L);
                                                                                                                                }
                                                                                                                                catch (ArithmeticException v1) {
                                                                                                                                    var10_7 = (int)((long)((var9_6 ^ -87868920 ^ -452004736) + -452004736) ^ 6787278375665582111L ^ 6787278375665582111L);
                                                                                                                                }
                                                                                                                                var11_5 += 5;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            Integer.rotateRight(-2059659378 ^ var9_6, 3) - 648313197;
                                                                                                                            if (!bdhd_2.mc.field_1690.field_1849.method_1434()) {
                                                                                                                                var10_7 = (var9_6 ^ -1660167892 ^ -452004736) + -452004736 + 561391972 - 561391972;
                                                                                                                                (Integer.rotateLeft(1540899960 ^ var9_6, 14) + 596502979) * 1540899961;
                                                                                                                                var10_7 = (var9_6 ^ -1256654820 ^ -452004736) + -452004736;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            (int)(514053166777841802L ^ (long)var9_6 ^ 7796767079502422933L);
                                                                                                                            var10_7 = (var9_6 ^ -1258968895 ^ -452004736) + -452004736 + -319998506 - -319998506;
                                                                                                                            (int)(6348618946549330418L ^ (long)var9_6 ^ 6622414014750334436L);
                                                                                                                            var10_7 = (var9_6 ^ -384040226 ^ -452004736) + -452004736 + 1541816751 - 1541816751;
                                                                                                                            var11_5 -= 2;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        Integer.rotateLeft(-853577812 ^ var9_6, 12) - -617863921;
                                                                                                                        var1_1 += 1.0;
                                                                                                                        var10_7 = (var9_6 ^ 2138516713 ^ -452004736) + -452004736;
                                                                                                                        (Integer.rotateRight(-2035789801 ^ var9_6, 3) - 1388270084) * -2035789801;
                                                                                                                        var10_7 = (var9_6 ^ 788114741 ^ -452004736) + -452004736;
                                                                                                                        var11_5 -= 5;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    Integer.rotateRight(-975537022 ^ var9_6, 11) + -103632135;
                                                                                                                    var7_4 = Math.sqrt(var1_1 * var1_1 + var3_2 * var3_2);
                                                                                                                    this.thtf += (-Math.sin(var5_3) * (var1_1 /= var7_4) + bdhd_2.jht_4(var5_3) * (var3_2 /= var7_4)) * (double)this.dkth.hkj();
                                                                                                                    this.wk += (Math.cos(var5_3) * var1_1 + Math.sin(var5_3) * var3_2) * (double)this.dkth.hkj();
                                                                                                                    try {
                                                                                                                        var10_7 = (int)((long)((var9_6 ^ 1420135 ^ -452004736) + -452004736) ^ 6309446034764240928L ^ 6309446034764240928L);
                                                                                                                    }
                                                                                                                    catch (NoSuchElementException v2) {
                                                                                                                        var10_7 = (var9_6 ^ 1420135 ^ -452004736) + -452004736 + 25655212 - 25655212;
                                                                                                                    }
                                                                                                                    continue;
                                                                                                                }
                                                                                                                (Integer.rotateLeft(-791896107 ^ var9_6, 13) - 1294268934) * -791896107;
                                                                                                                (int)(1332557412918684495L ^ (long)var9_6 ^ -7016464070983710419L);
                                                                                                                if (!bdhd_2.mc.field_1690.field_1832.method_1434()) {
                                                                                                                    try {
                                                                                                                        var11_5 -= 5;
                                                                                                                        if ((-9021120010452896339L ^ (long)var9_6 | 1L) == 0L) {
                                                                                                                            throw new IllegalStateException();
                                                                                                                        }
                                                                                                                        var10_7 = (var9_6 ^ -324952853 ^ -452004736) + -452004736 ^ 2099750872 ^ 2099750872;
                                                                                                                    }
                                                                                                                    catch (IllegalStateException v3) {
                                                                                                                        var10_7 = (var9_6 ^ -324952853 ^ -452004736) + -452004736 + -628391634 - -628391634;
                                                                                                                    }
                                                                                                                    var11_5 += 5;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                var10_7 = (var9_6 ^ 227312479 ^ -452004736) + -452004736;
                                                                                                                var11_5 += 4;
                                                                                                                continue;
                                                                                                            }
                                                                                                            Integer.rotateLeft(1411563657 ^ var9_6, 13) + 882044882;
                                                                                                            (int)(-7597450851332592817L ^ (long)var9_6 ^ 2312742557114204401L);
                                                                                                            var3_2 += 1.0;
                                                                                                            try {
                                                                                                                var11_5 -= 4;
                                                                                                                var10_7 = (int)((long)((var9_6 ^ 1967344983 ^ -452004736) + -452004736) ^ 1126298960120607606L ^ 1126298960120607606L);
                                                                                                            }
                                                                                                            catch (ArithmeticException v4) {
                                                                                                                var10_7 = Integer.reverse(Integer.reverse((var9_6 ^ 1967344983 ^ -452004736) + -452004736));
                                                                                                            }
                                                                                                            continue;
                                                                                                        }
                                                                                                        (Integer.rotateRight(-2103043714 ^ var9_6, 3) - -696601219) * -2103043713;
                                                                                                        if (var3_2 == 0.0) {
                                                                                                            var10_7 = (var9_6 ^ 1420135 ^ -452004736) + -452004736 ^ 2120579911 ^ 2120579911;
                                                                                                            Integer.rotateLeft(-1179856692 ^ var9_6, 10) - -2142574609;
                                                                                                            var11_5 -= 2;
                                                                                                            continue;
                                                                                                        }
                                                                                                        (int)(4920968389426777321L ^ (long)var9_6 ^ 7506315137300899140L);
                                                                                                        var10_7 = (int)((long)((var9_6 ^ -1704198273 ^ -452004736) + -452004736) ^ 6471698250438095011L ^ 6471698250438095011L);
                                                                                                        continue;
                                                                                                    }
                                                                                                    Integer.rotateLeft(-1045528664 ^ var9_6, 11) + 2021594259;
                                                                                                    return;
                                                                                                }
                                                                                                (Integer.rotateRight(615327198 ^ var9_6, 7) - 1968518429) * 615327199;
                                                                                                var5_3 = bdhd_2.skhs(this.thnl);
                                                                                                if (var1_1 != 0.0) {
                                                                                                    (int)(-678874566852701739L ^ (long)var9_6 ^ -5536177562049560327L);
                                                                                                    var10_7 = (var9_6 ^ -537568822 ^ -452004736) + -452004736 ^ 1391522778 ^ 1391522778;
                                                                                                    (int)(1222974791282018905L ^ (long)var9_6 ^ 4566486802383604768L);
                                                                                                    var10_7 = Integer.reverse(Integer.reverse((var9_6 ^ -1704198273 ^ -452004736) + -452004736));
                                                                                                    continue;
                                                                                                }
                                                                                                try {
                                                                                                    var11_5 += 5;
                                                                                                    var10_7 = Integer.reverse(Integer.reverse((var9_6 ^ -19656986 ^ -452004736) + -452004736));
                                                                                                }
                                                                                                catch (UnsupportedOperationException v5) {
                                                                                                    var10_7 = (var9_6 ^ -19656986 ^ -452004736) + -452004736;
                                                                                                }
                                                                                                --var11_5;
                                                                                                continue;
                                                                                            }
                                                                                            Integer.rotateRight(1435316422 ^ var9_6, 13) - 1618380597;
                                                                                            var3_2 -= 1.0;
                                                                                            (int)(3204797459028727067L ^ (long)var9_6 ^ -8507695222575991518L);
                                                                                            var10_7 = (int)((long)((var9_6 ^ 1138196176 ^ -452004736) + -452004736) ^ -4545421068881310995L ^ -4545421068881310995L);
                                                                                            (int)(1825925185785848205L ^ (long)var9_6 ^ 567531460404027260L);
                                                                                            var10_7 = (var9_6 ^ -1256654820 ^ -452004736) + -452004736 ^ 1869974919 ^ 1869974919;
                                                                                            var11_5 += 5;
                                                                                            continue;
                                                                                        }
                                                                                        Integer.rotateRight(1206762670 ^ var9_6, 11) - -1171818419;
                                                                                        var3_2 -= 1.0;
                                                                                        try {
                                                                                            --var11_5;
                                                                                            if ((-5479369645619624919L ^ (long)var9_6 | 1L) == 0L) {
                                                                                                throw new IllegalStateException();
                                                                                            }
                                                                                            var10_7 = (var9_6 ^ -1256654820 ^ -452004736) + -452004736 ^ -1931668426 ^ -1931668426;
                                                                                        }
                                                                                        catch (IllegalStateException v6) {
                                                                                            var10_7 = (int)((long)((var9_6 ^ -1256654820 ^ -452004736) + -452004736) ^ 931807441716213831L ^ 931807441716213831L);
                                                                                        }
                                                                                        var11_5 -= 5;
                                                                                        continue;
                                                                                    }
                                                                                    Integer.rotateLeft(2066125801 ^ var9_6, 18) + -301365134;
                                                                                    (int)(-5074362898729079985L ^ (long)var9_6 ^ -8730083729198227719L);
                                                                                    var1_1 = 0.0;
                                                                                    var3_2 = 0.0;
                                                                                    if (!bdhd_2.mc.field_1690.field_1894.method_1434()) {
                                                                                        try {
                                                                                            ++var11_5;
                                                                                            if ((5316601198399078675L ^ (long)var9_6 | 1L) == 0L) {
                                                                                                throw new IllegalStateException();
                                                                                            }
                                                                                            var10_7 = Integer.reverse(Integer.reverse((var9_6 ^ 788114741 ^ -452004736) + -452004736));
                                                                                        }
                                                                                        catch (IllegalStateException v7) {
                                                                                            var10_7 = (var9_6 ^ 788114741 ^ -452004736) + -452004736 + -335421941 - -335421941;
                                                                                        }
                                                                                        var11_5 += 5;
                                                                                        continue;
                                                                                    }
                                                                                    (int)(-2255051457905031095L ^ (long)var9_6 ^ 1746242185049959609L);
                                                                                    var10_7 = Integer.reverse(Integer.reverse((var9_6 ^ 1214012344 ^ -452004736) + -452004736));
                                                                                    (int)(-6525485276609760803L ^ (long)var9_6 ^ 6781583174865315632L);
                                                                                    var10_7 = Integer.reverse(Integer.reverse((var9_6 ^ 122431004 ^ -452004736) + -452004736));
                                                                                    var11_5 -= 4;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateRight(-2131139822 ^ var9_6, 3) + -1567580567) * -2131139821;
                                                                                var1_1 -= 1.0;
                                                                                var10_7 = Integer.reverse(Integer.reverse((var9_6 ^ -87868920 ^ -452004736) + -452004736));
                                                                                Integer.rotateLeft(743540300 ^ var9_6, 8) - 1648157295;
                                                                                continue;
                                                                            }
                                                                            (Integer.rotateRight(452473754 ^ var9_6, 6) + 1215028961) * 452473755;
                                                                            if (bdhd_2.mc.field_1690.field_1913.method_1434()) {
                                                                                try {
                                                                                    var11_5 += 5;
                                                                                    if ((7791386754759929269L ^ (long)var9_6 | 1L) == 0L) {
                                                                                        throw new UnsupportedOperationException();
                                                                                    }
                                                                                    var10_7 = (var9_6 ^ 1179792458 ^ -452004736) + -452004736 ^ 1698939436 ^ 1698939436;
                                                                                }
                                                                                catch (UnsupportedOperationException v8) {
                                                                                    var10_7 = (var9_6 ^ 1179792458 ^ -452004736) + -452004736 + 839439049 - 839439049;
                                                                                }
                                                                                var11_5 -= 3;
                                                                                continue;
                                                                            }
                                                                            (int)(1524483386326093807L ^ (long)var9_6 ^ -1850720696997935231L);
                                                                            var10_7 = (var9_6 ^ 1967344983 ^ -452004736) + -452004736 ^ -743470198 ^ -743470198;
                                                                            continue;
                                                                        }
                                                                        Integer.rotateRight(1156394990 ^ var9_6, 11) - 1561750797;
                                                                        if (!bdhd_2.mc.field_1690.field_1913.method_1434()) {
                                                                            try {
                                                                                var11_5 += 4;
                                                                                if ((2984659046590308225L ^ (long)var9_6 | 1L) == 0L) {
                                                                                    throw new IllegalStateException();
                                                                                }
                                                                                var10_7 = (var9_6 ^ 1967344983 ^ -452004736) + -452004736 + 1554837187 - 1554837187;
                                                                            }
                                                                            catch (IllegalStateException v9) {
                                                                                var10_7 = (int)((long)((var9_6 ^ 1967344983 ^ -452004736) + -452004736) ^ 7320063853775203279L ^ 7320063853775203279L);
                                                                            }
                                                                            var11_5 -= 5;
                                                                            continue;
                                                                        }
                                                                        var10_7 = (int)((long)((var9_6 ^ 1556590679 ^ -452004736) + -452004736) ^ -1863291219813237421L ^ -1863291219813237421L);
                                                                        Integer.rotateLeft(-1791467448 ^ var9_6, 5) + 372328435;
                                                                        var10_7 = (var9_6 ^ 1179792458 ^ -452004736) + -452004736 ^ -1743941951 ^ -1743941951;
                                                                        continue;
                                                                    }
                                                                    (Integer.rotateRight(-196896650 ^ var9_6, 17) - -1735584379) * -196896649;
                                                                    var10_7 = (var9_6 ^ -348255816 ^ -452004736) + -452004736 ^ 1587660839 ^ 1587660839;
                                                                    Integer.rotateLeft(-14629492 ^ var9_6, 18) - -380269777;
                                                                    var10_7 = (int)((long)((var9_6 ^ -1716979462 ^ -452004736) + -452004736) ^ 7110046522227921768L ^ 7110046522227921768L);
                                                                    Integer.rotateLeft(-605524092 ^ var9_6, 14) - -1518133193;
                                                                    var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736;
                                                                    var11_5 += 5;
                                                                    continue;
                                                                }
                                                                (Integer.rotateLeft(-1703973743 ^ var9_6, 6) + -1210334006) * -1703973743;
                                                                (int)(6403488289849142095L ^ (long)var9_6 ^ 8658314432079273066L);
                                                                var10_7 = (var9_6 ^ 778248539 ^ -452004736) + -452004736 + -1028704354 - -1028704354;
                                                                (Integer.rotateLeft(1633566461 ^ var9_6, 15) - -825802786) * 1633566461;
                                                                (int)(-6634768996047197361L ^ (long)var9_6 ^ -2526375242495366648L);
                                                                try {
                                                                    var11_5 -= 2;
                                                                    if ((-7124724017097240569L ^ (long)var9_6 | 1L) == 0L) {
                                                                        throw new NoSuchElementException();
                                                                    }
                                                                    var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736 ^ 74436140 ^ 74436140;
                                                                }
                                                                catch (NoSuchElementException v10) {
                                                                    var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736 + 1630974394 - 1630974394;
                                                                }
                                                                continue;
                                                            }
                                                            Integer.rotateRight(1961770894 ^ var9_6, 17) - 758600045;
                                                            var10_7 = (int)((long)((var9_6 ^ -598841583 ^ -452004736) + -452004736) ^ 891520627460371940L ^ 891520627460371940L);
                                                            (Integer.rotateLeft(1882650841 ^ var9_6, 17) + -1694121598) * 1882650841;
                                                            (int)(-5583242100111774897L ^ (long)var9_6 ^ 5816543067208468697L);
                                                            var10_7 = (var9_6 ^ -1931415132 ^ -452004736) + -452004736 ^ 1232976160 ^ 1232976160;
                                                            (Integer.rotateLeft(250447837 ^ var9_6, 4) - -752807170) * 250447837;
                                                            (int)(-3720208724467061937L ^ (long)var9_6 ^ -5859038966749579921L);
                                                            var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736 + -270499952 - -270499952;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(1541288749 ^ var9_6, 14) - 608555438;
                                                        (int)(-7391360195708523697L ^ (long)var9_6 ^ -4084620713565577464L);
                                                        var10_7 = Integer.reverse(Integer.reverse((var9_6 ^ -1386409765 ^ -452004736) + -452004736));
                                                        Integer.rotateLeft(-1836573912 ^ var9_6, 5) + -1025971949;
                                                        try {
                                                            if ((-2555754766960354343L ^ (long)var9_6 | 1L) == 0L) {
                                                                throw new IllegalStateException();
                                                            }
                                                            var10_7 = Integer.reverse(Integer.reverse((var9_6 ^ -1279218805 ^ -452004736) + -452004736));
                                                        }
                                                        catch (IllegalStateException v11) {
                                                            var10_7 = (int)((long)((var9_6 ^ -1279218805 ^ -452004736) + -452004736) ^ -4503165535287322826L ^ -4503165535287322826L);
                                                        }
                                                        continue;
                                                    }
                                                    Integer.rotateRight(516965123 ^ var9_6, 6) + -1080705896;
                                                    var10_7 = (int)((long)((var9_6 ^ 199664026 ^ -452004736) + -452004736) ^ 5766887759958142952L ^ 5766887759958142952L);
                                                    (Integer.rotateRight(-641658574 ^ var9_6, 14) + 1656665161) * -641658573;
                                                    var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736 + -336943962 - -336943962;
                                                    continue;
                                                }
                                                (Integer.rotateRight(1901180798 ^ var9_6, 17) - -1119692931) * 1901180799;
                                                var10_7 = (int)((long)((var9_6 ^ 781687699 ^ -452004736) + -452004736) ^ -6673037648222831613L ^ -6673037648222831613L);
                                                (Integer.rotateLeft(-259789484 ^ var9_6, 17) - 609705063) * -259789483;
                                                var10_7 = Integer.reverse(Integer.reverse((var9_6 ^ 1535366139 ^ -452004736) + -452004736));
                                                (Integer.rotateRight(-1552310505 ^ var9_6, 7) - -803740924) * -1552310505;
                                                var10_7 = Integer.reverse(Integer.reverse((var9_6 ^ -1279218805 ^ -452004736) + -452004736));
                                                var11_5 += 3;
                                                continue;
                                            }
                                            Integer.rotateRight(616441927 ^ var9_6, 7) - 2003075028;
                                            try {
                                                var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736 ^ 1974599460 ^ 1974599460;
                                            }
                                            catch (ArithmeticException v12) {
                                                var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736 + 151566411 - 151566411;
                                            }
                                            var11_5 -= 2;
                                            continue;
                                        }
                                        Integer.rotateRight(-1566356886 ^ var9_6, 7) + -1239178735;
                                        var10_7 = (var9_6 ^ -1176364840 ^ -452004736) + -452004736 ^ -1233739911 ^ -1233739911;
                                        (Integer.rotateRight(-1817823502 ^ var9_6, 5) + -444709239) * -1817823501;
                                        (int)(-4254532087345046183L ^ (long)var9_6 ^ 5064188017746650168L);
                                        var10_7 = (int)((long)((var9_6 ^ -1279218805 ^ -452004736) + -452004736) ^ -2877507012009200574L ^ -2877507012009200574L);
                                        continue;
                                    }
                                    (Integer.rotateRight(2065973498 ^ var9_6, 18) + -306086527) * 2065973499;
                                    try {
                                        var11_5 -= 3;
                                        if ((3171870058551164489L ^ (long)var9_6 | 1L) == 0L) {
                                            throw new IllegalArgumentException();
                                        }
                                        var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736 + -1858562795 - -1858562795;
                                    }
                                    catch (IllegalArgumentException v13) {
                                        var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736;
                                    }
                                    var11_5 -= 4;
                                    continue;
                                }
                                (Integer.rotateLeft(-1438649127 ^ var9_6, 8) + -1575205502) * -1438649127;
                                (int)(7533777687628016463L ^ (long)var9_6 ^ 5240082314905091275L);
                                var10_7 = (var9_6 ^ 671550943 ^ -452004736) + -452004736 ^ 532374930 ^ 532374930;
                                Integer.rotateRight(-242702001 ^ var9_6, 17) - 1139417036;
                                try {
                                    var10_7 = Integer.reverse(Integer.reverse((var9_6 ^ -1279218805 ^ -452004736) + -452004736));
                                }
                                catch (IllegalArgumentException v14) {
                                    var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736;
                                }
                                continue;
                            }
                            (Integer.rotateRight(141910139 ^ var9_6, 4) + 177491488) * 141910139;
                            try {
                                var11_5 += 4;
                                var10_7 = (int)((long)((var9_6 ^ -1279218805 ^ -452004736) + -452004736) ^ -4379244498324507964L ^ -4379244498324507964L);
                            }
                            catch (IllegalArgumentException v15) {
                                var10_7 = Integer.reverse(Integer.reverse((var9_6 ^ -1279218805 ^ -452004736) + -452004736));
                            }
                            var11_5 -= 4;
                            continue;
                        }
                        (Integer.rotateRight(1246598843 ^ var9_6, 12) + 63102944) * 1246598843;
                        var10_7 = (var9_6 ^ 241826851 ^ -452004736) + -452004736 ^ 441099538 ^ 441099538;
                        Integer.rotateRight(1046199299 ^ var9_6, 10) + -1854315624;
                        (int)(4490173489432387043L ^ (long)var9_6 ^ 7246184388690563441L);
                        var10_7 = (var9_6 ^ -371482447 ^ -452004736) + -452004736;
                        (int)(-4154687705840223599L ^ (long)var9_6 ^ -2997631707718082178L);
                        var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736;
                        var11_5 -= 5;
                        continue;
                    }
                    Integer.rotateLeft(-663923136 ^ var9_6, 14) + 966463739;
                    try {
                        var11_5 -= 4;
                        if ((69728693732232041L ^ (long)var9_6 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736;
                    }
                    catch (IllegalArgumentException v16) {
                        var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736 + -1873387059 - -1873387059;
                    }
                    var11_5 += 5;
                    continue;
                }
                (Integer.rotateRight(213142203 ^ var9_6, 4) + -1909281824) * 213142203;
                var10_7 = (var9_6 ^ -201047352 ^ -452004736) + -452004736 + 366426850 - 366426850;
                Integer.rotateRight(-1157462710 ^ var9_6, 10) + -1448361167;
                try {
                    var11_5 -= 3;
                    var10_7 = (int)((long)((var9_6 ^ -1279218805 ^ -452004736) + -452004736) ^ -1914699657512739933L ^ -1914699657512739933L);
                }
                catch (ArithmeticException v17) {
                    var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736 + -1465452222 - -1465452222;
                }
                var11_5 -= 5;
                continue;
            }
            Integer.rotateLeft(-1351031963 ^ var9_6, 8) - 1140926582;
            (int)(7911220736450423631L ^ (long)var9_6 ^ 7476119529894540869L);
            try {
                var11_5 += 3;
                var10_7 = (int)((long)((var9_6 ^ -1279218805 ^ -452004736) + -452004736) ^ 3391826523235112998L ^ 3391826523235112998L);
            }
            catch (IllegalStateException v18) {
                var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736 ^ -50365294 ^ -50365294;
            }
            continue;
lbl579:
            // 20 sources

            Integer.rotateRight(1557188775 ^ var9_6, 14) - 1101456244;
            var10_7 = (var9_6 ^ -1279218805 ^ -452004736) + -452004736 + -463107474 - -463107474;
        }
    }

    /*
     * Unable to fully structure code
     */
    private double afz_2(double var1_1, double var3_2, float var5_3) {
        var6_4 = 0.0;
        var10_5 = 0;
        var8_6 = 1581457430;
        var8_6 = Integer.rotateLeft(var8_6 * 1572753149, 8) ^ 492963161;
        var8_6 = Integer.rotateRight(System.identityHashCode(this) ^ var8_6, 20);
        var9_7 = Integer.reverse(var8_6 ^ 1675151265 ^ -815564712) ^ 388066461 ^ 388066461;
        while (true) {
            block51: {
                block49: {
                    block50: {
                        block46: {
                            block48: {
                                block43: {
                                    block41: {
                                        block45: {
                                            block52: {
                                                block40: {
                                                    block47: {
                                                        block44: {
                                                            block42: {
                                                                var10_5 = Integer.reverse(var9_7) ^ var8_6 ^ -815564712;
                                                                switch (var10_5 & 7) {
                                                                    case 0: {
                                                                        if (var10_5 == 797776072) break block40;
                                                                        if (var10_5 != -646148400) {
                                                                            (Integer.rotateLeft(1611525593 ^ var8_6, 15) + -1509069694) * 1611525593;
                                                                            (int)(-6719577471813620913L ^ (long)var8_6 ^ 8842962016801450159L);
                                                                            ** break;
                                                                        }
                                                                        break block41;
                                                                    }
                                                                    case 1: {
                                                                        if (var10_5 != 1675151265) {
                                                                            ** break;
                                                                        }
                                                                        break block42;
                                                                    }
                                                                    case 2: {
                                                                        if (var10_5 != -1009570830) {
                                                                            ** break;
                                                                        }
                                                                        break block43;
                                                                    }
                                                                    case 3: {
                                                                        if (var10_5 == -1236454149) break block44;
                                                                        if (var10_5 != 284797251) {
                                                                            (Integer.rotateLeft(443018009 ^ var8_6, 6) + 921900866) * 443018009;
                                                                            (int)(-2822273569888343217L ^ (long)var8_6 ^ 8590760437668650107L);
                                                                            ** break;
                                                                        }
                                                                        break block45;
                                                                    }
                                                                    case 4: {
                                                                        if (var10_5 == -11844724) break;
                                                                        if (var10_5 != 1315180724) {
                                                                            (Integer.rotateLeft(1995765208 ^ var8_6, 17) + 1812423779) * 1995765209;
                                                                            ** break;
                                                                        }
                                                                        break block46;
                                                                    }
                                                                    case 5: {
                                                                        if (var10_5 != 636481357) {
                                                                            ** break;
                                                                        }
                                                                        break block47;
                                                                    }
                                                                    case 6: {
                                                                        if (var10_5 == 628408606) break block48;
                                                                        if (var10_5 != 331434398) {
                                                                            ** break;
                                                                        }
                                                                        break block49;
                                                                    }
                                                                    case 7: {
                                                                        if (var10_5 == -687594545) break block50;
                                                                        if (var10_5 == 538324247) break block51;
                                                                        if (var10_5 != 1347661943) {
                                                                            ** break;
                                                                        }
                                                                        break block52;
                                                                    }
                                                                }
                                                                (Integer.rotateLeft(1311019793 ^ var8_6, 12) + 2060152394) * 1311019793;
                                                                (int)(-8316392402036921521L ^ (long)var8_6 ^ -8707565731061385987L);
                                                                yf.athz_2();
                                                                throw null;
                                                            }
                                                            (Integer.rotateRight(-478636673 ^ var8_6, 15) - -1879590500) * -478636673;
                                                            if (!yf.khdha_2()) {
                                                                var9_7 = Integer.reverse(var8_6 ^ -1691015014 ^ -815564712);
                                                                (Integer.rotateRight(-993396290 ^ var8_6, 11) - -657269443) * -993396289;
                                                                var9_7 = Integer.reverse(var8_6 ^ -11844724 ^ -815564712);
                                                                continue;
                                                            }
                                                            (int)(-1338604703172979609L ^ (long)var8_6 ^ 6434084596075755273L);
                                                            var9_7 = (int)((long)Integer.reverse(var8_6 ^ 107747033 ^ -815564712) ^ 3216936722965510919L ^ 3216936722965510919L);
                                                            (int)(8315561504622177855L ^ (long)var8_6 ^ 7147812281220942620L);
                                                            var9_7 = Integer.reverse(var8_6 ^ -1236454149 ^ -815564712) ^ -1754424904 ^ -1754424904;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(-1382207732 ^ var8_6, 8) - 174477743;
                                                        var6_4 = var1_1 + (var3_2 - var1_1) * (double)var5_3;
                                                        try {
                                                            var10_5 -= 4;
                                                            if ((8127994326227087257L ^ (long)var8_6 | 1L) == 0L) {
                                                                throw new UnsupportedOperationException();
                                                            }
                                                            var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ 538324247 ^ -815564712)));
                                                        }
                                                        catch (UnsupportedOperationException v0) {
                                                            var9_7 = Integer.reverse(var8_6 ^ 538324247 ^ -815564712) + -838130994 - -838130994;
                                                        }
                                                        var10_5 += 3;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(552030320 ^ var8_6, 7) + 6315211) * 552030321;
                                                    var9_7 = Integer.reverse(var8_6 ^ -1807380305 ^ -815564712);
                                                    (Integer.rotateRight(1738321394 ^ var8_6, 15) + -1873367159) * 1738321395;
                                                    var9_7 = Integer.reverse(var8_6 ^ 774453902 ^ -815564712) + -366729143 - -366729143;
                                                    Integer.rotateRight(1972858542 ^ var8_6, 17) - 1102317133;
                                                    var9_7 = Integer.reverse(var8_6 ^ 1675151265 ^ -815564712) + 1613411501 - 1613411501;
                                                    var10_5 -= 4;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(390905625 ^ var8_6, 5) + -693583038) * 390905625;
                                                (int)(-3026963052561634481L ^ (long)var8_6 ^ -2361993856096401875L);
                                                (int)(-8986857843178245527L ^ (long)var8_6 ^ 8484544654962109249L);
                                                var9_7 = (int)((long)Integer.reverse(var8_6 ^ 174513080 ^ -815564712) ^ 1369687238872947129L ^ 1369687238872947129L);
                                                (int)(-5047013476058811796L ^ (long)var8_6 ^ 3640986011640454715L);
                                                var9_7 = Integer.reverse(var8_6 ^ 1675151265 ^ -815564712);
                                                var10_5 -= 2;
                                                continue;
                                            }
                                            (Integer.rotateRight(-2032649477 ^ var8_6, 3) + 1485620128) * -2032649477;
                                            var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ 4356712 ^ -815564712)));
                                            Integer.rotateRight(542606731 ^ var8_6, 7) + -285816048;
                                            var9_7 = (int)((long)Integer.reverse(var8_6 ^ 1675151265 ^ -815564712) ^ 2631626612619460386L ^ 2631626612619460386L);
                                            var10_5 += 3;
                                            continue;
                                        }
                                        Integer.rotateLeft(-375273920 ^ var8_6, 16) + 1324654843;
                                        var9_7 = Integer.reverse(var8_6 ^ -2086250275 ^ -815564712) + -1381081882 - -1381081882;
                                        Integer.rotateLeft(-988195796 ^ var8_6, 11) - -496054129;
                                        try {
                                            if ((7264571472941837879L ^ (long)var8_6 | 1L) == 0L) {
                                                throw new IllegalArgumentException();
                                            }
                                            var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ 1675151265 ^ -815564712)));
                                        }
                                        catch (IllegalArgumentException v1) {
                                            var9_7 = Integer.reverse(var8_6 ^ 1675151265 ^ -815564712) + -625632538 - -625632538;
                                        }
                                        var10_5 += 2;
                                        continue;
                                    }
                                    (Integer.rotateLeft(-661118248 ^ var8_6, 14) + 1053415267) * -661118247;
                                    try {
                                        var10_5 -= 2;
                                        var9_7 = Integer.reverse(var8_6 ^ 1675151265 ^ -815564712) ^ 839819229 ^ 839819229;
                                    }
                                    catch (UnsupportedOperationException v2) {
                                        var9_7 = Integer.reverse(var8_6 ^ 1675151265 ^ -815564712) ^ 1658593674 ^ 1658593674;
                                    }
                                    var10_5 -= 3;
                                    continue;
                                }
                                Integer.rotateLeft(-1850520375 ^ var8_6, 5) + -1458312302;
                                (int)(5981311318392892239L ^ (long)var8_6 ^ 4078153611043474386L);
                                var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ 1675151265 ^ -815564712)));
                                ++var10_5;
                                continue;
                            }
                            (Integer.rotateRight(-1789918437 ^ var8_6, 5) + 420347776) * -1789918437;
                            var9_7 = Integer.reverse(var8_6 ^ -1193432264 ^ -815564712);
                            (Integer.rotateRight(936072146 ^ var8_6, 9) + -973290071) * 936072147;
                            try {
                                if ((-1448821764992385217L ^ (long)var8_6 | 1L) == 0L) {
                                    throw new UnsupportedOperationException();
                                }
                                var9_7 = Integer.reverse(var8_6 ^ 1675151265 ^ -815564712);
                            }
                            catch (UnsupportedOperationException v3) {
                                var9_7 = Integer.reverse(var8_6 ^ 1675151265 ^ -815564712);
                            }
                            continue;
                        }
                        (Integer.rotateRight(-820301638 ^ var8_6, 12) + 413697473) * -820301637;
                        try {
                            --var10_5;
                            if ((-1860980647448623677L ^ (long)var8_6 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var9_7 = Integer.reverse(var8_6 ^ 1675151265 ^ -815564712) + 2057333682 - 2057333682;
                        }
                        catch (IllegalStateException v4) {
                            var9_7 = (int)((long)Integer.reverse(var8_6 ^ 1675151265 ^ -815564712) ^ -7236979932260716652L ^ -7236979932260716652L);
                        }
                        var10_5 += 5;
                        continue;
                    }
                    (Integer.rotateLeft(-1844951403 ^ var8_6, 5) - -1285674170) * -1844951403;
                    (int)(5817217677622831951L ^ (long)var8_6 ^ 3179685485383060644L);
                    var9_7 = Integer.reverse(var8_6 ^ 682933656 ^ -815564712);
                    (Integer.rotateLeft(-1724519595 ^ var8_6, 6) - -1847255418) * -1724519595;
                    (int)(6595316492954561359L ^ (long)var8_6 ^ 8620033835246623455L);
                    try {
                        var10_5 -= 5;
                        if ((-764372140262977541L ^ (long)var8_6 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var9_7 = Integer.reverse(var8_6 ^ 1675151265 ^ -815564712);
                    }
                    catch (IllegalStateException v5) {
                        var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ 1675151265 ^ -815564712)));
                    }
                    ++var10_5;
                    continue;
                }
                Integer.rotateRight(-815714046 ^ var8_6, 12) + 555912825;
                var9_7 = Integer.reverse(Integer.reverse(Integer.reverse(var8_6 ^ 1410400735 ^ -815564712)));
                Integer.rotateRight(-1002109725 ^ var8_6, 11) + -927385928;
                try {
                    if ((5146504285532515857L ^ (long)var8_6 | 1L) == 0L) {
                        throw new IllegalArgumentException();
                    }
                    var9_7 = Integer.reverse(var8_6 ^ 1675151265 ^ -815564712) ^ -1337233353 ^ -1337233353;
                }
                catch (IllegalArgumentException v6) {
                    var9_7 = Integer.reverse(var8_6 ^ 1675151265 ^ -815564712);
                }
                var10_5 += 2;
                continue;
            }
            return var6_4;
lbl226:
            // 9 sources

            (Integer.rotateRight(-492623014 ^ var8_6, 15) + 1981800225) * -492623013;
            var9_7 = Integer.reverse(var8_6 ^ 1675151265 ^ -815564712) + -1299983 - -1299983;
        }
    }

    public float shld_2() {
        block0: {
            int n = -1553184027;
            int n2 = (n = Integer.rotateLeft(n * -1541279643, 27) ^ 0x4DA5DB6) ^ 0xEB9063C4;
            if ((n2 ^ n) == -342858812) break block0;
            int cfr_ignored_0 = (0x48FC2921 ^ n) - -900976479;
        }
        return (float)this.afz_2(this.sthh_3, this.thnl, mc.method_61966().method_60637(true));
    }

    public float sgha_4() {
        block0: {
            int n = 402532472;
            n = Integer.rotateLeft(n * -1048849943, 12) ^ 0x3F189243;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xA28FC294;
            if ((n2 ^ n) == -1567636844) break block0;
            int cfr_ignored_0 = (0xB571EAEC ^ n) + 1514091225;
        }
        return (float)bdhd_2.hdm_2(this, this.shwm, this.hhq, bdhd_2.dwgh(mc).method_60637(true));
    }

    public double rthh_2() {
        block0: {
            int n = 515993971;
            n = Integer.rotateLeft(n * -1848972251, 23) ^ 0xE44B78C9;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x896F3A59;
            if ((n2 ^ n) == -1989199271) break block0;
            int cfr_ignored_0 = (0x97AE4B2A ^ n) - -1000483717;
        }
        return this.afz_2(this.dhny, this.thtf, bdhd_2.ddhgh_2(mc).method_60637(true));
    }

    public double thkht_2() {
        block0: {
            int n = 1974035855;
            n = Integer.rotateLeft(n * -876600857, 20) ^ 0x6175F32A;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 11);
            int n2 = n ^ 0x85FD8F2F;
            if ((n2 ^ n) == -2046980305) break block0;
            int cfr_ignored_0 = (0xF054EAA0 ^ n) - -924288057;
        }
        return bdhd_2.tjj(this, this.rkd, this.bmd_2, mc.method_61966().method_60637(true));
    }

    public double bhn_2() {
        block0: {
            int n = 1910144887;
            n = Integer.rotateLeft(n * 112644981, 22) ^ 0x22231348;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8A01300;
            if ((n2 ^ n) == 144708352) break block0;
            int cfr_ignored_0 = (0x797A6C77 ^ n) + 554917477;
        }
        return bdhd_2.bkhz(this, this.drt_2, this.wk, mc.method_61966().method_60637(true));
    }

    public boolean ghhw() {
        int n = bfd_2.sns_3(292407356);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 25);
        int n2 = n ^ 0xAC898201;
        if ((n2 ^ n) != -1400274431) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xBDE44A3D ^ n, 10) - 50502814) * -1109112259;
            int cfr_ignored_1 = (int)(0x7F56E40027D4EB4FL ^ (long)n ^ 0x3570831A2DB9537CL);
        }
        return bdhd_2.mc.field_1724 != null;
    }

    public boolean rmr() {
        block0: {
            int n = 1744265147;
            n = Integer.rotateLeft(n * -1956086389, 18) ^ 0x514DF15B;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xB6798FA4;
            if ((n2 ^ n) == -1233547356) break block0;
            int cfr_ignored_0 = (0xD18ED01F ^ n) + -1038018362;
        }
        return this.dhth_6;
    }

    public float awf() {
        block0: {
            int n = -718795440;
            n = Integer.rotateLeft(n * -1147386401, 22) ^ 0x97B5D667;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 20);
            int n2 = n ^ 0x92E7A2A;
            if ((n2 ^ n) == 154040874) break block0;
            int cfr_ignored_0 = (0xDC06777A ^ n) - 1591089461;
        }
        return this.thyd;
    }

    public float tshth_2() {
        block0: {
            int n = bfd_2.sns_3(542335624);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 24);
            int n2 = n ^ 0xB4577E05;
            if ((n2 ^ n) == -1269334523) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x94041C8D ^ n, 5) - -253946802;
            int cfr_ignored_1 = (int)(0x56B6B2B027D4EB4FL ^ (long)n ^ 0x9810831A2DB900BCL);
        }
        return this.sna_2;
    }

    public class_243 dhzt() {
        block0: {
            int n = 91053857;
            n = Integer.rotateLeft(n * -767699809, 17) ^ 0x9EF11B0F;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 27);
            int n2 = n ^ 0x4F74CB09;
            if ((n2 ^ n) == 1333054217) break block0;
            int cfr_ignored_0 = (0x4A199428 ^ n) - -1325772667;
        }
        return this.dhghl();
    }

    public boolean rshy() {
        return this.rgha_2() && this.dhhkh_2.sdh_2() == this.ql;
    }

    /*
     * Unable to fully structure code
     */
    private void dmn_2(btt var1_1) {
        var4_2 = 0;
        var2_3 = -1717419809;
        var2_3 = Integer.rotateLeft(var2_3 * -529043983, 27) ^ 1287831185;
        var2_3 = System.identityHashCode(this) ^ var2_3;
        var3_4 = var2_3 - -859707980 ^ 147250497 ^ 147250497;
        while (true) {
            block116: {
                block103: {
                    block119: {
                        block127: {
                            block133: {
                                block108: {
                                    block122: {
                                        block131: {
                                            block134: {
                                                block110: {
                                                    block104: {
                                                        block112: {
                                                            block136: {
                                                                block126: {
                                                                    block109: {
                                                                        block128: {
                                                                            block129: {
                                                                                block130: {
                                                                                    block115: {
                                                                                        block120: {
                                                                                            block105: {
                                                                                                block118: {
                                                                                                    block114: {
                                                                                                        block107: {
                                                                                                            block106: {
                                                                                                                block111: {
                                                                                                                    block124: {
                                                                                                                        block123: {
                                                                                                                            block135: {
                                                                                                                                block117: {
                                                                                                                                    block121: {
                                                                                                                                        block125: {
                                                                                                                                            block113: {
                                                                                                                                                block132: {
                                                                                                                                                    var4_2 = var2_3 - var3_4;
                                                                                                                                                    switch (var4_2 & 31) {
                                                                                                                                                        case 0: {
                                                                                                                                                            if (var4_2 == 1845592160) break block103;
                                                                                                                                                            if (var4_2 == -283068448) break block104;
                                                                                                                                                            if (var4_2 != -50086016) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block105;
                                                                                                                                                        }
                                                                                                                                                        case 1: {
                                                                                                                                                            if (var4_2 == 1209776129) break block106;
                                                                                                                                                            if (var4_2 != -1010199807) {
                                                                                                                                                                (Integer.rotateRight(-1224421198 ^ var2_3, 9) + 770893001) * -1224421197;
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block107;
                                                                                                                                                        }
                                                                                                                                                        case 4: {
                                                                                                                                                            if (var4_2 == -732846300) break block108;
                                                                                                                                                            if (var4_2 != -1546775164) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block109;
                                                                                                                                                        }
                                                                                                                                                        case 5: {
                                                                                                                                                            if (var4_2 != -886090267) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block110;
                                                                                                                                                        }
                                                                                                                                                        case 6: {
                                                                                                                                                            if (var4_2 != 532297190) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block111;
                                                                                                                                                        }
                                                                                                                                                        case 7: {
                                                                                                                                                            if (var4_2 == -1507751385) break block112;
                                                                                                                                                            if (var4_2 != -1327691417) {
                                                                                                                                                                Integer.rotateRight(-1071650457 ^ var2_3, 11) - 1211818676;
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block113;
                                                                                                                                                        }
                                                                                                                                                        case 8: {
                                                                                                                                                            if (var4_2 != -1073076248) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block114;
                                                                                                                                                        }
                                                                                                                                                        case 9: {
                                                                                                                                                            if (var4_2 != 93140137) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block115;
                                                                                                                                                        }
                                                                                                                                                        case 10: {
                                                                                                                                                            if (var4_2 != 1463949642) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block116;
                                                                                                                                                        }
                                                                                                                                                        case 12: {
                                                                                                                                                            if (var4_2 != 1626320236) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block117;
                                                                                                                                                        }
                                                                                                                                                        case 15: {
                                                                                                                                                            if (var4_2 != 403432111) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block118;
                                                                                                                                                        }
                                                                                                                                                        case 18: {
                                                                                                                                                            if (var4_2 == -92070510) break block119;
                                                                                                                                                            if (var4_2 != -707051918) {
                                                                                                                                                                (Integer.rotateRight(-1484183853 ^ var2_3, 7) + 1308185288) * -1484183853;
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block120;
                                                                                                                                                        }
                                                                                                                                                        case 19: {
                                                                                                                                                            if (var4_2 == 1906600531) break;
                                                                                                                                                            if (var4_2 != -2117693901) {
                                                                                                                                                                (Integer.rotateRight(980395922 ^ var2_3, 10) + 400746985) * 980395923;
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block121;
                                                                                                                                                        }
                                                                                                                                                        case 20: {
                                                                                                                                                            if (var4_2 == 954423284) break block122;
                                                                                                                                                            if (var4_2 != -859707980) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block123;
                                                                                                                                                        }
                                                                                                                                                        case 21: {
                                                                                                                                                            if (var4_2 != 336823317) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block124;
                                                                                                                                                        }
                                                                                                                                                        case 22: {
                                                                                                                                                            if (var4_2 == 386072118) break block125;
                                                                                                                                                            if (var4_2 != 231278038) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block126;
                                                                                                                                                        }
                                                                                                                                                        case 23: {
                                                                                                                                                            if (var4_2 != 1161762871) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block127;
                                                                                                                                                        }
                                                                                                                                                        case 24: {
                                                                                                                                                            if (var4_2 != 867262456) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block128;
                                                                                                                                                        }
                                                                                                                                                        case 25: {
                                                                                                                                                            if (var4_2 != 2061414073) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block129;
                                                                                                                                                        }
                                                                                                                                                        case 26: {
                                                                                                                                                            if (var4_2 != 501139546) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block130;
                                                                                                                                                        }
                                                                                                                                                        case 28: {
                                                                                                                                                            if (var4_2 != 1875849948) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block131;
                                                                                                                                                        }
                                                                                                                                                        case 29: {
                                                                                                                                                            if (var4_2 == 2059655293) break block132;
                                                                                                                                                            if (var4_2 != 1955624989) {
                                                                                                                                                                (Integer.rotateRight(-770414630 ^ var2_3, 13) + 1960194721) * -770414629;
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block133;
                                                                                                                                                        }
                                                                                                                                                        case 30: {
                                                                                                                                                            if (var4_2 != 689480734) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block134;
                                                                                                                                                        }
                                                                                                                                                        case 31: {
                                                                                                                                                            if (var4_2 == 1077477311) break block135;
                                                                                                                                                            if (var4_2 != 986204671) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block136;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    Integer.rotateRight(1147236971 ^ var2_3, 11) + 1277852208;
                                                                                                                                                    this.tba(false);
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                (Integer.rotateLeft(1920459197 ^ var2_3, 17) - -522062562) * 1920459197;
                                                                                                                                                (int)(-5709069540779562161L ^ (long)var2_3 ^ 7093313561568005211L);
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            (Integer.rotateLeft(842751156 ^ var2_3, 9) - 428726535) * 842751157;
                                                                                                                                            return;
                                                                                                                                        }
                                                                                                                                        Integer.rotateLeft(-72092055 ^ var2_3, 18) + 2133358066;
                                                                                                                                        (int)(4107661453607365455L ^ (long)var2_3 ^ 5609377484349497299L);
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    (Integer.rotateRight(-1502786853 ^ var2_3, 7) + 731492288) * -1502786853;
                                                                                                                                    this.sthh_3 = this.thnl;
                                                                                                                                    this.shwm = this.hhq;
                                                                                                                                    this.thnl = bdhd_2.mc.field_1724.method_36454();
                                                                                                                                    this.hhq = bdhd_2.mc.field_1724.method_36455();
                                                                                                                                    this.dhny = this.thtf;
                                                                                                                                    this.rkd = this.bmd_2;
                                                                                                                                    this.drt_2 = this.wk;
                                                                                                                                    this.zqz_4();
                                                                                                                                    if (!this.rlr()) {
                                                                                                                                        try {
                                                                                                                                            var3_4 = var2_3 - 403432111 + 2130589076 - 2130589076;
                                                                                                                                        }
                                                                                                                                        catch (ArithmeticException v0) {
                                                                                                                                            var3_4 = var2_3 - 403432111 + 910330727 - 910330727;
                                                                                                                                        }
                                                                                                                                        ++var4_2;
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        var4_2 -= 3;
                                                                                                                                        var3_4 = var2_3 - 336823317;
                                                                                                                                    }
                                                                                                                                    catch (NoSuchElementException v1) {
                                                                                                                                        var3_4 = var2_3 - 336823317;
                                                                                                                                    }
                                                                                                                                    var4_2 += 3;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                (Integer.rotateRight(382929651 ^ var2_3, 5) + -940838232) * 382929651;
                                                                                                                                bdhd_2.mc.field_1724.method_18799(class_243.field_1353);
                                                                                                                                (int)(-3375364258607329417L ^ (long)var2_3 ^ 7304549294747946881L);
                                                                                                                                var3_4 = var2_3 - -1614228371 ^ -606333153 ^ -606333153;
                                                                                                                                (int)(1820774580248649981L ^ (long)var2_3 ^ -7144359222503956648L);
                                                                                                                                var3_4 = (int)((long)(var2_3 - -50086016) ^ 195644043201176526L ^ 195644043201176526L);
                                                                                                                                var4_2 += 5;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            Integer.rotateRight(466114314 ^ var2_3, 6) + 1637886321;
                                                                                                                            if (bdhd_2.mc.field_1724 != null) {
                                                                                                                                try {
                                                                                                                                    ++var4_2;
                                                                                                                                    if ((-9168356357818525155L ^ (long)var2_3 | 1L) == 0L) {
                                                                                                                                        throw new IllegalArgumentException();
                                                                                                                                    }
                                                                                                                                    var3_4 = var2_3 - 532297190;
                                                                                                                                }
                                                                                                                                catch (IllegalArgumentException v2) {
                                                                                                                                    var3_4 = var2_3 - 532297190;
                                                                                                                                }
                                                                                                                                var4_2 -= 3;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                var4_2 -= 3;
                                                                                                                                if ((-2691158832626466811L ^ (long)var2_3 | 1L) == 0L) {
                                                                                                                                    throw new IllegalArgumentException();
                                                                                                                                }
                                                                                                                                var3_4 = Integer.reverse(Integer.reverse(var2_3 - 386072118));
                                                                                                                            }
                                                                                                                            catch (IllegalArgumentException v3) {
                                                                                                                                var3_4 = var2_3 - 386072118 + 624068866 - 624068866;
                                                                                                                            }
                                                                                                                            var4_2 += 5;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        (Integer.rotateLeft(-534664847 ^ var2_3, 15) + 678503402) * -534664847;
                                                                                                                        (int)(2491343042533190479L ^ (long)var2_3 ^ -871302379436644105L);
                                                                                                                        if (yf.khdha_2()) {
                                                                                                                            var3_4 = var2_3 - 1077477311 ^ 1511890793 ^ 1511890793;
                                                                                                                            (Integer.rotateRight(-1816393614 ^ var2_3, 5) + -400382711) * -1816393613;
                                                                                                                            var4_2 -= 3;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            var3_4 = var2_3 - 2061414073 ^ 536074061 ^ 536074061;
                                                                                                                        }
                                                                                                                        catch (IllegalArgumentException v4) {
                                                                                                                            var3_4 = var2_3 - 2061414073;
                                                                                                                        }
                                                                                                                        var4_2 += 5;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    (Integer.rotateLeft(-1273842852 ^ var2_3, 9) - -761178273) * -1273842851;
                                                                                                                    if (bdhd_2.mc.field_1765 != null) {
                                                                                                                        (int)(7619313890585475523L ^ (long)var2_3 ^ -8770059180877709653L);
                                                                                                                        var3_4 = var2_3 - -727445156 + 1985565423 - 1985565423;
                                                                                                                        (int)(-3072416879621389248L ^ (long)var2_3 ^ -2940714000542464152L);
                                                                                                                        var3_4 = Integer.reverse(Integer.reverse(var2_3 - -707051918));
                                                                                                                        ++var4_2;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        var4_2 -= 5;
                                                                                                                        if ((-3401264644669391521L ^ (long)var2_3 | 1L) == 0L) {
                                                                                                                            throw new NoSuchElementException();
                                                                                                                        }
                                                                                                                        var3_4 = (int)((long)(var2_3 - 501139546) ^ -9155582131677828927L ^ -9155582131677828927L);
                                                                                                                    }
                                                                                                                    catch (NoSuchElementException v5) {
                                                                                                                        var3_4 = Integer.reverse(Integer.reverse(var2_3 - 501139546));
                                                                                                                    }
                                                                                                                    ++var4_2;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                Integer.rotateRight(-1230687134 ^ var2_3, 9) + 576648985;
                                                                                                                if (bdhd_2.mc.field_1690.field_1904.method_1434()) {
                                                                                                                    try {
                                                                                                                        var4_2 -= 2;
                                                                                                                        var3_4 = (int)((long)(var2_3 - -1010199807) ^ 9115381097524971214L ^ 9115381097524971214L);
                                                                                                                    }
                                                                                                                    catch (NoSuchElementException v6) {
                                                                                                                        var3_4 = var2_3 - -1010199807 ^ 1647022022 ^ 1647022022;
                                                                                                                    }
                                                                                                                    var4_2 += 3;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                var3_4 = var2_3 - 1209776129;
                                                                                                                var4_2 += 4;
                                                                                                                continue;
                                                                                                            }
                                                                                                            Integer.rotateRight(-1572714866 ^ var2_3, 7) - -1436276115;
                                                                                                            bdhd_2.mc.field_1724.method_5875(true);
                                                                                                            if (bdhd_2.mc.field_1724.method_18798().method_1027() < Double.longBitsToDouble(7802485331373899141L ^ 5987427248600061049L)) {
                                                                                                                var3_4 = var2_3 - 1626320236 + -1327669744 - -1327669744;
                                                                                                                continue;
                                                                                                            }
                                                                                                            (int)(2526952752980442228L ^ (long)var2_3 ^ -1641800093347615758L);
                                                                                                            var3_4 = (int)((long)(var2_3 - -50086016) ^ 5049612097224433034L ^ 5049612097224433034L);
                                                                                                            var4_2 -= 2;
                                                                                                            continue;
                                                                                                        }
                                                                                                        (Integer.rotateRight(-1009492833 ^ var2_3, 11) - -1156262276) * -1009492833;
                                                                                                        if (bdhd_2.mc.field_1724.method_6047().method_31574(class_1802.field_8634)) {
                                                                                                            try {
                                                                                                                var4_2 -= 5;
                                                                                                                var3_4 = Integer.reverse(Integer.reverse(var2_3 - 1906600531));
                                                                                                            }
                                                                                                            catch (UnsupportedOperationException v7) {
                                                                                                                var3_4 = var2_3 - 1906600531;
                                                                                                            }
                                                                                                            var4_2 += 5;
                                                                                                            continue;
                                                                                                        }
                                                                                                        (int)(-2515694372248876647L ^ (long)var2_3 ^ 1722884022529693693L);
                                                                                                        var3_4 = Integer.reverse(Integer.reverse(var2_3 - -1148999768));
                                                                                                        (int)(-1577607264360846197L ^ (long)var2_3 ^ -8040431839158961689L);
                                                                                                        var3_4 = Integer.reverse(Integer.reverse(var2_3 - -1073076248));
                                                                                                        var4_2 -= 2;
                                                                                                        continue;
                                                                                                    }
                                                                                                    Integer.rotateLeft(-1251836928 ^ var2_3, 9) + -78994629;
                                                                                                    if (!bdhd_2.mc.field_1724.method_6079().method_31574(class_1802.field_8634)) {
                                                                                                        try {
                                                                                                            var4_2 -= 2;
                                                                                                            if ((3291708041891769079L ^ (long)var2_3 | 1L) == 0L) {
                                                                                                                throw new IllegalArgumentException();
                                                                                                            }
                                                                                                            var3_4 = (int)((long)(var2_3 - 1209776129) ^ -7489160220726629881L ^ -7489160220726629881L);
                                                                                                        }
                                                                                                        catch (IllegalArgumentException v8) {
                                                                                                            var3_4 = var2_3 - 1209776129;
                                                                                                        }
                                                                                                        continue;
                                                                                                    }
                                                                                                    try {
                                                                                                        --var4_2;
                                                                                                        var3_4 = var2_3 - 1906600531;
                                                                                                    }
                                                                                                    catch (NoSuchElementException v9) {
                                                                                                        var3_4 = var2_3 - 1906600531;
                                                                                                    }
                                                                                                    --var4_2;
                                                                                                    continue;
                                                                                                }
                                                                                                (Integer.rotateRight(507892786 ^ var2_3, 6) + -1361948343) * 507892787;
                                                                                                this.thyd = this.thnl;
                                                                                                this.sna_2 = this.hhq;
                                                                                                return;
                                                                                            }
                                                                                            (Integer.rotateLeft(-1382473547 ^ var2_3, 8) - 166237478) * -1382473547;
                                                                                            (int)(8010653077643520847L ^ (long)var2_3 ^ -2278677262989954170L);
                                                                                            if (bdhd_2.mc.field_1724.method_24828() == this.dhth_6) {
                                                                                                var3_4 = Integer.reverse(Integer.reverse(var2_3 - -2117693901));
                                                                                                (Integer.rotateLeft(-1498421960 ^ var2_3, 7) + 866803971) * -1498421959;
                                                                                                var4_2 += 3;
                                                                                                continue;
                                                                                            }
                                                                                            try {
                                                                                                ++var4_2;
                                                                                                if ((154318972388086109L ^ (long)var2_3 | 1L) == 0L) {
                                                                                                    throw new IllegalStateException();
                                                                                                }
                                                                                                var3_4 = var2_3 - 93140137 ^ 1602733390 ^ 1602733390;
                                                                                            }
                                                                                            catch (IllegalStateException v10) {
                                                                                                var3_4 = var2_3 - 93140137 + -993486112 - -993486112;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        (Integer.rotateRight(-1039788522 ^ var2_3, 11) - -2095428635) * -1039788521;
                                                                                        if (bdhd_2.mc.field_1765.method_17783() == class_239.class_240.field_1333) {
                                                                                            try {
                                                                                                var4_2 -= 2;
                                                                                                if ((2078768334559193831L ^ (long)var2_3 | 1L) == 0L) {
                                                                                                    throw new IllegalStateException();
                                                                                                }
                                                                                                var3_4 = var2_3 - 501139546 + -1272712727 - -1272712727;
                                                                                            }
                                                                                            catch (IllegalStateException v11) {
                                                                                                var3_4 = var2_3 - 501139546 + 2102542113 - 2102542113;
                                                                                            }
                                                                                            var4_2 += 4;
                                                                                            continue;
                                                                                        }
                                                                                        (int)(-2263609067825230618L ^ (long)var2_3 ^ -1556187825741075203L);
                                                                                        var3_4 = var2_3 - -1546775164 ^ 1778462632 ^ 1778462632;
                                                                                        var4_2 -= 2;
                                                                                        continue;
                                                                                    }
                                                                                    Integer.rotateLeft(537822060 ^ var2_3, 7) - -434140849;
                                                                                    this.dhth_6 = bdhd_2.mc.field_1724.method_24828();
                                                                                    var3_4 = var2_3 - 1807089117 ^ 510360956 ^ 510360956;
                                                                                    Integer.rotateRight(1174683946 ^ var2_3, 11) + 2128708433;
                                                                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - -2117693901));
                                                                                    var4_2 -= 5;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateRight(648100851 ^ var2_3, 7) + -1310465624) * 648100851;
                                                                                this.thyd = this.thnl;
                                                                                this.sna_2 = this.hhq;
                                                                                try {
                                                                                    var4_2 += 2;
                                                                                    if ((-8208116531139390127L ^ (long)var2_3 | 1L) == 0L) {
                                                                                        throw new ArithmeticException();
                                                                                    }
                                                                                    var3_4 = var2_3 - 2059655293 ^ 375208455 ^ 375208455;
                                                                                }
                                                                                catch (ArithmeticException v12) {
                                                                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - 2059655293));
                                                                                }
                                                                                var4_2 -= 4;
                                                                                continue;
                                                                            }
                                                                            (Integer.rotateRight(-1799811845 ^ var2_3, 5) + 113652128) * -1799811845;
                                                                            yf.athz_2();
                                                                            throw null;
                                                                        }
                                                                        (Integer.rotateLeft(-1284844780 ^ var2_3, 9) - -1102238041) * -1284844779;
                                                                        yf.athz_2();
                                                                        throw null;
                                                                    }
                                                                    Integer.rotateRight(-441576574 ^ var2_3, 15) + -730727431;
                                                                    this.trs(bdhd_2.mc.field_1765.method_17784());
                                                                    var3_4 = var2_3 - 633139832 + -780747963 - -780747963;
                                                                    Integer.rotateLeft(-547936727 ^ var2_3, 14) + 267075122;
                                                                    (int)(2154277616915639119L ^ (long)var2_3 ^ -1344180340310567398L);
                                                                    var3_4 = var2_3 - 2059655293;
                                                                    var4_2 += 2;
                                                                    continue;
                                                                }
                                                                (Integer.rotateLeft(-2003715556 ^ var2_3, 4) - -1912395617) * -2003715555;
                                                                (int)(1838931452145699009L ^ (long)var2_3 ^ -7375899671679099173L);
                                                                var3_4 = var2_3 - -859707980 ^ 1113210270 ^ 1113210270;
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(1027795236 ^ var2_3, 10) - 1870125719;
                                                            var3_4 = var2_3 - -587351759 + 707497430 - 707497430;
                                                            (Integer.rotateRight(956266226 ^ var2_3, 10) + -347273591) * 956266227;
                                                            try {
                                                                if ((828248189127638377L ^ (long)var2_3 | 1L) == 0L) {
                                                                    throw new IllegalArgumentException();
                                                                }
                                                                var3_4 = var2_3 - -859707980 ^ 1048944679 ^ 1048944679;
                                                            }
                                                            catch (IllegalArgumentException v13) {
                                                                var3_4 = (int)((long)(var2_3 - -859707980) ^ -7912473704824344910L ^ -7912473704824344910L);
                                                            }
                                                            var4_2 += 2;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(-1379071391 ^ var2_3, 8) + 271704314;
                                                        (int)(8034320975964465999L ^ (long)var2_3 ^ -5347880409042947282L);
                                                        var3_4 = var2_3 - -1168360486;
                                                        Integer.rotateRight(338174478 ^ var2_3, 5) - 1966718701;
                                                        (int)(-7353449070331280296L ^ (long)var2_3 ^ 7457694108481920567L);
                                                        var3_4 = var2_3 - -859707980 + -960902264 - -960902264;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(620069164 ^ var2_3, 7) - 2115519375;
                                                    try {
                                                        var4_2 -= 4;
                                                        if ((-2627007315764596731L ^ (long)var2_3 | 1L) == 0L) {
                                                            throw new UnsupportedOperationException();
                                                        }
                                                        var3_4 = var2_3 - -859707980 + 664313255 - 664313255;
                                                    }
                                                    catch (UnsupportedOperationException v14) {
                                                        var3_4 = (int)((long)(var2_3 - -859707980) ^ -7795660733787353471L ^ -7795660733787353471L);
                                                    }
                                                    var4_2 -= 3;
                                                    continue;
                                                }
                                                (Integer.rotateRight(-591922049 ^ var2_3, 14) - -1096469860) * -591922049;
                                                var3_4 = (int)((long)(var2_3 - 1185124438) ^ -7532420397069306268L ^ -7532420397069306268L);
                                                (Integer.rotateLeft(-479870116 ^ var2_3, 15) - -1917827233) * -479870115;
                                                var3_4 = var2_3 - 1725755048 ^ -1363648643 ^ -1363648643;
                                                Integer.rotateRight(1741289390 ^ var2_3, 15) - -1781359283;
                                                var3_4 = var2_3 - -859707980 ^ 1573084252 ^ 1573084252;
                                                continue;
                                            }
                                            Integer.rotateLeft(1798479652 ^ var2_3, 16) - -8461161;
                                            var3_4 = var2_3 - 986632259 ^ -979154817 ^ -979154817;
                                            Integer.rotateLeft(257687397 ^ var2_3, 4) - -528380810;
                                            (int)(-3609264187293504689L ^ (long)var2_3 ^ 6899658777591035395L);
                                            (int)(-6400850198216663707L ^ (long)var2_3 ^ -4314420754408217722L);
                                            var3_4 = (int)((long)(var2_3 - -1214260428) ^ 8584512883339823891L ^ 8584512883339823891L);
                                            (int)(1150703278386451790L ^ (long)var2_3 ^ -4584347177975041503L);
                                            var3_4 = (int)((long)(var2_3 - -859707980) ^ -923665549734231678L ^ -923665549734231678L);
                                            var4_2 += 5;
                                            continue;
                                        }
                                        (Integer.rotateRight(-2128718305 ^ var2_3, 3) - -1492513540) * -2128718305;
                                        try {
                                            if ((3749414869144104731L ^ (long)var2_3 | 1L) == 0L) {
                                                throw new IllegalStateException();
                                            }
                                            var3_4 = Integer.reverse(Integer.reverse(var2_3 - -859707980));
                                        }
                                        catch (IllegalStateException v15) {
                                            var3_4 = var2_3 - -859707980 ^ 1291537676 ^ 1291537676;
                                        }
                                        continue;
                                    }
                                    Integer.rotateRight(1584412335 ^ var2_3, 14) - 1945386604;
                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - 140162163));
                                    Integer.rotateRight(-1038467893 ^ var2_3, 11) + -2054489136;
                                    var3_4 = var2_3 - -414057141 + 1734986270 - 1734986270;
                                    (Integer.rotateLeft(-1814527204 ^ var2_3, 5) - -342524001) * -1814527203;
                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - -859707980));
                                    var4_2 -= 3;
                                    continue;
                                }
                                (Integer.rotateRight(1341377238 ^ var2_3, 12) - -1293734107) * 1341377239;
                                (int)(8090845387691794699L ^ (long)var2_3 ^ 1690661063964577089L);
                                var3_4 = Integer.reverse(Integer.reverse(var2_3 - -1783390214));
                                (int)(3829626889100648237L ^ (long)var2_3 ^ -2320520448896546918L);
                                var3_4 = var2_3 - -859707980;
                                var4_2 -= 3;
                                continue;
                            }
                            (Integer.rotateLeft(496887600 ^ var2_3, 6) + -1703109109) * 496887601;
                            var3_4 = var2_3 - 123219523;
                            Integer.rotateRight(1980810058 ^ var2_3, 17) + 1348814129;
                            var3_4 = (int)((long)(var2_3 - -859707980) ^ -5874816134818453538L ^ -5874816134818453538L);
                            var4_2 += 5;
                            continue;
                        }
                        (Integer.rotateRight(-2142398405 ^ var2_3, 3) + -1916596640) * -2142398405;
                        var3_4 = var2_3 - -1298873638 + -647393490 - -647393490;
                        (Integer.rotateRight(893749106 ^ var2_3, 9) + 2009662985) * 893749107;
                        var3_4 = (int)((long)(var2_3 - -859707980) ^ 5150739202284966377L ^ 5150739202284966377L);
                        Integer.rotateLeft(-1147247544 ^ var2_3, 10) + -1131691021;
                        ++var4_2;
                        continue;
                    }
                    Integer.rotateRight(853862095 ^ var2_3, 9) - 773165644;
                    var3_4 = var2_3 - 1695694979 ^ -100363190 ^ -100363190;
                    (Integer.rotateRight(-2132751877 ^ var2_3, 3) + -1617554272) * -2132751877;
                    var3_4 = var2_3 - -616918810 ^ 1510680287 ^ 1510680287;
                    (Integer.rotateLeft(428692829 ^ var2_3, 6) - 477820286) * 428692829;
                    (int)(-2648121665466864817L ^ (long)var2_3 ^ 842317278777711534L);
                    var3_4 = var2_3 - -859707980 ^ 2101968070 ^ 2101968070;
                    ++var4_2;
                    continue;
                }
                Integer.rotateRight(-83775486 ^ var2_3, 18) + 1771171705;
                var3_4 = var2_3 - 1060475268 + 1542457258 - 1542457258;
                (Integer.rotateRight(-438980353 ^ var2_3, 15) - -650244580) * -438980353;
                var3_4 = (int)((long)(var2_3 - -859707980) ^ 5639835607162228399L ^ 5639835607162228399L);
                var4_2 += 3;
                continue;
            }
            Integer.rotateRight(-451930489 ^ var2_3, 15) - -1051698796;
            var3_4 = var2_3 - 668423023 + -1686423595 - -1686423595;
            (Integer.rotateRight(1117411038 ^ var2_3, 11) - 353248285) * 1117411039;
            var3_4 = (int)((long)(var2_3 - -859707980) ^ 1808656046334455029L ^ 1808656046334455029L);
            Integer.rotateLeft(-1984510259 ^ var2_3, 4) - -1317031410;
            (int)(5405560833421142863L ^ (long)var2_3 ^ 3211210682774666201L);
            var4_2 -= 5;
            continue;
lbl573:
            // 25 sources

            (Integer.rotateRight(-21623306 ^ var2_3, 18) - -597078011) * -21623305;
            var3_4 = (int)((long)(var2_3 - -859707980) ^ -4036132474978436237L ^ -4036132474978436237L);
        }
    }

    private void khgha_2(shw_3 shw2) {
        class_287 class_2872;
        try {
            int n = -1150659722;
            n = Integer.rotateLeft(n * -1078042225, 24) ^ 0x5C07A7BC;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 8);
            int n2 = n ^ 0x4983EF3C;
            if ((n2 ^ n) != 1233383228) {
                int cfr_ignored_0 = (0xF2E9BC4A ^ n) - -2094281670;
            }
            if ((0x3CD & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bdhd_2.mc.field_1724 == null || this.dhhkh_2.sdh_2() != this.jll) {
            return;
        }
        class_238 class_2383 = bdhd_2.mc.field_1724.method_5829();
        shk_3.thsh_9(false);
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        class_4587 class_45872 = shw2.ssha_2();
        class_45872.method_22903();
        shk_3.tsh(class_45872);
        class_289 class_2892 = class_289.method_1348();
        byq byq2 = this.ka.sdsh_4();
        byq byq3 = this.das_2.sdsh_4();
        if (byq2.tzdh_2() > 0.0f) {
            class_2872 = class_2892.method_60827(class_293.class_5596.field_27382, class_290.field_1576);
            tth_8.khldh(class_45872, class_2872, class_2383, byq2);
            shk_3.tbgh_2(class_2872);
        }
        if (byq3.tzdh_2() > 0.0f) {
            RenderSystem.lineWidth((float)2.0f);
            class_2872 = class_2892.method_60827(class_293.class_5596.field_29344, class_290.field_1576);
            tth_8.zsz_6(class_45872, class_2872, class_2383, byq3);
            shk_3.tbgh_2(class_2872);
        }
        class_45872.method_22909();
        shk_3.tsd_6();
        RenderSystem.lineWidth((float)1.0f);
    }

    private void rdb(tdb tdb2) {
        int n = 0;
        int n2 = -206212047;
        n2 = Integer.rotateLeft(n2 * -1737188291, 9) ^ 0xC42EC748;
        n2 = System.identityHashCode(this) ^ n2;
        tdb tdb3 = tdb2;
        n2 = Integer.rotateRight((tdb3 != null ? System.identityHashCode(tdb3) : 0) ^ n2, 25);
        int n3 = Integer.reverse(n2 ^ 0x8491516A ^ 0x81C2705D) + 395902738 - 395902738;
        while (true) {
            block29: {
                block26: {
                    block20: {
                        block19: {
                            block25: {
                                block21: {
                                    block18: {
                                        block27: {
                                            block16: {
                                                block23: {
                                                    block17: {
                                                        block22: {
                                                            block28: {
                                                                block24: {
                                                                    if ((n = Integer.reverse(n3) ^ n2 ^ 0x81C2705D) == -359473875) break block16;
                                                                    if (n == 750964986) break block17;
                                                                    if (n == 194374473) break block18;
                                                                    if (n == -1727799356) break block19;
                                                                    if (n == 48919313) break block20;
                                                                    if (n == 441213279) break block21;
                                                                    if (n == 1811613180) break block22;
                                                                    if (n == 1728149313) break block23;
                                                                    int cfr_ignored_0 = Integer.rotateRight(0xD9C4E942 ^ n2, 14) + 1664474681;
                                                                    if (n == -2070851222) break block24;
                                                                    if (n == -732537066) break block25;
                                                                    if (n == 1974857291) break block26;
                                                                    int cfr_ignored_1 = Integer.rotateRight(0x5FE53127 ^ n2, 14) - -1591831820;
                                                                    if (n == 1814915469) break block27;
                                                                    if (n == -229331687) break block28;
                                                                    break block29;
                                                                }
                                                                int cfr_ignored_2 = Integer.rotateLeft(0x688FB304 ^ n2, 16) - -1379644233;
                                                                if (!this.rgha_2()) {
                                                                    try {
                                                                        n -= 3;
                                                                        n3 = Integer.reverse(n2 ^ 0xF254AD19 ^ 0x81C2705D) ^ 0x31C6568C ^ 0x31C6568C;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        n3 = Integer.reverse(n2 ^ 0xF254AD19 ^ 0x81C2705D);
                                                                    }
                                                                    --n;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_3 = (int)(0xAE90E751A1553170L ^ (long)n2 ^ 0x33D38E1999C6F0F0L);
                                                                n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xF7832EB8 ^ 0x81C2705D)));
                                                                int cfr_ignored_4 = (int)(0x2262EC901025D534L ^ (long)n2 ^ 0x2450ECF8514FE914L);
                                                                n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x6BFB05FC ^ 0x81C2705D)));
                                                                continue;
                                                            }
                                                            int cfr_ignored_5 = Integer.rotateRight(0x3089DE22 ^ n2, 9) + -451967655;
                                                            return;
                                                        }
                                                        int cfr_ignored_6 = Integer.rotateLeft(0x8828A26D ^ n2, 4) - -2125903250;
                                                        int cfr_ignored_7 = (int)(0x4A9A0C5027D4EB4FL ^ (long)n2 ^ 0xE5D0831A2DB938E5L);
                                                        this.tba(false);
                                                        int cfr_ignored_8 = (int)(0x1673DEEE3E90AFC6L ^ (long)n2 ^ 0x40ACB192A4AB8136L);
                                                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xF254AD19 ^ 0x81C2705D)));
                                                        n += 2;
                                                        continue;
                                                    }
                                                    int cfr_ignored_9 = Integer.rotateLeft(0x43A2E6AC ^ n2, 11) - 890736143;
                                                    try {
                                                        n += 2;
                                                        if ((0xE72B7632FDC0D925L ^ (long)n2 | 1L) == 0L) {
                                                            throw new IllegalArgumentException();
                                                        }
                                                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x8491516A ^ 0x81C2705D)));
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        n3 = (int)((long)Integer.reverse(n2 ^ 0x8491516A ^ 0x81C2705D) ^ 0xEF84794F898BD2ACL ^ 0xEF84794F898BD2ACL);
                                                    }
                                                    n += 2;
                                                    continue;
                                                }
                                                int cfr_ignored_10 = Integer.rotateLeft(0x862D2B68 ^ n2, 3) + 1138090195;
                                                n3 = (int)((long)Integer.reverse(n2 ^ 0xE35C30F6 ^ 0x81C2705D) ^ 0xF8CF85FD9EB7B410L ^ 0xF8CF85FD9EB7B410L);
                                                int cfr_ignored_11 = Integer.rotateRight(0x23CB30EE ^ n2, 7) - 1509461005;
                                                n3 = (int)((long)Integer.reverse(n2 ^ 0x8491516A ^ 0x81C2705D) ^ 0x66C81C0D62603A15L ^ 0x66C81C0D62603A15L);
                                                ++n;
                                                continue;
                                            }
                                            int cfr_ignored_12 = Integer.rotateRight(0xD121FAA6 ^ n2, 13) - 1467677013;
                                            n3 = Integer.reverse(n2 ^ 0xE9D42CED ^ 0x81C2705D) + 1808187918 - 1808187918;
                                            int cfr_ignored_13 = (Integer.rotateRight(0x4C79101B ^ n2, 12) + 1191613056) * 1283002395;
                                            n3 = Integer.reverse(n2 ^ 0xF70B3EBD ^ 0x81C2705D) + -66583828 - -66583828;
                                            int cfr_ignored_14 = Integer.rotateRight(0x8898AF07 ^ n2, 4) - -1898262252;
                                            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x8491516A ^ 0x81C2705D)));
                                            n -= 5;
                                            continue;
                                        }
                                        int cfr_ignored_15 = Integer.rotateLeft(0x5D4F728C ^ n2, 14) - 1358724655;
                                        try {
                                            ++n;
                                            if ((0xC1C4F73272BE5011L ^ (long)n2 | 1L) == 0L) {
                                                throw new ArithmeticException();
                                            }
                                            n3 = Integer.reverse(n2 ^ 0x8491516A ^ 0x81C2705D);
                                        }
                                        catch (ArithmeticException arithmeticException) {
                                            n3 = (int)((long)Integer.reverse(n2 ^ 0x8491516A ^ 0x81C2705D) ^ 0xC32671166FF5F6C6L ^ 0xC32671166FF5F6C6L);
                                        }
                                        continue;
                                    }
                                    int cfr_ignored_16 = Integer.rotateLeft(0xDCFEC98D ^ n2, 14) - -952629426;
                                    int cfr_ignored_17 = (int)(0x1E4C67B027D4EB4FL ^ (long)n2 ^ 0x3210831A2DB99149L);
                                    n3 = Integer.reverse(n2 ^ 0x51D70458 ^ 0x81C2705D);
                                    int cfr_ignored_18 = Integer.rotateRight(0x9E7915C7 ^ n2, 6) - 889668180;
                                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x8491516A ^ 0x81C2705D)));
                                    int cfr_ignored_19 = (Integer.rotateLeft(0xEB0D9C55 ^ n2, 16) - 2063830406) * -351429547;
                                    int cfr_ignored_20 = (int)(0x29BF326827D4EB4FL ^ (long)n2 ^ 0x99A0831A2DB9FEAFL);
                                    n -= 3;
                                    continue;
                                }
                                int cfr_ignored_21 = (Integer.rotateLeft(0xB7ED4831 ^ n2, 9) + 1243176234) * -1209186255;
                                int cfr_ignored_22 = (int)(0x755FE60C27D4EB4FL ^ (long)n2 ^ 0x3168831A2DB9476EL);
                                n3 = Integer.reverse(n2 ^ 0xE33F2BC5 ^ 0x81C2705D) + -118323886 - -118323886;
                                int cfr_ignored_23 = Integer.rotateLeft(0xDB5A31E1 ^ n2, 14) + -1807111814;
                                int cfr_ignored_24 = (int)(0x19E89FDC27D4EB4FL ^ (long)n2 ^ 0xC2C8831A2DB99E00L);
                                n3 = (int)((long)Integer.reverse(n2 ^ 0x8491516A ^ 0x81C2705D) ^ 0x87A5A8FDCB941EFEL ^ 0x87A5A8FDCB941EFEL);
                                n += 2;
                                continue;
                            }
                            int cfr_ignored_25 = Integer.rotateRight(0xB87A1126 ^ n2, 10) - 1529197269;
                            n3 = Integer.reverse(n2 ^ 0xCE54023A ^ 0x81C2705D);
                            int cfr_ignored_26 = (Integer.rotateRight(0xEF454A9E ^ n2, 16) - -37640099) * -280671585;
                            n3 = (int)((long)Integer.reverse(n2 ^ 0x8491516A ^ 0x81C2705D) ^ 0x840B111A05A04F4EL ^ 0x840B111A05A04F4EL);
                            --n;
                            continue;
                        }
                        int cfr_ignored_27 = (Integer.rotateLeft(0x6CF98ABC ^ n2, 16) - 915762175) * 1828293309;
                        n3 = (int)((long)Integer.reverse(n2 ^ 0x833F2D89 ^ 0x81C2705D) ^ 0x6047F307C7DF563DL ^ 0x6047F307C7DF563DL);
                        int cfr_ignored_28 = Integer.rotateLeft(0xA871EAEC ^ n2, 8) - 1781076431;
                        try {
                            n -= 3;
                            if ((0xDA377AA141F03CE9L ^ (long)n2 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n3 = Integer.reverse(n2 ^ 0x8491516A ^ 0x81C2705D) + 1701240685 - 1701240685;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n3 = Integer.reverse(n2 ^ 0x8491516A ^ 0x81C2705D);
                        }
                        n -= 2;
                        continue;
                    }
                    int cfr_ignored_29 = Integer.rotateRight(0x4245E38A ^ n2, 11) + 181677297;
                    try {
                        if ((0x1EBAE16F7F3348F9L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (int)((long)Integer.reverse(n2 ^ 0x8491516A ^ 0x81C2705D) ^ 0x431612DEA6CB8F46L ^ 0x431612DEA6CB8F46L);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(n2 ^ 0x8491516A ^ 0x81C2705D);
                    }
                    continue;
                }
                int cfr_ignored_30 = Integer.rotateLeft(0x2C356F20 ^ n2, 8) + 1591088155;
                n3 = Integer.reverse(n2 ^ 0xC80E1D93 ^ 0x81C2705D) ^ 0xE88C7265 ^ 0xE88C7265;
                int cfr_ignored_31 = (Integer.rotateLeft(0xDD2A2414 ^ n2, 14) - -864551513) * -584440811;
                n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x21F98059 ^ 0x81C2705D)));
                int cfr_ignored_32 = Integer.rotateLeft(0xB869C844 ^ n2, 10) - 1496113015;
                n3 = Integer.reverse(n2 ^ 0x8491516A ^ 0x81C2705D) + -156510041 - -156510041;
                n -= 5;
                continue;
            }
            int cfr_ignored_33 = (Integer.rotateLeft(0x25BE79D5 ^ n2, 7) - -1771151354) * 633240021;
            int cfr_ignored_34 = (int)(0xE70CD7E827D4EB4FL ^ (long)n2 ^ 0x52A0831A2DB863C8L);
            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x8491516A ^ 0x81C2705D)));
        }
    }

    private static void jtt_4(tsf tsf2) {
        int n = 0;
        int n2 = 975631613;
        n2 = Integer.rotateLeft(n2 * -1506791927, 25) ^ 0xA3181F9C;
        tsf tsf3 = tsf2;
        n2 = Integer.rotateRight((tsf3 != null ? System.identityHashCode(tsf3) : 0) ^ n2, 26);
        int n3 = (int)((long)((n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638) ^ 0x6FF88C0C8EDC1D14L ^ 0x6FF88C0C8EDC1D14L);
        block28: while (true) {
            switch (n3 - -984492638 ^ 0xC551D5A2 ^ n2) {
                case -1463232265: {
                    int cfr_ignored_0 = (Integer.rotateRight(0xBE24ADB3 ^ n2, 10) + 181315560) * -1104892493;
                    if (yf.dnkh()) {
                        n3 = (n2 ^ 0x1E39BE70 ^ 0xC551D5A2) + -984492638 ^ 0x759CFCAE ^ 0x759CFCAE;
                        int cfr_ignored_1 = (Integer.rotateRight(0x9D149DF3 ^ n2, 6) + 165461928) * -1659593229;
                        n3 = (n2 ^ 0xEF3304AA ^ 0xC551D5A2) + -984492638;
                        n -= 2;
                        continue block28;
                    }
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x7B75907A ^ 0xC551D5A2) + -984492638));
                    n -= 2;
                    continue block28;
                }
                case -281869142: {
                    int cfr_ignored_2 = Integer.rotateRight(0x460ABC87 ^ n2, 11) - 2141877140;
                    throw null;
                }
                case 2071302266: {
                    int cfr_ignored_3 = Integer.rotateRight(0x7F980BAE ^ n2, 18) - 2009532749;
                    tsf2.thds_4(0.0f);
                    tsf2.dshb(0.0f);
                    tsf2.khht(false);
                    tsf2.khrn(false);
                    tsf2.bshh(false);
                    return;
                }
                case -1296093384: {
                    int cfr_ignored_4 = (Integer.rotateLeft(0xBFDB6B5C ^ n2, 10) - 1072668511) * -1076139171;
                    n3 = (n2 ^ 0x50152C59 ^ 0xC551D5A2) + -984492638 ^ 0x50D2A8AF ^ 0x50D2A8AF;
                    int cfr_ignored_5 = (Integer.rotateRight(0xBF0B777F ^ n2, 10) - 650188700) * -1089767553;
                    try {
                        n -= 4;
                        if ((0x7357D2425B8E1BDBL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638;
                    }
                    n += 2;
                    continue block28;
                }
                case 1951952681: {
                    int cfr_ignored_6 = (Integer.rotateLeft(0xF1D86E34 ^ n2, 17) - 1301477255) * -237474251;
                    n3 = (n2 ^ 0x9F882F3C ^ 0xC551D5A2) + -984492638 + -229178345 - -229178345;
                    int cfr_ignored_7 = (Integer.rotateRight(0xF325C733 ^ n2, 17) + 1978711656) * -215627981;
                    n3 = (n2 ^ 0x51A2B20 ^ 0xC551D5A2) + -984492638 + -1283861722 - -1283861722;
                    int cfr_ignored_8 = (Integer.rotateRight(0xB680DF9A ^ n2, 9) + 502837985) * -1233068133;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638));
                    n -= 5;
                    continue block28;
                }
                case 1474975709: {
                    int cfr_ignored_9 = Integer.rotateLeft(0x2958C0A9 ^ n2, 8) + 102560690;
                    int cfr_ignored_10 = (int)(0xEBEA6E9427D4EB4FL ^ (long)n2 ^ 0x2058831A2DB87A05L);
                    n3 = (n2 ^ 0x8F855707 ^ 0xC551D5A2) + -984492638 + -2138537033 - -2138537033;
                    int cfr_ignored_11 = Integer.rotateRight(0x70CD426B ^ n2, 17) + -1388795344;
                    n3 = (n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638 + -1909299317 - -1909299317;
                    n -= 3;
                    continue block28;
                }
                case 229196140: {
                    int cfr_ignored_12 = (Integer.rotateLeft(0x79C20FF9 ^ n2, 18) + -1025667486) * 2042761209;
                    int cfr_ignored_13 = (int)(0xBB70A1C427D4EB4FL ^ (long)n2 ^ 0xBEF8831A2DB8DB30L);
                    n3 = (n2 ^ 0xD6814E48 ^ 0xC551D5A2) + -984492638 + -609504568 - -609504568;
                    int cfr_ignored_14 = Integer.rotateLeft(0x9088FA4 ^ n2, 4) - 476513303;
                    try {
                        if ((0x854D8F02E8343F0BL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638 ^ 0x7911E915 ^ 0x7911E915;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638;
                    }
                    ++n;
                    continue block28;
                }
                case 1904637702: {
                    int cfr_ignored_15 = (Integer.rotateLeft(0x9E59A2B1 ^ n2, 6) + 825774762) * -1638292815;
                    int cfr_ignored_16 = (int)(0x5CEB0C8C27D4EB4FL ^ (long)n2 ^ 0xE468831A2DB91407L);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xD0C26A1F ^ 0xC551D5A2) + -984492638));
                    int cfr_ignored_17 = (Integer.rotateLeft(0x10FEFCB9 ^ n2, 5) + 322845090) * 285146297;
                    int cfr_ignored_18 = (int)(0xD24C528427D4EB4FL ^ (long)n2 ^ 0x5878831A2DB80949L);
                    n3 = (n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638 ^ 0x152B5EF2 ^ 0x152B5EF2;
                    int cfr_ignored_19 = (Integer.rotateLeft(0xEA2AE2FC ^ n2, 16) - 1603214271) * -366288131;
                    n -= 3;
                    continue block28;
                }
                case -1082153360: {
                    int cfr_ignored_20 = Integer.rotateLeft(0x6752A2C ^ n2, 3) - -863126897;
                    n3 = (n2 ^ 0x6F455D8F ^ 0xC551D5A2) + -984492638 + -1555601580 - -1555601580;
                    int cfr_ignored_21 = Integer.rotateLeft(0x4191B621 ^ n2, 11) + -184373958;
                    int cfr_ignored_22 = (int)(0x8323181C27D4EB4FL ^ (long)n2 ^ 0xCD48831A2DB8AB97L);
                    try {
                        n += 5;
                        if ((0xEB2C7EA17956BF1FL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (int)((long)((n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638) ^ 0x906C2BD3FF3DDFCL ^ 0x906C2BD3FF3DDFCL);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638 ^ 0x1A168CE5 ^ 0x1A168CE5;
                    }
                    ++n;
                    continue block28;
                }
                case -31290196: {
                    int cfr_ignored_23 = Integer.rotateLeft(0xD28A3A81 ^ n2, 13) + -2095401766;
                    int cfr_ignored_24 = (int)(0x103894BC27D4EB4FL ^ (long)n2 ^ 0xD408831A2DB98DA0L);
                    n3 = (int)((long)((n2 ^ 0xF727AEA5 ^ 0xC551D5A2) + -984492638) ^ 0xD0480894F329F762L ^ 0xD0480894F329F762L);
                    int cfr_ignored_25 = (Integer.rotateLeft(0x2B2C281C ^ n2, 8) - 1052146335) * 724314141;
                    try {
                        n += 5;
                        if ((0x581A45215677F1C5L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638 + 742817578 - 742817578;
                    }
                    n += 3;
                    continue block28;
                }
                case -2049628943: {
                    int cfr_ignored_26 = (Integer.rotateRight(0xA11B6EBE ^ n2, 7) - -2035283907) * -1592037697;
                    n3 = (n2 ^ 0x1D1AC726 ^ 0xC551D5A2) + -984492638 + -1280420870 - -1280420870;
                    int cfr_ignored_27 = Integer.rotateLeft(0xD7D28265 ^ n2, 13) - 651913590;
                    int cfr_ignored_28 = (int)(0x15602C5827D4EB4FL ^ (long)n2 ^ 0xA5C0831A2DB98711L);
                    try {
                        n += 4;
                        if ((0x8AD7B4914477D481L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638;
                    }
                    n += 5;
                    continue block28;
                }
                case 1644667284: {
                    int cfr_ignored_29 = Integer.rotateLeft(0xDF559865 ^ n2, 14) - 263918454;
                    int cfr_ignored_30 = (int)(0x1DE7365827D4EB4FL ^ (long)n2 ^ 0x91C0831A2DB9961FL);
                    n3 = (n2 ^ 0x83B28835 ^ 0xC551D5A2) + -984492638 + 587392510 - 587392510;
                    int cfr_ignored_31 = Integer.rotateLeft(0xE8EF3180 ^ n2, 16) + 961846715;
                    n3 = (n2 ^ 0x5E82F68 ^ 0xC551D5A2) + -984492638 ^ 0xA87EF486 ^ 0xA87EF486;
                    int cfr_ignored_32 = Integer.rotateRight(0x1C328527 ^ n2, 6) - 1853603572;
                    n3 = (int)((long)((n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638) ^ 0x899005A416E1BDFEL ^ 0x899005A416E1BDFEL);
                    n -= 2;
                    continue block28;
                }
                case 1733286290: {
                    int cfr_ignored_33 = Integer.rotateLeft(0x4CC3AC61 ^ n2, 12) + 1343192826;
                    int cfr_ignored_34 = (int)(0x8E71025C27D4EB4FL ^ (long)n2 ^ 0xF9C8831A2DB8B133L);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xE31EC85F ^ 0xC551D5A2) + -984492638));
                    int cfr_ignored_35 = Integer.rotateRight(0xB7846D8F ^ n2, 9) - 1030153100;
                    n3 = (n2 ^ 0x24BCAB88 ^ 0xC551D5A2) + -984492638 ^ 0xB9B717F3 ^ 0xB9B717F3;
                    int cfr_ignored_36 = (Integer.rotateRight(0xD9976B5F ^ n2, 14) - 1572052924) * -644388001;
                    n3 = (int)((long)((n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638) ^ 0x55AA7391898DDD10L ^ 0x55AA7391898DDD10L);
                    n -= 3;
                    continue block28;
                }
                case 1721861710: {
                    int cfr_ignored_37 = Integer.rotateLeft(0x758171A5 ^ n2, 17) - 1057645110;
                    int cfr_ignored_38 = (int)(0xB733DF9827D4EB4FL ^ (long)n2 ^ 0x4240831A2DB8C3B6L);
                    n3 = (n2 ^ 0x60006A58 ^ 0xC551D5A2) + -984492638 ^ 0x91FE00FC ^ 0x91FE00FC;
                    int cfr_ignored_39 = (Integer.rotateRight(0xB863995F ^ n2, 10) - 1483551164) * -1201432225;
                    try {
                        n -= 2;
                        if ((0xF7DE5D1176CA76BBL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638 + -1540949533 - -1540949533;
                    }
                    ++n;
                    continue block28;
                }
            }
            int cfr_ignored_40 = (Integer.rotateRight(0xB48EA8D2 ^ n2, 9) + -509341527) * -1265719085;
            n3 = (n2 ^ 0xA8C8D8F7 ^ 0xC551D5A2) + -984492638;
        }
    }

    private boolean tst_3() {
        int n = 854533357;
        int n2 = (n = Integer.rotateLeft(n * 1257723011, 3) ^ 0x1B3C0AA2) ^ 0x7DDBFAE3;
        if ((n2 ^ n) != 2111568611) {
            int cfr_ignored_0 = (0x4F34DE0E ^ n) + -954921030;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return this.dhhkh_2.sdh_2() != this.jll;
    }

    private boolean tthh_3() {
        int n = -2000247221;
        n = Integer.rotateLeft(n * 134898533, 9) ^ 0x18C62C0C;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 22);
        int n2 = n ^ 0x37D6B1A8;
        if ((n2 ^ n) != 936817064) {
            int cfr_ignored_0 = (0xBF1017E3 ^ n) - 1515012377;
        }
        return this.dhhkh_2.sdh_2() != this.jll;
    }

    private static String bsb(String string, int n, int n2, int n3) {
        int n4 = 1044133836;
        n4 = Integer.rotateLeft(n4 * -807219485, 24) ^ 0x8C6FD46E;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateLeft(n ^ n4, 10)) ^ 0x354981AE;
        if ((n5 ^ n4) != 894009774) {
            int cfr_ignored_0 = (0xB75B662 ^ n4) - -1203753715;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x51C1763B ^ n2 ^ i * -629506809 ^ zkhm, 22) ^ tqk));
        }
        return new String(cArray);
    }

    private static boolean azm(class_746 class_7462) {
        block0: {
            int n = 286243134;
            n = Integer.rotateLeft(n * 1597707313, 15) ^ 0x921B9CB;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0xA12C1237;
            if ((n2 ^ n) == -1590947273) break block0;
            int cfr_ignored_0 = (0xB023AB09 ^ n) - 2076212601;
        }
        return class_7462.method_5740();
    }

    private static class_7172 dhdh_5(class_315 class_3152) {
        block0: {
            int n = -403953152;
            int n2 = (n = Integer.rotateLeft(n * -736010279, 5) ^ 0x1CD8AC8B) ^ 0x341B4BE;
            if ((n2 ^ n) == 54637758) break block0;
            int cfr_ignored_0 = (0xE4AD9EBE ^ n) - -1277593715;
        }
        return class_3152.method_42448();
    }

    private static double jkhs(class_746 class_7462) {
        block0: {
            int n = -398498471;
            int n2 = (n = Integer.rotateLeft(n * -1253628935, 10) ^ 0xD6378234) ^ 0xECB7885A;
            if ((n2 ^ n) == -323516326) break block0;
            int cfr_ignored_0 = (0x488ED03 ^ n) - 325060777;
        }
        return class_7462.method_23317();
    }

    private static boolean sghdh_2(class_746 class_7462) {
        block0: {
            int n = 1414556772;
            n = Integer.rotateLeft(n * -53936581, 18) ^ 0x2102E3B0;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0xA904D988;
            if ((n2 ^ n) == -1459299960) break block0;
            int cfr_ignored_0 = (0xFD54B5EC ^ n) - 695996243;
        }
        return class_7462.method_24828();
    }

    private static float dhja(class_746 class_7462) {
        block0: {
            int n = bfd_2.sns_3(-703386419);
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0x9FF007;
            if ((n2 ^ n) == 10481671) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xD68CDCCA ^ n, 13) + -9675855;
        }
        return class_7462.method_36455();
    }

    private static class_7172 tld_2(class_315 class_3152) {
        block0: {
            int n = 12904529;
            int n2 = (n = Integer.rotateLeft(n * 1852964597, 22) ^ 0x39FA6CBF) ^ 0x1228C48F;
            if ((n2 ^ n) == 304661647) break block0;
            int cfr_ignored_0 = (0x12EC2CDE ^ n) + 1351791525;
        }
        return class_3152.method_42448();
    }

    private static double zqf(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = -1363690176;
            n = Integer.rotateLeft(n * 866449765, 13) ^ 0xCF661EB1;
            class_243 class_2434 = class_2432;
            n = Integer.rotateLeft((class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n, 7);
            class_243 class_2435 = class_2433;
            n = Integer.rotateRight((class_2435 != null ? System.identityHashCode(class_2435) : 0) ^ n, 19);
            int n2 = n ^ 0x8A413FDA;
            if ((n2 ^ n) == -1975435302) break block0;
            int cfr_ignored_0 = (0x24F6829A ^ n) + 817026655;
        }
        return class_2432.method_1025(class_2433);
    }

    private static class_239.class_240 kl(class_3965 class_39652) {
        block0: {
            int n = bfd_2.sns_3(321412894);
            class_3965 class_39653 = class_39652;
            n = Integer.rotateRight((class_39653 != null ? System.identityHashCode(class_39653) : 0) ^ n, 26);
            int n2 = n ^ 0xB0207E38;
            if ((n2 ^ n) == -1340047816) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xA3082126 ^ n, 7) - -1034313003;
        }
        return class_39652.method_17783();
    }

    private static class_2338 thfm(class_3965 class_39652) {
        block0: {
            int n = bfd_2.sns_3(351228240);
            int n2 = n ^ 0x85AF5E8D;
            if ((n2 ^ n) == -2052104563) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x91400FDD ^ n, 5) - -1692431618) * -1858072611;
            int cfr_ignored_1 = (int)(0x53F2A1E027D4EB4FL ^ (long)n ^ 0xBEB0831A2DB90A34L);
        }
        return class_39652.method_17777();
    }

    private static double ds_4(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = bfd_2.sns_3(-344972076);
            class_243 class_2434 = class_2433;
            n = (class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n;
            int n2 = n ^ 0x57B929FD;
            if ((n2 ^ n) == 1471752701) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xBCC90D29 ^ n, 10) + -524929230;
            int cfr_ignored_1 = (int)(0x7E7BA31427D4EB4FL ^ (long)n ^ 0xBB58831A2DB95126L);
        }
        return class_2432.method_1025(class_2433);
    }

    private static boolean rtm_2() {
        block0: {
            int n = 1488583148;
            int n2 = (n = Integer.rotateLeft(n * -442673569, 18) ^ 0x5F92809A) ^ 0x627A482D;
            if ((n2 ^ n) == 1652181037) break block0;
            int cfr_ignored_0 = (0x3AC3B1C1 ^ n) - 425874721;
        }
        return yf.dnkh();
    }

    private static float[] zym(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = -358902489;
            n = Integer.rotateLeft(n * 1159760263, 5) ^ 0x420D4707;
            class_243 class_2434 = class_2433;
            n = (class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n;
            int n2 = n ^ 0xDBE5B212;
            if ((n2 ^ n) == -605703662) break block0;
            int cfr_ignored_0 = (0x317E2735 ^ n) + 1597799951;
        }
        return btj_2.thsf_2(class_2432, class_2433);
    }

    private static double nq(double d, double d2, double d3) {
        block0: {
            int n = 2141861693;
            n = Integer.rotateLeft(n * -1392217685, 4) ^ 0xF8D3CE9;
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0x7B554254;
            if ((n2 ^ n) == 2069185108) break block0;
            int cfr_ignored_0 = (0x4FF7569 ^ n) + 1548875968;
        }
        return class_3532.method_15350((double)d, (double)d2, (double)d3);
    }

    private static int adb(class_2338 class_23382) {
        block0: {
            int n = -1946951053;
            n = Integer.rotateLeft(n * 611161541, 20) ^ 0x6066DB6E;
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0x6D7338E8;
            if ((n2 ^ n) == 1836267752) break block0;
            int cfr_ignored_0 = (0xE680DA9B ^ n) + 1711642794;
        }
        return class_23382.method_10264();
    }

    private static double tqk(double d, double d2, double d3) {
        block0: {
            int n = -865680732;
            n = Integer.rotateLeft(n * -998219163, 19) ^ 0x78D9AB27;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d2) ^ n, 24);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d3) ^ n, 19);
            int n2 = n ^ 0xBB0EA56F;
            if ((n2 ^ n) == -1156668049) break block0;
            int cfr_ignored_0 = (0x776867CB ^ n) - -1278857424;
        }
        return class_3532.method_15350((double)d, (double)d2, (double)d3);
    }

    private static double bmn(double d, double d2, double d3) {
        block0: {
            int n = bfd_2.sns_3(95817463);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 7);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d3) ^ n, 13);
            int n2 = n ^ 0x29867098;
            if ((n2 ^ n) == 696676504) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x2C307E6F ^ n, 8) - 1581051564;
        }
        return class_3532.method_15350((double)d, (double)d2, (double)d3);
    }

    private static int thhy_2(class_2338 class_23382) {
        block0: {
            int n = bfd_2.sns_3(592028269);
            int n2 = n ^ 0x7B8CC7D6;
            if ((n2 ^ n) == 2072823766) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x58C565BB ^ n, 14) + -1002114848) * 1489331643;
        }
        return class_23382.method_10264();
    }

    private static int jaf(class_2338 class_23382) {
        block0: {
            int n = 1190254804;
            int n2 = (n = Integer.rotateLeft(n * 2077286339, 28) ^ 0xFABD27E) ^ 0x105FA7A7;
            if ((n2 ^ n) == 274704295) break block0;
            int cfr_ignored_0 = (0x56AE7F73 ^ n) - -1222589811;
        }
        return class_23382.method_10260();
    }

    private static int ddw_3(class_2338 class_23382) {
        block0: {
            int n = -740573860;
            int n2 = (n = Integer.rotateLeft(n * 1428921693, 20) ^ 0xFB4307A) ^ 0x870965A1;
            if ((n2 ^ n) == -2029427295) break block0;
            int cfr_ignored_0 = (0x54D2D8FD ^ n) + -444299312;
        }
        return class_23382.method_10263();
    }

    private static class_239.class_240 sar_4(class_239 class_2392) {
        block0: {
            int n = bfd_2.sns_3(-288553759);
            class_239 class_2393 = class_2392;
            n = (class_2393 != null ? System.identityHashCode(class_2393) : 0) ^ n;
            int n2 = n ^ 0xE09D2515;
            if ((n2 ^ n) == -526572267) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xE5021F4 ^ n, 4) - -1072579641) * 240132597;
        }
        return class_2392.method_17783();
    }

    private static float dhghd(float f) {
        block0: {
            int n = -1057206083;
            n = Integer.rotateLeft(n * -115332793, 13) ^ 0x91345AE1;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 16);
            int n2 = n ^ 0x106252CD;
            if ((n2 ^ n) == 274879181) break block0;
            int cfr_ignored_0 = (0xD09E0270 ^ n) + -1325549317;
        }
        return class_3532.method_15362((float)f);
    }

    private static float tdb_3(float f) {
        block0: {
            int n = bfd_2.sns_3(-1555751872);
            int n2 = n ^ 0x97C10F87;
            if ((n2 ^ n) == -1748955257) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x348413C7 ^ n, 9) - 1616643156;
        }
        return class_3532.method_15374((float)f);
    }

    private static boolean zlq_2(class_304 class_3042) {
        block0: {
            int n = bfd_2.sns_3(-1688413325);
            int n2 = n ^ 0xD93247FC;
            if ((n2 ^ n) == -651016196) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x426E9C8F ^ n, 11) - 264410252;
        }
        return class_3042.method_1434();
    }

    private static double skhs(double d) {
        block0: {
            int n = 1561260024;
            int n2 = (n = Integer.rotateLeft(n * 1411500035, 10) ^ 0x32C4593E) ^ 0x2E56FCA8;
            if ((n2 ^ n) == 777452712) break block0;
            int cfr_ignored_0 = (0x73581350 ^ n) + -533799927;
        }
        return Math.toRadians(d);
    }

    private static double jht_4(double d) {
        block0: {
            int n = bfd_2.sns_3(1404571911);
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 7);
            int n2 = n ^ 0x4B906159;
            if ((n2 ^ n) == 1267753305) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x1828705E ^ n, 6) - -247252323) * 405303391;
        }
        return Math.cos(d);
    }

    private static boolean khad(class_304 class_3042) {
        block0: {
            int n = 1265666412;
            int n2 = (n = Integer.rotateLeft(n * -508329561, 6) ^ 0x5C18F64F) ^ 0x152D748A;
            if ((n2 ^ n) == 355300490) break block0;
            int cfr_ignored_0 = (0x5E5DFDE6 ^ n) - -1345320795;
        }
        return class_3042.method_1434();
    }

    private static float bb(tay tay2) {
        block0: {
            int n = 309898395;
            int n2 = (n = Integer.rotateLeft(n * -1434922975, 15) ^ 0x63D3B795) ^ 0x7C485212;
            if ((n2 ^ n) == 2085114386) break block0;
            int cfr_ignored_0 = (0x6E30FE89 ^ n) + 479337609;
        }
        return tay2.hkj();
    }

    private static class_9779 dwgh(class_310 class_3102) {
        block0: {
            int n = -2006591226;
            n = Integer.rotateLeft(n * -1268961033, 17) ^ 0x6D3EEBA5;
            class_310 class_3103 = class_3102;
            n = (class_3103 != null ? System.identityHashCode(class_3103) : 0) ^ n;
            int n2 = n ^ 0x3A5FB047;
            if ((n2 ^ n) == 979349575) break block0;
            int cfr_ignored_0 = (0xB23A6941 ^ n) - -1445194615;
        }
        return class_3102.method_61966();
    }

    private static double hdm_2(bdhd_2 bdhd2, double d, double d2, float f) {
        block0: {
            int n = 1002491041;
            n = Integer.rotateLeft(n * -1894533615, 4) ^ 0x7FA8A831;
            n = (int)Double.doubleToLongBits(d) ^ n;
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0xC43B3821;
            if ((n2 ^ n) == -1002751967) break block0;
            int cfr_ignored_0 = (0xFFFBF480 ^ n) - 498702695;
        }
        return bdhd2.afz_2(d, d2, f);
    }

    private static class_9779 ddhgh_2(class_310 class_3102) {
        block0: {
            int n = 367704862;
            int n2 = (n = Integer.rotateLeft(n * 785936293, 15) ^ 0x4E6E54B8) ^ 0x3CBE98A7;
            if ((n2 ^ n) == 1019123879) break block0;
            int cfr_ignored_0 = (0x295423B9 ^ n) + -1880997025;
        }
        return class_3102.method_61966();
    }

    private static double tjj(bdhd_2 bdhd2, double d, double d2, float f) {
        block0: {
            int n = -1941197568;
            n = Integer.rotateLeft(n * 1792728045, 14) ^ 0xF7F4AFBB;
            bdhd_2 bdhd3 = bdhd2;
            n = Integer.rotateRight((bdhd3 != null ? System.identityHashCode(bdhd3) : 0) ^ n, 13);
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x1720DD9;
            if ((n2 ^ n) == 24251865) break block0;
            int cfr_ignored_0 = (0x8D39A0D9 ^ n) - -1452485413;
        }
        return bdhd2.afz_2(d, d2, f);
    }

    private static double bkhz(bdhd_2 bdhd2, double d, double d2, float f) {
        block0: {
            int n = 2104416555;
            n = Integer.rotateLeft(n * 1525597859, 12) ^ 0x53CF1439;
            bdhd_2 bdhd3 = bdhd2;
            n = (bdhd3 != null ? System.identityHashCode(bdhd3) : 0) ^ n;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 27);
            int n2 = n ^ 0x76AA4DE8;
            if ((n2 ^ n) == 1990872552) break block0;
            int cfr_ignored_0 = (0xBC494C3 ^ n) + 0x6BB8868B;
        }
        return bdhd2.afz_2(d, d2, f);
    }

    private static String[] sbm(String string) {
        int n = 1663665950;
        int n2 = (n = Integer.rotateLeft(n * 452124847, 8) ^ 0xB0E4E121) ^ 0xA8FB4921;
        if ((n2 ^ n) != -1459926751) {
            int cfr_ignored_0 = (0xCBD2CE3F ^ n) + -254768592;
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

    private static CallSite tq_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1174017492;
            n3 = Integer.rotateLeft(n3 * -1232337665, 23) ^ 0x49663D58;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 23);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x5934EB87;
            if ((n4 ^ n3) != 1496640391) {
                int cfr_ignored_0 = (0x1CCEFE53 ^ n3) + 2045081969;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ rhb_2 ^ string.hashCode()) + (n2 + jrt_2) + i ^ rhb_2, 8) + jrt_2);
            }
            String[] stringArray = bdhd_2.sbm(new String(cArray));
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

    private static String[] rgu7ozp397(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite qh68v8h5gnv(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ w7bb8uhr ^ string.hashCode()) + (n2 + rlhcagx4kb9) + i ^ w7bb8uhr, 24) + rlhcagx4kb9);
            }
            String[] stringArray = bdhd_2.rgu7ozp397(new String(cArray));
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

