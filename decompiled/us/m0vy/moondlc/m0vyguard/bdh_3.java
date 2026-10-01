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

public class bdh_3
extends bfkh {
    private int jghl = -1;
    private static final int gou3kep = -1133433552;
    private static final int vs1vcklr88d08 = 962522733;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int rzjssdqnpw12;

    public bdh_3(@NotNull hy hy2, String string, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public bdh_3(@NotNull hy hy2, String string) {
        super(hy2, string);
    }

    public bdh_3 ztn_4(int n) {
        this.jghl = n;
        return this;
    }

    public boolean tmw(int n) {
        return this.jghl == n && this.tsa_5();
    }

    @Override
    public JsonElement tdkh() {
        return new JsonPrimitive((Number)this.jghl);
    }

    @Override
    public void ha(JsonElement jsonElement) {
        if (jsonElement != null && jsonElement.isJsonPrimitive()) {
            this.khsh(-1);
            int n = jsonElement.getAsInt();
            if (n != -1) {
                this.khsh(n);
            }
        }
    }

    @Generated
    public void khsh(int n) {
        this.jghl = n;
    }

    @Generated
    public int sdhkh() {
        return this.jghl;
    }

    public int dda_4() {
        return this.jghl;
    }

    public void dbt_4(int n) {
        this.jghl = n;
    }

    private static String[] vfmabyy2(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite najn414kxvu8(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ gou3kep ^ string.hashCode() ^ n2 + vs1vcklr88d08 ^ i * 1110849151 ^ gou3kep, 26) ^ vs1vcklr88d08));
            }
            String[] stringArray = bdh_3.vfmabyy2(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

