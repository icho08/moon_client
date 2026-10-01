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
import us.m0vy.moondlc.m0vyguard.bzdh;
import us.m0vy.moondlc.m0vyguard.yf;

public class tkhd_2 {
    private long dhzt;
    private static final int jddh_2 = -921394183;
    private static final int slt_2 = -1311379735;
    private static final int y57e6nntjh = -1549309264;
    private static final int k2j05vpv1v = -1264609626;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int y92u1yf1sq9f0t;

    public tkhd_2() {
        this.zat();
    }

    public boolean tagh(long l) {
        try {
            int n = 1731271888;
            n = Integer.rotateLeft(n * -1191195109, 16) ^ 0xB360921;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 8);
            n = (int)l ^ n;
            int n2 = n ^ 0xDAF3F7C2;
            if ((n2 ^ n) != -621545534) {
                int cfr_ignored_0 = (0xBDC2EB12 ^ n) - 179859393;
            }
            if ((0x19D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (tkhd_2.tha_3()) {
            throw null;
        }
        return System.currentTimeMillis() - l >= this.dhzt;
    }

    public void zat() {
        int n = -519229890;
        n = Integer.rotateLeft(n * -1427119141, 8) ^ 0x6EF0D447;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 7);
        int n2 = n ^ 0xF04C9BAA;
        if ((n2 ^ n) != -263414870) {
            int cfr_ignored_0 = (0x1141B594 ^ n) - -497082281;
        }
        this.dhzt = tkhd_2.dra_2();
    }

    public long azh_2() {
        block0: {
            int n = -138718485;
            n = Integer.rotateLeft(n * -1716653279, 11) ^ 0xCF870EB6;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x75FDA346;
            if ((n2 ^ n) == 1979556678) break block0;
            int cfr_ignored_0 = (0x8246F1AD ^ n) - 756848312;
        }
        return System.currentTimeMillis() - this.dhzt;
    }

    @Generated
    public long bqd() {
        block0: {
            int n = 1015142552;
            int n2 = (n = Integer.rotateLeft(n * -738689111, 19) ^ 0xFF27E442) ^ 0x4104B1C4;
            if ((n2 ^ n) == 1090826692) break block0;
            int cfr_ignored_0 = (0x7D85695C ^ n) + 967655937;
        }
        return this.dhzt;
    }

    @Generated
    public void dhnl(long l) {
        int n = 1820972866;
        n = Integer.rotateLeft(n * -394281075, 19) ^ 0x3D49A8A;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 25);
        int n2 = n ^ 0x972F1E9D;
        if ((n2 ^ n) != -1758519651) {
            int cfr_ignored_0 = (0xFBA6C9DF ^ n) + -263464126;
        }
        this.dhzt = l;
    }

    private static boolean tha_3() {
        block0: {
            int n = 1866494307;
            int n2 = (n = Integer.rotateLeft(n * -787735461, 26) ^ 0x6D2E7423) ^ 0x80EB5112;
            if ((n2 ^ n) == -2132061934) break block0;
            int cfr_ignored_0 = (0xEFAB2071 ^ n) - 897776595;
        }
        return yf.dnkh();
    }

    private static long dra_2() {
        block0: {
            int n = bzdh.shlt_2(-460903555);
            int n2 = n ^ 0xD72B23C2;
            if ((n2 ^ n) == -685038654) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x33AC08BF ^ n, 9) - 1177726556) * 866912447;
        }
        return System.currentTimeMillis();
    }

    private static String[] hssh_2(String string) {
        block0: {
            int n = 125891237;
            int n2 = (n = Integer.rotateLeft(n * -464525801, 14) ^ 0x84590C1A) ^ 0x91A60064;
            if ((n2 ^ n) == -1851391900) break block0;
            int cfr_ignored_0 = (0x9626F2C1 ^ n) + 1101788069;
        }
        return string.split("\u0006\u0011", -1);
    }

    private static CallSite zsa_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 666698256;
            n3 = Integer.rotateLeft(n3 * -1316474405, 26) ^ 0x2FB43AAA;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            n3 = Integer.rotateLeft(n ^ n3, 27);
            int n4 = n3 ^ 0x6FFE63CA;
            if ((n4 ^ n3) != 1878942666) {
                int cfr_ignored_0 = (0x484361DA ^ n3) - 528370393;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ jddh_2 ^ string.hashCode()) + (n2 + slt_2) + i ^ jddh_2, 23) + slt_2);
            }
            String[] stringArray = tkhd_2.hssh_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ybp7fcrelll0h(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite unev0y51hr4y6a(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ y57e6nntjh ^ string.hashCode() ^ n2 + k2j05vpv1v ^ i * -2126631577 ^ y57e6nntjh, 27) ^ k2j05vpv1v));
            }
            String[] stringArray = tkhd_2.ybp7fcrelll0h(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

