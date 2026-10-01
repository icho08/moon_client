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
import us.m0vy.moondlc.m0vyguard.tthb;
import us.m0vy.moondlc.m0vyguard.yf;

public abstract class bma {
    private final String tdh_8;
    protected final int khghgh;
    private static final int dkhth = -1421210192;
    private static final int thsh_4 = 1877767293;
    private static final int o2zsgeobgjtrt = 1834353495;
    private static final int azztk9nq6 = 190515930;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int a0gvca8z;

    public bma(String string, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The number of function arguments can not be less than 0 for '" + string + "'");
        }
        if (!bma.dhha_2(string)) {
            throw new IllegalArgumentException("The function name '" + string + "' is invalid");
        }
        this.tdh_8 = string;
        this.khghgh = n;
    }

    public bma(String string) {
        this(string, 1);
    }

    public String getName() {
        block0: {
            int n = -898498632;
            int n2 = (n = Integer.rotateLeft(n * 701224547, 8) ^ 0xA807016C) ^ 0x2A10034A;
            if ((n2 ^ n) == 705692490) break block0;
            int cfr_ignored_0 = (0xE061FCF2 ^ n) - -1939717664;
        }
        return this.tdh_8;
    }

    public int taf_3() {
        block0: {
            int n = -1854076690;
            n = Integer.rotateLeft(n * -1969527693, 28) ^ 0x2B4A0666;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x20224988;
            if ((n2 ^ n) == 539117960) break block0;
            int cfr_ignored_0 = (0xB15F4166 ^ n) + 966168766;
        }
        return this.khghgh;
    }

    public abstract double bay(double ... var1);

    @Deprecated(since="0.4.5")
    public static char[] gha_2() {
        int n;
        try {
            int n2 = 255976022;
            n2 = Integer.rotateLeft(n2 * 1139003465, 26) ^ 0x9A8AC45E;
            int n3 = n2 ^ 0x676776C4;
            if ((n3 ^ n2) != 1734833860) {
                int cfr_ignored_0 = (0x68269492 ^ n2) - -825006162;
            }
            if ((0x13D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = new char[729744187 - 729744134];
        int n4 = 0;
        for (n = 1101878253 - 1101878188; n < (0x7B80D175 ^ 0x7B80D12E); ++n) {
            cArray[n4++] = (char)n;
        }
        for (n = Integer.reverse(-1697099417) ^ 0xE68A1B38; n < -1527202052 + 1527202175; ++n) {
            cArray[n4++] = (char)n;
        }
        cArray[n4] = bma.dww_2(0xDFCEB584 ^ 0xDFC55584, 19);
        return cArray;
    }

    public static boolean dhha_2(String string) {
        int n = 0;
        int n2 = 0;
        char c = '\u0000';
        boolean bl = false;
        int n3 = 0;
        int n4 = -79045988;
        n4 = Integer.rotateLeft(n4 * 1544212429, 24) ^ 0x213E55D6;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = n4 - -386113518 ^ 0x335B2231 ^ 0x335B2231;
        while (true) {
            block52: {
                block87: {
                    block49: {
                        block81: {
                            block88: {
                                block61: {
                                    block84: {
                                        block75: {
                                            block62: {
                                                block56: {
                                                    block57: {
                                                        block89: {
                                                            block68: {
                                                                block86: {
                                                                    block60: {
                                                                        block67: {
                                                                            block72: {
                                                                                block54: {
                                                                                    block82: {
                                                                                        block73: {
                                                                                            block50: {
                                                                                                block51: {
                                                                                                    block71: {
                                                                                                        block65: {
                                                                                                            block78: {
                                                                                                                block76: {
                                                                                                                    block83: {
                                                                                                                        block66: {
                                                                                                                            block63: {
                                                                                                                                block55: {
                                                                                                                                    block77: {
                                                                                                                                        block85: {
                                                                                                                                            block79: {
                                                                                                                                                block80: {
                                                                                                                                                    block69: {
                                                                                                                                                        block74: {
                                                                                                                                                            block70: {
                                                                                                                                                                block46: {
                                                                                                                                                                    block64: {
                                                                                                                                                                        block58: {
                                                                                                                                                                            block59: {
                                                                                                                                                                                block47: {
                                                                                                                                                                                    block53: {
                                                                                                                                                                                        block48: {
                                                                                                                                                                                            if ((n3 = n4 - n5) > 6238261) break block46;
                                                                                                                                                                                            if (n3 > -1232617006) break block47;
                                                                                                                                                                                            if (n3 > -1663219465) break block48;
                                                                                                                                                                                            if (n3 == -1785317996) break block49;
                                                                                                                                                                                            if (n3 == -1704044447) break block50;
                                                                                                                                                                                            int cfr_ignored_0 = (Integer.rotateRight(0xA06A4FBE ^ n4, 7) - 1899841341) * -1603645505;
                                                                                                                                                                                            if (n3 == -1663219465) break block51;
                                                                                                                                                                                            break block52;
                                                                                                                                                                                        }
                                                                                                                                                                                        if (n3 > -1485264790) break block53;
                                                                                                                                                                                        if (n3 == -1513552327) break block54;
                                                                                                                                                                                        if (n3 == -1485264790) break block55;
                                                                                                                                                                                        break block52;
                                                                                                                                                                                    }
                                                                                                                                                                                    if (n3 == -1367454618) break block56;
                                                                                                                                                                                    if (n3 == -1232617006) break block57;
                                                                                                                                                                                    int cfr_ignored_1 = Integer.rotateLeft(0x3BE9C3A0 ^ n4, 10) + 1168920475;
                                                                                                                                                                                    break block52;
                                                                                                                                                                                }
                                                                                                                                                                                if (n3 > -589803845) break block58;
                                                                                                                                                                                if (n3 > -815397898) break block59;
                                                                                                                                                                                if (n3 == -1060720563) break block60;
                                                                                                                                                                                if (n3 == -815397898) break block61;
                                                                                                                                                                                break block52;
                                                                                                                                                                            }
                                                                                                                                                                            if (n3 == -709845930) break block62;
                                                                                                                                                                            if (n3 == -589803845) break block63;
                                                                                                                                                                            int cfr_ignored_2 = (Integer.rotateLeft(0x9B3C263D ^ n4, 6) - -794410850) * -1690556867;
                                                                                                                                                                            int cfr_ignored_3 = (int)(0x598E880027D4EB4FL ^ (long)n4 ^ 0xED70831A2DB91ECCL);
                                                                                                                                                                            break block52;
                                                                                                                                                                        }
                                                                                                                                                                        if (n3 > -251232995) break block64;
                                                                                                                                                                        if (n3 == -386113518) break block65;
                                                                                                                                                                        if (n3 == -251232995) break block66;
                                                                                                                                                                        int cfr_ignored_4 = Integer.rotateLeft(0x4FD6E405 ^ n4, 12) - -1352451114;
                                                                                                                                                                        int cfr_ignored_5 = (int)(0x8D644A3827D4EB4FL ^ (long)n4 ^ 0x6900831A2DB8B719L);
                                                                                                                                                                        break block52;
                                                                                                                                                                    }
                                                                                                                                                                    if (n3 == 2397804) break block67;
                                                                                                                                                                    if (n3 == 6238261) break block68;
                                                                                                                                                                    int cfr_ignored_6 = Integer.rotateRight(0xAA45B5E3 ^ n4, 8) + -1563515464;
                                                                                                                                                                    break block52;
                                                                                                                                                                }
                                                                                                                                                                if (n3 > 1214275953) break block69;
                                                                                                                                                                if (n3 > 634423270) break block70;
                                                                                                                                                                if (n3 == 298116150) break block71;
                                                                                                                                                                if (n3 == 360073200) break block72;
                                                                                                                                                                if (n3 == 634423270) break block73;
                                                                                                                                                                break block52;
                                                                                                                                                            }
                                                                                                                                                            if (n3 > 976569026) break block74;
                                                                                                                                                            if (n3 == 915308354) break block75;
                                                                                                                                                            if (n3 == 976569026) break block76;
                                                                                                                                                            break block52;
                                                                                                                                                        }
                                                                                                                                                        if (n3 == 1180818731) break block77;
                                                                                                                                                        if (n3 == 1214275953) break block78;
                                                                                                                                                        break block52;
                                                                                                                                                    }
                                                                                                                                                    if (n3 > 1698782937) break block79;
                                                                                                                                                    if (n3 > 1641836661) break block80;
                                                                                                                                                    if (n3 == 1403918281) break block81;
                                                                                                                                                    if (n3 == 1641836661) break block82;
                                                                                                                                                    int cfr_ignored_7 = (Integer.rotateLeft(0x7041D83D ^ n4, 17) - -1672032610) * 1883363389;
                                                                                                                                                    int cfr_ignored_8 = (int)(0xB2F3760027D4EB4FL ^ (long)n4 ^ 0x1170831A2DB8C837L);
                                                                                                                                                    break block52;
                                                                                                                                                }
                                                                                                                                                if (n3 == 1680612440) break block83;
                                                                                                                                                if (n3 == 1698782937) break block84;
                                                                                                                                                int cfr_ignored_9 = Integer.rotateLeft(0x31C8D080 ^ n4, 9) + 196009659;
                                                                                                                                                break block52;
                                                                                                                                            }
                                                                                                                                            if (n3 > 1871451456) break block85;
                                                                                                                                            if (n3 == 1778257441) break block86;
                                                                                                                                            if (n3 == 1871451456) break block87;
                                                                                                                                            break block52;
                                                                                                                                        }
                                                                                                                                        if (n3 == 1999491360) break block88;
                                                                                                                                        if (n3 == 2146766142) break block89;
                                                                                                                                        break block52;
                                                                                                                                    }
                                                                                                                                    int cfr_ignored_10 = (Integer.rotateRight(0xEFF1335F ^ n4, 16) - 311613372) * -269405345;
                                                                                                                                    bl = false;
                                                                                                                                    try {
                                                                                                                                        n3 += 4;
                                                                                                                                        if ((0xB6CE181E0B5CE441L ^ (long)n4 | 1L) == 0L) {
                                                                                                                                            throw new IllegalStateException();
                                                                                                                                        }
                                                                                                                                        n5 = n4 - 1871451456 ^ 0xC4D115DD ^ 0xC4D115DD;
                                                                                                                                    }
                                                                                                                                    catch (IllegalStateException illegalStateException) {
                                                                                                                                        n5 = Integer.reverse(Integer.reverse(n4 - 1871451456));
                                                                                                                                    }
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                int cfr_ignored_11 = (Integer.rotateRight(0xF22C0FA ^ n4, 4) + -644678271) * 253935867;
                                                                                                                                c = bma.dhssh(string, n2);
                                                                                                                                if (bma.shshw(c)) {
                                                                                                                                    n5 = n4 - 744170183 + -1946728905 - -1946728905;
                                                                                                                                    int cfr_ignored_12 = Integer.rotateLeft(0xFAAA87A4 ^ n4, 18) - 1594100759;
                                                                                                                                    n5 = (int)((long)(n4 - 298116150) ^ 0x9322DB1D0384E165L ^ 0x9322DB1D0384E165L);
                                                                                                                                    n3 -= 2;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                n5 = Integer.reverse(Integer.reverse(n4 - 976569026));
                                                                                                                                int cfr_ignored_13 = (Integer.rotateLeft(0xED663E79 ^ n4, 16) + -1010880542) * -312066439;
                                                                                                                                int cfr_ignored_14 = (int)(0x2FD4904427D4EB4FL ^ (long)n4 ^ 0xDDF8831A2DB9F278L);
                                                                                                                                n3 += 3;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            int cfr_ignored_15 = Integer.rotateLeft(0x7C7BC7A0 ^ n4, 18) + 391826331;
                                                                                                                            c = bma.dhssh(string, n2);
                                                                                                                            if (bma.shshw(c)) {
                                                                                                                                int cfr_ignored_16 = (int)(0xCFAF95F8969BC201L ^ (long)n4 ^ 0xD681E1847F24328EL);
                                                                                                                                n5 = n4 - 298116150;
                                                                                                                                ++n3;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            int cfr_ignored_17 = (int)(0x7F0F9F0BB0AFD8B3L ^ (long)n4 ^ 0xC367ADEC4A4153CEL);
                                                                                                                            n5 = n4 - 976569026 + 1307467553 - 1307467553;
                                                                                                                            ++n3;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        int cfr_ignored_18 = (Integer.rotateRight(0xD01F3F3 ^ n4, 4) + -1751504472) * 218231795;
                                                                                                                        bl = true;
                                                                                                                        try {
                                                                                                                            n5 = n4 - 1871451456 ^ 0x9DCACF35 ^ 0x9DCACF35;
                                                                                                                        }
                                                                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                            n5 = (int)((long)(n4 - 1871451456) ^ 0x42A943D94D1EE5F6L ^ 0x42A943D94D1EE5F6L);
                                                                                                                        }
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    int cfr_ignored_19 = Integer.rotateLeft(0xE99DCF0D ^ n4, 16) - 1316598222;
                                                                                                                    int cfr_ignored_20 = (int)(0x2B2F613027D4EB4FL ^ (long)n4 ^ 0x3F10831A2DB9FB8FL);
                                                                                                                    bl = false;
                                                                                                                    try {
                                                                                                                        n3 += 5;
                                                                                                                        if ((0x6DE02C7F59711855L ^ (long)n4 | 1L) == 0L) {
                                                                                                                            throw new IllegalArgumentException();
                                                                                                                        }
                                                                                                                        n5 = Integer.reverse(Integer.reverse(n4 - 1871451456));
                                                                                                                    }
                                                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                        n5 = (int)((long)(n4 - 1871451456) ^ 0x9F813D54ACC79DE1L ^ 0x9F813D54ACC79DE1L);
                                                                                                                    }
                                                                                                                    n3 -= 2;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                int cfr_ignored_21 = Integer.rotateLeft(0xAD2256E0 ^ n4, 8) + -75094949;
                                                                                                                if (c != 2065948552 - 2065948457) {
                                                                                                                    n5 = (int)((long)(n4 - -1423552402) ^ 0x64E175FE3871328L ^ 0x64E175FE3871328L);
                                                                                                                    int cfr_ignored_22 = Integer.rotateLeft(0x74CEFF00 ^ n4, 17) + 695107643;
                                                                                                                    n5 = n4 - -1704044447;
                                                                                                                    n3 -= 4;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                int cfr_ignored_23 = (int)(0x93E942457DD79E37L ^ (long)n4 ^ 0x79FA371CC7488A03L);
                                                                                                                n5 = n4 - 298116150;
                                                                                                                ++n3;
                                                                                                                continue;
                                                                                                            }
                                                                                                            int cfr_ignored_24 = Integer.rotateRight(0x9ED015EA ^ n4, 6) + 1066419857;
                                                                                                            n2 = 0;
                                                                                                            n5 = (int)((long)(n4 - 1641836661) ^ 0xD7C9BC3277E71E9EL ^ 0xD7C9BC3277E71E9EL);
                                                                                                            int cfr_ignored_25 = Integer.rotateLeft(0x778363C8 ^ n4, 17) + 2101785715;
                                                                                                            n3 += 4;
                                                                                                            continue;
                                                                                                        }
                                                                                                        int cfr_ignored_26 = (Integer.rotateLeft(0xC25C190 ^ n4, 4) + 2096107435) * 203800977;
                                                                                                        if (string != null) {
                                                                                                            try {
                                                                                                                n3 -= 2;
                                                                                                                if ((0xBC2EC417A3B34073L ^ (long)n4 | 1L) == 0L) {
                                                                                                                    throw new IllegalStateException();
                                                                                                                }
                                                                                                                n5 = (int)((long)(n4 - -1663219465) ^ 0xD6FFA4EF6859A807L ^ 0xD6FFA4EF6859A807L);
                                                                                                            }
                                                                                                            catch (IllegalStateException illegalStateException) {
                                                                                                                n5 = Integer.reverse(Integer.reverse(n4 - -1663219465));
                                                                                                            }
                                                                                                            n3 -= 4;
                                                                                                            continue;
                                                                                                        }
                                                                                                        try {
                                                                                                            if ((0xFA8C799DC4450B3BL ^ (long)n4 | 1L) == 0L) {
                                                                                                                throw new IllegalArgumentException();
                                                                                                            }
                                                                                                            n5 = (int)((long)(n4 - 1680612440) ^ 0xD2CE1197284C3350L ^ 0xD2CE1197284C3350L);
                                                                                                        }
                                                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                                                            n5 = (int)((long)(n4 - 1680612440) ^ 0x752CFC080B2F16D3L ^ 0x752CFC080B2F16D3L);
                                                                                                        }
                                                                                                        n3 -= 2;
                                                                                                        continue;
                                                                                                    }
                                                                                                    int cfr_ignored_27 = (Integer.rotateRight(0xA9952716 ^ n4, 8) - -1922213147) * -1449842921;
                                                                                                    ++n2;
                                                                                                    try {
                                                                                                        n3 -= 5;
                                                                                                        n5 = n4 - 1641836661 ^ 0x2FFB6657 ^ 0x2FFB6657;
                                                                                                    }
                                                                                                    catch (NoSuchElementException noSuchElementException) {
                                                                                                        n5 = n4 - 1641836661;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_28 = (Integer.rotateLeft(0xA267D69C ^ n4, 7) - -1359963105) * -1570253155;
                                                                                                n = string.length();
                                                                                                if (n == 0) {
                                                                                                    try {
                                                                                                        --n3;
                                                                                                        if ((0x7C497A3DB733CD25L ^ (long)n4 | 1L) == 0L) {
                                                                                                            throw new IllegalArgumentException();
                                                                                                        }
                                                                                                        n5 = (int)((long)(n4 - 634423270) ^ 0x2120A185B61E8331L ^ 0x2120A185B61E8331L);
                                                                                                    }
                                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                                        n5 = Integer.reverse(Integer.reverse(n4 - 634423270));
                                                                                                    }
                                                                                                    n3 += 3;
                                                                                                    continue;
                                                                                                }
                                                                                                n5 = n4 - 1214275953;
                                                                                                n3 += 4;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_29 = (Integer.rotateLeft(0x27DDE1D4 ^ n4, 7) - -667158553) * 668852693;
                                                                                            if (!Character.isDigit(c)) {
                                                                                                try {
                                                                                                    n5 = n4 - 1180818731 ^ 0x9FCDB6FD ^ 0x9FCDB6FD;
                                                                                                }
                                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                                    n5 = Integer.reverse(Integer.reverse(n4 - 1180818731));
                                                                                                }
                                                                                                continue;
                                                                                            }
                                                                                            n5 = Integer.reverse(Integer.reverse(n4 - -786651075));
                                                                                            int cfr_ignored_30 = Integer.rotateRight(0xB415AA07 ^ n4, 9) - -755157484;
                                                                                            n5 = n4 - -1513552327 ^ 0x30212CC0 ^ 0x30212CC0;
                                                                                            --n3;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_31 = (Integer.rotateRight(0x78C26FB2 ^ n4, 18) + -1545001527) * 2026008499;
                                                                                        bl = false;
                                                                                        n5 = n4 - 1871451456 + 1590878929 - 1590878929;
                                                                                        int cfr_ignored_32 = (Integer.rotateLeft(0x7C91369C ^ n4, 18) - 435371039) * 2089891485;
                                                                                        n3 += 2;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_33 = (Integer.rotateRight(0x4FEF73BF ^ n4, 12) - -1302551716) * 1341092799;
                                                                                    if (n2 < n) {
                                                                                        n5 = Integer.reverse(Integer.reverse(n4 - -1485264790));
                                                                                        continue;
                                                                                    }
                                                                                    try {
                                                                                        n3 -= 5;
                                                                                        if ((0xE74B7506C6DCBB9BL ^ (long)n4 | 1L) == 0L) {
                                                                                            throw new IllegalStateException();
                                                                                        }
                                                                                        n5 = (int)((long)(n4 - -251232995) ^ 0xF1AC40754484091AL ^ 0xF1AC40754484091AL);
                                                                                    }
                                                                                    catch (IllegalStateException illegalStateException) {
                                                                                        n5 = (int)((long)(n4 - -251232995) ^ 0x5F21E6A0972CC537L ^ 0x5F21E6A0972CC537L);
                                                                                    }
                                                                                    n3 -= 4;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_34 = Integer.rotateLeft(0x4217B725 ^ n4, 11) - 87870646;
                                                                                int cfr_ignored_35 = (int)(0x80A5191827D4EB4FL ^ (long)n4 ^ 0xCF40831A2DB8AC9BL);
                                                                                if (n2 > 0) {
                                                                                    int cfr_ignored_36 = (int)(0x6FBB5F923103B9E2L ^ (long)n4 ^ 0x4254AEB488E372A7L);
                                                                                    n5 = (int)((long)(n4 - 298116150) ^ 0xB1A78CB0B063FE9CL ^ 0xB1A78CB0B063FE9CL);
                                                                                    n3 -= 2;
                                                                                    continue;
                                                                                }
                                                                                try {
                                                                                    n3 -= 4;
                                                                                    n5 = n4 - 1180818731;
                                                                                }
                                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                    n5 = n4 - 1180818731 ^ 0x681FEEE0 ^ 0x681FEEE0;
                                                                                }
                                                                                n3 += 5;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_37 = Integer.rotateRight(0x2E35E782 ^ n4, 8) + -1662736391;
                                                                            n5 = n4 - -640724493 ^ 0x82C866A3 ^ 0x82C866A3;
                                                                            int cfr_ignored_38 = (Integer.rotateRight(0x408D6072 ^ n4, 11) + -713274103) * 1083007091;
                                                                            n5 = n4 - -386113518 ^ 0xCC8FA85D ^ 0xCC8FA85D;
                                                                            n3 += 5;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_39 = Integer.rotateLeft(0x34D9A4C8 ^ n4, 9) + 1790481267;
                                                                        try {
                                                                            n3 += 3;
                                                                            n5 = Integer.reverse(Integer.reverse(n4 - -386113518));
                                                                        }
                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                            n5 = Integer.reverse(Integer.reverse(n4 - -386113518));
                                                                        }
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_40 = (Integer.rotateLeft(0x93A8C114 ^ n4, 5) - -439549785) * -1817657067;
                                                                    n5 = Integer.reverse(Integer.reverse(n4 - -1952407004));
                                                                    int cfr_ignored_41 = (Integer.rotateLeft(0xF1CFB61C ^ n4, 17) - 1283763359) * -238045667;
                                                                    n5 = n4 - 1242390482;
                                                                    int cfr_ignored_42 = (Integer.rotateLeft(0x95FEE2D8 ^ n4, 5) + 775624547) * -1778457895;
                                                                    n5 = n4 - -386113518;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_43 = (Integer.rotateRight(0x21C772F6 ^ n4, 7) - 461671173) * 566719223;
                                                                n5 = n4 - -1827602828 ^ 0xB0693340 ^ 0xB0693340;
                                                                int cfr_ignored_44 = (Integer.rotateLeft(0xF7A58439 ^ n4, 17) + 23634466) * -140147655;
                                                                int cfr_ignored_45 = (int)(0x35172A0427D4EB4FL ^ (long)n4 ^ 0xA978831A2DB9C7FFL);
                                                                n5 = n4 - 1633075742;
                                                                int cfr_ignored_46 = Integer.rotateLeft(0x4814A189 ^ n4, 12) + -1092800814;
                                                                int cfr_ignored_47 = (int)(0x8AA60FB427D4EB4FL ^ (long)n4 ^ 0xE218831A2DB8B89DL);
                                                                n5 = (int)((long)(n4 - -386113518) ^ 0x78964228A9B0EFFL ^ 0x78964228A9B0EFFL);
                                                                n3 -= 4;
                                                                continue;
                                                            }
                                                            int cfr_ignored_48 = Integer.rotateLeft(0x68249DC8 ^ n4, 16) + -1597195661;
                                                            n5 = n4 - 1055862750;
                                                            int cfr_ignored_49 = Integer.rotateLeft(0xB3468C0D ^ n4, 9) - -1175939890;
                                                            int cfr_ignored_50 = (int)(0x71F4223027D4EB4FL ^ (long)n4 ^ 0xB910831A2DB94E39L);
                                                            int cfr_ignored_51 = (int)(0x76C8E73A06B5E46L ^ (long)n4 ^ 0xE1978C6547ABA308L);
                                                            n5 = n4 - -386113518;
                                                            n3 -= 2;
                                                            continue;
                                                        }
                                                        int cfr_ignored_52 = (Integer.rotateRight(0xF6180816 ^ n4, 17) - -783902235) * -166197225;
                                                        n5 = Integer.reverse(Integer.reverse(n4 - -756083184));
                                                        int cfr_ignored_53 = Integer.rotateLeft(0x571A77C5 ^ n4, 13) - -1869471722;
                                                        int cfr_ignored_54 = (int)(0x95A8D9F827D4EB4FL ^ (long)n4 ^ 0x4E80831A2DB88680L);
                                                        try {
                                                            n3 -= 5;
                                                            if ((0xCE000C7B67EE0993L ^ (long)n4 | 1L) == 0L) {
                                                                throw new ArithmeticException();
                                                            }
                                                            n5 = Integer.reverse(Integer.reverse(n4 - -386113518));
                                                        }
                                                        catch (ArithmeticException arithmeticException) {
                                                            n5 = n4 - -386113518;
                                                        }
                                                        continue;
                                                    }
                                                    int cfr_ignored_55 = (Integer.rotateLeft(0x7AE439 ^ n4, 3) + 322912802) * 8053817;
                                                    int cfr_ignored_56 = (int)(0xC2C84A0427D4EB4FL ^ (long)n4 ^ 0x6978831A2DB82841L);
                                                    n5 = (int)((long)(n4 - 954682758) ^ 0x4547BC95FCC573E8L ^ 0x4547BC95FCC573E8L);
                                                    int cfr_ignored_57 = (Integer.rotateRight(0xDF98461E ^ n4, 14) - 399383773) * -543668705;
                                                    int cfr_ignored_58 = (int)(0x7AF42E353AFEA953L ^ (long)n4 ^ 0xA11AB94EA9815839L);
                                                    n5 = Integer.reverse(Integer.reverse(n4 - 831875322));
                                                    int cfr_ignored_59 = (int)(0x4BB8F815F13A5BBAL ^ (long)n4 ^ 0xD5B2EC74C533AA0L);
                                                    n5 = n4 - -386113518 + -431545224 - -431545224;
                                                    n3 += 5;
                                                    continue;
                                                }
                                                int cfr_ignored_60 = (Integer.rotateLeft(0x8963BBF8 ^ n4, 4) + -1485741501) * -1989952519;
                                                try {
                                                    n3 -= 4;
                                                    if ((0x1EC62009B6B53231L ^ (long)n4 | 1L) == 0L) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    n5 = n4 - -386113518 ^ 0x9E292E7C ^ 0x9E292E7C;
                                                }
                                                catch (NoSuchElementException noSuchElementException) {
                                                    n5 = n4 - -386113518 + 1149384549 - 1149384549;
                                                }
                                                ++n3;
                                                continue;
                                            }
                                            int cfr_ignored_61 = Integer.rotateLeft(0x1A86FA8C ^ n4, 6) - 985003567;
                                            n5 = Integer.reverse(Integer.reverse(n4 - -386113518));
                                            int cfr_ignored_62 = (Integer.rotateLeft(0xA9B50099 ^ n4, 8) + -1857506878) * -1447755623;
                                            int cfr_ignored_63 = (int)(0x6B07AEA427D4EB4FL ^ (long)n4 ^ 0xA038831A2DB97BDEL);
                                            n3 -= 4;
                                            continue;
                                        }
                                        int cfr_ignored_64 = (Integer.rotateRight(0xBB83981E ^ n4, 10) - -1186133283) * -1149003745;
                                        int cfr_ignored_65 = (int)(0x8F87EF533235350BL ^ (long)n4 ^ 0x23D6A8D99130B2DEL);
                                        n5 = Integer.reverse(Integer.reverse(n4 - -386113518));
                                        --n3;
                                        continue;
                                    }
                                    int cfr_ignored_66 = (Integer.rotateLeft(0x16878991 ^ n4, 5) + -1094236214) * 377981329;
                                    int cfr_ignored_67 = (int)(0xD43527AC27D4EB4FL ^ (long)n4 ^ 0xB228831A2DB805BBL);
                                    n5 = n4 - 1328074617 + -1063743125 - -1063743125;
                                    int cfr_ignored_68 = Integer.rotateRight(0x1AE06787 ^ n4, 6) - 1166682260;
                                    try {
                                        n3 += 2;
                                        if ((0x7F750161CE4B9121L ^ (long)n4 | 1L) == 0L) {
                                            throw new NoSuchElementException();
                                        }
                                        n5 = Integer.reverse(Integer.reverse(n4 - -386113518));
                                    }
                                    catch (NoSuchElementException noSuchElementException) {
                                        n5 = (int)((long)(n4 - -386113518) ^ 0xF2FD5589E25F7092L ^ 0xF2FD5589E25F7092L);
                                    }
                                    n3 += 4;
                                    continue;
                                }
                                int cfr_ignored_69 = (Integer.rotateRight(0x1FA5EB3E ^ n4, 6) - -646636611) * 530967359;
                                n5 = Integer.reverse(Integer.reverse(n4 - -386113518));
                                n3 += 5;
                                continue;
                            }
                            int cfr_ignored_70 = Integer.rotateLeft(0x91824460 ^ n4, 5) + -1557928229;
                            n5 = n4 - -1595047419 ^ 0x1CB1EA06 ^ 0x1CB1EA06;
                            int cfr_ignored_71 = (Integer.rotateLeft(0xA31A36D9 ^ n4, 7) + -997571710) * -1558563111;
                            int cfr_ignored_72 = (int)(0x61A898E427D4EB4FL ^ (long)n4 ^ 0xCCB8831A2DB96E80L);
                            int cfr_ignored_73 = (int)(0x51F169D5C7A4A5F0L ^ (long)n4 ^ 0x2EDB43FAB0C70E33L);
                            n5 = (int)((long)(n4 - 197193470) ^ 0x6DCC265B35C5D44CL ^ 0x6DCC265B35C5D44CL);
                            int cfr_ignored_74 = (int)(0xEF01BABBD4893185L ^ (long)n4 ^ 0x880765A1982C73D2L);
                            n5 = n4 - -386113518;
                            continue;
                        }
                        int cfr_ignored_75 = Integer.rotateRight(0x71DBF54B ^ n4, 17) + -838839472;
                        n5 = Integer.reverse(Integer.reverse(n4 - -386113518));
                        ++n3;
                        continue;
                    }
                    int cfr_ignored_76 = Integer.rotateLeft(0xE4DCD4E0 ^ n4, 15) + -1155832229;
                    int cfr_ignored_77 = (int)(0xD3B657FF4AA4BE66L ^ (long)n4 ^ 0x528E59FA87EA0ABDL);
                    n5 = n4 - -386113518 + 1275373799 - 1275373799;
                    n3 += 3;
                    continue;
                }
                return bl;
            }
            int cfr_ignored_78 = Integer.rotateRight(0x3D602E6B ^ n4, 10) + 1929592368;
            n5 = n4 - -386113518 + -50991830 - -50991830;
        }
    }

    private static int dww_2(int n, int n2) {
        block0: {
            int n3 = 1901704040;
            n3 = Integer.rotateLeft(n3 * -111795159, 3) ^ 0x8E278117;
            int n4 = (n3 = n2 ^ n3) ^ 0x976E2393;
            if ((n4 ^ n3) == -1754389613) break block0;
            int cfr_ignored_0 = (0xE63790FB ^ n3) + -219387046;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static char dhssh(String string, int n) {
        block0: {
            int n2 = tthb.lh_2(1211470817);
            String string2 = string;
            n2 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n2, 29);
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 26)) ^ 0x15CB7050;
            if ((n3 ^ n2) == 365654096) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x5DFEE3B1 ^ n2, 14) + 1715155370) * 1576985521;
            int cfr_ignored_1 = (int)(0x9F4C4D8C27D4EB4FL ^ (long)n2 ^ 0x6668831A2DB89349L);
        }
        return string.charAt(n);
    }

    private static boolean shshw(char c) {
        block0: {
            int n = -438518632;
            n = Integer.rotateLeft(n * -318930541, 5) ^ 0xAF1A3EBC;
            int n2 = (n = c ^ n) ^ 0xD9C09DA4;
            if ((n2 ^ n) == -641688156) break block0;
            int cfr_ignored_0 = (0x3C1C213C ^ n) + -83901119;
        }
        return Character.isLetter(c);
    }

    private static String[] sdhh_3(String string) {
        block0: {
            int n = -1722600906;
            int n2 = (n = Integer.rotateLeft(n * -1446231387, 4) ^ 0x161C9932) ^ 0x745A736A;
            if ((n2 ^ n) == 1952084842) break block0;
            int cfr_ignored_0 = (0xED09415C ^ n) + -1565239288;
        }
        return string.split("\u0005\u0016", -1);
    }

    private static CallSite dkt_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -927929965;
            n3 = Integer.rotateLeft(n3 * 1796572655, 5) ^ 0x93E26978;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 24);
            int n4 = n3 ^ 0x965C61DD;
            if ((n4 ^ n3) != -1772330531) {
                int cfr_ignored_0 = (0x5EEC884E ^ n3) + -342565374;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dkhth ^ string.hashCode()) + (n2 + thsh_4) + i ^ dkhth, 17) + thsh_4);
            }
            String[] stringArray = bma.sdhh_3(new String(cArray));
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

    private static String[] n58xadzngexkj(String string) {
        return string.split("\u0001\u0015", -1);
    }

    private static CallSite xo4aqk46hl6da8(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ o2zsgeobgjtrt ^ string.hashCode() ^ n2 + azztk9nq6 + i * 1262404837) + o2zsgeobgjtrt) ^ azztk9nq6));
            }
            String[] stringArray = bma.n58xadzngexkj(new String(cArray));
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

