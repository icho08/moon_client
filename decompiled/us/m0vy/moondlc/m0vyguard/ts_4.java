/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 *  lombok.Generated
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
import org.jetbrains.annotations.NotNull;
import us.m0vy.moondlc.m0vyguard.bfkh;
import us.m0vy.moondlc.m0vyguard.hy;

public class ts_4
extends bfkh {
    private String dghh;
    private static final int poldjm6t1h6f = 1590457530;
    private static final int dg0jfve = 1741808354;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int e1t2hyn8banw;

    public ts_4(@NotNull hy hy2, String string, String string2, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public ts_4(@NotNull hy hy2, String string, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public ts_4(@NotNull hy hy2, String string, String string2) {
        super(hy2, string);
    }

    public ts_4(@NotNull hy hy2, String string) {
        super(hy2, string);
    }

    public ts_4 tshgh(String string) {
        this.dghh = string;
        return this;
    }

    @Override
    public JsonElement tdkh() {
        return new JsonPrimitive(this.dghh);
    }

    @Override
    public void ha(JsonElement jsonElement) {
        this.tshgh(jsonElement.getAsString());
    }

    @Generated
    public String dysh() {
        return this.dghh;
    }

    @Generated
    public void shsd_2(String string) {
        this.dghh = string;
    }

    private static String[] khcy3n81zjsa9s(String string) {
        return string.split("\u0004\u000e", -1);
    }

    private static CallSite wpb1igbkqh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ poldjm6t1h6f ^ string.hashCode()) + (n2 + dg0jfve) + i ^ poldjm6t1h6f, 19) + dg0jfve);
            }
            String[] stringArray = ts_4.khcy3n81zjsa9s(new String(cArray));
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

