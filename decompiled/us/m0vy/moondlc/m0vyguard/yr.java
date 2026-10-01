/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import us.m0vy.moondlc.m0vyguard.bdt_4;
import us.m0vy.moondlc.m0vyguard.bwsh;
import us.m0vy.moondlc.m0vyguard.trh;
import us.m0vy.moondlc.m0vyguard.yf;

public class yr
extends bdt_4 {
    private static final int tshh = 1523337900;
    private static final int thkk = 576121001;
    private static final int xqk23nfpqgkn = 556008999;
    private static final int zwopgmmtj = -336914186;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int xim3mlrzn;

    public yr() {
        super(yr.hya());
    }

    private static List hya() {
        try {
            int n = 346699962;
            n = Integer.rotateLeft(n * -1617385883, 5) ^ 0x9613BAE7;
            int n2 = n ^ 0x54834632;
            if ((n2 ^ n) != 1417889330) {
                int cfr_ignored_0 = (0x40297E88 ^ n) + 1895918988;
            }
            if ((0x303 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        ArrayList<trh> arrayList = new ArrayList<trh>();
        for (int i = 0; i < (Integer.reverse(1940834076) ^ 0x38E375D5); ++i) {
            arrayList.add(new trh(i));
        }
        return arrayList;
    }

    private static String[] yw(String string) {
        int n = bwsh.jdhq(-1509182480);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x113B39F;
        if ((n2 ^ n) != 18068383) {
            int cfr_ignored_0 = Integer.rotateRight(0xA718006F ^ n, 7) - 1078308012;
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

    private static CallSite dhzth_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -212312367;
            n3 = Integer.rotateLeft(n3 * 548075507, 11) ^ 0xD4BC79ED;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 14);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 29);
            int n4 = n3 ^ 0xAECDAAF9;
            if ((n4 ^ n3) != -1362253063) {
                int cfr_ignored_0 = (0x5D95F428 ^ n3) + -1899238993;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ tshh ^ string.hashCode() ^ n2 + thkk + i * -302119463) + tshh) ^ thkk));
            }
            String[] stringArray = yr.yw(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] vmfnebnk5oy(String string) {
        return string.split("\u0006\u001c", -1);
    }

    private static CallSite pb4yc99bx1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ xqk23nfpqgkn ^ string.hashCode() ^ n2 + zwopgmmtj + i * -1465649241) + xqk23nfpqgkn) ^ zwopgmmtj));
            }
            String[] stringArray = yr.vmfnebnk5oy(new String(cArray));
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

