/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;

public abstract class tjk {
    public static final short hs_3 = 1;
    public static final short bkhj = 2;
    public static final short dhwh_2 = 3;
    public static final short bhd = 4;
    public static final short has_3 = 5;
    public static final short thss_2 = 6;
    public static final short jrq = 7;
    private final int hdha_2;
    private static final int sj1wryg = -1650513760;
    private static final int ndsj85v5j5v = -1785577387;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int o154ed809jj3;

    public tjk(int n) {
        this.hdha_2 = n;
    }

    public int tghf() {
        block0: {
            int n = -585091518;
            n = Integer.rotateLeft(n * 456716651, 17) ^ 0x310076E;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x2D867F1C;
            if ((n2 ^ n) == 763789084) break block0;
            int cfr_ignored_0 = (0xF0A6495E ^ n) + -306318991;
        }
        return this.hdha_2;
    }

    private static String[] dwa4t6zl7(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite isepyy35hj3tw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ sj1wryg ^ string.hashCode() ^ n2 + ndsj85v5j5v ^ i * -553375545 ^ sj1wryg, 19) ^ ndsj85v5j5v));
            }
            String[] stringArray = tjk.dwa4t6zl7(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

