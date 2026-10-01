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

public final class bda
extends Enum {
    public static final /* enum */ bda ta_4;
    public static final /* enum */ bda jdhth;
    public static final /* enum */ bda zhz_3;
    public static final /* enum */ bda khkz;
    public static final /* enum */ bda shdf;
    public static final /* enum */ bda bsha_2;
    public static final /* enum */ bda shd_8;
    public static final /* enum */ bda thbr;
    private final int jtm;
    private static final bda[] ztth;
    private static final int aku14rpo7jo = -1035245371;
    private static final int xam6bs81sd0 = 862966100;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";

    public static bda[] values() {
        block0: {
            int n = -211357948;
            int n2 = (n = Integer.rotateLeft(n * 1134217401, 27) ^ 0xC891E5E8) ^ 0x99C0DD76;
            if ((n2 ^ n) == -1715413642) break block0;
            int cfr_ignored_0 = (0x6AA63272 ^ n) - 257990344;
        }
        return (bda[])ztth.clone();
    }

    public static bda valueOf(String string) {
        block0: {
            int n = 111222945;
            n = Integer.rotateLeft(n * -1220664381, 14) ^ 0x6E7373A3;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 17);
            int n2 = n ^ 0xA5CD17D2;
            if ((n2 ^ n) == -1513285678) break block0;
            int cfr_ignored_0 = (0xA36C3773 ^ n) + 172491642;
        }
        return (bda)bda.v7loh0zzjapmb(bda.class, string);
    }

    @Generated
    public int getPriority() {
        block0: {
            int n = -1603048728;
            int n2 = (n = Integer.rotateLeft(n * -1287994101, 28) ^ 0xF45A3B22) ^ 0x536A3EA6;
            if ((n2 ^ n) == 1399471782) break block0;
            int cfr_ignored_0 = (0xF319544E ^ n) + 107315532;
        }
        return this.jtm;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    @Generated
    private bda() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.jtm = var3_2;
    }

    private static bda[] $values() {
        int n = -1721802108;
        int n2 = (n = Integer.rotateLeft(n * -1118077385, 17) ^ 0x1C8F07B2) ^ 0xAE448F70;
        if ((n2 ^ n) != -1371238544) {
            int cfr_ignored_0 = (0x371BEDF4 ^ n) + 1711705029;
        }
        bda[] bdaArray = new bda[-1007447561 + 1007447569];
        bdaArray[0] = ta_4;
        bdaArray[1] = jdhth;
        bdaArray[2] = zhz_3;
        bdaArray[3] = khkz;
        bdaArray[4] = shdf;
        bdaArray[5] = bsha_2;
        bdaArray[-2104091756 - -2104091762] = shd_8;
        bdaArray[672560847 - 672560840] = thbr;
        return bdaArray;
    }

    private static Enum v7loh0zzjapmb(Class clazz, String string) {
        block0: {
            int n = 1396991815;
            int n2 = (n = Integer.rotateLeft(n * -840139331, 24) ^ 0xC192758F) ^ 0x55B50DD9;
            if ((n2 ^ n) == 1437928921) break block0;
            int cfr_ignored_0 = (0x6F16A9E ^ n) - -1837365068;
        }
        return Enum.valueOf(clazz, string);
    }

    private static String[] v0d9m98okf3geh(String string) {
        return string.split("\b\u0018", -1);
    }

    private static CallSite w7s9e9it7u3i(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ aku14rpo7jo ^ string.hashCode()) + (n2 + xam6bs81sd0) + i ^ aku14rpo7jo, 6) + xam6bs81sd0);
            }
            String[] stringArray = bda.v0d9m98okf3geh(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

