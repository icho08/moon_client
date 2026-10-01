/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.runtime.ObjectMethods;
import java.util.NoSuchElementException;
import us.m0vy.moondlc.m0vyguard.tdh_8;
import us.m0vy.moondlc.m0vyguard.yf;

public final class zth_8
extends Record {
    private final float dhay;
    private final float tty_2;
    private final float dtd;
    private final float hsgh_2;
    public static final zth_8 tjs;
    private static final int r6fug6nuncu = 251643445;
    private static final int ob12hbk = 1627137380;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int c2b45buu010;

    public zth_8(float f, float f2, float f3, float f4) {
        this.dhay = f;
        this.tty_2 = f2;
        this.dtd = f3;
        this.hsgh_2 = f4;
    }

    public static zth_8 all(float f) {
        int n = 1271166606;
        n = Integer.rotateLeft(n * -2012646885, 15) ^ 0xEFCE1878;
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0x759A8D7F;
        if ((n2 ^ n) != 1973063039) {
            int cfr_ignored_0 = (0x3E5EFBF1 ^ n) - -614560137;
        }
        return new zth_8(f, f, f, f);
    }

    public static zth_8 topLeft(float f) {
        int n = 1087741033;
        n = Integer.rotateLeft(n * -1393905963, 24) ^ 0x9F8E0AEB;
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 11);
        int n2 = n ^ 0x5094638E;
        if ((n2 ^ n) != 1351902094) {
            int cfr_ignored_0 = (0x1041FFE7 ^ n) - 944239707;
        }
        return new zth_8(f, 0.0f, 0.0f, 0.0f);
    }

    public static zth_8 topRight(float f) {
        zth_8 zth2 = null;
        int n = 0;
        int n2 = 430625078;
        n2 = Integer.rotateLeft(n2 * 851230727, 18) ^ 0x75682091;
        n2 = Integer.rotateLeft(Float.floatToIntBits(f) ^ n2, 27);
        int n3 = -402295079 + n2 ^ 0x515A1D0 ^ 0x515A1D0;
        while (true) {
            block21: {
                block24: {
                    block19: {
                        block35: {
                            block20: {
                                block18: {
                                    block31: {
                                        block25: {
                                            block23: {
                                                block30: {
                                                    block32: {
                                                        block37: {
                                                            block34: {
                                                                block29: {
                                                                    block26: {
                                                                        block36: {
                                                                            block33: {
                                                                                block27: {
                                                                                    block28: {
                                                                                        block16: {
                                                                                            block22: {
                                                                                                block17: {
                                                                                                    if ((n = n3 - n2) > -402295079) break block16;
                                                                                                    if (n > -1317317700) break block17;
                                                                                                    if (n == -1728335111) break block18;
                                                                                                    if (n == -1703709370) break block19;
                                                                                                    int cfr_ignored_0 = Integer.rotateLeft(0x999B7748 ^ n2, 6) + -1640951565;
                                                                                                    if (n == -1317317700) break block20;
                                                                                                    break block21;
                                                                                                }
                                                                                                if (n > -805165505) break block22;
                                                                                                if (n == -1249339777) break block23;
                                                                                                if (n == -805165505) break block24;
                                                                                                break block21;
                                                                                            }
                                                                                            if (n == -570938581) break block25;
                                                                                            if (n == -402295079) break block26;
                                                                                            break block21;
                                                                                        }
                                                                                        if (n > 1191415376) break block27;
                                                                                        if (n > 458538459) break block28;
                                                                                        if (n == -75231872) break block29;
                                                                                        if (n == 458538459) break block30;
                                                                                        int cfr_ignored_1 = Integer.rotateRight(0xA495814B ^ n2, 7) + -226998448;
                                                                                        break block21;
                                                                                    }
                                                                                    if (n == 1077067270) break block31;
                                                                                    if (n == 1191415376) break block32;
                                                                                    break block21;
                                                                                }
                                                                                if (n > 1301033514) break block33;
                                                                                if (n == 1257933980) break block34;
                                                                                if (n == 1301033514) break block35;
                                                                                int cfr_ignored_2 = Integer.rotateRight(0x2196AE4B ^ n2, 7) + 362592848;
                                                                                break block21;
                                                                            }
                                                                            if (n == 1478200443) break block36;
                                                                            if (n == 1588945373) break block37;
                                                                            int cfr_ignored_3 = Integer.rotateLeft(0x640387CD ^ n2, 15) - 550179086;
                                                                            int cfr_ignored_4 = (int)(0xA6B129F027D4EB4FL ^ (long)n2 ^ 0xAE90831A2DB8E0B3L);
                                                                            break block21;
                                                                        }
                                                                        int cfr_ignored_5 = (Integer.rotateRight(0x4011D096 ^ n2, 11) - -964304539) * 1074909335;
                                                                        zth2 = new zth_8(0.0f, f, 0.0f, 0.0f);
                                                                        try {
                                                                            n3 = -805165505 + n2;
                                                                        }
                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                            n3 = -805165505 + n2 + 1334680434 - 1334680434;
                                                                        }
                                                                        --n;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_6 = (Integer.rotateLeft(0xD9697938 ^ n2, 14) + 1478708483) * -647399111;
                                                                    if (!yf.dnkh()) {
                                                                        n3 = Integer.reverse(Integer.reverse(1478200443 + n2));
                                                                        int cfr_ignored_7 = Integer.rotateRight(0x2D0A5A27 ^ n2, 8) - 2023655924;
                                                                        n += 5;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        n += 4;
                                                                        if ((0x7BA5B94FB5980ED1L ^ (long)n2 | 1L) == 0L) {
                                                                            throw new ArithmeticException();
                                                                        }
                                                                        n3 = Integer.reverse(Integer.reverse(-75231872 + n2));
                                                                    }
                                                                    catch (ArithmeticException arithmeticException) {
                                                                        n3 = (int)((long)(-75231872 + n2) ^ 0x92D2535887689E26L ^ 0x92D2535887689E26L);
                                                                    }
                                                                    continue;
                                                                }
                                                                int cfr_ignored_8 = (Integer.rotateLeft(0xF556A1FC ^ n2, 17) - -1176814401) * -178871811;
                                                                throw null;
                                                            }
                                                            int cfr_ignored_9 = Integer.rotateLeft(0xB29540E1 ^ n2, 9) + -1536132486;
                                                            int cfr_ignored_10 = (int)(0x7027EEDC27D4EB4FL ^ (long)n2 ^ 0x20C8831A2DB94D9EL);
                                                            n3 = (int)((long)(-1660364826 + n2) ^ 0x2B8CB37AB9049022L ^ 0x2B8CB37AB9049022L);
                                                            int cfr_ignored_11 = (Integer.rotateRight(0xAEB3CF73 ^ n2, 8) + 740539944) * -1363947661;
                                                            n3 = -402295079 + n2;
                                                            int cfr_ignored_12 = Integer.rotateRight(0x480E12EB ^ n2, 12) + -1106122320;
                                                            n += 5;
                                                            continue;
                                                        }
                                                        int cfr_ignored_13 = Integer.rotateLeft(0x4AFD98E9 ^ n2, 12) + 420684658;
                                                        int cfr_ignored_14 = (int)(0x884F36D427D4EB4FL ^ (long)n2 ^ 0x90D8831A2DB8BD4FL);
                                                        n3 = -796890041 + n2 ^ 0x7663E370 ^ 0x7663E370;
                                                        int cfr_ignored_15 = Integer.rotateLeft(0x2DFB1908 ^ n2, 8) + -1782208717;
                                                        try {
                                                            n += 5;
                                                            n3 = -402295079 + n2;
                                                        }
                                                        catch (ArithmeticException arithmeticException) {
                                                            n3 = -402295079 + n2 + 869842520 - 869842520;
                                                        }
                                                        n -= 4;
                                                        continue;
                                                    }
                                                    int cfr_ignored_16 = Integer.rotateLeft(0x827322C9 ^ n2, 3) + -800139886;
                                                    int cfr_ignored_17 = (int)(0x40C18CF427D4EB4FL ^ (long)n2 ^ 0xE498831A2DB92C52L);
                                                    n3 = 353352658 + n2 + 1055957177 - 1055957177;
                                                    int cfr_ignored_18 = (Integer.rotateRight(0xADC2A1B3 ^ n2, 8) + 250557416) * -1379753549;
                                                    n3 = -402295079 + n2 + 593883622 - 593883622;
                                                    ++n;
                                                    continue;
                                                }
                                                int cfr_ignored_19 = (Integer.rotateRight(0x4B2F23B2 ^ n2, 12) + 521335241) * 1261380531;
                                                n3 = Integer.reverse(Integer.reverse(178054099 + n2));
                                                int cfr_ignored_20 = Integer.rotateRight(0x4C31F187 ^ n2, 12) - 1047125652;
                                                n3 = -402295079 + n2 + -1716704990 - -1716704990;
                                                int cfr_ignored_21 = (Integer.rotateLeft(0x6B32623D ^ n2, 16) - -8944482) * 1798464061;
                                                int cfr_ignored_22 = (int)(0xA980CC0027D4EB4FL ^ (long)n2 ^ 0x6570831A2DB8FED0L);
                                                --n;
                                                continue;
                                            }
                                            int cfr_ignored_23 = Integer.rotateLeft(0xA6355E89 ^ n2, 7) + 617877970;
                                            int cfr_ignored_24 = (int)(0x6487F0B427D4EB4FL ^ (long)n2 ^ 0x1C18831A2DB964DEL);
                                            n3 = 1926317462 + n2 ^ 0x4B0B8D4A ^ 0x4B0B8D4A;
                                            int cfr_ignored_25 = Integer.rotateLeft(0x51FDFA85 ^ n2, 13) - -232852138;
                                            int cfr_ignored_26 = (int)(0x934F54B827D4EB4FL ^ (long)n2 ^ 0x5400831A2DB88B4FL);
                                            n3 = -402295079 + n2 ^ 0x3BD50D29 ^ 0x3BD50D29;
                                            continue;
                                        }
                                        int cfr_ignored_27 = (Integer.rotateRight(0x5247CC7A ^ n2, 13) + -82877951) * 1380437115;
                                        n3 = Integer.reverse(Integer.reverse(-589012494 + n2));
                                        int cfr_ignored_28 = (Integer.rotateRight(0x8B2BA3D6 ^ n2, 4) - -559516123) * -1960074281;
                                        n3 = (int)((long)(-1101695949 + n2) ^ 0xBDED78E4A502DF4DL ^ 0xBDED78E4A502DF4DL);
                                        int cfr_ignored_29 = (Integer.rotateRight(0x22C8E1DF ^ n2, 7) - 984676668) * 583590367;
                                        n3 = Integer.reverse(Integer.reverse(-402295079 + n2));
                                        n += 5;
                                        continue;
                                    }
                                    int cfr_ignored_30 = Integer.rotateRight(0x7E4E3783 ^ n2, 18) + 1339447320;
                                    n3 = -1497494847 + n2;
                                    int cfr_ignored_31 = (Integer.rotateLeft(0x2FCDC131 ^ n2, 8) + -834141142) * 802013489;
                                    int cfr_ignored_32 = (int)(0xED7F6F0C27D4EB4FL ^ (long)n2 ^ 0x2368831A2DB8772FL);
                                    try {
                                        n -= 5;
                                        if ((0xDFE4A11C9362DF3BL ^ (long)n2 | 1L) == 0L) {
                                            throw new ArithmeticException();
                                        }
                                        n3 = -402295079 + n2 ^ 0xD11F2137 ^ 0xD11F2137;
                                    }
                                    catch (ArithmeticException arithmeticException) {
                                        n3 = (int)((long)(-402295079 + n2) ^ 0x4F444318C279489AL ^ 0x4F444318C279489AL);
                                    }
                                    --n;
                                    continue;
                                }
                                int cfr_ignored_33 = Integer.rotateLeft(0xCCB74C4C ^ n2, 12) - -829432721;
                                try {
                                    n -= 3;
                                    n3 = (int)((long)(-402295079 + n2) ^ 0x175862328B6E16F7L ^ 0x175862328B6E16F7L);
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    n3 = (int)((long)(-402295079 + n2) ^ 0x7369569D71C867B3L ^ 0x7369569D71C867B3L);
                                }
                                ++n;
                                continue;
                            }
                            int cfr_ignored_34 = Integer.rotateRight(0x68CFE267 ^ n2, 16) - -1249244748;
                            n3 = -1854411214 + n2 ^ 0xD633DFC8 ^ 0xD633DFC8;
                            int cfr_ignored_35 = Integer.rotateLeft(0xCAE9BFAD ^ n2, 12) - -1767123666;
                            int cfr_ignored_36 = (int)(0x85B119027D4EB4FL ^ (long)n2 ^ 0xDE50831A2DB9BD67L);
                            n3 = 770541340 + n2;
                            int cfr_ignored_37 = (Integer.rotateLeft(0xAFE0FF10 ^ n2, 8) + 1352434219) * -1344209135;
                            n3 = Integer.reverse(Integer.reverse(-402295079 + n2));
                            n += 4;
                            continue;
                        }
                        int cfr_ignored_38 = Integer.rotateRight(0xF699140B ^ n2, 17) + -521728880;
                        n3 = Integer.reverse(Integer.reverse(1431061189 + n2));
                        int cfr_ignored_39 = Integer.rotateRight(0x8011658B ^ n2, 3) + -2038895856;
                        try {
                            n -= 4;
                            n3 = -402295079 + n2 ^ 0x5F5ECC54 ^ 0x5F5ECC54;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = (int)((long)(-402295079 + n2) ^ 0xA6D58E45DA8D46A1L ^ 0xA6D58E45DA8D46A1L);
                        }
                        continue;
                    }
                    int cfr_ignored_40 = Integer.rotateLeft(0xF3CE62E4 ^ n2, 17) - -1973708585;
                    n3 = (int)((long)(-1802714149 + n2) ^ 0x85701C35BD3461EEL ^ 0x85701C35BD3461EEL);
                    int cfr_ignored_41 = (Integer.rotateRight(0xBC60689A ^ n2, 10) + -737523231) * -1134532453;
                    n3 = -402295079 + n2 ^ 0x9C6C9265 ^ 0x9C6C9265;
                    n += 4;
                    continue;
                }
                return zth2;
            }
            int cfr_ignored_42 = (Integer.rotateLeft(0x8371DBB8 ^ n2, 3) + -282641789) * -2089690183;
            n3 = -402295079 + n2 + 1187014665 - 1187014665;
        }
    }

    public static zth_8 bottomRight(float f) {
        int n = -576836618;
        n = Integer.rotateLeft(n * -681077799, 27) ^ 0xB21EB17B;
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0x4568FBBA;
        if ((n2 ^ n) != 1164508090) {
            int cfr_ignored_0 = (0x98F6D04C ^ n) + 2113738683;
        }
        return new zth_8(0.0f, 0.0f, f, 0.0f);
    }

    public static zth_8 bottomLeft(float f) {
        int n = tdh_8.khkf(1638278044);
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0xBF726329;
        if ((n2 ^ n) != -1083022551) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xDED440B5 ^ n, 14) - 1144102) * -556515147;
            int cfr_ignored_1 = (int)(0x1C66EE8827D4EB4FL ^ (long)n ^ 0x2060831A2DB9951CL);
        }
        return new zth_8(0.0f, 0.0f, 0.0f, f);
    }

    public static zth_8 top(float f, float f2) {
        int n = 0;
        int n2 = 1419654068;
        n2 = Integer.rotateLeft(n2 * 278354871, 5) ^ 0x33DCE40F;
        n2 = Float.floatToIntBits(f) ^ n2;
        n2 = Integer.rotateRight(Float.floatToIntBits(f2) ^ n2, 8);
        int n3 = n2 - -1117930027;
        block26: while (true) {
            switch (n2 - n3) {
                case 1704249164: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x684564BA ^ n2, 16) + -1530605119) * 1749378235;
                    return new zth_8(f, f2, 0.0f, 0.0f);
                }
                case -1117930027: {
                    int cfr_ignored_1 = (Integer.rotateLeft(0x7EC2D6D1 ^ n2, 18) + 1576379018) * 2126698193;
                    int cfr_ignored_2 = (int)(0xBC7078EC27D4EB4FL ^ (long)n2 ^ 0xCA8831A2DB8D531L);
                    if (!yf.khdha_2()) {
                        n3 = Integer.reverse(Integer.reverse(n2 - -266111231));
                        int cfr_ignored_3 = (Integer.rotateLeft(0x41C85C1D ^ n2, 11) - -73349442) * 1103649821;
                        int cfr_ignored_4 = (int)(0x837AF22027D4EB4FL ^ (long)n2 ^ 0x1930831A2DB8AB24L);
                        n3 = (int)((long)(n2 - 1384370161) ^ 0xF6B8B0A1A81C25E8L ^ 0xF6B8B0A1A81C25E8L);
                        n -= 3;
                        continue block26;
                    }
                    n3 = (int)((long)(n2 - -1450117615) ^ 0x9FC8795AE8B4207AL ^ 0x9FC8795AE8B4207AL);
                    int cfr_ignored_5 = (Integer.rotateRight(0xD769FA97 ^ n2, 13) - 439547780) * -680920425;
                    n3 = Integer.reverse(Integer.reverse(n2 - 1704249164));
                    n += 5;
                    continue block26;
                }
                case 1384370161: {
                    int cfr_ignored_6 = Integer.rotateLeft(0x99DFB4E8 ^ n2, 6) + -1502312621;
                    zth_8.avcswdgkcs2();
                    throw null;
                }
                case -2033518844: {
                    int cfr_ignored_7 = (Integer.rotateRight(0xB3789A5E ^ n2, 9) - -1074245475) * -1283941793;
                    n3 = Integer.reverse(Integer.reverse(n2 - -497342427));
                    int cfr_ignored_8 = (Integer.rotateLeft(0x8FD7975C ^ n2, 4) - 1870197599) * -1881696419;
                    n3 = n2 - -1117930027 + -1475473295 - -1475473295;
                    n -= 5;
                    continue block26;
                }
                case 68172935: {
                    int cfr_ignored_9 = (Integer.rotateLeft(0x5BD85878 ^ n2, 14) + 596661699) * 1540905081;
                    n3 = Integer.reverse(Integer.reverse(n2 - -336580358));
                    int cfr_ignored_10 = (Integer.rotateRight(0x1E16E8BB ^ n2, 6) + -1457271328) * 504817851;
                    n3 = (int)((long)(n2 - -234599697) ^ 0x274AC9DDE620653DL ^ 0x274AC9DDE620653DL);
                    int cfr_ignored_11 = Integer.rotateLeft(0xA354B92C ^ n2, 7) - -878703729;
                    n3 = n2 - -1117930027 ^ 0x8B0A3112 ^ 0x8B0A3112;
                    --n;
                    continue block26;
                }
                case 1340256127: {
                    int cfr_ignored_12 = Integer.rotateRight(0xC3EFACCB ^ n2, 11) + -1100772400;
                    int cfr_ignored_13 = (int)(0x3503BE8405395BC9L ^ (long)n2 ^ 0x8078C6C14CB5C7D6L);
                    n3 = Integer.reverse(Integer.reverse(n2 - -1117930027));
                    n -= 2;
                    continue block26;
                }
                case -1455641295: {
                    int cfr_ignored_14 = Integer.rotateRight(0xA7A4470F ^ n2, 7) - 1363294732;
                    n3 = n2 - 675563178;
                    int cfr_ignored_15 = (Integer.rotateRight(0x50989DD7 ^ n2, 13) - -958874556) * 1352179159;
                    n3 = n2 - 1766670606;
                    int cfr_ignored_16 = (Integer.rotateLeft(0x60F7E770 ^ n2, 15) + -1033722421) * 1626859377;
                    n3 = n2 - -1117930027 ^ 0x9F32F6EB ^ 0x9F32F6EB;
                    continue block26;
                }
                case -374507677: {
                    int cfr_ignored_17 = (Integer.rotateRight(0xB3F2912 ^ n2, 4) + 1627625577) * 188688659;
                    n3 = n2 - 285226355 + -1854870654 - -1854870654;
                    int cfr_ignored_18 = (Integer.rotateRight(0x6E6C3032 ^ n2, 16) + 1668773193) * 1852583987;
                    try {
                        n -= 5;
                        if ((0xDE18C6740B31E217L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = n2 - -1117930027 ^ 0xBDD7F6F6 ^ 0xBDD7F6F6;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 - -1117930027 + -1943708724 - -1943708724;
                    }
                    n += 5;
                    continue block26;
                }
                case -393297414: {
                    int cfr_ignored_19 = (Integer.rotateLeft(0x5E93DAF5 ^ n2, 14) - 2017796838) * 1586748149;
                    int cfr_ignored_20 = (int)(0x9C2174C827D4EB4FL ^ (long)n2 ^ 0x14E0831A2DB89593L);
                    try {
                        if ((0x786D654C4D08F3C7L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (int)((long)(n2 - -1117930027) ^ 0x9D6B2344FA6AB773L ^ 0x9D6B2344FA6AB773L);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 - -1117930027;
                    }
                    n -= 3;
                    continue block26;
                }
                case 478975458: {
                    int cfr_ignored_21 = (Integer.rotateLeft(0x47049138 ^ n2, 11) + -1645529853) * 1191481657;
                    try {
                        n -= 2;
                        if ((0x84C08B9FCC9A6CD1L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = n2 - -1117930027;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 - -1117930027 + -862466413 - -862466413;
                    }
                    continue block26;
                }
                case -1078911358: {
                    int cfr_ignored_22 = Integer.rotateRight(0xB8FD18EB ^ n2, 10) + 1795400624;
                    int cfr_ignored_23 = (int)(0xF1B4BC6142C5AD2AL ^ (long)n2 ^ 0x85B24938A1724EB8L);
                    n3 = n2 - 1518249327;
                    int cfr_ignored_24 = (int)(0xBCE3B7C223EADF95L ^ (long)n2 ^ 0x92F48B66440CD416L);
                    n3 = Integer.reverse(Integer.reverse(n2 - -1117930027));
                    n += 5;
                    continue block26;
                }
                case 2111282730: {
                    int cfr_ignored_25 = Integer.rotateRight(0x4380C7E7 ^ n2, 11) - 821417012;
                    n3 = n2 - -1117930027 ^ 0x8BC9191 ^ 0x8BC9191;
                    int cfr_ignored_26 = Integer.rotateRight(0x4FD44DAF ^ n2, 12) - -1357707412;
                    n += 3;
                    continue block26;
                }
                case 1713908528: {
                    int cfr_ignored_27 = (Integer.rotateRight(0x79BD05BF ^ n2, 18) - -1035906724) * 2042430911;
                    n3 = (int)((long)(n2 - 430073585) ^ 0x717E75215555E74FL ^ 0x717E75215555E74FL);
                    int cfr_ignored_28 = (Integer.rotateLeft(0x9AFC395C ^ n2, 6) - -924282529) * -1694746275;
                    try {
                        n += 3;
                        n3 = n2 - -1117930027;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 - -1117930027;
                    }
                    n += 2;
                    continue block26;
                }
                case 468067872: {
                    int cfr_ignored_29 = Integer.rotateLeft(0xE12D9B08 ^ n2, 15) + 1222862131;
                    try {
                        n -= 4;
                        n3 = n2 - -1117930027;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 - -1117930027 + -1423462921 - -1423462921;
                    }
                    n -= 3;
                    continue block26;
                }
            }
            int cfr_ignored_30 = (Integer.rotateLeft(0xD2C8B111 ^ n2, 13) + -1968500662) * -758599407;
            int cfr_ignored_31 = (int)(0x107A1F2C27D4EB4FL ^ (long)n2 ^ 0xC328831A2DB98D25L);
            n3 = n2 - -1117930027 ^ 0x67A40C59 ^ 0x67A40C59;
        }
    }

    public static zth_8 bottom(float f, float f2) {
        int n = tdh_8.khkf(-1453187261);
        int n2 = n ^ 0xEF7561C2;
        if ((n2 ^ n) != -277519934) {
            int cfr_ignored_0 = Integer.rotateLeft(0x46177E81 ^ n, 11) + -2127171366;
            int cfr_ignored_1 = (int)(0x84A5D0BC27D4EB4FL ^ (long)n ^ 0x5C08831A2DB8A49AL);
        }
        return new zth_8(0.0f, 0.0f, f2, f);
    }

    public static zth_8 left(float f, float f2) {
        int n = 872881422;
        n = Integer.rotateLeft(n * 538440997, 19) ^ 0x66EF07DA;
        n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 6);
        n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 27);
        int n2 = n ^ 0xFD4FECF4;
        if ((n2 ^ n) != -45093644) {
            int cfr_ignored_0 = (0xC948F1FA ^ n) + 1027945332;
        }
        return new zth_8(f, 0.0f, 0.0f, f2);
    }

    public static zth_8 right(float f, float f2) {
        int n = tdh_8.khkf(-1804430391);
        n = Float.floatToIntBits(f) ^ n;
        n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 8);
        int n2 = n ^ 0x731B387;
        if ((n2 ^ n) != 120697735) {
            int cfr_ignored_0 = Integer.rotateRight(0x9343204E ^ n, 5) - -646018899;
        }
        return new zth_8(0.0f, f, f2, 0.0f);
    }

    @Override
    public String toString() {
        block0: {
            int n = -489605729;
            n = Integer.rotateLeft(n * 500839723, 13) ^ 0xE4D132C;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xD815B431;
            if ((n2 ^ n) == -669666255) break block0;
            int cfr_ignored_0 = (0x3AC481AE ^ n) + -862851876;
        }
        return "BorderRadius{topLeftRadius=" + this.dhay + ", topRightRadius=" + this.tty_2 + ", bottomRightRadius=" + this.dtd + ", bottomLeftRadius=" + this.hsgh_2 + "}";
    }

    @Override
    public final int hashCode() {
        block0: {
            int n = tdh_8.khkf(-1383143354);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 23);
            int n2 = n ^ 0x4B2445F1;
            if ((n2 ^ n) == 1260668401) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xE6AAADB7 ^ n, 15) - -217536412) * -425022025;
        }
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zth_8.class, "topLeftRadius;topRightRadius;bottomRightRadius;bottomLeftRadius", "ذاي", "تطي", "دتد", "حصغ"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        block0: {
            int n = -642229980;
            n = Integer.rotateLeft(n * 673666065, 6) ^ 0x371FE0CB;
            Object object2 = object;
            n = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 7);
            int n2 = n ^ 0x480D5AFA;
            if ((n2 ^ n) == 1208834810) break block0;
            int cfr_ignored_0 = (0x91B503DE ^ n) - 618912366;
        }
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zth_8.class, "topLeftRadius;topRightRadius;bottomRightRadius;bottomLeftRadius", "ذاي", "تطي", "دتد", "حصغ"}, this, object);
    }

    public float topLeftRadius() {
        block0: {
            int n = tdh_8.khkf(-1639919407);
            int n2 = n ^ 0x6F082BD;
            if ((n2 ^ n) == 116425405) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x98B0526C ^ n, 6) - -2118673841;
        }
        return this.dhay;
    }

    public float topRightRadius() {
        block0: {
            int n = -1892637058;
            n = Integer.rotateLeft(n * 1801677661, 17) ^ 0xB9DD7DCF;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x724CBB98;
            if ((n2 ^ n) == 1917631384) break block0;
            int cfr_ignored_0 = (0xFD7C1DE6 ^ n) + 1275836457;
        }
        return this.tty_2;
    }

    public float bottomRightRadius() {
        block0: {
            int n = tdh_8.khkf(-1158128514);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xA128DE7;
            if ((n2 ^ n) == 168988135) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xB0EAD199 ^ n, 9) + 1892483266) * -1326788199;
            int cfr_ignored_1 = (int)(0x72587FA427D4EB4FL ^ (long)n ^ 0x238831A2DB94961L);
        }
        return this.dtd;
    }

    public float bottomLeftRadius() {
        block0: {
            int n = 1190070289;
            n = Integer.rotateLeft(n * -1141603829, 7) ^ 0x2BEA8222;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xCFAC2B65;
            if ((n2 ^ n) == -810800283) break block0;
            int cfr_ignored_0 = (0x89432374 ^ n) - 1054027446;
        }
        return this.hsgh_2;
    }

    private static void avcswdgkcs2() {
        int n = 586646691;
        int n2 = (n = Integer.rotateLeft(n * 1956041889, 25) ^ 0x43B89ED3) ^ 0xE784DAA6;
        if ((n2 ^ n) != -410723674) {
            int cfr_ignored_0 = (0xC5735E05 ^ n) + 1730173744;
        }
        yf.athz_2();
    }

    private static String[] rjnc8bkmzw0g(String string) {
        return string.split("\u0001\u0014", -1);
    }

    private static CallSite s7aaq7too(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ r6fug6nuncu ^ string.hashCode()) + (n2 + ob12hbk) + i ^ r6fug6nuncu, 18) + ob12hbk);
            }
            String[] stringArray = zth_8.rjnc8bkmzw0g(new String(cArray));
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

