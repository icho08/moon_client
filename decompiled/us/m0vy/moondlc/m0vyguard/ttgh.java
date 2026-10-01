/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1074
 *  net.minecraft.class_124
 *  net.minecraft.class_1291
 *  net.minecraft.class_1293
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1541
 *  net.minecraft.class_1542
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1887
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_268
 *  net.minecraft.class_332
 *  net.minecraft.class_3532
 *  net.minecraft.class_640
 *  net.minecraft.class_6880
 *  net.minecraft.class_9288
 *  net.minecraft.class_9304
 *  net.minecraft.class_9334
 *  org.joml.Vector2f
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Stream;
import net.minecraft.class_1074;
import net.minecraft.class_124;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1541;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1887;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_268;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_640;
import net.minecraft.class_6880;
import net.minecraft.class_9288;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import org.joml.Vector2f;
import us.m0vy.moondlc.m0vyguard.bjkh;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.bkhd_2;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.tkht_2;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.dhs_5;
import us.m0vy.moondlc.m0vyguard.zh;
import us.m0vy.moondlc.m0vyguard.ad;
import us.m0vy.moondlc.m0vyguard.qdh;
import us.m0vy.moondlc.m0vyguard.yth;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.mixin.client.accessor.IDrawContextAccessor;

public class ttgh
implements dl {
    private static final float shgha_2 = 7.1f;
    private static final float ztd = 6.8f;
    private static final float hmz = 6.8f;
    private static final float nsh = 6.1f;
    private static final float rjdh = 5.4f;
    private static final float khtsh = 12.0f;
    private static final float djj = 4.0f;
    private static final float sq_2 = 4.0f;
    private static final float dghd_2 = 8.0f;
    private static final float thdm_2 = 4.0f;
    private static final float zdr_2 = 0.8f;
    private static final float dzt_3 = 12.8f;
    private static final float zagh = 2.5f;
    private static final float khzj = 3.5f;
    private static final float skha_3 = 3.5f;
    private static final float dhjf = 125.0f;
    private static final float rkhw = 47.0f;
    private static final float shkhkh = 16.0f;
    private static final float shba = 13.0f;
    private static final float htz_3 = 11.0f;
    private static final float shmth = 0.5f;
    private static final int shtj_2 = 27;
    private static final Map khtth_2;
    private static final Set thdhl;
    private final ad na_2;
    private final List hnsh = new ArrayList();
    private final List dym = new ArrayList();
    private final List hagh = new ArrayList();
    private static final int sssh = 1006663791;
    private static final int zs_2 = -2074244034;
    private static final int zkhz = -1105773141;
    private static final int thqk = 81948576;
    private static final int hiobxku1 = 908361223;
    private static final int dyz870qqjr = -1061452516;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int g9gvhjk0;

    public ttgh(ad ad2) {
        this.na_2 = ad2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void jghn(class_332 class_3322, float f) {
        if (ttgh.mc.field_1687 == null || ttgh.mc.field_1724 == null) {
            return;
        }
        boolean bl = this.na_2.rnz.tzn_3("TNT");
        boolean bl2 = this.na_2.thj_5();
        this.dks_3(bl, bl2);
        dhs_5.dft_3();
        try {
            this.dzf_3(class_3322, f, this.hnsh);
            if (bl) {
                this.dhjz_2(class_3322, f, this.dym);
            }
            if (bl2) {
                this.dtr_4(class_3322, this.hagh);
            }
        }
        finally {
            dhs_5.zlk();
        }
    }

    private void dks_3(boolean bl, boolean bl2) {
        this.hnsh.clear();
        this.dym.clear();
        this.hagh.clear();
        for (class_1297 class_12972 : ttgh.mc.field_1687.method_18112()) {
            class_1309 class_13092;
            if (class_12972 instanceof class_1309 && this.na_2.dths_2((class_1297)(class_13092 = (class_1309)class_12972))) {
                this.hnsh.add(class_13092);
            }
            if (bl && class_12972 instanceof class_1541 && this.na_2.tkha_4((class_1297)(class_13092 = (class_1541)class_12972))) {
                this.dym.add(class_13092);
            }
            if (!bl2 || !(class_12972 instanceof class_1542) || !(class_13092 = (class_1542)class_12972).method_5805()) continue;
            this.hagh.add(class_13092);
        }
    }

    private void dzf_3(class_332 class_3322, float f, List list) {
        list.sort(Comparator.comparingDouble(ttgh::sth));
        for (class_1309 class_13092 : list) {
            yth yth2 = this.sad_8((class_1297)class_13092, f);
            if (yth2 == null) continue;
            if (class_13092 instanceof class_1657) {
                class_1657 class_16572 = (class_1657)class_13092;
                this.khkhs_2(class_3322, class_16572, yth2);
                continue;
            }
            this.ssb_2(class_3322, class_13092, yth2);
        }
    }

    private void khkhs_2(class_332 class_3322, class_1657 class_16572, yth yth2) {
        float f;
        float f2 = this.szd_6((class_1297)class_16572);
        float f3 = yth2.top().x;
        float f4 = yth2.top().y - 12.0f - 2.0f + this.na_2.hkhkh();
        zh zh2 = this.hghgh(class_16572);
        float f5 = zh2.width() + 8.0f;
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_46416(f3, f4, 0.0f);
        class_3322.method_51448().method_22905(f2, f2, 1.0f);
        List list = this.rqf(class_16572);
        if (!list.isEmpty()) {
            f = this.khza_3(list.size());
            this.ns(class_3322, list, -f / 2.0f, -14.8f, true);
        }
        this.sfj_2(class_3322, -f5 / 2.0f, 0.0f, f5, 12.0f, this.na_2.dngh_2(class_16572));
        this.thdt_3(class_3322, zh2.segments(), -f5 / 2.0f + 4.0f, 2.1f);
        f = 14.0f;
        List list2 = this.bbr(class_16572);
        if (!list2.isEmpty()) {
            float f6 = this.khza_3(list2.size());
            this.ns(class_3322, list2, -f6 / 2.0f, f, false);
            f += 14.8f;
        }
        if (this.na_2.ghkhgh()) {
            this.swsh(class_3322, class_16572, 0.0f, f);
        }
        class_3322.method_51448().method_22909();
    }

    private void ssb_2(class_332 class_3322, class_1309 class_13092, yth yth2) {
        float f = this.szd_6((class_1297)class_13092);
        float f2 = yth2.top().x;
        float f3 = yth2.top().y - 12.0f - 2.0f + this.na_2.hkhkh();
        List list = this.shtn(class_13092);
        if (list.isEmpty()) {
            return;
        }
        float f4 = this.hjth(list) + 8.0f;
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_46416(f2, f3, 0.0f);
        class_3322.method_51448().method_22905(f, f, 1.0f);
        this.sfj_2(class_3322, -f4 / 2.0f, 0.0f, f4, 12.0f, false);
        this.thdt_3(class_3322, list, -f4 / 2.0f + 4.0f, 2.1f);
        class_3322.method_51448().method_22909();
    }

    private void dhjz_2(class_332 class_3322, float f, List list) {
        list.sort(Comparator.comparingDouble(ttgh::kh));
        for (class_1541 class_15412 : list) {
            yth yth2 = this.sad_8((class_1297)class_15412, f);
            if (yth2 == null) continue;
            float f2 = this.szd_6((class_1297)class_15412);
            float f3 = yth2.top().x;
            float f4 = yth2.top().y - 12.0f - 2.0f + this.na_2.hkhkh();
            int n = Math.max(0, class_15412.method_6969());
            String string = "TNT [" + (float)n / 20.0f + "s]";
            float f5 = brz_2.thtkh_2.shdf_2(string, 7.1f) + 8.0f;
            class_3322.method_51448().method_22903();
            class_3322.method_51448().method_46416(f3, f4, 0.0f);
            class_3322.method_51448().method_22905(f2, f2, 1.0f);
            this.sfj_2(class_3322, -f5 / 2.0f, 0.0f, f5, 12.0f, false);
            brz_2.thtkh_2.zskh_4(class_3322.method_51448(), string, -f5 / 2.0f + 4.0f, 2.1f, 7.1f, this.na_2.q(), 0.0f);
            class_3322.method_51448().method_22909();
        }
    }

    private void dtr_4(class_332 class_3322, List list) {
        List list2 = this.tykh_2(list);
        list2.sort(Comparator.comparingDouble(ttgh::zkt_3));
        for (qdh qdh2 : list2) {
            Vector2f vector2f = dhs_5.tdhkh(qdh2.twm);
            if (vector2f.x == Float.MAX_VALUE || vector2f.y == Float.MAX_VALUE) continue;
            float f = class_3532.method_15363((float)(1.0f - (float)qdh2.hhd / 20.0f), (float)0.5f, (float)1.0f) * this.na_2.dfs_3();
            List list3 = this.zhth_4(qdh2);
            if (list3.isEmpty()) continue;
            float f2 = this.dhad_4(list3) + 8.0f;
            float f3 = 8.0f + (float)list3.size() * 8.0f;
            List list4 = this.tlr(qdh2);
            class_3322.method_51448().method_22903();
            class_3322.method_51448().method_46416(vector2f.x, vector2f.y + this.na_2.hkhkh(), 0.0f);
            class_3322.method_51448().method_22905(f, f, 1.0f);
            float f4 = 0.0f;
            if (!list4.isEmpty()) {
                f4 = 52.0f;
                this.shtl(class_3322, list4, -62.5f, -f4);
            }
            if (this.na_2.tthdh()) {
                this.azn_2(class_3322, -f2 / 2.0f, 0.0f, f2, f3);
            }
            float f5 = 4.0f;
            for (String string : list3) {
                float f6 = brz_2.ryk.shdf_2(string, 6.8f);
                brz_2.ryk.zskh_4(class_3322.method_51448(), string, -f6 / 2.0f, f5, 6.8f, bas_4.ghss(), 0.0f);
                f5 += 8.0f;
            }
            class_3322.method_51448().method_22909();
        }
    }

    private List tykh_2(List list) {
        if (!this.na_2.dkn_2()) {
            ArrayList<qdh> arrayList = new ArrayList<qdh>();
            for (class_1542 class_15422 : list) {
                arrayList.add(this.ks(List.of(class_15422)));
            }
            return arrayList;
        }
        ArrayList<qdh> arrayList = new ArrayList<qdh>();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (class_1542 class_15423 : list) {
            if (!hashSet.add(class_15423.method_5628())) continue;
            ArrayList<class_1542> arrayList2 = new ArrayList<class_1542>();
            ArrayDeque<class_1542> arrayDeque = new ArrayDeque<class_1542>();
            arrayDeque.add(class_15423);
            arrayList2.add(class_15423);
            while (!arrayDeque.isEmpty()) {
                class_1542 class_15424 = (class_1542)arrayDeque.poll();
                for (class_1542 class_15425 : list) {
                    if (hashSet.contains(class_15425.method_5628()) || !(class_15424.method_5858((class_1297)class_15425) <= 1.0)) continue;
                    hashSet.add(class_15425.method_5628());
                    arrayList2.add(class_15425);
                    arrayDeque.add(class_15425);
                }
            }
            arrayList.add(this.ks(arrayList2));
        }
        return arrayList;
    }

    private qdh ks(List list) {
        class_1542 class_154222;
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        for (class_1542 class_154222 : list) {
            d += class_154222.method_23317();
            d2 += class_154222.method_23318() + class_154222.method_5829().method_17940() + 0.5;
            d3 += class_154222.method_23321();
        }
        int n = list.size();
        class_154222 = new class_243(d / (double)n, d2 / (double)n, d3 / (double)n);
        double d4 = ttgh.mc.field_1724 != null ? ttgh.mc.field_1724.method_19538().method_1022((class_243)class_154222) : 0.0;
        return new qdh(list, (class_243)class_154222, d4);
    }

    private List zhth_4(qdh qdh2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (qdh2.jbb.size() == 1) {
            class_1799 class_17992 = ((class_1542)qdh2.jbb.get(0)).method_6983();
            arrayList.add(this.jmq(class_17992));
            return arrayList;
        }
        for (class_1542 class_15422 : qdh2.jbb) {
            arrayList.add(this.jmq(class_15422.method_6983()));
        }
        return arrayList;
    }

    private String jmq(class_1799 class_17992) {
        Object object;
        int n = -2070314954;
        n = Integer.rotateLeft(n * 1089343579, 27) ^ 0xC860CD06;
        class_1799 class_17993 = class_17992;
        n = Integer.rotateLeft((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 19);
        int n2 = n ^ 0xE36F77F2;
        if ((n2 ^ n) != -479234062) {
            int cfr_ignored_0 = (0x67F6F7C4 ^ n) + 745935624;
        }
        if ((object = class_124.method_539((String)class_17992.method_7964().getString())) == null || ((String)object).isBlank()) {
            object = class_17992.method_7909().toString();
        }
        if (ttgh.dhhq(class_17992) > 1) {
            object = (String)object + " x" + class_17992.method_7947();
        }
        return object;
    }

    private List tlr(qdh qdh2) {
        try {
            int n = 1892639160;
            n = Integer.rotateLeft(n * 1785693141, 7) ^ 0x3898AC9B;
            n = System.identityHashCode(this) ^ n;
            qdh qdh3 = qdh2;
            n = Integer.rotateRight((qdh3 != null ? System.identityHashCode(qdh3) : 0) ^ n, 11);
            int n2 = n ^ 0x1E0EE841;
            if ((n2 ^ n) != 504293441) {
                int cfr_ignored_0 = (0x6EC189F9 ^ n) - 228334561;
            }
            if ((0x36A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!ttgh.dmb()) {
            ttgh.hl_2();
            throw null;
        }
        if (!this.na_2.stha_4() || qdh2.jbb.size() != 1) {
            return ttgh.jds_2();
        }
        class_1799 class_17992 = ((class_1542)qdh2.jbb.get(0)).method_6983();
        class_9288 class_92882 = (class_9288)class_17992.method_57824(class_9334.field_49622);
        if (class_92882 == null) {
            return List.of();
        }
        List list = ttgh.jhh(class_92882).toList();
        return list.isEmpty() ? ttgh.tshkh() : list;
    }

    private void shtl(class_332 class_3322, List list, float f, float f2) {
        float f3;
        int n;
        this.azn_2(class_3322, f, f2, 125.0f, 47.0f);
        float f4 = f + 4.0f;
        float f5 = f2 + 4.0f;
        float f6 = 117.0f;
        float f7 = 39.0f;
        bjgh.jghs.hrj(class_3322.method_51448(), f4, f5, f6, f7, 2.5f, new Color(0, 0, 0, 75));
        Color color = new Color(0, 0, 0, 45);
        for (n = 1; n < 9; ++n) {
            f3 = f4 + (float)n * 13.0f;
            bjgh.jghs.hrj(class_3322.method_51448(), f3, f5, 0.75f, f7, 0.0f, color);
        }
        for (n = 1; n < 3; ++n) {
            f3 = f5 + (float)n * 13.0f;
            bjgh.jghs.hrj(class_3322.method_51448(), f4, f3, f6, 0.75f, 0.0f, color);
        }
        for (n = 0; n < Math.min(list.size(), 27); ++n) {
            class_1799 class_17992 = (class_1799)list.get(n);
            if (class_17992.method_7960()) continue;
            int n2 = n % 9;
            int n3 = n / 9;
            float f8 = f4 + (float)n2 * 13.0f;
            float f9 = f5 + (float)n3 * 13.0f;
            this.bhgh_2(class_3322, class_17992, f8 + 2.5f, f9 + 2.5f, 0.5f);
        }
    }

    private List shtn(class_1309 class_13092) {
        int n = 1818898748;
        n = Integer.rotateLeft(n * 1206840517, 8) ^ 0x1E14A034;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x3DA953B7;
        if ((n2 ^ n) != 1034507191) {
            int cfr_ignored_0 = (0x51C3628B ^ n) + -1333583102;
        }
        if (yf.dnkh()) {
            throw null;
        }
        ArrayList<bkhd_2> arrayList = new ArrayList<bkhd_2>();
        String string = this.hds(class_124.method_539((String)class_13092.method_5476().getString()));
        if ((string == null || ttgh.thghb(string)) && this.na_2.tbh_3()) {
            string = ttgh.zdhz_2(class_13092).getString();
        }
        if (ttgh.btt_2(this.na_2) && string != null && !string.isBlank()) {
            arrayList.add(new bkhd_2(string, brz_2.thtkh_2, Float.intBitsToFloat(315911667 - -772719936), bas_4.ghss()));
        }
        if (ttgh.zhq_2(this.na_2)) {
            if (!arrayList.isEmpty()) {
                arrayList.add(new bkhd_2(" [", brz_2.ryk, Float.intBitsToFloat(1603000848 - 514998390), ttgh.tth_6()));
            } else {
                arrayList.add(new bkhd_2(ttgh.dhlq("㨉", ttgh.twt_4(1362723959) ^ 0x2EC65673, 0x362601F8 ^ 0xD472E20B, Integer.reverse(-1736455975) ^ 0xDDA3C980), brz_2.ryk, Float.intBitsToFloat(-1156541579 + -2050423259), bas_4.shjz()));
            }
            arrayList.add(new bkhd_2(String.valueOf(Math.max(0, ttgh.dan(class_13092.method_6032()))), brz_2.thtkh_2, Float.intBitsToFloat(Integer.reverse(-181902893) ^ 0x8B5F8D35), this.bww(class_13092)));
            if (this.na_2.khns() && class_13092.method_6067() > 0.0f) {
                arrayList.add(new bkhd_2("+" + Math.round(ttgh.bzd_3(class_13092)), brz_2.ryk, Float.intBitsToFloat(-890632326 + 1978634784), new Color(0xEE633BF1 ^ 0xEE633B0E, 1922219110 - 1922218911, Integer.rotateLeft(0x3D1EDB0B ^ 0xB51EDB0B, 7), 0x881223B1 ^ 0x8812234E)));
            }
            arrayList.add(new bkhd_2("]", brz_2.ryk, Float.intBitsToFloat(345212635 - -742789823), ttgh.shkhw()));
        }
        return arrayList;
    }

    private zh hghgh(class_1657 class_16572) {
        String string;
        int n;
        try {
            int n2 = -2084017374;
            n2 = Integer.rotateLeft(n2 * -495980415, 21) ^ 0x84A01E44;
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 12);
            class_1657 class_16573 = class_16572;
            n2 = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n2;
            int n3 = n2 ^ 0xA30ECF30;
            if ((n3 ^ n2) != -1559310544) {
                int cfr_ignored_0 = (0x20C6A412 ^ n2) - -45528069;
            }
            if ((0x227 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        ArrayList<bkhd_2> arrayList = new ArrayList<bkhd_2>();
        boolean bl = ttgh.rdhq(this.na_2, class_16572);
        String string2 = ttgh.zsd_2(this, class_16572);
        if (this.na_2.tbh_3()) {
            arrayList.add(new bkhd_2(string2, brz_2.thtkh_2, Float.intBitsToFloat(0x55903FD6 ^ 0x15730CE5), bl ? ttgh.add_3() : ttgh.bzh()));
        }
        if (this.na_2.dwgh_2()) {
            ttgh.akdh(this, arrayList, class_16572);
        }
        if (this.na_2.bdgh_2()) {
            this.ajq(arrayList);
            arrayList.add(new bkhd_2(String.format("%.1fm", Float.valueOf(ttgh.mc.field_1724.method_5739((class_1297)class_16572))), brz_2.ryk, Float.intBitsToFloat(Integer.reverse(615385218) ^ 0x1C9ECBE), bas_4.ghss()));
        }
        if (this.na_2.khqq() && (n = ttgh.dqw(this, class_16572)) >= 0) {
            this.ajq(arrayList);
            arrayList.add(new bkhd_2(n + " ms", brz_2.ryk, Float.intBitsToFloat(0x58CCB4AE ^ 0x18152D34), bas_4.ghss()));
        }
        if (ttgh.dhgha(this.na_2) && !(string = this.shbz(class_16572)).isBlank()) {
            this.ajq(arrayList);
            arrayList.add(new bkhd_2(string, brz_2.ryk, Float.intBitsToFloat(Integer.rotateLeft(0x2B7B322A ^ 0xE7B7E02C, 21)), this.na_2.q()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new bkhd_2(string2, brz_2.thtkh_2, Float.intBitsToFloat(Integer.rotateLeft(0x79209DDC ^ 0x1F4881BA, 11)), ttgh.ayr()));
        }
        return new zh(arrayList, this.hjth(arrayList));
    }

    private void ttw_3(List list, class_1657 class_16572) {
        int n = 0;
        int n2 = -402266504;
        n2 = Integer.rotateLeft(n2 * 134487205, 8) ^ 0x2255CC10;
        n2 = System.identityHashCode(this) ^ n2;
        List list2 = list;
        n2 = (list2 != null ? System.identityHashCode(list2) : 0) ^ n2;
        int n3 = Integer.reverse(Integer.reverse(n2 ^ 0xD6A86553));
        while (true) {
            block43: {
                block65: {
                    block56: {
                        block58: {
                            block67: {
                                block62: {
                                    block63: {
                                        block50: {
                                            block64: {
                                                block44: {
                                                    block48: {
                                                        block59: {
                                                            block52: {
                                                                block57: {
                                                                    block42: {
                                                                        block51: {
                                                                            block46: {
                                                                                block60: {
                                                                                    block49: {
                                                                                        block66: {
                                                                                            block45: {
                                                                                                block41: {
                                                                                                    block53: {
                                                                                                        block61: {
                                                                                                            block54: {
                                                                                                                block55: {
                                                                                                                    block38: {
                                                                                                                        block47: {
                                                                                                                            block39: {
                                                                                                                                block40: {
                                                                                                                                    if ((n = n3 ^ n2) > -355364787) break block38;
                                                                                                                                    if (n > -1037053343) break block39;
                                                                                                                                    if (n > -1952858564) break block40;
                                                                                                                                    if (n == -2145067836) break block41;
                                                                                                                                    if (n == -1952858564) break block42;
                                                                                                                                    break block43;
                                                                                                                                }
                                                                                                                                if (n == -1630809843) break block44;
                                                                                                                                if (n == -1466717123) break block45;
                                                                                                                                int cfr_ignored_0 = Integer.rotateLeft(0xF050FC40 ^ n2, 17) + 506211067;
                                                                                                                                if (n == -1037053343) break block46;
                                                                                                                                break block43;
                                                                                                                            }
                                                                                                                            if (n > -735182409) break block47;
                                                                                                                            if (n == -871689038) break block48;
                                                                                                                            if (n == -813949219) break block49;
                                                                                                                            if (n == -735182409) break block50;
                                                                                                                            break block43;
                                                                                                                        }
                                                                                                                        if (n == -693607085) break block51;
                                                                                                                        if (n == -395230422) break block52;
                                                                                                                        int cfr_ignored_1 = Integer.rotateRight(0x224F562B ^ n2, 7) + 737742448;
                                                                                                                        if (n == -355364787) break block53;
                                                                                                                        break block43;
                                                                                                                    }
                                                                                                                    if (n > 849817590) break block54;
                                                                                                                    if (n > 13953996) break block55;
                                                                                                                    if (n == 132196) break block56;
                                                                                                                    if (n == 13953996) break block57;
                                                                                                                    break block43;
                                                                                                                }
                                                                                                                if (n == 356481671) break block58;
                                                                                                                if (n == 668777311) break block59;
                                                                                                                if (n == 849817590) break block60;
                                                                                                                break block43;
                                                                                                            }
                                                                                                            if (n > 1366610071) break block61;
                                                                                                            if (n == 946396145) break block62;
                                                                                                            if (n == 1347064071) break block63;
                                                                                                            int cfr_ignored_2 = Integer.rotateRight(0x9848DEA7 ^ n2, 6) - 1966118260;
                                                                                                            if (n == 1366610071) break block64;
                                                                                                            break block43;
                                                                                                        }
                                                                                                        if (n == 1555446955) break block65;
                                                                                                        if (n == 1657585889) break block66;
                                                                                                        if (n == 2096681567) break block67;
                                                                                                        break block43;
                                                                                                    }
                                                                                                    int cfr_ignored_3 = Integer.rotateLeft(0xA3E56B64 ^ n2, 7) - -584736681;
                                                                                                    return;
                                                                                                }
                                                                                                int cfr_ignored_4 = Integer.rotateRight(0x58D5ACE ^ n2, 3) - -1334075859;
                                                                                                if (class_16572.method_6067() > 0.0f) {
                                                                                                    int cfr_ignored_5 = (int)(0xBC8545A22E9A9981L ^ (long)n2 ^ 0x76349186C824D4DBL);
                                                                                                    n3 = n2 ^ 0xDD3921D5;
                                                                                                    int cfr_ignored_6 = (int)(0x8DDF84FB96688089L ^ (long)n2 ^ 0xF487E062FA34B66EL);
                                                                                                    n3 = (n2 ^ 0x32A72FF6) + 893372489 - 893372489;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_7 = (int)(0x835DCE33297F53DAL ^ (long)n2 ^ 0x61169E4D5C92AB6AL);
                                                                                                n3 = (n2 ^ 0xEAD1904D) + 217826599 - 217826599;
                                                                                                n += 5;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_8 = (Integer.rotateLeft(0xBE730898 ^ n2, 10) + 340502947) * -1099757415;
                                                                                            if (class_16572.method_6067() > 0.0f) {
                                                                                                n3 = n2 ^ 0x32A72FF6;
                                                                                                n += 3;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_9 = (int)(0xE832FEB4FDD95FA7L ^ (long)n2 ^ 0x19370144687DB4L);
                                                                                            n3 = n2 ^ 0xEAD1904D;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_10 = Integer.rotateLeft(0x70E6FC80 ^ n2, 17) + -1336528197;
                                                                                        ttgh.snz(this, list);
                                                                                        try {
                                                                                            n += 2;
                                                                                            if ((0xF8073022F5B21931L ^ (long)n2 | 1L) == 0L) {
                                                                                                throw new ArithmeticException();
                                                                                            }
                                                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xCF7C1EDD));
                                                                                        }
                                                                                        catch (ArithmeticException arithmeticException) {
                                                                                            n3 = (int)((long)(n2 ^ 0xCF7C1EDD) ^ 0x5BDE41C7956F43C6L ^ 0x5BDE41C7956F43C6L);
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_11 = Integer.rotateLeft(0x5E479D69 ^ n2, 14) + 1862905586;
                                                                                    int cfr_ignored_12 = (int)(0x9CF5335427D4EB4FL ^ (long)n2 ^ 0x9BD8831A2DB8943BL);
                                                                                    list.add(new bkhd_2(ttgh.tthkh_2(Math.max(0, Math.round(class_16572.method_6032()))), brz_2.thtkh_2, ttgh.skk_2(0xBBBDEB37 ^ 0xFB6472AD), ttgh.rah_2(this, (class_1309)class_16572)));
                                                                                    list.add(new bkhd_2(ttgh.byt_2("꽼㐧", Integer.rotateLeft(0x56353291 ^ 0x507725EB, 24), Integer.reverse(-528372265) ^ 0x7B37F21C, ttgh.khkn(-834552887) ^ 0x4961F99A), brz_2.ryk, Float.intBitsToFloat(-509948607 + 1597951065), bas_4.shjz()));
                                                                                    if (!this.na_2.khns()) {
                                                                                        n3 = n2 ^ 0xB84C92FF ^ 0x63152B7D ^ 0x63152B7D;
                                                                                        int cfr_ignored_13 = (Integer.rotateRight(0xD2051B32 ^ n2, 13) + 1929112137) * -771417293;
                                                                                        n3 = (n2 ^ 0xEAD1904D) + 1043813116 - 1043813116;
                                                                                        continue;
                                                                                    }
                                                                                    try {
                                                                                        ++n;
                                                                                        if ((0x455C810EB4B18D51L ^ (long)n2 | 1L) == 0L) {
                                                                                            throw new IllegalArgumentException();
                                                                                        }
                                                                                        n3 = (n2 ^ 0xA893AC3D) + 179916343 - 179916343;
                                                                                    }
                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                        n3 = (int)((long)(n2 ^ 0xA893AC3D) ^ 0xDEEDC4799CBEA408L ^ 0xDEEDC4799CBEA408L);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_14 = Integer.rotateLeft(0x239903CC ^ n2, 7) - 1407522031;
                                                                                list.add(new bkhd_2(" +" + Math.round(ttgh.rsn(class_16572)), brz_2.ryk, Float.intBitsToFloat(0x44A87996 ^ 0x471E00C), new Color(-661837494 + 661837749, Integer.reverse(-1818577728) ^ 0x32D590E, 1065722843 - 1065722775, Integer.reverse(-524386966) ^ 0x56BE7DF8)));
                                                                                try {
                                                                                    n -= 2;
                                                                                    if ((0x20E799FAC44E5ECDL ^ (long)n2 | 1L) == 0L) {
                                                                                        throw new NoSuchElementException();
                                                                                    }
                                                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xEAD1904D));
                                                                                }
                                                                                catch (NoSuchElementException noSuchElementException) {
                                                                                    n3 = n2 ^ 0xEAD1904D;
                                                                                }
                                                                                ++n;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_15 = (Integer.rotateRight(0xE84EE017 ^ n2, 16) - 636142084) * -397484009;
                                                                            if (list.isEmpty()) {
                                                                                int cfr_ignored_16 = (int)(0x2D2FE7CE24CBA75BL ^ (long)n2 ^ 0x32EC8524B591F78EL);
                                                                                n3 = (n2 ^ 0xCF7C1EDD) + 2042505209 - 2042505209;
                                                                                n += 5;
                                                                                continue;
                                                                            }
                                                                            try {
                                                                                n3 = (int)((long)(n2 ^ 0x62CCC0E1) ^ 0x4C06DE65F49E41F8L ^ 0x4C06DE65F49E41F8L);
                                                                            }
                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x62CCC0E1));
                                                                            }
                                                                            n -= 4;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_17 = Integer.rotateRight(0x321E1507 ^ n2, 9) - 369240852;
                                                                        if (!yf.khdha_2()) {
                                                                            int cfr_ignored_18 = (int)(0xFCE73CEC6383D042L ^ (long)n2 ^ 0x84A80BB45BA2541FL);
                                                                            n3 = (int)((long)(n2 ^ 0x9F35A7CE) ^ 0x8AB8D11647342B5L ^ 0x8AB8D11647342B5L);
                                                                            int cfr_ignored_19 = (int)(0x914EE64136CA633FL ^ (long)n2 ^ 0x31F2A1273D588F4CL);
                                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x8B99BE3C));
                                                                            n -= 3;
                                                                            continue;
                                                                        }
                                                                        n3 = (int)((long)(n2 ^ 0x4B8DEED6) ^ 0x9BBE914CFEEDBF73L ^ 0x9BBE914CFEEDBF73L);
                                                                        int cfr_ignored_20 = (Integer.rotateRight(0x8D532B97 ^ n2, 4) - 560981636) * -1923929193;
                                                                        n3 = n2 ^ 0xC22FD261 ^ 0xB67397FA ^ 0xB67397FA;
                                                                        n += 4;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_21 = Integer.rotateLeft(0xE491CFC5 ^ n2, 15) - -1308243946;
                                                                    int cfr_ignored_22 = (int)(0x262361F827D4EB4FL ^ (long)n2 ^ 0x3E80831A2DB9E197L);
                                                                    yf.athz_2();
                                                                    int cfr_ignored_23 = (int)(0xAC7F90D74EB1342L ^ (long)n2 ^ 0xF6A2565DDA3B85EL);
                                                                    n3 = (n2 ^ 0xC22FD261) + 715245088 - 715245088;
                                                                    n -= 3;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_24 = Integer.rotateLeft(0x2D057080 ^ n2, 8) + 2013675195;
                                                                try {
                                                                    --n;
                                                                    if ((0xA4CE90162DD1DC5DL ^ (long)n2 | 1L) == 0L) {
                                                                        throw new UnsupportedOperationException();
                                                                    }
                                                                    n3 = n2 ^ 0xD6A86553 ^ 0xD91991EF ^ 0xD91991EF;
                                                                }
                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                    n3 = (int)((long)(n2 ^ 0xD6A86553) ^ 0xB55D7643E1FD1F94L ^ 0xB55D7643E1FD1F94L);
                                                                }
                                                                --n;
                                                                continue;
                                                            }
                                                            int cfr_ignored_25 = (Integer.rotateLeft(0xADAC463D ^ n2, 8) - 205136030) * -1381218755;
                                                            int cfr_ignored_26 = (int)(0x6F1EE80027D4EB4FL ^ (long)n2 ^ 0x2D70831A2DB973ECL);
                                                            int cfr_ignored_27 = (int)(0xF5C3A06C95AE17DFL ^ (long)n2 ^ 0xBDA9E7EFD4984656L);
                                                            n3 = (n2 ^ 0x5DBAAACD) + 847699406 - 847699406;
                                                            int cfr_ignored_28 = (int)(0xF8E8A3B51206314BL ^ (long)n2 ^ 0xBA1AE8BF99B05C00L);
                                                            n3 = (int)((long)(n2 ^ 0xD6A86553) ^ 0x915C70165AC58A86L ^ 0x915C70165AC58A86L);
                                                            ++n;
                                                            continue;
                                                        }
                                                        int cfr_ignored_29 = Integer.rotateLeft(0x67F5785 ^ n2, 3) - -842450858;
                                                        int cfr_ignored_30 = (int)(0xC4CDF9B827D4EB4FL ^ (long)n2 ^ 0xE00831A2DB8244AL);
                                                        n3 = (n2 ^ 0xD6A86553) + -1394002271 - -1394002271;
                                                        int cfr_ignored_31 = (Integer.rotateLeft(0xED2F8CDD ^ n2, 16) - -1121997314) * -315650851;
                                                        int cfr_ignored_32 = (int)(0x2F9D22E027D4EB4FL ^ (long)n2 ^ 0xB8B0831A2DB9F2EBL);
                                                        --n;
                                                        continue;
                                                    }
                                                    int cfr_ignored_33 = (Integer.rotateRight(0x6241A53E ^ n2, 15) - -363814467) * 1648469311;
                                                    try {
                                                        n -= 5;
                                                        if ((0x64DF4151093F26D3L ^ (long)n2 | 1L) == 0L) {
                                                            throw new UnsupportedOperationException();
                                                        }
                                                        n3 = n2 ^ 0xD6A86553;
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        n3 = (n2 ^ 0xD6A86553) + -178824258 - -178824258;
                                                    }
                                                    ++n;
                                                    continue;
                                                }
                                                int cfr_ignored_34 = Integer.rotateRight(0xBE1B6246 ^ n2, 10) - 162432437;
                                                n3 = n2 ^ 0xDB6C2661 ^ 0x3EDEBF9D ^ 0x3EDEBF9D;
                                                int cfr_ignored_35 = Integer.rotateLeft(0x7AF40CA1 ^ n2, 18) + -404019526;
                                                int cfr_ignored_36 = (int)(0xB846A29C27D4EB4FL ^ (long)n2 ^ 0xB848831A2DB8DD5CL);
                                                int cfr_ignored_37 = (int)(0x16F4113177FA7557L ^ (long)n2 ^ 0xDF12234711898039L);
                                                n3 = n2 ^ 0x422F5DFC;
                                                int cfr_ignored_38 = (int)(0xD9652CE0849FC76DL ^ (long)n2 ^ 0xA4B1C58C75FC1F1BL);
                                                n3 = n2 ^ 0xD6A86553 ^ 0xA9C7F7F9 ^ 0xA9C7F7F9;
                                                --n;
                                                continue;
                                            }
                                            int cfr_ignored_39 = (Integer.rotateRight(0xC76B61B6 ^ n2, 11) - 710833221) * -949263945;
                                            n3 = (n2 ^ 0xBA433E42) + -261415443 - -261415443;
                                            int cfr_ignored_40 = (Integer.rotateLeft(0xB3899079 ^ n2, 9) + -1039786526) * -1282830215;
                                            int cfr_ignored_41 = (int)(0x713B3E4427D4EB4FL ^ (long)n2 ^ 0x81F8831A2DB94FA7L);
                                            n3 = n2 ^ 0x428F1732 ^ 0xC2B7E75D ^ 0xC2B7E75D;
                                            int cfr_ignored_42 = Integer.rotateRight(0xFCE0ACE ^ n2, 4) - -296686035;
                                            n3 = (n2 ^ 0xD6A86553) + -840374859 - -840374859;
                                            n += 3;
                                            continue;
                                        }
                                        int cfr_ignored_43 = Integer.rotateRight(0xC64D1447 ^ n2, 11) - 129176532;
                                        n3 = n2 ^ 0xDCC96327 ^ 0x2FB5FCAA ^ 0x2FB5FCAA;
                                        int cfr_ignored_44 = (Integer.rotateLeft(0x3CE124F4 ^ n2, 10) - 1671502023) * 1021388021;
                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xC3F5FD08));
                                        int cfr_ignored_45 = Integer.rotateLeft(0x34B98608 ^ n2, 9) + 1725225523;
                                        n3 = n2 ^ 0xD6A86553;
                                        n -= 4;
                                        continue;
                                    }
                                    int cfr_ignored_46 = (Integer.rotateRight(0xB2E05677 ^ n2, 9) - -1383589980) * -1293920649;
                                    n3 = (n2 ^ 0x6AC3A0D9) + -1974807981 - -1974807981;
                                    int cfr_ignored_47 = Integer.rotateRight(0x1ED2A2A7 ^ n2, 6) - -1075883660;
                                    n3 = n2 ^ 0xD6A86553;
                                    ++n;
                                    continue;
                                }
                                int cfr_ignored_48 = (Integer.rotateRight(0xE2002493 ^ n2, 15) + 1650593032) * -503307117;
                                try {
                                    n -= 3;
                                    if ((0x7B650ADCA1BFCB71L ^ (long)n2 | 1L) == 0L) {
                                        throw new NoSuchElementException();
                                    }
                                    n3 = (int)((long)(n2 ^ 0xD6A86553) ^ 0xA3E8B0AB4A641074L ^ 0xA3E8B0AB4A641074L);
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    n3 = (n2 ^ 0xD6A86553) + -638389781 - -638389781;
                                }
                                n += 5;
                                continue;
                            }
                            int cfr_ignored_49 = Integer.rotateLeft(0x9F74DF69 ^ n2, 6) + 1401203954;
                            int cfr_ignored_50 = (int)(0x5DC6715427D4EB4FL ^ (long)n2 ^ 0x1FD8831A2DB9165DL);
                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x12A7DDC));
                            int cfr_ignored_51 = (Integer.rotateRight(0x8BAEA216 ^ n2, 4) - -293388315) * -1951489513;
                            try {
                                n += 3;
                                if ((0x8BF847AD162FDB2BL ^ (long)n2 | 1L) == 0L) {
                                    throw new IllegalArgumentException();
                                }
                                n3 = n2 ^ 0xD6A86553;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                n3 = (int)((long)(n2 ^ 0xD6A86553) ^ 0x6F433EE6D488175AL ^ 0x6F433EE6D488175AL);
                            }
                            n += 2;
                            continue;
                        }
                        int cfr_ignored_52 = Integer.rotateRight(0xD614B2E3 ^ n2, 13) + -253802312;
                        n3 = n2 ^ 0x804CDA2D ^ 0x42E9D679 ^ 0x42E9D679;
                        int cfr_ignored_53 = (Integer.rotateRight(0x1F01A9DE ^ n2, 6) - -980340451) * 520202719;
                        try {
                            n -= 3;
                            if ((0x99A3B056ACFB38CFL ^ (long)n2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n3 = (n2 ^ 0xD6A86553) + -569393145 - -569393145;
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xD6A86553));
                        }
                        n -= 5;
                        continue;
                    }
                    int cfr_ignored_54 = (Integer.rotateRight(0x7D34BAF2 ^ n2, 18) + 767574665) * 2100607731;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA446D2AE));
                    int cfr_ignored_55 = (Integer.rotateLeft(0x52191A7D ^ n2, 13) - -177744802) * 1377376893;
                    int cfr_ignored_56 = (int)(0x90ABB44027D4EB4FL ^ (long)n2 ^ 0x95F0831A2DB88C86L);
                    try {
                        n += 2;
                        if ((0x68131976F095C953L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = n2 ^ 0xD6A86553;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)(n2 ^ 0xD6A86553) ^ 0x235A27E987972CB0L ^ 0x235A27E987972CB0L);
                    }
                    n -= 2;
                    continue;
                }
                int cfr_ignored_57 = (Integer.rotateRight(0x1A0DB893 ^ n2, 6) + 738654472) * 437106835;
                try {
                    n += 4;
                    if ((0x73723D0C118E3B27L ^ (long)n2 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    n3 = n2 ^ 0xD6A86553 ^ 0xEA12504A ^ 0xEA12504A;
                }
                catch (NoSuchElementException noSuchElementException) {
                    n3 = n2 ^ 0xD6A86553 ^ 0xD9BFE121 ^ 0xD9BFE121;
                }
                n += 2;
                continue;
            }
            int cfr_ignored_58 = (Integer.rotateLeft(0xB6C7859 ^ n2, 4) + 1719677442) * 191658073;
            int cfr_ignored_59 = (int)(0xC9DED66427D4EB4FL ^ (long)n2 ^ 0x51B8831A2DB83E6CL);
            n3 = (n2 ^ 0xD6A86553) + 1967705115 - 1967705115;
        }
    }

    private void ajq(List list) {
        try {
            int n = -2059364905;
            n = Integer.rotateLeft(n * 110017989, 17) ^ 0xEF267D60;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 23);
            List list2 = list;
            n = Integer.rotateLeft((list2 != null ? System.identityHashCode(list2) : 0) ^ n, 20);
            int n2 = n ^ 0x4CA8BC7A;
            if ((n2 ^ n) != 1286126714) {
                int cfr_ignored_0 = (0xC9E829AD ^ n) - 621583935;
            }
            if ((0x2F2 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!list.isEmpty()) {
            list.add(new bkhd_2(" | ", brz_2.ryk, Float.intBitsToFloat(Integer.rotateLeft(0xFFAEDF3D ^ 0x99C84F0B, 18)), bas_4.shjz()));
        }
    }

    private String dan_2(class_1657 class_16572) {
        try {
            int n = -209607604;
            n = Integer.rotateLeft(n * 734610325, 6) ^ 0x2DD0C028;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 2);
            int n2 = n ^ 0xFEFE5458;
            if ((n2 ^ n) != -16886696) {
                int cfr_ignored_0 = (0xD7FF014 ^ n) - -556773019;
            }
            if ((0xF4 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        bjkh bjkh2 = ttgh.brdh();
        class_268 class_2682 = class_16572.method_5781();
        String string = class_2682 != null ? class_124.method_539((String)class_2682.method_1144().getString()) : "";
        String string2 = class_2682 != null ? class_124.method_539((String)class_2682.method_1136().getString()) : "";
        String string3 = this.na_2.dngh_2(class_16572) ? bjkh2.zta_4(class_16572.method_7334().getName()) : class_16572.method_7334().getName();
        StringBuilder stringBuilder = new StringBuilder();
        if (string != null && !string.isBlank()) {
            stringBuilder.append(string.trim()).append((char)(Integer.reverse(1159512233) ^ 0x95033882));
        }
        stringBuilder.append(string3);
        if (string2 != null && !string2.isBlank()) {
            stringBuilder.append((char)(0x24C61F24 ^ 0x24C61F04)).append(string2.trim());
        }
        return this.hds(stringBuilder.toString());
    }

    private String shbz(class_1657 class_16572) {
        class_1799 class_17992;
        int n = -1871026415;
        n = Integer.rotateLeft(n * 1255146323, 4) ^ 0x6A5E6803;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 21);
        class_1657 class_16573 = class_16572;
        n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
        int n2 = n ^ 0x627FF77B;
        if ((n2 ^ n) != 1652553595) {
            int cfr_ignored_0 = (0xF205906A ^ n) + -518178164;
        }
        if ((class_17992 = class_16572.method_6079()).method_7960()) {
            return "";
        }
        if (!class_17992.method_31574(class_1802.field_8288) && !class_17992.method_31574(class_1802.field_8575)) {
            return "";
        }
        class_2561 class_25612 = class_17992.method_65130();
        if (class_25612 == null) {
            return "";
        }
        String string = class_124.method_539((String)class_25612.getString());
        return string == null ? "" : string;
    }

    private List rqf(class_1657 class_16572) {
        int n = tkht_2.stdh_2(-471831083);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x7DB3EB31;
        if ((n2 ^ n) != 2108943153) {
            int cfr_ignored_0 = Integer.rotateLeft(0x9E5386E4 ^ n, 6) - 813364439;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        ArrayList arrayList = new ArrayList();
        if (!this.na_2.khsa_3()) {
            return arrayList;
        }
        this.rms_2(arrayList, class_16572.method_6118(class_1304.field_6169));
        this.rms_2(arrayList, class_16572.method_6118(class_1304.field_6174));
        this.rms_2(arrayList, class_16572.method_6118(class_1304.field_6172));
        this.rms_2(arrayList, class_16572.method_6118(class_1304.field_6166));
        return arrayList;
    }

    private List bbr(class_1657 class_16572) {
        int n = tkht_2.stdh_2(-1972439514);
        class_1657 class_16573 = class_16572;
        n = Integer.rotateRight((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 2);
        int n2 = n ^ 0xE34703D0;
        if ((n2 ^ n) != -481885232) {
            int cfr_ignored_0 = (Integer.rotateRight(0x6929F5F6 ^ n, 16) - -1066244091) * 1764357623;
        }
        ArrayList arrayList = new ArrayList();
        if (!this.na_2.dhghh()) {
            return arrayList;
        }
        this.rms_2(arrayList, class_16572.method_6047());
        this.rms_2(arrayList, class_16572.method_6079());
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    private void rms_2(List var1_1, class_1799 var2_2) {
        var5_3 = 0;
        var3_4 = -967185377;
        var3_4 = Integer.rotateLeft(var3_4 * 1056508331, 9) ^ 53649270;
        var3_4 = System.identityHashCode(this) ^ var3_4;
        var4_5 = -887052334 + var3_4;
        while (true) {
            block43: {
                block53: {
                    block55: {
                        block47: {
                            block46: {
                                block52: {
                                    block44: {
                                        block48: {
                                            block45: {
                                                block50: {
                                                    block54: {
                                                        block49: {
                                                            block42: {
                                                                block51: {
                                                                    var5_3 = var4_5 - var3_4;
                                                                    switch (var5_3 & 7) {
                                                                        case 0: {
                                                                            if (var5_3 != -249708736) {
                                                                                ** break;
                                                                            }
                                                                            break block42;
                                                                        }
                                                                        case 1: {
                                                                            if (var5_3 != 1052820345) {
                                                                                ** break;
                                                                            }
                                                                            break block43;
                                                                        }
                                                                        case 2: {
                                                                            if (var5_3 == -884352558) break block44;
                                                                            if (var5_3 == -887052334) break;
                                                                            Integer.rotateRight(-1181116594 ^ var3_4, 10) - 2113335725;
                                                                            if (var5_3 != -1625931646) {
                                                                                ** break;
                                                                            }
                                                                            break block45;
                                                                        }
                                                                        case 3: {
                                                                            if (var5_3 == 1482057387) break block46;
                                                                            if (var5_3 != -631730277) {
                                                                                ** break;
                                                                            }
                                                                            break block47;
                                                                        }
                                                                        case 4: {
                                                                            if (var5_3 != -63049548) {
                                                                                ** break;
                                                                            }
                                                                            break block48;
                                                                        }
                                                                        case 5: {
                                                                            if (var5_3 == 2135583989) break block49;
                                                                            if (var5_3 != -1233768603) {
                                                                                ** break;
                                                                            }
                                                                            break block50;
                                                                        }
                                                                        case 6: {
                                                                            if (var5_3 != 1698784262) {
                                                                                ** break;
                                                                            }
                                                                            break block51;
                                                                        }
                                                                        case 7: {
                                                                            if (var5_3 == -725765689) break block52;
                                                                            if (var5_3 == -1051812705) break block53;
                                                                            if (var5_3 == -1767913601) break block54;
                                                                            if (var5_3 != 239276935) {
                                                                                ** break;
                                                                            }
                                                                            break block55;
                                                                        }
                                                                    }
                                                                    Integer.rotateRight(-130696593 ^ var3_4, 18) - 316617388;
                                                                    if (var2_2 == null) {
                                                                        try {
                                                                            ++var5_3;
                                                                            if ((2262158175473726799L ^ (long)var3_4 | 1L) == 0L) {
                                                                                throw new NoSuchElementException();
                                                                            }
                                                                            var4_5 = (int)((long)(2135583989 + var3_4) ^ 6494364303514111437L ^ 6494364303514111437L);
                                                                        }
                                                                        catch (NoSuchElementException v0) {
                                                                            var4_5 = 2135583989 + var3_4;
                                                                        }
                                                                        var5_3 -= 3;
                                                                        continue;
                                                                    }
                                                                    var4_5 = (int)((long)(-862264906 + var3_4) ^ -4580778791913543165L ^ -4580778791913543165L);
                                                                    Integer.rotateLeft(442383585 ^ var3_4, 6) + 902233722;
                                                                    (int)(-2815714192754676913L ^ (long)var3_4 ^ -2825864617715557368L);
                                                                    var4_5 = -249708736 + var3_4;
                                                                    var5_3 += 2;
                                                                    continue;
                                                                }
                                                                (Integer.rotateLeft(1391097169 ^ var3_4, 13) + 247583754) * 1391097169;
                                                                (int)(-8045439476726174897L ^ (long)var3_4 ^ 5451751497391443296L);
                                                                var1_1.add(var2_2);
                                                                try {
                                                                    var5_3 -= 2;
                                                                    if ((-4782302125561505545L ^ (long)var3_4 | 1L) == 0L) {
                                                                        throw new UnsupportedOperationException();
                                                                    }
                                                                    var4_5 = 2135583989 + var3_4 + 424992814 - 424992814;
                                                                }
                                                                catch (UnsupportedOperationException v1) {
                                                                    var4_5 = (int)((long)(2135583989 + var3_4) ^ -6522246908600560267L ^ -6522246908600560267L);
                                                                }
                                                                var5_3 += 3;
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(670385193 ^ var3_4, 7) + -619651022;
                                                            (int)(-1925312943389086897L ^ (long)var3_4 ^ 2979275301965031262L);
                                                            if (!var2_2.method_7960()) {
                                                                try {
                                                                    var5_3 -= 5;
                                                                    var4_5 = (int)((long)(1698784262 + var3_4) ^ 8989952694730549205L ^ 8989952694730549205L);
                                                                }
                                                                catch (UnsupportedOperationException v2) {
                                                                    var4_5 = 1698784262 + var3_4 + 853512723 - 853512723;
                                                                }
                                                                var5_3 -= 4;
                                                                continue;
                                                            }
                                                            var4_5 = (int)((long)(2135583989 + var3_4) ^ -7442484569134016335L ^ -7442484569134016335L);
                                                            ++var5_3;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(836927739 ^ var3_4, 9) + 248200608) * 836927739;
                                                        return;
                                                    }
                                                    Integer.rotateLeft(-1495746779 ^ var3_4, 7) - 949734582;
                                                    (int)(7235623342862297935L ^ (long)var3_4 ^ -3512663560889473787L);
                                                    try {
                                                        var5_3 += 5;
                                                        var4_5 = -887052334 + var3_4 + 1193416571 - 1193416571;
                                                    }
                                                    catch (IllegalStateException v3) {
                                                        var4_5 = -887052334 + var3_4;
                                                    }
                                                    continue;
                                                }
                                                (Integer.rotateLeft(-337284176 ^ var3_4, 16) + -1792630389) * -337284175;
                                                (int)(6534156597766562043L ^ (long)var3_4 ^ 354665062269524106L);
                                                var4_5 = -462593984 + var3_4;
                                                (int)(-4769387993297987989L ^ (long)var3_4 ^ -8595240455683123634L);
                                                var4_5 = -887052334 + var3_4 ^ -602603605 ^ -602603605;
                                                continue;
                                            }
                                            Integer.rotateRight(-338404409 ^ var3_4, 16) - -1827357612;
                                            try {
                                                ++var5_3;
                                                if ((-4602058745429994761L ^ (long)var3_4 | 1L) == 0L) {
                                                    throw new IllegalArgumentException();
                                                }
                                                var4_5 = -887052334 + var3_4;
                                            }
                                            catch (IllegalArgumentException v4) {
                                                var4_5 = Integer.reverse(Integer.reverse(-887052334 + var3_4));
                                            }
                                            var5_3 -= 4;
                                            continue;
                                        }
                                        Integer.rotateLeft(-936441788 ^ var3_4, 12) - 1108320119;
                                        var4_5 = Integer.reverse(Integer.reverse(-2098897319 + var3_4));
                                        Integer.rotateLeft(400378345 ^ var3_4, 5) + -399928718;
                                        (int)(-3066977922828670129L ^ (long)var3_4 ^ 3663822445325321998L);
                                        var4_5 = -887052334 + var3_4 ^ -1015321055 ^ -1015321055;
                                        Integer.rotateRight(1534984175 ^ var3_4, 14) - 413113644;
                                        var5_3 -= 5;
                                        continue;
                                    }
                                    (Integer.rotateLeft(805979445 ^ var3_4, 9) - -711196506) * 805979445;
                                    (int)(-956756500555699377L ^ (long)var3_4 ^ 3125642289854564512L);
                                    var4_5 = 220395232 + var3_4;
                                    (Integer.rotateLeft(248648628 ^ var3_4, 4) - -808582649) * 248648629;
                                    var4_5 = -887052334 + var3_4 + -1779436308 - -1779436308;
                                    var5_3 += 4;
                                    continue;
                                }
                                Integer.rotateLeft(1698458592 ^ var3_4, 15) + 1185853275;
                                var4_5 = -234817202 + var3_4 ^ -1105997071 ^ -1105997071;
                                Integer.rotateLeft(-1033804891 ^ var3_4, 11) - -1909936074;
                                (int)(59617273472936783L ^ (long)var3_4 ^ 7368033138837662838L);
                                try {
                                    var5_3 -= 3;
                                    var4_5 = Integer.reverse(Integer.reverse(-887052334 + var3_4));
                                }
                                catch (NoSuchElementException v5) {
                                    var4_5 = -887052334 + var3_4 ^ 237907302 ^ 237907302;
                                }
                                continue;
                            }
                            Integer.rotateLeft(1124362212 ^ var3_4, 11) - 568734679;
                            var4_5 = -853950837 + var3_4;
                            (Integer.rotateRight(-2085206926 ^ var3_4, 3) + -143660791) * -2085206925;
                            var4_5 = -887052334 + var3_4 + -1168231370 - -1168231370;
                            var5_3 += 5;
                            continue;
                        }
                        (Integer.rotateRight(161274134 ^ var3_4, 4) - 777775333) * 161274135;
                        var4_5 = (int)((long)(-2040105666 + var3_4) ^ 2670922434109839107L ^ 2670922434109839107L);
                        (Integer.rotateRight(1328023443 ^ var3_4, 12) + -1707701752) * 1328023443;
                        try {
                            var5_3 -= 2;
                            var4_5 = (int)((long)(-887052334 + var3_4) ^ 4912350795025107696L ^ 4912350795025107696L);
                        }
                        catch (NoSuchElementException v6) {
                            var4_5 = (int)((long)(-887052334 + var3_4) ^ 3439506507219107248L ^ 3439506507219107248L);
                        }
                        continue;
                    }
                    Integer.rotateRight(1410698539 ^ var3_4, 13) + 855226224;
                    try {
                        var5_3 += 2;
                        var4_5 = Integer.reverse(Integer.reverse(-887052334 + var3_4));
                    }
                    catch (NoSuchElementException v7) {
                        var4_5 = -887052334 + var3_4 ^ 1236808089 ^ 1236808089;
                    }
                    var5_3 -= 2;
                    continue;
                }
                Integer.rotateLeft(-1736145491 ^ var3_4, 6) - 2087309102;
                (int)(6500431010299439951L ^ (long)var3_4 ^ -6174290940665456195L);
                var4_5 = Integer.reverse(Integer.reverse(-887052334 + var3_4));
                (Integer.rotateRight(1223635227 ^ var3_4, 12) + -648769152) * 1223635227;
                var5_3 -= 4;
                continue;
            }
            Integer.rotateRight(1506207754 ^ var3_4, 14) + -478955407;
            try {
                --var5_3;
                var4_5 = -887052334 + var3_4 ^ 1746090449 ^ 1746090449;
            }
            catch (IllegalStateException v8) {
                var4_5 = -887052334 + var3_4;
            }
            var5_3 -= 5;
            continue;
lbl237:
            // 9 sources

            Integer.rotateRight(1405207727 ^ var3_4, 13) - 685011052;
            var4_5 = -887052334 + var3_4 + -1921413802 - -1921413802;
        }
    }

    private List jnh_2(class_1657 class_16572) {
        ArrayList<CallSite> arrayList = new ArrayList<CallSite>();
        for (class_1293 class_12932 : class_16572.method_6026()) {
            String string = class_1074.method_4662((String)((class_1291)class_12932.method_5579().comp_349()).method_5567(), (Object[])new Object[0]);
            int n = class_12932.method_5578() + 1;
            int n2 = class_12932.method_5584() / 20;
            arrayList.add((CallSite)((Object)(string + " " + n + " | " + n2 / 60 + ":" + String.format("%02d", n2 % 60))));
        }
        return arrayList;
    }

    private void ns(class_332 class_3322, List list, float f, float f2, boolean bl) {
        for (int i = 0; i < list.size(); ++i) {
            List list2;
            class_1799 class_17992 = (class_1799)list.get(i);
            float f3 = f + (float)i * 16.3f;
            this.bhgh_2(class_3322, class_17992, f3, f2, 0.8f);
            if (!this.na_2.zshw() || (list2 = this.tsk_3(class_17992)).isEmpty()) continue;
            float f4 = bl ? f2 - this.shsd_4(list2.size()) - 1.0f : f2 + 12.8f + 1.0f;
            this.shygh(class_3322, list2, f3 + 6.4f, f4);
        }
    }

    private void sgh(class_332 class_3322, List list, float f, float f2) {
        for (int i = 0; i < list.size(); ++i) {
            List list2;
            class_1799 class_17992 = (class_1799)list.get(i);
            float f3 = f2 + (float)i * 16.3f;
            this.bhgh_2(class_3322, class_17992, f, f3, 0.8f);
            if (!this.na_2.zshw() || (list2 = this.tsk_3(class_17992)).isEmpty()) continue;
            this.thdhl(class_3322, list2, f + 12.8f + 6.0f, f3 + 1.0f, false);
        }
    }

    private void swsh(class_332 class_3322, class_1657 class_16572, float f, float f2) {
        float f3 = f2;
        for (class_1293 class_12932 : class_16572.method_6026()) {
            String string = class_1074.method_4662((String)((class_1291)class_12932.method_5579().comp_349()).method_5567(), (Object[])new Object[0]);
            int n = class_12932.method_5578() + 1;
            int n2 = class_12932.method_5584() / 20;
            String string2 = string + " " + n + " | " + n2 / 60 + ":" + String.format("%02d", n2 % 60);
            float f4 = brz_2.ryk.shdf_2(string2, 6.1f);
            brz_2.ryk.zskh_4(class_3322.method_51448(), string2, f - f4 / 2.0f, f3, 6.1f, bas_4.ghss(), 0.0f);
            f3 += 7.5f;
        }
    }

    private void shygh(class_332 class_3322, List list, float f, float f2) {
        this.thdhl(class_3322, list, f, f2, true);
    }

    private void thdhl(class_332 class_3322, List list, float f, float f2, boolean bl) {
        float f3 = f2;
        for (String string : list) {
            float f4 = brz_2.ryk.shdf_2(string, 5.4f);
            float f5 = bl ? f - f4 / 2.0f : f;
            brz_2.ryk.zskh_4(class_3322.method_51448(), string, f5, f3, 5.4f, bas_4.ghss(), 0.0f);
            f3 += 6.2000003f;
        }
    }

    private void zda_3(class_332 class_3322, List list, float f, float f2) {
        float f3 = f2;
        for (String string : list) {
            float f4 = brz_2.ryk.shdf_2(string, 5.4f);
            brz_2.ryk.zskh_4(class_3322.method_51448(), string, f - f4, f3, 5.4f, bas_4.ghss(), 0.0f);
            f3 += 6.2000003f;
        }
    }

    private List tsk_3(class_1799 class_17992) {
        try {
            int n = 1923348017;
            n = Integer.rotateLeft(n * 1117741549, 27) ^ 0xE77A0ED9;
            class_1799 class_17993 = class_17992;
            n = Integer.rotateLeft((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 9);
            int n2 = n ^ 0xCC859909;
            if ((n2 ^ n) != -863659767) {
                int cfr_ignored_0 = (0xBE266F38 ^ n) - 919353018;
            }
            if ((0x102 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_9304 class_93042 = (class_9304)class_17992.method_57824(class_9334.field_49633);
        if (class_93042 == null || class_93042.method_57543()) {
            return List.of();
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        for (class_6880 class_68802 : class_93042.method_57534()) {
            int n = class_93042.method_57536(class_68802);
            String string = ((class_1887)class_68802.comp_349()).comp_2686().getString();
            if (!this.thta_4(string)) continue;
            arrayList.add(this.khths(string, n));
        }
        return arrayList;
    }

    private boolean thta_4(String string) {
        try {
            int n = -1184085629;
            n = Integer.rotateLeft(n * 299623613, 16) ^ 0xD3A62314;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 12);
            int n2 = n ^ 0x4A91275;
            if ((n2 ^ n) != 78189173) {
                int cfr_ignored_0 = (0xBDC55BF6 ^ n) + -460587292;
            }
            if ((0x165 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        for (String string3 : thdhl) {
            if (!string.contains(string3)) continue;
            return true;
        }
        return false;
    }

    private String khths(String string, int n) {
        String string2;
        int n2 = -1269887317;
        n2 = Integer.rotateLeft(n2 * 2051608241, 20) ^ 0x7F87318A;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (n2 = Integer.rotateLeft(n ^ n2, 27)) ^ 0x997D589E;
        if ((n3 ^ n2) != -1719838562) {
            int cfr_ignored_0 = (0x2D325635 ^ n2) + -1324086755;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if ((string2 = string.toLowerCase()).contains("protection")) {
            return "Prot " + n;
        }
        if (string2.contains("sharpness")) {
            return "Shr " + n;
        }
        if (string2.contains("efficiency")) {
            return "Eff " + n;
        }
        if (string2.contains("unbreaking")) {
            return "Unb " + n;
        }
        if (string2.contains("power")) {
            return "Pow " + n;
        }
        if (string2.contains("thorns")) {
            return "Thr " + n;
        }
        if (string2.contains("mending")) {
            return "Mend " + n;
        }
        if (string2.contains("fire aspect")) {
            return "Fire " + n;
        }
        if (string2.contains("knockback")) {
            return "Kb " + n;
        }
        String[] stringArray = string.split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for (String string3 : stringArray) {
            if (!string3.isEmpty()) {
                stringBuilder.append(Character.toUpperCase(string3.charAt(0)));
            }
            if (stringBuilder.length() >= 3) break;
        }
        if (stringBuilder.isEmpty()) {
            stringBuilder.append(string, 0, Math.min(3, string.length()));
        }
        return String.valueOf(stringBuilder) + " " + n;
    }

    private void bhgh_2(class_332 class_3322, class_1799 class_17992, float f, float f2, float f3) {
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_46416(f, f2, 0.0f);
        class_3322.method_51448().method_22905(f3, f3, 1.0f);
        class_3322.method_51427(class_17992, 0, 0);
        class_3322.method_51431(ttgh.mc.field_1772, class_17992, 0, 0);
        ((IDrawContextAccessor)class_3322).callDrawItemBar(class_17992, 0, 0);
        ((IDrawContextAccessor)class_3322).callDrawCooldownProgress(class_17992, 0, 0);
        class_3322.method_51448().method_22909();
    }

    private void sfj_2(class_332 class_3322, float f, float f2, float f3, float f4, boolean bl) {
        Color color;
        Color color2 = color = bl ? this.na_2.thdhn() : this.na_2.shhth();
        if (this.na_2.smd.hdh()) {
            bjgh.thqf.awz(class_3322.method_51448(), f, f2, f3, f4, 4.0f, new Color(0, 0, 0, Math.min(145, color.getAlpha())), 0.85f);
        }
        bjgh.jghs.hrj(class_3322.method_51448(), f, f2, f3, f4, 4.0f, color);
    }

    private void azn_2(class_332 class_3322, float f, float f2, float f3, float f4) {
        if (this.na_2.smd.hdh()) {
            bjgh.thqf.awz(class_3322.method_51448(), f, f2, f3, f4, 4.0f, new Color(0, 0, 0, 130), 0.85f);
        }
        bjgh.jghs.hrj(class_3322.method_51448(), f, f2, f3, f4, 4.0f, this.na_2.shhth());
    }

    private void thdt_3(class_332 class_3322, List list, float f, float f2) {
        float f3 = f;
        for (bkhd_2 bkhd2 : list) {
            bkhd2.sst.zskh_4(class_3322.method_51448(), bkhd2.jjk, f3, f2, bkhd2.khmth, bkhd2.shkz, 0.0f);
            f3 += bkhd2.sst.shdf_2(bkhd2.jjk, bkhd2.khmth);
        }
    }

    private float hjth(List list) {
        int n = 146827622;
        int n2 = (n = Integer.rotateLeft(n * -1889117439, 9) ^ 0x9C643A7B) ^ 0x265DEFBD;
        if ((n2 ^ n) != 643690429) {
            int cfr_ignored_0 = (0x2E9D86DB ^ n) + -1706739170;
        }
        float f = 0.0f;
        for (bkhd_2 bkhd2 : list) {
            f += bkhd2.sst.shdf_2(bkhd2.jjk, bkhd2.khmth);
        }
        return f;
    }

    private float khza_3(int n) {
        block0: {
            int n2 = -30094466;
            n2 = Integer.rotateLeft(n2 * 539777927, 18) ^ 0xB286F55F;
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 12);
            int n3 = n2 ^ 0xA7A6D4A6;
            if ((n3 ^ n2) == -1482238810) break block0;
            int cfr_ignored_0 = (0x59921FD8 ^ n2) - 1513292184;
        }
        return (float)n * Float.intBitsToFloat(-956533490 - -2052085695) + (float)Math.max(0, n - 1) * Float.intBitsToFloat(-1380000018 + -1834933998);
    }

    private float tghf_2(int n) {
        try {
            int n2 = 884957574;
            n2 = Integer.rotateLeft(n2 * -1735857837, 3) ^ 0x2262CF9F;
            n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 5);
            n2 = Integer.rotateLeft(n ^ n2, 23);
            int n3 = n2 ^ 0x20945355;
            if ((n3 ^ n2) != 546591573) {
                int cfr_ignored_0 = (0x142B32D3 ^ n2) - -1024636545;
            }
            if ((0x391 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return (float)n * Float.intBitsToFloat(-255233357 + 1350785562) + (float)Math.max(0, n - 1) * Float.intBitsToFloat(Integer.reverse(-334401508) ^ 0x786E8837);
    }

    private float shsd_4(int n) {
        block0: {
            int n2 = 1579816312;
            int n3 = (n2 = Integer.rotateLeft(n2 * 581518143, 15) ^ 0xFDC48004) ^ 0xC7A2E5D8;
            if ((n3 ^ n2) == -945625640) break block0;
            int cfr_ignored_0 = (0x9988F0A0 ^ n2) - 1446479098;
        }
        return (float)n * Float.intBitsToFloat(Integer.rotateLeft(0xBF613F2D ^ 0x8CC15C1E, 9));
    }

    private float dhad_4(List list) {
        try {
            int n = -2017140391;
            n = Integer.rotateLeft(n * 1731279845, 16) ^ 0xE1AEF194;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 24);
            List list2 = list;
            n = Integer.rotateLeft((list2 != null ? System.identityHashCode(list2) : 0) ^ n, 4);
            int n2 = n ^ 0x3ADBDD1;
            if ((n2 ^ n) != 61717969) {
                int cfr_ignored_0 = (0x84695C88 ^ n) + 1763567304;
            }
            if ((0x31D & 0) != 0) {
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
        float f = 0.0f;
        for (String string : list) {
            f = Math.max(f, brz_2.ryk.shdf_2(string, Float.intBitsToFloat(Integer.rotateLeft(0xC019588A ^ 0xF67F3E1A, 26))));
        }
        return f;
    }

    private float szd_6(class_1297 class_12972) {
        int n = -965240313;
        n = Integer.rotateLeft(n * -505534903, 13) ^ 0x80320A19;
        n = System.identityHashCode(this) ^ n;
        class_1297 class_12973 = class_12972;
        n = Integer.rotateRight((class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n, 27);
        int n2 = n ^ 0xC79EC691;
        if ((n2 ^ n) != -945895791) {
            int cfr_ignored_0 = (0x1E95C96 ^ n) - -1574226376;
        }
        float f = ttgh.mc.field_1724.method_5739(class_12972);
        return class_3532.method_15363((float)(1.0f - f / Float.intBitsToFloat(Integer.rotateLeft(0x35C9D091 ^ 0x3DFDD091, 3))), (float)Float.intBitsToFloat(Integer.reverse(1631627608) ^ 0x25950286), (float)1.0f) * this.na_2.dfs_3();
    }

    private int thhr(class_1657 class_16572) {
        int n = 32741696;
        n = Integer.rotateLeft(n * 1716590701, 3) ^ 0x99D6EFC5;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 5);
        int n2 = n ^ 0xC059D68E;
        if ((n2 ^ n) != -1067854194) {
            int cfr_ignored_0 = (0xC1AA4FCE ^ n) - 921509439;
        }
        if (mc.method_1562() == null) {
            return -1;
        }
        class_640 class_6402 = mc.method_1562().method_2871(class_16572.method_5667());
        return class_6402 != null ? class_6402.method_2959() : -1;
    }

    private Color bww(class_1309 class_13092) {
        float f = 0.0f;
        float f2 = 0.0f;
        int n = 0;
        int n2 = 0;
        Color color = null;
        int n3 = 0;
        int n4 = 284121523;
        n4 = Integer.rotateLeft(n4 * -1644409601, 6) ^ 0x96A5526;
        class_1309 class_13093 = class_13092;
        n4 = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n4;
        int n5 = (int)((long)Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14) ^ 0xEA2CC4D2A6E31424L ^ 0xEA2CC4D2A6E31424L);
        block29: while (true) {
            switch (Integer.reverse(n5) ^ n4 ^ 0x24FF6D14) {
                case -171647412: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0xC538075D ^ n4, 11) - -433683586) * -986183843;
                    int cfr_ignored_1 = (int)(0x78AA96027D4EB4FL ^ (long)n4 ^ 0xAFB0831A2DB9A2C4L);
                    yf.athz_2();
                    throw null;
                }
                case -364494709: {
                    int cfr_ignored_2 = Integer.rotateRight(0xEA2F5423 ^ n4, 16) + 1612238712;
                    if (yf.khdha_2()) {
                        try {
                            n3 -= 2;
                            if ((0x85D0A2AA75E4B3ADL ^ (long)n4 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n5 = Integer.reverse(n4 ^ 0xED5357CB ^ 0x24FF6D14);
                        }
                        catch (ArithmeticException arithmeticException) {
                            n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0xED5357CB ^ 0x24FF6D14)));
                        }
                        n3 += 4;
                        continue block29;
                    }
                    int cfr_ignored_3 = (int)(0xA46CE8B3151DDE9AL ^ (long)n4 ^ 0x2C16E6884612E508L);
                    n5 = Integer.reverse(n4 ^ 0xB39CDB2C ^ 0x24FF6D14) ^ 0x72009348 ^ 0x72009348;
                    int cfr_ignored_4 = (int)(0x660A2DB5D4F41B02L ^ (long)n4 ^ 0xA61B655BCD2361C5L);
                    n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0xF5C4DE4C ^ 0x24FF6D14)));
                    continue block29;
                }
                case -313305141: {
                    int cfr_ignored_5 = (Integer.rotateLeft(0x36EE7A18 ^ n4, 9) + -1421973469) * 921598489;
                    f = Math.max(1.0f, class_13092.method_6063());
                    f2 = class_3532.method_15363((float)(class_13092.method_6032() / f), (float)0.0f, (float)1.0f);
                    n = Math.round(Float.intBitsToFloat(0xA193A4D5 ^ 0xE2ECA4D5) * (1.0f - f2));
                    n2 = Math.round(Float.intBitsToFloat(0xFDB3685C ^ 0xBF43685C) + Float.intBitsToFloat(Integer.rotateLeft(0x447E322C ^ 0x54BFF22C, 2)) * f2);
                    color = new Color(n, n2, 0xF7F2FAE4 ^ 0xF7F2FAAC, Integer.reverse(1370380150) ^ 0x6EEA7575);
                    n5 = Integer.reverse(n4 ^ 0x5265D72F ^ 0x24FF6D14);
                    int cfr_ignored_6 = Integer.rotateLeft(0x72CFAA9 ^ n4, 3) + -489686606;
                    int cfr_ignored_7 = (int)(0xC59E549427D4EB4FL ^ (long)n4 ^ 0x5458831A2DB826EDL);
                    n5 = Integer.reverse(n4 ^ 0x1B929E18 ^ 0x24FF6D14);
                    n3 += 5;
                    continue block29;
                }
                case -1130013678: {
                    int cfr_ignored_8 = (Integer.rotateLeft(0x676B6675 ^ n4, 15) - -1973483674) * 1735091829;
                    int cfr_ignored_9 = (int)(0xA5D9C84827D4EB4FL ^ (long)n4 ^ 0x6DE0831A2DB8E662L);
                    n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0xE74B3ACA ^ 0x24FF6D14)));
                    int cfr_ignored_10 = (Integer.rotateRight(0xA94A857F ^ n4, 8) - -2073835108) * -1454733953;
                    try {
                        n3 -= 3;
                        if ((0x32552BA524522DFL ^ (long)n4 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n5 = Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14) + -855147368 - -855147368;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n5 = Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14) ^ 0x54A68D47 ^ 0x54A68D47;
                    }
                    continue block29;
                }
                case -2081043536: {
                    int cfr_ignored_11 = (Integer.rotateRight(0x275D653E ^ n4, 7) - -928194115) * 660432191;
                    try {
                        ++n3;
                        if ((0x74A74A882D3AEC71L ^ (long)n4 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n5 = (int)((long)Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14) ^ 0x535EB0D5D3C0EC66L ^ 0x535EB0D5D3C0EC66L);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n5 = Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14);
                    }
                    n3 -= 4;
                    continue block29;
                }
                case -1700802537: {
                    int cfr_ignored_12 = (Integer.rotateLeft(0xA8D7AB35 ^ n4, 8) - 1987795622) * -1462260939;
                    int cfr_ignored_13 = (int)(0x6A65050827D4EB4FL ^ (long)n4 ^ 0xF760831A2DB9791BL);
                    n5 = Integer.reverse(n4 ^ 0xF69FE593 ^ 0x24FF6D14);
                    int cfr_ignored_14 = (Integer.rotateRight(0x3DD469B2 ^ n4, 10) + -2129237047) * 1037330867;
                    n5 = (int)((long)Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14) ^ 0x172553F33989B1BBL ^ 0x172553F33989B1BBL);
                    n3 += 5;
                    continue block29;
                }
                case 1594605731: {
                    int cfr_ignored_15 = (Integer.rotateRight(0x6F1B6793 ^ n4, 16) + 2024745480) * 1864066963;
                    n5 = Integer.reverse(n4 ^ 0x6530C7F2 ^ 0x24FF6D14);
                    int cfr_ignored_16 = Integer.rotateLeft(0x283A6240 ^ n4, 8) + -479230725;
                    n5 = (int)((long)Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14) ^ 0x17FF778557411CFEL ^ 0x17FF778557411CFEL);
                    continue block29;
                }
                case 1766684117: {
                    int cfr_ignored_17 = Integer.rotateLeft(0x26B18920 ^ n4, 7) + -1277347301;
                    n5 = Integer.reverse(n4 ^ 0x45061144 ^ 0x24FF6D14) + 110003551 - 110003551;
                    int cfr_ignored_18 = (Integer.rotateLeft(0xB8D25230 ^ n4, 10) + 1708495627) * -1194175951;
                    n5 = Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14) + 629642629 - 629642629;
                    ++n3;
                    continue block29;
                }
                case -2072358261: {
                    int cfr_ignored_19 = Integer.rotateRight(0x3943D1AB ^ n4, 10) + -208403728;
                    n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0xC395A558 ^ 0x24FF6D14)));
                    int cfr_ignored_20 = Integer.rotateLeft(0xD01DBC4C ^ n4, 13) - 938962031;
                    try {
                        if ((0xD55BA188F6125D23L ^ (long)n4 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14)));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n5 = Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14) ^ 0x813D6FB7 ^ 0x813D6FB7;
                    }
                    n3 -= 5;
                    continue block29;
                }
                case 1472812042: {
                    int cfr_ignored_21 = (Integer.rotateLeft(0xC412BD11 ^ n4, 11) + -1029536694) * -1005404911;
                    int cfr_ignored_22 = (int)(0x6A0132C27D4EB4FL ^ (long)n4 ^ 0xDB28831A2DB9A091L);
                    try {
                        ++n3;
                        if ((0x3BA75B3845E708FFL ^ (long)n4 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14)));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n5 = Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14) + 349703286 - 349703286;
                    }
                    continue block29;
                }
                case -339768218: {
                    int cfr_ignored_23 = (Integer.rotateRight(0x8F467E97 ^ n4, 4) - 1575416708) * -1891205481;
                    n5 = Integer.reverse(n4 ^ 0xA0948F75 ^ 0x24FF6D14) + 261454699 - 261454699;
                    int cfr_ignored_24 = (Integer.rotateRight(0x8F2E2393 ^ n4, 4) + 1525935624) * -1892801645;
                    try {
                        if ((0x2A0F7A9470D18177L ^ (long)n4 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14)));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n5 = Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14);
                    }
                    n3 -= 5;
                    continue block29;
                }
                case -879800906: {
                    int cfr_ignored_25 = (Integer.rotateRight(0x3A82365E ^ n4, 10) - 438449309) * 981612127;
                    n5 = Integer.reverse(n4 ^ 0x3540626D ^ 0x24FF6D14);
                    int cfr_ignored_26 = Integer.rotateLeft(0x58C61180 ^ n4, 14) + -1000751685;
                    n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14)));
                    --n3;
                    continue block29;
                }
                case -337769720: {
                    int cfr_ignored_27 = Integer.rotateRight(0x9D7806A6 ^ n4, 6) - 367422805;
                    n5 = Integer.reverse(n4 ^ 0x8BEFDE61 ^ 0x24FF6D14);
                    int cfr_ignored_28 = Integer.rotateRight(0x43E84D6B ^ n4, 11) + 1031733040;
                    int cfr_ignored_29 = (int)(0x81E8C064496A9960L ^ (long)n4 ^ 0x7DB85E66C9E6AE00L);
                    n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0x18EC6256 ^ 0x24FF6D14)));
                    int cfr_ignored_30 = (int)(0xB658D8905C0DFD93L ^ (long)n4 ^ 0x4C5074A80000C160L);
                    n5 = Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14);
                    continue block29;
                }
                case 123203560: {
                    int cfr_ignored_31 = (Integer.rotateRight(0xF298399A ^ n4, 17) + 1691130081) * -224904805;
                    int cfr_ignored_32 = (int)(0x5E86071D4F7128E8L ^ (long)n4 ^ 0xF34A5251AAF710DDL);
                    n5 = Integer.reverse(n4 ^ 0x64137C33 ^ 0x24FF6D14) ^ 0x8D33DA09 ^ 0x8D33DA09;
                    int cfr_ignored_33 = (int)(0x5B85A459E41C3297L ^ (long)n4 ^ 0xB5C3048B9E091ADAL);
                    n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14)));
                    n3 += 5;
                    continue block29;
                }
                case 462593560: {
                    return color;
                }
            }
            int cfr_ignored_34 = (Integer.rotateRight(0xFCA5A357 ^ n4, 18) - -1670617404) * -56253609;
            n5 = Integer.reverse(n4 ^ 0xEA46408B ^ 0x24FF6D14) ^ 0x4400C55E ^ 0x4400C55E;
        }
    }

    private String hds(String string) {
        try {
            int n = -2014737393;
            n = Integer.rotateLeft(n * -1419153903, 20) ^ 0x92B0E43A;
            n = System.identityHashCode(this) ^ n;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x8376CC2C;
            if ((n2 ^ n) != -2089366484) {
                int cfr_ignored_0 = (0x49F4023 ^ n) - -1225832094;
            }
            if ((0x2F7 & 0) != 0) {
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
        if (string == null) {
            return "";
        }
        String string3 = string;
        for (Map.Entry entry : khtth_2.entrySet()) {
            if (!string3.contains((CharSequence)entry.getKey())) continue;
            string3 = string3.replace((CharSequence)entry.getKey(), (CharSequence)entry.getValue());
        }
        String string4 = class_124.method_539((String)string3);
        return string4 == null ? string3 : string4;
    }

    private yth sad_8(class_1297 class_12972, float f) {
        int n = tkht_2.stdh_2(-510660166);
        n = System.identityHashCode(this) ^ n;
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 17);
        int n2 = n ^ 0x98AD9FE9;
        if ((n2 ^ n) != -1733451799) {
            int cfr_ignored_0 = (Integer.rotateRight(0x79226E53 ^ n, 18) + -1349977272) * 2032299603;
        }
        double d = class_3532.method_16436((double)f, (double)class_12972.field_6014, (double)class_12972.method_23317());
        double d2 = class_3532.method_16436((double)f, (double)class_12972.field_6036, (double)class_12972.method_23318());
        double d3 = class_3532.method_16436((double)f, (double)class_12972.field_5969, (double)class_12972.method_23321());
        double d4 = d - class_12972.method_23317();
        double d5 = d2 - class_12972.method_23318();
        double d6 = d3 - class_12972.method_23321();
        class_238 class_2383 = class_12972.method_5829().method_989(d4, d5, d6).method_1014(Double.longBitsToDouble(0x3B8EBD985F1304C3L ^ 0x42AC77918BD10B8L));
        float f2 = Float.intBitsToFloat(-292809424 + -1863062833);
        float f3 = Float.intBitsToFloat(97390064 - -2041704975);
        float f4 = Float.intBitsToFloat(0x61BC3C38 ^ 0x9EC3C3C7);
        float f5 = Float.intBitsToFloat(1866767042 + -1875155651);
        int n3 = 0;
        double[] dArray = new double[]{class_2383.field_1323, class_2383.field_1320};
        double[] dArray2 = new double[]{class_2383.field_1322, class_2383.field_1325};
        double[] dArray3 = new double[]{class_2383.field_1321, class_2383.field_1324};
        for (double d7 : dArray) {
            for (double d8 : dArray2) {
                for (double d9 : dArray3) {
                    Vector2f vector2f = dhs_5.zrb_2(d7, d8, d9);
                    if (vector2f.x == Float.intBitsToFloat(Integer.reverse(-1207726065) ^ 0x8F763FE2) || vector2f.y == Float.intBitsToFloat(0x980E1A01 ^ 0xE771E5FE)) continue;
                    f2 = Math.min(f2, vector2f.x);
                    f3 = Math.min(f3, vector2f.y);
                    f4 = Math.max(f4, vector2f.x);
                    f5 = Math.max(f5, vector2f.y);
                    ++n3;
                }
            }
        }
        if (n3 == 0) {
            return null;
        }
        Vector2f vector2f = new Vector2f((f2 + f4) * Float.intBitsToFloat(-1609239237 + -1628763451), f3);
        Vector2f vector2f2 = new Vector2f((f2 + f4) * Float.intBitsToFloat(1194740714 - 137776106), f5);
        return new yth(vector2f, vector2f2, f2, f3, f4, f5);
    }

    private static double zkt_3(qdh qdh2) {
        return -qdh2.hhd;
    }

    private static double kh(class_1541 class_15412) {
        return -ttgh.mc.field_1724.method_5739((class_1297)class_15412);
    }

    private static double sth(class_1309 class_13092) {
        return -ttgh.mc.field_1724.method_5739((class_1297)class_13092);
    }

    private static String byt_2(String string, int n, int n2, int n3) {
        int n4 = -139388829;
        n4 = Integer.rotateLeft(n4 * 245865331, 28) ^ 0x5A3247AD;
        String string2 = string;
        n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 14);
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 3)) ^ 0x14296C38;
        if ((n5 ^ n4) != 338259000) {
            int cfr_ignored_0 = (0xE398745B ^ n4) + -921774328;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x81B28BDA ^ n2 ^ i * 907521369 ^ sssh, 14) ^ zs_2));
        }
        return new String(cArray);
    }

    private static int dhhq(class_1799 class_17992) {
        block0: {
            int n = 115653880;
            n = Integer.rotateLeft(n * 1660023145, 12) ^ 0x8BABB08;
            class_1799 class_17993 = class_17992;
            n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
            int n2 = n ^ 0xF49945CC;
            if ((n2 ^ n) == -191281716) break block0;
            int cfr_ignored_0 = (0xF27DF934 ^ n) + 1262354103;
        }
        return class_17992.method_7947();
    }

    private static boolean dmb() {
        block0: {
            int n = tkht_2.stdh_2(-888916236);
            int n2 = n ^ 0xE839F6CF;
            if ((n2 ^ n) == -398854449) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x233DC03B ^ n, 7) + 1222108768) * 591249467;
        }
        return yf.khdha_2();
    }

    private static void hl_2() {
        int n = -587951420;
        int n2 = (n = Integer.rotateLeft(n * -569997917, 20) ^ 0x33D6DDCF) ^ 0xCE320DDA;
        if ((n2 ^ n) != -835580454) {
            int cfr_ignored_0 = (0x12C69F1E ^ n) - 645996833;
        }
        yf.athz_2();
    }

    private static List jds_2() {
        block0: {
            int n = 1215937248;
            int n2 = (n = Integer.rotateLeft(n * -112753521, 14) ^ 0x8DE95189) ^ 0xA43298D9;
            if ((n2 ^ n) == -1540187943) break block0;
            int cfr_ignored_0 = (0xEC4B2239 ^ n) + 1317141641;
        }
        return List.of();
    }

    private static Stream jhh(class_9288 class_92882) {
        block0: {
            int n = 1338075666;
            int n2 = (n = Integer.rotateLeft(n * -1476426089, 20) ^ 0xFCD346AA) ^ 0xCA69129F;
            if ((n2 ^ n) == -899083617) break block0;
            int cfr_ignored_0 = (0x85A8788D ^ n) + 1996825917;
        }
        return class_92882.method_57489();
    }

    private static List tshkh() {
        block0: {
            int n = -302603467;
            int n2 = (n = Integer.rotateLeft(n * -1579059213, 14) ^ 0xDB32D827) ^ 0x5037448B;
            if ((n2 ^ n) == 1345799307) break block0;
            int cfr_ignored_0 = (0xBDC1E7BE ^ n) - -1125261341;
        }
        return List.of();
    }

    private static boolean thghb(String string) {
        block0: {
            int n = 933699806;
            int n2 = (n = Integer.rotateLeft(n * -93689927, 14) ^ 0xDE428F3C) ^ 0x95733226;
            if ((n2 ^ n) == -1787612634) break block0;
            int cfr_ignored_0 = (0xA2D412F8 ^ n) + -1134136146;
        }
        return string.isBlank();
    }

    private static class_2561 zdhz_2(class_1309 class_13092) {
        block0: {
            int n = tkht_2.stdh_2(-1986451113);
            class_1309 class_13093 = class_13092;
            n = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 7);
            int n2 = n ^ 0x6C5C1F1A;
            if ((n2 ^ n) == 1817976602) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xE5C5364D ^ n, 15) - -683724146;
            int cfr_ignored_1 = (int)(0x2777987027D4EB4FL ^ (long)n ^ 0xCD90831A2DB9E33EL);
        }
        return class_13092.method_5477();
    }

    private static boolean btt_2(ad ad2) {
        block0: {
            int n = -889010765;
            n = Integer.rotateLeft(n * -530172419, 5) ^ 0xB0D667FA;
            ad ad3 = ad2;
            n = (ad3 != null ? System.identityHashCode(ad3) : 0) ^ n;
            int n2 = n ^ 0x520CD42C;
            if ((n2 ^ n) == 1376572460) break block0;
            int cfr_ignored_0 = (0x990E119F ^ n) - -1428258110;
        }
        return ad2.tbh_3();
    }

    private static boolean zhq_2(ad ad2) {
        block0: {
            int n = tkht_2.stdh_2(-157588912);
            ad ad3 = ad2;
            n = Integer.rotateRight((ad3 != null ? System.identityHashCode(ad3) : 0) ^ n, 19);
            int n2 = n ^ 0x837E3D10;
            if ((n2 ^ n) == -2088878832) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x75E55F40 ^ n, 17) + 1260660731;
        }
        return ad2.dwgh_2();
    }

    private static Color tth_6() {
        block0: {
            int n = -1744878975;
            int n2 = (n = Integer.rotateLeft(n * 1032434319, 20) ^ 0xC93AC8BC) ^ 0x665DC179;
            if ((n2 ^ n) == 1717420409) break block0;
            int cfr_ignored_0 = (0xF1A283F8 ^ n) - 1193394353;
        }
        return bas_4.shjz();
    }

    private static int twt_4(int n) {
        block0: {
            int n2 = -202214724;
            n2 = Integer.rotateLeft(n2 * -1375938947, 20) ^ 0x8E398923;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 7)) ^ 0xA258061C;
            if ((n3 ^ n2) == -1571289572) break block0;
            int cfr_ignored_0 = (0x51AA74A0 ^ n2) + 2087399987;
        }
        return Integer.reverse(n);
    }

    private static String dhlq(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1408955939;
            n4 = Integer.rotateLeft(n4 * -1255504755, 7) ^ 0xAC67742E;
            n4 = n2 ^ n4;
            int n5 = (n4 = n3 ^ n4) ^ 0xBA0F2666;
            if ((n5 ^ n4) == -1173412250) break block0;
            int cfr_ignored_0 = (0x160A2FBB ^ n4) + -589149388;
        }
        return ttgh.byt_2(string, n, n2, n3);
    }

    private static int dan(float f) {
        block0: {
            int n = -1281246905;
            n = Integer.rotateLeft(n * 716619059, 20) ^ 0x140FAA4B;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xF79E8EA0;
            if ((n2 ^ n) == -140603744) break block0;
            int cfr_ignored_0 = (0x443F37E7 ^ n) - 1762376782;
        }
        return Math.round(f);
    }

    private static float bzd_3(class_1309 class_13092) {
        block0: {
            int n = -1652827267;
            n = Integer.rotateLeft(n * 451562091, 8) ^ 0xCEE5D265;
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0x7F14FBCF;
            if ((n2 ^ n) == 2132081615) break block0;
            int cfr_ignored_0 = (0xE26F20B2 ^ n) + 1185647556;
        }
        return class_13092.method_6067();
    }

    private static Color shkhw() {
        block0: {
            int n = tkht_2.stdh_2(48051883);
            int n2 = n ^ 0x2704A08E;
            if ((n2 ^ n) == 654614670) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x25D99625 ^ n, 7) - -1716073034;
            int cfr_ignored_1 = (int)(0xE76B381827D4EB4FL ^ (long)n ^ 0x8D40831A2DB86307L);
        }
        return bas_4.shjz();
    }

    private static boolean rdhq(ad ad2, class_1657 class_16572) {
        block0: {
            int n = 303243474;
            int n2 = (n = Integer.rotateLeft(n * -537087675, 11) ^ 0xC7051237) ^ 0x13378CA1;
            if ((n2 ^ n) == 322407585) break block0;
            int cfr_ignored_0 = (0x124AC73 ^ n) - 364545963;
        }
        return ad2.dngh_2(class_16572);
    }

    private static String zsd_2(ttgh ttgh2, class_1657 class_16572) {
        block0: {
            int n = 169618616;
            n = Integer.rotateLeft(n * 529977423, 14) ^ 0x44C5151C;
            ttgh ttgh3 = ttgh2;
            n = (ttgh3 != null ? System.identityHashCode(ttgh3) : 0) ^ n;
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0xB9CBD5F;
            if ((n2 ^ n) == 194821471) break block0;
            int cfr_ignored_0 = (0x18091E7 ^ n) + -779813291;
        }
        return ttgh2.dan_2(class_16572);
    }

    private static Color add_3() {
        block0: {
            int n = 605077087;
            int n2 = (n = Integer.rotateLeft(n * 1603652815, 19) ^ 0x19EB938E) ^ 0x8F7C86D8;
            if ((n2 ^ n) == -1887664424) break block0;
            int cfr_ignored_0 = (0xAB6C3887 ^ n) + 2081060126;
        }
        return bas_4.thaj();
    }

    private static Color bzh() {
        block0: {
            int n = tkht_2.stdh_2(1169954170);
            int n2 = n ^ 0x597EAD50;
            if ((n2 ^ n) == 1501474128) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x1CC2B82A ^ n, 6) + 2146561105;
        }
        return bas_4.ghss();
    }

    private static void akdh(ttgh ttgh2, List list, class_1657 class_16572) {
        int n = -186545961;
        n = Integer.rotateLeft(n * 1470743145, 24) ^ 0xE964358F;
        ttgh ttgh3 = ttgh2;
        n = Integer.rotateLeft((ttgh3 != null ? System.identityHashCode(ttgh3) : 0) ^ n, 23);
        List list2 = list;
        n = (list2 != null ? System.identityHashCode(list2) : 0) ^ n;
        int n2 = n ^ 0xD3550228;
        if ((n2 ^ n) != -749403608) {
            int cfr_ignored_0 = (0x27B48AFF ^ n) - -2039904553;
        }
        ttgh2.ttw_3(list, class_16572);
    }

    private static String tsn_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 108272628;
            n4 = Integer.rotateLeft(n4 * -904239233, 12) ^ 0x4C945AFB;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0x9DBE26BD;
            if ((n5 ^ n4) == -1648482627) break block0;
            int cfr_ignored_0 = (0x9BCA3D49 ^ n4) + -2146436463;
        }
        return ttgh.byt_2(string, n, n2, n3);
    }

    private static int dqw(ttgh ttgh2, class_1657 class_16572) {
        block0: {
            int n = tkht_2.stdh_2(-1136374611);
            ttgh ttgh3 = ttgh2;
            n = Integer.rotateLeft((ttgh3 != null ? System.identityHashCode(ttgh3) : 0) ^ n, 26);
            int n2 = n ^ 0xA21C7BF3;
            if ((n2 ^ n) == -1575191565) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x1E58375E ^ n, 6) - -1324592227) * 509097823;
        }
        return ttgh2.thhr(class_16572);
    }

    private static boolean dhgha(ad ad2) {
        block0: {
            int n = -2008519875;
            int n2 = (n = Integer.rotateLeft(n * 743050435, 26) ^ 0xF781D213) ^ 0xAE97783D;
            if ((n2 ^ n) == -1365804995) break block0;
            int cfr_ignored_0 = (0x26DF1300 ^ n) + -79669669;
        }
        return ad2.zaw_4();
    }

    private static Color ayr() {
        block0: {
            int n = -795820371;
            int n2 = (n = Integer.rotateLeft(n * -156634375, 7) ^ 0x924159AE) ^ 0xA79DAB8D;
            if ((n2 ^ n) == -1482839155) break block0;
            int cfr_ignored_0 = (0x770D1520 ^ n) + 10010215;
        }
        return bas_4.ghss();
    }

    private static void snz(ttgh ttgh2, List list) {
        int n = 1295966043;
        n = Integer.rotateLeft(n * -1403331063, 16) ^ 0x22ABEC2;
        List list2 = list;
        n = Integer.rotateLeft((list2 != null ? System.identityHashCode(list2) : 0) ^ n, 11);
        int n2 = n ^ 0x6F07EFAA;
        if ((n2 ^ n) != 1862791082) {
            int cfr_ignored_0 = (0x223930F1 ^ n) + -264590608;
        }
        ttgh2.ajq(list);
    }

    private static String tthkh_2(int n) {
        block0: {
            int n2 = -1424020832;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1672479815, 19) ^ 0x7272DBCA) ^ 0x35796A;
            if ((n3 ^ n2) == 3504490) break block0;
            int cfr_ignored_0 = (0xAB2A53CA ^ n2) - -1009055865;
        }
        return String.valueOf(n);
    }

    private static float skk_2(int n) {
        block0: {
            int n2 = 1054789316;
            n2 = Integer.rotateLeft(n2 * -149737171, 12) ^ 0x103FCA7F;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 5)) ^ 0x65B85E8D;
            if ((n3 ^ n2) == 1706581645) break block0;
            int cfr_ignored_0 = (0x5B669049 ^ n2) + 949711170;
        }
        return Float.intBitsToFloat(n);
    }

    private static Color rah_2(ttgh ttgh2, class_1309 class_13092) {
        block0: {
            int n = -1949543635;
            n = Integer.rotateLeft(n * -1584481491, 16) ^ 0xD4C2CC75;
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0xA0547BEC;
            if ((n2 ^ n) == -1605075988) break block0;
            int cfr_ignored_0 = (0x2B9828C1 ^ n) + -1922290932;
        }
        return ttgh2.bww(class_13092);
    }

    private static int khkn(int n) {
        block0: {
            int n2 = tkht_2.stdh_2(39976169);
            int n3 = (n2 = n ^ n2) ^ 0x6F3E4BC0;
            if ((n3 ^ n2) == 1866353600) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x6D5FB729 ^ n2, 16) + 1123339570;
            int cfr_ignored_1 = (int)(0xAFED191427D4EB4FL ^ (long)n2 ^ 0xCF58831A2DB8F20BL);
        }
        return Integer.reverse(n);
    }

    private static float rsn(class_1657 class_16572) {
        block0: {
            int n = 1153178618;
            int n2 = (n = Integer.rotateLeft(n * 116731511, 14) ^ 0xC93D8A86) ^ 0x82C17408;
            if ((n2 ^ n) == -2101251064) break block0;
            int cfr_ignored_0 = (0xC67D6FF2 ^ n) - -644021330;
        }
        return class_16572.method_6067();
    }

    private static bjkh brdh() {
        block0: {
            int n = 663836065;
            int n2 = (n = Integer.rotateLeft(n * 280932547, 12) ^ 0x7FBBDFCE) ^ 0xC0DD97AE;
            if ((n2 ^ n) == -1059219538) break block0;
            int cfr_ignored_0 = (0xE74CC20F ^ n) + 558461922;
        }
        return bjkh.shzkh();
    }

    private static String[] ssd(String string) {
        int n = -2106665341;
        int n2 = (n = Integer.rotateLeft(n * -478799787, 28) ^ 0xA1B7EE8B) ^ 0x165427A8;
        if ((n2 ^ n) != 374613928) {
            int cfr_ignored_0 = (0x943AF12B ^ n) + -654598186;
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

    private static CallSite khqf(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -993835627;
            n3 = Integer.rotateLeft(n3 * 1980407985, 14) ^ 0xBAE61844;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 12);
            String string3 = string2;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 17);
            int n4 = n3 ^ 0x4AC4E6BA;
            if ((n4 ^ n3) != 1254418106) {
                int cfr_ignored_0 = (0x8E07A32F ^ n3) + -160693327;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ zkhz ^ string.hashCode()) + (n2 + thqk) + i ^ zkhz, 24) + thqk);
            }
            String[] stringArray = ttgh.ssd(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] rsvfid451v(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite xxoitqwmc1big(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ hiobxku1 ^ string.hashCode() ^ n2 + dyz870qqjr ^ i * 198255533 ^ hiobxku1, 14) ^ dyz870qqjr));
            }
            String[] stringArray = ttgh.rsvfid451v(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

