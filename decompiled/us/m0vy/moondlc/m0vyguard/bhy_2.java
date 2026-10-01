/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.PrintStream;
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
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import us.m0vy.moondlc.m0vyguard.tdhh;
import us.m0vy.moondlc.m0vyguard.tht_6;
import us.m0vy.moondlc.m0vyguard.yf;

public class bhy_2 {
    private static final HttpClient dhb_3;
    private static final String thshs = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36";
    private static final int srt_2 = -1782995003;
    private static final int zaf_2 = 501533712;
    private static final int sws_2 = 955999469;
    private static final int dhhsh_2 = 1932229219;
    private static final int tz15p5acob = -832781349;
    private static final int dy0usqrsc6o1 = -1291968612;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int l4kjlvmpgo0;

    public static String tjd_2(String string, String string2) {
        int n = 126178763;
        n = Integer.rotateLeft(n * -554297225, 28) ^ 0x539D2FA5;
        String string3 = string;
        n = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 4);
        String string4 = string2;
        n = Integer.rotateLeft((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 5);
        int n2 = n ^ 0x61C9F282;
        if ((n2 ^ n) != 1640624770) {
            int cfr_ignored_0 = (0x664CA749 ^ n) + -107046862;
        }
        if (string != null && string2 != null && !bhy_2.bda_3(string) && !string2.isBlank()) {
            try {
                tdhh tdhh2 = bhy_2.rfkh(string, string2);
                if (tdhh2 == null) {
                    System.err.println("Song not found on Genius");
                    return null;
                }
                String string5 = bhy_2.sbk_2(tdhh2.dwn);
                if (string5 == null && tdhh2.tsl != null) {
                    string5 = bhy_2.str(tdhh2.tsl);
                }
                return string5;
            }
            catch (IOException iOException) {
                System.err.println("Network error: " + iOException.getMessage());
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                bhy_2.blq(System.err, bhy_2.bthb("尃턔꫐峴텼ꦊ屝퇶꫟", bhy_2.azk(58556413) ^ 0xC01A73, 0xE32D249 ^ 0x97D3EA9B, Integer.rotateLeft(0x5A225D29 ^ 0xF95B97D2, 25)).concat("nterrupted"));
            }
            catch (Exception exception) {
                System.err.println("Unexpected error: " + exception.getMessage());
            }
            return null;
        }
        System.err.println("Artist or title cannot be empty");
        return null;
    }

    private static tdhh rfkh(String string, String string2) throws IOException, InterruptedException {
        int n = 1348582909;
        n = Integer.rotateLeft(n * 997465489, 3) ^ 0x4F0895EB;
        String string3 = string;
        n = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 15);
        String string4 = string2;
        n = Integer.rotateRight((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 15);
        int n2 = n ^ 0xEEF1FC03;
        if ((n2 ^ n) != -286131197) {
            int cfr_ignored_0 = (0xBE9041FE ^ n) - 2135577138;
        }
        String string5 = URLEncoder.encode(string + " " + string2, StandardCharsets.UTF_8);
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create("https://api.genius.com/search?q=" + string5)).header("Auth".concat("orization"), "Bearer batnaM4ixvdL448SIofj6I6aqLsRZ2RuLowRA8tXoWYUAse55DoAX7Xf7MT0vjy5").header("Accept", bhy_2.tyd("ᵚ䜛鶻䟞鵾", -1003031727 + 462294122, bhy_2.fgh(0x4E544417 ^ 0xA6F096E2, 11), Integer.rotateLeft(0xF3C11892 ^ 0x47536A19, 28)).concat(bhy_2.dlt_4("\udd23傮愈\uddd1倠海鲂僾﫯", bhy_2.shz_5(0x418ACC78 ^ 0x2DE7318B, 18), 2099019494 + -1602708522, -733614124 - 419219628))).GET().build();
        HttpResponse<String> httpResponse = dhb_3.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        if (httpResponse.statusCode() != 1855094941 - 1855094741) {
            System.err.println("API returned status: " + httpResponse.statusCode());
            return null;
        }
        JsonObject jsonObject = bhy_2.dnf(JsonParser.parseString((String)httpResponse.body()));
        JsonObject jsonObject2 = bhy_2.zyf(jsonObject, bhy_2.dlz_4("㌴㴤\ud815돐", bhy_2.dght_3(0xEA6C5650 ^ 0x8DF2A60A, 17), Integer.reverse(-2112359026) ^ 0x92B1C4BE, Integer.rotateLeft(0x7957E795 ^ 0x5DB2F0FC, 19)));
        if (jsonObject2 != null && jsonObject2.has("status") && jsonObject2.get("status").getAsInt() != Integer.rotateLeft(0xF9171A95 ^ 0xFA371A95, 14)) {
            System.err.println("API error: " + bhy_2.jsh_2(jsonObject2.get("message")));
            return null;
        }
        JsonObject jsonObject3 = jsonObject.getAsJsonObject("response");
        if (jsonObject3 != null && jsonObject3.has("hits")) {
            for (JsonElement jsonElement : jsonObject3.getAsJsonArray("hits")) {
                JsonObject jsonObject4 = bhy_2.ddhkh_2(jsonElement).getAsJsonObject(bhy_2.dlt_4("뗮適Ὗ㒇邮ᾖ", 0x786A7B6F ^ 0x93C03EC2, -875281719 + -1732489988, bhy_2.dhm(0xCC17A57F ^ 0x852EE0A5, 21)));
                if (jsonObject4 == null || !jsonObject4.has("url") || !jsonObject4.has("id")) continue;
                return new tdhh(jsonObject4.get("url").getAsString(), bhy_2.thtgh(bhy_2.tlh(jsonObject4, "id")));
            }
        }
        return null;
    }

    private static String sbk_2(int n) throws IOException, InterruptedException {
        JsonObject jsonObject;
        HttpRequest httpRequest;
        HttpResponse httpResponse;
        int n2 = tht_6.tdhz_3(-922484212);
        int n3 = (n2 = n ^ n2) ^ 0xFDD24A88;
        if ((n3 ^ n2) != -36550008) {
            int cfr_ignored_0 = Integer.rotateLeft(0x34D64884 ^ n2, 9) - 1783654199;
        }
        if ((httpResponse = dhb_3.send(httpRequest = HttpRequest.newBuilder().uri(URI.create("https://api.genius.com/songs/" + n + "?text_format=plain")).header("Authorization", "Bearer batnaM4ix".concat("vdL448SIofj6I6aq").concat("LsRZ2RuLowRA8tXoWYUAs").concat(bhy_2.dlt_4("绎ᔾ倦ᖬ傝镛倔镃ჩ锨ྎ閩ႅ", Integer.reverse(-360356097) ^ 0x63025086, 0xFC81CA48 ^ 0x95D03579, bhy_2.jzsh(0x74141701 ^ 0x44D1336A, 19)))).header("Accept", "applica".concat(bhy_2.dlt_4("\ude55ࡨ돲\ude13䢂댿\ude46䠊뎫", bhy_2.dbf_2(-2140051904) ^ 0x580D273A, -1750295676 + 44701064, Integer.rotateLeft(0x57F3D461 ^ 0xC5C64C03, 4)))).GET().build(), bhy_2.dfn())).statusCode() != -1773584829 + 1773585029) {
            return null;
        }
        JsonObject jsonObject2 = JsonParser.parseString((String)((String)httpResponse.body())).getAsJsonObject();
        JsonObject jsonObject3 = bhy_2.khbr(jsonObject2.getAsJsonObject("response")).map(bhy_2::dal_3).orElse(null);
        if (jsonObject3 != null && jsonObject3.has("lyrics") && (jsonObject = bhy_2.zzd_5(jsonObject3, "lyrics")).has("plain")) {
            return bhy_2.sfz_3(bhy_2.khhd_4(jsonObject, "plain"));
        }
        return jsonObject3 != null && jsonObject3.has("lyrics_body") ? bhy_2.ddz_4(jsonObject3, "lyrics_body").getAsString() : null;
    }

    private static String str(String string) throws IOException, InterruptedException {
        int n = -48543677;
        int n2 = (n = Integer.rotateLeft(n * -181690529, 22) ^ 0xFBBF53D7) ^ 0xF5AA84B7;
        if ((n2 ^ n) != -173374281) {
            int cfr_ignored_0 = (0x8B1CCF4 ^ n) - -2137851534;
        }
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(string)).header("User-Agent", bhy_2.dlt_4("ꂐ歊ꁼ毥ꀘꁏ㛱ꃦ㙷⁨㘙⃡謹㙊⁴讎㛢⃓謢똢“譇뚼惓謍뙚恢௼뛓悘୸긖忄", Integer.rotateLeft(0xC2762F6D ^ 0x4C11E691, 1), -845426025 - -627420715, bhy_2.khgh(0x799A4D91 ^ 0x23A2A15E, 30)).concat(") AppleWebKit/537.36 (KHTML, like Ge").concat("cko) Chrome/91.0.4472.124 Safari/537.36")).header("Accept-Language", "en-US".concat(",en;q=0.9")).GET().build();
        HttpResponse<String> httpResponse = dhb_3.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        Pattern pattern = Pattern.compile("(<div[^>]*class=\"[^\"]*Lyrics__Container[^\"]*\"[^>]*>.*?</div>)", Integer.reverse(419522210) ^ 0x456680B8);
        Matcher matcher = pattern.matcher(httpResponse.body());
        StringBuilder stringBuilder = new StringBuilder();
        while (matcher.find()) {
            String string2 = matcher.group(1).replaceAll("<br\\s*/?>", "\n").replaceAll("<.*?>", "").replaceAll("&quot;", "\"").trim();
            if (string2.isEmpty()) continue;
            stringBuilder.append(string2).append("\n\n");
        }
        return stringBuilder.isEmpty() ? null : stringBuilder.toString().trim();
    }

    private static JsonObject dal_3(JsonObject jsonObject) {
        block0: {
            int n = -1128520563;
            int n2 = (n = Integer.rotateLeft(n * 53213965, 8) ^ 0x6446083F) ^ 0x5CD965D9;
            if ((n2 ^ n) == 1557751257) break block0;
            int cfr_ignored_0 = (0xE0654154 ^ n) - 924154371;
        }
        return jsonObject.getAsJsonObject("song");
    }

    private static String dlt_4(String string, int n, int n2, int n3) {
        int n4 = -390588060;
        n4 = Integer.rotateLeft(n4 * 492714551, 23) ^ 0xD16E8F85;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = n4 ^ 0x922F3967;
        if ((n5 ^ n4) != -1842398873) {
            int cfr_ignored_0 = (0x7A972003 ^ n4) - -1478648900;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0xE38C0E98) + srt_2 ^ Integer.reverse(n2 + i * -4543543), 28) - zaf_2);
        }
        return new String(cArray);
    }

    private static boolean bda_3(String string) {
        block0: {
            int n = -935191924;
            n = Integer.rotateLeft(n * 330174449, 10) ^ 0x686C6CE0;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 5);
            int n2 = n ^ 0x6DFC8623;
            if ((n2 ^ n) == 1845265955) break block0;
            int cfr_ignored_0 = (0xA5BE9CAF ^ n) - 1049076771;
        }
        return string.isBlank();
    }

    private static String zdkh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1682895456;
            n4 = Integer.rotateLeft(n4 * 2055270669, 13) ^ 0xF1D185A;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 16);
            int n5 = (n4 = n ^ n4) ^ 0x7177027D;
            if ((n5 ^ n4) == 1903624829) break block0;
            int cfr_ignored_0 = (0x1539F01D ^ n4) - 1027337399;
        }
        return bhy_2.dlt_4(string, n, n2, n3);
    }

    private static int azk(int n) {
        block0: {
            int n2 = -1537914251;
            int n3 = (n2 = Integer.rotateLeft(n2 * 422207043, 23) ^ 0x9FE1ECBF) ^ 0x2B829615;
            if ((n3 ^ n2) == 729978389) break block0;
            int cfr_ignored_0 = (0x8FD7DC60 ^ n2) - 73026632;
        }
        return Integer.reverse(n);
    }

    private static String bthb(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tht_6.tdhz_3(-1360745534);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 17)) ^ 0xD71E7E0B;
            if ((n5 ^ n4) == -685867509) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x79FAD5C9 ^ n4, 18) + -910327150;
            int cfr_ignored_1 = (int)(0xBB487BF427D4EB4FL ^ (long)n4 ^ 0xA98831A2DB8DB41L);
        }
        return bhy_2.dlt_4(string, n, n2, n3);
    }

    private static void blq(PrintStream printStream, String string) {
        int n = -363825657;
        n = Integer.rotateLeft(n * 200613547, 13) ^ 0xEA682911;
        PrintStream printStream2 = printStream;
        n = Integer.rotateRight((printStream2 != null ? System.identityHashCode(printStream2) : 0) ^ n, 11);
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 7);
        int n2 = n ^ 0x8DC22FFE;
        if ((n2 ^ n) != -1916653570) {
            int cfr_ignored_0 = (0x679259F9 ^ n) - -1411699231;
        }
        printStream.println(string);
    }

    private static String ghtn_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -2125526246;
            int n5 = (n4 = Integer.rotateLeft(n4 * -918924335, 5) ^ 0x54F4046C) ^ 0x64C2849A;
            if ((n5 ^ n4) == 1690469530) break block0;
            int cfr_ignored_0 = (0xE58D8F80 ^ n4) - 863754427;
        }
        return bhy_2.dlt_4(string, n, n2, n3);
    }

    private static int fgh(int n, int n2) {
        block0: {
            int n3 = -1535034991;
            n3 = Integer.rotateLeft(n3 * 235437705, 10) ^ 0xFB7408A7;
            n3 = Integer.rotateRight(n ^ n3, 16);
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 13)) ^ 0xFB1CF35B;
            if ((n4 ^ n3) == -81988773) break block0;
            int cfr_ignored_0 = (0x5F9DCACA ^ n3) + 810814184;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String tyd(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1859333094;
            n4 = Integer.rotateLeft(n4 * 1346732097, 21) ^ 0x9E23D75A;
            int n5 = (n4 = n ^ n4) ^ 0x3B23480C;
            if ((n5 ^ n4) == 992167948) break block0;
            int cfr_ignored_0 = (0xAA0F9C16 ^ n4) + 200548489;
        }
        return bhy_2.dlt_4(string, n, n2, n3);
    }

    private static int shz_5(int n, int n2) {
        block0: {
            int n3 = -1764098530;
            n3 = Integer.rotateLeft(n3 * -957601391, 27) ^ 0x8BFD4562;
            int n4 = (n3 = n ^ n3) ^ 0x28C3738C;
            if ((n4 ^ n3) == 683897740) break block0;
            int cfr_ignored_0 = (0xBE1A8D92 ^ n3) - -551390841;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static JsonObject dnf(JsonElement jsonElement) {
        block0: {
            int n = -601448453;
            int n2 = (n = Integer.rotateLeft(n * 1834033945, 8) ^ 0x298D232D) ^ 0x601C29F8;
            if ((n2 ^ n) == 1612458488) break block0;
            int cfr_ignored_0 = (0xBC3AB603 ^ n) + -312953389;
        }
        return jsonElement.getAsJsonObject();
    }

    private static int dght_3(int n, int n2) {
        block0: {
            int n3 = tht_6.tdhz_3(1326166389);
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0xE35B887B;
            if ((n4 ^ n3) == -480540549) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xAC50390E ^ n3, 8) - -501970963;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String dlz_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 679268055;
            n4 = Integer.rotateLeft(n4 * -82513851, 10) ^ 0x5AC9C4B3;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 28);
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 3)) ^ 0x2863425F;
            if ((n5 ^ n4) == 677593695) break block0;
            int cfr_ignored_0 = (0x1F8C88 ^ n4) + -720060103;
        }
        return bhy_2.dlt_4(string, n, n2, n3);
    }

    private static JsonObject zyf(JsonObject jsonObject, String string) {
        block0: {
            int n = 655413084;
            n = Integer.rotateLeft(n * 1470517233, 3) ^ 0xEFDDE204;
            JsonObject jsonObject2 = jsonObject;
            n = (jsonObject2 != null ? System.identityHashCode(jsonObject2) : 0) ^ n;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xB10C3C5F;
            if ((n2 ^ n) == -1324598177) break block0;
            int cfr_ignored_0 = (0x961CF303 ^ n) - 1589162755;
        }
        return jsonObject.getAsJsonObject(string);
    }

    private static String khrf(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tht_6.tdhz_3(2049454582);
            n4 = Integer.rotateLeft(n2 ^ n4, 7);
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 16)) ^ 0x59DCE0AD;
            if ((n5 ^ n4) == 1507647661) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x23F4D15B ^ n4, 7) + 1594030400) * 603246939;
        }
        return bhy_2.dlt_4(string, n, n2, n3);
    }

    private static String jsh_2(JsonElement jsonElement) {
        block0: {
            int n = tht_6.tdhz_3(-1229997666);
            int n2 = n ^ 0x329B6918;
            if ((n2 ^ n) == 849045784) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x8434D086 ^ n, 3) - 113434485;
        }
        return jsonElement.getAsString();
    }

    private static JsonObject ddhkh_2(JsonElement jsonElement) {
        block0: {
            int n = tht_6.tdhz_3(-2099993211);
            int n2 = n ^ 0xBF68CD3E;
            if ((n2 ^ n) == -1083650754) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x3DBC68BB ^ n, 10) + 2116963808) * 1035757755;
        }
        return jsonElement.getAsJsonObject();
    }

    private static int dhm(int n, int n2) {
        block0: {
            int n3 = tht_6.tdhz_3(681836006);
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0x5B71204;
            if ((n4 ^ n3) == 95883780) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x2D14EFE2 ^ n3, 8) + 2045160345;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String khrt(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1411484039;
            n4 = Integer.rotateLeft(n4 * -2014594653, 24) ^ 0xEE9A0223;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 16);
            int n5 = (n4 = n ^ n4) ^ 0x350C95B8;
            if ((n5 ^ n4) == 890017208) break block0;
            int cfr_ignored_0 = (0x9ED2E3C1 ^ n4) - -1921190959;
        }
        return bhy_2.dlt_4(string, n, n2, n3);
    }

    private static JsonElement tlh(JsonObject jsonObject, String string) {
        block0: {
            int n = 1006179499;
            n = Integer.rotateLeft(n * 573280655, 7) ^ 0x7EE5EE92;
            JsonObject jsonObject2 = jsonObject;
            n = Integer.rotateRight((jsonObject2 != null ? System.identityHashCode(jsonObject2) : 0) ^ n, 25);
            int n2 = n ^ 0xEA636DFC;
            if ((n2 ^ n) == -362582532) break block0;
            int cfr_ignored_0 = (0xD19A7957 ^ n) + -554040376;
        }
        return jsonObject.get(string);
    }

    private static int thtgh(JsonElement jsonElement) {
        block0: {
            int n = tht_6.tdhz_3(1537067835);
            JsonElement jsonElement2 = jsonElement;
            n = (jsonElement2 != null ? System.identityHashCode(jsonElement2) : 0) ^ n;
            int n2 = n ^ 0x723C4E01;
            if ((n2 ^ n) == 1916554753) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x29A1853A ^ n, 8) + 250396993) * 698451259;
        }
        return jsonElement.getAsInt();
    }

    private static String nj(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -577445146;
            n4 = Integer.rotateLeft(n4 * -1443695017, 22) ^ 0x6E633302;
            n4 = Integer.rotateLeft(n ^ n4, 29);
            int n5 = (n4 = n3 ^ n4) ^ 0x2368978E;
            if ((n5 ^ n4) == 594057102) break block0;
            int cfr_ignored_0 = (0xFEFC7568 ^ n4) + -730682103;
        }
        return bhy_2.dlt_4(string, n, n2, n3);
    }

    private static String hyd(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tht_6.tdhz_3(814911012);
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 23);
            int n5 = n4 ^ 0xF18F1859;
            if ((n5 ^ n4) == -242280359) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xC11D967D ^ n4, 11) - 1727191134) * -1055025539;
            int cfr_ignored_1 = (int)(0x3AF384027D4EB4FL ^ (long)n4 ^ 0x8DF0831A2DB9AA8FL);
        }
        return bhy_2.dlt_4(string, n, n2, n3);
    }

    private static int jzsh(int n, int n2) {
        block0: {
            int n3 = tht_6.tdhz_3(99641353);
            n3 = Integer.rotateLeft(n ^ n3, 19);
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 14)) ^ 0x8349D749;
            if ((n4 ^ n3) == -2092312759) break block0;
            tht_6.thrb(-2034647232, n3);
            int cfr_ignored_0 = (int)(0x188EC6F97F4A7C15L ^ (long)n3 ^ 0x70823227030D9CCCL);
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int dbf_2(int n) {
        block0: {
            int n2 = 1646373693;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1706868155, 11) ^ 0xB246D7E1) ^ 0xC9D326DE;
            if ((n3 ^ n2) == -908908834) break block0;
            int cfr_ignored_0 = (0xABF28DE3 ^ n2) - -492236804;
        }
        return Integer.reverse(n);
    }

    private static HttpResponse.BodyHandler dfn() {
        block0: {
            int n = 1311674329;
            int n2 = (n = Integer.rotateLeft(n * -1457038367, 23) ^ 0x5F0BDD28) ^ 0x9C6A6925;
            if ((n2 ^ n) == -1670747867) break block0;
            int cfr_ignored_0 = (0xD244E6FC ^ n) + -376187789;
        }
        return HttpResponse.BodyHandlers.ofString();
    }

    private static Optional khbr(Object object) {
        block0: {
            int n = 1242585949;
            n = Integer.rotateLeft(n * -114906633, 13) ^ 0x2A2F7767;
            Object object2 = object;
            n = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 20);
            int n2 = n ^ 0xE4A43A9F;
            if ((n2 ^ n) == -458999137) break block0;
            int cfr_ignored_0 = (0xAEB461C2 ^ n) - -959535204;
        }
        return Optional.ofNullable(object);
    }

    private static JsonObject zzd_5(JsonObject jsonObject, String string) {
        block0: {
            int n = -850809049;
            n = Integer.rotateLeft(n * -1686447527, 5) ^ 0x290BA769;
            JsonObject jsonObject2 = jsonObject;
            n = Integer.rotateRight((jsonObject2 != null ? System.identityHashCode(jsonObject2) : 0) ^ n, 22);
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 26);
            int n2 = n ^ 0xD65EE327;
            if ((n2 ^ n) == -698424537) break block0;
            int cfr_ignored_0 = (0x1B174C00 ^ n) - -946180126;
        }
        return jsonObject.getAsJsonObject(string);
    }

    private static String hnsh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -499575552;
            n4 = Integer.rotateLeft(n4 * -951665863, 25) ^ 0xCB0173BC;
            int n5 = (n4 = n ^ n4) ^ 0x4733BAA2;
            if ((n5 ^ n4) == 1194572450) break block0;
            int cfr_ignored_0 = (0xA50AAFA2 ^ n4) + 536075714;
        }
        return bhy_2.dlt_4(string, n, n2, n3);
    }

    private static JsonElement khhd_4(JsonObject jsonObject, String string) {
        block0: {
            int n = tht_6.tdhz_3(3491402);
            JsonObject jsonObject2 = jsonObject;
            n = Integer.rotateRight((jsonObject2 != null ? System.identityHashCode(jsonObject2) : 0) ^ n, 25);
            int n2 = n ^ 0x1AD0DF64;
            if ((n2 ^ n) == 449896292) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x1AE5992E ^ n, 6) - 1177234381;
        }
        return jsonObject.get(string);
    }

    private static String sfz_3(JsonElement jsonElement) {
        block0: {
            int n = 420473424;
            n = Integer.rotateLeft(n * -265305529, 12) ^ 0x7CFCB33E;
            JsonElement jsonElement2 = jsonElement;
            n = Integer.rotateLeft((jsonElement2 != null ? System.identityHashCode(jsonElement2) : 0) ^ n, 5);
            int n2 = n ^ 0xB7F78C8F;
            if ((n2 ^ n) == -1208513393) break block0;
            int cfr_ignored_0 = (0xAEF866DF ^ n) + -736421845;
        }
        return jsonElement.getAsString();
    }

    private static JsonElement ddz_4(JsonObject jsonObject, String string) {
        block0: {
            int n = -565149412;
            n = Integer.rotateLeft(n * 23459599, 12) ^ 0x7BA77553;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 7);
            int n2 = n ^ 0x87B39E7;
            if ((n2 ^ n) == 142293479) break block0;
            int cfr_ignored_0 = (0xD62BB8FB ^ n) - -1177828486;
        }
        return jsonObject.get(string);
    }

    private static int khgh(int n, int n2) {
        block0: {
            int n3 = -884305379;
            n3 = Integer.rotateLeft(n3 * 1301646099, 13) ^ 0x1B17E998;
            n3 = Integer.rotateRight(n ^ n3, 24);
            int n4 = (n3 = n2 ^ n3) ^ 0x4CB8EDC5;
            if ((n4 ^ n3) == 1287187909) break block0;
            int cfr_ignored_0 = (0x87F27FD8 ^ n3) - -2033836693;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String[] zah_8(String string) {
        block0: {
            int n = 2073040546;
            int n2 = (n = Integer.rotateLeft(n * 128356357, 13) ^ 0x939B98CA) ^ 0xD0AAFD32;
            if ((n2 ^ n) == -794100430) break block0;
            int cfr_ignored_0 = (0xAB3AEB90 ^ n) + -1991074409;
        }
        return string.split("\u0004\u0015", -1);
    }

    private static CallSite shk_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1123410193;
            n3 = Integer.rotateLeft(n3 * -236818775, 3) ^ 0xEDD45CD6;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 14);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x5C93F0EF;
            if ((n4 ^ n3) != 1553199343) {
                int cfr_ignored_0 = (0xE199EE00 ^ n3) - 385619636;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ sws_2 ^ string.hashCode()) + (n2 + dhhsh_2) + i ^ sws_2, 19) + dhhsh_2);
            }
            String[] stringArray = bhy_2.zah_8(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] lv33lp25w6dd(String string) {
        return string.split("\u0006\u000f", -1);
    }

    private static CallSite ryi8o5v9z(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ tz15p5acob ^ string.hashCode()) + (n2 + dy0usqrsc6o1) + i ^ tz15p5acob, 27) + dy0usqrsc6o1);
            }
            String[] stringArray = bhy_2.lv33lp25w6dd(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

