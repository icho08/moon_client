/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_310;
import us.m0vy.moondlc.m0vyguard.zh_4;
import us.m0vy.moondlc.m0vyguard.mgh;
import us.m0vy.moondlc.m0vyguard.yf;

public class tdd {
    private long thkhgh = System.nanoTime();
    private int thta_2;
    private final boolean rky;
    private int dhsz_3 = 0;
    private long bsz_4 = 0L;
    private static final int shhj_2 = -1052183881;
    private static final int dsdh = 84723474;
    private static final int yvontu8i8d62 = -547357716;
    private static final int saym79l = -528989410;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int miuanzqcyc1gqc;

    public tdd(boolean bl) {
        this.rky = bl;
        this.thta_2 = 0;
    }

    public void khhm_2(int n, zh_4 ... zhArray) {
        try {
            int n2 = 1861485445;
            n2 = Integer.rotateLeft(n2 * 729649999, 12) ^ 0xCE338E7B;
            n2 = System.identityHashCode(this) ^ n2;
            n2 = Integer.rotateLeft(n ^ n2, 11);
            int n3 = n2 ^ 0x6087557;
            if ((n3 ^ n2) != 101217623) {
                int cfr_ignored_0 = (0x68FC76D2 ^ n2) - 858596368;
            }
            if ((0x2D6 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            tdd.zthh_2();
            throw null;
        }
        if (this.dhsz_3 != n) {
            this.bsz_4 = (0x54CF05BC44E75593L ^ 0x54CF05BC7F7D9F93L) / (long)n;
            this.dhsz_3 = n;
        }
        long l = System.nanoTime();
        long l2 = l - this.thkhgh;
        this.thta_2 += (int)(l2 / this.bsz_4);
        this.thkhgh += (long)this.thta_2 * this.bsz_4;
        this.thta_2 = tdd.slj(this.thta_2, this.rky ? Math.min(this.dhsz_3, tdd.dbz_4(class_310.method_1551())) : this.dhsz_3);
        while (this.thta_2 > 0) {
            for (zh_4 zh2_2 : zhArray) {
                zh2_2.execute();
            }
            --this.thta_2;
        }
    }

    private static void zthh_2() {
        int n = mgh.tsd_2(-1369764479);
        int n2 = n ^ 0x925A3739;
        if ((n2 ^ n) != -1839581383) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x3C013AB8 ^ n, 10) + 1216592771) * 1006713529;
        }
        yf.athz_2();
    }

    private static int dbz_4(class_310 class_3102) {
        block0: {
            int n = -378517698;
            n = Integer.rotateLeft(n * 672256935, 7) ^ 0x40E7B831;
            class_310 class_3103 = class_3102;
            n = Integer.rotateRight((class_3103 != null ? System.identityHashCode(class_3103) : 0) ^ n, 26);
            int n2 = n ^ 0x50D1AA6;
            if ((n2 ^ n) == 84744870) break block0;
            int cfr_ignored_0 = (0xEC7D5D98 ^ n) - -1278966478;
        }
        return class_3102.method_47599();
    }

    private static int slj(int n, int n2) {
        block0: {
            int n3 = mgh.tsd_2(-1596294132);
            int n4 = n3 ^ 0xD704D894;
            if ((n4 ^ n3) == -687548268) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x77DEA498 ^ n3, 17) + -2007790173) * 2011079833;
        }
        return Math.min(n, n2);
    }

    private static String[] djr(String string) {
        block0: {
            int n = 1235246979;
            n = Integer.rotateLeft(n * 751988595, 13) ^ 0x9005EC61;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x4AA1849F;
            if ((n2 ^ n) == 1252099231) break block0;
            int cfr_ignored_0 = (0x301DB1C ^ n) - -61837761;
        }
        return string.split("\u0007\u0014", -1);
    }

    private static CallSite dhhy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 553941541;
            n3 = Integer.rotateLeft(n3 * 1394433381, 9) ^ 0x7CFEF1B0;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 11);
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 6);
            int n4 = n3 ^ 0x8FFAFD5D;
            if ((n4 ^ n3) != -1879376547) {
                int cfr_ignored_0 = (0xAEFE8778 ^ n3) - 1850027589;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ shhj_2 ^ string.hashCode()) + (n2 + dsdh) + i ^ shhj_2, 6) + dsdh);
            }
            String[] stringArray = tdd.djr(new String(cArray));
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

    private static String[] neh4fdyear(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite pzdq9yzs57ybp(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ yvontu8i8d62 ^ string.hashCode() ^ n2 + saym79l + i * -1971612239) + yvontu8i8d62) ^ saym79l));
            }
            String[] stringArray = tdd.neh4fdyear(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

