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
import us.m0vy.moondlc.m0vyguard.zt;

public class bfq
extends zt {
    private static final bfq kham;
    private static final int o3r9crm = 1555999155;
    private static final int lgs0k9qxb6s = -1276167962;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int yo6k8f6zmfb1k5;

    @Generated
    public static bfq dhnh_2() {
        block0: {
            int n = -838964722;
            int n2 = (n = Integer.rotateLeft(n * -1652116345, 24) ^ 0xFB2C5DCE) ^ 0x33A84267;
            if ((n2 ^ n) == 866665063) break block0;
            int cfr_ignored_0 = (0xFE562869 ^ n) + -1626908871;
        }
        return kham;
    }

    private static String[] lwevw3ygjhscfh(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ki09b50e237(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ o3r9crm ^ string.hashCode()) + (n2 + lgs0k9qxb6s) + i ^ o3r9crm, 22) + lgs0k9qxb6s);
            }
            String[] stringArray = bfq.lwevw3ygjhscfh(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

