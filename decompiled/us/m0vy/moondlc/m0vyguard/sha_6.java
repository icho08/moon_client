/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import us.m0vy.moondlc.m0vyguard.bhf;
import us.m0vy.moondlc.m0vyguard.bfm;
import us.m0vy.moondlc.m0vyguard.aa;
import us.m0vy.moondlc.m0vyguard.yf;

public class sha_6 {
    private static final String slgh = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36";
    private static final Gson af;
    private static final int nt_3 = 220614358;
    private static final int shghgh = -1758285574;
    private static final int sdhd = 26948114;
    private static final int dqth = 1401754183;
    private static final int z0b8i9z = 1264779718;
    private static final int xe7n6g9 = 1832035253;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int wehvqjnh3patq0;

    private static HttpURLConnection sbn(String string, String string2, String string3, Map map, String string4) throws IOException {
        int n = 343647849;
        n = Integer.rotateLeft(n * -255275127, 22) ^ 0x752DF063;
        String string5 = string2;
        n = Integer.rotateRight((string5 != null ? System.identityHashCode(string5) : 0) ^ n, 29);
        String string6 = string3;
        n = Integer.rotateLeft((string6 != null ? System.identityHashCode(string6) : 0) ^ n, 4);
        int n2 = n ^ 0x31A41E47;
        if ((n2 ^ n) != 832839239) {
            int cfr_ignored_0 = (0x25DFB82E ^ n) - 212529433;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection)new URL(string).openConnection();
        httpURLConnection.setRequestMethod(string2);
        httpURLConnection.setConnectTimeout(Integer.reverse(1564175401) ^ 0x9436DB6A);
        httpURLConnection.setReadTimeout(-41677710 + 41687710);
        httpURLConnection.setRequestProperty(sha_6.tnh_3("ꆣ刢䊌㎸ᓄԿ疟☜", sha_6.bhth_2(0x7A1CA76A ^ 0x65BE3016, 30), 0x798A11B2 ^ 0x5CC87934, 0x1BDAE974 ^ 0x60D31C8), string4);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue());
            }
        }
        sha_6.khmt(httpURLConnection, true);
        httpURLConnection.setDoOutput(true);
        if (string3 != null && !string3.isEmpty()) {
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            try {
                sha_6.hj(dataOutputStream, string3);
            }
            catch (Throwable throwable) {
                try {
                    dataOutputStream.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            sha_6.shthgh(dataOutputStream);
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public static bhf khlz(String string, String string2, String string3, Map map, String string4) throws IOException {
        String string5;
        HttpURLConnection httpURLConnection;
        int n;
        try {
            int n2 = -1586276635;
            n2 = Integer.rotateLeft(n2 * 1199133363, 15) ^ 0x28058D97;
            String string6 = string;
            n2 = (string6 != null ? System.identityHashCode(string6) : 0) ^ n2;
            String string7 = string2;
            n2 = (string7 != null ? System.identityHashCode(string7) : 0) ^ n2;
            int n3 = n2 ^ 0x32C34186;
            if ((n3 ^ n2) != 851657094) {
                int cfr_ignored_0 = (0x93B01763 ^ n2) + -438710775;
            }
            if ((0x120 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            sha_6.aqn();
        }
        InputStream inputStream = (n = (httpURLConnection = sha_6.sbn(string, string2, string3, map, string4)).getResponseCode()) >= 1563601118 + -1563600918 && n < 1220535016 - 1220534716 ? sha_6.tms_3(httpURLConnection) : httpURLConnection.getErrorStream();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));){
            String string8;
            StringBuilder stringBuilder = new StringBuilder();
            while ((string8 = bufferedReader.readLine()) != null) {
                stringBuilder.append(string8);
            }
            string5 = stringBuilder.toString();
        }
        return new bhf(n, string5);
    }

    public static bhf zab(String string, Map map) throws IOException {
        bhf bhf2 = null;
        int n = 0;
        int n2 = aa.bjb(-92820492);
        String string2 = string;
        n2 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n2;
        int n3 = Integer.rotateLeft(n2 ^ 0x573E2B18, 24) ^ 0xF60428BC ^ 0xF60428BC;
        block25: while (true) {
            switch (Integer.rotateRight(n3, 24) ^ n2) {
                case 1463692056: {
                    int cfr_ignored_0 = Integer.rotateRight(0x81D52267 ^ n2, 3) - -1121138252;
                    if (yf.khdha_2()) {
                        try {
                            n -= 5;
                            if ((0xCAFC1821DF624003L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n3 = Integer.rotateLeft(n2 ^ 0x2C22F6A8, 24) + 1971766166 - 1971766166;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = Integer.rotateLeft(n2 ^ 0x2C22F6A8, 24) ^ 0x528A61A6 ^ 0x528A61A6;
                        }
                        n += 3;
                        continue block25;
                    }
                    n3 = Integer.rotateLeft(n2 ^ 0xF74B3003, 24) + -636086019 - -636086019;
                    int cfr_ignored_1 = Integer.rotateLeft(0xAE072068 ^ n2, 8) + 389712851;
                    n += 4;
                    continue block25;
                }
                case 740488872: {
                    int cfr_ignored_2 = (Integer.rotateLeft(0x9CEB12F9 ^ n2, 6) + 81062754) * -1662315783;
                    int cfr_ignored_3 = (int)(0x5E59BCC427D4EB4FL ^ (long)n2 ^ 0x84F8831A2DB91162L);
                    bhf2 = sha_6.khlz(string, "GET", "", map, "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36");
                    n3 = Integer.rotateLeft(n2 ^ 0xB97BD622, 24) + -1208709042 - -1208709042;
                    continue block25;
                }
                case -146067453: {
                    int cfr_ignored_4 = Integer.rotateLeft(0x7CE782E8 ^ n2, 18) + 610695507;
                    sha_6.abh();
                    try {
                        n += 4;
                        if ((0x52C5495CA4ABC08DL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x2C22F6A8, 24);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x2C22F6A8, 24) ^ 0xD514E08A ^ 0xD514E08A;
                    }
                    continue block25;
                }
                case -1350271349: {
                    int cfr_ignored_5 = (Integer.rotateRight(0x447408D3 ^ n2, 11) + 1315614920) * 1148455123;
                    n3 = Integer.rotateLeft(n2 ^ 0xB5C1D7A4, 24) ^ 0x7D52FB1B ^ 0x7D52FB1B;
                    int cfr_ignored_6 = Integer.rotateLeft(0xA3A5D065 ^ n2, 7) - -713958538;
                    int cfr_ignored_7 = (int)(0x61177E5827D4EB4FL ^ (long)n2 ^ 0x1C0831A2DB96FFFL);
                    int cfr_ignored_8 = (int)(0x77447DC8FF4EC815L ^ (long)n2 ^ 0x6E1322E6B0D4359L);
                    n3 = Integer.rotateLeft(n2 ^ 0xCB5E86EA, 24);
                    int cfr_ignored_9 = (int)(0x7E74E0B40F95BB8EL ^ (long)n2 ^ 0x3C18D3988C3B5138L);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x573E2B18, 24)));
                    n += 2;
                    continue block25;
                }
                case 908441822: {
                    int cfr_ignored_10 = (Integer.rotateRight(0xFDC0EED6 ^ n2, 18) - -1095070939) * -37687593;
                    int cfr_ignored_11 = (int)(0x8DF7D4D06C9D4C55L ^ (long)n2 ^ 0x54D01589638CB63EL);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x1E953210, 24) ^ 0x71F730BCDD05B95DL ^ 0x71F730BCDD05B95DL);
                    int cfr_ignored_12 = (int)(0x56480ED01B45EF1CL ^ (long)n2 ^ 0xE0D0FA38251F0141L);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x573E2B18, 24) ^ 0xD096E6A5DD8CCB1EL ^ 0xD096E6A5DD8CCB1EL);
                    n += 2;
                    continue block25;
                }
                case -1938478678: {
                    int cfr_ignored_13 = (Integer.rotateRight(0x418C8A7E ^ n2, 11) - -194878339) * 1099729535;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xD92DD32C, 24) ^ 0xA99B9FDAA2EA1B91L ^ 0xA99B9FDAA2EA1B91L);
                    int cfr_ignored_14 = Integer.rotateLeft(0xE1CF6781 ^ n2, 15) + 1551575002;
                    int cfr_ignored_15 = (int)(0x237DC9BC27D4EB4FL ^ (long)n2 ^ 0x6E08831A2DB9EB2AL);
                    try {
                        if ((0x4351630D8D9CFCD1L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x573E2B18, 24) ^ 0x6C0EBB6346A46479L ^ 0x6C0EBB6346A46479L);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x573E2B18, 24)));
                    }
                    n -= 2;
                    continue block25;
                }
                case 754048083: {
                    int cfr_ignored_16 = (Integer.rotateRight(0xD8A2E79E ^ n2, 14) - 1075293021) * -660412513;
                    n3 = Integer.rotateLeft(n2 ^ 0x74F5C49B, 24) + -879311991 - -879311991;
                    int cfr_ignored_17 = (Integer.rotateRight(0xBAB3E36 ^ n2, 4) - 1847207877) * 195771959;
                    n3 = Integer.rotateLeft(n2 ^ 0x198F1738, 24) ^ 0xF46A7207 ^ 0xF46A7207;
                    int cfr_ignored_18 = (Integer.rotateRight(0xA7657C1A ^ n2, 7) + 1235723873) * -1486521317;
                    n3 = Integer.rotateLeft(n2 ^ 0x573E2B18, 24) + -262657438 - -262657438;
                    continue block25;
                }
                case -324750222: {
                    int cfr_ignored_19 = Integer.rotateRight(0x7A2E32C2 ^ n2, 18) + -805976903;
                    try {
                        n -= 2;
                        if ((0x6B4E6DD3AF5B4B71L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x573E2B18, 24) + -1937786826 - -1937786826;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x573E2B18, 24)));
                    }
                    n += 5;
                    continue block25;
                }
                case 672359692: {
                    int cfr_ignored_20 = Integer.rotateRight(0xEE122C4A ^ n2, 16) + -661586895;
                    int cfr_ignored_21 = (int)(0xDB2E0E9D7A2FE6E5L ^ (long)n2 ^ 0xE04A38EC36EC1B8DL);
                    n3 = Integer.rotateLeft(n2 ^ 0x4A5C0EDF, 24);
                    int cfr_ignored_22 = (int)(0xE032760A626ED23EL ^ (long)n2 ^ 0x1164086E5F5A6DB5L);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x573E2B18, 24) ^ 0x39692396BB3CECD4L ^ 0x39692396BB3CECD4L);
                    continue block25;
                }
                case 727060759: {
                    int cfr_ignored_23 = Integer.rotateLeft(0x5AE89C0C ^ n2, 14) - 109610159;
                    int cfr_ignored_24 = (int)(0x100B8DDBF598093CL ^ (long)n2 ^ 0xE6C72783E95F8DC6L);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x573E2B18, 24)));
                    n += 3;
                    continue block25;
                }
                case -1109864414: {
                    int cfr_ignored_25 = Integer.rotateRight(0xE1728602 ^ n2, 15) + 1362876793;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xBFD23694, 24) ^ 0x14A9B1C1D6721626L ^ 0x14A9B1C1D6721626L);
                    int cfr_ignored_26 = Integer.rotateRight(0xF35BC442 ^ n2, 17) + 2088395577;
                    n3 = Integer.rotateLeft(n2 ^ 0x573E2B18, 24);
                    --n;
                    continue block25;
                }
                case -12615370: {
                    int cfr_ignored_27 = (Integer.rotateRight(0xC20F9B77 ^ n2, 11) - -2076085596) * -1039164553;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xAB560420, 24) ^ 0xB60126BC04A2FCAFL ^ 0xB60126BC04A2FCAFL);
                    int cfr_ignored_28 = Integer.rotateRight(0x95C39FE3 ^ n2, 5) + 655227832;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xA8ADAFC9, 24)));
                    int cfr_ignored_29 = Integer.rotateLeft(0x7B3D0E2D ^ n2, 18) - -255699282;
                    int cfr_ignored_30 = (int)(0xB98FA01027D4EB4FL ^ (long)n2 ^ 0xBD50831A2DB8DECEL);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x573E2B18, 24)));
                    continue block25;
                }
                case -288830705: {
                    int cfr_ignored_31 = Integer.rotateLeft(0xE0E6BD80 ^ n2, 15) + 1078890939;
                    n3 = Integer.rotateLeft(n2 ^ 0x83F0F0C4, 24) + 402122331 - 402122331;
                    int cfr_ignored_32 = (Integer.rotateLeft(0x30A6055 ^ n2, 3) - 1654606214) * 51011669;
                    int cfr_ignored_33 = (int)(0xC1B8CE6827D4EB4FL ^ (long)n2 ^ 0x61A0831A2DB82EA0L);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x573E2B18, 24) ^ 0x809F0EE3F1A52A3EL ^ 0x809F0EE3F1A52A3EL);
                    n -= 3;
                    continue block25;
                }
                case 2019904400: {
                    int cfr_ignored_34 = (Integer.rotateRight(0x507CB2F3 ^ n2, 13) + -1015592280) * 1350349555;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x2D7914E9, 24) ^ 0x6763B9F80016E8D5L ^ 0x6763B9F80016E8D5L);
                    int cfr_ignored_35 = (Integer.rotateRight(0x8650132 ^ n2, 4) + 144229449) * 140837171;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x573E2B18, 24) ^ 0xD7E2F5FFE112DA84L ^ 0xD7E2F5FFE112DA84L);
                    continue block25;
                }
                case -1183066590: {
                    return bhf2;
                }
            }
            int cfr_ignored_36 = (Integer.rotateLeft(0x57753D18 ^ n2, 13) + -1685060317) * 1467301145;
            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x573E2B18, 24)));
        }
    }

    public static bhf hzd_4(String string, String string2, Map map) throws IOException {
        try {
            int n = -316109326;
            n = Integer.rotateLeft(n * -1425784951, 10) ^ 0x3472574C;
            int n2 = n ^ 0xB087A821;
            if ((n2 ^ n) != -1333286879) {
                int cfr_ignored_0 = (0x5DAF25D3 ^ n) + -781289472;
            }
            if ((0x2CD & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return sha_6.khlz(string, "POST", string2, map, sha_6.tma_4("\udc94챟㿝潷ḙঀ濫⢕堤䮦뫏闥蕳瓲Ꞝ휍욯㙀懝ᄥ2⍪劐䈨䶡\udcd6뾔轼黍ꦮ復죳堗段㭍ਓᖪ╝瓍䑈휓똏臒酦ꂦ썤勹戋⶯", -876281437 + 191420950, Integer.reverse(-502666391) ^ 0xD8A1B84F, sha_6.dshd_4(0x21238EBD ^ 0x73612762, 5)).concat("6 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36"));
    }

    public static Object khrz(String string, Object object, Class clazz) throws IOException {
        try {
            int n = 431794811;
            n = Integer.rotateLeft(n * -1543654263, 21) ^ 0x943422E7;
            Object object2 = object;
            n = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 18);
            Class clazz2 = clazz;
            n = Integer.rotateLeft((clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n, 16);
            int n2 = n ^ 0xAF6185F6;
            if ((n2 ^ n) != -1352563210) {
                int cfr_ignored_0 = (0xB6DD2F8D ^ n) - 439150777;
            }
            if ((0x12C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        bhf bhf2 = sha_6.zdz_2(string, af.toJson(object), Map.of(sha_6.zkk_2("輧鿢汴볗춭\uda3f⪊笪௸ᡌ㦎", 0xD4B3326A ^ 0x5471937D, 0x215B92A8 ^ 0x7881D95C, sha_6.dhrb(0x6C2B12BC ^ 0x3F46C7BE, 24)), "applicat".concat("ion/json")));
        return af.fromJson(bhf2.rdsh_2, clazz);
    }

    public static bfm zlf(String string, Object object, Class clazz, Class clazz2) throws IOException {
        int n = -1912913819;
        n = Integer.rotateLeft(n * 1988037633, 24) ^ 0x59F8AC55;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        Class clazz3 = clazz;
        n = Integer.rotateRight((clazz3 != null ? System.identityHashCode(clazz3) : 0) ^ n, 22);
        int n2 = n ^ 0x56EF6B2C;
        if ((n2 ^ n) != 1458531116) {
            int cfr_ignored_0 = (0xDB142B49 ^ n) + 1012680962;
        }
        bhf bhf2 = sha_6.sksh(string, af.toJson(object), sha_6.zfth_2(sha_6.tnh_3("ᗽԸ☍", 458980865 - -527696650, sha_6.tjm(-1175720578) ^ 0x1E272ED9, 0xAE3C6865 ^ 0xB3897FB5).concat("ent-Type"), "application/json"));
        if (bhf2.hbth == 796483713 + -796483513) {
            return new bfm(sha_6.rghy(af, bhf2.rdsh_2, clazz), null);
        }
        return new bfm(null, sha_6.tzh_4(af, bhf2.rdsh_2, clazz2));
    }

    private static String tnh_3(String string, int n, int n2, int n3) {
        int n4 = aa.bjb(-525448443);
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateRight(n ^ n4, 22)) ^ 0x4AD5407D;
        if ((n5 ^ n4) != 1255489661) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xAA7B0B78 ^ n4, 8) + -1455160637) * -1434776711;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x58B00704 ^ n2 - i) + shghgh, 20) ^ nt_3 + i * 2114264937));
        }
        return new String(cArray);
    }

    private static int bhth_2(int n, int n2) {
        block0: {
            int n3 = aa.bjb(-583568308);
            int n4 = (n3 = n2 ^ n3) ^ 0xDB54A44C;
            if ((n4 ^ n3) == -615209908) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x663D000 ^ n3, 3) + -898379973;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static void khmt(HttpURLConnection httpURLConnection, boolean bl) {
        int n = -327526365;
        n = Integer.rotateLeft(n * -146794467, 10) ^ 0x962C738E;
        HttpURLConnection httpURLConnection2 = httpURLConnection;
        n = (httpURLConnection2 != null ? System.identityHashCode(httpURLConnection2) : 0) ^ n;
        int n2 = n ^ 0xD5497E1D;
        if ((n2 ^ n) != -716603875) {
            int cfr_ignored_0 = (0x3933263E ^ n) + 1910583440;
        }
        httpURLConnection.setInstanceFollowRedirects(bl);
    }

    private static void hj(DataOutputStream dataOutputStream, String string) {
        int n = 1175740524;
        n = Integer.rotateLeft(n * 1083866099, 24) ^ 0x24AF5A89;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 2);
        int n2 = n ^ 0xC7DAB9B8;
        if ((n2 ^ n) != -941966920) {
            int cfr_ignored_0 = (0x81CED9D4 ^ n) + -1170094438;
        }
        dataOutputStream.writeBytes(string);
    }

    private static void shthgh(DataOutputStream dataOutputStream) {
        int n = -128077793;
        int n2 = (n = Integer.rotateLeft(n * 1247413765, 25) ^ 0xF648942F) ^ 0xA1853CB8;
        if ((n2 ^ n) != -1585103688) {
            int cfr_ignored_0 = (0x59D88CA7 ^ n) + 1116698154;
        }
        dataOutputStream.close();
    }

    private static void aqn() {
        int n = aa.bjb(389606851);
        int n2 = n ^ 0x8FF569D0;
        if ((n2 ^ n) != -1879742000) {
            int cfr_ignored_0 = (Integer.rotateRight(0x98CD8413 ^ n, 6) + -2059362936) * -1731361773;
        }
        yf.athz_2();
    }

    private static InputStream tms_3(HttpURLConnection httpURLConnection) {
        block0: {
            int n = aa.bjb(1855503968);
            HttpURLConnection httpURLConnection2 = httpURLConnection;
            n = (httpURLConnection2 != null ? System.identityHashCode(httpURLConnection2) : 0) ^ n;
            int n2 = n ^ 0x57FFE6DE;
            if ((n2 ^ n) == 1476388574) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x396758BE ^ n, 10) - -136225219) * 963074239;
        }
        return httpURLConnection.getInputStream();
    }

    private static void abh() {
        int n = -1431050936;
        int n2 = (n = Integer.rotateLeft(n * 1201233937, 18) ^ 0x1324E5AA) ^ 0x6085ABDB;
        if ((n2 ^ n) != 1619373019) {
            int cfr_ignored_0 = (0xCA364E93 ^ n) - -1344754064;
        }
        yf.athz_2();
    }

    private static String thts_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1715907517;
            n4 = Integer.rotateLeft(n4 * 2029496855, 6) ^ 0x3327CF40;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 24);
            int n5 = (n4 = n2 ^ n4) ^ 0xDD8325C0;
            if ((n5 ^ n4) == -578607680) break block0;
            int cfr_ignored_0 = (0xBBC58E7D ^ n4) - 648319774;
        }
        return sha_6.tnh_3(string, n, n2, n3);
    }

    private static String ghsa_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = aa.bjb(226839246);
            n4 = n ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x33939052;
            if ((n5 ^ n4) == 865308754) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x3E16DA9C ^ n4, 10) - -1994254305) * 1041685149;
        }
        return sha_6.tnh_3(string, n, n2, n3);
    }

    private static int dshd_4(int n, int n2) {
        block0: {
            int n3 = 2129638362;
            n3 = Integer.rotateLeft(n3 * 411832655, 11) ^ 0x63BB44EA;
            int n4 = (n3 = Integer.rotateRight(n ^ n3, 6)) ^ 0xF504BD13;
            if ((n4 ^ n3) == -184238829) break block0;
            int cfr_ignored_0 = (0x8BEB0EC9 ^ n3) + 183698107;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String tma_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 737817806;
            n4 = Integer.rotateLeft(n4 * 1735301973, 7) ^ 0xD3C5E597;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 24);
            int n5 = (n4 = n ^ n4) ^ 0xB1B2F6F3;
            if ((n5 ^ n4) == -1313671437) break block0;
            int cfr_ignored_0 = (0x9A48C23D ^ n4) - -973513946;
        }
        return sha_6.tnh_3(string, n, n2, n3);
    }

    private static String ryz_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -626231844;
            n4 = Integer.rotateLeft(n4 * -1507621071, 9) ^ 0x63808C3D;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 9);
            int n5 = (n4 = n2 ^ n4) ^ 0x27A28614;
            if ((n5 ^ n4) == 664962580) break block0;
            int cfr_ignored_0 = (0xFD0EF3C8 ^ n4) - 1614140924;
        }
        return sha_6.tnh_3(string, n, n2, n3);
    }

    private static int dhrb(int n, int n2) {
        block0: {
            int n3 = aa.bjb(862853738);
            int n4 = (n3 = Integer.rotateRight(n ^ n3, 18)) ^ 0x95EB421A;
            if ((n4 ^ n3) == -1779744230) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xA6855870 ^ n3, 7) + 780358859) * -1501210511;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String zkk_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = aa.bjb(-1542511916);
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 24);
            int n5 = (n4 = n2 ^ n4) ^ 0x6F3E75CA;
            if ((n5 ^ n4) == 1866364362) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xCB31571E ^ n4, 12) - -1621677091) * -885958881;
        }
        return sha_6.tnh_3(string, n, n2, n3);
    }

    private static bhf zdz_2(String string, String string2, Map map) {
        block0: {
            int n = -1161076668;
            n = Integer.rotateLeft(n * 1969269391, 26) ^ 0x1C652AEF;
            String string3 = string;
            n = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 14);
            String string4 = string2;
            n = Integer.rotateLeft((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 21);
            int n2 = n ^ 0x9377341D;
            if ((n2 ^ n) == -1820904419) break block0;
            int cfr_ignored_0 = (0x29BC5459 ^ n) + 213808857;
        }
        return sha_6.hzd_4(string, string2, map);
    }

    private static int tjm(int n) {
        block0: {
            int n2 = aa.bjb(-1133223872);
            int n3 = n2 ^ 0x698DCE1E;
            if ((n3 ^ n2) == 1770901022) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xD5F9AE5E ^ n2, 13) - -308691811) * -705057185;
        }
        return Integer.reverse(n);
    }

    private static String brk(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1149311965;
            n4 = Integer.rotateLeft(n4 * -394274891, 28) ^ 0x6667EC2F;
            int n5 = (n4 = n3 ^ n4) ^ 0x3BF7309C;
            if ((n5 ^ n4) == 1006055580) break block0;
            int cfr_ignored_0 = (0x8089D4BF ^ n4) + 1742258391;
        }
        return sha_6.tnh_3(string, n, n2, n3);
    }

    private static Map zfth_2(Object object, Object object2) {
        block0: {
            int n = 1021091537;
            int n2 = (n = Integer.rotateLeft(n * 11854867, 14) ^ 0xA7E349BA) ^ 0xA1DFD81A;
            if ((n2 ^ n) == -1579165670) break block0;
            int cfr_ignored_0 = (0x9D0346CB ^ n) - -1849466738;
        }
        return Map.of(object, object2);
    }

    private static bhf sksh(String string, String string2, Map map) {
        block0: {
            int n = -1621317658;
            n = Integer.rotateLeft(n * -74221951, 27) ^ 0xFDE5504D;
            Map map2 = map;
            n = (map2 != null ? System.identityHashCode(map2) : 0) ^ n;
            int n2 = n ^ 0x1E5B6EF8;
            if ((n2 ^ n) == 509308664) break block0;
            int cfr_ignored_0 = (0x8107C91E ^ n) + 1634885668;
        }
        return sha_6.hzd_4(string, string2, map);
    }

    private static Object rghy(Gson gson, String string, Class clazz) {
        block0: {
            int n = -689431249;
            n = Integer.rotateLeft(n * -573510213, 27) ^ 0x5A34CE8A;
            Class clazz2 = clazz;
            n = (clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n;
            int n2 = n ^ 0x23AD21DD;
            if ((n2 ^ n) == 598548957) break block0;
            int cfr_ignored_0 = (0xF5453CF2 ^ n) + -799247244;
        }
        return gson.fromJson(string, clazz);
    }

    private static Object tzh_4(Gson gson, String string, Class clazz) {
        block0: {
            int n = aa.bjb(-709941476);
            Gson gson2 = gson;
            n = Integer.rotateRight((gson2 != null ? System.identityHashCode(gson2) : 0) ^ n, 27);
            int n2 = n ^ 0x54C4ADD1;
            if ((n2 ^ n) == 1422175697) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x816B8ACD ^ n, 3) - -1335661042;
            int cfr_ignored_1 = (int)(0x43D924F027D4EB4FL ^ (long)n ^ 0xB490831A2DB92A63L);
        }
        return gson.fromJson(string, clazz);
    }

    private static String[] fr(String string) {
        int n = aa.bjb(1450274290);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xA9A60DEE;
        if ((n2 ^ n) != -1448735250) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xFFD7601C ^ n, 18) - -9289057) * -2662371;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite szt_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1079075804;
            n3 = Integer.rotateLeft(n3 * 1856335539, 26) ^ 0x7154F4FD;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 20);
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 12);
            int n4 = n3 ^ 0xB001BD1C;
            if ((n4 ^ n3) != -1342063332) {
                int cfr_ignored_0 = (0xFAF2138 ^ n3) - -1944367417;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ sdhd ^ string.hashCode() ^ n2 + dqth + i * -757318277) + sdhd) ^ dqth));
            }
            String[] stringArray = sha_6.fr(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] eg2rd0v06skhz(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite dbdwvqhzra14y(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ z0b8i9z ^ string.hashCode()) + (n2 + xe7n6g9) + i ^ z0b8i9z, 21) + xe7n6g9);
            }
            String[] stringArray = sha_6.eg2rd0v06skhz(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

