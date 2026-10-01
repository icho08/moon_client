/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_124
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_310
 *  net.minecraft.class_320
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
import java.util.List;
import java.util.regex.Pattern;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_310;
import net.minecraft.class_320;
import net.minecraft.class_5250;
import net.minecraft.class_7417;
import net.minecraft.class_8828;
import us.m0vy.moondlc.m0vyguard.bjkh;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.blq;
import us.m0vy.moondlc.m0vyguard.bwl;
import us.m0vy.moondlc.m0vyguard.yf;

public class bzr_2 {
    private static final int sath_2 = -2132262032;
    private static final int bzt = -731674577;
    private static final int tfa = 1602195038;
    private static final int khfth = -1924538111;
    private static final int ehmmpqn = 931871527;
    private static final int yle4hsxrzdis = -977765821;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int tv0rxqf73gxreu;

    public static class_2561 dhsw_2(class_2561 class_25612, String string, String string2) {
        if (class_25612 == null || string == null || string2 == null) {
            return class_25612;
        }
        class_5250 class_52502 = class_2561.method_43473().method_10862(class_25612.method_10866());
        bzr_2.tta_4(class_52502, class_25612, string, string2);
        return class_52502;
    }

    private static void tta_4(class_5250 class_52502, class_2561 class_25612, String string, String string2) {
        class_7417 class_74172 = class_25612.method_10851();
        class_2583 class_25832 = class_25612.method_10866();
        if (class_74172 instanceof class_8828.class_2585) {
            class_8828.class_2585 class_25852 = (class_8828.class_2585)class_74172;
            Pattern pattern = Pattern.compile(Pattern.quote(string), 2);
            String string3 = pattern.matcher(class_25852.comp_737()).replaceAll(string2);
            class_52502.method_10852((class_2561)class_2561.method_43470((String)string3).method_10862(class_25832));
        }
        for (Pattern pattern : class_25612.method_10855()) {
            bzr_2.tta_4(class_52502, (class_2561)pattern, string, string2);
        }
    }

    public static String djw(String string) {
        return string.replaceAll("ę”—", String.valueOf(class_124.field_1078) + "MODER").replaceAll("ę”Ą", String.valueOf(class_124.field_1078) + "ST.MODER").replaceAll("ę”ˇ", String.valueOf(class_124.field_1076) + "MODER+").replaceAll("ę”€", String.valueOf(class_124.field_1080) + "PLAYER").replaceAll("ę”‰", String.valueOf(class_124.field_1054) + "HELPER").replaceAll("â—†", "@").replaceAll("â”", "|").replaceAll("ę”ł", String.valueOf(class_124.field_1075) + "ML.ADMIN").replaceAll("ę”…", String.valueOf(class_124.field_1061) + "Y" + String.valueOf(class_124.field_1068) + "T").replaceAll("ę”‚", String.valueOf(class_124.field_1078) + "D.MODER").replaceAll("ę• ", String.valueOf(class_124.field_1054) + "D.HELPER").replaceAll("ę•„", String.valueOf(class_124.field_1061) + "DRACULA").replaceAll("ę”–", String.valueOf(class_124.field_1075) + "OVERLORD").replaceAll("ę•", String.valueOf(class_124.field_1060) + "COBRA").replaceAll("ę”¨", String.valueOf(class_124.field_1076) + "DRAGON").replaceAll("ę”¤", String.valueOf(class_124.field_1061) + "IMPERATOR").replaceAll("ę” ", String.valueOf(class_124.field_1065) + "MAGISTER").replaceAll("ę”„", String.valueOf(class_124.field_1078) + "HERO").replaceAll("ę”’", String.valueOf(class_124.field_1060) + "AVENGER").replaceAll("ę•’", String.valueOf(class_124.field_1068) + "RABBIT").replaceAll("ę”", String.valueOf(class_124.field_1054) + "TITAN").replaceAll("ę•€", String.valueOf(class_124.field_1077) + "HYDRA").replaceAll("ę”¶", String.valueOf(class_124.field_1065) + "TIGER").replaceAll("ę”˛", String.valueOf(class_124.field_1064) + "BULL").replaceAll("ę•–", String.valueOf(class_124.field_1074) + "BUNNY").replaceAll("ę•—ę•", String.valueOf(class_124.field_1054) + "SPONSOR").replaceAll("\ud83d\udd25", "@").replaceAll("á´€", "A").replaceAll("Ę™", "B").replaceAll("á´„", "C").replaceAll("á´…", "D").replaceAll("á´‡", "E").replaceAll("Ň“", "F").replaceAll("É˘", "G").replaceAll("Ęś", "H").replaceAll("ÉŞ", "I").replaceAll("á´Š", "J").replaceAll("á´‹", "K").replaceAll("Ęź", "L").replaceAll("á´Ť", "M").replaceAll("É´", "N").replaceAll("ęś±", "S").replaceAll("á´Ź", "O").replaceAll("á´", "P").replaceAll("Ç«", "Q").replaceAll("Ę€", "R").replaceAll("á´›", "T").replaceAll("á´ś", "U").replaceAll("á´ ", "V").replaceAll("á´ˇ", "W").replaceAll("ęś°", "F").replaceAll("ĘŹ", "Y").replaceAll("á´˘", "Z");
    }

    public static class_2561 hjt(class_2561 class_25612) {
        if (class_25612.getString().contains("ę”—")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę”—", String.valueOf(class_124.field_1078) + "MODER");
        }
        if (class_25612.getString().contains("ę”Ą")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę”Ą", String.valueOf(class_124.field_1078) + "ST.MODER");
        }
        if (class_25612.getString().contains("ę”ˇ")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę”ˇ", String.valueOf(class_124.field_1076) + "MODER+");
        }
        if (class_25612.getString().contains("ę”€")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę”€", String.valueOf(class_124.field_1080) + "PLAYER");
        }
        if (class_25612.getString().contains("ę”‰")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę”‰", String.valueOf(class_124.field_1054) + "HELPER");
        }
        if (class_25612.getString().contains("â—†")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "â—†", "@");
        }
        if (class_25612.getString().contains("â”")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "â”", "|");
        }
        if (class_25612.getString().contains("ę”ł")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę”ł", String.valueOf(class_124.field_1075) + "ML.ADMIN");
        }
        if (class_25612.getString().contains("ę”…")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę”…", String.valueOf(class_124.field_1061) + "Y" + String.valueOf(class_124.field_1068) + "T");
        }
        if (class_25612.getString().contains("ę”‚")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę”‚", String.valueOf(class_124.field_1078) + "D.MODER");
        }
        if (class_25612.getString().contains("ę• ")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę• ", String.valueOf(class_124.field_1054) + "D.HELPER");
        }
        if (class_25612.getString().contains("ę•„")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę•„", String.valueOf(class_124.field_1061) + "DRACULA");
        }
        if (class_25612.getString().contains("ę”–")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę”–", String.valueOf(class_124.field_1075) + "OVERLORD");
        }
        if (class_25612.getString().contains("ę•")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę•", String.valueOf(class_124.field_1060) + "COBRA");
        }
        if (class_25612.getString().contains("ę”¨")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę”¨", String.valueOf(class_124.field_1076) + "DRAGON");
        }
        if (class_25612.getString().contains("ę”¤")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę”¤", String.valueOf(class_124.field_1061) + "IMPERATOR");
        }
        if (class_25612.getString().contains("ę” ")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę” ", String.valueOf(class_124.field_1065) + "MAGISTER");
        }
        if (class_25612.getString().contains("ę”„")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę”„", String.valueOf(class_124.field_1078) + "HERO");
        }
        if (class_25612.getString().contains("ę”’")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę”’", String.valueOf(class_124.field_1060) + "AVENGER");
        }
        if (class_25612.getString().contains("ę•’")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę•’", String.valueOf(class_124.field_1068) + "RABBIT");
        }
        if (class_25612.getString().contains("ę”")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę”", String.valueOf(class_124.field_1054) + "TITAN");
        }
        if (class_25612.getString().contains("ę•€")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę•€", String.valueOf(class_124.field_1077) + "HYDRA");
        }
        if (class_25612.getString().contains("ę”¶")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę”¶", String.valueOf(class_124.field_1065) + "TIGER");
        }
        if (class_25612.getString().contains("ę”˛")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę”˛", String.valueOf(class_124.field_1064) + "BULL");
        }
        if (class_25612.getString().contains("ę•–")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę•–", String.valueOf(class_124.field_1074) + "BUNNY");
        }
        if (class_25612.getString().contains("ę•—ę•")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ę•—ę•", String.valueOf(class_124.field_1054) + "SPONSOR");
        }
        if (class_25612.getString().contains("\ud83d\udd25")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "\ud83d\udd25", "@");
        }
        if (class_25612.getString().contains("á´€")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "á´€", "A");
        }
        if (class_25612.getString().contains("Ę™")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "Ę™", "B");
        }
        if (class_25612.getString().contains("á´„")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "á´„", "C");
        }
        if (class_25612.getString().contains("á´…")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "á´…", "D");
        }
        if (class_25612.getString().contains("á´‡")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "á´‡", "E");
        }
        if (class_25612.getString().contains("Ň“")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "Ň“", "F");
        }
        if (class_25612.getString().contains("É˘")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "É˘", "G");
        }
        if (class_25612.getString().contains("Ęś")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "Ęś", "H");
        }
        if (class_25612.getString().contains("ÉŞ")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ÉŞ", "I");
        }
        if (class_25612.getString().contains("á´Š")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "á´Š", "J");
        }
        if (class_25612.getString().contains("á´‹")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "á´‹", "K");
        }
        if (class_25612.getString().contains("Ęź")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "Ęź", "L");
        }
        if (class_25612.getString().contains("á´Ť")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "á´Ť", "M");
        }
        if (class_25612.getString().contains("É´")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "É´", "N");
        }
        if (class_25612.getString().contains("ęś±")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ęś±", "S");
        }
        if (class_25612.getString().contains("á´Ź")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "á´Ź", "O");
        }
        if (class_25612.getString().contains("á´")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "á´", "P");
        }
        if (class_25612.getString().contains("Ç«")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "Ç«", "Q");
        }
        if (class_25612.getString().contains("Ę€")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "Ę€", "R");
        }
        if (class_25612.getString().contains("á´›")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "á´›", "T");
        }
        if (class_25612.getString().contains("á´ś")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "á´ś", "U");
        }
        if (class_25612.getString().contains("á´ ")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "á´ ", "V");
        }
        if (class_25612.getString().contains("á´ˇ")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "á´ˇ", "W");
        }
        if (class_25612.getString().contains("ęś°")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ęś°", "F");
        }
        if (class_25612.getString().contains("ĘŹ")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "ĘŹ", "Y");
        }
        if (class_25612.getString().contains("á´˘")) {
            class_25612 = bzr_2.dhsw_2(class_25612, "á´˘", "Z");
        }
        return class_25612;
    }

    public static String sdl_2(String string) {
        try {
            int n = -2129924080;
            n = Integer.rotateLeft(n * 495442715, 18) ^ 0x71681441;
            int n2 = n ^ 0xDA6EE1BB;
            if ((n2 ^ n) != -630267461) {
                int cfr_ignored_0 = (0x5B6511AB ^ n) + -264680339;
            }
            if ((0x26D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        bjkh bjkh2 = bzr_2.djt_2();
        if (bjkh2 == null) {
            return string;
        }
        String string2 = string;
        if (bjkh2.rgha_2()) {
            if (bzr_2.dhgh_4(bzr_2.jdhk(bjkh2))) {
                if (class_310.method_1551().method_1548() != null && class_310.method_1551().method_1548().method_1676() != null) {
                    string2 = string2.replace(bzr_2.arm_2(class_310.method_1551().method_1548()), bjkh2.hd());
                }
                if (bzr_2.zhdh_2(bzr_2.shyz(bjkh2))) {
                    for (String string3 : bzr_2.bthy(blq.aah_2())) {
                        string2 = bzr_2.thd_4(string2, string3, bjkh2.zta_4(string3));
                    }
                }
            }
            if (bzr_2.zzm_3(bjkh2).shzl()) {
                String string4 = string2.toLowerCase();
                if (string4.contains("fun") || bzr_2.shaq(string4, "time") && !string4.contains("r")) {
                    string2 = string2.replaceAll("(?i)fun", "Von").replaceAll("(?i)time", "Tam");
                }
                if (bzr_2.thb_4(string4, bzr_2.jdk("璤轿쇻鉶ᳯ㙼槒荱", 2063795992 + -1985361065, bzr_2.daw(0x5FAC6A45 ^ 0xD86FB70D, 16), 0xD23AE99E ^ 0x7514DE26)) || string4.contains(bzr_2.khsd("᷾ꢡ鎟疵弦", Integer.reverse(896586580) ^ 0x41C62977, bzr_2.dfs_2(0x357C8624 ^ 0xF2904E74, 2), -966879907 - 523263397)) && !string4.contains("\u0143\u20ac")) {
                    string2 = string2.replaceAll("(?i)fun", "\u0110\u2019\u0110\u013e\u0110\u02dd").replaceAll("(?i)time", "\u0110\u02d8\u0110\u00b0\u0110\u013d");
                }
            }
        }
        return string2;
    }

    private static String jdk(String string, int n, int n2, int n3) {
        int n4 = -11178794;
        n4 = Integer.rotateLeft(n4 * -1858569683, 15) ^ 0x98258CAF;
        int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 7)) ^ 0xD0E80CE;
        if ((n5 ^ n4) != 219054286) {
            int cfr_ignored_0 = (0xF25BEC18 ^ n4) + 1135740802;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x1A45DD1A ^ n2 ^ i * 1125697005 ^ sath_2, 9) ^ bzt));
        }
        return new String(cArray);
    }

    private static bjkh djt_2() {
        block0: {
            int n = 2045813509;
            int n2 = (n = Integer.rotateLeft(n * 722440343, 8) ^ 0xCD6CBC26) ^ 0xC2E3A42D;
            if ((n2 ^ n) == -1025268691) break block0;
            int cfr_ignored_0 = (0xBB130728 ^ n) + -2135159403;
        }
        return bjkh.shzkh();
    }

    private static badh_2 jdhk(bjkh bjkh2) {
        block0: {
            int n = bwl.dzq(1055533313);
            int n2 = n ^ 0xC427441F;
            if ((n2 ^ n) == -1004059617) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xFACD6D1E ^ n, 18) - 1664996829) * -87200481;
        }
        return bjkh2.dhdkh_2();
    }

    private static boolean dhgh_4(badh_2 badh2) {
        block0: {
            int n = -1224278628;
            int n2 = (n = Integer.rotateLeft(n * -1960195953, 13) ^ 0xB7DC2F6C) ^ 0x9293987F;
            if ((n2 ^ n) == -1835820929) break block0;
            int cfr_ignored_0 = (0x259565E3 ^ n) - -1321565542;
        }
        return badh2.shzl();
    }

    private static String arm_2(class_320 class_3202) {
        block0: {
            int n = bwl.dzq(-1280287868);
            class_320 class_3203 = class_3202;
            n = (class_3203 != null ? System.identityHashCode(class_3203) : 0) ^ n;
            int n2 = n ^ 0xD14DB6DE;
            if ((n2 ^ n) == -783436066) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x62FDED5A ^ n, 15) + 18701601) * 1660808539;
        }
        return class_3202.method_1676();
    }

    private static badh_2 shyz(bjkh bjkh2) {
        block0: {
            int n = 343159705;
            n = Integer.rotateLeft(n * 2110624771, 12) ^ 0xD092FE81;
            bjkh bjkh3 = bjkh2;
            n = Integer.rotateLeft((bjkh3 != null ? System.identityHashCode(bjkh3) : 0) ^ n, 23);
            int n2 = n ^ 0x8D2A1014;
            if ((n2 ^ n) == -1926623212) break block0;
            int cfr_ignored_0 = (0x995E238D ^ n) + 1319202845;
        }
        return bjkh2.dad_4();
    }

    private static boolean zhdh_2(badh_2 badh2) {
        block0: {
            int n = -1863631335;
            n = Integer.rotateLeft(n * -2077637069, 27) ^ 0x4C4FC2C7;
            badh_2 badh3 = badh2;
            n = (badh3 != null ? System.identityHashCode(badh3) : 0) ^ n;
            int n2 = n ^ 0x8257BC48;
            if ((n2 ^ n) == -2108179384) break block0;
            int cfr_ignored_0 = (0x12BC8251 ^ n) + 0x13333A11;
        }
        return badh2.shzl();
    }

    private static List bthy(blq blq2) {
        block0: {
            int n = bwl.dzq(185874209);
            int n2 = n ^ 0x46F4E743;
            if ((n2 ^ n) == 1190455107) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x4DE0D062 ^ n, 12) + 1922489113;
        }
        return blq2.zdf_3();
    }

    private static String thd_4(String string, CharSequence charSequence, CharSequence charSequence2) {
        block0: {
            int n = 950419405;
            int n2 = (n = Integer.rotateLeft(n * 1158923041, 10) ^ 0xD4026F04) ^ 0xF9D6A716;
            if ((n2 ^ n) == -103373034) break block0;
            int cfr_ignored_0 = (0xC17098DB ^ n) + -1226836623;
        }
        return string.replace(charSequence, charSequence2);
    }

    private static badh_2 zzm_3(bjkh bjkh2) {
        block0: {
            int n = -2093585097;
            int n2 = (n = Integer.rotateLeft(n * -539721949, 12) ^ 0x259287FC) ^ 0x11E8D85C;
            if ((n2 ^ n) == 300472412) break block0;
            int cfr_ignored_0 = (0x92DEB56B ^ n) + -769596887;
        }
        return bjkh2.thtq();
    }

    private static boolean shaq(String string, CharSequence charSequence) {
        block0: {
            int n = 871607262;
            n = Integer.rotateLeft(n * -1791895547, 11) ^ 0xBD0BEC14;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            CharSequence charSequence2 = charSequence;
            n = Integer.rotateRight((charSequence2 != null ? System.identityHashCode(charSequence2) : 0) ^ n, 14);
            int n2 = n ^ 0xF71A3D69;
            if ((n2 ^ n) == -149275287) break block0;
            int cfr_ignored_0 = (0xC4E996B7 ^ n) - -223178357;
        }
        return string.contains(charSequence);
    }

    private static String hthf(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1775304545;
            n4 = Integer.rotateLeft(n4 * -748277049, 16) ^ 0xDF0F7BF2;
            int n5 = (n4 = n2 ^ n4) ^ 0x975A7948;
            if ((n5 ^ n4) == -1755678392) break block0;
            int cfr_ignored_0 = (0xFE8A8629 ^ n4) - -118224737;
        }
        return bzr_2.jdk(string, n, n2, n3);
    }

    private static int daw(int n, int n2) {
        block0: {
            int n3 = bwl.dzq(-1433098921);
            int n4 = (n3 = n ^ n3) ^ 0x251AEBB9;
            if ((n4 ^ n3) == 622521273) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x8F8E4EEE ^ n3, 4) - 1721314829;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static boolean thb_4(String string, CharSequence charSequence) {
        block0: {
            int n = bwl.dzq(-1225726157);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 26);
            CharSequence charSequence2 = charSequence;
            n = (charSequence2 != null ? System.identityHashCode(charSequence2) : 0) ^ n;
            int n2 = n ^ 0xC721113B;
            if ((n2 ^ n) == -954134213) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x71D1F608 ^ n, 17) + -859149773;
        }
        return string.contains(charSequence);
    }

    private static int dfs_2(int n, int n2) {
        block0: {
            int n3 = -405843771;
            int n4 = (n3 = Integer.rotateLeft(n3 * -1891169811, 19) ^ 0xEEB25D14) ^ 0x798E40AA;
            if ((n4 ^ n3) == 2039365802) break block0;
            int cfr_ignored_0 = (0x9E41106F ^ n3) - -594934097;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String khsd(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1852282083;
            n4 = Integer.rotateLeft(n4 * -591912893, 8) ^ 0x6001BFD5;
            int n5 = (n4 = n ^ n4) ^ 0x17D51CF2;
            if ((n5 ^ n4) == 399842546) break block0;
            int cfr_ignored_0 = (0x79B28811 ^ n4) - -421746430;
        }
        return bzr_2.jdk(string, n, n2, n3);
    }

    private static String ssz_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1395612741;
            n4 = Integer.rotateLeft(n4 * 166376659, 28) ^ 0xBD3A058D;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0xC2B3B5E9;
            if ((n5 ^ n4) == -1028409879) break block0;
            int cfr_ignored_0 = (0x919CE9AC ^ n4) - -447177816;
        }
        return bzr_2.jdk(string, n, n2, n3);
    }

    private static String hrs_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1283424611;
            n4 = Integer.rotateLeft(n4 * 1097483557, 20) ^ 0xD48C4161;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 24);
            int n5 = (n4 = n3 ^ n4) ^ 0xF533F46A;
            if ((n5 ^ n4) == -181144470) break block0;
            int cfr_ignored_0 = (0x46B38AF7 ^ n4) - 1963228526;
        }
        return bzr_2.jdk(string, n, n2, n3);
    }

    private static String sat_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -2105102694;
            n4 = Integer.rotateLeft(n4 * 898538581, 11) ^ 0x83E25975;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 7)) ^ 0x27283E69;
            if ((n5 ^ n4) == 656948841) break block0;
            int cfr_ignored_0 = (0xA5AE90F3 ^ n4) + 1945520206;
        }
        return bzr_2.jdk(string, n, n2, n3);
    }

    private static String ashs_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -263419415;
            n4 = Integer.rotateLeft(n4 * -367965611, 17) ^ 0x380018F6;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = n4 ^ 0xE30A163F;
            if ((n5 ^ n4) == -485878209) break block0;
            int cfr_ignored_0 = (0x13469FD6 ^ n4) + -1528861854;
        }
        return bzr_2.jdk(string, n, n2, n3);
    }

    private static String[] rzr_2(String string) {
        int n = 1375243367;
        int n2 = (n = Integer.rotateLeft(n * 491017463, 10) ^ 0x69C12610) ^ 0xE96F8495;
        if ((n2 ^ n) != -378567531) {
            int cfr_ignored_0 = (0xB89708F2 ^ n) - -1883200315;
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

    private static CallSite tsh_7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -666376018;
            n3 = Integer.rotateLeft(n3 * -309317589, 5) ^ 0x8CDC36DB;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 7);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x839FFAD3;
            if ((n4 ^ n3) != -2086667565) {
                int cfr_ignored_0 = (0x5BD8127D ^ n3) - 186230843;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ tfa ^ string.hashCode() ^ n2 + khfth + i * 586241877) + tfa) ^ khfth));
            }
            String[] stringArray = bzr_2.rzr_2(new String(cArray));
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

    private static String[] je6819u4(String string) {
        return string.split("\u0001\u0012", -1);
    }

    private static CallSite uged297hi1f1r(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ehmmpqn ^ string.hashCode()) + (n2 + yle4hsxrzdis) + i ^ ehmmpqn, 20) + yle4hsxrzdis);
            }
            String[] stringArray = bzr_2.je6819u4(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
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

