/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_5611
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_5611;
import us.m0vy.moondlc.m0vyguard.bbf;
import us.m0vy.moondlc.m0vyguard.tdha;

public final class jb
implements tdha {
    private static final int wy2r205flko = 1243094771;
    private static final int i8kkb033t = 164685478;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int yhxvfp7qf5;

    public static boolean adb_2(double d, double d2, double d3, double d4, int n, int n2) {
        return (double)n >= d && (double)n < d + d3 && (double)n2 >= d2 && (double)n2 < d2 + d4;
    }

    public static boolean zlr(double d, double d2, double d3, double d4, bbf bbf2) {
        return jb.adb_2(d, d2, d3, d4, bbf2.getMouseX(), bbf2.getMouseY());
    }

    public static boolean hbf(double d, double d2, double d3, double d4, double d5, double d6) {
        return d5 >= d && d5 < d + d3 && d6 >= d2 && d6 < d2 + d4;
    }

    public static class_5611 kz_2(double d) {
        return new class_5611((float)(jb.mc.field_1729.method_1603() / d), (float)(jb.mc.field_1729.method_1604() / d));
    }

    @Generated
    private jb() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String[] cjp47fxgjyz(String string) {
        return string.split("\u0007\u0014", -1);
    }

    private static CallSite iiadvgv4qw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ wy2r205flko ^ string.hashCode() ^ n2 + i8kkb033t ^ i * 353783669 ^ wy2r205flko, 3) ^ i8kkb033t));
            }
            String[] stringArray = jb.cjp47fxgjyz(new String(cArray));
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

