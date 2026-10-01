/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_243
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Collections;
import java.util.List;
import lombok.Generated;
import net.minecraft.class_243;
import us.m0vy.moondlc.m0vyguard.ttk;

public class bdz_2
extends ttk {
    private final List tshl;
    private final class_243 ddh_8;
    private static final int thwh_2 = 9765564;
    private static final int tys = 1357692489;
    private static final int vdraq49lgui = 82004280;
    private static final int u2u5tso8z25 = -1851659468;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int nq6n58nx8ea;

    public bdz_2(List list, class_243 class_2432) {
        this.tshl = Collections.unmodifiableList(list);
        this.ddh_8 = class_2432;
    }

    @Generated
    public List khhd_2() {
        block0: {
            int n = 878259223;
            int n2 = (n = Integer.rotateLeft(n * -1510988799, 26) ^ 0x9288167C) ^ 0x8052A2E0;
            if ((n2 ^ n) == -2142068000) break block0;
            int cfr_ignored_0 = (0xB40B8EF7 ^ n) - -1092365743;
        }
        return this.tshl;
    }

    @Generated
    public class_243 ba_2() {
        block0: {
            int n = 71720033;
            n = Integer.rotateLeft(n * 1610249389, 15) ^ 0x2ACA83BD;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0x5315D911;
            if ((n2 ^ n) == 1393940753) break block0;
            int cfr_ignored_0 = (0x57538570 ^ n) - 43232894;
        }
        return this.ddh_8;
    }

    private static String[] ghd(String string) {
        int n = 1630325594;
        int n2 = (n = Integer.rotateLeft(n * -1633957899, 6) ^ 0x9178D7) ^ 0x3CD86345;
        if ((n2 ^ n) != 1020814149) {
            int cfr_ignored_0 = (0x5DF4A81F ^ n) - 637900280;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite drq_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1345823242;
            n3 = Integer.rotateLeft(n3 * 1198076379, 16) ^ 0xD8F788B6;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 6);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x1B27B5FB;
            if ((n4 ^ n3) != 455587323) {
                int cfr_ignored_0 = (0xB4EFE80D ^ n3) - -239102619;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ thwh_2 ^ string.hashCode()) + (n2 + tys) + i ^ thwh_2, 14) + tys);
            }
            String[] stringArray = bdz_2.ghd(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] khgck5ggp6jk8(String string) {
        return string.split("\u0005\u001a", -1);
    }

    private static CallSite sy3c0zzqe4ecz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ vdraq49lgui ^ string.hashCode()) + (n2 + u2u5tso8z25) + i ^ vdraq49lgui, 13) + u2u5tso8z25);
            }
            String[] stringArray = bdz_2.khgck5ggp6jk8(new String(cArray));
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

