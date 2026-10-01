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

public class bghh_2
extends zt {
    private static final bghh_2 bqkh;
    private static final int rxl5qy0ah = -1197042099;
    private static final int chr05hrei = -1512802525;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ancm37nn76o;

    @Generated
    public static bghh_2 ha_4() {
        block0: {
            int n = 713544639;
            int n2 = (n = Integer.rotateLeft(n * 32744503, 28) ^ 0xFBE9F226) ^ 0xCBFB8D1F;
            if ((n2 ^ n) == -872706785) break block0;
            int cfr_ignored_0 = (0xE17C5EA0 ^ n) - -1839481219;
        }
        return bqkh;
    }

    private static String[] q5wvl9o4(String string) {
        return string.split("\u0004\u0016", -1);
    }

    private static CallSite hl98stsmpury(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ rxl5qy0ah ^ string.hashCode() ^ n2 + chr05hrei ^ i * 1938791211 ^ rxl5qy0ah, 22) ^ chr05hrei));
            }
            String[] stringArray = bghh_2.q5wvl9o4(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

