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

public final class bkz_2 {
    private static final class_3300 thm_2;
    private static final Gson tkw;
    private static final int pw8usflr = -1887515661;
    private static final int pp18giy = -1687091381;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int nrv7uv9hz3sy4;

    public static class_2960 dqd_4(String string) {
        return class_2960.method_60655((String)"moondlc", (String)("core/" + string));
    }

    public static Object khddh(class_2960 class_29602, Class clazz) {
        return tkw.fromJson(bkz_2.dtt_5(class_29602), clazz);
    }

    public static String dtt_5(class_2960 class_29602) {
        return bkz_2.dzs_5(class_29602, "\n");
    }

    public static String dzs_5(class_2960 class_29602, String string) {
        try {
            String string2;
            try (InputStream inputStream = thm_2.open(class_29602);
                 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));){
                string2 = bufferedReader.lines().collect(Collectors.joining(string));
            }
            return string2;
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    private static String[] fnsbnzt0r(String string) {
        return string.split("\u0005\u0018", -1);
    }

    private static CallSite ykedml6c(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ pw8usflr ^ string.hashCode() ^ n2 + pp18giy + i * 211826551) + pw8usflr) ^ pp18giy));
            }
            String[] stringArray = bkz_2.fnsbnzt0r(new String(cArray));
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

