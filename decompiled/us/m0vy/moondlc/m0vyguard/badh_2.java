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
import us.m0vy.moondlc.m0vyguard.tshkh;
import us.m0vy.moondlc.m0vyguard.hy;

public class badh_2
extends bfkh
implements tshkh {
    private boolean dhzt_4;
    private static final int tstdhoixx0 = -1914325909;
    private static final int lpx4f6v12bhj = -518136397;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int g8sc6nf7n;

    public badh_2(@NotNull hy hy2, String string, String string2, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public badh_2(@NotNull hy hy2, String string, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public badh_2(@NotNull hy hy2, String string, String string2) {
        super(hy2, string);
    }

    public badh_2(@NotNull hy hy2, String string) {
        super(hy2, string);
    }

    public badh_2 bts(boolean bl) {
        this.dhzt_4 = bl;
        return this;
    }

    public badh_2 tkm() {
        this.dhzt_4 = true;
        return this;
    }

    @Override
    public JsonElement tdkh() {
        return new JsonPrimitive(Boolean.valueOf(this.dhzt_4));
    }

    @Override
    public void ha(JsonElement jsonElement) {
        this.thf_5(jsonElement.getAsBoolean());
    }

    @Override
    public void dwkh() {
        this.dhzt_4 = !this.dhzt_4;
    }

    @Override
    public void nt() {
    }

    @Override
    public void nc() {
    }

    @Generated
    public boolean shzl() {
        return this.dhzt_4;
    }

    public boolean hdh() {
        return this.dhzt_4;
    }

    public void bghb(boolean bl) {
        this.thf_5(bl);
    }

    @Generated
    public void thf_5(boolean bl) {
        this.dhzt_4 = bl;
    }

    private static String[] i83ztqb5hp(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ecus1uo0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ tstdhoixx0 ^ string.hashCode() ^ n2 + lpx4f6v12bhj + i * -782833427) + tstdhoixx0) ^ lpx4f6v12bhj));
            }
            String[] stringArray = badh_2.i83ztqb5hp(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

