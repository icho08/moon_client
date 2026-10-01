/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import us.m0vy.moondlc.m0vyguard.qs_2;

public abstract class bhd_4 {
    private final String hth;
    protected final int hhw_2;
    private static final int dsh_7 = 1855397373;
    private static final int shyj = 1217130881;
    private static final int dlgn4dm4s8y8d = 613896257;
    private static final int n7i40fq = -1918971341;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int eckj92e7wpx2k0;

    public bhd_4(String string, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The number of function arguments can not be less than 0 for '" + string + "'");
        }
        if (!bhd_4.jqw(string)) {
            throw new IllegalArgumentException("The function name '" + string + "' is invalid");
        }
        this.hth = string;
        this.hhw_2 = n;
    }

    public bhd_4(String string) {
        this(string, 1);
    }

    public String getName() {
        block0: {
            int n = 1448155036;
            n = Integer.rotateLeft(n * 1217240417, 27) ^ 0xC46B48C9;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 17);
            int n2 = n ^ 0x928BEA2A;
            if ((n2 ^ n) == -1836324310) break block0;
            int cfr_ignored_0 = (0xC4DAFDB6 ^ n) - -686536152;
        }
        return this.hth;
    }

    public int rzdh_2() {
        block0: {
            int n = -834822245;
            n = Integer.rotateLeft(n * 1446211231, 11) ^ 0x8104141B;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x7E82E035;
            if ((n2 ^ n) == 2122506293) break block0;
            int cfr_ignored_0 = (0xB0BF7FAE ^ n) - 645801717;
        }
        return this.hhw_2;
    }

    public abstract double d_2(double ... var1);

    @Deprecated(since="0.4.5")
    public static char[] ghhdh() {
        int n;
        int n2 = -1973912964;
        int n3 = (n2 = Integer.rotateLeft(n2 * 878093949, 26) ^ 0x6D8CBAE1) ^ 0x39AEC1C7;
        if ((n3 ^ n2) != 967754183) {
            int cfr_ignored_0 = (0xB3F6BBBB ^ n2) - 1175461997;
        }
        char[] cArray = new char[0x180FA407 ^ 0x180FA432];
        int n4 = 0;
        for (n = Integer.rotateLeft(0x5F8FB573 ^ 0x5F0DB573, 15); n < (Integer.reverse(-1225664532) ^ 0x37EB8F36); ++n) {
            cArray[n4++] = (char)n;
        }
        for (n = -1827822598 + 1827822695; n < Integer.rotateLeft(0x749483F7 ^ 0xAC9483F4, 5); ++n) {
            cArray[n4++] = (char)n;
        }
        cArray[n4] = 0x4A3A2F08 ^ 0x4A3A2F57;
        return cArray;
    }

    public static boolean jqw(String string) {
        int n = 0;
        int n2 = 0;
        char c = '\u0000';
        boolean bl = false;
        int n3 = 0;
        int n4 = -1025887222;
        n4 = Integer.rotateLeft(n4 * -350052931, 11) ^ 0xCF957F9B;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = 1164791429 + n4 ^ 0xE2E41B24 ^ 0xE2E41B24;
        while (true) {
            block80: {
                block65: {
                    block68: {
                        block73: {
                            block70: {
                                block52: {
                                    block67: {
                                        block55: {
                                            block57: {
                                                block59: {
                                                    block49: {
                                                        block58: {
                                                            block74: {
                                                                block66: {
                                                                    block62: {
                                                                        block53: {
                                                                            block50: {
                                                                                block51: {
                                                                                    block75: {
                                                                                        block78: {
                                                                                            block72: {
                                                                                                block64: {
                                                                                                    block48: {
                                                                                                        block61: {
                                                                                                            block63: {
                                                                                                                block60: {
                                                                                                                    block54: {
                                                                                                                        block76: {
                                                                                                                            block79: {
                                                                                                                                block71: {
                                                                                                                                    block69: {
                                                                                                                                        block77: {
                                                                                                                                            block56: {
                                                                                                                                                if ((n3 = n5 - n4) == 1760561831) break block48;
                                                                                                                                                if (n3 == 1554910635) break block49;
                                                                                                                                                if (n3 == 63047478) break block50;
                                                                                                                                                if (n3 == -604845491) break block51;
                                                                                                                                                if (n3 == -626153227) break block52;
                                                                                                                                                if (n3 == 370385358) break block53;
                                                                                                                                                if (n3 == -1785616312) break block54;
                                                                                                                                                if (n3 == -108641912) break block55;
                                                                                                                                                if (n3 == -604206163) break block56;
                                                                                                                                                if (n3 == -569806180) break block57;
                                                                                                                                                if (n3 == -562793553) break block58;
                                                                                                                                                int cfr_ignored_0 = (Integer.rotateRight(0x532AD09B ^ n4, 13) + 378331648) * 1395314843;
                                                                                                                                                if (n3 == -1289076319) break block59;
                                                                                                                                                if (n3 == 1347361565) break block60;
                                                                                                                                                if (n3 == -1785784384) break block61;
                                                                                                                                                if (n3 == -118329866) break block62;
                                                                                                                                                if (n3 == -2022539539) break block63;
                                                                                                                                                if (n3 == 1786010953) break block64;
                                                                                                                                                if (n3 == 1319429169) break block65;
                                                                                                                                                if (n3 == 1142963124) break block66;
                                                                                                                                                if (n3 == -679220763) break block67;
                                                                                                                                                if (n3 == -835828793) break block68;
                                                                                                                                                if (n3 == -959137965) break block69;
                                                                                                                                                if (n3 == 1010922502) break block70;
                                                                                                                                                if (n3 == -1000601783) break block71;
                                                                                                                                                if (n3 == 761112054) break block72;
                                                                                                                                                if (n3 == -177711000) break block73;
                                                                                                                                                if (n3 == 994375895) break block74;
                                                                                                                                                if (n3 == 599687234) break block75;
                                                                                                                                                if (n3 == -991079924) break block76;
                                                                                                                                                int cfr_ignored_1 = (Integer.rotateRight(0x3F821756 ^ n4, 10) - -1256295771) * 1065490263;
                                                                                                                                                if (n3 == 2005604514) break block77;
                                                                                                                                                if (n3 == -1752342493) break block78;
                                                                                                                                                if (n3 == 1164791429) break block79;
                                                                                                                                                break block80;
                                                                                                                                            }
                                                                                                                                            int cfr_ignored_2 = (Integer.rotateLeft(0xB88F07F1 ^ n4, 10) + 1571788138) * -1198585871;
                                                                                                                                            int cfr_ignored_3 = (int)(0x7A3DA9CC27D4EB4FL ^ (long)n4 ^ 0xAEE8831A2DB959AAL);
                                                                                                                                            c = string.charAt(n2);
                                                                                                                                            if (Character.isLetter(c)) {
                                                                                                                                                try {
                                                                                                                                                    ++n3;
                                                                                                                                                    n5 = (int)((long)(1786010953 + n4) ^ 0x96D886C6617E69ABL ^ 0x96D886C6617E69ABL);
                                                                                                                                                }
                                                                                                                                                catch (NoSuchElementException noSuchElementException) {
                                                                                                                                                    n5 = 1786010953 + n4 ^ 0x3BE3282 ^ 0x3BE3282;
                                                                                                                                                }
                                                                                                                                                n3 += 5;
                                                                                                                                                continue;
                                                                                                                                            }
                                                                                                                                            n5 = -1472781124 + n4 ^ 0xA808775D ^ 0xA808775D;
                                                                                                                                            int cfr_ignored_4 = Integer.rotateRight(0x809E0D62 ^ n4, 3) + -1753137639;
                                                                                                                                            n5 = Integer.reverse(Integer.reverse(-1000601783 + n4));
                                                                                                                                            n3 -= 5;
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                        int cfr_ignored_5 = Integer.rotateLeft(0x712B0F89 ^ n4, 17) + -1198227246;
                                                                                                                                        int cfr_ignored_6 = (int)(0xB399A1B427D4EB4FL ^ (long)n4 ^ 0xBE18831A2DB8CAE2L);
                                                                                                                                        c = string.charAt(n2);
                                                                                                                                        if (!Character.isLetter(c)) {
                                                                                                                                            n5 = -1000601783 + n4 + -259091134 - -259091134;
                                                                                                                                            n3 += 5;
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                        n5 = 1786010953 + n4;
                                                                                                                                        int cfr_ignored_7 = (Integer.rotateLeft(0x27C0991 ^ n4, 3) + 1365428170) * 41683345;
                                                                                                                                        int cfr_ignored_8 = (int)(0xC0CEA7AC27D4EB4FL ^ (long)n4 ^ 0xB228831A2DB82C4CL);
                                                                                                                                        n3 += 5;
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                    int cfr_ignored_9 = Integer.rotateRight(0x9435044B ^ n4, 5) + -154590128;
                                                                                                                                    bl = false;
                                                                                                                                    n5 = -2099960097 + n4;
                                                                                                                                    int cfr_ignored_10 = Integer.rotateRight(0x27683FE2 ^ n4, 7) + -906142823;
                                                                                                                                    n5 = 1319429169 + n4 ^ 0x3E55D6B ^ 0x3E55D6B;
                                                                                                                                    n3 -= 3;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                int cfr_ignored_11 = (Integer.rotateLeft(0xF9374B54 ^ n4, 18) - 839892583) * -113816747;
                                                                                                                                if (c == (0xBD5BA7FC ^ 0xBD5BA7A3)) {
                                                                                                                                    try {
                                                                                                                                        n3 -= 4;
                                                                                                                                        n5 = 1786010953 + n4;
                                                                                                                                    }
                                                                                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                                                        n5 = (int)((long)(1786010953 + n4) ^ 0xEB9297DDC0EF6A38L ^ 0xEB9297DDC0EF6A38L);
                                                                                                                                    }
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    n5 = (int)((long)(-1752342493 + n4) ^ 0x62D93510B73CA2AAL ^ 0x62D93510B73CA2AAL);
                                                                                                                                }
                                                                                                                                catch (NoSuchElementException noSuchElementException) {
                                                                                                                                    n5 = -1752342493 + n4 + 1193666115 - 1193666115;
                                                                                                                                }
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            int cfr_ignored_12 = Integer.rotateLeft(0x74E0DB61 ^ n4, 17) + 731394042;
                                                                                                                            int cfr_ignored_13 = (int)(0xB652755C27D4EB4FL ^ (long)n4 ^ 0x17C8831A2DB8C175L);
                                                                                                                            if (string != null) {
                                                                                                                                try {
                                                                                                                                    n3 -= 3;
                                                                                                                                    if ((0x5478A8C9CA19315L ^ (long)n4 | 1L) == 0L) {
                                                                                                                                        throw new IllegalStateException();
                                                                                                                                    }
                                                                                                                                    n5 = Integer.reverse(Integer.reverse(-991079924 + n4));
                                                                                                                                }
                                                                                                                                catch (IllegalStateException illegalStateException) {
                                                                                                                                    n5 = Integer.reverse(Integer.reverse(-991079924 + n4));
                                                                                                                                }
                                                                                                                                ++n3;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            n5 = Integer.reverse(Integer.reverse(-1758786510 + n4));
                                                                                                                            int cfr_ignored_14 = Integer.rotateRight(0x2E81ECC3 ^ n4, 8) + -1508291880;
                                                                                                                            n5 = -1785784384 + n4;
                                                                                                                            ++n3;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        int cfr_ignored_15 = Integer.rotateLeft(0xAC1ECFC1 ^ n4, 8) + -602355814;
                                                                                                                        int cfr_ignored_16 = (int)(0x6EAC61FC27D4EB4FL ^ (long)n4 ^ 0x3E88831A2DB97089L);
                                                                                                                        n = bhd_4.ghzj(string);
                                                                                                                        if (n != 0) {
                                                                                                                            try {
                                                                                                                                n3 -= 4;
                                                                                                                                if ((0x6C695EA99FD8E47FL ^ (long)n4 | 1L) == 0L) {
                                                                                                                                    throw new ArithmeticException();
                                                                                                                                }
                                                                                                                                n5 = Integer.reverse(Integer.reverse(-2022539539 + n4));
                                                                                                                            }
                                                                                                                            catch (ArithmeticException arithmeticException) {
                                                                                                                                n5 = (int)((long)(-2022539539 + n4) ^ 0x912B700CF0BA8CF2L ^ 0x912B700CF0BA8CF2L);
                                                                                                                            }
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        int cfr_ignored_17 = (int)(0xF368E2BB8B52AEB7L ^ (long)n4 ^ 0x3807DA16A6484B00L);
                                                                                                                        n5 = -959137965 + n4;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    int cfr_ignored_18 = (Integer.rotateRight(0x2043CCD3 ^ n4, 7) + -325882680) * 541314259;
                                                                                                                    bl = true;
                                                                                                                    int cfr_ignored_19 = (int)(0xC671F2C9E67A006DL ^ (long)n4 ^ 0x18E30047FBFC2132L);
                                                                                                                    n5 = -1774378437 + n4;
                                                                                                                    int cfr_ignored_20 = (int)(0x737084016339B55FL ^ (long)n4 ^ 0xF5720AC091994B30L);
                                                                                                                    n5 = (int)((long)(1319429169 + n4) ^ 0x791F603C64B70746L ^ 0x791F603C64B70746L);
                                                                                                                    --n3;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                int cfr_ignored_21 = (Integer.rotateLeft(0xA628659D ^ n4, 7) - 591523134) * -1507301987;
                                                                                                                int cfr_ignored_22 = (int)(0x649ACBA027D4EB4FL ^ (long)n4 ^ 0x6A30831A2DB964E4L);
                                                                                                                if (n2 >= n) {
                                                                                                                    try {
                                                                                                                        n3 -= 2;
                                                                                                                        n5 = (int)((long)(-1785616312 + n4) ^ 0x873F0CEDE20CF6L ^ 0x873F0CEDE20CF6L);
                                                                                                                    }
                                                                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                                        n5 = -1785616312 + n4 ^ 0xBE2D6334 ^ 0xBE2D6334;
                                                                                                                    }
                                                                                                                    n3 -= 5;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                try {
                                                                                                                    ++n3;
                                                                                                                    if ((0x21415380A2508D2FL ^ (long)n4 | 1L) == 0L) {
                                                                                                                        throw new NoSuchElementException();
                                                                                                                    }
                                                                                                                    n5 = 2005604514 + n4 ^ 0x8D932CB7 ^ 0x8D932CB7;
                                                                                                                }
                                                                                                                catch (NoSuchElementException noSuchElementException) {
                                                                                                                    n5 = 2005604514 + n4;
                                                                                                                }
                                                                                                                n3 -= 5;
                                                                                                                continue;
                                                                                                            }
                                                                                                            int cfr_ignored_23 = Integer.rotateRight(0xFD0678EE ^ n4, 18) - -1473887219;
                                                                                                            n2 = 0;
                                                                                                            try {
                                                                                                                ++n3;
                                                                                                                if ((0x80FCC9919DDFDAD7L ^ (long)n4 | 1L) == 0L) {
                                                                                                                    throw new IllegalStateException();
                                                                                                                }
                                                                                                                n5 = 1347361565 + n4 + 1844774599 - 1844774599;
                                                                                                            }
                                                                                                            catch (IllegalStateException illegalStateException) {
                                                                                                                n5 = (int)((long)(1347361565 + n4) ^ 0xC489369FEBA2A7CL ^ 0xC489369FEBA2A7CL);
                                                                                                            }
                                                                                                            n3 += 3;
                                                                                                            continue;
                                                                                                        }
                                                                                                        int cfr_ignored_24 = (Integer.rotateRight(0x1EFAD6D2 ^ n4, 6) + -994205015) * 519755475;
                                                                                                        bl = false;
                                                                                                        try {
                                                                                                            --n3;
                                                                                                            if ((0xA9F2CF4134053469L ^ (long)n4 | 1L) == 0L) {
                                                                                                                throw new NoSuchElementException();
                                                                                                            }
                                                                                                            n5 = 1319429169 + n4 + -243375902 - -243375902;
                                                                                                        }
                                                                                                        catch (NoSuchElementException noSuchElementException) {
                                                                                                            n5 = 1319429169 + n4 + -1641448452 - -1641448452;
                                                                                                        }
                                                                                                        n3 += 3;
                                                                                                        continue;
                                                                                                    }
                                                                                                    int cfr_ignored_25 = Integer.rotateRight(0xC535C547 ^ n4, 11) - -438271276;
                                                                                                    if (n2 > 0) {
                                                                                                        try {
                                                                                                            n3 -= 2;
                                                                                                            if ((0x16F19BA42AB30C4DL ^ (long)n4 | 1L) == 0L) {
                                                                                                                throw new ArithmeticException();
                                                                                                            }
                                                                                                            n5 = Integer.reverse(Integer.reverse(1786010953 + n4));
                                                                                                        }
                                                                                                        catch (ArithmeticException arithmeticException) {
                                                                                                            n5 = 1786010953 + n4;
                                                                                                        }
                                                                                                        n3 -= 5;
                                                                                                        continue;
                                                                                                    }
                                                                                                    int cfr_ignored_26 = (int)(0xD64F4FBC0DABA15BL ^ (long)n4 ^ 0x6208D7E4B990014FL);
                                                                                                    n5 = 761112054 + n4;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_27 = Integer.rotateRight(0x251E1A0E ^ n4, 7) - -2096970003;
                                                                                                ++n2;
                                                                                                try {
                                                                                                    if ((0x9C033018499AD4D7L ^ (long)n4 | 1L) == 0L) {
                                                                                                        throw new IllegalArgumentException();
                                                                                                    }
                                                                                                    n5 = (int)((long)(1347361565 + n4) ^ 0xFD8551C9727DA42L ^ 0xFD8551C9727DA42L);
                                                                                                }
                                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                                    n5 = 1347361565 + n4 + -722832924 - -722832924;
                                                                                                }
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_28 = Integer.rotateLeft(0xD79327E5 ^ n4, 13) - 523203574;
                                                                                            int cfr_ignored_29 = (int)(0x152189D827D4EB4FL ^ (long)n4 ^ 0xEEC0831A2DB98792L);
                                                                                            bl = false;
                                                                                            n5 = Integer.reverse(Integer.reverse(1319429169 + n4));
                                                                                            n3 += 3;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_30 = Integer.rotateRight(0x2C069BE7 ^ n4, 8) - 1495957556;
                                                                                        if (Character.isDigit(c)) {
                                                                                            n5 = 1760561831 + n4 ^ 0x34E03756 ^ 0x34E03756;
                                                                                            continue;
                                                                                        }
                                                                                        n5 = Integer.reverse(Integer.reverse(-39382924 + n4));
                                                                                        int cfr_ignored_31 = (Integer.rotateLeft(0x4801A434 ^ n4, 12) - -1131380345) * 1208067125;
                                                                                        n5 = 761112054 + n4 ^ 0x4A161728 ^ 0x4A161728;
                                                                                        n3 += 5;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_32 = (Integer.rotateRight(0x387D0392 ^ n4, 10) + -612299287) * 947717011;
                                                                                    try {
                                                                                        --n3;
                                                                                        n5 = 1164791429 + n4 + 520948163 - 520948163;
                                                                                    }
                                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                        n5 = 1164791429 + n4;
                                                                                    }
                                                                                    n3 += 3;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_33 = (Integer.rotateLeft(0x4A5AAE15 ^ n4, 12) - 89699270) * 1247456789;
                                                                                int cfr_ignored_34 = (int)(0x88E8002827D4EB4FL ^ (long)n4 ^ 0xFD20831A2DB8BC01L);
                                                                                n5 = (int)((long)(-1816865181 + n4) ^ 0x5E288CB4D3C8E0E5L ^ 0x5E288CB4D3C8E0E5L);
                                                                                int cfr_ignored_35 = Integer.rotateRight(0x3710D80B ^ n4, 9) + -1352152944;
                                                                                n5 = 1164791429 + n4;
                                                                                n3 += 4;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_36 = Integer.rotateRight(0x8AADB1A3 ^ n4, 4) + -815390216;
                                                                            n5 = 1164791429 + n4 ^ 0x5C6D0514 ^ 0x5C6D0514;
                                                                            int cfr_ignored_37 = (Integer.rotateRight(0xD005CEF2 ^ n4, 13) + 890351241) * -804925709;
                                                                            n3 += 5;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_38 = Integer.rotateLeft(0x6B9080A1 ^ n4, 16) + 182268602;
                                                                        int cfr_ignored_39 = (int)(0xA9222E9C27D4EB4FL ^ (long)n4 ^ 0xA048831A2DB8FF95L);
                                                                        n5 = 1187275528 + n4 + -438947450 - -438947450;
                                                                        int cfr_ignored_40 = Integer.rotateLeft(0xF1F0EBA8 ^ n4, 17) + 1351231635;
                                                                        int cfr_ignored_41 = (int)(0x701E6731C107B466L ^ (long)n4 ^ 0x33134EBC93EB4DEDL);
                                                                        n5 = Integer.reverse(Integer.reverse(1164791429 + n4));
                                                                        n3 -= 3;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_42 = Integer.rotateLeft(0x8A84A12C ^ n4, 4) - -898817137;
                                                                    int cfr_ignored_43 = (int)(0x751249B8274850F6L ^ (long)n4 ^ 0x6E0082235ACB47F5L);
                                                                    n5 = (int)((long)(1350471142 + n4) ^ 0x4870CA41ABCF5F1DL ^ 0x4870CA41ABCF5F1DL);
                                                                    int cfr_ignored_44 = (int)(0x81AF782509111A21L ^ (long)n4 ^ 0xD3ADE91CF64AE8FL);
                                                                    n5 = (int)((long)(1164791429 + n4) ^ 0x4DA320909C6F86CBL ^ 0x4DA320909C6F86CBL);
                                                                    continue;
                                                                }
                                                                int cfr_ignored_45 = (Integer.rotateRight(0xC3B00496 ^ n4, 11) - -1230099099) * -1011874665;
                                                                try {
                                                                    n5 = 1164791429 + n4 ^ 0x9FA78242 ^ 0x9FA78242;
                                                                }
                                                                catch (ArithmeticException arithmeticException) {
                                                                    n5 = 1164791429 + n4 ^ 0xC306F072 ^ 0xC306F072;
                                                                }
                                                                n3 += 5;
                                                                continue;
                                                            }
                                                            int cfr_ignored_46 = (Integer.rotateLeft(0x8970A2B5 ^ n4, 4) - -1459530970) * -1989107019;
                                                            int cfr_ignored_47 = (int)(0x4BC20C8827D4EB4FL ^ (long)n4 ^ 0xE460831A2DB93A55L);
                                                            n5 = -1947125878 + n4;
                                                            int cfr_ignored_48 = (Integer.rotateLeft(0x5057D45D ^ n4, 13) - -1090496898) * 1347933277;
                                                            int cfr_ignored_49 = (int)(0x92E57A6027D4EB4FL ^ (long)n4 ^ 0x9B0831A2DB8881BL);
                                                            n5 = Integer.reverse(Integer.reverse(562941488 + n4));
                                                            int cfr_ignored_50 = (Integer.rotateRight(0x201DF0D7 ^ n4, 7) - -402798268) * 538833111;
                                                            n5 = 1164791429 + n4 ^ 0xEC8673D3 ^ 0xEC8673D3;
                                                            continue;
                                                        }
                                                        int cfr_ignored_51 = Integer.rotateLeft(0xB87F096D ^ n4, 10) - 1539294062;
                                                        int cfr_ignored_52 = (int)(0x7ACDA75027D4EB4FL ^ (long)n4 ^ 0xB3D0831A2DB9584AL);
                                                        n5 = -861042 + n4 ^ 0xEE3B5AE3 ^ 0xEE3B5AE3;
                                                        int cfr_ignored_53 = (Integer.rotateRight(0x8F92E8B7 ^ n4, 4) - 1730661732) * -1886197577;
                                                        int cfr_ignored_54 = (int)(0x5FB7C68532AF66BCL ^ (long)n4 ^ 0x707AA9ED365F12BEL);
                                                        n5 = (int)((long)(1164791429 + n4) ^ 0x2D4DC8BA7AB0D61L ^ 0x2D4DC8BA7AB0D61L);
                                                        continue;
                                                    }
                                                    int cfr_ignored_55 = Integer.rotateLeft(0x9100EC80 ^ n4, 5) + -1820704069;
                                                    n5 = 39814810 + n4 ^ 0x15755098 ^ 0x15755098;
                                                    int cfr_ignored_56 = (Integer.rotateRight(0x71B9A09E ^ n4, 17) - -908586403) * 1907990687;
                                                    n5 = 1164791429 + n4;
                                                    n3 -= 3;
                                                    continue;
                                                }
                                                int cfr_ignored_57 = Integer.rotateRight(0x6C55FF66 ^ n4, 16) - 583502997;
                                                n5 = Integer.reverse(Integer.reverse(-1177790370 + n4));
                                                int cfr_ignored_58 = (Integer.rotateRight(0x71F6CFA ^ n4, 3) + -517222015) * 119500027;
                                                n5 = 454391541 + n4 ^ 0x90A0CEA3 ^ 0x90A0CEA3;
                                                int cfr_ignored_59 = (Integer.rotateRight(0xFB348B9A ^ n4, 18) + 1874495201) * -80442469;
                                                n5 = 1164791429 + n4;
                                                n3 += 3;
                                                continue;
                                            }
                                            int cfr_ignored_60 = (Integer.rotateLeft(0x747C0E3C ^ n4, 17) - 526604415) * 1954287165;
                                            n5 = -438271572 + n4;
                                            int cfr_ignored_61 = (Integer.rotateRight(0x67A3B1DF ^ n4, 15) - -1859114692) * 1738781151;
                                            n5 = 1243022156 + n4;
                                            int cfr_ignored_62 = Integer.rotateRight(0xBA0C0FAB ^ n4, 10) + -1949072144;
                                            n5 = 1164791429 + n4 ^ 0x1FEA57CC ^ 0x1FEA57CC;
                                            n3 -= 3;
                                            continue;
                                        }
                                        int cfr_ignored_63 = Integer.rotateLeft(0xB9841544 ^ n4, 10) - 2069639799;
                                        n5 = 1164791429 + n4;
                                        int cfr_ignored_64 = (Integer.rotateRight(0x5CCA7357 ^ n4, 14) - 1088526020) * 1556771671;
                                        n3 += 3;
                                        continue;
                                    }
                                    int cfr_ignored_65 = Integer.rotateRight(0x48810C23 ^ n4, 12) + -872540296;
                                    n5 = -1870258702 + n4;
                                    int cfr_ignored_66 = (Integer.rotateRight(0x2193F01E ^ n4, 7) - 357020381) * 563343391;
                                    n5 = Integer.reverse(Integer.reverse(1164791429 + n4));
                                    n3 += 5;
                                    continue;
                                }
                                int cfr_ignored_67 = (Integer.rotateRight(0x9BED11B ^ n4, 4) + 846786944) * 163500315;
                                try {
                                    if ((0xC399F54C1B80C629L ^ (long)n4 | 1L) == 0L) {
                                        throw new ArithmeticException();
                                    }
                                    n5 = (int)((long)(1164791429 + n4) ^ 0x2DE883B68F9F63F5L ^ 0x2DE883B68F9F63F5L);
                                }
                                catch (ArithmeticException arithmeticException) {
                                    n5 = 1164791429 + n4 + 607651051 - 607651051;
                                }
                                n3 += 4;
                                continue;
                            }
                            int cfr_ignored_68 = (Integer.rotateRight(0xB0EE351B ^ n4, 9) + 1899367808) * -1326566117;
                            n5 = (int)((long)(-376447162 + n4) ^ 0x1DE7F196B11A484DL ^ 0x1DE7F196B11A484DL);
                            int cfr_ignored_69 = Integer.rotateLeft(0xD5947B25 ^ n4, 13) - -514291530;
                            int cfr_ignored_70 = (int)(0x1726D51827D4EB4FL ^ (long)n4 ^ 0x5740831A2DB9839CL);
                            n5 = 1164791429 + n4 ^ 0x81A02197 ^ 0x81A02197;
                            n3 += 4;
                            continue;
                        }
                        int cfr_ignored_71 = (Integer.rotateLeft(0x6A52E558 ^ n4, 16) + -462986013) * 1783817561;
                        n5 = Integer.reverse(Integer.reverse(1164791429 + n4));
                        int cfr_ignored_72 = (Integer.rotateLeft(0xA5D4B950 ^ n4, 7) + 421531627) * -1512785583;
                        n3 += 3;
                        continue;
                    }
                    int cfr_ignored_73 = Integer.rotateLeft(0x44894925 ^ n4, 11) - 1358789302;
                    int cfr_ignored_74 = (int)(0x863BE71827D4EB4FL ^ (long)n4 ^ 0x3340831A2DB8A1A6L);
                    try {
                        n3 += 4;
                        if ((0x4C3D4769A1E2F5CFL ^ (long)n4 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n5 = 1164791429 + n4 + 474080902 - 474080902;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n5 = Integer.reverse(Integer.reverse(1164791429 + n4));
                    }
                    ++n3;
                    continue;
                }
                return bl;
            }
            int cfr_ignored_75 = (Integer.rotateRight(0x768E523A ^ n4, 17) + 1603900481) * 1989038651;
            int cfr_ignored_76 = (Integer.rotateRight(0xDFD60553 ^ n4, 14) + 524829768) * -539622061;
            n5 = (int)((long)(1164791429 + n4) ^ 0x8AAAC2E7DE7AA47L ^ 0x8AAAC2E7DE7AA47L);
        }
    }

    private static int ghzj(String string) {
        block0: {
            int n = qs_2.shd_3(-627530220);
            int n2 = n ^ 0x4832EBCD;
            if ((n2 ^ n) == 1211296717) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x92AA4DD9 ^ n, 5) + -956494718) * -1834332711;
            int cfr_ignored_1 = (int)(0x5018E3E427D4EB4FL ^ (long)n ^ 0x3AB8831A2DB90DE0L);
        }
        return string.length();
    }

    private static String[] ghbb(String string) {
        block0: {
            int n = qs_2.shd_3(1385496859);
            int n2 = n ^ 0xCD759BAB;
            if ((n2 ^ n) == -847930453) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x9FE09AB0 ^ n, 6) + 1620073099) * -1612670287;
        }
        return string.split("\u0005\u0017", -1);
    }

    private static CallSite tak_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1014643552;
            n3 = Integer.rotateLeft(n3 * 1812733495, 6) ^ 0xD80CF668;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            String string4 = string2;
            n3 = (string4 != null ? System.identityHashCode(string4) : 0) ^ n3;
            int n4 = n3 ^ 0x948407B7;
            if ((n4 ^ n3) != -1803286601) {
                int cfr_ignored_0 = (0xA8FE3CD7 ^ n3) + 175428988;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dsh_7 ^ string.hashCode()) + (n2 + shyj) + i ^ dsh_7, 28) + shyj);
            }
            String[] stringArray = bhd_4.ghbb(new String(cArray));
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

    private static String[] nmpjukif(String string) {
        return string.split("\u0005\u0014", -1);
    }

    private static CallSite s7wbp30yy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dlgn4dm4s8y8d ^ string.hashCode() ^ n2 + n7i40fq ^ i * 847741967 ^ dlgn4dm4s8y8d, 14) ^ n7i40fq));
            }
            String[] stringArray = bhd_4.nmpjukif(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

