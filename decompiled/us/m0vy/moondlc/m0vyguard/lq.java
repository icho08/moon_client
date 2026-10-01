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
import java.util.function.Consumer;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.tthkh;

public class lq
implements Comparable {
    private static int shnh_2;
    private final int sdhj_2;
    private final Consumer dhf;
    private final long thwh;
    private static final int ska = -1035840668;
    private static final int zzs_4 = 1696721032;
    private static final int lsjjupgo9ewt = -802963577;
    private static final int a2j22xpsbjo25 = -1503069741;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int dy4chwfs2i;

    public lq(int n, Consumer consumer) {
        this.sdhj_2 = n;
        this.dhf = consumer;
        this.thwh = shnh_2++;
    }

    public lq(Consumer consumer) {
        this(0, consumer);
    }

    public int compareTo(lq lq2) {
        int n;
        int n2 = 50178831;
        n2 = Integer.rotateLeft(n2 * -1772688023, 8) ^ 0x4A74206E;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 7);
        lq lq3 = lq2;
        n2 = (lq3 != null ? System.identityHashCode(lq3) : 0) ^ n2;
        int n3 = n2 ^ 0xF7E194FF;
        if ((n3 ^ n2) != -136211201) {
            int cfr_ignored_0 = (0xF51C3FF0 ^ n2) + 1834472363;
        }
        return (n = Integer.compare(lq2.sdhj_2, this.sdhj_2)) != 0 ? n : Long.compare(this.thwh, lq2.thwh);
    }

    @Generated
    public int getPriority() {
        block0: {
            int n = tthkh.ghdhr(1717796141);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 24);
            int n2 = n ^ 0xEBA47849;
            if ((n2 ^ n) == -341542839) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x8DC70564 ^ n, 4) - 796345943;
        }
        return this.sdhj_2;
    }

    @Generated
    public Consumer getHandler() {
        block0: {
            int n = -1094774719;
            int n2 = (n = Integer.rotateLeft(n * 149880877, 6) ^ 0xCEFBBFF9) ^ 0x33F0C5B2;
            if ((n2 ^ n) == 871417266) break block0;
            int cfr_ignored_0 = (0x8D4FD5F3 ^ n) - -2125065627;
        }
        return this.dhf;
    }

    private static String[] awxbs6za1(String string) {
        block0: {
            int n = 791177272;
            int n2 = (n = Integer.rotateLeft(n * -451604363, 3) ^ 0x351C7703) ^ 0x3EDF949A;
            if ((n2 ^ n) == 1054839962) break block0;
            int cfr_ignored_0 = (0x11F7FCA2 ^ n) - -443564112;
        }
        return string.split("\u0001\u001c", -1);
    }

    private static CallSite dldua6717y7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -2123620670;
            n3 = Integer.rotateLeft(n3 * -1282073059, 12) ^ 0xEA9CB216;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 27);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x7CBD985A;
            if ((n4 ^ n3) != 2092800090) {
                int cfr_ignored_0 = (0xFDD18698 ^ n3) - 269557138;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ska ^ string.hashCode()) + (n2 + zzs_4) + i ^ ska, 3) + zzs_4);
            }
            String[] stringArray = lq.awxbs6za1(new String(cArray));
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

    private static String[] izj1a9at2(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite c41bjqjc7du(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ lsjjupgo9ewt ^ string.hashCode() ^ n2 + a2j22xpsbjo25 + i * -1649366549) + lsjjupgo9ewt) ^ a2j22xpsbjo25));
            }
            String[] stringArray = lq.izj1a9at2(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

