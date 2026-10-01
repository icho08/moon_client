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

public class tl_2
extends zt {
    private static final tl_2 rba_2;
    private static final int oyrvwui = -247840754;
    private static final int fb86kwx = 1908344988;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ozpvcu3ga1e7l;

    @Generated
    public tl_2() {
    }

    @Generated
    public static tl_2 ddb_2() {
        block0: {
            int n = 785670858;
            int n2 = (n = Integer.rotateLeft(n * 1599457183, 14) ^ 0x18B84A76) ^ 0xCEF17D5C;
            if ((n2 ^ n) == -823034532) break block0;
            int cfr_ignored_0 = (0xE0251F96 ^ n) + 1775807247;
        }
        return rba_2;
    }

    private static String[] c9ppld9vvowx8a(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite pzctvmhdp(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ oyrvwui ^ string.hashCode()) + (n2 + fb86kwx) + i ^ oyrvwui, 17) + fb86kwx);
            }
            String[] stringArray = tl_2.c9ppld9vvowx8a(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

