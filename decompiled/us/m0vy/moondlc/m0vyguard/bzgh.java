/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.function.Supplier;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.baj_2;
import us.m0vy.moondlc.m0vyguard.bwgh;

public class bzgh
extends baj_2 {
    private final String sbt_3;
    private float thhsh;
    private final float thya;
    private final float jghm;
    private final float rqy;
    private bwgh bdh_4;
    private static final int m8vk81rcp = 305348179;
    private static final int llqqwseh = -309691294;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int afpz4210vlecs1;

    public bzgh(String string, float f, float f2, float f3, float f4, bwgh bwgh2) {
        super(string);
        this.thya = f2;
        this.jghm = f3;
        this.thhsh = f;
        this.rqy = f4;
        this.bdh_4 = bwgh2;
        this.sbt_3 = "";
    }

    public bzgh(String string, float f, float f2, float f3, float f4, String string2) {
        super(string);
        this.thya = f2;
        this.jghm = f3;
        this.thhsh = f;
        this.rqy = f4;
        this.sbt_3 = string2;
    }

    public bzgh(String string, float f, float f2, float f3, float f4) {
        super(string);
        this.thya = f2;
        this.jghm = f3;
        this.thhsh = f;
        this.rqy = f4;
        this.sbt_3 = "";
    }

    public bzgh(String string, float f, float f2, float f3, float f4, Supplier supplier) {
        super(string);
        this.thya = f2;
        this.jghm = f3;
        this.thhsh = f;
        this.rqy = f4;
        this.bqq(supplier);
        this.sbt_3 = "";
    }

    public void dyb_2(float f) {
        float f2 = this.thhsh;
        this.thhsh = f;
        if (this.bdh_4 != null) {
            this.bdh_4.jws(f2, f);
        }
    }

    @Override
    public void bm(JsonObject jsonObject) {
        jsonObject.addProperty(String.valueOf(this.zkhkh), (Number)Float.valueOf(this.bqz_2()));
    }

    @Override
    public void bzk_2(JsonObject jsonObject) {
        this.dyb_2(jsonObject.get(String.valueOf(this.zkhkh)).getAsFloat());
    }

    @Generated
    public String awgh() {
        return this.sbt_3;
    }

    @Generated
    public float bqz_2() {
        return this.thhsh;
    }

    @Generated
    public float zqw() {
        return this.thya;
    }

    @Generated
    public float jshsh() {
        return this.jghm;
    }

    @Generated
    public float tsa() {
        return this.rqy;
    }

    @Generated
    public bwgh ghzh_3() {
        return this.bdh_4;
    }

    private static String[] pd01tz4gj4i(String string) {
        return string.split("\u0002\u0015", -1);
    }

    private static CallSite juccvgzm(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ m8vk81rcp ^ string.hashCode() ^ n2 + llqqwseh ^ i * 1139319005 ^ m8vk81rcp, 17) ^ llqqwseh));
            }
            String[] stringArray = bzgh.pd01tz4gj4i(new String(cArray));
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

