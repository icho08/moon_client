/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import javax.annotation.Nonnull;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bld;
import us.m0vy.moondlc.m0vyguard.tdhf;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public final class tr_2 {
    private static final tdhf btb;
    private static tdhf rww;
    private static final Map thaa_2;
    private static final int jts_3 = -953887808;
    private static final int khba_2 = -1787714662;
    private static final int rqh = -1951059534;
    private static final int rdhj = -2098530969;
    private static final int q99h4m9t9m = 254304800;
    private static final int pve7wk6a2r = 1159285574;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ri7okjdodu3;

    public static void shbn() {
        int n = 904904599;
        int n2 = (n = Integer.rotateLeft(n * 312946689, 26) ^ 0xEC2D4914) ^ 0xAB431FFA;
        if ((n2 ^ n) != -1421664262) {
            int cfr_ignored_0 = (0x9EACA06D ^ n) - 242230949;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        String string = "/assets/" + Moondlc.dds + "/lang/" + tr_2.bmq(rww) + ".lang";
        try {
            String string2;
            InputStream inputStream = tr_2.class.getResourceAsStream(string);
            if (inputStream == null) {
                throw new RuntimeException("Language file not found: " + string);
            }
            thaa_2.clear();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            int n3 = 0;
            while ((string2 = bufferedReader.readLine()) != null) {
                ++n3;
                if ((string2 = tr_2.thkha(string2).trim()).isEmpty()) continue;
                tr_2.twa_3(string2, n3, string);
            }
            bufferedReader.close();
            inputStream.close();
        }
        catch (IOException iOException) {
            throw new RuntimeException("Failed to load translations for language: " + rww.getCode(), iOException);
        }
    }

    public static void amt(@Nonnull tdhf tdhf2) {
        int n = -1633043542;
        int n2 = (n = Integer.rotateLeft(n * -1902976923, 7) ^ 0x29EB840C) ^ 0xBFF8CF26;
        if ((n2 ^ n) != -1074213082) {
            int cfr_ignored_0 = (0x2151748C ^ n) - 1183790818;
        }
        rww = tdhf2;
        tr_2.shbn();
    }

    public static String ttq_3(String string) {
        block0: {
            int n = 1078508637;
            int n2 = (n = Integer.rotateLeft(n * 2083386275, 12) ^ 0x2DD871CD) ^ 0x8467DD9E;
            if ((n2 ^ n) == -2073567842) break block0;
            int cfr_ignored_0 = (0xC42F61C3 ^ n) + 1720869279;
        }
        return thaa_2.getOrDefault(string, tr_2.atb(string, string));
    }

    public static String zza_3(String string, Object ... objectArray) {
        int n = 1208016786;
        n = Integer.rotateLeft(n * 663464825, 23) ^ 0xBD730E5;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 22);
        int n2 = n ^ 0xFF286A0F;
        if ((n2 ^ n) != -14128625) {
            int cfr_ignored_0 = (0xB728B59D ^ n) - -804645371;
        }
        String string3 = thaa_2.getOrDefault(string, tr_2.shshf(string, string));
        return String.format(string3, objectArray);
    }

    public static String rft(String string) {
        block0: {
            int n = 1240317455;
            n = Integer.rotateLeft(n * 268494875, 14) ^ 0xDC93F33C;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x5B612BB3;
            if ((n2 ^ n) == 1533094835) break block0;
            int cfr_ignored_0 = (0x128C95BC ^ n) + 869267738;
        }
        return thaa_2.getOrDefault(string, tr_2.htz_2(string, " "));
    }

    /*
     * Exception decompiling
     */
    private static String htz_2(String var0, String var1_1) {
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

    private static void twa_3(String string, int n, String string2) {
        int n2;
        int n3 = bld.swh_3(-1607620697);
        int n4 = n3 ^ 0xF6D2E7BF;
        if ((n4 ^ n3) != -153950273) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x56FF4018 ^ n3, 13) + -1924767197) * 1459568665;
        }
        if ((n2 = string.indexOf(Integer.rotateLeft(0x122C213B ^ 0x122C21CF, 30))) == -1) {
            Moondlc.dhrn.warn("Warning: Invalid ".concat("line format at l").concat("ine {} in {}: {}"), new Object[]{n, string2, string});
        } else {
            String string3 = string.substring(0, n2).trim();
            String string4 = string.substring(n2 + 1).trim();
            if (string3.isEmpty()) {
                Moondlc.dhrn.warn("Warning: Empty ke".concat("y at line {} in {}"), (Object)n, (Object)string2);
            } else {
                thaa_2.put(string3, string4);
            }
        }
    }

    private static String thkha(String string) {
        int n;
        int n2 = bld.swh_3(-1132843647);
        int n3 = n2 ^ 0x4CBA1F90;
        if ((n3 ^ n2) != 1287266192) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xF0C03211 ^ n2, 17) + 732147530) * -255839727;
            int cfr_ignored_1 = (int)(0x32729C2C27D4EB4FL ^ (long)n2 ^ 0xC528831A2DB9C934L);
        }
        return (n = string.indexOf("#")) != -1 ? string.substring(0, n) : string;
    }

    @Generated
    private tr_2() {
        throw new UnsupportedOperationException("This is a utility class".concat(" and cannot be instantiated"));
    }

    @Generated
    public static tdhf hqs() {
        block0: {
            int n = 506909521;
            int n2 = (n = Integer.rotateLeft(n * 670514999, 5) ^ 0xEE386E1) ^ 0xE9394808;
            if ((n2 ^ n) == -382121976) break block0;
            int cfr_ignored_0 = (0xF70F9B59 ^ n) - -164624464;
        }
        return rww;
    }

    private static String sms(String string, int n, int n2, int n3) {
        int n4 = 1896010941;
        n4 = Integer.rotateLeft(n4 * -1967214613, 25) ^ 0x47390F77;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 3)) ^ 0xD8B2D5C1;
        if ((n5 ^ n4) != -659368511) {
            int cfr_ignored_0 = (0xA9B0017C ^ n4) + -861717437;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xA7D19D94 ^ n2 - i) + khba_2, 7) ^ jts_3 + i * 1389433031));
        }
        return new String(cArray);
    }

    private static String bmq(tdhf tdhf2) {
        block0: {
            int n = -164989427;
            n = Integer.rotateLeft(n * 1839890079, 17) ^ 0xA9C92184;
            tdhf tdhf3 = tdhf2;
            n = (tdhf3 != null ? System.identityHashCode((Object)tdhf3) : 0) ^ n;
            int n2 = n ^ 0x36BE15DC;
            if ((n2 ^ n) == 918427100) break block0;
            int cfr_ignored_0 = (0xC09463D1 ^ n) - -408752170;
        }
        return tdhf2.getCode();
    }

    private static String atb(String string, String string2) {
        block0: {
            int n = 2014865953;
            int n2 = (n = Integer.rotateLeft(n * -1155171545, 22) ^ 0xB3D6E4AB) ^ 0xB3AC5DD3;
            if ((n2 ^ n) == -1280549421) break block0;
            int cfr_ignored_0 = (0xCBB437F2 ^ n) - -645562636;
        }
        return tr_2.htz_2(string, string2);
    }

    private static String shshf(String string, String string2) {
        block0: {
            int n = -1913831202;
            n = Integer.rotateLeft(n * 2023231739, 25) ^ 0x3F18B1D9;
            String string3 = string2;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0xA2D1BC31;
            if ((n2 ^ n) == -1563313103) break block0;
            int cfr_ignored_0 = (0x2F3CFCEF ^ n) - -1723182774;
        }
        return tr_2.htz_2(string, string2);
    }

    private static String dghl_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bld.swh_3(1712764901);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 7)) ^ 0xF63356C;
            if ((n5 ^ n4) == 258159980) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x69758289 ^ n4, 16) + -912757294;
            int cfr_ignored_1 = (int)(0xABC72CB427D4EB4FL ^ (long)n4 ^ 0xA418831A2DB8FA5FL);
        }
        return tr_2.sms(string, n, n2, n3);
    }

    private static String dhrh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1632337463;
            n4 = Integer.rotateLeft(n4 * -1543627319, 23) ^ 0x8F78CCC0;
            int n5 = (n4 = n ^ n4) ^ 0x233DE432;
            if ((n5 ^ n4) == 591258674) break block0;
            int cfr_ignored_0 = (0x42769A05 ^ n4) - -1946998537;
        }
        return tr_2.sms(string, n, n2, n3);
    }

    private static String tzh_7(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bld.swh_3(-1463789772);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0xB024A4AA;
            if ((n5 ^ n4) == -1339775830) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x18E4F39E ^ n4, 6) - 135733085) * 417657759;
        }
        return tr_2.sms(string, n, n2, n3);
    }

    private static String sdth(String string, String string2) {
        block0: {
            int n = -2105558886;
            n = Integer.rotateLeft(n * 570278091, 12) ^ 0x7D3F70FF;
            String string3 = string;
            n = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 19);
            int n2 = n ^ 0xDC4A801;
            if ((n2 ^ n) == 230991873) break block0;
            int cfr_ignored_0 = (0x8FBB109B ^ n) + 1455048594;
        }
        return string.concat(string2);
    }

    private static int dhzdh(int n) {
        block0: {
            int n2 = -1630991921;
            n2 = Integer.rotateLeft(n2 * 1288327665, 9) ^ 0xC2F8A88F;
            int n3 = (n2 = n ^ n2) ^ 0x58C829DD;
            if ((n3 ^ n2) == 1489512925) break block0;
            int cfr_ignored_0 = (0xC6012012 ^ n2) + 1446752342;
        }
        return Integer.reverse(n);
    }

    private static String tshm(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 2138229429;
            n4 = Integer.rotateLeft(n4 * 653606797, 9) ^ 0x5B65EA74;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 13);
            int n5 = (n4 = n ^ n4) ^ 0x957D6CDF;
            if ((n5 ^ n4) == -1786942241) break block0;
            int cfr_ignored_0 = (0xEA0FA66A ^ n4) - -1509464444;
        }
        return tr_2.sms(string, n, n2, n3);
    }

    private static String zqt(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 69811676;
            n4 = Integer.rotateLeft(n4 * -1575653135, 13) ^ 0xBCF6509F;
            n4 = n2 ^ n4;
            int n5 = (n4 = n3 ^ n4) ^ 0x9DA80FD9;
            if ((n5 ^ n4) == -1649930279) break block0;
            int cfr_ignored_0 = (0x99813205 ^ n4) + -435041583;
        }
        return tr_2.sms(string, n, n2, n3);
    }

    private static String bba(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1808655962;
            n4 = Integer.rotateLeft(n4 * -1960382937, 25) ^ 0xD8BEB78;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0xA805AE48;
            if ((n5 ^ n4) == -1476022712) break block0;
            int cfr_ignored_0 = (0xC3C84812 ^ n4) - 1786505194;
        }
        return tr_2.sms(string, n, n2, n3);
    }

    private static String ahgh(String string, String string2) {
        block0: {
            int n = 1795430230;
            n = Integer.rotateLeft(n * 816699365, 24) ^ 0xCE84D843;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0x59220F2D;
            if ((n2 ^ n) == 1495404333) break block0;
            int cfr_ignored_0 = (0x3226187B ^ n) - -965266941;
        }
        return string.concat(string2);
    }

    private static String dzm_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -2057298196;
            n4 = Integer.rotateLeft(n4 * -1872792369, 21) ^ 0xA4ED40DF;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 14);
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 16)) ^ 0x611B7D8E;
            if ((n5 ^ n4) == 1629191566) break block0;
            int cfr_ignored_0 = (0xE47B6362 ^ n4) + -2075262510;
        }
        return tr_2.sms(string, n, n2, n3);
    }

    private static String shfh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -547026982;
            n4 = Integer.rotateLeft(n4 * 1789090365, 27) ^ 0xF8F56EE1;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 20);
            int n5 = (n4 = n2 ^ n4) ^ 0x97FCD8D6;
            if ((n5 ^ n4) == -1745037098) break block0;
            int cfr_ignored_0 = (0x4899DF0C ^ n4) + -1147126287;
        }
        return tr_2.sms(string, n, n2, n3);
    }

    private static String bdkh_2(String string, String string2) {
        block0: {
            int n = bld.swh_3(-209427020);
            int n2 = n ^ 0x5633B2D9;
            if ((n2 ^ n) == 1446228697) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xA5B7D76D ^ n, 7) - 362853742;
            int cfr_ignored_1 = (int)(0x6705795027D4EB4FL ^ (long)n ^ 0xFD0831A2DB963DBL);
        }
        return string.concat(string2);
    }

    private static int dtz_4(int n) {
        block0: {
            int n2 = -1453501297;
            int n3 = (n2 = Integer.rotateLeft(n2 * 925145799, 3) ^ 0x4C906687) ^ 0x7DE1B2B1;
            if ((n3 ^ n2) == 2111943345) break block0;
            int cfr_ignored_0 = (0xD4BCE63E ^ n2) + -1693759218;
        }
        return Integer.reverse(n);
    }

    private static boolean tn(String string, Object object) {
        block0: {
            int n = -781185314;
            int n2 = (n = Integer.rotateLeft(n * -2081749913, 21) ^ 0x83865311) ^ 0xC7BC27C0;
            if ((n2 ^ n) == -943970368) break block0;
            int cfr_ignored_0 = (0x16CC291E ^ n) + -1372844862;
        }
        return string.equals(object);
    }

    private static boolean thqz_2(String string, Object object) {
        block0: {
            int n = -323216122;
            n = Integer.rotateLeft(n * -1954515833, 9) ^ 0xDB4B2F90;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 23);
            Object object2 = object;
            n = Integer.rotateLeft((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 23);
            int n2 = n ^ 0x271ECE46;
            if ((n2 ^ n) == 656330310) break block0;
            int cfr_ignored_0 = (0xCBA2D340 ^ n) + -993192215;
        }
        return string.equals(object);
    }

    private static String ghtdh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1857493435;
            n4 = Integer.rotateLeft(n4 * 1035306029, 15) ^ 0x8D534A8B;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0x82EFDDC7;
            if ((n5 ^ n4) == -2098209337) break block0;
            int cfr_ignored_0 = (0x13A73B82 ^ n4) + 804713284;
        }
        return tr_2.sms(string, n, n2, n3);
    }

    private static String rsz(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1742605780;
            n4 = Integer.rotateLeft(n4 * 644881319, 25) ^ 0xC85A3DB7;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 12);
            int n5 = n4 ^ 0x19073263;
            if ((n5 ^ n4) == 419902051) break block0;
            int cfr_ignored_0 = (0x8126C04F ^ n4) + -613239270;
        }
        return tr_2.sms(string, n, n2, n3);
    }

    private static boolean adj_2(String string, Object object) {
        block0: {
            int n = -206757395;
            n = Integer.rotateLeft(n * 345659799, 10) ^ 0x5CBC026B;
            Object object2 = object;
            n = Integer.rotateLeft((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 17);
            int n2 = n ^ 0x8A5F0F41;
            if ((n2 ^ n) == -1973481663) break block0;
            int cfr_ignored_0 = (0x79F22EAC ^ n) + 1055437996;
        }
        return string.equals(object);
    }

    private static int tmz_2(int n) {
        block0: {
            int n2 = bld.swh_3(852368246);
            int n3 = (n2 = n ^ n2) ^ 0xC6730778;
            if ((n3 ^ n2) == -965539976) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xF4BD1C0E ^ n2, 17) - -1488714515;
        }
        return Integer.reverse(n);
    }

    private static int skl(int n, int n2) {
        block0: {
            int n3 = bld.swh_3(1851953243);
            n3 = Integer.rotateLeft(n ^ n3, 3);
            int n4 = (n3 = n2 ^ n3) ^ 0xB72DE493;
            if ((n4 ^ n3) == -1221729133) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xD94F74C8 ^ n3, 14) + 1425851251;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int shah(int n) {
        block0: {
            int n2 = -1688481863;
            int n3 = (n2 = Integer.rotateLeft(n2 * -395897417, 8) ^ 0x460C3684) ^ 0x37E8B8D4;
            if ((n3 ^ n2) == 937998548) break block0;
            int cfr_ignored_0 = (0xACB3776D ^ n2) + 1260560227;
        }
        return Integer.reverse(n);
    }

    private static String shr_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bld.swh_3(1332416032);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 26)) ^ 0x1DE6C834;
            if ((n5 ^ n4) == 501663796) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x528DC614 ^ n4, 13) - 59284391) * 1385022997;
        }
        return tr_2.sms(string, n, n2, n3);
    }

    private static boolean daj(String string, Object object) {
        block0: {
            int n = -1182398812;
            int n2 = (n = Integer.rotateLeft(n * 1400945319, 14) ^ 0x7135B32C) ^ 0xC53EC8E9;
            if ((n2 ^ n) == -985741079) break block0;
            int cfr_ignored_0 = (0x7CB8CE4D ^ n) + -854202542;
        }
        return string.equals(object);
    }

    private static int thdhy(int n, int n2) {
        block0: {
            int n3 = 1259237024;
            n3 = Integer.rotateLeft(n3 * -1047138577, 19) ^ 0xACAEF1B6;
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0x83A56B7D;
            if ((n4 ^ n3) == -2086311043) break block0;
            int cfr_ignored_0 = (0xC8AB05DD ^ n3) - 1932639887;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String dzz_7(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 2044020650;
            n4 = Integer.rotateLeft(n4 * 1715662819, 23) ^ 0xD14E3A03;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 28);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 16)) ^ 0x23E6EBBB;
            if ((n5 ^ n4) == 602336187) break block0;
            int cfr_ignored_0 = (0x5A33AC11 ^ n4) + 1809472844;
        }
        return tr_2.sms(string, n, n2, n3);
    }

    private static String jdhm(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -613334753;
            n4 = Integer.rotateLeft(n4 * 856663463, 17) ^ 0x1195027;
            n4 = Integer.rotateRight(n ^ n4, 16);
            int n5 = (n4 = n2 ^ n4) ^ 0x4D60BB42;
            if ((n5 ^ n4) == 1298185026) break block0;
            int cfr_ignored_0 = (0x9611FA5D ^ n4) + -1889198783;
        }
        return tr_2.sms(string, n, n2, n3);
    }

    private static int szh_7(int n) {
        block0: {
            int n2 = -1124239712;
            n2 = Integer.rotateLeft(n2 * 1903711507, 5) ^ 0x5A440425;
            int n3 = (n2 = n ^ n2) ^ 0xB6734623;
            if ((n3 ^ n2) == -1233959389) break block0;
            int cfr_ignored_0 = (0xA8E3083 ^ n2) + -916718838;
        }
        return Integer.reverse(n);
    }

    private static int sts_4(int n, int n2) {
        block0: {
            int n3 = -1164073573;
            n3 = Integer.rotateLeft(n3 * 51542109, 4) ^ 0x1A7B2F94;
            n3 = Integer.rotateLeft(n ^ n3, 28);
            int n4 = (n3 = n2 ^ n3) ^ 0x12168699;
            if ((n4 ^ n3) == 303466137) break block0;
            int cfr_ignored_0 = (0xA88B2302 ^ n3) - -1486806719;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String jws_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1139716634;
            n4 = Integer.rotateLeft(n4 * 2037866311, 11) ^ 0x35421813;
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 29)) ^ 0xCD69A52A;
            if ((n5 ^ n4) == -848714454) break block0;
            int cfr_ignored_0 = (0x8E871730 ^ n4) - -1734398810;
        }
        return tr_2.sms(string, n, n2, n3);
    }

    private static String[] alt_2(String string) {
        int n = bld.swh_3(-1753628534);
        int n2 = n ^ 0xFF0CC74C;
        if ((n2 ^ n) != -15939764) {
            int cfr_ignored_0 = Integer.rotateRight(0x687507C6 ^ n, 16) - -1433825227;
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

    private static CallSite zdb_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1297696189;
            n3 = Integer.rotateLeft(n3 * -640454775, 17) ^ 0x4045006E;
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            n3 = Integer.rotateRight(n ^ n3, 2);
            int n4 = n3 ^ 0xBC8C1A9B;
            if ((n4 ^ n3) != -1131668837) {
                int cfr_ignored_0 = (0xF1D55F26 ^ n3) - -625388605;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ rqh ^ string.hashCode() ^ n2 + rdhj ^ i * -73994289 ^ rqh, 13) ^ rdhj));
            }
            String[] stringArray = tr_2.alt_2(new String(cArray));
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

    private static String[] owdr15nykww(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite d8gghgr4kip(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ q99h4m9t9m ^ string.hashCode() ^ n2 + pve7wk6a2r + i * -822316791) + q99h4m9t9m) ^ pve7wk6a2r));
            }
            String[] stringArray = tr_2.owdr15nykww(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

