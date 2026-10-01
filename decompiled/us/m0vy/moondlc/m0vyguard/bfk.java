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
import us.m0vy.moondlc.m0vyguard.ght_2;

public class bfk
extends ght_2 {
    private final bal_2 khdha_2;
    private static final int tt_3 = -1609691137;
    private static final int dqs = 1455266877;
    private static final int tmt_2 = -883179835;
    private static final int dab = 1889648765;
    private static final int ru8zgcokit6om = 885266584;
    private static final int u6d5gxkwpbp = 1907319930;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int yrkzo577t177;

    public bfk(bal_2 bal2) {
        super(2);
        if (bal2 == null) {
            throw new IllegalArgumentException("Operator is unkn".concat("own for token."));
        }
        this.khdha_2 = bal2;
    }

    public bal_2 shnt() {
        block0: {
            int n = -653147448;
            int n2 = (n = Integer.rotateLeft(n * -1012416521, 3) ^ 0x6825D3F9) ^ 0x136C407E;
            if ((n2 ^ n) == 325861502) break block0;
            int cfr_ignored_0 = (0xCA7D82B6 ^ n) - -1259487225;
        }
        return this.khdha_2;
    }

    private static String snl(String string, int n, int n2, int n3) {
        int n4 = -770199471;
        n4 = Integer.rotateLeft(n4 * -1537056911, 3) ^ 0x4D89CC60;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateRight(n ^ n4, 8)) ^ 0x5C7F6640;
        if ((n5 ^ n4) != 1551853120) {
            int cfr_ignored_0 = (0x8E68D611 ^ n4) + 1391467152;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x5E86B6C9 ^ n2 ^ i * 1296325435 ^ tt_3, 22) ^ dqs));
        }
        return new String(cArray);
    }

    private static String[] rzz_3(String string) {
        int n = -2079864741;
        int n2 = (n = Integer.rotateLeft(n * 1469055601, 25) ^ 0xDAE4DBA6) ^ 0xF2243C49;
        if ((n2 ^ n) != -232506295) {
            int cfr_ignored_0 = (0x7623F412 ^ n) + -1896023811;
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

    private static CallSite dsw_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -798134383;
            n3 = Integer.rotateLeft(n3 * 1066060159, 17) ^ 0xCDCEF24;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xA199CA42;
            if ((n4 ^ n3) != -1583756734) {
                int cfr_ignored_0 = (0x71F4A5D3 ^ n3) + 931278235;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ tmt_2 ^ string.hashCode() ^ n2 + dab ^ i * -148248645 ^ tmt_2, 16) ^ dab));
            }
            String[] stringArray = bfk.rzz_3(new String(cArray));
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

    private static String[] hco5exk1d0uo8f(String string) {
        return string.split("\u0004\u0010", -1);
    }

    private static CallSite osymk8n5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ru8zgcokit6om ^ string.hashCode()) + (n2 + u6d5gxkwpbp) + i ^ ru8zgcokit6om, 11) + u6d5gxkwpbp);
            }
            String[] stringArray = bfk.hco5exk1d0uo8f(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

