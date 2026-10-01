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
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.fa_2;

public class tdhsh {
    private float rkr;
    private float hks;
    private fa_2 rdhs_2 = new fa_2(0L, jkh.rwh_2);
    private static final int nsl72zb6xtqd = -621986672;
    private static final int mxbjaagfuvdaq = 362446872;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int e6m47tbpjdg;

    public void aghb(float f, int n) {
        this.rkr = this.hks - this.rdhs_2.tssh_2();
        this.hks = f;
        if (this.rkr != this.hks - f) {
            this.rdhs_2 = new fa_2(n, this.hks - this.rkr, jkh.rwh_2);
            this.rdhs_2.khmf(0.0f);
        }
    }

    public boolean dtr() {
        return this.rkr == this.hks || this.rdhs_2.thjd();
    }

    public float skhh_4() {
        this.rkr = this.hks - this.rdhs_2.tssh_2();
        return this.rkr;
    }

    @Generated
    public fa_2 zay_3() {
        return this.rdhs_2;
    }

    private static String[] rk2w18a725ems(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite nma41r6l4g(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ nsl72zb6xtqd ^ string.hashCode() ^ n2 + mxbjaagfuvdaq ^ i * 328708201 ^ nsl72zb6xtqd, 11) ^ mxbjaagfuvdaq));
            }
            String[] stringArray = tdhsh.rk2w18a725ems(new String(cArray));
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

