/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1297$class_5529
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_2596
 *  net.minecraft.class_310
 *  net.minecraft.class_7828
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2596;
import net.minecraft.class_310;
import net.minecraft.class_7828;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bksh;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hs_2;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Anti Bot", category=bzw.OTHER, desc="Detects fake combat bots")
public class blh_2
extends bnq {
    public static final CopyOnWriteArrayList sygh;
    private static final Set hfb;
    private final Map dqkh = new HashMap();
    private final badh_2 thqy = new badh_2(this, "Remove".concat(" From World")).bts(false);
    private final tay jny = new tay(this, "Confirm Ticks").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(-604487175 - -1697103367)).rkh_3(1.0f).ssd_5(2.0f);
    private final badh_2 taa_4 = new badh_2(this, "Armor Check").bts(true);
    private final bql<bksh> hzd = this::dyn_2;
    private final bql<btt> dhgha = this::shnq;
    private static final int raz_3 = -1787021017;
    private static final int jad = -24447795;
    private static final int bz = 1983417394;
    private static final int bya = -511161426;
    private static final int yck722zv9 = -256097242;
    private static final int isgqjr0ea = -232037916;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int cbs7bfcvhj;

    private void rkhn() {
        int n = 1590158519;
        n = Integer.rotateLeft(n * 1489151917, 27) ^ 0x2D8D365A;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xA40C06DC;
        if ((n2 ^ n) != -1542715684) {
            int cfr_ignored_0 = (0xFACBE26B ^ n) - 2009876826;
        }
        HashSet<UUID> hashSet = new HashSet<UUID>();
        for (class_1657 class_16572 : blh_2.mc.field_1687.method_18456()) {
            if (class_16572 == null || class_16572 == blh_2.mc.field_1724) continue;
            UUID uUID = blh_2.dhs_2(class_16572);
            hashSet.add(uUID);
            if (blh_2.thghn(this, class_16572)) {
                int n3 = this.dqkh.merge(uUID, 1, Integer::sum);
                if (!((float)n3 >= this.jny.thw_5())) continue;
                hfb.add(uUID);
                if (!this.thqy.shzl()) continue;
                class_16572.method_31745(class_1297.class_5529.field_26999);
                class_16572.method_36209();
                continue;
            }
            this.dqkh.remove(uUID);
            hfb.remove(uUID);
        }
        this.dqkh.keySet().removeIf(arg_0 -> blh_2.srt_3(hashSet, arg_0));
        hfb.removeIf(arg_0 -> blh_2.lk(hashSet, arg_0));
    }

    private boolean khwdh(class_1657 class_16572) {
        int n = hs_2.khdk_2(785639304);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
        int n2 = n ^ 0xDAB36784;
        if ((n2 ^ n) != -625776764) {
            int cfr_ignored_0 = Integer.rotateLeft(0xF460800C ^ n, 17) - -1676861265;
        }
        if (class_16572 == null || class_16572 == blh_2.mc.field_1724 || !blh_2.hqkh(class_16572) || class_16572.method_7325()) {
            return false;
        }
        String string = class_16572.method_5477().getString();
        if (string.contains("NPC") || blh_2.sft_4(string, "[ZNPC]") || blh_2.sdb_3(blh_2.ddhw_2(Moondlc.getInstance()), string)) {
            return false;
        }
        if (!blh_2.shnth(this.taa_4)) {
            return false;
        }
        class_1799 class_17992 = class_16572.method_31548().method_7372(0);
        class_1799 class_17993 = blh_2.ghzr_2(class_16572.method_31548(), 1);
        class_1799 class_17994 = blh_2.thdh_4(class_16572.method_31548(), 2);
        class_1799 class_17995 = blh_2.jgha_2(blh_2.thkkh(class_16572), 3);
        boolean bl = !class_17992.method_7960() && !blh_2.sas_2(class_17993) && !class_17994.method_7960() && !class_17995.method_7960();
        boolean bl2 = blh_2.sln_2(class_17992) && blh_2.ghkhm(class_17993) && class_17994.method_7923() && class_17995.method_7923();
        boolean bl3 = blh_2.sthw(this, class_17992) && this.ghzt_3(class_17993) && this.ghzt_3(class_17994) && this.ghzt_3(class_17995);
        boolean bl4 = class_16572.method_6079().method_7960();
        boolean bl5 = !class_16572.method_6047().method_7960();
        boolean bl6 = !blh_2.shal(class_17992) && !class_17993.method_7986() && !class_17994.method_7986() && !blh_2.dkd_2(class_17995);
        boolean bl7 = class_16572.method_7344().method_7586() == (Integer.reverse(-1366468254) ^ 0x469AB161);
        return bl && bl2 && bl3 && bl4 && bl5 && bl6 && bl7;
    }

    private boolean ghzt_3(class_1799 class_17992) {
        try {
            int n = 716156224;
            n = Integer.rotateLeft(n * -568972555, 5) ^ 0xE7F03DA4;
            int n2 = n ^ 0xBC2C52D7;
            if ((n2 ^ n) != -1137945897) {
                int cfr_ignored_0 = (0x9683FF97 ^ n) - -1407527956;
            }
            if ((0xEE & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            blh_2.dhf_4();
        }
        return class_17992.method_31574(class_1802.field_8370) || class_17992.method_31574(class_1802.field_8570) || class_17992.method_31574(class_1802.field_8577) || class_17992.method_31574(class_1802.field_8267) || class_17992.method_31574(class_1802.field_8660) || blh_2.khdhl(class_17992, class_1802.field_8396) || class_17992.method_31574(class_1802.field_8523) || class_17992.method_31574(class_1802.field_8743);
    }

    private void dath() {
        int n = 999986943;
        int n2 = (n = Integer.rotateLeft(n * -344029627, 16) ^ 0x8C2A790C) ^ 0xA9C24143;
        if ((n2 ^ n) != -1446887101) {
            int cfr_ignored_0 = (0x9258D7BC ^ n) + -294917675;
        }
        sygh.removeIf(blh_2::bnl);
        for (UUID uUID : hfb) {
            class_1657 class_16572 = blh_2.mc.field_1687.method_18470(uUID);
            if (class_16572 == null || sygh.contains(class_16572)) continue;
            sygh.add(class_16572);
        }
    }

    private void hzf(UUID uUID) {
        int n = 0;
        int n2 = 2082365180;
        n2 = Integer.rotateLeft(n2 * -1931911487, 10) ^ 0xF1526576;
        n2 = System.identityHashCode(this) ^ n2;
        UUID uUID2 = uUID;
        n2 = Integer.rotateRight((uUID2 != null ? System.identityHashCode(uUID2) : 0) ^ n2, 8);
        int n3 = n2 - 1633807050;
        block28: while (true) {
            switch (n2 - n3) {
                case 1633807050: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x76B2F524 ^ n2, 17) - 1678331543;
                    if (!yf.khdha_2()) {
                        int cfr_ignored_1 = (int)(0x801E3E4F38988D7L ^ (long)n2 ^ 0x3AB92BA0EA89BDD2L);
                        n3 = Integer.reverse(Integer.reverse(n2 - -1113769173));
                        continue block28;
                    }
                    int cfr_ignored_2 = (int)(0x8888C64FBDE20DB3L ^ (long)n2 ^ 0x71EFB777E040BCC0L);
                    n3 = n2 - 71762589;
                    continue block28;
                }
                case -1113769173: {
                    int cfr_ignored_3 = (Integer.rotateRight(0xAF98CD5B ^ n2, 8) + 1205763392) * -1348940453;
                    yf.athz_2();
                    throw null;
                }
                case 71762589: {
                    int cfr_ignored_4 = (Integer.rotateRight(0x5AC2FB72 ^ n2, 14) + 33165833) * 1522727795;
                    this.dqkh.remove(uUID);
                    hfb.remove(uUID);
                    sygh.removeIf(arg_0 -> blh_2.adkh_2(uUID, arg_0));
                    return;
                }
                case -301546701: {
                    int cfr_ignored_5 = (Integer.rotateRight(0x82203EBB ^ n2, 3) + -968542240) * -2111816005;
                    try {
                        n -= 3;
                        if ((0x99B5FCB878535F0DL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = n2 - 1633807050 ^ 0xA6344F3B ^ 0xA6344F3B;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = n2 - 1633807050 ^ 0x68C6CB33 ^ 0x68C6CB33;
                    }
                    continue block28;
                }
                case -619584832: {
                    int cfr_ignored_6 = Integer.rotateLeft(0xC2B94360 ^ n2, 11) + -1731409957;
                    try {
                        if ((0x3509807ABFBED2CDL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 - 1633807050));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = n2 - 1633807050;
                    }
                    n += 4;
                    continue block28;
                }
                case 759182586: {
                    int cfr_ignored_7 = (Integer.rotateRight(0x81236DB6 ^ n2, 3) - -1482168251) * -2128384585;
                    n3 = n2 - 18800756;
                    int cfr_ignored_8 = (Integer.rotateLeft(0xE8870CB9 ^ n2, 16) + 750266786) * -393802567;
                    int cfr_ignored_9 = (int)(0x2A35A28427D4EB4FL ^ (long)n2 ^ 0xB878831A2DB9F9BAL);
                    n3 = Integer.reverse(Integer.reverse(n2 - 1372291265));
                    int cfr_ignored_10 = Integer.rotateRight(0x94C00FAB ^ n2, 5) + 127894768;
                    n3 = Integer.reverse(Integer.reverse(n2 - 1633807050));
                    n -= 2;
                    continue block28;
                }
                case -515425267: {
                    int cfr_ignored_11 = Integer.rotateRight(0x1818A382 ^ n2, 6) + -279352327;
                    n3 = n2 - 1498923457;
                    int cfr_ignored_12 = (Integer.rotateRight(0xBDE2EC32 ^ n2, 10) + 47724873) * -1109201869;
                    n3 = n2 - 1633807050 ^ 0x3AC6D87C ^ 0x3AC6D87C;
                    n += 4;
                    continue block28;
                }
                case -839625797: {
                    int cfr_ignored_13 = Integer.rotateLeft(0x8A576C84 ^ n2, 4) - -990657737;
                    n3 = (int)((long)(n2 - -1857718009) ^ 0x2DCDECD0DB79DD3BL ^ 0x2DCDECD0DB79DD3BL);
                    int cfr_ignored_14 = Integer.rotateRight(0x4D58842B ^ n2, 12) + 1645584496;
                    try {
                        if ((0x4BB56064E805DE99L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = n2 - 1633807050;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)(n2 - 1633807050) ^ 0xC774BAF588CF8239L ^ 0xC774BAF588CF8239L);
                    }
                    n -= 4;
                    continue block28;
                }
                case 1310200293: {
                    int cfr_ignored_15 = Integer.rotateLeft(0xDAC749C4 ^ n2, 14) - -2105569801;
                    n3 = (int)((long)(n2 - -1698469133) ^ 0xECF1D51B806E40D4L ^ 0xECF1D51B806E40D4L);
                    int cfr_ignored_16 = Integer.rotateRight(0x5DBD2A4A ^ n2, 14) + 1581628977;
                    n3 = (int)((long)(n2 - 1633807050) ^ 0xE92198B20B7765ACL ^ 0xE92198B20B7765ACL);
                    n -= 5;
                    continue block28;
                }
                case 850293373: {
                    int cfr_ignored_17 = (Integer.rotateRight(0x6987F0FE ^ n2, 16) - -875311619) * 1770516735;
                    n3 = (int)((long)(n2 - -1044809571) ^ 0x9619DDABFF6BF3FAL ^ 0x9619DDABFF6BF3FAL);
                    int cfr_ignored_18 = Integer.rotateRight(0x29AE283 ^ n2, 3) + 1428098328;
                    n3 = (int)((long)(n2 - 1633807050) ^ 0xC34211C36CA106CDL ^ 0xC34211C36CA106CDL);
                    int cfr_ignored_19 = Integer.rotateLeft(0x9E9C0124 ^ n2, 6) - 960610967;
                    n -= 2;
                    continue block28;
                }
                case 84288050: {
                    int cfr_ignored_20 = (Integer.rotateRight(0x2B2FBD17 ^ n2, 8) - 1059423492) * 724548887;
                    n3 = Integer.reverse(Integer.reverse(n2 - -884199504));
                    int cfr_ignored_21 = Integer.rotateRight(0xF174986 ^ n2, 4) - -667974027;
                    try {
                        n += 5;
                        if ((0x662C579FA85CFCDL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = n2 - 1633807050 + 201398643 - 201398643;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 - 1633807050 ^ 0x1DCE09A3 ^ 0x1DCE09A3;
                    }
                    ++n;
                    continue block28;
                }
                case -1409765592: {
                    int cfr_ignored_22 = (Integer.rotateRight(0x2E806E16 ^ n2, 8) - -1511328795) * 780168727;
                    int cfr_ignored_23 = (int)(0x2E157C1121FAA2F2L ^ (long)n2 ^ 0x5528F46BEC3F1FBL);
                    n3 = n2 - 1633807050 + 740896307 - 740896307;
                    n -= 2;
                    continue block28;
                }
                case 780664841: {
                    int cfr_ignored_24 = (Integer.rotateRight(0x5997585F ^ n2, 14) - -575581508) * 1503090783;
                    try {
                        n -= 4;
                        if ((0xB2C24197ED0AAD9L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (int)((long)(n2 - 1633807050) ^ 0x343C43CB06A3BE7BL ^ 0x343C43CB06A3BE7BL);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 - 1633807050 ^ 0x23FAE1DA ^ 0x23FAE1DA;
                    }
                    n -= 5;
                    continue block28;
                }
                case -527995354: {
                    int cfr_ignored_25 = (Integer.rotateRight(0x1DFE043A ^ n2, 6) + -1507843519) * 503186491;
                    try {
                        if ((0xE461DB7C0FD768C1L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = n2 - 1633807050 + -1535288088 - -1535288088;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - 1633807050));
                    }
                    n -= 4;
                    continue block28;
                }
            }
            int cfr_ignored_26 = (Integer.rotateRight(0x24ADF17F ^ n2, 7) - 1970134428) * 615379327;
            n3 = Integer.reverse(Integer.reverse(n2 - 1633807050));
        }
    }

    public static boolean khnq(class_1309 class_13092) {
        class_1657 class_16572;
        try {
            int n = -726797986;
            n = Integer.rotateLeft(n * -40698833, 7) ^ 0xE7A56FF5;
            class_1309 class_13093 = class_13092;
            n = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 9);
            int n2 = n ^ 0x32B83910;
            if ((n2 ^ n) != 850934032) {
                int cfr_ignored_0 = (0xE615C84E ^ n) + 1676748946;
            }
            if ((0x22B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return class_13092 instanceof class_1657 && blh_2.dhwj(class_16572 = (class_1657)class_13092);
    }

    public static boolean dhwj(class_1657 class_16572) {
        int n = 565972218;
        n = Integer.rotateLeft(n * -1961858609, 13) ^ 0x107A5780;
        class_1657 class_16573 = class_16572;
        n = Integer.rotateLeft((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 18);
        int n2 = n ^ 0x467316C0;
        if ((n2 ^ n) != 1181947584) {
            int cfr_ignored_0 = (0x67CF1A3A ^ n) - 1577278462;
        }
        return class_16572 != null && hfb.contains(class_16572.method_5667());
    }

    public static boolean dshf_2(int n) {
        class_1657 class_16572;
        int n2 = 206129217;
        n2 = Integer.rotateLeft(n2 * -1062528431, 26) ^ 0xD508BEF9;
        int n3 = (n2 = n ^ n2) ^ 0x8F980028;
        if ((n3 ^ n2) != -1885863896) {
            int cfr_ignored_0 = (0x83D14869 ^ n2) - -382464881;
        }
        if (!yf.khdha_2()) {
            blh_2.jkht_2();
            throw null;
        }
        if (blh_2.djm().field_1687 == null) {
            return false;
        }
        class_1297 class_12972 = class_310.method_1551().field_1687.method_8469(n);
        return class_12972 instanceof class_1657 && blh_2.dft_2(class_16572 = (class_1657)class_12972);
    }

    public static boolean ghta_2(UUID uUID) {
        block0: {
            int n = -643478313;
            n = Integer.rotateLeft(n * 782529995, 18) ^ 0xBA0FFF85;
            UUID uUID2 = uUID;
            n = Integer.rotateRight((uUID2 != null ? System.identityHashCode(uUID2) : 0) ^ n, 15);
            int n2 = n ^ 0x8E1E13A6;
            if ((n2 ^ n) == -1910631514) break block0;
            int cfr_ignored_0 = (0x57BB5F71 ^ n) - -1713643034;
        }
        return hfb.contains(uUID);
    }

    public static boolean khfd(class_1297 class_12972) {
        class_1657 class_16572;
        int n = 378819950;
        n = Integer.rotateLeft(n * 1035144343, 18) ^ 0x52FC3D40;
        class_1297 class_12973 = class_12972;
        n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
        int n2 = n ^ 0x56C94418;
        if ((n2 ^ n) != 1456030744) {
            int cfr_ignored_0 = (0x405D1176 ^ n) - -25104184;
        }
        if (blh_2.tqw_2()) {
            throw null;
        }
        return class_12972 instanceof class_1657 && blh_2.hmd(class_16572 = (class_1657)class_12972);
    }

    public void raq() {
        int n = hs_2.khdk_2(1060129210);
        int n2 = n ^ 0x5260B036;
        if ((n2 ^ n) != 1382068278) {
            int cfr_ignored_0 = Integer.rotateLeft(0x6D50F98C ^ n, 16) - 1093392175;
        }
        this.dqkh.clear();
        hfb.clear();
        sygh.clear();
    }

    @Override
    public void nc() {
        int n = hs_2.khdk_2(1018264679);
        int n2 = n ^ 0xBE16C70A;
        if ((n2 ^ n) != -1105803510) {
            int cfr_ignored_0 = Integer.rotateLeft(0x82A7BB6D ^ n, 3) - -693284498;
            int cfr_ignored_1 = (int)(0x4015155027D4EB4FL ^ (long)n ^ 0xD7D0831A2DB92DFBL);
        }
        this.raq();
    }

    private static boolean adkh_2(UUID uUID, class_1657 class_16572) {
        block0: {
            int n = hs_2.khdk_2(1103762888);
            UUID uUID2 = uUID;
            n = Integer.rotateRight((uUID2 != null ? System.identityHashCode(uUID2) : 0) ^ n, 3);
            int n2 = n ^ 0x96FFCC76;
            if ((n2 ^ n) == -1761620874) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xD735D9BE ^ n, 13) - 333643069) * -684336705;
        }
        return class_16572.method_5667().equals(uUID);
    }

    private static boolean bnl(class_1657 class_16572) {
        int n = hs_2.khdk_2(1276127460);
        class_1657 class_16573 = class_16572;
        n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
        int n2 = n ^ 0x1D76E5BF;
        if ((n2 ^ n) != 494331327) {
            int cfr_ignored_0 = (Integer.rotateRight(0x5166CD5B ^ n, 13) + -539984576) * 1365691739;
        }
        return blh_2.mc.field_1687.method_18470(class_16572.method_5667()) == null || !hfb.contains(class_16572.method_5667());
    }

    private static boolean lk(Set set, UUID uUID) {
        int n = 286447379;
        int n2 = (n = Integer.rotateLeft(n * 576557293, 25) ^ 0xCE27212) ^ 0xAA9F586B;
        if ((n2 ^ n) != -1432397717) {
            int cfr_ignored_0 = (0xBB8D8F78 ^ n) - 296829059;
        }
        return !set.contains(uUID);
    }

    private static boolean srt_3(Set set, UUID uUID) {
        try {
            int n = 1798612232;
            n = Integer.rotateLeft(n * 1951808901, 16) ^ 0x741F8F32;
            Set set2 = set;
            n = Integer.rotateRight((set2 != null ? System.identityHashCode(set2) : 0) ^ n, 9);
            UUID uUID2 = uUID;
            n = (uUID2 != null ? System.identityHashCode(uUID2) : 0) ^ n;
            int n2 = n ^ 0x50B23B5E;
            if ((n2 ^ n) != 1353857886) {
                int cfr_ignored_0 = (0x3B869E56 ^ n) + -2075932707;
            }
            if ((0x146 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !set.contains(uUID);
    }

    /*
     * Unable to fully structure code
     */
    private void shnq(btt var1_1) {
        var4_2 = 0;
        var2_3 = 1167393565;
        var2_3 = Integer.rotateLeft(var2_3 * 1997872523, 14) ^ -1741831239;
        var2_3 = System.identityHashCode(this) ^ var2_3;
        var3_4 = (var2_3 ^ -825993769) + 407664887 - 407664887;
        while (true) {
            block43: {
                block46: {
                    block45: {
                        block44: {
                            block41: {
                                block38: {
                                    block39: {
                                        block36: {
                                            block42: {
                                                block37: {
                                                    block35: {
                                                        block47: {
                                                            block40: {
                                                                var4_2 = var3_4 ^ var2_3;
                                                                switch (var4_2 & 7) {
                                                                    case 2: {
                                                                        if (var4_2 == -1261588398) break block35;
                                                                        if (var4_2 == -42103998) break block36;
                                                                        (Integer.rotateLeft(-61958343 ^ var2_3, 18) + -1847464158) * -61958343;
                                                                        (int)(4538565214493535055L ^ (long)var2_3 ^ -8108586980621037527L);
                                                                        if (var4_2 != 359411194) {
                                                                            ** break;
                                                                        }
                                                                        break block37;
                                                                    }
                                                                    case 6: {
                                                                        if (var4_2 == 1571242318) break block38;
                                                                        if (var4_2 != 613839838) {
                                                                            Integer.rotateRight(-2107141053 ^ var2_3, 3) + -823618728;
                                                                            ** break;
                                                                        }
                                                                        break block39;
                                                                    }
                                                                    case 7: {
                                                                        if (var4_2 == -825993769) break block40;
                                                                        if (var4_2 == 744934863) break block41;
                                                                        Integer.rotateRight(-1761399218 ^ var2_3, 5) - 1304443565;
                                                                        if (var4_2 != 1111982175) {
                                                                            ** break;
                                                                        }
                                                                        break block42;
                                                                    }
                                                                    case 3: {
                                                                        if (var4_2 == 1201901699) break block43;
                                                                        if (var4_2 != 450847075) {
                                                                            (Integer.rotateRight(-631040746 ^ var2_3, 14) - 1985817829) * -631040745;
                                                                            ** break;
                                                                        }
                                                                        break block44;
                                                                    }
                                                                    case 0: {
                                                                        if (var4_2 == 2100359592) break;
                                                                        if (var4_2 != 545933392) {
                                                                            ** break;
                                                                        }
                                                                        break block45;
                                                                    }
                                                                    case 4: {
                                                                        if (var4_2 == 517161116) break block46;
                                                                        if (var4_2 != 1279813892) {
                                                                            ** break;
                                                                        }
                                                                        break block47;
                                                                    }
                                                                }
                                                                (Integer.rotateLeft(508784725 ^ var2_3, 6) - -1334298234) * 508784725;
                                                                (int)(-2530496976679277745L ^ (long)var2_3 ^ 4728923757198447634L);
                                                                this.rkhn();
                                                                this.dath();
                                                                return;
                                                            }
                                                            (Integer.rotateRight(-934708393 ^ var2_3, 12) - 1162055364) * -934708393;
                                                            if (blh_2.mc.field_1724 != null) {
                                                                try {
                                                                    var3_4 = var2_3 ^ -1261588398;
                                                                }
                                                                catch (UnsupportedOperationException v0) {
                                                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ -1261588398));
                                                                }
                                                                var4_2 -= 3;
                                                                continue;
                                                            }
                                                            try {
                                                                var4_2 -= 4;
                                                                if ((-4515814305038839779L ^ (long)var2_3 | 1L) == 0L) {
                                                                    throw new NoSuchElementException();
                                                                }
                                                                var3_4 = var2_3 ^ 1279813892;
                                                            }
                                                            catch (NoSuchElementException v1) {
                                                                var3_4 = (int)((long)(var2_3 ^ 1279813892) ^ -7963895574696645918L ^ -7963895574696645918L);
                                                            }
                                                            var4_2 += 4;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(232710139 ^ var2_3, 4) + -1302675808) * 232710139;
                                                        this.raq();
                                                        return;
                                                    }
                                                    Integer.rotateLeft(340940552 ^ var2_3, 5) + 2052466995;
                                                    if (blh_2.mc.field_1687 == null) {
                                                        var3_4 = (var2_3 ^ -440834191) + -1892167662 - -1892167662;
                                                        Integer.rotateLeft(705265316 ^ var2_3, 8) - 461632791;
                                                        var3_4 = Integer.reverse(Integer.reverse(var2_3 ^ 1279813892));
                                                        continue;
                                                    }
                                                    (int)(5207740349457068624L ^ (long)var2_3 ^ -4182758813846782630L);
                                                    var3_4 = var2_3 ^ 1292428868 ^ -1121579439 ^ -1121579439;
                                                    (int)(-7164278468928508043L ^ (long)var2_3 ^ 4616554248527451383L);
                                                    var3_4 = (int)((long)(var2_3 ^ 2100359592) ^ 4632254776570798767L ^ 4632254776570798767L);
                                                    continue;
                                                }
                                                Integer.rotateLeft(2043926532 ^ var2_3, 18) - -989542473;
                                                try {
                                                    if ((-7575501372654946911L ^ (long)var2_3 | 1L) == 0L) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    var3_4 = var2_3 ^ -825993769 ^ 1934391100 ^ 1934391100;
                                                }
                                                catch (NoSuchElementException v2) {
                                                    var3_4 = var2_3 ^ -825993769 ^ -1986390758 ^ -1986390758;
                                                }
                                                var4_2 += 5;
                                                continue;
                                            }
                                            (Integer.rotateLeft(1932454461 ^ var2_3, 17) - -150209378) * 1932454461;
                                            (int)(-5648565065170490545L ^ (long)var2_3 ^ 8462407848288636649L);
                                            try {
                                                var4_2 += 4;
                                                if ((2379262175144107675L ^ (long)var2_3 | 1L) == 0L) {
                                                    throw new UnsupportedOperationException();
                                                }
                                                var3_4 = (var2_3 ^ -825993769) + 312962590 - 312962590;
                                            }
                                            catch (UnsupportedOperationException v3) {
                                                var3_4 = (int)((long)(var2_3 ^ -825993769) ^ -37736969908872497L ^ -37736969908872497L);
                                            }
                                            continue;
                                        }
                                        (Integer.rotateRight(-1776541289 ^ var2_3, 5) - 835039364) * -1776541289;
                                        var3_4 = var2_3 ^ 1513684385;
                                        (Integer.rotateRight(-769479438 ^ var2_3, 13) + 1989185673) * -769479437;
                                        try {
                                            var3_4 = (var2_3 ^ -825993769) + 2109350344 - 2109350344;
                                        }
                                        catch (ArithmeticException v4) {
                                            var3_4 = (var2_3 ^ -825993769) + 1697361361 - 1697361361;
                                        }
                                        var4_2 -= 5;
                                        continue;
                                    }
                                    (Integer.rotateRight(-145205162 ^ var2_3, 17) - -133148251) * -145205161;
                                    (int)(9015743355017854749L ^ (long)var2_3 ^ 5246824858827708397L);
                                    var3_4 = (int)((long)(var2_3 ^ -825993769) ^ -6731801800597195203L ^ -6731801800597195203L);
                                    var4_2 -= 4;
                                    continue;
                                }
                                (Integer.rotateRight(2005540351 ^ var2_3, 17) - 2115453212) * 2005540351;
                                (int)(-829237694556996737L ^ (long)var2_3 ^ 1448865582124909866L);
                                var3_4 = (var2_3 ^ -825993769) + -1094739803 - -1094739803;
                                var4_2 -= 5;
                                continue;
                            }
                            (Integer.rotateRight(1662153846 ^ var2_3, 15) - 60406149) * 1662153847;
                            (int)(3860668346911969726L ^ (long)var2_3 ^ 5737733411634398966L);
                            var3_4 = (var2_3 ^ -825993769) + -788161023 - -788161023;
                            var4_2 -= 2;
                            continue;
                        }
                        Integer.rotateRight(-582396441 ^ var2_3, 14) - -801176012;
                        var3_4 = (var2_3 ^ -825993769) + 2109428145 - 2109428145;
                        var4_2 -= 2;
                        continue;
                    }
                    (Integer.rotateRight(-405093665 ^ var2_3, 15) - 400242748) * -405093665;
                    var3_4 = (var2_3 ^ 1730793076) + -1068132479 - -1068132479;
                    Integer.rotateRight(-568599194 ^ var2_3, 14) - -373461355;
                    try {
                        if ((-7786040401891746085L ^ (long)var2_3 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var3_4 = var2_3 ^ -825993769 ^ -1109660419 ^ -1109660419;
                    }
                    catch (UnsupportedOperationException v5) {
                        var3_4 = (var2_3 ^ -825993769) + -1875844005 - -1875844005;
                    }
                    var4_2 -= 4;
                    continue;
                }
                Integer.rotateRight(1603911331 ^ var2_3, 14) + -1745111816;
                try {
                    var4_2 += 4;
                    var3_4 = (int)((long)(var2_3 ^ -825993769) ^ 4408694920201043963L ^ 4408694920201043963L);
                }
                catch (UnsupportedOperationException v6) {
                    var3_4 = var2_3 ^ -825993769;
                }
                var4_2 -= 2;
                continue;
            }
            (Integer.rotateRight(0xB2CCBB2 ^ var2_3, 4) + 1590315465) * 187485107;
            var3_4 = var2_3 ^ 2133990778 ^ -1335003294 ^ -1335003294;
            Integer.rotateLeft(2011783009 ^ var2_3, 17) + -1985991686;
            (int)(-5378439951856374961L ^ (long)var2_3 ^ 2290224558977369958L);
            var3_4 = var2_3 ^ -940007794 ^ 74833422 ^ 74833422;
            Integer.rotateRight(-1078677458 ^ var2_3, 10) - 993981645;
            var3_4 = (int)((long)(var2_3 ^ -825993769) ^ 4821956554052584498L ^ 4821956554052584498L);
            var4_2 -= 3;
            continue;
lbl209:
            // 7 sources

            (Integer.rotateRight(1872984786 ^ var2_3, 16) + -1993769303) * 1872984787;
            var3_4 = (int)((long)(var2_3 ^ -825993769) ^ -2288534043580934663L ^ -2288534043580934663L);
        }
    }

    private void dyn_2(bksh bksh2) {
        int n = -1206318057;
        n = Integer.rotateLeft(n * 2061469745, 3) ^ 0x74A32AFC;
        bksh bksh3 = bksh2;
        n = Integer.rotateLeft((bksh3 != null ? System.identityHashCode(bksh3) : 0) ^ n, 27);
        int n2 = n ^ 0xD4F9237A;
        if ((n2 ^ n) != -721869958) {
            int cfr_ignored_0 = (0x6CE02F6D ^ n) + 994332280;
        }
        if (yf.dnkh()) {
            throw null;
        }
        class_2596 class_25962 = bksh2.asw();
        if (class_25962 instanceof class_7828) {
            class_7828 class_78282 = (class_7828)class_25962;
            class_78282.comp_1105().forEach(this::hzf);
        }
    }

    private static String azz_2(String string, int n, int n2, int n3) {
        int n4 = 1302035465;
        n4 = Integer.rotateLeft(n4 * 1359429633, 23) ^ 0x8732913A;
        int n5 = (n4 = Integer.rotateRight(n ^ n4, 4)) ^ 0x7FFBF733;
        if ((n5 ^ n4) != 2147219251) {
            int cfr_ignored_0 = (0x32608B3A ^ n4) - -1930914299;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xE9B4BC90) + i ^ raz_3, 8) ^ n2 + jad));
        }
        return new String(cArray);
    }

    private static UUID dhs_2(class_1657 class_16572) {
        block0: {
            int n = 984686399;
            n = Integer.rotateLeft(n * 901243781, 24) ^ 0x5A7DC3A;
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0x182530FF;
            if ((n2 ^ n) == 405090559) break block0;
            int cfr_ignored_0 = (0x22942FC0 ^ n) + -1627764761;
        }
        return class_16572.method_5667();
    }

    private static boolean thghn(blh_2 blh2_2, class_1657 class_16572) {
        block0: {
            int n = hs_2.khdk_2(133251999);
            blh_2 blh3 = blh2_2;
            n = Integer.rotateRight((blh3 != null ? System.identityHashCode(blh3) : 0) ^ n, 17);
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0xBAF7EC49;
            if ((n2 ^ n) == -1158157239) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xBD06AFD6 ^ n, 10) - -399709659) * -1123635241;
        }
        return blh2_2.khwdh(class_16572);
    }

    private static boolean hqkh(class_1657 class_16572) {
        block0: {
            int n = 1610918822;
            n = Integer.rotateLeft(n * -988795497, 26) ^ 0xBE602F84;
            class_1657 class_16573 = class_16572;
            n = Integer.rotateLeft((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 28);
            int n2 = n ^ 0x6DCD2066;
            if ((n2 ^ n) == 1842159718) break block0;
            int cfr_ignored_0 = (0xDC98BC0 ^ n) + -1409010501;
        }
        return class_16572.method_5805();
    }

    private static boolean sft_4(String string, String string2) {
        block0: {
            int n = -1184561648;
            n = Integer.rotateLeft(n * 1610563017, 27) ^ 0x388D3F6F;
            String string3 = string2;
            n = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 20);
            int n2 = n ^ 0x17D23C24;
            if ((n2 ^ n) == 399653924) break block0;
            int cfr_ignored_0 = (0xAEB73A34 ^ n) - 989155280;
        }
        return string.startsWith(string2);
    }

    private static kh_3 ddhw_2(Moondlc moondlc) {
        block0: {
            int n = 1461346536;
            int n2 = (n = Integer.rotateLeft(n * 1783667859, 15) ^ 0xAA4CAAEE) ^ 0xE385B68D;
            if ((n2 ^ n) == -477776243) break block0;
            int cfr_ignored_0 = (0xB49FD665 ^ n) - 1471781447;
        }
        return moondlc.getFriendManager();
    }

    private static boolean sdb_3(kh_3 kh2, String string) {
        block0: {
            int n = -1952825869;
            n = Integer.rotateLeft(n * -232952619, 19) ^ 0x48CE1B72;
            kh_3 kh3 = kh2;
            n = (kh3 != null ? System.identityHashCode(kh3) : 0) ^ n;
            int n2 = n ^ 0xFFDBAC48;
            if ((n2 ^ n) == -2380728) break block0;
            int cfr_ignored_0 = (0x744191BB ^ n) + -638465119;
        }
        return kh2.adhj(string);
    }

    private static boolean shnth(badh_2 badh2) {
        block0: {
            int n = 283264248;
            int n2 = (n = Integer.rotateLeft(n * -1948065561, 23) ^ 0xA520FC4A) ^ 0xF1495F52;
            if ((n2 ^ n) == -246849710) break block0;
            int cfr_ignored_0 = (0xE1AB1BAA ^ n) + 474387967;
        }
        return badh2.shzl();
    }

    private static class_1799 ghzr_2(class_1661 class_16612, int n) {
        block0: {
            int n2 = -889178830;
            n2 = Integer.rotateLeft(n2 * -1979832599, 25) ^ 0xF4DB3895;
            class_1661 class_16613 = class_16612;
            n2 = Integer.rotateRight((class_16613 != null ? System.identityHashCode(class_16613) : 0) ^ n2, 23);
            int n3 = n2 ^ 0x5320222E;
            if ((n3 ^ n2) == 1394614830) break block0;
            int cfr_ignored_0 = (0x9820171C ^ n2) + 8400629;
        }
        return class_16612.method_7372(n);
    }

    private static class_1799 thdh_4(class_1661 class_16612, int n) {
        block0: {
            int n2 = 690112493;
            n2 = Integer.rotateLeft(n2 * 1611596855, 28) ^ 0x1BA07B03;
            class_1661 class_16613 = class_16612;
            n2 = Integer.rotateRight((class_16613 != null ? System.identityHashCode(class_16613) : 0) ^ n2, 28);
            int n3 = (n2 = n ^ n2) ^ 0x4E78F31F;
            if ((n3 ^ n2) == 1316549407) break block0;
            int cfr_ignored_0 = (0x675AB4F2 ^ n2) + -1498250083;
        }
        return class_16612.method_7372(n);
    }

    private static class_1661 thkkh(class_1657 class_16572) {
        block0: {
            int n = -2036894063;
            n = Integer.rotateLeft(n * -511341657, 9) ^ 0xA4A2985D;
            class_1657 class_16573 = class_16572;
            n = Integer.rotateLeft((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 28);
            int n2 = n ^ 0x3E5EBBF0;
            if ((n2 ^ n) == 1046395888) break block0;
            int cfr_ignored_0 = (0xB8C9CD61 ^ n) + 1339872770;
        }
        return class_16572.method_31548();
    }

    private static class_1799 jgha_2(class_1661 class_16612, int n) {
        block0: {
            int n2 = 884807595;
            int n3 = (n2 = Integer.rotateLeft(n2 * 117615389, 20) ^ 0x2B1D769F) ^ 0x3EFC2B9B;
            if ((n3 ^ n2) == 1056713627) break block0;
            int cfr_ignored_0 = (0xA413C30 ^ n2) - 1888796687;
        }
        return class_16612.method_7372(n);
    }

    private static boolean sas_2(class_1799 class_17992) {
        block0: {
            int n = hs_2.khdk_2(1133853150);
            class_1799 class_17993 = class_17992;
            n = Integer.rotateRight((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 7);
            int n2 = n ^ 0x2CE5735B;
            if ((n2 ^ n) == 753234779) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x6F704A85 ^ n, 16) - -2097765034;
            int cfr_ignored_1 = (int)(0xADC2E4B827D4EB4FL ^ (long)n ^ 0x3400831A2DB8F654L);
        }
        return class_17992.method_7960();
    }

    private static boolean sln_2(class_1799 class_17992) {
        block0: {
            int n = hs_2.khdk_2(-851596366);
            int n2 = n ^ 0x1646E9BC;
            if ((n2 ^ n) == 373746108) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xDB7B420E ^ n, 14) - -1739940115;
        }
        return class_17992.method_7923();
    }

    private static boolean ghkhm(class_1799 class_17992) {
        block0: {
            int n = hs_2.khdk_2(1395296942);
            class_1799 class_17993 = class_17992;
            n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
            int n2 = n ^ 0xA67C2867;
            if ((n2 ^ n) == -1501812633) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xF556A2C9 ^ n, 17) + -1176808046;
            int cfr_ignored_1 = (int)(0x37E40CF427D4EB4FL ^ (long)n ^ 0xE498831A2DB9C219L);
        }
        return class_17992.method_7923();
    }

    private static boolean sthw(blh_2 blh2_2, class_1799 class_17992) {
        block0: {
            int n = hs_2.khdk_2(-961880106);
            blh_2 blh3 = blh2_2;
            n = (blh3 != null ? System.identityHashCode(blh3) : 0) ^ n;
            class_1799 class_17993 = class_17992;
            n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
            int n2 = n ^ 0x71410D6B;
            if ((n2 ^ n) == 1900088683) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xB7EBD2BD ^ n, 9) - 1240212510) * -1209281859;
            int cfr_ignored_1 = (int)(0x75597C8027D4EB4FL ^ (long)n ^ 0x470831A2DB94763L);
        }
        return blh2_2.ghzt_3(class_17992);
    }

    private static boolean shal(class_1799 class_17992) {
        block0: {
            int n = -1337366980;
            n = Integer.rotateLeft(n * 747206259, 15) ^ 0x468347A6;
            class_1799 class_17993 = class_17992;
            n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
            int n2 = n ^ 0xC96FF205;
            if ((n2 ^ n) == -915410427) break block0;
            int cfr_ignored_0 = (0x79269439 ^ n) - -2115684371;
        }
        return class_17992.method_7986();
    }

    private static boolean dkd_2(class_1799 class_17992) {
        block0: {
            int n = -1957370878;
            n = Integer.rotateLeft(n * 315379499, 10) ^ 0x7CF2ABAE;
            class_1799 class_17993 = class_17992;
            n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
            int n2 = n ^ 0x8FAFF4EA;
            if ((n2 ^ n) == -1884293910) break block0;
            int cfr_ignored_0 = (0x4FB10E8 ^ n) + 646033931;
        }
        return class_17992.method_7986();
    }

    private static void dhf_4() {
        int n = 319079526;
        int n2 = (n = Integer.rotateLeft(n * 1413010537, 17) ^ 0xE0996336) ^ 0xF27D3F59;
        if ((n2 ^ n) != -226672807) {
            int cfr_ignored_0 = (0xE179FB3F ^ n) - 592932203;
        }
        yf.athz_2();
    }

    private static boolean khdhl(class_1799 class_17992, class_1792 class_17922) {
        block0: {
            int n = -1311893758;
            int n2 = (n = Integer.rotateLeft(n * 5800679, 17) ^ 0xA005716A) ^ 0x536F01B7;
            if ((n2 ^ n) == 1399783863) break block0;
            int cfr_ignored_0 = (0xE2A116B5 ^ n) - 927119875;
        }
        return class_17992.method_31574(class_17922);
    }

    private static void jkht_2() {
        int n = 592296248;
        int n2 = (n = Integer.rotateLeft(n * 242001479, 19) ^ 0x21D91EF7) ^ 0x5D11E722;
        if ((n2 ^ n) != 1561454370) {
            int cfr_ignored_0 = (0x7E5C5E1A ^ n) + -1772482894;
        }
        yf.athz_2();
    }

    private static class_310 djm() {
        block0: {
            int n = -922953088;
            int n2 = (n = Integer.rotateLeft(n * -688138707, 21) ^ 0x482FCBA0) ^ 0x58859D88;
            if ((n2 ^ n) == 1485151624) break block0;
            int cfr_ignored_0 = (0x90794708 ^ n) + -1682655502;
        }
        return class_310.method_1551();
    }

    private static boolean dft_2(class_1657 class_16572) {
        block0: {
            int n = -2085169560;
            n = Integer.rotateLeft(n * 1033317723, 26) ^ 0xB3DCD3F4;
            class_1657 class_16573 = class_16572;
            n = Integer.rotateRight((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 15);
            int n2 = n ^ 0x3F708B53;
            if ((n2 ^ n) == 1064340307) break block0;
            int cfr_ignored_0 = (0xBCC65D3B ^ n) - -754632871;
        }
        return blh_2.dhwj(class_16572);
    }

    private static boolean tqw_2() {
        block0: {
            int n = 1699691502;
            int n2 = (n = Integer.rotateLeft(n * -1107186065, 10) ^ 0xA38F23FE) ^ 0x52C84A42;
            if ((n2 ^ n) == 1388857922) break block0;
            int cfr_ignored_0 = (0x378771AC ^ n) + 642148120;
        }
        return yf.dnkh();
    }

    private static boolean hmd(class_1657 class_16572) {
        block0: {
            int n = 1032581473;
            int n2 = (n = Integer.rotateLeft(n * 975394817, 16) ^ 0x81482BFC) ^ 0x90C2E2F2;
            if ((n2 ^ n) == -1866276110) break block0;
            int cfr_ignored_0 = (0xAD491393 ^ n) - -19422249;
        }
        return blh_2.dhwj(class_16572);
    }

    private static String[] zsr_4(String string) {
        int n = hs_2.khdk_2(-655077577);
        int n2 = n ^ 0xD71046BC;
        if ((n2 ^ n) != -686799172) {
            int cfr_ignored_0 = Integer.rotateRight(0xFE4098B ^ n, 4) + -252000496;
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite bbl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 3340281;
            n3 = Integer.rotateLeft(n3 * -1001930779, 3) ^ 0x1F4F6FB7;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 14);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 4);
            int n4 = n3 ^ 0xBB4929F9;
            if ((n4 ^ n3) != -1152833031) {
                int cfr_ignored_0 = (0xBB7BDE00 ^ n3) + -102536302;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ bz ^ string.hashCode() ^ n2 + bya + i * -2132968615) + bz) ^ bya));
            }
            String[] stringArray = blh_2.zsr_4(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType3) : lookup.findVirtual(clazz, stringArray[0], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] xrh65r3opz7(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite txej2y3ej1ubi(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ yck722zv9 ^ string.hashCode() ^ n2 + isgqjr0ea ^ i * -1087165071 ^ yck722zv9, 5) ^ isgqjr0ea));
            }
            String[] stringArray = blh_2.xrh65r3opz7(new String(cArray));
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

