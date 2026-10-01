/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_3300
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.stream.Collectors;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3300;
import us.m0vy.moondlc.m0vyguard.bya_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class an {
    private static final Gson dnb;
    private static final int bshq = -771669795;
    private static final int bhy_2 = -931616253;
    private static final int syt = -1526672193;
    private static final int ssr_2 = 737803980;
    private static final int vixc588tz34 = -744504471;
    private static final int b28e0f9e9 = -1852008691;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int fkr6olwv3vr;

    public static InputStream zghl(String string) {
        block0: {
            int n = -1610550448;
            int n2 = (n = Integer.rotateLeft(n * 1353957689, 6) ^ 0x4BC906F5) ^ 0xA1DF6A8E;
            if ((n2 ^ n) == -1579193714) break block0;
            int cfr_ignored_0 = (0x1DF99DE ^ n) + 1280205756;
        }
        return an.class.getResourceAsStream("/assets/" + "MoonDLC".toLowerCase() + "/" + string);
    }

    public static class_2960 khds(String string) {
        block0: {
            int n = bya_2.tmh_4(287917710);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 20);
            int n2 = n ^ 0x4A0F953;
            if ((n2 ^ n) == 77658451) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x1589BFDD ^ n, 5) - -1609835778) * 361349085;
            int cfr_ignored_1 = (int)(0xD73B11E027D4EB4FL ^ (long)n ^ 0xDEB0831A2DB803A7L);
        }
        return class_2960.method_60655((String)"MoonDLC".toLowerCase(), (String)("images/" + string + ".png"));
    }

    public static class_2960 thyw(String string) {
        block0: {
            int n = 408044470;
            n = Integer.rotateLeft(n * 2145028993, 27) ^ 0x3FF57E5;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x127D6E97;
            if ((n2 ^ n) == 310210199) break block0;
            int cfr_ignored_0 = (0xA2F2D21 ^ n) + -1167405365;
        }
        return an.hfm("MoonDLC".toLowerCase(), "core/" + string);
    }

    public static Object thkd(class_2960 class_29602, Class clazz) {
        block0: {
            int n = 1759096153;
            n = Integer.rotateLeft(n * -1902868469, 27) ^ 0x16D82843;
            Class clazz2 = clazz;
            n = Integer.rotateRight((clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n, 28);
            int n2 = n ^ 0xFBD03E5E;
            if ((n2 ^ n) == -70238626) break block0;
            int cfr_ignored_0 = (0x93099307 ^ n) + -1914835934;
        }
        return dnb.fromJson(an.jsw_2(class_29602), clazz);
    }

    public static String jsw_2(class_2960 class_29602) {
        block0: {
            int n = -821810610;
            n = Integer.rotateLeft(n * -88290205, 7) ^ 0xC4F4D1F2;
            class_2960 class_29603 = class_29602;
            n = Integer.rotateLeft((class_29603 != null ? System.identityHashCode(class_29603) : 0) ^ n, 17);
            int n2 = n ^ 0x6886BC6A;
            if ((n2 ^ n) == 1753660522) break block0;
            int cfr_ignored_0 = (0xA7829624 ^ n) + 1983056359;
        }
        return an.sbw(class_29602, "\n");
    }

    public static String sbw(class_2960 class_29602, String string) {
        String string2;
        Object object;
        int n = 1432772387;
        n = Integer.rotateLeft(n * -431042827, 10) ^ 0x38AA4E55;
        class_2960 class_29603 = class_29602;
        n = Integer.rotateLeft((class_29603 != null ? System.identityHashCode(class_29603) : 0) ^ n, 4);
        String string3 = string;
        n = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 6);
        int n2 = n ^ 0x888D43BD;
        if ((n2 ^ n) != -2004008003) {
            int cfr_ignored_0 = (0xDDEB1C9E ^ n) + -1177644052;
        }
        if (!an.dyh_4()) {
            yf.athz_2();
            throw null;
        }
        InputStream inputStream = null;
        class_310 class_3102 = class_310.method_1551();
        if (class_3102 != null && class_3102.method_1478() != null) {
            try {
                inputStream = an.dzk_4(class_3102).open(class_29602);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (inputStream == null) {
            inputStream = an.zghl(class_29602.method_12832());
        }
        if (inputStream == null) {
            object = "assets/" + class_29602.method_12836() + "/" + class_29602.method_12832();
            inputStream = an.class.getClassLoader().getResourceAsStream((String)object);
            if (inputStream == null) {
                inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream((String)object);
            }
            if (inputStream == null) {
                inputStream = an.class.getResourceAsStream("/" + (String)object);
            }
        }
        if (inputStream == null) {
            throw new RuntimeException(new FileNotFoundException("Resource not found: " + String.valueOf(class_29602)));
        }
        object = new BufferedReader(new InputStreamReader(inputStream));
        try {
            string2 = ((BufferedReader)object).lines().collect(Collectors.joining(string));
        }
        catch (Throwable throwable) {
            try {
                try {
                    ((BufferedReader)object).close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        ((BufferedReader)object).close();
        return string2;
    }

    private static String zdhd_2(String string, int n, int n2, int n3) {
        int n4 = bya_2.tmh_4(-557028665);
        n4 = n ^ n4;
        int n5 = (n4 = n2 ^ n4) ^ 0x5278E90F;
        if ((n5 ^ n4) != 1383655695) {
            int cfr_ignored_0 = Integer.rotateLeft(0x8CB483C8 ^ n4, 4) + 238654579;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x781984F3) + bshq ^ Integer.reverse(n2 + i * -1647608339), 7) - bhy_2);
        }
        return new String(cArray);
    }

    private static String dhbl(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bya_2.tmh_4(-1368093723);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0x34E8BB31;
            if ((n5 ^ n4) == 887667505) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x9A9C30D4 ^ n4, 6) - -1119385369) * -1701039915;
        }
        return an.zdhd_2(string, n, n2, n3);
    }

    private static class_2960 hfm(String string, String string2) {
        block0: {
            int n = bya_2.tmh_4(-1911478891);
            String string3 = string2;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0x792AFEC8;
            if ((n2 ^ n) == 2032860872) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xF73BDB5D ^ n, 17) - -191025282) * -147072163;
            int cfr_ignored_1 = (int)(0x3589756027D4EB4FL ^ (long)n ^ 0x17B0831A2DB9C6C3L);
        }
        return class_2960.method_60655((String)string, (String)string2);
    }

    private static boolean dyh_4() {
        block0: {
            int n = 2053478230;
            int n2 = (n = Integer.rotateLeft(n * -2046825055, 8) ^ 0x9D46FD0E) ^ 0xFF4A272D;
            if ((n2 ^ n) == -11917523) break block0;
            int cfr_ignored_0 = (0x852FB07B ^ n) - 1856857597;
        }
        return yf.khdha_2();
    }

    private static class_3300 dzk_4(class_310 class_3102) {
        block0: {
            int n = -1580708813;
            n = Integer.rotateLeft(n * -1184319647, 28) ^ 0xB24695A3;
            class_310 class_3103 = class_3102;
            n = Integer.rotateRight((class_3103 != null ? System.identityHashCode(class_3103) : 0) ^ n, 8);
            int n2 = n ^ 0xCA07F4FB;
            if ((n2 ^ n) == -905448197) break block0;
            int cfr_ignored_0 = (0x6BCFB8C8 ^ n) + 362749665;
        }
        return class_3102.method_1478();
    }

    private static String[] khtb(String string) {
        int n = bya_2.tmh_4(-892680005);
        int n2 = n ^ 0x22A23E31;
        if ((n2 ^ n) != 581058097) {
            int cfr_ignored_0 = Integer.rotateRight(0xE868F68A ^ n, 16) + 689142257;
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

    private static CallSite sghj_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 107696755;
            n3 = Integer.rotateLeft(n3 * 834533333, 24) ^ 0xFFF3536E;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 27);
            String string3 = string2;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 17);
            int n4 = n3 ^ 0x2DA3F7EC;
            if ((n4 ^ n3) != 765720556) {
                int cfr_ignored_0 = (0x2BC8A59F ^ n3) + -1770290346;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ syt ^ string.hashCode()) + (n2 + ssr_2) + i ^ syt, 11) + ssr_2);
            }
            String[] stringArray = an.khtb(new String(cArray));
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

    private static String[] xll0gdrbi(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite wtmxubd4ccz1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ vixc588tz34 ^ string.hashCode()) + (n2 + b28e0f9e9) + i ^ vixc588tz34, 22) + b28e0f9e9);
            }
            String[] stringArray = an.xll0gdrbi(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

