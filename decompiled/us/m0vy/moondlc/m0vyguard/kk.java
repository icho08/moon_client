/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1661
 *  net.minecraft.class_1799
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.tzd_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class kk
extends tzd_2 {
    private static final int ocoz1fhjdkg = -550822776;
    private static final int e1u5f8xj9 = -254441395;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int v1sy3tp4lx;

    @Override
    public class_1799 bdy_2() {
        try {
            int n = -637099504;
            n = Integer.rotateLeft(n * -1632866663, 23) ^ 0x9ACA0BBB;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xA31F91D3;
            if ((n2 ^ n) != -1558212141) {
                int cfr_ignored_0 = (0x791933C3 ^ n) - -1173347527;
            }
            if ((0x3AE & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return kk.mc.field_1724 != null && kk.ashth(kk.mc.field_1724) != null ? (class_1799)kk.rhs_2((class_746)kk.mc.field_1724).field_7544.getFirst() : class_1799.field_8037;
    }

    @Override
    public int shd_5() {
        block0: {
            int n = -860713332;
            n = Integer.rotateLeft(n * 287879415, 18) ^ 0x649AE6EB;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xEA54DD7C;
            if ((n2 ^ n) == -363537028) break block0;
            int cfr_ignored_0 = (0x26E653F0 ^ n) - 489612362;
        }
        return -549503554 + 549503599;
    }

    private static class_1661 ashth(class_746 class_7462) {
        block0: {
            int n = 1950723338;
            n = Integer.rotateLeft(n * 1399116467, 21) ^ 0xC565E8C8;
            class_746 class_7463 = class_7462;
            n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 6);
            int n2 = n ^ 0x5EA9713C;
            if ((n2 ^ n) == 1588162876) break block0;
            int cfr_ignored_0 = (0x2AECDC36 ^ n) + -1752104410;
        }
        return class_7462.method_31548();
    }

    private static class_1661 rhs_2(class_746 class_7462) {
        block0: {
            int n = 807747873;
            n = Integer.rotateLeft(n * 1095936305, 10) ^ 0x674CCD06;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0xC9F4DAB7;
            if ((n2 ^ n) == -906700105) break block0;
            int cfr_ignored_0 = (0xF9D19B96 ^ n) - -292626482;
        }
        return class_7462.method_31548();
    }

    private static String[] fpx4xox080g(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite c2qzb45ax2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ocoz1fhjdkg ^ string.hashCode() ^ n2 + e1u5f8xj9 + i * -1856640059) + ocoz1fhjdkg) ^ e1u5f8xj9));
            }
            String[] stringArray = kk.fpx4xox080g(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

