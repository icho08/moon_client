/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;

public class bkhth {
    private final int tns_2;
    private final int ryb;
    private final int khys;
    private final boolean bbdh;
    private final List<String> blr;
    private static final int zic2gzhm3kz4 = 1474339027;
    private static final int btebph9wdzt8 = 474888620;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int lkirxehuyl;

    public bkhth(int n, int n2, int n3, boolean bl, List list) {
        this.tns_2 = n;
        this.ryb = n2;
        this.khys = n3;
        this.bbdh = bl;
        this.blr = list;
    }

    public static bkhth dddh_3(String string) {
        JsonObject jsonObject = JsonParser.parseString((String)string).getAsJsonObject();
        int n = jsonObject.get("width").getAsInt();
        int n2 = jsonObject.get("height").getAsInt();
        int n3 = jsonObject.get("fps").getAsInt();
        boolean bl = jsonObject.get("loop_mode").getAsString().equals("loop");
        ArrayList<String> arrayList = new ArrayList<String>();
        JsonArray jsonArray = jsonObject.getAsJsonArray("frames");
        for (int i = 0; i < jsonArray.size(); ++i) {
            JsonObject jsonObject2 = jsonArray.get(i).getAsJsonObject();
            arrayList.add(jsonObject2.get("file").getAsString());
        }
        return new bkhth(n, n2, n3, bl, arrayList);
    }

    public long dht_8() {
        return 1000L / (long)this.khys;
    }

    public int thmgh() {
        return this.blr.size();
    }

    @Generated
    public int znf() {
        return this.tns_2;
    }

    @Generated
    public int hzt_3() {
        return this.ryb;
    }

    @Generated
    public int zyd_3() {
        return this.khys;
    }

    @Generated
    public boolean tqy_2() {
        return this.bbdh;
    }

    @Generated
    public List dtj_3() {
        return this.blr;
    }

    private static String[] o49vc3azk3l(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite kfuea6nr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ zic2gzhm3kz4 ^ string.hashCode() ^ n2 + btebph9wdzt8 ^ i * -1230310503 ^ zic2gzhm3kz4, 17) ^ btebph9wdzt8));
            }
            String[] stringArray = bkhth.o49vc3azk3l(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

