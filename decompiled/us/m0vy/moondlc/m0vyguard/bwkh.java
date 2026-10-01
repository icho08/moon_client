/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.function.Supplier;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bdhk;
import us.m0vy.moondlc.m0vyguard.baj_2;

public class bwkh
extends baj_2 {
    private float[][] shts_3;
    private static final int b29e96pdwa1q = -1152895708;
    private static final int w0udvy9rf = -127961082;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int gipp95yuzj0k6m;

    public bwkh(String string, int n, Supplier supplier) {
        super(string);
        if (n < 2) {
            throw new IllegalArgumentException("A pattern needs at least two points");
        }
        this.shts_3 = new float[][]{new float[n], new float[n]};
        this.bqq(supplier);
    }

    public int bzw() {
        return this.shts_3[0].length;
    }

    public int dfdh(bdhk bdhk2) {
        return this.tyf(bdhk2).length;
    }

    public float slb(bdhk bdhk2, int n) {
        float[] fArray = this.tyf(bdhk2);
        return fArray[this.sdb_2(fArray, n)];
    }

    public void shghq(bdhk bdhk2, int n, float f) {
        if (!Float.isFinite(f)) {
            return;
        }
        float[] fArray = this.tyf(bdhk2);
        fArray[this.sdb_2((float[])fArray, (int)n)] = class_3532.method_15363((float)f, (float)-1.0f, (float)1.0f);
    }

    public boolean dat(bdhk bdhk2, float f, float f2) {
        float[] fArray = this.tyf(bdhk2);
        if (fArray.length >= 32 || !Float.isFinite(f) || !Float.isFinite(f2)) {
            return false;
        }
        int n = class_3532.method_15340((int)((int)Math.ceil(class_3532.method_15363((float)f, (float)0.0f, (float)1.0f) * (float)fArray.length)), (int)1, (int)(fArray.length - 1));
        float[] fArray2 = new float[fArray.length + 1];
        System.arraycopy(fArray, 0, fArray2, 0, n);
        fArray2[n] = class_3532.method_15363((float)f2, (float)-1.0f, (float)1.0f);
        System.arraycopy(fArray, n, fArray2, n + 1, fArray.length - n);
        if (bdhk2 == bdhk.syw) {
            this.shts_3[0] = fArray2;
        } else {
            this.shts_3[1] = fArray2;
        }
        return true;
    }

    public void shtq(bdhk bdhk2) {
        float[] fArray = this.tyf(bdhk2);
        for (int i = 0; i < fArray.length; ++i) {
            fArray[i] = 0.0f;
        }
    }

    public void khsy_2(bdhk bdhk2) {
        this.shtq(bdhk2);
    }

    @Override
    public void bm(JsonObject jsonObject) {
    }

    @Override
    public void bzk_2(JsonObject jsonObject) {
    }

    private float[] tyf(bdhk bdhk2) {
        return bdhk2 == bdhk.syw ? this.shts_3[0] : this.shts_3[1];
    }

    private int sdb_2(float[] fArray, int n) {
        if (n < 0 || n >= fArray.length) {
            throw new IndexOutOfBoundsException("Pattern point index out of bounds: " + n);
        }
        return n;
    }

    private static String[] ympfhd13e0kv5(String string) {
        return string.split("\u0002\u000f", -1);
    }

    private static CallSite qg30u7gw9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ b29e96pdwa1q ^ string.hashCode() ^ n2 + w0udvy9rf ^ i * 2130056649 ^ b29e96pdwa1q, 20) ^ w0udvy9rf));
            }
            String[] stringArray = bwkh.ympfhd13e0kv5(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

