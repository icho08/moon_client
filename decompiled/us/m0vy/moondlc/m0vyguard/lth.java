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
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import us.m0vy.moondlc.m0vyguard.bkhm;
import us.m0vy.moondlc.m0vyguard.bzs_2;
import us.m0vy.moondlc.m0vyguard.bs;
import us.m0vy.moondlc.m0vyguard.bzn_2;
import us.m0vy.moondlc.m0vyguard.bghsh;
import us.m0vy.moondlc.m0vyguard.bhd_4;
import us.m0vy.moondlc.m0vyguard.tjk;
import us.m0vy.moondlc.m0vyguard.dth_3;
import us.m0vy.moondlc.m0vyguard.zk;
import us.m0vy.moondlc.m0vyguard.da_4;
import us.m0vy.moondlc.m0vyguard.nj;
import us.m0vy.moondlc.m0vyguard.yf;

public class lth {
    private final tjk[] ghgh;
    private final Map bhb;
    private final Set jwj;
    private static final int thh_2 = 692174973;
    private static final int dhqa_2 = -1497011256;
    private static final int az = 1353846772;
    private static final int hdz_3 = 852815915;
    private static final int q3puoii7ml = -557802719;
    private static final int ls34mj01ydqlg = 252114161;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int q9j3fz6l;

    private static Map dft() {
        try {
            int n = -605813833;
            n = Integer.rotateLeft(n * -386791145, 11) ^ 0xDA88BA4C;
            int n2 = n ^ 0xA9B77818;
            if ((n2 ^ n) != -1447593960) {
                int cfr_ignored_0 = (0x72537BAF ^ n) + -576523044;
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
        HashMap<String, Double> hashMap = new HashMap<String, Double>(4);
        hashMap.put("pi", lth.zdhq_2(Double.longBitsToDouble(0x4821988978E0738AL ^ 0x828B9722CA45E92L)));
        hashMap.put("\u03c0", Double.longBitsToDouble(0xDC40CB2026AC61DFL ^ 0x9C49EADB72E84CC7L));
        hashMap.put(lth.slf("", 0x68F330FC ^ 0xD063636D, -837280636 + -152762378, lth.saz_3(-1834600439) ^ 0xAD7BBE5E), Double.longBitsToDouble(0xFBCA4FF83D050ECAL ^ 0xC433AC8FA692485FL));
        hashMap.put("e", Double.longBitsToDouble(0xE6B797B713EA4205L ^ 0xA6B228BD98FE156CL));
        return hashMap;
    }

    public lth(lth lth2) {
        this.ghgh = Arrays.copyOf(lth2.ghgh, lth2.ghgh.length);
        this.bhb = new HashMap();
        this.bhb.putAll(lth2.bhb);
        this.jwj = new HashSet(lth2.jwj);
    }

    public lth(tjk[] tjkArray) {
        this.ghgh = tjkArray;
        this.bhb = lth.dft();
        this.jwj = Collections.emptySet();
    }

    public lth(tjk[] tjkArray, Set set) {
        this.ghgh = tjkArray;
        this.bhb = lth.dft();
        this.jwj = set;
    }

    public lth ssy_2(String string, double d) {
        int n = da_4.bzj(-470899755);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 24);
        int n2 = n ^ 0xE48BB7E;
        if ((n2 ^ n) != 239647614) {
            int cfr_ignored_0 = Integer.rotateRight(0xEDA618AB ^ n, 16) + -881157136;
        }
        lth.thkh_4(this, string);
        this.bhb.put(string, d);
        return this;
    }

    private void zghkh(String string) {
        try {
            int n = -412948778;
            n = Integer.rotateLeft(n * 1758015503, 28) ^ 0xEA4E8116;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x60DDC40B;
            if ((n2 ^ n) != 1625146379) {
                int cfr_ignored_0 = (0x87BF22DD ^ n) - -1856280265;
            }
            if ((0x342 & 0) != 0) {
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
        if (this.jwj.contains(string) || bkhm.jsf(string) != null) {
            throw new IllegalArgumentException("The variable name '" + string + "' is invalid. Since there exists a function with the same name");
        }
    }

    public lth khya_2(Map map) {
        int n = -509037590;
        n = Integer.rotateLeft(n * -287921681, 25) ^ 0x2D5914E1;
        n = System.identityHashCode(this) ^ n;
        Map map2 = map;
        n = Integer.rotateRight((map2 != null ? System.identityHashCode(map2) : 0) ^ n, 22);
        int n2 = n ^ 0x1DE5E03E;
        if ((n2 ^ n) != 501604414) {
            int cfr_ignored_0 = (0xFC4D53D4 ^ n) - -1252082195;
        }
        if (lth.sah_6()) {
            throw null;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.ssy_2((String)entry.getKey(), (Double)entry.getValue());
        }
        return this;
    }

    public lth ssth_4() {
        try {
            int n = -803726284;
            n = Integer.rotateLeft(n * -425175465, 20) ^ 0x569A1FD5;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xCBEFD956;
            if ((n2 ^ n) != -873473706) {
                int cfr_ignored_0 = (0x1BF7C562 ^ n) - -481985846;
            }
            if ((0x1A6 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        this.bhb.clear();
        return this;
    }

    public Set hra_2() {
        try {
            int n = 1450533873;
            n = Integer.rotateLeft(n * -1996560391, 28) ^ 0x7FEB7300;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0x6CDAD95;
            if ((n2 ^ n) != 114142613) {
                int cfr_ignored_0 = (0x50B8CE64 ^ n) - -1750366951;
            }
            if ((0x1F6 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        HashSet<String> hashSet = new HashSet<String>();
        for (tjk tjk2 : this.ghgh) {
            if (tjk2.tghf() != Integer.rotateLeft(0x667BFE45 ^ 0x6678FE45, 17)) continue;
            hashSet.add(((dth_3)tjk2).getName());
        }
        return hashSet;
    }

    public bzs_2 nz_2(boolean bl) {
        int n = 1610722403;
        n = Integer.rotateLeft(n * 1501124049, 21) ^ 0x2C907C5;
        n = System.identityHashCode(this) ^ n;
        int n2 = (n = Integer.rotateLeft(bl ^ n, 8)) ^ 0xC00DFDB5;
        if ((n2 ^ n) != -1072824907) {
            int cfr_ignored_0 = (0xA00C51D6 ^ n) - 470954008;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>(0);
        if (bl) {
            for (tjk tjk2 : this.ghgh) {
                String object;
                if (tjk2.tghf() != Integer.rotateLeft(0x3BB16716 ^ 0x37B16716, 7) || this.bhb.containsKey(object = ((dth_3)tjk2).getName())) continue;
                arrayList.add("The setVariable '" + object + "' has not been set");
            }
        }
        int n3 = 0;
        for (tjk tjk2 : this.ghgh) {
            switch (tjk2.tghf()) {
                case 1: 
                case 6: {
                    ++n3;
                    break;
                }
                case 2: {
                    zk zk2 = ((bghsh)tjk2).jkk();
                    if (zk2.tss() != 2) break;
                    --n3;
                    break;
                }
                case 3: {
                    bhd_4 bhd2 = ((nj)tjk2).jsgh_2();
                    int n4 = bhd2.rzdh_2();
                    if (n4 > n3) {
                        arrayList.add("Not enough arguments for '" + bhd2.getName() + "'");
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
            arrayList.add("Too many op".concat("erators"));
            return new bzs_2(false, arrayList);
        }
        if (n3 > 1) {
            arrayList.add("Too many operands");
        }
        return arrayList.size() == 0 ? bzs_2.blw : new bzs_2(false, arrayList);
    }

    public bzs_2 sqt_3() {
        block0: {
            int n = 14831779;
            int n2 = (n = Integer.rotateLeft(n * -1834039015, 13) ^ 0x86F9C091) ^ 0xDF3A6452;
            if ((n2 ^ n) == -549821358) break block0;
            int cfr_ignored_0 = (0xDFD834F1 ^ n) - -1421828143;
        }
        return this.nz_2(true);
    }

    public Future tbh(ExecutorService executorService) {
        block0: {
            int n = 486995583;
            n = Integer.rotateLeft(n * 288902633, 17) ^ 0xE7CC88AC;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 29);
            ExecutorService executorService2 = executorService;
            n = (executorService2 != null ? System.identityHashCode(executorService2) : 0) ^ n;
            int n2 = n ^ 0x9A865523;
            if ((n2 ^ n) == -1702472413) break block0;
            int cfr_ignored_0 = (0x8780A35C ^ n) + -1200722842;
        }
        return executorService.submit(this::tkz_4);
    }

    public double tkz_4() {
        int n = -1667864393;
        n = Integer.rotateLeft(n * 513957267, 28) ^ 0x8E3522B3;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x30325B98;
        if ((n2 ^ n) != 808606616) {
            int cfr_ignored_0 = (0xACA4332F ^ n) + -1487793220;
        }
        bs bs2 = new bs();
        for (tjk tjk2 : this.ghgh) {
            Object object;
            if (lth.shghf(tjk2) == 1) {
                bs2.asd_3(lth.dght_2((bzn_2)tjk2));
                continue;
            }
            if (lth.tzw_4(tjk2) == Integer.rotateLeft(0x3AE372C9 ^ 0x3A8372C9, 12)) {
                object = ((dth_3)tjk2).getName();
                Double d = (Double)this.bhb.get(object);
                if (d == null) {
                    throw new IllegalArgumentException("No value has been set for the setVariable '" + (String)object + "'.");
                }
                bs2.asd_3(d);
                continue;
            }
            if (tjk2.tghf() == 2) {
                object = (bghsh)tjk2;
                if (lth.khbs(bs2) < ((bghsh)object).jkk().tss()) {
                    throw new IllegalArgumentException("Invalid number of operands available for '" + ((bghsh)object).jkk().rsw() + "' operator");
                }
                if (((bghsh)object).jkk().tss() == 2) {
                    double d = bs2.dtt();
                    double d2 = bs2.dtt();
                    bs2.asd_3(lth.hshn(((bghsh)object).jkk(), new double[]{d2, d}));
                    continue;
                }
                if (lth.jkt_2((bghsh)object).tss() != 1) continue;
                double d = bs2.dtt();
                bs2.asd_3(((bghsh)object).jkk().baz_2(d));
                continue;
            }
            if (lth.tagh_3(tjk2) != 3) continue;
            object = (nj)tjk2;
            int n3 = ((nj)object).jsgh_2().rzdh_2();
            if (bs2.bds_4() < n3) {
                throw new IllegalArgumentException("Invalid number of arguments available for '" + lth.hqy(((nj)object).jsgh_2()) + "' function");
            }
            double[] dArray = new double[n3];
            for (int i = n3 - 1; i >= 0; --i) {
                dArray[i] = bs2.dtt();
            }
            bs2.asd_3(((nj)object).jsgh_2().d_2(dArray));
        }
        if (bs2.bds_4() > 1) {
            throw new IllegalArgumentException("Invalid number of items on the output queue. Might be caused by an invalid number of arguments for a function.");
        }
        return lth.sdkh_2(bs2);
    }

    private static String slf(String string, int n, int n2, int n3) {
        int n4 = -1284417127;
        n4 = Integer.rotateLeft(n4 * 1522482993, 17) ^ 0x75935A4D;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateLeft(n ^ n4, 26)) ^ 0xEDAF7B5A;
        if ((n5 ^ n4) != -307266726) {
            int cfr_ignored_0 = (0x5EDE22C3 ^ n4) - 23056187;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x3872A422) + n2 ^ i * -1266619723) ^ thh_2) + dhqa_2);
        }
        return new String(cArray);
    }

    private static String dtq_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 577109709;
            n4 = Integer.rotateLeft(n4 * 1697748749, 7) ^ 0x20BDC2BD;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 8);
            int n5 = (n4 = n ^ n4) ^ 0xD0E7FEC2;
            if ((n5 ^ n4) == -790102334) break block0;
            int cfr_ignored_0 = (0xF282000F ^ n4) - 12052375;
        }
        return lth.slf(string, n, n2, n3);
    }

    private static Double zdhq_2(double d) {
        block0: {
            int n = 1838614767;
            int n2 = (n = Integer.rotateLeft(n * -2115519881, 9) ^ 0xA9EFD6B6) ^ 0xBFE32F0D;
            if ((n2 ^ n) == -1075630323) break block0;
            int cfr_ignored_0 = (0xD27427E2 ^ n) + -313675952;
        }
        return d;
    }

    private static String dwt(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 876242805;
            int n5 = (n4 = Integer.rotateLeft(n4 * -107785097, 18) ^ 0xF3C1A70) ^ 0xFD1931BE;
            if ((n5 ^ n4) == -48680514) break block0;
            int cfr_ignored_0 = (0xC92356CB ^ n4) - -35437340;
        }
        return lth.slf(string, n, n2, n3);
    }

    private static int saz_3(int n) {
        block0: {
            int n2 = 336081654;
            int n3 = (n2 = Integer.rotateLeft(n2 * 331861633, 3) ^ 0x44C6F7CA) ^ 0x293986D7;
            if ((n3 ^ n2) == 691635927) break block0;
            int cfr_ignored_0 = (0x3D31B421 ^ n2) - -1760570140;
        }
        return Integer.reverse(n);
    }

    private static void thkh_4(lth lth2, String string) {
        int n = 157631884;
        n = Integer.rotateLeft(n * 445831379, 8) ^ 0x7700B130;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x52F8BC50;
        if ((n2 ^ n) != 1392032848) {
            int cfr_ignored_0 = (0x5B9DF9DC ^ n) - -973505827;
        }
        lth2.zghkh(string);
    }

    private static boolean sah_6() {
        block0: {
            int n = 8737953;
            int n2 = (n = Integer.rotateLeft(n * 634252963, 5) ^ 0x196C9F3B) ^ 0x6C9A97F6;
            if ((n2 ^ n) == 1822070774) break block0;
            int cfr_ignored_0 = (0x6C1FC357 ^ n) + 1799248395;
        }
        return yf.dnkh();
    }

    private static int shghf(tjk tjk2) {
        block0: {
            int n = -611244153;
            int n2 = (n = Integer.rotateLeft(n * -1104356681, 28) ^ 0x9A6F63B4) ^ 0x86554D8B;
            if ((n2 ^ n) == -2041229941) break block0;
            int cfr_ignored_0 = (0x5DC46A0C ^ n) - 193029680;
        }
        return tjk2.tghf();
    }

    private static double dght_2(bzn_2 bzn2) {
        block0: {
            int n = 1693211338;
            n = Integer.rotateLeft(n * -1373519583, 6) ^ 0x7FAD8CCB;
            bzn_2 bzn3 = bzn2;
            n = Integer.rotateRight((bzn3 != null ? System.identityHashCode(bzn3) : 0) ^ n, 19);
            int n2 = n ^ 0x4ADFC8A;
            if ((n2 ^ n) == 78511242) break block0;
            int cfr_ignored_0 = (0x6041A640 ^ n) + 1515406114;
        }
        return bzn2.srr();
    }

    private static int tzw_4(tjk tjk2) {
        block0: {
            int n = da_4.bzj(931674770);
            tjk tjk3 = tjk2;
            n = Integer.rotateLeft((tjk3 != null ? System.identityHashCode(tjk3) : 0) ^ n, 19);
            int n2 = n ^ 0x5B9833BF;
            if ((n2 ^ n) == 1536701375) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x6C10092D ^ n, 16) - 441367470;
            int cfr_ignored_1 = (int)(0xAEA2A71027D4EB4FL ^ (long)n ^ 0xB350831A2DB8F094L);
        }
        return tjk2.tghf();
    }

    private static int khbs(bs bs2) {
        block0: {
            int n = da_4.bzj(-1804190844);
            bs bs3 = bs2;
            n = (bs3 != null ? System.identityHashCode(bs3) : 0) ^ n;
            int n2 = n ^ 0x5D85EA65;
            if ((n2 ^ n) == 1569057381) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xC9F3D1E1 ^ n, 12) + 2028210554;
            int cfr_ignored_1 = (int)(0xB417FDC27D4EB4FL ^ (long)n ^ 0x2C8831A2DB9BB53L);
        }
        return bs2.bds_4();
    }

    private static double hshn(zk zk2, double[] dArray) {
        block0: {
            int n = -1237380052;
            n = Integer.rotateLeft(n * 1761855459, 3) ^ 0xC1AEBB44;
            zk zk3 = zk2;
            n = (zk3 != null ? System.identityHashCode(zk3) : 0) ^ n;
            int n2 = n ^ 0x99ECFB36;
            if ((n2 ^ n) == -1712522442) break block0;
            int cfr_ignored_0 = (0x2FD3EF1A ^ n) - -438005343;
        }
        return zk2.baz_2(dArray);
    }

    private static zk jkt_2(bghsh bghsh2) {
        block0: {
            int n = 891269598;
            int n2 = (n = Integer.rotateLeft(n * 1449706233, 23) ^ 0xFDC73778) ^ 0xD6F18C19;
            if ((n2 ^ n) == -688813031) break block0;
            int cfr_ignored_0 = (0xE3EE3DC7 ^ n) - 1912680920;
        }
        return bghsh2.jkk();
    }

    private static int tagh_3(tjk tjk2) {
        block0: {
            int n = da_4.bzj(-1209383250);
            int n2 = n ^ 0xFECC68B4;
            if ((n2 ^ n) == -20158284) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x49262E1A ^ n, 12) + -537054111) * 1227238939;
        }
        return tjk2.tghf();
    }

    private static String hqy(bhd_4 bhd2) {
        block0: {
            int n = 1306475192;
            int n2 = (n = Integer.rotateLeft(n * -1945375011, 17) ^ 0x649538EF) ^ 0xA4E4F113;
            if ((n2 ^ n) == -1528499949) break block0;
            int cfr_ignored_0 = (0xE93BCBAB ^ n) + 1067766891;
        }
        return bhd2.getName();
    }

    private static String dgh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1933381557;
            n4 = Integer.rotateLeft(n4 * -732395865, 4) ^ 0x3C52AA66;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 18)) ^ 0xB3073587;
            if ((n5 ^ n4) == -1291373177) break block0;
            int cfr_ignored_0 = (0x3FC5C5CC ^ n4) + -1959681197;
        }
        return lth.slf(string, n, n2, n3);
    }

    private static double sdkh_2(bs bs2) {
        block0: {
            int n = 1007785874;
            n = Integer.rotateLeft(n * -1896921281, 21) ^ 0x1CAC8E2D;
            bs bs3 = bs2;
            n = Integer.rotateRight((bs3 != null ? System.identityHashCode(bs3) : 0) ^ n, 23);
            int n2 = n ^ 0x1F20A445;
            if ((n2 ^ n) == 522232901) break block0;
            int cfr_ignored_0 = (0x233133D7 ^ n) - -604229353;
        }
        return bs2.dtt();
    }

    private static String[] khn(String string) {
        block0: {
            int n = 2121738911;
            int n2 = (n = Integer.rotateLeft(n * -2021322105, 15) ^ 0x9692FD27) ^ 0x665E3085;
            if ((n2 ^ n) == 1717448837) break block0;
            int cfr_ignored_0 = (0x18291A1A ^ n) + -621467322;
        }
        return string.split("\u0002\u001a", -1);
    }

    private static CallSite djz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 454187718;
            n3 = Integer.rotateLeft(n3 * -1905095417, 26) ^ 0xCBC06B57;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 15);
            int n4 = n3 ^ 0x57715CC;
            if ((n4 ^ n3) != 91690444) {
                int cfr_ignored_0 = (0x1E654F0A ^ n3) + -994135933;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ az ^ string.hashCode() ^ n2 + hdz_3 + i * 901222189) + az) ^ hdz_3));
            }
            String[] stringArray = lth.khn(new String(cArray));
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

    private static String[] wg7899oh163k0(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite gfl5tgvuw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ q3puoii7ml ^ string.hashCode() ^ n2 + ls34mj01ydqlg ^ i * -1015599407 ^ q3puoii7ml, 18) ^ ls34mj01ydqlg));
            }
            String[] stringArray = lth.wg7899oh163k0(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

