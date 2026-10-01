/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 *  lombok.Generated
 *  net.minecraft.class_3532
 *  org.jetbrains.annotations.NotNull
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
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
import us.m0vy.moondlc.m0vyguard.tr_2;
import us.m0vy.moondlc.m0vyguard.ghf;

public class tay
extends bfkh {
    protected float stt;
    protected float srk;
    protected float shkhsh;
    protected float rjz;
    private ghf thd_2 = tay::zdhk_2;
    private static final int xs0djeks9v665 = -285250508;
    private static final int y6o1ab7bsy = -288223043;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ypw72c1la8;

    public tay(@NotNull hy hy2, String string, String string2, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public tay(@NotNull hy hy2, String string, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public tay(@NotNull hy hy2, String string, String string2) {
        super(hy2, string);
    }

    public tay(@NotNull hy hy2, String string) {
        super(hy2, string);
    }

    public tay shth_7(float f) {
        this.stt = f;
        return this;
    }

    public tay dhbs_2(float f) {
        this.srk = f;
        return this;
    }

    public tay rkh_3(float f) {
        this.shkhsh = f;
        return this;
    }

    public tay awz_2(ghf ghf2) {
        this.thd_2 = ghf2;
        return this;
    }

    public tay ghshz_2(String string) {
        this.thd_2 = arg_0 -> tay.tkhr_2(string, arg_0);
        return this;
    }

    public tay ssd_5(float f) {
        this.shjl(f);
        return this;
    }

    public String hah_4() {
        return this.thd_2.apply(this.thw_5()).contains(" ") ? " " + tr_2.ttq_3(this.thd_2.apply(this.thw_5()).replace(" ", "")) : tr_2.ttq_3(this.thd_2.apply(this.thw_5()));
    }

    @Override
    public JsonElement tdkh() {
        return new JsonPrimitive((Number)Float.valueOf(this.rjz));
    }

    @Override
    public void ha(JsonElement jsonElement) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            this.shjl(jsonElement.getAsFloat());
        }
    }

    public void shjl(float f) {
        this.rjz = class_3532.method_15363((float)((float)((double)Math.round((double)f * (1.0 / (double)this.shkhsh)) / (1.0 / (double)this.shkhsh))), (float)this.stt, (float)this.srk);
    }

    @Generated
    public float alz_2() {
        return this.stt;
    }

    @Generated
    public float sdhh_4() {
        return this.srk;
    }

    @Generated
    public float bzz_3() {
        return this.shkhsh;
    }

    public float hkj() {
        return this.rjz;
    }

    public float thw_5() {
        return this.rjz;
    }

    public void zakh_3(float f) {
        this.shjl(f);
    }

    private static String tkhr_2(String string, float f) {
        return string;
    }

    private static String zdhk_2(float f) {
        return "";
    }

    private static String[] jfafntda(String string) {
        return string.split("\u0006\u000f", -1);
    }

    private static CallSite bx42bev7lsh1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ xs0djeks9v665 ^ string.hashCode() ^ n2 + y6o1ab7bsy ^ i * 1282883731 ^ xs0djeks9v665, 22) ^ y6o1ab7bsy));
            }
            String[] stringArray = tay.jfafntda(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

