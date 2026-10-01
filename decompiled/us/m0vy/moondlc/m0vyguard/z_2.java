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

public class z_2
extends zt {
    private static final z_2 bwgh;
    private static final int gzmedkbhnvvef = -235760166;
    private static final int mb5ucvh1pi0p = 97562305;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int qwo5kn0cwgfi1v;

    @Generated
    public static z_2 zay_4() {
        block0: {
            int n = 496961296;
            int n2 = (n = Integer.rotateLeft(n * 1389313939, 15) ^ 0xCD83E2E3) ^ 0x3C36554B;
            if ((n2 ^ n) == 1010193739) break block0;
            int cfr_ignored_0 = (0x21A9525B ^ n) - -2070294013;
        }
        return bwgh;
    }

    private static String[] zgd3tg4rg(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite mkyc1yj9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ gzmedkbhnvvef ^ string.hashCode() ^ n2 + mb5ucvh1pi0p + i * -696094915) + gzmedkbhnvvef) ^ mb5ucvh1pi0p));
            }
            String[] stringArray = z_2.zgd3tg4rg(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

