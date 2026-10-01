/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bghm;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Smooth Camera", category=bzw.OTHER, desc="Makes your camera movement smoother")
public class bkh_3
extends bnq {
    private final khd zdth = new khd(this, "Mode");
    private final fy jlt = new fy(this.zdth, "Default");
    private final fy hdhl = new fy(this.zdth, "Smooth");
    private final badh_2 zbs = new badh_2(this, "Enable ".concat("First POV")).bts(false);
    private final badh_2 dhrb = new badh_2(this, "Reset On Per".concat("spective")).bts(true);
    private final tay szd = new tay((hy)this, "Horizontal Factor", this::dhtj).shth_7(0.0f).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(-1960666307) ^ 0x80FA93DB)).ssd_5(Float.intBitsToFloat(-1666562088 + -1564729714));
    private final tay rtsh_2 = new tay((hy)this, "Vertic".concat("al Factor"), this::jfd).shth_7(0.0f).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xC5D6D34C ^ 0xD43D5652, 25))).ssd_5(Float.intBitsToFloat(Integer.reverse(-1934423636) ^ 0xAFED94A));
    private final tay sar = new tay((hy)this, "Smooth Horizontal Speed", this::tq).shth_7(Float.intBitsToFloat(-2135621060 - 1122514287)).dhbs_2(Float.intBitsToFloat(231455935 - -861160257)).rkh_3(Float.intBitsToFloat(Integer.reverse(488498185) ^ 0xADEB7475)).ssd_5(Float.intBitsToFloat(1360537791 - 285957106));
    private final tay shzh_3 = new tay((hy)this, "Smooth Vert".concat("ical Speed"), this::tdh_7).shth_7(Float.intBitsToFloat(1693187467 - 656355518)).dhbs_2(Float.intBitsToFloat(Integer.reverse(173670743) ^ 0xABA05A50)).rkh_3(Float.intBitsToFloat(1957763187 + -920931238)).ssd_5(Float.intBitsToFloat(0x735A4704 ^ 0x4CE97437));
    private double shts_2;
    private double dhkhr;
    private double dshq;
    private double shrq;
    private boolean khdn = false;
    private long zshk = 0L;
    private boolean tkhz;
    private boolean khtf_2;
    private static final double shzh_4 = 0.05;
    private static bkh_3 shhs_2;
    private static final int thqq = 1815392170;
    private static final int bdl_2 = 618599858;
    private static final int rss_4 = -1384434781;
    private static final int ssz_4 = 79533455;
    private static final int ftc2lrk8369a = -1423972200;
    private static final int xtyfxhq = 1673599639;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int qn8l785iwk;

    public static bkh_3 zry_2() {
        block0: {
            int n = -1500295115;
            int n2 = (n = Integer.rotateLeft(n * -1018882771, 13) ^ 0x4467C29E) ^ 0x103E1BB;
            if ((n2 ^ n) == 17031611) break block0;
            int cfr_ignored_0 = (0xA790B18E ^ n) - 1834340573;
        }
        return shhs_2;
    }

    public bkh_3() {
        shhs_2 = this;
    }

    @Override
    public void nc() {
        int n = 878478553;
        n = Integer.rotateLeft(n * 1110113967, 28) ^ 0x7E257D75;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 11);
        int n2 = n ^ 0x6C415543;
        if ((n2 ^ n) != 1816220995) {
            int cfr_ignored_0 = (0x581DD19A ^ n) - 1453289188;
        }
        this.rhth_2();
        this.tkhz = false;
    }

    public void fa_2(double d, double d2, double d3, boolean bl) {
        if (!this.rgha_2()) {
            this.hsw_2(d, d2, d3);
            this.khtf_2 = bl;
            this.tkhz = true;
            return;
        }
        if (this.dhrb.shzl() && this.tkhz && this.khtf_2 != bl) {
            this.hsw_2(d, d2, d3);
            this.khtf_2 = bl;
            return;
        }
        this.khtf_2 = bl;
        this.tkhz = true;
        if (!this.zbs.shzl() && !bl) {
            this.hsw_2(d, d2, d3);
            return;
        }
        if (!this.khdn) {
            this.hsw_2(d, d2, d3);
            return;
        }
        if (this.hdhl.shghkh()) {
            this.thshkh(d, d2, d3);
        } else {
            this.dshh(d, d2, d3);
        }
    }

    public double ghzn_2() {
        block0: {
            int n = 103168934;
            n = Integer.rotateLeft(n * -714128191, 8) ^ 0x9ECE1F46;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 21);
            int n2 = n ^ 0xB413C9D;
            if ((n2 ^ n) == 188824733) break block0;
            int cfr_ignored_0 = (0xD67073B ^ n) - -1979304116;
        }
        return this.shts_2;
    }

    public double thkh_6() {
        block0: {
            int n = bghm.stkh(-1812503532);
            int n2 = n ^ 0x3DF6A721;
            if ((n2 ^ n) == 1039574817) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xAE01C335 ^ n, 8) - 378815142) * -1375616203;
            int cfr_ignored_1 = (int)(0x6CB36D0827D4EB4FL ^ (long)n ^ 0x2760831A2DB974B7L);
        }
        return this.dhkhr;
    }

    public double zmw() {
        block0: {
            int n = 1890326111;
            n = Integer.rotateLeft(n * 994540307, 22) ^ 0xF2E12207;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 7);
            int n2 = n ^ 0xBCEB8CF;
            if ((n2 ^ n) == 198097103) break block0;
            int cfr_ignored_0 = (0x7B62AE90 ^ n) - -1048841105;
        }
        return this.dshq;
    }

    private void dshh(double d, double d2, double d3) {
        float f = this.szd.thw_5();
        float f2 = this.rtsh_2.thw_5();
        this.shts_2 = this.shts_2 * (double)f + d * (1.0 - (double)f);
        this.dhkhr = this.dhkhr * (double)f2 + d2 * (1.0 - (double)f2);
        this.dshq = this.dshq * (double)f + d3 * (1.0 - (double)f);
    }

    private void thshkh(double d, double d2, double d3) {
        double d4 = this.swsh_2();
        double d5 = Math.max(0.0, (double)this.sar.thw_5()) * d4;
        double d6 = Math.max(0.0, (double)this.shzh_3.thw_5()) * d4;
        double d7 = d - this.shts_2;
        double d8 = d3 - this.dshq;
        double d9 = Math.sqrt(d7 * d7 + d8 * d8);
        if (d9 <= d5 || d9 < 1.0E-5) {
            this.shts_2 = d;
            this.dshq = d3;
        } else {
            double d10 = d5 / d9;
            this.shts_2 += d7 * d10;
            this.dshq += d8 * d10;
        }
        this.shrkh(d2, d6, d4);
    }

    private double swsh_2() {
        int n = 1329774088;
        n = Integer.rotateLeft(n * 242592331, 24) ^ 0x541C91C5;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xBEE054D4;
        if ((n2 ^ n) != -1092594476) {
            int cfr_ignored_0 = (0xF1A2EADC ^ n) + 682253719;
        }
        long l = System.nanoTime();
        if (this.zshk == 0L) {
            this.zshk = l;
            return 0.0;
        }
        double d = (double)(l - this.zshk) / Double.longBitsToDouble(0xE0089301EB2C0A16L ^ 0xA1C55E64EB2C0A16L);
        this.zshk = l;
        return d <= 0.0 ? 0.0 : Math.min(d, Double.longBitsToDouble(0x6D38B394C6DB6D02L ^ 0x52912A0D5F42F498L));
    }

    private void shrkh(double d, double d2, double d3) {
        double d4;
        if (d3 <= 0.0) {
            return;
        }
        double d5 = d - this.dhkhr;
        if (Math.abs(d5) > 6.0) {
            this.dhkhr = this.khthz_2(this.dhkhr, d, d2 * 4.0);
            this.shrq = 0.0;
            return;
        }
        double d6 = Math.max(0.1, (double)this.shzh_3.thw_5());
        double d7 = Math.max(0.06, 0.42 / d6);
        double d8 = 2.0 / d7;
        double d9 = d8 * d3;
        double d10 = 1.0 / (1.0 + d9 + 0.48 * d9 * d9 + 0.235 * d9 * d9 * d9);
        double d11 = this.dhkhr - d;
        double d12 = (this.shrq + d8 * d11) * d3;
        this.shrq = (this.shrq - d8 * d12) * d10;
        if (d - this.dhkhr > 0.0 == (d4 = d + (d11 + d12) * d10) > d) {
            d4 = d;
            this.shrq = 0.0;
        }
        this.dhkhr = d4;
    }

    private double khthz_2(double d, double d2, double d3) {
        int n = bghm.stkh(-1911420497);
        n = Integer.rotateLeft((int)Double.doubleToLongBits(d2) ^ n, 3);
        int n2 = n ^ 0xB6D7B6A2;
        if ((n2 ^ n) != -1227376990) {
            int cfr_ignored_0 = Integer.rotateLeft(0x38C5BF0D ^ n, 10) - -464535090;
            int cfr_ignored_1 = (int)(0xFA77113027D4EB4FL ^ (long)n ^ 0xDF10831A2DB8593FL);
        }
        if (!yf.khdha_2()) {
            bkh_3.dkhr_2();
            throw null;
        }
        double d4 = d2 - d;
        return Math.abs(d4) <= d3 ? d2 : d + Math.signum(d4) * d3;
    }

    private void hsw_2(double d, double d2, double d3) {
        try {
            int n = 131384925;
            n = Integer.rotateLeft(n * -845727511, 15) ^ 0x4C9E16B;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
            n = (int)Double.doubleToLongBits(d2) ^ n;
            int n2 = n ^ 0x887F4169;
            if ((n2 ^ n) != -2004926103) {
                int cfr_ignored_0 = (0x8FAB8734 ^ n) - 1307361921;
            }
            if ((0x11A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        this.shts_2 = d;
        this.dhkhr = d2;
        this.dshq = d3;
        this.shrq = 0.0;
        this.khdn = true;
        this.zshk = System.nanoTime();
    }

    private void rhth_2() {
        try {
            int n = -5677379;
            n = Integer.rotateLeft(n * -733345457, 16) ^ 0x90A50983;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 3);
            int n2 = n ^ 0xE2996F01;
            if ((n2 ^ n) != -493261055) {
                int cfr_ignored_0 = (0x1D3031BC ^ n) - 727705340;
            }
            if ((0x1E8 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        this.shts_2 = 0.0;
        this.dhkhr = 0.0;
        this.dshq = 0.0;
        this.shrq = 0.0;
        this.khdn = false;
        this.zshk = 0L;
    }

    private boolean tdh_7() {
        int n = 1386925254;
        int n2 = (n = Integer.rotateLeft(n * -1697465555, 9) ^ 0x3D95CB52) ^ 0x6169D97D;
        if ((n2 ^ n) != 1634326909) {
            int cfr_ignored_0 = (0x33C315BB ^ n) - -864226433;
        }
        return !this.hdhl.shghkh();
    }

    private boolean tq() {
        int n = -1734362863;
        n = Integer.rotateLeft(n * -673546611, 13) ^ 0xD7CF1014;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 7);
        int n2 = n ^ 0x5A1E877E;
        if ((n2 ^ n) != 1511950206) {
            int cfr_ignored_0 = (0xC2813E6F ^ n) - 789388698;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.hdhl.shghkh();
    }

    private boolean jfd() {
        try {
            int n = 1331019653;
            n = Integer.rotateLeft(n * 2138514765, 23) ^ 0xA8D32142;
            int n2 = n ^ 0xDDC76EC8;
            if ((n2 ^ n) != -574132536) {
                int cfr_ignored_0 = (0x9292D14D ^ n) + 829941727;
            }
            if ((0x95 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return !this.jlt.shghkh();
    }

    private boolean dhtj() {
        try {
            int n = -21030955;
            n = Integer.rotateLeft(n * 223571655, 16) ^ 0x8C13CF86;
            int n2 = n ^ 0x359B57D;
            if ((n2 ^ n) != 56210813) {
                int cfr_ignored_0 = (0xFDE6A2A8 ^ n) + -1636982724;
            }
            if ((0x1B4 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.jlt.shghkh();
    }

    private static String shk_4(String string, int n, int n2, int n3) {
        int n4 = bghm.stkh(-61675280);
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = n2 ^ n4) ^ 0x78056D9A;
        if ((n5 ^ n4) != 2013621658) {
            int cfr_ignored_0 = Integer.rotateRight(0x8457856A ^ n4, 3) + 183944977;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0xE9339E53) + n2 ^ i * -1794690149) ^ thqq) + bdl_2);
        }
        return new String(cArray);
    }

    private static void dkhr_2() {
        int n = bghm.stkh(-1803951385);
        int n2 = n ^ 0x6866D3E5;
        if ((n2 ^ n) != 1751569381) {
            int cfr_ignored_0 = Integer.rotateRight(0xFC1F3102 ^ n, 18) + -1943761287;
        }
        yf.athz_2();
    }

    private static String[] dkhs_3(String string) {
        int n = -620029546;
        n = Integer.rotateLeft(n * -518460981, 14) ^ 0x1D4664AB;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xCAB7358F;
        if ((n2 ^ n) != -893962865) {
            int cfr_ignored_0 = (0x11BC2C19 ^ n) - 720084650;
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

    private static CallSite dhah_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1151479080;
            n3 = Integer.rotateLeft(n3 * -1477724051, 25) ^ 0x40DAA28B;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 23);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x7D37F781;
            if ((n4 ^ n3) != 2100819841) {
                int cfr_ignored_0 = (0xC66A2559 ^ n3) + 1458392938;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ rss_4 ^ string.hashCode() ^ n2 + ssz_4 + i * 1115016435) + rss_4) ^ ssz_4));
            }
            String[] stringArray = bkh_3.dkhs_3(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] uaefxn8l(String string) {
        return string.split("\u0002\u0018", -1);
    }

    private static CallSite zaprbqku5p(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ftc2lrk8369a ^ string.hashCode() ^ n2 + xtyfxhq ^ i * -168549159 ^ ftc2lrk8369a, 27) ^ xtyfxhq));
            }
            String[] stringArray = bkh_3.uaefxn8l(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

