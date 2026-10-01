/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bbd_2;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tsb;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="HUD", category=bzw.OTHER, enabledByDefault=true, desc="Displays and configures HUD widgets")
public class bza_4
extends bnq {
    private static bza_4 than;
    public final bbd_2 jry = new bbd_2(this, "Widgets").sshm(true);
    public final s_3 thsq_2 = new s_3(this.jry, "Watermark").thst();
    public final s_3 thwy = new s_3(this.jry, "Keybinds").thst();
    public final s_3 dkm = new s_3(this.jry, "Potions").thst();
    public final s_3 kq = new s_3(this.jry, "Cooldowns").thst();
    public final s_3 bzw = new s_3(this.jry, "Staffs").thst();
    public final s_3 khtf = new s_3(this.jry, "Target Info").thst();
    public final s_3 sah_3 = new s_3(this.jry, "Armor").thst();
    public final s_3 hwsh = new s_3(this.jry, "Inventory").thst();
    public final s_3 shzz_2 = new s_3(this.jry, "Radar");
    public final s_3 thyf = new s_3(this.jry, "Speed Graph");
    public final s_3 jghd_2 = new s_3(this.jry, "XYZ").thst();
    public final s_3 tsq_2 = new s_3(this.jry, "MusicBar");
    public final s_3 shks_2 = new s_3(this.jry, "Notifi".concat("cations")).thst();
    public final badh_2 sd_2 = new badh_2((hy)this, "MoonDL".concat("C Armor Bar"), this::ghn).bts(true);
    public final badh_2 dhd_5 = new badh_2((hy)this, "TargetHUD ".concat("Tracking"), this::jzz_2).bts(true);
    public final khd shzy = new khd(this, "HotBar");
    public final fy dhh_4 = new fy(this.shzy, "Vanilla");
    public final fy sht_2 = new fy(this.shzy, "Modern");
    public final khd skha_2 = new khd((hy)this, "Status Bars Mode", this::dys_2);
    public final fy dhjt = new fy(this.skha_2, "Bars").rhh_3();
    public final fy skt_2 = new fy(this.skha_2, "Default");
    public final badh_2 zwq = new badh_2((hy)this, "Show Binds", this::rky).bts(false);
    public final badh_2 rqz_2 = new badh_2((hy)this, "Bars Glow", this::ssha_4).bts(true);
    public final badh_2 wt = new badh_2((hy)this, "Bars Text", this::zmm_2).bts(true);
    public final badh_2 hkhs_2 = new badh_2((hy)this, "Custom ".concat("XP Bar"), this::bldh).bts(true);
    public final bbd_2 shdf_2 = new bbd_2((hy)this, "Watermark Elements", this::jnth);
    public final s_3 khsw_2 = new s_3(this.shdf_2, "Name").thst();
    public final s_3 sghz = new s_3(this.shdf_2, "User").thst();
    public final s_3 hyf = new s_3(this.shdf_2, "IP").thst();
    public final s_3 rthh = new s_3(this.shdf_2, "FPS").thst();
    public final s_3 stkh_3 = new s_3(this.shdf_2, "Time").thst();
    public final s_3 shfd_2 = new s_3(this.shdf_2, "Lyrics").thst();
    public final tay bnq = new tay(this, "Scale").ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xB7633414 ^ 0xD100C272, 12))).shth_7(Float.intBitsToFloat(Integer.reverse(-824818258) ^ 0x4ABBF2E9)).dhbs_2(Float.intBitsToFloat(Integer.reverse(1731709580) ^ 0xE93ECE6)).rkh_3(Float.intBitsToFloat(107607 + 1028335734));
    public final tay bfn = new tay(this, "Glassy").ssd_5(Float.intBitsToFloat(-976060768 - -2029669933)).shth_7(0.0f).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(-984097419) ^ 0x9377266E));
    public final tay shghs_2 = new tay(this, "Darkness").ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xDAA32CF8 ^ 0xB2A32CE8, 26))).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(-940755561 - -2061159017)).rkh_3(1.0f);
    public final khd dhbth = new khd(this, "Widget ".concat("Style"));
    public final fy hql = new fy(this.dhbth, "Liqu".concat("id Glass"));
    public final fy rghf = new fy(this.dhbth, "Classic");
    public final fy sqd_2 = new fy(this.dhbth, "Transparent").rhh_3();
    public final tay bqh = new tay(this, "Passes").ssd_5(Float.intBitsToFloat(0xA3DBA609 ^ 0xE39BA609)).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(640269744 + 443957840)).rkh_3(1.0f);
    public final tay dss_3 = new tay(this, "Offset").ssd_5(Float.intBitsToFloat(Integer.reverse(-1079072623) ^ 0xC85575FD)).shth_7(Float.intBitsToFloat(Integer.reverse(-1982346525) ^ 0x87F3EB91)).dhbs_2(Float.intBitsToFloat(-1931398482 - 1259942574)).rkh_3(1.0f);
    private static final int sjz = 1292676695;
    private static final int bsh_5 = -799309418;
    private static final int hza = 1881658095;
    private static final int dhhs_3 = 0x6A66996A;
    private static final int soz8ly6wi6l = 1303224272;
    private static final int pnqqxxhvvq = -1473356961;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int mh8mlghm;

    public static bza_4 thtsh_2() {
        block0: {
            int n = 1036993581;
            int n2 = (n = Integer.rotateLeft(n * -139627655, 12) ^ 0xE7EC3DB2) ^ 0xCFADF76B;
            if ((n2 ^ n) == -810682517) break block0;
            int cfr_ignored_0 = (0xF262B346 ^ n) - -1641551252;
        }
        return than;
    }

    public bza_4() {
        than = this;
    }

    public void dhah_2() {
        block0: {
            int n = 1694247026;
            n = Integer.rotateLeft(n * -1529446565, 23) ^ 0x77E78084;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 27);
            int n2 = n ^ 0xA506ECEE;
            if ((n2 ^ n) == -1526272786) break block0;
            int cfr_ignored_0 = (0xC1FAC49C ^ n) + 1076078021;
        }
    }

    public static float thd_9() {
        block0: {
            int n = -1468123019;
            int n2 = (n = Integer.rotateLeft(n * -884078557, 14) ^ 0x4866B148) ^ 0x3BF3D946;
            if ((n2 ^ n) == 1005836614) break block0;
            int cfr_ignored_0 = (0x938DE133 ^ n) + 259068085;
        }
        return bza_4.thtsh_2().bnq.hkj();
    }

    public static float atm() {
        block0: {
            int n = 1168783756;
            int n2 = (n = Integer.rotateLeft(n * 985912665, 22) ^ 0xCC864889) ^ 0x96C33CDC;
            if ((n2 ^ n) == -1765589796) break block0;
            int cfr_ignored_0 = (0xD3690550 ^ n) - 229100820;
        }
        return 1.0f - bza_4.thtsh_2().bfn.hkj();
    }

    public static float thzkh_2() {
        block0: {
            int n = -1124739226;
            int n2 = (n = Integer.rotateLeft(n * 352511673, 21) ^ 0xA9F67847) ^ 0x3150C36;
            if ((n2 ^ n) == 51711030) break block0;
            int cfr_ignored_0 = (0xBFE0DB50 ^ n) - -938100412;
        }
        return bza_4.hjl();
    }

    public static float hjl() {
        block0: {
            int n = -1004657160;
            int n2 = (n = Integer.rotateLeft(n * -1028327599, 13) ^ 0xBF9C1B32) ^ 0xF7F5C610;
            if ((n2 ^ n) == -134887920) break block0;
            int cfr_ignored_0 = (0x33EBE3E8 ^ n) - -38687458;
        }
        return bza_4.thtsh_2().shghs_2.hkj();
    }

    public static boolean aar() {
        int n = -1055050942;
        int n2 = (n = Integer.rotateLeft(n * 266631937, 26) ^ 0x2B0A8369) ^ 0xCED7C3DE;
        if ((n2 ^ n) != -824720418) {
            int cfr_ignored_0 = (0xFCAF09C ^ n) - -1673011673;
        }
        return bza_4.thtsh_2() != null && bza_4.thtsh_2().rgha_2() && bza_4.hzl_2(bza_4.thtsh_2().dhbth, "Liquid G".concat(bza_4.rtd_2("༃夢∊续", Integer.reverse(-1612167509) ^ 0x56F21D34, Integer.rotateLeft(0xB6D08DEA ^ 0x4FC0A548, 24), bza_4.har_2(0xB52ED034 ^ 0xFB13C405, 21))));
    }

    public static boolean dhhh() {
        int n = -355513309;
        int n2 = (n = Integer.rotateLeft(n * 795729209, 10) ^ 0x1A62B6DB) ^ 0xD8F68C6F;
        if ((n2 ^ n) != -654930833) {
            int cfr_ignored_0 = (0x3239C04C ^ n) - -1960341315;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return bza_4.brkh() != null && bza_4.zzt_8(bza_4.thtsh_2()) && bza_4.thtsh_2().dhbth.dhbn("Classic");
    }

    public static boolean dghb() {
        int n = 1665234885;
        int n2 = (n = Integer.rotateLeft(n * 1814581407, 12) ^ 0x1D3F80F) ^ 0x63E55679;
        if ((n2 ^ n) != 1675974265) {
            int cfr_ignored_0 = (0xA421BC ^ n) + -756396404;
        }
        return bza_4.thtsh_2() != null && bza_4.rkhth().rgha_2() && bza_4.thtsh_2().dhbth.dhbn(bza_4.zzd("榈㎺䝳ᩃ耂ⵇ톥螈븷쬿", bza_4.dhbd(-1284123980) ^ 0xBF47C18, 1873918269 - 125716944, Integer.rotateLeft(0x6E0A4623 ^ 0xE6C3DDE4, 15)));
    }

    public static int lw() {
        block0: {
            int n = -365119079;
            int n2 = (n = Integer.rotateLeft(n * -1300116213, 11) ^ 0x11596E58) ^ 0x64A1E1E3;
            if ((n2 ^ n) == 1688330723) break block0;
            int cfr_ignored_0 = (0x8E9D587A ^ n) - 88881178;
        }
        return (int)bza_4.ghbdh().bqh.hkj();
    }

    public static float saz_7() {
        block0: {
            int n = 612327323;
            int n2 = (n = Integer.rotateLeft(n * -1936133443, 27) ^ 0xCD2087AD) ^ 0x6576C5AC;
            if ((n2 ^ n) == 1702282668) break block0;
            int cfr_ignored_0 = (0x41099A37 ^ n) + -1117661831;
        }
        return bza_4.thld().dss_3.hkj();
    }

    public static String zrf() {
        String string = null;
        int n = 0;
        int n2 = -1015074934;
        n2 = Integer.rotateLeft(n2 * -1858160405, 27) ^ 0x2FC42EA7;
        int n3 = 1639851869 * -1351758175 + -654752541 ^ n2;
        while (true) {
            block19: {
                block31: {
                    block27: {
                        block18: {
                            block17: {
                                block28: {
                                    block23: {
                                        block21: {
                                            block30: {
                                                block24: {
                                                    block16: {
                                                        block22: {
                                                            block32: {
                                                                block33: {
                                                                    block26: {
                                                                        block29: {
                                                                            block25: {
                                                                                block14: {
                                                                                    block20: {
                                                                                        block15: {
                                                                                            if ((n = ((n3 ^ n2) - -654752541) * 528586081) > -67646651) break block14;
                                                                                            if (n > -1226474964) break block15;
                                                                                            if (n == -1990016293) break block16;
                                                                                            if (n == -1743106332) break block17;
                                                                                            if (n == -1226474964) break block18;
                                                                                            break block19;
                                                                                        }
                                                                                        if (n > -928460309) break block20;
                                                                                        if (n == -1145824112) break block21;
                                                                                        if (n == -928460309) break block22;
                                                                                        break block19;
                                                                                    }
                                                                                    if (n == -508873018) break block23;
                                                                                    if (n == -67646651) break block24;
                                                                                    int cfr_ignored_0 = Integer.rotateRight(0xCDA5868B ^ n2, 12) + -345445872;
                                                                                    break block19;
                                                                                }
                                                                                if (n > 428903375) break block25;
                                                                                if (n == 88654370) break block26;
                                                                                if (n == 161700388) break block27;
                                                                                int cfr_ignored_1 = Integer.rotateRight(0x2778BA82 ^ n2, 7) + -872663815;
                                                                                if (n == 428903375) break block28;
                                                                                break block19;
                                                                            }
                                                                            if (n > 977603670) break block29;
                                                                            if (n == 577274327) break block30;
                                                                            if (n == 977603670) break block31;
                                                                            int cfr_ignored_2 = (Integer.rotateLeft(0x3D784499 ^ n2, 10) + 1978527170) * 1031292057;
                                                                            int cfr_ignored_3 = (int)(0xFFCAEAA427D4EB4FL ^ (long)n2 ^ 0x2838831A2DB85244L);
                                                                            break block19;
                                                                        }
                                                                        if (n == 1595401589) break block32;
                                                                        if (n == 1639851869) break block33;
                                                                        break block19;
                                                                    }
                                                                    int cfr_ignored_4 = Integer.rotateRight(0x6B697186 ^ n2, 16) - 102915701;
                                                                    string = "Modern";
                                                                    n3 = -1184405531 * -1351758175 + -654752541 ^ n2;
                                                                    int cfr_ignored_5 = (Integer.rotateRight(0x2B79003F ^ n2, 8) - 1208264412) * 729350207;
                                                                    n3 = 977603670 * -1351758175 + -654752541 ^ n2 ^ 0x19DAAEA0 ^ 0x19DAAEA0;
                                                                    ++n;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_6 = Integer.rotateRight(0x4785FD0B ^ n2, 11) + -1382595696;
                                                                if (yf.khdha_2()) {
                                                                    n3 = 88654370 * -1351758175 + -654752541 ^ n2;
                                                                    continue;
                                                                }
                                                                try {
                                                                    n += 5;
                                                                    if ((0x5A846F8A54A17913L ^ (long)n2 | 1L) == 0L) {
                                                                        throw new ArithmeticException();
                                                                    }
                                                                    n3 = (1595401589 * -1351758175 + -654752541 ^ n2) + -1001513427 - -1001513427;
                                                                }
                                                                catch (ArithmeticException arithmeticException) {
                                                                    n3 = Integer.reverse(Integer.reverse(1595401589 * -1351758175 + -654752541 ^ n2));
                                                                }
                                                                n -= 4;
                                                                continue;
                                                            }
                                                            int cfr_ignored_7 = Integer.rotateRight(0x2A987883 ^ n2, 8) + 752105240;
                                                            yf.athz_2();
                                                            throw null;
                                                        }
                                                        int cfr_ignored_8 = Integer.rotateRight(0x180620CB ^ n2, 6) + -316958768;
                                                        n3 = (int)((long)(1639851869 * -1351758175 + -654752541 ^ n2) ^ 0x6DAAA7FCE2A2093L ^ 0x6DAAA7FCE2A2093L);
                                                        --n;
                                                        continue;
                                                    }
                                                    int cfr_ignored_9 = (Integer.rotateLeft(0x9213D8D1 ^ n2, 5) + -1262165878) * -1844193071;
                                                    int cfr_ignored_10 = (int)(0x50A176EC27D4EB4FL ^ (long)n2 ^ 0x10A8831A2DB90C93L);
                                                    n3 = 1639851869 * -1351758175 + -654752541 ^ n2 ^ 0x1C7238F7 ^ 0x1C7238F7;
                                                    n -= 5;
                                                    continue;
                                                }
                                                int cfr_ignored_11 = (Integer.rotateRight(0x6EE71E1E ^ n2, 16) - 1918518493) * 1860640287;
                                                int cfr_ignored_12 = (int)(0xC1984931A8ABC145L ^ (long)n2 ^ 0x6F139DE479AC2EE1L);
                                                n3 = 233674610 * -1351758175 + -654752541 ^ n2 ^ 0x55547B67 ^ 0x55547B67;
                                                int cfr_ignored_13 = (int)(0x4C70063B00BE5610L ^ (long)n2 ^ 0xF106CDCF57073531L);
                                                n3 = (int)((long)(1639851869 * -1351758175 + -654752541 ^ n2) ^ 0x2E00DB68446D8FFEL ^ 0x2E00DB68446D8FFEL);
                                                n -= 2;
                                                continue;
                                            }
                                            int cfr_ignored_14 = (Integer.rotateRight(0x7EE5473A ^ n2, 18) + 1646346049) * 2128955195;
                                            n3 = (391295673 * -1351758175 + -654752541 ^ n2) + 703744030 - 703744030;
                                            int cfr_ignored_15 = (Integer.rotateLeft(0xEFDD9D15 ^ n2, 16) - 271819974) * -270689003;
                                            int cfr_ignored_16 = (int)(0x2D6F332827D4EB4FL ^ (long)n2 ^ 0x9B20831A2DB9F70FL);
                                            n3 = Integer.reverse(Integer.reverse(-144755267 * -1351758175 + -654752541 ^ n2));
                                            int cfr_ignored_17 = (Integer.rotateLeft(0x3EBB6751 ^ n2, 10) + -1659952630) * 1052469073;
                                            int cfr_ignored_18 = (int)(0xFC09C96C27D4EB4FL ^ (long)n2 ^ 0x6FA8831A2DB855C2L);
                                            n3 = Integer.reverse(Integer.reverse(1639851869 * -1351758175 + -654752541 ^ n2));
                                            n += 4;
                                            continue;
                                        }
                                        int cfr_ignored_19 = Integer.rotateRight(0x8EC24262 ^ n2, 4) + 1306765593;
                                        n3 = (int)((long)(1061844631 * -1351758175 + -654752541 ^ n2) ^ 0x1883CB67C0ECE98EL ^ 0x1883CB67C0ECE98EL);
                                        int cfr_ignored_20 = (Integer.rotateLeft(0xFFC46039 ^ n2, 18) + -47888862) * -3907527;
                                        int cfr_ignored_21 = (int)(0x3D76CE0427D4EB4FL ^ (long)n2 ^ 0x6178831A2DB9D73CL);
                                        try {
                                            n -= 2;
                                            if ((0xCFA921AC7437E847L ^ (long)n2 | 1L) == 0L) {
                                                throw new IllegalStateException();
                                            }
                                            n3 = 1639851869 * -1351758175 + -654752541 ^ n2 ^ 0xDE56FD54 ^ 0xDE56FD54;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            n3 = 1639851869 * -1351758175 + -654752541 ^ n2 ^ 0x55649879 ^ 0x55649879;
                                        }
                                        ++n;
                                        continue;
                                    }
                                    int cfr_ignored_22 = Integer.rotateLeft(0xEC8C98ED ^ n2, 16) - -1453054994;
                                    int cfr_ignored_23 = (int)(0x2E3E36D027D4EB4FL ^ (long)n2 ^ 0x90D0831A2DB9F1ADL);
                                    n3 = (int)((long)(888658073 * -1351758175 + -654752541 ^ n2) ^ 0xA26EC8BEE94FCCFFL ^ 0xA26EC8BEE94FCCFFL);
                                    int cfr_ignored_24 = (Integer.rotateRight(0xC777BD3A ^ n2, 11) + 735938881) * -948454085;
                                    n3 = 2107505577 * -1351758175 + -654752541 ^ n2 ^ 0x1625FB5B ^ 0x1625FB5B;
                                    int cfr_ignored_25 = Integer.rotateRight(0x9C2B940A ^ n2, 6) + -307983247;
                                    n3 = Integer.reverse(Integer.reverse(1639851869 * -1351758175 + -654752541 ^ n2));
                                    n += 2;
                                    continue;
                                }
                                int cfr_ignored_26 = (Integer.rotateRight(0x7A625B7A ^ n2, 18) + -700009727) * 2053266299;
                                n3 = -482136609 * -1351758175 + -654752541 ^ n2;
                                int cfr_ignored_27 = (Integer.rotateRight(0x3C57523B ^ n2, 10) + 1391498336) * 1012355643;
                                try {
                                    n += 5;
                                    if ((0x6517A23B4570D95L ^ (long)n2 | 1L) == 0L) {
                                        throw new IllegalStateException();
                                    }
                                    n3 = (int)((long)(1639851869 * -1351758175 + -654752541 ^ n2) ^ 0x191871DF55A1F1B8L ^ 0x191871DF55A1F1B8L);
                                }
                                catch (IllegalStateException illegalStateException) {
                                    n3 = 1639851869 * -1351758175 + -654752541 ^ n2 ^ 0x38A1D81C ^ 0x38A1D81C;
                                }
                                n += 4;
                                continue;
                            }
                            int cfr_ignored_28 = Integer.rotateLeft(0x954E45E5 ^ n2, 5) - 416814582;
                            int cfr_ignored_29 = (int)(0x57FCEBD827D4EB4FL ^ (long)n2 ^ 0x2AC0831A2DB90228L);
                            n3 = Integer.reverse(Integer.reverse(1373910129 * -1351758175 + -654752541 ^ n2));
                            int cfr_ignored_30 = Integer.rotateLeft(0x8A9EAC68 ^ n2, 4) + -845905965;
                            try {
                                if ((0x8835F898442AFFL ^ (long)n2 | 1L) == 0L) {
                                    throw new ArithmeticException();
                                }
                                n3 = Integer.reverse(Integer.reverse(1639851869 * -1351758175 + -654752541 ^ n2));
                            }
                            catch (ArithmeticException arithmeticException) {
                                n3 = Integer.reverse(Integer.reverse(1639851869 * -1351758175 + -654752541 ^ n2));
                            }
                            --n;
                            continue;
                        }
                        int cfr_ignored_31 = Integer.rotateLeft(0x26E624E4 ^ n2, 7) - -1170467113;
                        n3 = -221790616 * -1351758175 + -654752541 ^ n2;
                        int cfr_ignored_32 = Integer.rotateRight(0x8DE5DAA3 ^ n2, 4) + 858986744;
                        n3 = Integer.reverse(Integer.reverse(1142866043 * -1351758175 + -654752541 ^ n2));
                        int cfr_ignored_33 = Integer.rotateRight(0xD4FF6A27 ^ n2, 13) - -817137164;
                        n3 = (1639851869 * -1351758175 + -654752541 ^ n2) + -267219969 - -267219969;
                        n += 3;
                        continue;
                    }
                    int cfr_ignored_34 = (Integer.rotateRight(0x7CF52052 ^ n2, 18) + 638355753) * 2096439379;
                    n3 = Integer.reverse(Integer.reverse(450700868 * -1351758175 + -654752541 ^ n2));
                    int cfr_ignored_35 = (Integer.rotateLeft(0xD0FB20B4 ^ n2, 13) - 1388745991) * -788848459;
                    int cfr_ignored_36 = (int)(0xF42B02FDA613FE4DL ^ (long)n2 ^ 0xF88B809407BC4587L);
                    n3 = -777219178 * -1351758175 + -654752541 ^ n2;
                    int cfr_ignored_37 = (int)(0xA45EB6084BD7A428L ^ (long)n2 ^ 0x91605B1CB376E56CL);
                    n3 = (int)((long)(1639851869 * -1351758175 + -654752541 ^ n2) ^ 0x971CCEF7432C1692L ^ 0x971CCEF7432C1692L);
                    n -= 3;
                    continue;
                }
                return string;
            }
            int cfr_ignored_38 = Integer.rotateLeft(0xD0041A9 ^ n2, 4) + -1754950990;
            int cfr_ignored_39 = (int)(0xCFB2EF9427D4EB4FL ^ (long)n2 ^ 0x2258831A2DB832B4L);
            n3 = Integer.reverse(Integer.reverse(1639851869 * -1351758175 + -654752541 ^ n2));
        }
    }

    public boolean hfh() {
        int n = 486738229;
        n = Integer.rotateLeft(n * 1680526557, 17) ^ 0x580D5E5A;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 28);
        int n2 = n ^ 0x8814F3D0;
        if ((n2 ^ n) != -2011892784) {
            int cfr_ignored_0 = (0x9517FAE5 ^ n) - 179879671;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return bza_4.shmkh(this) && this.shzy.sdh_2().getName().equals(bza_4.dhtr_2("ꭊ薅\udb53쇰", bza_4.dlz_2(0xBE037CCF ^ 0x5DCC8DDA, 9), 0x8010D42D ^ 0xE867EBBE, Integer.reverse(-1560708570) ^ 0xCCA46F5C));
    }

    public boolean zrh_2() {
        block0: {
            int n = 989963038;
            n = Integer.rotateLeft(n * 1203733289, 7) ^ 0x4456614D;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x98EC41F8;
            if ((n2 ^ n) == -1729347080) break block0;
            int cfr_ignored_0 = (0xA3EDE2E6 ^ n) - 492829437;
        }
        return bza_4.ryh(this);
    }

    public boolean thaz() {
        block0: {
            int n = tsb.hbz(-71090136);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 27);
            int n2 = n ^ 0xDEABE500;
            if ((n2 ^ n) == -559160064) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x2568A528 ^ n, 7) + -1945526509;
        }
        return true;
    }

    private boolean jnth() {
        int n = tsb.hbz(-1052293036);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xF8EDACA8;
        if ((n2 ^ n) != -118641496) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x39AAE4FC ^ n, 10) - 1006015) * 967501053;
        }
        return !this.jry.tzn_3("Watermark");
    }

    private boolean bldh() {
        int n = 879847574;
        int n2 = (n = Integer.rotateLeft(n * -1922806779, 12) ^ 0xC18C3363) ^ 0x8DC43778;
        if ((n2 ^ n) != -1916520584) {
            int cfr_ignored_0 = (0xB9B55FEE ^ n) - -1603961786;
        }
        return !this.shzy.dhbn("Modern") || !this.skha_2.dhbn("Bars");
    }

    private boolean zmm_2() {
        int n = -1276718146;
        n = Integer.rotateLeft(n * -1756519813, 23) ^ 0xB766E70F;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xC1FC1811;
        if ((n2 ^ n) != -1040443375) {
            int cfr_ignored_0 = (0x721ACBAF ^ n) - -560003727;
        }
        return !this.shzy.dhbn("Modern") || !this.skha_2.dhbn("Bars");
    }

    private boolean ssha_4() {
        try {
            int n = 1351572433;
            n = Integer.rotateLeft(n * 2091637925, 20) ^ 0x896B4005;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x79389C64;
            if ((n2 ^ n) != 2033753188) {
                int cfr_ignored_0 = (0x29B7C7B5 ^ n) - -453567236;
            }
            if ((0x194 & 0) != 0) {
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
        return !this.shzy.dhbn("Modern") || !this.skha_2.dhbn("Bars");
    }

    private boolean rky() {
        int n = tsb.hbz(132325215);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x998F5775;
        if ((n2 ^ n) != -1718659211) {
            int cfr_ignored_0 = Integer.rotateRight(0x9E6C482A ^ n, 6) + 863657041;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return !this.shzy.dhbn("Modern");
    }

    private boolean dys_2() {
        int n = -1432355310;
        n = Integer.rotateLeft(n * -1112231287, 23) ^ 0x6ED3A7B3;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xE1A426AD;
        if ((n2 ^ n) != -509335891) {
            int cfr_ignored_0 = (0x4B3BD8BF ^ n) - -160295963;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return !this.shzy.dhbn("Modern");
    }

    private boolean jzz_2() {
        int n = tsb.hbz(340293540);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x5406AC57;
        if ((n2 ^ n) != 1409723479) {
            int cfr_ignored_0 = (Integer.rotateRight(0x404EDBF3 ^ n, 11) + -840285784) * 1078909939;
        }
        return !this.jry.tzn_3("Target Info");
    }

    private boolean ghn() {
        try {
            int n = -1484766607;
            n = Integer.rotateLeft(n * -1792047595, 15) ^ 0x3BA9DF8C;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x5A275707;
            if ((n2 ^ n) != 1512527623) {
                int cfr_ignored_0 = (0xFDA71576 ^ n) - -1432188229;
            }
            if ((0x3A3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.jry.tzn_3("Target Info");
    }

    private static String rtd_2(String string, int n, int n2, int n3) {
        int n4 = 1303302937;
        n4 = Integer.rotateLeft(n4 * 942113637, 12) ^ 0x5545B447;
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 21);
        int n5 = (n4 = n2 ^ n4) ^ 0xB7753775;
        if ((n5 ^ n4) != -1217054859) {
            int cfr_ignored_0 = (0xFADBE46C ^ n4) + 1725536789;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0xCB72C517) + n2 ^ i * 777662079) ^ sjz) + bsh_5);
        }
        return new String(cArray);
    }

    private static int har_2(int n, int n2) {
        block0: {
            int n3 = -1471137420;
            n3 = Integer.rotateLeft(n3 * 846100989, 10) ^ 0xEC7BC27F;
            int n4 = (n3 = n2 ^ n3) ^ 0xB330AFEB;
            if ((n4 ^ n3) == -1288654869) break block0;
            int cfr_ignored_0 = (0x1B60969F ^ n3) - 996538698;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static boolean hzl_2(khd khd2, String string) {
        block0: {
            int n = tsb.hbz(-877060899);
            int n2 = n ^ 0xA0B11A48;
            if ((n2 ^ n) == -1599006136) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x6B080695 ^ n, 16) - -94999738) * 1795688085;
            int cfr_ignored_1 = (int)(0xA9BAA8A827D4EB4FL ^ (long)n ^ 0xAC20831A2DB8FEA4L);
        }
        return khd2.dhbn(string);
    }

    private static bza_4 brkh() {
        block0: {
            int n = 1523204508;
            int n2 = (n = Integer.rotateLeft(n * -718794933, 26) ^ 0x8AD061E0) ^ 0x5D5DEB37;
            if ((n2 ^ n) == 1566436151) break block0;
            int cfr_ignored_0 = (0x797AAAB ^ n) + -1261468101;
        }
        return bza_4.thtsh_2();
    }

    private static boolean zzt_8(bza_4 bza2_2) {
        block0: {
            int n = 2029860085;
            n = Integer.rotateLeft(n * 1977866963, 3) ^ 0xEEA5DF1A;
            bza_4 bza3_2 = bza2_2;
            n = Integer.rotateLeft((bza3_2 != null ? System.identityHashCode(bza3_2) : 0) ^ n, 16);
            int n2 = n ^ 0x978B9AB8;
            if ((n2 ^ n) == -1752458568) break block0;
            int cfr_ignored_0 = (0xEF76AE4D ^ n) + 1430286957;
        }
        return bza2_2.rgha_2();
    }

    private static bza_4 rkhth() {
        block0: {
            int n = tsb.hbz(-680569992);
            int n2 = n ^ 0x95E3430E;
            if ((n2 ^ n) == -1780268274) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x428C1076 ^ n, 11) - 324246917) * 1116475511;
        }
        return bza_4.thtsh_2();
    }

    private static int dhbd(int n) {
        block0: {
            int n2 = tsb.hbz(30647096);
            int n3 = n2 ^ 0xB2FA8C9;
            if ((n3 ^ n2) == 187672777) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xAFC0BF1 ^ n2, 4) + 1491276138) * 184290289;
            int cfr_ignored_1 = (int)(0xC84EA5CC27D4EB4FL ^ (long)n2 ^ 0xB6E8831A2DB83D4CL);
        }
        return Integer.reverse(n);
    }

    private static String zzd(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1033978240;
            n4 = Integer.rotateLeft(n4 * 1950952701, 6) ^ 0x836AB731;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 26)) ^ 0x1C792D7B;
            if ((n5 ^ n4) == 477703547) break block0;
            int cfr_ignored_0 = (0x21D86CFB ^ n4) - -167312746;
        }
        return bza_4.rtd_2(string, n, n2, n3);
    }

    private static bza_4 ghbdh() {
        block0: {
            int n = 93489054;
            int n2 = (n = Integer.rotateLeft(n * 659924001, 18) ^ 0xA69DD0FC) ^ 0xAFA25738;
            if ((n2 ^ n) == -1348315336) break block0;
            int cfr_ignored_0 = (0xAA30D0A6 ^ n) - -747006729;
        }
        return bza_4.thtsh_2();
    }

    private static bza_4 thld() {
        block0: {
            int n = -1389031854;
            int n2 = (n = Integer.rotateLeft(n * 677080667, 14) ^ 0x85A57221) ^ 0x4357A8A8;
            if ((n2 ^ n) == 1129818280) break block0;
            int cfr_ignored_0 = (0xEE62A6FA ^ n) + -421106983;
        }
        return bza_4.thtsh_2();
    }

    private static String bkj(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 868522742;
            n4 = Integer.rotateLeft(n4 * 1689206277, 8) ^ 0xC763B569;
            n4 = Integer.rotateRight(n ^ n4, 28);
            int n5 = (n4 = n2 ^ n4) ^ 0xB6B20D94;
            if ((n5 ^ n4) == -1229845100) break block0;
            int cfr_ignored_0 = (0x85769762 ^ n4) - -1807122019;
        }
        return bza_4.rtd_2(string, n, n2, n3);
    }

    private static boolean shmkh(bza_4 bza2_2) {
        block0: {
            int n = -708729463;
            int n2 = (n = Integer.rotateLeft(n * -633454549, 24) ^ 0x8DE8EDE4) ^ 0xB1C4CBA9;
            if ((n2 ^ n) == -1312502871) break block0;
            int cfr_ignored_0 = (0x64056E20 ^ n) - -807469086;
        }
        return bza2_2.rgha_2();
    }

    private static int dlz_2(int n, int n2) {
        block0: {
            int n3 = -1522336640;
            n3 = Integer.rotateLeft(n3 * -1618462457, 7) ^ 0xC604B493;
            int n4 = (n3 = Integer.rotateLeft(n ^ n3, 12)) ^ 0xAD57181A;
            if ((n4 ^ n3) == -1386801126) break block0;
            int cfr_ignored_0 = (0x815E49A ^ n3) + -1005577154;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String dhtr_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -529134623;
            n4 = Integer.rotateLeft(n4 * -1483927267, 27) ^ 0xCD2CC3FA;
            int n5 = (n4 = n2 ^ n4) ^ 0xB3DB19AB;
            if ((n5 ^ n4) == -1277486677) break block0;
            int cfr_ignored_0 = (0x53AD124A ^ n4) + -1978621297;
        }
        return bza_4.rtd_2(string, n, n2, n3);
    }

    private static boolean ryh(bza_4 bza2_2) {
        block0: {
            int n = tsb.hbz(1131292178);
            int n2 = n ^ 0xABF87519;
            if ((n2 ^ n) == -1409780455) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xE896530B ^ n, 16) + 781299088;
        }
        return bza2_2.thaz();
    }

    private static String[] ghjq(String string) {
        block0: {
            int n = -1104576938;
            n = Integer.rotateLeft(n * 1400073301, 14) ^ 0x791DA55;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 14);
            int n2 = n ^ 0x5B477A60;
            if ((n2 ^ n) == 1531411040) break block0;
            int cfr_ignored_0 = (0xE56E0436 ^ n) + -1359862270;
        }
        return string.split("\u0006\u0018", -1);
    }

    private static CallSite zts_7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1190095774;
            n3 = Integer.rotateLeft(n3 * 115763675, 9) ^ 0xC0B70F9C;
            String string3 = string2;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 15);
            n3 = n ^ n3;
            int n4 = n3 ^ 0xEFA36BB2;
            if ((n4 ^ n3) != -274502734) {
                int cfr_ignored_0 = (0x56B3FFD0 ^ n3) - 1213702962;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ hza ^ string.hashCode() ^ n2 + dhhs_3 + i * -1981181361) + hza) ^ dhhs_3));
            }
            String[] stringArray = bza_4.ghjq(new String(cArray));
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

    private static String[] mmayd9f10qlg(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite j8ugvovzfavo7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ soz8ly6wi6l ^ string.hashCode() ^ n2 + pnqqxxhvvq + i * 2102426909) + soz8ly6wi6l) ^ pnqqxxhvvq));
            }
            String[] stringArray = bza_4.mmayd9f10qlg(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

