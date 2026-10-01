/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.bshm;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.wr;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.mixin.accessors.LivingEntityAccessor;

public class rsh_3
implements dl {
    private final bshm tyh_2 = bshm.ztr_4();
    private long shwn = 0L;
    private long hl = System.currentTimeMillis();
    private static final int ttq_2 = 1235197637;
    private static final int mdh = 136421602;
    private static final int i6quwpe4k9f = 438273182;
    private static final int kijwndxklw = 1468168044;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ao5cr5k99fb0;

    public boolean rna() {
        block0: {
            int n = wr.aat_2(1653850820);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x305FFA30;
            if ((n2 ^ n) == 811596336) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x52CC38F4 ^ n, 13) - 186156231) * 1389115637;
        }
        return this.dghq_2(false);
    }

    public boolean rdm(boolean bl) {
        int n = wr.aat_2(-57523883);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 19);
        int n2 = (n = bl ^ n) ^ 0xA9E16AE7;
        if ((n2 ^ n) != -1444844825) {
            int cfr_ignored_0 = (Integer.rotateRight(0x55732BB2 ^ n, 13) + 1565518281) * 1433611187;
        }
        long l = bl ? rsh_3.dhtl(this.tyh_2, this.shwn) : this.shwn;
        return this.hthm() >= l;
    }

    public boolean dghq_2(boolean bl) {
        int n = -861524694;
        n = Integer.rotateLeft(n * -473215571, 20) ^ 0x6C977281;
        int n2 = (n = Integer.rotateLeft(bl ^ n, 22)) ^ 0x9C1F3C9E;
        if ((n2 ^ n) != -1675674466) {
            int cfr_ignored_0 = (0x50B911B4 ^ n) - 1021100546;
        }
        float f = rsh_3.mc.field_1724 != null ? rsh_3.zjf_2(rsh_3.mc.field_1724, Float.intBitsToFloat(646354561 + 410610047)) : 1.0f;
        float f2 = bl ? Math.min(1.0f, Float.intBitsToFloat(Integer.rotateLeft(0xB854947C ^ 0xDE32F243, 24)) * rsh_3.bnj(this.tyh_2)) : rsh_3.aqh_2(rsh_3.jnw(0x6AFAEE2 ^ 0xCA63D02E, 15));
        return this.rdm(bl) && f >= f2;
    }

    public boolean zts_8(int n) {
        return this.hthm() >= (long)n * 50L;
    }

    public long hthm() {
        block0: {
            int n = wr.aat_2(1563163273);
            int n2 = n ^ 0x3203A119;
            if ((n2 ^ n) == 839098649) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x6F285B90 ^ n, 16) + 2051061163) * 1864915857;
        }
        return System.currentTimeMillis() - this.hl;
    }

    public void hthh_2(long l) {
        this.hl = System.currentTimeMillis();
        this.shwn = l;
    }

    public boolean snt_3() {
        return this.wf(3);
    }

    public boolean wf(int n) {
        long l;
        try {
            int n2 = 397250399;
            n2 = Integer.rotateLeft(n2 * -2021073163, 10) ^ 0x202266B2;
            n2 = System.identityHashCode(this) ^ n2;
            int n3 = n2 ^ 0x7B3919E;
            if ((n3 ^ n2) != 129208734) {
                int cfr_ignored_0 = (0x101E1EC1 ^ n2) - -893548263;
            }
            if ((0x15E & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        long l2 = this.hthm();
        return l2 >= this.shwn - (l = (long)n * (0x354CD857C21A242CL ^ 0x354CD857C21A241EL)) && l2 < this.shwn + l;
    }

    public long hdhdh() {
        block0: {
            int n = -328010448;
            int n2 = (n = Integer.rotateLeft(n * -345668083, 14) ^ 0x3C3EFA55) ^ 0x5C138007;
            if ((n2 ^ n) == 1544781831) break block0;
            int cfr_ignored_0 = (0xB0617537 ^ n) - -452890309;
        }
        return this.shwn - this.hthm();
    }

    public float khas_3(int n) {
        block0: {
            int n2 = 1916613378;
            n2 = Integer.rotateLeft(n2 * 580078541, 12) ^ 0x42A90AFD;
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 12);
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 6)) ^ 0xB68E72A5;
            if ((n3 ^ n2) == -1232178523) break block0;
            int cfr_ignored_0 = (0xC4B341A7 ^ n2) - -817610730;
        }
        return (float)(((LivingEntityAccessor)rsh_3.mc.field_1724).getLastAttackedTicks() + n) / rsh_3.mc.field_1724.method_7279();
    }

    private static long dhtl(bshm bshm2, long l) {
        block0: {
            int n = 618615791;
            n = Integer.rotateLeft(n * 210933169, 20) ^ 0xFCC19792;
            bshm bshm3 = bshm2;
            n = (bshm3 != null ? System.identityHashCode(bshm3) : 0) ^ n;
            int n2 = n ^ 0x8B219716;
            if ((n2 ^ n) == -1960732906) break block0;
            int cfr_ignored_0 = (0xAFFEC4F9 ^ n) + -198432217;
        }
        return bshm2.adt(l);
    }

    private static float zjf_2(class_746 class_7462, float f) {
        block0: {
            int n = -2012253736;
            n = Integer.rotateLeft(n * -1153835583, 16) ^ 0xFEFFF987;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 18);
            int n2 = n ^ 0xE017AC90;
            if ((n2 ^ n) == -535319408) break block0;
            int cfr_ignored_0 = (0x6818DD48 ^ n) - 787893743;
        }
        return class_7462.method_7261(f);
    }

    private static float bnj(bshm bshm2) {
        block0: {
            int n = wr.aat_2(1289648861);
            int n2 = n ^ 0x94042669;
            if ((n2 ^ n) == -1811667351) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xD8DA5CB4 ^ n, 14) - 1187961095) * -656778059;
        }
        return bshm2.zns_4();
    }

    private static int jnw(int n, int n2) {
        block0: {
            int n3 = -338458447;
            n3 = Integer.rotateLeft(n3 * 785040239, 13) ^ 0x3E0AD68B;
            int n4 = (n3 = n ^ n3) ^ 0x618287E9;
            if ((n4 ^ n3) == 1635944425) break block0;
            int cfr_ignored_0 = (0x8A510F58 ^ n3) - -1334117344;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float aqh_2(int n) {
        block0: {
            int n2 = 67859857;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1508521427, 20) ^ 0x501E54D1) ^ 0xB148A049;
            if ((n3 ^ n2) == -1320640439) break block0;
            int cfr_ignored_0 = (0xB543D5D8 ^ n2) - -1291392755;
        }
        return Float.intBitsToFloat(n);
    }

    private static String[] sya_2(String string) {
        int n = wr.aat_2(-1824153570);
        int n2 = n ^ 0xA52A6179;
        if ((n2 ^ n) != -1523949191) {
            int cfr_ignored_0 = Integer.rotateRight(0x366FC167 ^ n, 9) - -1679422796;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite rnl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 742580245;
            n3 = Integer.rotateLeft(n3 * -1397795839, 13) ^ 0x563FEA39;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x7D09056D;
            if ((n4 ^ n3) != 2097743213) {
                int cfr_ignored_0 = (0x514BE578 ^ n3) + -789604931;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ttq_2 ^ string.hashCode()) + (n2 + mdh) + i ^ ttq_2, 24) + mdh);
            }
            String[] stringArray = rsh_3.sya_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] c2usjmewv38mbw(String string) {
        return string.split("\u0004\u0013", -1);
    }

    private static CallSite nkm14ny0ay8(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ i6quwpe4k9f ^ string.hashCode() ^ n2 + kijwndxklw + i * 98550563) + i6quwpe4k9f) ^ kijwndxklw));
            }
            String[] stringArray = rsh_3.c2usjmewv38mbw(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

