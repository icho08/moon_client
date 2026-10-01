/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  lombok.Generated
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_5321
 *  net.minecraft.class_6880
 *  net.minecraft.class_9304
 *  net.minecraft.class_9334
 */
package us.m0vy.moondlc.m0vyguard;

import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import lombok.Generated;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import us.m0vy.moondlc.m0vyguard.btr;
import us.m0vy.moondlc.m0vyguard.yf;

public final class bkh_2 {
    private static final int skl = 1506667234;
    private static final int zaz_2 = -1988124468;
    private static final int tdz_3 = -349953960;
    private static final int byt = -1931133990;
    private static final int pfp06ihp = 1721737574;
    private static final int nlxleieowzz = 902454018;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int gl3lwdqid5eo;

    public static void hfh_2(class_1799 class_17992, Object2IntMap object2IntMap) {
        int n = 6427254;
        n = Integer.rotateLeft(n * -620011293, 9) ^ 0x98E558A1;
        Object2IntMap object2IntMap2 = object2IntMap;
        n = Integer.rotateRight((object2IntMap2 != null ? System.identityHashCode(object2IntMap2) : 0) ^ n, 27);
        int n2 = n ^ 0xF9BA024;
        if ((n2 ^ n) != 261857316) {
            int cfr_ignored_0 = (0xFF9B252 ^ n) - 1024218125;
        }
        if (!bkh_2.tzs()) {
            bkh_2.shkhdh();
            throw null;
        }
        object2IntMap.clear();
        if (!class_17992.method_7960()) {
            for (Object2IntMap.Entry entry : bkh_2.dhshth(class_17992) == class_1802.field_8598 ? ((class_9304)class_17992.method_57824(class_9334.field_49643)).method_57539() : bkh_2.zshl(class_17992).method_57539()) {
                object2IntMap.put((Object)((class_6880)entry.getKey()), entry.getIntValue());
            }
        }
    }

    @SafeVarargs
    public static boolean ttn_2(class_1799 class_17992, class_5321 ... class_5321Array) {
        int n = btr.bwth(-1376828948);
        n = (class_5321Array != null ? System.identityHashCode(class_5321Array) : 0) ^ n;
        int n2 = n ^ 0x2CF4848D;
        if ((n2 ^ n) != 754222221) {
            int cfr_ignored_0 = Integer.rotateLeft(0x811BC561 ^ n, 3) + -1497725446;
            int cfr_ignored_1 = (int)(0x43A96B5C27D4EB4FL ^ (long)n ^ 0x2BC8831A2DB92A83L);
        }
        if (bkh_2.shf(class_17992)) {
            return false;
        }
        Object2IntArrayMap object2IntArrayMap = new Object2IntArrayMap();
        bkh_2.hfh_2(class_17992, (Object2IntMap)object2IntArrayMap);
        for (class_5321 class_53212 : class_5321Array) {
            if (bkh_2.thft((Object2IntMap)object2IntArrayMap, class_53212)) continue;
            return false;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public static int htd_2(class_1799 var0, class_5321 var1_1) {
        var3_2 = 0;
        var6_3 = 0;
        var4_4 = -1868092543;
        var4_4 = Integer.rotateLeft(var4_4 * 1287317683, 18) ^ -1126267626;
        v0 = var0;
        var4_4 = Integer.rotateRight((v0 != null ? System.identityHashCode(v0) : 0) ^ var4_4, 9);
        var5_5 = (int)((long)(var4_4 - 1956971252) ^ -9007557848784498302L ^ -9007557848784498302L);
        block27: while (true) {
            if ((var6_3 = var4_4 - var5_5) == -1134037388) ** GOTO lbl-1000
            if (var6_3 != 1271649530) {
                Integer.rotateLeft(711129641 ^ var4_4, 8) + 643426866;
                (int)(-1670743016210109617L ^ (long)var4_4 ^ 6149809439633865841L);
                switch (var6_3) {
                    case 1956971252: {
                        Integer.rotateLeft(-1873112699 ^ var4_4, 5) - 2136292950;
                        (int)(5974094965881760591L ^ (long)var4_4 ^ -9079112700319430655L);
                        if (bkh_2.dfq_2(var0)) {
                            var5_5 = Integer.reverse(Integer.reverse(var4_4 - -1200250394));
                            Integer.rotateLeft(1883109344 ^ var4_4, 17) + -1679908005;
                            var5_5 = var4_4 - -1051287650 + -2103888791 - -2103888791;
                            continue block27;
                        }
                        try {
                            ++var6_3;
                            if ((-9200876893009088681L ^ (long)var4_4 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            var5_5 = (int)((long)(var4_4 - 1670766252) ^ 995180765716677184L ^ 995180765716677184L);
                        }
                        catch (UnsupportedOperationException v1) {
                            var5_5 = Integer.reverse(Integer.reverse(var4_4 - 1670766252));
                        }
                        var6_3 += 5;
                        continue block27;
                    }
                    case 1670766252: {
                        (Integer.rotateRight(-1459284206 ^ var4_4, 8) + 2080074345) * -1459284205;
                        var2_6 = new Object2IntArrayMap();
                        bkh_2.hfh_2(var0, (Object2IntMap)var2_6);
                        var3_2 = bkh_2.rnj((Object2IntMap)var2_6, var1_1);
                        var5_5 = var4_4 - -1330190096;
                        var6_3 += 5;
                        continue block27;
                    }
                    case -1051287650: {
                        Integer.rotateRight(-173785049 ^ var4_4, 17) - -1019124748;
                        var3_2 = 0;
                        var5_5 = var4_4 - 1237873525;
                        Integer.rotateRight(947209419 ^ var4_4, 10) + -628034608;
                        var5_5 = var4_4 - -1330190096 + -1583586973 - -1583586973;
                        var6_3 += 3;
                        continue block27;
                    }
                    case 2105882272: {
                        (Integer.rotateRight(2064689778 ^ var4_4, 18) + -345881847) * 2064689779;
                        try {
                            --var6_3;
                            if ((-6960539462013737955L ^ (long)var4_4 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var5_5 = var4_4 - 1956971252 ^ 258718426 ^ 258718426;
                        }
                        catch (IllegalStateException v2) {
                            var5_5 = (int)((long)(var4_4 - 1956971252) ^ -489707131451385998L ^ -489707131451385998L);
                        }
                        var6_3 -= 5;
                        continue block27;
                    }
                    case -1533425818: {
                        (Integer.rotateLeft(2007223260 ^ var4_4, 17) - -2127343905) * 2007223261;
                        var5_5 = (int)((long)(var4_4 - 981415249) ^ 2408284948668511710L ^ 2408284948668511710L);
                        Integer.rotateRight(1501174894 ^ var4_4, 14) - -634974067;
                        var5_5 = var4_4 - 1956971252;
                        ++var6_3;
                        continue block27;
                    }
                    case 1744688027: {
                        Integer.rotateRight(-1896743742 ^ var4_4, 4) + 1403730617;
                        var5_5 = var4_4 - -1286650624 + 509915839 - 509915839;
                        (Integer.rotateLeft(-289589419 ^ var4_4, 16) - -314092922) * -289589419;
                        (int)(3174924934943402831L ^ (long)var4_4 ^ -3485641963125213746L);
                        try {
                            var5_5 = (int)((long)(var4_4 - 1956971252) ^ 5358665522412246132L ^ 5358665522412246132L);
                        }
                        catch (NoSuchElementException v3) {
                            var5_5 = var4_4 - 1956971252 ^ 1025352513 ^ 1025352513;
                        }
                        var6_3 += 2;
                        continue block27;
                    }
                    case -367027364: {
                        (Integer.rotateLeft(-534945316 ^ var4_4, 15) - 669808863) * -534945315;
                        var5_5 = var4_4 - -660706353 + 1210980257 - 1210980257;
                        Integer.rotateRight(1525814567 ^ var4_4, 14) - 128855796;
                        var5_5 = Integer.reverse(Integer.reverse(var4_4 - 1956971252));
                        continue block27;
                    }
                    case 713946215: {
                        (Integer.rotateLeft(-1282849512 ^ var4_4, 9) + -1040384733) * -1282849511;
                        var5_5 = var4_4 - 1956971252 + -1554874768 - -1554874768;
                        Integer.rotateRight(-264356882 ^ var4_4, 17) - 468115725;
                        var6_3 -= 3;
                        continue block27;
                    }
                }
            }
            ** GOTO lbl148
lbl-1000:
            // 1 sources

            {
                (Integer.rotateRight(469658259 ^ var4_4, 6) + 1747748616) * 469658259;
                (int)(-903681172667271217L ^ (long)var4_4 ^ 645454390034451259L);
                var5_5 = var4_4 - -490526800;
                (int)(-1432311980837200743L ^ (long)var4_4 ^ 3665896977147917807L);
                var5_5 = Integer.reverse(Integer.reverse(var4_4 - 1956971252));
                var6_3 -= 5;
                continue block27;
                case 1973532528: {
                    (Integer.rotateLeft(176104944 ^ var4_4, 4) + 1237530443) * 176104945;
                    var5_5 = var4_4 - -1016568757;
                    Integer.rotateRight(-770149914 ^ var4_4, 13) - 1968400917;
                    try {
                        if ((-7793007262652363277L ^ (long)var4_4 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var5_5 = var4_4 - 1956971252 ^ 1477033548 ^ 1477033548;
                    }
                    catch (UnsupportedOperationException v4) {
                        var5_5 = var4_4 - 1956971252 ^ -1047428692 ^ -1047428692;
                    }
                    continue block27;
                }
                case 1956505794: {
                    Integer.rotateRight(-670015157 ^ var4_4, 14) + 777611088;
                    var5_5 = Integer.reverse(Integer.reverse(var4_4 - 1805990248));
                    Integer.rotateLeft(-41002587 ^ var4_4, 18) - -1197835722;
                    (int)(4556789155867454287L ^ (long)var4_4 ^ 1315195239651726248L);
                    var5_5 = var4_4 - 1956971252;
                    (Integer.rotateLeft(81456017 ^ var4_4, 3) + -1696586294) * 81456017;
                    (int)(-4149990450916955313L ^ (long)var4_4 ^ 8514199244003352833L);
                    continue block27;
                }
lbl148:
                // 1 sources

                Integer.rotateRight(-349939577 ^ var4_4, 16) - 2110019476;
                var5_5 = var4_4 - 471291487 + 832853560 - 832853560;
                Integer.rotateRight(474003467 ^ var4_4, 6) + 1882450064;
                var5_5 = var4_4 - 1956971252 ^ 367909426 ^ 367909426;
                var6_3 += 4;
                continue block27;
                case 1057191259: {
                    (Integer.rotateLeft(504558096 ^ var4_4, 6) + -1465323733) * 504558097;
                    var5_5 = var4_4 - -1233260313;
                    Integer.rotateLeft(966575936 ^ var4_4, 10) + -27672581;
                    try {
                        var6_3 += 3;
                        var5_5 = var4_4 - 1956971252;
                    }
                    catch (IllegalStateException v5) {
                        var5_5 = var4_4 - 1956971252;
                    }
                    ++var6_3;
                    continue block27;
                }
                case 24901683: {
                    Integer.rotateLeft(717238913 ^ var4_4, 8) + 832814298;
                    (int)(-1697121777629205681L ^ (long)var4_4 ^ -4321059694002537164L);
                    try {
                        var6_3 -= 5;
                        var5_5 = (int)((long)(var4_4 - 1956971252) ^ -6236837701282558641L ^ -6236837701282558641L);
                    }
                    catch (IllegalArgumentException v6) {
                        var5_5 = (int)((long)(var4_4 - 1956971252) ^ 2753830097241908169L ^ 2753830097241908169L);
                    }
                    --var6_3;
                    continue block27;
                }
                case -1330190096: {
                    return var3_2;
                }
            }
            Integer.rotateRight(-1050762941 ^ var4_4, 11) + 1859331672;
            var5_5 = var4_4 - 1956971252;
        }
    }

    public static int rzd_2(Object2IntMap object2IntMap, class_5321 class_53212) {
        int n = 44742786;
        n = Integer.rotateLeft(n * -9102353, 10) ^ 0xB40486B7;
        class_5321 class_53213 = class_53212;
        n = (class_53213 != null ? System.identityHashCode(class_53213) : 0) ^ n;
        int n2 = n ^ 0xFD1FC1B8;
        if ((n2 ^ n) != -48250440) {
            int cfr_ignored_0 = (0xFFB5793A ^ n) - 410727822;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        for (Object2IntMap.Entry entry : Object2IntMaps.fastIterable((Object2IntMap)object2IntMap)) {
            if (!((class_6880)entry.getKey()).method_40225(class_53212)) continue;
            return entry.getIntValue();
        }
        return 0;
    }

    private static boolean dqs_4(Object2IntMap object2IntMap, class_5321 class_53212) {
        int n = btr.bwth(247721501);
        Object2IntMap object2IntMap2 = object2IntMap;
        n = Integer.rotateLeft((object2IntMap2 != null ? System.identityHashCode(object2IntMap2) : 0) ^ n, 18);
        class_5321 class_53213 = class_53212;
        n = Integer.rotateRight((class_53213 != null ? System.identityHashCode(class_53213) : 0) ^ n, 17);
        int n2 = n ^ 0xC5C0E287;
        if ((n2 ^ n) != -977214841) {
            int cfr_ignored_0 = (Integer.rotateRight(0xCB030C9A ^ n, 12) + -1715722783) * -888992613;
        }
        if (bkh_2.sbq_2()) {
            throw null;
        }
        for (class_6880 class_68802 : object2IntMap.keySet()) {
            if (!class_68802.method_40225(class_53212)) continue;
            return true;
        }
        return false;
    }

    @Generated
    private bkh_2() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String zrj(String string, int n, int n2, int n3) {
        int n4 = 770791166;
        n4 = Integer.rotateLeft(n4 * -1400568627, 15) ^ 0xC8300874;
        int n5 = (n4 = n3 ^ n4) ^ 0x3DD1AE2E;
        if ((n5 ^ n4) != 1037151790) {
            int cfr_ignored_0 = (0x1020F8D0 ^ n4) - -1627361015;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xB3712EB6 ^ n2 ^ i * 26670689 ^ skl, 17) ^ zaz_2));
        }
        return new String(cArray);
    }

    private static boolean tzs() {
        block0: {
            int n = -1431764718;
            int n2 = (n = Integer.rotateLeft(n * 1634764207, 4) ^ 0x9468CEDE) ^ 0xCC1B8322;
            if ((n2 ^ n) == -870612190) break block0;
            int cfr_ignored_0 = (0x66B28230 ^ n) - -819766166;
        }
        return yf.khdha_2();
    }

    private static void shkhdh() {
        int n = btr.bwth(-126191090);
        int n2 = n ^ 0x196E993D;
        if ((n2 ^ n) != 426678589) {
            int cfr_ignored_0 = (Integer.rotateRight(0xE114E333 ^ n, 15) + 1172644456) * -518724813;
        }
        yf.athz_2();
    }

    private static class_1792 dhshth(class_1799 class_17992) {
        block0: {
            int n = btr.bwth(-1831779112);
            class_1799 class_17993 = class_17992;
            n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
            int n2 = n ^ 0xDD4DFEAB;
            if ((n2 ^ n) == -582091093) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x4F9CBA73 ^ n, 12) + -1470614744) * 1335671411;
        }
        return class_17992.method_7909();
    }

    private static class_9304 zshl(class_1799 class_17992) {
        block0: {
            int n = -1675991352;
            int n2 = (n = Integer.rotateLeft(n * -68296823, 15) ^ 0x67C7BBF2) ^ 0x12F5FFF7;
            if ((n2 ^ n) == 318111735) break block0;
            int cfr_ignored_0 = (0x8EEF993F ^ n) - -1498333943;
        }
        return class_17992.method_58657();
    }

    private static boolean shf(class_1799 class_17992) {
        block0: {
            int n = -566155138;
            n = Integer.rotateLeft(n * 408320531, 11) ^ 0xD83E01E2;
            class_1799 class_17993 = class_17992;
            n = Integer.rotateLeft((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 23);
            int n2 = n ^ 0x185256CA;
            if ((n2 ^ n) == 408049354) break block0;
            int cfr_ignored_0 = (0xC6137EB4 ^ n) - 2100108721;
        }
        return class_17992.method_7960();
    }

    private static boolean thft(Object2IntMap object2IntMap, class_5321 class_53212) {
        block0: {
            int n = 1073723785;
            n = Integer.rotateLeft(n * -668478383, 14) ^ 0x5DD97FA2;
            class_5321 class_53213 = class_53212;
            n = Integer.rotateRight((class_53213 != null ? System.identityHashCode(class_53213) : 0) ^ n, 15);
            int n2 = n ^ 0x2BF253D1;
            if ((n2 ^ n) == 737301457) break block0;
            int cfr_ignored_0 = (0x140DEA58 ^ n) + -837802326;
        }
        return bkh_2.dqs_4(object2IntMap, class_53212);
    }

    private static boolean dfq_2(class_1799 class_17992) {
        block0: {
            int n = 1773184695;
            n = Integer.rotateLeft(n * -976547095, 13) ^ 0x2DAD0714;
            class_1799 class_17993 = class_17992;
            n = Integer.rotateRight((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 10);
            int n2 = n ^ 0xC5744D44;
            if ((n2 ^ n) == -982233788) break block0;
            int cfr_ignored_0 = (0xACC4EBF3 ^ n) + 1998192018;
        }
        return class_17992.method_7960();
    }

    private static int rnj(Object2IntMap object2IntMap, class_5321 class_53212) {
        block0: {
            int n = -481324670;
            n = Integer.rotateLeft(n * 509541757, 27) ^ 0x1360FC9C;
            Object2IntMap object2IntMap2 = object2IntMap;
            n = Integer.rotateLeft((object2IntMap2 != null ? System.identityHashCode(object2IntMap2) : 0) ^ n, 17);
            class_5321 class_53213 = class_53212;
            n = (class_53213 != null ? System.identityHashCode(class_53213) : 0) ^ n;
            int n2 = n ^ 0x43952EE7;
            if ((n2 ^ n) == 1133850343) break block0;
            int cfr_ignored_0 = (0xA0DABF65 ^ n) + -860287043;
        }
        return bkh_2.rzd_2(object2IntMap, class_53212);
    }

    private static boolean sbq_2() {
        block0: {
            int n = btr.bwth(-1442079714);
            int n2 = n ^ 0x17BFC3E0;
            if ((n2 ^ n) == 398443488) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xBDB45FFE ^ n, 10) - -46842115) * -1112252417;
        }
        return yf.dnkh();
    }

    private static String[] tms_4(String string) {
        int n = -1748150677;
        n = Integer.rotateLeft(n * 2109464053, 7) ^ 0x5AA08E81;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x78C574D9;
        if ((n2 ^ n) != 2026206425) {
            int cfr_ignored_0 = (0xEF0822B2 ^ n) + -1207977892;
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite bzz_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1528209664;
            n3 = Integer.rotateLeft(n3 * 1186599565, 24) ^ 0x252AC39B;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 18);
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xA8EF5108;
            if ((n4 ^ n3) != -1460711160) {
                int cfr_ignored_0 = (0xC060E08 ^ n3) - 1386786418;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ tdz_3 ^ string.hashCode() ^ n2 + byt + i * -476090277) + tdz_3) ^ byt));
            }
            String[] stringArray = bkh_2.tms_4(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] jdur8reqo2(String string) {
        return string.split("\u0001\u0019", -1);
    }

    private static CallSite zlrc7wk1tw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ pfp06ihp ^ string.hashCode() ^ n2 + nlxleieowzz + i * 1073688111) + pfp06ihp) ^ nlxleieowzz));
            }
            String[] stringArray = bkh_2.jdur8reqo2(new String(cArray));
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

