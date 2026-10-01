/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_2596
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_2596;
import us.m0vy.moondlc.m0vyguard.ttt;

public class bksh
extends ttt {
    private final class_2596 bmgh;
    private static final int t0e0v0s = 500301392;
    private static final int zhxb3f7fx0x = -251537020;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int fpj5ipfq51;

    @Generated
    public class_2596 asw() {
        block0: {
            int n = -1683751273;
            n = Integer.rotateLeft(n * 1888107969, 21) ^ 0x8F989CB1;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xB1B8946A;
            if ((n2 ^ n) == -1313303446) break block0;
            int cfr_ignored_0 = (0x2A1B6AFD ^ n) - -1782744220;
        }
        return this.bmgh;
    }

    @Generated
    public bksh(class_2596 class_25962) {
        this.bmgh = class_25962;
    }

    private static String[] cl38cj1ili(String string) {
        return string.split("\u0005\u001f", -1);
    }

    private static CallSite pyzzqhhyo3u(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ t0e0v0s ^ string.hashCode() ^ n2 + zhxb3f7fx0x + i * -641881245) + t0e0v0s) ^ zhxb3f7fx0x));
            }
            String[] stringArray = bksh.cl38cj1ili(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

