/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import us.m0vy.moondlc.m0vyguard.tdhs_2;
import us.m0vy.moondlc.m0vyguard.hl_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class az_2 {
    private static final az_2 INSTANCE;
    private static final HttpClient khkhm;
    private final Map jlk = new ConcurrentHashMap();
    private volatile tdhs_2 sshs_2 = null;
    private volatile String bghh_2 = "";
    private volatile boolean dhdw_2 = false;
    private static final int thtw_2 = 913641759;
    private static final int dhyq = -2134892896;
    private static final int bdhkh = -812273174;
    private static final int rfy = -1997780463;
    private static final int wz51gvhw7e = -401637410;
    private static final int jfqim17g = 1858201653;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int td8l0s3ltjf;

    public static az_2 sngh_2() {
        block0: {
            int n = -761933603;
            int n2 = (n = Integer.rotateLeft(n * -1220862019, 25) ^ 0xD350C4BE) ^ 0xC2B2A2D2;
            if ((n2 ^ n) == -1028480302) break block0;
            int cfr_ignored_0 = (0x1027720F ^ n) + 718198065;
        }
        return INSTANCE;
    }

    private az_2() {
    }

    public tdhs_2 shds_3() {
        block0: {
            int n = 114612027;
            n = Integer.rotateLeft(n * -1663464049, 6) ^ 0x47CEB7FF;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x78AAA0CE;
            if ((n2 ^ n) == 2024448206) break block0;
            int cfr_ignored_0 = (0x7E7E77F5 ^ n) + 367134010;
        }
        return this.sshs_2;
    }

    public boolean tab_2() {
        block0: {
            int n = 1147969687;
            n = Integer.rotateLeft(n * 1794754875, 19) ^ 0xFA85F141;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x3599209B;
            if ((n2 ^ n) == 899227803) break block0;
            int cfr_ignored_0 = (0x71F5800C ^ n) + -59719106;
        }
        return this.dhdw_2;
    }

    public void khnd(String string, String string2, long l) {
        if (string == null || string.trim().isEmpty()) {
            this.sshs_2 = null;
            this.bghh_2 = "";
            return;
        }
        String[] stringArray = az_2.tra(string2, string);
        String string3 = stringArray[0];
        String string4 = stringArray[1];
        String string5 = ((String)(string3.isEmpty() ? string4 : string3 + " - " + string4)).toLowerCase();
        if (string5.equals(this.bghh_2) && this.sshs_2 != null) {
            return;
        }
        this.bghh_2 = string5;
        tdhs_2 tdhs2 = (tdhs_2)this.jlk.get(string5);
        if (tdhs2 != null) {
            this.sshs_2 = tdhs2;
            return;
        }
        this.sshs_2 = tdhs_2.tshn(string5, string4, string3, l);
        this.dhdw_2 = true;
        ((CompletableFuture)CompletableFuture.supplyAsync(() -> this.tsd_8(string5, string4, string3, string, l)).thenAccept(arg_0 -> this.asgh_2(string5, arg_0))).exceptionally(this::dash);
    }

    private tdhs_2 shkhf(String string, String string2, String string3, String string4, long l) {
        int n = hl_2.jat_4(-1570730295);
        n = System.identityHashCode(this) ^ n;
        String string5 = string;
        n = Integer.rotateRight((string5 != null ? System.identityHashCode(string5) : 0) ^ n, 12);
        int n2 = n ^ 0x5AF8A9E8;
        if ((n2 ^ n) != 1526245864) {
            int cfr_ignored_0 = Integer.rotateLeft(0xF8982721 ^ n, 18) + 516578362;
            int cfr_ignored_1 = (int)(0x3A2A891C27D4EB4FL ^ (long)n ^ 0xEF48831A2DB9D984L);
        }
        if (!az_2.jldh()) {
            yf.athz_2();
            throw null;
        }
        tdhs_2 tdhs2 = this.zqd_3(string, string2, string3, string4, l);
        if (tdhs2 != null && tdhs2.dthl()) {
            return tdhs2;
        }
        tdhs_2 tdhs3 = this.jskh_2(string, string2, string3, l);
        if (tdhs3 != null && tdhs3.dthl()) {
            return tdhs3;
        }
        return null;
    }

    private tdhs_2 zqd_3(String string, String string2, String string3, String string4, long l) {
        try {
            Object object;
            String string5;
            Object object2;
            int n = 1781299314;
            n = Integer.rotateLeft(n * 1573566381, 18) ^ 0xAB5581EE;
            String string6 = string;
            n = (string6 != null ? System.identityHashCode(string6) : 0) ^ n;
            String string7 = string2;
            n = (string7 != null ? System.identityHashCode(string7) : 0) ^ n;
            int n2 = n ^ 0x19A467B7;
            if ((n2 ^ n) != 430204855) {
                int cfr_ignored_0 = (0x73881FC5 ^ n) + 1831101729;
            }
            if (yf.dnkh()) {
                throw null;
            }
            long l2 = l > 0L ? l / (0x75CD1A59705094C7L ^ 0x75CD1A597050972FL) : 0L;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            if (!string3.isEmpty() && !az_2.jbw(string2)) {
                arrayList.add(string3 + " " + string2);
            }
            if (!string2.isEmpty()) {
                arrayList.add(string2);
                object2 = string2.replaceAll("\\([^)]*\\)", "").trim();
                if (!((String)object2).isEmpty() && !((String)object2).equalsIgnoreCase(string2)) {
                    arrayList.add(!az_2.zaa_6(string3) ? string3 + " " + (String)object2 : object2);
                }
            }
            if (string4 != null && !az_2.khhz_2(string4) && !string4.equalsIgnoreCase(string2)) {
                arrayList.add(az_2.tba_4(string4));
            }
            object2 = arrayList.iterator();
            while (object2.hasNext()) {
                tdhs_2 tdhs2;
                String string8;
                string5 = (String)object2.next();
                if (string5.isBlank() || (string8 = this.tss_4((String)(object = "https://lrclib.net/api/search?q=" + this.tydh_2(string5)))) == null || (tdhs2 = az_2.dwh_2(this, string, string2, string3, l, string8)) == null || !az_2.dqdh(tdhs2)) continue;
                return tdhs2;
            }
            if (!string2.isEmpty() && (string5 = this.tss_4((String)(object2 = "https://lrclib.net/api/search?track_name=" + az_2.zdk_3(this, string2) + (String)(string3.isEmpty() ? "" : "&artist_name=" + this.tydh_2(string3))))) != null && (object = this.thrz_2(string, string2, string3, l, string5)) != null && az_2.thwn((tdhs_2)object)) {
                return object;
            }
            if (!string3.isEmpty() && !string2.isEmpty() && l2 > 0L && (string5 = this.tss_4((String)(object2 = "https://lrclib.net/api/get?artist_name=" + this.tydh_2(string3) + "&track_name=" + az_2.jjr(this, string2) + "&duration=" + l2))) != null && (object = az_2.dssh_3(this, string, string2, string3, l, string5)) != null && az_2.rjs((tdhs_2)object)) {
                return object;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    private tdhs_2 jskh_2(String string, String string2, String string3, long l) {
        try {
            String string4;
            JsonObject jsonObject;
            String string5;
            String string6;
            String string7;
            int n = -1532228462;
            n = Integer.rotateLeft(n * -1686530415, 5) ^ 0x70B26913;
            String string8 = string2;
            n = (string8 != null ? System.identityHashCode(string8) : 0) ^ n;
            n = (int)l ^ n;
            int n2 = n ^ 0xD8859B7C;
            if ((n2 ^ n) != -662332548) {
                int cfr_ignored_0 = (0x7C2997EE ^ n) + 550582357;
            }
            if ((string7 = this.tss_4(string6 = "https://music.163.com/api/search/get/web?csrf_token=null&type=1&offset=0&total=true&limit=3&s=" + az_2.zzsh_3(this, string5 = (String)(!string3.isEmpty() ? string3 + " " : "") + string2))) == null || string7.isEmpty()) {
                return null;
            }
            JsonObject jsonObject2 = JsonParser.parseString((String)string7).getAsJsonObject();
            if (!jsonObject2.has("result") || az_2.jra(jsonObject2.get("result"))) {
                return null;
            }
            JsonObject jsonObject3 = az_2.shla_2(jsonObject2, "result");
            if (!az_2.ahs_4(jsonObject3, "songs") || !jsonObject3.get(az_2.rbz("থ鈼䙺磶⯄", Integer.rotateLeft(0x526E484F ^ 0xF1137F12, 7), az_2.rldh(0x9218F299 ^ 0x7421C816, 22), Integer.rotateLeft(0x6112D802 ^ 0x6C19ED99, 4))).isJsonArray()) {
                return null;
            }
            JsonArray jsonArray = jsonObject3.getAsJsonArray("songs");
            if (jsonArray.isEmpty()) {
                return null;
            }
            long l2 = az_2.ahn_2(az_2.khds_2(jsonArray.get(0)), "id").getAsLong();
            if (l2 <= 0L) {
                return null;
            }
            String string9 = "https://music.163.com/api/song/lyric?os=pc&id=" + l2 + "&lv=-1&kv=-1&tv=-1";
            String string10 = this.tss_4(string9);
            if (string10 == null || string10.isEmpty()) {
                return null;
            }
            JsonObject jsonObject4 = JsonParser.parseString((String)string10).getAsJsonObject();
            if (az_2.bbq(jsonObject4, "lrc") && !az_2.dsz(jsonObject4.get("lrc")) && (jsonObject = az_2.syth(jsonObject4, "lrc")).has("lyric") && !jsonObject.get("lyric").isJsonNull() && (string4 = az_2.zza_7(az_2.bjs_2(jsonObject, "lyric"))) != null && !string4.trim().isEmpty() && az_2.khhw_2(string4, az_2.khkw("鍔", 440932227 - -256702738, az_2.szt_7(0xC4C7520A ^ 0x6A4E0197, 17), 1137405843 - 1930958307))) {
                return tdhs_2.zdz(string, string2, string3, l, string4);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    private tdhs_2 thshz_2(String string, String string2, String string3, long l, String string4) {
        try {
            String string5;
            try {
                int n = -1096048753;
                n = Integer.rotateLeft(n * -18089067, 18) ^ 0xEB689DE7;
                String string6 = string;
                n = Integer.rotateRight((string6 != null ? System.identityHashCode(string6) : 0) ^ n, 9);
                String string7 = string3;
                n = (string7 != null ? System.identityHashCode(string7) : 0) ^ n;
                int n2 = n ^ 0x528AFB34;
                if ((n2 ^ n) != 1384839988) {
                    int cfr_ignored_0 = (0xEC2164BB ^ n) - -1665059348;
                }
                if ((0x3B9 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            JsonObject jsonObject = JsonParser.parseString((String)string4).getAsJsonObject();
            if (jsonObject.has("synce".concat("dLyrics")) && !jsonObject.get("synced".concat("Lyrics")).isJsonNull() && (string5 = jsonObject.get("syncedL".concat("yrics")).getAsString()) != null && !string5.trim().isEmpty()) {
                return tdhs_2.zdz(string, string2, string3, l, string5);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    private tdhs_2 thrz_2(String string, String string2, String string3, long l, String string4) {
        try {
            JsonElement jsonElement;
            int n = 1135539072;
            n = Integer.rotateLeft(n * 1577408533, 28) ^ 0x50DCCB66;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 3);
            String string5 = string;
            n = Integer.rotateLeft((string5 != null ? System.identityHashCode(string5) : 0) ^ n, 13);
            int n2 = n ^ 0xD94F79C;
            if ((n2 ^ n) != 227866524) {
                int cfr_ignored_0 = (0x4E3A041C ^ n) - 1152875748;
            }
            if ((jsonElement = JsonParser.parseString((String)string4)).isJsonArray()) {
                JsonArray jsonArray = jsonElement.getAsJsonArray();
                for (JsonElement jsonElement2 : jsonArray) {
                    String string6;
                    JsonObject jsonObject;
                    if (!jsonElement2.isJsonObject() || !(jsonObject = jsonElement2.getAsJsonObject()).has("syncedL".concat("yrics")) || jsonObject.get("syncedL".concat("yrics")).isJsonNull() || (string6 = jsonObject.get("syncedLyrics").getAsString()) == null || string6.trim().isEmpty()) continue;
                    return tdhs_2.zdz(string, string2, string3, l, string6);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    private String tss_4(String string) {
        try {
            HttpRequest httpRequest;
            HttpResponse<String> httpResponse;
            int n = 34556457;
            n = Integer.rotateLeft(n * -462433873, 17) ^ 0x33BBBFBD;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 15);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 14);
            int n2 = n ^ 0xA9EA7B2A;
            if ((n2 ^ n) != -1444250838) {
                int cfr_ignored_0 = (0xABE53103 ^ n) + 1530344300;
            }
            if ((httpResponse = khkhm.send(httpRequest = HttpRequest.newBuilder().uri(URI.create(string)).header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x6".concat("4) AppleWebKit/537.36 (KHTML, like Ge").concat("cko) Chrome/120.0.0.0 Safari/537.36")).header("Accept", "application/jso".concat("n, text/plain, */*")).timeout(Duration.ofSeconds(0x5E3F2194D225478FL ^ 0x5E3F2194D225478BL)).GET().build(), HttpResponse.BodyHandlers.ofString())).statusCode() == 1505628885 + -1505628685) {
                return httpResponse.body();
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    private String tydh_2(String string) {
        block0: {
            int n = 254648899;
            n = Integer.rotateLeft(n * -1741420149, 16) ^ 0x4D951CA3;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 10);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xCEEEEF03;
            if ((n2 ^ n) == -823202045) break block0;
            int cfr_ignored_0 = (0xC1C34D40 ^ n) - -1275487523;
        }
        return URLEncoder.encode(string, StandardCharsets.UTF_8);
    }

    public static String[] tra(String string, String string2) {
        String[] stringArray;
        int n = -1398172031;
        n = Integer.rotateLeft(n * 1452655833, 27) ^ 0x6845D99B;
        String string3 = string;
        n = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 4);
        int n2 = n ^ 0xE2BF5207;
        if ((n2 ^ n) != -490778105) {
            int cfr_ignored_0 = (0x4E16C486 ^ n) - 1406218638;
        }
        String string4 = string != null ? string.trim() : "";
        String string5 = string2 != null ? string2.trim() : "";
        string5 = string5.replaceAll("[\u2013\u2014\u2015\u2212\u30fc]", "-");
        string4 = string4.replaceAll("[\u2013\u2014\u2015\u2212\u30fc]", "-");
        string5 = string5.replaceAll("(?i)\\s*\\|\\s*(Stream|Listen).*SoundCloud.*$", "");
        string5 = string5.replaceAll("(?i)\\s*on\\s+SoundCloud.*$", "");
        string5 = string5.replaceAll("(?i)^Stre".concat("am\\s+"), "");
        string5 = string5.replaceAll("(?i)^Listen".concat("\\s+to\\s+"), "");
        string5 = string5.replaceAll("(?i)^Free\\s+DL\\s*[:\\-]?\\s*", "");
        if (string4.matches("(?i)^(SoundCloud|Google Chrome.*|Microsoft Edg".concat("e|Brave|Firefox|Opera.*|Vivaldi|Arc|Chrome.*)$"))) {
            string4 = "";
        }
        if (string5.matches("(?i).+\\".concat("s+by\\s+.+"))) {
            int n3 = string5.toLowerCase().lastIndexOf(" by ");
            String string6 = string5.substring(0, n3).trim();
            String string7 = string5.substring(n3 + 4).trim();
            if (!string6.isEmpty() && !string7.isEmpty()) {
                string5 = string6;
                if (string4.isEmpty()) {
                    string4 = string7;
                }
            }
        }
        if (string5.contains(" - ") && (stringArray = string5.split("\\s*-\\s*", 2)).length == 2) {
            if (string4.isEmpty()) {
                string4 = stringArray[0].trim();
            }
            string5 = stringArray[1].trim();
        }
        string5 = az_2.tba_4(string5);
        string4 = az_2.tba_4(string4);
        return new String[]{string4, string5};
    }

    private static String tba_4(String string) {
        String string2 = null;
        int n = 0;
        int n2 = -398382154;
        n2 = Integer.rotateLeft(n2 * 461066175, 27) ^ 0x2A91F3F3;
        String string3 = string;
        n2 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n2, 25);
        int n3 = (n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853;
        while (true) {
            block30: {
                block43: {
                    block28: {
                        block33: {
                            block46: {
                                block32: {
                                    block44: {
                                        block27: {
                                            block45: {
                                                block39: {
                                                    block40: {
                                                        block38: {
                                                            block29: {
                                                                block35: {
                                                                    block41: {
                                                                        block34: {
                                                                            block42: {
                                                                                block36: {
                                                                                    block37: {
                                                                                        block25: {
                                                                                            block31: {
                                                                                                block26: {
                                                                                                    if ((n = n3 - -1923354853 ^ 0x8D5BEF1B ^ n2) > 1032266899) break block25;
                                                                                                    if (n > -535106209) break block26;
                                                                                                    if (n == -1557098260) break block27;
                                                                                                    if (n == -1534930434) break block28;
                                                                                                    int cfr_ignored_0 = Integer.rotateRight(0xAEE3B2C3 ^ n2, 8) + 837829848;
                                                                                                    if (n == -535106209) break block29;
                                                                                                    break block30;
                                                                                                }
                                                                                                if (n > 182164367) break block31;
                                                                                                if (n == -79939940) break block32;
                                                                                                if (n == 182164367) break block33;
                                                                                                int cfr_ignored_1 = (Integer.rotateRight(0xBBD80EF6 ^ n2, 10) - -1014534395) * -1143468297;
                                                                                                break block30;
                                                                                            }
                                                                                            if (n == 736149509) break block34;
                                                                                            if (n == 1032266899) break block35;
                                                                                            int cfr_ignored_2 = Integer.rotateRight(0x4E51F7EA ^ n2, 12) + -2142591855;
                                                                                            break block30;
                                                                                        }
                                                                                        if (n > 1293972479) break block36;
                                                                                        if (n > 1179437032) break block37;
                                                                                        if (n == 1087479986) break block38;
                                                                                        if (n == 1179437032) break block39;
                                                                                        int cfr_ignored_3 = Integer.rotateRight(0x8491F482 ^ n2, 3) + 302660345;
                                                                                        break block30;
                                                                                    }
                                                                                    if (n == 1205795918) break block40;
                                                                                    if (n == 1293972479) break block41;
                                                                                    int cfr_ignored_4 = (Integer.rotateLeft(0xAFD8CB5D ^ n2, 8) - 1335771006) * -1344746659;
                                                                                    int cfr_ignored_5 = (int)(0x6D6A656027D4EB4FL ^ (long)n2 ^ 0x37B0831A2DB97705L);
                                                                                    break block30;
                                                                                }
                                                                                if (n > 1610287625) break block42;
                                                                                if (n == 1326106002) break block43;
                                                                                if (n == 1610287625) break block44;
                                                                                break block30;
                                                                            }
                                                                            if (n == 2122163578) break block45;
                                                                            if (n == 2128803746) break block46;
                                                                            break block30;
                                                                        }
                                                                        int cfr_ignored_6 = Integer.rotateRight(0xD0AB1EA6 ^ n2, 13) - 1226200405;
                                                                        string2 = "";
                                                                        try {
                                                                            n += 3;
                                                                            if ((0x8707E97DEAA53E2DL ^ (long)n2 | 1L) == 0L) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            n3 = (n2 ^ 0x4F0AC592 ^ 0x8D5BEF1B) + -1923354853 ^ 0x8FEF1DB0 ^ 0x8FEF1DB0;
                                                                        }
                                                                        catch (IllegalStateException illegalStateException) {
                                                                            n3 = (int)((long)((n2 ^ 0x4F0AC592 ^ 0x8D5BEF1B) + -1923354853) ^ 0xC38B1EF224B929EBL ^ 0xC38B1EF224B929EBL);
                                                                        }
                                                                        n += 2;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_7 = (Integer.rotateRight(0xC8DD485A ^ n2, 12) + 1462329889) * -925022117;
                                                                    String string4 = string;
                                                                    string4 = string4.replaceAll("(?i)\\s*[\\[\\(](feat|ft)\\.?\\s+[^\\]\\)]+[\\]\\)]", "");
                                                                    string4 = string4.replaceAll("(?i)\\s*[\\[\\(](official\\s+)?(music\\s+)?(video|audio|lyrics?|lyric\\s+video|visualizer|hd|4k|extended|clip|stream|free\\s+download|free\\s+dl|hq|out\\s+now|full\\s+song|visuals)[\\]\\)]", "");
                                                                    string4 = string4.replaceAll("(?i)\\s*\\(prod".concat("\\.?\\s+[^\\)]+\\)"), "");
                                                                    string4 = string4.replaceAll("(?i)\\s*\\[(".concat("prod|prod\\.?\\").concat("s+by)[^\\]]+\\]"), "");
                                                                    string4 = string4.replaceAll("(?i)\\s*[\\[\\(][^\\]\\)]*remaster[^\\]\\)]*[\\]\\)]", "");
                                                                    string4 = string4.replaceAll("(?i)\\s*-\\s*re".concat("master(ed)?.*$"), "");
                                                                    string4 = string4.replaceAll("(?i)\\s*-\\s*o".concat("fficial.*$"), "");
                                                                    string4 = string4.replaceAll("(?i)\\s*\\[[^\\]]*\\]", "");
                                                                    string4 = string4.replaceAll("(?i)\\s*\u3010[^\u3011]*\u3011", "");
                                                                    string4 = string4.replaceAll("(?i)\\s".concat("*\u300c[^\u300d]*\u300d"), "");
                                                                    string4 = string4.replaceAll("^[\"']+|[\"']+$", "");
                                                                    string2 = string4.trim();
                                                                    if (!hl_2.sthq(n2, 8736682)) {
                                                                        int cfr_ignored_8 = (Integer.rotateLeft(0x4F8F8A38 ^ n2, 12) + -1497408509) * 1334807097;
                                                                    }
                                                                    n3 = (n2 ^ 0x4F0AC592 ^ 0x8D5BEF1B) + -1923354853 ^ 0x645BE8B3 ^ 0x645BE8B3;
                                                                    n += 2;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_9 = (Integer.rotateRight(0x5D8CF676 ^ n2, 14) - 1483700101) * 1569519223;
                                                                if (string == null) {
                                                                    if (hl_2.sthq(n2, -10896839)) {
                                                                        int cfr_ignored_10 = (Integer.rotateLeft(0xD4B97A3C ^ n2, 13) - -959222657) * -726042051;
                                                                    }
                                                                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x2BE0C005 ^ 0x8D5BEF1B) + -1923354853));
                                                                    --n;
                                                                    continue;
                                                                }
                                                                if (!hl_2.sthq(n2, -230697271)) {
                                                                    int cfr_ignored_11 = (Integer.rotateRight(0xBF1FA536 ^ n2, 10) - 691183813) * -1088445129;
                                                                }
                                                                n3 = (int)((long)((n2 ^ 0x4D2073FF ^ 0x8D5BEF1B) + -1923354853) ^ 0xD592F13F229AAE25L ^ 0xD592F13F229AAE25L);
                                                                continue;
                                                            }
                                                            int cfr_ignored_12 = Integer.rotateLeft(0x53132BEC ^ n2, 13) - 330297551;
                                                            if (hl_2.sthq(n2, 487897725)) {
                                                                int cfr_ignored_13 = Integer.rotateRight(0x20939EEE ^ n2, 7) - -163717619;
                                                            }
                                                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853));
                                                            continue;
                                                        }
                                                        int cfr_ignored_14 = Integer.rotateLeft(0x5C016E09 ^ n2, 14) + 680129106;
                                                        int cfr_ignored_15 = (int)(0x9EB3C03427D4EB4FL ^ (long)n2 ^ 0x7D18831A2DB890B6L);
                                                        if (!hl_2.sthq(n2, 1023756638)) {
                                                            int cfr_ignored_16 = Integer.rotateLeft(0x826DCD ^ n2, 3) - 338225934;
                                                            int cfr_ignored_17 = (int)(0xC230C3F027D4EB4FL ^ (long)n2 ^ 0x7A90831A2DB829B0L);
                                                        }
                                                        n3 = (int)((long)((n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853) ^ 0x58F54638A4995B26L ^ 0x58F54638A4995B26L);
                                                        n += 3;
                                                        continue;
                                                    }
                                                    int cfr_ignored_18 = Integer.rotateLeft(0xCAB03721 ^ n2, 12) + -1884009414;
                                                    int cfr_ignored_19 = (int)(0x802991C27D4EB4FL ^ (long)n2 ^ 0xCF48831A2DB9BDD4L);
                                                    n3 = (int)((long)((n2 ^ 0x8F72354F ^ 0x8D5BEF1B) + -1923354853) ^ 0x46DC0FFE3E5F0EBEL ^ 0x46DC0FFE3E5F0EBEL);
                                                    int cfr_ignored_20 = Integer.rotateRight(0x4442A27 ^ n2, 3) - -2002863628;
                                                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853));
                                                    int cfr_ignored_21 = Integer.rotateLeft(0x91975F21 ^ n2, 5) + -1515051974;
                                                    int cfr_ignored_22 = (int)(0x5325F11C27D4EB4FL ^ (long)n2 ^ 0x1F48831A2DB90B9AL);
                                                    n += 5;
                                                    continue;
                                                }
                                                int cfr_ignored_23 = Integer.rotateLeft(0x4B957321 ^ n2, 12) + 729190458;
                                                int cfr_ignored_24 = (int)(0x8927DD1C27D4EB4FL ^ (long)n2 ^ 0x4748831A2DB8BF9EL);
                                                try {
                                                    n -= 4;
                                                    if ((0xCFA1058AB5329B3DL ^ (long)n2 | 1L) == 0L) {
                                                        throw new IllegalStateException();
                                                    }
                                                    n3 = (int)((long)((n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853) ^ 0xFF7E8A760377645FL ^ 0xFF7E8A760377645FL);
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    n3 = (n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853 + 215808012 - 215808012;
                                                }
                                                n -= 5;
                                                continue;
                                            }
                                            int cfr_ignored_25 = (Integer.rotateRight(0x146448DA ^ n2, 5) + 2088923553) * 342116571;
                                            try {
                                                n -= 3;
                                                if ((0xD3042D746CC6114BL ^ (long)n2 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                n3 = (n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853 + -1522526685 - -1522526685;
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                n3 = (n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853;
                                            }
                                            n += 3;
                                            continue;
                                        }
                                        int cfr_ignored_26 = (Integer.rotateLeft(0x4A79D5B8 ^ n2, 12) + 152993923) * 1249498553;
                                        n3 = (int)((long)((n2 ^ 0x24A666F3 ^ 0x8D5BEF1B) + -1923354853) ^ 0xCD73B89F14D2D405L ^ 0xCD73B89F14D2D405L);
                                        int cfr_ignored_27 = (Integer.rotateLeft(0x4CB47990 ^ n2, 12) + 1312315307) * 1286896017;
                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853));
                                        int cfr_ignored_28 = Integer.rotateLeft(0x1584E628 ^ n2, 5) + -1619689965;
                                        n += 2;
                                        continue;
                                    }
                                    int cfr_ignored_29 = (Integer.rotateLeft(0x4F48519 ^ n2, 3) + -1644577470) * 83133721;
                                    int cfr_ignored_30 = (int)(0xC6462B2427D4EB4FL ^ (long)n2 ^ 0xAB38831A2DB8215DL);
                                    n3 = (int)((long)((n2 ^ 0x92C159B4 ^ 0x8D5BEF1B) + -1923354853) ^ 0x19F133607DF402DCL ^ 0x19F133607DF402DCL);
                                    int cfr_ignored_31 = (Integer.rotateLeft(0xA69D4795 ^ n2, 7) - 828983878) * -1499641963;
                                    int cfr_ignored_32 = (int)(0x642FE9A827D4EB4FL ^ (long)n2 ^ 0x2E20831A2DB9658EL);
                                    try {
                                        n3 = (n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853 ^ 0x1B0E9E01 ^ 0x1B0E9E01;
                                    }
                                    catch (ArithmeticException arithmeticException) {
                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853));
                                    }
                                    continue;
                                }
                                int cfr_ignored_33 = Integer.rotateRight(0x54F06C83 ^ n2, 13) + 1299890968;
                                n3 = (n2 ^ 0xDB901BFF ^ 0x8D5BEF1B) + -1923354853 + 386651186 - 386651186;
                                int cfr_ignored_34 = (Integer.rotateRight(0xA704F9DA ^ n2, 7) + 1039655073) * -1492846117;
                                int cfr_ignored_35 = (int)(0xE7E2B63646C2B093L ^ (long)n2 ^ 0x911C41369A006214L);
                                n3 = (n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853 ^ 0xCCA3B3CF ^ 0xCCA3B3CF;
                                n -= 4;
                                continue;
                            }
                            int cfr_ignored_36 = (Integer.rotateLeft(0x8476773C ^ n2, 3) - 246812543) * -2072611011;
                            n3 = (int)((long)((n2 ^ 0xE31B6CBF ^ 0x8D5BEF1B) + -1923354853) ^ 0x70863171E727B06AL ^ 0x70863171E727B06AL);
                            int cfr_ignored_37 = (Integer.rotateRight(0x38A98B1A ^ n2, 10) + -521832607) * 950635291;
                            try {
                                n -= 3;
                                if ((0x1B82976FFE53CC77L ^ (long)n2 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                n3 = (n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853 + 1219004767 - 1219004767;
                            }
                            catch (IllegalStateException illegalStateException) {
                                n3 = (int)((long)((n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853) ^ 0xDD92E96938AEE8F1L ^ 0xDD92E96938AEE8F1L);
                            }
                            n += 5;
                            continue;
                        }
                        int cfr_ignored_38 = Integer.rotateLeft(0x38C109CD ^ n2, 10) - -474099954;
                        int cfr_ignored_39 = (int)(0xFA73A7F027D4EB4FL ^ (long)n2 ^ 0xB290831A2DB85936L);
                        try {
                            if ((0x397D23FEBDBCA67BL ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n3 = (n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853 ^ 0xB8A136C9 ^ 0xB8A136C9;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853));
                        }
                        n -= 5;
                        continue;
                    }
                    int cfr_ignored_40 = (Integer.rotateLeft(0xBBECA6D9 ^ n2, 10) + -972696702) * -1142118695;
                    int cfr_ignored_41 = (int)(0x795E08E427D4EB4FL ^ (long)n2 ^ 0xECB8831A2DB95F6DL);
                    n3 = (n2 ^ 0x536D77DD ^ 0x8D5BEF1B) + -1923354853;
                    int cfr_ignored_42 = (Integer.rotateLeft(0x6533DCD0 ^ n2, 15) + 1168465003) * 1697897681;
                    if (!hl_2.sthq(n2, 1086837468)) {
                        int cfr_ignored_43 = Integer.rotateRight(0x7D40F64F ^ n2, 18) - 792425164;
                    }
                    n3 = (int)((long)((n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853) ^ 0xCF0DFA0FDE721243L ^ 0xCF0DFA0FDE721243L);
                    n -= 4;
                    continue;
                }
                return string2;
            }
            int cfr_ignored_44 = Integer.rotateRight(0xE5CEED23 ^ n2, 15) + -663988616;
            n3 = (n2 ^ 0x3D872493 ^ 0x8D5BEF1B) + -1923354853;
        }
    }

    private Void dash(Throwable throwable) {
        this.dhdw_2 = false;
        return null;
    }

    private void asgh_2(String string, tdhs_2 tdhs2) {
        if (tdhs2 != null && tdhs2.dthl()) {
            this.jlk.put(string, tdhs2);
            if (string.equals(this.bghh_2)) {
                this.sshs_2 = tdhs2;
            }
        }
        this.dhdw_2 = false;
    }

    private tdhs_2 tsd_8(String string, String string2, String string3, String string4, long l) {
        return this.shkhf(string, string2, string3, string4, l);
    }

    private static String ghjn(String string, int n, int n2, int n3) {
        int n4 = -1065745572;
        int n5 = (n4 = Integer.rotateLeft(n4 * -297507397, 23) ^ 0x9566844A) ^ 0x24FC311C;
        if ((n5 ^ n4) != 620507420) {
            int cfr_ignored_0 = (0xE4863240 ^ n4) + 1169155848;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x9E4D4160) + n2 ^ i * -1592143579) ^ thtw_2) + dhyq);
        }
        return new String(cArray);
    }

    private static boolean jldh() {
        block0: {
            int n = -1812226593;
            int n2 = (n = Integer.rotateLeft(n * -929150239, 12) ^ 0xC2BAE28F) ^ 0xC2173FBE;
            if ((n2 ^ n) == -1038663746) break block0;
            int cfr_ignored_0 = (0x51ECA261 ^ n) + 79026669;
        }
        return yf.khdha_2();
    }

    private static boolean jbw(String string) {
        block0: {
            int n = -2147114382;
            n = Integer.rotateLeft(n * 1971854629, 3) ^ 0x5AE3F16F;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x9DF5BCD;
            if ((n2 ^ n) == 165632973) break block0;
            int cfr_ignored_0 = (0x89DAF9BF ^ n) - -1706393551;
        }
        return string.isEmpty();
    }

    private static String dhmt(String string, int n, int n2, int n3) {
        block0: {
            int n4 = hl_2.jat_4(-576041581);
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 25);
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 4)) ^ 0x81E64441;
            if ((n5 ^ n4) == -2115615679) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x5C4C09D2 ^ n4, 14) + 831705001) * 1548487123;
        }
        return az_2.ghjn(string, n, n2, n3);
    }

    private static boolean zaa_6(String string) {
        block0: {
            int n = -1971893184;
            n = Integer.rotateLeft(n * -1823995907, 16) ^ 0xE9A3EDF0;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xDD5F5A58;
            if ((n2 ^ n) == -580953512) break block0;
            int cfr_ignored_0 = (0x57281618 ^ n) + 40939092;
        }
        return string.isEmpty();
    }

    private static boolean khhz_2(String string) {
        block0: {
            int n = 1863736443;
            int n2 = (n = Integer.rotateLeft(n * 1383785955, 21) ^ 0xA1AB2C21) ^ 0x9AE5C58;
            if ((n2 ^ n) == 162421848) break block0;
            int cfr_ignored_0 = (0x66B80023 ^ n) - 720167420;
        }
        return string.isBlank();
    }

    private static tdhs_2 dwh_2(az_2 az2_2, String string, String string2, String string3, long l, String string4) {
        block0: {
            int n = hl_2.jat_4(-368233455);
            az_2 az3 = az2_2;
            n = Integer.rotateLeft((az3 != null ? System.identityHashCode(az3) : 0) ^ n, 6);
            String string5 = string3;
            n = Integer.rotateLeft((string5 != null ? System.identityHashCode(string5) : 0) ^ n, 19);
            int n2 = n ^ 0x204A3EBF;
            if ((n2 ^ n) == 541736639) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xCA470AAE ^ n, 12) - -2097681843;
        }
        return az2_2.thrz_2(string, string2, string3, l, string4);
    }

    private static boolean dqdh(tdhs_2 tdhs2) {
        block0: {
            int n = 2015102502;
            int n2 = (n = Integer.rotateLeft(n * -1091668299, 16) ^ 0xD17BE42B) ^ 0x7EF110F8;
            if ((n2 ^ n) == 2129727736) break block0;
            int cfr_ignored_0 = (0x6ED16DE ^ n) - -1009574093;
        }
        return tdhs2.dthl();
    }

    private static String zdk_3(az_2 az2_2, String string) {
        block0: {
            int n = hl_2.jat_4(-1249322449);
            az_2 az3 = az2_2;
            n = (az3 != null ? System.identityHashCode(az3) : 0) ^ n;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 4);
            int n2 = n ^ 0x63DB9A02;
            if ((n2 ^ n) == 1675336194) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xD653402D ^ n, 13) - -126720850;
            int cfr_ignored_1 = (int)(0x14E1EE1027D4EB4FL ^ (long)n ^ 0x2150831A2DB98412L);
        }
        return az2_2.tydh_2(string);
    }

    private static boolean thwn(tdhs_2 tdhs2) {
        block0: {
            int n = hl_2.jat_4(1736597104);
            tdhs_2 tdhs3 = tdhs2;
            n = Integer.rotateLeft((tdhs3 != null ? System.identityHashCode(tdhs3) : 0) ^ n, 21);
            int n2 = n ^ 0x46D9D9BE;
            if ((n2 ^ n) == 1188682174) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x215B87CE ^ n, 7) - 242422061;
        }
        return tdhs2.dthl();
    }

    private static String jjr(az_2 az2_2, String string) {
        block0: {
            int n = hl_2.jat_4(1027202554);
            az_2 az3 = az2_2;
            n = Integer.rotateLeft((az3 != null ? System.identityHashCode(az3) : 0) ^ n, 7);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xFC96A1F2;
            if ((n2 ^ n) == -57237006) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xC1AF7C08 ^ n, 11) + 2023597107;
        }
        return az2_2.tydh_2(string);
    }

    private static tdhs_2 dssh_3(az_2 az2_2, String string, String string2, String string3, long l, String string4) {
        block0: {
            int n = hl_2.jat_4(-218274144);
            az_2 az3 = az2_2;
            n = Integer.rotateLeft((az3 != null ? System.identityHashCode(az3) : 0) ^ n, 8);
            String string5 = string2;
            n = Integer.rotateLeft((string5 != null ? System.identityHashCode(string5) : 0) ^ n, 28);
            int n2 = n ^ 0xF7854554;
            if ((n2 ^ n) == -142260908) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x57823F4 ^ n, 3) - -1377175097) * 91759605;
        }
        return az2_2.thshz_2(string, string2, string3, l, string4);
    }

    private static boolean rjs(tdhs_2 tdhs2) {
        block0: {
            int n = hl_2.jat_4(-1408741962);
            int n2 = n ^ 0x60711C80;
            if ((n2 ^ n) == 1618025600) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xCC795136 ^ n, 12) - -955353915) * -864464585;
        }
        return tdhs2.dthl();
    }

    private static String zzsh_3(az_2 az2_2, String string) {
        block0: {
            int n = -279919298;
            int n2 = (n = Integer.rotateLeft(n * -1437278899, 12) ^ 0x8A6C41BC) ^ 0xDCA0CF57;
            if ((n2 ^ n) == -593440937) break block0;
            int cfr_ignored_0 = (0x33F00A69 ^ n) + 2060394492;
        }
        return az2_2.tydh_2(string);
    }

    private static boolean jra(JsonElement jsonElement) {
        block0: {
            int n = -30985237;
            n = Integer.rotateLeft(n * -520617853, 13) ^ 0x73F7503E;
            JsonElement jsonElement2 = jsonElement;
            n = (jsonElement2 != null ? System.identityHashCode(jsonElement2) : 0) ^ n;
            int n2 = n ^ 0x434A3778;
            if ((n2 ^ n) == 1128937336) break block0;
            int cfr_ignored_0 = (0xBD6D0493 ^ n) + -200339339;
        }
        return jsonElement.isJsonNull();
    }

    private static JsonObject shla_2(JsonObject jsonObject, String string) {
        block0: {
            int n = hl_2.jat_4(-918658318);
            JsonObject jsonObject2 = jsonObject;
            n = (jsonObject2 != null ? System.identityHashCode(jsonObject2) : 0) ^ n;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 28);
            int n2 = n ^ 0xA32CFF87;
            if ((n2 ^ n) == -1557332089) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x6A129D75 ^ n, 16) - -593579930) * 1779604853;
            int cfr_ignored_1 = (int)(0xA8A0334827D4EB4FL ^ (long)n ^ 0x9BE0831A2DB8FC91L);
        }
        return jsonObject.getAsJsonObject(string);
    }

    private static boolean ahs_4(JsonObject jsonObject, String string) {
        block0: {
            int n = -1709041997;
            n = Integer.rotateLeft(n * 1909600929, 11) ^ 0x4E640CB8;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 17);
            int n2 = n ^ 0xF7390FE0;
            if ((n2 ^ n) == -147255328) break block0;
            int cfr_ignored_0 = (0x6D1B1953 ^ n) + -789030375;
        }
        return jsonObject.has(string);
    }

    private static int rldh(int n, int n2) {
        block0: {
            int n3 = -71345845;
            int n4 = (n3 = Integer.rotateLeft(n3 * -652143987, 3) ^ 0x87E87AF2) ^ 0xF7B2787D;
            if ((n4 ^ n3) == -139298691) break block0;
            int cfr_ignored_0 = (0xC0D2136 ^ n3) - 1516574187;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String rbz(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1609952892;
            n4 = Integer.rotateLeft(n4 * -686686597, 11) ^ 0xEA99E36;
            n4 = Integer.rotateLeft(n ^ n4, 12);
            int n5 = (n4 = n2 ^ n4) ^ 0xB5A50FB0;
            if ((n5 ^ n4) == -1247473744) break block0;
            int cfr_ignored_0 = (0xEA50E1CC ^ n4) + 167195739;
        }
        return az_2.ghjn(string, n, n2, n3);
    }

    private static String dkhw(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1749725496;
            n4 = Integer.rotateLeft(n4 * 1684249675, 17) ^ 0x9FB44194;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 2);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 16)) ^ 0xCDE8EC64;
            if ((n5 ^ n4) == -840373148) break block0;
            int cfr_ignored_0 = (0xA5A25D5C ^ n4) - -5982378;
        }
        return az_2.ghjn(string, n, n2, n3);
    }

    private static JsonObject khds_2(JsonElement jsonElement) {
        block0: {
            int n = hl_2.jat_4(396818849);
            int n2 = n ^ 0x8D85D75;
            if ((n2 ^ n) == 148397429) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x1F7EA4D4 ^ n, 6) - -726428441) * 528393429;
        }
        return jsonElement.getAsJsonObject();
    }

    private static String dhs_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -201541935;
            n4 = Integer.rotateLeft(n4 * 1503103719, 6) ^ 0x3D9916FF;
            int n5 = (n4 = n3 ^ n4) ^ 0x444CDA9;
            if ((n5 ^ n4) == 71617961) break block0;
            int cfr_ignored_0 = (0xF7B87B78 ^ n4) - 1789838276;
        }
        return az_2.ghjn(string, n, n2, n3);
    }

    private static JsonElement ahn_2(JsonObject jsonObject, String string) {
        block0: {
            int n = -218479865;
            int n2 = (n = Integer.rotateLeft(n * -600794997, 11) ^ 0x40CEEFF3) ^ 0xF4F1633F;
            if ((n2 ^ n) == -185507009) break block0;
            int cfr_ignored_0 = (0x60B2038 ^ n) - 2012873466;
        }
        return jsonObject.get(string);
    }

    private static String hsk_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -131110009;
            n4 = Integer.rotateLeft(n4 * 470174623, 15) ^ 0x18CA346B;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 28)) ^ 0x6E41138D;
            if ((n5 ^ n4) == 1849758605) break block0;
            int cfr_ignored_0 = (0x966E780A ^ n4) + -749772921;
        }
        return az_2.ghjn(string, n, n2, n3);
    }

    private static boolean bbq(JsonObject jsonObject, String string) {
        block0: {
            int n = hl_2.jat_4(652244272);
            JsonObject jsonObject2 = jsonObject;
            n = Integer.rotateLeft((jsonObject2 != null ? System.identityHashCode(jsonObject2) : 0) ^ n, 27);
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 5);
            int n2 = n ^ 0xCA969488;
            if ((n2 ^ n) == -896101240) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xEC76E1B8 ^ n, 16) + -1497172861) * -327753287;
        }
        return jsonObject.has(string);
    }

    private static boolean dsz(JsonElement jsonElement) {
        block0: {
            int n = -1586293264;
            n = Integer.rotateLeft(n * 1456899577, 5) ^ 0x70F09041;
            JsonElement jsonElement2 = jsonElement;
            n = Integer.rotateLeft((jsonElement2 != null ? System.identityHashCode(jsonElement2) : 0) ^ n, 3);
            int n2 = n ^ 0x308C0AAA;
            if ((n2 ^ n) == 814484138) break block0;
            int cfr_ignored_0 = (0x91FF1F5A ^ n) + 1664272473;
        }
        return jsonElement.isJsonNull();
    }

    private static JsonObject syth(JsonObject jsonObject, String string) {
        block0: {
            int n = hl_2.jat_4(1711100706);
            JsonObject jsonObject2 = jsonObject;
            n = Integer.rotateLeft((jsonObject2 != null ? System.identityHashCode(jsonObject2) : 0) ^ n, 10);
            int n2 = n ^ 0x57BC2720;
            if ((n2 ^ n) == 1471948576) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x32417402 ^ n, 9) + 441101177;
        }
        return jsonObject.getAsJsonObject(string);
    }

    private static String thsw_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = hl_2.jat_4(-1765549596);
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 22);
            int n5 = (n4 = n ^ n4) ^ 0xC183A634;
            if ((n5 ^ n4) == -1048336844) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x57407FD0 ^ n4, 13) + -1792206485) * 1463844817;
        }
        return az_2.ghjn(string, n, n2, n3);
    }

    private static JsonElement bjs_2(JsonObject jsonObject, String string) {
        block0: {
            int n = -1423469732;
            n = Integer.rotateLeft(n * -464192807, 8) ^ 0x2582E1EA;
            JsonObject jsonObject2 = jsonObject;
            n = (jsonObject2 != null ? System.identityHashCode(jsonObject2) : 0) ^ n;
            int n2 = n ^ 0xA2CC9DD8;
            if ((n2 ^ n) == -1563648552) break block0;
            int cfr_ignored_0 = (0x9EB0E84 ^ n) - -66567183;
        }
        return jsonObject.get(string);
    }

    private static String zza_7(JsonElement jsonElement) {
        block0: {
            int n = -1079374944;
            int n2 = (n = Integer.rotateLeft(n * 1548578851, 8) ^ 0xBEE9D246) ^ 0x29B61A8;
            if ((n2 ^ n) == 43737512) break block0;
            int cfr_ignored_0 = (0xBD316A08 ^ n) - 383329001;
        }
        return jsonElement.getAsString();
    }

    private static int szt_7(int n, int n2) {
        block0: {
            int n3 = hl_2.jat_4(-1619401008);
            int n4 = (n3 = n ^ n3) ^ 0x88D65EC5;
            if ((n4 ^ n3) == -1999216955) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x17AFB815 ^ n3, 5) - -492508730) * 397391893;
            int cfr_ignored_1 = (int)(0xD51D162827D4EB4FL ^ (long)n3 ^ 0xD120831A2DB807EBL);
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String khkw(String string, int n, int n2, int n3) {
        block0: {
            int n4 = hl_2.jat_4(1236836506);
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 4);
            int n5 = n4 ^ 0x81E2C53F;
            if ((n5 ^ n4) == -2115844801) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xC85A65A5 ^ n4, 12) - 1196420662;
            int cfr_ignored_1 = (int)(0xAE8CB9827D4EB4FL ^ (long)n4 ^ 0x6A40831A2DB9B800L);
        }
        return az_2.ghjn(string, n, n2, n3);
    }

    private static boolean khhw_2(String string, CharSequence charSequence) {
        block0: {
            int n = -2090208073;
            n = Integer.rotateLeft(n * 1684391791, 19) ^ 0xFF05BCCB;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            CharSequence charSequence2 = charSequence;
            n = (charSequence2 != null ? System.identityHashCode(charSequence2) : 0) ^ n;
            int n2 = n ^ 0xE9089976;
            if ((n2 ^ n) == -385312394) break block0;
            int cfr_ignored_0 = (0x6A616DC1 ^ n) + -1314494361;
        }
        return string.contains(charSequence);
    }

    private static String[] thmh(String string) {
        int n = -1184929199;
        int n2 = (n = Integer.rotateLeft(n * 2087519293, 23) ^ 0xD0CDC688) ^ 0xEC4E2C8B;
        if ((n2 ^ n) != -330421109) {
            int cfr_ignored_0 = (0x551146DA ^ n) + 1589027866;
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite tngh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 520694126;
            n3 = Integer.rotateLeft(n3 * -1621598581, 25) ^ 0x34C88509;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x91C98BA2;
            if ((n4 ^ n3) != -1849062494) {
                int cfr_ignored_0 = (0x8EC0A2CC ^ n3) + -1832252159;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bdhkh ^ string.hashCode()) + (n2 + rfy) + i ^ bdhkh, 27) + rfy);
            }
            String[] stringArray = az_2.thmh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] e282325deg4(String string) {
        return string.split("\b\u0011", -1);
    }

    private static CallSite tapm8gds1x6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ wz51gvhw7e ^ string.hashCode()) + (n2 + jfqim17g) + i ^ wz51gvhw7e, 8) + jfqim17g);
            }
            String[] stringArray = az_2.e282325deg4(new String(cArray));
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

