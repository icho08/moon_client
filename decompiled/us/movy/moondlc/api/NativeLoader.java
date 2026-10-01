/*
 * Decompiled with CFR 0.152.
 */
package us.movy.moondlc.api;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.UUID;
import us.m0vy.moondlc.m0vyguard.tbz_2;

public class NativeLoader {
    private static boolean loaded;
    private static final int lrxezrzf7 = -536343342;
    private static final int uz7yo2 = 362346833;
    private static final int sax7swmzaqoc = -1966964352;
    private static final int d7vjz54l9 = -2058706625;
    private static final int rvjz54l9i = -1806836607;
    private static final int y023uot = 1596618502;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int mmz81fwm;

    public static void loadLibrary() {
        int n = -713885260;
        int n2 = (n = Integer.rotateLeft(n * -480752713, 6) ^ 0xB3AA77C7) ^ 0x74270753;
        if ((n2 ^ n) != 1948714835) {
            int cfr_ignored_0 = (0xA155FEE7 ^ n) + 1153781252;
        }
        if (loaded) {
            return;
        }
        try {
            int n3;
            String string = "/natives/native_library.dll";
            InputStream inputStream = NativeLoader.class.getResourceAsStream(string);
            if (inputStream == null) {
                System.err.println("[MoonDlc] Krytyczny blad: Nie znalez".concat("iono biblioteki DLL w zasobach JARA!"));
                return;
            }
            File file = new File(NativeLoader.b27zq53o2ft0("java.".concat("io.tmpdir")));
            File file2 = new File(file, "moondlc_" + UUID.randomUUID().toString().substring(0, -2057377647 - -2057377655) + ".dll");
            file2.deleteOnExit();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] byArray = new byte[1188534747 - 1188530651];
            while ((n3 = inputStream.read(byArray)) != -1) {
                fileOutputStream.write(byArray, 0, n3);
            }
            fileOutputStream.close();
            inputStream.close();
            System.load(file2.getAbsolutePath());
            loaded = true;
            NativeLoader.h6i0irw7d(System.out, "[MoonDlc] Poprawnie zalado".concat("wano zabezpieczenia Native!"));
        }
        catch (Exception exception) {
            System.err.println("[MoonDlc] Blad podczas ladowania biblioteki Native!");
            exception.printStackTrace();
        }
    }

    private static String a76k63mbd(String string, int n, int n2, int n3) {
        int n4 = -747196857;
        n4 = Integer.rotateLeft(n4 * 285766219, 25) ^ 0xF2A46FF;
        int n5 = (n4 = n3 ^ n4) ^ 0x99B4B122;
        if ((n5 ^ n4) != -1716211422) {
            int cfr_ignored_0 = (0x4AC21F65 ^ n4) - 682726495;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x9B7BD24B) + i ^ lrxezrzf7, 13) ^ n2 + uz7yo2));
        }
        return new String(cArray);
    }

    private static String gjefjo3ok8(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1979214559;
            n4 = Integer.rotateLeft(n4 * 1352368601, 4) ^ 0xB9C919A2;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 11);
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 26)) ^ 0x4894430;
            if ((n5 ^ n4) == 76104752) break block0;
            int cfr_ignored_0 = (0x8E8ED111 ^ n4) + 1114499865;
        }
        return NativeLoader.a76k63mbd(string, n, n2, n3);
    }

    private static String v6ulqav51(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 908237651;
            n4 = Integer.rotateLeft(n4 * -1338114097, 10) ^ 0xCF3113F7;
            int n5 = (n4 = n3 ^ n4) ^ 0x78A72FFF;
            if ((n5 ^ n4) == 2024222719) break block0;
            int cfr_ignored_0 = (0x4E85B4AC ^ n4) - -1756729269;
        }
        return NativeLoader.a76k63mbd(string, n, n2, n3);
    }

    private static String b27zq53o2ft0(String string) {
        block0: {
            int n = tbz_2.tna_2(-1175515726);
            int n2 = n ^ 0x253F4478;
            if ((n2 ^ n) == 624903288) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x9CD049CA ^ n, 6) + 26644145;
        }
        return System.getProperty(string);
    }

    private static void h6i0irw7d(PrintStream printStream, String string) {
        int n = -619479131;
        n = Integer.rotateLeft(n * -1756533905, 26) ^ 0x32F6E59C;
        PrintStream printStream2 = printStream;
        n = Integer.rotateRight((printStream2 != null ? System.identityHashCode(printStream2) : 0) ^ n, 29);
        int n2 = n ^ 0x553113D6;
        if ((n2 ^ n) != 1429279702) {
            int cfr_ignored_0 = (0x8E226C73 ^ n) + 982136405;
        }
        printStream.println(string);
    }

    private static String uds0b37v43ii9(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 125070899;
            n4 = Integer.rotateLeft(n4 * -181614451, 24) ^ 0x80256A13;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 28);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 16)) ^ 0xAADAB574;
            if ((n5 ^ n4) == -1428507276) break block0;
            int cfr_ignored_0 = (0xADAEDB47 ^ n4) + -1169816370;
        }
        return NativeLoader.a76k63mbd(string, n, n2, n3);
    }

    private static String[] i0fjsoxst8h(String string) {
        int n = 910738826;
        n = Integer.rotateLeft(n * -1543543225, 6) ^ 0x172F9C32;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 25);
        int n2 = n ^ 0x33E27BEE;
        if ((n2 ^ n) != 870480878) {
            int cfr_ignored_0 = (0x5AABE64 ^ n) - 1595051841;
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

    private static CallSite yhngms4yk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 229445031;
            n3 = Integer.rotateLeft(n3 * -1463403661, 21) ^ 0xB8F9063F;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 8);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x61A0A64C;
            if ((n4 ^ n3) != 1637918284) {
                int cfr_ignored_0 = (0x6C0DABEB ^ n3) + 307609711;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ sax7swmzaqoc ^ string.hashCode()) + (n2 + d7vjz54l9) + i ^ sax7swmzaqoc, 23) + d7vjz54l9);
            }
            String[] stringArray = NativeLoader.i0fjsoxst8h(new String(cArray));
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

    private static String[] sax7swmzaqocp(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite i0fjsoxst8h(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ rvjz54l9i ^ string.hashCode() ^ n2 + y023uot ^ i * 665384639 ^ rvjz54l9i, 28) ^ y023uot));
            }
            String[] stringArray = NativeLoader.sax7swmzaqocp(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

