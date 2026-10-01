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

public class tzs_2
extends zt {
    private static final tzs_2 jzt_2;
    private static final int izzil526 = 816418246;
    private static final int idpuf15b = 449113595;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ru82ojwwg4m;

    @Generated
    public static tzs_2 dd_3() {
        block0: {
            int n = 124017655;
            int n2 = (n = Integer.rotateLeft(n * -328764977, 20) ^ 0x3BE60EDE) ^ 0x6268C638;
            if ((n2 ^ n) == 1651033656) break block0;
            int cfr_ignored_0 = (0x650C9DCF ^ n) - 982026594;
        }
        return jzt_2;
    }

    private static String[] hw8w1wkirsbvir(String string) {
        return string.split("\u0005\u0012", -1);
    }

    private static CallSite qhxi9jj23fnmy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ izzil526 ^ string.hashCode()) + (n2 + idpuf15b) + i ^ izzil526, 24) + idpuf15b);
            }
            String[] stringArray = tzs_2.hw8w1wkirsbvir(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

