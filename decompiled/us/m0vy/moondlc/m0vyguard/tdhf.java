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
import us.m0vy.moondlc.m0vyguard.btm_2;

public final class tdhf
extends Enum {
    public static final /* enum */ tdhf zdw_2;
    public static final /* enum */ tdhf bkt;
    public static final /* enum */ tdhf zghd;
    public static final /* enum */ tdhf tsdh;
    private final String dhkhq;
    private static final tdhf[] wa;
    private static final int am = 739392904;
    private static final int thjt = 233612057;
    private static final int u80zy0dkbt5c = -1578444487;
    private static final int ti6kg3gfunaj = 415413929;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";

    public static tdhf[] values() {
        block0: {
            int n = btm_2.ryt_2(1022994673);
            int n2 = n ^ 0x6167FEB9;
            if ((n2 ^ n) == 1634205369) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x5D9E5648 ^ n, 14) + 1518998003;
        }
        return (tdhf[])wa.clone();
    }

    public static tdhf valueOf(String string) {
        block0: {
            int n = btm_2.ryt_2(-994523366);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 11);
            int n2 = n ^ 0x65FFC446;
            if ((n2 ^ n) == 1711260742) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xA147035C ^ n, 7) - -1946744993) * -1589181603;
        }
        return Enum.valueOf(tdhf.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private tdhf() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.dhkhq = var3_2;
    }

    @Generated
    public String getCode() {
        block0: {
            int n = btm_2.ryt_2(1055514108);
            n = System.identityHashCode((Object)this) ^ n;
            int n2 = n ^ 0x4F1D12B;
            if ((n2 ^ n) == 82956587) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x3A180CD7 ^ n, 10) - 222768452) * 974654679;
        }
        return this.dhkhq;
    }

    private static tdhf[] $values() {
        int n = -1753475094;
        int n2 = (n = Integer.rotateLeft(n * 338630577, 15) ^ 0x1091BA7E) ^ 0xAF9E0E18;
        if ((n2 ^ n) != -1348596200) {
            int cfr_ignored_0 = (0x38E219F2 ^ n) + 1630488451;
        }
        return new tdhf[]{zdw_2, bkt, zghd, tsdh};
    }

    private static String[] m0ro9gulxd8u8(String string) {
        int n = -887850072;
        int n2 = (n = Integer.rotateLeft(n * -1001509325, 24) ^ 0x8F036BCB) ^ 0x3F84103A;
        if ((n2 ^ n) != 1065619514) {
            int cfr_ignored_0 = (0xF4906B92 ^ n) - -453500194;
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

    private static CallSite w790k9wjonm(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1867044681;
            n3 = Integer.rotateLeft(n3 * 325316333, 27) ^ 0x25524EEC;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 13);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xD2E4FA18;
            if ((n4 ^ n3) != -756745704) {
                int cfr_ignored_0 = (0x4253D2AF ^ n3) - -442364405;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ am ^ string.hashCode() ^ n2 + thjt + i * 695320167) + am) ^ thjt));
            }
            String[] stringArray = tdhf.m0ro9gulxd8u8(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType3) : lookup.findVirtual(clazz, stringArray[1], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] xlcowj51nni4jo(String string) {
        return string.split("\u0003\u0013", -1);
    }

    private static CallSite c3besbtqrjyuaz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ u80zy0dkbt5c ^ string.hashCode()) + (n2 + ti6kg3gfunaj) + i ^ u80zy0dkbt5c, 21) + ti6kg3gfunaj);
            }
            String[] stringArray = tdhf.xlcowj51nni4jo(new String(cArray));
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

