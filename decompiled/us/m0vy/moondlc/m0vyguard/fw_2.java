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

public class fw_2
extends bfkh {
    private Runnable zan = System.out::println;
    private static final int ey87tx3myag = -2131140455;
    private static final int ecvc6xwq9eid = -455518252;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int rjxq02b5;

    public fw_2(@NotNull hy hy2, String string, String string2, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public fw_2(@NotNull hy hy2, String string, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public fw_2(@NotNull hy hy2, String string, String string2) {
        super(hy2, string);
    }

    public fw_2(@NotNull hy hy2, String string) {
        super(hy2, string);
    }

    public fw_2 ghbt(Runnable runnable) {
        this.zan = runnable;
        return this;
    }

    @Override
    public JsonElement tdkh() {
        return new JsonPrimitive("button");
    }

    @Override
    public void ha(JsonElement jsonElement) {
    }

    @Generated
    public Runnable dqt() {
        return this.zan;
    }

    @Generated
    public void dhzj(Runnable runnable) {
        this.zan = runnable;
    }

    private static String[] tto3s57tzcra(String string) {
        return string.split("\u0002\u0015", -1);
    }

    private static CallSite cwqye1feaq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ey87tx3myag ^ string.hashCode()) + (n2 + ecvc6xwq9eid) + i ^ ey87tx3myag, 7) + ecvc6xwq9eid);
            }
            String[] stringArray = fw_2.tto3s57tzcra(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

