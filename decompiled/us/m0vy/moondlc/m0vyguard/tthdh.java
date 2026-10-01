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
import us.m0vy.moondlc.m0vyguard.bbth;

public final class tthdh
extends Enum {
    public static final /* enum */ tthdh tdha_2;
    public static final /* enum */ tthdh dhhz_4;
    public static final /* enum */ tthdh khhr;
    public static final /* enum */ tthdh jshs_2;
    public static final /* enum */ tthdh dhry;
    public static final /* enum */ tthdh ab;
    public static final /* enum */ tthdh dkr;
    private final int dhrs;
    private static final tthdh[] shrf;
    private static final int jms = -915139330;
    private static final int tdhq = 1710180380;
    private static final int f6e5eholz0v5 = -1337128434;
    private static final int l6wbf2iza9 = -264280096;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";

    public static tthdh[] values() {
        block0: {
            int n = 1500215892;
            int n2 = (n = Integer.rotateLeft(n * 2004002927, 3) ^ 0xCD467405) ^ 0x2601D3D4;
            if ((n2 ^ n) == 637653972) break block0;
            int cfr_ignored_0 = (0x7F6AA980 ^ n) + -161191226;
        }
        return (tthdh[])shrf.clone();
    }

    public static tthdh valueOf(String string) {
        block0: {
            int n = 1894047539;
            n = Integer.rotateLeft(n * -2024025027, 4) ^ 0x9A4CB8E0;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x3640F39A;
            if ((n2 ^ n) == 910226330) break block0;
            int cfr_ignored_0 = (0x46A42CA9 ^ n) + -1292509075;
        }
        return Enum.valueOf(tthdh.class, string);
    }

    public static tthdh fromButtonIndex(int n) {
        int n2 = bbth.sthy_2(957910904);
        int n3 = n2 ^ 0x89241C04;
        if ((n3 ^ n2) != -1994122236) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xB03C937C ^ n2, 9) - 1538489151) * -1338207363;
        }
        for (tthdh tthdh2 : tthdh.values()) {
            if (tthdh2.getButtonIndex() != n) continue;
            return tthdh2;
        }
        return tdha_2;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    @Generated
    private tthdh() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.dhrs = var3_2;
    }

    @Generated
    public int getButtonIndex() {
        block0: {
            int n = -1786169702;
            n = Integer.rotateLeft(n * 1301613315, 14) ^ 0xE8ED307D;
            n = Integer.rotateRight(System.identityHashCode((Object)this) ^ n, 28);
            int n2 = n ^ 0xDAB527C2;
            if ((n2 ^ n) == -625662014) break block0;
            int cfr_ignored_0 = (0x4F3C1158 ^ n) - 1221729859;
        }
        return this.dhrs;
    }

    private static tthdh[] $values() {
        int n = bbth.sthy_2(-1881550278);
        int n2 = n ^ 0x3B49BD34;
        if ((n2 ^ n) != 994688308) {
            int cfr_ignored_0 = Integer.rotateRight(0xB4906F0E ^ n, 9) - -505736723;
        }
        tthdh[] tthdhArray = new tthdh[Integer.rotateLeft(0xFBD9875E ^ 0xFBC5875E, 14)];
        tthdhArray[0] = tdha_2;
        tthdhArray[1] = dhhz_4;
        tthdhArray[2] = khhr;
        tthdhArray[3] = jshs_2;
        tthdhArray[4] = dhry;
        tthdhArray[5] = ab;
        tthdhArray[Integer.rotateLeft((int)(0x27025E93 ^ 0x27025EA3), (int)29)] = dkr;
        return tthdhArray;
    }

    private static String[] hhsof2uzcx(String string) {
        block0: {
            int n = 1811338801;
            n = Integer.rotateLeft(n * 1863541799, 9) ^ 0xBBB09696;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 24);
            int n2 = n ^ 0x436C5A8D;
            if ((n2 ^ n) == 1131174541) break block0;
            int cfr_ignored_0 = (0x289A8CBC ^ n) + 488819212;
        }
        return string.split("\u0001\u000f", -1);
    }

    private static CallSite hojvps9702rqg6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1105161798;
            n3 = Integer.rotateLeft(n3 * -811671027, 12) ^ 0x345D39CC;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 25);
            String string4 = string2;
            n3 = (string4 != null ? System.identityHashCode(string4) : 0) ^ n3;
            int n4 = n3 ^ 0xEFC0F05D;
            if ((n4 ^ n3) != -272568227) {
                int cfr_ignored_0 = (0x51E061E7 ^ n3) - 1131412818;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ jms ^ string.hashCode() ^ n2 + tdhq + i * -614540859) + jms) ^ tdhq));
            }
            String[] stringArray = tthdh.hhsof2uzcx(new String(cArray));
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

    private static String[] u3skld3g(String string) {
        return string.split("\u0002\u0012", -1);
    }

    private static CallSite a36qy9s07w1hat(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ f6e5eholz0v5 ^ string.hashCode() ^ n2 + l6wbf2iza9 + i * 463727731) + f6e5eholz0v5) ^ l6wbf2iza9));
            }
            String[] stringArray = tthdh.u3skld3g(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

