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
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.thr_3;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;
import us.m0vy.moondlc.m0vyguard.yq;

@tq_2(name="Motion Blur", category=bzw.OTHER, desc="Smooth natural depth-reprojected motion blur")
public class bl_2
extends bnq {
    private static bl_2 thyk;
    private final tay dath = new tay(this, "Strength").shth_7(Float.intBitsToFloat(Integer.rotateLeft(0xECE66754 ^ 0xDFD52827, 18))).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xFF20F804 ^ 0xFF22FC04, 13))).rkh_3(Float.intBitsToFloat(0x615FF796 ^ 0x5C933B5B)).ssd_5(1.0f);
    private final badh_2 kh_2 = new badh_2(this, "Render".concat(" in F5")).bts(true);
    private final badh_2 thsb = new badh_2(this, "Refresh ".concat("Rate Scaling")).bts(true);
    private final badh_2 thwt_2 = new badh_2(this, "Depth Blur").bts(true);
    private final khd shbgh = new khd(this, "Algorithm");
    private final fy thzt_4 = new fy(this.shbgh, "Centered");
    private final fy dhkm = new fy(this.shbgh, "Backwards");
    private final tay thnr = new tay(this, "Max Samples").shth_7(Float.intBitsToFloat(0x7868D09A ^ 0x38E8D09A)).dhbs_2(Float.intBitsToFloat(1453003908 - 333124740)).rkh_3(Float.intBitsToFloat(0x5BB03549 ^ 0x1B303549)).ssd_5(Float.intBitsToFloat(0xCB6220DB ^ 0x896220DB));
    private static final int snl = 614538058;
    private static final int jhn = 2086065115;
    private static final int khan_2 = 798173465;
    private static final int hdhz = 1002063632;
    private static final int kip6kpt87w = 617644912;
    private static final int kpnqhl7szd4cv = 317079299;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int s0b8qfnyyv7is;

    public static bl_2 sygh_2() {
        block0: {
            int n = yq.khqa(469492575);
            int n2 = n ^ 0xAF722888;
            if ((n2 ^ n) == -1351473016) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xB489CBD7 ^ n, 9) - -519221692) * -1266037801;
        }
        return thyk;
    }

    public bl_2() {
        thyk = this;
        this.sdhdh(false);
    }

    public tay dkf_2() {
        block0: {
            int n = 1581465553;
            n = Integer.rotateLeft(n * -1440611941, 17) ^ 0xC6FE6977;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xA570A88E;
            if ((n2 ^ n) == -1519343474) break block0;
            int cfr_ignored_0 = (0xFB33975F ^ n) + 1057091479;
        }
        return this.dath;
    }

    public badh_2 jzd() {
        return this.kh_2;
    }

    public badh_2 zdm() {
        block0: {
            int n = -1047656070;
            n = Integer.rotateLeft(n * -488377803, 19) ^ 0xEE21BB72;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x3D29EBEE;
            if ((n2 ^ n) == 1026157550) break block0;
            int cfr_ignored_0 = (0xFCA7E294 ^ n) + -916647244;
        }
        return this.thsb;
    }

    public badh_2 aqh() {
        block0: {
            int n = 61064069;
            n = Integer.rotateLeft(n * 1528120145, 6) ^ 0xB7D32DD;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 9);
            int n2 = n ^ 0xBCEFFEA8;
            if ((n2 ^ n) == -1125122392) break block0;
            int cfr_ignored_0 = (0xBF4C3D2D ^ n) + 1170166010;
        }
        return this.thwt_2;
    }

    public khd khys() {
        block0: {
            int n = -1353525114;
            int n2 = (n = Integer.rotateLeft(n * 1928147677, 25) ^ 0xF1B7D641) ^ 0x72711C95;
            if ((n2 ^ n) == 1920015509) break block0;
            int cfr_ignored_0 = (0xDD23C413 ^ n) - 1246646580;
        }
        return this.shbgh;
    }

    public tay shdm() {
        block0: {
            int n = -1840625030;
            n = Integer.rotateLeft(n * -181397857, 26) ^ 0xAEC9DFEA;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x4D610716;
            if ((n2 ^ n) == 1298204438) break block0;
            int cfr_ignored_0 = (0xDF2B4D6C ^ n) - 1749448781;
        }
        return this.thnr;
    }

    public boolean tlsh() {
        try {
            int n = -1447476382;
            n = Integer.rotateLeft(n * -990654865, 12) ^ 0x1A2E044A;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xB2F09260;
            if ((n2 ^ n) != -1292856736) {
                int cfr_ignored_0 = (0x1B49D102 ^ n) + -223096575;
            }
            if ((0xFB & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return this.thzt_4.zths_4(bl_2.tdz_7(this.shbgh));
    }

    public int sdht() {
        int n = yq.khqa(731674191);
        int n2 = n ^ 0x74C72EA1;
        if ((n2 ^ n) != 1959210657) {
            int cfr_ignored_0 = Integer.rotateRight(0x5F5B58EE ^ n, 14) - -1871879155;
        }
        return this.tlsh() ? 1 : 0;
    }

    @Override
    public void nc() {
        int n = 46945718;
        n = Integer.rotateLeft(n * -872013835, 13) ^ 0x8D6A6C19;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 28);
        int n2 = n ^ 0x847E1244;
        if ((n2 ^ n) != -2072112572) {
            int cfr_ignored_0 = (0x86B247F2 ^ n) - -1491132552;
        }
        thr_3.swd_4().zfd_4();
    }

    private static String jtw_2(String string, int n, int n2, int n3) {
        int n4 = yq.khqa(1089263945);
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 26);
        int n5 = (n4 = n ^ n4) ^ 0x9C190D43;
        if ((n5 ^ n4) != -1676079805) {
            int cfr_ignored_0 = Integer.rotateRight(0xDCF5D40A ^ n4, 14) + -970830735;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xACFE051D ^ n2 ^ i * -315077117 ^ snl, 19) ^ jhn));
        }
        return new String(cArray);
    }

    private static fy tdz_7(khd khd2) {
        block0: {
            int n = 1054803296;
            int n2 = (n = Integer.rotateLeft(n * 1505356607, 9) ^ 0xDB459FCD) ^ 0x777BF6;
            if ((n2 ^ n) == 7830518) break block0;
            int cfr_ignored_0 = (0x3EA87E96 ^ n) - 658058144;
        }
        return khd2.sdh_2();
    }

    private static String[] jwk(String string) {
        int n = 1995216723;
        n = Integer.rotateLeft(n * 52618089, 13) ^ 0xCDFB8007;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x1405F496;
        if ((n2 ^ n) != 335934614) {
            int cfr_ignored_0 = (0x62E963C5 ^ n) + -1306816449;
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

    private static CallSite ghdq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1012185114;
            n3 = Integer.rotateLeft(n3 * 203944675, 25) ^ 0x84822ACD;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 19);
            String string4 = string2;
            n3 = (string4 != null ? System.identityHashCode(string4) : 0) ^ n3;
            int n4 = n3 ^ 0xB27F707;
            if ((n4 ^ n3) != 187168519) {
                int cfr_ignored_0 = (0x37734F1D ^ n3) - -257212809;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ khan_2 ^ string.hashCode() ^ n2 + hdhz + i * 832336741) + khan_2) ^ hdhz));
            }
            String[] stringArray = bl_2.jwk(new String(cArray));
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

    private static String[] au2p993xxsvayu(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite m3l205egtn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ kip6kpt87w ^ string.hashCode() ^ n2 + kpnqhl7szd4cv + i * 360784373) + kip6kpt87w) ^ kpnqhl7szd4cv));
            }
            String[] stringArray = bl_2.au2p993xxsvayu(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

