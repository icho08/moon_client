/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.zt;

public class tsa
extends zt {
    private static final tsa dkhm;
    private static final int ueqj7jufeg = -471881626;
    private static final int mymxy763 = 1654374299;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int uheb85huo1;

    @Generated
    public static tsa asa_3() {
        block0: {
            int n = 4489078;
            int n2 = (n = Integer.rotateLeft(n * 2089546151, 9) ^ 0x5957991) ^ 0xA1EEB1E8;
            if ((n2 ^ n) == -1578192408) break block0;
            int cfr_ignored_0 = (0xA1AACE9E ^ n) + -893983628;
        }
        return dkhm;
    }

    private static String[] v25od83s20(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite qzjozm8vwp(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ueqj7jufeg ^ string.hashCode() ^ n2 + mymxy763 ^ i * -10007235 ^ ueqj7jufeg, 15) ^ mymxy763));
            }
            String[] stringArray = tsa.v25od83s20(new String(cArray));
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

