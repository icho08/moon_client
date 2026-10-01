/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_304
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_304;
import us.m0vy.moondlc.m0vyguard.bshy;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.ny;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public final class bthf
implements tthy {
    private static final int thad_3 = 1621239156;
    private static final int shjz_2 = 652230754;
    private static final int zfk = -1613076963;
    private static final int syf = 909137397;
    private static final int qpylqjtka5 = 2009615037;
    private static final int faylejcet = 1773377208;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int z5z814ltlmo;

    private bthf() {
        throw new UnsupportedOperationException("Util".concat("ity class"));
    }

    public static boolean t_3() {
        block0: {
            int n = 1210480881;
            int n2 = (n = Integer.rotateLeft(n * -1799493375, 7) ^ 0x6437D9F5) ^ 0x8C10417C;
            if ((n2 ^ n) == -1945091716) break block0;
            int cfr_ignored_0 = (0xC436398D ^ n) + -708038830;
        }
        return bthf.mc.field_1690.field_1894.method_1434();
    }

    public static boolean hjd() {
        block0: {
            int n = -1927474297;
            int n2 = (n = Integer.rotateLeft(n * -794578063, 24) ^ 0xD5BD202D) ^ 0xD5D11244;
            if ((n2 ^ n) == -707718588) break block0;
            int cfr_ignored_0 = (0x58CC01C3 ^ n) + 2080565748;
        }
        return bthf.aqsh(bthf.mc.field_1690.field_1881);
    }

    public static boolean ghtd_2() {
        block0: {
            int n = -27238779;
            int n2 = (n = Integer.rotateLeft(n * 2083031283, 18) ^ 0x8A218A5E) ^ 0x5D3E9BEF;
            if ((n2 ^ n) == 1564384239) break block0;
            int cfr_ignored_0 = (0xA35EC56A ^ n) + 97720663;
        }
        return bthf.mc.field_1690.field_1913.method_1434();
    }

    public static boolean zaa() {
        block0: {
            int n = -105518798;
            int n2 = (n = Integer.rotateLeft(n * 1017221133, 5) ^ 0x34247A1B) ^ 0x3139497C;
            if ((n2 ^ n) == 825837948) break block0;
            int cfr_ignored_0 = (0xC88CA04E ^ n) + -194270795;
        }
        return bthf.mc.field_1690.field_1849.method_1434();
    }

    public static boolean dhst_2() {
        try {
            int n = -1751364387;
            n = Integer.rotateLeft(n * 49531387, 23) ^ 0x761B77E6;
            int n2 = n ^ 0x39BFE626;
            if ((n2 ^ n) != 968877606) {
                int cfr_ignored_0 = (0xAE23AAFB ^ n) + 1118258646;
            }
            if ((0x287 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return bthf.mc.field_1724 != null && (bthf.mc.field_1724.field_6250 != 0.0f || bthf.mc.field_1724.field_6212 != 0.0f);
    }

    public static double[] tshd(double d) {
        float f;
        int n = -508361398;
        int n2 = (n = Integer.rotateLeft(n * -1127836689, 28) ^ 0x7FB77FE5) ^ 0x1559E9DC;
        if ((n2 ^ n) != 358214108) {
            int cfr_ignored_0 = (0xF4EAEC96 ^ n) - -11494471;
        }
        if (bthf.mc.field_1724 == null) {
            return new double[]{0.0, 0.0};
        }
        float f2 = bthf.mc.field_1724.field_3913.field_3905;
        float f3 = bthf.mc.field_1724.field_3913.field_3907;
        ny ny2 = bthf.gha().getRotationHandler();
        float f4 = f = ny2.smf() ? bthf.mc.field_1724.method_36454() : bthf.dsz_4(bthf.shsa(ny2));
        if (f2 == 0.0f && f3 == 0.0f) {
            return new double[]{0.0, 0.0};
        }
        if (f2 != 0.0f) {
            if (f3 > 0.0f) {
                f += f2 > 0.0f ? bthf.swz_3(Integer.rotateLeft(0x3FE5820D ^ 0x39F4220D, 5)) : Float.intBitsToFloat(Integer.rotateLeft(0x7D5CDC19 ^ 0x751A5C19, 3));
            } else if (f3 < 0.0f) {
                f += f2 > 0.0f ? Float.intBitsToFloat(912402368 + 198301760) : Float.intBitsToFloat(Integer.reverse(1610689744) ^ 0xC9008006);
            }
            f3 = 0.0f;
            f2 = f2 > 0.0f ? 1.0f : Float.intBitsToFloat(0x6150A42A ^ 0xDED0A42A);
        }
        double d2 = Math.sin(Math.toRadians(f + Float.intBitsToFloat(1025990491 + 93102245)));
        double d3 = bthf.shlh(Math.toRadians(f + Float.intBitsToFloat(-1928338957 + -1247535603)));
        double d4 = (double)f2 * d * d3 + (double)f3 * d * d2;
        double d5 = (double)f2 * d * d2 - (double)f3 * d * d3;
        return new double[]{d4, d5};
    }

    public static void khlt_2(double d) {
        try {
            int n = 656809947;
            n = Integer.rotateLeft(n * 981233695, 20) ^ 0x7D7ED5EC;
            int n2 = n ^ 0x5CE8C242;
            if ((n2 ^ n) != 1558757954) {
                int cfr_ignored_0 = (0x7BCEDD99 ^ n) - -270401988;
            }
            if ((0x33D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!bthf.tan_4()) {
            bthf.jtt();
            throw null;
        }
        if (bthf.mc.field_1724 == null) {
            return;
        }
        double[] dArray = bthf.sagh_2(d);
        bthf.mc.field_1724.method_18800(dArray[0], bthf.mc.field_1724.method_18798().field_1351, dArray[1]);
    }

    public static double thjl(float f, float f2, float f3) {
        if (f2 < 0.0f) {
            f += 180.0f;
        }
        float f4 = 1.0f;
        if (f2 < 0.0f) {
            f4 = -0.5f;
        }
        if (f2 > 0.0f) {
            f4 = 0.5f;
        }
        if (f3 > 0.0f) {
            f -= 90.0f * f4;
        }
        if (f3 < 0.0f) {
            f += 90.0f * f4;
        }
        return Math.toRadians(f);
    }

    private static String zqq_2(String string, int n, int n2, int n3) {
        int n4 = 705064802;
        n4 = Integer.rotateLeft(n4 * 484913437, 21) ^ 0x88BA6F37;
        n4 = n ^ n4;
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 13)) ^ 0x99C74160;
        if ((n5 ^ n4) != -1714994848) {
            int cfr_ignored_0 = (0xB3C12E02 ^ n4) + -1807067718;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0xD3A58F4E) + thad_3 ^ Integer.reverse(n2 + i * -987674333), 15) - shjz_2);
        }
        return new String(cArray);
    }

    private static boolean aqsh(class_304 class_3042) {
        block0: {
            int n = bshy.rkhz(-941437298);
            int n2 = n ^ 0x142FA614;
            if ((n2 ^ n) == 338667028) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xD3CD689A ^ n, 13) + -1438823967) * -741513061;
        }
        return class_3042.method_1434();
    }

    private static Moondlc gha() {
        block0: {
            int n = bshy.rkhz(-1294493081);
            int n2 = n ^ 0x47726457;
            if ((n2 ^ n) == 1198679127) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xF5A5FE30 ^ n, 17) + -1015585013) * -173670863;
        }
        return Moondlc.getInstance();
    }

    private static lb shsa(ny ny2) {
        block0: {
            int n = -722206923;
            n = Integer.rotateLeft(n * -146676701, 8) ^ 0xDE3266D5;
            ny ny3 = ny2;
            n = (ny3 != null ? System.identityHashCode(ny3) : 0) ^ n;
            int n2 = n ^ 0x20A41E14;
            if ((n2 ^ n) == 547626516) break block0;
            int cfr_ignored_0 = (0xF457E121 ^ n) + 1438129200;
        }
        return ny2.dhdf();
    }

    private static float dsz_4(lb lb2) {
        block0: {
            int n = 1601916318;
            int n2 = (n = Integer.rotateLeft(n * -463625493, 18) ^ 0x4178F77E) ^ 0x6E1316E4;
            if ((n2 ^ n) == 1846744804) break block0;
            int cfr_ignored_0 = (0x31685B7A ^ n) + 1700980627;
        }
        return lb2.sry();
    }

    private static float swz_3(int n) {
        block0: {
            int n2 = -556186466;
            n2 = Integer.rotateLeft(n2 * 1678233113, 17) ^ 0xBFE067C4;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 2)) ^ 0xDE68B0F4;
            if ((n3 ^ n2) == -563564300) break block0;
            int cfr_ignored_0 = (0xB1F46A ^ n2) - -448747846;
        }
        return Float.intBitsToFloat(n);
    }

    private static double shlh(double d) {
        block0: {
            int n = 359037095;
            int n2 = (n = Integer.rotateLeft(n * -1535246617, 8) ^ 0x8AA55886) ^ 0x3F874E0;
            if ((n2 ^ n) == 66614496) break block0;
            int cfr_ignored_0 = (0x169E0C47 ^ n) - 2086218764;
        }
        return Math.cos(d);
    }

    private static boolean tan_4() {
        block0: {
            int n = bshy.rkhz(1985198974);
            int n2 = n ^ 0x6049F74F;
            if ((n2 ^ n) == 1615460175) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x161A4C31 ^ n, 5) + -1316169430) * 370822193;
            int cfr_ignored_1 = (int)(0xD4A8E20C27D4EB4FL ^ (long)n ^ 0x3968831A2DB80480L);
        }
        return yf.khdha_2();
    }

    private static void jtt() {
        int n = 1724744422;
        int n2 = (n = Integer.rotateLeft(n * -518285989, 16) ^ 0xB0F7BB86) ^ 0x129E3367;
        if ((n2 ^ n) != 312357735) {
            int cfr_ignored_0 = (0x7453B181 ^ n) - 173893436;
        }
        yf.athz_2();
    }

    private static double[] sagh_2(double d) {
        block0: {
            int n = -1647173337;
            n = Integer.rotateLeft(n * 2049837763, 16) ^ 0xA468EFF;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 3);
            int n2 = n ^ 0xBA7B7D02;
            if ((n2 ^ n) == -1166312190) break block0;
            int cfr_ignored_0 = (0x27A95C25 ^ n) + -1249341657;
        }
        return bthf.tshd(d);
    }

    private static String[] srn(String string) {
        int n = bshy.rkhz(21598513);
        int n2 = n ^ 0x43AFFA83;
        if ((n2 ^ n) != 1135606403) {
            int cfr_ignored_0 = (Integer.rotateRight(0x42E66BB2 ^ n, 11) + 507816393) * 1122397107;
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

    private static CallSite zshm(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 146293673;
            n3 = Integer.rotateLeft(n3 * -185099719, 9) ^ 0x63980306;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 20);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 15);
            int n4 = n3 ^ 0x71925A5C;
            if ((n4 ^ n3) != 1905416796) {
                int cfr_ignored_0 = (0x792A19F5 ^ n3) + -535721359;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ zfk ^ string.hashCode()) + (n2 + syf) + i ^ zfk, 7) + syf);
            }
            String[] stringArray = bthf.srn(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] lyat7sdk(String string) {
        return string.split("\u0007\u0018", -1);
    }

    private static CallSite bistpqyp66g06(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ qpylqjtka5 ^ string.hashCode()) + (n2 + faylejcet) + i ^ qpylqjtka5, 20) + faylejcet);
            }
            String[] stringArray = bthf.lyat7sdk(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

