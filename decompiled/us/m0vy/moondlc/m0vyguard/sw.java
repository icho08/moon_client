/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2680
 *  net.minecraft.class_2693
 *  net.minecraft.class_2877
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 *  net.minecraft.class_7923
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2693;
import net.minecraft.class_2877;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_7923;
import us.m0vy.moondlc.m0vyguard.bbt;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bda_4;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bghj;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bksh;
import us.m0vy.moondlc.m0vyguard.blh_2;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tkhdh;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.ghs;
import us.m0vy.moondlc.m0vyguard.ghq;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Auto Web", category=bzw.OTHER, desc="Automatically places webs on targets")
public class sw
extends bda_4 {
    private static final sw jqdh;
    public final badh_2 hsh_6 = new badh_2(this, "Legs").bts(true);
    public final badh_2 tb_2 = new badh_2(this, "Head").bts(true);
    public final badh_2 rtb = new badh_2(this, "Surround").bts(false);
    public final badh_2 shth_2 = new badh_2(this, "Upper S".concat("urround")).bts(false);
    public final badh_2 thba_2 = new badh_2(this, "Web Predict").bts(false);
    public final tay hzd_4 = new tay((hy)this, "Predict Ticks", this::sf).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(-2047169905 + -1155181199)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x15CD2E38 ^ 0x66FE1D77, 26))).ssd_5(2.0f);
    public final badh_2 sdhsh = new badh_2(this, "Integrate With Trap").bts(false);
    public final badh_2 khzy = new badh_2(this, "Auto Sign").bts(false);
    private boolean sjth_2 = false;
    private final List sak = new CopyOnWriteArrayList();
    private final bql<btt> jdht = new ghq(this);
    private final bql<bksh> zsd_4 = this::zqn;
    private static final int thshr = -756450964;
    private static final int dmn = -6762184;
    private static final int jghh = 1491190472;
    private static final int bhz = 831340052;
    private static final int mmmk1dsgg37vg = -606804541;
    private static final int elxljcrtqpr = -1371517565;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int a8dbnrwctv9o;

    public static sw snd_3() {
        block0: {
            int n = bbt.hnr(-568460436);
            int n2 = n ^ 0x123464EC;
            if ((n2 ^ n) == 305423596) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xCC299F80 ^ n, 12) + -1117261893;
        }
        return jqdh;
    }

    private sw() {
        List list = this.dty();
        list.remove(this.hgha);
        list.remove(this.tkhy);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void nc() {
        var3_1 = 0;
        var1_2 = 642009719;
        var1_2 = Integer.rotateLeft(var1_2 * -456953185, 3) ^ 2048193932;
        var2_3 = var1_2 ^ 181156815 ^ -1607152266 ^ -1607152266;
        while (true) {
            block25: {
                block36: {
                    block28: {
                        block31: {
                            block26: {
                                block29: {
                                    block32: {
                                        block33: {
                                            block27: {
                                                block30: {
                                                    block35: {
                                                        block34: {
                                                            var3_1 = var2_3 ^ var1_2;
                                                            switch (var3_1 & 7) {
                                                                case 3: {
                                                                    if (var3_1 == -142262221) break block25;
                                                                    if (var3_1 == 1426380371) break block26;
                                                                    if (var3_1 != 2065701531) {
                                                                        ** break;
                                                                    }
                                                                    break block27;
                                                                }
                                                                case 5: {
                                                                    if (var3_1 == 1927390749) break block28;
                                                                    if (var3_1 == -599590811) break block29;
                                                                    Integer.rotateRight(1368611338 ^ var1_2, 13) + -449477007;
                                                                    if (var3_1 != 173670765) {
                                                                        ** break;
                                                                    }
                                                                    break block30;
                                                                }
                                                                case 1: {
                                                                    if (var3_1 == -447591487) break block31;
                                                                    if (var3_1 == -1678718247) break;
                                                                    Integer.rotateLeft(-2146878196 ^ var1_2, 3) - -2055470161;
                                                                    if (var3_1 == 108875017) break block32;
                                                                    if (var3_1 != 826194153) {
                                                                        ** break;
                                                                    }
                                                                    break block33;
                                                                }
                                                                case 7: {
                                                                    if (var3_1 != 181156815) {
                                                                        ** break;
                                                                    }
                                                                    break block34;
                                                                }
                                                                case 0: {
                                                                    if (var3_1 != 1530288552) {
                                                                        ** break;
                                                                    }
                                                                    break block35;
                                                                }
                                                                case 4: {
                                                                    if (var3_1 != -636204660) {
                                                                        ** break;
                                                                    }
                                                                    break block36;
                                                                }
                                                            }
                                                            (Integer.rotateLeft(609897617 ^ var1_2, 7) + 1800201418) * 609897617;
                                                            (int)(-1807946021358736561L ^ (long)var1_2 ^ 4046628413651836928L);
                                                            this.sjth_2 = false;
                                                            this.sak.clear();
                                                            super.nc();
                                                            return;
                                                        }
                                                        Integer.rotateLeft(259649152 ^ var1_2, 4) + -467566405;
                                                        if (yf.khdha_2()) {
                                                            try {
                                                                var3_1 -= 5;
                                                                if ((4577373543940450981L ^ (long)var1_2 | 1L) == 0L) {
                                                                    throw new NoSuchElementException();
                                                                }
                                                                var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ -1678718247));
                                                            }
                                                            catch (NoSuchElementException v0) {
                                                                var2_3 = (var1_2 ^ -1678718247) + -1927477697 - -1927477697;
                                                            }
                                                            var3_1 += 3;
                                                            continue;
                                                        }
                                                        var2_3 = var1_2 ^ -947140750;
                                                        (Integer.rotateLeft(1034365148 ^ var1_2, 10) - 2073792991) * 1034365149;
                                                        var2_3 = (var1_2 ^ 1530288552) + -348117815 - -348117815;
                                                        var3_1 += 5;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(-1650584431 ^ var1_2, 6) + 444734666) * -1650584431;
                                                    (int)(6858061581143829327L ^ (long)var1_2 ^ -8635508137023433848L);
                                                    yf.athz_2();
                                                    var2_3 = var1_2 ^ -1678718247 ^ -871088097 ^ -871088097;
                                                    (Integer.rotateLeft(-756313584 ^ var1_2, 13) + -1897640149) * -756313583;
                                                    var3_1 -= 2;
                                                    continue;
                                                }
                                                Integer.rotateRight(2086021899 ^ var1_2, 18) + 315413904;
                                                var2_3 = (int)((long)(var1_2 ^ 1570108098) ^ 3015312708473209620L ^ 3015312708473209620L);
                                                (Integer.rotateRight(-1581082565 ^ var1_2, 7) + -1695674784) * -1581082565;
                                                try {
                                                    if ((6650697256611940161L ^ (long)var1_2 | 1L) == 0L) {
                                                        throw new UnsupportedOperationException();
                                                    }
                                                    var2_3 = (int)((long)(var1_2 ^ 181156815) ^ 928514161215774299L ^ 928514161215774299L);
                                                }
                                                catch (UnsupportedOperationException v1) {
                                                    var2_3 = (var1_2 ^ 181156815) + 501664637 - 501664637;
                                                }
                                                var3_1 += 4;
                                                continue;
                                            }
                                            (Integer.rotateLeft(-562097487 ^ var1_2, 14) + -171908438) * -562097487;
                                            (int)(2075522313437375311L ^ (long)var1_2 ^ -8905724114665630646L);
                                            var2_3 = (int)((long)(var1_2 ^ 221512799) ^ -6932216033499846776L ^ -6932216033499846776L);
                                            (Integer.rotateRight(-835039850 ^ var1_2, 12) - -43187099) * -835039849;
                                            var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 181156815));
                                            var3_1 -= 3;
                                            continue;
                                        }
                                        Integer.rotateRight(13136642 ^ var1_2, 3) + 480480377;
                                        var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ -1051711366));
                                        (Integer.rotateRight(-136913353 ^ var1_2, 17) - 123897828) * -136913353;
                                        (int)(2649396743024798096L ^ (long)var1_2 ^ -1879902580582652840L);
                                        var2_3 = (var1_2 ^ 153081021) + 831705911 - 831705911;
                                        (int)(8826482807894213872L ^ (long)var1_2 ^ 1423830118518184234L);
                                        var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 181156815));
                                        continue;
                                    }
                                    (Integer.rotateRight(1378833722 ^ var1_2, 13) + -132583103) * 1378833723;
                                    (int)(3591869457106452424L ^ (long)var1_2 ^ 4110643502498958944L);
                                    var2_3 = (var1_2 ^ 1977889529) + -1820100438 - -1820100438;
                                    (int)(-8637446596250190104L ^ (long)var1_2 ^ -4802459529919414894L);
                                    var2_3 = var1_2 ^ 181156815;
                                    continue;
                                }
                                Integer.rotateRight(221048782 ^ var1_2, 4) - -1664177875;
                                var2_3 = (int)((long)(var1_2 ^ -929625310) ^ 1563169768021741765L ^ 1563169768021741765L);
                                (Integer.rotateRight(-2058085061 ^ var1_2, 3) + 697117024) * -2058085061;
                                try {
                                    var3_1 += 4;
                                    if ((5843622005655187035L ^ (long)var1_2 | 1L) == 0L) {
                                        throw new IllegalStateException();
                                    }
                                    var2_3 = (int)((long)(var1_2 ^ 181156815) ^ -6156062333296837283L ^ -6156062333296837283L);
                                }
                                catch (IllegalStateException v2) {
                                    var2_3 = var1_2 ^ 181156815;
                                }
                                var3_1 -= 4;
                                continue;
                            }
                            Integer.rotateRight(-376024146 ^ var1_2, 16) - 1301397837;
                            var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 1401176971));
                            (Integer.rotateRight(572136658 ^ var1_2, 7) + 629611689) * 572136659;
                            var2_3 = var1_2 ^ 181156815;
                            Integer.rotateLeft(998628453 ^ var1_2, 10) - 965955446;
                            (int)(-488796311595455665L ^ (long)var1_2 ^ 1855627194936090559L);
                            var3_1 -= 4;
                            continue;
                        }
                        Integer.rotateLeft(-414913012 ^ var1_2, 15) - 95842991;
                        var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 181156815));
                        var3_1 += 5;
                        continue;
                    }
                    (Integer.rotateLeft(-1651682723 ^ var1_2, 6) - 410687614) * -1651682723;
                    (int)(6863481847051250511L ^ (long)var1_2 ^ 409971714550207406L);
                    var2_3 = (var1_2 ^ -1306526315) + 2102639860 - 2102639860;
                    Integer.rotateLeft(-917274587 ^ var1_2, 12) - 1702503350;
                    (int)(856016085459462991L ^ (long)var1_2 ^ -6827312886634137069L);
                    var2_3 = var1_2 ^ 181156815 ^ -56274770 ^ -56274770;
                    (Integer.rotateRight(662133847 ^ var1_2, 7) - -875442748) * 662133847;
                    var3_1 -= 2;
                    continue;
                }
                Integer.rotateRight(539860267 ^ var1_2, 7) + -370956432;
                var2_3 = var1_2 ^ -1186327010 ^ -1215032093 ^ -1215032093;
                (Integer.rotateLeft(-1787016171 ^ var1_2, 5) - 510318022) * -1787016171;
                (int)(6327243188596960079L ^ (long)var1_2 ^ 4116434207876121164L);
                (int)(1177734680270192539L ^ (long)var1_2 ^ -5505757332311536287L);
                var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ -130063138));
                (int)(-4790809668551599254L ^ (long)var1_2 ^ -4428531292162566442L);
                var2_3 = (var1_2 ^ 181156815) + -896936858 - -896936858;
                var3_1 -= 4;
                continue;
            }
            Integer.rotateRight(-2133130321 ^ var1_2, 3) - -1629286036;
            var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ -775173218));
            Integer.rotateLeft(732010116 ^ var1_2, 8) - 1290721591;
            var2_3 = var1_2 ^ 181156815 ^ 652033842 ^ 652033842;
            --var3_1;
            continue;
lbl206:
            // 7 sources

            Integer.rotateRight(-667428853 ^ var1_2, 14) + 857786512;
            var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ 181156815));
        }
    }

    public static boolean dhjw() {
        int n = bbt.hnr(565124360);
        int n2 = n ^ 0x28B8960A;
        if ((n2 ^ n) != 683185674) {
            int cfr_ignored_0 = Integer.rotateRight(0x9178B02 ^ n, 4) + 506950777;
        }
        return jqdh.rgha_2() && sw.jqdh.sjth_2;
    }

    public static boolean thdt_4() {
        if (!jqdh.rgha_2()) {
            return false;
        }
        class_1657 class_16572 = jqdh.tkhj_2();
        if (class_16572 == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jqdh.dhjy(class_16572, arrayList, arrayList2);
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1687 == null) {
            return false;
        }
        List list = arrayList.stream().distinct().filter(arg_0 -> sw.tmt_2(class_3102, arg_0)).collect(Collectors.toList());
        List list2 = arrayList2.stream().distinct().filter(arg_0 -> sw.ztkh(class_3102, arg_0)).collect(Collectors.toList());
        List list3 = jqdh.thd_8(class_16572, list);
        List list4 = jqdh.thd_8(class_16572, list2);
        return !list3.isEmpty() || !list4.isEmpty();
    }

    private void dhjy(class_1657 class_16572, List list, List list2) {
        boolean bl;
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null || class_3102.field_1687 == null) {
            return;
        }
        class_243 class_2432 = class_16572.method_19538();
        boolean bl2 = this.khaz_2(class_16572);
        if (class_16572 != class_3102.field_1724 && this.thba_2.shzl() && !bl2) {
            class_2432 = ghs.hhd_3(class_16572, this.hzd_4.thw_5());
        }
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        ArrayList<class_2338> arrayList2 = new ArrayList<class_2338>();
        if (this.sdhsh.shzl()) {
            arrayList.addAll(this.tbz_4(class_2432));
            arrayList2.addAll(this.hw(class_2432));
        } else {
            class_2338 class_23382 = sw.dka_3(class_2432);
            arrayList.add(class_23382);
            arrayList2.add(class_23382.method_10095());
            arrayList2.add(class_23382.method_10072());
            arrayList2.add(class_23382.method_10078());
            arrayList2.add(class_23382.method_10067());
        }
        boolean bl3 = bl = this.khzy.shzl() && this.ddhs_4() != -1;
        if (bl) {
            for (class_2338 class_23383 : arrayList) {
                list2.add(class_23383.method_10084());
            }
        } else if (this.tb_2.shzl()) {
            for (class_2338 class_23383 : arrayList) {
                list.add(class_23383.method_10084());
            }
        }
        if (this.hsh_6.shzl()) {
            list.addAll(arrayList);
        }
        if (this.rtb.shzl()) {
            list.addAll(arrayList2);
        }
        if (this.shth_2.shzl()) {
            for (class_2338 class_23383 : arrayList2) {
                list.add(class_23383.method_10084());
            }
        }
    }

    private boolean khaz_2(class_1657 class_16572) {
        int n = -579670989;
        n = Integer.rotateLeft(n * -275777819, 22) ^ 0x4C503A09;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x2F6AAD0B;
        if ((n2 ^ n) != 795520267) {
            int cfr_ignored_0 = (0xF2184138 ^ n) - -654236347;
        }
        class_310 class_3102 = sw.zrt_2();
        if (class_3102.field_1687 == null) {
            return false;
        }
        class_238 class_2383 = sw.thnh(class_16572);
        class_2338 class_23382 = class_16572.method_24515();
        for (int i = sw.ztht(class_23382) - 1; i <= sw.dthth_2(class_23382) + 1; ++i) {
            for (int j = sw.shrd(class_23382) - 1; j <= sw.aja(class_23382) + 2; ++j) {
                for (int k = sw.jah_2(class_23382) - 1; k <= sw.rdb_2(class_23382) + 1; ++k) {
                    class_2338 class_23383 = new class_2338(i, j, k);
                    if (!class_2383.method_994(new class_238(class_23383)) || class_3102.field_1687.method_8320(class_23383).method_26204() != class_2246.field_10343) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private List tbz_4(class_243 class_2432) {
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        double d = class_2432.method_10216() - Math.floor(class_2432.method_10216());
        double d2 = class_2432.method_10215() - Math.floor(class_2432.method_10215());
        int n = this.rby(d);
        int n2 = this.rby(d2);
        class_2338 class_23382 = this.zshz(class_2432);
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

    private List hw(class_243 class_2432) {
        int n;
        class_2338 class_23382 = class_2338.method_49637((double)class_2432.method_10216(), (double)class_2432.method_10214(), (double)class_2432.method_10215());
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        double d = Math.abs(class_2432.method_10216()) - Math.floor(Math.abs(class_2432.method_10216()));
        double d2 = Math.abs(class_2432.method_10215()) - Math.floor(Math.abs(class_2432.method_10215()));
        int n2 = this.sbd(d, false);
        int n3 = this.sbd(d, true);
        int n4 = this.sbd(d2, false);
        int n5 = this.sbd(d2, true);
        for (n = 1; n < n2 + 1; ++n) {
            arrayList.add(this.amq(class_23382, n, 0.0, 1 + n4));
            arrayList.add(this.amq(class_23382, n, 0.0, -(1 + n5)));
        }
        for (n = 0; n <= n3; ++n) {
            arrayList.add(this.amq(class_23382, -n, 0.0, 1 + n4));
            arrayList.add(this.amq(class_23382, -n, 0.0, -(1 + n5)));
        }
        for (n = 1; n < n4 + 1; ++n) {
            arrayList.add(this.amq(class_23382, 1 + n2, 0.0, n));
            arrayList.add(this.amq(class_23382, -(1 + n3), 0.0, n));
        }
        for (n = 0; n <= n5; ++n) {
            arrayList.add(this.amq(class_23382, 1 + n2, 0.0, -n));
            arrayList.add(this.amq(class_23382, -(1 + n3), 0.0, -n));
        }
        return arrayList.stream().distinct().toList();
    }

    private class_2338 zshz(class_243 class_2432) {
        int n = bbt.hnr(-1232785791);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xCD6D3AF7;
        if ((n2 ^ n) != -848479497) {
            int cfr_ignored_0 = (Integer.rotateRight(0x7BE81476 ^ n, 18) - 91756933) * 2078807159;
        }
        double d = sw.ssn_4(class_2432) - Math.floor(sw.ztk_4(class_2432)) > Double.longBitsToDouble(0xED25692C821C3C1CL ^ 0xD2CCF0B51B85A586L) ? Math.floor(sw.tas_4(class_2432)) + 1.0 : Math.floor(sw.aha_3(class_2432));
        return new class_2338(class_3532.method_15357((double)sw.zd_2(class_2432)), (int)d, sw.bghy(class_2432.method_10215()));
    }

    private int rby(double d) {
        int n;
        block1: {
            int n2 = 223613162;
            n2 = Integer.rotateLeft(n2 * -955103307, 3) ^ 0x626E2ED4;
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 21);
            n2 = (int)Double.doubleToLongBits(d) ^ n2;
            int n3 = n2 ^ 0xF91F4142;
            if ((n3 ^ n2) != -115392190) {
                int cfr_ignored_0 = (0xF44B51A8 ^ n2) - -1243190278;
            }
            n = d >= Double.longBitsToDouble(0x55B9EAF4D576A28EL ^ 0x6A5F8C92B310C4E8L) ? 1 : (d <= Double.longBitsToDouble(0xEC7E9FEC4DD6F888L ^ 0xD3ADACDF7EE5CBBBL) ? -1 : 0);
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0xECD3;
        }
        return n;
    }

    private int sbd(double d, boolean bl) {
        int n = bbt.hnr(-2133858110);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xBB34B6F2;
        if ((n2 ^ n) != -1154173198) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x3BFB5E30 ^ n, 10) + 1204684555) * 1006329393;
        }
        if (bl) {
            return d <= Double.longBitsToDouble(0x75D9F3CAE9D947A3L ^ 0x4A0AC0F9DAEA7490L) ? 1 : 0;
        }
        return d >= Double.longBitsToDouble(0xED9D5C3775DF00DDL ^ 0xD27B3A5113B966BBL) ? 1 : 0;
    }

    private class_2338 amq(class_2338 class_23382, double d, double d2, double d3) {
        try {
            int n = 1028061449;
            n = Integer.rotateLeft(n * 553382855, 15) ^ 0x887D1CC5;
            n = System.identityHashCode(this) ^ n;
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0xFA93A5D2;
            if ((n2 ^ n) != -90987054) {
                int cfr_ignored_0 = (0xC7D55CDB ^ n) + -1259984265;
            }
            if ((0xBD & 0) != 0) {
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
        if (sw.hzh_4(class_23382) < 0) {
            d = -d;
        }
        if (class_23382.method_10264() < 0) {
            d2 = -d2;
        }
        if (class_23382.method_10260() < 0) {
            d3 = -d3;
        }
        return class_23382.method_10069((int)d, (int)d2, (int)d3);
    }

    private static class_2338 dka_3(class_243 class_2432) {
        try {
            int n = -20223326;
            n = Integer.rotateLeft(n * -1508463431, 13) ^ 0x3A2FB1D8;
            class_243 class_2433 = class_2432;
            n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
            int n2 = n ^ 0x3ECE2F39;
            if ((n2 ^ n) != 1053699897) {
                int cfr_ignored_0 = (0xC005459B ^ n) + -1299550494;
            }
            if ((0xB6 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        double d = sw.abh_2(class_2432) - Math.floor(class_2432.method_10214());
        int n = d > Double.longBitsToDouble(0x3986FD57B1BE83AEL ^ 0x66F64CE28271A34L) ? (int)Math.floor(sw.ghth_2(class_2432)) + 1 : (int)Math.floor(class_2432.method_10214());
        return new class_2338((int)Math.floor(sw.stkh_3(class_2432)), n, (int)Math.floor(sw.ant_2(class_2432)));
    }

    private class_1657 tkhj_2() {
        double d;
        double d2;
        class_1657 class_16572;
        class_1309 class_13092;
        try {
            int n = 1382620290;
            n = Integer.rotateLeft(n * -1445180515, 17) ^ 0xEA374EAA;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x637B6D72;
            if ((n2 ^ n) != 1669033330) {
                int cfr_ignored_0 = (0x311271F0 ^ n) + -387635490;
            }
            if ((0x111 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null || class_3102.field_1687 == null) {
            return null;
        }
        tkhdh tkhdh2 = tkhdh.zkhr_2();
        if (sw.hdb_2(tkhdh2) && (class_13092 = tkhdh2.rkhh_2()) instanceof class_1657 && sw.shdn(class_16572 = (class_1657)class_13092) && (d2 = class_3102.field_1724.method_5858((class_1297)class_16572)) <= (d = (double)sw.ghdl(this.dhmd) + 1.0) * d) {
            return class_16572;
        }
        class_16572 = null;
        double d3 = Double.longBitsToDouble(0x7065249CAFFAEE23L ^ 0x3003A49CAFFAEE23L);
        d = sw.sz_4(this.dhmd) * sw.zghq(this.dhmd);
        for (class_1657 class_16573 : class_3102.field_1687.method_18456()) {
            double d4;
            double d5;
            if (class_16573 == class_3102.field_1724 || !sw.shdn(class_16573) || !((d5 = sw.thz_8(class_3102.field_1724, (class_1297)class_16573)) <= d) || !((d4 = sw.zhgh_4(class_16573)) < d3)) continue;
            d3 = d4;
            class_16572 = class_16573;
        }
        return class_16572;
    }

    private static boolean shdn(class_1657 class_16572) {
        int n = 978639100;
        int n2 = (n = Integer.rotateLeft(n * 211759139, 18) ^ 0xF5721BA0) ^ 0xE1ACBB82;
        if ((n2 ^ n) != -508773502) {
            int cfr_ignored_0 = (0xDBF8637E ^ n) + -1531956504;
        }
        if (!class_16572.method_5805() || class_16572.method_7325()) {
            int n3 = 0;
            if (yf.tdhth_2() == 0) {
                n3 = n3 ^ 0xC5FE;
            }
            return n3 != 0;
        }
        if (blh_2.dhwj(class_16572)) {
            return false;
        }
        return !sw.rs(Moondlc.getInstance()).adhj(class_16572.method_5477().getString());
    }

    private static double zhgh_4(class_1657 class_16572) {
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null) {
            return 360.0;
        }
        class_243 class_2432 = class_3102.field_1724.method_33571();
        double d = class_16572.method_23317() - class_2432.field_1352;
        double d2 = class_16572.method_23318() + class_16572.method_5829().method_17940() / 2.0 - class_2432.field_1351;
        double d3 = class_16572.method_23321() - class_2432.field_1350;
        double d4 = Math.sqrt(d * d + d3 * d3);
        float f = (float)Math.toDegrees(Math.atan2(d3, d)) - 90.0f;
        float f2 = (float)(-Math.toDegrees(Math.atan2(d2, d4)));
        float f3 = Math.abs(sw.hdl_2(class_3102.field_1724.method_36454() - f));
        float f4 = Math.abs(class_3102.field_1724.method_36455() - f2);
        return Math.sqrt(f3 * f3 + f4 * f4);
    }

    private static float hdl_2(float f) {
        float f2 = 0.0f;
        int n = 0;
        int n2 = -1581679338;
        n2 = Integer.rotateLeft(n2 * -404375547, 11) ^ 0x6801E009;
        int n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89)));
        block36: while (true) {
            switch (Integer.reverse(n3) ^ n2 ^ 0x90143C89) {
                case 113821241: {
                    int cfr_ignored_0 = Integer.rotateLeft(0xB539FD60 ^ n2, 9) + -161264165;
                    if (!(f2 < sw.btl_2(-1278987276 - -258984972))) {
                        int cfr_ignored_1 = (int)(0xBDEE14A2A45D5B1DL ^ (long)n2 ^ 0xD43584094D1CD60DL);
                        n3 = Integer.reverse(n2 ^ 0x5F6B25EB ^ 0x90143C89) + -870425360 - -870425360;
                        n -= 2;
                        continue block36;
                    }
                    int cfr_ignored_2 = (int)(0x484C444A4D48FBC7L ^ (long)n2 ^ 0x75E456220CA93D49L);
                    n3 = Integer.reverse(n2 ^ 0xB2677E45 ^ 0x90143C89);
                    ++n;
                    continue block36;
                }
                case -1301840315: {
                    int cfr_ignored_3 = Integer.rotateRight(0x6C76BEEB ^ n2, 16) + 650034608;
                    f2 += Float.intBitsToFloat(Integer.reverse(-1107083214) ^ 0xFB6C07D);
                    try {
                        ++n;
                        if ((0x4727CFE14C8410FBL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(n2 ^ 0x5F6B25EB ^ 0x90143C89) + -1048736592 - -1048736592;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)Integer.reverse(n2 ^ 0x5F6B25EB ^ 0x90143C89) ^ 0x65EC5464C3E7A0FDL ^ 0x65EC5464C3E7A0FDL);
                    }
                    continue block36;
                }
                case 1600857579: {
                    int cfr_ignored_4 = (Integer.rotateRight(0xE6983692 ^ n2, 15) + -255051031) * -426232173;
                    return f2;
                }
                case -1196537418: {
                    int cfr_ignored_5 = (Integer.rotateRight(0x61A6951B ^ n2, 15) + -678843008) * 1638307099;
                    f2 = f % Float.intBitsToFloat(Integer.rotateLeft(0xC82A315B ^ 0xC05CB15B, 3));
                    if (f2 >= Float.intBitsToFloat(67173354 - -1060307990)) {
                        n3 = Integer.reverse(n2 ^ 0xF1FBF6F2 ^ 0x90143C89) ^ 0xAAD25B67 ^ 0xAAD25B67;
                        int cfr_ignored_6 = (Integer.rotateLeft(0x716D1D34 ^ n2, 17) - -1064032121) * 1902976309;
                        n3 = Integer.reverse(n2 ^ 0x301B959A ^ 0x90143C89);
                        n += 5;
                        continue block36;
                    }
                    try {
                        n -= 3;
                        n3 = Integer.reverse(n2 ^ 0x6C8C639 ^ 0x90143C89);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.reverse(n2 ^ 0x6C8C639 ^ 0x90143C89) + 670490971 - 670490971;
                    }
                    n += 5;
                    continue block36;
                }
                case 807114138: {
                    int cfr_ignored_7 = (Integer.rotateLeft(0xE6F8D0F9 ^ n2, 15) + -58790558) * -419901191;
                    int cfr_ignored_8 = (int)(0x244A7EC427D4EB4FL ^ (long)n2 ^ 0xF8831A2DB9E545L);
                    f2 -= Float.intBitsToFloat(Integer.reverse(-901176049) ^ 0xB3109253);
                    n3 = Integer.reverse(n2 ^ 0x6C8C639 ^ 0x90143C89) + -1354692497 - -1354692497;
                    n -= 3;
                    continue block36;
                }
                case 747639831: {
                    int cfr_ignored_9 = (Integer.rotateRight(0xF2BE0093 ^ n2, 17) + 1767878920) * -222429037;
                    n3 = (int)((long)Integer.reverse(n2 ^ 0xF45BBA49 ^ 0x90143C89) ^ 0x2D0E8808C8859A13L ^ 0x2D0E8808C8859A13L);
                    int cfr_ignored_10 = (Integer.rotateLeft(0xA698DB10 ^ n2, 7) + 819996203) * -1499931887;
                    try {
                        n += 2;
                        if ((0x8BEAD193994C7BD9L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89) + 696335855 - 696335855;
                    }
                    n -= 3;
                    continue block36;
                }
                case 635516906: {
                    int cfr_ignored_11 = (Integer.rotateLeft(0xBC1827BC ^ n2, 10) - -884314369) * -1139267651;
                    int cfr_ignored_12 = (int)(0x1D39264771398946L ^ (long)n2 ^ 0xB1FE2EC0E9AB97A3L);
                    n3 = (int)((long)Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89) ^ 0x5A396CB02A29DB4AL ^ 0x5A396CB02A29DB4AL);
                    continue block36;
                }
                case -1494430232: {
                    int cfr_ignored_13 = Integer.rotateLeft(0x8FC49D89 ^ n2, 4) + 1831645906;
                    int cfr_ignored_14 = (int)(0x4D7633B427D4EB4FL ^ (long)n2 ^ 0x9A18831A2DB9373DL);
                    try {
                        if ((0xD7996BCF5C5F369FL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89)));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89) ^ 0x636CD50E ^ 0x636CD50E;
                    }
                    n += 2;
                    continue block36;
                }
                case 1523380697: {
                    int cfr_ignored_15 = (Integer.rotateLeft(0xED319C35 ^ n2, 16) - -1117812314) * -315515851;
                    int cfr_ignored_16 = (int)(0x2F83320827D4EB4FL ^ (long)n2 ^ 0x9960831A2DB9F2D7L);
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x901C8F2B ^ 0x90143C89) ^ 0x7AE2E2F0FB6B3913L ^ 0x7AE2E2F0FB6B3913L);
                    int cfr_ignored_17 = (Integer.rotateRight(0x21537097 ^ n2, 7) - 225984900) * 559116439;
                    n3 = (int)((long)Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89) ^ 0x3E1D9582373897D9L ^ 0x3E1D9582373897D9L);
                    n += 2;
                    continue block36;
                }
                case 1178948656: {
                    int cfr_ignored_18 = (Integer.rotateLeft(0xDB7F595D ^ n2, 14) - -1731628674) * -612411043;
                    int cfr_ignored_19 = (int)(0x19CDF76027D4EB4FL ^ (long)n2 ^ 0x13B0831A2DB99E4AL);
                    try {
                        if ((0xB4D76165DB1DC995L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89)));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89);
                    }
                    n -= 5;
                    continue block36;
                }
                case 1760268421: {
                    int cfr_ignored_20 = (Integer.rotateLeft(0xD29BA51D ^ n2, 13) - -2060018242) * -761551587;
                    int cfr_ignored_21 = (int)(0x10290B2027D4EB4FL ^ (long)n2 ^ 0xEB30831A2DB98D83L);
                    try {
                        if ((0xC4BF76EEE5D97D9DL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89) ^ 0x6368A91B ^ 0x6368A91B;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89) ^ 0x1BE2454F ^ 0x1BE2454F;
                    }
                    n += 3;
                    continue block36;
                }
                case -368133541: {
                    int cfr_ignored_22 = (Integer.rotateRight(0x82CBF052 ^ n2, 3) + -619726551) * -2100563885;
                    n3 = (int)((long)Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89) ^ 0x7E49E4F5F1431642L ^ 0x7E49E4F5F1431642L);
                    ++n;
                    continue block36;
                }
                case -1907544259: {
                    int cfr_ignored_23 = Integer.rotateLeft(0x5ACDD14D ^ n2, 14) - 55179150;
                    int cfr_ignored_24 = (int)(0x987F7F7027D4EB4FL ^ (long)n2 ^ 0x390831A2DB89D2FL);
                    int cfr_ignored_25 = (int)(0xB06DB6E296FD0BDBL ^ (long)n2 ^ 0x90B5E149EC90CD0AL);
                    n3 = Integer.reverse(n2 ^ 0x2B1902F5 ^ 0x90143C89) + -973328658 - -973328658;
                    int cfr_ignored_26 = (int)(0x37221111E4B6665DL ^ (long)n2 ^ 0xDF5305DF379DC395L);
                    n3 = Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89);
                    --n;
                    continue block36;
                }
                case 331261119: {
                    int cfr_ignored_27 = Integer.rotateRight(0xD4B81D0A ^ n2, 13) + -961993871;
                    n3 = Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89) + -851568163 - -851568163;
                    int cfr_ignored_28 = (Integer.rotateLeft(0xE610CC74 ^ n2, 15) - -530161337) * -435106699;
                    n += 5;
                    continue block36;
                }
                case -1703671496: {
                    int cfr_ignored_29 = Integer.rotateLeft(0x66C1BE28 ^ n2, 15) + 1976804883;
                    try {
                        n -= 4;
                        if ((0x353596499CCC7275L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89)));
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89) + -560413313 - -560413313;
                    }
                    n += 4;
                    continue block36;
                }
                case 1592803164: {
                    int cfr_ignored_30 = Integer.rotateLeft(0x6A69450C ^ n2, 16) - -417530961;
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x39B59417 ^ 0x90143C89)));
                    int cfr_ignored_31 = Integer.rotateRight(0xD8DE0F2E ^ n2, 14) - 1195472333;
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xB7F56FDB ^ 0x90143C89)));
                    int cfr_ignored_32 = (Integer.rotateLeft(0x251DCE58 ^ n2, 7) + -2097570845) * 622710361;
                    n3 = Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89) + -1549851836 - -1549851836;
                    n -= 2;
                    continue block36;
                }
                case 744364636: {
                    int cfr_ignored_33 = Integer.rotateLeft(0xF0A07664 ^ n2, 17) - 667678039;
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xFEAA69A8 ^ 0x90143C89)));
                    int cfr_ignored_34 = Integer.rotateRight(0x5FDD26CE ^ n2, 14) - -1608166867;
                    int cfr_ignored_35 = (int)(0xDCC18FF15C9044DBL ^ (long)n2 ^ 0xE292759372901452L);
                    n3 = Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89) ^ 0x67471E3B ^ 0x67471E3B;
                    n -= 5;
                    continue block36;
                }
                case -1573297217: {
                    int cfr_ignored_36 = Integer.rotateRight(0x6EA15167 ^ n2, 16) - 1776712372;
                    n3 = Integer.reverse(n2 ^ 0xF445D5E6 ^ 0x90143C89) + 1008402671 - 1008402671;
                    int cfr_ignored_37 = (Integer.rotateRight(0x5FA88517 ^ n2, 14) - -1715094268) * 1604879639;
                    try {
                        n -= 5;
                        if ((0x8422A7A2CEDA476BL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (int)((long)Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89) ^ 0xF1E833DA6FD7D749L ^ 0xF1E833DA6FD7D749L);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89) ^ 0x1BF513693392F6DAL ^ 0x1BF513693392F6DAL);
                    }
                    ++n;
                    continue block36;
                }
            }
            int cfr_ignored_38 = Integer.rotateLeft(0xC9883B61 ^ n2, 12) + 1809633274;
            int cfr_ignored_39 = (int)(0xB3A955C27D4EB4FL ^ (long)n2 ^ 0xD7C8831A2DB9BBA4L);
            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xB8AE49B6 ^ 0x90143C89)));
        }
    }

    private int ddhs_4() {
        int n = bbt.hnr(1421146386);
        int n2 = n ^ 0xDA8BCBEC;
        if ((n2 ^ n) != -628372500) {
            int cfr_ignored_0 = (Integer.rotateRight(0x8E3F32FE ^ n, 4) - 1040501757) * -1908460801;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null) {
            return -1;
        }
        for (int i = 0; i < Integer.rotateLeft(0xEF75C33 ^ 0xEF758B3, 25); ++i) {
            class_1792 class_17922;
            String string;
            class_1799 class_17992 = class_3102.field_1724.method_31548().method_5438(i);
            if (class_17992.method_7960() || !(string = class_7923.field_41178.method_10221((Object)(class_17922 = class_17992.method_7909())).method_12832()).contains("sign") || string.contains("hanging")) continue;
            return i;
        }
        return -1;
    }

    private List thd_8(class_1657 class_16572, List list) {
        try {
            int n = -1534967239;
            n = Integer.rotateLeft(n * -1494688379, 9) ^ 0xCC771B14;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x27BA901B;
            if ((n2 ^ n) != 666538011) {
                int cfr_ignored_0 = (0x8338D222 ^ n) - -1310640638;
            }
            if ((0x38D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_310 class_3102 = sw.zfs_4();
        if (class_3102.field_1724 == null || class_3102.field_1687 == null) {
            return list;
        }
        bghj bghj2 = bghj.tdhj_2();
        if (!bghj2.rgha_2() || bghj2.zsth_2.shzl()) {
            return list;
        }
        List list2 = sw.shst(bghj2, class_16572);
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList<class_2338> arrayList = new ArrayList<class_2338>();
        class_243 class_2432 = sw.aaf(class_3102.field_1724);
        for (class_2338 class_23382 : list) {
            boolean bl = false;
            for (class_2338 class_23383 : list2) {
                if (!sw.tzb_2(sw.drh_4(class_3102.field_1687, class_23383)) || !this.rdy_2(class_2432, class_23383.method_46558(), class_23382)) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            arrayList.add(class_23382);
        }
        return arrayList;
    }

    private boolean rdy_2(class_243 class_2432, class_243 class_2433, class_2338 class_23382) {
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

    private void zqn(bksh bksh2) {
        class_2693 class_26932;
        try {
            int n = 419981419;
            n = Integer.rotateLeft(n * 283253723, 8) ^ 0x209E4F2B;
            int n2 = n ^ 0x1E092ABC;
            if ((n2 ^ n) != 503917244) {
                int cfr_ignored_0 = (0x70142D7 ^ n) - -1643928749;
            }
            if ((0x2FB & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!this.rgha_2() || !this.khzy.shzl()) {
            return;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null || class_3102.field_1687 == null) {
            return;
        }
        class_2596 class_25962 = bksh2.asw();
        if (class_25962 instanceof class_2693 && this.sak.contains(class_25962 = (class_26932 = (class_2693)class_25962).method_11677())) {
            this.sak.remove(class_25962);
            class_3102.field_1724.field_3944.method_52787((class_2596)new class_2877((class_2338)class_25962, true, "\u00a7bMoondlc", "\u00a7cDestroy", "", ""));
            bksh2.dhtd_2();
        }
    }

    private static boolean ztkh(class_310 class_3102, class_2338 class_23382) {
        return class_3102.field_1687.method_8320(class_23382).method_45474();
    }

    private static boolean tmt_2(class_310 class_3102, class_2338 class_23382) {
        return class_3102.field_1687.method_8320(class_23382).method_45474();
    }

    private boolean sf() {
        int n = -45387104;
        n = Integer.rotateLeft(n * -57826981, 6) ^ 0xC2B7FC30;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 22);
        int n2 = n ^ 0xA212EC0B;
        if ((n2 ^ n) != -1575818229) {
            int cfr_ignored_0 = (0x5F599EAB ^ n) - -577769783;
        }
        return !this.thba_2.shzl();
    }

    private static String dhtl_2(String string, int n, int n2, int n3) {
        int n4 = 631536246;
        n4 = Integer.rotateLeft(n4 * 665275057, 10) ^ 0x8EAE443B;
        n4 = Integer.rotateRight(n ^ n4, 17);
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 6)) ^ 0xE4869959;
        if ((n5 ^ n4) != -460940967) {
            int cfr_ignored_0 = (0xC122E32F ^ n4) - -495597166;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x839EFF3C) + i ^ thshr, 17) ^ n2 + dmn));
        }
        return new String(cArray);
    }

    private static class_310 zrt_2() {
        block0: {
            int n = 1842368495;
            int n2 = (n = Integer.rotateLeft(n * 818790107, 24) ^ 0x9BA58DF4) ^ 0xEB9A276E;
            if ((n2 ^ n) == -342218898) break block0;
            int cfr_ignored_0 = (0x864A6881 ^ n) + 876886238;
        }
        return class_310.method_1551();
    }

    private static class_238 thnh(class_1657 class_16572) {
        block0: {
            int n = bbt.hnr(-61211770);
            class_1657 class_16573 = class_16572;
            n = Integer.rotateLeft((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 15);
            int n2 = n ^ 0xA0AF1275;
            if ((n2 ^ n) == -1599139211) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x5CF6E9F3 ^ n, 14) + 1178858408) * 1559685619;
        }
        return class_16572.method_5829();
    }

    private static int ztht(class_2338 class_23382) {
        block0: {
            int n = bbt.hnr(-1525047150);
            int n2 = n ^ 0x28B483A4;
            if ((n2 ^ n) == 682918820) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x8DAD2336 ^ n, 4) - 743760581) * -1918033097;
        }
        return class_23382.method_10263();
    }

    private static int dthth_2(class_2338 class_23382) {
        block0: {
            int n = bbt.hnr(909702546);
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0x6CC093F3;
            if ((n2 ^ n) == 1824560115) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x5AF86661 ^ n, 14) + 141690106;
            int cfr_ignored_1 = (int)(0x984AC85C27D4EB4FL ^ (long)n ^ 0x6DC8831A2DB89D44L);
        }
        return class_23382.method_10263();
    }

    private static int shrd(class_2338 class_23382) {
        block0: {
            int n = -1187254830;
            n = Integer.rotateLeft(n * -140183281, 24) ^ 0xFCCB58DD;
            class_2338 class_23383 = class_23382;
            n = Integer.rotateRight((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 28);
            int n2 = n ^ 0xDAF173D8;
            if ((n2 ^ n) == -621710376) break block0;
            int cfr_ignored_0 = (0x63CA9E0A ^ n) - 409479195;
        }
        return class_23382.method_10264();
    }

    private static int aja(class_2338 class_23382) {
        block0: {
            int n = 133818591;
            n = Integer.rotateLeft(n * -1236098631, 17) ^ 0xC9DD2A02;
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0x384DF935;
            if ((n2 ^ n) == 944634165) break block0;
            int cfr_ignored_0 = (0x3FB411EA ^ n) - -1862022310;
        }
        return class_23382.method_10264();
    }

    private static int jah_2(class_2338 class_23382) {
        block0: {
            int n = -1542523205;
            int n2 = (n = Integer.rotateLeft(n * -511084783, 8) ^ 0x7ABF47F0) ^ 0x2EDC2C9B;
            if ((n2 ^ n) == 786181275) break block0;
            int cfr_ignored_0 = (0x8AD2DA20 ^ n) - -889707414;
        }
        return class_23382.method_10260();
    }

    private static int rdb_2(class_2338 class_23382) {
        block0: {
            int n = 238645010;
            n = Integer.rotateLeft(n * -2002675755, 5) ^ 0xCD53B540;
            class_2338 class_23383 = class_23382;
            n = Integer.rotateLeft((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 5);
            int n2 = n ^ 0xD0C349FF;
            if ((n2 ^ n) == -792507905) break block0;
            int cfr_ignored_0 = (0xDEFA26ED ^ n) + 993823096;
        }
        return class_23382.method_10260();
    }

    private static double ssn_4(class_243 class_2432) {
        block0: {
            int n = 2117223034;
            int n2 = (n = Integer.rotateLeft(n * 572253349, 13) ^ 0x771C2AA5) ^ 0xDB1BCC66;
            if ((n2 ^ n) == -618935194) break block0;
            int cfr_ignored_0 = (0xA5298E1C ^ n) + -1511144906;
        }
        return class_2432.method_10214();
    }

    private static double ztk_4(class_243 class_2432) {
        block0: {
            int n = -878132392;
            int n2 = (n = Integer.rotateLeft(n * -611343881, 24) ^ 0xD3580FD4) ^ 0xDE50AA7B;
            if ((n2 ^ n) == -565138821) break block0;
            int cfr_ignored_0 = (0x15F86923 ^ n) - -1217177872;
        }
        return class_2432.method_10214();
    }

    private static double tas_4(class_243 class_2432) {
        block0: {
            int n = bbt.hnr(-687146185);
            class_243 class_2433 = class_2432;
            n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
            int n2 = n ^ 0x435015CF;
            if ((n2 ^ n) == 1129321935) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x945AEEF8 ^ n, 5) + -77557949) * -1805979911;
        }
        return class_2432.method_10214();
    }

    private static double aha_3(class_243 class_2432) {
        block0: {
            int n = -1282669456;
            int n2 = (n = Integer.rotateLeft(n * -784135213, 4) ^ 0xCB4F3393) ^ 0xA53F3D97;
            if ((n2 ^ n) == -1522582121) break block0;
            int cfr_ignored_0 = (0x16B339E7 ^ n) + -1211133728;
        }
        return class_2432.method_10214();
    }

    private static double zd_2(class_243 class_2432) {
        block0: {
            int n = bbt.hnr(712851567);
            int n2 = n ^ 0xCE3DDB64;
            if ((n2 ^ n) == -834806940) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xE4409B0B ^ n, 15) + -1473223280;
        }
        return class_2432.method_10216();
    }

    private static int bghy(double d) {
        block0: {
            int n = bbt.hnr(-1772733494);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 15);
            int n2 = n ^ 0x4A0BD75C;
            if ((n2 ^ n) == 1242290012) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xDC5DEC96 ^ n, 14) - -1279441563) * -597824361;
        }
        return class_3532.method_15357((double)d);
    }

    private static int hzh_4(class_2338 class_23382) {
        block0: {
            int n = 1784297745;
            int n2 = (n = Integer.rotateLeft(n * -1803067607, 11) ^ 0xFA58B7E8) ^ 0x1F17B454;
            if ((n2 ^ n) == 521647188) break block0;
            int cfr_ignored_0 = (0x754D8D45 ^ n) - -1927651906;
        }
        return class_23382.method_10263();
    }

    private static double abh_2(class_243 class_2432) {
        block0: {
            int n = -441403331;
            n = Integer.rotateLeft(n * 1219531631, 3) ^ 0xBD73BCFC;
            class_243 class_2433 = class_2432;
            n = Integer.rotateLeft((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 26);
            int n2 = n ^ 0xF1472E5B;
            if ((n2 ^ n) == -246993317) break block0;
            int cfr_ignored_0 = (0x14F79666 ^ n) - -886420596;
        }
        return class_2432.method_10214();
    }

    private static double ghth_2(class_243 class_2432) {
        block0: {
            int n = bbt.hnr(358862292);
            int n2 = n ^ 0xF0F67B7E;
            if ((n2 ^ n) == -252281986) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xE595B6AA ^ n, 15) + -780223023;
        }
        return class_2432.method_10214();
    }

    private static double stkh_3(class_243 class_2432) {
        block0: {
            int n = -1756634544;
            n = Integer.rotateLeft(n * -1255148289, 21) ^ 0xB15027BB;
            class_243 class_2433 = class_2432;
            n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
            int n2 = n ^ 0xC648F569;
            if ((n2 ^ n) == -968297111) break block0;
            int cfr_ignored_0 = (0x51031739 ^ n) + -1784634935;
        }
        return class_2432.method_10216();
    }

    private static double ant_2(class_243 class_2432) {
        block0: {
            int n = 1111254565;
            n = Integer.rotateLeft(n * -695518895, 11) ^ 0xEBD37C69;
            class_243 class_2433 = class_2432;
            n = Integer.rotateRight((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 5);
            int n2 = n ^ 0xF3EA0A14;
            if ((n2 ^ n) == -202765804) break block0;
            int cfr_ignored_0 = (0xB1D66C31 ^ n) - 940031948;
        }
        return class_2432.method_10215();
    }

    private static boolean hdb_2(tkhdh tkhdh2) {
        block0: {
            int n = 9822201;
            n = Integer.rotateLeft(n * -1674502229, 17) ^ 0x2BB4B9D4;
            tkhdh tkhdh3 = tkhdh2;
            n = (tkhdh3 != null ? System.identityHashCode(tkhdh3) : 0) ^ n;
            int n2 = n ^ 0xB5754344;
            if ((n2 ^ n) == -1250606268) break block0;
            int cfr_ignored_0 = (0xB5E09CBD ^ n) + 860834549;
        }
        return tkhdh2.rgha_2();
    }

    private static float ghdl(tay tay2) {
        block0: {
            int n = bbt.hnr(573687871);
            int n2 = n ^ 0x20E44EC;
            if ((n2 ^ n) == 34489580) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x203F8CD3 ^ n, 7) + -334517048) * 541035731;
        }
        return tay2.thw_5();
    }

    private static float sz_4(tay tay2) {
        block0: {
            int n = -874761804;
            n = Integer.rotateLeft(n * -32753533, 15) ^ 0x58A7E4EA;
            tay tay3 = tay2;
            n = Integer.rotateRight((tay3 != null ? System.identityHashCode(tay3) : 0) ^ n, 21);
            int n2 = n ^ 0xD60806CE;
            if ((n2 ^ n) == -704117042) break block0;
            int cfr_ignored_0 = (0x1DD4377A ^ n) - -135336845;
        }
        return tay2.thw_5();
    }

    private static float zghq(tay tay2) {
        block0: {
            int n = bbt.hnr(-906759847);
            int n2 = n ^ 0x9665BCA5;
            if ((n2 ^ n) == -1771717467) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x5F964DFC ^ n, 14) - -1752100673) * 1603685885;
        }
        return tay2.thw_5();
    }

    private static double thz_8(class_746 class_7462, class_1297 class_12972) {
        block0: {
            int n = -1666820093;
            n = Integer.rotateLeft(n * -513424075, 28) ^ 0x3A51EFF7;
            class_746 class_7463 = class_7462;
            n = Integer.rotateLeft((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 13);
            class_1297 class_12973 = class_12972;
            n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
            int n2 = n ^ 0x8D28D89C;
            if ((n2 ^ n) == -1926702948) break block0;
            int cfr_ignored_0 = (0x118E809F ^ n) + -1667626312;
        }
        return class_7462.method_5858(class_12972);
    }

    private static kh_3 rs(Moondlc moondlc) {
        block0: {
            int n = 1483264613;
            n = Integer.rotateLeft(n * -143124581, 6) ^ 0x94C9472C;
            Moondlc moondlc2 = moondlc;
            n = Integer.rotateRight((moondlc2 != null ? System.identityHashCode(moondlc2) : 0) ^ n, 14);
            int n2 = n ^ 0xB44AE70B;
            if ((n2 ^ n) == -1270159605) break block0;
            int cfr_ignored_0 = (0xEC22356E ^ n) - -1378214567;
        }
        return moondlc.getFriendManager();
    }

    private static float btl_2(int n) {
        block0: {
            int n2 = bbt.hnr(-1048321752);
            int n3 = n2 ^ 0xB5396ECC;
            if ((n3 ^ n2) == -1254527284) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x74BA8FE4 ^ n2, 17) - 653593559;
        }
        return Float.intBitsToFloat(n);
    }

    private static String zsl_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 4282818;
            n4 = Integer.rotateLeft(n4 * 297866267, 11) ^ 0x63CBA0C2;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 28);
            int n5 = (n4 = n3 ^ n4) ^ 0x9E8C3C58;
            if ((n5 ^ n4) == -1634976680) break block0;
            int cfr_ignored_0 = (0x9ECD659A ^ n4) + 464150903;
        }
        return sw.dhtl_2(string, n, n2, n3);
    }

    private static class_310 zfs_4() {
        block0: {
            int n = bbt.hnr(-2065292493);
            int n2 = n ^ 0xF7C067FC;
            if ((n2 ^ n) == -138385412) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x732644CF ^ n, 17) - -167775156;
        }
        return class_310.method_1551();
    }

    private static List shst(bghj bghj2, class_1657 class_16572) {
        block0: {
            int n = -1522214470;
            n = Integer.rotateLeft(n * 575431555, 19) ^ 0xAAD4F95;
            bghj bghj3 = bghj2;
            n = (bghj3 != null ? System.identityHashCode(bghj3) : 0) ^ n;
            class_1657 class_16573 = class_16572;
            n = Integer.rotateLeft((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 9);
            int n2 = n ^ 0x62DE7FEF;
            if ((n2 ^ n) == 1658748911) break block0;
            int cfr_ignored_0 = (0xC79AA655 ^ n) + 1703372406;
        }
        return bghj2.dzth_4(class_16572);
    }

    private static class_243 aaf(class_746 class_7462) {
        block0: {
            int n = bbt.hnr(-335498675);
            int n2 = n ^ 0x2BC5D37E;
            if ((n2 ^ n) == 734385022) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xC7C56133 ^ n, 11) + 893674600) * -943365837;
        }
        return class_7462.method_33571();
    }

    private static class_2680 drh_4(class_638 class_6382, class_2338 class_23382) {
        block0: {
            int n = bbt.hnr(-805233094);
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0x3B8A3DC1;
            if ((n2 ^ n) == 998915521) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xEB8B23FB ^ n, 16) + -1976108384) * -343202821;
        }
        return class_6382.method_8320(class_23382);
    }

    private static boolean tzb_2(class_2680 class_26802) {
        block0: {
            int n = 18964831;
            n = Integer.rotateLeft(n * -1947522049, 4) ^ 0x226B1250;
            class_2680 class_26803 = class_26802;
            n = (class_26803 != null ? System.identityHashCode(class_26803) : 0) ^ n;
            int n2 = n ^ 0x6DA0C072;
            if ((n2 ^ n) == 1839251570) break block0;
            int cfr_ignored_0 = (0x6C81A12D ^ n) + -2080828332;
        }
        return class_26802.method_45474();
    }

    private static String[] zjs(String string) {
        int n = 479298315;
        int n2 = (n = Integer.rotateLeft(n * -20424327, 27) ^ 0xE43FD4F7) ^ 0xBFE4E3C2;
        if ((n2 ^ n) != -1075518526) {
            int cfr_ignored_0 = (0xA37560C9 ^ n) - 734782290;
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

    private static CallSite dhkhz_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -511486680;
            n3 = Integer.rotateLeft(n3 * 1059012011, 4) ^ 0xBA3852CC;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 17);
            int n4 = n3 ^ 0xFF8F0643;
            if ((n4 ^ n3) != -7403965) {
                int cfr_ignored_0 = (0x1E0C536B ^ n3) + -1975707707;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ jghh ^ string.hashCode()) + (n2 + bhz) + i ^ jghh, 9) + bhz);
            }
            String[] stringArray = sw.zjs(new String(cArray));
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

    private static String[] kosg76zbsi(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite wqscb9o9e6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ mmmk1dsgg37vg ^ string.hashCode() ^ n2 + elxljcrtqpr ^ i * -1566410757 ^ mmmk1dsgg37vg, 28) ^ elxljcrtqpr));
            }
            String[] stringArray = sw.kosg76zbsi(new String(cArray));
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

