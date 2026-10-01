/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10255
 *  net.minecraft.class_1297
 *  net.minecraft.class_1496
 *  net.minecraft.class_1531
 *  net.minecraft.class_1533
 *  net.minecraft.class_1534
 *  net.minecraft.class_1540
 *  net.minecraft.class_1646
 *  net.minecraft.class_1688
 *  net.minecraft.class_2185
 *  net.minecraft.class_2248
 *  net.minecraft.class_2478
 *  net.minecraft.class_2680
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_10255;
import net.minecraft.class_1297;
import net.minecraft.class_1496;
import net.minecraft.class_1531;
import net.minecraft.class_1533;
import net.minecraft.class_1534;
import net.minecraft.class_1540;
import net.minecraft.class_1646;
import net.minecraft.class_1688;
import net.minecraft.class_2185;
import net.minecraft.class_2248;
import net.minecraft.class_2478;
import net.minecraft.class_2680;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.kt;

@tq_2(name="AntiTrap", category=bzw.OTHER, desc="Makes selected entities and thin blocks non-interactive")
public class brj
extends bnq {
    private static brj tsm_2;
    private final badh_2 dhbw = new badh_2(this, "Paintings").bts(true);
    private final badh_2 tkha_2 = new badh_2(this, "Item Frames").bts(true);
    private final badh_2 brf = new badh_2(this, "Minecarts").bts(true);
    private final badh_2 sml = new badh_2(this, "Falling B".concat("locks")).bts(false);
    private final badh_2 dhnd = new badh_2(this, "Armor Stands").bts(false);
    private final badh_2 tqs = new badh_2(this, "Banners").bts(false);
    private final badh_2 shas = new badh_2(this, "Villagers").bts(false);
    private final badh_2 bbm = new badh_2(this, "Horses").bts(false);
    private final badh_2 thdq_2 = new badh_2(this, "Signs").bts(false);
    private final badh_2 ttl_2 = new badh_2(this, "Boats").bts(false);
    private static final int shqt_2 = 758526367;
    private static final int ghw = -358377085;
    private static final int zkz = -120273177;
    private static final int shshw = 1350225590;
    private static final int az71hd7pw25 = 1561571999;
    private static final int b5w10vm = 1146219597;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int csbsex93t732;

    public brj() {
        tsm_2 = this;
    }

    public static brj dhqf() {
        block0: {
            int n = -810058089;
            int n2 = (n = Integer.rotateLeft(n * -9820049, 9) ^ 0x1B6D617) ^ 0x3F44298;
            if ((n2 ^ n) == 66339480) break block0;
            int cfr_ignored_0 = (0xCC433C0F ^ n) - 1204964418;
        }
        return tsm_2;
    }

    @Override
    public void nt() {
        int n = kt.khjn(-910141657);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xB2AF8243;
        if ((n2 ^ n) != -1297120701) {
            int cfr_ignored_0 = Integer.rotateLeft(0x7B6FD564 ^ n, 18) - -152537513;
        }
        this.zzq_3();
    }

    @Override
    public void nc() {
        int n = 1711620902;
        n = Integer.rotateLeft(n * 2055457891, 4) ^ 0x810E981E;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x98A59DF6;
        if ((n2 ^ n) != -1733976586) {
            int cfr_ignored_0 = (0xFEA0DED0 ^ n) + -2007610745;
        }
        brj.zzs_4(this);
    }

    public boolean hal_2(class_2680 class_26802) {
        int n = 501102373;
        n = Integer.rotateLeft(n * -136099965, 20) ^ 0xBF329BB5;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 29);
        class_2680 class_26803 = class_26802;
        n = (class_26803 != null ? System.identityHashCode(class_26803) : 0) ^ n;
        int n2 = n ^ 0x54764B60;
        if ((n2 ^ n) != 1417038688) {
            int cfr_ignored_0 = (0x49A87C45 ^ n) + 1784699576;
        }
        if (!brj.rfq(this) || class_26802 == null) {
            return false;
        }
        class_2248 class_22482 = class_26802.method_26204();
        return class_22482 instanceof class_2185 && this.tqs.shzl() || class_22482 instanceof class_2478 && this.thdq_2.shzl();
    }

    public boolean zta_5(class_2680 class_26802) {
        block0: {
            int n = kt.khjn(978758672);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 17);
            class_2680 class_26803 = class_26802;
            n = Integer.rotateLeft((class_26803 != null ? System.identityHashCode(class_26803) : 0) ^ n, 5);
            int n2 = n ^ 0xA1BA2DFA;
            if ((n2 ^ n) == -1581634054) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x9BEC81EA ^ n, 6) + -436118895;
        }
        return this.hal_2(class_26802);
    }

    public boolean hth_3(class_1297 class_12972) {
        boolean bl = false;
        int n = 0;
        int n2 = 1332926059;
        n2 = Integer.rotateLeft(n2 * 251562043, 22) ^ 0x1D03506A;
        class_1297 class_12973 = class_12972;
        n2 = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n2;
        int n3 = 1179697739 + n2;
        while (true) {
            block69: {
                block83: {
                    block95: {
                        block86: {
                            block81: {
                                block96: {
                                    block109: {
                                        block88: {
                                            block67: {
                                                block100: {
                                                    block75: {
                                                        block82: {
                                                            block104: {
                                                                block101: {
                                                                    block84: {
                                                                        block111: {
                                                                            block107: {
                                                                                block117: {
                                                                                    block113: {
                                                                                        block90: {
                                                                                            block94: {
                                                                                                block116: {
                                                                                                    block73: {
                                                                                                        block77: {
                                                                                                            block89: {
                                                                                                                block80: {
                                                                                                                    block70: {
                                                                                                                        block102: {
                                                                                                                            block71: {
                                                                                                                                block103: {
                                                                                                                                    block76: {
                                                                                                                                        block115: {
                                                                                                                                            block110: {
                                                                                                                                                block114: {
                                                                                                                                                    block97: {
                                                                                                                                                        block98: {
                                                                                                                                                            block108: {
                                                                                                                                                                block68: {
                                                                                                                                                                    block87: {
                                                                                                                                                                        block74: {
                                                                                                                                                                            block112: {
                                                                                                                                                                                block105: {
                                                                                                                                                                                    block106: {
                                                                                                                                                                                        block91: {
                                                                                                                                                                                            block99: {
                                                                                                                                                                                                block92: {
                                                                                                                                                                                                    block93: {
                                                                                                                                                                                                        block63: {
                                                                                                                                                                                                            block85: {
                                                                                                                                                                                                                block78: {
                                                                                                                                                                                                                    block79: {
                                                                                                                                                                                                                        block64: {
                                                                                                                                                                                                                            block72: {
                                                                                                                                                                                                                                block65: {
                                                                                                                                                                                                                                    block66: {
                                                                                                                                                                                                                                        if ((n = n3 - n2) > -292768779) break block63;
                                                                                                                                                                                                                                        if (n > -937417969) break block64;
                                                                                                                                                                                                                                        if (n > -1644514304) break block65;
                                                                                                                                                                                                                                        if (n > -1967704380) break block66;
                                                                                                                                                                                                                                        if (n == -2124914516) break block67;
                                                                                                                                                                                                                                        if (n == -1967704380) break block68;
                                                                                                                                                                                                                                        int cfr_ignored_0 = Integer.rotateLeft(0xAFBCCBE9 ^ n2, 8) + 1278890098;
                                                                                                                                                                                                                                        int cfr_ignored_1 = (int)(0x6D0E65D427D4EB4FL ^ (long)n2 ^ 0x36D8831A2DB977CDL);
                                                                                                                                                                                                                                        break block69;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (n == -1754380830) break block70;
                                                                                                                                                                                                                                    if (n == -1644514304) break block71;
                                                                                                                                                                                                                                    int cfr_ignored_2 = (Integer.rotateLeft(0xFFAD44D8 ^ n2, 18) + -94833309) * -5421863;
                                                                                                                                                                                                                                    break block69;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                if (n > -1443223834) break block72;
                                                                                                                                                                                                                                if (n == -1485510749) break block73;
                                                                                                                                                                                                                                if (n == -1443223834) break block74;
                                                                                                                                                                                                                                int cfr_ignored_3 = (Integer.rotateLeft(0x8D2C8BDD ^ n2, 4) - 482512638) * -1926460451;
                                                                                                                                                                                                                                int cfr_ignored_4 = (int)(0x4F9E25E027D4EB4FL ^ (long)n2 ^ 0xB6B0831A2DB932EDL);
                                                                                                                                                                                                                                break block69;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (n == -1224721936) break block75;
                                                                                                                                                                                                                            if (n == -1096142377) break block76;
                                                                                                                                                                                                                            int cfr_ignored_5 = (Integer.rotateRight(0x5F51FA5B ^ n2, 14) + -1890914240) * 1599208027;
                                                                                                                                                                                                                            if (n == -937417969) break block77;
                                                                                                                                                                                                                            break block69;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (n > -603171983) break block78;
                                                                                                                                                                                                                        if (n > -797517280) break block79;
                                                                                                                                                                                                                        if (n == -840665496) break block80;
                                                                                                                                                                                                                        if (n == -797517280) break block81;
                                                                                                                                                                                                                        break block69;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (n == -783017372) break block82;
                                                                                                                                                                                                                    if (n == -733071490) break block83;
                                                                                                                                                                                                                    int cfr_ignored_6 = Integer.rotateLeft(0x65545448 ^ n2, 15) + 1234424819;
                                                                                                                                                                                                                    if (n == -603171983) break block84;
                                                                                                                                                                                                                    break block69;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (n > -394181665) break block85;
                                                                                                                                                                                                                if (n == -552391713) break block86;
                                                                                                                                                                                                                if (n == -394181665) break block87;
                                                                                                                                                                                                                break block69;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (n == -354325135) break block88;
                                                                                                                                                                                                            if (n == -320031403) break block89;
                                                                                                                                                                                                            int cfr_ignored_7 = (Integer.rotateLeft(0x66DD88BC ^ n2, 15) - 2033266175) * 1725794493;
                                                                                                                                                                                                            if (n == -292768779) break block90;
                                                                                                                                                                                                            break block69;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (n > 1411458373) break block91;
                                                                                                                                                                                                        if (n > 598951337) break block92;
                                                                                                                                                                                                        if (n > -48693710) break block93;
                                                                                                                                                                                                        if (n == -218816879) break block94;
                                                                                                                                                                                                        if (n == -48693710) break block95;
                                                                                                                                                                                                        int cfr_ignored_8 = Integer.rotateLeft(0xA79ECC49 ^ n2, 7) + 1352162322;
                                                                                                                                                                                                        int cfr_ignored_9 = (int)(0x652C627427D4EB4FL ^ (long)n2 ^ 0x3998831A2DB96789L);
                                                                                                                                                                                                        break block69;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (n == 188757759) break block96;
                                                                                                                                                                                                    if (n == 536866488) break block97;
                                                                                                                                                                                                    int cfr_ignored_10 = Integer.rotateLeft(0xFB8A32CD ^ n2, 18) - 2048509454;
                                                                                                                                                                                                    int cfr_ignored_11 = (int)(0x39389CF027D4EB4FL ^ (long)n2 ^ 0xC490831A2DB9DFA0L);
                                                                                                                                                                                                    if (n == 598951337) break block98;
                                                                                                                                                                                                    break block69;
                                                                                                                                                                                                }
                                                                                                                                                                                                if (n > 746374507) break block99;
                                                                                                                                                                                                if (n == 651473864) break block100;
                                                                                                                                                                                                if (n == 746374507) break block101;
                                                                                                                                                                                                int cfr_ignored_12 = (Integer.rotateRight(0x7167E69B ^ n2, 17) + -1074623488) * 1902634651;
                                                                                                                                                                                                break block69;
                                                                                                                                                                                            }
                                                                                                                                                                                            if (n == 1059405104) break block102;
                                                                                                                                                                                            if (n == 1179697739) break block103;
                                                                                                                                                                                            int cfr_ignored_13 = (Integer.rotateRight(0xFD8F77F ^ n2, 4) - -274491492) * 265877375;
                                                                                                                                                                                            if (n == 1411458373) break block104;
                                                                                                                                                                                            break block69;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (n > 1809707175) break block105;
                                                                                                                                                                                        if (n > 1684347489) break block106;
                                                                                                                                                                                        if (n == 1471419886) break block107;
                                                                                                                                                                                        if (n == 1684347489) break block108;
                                                                                                                                                                                        break block69;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (n == 1797405582) break block109;
                                                                                                                                                                                    if (n == 1800988897) break block110;
                                                                                                                                                                                    int cfr_ignored_14 = (Integer.rotateLeft(0x7360E8BD ^ n2, 17) - -48640482) * 1935730877;
                                                                                                                                                                                    int cfr_ignored_15 = (int)(0xB1D2468027D4EB4FL ^ (long)n2 ^ 0x7070831A2DB8CE75L);
                                                                                                                                                                                    if (n == 1809707175) break block111;
                                                                                                                                                                                    break block69;
                                                                                                                                                                                }
                                                                                                                                                                                if (n > 1938981940) break block112;
                                                                                                                                                                                if (n == 1918245451) break block113;
                                                                                                                                                                                if (n == 1938981940) break block114;
                                                                                                                                                                                int cfr_ignored_16 = (Integer.rotateRight(0x1FDDD3F ^ n2, 3) - 1109092828) * 33414463;
                                                                                                                                                                                break block69;
                                                                                                                                                                            }
                                                                                                                                                                            if (n == 1969295768) break block115;
                                                                                                                                                                            if (n == 2056216158) break block116;
                                                                                                                                                                            int cfr_ignored_17 = Integer.rotateRight(0x1436C20A ^ n2, 5) + 1996430961;
                                                                                                                                                                            if (n == 2108767803) break block117;
                                                                                                                                                                            break block69;
                                                                                                                                                                        }
                                                                                                                                                                        int cfr_ignored_18 = (Integer.rotateRight(0x73AB445A ^ n2, 17) + 102426145) * 1940603995;
                                                                                                                                                                        if (class_12972 instanceof class_1534) {
                                                                                                                                                                            int cfr_ignored_19 = (int)(0x22B67DE9F299C828L ^ (long)n2 ^ 0x6A329806B77E8BDL);
                                                                                                                                                                            n3 = 1059405104 + n2;
                                                                                                                                                                            n -= 5;
                                                                                                                                                                            continue;
                                                                                                                                                                        }
                                                                                                                                                                        n3 = 158343038 + n2;
                                                                                                                                                                        int cfr_ignored_20 = (Integer.rotateRight(0x21D78FDB ^ n2, 7) + 494406336) * 567775195;
                                                                                                                                                                        n3 = (int)((long)(1938981940 + n2) ^ 0xC477829D18A816E4L ^ 0xC477829D18A816E4L);
                                                                                                                                                                        n += 2;
                                                                                                                                                                        continue;
                                                                                                                                                                    }
                                                                                                                                                                    int cfr_ignored_21 = (Integer.rotateRight(0x498FE29B ^ n2, 12) + -322301952) * 1234166427;
                                                                                                                                                                    if (!(class_12972 instanceof class_1688)) {
                                                                                                                                                                        try {
                                                                                                                                                                            n -= 4;
                                                                                                                                                                            if ((0x3EBA918201CE362FL ^ (long)n2 | 1L) == 0L) {
                                                                                                                                                                                throw new ArithmeticException();
                                                                                                                                                                            }
                                                                                                                                                                            n3 = -218816879 + n2;
                                                                                                                                                                        }
                                                                                                                                                                        catch (ArithmeticException arithmeticException) {
                                                                                                                                                                            n3 = -218816879 + n2 + -60090462 - -60090462;
                                                                                                                                                                        }
                                                                                                                                                                        n -= 5;
                                                                                                                                                                        continue;
                                                                                                                                                                    }
                                                                                                                                                                    n3 = -1096142377 + n2 + -25723598 - -25723598;
                                                                                                                                                                    --n;
                                                                                                                                                                    continue;
                                                                                                                                                                }
                                                                                                                                                                int cfr_ignored_22 = Integer.rotateLeft(0x1F5AF01 ^ n2, 3) + 1092472922;
                                                                                                                                                                int cfr_ignored_23 = (int)(0xC347013C27D4EB4FL ^ (long)n2 ^ 0xFF08831A2DB82B5FL);
                                                                                                                                                                if (class_12972 instanceof class_1646) {
                                                                                                                                                                    try {
                                                                                                                                                                        ++n;
                                                                                                                                                                        if ((0x5114AA63B1FAB111L ^ (long)n2 | 1L) == 0L) {
                                                                                                                                                                            throw new NoSuchElementException();
                                                                                                                                                                        }
                                                                                                                                                                        n3 = -292768779 + n2 + 918314485 - 918314485;
                                                                                                                                                                    }
                                                                                                                                                                    catch (NoSuchElementException noSuchElementException) {
                                                                                                                                                                        n3 = (int)((long)(-292768779 + n2) ^ 0x6C875DB8DF524884L ^ 0x6C875DB8DF524884L);
                                                                                                                                                                    }
                                                                                                                                                                    n += 2;
                                                                                                                                                                    continue;
                                                                                                                                                                }
                                                                                                                                                                int cfr_ignored_24 = (int)(0x1E772971165902AAL ^ (long)n2 ^ 0xAF92E001FE73913FL);
                                                                                                                                                                n3 = -1644514304 + n2 + -1389196884 - -1389196884;
                                                                                                                                                                n += 5;
                                                                                                                                                                continue;
                                                                                                                                                            }
                                                                                                                                                            int cfr_ignored_25 = Integer.rotateRight(0xE0D520E ^ n2, 4) - -1208316179;
                                                                                                                                                            if (class_12972 instanceof class_1531) {
                                                                                                                                                                n3 = (int)((long)(250242264 + n2) ^ 0xED703E6D747D7D14L ^ 0xED703E6D747D7D14L);
                                                                                                                                                                int cfr_ignored_26 = (Integer.rotateLeft(0x5195AB70 ^ n2, 13) + -444767797) * 1368763249;
                                                                                                                                                                n3 = 598951337 + n2 + 1800262135 - 1800262135;
                                                                                                                                                                continue;
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                n3 = (int)((long)(-1967704380 + n2) ^ 0xF38CFD48953202D1L ^ 0xF38CFD48953202D1L);
                                                                                                                                                            }
                                                                                                                                                            catch (IllegalStateException illegalStateException) {
                                                                                                                                                                n3 = -1967704380 + n2 ^ 0xBE8A1A93 ^ 0xBE8A1A93;
                                                                                                                                                            }
                                                                                                                                                            n += 4;
                                                                                                                                                            continue;
                                                                                                                                                        }
                                                                                                                                                        int cfr_ignored_27 = (Integer.rotateRight(0x582AF016 ^ n2, 14) - -1315917339) * 1479208983;
                                                                                                                                                        bl = this.dhnd.shzl();
                                                                                                                                                        try {
                                                                                                                                                            n3 = Integer.reverse(Integer.reverse(-733071490 + n2));
                                                                                                                                                        }
                                                                                                                                                        catch (IllegalStateException illegalStateException) {
                                                                                                                                                            n3 = -733071490 + n2 + 320253620 - 320253620;
                                                                                                                                                        }
                                                                                                                                                        n -= 4;
                                                                                                                                                        continue;
                                                                                                                                                    }
                                                                                                                                                    int cfr_ignored_28 = Integer.rotateLeft(0x6F12232D ^ n2, 16) - 2005918126;
                                                                                                                                                    int cfr_ignored_29 = (int)(0xADA08D1027D4EB4FL ^ (long)n2 ^ 0xE750831A2DB8F690L);
                                                                                                                                                    bl = false;
                                                                                                                                                    n3 = -733071490 + n2 + -1311889733 - -1311889733;
                                                                                                                                                    n -= 4;
                                                                                                                                                    continue;
                                                                                                                                                }
                                                                                                                                                int cfr_ignored_30 = Integer.rotateRight(0xB2885C0E ^ n2, 9) - -1562327827;
                                                                                                                                                if (class_12972 instanceof class_1533) {
                                                                                                                                                    int cfr_ignored_31 = (int)(0x77B0B28917735442L ^ (long)n2 ^ 0x9862E25553A342B0L);
                                                                                                                                                    n3 = 1894762103 + n2;
                                                                                                                                                    int cfr_ignored_32 = (int)(0x94FB80CAA35C80BAL ^ (long)n2 ^ 0xFCE58A0AFA528426L);
                                                                                                                                                    n3 = -937417969 + n2 + 554213300 - 554213300;
                                                                                                                                                    continue;
                                                                                                                                                }
                                                                                                                                                n3 = -61366629 + n2;
                                                                                                                                                int cfr_ignored_33 = (Integer.rotateLeft(0x8A4305F9 ^ n2, 4) + -1032103838) * -1975319047;
                                                                                                                                                int cfr_ignored_34 = (int)(0x48F1ABC427D4EB4FL ^ (long)n2 ^ 0xAAF8831A2DB93C32L);
                                                                                                                                                n3 = -394181665 + n2;
                                                                                                                                                n += 2;
                                                                                                                                                continue;
                                                                                                                                            }
                                                                                                                                            int cfr_ignored_35 = Integer.rotateLeft(0x5E259325 ^ n2, 14) - 1793749174;
                                                                                                                                            int cfr_ignored_36 = (int)(0x9C973D1827D4EB4FL ^ (long)n2 ^ 0x8740831A2DB894FFL);
                                                                                                                                            bl = this.ttl_2.shzl();
                                                                                                                                            try {
                                                                                                                                                n3 = -733071490 + n2 + 33509875 - 33509875;
                                                                                                                                            }
                                                                                                                                            catch (NoSuchElementException noSuchElementException) {
                                                                                                                                                n3 = -733071490 + n2 + -171571284 - -171571284;
                                                                                                                                            }
                                                                                                                                            n += 4;
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                        int cfr_ignored_37 = (Integer.rotateRight(0x88388F9F ^ n2, 4) - -2093546628) * -2009559137;
                                                                                                                                        bl = this.ttl_2.shzl();
                                                                                                                                        try {
                                                                                                                                            n += 3;
                                                                                                                                            if ((0xEA16A73D10860CB1L ^ (long)n2 | 1L) == 0L) {
                                                                                                                                                throw new IllegalArgumentException();
                                                                                                                                            }
                                                                                                                                            n3 = -733071490 + n2 ^ 0x963D8A3B ^ 0x963D8A3B;
                                                                                                                                        }
                                                                                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                            n3 = -733071490 + n2 + 1203450719 - 1203450719;
                                                                                                                                        }
                                                                                                                                        n += 2;
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                    int cfr_ignored_38 = Integer.rotateRight(0xBEEA4307 ^ n2, 10) - 582728980;
                                                                                                                                    bl = this.brf.shzl();
                                                                                                                                    try {
                                                                                                                                        n -= 5;
                                                                                                                                        if ((0x86BF70116B0FB763L ^ (long)n2 | 1L) == 0L) {
                                                                                                                                            throw new NoSuchElementException();
                                                                                                                                        }
                                                                                                                                        n3 = -733071490 + n2;
                                                                                                                                    }
                                                                                                                                    catch (NoSuchElementException noSuchElementException) {
                                                                                                                                        n3 = -733071490 + n2 + 637243891 - 637243891;
                                                                                                                                    }
                                                                                                                                    n -= 4;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                int cfr_ignored_39 = Integer.rotateRight(0x36B3B503 ^ n2, 9) + -1541371240;
                                                                                                                                if (this.rgha_2()) {
                                                                                                                                    int cfr_ignored_40 = (int)(0x51ECC1564219FF7AL ^ (long)n2 ^ 0x7FDC488005D30E08L);
                                                                                                                                    n3 = (int)((long)(565699034 + n2) ^ 0x6042F7AC505B8473L ^ 0x6042F7AC505B8473L);
                                                                                                                                    int cfr_ignored_41 = (int)(0x2C9C7B5BAA8900BFL ^ (long)n2 ^ 0xBC799A1FA59F4E9L);
                                                                                                                                    n3 = -840665496 + n2 ^ 0xE2FB2300 ^ 0xE2FB2300;
                                                                                                                                    n -= 5;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    n3 = (int)((long)(-1485510749 + n2) ^ 0xAD0E195F6A73CDFCL ^ 0xAD0E195F6A73CDFCL);
                                                                                                                                }
                                                                                                                                catch (ArithmeticException arithmeticException) {
                                                                                                                                    n3 = -1485510749 + n2 ^ 0xBC94F407 ^ 0xBC94F407;
                                                                                                                                }
                                                                                                                                ++n;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            int cfr_ignored_42 = (Integer.rotateLeft(0xE235B811 ^ n2, 15) + 1759439178) * -499795951;
                                                                                                                            int cfr_ignored_43 = (int)(0x2087162C27D4EB4FL ^ (long)n2 ^ 0xD128831A2DB9ECDFL);
                                                                                                                            if (class_12972 instanceof class_1496) {
                                                                                                                                n3 = Integer.reverse(Integer.reverse(-1860917189 + n2));
                                                                                                                                int cfr_ignored_44 = Integer.rotateRight(0x4C2B9926 ^ n2, 12) - 1034234581;
                                                                                                                                n3 = 2056216158 + n2 + -1604292365 - -1604292365;
                                                                                                                                n += 5;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            int cfr_ignored_45 = (int)(0x60D1D11E4651499AL ^ (long)n2 ^ 0x5F4C401168136C72L);
                                                                                                                            n3 = (int)((long)(-1158293095 + n2) ^ 0xCE11C8BAC040F9DBL ^ 0xCE11C8BAC040F9DBL);
                                                                                                                            int cfr_ignored_46 = (int)(0xE4FB4EA9AC21EF40L ^ (long)n2 ^ 0x602394F025A66427L);
                                                                                                                            n3 = -1754380830 + n2 + -255940384 - -255940384;
                                                                                                                            --n;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        int cfr_ignored_47 = (Integer.rotateRight(0x3C0D5B53 ^ n2, 10) + 1241230920) * 1007508307;
                                                                                                                        bl = this.dhbw.shzl();
                                                                                                                        int cfr_ignored_48 = (int)(0xE44817C8B2D51E1FL ^ (long)n2 ^ 0xD2E1A919C7186541L);
                                                                                                                        n3 = 1138125191 + n2;
                                                                                                                        int cfr_ignored_49 = (int)(0xD910F9EF9D86E051L ^ (long)n2 ^ 0xEAFF7BE3B841FF0L);
                                                                                                                        n3 = (int)((long)(-733071490 + n2) ^ 0x3008410E501D2064L ^ 0x3008410E501D2064L);
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    int cfr_ignored_50 = Integer.rotateRight(0x1A16E8E2 ^ n2, 6) + 757322393;
                                                                                                                    if (class_12972 instanceof class_10255) {
                                                                                                                        n3 = 1169156925 + n2;
                                                                                                                        int cfr_ignored_51 = Integer.rotateLeft(0x19D5B12D ^ n2, 6) - 624825262;
                                                                                                                        int cfr_ignored_52 = (int)(0xDB671F1027D4EB4FL ^ (long)n2 ^ 0xC350831A2DB81B1FL);
                                                                                                                        n3 = 1969295768 + n2;
                                                                                                                        n -= 5;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    n3 = 586343727 + n2 ^ 0xBC8AB690 ^ 0xBC8AB690;
                                                                                                                    int cfr_ignored_53 = (Integer.rotateLeft(0xDD2F4FBC ^ n2, 14) - -854046977) * -584101955;
                                                                                                                    n3 = Integer.reverse(Integer.reverse(536866488 + n2));
                                                                                                                    continue;
                                                                                                                }
                                                                                                                int cfr_ignored_54 = Integer.rotateRight(0xDD2449C7 ^ n2, 14) - -876442028;
                                                                                                                if (class_12972 != null) {
                                                                                                                    n3 = -1443223834 + n2 + 1150474594 - 1150474594;
                                                                                                                    n -= 3;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                int cfr_ignored_55 = (int)(0x1193469298190E9FL ^ (long)n2 ^ 0x7055FC81E6198EF7L);
                                                                                                                n3 = -1007556287 + n2 ^ 0xB15DE5B1 ^ 0xB15DE5B1;
                                                                                                                int cfr_ignored_56 = (int)(0x1D8541EC1F2D2FEBL ^ (long)n2 ^ 0x7EA8F2E9A4F196DBL);
                                                                                                                n3 = Integer.reverse(Integer.reverse(-1485510749 + n2));
                                                                                                                n += 4;
                                                                                                                continue;
                                                                                                            }
                                                                                                            int cfr_ignored_57 = (Integer.rotateLeft(0x963BC5D ^ n2, 4) - 661745278) * 157531229;
                                                                                                            int cfr_ignored_58 = (int)(0xCBD1126027D4EB4FL ^ (long)n2 ^ 0xD9B0831A2DB83A73L);
                                                                                                            bl = this.sml.shzl();
                                                                                                            try {
                                                                                                                n += 5;
                                                                                                                if ((0x8BFCB988F9AAD2BL ^ (long)n2 | 1L) == 0L) {
                                                                                                                    throw new UnsupportedOperationException();
                                                                                                                }
                                                                                                                n3 = -733071490 + n2 ^ 0x7A10B59C ^ 0x7A10B59C;
                                                                                                            }
                                                                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                                n3 = -733071490 + n2 ^ 0x36D1E564 ^ 0x36D1E564;
                                                                                                            }
                                                                                                            n -= 4;
                                                                                                            continue;
                                                                                                        }
                                                                                                        int cfr_ignored_59 = Integer.rotateRight(0x62F49CA7 ^ n2, 15) - -223372;
                                                                                                        bl = this.tkha_2.shzl();
                                                                                                        try {
                                                                                                            n3 = (int)((long)(-733071490 + n2) ^ 0xA33F30A5ED3F9F46L ^ 0xA33F30A5ED3F9F46L);
                                                                                                        }
                                                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                                                            n3 = (int)((long)(-733071490 + n2) ^ 0x579ABBCF3FBAAA30L ^ 0x579ABBCF3FBAAA30L);
                                                                                                        }
                                                                                                        continue;
                                                                                                    }
                                                                                                    int cfr_ignored_60 = Integer.rotateLeft(0x6242FAED ^ n2, 15) - -361102866;
                                                                                                    int cfr_ignored_61 = (int)(0xA0F054D027D4EB4FL ^ (long)n2 ^ 0x54D0831A2DB8EC31L);
                                                                                                    bl = false;
                                                                                                    int cfr_ignored_62 = (int)(0xFEB14391C1BF64D7L ^ (long)n2 ^ 0x7A534FCD328850B3L);
                                                                                                    n3 = -733071490 + n2 + -1958549258 - -1958549258;
                                                                                                    n -= 2;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_63 = Integer.rotateRight(0xF5308FE6 ^ n2, 17) - -1254159339;
                                                                                                bl = this.bbm.shzl();
                                                                                                try {
                                                                                                    n += 5;
                                                                                                    n3 = -733071490 + n2 ^ 0x947C8EDB ^ 0x947C8EDB;
                                                                                                }
                                                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                    n3 = Integer.reverse(Integer.reverse(-733071490 + n2));
                                                                                                }
                                                                                                --n;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_64 = (Integer.rotateLeft(0x81641675 ^ n2, 3) - -1350805658) * -2124147083;
                                                                                            int cfr_ignored_65 = (int)(0x43D6B84827D4EB4FL ^ (long)n2 ^ 0x8DE0831A2DB92A7CL);
                                                                                            if (!(class_12972 instanceof class_1540)) {
                                                                                                n3 = Integer.reverse(Integer.reverse(1684347489 + n2));
                                                                                                int cfr_ignored_66 = Integer.rotateLeft(0x640AD1C0 ^ n2, 15) + 564987259;
                                                                                                n -= 3;
                                                                                                continue;
                                                                                            }
                                                                                            n3 = -320031403 + n2 + -471275766 - -471275766;
                                                                                            n -= 3;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_67 = Integer.rotateRight(0xFD808E2F ^ n2, 18) - -1225861396;
                                                                                        bl = this.shas.shzl();
                                                                                        try {
                                                                                            n3 = -733071490 + n2 ^ 0x4D5FA481 ^ 0x4D5FA481;
                                                                                        }
                                                                                        catch (ArithmeticException arithmeticException) {
                                                                                            n3 = -733071490 + n2 + -136429745 - -136429745;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_68 = (Integer.rotateRight(0xCDDF5396 ^ n2, 12) - -228016539) * -841002089;
                                                                                    n3 = -512223072 + n2 + 438743069 - 438743069;
                                                                                    int cfr_ignored_69 = (Integer.rotateRight(0x6996323E ^ n2, 16) - -846351171) * 1771450943;
                                                                                    try {
                                                                                        n -= 3;
                                                                                        if ((0xBC8609D8C4B4F905L ^ (long)n2 | 1L) == 0L) {
                                                                                            throw new UnsupportedOperationException();
                                                                                        }
                                                                                        n3 = 1179697739 + n2 ^ 0x46E6C96F ^ 0x46E6C96F;
                                                                                    }
                                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                        n3 = 1179697739 + n2;
                                                                                    }
                                                                                    n -= 5;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_70 = Integer.rotateLeft(0x7B419624 ^ n2, 18) - -246493801;
                                                                                n3 = -1781261387 + n2 ^ 0xD6954B9A ^ 0xD6954B9A;
                                                                                int cfr_ignored_71 = (Integer.rotateLeft(0x9FD11C9D ^ n2, 6) - 1588598334) * -1613685603;
                                                                                int cfr_ignored_72 = (int)(0x5D63B2A027D4EB4FL ^ (long)n2 ^ 0x9830831A2DB91716L);
                                                                                try {
                                                                                    if ((0x494031657053C003L ^ (long)n2 | 1L) == 0L) {
                                                                                        throw new UnsupportedOperationException();
                                                                                    }
                                                                                    n3 = Integer.reverse(Integer.reverse(1179697739 + n2));
                                                                                }
                                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                    n3 = 1179697739 + n2 + 1607161766 - 1607161766;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_73 = Integer.rotateLeft(0x654181A1 ^ n2, 15) + 1196183994;
                                                                            int cfr_ignored_74 = (int)(0xA7F32F9C27D4EB4FL ^ (long)n2 ^ 0xA248831A2DB8E237L);
                                                                            n3 = 1179697739 + n2 + 1111035443 - 1111035443;
                                                                            int cfr_ignored_75 = (Integer.rotateRight(0x48F170BB ^ n2, 12) + -644200992) * 1223782587;
                                                                            --n;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_76 = Integer.rotateRight(0x8A0C094B ^ n2, 4) + -1143816368;
                                                                        n3 = 664254373 + n2;
                                                                        int cfr_ignored_77 = (Integer.rotateRight(0x4E88A47B ^ n2, 12) + -2031515104) * 1317577851;
                                                                        try {
                                                                            if ((0x8C9CBB8B2BD72D07L ^ (long)n2 | 1L) == 0L) {
                                                                                throw new NoSuchElementException();
                                                                            }
                                                                            n3 = (int)((long)(1179697739 + n2) ^ 0x7E93F828A947E685L ^ 0x7E93F828A947E685L);
                                                                        }
                                                                        catch (NoSuchElementException noSuchElementException) {
                                                                            n3 = 1179697739 + n2;
                                                                        }
                                                                        n -= 2;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_78 = Integer.rotateLeft(0x4A721EA0 ^ n2, 12) + 137319579;
                                                                    try {
                                                                        n += 3;
                                                                        if ((0x94391F7F7862DDA7L ^ (long)n2 | 1L) == 0L) {
                                                                            throw new ArithmeticException();
                                                                        }
                                                                        n3 = 1179697739 + n2;
                                                                    }
                                                                    catch (ArithmeticException arithmeticException) {
                                                                        n3 = 1179697739 + n2 ^ 0xF04EC2E2 ^ 0xF04EC2E2;
                                                                    }
                                                                    ++n;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_79 = (Integer.rotateRight(0x6B592EFF ^ n2, 16) - 69881884) * 1801006847;
                                                                n3 = 1137669816 + n2;
                                                                int cfr_ignored_80 = (Integer.rotateRight(0x3C9E0477 ^ n2, 10) - 1535125924) * 1016988791;
                                                                try {
                                                                    n3 = 1179697739 + n2 ^ 0x6FE1B5D7 ^ 0x6FE1B5D7;
                                                                }
                                                                catch (IllegalStateException illegalStateException) {
                                                                    n3 = 1179697739 + n2 ^ 0xEB155806 ^ 0xEB155806;
                                                                }
                                                                n += 4;
                                                                continue;
                                                            }
                                                            int cfr_ignored_81 = (Integer.rotateRight(0xCEA7F3B3 ^ n2, 12) + 179577320) * -827853901;
                                                            n3 = 1179697739 + n2 ^ 0x1740C45D ^ 0x1740C45D;
                                                            int cfr_ignored_82 = Integer.rotateRight(0xE39D6962 ^ n2, 15) + -1804770791;
                                                            n += 4;
                                                            continue;
                                                        }
                                                        int cfr_ignored_83 = Integer.rotateRight(0xD556AD2F ^ n2, 13) - -639854612;
                                                        try {
                                                            n -= 5;
                                                            if ((0x8A322A4DD59D8477L ^ (long)n2 | 1L) == 0L) {
                                                                throw new NoSuchElementException();
                                                            }
                                                            n3 = 1179697739 + n2;
                                                        }
                                                        catch (NoSuchElementException noSuchElementException) {
                                                            n3 = 1179697739 + n2 + 1727629243 - 1727629243;
                                                        }
                                                        n -= 4;
                                                        continue;
                                                    }
                                                    int cfr_ignored_84 = Integer.rotateRight(0x4461C02B ^ n2, 11) + 1278469232;
                                                    n3 = (int)((long)(-1821724882 + n2) ^ 0x36874EF5B2C93837L ^ 0x36874EF5B2C93837L);
                                                    int cfr_ignored_85 = (Integer.rotateLeft(0x23A09DB9 ^ n2, 7) + 1422964898) * 597728697;
                                                    int cfr_ignored_86 = (int)(0xE112338427D4EB4FL ^ (long)n2 ^ 0x9A78831A2DB86FF5L);
                                                    n3 = Integer.reverse(Integer.reverse(1645237532 + n2));
                                                    int cfr_ignored_87 = (Integer.rotateRight(0x7C33717A ^ n2, 18) + 244866305) * 2083746171;
                                                    n3 = 1179697739 + n2 ^ 0xA8626E24 ^ 0xA8626E24;
                                                    n -= 3;
                                                    continue;
                                                }
                                                int cfr_ignored_88 = Integer.rotateRight(0x990FC103 ^ n2, 6) + -1924792680;
                                                n3 = -308337190 + n2;
                                                int cfr_ignored_89 = Integer.rotateRight(0x2235D627 ^ n2, 7) - 685936116;
                                                n3 = Integer.reverse(Integer.reverse(1179697739 + n2));
                                                ++n;
                                                continue;
                                            }
                                            int cfr_ignored_90 = (Integer.rotateRight(0xBC1EE276 ^ n2, 10) - -870642811) * -1138826633;
                                            int cfr_ignored_91 = (int)(0x5CCF88B223DEA2A6L ^ (long)n2 ^ 0xEC148B0EBE6B144EL);
                                            n3 = 1179697739 + n2 ^ 0x271F5B83 ^ 0x271F5B83;
                                            continue;
                                        }
                                        int cfr_ignored_92 = (Integer.rotateLeft(0x2DB78934 ^ n2, 8) - -1919468409) * 767002933;
                                        n3 = -1423714876 + n2 ^ 0xEE46F6F5 ^ 0xEE46F6F5;
                                        int cfr_ignored_93 = Integer.rotateRight(0x9CDDCB2E ^ n2, 6) - 54081997;
                                        int cfr_ignored_94 = (int)(0x756388C56DD60435L ^ (long)n2 ^ 0xECFA171FF34D4716L);
                                        n3 = 960288719 + n2;
                                        int cfr_ignored_95 = (int)(0x99483B3EA2A67356L ^ (long)n2 ^ 0x8B0D89FF1D8A9F41L);
                                        n3 = (int)((long)(1179697739 + n2) ^ 0x690EEAEBB2C4F3A5L ^ 0x690EEAEBB2C4F3A5L);
                                        continue;
                                    }
                                    int cfr_ignored_96 = (Integer.rotateRight(0xB956ABF ^ n2, 4) - 1802865756) * 194341567;
                                    try {
                                        n -= 2;
                                        if ((0xEC15F35858C21C77L ^ (long)n2 | 1L) == 0L) {
                                            throw new NoSuchElementException();
                                        }
                                        n3 = 1179697739 + n2;
                                    }
                                    catch (NoSuchElementException noSuchElementException) {
                                        n3 = (int)((long)(1179697739 + n2) ^ 0x731737D5C5674732L ^ 0x731737D5C5674732L);
                                    }
                                    n -= 3;
                                    continue;
                                }
                                int cfr_ignored_97 = (Integer.rotateLeft(0x3DCDDE5C ^ n2, 10) - -2142532513) * 1036901981;
                                n3 = 1737297249 + n2;
                                int cfr_ignored_98 = Integer.rotateLeft(0x985DDF41 ^ n2, 6) + 2008786970;
                                int cfr_ignored_99 = (int)(0x5AEF717C27D4EB4FL ^ (long)n2 ^ 0x1F88831A2DB9180FL);
                                try {
                                    --n;
                                    if ((0xB8EA73DDDD61A2B7L ^ (long)n2 | 1L) == 0L) {
                                        throw new ArithmeticException();
                                    }
                                    n3 = 1179697739 + n2;
                                }
                                catch (ArithmeticException arithmeticException) {
                                    n3 = Integer.reverse(Integer.reverse(1179697739 + n2));
                                }
                                continue;
                            }
                            int cfr_ignored_100 = (Integer.rotateRight(0x63188F9B ^ n2, 15) + 72811264) * 1662554011;
                            n3 = (int)((long)(1179697739 + n2) ^ 0xB45A287E589224BEL ^ 0xB45A287E589224BEL);
                            int cfr_ignored_101 = (Integer.rotateLeft(0xA0DE7618 ^ n2, 7) + 2135813155) * -1596033511;
                            n -= 2;
                            continue;
                        }
                        int cfr_ignored_102 = (Integer.rotateLeft(0x7481EC75 ^ n2, 17) - 538526054) * 1954671733;
                        int cfr_ignored_103 = (int)(0xB633424827D4EB4FL ^ (long)n2 ^ 0x79E0831A2DB8C1B7L);
                        n3 = (int)((long)(1179697739 + n2) ^ 0x1AFD0C45F5B64EADL ^ 0x1AFD0C45F5B64EADL);
                        n -= 2;
                        continue;
                    }
                    int cfr_ignored_104 = (Integer.rotateLeft(0xF0E8B4B9 ^ n2, 17) + 814449058) * -253184839;
                    int cfr_ignored_105 = (int)(0x325A1A8427D4EB4FL ^ (long)n2 ^ 0xC878831A2DB9C965L);
                    n3 = (int)((long)(-669905986 + n2) ^ 0xCC7478F2D3D13BADL ^ 0xCC7478F2D3D13BADL);
                    int cfr_ignored_106 = Integer.rotateLeft(0x1C06B06D ^ n2, 6) - 1764555886;
                    int cfr_ignored_107 = (int)(0xDEB41E5027D4EB4FL ^ (long)n2 ^ 0xC1D0831A2DB810B9L);
                    int cfr_ignored_108 = (int)(0xD393136C73AB3638L ^ (long)n2 ^ 0xDBA82BE597560AF7L);
                    n3 = 1191523551 + n2;
                    int cfr_ignored_109 = (int)(0xE23A40CEEE1792C2L ^ (long)n2 ^ 0x7CED109CDEA269A5L);
                    n3 = (int)((long)(1179697739 + n2) ^ 0x4B4D6B8E154716B8L ^ 0x4B4D6B8E154716B8L);
                    n += 4;
                    continue;
                }
                return bl;
            }
            int cfr_ignored_110 = Integer.rotateRight(0x9A7F2EEA ^ n2, 6) + -1178317423;
            n3 = Integer.reverse(Integer.reverse(1179697739 + n2));
        }
    }

    private void zzq_3() {
        if (mc != null && brj.mc.field_1769 != null) {
            brj.mc.field_1769.method_3279();
        }
    }

    private static String hdsh_2(String string, int n, int n2, int n3) {
        int n4 = kt.khjn(789110544);
        String string2 = string;
        n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 19);
        int n5 = (n4 = Integer.rotateLeft(n ^ n4, 22)) ^ 0xB3FB43B4;
        if ((n5 ^ n4) != -1275378764) {
            int cfr_ignored_0 = Integer.rotateLeft(0x9CF39CA4 ^ n4, 6) - 98408215;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x4CEB0D84 ^ n2 ^ i * 1338195353 ^ shqt_2, 23) ^ ghw));
        }
        return new String(cArray);
    }

    private static void zzs_4(brj brj2) {
        int n = 185171665;
        int n2 = (n = Integer.rotateLeft(n * 1574419271, 13) ^ 0x5322F261) ^ 0x44D75B8A;
        if ((n2 ^ n) != 1154964362) {
            int cfr_ignored_0 = (0x4FDE255B ^ n) - -1688683704;
        }
        brj2.zzq_3();
    }

    private static boolean rfq(brj brj2) {
        block0: {
            int n = kt.khjn(481603954);
            brj brj3 = brj2;
            n = Integer.rotateLeft((brj3 != null ? System.identityHashCode(brj3) : 0) ^ n, 16);
            int n2 = n ^ 0x9FAB93F7;
            if ((n2 ^ n) == -1616145417) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x831F2285 ^ n, 3) - -450704042;
            int cfr_ignored_1 = (int)(0x41AD8CB827D4EB4FL ^ (long)n ^ 0xE400831A2DB92E8AL);
        }
        return brj2.rgha_2();
    }

    private static String[] ghdz_3(String string) {
        int n = 1873481397;
        int n2 = (n = Integer.rotateLeft(n * 1275068075, 23) ^ 0x30D186F4) ^ 0xE5444180;
        if ((n2 ^ n) != -448511616) {
            int cfr_ignored_0 = (0x8AEF4F35 ^ n) - -833388088;
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

    private static CallSite atgh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1907093837;
            n3 = Integer.rotateLeft(n3 * -1635877663, 8) ^ 0xA197A17D;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 3);
            String string4 = string2;
            n3 = (string4 != null ? System.identityHashCode(string4) : 0) ^ n3;
            int n4 = n3 ^ 0x926E8E2C;
            if ((n4 ^ n3) != -1838248404) {
                int cfr_ignored_0 = (0xE3C57F61 ^ n3) - 756817747;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ zkz ^ string.hashCode()) + (n2 + shshw) + i ^ zkz, 21) + shshw);
            }
            String[] stringArray = brj.ghdz_3(new String(cArray));
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

    private static String[] mtdqjf2ndov(String string) {
        return string.split("\u0004\u0017", -1);
    }

    private static CallSite x2arh7ug7z(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ az71hd7pw25 ^ string.hashCode()) + (n2 + b5w10vm) + i ^ az71hd7pw25, 24) + b5w10vm);
            }
            String[] stringArray = brj.mtdqjf2ndov(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

