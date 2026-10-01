/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bdhb;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.zy_2;

public class bnn {
    private static final bnn INSTANCE;
    private boolean thakh_2 = false;
    private byq shkth = new byq(228.0f, 96.0f, 255.0f, 255.0f);
    private byq sfs_2 = new byq(99.0f, 255.0f, 123.0f, 255.0f);
    private boolean rhb = true;
    private zy_2 khtkh_2 = zy_2.dfr;
    private float dhfw = 150.0f;
    private float hyth = 400.0f;
    private boolean dagh_2 = false;
    private float dkhq = 85.0f;
    public static final byq[] khla_2;
    private static final int hgs0hd7a48 = -1390518751;
    private static final int qu1no5tf1i = -1914637339;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int bdcviy04ye;

    public static bnn dzb_2() {
        return INSTANCE;
    }

    public bnn() {
        this.khwa();
    }

    public void ahkh(boolean bl) {
        this.thakh_2 = bl;
        this.rthd();
    }

    public void tyh_2(boolean bl) {
        this.dagh_2 = bl;
        this.rthd();
    }

    public void hkh_4(float f) {
        this.dkhq = Math.max(0.0f, Math.min(100.0f, f));
        this.rthd();
    }

    public void khghz(byq byq2) {
        this.shkth = byq2;
        this.rthd();
    }

    public void hddh(byq byq2) {
        this.sfs_2 = byq2;
        this.rthd();
    }

    public void sdha_2(boolean bl) {
        this.rhb = bl;
        this.rthd();
    }

    public void shwr(zy_2 zy2) {
        this.khtkh_2 = zy2;
        this.rthd();
    }

    public void syr(float f) {
        this.dhfw = Math.max(10.0f, Math.min(300.0f, f));
        this.rthd();
    }

    public void khnb(float f) {
        this.hyth = Math.max(100.0f, Math.min(1000.0f, f));
        this.rthd();
    }

    public void rthd() {
        try {
            File file = new File(bdhb.dhdhd_2);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "theme_settings.json");
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("darkMode", Boolean.valueOf(this.thakh_2));
            jsonObject.addProperty("transparent", Boolean.valueOf(this.dagh_2));
            jsonObject.addProperty("bgOpacity", (Number)Float.valueOf(this.dkhq));
            jsonObject.addProperty("primaryAccent", this.shkth.ddl_4());
            jsonObject.addProperty("secondaryAccent", this.sfs_2.ddl_4());
            jsonObject.addProperty("animGradient", Boolean.valueOf(this.rhb));
            jsonObject.addProperty("animType", this.khtkh_2.name());
            jsonObject.addProperty("sidebarSpeedMs", (Number)Float.valueOf(this.dhfw));
            jsonObject.addProperty("animSpeedMs", (Number)Float.valueOf(this.hyth));
            try (FileWriter fileWriter = new FileWriter(file2);){
                fileWriter.write(jsonObject.toString());
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void khwa() {
        try {
            File file = new File(bdhb.dhdhd_2, "theme_settings.json");
            if (!file.exists()) {
                return;
            }
            try (FileReader fileReader = new FileReader(file);){
                JsonObject jsonObject = JsonParser.parseReader((Reader)fileReader).getAsJsonObject();
                if (jsonObject.has("darkMode")) {
                    this.thakh_2 = jsonObject.get("darkMode").getAsBoolean();
                }
                if (jsonObject.has("transparent")) {
                    this.dagh_2 = jsonObject.get("transparent").getAsBoolean();
                }
                if (jsonObject.has("bgOpacity")) {
                    this.dkhq = jsonObject.get("bgOpacity").getAsFloat();
                }
                if (jsonObject.has("primaryAccent")) {
                    this.shkth = byq.rghk(jsonObject.get("primaryAccent").getAsString());
                }
                if (jsonObject.has("secondaryAccent")) {
                    this.sfs_2 = byq.rghk(jsonObject.get("secondaryAccent").getAsString());
                }
                if (jsonObject.has("animGradient")) {
                    this.rhb = jsonObject.get("animGradient").getAsBoolean();
                }
                if (jsonObject.has("animType")) {
                    String string = jsonObject.get("animType").getAsString();
                    if (string.equalsIgnoreCase("FLAME")) {
                        string = "FADE";
                    }
                    this.khtkh_2 = zy_2.valueOf(string);
                }
                if (jsonObject.has("sidebarSpeedMs")) {
                    this.dhfw = jsonObject.get("sidebarSpeedMs").getAsFloat();
                }
                if (jsonObject.has("animSpeedMs")) {
                    this.hyth = jsonObject.get("animSpeedMs").getAsFloat();
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public byq dhdhk(float f) {
        if (!this.rhb) {
            return this.shkth;
        }
        double d = (double)System.currentTimeMillis() / 800.0;
        double d2 = (double)f * 0.008;
        float f2 = (float)Math.sin(d + d2) * 0.5f + 0.5f;
        return this.shkth.dkhw_2(this.sfs_2, f2);
    }

    public byq khfl() {
        return this.dhdhk(0.0f);
    }

    @Generated
    public boolean ghdt() {
        return this.thakh_2;
    }

    @Generated
    public byq kb() {
        return this.shkth;
    }

    @Generated
    public byq rha_3() {
        return this.sfs_2;
    }

    @Generated
    public boolean sns() {
        return this.rhb;
    }

    @Generated
    public zy_2 zks_4() {
        return this.khtkh_2;
    }

    @Generated
    public float hmdh() {
        return this.dhfw;
    }

    @Generated
    public float art() {
        return this.hyth;
    }

    @Generated
    public boolean hthz() {
        return this.dagh_2;
    }

    @Generated
    public float zda_7() {
        return this.dkhq;
    }

    private static String[] cqoyt53b8(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite sx6uui96q(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ hgs0hd7a48 ^ string.hashCode()) + (n2 + qu1no5tf1i) + i ^ hgs0hd7a48, 28) + qu1no5tf1i);
            }
            String[] stringArray = bnn.cqoyt53b8(new String(cArray));
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

