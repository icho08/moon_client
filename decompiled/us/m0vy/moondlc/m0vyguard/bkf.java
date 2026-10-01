/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1297
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_1297;
import us.m0vy.moondlc.m0vyguard.ttt;

public class bkf
extends ttt {
    private final class_1297 sjh_2;
    private static final int qgqphpvsleu = -1383218828;
    private static final int j8z3om0vqaz5 = 1473364675;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int p7s5e51lj;

    @Generated
    public class_1297 khdl_2() {
        block0: {
            int n = 460386618;
            int n2 = (n = Integer.rotateLeft(n * -572392845, 28) ^ 0x3053EED2) ^ 0xAED11EE3;
            if ((n2 ^ n) == -1362026781) break block0;
            int cfr_ignored_0 = (0xB5A1EFD9 ^ n) + -1867450384;
        }
        return this.sjh_2;
    }

    @Generated
    public bkf(class_1297 class_12972) {
        this.sjh_2 = class_12972;
    }

    private static String[] m7ooe838upw(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite i5u7ncwe(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ qgqphpvsleu ^ string.hashCode()) + (n2 + j8z3om0vqaz5) + i ^ qgqphpvsleu, 17) + j8z3om0vqaz5);
            }
            String[] stringArray = bkf.m7ooe838upw(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

