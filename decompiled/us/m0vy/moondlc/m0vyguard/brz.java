/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_310
 *  org.lwjgl.glfw.GLFW
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;
import lombok.Generated;
import net.minecraft.class_310;
import org.lwjgl.glfw.GLFW;
import us.m0vy.moondlc.m0vyguard.bsy;
import us.m0vy.moondlc.m0vyguard.yf;

public final class brz {
    private static final Map sda_6;
    private static final int dhshf = 189307011;
    private static final int saj_2 = 229849201;
    private static final int bht_2 = -1866077783;
    private static final int rtf = 1044518747;
    private static final int zo2a5ps441 = -1879176777;
    private static final int omvxhn9i9i6c = -123019579;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int x383he8f;

    public static Set wd() {
        block0: {
            int n = -17520981;
            int n2 = (n = Integer.rotateLeft(n * -1654171395, 20) ^ 0xD322B54B) ^ 0x33103570;
            if ((n2 ^ n) == 856700272) break block0;
            int cfr_ignored_0 = (0xCDE493DB ^ n) + -462605081;
        }
        return sda_6.keySet();
    }

    public static boolean rzdh(int n) {
        int n2 = 1969601917;
        int n3 = (n2 = Integer.rotateLeft(n2 * -740061445, 8) ^ 0xCCAA138E) ^ 0xD4A9045E;
        if ((n3 ^ n2) != -727120802) {
            int cfr_ignored_0 = (0xA1CCB923 ^ n2) + -1028623998;
        }
        if (n == -1 || n == -1882291441 + 1882290442) {
            return false;
        }
        class_310 class_3102 = brz.dmr();
        if (class_3102 == null || class_3102.method_22683() == null) {
            return false;
        }
        long l = class_3102.method_22683().method_4490();
        if (n <= 527535031 - 527535124) {
            return brz.hshd(l, (0x4FE67791 ^ 0x4FE677F5) + n) == 1;
        }
        return GLFW.glfwGetKey((long)l, (int)n) == 1;
    }

    public static int zya_4(String string) {
        int n = -1540237420;
        n = Integer.rotateLeft(n * -1837721785, 20) ^ 0xBB12B8A;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xBC8202DC;
        if ((n2 ^ n) != -1132330276) {
            int cfr_ignored_0 = (0x18B3D548 ^ n) + -163416101;
        }
        if (string == null || string.isEmpty()) {
            return -1;
        }
        if (string.equalsIgnoreCase("None")) {
            return -1;
        }
        if (sda_6.containsKey(string)) {
            return brz.jzn((Integer)sda_6.get(string));
        }
        if (string.startsWith("Mouse")) {
            try {
                int n3 = Integer.parseInt(string.substring(5)) - 1;
                if (n3 >= 0 && n3 <= 1063857905 + -1063857898) {
                    return (Integer.reverse(-1970465566) ^ 0xB8D74ECD) + n3;
                }
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
            return -1;
        }
        try {
            for (Field field : GLFW.class.getDeclaredFields()) {
                String string3;
                if (!field.getName().startsWith("GLFW_KEY_") || field.getType() != Integer.TYPE || !brz.dah_8(string3 = field.getName().substring("GLFW_KEY_".length())).equalsIgnoreCase(string) && !string3.equalsIgnoreCase(string)) continue;
                return field.getInt(null);
            }
        }
        catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
        }
        return -1;
    }

    public static String adq(int n) {
        int n2 = 1562736462;
        int n3 = (n2 = Integer.rotateLeft(n2 * 1982597803, 22) ^ 0xA8061D30) ^ 0x9FA8A015;
        if ((n3 ^ n2) != -1616338923) {
            int cfr_ignored_0 = (0xC28DD75B ^ n2) + -584458069;
        }
        if (n == -1 || n == (0xC087613 ^ 0xF3F78A0A)) {
            return "None";
        }
        for (int i = 0; i <= Integer.rotateLeft(0xF9BE8A86 ^ 0xF87E8A86, 10); ++i) {
            if (n != 1173022820 + -1173022920 + i) continue;
            return "Mouse" + (i + 1);
        }
        try {
            for (Field field : GLFW.class.getDeclaredFields()) {
                if (!field.getName().startsWith(brz.zrn("윷煦꾂\ud828ᙆ䃿ﴫ⭐旼", brz.khjw(-1636108896) ^ 0x7126D4E2, Integer.rotateLeft(0xF63E64F ^ 0x45C5A704, 23), 1919689199 + -1973637884)) || field.getType() != Integer.TYPE || field.getInt(null) != n) continue;
                String string = field.getName().substring("GLFW_KEY_".length());
                return brz.hfth(string);
            }
        }
        catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
        }
        return brz.shfa_2("蛩を駍", 1627018275 - -1270644388, brz.bkl(0x58907E0F ^ 0x5CA43799, 1), Integer.reverse(-974994509) ^ 0x310B8950);
    }

    /*
     * Exception decompiling
     */
    private static String dah_8(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static String shw_5(String string) {
        try {
            int n = -1750097212;
            n = Integer.rotateLeft(n * 586330397, 20) ^ 0x21A0C197;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 5);
            int n2 = n ^ 0xB72D9195;
            if ((n2 ^ n) != -1221750379) {
                int cfr_ignored_0 = (0x20823351 ^ n) - -726584636;
            }
            if ((0x1C1 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (string == null || string.isEmpty()) {
            return "";
        }
        String string3 = string.toLowerCase();
        string3 = string3.replace(brz.rshh("뎷ׯ\udb01겼拑㑦", brz.dhjk(0x3EBBBC5B ^ 0xDACA96EA, 12), Integer.rotateLeft(0x3506A1AD ^ 0xB693A008, 26), Integer.reverse(-180716827) ^ 0x27B0B6BB), "");
        string3 = string3.replace("control", "ctrl");
        string3 = string3.replace("super", "Super");
        string3 = string3.replace("minus", "Minus");
        string3 = string3.replace(brz.jjt_2("䘤风ℊ瞸", -1892245154 + -1941421993, 0xED10C946 ^ 0x84BC7EA2, brz.dfdh_2(0xF0BAA427 ^ 0xB0CDD12D, 1)), "Equals");
        return Character.toUpperCase(string3.charAt(0)) + string3.substring(1);
    }

    @Generated
    private brz() {
        throw new UnsupportedOperationException("This is a u".concat("tility class").concat(" and cannot").concat(" be instantiated"));
    }

    private static String zrn(String string, int n, int n2, int n3) {
        try {
            int n4 = -973720901;
            n4 = Integer.rotateLeft(n4 * -132992015, 27) ^ 0x8787B50B;
            n4 = Integer.rotateRight(n ^ n4, 12);
            n4 = Integer.rotateRight(n2 ^ n4, 15);
            int n5 = n4 ^ 0x16C4FC2D;
            if ((n5 ^ n4) != 382008365) {
                int cfr_ignored_0 = (0xD332CE96 ^ n4) + -1967461781;
            }
            if ((0x3B7 & 0) != 0) {
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
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xE6EBCB74 ^ n2 ^ i * -1768178195 ^ dhshf, 10) ^ saj_2));
        }
        return new String(cArray);
    }

    private static class_310 dmr() {
        block0: {
            int n = 1365474954;
            int n2 = (n = Integer.rotateLeft(n * 1737464461, 22) ^ 0xFE21B9ED) ^ 0x6ACB0B05;
            if ((n2 ^ n) == 1791691525) break block0;
            int cfr_ignored_0 = (0x3BA8758F ^ n) + 1074749692;
        }
        return class_310.method_1551();
    }

    private static int hshd(long l, int n) {
        block0: {
            int n2 = 1189082048;
            n2 = Integer.rotateLeft(n2 * 1480578605, 11) ^ 0x7E394CB0;
            int n3 = (n2 = n ^ n2) ^ 0xD9B4575C;
            if ((n3 ^ n2) == -642492580) break block0;
            int cfr_ignored_0 = (0x9F6BA49C ^ n2) + 2051762207;
        }
        return GLFW.glfwGetMouseButton((long)l, (int)n);
    }

    private static int jzn(Integer n) {
        block0: {
            int n2 = -569589657;
            n2 = Integer.rotateLeft(n2 * 7870745, 11) ^ 0xC094534E;
            Integer n3 = n;
            n2 = (n3 != null ? System.identityHashCode(n3) : 0) ^ n2;
            int n4 = n2 ^ 0x5DB562C5;
            if ((n4 ^ n2) == 1572168389) break block0;
            int cfr_ignored_0 = (0x83B9A2A2 ^ n2) - -1581192688;
        }
        return n;
    }

    private static String bra(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -363353120;
            n4 = Integer.rotateLeft(n4 * -1160337663, 26) ^ 0x3312E239;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 8);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 16)) ^ 0x54E01C2;
            if ((n5 ^ n4) == 88998338) break block0;
            int cfr_ignored_0 = (0xEF19AA22 ^ n4) + 34474446;
        }
        return brz.zrn(string, n, n2, n3);
    }

    private static String rqh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1339615580;
            n4 = Integer.rotateLeft(n4 * -2087009915, 21) ^ 0xE1DD55C3;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 24);
            int n5 = (n4 = n ^ n4) ^ 0x4E90ECB9;
            if ((n5 ^ n4) == 1318120633) break block0;
            int cfr_ignored_0 = (0xFEB7FA1D ^ n4) + 623021048;
        }
        return brz.zrn(string, n, n2, n3);
    }

    private static String tsl(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bsy.zqd(1680104239);
            n4 = n2 ^ n4;
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 29)) ^ 0xA3869916;
            if ((n5 ^ n4) == -1551460074) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xC7A2C239 ^ n4, 11) + 823338018) * -945634759;
            int cfr_ignored_1 = (int)(0x5106C0427D4EB4FL ^ (long)n4 ^ 0x2578831A2DB9A7F1L);
        }
        return brz.zrn(string, n, n2, n3);
    }

    private static int khjw(int n) {
        block0: {
            int n2 = 712375372;
            n2 = Integer.rotateLeft(n2 * 928107439, 3) ^ 0x208EC34B;
            int n3 = (n2 = n ^ n2) ^ 0x2BB903A1;
            if ((n3 ^ n2) == 733545377) break block0;
            int cfr_ignored_0 = (0x1CCFFED ^ n2) + 812071592;
        }
        return Integer.reverse(n);
    }

    private static String hfth(String string) {
        block0: {
            int n = bsy.zqd(-1343481706);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 20);
            int n2 = n ^ 0xA4C19E45;
            if ((n2 ^ n) == -1530814907) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xB2D86D3 ^ n, 4) + 1591800520) * 187533011;
        }
        return brz.dah_8(string);
    }

    private static int bkl(int n, int n2) {
        block0: {
            int n3 = 202941510;
            n3 = Integer.rotateLeft(n3 * -436860327, 26) ^ 0xA0D8BED5;
            int n4 = (n3 = Integer.rotateLeft(n ^ n3, 20)) ^ 0x19E22AC3;
            if ((n4 ^ n3) == 434252483) break block0;
            int cfr_ignored_0 = (0x15FA8E85 ^ n3) + -2008041575;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String shfa_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 263858977;
            n4 = Integer.rotateLeft(n4 * -749630243, 25) ^ 0x2CF2EEE5;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 24);
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 11)) ^ 0xA9F49DFA;
            if ((n5 ^ n4) == -1443586566) break block0;
            int cfr_ignored_0 = (0xA64EB6DB ^ n4) + -873078807;
        }
        return brz.zrn(string, n, n2, n3);
    }

    private static String dhdhj(String string) {
        block0: {
            int n = -1092282778;
            int n2 = (n = Integer.rotateLeft(n * -625707623, 24) ^ 0xD96EF962) ^ 0xE51627F8;
            if ((n2 ^ n) == -451532808) break block0;
            int cfr_ignored_0 = (0x5BF3319E ^ n) + -864129952;
        }
        return brz.shw_5(string);
    }

    private static int thzn_2(int n, int n2) {
        block0: {
            int n3 = 1994349307;
            int n4 = (n3 = Integer.rotateLeft(n3 * 1768395093, 28) ^ 0xC548779C) ^ 0xB324E097;
            if ((n4 ^ n3) == -1289428841) break block0;
            int cfr_ignored_0 = (0xC5FBBA6C ^ n3) + 1545683450;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String zsz_5(String string) {
        block0: {
            int n = bsy.zqd(-391975702);
            int n2 = n ^ 0x275EC835;
            if ((n2 ^ n) == 660523061) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xCFFC24DF ^ n, 12) - 870716988) * -805559073;
        }
        return brz.shw_5(string);
    }

    private static int thsz(int n, int n2) {
        block0: {
            int n3 = 445165742;
            int n4 = (n3 = Integer.rotateLeft(n3 * 221341123, 5) ^ 0x53AFD2A9) ^ 0xDDC700D9;
            if ((n4 ^ n3) == -574160679) break block0;
            int cfr_ignored_0 = (0xC74FB077 ^ n3) + 474875085;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String sql_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 547915235;
            n4 = Integer.rotateLeft(n4 * 449565041, 26) ^ 0x11BCDE22;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 10);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 6)) ^ 0x90C9E979;
            if ((n5 ^ n4) == -1865815687) break block0;
            int cfr_ignored_0 = (0xB0616C9A ^ n4) - -1560900978;
        }
        return brz.zrn(string, n, n2, n3);
    }

    private static int tkhkh_2(int n) {
        block0: {
            int n2 = 1359090986;
            n2 = Integer.rotateLeft(n2 * 960553439, 28) ^ 0x95A01806;
            int n3 = (n2 = n ^ n2) ^ 0xE50008DC;
            if ((n3 ^ n2) == -452982564) break block0;
            int cfr_ignored_0 = (0xB4021DF6 ^ n2) + -281690160;
        }
        return Integer.reverse(n);
    }

    private static String zsha_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -617875862;
            int n5 = (n4 = Integer.rotateLeft(n4 * -889369453, 4) ^ 0xE0B18634) ^ 0x50666031;
            if ((n5 ^ n4) == 1348886577) break block0;
            int cfr_ignored_0 = (0x8B4D965B ^ n4) + -976108951;
        }
        return brz.zrn(string, n, n2, n3);
    }

    private static String ssgh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bsy.zqd(1718020173);
            n4 = Integer.rotateLeft(n ^ n4, 17);
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 10)) ^ 0xAC52105D;
            if ((n5 ^ n4) == -1403908003) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xCA34F810 ^ n4, 12) + -2134398677) * -902498287;
        }
        return brz.zrn(string, n, n2, n3);
    }

    private static int sba_4(int n, int n2) {
        block0: {
            int n3 = 602972022;
            n3 = Integer.rotateLeft(n3 * 940367013, 5) ^ 0x4E760F7C;
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0x5F03F071;
            if ((n4 ^ n3) == 1594093681) break block0;
            int cfr_ignored_0 = (0x7CF36F07 ^ n3) - -2105528008;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String zlq(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -40122096;
            n4 = Integer.rotateLeft(n4 * -439280743, 27) ^ 0xBD068FBD;
            n4 = n ^ n4;
            int n5 = (n4 = n3 ^ n4) ^ 0xF186223;
            if ((n5 ^ n4) == 253256227) break block0;
            int cfr_ignored_0 = (0xF283AB33 ^ n4) - -1306027208;
        }
        return brz.zrn(string, n, n2, n3);
    }

    private static int ghbn(int n, int n2) {
        block0: {
            int n3 = 538436053;
            n3 = Integer.rotateLeft(n3 * 1890283109, 12) ^ 0x4FC11274;
            int n4 = (n3 = n ^ n3) ^ 0xF99BF0CA;
            if ((n4 ^ n3) == -107220790) break block0;
            int cfr_ignored_0 = (0xD98C111F ^ n3) + -1443750807;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String sta(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bsy.zqd(2008227051);
            int n5 = n4 ^ 0x8F18DC8D;
            if ((n5 ^ n4) == -1894196083) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xF8ABC066 ^ n4, 18) - 556395413;
        }
        return brz.zrn(string, n, n2, n3);
    }

    private static String ghdh_5(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1312501779;
            n4 = Integer.rotateLeft(n4 * -47837941, 8) ^ 0xF582449D;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 28);
            int n5 = (n4 = n2 ^ n4) ^ 0x3EACED2;
            if ((n5 ^ n4) == 65720018) break block0;
            int cfr_ignored_0 = (0x4DD1FEC1 ^ n4) - -1534633089;
        }
        return brz.zrn(string, n, n2, n3);
    }

    private static int dhnf(int n) {
        block0: {
            int n2 = bsy.zqd(310803834);
            int n3 = n2 ^ 0x9A36CA65;
            if ((n3 ^ n2) == -1707685275) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x88B0B71F ^ n2, 4) - -1849439236) * -2001684705;
        }
        return Integer.reverse(n);
    }

    private static String syd_4(String string, CharSequence charSequence, CharSequence charSequence2) {
        block0: {
            int n = -1501443916;
            n = Integer.rotateLeft(n * 1399995171, 28) ^ 0x28A58854;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            CharSequence charSequence3 = charSequence2;
            n = Integer.rotateLeft((charSequence3 != null ? System.identityHashCode(charSequence3) : 0) ^ n, 9);
            int n2 = n ^ 0x265D45E6;
            if ((n2 ^ n) == 643646950) break block0;
            int cfr_ignored_0 = (0x80DC8D52 ^ n) - 1579786152;
        }
        return string.replace(charSequence, charSequence2);
    }

    private static String tbh_2(String string) {
        block0: {
            int n = 1865292355;
            int n2 = (n = Integer.rotateLeft(n * -311726777, 22) ^ 0xFB37BD54) ^ 0x61CBB7ED;
            if ((n2 ^ n) == 1640740845) break block0;
            int cfr_ignored_0 = (0xEE5ADAE ^ n) + -380558770;
        }
        return brz.shw_5(string);
    }

    private static int dhjk(int n, int n2) {
        block0: {
            int n3 = 1238413068;
            n3 = Integer.rotateLeft(n3 * 2076482301, 16) ^ 0x74993CD;
            n3 = Integer.rotateRight(n ^ n3, 29);
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 11)) ^ 0xE1181B8B;
            if ((n4 ^ n3) == -518513781) break block0;
            int cfr_ignored_0 = (0xA8C8B487 ^ n3) - -837722424;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String rshh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -132110417;
            n4 = Integer.rotateLeft(n4 * -924070991, 3) ^ 0x8E48ECF0;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 4);
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 18)) ^ 0xADE4DED5;
            if ((n5 ^ n4) == -1377509675) break block0;
            int cfr_ignored_0 = (0x55C4F97A ^ n4) + -319674762;
        }
        return brz.zrn(string, n, n2, n3);
    }

    private static String thghdh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1162998680;
            n4 = Integer.rotateLeft(n4 * -763243563, 15) ^ 0x66AEAF6B;
            n4 = n ^ n4;
            int n5 = (n4 = n3 ^ n4) ^ 0xF156D9D3;
            if ((n5 ^ n4) == -245966381) break block0;
            int cfr_ignored_0 = (0x4BF8D5BB ^ n4) - -1423045103;
        }
        return brz.zrn(string, n, n2, n3);
    }

    private static String thdf(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 389854467;
            n4 = Integer.rotateLeft(n4 * -1590007463, 7) ^ 0x2650C14B;
            n4 = n ^ n4;
            int n5 = (n4 = n3 ^ n4) ^ 0x15A5B274;
            if ((n5 ^ n4) == 363180660) break block0;
            int cfr_ignored_0 = (0x2990777 ^ n4) - 61994276;
        }
        return brz.zrn(string, n, n2, n3);
    }

    private static int dfdh_2(int n, int n2) {
        block0: {
            int n3 = 1081670106;
            n3 = Integer.rotateLeft(n3 * 1698652071, 22) ^ 0x88090E6D;
            n3 = Integer.rotateRight(n ^ n3, 11);
            int n4 = (n3 = n2 ^ n3) ^ 0x947EA3D8;
            if ((n4 ^ n3) == -1803639848) break block0;
            int cfr_ignored_0 = (0xD4065A02 ^ n3) + -224621447;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String jjt_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1209371511;
            n4 = Integer.rotateLeft(n4 * 211463799, 28) ^ 0xB030DFA2;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 14);
            int n5 = (n4 = n ^ n4) ^ 0xF40977B9;
            if ((n5 ^ n4) == -200706119) break block0;
            int cfr_ignored_0 = (0xBC1CFCCE ^ n4) - -1240763220;
        }
        return brz.zrn(string, n, n2, n3);
    }

    private static String[] dhthj(String string) {
        int n = -127226355;
        int n2 = (n = Integer.rotateLeft(n * -1199012319, 28) ^ 0x59B7580D) ^ 0x9A73FD4B;
        if ((n2 ^ n) != -1703674549) {
            int cfr_ignored_0 = (0x62195346 ^ n) + 1323448352;
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

    private static CallSite khdhs(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 2073480693;
            n3 = Integer.rotateLeft(n3 * 1443115489, 15) ^ 0x182A7106;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            n3 = n ^ n3;
            int n4 = n3 ^ 0x485BE822;
            if ((n4 ^ n3) != 1213982754) {
                int cfr_ignored_0 = (0x33CD25D7 ^ n3) + 1295122068;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bht_2 ^ string.hashCode()) + (n2 + rtf) + i ^ bht_2, 19) + rtf);
            }
            String[] stringArray = brz.dhthj(new String(cArray));
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

    private static String[] xpo3pbd9eml5(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ne3j0kgcxq4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ zo2a5ps441 ^ string.hashCode() ^ n2 + omvxhn9i9i6c ^ i * 596582311 ^ zo2a5ps441, 18) ^ omvxhn9i9i6c));
            }
            String[] stringArray = brz.xpo3pbd9eml5(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

