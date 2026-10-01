/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.m_2;

public class bhsh_2 {
    private final String khhj_2;
    private boolean rsr_2;
    private static final int djx0hoxrm6 = 636314495;
    private static final int c0h8rlks = 1069595583;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int hw3ny7saq;

    public bhsh_2(String string) {
        this.khhj_2 = string;
        this.rsr_2 = false;
    }

    public void jmdh() {
        int n = 424349282;
        n = Integer.rotateLeft(n * 1978060291, 5) ^ 0xC2C7BD4A;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x3DEF253A;
        if ((n2 ^ n) != 1039082810) {
            int cfr_ignored_0 = (0x24A42B58 ^ n) + -564548067;
        }
        this.rsr_2 = true;
    }

    public String zbl_2() {
        block0: {
            int n = 221574213;
            n = Integer.rotateLeft(n * 1474635215, 25) ^ 0xD292F47D;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x3EEEC380;
            if ((n2 ^ n) == 1055835008) break block0;
            int cfr_ignored_0 = (0x33DA37C5 ^ n) + 1622269609;
        }
        return this.khhj_2;
    }

    public boolean bbdh() {
        block0: {
            int n = 607808325;
            n = Integer.rotateLeft(n * -366960107, 12) ^ 0x5133489C;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 9);
            int n2 = n ^ 0x80886314;
            if ((n2 ^ n) == -2138545388) break block0;
            int cfr_ignored_0 = (0xA4B20851 ^ n) + -1611580443;
        }
        return this.rsr_2;
    }

    public void khtr(boolean bl) {
        int n = m_2.thgh_4(786882753);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x4F46322D;
        if ((n2 ^ n) != 1330000429) {
            int cfr_ignored_0 = Integer.rotateLeft(0x61A0D2EC ^ n, 15) - -690542129;
        }
        this.rsr_2 = bl;
    }

    private static String[] lpl8utmpixs3l(String string) {
        return string.split("\u0007\u0014", -1);
    }

    private static CallSite vrapcgau8fq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ djx0hoxrm6 ^ string.hashCode() ^ n2 + c0h8rlks ^ i * -1924254403 ^ djx0hoxrm6, 7) ^ c0h8rlks));
            }
            String[] stringArray = bhsh_2.lpl8utmpixs3l(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

