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

public class tja
extends bkha_2 {
    private static final int be28l3j1 = -1729753108;
    private static final int olsozilxfmg = -1139096727;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int cdh29b91titzr3;

    public tja(byq byq2, byq byq3) {
        super(byq2, byq3, byq2, byq3);
    }

    @Override
    public tja tnq() {
        int n = -1645926236;
        n = Integer.rotateLeft(n * -1214098467, 17) ^ 0xA748AF42;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 19);
        int n2 = n ^ 0xF4EAAD6E;
        if ((n2 ^ n) != -185946770) {
            int cfr_ignored_0 = (0x690F85CA ^ n) - -1423743875;
        }
        return new tja(this.dghkh, this.rthn);
    }

    private static String[] w1g00q3m(String string) {
        return string.split("\u0004\u0018", -1);
    }

    private static CallSite hygo4uwd(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ be28l3j1 ^ string.hashCode()) + (n2 + olsozilxfmg) + i ^ be28l3j1, 25) + olsozilxfmg);
            }
            String[] stringArray = tja.w1g00q3m(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

