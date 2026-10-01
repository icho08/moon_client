/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.function.Supplier;
import us.m0vy.moondlc.m0vyguard.baj_2;
import us.m0vy.moondlc.m0vyguard.tshd;

public class bdhl
extends baj_2 {
    private final tshd tzk;
    private static final int p3ewa12d = 577980658;
    private static final int e4chctspfly = -1404082026;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int lwf0asatt5dfh;

    public bdhl(tshd tshd2, Supplier supplier) {
        super(tshd2.getName());
        this.tzk = tshd2;
        this.bqq(supplier);
    }

    public float tzf_3() {
        return this.tzk.hht();
    }

    public float dghth_2() {
        return this.tzk.awt_2();
    }

    public void drz_4(float f) {
        this.tzk.dhmkh(f);
    }

    public void zght(float f) {
        this.tzk.thzz_3(f);
    }

    public float twth_2() {
        return this.tzk.tdh_6();
    }

    public float jygh() {
        return this.tzk.ghjdh();
    }

    public float bmw() {
        return this.tzk.sdhq();
    }

    @Override
    public void bm(JsonObject jsonObject) {
    }

    @Override
    public void bzk_2(JsonObject jsonObject) {
    }

    private static String[] w5vqcfdgnbk4(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite bo8clwo1til9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ p3ewa12d ^ string.hashCode() ^ n2 + e4chctspfly ^ i * 441213951 ^ p3ewa12d, 4) ^ e4chctspfly));
            }
            String[] stringArray = bdhl.w5vqcfdgnbk4(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

