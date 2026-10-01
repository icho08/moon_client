/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1531
 *  net.minecraft.class_1533
 *  net.minecraft.class_1534
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1688
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1829
 *  net.minecraft.class_2185
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2350$class_2353
 *  net.minecraft.class_2354
 *  net.minecraft.class_238
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_2401
 *  net.minecraft.class_243
 *  net.minecraft.class_2478
 *  net.minecraft.class_2533
 *  net.minecraft.class_2680
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1531;
import net.minecraft.class_1533;
import net.minecraft.class_1534;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1688;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1829;
import net.minecraft.class_2185;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2354;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_2401;
import net.minecraft.class_243;
import net.minecraft.class_2478;
import net.minecraft.class_2533;
import net.minecraft.class_2680;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.bt;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bda;
import us.m0vy.moondlc.m0vyguard.bzkh;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bfn;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.taj;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tthq;
import us.m0vy.moondlc.m0vyguard.tkhk;
import us.m0vy.moondlc.m0vyguard.jth_3;
import us.m0vy.moondlc.m0vyguard.hd_2;
import us.m0vy.moondlc.m0vyguard.khs_2;
import us.m0vy.moondlc.m0vyguard.ss_2;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.kq;
import us.m0vy.moondlc.m0vyguard.wk;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Trap Escaper", category=bzw.OTHER, desc="Automatically breaks trap materials to escape easily")
public class thd_6
extends bnq {
    private final tay dnh = new tay(this, "Range").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(1451169957 - 364845221)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xF7EB64E5 ^ 0x3B265929, 16))).ssd_5(Float.intBitsToFloat(Integer.reverse(942260952) ^ 0x5BD3941C));
    private final badh_2 dhkhd = new badh_2(this, "Through Walls").bts(false);
    private final badh_2 tdhkh = new badh_2(this, "Return T".concat("o Slot")).bts(true);
    private final badh_2 sakh_2 = new badh_2(this, "Break ".concat("Minecarts")).bts(true);
    private final badh_2 dz_2 = new badh_2(this, "Break ".concat("ArmorStands")).bts(true);
    private final badh_2 sht_3 = new badh_2(this, "Sword For Minecart").bts(true);
    private final badh_2 sghw = new badh_2(this, "Auto Obsidian").bts(false);
    private final tay dhskh_2 = new tay(this, "Delay").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1696058616) ^ 0x53361759)).rkh_3(Float.intBitsToFloat(1612879652 + -520263460)).ssd_5(0.0f);
    private final badh_2 sdhz = new badh_2(this, "Water Lever").bts(true);
    private static final int jkd_2 = 10;
    private int zzb = -1;
    private class_2338 shtkh_2 = null;
    private class_1297 dhsr = null;
    private long jb = 0L;
    private hd_2 thky = hd_2.sst_4;
    private class_2338 khdhs_2 = null;
    private int thyz = -1;
    private final bql<btt> tqz = this::tqr;
    private static final int dhaa = 1424177554;
    private static final int thhz_2 = 1904725346;
    private static final int dhlth = -463795398;
    private static final int khhj = 2063997010;
    private static final int by69h1ae1ji = 1304467216;
    private static final int i3m9a4e2j28 = 1108251815;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ssipc4tfcm;

    @Override
    public void nc() {
        int n = 501571987;
        n = Integer.rotateLeft(n * -1851282951, 13) ^ 0x656373A4;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 20);
        int n2 = n ^ 0x7731649F;
        if ((n2 ^ n) != 1999725727) {
            int cfr_ignored_0 = (0x6AD4050C ^ n) + 1856519521;
        }
        this.zam_3();
        thd_6.zwkh_2(this);
    }

    private void zthm() {
        boolean bl;
        if (thd_6.mc.field_1724 == null || thd_6.mc.field_1687 == null || thd_6.mc.field_1761 == null) {
            this.zam_3();
            this.azs();
            return;
        }
        if (this.thky == hd_2.ssa) {
            long l = System.currentTimeMillis();
            long l2 = Math.round(this.dhskh_2.thw_5());
            if (l - this.khfj() >= l2) {
                int n = this.mth();
                if (n == -1) {
                    n = this.bghsh();
                }
                if (n != -1) {
                    thd_6.mc.field_1724.method_31548().field_7545 = n;
                    thd_6.mc.field_1761.method_2919((class_1657)thd_6.mc.field_1724, class_1268.field_5808);
                    thd_6.mc.field_1724.method_6104(class_1268.field_5808);
                }
                this.azs();
            }
            return;
        }
        long l = Math.round(this.dhskh_2.thw_5());
        if (l > 0L && System.currentTimeMillis() - this.jb < l) {
            return;
        }
        tthq tthq2 = this.tsw();
        if (tthq2 == null) {
            if (this.sghw.shzl()) {
                this.ghl();
            }
            this.zam_3();
            return;
        }
        taj taj2 = tthq2.znt_3() ? tkhk.zthb_2(tthq2.khaf.method_46558()) : tkhk.zthb_2(tthq2.dhdf.method_5829().method_1005());
        kq.thzt_2().hja(taj2, ss_2.tddh, bda.zhz_3, this);
        kq.thzt_2().stk_3();
        taj taj3 = kq.thzt_2().hls_2();
        float f = Math.abs(class_3532.method_15393((float)(taj3.dda_3() - taj2.dda_3())));
        float f2 = Math.abs(class_3532.method_15393((float)(taj3.shyq() - taj2.shyq())));
        boolean bl2 = bl = f < 3.0f && f2 < 3.0f;
        if (bl) {
            if (tthq2.znt_3()) {
                int n;
                this.dhsr = null;
                class_2680 class_26802 = thd_6.mc.field_1687.method_8320(tthq2.khaf);
                if (class_26802.method_26204() instanceof class_2401 && this.sdhz.shzl()) {
                    int n2;
                    int n3;
                    n = this.bghsh();
                    if (n == -1 && (n3 = this.rzz_2()) != -1 && (n2 = bfn.tfy_2()) != -1 && n2 != thd_6.mc.field_1724.method_31548().field_7545) {
                        bfn.thght_2(n3, n2);
                        n = n2;
                    }
                    if (n != -1) {
                        if (this.zzb == -1) {
                            this.zzb = thd_6.mc.field_1724.method_31548().field_7545;
                        }
                        thd_6.mc.field_1724.method_31548().field_7545 = n;
                        class_3965 class_39652 = new class_3965(tthq2.khaf.method_46558(), class_2350.field_11036, tthq2.khaf, false);
                        thd_6.mc.field_1761.method_2896(thd_6.mc.field_1724, class_1268.field_5808, class_39652);
                        thd_6.mc.field_1724.method_6104(class_1268.field_5808);
                        this.jb = System.currentTimeMillis();
                        if (l == 0L) {
                            n2 = this.mth();
                            if (n2 == -1) {
                                n2 = n;
                            }
                            thd_6.mc.field_1724.method_31548().field_7545 = n2;
                            thd_6.mc.field_1761.method_2919((class_1657)thd_6.mc.field_1724, class_1268.field_5808);
                            thd_6.mc.field_1724.method_6104(class_1268.field_5808);
                            if (this.tdhkh.shzl() && this.zzb != -1) {
                                thd_6.mc.field_1724.method_31548().field_7545 = this.zzb;
                                this.zzb = -1;
                            }
                        } else {
                            this.thky = hd_2.ssa;
                            this.khdhs_2 = tthq2.khaf;
                            this.thyz = this.zzb;
                            this.zzb = -1;
                        }
                        return;
                    }
                }
                if (thd_6.mc.field_1724.method_31548().field_7545 != (n = this.zff(class_26802))) {
                    if (this.zzb == -1) {
                        this.zzb = thd_6.mc.field_1724.method_31548().field_7545;
                    }
                    thd_6.mc.field_1724.method_31548().field_7545 = n;
                }
                if (!tthq2.khaf.equals((Object)this.shtkh_2)) {
                    if (this.shtkh_2 != null) {
                        thd_6.mc.field_1761.method_2925();
                    }
                    this.shtkh_2 = tthq2.khaf.method_10062();
                    class_2350 class_23502 = this.anw(this.shtkh_2);
                    thd_6.mc.field_1761.method_2910(this.shtkh_2, class_23502);
                    thd_6.mc.field_1724.method_6104(class_1268.field_5808);
                } else {
                    class_2350 class_23503 = this.anw(this.shtkh_2);
                    thd_6.mc.field_1761.method_2902(this.shtkh_2, class_23503);
                    thd_6.mc.field_1724.method_6104(class_1268.field_5808);
                }
                this.jb = System.currentTimeMillis();
            } else {
                int n;
                if (this.shtkh_2 != null) {
                    thd_6.mc.field_1761.method_2925();
                    this.shtkh_2 = null;
                }
                this.dhsr = tthq2.dhdf;
                boolean bl3 = tthq2.dhdf instanceof class_1688;
                boolean bl4 = tthq2.dhdf instanceof class_1531;
                if ((bl3 || bl4) && this.sht_3.shzl() && (n = this.trk_2()) != -1 && thd_6.mc.field_1724.method_31548().field_7545 != n) {
                    if (this.zzb == -1) {
                        this.zzb = thd_6.mc.field_1724.method_31548().field_7545;
                    }
                    thd_6.mc.field_1724.method_31548().field_7545 = n;
                }
                if (this.dhskh_2.thw_5() == 0.0f) {
                    for (n = 0; n < 4; ++n) {
                        thd_6.mc.field_1761.method_2918((class_1657)thd_6.mc.field_1724, this.dhsr);
                    }
                } else {
                    thd_6.mc.field_1761.method_2918((class_1657)thd_6.mc.field_1724, this.dhsr);
                }
                thd_6.mc.field_1724.method_6104(class_1268.field_5808);
                this.jb = System.currentTimeMillis();
            }
        }
    }

    private tthq tsw() {
        class_2248 class_22482;
        int n;
        int n2 = wk.ttd_3(-504363995);
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = n2 ^ 0xFF902C91;
        if ((n3 ^ n2) != -7328623) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x1E6028B4 ^ n2, 6) - -1308455673) * 509618357;
        }
        if (thd_6.mc.field_1724 == null || thd_6.mc.field_1687 == null) {
            return null;
        }
        ArrayList<tthq> arrayList = new ArrayList<tthq>();
        class_2338 class_23382 = thd_6.mc.field_1724.method_24515();
        int n4 = (int)thd_6.shdn_2(this.dnh.thw_5());
        class_243 class_2432 = thd_6.mc.field_1724.method_33571();
        double d = thd_6.bqr(this.dnh);
        double d2 = d * d;
        for (int i = -n4; i <= n4; ++i) {
            for (int j = -n4; j <= n4; ++j) {
                for (n = -n4; n <= n4; ++n) {
                    class_243 class_2433;
                    double d3;
                    class_2338 class_23383 = class_23382.method_10069(i, j, n);
                    class_2680 class_26802 = thd_6.mc.field_1687.method_8320(class_23383);
                    if (class_26802.method_26215()) continue;
                    class_22482 = thd_6.ql(class_26802);
                    int n5 = -1;
                    if (class_22482 instanceof class_2185) {
                        n5 = 0;
                    } else if (class_22482 instanceof class_2478) {
                        n5 = 1;
                    } else if (class_22482 instanceof class_2401) {
                        n5 = 2;
                    } else if (class_22482 instanceof class_2354) {
                        n5 = 3;
                    }
                    if (n5 == -1 || !((d3 = class_2432.method_1025(class_2433 = thd_6.djt_4(class_23383))) <= d2) || !this.dhkhd.shzl() && !thd_6.tzn_4(this, class_23383)) continue;
                    arrayList.add(new tthq(class_23383, n5, d3));
                }
            }
        }
        for (class_1297 class_12972 : thd_6.mc.field_1687.method_18112()) {
            double d4;
            if (class_12972 == null || !thd_6.thka(class_12972)) continue;
            n = -1;
            boolean bl = class_12972 instanceof class_1688;
            boolean bl2 = class_12972 instanceof class_1531;
            if (bl && this.sakh_2.shzl() || bl2 && this.dz_2.shzl()) {
                if (this.hwl(class_12972)) {
                    n = -1;
                }
            } else if (class_12972 instanceof class_1534) {
                n = 4;
            } else if (class_12972 instanceof class_1533) {
                n = 5;
            }
            if (n != 653022803 - -1494460845 && n != -1) {
                class_22482 = class_12972.method_5829().method_1005();
                d4 = class_2432.method_1025((class_243)class_22482);
                if (!(d4 <= d2) || !thd_6.bfr(this.dhkhd) && !this.szm_4(class_12972)) continue;
                arrayList.add(new tthq(class_12972, n, d4));
                continue;
            }
            if ((!bl || !thd_6.sdn_2(this.sakh_2)) && (!bl2 || !thd_6.jfj(this.dz_2)) || !this.hwl(class_12972) || !((d4 = class_2432.method_1025((class_243)(class_22482 = thd_6.jsr_2(class_12972.method_5829())))) <= d2)) continue;
            arrayList.add(new tthq(class_12972, -1, d4));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.sort(thd_6::khak);
        return (tthq)arrayList.get(0);
    }

    private boolean hwl(class_1297 class_12972) {
        int n = 221926985;
        n = Integer.rotateLeft(n * -1047910091, 28) ^ 0xABE081EE;
        n = System.identityHashCode(this) ^ n;
        class_1297 class_12973 = class_12972;
        n = Integer.rotateRight((class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n, 27);
        int n2 = n ^ 0xA641AB05;
        if ((n2 ^ n) != -1505645819) {
            int cfr_ignored_0 = (0xAB7BFD4C ^ n) + 1547684087;
        }
        if (thd_6.mc.field_1724 == null) {
            return false;
        }
        class_243 class_2432 = thd_6.mc.field_1724.method_33571();
        class_243 class_2433 = class_12972.method_5829().method_1005();
        double d = class_2433.field_1352 - class_2432.field_1352;
        double d2 = class_2433.field_1351 - class_2432.field_1351;
        double d3 = class_2433.field_1350 - class_2432.field_1350;
        double d4 = Math.sqrt(d * d + d3 * d3);
        return d4 <= (double)this.dnh.thw_5() && Math.abs(d2) <= Double.longBitsToDouble(0x7B3ACC0D3243E7C9L ^ 0x3B3ACC0D3243E7C9L);
    }

    private void ghl() {
        boolean bl;
        int n;
        if (thd_6.mc.field_1724 == null || thd_6.mc.field_1687 == null || thd_6.mc.field_1761 == null) {
            return;
        }
        class_2338 class_23382 = thd_6.mc.field_1724.method_24515().method_10086(2);
        boolean bl2 = false;
        for (int i = 0; i <= 10; ++i) {
            class_2680 class_26802 = thd_6.mc.field_1687.method_8320(class_23382.method_10086(i));
            if (!(class_26802.method_26204() instanceof class_2533)) continue;
            bl2 = true;
            break;
        }
        if (!bl2 && this.zmf()) {
            bl2 = true;
        }
        if (!bl2) {
            return;
        }
        class_2338 class_23383 = null;
        for (n = 0; n <= 10; ++n) {
            class_2338 class_23384 = class_23382.method_10086(n);
            if (!thd_6.mc.field_1687.method_8320(class_23384).method_26215()) continue;
            class_23383 = class_23384;
            break;
        }
        if (class_23383 == null) {
            return;
        }
        n = -1;
        for (int i = 0; i < 9; ++i) {
            if (!thd_6.mc.field_1724.method_31548().method_5438(i).method_31574(class_1802.field_8281)) continue;
            n = i;
            break;
        }
        if (n == -1) {
            return;
        }
        khs_2 khs2 = bt.md_2(class_23383, n, bzkh.thfa_2, jth_3.thkhk, 4.5f, 4.5f, new ArrayList(), this.dhkhd.shzl());
        if (khs2 == null) {
            return;
        }
        taj taj2 = new taj(khs2.yaw(), khs2.pitch());
        kq.thzt_2().hja(taj2, ss_2.tddh, bda.zhz_3, this);
        kq.thzt_2().stk_3();
        taj taj3 = kq.thzt_2().hls_2();
        float f = Math.abs(class_3532.method_15393((float)(taj3.dda_3() - taj2.dda_3())));
        float f2 = Math.abs(class_3532.method_15393((float)(taj3.shyq() - taj2.shyq())));
        boolean bl3 = bl = f < 3.0f && f2 < 3.0f;
        if (bl) {
            int n2 = thd_6.mc.field_1724.method_31548().field_7545;
            thd_6.mc.field_1724.method_31548().field_7545 = n;
            try {
                thd_6.mc.field_1761.method_2896(thd_6.mc.field_1724, class_1268.field_5808, khs2.hitResult());
                thd_6.mc.field_1724.method_6104(class_1268.field_5808);
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (this.tdhkh.shzl()) {
                thd_6.mc.field_1724.method_31548().field_7545 = n2;
            }
        }
    }

    private int zff(class_2680 class_26802) {
        int n = 0;
        float f = 0.0f;
        int n2 = 0;
        float f2 = 0.0f;
        int n3 = 0;
        int n4 = 0;
        int n5 = 1423232501;
        n5 = Integer.rotateLeft(n5 * -1255041113, 10) ^ 0x185060C1;
        n5 = Integer.rotateRight(System.identityHashCode(this) ^ n5, 19);
        int n6 = n5 ^ 0x1F9F03CE;
        while (true) {
            block34: {
                block49: {
                    block42: {
                        block44: {
                            block37: {
                                block39: {
                                    block36: {
                                        block41: {
                                            block55: {
                                                block53: {
                                                    block35: {
                                                        block57: {
                                                            block40: {
                                                                block58: {
                                                                    block48: {
                                                                        block47: {
                                                                            block32: {
                                                                                block50: {
                                                                                    block56: {
                                                                                        block54: {
                                                                                            block43: {
                                                                                                block33: {
                                                                                                    block51: {
                                                                                                        block52: {
                                                                                                            block45: {
                                                                                                                block46: {
                                                                                                                    block29: {
                                                                                                                        block38: {
                                                                                                                            block30: {
                                                                                                                                block31: {
                                                                                                                                    if ((n4 = n6 ^ n5) > 157096035) break block29;
                                                                                                                                    if (n4 > -1707822133) break block30;
                                                                                                                                    if (n4 > -1890919275) break block31;
                                                                                                                                    if (n4 == -2029228311) break block32;
                                                                                                                                    if (n4 == -1890919275) break block33;
                                                                                                                                    int cfr_ignored_0 = Integer.rotateLeft(0x5DACE08C ^ n5, 14) - 1548537903;
                                                                                                                                    break block34;
                                                                                                                                }
                                                                                                                                if (n4 == -1783867713) break block35;
                                                                                                                                if (n4 == -1736691605) break block36;
                                                                                                                                int cfr_ignored_1 = Integer.rotateLeft(0x7495E3AD ^ n5, 17) - 579088686;
                                                                                                                                int cfr_ignored_2 = (int)(0xB6274D9027D4EB4FL ^ (long)n5 ^ 0x6650831A2DB8C19FL);
                                                                                                                                if (n4 == -1707822133) break block37;
                                                                                                                                break block34;
                                                                                                                            }
                                                                                                                            if (n4 > -1066180937) break block38;
                                                                                                                            if (n4 == -1542952207) break block39;
                                                                                                                            if (n4 == -1414898580) break block40;
                                                                                                                            if (n4 == -1066180937) break block41;
                                                                                                                            break block34;
                                                                                                                        }
                                                                                                                        if (n4 == -959218725) break block42;
                                                                                                                        if (n4 == -702236908) break block43;
                                                                                                                        int cfr_ignored_3 = Integer.rotateRight(0x22546DE7 ^ n5, 7) - 748088884;
                                                                                                                        if (n4 == 157096035) break block44;
                                                                                                                        break block34;
                                                                                                                    }
                                                                                                                    if (n4 > 698287016) break block45;
                                                                                                                    if (n4 > 346388596) break block46;
                                                                                                                    if (n4 == 277102257) break block47;
                                                                                                                    if (n4 == 346388596) break block48;
                                                                                                                    break block34;
                                                                                                                }
                                                                                                                if (n4 == 353767430) break block49;
                                                                                                                if (n4 == 530514894) break block50;
                                                                                                                if (n4 == 698287016) break block51;
                                                                                                                break block34;
                                                                                                            }
                                                                                                            if (n4 > 1522888148) break block52;
                                                                                                            if (n4 == 1358357541) break block53;
                                                                                                            if (n4 == 1473435728) break block54;
                                                                                                            int cfr_ignored_4 = Integer.rotateLeft(0xFE0A3925 ^ n5, 18) - -946173258;
                                                                                                            int cfr_ignored_5 = (int)(0x3CB8971827D4EB4FL ^ (long)n5 ^ 0xD340831A2DB9D4A0L);
                                                                                                            if (n4 == 1522888148) break block55;
                                                                                                            break block34;
                                                                                                        }
                                                                                                        if (n4 == 1710361910) break block56;
                                                                                                        if (n4 == 2045891101) break block57;
                                                                                                        int cfr_ignored_6 = (Integer.rotateRight(0xB1BD611F ^ n5, 9) - -1974705668) * -1312988897;
                                                                                                        if (n4 == 2133282709) break block58;
                                                                                                        break block34;
                                                                                                    }
                                                                                                    int cfr_ignored_7 = (Integer.rotateLeft(0xF111623D ^ n5, 17) - 897090718) * -250518979;
                                                                                                    int cfr_ignored_8 = (int)(0x33A3CC0027D4EB4FL ^ (long)n5 ^ 0x6570831A2DB9CA96L);
                                                                                                    f = f2;
                                                                                                    n = n2;
                                                                                                    n6 = (int)((long)(n5 ^ 0x8F8F894E) ^ 0x8BA138FCD98EF045L ^ 0x8BA138FCD98EF045L);
                                                                                                    int cfr_ignored_9 = (Integer.rotateRight(0x3CA4A5F3 ^ n5, 10) + 1548597160) * 1017423347;
                                                                                                    n6 = (n5 ^ 0x65F20D36) + 400553106 - 400553106;
                                                                                                    n4 += 2;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_10 = Integer.rotateRight(0x2F27A94A ^ n5, 8) + -1171579087;
                                                                                                n3 = n;
                                                                                                int cfr_ignored_11 = (int)(0xA2C1DD6E48FDD44FL ^ (long)n5 ^ 0x47AC5D4853B8E852L);
                                                                                                n6 = (n5 ^ 0xAF98ABEB) + 1109065200 - 1109065200;
                                                                                                int cfr_ignored_12 = (int)(0xF59BF67CDB3B0DAL ^ (long)n5 ^ 0x83BF57D49A93B362L);
                                                                                                n6 = Integer.reverse(Integer.reverse(n5 ^ 0x15161006));
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_13 = Integer.rotateRight(0x40BDD66 ^ n5, 3) - -2117243243;
                                                                                            f2 = thd_6.mc.field_1724.method_31548().method_5438(n2).method_7924(class_26802);
                                                                                            if (f2 > f) {
                                                                                                int cfr_ignored_14 = (int)(0xE428224DF67C9575L ^ (long)n5 ^ 0xB9EB204AD1CC6581L);
                                                                                                n6 = n5 ^ 0x299F03A8 ^ 0xCACE0ED9 ^ 0xCACE0ED9;
                                                                                                continue;
                                                                                            }
                                                                                            try {
                                                                                                ++n4;
                                                                                                if ((0x51496BD199B150D9L ^ (long)n5 | 1L) == 0L) {
                                                                                                    throw new ArithmeticException();
                                                                                                }
                                                                                                n6 = Integer.reverse(Integer.reverse(n5 ^ 0x65F20D36));
                                                                                            }
                                                                                            catch (ArithmeticException arithmeticException) {
                                                                                                n6 = (int)((long)(n5 ^ 0x65F20D36) ^ 0x89C496ED1C946EE1L ^ 0x89C496ED1C946EE1L);
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_15 = (Integer.rotateRight(0xC6FC4C9F ^ n5, 11) - 485156476) * -956543841;
                                                                                        if (n2 < (0x43F962BF ^ 0x43F962B6)) {
                                                                                            n6 = (n5 ^ 0xB62AB9A5) + -1822544201 - -1822544201;
                                                                                            int cfr_ignored_16 = (Integer.rotateRight(0x89F0123E ^ n5, 4) - -1200630595) * -1980755393;
                                                                                            n6 = n5 ^ 0xD624B714;
                                                                                            n4 -= 5;
                                                                                            continue;
                                                                                        }
                                                                                        try {
                                                                                            n4 -= 3;
                                                                                            if ((0x4A0E26B2533B90EDL ^ (long)n5 | 1L) == 0L) {
                                                                                                throw new ArithmeticException();
                                                                                            }
                                                                                            n6 = (int)((long)(n5 ^ 0x8F4ADC95) ^ 0xA2B8CFF53AA2E720L ^ 0xA2B8CFF53AA2E720L);
                                                                                        }
                                                                                        catch (ArithmeticException arithmeticException) {
                                                                                            n6 = Integer.reverse(Integer.reverse(n5 ^ 0x8F4ADC95));
                                                                                        }
                                                                                        n4 -= 5;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_17 = Integer.rotateRight(0x7C3DAEA3 ^ n5, 18) + 265667832;
                                                                                    ++n2;
                                                                                    try {
                                                                                        n4 += 3;
                                                                                        n6 = (n5 ^ 0x57D2D850) + -1275821892 - -1275821892;
                                                                                    }
                                                                                    catch (IllegalStateException illegalStateException) {
                                                                                        n6 = Integer.reverse(Integer.reverse(n5 ^ 0x57D2D850));
                                                                                    }
                                                                                    n4 -= 3;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_18 = Integer.rotateLeft(0xB12E54E5 ^ n5, 9) - 2029643510;
                                                                                int cfr_ignored_19 = (int)(0x739CFAD827D4EB4FL ^ (long)n5 ^ 0x8C0831A2DB94AE8L);
                                                                                n = thd_6.mc.field_1724.method_31548().field_7545;
                                                                                f = 1.0f;
                                                                                n2 = 0;
                                                                                try {
                                                                                    n6 = n5 ^ 0x57D2D850 ^ 0x20885D00 ^ 0x20885D00;
                                                                                }
                                                                                catch (NoSuchElementException noSuchElementException) {
                                                                                    n6 = Integer.reverse(Integer.reverse(n5 ^ 0x57D2D850));
                                                                                }
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_20 = (Integer.rotateLeft(0x1D47DA55 ^ n5, 6) - -1877930106) * 491248213;
                                                                            int cfr_ignored_21 = (int)(0xDFF5746827D4EB4FL ^ (long)n5 ^ 0x15A0831A2DB8123BL);
                                                                            n = thd_6.mc.field_1724.method_31548().field_7545;
                                                                            f = 1.0f;
                                                                            n2 = 0;
                                                                            int cfr_ignored_22 = (int)(0xE5D9621B7A0F432BL ^ (long)n5 ^ 0x394638AD7D706663L);
                                                                            n6 = n5 ^ 0x57D2D850 ^ 0x82799B5E ^ 0x82799B5E;
                                                                            n4 += 2;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_23 = (Integer.rotateRight(0xD3F3829F ^ n5, 13) - -1361416068) * -739016033;
                                                                        n6 = n5 ^ 0x289A4E8D;
                                                                        int cfr_ignored_24 = (Integer.rotateRight(0xE569C5FE ^ n5, 15) - -869492483) * -446052865;
                                                                        int cfr_ignored_25 = (int)(0x301890FA64BF73A9L ^ (long)n5 ^ 0xDC8405CD1C75CDE0L);
                                                                        n6 = n5 ^ 0x1F9F03CE ^ 0xCB1F9B41 ^ 0xCB1F9B41;
                                                                        n4 += 2;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_26 = Integer.rotateLeft(0xCAEE526C ^ n5, 12) - -1757832625;
                                                                    try {
                                                                        --n4;
                                                                        if ((0xDED835867106FD2FL ^ (long)n5 | 1L) == 0L) {
                                                                            throw new ArithmeticException();
                                                                        }
                                                                        n6 = Integer.reverse(Integer.reverse(n5 ^ 0x1F9F03CE));
                                                                    }
                                                                    catch (ArithmeticException arithmeticException) {
                                                                        n6 = n5 ^ 0x1F9F03CE ^ 0x98EBF221 ^ 0x98EBF221;
                                                                    }
                                                                    continue;
                                                                }
                                                                int cfr_ignored_27 = (Integer.rotateRight(0x97ACDA53 ^ n5, 5) + 1649151816) * -1750279597;
                                                                n6 = n5 ^ 0x7349086D;
                                                                int cfr_ignored_28 = (Integer.rotateRight(0x10AB9F7E ^ n5, 5) - 153481085) * 279682943;
                                                                int cfr_ignored_29 = (int)(0x73AFE406A28BA131L ^ (long)n5 ^ 0x357D89A4B9454A8EL);
                                                                n6 = (n5 ^ 0x1F9F03CE) + -359491206 - -359491206;
                                                                n4 += 2;
                                                                continue;
                                                            }
                                                            int cfr_ignored_30 = Integer.rotateRight(0x5CA82BA7 ^ n5, 14) - 1018882164;
                                                            n6 = (n5 ^ 0x93E8D41A) + -681196932 - -681196932;
                                                            int cfr_ignored_31 = (Integer.rotateLeft(0xFDC3F059 ^ n5, 18) + -1088964094) * -37490599;
                                                            int cfr_ignored_32 = (int)(0x3F715E6427D4EB4FL ^ (long)n5 ^ 0x41B8831A2DB9D333L);
                                                            try {
                                                                if ((0x317C4D5FFB20EBF5L ^ (long)n5 | 1L) == 0L) {
                                                                    throw new ArithmeticException();
                                                                }
                                                                n6 = n5 ^ 0x1F9F03CE;
                                                            }
                                                            catch (ArithmeticException arithmeticException) {
                                                                n6 = n5 ^ 0x1F9F03CE;
                                                            }
                                                            n4 += 4;
                                                            continue;
                                                        }
                                                        int cfr_ignored_33 = (Integer.rotateLeft(0x7321AB31 ^ n5, 17) + -177120726) * 1931586353;
                                                        int cfr_ignored_34 = (int)(0xB193050C27D4EB4FL ^ (long)n5 ^ 0xF768831A2DB8CEF7L);
                                                        n6 = (int)((long)(n5 ^ 0x69D7EB0E) ^ 0xC29AF35003DF5A27L ^ 0xC29AF35003DF5A27L);
                                                        int cfr_ignored_35 = Integer.rotateLeft(0xD71DE04 ^ n5, 4) - -1524137545;
                                                        try {
                                                            n4 += 4;
                                                            n6 = n5 ^ 0x1F9F03CE;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            n6 = (int)((long)(n5 ^ 0x1F9F03CE) ^ 0x93F7E53A194C2B79L ^ 0x93F7E53A194C2B79L);
                                                        }
                                                        n4 += 4;
                                                        continue;
                                                    }
                                                    int cfr_ignored_36 = (Integer.rotateRight(0x6659483F ^ n5, 15) - 1764581084) * 1717127231;
                                                    int cfr_ignored_37 = (int)(0x5641FD132AF96C8CL ^ (long)n5 ^ 0x7569941223F0152L);
                                                    n6 = (n5 ^ 0xED3FC286) + 878018258 - 878018258;
                                                    int cfr_ignored_38 = (int)(0xF6DE3E6DCF60A729L ^ (long)n5 ^ 0x81AB5272B574406DL);
                                                    n6 = (n5 ^ 0x1F9F03CE) + 1511716760 - 1511716760;
                                                    n4 -= 5;
                                                    continue;
                                                }
                                                int cfr_ignored_39 = (Integer.rotateRight(0xC5D4FF13 ^ n5, 11) + -114785656) * -975896813;
                                                n6 = n5 ^ 0xE9200166;
                                                int cfr_ignored_40 = (Integer.rotateLeft(0xEEC3DC18 ^ n5, 16) + -300595677) * -289154023;
                                                try {
                                                    n4 -= 5;
                                                    n6 = n5 ^ 0x1F9F03CE ^ 0xC9F80C51 ^ 0xC9F80C51;
                                                }
                                                catch (NoSuchElementException noSuchElementException) {
                                                    n6 = (n5 ^ 0x1F9F03CE) + -1525893332 - -1525893332;
                                                }
                                                --n4;
                                                continue;
                                            }
                                            int cfr_ignored_41 = Integer.rotateRight(0x618AF50E ^ n5, 15) - -734966803;
                                            try {
                                                n4 -= 2;
                                                if ((0x8D7C91F9C6C2E691L ^ (long)n5 | 1L) == 0L) {
                                                    throw new ArithmeticException();
                                                }
                                                n6 = Integer.reverse(Integer.reverse(n5 ^ 0x1F9F03CE));
                                            }
                                            catch (ArithmeticException arithmeticException) {
                                                n6 = Integer.reverse(Integer.reverse(n5 ^ 0x1F9F03CE));
                                            }
                                            n4 -= 5;
                                            continue;
                                        }
                                        int cfr_ignored_42 = Integer.rotateRight(0x917C9B62 ^ n5, 5) + -1569427431;
                                        n6 = (n5 ^ 0x18FEC82) + 567780983 - 567780983;
                                        int cfr_ignored_43 = (Integer.rotateRight(0x49E9F4F3 ^ n5, 12) + -139310936) * 1240069363;
                                        n6 = (n5 ^ 0x1F9F03CE) + 705681781 - 705681781;
                                        n4 -= 5;
                                        continue;
                                    }
                                    int cfr_ignored_44 = (Integer.rotateLeft(0x822EE911 ^ n5, 3) + -938747830) * -2110854895;
                                    int cfr_ignored_45 = (int)(0x409C472C27D4EB4FL ^ (long)n5 ^ 0x7328831A2DB92CE9L);
                                    n6 = n5 ^ 0x650BCF02 ^ 0xE0D85051 ^ 0xE0D85051;
                                    int cfr_ignored_46 = (Integer.rotateRight(0x4A65F4F3 ^ n5, 12) + 112609448) * 1248195827;
                                    try {
                                        if ((0x202EADC5236DBDL ^ (long)n5 | 1L) == 0L) {
                                            throw new IllegalStateException();
                                        }
                                        n6 = Integer.reverse(Integer.reverse(n5 ^ 0x1F9F03CE));
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        n6 = n5 ^ 0x1F9F03CE ^ 0x5247DA9 ^ 0x5247DA9;
                                    }
                                    continue;
                                }
                                int cfr_ignored_47 = (Integer.rotateRight(0x3D0FA472 ^ n5, 10) + 1765968137) * 1024435315;
                                n6 = (n5 ^ 0x7BE19C78) + 1480756237 - 1480756237;
                                int cfr_ignored_48 = Integer.rotateLeft(0x3CDF2B6C ^ n5, 10) - 1667490127;
                                n6 = (int)((long)(n5 ^ 0x1F9F03CE) ^ 0x3B82CFC15CCC0EF2L ^ 0x3B82CFC15CCC0EF2L);
                                ++n4;
                                continue;
                            }
                            int cfr_ignored_49 = Integer.rotateLeft(0xEEBCF20D ^ n5, 16) - -314642738;
                            int cfr_ignored_50 = (int)(0x2C0E5C3027D4EB4FL ^ (long)n5 ^ 0x4510831A2DB9F5CDL);
                            int cfr_ignored_51 = (int)(0xE789F78366913D59L ^ (long)n5 ^ 0x12760191819462C2L);
                            n6 = Integer.reverse(Integer.reverse(n5 ^ 0x1F9F03CE));
                            n4 += 2;
                            continue;
                        }
                        int cfr_ignored_52 = (Integer.rotateLeft(0xAA111338 ^ n5, 8) + -1670450429) * -1441721543;
                        n6 = (int)((long)(n5 ^ 0xD0162041) ^ 0x12A3D094B4925168L ^ 0x12A3D094B4925168L);
                        int cfr_ignored_53 = Integer.rotateLeft(0xC603FEE4 ^ n5, 11) - -19301161;
                        int cfr_ignored_54 = (int)(0x49C258ED6E5226BL ^ (long)n5 ^ 0xB66D6179BFF1A4E9L);
                        n6 = n5 ^ 0x1F9F03CE ^ 0x46C0A828 ^ 0x46C0A828;
                        --n4;
                        continue;
                    }
                    int cfr_ignored_55 = (Integer.rotateRight(0xBEF05913 ^ n5, 10) + 595093640) * -1091544813;
                    n6 = n5 ^ 0x36C420EA ^ 0x91A1D19D ^ 0x91A1D19D;
                    int cfr_ignored_56 = Integer.rotateLeft(0xFF8C68E8 ^ n5, 18) + -161590445;
                    n6 = (n5 ^ 0x1F9F03CE) + 1481996694 - 1481996694;
                    n4 += 4;
                    continue;
                }
                return n3;
            }
            int cfr_ignored_57 = (Integer.rotateRight(0x8E90BD3F ^ n5, 4) - 1206159836) * -1903116993;
            n6 = n5 ^ 0x1F9F03CE ^ 0x5367804F ^ 0x5367804F;
        }
    }

    private int trk_2() {
        int n = 1169785790;
        n = Integer.rotateLeft(n * -1580898877, 21) ^ 0xD08845A9;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 13);
        int n2 = n ^ 0x4070322E;
        if ((n2 ^ n) != 1081094702) {
            int cfr_ignored_0 = (0x5C9B190 ^ n) - -1766306855;
        }
        if (thd_6.mc.field_1724 == null) {
            return -1;
        }
        int n3 = -1;
        int n4 = -1;
        for (int i = 0; i < 934429756 - 934429747; ++i) {
            int n5;
            class_1799 class_17992 = thd_6.ass_2(thd_6.mc.field_1724).method_5438(i);
            if (!(class_17992.method_7909() instanceof class_1829) || (n5 = thd_6.byl(thd_6.afd_2(class_17992))) <= n4) continue;
            n4 = n5;
            n3 = i;
        }
        return n3;
    }

    private static int byl(class_1792 class_17922) {
        int n = 0;
        int n2 = 0;
        int n3 = -2036203657;
        n3 = Integer.rotateLeft(n3 * 1322117111, 17) ^ 0x930BC6FD;
        class_1792 class_17923 = class_17922;
        n3 = Integer.rotateRight((class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n3, 18);
        int n4 = Integer.rotateLeft(n3 ^ 0xA9523746, 26) + -496185270 - -496185270;
        while (true) {
            block42: {
                block66: {
                    block41: {
                        block49: {
                            block69: {
                                block67: {
                                    block58: {
                                        block52: {
                                            block64: {
                                                block55: {
                                                    block56: {
                                                        block44: {
                                                            block51: {
                                                                block63: {
                                                                    block45: {
                                                                        block40: {
                                                                            block62: {
                                                                                block60: {
                                                                                    block57: {
                                                                                        block43: {
                                                                                            block39: {
                                                                                                block68: {
                                                                                                    block47: {
                                                                                                        block48: {
                                                                                                            block50: {
                                                                                                                block59: {
                                                                                                                    block65: {
                                                                                                                        block61: {
                                                                                                                            block53: {
                                                                                                                                block54: {
                                                                                                                                    block36: {
                                                                                                                                        block46: {
                                                                                                                                            block37: {
                                                                                                                                                block38: {
                                                                                                                                                    if ((n2 = Integer.rotateRight(n4, 26) ^ n3) > -473332990) break block36;
                                                                                                                                                    if (n2 > -1376000647) break block37;
                                                                                                                                                    if (n2 > -1695946288) break block38;
                                                                                                                                                    if (n2 == -1941090768) break block39;
                                                                                                                                                    if (n2 == -1836911639) break block40;
                                                                                                                                                    if (n2 == -1695946288) break block41;
                                                                                                                                                    break block42;
                                                                                                                                                }
                                                                                                                                                if (n2 == -1454229690) break block43;
                                                                                                                                                if (n2 == -1438405287) break block44;
                                                                                                                                                int cfr_ignored_0 = Integer.rotateRight(0xCFDF4287 ^ n3, 12) - 812035476;
                                                                                                                                                if (n2 == -1376000647) break block45;
                                                                                                                                                break block42;
                                                                                                                                            }
                                                                                                                                            if (n2 > -1068811792) break block46;
                                                                                                                                            if (n2 == -1256611383) break block47;
                                                                                                                                            if (n2 == -1155024667) break block48;
                                                                                                                                            if (n2 == -1068811792) break block49;
                                                                                                                                            break block42;
                                                                                                                                        }
                                                                                                                                        if (n2 == -932668434) break block50;
                                                                                                                                        if (n2 == -812449507) break block51;
                                                                                                                                        if (n2 == -473332990) break block52;
                                                                                                                                        break block42;
                                                                                                                                    }
                                                                                                                                    if (n2 > 414681341) break block53;
                                                                                                                                    if (n2 > -179655635) break block54;
                                                                                                                                    if (n2 == -433596765) break block55;
                                                                                                                                    if (n2 == -249517038) break block56;
                                                                                                                                    if (n2 == -179655635) break block57;
                                                                                                                                    break block42;
                                                                                                                                }
                                                                                                                                if (n2 == -143513828) break block58;
                                                                                                                                if (n2 == -11063959) break block59;
                                                                                                                                int cfr_ignored_1 = Integer.rotateLeft(0xA6D1782C ^ n3, 7) - 935013519;
                                                                                                                                if (n2 == 414681341) break block60;
                                                                                                                                break block42;
                                                                                                                            }
                                                                                                                            if (n2 > 772427319) break block61;
                                                                                                                            if (n2 == 418706104) break block62;
                                                                                                                            if (n2 == 453501051) break block63;
                                                                                                                            int cfr_ignored_2 = (Integer.rotateLeft(0xC1F70F7C ^ n3, 11) - -2125955265) * -1040773251;
                                                                                                                            if (n2 == 772427319) break block64;
                                                                                                                            break block42;
                                                                                                                        }
                                                                                                                        if (n2 > 1974421429) break block65;
                                                                                                                        if (n2 == 1020381950) break block66;
                                                                                                                        if (n2 == 1974421429) break block67;
                                                                                                                        break block42;
                                                                                                                    }
                                                                                                                    if (n2 == 1991862707) break block68;
                                                                                                                    if (n2 == 2037225604) break block69;
                                                                                                                    int cfr_ignored_3 = (Integer.rotateRight(0x11136E3F ^ n3, 5) - 364378332) * 286486079;
                                                                                                                    break block42;
                                                                                                                }
                                                                                                                int cfr_ignored_4 = (Integer.rotateLeft(0x91FD9E5C ^ n3, 5) - -1307325345) * -1845649827;
                                                                                                                if (class_17922 != class_1802.field_8528) {
                                                                                                                    n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x9282F3E9, 26)));
                                                                                                                    ++n2;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                int cfr_ignored_5 = (int)(0x3EFE219DAF7A1AA9L ^ (long)n3 ^ 0xBE4B9247CE75D02DL);
                                                                                                                n4 = Integer.rotateLeft(n3 ^ 0xF54AAC2D, 26) + -1146137366 - -1146137366;
                                                                                                                ++n2;
                                                                                                                continue;
                                                                                                            }
                                                                                                            int cfr_ignored_6 = Integer.rotateLeft(0xA0B6D705 ^ n3, 7) - 2055317718;
                                                                                                            int cfr_ignored_7 = (int)(0x6204793827D4EB4FL ^ (long)n3 ^ 0xF00831A2DB969D9L);
                                                                                                            if (class_17922 != class_1802.field_8528) {
                                                                                                                try {
                                                                                                                    n4 = Integer.rotateLeft(n3 ^ 0x9282F3E9, 26) + -865055508 - -865055508;
                                                                                                                }
                                                                                                                catch (ArithmeticException arithmeticException) {
                                                                                                                    n4 = (int)((long)Integer.rotateLeft(n3 ^ 0x9282F3E9, 26) ^ 0xEA043F6EDC2C0DFDL ^ 0xEA043F6EDC2C0DFDL);
                                                                                                                }
                                                                                                                n2 -= 4;
                                                                                                                continue;
                                                                                                            }
                                                                                                            int cfr_ignored_8 = (int)(0xE5F427E192F30CD4L ^ (long)n3 ^ 0xB2B3E955E28E6639L);
                                                                                                            n4 = Integer.rotateLeft(n3 ^ 0xF54AAC2D, 26);
                                                                                                            n2 += 5;
                                                                                                            continue;
                                                                                                        }
                                                                                                        int cfr_ignored_9 = (Integer.rotateRight(0x49BFAFF2 ^ n3, 12) + -225186423) * 1237299187;
                                                                                                        n = 5;
                                                                                                        n4 = Integer.rotateLeft(n3 ^ 0x3CD1CAFE, 26) + 1419902133 - 1419902133;
                                                                                                        int cfr_ignored_10 = (Integer.rotateRight(0xD5693FF3 ^ n3, 13) + -602120792) * -714522637;
                                                                                                        n2 -= 5;
                                                                                                        continue;
                                                                                                    }
                                                                                                    int cfr_ignored_11 = Integer.rotateRight(0xD4EBB78E ^ n3, 13) - -857155219;
                                                                                                    n = 0;
                                                                                                    try {
                                                                                                        n2 -= 5;
                                                                                                        if ((0x5057EFE3FE51E2FBL ^ (long)n3 | 1L) == 0L) {
                                                                                                            throw new UnsupportedOperationException();
                                                                                                        }
                                                                                                        n4 = Integer.rotateLeft(n3 ^ 0x3CD1CAFE, 26) + 1987225322 - 1987225322;
                                                                                                    }
                                                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                        n4 = Integer.rotateLeft(n3 ^ 0x3CD1CAFE, 26);
                                                                                                    }
                                                                                                    n2 += 5;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_12 = Integer.rotateRight(0x925A8666 ^ n3, 5) - -1118575211;
                                                                                                n = 4;
                                                                                                try {
                                                                                                    n2 -= 4;
                                                                                                    if ((0x234D46248D93C21L ^ (long)n3 | 1L) == 0L) {
                                                                                                        throw new IllegalStateException();
                                                                                                    }
                                                                                                    n4 = Integer.rotateLeft(n3 ^ 0x3CD1CAFE, 26) + -383948167 - -383948167;
                                                                                                }
                                                                                                catch (IllegalStateException illegalStateException) {
                                                                                                    n4 = Integer.rotateLeft(n3 ^ 0x3CD1CAFE, 26) + 995468418 - 995468418;
                                                                                                }
                                                                                                n2 += 2;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_13 = (Integer.rotateRight(0xE5D4489A ^ n3, 15) + -653104671) * -439072613;
                                                                                            n = 1;
                                                                                            try {
                                                                                                n2 -= 2;
                                                                                                n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x3CD1CAFE, 26)));
                                                                                            }
                                                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x3CD1CAFE, 26)));
                                                                                            }
                                                                                            n2 -= 3;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_14 = (Integer.rotateRight(0x91144D7F ^ n3, 5) - -1781333604) * -1860940417;
                                                                                        if (class_17922 == class_1802.field_22022) {
                                                                                            n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x89C9FE80, 26)));
                                                                                            int cfr_ignored_15 = Integer.rotateRight(0x10D0DB2B ^ n3, 5) + 229124464;
                                                                                            n4 = Integer.rotateLeft(n3 ^ 0xBB27B8E5, 26);
                                                                                            n2 += 4;
                                                                                            continue;
                                                                                        }
                                                                                        n4 = Integer.rotateLeft(n3 ^ 0xF72427A7, 26) + -942549746 - -942549746;
                                                                                        int cfr_ignored_16 = (Integer.rotateRight(0xC4E344DE ^ n3, 11) - -605882851) * -991738657;
                                                                                        n4 = Integer.rotateLeft(n3 ^ 0x18B788FD, 26) ^ 0x51CCBC34 ^ 0x51CCBC34;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_17 = (Integer.rotateLeft(0xD4213478 ^ n3, 13) + -1268581949) * -736021383;
                                                                                    n = 2;
                                                                                    try {
                                                                                        if ((0xF329E0940B37799DL ^ (long)n3 | 1L) == 0L) {
                                                                                            throw new ArithmeticException();
                                                                                        }
                                                                                        n4 = Integer.rotateLeft(n3 ^ 0x3CD1CAFE, 26) ^ 0xECFED2CF ^ 0xECFED2CF;
                                                                                    }
                                                                                    catch (ArithmeticException arithmeticException) {
                                                                                        n4 = Integer.rotateLeft(n3 ^ 0x3CD1CAFE, 26) ^ 0x72246E6 ^ 0x72246E6;
                                                                                    }
                                                                                    --n2;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_18 = Integer.rotateRight(0xFA836142 ^ n3, 18) + 1514563129;
                                                                                if (class_17922 != class_1802.field_8802) {
                                                                                    int cfr_ignored_19 = (int)(0x97F05233DD6B2784L ^ (long)n3 ^ 0x59177665B42E8231L);
                                                                                    n4 = (int)((long)Integer.rotateLeft(n3 ^ 0xA96C1E47, 26) ^ 0xD23095B3C4619AAAL ^ 0xD23095B3C4619AAAL);
                                                                                    int cfr_ignored_20 = (int)(0xDFB2C11989558ABBL ^ (long)n3 ^ 0x7F43DE18EE5012B4L);
                                                                                    n4 = (int)((long)Integer.rotateLeft(n3 ^ 0xADFBE579, 26) ^ 0x2F59ACCB3253B679L ^ 0x2F59ACCB3253B679L);
                                                                                    ++n2;
                                                                                    continue;
                                                                                }
                                                                                n4 = Integer.rotateLeft(n3 ^ 0x76B969B3, 26) + 161810776 - 161810776;
                                                                                n2 += 5;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_21 = Integer.rotateRight(0xF12C266E ^ n3, 17) - 951469709;
                                                                            n = 3;
                                                                            int cfr_ignored_22 = (int)(0x442A3825CB1BE367L ^ (long)n3 ^ 0x8D3B5A843DE92585L);
                                                                            n4 = Integer.rotateLeft(n3 ^ 0x3CD1CAFE, 26);
                                                                            n2 -= 3;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_23 = Integer.rotateRight(0x514E3066 ^ n3, 13) - -589988971;
                                                                        if (class_17922 == class_1802.field_8845) {
                                                                            try {
                                                                                n2 -= 2;
                                                                                if ((0x9780EA7094CD77A5L ^ (long)n3 | 1L) == 0L) {
                                                                                    throw new IllegalArgumentException();
                                                                                }
                                                                                n4 = Integer.rotateLeft(n3 ^ 0x8C4D4E30, 26) ^ 0x65106092 ^ 0x65106092;
                                                                            }
                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                n4 = Integer.rotateLeft(n3 ^ 0x8C4D4E30, 26);
                                                                            }
                                                                            n2 += 5;
                                                                            continue;
                                                                        }
                                                                        n4 = Integer.rotateLeft(n3 ^ 0xB519A1C9, 26) ^ 0x97C226B5 ^ 0x97C226B5;
                                                                        int cfr_ignored_24 = (Integer.rotateLeft(0xA586E074 ^ n3, 7) - 263376199) * -1517887371;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_25 = (Integer.rotateLeft(0xFDC72DF5 ^ n3, 18) - -1082380314) * -37278219;
                                                                    int cfr_ignored_26 = (int)(0x3F7583C827D4EB4FL ^ (long)n3 ^ 0xFAE0831A2DB9D33AL);
                                                                    if (class_17922 == class_1802.field_8371) {
                                                                        n4 = Integer.rotateLeft(n3 ^ 0x971032F9, 26) + 1760214780 - 1760214780;
                                                                        int cfr_ignored_27 = (Integer.rotateLeft(0xA4D072D5 ^ n3, 7) - -107247866) * -1529842987;
                                                                        int cfr_ignored_28 = (int)(0x6662DCE827D4EB4FL ^ (long)n3 ^ 0x44A0831A2DB96114L);
                                                                        n4 = Integer.rotateLeft(n3 ^ 0x18F4F2B8, 26);
                                                                        n2 -= 2;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        n2 += 2;
                                                                        if ((0xDDD48F07A00F885BL ^ (long)n3 | 1L) == 0L) {
                                                                            throw new UnsupportedOperationException();
                                                                        }
                                                                        n4 = Integer.rotateLeft(n3 ^ 0xC8689BEE, 26) ^ 0xF90448D4 ^ 0xF90448D4;
                                                                    }
                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                        n4 = Integer.rotateLeft(n3 ^ 0xC8689BEE, 26) + -48732548 - -48732548;
                                                                    }
                                                                    --n2;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_29 = (Integer.rotateRight(0x9FC6F692 ^ n3, 6) + 1567980265) * -1614350701;
                                                                n4 = (int)((long)Integer.rotateLeft(n3 ^ 0x3E8AE8E, 26) ^ 0x5E085AF4D6D1CA8DL ^ 0x5E085AF4D6D1CA8DL);
                                                                int cfr_ignored_30 = (Integer.rotateLeft(0x451E5198 ^ n3, 11) + 1661567139) * 1159614873;
                                                                try {
                                                                    n2 -= 2;
                                                                    if ((0x9C27DBB59598A8FFL ^ (long)n3 | 1L) == 0L) {
                                                                        throw new UnsupportedOperationException();
                                                                    }
                                                                    n4 = Integer.rotateLeft(n3 ^ 0xA9523746, 26);
                                                                }
                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                    n4 = Integer.rotateLeft(n3 ^ 0xA9523746, 26);
                                                                }
                                                                n2 -= 4;
                                                                continue;
                                                            }
                                                            int cfr_ignored_31 = Integer.rotateLeft(0xA5CECE4D ^ n3, 7) - 409508494;
                                                            int cfr_ignored_32 = (int)(0x677C607027D4EB4FL ^ (long)n3 ^ 0x3D90831A2DB96329L);
                                                            int cfr_ignored_33 = (int)(0xAB6CBE5D7960A1CEL ^ (long)n3 ^ 0x81CA3E72B8BAFB08L);
                                                            n4 = Integer.rotateLeft(n3 ^ 0xD7B87AEC, 26) + 356295267 - 356295267;
                                                            int cfr_ignored_34 = (int)(0x6B08DC7C3F368A32L ^ (long)n3 ^ 0x4588B2DEEF437BC0L);
                                                            n4 = Integer.rotateLeft(n3 ^ 0xA9523746, 26);
                                                            n2 -= 5;
                                                            continue;
                                                        }
                                                        int cfr_ignored_35 = Integer.rotateRight(0x50051F0F ^ n3, 13) - -1258528244;
                                                        n4 = Integer.rotateLeft(n3 ^ 0xD5C84479, 26) + -1248146478 - -1248146478;
                                                        int cfr_ignored_36 = (Integer.rotateRight(0xC9E03CFF ^ n3, 12) - 1988428316) * -908051201;
                                                        n4 = Integer.rotateLeft(n3 ^ 0xA9523746, 26);
                                                        n2 -= 2;
                                                        continue;
                                                    }
                                                    int cfr_ignored_37 = (Integer.rotateRight(0x52BE78B2 ^ n3, 13) + 158219465) * 1388214451;
                                                    n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0x27C2072B, 26)));
                                                    int cfr_ignored_38 = (Integer.rotateLeft(0x8B4A1BC ^ n3, 4) - 306001151) * 146055613;
                                                    int cfr_ignored_39 = (int)(0xAE9F7D8305B98FFBL ^ (long)n3 ^ 0x676C7C0E4D0F0EFL);
                                                    n4 = Integer.rotateLeft(n3 ^ 0x1DC29CFA, 26) ^ 0xC2ACD68C ^ 0xC2ACD68C;
                                                    int cfr_ignored_40 = (int)(0x845B79D05B25C639L ^ (long)n3 ^ 0xED07AF87754A567L);
                                                    n4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n3 ^ 0xA9523746, 26)));
                                                    n2 -= 4;
                                                    continue;
                                                }
                                                int cfr_ignored_41 = (Integer.rotateLeft(0x335F5FBC ^ n3, 9) - 1021982463) * 861888445;
                                                try {
                                                    n2 += 5;
                                                    if ((0x205862A427AA23BBL ^ (long)n3 | 1L) == 0L) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    n4 = Integer.rotateLeft(n3 ^ 0xA9523746, 26) ^ 0xE20426F7 ^ 0xE20426F7;
                                                }
                                                catch (NoSuchElementException noSuchElementException) {
                                                    n4 = Integer.rotateLeft(n3 ^ 0xA9523746, 26) + 751042370 - 751042370;
                                                }
                                                n2 += 2;
                                                continue;
                                            }
                                            int cfr_ignored_42 = (Integer.rotateRight(0xFF09C937 ^ n3, 18) - -426967836) * -16135881;
                                            int cfr_ignored_43 = (int)(0x57977F62DF71A120L ^ (long)n3 ^ 0x3B57250B96702FFL);
                                            n4 = Integer.rotateLeft(n3 ^ 0x7E747651, 26) ^ 0xFF14CCEE ^ 0xFF14CCEE;
                                            int cfr_ignored_44 = (int)(0xE466ED2136BE9C05L ^ (long)n3 ^ 0x2732A1CEC32C651CL);
                                            n4 = Integer.rotateLeft(n3 ^ 0xA9523746, 26);
                                            continue;
                                        }
                                        int cfr_ignored_45 = (Integer.rotateRight(0xA223C17E ^ n3, 7) - -1498280579) * -1574715009;
                                        n4 = Integer.rotateLeft(n3 ^ 0xA9523746, 26) + -680588645 - -680588645;
                                        continue;
                                    }
                                    int cfr_ignored_46 = Integer.rotateRight(0xEE5D92EA ^ n3, 16) + -508401263;
                                    int cfr_ignored_47 = (int)(0xD72F55D0189177F2L ^ (long)n3 ^ 0x56D0FD9114C2038FL);
                                    n4 = Integer.rotateLeft(n3 ^ 0xA9523746, 26) ^ 0x7A26455B ^ 0x7A26455B;
                                    continue;
                                }
                                int cfr_ignored_48 = (Integer.rotateLeft(0x51A07F94 ^ n3, 13) - -422768089) * 1369472917;
                                try {
                                    n2 -= 2;
                                    n4 = (int)((long)Integer.rotateLeft(n3 ^ 0xA9523746, 26) ^ 0xA0689A64426252B3L ^ 0xA0689A64426252B3L);
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    n4 = Integer.rotateLeft(n3 ^ 0xA9523746, 26) ^ 0x5954305F ^ 0x5954305F;
                                }
                                continue;
                            }
                            int cfr_ignored_49 = Integer.rotateLeft(0x50986F09 ^ n3, 13) + -959245998;
                            int cfr_ignored_50 = (int)(0x922AC13427D4EB4FL ^ (long)n3 ^ 0x7F18831A2DB88984L);
                            int cfr_ignored_51 = (int)(0x4020BE7130E5F834L ^ (long)n3 ^ 0x8192AD780B4F2D90L);
                            n4 = (int)((long)Integer.rotateLeft(n3 ^ 0x1C8A5306, 26) ^ 0x970710E4DE6F4F9AL ^ 0x970710E4DE6F4F9AL);
                            int cfr_ignored_52 = (int)(0x1A1D1A5111ABC3BCL ^ (long)n3 ^ 0xC9D2EFE47C5F99EBL);
                            n4 = Integer.rotateLeft(n3 ^ 0xA9523746, 26) + 234851192 - 234851192;
                            n2 -= 4;
                            continue;
                        }
                        int cfr_ignored_53 = Integer.rotateLeft(0xE5A15824 ^ n3, 15) - -756593769;
                        try {
                            n4 = (int)((long)Integer.rotateLeft(n3 ^ 0xA9523746, 26) ^ 0xE3078FB9CAA6C04L ^ 0xE3078FB9CAA6C04L);
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n4 = Integer.rotateLeft(n3 ^ 0xA9523746, 26);
                        }
                        n2 -= 5;
                        continue;
                    }
                    int cfr_ignored_54 = Integer.rotateLeft(0xB15B54EC ^ n3, 9) - 2121066447;
                    n4 = Integer.rotateLeft(n3 ^ 0xF374FE94, 26);
                    int cfr_ignored_55 = Integer.rotateRight(0x312BF3EF ^ n3, 9) - -122672852;
                    n4 = Integer.rotateLeft(n3 ^ 0x1530A43F, 26) + 1874953793 - 1874953793;
                    int cfr_ignored_56 = (Integer.rotateLeft(0xB744F154 ^ n3, 9) - 901175399) * -1220218539;
                    n4 = Integer.rotateLeft(n3 ^ 0xA9523746, 26) ^ 0xB2272CD3 ^ 0xB2272CD3;
                    continue;
                }
                return n;
            }
            int cfr_ignored_57 = Integer.rotateLeft(0x4BDAA724 ^ n3, 12) - 869784727;
            n4 = Integer.rotateLeft(n3 ^ 0xA9523746, 26) ^ 0xC07370E5 ^ 0xC07370E5;
        }
    }

    private boolean khghk(class_2338 class_23382) {
        int n = -33991259;
        n = Integer.rotateLeft(n * 981867685, 18) ^ 0x8160E19B;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
        int n2 = n ^ 0x27F8E6AC;
        if ((n2 ^ n) != 670623404) {
            int cfr_ignored_0 = (0xDA01B309 ^ n) + 738603901;
        }
        if (thd_6.mc.field_1687 == null || thd_6.mc.field_1724 == null) {
            return false;
        }
        class_3965 class_39652 = thd_6.mc.field_1687.method_17742(new class_3959(thd_6.mc.field_1724.method_33571(), class_23382.method_46558(), class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)thd_6.mc.field_1724));
        return class_39652 == null || class_39652.method_17783() == class_239.class_240.field_1333 || class_39652.method_17777().equals((Object)class_23382);
    }

    private boolean szm_4(class_1297 class_12972) {
        int n = 1085822597;
        n = Integer.rotateLeft(n * 612062517, 6) ^ 0xE6EF2766;
        n = System.identityHashCode(this) ^ n;
        class_1297 class_12973 = class_12972;
        n = Integer.rotateLeft((class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n, 29);
        int n2 = n ^ 0xF01F7BCE;
        if ((n2 ^ n) != -266372146) {
            int cfr_ignored_0 = (0xB0A72D4B ^ n) - 690069286;
        }
        if (thd_6.mc.field_1687 == null || thd_6.mc.field_1724 == null) {
            return false;
        }
        class_243 class_2432 = thd_6.shthsh(thd_6.khqb(class_12972));
        class_3965 class_39652 = thd_6.tfb_2(thd_6.mc.field_1687, new class_3959(thd_6.hm_2(thd_6.mc.field_1724), class_2432, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)thd_6.mc.field_1724));
        return class_39652 == null || class_39652.method_17783() == class_239.class_240.field_1333;
    }

    private class_2350 anw(class_2338 class_23382) {
        class_243 class_2432 = class_23382.method_46558().method_1020(thd_6.mc.field_1724.method_33571());
        return class_2350.method_10142((double)class_2432.field_1352, (double)class_2432.field_1351, (double)class_2432.field_1350).method_10153();
    }

    private int bghsh() {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = -574343322;
        n4 = Integer.rotateLeft(n4 * -1398394551, 16) ^ 0x6FDE3FC2;
        n4 = Integer.rotateRight(System.identityHashCode(this) ^ n4, 7);
        int n5 = (int)((long)(30592043 * -361613761 + -2058911982 ^ n4) ^ 0x92CB541947620B95L ^ 0x92CB541947620B95L);
        while (true) {
            block36: {
                block45: {
                    block34: {
                        block43: {
                            block48: {
                                block50: {
                                    block58: {
                                        block35: {
                                            block39: {
                                                block57: {
                                                    block41: {
                                                        block38: {
                                                            block52: {
                                                                block54: {
                                                                    block55: {
                                                                        block42: {
                                                                            block51: {
                                                                                block56: {
                                                                                    block37: {
                                                                                        block49: {
                                                                                            block44: {
                                                                                                block53: {
                                                                                                    block46: {
                                                                                                        block47: {
                                                                                                            block31: {
                                                                                                                block40: {
                                                                                                                    block32: {
                                                                                                                        block33: {
                                                                                                                            if ((n3 = ((n5 ^ n4) - -2058911982) * -1964328513) > 90739634) break block31;
                                                                                                                            if (n3 > -723178798) break block32;
                                                                                                                            if (n3 > -1788634511) break block33;
                                                                                                                            if (n3 == -1905003846) break block34;
                                                                                                                            if (n3 == -1788634511) break block35;
                                                                                                                            break block36;
                                                                                                                        }
                                                                                                                        if (n3 == -1364359177) break block37;
                                                                                                                        if (n3 == -742682115) break block38;
                                                                                                                        if (n3 == -723178798) break block39;
                                                                                                                        break block36;
                                                                                                                    }
                                                                                                                    if (n3 > -604860247) break block40;
                                                                                                                    if (n3 == -707881489) break block41;
                                                                                                                    if (n3 == -604860247) break block42;
                                                                                                                    int cfr_ignored_0 = (Integer.rotateRight(0x613F4B1A ^ n4, 15) + -888686751) * 1631537947;
                                                                                                                    break block36;
                                                                                                                }
                                                                                                                if (n3 == -557588724) break block43;
                                                                                                                if (n3 == 30592043) break block44;
                                                                                                                int cfr_ignored_1 = (Integer.rotateLeft(0xE381F5D4 ^ n4, 15) - -1860541465) * -478022187;
                                                                                                                if (n3 == 90739634) break block45;
                                                                                                                break block36;
                                                                                                            }
                                                                                                            if (n3 > 1005455820) break block46;
                                                                                                            if (n3 > 515818804) break block47;
                                                                                                            if (n3 == 120057652) break block48;
                                                                                                            if (n3 == 515818804) break block49;
                                                                                                            int cfr_ignored_2 = (Integer.rotateRight(0x324245D7 ^ n4, 9) - 442766404) * 843204055;
                                                                                                            break block36;
                                                                                                        }
                                                                                                        if (n3 == 607186983) break block50;
                                                                                                        if (n3 == 973616288) break block51;
                                                                                                        int cfr_ignored_3 = (Integer.rotateLeft(0xA2F01FB1 ^ n4, 7) + -1083083350) * -1561321551;
                                                                                                        int cfr_ignored_4 = (int)(0x6042B18C27D4EB4FL ^ (long)n4 ^ 0x9E68831A2DB96D54L);
                                                                                                        if (n3 == 1005455820) break block52;
                                                                                                        break block36;
                                                                                                    }
                                                                                                    if (n3 > 1737788585) break block53;
                                                                                                    if (n3 == 1707722130) break block54;
                                                                                                    if (n3 == 1737788585) break block55;
                                                                                                    break block36;
                                                                                                }
                                                                                                if (n3 == 1942767251) break block56;
                                                                                                if (n3 == 2021115985) break block57;
                                                                                                int cfr_ignored_5 = (Integer.rotateRight(0xF1FB1112 ^ n4, 17) + 1371844713) * -235204333;
                                                                                                if (n3 == 2118853161) break block58;
                                                                                                break block36;
                                                                                            }
                                                                                            int cfr_ignored_6 = (Integer.rotateRight(0x9A22435A ^ n4, 6) + -1367095519) * -1709030565;
                                                                                            n = 0;
                                                                                            try {
                                                                                                n5 = Integer.reverse(Integer.reverse(1942767251 * -361613761 + -2058911982 ^ n4));
                                                                                            }
                                                                                            catch (IllegalStateException illegalStateException) {
                                                                                                n5 = 1942767251 * -361613761 + -2058911982 ^ n4 ^ 0x4CA1BD63 ^ 0x4CA1BD63;
                                                                                            }
                                                                                            --n3;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_7 = Integer.rotateRight(0xAB527527 ^ n4, 8) - -1017524492;
                                                                                        ++n;
                                                                                        n5 = (-1733182896 * -361613761 + -2058911982 ^ n4) + 538197812 - 538197812;
                                                                                        int cfr_ignored_8 = Integer.rotateLeft(0x193603C9 ^ n4, 6) + 300422290;
                                                                                        int cfr_ignored_9 = (int)(0xDB84ADF427D4EB4FL ^ (long)n4 ^ 0xA698831A2DB81AD8L);
                                                                                        n5 = 1942767251 * -361613761 + -2058911982 ^ n4 ^ 0x72CEC570 ^ 0x72CEC570;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_10 = Integer.rotateLeft(0xC0DAEFA4 ^ n4, 11) - 1591780375;
                                                                                    if (!thd_6.thjh(thd_6.mc.field_1724.method_31548(), n).method_31574(class_1802.field_8705)) {
                                                                                        n5 = 515818804 * -361613761 + -2058911982 ^ n4;
                                                                                        int cfr_ignored_11 = (Integer.rotateLeft(0x426DF679 ^ n4, 11) + 263092194) * 1114502777;
                                                                                        int cfr_ignored_12 = (int)(0x80DF584427D4EB4FL ^ (long)n4 ^ 0x4DF8831A2DB8AC6FL);
                                                                                        n3 -= 5;
                                                                                        continue;
                                                                                    }
                                                                                    try {
                                                                                        n3 -= 4;
                                                                                        if ((0xE4A5B01B21C1B407L ^ (long)n4 | 1L) == 0L) {
                                                                                            throw new ArithmeticException();
                                                                                        }
                                                                                        n5 = Integer.reverse(Integer.reverse(-604860247 * -361613761 + -2058911982 ^ n4));
                                                                                    }
                                                                                    catch (ArithmeticException arithmeticException) {
                                                                                        n5 = Integer.reverse(Integer.reverse(-604860247 * -361613761 + -2058911982 ^ n4));
                                                                                    }
                                                                                    n3 -= 3;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_13 = Integer.rotateLeft(0x8A617568 ^ n4, 4) + -970271021;
                                                                                if (n >= (0xA131E15E ^ 0xA131E157)) {
                                                                                    n5 = 1737788585 * -361613761 + -2058911982 ^ n4 ^ 0x734EC378 ^ 0x734EC378;
                                                                                    n3 += 2;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_14 = (int)(0x2BE182796C56CE2AL ^ (long)n4 ^ 0xF982141E6773FA12L);
                                                                                n5 = (int)((long)(-1364359177 * -361613761 + -2058911982 ^ n4) ^ 0x74BAB30F85A516BBL ^ 0x74BAB30F85A516BBL);
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_15 = (Integer.rotateRight(0x96A004F2 ^ n4, 5) + 1102985353) * -1767897869;
                                                                            if (n < (0xA131E15E ^ 0xA131E157)) {
                                                                                int cfr_ignored_16 = (int)(0x38E4DD4E8DACEB50L ^ (long)n4 ^ 0x47EDD7EA2D87DC18L);
                                                                                n5 = (int)((long)(-1364359177 * -361613761 + -2058911982 ^ n4) ^ 0xD143228884999351L ^ 0xD143228884999351L);
                                                                                n3 -= 3;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_17 = (int)(0x49EDB2D4C110E012L ^ (long)n4 ^ 0x98D94E923B033E0AL);
                                                                            n5 = -649275482 * -361613761 + -2058911982 ^ n4 ^ 0xE03F307F ^ 0xE03F307F;
                                                                            int cfr_ignored_18 = (int)(0x13B6C0B75ED492A5L ^ (long)n4 ^ 0x7C1E711ADE6D8ABCL);
                                                                            n5 = Integer.reverse(Integer.reverse(1737788585 * -361613761 + -2058911982 ^ n4));
                                                                            n3 += 3;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_19 = (Integer.rotateRight(0x61F112BB ^ n4, 15) + -527506464) * 1643188923;
                                                                        n2 = n;
                                                                        n5 = 90739634 * -361613761 + -2058911982 ^ n4;
                                                                        n3 += 2;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_20 = Integer.rotateLeft(0x2AAA9409 ^ n4, 8) + 788892754;
                                                                    int cfr_ignored_21 = (int)(0xE8183A3427D4EB4FL ^ (long)n4 ^ 0x8918831A2DB87DE1L);
                                                                    n2 = -1;
                                                                    int cfr_ignored_22 = (int)(0x86D57B7BDB06E4E9L ^ (long)n4 ^ 0xB877ABE32F4A07BL);
                                                                    n5 = 2118734250 * -361613761 + -2058911982 ^ n4 ^ 0xD39A7463 ^ 0xD39A7463;
                                                                    int cfr_ignored_23 = (int)(0xE36DDFD58AD4602BL ^ (long)n4 ^ 0x42DBD91B3B706B0AL);
                                                                    n5 = 90739634 * -361613761 + -2058911982 ^ n4 ^ 0x9DE8DD ^ 0x9DE8DD;
                                                                    ++n3;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_24 = Integer.rotateLeft(0xC46BE101 ^ n4, 11) + -848437670;
                                                                int cfr_ignored_25 = (int)(0x6D94F3C27D4EB4FL ^ (long)n4 ^ 0x6308831A2DB9A063L);
                                                                try {
                                                                    n3 -= 2;
                                                                    n5 = Integer.reverse(Integer.reverse(30592043 * -361613761 + -2058911982 ^ n4));
                                                                }
                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                    n5 = 30592043 * -361613761 + -2058911982 ^ n4 ^ 0xB9CB39B4 ^ 0xB9CB39B4;
                                                                }
                                                                n3 -= 5;
                                                                continue;
                                                            }
                                                            int cfr_ignored_26 = (Integer.rotateRight(0x2FCD84DB ^ n4, 8) + -834619968) * 801998043;
                                                            n5 = (int)((long)(685884183 * -361613761 + -2058911982 ^ n4) ^ 0x118C7733A8D3FBE9L ^ 0x118C7733A8D3FBE9L);
                                                            int cfr_ignored_27 = Integer.rotateLeft(0xACE22DE0 ^ n4, 8) + -205443749;
                                                            try {
                                                                if ((0xCDAFE2DDDAD75571L ^ (long)n4 | 1L) == 0L) {
                                                                    throw new IllegalArgumentException();
                                                                }
                                                                n5 = 30592043 * -361613761 + -2058911982 ^ n4 ^ 0xF2225432 ^ 0xF2225432;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                n5 = (int)((long)(30592043 * -361613761 + -2058911982 ^ n4) ^ 0x8C2990263069BB51L ^ 0x8C2990263069BB51L);
                                                            }
                                                            n3 -= 3;
                                                            continue;
                                                        }
                                                        int cfr_ignored_28 = Integer.rotateLeft(0x8FB175CC ^ n4, 4) - 1792729839;
                                                        n5 = -1479190273 * -361613761 + -2058911982 ^ n4 ^ 0x892F013B ^ 0x892F013B;
                                                        int cfr_ignored_29 = Integer.rotateRight(0xFCE0F4EF ^ n4, 18) - -1550104532;
                                                        try {
                                                            n3 -= 3;
                                                            if ((0x72D4D1905E9E7809L ^ (long)n4 | 1L) == 0L) {
                                                                throw new ArithmeticException();
                                                            }
                                                            n5 = (30592043 * -361613761 + -2058911982 ^ n4) + -784594921 - -784594921;
                                                        }
                                                        catch (ArithmeticException arithmeticException) {
                                                            n5 = 30592043 * -361613761 + -2058911982 ^ n4;
                                                        }
                                                        --n3;
                                                        continue;
                                                    }
                                                    int cfr_ignored_30 = (Integer.rotateLeft(0x5E34BD7C ^ n4, 14) - 1824559423) * 1580514685;
                                                    n5 = (int)((long)(758688915 * -361613761 + -2058911982 ^ n4) ^ 0xD04DF1C177255372L ^ 0xD04DF1C177255372L);
                                                    int cfr_ignored_31 = (Integer.rotateRight(0x895FEB76 ^ n4, 4) - -1493491067) * -1990202505;
                                                    int cfr_ignored_32 = (int)(0x9A3CAB5BC6623D8AL ^ (long)n4 ^ 0xABC74077803299A8L);
                                                    n5 = (30592043 * -361613761 + -2058911982 ^ n4) + -324891723 - -324891723;
                                                    ++n3;
                                                    continue;
                                                }
                                                int cfr_ignored_33 = (Integer.rotateLeft(0x1B10FD71 ^ n4, 6) + 1265389546) * 454098289;
                                                int cfr_ignored_34 = (int)(0xD9A2534C27D4EB4FL ^ (long)n4 ^ 0x5BE8831A2DB81E95L);
                                                n5 = (int)((long)(246354077 * -361613761 + -2058911982 ^ n4) ^ 0x623EF703C4B2352CL ^ 0x623EF703C4B2352CL);
                                                int cfr_ignored_35 = Integer.rotateRight(0x866D17AE ^ n4, 3) - 1267957069;
                                                try {
                                                    n3 -= 2;
                                                    if ((0x132A609A38F0593L ^ (long)n4 | 1L) == 0L) {
                                                        throw new UnsupportedOperationException();
                                                    }
                                                    n5 = 30592043 * -361613761 + -2058911982 ^ n4 ^ 0x96BCB2E3 ^ 0x96BCB2E3;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    n5 = 30592043 * -361613761 + -2058911982 ^ n4 ^ 0x282B27D ^ 0x282B27D;
                                                }
                                                n3 -= 5;
                                                continue;
                                            }
                                            int cfr_ignored_36 = Integer.rotateRight(0xF9499BAE ^ n4, 18) - 877099341;
                                            n5 = Integer.reverse(Integer.reverse(-1900288856 * -361613761 + -2058911982 ^ n4));
                                            int cfr_ignored_37 = Integer.rotateLeft(0x33C02D85 ^ n4, 9) - 1218650710;
                                            int cfr_ignored_38 = (int)(0xF17283B827D4EB4FL ^ (long)n4 ^ 0xFA00831A2DB84F34L);
                                            try {
                                                n3 += 4;
                                                if ((0xCC5CC18735407659L ^ (long)n4 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                n5 = 30592043 * -361613761 + -2058911982 ^ n4;
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                n5 = 30592043 * -361613761 + -2058911982 ^ n4 ^ 0xBA36B02B ^ 0xBA36B02B;
                                            }
                                            n3 += 3;
                                            continue;
                                        }
                                        int cfr_ignored_39 = Integer.rotateLeft(0x35024521 ^ n4, 9) + 1873018426;
                                        int cfr_ignored_40 = (int)(0xF7B0EB1C27D4EB4FL ^ (long)n4 ^ 0x2B48831A2DB842B0L);
                                        n5 = (int)((long)(1681622321 * -361613761 + -2058911982 ^ n4) ^ 0xC571EAF23333BCBCL ^ 0xC571EAF23333BCBCL);
                                        int cfr_ignored_41 = (Integer.rotateRight(0x10C6C917 ^ n4, 5) - 208664836) * 281463063;
                                        n5 = 30592043 * -361613761 + -2058911982 ^ n4;
                                        continue;
                                    }
                                    int cfr_ignored_42 = (Integer.rotateRight(0xEE5CE07B ^ n4, 16) + -509817312) * -295903109;
                                    n5 = -903048387 * -361613761 + -2058911982 ^ n4;
                                    int cfr_ignored_43 = (Integer.rotateRight(0x6C37B1F7 ^ n4, 16) - 521940004) * 1815589367;
                                    n5 = 30592043 * -361613761 + -2058911982 ^ n4 ^ 0x49FA20E3 ^ 0x49FA20E3;
                                    n3 += 5;
                                    continue;
                                }
                                int cfr_ignored_44 = (Integer.rotateLeft(0x62A72111 ^ n4, 15) + -157638582) * 1655120145;
                                int cfr_ignored_45 = (int)(0xA0158F2C27D4EB4FL ^ (long)n4 ^ 0xE328831A2DB8EDFAL);
                                n5 = Integer.reverse(Integer.reverse(-1952327116 * -361613761 + -2058911982 ^ n4));
                                int cfr_ignored_46 = Integer.rotateRight(0x763FF423 ^ n4, 17) + 1444687736;
                                try {
                                    if ((0xF452BA54411BF54FL ^ (long)n4 | 1L) == 0L) {
                                        throw new ArithmeticException();
                                    }
                                    n5 = Integer.reverse(Integer.reverse(30592043 * -361613761 + -2058911982 ^ n4));
                                }
                                catch (ArithmeticException arithmeticException) {
                                    n5 = (30592043 * -361613761 + -2058911982 ^ n4) + 721667129 - 721667129;
                                }
                                n3 -= 2;
                                continue;
                            }
                            int cfr_ignored_47 = (Integer.rotateRight(0x477C1D76 ^ n4, 11) - -1402654587) * 1199316343;
                            n5 = (-1623194001 * -361613761 + -2058911982 ^ n4) + -530089003 - -530089003;
                            int cfr_ignored_48 = Integer.rotateLeft(0x7F35834C ^ n4, 18) - 1809352047;
                            n5 = (int)((long)(30592043 * -361613761 + -2058911982 ^ n4) ^ 0x159AC390D2C431E1L ^ 0x159AC390D2C431E1L);
                            n3 -= 3;
                            continue;
                        }
                        int cfr_ignored_49 = (Integer.rotateLeft(0x78FD0230 ^ n4, 18) + -1426005237) * 2029847089;
                        try {
                            if ((0x71E6C74422E4F98FL ^ (long)n4 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n5 = (30592043 * -361613761 + -2058911982 ^ n4) + 772417196 - 772417196;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n5 = 30592043 * -361613761 + -2058911982 ^ n4 ^ 0x8CE1225B ^ 0x8CE1225B;
                        }
                        n3 += 4;
                        continue;
                    }
                    int cfr_ignored_50 = (Integer.rotateLeft(0x43332734 ^ n4, 11) - 663707271) * 1127425845;
                    try {
                        n3 -= 2;
                        n5 = 30592043 * -361613761 + -2058911982 ^ n4 ^ 0x8A43F8D5 ^ 0x8A43F8D5;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n5 = 30592043 * -361613761 + -2058911982 ^ n4 ^ 0x2F5A1F9C ^ 0x2F5A1F9C;
                    }
                    n3 += 2;
                    continue;
                }
                return n2;
            }
            int cfr_ignored_51 = (Integer.rotateLeft(0x9FA29F5C ^ n4, 6) - 1494149983) * -1616732323;
            n5 = 30592043 * -361613761 + -2058911982 ^ n4 ^ 0xB0952B64 ^ 0xB0952B64;
        }
    }

    private int rzz_2() {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 1670941117;
        n4 = Integer.rotateLeft(n4 * 1215236623, 5) ^ 0xAED8E1AA;
        n4 = System.identityHashCode(this) ^ n4;
        int n5 = (int)((long)(n4 ^ 0xB7620874) ^ 0x3C4F3A4954F8B2B3L ^ 0x3C4F3A4954F8B2B3L);
        while (true) {
            block34: {
                block37: {
                    block43: {
                        block36: {
                            block56: {
                                block51: {
                                    block48: {
                                        block41: {
                                            block47: {
                                                block52: {
                                                    block55: {
                                                        block54: {
                                                            block33: {
                                                                block59: {
                                                                    block44: {
                                                                        block32: {
                                                                            block57: {
                                                                                block50: {
                                                                                    block39: {
                                                                                        block40: {
                                                                                            block35: {
                                                                                                block42: {
                                                                                                    block58: {
                                                                                                        block49: {
                                                                                                            block53: {
                                                                                                                block45: {
                                                                                                                    block46: {
                                                                                                                        block29: {
                                                                                                                            block38: {
                                                                                                                                block30: {
                                                                                                                                    block31: {
                                                                                                                                        if ((n3 = n5 ^ n4) > -605952956) break block29;
                                                                                                                                        if (n3 > -1453917596) break block30;
                                                                                                                                        if (n3 > -1668342323) break block31;
                                                                                                                                        if (n3 == -1871800068) break block32;
                                                                                                                                        if (n3 == -1668342323) break block33;
                                                                                                                                        int cfr_ignored_0 = (Integer.rotateRight(0xAEEE99D2 ^ n4, 8) + 859979689) * -1360094765;
                                                                                                                                        break block34;
                                                                                                                                    }
                                                                                                                                    if (n3 == -1587520781) break block35;
                                                                                                                                    if (n3 == -1479793247) break block36;
                                                                                                                                    int cfr_ignored_1 = (Integer.rotateLeft(0x6E439A5D ^ n4, 16) - 1586319486) * 1849924189;
                                                                                                                                    int cfr_ignored_2 = (int)(0xACF1346027D4EB4FL ^ (long)n4 ^ 0x95B0831A2DB8F433L);
                                                                                                                                    if (n3 == -1453917596) break block37;
                                                                                                                                    break block34;
                                                                                                                                }
                                                                                                                                if (n3 > -1124152969) break block38;
                                                                                                                                if (n3 == -1276053700) break block39;
                                                                                                                                if (n3 == -1218312076) break block40;
                                                                                                                                int cfr_ignored_3 = Integer.rotateLeft(0x96ED0C29 ^ n4, 5) + 1259477042;
                                                                                                                                int cfr_ignored_4 = (int)(0x545FA21427D4EB4FL ^ (long)n4 ^ 0xB958831A2DB9056EL);
                                                                                                                                if (n3 == -1124152969) break block41;
                                                                                                                                break block34;
                                                                                                                            }
                                                                                                                            if (n3 == -1062334491) break block42;
                                                                                                                            if (n3 == -606146263) break block43;
                                                                                                                            if (n3 == -605952956) break block44;
                                                                                                                            break block34;
                                                                                                                        }
                                                                                                                        if (n3 > 296107692) break block45;
                                                                                                                        if (n3 > -244182301) break block46;
                                                                                                                        if (n3 == -553027751) break block47;
                                                                                                                        if (n3 == -549401082) break block48;
                                                                                                                        if (n3 == -244182301) break block49;
                                                                                                                        break block34;
                                                                                                                    }
                                                                                                                    if (n3 == -143458001) break block50;
                                                                                                                    if (n3 == 67193398) break block51;
                                                                                                                    if (n3 == 296107692) break block52;
                                                                                                                    break block34;
                                                                                                                }
                                                                                                                if (n3 > 961644585) break block53;
                                                                                                                if (n3 == 692453673) break block54;
                                                                                                                if (n3 == 929874182) break block55;
                                                                                                                if (n3 == 961644585) break block56;
                                                                                                                break block34;
                                                                                                            }
                                                                                                            if (n3 == 1963635370) break block57;
                                                                                                            if (n3 == 1994802696) break block58;
                                                                                                            int cfr_ignored_5 = (Integer.rotateLeft(0xD6BD6B18 ^ n4, 13) + 88971043) * -692229351;
                                                                                                            if (n3 == 2018395399) break block59;
                                                                                                            break block34;
                                                                                                        }
                                                                                                        int cfr_ignored_6 = Integer.rotateRight(0xCAF57E4E ^ n4, 12) - -1743263059;
                                                                                                        ++n;
                                                                                                        n5 = n4 ^ 0xAE7BB934;
                                                                                                        int cfr_ignored_7 = (Integer.rotateLeft(0xD0452A19 ^ n4, 13) + 1019066434) * -800773607;
                                                                                                        int cfr_ignored_8 = (int)(0x12F7842427D4EB4FL ^ (long)n4 ^ 0xF538831A2DB9883EL);
                                                                                                        n5 = n4 ^ 0x76E64608 ^ 0xF696855 ^ 0xF696855;
                                                                                                        continue;
                                                                                                    }
                                                                                                    int cfr_ignored_9 = Integer.rotateRight(0xEC1BCC6F ^ n4, 16) - -1682218836;
                                                                                                    if (n < (0xC64160BE ^ 0xC641609A)) {
                                                                                                        int cfr_ignored_10 = (int)(0xC5EC0E79EB966596L ^ (long)n4 ^ 0xE1831B9F300A2609L);
                                                                                                        n5 = (n4 ^ 0x5BD1773D) + 1275966378 - 1275966378;
                                                                                                        int cfr_ignored_11 = (int)(0x3252E60159FA4FEBL ^ (long)n4 ^ 0x31727F4764F1C974L);
                                                                                                        n5 = Integer.reverse(Integer.reverse(n4 ^ 0xC0AE0FE5));
                                                                                                        continue;
                                                                                                    }
                                                                                                    int cfr_ignored_12 = (int)(0x96438F28C531C5D7L ^ (long)n4 ^ 0xE32146D070888156L);
                                                                                                    n5 = n4 ^ 0x1D05700D;
                                                                                                    int cfr_ignored_13 = (int)(0x4AA2CA3910BB07EBL ^ (long)n4 ^ 0x6902EDC5F4F13894L);
                                                                                                    n5 = Integer.reverse(Integer.reverse(n4 ^ 0xF773012F));
                                                                                                    n3 -= 4;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_14 = Integer.rotateRight(0x86B62BAE ^ n4, 3) - 1416423757;
                                                                                                if (!thd_6.mc.field_1724.method_31548().method_5438(n).method_31574(class_1802.field_8705)) {
                                                                                                    n5 = n4 ^ 0x17D08CEF ^ 0x655328AE ^ 0x655328AE;
                                                                                                    int cfr_ignored_15 = Integer.rotateRight(0x1C10E8CE ^ n4, 6) - 1785319469;
                                                                                                    n5 = n4 ^ 0xF17212E3;
                                                                                                    n3 += 5;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_16 = (int)(0x6D619AD41F598012L ^ (long)n4 ^ 0xC8D8F200FB037712L);
                                                                                                n5 = Integer.reverse(Integer.reverse(n4 ^ 0xB0886C0D));
                                                                                                int cfr_ignored_17 = (int)(0x9D82A66323486CB1L ^ (long)n4 ^ 0xB1B68A23224496D4L);
                                                                                                n5 = n4 ^ 0xA1605AF3;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_18 = (Integer.rotateRight(0x776CB237 ^ n4, 17) - 2055680996) * 2003612215;
                                                                                            n2 = n;
                                                                                            try {
                                                                                                n3 -= 3;
                                                                                                if ((0x104FEE7ECB85929BL ^ (long)n4 | 1L) == 0L) {
                                                                                                    throw new ArithmeticException();
                                                                                                }
                                                                                                n5 = n4 ^ 0xA956FA64;
                                                                                            }
                                                                                            catch (ArithmeticException arithmeticException) {
                                                                                                n5 = (int)((long)(n4 ^ 0xA956FA64) ^ 0xEEBCE7C246F08536L ^ 0xEEBCE7C246F08536L);
                                                                                            }
                                                                                            n3 -= 3;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_19 = (Integer.rotateRight(0xEE96D23E ^ n4, 16) - -392096579) * -292105665;
                                                                                        if (!yf.khdha_2()) {
                                                                                            int cfr_ignored_20 = (int)(0x50297A40156C1EC0L ^ (long)n4 ^ 0x9F0E66BC6A70D83L);
                                                                                            n5 = n4 ^ 0x8BC9C37A;
                                                                                            int cfr_ignored_21 = (int)(0x7E142454850D98E2L ^ (long)n4 ^ 0xB5D9C6A8CAE351F9L);
                                                                                            n5 = n4 ^ 0x906E98FC ^ 0x7C92433E ^ 0x7C92433E;
                                                                                            n3 -= 5;
                                                                                            continue;
                                                                                        }
                                                                                        try {
                                                                                            if ((0x701FAE8D5140B963L ^ (long)n4 | 1L) == 0L) {
                                                                                                throw new UnsupportedOperationException();
                                                                                            }
                                                                                            n5 = (int)((long)(n4 ^ 0xB3F0F73C) ^ 0x2DACE4DD61082F92L ^ 0x2DACE4DD61082F92L);
                                                                                        }
                                                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                            n5 = n4 ^ 0xB3F0F73C;
                                                                                        }
                                                                                        n3 += 4;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_22 = (Integer.rotateRight(0xB75E77D2 ^ n4, 9) + 953033129) * -1218545709;
                                                                                    n = Integer.rotateLeft(0x662A934E ^ 0x662E134E, 17);
                                                                                    int cfr_ignored_23 = (int)(0xCF48B64AA7FE648CL ^ (long)n4 ^ 0x91E5834F323E3340L);
                                                                                    n5 = n4 ^ 0x76E64608;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_24 = Integer.rotateLeft(0xD26AF405 ^ n4, 13) - 2136026070;
                                                                                int cfr_ignored_25 = (int)(0x10D85A3827D4EB4FL ^ (long)n4 ^ 0x4900831A2DB98C61L);
                                                                                n2 = -1;
                                                                                n5 = Integer.reverse(Integer.reverse(n4 ^ 0xA956FA64));
                                                                                n3 += 4;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_26 = (Integer.rotateLeft(0x7DA98A31 ^ n4, 18) + 1004886826) * 2108262961;
                                                                            int cfr_ignored_27 = (int)(0xBF1B240C27D4EB4FL ^ (long)n4 ^ 0xB568831A2DB8D3E7L);
                                                                            n2 = -1;
                                                                            try {
                                                                                n3 -= 4;
                                                                                if ((0x11B2592CE9662471L ^ (long)n4 | 1L) == 0L) {
                                                                                    throw new IllegalArgumentException();
                                                                                }
                                                                                n5 = Integer.reverse(Integer.reverse(n4 ^ 0xA956FA64));
                                                                            }
                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                n5 = n4 ^ 0xA956FA64;
                                                                            }
                                                                            --n3;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_28 = (Integer.rotateRight(0xF19E409B ^ n4, 17) + 1183281664) * -241287013;
                                                                        yf.athz_2();
                                                                        int cfr_ignored_29 = (int)(0xE4070D94B19D1EAL ^ (long)n4 ^ 0x1CC25A8058F3B151L);
                                                                        n5 = (int)((long)(n4 ^ 0xB3F0F73C) ^ 0x9521984603665C61L ^ 0x9521984603665C61L);
                                                                        n3 -= 2;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_30 = Integer.rotateLeft(0xCF7E1984 ^ n4, 12) - 614643255;
                                                                    n5 = n4 ^ 0xB7620874;
                                                                    int cfr_ignored_31 = Integer.rotateRight(0x1B41DC67 ^ n4, 6) - 1364676532;
                                                                    n3 += 5;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_32 = Integer.rotateLeft(0xF4D797E9 ^ n4, 17) + -1434909582;
                                                                int cfr_ignored_33 = (int)(0x366539D427D4EB4FL ^ (long)n4 ^ 0x8ED8831A2DB9C11BL);
                                                                n5 = Integer.reverse(Integer.reverse(n4 ^ 0x5A3A9587));
                                                                int cfr_ignored_34 = Integer.rotateRight(0xAD576E2B ^ n4, 8) + 32765552;
                                                                try {
                                                                    ++n3;
                                                                    if ((0xAFA2947F0A20EA4BL ^ (long)n4 | 1L) == 0L) {
                                                                        throw new NoSuchElementException();
                                                                    }
                                                                    n5 = (int)((long)(n4 ^ 0xB7620874) ^ 0x39DD28F3BE15AB57L ^ 0x39DD28F3BE15AB57L);
                                                                }
                                                                catch (NoSuchElementException noSuchElementException) {
                                                                    n5 = n4 ^ 0xB7620874;
                                                                }
                                                                continue;
                                                            }
                                                            int cfr_ignored_35 = Integer.rotateRight(0xCFF5086A ^ n4, 12) + 856269841;
                                                            n5 = Integer.reverse(Integer.reverse(n4 ^ 0x19CD4641));
                                                            int cfr_ignored_36 = (Integer.rotateLeft(0xCA53503C ^ n4, 12) - -2072750465) * -900509635;
                                                            n5 = (n4 ^ 0xB7620874) + 1649117750 - 1649117750;
                                                            continue;
                                                        }
                                                        int cfr_ignored_37 = Integer.rotateLeft(0xC783AB28 ^ n4, 11) + 760174867;
                                                        n5 = Integer.reverse(Integer.reverse(n4 ^ 0x5C5E5F62));
                                                        int cfr_ignored_38 = Integer.rotateRight(0xF9721AEE ^ n4, 18) - 959373837;
                                                        try {
                                                            --n3;
                                                            if ((0xE5386BFB793DC787L ^ (long)n4 | 1L) == 0L) {
                                                                throw new NoSuchElementException();
                                                            }
                                                            n5 = n4 ^ 0xB7620874;
                                                        }
                                                        catch (NoSuchElementException noSuchElementException) {
                                                            n5 = n4 ^ 0xB7620874;
                                                        }
                                                        n3 -= 4;
                                                        continue;
                                                    }
                                                    int cfr_ignored_39 = Integer.rotateLeft(0x6325B7E0 ^ n4, 15) + 99541851;
                                                    try {
                                                        ++n3;
                                                        if ((0xB42844505B630551L ^ (long)n4 | 1L) == 0L) {
                                                            throw new UnsupportedOperationException();
                                                        }
                                                        n5 = n4 ^ 0xB7620874;
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        n5 = (n4 ^ 0xB7620874) + -1100890986 - -1100890986;
                                                    }
                                                    n3 -= 2;
                                                    continue;
                                                }
                                                int cfr_ignored_40 = (Integer.rotateLeft(0x1C100F91 ^ n4, 6) + 1783595466) * 470814609;
                                                int cfr_ignored_41 = (int)(0xDEA2A1AC27D4EB4FL ^ (long)n4 ^ 0xBE28831A2DB81094L);
                                                n5 = n4 ^ 0x5878640C ^ 0x335B86E6 ^ 0x335B86E6;
                                                int cfr_ignored_42 = Integer.rotateLeft(0xF7F228A0 ^ n4, 17) + 179341979;
                                                n5 = (int)((long)(n4 ^ 0xEC80338B) ^ 0xB57B83A686E8F5C9L ^ 0xB57B83A686E8F5C9L);
                                                int cfr_ignored_43 = (Integer.rotateRight(0xA1A80B53 ^ n4, 7) + -1749615032) * -1582822573;
                                                n5 = n4 ^ 0xB7620874 ^ 0xB74F0F5E ^ 0xB74F0F5E;
                                                n3 -= 3;
                                                continue;
                                            }
                                            int cfr_ignored_44 = (Integer.rotateRight(0xB6A36B16 ^ n4, 9) - 573019877) * -1230804201;
                                            n5 = Integer.reverse(Integer.reverse(n4 ^ 0x6327D279));
                                            int cfr_ignored_45 = Integer.rotateLeft(0xE4AED4ED ^ n4, 15) - -1249286162;
                                            int cfr_ignored_46 = (int)(0x261C7AD027D4EB4FL ^ (long)n4 ^ 0x8D0831A2DB9E1E9L);
                                            n5 = n4 ^ 0xB7620874;
                                            ++n3;
                                            continue;
                                        }
                                        int cfr_ignored_47 = (Integer.rotateRight(0xFB2890DA ^ n4, 18) + 1850157473) * -81227557;
                                        try {
                                            n5 = n4 ^ 0xB7620874 ^ 0xA84DB6EE ^ 0xA84DB6EE;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            n5 = (int)((long)(n4 ^ 0xB7620874) ^ 0x4FAB287024081D0L ^ 0x4FAB287024081D0L);
                                        }
                                        n3 -= 3;
                                        continue;
                                    }
                                    int cfr_ignored_48 = (Integer.rotateRight(0xACC365BB ^ n4, 8) + -267980576) * -1396480581;
                                    n5 = n4 ^ 0x3529943F;
                                    int cfr_ignored_49 = (Integer.rotateRight(0x642A6C9B ^ n4, 15) + 629196288) * 1680501915;
                                    try {
                                        n3 += 2;
                                        if ((0xB1F9C9FA8761B769L ^ (long)n4 | 1L) == 0L) {
                                            throw new ArithmeticException();
                                        }
                                        n5 = Integer.reverse(Integer.reverse(n4 ^ 0xB7620874));
                                    }
                                    catch (ArithmeticException arithmeticException) {
                                        n5 = n4 ^ 0xB7620874 ^ 0xED2BFB25 ^ 0xED2BFB25;
                                    }
                                    ++n3;
                                    continue;
                                }
                                int cfr_ignored_50 = (Integer.rotateLeft(0x1A04A475 ^ n4, 6) - 720210278) * 436511861;
                                int cfr_ignored_51 = (int)(0xD8B60A4827D4EB4FL ^ (long)n4 ^ 0xE9E0831A2DB81CBDL);
                                n5 = n4 ^ 0xAB6B898E ^ 0xE57CC086 ^ 0xE57CC086;
                                int cfr_ignored_52 = (Integer.rotateLeft(0x24DF8950 ^ n4, 7) + 2070888427) * 618629457;
                                n5 = Integer.reverse(Integer.reverse(n4 ^ 0x32ABA420));
                                int cfr_ignored_53 = Integer.rotateRight(0xD32D98EF ^ n4, 13) - -1763498964;
                                n5 = n4 ^ 0xB7620874 ^ 0xFA2520C9 ^ 0xFA2520C9;
                                continue;
                            }
                            int cfr_ignored_54 = (Integer.rotateRight(0xD3A7551F ^ n4, 13) - -1516179972) * -744008417;
                            n5 = (int)((long)(n4 ^ 0xF95E4AF2) ^ 0xAE59FFD04C868003L ^ 0xAE59FFD04C868003L);
                            int cfr_ignored_55 = (Integer.rotateLeft(0x4614CE3C ^ n4, 11) - -2132633473) * 1175768637;
                            int cfr_ignored_56 = (int)(0x2AE23B87F8B2AC7EL ^ (long)n4 ^ 0x8A7F3DD6A3DBF815L);
                            n5 = (n4 ^ 0xB7620874) + -474231005 - -474231005;
                            continue;
                        }
                        int cfr_ignored_57 = (Integer.rotateLeft(0x8FF6E95 ^ n4, 4) - 457966406) * 150957717;
                        int cfr_ignored_58 = (int)(0xCA4DC0A827D4EB4FL ^ (long)n4 ^ 0x7C20831A2DB8394AL);
                        n5 = n4 ^ 0x690ED195;
                        int cfr_ignored_59 = (Integer.rotateLeft(0xDA018ADD ^ n4, 14) - 1787654142) * -637433123;
                        int cfr_ignored_60 = (int)(0x18B324E027D4EB4FL ^ (long)n4 ^ 0xB4B0831A2DB99CB7L);
                        try {
                            n5 = n4 ^ 0xB7620874;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n5 = Integer.reverse(Integer.reverse(n4 ^ 0xB7620874));
                        }
                        n3 -= 3;
                        continue;
                    }
                    int cfr_ignored_61 = (Integer.rotateLeft(0xE12B5459 ^ n4, 15) + 1218237954) * -517254055;
                    int cfr_ignored_62 = (int)(0x2399FA6427D4EB4FL ^ (long)n4 ^ 0x9B8831A2DB9EAE2L);
                    n5 = (int)((long)(n4 ^ 0xB9A047E9) ^ 0x556CADAFE57C8648L ^ 0x556CADAFE57C8648L);
                    int cfr_ignored_63 = (Integer.rotateLeft(0x90DECED5 ^ n4, 5) - -1890014458) * -1864446251;
                    int cfr_ignored_64 = (int)(0x526C60E827D4EB4FL ^ (long)n4 ^ 0x3CA0831A2DB90909L);
                    n5 = n4 ^ 0x3055586B;
                    int cfr_ignored_65 = (Integer.rotateRight(0xB089CC1A ^ n4, 9) + 1695372897) * -1333146597;
                    n5 = (n4 ^ 0xB7620874) + -1938104052 - -1938104052;
                    n3 -= 4;
                    continue;
                }
                return n2;
            }
            int cfr_ignored_66 = Integer.rotateLeft(0x4829144 ^ n4, 3) - -1876085129;
            n5 = (n4 ^ 0xB7620874) + 1246361424 - 1246361424;
        }
    }

    /*
     * Unable to fully structure code
     */
    private int mth() {
        var1_1 = 0;
        var2_2 = 0;
        var5_3 = 0;
        var3_4 = -405921399;
        var3_4 = Integer.rotateLeft(var3_4 * -885181003, 27) ^ 1245312523;
        var3_4 = Integer.rotateLeft(System.identityHashCode(this) ^ var3_4, 3);
        var4_5 = Integer.reverse(var3_4 ^ -246317950 ^ -800020759) + -1456340855 - -1456340855;
        block30: while (true) {
            block57: {
                block51: {
                    block50: {
                        block62: {
                            block68: {
                                block63: {
                                    block56: {
                                        block60: {
                                            block67: {
                                                block52: {
                                                    block65: {
                                                        block59: {
                                                            block64: {
                                                                block66: {
                                                                    block53: {
                                                                        block58: {
                                                                            block54: {
                                                                                block55: {
                                                                                    block61: {
                                                                                        var5_3 = Integer.reverse(var4_5) ^ var3_4 ^ -800020759;
                                                                                        switch (var5_3 & 15) {
                                                                                            case 0: {
                                                                                                if (var5_3 == -1248886688) break block50;
                                                                                                if (var5_3 != 1143408832) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block51;
                                                                                            }
                                                                                            case 1: {
                                                                                                if (var5_3 == 1942163857) break block52;
                                                                                                if (var5_3 != 995849937) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block53;
                                                                                            }
                                                                                            case 2: {
                                                                                                if (var5_3 != -246317950) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block54;
                                                                                            }
                                                                                            case 4: {
                                                                                                if (var5_3 == 1110308132) break block55;
                                                                                                if (var5_3 != 946137940) {
                                                                                                    Integer.rotateRight(-948488537 ^ var3_4, 11) - 734870900;
                                                                                                    ** break;
                                                                                                }
                                                                                                break block56;
                                                                                            }
                                                                                            case 5: {
                                                                                                if (var5_3 != 1489662629) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block57;
                                                                                            }
                                                                                            case 6: {
                                                                                                if (var5_3 == -1616362058) break block58;
                                                                                                if (var5_3 == -532500474) break block59;
                                                                                                (Integer.rotateLeft(845911036 ^ var3_4, 9) - 526682815) * 845911037;
                                                                                                if (var5_3 == 1545883606) break block60;
                                                                                                if (var5_3 != 1133107334) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block61;
                                                                                            }
                                                                                            case 7: {
                                                                                                if (var5_3 != 830845223) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block62;
                                                                                            }
                                                                                            case 9: {
                                                                                                if (var5_3 != -2061352199) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block63;
                                                                                            }
                                                                                            case 11: {
                                                                                                if (var5_3 != 417979739) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block64;
                                                                                            }
                                                                                            case 13: {
                                                                                                if (var5_3 == 409641213) break block65;
                                                                                                if (var5_3 != 1381710173) {
                                                                                                    if (var5_3 == 766004925) break;
                                                                                                    ** break;
                                                                                                }
                                                                                                break block66;
                                                                                            }
                                                                                            case 14: {
                                                                                                if (var5_3 == -1756754194) break block67;
                                                                                                if (var5_3 != -281830626) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block68;
                                                                                            }
                                                                                            case 15: {
                                                                                                if (var5_3 != 1781059151) ** break;
                                                                                                (Integer.rotateLeft(-1061495179 ^ var3_4, 11) - 1526632294) * -1061495179;
                                                                                                (int)(146490443097762639L ^ (long)var3_4 ^ 2152864770342627777L);
                                                                                                var2_2 = -1;
                                                                                                var4_5 = Integer.reverse(var3_4 ^ 1489662629 ^ -800020759) + 1869850716 - 1869850716;
                                                                                                Integer.rotateRight(339826283 ^ var3_4, 5) + 2017924656;
                                                                                                var5_3 += 2;
                                                                                                continue block30;
                                                                                            }
                                                                                        }
                                                                                        (Integer.rotateLeft(1985189500 ^ var3_4, 17) - 1484576831) * 1985189501;
                                                                                        var2_2 = var1_1;
                                                                                        try {
                                                                                            var5_3 -= 4;
                                                                                            if ((-7185386301468266131L ^ (long)var3_4 | 1L) == 0L) {
                                                                                                throw new ArithmeticException();
                                                                                            }
                                                                                            var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 1489662629 ^ -800020759)));
                                                                                        }
                                                                                        catch (ArithmeticException v0) {
                                                                                            var4_5 = Integer.reverse(var3_4 ^ 1489662629 ^ -800020759) + 1745999536 - 1745999536;
                                                                                        }
                                                                                        var5_3 -= 5;
                                                                                        continue;
                                                                                    }
                                                                                    Integer.rotateLeft(1192999429 ^ var3_4, 11) - -1598478890;
                                                                                    (int)(-8815492564182045873L ^ (long)var3_4 ^ -3098332395171436925L);
                                                                                    ++var1_1;
                                                                                    var4_5 = Integer.reverse(var3_4 ^ 940754060 ^ -800020759);
                                                                                    (Integer.rotateLeft(-1645893648 ^ var3_4, 6) + 590148939) * -1645893647;
                                                                                    var4_5 = (int)((long)Integer.reverse(var3_4 ^ 1110308132 ^ -800020759) ^ -7494371043145066744L ^ -7494371043145066744L);
                                                                                    var5_3 += 3;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateRight(1176945555 ^ var3_4, 11) + -2096148984) * 1176945555;
                                                                                if (var1_1 < (Integer.reverse(1124853154) ^ 1168625867)) {
                                                                                    var4_5 = (int)((long)Integer.reverse(var3_4 ^ 140072626 ^ -800020759) ^ -2354177618162985552L ^ -2354177618162985552L);
                                                                                    (Integer.rotateRight(-1432237581 ^ var3_4, 8) + -1376447576) * -1432237581;
                                                                                    var4_5 = Integer.reverse(var3_4 ^ -1616362058 ^ -800020759) + -865038793 - -865038793;
                                                                                    var5_3 += 5;
                                                                                    continue;
                                                                                }
                                                                                try {
                                                                                    var5_3 += 3;
                                                                                    if ((-2661453274268627341L ^ (long)var3_4 | 1L) == 0L) {
                                                                                        throw new IllegalArgumentException();
                                                                                    }
                                                                                    var4_5 = Integer.reverse(var3_4 ^ 1781059151 ^ -800020759) ^ 1557253125 ^ 1557253125;
                                                                                }
                                                                                catch (IllegalArgumentException v1) {
                                                                                    var4_5 = (int)((long)Integer.reverse(var3_4 ^ 1781059151 ^ -800020759) ^ 5191462200347265365L ^ 5191462200347265365L);
                                                                                }
                                                                                continue;
                                                                            }
                                                                            Integer.rotateRight(-2097329745 ^ var3_4, 3) - -519468180;
                                                                            var1_1 = 0;
                                                                            var4_5 = Integer.reverse(var3_4 ^ 511578750 ^ -800020759) ^ -53185732 ^ -53185732;
                                                                            (Integer.rotateRight(-992589346 ^ var3_4, 11) - -632254179) * -992589345;
                                                                            var4_5 = (int)((long)Integer.reverse(var3_4 ^ 1110308132 ^ -800020759) ^ -9156170291527139009L ^ -9156170291527139009L);
                                                                            ++var5_3;
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateLeft(1696782704 ^ var3_4, 15) + 1133900747) * 1696782705;
                                                                        if (!thd_6.ddhb(thd_6.mc.field_1724).method_5438(var1_1).method_31574(class_1802.field_8550)) {
                                                                            try {
                                                                                var5_3 -= 3;
                                                                                if ((-8138739170138556641L ^ (long)var3_4 | 1L) == 0L) {
                                                                                    throw new NoSuchElementException();
                                                                                }
                                                                                var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 1133107334 ^ -800020759)));
                                                                            }
                                                                            catch (NoSuchElementException v2) {
                                                                                var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 1133107334 ^ -800020759)));
                                                                            }
                                                                            var5_3 += 3;
                                                                            continue;
                                                                        }
                                                                        (int)(-8389466586224769119L ^ (long)var3_4 ^ -4873617642153002252L);
                                                                        var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -97667567 ^ -800020759)));
                                                                        (int)(8283385226879206504L ^ (long)var3_4 ^ 37382325695629369L);
                                                                        var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 766004925 ^ -800020759)));
                                                                        var5_3 -= 3;
                                                                        continue;
                                                                    }
                                                                    Integer.rotateRight(1488738318 ^ var3_4, 14) - -1020507923;
                                                                    if (thd_6.ddhb(thd_6.mc.field_1724).method_5438(var1_1).method_31574(class_1802.field_8550)) {
                                                                        (int)(-4692109669494993519L ^ (long)var3_4 ^ 8307964377106272277L);
                                                                        var4_5 = Integer.reverse(var3_4 ^ -203213227 ^ -800020759) + -775288496 - -775288496;
                                                                        (int)(-821186225366446992L ^ (long)var3_4 ^ -2051985984802372380L);
                                                                        var4_5 = Integer.reverse(var3_4 ^ 766004925 ^ -800020759);
                                                                        var5_3 -= 4;
                                                                        continue;
                                                                    }
                                                                    var4_5 = Integer.reverse(var3_4 ^ 880059856 ^ -800020759) + -1187690933 - -1187690933;
                                                                    Integer.rotateRight(77561070 ^ var3_4, 3) - -1817329651;
                                                                    var4_5 = Integer.reverse(var3_4 ^ 1133107334 ^ -800020759) ^ -2028544664 ^ -2028544664;
                                                                    var5_3 -= 4;
                                                                    continue;
                                                                }
                                                                Integer.rotateLeft(1399195948 ^ var3_4, 13) - 498645903;
                                                                var4_5 = Integer.reverse(var3_4 ^ 1299287436 ^ -800020759) ^ -1045361521 ^ -1045361521;
                                                                (Integer.rotateRight(-506693674 ^ var3_4, 15) - 1545609765) * -506693673;
                                                                var4_5 = Integer.reverse(var3_4 ^ -246317950 ^ -800020759);
                                                                var5_3 -= 3;
                                                                continue;
                                                            }
                                                            Integer.rotateRight(445139151 ^ var3_4, 6) - 987656268;
                                                            var4_5 = Integer.reverse(var3_4 ^ -1887574702 ^ -800020759);
                                                            (Integer.rotateLeft(1237525816 ^ var3_4, 12) + -218160893) * 1237525817;
                                                            var4_5 = Integer.reverse(var3_4 ^ -246317950 ^ -800020759);
                                                            var5_3 -= 2;
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(-1790841059 ^ var3_4, 5) - 391746494) * -1790841059;
                                                        (int)(6337480707003444047L ^ (long)var3_4 ^ 9164969390158447159L);
                                                        try {
                                                            var5_3 += 3;
                                                            var4_5 = Integer.reverse(var3_4 ^ -246317950 ^ -800020759);
                                                        }
                                                        catch (NoSuchElementException v3) {
                                                            var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -246317950 ^ -800020759)));
                                                        }
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(1888729349 ^ var3_4, 17) - -1505687850;
                                                    (int)(-5611178130773054641L ^ (long)var3_4 ^ -3242447583247283821L);
                                                    (int)(4348652426644818712L ^ (long)var3_4 ^ -729645605955578526L);
                                                    var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -246317950 ^ -800020759)));
                                                    continue;
                                                }
                                                Integer.rotateLeft(1274272101 ^ var3_4, 12) - 920973942;
                                                (int)(-8556426596518139057L ^ (long)var3_4 ^ 1423281630708547411L);
                                                try {
                                                    ++var5_3;
                                                    if ((5232666507985988011L ^ (long)var3_4 | 1L) == 0L) {
                                                        throw new ArithmeticException();
                                                    }
                                                    var4_5 = Integer.reverse(var3_4 ^ -246317950 ^ -800020759) ^ -566861233 ^ -566861233;
                                                }
                                                catch (ArithmeticException v4) {
                                                    var4_5 = Integer.reverse(var3_4 ^ -246317950 ^ -800020759);
                                                }
                                                var5_3 += 3;
                                                continue;
                                            }
                                            (Integer.rotateRight(-2126909634 ^ var3_4, 3) - -1436444739) * -2126909633;
                                            var4_5 = Integer.reverse(var3_4 ^ 790793475 ^ -800020759) ^ 1501213147 ^ 1501213147;
                                            Integer.rotateRight(1538985742 ^ var3_4, 14) - 537162221;
                                            try {
                                                var5_3 -= 4;
                                                if ((2668897364592146939L ^ (long)var3_4 | 1L) == 0L) {
                                                    throw new IllegalStateException();
                                                }
                                                var4_5 = Integer.reverse(var3_4 ^ -246317950 ^ -800020759) + -4958868 - -4958868;
                                            }
                                            catch (IllegalStateException v5) {
                                                var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -246317950 ^ -800020759)));
                                            }
                                            continue;
                                        }
                                        (Integer.rotateLeft(-919352300 ^ var3_4, 12) - 1638094247) * -919352299;
                                        var4_5 = Integer.reverse(var3_4 ^ -359159607 ^ -800020759) + -12585801 - -12585801;
                                        Integer.rotateRight(-40290038 ^ var3_4, 18) + -1175746703;
                                        try {
                                            var5_3 += 2;
                                            var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -246317950 ^ -800020759)));
                                        }
                                        catch (NoSuchElementException v6) {
                                            var4_5 = Integer.reverse(var3_4 ^ -246317950 ^ -800020759) + 858250453 - 858250453;
                                        }
                                        continue;
                                    }
                                    Integer.rotateRight(-1475706901 ^ var3_4, 8) + 1570970800;
                                    var4_5 = Integer.reverse(var3_4 ^ 1786717109 ^ -800020759) ^ -1689131099 ^ -1689131099;
                                    Integer.rotateRight(-192667005 ^ var3_4, 17) + -1604465384;
                                    var4_5 = (int)((long)Integer.reverse(var3_4 ^ -246317950 ^ -800020759) ^ -7288223158309560913L ^ -7288223158309560913L);
                                    var5_3 += 2;
                                    continue;
                                }
                                (Integer.rotateRight(-1021287621 ^ var3_4, 11) + -1521900704) * -1021287621;
                                var4_5 = Integer.reverse(var3_4 ^ 701213192 ^ -800020759) + -1821500718 - -1821500718;
                                Integer.rotateLeft(-691448852 ^ var3_4, 13) - 113166543;
                                (int)(-8342721000043207068L ^ (long)var3_4 ^ -7235115519354948192L);
                                var4_5 = Integer.reverse(var3_4 ^ -246317950 ^ -800020759) ^ -1590758525 ^ -1590758525;
                                --var5_3;
                                continue;
                            }
                            Integer.rotateLeft(-1941487288 ^ var3_4, 4) + 16680691;
                            var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ 2026659549 ^ -800020759)));
                            Integer.rotateLeft(1311261153 ^ var3_4, 12) + 2067634554;
                            (int)(-8315070033146090673L ^ (long)var3_4 ^ 2506397341091149028L);
                            try {
                                var4_5 = Integer.reverse(var3_4 ^ -246317950 ^ -800020759) + -308320051 - -308320051;
                            }
                            catch (IllegalStateException v7) {
                                var4_5 = Integer.reverse(var3_4 ^ -246317950 ^ -800020759);
                            }
                            continue;
                        }
                        Integer.rotateLeft(766872108 ^ var3_4, 8) - -1923523953;
                        var4_5 = Integer.reverse(var3_4 ^ 2071769588 ^ -800020759) + -1029091073 - -1029091073;
                        Integer.rotateRight(1604223435 ^ var3_4, 14) + -1735436592;
                        var4_5 = Integer.reverse(var3_4 ^ -246317950 ^ -800020759) + -60622561 - -60622561;
                        var5_3 += 5;
                        continue;
                    }
                    (Integer.rotateLeft(-198934124 ^ var3_4, 17) - -1798746073) * -198934123;
                    var4_5 = Integer.reverse(var3_4 ^ -498397892 ^ -800020759) + -1707194741 - -1707194741;
                    (Integer.rotateLeft(1061034513 ^ var3_4, 10) + -1394423990) * 1061034513;
                    (int)(-176568183634465969L ^ (long)var3_4 ^ -7698759414530419000L);
                    var4_5 = Integer.reverse(var3_4 ^ -1038970435 ^ -800020759) + 452266600 - 452266600;
                    Integer.rotateRight(-2044931225 ^ var3_4, 3) - 1104885940;
                    var4_5 = (int)((long)Integer.reverse(var3_4 ^ -246317950 ^ -800020759) ^ 8529114035059172847L ^ 8529114035059172847L);
                    continue;
                }
                Integer.rotateRight(-1016968857 ^ var3_4, 11) - -1388019020;
                var4_5 = Integer.reverse(Integer.reverse(Integer.reverse(var3_4 ^ -246317950 ^ -800020759)));
                var5_3 -= 4;
                continue;
            }
            return var2_2;
lbl320:
            // 13 sources

            (Integer.rotateRight(-1166522658 ^ var3_4, 10) - -1729219555) * -1166522657;
            var4_5 = Integer.reverse(var3_4 ^ -246317950 ^ -800020759);
        }
    }

    private boolean zmf() {
        if (thd_6.mc.field_1724 == null || thd_6.mc.field_1687 == null) {
            return false;
        }
        class_2338 class_23382 = thd_6.mc.field_1724.method_24515();
        for (int i = 0; i < 6; ++i) {
            class_2338 class_23383 = class_23382.method_10086(i);
            class_2680 class_26802 = thd_6.mc.field_1687.method_8320(class_23383);
            if (!class_26802.method_26215() && class_26802.method_26204() != class_2246.field_10382 && class_26802.method_26204() != class_2246.field_10164) {
                return false;
            }
            for (class_2350 class_23502 : class_2350.class_2353.field_11062) {
                class_2680 class_26803 = thd_6.mc.field_1687.method_8320(class_23383.method_10093(class_23502));
                if (!class_26803.method_26215() && !class_26803.method_45474()) continue;
                return false;
            }
        }
        return true;
    }

    private long khfj() {
        block0: {
            int n = 1994717789;
            n = Integer.rotateLeft(n * 2133738687, 19) ^ 0x631B49C4;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 18);
            int n2 = n ^ 0xE2BF6DED;
            if ((n2 ^ n) == -490770963) break block0;
            int cfr_ignored_0 = (0x945B97B0 ^ n) - 1657440886;
        }
        return this.jb;
    }

    private void zam_3() {
        try {
            int n = -901944005;
            n = Integer.rotateLeft(n * 851320595, 21) ^ 0xC22A1375;
            int n2 = n ^ 0x563D071;
            if ((n2 ^ n) != 90427505) {
                int cfr_ignored_0 = (0xCF5EBD4A ^ n) + -2031786148;
            }
            if ((0x1EC & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (this.shtkh_2 != null && thd_6.mc.field_1761 != null) {
            thd_6.mc.field_1761.method_2925();
        }
        this.shtkh_2 = null;
        this.dhsr = null;
        if (this.tdhkh.shzl() && this.zzb != -1 && thd_6.mc.field_1724 != null) {
            thd_6.mc.field_1724.method_31548().field_7545 = this.zzb;
        }
        this.zzb = -1;
        kq.thzt_2().aghq(this);
    }

    private void azs() {
        int n = 0;
        int n2 = -1429363709;
        n2 = Integer.rotateLeft(n2 * 1000013369, 27) ^ 0xE307B6;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = -1219953895 + n2 ^ 0xAB505C1D ^ 0xAB505C1D;
        while (true) {
            block31: {
                block33: {
                    block47: {
                        block53: {
                            block39: {
                                block50: {
                                    block37: {
                                        block36: {
                                            block46: {
                                                block51: {
                                                    block44: {
                                                        block52: {
                                                            block32: {
                                                                block40: {
                                                                    block38: {
                                                                        block34: {
                                                                            block30: {
                                                                                block29: {
                                                                                    block45: {
                                                                                        block49: {
                                                                                            block43: {
                                                                                                block48: {
                                                                                                    block41: {
                                                                                                        block42: {
                                                                                                            block26: {
                                                                                                                block35: {
                                                                                                                    block27: {
                                                                                                                        block28: {
                                                                                                                            if ((n = n3 - n2) > -37870552) break block26;
                                                                                                                            if (n > -1219953895) break block27;
                                                                                                                            if (n > -1727096598) break block28;
                                                                                                                            if (n == -1819091677) break block29;
                                                                                                                            if (n == -1727096598) break block30;
                                                                                                                            int cfr_ignored_0 = (Integer.rotateRight(0x5109E5D6 ^ n2, 13) - -728730587) * 1359603159;
                                                                                                                            break block31;
                                                                                                                        }
                                                                                                                        if (n == -1296625317) break block32;
                                                                                                                        if (n == -1274530774) break block33;
                                                                                                                        if (n == -1219953895) break block34;
                                                                                                                        break block31;
                                                                                                                    }
                                                                                                                    if (n > -986644730) break block35;
                                                                                                                    if (n == -1115268710) break block36;
                                                                                                                    if (n == -986644730) break block37;
                                                                                                                    break block31;
                                                                                                                }
                                                                                                                if (n == -679065467) break block38;
                                                                                                                if (n == -261290359) break block39;
                                                                                                                int cfr_ignored_1 = Integer.rotateRight(0x78BE78A6 ^ n2, 18) - -1553056939;
                                                                                                                if (n == -37870552) break block40;
                                                                                                                break block31;
                                                                                                            }
                                                                                                            if (n > 885952287) break block41;
                                                                                                            if (n > 108889278) break block42;
                                                                                                            if (n == 41567221) break block43;
                                                                                                            if (n == 108889278) break block44;
                                                                                                            break block31;
                                                                                                        }
                                                                                                        if (n == 399044056) break block45;
                                                                                                        if (n == 764300145) break block46;
                                                                                                        int cfr_ignored_2 = Integer.rotateRight(0x8F4A17C6 ^ n2, 4) - 1582727221;
                                                                                                        if (n == 885952287) break block47;
                                                                                                        break block31;
                                                                                                    }
                                                                                                    if (n > 1423189182) break block48;
                                                                                                    if (n == 1414974936) break block49;
                                                                                                    if (n == 1423189182) break block50;
                                                                                                    int cfr_ignored_3 = Integer.rotateLeft(0xC9086041 ^ n2, 12) + 1549879066;
                                                                                                    int cfr_ignored_4 = (int)(0xBBACE7C27D4EB4FL ^ (long)n2 ^ 0x6188831A2DB9BAA4L);
                                                                                                    break block31;
                                                                                                }
                                                                                                if (n == 1627322417) break block51;
                                                                                                if (n == 1811356989) break block52;
                                                                                                int cfr_ignored_5 = (Integer.rotateRight(0x96FBD37B ^ n2, 5) + 1289501472) * -1761881221;
                                                                                                if (n == 2062957464) break block53;
                                                                                                break block31;
                                                                                            }
                                                                                            int cfr_ignored_6 = (Integer.rotateLeft(0xF1AE98F5 ^ n2, 17) - 1216488678) * -240215819;
                                                                                            int cfr_ignored_7 = (int)(0x331C36C827D4EB4FL ^ (long)n2 ^ 0x90E0831A2DB9CBE9L);
                                                                                            thd_6.mc.field_1724.method_31548().field_7545 = this.thyz;
                                                                                            try {
                                                                                                n -= 4;
                                                                                                if ((0x64659B3B3EA66B67L ^ (long)n2 | 1L) == 0L) {
                                                                                                    throw new ArithmeticException();
                                                                                                }
                                                                                                n3 = Integer.reverse(Integer.reverse(1414974936 + n2));
                                                                                            }
                                                                                            catch (ArithmeticException arithmeticException) {
                                                                                                n3 = 1414974936 + n2 + -1313225297 - -1313225297;
                                                                                            }
                                                                                            n += 4;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_8 = (Integer.rotateLeft(0x49676DFD ^ n2, 12) - -404492066) * 1231515133;
                                                                                        int cfr_ignored_9 = (int)(0x8BD5C3C027D4EB4FL ^ (long)n2 ^ 0x7AF0831A2DB8BA7AL);
                                                                                        this.thky = hd_2.sst_4;
                                                                                        this.khdhs_2 = null;
                                                                                        this.thyz = -1;
                                                                                        return;
                                                                                    }
                                                                                    int cfr_ignored_10 = (Integer.rotateLeft(0x4F938D14 ^ n2, 12) - -1489259353) * 1335069973;
                                                                                    if (this.tdhkh.shzl()) {
                                                                                        n3 = -1727096598 + n2 ^ 0xAAAF27E8 ^ 0xAAAF27E8;
                                                                                        continue;
                                                                                    }
                                                                                    n3 = 132459595 + n2 ^ 0xFC78A903 ^ 0xFC78A903;
                                                                                    int cfr_ignored_11 = Integer.rotateRight(0xDF3FD82B ^ n2, 14) + 219729008;
                                                                                    n3 = 1414974936 + n2 ^ 0xC93F678 ^ 0xC93F678;
                                                                                    --n;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_12 = Integer.rotateRight(0xED9BB40A ^ n2, 16) + -902271887;
                                                                                if (this.tdhkh.shzl()) {
                                                                                    try {
                                                                                        n -= 5;
                                                                                        if ((0x62120053199AC329L ^ (long)n2 | 1L) == 0L) {
                                                                                            throw new NoSuchElementException();
                                                                                        }
                                                                                        n3 = Integer.reverse(Integer.reverse(-1727096598 + n2));
                                                                                    }
                                                                                    catch (NoSuchElementException noSuchElementException) {
                                                                                        n3 = Integer.reverse(Integer.reverse(-1727096598 + n2));
                                                                                    }
                                                                                    n += 4;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_13 = (int)(0x308C079D4C661DC8L ^ (long)n2 ^ 0xF24A547FC0B7CCC9L);
                                                                                n3 = (int)((long)(495247501 + n2) ^ 0xC683EC307DBD18C4L ^ 0xC683EC307DBD18C4L);
                                                                                int cfr_ignored_14 = (int)(0x84133F086CC8B22EL ^ (long)n2 ^ 0x836015229F7AA5F7L);
                                                                                n3 = Integer.reverse(Integer.reverse(1414974936 + n2));
                                                                                n += 2;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_15 = (Integer.rotateRight(0xAA6E665F ^ n2, 8) - -1480850244) * -1435605409;
                                                                            if (this.thyz == -1) {
                                                                                n3 = Integer.reverse(Integer.reverse(1858209333 + n2));
                                                                                int cfr_ignored_16 = Integer.rotateLeft(0x76523665 ^ n2, 17) - 1481782646;
                                                                                int cfr_ignored_17 = (int)(0xB4E0985827D4EB4FL ^ (long)n2 ^ 0xCDC0831A2DB8C410L);
                                                                                n3 = 1414974936 + n2 + -1109787124 - -1109787124;
                                                                                n += 3;
                                                                                continue;
                                                                            }
                                                                            n3 = (int)((long)(-679065467 + n2) ^ 0xB2D00BA2229DA6A9L ^ 0xB2D00BA2229DA6A9L);
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_18 = Integer.rotateLeft(0x35FD2BA8 ^ n2, 9) + -1912215405;
                                                                        if (this.thky == hd_2.sst_4) {
                                                                            int cfr_ignored_19 = (int)(0x471A0EE58B1DA591L ^ (long)n2 ^ 0xE0BBDA88B00523E5L);
                                                                            n3 = 1414974936 + n2;
                                                                            n -= 5;
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            if ((0xC2DED578E98ED889L ^ (long)n2 | 1L) == 0L) {
                                                                                throw new IllegalArgumentException();
                                                                            }
                                                                            n3 = -1819091677 + n2 + -1387633252 - -1387633252;
                                                                        }
                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                            n3 = -1819091677 + n2;
                                                                        }
                                                                        n -= 5;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_20 = (Integer.rotateLeft(0x50EDCEF4 ^ n2, 13) - -785797433) * 1357762293;
                                                                    if (thd_6.mc.field_1724 == null) {
                                                                        n3 = 1414974936 + n2;
                                                                        n -= 3;
                                                                        continue;
                                                                    }
                                                                    n3 = Integer.reverse(Integer.reverse(1255350103 + n2));
                                                                    int cfr_ignored_21 = Integer.rotateRight(0x24D003CE ^ n2, 7) - 2039354669;
                                                                    n3 = Integer.reverse(Integer.reverse(41567221 + n2));
                                                                    n += 2;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_22 = Integer.rotateLeft(0xA078125 ^ n2, 4) - 994460342;
                                                                int cfr_ignored_23 = (int)(0xC8B52F1827D4EB4FL ^ (long)n2 ^ 0xA340831A2DB83CBBL);
                                                                n3 = (int)((long)(-2004166769 + n2) ^ 0xC8B66428277C1432L ^ 0xC8B66428277C1432L);
                                                                int cfr_ignored_24 = (Integer.rotateRight(0x829DDDDA ^ n2, 3) + -713327455) * -2103583269;
                                                                try {
                                                                    if ((0x49F0DD6914620B6BL ^ (long)n2 | 1L) == 0L) {
                                                                        throw new NoSuchElementException();
                                                                    }
                                                                    n3 = Integer.reverse(Integer.reverse(-1219953895 + n2));
                                                                }
                                                                catch (NoSuchElementException noSuchElementException) {
                                                                    n3 = (int)((long)(-1219953895 + n2) ^ 0xF197985A5EEAD292L ^ 0xF197985A5EEAD292L);
                                                                }
                                                                n -= 5;
                                                                continue;
                                                            }
                                                            int cfr_ignored_25 = Integer.rotateLeft(0xAFD5E7A1 ^ n2, 8) + 1329900474;
                                                            int cfr_ignored_26 = (int)(0x6D67499C27D4EB4FL ^ (long)n2 ^ 0x6E48831A2DB9771FL);
                                                            try {
                                                                n -= 3;
                                                                n3 = (int)((long)(-1219953895 + n2) ^ 0xB403E7A0E71E5C98L ^ 0xB403E7A0E71E5C98L);
                                                            }
                                                            catch (IllegalStateException illegalStateException) {
                                                                n3 = -1219953895 + n2 + -38661798 - -38661798;
                                                            }
                                                            n -= 3;
                                                            continue;
                                                        }
                                                        int cfr_ignored_27 = (Integer.rotateRight(0xD04BA6F2 ^ n2, 13) + 1032246921) * -800348429;
                                                        try {
                                                            n3 = -1219953895 + n2 ^ 0xEC5B59FD ^ 0xEC5B59FD;
                                                        }
                                                        catch (ArithmeticException arithmeticException) {
                                                            n3 = Integer.reverse(Integer.reverse(-1219953895 + n2));
                                                        }
                                                        n -= 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_28 = (Integer.rotateRight(0xB2680593 ^ n2, 9) + -1628025848) * -1301805677;
                                                    n3 = (int)((long)(-1219953895 + n2) ^ 0xCA6F4AAA2A3466DEL ^ 0xCA6F4AAA2A3466DEL);
                                                    continue;
                                                }
                                                int cfr_ignored_29 = Integer.rotateLeft(0x4E8A6344 ^ n2, 12) - -2027969417;
                                                int cfr_ignored_30 = (int)(0x69C87CB8356A9851L ^ (long)n2 ^ 0x400A666CB857E41L);
                                                n3 = Integer.reverse(Integer.reverse(1899053644 + n2));
                                                int cfr_ignored_31 = (int)(0x4D115F0CBBA1B842L ^ (long)n2 ^ 0x4369BBF08BA337F3L);
                                                n3 = -1219953895 + n2 ^ 0x1488030C ^ 0x1488030C;
                                                n -= 5;
                                                continue;
                                            }
                                            int cfr_ignored_32 = (Integer.rotateLeft(0x5A37C3B8 ^ n2, 14) + -249671037) * 1513604025;
                                            n3 = Integer.reverse(Integer.reverse(-1219953895 + n2));
                                            int cfr_ignored_33 = (Integer.rotateLeft(0xE6D1DF71 ^ n2, 15) + -137908758) * -422453391;
                                            int cfr_ignored_34 = (int)(0x2463714C27D4EB4FL ^ (long)n2 ^ 0x1FE8831A2DB9E517L);
                                            n -= 2;
                                            continue;
                                        }
                                        int cfr_ignored_35 = (Integer.rotateLeft(0xCE580AFD ^ n2, 12) - 17232862) * -833090819;
                                        int cfr_ignored_36 = (int)(0xCEAA4C027D4EB4FL ^ (long)n2 ^ 0xB4F0831A2DB9B404L);
                                        n3 = 718544916 + n2 ^ 0x19EE14F9 ^ 0x19EE14F9;
                                        int cfr_ignored_37 = Integer.rotateLeft(0x88ACA22C ^ n2, 4) - -1857731953;
                                        n3 = -1219953895 + n2 + 1398669044 - 1398669044;
                                        n += 3;
                                        continue;
                                    }
                                    int cfr_ignored_38 = Integer.rotateLeft(0x6B5489A0 ^ n2, 16) + 60443035;
                                    try {
                                        n -= 4;
                                        n3 = Integer.reverse(Integer.reverse(-1219953895 + n2));
                                    }
                                    catch (ArithmeticException arithmeticException) {
                                        n3 = -1219953895 + n2 + 388996295 - 388996295;
                                    }
                                    n += 4;
                                    continue;
                                }
                                int cfr_ignored_39 = (Integer.rotateLeft(0x9361E174 ^ n2, 5) - -583537593) * -1822301835;
                                n3 = (int)((long)(-1113024851 + n2) ^ 0x6C593D1EF6B55902L ^ 0x6C593D1EF6B55902L);
                                int cfr_ignored_40 = Integer.rotateLeft(0xC11232CC ^ n2, 11) - 1704052207;
                                int cfr_ignored_41 = (int)(0xAB10CAE2A7D5CD02L ^ (long)n2 ^ 0x68B583186122FBF0L);
                                n3 = 1554750235 + n2 + -1134684204 - -1134684204;
                                int cfr_ignored_42 = (int)(0x5C53171338291B3EL ^ (long)n2 ^ 0xD356BCE1CD5B1577L);
                                n3 = -1219953895 + n2;
                                continue;
                            }
                            int cfr_ignored_43 = (Integer.rotateRight(0xBD936313 ^ n2, 10) + -113860984) * -1114414317;
                            n3 = -361542148 + n2 + -1087960063 - -1087960063;
                            int cfr_ignored_44 = (Integer.rotateLeft(0xE975D275 ^ n2, 16) - 1235360614) * -378154379;
                            int cfr_ignored_45 = (int)(0x2BC77C4827D4EB4FL ^ (long)n2 ^ 0x5E0831A2DB9FA5FL);
                            n3 = Integer.reverse(Integer.reverse(-1219953895 + n2));
                            continue;
                        }
                        int cfr_ignored_46 = (Integer.rotateLeft(0x45F78238 ^ n2, 11) + 2102813699) * 1173848633;
                        try {
                            n -= 5;
                            n3 = -1219953895 + n2 + -871600496 - -871600496;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = -1219953895 + n2 ^ 0x7EF6D1AC ^ 0x7EF6D1AC;
                        }
                        n += 5;
                        continue;
                    }
                    int cfr_ignored_47 = (Integer.rotateLeft(0xAD6EB41D ^ n2, 8) - 80047806) * -1385253859;
                    int cfr_ignored_48 = (int)(0x6FDC1A2027D4EB4FL ^ (long)n2 ^ 0xC930831A2DB97269L);
                    int cfr_ignored_49 = (int)(0xE466BEE3C332BE2EL ^ (long)n2 ^ 0x80B74AD6877A651CL);
                    n3 = (int)((long)(-1219953895 + n2) ^ 0x1D3057A234A4E9C0L ^ 0x1D3057A234A4E9C0L);
                    continue;
                }
                int cfr_ignored_50 = Integer.rotateRight(0x7429C602 ^ n2, 17) + 359438713;
                n3 = -1693484918 + n2 + 1783417513 - 1783417513;
                int cfr_ignored_51 = (Integer.rotateLeft(0xB9BA2731 ^ n2, 10) + -2115477974) * -1178982607;
                int cfr_ignored_52 = (int)(0x7B08890C27D4EB4FL ^ (long)n2 ^ 0xEF68831A2DB95BC0L);
                n3 = -1219953895 + n2 ^ 0xB6DA064 ^ 0xB6DA064;
                n -= 4;
                continue;
            }
            int cfr_ignored_53 = (Integer.rotateRight(0x561058B2 ^ n2, 13) + 1884839113) * 1443911859;
            n3 = (int)((long)(-1219953895 + n2) ^ 0x52F29F482D4BA416L ^ 0x52F29F482D4BA416L);
        }
    }

    private static int khak(tthq tthq2, tthq tthq3) {
        int n = 0;
        int n2 = 0;
        int n3 = 1064999417;
        n3 = Integer.rotateLeft(n3 * -1492876911, 22) ^ 0x348703CF;
        tthq tthq4 = tthq2;
        n3 = (tthq4 != null ? System.identityHashCode(tthq4) : 0) ^ n3;
        int n4 = (int)((long)(n3 ^ 0xFF2C304F) ^ 0x9D5DA55342587BDL ^ 0x9D5DA55342587BDL);
        block33: while (true) {
            switch (n4 ^ n3) {
                case -1203033969: {
                    int cfr_ignored_0 = (Integer.rotateRight(0xDD4D111A ^ n3, 14) + -793595551) * -582151909;
                    n = Integer.compare(tthq2.ztj_2, tthq3.ztj_2);
                    int cfr_ignored_1 = (int)(0x6E6D2DF823C36667L ^ (long)n3 ^ 0xA6808B3537E9710BL);
                    n4 = Integer.reverse(Integer.reverse(n3 ^ 0xD8674502));
                    continue block33;
                }
                case -1807480910: {
                    int cfr_ignored_2 = Integer.rotateRight(0x58A92067 ^ n3, 14) - -1059550284;
                    throw null;
                }
                case 1297646256: {
                    int cfr_ignored_3 = (Integer.rotateRight(0xEAE0897B ^ n3, 16) + 1972258080) * -354383493;
                    if (tthq2.ztj_2 == tthq3.ztj_2) {
                        int cfr_ignored_4 = (int)(0x2705CEFC9F39182L ^ (long)n3 ^ 0x44AF5F54D823A931L);
                        n4 = n3 ^ 0xB72ED0C2;
                        continue block33;
                    }
                    n4 = (n3 ^ 0x4AA1C84F) + -1677142297 - -1677142297;
                    int cfr_ignored_5 = (Integer.rotateRight(0x8EBF0ED2 ^ n3, 4) + 1300261545) * -1900081453;
                    n4 = Integer.reverse(Integer.reverse(n3 ^ 0xB84B288F));
                    n2 += 5;
                    continue block33;
                }
                case -1221668670: {
                    int cfr_ignored_6 = (Integer.rotateRight(0xE72E7E3E ^ n3, 15) - 50260157) * -416383425;
                    n = Double.compare(tthq2.dhha_3, tthq3.dhha_3);
                    n4 = (int)((long)(n3 ^ 0x55ED7DEC) ^ 0x8771DB56420CEB6AL ^ 0x8771DB56420CEB6AL);
                    int cfr_ignored_7 = (Integer.rotateLeft(0xFCAC96D4 ^ n3, 18) - -1656495385) * -55798059;
                    n4 = n3 ^ 0xD8674502 ^ 0x227AF8F1 ^ 0x227AF8F1;
                    n2 -= 3;
                    continue block33;
                }
                case -13881265: {
                    int cfr_ignored_8 = Integer.rotateLeft(0xDFD738E9 ^ n3, 14) + 527270770;
                    int cfr_ignored_9 = (int)(0x1D6596D427D4EB4FL ^ (long)n3 ^ 0xD0D8831A2DB9971AL);
                    if (!yf.dnkh()) {
                        n4 = Integer.reverse(Integer.reverse(n3 ^ 0x4D5882B0));
                        int cfr_ignored_10 = (Integer.rotateRight(0x3FDA715A ^ n3, 10) + -1076799199) * 1071280475;
                        n2 -= 4;
                        continue block33;
                    }
                    n4 = Integer.reverse(Integer.reverse(n3 ^ 0x944407B2));
                    int cfr_ignored_11 = (Integer.rotateRight(0x341C925B ^ n3, 9) + 1406359616) * 874287707;
                    ++n2;
                    continue block33;
                }
                case -245080795: {
                    int cfr_ignored_12 = (Integer.rotateLeft(0x8F054ABC ^ n3, 4) - 1442950143) * -1895478595;
                    n4 = (int)((long)(n3 ^ 0x751BD221) ^ 0xBBB02B58CAEF2064L ^ 0xBBB02B58CAEF2064L);
                    int cfr_ignored_13 = (Integer.rotateRight(0x304D9237 ^ n3, 9) - -574467100) * 810390071;
                    n4 = Integer.reverse(Integer.reverse(n3 ^ 0xFF2C304F));
                    int cfr_ignored_14 = (Integer.rotateLeft(0xEED4849C ^ n3, 16) - -266752481) * -288062307;
                    n2 += 3;
                    continue block33;
                }
                case 1011537787: {
                    int cfr_ignored_15 = Integer.rotateLeft(0xDC8ED925 ^ n3, 14) - -1180046666;
                    int cfr_ignored_16 = (int)(0x1E3C771827D4EB4FL ^ (long)n3 ^ 0x1340831A2DB991A9L);
                    n4 = Integer.reverse(Integer.reverse(n3 ^ 0xFF2C304F));
                    int cfr_ignored_17 = Integer.rotateRight(0xF8945C3 ^ n3, 4) + -436399656;
                    ++n2;
                    continue block33;
                }
                case 1803075681: {
                    int cfr_ignored_18 = (Integer.rotateLeft(0xA8A01BB1 ^ n3, 8) + 1874917802) * -1465902159;
                    int cfr_ignored_19 = (int)(0x6A12B58C27D4EB4FL ^ (long)n3 ^ 0x9668831A2DB979F4L);
                    n4 = n3 ^ 0xE2AE1DB3 ^ 0x62FF9DE2 ^ 0x62FF9DE2;
                    int cfr_ignored_20 = (Integer.rotateLeft(0x69E0CD7C ^ n3, 16) - -694779585) * 1776340349;
                    n4 = Integer.reverse(Integer.reverse(n3 ^ 0xF087ECC1));
                    int cfr_ignored_21 = Integer.rotateLeft(0x7B458BA4 ^ n3, 18) - -238450665;
                    n4 = n3 ^ 0xFF2C304F ^ 0xE7634AD2 ^ 0xE7634AD2;
                    n2 -= 5;
                    continue block33;
                }
                case 623366759: {
                    int cfr_ignored_22 = (Integer.rotateRight(0x8461BE9B ^ n3, 3) + 204715008) * -2073968997;
                    n4 = (int)((long)(n3 ^ 0x91490272) ^ 0xC97A0DE24F375B3FL ^ 0xC97A0DE24F375B3FL);
                    int cfr_ignored_23 = (Integer.rotateRight(0xFE85F7B3 ^ n3, 18) + -694772248) * -24774733;
                    try {
                        n2 += 4;
                        if ((0xAA23E5FB378F649L ^ (long)n3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n4 = n3 ^ 0xFF2C304F;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n4 = (n3 ^ 0xFF2C304F) + 21877342 - 21877342;
                    }
                    ++n2;
                    continue block33;
                }
                case -2115962196: {
                    int cfr_ignored_24 = Integer.rotateLeft(0xDE3042A4 ^ n3, 14) - -332025577;
                    n4 = (int)((long)(n3 ^ 0x862B0587) ^ 0x3CFF3705427BBD9L ^ 0x3CFF3705427BBD9L);
                    int cfr_ignored_25 = Integer.rotateRight(0xC0495B86 ^ n3, 11) - 1296020597;
                    try {
                        n2 -= 2;
                        if ((0xA3724C4B2F2EEAA5L ^ (long)n3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n4 = (n3 ^ 0xFF2C304F) + 1695773508 - 1695773508;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n4 = (int)((long)(n3 ^ 0xFF2C304F) ^ 0xA0C9C6D5D5111627L ^ 0xA0C9C6D5D5111627L);
                    }
                    n2 += 3;
                    continue block33;
                }
                case 2138736393: {
                    int cfr_ignored_26 = (Integer.rotateRight(0xA1C6A276 ^ n3, 7) - -1687467131) * -1580817801;
                    n4 = (n3 ^ 0xECE65D3F) + 416805957 - 416805957;
                    int cfr_ignored_27 = (Integer.rotateLeft(0xA9DD4674 ^ n3, 8) - -1775687865) * -1445116299;
                    n4 = n3 ^ 0xFF2C304F ^ 0x3CB476D1 ^ 0x3CB476D1;
                    continue block33;
                }
                case 1110397301: {
                    int cfr_ignored_28 = Integer.rotateRight(0xDD3A93AB ^ n3, 14) + -831160080;
                    try {
                        if ((0x10CCCA5D82312783L ^ (long)n3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n4 = (n3 ^ 0xFF2C304F) + -2080962152 - -2080962152;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n4 = n3 ^ 0xFF2C304F;
                    }
                    n2 += 4;
                    continue block33;
                }
                case 1864900200: {
                    int cfr_ignored_29 = (Integer.rotateLeft(0xA855CBD ^ n3, 4) - 1250155038) * 176512189;
                    int cfr_ignored_30 = (int)(0xC837F28027D4EB4FL ^ (long)n3 ^ 0x1870831A2DB83DBEL);
                    n4 = n3 ^ 0xFF2C304F;
                    n2 += 3;
                    continue block33;
                }
                case -282279024: {
                    int cfr_ignored_31 = Integer.rotateLeft(0x48BCB64 ^ n3, 3) - -1857339305;
                    n4 = (n3 ^ 0xBD6DF607) + -1745523379 - -1745523379;
                    int cfr_ignored_32 = Integer.rotateLeft(0xD592C224 ^ n3, 13) - -517791337;
                    try {
                        n2 -= 3;
                        if ((0xE69687F72B65DA2FL ^ (long)n3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n4 = Integer.reverse(Integer.reverse(n3 ^ 0xFF2C304F));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n4 = n3 ^ 0xFF2C304F;
                    }
                    n2 += 4;
                    continue block33;
                }
                case -639484521: {
                    int cfr_ignored_33 = (Integer.rotateLeft(0x5A72F5DD ^ n3, 14) - -129407746) * 1517483485;
                    int cfr_ignored_34 = (int)(0x98C05BE027D4EB4FL ^ (long)n3 ^ 0x4AB0831A2DB89C51L);
                    n4 = (n3 ^ 0x39197C58) + 1107263680 - 1107263680;
                    int cfr_ignored_35 = (Integer.rotateLeft(0x6CE93D14 ^ n3, 16) - 882640039) * 1827224853;
                    int cfr_ignored_36 = (int)(0x75C04999952FDDF9L ^ (long)n3 ^ 0x6E43E6EC40D54651L);
                    n4 = n3 ^ 0x63914761 ^ 0x5CEC6FE2 ^ 0x5CEC6FE2;
                    int cfr_ignored_37 = (int)(0x675AFA52A7DB782AL ^ (long)n3 ^ 0x9D583050B736364L);
                    n4 = n3 ^ 0xFF2C304F ^ 0x18F6057 ^ 0x18F6057;
                    ++n2;
                    continue block33;
                }
                case -423547057: {
                    int cfr_ignored_38 = (Integer.rotateLeft(0x8AED1C ^ n3, 3) - 355489183) * 9104669;
                    try {
                        if ((0x1133DED898D37115L ^ (long)n3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n4 = (n3 ^ 0xFF2C304F) + -1538338743 - -1538338743;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n4 = n3 ^ 0xFF2C304F;
                    }
                    continue block33;
                }
                case 1515583045: {
                    int cfr_ignored_39 = (Integer.rotateRight(0x572CF696 ^ n3, 13) - -1831896219) * 1462564503;
                    n4 = n3 ^ 0xFF2C304F;
                    int cfr_ignored_40 = Integer.rotateRight(0xC2A6D603 ^ n3, 11) + -1768846952;
                    n2 -= 3;
                    continue block33;
                }
                case 1123929766: {
                    int cfr_ignored_41 = Integer.rotateLeft(0x6C6E18E8 ^ n3, 16) + 632464211;
                    n4 = n3 ^ 0xACD8B5A3;
                    int cfr_ignored_42 = (Integer.rotateLeft(0x877D7FB1 ^ n3, 3) + 1821382058) * -2021818447;
                    int cfr_ignored_43 = (int)(0x45CFD18C27D4EB4FL ^ (long)n3 ^ 0x5E68831A2DB9264EL);
                    try {
                        ++n2;
                        if ((0x8E24C3EEC53AE7C9L ^ (long)n3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n4 = (n3 ^ 0xFF2C304F) + -876566501 - -876566501;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n4 = Integer.reverse(Integer.reverse(n3 ^ 0xFF2C304F));
                    }
                    n2 -= 5;
                    continue block33;
                }
                case -664320766: {
                    return n;
                }
            }
            int cfr_ignored_44 = Integer.rotateLeft(0x3192756C ^ n3, 9) - 85579599;
            n4 = n3 ^ 0xFF2C304F ^ 0x6711C48D ^ 0x6711C48D;
        }
    }

    private void tqr(btt btt2) {
        int n = wk.ttd_3(-504916303);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 13);
        btt btt3 = btt2;
        n = (btt3 != null ? System.identityHashCode(btt3) : 0) ^ n;
        int n2 = n ^ 0x698F2747;
        if ((n2 ^ n) != 1770989383) {
            int cfr_ignored_0 = (Integer.rotateRight(0x8868B1F6 ^ n, 4) - -1995756539) * -2006404617;
        }
        this.zthm();
    }

    private static String thbt(String string, int n, int n2, int n3) {
        int n4 = wk.ttd_3(-1577334640);
        String string2 = string;
        n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 11);
        int n5 = n4 ^ 0x54F73D6C;
        if ((n5 ^ n4) != 1425489260) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xF50CF5FC ^ n4, 17) - -1326487361) * -183699971;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x7536561) + dhaa ^ Integer.reverse(n2 + i * -1688228727), 23) - thhz_2);
        }
        return new String(cArray);
    }

    private static void zwkh_2(thd_6 thd2_2) {
        int n = -1022679975;
        int n2 = (n = Integer.rotateLeft(n * 89416993, 17) ^ 0x24695D62) ^ 0x54870C09;
        if ((n2 ^ n) != 1418136585) {
            int cfr_ignored_0 = (0x978C2850 ^ n) - 1195653979;
        }
        thd2_2.azs();
    }

    private static double shdn_2(double d) {
        block0: {
            int n = -465560465;
            int n2 = (n = Integer.rotateLeft(n * 1889959445, 16) ^ 0x7E2BC58E) ^ 0xD3F81226;
            if ((n2 ^ n) == -738717146) break block0;
            int cfr_ignored_0 = (0x37B80E49 ^ n) + 1942799053;
        }
        return Math.ceil(d);
    }

    private static float bqr(tay tay2) {
        block0: {
            int n = -103768526;
            n = Integer.rotateLeft(n * 1304420975, 28) ^ 0xBB2AE27A;
            tay tay3 = tay2;
            n = Integer.rotateRight((tay3 != null ? System.identityHashCode(tay3) : 0) ^ n, 24);
            int n2 = n ^ 0x8A678D01;
            if ((n2 ^ n) == -1972925183) break block0;
            int cfr_ignored_0 = (0x73B71333 ^ n) + 501213635;
        }
        return tay2.thw_5();
    }

    private static class_2248 ql(class_2680 class_26802) {
        block0: {
            int n = wk.ttd_3(-1644358552);
            int n2 = n ^ 0xC943236B;
            if ((n2 ^ n) == -918346901) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x54BE3703 ^ n, 13) + 1197885592;
        }
        return class_26802.method_26204();
    }

    private static class_243 djt_4(class_2338 class_23382) {
        block0: {
            int n = 2123493164;
            n = Integer.rotateLeft(n * 499320219, 7) ^ 0xD8DD8AB9;
            class_2338 class_23383 = class_23382;
            n = Integer.rotateRight((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 11);
            int n2 = n ^ 0xC001D623;
            if ((n2 ^ n) == -1073621469) break block0;
            int cfr_ignored_0 = (0xBE90390F ^ n) - -96260026;
        }
        return class_23382.method_46558();
    }

    private static boolean tzn_4(thd_6 thd2_2, class_2338 class_23382) {
        block0: {
            int n = 1056528927;
            n = Integer.rotateLeft(n * -836022135, 7) ^ 0xB265B858;
            thd_6 thd3_2 = thd2_2;
            n = Integer.rotateLeft((thd3_2 != null ? System.identityHashCode(thd3_2) : 0) ^ n, 12);
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0x3BDB9A58;
            if ((n2 ^ n) == 1004247640) break block0;
            int cfr_ignored_0 = (0x522C047 ^ n) - 1505408874;
        }
        return thd2_2.khghk(class_23382);
    }

    private static boolean thka(class_1297 class_12972) {
        block0: {
            int n = wk.ttd_3(2093055083);
            int n2 = n ^ 0xE6A5FD0B;
            if ((n2 ^ n) == -425329397) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x9A648160 ^ n, 6) + -1232516645;
        }
        return class_12972.method_5805();
    }

    private static boolean bfr(badh_2 badh2) {
        block0: {
            int n = -929407283;
            n = Integer.rotateLeft(n * 1442940873, 7) ^ 0xA2770C07;
            badh_2 badh3 = badh2;
            n = (badh3 != null ? System.identityHashCode(badh3) : 0) ^ n;
            int n2 = n ^ 0xE3AF8007;
            if ((n2 ^ n) == -475037689) break block0;
            int cfr_ignored_0 = (0x2B35DECA ^ n) - 734887636;
        }
        return badh2.shzl();
    }

    private static boolean sdn_2(badh_2 badh2) {
        block0: {
            int n = wk.ttd_3(564959563);
            badh_2 badh3 = badh2;
            n = (badh3 != null ? System.identityHashCode(badh3) : 0) ^ n;
            int n2 = n ^ 0xBB003BAC;
            if ((n2 ^ n) == -1157612628) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x9AACA2E7 ^ n, 6) - -1085974220;
        }
        return badh2.shzl();
    }

    private static boolean jfj(badh_2 badh2) {
        block0: {
            int n = 149027549;
            n = Integer.rotateLeft(n * -456908281, 3) ^ 0x568F2547;
            badh_2 badh3 = badh2;
            n = (badh3 != null ? System.identityHashCode(badh3) : 0) ^ n;
            int n2 = n ^ 0xF4D878E7;
            if ((n2 ^ n) == -187139865) break block0;
            int cfr_ignored_0 = (0xFC39823A ^ n) - 1854741842;
        }
        return badh2.shzl();
    }

    private static class_243 jsr_2(class_238 class_2383) {
        block0: {
            int n = 270653538;
            int n2 = (n = Integer.rotateLeft(n * -549965061, 9) ^ 0x309911B4) ^ 0x9615E8B1;
            if ((n2 ^ n) == -1776949071) break block0;
            int cfr_ignored_0 = (0x863430D3 ^ n) + 460548534;
        }
        return class_2383.method_1005();
    }

    private static class_1661 ass_2(class_746 class_7462) {
        block0: {
            int n = -923392080;
            n = Integer.rotateLeft(n * -709729873, 18) ^ 0xA1AEF049;
            class_746 class_7463 = class_7462;
            n = Integer.rotateLeft((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 15);
            int n2 = n ^ 0xCB1D3C3;
            if ((n2 ^ n) == 212980675) break block0;
            int cfr_ignored_0 = (0xC447F473 ^ n) - 573752033;
        }
        return class_7462.method_31548();
    }

    private static class_1792 afd_2(class_1799 class_17992) {
        block0: {
            int n = -300976175;
            n = Integer.rotateLeft(n * -1047932951, 13) ^ 0x8E6BAB18;
            class_1799 class_17993 = class_17992;
            n = Integer.rotateLeft((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 26);
            int n2 = n ^ 0xD4482C1C;
            if ((n2 ^ n) == -733467620) break block0;
            int cfr_ignored_0 = (0x3A475BCD ^ n) + 276469946;
        }
        return class_17992.method_7909();
    }

    private static class_238 khqb(class_1297 class_12972) {
        block0: {
            int n = 823941919;
            n = Integer.rotateLeft(n * -54933239, 11) ^ 0x7CFBD3EF;
            class_1297 class_12973 = class_12972;
            n = Integer.rotateLeft((class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n, 10);
            int n2 = n ^ 0x55767919;
            if ((n2 ^ n) == 1433827609) break block0;
            int cfr_ignored_0 = (0x646A2206 ^ n) + 394256400;
        }
        return class_12972.method_5829();
    }

    private static class_243 shthsh(class_238 class_2383) {
        block0: {
            int n = -1179197085;
            int n2 = (n = Integer.rotateLeft(n * -1054818067, 20) ^ 0x5EFF41CC) ^ 0xFE8FB92A;
            if ((n2 ^ n) == -24135382) break block0;
            int cfr_ignored_0 = (0x47395849 ^ n) + -1870659394;
        }
        return class_2383.method_1005();
    }

    private static class_243 hm_2(class_746 class_7462) {
        block0: {
            int n = wk.ttd_3(-2043176524);
            class_746 class_7463 = class_7462;
            n = Integer.rotateLeft((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 21);
            int n2 = n ^ 0x9456212;
            if ((n2 ^ n) == 155542034) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x8F72FBA6 ^ n, 4) - 1665800277;
        }
        return class_7462.method_33571();
    }

    private static class_3965 tfb_2(class_638 class_6382, class_3959 class_39592) {
        block0: {
            int n = wk.ttd_3(-185588019);
            int n2 = n ^ 0x62B3B585;
            if ((n2 ^ n) == 1655944581) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x96439348 ^ n, 5) + 915174643;
        }
        return class_6382.method_17742(class_39592);
    }

    private static class_1799 thjh(class_1661 class_16612, int n) {
        block0: {
            int n2 = 1983984639;
            n2 = Integer.rotateLeft(n2 * -1174657899, 18) ^ 0x5EB95A5C;
            int n3 = (n2 = n ^ n2) ^ 0xBBE236BB;
            if ((n3 ^ n2) == -1142802757) break block0;
            int cfr_ignored_0 = (0xCDA30544 ^ n2) + 2054793528;
        }
        return class_16612.method_5438(n);
    }

    private static class_1661 ddhb(class_746 class_7462) {
        block0: {
            int n = wk.ttd_3(1822107284);
            int n2 = n ^ 0x120F50C;
            if ((n2 ^ n) == 18937100) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x6DBBD398 ^ n, 16) + 1310473891) * 1841025945;
        }
        return class_7462.method_31548();
    }

    private static String[] ln(String string) {
        block0: {
            int n = 2082951655;
            int n2 = (n = Integer.rotateLeft(n * -20487217, 5) ^ 0x87ADCBC3) ^ 0xE34EC525;
            if ((n2 ^ n) == -481376987) break block0;
            int cfr_ignored_0 = (0x9F6994C2 ^ n) - 1671201568;
        }
        return string.split("\u0002\u0010", -1);
    }

    private static CallSite khza(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1617897587;
            n3 = Integer.rotateLeft(n3 * -810990287, 21) ^ 0xDD1B7989;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 5);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 6);
            int n4 = n3 ^ 0xED35F149;
            if ((n4 ^ n3) != -315231927) {
                int cfr_ignored_0 = (0x8D5AD93A ^ n3) - 821388864;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ dhlth ^ string.hashCode() ^ n2 + khhj + i * 1010955761) + dhlth) ^ khhj));
            }
            String[] stringArray = thd_6.ln(new String(cArray));
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

    private static String[] tsp5682lvmw(String string) {
        return string.split("\b\u0012", -1);
    }

    private static CallSite korvumpx88n2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ by69h1ae1ji ^ string.hashCode()) + (n2 + i3m9a4e2j28) + i ^ by69h1ae1ji, 10) + i3m9a4e2j28);
            }
            String[] stringArray = thd_6.tsp5682lvmw(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

