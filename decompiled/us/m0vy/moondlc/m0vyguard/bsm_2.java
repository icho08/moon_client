/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.jl_2;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Night Vision", category=bzw.OTHER, desc="Fullbright using Night Vision effect")
public class bsm_2
extends bnq {
    private final bql<btt> rhl_2 = bsm_2::tdhs_4;
    private static final int svtlkxi = -2036301159;
    private static final int nfudomvr4e = 488580512;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int t54qud54h;

    @Override
    public void nc() {
        try {
            int n = 742388109;
            n = Integer.rotateLeft(n * -1271082075, 12) ^ 0x2D89CB0B;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 23);
            int n2 = n ^ 0xADA8F6F5;
            if ((n2 ^ n) != -1381435659) {
                int cfr_ignored_0 = (0x81970778 ^ n) + 1707090213;
            }
            if ((0x3DC & 0) != 0) {
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
        if (bsm_2.mc.field_1724 != null) {
            bsm_2.mc.field_1724.method_6016(class_1294.field_5925);
        }
    }

    private static void tdhs_4(btt btt2) {
        int n = 0;
        int n2 = -431754526;
        n2 = Integer.rotateLeft(n2 * -582138587, 10) ^ 0x9933519;
        btt btt3 = btt2;
        n2 = Integer.rotateRight((btt3 != null ? System.identityHashCode(btt3) : 0) ^ n2, 16);
        int n3 = (n2 ^ 0x9396D77C) + 1963930440 - 1963930440;
        block37: while (true) {
            switch (n3 ^ n2) {
                case -1270531934: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0xF7AB7099 ^ n2, 17) + 35668418) * -139759463;
                    int cfr_ignored_1 = (int)(0x3519DEA427D4EB4FL ^ (long)n2 ^ 0x4038831A2DB9C7E2L);
                    if (bsm_2.mc.field_1724 == null) {
                        try {
                            if ((0x6E69CB82A80C47DDL ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n3 = n2 ^ 0xC1BCC389;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = (n2 ^ 0xC1BCC389) + 1705452085 - 1705452085;
                        }
                        n -= 3;
                        continue block37;
                    }
                    n3 = n2 ^ 0x50A9830E ^ 0x91F3BDB0 ^ 0x91F3BDB0;
                    int cfr_ignored_2 = Integer.rotateLeft(0x9DC5461 ^ n2, 4) + 906745594;
                    int cfr_ignored_3 = (int)(0xCB6EFA5C27D4EB4FL ^ (long)n2 ^ 0x9C8831A2DB83B0CL);
                    n -= 4;
                    continue block37;
                }
                case -87691724: {
                    int cfr_ignored_4 = (Integer.rotateLeft(0x5F9ECC70 ^ n2, 14) + -1734844213) * 1604242545;
                    yf.athz_2();
                    throw null;
                }
                case -1818830980: {
                    int cfr_ignored_5 = (Integer.rotateRight(0x37852BBB ^ n2, 9) + -1115821344) * 931474363;
                    if (!yf.khdha_2()) {
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x8F652DA5));
                        int cfr_ignored_6 = Integer.rotateRight(0xADDDE48A ^ n2, 8) + 305941489;
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xFAC5EE34));
                        ++n;
                        continue block37;
                    }
                    n3 = (n2 ^ 0xB44538A2) + -1983972991 - -1983972991;
                    int cfr_ignored_7 = (Integer.rotateRight(0x56B68F5E ^ n2, 13) - -2072446051) * 1454804831;
                    --n;
                    continue block37;
                }
                case -1044593783: {
                    int cfr_ignored_8 = (Integer.rotateLeft(0x5E7DE534 ^ n2, 14) - 1973182599) * 1585308981;
                    return;
                }
                case 1353286414: {
                    int cfr_ignored_9 = (Integer.rotateRight(0x30597856 ^ n2, 9) - -550293083) * 811169879;
                    bsm_2.mc.field_1724.method_6092(new class_1293(class_1294.field_5925, -1, 0, false, false, false));
                    try {
                        --n;
                        if ((0x200631E1864E833L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = n2 ^ 0xC1BCC389 ^ 0x84FA17CE ^ 0x84FA17CE;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 ^ 0xC1BCC389 ^ 0x9E12DE3 ^ 0x9E12DE3;
                    }
                    n += 2;
                    continue block37;
                }
                case 1624470601: {
                    int cfr_ignored_10 = (Integer.rotateLeft(0xA3FD8898 ^ n2, 7) + -535746141) * -1543665511;
                    n3 = (int)((long)(n2 ^ 0x2BA7BF14) ^ 0xC8964E682969EBFEL ^ 0xC8964E682969EBFEL);
                    int cfr_ignored_11 = (Integer.rotateLeft(0xD695317D ^ n2, 13) - 7249246) * -694865539;
                    int cfr_ignored_12 = (int)(0x14279F4027D4EB4FL ^ (long)n2 ^ 0xC3F0831A2DB9859EL);
                    n3 = n2 ^ 0x9396D77C;
                    ++n;
                    continue block37;
                }
                case -62671495: {
                    int cfr_ignored_13 = (Integer.rotateRight(0xBD2DD3FB ^ n2, 10) + -320189792) * -1121070085;
                    try {
                        if ((0x145ACE5FD57444DL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = n2 ^ 0x9396D77C ^ 0x9F63684F ^ 0x9F63684F;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x9396D77C));
                    }
                    n += 3;
                    continue block37;
                }
                case 1072244197: {
                    int cfr_ignored_14 = Integer.rotateRight(0xD01965CF ^ n2, 13) - 930149196;
                    n3 = n2 ^ 0x9396D77C;
                    int cfr_ignored_15 = Integer.rotateLeft(0xE18961EC ^ n2, 15) - 1409317583;
                    n -= 4;
                    continue block37;
                }
                case 935156189: {
                    int cfr_ignored_16 = Integer.rotateLeft(0xE6EE2C21 ^ n2, 15) + -80414918;
                    int cfr_ignored_17 = (int)(0x245C821C27D4EB4FL ^ (long)n2 ^ 0xF948831A2DB9E568L);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x9E79A1AE));
                    int cfr_ignored_18 = Integer.rotateLeft(0xBB634A01 ^ n2, 10) + -1251764902;
                    int cfr_ignored_19 = (int)(0x79D1E43C27D4EB4FL ^ (long)n2 ^ 0x3508831A2DB95E72L);
                    try {
                        if ((0xE55FE423F42B0129L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x9396D77C));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = n2 ^ 0x9396D77C ^ 0xEC57BEA8 ^ 0xEC57BEA8;
                    }
                    n += 5;
                    continue block37;
                }
                case 1948592426: {
                    int cfr_ignored_20 = Integer.rotateRight(0xFE68214A ^ n2, 18) + -755390671;
                    try {
                        n -= 2;
                        n3 = (int)((long)(n2 ^ 0x9396D77C) ^ 0xF197F827B624D995L ^ 0xF197F827B624D995L);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (int)((long)(n2 ^ 0x9396D77C) ^ 0x116BCF1DFA22D051L ^ 0x116BCF1DFA22D051L);
                    }
                    n -= 5;
                    continue block37;
                }
                case 428972614: {
                    int cfr_ignored_21 = Integer.rotateLeft(0xE1C9BA1 ^ n2, 4) + -1177258054;
                    int cfr_ignored_22 = (int)(0xCCAE359C27D4EB4FL ^ (long)n2 ^ 0x9648831A2DB8348DL);
                    n3 = (n2 ^ 0x97FFBCAA) + -576088681 - -576088681;
                    jl_2.khwm(-865059264, n2);
                    int cfr_ignored_23 = (int)(0x524747F97F4A7C15L ^ (long)n2 ^ 0x72823227030D095FL);
                    n3 = n2 ^ 0x9396D77C ^ 0x8A71814B ^ 0x8A71814B;
                    n -= 4;
                    continue block37;
                }
                case 1000905376: {
                    int cfr_ignored_24 = Integer.rotateLeft(0x54983BA1 ^ n2, 13) + 1120720826;
                    int cfr_ignored_25 = (int)(0x962A959C27D4EB4FL ^ (long)n2 ^ 0xD648831A2DB88184L);
                    try {
                        if ((0x4BDDD199FA1EE205L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (int)((long)(n2 ^ 0x9396D77C) ^ 0x62D9EBF360C174D3L ^ 0x62D9EBF360C174D3L);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x9396D77C));
                    }
                    n += 5;
                    continue block37;
                }
                case 1549168596: {
                    int cfr_ignored_26 = (Integer.rotateLeft(0xB8D65E58 ^ n2, 10) + 1716718563) * -1193910695;
                    n3 = n2 ^ 0xEF2A432F;
                    int cfr_ignored_27 = (Integer.rotateLeft(0x48287D4 ^ n2, 3) - -1876160025) * 75663317;
                    n3 = (n2 ^ 0xEDD0710E) + 2136525943 - 2136525943;
                    int cfr_ignored_28 = (Integer.rotateLeft(0x82A1B2F1 ^ n2, 3) + -705541526) * -2103332111;
                    int cfr_ignored_29 = (int)(0x40131CCC27D4EB4FL ^ (long)n2 ^ 0xC4E8831A2DB92DF7L);
                    n3 = (n2 ^ 0x9396D77C) + 971945275 - 971945275;
                    n -= 3;
                    continue block37;
                }
                case -230020035: {
                    int cfr_ignored_30 = Integer.rotateRight(0x884B4EC3 ^ n2, 4) + -2055460648;
                    try {
                        ++n;
                        if ((0x44DA43D6CFBA8F09L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = n2 ^ 0x9396D77C;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 ^ 0x9396D77C ^ 0xAAAA782C ^ 0xAAAA782C;
                    }
                    continue block37;
                }
                case -226048225: {
                    int cfr_ignored_31 = (Integer.rotateRight(0xC614045B ^ n2, 11) + 13248064) * -971766693;
                    n3 = n2 ^ 0x26CA72FA ^ 0xADD645F9 ^ 0xADD645F9;
                    int cfr_ignored_32 = Integer.rotateRight(0xEFCD2E27 ^ n2, 16) - 238433780;
                    try {
                        n += 3;
                        if ((0xDD1E461B78328573L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (int)((long)(n2 ^ 0x9396D77C) ^ 0x50CDA8E47E9165F1L ^ 0x50CDA8E47E9165F1L);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x9396D77C));
                    }
                    n -= 5;
                    continue block37;
                }
                case -392932079: {
                    int cfr_ignored_33 = (Integer.rotateLeft(0x149FFCB8 ^ n2, 5) + -2084750973) * 346029241;
                    n3 = (int)((long)(n2 ^ 0x9396D77C) ^ 0x45D0BA4080E98108L ^ 0x45D0BA4080E98108L);
                    int cfr_ignored_34 = (Integer.rotateRight(0xCFFC2552 ^ n2, 12) + 870720553) * -805558957;
                    continue block37;
                }
                case -504420452: {
                    int cfr_ignored_35 = (Integer.rotateLeft(0xB8725B94 ^ n2, 10) - 1513535015) * -1200465003;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x4664B3D3));
                    int cfr_ignored_36 = (Integer.rotateRight(0xC5E13C37 ^ n2, 11) - -89921052) * -975094729;
                    n3 = n2 ^ 0x7F51DC91 ^ 0x1A53FF7D ^ 0x1A53FF7D;
                    int cfr_ignored_37 = (Integer.rotateLeft(0x7D5F8691 ^ n2, 18) + 854518474) * 2103412369;
                    int cfr_ignored_38 = (int)(0xBFED28AC27D4EB4FL ^ (long)n2 ^ 0xAC28831A2DB8D20BL);
                    n3 = n2 ^ 0x9396D77C ^ 0xA389F0CD ^ 0xA389F0CD;
                    continue block37;
                }
                case -1695938691: {
                    int cfr_ignored_39 = (Integer.rotateLeft(0xEC5DF9F0 ^ n2, 16) + -1547771061) * -329385487;
                    n3 = (n2 ^ 0xABFC3A33) + 1844287622 - 1844287622;
                    int cfr_ignored_40 = Integer.rotateRight(0x8A18BECF ^ n2, 4) - -1117996468;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x9396D77C));
                    n += 2;
                    continue block37;
                }
                case 932472139: {
                    int cfr_ignored_41 = (Integer.rotateLeft(0xE368F4D1 ^ n2, 15) + -1911339894) * -479660847;
                    int cfr_ignored_42 = (int)(0x21DA5AEC27D4EB4FL ^ (long)n2 ^ 0x48A8831A2DB9EE65L);
                    n3 = (n2 ^ 0x4E888D68) + -693859609 - -693859609;
                    int cfr_ignored_43 = (Integer.rotateLeft(0x96B6C535 ^ n2, 5) - 1149206694) * -1766406859;
                    int cfr_ignored_44 = (int)(0x54046B0827D4EB4FL ^ (long)n2 ^ 0x2B60831A2DB905D9L);
                    n3 = (int)((long)(n2 ^ 0x9396D77C) ^ 0xF2689F38F8497A7BL ^ 0xF2689F38F8497A7BL);
                    continue block37;
                }
            }
            int cfr_ignored_45 = (Integer.rotateLeft(0x6D0A9B9D ^ n2, 16) - 950433598) * 1829411741;
            int cfr_ignored_46 = (int)(0xAFB835A027D4EB4FL ^ (long)n2 ^ 0x9630831A2DB8F2A1L);
            n3 = n2 ^ 0x9396D77C ^ 0xA9720F44 ^ 0xA9720F44;
        }
    }

    private static String[] rpa07hc8r4qz(String string) {
        return string.split("\u0004\u0015", -1);
    }

    private static CallSite b0flntkjsjwk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ svtlkxi ^ string.hashCode() ^ n2 + nfudomvr4e ^ i * -712007919 ^ svtlkxi, 18) ^ nfudomvr4e));
            }
            String[] stringArray = bsm_2.rpa07hc8r4qz(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

