/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_2561
 *  net.minecraft.class_2596
 *  net.minecraft.class_2658
 *  net.minecraft.class_2678
 *  net.minecraft.class_2772
 *  net.minecraft.class_310
 *  net.minecraft.class_6373
 *  net.minecraft.class_642
 *  net.minecraft.class_7439
 *  net.minecraft.class_7827
 *  net.minecraft.class_8709
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2658;
import net.minecraft.class_2678;
import net.minecraft.class_2772;
import net.minecraft.class_310;
import net.minecraft.class_6373;
import net.minecraft.class_642;
import net.minecraft.class_7439;
import net.minecraft.class_7827;
import net.minecraft.class_8709;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bsd_4;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bksh;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bwf;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.qk;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Anticheat Detect", category=bzw.OTHER, desc="Detects server anticheat from packets, brand and text hints")
public class akh
extends bnq {
    private final tay dhmq = new tay(this, "Samples").shth_7(Float.intBitsToFloat(-1639371186 + -1573465678)).dhbs_2(Float.intBitsToFloat(1349190816 - 250283168)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(763089899 - -327429141));
    private final badh_2 sqq = new badh_2(this, "Brand").bts(true);
    private final badh_2 tnj = new badh_2(this, "Text Hints").bts(true);
    private final badh_2 khshdh = new badh_2(this, "Notify").bts(true);
    private final badh_2 shshs = new badh_2(this, "Auto Disable").bts(false);
    private final List hak = new ArrayList();
    private String dhss_4 = "";
    private String shms_2 = "";
    private int tthk;
    private boolean szt_3;
    private final bql<bksh> zjt = this::zhq_4;
    private static final int thja_2 = 591688510;
    private static final int zbz = -758776351;
    private static final int bzth = -373938260;
    private static final int daa_2 = 0x6CA6ACCC;
    private static final int lg2t0xhzul6 = 159900177;
    private static final int me4ch3eaj = -1902368049;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int dnkm97p5g;

    @Override
    public void nt() {
        int n = -25004281;
        n = Integer.rotateLeft(n * 2126354731, 10) ^ 0x15930DE3;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 26);
        int n2 = n ^ 0xE5413EBE;
        if ((n2 ^ n) != -448708930) {
            int cfr_ignored_0 = (0x1BC349B9 ^ n) + 316445593;
        }
        if (akh.ddq_4()) {
            throw null;
        }
        this.dssh_2();
        this.szt_3 = akh.mc.field_1724 != null && akh.mc.field_1687 != null;
        akh.sbr_2(this);
    }

    @Override
    public void nc() {
        int n = -1335169319;
        n = Integer.rotateLeft(n * -1377248385, 20) ^ 0x419FBF4B;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x79CDE938;
        if ((n2 ^ n) != 2043537720) {
            int cfr_ignored_0 = (0xC9A707E1 ^ n) - -2033678996;
        }
        akh.thsh_6(this);
    }

    private void nt_2(int n) {
        bsd_4 bsd2_3;
        int n2 = bwf.tkhw_2(1929496812);
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 19);
        int n3 = n2 ^ 0xA058F1F1;
        if ((n3 ^ n2) != -1604783631) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xD359391D ^ n2, 13) - -1674868290) * -749127395;
            int cfr_ignored_1 = (int)(0x11EB972027D4EB4FL ^ (long)n2 ^ 0xD330831A2DB98E06L);
        }
        this.hak.add(akh.dhth_7(n));
        int n4 = Math.round(akh.ssq_2(this.dhmq));
        if (this.hak.size() > n4) {
            this.hak.remove(0);
        }
        if (this.hak.size() >= Math.min(5, n4) && (bsd2_3 = this.tzkh()) != null) {
            this.dshsh(akh.adhs_2(bsd2_3), bsd2_3.confidence());
        }
    }

    private void shthm() {
        String string;
        int n = bwf.tkhw_2(-789217085);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 27);
        int n2 = n ^ 0x7E37AE7E;
        if ((n2 ^ n) != 2117578366) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xAEC22EBD ^ n, 8) - 769738782) * -1363005763;
            int cfr_ignored_1 = (int)(0x6C70808027D4EB4FL ^ (long)n ^ 0xFC70831A2DB97530L);
        }
        if (yf.dnkh()) {
            throw null;
        }
        String string2 = string = akh.shtz(mc) != null ? this.dlt_3(akh.mc.method_1558().field_3761) : "";
        if (string.isEmpty()) {
            return;
        }
        if (string.contains("hypixel")) {
            this.dshsh("Watchdog", -1336492491 - -1336492581);
        } else if (string.contains("grim") || akh.azh(string, "grimac")) {
            this.dshsh("Grim", 692710348 - 692710263);
        } else if (string.contains(akh.htl("ꮄ剬竌ʬष㆓", akh.da(203800196) ^ 0x9AAABAC1, Integer.reverse(1213435024) ^ 0x6AF8DEB2, 0xF6EBD594 ^ 0xD4BEF9AE))) {
            this.dshsh("Vulcan", 1390016871 + -1390016786);
        } else if (akh.sdl_3(string, "matrix")) {
            akh.dhst_4(this, "Matrix", 0xC0D17872 ^ 0xC0D17827);
        } else if (string.contains(akh.htl("䛇伳ញ翫②", 1788958200 - -554045353, akh.bhr_2(0x177B9BA2 ^ 0xEBCAC53A, 4), 1543723116 + -967715890))) {
            akh.zrr(this, "Polar", Integer.rotateLeft(0x6FEA45D0 ^ 0x47EA45D0, 9));
        }
    }

    private void ddh_3() {
        try {
            int n = 290135639;
            n = Integer.rotateLeft(n * 1369969639, 10) ^ 0xC76B8063;
            int n2 = n ^ 0x4DF70A99;
            if ((n2 ^ n) != 1308035737) {
                int cfr_ignored_0 = (0x5CBC14CE ^ n) - 1668189636;
            }
            if ((0x2C9 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (this.dhss_4.isEmpty()) {
            return;
        }
        if (this.dhss_4.contains("paper") || this.dhss_4.contains("purpur") || akh.khdz_3(this.dhss_4, akh.htl("뱓떻洛պừᙛ", 0x9C1C0165 ^ 0xD55B4AFA, akh.khnl(1561706613) ^ 0xC487E9AB, 0x18B9F6A7 ^ 0x96FEF8E0))) {
            this.dshsh("Server brand: " + this.dhss_4, Integer.reverse(-144463546) ^ 0x6295C6F6);
        }
        this.dhdl(this.dhss_4);
    }

    private void dhdl(String string) {
        String string2;
        try {
            int n = 1028378523;
            n = Integer.rotateLeft(n * -1848330223, 8) ^ 0x9FAB6891;
            n = System.identityHashCode(this) ^ n;
            String string3 = string;
            n = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 24);
            int n2 = n ^ 0xEA7DF002;
            if ((n2 ^ n) != -360845310) {
                int cfr_ignored_0 = (0xD7363F99 ^ n) + -1913081117;
            }
            if ((0xCA & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!akh.sqgh()) {
            yf.athz_2();
        }
        if (akh.rbq(string2 = this.dlt_3(string))) {
            return;
        }
        if (string2.contains("grimac") || akh.sjh_3(string2, akh.stq("grim anti", "cheat")) || akh.azq_2(string2, "[grim")) {
            this.dshsh("Grim", Integer.reverse(1260430869) ^ 0xA865048D);
        } else if (string2.contains("vulcan")) {
            this.dshsh("Vulcan", Integer.rotateLeft(0x978A1DCF ^ 0x978A1CB3, 30));
        } else if (string2.contains("matrix")) {
            this.dshsh(akh.htl("ᖀే⓫㲂뜀⾺", akh.ghdhj(0x9728F89C ^ 0x50D4CDAD, 2), Integer.rotateLeft(0x33F82997 ^ 0xE13D49E1, 12), Integer.rotateLeft(0x24B4A811 ^ 0xC8CB1829, 10)), 0x6CE9B1E ^ 0x6CE9B41);
        } else if (akh.dhfq(string2, "polar")) {
            this.dshsh(akh.htl("甠賴ꑎ尬ឦ", 0x416DBC25 ^ 0xE7607108, Integer.rotateLeft(0x78A84E0E ^ 0x226C9C1D, 24), akh.ztz_6(0xE9374E7B ^ 0x31C82E0A, 9)), 1996227104 - 1996227014);
        } else if (string2.contains("karhu")) {
            akh.tzm(this, "Karhu", Integer.reverse(520589594) ^ 0x5889E0A2);
        } else if (akh.shab_2(string2, "intave")) {
            this.dshsh("Intave", 0x71CDEF8F ^ 0x71CDEFD5);
        } else if (string2.contains("watchdog")) {
            this.dshsh("Watchdog", -1710636718 - -1710636808);
        } else if (string2.contains("verus")) {
            this.dshsh("Verus", 1004511148 + -1004511063);
        } else if (string2.contains("aac")) {
            this.dshsh("AAC", Integer.rotateLeft(0x1C709A84 ^ 0x1C649A84, 18));
        } else if (string2.contains("ncp") || string2.contains("no cheat plus") || string2.contains("nocheatplus")) {
            this.dshsh("NoCheatPlus", -776809206 - -776809286);
        }
    }

    private bsd_4 tzkh() {
        int n;
        int n2 = bwf.tkhw_2(1000738530);
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 10);
        int n3 = n2 ^ 0x16273C93;
        if ((n3 ^ n2) != 371670163) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x2D813271 ^ n2, 8) + -2029864214) * 763441777;
            int cfr_ignored_1 = (int)(0xEF339C4C27D4EB4FL ^ (long)n2 ^ 0xC5E8831A2DB873B6L);
        }
        if (this.hak.size() < 5) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (n = 1; n < this.hak.size(); ++n) {
            arrayList.add((Integer)this.hak.get(n) - (Integer)this.hak.get(n - 1));
        }
        n = (Integer)this.hak.get(0);
        if (this.khdhk(arrayList, 1)) {
            if (this.sskh_2(n, Integer.reverse(273161185) ^ 0x7827B114, Integer.reverse(926931036) ^ 0xC5E45FD6)) {
                return new bsd_4("Vulcan", -1716615364 - -1716615452);
            }
            if (this.sskh_2(n, 1152783503 - 1152783413, -392163645 + 392163755) || this.sskh_2(n, Integer.rotateLeft(0xF8C274AE ^ 0xA33D8A69, 6), -896587460 + 896567470)) {
                return new bsd_4("Matrix", Integer.reverse(1795230050) ^ 0x46908080);
            }
            if (this.sskh_2(n, Integer.rotateLeft(0xCC259CC6 ^ 0x33FA61F9, 26), 630625528 + -630658278)) {
                return new bsd_4("Grizzly", 0x71ABA082 ^ 0x71ABA0D0);
            }
            if (this.sskh_2(n, -625288140 - -625257360, Integer.rotateLeft(0x79255846 ^ 0x89D907B9, 19))) {
                return new bsd_4("Vulcan", Integer.reverse(-224754619) ^ 0xA2215901);
            }
            return new bsd_4("Verus", Integer.reverse(-770168475) ^ 0xA694180F);
        }
        if (this.khdhk(arrayList, -1)) {
            if (this.sskh_2(n, 1266023253 - 1266023261, 2)) {
                return new bsd_4("Grim", 0x3CBFF43E ^ 0x3CBFF46B);
            }
            if (this.sskh_2(n, Integer.reverse(-509822312) ^ 0xE6A2CDC4, Integer.reverse(-958099090) ^ 0x8976D331)) {
                return new bsd_4("Karhu", 112551146 + -112551064);
            }
            if (n < (Integer.reverse(789808322) ^ 0xBCDE3CBC)) {
                return new bsd_4("Intave", -835169585 - -835169663);
            }
            return new bsd_4("Polar", Integer.rotateLeft(0x5A8B9E9D ^ 0x5A8FFE9D, 20));
        }
        if (((Integer)this.hak.get(0)).equals(this.hak.get(1)) && this.shwq(2, 1)) {
            return new bsd_4("Verus", -603978510 - -603978592);
        }
        if ((Integer)arrayList.get(0) >= Integer.rotateLeft(0x8BC7F6FB ^ 0x8BC7F5DB, 29) && (Integer)arrayList.get(1) == -1 && this.shss_4(2, -1)) {
            return new bsd_4("Grim / ".concat("Polar"), 661939406 - 661939331);
        }
        if (n < 1843556585 - 1843559585 && this.hak.contains(0)) {
            return new bsd_4("Intave", 0x92574BF0 ^ 0x92574BB6);
        }
        if (this.hak.size() >= 4 && (Integer)this.hak.get(0) == 1173108492 - 1173139259 && (Integer)this.hak.get(1) == 950685675 - 950716441 && (Integer)this.hak.get(2) == Integer.rotateLeft(0x6E5CD04E ^ 0x888AAFB1, 18) && this.shwq(3, 1)) {
            return new bsd_4("Old Vulcan", Integer.rotateLeft(0xEBBF2623 ^ 0xEBBF2743, 30));
        }
        return null;
    }

    private boolean khdhk(List list, int n) {
        try {
            int n2 = -1226058500;
            n2 = Integer.rotateLeft(n2 * 1887372711, 19) ^ 0xD4635E24;
            int n3 = n2 ^ 0x575A4572;
            if ((n3 ^ n2) != 1465533810) {
                int cfr_ignored_0 = (0xE1B1918E ^ n2) + -1721376187;
            }
            if ((0x280 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (list.isEmpty()) {
            return false;
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            int n4 = (Integer)iterator.next();
            if (n4 == n) continue;
            return false;
        }
        return true;
    }

    private boolean shwq(int n, int n2) {
        int n3 = 1618009753;
        n3 = Integer.rotateLeft(n3 * -1307193963, 12) ^ 0xA5512E1D;
        n3 = Integer.rotateRight(System.identityHashCode(this) ^ n3, 23);
        int n4 = (n3 = Integer.rotateLeft(n ^ n3, 28)) ^ 0xB4361A59;
        if ((n4 ^ n3) != -1271522727) {
            int cfr_ignored_0 = (0xD446C4C0 ^ n3) + -389885892;
        }
        for (int i = n + 1; i < this.hak.size(); ++i) {
            if ((Integer)this.hak.get(i) - (Integer)this.hak.get(i - 1) == n2) continue;
            int n5 = 0;
            if (yf.tdhth_2() == 0) {
                n5 = n5 ^ 0x74EF;
            }
            return n5 != 0;
        }
        return true;
    }

    private boolean shss_4(int n, int n2) {
        int n3 = 2028784895;
        n3 = Integer.rotateLeft(n3 * 1213469509, 23) ^ 0x4E3D81E8;
        n3 = System.identityHashCode(this) ^ n3;
        int n4 = (n3 = n ^ n3) ^ 0xAAEBE668;
        if ((n4 ^ n3) != -1427380632) {
            int cfr_ignored_0 = (0xD2072A97 ^ n3) - -42220260;
        }
        for (int i = n; i < this.hak.size() - 1; ++i) {
            if ((Integer)this.hak.get(i + 1) - (Integer)this.hak.get(i) == n2) continue;
            int n5 = 0;
            if (yf.tdhth_2() == 0) {
                n5 = n5 ^ 0x3F9E;
            }
            return n5 != 0;
        }
        return true;
    }

    private boolean sskh_2(int n, int n2, int n3) {
        int n4 = bwf.tkhw_2(-1736268886);
        n4 = System.identityHashCode(this) ^ n4;
        int n5 = (n4 = Integer.rotateRight(n ^ n4, 13)) ^ 0x7730BC76;
        if ((n5 ^ n4) != 1999682678) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xEFB21FDC ^ n4, 16) - 183466719) * -273539107;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return n >= n2 && n <= n3;
    }

    private void dshsh(String string, int n) {
        try {
            int n2 = 1638613591;
            n2 = Integer.rotateLeft(n2 * -161136697, 13) ^ 0x670A8AB6;
            n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 20);
            String string2 = string;
            n2 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n2;
            int n3 = n2 ^ 0x865A6316;
            if ((n3 ^ n2) != -2040896746) {
                int cfr_ignored_0 = (0xE7F12141 ^ n2) + -917659982;
            }
            if ((0xFC & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (string == null || string.isBlank()) {
            return;
        }
        if (n < this.tthk && this.shms_2.equals(string)) {
            return;
        }
        boolean bl = !this.shms_2.equals(string) || n > this.tthk;
        this.shms_2 = string;
        this.tthk = Math.max(this.tthk, n);
        if (bl && this.khshdh.shzl()) {
            String string3 = string + " (" + this.tthk + "%)";
            if (akh.mc.field_1724 != null) {
                akh.mc.field_1724.method_7353((class_2561)class_2561.method_43470((String)(String.valueOf(class_124.field_1080) + "Anticheat detected: " + String.valueOf(class_124.field_1068) + string3)), false);
            }
            Moondlc.getInstance().getNotificationManager().khdhz_2(qk.shtdh_2, string3);
        }
        if (this.shshs.shzl() && this.tthk >= (0x7D916A86 ^ 0x7D916AD6)) {
            this.tskh_3();
        }
    }

    private String dlt_3(String string) {
        try {
            int n = -426129534;
            n = Integer.rotateLeft(n * 1634752265, 3) ^ 0xDBA53AEF;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xAA9CA325;
            if ((n2 ^ n) != -1432575195) {
                int cfr_ignored_0 = (0x4C0564A7 ^ n) + -627760769;
            }
            if ((0x191 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return string == null ? "" : string.toLowerCase(Locale.ROOT).replace("\u00a7", "").trim();
    }

    private void dssh_2() {
        int n = 0;
        int n2 = -1997500082;
        n2 = Integer.rotateLeft(n2 * -829112715, 4) ^ 0x89703F5D;
        int n3 = (n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047;
        block28: while (true) {
            switch (n3 - -918962047 ^ 0xC939C081 ^ n2) {
                case -1252337631: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x4EE06EBF ^ n2, 12) - -1853159332) * 1323331263;
                    if (yf.dnkh()) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xDD3C954C ^ 0xC939C081) + -918962047));
                        int cfr_ignored_1 = Integer.rotateLeft(0x7BA15FA5 ^ n2, 18) - -51891146;
                        int cfr_ignored_2 = (int)(0xB913F19827D4EB4FL ^ (long)n2 ^ 0x1E40831A2DB8DFF6L);
                        n -= 2;
                        continue block28;
                    }
                    try {
                        if ((0x2525779EF1A98723L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xB8FBD3F1 ^ 0xC939C081) + -918962047));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xB8FBD3F1 ^ 0xC939C081) + -918962047));
                    }
                    n -= 2;
                    continue block28;
                }
                case -1191455759: {
                    int cfr_ignored_3 = Integer.rotateLeft(0x31224A40 ^ n2, 9) + -142304005;
                    this.hak.clear();
                    this.dhss_4 = "";
                    this.shms_2 = "";
                    this.tthk = 0;
                    this.szt_3 = false;
                    return;
                }
                case -583232180: {
                    int cfr_ignored_4 = Integer.rotateRight(0x761280B ^ n2, 3) + -383682416;
                    throw null;
                }
                case 1683244623: {
                    int cfr_ignored_5 = (Integer.rotateRight(0x339AC852 ^ n2, 9) + 1142677801) * 865781843;
                    try {
                        n -= 4;
                        if ((0xE0A41081268F51E3L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047;
                    }
                    n -= 3;
                    continue block28;
                }
                case 1054808099: {
                    int cfr_ignored_6 = (Integer.rotateRight(0x3B72B19A ^ n2, 10) + 927015137) * 997372315;
                    n3 = (n2 ^ 0x1899B222 ^ 0xC939C081) + -918962047 ^ 0xF0F13E92 ^ 0xF0F13E92;
                    int cfr_ignored_7 = Integer.rotateRight(0x207F9B22 ^ n2, 7) + -204380071;
                    n3 = (n2 ^ 0x47ED30B4 ^ 0xC939C081) + -918962047 + -516493290 - -516493290;
                    int cfr_ignored_8 = Integer.rotateLeft(0x635CBD88 ^ n2, 15) + 211325619;
                    n3 = (int)((long)((n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047) ^ 0x10ED94A81723D71AL ^ 0x10ED94A81723D71AL);
                    continue block28;
                }
                case 65679736: {
                    int cfr_ignored_9 = Integer.rotateLeft(0xE3E3B425 ^ n2, 15) - -1661964362;
                    int cfr_ignored_10 = (int)(0x21511A1827D4EB4FL ^ (long)n2 ^ 0xC940831A2DB9EF73L);
                    n3 = (int)((long)((n2 ^ 0x8D05A1D7 ^ 0xC939C081) + -918962047) ^ 0xC679286FA8932316L ^ 0xC679286FA8932316L);
                    int cfr_ignored_11 = (Integer.rotateLeft(0xFF42E3DC ^ n2, 18) - -310954273) * -12393507;
                    try {
                        n -= 4;
                        if ((0x8FA75CDD5A5CEFB9L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (int)((long)((n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047) ^ 0x8020F33D60B65D8EL ^ 0x8020F33D60B65D8EL);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047 + 974667689 - 974667689;
                    }
                    n += 5;
                    continue block28;
                }
                case 42440751: {
                    int cfr_ignored_12 = (Integer.rotateRight(0x4564A37A ^ n2, 11) + 1804430081) * 1164223355;
                    int cfr_ignored_13 = (int)(0x49FADFE3A6708E6BL ^ (long)n2 ^ 0x42B78052E7F13E24L);
                    n3 = (int)((long)((n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047) ^ 0x923DA59EAB7B9FDDL ^ 0x923DA59EAB7B9FDDL);
                    --n;
                    continue block28;
                }
                case -1151829934: {
                    int cfr_ignored_14 = Integer.rotateLeft(0x6CC05A01 ^ n2, 16) + 799573338;
                    int cfr_ignored_15 = (int)(0xAE72F43C27D4EB4FL ^ (long)n2 ^ 0x1508831A2DB8F134L);
                    n3 = (n2 ^ 0xCC678149 ^ 0xC939C081) + -918962047 ^ 0x8871BE26 ^ 0x8871BE26;
                    int cfr_ignored_16 = (Integer.rotateLeft(0xB2CD0330 ^ n2, 9) + -1422851573) * -1295187151;
                    try {
                        n += 2;
                        if ((0x9CF7491AB71256CFL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047 ^ 0xA79C8406 ^ 0xA79C8406;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047));
                    }
                    continue block28;
                }
                case 908749904: {
                    int cfr_ignored_17 = Integer.rotateRight(0xB1979EAA ^ n2, 9) + -2051418671;
                    n3 = (n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047 + -831008188 - -831008188;
                    n += 4;
                    continue block28;
                }
                case 1055590221: {
                    int cfr_ignored_18 = (Integer.rotateRight(0x41BFC9F2 ^ n2, 11) + -90762359) * 1103088115;
                    n3 = (n2 ^ 0xA09092F6 ^ 0xC939C081) + -918962047 ^ 0x6F4DBE9D ^ 0x6F4DBE9D;
                    int cfr_ignored_19 = Integer.rotateLeft(0xCD067648 ^ n2, 12) + -668601869;
                    int cfr_ignored_20 = (int)(0x66871C5AC71F8E1BL ^ (long)n2 ^ 0xC5C5428CE71160DFL);
                    n3 = (int)((long)((n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047) ^ 0x7CDE363300A61D64L ^ 0x7CDE363300A61D64L);
                    n -= 4;
                    continue block28;
                }
                case 2100005320: {
                    int cfr_ignored_21 = (Integer.rotateRight(0xBDDEF156 ^ n2, 10) - 39639205) * -1109462697;
                    n3 = (int)((long)((n2 ^ 0x3664FFB6 ^ 0xC939C081) + -918962047) ^ 0x570A81EB0E3BCF8EL ^ 0x570A81EB0E3BCF8EL);
                    int cfr_ignored_22 = (Integer.rotateRight(0x8F06BD9B ^ n2, 4) + 1445893376) * -1895383653;
                    int cfr_ignored_23 = (int)(0xDA1EED1703053192L ^ (long)n2 ^ 0x275ECAB9980219ECL);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047));
                    n -= 4;
                    continue block28;
                }
                case -1650686852: {
                    int cfr_ignored_24 = Integer.rotateRight(0x659D42EA ^ n2, 15) + 1382594961;
                    int cfr_ignored_25 = (int)(0xEC2093F3942C30CDL ^ (long)n2 ^ 0xDA97E4EB9ABC7590L);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047));
                    --n;
                    continue block28;
                }
                case -583329459: {
                    int cfr_ignored_26 = Integer.rotateRight(0x31DB6EEE ^ n2, 9) - 233836045;
                    try {
                        if ((0xB0B6F9B718B7C99FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047 + -1242046108 - -1242046108;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047 + 416645752 - 416645752;
                    }
                    continue block28;
                }
                case 1057068846: {
                    int cfr_ignored_27 = (Integer.rotateLeft(0xD8AC6171 ^ n2, 14) + 1094544362) * -659791503;
                    int cfr_ignored_28 = (int)(0x1A1ECF4C27D4EB4FL ^ (long)n2 ^ 0x63E8831A2DB999ECL);
                    n3 = (n2 ^ 0x4C2A7552 ^ 0xC939C081) + -918962047;
                    int cfr_ignored_29 = (Integer.rotateRight(0x5FEB667E ^ n2, 14) - -1579218819) * 1609262719;
                    try {
                        n3 = (n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047 ^ 0x1FC241C2 ^ 0x1FC241C2;
                    }
                    continue block28;
                }
            }
            int cfr_ignored_30 = (Integer.rotateLeft(0xD6457F4 ^ n2, 4) - -1551612473) * 224679925;
            n3 = Integer.reverse(Integer.reverse((n2 ^ 0xB55AD821 ^ 0xC939C081) + -918962047));
        }
    }

    private void zhq_4(bksh bksh2) {
        class_2596 class_25962;
        class_2658 class_26582;
        class_2596 class_25963;
        int n = -1565209644;
        n = Integer.rotateLeft(n * 172629839, 7) ^ 0x2D82A213;
        bksh bksh3 = bksh2;
        n = (bksh3 != null ? System.identityHashCode(bksh3) : 0) ^ n;
        int n2 = n ^ 0x871A4DC8;
        if ((n2 ^ n) != -2028319288) {
            int cfr_ignored_0 = (0x25AE861C ^ n) + -1312134505;
        }
        if (bksh2.asw() instanceof class_2678) {
            this.dssh_2();
            this.szt_3 = true;
            this.shthm();
            return;
        }
        if (this.sqq.shzl() && (class_25963 = bksh2.asw()) instanceof class_2658 && (class_25963 = (class_26582 = (class_2658)class_25963).comp_1646()) instanceof class_8709) {
            class_25962 = (class_8709)class_25963;
            this.dhss_4 = this.dlt_3(class_25962.comp_1677());
            this.ddh_3();
        }
        if (this.szt_3 && (class_25962 = bksh2.asw()) instanceof class_6373) {
            class_26582 = (class_6373)class_25962;
            this.nt_2(class_26582.method_36950());
        }
        if (this.tnj.shzl()) {
            class_2596 class_25964 = bksh2.asw();
            if (class_25964 instanceof class_7439) {
                class_26582 = (class_7439)class_25964;
                this.dhdl(class_26582.comp_763().getString());
            } else {
                class_25964 = bksh2.asw();
                if (class_25964 instanceof class_7827) {
                    class_25962 = (class_7827)class_25964;
                    this.dhdl(class_25962.comp_1097().getString());
                } else {
                    class_25964 = bksh2.asw();
                    if (class_25964 instanceof class_2772) {
                        class_25963 = (class_2772)class_25964;
                        this.dhdl(class_25963.comp_2282().getString() + " " + class_25963.comp_2283().getString());
                    }
                }
            }
        }
    }

    private static String htl(String string, int n, int n2, int n3) {
        int n4 = -1745096878;
        n4 = Integer.rotateLeft(n4 * -1865039895, 20) ^ 0xEEE41299;
        n4 = n ^ n4;
        int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 8)) ^ 0xA2883A71;
        if ((n5 ^ n4) != -1568130447) {
            int cfr_ignored_0 = (0x3573D523 ^ n4) + -1262664073;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xBC83BF71 ^ n2 - i) + zbz, 21) ^ thja_2 + i * 1197404055));
        }
        return new String(cArray);
    }

    private static boolean ddq_4() {
        block0: {
            int n = -1657248338;
            int n2 = (n = Integer.rotateLeft(n * 1010388867, 24) ^ 0x161C2E4) ^ 0xD129218F;
            if ((n2 ^ n) == -785833585) break block0;
            int cfr_ignored_0 = (0x4C114421 ^ n) + -1278715720;
        }
        return yf.dnkh();
    }

    private static void sbr_2(akh akh2) {
        int n = -37033440;
        n = Integer.rotateLeft(n * 1320569311, 14) ^ 0xEDA5E208;
        akh akh3 = akh2;
        n = Integer.rotateRight((akh3 != null ? System.identityHashCode(akh3) : 0) ^ n, 13);
        int n2 = n ^ 0xD7C44E1A;
        if ((n2 ^ n) != -675000806) {
            int cfr_ignored_0 = (0x2A0EA43A ^ n) + -1663633167;
        }
        akh2.shthm();
    }

    private static void thsh_6(akh akh2) {
        int n = bwf.tkhw_2(1667932709);
        akh akh3 = akh2;
        n = Integer.rotateLeft((akh3 != null ? System.identityHashCode(akh3) : 0) ^ n, 15);
        int n2 = n ^ 0x38BAD96D;
        if ((n2 ^ n) != 951769453) {
            int cfr_ignored_0 = Integer.rotateLeft(0x5BD07B48 ^ n, 14) + 580685043;
        }
        akh2.dssh_2();
    }

    private static Integer dhth_7(int n) {
        block0: {
            int n2 = 1749062281;
            n2 = Integer.rotateLeft(n2 * -2034849243, 6) ^ 0x3601F2B7;
            int n3 = (n2 = n ^ n2) ^ 0xB6D02E11;
            if ((n3 ^ n2) == -1227870703) break block0;
            int cfr_ignored_0 = (0xDE90BC98 ^ n2) + -884407706;
        }
        return n;
    }

    private static float ssq_2(tay tay2) {
        block0: {
            int n = 1851739730;
            n = Integer.rotateLeft(n * 1716890883, 22) ^ 0x7631F3BB;
            tay tay3 = tay2;
            n = (tay3 != null ? System.identityHashCode(tay3) : 0) ^ n;
            int n2 = n ^ 0x94928B79;
            if ((n2 ^ n) == -1802335367) break block0;
            int cfr_ignored_0 = (0xFACDC52B ^ n) - 46120158;
        }
        return tay2.thw_5();
    }

    private static String adhs_2(bsd_4 bsd2_3) {
        block0: {
            int n = -925067324;
            n = Integer.rotateLeft(n * -292944793, 11) ^ 0xC72EDCC4;
            bsd_4 bsd3_3 = bsd2_3;
            n = Integer.rotateRight((bsd3_3 != null ? System.identityHashCode(bsd3_3) : 0) ^ n, 18);
            int n2 = n ^ 0x73028A3E;
            if ((n2 ^ n) == 1929546302) break block0;
            int cfr_ignored_0 = (0xBBDE1DFA ^ n) + 172973882;
        }
        return bsd2_3.name();
    }

    private static class_642 shtz(class_310 class_3102) {
        block0: {
            int n = 1421260142;
            n = Integer.rotateLeft(n * -1100994221, 9) ^ 0x8C250FEC;
            class_310 class_3103 = class_3102;
            n = (class_3103 != null ? System.identityHashCode(class_3103) : 0) ^ n;
            int n2 = n ^ 0x21C08F37;
            if ((n2 ^ n) == 566267703) break block0;
            int cfr_ignored_0 = (0x75763A59 ^ n) - 295568593;
        }
        return class_3102.method_1558();
    }

    private static String smkh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -46394254;
            n4 = Integer.rotateLeft(n4 * -1690486357, 12) ^ 0xAB9C821B;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 27);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 18)) ^ 0x597C98DD;
            if ((n5 ^ n4) == 1501337821) break block0;
            int cfr_ignored_0 = (0xA4408CAF ^ n4) + -481628650;
        }
        return akh.htl(string, n, n2, n3);
    }

    private static String tthz_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bwf.tkhw_2(604198008);
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 7);
            int n5 = n4 ^ 0x57FC9373;
            if ((n5 ^ n4) == 1476170611) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x73FFC70B ^ n4, 17) + 274119056;
        }
        return akh.htl(string, n, n2, n3);
    }

    private static boolean azh(String string, CharSequence charSequence) {
        block0: {
            int n = -19233841;
            n = Integer.rotateLeft(n * 199126657, 13) ^ 0x355FC880;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 24);
            CharSequence charSequence2 = charSequence;
            n = Integer.rotateLeft((charSequence2 != null ? System.identityHashCode(charSequence2) : 0) ^ n, 15);
            int n2 = n ^ 0x637FFC7A;
            if ((n2 ^ n) == 1669332090) break block0;
            int cfr_ignored_0 = (0x9DA57FB5 ^ n) + 516022568;
        }
        return string.contains(charSequence);
    }

    private static String hab(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bwf.tkhw_2(726642835);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 21)) ^ 0x4ADA6DAE;
            if ((n5 ^ n4) == 1255828910) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x6195DD3D ^ n4, 15) - -712808034) * 1637211453;
            int cfr_ignored_1 = (int)(0xA327730027D4EB4FL ^ (long)n4 ^ 0x1B70831A2DB8EB9FL);
        }
        return akh.htl(string, n, n2, n3);
    }

    private static int da(int n) {
        block0: {
            int n2 = bwf.tkhw_2(-1902707295);
            int n3 = n2 ^ 0xD193FD10;
            if ((n3 ^ n2) == -778830576) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x5F0500B1 ^ n2, 14) + -2047298390) * 1594163377;
            int cfr_ignored_1 = (int)(0x9DB7AE8C27D4EB4FL ^ (long)n2 ^ 0xA068831A2DB896BEL);
        }
        return Integer.reverse(n);
    }

    private static boolean sdl_3(String string, CharSequence charSequence) {
        block0: {
            int n = 1296704662;
            n = Integer.rotateLeft(n * -690945579, 5) ^ 0x938FE785;
            CharSequence charSequence2 = charSequence;
            n = Integer.rotateLeft((charSequence2 != null ? System.identityHashCode(charSequence2) : 0) ^ n, 5);
            int n2 = n ^ 0x8E760FCA;
            if ((n2 ^ n) == -1904865334) break block0;
            int cfr_ignored_0 = (0xC33C2B5C ^ n) + 1567178900;
        }
        return string.contains(charSequence);
    }

    private static String zky_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1820271663;
            n4 = Integer.rotateLeft(n4 * 1238385671, 23) ^ 0x966610C3;
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 17)) ^ 0x9507B96D;
            if ((n5 ^ n4) == -1794655891) break block0;
            int cfr_ignored_0 = (0x68762BC ^ n4) - 986574454;
        }
        return akh.htl(string, n, n2, n3);
    }

    private static void dhst_4(akh akh2, String string, int n) {
        int n2 = -1969453303;
        n2 = Integer.rotateLeft(n2 * 225849983, 15) ^ 0x92765827;
        akh akh3 = akh2;
        n2 = Integer.rotateRight((akh3 != null ? System.identityHashCode(akh3) : 0) ^ n2, 19);
        int n3 = (n2 = Integer.rotateLeft(n ^ n2, 27)) ^ 0xEF510A73;
        if ((n3 ^ n2) != -279901581) {
            int cfr_ignored_0 = (0x65CD8D7A ^ n2) - -1736585299;
        }
        akh2.dshsh(string, n);
    }

    private static int bhr_2(int n, int n2) {
        block0: {
            int n3 = -729476888;
            int n4 = (n3 = Integer.rotateLeft(n3 * 810874465, 20) ^ 0x7E5D1ED5) ^ 0x84511D9;
            if ((n4 ^ n3) == 138744281) break block0;
            int cfr_ignored_0 = (0xDCC00131 ^ n3) - 936533103;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static void zrr(akh akh2, String string, int n) {
        int n2 = bwf.tkhw_2(2086464764);
        String string2 = string;
        n2 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n2;
        int n3 = (n2 = Integer.rotateRight(n ^ n2, 16)) ^ 0xDD5F9594;
        if ((n3 ^ n2) != -580938348) {
            int cfr_ignored_0 = Integer.rotateLeft(0xA1037968 ^ n2, 7) + -2083958061;
        }
        akh2.dshsh(string, n);
    }

    private static int khnl(int n) {
        block0: {
            int n2 = bwf.tkhw_2(-26570993);
            int n3 = (n2 = n ^ n2) ^ 0x1F43C72A;
            if ((n3 ^ n2) == 524535594) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xE1294825 ^ n2, 15) - 1214077878;
            int cfr_ignored_1 = (int)(0x239BE61827D4EB4FL ^ (long)n2 ^ 0x3140831A2DB9EAE6L);
        }
        return Integer.reverse(n);
    }

    private static boolean khdz_3(String string, CharSequence charSequence) {
        block0: {
            int n = 1532351268;
            n = Integer.rotateLeft(n * -1181047229, 23) ^ 0x5B446CAE;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            CharSequence charSequence2 = charSequence;
            n = (charSequence2 != null ? System.identityHashCode(charSequence2) : 0) ^ n;
            int n2 = n ^ 0x12D12EDC;
            if ((n2 ^ n) == 315698908) break block0;
            int cfr_ignored_0 = (0x4984FDF8 ^ n) + 882583589;
        }
        return string.contains(charSequence);
    }

    private static boolean sqgh() {
        block0: {
            int n = bwf.tkhw_2(1245180759);
            int n2 = n ^ 0x1F8D0522;
            if ((n2 ^ n) == 529335586) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x55BAF675 ^ n, 13) - 1711372134) * 1438316149;
            int cfr_ignored_1 = (int)(0x9708584827D4EB4FL ^ (long)n ^ 0x4DE0831A2DB883C1L);
        }
        return yf.khdha_2();
    }

    private static boolean rbq(String string) {
        block0: {
            int n = -1959725134;
            n = Integer.rotateLeft(n * -1999116549, 14) ^ 0x9CBF5684;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 27);
            int n2 = n ^ 0xB01D56E7;
            if ((n2 ^ n) == -1340254489) break block0;
            int cfr_ignored_0 = (0x3B2DA155 ^ n) + 1143263806;
        }
        return string.isEmpty();
    }

    private static String ghdd_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 541672162;
            n4 = Integer.rotateLeft(n4 * -1023132407, 19) ^ 0xEDE01B60;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 20);
            int n5 = (n4 = n ^ n4) ^ 0xED22A4D7;
            if ((n5 ^ n4) == -316496681) break block0;
            int cfr_ignored_0 = (0xCD6BE635 ^ n4) - -1186627409;
        }
        return akh.htl(string, n, n2, n3);
    }

    private static String stq(String string, String string2) {
        block0: {
            int n = -761344505;
            n = Integer.rotateLeft(n * 81732301, 19) ^ 0x7FBB6C67;
            String string3 = string;
            n = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 4);
            String string4 = string2;
            n = Integer.rotateRight((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 19);
            int n2 = n ^ 0x31DCF44E;
            if ((n2 ^ n) == 836564046) break block0;
            int cfr_ignored_0 = (0xE3423A49 ^ n) + -683640136;
        }
        return string.concat(string2);
    }

    private static boolean sjh_3(String string, CharSequence charSequence) {
        block0: {
            int n = -1085339687;
            n = Integer.rotateLeft(n * -1656658333, 21) ^ 0xAB7FD8C2;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 17);
            int n2 = n ^ 0xFDD7CD50;
            if ((n2 ^ n) == -36188848) break block0;
            int cfr_ignored_0 = (0x4298CA89 ^ n) - 1001752713;
        }
        return string.contains(charSequence);
    }

    private static boolean azq_2(String string, CharSequence charSequence) {
        block0: {
            int n = -1055345470;
            int n2 = (n = Integer.rotateLeft(n * 298221549, 20) ^ 0xB56EAC37) ^ 0xE5C5EEB4;
            if ((n2 ^ n) == -440013132) break block0;
            int cfr_ignored_0 = (0x24DD5A76 ^ n) + 1239258052;
        }
        return string.contains(charSequence);
    }

    private static String bnz(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1572765200;
            n4 = Integer.rotateLeft(n4 * 95927679, 12) ^ 0x565BEDFF;
            int n5 = (n4 = n ^ n4) ^ 0xA70BB064;
            if ((n5 ^ n4) == -1492406172) break block0;
            int cfr_ignored_0 = (0xFAB5CE74 ^ n4) + 1663279483;
        }
        return akh.htl(string, n, n2, n3);
    }

    private static int ghdhj(int n, int n2) {
        block0: {
            int n3 = 253266406;
            n3 = Integer.rotateLeft(n3 * 843229479, 12) ^ 0xF202D3BA;
            n3 = Integer.rotateLeft(n ^ n3, 29);
            int n4 = (n3 = n2 ^ n3) ^ 0x76360E61;
            if ((n4 ^ n3) == 1983254113) break block0;
            int cfr_ignored_0 = (0x792E8787 ^ n3) + -70663069;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String azw_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bwf.tkhw_2(-1817534229);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 23)) ^ 0x9C9C1076;
            if ((n5 ^ n4) == -1667493770) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xF36B09D ^ n4, 4) - -604175810) * 255242397;
            int cfr_ignored_1 = (int)(0xCD841EA027D4EB4FL ^ (long)n4 ^ 0xC030831A2DB836D9L);
        }
        return akh.htl(string, n, n2, n3);
    }

    private static boolean dhfq(String string, CharSequence charSequence) {
        block0: {
            int n = -259135150;
            n = Integer.rotateLeft(n * 455208801, 23) ^ 0x4C8B84E3;
            CharSequence charSequence2 = charSequence;
            n = (charSequence2 != null ? System.identityHashCode(charSequence2) : 0) ^ n;
            int n2 = n ^ 0x9BC419BE;
            if ((n2 ^ n) == -1681647170) break block0;
            int cfr_ignored_0 = (0x6B49F0EC ^ n) - -464797910;
        }
        return string.contains(charSequence);
    }

    private static int ztz_6(int n, int n2) {
        block0: {
            int n3 = 1153737313;
            n3 = Integer.rotateLeft(n3 * 1542850651, 17) ^ 0xEE67BA5F;
            n3 = n ^ n3;
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 21)) ^ 0x43EF8417;
            if ((n4 ^ n3) == 1139770391) break block0;
            int cfr_ignored_0 = (0x72B2676 ^ n3) - -1465392408;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static void tzm(akh akh2, String string, int n) {
        int n2 = bwf.tkhw_2(1190072434);
        akh akh3 = akh2;
        n2 = (akh3 != null ? System.identityHashCode(akh3) : 0) ^ n2;
        String string2 = string;
        n2 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n2, 12);
        int n3 = n2 ^ 0x574A8FB3;
        if ((n3 ^ n2) != 1464504243) {
            int cfr_ignored_0 = Integer.rotateLeft(0x11A59FC1 ^ n2, 5) + 661387162;
            int cfr_ignored_1 = (int)(0xD31731FC27D4EB4FL ^ (long)n2 ^ 0x9E88831A2DB80BFFL);
        }
        akh2.dshsh(string, n);
    }

    private static boolean shab_2(String string, CharSequence charSequence) {
        block0: {
            int n = -685350695;
            n = Integer.rotateLeft(n * -58535853, 11) ^ 0xE5A80290;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            CharSequence charSequence2 = charSequence;
            n = (charSequence2 != null ? System.identityHashCode(charSequence2) : 0) ^ n;
            int n2 = n ^ 0xE203BE27;
            if ((n2 ^ n) == -503071193) break block0;
            int cfr_ignored_0 = (0x3525DEFE ^ n) + -1525301964;
        }
        return string.contains(charSequence);
    }

    private static String[] khyk(String string) {
        block0: {
            int n = 858465919;
            n = Integer.rotateLeft(n * 172236695, 10) ^ 0xBE5EFA50;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x20670CE7;
            if ((n2 ^ n) == 543624423) break block0;
            int cfr_ignored_0 = (0x134C2A98 ^ n) - -102134675;
        }
        return string.split("\u0004\u0018", -1);
    }

    private static CallSite adl_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1530595315;
            n3 = Integer.rotateLeft(n3 * -18990777, 28) ^ 0x84C5008C;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 26);
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xE4215800;
            if ((n4 ^ n3) != -467576832) {
                int cfr_ignored_0 = (0xBF1A5FF3 ^ n3) + 1284869597;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ bzth ^ string.hashCode() ^ n2 + daa_2 + i * -2089424799) + bzth) ^ daa_2));
            }
            String[] stringArray = akh.khyk(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] mg2t9oy22gf(String string) {
        return string.split("\b\u0012", -1);
    }

    private static CallSite zw67r5ln(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ lg2t0xhzul6 ^ string.hashCode()) + (n2 + me4ch3eaj) + i ^ lg2t0xhzul6, 13) + me4ch3eaj);
            }
            String[] stringArray = akh.mg2t9oy22gf(new String(cArray));
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

