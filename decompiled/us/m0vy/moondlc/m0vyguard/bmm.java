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
import us.m0vy.moondlc.m0vyguard.sf_2;

public final class bmm
extends Enum {
    public static final /* enum */ bmm thshth;
    public static final /* enum */ bmm rsw;
    public static final /* enum */ bmm jts;
    public static final /* enum */ bmm zst_4;
    public static final /* enum */ bmm djgh;
    public static final /* enum */ bmm syr;
    private final int dhzs_3;
    private static final bmm[] sdgh_2;
    private static final int btsh_2 = 1440238039;
    private static final int sbs = -384025987;
    private static final int v4axp2esq3eti = 1146933114;
    private static final int jrincoe = 1747834239;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";

    public static bmm[] values() {
        block0: {
            int n = sf_2.tjgh(1334431059);
            int n2 = n ^ 0x1EE78F4C;
            if ((n2 ^ n) == 518491980) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x516E421F ^ n, 13) - -524836612) * 1366180383;
        }
        return (bmm[])sdgh_2.clone();
    }

    public static bmm valueOf(String string) {
        block0: {
            int n = -766825859;
            int n2 = (n = Integer.rotateLeft(n * -361907915, 21) ^ 0x988D4CC1) ^ 0x1DD91F72;
            if ((n2 ^ n) == 500768626) break block0;
            int cfr_ignored_0 = (0xCF92350F ^ n) - -1025675061;
        }
        return Enum.valueOf(bmm.class, string);
    }

    @Generated
    public int getPriority() {
        block0: {
            int n = sf_2.tjgh(1514709073);
            n = Integer.rotateRight(System.identityHashCode((Object)this) ^ n, 13);
            int n2 = n ^ 0x87F42CBC;
            if ((n2 ^ n) == -2014040900) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xDDBC8CED ^ n, 14) - -567103506;
            int cfr_ignored_1 = (int)(0x1F0E22D027D4EB4FL ^ (long)n ^ 0xB8D0831A2DB993CDL);
        }
        return this.dhzs_3;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    @Generated
    private bmm() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.dhzs_3 = var3_2;
    }

    private static bmm[] $values() {
        int n = sf_2.tjgh(986175872);
        int n2 = n ^ 0x9D3A3D8B;
        if ((n2 ^ n) != -1657127541) {
            int cfr_ignored_0 = Integer.rotateRight(0xA7FDE40B ^ n, 7) + 1545354384;
        }
        bmm[] bmmArray = new bmm[2133766277 - 2133766271];
        bmmArray[0] = thshth;
        bmmArray[1] = rsw;
        bmmArray[2] = jts;
        bmmArray[3] = zst_4;
        bmmArray[4] = djgh;
        bmmArray[5] = syr;
        return bmmArray;
    }

    private static String[] rnu6uuwuf(String string) {
        block0: {
            int n = -1665093154;
            int n2 = (n = Integer.rotateLeft(n * -924820347, 6) ^ 0x3C075235) ^ 0xD233D7E0;
            if ((n2 ^ n) == -768354336) break block0;
            int cfr_ignored_0 = (0x4EF3663E ^ n) - 2016174871;
        }
        return string.split("\u0001\u001a", -1);
    }

    private static CallSite j3rvjw94w8acs2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1674386555;
            n3 = Integer.rotateLeft(n3 * 101188435, 13) ^ 0x4C410F26;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 5);
            String string3 = string2;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 20);
            int n4 = n3 ^ 0x64601BAF;
            if ((n4 ^ n3) != 1684020143) {
                int cfr_ignored_0 = (0xF852F82A ^ n3) + 140401373;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ btsh_2 ^ string.hashCode() ^ n2 + sbs ^ i * -1983976679 ^ btsh_2, 27) ^ sbs));
            }
            String[] stringArray = bmm.rnu6uuwuf(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType3) : lookup.findVirtual(clazz, stringArray[3], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] pb4l77s21k3b(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite htvpxgsll(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ v4axp2esq3eti ^ string.hashCode()) + (n2 + jrincoe) + i ^ v4axp2esq3eti, 27) + jrincoe);
            }
            String[] stringArray = bmm.pb4l77s21k3b(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

