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
import net.minecraft.class_3300;
import us.m0vy.moondlc.m0vyguard.bza;
import us.m0vy.moondlc.m0vyguard.tdha;

public final class bdd
implements tdha {
    private static final class_3300 rshz_2;
    private static final Gson dhza_4;
    private static final int x9xsnj6du1 = 1053912413;
    private static final int zub53k1 = -525111294;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int lquvnfa9;

    public static class_2960 dhskh_2(String string) {
        return bza.id("core/" + string);
    }

    public static Object ahy_2(class_2960 class_29602, Class clazz) {
        return dhza_4.fromJson(bdd.zns(class_29602), clazz);
    }

    public static String zns(class_2960 class_29602) {
        return bdd.thtk(class_29602, "\n");
    }

    public static String thtk(class_2960 class_29602, String string) {
        String string2;
        Object object;
        InputStream inputStream = null;
        if (mc != null && mc.method_1478() != null) {
            try {
                inputStream = mc.method_1478().open(class_29602);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (inputStream == null && rshz_2 != null) {
            try {
                inputStream = rshz_2.open(class_29602);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (inputStream == null) {
            object = "assets/" + class_29602.method_12836() + "/" + class_29602.method_12832();
            inputStream = bdd.class.getClassLoader().getResourceAsStream((String)object);
            if (inputStream == null) {
                inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream((String)object);
            }
            if (inputStream == null) {
                inputStream = bdd.class.getResourceAsStream("/" + (String)object);
            }
        }
        if (inputStream == null) {
            throw new FileNotFoundException("Resource not found: " + String.valueOf(class_29602));
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

    private static String[] nkh9v9ac(String string) {
        return string.split("\u0007\u0010", -1);
    }

    private static CallSite fl8038i4v4g8qh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ x9xsnj6du1 ^ string.hashCode() ^ n2 + zub53k1 + i * -1561017021) + x9xsnj6du1) ^ zub53k1));
            }
            String[] stringArray = bdd.nkh9v9ac(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

