/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1308
 *  net.minecraft.class_1309
 *  net.minecraft.class_1429
 *  net.minecraft.class_1531
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.function.ToDoubleFunction;
import java.util.stream.StreamSupport;
import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1308;
import net.minecraft.class_1309;
import net.minecraft.class_1429;
import net.minecraft.class_1531;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.blq;
import us.m0vy.moondlc.m0vyguard.blh_2;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tkhk;
import us.m0vy.moondlc.m0vyguard.ta_3;
import us.m0vy.moondlc.m0vyguard.ghd;
import us.m0vy.moondlc.m0vyguard.yf;

public class rf
implements tthy {
    private class_1309 rgha;
    private Integer tdhs = null;
    private static final int shjk = -383101889;
    private static final int rsh_4 = 2130922863;
    private static final int jzth = 1398729483;
    private static final int shhn_2 = 835450165;
    private static final int yw9gn1omk = 36343150;
    private static final int lldjpvzdv = 672443109;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int gw4fbavf6lg;

    public class_1309 thsh_8(ghd ghd2) {
        Object object;
        int n = ta_3.ahj(-339381212);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 15);
        ghd ghd3 = ghd2;
        n = (ghd3 != null ? System.identityHashCode(ghd3) : 0) ^ n;
        int n2 = n ^ 0x33EEC237;
        if ((n2 ^ n) != 871285303) {
            int cfr_ignored_0 = (Integer.rotateRight(0xD82BB613 ^ n, 14) + 833137544) * -668223981;
        }
        if (rf.mc.field_1724 == null || rf.mc.field_1687 == null) {
            rf.hkhl(this);
            return null;
        }
        double d = rf.tta_3(rf.mc.field_1724).method_1033() * Double.longBitsToDouble(0xC699C894E0ACE891L ^ 0x8699C894E0ACE891L);
        double d2 = ghd2.bshs + Math.min(Double.longBitsToDouble(0xFD65652D6B399187L ^ 0xBD6D652D6B399187L), d);
        if (ghd2.hkb && this.tdhs != null) {
            class_1309 class_13092;
            object = rf.mc.field_1687.method_8469(rf.hdr(this.tdhs));
            if (object instanceof class_1309 && (class_13092 = (class_1309)object).method_5805() && rf.shqd(this, class_13092, ghd2) && rf.shthk(this, class_13092) <= d2 && this.jdl_2(class_13092, ghd2.jthb) && (ghd2.hmj || rf.mc.field_1724.method_6057((class_1297)class_13092))) {
                this.rgha = class_13092;
                return this.rgha;
            }
            this.tdhs = null;
        }
        if ((object = new ArrayList<class_1309>(StreamSupport.stream(rf.mc.field_1687.method_18112().spliterator(), false).filter(class_1309.class::isInstance).map(class_1309.class::cast).filter(arg_0 -> this.tfa_4(ghd2, arg_0)).filter(arg_0 -> this.rwsh(d2, arg_0)).filter(arg_0 -> this.raw_2(ghd2, arg_0)).filter(arg_0 -> rf.khzf_2(ghd2, arg_0)).toList())).isEmpty()) {
            this.jas_4();
            return null;
        }
        object.sort(this.awl(ghd2.sb));
        this.rgha = (class_1309)object.getFirst();
        if (ghd2.hkb) {
            this.tdhs = this.rgha.method_5628();
        }
        return this.rgha;
    }

    public boolean ghsw_2(class_1309 class_13092, ghd ghd2) {
        int n = 64737902;
        n = Integer.rotateLeft(n * -717962819, 14) ^ 0x9CB833C2;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 3);
        class_1309 class_13093 = class_13092;
        n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
        int n2 = n ^ 0x13AD66D1;
        if ((n2 ^ n) != 330131153) {
            int cfr_ignored_0 = (0x1076B4BF ^ n) + 35220359;
        }
        if (class_13092 == rf.mc.field_1724) {
            return false;
        }
        if (!rf.dhwt(class_13092) || class_13092.method_6032() <= 0.0f) {
            return false;
        }
        if (class_13092.method_31481()) {
            return false;
        }
        if (class_13092 == rf.mc.field_1724.method_49694()) {
            return false;
        }
        if (class_13092 instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_13092;
            if (rf.bwl(class_16572)) {
                return false;
            }
            if (rf.zhm_3(class_16572)) {
                return false;
            }
            if (blq.aah_2().aqj(class_16572.method_5477().getString())) {
                return false;
            }
            if (!ghd2.rzb) {
                return false;
            }
            if (!ghd2.khjr && class_16572.method_5767()) {
                return false;
            }
            if (!ghd2.dtha && this.tfa_2(class_16572)) {
                return false;
            }
        } else if (class_13092 instanceof class_1429) {
            if (!ghd2.dzd_3) {
                return false;
            }
        } else if (class_13092 instanceof class_1308) {
            if (!ghd2.rgh) {
                return false;
            }
        } else {
            if (class_13092 instanceof class_1531) {
                return false;
            }
            return false;
        }
        return true;
    }

    private boolean tfa_2(class_1657 class_16572) {
        int n = 1628228941;
        n = Integer.rotateLeft(n * 725395897, 15) ^ 0x18D9A430;
        n = System.identityHashCode(this) ^ n;
        class_1657 class_16573 = class_16572;
        n = Integer.rotateLeft((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 20);
        int n2 = n ^ 0xD0CE5C7C;
        if ((n2 ^ n) != -791782276) {
            int cfr_ignored_0 = (0xB1C29131 ^ n) - 664657984;
        }
        for (class_1304 class_13042 : new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166}) {
            if (rf.tbdh(rf.dhj(class_16572, class_13042))) continue;
            return false;
        }
        return true;
    }

    private double hath(class_1309 class_13092) {
        try {
            int n = 195961609;
            n = Integer.rotateLeft(n * -801908609, 16) ^ 0x5D539B7E;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 23);
            class_1309 class_13093 = class_13092;
            n = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 21);
            int n2 = n ^ 0x5529B13D;
            if ((n2 ^ n) != 1428795709) {
                int cfr_ignored_0 = (0x5E879234 ^ n) - 318424639;
            }
            if ((0xED & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            rf.awkh();
        }
        class_243 class_2432 = rf.mc.field_1724.method_33571();
        class_238 class_2383 = rf.shyb(class_13092);
        class_243 class_2433 = new class_243(class_3532.method_15350((double)class_2432.field_1352, (double)class_2383.field_1323, (double)class_2383.field_1320), rf.ghst_3(class_2432.field_1351, class_2383.field_1322, class_2383.field_1325), class_3532.method_15350((double)class_2432.field_1350, (double)class_2383.field_1321, (double)class_2383.field_1324));
        return rf.dhghdh(class_2433.method_1020(class_2432));
    }

    /*
     * Exception decompiling
     */
    private Comparator awl(String var1_1) {
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

    private double djw_2(class_1309 class_13092) {
        double d = 0.0;
        int n = 0;
        int n2 = ta_3.ahj(596641897);
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = n2 - -1885739706 ^ 0x7DEDE3C6 ^ 0x7DEDE3C6;
        block23: while (true) {
            switch (n2 - n3) {
                case -568588130: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0xA4984711 ^ n2, 7) + -221365686) * -1533524207;
                    int cfr_ignored_1 = (int)(0x662AE92C27D4EB4FL ^ (long)n2 ^ 0x2F28831A2DB96184L);
                    throw null;
                }
                case -1885739706: {
                    int cfr_ignored_2 = (Integer.rotateRight(0xBFAF2D12 ^ n2, 10) + 982783081) * -1079038701;
                    if (!rf.trh_3()) {
                        int cfr_ignored_3 = (int)(0x30F701E935220490L ^ (long)n2 ^ 0xFEA2A6F7F207CC3FL);
                        n3 = Integer.reverse(Integer.reverse(n2 - 1509468962));
                        int cfr_ignored_4 = (int)(0x479E841C8E4D9D8EL ^ (long)n2 ^ 0xF549D028C03B22ECL);
                        n3 = (int)((long)(n2 - 1844186706) ^ 0xE267E8AEAEB109E6L ^ 0xE267E8AEAEB109E6L);
                        n -= 5;
                        continue block23;
                    }
                    n3 = n2 - -568588130 + -1783213897 - -1783213897;
                    int cfr_ignored_5 = (Integer.rotateLeft(0x15F87E7C ^ n2, 5) - -1384845249) * 368606845;
                    continue block23;
                }
                case 1844186706: {
                    int cfr_ignored_6 = (Integer.rotateRight(0xCBDBC156 ^ n2, 12) - -1275459419) * -874790569;
                    class_243 class_2432 = rf.mc.field_1724.method_33571();
                    class_243 class_2433 = rf.mc.field_1724.method_5828(1.0f);
                    class_243 class_2434 = rf.dhjh_2(tkhk.zwh_2((class_1297)class_13092), class_2432).method_1029();
                    d = class_2433.method_1026(class_2434);
                    return Math.acos(class_3532.method_15350((double)d, (double)rf.tth_3(0xA7F16FE0250291C6L ^ 0x18016FE0250291C6L), (double)1.0)) * rf.zghd_3(0xE869D3820DA5F248L ^ 0xA825765E17C633B0L);
                }
                case -2077373446: {
                    int cfr_ignored_7 = Integer.rotateRight(0xD851BECB ^ n2, 14) + 910408144;
                    n3 = Integer.reverse(Integer.reverse(n2 - -1885739706));
                    int cfr_ignored_8 = (Integer.rotateRight(0x325C38B2 ^ n2, 9) + 495484105) * 844904627;
                    continue block23;
                }
                case 901229872: {
                    int cfr_ignored_9 = (Integer.rotateLeft(0xA9D10E38 ^ n2, 8) + -1800513533) * -1445917127;
                    try {
                        n -= 3;
                        n3 = n2 - -1885739706 + 14619873 - 14619873;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = n2 - -1885739706;
                    }
                    n -= 4;
                    continue block23;
                }
                case 1702853058: {
                    int cfr_ignored_10 = Integer.rotateRight(0xC96AB746 ^ n2, 12) - 1749668021;
                    n3 = (int)((long)(n2 - -778742965) ^ 0xFBE687F98E78B1E3L ^ 0xFBE687F98E78B1E3L);
                    int cfr_ignored_11 = (Integer.rotateRight(0x475F51B7 ^ n2, 11) - -1461156764) * 1197429175;
                    int cfr_ignored_12 = (int)(0xAC0EBDD3CA3F6123L ^ (long)n2 ^ 0x86D758CD3960F5CCL);
                    n3 = (int)((long)(n2 - -189509677) ^ 0x5A26A34EC97AD42EL ^ 0x5A26A34EC97AD42EL);
                    int cfr_ignored_13 = (int)(0x3AD72C4938B9085CL ^ (long)n2 ^ 0xA5E2BDC1EB9FD87FL);
                    n3 = Integer.reverse(Integer.reverse(n2 - -1885739706));
                    n += 5;
                    continue block23;
                }
                case -1262228850: {
                    int cfr_ignored_14 = (Integer.rotateLeft(0x47D27C34 ^ n2, 11) - -1227183737) * 1204976693;
                    n3 = n2 - -1885739706 ^ 0x9BE0FBFA ^ 0x9BE0FBFA;
                    int cfr_ignored_15 = Integer.rotateLeft(0xAFC3E48D ^ n2, 8) - 1293306958;
                    int cfr_ignored_16 = (int)(0x6D714AB027D4EB4FL ^ (long)n2 ^ 0x6810831A2DB97733L);
                    n -= 3;
                    continue block23;
                }
                case 1063584630: {
                    int cfr_ignored_17 = (Integer.rotateLeft(0xBF650BD9 ^ n2, 10) + 832179842) * -1083896871;
                    int cfr_ignored_18 = (int)(0x7DD7A5E427D4EB4FL ^ (long)n2 ^ 0xB6B8831A2DB9567EL);
                    int cfr_ignored_19 = (int)(0xED0E2F6D4C350E65L ^ (long)n2 ^ 0xA3AA54D9E7EC77CDL);
                    n3 = n2 - -1885739706 ^ 0x51733FF1 ^ 0x51733FF1;
                    continue block23;
                }
                case -1307353097: {
                    int cfr_ignored_20 = Integer.rotateRight(0x52630AEB ^ n2, 13) + -27528784;
                    n3 = n2 - -1885739706 + -352223103 - -352223103;
                    --n;
                    continue block23;
                }
                case -404555776: {
                    int cfr_ignored_21 = (Integer.rotateRight(0x75AA99E ^ n2, 3) - -396875427) * 123382175;
                    n3 = n2 - 2064173974 + -727235390 - -727235390;
                    int cfr_ignored_22 = (Integer.rotateLeft(0xF96A7111 ^ n2, 18) + 943804490) * -110464751;
                    int cfr_ignored_23 = (int)(0x3BD8DF2C27D4EB4FL ^ (long)n2 ^ 0x4328831A2DB9DA60L);
                    n3 = n2 - -1885739706;
                    n += 4;
                    continue block23;
                }
                case 1380841601: {
                    int cfr_ignored_24 = (Integer.rotateRight(0xC885F2BF ^ n2, 12) - 1284899932) * -930745665;
                    n3 = n2 - 436316174 + -1458149219 - -1458149219;
                    int cfr_ignored_25 = Integer.rotateRight(0x2D89D56A ^ n2, 8) + -2012317935;
                    try {
                        n -= 3;
                        if ((0xEBF532F5E184B6EFL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 - -1885739706));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 - -1885739706 ^ 0x61966D72 ^ 0x61966D72;
                    }
                    continue block23;
                }
                case 1407211193: {
                    int cfr_ignored_26 = Integer.rotateLeft(0xDAA38FC4 ^ n2, 14) - 2116814839;
                    n3 = n2 - 2062849651;
                    int cfr_ignored_27 = (Integer.rotateLeft(0x5970954 ^ n2, 3) - -1314406297) * 93784405;
                    try {
                        n3 = Integer.reverse(Integer.reverse(n2 - -1885739706));
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 - -1885739706 + -1813786308 - -1813786308;
                    }
                    ++n;
                    continue block23;
                }
                case 1368700106: {
                    int cfr_ignored_28 = (Integer.rotateRight(0xB4A032F7 ^ n2, 9) - -473707740) * -1264569609;
                    n3 = (int)((long)(n2 - -1807316613) ^ 0xFCB4BDB269985873L ^ 0xFCB4BDB269985873L);
                    int cfr_ignored_29 = (Integer.rotateLeft(0xCEF0E0FD ^ n2, 12) - 327736798) * -823074563;
                    int cfr_ignored_30 = (int)(0xC424EC027D4EB4FL ^ (long)n2 ^ 0x60F0831A2DB9B555L);
                    try {
                        n -= 3;
                        n3 = n2 - -1885739706 + 2064661998 - 2064661998;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - -1885739706));
                    }
                    n -= 5;
                    continue block23;
                }
            }
            int cfr_ignored_31 = (Integer.rotateLeft(0xA47DCF98 ^ n2, 7) + -275135837) * -1535258727;
            n3 = n2 - -1885739706 ^ 0x24E80793 ^ 0x24E80793;
        }
    }

    private boolean jdl_2(class_1309 class_13092, double d) {
        try {
            int n = -1254971909;
            n = Integer.rotateLeft(n * -1411924509, 8) ^ 0xDA0B3970;
            n = System.identityHashCode(this) ^ n;
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0x15B80B37;
            if ((n2 ^ n) != 364383031) {
                int cfr_ignored_0 = (0xA08AAECC ^ n) - 1936388636;
            }
            if ((0x8F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (d >= rf.dhna_2(0xB84FB83DAB4EE783L ^ 0xF839383DAB4EE783L)) {
            return true;
        }
        return rf.jns(this, class_13092) <= rf.jmt(0.0, d) * Double.longBitsToDouble(0xA4D796AD53977979L ^ 0x9B3796AD53977979L);
    }

    public void jas_4() {
        int n = 0;
        int n2 = -943996208;
        n2 = Integer.rotateLeft(n2 * 2147101321, 17) ^ 0xF9FC9C6A;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 20);
        int n3 = (int)((long)Integer.reverse(n2 ^ 0x16DB3DDA ^ 0x440EC67F) ^ 0xE3AAB36FFAE60EE7L ^ 0xE3AAB36FFAE60EE7L);
        block25: while (true) {
            switch (Integer.reverse(n3) ^ n2 ^ 0x440EC67F) {
                case -1842057521: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x76DE5BFA ^ n2, 17) + 1766507137) * 1994284027;
                    this.rgha = null;
                    this.tdhs = null;
                    return;
                }
                case 383466970: {
                    int cfr_ignored_1 = Integer.rotateLeft(0x26F457CC ^ n2, 7) - -1141620497;
                    if (yf.khdha_2()) {
                        try {
                            ++n;
                            if ((0xBCEC32E92E08D45L ^ (long)n2 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n3 = Integer.reverse(n2 ^ 0x92346ECF ^ 0x440EC67F) + -204670398 - -204670398;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n3 = (int)((long)Integer.reverse(n2 ^ 0x92346ECF ^ 0x440EC67F) ^ 0xCB526AE9B7A80244L ^ 0xCB526AE9B7A80244L);
                        }
                        n += 3;
                        continue block25;
                    }
                    n3 = Integer.reverse(n2 ^ 0x85C0EE10 ^ 0x440EC67F) ^ 0xAF72FF09 ^ 0xAF72FF09;
                    int cfr_ignored_2 = (Integer.rotateRight(0xBDAD8F5F ^ n2, 10) - -60687428) * -1112699041;
                    n3 = Integer.reverse(n2 ^ 0x62FAB4A5 ^ 0x440EC67F);
                    n -= 4;
                    continue block25;
                }
                case 1660597413: {
                    int cfr_ignored_3 = Integer.rotateRight(0xC1358A87 ^ n2, 11) - 1775854996;
                    yf.athz_2();
                    int cfr_ignored_4 = (int)(0x7627874E713D99F1L ^ (long)n2 ^ 0xF3EC2EC8C8C5419EL);
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x9D047AB6 ^ 0x440EC67F)));
                    int cfr_ignored_5 = (int)(0x7EFF0924AE06CA35L ^ (long)n2 ^ 0xEF3990BE6F4D502FL);
                    n3 = Integer.reverse(n2 ^ 0x92346ECF ^ 0x440EC67F) ^ 0x61D22614 ^ 0x61D22614;
                    n -= 5;
                    continue block25;
                }
                case -2093739108: {
                    int cfr_ignored_6 = (Integer.rotateRight(0x2DD5F592 ^ n2, 8) + -1857659927) * 768996755;
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x349A8857 ^ 0x440EC67F) ^ 0xC0127FA4CBFAAB5EL ^ 0xC0127FA4CBFAAB5EL);
                    int cfr_ignored_7 = Integer.rotateRight(0xF7A63106 ^ n2, 17) - 25005813;
                    try {
                        n -= 5;
                        if ((0x5CA7C1B4B4874285L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (int)((long)Integer.reverse(n2 ^ 0x16DB3DDA ^ 0x440EC67F) ^ 0xE603D75B5BB9B0DEL ^ 0xE603D75B5BB9B0DEL);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(n2 ^ 0x16DB3DDA ^ 0x440EC67F) + -1927384604 - -1927384604;
                    }
                    n += 2;
                    continue block25;
                }
                case -76082260: {
                    int cfr_ignored_8 = (Integer.rotateRight(0x11DF2056 ^ n2, 5) - 778209701) * 299835479;
                    n3 = Integer.reverse(n2 ^ 0x5FB74224 ^ 0x440EC67F) ^ 0x5BF7D75D ^ 0x5BF7D75D;
                    int cfr_ignored_9 = (Integer.rotateLeft(0x8F35AFD9 ^ n2, 4) + 1541270146) * -1892306983;
                    int cfr_ignored_10 = (int)(0x4D8701E427D4EB4FL ^ (long)n2 ^ 0xFEB8831A2DB936DFL);
                    n3 = Integer.reverse(n2 ^ 0x16DB3DDA ^ 0x440EC67F);
                    n += 5;
                    continue block25;
                }
                case 1506583111: {
                    int cfr_ignored_11 = Integer.rotateRight(0x7F5E4F66 ^ n2, 18) - 1892236437;
                    int cfr_ignored_12 = (int)(0x7A5D45321BB02F3DL ^ (long)n2 ^ 0x7714FBD3A55D596BL);
                    n3 = Integer.reverse(n2 ^ 0x16DB3DDA ^ 0x440EC67F) ^ 0x1F45C47E ^ 0x1F45C47E;
                    n -= 4;
                    continue block25;
                }
                case 740607068: {
                    int cfr_ignored_13 = Integer.rotateRight(0x5450C8C7 ^ n2, 13) - 975564628;
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x16DB3DDA ^ 0x440EC67F) ^ 0x7DC4EA5B3616FB0CL ^ 0x7DC4EA5B3616FB0CL);
                    int cfr_ignored_14 = Integer.rotateLeft(0x9B6A4A09 ^ n2, 6) + -700672430;
                    int cfr_ignored_15 = (int)(0x59D8E43427D4EB4FL ^ (long)n2 ^ 0x3518831A2DB91E60L);
                    continue block25;
                }
                case 1544535649: {
                    int cfr_ignored_16 = (Integer.rotateRight(0xB336A5BE ^ n2, 9) - -1208241859) * -1288264257;
                    n3 = Integer.reverse(n2 ^ 0x75EE32D ^ 0x440EC67F);
                    int cfr_ignored_17 = Integer.rotateLeft(0x874E2AA0 ^ n2, 3) + 1725221019;
                    n3 = Integer.reverse(n2 ^ 0x16DB3DDA ^ 0x440EC67F);
                    continue block25;
                }
                case 1745136965: {
                    int cfr_ignored_18 = Integer.rotateRight(0x973DEF4F ^ n2, 5) - 1423808972;
                    int cfr_ignored_19 = (int)(0x5E5622B73B6F8FC4L ^ (long)n2 ^ 0xB81EBA6CE4AF117DL);
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x16DB3DDA ^ 0x440EC67F) ^ 0x26E0FF8DE54E2853L ^ 0x26E0FF8DE54E2853L);
                    n += 5;
                    continue block25;
                }
                case -1449082314: {
                    int cfr_ignored_20 = Integer.rotateLeft(0xD0BC5E8C ^ n2, 13) - 1261244975;
                    try {
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x16DB3DDA ^ 0x440EC67F)));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(n2 ^ 0x16DB3DDA ^ 0x440EC67F) + 1045010118 - 1045010118;
                    }
                    n -= 2;
                    continue block25;
                }
                case 547153956: {
                    int cfr_ignored_21 = (Integer.rotateLeft(0x3335B199 ^ n2, 9) + 937304258) * 859156889;
                    int cfr_ignored_22 = (int)(0xF1871FA427D4EB4FL ^ (long)n2 ^ 0xC238831A2DB84EDFL);
                    try {
                        n -= 4;
                        if ((0x8E0F99A7C4330A09L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.reverse(n2 ^ 0x16DB3DDA ^ 0x440EC67F) ^ 0xB83BABEE ^ 0xB83BABEE;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.reverse(n2 ^ 0x16DB3DDA ^ 0x440EC67F);
                    }
                    n += 4;
                    continue block25;
                }
                case 533312731: {
                    int cfr_ignored_23 = Integer.rotateLeft(0x4BFFB5E4 ^ n2, 12) - 945071575;
                    try {
                        n3 = (int)((long)Integer.reverse(n2 ^ 0x16DB3DDA ^ 0x440EC67F) ^ 0x8DAB3535F23F583L ^ 0x8DAB3535F23F583L);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(n2 ^ 0x16DB3DDA ^ 0x440EC67F) ^ 0x12398CC ^ 0x12398CC;
                    }
                    n -= 2;
                    continue block25;
                }
                case -113028240: {
                    int cfr_ignored_24 = Integer.rotateRight(0x91436C26 ^ n2, 5) - -1685604395;
                    n3 = Integer.reverse(n2 ^ 0xF4428001 ^ 0x440EC67F) ^ 0xFBB2F8AF ^ 0xFBB2F8AF;
                    int cfr_ignored_25 = (Integer.rotateRight(0x13A901B7 ^ n2, 5) - 1708446820) * 329843127;
                    int cfr_ignored_26 = (int)(0x79670C710C6A0F75L ^ (long)n2 ^ 0xE592D467E5CD5F1FL);
                    n3 = Integer.reverse(n2 ^ 0xCE24360B ^ 0x440EC67F) ^ 0xAF04E490 ^ 0xAF04E490;
                    int cfr_ignored_27 = (int)(0xF679622702D20F8AL ^ (long)n2 ^ 0x393EC917E4324123L);
                    n3 = Integer.reverse(n2 ^ 0x16DB3DDA ^ 0x440EC67F);
                    n -= 5;
                    continue block25;
                }
            }
            int cfr_ignored_28 = (Integer.rotateRight(0x2F864EF7 ^ n2, 8) - -979292380) * 797331191;
            n3 = (int)((long)Integer.reverse(n2 ^ 0x16DB3DDA ^ 0x440EC67F) ^ 0x31F7069F97DEF20AL ^ 0x31F7069F97DEF20AL);
        }
    }

    @Generated
    public class_1309 shfl() {
        block0: {
            int n = 375466156;
            n = Integer.rotateLeft(n * -180740331, 12) ^ 0xD594401D;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
            int n2 = n ^ 0xEB3D92C3;
            if ((n2 ^ n) == -348286269) break block0;
            int cfr_ignored_0 = (0xFD5CBA6F ^ n) - 24672795;
        }
        return this.rgha;
    }

    private static double tyl(class_1309 class_13092) {
        block0: {
            int n = ta_3.ahj(2041119966);
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0x868AA5F;
            if ((n2 ^ n) == 141077087) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x71C1AE81 ^ n, 17) + -892223270;
            int cfr_ignored_1 = (int)(0xB37300BC27D4EB4FL ^ (long)n ^ 0xFC08831A2DB8CB37L);
        }
        return rf.mc.field_1724.method_5858((class_1297)class_13092);
    }

    private static double zjk(class_1309 class_13092) {
        try {
            int n = -2047620608;
            n = Integer.rotateLeft(n * 68052463, 20) ^ 0x3F619481;
            class_1309 class_13093 = class_13092;
            n = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 21);
            int n2 = n ^ 0x9C4D2BDC;
            if ((n2 ^ n) != -1672664100) {
                int cfr_ignored_0 = (0x19BEE1DC ^ n) + 717892310;
            }
            if ((0x357 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return class_13092.method_6032() + class_13092.method_6067();
    }

    private static double bsz_2(class_1309 class_13092) {
        block0: {
            int n = -947038158;
            n = Integer.rotateLeft(n * 616345851, 20) ^ 0x994D0AAD;
            class_1309 class_13093 = class_13092;
            n = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 13);
            int n2 = n ^ 0x5B03D617;
            if ((n2 ^ n) == 1526978071) break block0;
            int cfr_ignored_0 = (0x9C8E8E25 ^ n) - -886398943;
        }
        return class_13092.method_6096();
    }

    private static double tgha_3(class_1309 class_13092) {
        block0: {
            int n = ta_3.ahj(-136084927);
            int n2 = n ^ 0xDE211FD4;
            if ((n2 ^ n) == -568254508) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x29C29D95 ^ n, 8) - 317633606) * 700620181;
            int cfr_ignored_1 = (int)(0xEB7033A827D4EB4FL ^ (long)n ^ 0x9A20831A2DB87B31L);
        }
        return rf.mc.field_1724.method_5858((class_1297)class_13092);
    }

    private static double khht_3(class_1309 class_13092) {
        block0: {
            int n = 492613554;
            n = Integer.rotateLeft(n * 1002329065, 9) ^ 0x71182207;
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0xA8DA0DC0;
            if ((n2 ^ n) == -1462104640) break block0;
            int cfr_ignored_0 = (0xB586A272 ^ n) + 987643690;
        }
        return rf.mc.field_1724.method_5858((class_1297)class_13092);
    }

    private static double tzd_3(class_1309 class_13092) {
        block0: {
            int n = -659812774;
            n = Integer.rotateLeft(n * 1906474313, 22) ^ 0x5A54A3A4;
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0x916B97FC;
            if ((n2 ^ n) == -1855219716) break block0;
            int cfr_ignored_0 = (0x49C799A6 ^ n) - 871850631;
        }
        return class_13092.method_6032() + class_13092.method_6067();
    }

    private static boolean khzf_2(ghd ghd2, class_1309 class_13092) {
        int n = -654662163;
        n = Integer.rotateLeft(n * 597994963, 9) ^ 0x6AF0A31A;
        ghd ghd3 = ghd2;
        n = Integer.rotateRight((ghd3 != null ? System.identityHashCode(ghd3) : 0) ^ n, 20);
        class_1309 class_13093 = class_13092;
        n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
        int n2 = n ^ 0x5264380A;
        if ((n2 ^ n) != 1382299658) {
            int cfr_ignored_0 = (0x8A9E9DE7 ^ n) + 1377046046;
        }
        return ghd2.hmj || rf.mc.field_1724.method_6057((class_1297)class_13092);
    }

    private boolean raw_2(ghd ghd2, class_1309 class_13092) {
        block0: {
            int n = 293040833;
            n = Integer.rotateLeft(n * 757654315, 6) ^ 0x199F178;
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0xF93BDB6;
            if ((n2 ^ n) == 261340598) break block0;
            int cfr_ignored_0 = (0x1EE4CF77 ^ n) - -643418681;
        }
        return this.jdl_2(class_13092, ghd2.jthb);
    }

    private boolean rwsh(double d, class_1309 class_13092) {
        int n = 526670314;
        n = Integer.rotateLeft(n * -1379173783, 3) ^ 0x1328F89D;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 29);
        n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 3);
        int n2 = n ^ 0x5B6179E4;
        if ((n2 ^ n) != 1533114852) {
            int cfr_ignored_0 = (0x4405200E ^ n) - -820408095;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return this.hath(class_13092) <= d;
    }

    private boolean tfa_4(ghd ghd2, class_1309 class_13092) {
        block0: {
            int n = -1695252571;
            n = Integer.rotateLeft(n * -791633763, 5) ^ 0x2B191EEC;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0xF58BA98D;
            if ((n2 ^ n) == -175396467) break block0;
            int cfr_ignored_0 = (0x6F7FD628 ^ n) - 1519503287;
        }
        return this.ghsw_2(class_13092, ghd2);
    }

    private static String raa(String string, int n, int n2, int n3) {
        int n4 = ta_3.ahj(-2038768524);
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateLeft(n ^ n4, 23)) ^ 0x1F0D1848;
        if ((n5 ^ n4) != 520951880) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x9977C43C ^ n4, 6) - -1713479041) * -1720204227;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x9667F19A) + i ^ shjk, 11) ^ n2 + rsh_4));
        }
        return new String(cArray);
    }

    private static void hkhl(rf rf2) {
        int n = 1324576840;
        n = Integer.rotateLeft(n * -738201031, 8) ^ 0x963AA54B;
        rf rf3 = rf2;
        n = (rf3 != null ? System.identityHashCode(rf3) : 0) ^ n;
        int n2 = n ^ 0x9C54FF39;
        if ((n2 ^ n) != -1672151239) {
            int cfr_ignored_0 = (0xD2A78F71 ^ n) - 621319978;
        }
        rf2.jas_4();
    }

    private static class_243 tta_3(class_746 class_7462) {
        block0: {
            int n = 161330849;
            int n2 = (n = Integer.rotateLeft(n * 1540507791, 21) ^ 0x1BB66B95) ^ 0xC5DC1617;
            if ((n2 ^ n) == -975432169) break block0;
            int cfr_ignored_0 = (0xCC41A0B6 ^ n) + -1413925777;
        }
        return class_7462.method_18798();
    }

    private static int hdr(Integer n) {
        block0: {
            int n2 = -1575191995;
            n2 = Integer.rotateLeft(n2 * -1446025155, 11) ^ 0xCFBA169F;
            Integer n3 = n;
            n2 = (n3 != null ? System.identityHashCode(n3) : 0) ^ n2;
            int n4 = n2 ^ 0x3807384;
            if ((n4 ^ n2) == 58749828) break block0;
            int cfr_ignored_0 = (0xA19C09C1 ^ n2) - -780473490;
        }
        return n;
    }

    private static boolean shqd(rf rf2, class_1309 class_13092, ghd ghd2) {
        block0: {
            int n = -266395860;
            n = Integer.rotateLeft(n * -1343121423, 19) ^ 0x6EFBC24A;
            rf rf3 = rf2;
            n = Integer.rotateRight((rf3 != null ? System.identityHashCode(rf3) : 0) ^ n, 2);
            int n2 = n ^ 0x6BDB8520;
            if ((n2 ^ n) == 1809548576) break block0;
            int cfr_ignored_0 = (0x9BC49A0C ^ n) + -288097932;
        }
        return rf2.ghsw_2(class_13092, ghd2);
    }

    private static double shthk(rf rf2, class_1309 class_13092) {
        block0: {
            int n = ta_3.ahj(1746305108);
            rf rf3 = rf2;
            n = (rf3 != null ? System.identityHashCode(rf3) : 0) ^ n;
            int n2 = n ^ 0x1D4B66FA;
            if ((n2 ^ n) == 491480826) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x755DE6AE ^ n, 17) - 985435725;
        }
        return rf2.hath(class_13092);
    }

    private static boolean dhwt(class_1309 class_13092) {
        block0: {
            int n = -1725962126;
            n = Integer.rotateLeft(n * 1527087503, 28) ^ 0x219C6045;
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0xD6949D30;
            if ((n2 ^ n) == -694903504) break block0;
            int cfr_ignored_0 = (0x4F8B7542 ^ n) - 656664531;
        }
        return class_13092.method_5805();
    }

    private static boolean bwl(class_1657 class_16572) {
        block0: {
            int n = -1025061373;
            int n2 = (n = Integer.rotateLeft(n * -32111493, 12) ^ 0x55452E50) ^ 0x557FE125;
            if ((n2 ^ n) == 1434444069) break block0;
            int cfr_ignored_0 = (0x97992F26 ^ n) + 2122056276;
        }
        return class_16572.method_7325();
    }

    private static boolean zhm_3(class_1657 class_16572) {
        block0: {
            int n = -993646499;
            n = Integer.rotateLeft(n * -621689537, 6) ^ 0x8BDDEF79;
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0xF2C5F6CE;
            if ((n2 ^ n) == -221907250) break block0;
            int cfr_ignored_0 = (0x3603DE93 ^ n) + -1614937836;
        }
        return blh_2.dhwj(class_16572);
    }

    private static class_1799 dhj(class_1657 class_16572, class_1304 class_13042) {
        block0: {
            int n = ta_3.ahj(16531304);
            class_1657 class_16573 = class_16572;
            n = Integer.rotateRight((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 9);
            class_1304 class_13043 = class_13042;
            n = Integer.rotateLeft((class_13043 != null ? System.identityHashCode(class_13043) : 0) ^ n, 3);
            int n2 = n ^ 0x47EBD194;
            if ((n2 ^ n) == 1206636948) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x4717EEFC ^ n, 11) - -1606185025) * 1192750845;
        }
        return class_16572.method_6118(class_13042);
    }

    private static boolean tbdh(class_1799 class_17992) {
        block0: {
            int n = 1316051018;
            n = Integer.rotateLeft(n * -1025515191, 28) ^ 0xA4F3C4E8;
            class_1799 class_17993 = class_17992;
            n = Integer.rotateLeft((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 3);
            int n2 = n ^ 0xD92AE486;
            if ((n2 ^ n) == -651500410) break block0;
            int cfr_ignored_0 = (0x975BBCCC ^ n) + 341437205;
        }
        return class_17992.method_7960();
    }

    private static void awkh() {
        int n = ta_3.ahj(-353606265);
        int n2 = n ^ 0x6FA20F23;
        if ((n2 ^ n) != 1872891683) {
            int cfr_ignored_0 = Integer.rotateLeft(0x854E6AA4 ^ n, 3) - 685541655;
        }
        yf.athz_2();
    }

    private static class_238 shyb(class_1309 class_13092) {
        block0: {
            int n = ta_3.ahj(-34277049);
            int n2 = n ^ 0x29B2217;
            if ((n2 ^ n) == 43721239) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xFF6FDB50 ^ n, 18) + -219599381) * -9446575;
        }
        return class_13092.method_5829();
    }

    private static double ghst_3(double d, double d2, double d3) {
        block0: {
            int n = 459183059;
            n = Integer.rotateLeft(n * -1136470189, 6) ^ 0x4867472A;
            n = (int)Double.doubleToLongBits(d3) ^ n;
            int n2 = n ^ 0x5323423D;
            if ((n2 ^ n) == 1394819645) break block0;
            int cfr_ignored_0 = (0x487DD1EE ^ n) + 704650440;
        }
        return class_3532.method_15350((double)d, (double)d2, (double)d3);
    }

    private static double dhghdh(class_243 class_2432) {
        block0: {
            int n = ta_3.ahj(-1676134906);
            class_243 class_2433 = class_2432;
            n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
            int n2 = n ^ 0xC8C99F0C;
            if ((n2 ^ n) == -926310644) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x54D1A90A ^ n, 13) + 1237391217;
        }
        return class_2432.method_1033();
    }

    private static Comparator hdr_2(ToDoubleFunction toDoubleFunction) {
        block0: {
            int n = 1397384012;
            n = Integer.rotateLeft(n * 997951545, 21) ^ 0x665CB386;
            ToDoubleFunction toDoubleFunction2 = toDoubleFunction;
            n = Integer.rotateRight((toDoubleFunction2 != null ? System.identityHashCode(toDoubleFunction2) : 0) ^ n, 7);
            int n2 = n ^ 0xC2A13574;
            if ((n2 ^ n) == -1029622412) break block0;
            int cfr_ignored_0 = (0x91EB5638 ^ n) + 1473402297;
        }
        return Comparator.comparingDouble(toDoubleFunction);
    }

    private static boolean trh_3() {
        block0: {
            int n = ta_3.ahj(-155511941);
            int n2 = n ^ 0xB54CB934;
            if ((n2 ^ n) == -1253263052) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x43F7AA4F ^ n, 11) - 1062944460;
        }
        return yf.dnkh();
    }

    private static class_243 dhjh_2(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = 1687844580;
            n = Integer.rotateLeft(n * -1858189741, 9) ^ 0x8EF63AF0;
            class_243 class_2434 = class_2432;
            n = Integer.rotateLeft((class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n, 22);
            int n2 = n ^ 0xD3A2DA5E;
            if ((n2 ^ n) == -744301986) break block0;
            int cfr_ignored_0 = (0xB738ACBA ^ n) - -1633877335;
        }
        return class_2432.method_1020(class_2433);
    }

    private static double tth_3(long l) {
        block0: {
            int n = ta_3.ahj(-1572417184);
            int n2 = n ^ 0x14544D6B;
            if ((n2 ^ n) == 341069163) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xB6129C0B ^ n, 9) + 278824080;
        }
        return Double.longBitsToDouble(l);
    }

    private static double zghd_3(long l) {
        block0: {
            int n = ta_3.ahj(-1919955153);
            int n2 = (n = (int)l ^ n) ^ 0x20397239;
            if ((n2 ^ n) == 540635705) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xADB6BD16 ^ n, 8) - 226395365) * -1380532969;
        }
        return Double.longBitsToDouble(l);
    }

    private static double dhna_2(long l) {
        block0: {
            int n = 2143192494;
            n = Integer.rotateLeft(n * 2067676191, 8) ^ 0x5E54ECC;
            int n2 = (n = Integer.rotateRight((int)l ^ n, 17)) ^ 0xB672E505;
            if ((n2 ^ n) == -1233984251) break block0;
            int cfr_ignored_0 = (0xC9CC60AB ^ n) + -967633082;
        }
        return Double.longBitsToDouble(l);
    }

    private static double jns(rf rf2, class_1309 class_13092) {
        block0: {
            int n = -365848028;
            n = Integer.rotateLeft(n * 1274387243, 21) ^ 0x20C646C3;
            rf rf3 = rf2;
            n = (rf3 != null ? System.identityHashCode(rf3) : 0) ^ n;
            int n2 = n ^ 0xA5BB8A68;
            if ((n2 ^ n) == -1514435992) break block0;
            int cfr_ignored_0 = (0x4F8A104C ^ n) + 1959993363;
        }
        return rf2.djw_2(class_13092);
    }

    private static double jmt(double d, double d2) {
        block0: {
            int n = -221660861;
            n = Integer.rotateLeft(n * -1641384121, 22) ^ 0xC0B0C3AE;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d2) ^ n, 7);
            int n2 = n ^ 0xF62B3F;
            if ((n2 ^ n) == 16132927) break block0;
            int cfr_ignored_0 = (0xF23F927C ^ n) + -1122127337;
        }
        return Math.max(d, d2);
    }

    private static String[] shtht(String string) {
        int n = 1462375132;
        n = Integer.rotateLeft(n * 2000845639, 14) ^ 0x62B02FC1;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xF5879E66;
        if ((n2 ^ n) != -175661466) {
            int cfr_ignored_0 = (0xA2AD8CBA ^ n) - 734904905;
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

    private static CallSite tab_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1340019311;
            n3 = Integer.rotateLeft(n3 * -1187537425, 9) ^ 0x301010FD;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 20);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 20);
            int n4 = n3 ^ 0x715DD785;
            if ((n4 ^ n3) != 1901975429) {
                int cfr_ignored_0 = (0xC17D3A14 ^ n3) + -1650885200;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ jzth ^ string.hashCode() ^ n2 + shhn_2 ^ i * -620500691 ^ jzth, 27) ^ shhn_2));
            }
            String[] stringArray = rf.shtht(new String(cArray));
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

    private static String[] l1ncq5i8h8l58h(String string) {
        return string.split("\u0002\u0010", -1);
    }

    private static CallSite my8jcdmu6jc(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ yw9gn1omk ^ string.hashCode() ^ n2 + lldjpvzdv + i * 355417787) + yw9gn1omk) ^ lldjpvzdv));
            }
            String[] stringArray = rf.l1ncq5i8h8l58h(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

