/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Random;
import us.m0vy.moondlc.m0vyguard.bdhs;
import us.m0vy.moondlc.m0vyguard.yf;

public class tzw
extends Random {
    private long khmd;
    private static final int brt = 161945765;
    private static final int tshf = -372488670;
    private static final int riaf6okntv = -621683606;
    private static final int phptaeculzom = 1487082218;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int fvs6fp07j;

    public tzw(long l) {
        this.khmd = l;
    }

    public tzw() {
        this(System.nanoTime());
    }

    public int randomInRange(int n, int n2) {
        try {
            int n3 = 326102654;
            n3 = Integer.rotateLeft(n3 * -726659169, 4) ^ 0xD13D5EDE;
            n3 = Integer.rotateLeft(System.identityHashCode(this) ^ n3, 24);
            n3 = n ^ n3;
            int n4 = n3 ^ 0xD3314F2F;
            if ((n4 ^ n3) != -751743185) {
                int cfr_ignored_0 = (0xC05EA151 ^ n3) + -805958931;
            }
            if ((0x1CA & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (n == n2 || n > n2) {
            return n;
        }
        return tzw.eh83sasvc0x(this, n2 - n + 1) + n;
    }

    public float randomInRange(float f, float f2) {
        try {
            int n = -426078761;
            n = Integer.rotateLeft(n * -759419761, 25) ^ 0x6E5D8060;
            n = System.identityHashCode(this) ^ n;
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 7);
            int n2 = n ^ 0x86FDED85;
            if ((n2 ^ n) != -2030178939) {
                int cfr_ignored_0 = (0x60676052 ^ n) + 1860710840;
            }
            if ((0x108 & 0) != 0) {
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
        return f + this.nextFloat() * (f2 - f);
    }

    public double randomInRange(double d, double d2) {
        try {
            int n = -1886317823;
            n = Integer.rotateLeft(n * 1092322797, 15) ^ 0x9EEE58EF;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x1D57AFB6;
            if ((n2 ^ n) != 492285878) {
                int cfr_ignored_0 = (0x92C6BCB7 ^ n) + -748564954;
            }
            if ((0xD2 & 0) != 0) {
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
        return d + tzw.y2pkj7adpovb(this) * (d2 - d);
    }

    @Override
    protected int next(int n) {
        try {
            int n2 = 963204130;
            n2 = Integer.rotateLeft(n2 * 1613210325, 21) ^ 0xCFD4EDC;
            n2 = System.identityHashCode(this) ^ n2;
            n2 = n ^ n2;
            int n3 = n2 ^ 0xDB8D1513;
            if ((n3 ^ n2) != -611511021) {
                int cfr_ignored_0 = (0xE2E44131 ^ n2) + -1407375704;
            }
            if ((0x117 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        this.khmd ^= this.khmd << (0x62B0BAA3 ^ 0x62B0BAAE);
        this.khmd ^= this.khmd >>> -536061484 + 536061501;
        this.khmd ^= this.khmd << 5;
        return (int)(this.khmd & (1L << n) - 1L);
    }

    private static int eh83sasvc0x(tzw tzw2, int n) {
        block0: {
            int n2 = bdhs.js_2(1231428502);
            int n3 = n2 ^ 0xE2D9C0CF;
            if ((n3 ^ n2) == -489045809) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xABBFDB59 ^ n2, 8) + -795267326) * -1413489831;
            int cfr_ignored_1 = (int)(0x690D756427D4EB4FL ^ (long)n2 ^ 0x17B8831A2DB97FCBL);
        }
        return tzw2.nextInt(n);
    }

    private static double y2pkj7adpovb(tzw tzw2) {
        block0: {
            int n = -373672773;
            n = Integer.rotateLeft(n * -1384116769, 6) ^ 0x67B0A772;
            tzw tzw3 = tzw2;
            n = Integer.rotateLeft((tzw3 != null ? System.identityHashCode(tzw3) : 0) ^ n, 6);
            int n2 = n ^ 0x7AE2E6B3;
            if ((n2 ^ n) == 2061690547) break block0;
            int cfr_ignored_0 = (0x9358D208 ^ n) + -999431834;
        }
        return tzw2.nextDouble();
    }

    private static String[] vanhdgu5huv3(String string) {
        int n = bdhs.js_2(-2137805210);
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 17);
        int n2 = n ^ 0xB4746EB8;
        if ((n2 ^ n) != -1267437896) {
            int cfr_ignored_0 = (Integer.rotateRight(0x34E7C0DE ^ n, 9) - 1819146781) * 887603423;
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

    private static CallSite n1j20ji43t1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -864806014;
            n3 = Integer.rotateLeft(n3 * 317474855, 21) ^ 0xE8A5089E;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 11);
            n3 = n ^ n3;
            int n4 = n3 ^ 0x2DB03183;
            if ((n4 ^ n3) != 766521731) {
                int cfr_ignored_0 = (0xE1C42A01 ^ n3) + 1718336378;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ brt ^ string.hashCode() ^ n2 + tshf ^ i * 718843001 ^ brt, 22) ^ tshf));
            }
            String[] stringArray = tzw.vanhdgu5huv3(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] tmzyot6i4scv2o(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite b4hf2798anw0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ riaf6okntv ^ string.hashCode() ^ n2 + phptaeculzom ^ i * 615656921 ^ riaf6okntv, 27) ^ phptaeculzom));
            }
            String[] stringArray = tzw.tmzyot6i4scv2o(new String(cArray));
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

