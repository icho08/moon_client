/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  lombok.Generated
 *  net.minecraft.class_310
 *  net.minecraft.class_642
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.Generated;
import net.minecraft.class_310;
import net.minecraft.class_642;
import us.m0vy.moondlc.m0vyguard.bjk;
import us.m0vy.moondlc.m0vyguard.bdhb;
import us.m0vy.moondlc.m0vyguard.bdhw;
import us.m0vy.moondlc.m0vyguard.bsb;
import us.m0vy.moondlc.m0vyguard.tr_2;
import us.m0vy.moondlc.m0vyguard.qk;
import us.m0vy.moondlc.m0vyguard.hj_2;
import us.movy.moondlc.Moondlc;

public class bhdh {
    private static final Gson dhdj_2;
    private static final bhdh rhk;
    private final Path dhlz;
    private String jsb = "default";
    private long dhzd_4 = System.currentTimeMillis();
    private static final int li62ka6l6w = 53924550;
    private static final int aym3edl9hwtc = -810607676;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int mlp6v9qjhvf;

    private bhdh() {
        this.dhlz = Paths.get(bdhb.dhdhd_2, new String[0]);
        try {
            Files.createDirectories(this.dhlz, new FileAttribute[0]);
            if (!Files.exists(this.dhlz.resolve("default.moon"), new LinkOption[0])) {
                this.daw_3("default");
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException("Failed to create config dir", iOException);
        }
    }

    public List ml() {
        File file = new File(bdhb.dhdhd_2);
        if (!file.exists()) {
            return Collections.emptyList();
        }
        File[] fileArray = file.listFiles(bhdh::sha_2);
        if (fileArray == null) {
            return Collections.emptyList();
        }
        return Arrays.stream(fileArray).map(bhdh::dhbgh).collect(Collectors.toList());
    }

    private Path ghsha(String string) {
        return this.dhlz.resolve(string + ".moon");
    }

    public void dfa_2() {
        if (System.currentTimeMillis() - this.dhzd_4 > 600000L) {
            this.daw_3(this.jsb);
            this.dhzd_4 = System.currentTimeMillis();
        }
    }

    public void daw_3(String string) {
        this.jsb = string;
        this.dhzd_4 = System.currentTimeMillis();
        JsonObject jsonObject = new JsonObject();
        List list = Moondlc.getInstance().getModuleManager().rdhs();
        JsonObject jsonObject2 = new JsonObject();
        for (bsb bsb2 : list) {
            jsonObject2.add(bsb2.getName(), (JsonElement)this.hghh(bsb2));
        }
        jsonObject.add("Modules", (JsonElement)jsonObject2);
        Path path = this.ghsha(string);
        jsonObject.add("Metadata", (JsonElement)this.dht_9(path));
        try {
            if (!Files.exists(path, new LinkOption[0])) {
                Files.createFile(path, new FileAttribute[0]);
            }
            Files.writeString(path, (CharSequence)dhdj_2.toJson((JsonElement)jsonObject), new OpenOption[0]);
            this.rghs();
        }
        catch (IOException iOException) {
            System.err.printf("Failed to save config %s: %s%n", string, iOException.getMessage());
        }
    }

    public void rzs_4(String string) {
        Path path = this.ghsha(string);
        if (!Files.exists(path, new LinkOption[0])) {
            return;
        }
        this.jsb = string;
        this.rghs();
        try {
            JsonObject jsonObject = (JsonObject)dhdj_2.fromJson(Files.readString(path), JsonObject.class);
            if (!jsonObject.has("Modules")) {
                return;
            }
            JsonObject jsonObject2 = jsonObject.getAsJsonObject("Modules");
            jsonObject2.entrySet().forEach(this::thqn);
            Moondlc.getInstance().getNotificationManager().khdhz_2(qk.zhh_2, tr_2.ttq_3("configs.loaded"));
        }
        catch (IOException iOException) {
            System.err.printf("Failed to load config %s: %s%n", string, iOException.getMessage());
        }
    }

    public void dhbt(String string) {
        try {
            Files.deleteIfExists(this.ghsha(string));
        }
        catch (IOException iOException) {
            System.err.printf("Failed to remove config %s: %s%n", string, iOException.getMessage());
        }
    }

    public boolean ard(String string) {
        return Files.exists(this.ghsha(string), new LinkOption[0]);
    }

    public List dbh_2() {
        List list = this.ml();
        ArrayList<bjk> arrayList = new ArrayList<bjk>(list.size());
        for (String string : list) {
            arrayList.add(new bjk(string, this.ghsha(string)));
        }
        return arrayList;
    }

    public bjk dtth_3(String string, boolean bl) {
        if (!this.ard(string)) {
            return bl ? null : null;
        }
        return new bjk(string, this.ghsha(string));
    }

    public void dhtw_2() {
    }

    public bjk shh_2(String string) {
        return this.thsj(string, "", Collections.emptyList(), "");
    }

    public bjk khft_2(String string, List list) {
        return this.thsj(string, "", list, "");
    }

    public bjk thsj(String string, String string2, List list, String string3) {
        this.daw_3(string);
        this.bwr(string, string2, list, string3);
        return new bjk(string, this.ghsha(string));
    }

    public String zfy_2(String string) {
        Path path = this.ghsha(string);
        JsonObject jsonObject = this.shtf_2(path);
        if (jsonObject != null && jsonObject.has("description") && !jsonObject.get("description").isJsonNull()) {
            return jsonObject.get("description").getAsString();
        }
        return "";
    }

    public String bnth(String string) {
        Path path = this.ghsha(string);
        JsonObject jsonObject = this.shtf_2(path);
        if (jsonObject != null && jsonObject.has("imagePath") && !jsonObject.get("imagePath").isJsonNull()) {
            return jsonObject.get("imagePath").getAsString();
        }
        return "";
    }

    public List rzk_2(String string) {
        Path path = this.ghsha(string);
        JsonObject jsonObject = this.shtf_2(path);
        if (jsonObject != null && jsonObject.has("tags") && jsonObject.get("tags").isJsonArray()) {
            ArrayList arrayList = new ArrayList();
            jsonObject.getAsJsonArray("tags").forEach(arg_0 -> bhdh.shkj(arrayList, arg_0));
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return List.of("HvH", "Visuals");
    }

    public void dqa_2(String string, List list) {
        this.bwr(string, null, list, null);
    }

    public void bwr(String string, String string2, List list, String string3) {
        Path path = this.ghsha(string);
        if (!Files.exists(path, new LinkOption[0])) {
            return;
        }
        try {
            JsonObject jsonObject;
            JsonObject jsonObject2 = (JsonObject)dhdj_2.fromJson(Files.readString(path), JsonObject.class);
            if (jsonObject2 == null) {
                jsonObject2 = new JsonObject();
            }
            JsonObject jsonObject3 = jsonObject = jsonObject2.has("Metadata") && jsonObject2.get("Metadata").isJsonObject() ? jsonObject2.getAsJsonObject("Metadata") : new JsonObject();
            if (string2 != null) {
                jsonObject.addProperty("description", string2);
            }
            if (string3 != null) {
                jsonObject.addProperty("imagePath", string3);
            }
            if (list != null) {
                JsonArray jsonArray = new JsonArray();
                for (String string4 : list) {
                    jsonArray.add(string4);
                }
                jsonObject.add("tags", (JsonElement)jsonArray);
            }
            jsonObject2.add("Metadata", (JsonElement)jsonObject);
            Files.writeString(path, (CharSequence)dhdj_2.toJson((JsonElement)jsonObject2), new OpenOption[0]);
        }
        catch (Exception exception) {
            System.err.printf("Failed to set metadata for config %s: %s%n", string, exception.getMessage());
        }
    }

    public bjk tzq_4() {
        if (this.jsb == null || this.jsb.isBlank()) {
            return null;
        }
        Path path = this.ghsha(this.jsb);
        if (!Files.exists(path, new LinkOption[0])) {
            return null;
        }
        return new bjk(this.jsb, path);
    }

    public hj_2 dhjs(String string) {
        long l;
        Path path = this.ghsha(string);
        long l2 = l = this.shda(path, System.currentTimeMillis());
        long l3 = l;
        String string2 = "Singleplayer";
        String string3 = "singleplayer";
        boolean bl = true;
        String string4 = "";
        JsonObject jsonObject = this.shtf_2(path);
        if (jsonObject != null) {
            l2 = this.dgh_2(jsonObject, "createdAt", l2);
            l3 = this.dgh_2(jsonObject, "updatedAt", l3);
            string2 = this.dsz_2(jsonObject, "serverName", string2);
            string3 = this.dsz_2(jsonObject, "serverAddress", string3);
            bl = this.hhq(jsonObject, "singleplayer", bl);
            string4 = this.dsz_2(jsonObject, "serverIcon", string4);
        }
        return new hj_2(string, l2, l3, string2, string3, bl, string4);
    }

    public void rghs() {
        try {
            Files.writeString(this.dhlz.resolve("last_config.txt"), (CharSequence)this.jsb, new OpenOption[0]);
        }
        catch (IOException iOException) {
            System.err.printf("Failed to save last config name: %s%n", iOException.getMessage());
        }
    }

    public String ssz_7() {
        Path path = this.dhlz.resolve("last_config.txt");
        try {
            String string;
            if (Files.exists(path, new LinkOption[0]) && !(string = Files.readString(path).trim()).isEmpty() && this.ard(string)) {
                return string;
            }
        }
        catch (IOException iOException) {
            System.err.printf("Failed to read last config name: %s%n", iOException.getMessage());
        }
        return "default";
    }

    private JsonObject hghh(bsb bsb2) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("enabled", Boolean.valueOf(bsb2.rgha_2()));
        jsonObject.addProperty("bind", (Number)bsb2.zshsh_2());
        jsonObject.addProperty("bindMode", bsb2.shzr() ? "hold" : "toggle");
        JsonObject jsonObject2 = new JsonObject();
        bsb2.dty().forEach(arg_0 -> bhdh.thkd_2(jsonObject2, arg_0));
        jsonObject.add("settings", (JsonElement)jsonObject2);
        return jsonObject;
    }

    private void hdhz_2(bsb bsb2, JsonObject jsonObject) {
        if (jsonObject.has("bind")) {
            bsb2.zhs_5(jsonObject.get("bind").getAsInt());
        }
        if (jsonObject.has("bindMode")) {
            bsb2.thshdh("hold".equalsIgnoreCase(jsonObject.get("bindMode").getAsString()));
        } else {
            bsb2.thshdh(false);
        }
        if (jsonObject.has("settings")) {
            JsonObject jsonObject2 = jsonObject.getAsJsonObject("settings");
            bsb2.dty().forEach(arg_0 -> bhdh.jjs(jsonObject2, bsb2, arg_0));
        }
        if (jsonObject.has("enabled")) {
            bsb2.dhaq(jsonObject.get("enabled").getAsBoolean(), true);
        }
    }

    private bsb bbth(String string) {
        bsb bsb2 = this.tjq(string);
        if (bsb2 != null) {
            return bsb2;
        }
        return switch (string.toLowerCase(Locale.ROOT)) {
            case "shield braker" -> this.tjq("ShieldBreaker");
            case "ghost aura" -> this.tjq("Halo Hat");
            default -> null;
        };
    }

    private bsb tjq(String string) {
        return Moondlc.getInstance().getModuleManager().rdhs().stream().filter(arg_0 -> bhdh.khghh_2(string, arg_0)).findFirst().orElse(null);
    }

    private JsonObject dht_9(Path path) {
        JsonObject jsonObject;
        long l = System.currentTimeMillis();
        JsonObject jsonObject2 = this.shtf_2(path);
        if (jsonObject2 == null) {
            jsonObject2 = new JsonObject();
            jsonObject2.addProperty("createdAt", (Number)this.shda(path, l));
            jsonObject = this.dha_8();
            jsonObject2.addProperty("serverName", this.dsz_2(jsonObject, "serverName", "Singleplayer"));
            jsonObject2.addProperty("serverAddress", this.dsz_2(jsonObject, "serverAddress", "singleplayer"));
            jsonObject2.addProperty("singleplayer", Boolean.valueOf(this.hhq(jsonObject, "singleplayer", true)));
            jsonObject2.addProperty("serverIcon", this.dsz_2(jsonObject, "serverIcon", ""));
        } else if (!jsonObject2.has("createdAt")) {
            jsonObject2.addProperty("createdAt", (Number)this.shda(path, l));
        }
        if (!(jsonObject2.has("serverIcon") && !this.dsz_2(jsonObject2, "serverIcon", "").isBlank() || this.hhq(jsonObject = this.dha_8(), "singleplayer", true))) {
            jsonObject2.addProperty("serverIcon", this.dsz_2(jsonObject, "serverIcon", ""));
        }
        jsonObject2.addProperty("updatedAt", (Number)l);
        return jsonObject2;
    }

    private JsonObject dha_8() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("serverName", "Singleplayer");
        jsonObject.addProperty("serverAddress", "singleplayer");
        jsonObject.addProperty("singleplayer", Boolean.valueOf(true));
        class_310 class_3102 = class_310.method_1551();
        if (class_3102 != null && class_3102.method_1558() != null && !class_3102.method_1542()) {
            class_642 class_6422 = class_3102.method_1558();
            String string = class_6422.field_3761 == null || class_6422.field_3761.isBlank() ? "server" : class_6422.field_3761;
            String string2 = class_6422.field_3752 == null || class_6422.field_3752.isBlank() ? string : class_6422.field_3752;
            jsonObject.addProperty("serverName", string2);
            jsonObject.addProperty("serverAddress", string);
            jsonObject.addProperty("singleplayer", Boolean.valueOf(false));
            if (class_6422.method_49306() != null) {
                jsonObject.addProperty("serverIcon", Base64.getEncoder().encodeToString(class_6422.method_49306()));
            } else {
                jsonObject.addProperty("serverIcon", "");
            }
        }
        return jsonObject;
    }

    private JsonObject shtf_2(Path path) {
        try {
            if (!Files.exists(path, new LinkOption[0])) {
                return null;
            }
            JsonObject jsonObject = (JsonObject)dhdj_2.fromJson(Files.readString(path), JsonObject.class);
            if (jsonObject == null || !jsonObject.has("Metadata") || !jsonObject.get("Metadata").isJsonObject()) {
                return null;
            }
            return jsonObject.getAsJsonObject("Metadata");
        }
        catch (Exception exception) {
            return null;
        }
    }

    private long shda(Path path, long l) {
        try {
            if (!Files.exists(path, new LinkOption[0])) {
                return l;
            }
            return Files.getLastModifiedTime(path, new LinkOption[0]).toMillis();
        }
        catch (IOException iOException) {
            return l;
        }
    }

    private String dsz_2(JsonObject jsonObject, String string, String string2) {
        return jsonObject.has(string) && !jsonObject.get(string).isJsonNull() ? jsonObject.get(string).getAsString() : string2;
    }

    private long dgh_2(JsonObject jsonObject, String string, long l) {
        try {
            return jsonObject.has(string) && !jsonObject.get(string).isJsonNull() ? jsonObject.get(string).getAsLong() : l;
        }
        catch (Exception exception) {
            return l;
        }
    }

    private boolean hhq(JsonObject jsonObject, String string, boolean bl) {
        try {
            return jsonObject.has(string) && !jsonObject.get(string).isJsonNull() ? jsonObject.get(string).getAsBoolean() : bl;
        }
        catch (Exception exception) {
            return bl;
        }
    }

    @Generated
    public static bhdh khsb() {
        return rhk;
    }

    @Generated
    public String dhth_3() {
        return this.jsb;
    }

    @Generated
    public void jdkh_2(String string) {
        this.jsb = string;
    }

    private static boolean khghh_2(String string, bsb bsb2) {
        return bsb2.getName().equalsIgnoreCase(string);
    }

    private static void jjs(JsonObject jsonObject, bsb bsb2, bdhw bdhw2) {
        if (jsonObject.has(bdhw2.getName())) {
            try {
                bdhw2.ha(jsonObject.get(bdhw2.getName()));
            }
            catch (Exception exception) {
                System.err.printf("Failed to deserialize setting %s for module %s: %s%n", bdhw2.getName(), bsb2.getName(), exception.getMessage());
            }
        }
    }

    private static void thkd_2(JsonObject jsonObject, bdhw bdhw2) {
        JsonElement jsonElement = bdhw2.tdkh();
        if (jsonElement != null) {
            jsonObject.add(bdhw2.getName(), jsonElement);
        }
    }

    private static void shkj(List list, JsonElement jsonElement) {
        list.add(jsonElement.getAsString());
    }

    private void thqn(Map.Entry entry) {
        bsb bsb2 = this.bbth((String)entry.getKey());
        if (bsb2 == null) {
            System.err.println("Module not found for config: " + (String)entry.getKey());
        } else {
            this.hdhz_2(bsb2, ((JsonElement)entry.getValue()).getAsJsonObject());
        }
    }

    private static String dhbgh(File file) {
        return file.getName().replace(".moon", "");
    }

    private static boolean sha_2(File file, String string) {
        return string.endsWith(".moon");
    }

    private static String[] vb9t3mcl8v(String string) {
        return string.split("\u0004\u0015", -1);
    }

    private static CallSite trl5xbidbd384(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ li62ka6l6w ^ string.hashCode()) + (n2 + aym3edl9hwtc) + i ^ li62ka6l6w, 16) + aym3edl9hwtc);
            }
            String[] stringArray = bhdh.vb9t3mcl8v(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

