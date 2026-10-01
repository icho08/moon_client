/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 *  net.minecraft.class_2248
 *  net.minecraft.class_2960
 *  net.minecraft.class_7923
 *  org.jetbrains.annotations.NotNull
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
import net.minecraft.class_2248;
import net.minecraft.class_2960;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;
import us.m0vy.moondlc.m0vyguard.bfkh;
import us.m0vy.moondlc.m0vyguard.hy;

public class byl
extends bfkh {
    private final List shnt = new ArrayList();
    private final List thght_2 = new ArrayList();
    private static final int ems573l7 = 284061631;
    private static final int clypib80y1e7 = -511594673;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int q9v42ecngh;

    public byl(@NotNull hy hy2, String string) {
        super(hy2, string);
    }

    public byl(@NotNull hy hy2, String string, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public byl zz_2(class_2248 ... class_2248Array) {
        for (class_2248 class_22482 : class_2248Array) {
            this.tss_6(class_22482);
        }
        return this;
    }

    public void tss_6(class_2248 class_22482) {
        String string = class_7923.field_41175.method_10221((Object)class_22482).toString();
        if (!this.shnt.contains(string)) {
            this.shnt.add(string);
            this.thght_2.add(class_22482);
        }
    }

    public void zka_4(class_2248 class_22482) {
        String string = class_7923.field_41175.method_10221((Object)class_22482).toString();
        this.shnt.remove(string);
        this.thght_2.remove(class_22482);
    }

    public boolean rdhf(class_2248 class_22482) {
        String string = class_7923.field_41175.method_10221((Object)class_22482).toString();
        return this.shnt.contains(string);
    }

    public List tzs_8() {
        if (this.thght_2.isEmpty() && !this.shnt.isEmpty()) {
            for (String string : this.shnt) {
                class_2248 class_22482 = (class_2248)class_7923.field_41175.method_63535(class_2960.method_60654((String)string));
                if (class_22482 == null || this.thght_2.contains(class_22482)) continue;
                this.thght_2.add(class_22482);
            }
        }
        return this.thght_2;
    }

    @Override
    public JsonElement tdkh() {
        JsonArray jsonArray = new JsonArray();
        for (String string : this.shnt) {
            jsonArray.add((JsonElement)new JsonPrimitive(string));
        }
        return jsonArray;
    }

    @Override
    public void ha(JsonElement jsonElement) {
        this.shnt.clear();
        this.thght_2.clear();
        if (jsonElement.isJsonArray()) {
            for (JsonElement jsonElement2 : jsonElement.getAsJsonArray()) {
                String string = jsonElement2.getAsString();
                this.shnt.add(string);
                class_2248 class_22482 = (class_2248)class_7923.field_41175.method_63535(class_2960.method_60654((String)string));
                if (class_22482 == null) continue;
                this.thght_2.add(class_22482);
            }
        }
    }

    private static String[] qnflv0384(String string) {
        return string.split("\u0001\u0019", -1);
    }

    private static CallSite a89py0nztrt8(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ems573l7 ^ string.hashCode()) + (n2 + clypib80y1e7) + i ^ ems573l7, 18) + clypib80y1e7);
            }
            String[] stringArray = byl.qnflv0384(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

