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

public class bbdh
extends zt {
    private static final bbdh bzy_2;
    private static final int p4tslhwtixrd = -244966958;
    private static final int yyzttr2oi7 = 2067015998;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int avretts78hcmb;

    @Generated
    public static bbdh dhthq() {
        block0: {
            int n = -912950367;
            int n2 = (n = Integer.rotateLeft(n * 847319479, 20) ^ 0x2A797497) ^ 0xFC39BF6A;
            if ((n2 ^ n) == -63324310) break block0;
            int cfr_ignored_0 = (0x35ACC4CB ^ n) + 610146052;
        }
        return bzy_2;
    }

    private static String[] sob85w34ixij9(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite czxlh3ekp(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ p4tslhwtixrd ^ string.hashCode()) + (n2 + yyzttr2oi7) + i ^ p4tslhwtixrd, 14) + yyzttr2oi7);
            }
            String[] stringArray = bbdh.sob85w34ixij9(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

