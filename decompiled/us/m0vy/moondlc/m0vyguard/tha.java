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
import us.m0vy.moondlc.m0vyguard.bnk;
import us.m0vy.moondlc.m0vyguard.zt;

public class tha
extends zt {
    private static final tha dhmd_2;
    private static final int jg5jwmth1r7v8 = -569554576;
    private static final int eixx1cri = 951477501;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int o7cng1c3;

    @Generated
    public static tha thf_3() {
        block0: {
            int n = bnk.hyd_2(-767334840);
            int n2 = n ^ 0xFB753A56;
            if ((n2 ^ n) == -76203434) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x29365C1E ^ n, 8) - 32687837) * 691428383;
        }
        return dhmd_2;
    }

    private static String[] hklq070i1xs(String string) {
        return string.split("\u0007\u001c", -1);
    }

    private static CallSite egpb7wj7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ jg5jwmth1r7v8 ^ string.hashCode()) + (n2 + eixx1cri) + i ^ jg5jwmth1r7v8, 16) + eixx1cri);
            }
            String[] stringArray = tha.hklq070i1xs(new String(cArray));
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

