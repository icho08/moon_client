/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;

public class bdy {
    public static bdy khtb;
    private static final int p143bo3a = 2115925360;
    private static final int o5wyoye1h = 1928649685;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int nhvi3ywcjl84;

    public void ghzs_3() {
        block0: {
            int n = -422724011;
            n = Integer.rotateLeft(n * -85608669, 4) ^ 0x47DCA611;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 4);
            int n2 = n ^ 0x3D24791C;
            if ((n2 ^ n) == 1025800476) break block0;
            int cfr_ignored_0 = (0xDBE9C749 ^ n) - 233621474;
        }
    }

    private static String[] y3un9saa4(String string) {
        return string.split("\u0005\u001c", -1);
    }

    private static CallSite b061vvr9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ p143bo3a ^ string.hashCode() ^ n2 + o5wyoye1h ^ i * 794353407 ^ p143bo3a, 22) ^ o5wyoye1h));
            }
            String[] stringArray = bdy.y3un9saa4(new String(cArray));
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

