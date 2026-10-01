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
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bmsh;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.mh;

@tq_2(name="Nitro Firework", category=bzw.OTHER, desc="Extends firework boost strength while gliding")
public class ddh_3
extends bnq {
    private static final ddh_3 rtn_2;
    public final mh thshy = new mh();
    private static final int mx0rr3yj9 = 263483605;
    private static final int sfanitd6t9 = -344029488;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int lwlundbp0v;

    @Generated
    public static ddh_3 sdhth() {
        block0: {
            int n = bmsh.shdhd(1374020874);
            int n2 = n ^ 0xF3501E4D;
            if ((n2 ^ n) == -212853171) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xA2B5FB47 ^ n, 7) - -1201206060;
        }
        return rtn_2;
    }

    private static String[] fph0ra52bl1bk4(String string) {
        return string.split("\b\u0014", -1);
    }

    private static CallSite je4yo0004(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ mx0rr3yj9 ^ string.hashCode() ^ n2 + sfanitd6t9 ^ i * 202767575 ^ mx0rr3yj9, 23) ^ sfanitd6t9));
            }
            String[] stringArray = ddh_3.fph0ra52bl1bk4(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

