/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import us.m0vy.moondlc.m0vyguard.rw;

public final class tdy {
    private static final int f57hp4bpvuahe = -654280404;
    private static final int vkhny2do6aby = -86483757;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int hbrvrcm3enp;

    private tdy() {
    }

    public static float rfw(class_243 class_2432, class_1657 class_16572) {
        block0: {
            int n = rw.dhkhn(-400770376);
            int n2 = n ^ 0x164E8303;
            if ((n2 ^ n) == 374244099) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xFE5239BB ^ n, 18) + -799892256) * -28165701;
        }
        return 0.0f;
    }

    private static String[] zzxikctm(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite i3vgzb5n(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ f57hp4bpvuahe ^ string.hashCode() ^ n2 + vkhny2do6aby ^ i * 322357011 ^ f57hp4bpvuahe, 26) ^ vkhny2do6aby));
            }
            String[] stringArray = tdy.zzxikctm(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

