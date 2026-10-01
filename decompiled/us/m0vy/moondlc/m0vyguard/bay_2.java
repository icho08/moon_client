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
import us.m0vy.moondlc.m0vyguard.bsdh;

public final class bay_2
extends Enum {
    public static final /* enum */ bay_2 tdhdh;
    public static final /* enum */ bay_2 mw;
    public static final /* enum */ bay_2 zdhh;
    public static final /* enum */ bay_2 hzgh;
    public static final /* enum */ bay_2 shsdh;
    public static final /* enum */ bay_2 smdh;
    public static final /* enum */ bay_2 rrh;
    public static final /* enum */ bay_2 dhza;
    private final long thdy;
    private static final bay_2[] bhz_2;
    private static final int ttf = 460322074;
    private static final int khghw = 1144709523;
    private static final int a90h8003 = -1402737105;
    private static final int yxyt423090 = 126656449;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";

    public static bay_2[] values() {
        block0: {
            int n = bsdh.dtdh(644533824);
            int n2 = n ^ 0xCBBECBA1;
            if ((n2 ^ n) == -876688479) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xEDD405E1 ^ n, 16) + -787851910;
            int cfr_ignored_1 = (int)(0x2F66ABDC27D4EB4FL ^ (long)n ^ 0xAAC8831A2DB9F31CL);
        }
        return (bay_2[])bhz_2.clone();
    }

    public static bay_2 valueOf(String string) {
        block0: {
            int n = 1984708650;
            n = Integer.rotateLeft(n * -462354969, 7) ^ 0x6C13D6DE;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xA837DA67;
            if ((n2 ^ n) == -1472734617) break block0;
            int cfr_ignored_0 = (0xDE7B9A4D ^ n) + -1495401311;
        }
        return Enum.valueOf(bay_2.class, string);
    }

    @Generated
    public long getCode() {
        block0: {
            int n = 1468809970;
            int n2 = (n = Integer.rotateLeft(n * 1729275333, 17) ^ 0x204692A) ^ 0xEE46FF70;
            if ((n2 ^ n) == -297336976) break block0;
            int cfr_ignored_0 = (0xB9CABD82 ^ n) - 799019679;
        }
        return this.thdy;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    @Generated
    private bay_2() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.thdy = var3_2;
    }

    private static bay_2[] $values() {
        int n = -418385056;
        int n2 = (n = Integer.rotateLeft(n * 524765975, 10) ^ 0xEBE34681) ^ 0x915DAFE4;
        if ((n2 ^ n) != -1856131100) {
            int cfr_ignored_0 = (0x76525C84 ^ n) - 2090240536;
        }
        bay_2[] bayArray = new bay_2[-1778188103 - -1778188111];
        bayArray[0] = tdhdh;
        bayArray[1] = mw;
        bayArray[2] = zdhh;
        bayArray[3] = hzgh;
        bayArray[4] = shsdh;
        bayArray[5] = smdh;
        bayArray[0x1C4C2057 ^ 0x1C4C2051] = rrh;
        bayArray[-1618955149 - -1618955156] = dhza;
        return bayArray;
    }

    private static String[] oa8b0wxoqugr2(String string) {
        int n = -1996203549;
        int n2 = (n = Integer.rotateLeft(n * -58854161, 18) ^ 0x7DC7C301) ^ 0x2EE8D395;
        if ((n2 ^ n) != 787010453) {
            int cfr_ignored_0 = (0xA7EC8A76 ^ n) + -1046449690;
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

    private static CallSite hb7y684voe5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 2014319502;
            n3 = Integer.rotateLeft(n3 * 365147791, 14) ^ 0xF798D3A4;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 5);
            int n4 = n3 ^ 0xA33CFDD4;
            if ((n4 ^ n3) != -1556283948) {
                int cfr_ignored_0 = (0xDB2CEE5A ^ n3) + 878892602;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ttf ^ string.hashCode() ^ n2 + khghw ^ i * -498818957 ^ ttf, 15) ^ khghw));
            }
            String[] stringArray = bay_2.oa8b0wxoqugr2(new String(cArray));
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

    private static String[] hs9w63he(String string) {
        return string.split("\u0005\u001c", -1);
    }

    private static CallSite j2f553f984ok(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ a90h8003 ^ string.hashCode() ^ n2 + yxyt423090 + i * 1897318297) + a90h8003) ^ yxyt423090));
            }
            String[] stringArray = bay_2.hs9w63he(new String(cArray));
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

