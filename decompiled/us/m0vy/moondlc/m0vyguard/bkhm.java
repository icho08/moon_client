/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bhd_4;
import us.m0vy.moondlc.m0vyguard.qw;

public class bkhm {
    private static final int ddr = 0;
    private static final int thtr = 1;
    private static final int rghs = 2;
    private static final int haa = 3;
    private static final int shmn = 4;
    private static final int tkht = 5;
    private static final int rdht = 6;
    private static final int htl = 7;
    private static final int zthth = 8;
    private static final int ryt_2 = 9;
    private static final int thq = 10;
    private static final int rdkh = 11;
    private static final int thwj = 12;
    private static final int jqz = 13;
    private static final int dhkhb = 14;
    private static final int thyw = 15;
    private static final int bdh_3 = 16;
    private static final int dghs = 17;
    private static final int zjf = 18;
    private static final int dhjy = 19;
    private static final int tnh = 20;
    private static final int zghy = 21;
    private static final int swq = 22;
    private static final int jhs_4 = 23;
    private static final int thf_3 = 24;
    private static final int dhkhl = 25;
    private static final int rmw = 26;
    private static final int shzr_2 = 27;
    private static final int tsha_2 = 28;
    private static final int jtht_2 = 29;
    private static final int btf_2 = 30;
    private static final bhd_4[] shh;
    private static final int jlth = -534112328;
    private static final int zkm = 1456078948;
    private static final int szs_3 = -1322615054;
    private static final int jkhh_2 = -2029255173;
    private static final int chbq2ejm3rg4h = -1708876283;
    private static final int ae67alm = -1118417816;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int l94ih9vlstw8y;

    /*
     * Exception decompiling
     */
    public static bhd_4 jsf(String var0) {
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

    private static String jbt(String string, int n, int n2, int n3) {
        int n4 = 678677401;
        n4 = Integer.rotateLeft(n4 * -1172671847, 13) ^ 0x994BD216;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = n3 ^ n4) ^ 0x33F49DE7;
        if ((n5 ^ n4) != 871669223) {
            int cfr_ignored_0 = (0x1B87567E ^ n4) + 1977147168;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0xF40C2C4F) + n2 ^ i * 1662520685) ^ jlth) + zkm);
        }
        return new String(cArray);
    }

    private static int trkh(int n, int n2) {
        block0: {
            int n3 = 392463306;
            n3 = Integer.rotateLeft(n3 * 805383601, 22) ^ 0x6F399D86;
            n3 = Integer.rotateRight(n ^ n3, 20);
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 26)) ^ 0xCE8A5E01;
            if ((n4 ^ n3) == -829792767) break block0;
            int cfr_ignored_0 = (0xD9EEDDCB ^ n3) - 1007529625;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int jzf(int n, int n2) {
        block0: {
            int n3 = qw.dlh_3(-1268014116);
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0x865A1F70;
            if ((n4 ^ n3) == -2040914064) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x3231BCAC ^ n3, 9) - 409171983;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int adhh_2(int n, int n2) {
        block0: {
            int n3 = -1139069170;
            int n4 = (n3 = Integer.rotateLeft(n3 * -1265254861, 23) ^ 0x1B078D8D) ^ 0x52F36A2E;
            if ((n4 ^ n3) == 1391684142) break block0;
            int cfr_ignored_0 = (0xEEE84520 ^ n3) + 1271956457;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String dkdh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 275506671;
            n4 = Integer.rotateLeft(n4 * -113754623, 24) ^ 0x74431388;
            n4 = n ^ n4;
            int n5 = (n4 = n3 ^ n4) ^ 0xB5368960;
            if ((n5 ^ n4) == -1254717088) break block0;
            int cfr_ignored_0 = (0xA55D6C8F ^ n4) + -1279545095;
        }
        return bkhm.jbt(string, n, n2, n3);
    }

    private static String shj_5(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 2064915150;
            n4 = Integer.rotateLeft(n4 * 1547292503, 23) ^ 0x8C08DA94;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 26);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 29)) ^ 0xCE766D48;
            if ((n5 ^ n4) == -831099576) break block0;
            int cfr_ignored_0 = (0xB5627786 ^ n4) - -2089079125;
        }
        return bkhm.jbt(string, n, n2, n3);
    }

    private static String tak_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1595338134;
            n4 = Integer.rotateLeft(n4 * 769408977, 22) ^ 0xACD383D8;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 29);
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 26)) ^ 0xAA76B814;
            if ((n5 ^ n4) == -1435060204) break block0;
            int cfr_ignored_0 = (0xF5605582 ^ n4) + -25125345;
        }
        return bkhm.jbt(string, n, n2, n3);
    }

    private static int zjj_2(int n, int n2) {
        block0: {
            int n3 = 1502261395;
            int n4 = (n3 = Integer.rotateLeft(n3 * 1147504379, 5) ^ 0x1F53BD0E) ^ 0x8029A510;
            if ((n4 ^ n3) == -2144754416) break block0;
            int cfr_ignored_0 = (0xD9A31583 ^ n3) - 706006380;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int dthw(int n, int n2) {
        block0: {
            int n3 = -1590495725;
            n3 = Integer.rotateLeft(n3 * 659335225, 10) ^ 0xFA595FD6;
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 13)) ^ 0x5577ABFD;
            if ((n4 ^ n3) == 1433906173) break block0;
            int cfr_ignored_0 = (0xF4455DEE ^ n3) + 445328370;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int thhh_3(int n) {
        block0: {
            int n2 = qw.dlh_3(-113537525);
            int n3 = (n2 = n ^ n2) ^ 0x6A96DFB9;
            if ((n3 ^ n2) == 1788272569) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x93AD51B2 ^ n2, 5) + -430275639) * -1817357901;
        }
        return Integer.reverse(n);
    }

    private static String dgha_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1251906106;
            n4 = Integer.rotateLeft(n4 * 286047199, 23) ^ 0xF64D44C;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 18);
            int n5 = (n4 = n ^ n4) ^ 0x6B2C3C63;
            if ((n5 ^ n4) == 1798061155) break block0;
            int cfr_ignored_0 = (0xDE4D51A5 ^ n4) - 354111204;
        }
        return bkhm.jbt(string, n, n2, n3);
    }

    private static boolean drth_2(String string, Object object) {
        block0: {
            int n = 861118758;
            n = Integer.rotateLeft(n * -590774695, 15) ^ 0x5B35CB39;
            Object object2 = object;
            n = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 19);
            int n2 = n ^ 0x7085CCB8;
            if ((n2 ^ n) == 1887816888) break block0;
            int cfr_ignored_0 = (0x43D66D9E ^ n) - 156436490;
        }
        return string.equals(object);
    }

    private static int jah(int n, int n2) {
        block0: {
            int n3 = 1168692741;
            n3 = Integer.rotateLeft(n3 * -1800728109, 8) ^ 0x734CF94B;
            n3 = Integer.rotateRight(n ^ n3, 13);
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 3)) ^ 0x61AA05C2;
            if ((n4 ^ n3) == 1638532546) break block0;
            int cfr_ignored_0 = (0x2402D3C7 ^ n3) + 293695781;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int khzd_2(int n, int n2) {
        block0: {
            int n3 = 68626304;
            n3 = Integer.rotateLeft(n3 * -529315565, 11) ^ 0x9F10BF05;
            int n4 = (n3 = Integer.rotateLeft(n ^ n3, 19)) ^ 0x6D300D2A;
            if ((n4 ^ n3) == 1831865642) break block0;
            int cfr_ignored_0 = (0x69272AAA ^ n3) - 702292015;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static boolean tthb_2(String string, Object object) {
        block0: {
            int n = 1708821583;
            n = Integer.rotateLeft(n * 584706859, 22) ^ 0x8F13156F;
            Object object2 = object;
            n = (object2 != null ? System.identityHashCode(object2) : 0) ^ n;
            int n2 = n ^ 0x16BBFB4A;
            if ((n2 ^ n) == 381418314) break block0;
            int cfr_ignored_0 = (0x73617705 ^ n) + 898696257;
        }
        return string.equals(object);
    }

    private static int ghzt(int n, int n2) {
        block0: {
            int n3 = 1521112503;
            n3 = Integer.rotateLeft(n3 * 1576181077, 28) ^ 0x6413FDE7;
            n3 = Integer.rotateRight(n ^ n3, 9);
            int n4 = (n3 = n2 ^ n3) ^ 0xA8C037CD;
            if ((n4 ^ n3) == -1463797811) break block0;
            int cfr_ignored_0 = (0xF26A627A ^ n3) - 647178331;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int sdy_4(int n, int n2) {
        block0: {
            int n3 = qw.dlh_3(233200576);
            int n4 = (n3 = n2 ^ n3) ^ 0x64A77745;
            if ((n4 ^ n3) == 1688696645) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x69412C85 ^ n3, 16) - -1019083946;
            int cfr_ignored_1 = (int)(0xABF382B827D4EB4FL ^ (long)n3 ^ 0xF800831A2DB8FA36L);
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int ghtht_2(int n, int n2) {
        block0: {
            int n3 = qw.dlh_3(-410112751);
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 20)) ^ 0xFCD69977;
            if ((n4 ^ n3) == -53044873) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x1B58B466 ^ n3, 6) - 1411086229;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String thbt_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 489666294;
            n4 = Integer.rotateLeft(n4 * -1798710747, 10) ^ 0xD1F922AF;
            int n5 = (n4 = n ^ n4) ^ 0x5F12A24E;
            if ((n5 ^ n4) == 1595056718) break block0;
            int cfr_ignored_0 = (0x423D14B8 ^ n4) - -629422238;
        }
        return bkhm.jbt(string, n, n2, n3);
    }

    private static int dhyl(int n, int n2) {
        block0: {
            int n3 = 788433981;
            n3 = Integer.rotateLeft(n3 * -1417393287, 27) ^ 0xD4935846;
            n3 = Integer.rotateLeft(n ^ n3, 11);
            int n4 = (n3 = n2 ^ n3) ^ 0x97C7DF49;
            if ((n4 ^ n3) == -1748508855) break block0;
            int cfr_ignored_0 = (0xB9395374 ^ n3) + 527976318;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int dhbf(int n, int n2) {
        block0: {
            int n3 = -410741384;
            n3 = Integer.rotateLeft(n3 * -846336487, 27) ^ 0x2BBB7C51;
            int n4 = (n3 = n ^ n3) ^ 0x7A02DF63;
            if ((n4 ^ n3) == 2047008611) break block0;
            int cfr_ignored_0 = (0x9D864A1B ^ n3) + -103360246;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String[] rzs(String string) {
        block0: {
            int n = -461674858;
            int n2 = (n = Integer.rotateLeft(n * 619013673, 27) ^ 0x78823C58) ^ 0xC37C1103;
            if ((n2 ^ n) == -1015279357) break block0;
            int cfr_ignored_0 = (0x27077795 ^ n) + 95357100;
        }
        return string.split("\u0007\u0011", -1);
    }

    private static CallSite sths(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -499541591;
            n3 = Integer.rotateLeft(n3 * 1066714083, 18) ^ 0x8CA46D9B;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x427B076E;
            if ((n4 ^ n3) != 1115359086) {
                int cfr_ignored_0 = (0xA0429EC7 ^ n3) - 1358217222;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ szs_3 ^ string.hashCode() ^ n2 + jkhh_2 + i * 800776133) + szs_3) ^ jkhh_2));
            }
            String[] stringArray = bkhm.rzs(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] foskjp2q(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite tps2kcmlayab(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ chbq2ejm3rg4h ^ string.hashCode()) + (n2 + ae67alm) + i ^ chbq2ejm3rg4h, 16) + ae67alm);
            }
            String[] stringArray = bkhm.foskjp2q(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

