/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bal_2;
import us.m0vy.moondlc.m0vyguard.rb;
import us.m0vy.moondlc.m0vyguard.yf;

public abstract class bza_3 {
    private static final int bndh = 0;
    private static final int khjy = 1;
    private static final int hngh = 2;
    private static final int tthl = 3;
    private static final int khdhk = 4;
    private static final int dshr = 5;
    private static final int shmt = 6;
    private static final int jngh = 7;
    private static final bal_2[] sfq;
    private static final int shdhgh = 827297005;
    private static final int rdh_5 = -33592011;
    private static final int xs6cb2eanse = 283923446;
    private static final int o1zj0mi = -645573453;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int jp5ye7rt86bk;

    public static bal_2 das_7(char c, int n) {
        try {
            int n2 = 578580879;
            n2 = Integer.rotateLeft(n2 * -609312275, 14) ^ 0xC24091AF;
            n2 = Integer.rotateLeft(c ^ n2, 13);
            n2 = n ^ n2;
            int n3 = n2 ^ 0x4014C5DF;
            if ((n3 ^ n2) != 1075103199) {
                int cfr_ignored_0 = (0x6268B450 ^ n2) - -270079545;
            }
            if ((0x3E7 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            bza_3.dkt_3();
            throw null;
        }
        switch (c) {
            case '%': {
                return sfq[5];
            }
            case '*': {
                return sfq[2];
            }
            case '+': {
                if (n != 1) {
                    return sfq[0];
                }
                return sfq[Integer.rotateLeft(0x6959353D ^ 0x6957353D, 15)];
            }
            case '-': {
                if (n != 1) {
                    return sfq[1];
                }
                return sfq[Integer.rotateLeft(0xB0883608 ^ 0x70883608, 3)];
            }
            case '/': 
            case '÷': {
                return sfq[3];
            }
            case '^': {
                return sfq[4];
            }
        }
        return null;
    }

    private static void dkt_3() {
        int n = rb.sat_8(683121026);
        int n2 = n ^ 0x647971F2;
        if ((n2 ^ n) != 1685680626) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x4CCEE870 ^ n, 12) + 1366017227) * 1288628337;
        }
        yf.athz_2();
    }

    private static String[] jshth(String string) {
        block0: {
            int n = 1702845661;
            n = Integer.rotateLeft(n * 229667235, 17) ^ 0xAEDA11DD;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x83E2CF5;
            if ((n2 ^ n) == 138292469) break block0;
            int cfr_ignored_0 = (0x6D417028 ^ n) + -794578143;
        }
        return string.split("\u0002\u0016", -1);
    }

    private static CallSite shdsh_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -65347684;
            n3 = Integer.rotateLeft(n3 * 147524169, 11) ^ 0x694C4CBC;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 29);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xC299DCC6;
            if ((n4 ^ n3) != -1030103866) {
                int cfr_ignored_0 = (0x3E83035A ^ n3) - -1661119024;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ shdhgh ^ string.hashCode() ^ n2 + rdh_5 ^ i * -922079297 ^ shdhgh, 7) ^ rdh_5));
            }
            String[] stringArray = bza_3.jshth(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] kx02b5c9sgmreo(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite xkpfqd8g55(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ xs6cb2eanse ^ string.hashCode()) + (n2 + o1zj0mi) + i ^ xs6cb2eanse, 8) + o1zj0mi);
            }
            String[] stringArray = bza_3.kx02b5c9sgmreo(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

