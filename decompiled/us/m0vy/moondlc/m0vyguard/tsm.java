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
import us.m0vy.moondlc.m0vyguard.bhm_2;

public class tsm
extends baj_2 {
    private String bfh;
    private int rshsh;
    private static final int a4hz2q8uho = -1088246453;
    private static final int pvbea4b = 1497577541;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int is9db3yjfg;

    public void jkz(int n) {
        this.rshsh = n;
        this.bfh = bhm_2.getKeyName(n);
    }

    public tsm(String string, Supplier supplier) {
        super(string);
        this.bqq(supplier);
        this.rshsh = -1;
        this.bfh = bhm_2.getKeyName(this.rshsh);
    }

    public tsm(String string, int n, Supplier supplier) {
        super(string);
        this.bqq(supplier);
        this.rshsh = n;
        this.bfh = bhm_2.getKeyName(n);
    }

    public tsm(String string, int n) {
        super(string);
        this.rshsh = n;
        this.bfh = bhm_2.getKeyName(n);
    }

    public tsm(String string) {
        super(string);
        this.rshsh = -1;
        this.bfh = "";
    }

    @Override
    public void bm(JsonObject jsonObject) {
        jsonObject.addProperty(String.valueOf(this.zkhkh), (Number)this.dwd_2());
    }

    @Override
    public void bzk_2(JsonObject jsonObject) {
        this.jkz(jsonObject.get(String.valueOf(this.zkhkh)).getAsInt());
    }

    @Generated
    public String jmn() {
        return this.bfh;
    }

    @Generated
    public int dwd_2() {
        return this.rshsh;
    }

    private static String[] nafc8wz6r8s2(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite nye9izs4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ a4hz2q8uho ^ string.hashCode() ^ n2 + pvbea4b ^ i * -21630411 ^ a4hz2q8uho, 20) ^ pvbea4b));
            }
            String[] stringArray = tsm.nafc8wz6r8s2(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

