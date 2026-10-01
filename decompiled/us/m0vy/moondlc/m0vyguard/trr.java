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
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.baj_2;

public class trr
extends baj_2 {
    private Runnable rkht_2;
    private static final int aqx300fyf = -2042712435;
    private static final int kzp5vrliwq = -1961483491;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ap5hmlb4;

    public trr(String string, Runnable runnable) {
        super(string);
        this.rkht_2 = runnable;
    }

    public void dss_3() {
        this.rkht_2.run();
    }

    @Override
    public void bm(JsonObject jsonObject) {
    }

    @Override
    public void bzk_2(JsonObject jsonObject) {
    }

    @Generated
    public Runnable dghd_4() {
        return this.rkht_2;
    }

    @Generated
    public void shtk(Runnable runnable) {
        this.rkht_2 = runnable;
    }

    private static String[] iapsdgv52(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite hronlk1cqrr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ aqx300fyf ^ string.hashCode() ^ n2 + kzp5vrliwq ^ i * 1703429965 ^ aqx300fyf, 17) ^ kzp5vrliwq));
            }
            String[] stringArray = trr.iapsdgv52(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

