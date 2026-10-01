/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;

public class bzs_2 {
    private final boolean jshdh;
    private final List rqgh;
    public static final bzs_2 blw;
    private static final int wpjqx2zm7yukx = -586739158;
    private static final int vrkz2z3q7w7 = -2099626986;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int eoijsg49atytl;

    public bzs_2(boolean bl, List list) {
        this.jshdh = bl;
        this.rqgh = list;
    }

    public boolean bts_4() {
        block0: {
            int n = 1762724508;
            int n2 = (n = Integer.rotateLeft(n * 518124925, 23) ^ 0xC2C639B3) ^ 0x6AB14B10;
            if ((n2 ^ n) == 1790003984) break block0;
            int cfr_ignored_0 = (0x3A0418C ^ n) + -290515631;
        }
        return this.jshdh;
    }

    public List shsr_2() {
        block0: {
            int n = 1479887986;
            n = Integer.rotateLeft(n * 1995870681, 4) ^ 0xAFCC5DA8;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xF90E6143;
            if ((n2 ^ n) == -116498109) break block0;
            int cfr_ignored_0 = (0xA13B2D31 ^ n) + 1440830460;
        }
        return this.rqgh;
    }

    private static String[] e2i9amr0gi22p(String string) {
        return string.split("\u0004\u0011", -1);
    }

    private static CallSite j11eku6hmqf(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ wpjqx2zm7yukx ^ string.hashCode() ^ n2 + vrkz2z3q7w7 ^ i * 564724019 ^ wpjqx2zm7yukx, 23) ^ vrkz2z3q7w7));
            }
            String[] stringArray = bzs_2.e2i9amr0gi22p(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

