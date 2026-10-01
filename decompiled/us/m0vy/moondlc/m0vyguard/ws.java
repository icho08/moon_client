/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import net.minecraft.class_2561;
import us.m0vy.moondlc.m0vyguard.bths_2;
import us.m0vy.moondlc.m0vyguard.bthn;
import us.m0vy.moondlc.m0vyguard.bdht_2;
import us.m0vy.moondlc.m0vyguard.bsj;
import us.m0vy.moondlc.m0vyguard.bzh_4;
import us.m0vy.moondlc.m0vyguard.bwy;
import us.m0vy.moondlc.m0vyguard.tr_2;
import us.m0vy.moondlc.m0vyguard.ah_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class ws {
    private static final int dhmj = -1089526824;
    private static final int sbn_2 = -64980945;
    private static final int rnd = -1995223589;
    private static final int hmz_2 = -1323365114;
    private static final int s2fs3iop = 898519239;
    private static final int kb869yols1 = 1692574476;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ii6uz3add;

    public bthn dhshm() {
        block0: {
            int n = 1307683123;
            n = Integer.rotateLeft(n * 216949039, 28) ^ 0x6D2801EE;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xC77CD71C;
            if ((n2 ^ n) == -948119780) break block0;
            int cfr_ignored_0 = (0x8A8D7E2F ^ n) - -924823904;
        }
        return ws.zsha_2(bdht_2.jngh("prefix", this::btf));
    }

    /*
     * Exception decompiling
     */
    private void thha_3(bths_2 var1_1) {
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

    private void btf(bdht_2 bdht2) {
        int n = -1088803873;
        n = Integer.rotateLeft(n * -656610575, 14) ^ 0x9B9A0DE1;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x4FDBACF7;
        if ((n2 ^ n) != 1339796727) {
            int cfr_ignored_0 = (0xF0C18728 ^ n) + 1854045765;
        }
        bdht2.brsh("commands.prefix.description").dqdh_2("action", ws::dys_4).dqdh_2("new", ws::zwkh).jmz(this::thha_3);
    }

    private static void zwkh(bsj bsj2) {
        int n = 1344031683;
        n = Integer.rotateLeft(n * -417014751, 23) ^ 0x3157684E;
        bsj bsj3 = bsj2;
        n = Integer.rotateRight((bsj3 != null ? System.identityHashCode(bsj3) : 0) ^ n, 20);
        int n2 = n ^ 0x6A71C754;
        if ((n2 ^ n) != 1785841492) {
            int cfr_ignored_0 = (0x3A6D8C97 ^ n) - 43543496;
        }
        bsj2.tkn().tkk_2(ws::djgh);
    }

    private static ah_2 djgh(String string) {
        int n = 1383981635;
        int n2 = (n = Integer.rotateLeft(n * -1268695951, 12) ^ 0x9A97C7B5) ^ 0xB4755A1A;
        if ((n2 ^ n) != -1267377638) {
            int cfr_ignored_0 = (0xE608B859 ^ n) - 1438440354;
        }
        return (ah_2)((Object)(string.length() > 1 ? ah_2.thsdh_2(tr_2.ttq_3("commands.prefi".concat("x.invalid_length"))) : ah_2.tsy(string)));
    }

    private static void dys_4(bsj bsj2) {
        int n = -1502847779;
        int n2 = (n = Integer.rotateLeft(n * 2096879329, 16) ^ 0xF80FD059) ^ 0xD438A89C;
        if ((n2 ^ n) != -734484324) {
            int cfr_ignored_0 = (0x7254F441 ^ n) - 1452532618;
        }
        bsj2.tkn().dby_2("list", "clear", "default", "set", "create");
    }

    private static String ghthq(String string, int n, int n2, int n3) {
        int n4 = 1039383671;
        n4 = Integer.rotateLeft(n4 * 1135719969, 9) ^ 0x8C0C1C14;
        n4 = n ^ n4;
        int n5 = (n4 = n2 ^ n4) ^ 0x1798CDDB;
        if ((n5 ^ n4) != 395890139) {
            int cfr_ignored_0 = (0x2A6B71AC ^ n4) + 1258692729;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xEF271D42 ^ n2 - i) + sbn_2, 7) ^ dhmj + i * -1319043131));
        }
        return new String(cArray);
    }

    private static String jth_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 326453728;
            n4 = Integer.rotateLeft(n4 * 1134892485, 8) ^ 0x2B11EAA9;
            n4 = Integer.rotateLeft(n2 ^ n4, 3);
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 22)) ^ 0x49148F0F;
            if ((n5 ^ n4) == 1226084111) break block0;
            int cfr_ignored_0 = (0x5A61C6EF ^ n4) - -2037694827;
        }
        return ws.ghthq(string, n, n2, n3);
    }

    private static bthn zsha_2(bdht_2 bdht2) {
        block0: {
            int n = 2102621925;
            int n2 = (n = Integer.rotateLeft(n * -76876581, 23) ^ 0xF34B1BFF) ^ 0x467F519E;
            if ((n2 ^ n) == 1182749086) break block0;
            int cfr_ignored_0 = (0x3B2C277B ^ n) + -1092441025;
        }
        return bdht2.szy_2();
    }

    private static List shghj(bths_2 bths2) {
        block0: {
            int n = 232481915;
            int n2 = (n = Integer.rotateLeft(n * 1754142787, 21) ^ 0xEE4B7372) ^ 0xDC57B458;
            if ((n2 ^ n) == -598231976) break block0;
            int cfr_ignored_0 = (0xD18CD023 ^ n) - 1884057761;
        }
        return bths2.arguments();
    }

    private static Moondlc zat_2() {
        block0: {
            int n = bwy.tsgh(-954725282);
            int n2 = n ^ 0xCD512431;
            if ((n2 ^ n) == -850320335) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xA49286F ^ n, 4) - 1127842988;
        }
        return Moondlc.getInstance();
    }

    private static int jdhz_2(int n, int n2) {
        block0: {
            int n3 = -1504639884;
            n3 = Integer.rotateLeft(n3 * -994612887, 27) ^ 0x61DE5FA2;
            int n4 = (n3 = n ^ n3) ^ 0x1CF04C85;
            if ((n4 ^ n3) == 485510277) break block0;
            int cfr_ignored_0 = (0xBAA148F1 ^ n3) - -841913926;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String dbr(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -298035288;
            n4 = Integer.rotateLeft(n4 * -2071511211, 24) ^ 0x7ACAF4FE;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 21);
            int n5 = (n4 = n ^ n4) ^ 0xB35E8179;
            if ((n5 ^ n4) == -1285652103) break block0;
            int cfr_ignored_0 = (0x5D62D6D1 ^ n4) + -1936176546;
        }
        return ws.ghthq(string, n, n2, n3);
    }

    private static int zshs(int n) {
        block0: {
            int n2 = 2057600138;
            int n3 = (n2 = Integer.rotateLeft(n2 * -988249183, 4) ^ 0x879D3700) ^ 0xAA9EE6EA;
            if ((n3 ^ n2) == -1432426774) break block0;
            int cfr_ignored_0 = (0xD03A9A60 ^ n2) - 1890213573;
        }
        return Integer.reverse(n);
    }

    private static int akt_2(int n) {
        block0: {
            int n2 = 542515701;
            n2 = Integer.rotateLeft(n2 * -2040740193, 4) ^ 0x5444C0E4;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 28)) ^ 0xA139C12F;
            if ((n3 ^ n2) == -1590050513) break block0;
            int cfr_ignored_0 = (0x816FE0DA ^ n2) + 2103924343;
        }
        return Integer.reverse(n);
    }

    private static int sjl(int n) {
        block0: {
            int n2 = 946851157;
            n2 = Integer.rotateLeft(n2 * 817366259, 27) ^ 0x4B14968F;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 6)) ^ 0xCC64226E;
            if ((n3 ^ n2) == -865852818) break block0;
            int cfr_ignored_0 = (0xF40BEF3B ^ n2) - 170831190;
        }
        return Integer.reverse(n);
    }

    private static int awt_3(int n) {
        block0: {
            int n2 = -1449924708;
            int n3 = (n2 = Integer.rotateLeft(n2 * 527576073, 4) ^ 0xA1CF02E6) ^ 0xE3E735C3;
            if ((n3 ^ n2) == -471386685) break block0;
            int cfr_ignored_0 = (0x4A74D25F ^ n2) + -262759589;
        }
        return Integer.reverse(n);
    }

    private static String rzsh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1404668463;
            n4 = Integer.rotateLeft(n4 * -2069085149, 3) ^ 0xAA874A3A;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 23);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 2)) ^ 0x216C40EB;
            if ((n5 ^ n4) == 560742635) break block0;
            int cfr_ignored_0 = (0x72D5CAC4 ^ n4) - -1506872269;
        }
        return ws.ghthq(string, n, n2, n3);
    }

    private static boolean tay(String string, Object object) {
        block0: {
            int n = -1013363341;
            n = Integer.rotateLeft(n * 1074318879, 3) ^ 0xADB38EBB;
            Object object2 = object;
            n = Integer.rotateLeft((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 4);
            int n2 = n ^ 0x6D0BD56A;
            if ((n2 ^ n) == 1829492074) break block0;
            int cfr_ignored_0 = (0xAE929819 ^ n) - 683279366;
        }
        return string.equals(object);
    }

    private static class_2561 ddf(String string) {
        block0: {
            int n = 1719597245;
            n = Integer.rotateLeft(n * 717666277, 17) ^ 0x32AB1891;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 6);
            int n2 = n ^ 0x93D744C1;
            if ((n2 ^ n) == -1814608703) break block0;
            int cfr_ignored_0 = (0xF5A9BC7C ^ n) - -1592703480;
        }
        return class_2561.method_30163((String)string);
    }

    private static String thbd_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 837585534;
            n4 = Integer.rotateLeft(n4 * 32817289, 10) ^ 0x7B292D34;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 28)) ^ 0x238F8AF5;
            if ((n5 ^ n4) == 596609781) break block0;
            int cfr_ignored_0 = (0x1263008B ^ n4) - -99771364;
        }
        return ws.ghthq(string, n, n2, n3);
    }

    private static String ddhk_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1748224791;
            n4 = Integer.rotateLeft(n4 * -2121846955, 16) ^ 0x1C35FE1F;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = n4 ^ 0xC19B3D36;
            if ((n5 ^ n4) == -1046790858) break block0;
            int cfr_ignored_0 = (0x565709DF ^ n4) + -491667007;
        }
        return ws.ghthq(string, n, n2, n3);
    }

    private static boolean drt_4(String string) {
        block0: {
            int n = -1577554054;
            int n2 = (n = Integer.rotateLeft(n * 1445811959, 28) ^ 0x9EC7470) ^ 0xD7C1C15F;
            if ((n2 ^ n) == -675167905) break block0;
            int cfr_ignored_0 = (0x7639AE25 ^ n) - -991452450;
        }
        return string.isEmpty();
    }

    private static String hghd_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bwy.tsgh(1588645301);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = n4 ^ 0x8541C089;
            if ((n5 ^ n4) == -2059288439) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xDBF10D3C ^ n4, 14) - -1500628609) * -604959427;
        }
        return ws.ghthq(string, n, n2, n3);
    }

    private static String tdhh_4(String string, String string2) {
        block0: {
            int n = -1409597168;
            n = Integer.rotateLeft(n * 691245371, 19) ^ 0x1CC3BF5D;
            String string3 = string;
            n = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 29);
            int n2 = n ^ 0xD9536A12;
            if ((n2 ^ n) == -648844782) break block0;
            int cfr_ignored_0 = (0x72A82B02 ^ n) + -413965363;
        }
        return string.concat(string2);
    }

    private static String ast(String string) {
        block0: {
            int n = -2015635287;
            int n2 = (n = Integer.rotateLeft(n * 44191719, 18) ^ 0xCE4A0FA8) ^ 0x9C577DD5;
            if ((n2 ^ n) == -1671987755) break block0;
            int cfr_ignored_0 = (0x1B8CA57C ^ n) + 777163028;
        }
        return tr_2.ttq_3(string);
    }

    private static class_2561 hdsh(String string) {
        block0: {
            int n = bwy.tsgh(-1621531212);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xAAE21F4E;
            if ((n2 ^ n) == -1428021426) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x35BB7AFA ^ n, 9) + -2045672575) * 901479163;
        }
        return class_2561.method_30163((String)string);
    }

    private static void thqs_2(class_2561 class_25612) {
        int n = bwy.tsgh(49483116);
        class_2561 class_25613 = class_25612;
        n = Integer.rotateRight((class_25613 != null ? System.identityHashCode(class_25613) : 0) ^ n, 18);
        int n2 = n ^ 0x76ACA60E;
        if ((n2 ^ n) != 1991026190) {
            int cfr_ignored_0 = Integer.rotateRight(0x745FAB62 ^ n, 17) + 468934681;
        }
        bzh_4.dhght_2(class_25612);
    }

    private static String khmh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1325089136;
            n4 = Integer.rotateLeft(n4 * 1621183847, 19) ^ 0x8EEC965F;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 22)) ^ 0xF62FAE0C;
            if ((n5 ^ n4) == -164647412) break block0;
            int cfr_ignored_0 = (0x472B109C ^ n4) + -21999581;
        }
        return ws.ghthq(string, n, n2, n3);
    }

    private static int sshs_2(int n) {
        block0: {
            int n2 = 1962428268;
            int n3 = (n2 = Integer.rotateLeft(n2 * -895492747, 13) ^ 0x76F5025B) ^ 0xC106C789;
            if ((n3 ^ n2) == -1056520311) break block0;
            int cfr_ignored_0 = (0xB5FE80E5 ^ n2) + -1903150220;
        }
        return Integer.reverse(n);
    }

    private static class_2561 thsf(String string) {
        block0: {
            int n = bwy.tsgh(888505860);
            int n2 = n ^ 0x63578630;
            if ((n2 ^ n) == 1666680368) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x57A20034 ^ n, 13) - -1594120825) * 1470234677;
        }
        return class_2561.method_30163((String)string);
    }

    private static void azt_4(class_2561 class_25612) {
        int n = -57078303;
        int n2 = (n = Integer.rotateLeft(n * -395940469, 3) ^ 0x9861334) ^ 0xED602677;
        if ((n2 ^ n) != -312465801) {
            int cfr_ignored_0 = (0x11F92B96 ^ n) + 510885100;
        }
        bzh_4.ttht_3(class_25612);
    }

    private static String[] hfq(String string) {
        block0: {
            int n = 493777992;
            n = Integer.rotateLeft(n * -853974335, 14) ^ 0x33D2CAD7;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x965E8415;
            if ((n2 ^ n) == -1772190699) break block0;
            int cfr_ignored_0 = (0x8B30F05D ^ n) - 293301046;
        }
        return string.split("\u0005\u001b", -1);
    }

    private static CallSite dhhd(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -163586965;
            n3 = Integer.rotateLeft(n3 * -97399355, 22) ^ 0x89AACAEB;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 17);
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 28);
            int n4 = n3 ^ 0xA59B31C4;
            if ((n4 ^ n3) != -1516555836) {
                int cfr_ignored_0 = (0x53A4EDAF ^ n3) + -1523588789;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ rnd ^ string.hashCode()) + (n2 + hmz_2) + i ^ rnd, 19) + hmz_2);
            }
            String[] stringArray = ws.hfq(new String(cArray));
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

    private static String[] thhjbrr1(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite yx3ykgvkjoa(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ s2fs3iop ^ string.hashCode() ^ n2 + kb869yols1 ^ i * -533365149 ^ s2fs3iop, 26) ^ kb869yols1));
            }
            String[] stringArray = ws.thhjbrr1(new String(cArray));
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

