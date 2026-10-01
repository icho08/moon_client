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

public class khk
extends zt {
    private static final khk hkhy;
    private static final int ubsnhqj2 = 2037971837;
    private static final int u6wmypgbtqge4 = 505221071;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int noj1mko9;

    @Generated
    public static khk thshk() {
        block0: {
            int n = 1020078381;
            int n2 = (n = Integer.rotateLeft(n * -240010557, 28) ^ 0xC80022E5) ^ 0x4A4235B4;
            if ((n2 ^ n) == 1245853108) break block0;
            int cfr_ignored_0 = (0x768F1C99 ^ n) + -1331462277;
        }
        return hkhy;
    }

    private static String[] k5rzyay3vp(String string) {
        return string.split("\u0007\u001f", -1);
    }

    private static CallSite z7y39e3n(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ubsnhqj2 ^ string.hashCode() ^ n2 + u6wmypgbtqge4 ^ i * -168785465 ^ ubsnhqj2, 19) ^ u6wmypgbtqge4));
            }
            String[] stringArray = khk.k5rzyay3vp(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

