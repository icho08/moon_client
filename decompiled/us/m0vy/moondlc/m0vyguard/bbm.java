/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  org.joml.Vector2i
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.class_2561;
import org.joml.Vector2i;
import us.m0vy.moondlc.m0vyguard.bths_2;
import us.m0vy.moondlc.m0vyguard.bthn;
import us.m0vy.moondlc.m0vyguard.bdht_2;
import us.m0vy.moondlc.m0vyguard.bsj;
import us.m0vy.moondlc.m0vyguard.bzh_4;
import us.m0vy.moondlc.m0vyguard.tby;
import us.m0vy.moondlc.m0vyguard.az;
import us.m0vy.moondlc.m0vyguard.ah_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class bbm {
    private static final int hghh = 974333709;
    private static final int rad_3 = -228086306;
    private static final int thwz = 240966482;
    private static final int bths = -1153273902;
    private static final int ciotiyfyk = 2109076970;
    private static final int ojds73v5a = 2107293130;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int f1rmfkj4byiec;

    public bthn khthth() {
        block0: {
            int n = 940955822;
            n = Integer.rotateLeft(n * -1247728713, 26) ^ 0x57D0DD95;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xED964DFD;
            if ((n2 ^ n) == -308916739) break block0;
            int cfr_ignored_0 = (0xD5839553 ^ n) - 1749533400;
        }
        return bbm.sddh_4(bbm.jsj_2("顁뻮쒙", bbm.shqdh(0x15B73478 ^ 0xC066C392, 25), Integer.rotateLeft(0x9CAEEA8C ^ 0xC7331B23, 30), Integer.reverse(-1991681239) ^ 0xEC116CB1), this::khsha).szy_2();
    }

    private void ghath(bths_2 bths2) {
        try {
            int n = 29355360;
            n = Integer.rotateLeft(n * -1293460449, 12) ^ 0x1DD46247;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
            bths_2 bths3 = bths2;
            n = Integer.rotateLeft((bths3 != null ? System.identityHashCode(bths3) : 0) ^ n, 12);
            int n2 = n ^ 0x3984A25;
            if ((n2 ^ n) != 60312101) {
                int cfr_ignored_0 = (0x227A745 ^ n) + 304863089;
            }
            if ((0x30C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            bbm.khhr();
        }
        String string = (String)bths2.arguments().get(0);
        Integer n = (Integer)bbm.zmq_2(bths2).get(1);
        Integer n3 = (Integer)bths2.arguments().get(2);
        az az2 = az.thdhh_2();
        if (string.equalsIgnoreCase("off")) {
            if (az2.thsht_2() == null) {
                bzh_4.ttht_3(class_2561.method_30163((String)"What are you trying to turn off?"));
            } else {
                bbm.bddh_2(az2, null);
                bzh_4.ttht_3(bbm.tqf_2("Route succes".concat("sfully deleted.")));
            }
        } else if (string.equalsIgnoreCase("add")) {
            if (n == null || n3 == null) {
                bzh_4.dhght_2(bbm.bskh_2("Usage: .gp".concat("s add <x> <z>")));
                return;
            }
            if (n == 0 && n3 == 0) {
                bzh_4.dhght_2(class_2561.method_30163((String)"You can't set a ".concat(bbm.jsj_2("粨幙捔悼┯ᾫ⋙ꅂ", bbm.zjj(0xCC64D443 ^ 0x8E58FA57, 7), -1204705446 - -1814345876, Integer.rotateLeft(0xB4DBF6DB ^ 0xF6A4465A, 3))).concat("ro coordinates.")));
            } else {
                Vector2i vector2i = new Vector2i(n.intValue(), n3.intValue());
                if (az2.thsht_2() != null && bbm.zzh_2(az2.thsht_2(), vector2i)) {
                    bzh_4.ttht_3(class_2561.method_30163((String)"This point is alrea".concat("dy in the route.")));
                } else {
                    az2.dhkhw(vector2i);
                    bbm.drgh_2(class_2561.method_30163((String)("Route set: " + vector2i.x + " " + vector2i.y)));
                }
            }
        }
    }

    private void khsha(bdht_2 bdht2) {
        int n = -278353925;
        int n2 = (n = Integer.rotateLeft(n * 744850627, 22) ^ 0xD538699C) ^ 0x760A3D00;
        if ((n2 ^ n) != 1980382464) {
            int cfr_ignored_0 = (0x99629AFB ^ n) + -1842319230;
        }
        bdht2.brsh("commands.gps.description").dqdh_2("action", bbm::shghn).dqdh_2("x", bbm::dhdhz).dqdh_2("z", bbm::fs_2).jmz(this::ghath);
    }

    private static void fs_2(bsj bsj2) {
        int n = 1808693707;
        int n2 = (n = Integer.rotateLeft(n * 1214490343, 9) ^ 0x5B87CBF7) ^ 0xBE6BF54F;
        if ((n2 ^ n) != -1100221105) {
            int cfr_ignored_0 = (0xD5A58C84 ^ n) - 840655992;
        }
        bsj2.tkn().tkk_2(bbm::sshkh_2);
    }

    private static ah_2 sshkh_2(String string) {
        try {
            int n = 1775547660;
            n = Integer.rotateLeft(n * 691563093, 28) ^ 0xCF884265;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 16);
            int n2 = n ^ 0x6D9DFD22;
            if ((n2 ^ n) != 1839070498) {
                int cfr_ignored_0 = (0x449482E ^ n) - 1827342491;
            }
            return ah_2.tsy(Integer.parseInt(string));
        }
        catch (NumberFormatException numberFormatException) {
            return ah_2.thsdh_2("'" + string + "' is not a number");
        }
    }

    private static void dhdhz(bsj bsj2) {
        int n = tby.rath(-1011566565);
        bsj bsj3 = bsj2;
        n = Integer.rotateLeft((bsj3 != null ? System.identityHashCode(bsj3) : 0) ^ n, 27);
        int n2 = n ^ 0x12B5CB56;
        if ((n2 ^ n) != 313903958) {
            int cfr_ignored_0 = Integer.rotateLeft(0xD101734D ^ n, 13) - 1401591182;
            int cfr_ignored_1 = (int)(0x13B3DD7027D4EB4FL ^ (long)n ^ 0x4790831A2DB98AB6L);
        }
        bsj2.tkn().tkk_2(bbm::adkh);
    }

    private static ah_2 adkh(String string) {
        try {
            int n = 1422061949;
            n = Integer.rotateLeft(n * 113975569, 19) ^ 0x8F0D18CF;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xF3E972A0;
            if ((n2 ^ n) != -202804576) {
                int cfr_ignored_0 = (0xA72B83DD ^ n) + 2003184664;
            }
            return ah_2.tsy(Integer.parseInt(string));
        }
        catch (NumberFormatException numberFormatException) {
            return ah_2.thsdh_2("'" + string + "' is not a number");
        }
    }

    private static void shghn(bsj bsj2) {
        int n = tby.rath(-123675067);
        int n2 = n ^ 0x125AD517;
        if ((n2 ^ n) != 307942679) {
            int cfr_ignored_0 = (Integer.rotateRight(0xEAFA0B52 ^ n, 16) + 2024078889) * -352711853;
        }
        bsj2.dby_2("add", "off");
    }

    private static String jsj_2(String string, int n, int n2, int n3) {
        int n4 = -198229773;
        n4 = Integer.rotateLeft(n4 * -1711563915, 26) ^ 0x3C4740CD;
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 23);
        int n5 = (n4 = Integer.rotateRight(n ^ n4, 24)) ^ 0xC7B7907E;
        if ((n5 ^ n4) != -944271234) {
            int cfr_ignored_0 = (0x3398D08D ^ n4) - -30941863;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x66ABC116) + n2 ^ i * 291484177) ^ hghh) + rad_3);
        }
        return new String(cArray);
    }

    private static int shqdh(int n, int n2) {
        block0: {
            int n3 = tby.rath(1006494147);
            int n4 = n3 ^ 0x765C1827;
            if ((n4 ^ n3) == 1985746983) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x4DA1F9E4 ^ n3, 12) - 1794826711;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static bdht_2 sddh_4(String string, Consumer consumer) {
        block0: {
            int n = 796410326;
            int n2 = (n = Integer.rotateLeft(n * -595665359, 13) ^ 0x31963411) ^ 0x9A58C7E2;
            if ((n2 ^ n) == -1705457694) break block0;
            int cfr_ignored_0 = (0xB5208634 ^ n) + -750621337;
        }
        return bdht_2.jngh(string, consumer);
    }

    private static void khhr() {
        int n = tby.rath(1204109885);
        int n2 = n ^ 0x9C344AB9;
        if ((n2 ^ n) != -1674294599) {
            int cfr_ignored_0 = Integer.rotateLeft(0xDBF10884 ^ n, 14) - -1500666057;
        }
        yf.athz_2();
    }

    private static List zmq_2(bths_2 bths2) {
        block0: {
            int n = -1364652211;
            int n2 = (n = Integer.rotateLeft(n * -786847017, 24) ^ 0xD251E4F6) ^ 0xC0CECE94;
            if ((n2 ^ n) == -1060188524) break block0;
            int cfr_ignored_0 = (0x6E67C1D9 ^ n) + -2105137527;
        }
        return bths2.arguments();
    }

    private static String hym(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 288899546;
            int n5 = (n4 = Integer.rotateLeft(n4 * -657523337, 20) ^ 0xBDE0E192) ^ 0x4C7CC4CE;
            if ((n5 ^ n4) == 1283245262) break block0;
            int cfr_ignored_0 = (0x5D448514 ^ n4) + -402303878;
        }
        return bbm.jsj_2(string, n, n2, n3);
    }

    private static void bddh_2(az az2, Vector2i vector2i) {
        int n = -1280032563;
        int n2 = (n = Integer.rotateLeft(n * -225085739, 19) ^ 0xBEC274C9) ^ 0xE5223466;
        if ((n2 ^ n) != -450743194) {
            int cfr_ignored_0 = (0x569674AB ^ n) - 1547035381;
        }
        az2.dhkhw(vector2i);
    }

    private static class_2561 tqf_2(String string) {
        block0: {
            int n = 2114901164;
            n = Integer.rotateLeft(n * -222291591, 8) ^ 0xE16593C5;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 16);
            int n2 = n ^ 0x6D9A7161;
            if ((n2 ^ n) == 1838838113) break block0;
            int cfr_ignored_0 = (0x1394A5CD ^ n) - -289759565;
        }
        return class_2561.method_30163((String)string);
    }

    private static class_2561 bskh_2(String string) {
        block0: {
            int n = -249768180;
            n = Integer.rotateLeft(n * 1506259873, 4) ^ 0x502F8AEF;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 28);
            int n2 = n ^ 0x733F9ABB;
            if ((n2 ^ n) == 1933548219) break block0;
            int cfr_ignored_0 = (0x82234DB7 ^ n) + 1878350666;
        }
        return class_2561.method_30163((String)string);
    }

    private static int zjj(int n, int n2) {
        block0: {
            int n3 = -1574513023;
            n3 = Integer.rotateLeft(n3 * 1597188721, 5) ^ 0x11E7DE3D;
            int n4 = (n3 = Integer.rotateLeft(n ^ n3, 18)) ^ 0xEA2C3CF;
            if ((n4 ^ n3) == 245547983) break block0;
            int cfr_ignored_0 = (0xAC84154E ^ n3) - -1313224031;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static boolean zzh_2(Vector2i vector2i, Object object) {
        block0: {
            int n = 1945170420;
            n = Integer.rotateLeft(n * -1223959495, 19) ^ 0xDE2AB506;
            Vector2i vector2i2 = vector2i;
            n = (vector2i2 != null ? System.identityHashCode(vector2i2) : 0) ^ n;
            int n2 = n ^ 0xE1C96A21;
            if ((n2 ^ n) == -506893791) break block0;
            int cfr_ignored_0 = (0x92399BD5 ^ n) - 2021342887;
        }
        return vector2i.equals(object);
    }

    private static String skhr_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -857735836;
            n4 = Integer.rotateLeft(n4 * -1932147517, 9) ^ 0x49C086DD;
            n4 = Integer.rotateLeft(n2 ^ n4, 25);
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 18)) ^ 0x4FFAE077;
            if ((n5 ^ n4) == 1341841527) break block0;
            int cfr_ignored_0 = (0x83251D13 ^ n4) - 188928239;
        }
        return bbm.jsj_2(string, n, n2, n3);
    }

    private static void drgh_2(class_2561 class_25612) {
        int n = tby.rath(-1284220964);
        int n2 = n ^ 0xC050397C;
        if ((n2 ^ n) != -1068484228) {
            int cfr_ignored_0 = Integer.rotateLeft(0x73246EA0 ^ n, 17) + -171506533;
        }
        bzh_4.ttht_3(class_25612);
    }

    private static String[] dshb_2(String string) {
        int n = tby.rath(-255629914);
        int n2 = n ^ 0x61DECC94;
        if ((n2 ^ n) != 1641991316) {
            int cfr_ignored_0 = (Integer.rotateRight(0x911DA932 ^ n, 5) + -1762321335) * -1860327117;
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

    private static CallSite sha_9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1451765505;
            n3 = Integer.rotateLeft(n3 * 275166303, 22) ^ 0xCBC3582D;
            n3 = Integer.rotateRight(n ^ n3, 29);
            Class clazz2 = clazz;
            n3 = (clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n3;
            int n4 = n3 ^ 0x488971BE;
            if ((n4 ^ n3) != 1216967102) {
                int cfr_ignored_0 = (0x1E015EBF ^ n3) - 502330666;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ thwz ^ string.hashCode() ^ n2 + bths + i * 1958664505) + thwz) ^ bths));
            }
            String[] stringArray = bbm.dshb_2(new String(cArray));
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

    private static String[] ynyphque(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite q6y5b74dpgi(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ciotiyfyk ^ string.hashCode() ^ n2 + ojds73v5a ^ i * -1374584065 ^ ciotiyfyk, 13) ^ ojds73v5a));
            }
            String[] stringArray = bbm.ynyphque(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

