/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1703
 *  net.minecraft.class_1707
 *  net.minecraft.class_1713
 *  net.minecraft.class_1735
 *  net.minecraft.class_1738
 *  net.minecraft.class_1747
 *  net.minecraft.class_1766
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1812
 *  net.minecraft.class_1829
 *  net.minecraft.class_476
 *  net.minecraft.class_9323
 *  net.minecraft.class_9334
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1738;
import net.minecraft.class_1747;
import net.minecraft.class_1766;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1812;
import net.minecraft.class_1829;
import net.minecraft.class_476;
import net.minecraft.class_9323;
import net.minecraft.class_9334;
import us.m0vy.moondlc.m0vyguard.bbd_2;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tst_2;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Chest Stealer", category=bzw.OTHER, desc="Automatically takes selected items from containers")
public class hh_2
extends bnq {
    private final tay rghdh = new tay(this, "Start Delay").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(0x3A953675 ^ 0x7EEF3675)).rkh_3(Float.intBitsToFloat(742931843 + 360694397)).ssd_5(Float.intBitsToFloat(Integer.reverse(1888550714) ^ 0x1FE9090E));
    private final tay bk = new tay(this, "Item Delay").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(127734989 - -1012722483)).rkh_3(Float.intBitsToFloat(530421007 + 553806577)).ssd_5(Float.intBitsToFloat(0xDC75B3A6 ^ 0x9EC1B3A6));
    private final tay tds = new tay(this, "Delay R".concat("andomness")).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(1216419708 + -87627644)).rkh_3(Float.intBitsToFloat(451329671 + 632897913)).ssd_5(Float.intBitsToFloat(951709351 + 151916889));
    private final tay thd_6 = new tay(this, "Items Per Cycle").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(-669363577) ^ 0xA05A581B)).rkh_3(1.0f).ssd_5(1.0f);
    private final khd dhab = new khd(this, "Order");
    private final fy sjs_2 = new fy(this.dhab, "Sequential").rhh_3();
    private final fy ghj = new fy(this.dhab, "Reverse");
    private final fy jsha = new fy(this.dhab, "Random");
    private final khd hwj = new khd(this, "Filter");
    private final fy jshh_2 = new fy(this.hwj, "All").rhh_3();
    private final fy btth_2 = new fy(this.hwj, "Selected");
    private final bbd_2 shbh_2 = new bbd_2((hy)this, "Item Cate".concat("gories"), this::rth_4).sshm(true);
    private final s_3 aa = new s_3(this.shbh_2, "Weapons").thst();
    private final s_3 fh_2 = new s_3(this.shbh_2, "Armor").thst();
    private final s_3 bkhb = new s_3(this.shbh_2, "Tools").thst();
    private final s_3 dhshh_2 = new s_3(this.shbh_2, "Food").thst();
    private final s_3 bkhq = new s_3(this.shbh_2, "Blocks").thst();
    private final s_3 jjkh = new s_3(this.shbh_2, "Potions").thst();
    private final s_3 rjt = new s_3(this.shbh_2, "Utilities").thst();
    private final s_3 hb_2 = new s_3(this.shbh_2, "Other");
    private final badh_2 hda_2 = new badh_2(this, "Auto Close").bts(true);
    private final tay tshz = new tay((hy)this, "Close Delay", this::khthb).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(855239550) ^ 0x3AAD9F4C)).rkh_3(Float.intBitsToFloat(Integer.reverse(1055969460) ^ 0x6CC30F7C)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x5A28A92F ^ 0x5A09222F, 9)));
    private final badh_2 sbs_3 = new badh_2(this, "Stop Whe".concat("n Full")).bts(true);
    private int shhb_2 = Integer.reverse(1708851966) ^ 0xFF40DBA6;
    private long hby;
    private long dqd_2;
    private long hdr_2;
    private final bql<btt> stq_3 = this::rdhd_2;
    private static final int sqt = -2071056097;
    private static final int shzd_4 = 953665365;
    private static final int dhkht_2 = -1679326297;
    private static final int hrl = -1724891046;
    private static final int idz3at0 = -488045991;
    private static final int kivscwoai2f7h = 1360326689;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int aas4bswbm;

    @Override
    public void nt() {
        int n = -1505635273;
        n = Integer.rotateLeft(n * -110601371, 14) ^ 0xFAD90500;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
        int n2 = n ^ 0xA4BFD7D6;
        if ((n2 ^ n) != -1530931242) {
            int cfr_ignored_0 = (0x2FE03E1 ^ n) + 498932977;
        }
        hh_2.dshz_4(this);
    }

    @Override
    public void nc() {
        int n = 1672961962;
        n = Integer.rotateLeft(n * -756083533, 26) ^ 0x4C698695;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xD2BE655;
        if ((n2 ^ n) != 220980821) {
            int cfr_ignored_0 = (0x6E9CB9FF ^ n) - 1453070464;
        }
        hh_2.jha(this);
    }

    private int zsz_3(class_1707 class_17072) {
        int n = -187871569;
        n = Integer.rotateLeft(n * 1109625261, 24) ^ 0x55F367F9;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x67310AE8;
        if ((n2 ^ n) != 1731267304) {
            int cfr_ignored_0 = (0x93FC4447 ^ n) + 891080117;
        }
        int n3 = class_17072.method_17388() * (0x26171D82 ^ 0x26171D8B);
        if (this.jsha.shghkh()) {
            int n4 = ThreadLocalRandom.current().nextInt(n3);
            for (int i = 0; i < n3; ++i) {
                int n5 = (n4 + i) % n3;
                if (!this.ghtr(class_17072, n5)) continue;
                return n5;
            }
            return -1;
        }
        for (int i = 0; i < n3; ++i) {
            int n6;
            int n7 = n6 = this.ghj.shghkh() ? n3 - 1 - i : i;
            if (!this.ghtr(class_17072, n6)) continue;
            return n6;
        }
        return -1;
    }

    private boolean jshz(class_1799 class_17992) {
        int n = tst_2.bf(-323269914);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 21);
        int n2 = n ^ 0xACA1E0F6;
        if ((n2 ^ n) != -1398677258) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x401AAA10 ^ n, 11) + -946325717) * 1075489297;
        }
        if (class_17992.method_7960()) {
            return false;
        }
        if (this.jshh_2.shghkh()) {
            return true;
        }
        class_1792 class_17922 = hh_2.jkhw(class_17992);
        if (class_17922 instanceof class_1829) {
            return hh_2.szn_2(this.aa);
        }
        if (class_17922 instanceof class_1738) {
            return hh_2.jts_3(this.fh_2);
        }
        if (class_17922 instanceof class_1766) {
            return hh_2.slt(this.bkhb);
        }
        if (hh_2.zss_7(class_17992).method_57832(class_9334.field_50075)) {
            return hh_2.thyt(this.dhshh_2);
        }
        if (class_17922 instanceof class_1747) {
            return hh_2.abw(this.bkhq);
        }
        if (class_17922 instanceof class_1812) {
            return hh_2.thns_2(this.jjkh);
        }
        if (class_17922 == class_1802.field_8634 || class_17922 == class_1802.field_8288 || class_17922 == class_1802.field_8639 || class_17922 == class_1802.field_8463 || class_17922 == class_1802.field_8367) {
            return hh_2.shh_6(this.rjt);
        }
        return hh_2.sdhw(this.hb_2);
    }

    private boolean ghtr(class_1707 class_17072, int n) {
        class_1799 class_17992;
        int n2 = -1034301672;
        n2 = Integer.rotateLeft(n2 * 586462059, 3) ^ 0x7687932A;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (n2 = Integer.rotateRight(n ^ n2, 17)) ^ 0xCE762933;
        if ((n3 ^ n2) != -831117005) {
            int cfr_ignored_0 = (0xC2FE62B ^ n2) + 1707782729;
        }
        return this.jshz(class_17992 = hh_2.khjd(class_17072.method_7611(n))) && (!this.sbs_3.shzl() || hh_2.zzm_4(this, class_17072, class_17992));
    }

    private boolean khghs_2(class_1707 class_17072, class_1799 class_17992) {
        int n;
        int n2 = tst_2.bf(-953829016);
        class_1707 class_17073 = class_17072;
        n2 = (class_17073 != null ? System.identityHashCode(class_17073) : 0) ^ n2;
        int n3 = n2 ^ 0x281024A7;
        if ((n3 ^ n2) != 672146599) {
            int cfr_ignored_0 = Integer.rotateRight(0xEF359DCF ^ n2, 16) - -69485748;
        }
        if (yf.dnkh()) {
            throw null;
        }
        for (int i = n = class_17072.method_17388() * (-1001903917 - -1001903926); i < class_17072.field_7761.size(); ++i) {
            class_1799 class_17993 = hh_2.lj(class_17072, i).method_7677();
            if (!class_17993.method_7960() && (!hh_2.zqkh(class_17993, class_17992) || class_17993.method_7947() >= hh_2.dhyk(class_17993))) continue;
            return true;
        }
        return false;
    }

    private void ast_4(class_1707 class_17072, long l) {
        try {
            int n = 127806091;
            n = Integer.rotateLeft(n * 1457194385, 21) ^ 0x2055C993;
            class_1707 class_17073 = class_17072;
            n = (class_17073 != null ? System.identityHashCode(class_17073) : 0) ^ n;
            int n2 = n ^ 0x2F534510;
            if ((n2 ^ n) != 793986320) {
                int cfr_ignored_0 = (0x28CD6F9B ^ n) - -1416797973;
            }
            if ((0x1E6 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!hh_2.shz(this.hda_2)) {
            return;
        }
        if (this.hdr_2 == 0L) {
            this.hdr_2 = l;
        }
        if (l - this.hdr_2 >= (long)Math.round(hh_2.ddht_3(this.tshz))) {
            hh_2.mc.field_1724.method_7346();
            hh_2.la_2(this);
        }
    }

    private void djsh_2() {
        int n = -677313802;
        n = Integer.rotateLeft(n * 1889810669, 20) ^ 0x874B9338;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 15);
        int n2 = n ^ 0xD029B70E;
        if ((n2 ^ n) != -802572530) {
            int cfr_ignored_0 = (0x788B5F8 ^ n) - -736158024;
        }
        this.shhb_2 = 51565010 + 2095918638;
        this.hby = 0L;
        this.dqd_2 = 0L;
        this.hdr_2 = 0L;
    }

    private void rdhd_2(btt btt2) {
        class_1703 class_17032;
        try {
            int n = 665924970;
            n = Integer.rotateLeft(n * -896678933, 11) ^ 0xBF2F062C;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 4);
            int n2 = n ^ 0xD51EFB05;
            if ((n2 ^ n) != -719389947) {
                int cfr_ignored_0 = (0xF2AFCE6F ^ n) + -432201232;
            }
            if ((0x2FB & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (hh_2.mc.field_1724 == null || hh_2.mc.field_1761 == null || !(hh_2.mc.field_1755 instanceof class_476) || !((class_17032 = hh_2.mc.field_1724.field_7512) instanceof class_1707)) {
            this.djsh_2();
            return;
        }
        class_1707 class_17072 = (class_1707)class_17032;
        long l = System.currentTimeMillis();
        if (class_17072.field_7763 != this.shhb_2) {
            this.shhb_2 = class_17072.field_7763;
            this.hby = l;
            this.dqd_2 = l + (long)Math.round(this.rghdh.hkj());
            this.hdr_2 = 0L;
        }
        if (l < this.hby + (long)Math.round(this.rghdh.hkj()) || l < this.dqd_2) {
            return;
        }
        int n = Math.round(this.thd_6.hkj());
        for (int i = 0; i < n; ++i) {
            int n3 = this.zsz_3(class_17072);
            if (n3 == -1) {
                this.ast_4(class_17072, l);
                return;
            }
            hh_2.mc.field_1761.method_2906(class_17072.field_7763, n3, 0, class_1713.field_7794, (class_1657)hh_2.mc.field_1724);
            if (!(this.bk.hkj() > 0.0f)) continue;
            break;
        }
        this.hdr_2 = 0L;
        long l2 = Math.round(this.tds.hkj());
        long l3 = l2 == 0L ? 0L : ThreadLocalRandom.current().nextLong(-l2, l2 + 1L);
        this.dqd_2 = l + Math.max(0L, (long)Math.round(this.bk.hkj()) + l3);
    }

    private boolean khthb() {
        int n;
        block1: {
            int n2 = -1467489132;
            n2 = Integer.rotateLeft(n2 * 1091373065, 25) ^ 0xB3263B77;
            n2 = System.identityHashCode(this) ^ n2;
            int n3 = n2 ^ 0xB4C8E590;
            if ((n3 ^ n2) != -1261902448) {
                int cfr_ignored_0 = (0x1C4F0104 ^ n2) - -1518956183;
            }
            n = !this.hda_2.shzl() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x9BBC;
        }
        return n != 0;
    }

    private boolean rth_4() {
        int n;
        block1: {
            int n2 = -709860266;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1940587437, 10) ^ 0x66F0B95C) ^ 0x4E1C84F7;
            if ((n3 ^ n2) != 1310491895) {
                int cfr_ignored_0 = (0x9BACE0A1 ^ n2) + 908232514;
            }
            n = !this.hwj.dhbn("Selected") ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0xBF8A;
        }
        return n != 0;
    }

    private static String hyn(String string, int n, int n2, int n3) {
        try {
            int n4 = 555318734;
            n4 = Integer.rotateLeft(n4 * -598900963, 3) ^ 0x2E3B660C;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 12);
            n4 = Integer.rotateLeft(n2 ^ n4, 29);
            int n5 = n4 ^ 0x364F9A5D;
            if ((n5 ^ n4) != 911186525) {
                int cfr_ignored_0 = (0x1756E793 ^ n4) - -997500861;
            }
            if ((0x1AD & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0xB0153E5E) + sqt ^ Integer.reverse(n2 + i * -1038427745), 9) - shzd_4);
        }
        return new String(cArray);
    }

    private static void dshz_4(hh_2 hh2) {
        int n = -570588553;
        n = Integer.rotateLeft(n * -1889819037, 21) ^ 0xE8FC6CF7;
        hh_2 hh3 = hh2;
        n = (hh3 != null ? System.identityHashCode(hh3) : 0) ^ n;
        int n2 = n ^ 0xAD781B5B;
        if ((n2 ^ n) != -1384637605) {
            int cfr_ignored_0 = (0x7085992C ^ n) - 444114580;
        }
        hh2.djsh_2();
    }

    private static void jha(hh_2 hh2) {
        int n = -1790581532;
        n = Integer.rotateLeft(n * -1688445319, 25) ^ 0x9D46EF37;
        hh_2 hh3 = hh2;
        n = Integer.rotateRight((hh3 != null ? System.identityHashCode(hh3) : 0) ^ n, 5);
        int n2 = n ^ 0x875F962C;
        if ((n2 ^ n) != -2023778772) {
            int cfr_ignored_0 = (0x121A72C8 ^ n) + -983536845;
        }
        hh2.djsh_2();
    }

    private static class_1792 jkhw(class_1799 class_17992) {
        block0: {
            int n = -1639795026;
            int n2 = (n = Integer.rotateLeft(n * 300844859, 22) ^ 0xEDE4BC26) ^ 0xB459DBA9;
            if ((n2 ^ n) == -1269179479) break block0;
            int cfr_ignored_0 = (0x2A1B6D07 ^ n) - 1662873192;
        }
        return class_17992.method_7909();
    }

    private static boolean szn_2(s_3 s2) {
        block0: {
            int n = -2057039663;
            n = Integer.rotateLeft(n * -164060609, 21) ^ 0xB2056C81;
            s_3 s3 = s2;
            n = (s3 != null ? System.identityHashCode(s3) : 0) ^ n;
            int n2 = n ^ 0x17A672D5;
            if ((n2 ^ n) == 396784341) break block0;
            int cfr_ignored_0 = (0x92C26204 ^ n) - -932845540;
        }
        return s2.alh();
    }

    private static boolean jts_3(s_3 s2) {
        block0: {
            int n = -750141917;
            int n2 = (n = Integer.rotateLeft(n * 1185551445, 22) ^ 0x9BA8D950) ^ 0xAB4AD243;
            if ((n2 ^ n) == -1421159869) break block0;
            int cfr_ignored_0 = (0x78036C60 ^ n) + -1116532237;
        }
        return s2.alh();
    }

    private static boolean slt(s_3 s2) {
        block0: {
            int n = tst_2.bf(86606315);
            s_3 s3 = s2;
            n = Integer.rotateLeft((s3 != null ? System.identityHashCode(s3) : 0) ^ n, 3);
            int n2 = n ^ 0x681C3370;
            if ((n2 ^ n) == 1746678640) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x6D35B29B ^ n, 16) + 1037975552) * 1832235675;
        }
        return s2.alh();
    }

    private static class_9323 zss_7(class_1799 class_17992) {
        block0: {
            int n = -166554089;
            int n2 = (n = Integer.rotateLeft(n * 868455577, 16) ^ 0x2114A577) ^ 0xE012B965;
            if ((n2 ^ n) == -535643803) break block0;
            int cfr_ignored_0 = (0x16002F72 ^ n) + -188215924;
        }
        return class_17992.method_57353();
    }

    private static boolean thyt(s_3 s2) {
        block0: {
            int n = 697202732;
            int n2 = (n = Integer.rotateLeft(n * -2055907843, 19) ^ 0x75E82725) ^ 0xA6568CFF;
            if ((n2 ^ n) == -1504277249) break block0;
            int cfr_ignored_0 = (0x8FD8F4D3 ^ n) + -1019725594;
        }
        return s2.alh();
    }

    private static boolean abw(s_3 s2) {
        block0: {
            int n = 68558503;
            n = Integer.rotateLeft(n * -300572457, 16) ^ 0x2FCB1DCE;
            s_3 s3 = s2;
            n = Integer.rotateLeft((s3 != null ? System.identityHashCode(s3) : 0) ^ n, 14);
            int n2 = n ^ 0xBB7BFE41;
            if ((n2 ^ n) == -1149501887) break block0;
            int cfr_ignored_0 = (0xBF6DE0E6 ^ n) + 778098823;
        }
        return s2.alh();
    }

    private static boolean thns_2(s_3 s2) {
        block0: {
            int n = -1148132024;
            int n2 = (n = Integer.rotateLeft(n * -739687077, 21) ^ 0x59348591) ^ 0x52248117;
            if ((n2 ^ n) == 1378124055) break block0;
            int cfr_ignored_0 = (0xE9B4645F ^ n) - 503566348;
        }
        return s2.alh();
    }

    private static boolean shh_6(s_3 s2) {
        block0: {
            int n = 1463101269;
            n = Integer.rotateLeft(n * 1538275883, 19) ^ 0x3B7E893F;
            s_3 s3 = s2;
            n = Integer.rotateRight((s3 != null ? System.identityHashCode(s3) : 0) ^ n, 12);
            int n2 = n ^ 0x83BB1393;
            if ((n2 ^ n) == -2084891757) break block0;
            int cfr_ignored_0 = (0xD48E34C6 ^ n) - 613351334;
        }
        return s2.alh();
    }

    private static boolean sdhw(s_3 s2) {
        block0: {
            int n = tst_2.bf(-983681642);
            int n2 = n ^ 0xBE6B3C9D;
            if ((n2 ^ n) == -1100268387) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x7B35090B ^ n, 18) + -271992944;
        }
        return s2.alh();
    }

    private static class_1799 khjd(class_1735 class_17352) {
        block0: {
            int n = -547505005;
            n = Integer.rotateLeft(n * -2079507163, 23) ^ 0x552270B3;
            class_1735 class_17353 = class_17352;
            n = Integer.rotateLeft((class_17353 != null ? System.identityHashCode(class_17353) : 0) ^ n, 21);
            int n2 = n ^ 0x3F966E87;
            if ((n2 ^ n) == 1066823303) break block0;
            int cfr_ignored_0 = (0xE0CBD214 ^ n) + 264305013;
        }
        return class_17352.method_7677();
    }

    private static boolean zzm_4(hh_2 hh2, class_1707 class_17072, class_1799 class_17992) {
        block0: {
            int n = -1383003271;
            n = Integer.rotateLeft(n * -1027881425, 6) ^ 0x84177CC1;
            hh_2 hh3 = hh2;
            n = Integer.rotateLeft((hh3 != null ? System.identityHashCode(hh3) : 0) ^ n, 28);
            class_1707 class_17073 = class_17072;
            n = Integer.rotateRight((class_17073 != null ? System.identityHashCode(class_17073) : 0) ^ n, 8);
            int n2 = n ^ 0xB4A19196;
            if ((n2 ^ n) == -1264479850) break block0;
            int cfr_ignored_0 = (0x19309AEF ^ n) + -415552904;
        }
        return hh2.khghs_2(class_17072, class_17992);
    }

    private static class_1735 lj(class_1707 class_17072, int n) {
        block0: {
            int n2 = 808504136;
            n2 = Integer.rotateLeft(n2 * 957133367, 14) ^ 0xC94DBFC5;
            int n3 = (n2 = n ^ n2) ^ 0xF9AAAD61;
            if ((n3 ^ n2) == -106255007) break block0;
            int cfr_ignored_0 = (0xC99A6629 ^ n2) + -1618019402;
        }
        return class_17072.method_7611(n);
    }

    private static boolean zqkh(class_1799 class_17992, class_1799 class_17993) {
        block0: {
            int n = -1123820229;
            n = Integer.rotateLeft(n * -401742827, 3) ^ 0x3841F4B1;
            class_1799 class_17994 = class_17992;
            n = (class_17994 != null ? System.identityHashCode(class_17994) : 0) ^ n;
            class_1799 class_17995 = class_17993;
            n = (class_17995 != null ? System.identityHashCode(class_17995) : 0) ^ n;
            int n2 = n ^ 0x7805BE1C;
            if ((n2 ^ n) == 2013642268) break block0;
            int cfr_ignored_0 = (0xC5066327 ^ n) - 1589408040;
        }
        return class_1799.method_31577((class_1799)class_17992, (class_1799)class_17993);
    }

    private static int dhyk(class_1799 class_17992) {
        block0: {
            int n = -445398622;
            n = Integer.rotateLeft(n * 736024513, 12) ^ 0xE2B7A061;
            class_1799 class_17993 = class_17992;
            n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
            int n2 = n ^ 0x960BB020;
            if ((n2 ^ n) == -1777618912) break block0;
            int cfr_ignored_0 = (0x73787182 ^ n) - -1040814995;
        }
        return class_17992.method_7914();
    }

    private static boolean shz(badh_2 badh2) {
        block0: {
            int n = 1877111151;
            int n2 = (n = Integer.rotateLeft(n * -158707009, 27) ^ 0xBAD02B09) ^ 0x27FD1D0B;
            if ((n2 ^ n) == 670899467) break block0;
            int cfr_ignored_0 = (0x481F6C64 ^ n) + -1579074980;
        }
        return badh2.shzl();
    }

    private static float ddht_3(tay tay2) {
        block0: {
            int n = 2093169688;
            int n2 = (n = Integer.rotateLeft(n * -438136609, 24) ^ 0xEBB0A50D) ^ 0xD38BB0B8;
            if ((n2 ^ n) == -745819976) break block0;
            int cfr_ignored_0 = (0xAF488CA0 ^ n) + 123705299;
        }
        return tay2.hkj();
    }

    private static void la_2(hh_2 hh2) {
        int n = tst_2.bf(1800981571);
        hh_2 hh3 = hh2;
        n = (hh3 != null ? System.identityHashCode(hh3) : 0) ^ n;
        int n2 = n ^ 0x5A1DB93B;
        if ((n2 ^ n) != 1511897403) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x31457578 ^ n, 9) + -70854461) * 826635641;
        }
        hh2.djsh_2();
    }

    private static String[] zfz_3(String string) {
        block0: {
            int n = 2035037484;
            n = Integer.rotateLeft(n * -545023057, 13) ^ 0xECFF915A;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x676F40DB;
            if ((n2 ^ n) == 1735344347) break block0;
            int cfr_ignored_0 = (0x1E2375F7 ^ n) - 2127980153;
        }
        return string.split("\b\u0010", -1);
    }

    private static CallSite dhkz_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1642818602;
            n3 = Integer.rotateLeft(n3 * -670005657, 4) ^ 0x4DC33DBE;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 8);
            String string3 = string2;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 21);
            int n4 = n3 ^ 0x2FB1DDC6;
            if ((n4 ^ n3) != 800185798) {
                int cfr_ignored_0 = (0x4E5AB1EC ^ n3) + 1274622323;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dhkht_2 ^ string.hashCode() ^ n2 + hrl ^ i * -1711240605 ^ dhkht_2, 27) ^ hrl));
            }
            String[] stringArray = hh_2.zfz_3(new String(cArray));
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

    private static String[] cune8pc3(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite y8wdza9a(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ idz3at0 ^ string.hashCode() ^ n2 + kivscwoai2f7h + i * 1551599545) + idz3at0) ^ kivscwoai2f7h));
            }
            String[] stringArray = hh_2.cune8pc3(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

