/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.function.Supplier;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.baj_2;
import us.m0vy.moondlc.m0vyguard.bkt;
import us.m0vy.moondlc.m0vyguard.shd_6;

public class bzm_2
extends baj_2 {
    private bkt shdhd_2;
    private final shd_6 gha;
    private static final int wx1tm10jqv = -1898211829;
    private static final int bqwtu3i = 313031978;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int waf7qcymn2;

    public bzm_2(String string, bkt bkt2, Supplier supplier, shd_6 shd2) {
        this(string, bkt2, shd2);
        this.bqq(supplier);
    }

    public bzm_2(String string, bkt bkt2, shd_6 shd2) {
        super(string);
        if (bkt2 == null) {
            throw new RuntimeException(string + " color is null");
        }
        this.shdhd_2 = bkt2;
        this.jdh_4(bkt2);
        this.gha = shd2;
    }

    public bzm_2(String string, bkt bkt2) {
        this(string, bkt2, () -> bzm_2.blw(bkt2));
    }

    public bzm_2(String string, shd_6 shd2) {
        this(string, shd2.getDefaultColor(), shd2);
    }

    public bzm_2(String string, bkt bkt2, Supplier supplier) {
        this(string, bkt2, supplier, () -> bzm_2.bdhm(bkt2));
    }

    public int jts_2() {
        return this.shdhd_2.btkh();
    }

    public void bhs_2(int n) {
        this.shdhd_2 = new bkt(n);
    }

    public void jdh_4(bkt bkt2) {
        this.shdhd_2 = bkt2;
    }

    public void hbl() {
    }

    public void smsh() {
        this.shdhd_2 = this.gha.getDefaultColor();
    }

    public bkt zqa_2(float f) {
        return this.shdhd_2.shbm(f);
    }

    @Override
    public void bm(JsonObject jsonObject) {
        jsonObject.addProperty(String.valueOf(this.zkhkh), (Number)this.jts_2());
    }

    @Override
    public void bzk_2(JsonObject jsonObject) {
        this.bhs_2(jsonObject.get(String.valueOf(this.zkhkh)).getAsInt());
    }

    @Generated
    public bkt skhgh_2() {
        return this.shdhd_2;
    }

    private static bkt bdhm(bkt bkt2) {
        return bkt2;
    }

    private static bkt blw(bkt bkt2) {
        return bkt2;
    }

    private static String[] aqz63wmi(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ns4c8qv8p7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ wx1tm10jqv ^ string.hashCode()) + (n2 + bqwtu3i) + i ^ wx1tm10jqv, 19) + bqwtu3i);
            }
            String[] stringArray = bzm_2.aqz63wmi(new String(cArray));
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

