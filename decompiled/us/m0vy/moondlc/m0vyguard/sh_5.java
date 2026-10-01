/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.yggdrasil.ProfileResult
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.ProfileResult;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import us.m0vy.moondlc.m0vyguard.btw;
import us.m0vy.moondlc.m0vyguard.bths_2;
import us.m0vy.moondlc.m0vyguard.bthn;
import us.m0vy.moondlc.m0vyguard.bdht_2;
import us.m0vy.moondlc.m0vyguard.bsj;
import us.m0vy.moondlc.m0vyguard.bzh_4;
import us.m0vy.moondlc.m0vyguard.rz_2;
import us.m0vy.moondlc.m0vyguard.sd_2;
import us.m0vy.moondlc.m0vyguard.sh_4;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.mixin.accessors.PlayerListEntryAccessor;

public class sh_5 {
    public static Supplier skhw_2;
    public static boolean tad_4;
    private static final int hn_2 = -2065077904;
    private static final int khsn = -1638331420;
    private static final int rlf = 1881215597;
    private static final int khdw = 361532292;
    private static final int esxpuwqb134 = -2084279879;
    private static final int smv7hu21eh6 = -2066167999;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int y3e0186rqc;

    public bthn hds_4() {
        block0: {
            int n = sd_2.djq_2(2034130886);
            int n2 = n ^ 0xB681047F;
            if ((n2 ^ n) == -1233058689) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xCFBF5BB9 ^ n, 12) + 747223714) * -809542727;
            int cfr_ignored_1 = (int)(0xD0DF58427D4EB4FL ^ (long)n ^ 0x1678831A2DB9B7CAL);
        }
        return sh_5.zht_2(sh_5.dwk_2(bdht_2.jngh("skin", sh_5::zys_3), "action", sh_5::dkl_2), "name", sh_5::slh).jmz(this::tdh_3).szy_2();
    }

    private void tdh_3(bths_2 bths2) {
        int n = -382497885;
        n = Integer.rotateLeft(n * 838560041, 11) ^ 0x5B79391D;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 21);
        bths_2 bths3 = bths2;
        n = Integer.rotateRight((bths3 != null ? System.identityHashCode(bths3) : 0) ^ n, 4);
        int n2 = n ^ 0xD27F83CC;
        if ((n2 ^ n) != -763395124) {
            int cfr_ignored_0 = (0x3B4C086F ^ n) + -332950825;
        }
        if (!yf.khdha_2()) {
            sh_5.shaa_2();
        }
        String string = (String)bths2.arguments().get(0);
        String string2 = (String)sh_5.bhs_4(bths2).get(1);
        if ("off".equalsIgnoreCase(string)) {
            if (!tad_4) {
                bzh_4.ttht_3(sh_5.ham_2("Skin alr".concat("eady reset!")));
            } else {
                skhw_2 = null;
                tad_4 = false;
                sh_5.khkz().rww(null);
                sh_5.sakh(class_2561.method_30163((String)"Skin successf".concat("ully reset!")));
            }
        } else if ("set".equalsIgnoreCase(string)) {
            if (string2 == null || string2.trim().isEmpty()) {
                bzh_4.dhght_2(sh_5.rsdh_2("Please specify a skin name!"));
                return;
            }
            try {
                skhw_2 = sh_5.hhdh_2(string2);
                tad_4 = true;
                sh_5.szl_3(btw.jbh_2(), string2);
                bzh_4.ttht_3(class_2561.method_30163((String)("Skin set: " + string2)));
            }
            catch (Exception exception) {
                bzh_4.dhght_2(class_2561.method_30163((String)sh_5.zst_3("뚖᣽돛Ԙ밾흕ྫྷꛆ퇻࣎ꌹ\uda30畁궾쒞翴障셥砂", sh_5.asd_2(-2005952095) ^ 0xE01E13D4, Integer.rotateLeft(0xF3C5A588 ^ 0x14C18026, 10), Integer.rotateLeft(0x82891BA1 ^ 0x5A5E0B91, 27))));
            }
        }
    }

    public static Supplier zks_3(String string) {
        class_310 class_3102;
        ProfileResult profileResult;
        GameProfile gameProfile;
        try {
            int n = 796804622;
            n = Integer.rotateLeft(n * 963339545, 3) ^ 0x4C53614A;
            int n2 = n ^ 0x3D02BF85;
            if ((n2 ^ n) != 1023590277) {
                int cfr_ignored_0 = (0x127CF98B ^ n) + 372701820;
            }
            if ((0x23F & 0) != 0) {
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
        UUID uUID = new rz_2().uuidByName(string);
        if (uUID == null) {
            uUID = sh_5.jan_2(string);
        }
        GameProfile gameProfile2 = gameProfile = (profileResult = (class_3102 = class_310.method_1551()).method_1495().fetchProfile(uUID, false)) == null ? null : profileResult.profile();
        if (gameProfile == null) {
            gameProfile = new GameProfile(uUID, string);
        }
        return PlayerListEntryAccessor.callTexturesSupplier(gameProfile);
    }

    public static Supplier ztz_3() {
        int n = 1635153488;
        int n2 = (n = Integer.rotateLeft(n * 1953642665, 22) ^ 0x256599FD) ^ 0x40B08D24;
        if ((n2 ^ n) != 1085312292) {
            int cfr_ignored_0 = (0x21C6FB74 ^ n) - 427111079;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return tad_4 ? skhw_2 : null;
    }

    private static void slh(bsj bsj2) {
        int n = 921194435;
        int n2 = (n = Integer.rotateLeft(n * -1255454273, 7) ^ 0x39CCAEFB) ^ 0xBD63B717;
        if ((n2 ^ n) != -1117538537) {
            int cfr_ignored_0 = (0x8B8BF8D4 ^ n) + -760979702;
        }
        bsj2.tkn();
    }

    private static void dkl_2(bsj bsj2) {
        int n = sd_2.djq_2(-1958294699);
        int n2 = n ^ 0x7C5A92FE;
        if ((n2 ^ n) != 2086310654) {
            int cfr_ignored_0 = Integer.rotateRight(0xF71C59AB ^ n, 17) + -255034640;
        }
        bsj2.dby_2("off", "set");
    }

    private static void zys_3(bdht_2 bdht2) {
        int n = 0;
        int n2 = 1730527101;
        n2 = Integer.rotateLeft(n2 * 731279629, 9) ^ 0xA3D7099D;
        int n3 = Integer.reverse(Integer.reverse(1408841579 + n2));
        block27: while (true) {
            switch (n3 - n2) {
                case -1056837776: {
                    int cfr_ignored_0 = Integer.rotateLeft(0xD6242220 ^ n2, 13) + -222445285;
                    yf.athz_2();
                    try {
                        n -= 3;
                        if ((0xFAC2570CFAFBCDB3L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = 1387985261 + n2 ^ 0x9DDC3287 ^ 0x9DDC3287;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = 1387985261 + n2;
                    }
                    n -= 2;
                    continue block27;
                }
                case 1408841579: {
                    int cfr_ignored_1 = (Integer.rotateLeft(0x9C33643D ^ n2, 6) - -292109666) * -1674353603;
                    int cfr_ignored_2 = (int)(0x5E81CA0027D4EB4FL ^ (long)n2 ^ 0x6970831A2DB910D2L);
                    if (!yf.khdha_2()) {
                        n3 = 673475074 + n2 ^ 0x3D64C585 ^ 0x3D64C585;
                        int cfr_ignored_3 = (Integer.rotateLeft(0x63BBD9F1 ^ n2, 15) + 404554602) * 1673255409;
                        int cfr_ignored_4 = (int)(0xA10977CC27D4EB4FL ^ (long)n2 ^ 0x12E8831A2DB8EFC3L);
                        n3 = Integer.reverse(Integer.reverse(-1056837776 + n2));
                        n += 3;
                        continue block27;
                    }
                    n3 = 1387985261 + n2 ^ 0x86FF12A1 ^ 0x86FF12A1;
                    int cfr_ignored_5 = (Integer.rotateLeft(0x197C4218 ^ n2, 6) + 443129891) * 427573785;
                    continue block27;
                }
                case 1387985261: {
                    int cfr_ignored_6 = (Integer.rotateLeft(0x6B1197D0 ^ n2, 16) + -75562645) * 1796315089;
                    bdht2.brsh("Manage custom skin");
                    return;
                }
                case -1097234255: {
                    int cfr_ignored_7 = Integer.rotateRight(0x134A6167 ^ n2, 5) - 1516202676;
                    n3 = -850745268 + n2 ^ 0x954F1D8D ^ 0x954F1D8D;
                    int cfr_ignored_8 = Integer.rotateLeft(0x838C8460 ^ n2, 3) + -228481317;
                    try {
                        --n;
                        if ((0x3FD04837F4EF8D43L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = 1408841579 + n2;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = 1408841579 + n2 ^ 0x2F8FBA41 ^ 0x2F8FBA41;
                    }
                    continue block27;
                }
                case 366883253: {
                    int cfr_ignored_9 = Integer.rotateRight(0xABDBEE47 ^ n2, 8) - -738231852;
                    n3 = Integer.reverse(Integer.reverse(-1329507677 + n2));
                    int cfr_ignored_10 = (Integer.rotateRight(0x95F56F6 ^ n2, 4) - 652814085) * 157243127;
                    try {
                        n += 4;
                        n3 = 1408841579 + n2 ^ 0xF73A15C5 ^ 0xF73A15C5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)(1408841579 + n2) ^ 0x62AD886B29C07A54L ^ 0x62AD886B29C07A54L);
                    }
                    n += 4;
                    continue block27;
                }
                case 395228855: {
                    int cfr_ignored_11 = Integer.rotateRight(0xEB71938B ^ n2, 16) + -2028045040;
                    n3 = -313488750 + n2 + -874900029 - -874900029;
                    int cfr_ignored_12 = (Integer.rotateLeft(0xA99EC54 ^ n2, 4) - 1291926887) * 177859669;
                    int cfr_ignored_13 = (int)(0x3EE3ACB7E99EC88CL ^ (long)n2 ^ 0xA41F1F8E6A3FD016L);
                    n3 = Integer.reverse(Integer.reverse(-7379773 + n2));
                    int cfr_ignored_14 = (int)(0xD0B2BAC0C7D29AB2L ^ (long)n2 ^ 0x88F14316CE420CB4L);
                    n3 = 1408841579 + n2;
                    n -= 4;
                    continue block27;
                }
                case -161739458: {
                    int cfr_ignored_15 = Integer.rotateLeft(0xBDDD8905 ^ n2, 10) - 36779734;
                    int cfr_ignored_16 = (int)(0x7F6F273827D4EB4FL ^ (long)n2 ^ 0xB300831A2DB9530FL);
                    int cfr_ignored_17 = (int)(0xC356FE9A3814C5A1L ^ (long)n2 ^ 0x44BC9A70642B7CL);
                    n3 = (int)((long)(1408841579 + n2) ^ 0xC58BBE29DBABB82L ^ 0xC58BBE29DBABB82L);
                    n -= 2;
                    continue block27;
                }
                case 1277210728: {
                    int cfr_ignored_18 = (Integer.rotateLeft(0x31602031 ^ n2, 9) + -16677590) * 828383281;
                    int cfr_ignored_19 = (int)(0xF3D28E0C27D4EB4FL ^ (long)n2 ^ 0xE168831A2DB84A74L);
                    n3 = Integer.reverse(Integer.reverse(-1614377459 + n2));
                    int cfr_ignored_20 = Integer.rotateRight(0xD5C2F42A ^ n2, 13) + -419876783;
                    int cfr_ignored_21 = (int)(0x66B6E90909C6F33DL ^ (long)n2 ^ 0x2F62DF3E1D5D60BCL);
                    n3 = Integer.reverse(Integer.reverse(1408841579 + n2));
                    n += 5;
                    continue block27;
                }
                case 1605883340: {
                    int cfr_ignored_22 = (Integer.rotateLeft(0xB4C5F5C ^ n2, 4) - 1654467423) * 189554525;
                    n3 = Integer.reverse(Integer.reverse(203586408 + n2));
                    int cfr_ignored_23 = (Integer.rotateLeft(0x96F69890 ^ n2, 5) + 1278875819) * -1762223983;
                    try {
                        n += 4;
                        if ((0xA3C3AA329736665L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse(1408841579 + n2));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)(1408841579 + n2) ^ 0xBE9BDE276821FD37L ^ 0xBE9BDE276821FD37L);
                    }
                    continue block27;
                }
                case 452316401: {
                    int cfr_ignored_24 = Integer.rotateRight(0x46E2CEA6 ^ n2, 11) - -1714117291;
                    n3 = -1230354471 + n2 + 766561640 - 766561640;
                    int cfr_ignored_25 = Integer.rotateLeft(0x7CBE31ED ^ n2, 18) - 526756590;
                    int cfr_ignored_26 = (int)(0xBE0C9FD027D4EB4FL ^ (long)n2 ^ 0xC2D0831A2DB8D1C8L);
                    try {
                        n -= 2;
                        if ((0x58DDBB09D4A0DF79L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse(1408841579 + n2));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = 1408841579 + n2;
                    }
                    n -= 3;
                    continue block27;
                }
                case -1898900110: {
                    int cfr_ignored_27 = Integer.rotateLeft(0xC45F8525 ^ n2, 11) - -873546058;
                    int cfr_ignored_28 = (int)(0x6ED2B1827D4EB4FL ^ (long)n2 ^ 0xAB40831A2DB9A00BL);
                    n3 = 1408841579 + n2 ^ 0xB7C08851 ^ 0xB7C08851;
                    n += 3;
                    continue block27;
                }
                case 1196821287: {
                    int cfr_ignored_29 = Integer.rotateRight(0x80EC5526 ^ n2, 3) - -1594102059;
                    try {
                        n += 3;
                        if ((0x63B4676A45988A6DL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse(1408841579 + n2));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)(1408841579 + n2) ^ 0x40C605075BF90F92L ^ 0x40C605075BF90F92L);
                    }
                    n -= 2;
                    continue block27;
                }
                case -618519547: {
                    int cfr_ignored_30 = (Integer.rotateLeft(0x97A805F1 ^ n2, 5) + 1639339882) * -1750596111;
                    int cfr_ignored_31 = (int)(0x551AABCC27D4EB4FL ^ (long)n2 ^ 0xAAE8831A2DB907E4L);
                    n3 = -1755096217 + n2 + -1975927028 - -1975927028;
                    int cfr_ignored_32 = (Integer.rotateLeft(0xA38AF311 ^ n2, 7) + -768537014) * -1551174895;
                    int cfr_ignored_33 = (int)(0x61385D2C27D4EB4FL ^ (long)n2 ^ 0x4728831A2DB96FA1L);
                    n3 = 1519777916 + n2 ^ 0xA2E20332 ^ 0xA2E20332;
                    int cfr_ignored_34 = Integer.rotateRight(0x2F98DE23 ^ n2, 8) + -941587080;
                    n3 = Integer.reverse(Integer.reverse(1408841579 + n2));
                    n += 3;
                    continue block27;
                }
            }
            int cfr_ignored_35 = Integer.rotateRight(0x8E02AB6E ^ n2, 4) - 917528973;
            n3 = (int)((long)(1408841579 + n2) ^ 0xBDD7177E8660DDDCL ^ 0xBDD7177E8660DDDCL);
        }
    }

    private static String bzj_2(String string, int n, int n2, int n3) {
        int n4 = -569536647;
        n4 = Integer.rotateLeft(n4 * 1045834037, 6) ^ 0xDFC5BA29;
        n4 = Integer.rotateRight(n ^ n4, 3);
        int n5 = (n4 = n2 ^ n4) ^ 0x195C7D4B;
        if ((n5 ^ n4) != 425491787) {
            int cfr_ignored_0 = (0xC751F232 ^ n4) - -559744243;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x6ED1C291 ^ n2 ^ i * -65681249 ^ hn_2, 26) ^ khsn));
        }
        return new String(cArray);
    }

    private static String thnq(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1709037410;
            n4 = Integer.rotateLeft(n4 * -1964386009, 27) ^ 0x3D4677BA;
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 8)) ^ 0x1F45CFC9;
            if ((n5 ^ n4) == 524668873) break block0;
            int cfr_ignored_0 = (0x7A9818AB ^ n4) + -1904639891;
        }
        return sh_5.bzj_2(string, n, n2, n3);
    }

    private static bdht_2 dwk_2(bdht_2 bdht2, String string, Consumer consumer) {
        block0: {
            int n = -199288296;
            n = Integer.rotateLeft(n * -77328803, 9) ^ 0x2E0F560A;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x10D61DF0;
            if ((n2 ^ n) == 282467824) break block0;
            int cfr_ignored_0 = (0xE4C907E8 ^ n) + -1969965809;
        }
        return bdht2.dqdh_2(string, consumer);
    }

    private static bdht_2 zht_2(bdht_2 bdht2, String string, Consumer consumer) {
        block0: {
            int n = sd_2.djq_2(-6091616);
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 29);
            int n2 = n ^ 0x969C2BDA;
            if ((n2 ^ n) == -1768150054) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x693F277A ^ n, 16) + -1023187199) * 1765746555;
        }
        return bdht2.dqdh_2(string, consumer);
    }

    private static void shaa_2() {
        int n = sd_2.djq_2(300523660);
        int n2 = n ^ 0x3E054060;
        if ((n2 ^ n) != 1040531552) {
            int cfr_ignored_0 = Integer.rotateLeft(0x2FECE0EC ^ n, 8) - -770909233;
        }
        yf.athz_2();
    }

    private static List bhs_4(bths_2 bths2) {
        block0: {
            int n = -2081424839;
            int n2 = (n = Integer.rotateLeft(n * 59969839, 7) ^ 0x3452DCC1) ^ 0xDD14B741;
            if ((n2 ^ n) == -585844927) break block0;
            int cfr_ignored_0 = (0x5EFB4D78 ^ n) + 588095627;
        }
        return bths2.arguments();
    }

    private static String jthb(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -2129208902;
            n4 = Integer.rotateLeft(n4 * 2010961859, 24) ^ 0xAC3758EC;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 22);
            int n5 = (n4 = n ^ n4) ^ 0x15EC8292;
            if ((n5 ^ n4) == 367821458) break block0;
            int cfr_ignored_0 = (0x94FA5B28 ^ n4) - 1771335804;
        }
        return sh_5.bzj_2(string, n, n2, n3);
    }

    private static String ats(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -2053352121;
            n4 = Integer.rotateLeft(n4 * 1175088119, 26) ^ 0x8BE6C49D;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 8);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 29)) ^ 0x75D247E6;
            if ((n5 ^ n4) == 1976715238) break block0;
            int cfr_ignored_0 = (0xF04E12A1 ^ n4) + 446494574;
        }
        return sh_5.bzj_2(string, n, n2, n3);
    }

    private static class_2561 ham_2(String string) {
        block0: {
            int n = sd_2.djq_2(-928229255);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 23);
            int n2 = n ^ 0x6AC47685;
            if ((n2 ^ n) == 1791260293) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xA2682EFC ^ n, 7) - -1359261761) * -1570230531;
        }
        return class_2561.method_30163((String)string);
    }

    private static btw khkz() {
        block0: {
            int n = 430172372;
            int n2 = (n = Integer.rotateLeft(n * -337807285, 18) ^ 0x6E2C83D5) ^ 0xCB1F5C;
            if ((n2 ^ n) == 13311836) break block0;
            int cfr_ignored_0 = (0x1968F788 ^ n) + -12936294;
        }
        return btw.jbh_2();
    }

    private static void sakh(class_2561 class_25612) {
        int n = sd_2.djq_2(162091120);
        int n2 = n ^ 0xEE25FE40;
        if ((n2 ^ n) != -299499968) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xE78CAE30 ^ n, 15) + 241612555) * -410210767;
        }
        bzh_4.ttht_3(class_25612);
    }

    private static class_2561 rsdh_2(String string) {
        block0: {
            int n = 1580488255;
            int n2 = (n = Integer.rotateLeft(n * 69364363, 16) ^ 0x5F653764) ^ 0xEFFF2315;
            if ((n2 ^ n) == -268492011) break block0;
            int cfr_ignored_0 = (0xB1CB752A ^ n) - 1648565523;
        }
        return class_2561.method_30163((String)string);
    }

    private static Supplier hhdh_2(String string) {
        block0: {
            int n = -822383592;
            n = Integer.rotateLeft(n * 1799566305, 7) ^ 0xC0DEF4EE;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xB9A6C9AC;
            if ((n2 ^ n) == -1180251732) break block0;
            int cfr_ignored_0 = (0x775DA5B4 ^ n) - 1211653097;
        }
        return sh_5.zks_3(string);
    }

    private static void szl_3(btw btw2, String string) {
        int n = -1829808301;
        n = Integer.rotateLeft(n * 625563117, 20) ^ 0x2BD196B7;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xEBB32EA1;
        if ((n2 ^ n) != -340578655) {
            int cfr_ignored_0 = (0x795C79F2 ^ n) - 1904423193;
        }
        btw2.rww(string);
    }

    private static int asd_2(int n) {
        block0: {
            int n2 = -918950770;
            int n3 = (n2 = Integer.rotateLeft(n2 * 798996849, 17) ^ 0x7C7A93BA) ^ 0x9F05ADAF;
            if ((n3 ^ n2) == -1627017809) break block0;
            int cfr_ignored_0 = (0x563C4121 ^ n2) - -1538290859;
        }
        return Integer.reverse(n);
    }

    private static String zst_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = sd_2.djq_2(-1525231844);
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 9);
            int n5 = (n4 = n2 ^ n4) ^ 0xCE42B39E;
            if ((n5 ^ n4) == -834489442) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x6B547C82 ^ n4, 16) + 60338937;
        }
        return sh_5.bzj_2(string, n, n2, n3);
    }

    private static UUID jan_2(String string) {
        block0: {
            int n = 1738941888;
            n = Integer.rotateLeft(n * -1882057131, 4) ^ 0x8F460AF8;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xB7D5471A;
            if ((n2 ^ n) == -1210759398) break block0;
            int cfr_ignored_0 = (0xD07362DA ^ n) - 660744422;
        }
        return sh_4.ghkhd(string);
    }

    private static String[] ttgh_3(String string) {
        int n = -295283941;
        n = Integer.rotateLeft(n * -817946635, 25) ^ 0x8738B9BC;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 2);
        int n2 = n ^ 0x7AE52408;
        if ((n2 ^ n) != 2061837320) {
            int cfr_ignored_0 = (0x94837713 ^ n) - -92600796;
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

    private static CallSite ta_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1269799829;
            n3 = Integer.rotateLeft(n3 * -339001875, 6) ^ 0xE04D8F68;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x550AC522;
            if ((n4 ^ n3) != 1426769186) {
                int cfr_ignored_0 = (0x1EA55EB7 ^ n3) + 1205983713;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ rlf ^ string.hashCode() ^ n2 + khdw ^ i * 1761108589 ^ rlf, 25) ^ khdw));
            }
            String[] stringArray = sh_5.ttgh_3(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] yue51ha63wjvyn(String string) {
        return string.split("\u0005\u001b", -1);
    }

    private static CallSite u7touj27emn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ esxpuwqb134 ^ string.hashCode() ^ n2 + smv7hu21eh6 ^ i * -539052903 ^ esxpuwqb134, 3) ^ smv7hu21eh6));
            }
            String[] stringArray = sh_5.yue51ha63wjvyn(new String(cArray));
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

