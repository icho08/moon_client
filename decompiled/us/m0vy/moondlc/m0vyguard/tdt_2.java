/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.tjm;

public final class tdt_2
extends Enum {
    public static final /* enum */ tdt_2 swh_2;
    public static final /* enum */ tdt_2 tfl;
    public static final /* enum */ tdt_2 rzdh_2;
    public static final /* enum */ tdt_2 thtq;
    private final String zzth_2;
    private static final tdt_2[] dlt;
    private static final int jtj = 1601840030;
    private static final int thshb = -282523573;
    private static final int pm1ciz6q07 = 434602572;
    private static final int dmwvje3ix = -1859452408;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";

    public static tdt_2[] values() {
        block0: {
            int n = 703832175;
            int n2 = (n = Integer.rotateLeft(n * -1861124263, 22) ^ 0xEF4611D) ^ 0x1EB840D3;
            if ((n2 ^ n) == 515391699) break block0;
            int cfr_ignored_0 = (0x374BE0BC ^ n) + -208458300;
        }
        return (tdt_2[])dlt.clone();
    }

    public static tdt_2 valueOf(String string) {
        block0: {
            int n = tjm.khdhz(-316701298);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 22);
            int n2 = n ^ 0x1C706C6E;
            if ((n2 ^ n) == 477129838) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xF16FE9E0 ^ n, 17) + 1089139035;
        }
        return Enum.valueOf(tdt_2.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private tdt_2() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzth_2 = var3_2;
    }

    public String getKey() {
        block0: {
            int n = tjm.khdhz(-2076928931);
            n = Integer.rotateLeft(System.identityHashCode((Object)this) ^ n, 19);
            int n2 = n ^ 0xA51CC498;
            if ((n2 ^ n) == -1524841320) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x212850C5 ^ n, 7) - 138372886;
            int cfr_ignored_1 = (int)(0xE39AFEF827D4EB4FL ^ (long)n ^ 0x80831A2DB86AE4L);
        }
        return this.zzth_2;
    }

    public static tdt_2 from(String string) {
        int n = 61481039;
        n = Integer.rotateLeft(n * 1521605759, 14) ^ 0xE6B68507;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 23);
        int n2 = n ^ 0x983C3AF5;
        if ((n2 ^ n) != -1740883211) {
            int cfr_ignored_0 = (0x9B961ABA ^ n) - -30345693;
        }
        for (tdt_2 tdt2 : tdt_2.values()) {
            if (!tdt2.zzth_2.equals(string)) continue;
            return tdt2;
        }
        return thtq;
    }

    private static tdt_2[] $values() {
        int n = tjm.khdhz(-786761941);
        int n2 = n ^ 0x9D3CCE34;
        if ((n2 ^ n) != -1656959436) {
            int cfr_ignored_0 = (Integer.rotateRight(0x4C26391F ^ n, 12) - 1023314428) * 1277573407;
        }
        return new tdt_2[]{swh_2, tfl, rzdh_2, thtq};
    }

    private static String[] nq506epnhp1v(String string) {
        block0: {
            int n = -1902875341;
            int n2 = (n = Integer.rotateLeft(n * -317086565, 8) ^ 0x5D62FC7) ^ 0x72B11CE2;
            if ((n2 ^ n) == 1924209890) break block0;
            int cfr_ignored_0 = (0xFC2571D1 ^ n) + -1056838757;
        }
        return string.split("\u0007\u001d", -1);
    }

    private static CallSite ydvz9alarfs4i(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1409532277;
            n3 = Integer.rotateLeft(n3 * -1169305813, 4) ^ 0x1DD724A7;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xBB4E6B65;
            if ((n4 ^ n3) != -1152488603) {
                int cfr_ignored_0 = (0x10B255EE ^ n3) + -987721435;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ jtj ^ string.hashCode() ^ n2 + thshb + i * 1964238161) + jtj) ^ thshb));
            }
            String[] stringArray = tdt_2.nq506epnhp1v(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] tlbybqcj(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite n534jpbw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ pm1ciz6q07 ^ string.hashCode() ^ n2 + dmwvje3ix + i * -1717008591) + pm1ciz6q07) ^ dmwvje3ix));
            }
            String[] stringArray = tdt_2.tlbybqcj(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

