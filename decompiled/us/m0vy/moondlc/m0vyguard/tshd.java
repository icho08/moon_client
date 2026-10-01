/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  lombok.Generated
 *  net.minecraft.class_3532
 *  org.jetbrains.annotations.NotNull
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import net.minecraft.class_3532;
import org.jetbrains.annotations.NotNull;
import us.m0vy.moondlc.m0vyguard.bfkh;
import us.m0vy.moondlc.m0vyguard.hy;

public class tshd
extends bfkh {
    private float hwa;
    private float bzs_4;
    private float hghth;
    private float hdhw;
    private float syn;
    private static final int u1n0jglo = -260011890;
    private static final int ky8yf97m73a = 813490340;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int q2kx2pw8ormtye;

    public tshd(@NotNull hy hy2, String string, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public tshd(@NotNull hy hy2, String string) {
        super(hy2, string);
    }

    public tshd afs_2(float f) {
        this.hwa = f;
        return this;
    }

    public tshd sjk_2(float f) {
        this.bzs_4 = f;
        return this;
    }

    public tshd rshr(float f) {
        this.hghth = f;
        return this;
    }

    public tshd shft(float f) {
        this.hdhw = f;
        return this;
    }

    public tshd zys_4(float f) {
        this.syn = f;
        return this;
    }

    @Override
    public JsonElement tdkh() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("first", (Number)Float.valueOf(this.hwa));
        jsonObject.addProperty("second", (Number)Float.valueOf(this.bzs_4));
        return jsonObject;
    }

    @Override
    public void ha(JsonElement jsonElement) {
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            if (jsonObject.has("first")) {
                this.dhmkh(jsonObject.get("first").getAsFloat());
            }
            if (jsonObject.has("second")) {
                this.thzz_3(jsonObject.get("second").getAsFloat());
            }
        }
    }

    public void dhmkh(float f) {
        this.hwa = (float)class_3532.method_15350((double)((double)Math.round((double)f * (1.0 / (double)this.syn)) / (1.0 / (double)this.syn)), (double)this.hghth, (double)this.hdhw);
    }

    public void thzz_3(float f) {
        this.bzs_4 = (float)class_3532.method_15350((double)((double)Math.round((double)f * (1.0 / (double)this.syn)) / (1.0 / (double)this.syn)), (double)this.hghth, (double)this.hdhw);
    }

    @Generated
    public float hht() {
        return this.hwa;
    }

    @Generated
    public float awt_2() {
        return this.bzs_4;
    }

    @Generated
    public float tdh_6() {
        return this.hghth;
    }

    @Generated
    public float ghjdh() {
        return this.hdhw;
    }

    @Generated
    public float sdhq() {
        return this.syn;
    }

    @Generated
    public void jshq(float f) {
        this.hghth = f;
    }

    @Generated
    public void shwh(float f) {
        this.hdhw = f;
    }

    @Generated
    public void jtdh(float f) {
        this.syn = f;
    }

    public float dhdb_2() {
        return this.hwa;
    }

    public float aghm() {
        return this.bzs_4;
    }

    public void thkt_2(float f) {
        this.dhmkh(f);
    }

    public void ghbw(float f) {
        this.thzz_3(f);
    }

    private static String[] se6sbwl0944(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite cxdd25juabx(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ u1n0jglo ^ string.hashCode() ^ n2 + ky8yf97m73a + i * -1055653225) + u1n0jglo) ^ ky8yf97m73a));
            }
            String[] stringArray = tshd.se6sbwl0944(new String(cArray));
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

