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
import java.util.function.Supplier;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bmt;

public class kha_2
extends bmt {
    private float bfm = Float.MIN_VALUE;
    private float tkh_3 = Float.MAX_VALUE;
    private float snd_2 = 1.0f;
    private static final int dmid16b2 = -1982386019;
    private static final int hvpa76c14v = -1061540588;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int akxghf94k7;

    public kha_2(String string) {
        super(string);
    }

    public kha_2(String string, String string2, double d, double d2, double d3, double d4) {
        this(string);
        this.td_3(Float.valueOf((float)d));
        this.sds_4((float)d2, (float)d3);
        this.ghzz_3((float)d4);
    }

    public kha_2(String string, String string2, double d, double d2, double d3, double d4, String string3, int n) {
        this(string, string2, d, d2, d3, d4);
    }

    public kha_2 td_3(Float f) {
        this.bth(f);
        return this;
    }

    public void bth(Float f) {
        if (this.hlj(f)) {
            return;
        }
        super.bth(f);
        this.zkhn();
    }

    @Override
    public kha_2 qh(Supplier supplier) {
        return (kha_2)super.qh(supplier);
    }

    @Override
    public kha_2 dk(Runnable runnable) {
        return (kha_2)super.dk(runnable);
    }

    public kha_2 sds_4(float f, float f2) {
        this.bfm = f;
        this.tkh_3 = f2;
        return this;
    }

    public kha_2 ghzz_3(float f) {
        this.snd_2 = f;
        return this;
    }

    public float hykh() {
        return ((Float)this.dms_4()).floatValue();
    }

    @Generated
    public float adr() {
        return this.bfm;
    }

    @Generated
    public float sqt_4() {
        return this.tkh_3;
    }

    @Generated
    public float asj_2() {
        return this.snd_2;
    }

    private static String[] ow8w0gvj5k0j(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite gawdpkek(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dmid16b2 ^ string.hashCode() ^ n2 + hvpa76c14v ^ i * 618120645 ^ dmid16b2, 15) ^ hvpa76c14v));
            }
            String[] stringArray = kha_2.ow8w0gvj5k0j(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

