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

public class zth_3
extends zt {
    private static final zth_3 khwm;
    private static final int xcddtba3 = 1102772692;
    private static final int f5funw64kuzvv = 765295679;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int vc2ntfxmztxeu;

    @Generated
    public static zth_3 dzgh_3() {
        block0: {
            int n = -398323982;
            int n2 = (n = Integer.rotateLeft(n * 1630093803, 26) ^ 0xD610102C) ^ 0xF0B1B2CB;
            if ((n2 ^ n) == -256789813) break block0;
            int cfr_ignored_0 = (0x18F3BC39 ^ n) - 1051890660;
        }
        return khwm;
    }

    private static String[] qfj2u5i393ve(String string) {
        return string.split("\b\u0018", -1);
    }

    private static CallSite egctnjluqlxeje(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ xcddtba3 ^ string.hashCode() ^ n2 + f5funw64kuzvv + i * -583399103) + xcddtba3) ^ f5funw64kuzvv));
            }
            String[] stringArray = zth_3.qfj2u5i393ve(new String(cArray));
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

