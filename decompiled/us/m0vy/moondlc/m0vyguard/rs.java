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
import us.m0vy.moondlc.m0vyguard.zq_2;

public class rs
extends zt {
    private static final rs bqsh;
    private static final int nfml8vt4zidk = -392646260;
    private static final int jgoltb1 = -1986370331;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int yd4q5zbb4;

    @Generated
    public static rs tt() {
        block0: {
            int n = zq_2.amr(235719901);
            int n2 = n ^ 0xB947D6BB;
            if ((n2 ^ n) == -1186474309) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xB74B1A66 ^ n, 9) - 913691029;
        }
        return bqsh;
    }

    private static String[] tj9w4hhm(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite rsfu9dbessctak(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ nfml8vt4zidk ^ string.hashCode()) + (n2 + jgoltb1) + i ^ nfml8vt4zidk, 25) + jgoltb1);
            }
            String[] stringArray = rs.tj9w4hhm(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

