/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.tjk;
import us.m0vy.moondlc.m0vyguard.zz_2;

public class dth_3
extends tjk {
    private final String rhd_3;
    private static final int gxy97q2w3xbk = -1989349992;
    private static final int f2blqtunfho7i = -1504470289;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int sg2trb5olwf9;

    public String getName() {
        block0: {
            int n = zz_2.jaa_3(678609997);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xFA6D7383;
            if ((n2 ^ n) == -93490301) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xD21FB7CE ^ n, 13) - 1983177005;
        }
        return this.rhd_3;
    }

    public dth_3(String string) {
        super(0xD087CE32 ^ 0xD087CE34);
        this.rhd_3 = string;
    }

    private static String[] yjmsfi7bsgpet(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite hc28v4k4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ gxy97q2w3xbk ^ string.hashCode() ^ n2 + f2blqtunfho7i + i * 364687523) + gxy97q2w3xbk) ^ f2blqtunfho7i));
            }
            String[] stringArray = dth_3.yjmsfi7bsgpet(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

