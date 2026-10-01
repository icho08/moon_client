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
import us.m0vy.moondlc.m0vyguard.ttk;

public class jr
extends ttk {
    private final int zry;
    private final int dhghgh;
    private static final int xvk142mky0i = 201265234;
    private static final int ugnk1ds = -851328049;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int q4ycerxtcopubz;

    @Generated
    public int tnq_2() {
        block0: {
            int n = 1435618013;
            n = Integer.rotateLeft(n * -1483128499, 10) ^ 0x9D5383DD;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 25);
            int n2 = n ^ 0xF55758E3;
            if ((n2 ^ n) == -178824989) break block0;
            int cfr_ignored_0 = (0xA0C6923E ^ n) - 1236142880;
        }
        return this.zry;
    }

    @Generated
    public int sth_7() {
        block0: {
            int n = -2044113895;
            int n2 = (n = Integer.rotateLeft(n * 897826247, 8) ^ 0xFF5DA774) ^ 0xB0D5E026;
            if ((n2 ^ n) == -1328160730) break block0;
            int cfr_ignored_0 = (0x36FCAC3F ^ n) + 2081393043;
        }
        return this.dhghgh;
    }

    @Generated
    public jr(int n, int n2) {
        this.zry = n;
        this.dhghgh = n2;
    }

    private static String[] e10w384x43a9f(String string) {
        return string.split("\u0003\u0010", -1);
    }

    private static CallSite hwooohkdoim9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ xvk142mky0i ^ string.hashCode() ^ n2 + ugnk1ds + i * 794225305) + xvk142mky0i) ^ ugnk1ds));
            }
            String[] stringArray = jr.e10w384x43a9f(new String(cArray));
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

