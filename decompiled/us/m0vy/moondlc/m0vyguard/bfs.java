/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.minecraft.class_320
 *  net.minecraft.class_320$class_321
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Optional;
import java.util.UUID;
import net.minecraft.class_320;
import us.m0vy.moondlc.m0vyguard.bhdh;
import us.m0vy.moondlc.m0vyguard.bsa;
import us.m0vy.moondlc.m0vyguard.bhb_2;
import us.m0vy.moondlc.m0vyguard.tty;
import us.m0vy.moondlc.m0vyguard.tthn;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tdhl;
import us.m0vy.moondlc.m0vyguard.dj;
import us.m0vy.moondlc.m0vyguard.hw_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tty(name="client")
public class bfs
extends bsa
implements tthy {
    private static final int rhd_4 = -864217575;
    private static final int sss_3 = 447359761;
    private static final int bah_3 = -2146067036;
    private static final int khfdh = -768889997;
    private static final int vq15o24 = -1178529384;
    private static final int pp74f0qiqojwf = 296799771;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int id5dd2ca;

    @Override
    public void znsh() {
        int n = 1523601680;
        n = Integer.rotateLeft(n * 1414059765, 12) ^ 0x4D9C40B0;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xD9ED97DC;
        if ((n2 ^ n) != -638740516) {
            int cfr_ignored_0 = (0x833DC6CC ^ n) - 504109640;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(bfs.rqt_2("᥸┫懃궎㓱炃뽑", bfs.khtr_2(1272249002) ^ 0x136C7F53, -1397936542 - -1891855135, -1466713027 + 1633622975), mc.method_1548().method_1676());
        bfs.swkh(jsonObject, bfs.jdw_2("淓冚ᕩ\ud93b鲅", -1475660541 - -680541296, 29861314 - -543434103, bfs.dhln(-127849595) ^ 0xA82651E3), bfs.htk(Moondlc.getInstance().getThemeManager().zskh_2()));
        jsonObject.addProperty(bfs.rqt_2("舥빲瀞㛂獻꾰", bfs.khhr_2(0xBF998F38 ^ 0x4393762C, 3), Integer.reverse(1170893617) ^ 0xB2215FB0, 0x61160855 ^ 0x68E4DFA9), bfs.zshd_3(bfs.aadh(Moondlc.getInstance())));
        jsonObject.add("hudElements", (JsonElement)bfs.zbkh(this));
        jsonObject.add("colorPickerPresets", (JsonElement)this.thmh_2());
        String string = bhdh.khsb().dhth_3();
        if (string != null) {
            bfs.ashq(jsonObject, "lastConfig", string);
        }
        try {
            FileWriter fileWriter = new FileWriter(this.khth);
            try {
                fileWriter.write(bfs.thwy(dj.khds_3, (JsonElement)jsonObject));
            }
            catch (Throwable throwable) {
                try {
                    fileWriter.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            bfs.srw(fileWriter);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void khwsh() {
        try {
            int n = 844832945;
            n = Integer.rotateLeft(n * 590114349, 16) ^ 0xC3A15722;
            int n2 = n ^ 0x74FC79CF;
            if ((n2 ^ n) != 1962703311) {
                int cfr_ignored_0 = (0x46A7597E ^ n) - 945694626;
            }
            if (!yf.khdha_2()) {
                yf.athz_2();
            }
            try (FileReader fileReader = new FileReader(this.hwj());){
                String string;
                JsonObject jsonObject = (JsonObject)dj.khds_3.fromJson((Reader)fileReader, JsonObject.class);
                if (jsonObject.has("username")) {
                    string = bfs.zkhq(jsonObject, "username").getAsString();
                    new class_320(string, UUID.randomUUID(), "", Optional.empty(), Optional.empty(), class_320.class_321.field_1988);
                }
                if (bfs.rzt(jsonObject, "theme")) {
                    string = jsonObject.get("theme").getAsString();
                    try {
                        tthn tthn2 = bfs.dhhh_4(string);
                        Moondlc.getInstance().getThemeManager().hrs(tthn2);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        bfs.sht_2(Moondlc.getInstance()).hrs(tthn.jthj);
                    }
                }
                if (jsonObject.has("prefix")) {
                    bfs.tsa_8(Moondlc.getInstance()).zsd_4(jsonObject.get("prefix").getAsString());
                }
                if (jsonObject.has("colorPickerPresets")) {
                    this.sdf_4(jsonObject.getAsJsonArray("colorPickerPresets"));
                }
                if (bfs.rbdh(jsonObject, bfs.rqt_2("첰됄硙㷘ꕑ檃⸺퉮", bfs.dldh_2(0x8A6AE603 ^ 0xD4DF14EC, 9), -906618072 + 1209678097, 1983715333 - 928844512))) {
                    string = jsonObject.get(bfs.dbn_2("歚圂Ꮾ\udfb3騲䛄ʻ쵩觐疄", Integer.reverse(1199020764) ^ 0x5A84CA13, -719946296 - 459057597, bfs.zfd_3(0x4480598 ^ 0xBC4B4CD7, 26))).getAsString();
                    if (bhdh.khsb().ard(string)) {
                        bhdh.khsb().rzs_4(string);
                    }
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private JsonArray rsht() {
        int n = -1155109421;
        int n2 = (n = Integer.rotateLeft(n * -1562939785, 8) ^ 0xFEBD1447) ^ 0x1352AE07;
        if ((n2 ^ n) != 324185607) {
            int cfr_ignored_0 = (0xA874C3D4 ^ n) - 723648361;
        }
        return new JsonArray();
    }

    private JsonArray thmh_2() {
        int n = -624823164;
        n = Integer.rotateLeft(n * 732866231, 10) ^ 0x6408238;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 11);
        int n2 = n ^ 0x1E002D49;
        if ((n2 ^ n) != 503328073) {
            int cfr_ignored_0 = (0xC4C1D9CD ^ n) + 937489967;
        }
        return new JsonArray();
    }

    private void sdf_4(JsonArray jsonArray) {
        block0: {
            int n = -402408134;
            n = Integer.rotateLeft(n * -674773077, 16) ^ 0xE5089915;
            JsonArray jsonArray2 = jsonArray;
            n = Integer.rotateLeft((jsonArray2 != null ? System.identityHashCode(jsonArray2) : 0) ^ n, 5);
            int n2 = n ^ 0xE5361A0;
            if ((n2 ^ n) == 240345504) break block0;
            int cfr_ignored_0 = (0xE650DC9A ^ n) + -1133112377;
        }
    }

    private static String rqt_2(String string, int n, int n2, int n3) {
        int n4 = 552023019;
        n4 = Integer.rotateLeft(n4 * -362302349, 28) ^ 0xE3CEE505;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateRight(n ^ n4, 28)) ^ 0xC4F054B1;
        if ((n5 ^ n4) != -990882639) {
            int cfr_ignored_0 = (0xE417675A ^ n4) - 2056862308;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x5F44FFC4 ^ n2 ^ i * 1581990853 ^ rhd_4, 4) ^ sss_3));
        }
        return new String(cArray);
    }

    private static int khtr_2(int n) {
        block0: {
            int n2 = -1358379222;
            n2 = Integer.rotateLeft(n2 * 1436112263, 25) ^ 0xE24902D3;
            int n3 = (n2 = n ^ n2) ^ 0x5E8018A6;
            if ((n3 ^ n2) == 1585453222) break block0;
            int cfr_ignored_0 = (0xF188DF8C ^ n2) - -729492671;
        }
        return Integer.reverse(n);
    }

    private static int dhln(int n) {
        block0: {
            int n2 = bhb_2.hakh_2(-1094229306);
            int n3 = (n2 = n ^ n2) ^ 0xC952B7D5;
            if ((n3 ^ n2) == -917325867) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x7795D513 ^ n2, 17) + 2139253896) * 2006308115;
        }
        return Integer.reverse(n);
    }

    private static String jdw_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bhb_2.hakh_2(223339983);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = n4 ^ 0xE7C50615;
            if ((n5 ^ n4) == -406518251) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xEA8AE3DA ^ n4, 16) + 1798256289) * -359996453;
        }
        return bfs.rqt_2(string, n, n2, n3);
    }

    private static String htk(tthn tthn2) {
        block0: {
            int n = -1706112033;
            n = Integer.rotateLeft(n * -377677775, 14) ^ 0xA26A9A73;
            tthn tthn3 = tthn2;
            n = Integer.rotateLeft((tthn3 != null ? System.identityHashCode(tthn3) : 0) ^ n, 19);
            int n2 = n ^ 0x7FB56170;
            if ((n2 ^ n) == 2142593392) break block0;
            int cfr_ignored_0 = (0xE5FBAAAF ^ n) + 1600412088;
        }
        return tthn2.name();
    }

    private static void swkh(JsonObject jsonObject, String string, String string2) {
        int n = 1122923195;
        n = Integer.rotateLeft(n * 1955562521, 9) ^ 0xA67F35C9;
        JsonObject jsonObject2 = jsonObject;
        n = Integer.rotateLeft((jsonObject2 != null ? System.identityHashCode(jsonObject2) : 0) ^ n, 29);
        String string3 = string;
        n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
        int n2 = n ^ 0xFFDAE97E;
        if ((n2 ^ n) != -2430594) {
            int cfr_ignored_0 = (0xBD349BC5 ^ n) - 1880303207;
        }
        jsonObject.addProperty(string, string2);
    }

    private static int khhr_2(int n, int n2) {
        block0: {
            int n3 = -1554030591;
            int n4 = (n3 = Integer.rotateLeft(n3 * -847375151, 25) ^ 0x2431DC99) ^ 0x9AB26CBD;
            if ((n4 ^ n3) == -1699582787) break block0;
            int cfr_ignored_0 = (0x39ED0CBC ^ n3) - -1535374019;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static hw_2 aadh(Moondlc moondlc) {
        block0: {
            int n = 1264106565;
            int n2 = (n = Integer.rotateLeft(n * -577626553, 11) ^ 0xF3383431) ^ 0x5F3834AF;
            if ((n2 ^ n) == 1597519023) break block0;
            int cfr_ignored_0 = (0x146088EA ^ n) + 163399962;
        }
        return moondlc.getCommandManager();
    }

    private static String zshd_3(hw_2 hw2) {
        block0: {
            int n = bhb_2.hakh_2(-1429679049);
            hw_2 hw3 = hw2;
            n = (hw3 != null ? System.identityHashCode(hw3) : 0) ^ n;
            int n2 = n ^ 0x7EE0049B;
            if ((n2 ^ n) == 2128610459) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xD428D0AC ^ n, 13) - -1253121009;
        }
        return hw2.sam();
    }

    private static JsonArray zbkh(bfs bfs2) {
        block0: {
            int n = bhb_2.hakh_2(-352931655);
            int n2 = n ^ 0x831A009A;
            if ((n2 ^ n) == -2095447910) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x69ECB023 ^ n, 16) + -670633096;
        }
        return bfs2.rsht();
    }

    private static String dzd_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -2043692418;
            n4 = Integer.rotateLeft(n4 * 1753248619, 25) ^ 0xBD00A6D0;
            int n5 = (n4 = n ^ n4) ^ 0xDA7E66FD;
            if ((n5 ^ n4) == -629250307) break block0;
            int cfr_ignored_0 = (0x5C51DC83 ^ n4) - 1426320580;
        }
        return bfs.rqt_2(string, n, n2, n3);
    }

    private static void ashq(JsonObject jsonObject, String string, String string2) {
        int n = -151109163;
        n = Integer.rotateLeft(n * -330108311, 23) ^ 0x4DD3667C;
        String string3 = string2;
        n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
        int n2 = n ^ 0x49D8F218;
        if ((n2 ^ n) != 1238954520) {
            int cfr_ignored_0 = (0xBF26B3CD ^ n) - 1327403564;
        }
        jsonObject.addProperty(string, string2);
    }

    private static String thwy(Gson gson, JsonElement jsonElement) {
        block0: {
            int n = -1697363733;
            n = Integer.rotateLeft(n * 1873935253, 3) ^ 0x99E5B6BD;
            JsonElement jsonElement2 = jsonElement;
            n = Integer.rotateRight((jsonElement2 != null ? System.identityHashCode(jsonElement2) : 0) ^ n, 5);
            int n2 = n ^ 0x4B973982;
            if ((n2 ^ n) == 1268201858) break block0;
            int cfr_ignored_0 = (0xD1437169 ^ n) + -109467558;
        }
        return gson.toJson(jsonElement);
    }

    private static void srw(FileWriter fileWriter) {
        int n = bhb_2.hakh_2(573926126);
        int n2 = n ^ 0x6440AED8;
        if ((n2 ^ n) != 1681960664) {
            int cfr_ignored_0 = (Integer.rotateRight(0x4675C436 ^ n, 11) - -1935646267) * 1182123063;
        }
        fileWriter.close();
    }

    private static String ghsht_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1361271844;
            n4 = Integer.rotateLeft(n4 * 1095771377, 25) ^ 0xE4C0935B;
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 4)) ^ 0xB68B9EBA;
            if ((n5 ^ n4) == -1232363846) break block0;
            int cfr_ignored_0 = (0xE7A8C29E ^ n4) + -1494923228;
        }
        return bfs.rqt_2(string, n, n2, n3);
    }

    private static JsonElement zkhq(JsonObject jsonObject, String string) {
        block0: {
            int n = 416752905;
            n = Integer.rotateLeft(n * -981658861, 6) ^ 0x9FEA9784;
            JsonObject jsonObject2 = jsonObject;
            n = Integer.rotateRight((jsonObject2 != null ? System.identityHashCode(jsonObject2) : 0) ^ n, 19);
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 4);
            int n2 = n ^ 0xCEEE66FB;
            if ((n2 ^ n) == -823236869) break block0;
            int cfr_ignored_0 = (0xD63943F2 ^ n) + -1237448590;
        }
        return jsonObject.get(string);
    }

    private static boolean rzt(JsonObject jsonObject, String string) {
        block0: {
            int n = -1690267217;
            n = Integer.rotateLeft(n * -2058592581, 16) ^ 0xECB4E970;
            JsonObject jsonObject2 = jsonObject;
            n = Integer.rotateLeft((jsonObject2 != null ? System.identityHashCode(jsonObject2) : 0) ^ n, 15);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 29);
            int n2 = n ^ 0xE7C233BC;
            if ((n2 ^ n) == -406703172) break block0;
            int cfr_ignored_0 = (0x7C82A213 ^ n) - -1926985913;
        }
        return jsonObject.has(string);
    }

    private static tthn dhhh_4(String string) {
        block0: {
            int n = bhb_2.hakh_2(-274815934);
            int n2 = n ^ 0x99B10898;
            if ((n2 ^ n) == -1716451176) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x762FACDA ^ n, 17) + 1411616161) * 1982835931;
        }
        return tthn.valueOf(string);
    }

    private static tdhl sht_2(Moondlc moondlc) {
        block0: {
            int n = -344538642;
            n = Integer.rotateLeft(n * -1104727767, 27) ^ 0x867D68DE;
            Moondlc moondlc2 = moondlc;
            n = (moondlc2 != null ? System.identityHashCode(moondlc2) : 0) ^ n;
            int n2 = n ^ 0xA9A19980;
            if ((n2 ^ n) == -1449027200) break block0;
            int cfr_ignored_0 = (0x42D7586E ^ n) - 1995060838;
        }
        return moondlc.getThemeManager();
    }

    private static hw_2 tsa_8(Moondlc moondlc) {
        block0: {
            int n = 2011478447;
            n = Integer.rotateLeft(n * -1649437437, 22) ^ 0xAB6C5182;
            Moondlc moondlc2 = moondlc;
            n = Integer.rotateRight((moondlc2 != null ? System.identityHashCode(moondlc2) : 0) ^ n, 23);
            int n2 = n ^ 0xA3516633;
            if ((n2 ^ n) == -1554946509) break block0;
            int cfr_ignored_0 = (0xD4B5DF9C ^ n) + 523241505;
        }
        return moondlc.getCommandManager();
    }

    private static String ghzz_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -244698199;
            n4 = Integer.rotateLeft(n4 * -824484947, 23) ^ 0x9C1A3005;
            n4 = Integer.rotateLeft(n ^ n4, 16);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 5)) ^ 0xAE6EC2DB;
            if ((n5 ^ n4) == -1368472869) break block0;
            int cfr_ignored_0 = (0x5F04F172 ^ n4) - 348742387;
        }
        return bfs.rqt_2(string, n, n2, n3);
    }

    private static String thtr(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1579934842;
            n4 = Integer.rotateLeft(n4 * -1991077785, 19) ^ 0x35F19155;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 23)) ^ 0xB79741B9;
            if ((n5 ^ n4) == -1214824007) break block0;
            int cfr_ignored_0 = (0xE9BCA5C3 ^ n4) - -1974320830;
        }
        return bfs.rqt_2(string, n, n2, n3);
    }

    private static int dldh_2(int n, int n2) {
        block0: {
            int n3 = -582814086;
            n3 = Integer.rotateLeft(n3 * 1508281547, 6) ^ 0x2EAA03D6;
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 8)) ^ 0x823DDC36;
            if ((n4 ^ n3) == -2109875146) break block0;
            int cfr_ignored_0 = (0x5F7F2A4C ^ n3) - -1602165549;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static boolean rbdh(JsonObject jsonObject, String string) {
        block0: {
            int n = -1952634692;
            int n2 = (n = Integer.rotateLeft(n * 2711341, 11) ^ 0xEC380EC2) ^ 0xF761E1A3;
            if ((n2 ^ n) == -144580189) break block0;
            int cfr_ignored_0 = (0x7CFCC91F ^ n) - 129530629;
        }
        return jsonObject.has(string);
    }

    private static int zfd_3(int n, int n2) {
        block0: {
            int n3 = -1143372272;
            n3 = Integer.rotateLeft(n3 * -1684558239, 7) ^ 0x7E317386;
            n3 = n ^ n3;
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 8)) ^ 0xC73F2BDE;
            if ((n4 ^ n3) == -952161314) break block0;
            int cfr_ignored_0 = (0x7CE6ADCE ^ n3) + 1017601321;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String dbn_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bhb_2.hakh_2(516289658);
            n4 = Integer.rotateRight(n ^ n4, 14);
            int n5 = (n4 = n2 ^ n4) ^ 0x6AD210BB;
            if ((n5 ^ n4) == 1792151739) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x7417E4C1 ^ n4, 17) + 323113626;
            int cfr_ignored_1 = (int)(0xB6A54AFC27D4EB4FL ^ (long)n4 ^ 0x6888831A2DB8C09BL);
        }
        return bfs.rqt_2(string, n, n2, n3);
    }

    private static String[] blh_2(String string) {
        int n = -1548627018;
        n = Integer.rotateLeft(n * 1561006227, 13) ^ 0xCCB09A7F;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 16);
        int n2 = n ^ 0x34A8F02E;
        if ((n2 ^ n) != 883486766) {
            int cfr_ignored_0 = (0x97192398 ^ n) - 2124081030;
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

    private static CallSite tath(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -14062396;
            n3 = Integer.rotateLeft(n3 * 1492723047, 28) ^ 0x9F3BAB13;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            String string4 = string2;
            n3 = (string4 != null ? System.identityHashCode(string4) : 0) ^ n3;
            int n4 = n3 ^ 0x98E842A4;
            if ((n4 ^ n3) != -1729609052) {
                int cfr_ignored_0 = (0x67C12E60 ^ n3) + 1165925432;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ bah_3 ^ string.hashCode() ^ n2 + khfdh + i * 1713696439) + bah_3) ^ khfdh));
            }
            String[] stringArray = bfs.blh_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] cw7uilqkdv(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite k097gmawbr6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ vq15o24 ^ string.hashCode()) + (n2 + pp74f0qiqojwf) + i ^ vq15o24, 21) + pp74f0qiqojwf);
            }
            String[] stringArray = bfs.cw7uilqkdv(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

