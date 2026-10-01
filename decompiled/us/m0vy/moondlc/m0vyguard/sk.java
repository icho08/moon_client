/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bbd_2;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.ha_4;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Removals", category=bzw.OTHER, desc="Removes bad visual and sound effects")
public class sk
extends bnq {
    private static sk zll;
    private final bbd_2 hws_2 = new bbd_2(this, "effects");
    private final s_3 thghr = new s_3(this.hws_2, "hurtCam").thst();
    private final s_3 zwa_2 = new s_3(this.hws_2, "scoreboard");
    private final s_3 tath = new s_3(this.hws_2, "bossBar");
    private final s_3 thar = new s_3(this.hws_2, "portal");
    private final s_3 blm = new s_3(this.hws_2, "fire");
    private final s_3 bjz = new s_3(this.hws_2, "clip");
    private final s_3 dadh_2 = new s_3(this.hws_2, "water");
    private final s_3 qk = new s_3(this.hws_2, "nausea");
    private final s_3 dhha_2 = new s_3(this.hws_2, "blindness");
    private final s_3 bda_3 = new s_3(this.hws_2, "darkness");
    private final s_3 thkn = new s_3(this.hws_2, "pumpkin");
    private final s_3 rwa = new s_3(this.hws_2, "fov");
    private final s_3 hhsh_2 = new s_3(this.hws_2, "breakPa".concat("rticles"));
    private final s_3 dhdsh_2 = new s_3(this.hws_2, "weather");
    private final s_3 jsq = new s_3(this.hws_2, "glowing");
    private final s_3 jjz_2 = new s_3(this.hws_2, "lava");
    private final bbd_2 khdh_5 = new bbd_2(this, "sounds");
    private final s_3 khhh_3 = new s_3(this.khdh_5, "beacon");
    private final s_3 hjl = new s_3(this.khdh_5, "weatherSound");
    private final s_3 dhdkh_2 = new s_3(this.khdh_5, "phantoms");
    private final s_3 ragh_2 = new s_3(this.khdh_5, "waterSound");
    private final s_3 hnb = new s_3(this.khdh_5, "lavaSound");
    private static final int hrf = -231942159;
    private static final int zaa_3 = -85023323;
    private static final int thkhq = -1486061136;
    private static final int bas_4 = 1889907923;
    private static final int hhlpwyx9 = 63054820;
    private static final int acxv7bog = 2000673402;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int knel24cui6bevl;

    public static sk thash() {
        block0: {
            int n = -1294995146;
            int n2 = (n = Integer.rotateLeft(n * 657335347, 19) ^ 0x45EBB09D) ^ 0xFD49FE02;
            if ((n2 ^ n) == -45482494) break block0;
            int cfr_ignored_0 = (0x4F860F34 ^ n) - -1307466632;
        }
        return zll;
    }

    public sk() {
        zll = this;
        this.sdhdh(false);
    }

    public s_3 thtz_2() {
        block0: {
            int n = ha_4.hkhw(-1685884798);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
            int n2 = n ^ 0xF2FAE0A6;
            if ((n2 ^ n) == -218439514) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x69799024 ^ n, 16) - -904522857;
        }
        return this.thghr;
    }

    public s_3 sdhy() {
        block0: {
            int n = 1589899153;
            int n2 = (n = Integer.rotateLeft(n * 857653533, 21) ^ 0x17E04B27) ^ 0x713F754B;
            if ((n2 ^ n) == 1899984203) break block0;
            int cfr_ignored_0 = (0x2FFC9ADA ^ n) - 1117860662;
        }
        return this.bjz;
    }

    public s_3 dskh_3() {
        block0: {
            int n = 1623368090;
            n = Integer.rotateLeft(n * 902499991, 25) ^ 0xAD7AFBD7;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 10);
            int n2 = n ^ 0x6F69DE7C;
            if ((n2 ^ n) == 1869209212) break block0;
            int cfr_ignored_0 = (0xFAB7FE6 ^ n) - -2074862265;
        }
        return this.dadh_2;
    }

    public s_3 ssh_6() {
        block0: {
            int n = 158924675;
            int n2 = (n = Integer.rotateLeft(n * 858706017, 9) ^ 0x345F0447) ^ 0x9B64F2D7;
            if ((n2 ^ n) == -1687883049) break block0;
            int cfr_ignored_0 = (0x921C0D54 ^ n) - -441551267;
        }
        return this.dhha_2;
    }

    public s_3 sws_4() {
        block0: {
            int n = -1895598687;
            n = Integer.rotateLeft(n * -1868762825, 18) ^ 0xECED061;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 8);
            int n2 = n ^ 0x752BBCEB;
            if ((n2 ^ n) == 1965800683) break block0;
            int cfr_ignored_0 = (0xFA28C94A ^ n) + 152246079;
        }
        return this.hhsh_2;
    }

    public s_3 azy_2() {
        block0: {
            int n = -1940522894;
            n = Integer.rotateLeft(n * -1180676253, 14) ^ 0x7EBE58F5;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 27);
            int n2 = n ^ 0xD625DC1F;
            if ((n2 ^ n) == -702161889) break block0;
            int cfr_ignored_0 = (0x5A70246D ^ n) + -1111851260;
        }
        return this.dhdsh_2;
    }

    public s_3 jw() {
        block0: {
            int n = -692808522;
            n = Integer.rotateLeft(n * -2038950161, 27) ^ 0x9B58CEAB;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 12);
            int n2 = n ^ 0x6DEDD9D1;
            if ((n2 ^ n) == 1844304337) break block0;
            int cfr_ignored_0 = (0xBB594D67 ^ n) - -1982613030;
        }
        return this.khhh_3;
    }

    public s_3 hbgh() {
        block0: {
            int n = -2076248853;
            n = Integer.rotateLeft(n * -680659243, 27) ^ 0xEBFEC5AB;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xD6A3DBD2;
            if ((n2 ^ n) == -693904430) break block0;
            int cfr_ignored_0 = (0x529D2F39 ^ n) - 83999041;
        }
        return this.hjl;
    }

    public s_3 ash_2() {
        block0: {
            int n = -1256187143;
            int n2 = (n = Integer.rotateLeft(n * -782707053, 17) ^ 0xF4C8DE6F) ^ 0x9B0387F2;
            if ((n2 ^ n) == -1694267406) break block0;
            int cfr_ignored_0 = (0x2E239D0B ^ n) + -1368391381;
        }
        return this.dhdkh_2;
    }

    public s_3 thhw_2() {
        block0: {
            int n = 892984396;
            int n2 = (n = Integer.rotateLeft(n * 441390749, 8) ^ 0xD093DA37) ^ 0x1A2FB336;
            if ((n2 ^ n) == 439333686) break block0;
            int cfr_ignored_0 = (0x2F166F7A ^ n) - -905847511;
        }
        return this.ragh_2;
    }

    public s_3 dhaz_4() {
        block0: {
            int n = ha_4.hkhw(1450553175);
            int n2 = n ^ 0x3BE1B868;
            if ((n2 ^ n) == 1004648552) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x6D94173F ^ n, 16) - 1229746140) * 1838421823;
        }
        return this.hnb;
    }

    public s_3 dsth_2() {
        block0: {
            int n = -1200939436;
            n = Integer.rotateLeft(n * -669264117, 8) ^ 0xFEA4D67E;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 26);
            int n2 = n ^ 0x654E11AE;
            if ((n2 ^ n) == 1699615150) break block0;
            int cfr_ignored_0 = (0xDD250FFA ^ n) + -1214046023;
        }
        return this.zwa_2;
    }

    public s_3 dhhsh_2() {
        block0: {
            int n = 1999240176;
            n = Integer.rotateLeft(n * -893032999, 11) ^ 0xA9971A01;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 13);
            int n2 = n ^ 0xC868923F;
            if ((n2 ^ n) == -932670913) break block0;
            int cfr_ignored_0 = (0xBF4169CF ^ n) + -999696861;
        }
        return this.thar;
    }

    public s_3 ghh() {
        block0: {
            int n = 213093498;
            n = Integer.rotateLeft(n * 106873601, 10) ^ 0x85F6097F;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 12);
            int n2 = n ^ 0x6841222C;
            if ((n2 ^ n) == 1749099052) break block0;
            int cfr_ignored_0 = (0x64F2AE56 ^ n) - -321077277;
        }
        return this.thkn;
    }

    public s_3 ara() {
        block0: {
            int n = ha_4.hkhw(-1884150135);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 3);
            int n2 = n ^ 0x46B52AC5;
            if ((n2 ^ n) == 1186278085) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xC9070C4C ^ n, 12) - 1547181167;
        }
        return this.dhdsh_2;
    }

    public s_3 sfy() {
        block0: {
            int n = ha_4.hkhw(1620819630);
            int n2 = n ^ 0xFAC4CF81;
            if ((n2 ^ n) == -87765119) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x9A5F712F ^ n, 6) - -1242803220;
        }
        return this.tath;
    }

    public s_3 tj_2() {
        block0: {
            int n = 1020980778;
            int n2 = (n = Integer.rotateLeft(n * 1355009829, 26) ^ 0xC2BE915D) ^ 0x2C00AEE7;
            if ((n2 ^ n) == 738242279) break block0;
            int cfr_ignored_0 = (0x10DA40CD ^ n) - 52083364;
        }
        return this.thghr;
    }

    public s_3 dss_4() {
        block0: {
            int n = -597490550;
            n = Integer.rotateLeft(n * 1478785221, 26) ^ 0x20025810;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 23);
            int n2 = n ^ 0x488087AC;
            if ((n2 ^ n) == 1216382892) break block0;
            int cfr_ignored_0 = (0x94E38326 ^ n) + 834372890;
        }
        return this.bjz;
    }

    public s_3 sfa_2() {
        block0: {
            int n = -942734034;
            n = Integer.rotateLeft(n * -336830053, 3) ^ 0xDE9F723C;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 17);
            int n2 = n ^ 0x81EF007;
            if ((n2 ^ n) == 136245255) break block0;
            int cfr_ignored_0 = (0xCFD1F529 ^ n) - -950942771;
        }
        return this.blm;
    }

    public s_3 bwdh() {
        block0: {
            int n = -846980102;
            n = Integer.rotateLeft(n * -1213948587, 6) ^ 0x436ED52A;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 3);
            int n2 = n ^ 0x34D02998;
            if ((n2 ^ n) == 886057368) break block0;
            int cfr_ignored_0 = (0xF9543262 ^ n) - -729262141;
        }
        return this.rwa;
    }

    public s_3 zys() {
        block0: {
            int n = 1592670810;
            n = Integer.rotateLeft(n * 673505427, 26) ^ 0xA27001CD;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 18);
            int n2 = n ^ 0x4DDF4C77;
            if ((n2 ^ n) == 1306479735) break block0;
            int cfr_ignored_0 = (0x1331762D ^ n) + 1196426451;
        }
        return this.qk;
    }

    public s_3 dhbd_2() {
        block0: {
            int n = ha_4.hkhw(153862726);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
            int n2 = n ^ 0xF58BE45B;
            if ((n2 ^ n) == -175381413) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xFCA0261D ^ n, 18) - -1681769282) * -56613347;
            int cfr_ignored_1 = (int)(0x3E12882027D4EB4FL ^ (long)n ^ 0xED30831A2DB9D1F4L);
        }
        return this.hhsh_2;
    }

    public s_3 dhm_5() {
        block0: {
            int n = -949717440;
            int n2 = (n = Integer.rotateLeft(n * 1349231057, 11) ^ 0x5EA73FAC) ^ 0xB63A481B;
            if ((n2 ^ n) == -1237694437) break block0;
            int cfr_ignored_0 = (0x715E3E5B ^ n) + 1827022199;
        }
        return this.dhdsh_2;
    }

    public boolean aghf() {
        int n = 1543931578;
        n = Integer.rotateLeft(n * -1400027323, 11) ^ 0x91D13387;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 25);
        int n2 = n ^ 0xEEF5D3AD;
        if ((n2 ^ n) != -285879379) {
            int cfr_ignored_0 = (0xB2F35517 ^ n) + 525478804;
        }
        return this.rgha_2() && sk.shad(this.blm);
    }

    public boolean rzs_2() {
        try {
            int n = 555872202;
            n = Integer.rotateLeft(n * -1523950083, 4) ^ 0xB8CBC23C;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x33B8B329;
            if ((n2 ^ n) != 867742505) {
                int cfr_ignored_0 = (0x12995CE3 ^ n) - 72149779;
            }
            if ((0x356 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (sk.dqa_4()) {
            throw null;
        }
        return sk.tkh(this) && this.thghr.alh();
    }

    public boolean abt_2() {
        int n;
        block4: {
            try {
                int n2 = -905604055;
                n2 = Integer.rotateLeft(n2 * 364817181, 15) ^ 0xA5D43277;
                n2 = System.identityHashCode(this) ^ n2;
                int n3 = n2 ^ 0x7463128F;
                if ((n3 ^ n2) != 1952649871) {
                    int cfr_ignored_0 = (0xBE6686A6 ^ n2) - 468664790;
                }
                if ((0x369 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = this.rgha_2() && this.bjz.alh() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block4;
            n = n ^ 0x60FB;
        }
        return n != 0;
    }

    public boolean bghh_2() {
        int n = ha_4.hkhw(-761215443);
        int n2 = n ^ 0x1F7DEE17;
        if ((n2 ^ n) != 528346647) {
            int cfr_ignored_0 = (Integer.rotateRight(0xCDDD283A ^ n, 12) + -232423871) * -841144261;
        }
        return this.rgha_2() && this.dadh_2.alh();
    }

    public boolean tbth_2() {
        int n = 1161672483;
        n = Integer.rotateLeft(n * 741126387, 3) ^ 0x46A02543;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 9);
        int n2 = n ^ 0x9F016DF8;
        if ((n2 ^ n) != -1627296264) {
            int cfr_ignored_0 = (0xDA3CDADB ^ n) - 1527766916;
        }
        if (sk.zjh()) {
            throw null;
        }
        return this.rgha_2() && sk.f_2(this.zwa_2);
    }

    public boolean amth() {
        try {
            int n = -169976075;
            n = Integer.rotateLeft(n * 1015166875, 26) ^ 0x40B2597C;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x74541E33;
            if ((n2 ^ n) != 1951669811) {
                int cfr_ignored_0 = (0x818A40C6 ^ n) + 2104029920;
            }
            if ((0x2B1 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return sk.zah_6(this) && this.jsq.alh();
    }

    public boolean dhnw() {
        int n = 158845437;
        n = Integer.rotateLeft(n * 347269939, 3) ^ 0x2758119;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xE8539AB0;
        if ((n2 ^ n) != -397174096) {
            int cfr_ignored_0 = (0xE124534D ^ n) + -1923406105;
        }
        return this.rgha_2() && (sk.abd(this.qk) || this.dhha_2.alh() || sk.twt_3(this.bda_3));
    }

    public boolean dhkhk() {
        int n = -1829728385;
        n = Integer.rotateLeft(n * 839684933, 26) ^ 0x90352AFF;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x62F351EF;
        if ((n2 ^ n) != 1660113391) {
            int cfr_ignored_0 = (0xF003DE90 ^ n) - -484349569;
        }
        return this.rgha_2() && this.tath.alh();
    }

    private static String tmj(String string, int n, int n2, int n3) {
        int n4 = -1684985127;
        n4 = Integer.rotateLeft(n4 * -786579523, 26) ^ 0x86EE82CA;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateRight(n ^ n4, 9)) ^ 0x89679B43;
        if ((n5 ^ n4) != -1989698749) {
            int cfr_ignored_0 = (0x12F6B19A ^ n4) - -595713573;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xB3D6C9E7 ^ n2 - i) + zaa_3, 17) ^ hrf + i * -340158625));
        }
        return new String(cArray);
    }

    private static boolean shad(s_3 s2) {
        block0: {
            int n = -1935235073;
            n = Integer.rotateLeft(n * 290912999, 13) ^ 0xE382C9F0;
            s_3 s3 = s2;
            n = Integer.rotateLeft((s3 != null ? System.identityHashCode(s3) : 0) ^ n, 11);
            int n2 = n ^ 0x7069B9E7;
            if ((n2 ^ n) == 1885977063) break block0;
            int cfr_ignored_0 = (0xFCCF1E18 ^ n) - 318258687;
        }
        return s2.alh();
    }

    private static boolean dqa_4() {
        block0: {
            int n = -1837190723;
            int n2 = (n = Integer.rotateLeft(n * 1851570747, 8) ^ 0xF21E5BC5) ^ 0x119790B1;
            if ((n2 ^ n) == 295145649) break block0;
            int cfr_ignored_0 = (0x83E9210C ^ n) - -2077548406;
        }
        return yf.dnkh();
    }

    private static boolean tkh(sk sk2) {
        block0: {
            int n = ha_4.hkhw(224456410);
            int n2 = n ^ 0x92BDC6C;
            if ((n2 ^ n) == 153869420) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x44B32B6 ^ n, 3) - -1988574395) * 72037047;
        }
        return sk2.rgha_2();
    }

    private static boolean zjh() {
        block0: {
            int n = 223467155;
            int n2 = (n = Integer.rotateLeft(n * -240656281, 9) ^ 0x95ECB20E) ^ 0x9FCA207C;
            if ((n2 ^ n) == -1614143364) break block0;
            int cfr_ignored_0 = (0x929BF6EF ^ n) + -309048920;
        }
        return yf.dnkh();
    }

    private static boolean f_2(s_3 s2) {
        block0: {
            int n = ha_4.hkhw(-833896772);
            s_3 s3 = s2;
            n = (s3 != null ? System.identityHashCode(s3) : 0) ^ n;
            int n2 = n ^ 0x3EA05395;
            if ((n2 ^ n) == 1050694549) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xF0EBED29 ^ n, 17) + 820991794;
            int cfr_ignored_1 = (int)(0x3259431427D4EB4FL ^ (long)n ^ 0x7B58831A2DB9C963L);
        }
        return s2.alh();
    }

    private static boolean zah_6(sk sk2) {
        block0: {
            int n = -450465947;
            n = Integer.rotateLeft(n * -1912807047, 22) ^ 0x3214A5E7;
            sk sk3 = sk2;
            n = (sk3 != null ? System.identityHashCode(sk3) : 0) ^ n;
            int n2 = n ^ 0xFF83CB99;
            if ((n2 ^ n) == -8139879) break block0;
            int cfr_ignored_0 = (0x1AA5A4FC ^ n) - -587833443;
        }
        return sk2.rgha_2();
    }

    private static boolean abd(s_3 s2) {
        block0: {
            int n = -1426204247;
            int n2 = (n = Integer.rotateLeft(n * -5291957, 16) ^ 0x8C56E171) ^ 0xEDD57CF4;
            if ((n2 ^ n) == -304775948) break block0;
            int cfr_ignored_0 = (0x4728A55D ^ n) + 1549230325;
        }
        return s2.alh();
    }

    private static boolean twt_3(s_3 s2) {
        block0: {
            int n = 1417611832;
            n = Integer.rotateLeft(n * 2040574517, 15) ^ 0x734E59E6;
            s_3 s3 = s2;
            n = (s3 != null ? System.identityHashCode(s3) : 0) ^ n;
            int n2 = n ^ 0x39787DED;
            if ((n2 ^ n) == 964197869) break block0;
            int cfr_ignored_0 = (0x6D0777D5 ^ n) - 123978128;
        }
        return s2.alh();
    }

    private static String[] khtd_4(String string) {
        int n = -109289020;
        int n2 = (n = Integer.rotateLeft(n * 1086534021, 28) ^ 0x2C9C4F8C) ^ 0xF78C250B;
        if ((n2 ^ n) != -141810421) {
            int cfr_ignored_0 = (0xEF044CF ^ n) + -1464407113;
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

    private static CallSite sghy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1064117255;
            n3 = Integer.rotateLeft(n3 * -1393931253, 16) ^ 0xBDF580F8;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 10);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x1F988E99;
            if ((n4 ^ n3) != 530091673) {
                int cfr_ignored_0 = (0x20F5AA9E ^ n3) - 1121233744;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ thkhq ^ string.hashCode() ^ n2 + bas_4 ^ i * 1556275237 ^ thkhq, 20) ^ bas_4));
            }
            String[] stringArray = sk.khtd_4(new String(cArray));
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

    private static String[] z6pj0m67vb(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite j9sf4w92bo8vp5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ hhlpwyx9 ^ string.hashCode() ^ n2 + acxv7bog + i * -1063941805) + hhlpwyx9) ^ acxv7bog));
            }
            String[] stringArray = sk.z6pj0m67vb(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

