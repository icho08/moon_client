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

public class bww
extends zt {
    private static final bww shrk;
    private static final int gfjh54iok = -1684325743;
    private static final int xcpntb10as = 638117981;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int zwztjslbzb19;

    @Generated
    public static bww smdh_2() {
        block0: {
            int n = 1468695646;
            int n2 = (n = Integer.rotateLeft(n * 1716149539, 14) ^ 0x12C89171) ^ 0x7A6AC770;
            if ((n2 ^ n) == 2053818224) break block0;
            int cfr_ignored_0 = (0x2DE0432E ^ n) + -260602286;
        }
        return shrk;
    }

    private static String[] uilfhp46ubod2(String string) {
        return string.split("\u0001\u001f", -1);
    }

    private static CallSite obycewra93rot(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ gfjh54iok ^ string.hashCode() ^ n2 + xcpntb10as + i * -172630141) + gfjh54iok) ^ xcpntb10as));
            }
            String[] stringArray = bww.uilfhp46ubod2(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

