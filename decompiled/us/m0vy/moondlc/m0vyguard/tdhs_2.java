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
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import us.m0vy.moondlc.m0vyguard.bzy_2;
import us.m0vy.moondlc.m0vyguard.taf;
import us.m0vy.moondlc.m0vyguard.dw_2;
import us.m0vy.moondlc.m0vyguard.wh;
import us.m0vy.moondlc.m0vyguard.yf;

public class tdhs_2 {
    private static final Pattern shzh_2;
    private final String hfj;
    private final String shmgh;
    private final String rss_3;
    private final long ys_2;
    private final List jhl_2;
    private final boolean raz_4;
    private static final int hls_2 = 2143956818;
    private static final int thdhq = 1187715933;
    private static final int jlr = 1649521946;
    private static final int dkb = 517618145;
    private static final int wibmyii9604yn = -2120585062;
    private static final int zc5pr0ceiugqt = 1312047794;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int hninn25t313dd;

    public tdhs_2(String string, String string2, String string3, long l, List list, boolean bl) {
        this.hfj = string;
        this.shmgh = string2;
        this.rss_3 = string3;
        this.ys_2 = l;
        this.jhl_2 = list != null ? list : Collections.emptyList();
        this.raz_4 = bl;
    }

    public String dhzy() {
        block0: {
            int n = 1812606770;
            n = Integer.rotateLeft(n * -1882087323, 6) ^ 0xDF8EE6F;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xADE39C14;
            if ((n2 ^ n) == -1377592300) break block0;
            int cfr_ignored_0 = (0xC1E9B326 ^ n) + -150499836;
        }
        return this.hfj;
    }

    public String dkh_6() {
        block0: {
            int n = -790275463;
            n = Integer.rotateLeft(n * 1412506449, 5) ^ 0x47F0D1E9;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 24);
            int n2 = n ^ 0x383E428;
            if ((n2 ^ n) == 58975272) break block0;
            int cfr_ignored_0 = (0xD366BE51 ^ n) + -512067008;
        }
        return this.shmgh;
    }

    public String tzh_5() {
        block0: {
            int n = 1192734284;
            n = Integer.rotateLeft(n * -1409086633, 15) ^ 0x856DBC17;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x15842037;
            if ((n2 ^ n) == 360980535) break block0;
            int cfr_ignored_0 = (0x52938E7B ^ n) - 31913425;
        }
        return this.rss_3;
    }

    public long ly() {
        block0: {
            int n = -1584494685;
            int n2 = (n = Integer.rotateLeft(n * -732350363, 25) ^ 0x7D00C6F1) ^ 0xC4CE18F5;
            if ((n2 ^ n) == -993126155) break block0;
            int cfr_ignored_0 = (0x65409F56 ^ n) + 339434464;
        }
        return this.ys_2;
    }

    public List shs_2() {
        block0: {
            int n = 643309479;
            int n2 = (n = Integer.rotateLeft(n * -908392853, 23) ^ 0x4FCD8CFC) ^ 0xCBBA7DF;
            if ((n2 ^ n) == 213624799) break block0;
            int cfr_ignored_0 = (0x2AE3B878 ^ n) - -1454947846;
        }
        return this.jhl_2;
    }

    public boolean dthl() {
        int n = 128483431;
        int n2 = (n = Integer.rotateLeft(n * 1183822141, 10) ^ 0x945E41D5) ^ 0x9D09006B;
        if ((n2 ^ n) != -1660354453) {
            int cfr_ignored_0 = (0x9AA1800C ^ n) - -334251581;
        }
        return this.raz_4 && !this.jhl_2.isEmpty();
    }

    public bzy_2 hdht(long l) {
        int n = 414052329;
        n = Integer.rotateLeft(n * 710743631, 5) ^ 0xDCFA0647;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x721DCC8;
        if ((n2 ^ n) != 119659720) {
            int cfr_ignored_0 = (0x1F8C3321 ^ n) - -355873005;
        }
        if (this.jhl_2.isEmpty()) {
            return null;
        }
        if (l < ((bzy_2)this.jhl_2.get(0)).dyt_2()) {
            return (bzy_2)this.jhl_2.get(0);
        }
        for (int i = 0; i < this.jhl_2.size(); ++i) {
            bzy_2 bzy2 = (bzy_2)this.jhl_2.get(i);
            if (l >= bzy2.dyt_2() && l <= tdhs_2.shshk(bzy2)) {
                return bzy2;
            }
            if (l >= tdhs_2.skhd(bzy2)) continue;
            if (i > 0) {
                bzy_2 bzy3 = (bzy_2)this.jhl_2.get(i - 1);
                if (l - tdhs_2.tghk_2(bzy3) < bzy2.dyt_2() - l) {
                    return bzy3;
                }
                return bzy2;
            }
            return bzy2;
        }
        return (bzy_2)this.jhl_2.get(this.jhl_2.size() - 1);
    }

    public int rdk_2(long l) {
        int n = wh.dkhr(-1708053579);
        int n2 = n ^ 0x65223E3D;
        if ((n2 ^ n) != 1696742973) {
            int cfr_ignored_0 = Integer.rotateLeft(0xFF131588 ^ n, 18) + -408077645;
        }
        if (this.jhl_2.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < this.jhl_2.size(); ++i) {
            bzy_2 bzy2 = (bzy_2)this.jhl_2.get(i);
            if (l >= bzy2.dyt_2() && l <= tdhs_2.khdh_4(bzy2)) {
                return i;
            }
            if (l >= tdhs_2.dhhkh(bzy2)) continue;
            return i > 0 ? i - 1 : 0;
        }
        return this.jhl_2.size() - 1;
    }

    public static tdhs_2 zdz(String string, String string2, String string3, long l, String string4) {
        try {
            int n = -1793129421;
            n = Integer.rotateLeft(n * 871466763, 22) ^ 0x7E81249D;
            String string5 = string;
            n = Integer.rotateRight((string5 != null ? System.identityHashCode(string5) : 0) ^ n, 12);
            String string6 = string3;
            n = Integer.rotateLeft((string6 != null ? System.identityHashCode(string6) : 0) ^ n, 5);
            int n2 = n ^ 0xD6BEC194;
            if ((n2 ^ n) != -692141676) {
                int cfr_ignored_0 = (0x43A1C5A7 ^ n) - -914383419;
            }
            if ((0x348 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (string4 == null || string4.trim().isEmpty()) {
            return tdhs_2.tghy_2(string, string2, string3, l);
        }
        ArrayList<dw_2> arrayList = new ArrayList<dw_2>();
        String[] stringArray = string4.split("\\r?\\n");
        for (String string7 : stringArray) {
            String string8;
            String string9 = string7.trim();
            if (string9.isEmpty()) continue;
            Matcher matcher = shzh_2.matcher(string9);
            ArrayList<Long> arrayList2 = new ArrayList<Long>();
            int n = 0;
            while (matcher.find()) {
                long l2 = Long.parseLong(matcher.group(1));
                double d = Double.parseDouble(matcher.group(2));
                long l3 = (long)((double)(l2 * (0x4F768A41E57424D5L ^ 0x4F768A41E574CEB5L)) + d * Double.longBitsToDouble(0x1AA07240E3B460A4L ^ 0x5A2F3240E3B460A4L));
                arrayList2.add(tdhs_2.zsdh(l3));
                n = matcher.end();
            }
            if (arrayList2.isEmpty() || (string8 = tdhs_2.rbl(string9, n).trim()).isEmpty()) continue;
            for (Long l4 : arrayList2) {
                arrayList.add(new dw_2(l4, string8));
            }
        }
        if (arrayList.isEmpty()) {
            return tdhs_2.rjh(string, string2, string3, l);
        }
        arrayList.sort(tdhs_2::rqn);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList.size(); ++i) {
            dw_2 dw2 = (dw_2)arrayList.get(i);
            long l5 = dw2.dhts_3;
            long l6 = i + 1 < arrayList.size() ? ((dw_2)arrayList.get((int)(i + 1))).dhts_3 : l5 + (0xF0B32EBE20FF9E41L ^ 0xF0B32EBE20FF8FD5L);
            long l7 = l6 - l5;
            long l8 = l7 > (0x686A3F7829E6F4L ^ 0x686A3F7829FDACL) ? l5 + Math.min(l7, Math.max(0x916B8A565CE95452L ^ 0x916B8A565CE95FEAL, (long)dw2.szt_2.length() * (0x8AFDDEC6CF5BBB55L ^ 0x8AFDDEC6CF5BBB3BL))) : Math.max(l5 + (0xDEDF3942AF6E3C3DL ^ 0xDEDF3942AF6E3F1DL), l6 - (0x58F8B50366DC2C7FL ^ 0x58F8B50366DC2C2FL));
            List list = tdhs_2.hshsh(dw2.szt_2, l5, l8);
            arrayList3.add(new bzy_2(l5, l8, dw2.szt_2, list));
        }
        return new tdhs_2(string, string2, string3, l, arrayList3, true);
    }

    private static List sww(String string, long l, long l2) {
        int n = -1859298589;
        n = Integer.rotateLeft(n * 811519915, 5) ^ 0x55928CCC;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = (n = (int)l ^ n) ^ 0xA3C2220B;
        if ((n2 ^ n) != -1547558389) {
            int cfr_ignored_0 = (0x32EF78E8 ^ n) - -2105968283;
        }
        ArrayList<taf> arrayList = new ArrayList<taf>();
        String[] stringArray = string.trim().split("\\s+");
        if (stringArray.length == 0 || stringArray[0].isEmpty()) {
            return arrayList;
        }
        int n3 = 0;
        int[] nArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; ++i) {
            int n4;
            nArray[i] = n4 = Math.max(1, stringArray[i].length());
            n3 += n4;
        }
        long l3 = Math.max(0x1228769D94BA70AFL ^ 0x1228769D94BA713FL, l2 - l);
        long l4 = l;
        for (int i = 0; i < stringArray.length; ++i) {
            long l5 = Math.round((double)nArray[i] / (double)n3 * (double)l3);
            l5 = Math.max(0x6F6FB98AC343333L ^ 0x6F6FB98AC34334BL, l5);
            long l6 = i == stringArray.length - 1 ? l2 : l4 + l5;
            arrayList.add(new taf(stringArray[i], l4, l6));
            l4 = l6;
        }
        return arrayList;
    }

    public static tdhs_2 tshn(String string, String string2, String string3, long l) {
        int n = 367942679;
        n = Integer.rotateLeft(n * 1916633693, 10) ^ 0xA9B8A6B9;
        String string4 = string;
        n = Integer.rotateLeft((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 2);
        String string5 = string2;
        n = Integer.rotateLeft((string5 != null ? System.identityHashCode(string5) : 0) ^ n, 15);
        int n2 = n ^ 0x500215B7;
        if ((n2 ^ n) != 1342313911) {
            int cfr_ignored_0 = (0x45EC49A0 ^ n) + 936570148;
        }
        if (!tdhs_2.khat_3()) {
            yf.athz_2();
            throw null;
        }
        Object object = string2 != null && !tdhs_2.shzs_2(string2) ? (string3 != null && !string3.isEmpty() ? string2 + " • " + string3 : string2) : tdhs_2.shhz_2("Music Pl", "aying");
        long l2 = l > 0L ? l : 0x38AE88D394A99128L ^ 0x38AE88D394AA38A8L;
        List list = tdhs_2.dhh_9((String)object, 0L, l2);
        List<bzy_2> list2 = List.of(new bzy_2(0L, l2, (String)object, list));
        return new tdhs_2(string, string2, string3, l, list2, false);
    }

    private static int rqn(dw_2 dw2, dw_2 dw3) {
        block0: {
            int n = wh.dkhr(289984100);
            dw_2 dw4 = dw2;
            n = Integer.rotateRight((dw4 != null ? System.identityHashCode(dw4) : 0) ^ n, 26);
            int n2 = n ^ 0xB513D6C5;
            if ((n2 ^ n) == -1256991035) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xA45B18A1 ^ n, 7) + -345662790;
            int cfr_ignored_1 = (int)(0x66E9B69C27D4EB4FL ^ (long)n ^ 0x9048831A2DB96002L);
        }
        return Long.compare(dw2.dhts_3, dw3.dhts_3);
    }

    private static String shqj(String string, int n, int n2, int n3) {
        int n4 = 1850120137;
        n4 = Integer.rotateLeft(n4 * 315192981, 5) ^ 0x60C5AE0B;
        n4 = n ^ n4;
        int n5 = (n4 = n3 ^ n4) ^ 0xDAD9BB22;
        if ((n5 ^ n4) != -623264990) {
            int cfr_ignored_0 = (0xB49F2CEB ^ n4) - -1771458947;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xFF437D8D) + i ^ hls_2, 18) ^ n2 + thdhq));
        }
        return new String(cArray);
    }

    private static long shshk(bzy_2 bzy2) {
        block0: {
            int n = 205093175;
            n = Integer.rotateLeft(n * -1117571005, 21) ^ 0x31870B18;
            bzy_2 bzy3 = bzy2;
            n = (bzy3 != null ? System.identityHashCode(bzy3) : 0) ^ n;
            int n2 = n ^ 0x51B1FC5B;
            if ((n2 ^ n) == 1370618971) break block0;
            int cfr_ignored_0 = (0x5D88856C ^ n) - 893103542;
        }
        return bzy2.hzf_2();
    }

    private static long skhd(bzy_2 bzy2) {
        block0: {
            int n = wh.dkhr(957898228);
            int n2 = n ^ 0x9713BABC;
            if ((n2 ^ n) == -1760314692) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xAE0BE748 ^ n, 8) + 399417587;
        }
        return bzy2.dyt_2();
    }

    private static long tghk_2(bzy_2 bzy2) {
        block0: {
            int n = -694907572;
            int n2 = (n = Integer.rotateLeft(n * -678122501, 24) ^ 0xE45A12C6) ^ 0x53F55C5D;
            if ((n2 ^ n) == 1408588893) break block0;
            int cfr_ignored_0 = (0x8561D111 ^ n) - -918942282;
        }
        return bzy2.hzf_2();
    }

    private static long khdh_4(bzy_2 bzy2) {
        block0: {
            int n = -1198147687;
            n = Integer.rotateLeft(n * -1562896485, 25) ^ 0xA1DC42C;
            bzy_2 bzy3 = bzy2;
            n = Integer.rotateRight((bzy3 != null ? System.identityHashCode(bzy3) : 0) ^ n, 15);
            int n2 = n ^ 0xDB04059D;
            if ((n2 ^ n) == -620493411) break block0;
            int cfr_ignored_0 = (0x6391B204 ^ n) - 1518162342;
        }
        return bzy2.hzf_2();
    }

    private static long dhhkh(bzy_2 bzy2) {
        block0: {
            int n = 238665315;
            int n2 = (n = Integer.rotateLeft(n * 2061217715, 16) ^ 0xDB545A55) ^ 0xA6FFB862;
            if ((n2 ^ n) == -1493190558) break block0;
            int cfr_ignored_0 = (0xA8C60601 ^ n) - -1170622107;
        }
        return bzy2.dyt_2();
    }

    private static tdhs_2 tghy_2(String string, String string2, String string3, long l) {
        block0: {
            int n = -15711771;
            n = Integer.rotateLeft(n * 2137075533, 10) ^ 0x7AAF1F4E;
            String string4 = string;
            n = Integer.rotateLeft((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 28);
            String string5 = string2;
            n = Integer.rotateRight((string5 != null ? System.identityHashCode(string5) : 0) ^ n, 27);
            int n2 = n ^ 0x1E3E1CB7;
            if ((n2 ^ n) == 507387063) break block0;
            int cfr_ignored_0 = (0xE12E5D52 ^ n) + 633065441;
        }
        return tdhs_2.tshn(string, string2, string3, l);
    }

    private static Long zsdh(long l) {
        block0: {
            int n = 298073108;
            n = Integer.rotateLeft(n * -457417693, 8) ^ 0x1049BAE8;
            int n2 = (n = (int)l ^ n) ^ 0x2F64639A;
            if ((n2 ^ n) == 795108250) break block0;
            int cfr_ignored_0 = (0x3EA05F8E ^ n) - 536509370;
        }
        return l;
    }

    private static String rbl(String string, int n) {
        block0: {
            int n2 = -1541564368;
            n2 = Integer.rotateLeft(n2 * -692544953, 11) ^ 0x90255FEA;
            String string2 = string;
            n2 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n2;
            int n3 = n2 ^ 0x529C8D0A;
            if ((n3 ^ n2) == 1385991434) break block0;
            int cfr_ignored_0 = (0xF681153A ^ n2) + -2124821931;
        }
        return string.substring(n);
    }

    private static tdhs_2 rjh(String string, String string2, String string3, long l) {
        block0: {
            int n = wh.dkhr(952085125);
            int n2 = n ^ 0x1929B4A3;
            if ((n2 ^ n) == 422163619) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x21961E26 ^ n, 7) - 361448917;
        }
        return tdhs_2.tshn(string, string2, string3, l);
    }

    private static List hshsh(String string, long l, long l2) {
        block0: {
            int n = wh.dkhr(699017346);
            n = Integer.rotateRight((int)l ^ n, 7);
            int n2 = (n = Integer.rotateLeft((int)l2 ^ n, 21)) ^ 0x3B88B25;
            if ((n2 ^ n) == 62425893) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x2A12A3A7 ^ n, 8) - 480211060;
        }
        return tdhs_2.sww(string, l, l2);
    }

    private static boolean khat_3() {
        block0: {
            int n = -1306996954;
            int n2 = (n = Integer.rotateLeft(n * -2142478659, 23) ^ 0xEFA910C0) ^ 0x560FB57C;
            if ((n2 ^ n) == 1443870076) break block0;
            int cfr_ignored_0 = (0xE4177A5A ^ n) - -843636018;
        }
        return yf.khdha_2();
    }

    private static boolean shzs_2(String string) {
        block0: {
            int n = 643470673;
            int n2 = (n = Integer.rotateLeft(n * -857137079, 18) ^ 0xB023EB05) ^ 0xE716EF7A;
            if ((n2 ^ n) == -417927302) break block0;
            int cfr_ignored_0 = (0xC14C7A2B ^ n) - -1414718441;
        }
        return string.isEmpty();
    }

    private static String sdt_6(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1141775271;
            n4 = Integer.rotateLeft(n4 * -1494597301, 20) ^ 0x36F617A5;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 25);
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 27)) ^ 0x62A00D26;
            if ((n5 ^ n4) == 1654656294) break block0;
            int cfr_ignored_0 = (0xD951E97F ^ n4) + 456251164;
        }
        return tdhs_2.shqj(string, n, n2, n3);
    }

    private static String shhz_2(String string, String string2) {
        block0: {
            int n = 1554745805;
            n = Integer.rotateLeft(n * -22760501, 18) ^ 0xD5D24D6B;
            String string3 = string2;
            n = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 24);
            int n2 = n ^ 0x19BD15A9;
            if ((n2 ^ n) == 431822249) break block0;
            int cfr_ignored_0 = (0x45169C64 ^ n) + -1312412575;
        }
        return string.concat(string2);
    }

    private static List dhh_9(String string, long l, long l2) {
        block0: {
            int n = wh.dkhr(-125762407);
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 22)) ^ 0x5C04750A;
            if ((n2 ^ n) == 1543795978) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xA4857193 ^ n, 7) + -259629048) * -1534758509;
        }
        return tdhs_2.sww(string, l, l2);
    }

    private static String[] tyr(String string) {
        block0: {
            int n = -728853359;
            n = Integer.rotateLeft(n * -215388273, 27) ^ 0x59D79BFB;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 10);
            int n2 = n ^ 0x8DA72C92;
            if ((n2 ^ n) == -1918423918) break block0;
            int cfr_ignored_0 = (0x5929B803 ^ n) + 141057398;
        }
        return string.split("\u0004\u001b", -1);
    }

    private static CallSite khrl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -69977897;
            n3 = Integer.rotateLeft(n3 * 1022731431, 28) ^ 0x49A10FF4;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 23);
            String string4 = string2;
            n3 = (string4 != null ? System.identityHashCode(string4) : 0) ^ n3;
            int n4 = n3 ^ 0xD868B047;
            if ((n4 ^ n3) != -664227769) {
                int cfr_ignored_0 = (0x23BC8890 ^ n3) + -1328337818;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ jlr ^ string.hashCode()) + (n2 + dkb) + i ^ jlr, 19) + dkb);
            }
            String[] stringArray = tdhs_2.tyr(new String(cArray));
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

    private static String[] qk696j8nq8x(String string) {
        return string.split("\u0004\u001c", -1);
    }

    private static CallSite v6vdi9m9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ wibmyii9604yn ^ string.hashCode()) + (n2 + zc5pr0ceiugqt) + i ^ wibmyii9604yn, 14) + zc5pr0ceiugqt);
            }
            String[] stringArray = tdhs_2.qk696j8nq8x(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

