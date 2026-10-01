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
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.tq_2;

@tq_2(name="InvUtils", category=bzw.OTHER, desc="Provides inventory scrolling and slot locking")
public class bha_2
extends bnq {
    private static final int gdy2q8zo9 = 1311333978;
    private static final int nsyjxfbkt7 = 426373040;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int gjth80tsbh;

    public bha_2() {
        this.sdhdh(true);
    }

    public s_3 shdt_4() {
        return null;
    }

    public tay shjt() {
        return null;
    }

    public s_3 zzj() {
        block0: {
            int n = 1229545381;
            n = Integer.rotateLeft(n * -1040711197, 23) ^ 0xCF859594;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xDF0587C1;
            if ((n2 ^ n) == -553285695) break block0;
            int cfr_ignored_0 = (0x964CD864 ^ n) - 243435022;
        }
        return null;
    }

    public boolean shskh_2(int n) {
        block0: {
            int n2 = -1953478126;
            n2 = Integer.rotateLeft(n2 * -1447152311, 23) ^ 0x8D87F6AB;
            n2 = System.identityHashCode(this) ^ n2;
            int n3 = (n2 = n ^ n2) ^ 0xDABF84A2;
            if ((n3 ^ n2) == -624982878) break block0;
            int cfr_ignored_0 = (0x512FCEB0 ^ n2) - -2039065123;
        }
        return false;
    }

    private static String[] e5q8o6mbdby4o4(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite iv4j9f98f(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ gdy2q8zo9 ^ string.hashCode() ^ n2 + nsyjxfbkt7 + i * 872676041) + gdy2q8zo9) ^ nsyjxfbkt7));
            }
            String[] stringArray = bha_2.e5q8o6mbdby4o4(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

