/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_241
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_290
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_290;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.btsh;
import us.m0vy.moondlc.m0vyguard.bths_2;
import us.m0vy.moondlc.m0vyguard.bthn;
import us.m0vy.moondlc.m0vyguard.bja_2;
import us.m0vy.moondlc.m0vyguard.bdht_2;
import us.m0vy.moondlc.m0vyguard.bsj;
import us.m0vy.moondlc.m0vyguard.bzh_4;
import us.m0vy.moondlc.m0vyguard.bqa_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bmn;
import us.m0vy.moondlc.m0vyguard.bhh_4;
import us.m0vy.moondlc.m0vyguard.byh;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tjd_2;
import us.m0vy.moondlc.m0vyguard.zz_4;
import us.m0vy.moondlc.m0vyguard.ah_2;
import us.m0vy.moondlc.m0vyguard.ghkh;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class ht_2
implements tthy,
byh {
    private final bql<bbgh> thhf = this::zdhsh_2;
    private static final int bdhs = -1215187454;
    private static final int zdh_4 = 1338078499;
    private static final int shj_3 = 566382702;
    private static final int zzl = -1243931531;
    private static final int x6u0yjgm = 1893852381;
    private static final int t8zj19qsp = -55349338;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int c2ll0s1p;

    public ht_2() {
        Moondlc.getInstance().getEventManager().sdz_4(this);
    }

    public bthn sld_2() {
        int n = -1580554115;
        n = Integer.rotateLeft(n * 925679083, 15) ^ 0xEE807FC;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 16);
        int n2 = n ^ 0x7799ACAF;
        if ((n2 ^ n) != 2006559919) {
            int cfr_ignored_0 = (0xD65304D2 ^ n) + -2064435661;
        }
        return ht_2.tghk(ht_2.ttt_3(ht_2.shzw(ht_2.rzw_2(ht_2.rtt_3(bdht_2.ssht_2("waypoint"), new String[]{"way"}), "Manage waypoints").dqdh_2("action", ht_2::thna).dqdh_2("name", ht_2::khdq), "x", this::ahq).dqdh_2("y", this::jshj), ht_2.kz("燂", -1992013201 - 1538465738, 1180429409 + 1512294534, ht_2.stb_2(-1170257918) ^ 0xDD764187), this::dst_3), this::dwh).szy_2();
    }

    private ah_2 zhs_6(String string) {
        try {
            int n = 1760810898;
            n = Integer.rotateLeft(n * -2027764685, 24) ^ 0xF471B8F0;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xEAA8CF4B;
            if ((n2 ^ n) != -358035637) {
                int cfr_ignored_0 = (0x825B18D9 ^ n) - -774681289;
            }
            Integer.parseInt(string);
            return ah_2.tsy(string);
        }
        catch (NumberFormatException numberFormatException) {
            return ah_2.thsdh_2("Invalid".concat(" number"));
        }
    }

    /*
     * Exception decompiling
     */
    private void dwh(bths_2 var1_1) {
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

    private void rshk(bbgh bbgh2, class_4587 class_45872) {
        for (Map.Entry entry : Moondlc.getInstance().getWayPointsManager().ztn_3()) {
            String string = (String)entry.getKey();
            class_243 class_2432 = (class_243)entry.getValue();
            class_243 class_2433 = class_2432.method_1031(0.0, 0.5, 0.0);
            class_241 class_2412 = btsh.zgha_4(class_2433);
            if (class_2412 == null) continue;
            float f = (float)ht_2.mc.field_1724.method_19538().method_1022(class_2432.method_1031(0.5, 0.5, 0.5));
            float f2 = class_3532.method_15363((float)(1.0f - f / 20.0f), (float)0.5f, (float)1.0f);
            class_45872.method_22903();
            class_45872.method_46416(class_2412.field_1343, class_2412.field_1342, 0.0f);
            class_45872.method_22905(f2, f2, 1.0f);
            int n = (int)bmn.sdha_2.twy_2(11.0f).dak(string + " " + String.format("%.1f", ht_2.mc.field_1724.method_19538().method_1022(class_2432)) + "m");
            int n2 = -n / 2;
            int n3 = 5;
            bbgh2.dtn().drawRect(n2 - 3, n3 - 3, n + 8, bmn.sdha_2.twy_2(11.0f).thssh_2() + 6.0f, new byq(0.0f, 0.0f, 0.0f, 100.0f));
            class_45872.method_22909();
        }
    }

    private void trgh(bbgh bbgh2, class_4587 class_45872) {
        for (Map.Entry entry : Moondlc.getInstance().getWayPointsManager().ztn_3()) {
            String string = (String)entry.getKey();
            class_243 class_2432 = (class_243)entry.getValue();
            class_243 class_2433 = class_2432.method_1031(0.0, 0.5, 0.0);
            class_241 class_2412 = btsh.zgha_4(class_2433);
            if (class_2412 == null) continue;
            float f = (float)ht_2.mc.field_1724.method_19538().method_1022(class_2432.method_1031(0.5, 0.5, 0.5));
            float f2 = class_3532.method_15363((float)(1.0f - f / 20.0f), (float)0.5f, (float)1.0f);
            class_45872.method_22903();
            class_45872.method_46416(class_2412.field_1343, class_2412.field_1342, 0.0f);
            class_45872.method_22905(f2, f2, 1.0f);
            int n = (int)bmn.sdha_2.twy_2(11.0f).dak(string + " " + String.format("%.1f", ht_2.mc.field_1724.method_19538().method_1022(class_2432)) + "m");
            int n2 = -n / 2;
            int n3 = 5;
            bbgh2.dtn().drawText(bmn.sdha_2.twy_2(11.0f), string + " " + String.format("%.1f", ht_2.mc.field_1724.method_19538().method_1022(class_2432)) + "m", n2, n3, byq.brz_2);
            class_45872.method_22909();
        }
    }

    private void dst_3(bsj bsj2) {
        try {
            int n = -811092499;
            n = Integer.rotateLeft(n * 1705998243, 24) ^ 0x33EBB588;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x513333EB;
            if ((n2 ^ n) != 1362310123) {
                int cfr_ignored_0 = (0x9E948606 ^ n) - 1185985694;
            }
            if ((0x1CF & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        bsj2.tkn().tkk_2(this::zhs_6);
    }

    private void jshj(bsj bsj2) {
        int n = 0;
        int n2 = 1069082715;
        n2 = Integer.rotateLeft(n2 * 1424879897, 19) ^ 0x45B32B71;
        n2 = System.identityHashCode(this) ^ n2;
        bsj bsj3 = bsj2;
        n2 = (bsj3 != null ? System.identityHashCode(bsj3) : 0) ^ n2;
        int n3 = Integer.reverse(Integer.reverse((n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623));
        block31: while (true) {
            switch (n3 - -1183893623 ^ 0xB96F3789 ^ n2) {
                case -25281924: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x66D1C2BB ^ n2, 15) + 2009347040) * 1725022907;
                    bsj2.tkn().tkk_2(this::zhs_6);
                    return;
                }
                case 376406685: {
                    int cfr_ignored_1 = (Integer.rotateLeft(0x79E962F8 ^ n2, 18) + -945775805) * 2045338361;
                    if (yf.dnkh()) {
                        try {
                            n -= 4;
                            n3 = (n2 ^ 0xD918DCAF ^ 0xB96F3789) + -1183893623 ^ 0xF7F339BB ^ 0xF7F339BB;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = (n2 ^ 0xD918DCAF ^ 0xB96F3789) + -1183893623 ^ 0x42E7B88 ^ 0x42E7B88;
                        }
                        n -= 3;
                        continue block31;
                    }
                    try {
                        ++n;
                        if ((0x3AB53C57F5CB974DL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xFE7E3A7C ^ 0xB96F3789) + -1183893623));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (n2 ^ 0xFE7E3A7C ^ 0xB96F3789) + -1183893623;
                    }
                    continue block31;
                }
                case -652682065: {
                    int cfr_ignored_2 = Integer.rotateRight(0x92D24B4B ^ n2, 5) + -875250352;
                    throw null;
                }
                case -1877782274: {
                    int cfr_ignored_3 = Integer.rotateLeft(0xBD6E74C0 ^ n2, 10) + -188890501;
                    n3 = (n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623 + 848739915 - 848739915;
                    int cfr_ignored_4 = Integer.rotateRight(0x8081F94F ^ n2, 3) - -1810182196;
                    --n;
                    continue block31;
                }
                case -527110333: {
                    int cfr_ignored_5 = (Integer.rotateLeft(0xE0C79058 ^ n2, 15) + 1015552483) * -523792295;
                    try {
                        n += 4;
                        if ((0x35E2BBB1407EFEF9L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623 ^ 0xDA655C6A ^ 0xDA655C6A;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (int)((long)((n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623) ^ 0xA8172EC3BFF273F5L ^ 0xA8172EC3BFF273F5L);
                    }
                    continue block31;
                }
                case 2037649072: {
                    int cfr_ignored_6 = (Integer.rotateRight(0x490B5092 ^ n2, 12) + -591634199) * 1225478291;
                    int cfr_ignored_7 = (int)(0xCFC553AD0FCAB408L ^ (long)n2 ^ 0x5A2AD3269336325BL);
                    n3 = (int)((long)((n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623) ^ 0x136B5E470735881CL ^ 0x136B5E470735881CL);
                    n += 3;
                    continue block31;
                }
                case -474513688: {
                    int cfr_ignored_8 = Integer.rotateLeft(0x7CC3F8C4 ^ n2, 18) - 538492663;
                    n3 = (n2 ^ 0x79750411 ^ 0xB96F3789) + -1183893623 ^ 0xA9787818 ^ 0xA9787818;
                    int cfr_ignored_9 = (Integer.rotateRight(0xFC7069D2 ^ n2, 18) + -1778749527) * -59741741;
                    n3 = (n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623 ^ 0x16225AE0 ^ 0x16225AE0;
                    int cfr_ignored_10 = (Integer.rotateRight(0xACC0B597 ^ n2, 8) - -273441660) * -1396656745;
                    n -= 2;
                    continue block31;
                }
                case 1178437043: {
                    int cfr_ignored_11 = (Integer.rotateRight(0x6D214E77 ^ n2, 16) - 996548516) * 1830899319;
                    try {
                        n3 = (n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623 + 365830048 - 365830048;
                    }
                    ++n;
                    continue block31;
                }
                case 293249269: {
                    int cfr_ignored_12 = (Integer.rotateRight(0x143185F2 ^ n2, 5) + 1985795977) * 338789875;
                    try {
                        n -= 5;
                        if ((0xC204FDDC320E663BL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623 ^ 0x13FA6858 ^ 0x13FA6858;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623 ^ 0x3974B1FD ^ 0x3974B1FD;
                    }
                    n -= 4;
                    continue block31;
                }
                case -661414093: {
                    int cfr_ignored_13 = Integer.rotateLeft(0xBCA3E8A0 ^ n2, 10) + -600388965;
                    try {
                        if ((0x839A2703A3F7DDFDL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623 ^ 0x33E1BE0E ^ 0x33E1BE0E;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)((n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623) ^ 0x6B4DBBE13B6C0AEFL ^ 0x6B4DBBE13B6C0AEFL);
                    }
                    n -= 2;
                    continue block31;
                }
                case 1467199378: {
                    int cfr_ignored_14 = (Integer.rotateRight(0x887287FF ^ n2, 4) - -1975773412) * -2005760001;
                    try {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623 ^ 0xBF9CB305 ^ 0xBF9CB305;
                    }
                    n -= 5;
                    continue block31;
                }
                case 165805345: {
                    int cfr_ignored_15 = Integer.rotateRight(0x41DB952E ^ n2, 11) - -34295859;
                    n3 = (n2 ^ 0x9C911CBC ^ 0xB96F3789) + -1183893623;
                    int cfr_ignored_16 = Integer.rotateRight(0x269D0EEE ^ n2, 7) - -1318949363;
                    n3 = (int)((long)((n2 ^ 0x8B31AC19 ^ 0xB96F3789) + -1183893623) ^ 0x7E94B903B87626BDL ^ 0x7E94B903B87626BDL);
                    int cfr_ignored_17 = (Integer.rotateLeft(0xF8E5B39C ^ n2, 18) - 674127647) * -119164003;
                    n3 = (n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623 ^ 0xA6176B88 ^ 0xA6176B88;
                    n += 5;
                    continue block31;
                }
                case 247013642: {
                    int cfr_ignored_18 = Integer.rotateLeft(0xA0BE5989 ^ n2, 7) + 2070574802;
                    int cfr_ignored_19 = (int)(0x620CF7B427D4EB4FL ^ (long)n2 ^ 0x1218831A2DB969C8L);
                    try {
                        if ((0xCA88DB7716A5661L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623 ^ 0xC9F5CD36 ^ 0xC9F5CD36;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623 + 353330409 - 353330409;
                    }
                    continue block31;
                }
            }
            int cfr_ignored_20 = (Integer.rotateRight(0x48EA8A33 ^ n2, 12) + -658220184) * 1223330355;
            n3 = (n2 ^ 0x166F829D ^ 0xB96F3789) + -1183893623 ^ 0x9D4CDF6 ^ 0x9D4CDF6;
        }
    }

    private void ahq(bsj bsj2) {
        int n = bhh_4.hry(211065050);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x28E23572;
        if ((n2 ^ n) != 685913458) {
            int cfr_ignored_0 = Integer.rotateLeft(0x2476ADA8 ^ n, 7) + 1857857171;
        }
        bsj2.tkn().tkk_2(this::zhs_6);
    }

    private static void khdq(bsj bsj2) {
        int n = 1952234961;
        int n2 = (n = Integer.rotateLeft(n * -1189185089, 20) ^ 0x5A2C74D5) ^ 0xCF03A07E;
        if ((n2 ^ n) != -821845890) {
            int cfr_ignored_0 = (0xBB5F1DAF ^ n) + 111597888;
        }
        bsj2.tkn().tkk_2(ah_2::tsy);
    }

    private static void thna(bsj bsj2) {
        try {
            int n = -1953332218;
            n = Integer.rotateLeft(n * -458300557, 4) ^ 0xCAA617C4;
            int n2 = n ^ 0xEC1ABC0B;
            if ((n2 ^ n) != -333792245) {
                int cfr_ignored_0 = (0x6788380D ^ n) + -1815556915;
            }
            if ((0x137 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        bsj2.dby_2("add", "del", "clear");
    }

    private void zdhsh_2(bbgh bbgh2) {
        int n = 1049051138;
        n = Integer.rotateLeft(n * -534914969, 9) ^ 0x15A6ACFE;
        n = System.identityHashCode(this) ^ n;
        bbgh bbgh3 = bbgh2;
        n = Integer.rotateRight((bbgh3 != null ? System.identityHashCode(bbgh3) : 0) ^ n, 15);
        int n2 = n ^ 0x5EF54796;
        if ((n2 ^ n) != 1593132950) {
            int cfr_ignored_0 = (0x60720794 ^ n) + -1327830890;
        }
        class_4587 class_45872 = bbgh2.dtn().method_51448();
        bqa_2 bqa2 = new bqa_2(class_290.field_1576, bbgh2.dtn().method_51448());
        this.rshk(bbgh2, class_45872);
        ((tjd_2)bqa2).jbn();
        bja_2 bja2 = new bja_2(class_290.field_1575, bmn.sdha_2);
        this.trgh(bbgh2, class_45872);
        bja2.jbn();
    }

    private static String kz(String string, int n, int n2, int n3) {
        try {
            int n4 = 1427807951;
            n4 = Integer.rotateLeft(n4 * -727128123, 19) ^ 0xE93AFB2D;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 26);
            int n5 = n4 ^ 0x1CD7FDBA;
            if ((n5 ^ n4) != 483917242) {
                int cfr_ignored_0 = (0x49CD6375 ^ n4) - 956172176;
            }
            if ((0x3C2 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xDE6F00D0) + i ^ bdhs, 23) ^ n2 + zdh_4));
        }
        return new String(cArray);
    }

    private static String bss_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bhh_4.hry(-673313230);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 9)) ^ 0x50A0B9C2;
            if ((n5 ^ n4) == 1352710594) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x877EB7F0 ^ n4, 3) + 1823860043) * -2021738511;
        }
        return ht_2.kz(string, n, n2, n3);
    }

    private static bdht_2 rtt_3(bdht_2 bdht2, String[] stringArray) {
        block0: {
            int n = bhh_4.hry(1891460714);
            bdht_2 bdht3 = bdht2;
            n = Integer.rotateRight((bdht3 != null ? System.identityHashCode(bdht3) : 0) ^ n, 7);
            int n2 = n ^ 0x4205E107;
            if ((n2 ^ n) == 1107681543) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x32B8876D ^ n, 9) - 683017582;
            int cfr_ignored_1 = (int)(0xF00A295027D4EB4FL ^ (long)n ^ 0xAFD0831A2DB84DC5L);
        }
        return bdht2.bkhd(stringArray);
    }

    private static bdht_2 rzw_2(bdht_2 bdht2, String string) {
        block0: {
            int n = -624637712;
            n = Integer.rotateLeft(n * -772611367, 7) ^ 0x5D42D9D0;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xB54A2CC;
            if ((n2 ^ n) == 190096076) break block0;
            int cfr_ignored_0 = (0xD1906A3C ^ n) + -1460981836;
        }
        return bdht2.brsh(string);
    }

    private static String khhj(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1048745250;
            n4 = Integer.rotateLeft(n4 * 791802515, 26) ^ 0xA34BECD0;
            n4 = n ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x63504C88;
            if ((n5 ^ n4) == 1666206856) break block0;
            int cfr_ignored_0 = (0x5DD2D9AA ^ n4) - -1528372563;
        }
        return ht_2.kz(string, n, n2, n3);
    }

    private static bdht_2 shzw(bdht_2 bdht2, String string, Consumer consumer) {
        block0: {
            int n = -2002918929;
            n = Integer.rotateLeft(n * 1467095145, 17) ^ 0xBEC91F28;
            bdht_2 bdht3 = bdht2;
            n = (bdht3 != null ? System.identityHashCode(bdht3) : 0) ^ n;
            Consumer consumer2 = consumer;
            n = (consumer2 != null ? System.identityHashCode(consumer2) : 0) ^ n;
            int n2 = n ^ 0x54614009;
            if ((n2 ^ n) == 1415659529) break block0;
            int cfr_ignored_0 = (0xDCFCA1E6 ^ n) + 1252259255;
        }
        return bdht2.dqdh_2(string, consumer);
    }

    private static int stb_2(int n) {
        block0: {
            int n2 = 1346876033;
            n2 = Integer.rotateLeft(n2 * -913684085, 9) ^ 0x23B4D96E;
            int n3 = (n2 = n ^ n2) ^ 0x60F727C2;
            if ((n3 ^ n2) == 1626810306) break block0;
            int cfr_ignored_0 = (0x30B09543 ^ n2) - 1715239570;
        }
        return Integer.reverse(n);
    }

    private static bdht_2 ttt_3(bdht_2 bdht2, String string, Consumer consumer) {
        block0: {
            int n = -1401517867;
            n = Integer.rotateLeft(n * 1824206323, 15) ^ 0xD4E8670D;
            bdht_2 bdht3 = bdht2;
            n = (bdht3 != null ? System.identityHashCode(bdht3) : 0) ^ n;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 14);
            int n2 = n ^ 0xB755F923;
            if ((n2 ^ n) == -1219102429) break block0;
            int cfr_ignored_0 = (0x1B2371F6 ^ n) + 1689027577;
        }
        return bdht2.dqdh_2(string, consumer);
    }

    private static bdht_2 tghk(bdht_2 bdht2, ghkh ghkh2) {
        block0: {
            int n = -26163886;
            n = Integer.rotateLeft(n * 1063803983, 28) ^ 0x50C9DA6B;
            ghkh ghkh3 = ghkh2;
            n = Integer.rotateRight((ghkh3 != null ? System.identityHashCode(ghkh3) : 0) ^ n, 23);
            int n2 = n ^ 0x1EE1FA05;
            if ((n2 ^ n) == 518126085) break block0;
            int cfr_ignored_0 = (0xE0913F57 ^ n) - -1400169498;
        }
        return bdht2.jmz(ghkh2);
    }

    private static String absh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -2036144032;
            n4 = Integer.rotateLeft(n4 * -131507585, 6) ^ 0xBB2777C;
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 4)) ^ 0x185040CF;
            if ((n5 ^ n4) == 407912655) break block0;
            int cfr_ignored_0 = (0x9EF2A8AF ^ n4) - -819660642;
        }
        return ht_2.kz(string, n, n2, n3);
    }

    private static List djt_3(bths_2 bths2) {
        block0: {
            int n = 38326252;
            int n2 = (n = Integer.rotateLeft(n * 1923286133, 26) ^ 0x3A5FC832) ^ 0x4C08C11;
            if ((n2 ^ n) == 79727633) break block0;
            int cfr_ignored_0 = (0x68843FD ^ n) + 686673207;
        }
        return bths2.arguments();
    }

    private static List thfs_2(bths_2 bths2) {
        block0: {
            int n = 1106962301;
            n = Integer.rotateLeft(n * -661794961, 10) ^ 0x306F2C39;
            bths_2 bths3 = bths2;
            n = (bths3 != null ? System.identityHashCode(bths3) : 0) ^ n;
            int n2 = n ^ 0x39B9B4A1;
            if ((n2 ^ n) == 968471713) break block0;
            int cfr_ignored_0 = (0x784353DC ^ n) - 1237762451;
        }
        return bths2.arguments();
    }

    private static List tmgh(bths_2 bths2) {
        block0: {
            int n = -814369157;
            n = Integer.rotateLeft(n * -1224138401, 28) ^ 0x8E97996B;
            bths_2 bths3 = bths2;
            n = (bths3 != null ? System.identityHashCode(bths3) : 0) ^ n;
            int n2 = n ^ 0x24437889;
            if ((n2 ^ n) == 608401545) break block0;
            int cfr_ignored_0 = (0xEB36CEF2 ^ n) + -1797016171;
        }
        return bths2.arguments();
    }

    private static String zghz(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 531729455;
            n4 = Integer.rotateLeft(n4 * 718527629, 8) ^ 0xF21F2A83;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 24);
            int n5 = n4 ^ 0xD8F3677;
            if ((n5 ^ n4) == 227489399) break block0;
            int cfr_ignored_0 = (0x123EBA58 ^ n4) + -1398622230;
        }
        return ht_2.kz(string, n, n2, n3);
    }

    private static int bta(int n) {
        block0: {
            int n2 = bhh_4.hry(1588792467);
            int n3 = n2 ^ 0xAFDF970C;
            if ((n3 ^ n2) == -1344301300) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xF16C9B9F ^ n2, 17) - 1082423164) * -244540513;
        }
        return Integer.reverse(n);
    }

    private static String dkdh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bhh_4.hry(-438079246);
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 28)) ^ 0xE03B0394;
            if ((n5 ^ n4) == -533003372) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x5D87366 ^ n4, 3) - -1181509483;
        }
        return ht_2.kz(string, n, n2, n3);
    }

    private static void taz_3(zz_4 zz2_2, String string, int n, int n2, int n3) {
        int n4 = bhh_4.hry(-481267555);
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = n4 ^ 0xA47D5AB3;
        if ((n5 ^ n4) != -1535288653) {
            int cfr_ignored_0 = Integer.rotateRight(0x472D2A2E ^ n4, 11) - -1563051315;
        }
        zz2_2.tsha_2(string, n, n2, n3);
    }

    private static class_2561 twj_2(String string) {
        block0: {
            int n = -970619982;
            int n2 = (n = Integer.rotateLeft(n * -1319428635, 16) ^ 0x37F57B3D) ^ 0x7FA07EA5;
            if ((n2 ^ n) == 2141224613) break block0;
            int cfr_ignored_0 = (0xB985FD17 ^ n) + 1414576860;
        }
        return class_2561.method_30163((String)string);
    }

    private static void dhma_2(class_2561 class_25612) {
        int n = -828799457;
        n = Integer.rotateLeft(n * 937975237, 16) ^ 0x92118928;
        class_2561 class_25613 = class_25612;
        n = (class_25613 != null ? System.identityHashCode(class_25613) : 0) ^ n;
        int n2 = n ^ 0xDAD8B322;
        if ((n2 ^ n) != -623332574) {
            int cfr_ignored_0 = (0x1441353D ^ n) - 1770035648;
        }
        bzh_4.dhght_2(class_25612);
    }

    private static String[] zzk(String string) {
        block0: {
            int n = bhh_4.hry(-1418958063);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x1B0A7AE4;
            if ((n2 ^ n) == 453671652) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xB06611F5 ^ n, 9) - 1622789094) * -1335488011;
            int cfr_ignored_1 = (int)(0x72D4BFC827D4EB4FL ^ (long)n ^ 0x82E0831A2DB94878L);
        }
        return string.split("\u0001\u0016", -1);
    }

    private static CallSite algh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -893667475;
            n3 = Integer.rotateLeft(n3 * -1232471237, 15) ^ 0x3086B91C;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string2;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 17);
            int n4 = n3 ^ 0xFF0D5569;
            if ((n4 ^ n3) != -15903383) {
                int cfr_ignored_0 = (0x35B6E204 ^ n3) - 64427220;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ shj_3 ^ string.hashCode()) + (n2 + zzl) + i ^ shj_3, 8) + zzl);
            }
            String[] stringArray = ht_2.zzk(new String(cArray));
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

    private static String[] z0kklf9h(String string) {
        return string.split("\u0007\u001b", -1);
    }

    private static CallSite uq1e9759bkd3w(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ x6u0yjgm ^ string.hashCode() ^ n2 + t8zj19qsp ^ i * 1733546915 ^ x6u0yjgm, 24) ^ t8zj19qsp));
            }
            String[] stringArray = ht_2.z0kklf9h(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

