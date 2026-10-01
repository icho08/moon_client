/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;

public abstract class ght_2 {
    public static final short dhshth = 1;
    public static final short zbgh = 2;
    public static final short saw_3 = 3;
    public static final short sddh_3 = 4;
    public static final short fl = 5;
    public static final short tdk_2 = 6;
    public static final short thzdh = 7;
    private final int bw;
    private static final int ldi9rdota15h = -1076880022;
    private static final int kh84d49f6qi9 = -1344065675;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int xhs11b1fq;

    public ght_2(int n) {
        this.bw = n;
    }

    public int bjy() {
        block0: {
            int n = -1738810205;
            int n2 = (n = Integer.rotateLeft(n * 203358187, 26) ^ 0x978999EC) ^ 0xADEE80D6;
            if ((n2 ^ n) == -1376878378) break block0;
            int cfr_ignored_0 = (0x35B55C75 ^ n) - -1456817994;
        }
        return this.bw;
    }

    private static String[] ia2sqb216907(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite dczzv9jorx(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ldi9rdota15h ^ string.hashCode() ^ n2 + kh84d49f6qi9 ^ i * 652612825 ^ ldi9rdota15h, 22) ^ kh84d49f6qi9));
            }
            String[] stringArray = ght_2.ia2sqb216907(new String(cArray));
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

