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
import us.m0vy.moondlc.m0vyguard.kj;

public class q {
    public static final q tds_4;
    protected float shghsh;
    protected float sfd;
    protected float rkh;
    protected float jzy;
    private static final int ihylt5cpp = -1534282160;
    private static final int p712hm67gk6qb = 821166278;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int i44a2a0rp5q;

    public void khjs_2(float f, float f2, float f3, float f4) {
        this.shghsh = f;
        this.sfd = f2;
        this.rkh = f3;
        this.jzy = f4;
    }

    public q thzj_2(float f) {
        return new q(f, this.sfd, this.rkh, this.jzy);
    }

    public q ta_3(float f) {
        return new q(this.shghsh, f, this.rkh, this.jzy);
    }

    public q sdhgh(float f) {
        return new q(this.shghsh, this.sfd, f, this.jzy);
    }

    public q thyr(float f) {
        return new q(this.shghsh, this.sfd, this.rkh, f);
    }

    public q rndh(float f) {
        return new q(this.shghsh + f, this.sfd + f, this.rkh - f * 2.0f, this.jzy - f * 2.0f);
    }

    public static q dhkhs_2(q q2, q q3, double d) {
        float f = (float)((double)q2.shghsh + (double)(q3.shghsh - q2.shghsh) * d);
        float f2 = (float)((double)q2.sfd + (double)(q3.sfd - q2.sfd) * d);
        float f3 = (float)((double)q2.rkh + (double)(q3.rkh - q2.rkh) * d);
        float f4 = (float)((double)q2.jzy + (double)(q3.jzy - q2.jzy) * d);
        return new q(f, f2, f3, f4);
    }

    public boolean jfz_2(q q2) {
        return this.dhr_5(q2.ghdhw(), q2.thkhh_2(), q2.thn(), q2.jdth());
    }

    public boolean dhr_5(float f, float f2, float f3, float f4) {
        return this.shghsh + this.rkh > f && this.shghsh < f + f3 && this.sfd + this.jzy > f2 && this.sfd < f2 + f4;
    }

    public boolean ddhz_2(q q2) {
        return this.tzz_4(q2.ghdhw(), q2.thkhh_2(), q2.thn(), q2.jdth());
    }

    public boolean tzz_4(float f, float f2, float f3, float f4) {
        return this.shghsh > f && this.shghsh + this.rkh < f + f3 && this.sfd > f2 && this.sfd + this.jzy < f2 + f4;
    }

    public boolean bdhh_2(double d, double d2) {
        return kj.hsha(this.shghsh, this.sfd, this.rkh, this.jzy, d, d2);
    }

    @Generated
    public float ghdhw() {
        return this.shghsh;
    }

    @Generated
    public float thkhh_2() {
        return this.sfd;
    }

    @Generated
    public float thn() {
        return this.rkh;
    }

    @Generated
    public float jdth() {
        return this.jzy;
    }

    @Generated
    public void dab(float f) {
        this.shghsh = f;
    }

    @Generated
    public void tfw(float f) {
        this.sfd = f;
    }

    @Generated
    public void rdhl(float f) {
        this.rkh = f;
    }

    @Generated
    public void ghjw(float f) {
        this.jzy = f;
    }

    @Generated
    public q() {
    }

    @Generated
    public q(float f, float f2, float f3, float f4) {
        this.shghsh = f;
        this.sfd = f2;
        this.rkh = f3;
        this.jzy = f4;
    }

    private static String[] rwaata6mqdb(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite kz15zzp9hhw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ihylt5cpp ^ string.hashCode()) + (n2 + p712hm67gk6qb) + i ^ ihylt5cpp, 11) + p712hm67gk6qb);
            }
            String[] stringArray = q.rwaata6mqdb(new String(cArray));
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

