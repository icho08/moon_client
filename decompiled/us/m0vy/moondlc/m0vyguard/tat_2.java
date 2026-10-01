/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_332
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_332;
import us.m0vy.moondlc.m0vyguard.bzy;
import us.m0vy.moondlc.m0vyguard.bmb;

public abstract class tat_2
implements bzy {
    private float ththl;
    private float qm;
    private float zsha_2;
    private float brs;
    private float thdh_7;
    private static final int xnbzjzkoym6 = 378549725;
    private static final int jalk2qhp50 = 19737554;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int lzrp0jbp;

    @Override
    public void hagh_2(class_332 class_3322, int n, int n2, float f) {
    }

    @Override
    public void thda_2(int n, int n2, int n3) {
    }

    @Override
    public void thkdh(double d, double d2, int n) {
    }

    @Override
    public void khs_2(double d, double d2, int n) {
    }

    @Override
    public void bthf(double d, double d2, double d3, double d4) {
    }

    public float shkt() {
        return this.dsa_2(2.0f);
    }

    public float dhh_3() {
        return this.shkt() * 1.5f;
    }

    public float dsa_2(float f) {
        return bmb.ath_2().swk(f);
    }

    public float shyh_2() {
        return bmb.ath_2().dhna();
    }

    @Generated
    public float sjr() {
        return this.ththl;
    }

    @Generated
    public float shha_2() {
        return this.qm;
    }

    @Generated
    public float dghgh() {
        return this.zsha_2;
    }

    @Generated
    public float bkgh() {
        return this.brs;
    }

    @Generated
    public float jst() {
        return this.thdh_7;
    }

    @Generated
    public void shhb(float f) {
        this.ththl = f;
    }

    @Generated
    public void rbgh(float f) {
        this.qm = f;
    }

    @Generated
    public void rghh_2(float f) {
        this.zsha_2 = f;
    }

    @Generated
    public void sar(float f) {
        this.brs = f;
    }

    @Generated
    public void dmb_2(float f) {
        this.thdh_7 = f;
    }

    private static String[] ljqmh0sl1bulmp(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite cixcm18s3un1he(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ xnbzjzkoym6 ^ string.hashCode()) + (n2 + jalk2qhp50) + i ^ xnbzjzkoym6, 20) + jalk2qhp50);
            }
            String[] stringArray = tat_2.ljqmh0sl1bulmp(new String(cArray));
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

