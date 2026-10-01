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
import us.m0vy.moondlc.m0vyguard.dk;
import us.m0vy.moondlc.m0vyguard.zt;
import us.m0vy.moondlc.m0vyguard.fa;

public class bsr_2
extends zt {
    private static final bsr_2 tah_4;
    private static final int vn04gjuws0va = 1432251235;
    private static final int ijhs23n7uj = 1320915239;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int wvi5mozpllu;

    public boolean zkhh(fa fa2) {
        int n = -2139999263;
        int n2 = (n = Integer.rotateLeft(n * -72614601, 20) ^ 0x11AD5758) ^ 0x9C2C19BC;
        if ((n2 ^ n) != -1674831428) {
            int cfr_ignored_0 = (0x1C5E2A5D ^ n) + 29221652;
        }
        bsr_2.zkha(fa2, false);
        super.zkhh(fa2);
        return fa2.bjf();
    }

    @Generated
    public static bsr_2 dhtsh_2() {
        block0: {
            int n = -1889207218;
            int n2 = (n = Integer.rotateLeft(n * -454332795, 15) ^ 0x10B5D70D) ^ 0x6BA903D3;
            if ((n2 ^ n) == 1806238675) break block0;
            int cfr_ignored_0 = (0xE4CDFF9D ^ n) - 491914785;
        }
        return tah_4;
    }

    private static void zkha(fa fa2, boolean bl) {
        int n = dk.adhf(280223475);
        int n2 = (n = Integer.rotateRight(bl ^ n, 29)) ^ 0x618BECAD;
        if ((n2 ^ n) != 1636560045) {
            int cfr_ignored_0 = (Integer.rotateRight(0x7138325E ^ n, 17) - -1171539811) * 1899508319;
        }
        fa2.dlgh(bl);
    }

    private static String[] fe2fd0wj(String string) {
        return string.split("\u0004\u0015", -1);
    }

    private static CallSite e84xtfrfii27(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ vn04gjuws0va ^ string.hashCode()) + (n2 + ijhs23n7uj) + i ^ vn04gjuws0va, 3) + ijhs23n7uj);
            }
            String[] stringArray = bsr_2.fe2fd0wj(new String(cArray));
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

