/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  net.minecraft.class_2248
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
import java.util.function.Supplier;
import net.minecraft.class_2248;
import us.m0vy.moondlc.m0vyguard.baj_2;

public class tsd_2
extends baj_2 {
    private String thdhd_2 = "";
    private boolean tyh;
    private static final int cgst0f9rjin0g = 1594219671;
    private static final int smkpnk6 = 987898430;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int m6hhchprnz3et;

    public tsd_2(String string, Supplier supplier) {
        super(string);
        this.bqq(supplier);
    }

    public String shkht() {
        return this.thdhd_2;
    }

    public void dhhkh_2(String string) {
        this.thdhd_2 = string == null ? "" : string;
    }

    public void rdt_4(char c) {
        if (!Character.isISOControl(c)) {
            this.thdhd_2 = this.thdhd_2 + c;
        }
    }

    public void tmt() {
        if (!this.thdhd_2.isEmpty()) {
            this.thdhd_2 = this.thdhd_2.substring(0, this.thdhd_2.length() - 1);
        }
    }

    public boolean khkt() {
        return this.tyh;
    }

    public void thlz_2(boolean bl) {
        this.tyh = bl;
    }

    public int jssh() {
        return 0;
    }

    public boolean shthr(class_2248 class_22482) {
        return false;
    }

    public void jfd_2(class_2248 class_22482) {
    }

    public void dsq_2() {
    }

    public List ddhl_2(int n) {
        return new ArrayList();
    }

    public String rhh_2(class_2248 class_22482) {
        return "";
    }

    public List dbz_2(int n) {
        return new ArrayList();
    }

    @Override
    public void bm(JsonObject jsonObject) {
    }

    @Override
    public void bzk_2(JsonObject jsonObject) {
    }

    private static String[] wnwmlh9lqc8v(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite hvaqqjuu(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ cgst0f9rjin0g ^ string.hashCode() ^ n2 + smkpnk6 + i * 1600927579) + cgst0f9rjin0g) ^ smkpnk6));
            }
            String[] stringArray = tsd_2.wnwmlh9lqc8v(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

