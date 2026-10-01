/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bah;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Item Physic", category=bzw.OTHER, desc="Items lie on the ground with physics")
public class bfa
extends bnq {
    private static bfa rdq_2;
    public final khd zkt = new khd(this, "Physics");
    private final fy dhthf = new fy(this.zkt, "Normal");
    private final fy dsh_3 = new fy(this.zkt, "2D");
    private static final int dyh = 633859156;
    private static final int dsd_3 = -1453446277;
    private static final int brdh = -1195378834;
    private static final int btz_3 = 777749612;
    private static final int d44qz27f9g = 714853419;
    private static final int f6w5ezj = 829504736;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int s324zou3i;

    public static bfa thas_4() {
        block0: {
            int n = 1461796814;
            int n2 = (n = Integer.rotateLeft(n * 153317999, 9) ^ 0xD91F9D7F) ^ 0xC9E016EF;
            if ((n2 ^ n) == -908060945) break block0;
            int cfr_ignored_0 = (0x9EC12921 ^ n) + 801358215;
        }
        return rdq_2;
    }

    public bfa() {
        rdq_2 = this;
    }

    public boolean hjgh() {
        block0: {
            int n = 1166206859;
            int n2 = (n = Integer.rotateLeft(n * 1184437075, 23) ^ 0x5552F855) ^ 0x95FDB488;
            if ((n2 ^ n) == -1778535288) break block0;
            int cfr_ignored_0 = (0xD07F5303 ^ n) - -865478725;
        }
        return bfa.rrs(this.dsh_3);
    }

    private static String jdhl(String string, int n, int n2, int n3) {
        try {
            int n4 = 260105170;
            n4 = Integer.rotateLeft(n4 * 1386435067, 21) ^ 0x6C755544;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            n4 = Integer.rotateLeft(n ^ n4, 2);
            int n5 = n4 ^ 0x321EA58;
            if ((n5 ^ n4) != 52554328) {
                int cfr_ignored_0 = (0xCA1098A ^ n4) - -1091757457;
            }
            if ((0x23A & 0) != 0) {
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
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x4974087F ^ n2 - i) + dsd_3, 16) ^ dyh + i * -1590819469));
        }
        return new String(cArray);
    }

    private static boolean rrs(fy fy2) {
        block0: {
            int n = bah.thhq_2(89027095);
            int n2 = n ^ 0x89503B49;
            if ((n2 ^ n) == -1991230647) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x8C1E495E ^ n, 4) - -66551395) * -1944172193;
        }
        return fy2.shghkh();
    }

    private static String[] zjth_2(String string) {
        block0: {
            int n = -1319767845;
            n = Integer.rotateLeft(n * 1087909731, 25) ^ 0x597AD857;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 21);
            int n2 = n ^ 0x7DFF4B09;
            if ((n2 ^ n) == 2113882889) break block0;
            int cfr_ignored_0 = (0xCCAABBD2 ^ n) + -553435684;
        }
        return string.split("\u0005\u0018", -1);
    }

    private static CallSite srw_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1073062708;
            n3 = Integer.rotateLeft(n3 * -1718244027, 26) ^ 0x12BE8F8F;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 5);
            int n4 = n3 ^ 0x74D59BC6;
            if ((n4 ^ n3) != 1960156102) {
                int cfr_ignored_0 = (0xB4DFC70A ^ n3) - 395976603;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ brdh ^ string.hashCode()) + (n2 + btz_3) + i ^ brdh, 7) + btz_3);
            }
            String[] stringArray = bfa.zjth_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] pfm85slasre46p(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite d3kca18i9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ d44qz27f9g ^ string.hashCode() ^ n2 + f6w5ezj + i * -728427237) + d44qz27f9g) ^ f6w5ezj));
            }
            String[] stringArray = bfa.pfm85slasre46p(new String(cArray));
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

