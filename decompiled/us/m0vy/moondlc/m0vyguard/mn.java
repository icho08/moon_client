/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;

public class mn {
    private final Object zsz_2;
    private final Object shdh_2;
    private static final int lee1b9tkt5 = 1474898219;
    private static final int w0u996g4 = 885442306;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int zvrzjii3dd4rn;

    public mn(Object object, Object object2) {
        this.zsz_2 = object;
        this.shdh_2 = object2;
    }

    public Object thash_2() {
        block0: {
            int n = -1068716416;
            n = Integer.rotateLeft(n * -1994024437, 8) ^ 0xD36037F0;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xA6F285FD;
            if ((n2 ^ n) == -1494055427) break block0;
            int cfr_ignored_0 = (0x66BE2B7D ^ n) + -2133074407;
        }
        return this.zsz_2;
    }

    public Object tsa_3() {
        block0: {
            int n = -867821978;
            int n2 = (n = Integer.rotateLeft(n * -622786719, 6) ^ 0x1CA1C79A) ^ 0xD495A0C1;
            if ((n2 ^ n) == -728391487) break block0;
            int cfr_ignored_0 = (0x18D3B6A7 ^ n) - 606944378;
        }
        return this.shdh_2;
    }

    private static String[] cmup7i9sjmr83v(String string) {
        return string.split("\u0007\u000e", -1);
    }

    private static CallSite i6furaewo6l5e(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ lee1b9tkt5 ^ string.hashCode()) + (n2 + w0u996g4) + i ^ lee1b9tkt5, 9) + w0u996g4);
            }
            String[] stringArray = mn.cmup7i9sjmr83v(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

