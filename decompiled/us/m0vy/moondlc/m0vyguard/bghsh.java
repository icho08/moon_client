/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.btkh;
import us.m0vy.moondlc.m0vyguard.tjk;
import us.m0vy.moondlc.m0vyguard.zk;
import us.m0vy.moondlc.m0vyguard.yf;

public class bghsh
extends tjk {
    private final zk thnsh;
    private static final int zkd = 886661592;
    private static final int thnh_2 = -1624961293;
    private static final int shst_2 = -1100268350;
    private static final int bkht = 1282615195;
    private static final int ogexpxyhqo = 1852370734;
    private static final int fd9gb1h0qg = 152059909;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int iwa3s5vvv;

    public bghsh(zk zk2) {
        super(2);
        if (zk2 == null) {
            throw new IllegalArgumentException("Operator is unk".concat("nown for token."));
        }
        this.thnsh = zk2;
    }

    public zk jkk() {
        block0: {
            int n = -370566682;
            n = Integer.rotateLeft(n * 470174543, 9) ^ 0x10D48B15;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xD2DCC159;
            if ((n2 ^ n) == -757284519) break block0;
            int cfr_ignored_0 = (0x3B3558BF ^ n) - 1728864487;
        }
        return this.thnsh;
    }

    private static String abn(String string, int n, int n2, int n3) {
        int n4 = -208936520;
        n4 = Integer.rotateLeft(n4 * -1743156551, 14) ^ 0x118B121C;
        n4 = Integer.rotateLeft(n ^ n4, 4);
        int n5 = (n4 = n2 ^ n4) ^ 0x413AE6E7;
        if ((n5 ^ n4) != 1094379239) {
            int cfr_ignored_0 = (0xB2B1075F ^ n4) + 2122244920;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xCFA42BD4) + i ^ zkd, 17) ^ n2 + thnh_2));
        }
        return new String(cArray);
    }

    private static String[] sjn(String string) {
        int n = btkh.jthq(-2026723247);
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 15);
        int n2 = n ^ 0x6506087;
        if ((n2 ^ n) != 105930887) {
            int cfr_ignored_0 = (Integer.rotateRight(0x8162C8D6 ^ n, 3) - -1353453275) * -2124232489;
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

    private static CallSite dmn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1379076422;
            n3 = Integer.rotateLeft(n3 * -447076667, 16) ^ 0xA99F8B9A;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x80B3067A;
            if ((n4 ^ n3) != -2135751046) {
                int cfr_ignored_0 = (0xD2800F3C ^ n3) - -1846769639;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ shst_2 ^ string.hashCode()) + (n2 + bkht) + i ^ shst_2, 20) + bkht);
            }
            String[] stringArray = bghsh.sjn(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] oqfulbxf(String string) {
        return string.split("\u0001\u001f", -1);
    }

    private static CallSite j3hz8o28(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ogexpxyhqo ^ string.hashCode()) + (n2 + fd9gb1h0qg) + i ^ ogexpxyhqo, 16) + fd9gb1h0qg);
            }
            String[] stringArray = bghsh.oqfulbxf(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

