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
import us.m0vy.moondlc.m0vyguard.bagh_2;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.da_3;
import us.m0vy.moondlc.m0vyguard.kj;

public abstract class tzb
implements dl {
    protected float khrw;
    protected float hza_3;
    protected float thjd_2;
    protected float thsha_2;
    private static final int la8pynjxzx3ik = 367057582;
    private static final int yd63awg9uo1it = 2041886829;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int zakbqypg1jj;

    protected tzb(float f, float f2, float f3, float f4) {
        this.khrw = f;
        this.hza_3 = f2;
        this.thjd_2 = f3;
        this.thsha_2 = f4;
    }

    protected tzb() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void ghzh_4(bagh_2 bagh2) {
        this.dzt_2(bagh2);
        this.ddhz_3(bagh2);
    }

    protected abstract void ddhz_3(bagh_2 var1);

    public void sghs_3() {
    }

    public void dzt_2(bagh_2 bagh2) {
    }

    public void shlf(double d, double d2, da_3 da2_2) {
    }

    public void jdw(double d, double d2, da_3 da2_2) {
    }

    public void rmk(int n, int n2, int n3) {
    }

    public boolean ghdy_2(char c, int n) {
        return false;
    }

    public void df_2(double d, double d2, double d3, double d4) {
    }

    public void taj_4(float f, float f2) {
        this.khrw = f;
        this.hza_3 = f2;
    }

    public void dlf(float f, float f2, float f3, float f4) {
        this.khrw = f;
        this.hza_3 = f2;
        this.thjd_2 = f3;
        this.thsha_2 = f4;
    }

    public boolean zkkh_2(float f, float f2) {
        return kj.hsha(this.khrw, this.hza_3, this.thjd_2, this.thsha_2, f, f2);
    }

    public boolean dza_7(double d, double d2) {
        return kj.hsha(this.khrw, this.hza_3, this.thjd_2, this.thsha_2, d, d2);
    }

    public boolean dagh_4(bagh_2 bagh2) {
        return this.zkkh_2(bagh2.getMouseX(), bagh2.getMouseY());
    }

    @Generated
    public float tad_4() {
        return this.khrw;
    }

    @Generated
    public float dhshkh() {
        return this.hza_3;
    }

    @Generated
    public float zsq_3() {
        return this.thjd_2;
    }

    @Generated
    public float thb_3() {
        return this.thsha_2;
    }

    @Generated
    public void ddsh_3(float f) {
        this.khrw = f;
    }

    @Generated
    public void sjdh(float f) {
        this.hza_3 = f;
    }

    @Generated
    public void zqd_2(float f) {
        this.thjd_2 = f;
    }

    @Generated
    public void jyr(float f) {
        this.thsha_2 = f;
    }

    private static String[] sapmhj9otroeq(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite me1qhnvi(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ la8pynjxzx3ik ^ string.hashCode()) + (n2 + yd63awg9uo1it) + i ^ la8pynjxzx3ik, 21) + yd63awg9uo1it);
            }
            String[] stringArray = tzb.sapmhj9otroeq(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

