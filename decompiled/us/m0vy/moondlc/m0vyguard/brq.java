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
import us.m0vy.moondlc.m0vyguard.bkht;
import us.m0vy.moondlc.m0vyguard.yf;

public class brq {
    private long zhr_2;
    private static final int sbq = -918710030;
    private static final int dhthz = -802312695;
    private static final int fa0mdgsufg5q = 1985642140;
    private static final int bjmbcyxuo5ce = 509663647;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int kb2j7a0dx1hrtf;

    public brq() {
        this.tshf_2();
    }

    public boolean slgh_2(float f) {
        try {
            int n = 1599724565;
            n = Integer.rotateLeft(n * -2017516113, 26) ^ 0x8AC0C185;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 10);
            int n2 = n ^ 0x26AA7E43;
            if ((n2 ^ n) != 648707651) {
                int cfr_ignored_0 = (0x79F3A256 ^ n) - 1781171598;
            }
            if ((0x260 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return System.currentTimeMillis() - this.zhr_2 >= (long)f;
    }

    public boolean sza(long l) {
        int n = bkht.sshr(1853557481);
        n = System.identityHashCode(this) ^ n;
        int n2 = (n = (int)l ^ n) ^ 0x8E6BF2A0;
        if ((n2 ^ n) != -1905528160) {
            int cfr_ignored_0 = Integer.rotateLeft(0xE010F849 ^ n, 15) + 644591634;
            int cfr_ignored_1 = (int)(0x22A2567427D4EB4FL ^ (long)n ^ 0x5198831A2DB9E895L);
        }
        return System.currentTimeMillis() - this.zhr_2 >= l;
    }

    public void tshf_2() {
        int n = bkht.sshr(730590801);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 15);
        int n2 = n ^ 0x3753EF87;
        if ((n2 ^ n) != 928247687) {
            int cfr_ignored_0 = (Integer.rotateRight(0x1CD801D6 ^ n, 6) - -2105157595) * 483918295;
        }
        this.zhr_2 = System.currentTimeMillis();
    }

    public long shagh() {
        block0: {
            int n = 169061177;
            n = Integer.rotateLeft(n * 71366047, 6) ^ 0x3B9251D1;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x6F3741BA;
            if ((n2 ^ n) == 1865892282) break block0;
            int cfr_ignored_0 = (0x6524EA83 ^ n) + 724852688;
        }
        return System.currentTimeMillis() - this.zhr_2;
    }

    @Generated
    public long rsgh_2() {
        block0: {
            int n = 1954414222;
            n = Integer.rotateLeft(n * 1989233561, 5) ^ 0xEAF65A31;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xD6BC13AF;
            if ((n2 ^ n) == -692317265) break block0;
            int cfr_ignored_0 = (0xA2C1ED21 ^ n) + -1030814413;
        }
        return this.zhr_2;
    }

    @Generated
    public void dhty_2(long l) {
        int n = bkht.sshr(-1767483807);
        int n2 = (n = (int)l ^ n) ^ 0x3448D01;
        if ((n2 ^ n) != 54824193) {
            bkht.tmq(-1780294816, n);
            int cfr_ignored_0 = (int)(0xBD5A2D97F4A7C15L ^ (long)n ^ 0xB8C23227030DBA7AL);
        }
        this.zhr_2 = l;
    }

    private static String[] zzt_2(String string) {
        int n = 2141029224;
        n = Integer.rotateLeft(n * -1565479631, 16) ^ 0x4E3B0FE9;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 8);
        int n2 = n ^ 0x17D01CF6;
        if ((n2 ^ n) != 399514870) {
            int cfr_ignored_0 = (0x684D9F9E ^ n) - -1079911843;
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

    private static CallSite dhtkh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -485296699;
            n3 = Integer.rotateLeft(n3 * 1047476355, 16) ^ 0x5E173305;
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            n3 = Integer.rotateLeft(n ^ n3, 26);
            int n4 = n3 ^ 0x3FD872CF;
            if ((n4 ^ n3) != 1071149775) {
                int cfr_ignored_0 = (0xDCCA870A ^ n3) + 1527622098;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ sbq ^ string.hashCode() ^ n2 + dhthz ^ i * -800601335 ^ sbq, 9) ^ dhthz));
            }
            String[] stringArray = brq.zzt_2(new String(cArray));
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

    private static String[] sju3ub7s6v4(String string) {
        return string.split("\u0001\u0019", -1);
    }

    private static CallSite ibcmhpao5oe5jm(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ fa0mdgsufg5q ^ string.hashCode() ^ n2 + bjmbcyxuo5ce + i * 756951305) + fa0mdgsufg5q) ^ bjmbcyxuo5ce));
            }
            String[] stringArray = brq.sju3ub7s6v4(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

