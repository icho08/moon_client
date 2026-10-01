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
import us.m0vy.moondlc.m0vyguard.bkl;
import us.m0vy.moondlc.m0vyguard.zt;

public class tdr
extends zt {
    private static final tdr tfh;
    private static final int wcmq4p57 = 922769581;
    private static final int cvoymh80jw6 = 166832749;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int pp987t4lug;

    @Generated
    public static tdr shay() {
        block0: {
            int n = bkl.tzh_3(-1685964872);
            int n2 = n ^ 0xFC888326;
            if ((n2 ^ n) == -58162394) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x670AB49E ^ n, 15) - 2125037149) * 1728754847;
        }
        return tfh;
    }

    private static String[] y3lngyuubjnf(String string) {
        return string.split("\u0002\u0012", -1);
    }

    private static CallSite epxex9z0f1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ wcmq4p57 ^ string.hashCode() ^ n2 + cvoymh80jw6 + i * 319283073) + wcmq4p57) ^ cvoymh80jw6));
            }
            String[] stringArray = tdr.y3lngyuubjnf(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

