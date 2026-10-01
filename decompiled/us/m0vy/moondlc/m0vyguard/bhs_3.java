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

public class bhs_3
extends zt {
    private static final bhs_3 hqt;
    private static final int f6cn5na = 1083478328;
    private static final int om43bfs9vr17 = -704437879;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int a5cxkwqdrpxb;

    @Generated
    public static bhs_3 hdz_2() {
        block0: {
            int n = 871245492;
            int n2 = (n = Integer.rotateLeft(n * 1345267441, 12) ^ 0x9B30581D) ^ 0xE5AD1795;
            if ((n2 ^ n) == -441641067) break block0;
            int cfr_ignored_0 = (0xD6433121 ^ n) + 967080986;
        }
        return hqt;
    }

    private static String[] qqac7azy1q2(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite j3puwssk09fz3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ f6cn5na ^ string.hashCode() ^ n2 + om43bfs9vr17 ^ i * -1666829183 ^ f6cn5na, 8) ^ om43bfs9vr17));
            }
            String[] stringArray = bhs_3.qqac7azy1q2(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

