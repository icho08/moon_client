/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bma;
import us.m0vy.moondlc.m0vyguard.tsz;

public class tdhdh {
    private static final int zdd = 0;
    private static final int hhr = 1;
    private static final int shwd = 2;
    private static final int rkha_2 = 3;
    private static final int thas_2 = 4;
    private static final int khaz = 5;
    private static final int zak_2 = 6;
    private static final int thzq_2 = 7;
    private static final int has_2 = 8;
    private static final int swsh = 9;
    private static final int thth_6 = 10;
    private static final int khhs_2 = 11;
    private static final int khjdh = 12;
    private static final int kha_2 = 13;
    private static final int khfq = 14;
    private static final int bst = 15;
    private static final int thddh = 16;
    private static final int zkhk = 17;
    private static final int sla_2 = 18;
    private static final int jtdh = 19;
    private static final int hthz_2 = 20;
    private static final int bshj = 21;
    private static final int tqs_2 = 22;
    private static final int sh_3 = 23;
    private static final int bkr = 24;
    private static final int zzd_3 = 25;
    private static final int jwn = 26;
    private static final int zla_2 = 27;
    private static final int hthth = 28;
    private static final int shthj = 29;
    private static final int zkhn = 30;
    private static final bma[] skz_2;
    private static final int saq = -2012812124;
    private static final int dkhs = 1526436707;
    private static final int zshd_2 = 496972467;
    private static final int jjm = -645714232;
    private static final int arqrzxa = -847473470;
    private static final int xnbvt3edm3 = 1093041716;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int zv1st2gy8ltd;

    /*
     * Exception decompiling
     */
    public static bma dhsm(String var0) {
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

    private static String shym(String string, int n, int n2, int n3) {
        int n4 = tsz.tzt_2(745388779);
        n4 = Integer.rotateLeft(n2 ^ n4, 7);
        int n5 = (n4 = n3 ^ n4) ^ 0x27CE1EE1;
        if ((n5 ^ n4) != 667819745) {
            int cfr_ignored_0 = Integer.rotateRight(0xBA3A40A ^ n4, 4) + 1831763057;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xE361DC3A ^ n2 ^ i * -471213691 ^ saq, 17) ^ dkhs));
        }
        return new String(cArray);
    }

    private static int bkhr(int n) {
        block0: {
            int n2 = 1734755306;
            n2 = Integer.rotateLeft(n2 * 587236061, 17) ^ 0x4A241FA3;
            int n3 = (n2 = n ^ n2) ^ 0x7979D8BF;
            if ((n3 ^ n2) == 2038028479) break block0;
            int cfr_ignored_0 = (0x1E1F9B55 ^ n2) - -1959131638;
        }
        return Integer.reverse(n);
    }

    private static String bal_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tsz.tzt_2(1723511177);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 6)) ^ 0x74A0228C;
            if ((n5 ^ n4) == 1956651660) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x121A9305 ^ n4, 5) - 898985174;
            int cfr_ignored_1 = (int)(0xD0A83D3827D4EB4FL ^ (long)n4 ^ 0x8700831A2DB80C81L);
        }
        return tdhdh.shym(string, n, n2, n3);
    }

    private static String ththt(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1674060673;
            n4 = Integer.rotateLeft(n4 * 1196060673, 9) ^ 0xF3A0C298;
            n4 = Integer.rotateLeft(n ^ n4, 12);
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 15)) ^ 0x8482DCB0;
            if ((n5 ^ n4) == -2071798608) break block0;
            int cfr_ignored_0 = (0x18B500CF ^ n4) - 1173495731;
        }
        return tdhdh.shym(string, n, n2, n3);
    }

    private static String thsb(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -508037320;
            n4 = Integer.rotateLeft(n4 * -1555848193, 21) ^ 0xB6D8E338;
            n4 = Integer.rotateLeft(n ^ n4, 29);
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 26)) ^ 0xA99A0184;
            if ((n5 ^ n4) == -1449524860) break block0;
            int cfr_ignored_0 = (0x482DF6BC ^ n4) + 983786181;
        }
        return tdhdh.shym(string, n, n2, n3);
    }

    private static String djgh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -688805975;
            n4 = Integer.rotateLeft(n4 * 1295704177, 16) ^ 0x86293BEA;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x40B95A36;
            if ((n5 ^ n4) == 1085889078) break block0;
            int cfr_ignored_0 = (0x9648FD9F ^ n4) + -623411419;
        }
        return tdhdh.shym(string, n, n2, n3);
    }

    private static boolean tat_7(String string, Object object) {
        block0: {
            int n = tsz.tzt_2(1761527784);
            int n2 = n ^ 0x3A022008;
            if ((n2 ^ n) == 973217800) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x52FCE7E0 ^ n, 13) + 285061979;
        }
        return string.equals(object);
    }

    private static int jlw(int n, int n2) {
        block0: {
            int n3 = -2118926169;
            n3 = Integer.rotateLeft(n3 * 1080935007, 13) ^ 0x42831C6;
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 18)) ^ 0x8E2BA715;
            if ((n4 ^ n3) == -1909741803) break block0;
            int cfr_ignored_0 = (0xF9867B2 ^ n3) + 1218953720;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static boolean tdk_4(String string, Object object) {
        block0: {
            int n = 794356448;
            n = Integer.rotateLeft(n * -748023255, 4) ^ 0x379D3EE1;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 22);
            Object object2 = object;
            n = (object2 != null ? System.identityHashCode(object2) : 0) ^ n;
            int n2 = n ^ 0xB5B60F96;
            if ((n2 ^ n) == -1246359658) break block0;
            int cfr_ignored_0 = (0x9AEEE576 ^ n) - -28431064;
        }
        return string.equals(object);
    }

    private static String byk(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1731361724;
            n4 = Integer.rotateLeft(n4 * -1082463465, 3) ^ 0xFCDA49C;
            n4 = n ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0xD7DAA9A0;
            if ((n5 ^ n4) == -673535584) break block0;
            int cfr_ignored_0 = (0x4F172DE4 ^ n4) - -848711690;
        }
        return tdhdh.shym(string, n, n2, n3);
    }

    private static int tthz_4(int n, int n2) {
        block0: {
            int n3 = -836838697;
            n3 = Integer.rotateLeft(n3 * 1262372139, 5) ^ 0x8FA5EE3C;
            int n4 = (n3 = n ^ n3) ^ 0x138C3419;
            if ((n4 ^ n3) == 327955481) break block0;
            int cfr_ignored_0 = (0xDD92EECE ^ n3) + 1121256664;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String snb(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -419815237;
            n4 = Integer.rotateLeft(n4 * 612969717, 13) ^ 0x306CFEDA;
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 20)) ^ 0x974A7C38;
            if ((n5 ^ n4) == -1756726216) break block0;
            int cfr_ignored_0 = (0x71B05C83 ^ n4) - 1425191698;
        }
        return tdhdh.shym(string, n, n2, n3);
    }

    private static String athd_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -2005335721;
            n4 = Integer.rotateLeft(n4 * 1615346827, 10) ^ 0xC912AAA;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0xA8C4F641;
            if ((n5 ^ n4) == -1463486911) break block0;
            int cfr_ignored_0 = (0x20BDF716 ^ n4) + -1717923919;
        }
        return tdhdh.shym(string, n, n2, n3);
    }

    private static boolean and(String string, Object object) {
        block0: {
            int n = -980873132;
            n = Integer.rotateLeft(n * 1334272047, 22) ^ 0x7204CC22;
            Object object2 = object;
            n = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 9);
            int n2 = n ^ 0x7FB6C83A;
            if ((n2 ^ n) == 2142685242) break block0;
            int cfr_ignored_0 = (0xBA3FD86E ^ n) + -324034113;
        }
        return string.equals(object);
    }

    private static int thrgh(int n, int n2) {
        block0: {
            int n3 = tsz.tzt_2(-353704972);
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0x1BC426F;
            if ((n4 ^ n3) == 29114991) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xEB56A19B ^ n3, 16) + -2082787072) * -346644069;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String khdz_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 441022428;
            n4 = Integer.rotateLeft(n4 * 1787289315, 10) ^ 0xDDE0D825;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 21);
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 9)) ^ 0x2A7D1994;
            if ((n5 ^ n4) == 712841620) break block0;
            int cfr_ignored_0 = (0x30346E48 ^ n4) - 193029443;
        }
        return tdhdh.shym(string, n, n2, n3);
    }

    private static boolean shhgh(String string, Object object) {
        block0: {
            int n = -1996806163;
            n = Integer.rotateLeft(n * -485686083, 17) ^ 0x4434DA8A;
            Object object2 = object;
            n = Integer.rotateLeft((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 19);
            int n2 = n ^ 0x96CD85EC;
            if ((n2 ^ n) == -1764915732) break block0;
            int cfr_ignored_0 = (0x1E36A201 ^ n) - 1853424858;
        }
        return string.equals(object);
    }

    private static String dhmh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1853989466;
            n4 = Integer.rotateLeft(n4 * -1064991529, 20) ^ 0x40B9B6CC;
            n4 = Integer.rotateRight(n ^ n4, 20);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 13)) ^ 0x8712B8D2;
            if ((n5 ^ n4) == -2028816174) break block0;
            int cfr_ignored_0 = (0xE9931A88 ^ n4) - -156958042;
        }
        return tdhdh.shym(string, n, n2, n3);
    }

    private static boolean dbw_2(String string, Object object) {
        block0: {
            int n = tsz.tzt_2(491634929);
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 27);
            Object object2 = object;
            n = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 17);
            int n2 = n ^ 0xEF4349F7;
            if ((n2 ^ n) == -280802825) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xF20E8906 ^ n, 17) - 1411397365;
        }
        return string.equals(object);
    }

    private static String dhhz(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -489840263;
            n4 = Integer.rotateLeft(n4 * -1816031777, 5) ^ 0xA0701CA7;
            n4 = Integer.rotateLeft(n ^ n4, 18);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 29)) ^ 0x4210EFE8;
            if ((n5 ^ n4) == 1108406248) break block0;
            int cfr_ignored_0 = (0xA0DD4E91 ^ n4) + 1871387754;
        }
        return tdhdh.shym(string, n, n2, n3);
    }

    private static String tbk_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1316573348;
            n4 = Integer.rotateLeft(n4 * -1522392427, 13) ^ 0x15A4007F;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 27);
            int n5 = (n4 = n2 ^ n4) ^ 0xA9B759BD;
            if ((n5 ^ n4) == -1447601731) break block0;
            int cfr_ignored_0 = (0xE7CE0919 ^ n4) - -710655189;
        }
        return tdhdh.shym(string, n, n2, n3);
    }

    private static String bdw_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1197992302;
            n4 = Integer.rotateLeft(n4 * -1447770891, 28) ^ 0xA2ADD9C2;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 28);
            int n5 = (n4 = n ^ n4) ^ 0x6DC88F5E;
            if ((n5 ^ n4) == 1841860446) break block0;
            int cfr_ignored_0 = (0x2AAF6630 ^ n4) - -886495216;
        }
        return tdhdh.shym(string, n, n2, n3);
    }

    private static boolean jls(String string, Object object) {
        block0: {
            int n = 1510439914;
            n = Integer.rotateLeft(n * -611360039, 11) ^ 0xE7381883;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 3);
            int n2 = n ^ 0x17F676FA;
            if ((n2 ^ n) == 402028282) break block0;
            int cfr_ignored_0 = (0x4DF10D10 ^ n) - 2128497726;
        }
        return string.equals(object);
    }

    private static String ral_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tsz.tzt_2(1171226882);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = n4 ^ 0x7D9C52B5;
            if ((n5 ^ n4) == 2107396789) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x3853D3B7 ^ n4, 10) - -695975324) * 945017783;
        }
        return tdhdh.shym(string, n, n2, n3);
    }

    private static String shkhq(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1056319229;
            n4 = Integer.rotateLeft(n4 * -180731731, 13) ^ 0x964FA5CC;
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 22)) ^ 0xFA7FC0C1;
            if ((n5 ^ n4) == -92290879) break block0;
            int cfr_ignored_0 = (0xC489E63C ^ n4) + -311246385;
        }
        return tdhdh.shym(string, n, n2, n3);
    }

    private static String khkd(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -244664211;
            n4 = Integer.rotateLeft(n4 * -710832981, 21) ^ 0xF82EA853;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = n4 ^ 0x404FBF9F;
            if ((n5 ^ n4) == 1078968223) break block0;
            int cfr_ignored_0 = (0xB12507F2 ^ n4) - -155033831;
        }
        return tdhdh.shym(string, n, n2, n3);
    }

    private static int afy(int n, int n2) {
        block0: {
            int n3 = 304526078;
            int n4 = (n3 = Integer.rotateLeft(n3 * -1710524637, 24) ^ 0xF0E0D636) ^ 0x1B259D0B;
            if ((n4 ^ n3) == 455449867) break block0;
            int cfr_ignored_0 = (0x9032FF5 ^ n3) - -1686410847;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String tqy(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -2107660644;
            n4 = Integer.rotateLeft(n4 * 41005219, 8) ^ 0x33BF486;
            n4 = Integer.rotateLeft(n2 ^ n4, 7);
            int n5 = (n4 = n3 ^ n4) ^ 0x7CFE8190;
            if ((n5 ^ n4) == 2097054096) break block0;
            int cfr_ignored_0 = (0xFEA1270C ^ n4) - 1117676197;
        }
        return tdhdh.shym(string, n, n2, n3);
    }

    private static boolean zshm_2(String string, Object object) {
        block0: {
            int n = -2007403411;
            n = Integer.rotateLeft(n * -60023647, 21) ^ 0xE9A8F5FF;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xE2B0CAC5;
            if ((n2 ^ n) == -491730235) break block0;
            int cfr_ignored_0 = (0x6AE9BEA8 ^ n) + -991731635;
        }
        return string.equals(object);
    }

    private static int tthth(int n) {
        block0: {
            int n2 = -1058621374;
            n2 = Integer.rotateLeft(n2 * 2053967629, 10) ^ 0xE4999B2A;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 23)) ^ 0x1BAABE4A;
            if ((n3 ^ n2) == 464174666) break block0;
            int cfr_ignored_0 = (0xDB4C0608 ^ n2) + -1487070956;
        }
        return Integer.reverse(n);
    }

    private static String[] dhf_5(String string) {
        block0: {
            int n = -591692113;
            n = Integer.rotateLeft(n * -97630089, 6) ^ 0x5BDE1534;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x9F2C7A8A;
            if ((n2 ^ n) == -1624474998) break block0;
            int cfr_ignored_0 = (0x43970425 ^ n) + -303474976;
        }
        return string.split("\b\u000e", -1);
    }

    private static CallSite shrk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1963281459;
            n3 = Integer.rotateLeft(n3 * 1266193691, 18) ^ 0x9AD6FC76;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 16);
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 16);
            int n4 = n3 ^ 0x2E7323E;
            if ((n4 ^ n3) != 48706110) {
                int cfr_ignored_0 = (0x881D81F3 ^ n3) + 1534043640;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ zshd_2 ^ string.hashCode() ^ n2 + jjm ^ i * 687743533 ^ zshd_2, 21) ^ jjm));
            }
            String[] stringArray = tdhdh.dhf_5(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] hlguhrj1mu(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite cw5to5gevs(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ arqrzxa ^ string.hashCode() ^ n2 + xnbvt3edm3 + i * 1256089187) + arqrzxa) ^ xnbvt3edm3));
            }
            String[] stringArray = tdhdh.hlguhrj1mu(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

