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
import us.m0vy.moondlc.m0vyguard.bbf;
import us.m0vy.moondlc.m0vyguard.bsf;
import us.m0vy.moondlc.m0vyguard.tdha;
import us.m0vy.moondlc.m0vyguard.jb;

public abstract class bbh_2
implements tdha {
    protected float khlf;
    protected float dzf_2;
    protected float zfw;
    protected float zsr;
    private static final int twesd6ae8q1u = 30769456;
    private static final int twq5mvuuhh = 1663027167;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int g83bymvnl6;

    protected bbh_2(float f, float f2, float f3, float f4) {
        this.khlf = f;
        this.dzf_2 = f2;
        this.zfw = f3;
        this.zsr = f4;
    }

    protected bbh_2() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void tzw_2(bbf bbf2) {
        this.khzq(bbf2);
        this.szs(bbf2);
    }

    protected abstract void szs(bbf var1);

    public void jka() {
    }

    public void khzq(bbf bbf2) {
    }

    public void bdq(double d, double d2, bsf bsf2) {
    }

    public void tam_2(double d, double d2, bsf bsf2) {
    }

    public void khkhz_2(int n, int n2, int n3) {
    }

    public boolean zrz(char c, int n) {
        return false;
    }

    public void zhr(double d, double d2, double d3, double d4) {
    }

    public void jhz_2(float f, float f2) {
        this.khlf = f;
        this.dzf_2 = f2;
    }

    public void aqt(float f, float f2, float f3, float f4) {
        this.khlf = f;
        this.dzf_2 = f2;
        this.zfw = f3;
        this.zsr = f4;
    }

    public boolean dkhh_3(float f, float f2) {
        return jb.hbf(this.khlf, this.dzf_2, this.zfw, this.zsr, f, f2);
    }

    public boolean sws(double d, double d2) {
        return jb.hbf(this.khlf, this.dzf_2, this.zfw, this.zsr, d, d2);
    }

    public boolean tshs(bbf bbf2) {
        return this.dkhh_3(bbf2.getMouseX(), bbf2.getMouseY());
    }

    @Generated
    public float jsq_2() {
        return this.khlf;
    }

    @Generated
    public float dhbw() {
        return this.dzf_2;
    }

    @Generated
    public float khsb_2() {
        return this.zfw;
    }

    @Generated
    public float tts_2() {
        return this.zsr;
    }

    @Generated
    public void baw(float f) {
        this.khlf = f;
    }

    @Generated
    public void ahl_2(float f) {
        this.dzf_2 = f;
    }

    @Generated
    public void zjz_2(float f) {
        this.zfw = f;
    }

    @Generated
    public void dzk_2(float f) {
        this.zsr = f;
    }

    private static String[] zlp9lkhbpe1mp(String string) {
        return string.split("\u0002\u0017", -1);
    }

    private static CallSite hb99bv8iuwml(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ twesd6ae8q1u ^ string.hashCode() ^ n2 + twq5mvuuhh ^ i * 2012614081 ^ twesd6ae8q1u, 22) ^ twq5mvuuhh));
            }
            String[] stringArray = bbh_2.zlp9lkhbpe1mp(new String(cArray));
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

