/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bhd_4;
import us.m0vy.moondlc.m0vyguard.tjk;

public class nj
extends tjk {
    private final bhd_4 shtgh_2;
    private static final int w9pon3xd2d30 = -208346898;
    private static final int w01q4c5p = 1049851292;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int g3vyzi4c;

    public nj(bhd_4 bhd2) {
        super(3);
        this.shtgh_2 = bhd2;
    }

    public bhd_4 jsgh_2() {
        block0: {
            int n = -1783312459;
            n = Integer.rotateLeft(n * -1371230295, 8) ^ 0xD03C6632;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 16);
            int n2 = n ^ 0x42C93668;
            if ((n2 ^ n) == 1120482920) break block0;
            int cfr_ignored_0 = (0xD77DF9DD ^ n) + 739700140;
        }
        return this.shtgh_2;
    }

    private static String[] fl4vnckz7burho(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite pw3xzh7ao(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ w9pon3xd2d30 ^ string.hashCode()) + (n2 + w01q4c5p) + i ^ w9pon3xd2d30, 3) + w01q4c5p);
            }
            String[] stringArray = nj.fl4vnckz7burho(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

