/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1011
 *  net.minecraft.class_1043
 *  net.minecraft.class_1044
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 */
package us.m0vy.moondlc.m0vyguard;

import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.URL;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_2960;
import net.minecraft.class_310;

public class tdh {
    private static final int unpkamxszjfst = -673265054;
    private static final int nhvae2z8 = 1423915969;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int tgkv10ig14q;

    public static class_2960 zwa_4(String string, class_1011 class_10112) {
        if (class_10112 == null) {
            return null;
        }
        class_2960 class_29602 = class_2960.method_60655((String)"moondlc", (String)(string + System.currentTimeMillis()));
        class_310 class_3102 = class_310.method_1551();
        class_3102.execute(() -> tdh.ghrd(class_10112, class_3102, class_29602));
        return class_29602;
    }

    public static class_1011 bht_3(String string) {
        try {
            URL uRL = new URL(string);
            InputStream inputStream = uRL.openStream();
            class_1011 class_10112 = class_1011.method_4309((InputStream)inputStream);
            inputStream.close();
            return class_10112;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static void ghrd(class_1011 class_10112, class_310 class_3102, class_2960 class_29602) {
        try {
            class_1043 class_10432 = new class_1043(class_10112);
            class_3102.method_1531().method_4616(class_29602, (class_1044)class_10432);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static String[] egrg2pfmvb(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ngkb2qi9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ unpkamxszjfst ^ string.hashCode() ^ n2 + nhvae2z8 + i * -1300257825) + unpkamxszjfst) ^ nhvae2z8));
            }
            String[] stringArray = tdh.egrg2pfmvb(new String(cArray));
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

