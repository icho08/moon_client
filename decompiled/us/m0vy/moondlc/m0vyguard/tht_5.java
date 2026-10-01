/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  net.minecraft.class_2960
 *  net.minecraft.class_3300
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.Gson;
import java.io.BufferedReader;
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
import net.minecraft.class_3300;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public final class tht_5 {
    private static final class_3300 dhshs;
    private static final Gson dhmm;
    private static final int tda_4 = 1352290594;
    private static final int bqm = 868654671;
    private static final int hza_4 = 464785557;
    private static final int shzsh = -1062075585;
    private static final int qbfpcny3x = -695358281;
    private static final int go8cpyqhvmqw = 346648779;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int zrre7boh1zw;

    public static class_2960 dhsha_2(String string) {
        block0: {
            int n = -439289414;
            n = Integer.rotateLeft(n * 11956861, 7) ^ 0x13D80A62;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 29);
            int n2 = n ^ 0x1EC39FAD;
            if ((n2 ^ n) == 516136877) break block0;
            int cfr_ignored_0 = (0xFB136617 ^ n) + 561532934;
        }
        return Moondlc.id("core/" + string);
    }

    public static Object jadh_2(class_2960 class_29602, Class clazz) {
        block0: {
            int n = 568669891;
            n = Integer.rotateLeft(n * -175854949, 19) ^ 0xBD480CCF;
            Class clazz2 = clazz;
            n = Integer.rotateRight((clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n, 25);
            int n2 = n ^ 0x5183025F;
            if ((n2 ^ n) == 1367540319) break block0;
            int cfr_ignored_0 = (0x7066349C ^ n) + 1718679072;
        }
        return dhmm.fromJson(tht_5.shbs_2(class_29602), clazz);
    }

    public static String shbs_2(class_2960 class_29602) {
        try {
            int n = 2085921255;
            n = Integer.rotateLeft(n * 608655307, 19) ^ 0xED6AF456;
            int n2 = n ^ 0xE51EBC05;
            if ((n2 ^ n) != -450970619) {
                int cfr_ignored_0 = (0x994A1DE2 ^ n) - -150480309;
            }
            if ((0x265 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return tht_5.shyh(class_29602, "\n");
    }

    /*
     * Loose catch block
     */
    public static String shyh(class_2960 class_29602, String string) {
        String string22;
        BufferedReader bufferedReader;
        InputStream inputStream;
        block14: {
            int n = -1006887811;
            n = Integer.rotateLeft(n * 1115039019, 26) ^ 0xF768D2A4;
            class_2960 class_29603 = class_29602;
            n = Integer.rotateRight((class_29603 != null ? System.identityHashCode(class_29603) : 0) ^ n, 27);
            String string3 = string;
            n = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 9);
            int n2 = n ^ 0x2E6C253F;
            if ((n2 ^ n) != 778839359) {
                int cfr_ignored_0 = (0xED903942 ^ n) + -2038540309;
            }
            inputStream = dhshs.open(class_29602);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            string22 = bufferedReader.lines().collect(Collectors.joining(string));
            bufferedReader.close();
            if (inputStream == null) break block14;
            inputStream.close();
        }
        return string22;
        {
            catch (Throwable throwable) {
                try {
                    try {
                        try {
                            bufferedReader.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                        throw throwable;
                    }
                    catch (Throwable throwable3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            }
                            catch (Throwable throwable4) {
                                tht_5.baa_3(throwable3, throwable4);
                            }
                        }
                        throw throwable3;
                    }
                }
                catch (IOException iOException) {
                    throw new RuntimeException(iOException);
                }
            }
        }
    }

    private static String dghsh(String string, int n, int n2, int n3) {
        int n4 = 1671704323;
        n4 = Integer.rotateLeft(n4 * -1700305245, 6) ^ 0x61683CF4;
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 4);
        int n5 = (n4 = n ^ n4) ^ 0x827AA893;
        if ((n5 ^ n4) != -2105890669) {
            int cfr_ignored_0 = (0xE1DE8790 ^ n4) + -1502747607;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xD0054568) + i ^ tda_4, 5) ^ n2 + bqm));
        }
        return new String(cArray);
    }

    private static String szb_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1491404066;
            n4 = Integer.rotateLeft(n4 * -2130069023, 3) ^ 0x1B914229;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0xBC010805;
            if ((n5 ^ n4) == -1140783099) break block0;
            int cfr_ignored_0 = (0x1B1BF2DB ^ n4) - 18533154;
        }
        return tht_5.dghsh(string, n, n2, n3);
    }

    private static void baa_3(Throwable throwable, Throwable throwable2) {
        int n = -1919708863;
        n = Integer.rotateLeft(n * -516964481, 9) ^ 0xABE54585;
        Throwable throwable3 = throwable;
        n = (throwable3 != null ? System.identityHashCode(throwable3) : 0) ^ n;
        Throwable throwable4 = throwable2;
        n = Integer.rotateLeft((throwable4 != null ? System.identityHashCode(throwable4) : 0) ^ n, 5);
        int n2 = n ^ 0xE76EA2C;
        if ((n2 ^ n) != 242674220) {
            int cfr_ignored_0 = (0x83E57B6D ^ n) - -702322252;
        }
        throwable.addSuppressed(throwable2);
    }

    private static String[] thghf(String string) {
        int n = 1238073560;
        int n2 = (n = Integer.rotateLeft(n * 1862696029, 9) ^ 0xC4F1DF48) ^ 0xBE89F2C7;
        if ((n2 ^ n) != -1098255673) {
            int cfr_ignored_0 = (0xF742721F ^ n) - 597713083;
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

    private static CallSite ttth_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1067422008;
            n3 = Integer.rotateLeft(n3 * 334964003, 14) ^ 0xA9010;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 26);
            int n4 = n3 ^ 0xE92B9A5D;
            if ((n4 ^ n3) != -383018403) {
                int cfr_ignored_0 = (0xD6B40B65 ^ n3) + -1953267402;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ hza_4 ^ string.hashCode()) + (n2 + shzsh) + i ^ hza_4, 9) + shzsh);
            }
            String[] stringArray = tht_5.thghf(new String(cArray));
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

    private static String[] dhpr1wzkcv2c(String string) {
        return string.split("\u0001\u001e", -1);
    }

    private static CallSite zpskug64w(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ qbfpcny3x ^ string.hashCode()) + (n2 + go8cpyqhvmqw) + i ^ qbfpcny3x, 21) + go8cpyqhvmqw);
            }
            String[] stringArray = tht_5.dhpr1wzkcv2c(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
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

