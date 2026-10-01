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
import us.m0vy.moondlc.m0vyguard.ts_4;

public class shsh_5
extends baj_2 {
    private final ts_4 jkgh;
    private static final int tcosoix48ps8 = 938864211;
    private static final int oilan5p = -1228562113;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int nji4zn057h;

    public shsh_5(ts_4 ts2, Supplier supplier) {
        super(ts2.getName());
        this.jkgh = ts2;
        this.bqq(supplier);
    }

    public String shqkh() {
        return this.jkgh.dysh() == null ? "" : this.jkgh.dysh();
    }

    public void ajb(String string) {
        this.jkgh.shsd_2(string == null ? "" : string);
    }

    public void dhw_5(char c) {
        this.ajb(this.shqkh() + c);
    }

    public void jdhdh() {
        String string = this.shqkh();
        if (!string.isEmpty()) {
            this.ajb(string.substring(0, string.length() - 1));
        }
    }

    @Override
    public void bm(JsonObject jsonObject) {
    }

    @Override
    public void bzk_2(JsonObject jsonObject) {
    }

    private static String[] atlftgj1e2w384(String string) {
        return string.split("\u0007\u0017", -1);
    }

    private static CallSite fkuna9cs9u07m0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ tcosoix48ps8 ^ string.hashCode() ^ n2 + oilan5p + i * -819696581) + tcosoix48ps8) ^ oilan5p));
            }
            String[] stringArray = shsh_5.atlftgj1e2w384(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

