/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import us.m0vy.moondlc.m0vyguard.bthn;
import us.m0vy.moondlc.m0vyguard.kn;

public final class bths_2
extends Record {
    private final bthn zhn_2;
    private final List jwt;
    private static final int kxi0igzq3c = -1841378458;
    private static final int t3ckwcodp97 = -243476303;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ymco0u4pua;

    public bths_2(bthn bthn2, List list) {
        this.zhn_2 = bthn2;
        this.jwt = list;
    }

    @Override
    public final String toString() {
        block0: {
            int n = 491726615;
            n = Integer.rotateLeft(n * 926294759, 24) ^ 0xADE4E580;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x613A3546;
            if ((n2 ^ n) == 1631204678) break block0;
            int cfr_ignored_0 = (0x7C751251 ^ n) - 818983355;
        }
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bths_2.class, "command;arguments", "زهن", "جوت"}, this);
    }

    @Override
    public final int hashCode() {
        block0: {
            int n = -794502331;
            n = Integer.rotateLeft(n * -1050786855, 28) ^ 0x5CE717CA;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x495AA9D;
            if ((n2 ^ n) == 76917405) break block0;
            int cfr_ignored_0 = (0xD43171D8 ^ n) + -463409674;
        }
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bths_2.class, "command;arguments", "زهن", "جوت"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        block0: {
            int n = kn.sqs_2(-1614173701);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 13);
            Object object2 = object;
            n = Integer.rotateLeft((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 27);
            int n2 = n ^ 0x785F137D;
            if ((n2 ^ n) == 2019496829) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xE796BA86 ^ n, 15) - 262026613;
        }
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bths_2.class, "command;arguments", "زهن", "جوت"}, this, object);
    }

    public bthn command() {
        block0: {
            int n = kn.sqs_2(1586984868);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
            int n2 = n ^ 0x973E9B6E;
            if ((n2 ^ n) == -1757504658) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xC9A9ECCA ^ n, 12) + 1878084529;
        }
        return this.zhn_2;
    }

    public List arguments() {
        block0: {
            int n = kn.sqs_2(1830228772);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 21);
            int n2 = n ^ 0xF6677AD8;
            if ((n2 ^ n) == -160990504) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x9B7069FC ^ n, 6) - -688229185) * -1687131651;
        }
        return this.jwt;
    }

    private static String[] c90h1wsubcw(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite h5c2qunlb(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ kxi0igzq3c ^ string.hashCode() ^ n2 + t3ckwcodp97 + i * 931321905) + kxi0igzq3c) ^ t3ckwcodp97));
            }
            String[] stringArray = bths_2.c90h1wsubcw(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

