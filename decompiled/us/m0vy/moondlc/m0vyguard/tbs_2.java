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
import us.m0vy.moondlc.m0vyguard.shth_5;

public final class tbs_2
extends Record {
    private final Runnable dhjgh;
    private static final int bnh_2 = -2033899011;
    private static final int tghz = 715674882;
    private static final int unxqtxy2902p = -977252333;
    private static final int kcid749426ow = -12636539;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int j408yzldn;

    public tbs_2(Runnable runnable) {
        this.dhjgh = runnable;
    }

    public void unsubscribe() {
        int n = shth_5.tjy_2(1521290327);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x23B337BD;
        if ((n2 ^ n) != 598947773) {
            int cfr_ignored_0 = Integer.rotateRight(0x791E3BEA ^ n, 18) + -1358503791;
        }
        this.dhjgh.run();
    }

    @Override
    public final String toString() {
        block0: {
            int n = shth_5.tjy_2(1442198252);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x23108135;
            if ((n2 ^ n) == 588284213) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x76E6B3D9 ^ n, 17) + 1783457410) * 1994830809;
            int cfr_ignored_1 = (int)(0xB4541DE427D4EB4FL ^ (long)n ^ 0xC6B8831A2DB8C579L);
        }
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{tbs_2.class, "action", "ذجغ"}, this);
    }

    @Override
    public final int hashCode() {
        block0: {
            int n = -1396614077;
            n = Integer.rotateLeft(n * -1242054557, 4) ^ 0xD94D8699;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 5);
            int n2 = n ^ 0x36453D7F;
            if ((n2 ^ n) == 910507391) break block0;
            int cfr_ignored_0 = (0x9A84613C ^ n) + 1109472859;
        }
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{tbs_2.class, "action", "ذجغ"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        block0: {
            int n = -896363951;
            n = Integer.rotateLeft(n * -704563785, 14) ^ 0x1B286A48;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 21);
            Object object2 = object;
            n = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 22);
            int n2 = n ^ 0x88B1E8D7;
            if ((n2 ^ n) == -2001606441) break block0;
            int cfr_ignored_0 = (0x42237A86 ^ n) + -154908520;
        }
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{tbs_2.class, "action", "ذجغ"}, this, object);
    }

    public Runnable action() {
        block0: {
            int n = 304918084;
            n = Integer.rotateLeft(n * -424498181, 9) ^ 0xF2F8ABBD;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8DA99E71;
            if ((n2 ^ n) == -1918263695) break block0;
            int cfr_ignored_0 = (0x9F853035 ^ n) - 463251682;
        }
        return this.dhjgh;
    }

    private static String[] xl8344ciwckyvi(String string) {
        block0: {
            int n = shth_5.tjy_2(1411310850);
            int n2 = n ^ 0x5E1EF41C;
            if ((n2 ^ n) == 1579086876) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xA00111E ^ n, 4) - 979349981) * 167776543;
        }
        return string.split("\u0002\u0019", -1);
    }

    private static CallSite nno8v5e0y(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 73354547;
            n3 = Integer.rotateLeft(n3 * -1406612559, 10) ^ 0x56E777BD;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 12);
            String string4 = string2;
            n3 = Integer.rotateLeft((string4 != null ? System.identityHashCode(string4) : 0) ^ n3, 13);
            int n4 = n3 ^ 0xDB0F700;
            if ((n4 ^ n3) != 229701376) {
                int cfr_ignored_0 = (0x9EFBA33 ^ n3) + -2115195012;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ bnh_2 ^ string.hashCode() ^ n2 + tghz + i * 1371036869) + bnh_2) ^ tghz));
            }
            String[] stringArray = tbs_2.xl8344ciwckyvi(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] d8crnlwe0o6p(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ptrgn2x6snsa(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ unxqtxy2902p ^ string.hashCode() ^ n2 + kcid749426ow + i * -242308707) + unxqtxy2902p) ^ kcid749426ow));
            }
            String[] stringArray = tbs_2.d8crnlwe0o6p(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

