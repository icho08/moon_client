/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_337
 *  net.minecraft.class_345
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import net.minecraft.class_310;
import net.minecraft.class_337;
import net.minecraft.class_345;
import net.minecraft.class_638;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.bkk;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.mixin.accessors.BossBarHudAccessor;

public class tdhr
implements dl {
    private static final int zdd_4 = 23875692;
    private static final int jba_2 = -177748264;
    private static final int stk = 2088436614;
    private static final int jzz_3 = -325243013;
    private static final int vqzghghm28r6 = 1941163161;
    private static final int hjz9xzlcvzs7 = -1190365189;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int y9ufol92cbo;

    public static class_746 dhzn() {
        block0: {
            int n = 698934830;
            int n2 = (n = Integer.rotateLeft(n * 737504603, 13) ^ 0xC8F5C46D) ^ 0xDAF688CE;
            if ((n2 ^ n) == -621377330) break block0;
            int cfr_ignored_0 = (0xF35E6EE0 ^ n) - -1912408270;
        }
        return tdhr.tdkh_2().field_1724;
    }

    public static class_638 hwn() {
        block0: {
            int n = 1737436840;
            int n2 = (n = Integer.rotateLeft(n * 294784393, 8) ^ 0x8F03C4D0) ^ 0x4A96A8BF;
            if ((n2 ^ n) == 1251387583) break block0;
            int cfr_ignored_0 = (0x2D198617 ^ n) + -859444014;
        }
        return class_310.method_1551().field_1687;
    }

    public static boolean zdj_4() {
        int n = -1101008898;
        int n2 = (n = Integer.rotateLeft(n * -482420935, 3) ^ 0xA358B608) ^ 0xD153395B;
        if ((n2 ^ n) != -783074981) {
            int cfr_ignored_0 = (0x6F0CD6A5 ^ n) - 1162773369;
        }
        if (mc == null || tdhr.mc.field_1705 == null) {
            return false;
        }
        class_337 class_3372 = tdhr.mc.field_1705.method_1740();
        Map<UUID, class_345> map = ((BossBarHudAccessor)class_3372).getBossBars();
        for (class_345 class_3452 : map.values()) {
            String string = tdhr.zthth_2(class_3452.method_5414().getString(), Locale.ROOT);
            if (!string.contains("pvp") && !string.contains("\u043f\u0432\u043f")) continue;
            return true;
        }
        return false;
    }

    public static boolean dkhz(String string) {
        block8: {
            int n = 829183980;
            n = Integer.rotateLeft(n * 1911385475, 15) ^ 0x770BF2FD;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 26);
            int n2 = n ^ 0x9BFA0B00;
            if ((n2 ^ n) != -1678112000) {
                int cfr_ignored_0 = (0xAA965CEC ^ n) - -1005442903;
            }
            String string3 = tdhr.khyy().toLowerCase();
            try {
                String[] stringArray;
                if (string3.contains("win")) {
                    tdhr.tzw(tdhr.khad_2(), "explorer \"" + string + "\"");
                    return true;
                }
                if (string3.contains(tdhr.bst("嚠鮫椭", -391390810 - -1933972385, tdhr.dhlz_2(-2029573254) ^ 0xDCEA52FA, -1050925312 - 193189882))) {
                    Runtime.getRuntime().exec(new String[]{"open", string});
                    return true;
                }
                if (!string3.contains("lin")) break block8;
                String[] stringArray2 = new String[1694800985 - 1694800978];
                stringArray2[0] = "thunar";
                stringArray2[1] = "dolphin";
                stringArray2[2] = "nautilus";
                stringArray2[3] = "nemo";
                stringArray2[4] = "pcmanfm";
                stringArray2[5] = "caja";
                stringArray2[Integer.reverse((int)-227397269) ^ 0xD68C4E49] = "konqueror";
                for (String string4 : stringArray = stringArray2) {
                    try {
                        Process process = tdhr.dwt_3().exec(new String[]{string4, string});
                        if (!tdhr.dhsth_2(process)) continue;
                        return true;
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        return false;
    }

    public static String khyy() {
        int n = 253323462;
        int n2 = (n = Integer.rotateLeft(n * 158879269, 14) ^ 0x68E127DC) ^ 0xCF0A1E58;
        if ((n2 ^ n) != -821420456) {
            int cfr_ignored_0 = (0xC013769E ^ n) - -92008760;
        }
        if (tdhr.akf(System.getProperty(tdhr.shby("寙雕聆갗죜ᶣ刹꛷桻㳒", tdhr.dhs_6(2056103038) ^ 0xFFA50E6F, Integer.reverse(-1489645787) ^ 0x46E23F50, 0x2D61DB10 ^ 0x5E657971))).contains("android") || tdhr.twt("java.vm".concat(".vendor")).toLowerCase().contains("android")) {
            return "Android";
        }
        String string = tdhr.dhash_2("os.name").toLowerCase();
        if (string.contains("win")) {
            return "Windows";
        }
        if (string.contains(tdhr.bst("㞑⌜", Integer.reverse(928423770) ^ 0x703D4D53, tdhr.lm(-1081564197) ^ 0xA9EBCB39, -815680004 - 1549603739))) {
            return tdhr.bst("䴩ꐂ熄뻮흶", tdhr.jak_2(0xDD109B9C ^ 0x58E22C38, 10), Integer.rotateLeft(0x148FE701 ^ 0x2CC39C8F, 23), 0xC5C80E54 ^ 0xB6CCAC35);
        }
        if (string.contains(tdhr.bst("䂀ḁ", Integer.reverse(977778020) ^ 0x596B0DAF, tdhr.dhsh_9(0x647F23FB ^ 0xB04DE174, 20), tdhr.tmsh(-15613055) ^ 0xF2C72A9E))) {
            return "Linux";
        }
        if (string.contains("nix") || string.contains("nux") || string.contains(tdhr.shth_3("➈\ude1d", Integer.rotateLeft(0xA7D76EC ^ 0x280A2A71, 20), 1656425769 + -1604866959, tdhr.zmsh(-983609389) ^ 0xB8F658C2))) {
            return "Linux/Unix";
        }
        return "Unknown";
    }

    private static String bst(String string, int n, int n2, int n3) {
        try {
            int n4 = 2012271550;
            n4 = Integer.rotateLeft(n4 * 2113155435, 25) ^ 0x1561EF39;
            n4 = Integer.rotateRight(n2 ^ n4, 5);
            int n5 = n4 ^ 0x4C5D1D42;
            if ((n5 ^ n4) != 1281170754) {
                int cfr_ignored_0 = (0x3BADCEFC ^ n4) - -1552136560;
            }
            if ((0x29A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0xF99566BB) + n2 ^ i * -522564329) ^ zdd_4) + jba_2);
        }
        return new String(cArray);
    }

    private static class_310 tdkh_2() {
        block0: {
            int n = bkk.dghk_2(-214172661);
            int n2 = n ^ 0xA9E50A4B;
            if ((n2 ^ n) == -1444607413) break block0;
            bkk.sqw(1524561472, n);
            int cfr_ignored_0 = (int)(0xC4E98FF97F4A7C15L ^ (long)n ^ 0xE2823227030C2402L);
        }
        return class_310.method_1551();
    }

    private static String zthth_2(String string, Locale locale) {
        block0: {
            int n = bkk.dghk_2(-2080686096);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            Locale locale2 = locale;
            n = (locale2 != null ? System.identityHashCode(locale2) : 0) ^ n;
            int n2 = n ^ 0xB4DD7588;
            if ((n2 ^ n) == -1260554872) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x37264A78 ^ n, 9) + -1308580925) * 925256313;
        }
        return string.toLowerCase(locale);
    }

    private static Runtime khad_2() {
        block0: {
            int n = bkk.dghk_2(-1487257618);
            int n2 = n ^ 0xE329904A;
            if ((n2 ^ n) == -483815350) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x4473AFA4 ^ n, 11) - 1314907159;
        }
        return Runtime.getRuntime();
    }

    private static Process tzw(Runtime runtime, String string) {
        block0: {
            int n = bkk.dghk_2(1382020689);
            Runtime runtime2 = runtime;
            n = (runtime2 != null ? System.identityHashCode(runtime2) : 0) ^ n;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 6);
            int n2 = n ^ 0xB56E7F22;
            if ((n2 ^ n) == -1251049694) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xE7318973 ^ n, 15) + 56443944) * -416183949;
        }
        return runtime.exec(string);
    }

    private static int dhlz_2(int n) {
        block0: {
            int n2 = -1384120678;
            int n3 = (n2 = Integer.rotateLeft(n2 * -975670489, 19) ^ 0x1B21D4ED) ^ 0xE23DD2F3;
            if ((n3 ^ n2) == -499264781) break block0;
            int cfr_ignored_0 = (0x4F422C69 ^ n2) - -1348872955;
        }
        return Integer.reverse(n);
    }

    private static String ztsh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1270358152;
            n4 = Integer.rotateLeft(n4 * -1339206359, 27) ^ 0x74818559;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 24)) ^ 0xAD8497E4;
            if ((n5 ^ n4) == -1383819292) break block0;
            int cfr_ignored_0 = (0xE63CB76C ^ n4) + -373250746;
        }
        return tdhr.bst(string, n, n2, n3);
    }

    private static String aty_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1442906859;
            n4 = Integer.rotateLeft(n4 * -741926649, 7) ^ 0x11C74F01;
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 10)) ^ 0xB29098C9;
            if ((n5 ^ n4) == -1299146551) break block0;
            int cfr_ignored_0 = (0x1B6E65DC ^ n4) - 404653187;
        }
        return tdhr.bst(string, n, n2, n3);
    }

    private static String shhz(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 662889764;
            n4 = Integer.rotateLeft(n4 * -2072446103, 28) ^ 0x2108DB38;
            n4 = Integer.rotateLeft(n ^ n4, 23);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 25)) ^ 0x5AE6162F;
            if ((n5 ^ n4) == 1525028399) break block0;
            int cfr_ignored_0 = (0x7D64F30B ^ n4) - -984547117;
        }
        return tdhr.bst(string, n, n2, n3);
    }

    private static Runtime dwt_3() {
        block0: {
            int n = bkk.dghk_2(493124184);
            int n2 = n ^ 0x4357EB75;
            if ((n2 ^ n) == 1129835381) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x5E33912D ^ n, 14) - 1822176174;
            int cfr_ignored_1 = (int)(0x9C813F1027D4EB4FL ^ (long)n ^ 0x8350831A2DB894D3L);
        }
        return Runtime.getRuntime();
    }

    private static boolean dhsth_2(Process process) {
        block0: {
            int n = bkk.dghk_2(-1333686330);
            Process process2 = process;
            n = Integer.rotateRight((process2 != null ? System.identityHashCode(process2) : 0) ^ n, 16);
            int n2 = n ^ 0xD9915AB3;
            if ((n2 ^ n) == -644785485) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x6910D575 ^ n, 16) - -1117292442) * 1762710901;
            int cfr_ignored_1 = (int)(0xABA27B4827D4EB4FL ^ (long)n ^ 0xBE0831A2DB8FA95L);
        }
        return process.isAlive();
    }

    private static int dhs_6(int n) {
        block0: {
            int n2 = 1725252430;
            n2 = Integer.rotateLeft(n2 * -50317779, 24) ^ 0xEBD8A76;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 21)) ^ 0x312A6ACE;
            if ((n3 ^ n2) == 824863438) break block0;
            int cfr_ignored_0 = (0x57FF2980 ^ n2) + 438510495;
        }
        return Integer.reverse(n);
    }

    private static String shby(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 652260974;
            n4 = Integer.rotateLeft(n4 * 253938213, 6) ^ 0xFE8C64D2;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n3 ^ n4) ^ 0xA75B3E12;
            if ((n5 ^ n4) == -1487192558) break block0;
            int cfr_ignored_0 = (0x81BB887C ^ n4) + 1856613863;
        }
        return tdhr.bst(string, n, n2, n3);
    }

    private static String akf(String string) {
        block0: {
            int n = 206365753;
            int n2 = (n = Integer.rotateLeft(n * -635351235, 21) ^ 0x51456EE6) ^ 0x8191E6A1;
            if ((n2 ^ n) == -2121144671) break block0;
            int cfr_ignored_0 = (0x8DDD0298 ^ n) + -2043771596;
        }
        return string.toLowerCase();
    }

    private static String rda(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bkk.dghk_2(1615267918);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x99B7C1D4;
            if ((n5 ^ n4) == -1716010540) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xF9F0C99A ^ n4, 18) + 1216743649) * -101660261;
        }
        return tdhr.bst(string, n, n2, n3);
    }

    private static String twt(String string) {
        block0: {
            int n = bkk.dghk_2(-275820010);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 4);
            int n2 = n ^ 0x95A45454;
            if ((n2 ^ n) == -1784392620) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x7A2B0642 ^ n, 18) + -812424903;
        }
        return System.getProperty(string);
    }

    private static String awr(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 435940469;
            n4 = Integer.rotateLeft(n4 * -920262963, 20) ^ 0xA6F1B82B;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 16)) ^ 0xDF91DD4D;
            if ((n5 ^ n4) == -544088755) break block0;
            int cfr_ignored_0 = (0xC66A3138 ^ n4) + -660755568;
        }
        return tdhr.bst(string, n, n2, n3);
    }

    private static String azdh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bkk.dghk_2(-1916545936);
            n4 = n ^ n4;
            int n5 = (n4 = n3 ^ n4) ^ 0x12367D;
            if ((n5 ^ n4) == 1193597) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x8DD1E20D ^ n4, 4) - 818413262;
            int cfr_ignored_1 = (int)(0x4F634C3027D4EB4FL ^ (long)n4 ^ 0x6510831A2DB93317L);
        }
        return tdhr.bst(string, n, n2, n3);
    }

    private static String thsz_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -650945546;
            n4 = Integer.rotateLeft(n4 * -1068388673, 7) ^ 0x7D707762;
            n4 = n ^ n4;
            int n5 = (n4 = n3 ^ n4) ^ 0xAB951F87;
            if ((n5 ^ n4) == -1416290425) break block0;
            int cfr_ignored_0 = (0x72A64471 ^ n4) + -800887873;
        }
        return tdhr.bst(string, n, n2, n3);
    }

    private static String dhash_2(String string) {
        block0: {
            int n = -498561049;
            int n2 = (n = Integer.rotateLeft(n * 1271864971, 14) ^ 0x4BD18791) ^ 0x138A7EE0;
            if ((n2 ^ n) == 327843552) break block0;
            int cfr_ignored_0 = (0xF1C2F107 ^ n) + -927396587;
        }
        return System.getProperty(string);
    }

    private static int lm(int n) {
        block0: {
            int n2 = bkk.dghk_2(-1294649754);
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 22)) ^ 0x746EF34;
            if ((n3 ^ n2) == 122089268) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xB593D952 ^ n2, 9) + 21295145) * -1248601773;
        }
        return Integer.reverse(n);
    }

    private static int jak_2(int n, int n2) {
        block0: {
            int n3 = bkk.dghk_2(138915817);
            int n4 = (n3 = n2 ^ n3) ^ 0x79CA42E5;
            if ((n4 ^ n3) == 2043298533) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x718DED0C ^ n3, 17) - -997370961;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int dhsh_9(int n, int n2) {
        block0: {
            int n3 = bkk.dghk_2(126112873);
            int n4 = (n3 = n2 ^ n3) ^ 0x311E96EB;
            if ((n4 ^ n3) == 824088299) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x369AC282 ^ n3, 9) + -1592054535;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int tmsh(int n) {
        block0: {
            int n2 = -1326724272;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1779667807, 3) ^ 0xB93A7D5D) ^ 0x36BD24EF;
            if ((n3 ^ n2) == 918365423) break block0;
            int cfr_ignored_0 = (0x8656EFBF ^ n2) + 1798763437;
        }
        return Integer.reverse(n);
    }

    private static String shbsh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 527742867;
            n4 = Integer.rotateLeft(n4 * 55605633, 25) ^ 0xECEE389F;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 11);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 24)) ^ 0x935D0F4F;
            if ((n5 ^ n4) == -1822617777) break block0;
            int cfr_ignored_0 = (0x8C29B8DC ^ n4) - -1322918533;
        }
        return tdhr.bst(string, n, n2, n3);
    }

    private static int zmsh(int n) {
        block0: {
            int n2 = 705575265;
            n2 = Integer.rotateLeft(n2 * 1972529803, 16) ^ 0x7BB4B20F;
            int n3 = (n2 = n ^ n2) ^ 0xD0BF5E7F;
            if ((n3 ^ n2) == -792764801) break block0;
            int cfr_ignored_0 = (0xFAB1671E ^ n2) - 247641815;
        }
        return Integer.reverse(n);
    }

    private static String shth_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -518023084;
            n4 = Integer.rotateLeft(n4 * 1178952475, 16) ^ 0x4E2A83D6;
            n4 = Integer.rotateLeft(n ^ n4, 11);
            int n5 = (n4 = n2 ^ n4) ^ 0x57D2F9D5;
            if ((n5 ^ n4) == 1473444309) break block0;
            int cfr_ignored_0 = (0xB6CD6181 ^ n4) + 204902208;
        }
        return tdhr.bst(string, n, n2, n3);
    }

    private static String[] rthf(String string) {
        block0: {
            int n = -199538295;
            n = Integer.rotateLeft(n * -2121318995, 4) ^ 0x92BD2936;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 2);
            int n2 = n ^ 0xF92E6A23;
            if ((n2 ^ n) == -114398685) break block0;
            int cfr_ignored_0 = (0xD3523AA ^ n) - 1099782248;
        }
        return string.split("\u0003\u001f", -1);
    }

    private static CallSite twn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 66943503;
            n3 = Integer.rotateLeft(n3 * -1891800411, 28) ^ 0x31CD06A5;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 7);
            String string4 = string2;
            n3 = Integer.rotateLeft((string4 != null ? System.identityHashCode(string4) : 0) ^ n3, 27);
            int n4 = n3 ^ 0x95A39BFD;
            if ((n4 ^ n3) != -1784439811) {
                int cfr_ignored_0 = (0x965EE1F2 ^ n3) + -1784420593;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ stk ^ string.hashCode() ^ n2 + jzz_3 ^ i * -1615254271 ^ stk, 22) ^ jzz_3));
            }
            String[] stringArray = tdhr.rthf(new String(cArray));
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

    private static String[] awpim3fu6mjt(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite kd2y0sr9nyleca(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ vqzghghm28r6 ^ string.hashCode() ^ n2 + hjz9xzlcvzs7 + i * 782561965) + vqzghghm28r6) ^ hjz9xzlcvzs7));
            }
            String[] stringArray = tdhr.awpim3fu6mjt(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

