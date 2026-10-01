/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bght;

public class bmb {
    private static final bmb INSTANCE;
    private float hjs = 1.0f;
    private static final int yck722zv9 = -256097242;
    private static final int isgqjr0ea = -232037916;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int cbs7bfcvhj;

    public static bmb ath_2() {
        block0: {
            int n = 1993437675;
            int n2 = (n = Integer.rotateLeft(n * -1307301137, 9) ^ 0xFD5CCEAA) ^ 0x120688D6;
            if ((n2 ^ n) == 302418134) break block0;
            int cfr_ignored_0 = (0x64D7F93D ^ n) - -454995689;
        }
        return INSTANCE;
    }

    public float dhna() {
        block0: {
            int n = -1965134973;
            n = Integer.rotateLeft(n * -737114891, 4) ^ 0x381B2E93;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x2E528D8F;
            if ((n2 ^ n) == 777162127) break block0;
            int cfr_ignored_0 = (0xA48CE60C ^ n) + -1229702607;
        }
        return this.hjs;
    }

    public void zkhd_2(float f) {
        int n = bght.bjs(1982827842);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0xD871A68E;
        if ((n2 ^ n) != -663640434) {
            int cfr_ignored_0 = Integer.rotateLeft(0xAE5E2BCC ^ n, 8) - 566553839;
        }
        this.hjs = f;
    }

    public float swk(float f) {
        block0: {
            int n = bght.bjs(1573023888);
            n = System.identityHashCode(this) ^ n;
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 23);
            int n2 = n ^ 0x4EA59B2E;
            if ((n2 ^ n) == 1319476014) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x1367EBBE ^ n, 5) - 1576217405) * 325577663;
        }
        return f * this.hjs;
    }

    private static String[] xrh65r3opz7(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite txej2y3ej1ubi(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ yck722zv9 ^ string.hashCode() ^ n2 + isgqjr0ea ^ i * -1087165071 ^ yck722zv9, 5) ^ isgqjr0ea));
            }
            String[] stringArray = bmb.xrh65r3opz7(new String(cArray));
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

