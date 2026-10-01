/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.ttt;

public class tbr
extends ttt {
    private final double thdq;
    private static final int exhm5ha5 = -738706455;
    private static final int kris1ek702 = -570499049;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int jy4jbzy2zrpt;

    @Generated
    public double shta() {
        block0: {
            int n = 280357884;
            n = Integer.rotateLeft(n * 98694411, 27) ^ 0x3419AB10;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 17);
            int n2 = n ^ 0xB9F255A9;
            if ((n2 ^ n) == -1175300695) break block0;
            int cfr_ignored_0 = (0xA947BE55 ^ n) + -2086257923;
        }
        return this.thdq;
    }

    @Generated
    public tbr(double d) {
        this.thdq = d;
    }

    private static String[] k08z8r1y25lv(String string) {
        return string.split("\u0001\u000e", -1);
    }

    private static CallSite gwom0u8vzxi8p6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ exhm5ha5 ^ string.hashCode() ^ n2 + kris1ek702 ^ i * -568548039 ^ exhm5ha5, 3) ^ kris1ek702));
            }
            String[] stringArray = tbr.k08z8r1y25lv(new String(cArray));
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

