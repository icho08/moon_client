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
import us.m0vy.moondlc.m0vyguard.bwt_2;
import us.m0vy.moondlc.m0vyguard.zt;

public class tsq
extends zt {
    private static final tsq dhh_3;
    private static final int m9uorxw62om = 255311218;
    private static final int apfqx29w = 1305774828;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int skxwpelw1h;

    @Generated
    public static tsq ghdhz() {
        block0: {
            int n = bwt_2.rbw(-2027980722);
            int n2 = n ^ 0x391B076A;
            if ((n2 ^ n) == 958072682) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xBE047F24 ^ n, 10) - 115934359;
        }
        return dhh_3;
    }

    private static String[] mxz4lavi(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite t2nzogx9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ m9uorxw62om ^ string.hashCode() ^ n2 + apfqx29w ^ i * -1249944587 ^ m9uorxw62om, 17) ^ apfqx29w));
            }
            String[] stringArray = tsq.mxz4lavi(new String(cArray));
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

