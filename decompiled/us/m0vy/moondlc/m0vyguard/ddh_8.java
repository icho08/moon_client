/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2478
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.minecraft.class_1657;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2478;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_638;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.bsq_2;
import us.m0vy.moondlc.m0vyguard.bda_4;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.byl;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tbd_2;
import us.m0vy.moondlc.m0vyguard.tkha_2;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.sw;
import us.m0vy.moondlc.m0vyguard.ghs;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.ld;
import us.m0vy.moondlc.m0vyguard.yf;

public abstract class ddh_8
extends bda_4 {
    public final byl zsb = new byl(this, "Blocks").zz_2(class_2246.field_10540);
    public final badh_2 thta = new badh_2(this, "Only St".concat("anding")).bts(true);
    public final khd hta = new khd(this, "Trap Mode");
    public final fy san_2 = new fy(this.hta, "Full");
    public final fy swk = new fy(this.hta, "Legs");
    public final fy thghsh = new fy(this.hta, "Head");
    public final badh_2 zra_2 = new badh_2(this, "Trap ".concat("Predict")).bts(false);
    public final tay hnth = new tay((hy)this, "Predict Ticks", this::sf).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(-754985097 - -1847601289)).rkh_3(Float.intBitsToFloat(0x16DDEA95 ^ 0x2B112658)).ssd_5(2.0f);
    public final badh_2 dzb_2 = new badh_2((hy)this, "Pred".concat("ict Sort"), this::haa_2).bts(true);
    private static final int zkt_2 = -367395590;
    private static final int shsha_2 = -2116397661;
    private static final int dhzz_2 = 1153683013;
    private static final int ran = -1721079749;
    private static final int jheeao6 = -1269214061;
    private static final int n28b63vza0 = -1966247596;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int mjo07exszkiydn;

    public ddh_8() {
        List list = this.dty();
        if (list.contains(this.zsb) && list.contains(this.hgha) && list.contains(this.tkhy)) {
            list.remove(this.hgha);
            list.remove(this.tkhy);
            int n = list.indexOf(this.zsb);
            if (n != -1) {
                list.add(n + 1, this.hgha);
                list.add(n + 2, this.tkhy);
            }
        }
    }

    public List ssr_3() {
        return this.zsb.tzs_8();
    }

    public List dzth_4(class_1657 class_16572) {
        Object object3;
        Object object2;
        class_310 class_3102 = class_310.method_1551();
        class_746 class_7462 = class_3102.field_1724;
        ArrayList arrayList = new ArrayList();
        if (class_7462 == null || class_3102.field_1687 == null) {
            return arrayList;
        }
        if (class_16572 == class_7462 && class_7462.method_24828() && this.thta.shzl()) {
            return arrayList;
        }
        class_238 class_2383 = class_16572.method_5829();
        if (!class_16572.method_24828()) {
            class_16572.method_5857(new class_238(class_2383.field_1323, class_2383.field_1322, class_2383.field_1321, class_2383.field_1320, class_2383.field_1325 - 0.5, class_2383.field_1324));
        }
        class_243 class_2432 = class_16572.method_19538();
        if (class_16572 != class_7462 && this.zra_2.shzl()) {
            class_2432 = ghs.hhd_3(class_16572, this.hnth.thw_5());
        }
        arrayList.addAll(this.att_2(class_2432));
        if (class_16572 == class_7462) {
            object2 = ghs.dhzl_2((class_1657)class_7462, 0.5f);
            arrayList.sort(new bsq_2((double[])object2));
        } else if (class_16572 != class_7462 && this.zra_2.shzl() && this.dzb_2.shzl()) {
            double d;
            double d2 = class_16572.method_23317() - class_16572.field_6014;
            object3 = new class_243(d2, 0.0, d = class_16572.method_23321() - class_16572.field_5969);
            if (object3.method_1027() > 1.0E-5) {
                arrayList.sort(new tbd_2(class_16572.method_19538(), object3.method_1029()));
            } else {
                arrayList.sort(new ld());
            }
        } else {
            arrayList.sort(new ld());
        }
        object2 = this.thzj(class_16572, class_2432);
        HashSet<Object> hashSet = new HashSet<Object>();
        this.btm(arrayList, class_16572, class_2432, hashSet, (List)object2);
        class_243 class_2433 = class_3102.field_1724.method_33571();
        block0: for (Object object3 : arrayList) {
            Iterator iterator = object2.iterator();
            while (iterator.hasNext()) {
                class_2338 class_23382 = (class_2338)iterator.next();
                if (!this.rrt(class_2433, object3.method_46558(), class_23382)) continue;
                hashSet.add(object3);
                continue block0;
            }
        }
        if (!hashSet.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            object3 = new ArrayList();
            for (class_2338 class_23382 : arrayList) {
                if (hashSet.contains(class_23382)) {
                    arrayList2.add(class_23382);
                    continue;
                }
                object3.add(class_23382);
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
            arrayList.addAll(object3);
        }
        if (!class_16572.method_24828()) {
            class_16572.method_5857(class_2383);
        }
        return arrayList;
    }

    public boolean shhl_2(class_1657 class_16572) {
        List list = this.dzth_4(class_16572);
        if (!list.isEmpty()) {
            return this.dhfa(list, this.zsb.tzs_8());
        }
        return false;
    }

    private List att_2(class_243 class_2432) {
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        List list = this.dshz_2(class_2432);
        List list2 = this.daa(class_2432);
        for (class_2338 class_23382 : list) {
            arrayList.add(class_23382.method_10074());
        }
        if (this.hta.dhbn("Full") || this.hta.dhbn("Legs")) {
            arrayList.addAll(list2);
        }
        if (this.hta.dhbn("Full") || this.hta.dhbn("Head")) {
            for (class_2338 class_23382 : list2) {
                arrayList.add(class_23382.method_10084());
            }
        }
        for (class_2338 class_23382 : list) {
            arrayList.add(class_23382.method_10086(2));
        }
        return arrayList.stream().distinct().toList();
    }

    private List dshz_2(class_243 class_2432) {
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        double d = class_2432.method_10216() - Math.floor(class_2432.method_10216());
        double d2 = class_2432.method_10215() - Math.floor(class_2432.method_10215());
        int n = this.hqh_2(d);
        int n2 = this.hqh_2(d2);
        class_2338 class_23382 = this.tmr_2(class_2432);
        arrayList.add(class_23382);
        for (int i = 0; i <= Math.abs(n); ++i) {
            for (int j = 0; j <= Math.abs(n2); ++j) {
                int n3 = i * n;
                int n4 = j * n2;
                arrayList.add(class_23382.method_10069(n3, 0, n4));
            }
        }
        return arrayList.stream().distinct().toList();
    }

    private List daa(class_243 class_2432) {
        int n;
        class_2338 class_23382 = class_2338.method_49637((double)class_2432.method_10216(), (double)class_2432.method_10214(), (double)class_2432.method_10215());
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        double d = Math.abs(class_2432.method_10216()) - Math.floor(Math.abs(class_2432.method_10216()));
        double d2 = Math.abs(class_2432.method_10215()) - Math.floor(Math.abs(class_2432.method_10215()));
        int n2 = this.shshd(d, false);
        int n3 = this.shshd(d, true);
        int n4 = this.shshd(d2, false);
        int n5 = this.shshd(d2, true);
        for (n = 1; n < n2 + 1; ++n) {
            arrayList.add(this.rsk_2(class_23382, n, 0.0, 1 + n4));
            arrayList.add(this.rsk_2(class_23382, n, 0.0, -(1 + n5)));
        }
        for (n = 0; n <= n3; ++n) {
            arrayList.add(this.rsk_2(class_23382, -n, 0.0, 1 + n4));
            arrayList.add(this.rsk_2(class_23382, -n, 0.0, -(1 + n5)));
        }
        for (n = 1; n < n4 + 1; ++n) {
            arrayList.add(this.rsk_2(class_23382, 1 + n2, 0.0, n));
            arrayList.add(this.rsk_2(class_23382, -(1 + n3), 0.0, n));
        }
        for (n = 0; n <= n5; ++n) {
            arrayList.add(this.rsk_2(class_23382, 1 + n2, 0.0, -n));
            arrayList.add(this.rsk_2(class_23382, -(1 + n3), 0.0, -n));
        }
        return arrayList.stream().distinct().toList();
    }

    private class_2338 tmr_2(class_243 class_2432) {
        int n = 888842174;
        n = Integer.rotateLeft(n * 542978577, 17) ^ 0xD3A0D602;
        n = System.identityHashCode(this) ^ n;
        class_243 class_2433 = class_2432;
        n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
        int n2 = n ^ 0x34966FD;
        if ((n2 ^ n) != 55142141) {
            int cfr_ignored_0 = (0x37B3C143 ^ n) - 2060727380;
        }
        if (ddh_8.tzj_3()) {
            throw null;
        }
        double d = class_2432.method_10214() - Math.floor(class_2432.method_10214()) > Double.longBitsToDouble(0xEB7EA1111556A031L ^ 0xD49738888CCF39ABL) ? Math.floor(ddh_8.ara_2(class_2432)) + 1.0 : Math.floor(class_2432.method_10214());
        return new class_2338(ddh_8.tbs_3(ddh_8.dhwa(class_2432)), (int)d, class_3532.method_15357((double)ddh_8.dtk_2(class_2432)));
    }

    private int hqh_2(double d) {
        int n = -1322958399;
        int n2 = (n = Integer.rotateLeft(n * 178648023, 16) ^ 0xA8DD18BB) ^ 0x82C1BB67;
        if ((n2 ^ n) != -2101232793) {
            int cfr_ignored_0 = (0x33E4FAA6 ^ n) + -1968312381;
        }
        if (!ddh_8.khar_2()) {
            ddh_8.bhz();
            throw null;
        }
        return d >= Double.longBitsToDouble(0x9E86A2A257448DD4L ^ 0xA160C4C43122EBB2L) ? 1 : (d <= Double.longBitsToDouble(0x1D2EAD661EB3A021L ^ 0x22FD9E552D809312L) ? -1 : 0);
    }

    private int shshd(double d, boolean bl) {
        try {
            int n = -184466347;
            n = Integer.rotateLeft(n * -1169113163, 12) ^ 0xCEB8A79C;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 21);
            int n2 = n ^ 0xA0EA73A;
            if ((n2 ^ n) != 168732474) {
                int cfr_ignored_0 = (0xFF0FE36F ^ n) + -343375039;
            }
            if ((0x394 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (ddh_8.dkhs_4()) {
            throw null;
        }
        if (bl) {
            return d <= Double.longBitsToDouble(0x875626945F7C8999L ^ 0xB88515A76C4FBAAAL) ? 1 : 0;
        }
        return d >= ddh_8.sbd_2(0xFB85B0646A21A463L ^ 0xC463D6020C47C205L) ? 1 : 0;
    }

    private class_2338 rsk_2(class_2338 class_23382, double d, double d2, double d3) {
        try {
            int n = -1660734784;
            n = Integer.rotateLeft(n * 1318709817, 23) ^ 0xF31B53BE;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 11);
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 7);
            int n2 = n ^ 0xBFA20CFE;
            if ((n2 ^ n) != -1079898882) {
                int cfr_ignored_0 = (0x22A13E3E ^ n) - -1022864998;
            }
            if ((0x25E & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (ddh_8.ztk_2(class_23382) < 0) {
            d = -d;
        }
        if (class_23382.method_10264() < 0) {
            d2 = -d2;
        }
        if (class_23382.method_10260() < 0) {
            d3 = -d3;
        }
        return ddh_8.khyd_2(class_23382, (int)d, (int)d2, (int)d3);
    }

    private void btm(List list, class_1657 class_16572, class_243 class_2432, HashSet hashSet, List list2) {
        class_2338 class_23382;
        int n;
        Object object2;
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1687 == null || class_3102.field_1724 == null) {
            return;
        }
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        double d = class_2432.method_10214();
        double d2 = d - Math.floor(d);
        int n2 = (int)(d2 > 0.8 ? Math.floor(d) + 1.0 : Math.floor(d)) + 2;
        for (Object object2 : list) {
            if (object2.method_10264() < n2) continue;
            arrayList.add((class_2338)object2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        class_243 class_2433 = class_3102.field_1724.method_33571();
        arrayList.sort((arg_0, arg_1) -> ddh_8.hwd(class_2433, arg_0, arg_1));
        object2 = new HashSet();
        class_2338 class_23383 = class_2338.method_49637((double)class_2432.method_10216(), (double)class_2432.method_10214(), (double)class_2432.method_10215());
        int n3 = 6;
        for (n = -n3; n <= n3; ++n) {
            for (int i = -3; i <= 4; ++i) {
                for (int j = -n3; j <= n3; ++j) {
                    int n4;
                    Object object3 = class_23383.method_10069(n, i, j);
                    class_2338 class_23384 = class_3102.field_1687.method_8320((class_2338)object3);
                    int n5 = n4 = class_23384.method_26204() instanceof class_2478 || class_23384.method_26204().getClass().getSimpleName().contains("SignBlock") || class_23384.method_26204().getClass().getSimpleName().contains("Sign") ? 1 : 0;
                    if (class_23384.method_26215() || class_23384.method_45474() || n4 != 0) continue;
                    ((HashSet)object2).add(object3);
                }
            }
        }
        HashSet hashSet2 = new HashSet(list);
        do {
            n = 0;
            block5: for (Object object3 : list) {
                if (((HashSet)object2).contains(object3)) continue;
                for (Object object4 : class_2350.values()) {
                    class_23382 = object3.method_10093((class_2350)object4);
                    if (!((HashSet)object2).contains(class_23382)) continue;
                    ((HashSet)object2).add(object3);
                    n = 1;
                    continue block5;
                }
            }
        } while (n != 0);
        ArrayList arrayList2 = new ArrayList();
        for (class_2338 class_23384 : arrayList) {
            class_2338 class_23385;
            Object object4;
            if (((HashSet)object2).contains(class_23384)) continue;
            LinkedList<class_2338> linkedList = new LinkedList<class_2338>();
            HashMap<class_2338, class_2338> hashMap = new HashMap<class_2338, class_2338>();
            object4 = new HashSet();
            linkedList.add(class_23384);
            ((HashSet)object4).add(class_23384);
            class_23382 = null;
            while (!linkedList.isEmpty()) {
                class_2338 class_23386 = (class_2338)linkedList.poll();
                if (((HashSet)object2).contains(class_23386)) {
                    class_23382 = class_23386;
                    break;
                }
                class_23385 = (class_2338)class_2350.values().clone();
                class_2338 class_23387 = class_3102.field_1724.method_33571();
                Arrays.sort(class_23385, (arg_0, arg_1) -> ddh_8.tkj_2((class_243)class_23387, class_23386, arg_0, arg_1));
                for (class_2338 class_23388 : class_23385) {
                    boolean bl;
                    double d3;
                    class_2338 class_23389 = class_23386.method_10093((class_2350)class_23388);
                    if (((HashSet)object4).contains(class_23389) || this.thhdh(class_23389) || (d3 = class_3102.field_1724.method_33571().method_1025(class_23389.method_46558())) > (double)(this.dhmd.thw_5() * this.dhmd.thw_5())) continue;
                    boolean bl2 = class_3102.field_1687.method_8320(class_23389).method_26215() || class_3102.field_1687.method_8320(class_23389).method_45474();
                    boolean bl3 = bl = hashSet2.contains(class_23389) || arrayList2.contains(class_23389);
                    if (!bl2 && !bl) continue;
                    ((HashSet)object4).add(class_23389);
                    hashMap.put(class_23389, class_23386);
                    linkedList.add(class_23389);
                }
            }
            if (class_23382 == null) continue;
            boolean bl = false;
            for (class_2338 class_23387 : list2) {
                if (!this.rrt(class_2433, class_23384.method_46558(), class_23387)) continue;
                bl = true;
                break;
            }
            class_23385 = class_23382;
            while (class_23385 != null) {
                if (bl) {
                    hashSet.add(class_23385);
                }
                if (!(hashSet2.contains(class_23385) || arrayList2.contains(class_23385) || ((HashSet)object2).contains(class_23385))) {
                    arrayList2.add(class_23385);
                }
                ((HashSet)object2).add(class_23385);
                class_23385 = (class_2338)hashMap.get(class_23385);
            }
        }
        list.addAll(arrayList2);
    }

    private boolean thhdh(class_2338 class_23382) {
        int n = 17085405;
        n = Integer.rotateLeft(n * 1815364607, 15) ^ 0xFAC1D5B;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x5F73301F;
        if ((n2 ^ n) != 1601384479) {
            int cfr_ignored_0 = (0x5E7783C2 ^ n) + -1634647049;
        }
        class_310 class_3102 = ddh_8.bhy();
        if (class_3102.field_1687 == null) {
            return false;
        }
        class_238 class_2383 = new class_238(class_23382);
        for (class_1657 class_16572 : ddh_8.hfl(class_3102.field_1687)) {
            if (ddh_8.tft(class_16572) || !ddh_8.htr_2(class_16572) || !class_2383.method_994(class_16572.method_5829())) continue;
            return true;
        }
        return false;
    }

    private List thzj(class_1657 class_16572, class_243 class_2432) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        sw sw2 = sw.snd_3();
        if (!sw2.rgha_2()) {
            return arrayList;
        }
        ArrayList<class_2338> arrayList2 = new ArrayList<class_2338>();
        ArrayList<class_2338> arrayList3 = new ArrayList<class_2338>();
        if (sw2.sdhsh.shzl()) {
            arrayList2.addAll(this.dshz_2(class_2432));
            arrayList3.addAll(this.daa(class_2432));
        } else {
            double d = class_2432.method_10214() - Math.floor(class_2432.method_10214());
            int n = d > 0.8 ? (int)Math.floor(class_2432.method_10214()) + 1 : (int)Math.floor(class_2432.method_10214());
            class_2338 class_23382 = new class_2338((int)Math.floor(class_2432.method_10216()), n, (int)Math.floor(class_2432.method_10215()));
            arrayList2.add(class_23382);
            arrayList3.add(class_23382.method_10095());
            arrayList3.add(class_23382.method_10072());
            arrayList3.add(class_23382.method_10078());
            arrayList3.add(class_23382.method_10067());
        }
        boolean bl = sw2.khzy.shzl();
        if (bl) {
            for (class_2338 class_23383 : arrayList2) {
                arrayList.add(class_23383.method_10084());
            }
        } else if (sw2.tb_2.shzl()) {
            for (class_2338 class_23384 : arrayList2) {
                arrayList.add(class_23384.method_10084());
            }
        }
        if (sw2.hsh_6.shzl()) {
            arrayList.addAll(arrayList2);
        }
        if (sw2.rtb.shzl()) {
            arrayList.addAll(arrayList3);
        }
        if (sw2.shth_2.shzl()) {
            for (class_2338 class_23385 : arrayList3) {
                arrayList.add(class_23385.method_10084());
            }
        }
        return arrayList.stream().distinct().toList();
    }

    private boolean rrt(class_243 class_2432, class_243 class_2433, class_2338 class_23382) {
        double d = class_2433.field_1352 - class_2432.field_1352;
        double d2 = class_2433.field_1351 - class_2432.field_1351;
        double d3 = class_2433.field_1350 - class_2432.field_1350;
        double d4 = class_2432.method_1022(class_2433);
        int n = (int)Math.ceil(d4 * 10.0);
        for (int i = 0; i <= n; ++i) {
            double d5 = (double)i / (double)n;
            double d6 = class_2432.field_1352 + d * d5;
            double d7 = class_2432.field_1351 + d2 * d5;
            double d8 = class_2432.field_1350 + d3 * d5;
            if (Math.floor(d6) != (double)class_23382.method_10263() || Math.floor(d7) != (double)class_23382.method_10264() || Math.floor(d8) != (double)class_23382.method_10260()) continue;
            return true;
        }
        return false;
    }

    private static int tkj_2(class_243 class_2432, class_2338 class_23382, class_2350 class_23502, class_2350 class_23503) {
        double d = class_2432.method_1025(class_23382.method_10093(class_23502).method_46558());
        double d2 = class_2432.method_1025(class_23382.method_10093(class_23503).method_46558());
        return Double.compare(d2, d);
    }

    private static int hwd(class_243 class_2432, class_2338 class_23382, class_2338 class_23383) {
        double d = class_2432.method_1025(class_23382.method_46558());
        double d2 = class_2432.method_1025(class_23383.method_46558());
        return Double.compare(d2, d);
    }

    private boolean haa_2() {
        int n = tkha_2.khna(1144164969);
        int n2 = n ^ 0x98801C95;
        if ((n2 ^ n) != -1736434539) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xDCB28EFC ^ n, 14) - -1107497025) * -592277763;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.zra_2.shzl();
    }

    private boolean sf() {
        int n;
        block1: {
            int n2 = 1111217362;
            n2 = Integer.rotateLeft(n2 * -1626066045, 6) ^ 0x6B1F5C38;
            n2 = System.identityHashCode(this) ^ n2;
            int n3 = n2 ^ 0x654C3DD5;
            if ((n3 ^ n2) != 1699495381) {
                int cfr_ignored_0 = (0x2777E907 ^ n2) - -247181080;
            }
            n = !this.zra_2.shzl() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x3522;
        }
        return n != 0;
    }

    private static String shs_4(String string, int n, int n2, int n3) {
        int n4 = 309212335;
        n4 = Integer.rotateLeft(n4 * -620020767, 8) ^ 0xD7963F77;
        String string2 = string;
        n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 2);
        int n5 = (n4 = n ^ n4) ^ 0xDFA6B126;
        if ((n5 ^ n4) != -542723802) {
            int cfr_ignored_0 = (0xCDC88589 ^ n4) - -30559729;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xE15D728E ^ n2 ^ i * -659387187 ^ zkt_2, 20) ^ shsha_2));
        }
        return new String(cArray);
    }

    private static boolean tzj_3() {
        block0: {
            int n = tkha_2.khna(-543564489);
            int n2 = n ^ 0xB9F62ACD;
            if ((n2 ^ n) == -1175049523) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x666FF7FA ^ n, 15) + 1810671233) * 1718614011;
        }
        return yf.dnkh();
    }

    private static double ara_2(class_243 class_2432) {
        block0: {
            int n = -1019772034;
            n = Integer.rotateLeft(n * -1254778049, 12) ^ 0xDE266795;
            class_243 class_2433 = class_2432;
            n = Integer.rotateRight((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 23);
            int n2 = n ^ 0xD6D763D1;
            if ((n2 ^ n) == -690527279) break block0;
            int cfr_ignored_0 = (0x15E0E0AF ^ n) + 1317743619;
        }
        return class_2432.method_10214();
    }

    private static double dhwa(class_243 class_2432) {
        block0: {
            int n = 1433495182;
            int n2 = (n = Integer.rotateLeft(n * -827416957, 10) ^ 0x8F9E9D10) ^ 0x77965BE4;
            if ((n2 ^ n) == 2006342628) break block0;
            int cfr_ignored_0 = (0x22E73D6A ^ n) - -1862660643;
        }
        return class_2432.method_10216();
    }

    private static int tbs_3(double d) {
        block0: {
            int n = 2000512094;
            n = Integer.rotateLeft(n * -1148738579, 8) ^ 0x452828C;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x258A34EF;
            if ((n2 ^ n) == 629814511) break block0;
            int cfr_ignored_0 = (0x52B750B1 ^ n) - -1735535307;
        }
        return class_3532.method_15357((double)d);
    }

    private static double dtk_2(class_243 class_2432) {
        block0: {
            int n = -1959776175;
            int n2 = (n = Integer.rotateLeft(n * -1811520567, 20) ^ 0x5647CF13) ^ 0xBC91B9CA;
            if ((n2 ^ n) == -1131300406) break block0;
            int cfr_ignored_0 = (0x37A1899B ^ n) - -720601277;
        }
        return class_2432.method_10215();
    }

    private static boolean khar_2() {
        block0: {
            int n = -2027992150;
            int n2 = (n = Integer.rotateLeft(n * 146740767, 10) ^ 0xF0030034) ^ 0x19DA7732;
            if ((n2 ^ n) == 433747762) break block0;
            int cfr_ignored_0 = (0x9EC53C98 ^ n) - 1996300634;
        }
        return yf.khdha_2();
    }

    private static void bhz() {
        int n = -479994887;
        int n2 = (n = Integer.rotateLeft(n * -541219531, 16) ^ 0xDC47519E) ^ 0x9F920ED4;
        if ((n2 ^ n) != -1617817900) {
            int cfr_ignored_0 = (0x7CF1D52D ^ n) + -54048631;
        }
        yf.athz_2();
    }

    private static boolean dkhs_4() {
        block0: {
            int n = 427018312;
            int n2 = (n = Integer.rotateLeft(n * 1440005909, 28) ^ 0x43ED2E1F) ^ 0x326B0C4C;
            if ((n2 ^ n) == 845876300) break block0;
            int cfr_ignored_0 = (0x2B18C404 ^ n) - -1215064046;
        }
        return yf.dnkh();
    }

    private static double sbd_2(long l) {
        block0: {
            int n = 1938833576;
            n = Integer.rotateLeft(n * 1268940673, 11) ^ 0x5E4BE62C;
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 22)) ^ 0x6C16B0E5;
            if ((n2 ^ n) == 1813426405) break block0;
            int cfr_ignored_0 = (0x1F86F04D ^ n) - -2088434760;
        }
        return Double.longBitsToDouble(l);
    }

    private static int ztk_2(class_2338 class_23382) {
        block0: {
            int n = -1539872464;
            int n2 = (n = Integer.rotateLeft(n * -1998428745, 25) ^ 0x593C17D7) ^ 0x6F368C89;
            if ((n2 ^ n) == 1865845897) break block0;
            int cfr_ignored_0 = (0xCB01E5B9 ^ n) - -1831589697;
        }
        return class_23382.method_10263();
    }

    private static class_2338 khyd_2(class_2338 class_23382, int n, int n2, int n3) {
        block0: {
            int n4 = -799075980;
            n4 = Integer.rotateLeft(n4 * 1395756311, 21) ^ 0x6DA0C202;
            class_2338 class_23383 = class_23382;
            n4 = Integer.rotateLeft((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n4, 23);
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 20)) ^ 0x246A1956;
            if ((n5 ^ n4) == 610933078) break block0;
            int cfr_ignored_0 = (0xF4350822 ^ n4) + -2118320244;
        }
        return class_23382.method_10069(n, n2, n3);
    }

    private static class_310 bhy() {
        block0: {
            int n = 1150108126;
            int n2 = (n = Integer.rotateLeft(n * 1747743139, 7) ^ 0xD5AF0004) ^ 0xF49C02D7;
            if ((n2 ^ n) == -191102249) break block0;
            int cfr_ignored_0 = (0xB0114309 ^ n) + 1691540629;
        }
        return class_310.method_1551();
    }

    private static List hfl(class_638 class_6382) {
        block0: {
            int n = tkha_2.khna(-559727965);
            int n2 = n ^ 0xC8E201D1;
            if ((n2 ^ n) == -924712495) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x16413B72 ^ n, 5) + -1237069303) * 373373811;
        }
        return class_6382.method_18456();
    }

    private static boolean tft(class_1657 class_16572) {
        block0: {
            int n = 1149196844;
            n = Integer.rotateLeft(n * -889215089, 20) ^ 0x19059BE5;
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0x39948E1B;
            if ((n2 ^ n) == 966037019) break block0;
            int cfr_ignored_0 = (0x7DEBD437 ^ n) + -1612112848;
        }
        return class_16572.method_7325();
    }

    private static boolean htr_2(class_1657 class_16572) {
        block0: {
            int n = tkha_2.khna(51782560);
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0x86F8E89B;
            if ((n2 ^ n) == -2030507877) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x85EECB3B ^ n, 3) + 1011366752) * -2047947973;
        }
        return class_16572.method_5805();
    }

    private static String[] zhy_3(String string) {
        block0: {
            int n = 1107895700;
            n = Integer.rotateLeft(n * -743311565, 21) ^ 0xD929FF5E;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 26);
            int n2 = n ^ 0xA971FA9;
            if ((n2 ^ n) == 177676201) break block0;
            int cfr_ignored_0 = (0x489E3A3D ^ n) - -1801510884;
        }
        return string.split("\u0001\u0015", -1);
    }

    private static CallSite dhf_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -209453641;
            n3 = Integer.rotateLeft(n3 * -2033961107, 8) ^ 0x49A6D64B;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 19);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x89DB3675;
            if ((n4 ^ n3) != -1982122379) {
                int cfr_ignored_0 = (0x7A58CBC2 ^ n3) - -746990018;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dhzz_2 ^ string.hashCode()) + (n2 + ran) + i ^ dhzz_2, 21) + ran);
            }
            String[] stringArray = ddh_8.zhy_3(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] yuetptpcwvtvql(String string) {
        return string.split("\u0002\u001b", -1);
    }

    private static CallSite k5w5bmls4o3b(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ jheeao6 ^ string.hashCode() ^ n2 + n28b63vza0 + i * -1291256457) + jheeao6) ^ n28b63vza0));
            }
            String[] stringArray = ddh_8.yuetptpcwvtvql(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

