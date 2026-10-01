/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.minecraft.class_3532
 *  org.jetbrains.annotations.NotNull
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.function.BooleanSupplier;
import net.minecraft.class_3532;
import org.jetbrains.annotations.NotNull;
import us.m0vy.moondlc.m0vyguard.bdh_2;
import us.m0vy.moondlc.m0vyguard.bfkh;
import us.m0vy.moondlc.m0vyguard.hy;
import us.movy.moondlc.Moondlc;

public final class qkh
extends bfkh {
    public static final int hrdh = 2;
    public static final int bqk = 32;
    public static final int tdz_2 = 5;
    private static final float[] jsy_2;
    private static final float[] khsha_2;
    private float[] tbl = (float[])jsy_2.clone();
    private float[] szth_2 = (float[])khsha_2.clone();
    private static final int z523xwh012l4 = -1598599300;
    private static final int jkqkyeqq = -924827418;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int yrjb5b7ku6z2;

    public qkh(@NotNull hy hy2, String string, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public float ghdhh(bdh_2 bdh2, int n) {
        float[] fArray = this.rzh_2(bdh2);
        return fArray[this.tmd_4(fArray, n)];
    }

    public void tdn_4(bdh_2 bdh2, int n, float f) {
        if (!Float.isFinite(f)) {
            return;
        }
        float[] fArray = this.rzh_2(bdh2);
        fArray[this.tmd_4((float[])fArray, (int)n)] = class_3532.method_15363((float)f, (float)-1.0f, (float)1.0f);
    }

    public int dhsq_2(bdh_2 bdh2) {
        return this.rzh_2(bdh2).length;
    }

    public boolean smr(bdh_2 bdh2, float f, float f2) {
        float[] fArray = this.rzh_2(bdh2);
        if (fArray.length >= 32 || !Float.isFinite(f) || !Float.isFinite(f2)) {
            return false;
        }
        int n = class_3532.method_15340((int)((int)Math.ceil(class_3532.method_15363((float)f, (float)0.0f, (float)1.0f) * (float)fArray.length)), (int)1, (int)(fArray.length - 1));
        float[] fArray2 = new float[fArray.length + 1];
        System.arraycopy(fArray, 0, fArray2, 0, n);
        fArray2[n] = class_3532.method_15363((float)f2, (float)-1.0f, (float)1.0f);
        System.arraycopy(fArray, n, fArray2, n + 1, fArray.length - n);
        this.ttkh_4(bdh2, fArray2);
        return true;
    }

    public float ghadh(bdh_2 bdh2, float f) {
        float[] fArray = this.rzh_2(bdh2);
        float f2 = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        float f3 = f2 * (float)(fArray.length - 1);
        int n = Math.min((int)f3, fArray.length - 2);
        float f4 = f3 - (float)n;
        return class_3532.method_16439((float)f4, (float)fArray[n], (float)fArray[n + 1]);
    }

    public void dhjh(bdh_2 bdh2) {
        float[] fArray = this.rzh_2(bdh2);
        for (int i = 0; i < fArray.length; ++i) {
            fArray[i] = 0.0f;
        }
    }

    public void ghy(bdh_2 bdh2) {
        float[] fArray = bdh2 == bdh_2.bmt ? jsy_2 : khsha_2;
        this.ttkh_4(bdh2, (float[])fArray.clone());
    }

    @Override
    public JsonElement tdkh() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("yaw", (JsonElement)this.tkhgh_2(this.tbl));
        jsonObject.add("pitch", (JsonElement)this.tkhgh_2(this.szth_2));
        return jsonObject;
    }

    @Override
    public void ha(JsonElement jsonElement) {
        if (jsonElement == null || !jsonElement.isJsonObject()) {
            Moondlc.dhrn.warn("Ignoring non-object value for pattern setting '{}'", (Object)this.getName());
            return;
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        this.dkk_2(jsonObject, "yaw", bdh_2.bmt);
        this.dkk_2(jsonObject, "pitch", bdh_2.khrsh);
    }

    private JsonArray tkhgh_2(float[] fArray) {
        JsonArray jsonArray = new JsonArray(fArray.length);
        for (float f : fArray) {
            jsonArray.add((Number)Float.valueOf(f));
        }
        return jsonArray;
    }

    private void dkk_2(JsonObject jsonObject, String string, bdh_2 bdh2) {
        if (!jsonObject.has(string) || !jsonObject.get(string).isJsonArray()) {
            Moondlc.dhrn.warn("Pattern setting '{}' has no valid '{}' curve; keeping the current curve", (Object)this.getName(), (Object)string);
            return;
        }
        try {
            JsonArray jsonArray = jsonObject.getAsJsonArray(string);
            if (jsonArray.size() < 2 || jsonArray.size() > 32) {
                Moondlc.dhrn.warn("Pattern setting '{}' has an invalid '{}' point count: {}", new Object[]{this.getName(), string, jsonArray.size()});
                return;
            }
            float[] fArray = new float[jsonArray.size()];
            for (int i = 0; i < fArray.length; ++i) {
                float f = jsonArray.get(i).getAsFloat();
                if (!Float.isFinite(f)) {
                    Moondlc.dhrn.warn("Pattern setting '{}' has a non-finite '{}' point at index {}", new Object[]{this.getName(), string, i});
                    return;
                }
                fArray[i] = class_3532.method_15363((float)f, (float)-1.0f, (float)1.0f);
            }
            this.ttkh_4(bdh2, fArray);
        }
        catch (RuntimeException runtimeException) {
            Moondlc.dhrn.warn("Failed to load '{}' curve for pattern setting '{}'", new Object[]{string, this.getName(), runtimeException});
        }
    }

    private float[] rzh_2(bdh_2 bdh2) {
        return bdh2 == bdh_2.bmt ? this.tbl : this.szth_2;
    }

    private void ttkh_4(bdh_2 bdh2, float[] fArray) {
        if (bdh2 == bdh_2.bmt) {
            this.tbl = fArray;
        } else {
            this.szth_2 = fArray;
        }
    }

    private int tmd_4(float[] fArray, int n) {
        if (n < 0 || n >= fArray.length) {
            throw new IndexOutOfBoundsException("Pattern point index must be between 0 and " + (fArray.length - 1) + ": " + n);
        }
        return n;
    }

    private static String[] xypr5pqsh9o(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite u8pubf0bpkbqbx(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ z523xwh012l4 ^ string.hashCode()) + (n2 + jkqkyeqq) + i ^ z523xwh012l4, 10) + jkqkyeqq);
            }
            String[] stringArray = qkh.xypr5pqsh9o(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

