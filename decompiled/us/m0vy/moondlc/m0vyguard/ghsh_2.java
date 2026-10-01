/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Locale;
import java.util.Objects;
import us.m0vy.moondlc.m0vyguard.bad;
import us.m0vy.moondlc.m0vyguard.bdq;
import us.m0vy.moondlc.m0vyguard.bmt;
import us.m0vy.moondlc.m0vyguard.tsw;
import us.m0vy.moondlc.m0vyguard.yf;

public final class ghsh_2 {
    private static final int zhb_2 = 425468758;
    private static final int thdw_2 = -1159213958;
    private static final int sshth = -1160201681;
    private static final int rqkh = 2116149145;
    private static final int x2oa0af = 211646342;
    private static final int qhmgi71u5 = 586024890;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int q61k5cf5q;

    private ghsh_2() {
    }

    public static String shhw(String string, String string2, Object ... objectArray) {
        block0: {
            int n = bdq.jkha_2(965046042);
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            String string4 = string2;
            n = (string4 != null ? System.identityHashCode(string4) : 0) ^ n;
            int n2 = n ^ 0xD6CDCC9A;
            if ((n2 ^ n) == -691155814) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xEF48A380 ^ n, 16) + -30839877;
        }
        return ghsh_2.bmz(string, string2, objectArray);
    }

    public static String zadh_3(String string) {
        block0: {
            int n = 1741743970;
            n = Integer.rotateLeft(n * 398188647, 22) ^ 0x95E376E8;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 6);
            int n2 = n ^ 0xBFB065F0;
            if ((n2 ^ n) == -1078958608) break block0;
            int cfr_ignored_0 = (0xD8608292 ^ n) + 1659006741;
        }
        return string;
    }

    public static String sdf_2(bmt bmt2) {
        int n = 77359271;
        n = Integer.rotateLeft(n * 1894459977, 11) ^ 0x592277B6;
        bmt bmt3 = bmt2;
        n = (bmt3 != null ? System.identityHashCode(bmt3) : 0) ^ n;
        int n2 = n ^ 0x2A81B1CD;
        if ((n2 ^ n) != 713142733) {
            int cfr_ignored_0 = (0x2E1DD96A ^ n) - -1591583111;
        }
        return bmt2 == null ? "" : ghsh_2.zdd_2(bmt2);
    }

    public static String rhr_2(tsw tsw2, String string) {
        block0: {
            int n = 1219922722;
            int n2 = (n = Integer.rotateLeft(n * 1239532919, 23) ^ 0x6AC8006D) ^ 0x8A247A5E;
            if ((n2 ^ n) == -1977320866) break block0;
            int cfr_ignored_0 = (0xC292F17C ^ n) + 1819947636;
        }
        return string;
    }

    public static String shwd_2(bad bad2) {
        int n = 1151462143;
        n = Integer.rotateLeft(n * 1356603551, 17) ^ 0xD65B060A;
        bad bad3 = bad2;
        n = Integer.rotateLeft((bad3 != null ? System.identityHashCode(bad3) : 0) ^ n, 8);
        int n2 = n ^ 0x232F5574;
        if ((n2 ^ n) != 590304628) {
            int cfr_ignored_0 = (0x678EBF8B ^ n) - -38705863;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (bad2 == null) {
            return "";
        }
        String string = ghsh_2.tygh(bad2);
        if (string == null || string.isBlank()) {
            return string;
        }
        return string;
    }

    public static String bmz(String string, String string2, Object ... objectArray) {
        try {
            int n = 76833134;
            n = Integer.rotateLeft(n * 487597211, 21) ^ 0x67DFF014;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            n = Integer.rotateLeft((objectArray != null ? System.identityHashCode(objectArray) : 0) ^ n, 3);
            int n2 = n ^ 0x79C38CB7;
            if ((n2 ^ n) != 2042858679) {
                int cfr_ignored_0 = (0x7D57EDD9 ^ n) - -1718276888;
            }
            if ((0x2BA & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (ghsh_2.bdhz()) {
            throw null;
        }
        if (string2 == null) {
            return "";
        }
        if (objectArray == null || objectArray.length == 0) {
            return string2;
        }
        try {
            return String.format(Locale.ROOT, string2, objectArray);
        }
        catch (Exception exception) {
            return string2;
        }
    }

    public static String bbn(String string) {
        try {
            int n = 1505946714;
            n = Integer.rotateLeft(n * -1115376027, 6) ^ 0xADC11B12;
            int n2 = n ^ 0x889FF5A0;
            if ((n2 ^ n) != -2002782816) {
                int cfr_ignored_0 = (0xD15D19FA ^ n) + -1395534916;
            }
            if ((0x1D0 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        String string2 = ghsh_2.ssz_5(Objects.toString(string, "").trim().toLowerCase(Locale.ROOT), "[^a-z0-9]+", "_").replaceAll("_+", ghsh_2.tsm_4("溩", 1070732843 - -1379106428, ghsh_2.sghl(53126597) ^ 0xA9A39CF5, Integer.reverse(-141662715) ^ 0x2F0B4543));
        if (string2.startsWith(ghsh_2.tsm_4("컬", Integer.reverse(1977830164) ^ 0x5A1081FD, 0x16B32778 ^ 0xBCF82270, ghsh_2.thtkh_2(0xCC5CBD76 ^ 0x81779EAD, 18)))) {
            string2 = string2.substring(1);
        }
        if (string2.endsWith("_")) {
            string2 = string2.substring(0, string2.length() - 1);
        }
        return string2;
    }

    private static String tsm_4(String string, int n, int n2, int n3) {
        int n4 = 1326199412;
        n4 = Integer.rotateLeft(n4 * -1561219955, 20) ^ 0xE3E68870;
        n4 = Integer.rotateRight(n ^ n4, 18);
        int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 17)) ^ 0xE8BC351A;
        if ((n5 ^ n4) != -390318822) {
            int cfr_ignored_0 = (0xA7B0076E ^ n4) + -1125015917;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x4B2A3B39 ^ n2 ^ i * 1704185759 ^ zhb_2, 15) ^ thdw_2));
        }
        return new String(cArray);
    }

    private static String zdd_2(bmt bmt2) {
        block0: {
            int n = -1597107854;
            int n2 = (n = Integer.rotateLeft(n * 1716024681, 3) ^ 0xC4423F4) ^ 0x87072D94;
            if ((n2 ^ n) == -2029572716) break block0;
            int cfr_ignored_0 = (0x27C93CE6 ^ n) + 728657337;
        }
        return bmt2.thbb();
    }

    private static String tygh(bad bad2) {
        block0: {
            int n = 148434228;
            n = Integer.rotateLeft(n * -226203205, 5) ^ 0x4CBCE09D;
            bad bad3 = bad2;
            n = Integer.rotateRight((bad3 != null ? System.identityHashCode(bad3) : 0) ^ n, 22);
            int n2 = n ^ 0xCB38E006;
            if ((n2 ^ n) == -885465082) break block0;
            int cfr_ignored_0 = (0xC3E00D32 ^ n) + -1906811879;
        }
        return bad2.dyd_4();
    }

    private static boolean bdhz() {
        block0: {
            int n = -1253290656;
            int n2 = (n = Integer.rotateLeft(n * 1076129721, 5) ^ 0x3AC03146) ^ 0x5E5A23B3;
            if ((n2 ^ n) == 1582965683) break block0;
            int cfr_ignored_0 = (0xEB166ED3 ^ n) + 1345175183;
        }
        return yf.dnkh();
    }

    private static String ssz_5(String string, String string2, String string3) {
        block0: {
            int n = -1617150412;
            n = Integer.rotateLeft(n * -2098775061, 7) ^ 0xC78A2E96;
            String string4 = string2;
            n = (string4 != null ? System.identityHashCode(string4) : 0) ^ n;
            String string5 = string3;
            n = (string5 != null ? System.identityHashCode(string5) : 0) ^ n;
            int n2 = n ^ 0xC697DC17;
            if ((n2 ^ n) == -963126249) break block0;
            int cfr_ignored_0 = (0x590BE223 ^ n) - 548245751;
        }
        return string.replaceAll(string2, string3);
    }

    private static int sghl(int n) {
        block0: {
            int n2 = -79719504;
            n2 = Integer.rotateLeft(n2 * 376378355, 15) ^ 0x72BB617B;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 20)) ^ 0xB9337B5E;
            if ((n3 ^ n2) == -1187808418) break block0;
            int cfr_ignored_0 = (0x420CE8EE ^ n2) - 1492057455;
        }
        return Integer.reverse(n);
    }

    private static int thtkh_2(int n, int n2) {
        block0: {
            int n3 = bdq.jkha_2(-1738581323);
            n3 = Integer.rotateLeft(n ^ n3, 15);
            int n4 = (n3 = n2 ^ n3) ^ 0x7247D82F;
            if ((n4 ^ n3) == 1917311023) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xEA18829A ^ n3, 16) + 1565880289) * -367492453;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String dthkh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1712874792;
            n4 = Integer.rotateLeft(n4 * -1224649171, 9) ^ 0x8B30B100;
            n4 = Integer.rotateLeft(n ^ n4, 12);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 11)) ^ 0x61970022;
            if ((n5 ^ n4) == 1637285922) break block0;
            int cfr_ignored_0 = (0x78F650A ^ n4) - 2073945736;
        }
        return ghsh_2.tsm_4(string, n, n2, n3);
    }

    private static String[] shaz_2(String string) {
        block0: {
            int n = -1715213553;
            n = Integer.rotateLeft(n * 1818037497, 8) ^ 0xB880745D;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 22);
            int n2 = n ^ 0x88D571EE;
            if ((n2 ^ n) == -1999277586) break block0;
            int cfr_ignored_0 = (0x11169AE1 ^ n) - 1226607493;
        }
        return string.split("\u0002\u0018", -1);
    }

    private static CallSite dbz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1949452001;
            n3 = Integer.rotateLeft(n3 * 1486954179, 13) ^ 0x370DE95B;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 29);
            int n4 = n3 ^ 0x938D5433;
            if ((n4 ^ n3) != -1819454413) {
                int cfr_ignored_0 = (0x1840ED2C ^ n3) - -1424594551;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ sshth ^ string.hashCode() ^ n2 + rqkh ^ i * -891284995 ^ sshth, 13) ^ rqkh));
            }
            String[] stringArray = ghsh_2.shaz_2(new String(cArray));
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

    private static String[] rtgyylt6(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ss3fl3ee(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ x2oa0af ^ string.hashCode() ^ n2 + qhmgi71u5 ^ i * 864421889 ^ x2oa0af, 17) ^ qhmgi71u5));
            }
            String[] stringArray = ghsh_2.rtgyylt6(new String(cArray));
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

