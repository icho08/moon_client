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
import us.m0vy.moondlc.m0vyguard.bshs_2;

public final class qz
extends Enum {
    public static final /* enum */ qz rza_2;
    public static final /* enum */ qz bhy;
    public static final /* enum */ qz thfk;
    public static final /* enum */ qz khjn;
    public static final /* enum */ qz hfdh;
    public static final /* enum */ qz thts_4;
    public static final /* enum */ qz thkhm;
    public static final /* enum */ qz jtt_3;
    private final String ryd_2;
    private final String shld_2;
    private static final qz[] dhqz_2;
    private static final int hsm = 2007735710;
    private static final int smt = -1582249573;
    private static final int uuuagz1z0x = -692628208;
    private static final int gaict3yp84 = 1410977395;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";

    public static qz[] values() {
        block0: {
            int n = bshs_2.rkhy(598303359);
            int n2 = n ^ 0x5DC901BB;
            if ((n2 ^ n) == 1573454267) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x7E6063C4 ^ n, 18) - 1376367607;
        }
        return (qz[])dhqz_2.clone();
    }

    public static qz valueOf(String string) {
        block0: {
            int n = 327218710;
            n = Integer.rotateLeft(n * 977505927, 11) ^ 0xBF90902A;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 12);
            int n2 = n ^ 0x6BB80B7;
            if ((n2 ^ n) == 112951479) break block0;
            int cfr_ignored_0 = (0x153B76A1 ^ n) + -1241886852;
        }
        return Enum.valueOf(qz.class, string);
    }

    /*
     * WARNING - void declaration
     */
    private qz() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.ryd_2 = var3_2;
        this.shld_2 = var4_1;
    }

    @Generated
    public String getIcon() {
        block0: {
            int n = -1989815953;
            n = Integer.rotateLeft(n * -685556783, 28) ^ 0xB2A4C08F;
            n = Integer.rotateRight(System.identityHashCode((Object)this) ^ n, 14);
            int n2 = n ^ 0x52BC0A08;
            if ((n2 ^ n) == 1388055048) break block0;
            int cfr_ignored_0 = (0xDBD9DB67 ^ n) + 389433898;
        }
        return this.shld_2;
    }

    @Generated
    public String getName() {
        block0: {
            int n = -1939012969;
            n = Integer.rotateLeft(n * 1663443041, 17) ^ 0x3D15456B;
            n = Integer.rotateLeft(System.identityHashCode((Object)this) ^ n, 9);
            int n2 = n ^ 0x7BD4F6AD;
            if ((n2 ^ n) == 2077554349) break block0;
            int cfr_ignored_0 = (0xF7B9F43A ^ n) + -634530477;
        }
        return this.ryd_2;
    }

    private static qz[] $values() {
        int n = bshs_2.rkhy(1255291075);
        int n2 = n ^ 0x4AB699C8;
        if ((n2 ^ n) != 1253480904) {
            int cfr_ignored_0 = Integer.rotateRight(0x64A10B ^ n, 3) + 277684112;
        }
        qz[] qzArray = new qz[Integer.rotateLeft(0xD84F6FA9 ^ 0xDA4F6FA9, 10)];
        qzArray[0] = rza_2;
        qzArray[1] = bhy;
        qzArray[2] = thfk;
        qzArray[3] = khjn;
        qzArray[4] = hfdh;
        qzArray[5] = thts_4;
        qzArray[1996313984 - 1996313978] = thkhm;
        qzArray[Integer.rotateLeft((int)(0xFAA39DF ^ 0xF9239DF), (int)13)] = jtt_3;
        return qzArray;
    }

    private static qz[] $values$() {
        int n = -300549313;
        int n2 = (n = Integer.rotateLeft(n * -1560749639, 28) ^ 0xBE40075A) ^ 0x3E301F4D;
        if ((n2 ^ n) != 1043341133) {
            int cfr_ignored_0 = (0xD025E472 ^ n) + 205524365;
        }
        qz[] qzArray = new qz[0x475DFCEE ^ 0x475DFCE6];
        qzArray[0] = rza_2;
        qzArray[1] = bhy;
        qzArray[2] = thfk;
        qzArray[3] = khjn;
        qzArray[4] = hfdh;
        qzArray[5] = thts_4;
        qzArray[1630744968 - 1630744962] = thkhm;
        qzArray[Integer.reverse((int)116580488) ^ 0x11074F67] = jtt_3;
        return qzArray;
    }

    private static String[] gpbqwmmu8ledoz(String string) {
        block0: {
            int n = bshs_2.rkhy(-308835577);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x503B2C1A;
            if ((n2 ^ n) == 1346055194) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xBDACA71D ^ n, 10) - -62530626) * -1112758499;
            int cfr_ignored_1 = (int)(0x7F1E092027D4EB4FL ^ (long)n ^ 0xEF30831A2DB953EDL);
        }
        return string.split("\u0005\u0013", -1);
    }

    private static CallSite i2bfnzigv53fem(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -157051128;
            n3 = Integer.rotateLeft(n3 * -258404199, 11) ^ 0x94A114D2;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xC15DDFDE;
            if ((n4 ^ n3) != -1050812450) {
                int cfr_ignored_0 = (0x37FE48D6 ^ n3) + -474286955;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ hsm ^ string.hashCode()) + (n2 + smt) + i ^ hsm, 24) + smt);
            }
            String[] stringArray = qz.gpbqwmmu8ledoz(new String(cArray));
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

    private static String[] hgw0gt9q(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite gk22u8x2rj7sc(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ uuuagz1z0x ^ string.hashCode() ^ n2 + gaict3yp84 + i * -1418407685) + uuuagz1z0x) ^ gaict3yp84));
            }
            String[] stringArray = qz.hgw0gt9q(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

