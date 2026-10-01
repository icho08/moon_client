/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import us.m0vy.moondlc.m0vyguard.bdt_4;
import us.m0vy.moondlc.m0vyguard.kk;

public class blgh
extends bdt_4 {
    private static final int dsq = -40590298;
    private static final int bha_2 = 1866717249;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int fit69wy4svnswd;

    public blgh() {
        super(List.of(new kk()));
    }

    private static String[] sdkh(String string) {
        block0: {
            int n = -1300300636;
            n = Integer.rotateLeft(n * -1623485029, 15) ^ 0xBC884952;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x37CDCCFC;
            if ((n2 ^ n) == 936234236) break block0;
            int cfr_ignored_0 = (0x85B33058 ^ n) + -1458806581;
        }
        return string.split("\b\u000e", -1);
    }

    private static CallSite dwn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 289377431;
            n3 = Integer.rotateLeft(n3 * -1627728425, 21) ^ 0xD1711D13;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 29);
            int n4 = n3 ^ 0x517F06C7;
            if ((n4 ^ n3) != 1367279303) {
                int cfr_ignored_0 = (0x40408A50 ^ n3) + 1006162439;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dsq ^ string.hashCode() ^ n2 + bha_2 ^ i * -1831675131 ^ dsq, 22) ^ bha_2));
            }
            String[] stringArray = blgh.sdkh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

