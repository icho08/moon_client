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

@tq_2(name="NameProtect", category=bzw.OTHER, desc="Protects your username in rendered text")
public class tjsh
extends bnq {
    private static final int g9u8d9ucui66 = 1668408423;
    private static final int k6vmzxognu4fz = 259881295;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int dk06u520l2t;

    public tjsh() {
        this.sdhdh(true);
    }

    public String thbw(String string) {
        block0: {
            int n = 1206118575;
            n = Integer.rotateLeft(n * -159236797, 16) ^ 0x6038264B;
            n = System.identityHashCode(this) ^ n;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x37A4B74B;
            if ((n2 ^ n) == 933541707) break block0;
            int cfr_ignored_0 = (0x70475FE4 ^ n) + -2122703178;
        }
        return string;
    }

    private static String[] lqlkuqgby(String string) {
        return string.split("\u0003\u0017", -1);
    }

    private static CallSite d2axnbmzq9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ g9u8d9ucui66 ^ string.hashCode() ^ n2 + k6vmzxognu4fz ^ i * -574998051 ^ g9u8d9ucui66, 23) ^ k6vmzxognu4fz));
            }
            String[] stringArray = tjsh.lqlkuqgby(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

