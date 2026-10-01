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
import us.m0vy.moondlc.m0vyguard.bzt_2;
import us.m0vy.moondlc.m0vyguard.byq;

public class bkha_2 {
    protected final byq rthn;
    protected final byq khkht_2;
    protected final byq shhz;
    protected final byq dghkh;
    private static final int vlrd8kb5nf = -349715446;
    private static final int sdlc45wpepn2 = -308055547;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int hg3x04i8e1mo;

    protected bkha_2(byq byq2, byq byq3, byq byq4, byq byq5) {
        this.rthn = byq2;
        this.khkht_2 = byq3;
        this.shhz = byq4;
        this.dghkh = byq5;
    }

    public static bkha_2 thtl_2(byq byq2, byq byq3, byq byq4, byq byq5) {
        int n = 271673251;
        n = Integer.rotateLeft(n * -295177929, 16) ^ 0x18A7F447;
        byq byq6 = byq2;
        n = (byq6 != null ? System.identityHashCode(byq6) : 0) ^ n;
        byq byq7 = byq3;
        n = (byq7 != null ? System.identityHashCode(byq7) : 0) ^ n;
        int n2 = n ^ 0xAD0C44B4;
        if ((n2 ^ n) != -1391704908) {
            int cfr_ignored_0 = (0xBD3D2317 ^ n) - -1805671934;
        }
        return new bkha_2(byq2, byq3, byq4, byq5);
    }

    public bkha_2 tnq() {
        block0: {
            int n = 1820585725;
            n = Integer.rotateLeft(n * -1616561349, 25) ^ 0x1C892351;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 18);
            int n2 = n ^ 0x773ED2CA;
            if ((n2 ^ n) == 2000605898) break block0;
            int cfr_ignored_0 = (0x1BBD3C37 ^ n) + -998502939;
        }
        return this;
    }

    @Generated
    public byq skhl_2() {
        block0: {
            int n = -626654110;
            int n2 = (n = Integer.rotateLeft(n * -255415729, 10) ^ 0x153DE05) ^ 0x9ABE0AA7;
            if ((n2 ^ n) == -1698821465) break block0;
            int cfr_ignored_0 = (0x40180EC5 ^ n) - -1515149915;
        }
        return this.rthn;
    }

    @Generated
    public byq ttgh_4() {
        block0: {
            int n = -966155114;
            n = Integer.rotateLeft(n * 1273936871, 24) ^ 0xE4B8D71F;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xB3606C11;
            if ((n2 ^ n) == -1285526511) break block0;
            int cfr_ignored_0 = (0x7509C887 ^ n) + 835245663;
        }
        return this.khkht_2;
    }

    @Generated
    public byq zzh_6() {
        block0: {
            int n = bzt_2.dath_2(427108249);
            int n2 = n ^ 0x810EECB7;
            if ((n2 ^ n) == -2129728329) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x987BCB2E ^ n, 6) - 2069576141;
        }
        return this.shhz;
    }

    @Generated
    public byq tat_3() {
        block0: {
            int n = bzt_2.dath_2(2134572666);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 28);
            int n2 = n ^ 0xFABBD11A;
            if ((n2 ^ n) == -88354534) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x85812F60 ^ n, 3) + 788683739;
        }
        return this.dghkh;
    }

    private static String[] n5s51rrklkrtxz(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite u9vrvk2riy46z(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ vlrd8kb5nf ^ string.hashCode() ^ n2 + sdlc45wpepn2 ^ i * -1205811993 ^ vlrd8kb5nf, 16) ^ sdlc45wpepn2));
            }
            String[] stringArray = bkha_2.n5s51rrklkrtxz(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

