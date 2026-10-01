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
import us.m0vy.moondlc.m0vyguard.bkw;
import us.m0vy.moondlc.m0vyguard.bma_2;

public final class tkhm
extends Enum
implements bma_2 {
    public static final /* enum */ tkhm zkh;
    public static final /* enum */ tkhm ttw_2;
    public static final /* enum */ tkhm hj;
    public static final /* enum */ tkhm ws;
    private final String kj;
    private static final tkhm[] dhjt_2;
    private static final int z10ni8jze6 = 1626071406;
    private static final int itwbfk23zsph = 318150770;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";

    public static tkhm[] values() {
        block0: {
            int n = -765112569;
            int n2 = (n = Integer.rotateLeft(n * -1678620441, 8) ^ 0xAA406B34) ^ 0x4C81351C;
            if ((n2 ^ n) == 1283536156) break block0;
            int cfr_ignored_0 = (0x9EE47A1B ^ n) + 1104072477;
        }
        return (tkhm[])dhjt_2.clone();
    }

    public static tkhm valueOf(String string) {
        block0: {
            int n = -1796038385;
            int n2 = (n = Integer.rotateLeft(n * 1813889399, 12) ^ 0x4DD237E4) ^ 0x2FC273D;
            if ((n2 ^ n) == 50079549) break block0;
            int cfr_ignored_0 = (0x960E8632 ^ n) + 1719605220;
        }
        return (tkhm)tkhm.gl0sqi5eqthj(tkhm.class, string);
    }

    @Override
    public String getName() {
        block0: {
            int n = -942766121;
            n = Integer.rotateLeft(n * 186150705, 21) ^ 0x2705A976;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 26);
            int n2 = n ^ 0x7DB30573;
            if ((n2 ^ n) == 2108884339) break block0;
            int cfr_ignored_0 = (0xBA7D82A4 ^ n) - -1291031128;
        }
        return this.kj;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    @Generated
    private tkhm() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.kj = var3_2;
    }

    private static tkhm[] $values() {
        int n = bkw.hst_2(-2104845648);
        int n2 = n ^ 0xEA7DBFC1;
        if ((n2 ^ n) != -360857663) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x68F72571 ^ n, 16) + -1169479702) * 1761027441;
            int cfr_ignored_1 = (int)(0xAA458B4C27D4EB4FL ^ (long)n ^ 0xEBE8831A2DB8F95AL);
        }
        return new tkhm[]{zkh, ttw_2, hj, ws};
    }

    private static Enum gl0sqi5eqthj(Class clazz, String string) {
        block0: {
            int n = -1374663099;
            n = Integer.rotateLeft(n * 748092943, 13) ^ 0x3DE9998E;
            Class clazz2 = clazz;
            n = Integer.rotateRight((clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n, 29);
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 9);
            int n2 = n ^ 0xD1047F4E;
            if ((n2 ^ n) == -788234418) break block0;
            int cfr_ignored_0 = (0x7F14310B ^ n) - -1514605362;
        }
        return Enum.valueOf(clazz, string);
    }

    private static String[] eu4t869opdoq(String string) {
        return string.split("\u0004\u0013", -1);
    }

    private static CallSite g41qxcoulyedp(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ z10ni8jze6 ^ string.hashCode()) + (n2 + itwbfk23zsph) + i ^ z10ni8jze6, 9) + itwbfk23zsph);
            }
            String[] stringArray = tkhm.eu4t869opdoq(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

