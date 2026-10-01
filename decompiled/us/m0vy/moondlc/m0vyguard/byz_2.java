/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bjn;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tq_2;

@tq_2(name="NoHurtCam", category=bzw.OTHER, desc="Disables hurt camera shake effect")
public class byz_2
extends bnq {
    private static byz_2 qr;
    private static final int kc43qgvw6 = -878036332;
    private static final int z7mqz9xt78zs = -1685365014;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int fub235foi04gi5;

    public static byz_2 khss() {
        block0: {
            int n = bjn.snkh(-659552279);
            int n2 = n ^ 0x750B1CA5;
            if ((n2 ^ n) == 1963662501) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xADBB1B4C ^ n, 8) - 235269487;
        }
        return qr;
    }

    public byz_2() {
        qr = this;
    }

    private static String[] f1alws266auqmz(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite yd0yczar2i5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ kc43qgvw6 ^ string.hashCode() ^ n2 + z7mqz9xt78zs ^ i * 409881367 ^ kc43qgvw6, 16) ^ z7mqz9xt78zs));
            }
            String[] stringArray = byz_2.f1alws266auqmz(new String(cArray));
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

