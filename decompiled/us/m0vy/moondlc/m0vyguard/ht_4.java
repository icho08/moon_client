/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import us.m0vy.moondlc.m0vyguard.tb;
import us.m0vy.moondlc.m0vyguard.yf;

public final class ht_4 {
    private static volatile boolean dss;
    private static final int dhtj_2 = -828632613;
    private static final int khsk = 42085507;
    private static final int dkh_2 = 1668935349;
    private static final int dhtt = 1699906965;
    private static final int mcaymxwsass = -854470069;
    private static final int g4pgujemx4l3u = -1537641339;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int slrkwxhtc0q;

    private ht_4() {
    }

    public static void dbm_2() {
        yf yf2;
        int n = -464397882;
        int n2 = (n = Integer.rotateLeft(n * 61970599, 13) ^ 0xE0C2A18) ^ 0xE11128D;
        if ((n2 ^ n) != 235999885) {
            int cfr_ignored_0 = (0xEA40CB4B ^ n) - -1746924110;
        }
        if (!ht_4.rmgh(yf2 = yf.thwt_2())) {
            ht_4.hbk(ht_4.sn_2("롞减ᠯ醞뽡塇ἲ蠒뒠彫ᓆ༞쀣哂꽽⁆Ӱ", ht_4.thzh_4(0x4BDE3F61 ^ 0xE6C52FF4, 8), 0x250887E3 ^ 0xF0BA59F8, 989696099 + 2060109595).concat(" official launcher.\nP").concat(ht_4.sn_2("妋⁚裏켳恉ꦱᝃq䧑圑뀞覍偺\udcacꜤ途벣䝄\ud828곛蜔", Integer.rotateLeft(0x9D90A0F5 ^ 0x8CA1A2D1, 23), -738174333 + -448974400, ht_4.khkhk(0x298DB586 ^ 0x6B364028, 21))).concat("rough MegaSelfCode."));
        }
        if (ht_4.thykh(yf2) > 0L && !ht_4.dtht_4(yf2.awth())) {
            ht_4.hbk("Launcher process is not running.\nPlease start the game through MegaSelfCode.");
        }
        if (yf2.dzl_4().isEmpty()) {
            ht_4.hbk(ht_4.ddl("No username provided by the lau", ht_4.sn_2("㟉칹芽ឝ䊬쟝癖ꊔ㘘ዱ箖陥犭㮀ٰ㋒鯫显몈஼☓\udaac毐셡ય", Integer.reverse(-1541421215) ^ 0x1347C012, -768547948 - 180527411, ht_4.shghsh(0xDD3FAE36 ^ 0x81BAD9DD, 28))).concat("rt the game through MegaSelfCode."));
        }
        if (yf2.dsn().isEmpty() || ht_4.jyt("UNKNOWN-HWID", ht_4.ddt_7(yf2))) {
            ht_4.hbm("No valid HWID provided by the launcher.\nPlease start the game through MegaSelfCode.");
        }
        if (yf2.hkm().isEmpty()) {
            ht_4.hbk("No auth ticket provided by".concat(" the launcher.\nPlease start t").concat("he game through MegaSelfCode."));
        }
        dss = true;
        System.out.println("[LauncherGuard] Session verified: " + ht_4.dhb_5(yf2) + " (uid=" + yf2.dhqn() + ")");
    }

    public static void shzh_3() {
        String string;
        String string2;
        yf yf2;
        int n = -1566706597;
        int n2 = (n = Integer.rotateLeft(n * 1285439325, 15) ^ 0xEF2468C7) ^ 0xE1A43448;
        if ((n2 ^ n) != -509332408) {
            int cfr_ignored_0 = (0x4339C013 ^ n) + 1034228095;
        }
        if (!dss) {
            ht_4.sk(ht_4.zqb_2("LauncherGuard was n", "ever verified.\nPleas").concat(ht_4.saz_5("监잻派ᚖި終틣枌ᴪክ㞗씹狏韢ԡ䊋ퟵ敞ꈗ跊㔜", 66880961 + 1505505002, ht_4.dhthsh(268862196) ^ 0x8D645BF, 2104345740 + -1097159143)).concat("ugh MegaSelfCode."));
        }
        if ((yf2 = ht_4.stgh_4()).awth() > 0L && !ht_4.dtht_4(ht_4.bah_2(yf2))) {
            ht_4.hbk("Launcher was closed.\nThe game requires the launcher to be running.");
        }
        if ((string2 = yf2.dsn()) == null || string2.isEmpty() || "UNKNOWN-HWID".equalsIgnoreCase(string2)) {
            ht_4.hbk("HWID was in".concat("valid or missi").concat("ng.\nTampering").concat(" detected."));
        }
        if ((string = yf2.dzl_4()) == null || string.isEmpty()) {
            ht_4.bls_2("Username was invalid or miss".concat("ing.\nTampering detected."));
        }
    }

    public static boolean bfsh() {
        block0: {
            int n = 587598314;
            int n2 = (n = Integer.rotateLeft(n * 185298937, 24) ^ 0xC31131C) ^ 0xDCE66F20;
            if ((n2 ^ n) == -588878048) break block0;
            int cfr_ignored_0 = (0xFFE066CA ^ n) - 668673922;
        }
        return dss;
    }

    private static boolean dtht_4(long l) {
        try {
            block8: {
                String string;
                int n = 736032389;
                n = Integer.rotateLeft(n * 188087381, 7) ^ 0x48CEA34A;
                int n2 = n ^ 0x391A96CC;
                if ((n2 ^ n) != 958043852) {
                    int cfr_ignored_0 = (0x12C46049 ^ n) + -1599328820;
                }
                if (!(string = System.getProperty(ht_4.ghthh("䶛捈귿硛䕥", ht_4.aha_4(0x1C9043A0 ^ 0x2265041, 23), -1248377329 + -1556535163, -1025038295 - -1581060710), "").toLowerCase(Locale.ROOT)).contains("win")) break block8;
                ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "tasklist /FI \"PID eq " + l + "\" /NH");
                processBuilder.redirectErrorStream(true);
                Process process = processBuilder.start();
                StringBuilder stringBuilder = new StringBuilder();
                Object object = new BufferedReader(new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8));
                try {
                    String string2;
                    while ((string2 = ((BufferedReader)object).readLine()) != null) {
                        stringBuilder.append(string2);
                    }
                }
                catch (Throwable throwable) {
                    try {
                        ht_4.hkhh((BufferedReader)object);
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                    throw throwable;
                }
                ((BufferedReader)object).close();
                process.waitFor();
                object = stringBuilder.toString();
                return ((String)object).contains(String.valueOf(l));
            }
            return true;
        }
        catch (Exception exception) {
            return true;
        }
    }

    private static void hbk(String string) {
        try {
            int n = -1317759060;
            n = Integer.rotateLeft(n * -546841331, 20) ^ 0xBB69E54A;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 21);
            int n2 = n ^ 0xBF6ADE5B;
            if ((n2 ^ n) != -1083515301) {
                int cfr_ignored_0 = (0xE1E49F7 ^ n) + -83173143;
            }
            if ((0x1DB & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        System.err.println("[LauncherGuard] FATAL: " + string.replace("\n", " | "));
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JOptionPane.showMessageDialog(null, string, "Moondlc - Launcher Required", 0);
        }
        catch (Exception exception) {
            // empty catch block
        }
        Runtime.getRuntime().halt(1);
    }

    private static String sn_2(String string, int n, int n2, int n3) {
        try {
            int n4 = -1286623881;
            n4 = Integer.rotateLeft(n4 * -1948176701, 19) ^ 0xCC8822C7;
            n4 = n ^ n4;
            int n5 = n4 ^ 0x2454905E;
            if ((n5 ^ n4) != 609521758) {
                int cfr_ignored_0 = (0x971B3D29 ^ n4) + -1658098556;
            }
            if ((0x257 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x35DB0B04) + dhtj_2 ^ Integer.reverse(n2 + i * -127096409), 24) - khsk);
        }
        return new String(cArray);
    }

    private static boolean rmgh(yf yf2) {
        block0: {
            int n = -402138538;
            int n2 = (n = Integer.rotateLeft(n * 69363999, 12) ^ 0x5CF5AF7B) ^ 0xEEC09DF5;
            if ((n2 ^ n) == -289366539) break block0;
            int cfr_ignored_0 = (0x6C747A3 ^ n) - 458779574;
        }
        return yf2.jfk();
    }

    private static int thzh_4(int n, int n2) {
        block0: {
            int n3 = -1031448250;
            n3 = Integer.rotateLeft(n3 * 1378743363, 6) ^ 0x4D427445;
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 21)) ^ 0x13667FE7;
            if ((n4 ^ n3) == 325484519) break block0;
            int cfr_ignored_0 = (0xD1E326A1 ^ n3) + 1248892028;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String znth_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -293827750;
            n4 = Integer.rotateLeft(n4 * -185993303, 20) ^ 0x88B74497;
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 19)) ^ 0xBE7E5406;
            if ((n5 ^ n4) == -1099017210) break block0;
            int cfr_ignored_0 = (0x5002DF5C ^ n4) + -2049220821;
        }
        return ht_4.sn_2(string, n, n2, n3);
    }

    private static int khkhk(int n, int n2) {
        block0: {
            int n3 = -1760914469;
            int n4 = (n3 = Integer.rotateLeft(n3 * -1903177905, 10) ^ 0xD22AF9C8) ^ 0xC84A62A3;
            if ((n4 ^ n3) == -934649181) break block0;
            int cfr_ignored_0 = (0x5F40F178 ^ n3) - -209007077;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String zzq_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1190548205;
            n4 = Integer.rotateLeft(n4 * -27882865, 10) ^ 0xEF25CA79;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0xDC38757F;
            if ((n5 ^ n4) == -600279681) break block0;
            int cfr_ignored_0 = (0x9ACE2792 ^ n4) - -1817393386;
        }
        return ht_4.sn_2(string, n, n2, n3);
    }

    private static long thykh(yf yf2) {
        block0: {
            int n = -64559521;
            n = Integer.rotateLeft(n * -1982020421, 3) ^ 0xD1ED0214;
            yf yf3 = yf2;
            n = Integer.rotateRight((yf3 != null ? System.identityHashCode(yf3) : 0) ^ n, 21);
            int n2 = n ^ 0x558B632E;
            if ((n2 ^ n) == 1435198254) break block0;
            int cfr_ignored_0 = (0xA9AD8571 ^ n) + -978971900;
        }
        return yf2.awth();
    }

    private static int shghsh(int n, int n2) {
        block0: {
            int n3 = 1138915721;
            n3 = Integer.rotateLeft(n3 * -1096437405, 25) ^ 0x799C8818;
            n3 = Integer.rotateLeft(n ^ n3, 24);
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 7)) ^ 0xBFE4AD49;
            if ((n4 ^ n3) == -1075532471) break block0;
            int cfr_ignored_0 = (0xFC06D4C0 ^ n3) - 1704068962;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String ddl(String string, String string2) {
        block0: {
            int n = tb.zsth_4(-1002822183);
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            String string4 = string2;
            n = Integer.rotateLeft((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 7);
            int n2 = n ^ 0x2E420270;
            if ((n2 ^ n) == 776077936) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xEA7827A9 ^ n, 16) + 1760193714;
            int cfr_ignored_1 = (int)(0x28CA899427D4EB4FL ^ (long)n ^ 0xEE58831A2DB9FC44L);
        }
        return string.concat(string2);
    }

    private static String taf_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 495001911;
            n4 = Integer.rotateLeft(n4 * -974631797, 15) ^ 0xB28AF519;
            int n5 = (n4 = n2 ^ n4) ^ 0xC3AF3D2A;
            if ((n5 ^ n4) == -1011925718) break block0;
            int cfr_ignored_0 = (0xDE2E1C1D ^ n4) - 1628866357;
        }
        return ht_4.sn_2(string, n, n2, n3);
    }

    private static String ddt_7(yf yf2) {
        block0: {
            int n = -719824055;
            n = Integer.rotateLeft(n * -1148016389, 19) ^ 0xF15F4DE0;
            yf yf3 = yf2;
            n = Integer.rotateRight((yf3 != null ? System.identityHashCode(yf3) : 0) ^ n, 10);
            int n2 = n ^ 0xE3FA78BA;
            if ((n2 ^ n) == -470124358) break block0;
            int cfr_ignored_0 = (0x36E223F3 ^ n) - 761319007;
        }
        return yf2.dsn();
    }

    private static boolean jyt(String string, String string2) {
        block0: {
            int n = -78546130;
            n = Integer.rotateLeft(n * -717259211, 19) ^ 0xB13F9754;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0x31BF96AD;
            if ((n2 ^ n) == 834639533) break block0;
            int cfr_ignored_0 = (0xCAEEED83 ^ n) - 191382508;
        }
        return string.equalsIgnoreCase(string2);
    }

    private static String zzd_8(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 200856045;
            n4 = Integer.rotateLeft(n4 * 1244046231, 23) ^ 0x167858ED;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 20);
            int n5 = (n4 = n ^ n4) ^ 0x8E93CBE3;
            if ((n5 ^ n4) == -1902916637) break block0;
            int cfr_ignored_0 = (0x856B1A0E ^ n4) - -1765042998;
        }
        return ht_4.sn_2(string, n, n2, n3);
    }

    private static void hbm(String string) {
        int n = -1004917575;
        n = Integer.rotateLeft(n * -914149247, 26) ^ 0xF8F0377F;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 8);
        int n2 = n ^ 0xBF225EE9;
        if ((n2 ^ n) != -1088266519) {
            int cfr_ignored_0 = (0x7B387250 ^ n) + 1008177231;
        }
        ht_4.hbk(string);
    }

    private static String sjs(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1899899020;
            n4 = Integer.rotateLeft(n4 * -1505493221, 22) ^ 0xF2B529C5;
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 27)) ^ 0x46F50D63;
            if ((n5 ^ n4) == 1190464867) break block0;
            int cfr_ignored_0 = (0x37CB25EF ^ n4) - 371019568;
        }
        return ht_4.sn_2(string, n, n2, n3);
    }

    private static String dhb_5(yf yf2) {
        block0: {
            int n = 2017393505;
            n = Integer.rotateLeft(n * -1897998843, 13) ^ 0x44584C7A;
            yf yf3 = yf2;
            n = (yf3 != null ? System.identityHashCode(yf3) : 0) ^ n;
            int n2 = n ^ 0x466A722A;
            if ((n2 ^ n) == 1181381162) break block0;
            int cfr_ignored_0 = (0x3E54894B ^ n) - -100197003;
        }
        return yf2.dzl_4();
    }

    private static String zqb_2(String string, String string2) {
        block0: {
            int n = 1147638807;
            n = Integer.rotateLeft(n * 64032161, 4) ^ 0x507733D1;
            String string3 = string2;
            n = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 17);
            int n2 = n ^ 0x19C61B17;
            if ((n2 ^ n) == 432413463) break block0;
            int cfr_ignored_0 = (0x5DA18F00 ^ n) - 467592484;
        }
        return string.concat(string2);
    }

    private static int dhthsh(int n) {
        block0: {
            int n2 = tb.zsth_4(-1389152738);
            int n3 = (n2 = n ^ n2) ^ 0xB0E61BEF;
            if ((n3 ^ n2) == -1327096849) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x1DD52DF1 ^ n2, 6) + -1590808726) * 500510193;
            int cfr_ignored_1 = (int)(0xDF6783CC27D4EB4FL ^ (long)n2 ^ 0xFAE8831A2DB8131EL);
        }
        return Integer.reverse(n);
    }

    private static String saz_5(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 749774475;
            n4 = Integer.rotateLeft(n4 * 974914485, 8) ^ 0x43766288;
            int n5 = (n4 = n ^ n4) ^ 0x2866A1C;
            if ((n5 ^ n4) == 42363420) break block0;
            int cfr_ignored_0 = (0x2E36CC97 ^ n4) - -1107444454;
        }
        return ht_4.sn_2(string, n, n2, n3);
    }

    private static String dhzs(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tb.zsth_4(-1800938133);
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 8);
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 21)) ^ 0x49D27714;
            if ((n5 ^ n4) == 1238529812) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xDD75AA7F ^ n4, 14) - -711113572) * -579491201;
        }
        return ht_4.sn_2(string, n, n2, n3);
    }

    private static void sk(String string) {
        int n = -46923298;
        n = Integer.rotateLeft(n * 2082280549, 23) ^ 0xB4EC5971;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x28BA91E4;
        if ((n2 ^ n) != 683315684) {
            int cfr_ignored_0 = (0xD58E903A ^ n) + -2112130882;
        }
        ht_4.hbk(string);
    }

    private static yf stgh_4() {
        block0: {
            int n = -1690407058;
            int n2 = (n = Integer.rotateLeft(n * -1744641249, 18) ^ 0x82B9505F) ^ 0x59449DE5;
            if ((n2 ^ n) == 1497669093) break block0;
            int cfr_ignored_0 = (0xC27AF28B ^ n) + 1724445451;
        }
        return yf.thwt_2();
    }

    private static long bah_2(yf yf2) {
        block0: {
            int n = tb.zsth_4(79341656);
            int n2 = n ^ 0x46A28BD0;
            if ((n2 ^ n) == 1185057744) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x42182388 ^ n, 11) + 88730803;
        }
        return yf2.awth();
    }

    private static String zzh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tb.zsth_4(-1206181151);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0x726242C2;
            if ((n5 ^ n4) == 1919042242) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xCA796023 ^ n4, 12) + -1995422856;
        }
        return ht_4.sn_2(string, n, n2, n3);
    }

    private static String szr_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1879023248;
            n4 = Integer.rotateLeft(n4 * 2081190999, 19) ^ 0x716F3AE5;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 25);
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 9)) ^ 0x758867B3;
            if ((n5 ^ n4) == 1971873715) break block0;
            int cfr_ignored_0 = (0xE58806C3 ^ n4) - -927684368;
        }
        return ht_4.sn_2(string, n, n2, n3);
    }

    private static String ghdn_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1397818346;
            n4 = Integer.rotateLeft(n4 * 1898745805, 13) ^ 0x2F60BA2B;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 26);
            int n5 = (n4 = n ^ n4) ^ 0xF132C240;
            if ((n5 ^ n4) == -248331712) break block0;
            int cfr_ignored_0 = (0xA263C1AA ^ n4) + 223066764;
        }
        return ht_4.sn_2(string, n, n2, n3);
    }

    private static String zshz_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1903593151;
            n4 = Integer.rotateLeft(n4 * -2032094093, 6) ^ 0xF572F1C8;
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 12)) ^ 0xD7359D9F;
            if ((n5 ^ n4) == -684352097) break block0;
            int cfr_ignored_0 = (0xA6431B20 ^ n4) + 352116958;
        }
        return ht_4.sn_2(string, n, n2, n3);
    }

    private static String aad_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1357864530;
            n4 = Integer.rotateLeft(n4 * 1196296293, 18) ^ 0xBE8A14FC;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 20)) ^ 0x854C2A3B;
            if ((n5 ^ n4) == -2058606021) break block0;
            int cfr_ignored_0 = (0x2A5C8B95 ^ n4) + 445358940;
        }
        return ht_4.sn_2(string, n, n2, n3);
    }

    private static void bls_2(String string) {
        int n = -1786798198;
        n = Integer.rotateLeft(n * 555503289, 5) ^ 0x344F113F;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x89F0AD62;
        if ((n2 ^ n) != -1980715678) {
            int cfr_ignored_0 = (0x1C8F32E8 ^ n) + 1248972889;
        }
        ht_4.hbk(string);
    }

    private static int aha_4(int n, int n2) {
        block0: {
            int n3 = 178677119;
            n3 = Integer.rotateLeft(n3 * 1238085601, 15) ^ 0x7301E58;
            n3 = n ^ n3;
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 16)) ^ 0xFFAD8FA9;
            if ((n4 ^ n3) == -5402711) break block0;
            int cfr_ignored_0 = (0xF50BEAD6 ^ n3) - 1067276520;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String ghthh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1841134843;
            n4 = Integer.rotateLeft(n4 * 71769549, 16) ^ 0xDCD19D30;
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 11)) ^ 0xCA6F8B34;
            if ((n5 ^ n4) == -898659532) break block0;
            int cfr_ignored_0 = (0x582D0831 ^ n4) + -1370565114;
        }
        return ht_4.sn_2(string, n, n2, n3);
    }

    private static String thlz(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 11622706;
            n4 = Integer.rotateLeft(n4 * -1201777617, 25) ^ 0x146AD2AF;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 20)) ^ 0x601C562F;
            if ((n5 ^ n4) == 1612469807) break block0;
            int cfr_ignored_0 = (0x60AD0F1D ^ n4) + 2043738355;
        }
        return ht_4.sn_2(string, n, n2, n3);
    }

    private static void hkhh(BufferedReader bufferedReader) {
        int n = 655804275;
        n = Integer.rotateLeft(n * -210950711, 11) ^ 0xC113EFBF;
        BufferedReader bufferedReader2 = bufferedReader;
        n = Integer.rotateLeft((bufferedReader2 != null ? System.identityHashCode(bufferedReader2) : 0) ^ n, 19);
        int n2 = n ^ 0x21E5333C;
        if ((n2 ^ n) != 568668988) {
            int cfr_ignored_0 = (0x6F3F44F ^ n) - -912993798;
        }
        bufferedReader.close();
    }

    private static String[] rghgh(String string) {
        block0: {
            int n = 319311173;
            int n2 = (n = Integer.rotateLeft(n * -1850666477, 25) ^ 0x7F3F888) ^ 0x63B00B09;
            if ((n2 ^ n) == 1672481545) break block0;
            int cfr_ignored_0 = (0x70B8464C ^ n) + -1328710957;
        }
        return string.split("\u0006\u0017", -1);
    }

    private static CallSite slm_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -934484551;
            n3 = Integer.rotateLeft(n3 * -1825574953, 4) ^ 0xA301515C;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 25);
            int n4 = n3 ^ 0x4624C1CB;
            if ((n4 ^ n3) != 1176814027) {
                int cfr_ignored_0 = (0x8E682472 ^ n3) + -509873731;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ dkh_2 ^ string.hashCode() ^ n2 + dhtt + i * -538393789) + dkh_2) ^ dhtt));
            }
            String[] stringArray = ht_4.rghgh(new String(cArray));
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

    private static String[] r868if7hynx(String string) {
        return string.split("\u0006\u0014", -1);
    }

    private static CallSite poz5di5vj(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ mcaymxwsass ^ string.hashCode() ^ n2 + g4pgujemx4l3u ^ i * 389416937 ^ mcaymxwsass, 22) ^ g4pgujemx4l3u));
            }
            String[] stringArray = ht_4.r868if7hynx(new String(cArray));
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

