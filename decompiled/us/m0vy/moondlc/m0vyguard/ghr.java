/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Pointer
 *  com.sun.jna.platform.win32.WinDef$DWORD
 *  com.sun.jna.platform.win32.WinDef$HWND
 *  net.minecraft.class_1041
 *  net.minecraft.class_310
 *  org.lwjgl.glfw.GLFWNativeWin32
 */
package us.m0vy.moondlc.m0vyguard;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1041;
import net.minecraft.class_310;
import org.lwjgl.glfw.GLFWNativeWin32;
import us.m0vy.moondlc.m0vyguard.btt_4;
import us.m0vy.moondlc.m0vyguard.bls;
import us.m0vy.moondlc.m0vyguard.yf;

public final class ghr {
    private static final int khthw = 0;
    private static final int dhrj = 1;
    private static final int dfgh = 17;
    private static final int tzd_3 = 405552095;
    private static final int tzth = -72477967;
    private static final int rsdh_2 = -915478212;
    private static final int dghr = -1733913286;
    private static final int jn8e5d8ey1 = 384112920;
    private static final int le1jjiq = -776679398;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int zmu6wy3pv9c;

    private ghr() {
    }

    public static boolean dwth_2() {
        block0: {
            int n = 1702077794;
            int n2 = (n = Integer.rotateLeft(n * -360163725, 6) ^ 0x38A25DDA) ^ 0x546DD04B;
            if ((n2 ^ n) == 1416482891) break block0;
            int cfr_ignored_0 = (0x311E7529 ^ n) + -2062741138;
        }
        return ghr.ddb_4(Integer.reverse(259298503) ^ 0xE3292EE1, true);
    }

    public static boolean rry() {
        block0: {
            int n = bls.zfb(-1023927138);
            int n2 = n ^ 0x9DDA43E7;
            if ((n2 ^ n) == -1646640153) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x5F225F79 ^ n, 14) + -1987629342) * 1596088185;
            int cfr_ignored_1 = (int)(0x9D90F14427D4EB4FL ^ (long)n ^ 0x1FF8831A2DB896F0L);
        }
        return ghr.ddb_4(1, false);
    }

    private static boolean ddb_4(int n, boolean bl) {
        int n2 = 1664447281;
        n2 = Integer.rotateLeft(n2 * 1130332345, 16) ^ 0x474C29D0;
        int n3 = (n2 = bl ^ n2) ^ 0x8C48FAE8;
        if ((n3 ^ n2) != -1941374232) {
            int cfr_ignored_0 = (0xEF7D89D9 ^ n2) + -1993810267;
        }
        if (!ghr.sdd_4()) {
            return false;
        }
        WinDef.HWND hWND = ghr.ttn_3();
        if (hWND == null) {
            return false;
        }
        if (btt_4.INSTANCE.SetWindowDisplayAffinity(hWND, new WinDef.DWORD((long)n))) {
            return true;
        }
        return bl && btt_4.INSTANCE.SetWindowDisplayAffinity(hWND, new WinDef.DWORD(1L));
    }

    public static boolean tbd_3() {
        int n = 98508842;
        int n2 = (n = Integer.rotateLeft(n * -1723256041, 27) ^ 0xC8190D09) ^ 0x527AB5F8;
        if ((n2 ^ n) != 1383773688) {
            int cfr_ignored_0 = (0x57A595D2 ^ n) + -855804574;
        }
        if (!ghr.thdm()) {
            return false;
        }
        WinDef.HWND hWND = ghr.ttn_3();
        if (hWND == null) {
            return false;
        }
        return btt_4.INSTANCE.SetWindowDisplayAffinity(hWND, new WinDef.DWORD(0L));
    }

    private static WinDef.HWND ttn_3() {
        try {
            int n = 493138734;
            n = Integer.rotateLeft(n * -2085399459, 9) ^ 0x46E87E0B;
            int n2 = n ^ 0x8FBD8C36;
            if ((n2 ^ n) != -1883403210) {
                int cfr_ignored_0 = (0x92D93F18 ^ n) - -1511092508;
            }
            if ((0x3BA & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102 == null || ghr.rfh(class_3102) == null) {
            return null;
        }
        long l = class_3102.method_22683().method_4490();
        if (l == 0L) {
            return null;
        }
        long l2 = ghr.shz_6(l);
        return l2 == 0L ? null : new WinDef.HWND(Pointer.createConstant((long)l2));
    }

    private static boolean ghal() {
        try {
            int n = -1307179545;
            n = Integer.rotateLeft(n * -1754445195, 11) ^ 0xDCC3C3FF;
            int n2 = n ^ 0xE0E6CE77;
            if ((n2 ^ n) != -521744777) {
                int cfr_ignored_0 = (0x52F0CB90 ^ n) + -2074071010;
            }
            if ((0x37F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return System.getProperty("os.name", "").toLowerCase().contains("windows");
    }

    private static String rdf_2(String string, int n, int n2, int n3) {
        int n4 = -1790217685;
        n4 = Integer.rotateLeft(n4 * -2020351569, 25) ^ 0x1E262908;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 28)) ^ 0x15B1E92D;
        if ((n5 ^ n4) != 363981101) {
            int cfr_ignored_0 = (0x80FA9B06 ^ n4) - 2068666101;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0xB1BBB7B1) + n2 ^ i * 625934209) ^ tzd_3) + tzth);
        }
        return new String(cArray);
    }

    private static boolean sdd_4() {
        block0: {
            int n = -1286208016;
            int n2 = (n = Integer.rotateLeft(n * -936779507, 19) ^ 0x9319E193) ^ 0xFB5F5DD;
            if ((n2 ^ n) == 263583197) break block0;
            int cfr_ignored_0 = (0xBCE3F02D ^ n) - 200503427;
        }
        return ghr.ghal();
    }

    private static boolean thdm() {
        block0: {
            int n = -236484943;
            int n2 = (n = Integer.rotateLeft(n * 1573937511, 14) ^ 0x67A53123) ^ 0x80D330CA;
            if ((n2 ^ n) == -2133643062) break block0;
            int cfr_ignored_0 = (0x7134B67B ^ n) + -953394122;
        }
        return ghr.ghal();
    }

    private static class_1041 rfh(class_310 class_3102) {
        block0: {
            int n = bls.zfb(1060437573);
            class_310 class_3103 = class_3102;
            n = Integer.rotateLeft((class_3103 != null ? System.identityHashCode(class_3103) : 0) ^ n, 3);
            int n2 = n ^ 0x47948CF3;
            if ((n2 ^ n) == 1200917747) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x78A072B6 ^ n, 18) - -1614052539) * 2023781047;
        }
        return class_3102.method_22683();
    }

    private static long shz_6(long l) {
        block0: {
            int n = 1064023578;
            n = Integer.rotateLeft(n * 1577103807, 12) ^ 0x66F318EB;
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 24)) ^ 0x236FF0D4;
            if ((n2 ^ n) == 594538708) break block0;
            int cfr_ignored_0 = (0x1C0446CE ^ n) - -1797015662;
        }
        return GLFWNativeWin32.glfwGetWin32Window((long)l);
    }

    private static String jghd_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bls.zfb(293409868);
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 27);
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 17)) ^ 0x1D47FF88;
            if ((n5 ^ n4) == 491257736) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xC3AEBC4 ^ n4, 4) - 2139106295;
        }
        return ghr.rdf_2(string, n, n2, n3);
    }

    private static String[] sdb_4(String string) {
        int n = 1648572082;
        int n2 = (n = Integer.rotateLeft(n * 1697980361, 16) ^ 0xC46E5827) ^ 0x883AB3C9;
        if ((n2 ^ n) != -2009418807) {
            int cfr_ignored_0 = (0xEA79857B ^ n) + 1331648522;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite tfdh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -283116899;
            n3 = Integer.rotateLeft(n3 * -34025761, 11) ^ 0xAFAD9AE6;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 24);
            int n4 = n3 ^ 0xA3A458B2;
            if ((n4 ^ n3) != -1549510478) {
                int cfr_ignored_0 = (0x4CBBA22F ^ n3) - 740100845;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ rsdh_2 ^ string.hashCode() ^ n2 + dghr ^ i * -261756255 ^ rsdh_2, 3) ^ dghr));
            }
            String[] stringArray = ghr.sdb_4(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] f44z9bm4q(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite mtgj48kph(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ jn8e5d8ey1 ^ string.hashCode()) + (n2 + le1jjiq) + i ^ jn8e5d8ey1, 11) + le1jjiq);
            }
            String[] stringArray = ghr.f44z9bm4q(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

