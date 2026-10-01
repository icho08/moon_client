/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import us.m0vy.moondlc.m0vyguard.bath_2;
import us.m0vy.moondlc.m0vyguard.taj;
import us.m0vy.moondlc.m0vyguard.yf;

public class bwt
extends bath_2 {
    private static final int dhhd_4 = 360372956;
    private static final int ma = -1519443540;
    private static final int s6jws8qz8x7bx = 1238172779;
    private static final int vdgbjd5n4cc1 = -1170497276;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int oxd0gki8a556pz;

    public bwt() {
        super("Basic");
    }

    @Override
    public taj jddh_2(taj taj2, taj taj3, class_243 class_2432, class_1297 class_12972) {
        block0: {
            int n = 621004135;
            n = Integer.rotateLeft(n * -1755212913, 28) ^ 0xE19C4AB3;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 21);
            taj taj4 = taj3;
            n = (taj4 != null ? System.identityHashCode(taj4) : 0) ^ n;
            int n2 = n ^ 0x436756B7;
            if ((n2 ^ n) == 1130845879) break block0;
            int cfr_ignored_0 = (0x666493D0 ^ n) - -1745762953;
        }
        return taj3;
    }

    private static String shshgh(String string, int n, int n2, int n3) {
        try {
            int n4 = 461126420;
            n4 = Integer.rotateLeft(n4 * 22491489, 20) ^ 0x73349299;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 5);
            n4 = n2 ^ n4;
            int n5 = n4 ^ 0xD5EBA8DA;
            if ((n5 ^ n4) != -705976102) {
                int cfr_ignored_0 = (0xCE9793CE ^ n4) + 1583057194;
            }
            if ((0x2C6 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x9AC7B9 ^ n2 - i) + ma, 11) ^ dhhd_4 + i * 1357597491));
        }
        return new String(cArray);
    }

    private static String[] b8aokor3g(String string) {
        return string.split("\u0003\u0012", -1);
    }

    private static CallSite we52fmy45r237(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ s6jws8qz8x7bx ^ string.hashCode()) + (n2 + vdgbjd5n4cc1) + i ^ s6jws8qz8x7bx, 21) + vdgbjd5n4cc1);
            }
            String[] stringArray = bwt.b8aokor3g(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

