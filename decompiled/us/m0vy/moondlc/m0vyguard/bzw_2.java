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
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.hy;

public class bzw_2
extends bfkh {
    private byq rnk = new byq(255.0f, 255.0f, 255.0f, 255.0f);
    private boolean hhb = true;
    private static final int fpl6fzjq = -305838809;
    private static final int kqvrrgly6x = -1053320813;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int wu7npph0;

    public bzw_2(@NotNull hy hy2, String string, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public bzw_2(@NotNull hy hy2, String string) {
        super(hy2, string);
    }

    public bzw_2 dhshy(byq byq2) {
        this.rnk = this.hhb ? byq2 : byq2.tkhl_2(255.0f);
        return this;
    }

    public bzw_2 tqdh(boolean bl) {
        this.hhb = bl;
        if (!bl && this.rnk != null) {
            this.rnk = this.rnk.tkhl_2(255.0f);
        }
        return this;
    }

    @Override
    public JsonElement tdkh() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("r", (Number)Float.valueOf(this.rnk.sbk()));
        jsonObject.addProperty("g", (Number)Float.valueOf(this.rnk.srl()));
        jsonObject.addProperty("b", (Number)Float.valueOf(this.rnk.shsl_2()));
        jsonObject.addProperty("a", (Number)Float.valueOf(this.rnk.tzdh_2()));
        return jsonObject;
    }

    @Override
    public void ha(JsonElement jsonElement) {
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            int n = jsonObject.get("r").getAsInt();
            int n2 = jsonObject.get("g").getAsInt();
            int n3 = jsonObject.get("b").getAsInt();
            int n4 = jsonObject.get("a").getAsInt();
            this.rnk = new byq(this.thzm(n), this.thzm(n2), this.thzm(n3), this.hhb ? (float)this.thzm(n4) : 255.0f);
        }
    }

    private int thzm(int n) {
        return class_3532.method_15340((int)n, (int)0, (int)255);
    }

    @Generated
    public byq sdsh_4() {
        return this.rnk;
    }

    @Generated
    public boolean shf_4() {
        return this.hhb;
    }

    @Generated
    public void zmgh(byq byq2) {
        this.rnk = byq2;
    }

    @Generated
    public void aghh_2(boolean bl) {
        this.hhb = bl;
    }

    private static String[] dzx15h6ovkwz7(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite fiytbbbn7129h(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ fpl6fzjq ^ string.hashCode()) + (n2 + kqvrrgly6x) + i ^ fpl6fzjq, 6) + kqvrrgly6x);
            }
            String[] stringArray = bzw_2.dzx15h6ovkwz7(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

