/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_5250
 *  net.minecraft.class_7417
 *  net.minecraft.class_8828$class_2585
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_5250;
import net.minecraft.class_7417;
import net.minecraft.class_8828;
import us.m0vy.moondlc.m0vyguard.bfw;
import us.m0vy.moondlc.m0vyguard.tbh_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class dh_2 {
    private static final int shkl = 82651097;
    private static final int sash = -1836915230;
    private static final int shmh = -971296466;
    private static final int dhtd = -945980198;
    private static final int d861p2eujsvb = -1671569820;
    private static final int mk2ew72y5ar7 = -1588653938;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int r0ud86w2;

    public static class_2561 zna_2(class_2561 class_25612, String string, String string2) {
        if (class_25612 != null && string != null && string2 != null) {
            class_5250 class_52502 = class_2561.method_43473().method_10862(class_25612.method_10866());
            dh_2.rha(class_52502, class_25612, string, string2);
            return class_52502;
        }
        return class_25612;
    }

    private static void rha(class_5250 class_52502, class_2561 class_25612, String string, String string2) {
        class_7417 class_74172 = class_25612.method_10851();
        class_2583 class_25832 = class_25612.method_10866();
        if (class_74172 instanceof class_8828.class_2585) {
            class_8828.class_2585 class_25852 = (class_8828.class_2585)class_74172;
            Pattern pattern = Pattern.compile(Pattern.quote(string), 2);
            String string3 = pattern.matcher(class_25852.comp_737()).replaceAll(string2);
            class_52502.method_10852((class_2561)class_2561.method_43470((String)string3).method_10862(class_25832));
        }
        for (Pattern pattern : class_25612.method_10855()) {
            dh_2.rha(class_52502, (class_2561)pattern, string, string2);
        }
    }

    public static class_2561 btd_2(class_2561 class_25612, String string, String string2) {
        if (class_25612 == null) {
            return null;
        }
        String string3 = class_25612.getString();
        if (!string3.toLowerCase().contains(string.toLowerCase())) {
            return class_25612;
        }
        string3 = string3.replaceAll("(?i)" + Pattern.quote(string), string2);
        class_5250 class_52502 = class_2561.method_43473();
        List list = dh_2.th(class_25612);
        int n = 0;
        for (int i = 0; i < string3.length(); ++i) {
            class_2583 class_25832 = n < list.size() ? ((bfw)list.get((int)n)).dhnm : class_2583.field_24360;
            class_52502.method_10852((class_2561)class_2561.method_43470((String)String.valueOf(string3.charAt(i))).method_10862(class_25832));
            ++n;
        }
        return class_52502;
    }

    private static List th(class_2561 class_25612) {
        int n = -1944873054;
        int n2 = (n = Integer.rotateLeft(n * -1306005681, 23) ^ 0x380E1D02) ^ 0x1C94B190;
        if ((n2 ^ n) != 479506832) {
            int cfr_ignored_0 = (0x90872632 ^ n) - -904110693;
        }
        ArrayList arrayList = new ArrayList();
        dh_2.jz_2(class_25612, arrayList);
        return arrayList;
    }

    private static void dhzk(class_2561 class_25612, List list) {
        int n = 740663986;
        n = Integer.rotateLeft(n * 1220646291, 3) ^ 0xA988A085;
        List list2 = list;
        n = Integer.rotateLeft((list2 != null ? System.identityHashCode(list2) : 0) ^ n, 4);
        int n2 = n ^ 0xDA47679A;
        if ((n2 ^ n) != -632854630) {
            int cfr_ignored_0 = (0xF662C528 ^ n) - 1483013957;
        }
        class_2583 class_25832 = class_25612.method_10866();
        class_7417 class_74172 = class_25612.method_10851();
        if (class_74172 instanceof class_8828.class_2585) {
            class_8828.class_2585 class_25852 = (class_8828.class_2585)class_74172;
            String string = class_25852.comp_737();
            for (int i = 0; i < dh_2.sgha(string); ++i) {
                list.add(new bfw(string.charAt(i), class_25832));
            }
        }
        for (String string : class_25612.method_10855()) {
            dh_2.dhzk((class_2561)string, list);
        }
    }

    public static String ddhz_4(String string) {
        String string2 = string.replaceAll("ę”—", String.valueOf(class_124.field_1078) + "MODER").replaceAll("ę”Ą", String.valueOf(class_124.field_1078) + "ST.MODER").replaceAll("ę”ˇ", String.valueOf(class_124.field_1076) + "MODER+").replaceAll("ę”€", String.valueOf(class_124.field_1080) + "PLAYER").replaceAll("ę”‰", String.valueOf(class_124.field_1054) + "HELPER").replaceAll("â—†", "@").replaceAll("â”", "|").replaceAll("ę”ł", String.valueOf(class_124.field_1075) + "ML.ADMIN");
        String string3 = String.valueOf(class_124.field_1061);
        return string2.replaceAll("ę”…", string3 + "Y" + String.valueOf(class_124.field_1068) + "T").replaceAll("ę”‚", String.valueOf(class_124.field_1078) + "D.MODER").replaceAll("ę• ", String.valueOf(class_124.field_1054) + "D.HELPER").replaceAll("ę•„", String.valueOf(class_124.field_1061) + "DRACULA").replaceAll("ę”–", String.valueOf(class_124.field_1075) + "OVERLORD").replaceAll("ę•", String.valueOf(class_124.field_1060) + "COBRA").replaceAll("ę”¨", String.valueOf(class_124.field_1076) + "DRAGON").replaceAll("ę”¤", String.valueOf(class_124.field_1061) + "IMPERATOR").replaceAll("ę” ", String.valueOf(class_124.field_1065) + "MAGISTER").replaceAll("ę”„", String.valueOf(class_124.field_1078) + "HERO").replaceAll("ę”’", String.valueOf(class_124.field_1060) + "AVENGER").replaceAll("ę•’", String.valueOf(class_124.field_1068) + "RABBIT").replaceAll("ę”", String.valueOf(class_124.field_1054) + "TITAN").replaceAll("ę•€", String.valueOf(class_124.field_1077) + "HYDRA").replaceAll("ę”¶", String.valueOf(class_124.field_1065) + "TIGER").replaceAll("ę”˛", String.valueOf(class_124.field_1064) + "BULL").replaceAll("ę•–", String.valueOf(class_124.field_1074) + "BUNNY").replaceAll("ę•—ę•", String.valueOf(class_124.field_1054) + "SPONSOR").replaceAll("\ud83d\udd25", "@").replaceAll("á´€", "A").replaceAll("Ę™", "B").replaceAll("á´„", "C").replaceAll("á´…", "D").replaceAll("á´‡", "E").replaceAll("Ň“", "F").replaceAll("É˘", "G").replaceAll("Ęś", "H").replaceAll("ÉŞ", "I").replaceAll("á´Š", "J").replaceAll("á´‹", "K").replaceAll("Ęź", "L").replaceAll("á´Ť", "M").replaceAll("É´", "N").replaceAll("ęś±", "S").replaceAll("á´Ź", "O").replaceAll("á´", "P").replaceAll("Ç«", "Q").replaceAll("Ę€", "R").replaceAll("á´›", "T").replaceAll("á´ś", "U").replaceAll("á´ ", "V").replaceAll("á´ˇ", "W").replaceAll("ęś°", "F").replaceAll("ĘŹ", "Y").replaceAll("á´˘", "Z");
    }

    public static class_2561 dhth_9(class_2561 class_25612) {
        if (class_25612.getString().contains("ę”—")) {
            class_25612 = dh_2.zna_2(class_25612, "ę”—", String.valueOf(class_124.field_1078) + "MODER");
        }
        if (class_25612.getString().contains("ę”Ą")) {
            class_25612 = dh_2.zna_2(class_25612, "ę”Ą", String.valueOf(class_124.field_1078) + "ST.MODER");
        }
        if (class_25612.getString().contains("ę”ˇ")) {
            class_25612 = dh_2.zna_2(class_25612, "ę”ˇ", String.valueOf(class_124.field_1076) + "MODER+");
        }
        if (class_25612.getString().contains("ę”€")) {
            class_25612 = dh_2.zna_2(class_25612, "ę”€", String.valueOf(class_124.field_1080) + "PLAYER");
        }
        if (class_25612.getString().contains("ę”‰")) {
            class_25612 = dh_2.zna_2(class_25612, "ę”‰", String.valueOf(class_124.field_1054) + "HELPER");
        }
        if (class_25612.getString().contains("â—†")) {
            class_25612 = dh_2.zna_2(class_25612, "â—†", "@");
        }
        if (class_25612.getString().contains("â”")) {
            class_25612 = dh_2.zna_2(class_25612, "â”", "|");
        }
        if (class_25612.getString().contains("ę”ł")) {
            class_25612 = dh_2.zna_2(class_25612, "ę”ł", String.valueOf(class_124.field_1075) + "ML.ADMIN");
        }
        if (class_25612.getString().contains("ę”…")) {
            String string = String.valueOf(class_124.field_1061);
            class_25612 = dh_2.zna_2(class_25612, "ę”…", string + "Y" + String.valueOf(class_124.field_1068) + "T");
        }
        if (class_25612.getString().contains("ę”‚")) {
            class_25612 = dh_2.zna_2(class_25612, "ę”‚", String.valueOf(class_124.field_1078) + "D.MODER");
        }
        if (class_25612.getString().contains("ę• ")) {
            class_25612 = dh_2.zna_2(class_25612, "ę• ", String.valueOf(class_124.field_1054) + "D.HELPER");
        }
        if (class_25612.getString().contains("ę•„")) {
            class_25612 = dh_2.zna_2(class_25612, "ę•„", String.valueOf(class_124.field_1061) + "DRACULA");
        }
        if (class_25612.getString().contains("ę”–")) {
            class_25612 = dh_2.zna_2(class_25612, "ę”–", String.valueOf(class_124.field_1075) + "OVERLORD");
        }
        if (class_25612.getString().contains("ę•")) {
            class_25612 = dh_2.zna_2(class_25612, "ę•", String.valueOf(class_124.field_1060) + "COBRA");
        }
        if (class_25612.getString().contains("ę”¨")) {
            class_25612 = dh_2.zna_2(class_25612, "ę”¨", String.valueOf(class_124.field_1076) + "DRAGON");
        }
        if (class_25612.getString().contains("ę”¤")) {
            class_25612 = dh_2.zna_2(class_25612, "ę”¤", String.valueOf(class_124.field_1061) + "IMPERATOR");
        }
        if (class_25612.getString().contains("ę” ")) {
            class_25612 = dh_2.zna_2(class_25612, "ę” ", String.valueOf(class_124.field_1065) + "MAGISTER");
        }
        if (class_25612.getString().contains("ę”„")) {
            class_25612 = dh_2.zna_2(class_25612, "ę”„", String.valueOf(class_124.field_1078) + "HERO");
        }
        if (class_25612.getString().contains("ę”’")) {
            class_25612 = dh_2.zna_2(class_25612, "ę”’", String.valueOf(class_124.field_1060) + "AVENGER");
        }
        if (class_25612.getString().contains("ę•’")) {
            class_25612 = dh_2.zna_2(class_25612, "ę•’", String.valueOf(class_124.field_1068) + "RABBIT");
        }
        if (class_25612.getString().contains("ę”")) {
            class_25612 = dh_2.zna_2(class_25612, "ę”", String.valueOf(class_124.field_1054) + "TITAN");
        }
        if (class_25612.getString().contains("ę•€")) {
            class_25612 = dh_2.zna_2(class_25612, "ę•€", String.valueOf(class_124.field_1077) + "HYDRA");
        }
        if (class_25612.getString().contains("ę”¶")) {
            class_25612 = dh_2.zna_2(class_25612, "ę”¶", String.valueOf(class_124.field_1065) + "TIGER");
        }
        if (class_25612.getString().contains("ę”˛")) {
            class_25612 = dh_2.zna_2(class_25612, "ę”˛", String.valueOf(class_124.field_1064) + "BULL");
        }
        if (class_25612.getString().contains("ę•–")) {
            class_25612 = dh_2.zna_2(class_25612, "ę•–", String.valueOf(class_124.field_1074) + "BUNNY");
        }
        if (class_25612.getString().contains("ę•—ę•")) {
            class_25612 = dh_2.zna_2(class_25612, "ę•—ę•", String.valueOf(class_124.field_1054) + "SPONSOR");
        }
        if (class_25612.getString().contains("\ud83d\udd25")) {
            class_25612 = dh_2.zna_2(class_25612, "\ud83d\udd25", "@");
        }
        if (class_25612.getString().contains("á´€")) {
            class_25612 = dh_2.zna_2(class_25612, "á´€", "A");
        }
        if (class_25612.getString().contains("Ę™")) {
            class_25612 = dh_2.zna_2(class_25612, "Ę™", "B");
        }
        if (class_25612.getString().contains("á´„")) {
            class_25612 = dh_2.zna_2(class_25612, "á´„", "C");
        }
        if (class_25612.getString().contains("á´…")) {
            class_25612 = dh_2.zna_2(class_25612, "á´…", "D");
        }
        if (class_25612.getString().contains("á´‡")) {
            class_25612 = dh_2.zna_2(class_25612, "á´‡", "E");
        }
        if (class_25612.getString().contains("Ň“")) {
            class_25612 = dh_2.zna_2(class_25612, "Ň“", "F");
        }
        if (class_25612.getString().contains("É˘")) {
            class_25612 = dh_2.zna_2(class_25612, "É˘", "G");
        }
        if (class_25612.getString().contains("Ęś")) {
            class_25612 = dh_2.zna_2(class_25612, "Ęś", "H");
        }
        if (class_25612.getString().contains("ÉŞ")) {
            class_25612 = dh_2.zna_2(class_25612, "ÉŞ", "I");
        }
        if (class_25612.getString().contains("á´Š")) {
            class_25612 = dh_2.zna_2(class_25612, "á´Š", "J");
        }
        if (class_25612.getString().contains("á´‹")) {
            class_25612 = dh_2.zna_2(class_25612, "á´‹", "K");
        }
        if (class_25612.getString().contains("Ęź")) {
            class_25612 = dh_2.zna_2(class_25612, "Ęź", "L");
        }
        if (class_25612.getString().contains("á´Ť")) {
            class_25612 = dh_2.zna_2(class_25612, "á´Ť", "M");
        }
        if (class_25612.getString().contains("É´")) {
            class_25612 = dh_2.zna_2(class_25612, "É´", "N");
        }
        if (class_25612.getString().contains("ęś±")) {
            class_25612 = dh_2.zna_2(class_25612, "ęś±", "S");
        }
        if (class_25612.getString().contains("á´Ź")) {
            class_25612 = dh_2.zna_2(class_25612, "á´Ź", "O");
        }
        if (class_25612.getString().contains("á´")) {
            class_25612 = dh_2.zna_2(class_25612, "á´", "P");
        }
        if (class_25612.getString().contains("Ç«")) {
            class_25612 = dh_2.zna_2(class_25612, "Ç«", "Q");
        }
        if (class_25612.getString().contains("Ę€")) {
            class_25612 = dh_2.zna_2(class_25612, "Ę€", "R");
        }
        if (class_25612.getString().contains("á´›")) {
            class_25612 = dh_2.zna_2(class_25612, "á´›", "T");
        }
        if (class_25612.getString().contains("á´ś")) {
            class_25612 = dh_2.zna_2(class_25612, "á´ś", "U");
        }
        if (class_25612.getString().contains("á´ ")) {
            class_25612 = dh_2.zna_2(class_25612, "á´ ", "V");
        }
        if (class_25612.getString().contains("á´ˇ")) {
            class_25612 = dh_2.zna_2(class_25612, "á´ˇ", "W");
        }
        if (class_25612.getString().contains("ęś°")) {
            class_25612 = dh_2.zna_2(class_25612, "ęś°", "F");
        }
        if (class_25612.getString().contains("ĘŹ")) {
            class_25612 = dh_2.zna_2(class_25612, "ĘŹ", "Y");
        }
        if (class_25612.getString().contains("á´˘")) {
            class_25612 = dh_2.zna_2(class_25612, "á´˘", "Z");
        }
        return class_25612;
    }

    public static String khdf(String string) {
        int n = 0;
        int n2 = 1017320014;
        n2 = Integer.rotateLeft(n2 * -126308665, 15) ^ 0x65872743;
        String string2 = string;
        n2 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n2, 25);
        int n3 = n2 - 981415088 + 855110366 - 855110366;
        block33: while (true) {
            switch (n2 - n3) {
                case -739125604: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x2F233E5E ^ n2, 8) - -1180554083) * 790838879;
                    return dh_2.dhzr_2(string.replace(dh_2.tnsh("㪌㪙", Integer.rotateLeft(0x89D1B4C3 ^ 0xC5C92FD0, 21), 1770005960 - -473243267, dh_2.aqgh(0xCFF4B63A ^ 0xC91C44C8, 2)), "q").replace("\u0143\u2020", "w").replace("\u0143\u0083", "e").replace("\u0110\u015f", dh_2.tnsh("\ud943", 457651915 + -1944090608, 658872501 - -1766153765, dh_2.bkhn(0xF113664B ^ 0xCDAFE7F1, 20))).replace("\u0110\u00b5", dh_2.dhmd("辢", Integer.rotateLeft(0x998AFD7A ^ 0xB900646, 18), Integer.rotateLeft(0x64B7AB9D ^ 0x91C49F6, 28), dh_2.bsf(232501750) ^ 0x742E1078)).replace("\u0110\u02dd", "y").replace("\u0110\u0142", "u").replace("\u0143\u0088", "i").replace(dh_2.adhz("灧儔", 0x27317F82 ^ 0x63FF081, -1470144007 + 1395598638, dh_2.dhqz(1935488779) ^ 0xCB4F7106), "o").replace("\u0110\u00b7", dh_2.tnsh("", -1170751534 + -820439893, dh_2.khfk(-1264159875) ^ 0xE0C115D, dh_2.ghaq(0x82D83817 ^ 0x38E48496, 28))).replace("\u0143\u2026", dh_2.hst_4("顯", Integer.reverse(-1490528559) ^ 0x4ED45CBA, Integer.rotateLeft(0xB07FC87B ^ 0xC04F3047, 24), dh_2.znf_2(-1859265924) ^ 0x25F87F41)).replace("\u0143\u0160", "]").replace("\u0143\u201e", "a").replace("\u0143\u2039", dh_2.dshth_2("宕", Integer.reverse(-1137999833) ^ 0xAED7A310, dh_2.dghy_2(-1994924633) ^ 0x8F68EA57, Integer.rotateLeft(0x451B771A ^ 0x94FE9317, 25))).replace(dh_2.tfl_2("䔹䛲", 0x65895512 ^ 0x92A72213, Integer.rotateLeft(0xC97E8F ^ 0x1A6CEC1B, 16), dh_2.dn_2(1153413454) ^ 0x692E36EA), "d").replace("\u0110\u00b0", "f").replace("\u0110\u017c", "g").replace("\u0143\u20ac", "h").replace(dh_2.tnsh("웮움", Integer.reverse(1209372800) ^ 0x7FB3DB5F, 2074301147 + -1802998717, dh_2.shdhd_2(0x45A56749 ^ 0x98BB3909, 29)), "j").replace(dh_2.tnsh("馚頱", dh_2.bna(693991147) ^ 0x40ABE7BB, 0x7A1138FF ^ 0x61904159, -831828121 - -1295547489), "k"), "\u0110\u00b4", dh_2.tnsh("췥", Integer.reverse(-2009111719) ^ 0xDF3BADC4, dh_2.dqr(-1955400445) ^ 0xB87D1258, dh_2.rtl(0x47E37784 ^ 0x8FF8D44F, 8))).replace(dh_2.tnsh("˄͢", -1682346169 - -1713985274, Integer.rotateLeft(0xC80BF1CA ^ 0x7EC72991, 19), dh_2.ttl_3(0x29CFCD91 ^ 0xDB3DCB79, 18)), ";").replace(dh_2.tnsh("", -312711428 + -1923871547, 1849426217 - -8429348, dh_2.shbth(206154891) ^ 0xCA9659F8), "'").replace("\u0143\u0179", "z").replace("\u0143\u2021", "x").replace("\u0143\u0081", "c").replace("\u0110\u013d", "v").replace("\u0110\u00b8", "b").replace("\u0143\u201a", "n").replace("\u0143\u015a", "m").replace("\u0110\u00b1", ",").replace("\u0143\u017d", ".").replace("\u0143\u2018", "`").replace("\u0110\u2122", "Q").replace("\u0110\u00a6", "W").replace("\u0110\u0141", "E").replace("\u0110\u0161", "R").replace("\u0110\u2022", "T").replace("\u0110\u0165", "Y").replace("\u0110\u201c", "U").replace("\u0110\u00a8", "I").replace("\u0110\u00a9", "O").replace("\u0110\u2014", "P").replace("\u0110\u0104", "{").replace("\u0110\u015e", "}").replace("\u0110\u00a4", "A").replace("\u0110\u00ab", "S").replace("\u0110\u2019", "D").replace("\u0110\u0090", "F").replace("\u0110\u017a", "G").replace("\u0110\u00a0", "H").replace("\u0110\u017e", "J").replace("\u0110\u203a", "K").replace("\u0110\u201d", "L").replace("\u0110\u2013", ":").replace("\u0110\u00ad", "\"").replace("\u0110\u017b", "Z").replace("\u0110\u00a7", "X").replace("\u0110\u02c7", "C").replace("\u0110\u015b", "V").replace("\u0110\u0098", "B").replace("\u0110\u02d8", "N").replace("\u0110\u00ac", "M").replace("\u0110\u2018", "<").replace("\u0110\u00ae", ">").replace("\u0110\u0081", "~");
                }
                case 2061758141: {
                    int cfr_ignored_1 = Integer.rotateLeft(0x109F8EA5 ^ n2, 5) - 128967990;
                    int cfr_ignored_2 = (int)(0xD22D209827D4EB4FL ^ (long)n2 ^ 0xBC40831A2DB8098BL);
                    yf.athz_2();
                    try {
                        ++n;
                        if ((0x706E9AA79690C57BL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = n2 - -739125604 + 1296269240 - 1296269240;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - -739125604));
                    }
                    --n;
                    continue block33;
                }
                case 981415088: {
                    int cfr_ignored_3 = Integer.rotateRight(0x2C6C5BAF ^ n2, 8) - 1702672748;
                    if (yf.khdha_2()) {
                        try {
                            --n;
                            if ((0xA62394E84EEC1B29L ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = (int)((long)(n2 - -739125604) ^ 0x8E6B2FF90F92AD71L ^ 0x8E6B2FF90F92AD71L);
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = (int)((long)(n2 - -739125604) ^ 0x22E8DD14D4938990L ^ 0x22E8DD14D4938990L);
                        }
                        n -= 3;
                        continue block33;
                    }
                    n3 = (int)((long)(n2 - -2023691408) ^ 0x81CBC98A1114C66EL ^ 0x81CBC98A1114C66EL);
                    int cfr_ignored_4 = (Integer.rotateLeft(0xF5FD93B9 ^ n2, 17) + -837647710) * -167930951;
                    int cfr_ignored_5 = (int)(0x374F3D8427D4EB4FL ^ (long)n2 ^ 0x8678831A2DB9C34FL);
                    n3 = n2 - 2061758141 ^ 0x7F29874 ^ 0x7F29874;
                    --n;
                    continue block33;
                }
                case 57014859: {
                    int cfr_ignored_6 = (Integer.rotateRight(0x950E6433 ^ n2, 5) + 287031656) * -1794218957;
                    n3 = n2 - -1285063559 ^ 0xAF09632E ^ 0xAF09632E;
                    int cfr_ignored_7 = Integer.rotateRight(0x484A41A6 ^ n2, 12) - -983854507;
                    try {
                        if ((0xA4CD2280402FB9D7L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 - 981415088));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - 981415088));
                    }
                    n -= 2;
                    continue block33;
                }
                case 1506292131: {
                    int cfr_ignored_8 = (Integer.rotateLeft(0xE9B655DD ^ n2, 16) - 1366426878) * -373926435;
                    int cfr_ignored_9 = (int)(0x2B04FBE027D4EB4FL ^ (long)n2 ^ 0xAB0831A2DB9FBD8L);
                    n3 = (int)((long)(n2 - -1202128065) ^ 0xD1F5C6FE12C3CEEDL ^ 0xD1F5C6FE12C3CEEDL);
                    int cfr_ignored_10 = (Integer.rotateLeft(0x299D2634 ^ n2, 8) - 241516423) * 698164789;
                    int cfr_ignored_11 = (int)(0xE89E7FA76592A1D9L ^ (long)n2 ^ 0x23E0796B8947CEDL);
                    n3 = n2 - 981415088 + 850249622 - 850249622;
                    continue block33;
                }
                case 1693848729: {
                    int cfr_ignored_12 = (Integer.rotateLeft(0xECED5C74 ^ n2, 16) - -1256468153) * -319988619;
                    n3 = n2 - 1120461230;
                    int cfr_ignored_13 = (Integer.rotateLeft(0xC5D40299 ^ n2, 11) + -116789310) * -975961447;
                    int cfr_ignored_14 = (int)(0x766ACA427D4EB4FL ^ (long)n2 ^ 0xA438831A2DB9A31CL);
                    try {
                        ++n;
                        if ((0x1538B0FC19E405L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = n2 - 981415088 ^ 0xFDF73E28 ^ 0xFDF73E28;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - 981415088));
                    }
                    continue block33;
                }
                case -245358501: {
                    int cfr_ignored_15 = (Integer.rotateLeft(0x954085DD ^ n2, 5) - 388879614) * -1790933539;
                    int cfr_ignored_16 = (int)(0x57F22BE027D4EB4FL ^ (long)n2 ^ 0xAAB0831A2DB90235L);
                    try {
                        ++n;
                        if ((0xD11E59C4345922B7L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (int)((long)(n2 - 981415088) ^ 0x443EE977C7B7DA64L ^ 0x443EE977C7B7DA64L);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 - 981415088;
                    }
                    n -= 3;
                    continue block33;
                }
                case 1011626800: {
                    int cfr_ignored_17 = Integer.rotateRight(0x15D866A6 ^ n2, 5) - -1450046123;
                    n3 = n2 - 1216363300 ^ 0x60BB1456 ^ 0x60BB1456;
                    int cfr_ignored_18 = Integer.rotateLeft(0x5C7CBEED ^ n2, 14) - 930659822;
                    int cfr_ignored_19 = (int)(0x9ECE10D027D4EB4FL ^ (long)n2 ^ 0xDCD0831A2DB8904DL);
                    try {
                        if ((0xCF86069D8E60D811L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (int)((long)(n2 - 981415088) ^ 0xA8F2C6F0BE542096L ^ 0xA8F2C6F0BE542096L);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)(n2 - 981415088) ^ 0xEEB06ED0DF32949FL ^ 0xEEB06ED0DF32949FL);
                    }
                    continue block33;
                }
                case -718333307: {
                    int cfr_ignored_20 = Integer.rotateRight(0x5C7902A6 ^ n2, 14) - 923070805;
                    try {
                        n += 3;
                        if ((0xBB07BA6AC761401BL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 - 981415088));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = n2 - 981415088;
                    }
                    continue block33;
                }
                case -226030165: {
                    int cfr_ignored_21 = (Integer.rotateLeft(0xF22D51BC ^ n2, 17) - 1473938687) * -231910979;
                    try {
                        ++n;
                        if ((0xB3C8B0C3B1F5FF9L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = n2 - 981415088 ^ 0xDF952D74 ^ 0xDF952D74;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 - 981415088 ^ 0xB50708B6 ^ 0xB50708B6;
                    }
                    n -= 5;
                    continue block33;
                }
                case -1879476874: {
                    int cfr_ignored_22 = (Integer.rotateRight(0xFD817A72 ^ n2, 18) + -1223986423) * -41846157;
                    n3 = n2 - 981415088 + 2117088523 - 2117088523;
                    n += 2;
                    continue block33;
                }
                case -981163270: {
                    int cfr_ignored_23 = (Integer.rotateLeft(0x8C641455 ^ n2, 4) - 75240838) * -1939598251;
                    int cfr_ignored_24 = (int)(0x4ED6BA6827D4EB4FL ^ (long)n2 ^ 0x89A0831A2DB9307CL);
                    n3 = Integer.reverse(Integer.reverse(n2 - 981415088));
                    int cfr_ignored_25 = Integer.rotateRight(0xB0B58942 ^ n2, 9) + 1784233529;
                    n -= 2;
                    continue block33;
                }
                case 340587892: {
                    int cfr_ignored_26 = (Integer.rotateLeft(0xC4DAE715 ^ n2, 11) - -622880058) * -992286955;
                    int cfr_ignored_27 = (int)(0x668492827D4EB4FL ^ (long)n2 ^ 0x6F20831A2DB9A101L);
                    n3 = n2 - -1792869471 ^ 0x8B91157D ^ 0x8B91157D;
                    int cfr_ignored_28 = (Integer.rotateLeft(0xABC85714 ^ n2, 8) - -778032473) * -1412933867;
                    try {
                        n -= 3;
                        if ((0x41485F284DD5E619L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = n2 - 981415088 ^ 0x443867B ^ 0x443867B;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)(n2 - 981415088) ^ 0x8B180AB6447D3526L ^ 0x8B180AB6447D3526L);
                    }
                    continue block33;
                }
            }
            int cfr_ignored_29 = (Integer.rotateLeft(0x6BD32DB0 ^ n2, 16) + 317728651) * 1809001905;
            n3 = n2 - 981415088 + -1279546118 - -1279546118;
        }
    }

    private static String tnsh(String string, int n, int n2, int n3) {
        int n4 = 93126827;
        n4 = Integer.rotateLeft(n4 * 1972602855, 19) ^ 0x88A31DB2;
        n4 = n ^ n4;
        int n5 = (n4 = n2 ^ n4) ^ 0x9E0437DE;
        if ((n5 ^ n4) != -1643890722) {
            int cfr_ignored_0 = (0x9B893775 ^ n4) - -637359647;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x394B0C99) + i ^ shkl, 14) ^ n2 + sash));
        }
        return new String(cArray);
    }

    private static void jz_2(class_2561 class_25612, List list) {
        int n = tbh_2.hab_2(1109934379);
        List list2 = list;
        n = (list2 != null ? System.identityHashCode(list2) : 0) ^ n;
        int n2 = n ^ 0x441D8E80;
        if ((n2 ^ n) != 1142787712) {
            int cfr_ignored_0 = Integer.rotateRight(0x635CFAB ^ n, 3) + -991836944;
        }
        dh_2.dhzk(class_25612, list);
    }

    private static int sgha(String string) {
        block0: {
            int n = 320553125;
            int n2 = (n = Integer.rotateLeft(n * 745546959, 6) ^ 0xA8ABE416) ^ 0xA2415245;
            if ((n2 ^ n) == -1572777403) break block0;
            int cfr_ignored_0 = (0xB15A12E0 ^ n) + 1463943950;
        }
        return string.length();
    }

    private static int aqgh(int n, int n2) {
        block0: {
            int n3 = -917709307;
            int n4 = (n3 = Integer.rotateLeft(n3 * 1424705327, 19) ^ 0x26520BFC) ^ 0xB2BA4AB1;
            if ((n4 ^ n3) == -1296414031) break block0;
            int cfr_ignored_0 = (0x7BF694B4 ^ n3) - -1512663147;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String dhfl(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1749439890;
            n4 = Integer.rotateLeft(n4 * 1320475863, 5) ^ 0xCC5D53FF;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 13);
            int n5 = (n4 = n ^ n4) ^ 0xDA2D396C;
            if ((n5 ^ n4) == -634570388) break block0;
            int cfr_ignored_0 = (0x4D949302 ^ n4) - -511093569;
        }
        return dh_2.tnsh(string, n, n2, n3);
    }

    private static String dhtf(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tbh_2.hab_2(-1551083442);
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 18)) ^ 0xAAAFEACF;
            if ((n5 ^ n4) == -1431311665) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x923B281 ^ n4, 4) + 531643610;
            int cfr_ignored_1 = (int)(0xCB911CBC27D4EB4FL ^ (long)n4 ^ 0xC408831A2DB83AF3L);
        }
        return dh_2.tnsh(string, n, n2, n3);
    }

    private static int bkhn(int n, int n2) {
        block0: {
            int n3 = 955739279;
            int n4 = (n3 = Integer.rotateLeft(n3 * -566119275, 5) ^ 0x822B6203) ^ 0x20B1380E;
            if ((n4 ^ n3) == 548485134) break block0;
            int cfr_ignored_0 = (0x18465481 ^ n3) + -861467704;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int bsf(int n) {
        block0: {
            int n2 = tbh_2.hab_2(72366532);
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 17)) ^ 0x789A2D4C;
            if ((n3 ^ n2) == 2023370060) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x7CCA1488 ^ n2, 18) + 550902707;
        }
        return Integer.reverse(n);
    }

    private static String dhmd(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tbh_2.hab_2(1856775577);
            n4 = Integer.rotateLeft(n ^ n4, 4);
            int n5 = (n4 = n3 ^ n4) ^ 0x3FEF1187;
            if ((n5 ^ n4) == 1072632199) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x5143341E ^ n4, 13) - -612307235) * 1363358751;
        }
        return dh_2.tnsh(string, n, n2, n3);
    }

    private static String bqk(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1972760901;
            n4 = Integer.rotateLeft(n4 * -1691245441, 6) ^ 0x36E1C184;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 4);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 4)) ^ 0xEEDE1A8F;
            if ((n5 ^ n4) == -287434097) break block0;
            int cfr_ignored_0 = (0x9B4BEBCA ^ n4) - 516642326;
        }
        return dh_2.tnsh(string, n, n2, n3);
    }

    private static int dhqz(int n) {
        block0: {
            int n2 = 46750596;
            int n3 = (n2 = Integer.rotateLeft(n2 * 932819597, 21) ^ 0x34661764) ^ 0x6B07A6A2;
            if ((n3 ^ n2) == 1795663522) break block0;
            int cfr_ignored_0 = (0x69CEFD26 ^ n2) - 1829976467;
        }
        return Integer.reverse(n);
    }

    private static String adhz(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1212566042;
            int n5 = (n4 = Integer.rotateLeft(n4 * -548019015, 15) ^ 0xF5954E70) ^ 0xD9C558CF;
            if ((n5 ^ n4) == -641378097) break block0;
            int cfr_ignored_0 = (0x918312D5 ^ n4) + -315067344;
        }
        return dh_2.tnsh(string, n, n2, n3);
    }

    private static String bshk(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 384619841;
            n4 = Integer.rotateLeft(n4 * -1330139499, 20) ^ 0x3EA03392;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 4);
            int n5 = (n4 = n ^ n4) ^ 0x2DE1BCA6;
            if ((n5 ^ n4) == 769768614) break block0;
            int cfr_ignored_0 = (0x3B0D69E7 ^ n4) + -1579491340;
        }
        return dh_2.tnsh(string, n, n2, n3);
    }

    private static String aqkh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1068473601;
            n4 = Integer.rotateLeft(n4 * 243316369, 19) ^ 0x85BD1309;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x6CC05E04;
            if ((n5 ^ n4) == 1824546308) break block0;
            int cfr_ignored_0 = (0xAC903CFB ^ n4) - -652921627;
        }
        return dh_2.tnsh(string, n, n2, n3);
    }

    private static int khfk(int n) {
        block0: {
            int n2 = -613446869;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1042920565, 19) ^ 0x232F279C) ^ 0xF8888DCE;
            if ((n3 ^ n2) == -125268530) break block0;
            int cfr_ignored_0 = (0x23E706E5 ^ n2) - -1119813852;
        }
        return Integer.reverse(n);
    }

    private static int ghaq(int n, int n2) {
        block0: {
            int n3 = 513942989;
            int n4 = (n3 = Integer.rotateLeft(n3 * 1854992631, 28) ^ 0x7912967C) ^ 0x6A6D191A;
            if ((n4 ^ n3) == 1785534746) break block0;
            int cfr_ignored_0 = (0x74CF3CD7 ^ n3) + -1145274408;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int znf_2(int n) {
        block0: {
            int n2 = 1872666509;
            n2 = Integer.rotateLeft(n2 * 1199369659, 14) ^ 0x94ADC188;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 12)) ^ 0x899CF3CC;
            if ((n3 ^ n2) == -1986202676) break block0;
            int cfr_ignored_0 = (0xE6026C41 ^ n2) + 1495085414;
        }
        return Integer.reverse(n);
    }

    private static String hst_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tbh_2.hab_2(1290654350);
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 28);
            int n5 = (n4 = n ^ n4) ^ 0xE0DE29D2;
            if ((n5 ^ n4) == -522311214) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xAC33FB5C ^ n4, 8) - -559345825) * -1405879459;
        }
        return dh_2.tnsh(string, n, n2, n3);
    }

    private static String lr(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -677192641;
            n4 = Integer.rotateLeft(n4 * 542032333, 3) ^ 0x502BAC9;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0x31F35781;
            if ((n5 ^ n4) == 838031233) break block0;
            int cfr_ignored_0 = (0xE6518BBE ^ n4) + -74879577;
        }
        return dh_2.tnsh(string, n, n2, n3);
    }

    private static int dghy_2(int n) {
        block0: {
            int n2 = tbh_2.hab_2(1156698678);
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 10)) ^ 0x50010031;
            if ((n3 ^ n2) == 1342242865) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x14F0D207 ^ n2, 5) - -1920528876;
        }
        return Integer.reverse(n);
    }

    private static String dshth_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tbh_2.hab_2(-1219405480);
            int n5 = n4 ^ 0x59DA1A7B;
            if ((n5 ^ n4) == 1507465851) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xEE8B4323 ^ n4, 16) + -415580040;
        }
        return dh_2.tnsh(string, n, n2, n3);
    }

    private static int dn_2(int n) {
        block0: {
            int n2 = -1838797710;
            n2 = Integer.rotateLeft(n2 * -405717107, 24) ^ 0xBE442CA2;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 18)) ^ 0xB6180827;
            if ((n3 ^ n2) == -1239939033) break block0;
            int cfr_ignored_0 = (0x247E2455 ^ n2) - 241098075;
        }
        return Integer.reverse(n);
    }

    private static String tfl_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 692141298;
            n4 = Integer.rotateLeft(n4 * -524691045, 24) ^ 0x6F23AD17;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0xB4EE96F2;
            if ((n5 ^ n4) == -1259432206) break block0;
            int cfr_ignored_0 = (0x9DAFAA00 ^ n4) + 942289648;
        }
        return dh_2.tnsh(string, n, n2, n3);
    }

    private static String sbr(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1064699922;
            n4 = Integer.rotateLeft(n4 * -1225585119, 25) ^ 0xFDDB79E2;
            int n5 = (n4 = n3 ^ n4) ^ 0x451FAD77;
            if ((n5 ^ n4) == 1159703927) break block0;
            int cfr_ignored_0 = (0x7A69A565 ^ n4) - 1014142413;
        }
        return dh_2.tnsh(string, n, n2, n3);
    }

    private static String ztt_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tbh_2.hab_2(-1069429250);
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 15)) ^ 0xFB8BEA0D;
            if ((n5 ^ n4) == -74716659) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x3BCA27F3 ^ n4, 10) + 1104704936) * 1003104243;
        }
        return dh_2.tnsh(string, n, n2, n3);
    }

    private static int shdhd_2(int n, int n2) {
        block0: {
            int n3 = -1151595723;
            n3 = Integer.rotateLeft(n3 * 2031679047, 10) ^ 0x85817330;
            n3 = n ^ n3;
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 10)) ^ 0x84605B06;
            if ((n4 ^ n3) == -2074060026) break block0;
            int cfr_ignored_0 = (0x3F3C5033 ^ n3) + -713568379;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int bna(int n) {
        block0: {
            int n2 = tbh_2.hab_2(-1058752046);
            int n3 = (n2 = n ^ n2) ^ 0x61AA045F;
            if ((n3 ^ n2) == 1638532191) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xA14EBD8D ^ n2, 7) - -1931046066;
            int cfr_ignored_1 = (int)(0x63FC13B027D4EB4FL ^ (long)n2 ^ 0xDA10831A2DB96A29L);
        }
        return Integer.reverse(n);
    }

    private static int dqr(int n) {
        block0: {
            int n2 = -684535450;
            n2 = Integer.rotateLeft(n2 * -1225842551, 15) ^ 0x523AA4FC;
            int n3 = (n2 = n ^ n2) ^ 0xC2667F46;
            if ((n3 ^ n2) == -1033470138) break block0;
            int cfr_ignored_0 = (0x1554AE20 ^ n2) - -1449280460;
        }
        return Integer.reverse(n);
    }

    private static int rtl(int n, int n2) {
        block0: {
            int n3 = -1116220114;
            n3 = Integer.rotateLeft(n3 * 795627329, 3) ^ 0x32ABF9BC;
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0xB5C6E10C;
            if ((n4 ^ n3) == -1245257460) break block0;
            int cfr_ignored_0 = (0x8B13422 ^ n3) - 1295692306;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String dhzr_2(String string, CharSequence charSequence, CharSequence charSequence2) {
        block0: {
            int n = -1208946383;
            n = Integer.rotateLeft(n * -1473130945, 15) ^ 0x37A5FB63;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 20);
            CharSequence charSequence3 = charSequence;
            n = (charSequence3 != null ? System.identityHashCode(charSequence3) : 0) ^ n;
            int n2 = n ^ 0xDDF6B26A;
            if ((n2 ^ n) == -571035030) break block0;
            int cfr_ignored_0 = (0x6A06435B ^ n) + -752297826;
        }
        return string.replace(charSequence, charSequence2);
    }

    private static int ttl_3(int n, int n2) {
        block0: {
            int n3 = 674271725;
            n3 = Integer.rotateLeft(n3 * 943504393, 26) ^ 0xC9C040AC;
            n3 = Integer.rotateLeft(n ^ n3, 12);
            int n4 = (n3 = n2 ^ n3) ^ 0xA4854E55;
            if ((n4 ^ n3) == -1534767531) break block0;
            int cfr_ignored_0 = (0x8CB5DFB8 ^ n3) + 154780679;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int shbth(int n) {
        block0: {
            int n2 = 1070220114;
            int n3 = (n2 = Integer.rotateLeft(n2 * -2093966085, 12) ^ 0x9F18335D) ^ 0x3763EC21;
            if ((n3 ^ n2) == 929295393) break block0;
            int cfr_ignored_0 = (0x8A9AF73 ^ n2) - 1579665104;
        }
        return Integer.reverse(n);
    }

    private static String shnd_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tbh_2.hab_2(1735450284);
            int n5 = n4 ^ 0x664D4C08;
            if ((n5 ^ n4) == 1716341768) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x13D92A4 ^ n4, 3) - 718430487;
        }
        return dh_2.tnsh(string, n, n2, n3);
    }

    private static String[] shdhs(String string) {
        int n = -1146060404;
        n = Integer.rotateLeft(n * 346271819, 9) ^ 0xFDE804EF;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 21);
        int n2 = n ^ 0x8DFE9F36;
        if ((n2 ^ n) != -1912692938) {
            int cfr_ignored_0 = (0x364E1EBA ^ n) + -1515641728;
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

    private static CallSite thn_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1034893697;
            n3 = Integer.rotateLeft(n3 * -1336203325, 28) ^ 0x4ECFED75;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 16);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 4);
            int n4 = n3 ^ 0xE0E28735;
            if ((n4 ^ n3) != -522025163) {
                int cfr_ignored_0 = (0xDD4DBEB4 ^ n3) + -1484503832;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ shmh ^ string.hashCode() ^ n2 + dhtd + i * -833204587) + shmh) ^ dhtd));
            }
            String[] stringArray = dh_2.shdhs(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType3) : lookup.findVirtual(clazz, stringArray[1], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] m38y9egp3l79(String string) {
        return string.split("\u0006\u0013", -1);
    }

    private static CallSite wof1c2n15(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ d861p2eujsvb ^ string.hashCode()) + (n2 + mk2ew72y5ar7) + i ^ d861p2eujsvb, 27) + mk2ew72y5ar7);
            }
            String[] stringArray = dh_2.m38y9egp3l79(new String(cArray));
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

