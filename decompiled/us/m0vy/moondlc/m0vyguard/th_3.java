/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.minecraft.class_1792
 *  net.minecraft.class_2248
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Supplier;
import net.minecraft.class_1792;
import net.minecraft.class_2248;
import us.m0vy.moondlc.m0vyguard.baj_2;
import us.m0vy.moondlc.m0vyguard.tbj;

public class th_3
extends baj_2 {
    private List dhhd;
    private static final Gson tshth;
    private static final int j14vpcpdbkslm = 803620628;
    private static final int sox9gvbx7wb = 1053495939;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int inqvpevz18;

    public void dhlw(List list) {
        this.dhhd = list;
    }

    public th_3(String string, List list) {
        this(string, list, th_3::dhskh);
    }

    public th_3(String string, List list, Supplier supplier) {
        super(string);
        this.dhhd = list;
    }

    public List zdt_4() {
        return this.dhhd;
    }

    public void jwt(String string) {
        this.dhhd.add(string);
    }

    public void bsn_2(String string) {
        this.dhhd.remove(string);
    }

    public boolean asgh(String string) {
        return this.dhhd.contains(string);
    }

    public void adhh(class_2248 class_22482) {
        this.jwt(class_22482.method_63499().replace("block.minecraft.", ""));
    }

    public void thadh_2(class_1792 class_17922) {
        this.jwt(class_17922.method_7876().replace("item.minecraft.", ""));
    }

    public void syd_3(class_2248 class_22482) {
        this.bsn_2(class_22482.method_63499().replace("block.minecraft.", ""));
    }

    public void bzt_3(class_1792 class_17922) {
        this.bsn_2(class_17922.method_7876().replace("item.minecraft.", ""));
    }

    public boolean azb(class_2248 class_22482) {
        return this.asgh(class_22482.method_63499().replace("block.minecraft.", ""));
    }

    public boolean thta(class_1792 class_17922) {
        return this.asgh(class_17922.method_7876().replace("item.minecraft.", ""));
    }

    public void twn_2() {
        this.dhhd.clear();
    }

    @Override
    public void bm(JsonObject jsonObject) {
        jsonObject.add(String.valueOf(this.zkhkh), tshth.toJsonTree((Object)this.zdt_4()));
    }

    @Override
    public void bzk_2(JsonObject jsonObject) {
        Type type = new tbj(this).getType();
        JsonElement jsonElement = jsonObject.get(String.valueOf(this.zkhkh));
        if (jsonElement != null && jsonElement.isJsonArray()) {
            List list = (List)tshth.fromJson(jsonElement, type);
            this.dhlw(list);
        }
    }

    private static Boolean dhskh() {
        return true;
    }

    private static String[] ddbbhs3lw(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite yvpx5aco7o80c(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ j14vpcpdbkslm ^ string.hashCode() ^ n2 + sox9gvbx7wb + i * 237300711) + j14vpcpdbkslm) ^ sox9gvbx7wb));
            }
            String[] stringArray = th_3.ddbbhs3lw(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

