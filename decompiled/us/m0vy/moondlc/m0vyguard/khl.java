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

public final class khl {
    private static final int ieojzj518p = 112736758;
    private static final int abt5iclbi = -1415299730;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int qu38oe6255w1hh;

    public static int skr_2(int n) {
        return n >> 16 & 0xFF;
    }

    public static int ddq(int n) {
        return n >> 8 & 0xFF;
    }

    public static int ghdsh(int n) {
        return n & 0xFF;
    }

    public static int ztha_2(int n) {
        return n >> 24 & 0xFF;
    }

    public static float thth_8(int n) {
        return (float)khl.skr_2(n) / 255.0f;
    }

    public static float khtz(int n) {
        return (float)khl.ddq(n) / 255.0f;
    }

    public static float zay_2(int n) {
        return (float)khl.ghdsh(n) / 255.0f;
    }

    public static float tghsh_2(int n) {
        return (float)khl.ztha_2(n) / 255.0f;
    }

    public static int[] thghz(int n) {
        return new int[]{khl.skr_2(n), khl.ddq(n), khl.ghdsh(n), khl.ztha_2(n)};
    }

    public static int[] shdhdh(int n) {
        return new int[]{khl.skr_2(n), khl.ddq(n), khl.ghdsh(n)};
    }

    public static float[] thagh_2(int n) {
        return new float[]{khl.thth_8(n), khl.khtz(n), khl.zay_2(n), khl.tghsh_2(n)};
    }

    public static float[] shza(int n) {
        return new float[]{khl.thth_8(n), khl.khtz(n), khl.zay_2(n)};
    }

    @Generated
    private khl() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String[] aefsbg4dxz3rh(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite p05wvehv8h(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ieojzj518p ^ string.hashCode()) + (n2 + abt5iclbi) + i ^ ieojzj518p, 5) + abt5iclbi);
            }
            String[] stringArray = khl.aefsbg4dxz3rh(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

