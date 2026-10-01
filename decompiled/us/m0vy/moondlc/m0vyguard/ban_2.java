/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_2960;

public final class ban_2 {
    private static final int zj51zj8p583 = -956993604;
    private static final int earacm2ym = -1053539652;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int cv0bg5sgudivl;

    public class_2960 thwl() {
        block0: {
            int n = -657674544;
            n = Integer.rotateLeft(n * 127134567, 22) ^ 0x8AB9BE97;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xBD984973;
            if ((n2 ^ n) == -1114093197) break block0;
            int cfr_ignored_0 = (0x6554E7A3 ^ n) + 998805567;
        }
        return null;
    }

    private static String[] r9k90mqz(String string) {
        return string.split("\u0003\u001f", -1);
    }

    private static CallSite tq4ip9mc5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ zj51zj8p583 ^ string.hashCode() ^ n2 + earacm2ym + i * 2138375333) + zj51zj8p583) ^ earacm2ym));
            }
            String[] stringArray = ban_2.r9k90mqz(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
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

