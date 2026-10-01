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
import us.m0vy.moondlc.m0vyguard.bdz;
import us.m0vy.moondlc.m0vyguard.baj_2;
import us.m0vy.moondlc.m0vyguard.bhn_2;

public class tjt
extends baj_2 {
    private boolean stl;
    private final String thnd_2;
    private final bhn_2 tn_2 = new bhn_2(250L, bdz.shll);
    private static final int sm68ly2xgjo = -1176637219;
    private static final int qfpf1m7oev = 1884569406;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vsah7d6q;

    public tjt(String string, boolean bl) {
        super(string);
        this.stl = bl;
        this.thnd_2 = "";
    }

    public tjt(String string, String string2, boolean bl) {
        super(string);
        this.stl = bl;
        this.thnd_2 = string2;
    }

    public tjt(String string, String string2, boolean bl, Supplier supplier) {
        super(string);
        this.stl = bl;
        this.bqq(supplier);
        this.thnd_2 = string2;
    }

    public tjt(String string, boolean bl, Supplier supplier) {
        super(string);
        this.stl = bl;
        this.bqq(supplier);
        this.thnd_2 = "";
    }

    public static tjt kr(String string, boolean bl) {
        return new tjt(string, bl);
    }

    public static tjt khkk(String string) {
        return new tjt(string, true);
    }

    public void hqw() {
        this.stl = !this.stl;
    }

    @Override
    public void bm(JsonObject jsonObject) {
        jsonObject.addProperty(String.valueOf(this.zkhkh), Boolean.valueOf(this.tsz()));
    }

    @Override
    public void bzk_2(JsonObject jsonObject) {
        this.sdq(jsonObject.get(String.valueOf(this.zkhkh)).getAsBoolean());
    }

    @Generated
    public boolean tsz() {
        return this.stl;
    }

    @Generated
    public void sdq(boolean bl) {
        this.stl = bl;
    }

    @Generated
    public String zghq_2() {
        return this.thnd_2;
    }

    @Generated
    public bhn_2 dsz_3() {
        return this.tn_2;
    }

    private static String[] snehx50wzzp9as(String string) {
        return string.split("\u0002\u001e", -1);
    }

    private static CallSite s1hoob9y(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ sm68ly2xgjo ^ string.hashCode() ^ n2 + qfpf1m7oev + i * 549630029) + sm68ly2xgjo) ^ qfpf1m7oev));
            }
            String[] stringArray = tjt.snehx50wzzp9as(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
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

