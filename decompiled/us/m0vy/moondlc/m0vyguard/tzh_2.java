/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;

public final class tzh_2
extends Enum {
    public static final /* enum */ tzh_2 INSTANCE;
    private static final tzh_2[] hht;
    private static final int y8tsg8ause = 834059348;
    private static final int mzhoh75hoquey = 1462826982;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";

    public static tzh_2[] values() {
        return (tzh_2[])hht.clone();
    }

    public static tzh_2 valueOf(String string) {
        return Enum.valueOf(tzh_2.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private tzh_2() {
        void var2_-1;
        void var1_-1;
    }

    public void setEnabled(boolean bl) {
    }

    private static tzh_2[] $values() {
        return new tzh_2[]{INSTANCE};
    }

    private static String[] yrdig3u1n(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite tvkb1ie69k(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ y8tsg8ause ^ string.hashCode() ^ n2 + mzhoh75hoquey + i * 1320009561) + y8tsg8ause) ^ mzhoh75hoquey));
            }
            String[] stringArray = tzh_2.yrdig3u1n(new String(cArray));
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

