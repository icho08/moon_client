/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_3532
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import net.minecraft.class_1309;
import net.minecraft.class_3532;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.sa_3;
import us.m0vy.moondlc.m0vyguard.lb;

public class bdsh_2 {
    private final Deque rw = new ArrayDeque();
    private final Deque zldh = new ArrayDeque();
    private final Deque rshl = new ArrayDeque();
    private final Deque rhn_2 = new ArrayDeque();
    private float ssh_3 = 0.0f;
    public float byth = 0.0f;
    public float thdz_2 = 0.0f;
    public float bzl_2 = 1.0f;
    public float jmth = 0.0f;
    private static final int dhzj_2 = -2144758323;
    private static final int rfm = 942124177;
    private static final int jsm = 1098472106;
    private static final int ttj_2 = -717845599;
    private static final int x0fxeqgg2o = 2054330885;
    private static final int rq9fyllv0th = -1040918626;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int cu56heldqjv;

    public void thdht() {
        int n = 839081691;
        n = Integer.rotateLeft(n * 1924547747, 5) ^ 0xF377A29C;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
        int n2 = n ^ 0x4255D409;
        if ((n2 ^ n) != 1112921097) {
            int cfr_ignored_0 = (0x70568AD2 ^ n) + 1523803739;
        }
        this.rw.clear();
        this.zldh.clear();
        this.rshl.clear();
        this.rhn_2.clear();
        this.ssh_3 = 0.0f;
        this.byth = 0.0f;
        this.thdz_2 = 0.0f;
        this.bzl_2 = 1.0f;
        this.jmth = 0.0f;
    }

    public void bkhkh(float f) {
        this.zldh.add(Float.valueOf(Math.abs(f)));
        if (this.zldh.size() > 15) {
            this.zldh.removeFirst();
        }
    }

    /*
     * Exception decompiling
     */
    public List khts(class_746 var1_1, class_1309 var2_2, float var3_3, float var4_4, float var5_5, float var6_6, String var7_7) {
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

    private float hkhb(Deque deque, int n) {
        float f;
        if (deque.isEmpty()) {
            return 0.0f;
        }
        float f2 = Float.MAX_VALUE;
        float f3 = -3.4028235E38f;
        Object object = deque.iterator();
        while (object.hasNext()) {
            float f4 = ((Float)object.next()).floatValue();
            if (f4 < f2) {
                f2 = f4;
            }
            if (!(f4 > f3)) continue;
            f3 = f4;
        }
        if ((double)(f3 - f2) < 1.0E-5) {
            return 0.0f;
        }
        object = new int[n];
        Iterator iterator = deque.iterator();
        while (iterator.hasNext()) {
            f = ((Float)iterator.next()).floatValue();
            int n2 = (int)((f - f2) / (f3 - f2) * (float)(n - 1));
            n2 = class_3532.method_15340((int)n2, (int)0, (int)(n - 1));
            Object object2 = object;
            int n3 = n2;
            object2[n3] = object2[n3] + true;
        }
        int n4 = deque.size();
        f = 0.0f;
        for (Object object3 : object) {
            if (object3 <= 0) continue;
            float f5 = (float)object3 / (float)n4;
            f = (float)((double)f - (double)f5 * (Math.log(f5) / Math.log(2.0)));
        }
        return f;
    }

    private float dshgh(Deque deque) {
        float f;
        if (deque.isEmpty()) {
            return 0.0f;
        }
        float f2 = 0.0f;
        Iterator iterator = deque.iterator();
        while (iterator.hasNext()) {
            f = ((Float)iterator.next()).floatValue();
            f2 += f;
        }
        float f3 = f2 / (float)deque.size();
        f = 0.0f;
        Iterator iterator2 = deque.iterator();
        while (iterator2.hasNext()) {
            float f4 = ((Float)iterator2.next()).floatValue();
            float f5 = f4 - f3;
            f += f5 * f5;
        }
        return f / (float)deque.size();
    }

    private static String zdgh_3(String string, int n, int n2, int n3) {
        int n4 = 891670527;
        n4 = Integer.rotateLeft(n4 * -1583170887, 6) ^ 0xF7181063;
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 15);
        int n5 = (n4 = Integer.rotateRight(n ^ n4, 15)) ^ 0x7D1A3268;
        if ((n5 ^ n4) != 2098868840) {
            int cfr_ignored_0 = (0x483FFD97 ^ n4) + 1538525183;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xAE51BFA0) + i ^ dhzj_2, 13) ^ n2 + rfm));
        }
        return new String(cArray);
    }

    private static String tyt(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1638952525;
            n4 = Integer.rotateLeft(n4 * 1793412609, 27) ^ 0x4F0C2356;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 20);
            int n5 = n4 ^ 0x3CFB705;
            if ((n5 ^ n4) == 63944453) break block0;
            int cfr_ignored_0 = (0x9D8026B6 ^ n4) - -178092372;
        }
        return bdsh_2.zdgh_3(string, n, n2, n3);
    }

    private static int szgh(int n, int n2) {
        block0: {
            int n3 = sa_3.ztl_2(-396645450);
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0x4304BA57;
            if ((n4 ^ n3) == 1124383319) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xAB5F11E1 ^ n3, 8) + -991901318;
            int cfr_ignored_1 = (int)(0x69EDBFDC27D4EB4FL ^ (long)n3 ^ 0x82C8831A2DB97E0AL);
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int zkz_2(int n) {
        block0: {
            int n2 = sa_3.ztl_2(-1960982858);
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 23)) ^ 0x3C0D5D97;
            if ((n3 ^ n2) == 1007508887) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xB7109B21 ^ n2, 9) + 794847290;
            int cfr_ignored_1 = (int)(0x75A2351C27D4EB4FL ^ (long)n2 ^ 0x9748831A2DB94695L);
        }
        return Integer.reverse(n);
    }

    private static String bhr(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1004816237;
            n4 = Integer.rotateLeft(n4 * -910112911, 12) ^ 0x165ADFA;
            int n5 = (n4 = n3 ^ n4) ^ 0xDF85D1A2;
            if ((n5 ^ n4) == -544878174) break block0;
            int cfr_ignored_0 = (0xE46196CF ^ n4) + 1734744952;
        }
        return bdsh_2.zdgh_3(string, n, n2, n3);
    }

    private static String dhz_8(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -347491775;
            n4 = Integer.rotateLeft(n4 * 1541789591, 15) ^ 0x46E11E1F;
            int n5 = (n4 = n3 ^ n4) ^ 0xCA0B9B58;
            if ((n5 ^ n4) == -905209000) break block0;
            int cfr_ignored_0 = (0x21422919 ^ n4) - 805158806;
        }
        return bdsh_2.zdgh_3(string, n, n2, n3);
    }

    private static String bh_2(String string, String string2) {
        block0: {
            int n = 233209384;
            n = Integer.rotateLeft(n * 1085182377, 8) ^ 0x6D6DD506;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            String string4 = string2;
            n = Integer.rotateLeft((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 8);
            int n2 = n ^ 0x3B070E91;
            if ((n2 ^ n) == 990318225) break block0;
            int cfr_ignored_0 = (0x36E170B9 ^ n) + -9263351;
        }
        return string.concat(string2);
    }

    private static float thdw(int n) {
        block0: {
            int n2 = sa_3.ztl_2(2105564455);
            int n3 = n2 ^ 0xB586B03F;
            if ((n3 ^ n2) == -1249464257) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xC806ED18 ^ n2, 12) + 1026839843) * -939070183;
        }
        return Float.intBitsToFloat(n);
    }

    private static String shbgh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1117728958;
            n4 = Integer.rotateLeft(n4 * -2016155359, 20) ^ 0x71642251;
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 19)) ^ 0xDF1CDC40;
            if ((n5 ^ n4) == -551756736) break block0;
            int cfr_ignored_0 = (0x627C1302 ^ n4) - -149830585;
        }
        return bdsh_2.zdgh_3(string, n, n2, n3);
    }

    private static int zkl_2(int n) {
        block0: {
            int n2 = -776867978;
            n2 = Integer.rotateLeft(n2 * -1487069519, 19) ^ 0x40491426;
            int n3 = (n2 = n ^ n2) ^ 0xFD5DE8AF;
            if ((n3 ^ n2) == -44177233) break block0;
            int cfr_ignored_0 = (0x2CEC07D9 ^ n2) - -154457833;
        }
        return Integer.reverse(n);
    }

    private static float hghy(bdsh_2 bdsh2, Deque deque, int n) {
        block0: {
            int n2 = -171041649;
            n2 = Integer.rotateLeft(n2 * -1853207571, 13) ^ 0xB9F7CD80;
            bdsh_2 bdsh3 = bdsh2;
            n2 = (bdsh3 != null ? System.identityHashCode(bdsh3) : 0) ^ n2;
            Deque deque2 = deque;
            n2 = Integer.rotateLeft((deque2 != null ? System.identityHashCode(deque2) : 0) ^ n2, 3);
            int n3 = n2 ^ 0xBF5BEFA1;
            if ((n3 ^ n2) == -1084493919) break block0;
            int cfr_ignored_0 = (0x4A95F32E ^ n2) + 443777354;
        }
        return bdsh2.hkhb(deque, n);
    }

    private static String stw_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = sa_3.ztl_2(1981624148);
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 4);
            int n5 = (n4 = n2 ^ n4) ^ 0x1C98F1B7;
            if ((n5 ^ n4) == 479785399) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x6A85DEE3 ^ n4, 16) + -359424840;
        }
        return bdsh_2.zdgh_3(string, n, n2, n3);
    }

    private static String khaj(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1020431072;
            n4 = Integer.rotateLeft(n4 * 78226865, 14) ^ 0x902440BF;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 17);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 22)) ^ 0xEA718C33;
            if ((n5 ^ n4) == -361657293) break block0;
            int cfr_ignored_0 = (0x295CF913 ^ n4) + 1588032414;
        }
        return bdsh_2.zdgh_3(string, n, n2, n3);
    }

    private static int khmm(int n, int n2) {
        block0: {
            int n3 = sa_3.ztl_2(-628480322);
            n3 = Integer.rotateLeft(n ^ n3, 23);
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 6)) ^ 0xC5814935;
            if ((n4 ^ n3) == -981382859) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x1F0B6F8B ^ n3, 6) + -960487152;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String thtm_2(String string, String string2) {
        block0: {
            int n = sa_3.ztl_2(-157609767);
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            String string4 = string2;
            n = (string4 != null ? System.identityHashCode(string4) : 0) ^ n;
            int n2 = n ^ 0x698332C5;
            if ((n2 ^ n) == 1770205893) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x9F18221C ^ n, 6) - 1212792991) * -1625808355;
        }
        return string.concat(string2);
    }

    private static int jtz_2(int n, int n2) {
        block0: {
            int n3 = 1261686965;
            n3 = Integer.rotateLeft(n3 * -1872516739, 17) ^ 0x1BEBE1AE;
            int n4 = (n3 = n ^ n3) ^ 0xE1B51B03;
            if ((n4 ^ n3) == -508224765) break block0;
            int cfr_ignored_0 = (0xAA86CBB6 ^ n3) + 1421270518;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String khdhf(String string, int n, int n2, int n3) {
        block0: {
            int n4 = sa_3.ztl_2(-381877158);
            int n5 = (n4 = n2 ^ n4) ^ 0x2EBE204;
            if ((n5 ^ n4) == 49013252) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xEBD6E65E ^ n4, 16) - -1822194531) * -338237857;
        }
        return bdsh_2.zdgh_3(string, n, n2, n3);
    }

    private static String ghdgh(String string, String string2) {
        block0: {
            int n = sa_3.ztl_2(447503445);
            String string3 = string2;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0x41A569C4;
            if ((n2 ^ n) == 1101359556) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x5B093591 ^ n, 14) + 175840202) * 1527330193;
            int cfr_ignored_1 = (int)(0x99BB9BAC27D4EB4FL ^ (long)n ^ 0xCA28831A2DB89EA6L);
        }
        return string.concat(string2);
    }

    private static String aha(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1201273547;
            n4 = Integer.rotateLeft(n4 * -1521880711, 7) ^ 0xF89D973C;
            n4 = Integer.rotateRight(n ^ n4, 22);
            int n5 = (n4 = n2 ^ n4) ^ 0xC9ACC361;
            if ((n5 ^ n4) == -911424671) break block0;
            int cfr_ignored_0 = (0x8E3539AA ^ n4) + -45873807;
        }
        return bdsh_2.zdgh_3(string, n, n2, n3);
    }

    private static int tqd_4(int n) {
        block0: {
            int n2 = -1270051209;
            n2 = Integer.rotateLeft(n2 * 643517669, 20) ^ 0xAA491B5D;
            int n3 = (n2 = n ^ n2) ^ 0x34B701BD;
            if ((n3 ^ n2) == 884408765) break block0;
            int cfr_ignored_0 = (0x80FB8FCA ^ n2) - 34416999;
        }
        return Integer.reverse(n);
    }

    private static String dhnd_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 517663170;
            n4 = Integer.rotateLeft(n4 * 421003541, 11) ^ 0xB1C80A22;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 20);
            int n5 = (n4 = n ^ n4) ^ 0x2FE494AA;
            if ((n5 ^ n4) == 803509418) break block0;
            int cfr_ignored_0 = (0x313E7D68 ^ n4) + 1457707758;
        }
        return bdsh_2.zdgh_3(string, n, n2, n3);
    }

    private static String shkr(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 2078523106;
            n4 = Integer.rotateLeft(n4 * 1832345071, 25) ^ 0x3882A129;
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 22)) ^ 0x14BC7ED2;
            if ((n5 ^ n4) == 347897554) break block0;
            int cfr_ignored_0 = (0x6F5FC030 ^ n4) - 1181328741;
        }
        return bdsh_2.zdgh_3(string, n, n2, n3);
    }

    private static String sshb(String string, String string2) {
        block0: {
            int n = sa_3.ztl_2(1905751717);
            String string3 = string2;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0x1947DB5;
            if ((n2 ^ n) == 26508725) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x70030B10 ^ n, 17) + -1799621077) * 1879247633;
        }
        return string.concat(string2);
    }

    private static float ghthb(lb lb2) {
        block0: {
            int n = -150821625;
            int n2 = (n = Integer.rotateLeft(n * -1948830005, 4) ^ 0x4D5D639A) ^ 0x33D65578;
            if ((n2 ^ n) == 869684600) break block0;
            int cfr_ignored_0 = (0xC4D4F07F ^ n) + -464378417;
        }
        return lb2.sry();
    }

    private static int ykh(int n) {
        block0: {
            int n2 = sa_3.ztl_2(-303085333);
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 5)) ^ 0x339AE92D;
            if ((n3 ^ n2) == 865790253) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xDE75A1C6 ^ n2, 14) - -191089099;
        }
        return Integer.reverse(n);
    }

    private static String thzk(String string, int n, int n2, int n3) {
        block0: {
            int n4 = sa_3.ztl_2(-589339458);
            int n5 = (n4 = n ^ n4) ^ 0x92F5D60B;
            if ((n5 ^ n4) == -1829382645) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x4E2AB2B5 ^ n4, 12) - 2072593190) * 1311421109;
            int cfr_ignored_1 = (int)(0x8C981C8827D4EB4FL ^ (long)n4 ^ 0xC460831A2DB8B4E1L);
        }
        return bdsh_2.zdgh_3(string, n, n2, n3);
    }

    private static String tab_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1034515802;
            n4 = Integer.rotateLeft(n4 * 238916457, 8) ^ 0x545F8B8C;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 26);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 10)) ^ 0x8A9D50A3;
            if ((n5 ^ n4) == -1969401693) break block0;
            int cfr_ignored_0 = (0xB73425F9 ^ n4) + 2072546375;
        }
        return bdsh_2.zdgh_3(string, n, n2, n3);
    }

    private static String jds_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = sa_3.ztl_2(-1549926307);
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 7)) ^ 0x68F4A596;
            if ((n5 ^ n4) == 1760863638) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xCB6AA5CB ^ n4, 12) + -1505250608;
        }
        return bdsh_2.zdgh_3(string, n, n2, n3);
    }

    private static int djy_2(int n) {
        block0: {
            int n2 = -2137593613;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1110357877, 16) ^ 0x88FA1188) ^ 0x1919084F;
            if ((n3 ^ n2) == 421070927) break block0;
            int cfr_ignored_0 = (0x998FE0BC ^ n2) + 1490352515;
        }
        return Integer.reverse(n);
    }

    private static float baf_2(bdsh_2 bdsh2, Deque deque) {
        block0: {
            int n = -805522969;
            n = Integer.rotateLeft(n * 1280722927, 22) ^ 0xC79918D6;
            bdsh_2 bdsh3 = bdsh2;
            n = Integer.rotateLeft((bdsh3 != null ? System.identityHashCode(bdsh3) : 0) ^ n, 11);
            Deque deque2 = deque;
            n = (deque2 != null ? System.identityHashCode(deque2) : 0) ^ n;
            int n2 = n ^ 0xE8A1D6F4;
            if ((n2 ^ n) == -392046860) break block0;
            int cfr_ignored_0 = (0x275D6713 ^ n) + -1664302092;
        }
        return bdsh2.dshgh(deque);
    }

    private static float zfth(int n) {
        block0: {
            int n2 = sa_3.ztl_2(-1937628810);
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 20)) ^ 0x55A77C41;
            if ((n3 ^ n2) == 1437039681) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xD9255D37 ^ n2, 14) - 1340336356) * -651862729;
        }
        return Float.intBitsToFloat(n);
    }

    private static float tqq_2(int n) {
        block0: {
            int n2 = -1296379089;
            n2 = Integer.rotateLeft(n2 * 215644679, 12) ^ 0x9BFF237A;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 16)) ^ 0xA5AE7DD0;
            if ((n3 ^ n2) == -1515291184) break block0;
            int cfr_ignored_0 = (0x1714AEFF ^ n2) + 1894595151;
        }
        return Float.intBitsToFloat(n);
    }

    private static String tthd_2(String string, String string2) {
        block0: {
            int n = -1583183008;
            n = Integer.rotateLeft(n * -524140931, 15) ^ 0x9A8E57E4;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            String string4 = string2;
            n = (string4 != null ? System.identityHashCode(string4) : 0) ^ n;
            int n2 = n ^ 0x2CE3D2A5;
            if ((n2 ^ n) == 753128101) break block0;
            int cfr_ignored_0 = (0x8D4159C5 ^ n) + -777866329;
        }
        return string.concat(string2);
    }

    private static String[] zshh(String string) {
        block0: {
            int n = -218202743;
            int n2 = (n = Integer.rotateLeft(n * -1014470631, 26) ^ 0x4A2EA231) ^ 0x5C050B60;
            if ((n2 ^ n) == 1543834464) break block0;
            int cfr_ignored_0 = (0xAEFB76E9 ^ n) - -449670208;
        }
        return string.split("\u0004\u0017", -1);
    }

    private static CallSite thhs_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 372906005;
            n3 = Integer.rotateLeft(n3 * -884536231, 17) ^ 0xD02E9EF2;
            n3 = Integer.rotateRight(n2 ^ n3, 9);
            Class clazz2 = clazz;
            n3 = (clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n3;
            int n4 = n3 ^ 0x7204EC8A;
            if ((n4 ^ n3) != 1912925322) {
                int cfr_ignored_0 = (0x643EF49F ^ n3) + -1199951015;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ jsm ^ string.hashCode() ^ n2 + ttj_2 ^ i * 625939751 ^ jsm, 23) ^ ttj_2));
            }
            String[] stringArray = bdsh_2.zshh(new String(cArray));
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

    private static String[] oev4jaty(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite rsw6ujzu1og9t(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ x0fxeqgg2o ^ string.hashCode()) + (n2 + rq9fyllv0th) + i ^ x0fxeqgg2o, 24) + rq9fyllv0th);
            }
            String[] stringArray = bdsh_2.oev4jaty(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

