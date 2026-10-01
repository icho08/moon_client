/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;
import us.m0vy.moondlc.m0vyguard.tdhn;

public final class yf {
    private static volatile yf INSTANCE;
    private final boolean tsd_2 = "1".equals(yf.wm("moondlc.launc".concat("her.present")));
    private final long ssj = yf.tns_4(yf.wm("moondlc.launcher.pid"), 0xF2336D24B8402008L ^ 0xDCC92DB47BFDFF7L);
    private final String sdk = yf.tghl(yf.wm("moondlc.a".concat("uth.username")));
    private final String jzl_2 = yf.tghl(yf.wm("moondlc".concat(".auth.hwid")));
    private final long rmr = yf.tns_4(yf.wm("moondlc.au".concat("th.uid")), 0x52DD439641033CFEL ^ 0xAD22BC69BEFCC301L);
    private final String tbk = yf.tghl(yf.wm("moondlc.au".concat("th.ticket")));
    private final String thdsh_2 = yf.tghl(yf.wm("moondlc.auth.plan"));
    private final long thka_2 = yf.tns_4(yf.wm("moondlc.auth.expiry"), 0L);
    private final long shtm_2 = yf.tns_4(yf.wm("moondlc.auth.timeleft"), 0L);
    private final String rls_2 = yf.tghl(yf.wm("moondlc.auth.modVersion"));
    private final String btz_4 = yf.tghl(yf.wm("moondlc.auth.".concat("launcherVersion")));
    private final String khtk = yf.tghl(yf.wm("moondlc.auth.endpoint"));
    private final String tkm = yf.ghzb_2(yf.wm("moondlc.auth.uuid"), yf.wm("moondlc.auth.".concat("minecraftUuid")), yf.wm("moondlc.aut".concat("h.mcUuid")), yf.wm("moondlc.user.uuid"));
    private final String dmq = yf.ghzb_2(yf.wm("moondlc.auth.".concat("avatarPath")), yf.wm("moondlc.au".concat("th.avatarFile")), yf.wm("moondlc.launcher.avatarPath"));
    private final String khw = yf.ghzb_2(yf.wm("moondlc.au".concat("th.avatarUrl")), yf.wm("moondlc.laun".concat("cher.avatarUrl")));
    private final String dshd_2 = yf.ghzb_2(yf.wm("moondlc.aut".concat("h.avatarBase64")), yf.wm("moondlc.launche".concat("r.avatarBase64")));
    private static volatile boolean hwl;
    private static volatile long wh_2;
    private static final int zshf = -432429621;
    private static final int jnh_2 = 804073247;
    private static final int dhkw = 1245482642;
    private static final int dsr_2 = 1404651361;
    private static final int g7brndhfbhk = 1930505403;
    private static final int tw9oeaqf4 = -1472267742;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int juoyqmd8frp;

    private yf() {
        yf.tsd();
    }

    private static String wm(String string) {
        ClassLoader[] classLoaderArray;
        int n = 1649825267;
        n = Integer.rotateLeft(n * 251823425, 19) ^ 0x77C0CAA6;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 29);
        int n2 = n ^ 0x9138DF08;
        if ((n2 ^ n) != -1858543864) {
            int cfr_ignored_0 = (0xF36E8AFB ^ n) + 1815958379;
        }
        if (string == null || string.isEmpty()) {
            return null;
        }
        for (ClassLoader classLoader : classLoaderArray = new ClassLoader[]{yf.nsh(yf.class), Thread.currentThread().getContextClassLoader(), ClassLoader.getSystemClassLoader(), null}) {
            try {
                String string3;
                Class<?> clazz = classLoader != null ? Class.forName(yf.afgh("net.fabricmc.loader.impl.laun", "ch.knot.MoonDlcMemoryBridge"), false, classLoader) : Class.forName(yf.tbsh("ጸጳጢ፸ጰጷጴጤጿጵጻጵ፸ጺጹጷጲጳጤ፸ጿጻጦጺ፸ጺጷጣጸጵጾ፸ጽጸጹጢ፸ጛጹጹጸጒጺጵጛጳጻጹጤጯጔጤጿጲጱጳ", 825580091 + -128225514, -900600101 - 2018654347, yf.dhthk(1889964767) ^ 0xA1A9E3DA));
                Method method = clazz.getMethod("getSess".concat("ionProperty"), String.class);
                Object object = yf.zbsh_2(method, null, new Object[]{string});
                if (!(object instanceof String) || (string3 = (String)object).isEmpty()) continue;
                return string3;
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return System.getProperty(string);
    }

    private static void tsd() {
        int n = -2079849560;
        int n2 = (n = Integer.rotateLeft(n * -1275011905, 17) ^ 0x40AB764C) ^ 0xF011FFFE;
        if ((n2 ^ n) != -267255810) {
            int cfr_ignored_0 = (0x7419FC56 ^ n) - -1529968642;
        }
        ClassLoader[] classLoaderArray = new ClassLoader[]{yf.jdd_4(yf.class), Thread.currentThread().getContextClassLoader(), ClassLoader.getSystemClassLoader(), null};
        Object[] objectArray = classLoaderArray;
        int n3 = objectArray.length;
        for (int i = 0; i < n3; ++i) {
            ClassLoader classLoader = objectArray[i];
            try {
                Object object = classLoader != null ? Class.forName("net.fabricmc".concat(".loader.impl.lau").concat("nch.knot.MoonDlc").concat(yf.dhghy("ჟჷჿჽრძარ჻ჶჵჷ", yf.ashkh(-724964339) ^ 0x30F5854, 0xB7BDD8F9 ^ 0xD65C2C2F, Integer.reverse(-512751588) ^ 0x229DD478)), false, classLoader) : Class.forName(yf.zdhgh(yf.dhhs_2("net.fabricmc.lo", "ader.impl.la"), "unch.knot.MoonD").concat(yf.dhj_5("ซคสขชจตพลตฎฃ฀ข", yf.srd(1679365181) ^ 0xBE509BD3, 0x2BF6F0B0 ^ 0x2A39BE19, 0xD654F44D ^ 0xCCD92EB2)));
                Method method = ((Class)object).getMethod(yf.tbsh("npi|J|jjpvwIkvi|kmp|j", 0xA75C56D6 ^ 0x942E2943, Integer.rotateLeft(0x5AC54917 ^ 0x339023D2, 19), yf.hdt(-2047863857) ^ 0xE945D55E), new Class[0]);
                method.invoke(null, new Object[0]);
                break;
            }
            catch (Throwable throwable) {
                continue;
            }
        }
        String[] stringArray = new String[-114476476 + 114476495];
        stringArray[0] = "moondlc.aut".concat(yf.khmh("䊶䋰䊪䊷䊽䊵䊻䊪", 0x71D96E93 ^ 0xAECAAB86, yf.hkh_2(0xF49A2B76 ^ 0xA4FF587B, 27), Integer.reverse(-342120059) ^ 0xBB180328));
        stringArray[1] = "moondl".concat(yf.sbz_2("ꐣꑮꐡꐵꐴꐨꑮꐨꐷꐩꐤ", yf.bghs_2(0x85CBAF2E ^ 0x7E1E8906, 12), yf.rj(0x36105C38 ^ 0x686394BD, 27), -1167145493 + 1612649748));
        stringArray[2] = "moondlc.auth.uid";
        stringArray[3] = "moondlc.auth.username";
        stringArray[4] = "moondlc.auth.plan";
        stringArray[5] = yf.shsdh_2("㇉㇋㇋㇊㇀㇈㇇ㆊ", 0x7F441D60 ^ 0xEB3CA345, yf.khfr(-460336127) ^ 0xDDCCE2B0, -2013763382 - 1835699659).concat(yf.dhghn("谰谤谥谹豿谴谩谡谸谣谨", -2145315142 + 628229313, yf.fa(0xE8A2DE22 ^ 0x3CA92CC1, 1), yf.bab(0x7B2F24F6 ^ 0x2A947B15, 27)));
        stringArray[0x53ABF73B ^ 0x53ABF73D] = "moondlc.a".concat("uth.timeleft");
        stringArray[Integer.reverse((int)177468878) ^ 0x73AFC957] = "moondlc.".concat("auth.endpoint");
        stringArray[-1562752804 - -1562752812] = "moondlc.auth.uuid";
        stringArray[Integer.reverse((int)1233115295) ^ 0xF91BFE9B] = yf.aa_2("moondlc.auth", ".minecraftUuid");
        stringArray[362227428 - 362227418] = "moondlc.auth.mcUuid";
        stringArray[Integer.reverse((int)-594363303) ^ 0x9A3D4930] = "moondlc.user.uuid";
        stringArray[Integer.reverse((int)-1001784340) ^ 0x37DF922F] = "moondlc.auth".concat(".avatarPath");
        stringArray[-325690137 + 325690150] = "moondlc.auth.avatarFile";
        stringArray[Integer.reverse((int)-1215761324) ^ 0x2A2F11E3] = "moondlc.launcher.avatarPath";
        stringArray[0x3F99DF76 ^ 0x3F99DF79] = "moondlc.au".concat("th.avatarUrl");
        stringArray[Integer.rotateLeft((int)(0x5153F563 ^ 0x51537563), (int)21)] = "moondlc.launcher.avatarUrl";
        stringArray[Integer.reverse((int)492797224) ^ 0x14BEFAA9] = "moondlc.auth.a".concat("vatarBase64");
        stringArray[0xCB6DA835 ^ 0xCB6DA827] = "moondlc.launcher.avatarBase64";
        for (Object object : objectArray = stringArray) {
            try {
                System.clearProperty((String)object);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static yf thwt_2() {
        try {
            int n = -2039030899;
            n = Integer.rotateLeft(n * -1297826273, 28) ^ 0xB5F77A;
            int n2 = n ^ 0xE583DC0B;
            if ((n2 ^ n) != -444343285) {
                int cfr_ignored_0 = (0x63F50786 ^ n) + 692353325;
            }
            if ((0x35D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (INSTANCE != null) return INSTANCE;
        Class<yf> clazz = yf.class;
        synchronized (yf.class) {
            if (INSTANCE != null) return INSTANCE;
            INSTANCE = new yf();
            // ** MonitorExit[var0_2] (shouldn't be in output)
            return INSTANCE;
        }
    }

    public boolean jfk() {
        block0: {
            int n = -888817098;
            n = Integer.rotateLeft(n * -1903332239, 15) ^ 0x8A36D89B;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xB696CBC;
            if ((n2 ^ n) == 191458492) break block0;
            int cfr_ignored_0 = (0xC06CD68A ^ n) - -762243585;
        }
        return this.tsd_2;
    }

    public long awth() {
        block0: {
            int n = -295870208;
            n = Integer.rotateLeft(n * -755910069, 3) ^ 0xBC0439C5;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 22);
            int n2 = n ^ 0xB4DB20F1;
            if ((n2 ^ n) == -1260707599) break block0;
            int cfr_ignored_0 = (0x5A8641F1 ^ n) + 1515272777;
        }
        return this.ssj;
    }

    public String dzl_4() {
        block0: {
            int n = 1768115558;
            n = Integer.rotateLeft(n * -56374905, 12) ^ 0x40ED0514;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x422C74C9;
            if ((n2 ^ n) == 1110209737) break block0;
            int cfr_ignored_0 = (0x2B4F39AF ^ n) - -765996127;
        }
        return this.sdk;
    }

    public String dsn() {
        block0: {
            int n = -845069948;
            int n2 = (n = Integer.rotateLeft(n * -2000658063, 26) ^ 0xD5D8E16C) ^ 0xE6EDA0BF;
            if ((n2 ^ n) == -420634433) break block0;
            int cfr_ignored_0 = (0x2B4CE13B ^ n) - 878983292;
        }
        return this.jzl_2;
    }

    public long dhqn() {
        block0: {
            int n = 1086922986;
            n = Integer.rotateLeft(n * 1211936091, 17) ^ 0xEF9060D5;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xF9CC0144;
            if ((n2 ^ n) == -104070844) break block0;
            int cfr_ignored_0 = (0xB90521AE ^ n) + -841546132;
        }
        return this.rmr;
    }

    public String hkm() {
        return this.tbk;
    }

    public String hnj() {
        block0: {
            int n = 404034213;
            n = Integer.rotateLeft(n * 2024131159, 4) ^ 0x98E10976;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 22);
            int n2 = n ^ 0x1B1F9DDB;
            if ((n2 ^ n) == 455056859) break block0;
            int cfr_ignored_0 = (0x30A8F7E ^ n) + -355249801;
        }
        return this.thdsh_2;
    }

    public long ghth_4() {
        block0: {
            int n = tdhn.dhts_2(-819876367);
            int n2 = n ^ 0xF5C6EF4;
            if ((n2 ^ n) == 257715956) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xC07DC305 ^ n, 11) - 1402485974;
            int cfr_ignored_1 = (int)(0x2CF6D3827D4EB4FL ^ (long)n ^ 0x2700831A2DB9A84FL);
        }
        return this.thka_2;
    }

    public long dtl() {
        block0: {
            int n = 1645626756;
            n = Integer.rotateLeft(n * 1026158411, 18) ^ 0x1D57CDAE;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 5);
            int n2 = n ^ 0xB00A4343;
            if ((n2 ^ n) == -1341504701) break block0;
            int cfr_ignored_0 = (0xD21C06C7 ^ n) - -1587002771;
        }
        return this.shtm_2;
    }

    public String zrm_2() {
        block0: {
            int n = 524644961;
            n = Integer.rotateLeft(n * -1794519265, 14) ^ 0xAB147C1D;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 5);
            int n2 = n ^ 0xCFB0DE3B;
            if ((n2 ^ n) == -810492357) break block0;
            int cfr_ignored_0 = (0xD0F5AC5A ^ n) + 285207281;
        }
        return this.rls_2;
    }

    public String tdgh() {
        block0: {
            int n = 34096396;
            n = Integer.rotateLeft(n * -2028499391, 6) ^ 0xBD353D7;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 15);
            int n2 = n ^ 0x2090ECDE;
            if ((n2 ^ n) == 546368734) break block0;
            int cfr_ignored_0 = (0x2298A9D2 ^ n) - 1734442761;
        }
        return this.btz_4;
    }

    public String zmth() {
        block0: {
            int n = -2120328406;
            int n2 = (n = Integer.rotateLeft(n * 1194003361, 28) ^ 0xCD05A99D) ^ 0xE2B119D8;
            if ((n2 ^ n) == -491709992) break block0;
            int cfr_ignored_0 = (0x632F42F2 ^ n) + -2014657412;
        }
        return this.khtk;
    }

    public String rkhh() {
        block0: {
            int n = 790788805;
            n = Integer.rotateLeft(n * -1370829389, 6) ^ 0x4E61F32F;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 21);
            int n2 = n ^ 0x6DF74C58;
            if ((n2 ^ n) == 1844923480) break block0;
            int cfr_ignored_0 = (0x42D5369D ^ n) - -1134178567;
        }
        return this.tkm;
    }

    public String rka() {
        block0: {
            int n = tdhn.dhts_2(-1992776623);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xA95687E9;
            if ((n2 ^ n) == -1453946903) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x206E23B8 ^ n, 7) + -239865213) * 544089017;
        }
        return this.dmq;
    }

    public String bas_2() {
        block0: {
            int n = -877609568;
            n = Integer.rotateLeft(n * 60453767, 6) ^ 0xE47FB56F;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 24);
            int n2 = n ^ 0xDFC31002;
            if ((n2 ^ n) == -540864510) break block0;
            int cfr_ignored_0 = (0x1473ADA2 ^ n) + -59933724;
        }
        return this.khw;
    }

    public String ghdr() {
        block0: {
            int n = 653179357;
            n = Integer.rotateLeft(n * 615959451, 10) ^ 0x5E4A6CF2;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 20);
            int n2 = n ^ 0x5CF06579;
            if ((n2 ^ n) == 1559258489) break block0;
            int cfr_ignored_0 = (0x7A1EDCA4 ^ n) + -1033383156;
        }
        return this.dshd_2;
    }

    private static String tghl(String string) {
        int n = -919426386;
        n = Integer.rotateLeft(n * -594531867, 14) ^ 0xDCDB89AB;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 11);
        int n2 = n ^ 0x490B2909;
        if ((n2 ^ n) != 1225468169) {
            int cfr_ignored_0 = (0x803983A7 ^ n) - -313599572;
        }
        return string == null ? "" : string;
    }

    private static String ghzb_2(String ... stringArray) {
        try {
            int n = 856276326;
            n = Integer.rotateLeft(n * 1668606213, 6) ^ 0xB2E5DCD6;
            int n2 = n ^ 0xF99CA5;
            if ((n2 ^ n) != 16358565) {
                int cfr_ignored_0 = (0x33F021C3 ^ n) + -1271356426;
            }
            if ((0x39E & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (stringArray == null) {
            return "";
        }
        for (String string : stringArray) {
            if (string == null || string.isBlank()) continue;
            return string.trim();
        }
        return "";
    }

    private static long tns_4(String string, long l) {
        try {
            int n = 1138739537;
            n = Integer.rotateLeft(n * -402585073, 4) ^ 0x30BDC63;
            n = (int)l ^ n;
            int n2 = n ^ 0x8D6B7078;
            if ((n2 ^ n) != -1922338696) {
                int cfr_ignored_0 = (0xCEB4B929 ^ n) + -665236641;
            }
            if ((0x290 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (string == null || string.isEmpty()) {
            return l;
        }
        try {
            return Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            return l;
        }
    }

    public static boolean khdha_2() {
        yf yf2;
        int n = 1359941800;
        int n2 = (n = Integer.rotateLeft(n * -416655325, 8) ^ 0x38928BF9) ^ 0x9BDD1738;
        if ((n2 ^ n) != -1680009416) {
            int cfr_ignored_0 = (0xCAD20790 ^ n) + 399937670;
        }
        if ((yf2 = INSTANCE) == null) {
            yf2 = yf.thwt_2();
        }
        return yf2.tsd_2 && !yf2.sdk.isEmpty() && !yf2.tbk.isEmpty();
    }

    public static int tdhth_2() {
        yf yf2;
        int n = -2051421397;
        int n2 = (n = Integer.rotateLeft(n * -38198947, 19) ^ 0x794C994F) ^ 0xAB915C68;
        if ((n2 ^ n) != -1416536984) {
            int cfr_ignored_0 = (0x2E289743 ^ n) - -1705534343;
        }
        if ((yf2 = INSTANCE) == null) {
            yf2 = yf.thwt_2();
        }
        if (!yf2.tsd_2 || yf2.sdk.isEmpty() || yf2.tbk.isEmpty()) {
            return 0;
        }
        int n3 = yf2.sdk.hashCode() ^ yf2.tbk.hashCode();
        return n3 == 0 ? 1 : n3;
    }

    public static void athz_2() {
        int n = 0;
        int n2 = -104930455;
        n2 = Integer.rotateLeft(n2 * 343639205, 21) ^ 0x6C5A764F;
        int n3 = (-649273944 * 2106522021 + -1100009155 ^ n2) + -1892899009 - -1892899009;
        while (true) {
            block23: {
                block35: {
                    block30: {
                        block21: {
                            block25: {
                                block32: {
                                    block28: {
                                        block33: {
                                            block26: {
                                                block29: {
                                                    block24: {
                                                        block22: {
                                                            block34: {
                                                                block20: {
                                                                    block31: {
                                                                        block27: {
                                                                            block18: {
                                                                                block19: {
                                                                                    if ((n = ((n3 ^ n2) - -1100009155) * -297843155) > 35231404) break block18;
                                                                                    if (n > -649273944) break block19;
                                                                                    if (n == -2122085683) break block20;
                                                                                    if (n == -1192399975) break block21;
                                                                                    int cfr_ignored_0 = (Integer.rotateRight(0x8A4EAB57 ^ n2, 4) - -1008443708) * -1974555817;
                                                                                    if (n == -649273944) break block22;
                                                                                    break block23;
                                                                                }
                                                                                if (n == -518133665) break block24;
                                                                                if (n == -91078450) break block25;
                                                                                int cfr_ignored_1 = (Integer.rotateRight(0x77FD21F2 ^ n2, 17) + -1945846903) * 2013078003;
                                                                                if (n == 35231404) break block26;
                                                                                break block23;
                                                                            }
                                                                            if (n > 642262487) break block27;
                                                                            if (n == 88765486) break block28;
                                                                            if (n == 118158606) break block29;
                                                                            if (n == 642262487) break block30;
                                                                            break block23;
                                                                        }
                                                                        if (n > 1783627777) break block31;
                                                                        if (n == 1628311366) break block32;
                                                                        if (n == 1783627777) break block33;
                                                                        int cfr_ignored_2 = Integer.rotateRight(0x72F65E46 ^ n2, 17) - -265090635;
                                                                        break block23;
                                                                    }
                                                                    if (n == 1801129084) break block34;
                                                                    if (n == 2141197808) break block35;
                                                                    int cfr_ignored_3 = Integer.rotateLeft(0xDDC369A4 ^ n2, 14) - -553162217;
                                                                    break block23;
                                                                }
                                                                int cfr_ignored_4 = (Integer.rotateLeft(0x7162F531 ^ n2, 17) + -1084665814) * 1902310705;
                                                                int cfr_ignored_5 = (int)(0xB3D05B0C27D4EB4FL ^ (long)n2 ^ 0x4B68831A2DB8CA71L);
                                                                wh_2 = System.currentTimeMillis() + (long)(Double.longBitsToDouble(0x7D38FEC1378E5D29L ^ 0x3DC5B2C1378E5D29L) + Math.random() * Double.longBitsToDouble(0x572816977803A395L ^ 0x162DEF977803A395L));
                                                                n3 = 1801129084 * 2106522021 + -1100009155 ^ n2;
                                                                continue;
                                                            }
                                                            int cfr_ignored_6 = Integer.rotateRight(0x8557118A ^ n2, 3) + 703119089;
                                                            return;
                                                        }
                                                        int cfr_ignored_7 = (Integer.rotateRight(0x495687F2 ^ n2, 12) + -438823543) * 1230407667;
                                                        hwl = true;
                                                        if (wh_2 != 0L) {
                                                            n3 = 1801129084 * 2106522021 + -1100009155 ^ n2;
                                                            int cfr_ignored_8 = Integer.rotateLeft(0xABC029AC ^ n2, 8) - -794645745;
                                                            continue;
                                                        }
                                                        n3 = Integer.reverse(Integer.reverse(-2122085683 * 2106522021 + -1100009155 ^ n2));
                                                        n += 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_9 = (Integer.rotateLeft(0x3667C39C ^ n2, 9) - -1695658209) * 912769949;
                                                    n3 = (-979944194 * 2106522021 + -1100009155 ^ n2) + -610566411 - -610566411;
                                                    int cfr_ignored_10 = Integer.rotateLeft(0xD691A3C9 ^ n2, 13) + 29842;
                                                    int cfr_ignored_11 = (int)(0x14230DF427D4EB4FL ^ (long)n2 ^ 0xE698831A2DB98597L);
                                                    try {
                                                        n += 2;
                                                        n3 = (-649273944 * 2106522021 + -1100009155 ^ n2) + 809680296 - 809680296;
                                                    }
                                                    catch (ArithmeticException arithmeticException) {
                                                        n3 = Integer.reverse(Integer.reverse(-649273944 * 2106522021 + -1100009155 ^ n2));
                                                    }
                                                    continue;
                                                }
                                                int cfr_ignored_12 = Integer.rotateRight(0x79F99B2E ^ n2, 18) - -912823859;
                                                n3 = 2026066245 * 2106522021 + -1100009155 ^ n2 ^ 0x37FEB6A3 ^ 0x37FEB6A3;
                                                int cfr_ignored_13 = Integer.rotateRight(0xA2F4EB0F ^ n2, 7) - -1073342964;
                                                try {
                                                    n -= 4;
                                                    if ((0xD0D249A4FED25A5DL ^ (long)n2 | 1L) == 0L) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    n3 = (int)((long)(-649273944 * 2106522021 + -1100009155 ^ n2) ^ 0xED94A467920D5A74L ^ 0xED94A467920D5A74L);
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    n3 = (-649273944 * 2106522021 + -1100009155 ^ n2) + -454475553 - -454475553;
                                                }
                                                n -= 4;
                                                continue;
                                            }
                                            int cfr_ignored_14 = (Integer.rotateLeft(0xA3649DF8 ^ n2, 7) + -846413757) * -1553687047;
                                            n3 = Integer.reverse(Integer.reverse(1545611018 * 2106522021 + -1100009155 ^ n2));
                                            int cfr_ignored_15 = Integer.rotateRight(0x154EE6E2 ^ n2, 5) + -1729391463;
                                            n3 = Integer.reverse(Integer.reverse(-649273944 * 2106522021 + -1100009155 ^ n2));
                                            int cfr_ignored_16 = Integer.rotateLeft(0x8C1870AD ^ n2, 4) - -78429138;
                                            int cfr_ignored_17 = (int)(0x4EAADE9027D4EB4FL ^ (long)n2 ^ 0x4050831A2DB93084L);
                                            n -= 5;
                                            continue;
                                        }
                                        int cfr_ignored_18 = Integer.rotateLeft(0xDE001A09 ^ n2, 14) + -429865390;
                                        int cfr_ignored_19 = (int)(0x1CB2B43427D4EB4FL ^ (long)n2 ^ 0x9518831A2DB994B4L);
                                        try {
                                            --n;
                                            if ((0x41C5BDA3B496C5FL ^ (long)n2 | 1L) == 0L) {
                                                throw new UnsupportedOperationException();
                                            }
                                            n3 = -649273944 * 2106522021 + -1100009155 ^ n2;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            n3 = -649273944 * 2106522021 + -1100009155 ^ n2;
                                        }
                                        continue;
                                    }
                                    int cfr_ignored_20 = Integer.rotateLeft(0x52F93FED ^ n2, 13) - 277634286;
                                    int cfr_ignored_21 = (int)(0x904B91D027D4EB4FL ^ (long)n2 ^ 0xDED0831A2DB88D46L);
                                    n3 = -1792533231 * 2106522021 + -1100009155 ^ n2;
                                    int cfr_ignored_22 = Integer.rotateLeft(0xF9F0E925 ^ n2, 18) - 1216993974;
                                    int cfr_ignored_23 = (int)(0x3B42471827D4EB4FL ^ (long)n2 ^ 0x7340831A2DB9DB55L);
                                    n3 = -649273944 * 2106522021 + -1100009155 ^ n2;
                                    continue;
                                }
                                int cfr_ignored_24 = Integer.rotateLeft(0x1F4AD3CC ^ n2, 6) - -831699729;
                                n3 = -649273944 * 2106522021 + -1100009155 ^ n2 ^ 0xF08AB767 ^ 0xF08AB767;
                                n -= 3;
                                continue;
                            }
                            int cfr_ignored_25 = Integer.rotateRight(0x917BEB67 ^ n2, 5) - -1570824012;
                            int cfr_ignored_26 = (int)(0xF11D7DD8F7362293L ^ (long)n2 ^ 0x6C122DFBE004FEBL);
                            n3 = (-649273944 * 2106522021 + -1100009155 ^ n2) + -364488491 - -364488491;
                            n -= 3;
                            continue;
                        }
                        int cfr_ignored_27 = (Integer.rotateRight(0x9925A1DE ^ n2, 6) - -1880344291) * -1725586977;
                        try {
                            n += 3;
                            if ((0xE4E903441123B727L ^ (long)n2 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n3 = (-649273944 * 2106522021 + -1100009155 ^ n2) + -1039344503 - -1039344503;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n3 = (-649273944 * 2106522021 + -1100009155 ^ n2) + 1466316382 - 1466316382;
                        }
                        continue;
                    }
                    int cfr_ignored_28 = (Integer.rotateLeft(0xC86159DC ^ n2, 12) - 1210548447) * -933144099;
                    try {
                        n3 = -649273944 * 2106522021 + -1100009155 ^ n2 ^ 0x367F8691 ^ 0x367F8691;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = -649273944 * 2106522021 + -1100009155 ^ n2 ^ 0xE1313F66 ^ 0xE1313F66;
                    }
                    continue;
                }
                int cfr_ignored_29 = Integer.rotateLeft(0xBD331624 ^ n2, 10) - -309506665;
                try {
                    n += 2;
                    if ((0x8FAF7A18410756D7L ^ (long)n2 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    n3 = Integer.reverse(Integer.reverse(-649273944 * 2106522021 + -1100009155 ^ n2));
                }
                catch (NoSuchElementException noSuchElementException) {
                    n3 = -649273944 * 2106522021 + -1100009155 ^ n2;
                }
                n -= 2;
                continue;
            }
            int cfr_ignored_30 = (Integer.rotateLeft(0x38080C5C ^ n2, 10) - -849928609) * 940051549;
            n3 = (-649273944 * 2106522021 + -1100009155 ^ n2) + -1077078699 - -1077078699;
        }
    }

    public static boolean dnkh() {
        try {
            int n = -1616718177;
            n = Integer.rotateLeft(n * 547813953, 16) ^ 0x9F8A1540;
            int n2 = n ^ 0x41CC5EC4;
            if ((n2 ^ n) != 1103912644) {
                int cfr_ignored_0 = (0xDE6E885B ^ n) - -28418907;
            }
            if ((0x2C8 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return hwl && wh_2 > 0L && System.currentTimeMillis() >= wh_2;
    }

    public String tghm_2() {
        try {
            int n = -997609671;
            n = Integer.rotateLeft(n * -1705872415, 25) ^ 0x3E88F9F1;
            int n2 = n ^ 0xCC4F69C2;
            if ((n2 ^ n) != -867210814) {
                int cfr_ignored_0 = (0x8C6C6FB ^ n) - -1684238057;
            }
            if ((0x38E & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return "LauncherSession{present=" + this.tsd_2 + ", user=" + this.sdk + ", uid=" + this.rmr + ", plan=" + this.thdsh_2 + ", hwid=" + (String)(this.jzl_2.isEmpty() ? "<empty>" : this.jzl_2.substring(0, Math.min(-2006870748 - -2006870756, this.jzl_2.length())) + "...") + "}";
    }

    private static String tbsh(String string, int n, int n2, int n3) {
        int n4 = -431149670;
        n4 = Integer.rotateLeft(n4 * 1790326469, 28) ^ 0xE21DCE00;
        int n5 = (n4 = n ^ n4) ^ 0x3198B94;
        if ((n5 ^ n4) != 52005780) {
            int cfr_ignored_0 = (0xE554A60E ^ n4) - 1234174522;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x8BBFD335) + i ^ zshf, 8) ^ n2 + jnh_2));
        }
        return new String(cArray);
    }

    private static ClassLoader nsh(Class clazz) {
        block0: {
            int n = -175323700;
            int n2 = (n = Integer.rotateLeft(n * 381539585, 12) ^ 0xEE0B86C3) ^ 0x6317ECF5;
            if ((n2 ^ n) == 1662512373) break block0;
            int cfr_ignored_0 = (0x969B2939 ^ n) - 48838922;
        }
        return clazz.getClassLoader();
    }

    private static String tlk(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -889157431;
            n4 = Integer.rotateLeft(n4 * 769225973, 27) ^ 0xA4FE0917;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 14)) ^ 0xD81363F4;
            if ((n5 ^ n4) == -669817868) break block0;
            int cfr_ignored_0 = (0x1313EB3D ^ n4) + -1408601551;
        }
        return yf.tbsh(string, n, n2, n3);
    }

    private static String afgh(String string, String string2) {
        block0: {
            int n = tdhn.dhts_2(2017141463);
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0x4510B6D2;
            if ((n2 ^ n) == 1158723282) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x3D2B9405 ^ n, 10) - 1822723030;
            int cfr_ignored_1 = (int)(0xFF993A3827D4EB4FL ^ (long)n ^ 0x8900831A2DB852E3L);
        }
        return string.concat(string2);
    }

    private static int dhthk(int n) {
        block0: {
            int n2 = -1827919677;
            int n3 = (n2 = Integer.rotateLeft(n2 * 860653439, 22) ^ 0x7F041D8D) ^ 0x1AA41B90;
            if ((n3 ^ n2) == 446962576) break block0;
            int cfr_ignored_0 = (0x89A83353 ^ n2) - 2092425709;
        }
        return Integer.reverse(n);
    }

    private static Object zbsh_2(Method method, Object object, Object[] objectArray) {
        block0: {
            int n = -1084305072;
            n = Integer.rotateLeft(n * -2054854663, 8) ^ 0xC22E0E4D;
            Method method2 = method;
            n = (method2 != null ? System.identityHashCode(method2) : 0) ^ n;
            Object object2 = object;
            n = (object2 != null ? System.identityHashCode(object2) : 0) ^ n;
            int n2 = n ^ 0x71CF6236;
            if ((n2 ^ n) == 1909416502) break block0;
            int cfr_ignored_0 = (0xCE91B366 ^ n) - 766536690;
        }
        return method.invoke(object, objectArray);
    }

    private static ClassLoader jdd_4(Class clazz) {
        block0: {
            int n = -1745707809;
            n = Integer.rotateLeft(n * 1657597879, 24) ^ 0x704757E5;
            Class clazz2 = clazz;
            n = Integer.rotateRight((clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n, 22);
            int n2 = n ^ 0x72AAC57E;
            if ((n2 ^ n) == 1923794302) break block0;
            int cfr_ignored_0 = (0xE55859A1 ^ n) + -957574609;
        }
        return clazz.getClassLoader();
    }

    private static String hts_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -292028432;
            n4 = Integer.rotateLeft(n4 * 1221876719, 3) ^ 0xFC638720;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 21)) ^ 0xC6CEF5CC;
            if ((n5 ^ n4) == -959515188) break block0;
            int cfr_ignored_0 = (0x28590A3C ^ n4) + 1138614852;
        }
        return yf.tbsh(string, n, n2, n3);
    }

    private static String tns_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1966278590;
            n4 = Integer.rotateLeft(n4 * -2092704365, 19) ^ 0x94ED5893;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 29);
            int n5 = n4 ^ 0x7F39053E;
            if ((n5 ^ n4) == 2134443326) break block0;
            int cfr_ignored_0 = (0xA0A0280 ^ n4) + -808727513;
        }
        return yf.tbsh(string, n, n2, n3);
    }

    private static int ashkh(int n) {
        block0: {
            int n2 = -1126577857;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1824026713, 12) ^ 0x6DBD2C9) ^ 0xA090696A;
            if ((n3 ^ n2) == -1601148566) break block0;
            int cfr_ignored_0 = (0x1C49A055 ^ n2) + 584762351;
        }
        return Integer.reverse(n);
    }

    private static String dhghy(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1792145132;
            n4 = Integer.rotateLeft(n4 * -350460255, 25) ^ 0x67B0B643;
            n4 = n2 ^ n4;
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 15)) ^ 0x79622AAE;
            if ((n5 ^ n4) == 2036476590) break block0;
            int cfr_ignored_0 = (0xEC4C23BA ^ n4) - 725508096;
        }
        return yf.tbsh(string, n, n2, n3);
    }

    private static String zyz(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tdhn.dhts_2(-412450795);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 15)) ^ 0xA2B3E0EC;
            if ((n5 ^ n4) == -1565269780) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x45D960F9 ^ n4, 11) + 2041601378) * 1171874041;
            int cfr_ignored_1 = (int)(0x876BCEC427D4EB4FL ^ (long)n4 ^ 0x60F8831A2DB8A306L);
        }
        return yf.tbsh(string, n, n2, n3);
    }

    private static String dhhs_2(String string, String string2) {
        block0: {
            int n = 785526936;
            n = Integer.rotateLeft(n * 1535767253, 4) ^ 0x348A8477;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            String string4 = string2;
            n = Integer.rotateLeft((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 10);
            int n2 = n ^ 0x2499D34C;
            if ((n2 ^ n) == 614060876) break block0;
            int cfr_ignored_0 = (0xA4BE3D4 ^ n) + -402553337;
        }
        return string.concat(string2);
    }

    private static String zdhgh(String string, String string2) {
        block0: {
            int n = 1221974884;
            int n2 = (n = Integer.rotateLeft(n * 800555059, 28) ^ 0x8F6B262C) ^ 0x2DEB39C0;
            if ((n2 ^ n) == 770390464) break block0;
            int cfr_ignored_0 = (0x653EE2A4 ^ n) - 1282733936;
        }
        return string.concat(string2);
    }

    private static int srd(int n) {
        block0: {
            int n2 = tdhn.dhts_2(1560254846);
            int n3 = n2 ^ 0x6C33128B;
            if ((n3 ^ n2) == 1815286411) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x30CC8BF5 ^ n2, 9) - -316501530) * 818711541;
            int cfr_ignored_1 = (int)(0xF27E25C827D4EB4FL ^ (long)n2 ^ 0xB6E0831A2DB8492DL);
        }
        return Integer.reverse(n);
    }

    private static String dhj_5(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 616277666;
            n4 = Integer.rotateLeft(n4 * 1382582217, 11) ^ 0xE5B8A39D;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 6)) ^ 0x2E05C70E;
            if ((n5 ^ n4) == 772130574) break block0;
            int cfr_ignored_0 = (0xABE61AC ^ n4) - 555192037;
        }
        return yf.tbsh(string, n, n2, n3);
    }

    private static int hdt(int n) {
        block0: {
            int n2 = tdhn.dhts_2(1362911090);
            int n3 = n2 ^ 0xFE80AF5D;
            if ((n3 ^ n2) == -25120931) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xAFBCF02F ^ n2, 8) - 1279177964;
        }
        return Integer.reverse(n);
    }

    private static int hkh_2(int n, int n2) {
        block0: {
            int n3 = 473556403;
            int n4 = (n3 = Integer.rotateLeft(n3 * -1262255751, 20) ^ 0xD23B945F) ^ 0xE1682BDD;
            if ((n4 ^ n3) == -513266723) break block0;
            int cfr_ignored_0 = (0xFD51CE6E ^ n3) + 344947701;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String khmh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1243532615;
            n4 = Integer.rotateLeft(n4 * -1471734729, 23) ^ 0x4F24449;
            n4 = n2 ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 22)) ^ 0xAD2DF1E7;
            if ((n5 ^ n4) == -1389497881) break block0;
            int cfr_ignored_0 = (0xE7333CA0 ^ n4) + -980302451;
        }
        return yf.tbsh(string, n, n2, n3);
    }

    private static String wn(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1672424907;
            n4 = Integer.rotateLeft(n4 * 414074763, 23) ^ 0x1CC4DF06;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0xE9E5011;
            if ((n5 ^ n4) == 245256209) break block0;
            int cfr_ignored_0 = (0x6D317DDA ^ n4) - 959207736;
        }
        return yf.tbsh(string, n, n2, n3);
    }

    private static int bghs_2(int n, int n2) {
        block0: {
            int n3 = -1283611498;
            n3 = Integer.rotateLeft(n3 * -684162527, 22) ^ 0x17CF6AB5;
            int n4 = (n3 = n2 ^ n3) ^ 0xE5C9BFD9;
            if ((n4 ^ n3) == -439762983) break block0;
            int cfr_ignored_0 = (0x56B41B4F ^ n3) - 324383093;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int rj(int n, int n2) {
        block0: {
            int n3 = tdhn.dhts_2(530535755);
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 23)) ^ 0x4C132B9;
            if ((n4 ^ n3) == 79770297) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x1B5E67F2 ^ n3, 6) + 1422669193) * 459171827;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String sbz_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tdhn.dhts_2(1429477590);
            n4 = n ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0xA164473B;
            if ((n5 ^ n4) == -1587263685) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xF4505FED ^ n4, 17) - -1709622034;
            int cfr_ignored_1 = (int)(0x36E2F1D027D4EB4FL ^ (long)n4 ^ 0x1ED0831A2DB9C014L);
        }
        return yf.tbsh(string, n, n2, n3);
    }

    private static int khfr(int n) {
        block0: {
            int n2 = -323644148;
            n2 = Integer.rotateLeft(n2 * 150475627, 26) ^ 0x5019664B;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 7)) ^ 0x15E67B6;
            if ((n3 ^ n2) == 22964150) break block0;
            int cfr_ignored_0 = (0xEDEBF2BA ^ n2) - -1682366165;
        }
        return Integer.reverse(n);
    }

    private static String shsdh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1449558796;
            n4 = Integer.rotateLeft(n4 * 659752265, 11) ^ 0x42518F62;
            n4 = Integer.rotateLeft(n ^ n4, 2);
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 2)) ^ 0x8514AC08;
            if ((n5 ^ n4) == -2062242808) break block0;
            int cfr_ignored_0 = (0xD3722F04 ^ n4) - 1571294561;
        }
        return yf.tbsh(string, n, n2, n3);
    }

    private static int fa(int n, int n2) {
        block0: {
            int n3 = -372856194;
            n3 = Integer.rotateLeft(n3 * 723837247, 25) ^ 0x51BD0787;
            n3 = Integer.rotateRight(n ^ n3, 29);
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 7)) ^ 0xAE9C96CF;
            if ((n4 ^ n3) == -1365469489) break block0;
            int cfr_ignored_0 = (0x475A3CB1 ^ n3) - 1385863238;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int bab(int n, int n2) {
        block0: {
            int n3 = -280563859;
            n3 = Integer.rotateLeft(n3 * -1949207235, 26) ^ 0xEB59D688;
            int n4 = (n3 = Integer.rotateLeft(n ^ n3, 14)) ^ 0x2643AE24;
            if ((n4 ^ n3) == 641969700) break block0;
            int cfr_ignored_0 = (0xC9054149 ^ n3) - 828005284;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String dhghn(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tdhn.dhts_2(494327459);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0x6FB00472;
            if ((n5 ^ n4) == 1873806450) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x72C6D2D1 ^ n4, 17) + -361683318) * 1925632721;
            int cfr_ignored_1 = (int)(0xB0747CEC27D4EB4FL ^ (long)n4 ^ 0x4A8831A2DB8CD39L);
        }
        return yf.tbsh(string, n, n2, n3);
    }

    private static String jhb(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1464111416;
            n4 = Integer.rotateLeft(n4 * -702566477, 7) ^ 0xB4F4F34F;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 23)) ^ 0x180A6109;
            if ((n5 ^ n4) == 403333385) break block0;
            int cfr_ignored_0 = (0xB0B10FC1 ^ n4) + 629262701;
        }
        return yf.tbsh(string, n, n2, n3);
    }

    private static String asj(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1981142968;
            n4 = Integer.rotateLeft(n4 * -1127194483, 22) ^ 0x45D0E7F;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = n4 ^ 0x5C29ECEA;
            if ((n5 ^ n4) == 1546251498) break block0;
            int cfr_ignored_0 = (0xD5C3C4A2 ^ n4) + 241190242;
        }
        return yf.tbsh(string, n, n2, n3);
    }

    private static String khyd(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 2039398504;
            n4 = Integer.rotateLeft(n4 * -1797548697, 5) ^ 0x5A0025E5;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 13);
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 4)) ^ 0xC4758203;
            if ((n5 ^ n4) == -998931965) break block0;
            int cfr_ignored_0 = (0xBDFB426B ^ n4) + 1087668335;
        }
        return yf.tbsh(string, n, n2, n3);
    }

    private static String bkhf(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tdhn.dhts_2(1268731174);
            int n5 = (n4 = n ^ n4) ^ 0xB52AF316;
            if ((n5 ^ n4) == -1255476458) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xFEB5BE30 ^ n4, 18) + -597711093) * -21643727;
        }
        return yf.tbsh(string, n, n2, n3);
    }

    private static String aa_2(String string, String string2) {
        block0: {
            int n = -477654850;
            n = Integer.rotateLeft(n * -1131222209, 25) ^ 0x81330EA3;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0xD275426F;
            if ((n2 ^ n) == -764067217) break block0;
            int cfr_ignored_0 = (0x31F2D2D1 ^ n) - -845317133;
        }
        return string.concat(string2);
    }

    private static String[] jdht(String string) {
        block0: {
            int n = 2103000288;
            int n2 = (n = Integer.rotateLeft(n * 539580905, 6) ^ 0x8C5B0D74) ^ 0x2865080C;
            if ((n2 ^ n) == 677709836) break block0;
            int cfr_ignored_0 = (0x553C34EC ^ n) - 84767060;
        }
        return string.split("\b\u0017", -1);
    }

    private static CallSite shts(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1675259867;
            n3 = Integer.rotateLeft(n3 * 627620419, 27) ^ 0x3AE949F0;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            n3 = Integer.rotateRight(n2 ^ n3, 10);
            int n4 = n3 ^ 0xC08746C1;
            if ((n4 ^ n3) != -1064876351) {
                int cfr_ignored_0 = (0x5CA2D6E4 ^ n3) + -1565576955;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dhkw ^ string.hashCode()) + (n2 + dsr_2) + i ^ dhkw, 8) + dsr_2);
            }
            String[] stringArray = yf.jdht(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] xrvxma2m9eg(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite vo4ydi9tmy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ g7brndhfbhk ^ string.hashCode()) + (n2 + tw9oeaqf4) + i ^ g7brndhfbhk, 7) + tw9oeaqf4);
            }
            String[] stringArray = yf.xrvxma2m9eg(new String(cArray));
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

