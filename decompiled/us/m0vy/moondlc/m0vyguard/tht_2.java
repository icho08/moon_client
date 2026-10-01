/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Pointer
 *  com.sun.jna.platform.win32.WinDef$DWORD
 *  com.sun.jna.platform.win32.WinDef$HWND
 *  com.sun.jna.platform.win32.WinDef$LPVOID
 *  com.sun.jna.ptr.IntByReference
 *  net.minecraft.class_310
 *  org.lwjgl.glfw.GLFWNativeWin32
 */
package us.m0vy.moondlc.m0vyguard;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.ptr.IntByReference;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_310;
import org.lwjgl.glfw.GLFWNativeWin32;
import us.m0vy.moondlc.m0vyguard.hq;
import us.m0vy.moondlc.m0vyguard.tz_4;
import us.m0vy.moondlc.m0vyguard.yf;

public class tht_2 {
    private static final int rzgh = 20;
    private static final int skhs_2 = -174282517;
    private static final int zat_4 = 1999536518;
    private static final int shzt_3 = -1533884740;
    private static final int sq = -1843284739;
    private static final int m17tkvxje9c0x = -1478413820;
    private static final int zjlsi63v1vm = 1489809589;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int pqcwjqwb7c;

    public static void zzz_3() {
        try {
            int n = -1139681942;
            n = Integer.rotateLeft(n * -405332307, 4) ^ 0x77D7D9A8;
            int n2 = n ^ 0xA2B56307;
            if ((n2 ^ n) != -1565170937) {
                int cfr_ignored_0 = (0x1EA4B66D ^ n) + 52669899;
            }
            long l = class_310.method_1551().method_22683().method_4490();
            tht_2.ghra(l);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void ghra(long l) {
        int n = 185997624;
        n = Integer.rotateLeft(n * -1491608181, 14) ^ 0x837F099B;
        int n2 = (n = (int)l ^ n) ^ 0x1428BC2B;
        if ((n2 ^ n) != 338213931) {
            int cfr_ignored_0 = (0x1F3EA513 ^ n) + -1029487761;
        }
        tht_2.hbw(l, 1);
    }

    public static void dws() {
        try {
            int n = -179206329;
            n = Integer.rotateLeft(n * 1947853689, 6) ^ 0x9FE85ECC;
            int n2 = n ^ 0xBD2AFB47;
            if ((n2 ^ n) != -1121256633) {
                int cfr_ignored_0 = (0x487B7C00 ^ n) - 808810694;
            }
            long l = class_310.method_1551().method_22683().method_4490();
            tht_2.hbw(l, 0);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static void hbw(long l, int n) {
        try {
            int n2 = -2008541503;
            n2 = Integer.rotateLeft(n2 * 961679469, 25) ^ 0xCA376A0E;
            n2 = (int)l ^ n2;
            n2 = n ^ n2;
            int n3 = n2 ^ 0xDF764E4D;
            if ((n3 ^ n2) != -545894835) {
                int cfr_ignored_0 = (0x573E588C ^ n2) + -1976538980;
            }
            if ((0x33D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            tht_2.sadh_2();
        }
        if (tht_2.drdh(tht_2.shdb(System.getProperty("os.name")), "windows")) {
            try {
                if (l != 0L) {
                    long l2 = GLFWNativeWin32.glfwGetWin32Window((long)l);
                    WinDef.HWND hWND = new WinDef.HWND(tht_2.syk(l2));
                    IntByReference intByReference = new IntByReference(n);
                    WinDef.LPVOID lPVOID = new WinDef.LPVOID(tht_2.bbz(intByReference));
                    tz_4.INSTANCE.DwmSetWindowAttribute(hWND, new WinDef.DWORD(0x80740586D75EED32L ^ 0x80740586D75EED26L), lPVOID, new WinDef.DWORD(0xD9B2C318A0139AD5L ^ 0xD9B2C318A0139AD1L));
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private static String bkhgh(String string, int n, int n2, int n3) {
        try {
            int n4 = 292798699;
            n4 = Integer.rotateLeft(n4 * -621323695, 25) ^ 0xD7793F36;
            n4 = Integer.rotateLeft(n ^ n4, 8);
            n4 = n2 ^ n4;
            int n5 = n4 ^ 0x1ED6C0C5;
            if ((n5 ^ n4) != 517390533) {
                int cfr_ignored_0 = (0xFA5002E ^ n4) - -1167798443;
            }
            if ((0x30B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x3CA95656) + i ^ skhs_2, 18) ^ n2 + zat_4));
        }
        return new String(cArray);
    }

    private static void sadh_2() {
        int n = hq.tash(735792811);
        int n2 = n ^ 0x79866EB4;
        if ((n2 ^ n) != 2038853300) {
            int cfr_ignored_0 = (Integer.rotateRight(0x525D201F ^ n, 13) - -39550212) * 1381834783;
        }
        yf.athz_2();
    }

    private static String shdb(String string) {
        block0: {
            int n = -853788611;
            n = Integer.rotateLeft(n * -424965817, 27) ^ 0xB7D13C5B;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 6);
            int n2 = n ^ 0xE764B44A;
            if ((n2 ^ n) == -412830646) break block0;
            int cfr_ignored_0 = (0x2A788C77 ^ n) - -1633713732;
        }
        return string.toLowerCase();
    }

    private static String thskh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = hq.tash(1275011414);
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 27);
            int n5 = (n4 = n2 ^ n4) ^ 0x46D3666;
            if ((n5 ^ n4) == 74266214) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x4F921730 ^ n4, 12) + -1492226549) * 1334974257;
        }
        return tht_2.bkhgh(string, n, n2, n3);
    }

    private static boolean drdh(String string, CharSequence charSequence) {
        block0: {
            int n = hq.tash(924971511);
            int n2 = n ^ 0x5B5DBF9C;
            if ((n2 ^ n) == 1532870556) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x6C7C4E6B ^ n, 16) + 661331504;
        }
        return string.contains(charSequence);
    }

    private static Pointer syk(long l) {
        block0: {
            int n = -159786398;
            int n2 = (n = Integer.rotateLeft(n * -646600807, 13) ^ 0x81D7DE20) ^ 0x2D0D4DB5;
            if ((n2 ^ n) == 755846581) break block0;
            int cfr_ignored_0 = (0xDB7497D7 ^ n) - 335144882;
        }
        return Pointer.createConstant((long)l);
    }

    private static Pointer bbz(IntByReference intByReference) {
        block0: {
            int n = hq.tash(-646455624);
            int n2 = n ^ 0x4183398F;
            if ((n2 ^ n) == 1099118991) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x98F4E737 ^ n, 6) - -1979343132) * -1728780489;
        }
        return intByReference.getPointer();
    }

    private static String[] ztha(String string) {
        int n = hq.tash(-109104137);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x2594A25D;
        if ((n2 ^ n) != 630497885) {
            int cfr_ignored_0 = Integer.rotateRight(0xDCEB91AA ^ n, 14) + -991673647;
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite thshy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1895191841;
            n3 = Integer.rotateLeft(n3 * -406683031, 19) ^ 0x9F379EC7;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 26);
            int n4 = n3 ^ 0x339A76E6;
            if ((n4 ^ n3) != 865760998) {
                int cfr_ignored_0 = (0xBC93DC39 ^ n3) - 1297384439;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ shzt_3 ^ string.hashCode()) + (n2 + sq) + i ^ shzt_3, 9) + sq);
            }
            String[] stringArray = tht_2.ztha(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType3) : lookup.findVirtual(clazz, stringArray[1], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] xzcf73g4vteuel(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite haxjolm4jk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ m17tkvxje9c0x ^ string.hashCode() ^ n2 + zjlsi63v1vm ^ i * 1453688419 ^ m17tkvxje9c0x, 17) ^ zjlsi63v1vm));
            }
            String[] stringArray = tht_2.xzcf73g4vteuel(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

