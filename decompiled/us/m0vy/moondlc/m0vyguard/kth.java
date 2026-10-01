/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWVidMode
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_310;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public class kth {
    private static long dhyd;
    private static int zghh_2;
    private static long ssht;
    private static final long jtt_2 = 1000000000L;
    private static final int lq0a9pl7 = 460058741;
    private static final int on96ijudvh = 1633428115;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int weegpnuifb02po;

    public static void zma_2() {
        long l = System.nanoTime();
        if (l - ssht >= 1000000000L) {
            ssht = l;
            class_310 class_3102 = class_310.method_1551();
            if (class_3102 != null && class_3102.method_22683() != null) {
                long l2 = class_3102.method_22683().method_4490();
                long l3 = GLFW.glfwGetWindowMonitor((long)l2);
                if (l3 == 0L) {
                    l3 = kth.tl(l2, class_3102.method_22683().method_4480(), class_3102.method_22683().method_4507());
                }
                if (l3 != dhyd) {
                    zghh_2 = kth.tzs_7(l3);
                    dhyd = l3;
                }
            }
        }
    }

    public static int tat_6() {
        return zghh_2;
    }

    private static long tl(long l, int n, int n2) {
        int[] nArray = new int[1];
        int[] nArray2 = new int[1];
        GLFW.glfwGetWindowPos((long)l, (int[])nArray, (int[])nArray2);
        int n3 = nArray[0] + n / 2;
        int n4 = nArray2[0] + n2 / 2;
        long l2 = GLFW.glfwGetPrimaryMonitor();
        PointerBuffer pointerBuffer = GLFW.glfwGetMonitors();
        if (pointerBuffer != null) {
            for (int i = 0; i < pointerBuffer.limit(); ++i) {
                long l3 = pointerBuffer.get(i);
                int[] nArray3 = new int[1];
                int[] nArray4 = new int[1];
                GLFW.glfwGetMonitorPos((long)l3, (int[])nArray3, (int[])nArray4);
                GLFWVidMode gLFWVidMode = GLFW.glfwGetVideoMode((long)l3);
                if (gLFWVidMode == null) continue;
                int n5 = gLFWVidMode.width();
                int n6 = gLFWVidMode.height();
                if (n3 < nArray3[0] || n3 >= nArray3[0] + n5 || n4 < nArray4[0] || n4 >= nArray4[0] + n6) continue;
                l2 = l3;
                break;
            }
        }
        return l2;
    }

    private static int tzs_7(long l) {
        GLFWVidMode gLFWVidMode = GLFW.glfwGetVideoMode((long)l);
        return gLFWVidMode != null ? gLFWVidMode.refreshRate() : 60;
    }

    private static String[] isutduya(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite hh7vut5l1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ lq0a9pl7 ^ string.hashCode() ^ n2 + on96ijudvh + i * 338054143) + lq0a9pl7) ^ on96ijudvh));
            }
            String[] stringArray = kth.isutduya(new String(cArray));
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

