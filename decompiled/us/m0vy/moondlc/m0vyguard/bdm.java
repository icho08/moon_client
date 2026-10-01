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
import us.m0vy.moondlc.m0vyguard.bhgh;
import us.m0vy.moondlc.m0vyguard.zt;

public class bdm
extends zt {
    private static final bdm thkj;
    private static final int o4psx05sc = 603894575;
    private static final int kctpc4a3v1b9y = 82243171;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int l60vnkwy;

    @Generated
    public static bdm dhsl_2() {
        block0: {
            int n = bhgh.shkhh_2(-765913919);
            int n2 = n ^ 0x933B5054;
            if ((n2 ^ n) == -1824829356) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x41624495 ^ n, 11) - -280761018) * 1096959125;
            int cfr_ignored_1 = (int)(0x83D0EAA827D4EB4FL ^ (long)n ^ 0x2820831A2DB8AA70L);
        }
        return thkj;
    }

    private static String[] gojujnssxsran(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite sn88h4r32y6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ o4psx05sc ^ string.hashCode()) + (n2 + kctpc4a3v1b9y) + i ^ o4psx05sc, 4) + kctpc4a3v1b9y);
            }
            String[] stringArray = bdm.gojujnssxsran(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

