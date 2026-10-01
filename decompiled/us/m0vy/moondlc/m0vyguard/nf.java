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
import us.m0vy.moondlc.m0vyguard.ttk;
import us.m0vy.moondlc.m0vyguard.ks;

public class nf
extends ttk {
    private final float twa;
    private final float tjd_2;
    private final int dhdz_2;
    private static final int z0mpzfhlk = -1421913925;
    private static final int te2a4fx0s = -2062147651;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int dkpvmsla;

    @Generated
    public float tht_9() {
        block0: {
            int n = -1046080260;
            int n2 = (n = Integer.rotateLeft(n * -1194563147, 23) ^ 0xF0AD1121) ^ 0x6189E6A3;
            if ((n2 ^ n) == 1636427427) break block0;
            int cfr_ignored_0 = (0xA02FF25F ^ n) + -642896716;
        }
        return this.twa;
    }

    @Generated
    public float aah() {
        block0: {
            int n = -964246634;
            n = Integer.rotateLeft(n * 704431337, 26) ^ 0x8211E073;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x3A4DBD2C;
            if ((n2 ^ n) == 978173228) break block0;
            int cfr_ignored_0 = (0xFCCB7EBA ^ n) + 993097897;
        }
        return this.tjd_2;
    }

    @Generated
    public int bla() {
        block0: {
            int n = ks.tln(1010407274);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 10);
            int n2 = n ^ 0xE7377208;
            if ((n2 ^ n) == -415796728) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xDB0EE562 ^ n, 14) + -1960090087;
        }
        return this.dhdz_2;
    }

    @Generated
    public nf(float f, float f2, int n) {
        this.twa = f;
        this.tjd_2 = f2;
        this.dhdz_2 = n;
    }

    private static String[] k0etxwr5cswi(String string) {
        return string.split("\u0007\u0010", -1);
    }

    private static CallSite n2yzgbux9w(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ z0mpzfhlk ^ string.hashCode()) + (n2 + te2a4fx0s) + i ^ z0mpzfhlk, 16) + te2a4fx0s);
            }
            String[] stringArray = nf.k0etxwr5cswi(new String(cArray));
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

