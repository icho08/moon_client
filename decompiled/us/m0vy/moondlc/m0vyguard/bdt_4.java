/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1792
 *  org.jetbrains.annotations.Nullable
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
import java.util.Optional;
import java.util.function.Predicate;
import lombok.Generated;
import net.minecraft.class_1792;
import org.jetbrains.annotations.Nullable;
import us.m0vy.moondlc.m0vyguard.bd_2;
import us.m0vy.moondlc.m0vyguard.tzd_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class bdt_4 {
    protected final List szr_2;
    private static final int za_4 = 2145068246;
    private static final int thsh_3 = 46363159;
    private static final int j1sj33l7m = 2021421494;
    private static final int vb5k9udu1vl = 2016388171;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int yqlfh3bmxa64;

    public bdt_4(List list) {
        this.szr_2 = list;
    }

    @Nullable
    public tzd_2 tbt_2(class_1792 class_17922) {
        tzd_2 tzd2 = null;
        int n = 0;
        int n2 = 1437917778;
        n2 = Integer.rotateLeft(n2 * -793874261, 15) ^ 0xC5C74E53;
        n2 = System.identityHashCode(this) ^ n2;
        class_1792 class_17923 = class_17922;
        n2 = Integer.rotateLeft((class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n2, 21);
        int n3 = (int)((long)(517141571 + n2) ^ 0x26ED61092D048226L ^ 0x26ED61092D048226L);
        block25: while (true) {
            switch (n3 - n2) {
                case 517141571: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x9B212236 ^ n2, 6) - -849296443) * -1692327369;
                    if (yf.khdha_2()) {
                        n3 = 1027088446 + n2 + -1155545068 - -1155545068;
                        int cfr_ignored_1 = (Integer.rotateLeft(0x10F2E350 ^ n2, 5) + 298264043) * 284353361;
                        n3 = 517141570 + n2;
                        n += 3;
                        continue block25;
                    }
                    n3 = (int)((long)(517141569 + n2) ^ 0xA2437688FB0B24C6L ^ 0xA2437688FB0B24C6L);
                    n += 2;
                    continue block25;
                }
                case 517141570: {
                    int cfr_ignored_2 = (Integer.rotateRight(0xF1FF43D7 ^ n2, 17) - 1380374084) * -234929193;
                    tzd2 = this.szr_2.stream().filter(arg_0 -> bdt_4.bhy_2(class_17922, arg_0)).findFirst().orElse(null);
                    int cfr_ignored_3 = (int)(0xBA54A0DFDC54310FL ^ (long)n2 ^ 0xBCCF741B9938D978L);
                    n3 = 517141572 + n2 ^ 0xEB213BE6 ^ 0xEB213BE6;
                    n -= 2;
                    continue block25;
                }
                case 517141569: {
                    int cfr_ignored_4 = (Integer.rotateLeft(0x168A3DF8 ^ n2, 5) + -1088741309) * 378158585;
                    yf.athz_2();
                    n3 = 517141570 + n2 ^ 0xB915DD20 ^ 0xB915DD20;
                    int cfr_ignored_5 = (Integer.rotateRight(0xBACE4C92 ^ n2, 10) + -1554455319) * -1160885101;
                    n -= 2;
                    continue block25;
                }
                case 517141573: {
                    int cfr_ignored_6 = Integer.rotateRight(0x79B8C467 ^ n2, 18) - -1044551756;
                    try {
                        n += 3;
                        n3 = 517141571 + n2 + -889302982 - -889302982;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(517141571 + n2));
                    }
                    n -= 3;
                    continue block25;
                }
                case 517141574: {
                    int cfr_ignored_7 = Integer.rotateLeft(0x563A9B81 ^ n2, 13) + 1970697178;
                    int cfr_ignored_8 = (int)(0x948835BC27D4EB4FL ^ (long)n2 ^ 0x9608831A2DB884C1L);
                    n3 = (int)((long)(517141571 + n2) ^ 0xB9F31B70619D5D3DL ^ 0xB9F31B70619D5D3DL);
                    int cfr_ignored_9 = (Integer.rotateRight(0xB2B584F3 ^ n2, 9) + -1470580568) * -1296726797;
                    continue block25;
                }
                case 517141575: {
                    int cfr_ignored_10 = Integer.rotateRight(0x7F894F ^ n2, 3) - 332349388;
                    n3 = 517141571 + n2 ^ 0xFFE3D1A2 ^ 0xFFE3D1A2;
                    continue block25;
                }
                case 517141576: {
                    int cfr_ignored_11 = (Integer.rotateRight(0x3CF55057 ^ n2, 10) - 1712478660) * 1022709847;
                    n3 = 1884897576 + n2 ^ 0xEC5841B3 ^ 0xEC5841B3;
                    int cfr_ignored_12 = (Integer.rotateRight(0x9CCE839E ^ n2, 6) - 23039837) * -1664187489;
                    int cfr_ignored_13 = (int)(0x3C40D567176A57C7L ^ (long)n2 ^ 0x57BEE26754A9D550L);
                    n3 = Integer.reverse(Integer.reverse(517141571 + n2));
                    n += 3;
                    continue block25;
                }
                case 517141577: {
                    int cfr_ignored_14 = (Integer.rotateLeft(0x1FDE69FC ^ n2, 6) - -531860289) * 534669821;
                    n3 = 1941237025 + n2;
                    int cfr_ignored_15 = (Integer.rotateLeft(0xD74BDE58 ^ n2, 13) + 378375139) * -682893735;
                    n3 = 517141571 + n2 ^ 0xF73E53D0 ^ 0xF73E53D0;
                    int cfr_ignored_16 = Integer.rotateLeft(0xF0143140 ^ n2, 17) + 382703099;
                    continue block25;
                }
                case 517141578: {
                    int cfr_ignored_17 = Integer.rotateLeft(0xAF3A0C20 ^ n2, 8) + 1013258011;
                    n3 = Integer.reverse(Integer.reverse(517141571 + n2));
                    int cfr_ignored_18 = Integer.rotateRight(0x99F051C7 ^ n2, 6) - -1468561836;
                    --n;
                    continue block25;
                }
                case 517141579: {
                    int cfr_ignored_19 = Integer.rotateLeft(0x2774B664 ^ n2, 7) - -880822953;
                    n3 = 984824959 + n2;
                    int cfr_ignored_20 = Integer.rotateLeft(0xE6E76C08 ^ n2, 15) + -94129101;
                    try {
                        ++n;
                        n3 = 517141571 + n2 ^ 0xA1D5DDB7 ^ 0xA1D5DDB7;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (int)((long)(517141571 + n2) ^ 0x39ABBAC66F6F6C0DL ^ 0x39ABBAC66F6F6C0DL);
                    }
                    n -= 4;
                    continue block25;
                }
                case 517141580: {
                    int cfr_ignored_21 = (Integer.rotateLeft(0x89039055 ^ n2, 4) - -1681122938) * -1996255147;
                    int cfr_ignored_22 = (int)(0x4BB13E6827D4EB4FL ^ (long)n2 ^ 0x81A0831A2DB93AB3L);
                    n3 = 517141571 + n2 ^ 0x629E2D47 ^ 0x629E2D47;
                    int cfr_ignored_23 = (Integer.rotateLeft(0xE09AD95D ^ n2, 15) - 924709246) * -526722723;
                    int cfr_ignored_24 = (int)(0x2228776027D4EB4FL ^ (long)n2 ^ 0x13B0831A2DB9E981L);
                    continue block25;
                }
                case 517141581: {
                    int cfr_ignored_25 = Integer.rotateLeft(0xEA7B09E5 ^ n2, 16) - 1766052342;
                    int cfr_ignored_26 = (int)(0x28C9A7D827D4EB4FL ^ (long)n2 ^ 0xB2C0831A2DB9FC42L);
                    n3 = 1010479455 + n2 ^ 0xFC36FF62 ^ 0xFC36FF62;
                    int cfr_ignored_27 = Integer.rotateRight(0x6E4F2622 ^ n2, 16) + 1609776473;
                    n3 = -17400337 + n2 + 1684832583 - 1684832583;
                    int cfr_ignored_28 = Integer.rotateLeft(0x6520F3A1 ^ n2, 15) + 1130045370;
                    int cfr_ignored_29 = (int)(0xA7925D9C27D4EB4FL ^ (long)n2 ^ 0x4648831A2DB8E2F5L);
                    n3 = Integer.reverse(Integer.reverse(517141571 + n2));
                    n -= 4;
                    continue block25;
                }
                case 517141582: {
                    int cfr_ignored_30 = (Integer.rotateRight(0xAA841BB7 ^ n2, 8) - -1436747164) * -1434182729;
                    try {
                        n3 = Integer.reverse(Integer.reverse(517141571 + n2));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = 517141571 + n2;
                    }
                    n += 5;
                    continue block25;
                }
                case 517141583: {
                    int cfr_ignored_31 = (Integer.rotateLeft(0x8140C3D8 ^ n2, 3) + -1422567837) * -2126461991;
                    n3 = -1344667487 + n2 ^ 0xC521AA13 ^ 0xC521AA13;
                    int cfr_ignored_32 = Integer.rotateRight(0x4B81486E ^ n2, 12) - 688219277;
                    try {
                        n -= 5;
                        if ((0xB162263222909F0FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = 517141571 + n2;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = 517141571 + n2 + -2047227238 - -2047227238;
                    }
                    n += 2;
                    continue block25;
                }
                case 517141572: {
                    return tzd2;
                }
            }
            int cfr_ignored_33 = (Integer.rotateLeft(0x70A095D8 ^ n2, 17) + -1479555997) * 1889572313;
            n3 = 517141571 + n2;
        }
    }

    @Nullable
    public tzd_2 dhjt_2(Predicate predicate) {
        block0: {
            int n = 1824761891;
            int n2 = (n = Integer.rotateLeft(n * -1058900893, 19) ^ 0x33D89A7A) ^ 0xE0B8FCF7;
            if ((n2 ^ n) == -524747529) break block0;
            int cfr_ignored_0 = (0x8C7B54D4 ^ n) - -2059361361;
        }
        return (tzd_2)bdt_4.dhshd(this.szr_2.stream().filter(arg_0 -> bdt_4.nm(predicate, arg_0)).findFirst(), null);
    }

    public /*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable List shlw(class_1792 class_17922) {
        try {
            int n = 966330027;
            n = Integer.rotateLeft(n * 425785187, 26) ^ 0x3B9EAB8D;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 24);
            int n2 = n ^ 0xF58E814;
            if ((n2 ^ n) != 257484820) {
                int cfr_ignored_0 = (0x36C1EEBF ^ n) + -1878868679;
            }
            if ((0x385 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bdt_4.ddhh_3()) {
            throw null;
        }
        return this.szr_2.stream().filter(arg_0 -> bdt_4.ass_4(class_17922, arg_0)).toList();
    }

    public /*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable List rhdh(Predicate predicate) {
        block0: {
            int n = -108978233;
            n = Integer.rotateLeft(n * -395997713, 13) ^ 0xB0A49E83;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
            Predicate predicate2 = predicate;
            n = Integer.rotateRight((predicate2 != null ? System.identityHashCode(predicate2) : 0) ^ n, 3);
            int n2 = n ^ 0xAFAF88BB;
            if ((n2 ^ n) == -1347450693) break block0;
            int cfr_ignored_0 = (0x562E977C ^ n) - -874583720;
        }
        return this.szr_2.stream().filter(arg_0 -> bdt_4.dhn_2(predicate, arg_0)).toList();
    }

    @Nullable
    public tzd_2 srs_4() {
        block0: {
            int n = 1195167231;
            n = Integer.rotateLeft(n * -1195032895, 21) ^ 0x708E0844;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xA12308C1;
            if ((n2 ^ n) == -1591539519) break block0;
            int cfr_ignored_0 = (0xE61FC53E ^ n) + -1542185668;
        }
        return (tzd_2)bdt_4.hdn_2(this.szr_2.stream().filter(tzd_2::jlj).findFirst(), null);
    }

    public boolean dzf_2(class_1792 class_17922) {
        block0: {
            int n = -219626428;
            n = Integer.rotateLeft(n * 1117120677, 15) ^ 0xEDC9035A;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xDB751C31;
            if ((n2 ^ n) == -613082063) break block0;
            int cfr_ignored_0 = (0x299DD875 ^ n) - 1001222865;
        }
        return this.szr_2.stream().anyMatch(arg_0 -> bdt_4.dzy_2(class_17922, arg_0));
    }

    public int zhb_4(class_1792 class_17922) {
        block0: {
            int n = -1849922393;
            int n2 = (n = Integer.rotateLeft(n * -986740693, 12) ^ 0x91FF6CFC) ^ 0x9A802B;
            if ((n2 ^ n) == 10125355) break block0;
            int cfr_ignored_0 = (0x9126EC8C ^ n) + 1980014206;
        }
        return this.szr_2.stream().filter(arg_0 -> bdt_4.trd_4(class_17922, arg_0)).mapToInt(bdt_4::ray_2).sum();
    }

    public bdt_4 zthr_2(bdt_4 bdt2) {
        int n = -244263302;
        n = Integer.rotateLeft(n * 54752907, 26) ^ 0xDCCED238;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 23);
        int n2 = n ^ 0xA5DDEC0B;
        if ((n2 ^ n) != -1512182773) {
            int cfr_ignored_0 = (0x54AD3A71 ^ n) + 167372881;
        }
        ArrayList arrayList = new ArrayList(this.szr_2.size() + bdt2.szr_2.size());
        arrayList.addAll(this.szr_2);
        arrayList.addAll(bdt2.szr_2);
        return new bdt_4(arrayList);
    }

    public bdt_4 dhk_5(tzd_2 tzd2) {
        try {
            int n = 2061453825;
            n = Integer.rotateLeft(n * -1706266737, 9) ^ 0xA83862CF;
            tzd_2 tzd3 = tzd2;
            n = Integer.rotateRight((tzd3 != null ? System.identityHashCode(tzd3) : 0) ^ n, 21);
            int n2 = n ^ 0x76AD6FB3;
            if ((n2 ^ n) != 1991077811) {
                int cfr_ignored_0 = (0xC7225B2 ^ n) + -1156085926;
            }
            if ((0x83 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        ArrayList<tzd_2> arrayList = new ArrayList<tzd_2>(this.szr_2);
        arrayList.add(tzd2);
        return new bdt_4(arrayList);
    }

    @Generated
    public List djkh_2() {
        block0: {
            int n = 1406362301;
            n = Integer.rotateLeft(n * -1669552199, 9) ^ 0x2A778CE5;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 21);
            int n2 = n ^ 0x869B0FB7;
            if ((n2 ^ n) == -2036658249) break block0;
            int cfr_ignored_0 = (0xD5486D0A ^ n) - -120616236;
        }
        return this.szr_2;
    }

    private static int ray_2(tzd_2 tzd2) {
        block0: {
            int n = bd_2.sbw_2(203827368);
            int n2 = n ^ 0x90538627;
            if ((n2 ^ n) == -1873574361) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x9C75AE8F ^ n, 6) - -157433204;
        }
        return tzd2.bdy_2().method_7947();
    }

    private static boolean trd_4(class_1792 class_17922, tzd_2 tzd2) {
        block0: {
            int n = bd_2.sbw_2(-1918685804);
            class_1792 class_17923 = class_17922;
            n = Integer.rotateLeft((class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n, 20);
            tzd_2 tzd3 = tzd2;
            n = (tzd3 != null ? System.identityHashCode(tzd3) : 0) ^ n;
            int n2 = n ^ 0x35328032;
            if ((n2 ^ n) == 892502066) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xB891ADA6 ^ n, 10) - 1577166421;
        }
        return tzd2.thq_3(class_17922);
    }

    private static boolean dzy_2(class_1792 class_17922, tzd_2 tzd2) {
        block0: {
            int n = 895771720;
            n = Integer.rotateLeft(n * 894053941, 7) ^ 0xF6F4E2;
            class_1792 class_17923 = class_17922;
            n = Integer.rotateLeft((class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n, 14);
            tzd_2 tzd3 = tzd2;
            n = (tzd3 != null ? System.identityHashCode(tzd3) : 0) ^ n;
            int n2 = n ^ 0xCAD1CD3E;
            if ((n2 ^ n) == -892220098) break block0;
            int cfr_ignored_0 = (0xFFB5A976 ^ n) - 667034023;
        }
        return tzd2.thq_3(class_17922);
    }

    private static boolean dhn_2(Predicate predicate, tzd_2 tzd2) {
        block0: {
            int n = -699096079;
            int n2 = (n = Integer.rotateLeft(n * 1004936747, 6) ^ 0x6EECA5C4) ^ 0xB1A747BC;
            if ((n2 ^ n) == -1314437188) break block0;
            int cfr_ignored_0 = (0x67F3E44D ^ n) + -627611374;
        }
        return tzd2.zjy(predicate);
    }

    private static boolean ass_4(class_1792 class_17922, tzd_2 tzd2) {
        block0: {
            int n = 1500067021;
            n = Integer.rotateLeft(n * -2031925571, 6) ^ 0x7DEC7E90;
            class_1792 class_17923 = class_17922;
            n = (class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n;
            tzd_2 tzd3 = tzd2;
            n = Integer.rotateRight((tzd3 != null ? System.identityHashCode(tzd3) : 0) ^ n, 25);
            int n2 = n ^ 0x4E3E3A11;
            if ((n2 ^ n) == 1312700945) break block0;
            int cfr_ignored_0 = (0x17570EDC ^ n) + -19951139;
        }
        return tzd2.thq_3(class_17922);
    }

    private static boolean nm(Predicate predicate, tzd_2 tzd2) {
        block0: {
            int n = bd_2.sbw_2(-1847163096);
            tzd_2 tzd3 = tzd2;
            n = Integer.rotateRight((tzd3 != null ? System.identityHashCode(tzd3) : 0) ^ n, 14);
            int n2 = n ^ 0x3F1EECB7;
            if ((n2 ^ n) == 1058991287) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xAEF86B9F ^ n, 8) - 879929212) * -1359451233;
        }
        return tzd2.zjy(predicate);
    }

    private static boolean bhy_2(class_1792 class_17922, tzd_2 tzd2) {
        block0: {
            int n = 788331641;
            n = Integer.rotateLeft(n * -1815120151, 19) ^ 0xF2B98930;
            class_1792 class_17923 = class_17922;
            n = (class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n;
            tzd_2 tzd3 = tzd2;
            n = Integer.rotateRight((tzd3 != null ? System.identityHashCode(tzd3) : 0) ^ n, 28);
            int n2 = n ^ 0xDD5D085F;
            if ((n2 ^ n) == -581105569) break block0;
            int cfr_ignored_0 = (0xF3A1F426 ^ n) - -2103329053;
        }
        return tzd2.thq_3(class_17922);
    }

    private static Object dhshd(Optional optional, Object object) {
        block0: {
            int n = -1657667180;
            n = Integer.rotateLeft(n * -364698955, 9) ^ 0xC436303F;
            Optional optional2 = optional;
            n = Integer.rotateLeft((optional2 != null ? System.identityHashCode(optional2) : 0) ^ n, 14);
            int n2 = n ^ 0xC0D6DC73;
            if ((n2 ^ n) == -1059660685) break block0;
            int cfr_ignored_0 = (0x5DE4DDE7 ^ n) + 372615276;
        }
        return optional.orElse(object);
    }

    private static boolean ddhh_3() {
        block0: {
            int n = bd_2.sbw_2(736792791);
            int n2 = n ^ 0xDCB4893E;
            if ((n2 ^ n) == -592148162) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xF75E19E9 ^ n, 17) + -121453966;
            int cfr_ignored_1 = (int)(0x35ECB7D427D4EB4FL ^ (long)n ^ 0x92D8831A2DB9C608L);
        }
        return yf.dnkh();
    }

    private static Object hdn_2(Optional optional, Object object) {
        block0: {
            int n = -596489697;
            n = Integer.rotateLeft(n * -10906957, 24) ^ 0x5D1E4209;
            Optional optional2 = optional;
            n = Integer.rotateLeft((optional2 != null ? System.identityHashCode(optional2) : 0) ^ n, 11);
            Object object2 = object;
            n = (object2 != null ? System.identityHashCode(object2) : 0) ^ n;
            int n2 = n ^ 0x443EF128;
            if ((n2 ^ n) == 1144975656) break block0;
            int cfr_ignored_0 = (0x984CBB37 ^ n) - -1461974354;
        }
        return optional.orElse(object);
    }

    private static String[] jdf_2(String string) {
        int n = -1393612193;
        n = Integer.rotateLeft(n * 925827181, 19) ^ 0x669A3B3D;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xF7083C37;
        if ((n2 ^ n) != -150455241) {
            int cfr_ignored_0 = (0x5BE71668 ^ n) - 271112926;
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

    private static CallSite dkhdh_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 762969536;
            n3 = Integer.rotateLeft(n3 * -2137063821, 23) ^ 0x5A516958;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xC90487E0;
            if ((n4 ^ n3) != -922449952) {
                int cfr_ignored_0 = (0xE47D7A20 ^ n3) + 991790459;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ za_4 ^ string.hashCode()) + (n2 + thsh_3) + i ^ za_4, 13) + thsh_3);
            }
            String[] stringArray = bdt_4.jdf_2(new String(cArray));
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

    private static String[] tk2o1xjt4(String string) {
        return string.split("\u0007\u001d", -1);
    }

    private static CallSite vz2s6lw0qyvy0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ j1sj33l7m ^ string.hashCode()) + (n2 + vb5k9udu1vl) + i ^ j1sj33l7m, 10) + vb5k9udu1vl);
            }
            String[] stringArray = bdt_4.tk2o1xjt4(new String(cArray));
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

