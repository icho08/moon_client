/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  lombok.Generated
 *  net.minecraft.class_241
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
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
import net.minecraft.class_241;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import us.m0vy.moondlc.m0vyguard.bfkh;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.hy;

public class hw
extends bfkh {
    private class_241 dwsh = class_241.field_1340;
    private class_241 tt_2 = new class_241(1.0f, 1.0f);
    private static final int yqn2qhmsvqi = -1594817882;
    private static final int vo7z83sj = 1365957944;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int nncshfx2y2l0;

    public hw(@NotNull hy hy2, String string, String string2, @Nullable BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public hw(@NotNull hy hy2, String string, @Nullable BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public hw(@NotNull hy hy2, String string, String string2) {
        super(hy2, string);
    }

    public hw(@NotNull hy hy2, String string) {
        super(hy2, string);
    }

    public hw adh(float f, float f2) {
        this.dwsh = new class_241(f, f2);
        return this;
    }

    public hw zkhb(float f, float f2) {
        this.tt_2 = new class_241(f, f2);
        return this;
    }

    public hw dhjz(class_241 class_2412) {
        this.dwsh = class_2412;
        return this;
    }

    public hw rwz(class_241 class_2412) {
        this.tt_2 = class_2412;
        return this;
    }

    public jkh dhtth() {
        return jkh.generate(this.dwsh.field_1343, 1.0f - this.dwsh.field_1342, this.tt_2.field_1343, 1.0f - this.tt_2.field_1342);
    }

    @Override
    public JsonElement tdkh() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("start_x", (Number)Float.valueOf(this.dwsh.field_1343));
        jsonObject.addProperty("start_y", (Number)Float.valueOf(this.dwsh.field_1342));
        jsonObject.addProperty("end_x", (Number)Float.valueOf(this.tt_2.field_1343));
        jsonObject.addProperty("end_y", (Number)Float.valueOf(this.tt_2.field_1342));
        return jsonObject;
    }

    @Override
    public void ha(JsonElement jsonElement) {
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            if (jsonObject.has("start_x") && jsonObject.has("start_y")) {
                this.dhjz(new class_241(jsonObject.get("start_x").getAsFloat(), jsonObject.get("start_y").getAsFloat()));
            }
            if (jsonObject.has("end_x") && jsonObject.has("end_y")) {
                this.rwz(new class_241(jsonObject.get("end_x").getAsFloat(), jsonObject.get("end_y").getAsFloat()));
            }
        }
    }

    @Generated
    public class_241 tma() {
        return this.dwsh;
    }

    @Generated
    public class_241 dhss() {
        return this.tt_2;
    }

    private static String[] e4lqwi1r(String string) {
        return string.split("\u0001\u0012", -1);
    }

    private static CallSite hdsv8p6yka(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ yqn2qhmsvqi ^ string.hashCode() ^ n2 + vo7z83sj ^ i * 1288972627 ^ yqn2qhmsvqi, 26) ^ vo7z83sj));
            }
            String[] stringArray = hw.e4lqwi1r(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

