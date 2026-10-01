/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.btgh;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.dhn_3;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Jump Effect", category=bzw.OTHER, desc="Wave highlight on blocks when you jump")
public class yy
extends bnq {
    private final tay khhn = new tay(this, "Radius").shth_7(2.0f).dhbs_2(Float.intBitsToFloat(0xAB428417 ^ 0xEA428417)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xA87F9E58 ^ 0xA87F9C5C, 21)));
    private final tay byh_2 = new tay(this, "Speed").shth_7(Float.intBitsToFloat(0xA210135D ^ 0xE186135D)).dhbs_2(Float.intBitsToFloat(Integer.reverse(813706603) ^ 0x924E010C)).rkh_3(Float.intBitsToFloat(Integer.reverse(-1712947651) ^ 0xFE366799)).ssd_5(Float.intBitsToFloat(Integer.reverse(93734606) ^ 0x372A69A0));
    private final badh_2 shls = new badh_2(this, "Theme Color").bts(true);
    private final bzw_2 bghm = new bzw_2(this, "Color 1", this::zshb).dhshy(new byq(Float.intBitsToFloat(0xCB774BC4 ^ 0x89BF4BC4), Float.intBitsToFloat(Integer.reverse(64940085) ^ 0xEF5F7BC0), Float.intBitsToFloat(Integer.reverse(-276407397) ^ 0x9AA561F7), Float.intBitsToFloat(0xBAB25AB5 ^ 0xF9CD5AB5)));
    private final bzw_2 dyq = new bzw_2(this, "Color 2", this::ghrw).dhshy(new byq(Float.intBitsToFloat(Integer.rotateLeft(0xDE5FCDE7 ^ 0x3E5FC588, 19)), Float.intBitsToFloat(Integer.reverse(304015669) ^ 0xEE5F7848), Float.intBitsToFloat(Integer.reverse(-446236393) ^ 0xABD766A7), Float.intBitsToFloat(Integer.rotateLeft(0x43DEBE85 ^ 0x53017E85, 2))));
    private final List rk = new ArrayList();
    private boolean khshf = true;
    private final bql<btt> dhtm = this::thwk;
    private final bql<shw_3> rdhr = this::tndh_2;
    private static final int bfq = 201255710;
    private static final int shlth = -510084701;
    private static final int thkhdh = -1435552148;
    private static final int shath = -129924666;
    private static final int fjdn7kkf = 693330385;
    private static final int addt4c26ay4w = -1932443956;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int jsw3b6lejhl4s;

    private int hyk(int n) {
        try {
            int n2 = -811072701;
            n2 = Integer.rotateLeft(n2 * -1029786083, 23) ^ 0x66FAEF64;
            int n3 = n2 ^ 0x6205B942;
            if ((n3 ^ n2) != 1644542274) {
                int cfr_ignored_0 = (0xADADBA01 ^ n2) + 421515078;
            }
            if ((0xC5 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (yy.sfs_4(this.shls)) {
            byq byq2 = bhj_2.ths();
            return yy.khss_4(byq2);
        }
        float f = (float)((Math.sin((double)n * Double.longBitsToDouble(0xE4EF16B674EF222EL ^ 0xDB7B6C5733413655L) + (double)System.currentTimeMillis() * Double.longBitsToDouble(0x4C7208A279099B80L ^ 0x73126AEFABF8327CL)) + 1.0) / Double.longBitsToDouble(0xBC5EDA973DBA6614L ^ 0xFC5EDA973DBA6614L));
        byq byq3 = yy.bdt(this.bghm);
        byq byq4 = this.dyq.sdsh_4();
        float f2 = class_3532.method_16439((float)f, (float)byq3.sbk(), (float)yy.hwm(byq4));
        float f3 = yy.bsd_3(f, byq3.srl(), yy.dnq_2(byq4));
        float f4 = class_3532.method_16439((float)f, (float)byq3.shsl_2(), (float)byq4.shsl_2());
        float f5 = class_3532.method_16439((float)f, (float)yy.ssk_4(byq3), (float)byq4.tzdh_2());
        return new byq(f2, f3, f4, f5).rk();
    }

    @Override
    public void nc() {
        try {
            int n = 1016204869;
            n = Integer.rotateLeft(n * 1862011285, 14) ^ 0xAAF2ADCF;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 25);
            int n2 = n ^ 0xF62E1E85;
            if ((n2 ^ n) != -164749691) {
                int cfr_ignored_0 = (0xCABC10C0 ^ n) - 1989600982;
            }
            if ((0x3B8 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        this.rk.clear();
        this.khshf = true;
    }

    private void tndh_2(shw_3 shw2) {
        int n = 86301742;
        int n2 = (n = Integer.rotateLeft(n * 355420369, 5) ^ 0xB3B7F7AC) ^ 0xFFFB4E52;
        if ((n2 ^ n) != -307630) {
            int cfr_ignored_0 = (0xFADF927C ^ n) - 365241840;
        }
        if (this.rk.isEmpty()) {
            return;
        }
        for (dhn_3 dhn2 : this.rk) {
            dhn2.stkh_4(shw2);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void thwk(btt var1_1) {
        var2_2 = false;
        var6_3 = 0;
        var4_4 = 938184092;
        var4_4 = Integer.rotateLeft(var4_4 * 590822093, 18) ^ 851878628;
        var4_4 = System.identityHashCode(this) ^ var4_4;
        v0 = var1_1;
        var4_4 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var4_4;
        var5_5 = 1713021009 + var4_4;
        while (true) {
            block80: {
                block74: {
                    block79: {
                        block83: {
                            block68: {
                                block81: {
                                    block78: {
                                        block70: {
                                            block77: {
                                                block73: {
                                                    block66: {
                                                        block72: {
                                                            block69: {
                                                                block67: {
                                                                    block64: {
                                                                        block75: {
                                                                            block65: {
                                                                                block71: {
                                                                                    block76: {
                                                                                        block82: {
                                                                                            var6_3 = var5_5 - var4_4;
                                                                                            switch (var6_3 & 15) {
                                                                                                case 0: {
                                                                                                    if (var6_3 == -2143692480) break block64;
                                                                                                    if (var6_3 != 1595786816) {
                                                                                                        Integer.rotateRight(-1864484409 ^ var4_4, 5) - -1891197356;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block65;
                                                                                                }
                                                                                                case 1: {
                                                                                                    if (var6_3 == -2063955183) break block66;
                                                                                                    if (var6_3 == 1439562945) break block67;
                                                                                                    if (var6_3 == 1713021009) break;
                                                                                                    if (var6_3 != -10880911) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block68;
                                                                                                }
                                                                                                case 3: {
                                                                                                    if (var6_3 != 2138270867) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block69;
                                                                                                }
                                                                                                case 4: {
                                                                                                    if (var6_3 != -1604051628) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block70;
                                                                                                }
                                                                                                case 5: {
                                                                                                    if (var6_3 == 1492489125) break block71;
                                                                                                    if (var6_3 != -270471643) {
                                                                                                        Integer.rotateLeft(961051173 ^ var4_4, 10) - -198940234;
                                                                                                        (int)(-289686025799406769L ^ (long)var4_4 ^ 6143054040192801316L);
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block72;
                                                                                                }
                                                                                                case 6: {
                                                                                                    if (var6_3 == 1763545622) break block73;
                                                                                                    if (var6_3 != 94092070) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block74;
                                                                                                }
                                                                                                case 7: {
                                                                                                    if (var6_3 != -493003113) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block75;
                                                                                                }
                                                                                                case 9: {
                                                                                                    if (var6_3 != 2132571529) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block76;
                                                                                                }
                                                                                                case 12: {
                                                                                                    if (var6_3 == -1000576468) break block77;
                                                                                                    if (var6_3 == 93729020) break block78;
                                                                                                    (Integer.rotateLeft(469059572 ^ var4_4, 6) - 1729189319) * 469059573;
                                                                                                    if (var6_3 != -987639972) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block79;
                                                                                                }
                                                                                                case 13: {
                                                                                                    if (var6_3 == -23535843) break block80;
                                                                                                    if (var6_3 == -2098592851) break block81;
                                                                                                    Integer.rotateRight(-1632592093 ^ var4_4, 6) + 1002497144;
                                                                                                    if (var6_3 != -1798050499) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block82;
                                                                                                }
                                                                                                case 15: {
                                                                                                    if (var6_3 != -517052065) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block83;
                                                                                                }
                                                                                            }
                                                                                            Integer.rotateRight(-1976183326 ^ var4_4, 4) + -1058896487;
                                                                                            if (yf.dnkh()) {
                                                                                                (int)(6855409120877755343L ^ (long)var4_4 ^ 7060786027777561495L);
                                                                                                var5_5 = 2132571529 + var4_4 + 1306543760 - 1306543760;
                                                                                                continue;
                                                                                            }
                                                                                            try {
                                                                                                var6_3 += 2;
                                                                                                if ((3705566101595820159L ^ (long)var4_4 | 1L) == 0L) {
                                                                                                    throw new NoSuchElementException();
                                                                                                }
                                                                                                var5_5 = -493003113 + var4_4;
                                                                                            }
                                                                                            catch (NoSuchElementException v1) {
                                                                                                var5_5 = (int)((long)(-493003113 + var4_4) ^ 5590111861695285840L ^ 5590111861695285840L);
                                                                                            }
                                                                                            var6_3 += 4;
                                                                                            continue;
                                                                                        }
                                                                                        (Integer.rotateRight(1045934131 ^ var4_4, 10) + -1862535832) * 1045934131;
                                                                                        this.khshf = var2_2;
                                                                                        this.rk.removeIf((Predicate<dhn_3>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, sshz_4(), (Lus/m0vy/moondlc/m0vyguard/dhn_3;)Z)());
                                                                                        return;
                                                                                    }
                                                                                    (Integer.rotateLeft(-526370152 ^ var4_4, 15) + 935638947) * -526370151;
                                                                                    throw null;
                                                                                }
                                                                                (Integer.rotateLeft(944222297 ^ var4_4, 10) + -720635390) * 944222297;
                                                                                (int)(-363350779419628721L ^ (long)var4_4 ^ -4487692880215254981L);
                                                                                return;
                                                                            }
                                                                            Integer.rotateRight(641707023 ^ var4_4, 7) - -1508674292;
                                                                            return;
                                                                        }
                                                                        (Integer.rotateLeft(-1058649379 ^ var4_4, 11) - 1614852094) * -1058649379;
                                                                        (int)(168010737511623503L ^ (long)var4_4 ^ 3796678634332858744L);
                                                                        if (yy.mc.field_1724 == null) {
                                                                            try {
                                                                                var5_5 = Integer.reverse(Integer.reverse(1595786816 + var4_4));
                                                                            }
                                                                            catch (UnsupportedOperationException v2) {
                                                                                var5_5 = 1595786816 + var4_4;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            var5_5 = (int)((long)(1439562945 + var4_4) ^ 5433351408255069681L ^ 5433351408255069681L);
                                                                        }
                                                                        catch (IllegalStateException v3) {
                                                                            var5_5 = Integer.reverse(Integer.reverse(1439562945 + var4_4));
                                                                        }
                                                                        --var6_3;
                                                                        continue;
                                                                    }
                                                                    Integer.rotateRight(-1142417245 ^ var4_4, 10) + -981951752;
                                                                    if (var2_2) {
                                                                        try {
                                                                            var6_3 -= 3;
                                                                            if ((5609744208858229355L ^ (long)var4_4 | 1L) == 0L) {
                                                                                throw new IllegalArgumentException();
                                                                            }
                                                                            var5_5 = -1798050499 + var4_4 + -603723178 - -603723178;
                                                                        }
                                                                        catch (IllegalArgumentException v4) {
                                                                            var5_5 = (int)((long)(-1798050499 + var4_4) ^ -2490876702363096831L ^ -2490876702363096831L);
                                                                        }
                                                                        var6_3 += 3;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        ++var6_3;
                                                                        if ((2236297627762618725L ^ (long)var4_4 | 1L) == 0L) {
                                                                            throw new UnsupportedOperationException();
                                                                        }
                                                                        var5_5 = 2138270867 + var4_4 + -640655361 - -640655361;
                                                                    }
                                                                    catch (UnsupportedOperationException v5) {
                                                                        var5_5 = 2138270867 + var4_4;
                                                                    }
                                                                    ++var6_3;
                                                                    continue;
                                                                }
                                                                (Integer.rotateLeft(-1382150788 ^ var4_4, 8) - 176243007) * -1382150787;
                                                                var2_2 = yy.mc.field_1724.method_24828();
                                                                if (!this.khshf) {
                                                                    try {
                                                                        if ((-8997123132544490457L ^ (long)var4_4 | 1L) == 0L) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                        var5_5 = -1798050499 + var4_4 ^ -669267544 ^ -669267544;
                                                                    }
                                                                    catch (IllegalStateException v6) {
                                                                        var5_5 = -1798050499 + var4_4 ^ -1633433091 ^ -1633433091;
                                                                    }
                                                                    var6_3 += 3;
                                                                    continue;
                                                                }
                                                                if (btgh.shfs(var4_4, 131057556)) {
                                                                    (Integer.rotateLeft(-2013913388 ^ var4_4, 3) - 2066438887) * -2013913387;
                                                                }
                                                                var5_5 = -2143692480 + var4_4 + -1255259973 - -1255259973;
                                                                var6_3 += 5;
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(1526690273 ^ var4_4, 14) + 156002682;
                                                            (int)(-7472070070083720369L ^ (long)var4_4 ^ 4812240350304836938L);
                                                            var3_6 = yy.mc.field_1724.method_24515().method_10074();
                                                            this.rk.add(new dhn_3(this, var3_6, System.currentTimeMillis()));
                                                            if (!btgh.shfs(var4_4, -1968336068)) {
                                                                Integer.rotateLeft(511606273 ^ var4_4, 6) + -1246830246;
                                                                (int)(-2536423533331551409L ^ (long)var4_4 ^ 6703752193800410184L);
                                                            }
                                                            var5_5 = Integer.reverse(Integer.reverse(-1798050499 + var4_4));
                                                            var6_3 -= 4;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(-683221719 ^ var4_4, 13) + 368207666;
                                                        (int)(1582015899518692175L ^ (long)var4_4 ^ 1970468985434113593L);
                                                        try {
                                                            if ((-364732207150730739L ^ (long)var4_4 | 1L) == 0L) {
                                                                throw new NoSuchElementException();
                                                            }
                                                            var5_5 = Integer.reverse(Integer.reverse(1713021009 + var4_4));
                                                        }
                                                        catch (NoSuchElementException v7) {
                                                            var5_5 = 1713021009 + var4_4 ^ -1603021940 ^ -1603021940;
                                                        }
                                                        continue;
                                                    }
                                                    (Integer.rotateRight(-41903205 ^ var4_4, 18) + -1225754880) * -41903205;
                                                    var5_5 = (int)((long)(1444336263 + var4_4) ^ 398838360954410143L ^ 398838360954410143L);
                                                    (Integer.rotateLeft(925187352 ^ var4_4, 9) + -1310718685) * 925187353;
                                                    try {
                                                        var6_3 -= 3;
                                                        var5_5 = 1713021009 + var4_4 ^ -544334593 ^ -544334593;
                                                    }
                                                    catch (IllegalArgumentException v8) {
                                                        var5_5 = 1713021009 + var4_4 + 1942314672 - 1942314672;
                                                    }
                                                    continue;
                                                }
                                                Integer.rotateLeft(-2001050996 ^ var4_4, 4) - -1829794257;
                                                var5_5 = (int)((long)(843291506 + var4_4) ^ 3503769390953624447L ^ 3503769390953624447L);
                                                Integer.rotateRight(2098860387 ^ var4_4, 18) + 713407032;
                                                var5_5 = (int)((long)(1946141674 + var4_4) ^ -4368635882428786877L ^ -4368635882428786877L);
                                                Integer.rotateRight(1267958570 ^ var4_4, 12) + 725254481;
                                                var5_5 = (int)((long)(1713021009 + var4_4) ^ -3843576201472617988L ^ -3843576201472617988L);
                                                var6_3 += 4;
                                                continue;
                                            }
                                            (Integer.rotateRight(1300688894 ^ var4_4, 12) - 1739894525) * 1300688895;
                                            (int)(1098036133291462517L ^ (long)var4_4 ^ -475241425981819989L);
                                            var5_5 = (int)((long)(1713021009 + var4_4) ^ 1779736313414584639L ^ 1779736313414584639L);
                                            var6_3 += 5;
                                            continue;
                                        }
                                        Integer.rotateRight(755508966 ^ var4_4, 8) - 2019185941;
                                        var5_5 = -183058924 + var4_4 + -790108587 - -790108587;
                                        Integer.rotateRight(-807012561 ^ var4_4, 12) - 825658860;
                                        if (!btgh.shfs(var4_4, -1848971045)) {
                                            Integer.rotateRight(-137342838 ^ var4_4, 17) + 110583793;
                                        }
                                        var5_5 = 1713021009 + var4_4 ^ 1637165348 ^ 1637165348;
                                        var6_3 += 2;
                                        continue;
                                    }
                                    (Integer.rotateLeft(1165037108 ^ var4_4, 11) - 1829656455) * 1165037109;
                                    var5_5 = (int)((long)(-652165509 + var4_4) ^ -8923255418055978253L ^ -8923255418055978253L);
                                    (Integer.rotateLeft(1679104761 ^ var4_4, 15) + 585884514) * 1679104761;
                                    (int)(-6437978387727979697L ^ (long)var4_4 ^ -7712270213412495202L);
                                    try {
                                        var6_3 -= 4;
                                        if ((-3625749389683637553L ^ (long)var4_4 | 1L) == 0L) {
                                            throw new IllegalArgumentException();
                                        }
                                        var5_5 = 1713021009 + var4_4;
                                    }
                                    catch (IllegalArgumentException v9) {
                                        var5_5 = 1713021009 + var4_4 ^ 560349672 ^ 560349672;
                                    }
                                    var6_3 -= 4;
                                    continue;
                                }
                                Integer.rotateRight(-482040477 ^ var4_4, 15) + -1985108424;
                                var5_5 = -201495114 + var4_4 ^ -374777191 ^ -374777191;
                                Integer.rotateLeft(49751905 ^ var4_4, 3) + 1615553530;
                                (int)(-4592113216136090801L ^ (long)var4_4 ^ -1168539954843210406L);
                                if (btgh.shfs(var4_4, -1576922854)) {
                                    Integer.rotateRight(-1005014709 ^ var4_4, 11) + -1017440432;
                                }
                                var5_5 = 1713021009 + var4_4 + 279369103 - 279369103;
                                var6_3 += 4;
                                continue;
                            }
                            Integer.rotateLeft(1648897093 ^ var4_4, 15) - -350553194;
                            (int)(-6847016830887466161L ^ (long)var4_4 ^ -468230212787049436L);
                            if (!btgh.shfs(var4_4, -49571899)) {
                                (Integer.rotateLeft(-1693370476 ^ var4_4, 6) - -881632729) * -1693370475;
                            }
                            var5_5 = Integer.reverse(Integer.reverse(1713021009 + var4_4));
                            var6_3 += 4;
                            continue;
                        }
                        (Integer.rotateLeft(-2067669251 ^ var4_4, 3) - 400007134) * -2067669251;
                        (int)(5076525175580977999L ^ (long)var4_4 ^ 2085310775932035383L);
                        var5_5 = -1946465446 + var4_4;
                        Integer.rotateRight(1078549799 ^ var4_4, 11) - -851450124;
                        try {
                            ++var6_3;
                            if ((8810567126256257791L ^ (long)var4_4 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var5_5 = 1713021009 + var4_4;
                        }
                        catch (ArithmeticException v10) {
                            var5_5 = 1713021009 + var4_4 + -1642784851 - -1642784851;
                        }
                        continue;
                    }
                    Integer.rotateRight(-781272442 ^ var4_4, 13) - 1623602549;
                    var5_5 = Integer.reverse(Integer.reverse(-1699666371 + var4_4));
                    (Integer.rotateRight(-261352134 ^ var4_4, 17) + 561262913) * -261352133;
                    if (!btgh.shfs(var4_4, -1693625041)) {
                        (Integer.rotateRight(-48761474 ^ var4_4, 18) - -1438361219) * -48761473;
                    }
                    var5_5 = 1713021009 + var4_4;
                    var6_3 -= 4;
                    continue;
                }
                (Integer.rotateLeft(-780243819 ^ var4_4, 13) - 1655489862) * -780243819;
                (int)(1426729209448164175L ^ (long)var4_4 ^ 8656062632265615944L);
                var5_5 = -1557151979 + var4_4;
                (Integer.rotateLeft(-675976076 ^ var4_4, 13) - 592822599) * -675976075;
                try {
                    var5_5 = 1713021009 + var4_4 ^ -1400862244 ^ -1400862244;
                }
                catch (NoSuchElementException v11) {
                    var5_5 = 1713021009 + var4_4 ^ 264728084 ^ 264728084;
                }
                continue;
            }
            (Integer.rotateRight(-489064269 ^ var4_4, 15) + 2092121320) * -489064269;
            var5_5 = 306289228 + var4_4 ^ -1885143319 ^ -1885143319;
            Integer.rotateLeft(-800392159 ^ var4_4, 13) + 1030891322;
            (int)(1366932767787772751L ^ (long)var4_4 ^ 6433536216158275617L);
            var5_5 = (int)((long)(-586372198 + var4_4) ^ 2580640507604014236L ^ 2580640507604014236L);
            Integer.rotateRight(936221098 ^ var4_4, 9) + -968672559;
            var5_5 = (int)((long)(1713021009 + var4_4) ^ 4382199223143610557L ^ 4382199223143610557L);
            var6_3 += 5;
            continue;
lbl351:
            // 12 sources

            Integer.rotateLeft(-2097782780 ^ var4_4, 3) - -533512265;
            var5_5 = (int)((long)(1713021009 + var4_4) ^ 8497883342538883946L ^ 8497883342538883946L);
        }
    }

    private boolean ghrw() {
        block0: {
            int n = 2090381816;
            n = Integer.rotateLeft(n * 308721821, 25) ^ 0x7B89615E;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 13);
            int n2 = n ^ 0x957DD812;
            if ((n2 ^ n) == -1786914798) break block0;
            int cfr_ignored_0 = (0xE9E569EA ^ n) - -1465640641;
        }
        return this.shls.shzl();
    }

    private boolean zshb() {
        block0: {
            int n = 1233539692;
            n = Integer.rotateLeft(n * 238286813, 17) ^ 0x77A6049B;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 26);
            int n2 = n ^ 0xB77D4B88;
            if ((n2 ^ n) == -1216525432) break block0;
            int cfr_ignored_0 = (0xFEFB19E4 ^ n) - 1062256466;
        }
        return this.shls.shzl();
    }

    private static String ghsj(String string, int n, int n2, int n3) {
        try {
            int n4 = -1139689317;
            n4 = Integer.rotateLeft(n4 * -572899701, 18) ^ 0x766CDD28;
            n4 = Integer.rotateLeft(n2 ^ n4, 5);
            int n5 = n4 ^ 0x50A2F46C;
            if ((n5 ^ n4) != 1352856684) {
                int cfr_ignored_0 = (0xECB34CF7 ^ n4) - 370545387;
            }
            if ((0x32C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x9CD3AB3F ^ n2 - i) + shlth, 6) ^ bfq + i * -437079533));
        }
        return new String(cArray);
    }

    private static boolean sfs_4(badh_2 badh2) {
        block0: {
            int n = 128324288;
            n = Integer.rotateLeft(n * -1553052967, 14) ^ 0x21266CA7;
            badh_2 badh3 = badh2;
            n = (badh3 != null ? System.identityHashCode(badh3) : 0) ^ n;
            int n2 = n ^ 0xB4B72B1F;
            if ((n2 ^ n) == -1263064289) break block0;
            int cfr_ignored_0 = (0xB31139DF ^ n) + -687404890;
        }
        return badh2.shzl();
    }

    private static int khss_4(byq byq2) {
        block0: {
            int n = -1538881232;
            int n2 = (n = Integer.rotateLeft(n * 1192579813, 6) ^ 0x5C06E9E) ^ 0x710F4C9F;
            if ((n2 ^ n) == 1896828063) break block0;
            int cfr_ignored_0 = (0xD549C5AF ^ n) + 1574078805;
        }
        return byq2.rk();
    }

    private static byq bdt(bzw_2 bzw2_2) {
        block0: {
            int n = 1780831822;
            n = Integer.rotateLeft(n * 1367236521, 5) ^ 0xED11E324;
            bzw_2 bzw3_2 = bzw2_2;
            n = (bzw3_2 != null ? System.identityHashCode(bzw3_2) : 0) ^ n;
            int n2 = n ^ 0xA4F6B98D;
            if ((n2 ^ n) == -1527334515) break block0;
            int cfr_ignored_0 = (0xCED3EFC3 ^ n) - 1611131072;
        }
        return bzw2_2.sdsh_4();
    }

    private static float hwm(byq byq2) {
        block0: {
            int n = -1648082649;
            n = Integer.rotateLeft(n * 1396795485, 4) ^ 0x427EEA97;
            byq byq3 = byq2;
            n = Integer.rotateRight((byq3 != null ? System.identityHashCode(byq3) : 0) ^ n, 2);
            int n2 = n ^ 0xA64C8AC9;
            if ((n2 ^ n) == -1504933175) break block0;
            int cfr_ignored_0 = (0x3B88CBEE ^ n) + -895033794;
        }
        return byq2.sbk();
    }

    private static float dnq_2(byq byq2) {
        block0: {
            int n = 1793980322;
            int n2 = (n = Integer.rotateLeft(n * -170828085, 11) ^ 0x5EB52F3D) ^ 0xCD807F2F;
            if ((n2 ^ n) == -847216849) break block0;
            int cfr_ignored_0 = (0xA76D888D ^ n) + -275845813;
        }
        return byq2.srl();
    }

    private static float bsd_3(float f, float f2, float f3) {
        block0: {
            int n = -526044587;
            n = Integer.rotateLeft(n * -1314154851, 16) ^ 0x3F99F76B;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 19);
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0x5D12B4CC;
            if ((n2 ^ n) == 1561507020) break block0;
            int cfr_ignored_0 = (0xBDB78699 ^ n) - 1136619851;
        }
        return class_3532.method_16439((float)f, (float)f2, (float)f3);
    }

    private static float ssk_4(byq byq2) {
        block0: {
            int n = -562309089;
            n = Integer.rotateLeft(n * 271647857, 7) ^ 0x98B43A7C;
            byq byq3 = byq2;
            n = (byq3 != null ? System.identityHashCode(byq3) : 0) ^ n;
            int n2 = n ^ 0xECF53488;
            if ((n2 ^ n) == -319474552) break block0;
            int cfr_ignored_0 = (0x328EEC97 ^ n) + 1732670480;
        }
        return byq2.tzdh_2();
    }

    private static String[] dhqt(String string) {
        int n = 1782051745;
        int n2 = (n = Integer.rotateLeft(n * 394978103, 3) ^ 0xA785D20D) ^ 0xC94BDA40;
        if ((n2 ^ n) != -917775808) {
            int cfr_ignored_0 = (0xA37C29E1 ^ n) - -291787074;
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

    private static CallSite jaj(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -245797752;
            n3 = Integer.rotateLeft(n3 * 914534333, 3) ^ 0x30A2A562;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 13);
            String string3 = string2;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 23);
            int n4 = n3 ^ 0x293A5B2C;
            if ((n4 ^ n3) != 691690284) {
                int cfr_ignored_0 = (0xD86337A4 ^ n3) + -1244932725;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ thkhdh ^ string.hashCode()) + (n2 + shath) + i ^ thkhdh, 19) + shath);
            }
            String[] stringArray = yy.dhqt(new String(cArray));
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

    private static String[] npy8bytetc9rns(String string) {
        return string.split("\u0007\u0017", -1);
    }

    private static CallSite wxn5i1kj2029u(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ fjdn7kkf ^ string.hashCode() ^ n2 + addt4c26ay4w ^ i * 1499483673 ^ fjdn7kkf, 8) ^ addt4c26ay4w));
            }
            String[] stringArray = yy.npy8bytetc9rns(new String(cArray));
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

