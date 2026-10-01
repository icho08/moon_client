/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  org.lwjgl.glfw.GLFW
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_310;
import org.lwjgl.glfw.GLFW;

public final class nk {
    private static final String rha_4 = " - You made the right choice";
    private static final long hkf = 95L;
    private static final long thbz = 45L;
    private static final long dhzgh = 1150L;
    private static final long dhmgh = 450L;
    private static int shh_2;
    private static boolean qn;
    private static long sds_2;
    private static String dah_4;
    private static final int k77b6wtrggtw4 = -1419907637;
    private static final int sf9jxh9p68i = -710143543;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int rg6vkj3f;

    private nk() {
    }

    public static void brth(class_310 class_3102) {
        if (class_3102 == null || class_3102.method_22683() == null) {
            return;
        }
        long l = System.currentTimeMillis();
        if (l < sds_2) {
            return;
        }
        String string = nk.azj();
        if (!string.equals(dah_4)) {
            GLFW.glfwSetWindowTitle((long)class_3102.method_22683().method_4490(), (CharSequence)string);
            dah_4 = string;
        }
        nk.rmj(l);
    }

    public static String azj() {
        int n = Math.max(0, Math.min(rha_4.length(), shh_2));
        return nk.thzsh() + rha_4.substring(0, n);
    }

    public static String thzsh() {
        return "Moondlc 2.0";
    }

    private static void rmj(long l) {
        if (!qn) {
            if (shh_2 < rha_4.length()) {
                ++shh_2;
                sds_2 = l + 95L;
                return;
            }
            qn = true;
            sds_2 = l + 1150L;
            return;
        }
        if (shh_2 > 0) {
            --shh_2;
            sds_2 = l + 45L;
            return;
        }
        qn = false;
        sds_2 = l + 450L;
    }

    private static String[] rlskutiyvut(String string) {
        return string.split("\u0004\u0012", -1);
    }

    private static CallSite j3xu3l8uk3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ k77b6wtrggtw4 ^ string.hashCode() ^ n2 + sf9jxh9p68i + i * -339407377) + k77b6wtrggtw4) ^ sf9jxh9p68i));
            }
            String[] stringArray = nk.rlskutiyvut(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
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

