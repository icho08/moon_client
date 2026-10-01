/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_2561
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWDropCallback
 *  org.lwjgl.glfw.GLFWDropCallbackI
 */
package us.m0vy.moondlc.m0vyguard;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import lombok.Generated;
import net.minecraft.class_2561;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWDropCallback;
import org.lwjgl.glfw.GLFWDropCallbackI;
import us.m0vy.moondlc.m0vyguard.bhdh;
import us.m0vy.moondlc.m0vyguard.bdhb;
import us.m0vy.moondlc.m0vyguard.bzh_4;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.movy.moondlc.Moondlc;

public final class btz
implements tthy {
    private static boolean thbgh;
    private static final int usk01nfbs = 221182236;
    private static final int s9nvz6t0szdkp = 418817471;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int rhp2ln7wxs064;

    public static void zt_4() {
        if (!thbgh) {
            thbgh = true;
            long l = mc.method_22683().method_4490();
            GLFWDropCallbackI[] gLFWDropCallbackIArray = new GLFWDropCallbackI[1];
            GLFWDropCallbackI gLFWDropCallbackI = (arg_0, arg_1, arg_2) -> btz.ald_2(gLFWDropCallbackIArray, arg_0, arg_1, arg_2);
            gLFWDropCallbackIArray[0] = GLFW.glfwSetDropCallback((long)l, (GLFWDropCallbackI)gLFWDropCallbackI);
        }
    }

    private static void akhq(String string) {
        try {
            File file = new File(string);
            if (!file.isFile()) {
                return;
            }
            if (!file.getName().endsWith(".moon")) {
                return;
            }
            File file2 = new File(bdhb.dhdhd_2);
            if (!file2.exists() && !file2.mkdirs()) {
                Moondlc.dhrn.error("Failed to create directory {}", (Object)file2.getAbsolutePath());
                return;
            }
            File file3 = new File(file2, file.getName());
            Files.copy(file.toPath(), file3.toPath(), StandardCopyOption.REPLACE_EXISTING);
            String string2 = file.getName().substring(0, file.getName().lastIndexOf(46));
            bhdh.khsb().rzs_4(string2);
            bzh_4.ttht_3(class_2561.method_30163((String)("Config " + string2 + " loaded")));
        }
        catch (Exception exception) {
            Moondlc.dhrn.error("Failed to load dropped config {}", (Object)string, (Object)exception);
        }
    }

    @Generated
    private btz() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static void ald_2(GLFWDropCallbackI[] gLFWDropCallbackIArray, long l, int n, long l2) {
        if (gLFWDropCallbackIArray[0] != null) {
            gLFWDropCallbackIArray[0].invoke(l, n, l2);
        }
        for (int i = 0; i < n; ++i) {
            String string = GLFWDropCallback.getName((long)l2, (int)i);
            btz.akhq(string);
        }
    }

    private static String[] w3idrqdbiq(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite gplo53vlh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ usk01nfbs ^ string.hashCode() ^ n2 + s9nvz6t0szdkp ^ i * 1883300501 ^ usk01nfbs, 8) ^ s9nvz6t0szdkp));
            }
            String[] stringArray = btz.w3idrqdbiq(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

