/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bqw;
import us.m0vy.moondlc.m0vyguard.yf;

public final class bmn {
    public static final bqw shmz;
    public static final bqw sdha_2;
    public static final bqw shzth;
    public static final bqw wl;
    public static final bqw tkhf;
    public static final bqw dhsm_2;
    public static final bqw bhkh_2;
    public static final bqw dhsth_2;
    public static final bqw bzdh;
    public static final bqw tdd;
    private static final int tmt = -845891133;
    private static final int raz_2 = 2030437396;
    private static final int z3c17sopzn = -710024705;
    private static final int wd23pep9gaw9 = 1549338340;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ntoeqlx8;

    @Generated
    private bmn() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static String khwq(String string, int n, int n2, int n3) {
        try {
            int n4 = -1044007220;
            n4 = Integer.rotateLeft(n4 * -959944257, 19) ^ 0xD455157A;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            n4 = Integer.rotateRight(n ^ n4, 29);
            int n5 = n4 ^ 0x9F2C87BF;
            if ((n5 ^ n4) != -1624471617) {
                int cfr_ignored_0 = (0x5EE93173 ^ n4) - 1286827424;
            }
            if ((0x254 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x847EEC5B ^ n2 - i) + raz_2, 26) ^ tmt + i * 898370713));
        }
        return new String(cArray);
    }

    private static String[] quq5vlugxy4q8a(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite usl20slm7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ z3c17sopzn ^ string.hashCode() ^ n2 + wd23pep9gaw9 ^ i * -1378307331 ^ z3c17sopzn, 26) ^ wd23pep9gaw9));
            }
            String[] stringArray = bmn.quq5vlugxy4q8a(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

