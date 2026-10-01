/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tq_2;

@tq_2(name="NoInteract", category=bzw.OTHER, desc="Blocks selected interactions with world objects")
public class bkhgh
extends bnq {
    private static final int hilyli01tf = 846086433;
    private static final int a7r5waa = 1631494499;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int o5ou601rs;

    public bkhgh() {
        this.sdhdh(true);
    }

    public boolean zjr_2(Object object) {
        block0: {
            int n = -2036171563;
            n = Integer.rotateLeft(n * 1872989255, 13) ^ 0x2B5B8DE1;
            n = System.identityHashCode(this) ^ n;
            Object object2 = object;
            n = (object2 != null ? System.identityHashCode(object2) : 0) ^ n;
            int n2 = n ^ 0xC8612742;
            if ((n2 ^ n) == -933157054) break block0;
            int cfr_ignored_0 = (0x4EC35B97 ^ n) - 1212719374;
        }
        return false;
    }

    private static String[] l5p32urn(String string) {
        return string.split("\u0005\u0014", -1);
    }

    private static CallSite s361z28yu(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ hilyli01tf ^ string.hashCode()) + (n2 + a7r5waa) + i ^ hilyli01tf, 8) + a7r5waa);
            }
            String[] stringArray = bkhgh.l5p32urn(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

