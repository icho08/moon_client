/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.tthy;

public class d_2
implements tthy {
    private static final int d5mpffr = 368436597;
    private static final int rjwagn8svl7 = 1242210189;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int z8xczxfn;

    public void zhl_3() {
        block0: {
            int n = 1726347823;
            n = Integer.rotateLeft(n * 458769713, 19) ^ 0x16BC478;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xEEC340C2;
            if ((n2 ^ n) == -289193790) break block0;
            int cfr_ignored_0 = (0x8826BAED ^ n) + 1265911889;
        }
    }

    private static String[] gbi71qj8gy(String string) {
        return string.split("\u0006\u0011", -1);
    }

    private static CallSite lcte8lf4fpj(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ d5mpffr ^ string.hashCode() ^ n2 + rjwagn8svl7 + i * -2131424599) + d5mpffr) ^ rjwagn8svl7));
            }
            String[] stringArray = d_2.gbi71qj8gy(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

