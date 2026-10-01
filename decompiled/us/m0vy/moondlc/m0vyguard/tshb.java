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
import us.m0vy.moondlc.m0vyguard.bbw;
import us.m0vy.moondlc.m0vyguard.tbm;

public class tshb {
    private float jhkh_2;
    private float bna;
    private tbm szb_2 = tbm.bthth;
    private bbw tzdh = new bbw().awh_2(0.0f).skha_3(0).qj(false).aty(this.szb_2);
    private static final int aboib85ay = -1530097734;
    private static final int k57zemlwl = -607835537;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int nvapy5c9b;

    public float qm(float f, int n) {
        n = Math.max(1, n);
        this.jhkh_2 = this.bna - this.tzdh.szw_3();
        this.bna = f;
        if (this.jhkh_2 != this.bna - f) {
            this.tzdh = new bbw().awh_2(this.bna - this.jhkh_2).skha_3(n).qj(false).aty(this.szb_2);
        }
        return this.jhkh_2;
    }

    public boolean jdhh_2() {
        return this.jhkh_2 == this.bna || this.tzdh.dhtz_3() || this.tzdh.dhzq(false);
    }

    public float dhbm() {
        this.jhkh_2 = this.bna - this.tzdh.szw_3();
        return this.jhkh_2;
    }

    public tshb zas_4(tbm tbm2) {
        this.szb_2 = tbm2;
        return this;
    }

    @Generated
    public bbw dykh() {
        return this.tzdh;
    }

    private static String[] uam0c5fa8(String string) {
        return string.split("\u0007\u0015", -1);
    }

    private static CallSite ijvhme5hfrgp7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ aboib85ay ^ string.hashCode()) + (n2 + k57zemlwl) + i ^ aboib85ay, 6) + k57zemlwl);
            }
            String[] stringArray = tshb.uam0c5fa8(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

