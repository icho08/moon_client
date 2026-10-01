/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.dl;

public class nl
implements dl {
    private static final int ftp27d39ds = -1040507551;
    private static final int hd7wg5il7 = -2088259932;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int aousk48shuabw;

    public static void bhth() {
        block0: {
            int n = 1514597224;
            int n2 = (n = Integer.rotateLeft(n * 78108271, 12) ^ 0x72747D29) ^ 0x37046422;
            if ((n2 ^ n) == 923034658) break block0;
            int cfr_ignored_0 = (0x6D428F4A ^ n) + -1272356913;
        }
    }

    public static void dwt_2() {
        block0: {
            int n = -1049395551;
            int n2 = (n = Integer.rotateLeft(n * -1016410343, 20) ^ 0x7EB19389) ^ 0x1F84E082;
            if ((n2 ^ n) == 528801922) break block0;
            int cfr_ignored_0 = (0xDEF79E23 ^ n) + -823433038;
        }
    }

    private static String[] ey6fagnqytvq(String string) {
        return string.split("\u0006\u0010", -1);
    }

    private static CallSite c17gzu6l(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ftp27d39ds ^ string.hashCode() ^ n2 + hd7wg5il7 ^ i * -140372121 ^ ftp27d39ds, 26) ^ hd7wg5il7));
            }
            String[] stringArray = nl.ey6fagnqytvq(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

