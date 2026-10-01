/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.tdhs;

public class shgh_3 {
    private static final int ogcb9qv = -1328079839;
    private static final int yw1q0cw1q = 1220708188;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int k191be5lp7yy;

    public static shgh_3 thma() {
        int n = 518570936;
        int n2 = (n = Integer.rotateLeft(n * 1849031737, 27) ^ 0xC01B73C0) ^ 0x314FB517;
        if ((n2 ^ n) != 827307287) {
            int cfr_ignored_0 = (0x2FA776AF ^ n) + 964799405;
        }
        return new shgh_3();
    }

    public boolean htw_2(Object object) {
        block0: {
            int n = tdhs.dygh(-1148329346);
            int n2 = n ^ 0x63573AE2;
            if ((n2 ^ n) == 1666661090) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xD8DAD89C ^ n, 14) - 1188944415) * -656746339;
        }
        return false;
    }

    private static String[] qyp3f1o3eto6s(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite wozn93ge7ru6i(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ogcb9qv ^ string.hashCode() ^ n2 + yw1q0cw1q + i * -751448309) + ogcb9qv) ^ yw1q0cw1q));
            }
            String[] stringArray = shgh_3.qyp3f1o3eto6s(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

