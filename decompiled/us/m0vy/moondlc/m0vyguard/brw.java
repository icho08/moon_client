/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import us.m0vy.moondlc.m0vyguard.bsz_4;
import us.m0vy.moondlc.m0vyguard.bzgh_2;
import us.m0vy.moondlc.m0vyguard.bal_2;
import us.m0vy.moondlc.m0vyguard.bam_2;
import us.m0vy.moondlc.m0vyguard.bah_4;
import us.m0vy.moondlc.m0vyguard.bfk;
import us.m0vy.moondlc.m0vyguard.bma;
import us.m0vy.moondlc.m0vyguard.bys_2;
import us.m0vy.moondlc.m0vyguard.tts;
import us.m0vy.moondlc.m0vyguard.tdhdh;
import us.m0vy.moondlc.m0vyguard.ght_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class brw {
    private final ght_2[] rthj;
    private final Map dhtr;
    private final Set qs;
    private static final int dha = -2046877096;
    private static final int ttq = -1117581969;
    private static final int bns = 1734191508;
    private static final int tkb = -2105980047;
    private static final int bwglbor = 1448137436;
    private static final int m1z501u2ffx5 = 936627751;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int b436sgtc;

    private static Map dsdh_3() {
        try {
            int n = 2007922499;
            n = Integer.rotateLeft(n * 1632801615, 22) ^ 0xA5600B27;
            int n2 = n ^ 0x43C74D63;
            if ((n2 ^ n) != 1137134947) {
                int cfr_ignored_0 = (0x34693A20 ^ n) - 1299723645;
            }
            if ((0xCD & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        HashMap<String, Double> hashMap = new HashMap<String, Double>(4);
        hashMap.put("pi", brw.sd(Double.longBitsToDouble(0xFBE126057688AB16L ^ 0xBBE807FE22CC860EL)));
        hashMap.put("\u03c0", brw.raz_4(Double.longBitsToDouble(0x2654E9EAF58E0B48L ^ 0x665DC811A1CA2650L)));
        hashMap.put("\u03c6", Double.longBitsToDouble(0x81C3734F874E3C6AL ^ 0xBE3A90381CD97AFFL));
        hashMap.put("e", brw.btsh_2(Double.longBitsToDouble(0x188217360C0B7EBBL ^ 0x5887A83C871F29D2L)));
        return hashMap;
    }

    public brw(brw brw2) {
        this.rthj = Arrays.copyOf(brw2.rthj, brw2.rthj.length);
        this.dhtr = new HashMap();
        this.dhtr.putAll(brw2.dhtr);
        this.qs = new HashSet(brw2.qs);
    }

    public brw(ght_2[] ghtArray) {
        this.rthj = ghtArray;
        this.dhtr = brw.dsdh_3();
        this.qs = Collections.emptySet();
    }

    public brw(ght_2[] ghtArray, Set set) {
        this.rthj = ghtArray;
        this.dhtr = brw.dsdh_3();
        this.qs = set;
    }

    public brw zthn_2(String string, double d) {
        int n = bah_4.thth_3(2027874915);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 17);
        int n2 = n ^ 0x25C71784;
        if ((n2 ^ n) != 633804676) {
            int cfr_ignored_0 = Integer.rotateRight(0x5D19FDE7 ^ n, 14) - 1250123316;
        }
        this.thdz_4(string);
        this.dhtr.put(string, d);
        return this;
    }

    private void thdz_4(String string) {
        int n = 0;
        int n2 = -729709989;
        n2 = Integer.rotateLeft(n2 * 988546097, 11) ^ 0x2EFC7E1A;
        int n3 = 1487932956 + n2 ^ 0xD96E31FD ^ 0xD96E31FD;
        while (true) {
            block43: {
                block37: {
                    block29: {
                        block36: {
                            block28: {
                                block30: {
                                    block39: {
                                        block41: {
                                            block33: {
                                                block35: {
                                                    block40: {
                                                        block34: {
                                                            block42: {
                                                                block31: {
                                                                    block32: {
                                                                        block38: {
                                                                            if ((n = n3 - n2) == -341984922) break block28;
                                                                            if (n == 118866121) break block29;
                                                                            int cfr_ignored_0 = (Integer.rotateLeft(0xECC9750 ^ n2, 4) + -819727893) * 248289105;
                                                                            if (n == 1878613532) break block30;
                                                                            if (n == 827302056) break block31;
                                                                            if (n == 1487932956) break block32;
                                                                            int cfr_ignored_1 = (Integer.rotateRight(0xA50E9CB3 ^ n2, 7) + 19044584) * -1525769037;
                                                                            if (n == -524787441) break block33;
                                                                            if (n == 771315674) break block34;
                                                                            if (n == -41860048) break block35;
                                                                            if (n == 788581453) break block36;
                                                                            if (n == 911715964) break block37;
                                                                            if (n == 378402806) break block38;
                                                                            if (n == 546993791) break block39;
                                                                            if (n == -2003502489) break block40;
                                                                            if (n == 33443583) break block41;
                                                                            if (n == 676781871) break block42;
                                                                            break block43;
                                                                        }
                                                                        int cfr_ignored_2 = (Integer.rotateRight(0x7984F336 ^ n2, 18) - -1149824315) * 2038756151;
                                                                        if (tdhdh.dhsm(string) != null) {
                                                                            try {
                                                                                n += 4;
                                                                                if ((0x66648FD659F13C95L ^ (long)n2 | 1L) == 0L) {
                                                                                    throw new IllegalArgumentException();
                                                                                }
                                                                                n3 = 827302056 + n2;
                                                                            }
                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                n3 = 827302056 + n2 + 1965657072 - 1965657072;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            n += 4;
                                                                            if ((0xF04DEA3C223E3EA9L ^ (long)n2 | 1L) == 0L) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            n3 = (int)((long)(676781871 + n2) ^ 0x148D80A864E6B1ACL ^ 0x148D80A864E6B1ACL);
                                                                        }
                                                                        catch (IllegalStateException illegalStateException) {
                                                                            n3 = 676781871 + n2 + 432879182 - 432879182;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_3 = Integer.rotateRight(0x2B5838A2 ^ n2, 8) + 1141668569;
                                                                    if (!this.qs.contains(string)) {
                                                                        try {
                                                                            n += 3;
                                                                            if ((0xBE618CD2072F1947L ^ (long)n2 | 1L) == 0L) {
                                                                                throw new IllegalArgumentException();
                                                                            }
                                                                            n3 = 378402806 + n2;
                                                                        }
                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                            n3 = 378402806 + n2 ^ 0x6C5C765F ^ 0x6C5C765F;
                                                                        }
                                                                        n += 5;
                                                                        continue;
                                                                    }
                                                                    n3 = 473703156 + n2;
                                                                    int cfr_ignored_4 = Integer.rotateLeft(0xB493A388 ^ n2, 9) + -499225421;
                                                                    n3 = 827302056 + n2 + -678893595 - -678893595;
                                                                    n += 3;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_5 = Integer.rotateLeft(0xA76CDE44 ^ n2, 7) - 1250724215;
                                                                throw new IllegalArgumentException("The variable name '" + string + "' is invalid. Since there exists a function with the same name");
                                                            }
                                                            int cfr_ignored_6 = (Integer.rotateRight(0x3852F27F ^ n2, 10) - -697762660) * 944960127;
                                                            return;
                                                        }
                                                        int cfr_ignored_7 = (Integer.rotateRight(0x126AC957 ^ n2, 5) - 1061945540) * 308988247;
                                                        n3 = 1487932956 + n2 + -11226940 - -11226940;
                                                        int cfr_ignored_8 = (Integer.rotateRight(0x60144277 ^ n2, 15) - -1496208476) * 1611940471;
                                                        n -= 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_9 = Integer.rotateRight(0xCC5F1642 ^ n2, 12) + -1008643783;
                                                    n3 = Integer.reverse(Integer.reverse(1065689207 + n2));
                                                    int cfr_ignored_10 = Integer.rotateRight(0xA4A50687 ^ n2, 7) - -195466860;
                                                    try {
                                                        n -= 3;
                                                        if ((0x5344268FCF5ADFDBL ^ (long)n2 | 1L) == 0L) {
                                                            throw new ArithmeticException();
                                                        }
                                                        n3 = (int)((long)(1487932956 + n2) ^ 0x7F5924253F793F1EL ^ 0x7F5924253F793F1EL);
                                                    }
                                                    catch (ArithmeticException arithmeticException) {
                                                        n3 = 1487932956 + n2 + 1177667254 - 1177667254;
                                                    }
                                                    n += 2;
                                                    continue;
                                                }
                                                int cfr_ignored_11 = (Integer.rotateRight(0xBE6FC73F ^ n2, 10) - 333889500) * -1099970753;
                                                try {
                                                    n3 = 1487932956 + n2;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    n3 = 1487932956 + n2 + -321624725 - -321624725;
                                                }
                                                continue;
                                            }
                                            int cfr_ignored_12 = (Integer.rotateRight(0x2F2435BB ^ n2, 8) + -1178591008) * 790902203;
                                            n3 = -1417998050 + n2 ^ 0x4F89DD76 ^ 0x4F89DD76;
                                            int cfr_ignored_13 = (Integer.rotateLeft(0xC46048DC ^ n2, 11) - -871992865) * -1000322851;
                                            try {
                                                n -= 5;
                                                if ((0x17020FD6F266BD95L ^ (long)n2 | 1L) == 0L) {
                                                    throw new ArithmeticException();
                                                }
                                                n3 = Integer.reverse(Integer.reverse(1487932956 + n2));
                                            }
                                            catch (ArithmeticException arithmeticException) {
                                                n3 = 1487932956 + n2 + 911313059 - 911313059;
                                            }
                                            continue;
                                        }
                                        int cfr_ignored_14 = (Integer.rotateLeft(0xF16689D ^ n2, 4) - -669758914) * 253126813;
                                        int cfr_ignored_15 = (int)(0xCDA4C6A027D4EB4FL ^ (long)n2 ^ 0x7030831A2DB83698L);
                                        int cfr_ignored_16 = (int)(0xA9C4B37B0DB91AFCL ^ (long)n2 ^ 0x9B86D7C1CEDEFE58L);
                                        n3 = (int)((long)(1747932743 + n2) ^ 0xA5A921BF67481FD7L ^ 0xA5A921BF67481FD7L);
                                        int cfr_ignored_17 = (int)(0x520ED0DC155906B0L ^ (long)n2 ^ 0x5CC8E601F64709CCL);
                                        n3 = 1487932956 + n2 + 1278955848 - 1278955848;
                                        n += 5;
                                        continue;
                                    }
                                    int cfr_ignored_18 = (Integer.rotateRight(0xCB065D3A ^ n2, 12) + -1708988095) * -888775365;
                                    n3 = Integer.reverse(Integer.reverse(-1303748474 + n2));
                                    int cfr_ignored_19 = Integer.rotateRight(0x1FAF9E46 ^ n2, 6) - -626931275;
                                    try {
                                        n -= 3;
                                        n3 = 1487932956 + n2;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        n3 = (int)((long)(1487932956 + n2) ^ 0x39BD92056A12416L ^ 0x39BD92056A12416L);
                                    }
                                    n += 4;
                                    continue;
                                }
                                int cfr_ignored_20 = (Integer.rotateLeft(0xCE4240B4 ^ n2, 12) - -27036409) * -834518859;
                                n3 = 2053901092 + n2 ^ 0xCD59AC ^ 0xCD59AC;
                                int cfr_ignored_21 = Integer.rotateLeft(0x3E1F17CD ^ n2, 10) - -1977515762;
                                int cfr_ignored_22 = (int)(0xFCADB9F027D4EB4FL ^ (long)n2 ^ 0x8E90831A2DB8548AL);
                                n3 = 1487932956 + n2;
                                continue;
                            }
                            int cfr_ignored_23 = (Integer.rotateLeft(0xEA216AD1 ^ n2, 16) + 1583976074) * -366908719;
                            int cfr_ignored_24 = (int)(0x2893C4EC27D4EB4FL ^ (long)n2 ^ 0x74A8831A2DB9FCF6L);
                            try {
                                n -= 4;
                                if ((0x6646CDC3202801B5L ^ (long)n2 | 1L) == 0L) {
                                    throw new NoSuchElementException();
                                }
                                n3 = 1487932956 + n2 ^ 0x1FC53659 ^ 0x1FC53659;
                            }
                            catch (NoSuchElementException noSuchElementException) {
                                n3 = (int)((long)(1487932956 + n2) ^ 0x6E2EA93B063F560CL ^ 0x6E2EA93B063F560CL);
                            }
                            n -= 3;
                            continue;
                        }
                        int cfr_ignored_25 = Integer.rotateLeft(0x2FB2B3AD ^ n2, 8) - -889102034;
                        int cfr_ignored_26 = (int)(0xED001D9027D4EB4FL ^ (long)n2 ^ 0xC650831A2DB877D1L);
                        int cfr_ignored_27 = (int)(0x2EDEB5EF9CE01EDAL ^ (long)n2 ^ 0x96AFF573C693F06CL);
                        n3 = (int)((long)(510010431 + n2) ^ 0x730F36B2F601483EL ^ 0x730F36B2F601483EL);
                        int cfr_ignored_28 = (int)(0x61FF6B1B31EAC6DBL ^ (long)n2 ^ 0x2B46AF6676916E2FL);
                        n3 = 1487932956 + n2 ^ 0xAFC22FC0 ^ 0xAFC22FC0;
                        n += 3;
                        continue;
                    }
                    int cfr_ignored_29 = (Integer.rotateRight(0xD7439652 ^ n2, 13) + 361550633) * -683436461;
                    try {
                        if ((0x3FE27B9DE22859B3L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = 1487932956 + n2 ^ 0xE0EC6BC8 ^ 0xE0EC6BC8;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = 1487932956 + n2;
                    }
                    continue;
                }
                int cfr_ignored_30 = (Integer.rotateLeft(0x92B39 ^ n2, 3) + 91872034) * 600889;
                int cfr_ignored_31 = (int)(0xC2BB850427D4EB4FL ^ (long)n2 ^ 0xF778831A2DB828A6L);
                n3 = (int)((long)(-1202129411 + n2) ^ 0x62FA5071B3AFB156L ^ 0x62FA5071B3AFB156L);
                int cfr_ignored_32 = (Integer.rotateRight(0xB7C0F9DB ^ n2, 9) + 1153163456) * -1212089893;
                int cfr_ignored_33 = (int)(0x4C3678C9BE65FAF5L ^ (long)n2 ^ 0xCE3B0780ECD35BDL);
                n3 = Integer.reverse(Integer.reverse(1487932956 + n2));
                continue;
            }
            int cfr_ignored_34 = Integer.rotateRight(0x921014E3 ^ n2, 5) + -1269815624;
            n3 = 1487932956 + n2 + -748996033 - -748996033;
        }
    }

    public brw jna_2(Map map) {
        int n = -847137133;
        n = Integer.rotateLeft(n * -1144697279, 11) ^ 0x6A3A55D4;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xF1C9C3F1;
        if ((n2 ^ n) != -238435343) {
            int cfr_ignored_0 = (0x3C487562 ^ n) + 913978981;
        }
        for (Map.Entry entry : map.entrySet()) {
            brw.dky_2(this, (String)entry.getKey(), (Double)entry.getValue());
        }
        return this;
    }

    public brw bqs_2() {
        int n = 218638616;
        int n2 = (n = Integer.rotateLeft(n * 2025946083, 7) ^ 0xCCC409D) ^ 0x1BF3BA59;
        if ((n2 ^ n) != 468957785) {
            int cfr_ignored_0 = (0x16FB9341 ^ n) + -109070120;
        }
        this.dhtr.clear();
        return this;
    }

    public Set khakh_2() {
        int n = 1829411271;
        int n2 = (n = Integer.rotateLeft(n * 1884146633, 9) ^ 0xF1A6B49D) ^ 0xA8B5D810;
        if ((n2 ^ n) != -1464477680) {
            int cfr_ignored_0 = (0xC5BF41D7 ^ n) - -597929691;
        }
        HashSet<String> hashSet = new HashSet<String>();
        for (ght_2 ght2 : this.rthj) {
            if (ght2.bjy() != -1733584772 + 1733584778) continue;
            hashSet.add(((bzgh_2)ght2).getName());
        }
        return hashSet;
    }

    public bys_2 dfh_2(boolean bl) {
        int n = bah_4.thth_3(-1628195825);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x569184CE;
        if ((n2 ^ n) != 1452377294) {
            int cfr_ignored_0 = Integer.rotateLeft(0xC86230C1 ^ n, 12) + 1212253850;
            int cfr_ignored_1 = (int)(0xAD09EFC27D4EB4FL ^ (long)n ^ 0xC088831A2DB9B870L);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>(0);
        if (bl) {
            for (ght_2 ght2 : this.rthj) {
                String object;
                if (ght2.bjy() != (0xB18AF757 ^ 0xB18AF751) || this.dhtr.containsKey(object = ((bzgh_2)ght2).getName())) continue;
                arrayList.add("The setVariable '" + object + "' has not been set");
            }
        }
        int n3 = 0;
        for (ght_2 ght2 : this.rthj) {
            switch (ght2.bjy()) {
                case 1: 
                case 6: {
                    ++n3;
                    break;
                }
                case 2: {
                    bal_2 bal2 = ((bfk)ght2).shnt();
                    if (brw.sby(bal2) != 2) break;
                    --n3;
                    break;
                }
                case 3: {
                    bma bma2 = ((bsz_4)ght2).zdhz();
                    int n4 = bma2.taf_3();
                    if (n4 > n3) {
                        arrayList.add("Not enough arguments for '" + brw.bkd(bma2) + "'");
                    }
                    if (n4 > 1) {
                        n3 -= n4 - 1;
                        break;
                    }
                    if (n4 != 0) break;
                    ++n3;
                }
            }
            if (n3 >= 1) continue;
            arrayList.add("Too many operators");
            return new bys_2(false, arrayList);
        }
        if (n3 > 1) {
            arrayList.add("Too many operands");
        }
        return arrayList.size() == 0 ? bys_2.khghm : new bys_2(false, arrayList);
    }

    public bys_2 skj_2() {
        block0: {
            int n = 607336969;
            n = Integer.rotateLeft(n * -1936129143, 16) ^ 0xDA257430;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 12);
            int n2 = n ^ 0x82EA210;
            if ((n2 ^ n) == 137273872) break block0;
            int cfr_ignored_0 = (0x2C1D9819 ^ n) - 1317050959;
        }
        return brw.khqa_2(this, true);
    }

    public Future jghkh(ExecutorService executorService) {
        block0: {
            int n = -558565014;
            n = Integer.rotateLeft(n * -1131262979, 4) ^ 0x8DD2C1EF;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xCE175F3;
            if ((n2 ^ n) == 216102387) break block0;
            int cfr_ignored_0 = (0xD2558C99 ^ n) - -1733751906;
        }
        return executorService.submit(this::ssth_3);
    }

    public double ssth_3() {
        int n = -1166923873;
        n = Integer.rotateLeft(n * 1825013851, 19) ^ 0xAB1F992E;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 23);
        int n2 = n ^ 0xE7AFC30;
        if ((n2 ^ n) != 242940976) {
            int cfr_ignored_0 = (0xB408DBAF ^ n) + -445391383;
        }
        if (!yf.khdha_2()) {
            brw.btr();
            throw null;
        }
        tts tts2 = new tts();
        for (ght_2 ght2 : this.rthj) {
            Object object;
            if (ght2.bjy() == 1) {
                tts2.dhhth_2(((bam_2)ght2).dsd_8());
                continue;
            }
            if (brw.zfkh_2(ght2) == (0x4F6DD991 ^ 0x4F6DD997)) {
                object = brw.zath_4((bzgh_2)ght2);
                Double d = (Double)this.dhtr.get(object);
                if (d == null) {
                    throw new IllegalArgumentException("No value has been set for the setVariable '" + (String)object + "'.");
                }
                tts2.dhhth_2(brw.ghaz(d));
                continue;
            }
            if (ght2.bjy() == 2) {
                object = (bfk)ght2;
                if (tts2.thm_4() < brw.jfh(brw.aah_4((bfk)object))) {
                    throw new IllegalArgumentException("Invalid number of operands available for '" + ((bfk)object).shnt().dhsh_7() + "' operator");
                }
                if (brw.b_2(((bfk)object).shnt()) == 2) {
                    double d = brw.tdha_4(tts2);
                    double d2 = brw.dhrk(tts2);
                    tts2.dhhth_2(brw.swb_2(brw.zngh((bfk)object), new double[]{d2, d}));
                    continue;
                }
                if (((bfk)object).shnt().zbn_2() != 1) continue;
                double d = tts2.bthk();
                tts2.dhhth_2(brw.smw_2((bfk)object).sd_3(d));
                continue;
            }
            if (ght2.bjy() != 3) continue;
            object = (bsz_4)ght2;
            int n3 = brw.fw_2(((bsz_4)object).zdhz());
            if (tts2.thm_4() < n3) {
                throw new IllegalArgumentException("Invalid number of arguments available for '" + ((bsz_4)object).zdhz().getName() + "' function");
            }
            double[] dArray = new double[n3];
            for (int i = n3 - 1; i >= 0; --i) {
                dArray[i] = tts2.bthk();
            }
            tts2.dhhth_2(brw.khzd_4((bsz_4)object).bay(dArray));
        }
        if (tts2.thm_4() > 1) {
            throw new IllegalArgumentException("Invalid number of items on the output queue. Might be caused by an invalid number of arguments for a function.");
        }
        return tts2.bthk();
    }

    private static String athr(String string, int n, int n2, int n3) {
        int n4 = 41911507;
        n4 = Integer.rotateLeft(n4 * 1592111313, 27) ^ 0x794C9982;
        String string2 = string;
        n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 17);
        int n5 = (n4 = Integer.rotateRight(n ^ n4, 5)) ^ 0x3F107966;
        if ((n5 ^ n4) != 1058044262) {
            int cfr_ignored_0 = (0x3D6FFDB5 ^ n4) + -543442633;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x4A606F0D ^ n2 - i) + ttq, 14) ^ dha + i * 609845151));
        }
        return new String(cArray);
    }

    private static Double sd(double d) {
        block0: {
            int n = 877482507;
            n = Integer.rotateLeft(n * -95754983, 24) ^ 0x4A392860;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x1905C678;
            if ((n2 ^ n) == 419808888) break block0;
            int cfr_ignored_0 = (0x2D489473 ^ n) + -46629056;
        }
        return d;
    }

    private static Double raz_4(double d) {
        block0: {
            int n = 349369749;
            n = Integer.rotateLeft(n * 273690593, 9) ^ 0xD73D9125;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x86AB1058;
            if ((n2 ^ n) == -2035609512) break block0;
            int cfr_ignored_0 = (0x9279E5CD ^ n) - -854850797;
        }
        return d;
    }

    private static Double btsh_2(double d) {
        block0: {
            int n = 437997419;
            n = Integer.rotateLeft(n * 221907597, 27) ^ 0xDEF986C;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0xCFDBBEF5;
            if ((n2 ^ n) == -807682315) break block0;
            int cfr_ignored_0 = (0xD5C0F19E ^ n) - -1437878061;
        }
        return d;
    }

    private static brw dky_2(brw brw2, String string, double d) {
        block0: {
            int n = 1301989491;
            n = Integer.rotateLeft(n * -1089447543, 19) ^ 0xAFABE2AA;
            brw brw3 = brw2;
            n = Integer.rotateLeft((brw3 != null ? System.identityHashCode(brw3) : 0) ^ n, 25);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 2);
            int n2 = n ^ 0xEEA9DC07;
            if ((n2 ^ n) == -290857977) break block0;
            int cfr_ignored_0 = (0xA3331474 ^ n) + -1707920657;
        }
        return brw2.zthn_2(string, d);
    }

    private static int sby(bal_2 bal2) {
        block0: {
            int n = -1015220556;
            int n2 = (n = Integer.rotateLeft(n * -1724359679, 8) ^ 0x163AAED) ^ 0xFC610313;
            if ((n2 ^ n) == -60751085) break block0;
            int cfr_ignored_0 = (0x3F1DF5A7 ^ n) + -1875541877;
        }
        return bal2.zbn_2();
    }

    private static String bkd(bma bma2) {
        block0: {
            int n = -61277853;
            int n2 = (n = Integer.rotateLeft(n * 1055504335, 5) ^ 0x5FB0641E) ^ 0xF7704900;
            if ((n2 ^ n) == -143636224) break block0;
            int cfr_ignored_0 = (0xB28B063 ^ n) + 366314873;
        }
        return bma2.getName();
    }

    private static bys_2 khqa_2(brw brw2, boolean bl) {
        block0: {
            int n = bah_4.thth_3(573947733);
            int n2 = n ^ 0x87D66CD1;
            if ((n2 ^ n) == -2015990575) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xA5E3D384 ^ n, 7) - 452213815;
        }
        return brw2.dfh_2(bl);
    }

    private static void btr() {
        int n = bah_4.thth_3(242219910);
        int n2 = n ^ 0xB0A288D;
        if ((n2 ^ n) != 185215117) {
            int cfr_ignored_0 = Integer.rotateRight(0x565D30B ^ n, 3) + -1414386288;
        }
        yf.athz_2();
    }

    private static int zfkh_2(ght_2 ght2) {
        block0: {
            int n = 1703093804;
            n = Integer.rotateLeft(n * -260879929, 25) ^ 0x66938DAA;
            ght_2 ght3 = ght2;
            n = Integer.rotateRight((ght3 != null ? System.identityHashCode(ght3) : 0) ^ n, 28);
            int n2 = n ^ 0xF90122E1;
            if ((n2 ^ n) == -117366047) break block0;
            int cfr_ignored_0 = (0x9C8204CD ^ n) - -388143877;
        }
        return ght2.bjy();
    }

    private static String zath_4(bzgh_2 bzgh2_2) {
        block0: {
            int n = bah_4.thth_3(718367196);
            bzgh_2 bzgh3 = bzgh2_2;
            n = Integer.rotateRight((bzgh3 != null ? System.identityHashCode(bzgh3) : 0) ^ n, 13);
            int n2 = n ^ 0xC1AFF9C7;
            if ((n2 ^ n) == -1045431865) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xEB7E901B ^ n, 16) + -2001661312) * -344027109;
        }
        return bzgh2_2.getName();
    }

    private static double ghaz(Double d) {
        block0: {
            int n = -179720422;
            int n2 = (n = Integer.rotateLeft(n * -1847345457, 4) ^ 0xAD02231D) ^ 0xD01EFB2B;
            if ((n2 ^ n) == -803275989) break block0;
            int cfr_ignored_0 = (0x25575431 ^ n) + 658229959;
        }
        return d;
    }

    private static bal_2 aah_4(bfk bfk2) {
        block0: {
            int n = 1410259445;
            int n2 = (n = Integer.rotateLeft(n * -896973453, 23) ^ 0x67966FD4) ^ 0xD0A343E8;
            if ((n2 ^ n) == -794606616) break block0;
            int cfr_ignored_0 = (0x84AD9A1D ^ n) - -1810939853;
        }
        return bfk2.shnt();
    }

    private static int jfh(bal_2 bal2) {
        block0: {
            int n = 1547886371;
            n = Integer.rotateLeft(n * -118781429, 7) ^ 0xA0C3AC60;
            bal_2 bal3 = bal2;
            n = Integer.rotateLeft((bal3 != null ? System.identityHashCode(bal3) : 0) ^ n, 2);
            int n2 = n ^ 0x2CF9CB14;
            if ((n2 ^ n) == 754567956) break block0;
            int cfr_ignored_0 = (0x70BB1437 ^ n) + -1927832606;
        }
        return bal2.zbn_2();
    }

    private static int b_2(bal_2 bal2) {
        block0: {
            int n = -679129035;
            n = Integer.rotateLeft(n * 2092237677, 11) ^ 0x31B18B9A;
            bal_2 bal3 = bal2;
            n = Integer.rotateRight((bal3 != null ? System.identityHashCode(bal3) : 0) ^ n, 19);
            int n2 = n ^ 0x578797DA;
            if ((n2 ^ n) == 1468504026) break block0;
            int cfr_ignored_0 = (0x8002C7EF ^ n) - 1421574382;
        }
        return bal2.zbn_2();
    }

    private static double tdha_4(tts tts2) {
        block0: {
            int n = bah_4.thth_3(-719277009);
            int n2 = n ^ 0x28589E82;
            if ((n2 ^ n) == 676896386) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xFD782AAD ^ n, 18) - -1242904018;
            int cfr_ignored_1 = (int)(0x3FCA849027D4EB4FL ^ (long)n ^ 0xF450831A2DB9D244L);
        }
        return tts2.bthk();
    }

    private static double dhrk(tts tts2) {
        block0: {
            int n = 1172244970;
            int n2 = (n = Integer.rotateLeft(n * -1705999059, 18) ^ 0xED6D640B) ^ 0x87A97A52;
            if ((n2 ^ n) == -2018936238) break block0;
            int cfr_ignored_0 = (0xC27673B8 ^ n) - 2024770999;
        }
        return tts2.bthk();
    }

    private static bal_2 zngh(bfk bfk2) {
        block0: {
            int n = 1169358435;
            n = Integer.rotateLeft(n * -1081276441, 18) ^ 0x2778B69A;
            bfk bfk3 = bfk2;
            n = Integer.rotateLeft((bfk3 != null ? System.identityHashCode(bfk3) : 0) ^ n, 25);
            int n2 = n ^ 0xB2E2E96C;
            if ((n2 ^ n) == -1293751956) break block0;
            int cfr_ignored_0 = (0xF750170F ^ n) + -2128114905;
        }
        return bfk2.shnt();
    }

    private static double swb_2(bal_2 bal2, double[] dArray) {
        block0: {
            int n = -757302531;
            int n2 = (n = Integer.rotateLeft(n * -1122025395, 28) ^ 0x88239EDC) ^ 0x2D36EA21;
            if ((n2 ^ n) == 758573601) break block0;
            int cfr_ignored_0 = (0xFFEA90DC ^ n) + 1858932096;
        }
        return bal2.sd_3(dArray);
    }

    private static bal_2 smw_2(bfk bfk2) {
        block0: {
            int n = 50569593;
            n = Integer.rotateLeft(n * 1174825099, 10) ^ 0x98ED0B07;
            bfk bfk3 = bfk2;
            n = (bfk3 != null ? System.identityHashCode(bfk3) : 0) ^ n;
            int n2 = n ^ 0x51482596;
            if ((n2 ^ n) == 1363682710) break block0;
            int cfr_ignored_0 = (0x524B84EF ^ n) - -1388369135;
        }
        return bfk2.shnt();
    }

    private static int fw_2(bma bma2) {
        block0: {
            int n = -110418307;
            n = Integer.rotateLeft(n * 175931795, 7) ^ 0x999947BE;
            bma bma3 = bma2;
            n = Integer.rotateLeft((bma3 != null ? System.identityHashCode(bma3) : 0) ^ n, 19);
            int n2 = n ^ 0x633DADC8;
            if ((n2 ^ n) == 1664986568) break block0;
            int cfr_ignored_0 = (0x9A568BB5 ^ n) - 615528651;
        }
        return bma2.taf_3();
    }

    private static bma khzd_4(bsz_4 bsz2_2) {
        block0: {
            int n = 195689489;
            n = Integer.rotateLeft(n * -1985076415, 18) ^ 0xEB51C56B;
            bsz_4 bsz3_2 = bsz2_2;
            n = Integer.rotateRight((bsz3_2 != null ? System.identityHashCode(bsz3_2) : 0) ^ n, 15);
            int n2 = n ^ 0x7E510A14;
            if ((n2 ^ n) == 2119240212) break block0;
            int cfr_ignored_0 = (0x75F8F605 ^ n) + -776997500;
        }
        return bsz2_2.zdhz();
    }

    private static String shrt(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bah_4.thth_3(1666261411);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n3 ^ n4) ^ 0xD6219E53;
            if ((n5 ^ n4) == -702439853) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xB570BFF0 ^ n4, 9) + -50012853) * -1250902031;
        }
        return brw.athr(string, n, n2, n3);
    }

    private static String[] khfh_2(String string) {
        block0: {
            int n = 2056985215;
            int n2 = (n = Integer.rotateLeft(n * -860977571, 23) ^ 0x96280ADF) ^ 0xB03E1DB4;
            if ((n2 ^ n) == -1338106444) break block0;
            int cfr_ignored_0 = (0xCAA507CB ^ n) - -1242423137;
        }
        return string.split("\u0004\u001f", -1);
    }

    private static CallSite smsh_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -152662664;
            n3 = Integer.rotateLeft(n3 * -1382359591, 21) ^ 0x32074DF1;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 14);
            n3 = Integer.rotateLeft(n ^ n3, 24);
            int n4 = n3 ^ 0xD100EEC9;
            if ((n4 ^ n3) != -788468023) {
                int cfr_ignored_0 = (0x27E663B1 ^ n3) + -391230784;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bns ^ string.hashCode()) + (n2 + tkb) + i ^ bns, 18) + tkb);
            }
            String[] stringArray = brw.khfh_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType3) : lookup.findVirtual(clazz, stringArray[3], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] j7wtlc2yfb(String string) {
        return string.split("\u0002\u001d", -1);
    }

    private static CallSite lmouikeb(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ bwglbor ^ string.hashCode() ^ n2 + m1z501u2ffx5 ^ i * -679403035 ^ bwglbor, 24) ^ m1z501u2ffx5));
            }
            String[] stringArray = brw.j7wtlc2yfb(new String(cArray));
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

