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
import us.m0vy.moondlc.m0vyguard.bdz;
import us.m0vy.moondlc.m0vyguard.bhn_2;

public abstract class baj_2 {
    protected final String zkhkh;
    private final bhn_2 rmd = new bhn_2(250L, bdz.shll);
    protected Supplier rhdh;
    private static final int hbxz8q6vkt = -2136121722;
    private static final int vtgoxqpno4p = 917206852;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int rhandit2mtrwe;

    public baj_2(String string) {
        this.zkhkh = string;
        this.bqq(baj_2::dhskh);
    }

    public abstract void bm(JsonObject var1);

    public abstract void bzk_2(JsonObject var1);

    public boolean baa_2() {
        return (Boolean)this.rhdh.get();
    }

    @Generated
    public String getName() {
        return this.zkhkh;
    }

    @Generated
    public bhn_2 szq_2() {
        return this.rmd;
    }

    @Generated
    public Supplier zzt() {
        return this.rhdh;
    }

    @Generated
    public void bqq(Supplier supplier) {
        this.rhdh = supplier;
    }

    private static Boolean dhskh() {
        return true;
    }

    private static String[] ml216xcn5a(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite olox1d15nc59x(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ hbxz8q6vkt ^ string.hashCode()) + (n2 + vtgoxqpno4p) + i ^ hbxz8q6vkt, 12) + vtgoxqpno4p);
            }
            String[] stringArray = baj_2.ml216xcn5a(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

