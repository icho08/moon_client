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
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bdz;
import us.m0vy.moondlc.m0vyguard.baj_2;
import us.m0vy.moondlc.m0vyguard.bhn_2;
import us.m0vy.moondlc.m0vyguard.sdh_3;

public class rr
extends baj_2 {
    private final List dthf = new ArrayList();
    private sdh_3 ddhf;
    private boolean khay = false;
    private boolean hkhz = false;
    private final bhn_2 khwb = new bhn_2(250L, bdz.shll);
    private static final int qo5y3n4v6 = -440430063;
    private static final int e6axfs9diw4 = 950979851;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int k8gfjwftal;

    public boolean dhkr() {
        return this.khay;
    }

    public void jdt(boolean bl) {
        this.khay = bl;
    }

    public boolean zst() {
        return this.hkhz;
    }

    public void sjz_2(boolean bl) {
        this.hkhz = bl;
    }

    public bhn_2 bjk() {
        return this.khwb;
    }

    public rr(String string, String ... stringArray) {
        super(string);
        String[] stringArray2 = stringArray;
        int n = stringArray.length;
        for (int i = 0; i < n; ++i) {
            String string2 = stringArray2[i];
            if (string2.isEmpty()) continue;
            new sdh_3(this, string2);
        }
        if (!this.dthf.isEmpty()) {
            this.ddhf = (sdh_3)this.dthf.getFirst();
        }
    }

    public rr(String string, Supplier supplier, String ... stringArray) {
        super(string);
        String[] stringArray2 = stringArray;
        int n = stringArray.length;
        for (int i = 0; i < n; ++i) {
            String string2 = stringArray2[i];
            if (string2.isEmpty()) continue;
            new sdh_3(this, string2);
        }
        if (!this.dthf.isEmpty()) {
            this.ddhf = (sdh_3)this.dthf.getFirst();
        }
        this.bqq(supplier);
    }

    public void rfr(String string) {
        this.dthf.stream().filter(arg_0 -> rr.thmd(string, arg_0)).findFirst().ifPresent(this::ghskh);
    }

    public String tdd_4() {
        return this.ddhf != null ? this.ddhf.getName() : "";
    }

    public boolean zht(String string) {
        return this.ddhf != null && this.ddhf.getName().equals(string);
    }

    public boolean khd_2(sdh_3 sdh2) {
        return this.ddhf == sdh2;
    }

    public sdh_3 dj_2() {
        List<sdh_3> list = this.dthf.stream().filter(sdh_3::swz).toList();
        return !list.isEmpty() ? list.get(new Random().nextInt(list.size())) : null;
    }

    @Override
    public void bm(JsonObject jsonObject) {
        jsonObject.addProperty(String.valueOf(this.zkhkh), this.tdd_4());
    }

    @Override
    public void bzk_2(JsonObject jsonObject) {
        this.rfr(jsonObject.get(String.valueOf(this.zkhkh)).getAsString());
    }

    @Generated
    public List bla_2() {
        return this.dthf;
    }

    @Generated
    public sdh_3 znh_4() {
        return this.ddhf;
    }

    @Generated
    public void jm(sdh_3 sdh2) {
        this.ddhf = sdh2;
    }

    private void ghskh(sdh_3 sdh2) {
        this.ddhf = sdh2;
    }

    private static boolean thmd(String string, sdh_3 sdh2) {
        return sdh2.getName().equals(string);
    }

    private static String[] o06oss56nt(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ywyda40iz9xb2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ qo5y3n4v6 ^ string.hashCode()) + (n2 + e6axfs9diw4) + i ^ qo5y3n4v6, 9) + e6axfs9diw4);
            }
            String[] stringArray = rr.o06oss56nt(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

