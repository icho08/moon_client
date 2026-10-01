/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bkha_2;
import us.m0vy.moondlc.m0vyguard.byq;

public class bshz
extends bkha_2 {
    private static final int ys0la9v = -1041214078;
    private static final int kj7dw3c = -1706785286;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int kvbqf0gnlfj;

    public bshz(byq byq2, byq byq3) {
        super(byq2, byq3, byq3, byq2);
    }

    @Override
    public bshz tnq() {
        int n = -1266379394;
        n = Integer.rotateLeft(n * -1330807707, 26) ^ 0x8903B14A;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 13);
        int n2 = n ^ 0x793D6692;
        if ((n2 ^ n) != 2034067090) {
            int cfr_ignored_0 = (0xCDB9F3EC ^ n) + 1712406235;
        }
        return new bshz(this.shhz, this.khkht_2);
    }

    private static String[] rwol42owiue0o(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ljym5v6ge5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ys0la9v ^ string.hashCode()) + (n2 + kj7dw3c) + i ^ ys0la9v, 4) + kj7dw3c);
            }
            String[] stringArray = bshz.rwol42owiue0o(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

