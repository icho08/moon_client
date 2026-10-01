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

public class bthd_2
extends zt {
    private static final bthd_2 khmt;
    private static final int jszz53oav = 1920559493;
    private static final int upvx14mn2e9 = -2093254832;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int poq1bqvsr;

    @Generated
    public static bthd_2 sz_2() {
        block0: {
            int n = -415160881;
            int n2 = (n = Integer.rotateLeft(n * 765491753, 7) ^ 0x2AE4CAC0) ^ 0x34BE8357;
            if ((n2 ^ n) == 884900695) break block0;
            int cfr_ignored_0 = (0xD3FFA698 ^ n) - 1754107942;
        }
        return khmt;
    }

    private static String[] y2270wmv(String string) {
        return string.split("\u0003\u000e", -1);
    }

    private static CallSite gbjjdf3oqf0f0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ jszz53oav ^ string.hashCode()) + (n2 + upvx14mn2e9) + i ^ jszz53oav, 21) + upvx14mn2e9);
            }
            String[] stringArray = bthd_2.y2270wmv(new String(cArray));
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

