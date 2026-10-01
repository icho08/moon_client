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
import us.m0vy.moondlc.m0vyguard.bsgh_2;
import us.m0vy.moondlc.m0vyguard.zt;

public class wth
extends zt {
    private static final wth bzt_3;
    private static final int cgk5w7r = 953412748;
    private static final int khmyh0upi8idn = 1534016641;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int p79mtnlkx9u3;

    @Generated
    public static wth jrt_2() {
        block0: {
            int n = bsgh_2.ady(-192287533);
            int n2 = n ^ 0xC4A5611A;
            if ((n2 ^ n) == -995794662) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x302C8DC9 ^ n, 9) + -641545582;
            int cfr_ignored_1 = (int)(0xF29E23F427D4EB4FL ^ (long)n ^ 0xBA98831A2DB848EDL);
        }
        return bzt_3;
    }

    private static String[] lhynyamve(String string) {
        return string.split("\u0003\u0019", -1);
    }

    private static CallSite abm1go6iq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ cgk5w7r ^ string.hashCode() ^ n2 + khmyh0upi8idn ^ i * -72896897 ^ cgk5w7r, 17) ^ khmyh0upi8idn));
            }
            String[] stringArray = wth.lhynyamve(new String(cArray));
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

