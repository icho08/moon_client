/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.zt;

public class zgh
extends zt {
    private static final zgh INSTANCE;
    private static final int tbeyqkwmnusa = -774531690;
    private static final int k5fyb6b3axj68 = 828457083;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int cqajlq0ov8;

    public static zgh tks_2() {
        block0: {
            int n = 1883168511;
            int n2 = (n = Integer.rotateLeft(n * -1075785903, 5) ^ 0xA08D9B23) ^ 0x46636F43;
            if ((n2 ^ n) == 1180921667) break block0;
            int cfr_ignored_0 = (0x365DB1BC ^ n) - -1237411859;
        }
        return INSTANCE;
    }

    private static String[] hvopwtf6pbgne(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite jtz8yo7jh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ tbeyqkwmnusa ^ string.hashCode()) + (n2 + k5fyb6b3axj68) + i ^ tbeyqkwmnusa, 27) + k5fyb6b3axj68);
            }
            String[] stringArray = zgh.hvopwtf6pbgne(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

