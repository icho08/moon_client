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

public class yd {
    private final int tsj;
    private final int tdhz_2;
    private final int thlgh;
    private final boolean tzz_4;
    private final List bmz_2;
    private static final int ia5qv75bfk = 1027983072;
    private static final int rxzw2twz9m3v6 = -717199607;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int tr5egn3qq;

    public static yd haq(String string) {
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
        return new yd(n, n2, n3, bl, arrayList);
    }

    public long djs_2() {
        return 1000L / (long)this.thlgh;
    }

    public int rzgh_2() {
        return this.bmz_2.size();
    }

    @Generated
    public int ghdd_4() {
        return this.tsj;
    }

    @Generated
    public int khnth() {
        return this.tdhz_2;
    }

    @Generated
    public int jab() {
        return this.thlgh;
    }

    @Generated
    public boolean takh_3() {
        return this.tzz_4;
    }

    @Generated
    public List jtht_2() {
        return this.bmz_2;
    }

    @Generated
    public yd(int n, int n2, int n3, boolean bl, List list) {
        this.tsj = n;
        this.tdhz_2 = n2;
        this.thlgh = n3;
        this.tzz_4 = bl;
        this.bmz_2 = list;
    }

    private static String[] orf99lh8(String string) {
        return string.split("\u0001\u000e", -1);
    }

    private static CallSite nt6j8frk2c19r(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ia5qv75bfk ^ string.hashCode() ^ n2 + rxzw2twz9m3v6 ^ i * -1565764617 ^ ia5qv75bfk, 11) ^ rxzw2twz9m3v6));
            }
            String[] stringArray = yd.orf99lh8(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

