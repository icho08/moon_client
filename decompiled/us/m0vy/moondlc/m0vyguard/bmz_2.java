/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import us.m0vy.moondlc.m0vyguard.brw;
import us.m0vy.moondlc.m0vyguard.bal_2;
import us.m0vy.moondlc.m0vyguard.bma;
import us.m0vy.moondlc.m0vyguard.tthh_2;
import us.m0vy.moondlc.m0vyguard.tdhdh;
import us.m0vy.moondlc.m0vyguard.yt_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class bmz_2 {
    private final String btw_2;
    private final Map hlb;
    private final Map rghj;
    private final Set bya_2;
    private boolean dhdhd = true;
    private static final int dhss_2 = 1566637393;
    private static final int dhad_2 = 1043111293;
    private static final int tkhth = 2106194607;
    private static final int hth_2 = 195900487;
    private static final int wki7gjszwb = -735960802;
    private static final int u0oxdjkpiza = 1148939331;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int n9077m6ycmq;

    public bmz_2(String string) {
        if (string == null || string.trim().length() == 0) {
            throw new IllegalArgumentException("Expression ".concat("can not be empty"));
        }
        this.btw_2 = string;
        this.rghj = new HashMap(4);
        this.hlb = new HashMap(4);
        this.bya_2 = new HashSet(4);
    }

    public bmz_2 dhrw(bma bma2) {
        int n = 550476778;
        int n2 = (n = Integer.rotateLeft(n * 447191173, 11) ^ 0x1D857F23) ^ 0xB0AE64FE;
        if ((n2 ^ n) != -1330748162) {
            int cfr_ignored_0 = (0x9061FF14 ^ n) + -15337990;
        }
        this.hlb.put(bmz_2.zqh_3(bma2), bma2);
        return this;
    }

    public bmz_2 ghkha_2(bma ... bmaArray) {
        int n = yt_2.smth_2(-522780712);
        int n2 = n ^ 0x4B8DBA32;
        if ((n2 ^ n) != 1267579442) {
            int cfr_ignored_0 = Integer.rotateRight(0xAB5B45EA ^ n, 8) + -999614831;
        }
        for (bma bma2 : bmaArray) {
            this.hlb.put(bmz_2.daz_3(bma2), bma2);
        }
        return this;
    }

    public bmz_2 zts_4(List list) {
        int n = yt_2.smth_2(775884662);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 24);
        List list2 = list;
        n = (list2 != null ? System.identityHashCode(list2) : 0) ^ n;
        int n2 = n ^ 0x47166C32;
        if ((n2 ^ n) != 1192651826) {
            int cfr_ignored_0 = Integer.rotateLeft(0x69296344 ^ n, 16) - -1067408265;
        }
        for (bma bma2 : list) {
            this.hlb.put(bmz_2.dhda_3(bma2), bma2);
        }
        return this;
    }

    public bmz_2 hza(Set set) {
        int n = yt_2.smth_2(1600385071);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 11);
        int n2 = n ^ 0x944B04F2;
        if ((n2 ^ n) != -1807022862) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xCB28F4DD ^ n, 12) - -1638709762) * -886508323;
            int cfr_ignored_1 = (int)(0x99A5AE027D4EB4FL ^ (long)n ^ 0x48B0831A2DB9BEE5L);
        }
        this.bya_2.addAll(set);
        return this;
    }

    public bmz_2 shnk(String ... stringArray) {
        int n = -418943905;
        n = Integer.rotateLeft(n * 1543272049, 23) ^ 0xAB11ECBE;
        n = System.identityHashCode(this) ^ n;
        n = Integer.rotateLeft((stringArray != null ? System.identityHashCode(stringArray) : 0) ^ n, 23);
        int n2 = n ^ 0xD30D8DEF;
        if ((n2 ^ n) != -754086417) {
            int cfr_ignored_0 = (0x340AE1B0 ^ n) + -2101591893;
        }
        Collections.addAll(this.bya_2, stringArray);
        return this;
    }

    public bmz_2 ghat_3(String string) {
        bmz_2 bmz2 = null;
        int n = 0;
        int n2 = -1380902693;
        n2 = Integer.rotateLeft(n2 * 1161216759, 17) ^ 0xA156F4F7;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 18);
        int n3 = (int)((long)((n2 ^ 0x852B4CC1 ^ 0xB7BFB58D) + -1212172915) ^ 0x7B38B502FF8650BFL ^ 0x7B38B502FF8650BFL);
        block21: while (true) {
            switch (n3 - -1212172915 ^ 0xB7BFB58D ^ n2) {
                case -2060759871: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x3C3A5F24 ^ n2, 10) - 1332683927;
                    if (yf.dnkh()) {
                        n3 = (n2 ^ 0x7E4D64FF ^ 0xB7BFB58D) + -1212172915 + -37613434 - -37613434;
                        int cfr_ignored_1 = Integer.rotateRight(0xF591EA8B ^ n2, 17) + -1056373232;
                        n3 = (int)((long)((n2 ^ 0x852B4CC0 ^ 0xB7BFB58D) + -1212172915) ^ 0xDD9D4C9B1D8672E3L ^ 0xDD9D4C9B1D8672E3L);
                        continue block21;
                    }
                    int cfr_ignored_2 = (int)(0x631DFA86273DF1C1L ^ (long)n2 ^ 0x87C82C818A56BEAL);
                    n3 = (n2 ^ 0x852B4CBF ^ 0xB7BFB58D) + -1212172915;
                    --n;
                    continue block21;
                }
                case -2060759872: {
                    int cfr_ignored_3 = Integer.rotateRight(0xAFA8F442 ^ n2, 8) + 1238577977;
                    throw null;
                }
                case -2060759873: {
                    int cfr_ignored_4 = Integer.rotateRight(0x5ECBB7EE ^ n2, 14) - 2131289357;
                    this.bya_2.add(string);
                    bmz2 = this;
                    int cfr_ignored_5 = (int)(0xFE47092CA2F7CD0DL ^ (long)n2 ^ 0xEF29895C613C515FL);
                    n3 = (int)((long)((n2 ^ 0x159BC2ED ^ 0xB7BFB58D) + -1212172915) ^ 0x463EBBDC3A68797CL ^ 0x463EBBDC3A68797CL);
                    int cfr_ignored_6 = (int)(0x118FCA42370FCAB9L ^ (long)n2 ^ 0x69F4A2AC6E558ECEL);
                    n3 = (n2 ^ 0x852B4CC2 ^ 0xB7BFB58D) + -1212172915 + 898820865 - 898820865;
                    --n;
                    continue block21;
                }
                case -2060759869: {
                    int cfr_ignored_7 = Integer.rotateRight(0xE0925C06 ^ n2, 15) - 907461621;
                    n3 = (n2 ^ 0xD8AAACB2 ^ 0xB7BFB58D) + -1212172915;
                    int cfr_ignored_8 = Integer.rotateRight(0xE75D1087 ^ n2, 15) - 144875412;
                    n3 = (n2 ^ 0xBF4BC785 ^ 0xB7BFB58D) + -1212172915 ^ 0x83AED996 ^ 0x83AED996;
                    int cfr_ignored_9 = (Integer.rotateRight(0xB03974F6 ^ n2, 9) - 1532152069) * -1338411785;
                    n3 = (int)((long)((n2 ^ 0x852B4CC1 ^ 0xB7BFB58D) + -1212172915) ^ 0xEE3D9E972CF5708L ^ 0xEE3D9E972CF5708L);
                    --n;
                    continue block21;
                }
                case -2060759868: {
                    int cfr_ignored_10 = (Integer.rotateRight(0xDBBB2A92 ^ n2, 14) + -1610103063) * -608490861;
                    n3 = (n2 ^ 0x44DD8DE0 ^ 0xB7BFB58D) + -1212172915 + 534142893 - 534142893;
                    int cfr_ignored_11 = (Integer.rotateLeft(0x8523983D ^ n2, 3) - 598544030) * -2061264835;
                    int cfr_ignored_12 = (int)(0x4791360027D4EB4FL ^ (long)n2 ^ 0x9170831A2DB922F3L);
                    n3 = (int)((long)((n2 ^ 0x852B4CC1 ^ 0xB7BFB58D) + -1212172915) ^ 0x570BFC0B59D50C93L ^ 0x570BFC0B59D50C93L);
                    n -= 4;
                    continue block21;
                }
                case -2060759867: {
                    int cfr_ignored_13 = (Integer.rotateLeft(0x2B6E0FB4 ^ n2, 8) - 1186039303) * 728633269;
                    n3 = (n2 ^ 0x39BDAD9C ^ 0xB7BFB58D) + -1212172915 ^ 0x56EBA260 ^ 0x56EBA260;
                    int cfr_ignored_14 = Integer.rotateRight(0x6B496227 ^ n2, 16) - 37782004;
                    int cfr_ignored_15 = (int)(0x61FCFB1EC4DA1FF0L ^ (long)n2 ^ 0xB4D4507C4C76E28L);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x892AC158 ^ 0xB7BFB58D) + -1212172915));
                    int cfr_ignored_16 = (int)(0x676251C3EBB143C1L ^ (long)n2 ^ 0x5EF71BD17CA56315L);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x852B4CC1 ^ 0xB7BFB58D) + -1212172915));
                    continue block21;
                }
                case -2060759866: {
                    int cfr_ignored_17 = (Integer.rotateLeft(0x1E80C8F9 ^ n2, 6) + -1242172062) * 511756537;
                    int cfr_ignored_18 = (int)(0xDC3266C427D4EB4FL ^ (long)n2 ^ 0x30F8831A2DB815B5L);
                    n3 = (int)((long)((n2 ^ 0xE29A9856 ^ 0xB7BFB58D) + -1212172915) ^ 0x93B07EEB67EAB05L ^ 0x93B07EEB67EAB05L);
                    int cfr_ignored_19 = (Integer.rotateLeft(0xC4BD6599 ^ n2, 11) + -682824510) * -994220647;
                    int cfr_ignored_20 = (int)(0x60FCBA427D4EB4FL ^ (long)n2 ^ 0x6A38831A2DB9A1CEL);
                    n3 = (n2 ^ 0x852B4CC1 ^ 0xB7BFB58D) + -1212172915 ^ 0xA1A82D33 ^ 0xA1A82D33;
                    --n;
                    continue block21;
                }
                case -2060759865: {
                    int cfr_ignored_21 = (Integer.rotateRight(0x39329FB ^ n2, 3) + 1932506272) * 59976187;
                    n3 = (n2 ^ 0x5728935D ^ 0xB7BFB58D) + -1212172915;
                    int cfr_ignored_22 = Integer.rotateLeft(0x30469DC8 ^ n2, 9) + -588596621;
                    n3 = (int)((long)((n2 ^ 0x852B4CC1 ^ 0xB7BFB58D) + -1212172915) ^ 0xC5F18B66B33E1846L ^ 0xC5F18B66B33E1846L);
                    n -= 2;
                    continue block21;
                }
                case -2060759864: {
                    int cfr_ignored_23 = Integer.rotateLeft(0x910BB00C ^ n2, 5) - -1798836049;
                    n3 = (n2 ^ 0xB968AD40 ^ 0xB7BFB58D) + -1212172915 ^ 0x926785FB ^ 0x926785FB;
                    int cfr_ignored_24 = Integer.rotateLeft(0x71F3D4AC ^ n2, 17) - -790339569;
                    try {
                        n += 2;
                        n3 = (int)((long)((n2 ^ 0x852B4CC1 ^ 0xB7BFB58D) + -1212172915) ^ 0x259DEA04534E3417L ^ 0x259DEA04534E3417L);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (n2 ^ 0x852B4CC1 ^ 0xB7BFB58D) + -1212172915 + -1828583891 - -1828583891;
                    }
                    n += 3;
                    continue block21;
                }
                case -2060759863: {
                    int cfr_ignored_25 = (Integer.rotateRight(0xC06502BB ^ n2, 11) + 1352201184) * -1067121989;
                    n3 = (n2 ^ 0xBFB94ED7 ^ 0xB7BFB58D) + -1212172915 ^ 0x276EAFDB ^ 0x276EAFDB;
                    int cfr_ignored_26 = (Integer.rotateLeft(0x8FB59978 ^ n2, 4) + 1801139395) * -1883924103;
                    int cfr_ignored_27 = (int)(0xB140069591B16667L ^ (long)n2 ^ 0xF05BEFD137E8CF51L);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xE8835ABD ^ 0xB7BFB58D) + -1212172915));
                    int cfr_ignored_28 = (int)(0x8ECC47DD08B5A9E7L ^ (long)n2 ^ 0x72CADDD8A8E8B049L);
                    n3 = (n2 ^ 0x852B4CC1 ^ 0xB7BFB58D) + -1212172915;
                    continue block21;
                }
                case -2060759862: {
                    int cfr_ignored_29 = (Integer.rotateRight(0xC114121A ^ n2, 11) + 1707855969) * -1055649253;
                    n3 = (int)((long)((n2 ^ 0xAC5EB516 ^ 0xB7BFB58D) + -1212172915) ^ 0x18A04F65A419C562L ^ 0x18A04F65A419C562L);
                    int cfr_ignored_30 = (Integer.rotateRight(0x1CC06D52 ^ n2, 6) + 2141903913) * 482372947;
                    try {
                        if ((0xBC5D44776BB22149L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (int)((long)((n2 ^ 0x852B4CC1 ^ 0xB7BFB58D) + -1212172915) ^ 0x83351C1C6D938195L ^ 0x83351C1C6D938195L);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (n2 ^ 0x852B4CC1 ^ 0xB7BFB58D) + -1212172915 ^ 0x62F06F0C ^ 0x62F06F0C;
                    }
                    continue block21;
                }
                case -2060759861: {
                    int cfr_ignored_31 = Integer.rotateLeft(0x476E162D ^ n2, 11) - -1431155026;
                    int cfr_ignored_32 = (int)(0x85DCB81027D4EB4FL ^ (long)n2 ^ 0x8D50831A2DB8A668L);
                    int cfr_ignored_33 = (int)(0x6BD5DFAFA90396A9L ^ (long)n2 ^ 0x422F9EB4D6757A7AL);
                    n3 = (n2 ^ 0x852B4CC1 ^ 0xB7BFB58D) + -1212172915;
                    n -= 2;
                    continue block21;
                }
                case -2060759860: {
                    int cfr_ignored_34 = (Integer.rotateRight(0x895E83BB ^ n2, 4) + -1496345888) * -1990294597;
                    n3 = (n2 ^ 0x1FBD5E2 ^ 0xB7BFB58D) + -1212172915;
                    int cfr_ignored_35 = Integer.rotateLeft(0xB175AFC9 ^ n2, 9) + -2120357742;
                    int cfr_ignored_36 = (int)(0x73C701F427D4EB4FL ^ (long)n2 ^ 0xFE98831A2DB94A5FL);
                    int cfr_ignored_37 = (int)(0xCB5BB5838372A7AFL ^ (long)n2 ^ 0x9677CA56B4783B66L);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x852B4CC1 ^ 0xB7BFB58D) + -1212172915));
                    n -= 4;
                    continue block21;
                }
                case -2060759859: {
                    int cfr_ignored_38 = Integer.rotateRight(0xB3EDFF0A ^ n2, 9) + -835747471;
                    n3 = (n2 ^ 0x852B4CC1 ^ 0xB7BFB58D) + -1212172915 + 1924365164 - 1924365164;
                    int cfr_ignored_39 = (Integer.rotateLeft(0x7AC29FF1 ^ n2, 18) + -504431254) * 2059575281;
                    int cfr_ignored_40 = (int)(0xB87031CC27D4EB4FL ^ (long)n2 ^ 0x9EE8831A2DB8DD31L);
                    n -= 4;
                    continue block21;
                }
                case -2060759870: {
                    return bmz2;
                }
            }
            int cfr_ignored_41 = Integer.rotateLeft(0xF546B565 ^ n2, 17) - -1209166218;
            int cfr_ignored_42 = (int)(0x37F41B5827D4EB4FL ^ (long)n2 ^ 0xCBC0831A2DB9C239L);
            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x852B4CC1 ^ 0xB7BFB58D) + -1212172915));
        }
    }

    public bmz_2 hldh(boolean bl) {
        bmz_2 bmz2 = null;
        int n = 0;
        int n2 = -54720865;
        n2 = Integer.rotateLeft(n2 * 1210974801, 8) ^ 0xBCFF4CEB;
        n2 = Integer.rotateLeft(bl ^ n2, 11);
        int n3 = 235982096 + n2 + 491394768 - 491394768;
        while (true) {
            block27: {
                block31: {
                    block29: {
                        block35: {
                            block40: {
                                block38: {
                                    block30: {
                                        block26: {
                                            block36: {
                                                block25: {
                                                    block24: {
                                                        block39: {
                                                            block41: {
                                                                block34: {
                                                                    block32: {
                                                                        block37: {
                                                                            block33: {
                                                                                block22: {
                                                                                    block28: {
                                                                                        block23: {
                                                                                            if ((n = n3 - n2) > -328312842) break block22;
                                                                                            if (n > -1568063388) break block23;
                                                                                            if (n == -2115668792) break block24;
                                                                                            if (n == -1595394007) break block25;
                                                                                            int cfr_ignored_0 = Integer.rotateRight(0xB6D2E347 ^ n2, 9) - 669459668;
                                                                                            if (n == -1568063388) break block26;
                                                                                            break block27;
                                                                                        }
                                                                                        if (n > -745437628) break block28;
                                                                                        if (n == -1517132517) break block29;
                                                                                        if (n == -745437628) break block30;
                                                                                        int cfr_ignored_1 = Integer.rotateRight(0xB6ED6C2B ^ n2, 9) + 723368048;
                                                                                        break block27;
                                                                                    }
                                                                                    if (n == -427374691) break block31;
                                                                                    if (n == -328312842) break block32;
                                                                                    int cfr_ignored_2 = (Integer.rotateRight(0xBC6F68B6 ^ n2, 10) - -707048123) * -1133549385;
                                                                                    break block27;
                                                                                }
                                                                                if (n > 781456873) break block33;
                                                                                if (n == 235982096) break block34;
                                                                                if (n == 404506297) break block35;
                                                                                int cfr_ignored_3 = (Integer.rotateRight(0xECC0189B ^ n2, 16) + -1348429312) * -322955109;
                                                                                if (n == 781456873) break block36;
                                                                                break block27;
                                                                            }
                                                                            if (n > 874008566) break block37;
                                                                            if (n == 783379469) break block38;
                                                                            if (n == 874008566) break block39;
                                                                            int cfr_ignored_4 = (Integer.rotateRight(0xD0F58AFB ^ n2, 13) + 1377399712) * -789214469;
                                                                            break block27;
                                                                        }
                                                                        if (n == 1503705944) break block40;
                                                                        if (n == 2022870099) break block41;
                                                                        int cfr_ignored_5 = (Integer.rotateLeft(0x17F3B5F4 ^ n2, 5) - -354375737) * 401847797;
                                                                        break block27;
                                                                    }
                                                                    int cfr_ignored_6 = Integer.rotateLeft(0x2EC59F21 ^ n2, 8) + -1370758086;
                                                                    int cfr_ignored_7 = (int)(0xEC77311C27D4EB4FL ^ (long)n2 ^ 0x9F48831A2DB8753FL);
                                                                    this.dhdhd = bl;
                                                                    bmz2 = this;
                                                                    n3 = -427374691 + n2 + -972962739 - -972962739;
                                                                    n += 4;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_8 = (Integer.rotateLeft(0x767B0730 ^ n2, 17) + 1564704267) * 1987774257;
                                                                if (yf.dnkh()) {
                                                                    n3 = 2022870099 + n2;
                                                                    n += 2;
                                                                    continue;
                                                                }
                                                                try {
                                                                    n += 2;
                                                                    if ((0x2B29D5E0D5CF4885L ^ (long)n2 | 1L) == 0L) {
                                                                        throw new NoSuchElementException();
                                                                    }
                                                                    n3 = Integer.reverse(Integer.reverse(-328312842 + n2));
                                                                }
                                                                catch (NoSuchElementException noSuchElementException) {
                                                                    n3 = (int)((long)(-328312842 + n2) ^ 0xE3A71581332BB9A6L ^ 0xE3A71581332BB9A6L);
                                                                }
                                                                continue;
                                                            }
                                                            int cfr_ignored_9 = (Integer.rotateRight(0xB88C6552 ^ n2, 10) + 1566434345) * -1198758573;
                                                            throw null;
                                                        }
                                                        int cfr_ignored_10 = Integer.rotateLeft(0xF32D348C ^ n2, 17) - 1993800751;
                                                        try {
                                                            n -= 5;
                                                            if ((0x5CDA1E02BD7B13DL ^ (long)n2 | 1L) == 0L) {
                                                                throw new IllegalArgumentException();
                                                            }
                                                            n3 = 235982096 + n2 + 557334776 - 557334776;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            n3 = (int)((long)(235982096 + n2) ^ 0x38223A25A1B10C78L ^ 0x38223A25A1B10C78L);
                                                        }
                                                        continue;
                                                    }
                                                    int cfr_ignored_11 = Integer.rotateLeft(0xCA3F4689 ^ n2, 12) + -2113459758;
                                                    int cfr_ignored_12 = (int)(0x88DE8B427D4EB4FL ^ (long)n2 ^ 0x2C18831A2DB9BCCAL);
                                                    n3 = (int)((long)(451615221 + n2) ^ 0x8A3C0F343A63D44BL ^ 0x8A3C0F343A63D44BL);
                                                    int cfr_ignored_13 = Integer.rotateLeft(0xA04C2BE4 ^ n2, 7) - 1838608343;
                                                    try {
                                                        n += 4;
                                                        n3 = 235982096 + n2;
                                                    }
                                                    catch (NoSuchElementException noSuchElementException) {
                                                        n3 = 235982096 + n2 + 1996307689 - 1996307689;
                                                    }
                                                    continue;
                                                }
                                                int cfr_ignored_14 = Integer.rotateLeft(0x39FD4EA4 ^ n2, 10) - 168437015;
                                                n3 = Integer.reverse(Integer.reverse(235982096 + n2));
                                                n -= 2;
                                                continue;
                                            }
                                            int cfr_ignored_15 = (Integer.rotateLeft(0x7CA0C8B0 ^ n2, 18) + 467004555) * 2090911921;
                                            try {
                                                n += 3;
                                                if ((0xDC23089ABDDA4FF9L ^ (long)n2 | 1L) == 0L) {
                                                    throw new IllegalArgumentException();
                                                }
                                                n3 = 235982096 + n2;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                n3 = 235982096 + n2 ^ 0x181917C1 ^ 0x181917C1;
                                            }
                                            n += 4;
                                            continue;
                                        }
                                        int cfr_ignored_16 = (Integer.rotateRight(0x21ED2E13 ^ n2, 7) + 538325896) * 569191955;
                                        n3 = 1130169881 + n2;
                                        int cfr_ignored_17 = (Integer.rotateLeft(0x5C58A150 ^ n2, 14) + 857286635) * 1549312337;
                                        n3 = -650415918 + n2 ^ 0xE6B5B0F1 ^ 0xE6B5B0F1;
                                        int cfr_ignored_18 = Integer.rotateLeft(0x67F52AE8 ^ n2, 15) + -1693593261;
                                        n3 = (int)((long)(235982096 + n2) ^ 0x76B3F0CF81A18B5EL ^ 0x76B3F0CF81A18B5EL);
                                        n -= 2;
                                        continue;
                                    }
                                    int cfr_ignored_19 = Integer.rotateLeft(0xC6BFDD61 ^ n2, 11) + 362376698;
                                    int cfr_ignored_20 = (int)(0x40D735C27D4EB4FL ^ (long)n2 ^ 0x1BC8831A2DB9A5CBL);
                                    n3 = 1940464082 + n2 ^ 0x8DA9FA10 ^ 0x8DA9FA10;
                                    int cfr_ignored_21 = Integer.rotateLeft(0x3990452C ^ n2, 10) - -53084273;
                                    try {
                                        n -= 2;
                                        if ((0x792DB5ED90CCAF81L ^ (long)n2 | 1L) == 0L) {
                                            throw new NoSuchElementException();
                                        }
                                        n3 = (int)((long)(235982096 + n2) ^ 0xA61BAB4FAC11AD28L ^ 0xA61BAB4FAC11AD28L);
                                    }
                                    catch (NoSuchElementException noSuchElementException) {
                                        n3 = Integer.reverse(Integer.reverse(235982096 + n2));
                                    }
                                    continue;
                                }
                                int cfr_ignored_22 = (Integer.rotateLeft(0xA4137718 ^ n2, 7) + -491189469) * -1542228199;
                                n3 = -1136020739 + n2 + -280039928 - -280039928;
                                int cfr_ignored_23 = (Integer.rotateLeft(0x9E478B0 ^ n2, 4) + 923286667) * 165968049;
                                n3 = -1226401205 + n2 ^ 0x7A50C23D ^ 0x7A50C23D;
                                int cfr_ignored_24 = Integer.rotateLeft(0xC2F50529 ^ n2, 11) + -1610006734;
                                int cfr_ignored_25 = (int)(0x47AB1427D4EB4FL ^ (long)n2 ^ 0xAB58831A2DB9AD5EL);
                                n3 = 235982096 + n2 + -544906696 - -544906696;
                                n -= 4;
                                continue;
                            }
                            yt_2.ghtd_3(1553438624, n2);
                            int cfr_ignored_26 = (int)(0xC2A0EE197F4A7C15L ^ (long)n2 ^ 0x21423227030C2890L);
                            n3 = Integer.reverse(Integer.reverse(-723744503 + n2));
                            int cfr_ignored_27 = Integer.rotateLeft(0x3C263804 ^ n2, 10) - 1291741111;
                            n3 = 235982096 + n2 ^ 0x13FE6ED3 ^ 0x13FE6ED3;
                            n += 2;
                            continue;
                        }
                        int cfr_ignored_28 = Integer.rotateLeft(0xB17110E5 ^ n2, 9) - -2129745162;
                        int cfr_ignored_29 = (int)(0x73C3BED827D4EB4FL ^ (long)n2 ^ 0x80C0831A2DB94A56L);
                        try {
                            n -= 2;
                            if ((0x5D1D9FA7DFF395EFL ^ (long)n2 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n3 = Integer.reverse(Integer.reverse(235982096 + n2));
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n3 = (int)((long)(235982096 + n2) ^ 0xB87F84431DD21B65L ^ 0xB87F84431DD21B65L);
                        }
                        n += 5;
                        continue;
                    }
                    int cfr_ignored_30 = Integer.rotateLeft(0x9BE62C45 ^ n2, 6) - -448988266;
                    int cfr_ignored_31 = (int)(0x5954827827D4EB4FL ^ (long)n2 ^ 0xF980831A2DB91F78L);
                    try {
                        n -= 5;
                        if ((0x5DEA943588547603L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse(235982096 + n2));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = 235982096 + n2 + -1858607604 - -1858607604;
                    }
                    continue;
                }
                return bmz2;
            }
            int cfr_ignored_32 = (Integer.rotateRight(0xFE9B0437 ^ n2, 18) - -652008988) * -23395273;
            n3 = (int)((long)(235982096 + n2) ^ 0xFFF9EB40D1051CDDL ^ 0xFFF9EB40D1051CDDL);
        }
    }

    public bmz_2 tha_5(bal_2 bal2) {
        int n = yt_2.smth_2(-53448971);
        int n2 = n ^ 0x1867A596;
        if ((n2 ^ n) != 409445782) {
            int cfr_ignored_0 = Integer.rotateRight(0xE4B7CB63 ^ n, 15) + -1231077320;
        }
        this.tdt_2(bal2);
        this.rghj.put(bmz_2.dhkhd(bal2), bal2);
        return this;
    }

    private void tdt_2(bal_2 bal2) {
        int n = yt_2.smth_2(-1975128317);
        n = System.identityHashCode(this) ^ n;
        bal_2 bal3 = bal2;
        n = Integer.rotateLeft((bal3 != null ? System.identityHashCode(bal3) : 0) ^ n, 23);
        int n2 = n ^ 0x7BCB9C3A;
        if ((n2 ^ n) != 2076941370) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xF18E7339 ^ n, 17) + 1151177506) * -242322631;
            int cfr_ignored_1 = (int)(0x333CDD0427D4EB4FL ^ (long)n ^ 0x4778831A2DB9CBA8L);
        }
        String string = bal2.dhsh_7();
        for (char c : string.toCharArray()) {
            if (bal_2.khrj(c)) continue;
            throw new IllegalArgumentException("The operator symbol '" + string + "' is invalid");
        }
    }

    public bmz_2 aksh(bal_2 ... balArray) {
        try {
            int n = 1839349468;
            n = Integer.rotateLeft(n * 729757761, 12) ^ 0xFBDE159;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 24);
            int n2 = n ^ 0x6AF15678;
            if ((n2 ^ n) != 1794201208) {
                int cfr_ignored_0 = (0x75368A4 ^ n) + -1707176858;
            }
            if ((0x261 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        for (bal_2 bal2 : balArray) {
            bmz_2.dhkhy(this, bal2);
        }
        return this;
    }

    public bmz_2 dzs_6(List list) {
        try {
            int n = 2123785333;
            n = Integer.rotateLeft(n * 678697999, 4) ^ 0x7715AAC7;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 13);
            int n2 = n ^ 0xE00DA1DF;
            if ((n2 ^ n) != -535977505) {
                int cfr_ignored_0 = (0x9E9BC5AA ^ n) - -1683112312;
            }
            if ((0x34B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        for (bal_2 bal2 : list) {
            bmz_2.jdq_2(this, bal2);
        }
        return this;
    }

    public brw dqj() {
        if (this.btw_2.length() == 0) {
            throw new IllegalArgumentException("The expression can not be empty");
        }
        this.bya_2.add("pi");
        this.bya_2.add("π");
        this.bya_2.add("e");
        this.bya_2.add("φ");
        for (String string : this.bya_2) {
            if (tdhdh.dhsm(string) == null && !this.hlb.containsKey(string)) continue;
            throw new IllegalArgumentException("A variable can not have the same name as a function [" + string + "]");
        }
        return new brw(tthh_2.thghm(this.btw_2, this.hlb, this.rghj, this.bya_2, this.dhdhd), this.hlb.keySet());
    }

    private static String sdw(String string, int n, int n2, int n3) {
        int n4 = 1444784697;
        n4 = Integer.rotateLeft(n4 * -137419239, 13) ^ 0xC42CA8D1;
        n4 = Integer.rotateLeft(n ^ n4, 4);
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 6)) ^ 0x712C9603;
        if ((n5 ^ n4) != 1898747395) {
            int cfr_ignored_0 = (0x27313C3A ^ n4) + 1149536969;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xA3807FCE ^ n2 - i) + dhad_2, 23) ^ dhss_2 + i * 1759782337));
        }
        return new String(cArray);
    }

    private static String zqh_3(bma bma2) {
        block0: {
            int n = -1902805817;
            int n2 = (n = Integer.rotateLeft(n * 2050044075, 22) ^ 0x35EEBF63) ^ 0x4B54596D;
            if ((n2 ^ n) == 1263819117) break block0;
            int cfr_ignored_0 = (0xC5C125AA ^ n) - -1823600365;
        }
        return bma2.getName();
    }

    private static String daz_3(bma bma2) {
        block0: {
            int n = -1214202978;
            int n2 = (n = Integer.rotateLeft(n * 128348861, 11) ^ 0xC336C52B) ^ 0x49CCE841;
            if ((n2 ^ n) == 1238165569) break block0;
            int cfr_ignored_0 = (0xFE6C53DF ^ n) + -166528124;
        }
        return bma2.getName();
    }

    private static String dhda_3(bma bma2) {
        block0: {
            int n = yt_2.smth_2(480343421);
            int n2 = n ^ 0xF66EC718;
            if ((n2 ^ n) == -160512232) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xEACFB265 ^ n, 16) - 1938045302;
            int cfr_ignored_1 = (int)(0x287D1C5827D4EB4FL ^ (long)n ^ 0xC5C0831A2DB9FD2BL);
        }
        return bma2.getName();
    }

    private static String dhkhd(bal_2 bal2) {
        block0: {
            int n = 1617020472;
            n = Integer.rotateLeft(n * 526972643, 16) ^ 0xC6216496;
            bal_2 bal3 = bal2;
            n = Integer.rotateLeft((bal3 != null ? System.identityHashCode(bal3) : 0) ^ n, 6);
            int n2 = n ^ 0x607B34B7;
            if ((n2 ^ n) == 1618687159) break block0;
            int cfr_ignored_0 = (0x1AF28F ^ n) - -1494686417;
        }
        return bal2.dhsh_7();
    }

    private static bmz_2 dhkhy(bmz_2 bmz2, bal_2 bal2) {
        block0: {
            int n = yt_2.smth_2(-1472088638);
            bal_2 bal3 = bal2;
            n = (bal3 != null ? System.identityHashCode(bal3) : 0) ^ n;
            int n2 = n ^ 0xB0CB5F84;
            if ((n2 ^ n) == -1328849020) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x188AEA46 ^ n, 6) - -47186507;
        }
        return bmz2.tha_5(bal2);
    }

    private static bmz_2 jdq_2(bmz_2 bmz2, bal_2 bal2) {
        block0: {
            int n = yt_2.smth_2(1231299920);
            bal_2 bal3 = bal2;
            n = Integer.rotateLeft((bal3 != null ? System.identityHashCode(bal3) : 0) ^ n, 6);
            int n2 = n ^ 0xF2C14F1;
            if ((n2 ^ n) == 254547185) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x464831A1 ^ n, 11) + -2028232262;
            int cfr_ignored_1 = (int)(0x84FA9F9C27D4EB4FL ^ (long)n ^ 0xC248831A2DB8A424L);
        }
        return bmz2.tha_5(bal2);
    }

    private static String[] sbf(String string) {
        int n = yt_2.smth_2(709166110);
        int n2 = n ^ 0xC22386F2;
        if ((n2 ^ n) != -1037859086) {
            int cfr_ignored_0 = Integer.rotateLeft(0xE86682EC ^ n, 16) - 684161487;
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

    private static CallSite slf_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -886300761;
            n3 = Integer.rotateLeft(n3 * -90068375, 19) ^ 0xCD49DE64;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 7);
            int n4 = n3 ^ 0xA3FF631A;
            if ((n4 ^ n3) != -1543544038) {
                int cfr_ignored_0 = (0x68D37CBD ^ n3) - -679283820;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ tkhth ^ string.hashCode() ^ n2 + hth_2 + i * 1328613931) + tkhth) ^ hth_2));
            }
            String[] stringArray = bmz_2.sbf(new String(cArray));
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

    private static String[] lo6824shgwv9(String string) {
        return string.split("\u0001\u0015", -1);
    }

    private static CallSite on8fbhtbhk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ wki7gjszwb ^ string.hashCode() ^ n2 + u0oxdjkpiza + i * -2111401987) + wki7gjszwb) ^ u0oxdjkpiza));
            }
            String[] stringArray = bmz_2.lo6824shgwv9(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
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

