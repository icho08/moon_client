/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1297
 *  net.minecraft.class_1922
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_265
 *  net.minecraft.class_284
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_3532
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_5944
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_284;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_5944;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fth;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.lf;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="BlockHighlight", category=bzw.OTHER, desc="Highlights the block you are looking at with custom styles")
public class bak
extends bnq {
    public static final fth jjr;
    private static final class_10156 shjs_2;
    private final khd hdm = new khd(this, "Style");
    private final fy tmz_2 = new fy(this.hdm, "Classic");
    private final fy rad = new fy(this.hdm, "Smoke");
    private final khd shbw = new khd(this, "Color Mode");
    private final fy khghs_2 = new fy(this.shbw, "Theme");
    private final fy thghs = new fy(this.shbw, "Custom");
    private final bzw_2 sz_4 = new bzw_2(this, "Cust".concat("om Color"), this::zjb).dhshy(new byq(Float.intBitsToFloat(Integer.rotateLeft(0xCF7C806C ^ 0xC280806D, 30)), Float.intBitsToFloat(Integer.reverse(2142477467) ^ 0x9A46CDFE), Float.intBitsToFloat(Integer.reverse(-1674069675) ^ 0xE9E2EC39), Float.intBitsToFloat(-1808648616 - 1353922136)));
    private final badh_2 thfl = new badh_2(this, "Filled").bts(true);
    private final badh_2 bt = new badh_2(this, "Entit".concat("y Hitbox")).bts(false);
    private final tay khdhz = new tay(this, "Outlin".concat("e Alpha")).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x2DC15495 ^ 0x25F55495, 3))).dhbs_2(Float.intBitsToFloat(0x1EBF7D4C ^ 0x5DC07D4C)).rkh_3(Float.intBitsToFloat(-217762922 - -1301990506)).ssd_5(Float.intBitsToFloat(0x1E79CD7F ^ 0x5D4DCD7F));
    private final tay shdha_2 = new tay((hy)this, "Fill Alpha", this::dhmj).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(190508955) ^ 0x9AC35AD0)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x10FCDEE3 ^ 0xD4DEE3, 2))).ssd_5(Float.intBitsToFloat(0xC1EABFC4 ^ 0x83E6BFC4));
    private final tay jhd_3 = new tay(this, "Anim Speed").shth_7(Float.intBitsToFloat(Integer.reverse(1838102448) ^ 0x30A03D7B)).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(-1640787637) ^ 0xEFC500B4)).ssd_5(Float.intBitsToFloat(-1536964631 - 1707748943));
    private final tay shdm = new tay(this, "Line Width").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(0x2B055858 ^ 0x6BA55858)).rkh_3(Float.intBitsToFloat(-871806901 - -1920382901)).ssd_5(Float.intBitsToFloat(Integer.reverse(-504257663) ^ 0xBE058F87));
    private final tay sdht_3 = new tay((hy)this, "Smoke Alpha", this::thad).shth_7(Float.intBitsToFloat(0x9077B6C6 ^ 0xD107B6C6)).dhbs_2(Float.intBitsToFloat(0xD4C94ABD ^ 0x97B64ABD)).rkh_3(Float.intBitsToFloat(-1875034568 - 1335705144)).ssd_5(Float.intBitsToFloat(120275621 - -1006878043));
    private final tay dhly = new tay((hy)this, "Smoke Speed", this::btm_2).shth_7(Float.intBitsToFloat(0x176CD8B ^ 0x3C3A0146)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(1095881235 + -67437894)).ssd_5(Float.intBitsToFloat(Integer.reverse(-987966847) ^ 0xBFAD5EC5));
    private final tay bkh = new tay((hy)this, "Smoke Scale", this::dzh_7).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x139BA4DF ^ 0xDF569A93, 16))).dhbs_2(Float.intBitsToFloat(-1358992748 - 1866427028)).rkh_3(Float.intBitsToFloat(0xAD325217 ^ 0x907E9EDA)).ssd_5(Float.intBitsToFloat(Integer.reverse(-870805841) ^ 0xCA7DD4FE));
    private class_238 shkh_6;
    private final bql<shw_3> rsl_2 = this::ak;
    private static final int rlth = -507316566;
    private static final int hdt_2 = -858009334;
    private static final int tsht_2 = -382031664;
    private static final int sths_3 = 2022994905;
    private static final int r39qdolb56l = -1850297475;
    private static final int xkdmwgnb = 1729333899;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int jesfrvboo9ev2d;

    @Override
    public void nt() {
        int n = -1877522988;
        n = Integer.rotateLeft(n * 373902723, 9) ^ 0xA6A8FE4E;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x2444478F;
        if ((n2 ^ n) != 608454543) {
            int cfr_ignored_0 = (0xB453025B ^ n) - 1383510771;
        }
        this.shkh_6 = null;
    }

    @Override
    public void nc() {
        int n = 920303100;
        n = Integer.rotateLeft(n * -1911301439, 10) ^ 0xE283DE76;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xEA9FE872;
        if ((n2 ^ n) != -358619022) {
            int cfr_ignored_0 = (0xDC455D8E ^ n) + 1268010813;
        }
        this.shkh_6 = null;
    }

    private byq tsr() {
        return this.khghs_2.shghkh() ? bhj_2.ths() : this.sz_4.sdsh_4();
    }

    /*
     * Unable to fully structure code
     */
    private class_238 ztw_3(class_238 var1_1) {
        var2_2 = 0.0;
        var4_3 = null;
        var7_4 = 0;
        var5_5 = 1297638250;
        var5_5 = Integer.rotateLeft(var5_5 * 58935275, 21) ^ 1484725047;
        var6_6 = 1477019302 + var5_5 ^ -1466462687 ^ -1466462687;
        block35: while (true) {
            if ((var7_4 = var6_6 - var5_5) == -580031703) ** GOTO lbl211
            if (var7_4 == -1320095211) ** GOTO lbl101
            (Integer.rotateRight(-1977633217 ^ var5_5, 4) - -1103843108) * -1977633217;
            if (var7_4 == -1322888893) ** GOTO lbl-1000
            if (var7_4 != -721920336) {
                switch (var7_4) {
                    case 1477019302: {
                        Integer.rotateRight(-524082134 ^ var5_5, 15) + 1006567505;
                        if (this.shkh_6 == null) {
                            try {
                                var7_4 += 4;
                                var6_6 = -34330673 + var5_5 + 618640910 - 618640910;
                            }
                            catch (IllegalStateException v0) {
                                var6_6 = -34330673 + var5_5 + 1796229356 - 1796229356;
                            }
                            --var7_4;
                            continue block35;
                        }
                        try {
                            var7_4 += 5;
                            if ((6652818591563499409L ^ (long)var5_5 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            var6_6 = (int)((long)(-333348977 + var5_5) ^ 2156933444947032422L ^ 2156933444947032422L);
                        }
                        catch (IllegalArgumentException v1) {
                            var6_6 = -333348977 + var5_5 + -1092030277 - -1092030277;
                        }
                        --var7_4;
                        continue block35;
                    }
                }
            }
            ** GOTO lbl96
lbl-1000:
            // 1 sources

            {
                Integer.rotateRight(1343042478 ^ var5_5, 13) - -1242111667;
                var4_3 = this.shkh_6;
                try {
                    var7_4 -= 5;
                    if ((6329251850586998203L ^ (long)var5_5 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    var6_6 = -1083039928 + var5_5;
                }
                catch (NoSuchElementException v2) {
                    var6_6 = Integer.reverse(Integer.reverse(-1083039928 + var5_5));
                }
                var7_4 -= 4;
                continue block35;
                case -333348977: {
                    Integer.rotateRight(-1562300277 ^ var5_5, 7) + -1113423856;
                    if (!(bak.dsz_7(this.shkh_6).method_1025(bak.jnr(var1_1)) > Double.longBitsToDouble(-3833953406168378838L ^ -8434661900504051158L))) {
                        try {
                            if ((8792437076526227125L ^ (long)var5_5 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            var6_6 = -904767353 + var5_5 ^ 683254175 ^ 683254175;
                        }
                        catch (IllegalArgumentException v3) {
                            var6_6 = Integer.reverse(Integer.reverse(-904767353 + var5_5));
                        }
                        var7_4 += 2;
                        continue block35;
                    }
                    var6_6 = -34330673 + var5_5 + 2094801594 - 2094801594;
                    (Integer.rotateRight(-477739534 ^ var5_5, 15) + -1851779191) * -477739533;
                    var7_4 -= 5;
                    continue block35;
                }
                case -904767353: {
                    Integer.rotateLeft(-1252941880 ^ var5_5, 9) + -113248141;
                    var2_2 = this.jhd_3.thw_5();
                    this.shkh_6 = new class_238(bak.hmm(var2_2, this.shkh_6.field_1323, var1_1.field_1323), class_3532.method_16436((double)var2_2, (double)this.shkh_6.field_1322, (double)var1_1.field_1322), bak.jyh(var2_2, this.shkh_6.field_1321, var1_1.field_1321), class_3532.method_16436((double)var2_2, (double)this.shkh_6.field_1320, (double)var1_1.field_1320), class_3532.method_16436((double)var2_2, (double)this.shkh_6.field_1325, (double)var1_1.field_1325), class_3532.method_16436((double)var2_2, (double)this.shkh_6.field_1324, (double)var1_1.field_1324));
                    try {
                        var7_4 += 2;
                        if ((-230205121467755519L ^ (long)var5_5 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var6_6 = -1322888893 + var5_5 ^ -452968576 ^ -452968576;
                    }
                    catch (IllegalStateException v4) {
                        var6_6 = Integer.reverse(Integer.reverse(-1322888893 + var5_5));
                    }
                    var7_4 += 4;
                    continue block35;
                }
                case -34330673: {
                    (Integer.rotateLeft(-2122866512 ^ var5_5, 3) + -1311107957) * -2122866511;
                    this.shkh_6 = var1_1;
                    (int)(4979293052453921796L ^ (long)var5_5 ^ -271204852201216027L);
                    var6_6 = (int)((long)(2007527806 + var5_5) ^ -5767664641242161207L ^ -5767664641242161207L);
                    (int)(402022969913053669L ^ (long)var5_5 ^ 8571896957061932793L);
                    var6_6 = -1322888893 + var5_5 ^ 1788735555 ^ 1788735555;
                    var7_4 -= 5;
                    continue block35;
                }
lbl96:
                // 1 sources

                (Integer.rotateRight(1381888575 ^ var5_5, 13) - -37882660) * 1381888575;
                var6_6 = Integer.reverse(Integer.reverse(1477019302 + var5_5));
                var7_4 += 2;
                continue block35;
lbl101:
                // 1 sources

                Integer.rotateRight(1915970530 ^ var5_5, 17) + -661211239;
                var6_6 = (int)((long)(1584214311 + var5_5) ^ 2546222783559618562L ^ 2546222783559618562L);
                (Integer.rotateRight(-1565195237 ^ var5_5, 7) + -1203167616) * -1565195237;
                var6_6 = 1477019302 + var5_5;
                var7_4 += 3;
                continue block35;
                case 1512888781: {
                    Integer.rotateLeft(-338245532 ^ var5_5, 16) - -1822432425;
                    try {
                        var6_6 = Integer.reverse(Integer.reverse(1477019302 + var5_5));
                    }
                    catch (UnsupportedOperationException v5) {
                        var6_6 = 1477019302 + var5_5 + -852103877 - -852103877;
                    }
                    continue block35;
                }
                case 2020077107: {
                    (Integer.rotateRight(-1574364705 ^ var5_5, 7) - -1487421124) * -1574364705;
                    var6_6 = 63616758 + var5_5;
                    (Integer.rotateRight(168514386 ^ var5_5, 4) + 1002223145) * 168514387;
                    var6_6 = 1477019302 + var5_5 + -848545791 - -848545791;
                    continue block35;
                }
                case -797739542: {
                    (Integer.rotateRight(1531678802 ^ var5_5, 14) + 310647081) * 1531678803;
                    try {
                        var7_4 += 4;
                        if ((-4000966496538537255L ^ (long)var5_5 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var6_6 = Integer.reverse(Integer.reverse(1477019302 + var5_5));
                    }
                    catch (UnsupportedOperationException v6) {
                        var6_6 = 1477019302 + var5_5 ^ 648519335 ^ 648519335;
                    }
                    var7_4 += 5;
                    continue block35;
                }
                case -1879249837: {
                    Integer.rotateRight(-370419806 ^ var5_5, 16) + 1475132377;
                    var6_6 = 92779182 + var5_5 ^ 332231936 ^ 332231936;
                    Integer.rotateLeft(558666309 ^ var5_5, 7) - 212030870;
                    (int)(-2018109096253396145L ^ (long)var5_5 ^ -8826911121186723283L);
                    try {
                        var7_4 -= 4;
                        if ((-2316999298189884149L ^ (long)var5_5 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var6_6 = 1477019302 + var5_5 ^ -1508280864 ^ -1508280864;
                    }
                    catch (NoSuchElementException v7) {
                        var6_6 = 1477019302 + var5_5 + -2135866039 - -2135866039;
                    }
                    var7_4 += 3;
                    continue block35;
                }
                case -670597361: {
                    Integer.rotateLeft(-1988425811 ^ var5_5, 4) - -1438413522;
                    (int)(5461082459772087119L ^ (long)var5_5 ^ -5886060564513736126L);
                    var6_6 = 969770504 + var5_5 + -658599766 - -658599766;
                    (Integer.rotateLeft(-123473328 ^ var5_5, 18) + 540538603) * -123473327;
                    var6_6 = Integer.reverse(Integer.reverse(-234915875 + var5_5));
                    Integer.rotateRight(1270814182 ^ var5_5, 12) - 813778453;
                    var6_6 = 1477019302 + var5_5 + -692799463 - -692799463;
                    var7_4 += 5;
                    continue block35;
                }
                case 934162946: {
                    (Integer.rotateRight(1359447635 ^ var5_5, 13) + -733551800) * 1359447635;
                    var6_6 = Integer.reverse(Integer.reverse(1196147152 + var5_5));
                    (Integer.rotateRight(-1193072833 ^ var5_5, 10) - 1742692316) * -1193072833;
                    var6_6 = 875546607 + var5_5;
                    (Integer.rotateRight(1463081682 ^ var5_5, 13) + -1815863639) * 1463081683;
                    var6_6 = 1477019302 + var5_5 ^ -138266919 ^ -138266919;
                    continue block35;
                }
                case -475062093: {
                    Integer.rotateLeft(-1415845587 ^ var5_5, 8) - -868295762;
                    (int)(7577665982740884303L ^ (long)var5_5 ^ 8309285460958084995L);
                    var6_6 = -1484446997 + var5_5 + -1830219611 - -1830219611;
                    Integer.rotateRight(-1331812637 ^ var5_5, 9) + 1736725688;
                    var6_6 = 1477019302 + var5_5 + -1729001331 - -1729001331;
                    continue block35;
                }
                case -1492217106: {
                    Integer.rotateLeft(120421569 ^ var5_5, 3) + -488654182;
                    (int)(-4206411546498897073L ^ (long)var5_5 ^ 6379493020629739246L);
                    var6_6 = (int)((long)(-1560291826 + var5_5) ^ 6267026649866304899L ^ 6267026649866304899L);
                    (Integer.rotateRight(2090992695 ^ var5_5, 18) - 469508580) * 2090992695;
                    var6_6 = 1477019302 + var5_5 ^ 1860666127 ^ 1860666127;
                    var7_4 += 4;
                    continue block35;
                }
                case 517907576: {
                    Integer.rotateRight(394048107 ^ var5_5, 5) + -596166096;
                    var6_6 = Integer.reverse(Integer.reverse(-597331592 + var5_5));
                    (Integer.rotateLeft(1889293776 ^ var5_5, 17) + -1488190613) * 1889293777;
                    var6_6 = Integer.reverse(Integer.reverse(1477019302 + var5_5));
                    continue block35;
                }
lbl211:
                // 1 sources

                (Integer.rotateRight(-1657549678 ^ var5_5, 6) + 228812009) * -1657549677;
                try {
                    var7_4 -= 5;
                    if ((317759707514778049L ^ (long)var5_5 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    var6_6 = 1477019302 + var5_5 ^ -546415373 ^ -546415373;
                }
                catch (NoSuchElementException v8) {
                    var6_6 = (int)((long)(1477019302 + var5_5) ^ -5592108261173450269L ^ -5592108261173450269L);
                }
                var7_4 += 5;
                continue block35;
                case -1226201555: {
                    (Integer.rotateRight(406337942 ^ var5_5, 6) - -215181211) * 406337943;
                    (int)(-3561415155503729249L ^ (long)var5_5 ^ 7125470522381971703L);
                    var6_6 = Integer.reverse(Integer.reverse(1299905702 + var5_5));
                    (int)(-8372576987261169140L ^ (long)var5_5 ^ -4729118447848474036L);
                    var6_6 = Integer.reverse(Integer.reverse(1477019302 + var5_5));
                    var7_4 += 5;
                    continue block35;
                }
                case -1083039928: {
                    return var4_3;
                }
            }
            Integer.rotateRight(-724396053 ^ var5_5, 13) + -908196688;
            var6_6 = 1477019302 + var5_5 + -641915404 - -641915404;
        }
    }

    private void bdhw(class_4587 class_45872, class_265 class_2652, class_2338 class_23382, class_238 class_2382, List list, byq byq2) {
        class_238 class_2383 = this.ztw_3(class_2382);
        double d = class_2382.field_1320 - class_2382.field_1323;
        double d2 = class_2382.field_1325 - class_2382.field_1322;
        double d3 = class_2382.field_1324 - class_2382.field_1321;
        double d4 = class_2383.field_1320 - class_2383.field_1323;
        double d5 = class_2383.field_1325 - class_2383.field_1322;
        double d6 = class_2383.field_1324 - class_2383.field_1321;
        double d7 = d > 0.0 ? d4 / d : 1.0;
        double d8 = d2 > 0.0 ? d5 / d2 : 1.0;
        double d9 = d3 > 0.0 ? d6 / d3 : 1.0;
        for (class_238 class_2384 : list) {
            double d10 = class_2383.field_1323 + (class_2384.field_1323 - class_2382.field_1323) * d7;
            double d11 = class_2383.field_1323 + (class_2384.field_1320 - class_2382.field_1323) * d7;
            double d12 = class_2383.field_1322 + (class_2384.field_1322 - class_2382.field_1322) * d8;
            double d13 = class_2383.field_1322 + (class_2384.field_1325 - class_2382.field_1322) * d8;
            double d14 = class_2383.field_1321 + (class_2384.field_1321 - class_2382.field_1321) * d9;
            double d15 = class_2383.field_1321 + (class_2384.field_1324 - class_2382.field_1321) * d9;
            class_238 class_2385 = new class_238(d10, d12, d14, d11, d13, d15);
            if (this.hdm.sdh_2() == this.rad) {
                byq byq3 = this.rjz_2(byq2, 0.52f).tkhl_2(this.shdha_2.thw_5());
                if (this.thfl.shzl()) {
                    this.ssgh_3(class_45872, class_2385, byq3);
                }
                this.ztht_3(class_45872, class_2385.method_1014(0.001), byq2, this.sdht_3.thw_5() / 255.0f, this.bkh.thw_5(), 1.0f);
                this.ztht_3(class_45872, class_2385.method_1014(0.0018), this.khtj_2(byq2, 1.25f, 255), this.sdht_3.thw_5() / 255.0f * 0.55f, this.bkh.thw_5() * 0.72f, 0.65f);
                continue;
            }
            if (!this.thfl.shzl()) continue;
            this.ssgh_3(class_45872, class_2385, byq2.tkhl_2(this.shdha_2.thw_5()));
        }
        byq byq4 = byq2.tkhl_2(this.khdhz.thw_5());
        float f = this.shdm.thw_5();
        if (f > 0.0f) {
            if (class_2652 != null && class_23382 != null) {
                this.tny(class_45872, class_2652, class_23382, class_2382, class_2383.method_1014(0.002), d7, d8, d9, byq4, f);
            } else {
                this.hakh(class_45872, class_2383.method_1014(0.002), byq4, f);
            }
        }
    }

    private void tny(class_4587 class_45872, class_265 class_2652, class_2338 class_23382, class_238 class_2382, class_238 class_2383, double d, double d2, double d3, byq byq2, float f) {
        class_243 class_2432 = bak.mc.field_1773.method_19418().method_19326();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        RenderSystem.lineWidth((float)f);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
        class_2652.method_1104((arg_0, arg_1, arg_2, arg_3, arg_4, arg_5) -> this.dyd(class_23382, class_2383, class_2382, d, d2, d3, class_2872, matrix4f, class_2432, byq2, arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.lineWidth((float)1.0f);
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private void ssgh_3(class_4587 class_45872, class_238 class_2382, byq byq2) {
        class_243 class_2432 = bak.mc.field_1773.method_19418().method_19326();
        class_238 class_2383 = class_2382.method_989(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        this.amgh(class_2872, matrix4f, class_2383.field_1323, class_2383.field_1322, class_2383.field_1321, class_2383.field_1320, class_2383.field_1322, class_2383.field_1321, class_2383.field_1320, class_2383.field_1325, class_2383.field_1321, class_2383.field_1323, class_2383.field_1325, class_2383.field_1321, byq2);
        this.amgh(class_2872, matrix4f, class_2383.field_1323, class_2383.field_1322, class_2383.field_1324, class_2383.field_1320, class_2383.field_1322, class_2383.field_1324, class_2383.field_1320, class_2383.field_1325, class_2383.field_1324, class_2383.field_1323, class_2383.field_1325, class_2383.field_1324, byq2);
        this.amgh(class_2872, matrix4f, class_2383.field_1323, class_2383.field_1322, class_2383.field_1321, class_2383.field_1323, class_2383.field_1322, class_2383.field_1324, class_2383.field_1323, class_2383.field_1325, class_2383.field_1324, class_2383.field_1323, class_2383.field_1325, class_2383.field_1321, byq2);
        this.amgh(class_2872, matrix4f, class_2383.field_1320, class_2383.field_1322, class_2383.field_1321, class_2383.field_1320, class_2383.field_1322, class_2383.field_1324, class_2383.field_1320, class_2383.field_1325, class_2383.field_1324, class_2383.field_1320, class_2383.field_1325, class_2383.field_1321, byq2);
        this.amgh(class_2872, matrix4f, class_2383.field_1323, class_2383.field_1322, class_2383.field_1321, class_2383.field_1320, class_2383.field_1322, class_2383.field_1321, class_2383.field_1320, class_2383.field_1322, class_2383.field_1324, class_2383.field_1323, class_2383.field_1322, class_2383.field_1324, byq2);
        this.amgh(class_2872, matrix4f, class_2383.field_1323, class_2383.field_1325, class_2383.field_1321, class_2383.field_1320, class_2383.field_1325, class_2383.field_1321, class_2383.field_1320, class_2383.field_1325, class_2383.field_1324, class_2383.field_1323, class_2383.field_1325, class_2383.field_1324, byq2);
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private void hakh(class_4587 class_45872, class_238 class_2382, byq byq2, float f) {
        class_243 class_2432 = bak.mc.field_1773.method_19418().method_19326();
        class_238 class_2383 = class_2382.method_989(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        RenderSystem.lineWidth((float)f);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
        this.rkhkh(class_2872, matrix4f, class_2383.field_1323, class_2383.field_1322, class_2383.field_1321, class_2383.field_1320, class_2383.field_1322, class_2383.field_1321, byq2);
        this.rkhkh(class_2872, matrix4f, class_2383.field_1320, class_2383.field_1322, class_2383.field_1321, class_2383.field_1320, class_2383.field_1322, class_2383.field_1324, byq2);
        this.rkhkh(class_2872, matrix4f, class_2383.field_1320, class_2383.field_1322, class_2383.field_1324, class_2383.field_1323, class_2383.field_1322, class_2383.field_1324, byq2);
        this.rkhkh(class_2872, matrix4f, class_2383.field_1323, class_2383.field_1322, class_2383.field_1324, class_2383.field_1323, class_2383.field_1322, class_2383.field_1321, byq2);
        this.rkhkh(class_2872, matrix4f, class_2383.field_1323, class_2383.field_1325, class_2383.field_1321, class_2383.field_1320, class_2383.field_1325, class_2383.field_1321, byq2);
        this.rkhkh(class_2872, matrix4f, class_2383.field_1320, class_2383.field_1325, class_2383.field_1321, class_2383.field_1320, class_2383.field_1325, class_2383.field_1324, byq2);
        this.rkhkh(class_2872, matrix4f, class_2383.field_1320, class_2383.field_1325, class_2383.field_1324, class_2383.field_1323, class_2383.field_1325, class_2383.field_1324, byq2);
        this.rkhkh(class_2872, matrix4f, class_2383.field_1323, class_2383.field_1325, class_2383.field_1324, class_2383.field_1323, class_2383.field_1325, class_2383.field_1321, byq2);
        this.rkhkh(class_2872, matrix4f, class_2383.field_1323, class_2383.field_1322, class_2383.field_1321, class_2383.field_1323, class_2383.field_1325, class_2383.field_1321, byq2);
        this.rkhkh(class_2872, matrix4f, class_2383.field_1320, class_2383.field_1322, class_2383.field_1321, class_2383.field_1320, class_2383.field_1325, class_2383.field_1321, byq2);
        this.rkhkh(class_2872, matrix4f, class_2383.field_1323, class_2383.field_1322, class_2383.field_1324, class_2383.field_1323, class_2383.field_1325, class_2383.field_1324, byq2);
        this.rkhkh(class_2872, matrix4f, class_2383.field_1320, class_2383.field_1322, class_2383.field_1324, class_2383.field_1320, class_2383.field_1325, class_2383.field_1324, byq2);
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.lineWidth((float)1.0f);
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private void ztht_3(class_4587 class_45872, class_238 class_2382, byq byq2, float f, float f2, float f3) {
        class_243 class_2432 = bak.mc.field_1773.method_19418().method_19326();
        class_238 class_2383 = class_2382.method_989(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350).method_1014(0.0015);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        class_5944 class_59442 = RenderSystem.setShader((class_10156)shjs_2);
        if (class_59442 != null) {
            this.aya_2(class_59442, "Time", (float)((double)System.nanoTime() / 1.0E9) * this.dhly.thw_5());
            this.sbd_4(class_59442, "Resolution", mc.method_22683().method_4489(), mc.method_22683().method_4506());
            this.dhdhkh(class_59442, "SmokeColor", byq2.sbk() / 255.0f, byq2.srl() / 255.0f, byq2.shsl_2() / 255.0f);
            this.aya_2(class_59442, "EffectAlpha", class_3532.method_15363((float)f, (float)0.0f, (float)1.0f));
            this.aya_2(class_59442, "SmokeScale", Math.max(0.05f, f2));
            this.aya_2(class_59442, "SmokeIntensity", Math.max(0.0f, f3));
        }
        byq byq3 = byq2.tkhl_2(Math.round(f * 255.0f));
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        this.amgh(class_2872, matrix4f, class_2383.field_1323, class_2383.field_1322, class_2383.field_1321, class_2383.field_1320, class_2383.field_1322, class_2383.field_1321, class_2383.field_1320, class_2383.field_1325, class_2383.field_1321, class_2383.field_1323, class_2383.field_1325, class_2383.field_1321, byq3);
        this.amgh(class_2872, matrix4f, class_2383.field_1323, class_2383.field_1322, class_2383.field_1324, class_2383.field_1320, class_2383.field_1322, class_2383.field_1324, class_2383.field_1320, class_2383.field_1325, class_2383.field_1324, class_2383.field_1323, class_2383.field_1325, class_2383.field_1324, byq3);
        this.amgh(class_2872, matrix4f, class_2383.field_1323, class_2383.field_1322, class_2383.field_1321, class_2383.field_1323, class_2383.field_1322, class_2383.field_1324, class_2383.field_1323, class_2383.field_1325, class_2383.field_1324, class_2383.field_1323, class_2383.field_1325, class_2383.field_1321, byq3);
        this.amgh(class_2872, matrix4f, class_2383.field_1320, class_2383.field_1322, class_2383.field_1321, class_2383.field_1320, class_2383.field_1322, class_2383.field_1324, class_2383.field_1320, class_2383.field_1325, class_2383.field_1324, class_2383.field_1320, class_2383.field_1325, class_2383.field_1321, byq3);
        this.amgh(class_2872, matrix4f, class_2383.field_1323, class_2383.field_1322, class_2383.field_1321, class_2383.field_1320, class_2383.field_1322, class_2383.field_1321, class_2383.field_1320, class_2383.field_1322, class_2383.field_1324, class_2383.field_1323, class_2383.field_1322, class_2383.field_1324, byq3);
        this.amgh(class_2872, matrix4f, class_2383.field_1323, class_2383.field_1325, class_2383.field_1321, class_2383.field_1320, class_2383.field_1325, class_2383.field_1321, class_2383.field_1320, class_2383.field_1325, class_2383.field_1324, class_2383.field_1323, class_2383.field_1325, class_2383.field_1324, byq3);
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private void rkhkh(class_287 class_2872, Matrix4f matrix4f, double d, double d2, double d3, double d4, double d5, double d6, byq byq2) {
        int n = -1848279470;
        n = Integer.rotateLeft(n * -994745941, 10) ^ 0xF5A680E4;
        class_287 class_2873 = class_2872;
        n = Integer.rotateRight((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n, 22);
        Matrix4f matrix4f2 = matrix4f;
        n = (matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n;
        int n2 = n ^ 0x7B4C1D93;
        if ((n2 ^ n) != 2068585875) {
            int cfr_ignored_0 = (0xEA9963C1 ^ n) - 363683096;
        }
        int n3 = (int)bak.sham(byq2);
        int n4 = (int)byq2.srl();
        int n5 = (int)bak.ttf(byq2);
        int n6 = (int)byq2.tzdh_2();
        class_2872.method_22918(matrix4f, (float)d, (float)d2, (float)d3).method_1336(n3, n4, n5, n6);
        bak.bdth(class_2872, matrix4f, (float)d4, (float)d5, (float)d6).method_1336(n3, n4, n5, n6);
    }

    private void amgh(class_287 class_2872, Matrix4f matrix4f, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, byq byq2) {
        int n = 179805789;
        n = Integer.rotateLeft(n * -948446979, 26) ^ 0xF8B3D57C;
        n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 4);
        n = Integer.rotateRight((int)Double.doubleToLongBits(d4) ^ n, 28);
        int n2 = n ^ 0xB58097B8;
        if ((n2 ^ n) != -1249863752) {
            int cfr_ignored_0 = (0xBF3709E5 ^ n) + -1499615823;
        }
        int n3 = (int)byq2.sbk();
        int n4 = (int)bak.thds_3(byq2);
        int n5 = (int)byq2.shsl_2();
        int n6 = (int)byq2.tzdh_2();
        bak.akhn(class_2872, matrix4f, (float)d, (float)d2, (float)d3).method_1336(n3, n4, n5, n6);
        class_2872.method_22918(matrix4f, (float)d4, (float)d5, (float)d6).method_1336(n3, n4, n5, n6);
        class_2872.method_22918(matrix4f, (float)d7, (float)d8, (float)d9).method_1336(n3, n4, n5, n6);
        bak.akhw(class_2872, matrix4f, (float)d10, (float)d11, (float)d12).method_1336(n3, n4, n5, n6);
    }

    /*
     * Unable to fully structure code
     */
    private void aya_2(class_5944 var1_1, String var2_2, float var3_3) {
        var6_4 = 0;
        var4_5 = -262165866;
        var4_5 = Integer.rotateLeft(var4_5 * -201846935, 26) ^ 839336679;
        v0 = var1_1;
        var4_5 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var4_5;
        var4_5 = Integer.rotateLeft(Float.floatToIntBits(var3_3) ^ var4_5, 18);
        var5_6 = Integer.rotateLeft(var4_5 ^ -948706980, 12);
        block19: while (true) {
            if ((var6_4 = Integer.rotateRight(var5_6, 12) ^ var4_5) == 938515670) ** GOTO lbl85
            if (var6_4 == -2128682234) ** GOTO lbl-1000
            if (var6_4 != 1432173054) {
                switch (var6_4) {
                    case -1197778652: {
                        Integer.rotateLeft(-1539926972 ^ var4_5, 7) - -419851401;
                        return;
                    }
                    case -45429217: {
                        (Integer.rotateLeft(554667865 ^ var4_5, 7) + 88079106) * 554667865;
                        (int)(-2036434742452884657L ^ (long)var4_5 ^ -4631808068291106133L);
                        bak.dagh_3(var1_1.method_34582(var2_2), var3_3);
                        try {
                            if ((-346135172746699699L ^ (long)var4_5 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ -1197778652, 12)));
                        }
                        catch (UnsupportedOperationException v1) {
                            var5_6 = Integer.rotateLeft(var4_5 ^ -1197778652, 12) ^ -789663475 ^ -789663475;
                        }
                        var6_4 += 5;
                        continue block19;
                    }
                    case -948706980: {
                        Integer.rotateRight(-219789626 ^ var4_5, 17) - 1849700661;
                        if (var1_1.method_34582(var2_2) == null) {
                            try {
                                var6_4 -= 5;
                                if ((4307737116073692701L ^ (long)var4_5 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                var5_6 = Integer.rotateLeft(var4_5 ^ -1197778652, 12);
                            }
                            catch (IllegalStateException v2) {
                                var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -1197778652, 12) ^ -3697682650077736696L ^ -3697682650077736696L);
                            }
                            continue block19;
                        }
                        (int)(-8646638395395633488L ^ (long)var4_5 ^ 941576484345527760L);
                        var5_6 = Integer.rotateLeft(var4_5 ^ -45429217, 12) ^ -1821001941 ^ -1821001941;
                        ++var6_4;
                        continue block19;
                    }
                }
            }
            ** GOTO lbl128
lbl-1000:
            // 1 sources

            {
                (Integer.rotateLeft(-4087140 ^ var4_5, 18) - -53456865) * -4087139;
                var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -948706980, 12) ^ -4085529219493057243L ^ -4085529219493057243L);
                var6_4 += 2;
                continue block19;
                case -2136913658: {
                    (Integer.rotateRight(672684126 ^ var4_5, 8) - -548384099) * 672684127;
                    var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -655908441, 12) ^ -833630190428394365L ^ -833630190428394365L);
                    Integer.rotateRight(901292295 ^ var4_5, 9) - -2051465452;
                    var5_6 = Integer.rotateLeft(var4_5 ^ -718603603, 12) + 368888340 - 368888340;
                    Integer.rotateLeft(64772136 ^ var4_5, 3) + 2081180691;
                    var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -948706980, 12) ^ -2949747580599278960L ^ -2949747580599278960L);
                    var6_4 += 3;
                    continue block19;
                }
                case 1152142689: {
                    Integer.rotateRight(-122764249 ^ var4_5, 18) - 562520052;
                    var5_6 = Integer.rotateLeft(var4_5 ^ 2079554875, 12) ^ 149196627 ^ 149196627;
                    (Integer.rotateLeft(-1965456227 ^ var4_5, 4) - -726356418) * -1965456227;
                    (int)(5218311460590250831L ^ (long)var4_5 ^ -6327413327996044025L);
                    try {
                        if ((-8585903024732805537L ^ (long)var4_5 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var5_6 = Integer.rotateLeft(var4_5 ^ -948706980, 12) + 2045558959 - 2045558959;
                    }
                    catch (IllegalStateException v3) {
                        var5_6 = Integer.rotateLeft(var4_5 ^ -948706980, 12);
                    }
                    var6_4 -= 5;
                    continue block19;
                }
lbl85:
                // 1 sources

                Integer.rotateRight(953904807 ^ var4_5, 10) - -420477580;
                var5_6 = Integer.rotateLeft(var4_5 ^ -948706980, 12) ^ -113234923 ^ -113234923;
                continue block19;
                case 1496489304: {
                    (Integer.rotateRight(-1234667557 ^ var4_5, 9) + 453255872) * -1234667557;
                    var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -1951206058, 12) ^ 1568333339511227075L ^ 1568333339511227075L);
                    (Integer.rotateRight(1251192735 ^ var4_5, 12) - 205513596) * 1251192735;
                    var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -948706980, 12) ^ 2550994240787066472L ^ 2550994240787066472L);
                    var6_4 += 4;
                    continue block19;
                }
                case 1211741297: {
                    Integer.rotateRight(1791461091 ^ var4_5, 16) + -226036552;
                    (int)(-5079358425787976896L ^ (long)var4_5 ^ 119359381478760149L);
                    var5_6 = Integer.rotateLeft(var4_5 ^ -948706980, 12);
                    continue block19;
                }
                case -1514916890: {
                    (Integer.rotateLeft(48628093 ^ var4_5, 3) - 1580715358) * 48628093;
                    (int)(-4587849430302659761L ^ (long)var4_5 ^ -6633658102657307272L);
                    var5_6 = Integer.rotateLeft(var4_5 ^ -948706980, 12) ^ 963084165 ^ 963084165;
                    Integer.rotateRight(1356051055 ^ var4_5, 13) - -838845780;
                    continue block19;
                }
                case -84356160: {
                    Integer.rotateRight(931491498 ^ var4_5, 9) + -1115290159;
                    var5_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var4_5 ^ -2123654154, 12)));
                    Integer.rotateLeft(-183080735 ^ var4_5, 17) + -1307291014;
                    (int)(4009548217129954127L ^ (long)var4_5 ^ 8126889676049597080L);
                    var5_6 = Integer.rotateLeft(var4_5 ^ -948706980, 12);
                    (Integer.rotateLeft(1675803509 ^ var4_5, 15) - 483545702) * 1675803509;
                    (int)(-6822930035816207537L ^ (long)var4_5 ^ -2891166812312375439L);
                    continue block19;
                }
lbl128:
                // 1 sources

                Integer.rotateLeft(-171674648 ^ var4_5, 17) + -953702317;
                var5_6 = Integer.rotateLeft(var4_5 ^ 1133892382, 12) ^ -2053430804 ^ -2053430804;
                (Integer.rotateLeft(-1288892835 ^ var4_5, 9) - -1227727746) * -1288892835;
                (int)(8187438982428420943L ^ (long)var4_5 ^ -4778175056180588818L);
                var5_6 = Integer.rotateLeft(var4_5 ^ -948706980, 12) + 84867368 - 84867368;
                Integer.rotateRight(-1967304657 ^ var4_5, 4) - -783657748;
                var6_4 += 4;
                continue block19;
                case 1786814005: {
                    (Integer.rotateRight(-188005345 ^ var4_5, 17) - -1459953924) * -188005345;
                    var5_6 = Integer.rotateLeft(var4_5 ^ 239108273, 12) + -1601058742 - -1601058742;
                    (Integer.rotateRight(-1696646438 ^ var4_5, 6) + -983187551) * -1696646437;
                    var5_6 = Integer.rotateLeft(var4_5 ^ -948706980, 12) ^ 1380959211 ^ 1380959211;
                    var6_4 += 3;
                    continue block19;
                }
                case 1595685940: {
                    Integer.rotateRight(791375847 ^ var4_5, 8) - -1163908044;
                    var5_6 = Integer.rotateLeft(var4_5 ^ 2054472437, 12) ^ -1778958987 ^ -1778958987;
                    (Integer.rotateRight(-1579198245 ^ var4_5, 7) + -1637260864) * -1579198245;
                    (int)(8350305574143364389L ^ (long)var4_5 ^ -9211025359306405355L);
                    var5_6 = Integer.rotateLeft(var4_5 ^ -1945407375, 12) ^ -1618844987 ^ -1618844987;
                    (int)(-3373995131117085897L ^ (long)var4_5 ^ -5770497541103153269L);
                    var5_6 = Integer.rotateLeft(var4_5 ^ -948706980, 12) + -663980237 - -663980237;
                    var6_4 -= 3;
                }
            }
            Integer.rotateRight(631829578 ^ var4_5, 7) + -1814875087;
            var5_6 = (int)((long)Integer.rotateLeft(var4_5 ^ -948706980, 12) ^ 4926481292802371945L ^ 4926481292802371945L);
        }
    }

    private void sbd_4(class_5944 class_59442, String string, float f, float f2) {
        try {
            int n = 1293229494;
            n = Integer.rotateLeft(n * -472526261, 8) ^ 0x3A23F9E1;
            n = System.identityHashCode(this) ^ n;
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 21);
            int n2 = n ^ 0x76EEED14;
            if ((n2 ^ n) != 1995369748) {
                int cfr_ignored_0 = (0x3BFBF0A2 ^ n) - 1242102489;
            }
            if ((0x355 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (class_59442.method_34582(string) != null) {
            bak.jhz_4(bak.ash_4(class_59442, string), f, f2);
        }
    }

    private void dhdhkh(class_5944 class_59442, String string, float f, float f2, float f3) {
        int n = 0;
        int n2 = -83030131;
        n2 = Integer.rotateLeft(n2 * -398772469, 19) ^ 0x663109B3;
        n2 = System.identityHashCode(this) ^ n2;
        String string2 = string;
        n2 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n2, 26);
        int n3 = (n2 ^ 0x7A906F72 ^ 0x295ABFF0) + 693813232;
        block24: while (true) {
            switch (n3 - 693813232 ^ 0x295ABFF0 ^ n2) {
                case 897169176: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0x9A7F82F4 ^ n2, 6) - -1177650489) * -1702919435;
                    return;
                }
                case 948637972: {
                    int cfr_ignored_1 = Integer.rotateLeft(0xC7FB2FC8 ^ n2, 11) + 1002989683;
                    bak.khaq(bak.zddh_4(class_59442, string), f, f2, f3);
                    int cfr_ignored_2 = (int)(0x5FFAD7842F286DA5L ^ (long)n2 ^ 0x527892E3206D1224L);
                    n3 = (n2 ^ 0x98CF5511 ^ 0x295ABFF0) + 693813232 + 1830327259 - 1830327259;
                    int cfr_ignored_3 = (int)(0x89037C607F994E6L ^ (long)n2 ^ 0x92FCC340D2EBBCF1L);
                    n3 = (n2 ^ 0x3579B718 ^ 0x295ABFF0) + 693813232;
                    n += 2;
                    continue block24;
                }
                case 2056286066: {
                    int cfr_ignored_4 = Integer.rotateLeft(0x53D7FBC5 ^ n2, 13) - 730143766;
                    int cfr_ignored_5 = (int)(0x916555F827D4EB4FL ^ (long)n2 ^ 0x5680831A2DB88F1BL);
                    if (class_59442.method_34582(string) == null) {
                        n3 = (n2 ^ 0x3579B718 ^ 0x295ABFF0) + 693813232 + -1995593231 - -1995593231;
                        ++n;
                        continue block24;
                    }
                    try {
                        ++n;
                        n3 = (n2 ^ 0x388B1114 ^ 0x295ABFF0) + 693813232 + -2048890891 - -2048890891;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (n2 ^ 0x388B1114 ^ 0x295ABFF0) + 693813232 + -651527353 - -651527353;
                    }
                    n -= 2;
                    continue block24;
                }
                case -893350762: {
                    int cfr_ignored_6 = (Integer.rotateRight(0x541A4676 ^ n2, 13) - 864823173) * 1411008119;
                    n3 = (int)((long)((n2 ^ 0x819321E0 ^ 0x295ABFF0) + 693813232) ^ 0x2600D23DF7FDB76L ^ 0x2600D23DF7FDB76L);
                    int cfr_ignored_7 = Integer.rotateRight(0xBD5B092F ^ n2, 10) - -228344852;
                    int cfr_ignored_8 = (int)(0xEA93BEB37380E147L ^ (long)n2 ^ 0x80162BB239A878F6L);
                    n3 = (n2 ^ 0x7A906F72 ^ 0x295ABFF0) + 693813232 + 975700902 - 975700902;
                    --n;
                    continue block24;
                }
                case -1925499321: {
                    int cfr_ignored_9 = (Integer.rotateRight(0x717169DA ^ n2, 17) + -1055297375) * 1903258075;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xEA076980 ^ 0x295ABFF0) + 693813232));
                    int cfr_ignored_10 = Integer.rotateLeft(0x70A77D69 ^ n2, 17) + -1465528590;
                    int cfr_ignored_11 = (int)(0xB215D35427D4EB4FL ^ (long)n2 ^ 0x5BD8831A2DB8C9FAL);
                    n3 = (n2 ^ 0x32700237 ^ 0x295ABFF0) + 693813232 + 276869687 - 276869687;
                    int cfr_ignored_12 = (Integer.rotateRight(0x6F6A6E53 ^ n2, 16) + -2109670584) * 1869246035;
                    n3 = (n2 ^ 0x7A906F72 ^ 0x295ABFF0) + 693813232 + 1474285898 - 1474285898;
                    n -= 4;
                    continue block24;
                }
                case -142259327: {
                    int cfr_ignored_13 = (Integer.rotateRight(0xB27A1957 ^ n2, 9) - -1591299900) * -1300620969;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x347AA708 ^ 0x295ABFF0) + 693813232));
                    int cfr_ignored_14 = Integer.rotateRight(0x6DC12863 ^ n2, 16) + 1321304888;
                    try {
                        n += 5;
                        if ((0xDAFBF4954D8E3A11L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (n2 ^ 0x7A906F72 ^ 0x295ABFF0) + 693813232 ^ 0xB0419589 ^ 0xB0419589;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (n2 ^ 0x7A906F72 ^ 0x295ABFF0) + 693813232 + 1203476279 - 1203476279;
                    }
                    continue block24;
                }
                case 633611175: {
                    int cfr_ignored_15 = Integer.rotateLeft(0x7D66900C ^ n2, 18) - 868815023;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xE34264C ^ 0x295ABFF0) + 693813232));
                    int cfr_ignored_16 = (Integer.rotateRight(0x5785BEDF ^ n2, 13) - -1651524548) * 1468382943;
                    n3 = (n2 ^ 0x7A906F72 ^ 0x295ABFF0) + 693813232;
                    ++n;
                    continue block24;
                }
                case 1007592072: {
                    int cfr_ignored_17 = Integer.rotateRight(0xF77295A2 ^ n2, 17) + -79839783;
                    n3 = (n2 ^ 0x7A906F72 ^ 0x295ABFF0) + 693813232 + -1093779440 - -1093779440;
                    ++n;
                    continue block24;
                }
                case 1333745561: {
                    int cfr_ignored_18 = (Integer.rotateLeft(0xE07BE475 ^ n2, 15) - 861817190) * -528751499;
                    int cfr_ignored_19 = (int)(0x22C94A4827D4EB4FL ^ (long)n2 ^ 0x69E0831A2DB9E843L);
                    int cfr_ignored_20 = (int)(0x4B7EA226EFE04420L ^ (long)n2 ^ 0xB93D137373673B2CL);
                    n3 = (int)((long)((n2 ^ 0xA74A60EF ^ 0x295ABFF0) + 693813232) ^ 0xB9A1DDE06BDC6FEDL ^ 0xB9A1DDE06BDC6FEDL);
                    int cfr_ignored_21 = (int)(0x589C0E0B8E225A2DL ^ (long)n2 ^ 0xE167D0F74F7D1CE9L);
                    n3 = (n2 ^ 0x7A906F72 ^ 0x295ABFF0) + 693813232;
                    n -= 4;
                    continue block24;
                }
                case 1783887888: {
                    int cfr_ignored_22 = (Integer.rotateRight(0x8C9A2E37 ^ n2, 4) - 185153508) * -1936052681;
                    n3 = (n2 ^ 0x73B97809 ^ 0x295ABFF0) + 693813232 ^ 0x8CCD2E27 ^ 0x8CCD2E27;
                    int cfr_ignored_23 = (Integer.rotateLeft(0x4D36E77C ^ n2, 12) - 1577297727) * 1295443837;
                    try {
                        n -= 3;
                        n3 = (n2 ^ 0x7A906F72 ^ 0x295ABFF0) + 693813232 ^ 0x2E9DE215 ^ 0x2E9DE215;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (n2 ^ 0x7A906F72 ^ 0x295ABFF0) + 693813232;
                    }
                    --n;
                    continue block24;
                }
                case 331807778: {
                    int cfr_ignored_24 = (Integer.rotateLeft(0x3981FD35 ^ n2, 10) - -82098010) * 964820277;
                    int cfr_ignored_25 = (int)(0xFB33530827D4EB4FL ^ (long)n2 ^ 0x5B60831A2DB85BB7L);
                    int cfr_ignored_26 = (int)(0x77ED2FADB244CCB1L ^ (long)n2 ^ 0xA22BA83A6245420BL);
                    n3 = (int)((long)((n2 ^ 0x7A906F72 ^ 0x295ABFF0) + 693813232) ^ 0x2F6FD1FE3836B0E0L ^ 0x2F6FD1FE3836B0E0L);
                    n -= 4;
                    continue block24;
                }
                case 791620830: {
                    int cfr_ignored_27 = Integer.rotateRight(0x6809A503 ^ n2, 16) + -1651991912;
                    n3 = (n2 ^ 0x5A187FA ^ 0x295ABFF0) + 693813232 + -1019169000 - -1019169000;
                    int cfr_ignored_28 = Integer.rotateRight(0xD8B1A2E3 ^ n2, 14) + 1105221816;
                    try {
                        n -= 5;
                        if ((0xFA52927C2C12A5CFL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (n2 ^ 0x7A906F72 ^ 0x295ABFF0) + 693813232 ^ 0x5517EF58 ^ 0x5517EF58;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (n2 ^ 0x7A906F72 ^ 0x295ABFF0) + 693813232 ^ 0xA56E2F53 ^ 0xA56E2F53;
                    }
                    continue block24;
                }
                case 1121311303: {
                    int cfr_ignored_29 = Integer.rotateLeft(0xB49C4DED ^ n2, 9) - -481620242;
                    int cfr_ignored_30 = (int)(0x762EE3D027D4EB4FL ^ (long)n2 ^ 0x3AD0831A2DB9418CL);
                    n3 = (n2 ^ 0xE8A9CD35 ^ 0x295ABFF0) + 693813232 + -2002548331 - -2002548331;
                    int cfr_ignored_31 = Integer.rotateLeft(0xFF370261 ^ n2, 18) + -335091462;
                    int cfr_ignored_32 = (int)(0x3D85AC5C27D4EB4FL ^ (long)n2 ^ 0xA5C8831A2DB9D6DAL);
                    n3 = (n2 ^ 0x6C21CC61 ^ 0x295ABFF0) + 693813232 + -1823921199 - -1823921199;
                    int cfr_ignored_33 = (Integer.rotateLeft(0x2773D614 ^ n2, 7) - -882603097) * 661902869;
                    n3 = (n2 ^ 0x7A906F72 ^ 0x295ABFF0) + 693813232;
                    n -= 2;
                    continue block24;
                }
                case -1661627623: {
                    int cfr_ignored_34 = (Integer.rotateLeft(0x5E30737D ^ n2, 14) - 1815845726) * 1580233597;
                    int cfr_ignored_35 = (int)(0x9C82DD4027D4EB4FL ^ (long)n2 ^ 0x47F0831A2DB894D4L);
                    n3 = (n2 ^ 0x7A906F72 ^ 0x295ABFF0) + 693813232 ^ 0xC909F02E ^ 0xC909F02E;
                    int cfr_ignored_36 = (Integer.rotateLeft(0x89430034 ^ n2, 4) - -1552243321) * -1992097739;
                    n += 5;
                    continue block24;
                }
            }
            int cfr_ignored_37 = Integer.rotateRight(0x3D85EE4F ^ n2, 10) - 2006285004;
            n3 = (int)((long)((n2 ^ 0x7A906F72 ^ 0x295ABFF0) + 693813232) ^ 0xD16252E2BC28E3DEL ^ 0xD16252E2BC28E3DEL);
        }
    }

    /*
     * Unable to fully structure code
     */
    private byq rjz_2(byq var1_1, float var2_2) {
        var5_3 = 0;
        var3_4 = -406966842;
        var3_4 = Integer.rotateLeft(var3_4 * -644072999, 17) ^ 459312504;
        var3_4 = Integer.rotateLeft(System.identityHashCode(this) ^ var3_4, 12);
        v0 = var1_1;
        var3_4 = Integer.rotateLeft((v0 != null ? System.identityHashCode(v0) : 0) ^ var3_4, 26);
        var4_5 = (int)((long)(var3_4 ^ 2128603360) ^ 2169623261868643721L ^ 2169623261868643721L);
        block19: while (true) {
            if ((var5_3 = var4_5 ^ var3_4) == -1387307493) ** GOTO lbl48
            if (var5_3 == -1199389452) ** GOTO lbl117
            Integer.rotateLeft(5271244 ^ var3_4, 3) - 236653039;
            if (var5_3 == -1596469800) ** GOTO lbl31
            switch (var5_3) {
                case 2128603360: {
                    Integer.rotateRight(1076673931 ^ var3_4, 11) + -909602032;
                    if (bak.tshb_2()) {
                        var4_5 = var3_4 ^ -1596469800;
                        var5_3 -= 3;
                        continue block19;
                    }
                    var4_5 = (var3_4 ^ 1529857983) + 2018221629 - 2018221629;
                    Integer.rotateRight(-12007253 ^ var3_4, 18) + -298980368;
                    var4_5 = var3_4 ^ 1539108368;
                    continue block19;
                }
                case 1539108368: {
                    (Integer.rotateRight(633677363 ^ var3_4, 7) + -1757593752) * 633677363;
                    return new byq(class_3532.method_15363((float)(var1_1.sbk() * var2_2), (float)0.0f, (float)Float.intBitsToFloat(-814850328 + 1947246872)), bak.hml(var1_1.srl() * var2_2, 0.0f, Float.intBitsToFloat(-2048141020 - 1114429732)), bak.bhk(var1_1.shsl_2() * var2_2, 0.0f, bak.shl_4(Integer.rotateLeft(1350182930 ^ 1350054890, 13))), var1_1.tzdh_2());
                }
lbl31:
                // 1 sources

                (Integer.rotateRight(-686582729 ^ var3_4, 13) - 264016356) * -686582729;
                throw null;
                case 2076239223: {
                    (Integer.rotateLeft(-285426695 ^ var3_4, 16) + -185048478) * -285426695;
                    (int)(3192513118078298959L ^ (long)var3_4 ^ -2956469006909180595L);
                    var4_5 = var3_4 ^ 1404716925;
                    (Integer.rotateLeft(-781444940 ^ var3_4, 13) - 1618255111) * -781444939;
                    var4_5 = (int)((long)(var3_4 ^ -632403515) ^ -3947622952937397679L ^ -3947622952937397679L);
                    Integer.rotateRight(1816911746 ^ var3_4, 16) + 562933753;
                    var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ 2128603360));
                    var5_3 -= 5;
                    continue block19;
                }
lbl48:
                // 1 sources

                Integer.rotateRight(-858252401 ^ var3_4, 12) - -762776180;
                var4_5 = (int)((long)(var3_4 ^ -804366883) ^ -65513498868281831L ^ -65513498868281831L);
                Integer.rotateRight(483276655 ^ var3_4, 6) - -2125048404;
                var4_5 = (var3_4 ^ 812038147) + 1200281602 - 1200281602;
                Integer.rotateRight(122178434 ^ var3_4, 3) + -434191367;
                var4_5 = (int)((long)(var3_4 ^ 2128603360) ^ 980027847181381831L ^ 980027847181381831L);
                ++var5_3;
                continue block19;
                case -719045860: {
                    Integer.rotateRight(-282205394 ^ var3_4, 16) - -85188147;
                    var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ -945224476));
                    (Integer.rotateRight(-732684974 ^ var3_4, 13) + -1165153239) * -732684973;
                    var4_5 = var3_4 ^ -297555913 ^ -1565828448 ^ -1565828448;
                    (Integer.rotateRight(1328193911 ^ var3_4, 12) - -1702417244) * 1328193911;
                    var4_5 = var3_4 ^ 2128603360;
                    var5_3 -= 3;
                    continue block19;
                }
                case -1122028213: {
                    Integer.rotateRight(-682048917 ^ var3_4, 13) + 404564528;
                    var4_5 = var3_4 ^ 2128603360 ^ 1453726974 ^ 1453726974;
                    Integer.rotateRight(-1887179250 ^ var3_4, 4) - 1700229869;
                    var5_3 += 4;
                    continue block19;
                }
                case -575170435: {
                    Integer.rotateRight(-856146006 ^ var3_4, 12) + -697477935;
                    var4_5 = var3_4 ^ -1344082987 ^ 80695937 ^ 80695937;
                    (Integer.rotateLeft(2090141713 ^ var3_4, 18) + 443128138) * 2090141713;
                    (int)(-4744640973834491057L ^ (long)var3_4 ^ -5681146781468405346L);
                    try {
                        var5_3 -= 5;
                        if ((2824840119551554687L ^ (long)var3_4 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var4_5 = var3_4 ^ 2128603360;
                    }
                    catch (NoSuchElementException v1) {
                        var4_5 = (int)((long)(var3_4 ^ 2128603360) ^ 4739967614321824127L ^ 4739967614321824127L);
                    }
                    var5_3 -= 5;
                    continue block19;
                }
                case 1783910863: {
                    Integer.rotateRight(-856648854 ^ var3_4, 12) + -713066223;
                    var4_5 = (int)((long)(var3_4 ^ 1641701289) ^ -8077478134215144352L ^ -8077478134215144352L);
                    (Integer.rotateRight(2102371579 ^ var3_4, 18) + 822253984) * 2102371579;
                    var4_5 = var3_4 ^ 2128603360 ^ -1069931987 ^ -1069931987;
                    continue block19;
                }
                case -305624021: {
                    (Integer.rotateLeft(184093692 ^ var3_4, 4) - 1485181631) * 184093693;
                    try {
                        if ((-1477191139852631117L ^ (long)var3_4 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var4_5 = var3_4 ^ 2128603360 ^ -1282235139 ^ -1282235139;
                    }
                    catch (UnsupportedOperationException v2) {
                        var4_5 = Integer.reverse(Integer.reverse(var3_4 ^ 2128603360));
                    }
                    var5_3 += 4;
                    continue block19;
                }
lbl117:
                // 1 sources

                (Integer.rotateRight(-2884901 ^ var3_4, 18) + -16187456) * -2884901;
                var4_5 = var3_4 ^ -1771395838 ^ 148388368 ^ 148388368;
                (Integer.rotateRight(-2066239169 ^ var3_4, 3) - 444339676) * -2066239169;
                var4_5 = var3_4 ^ 757575520;
                (Integer.rotateLeft(196229789 ^ var3_4, 4) - 1861400638) * 196229789;
                (int)(-3963004256502092977L ^ (long)var3_4 ^ -3156879190327279664L);
                var4_5 = var3_4 ^ 2128603360 ^ -1558100178 ^ -1558100178;
                continue block19;
                case 1850707054: {
                    Integer.rotateRight(-260043070 ^ var3_4, 17) + 601843897;
                    var4_5 = (var3_4 ^ -377529244) + 450842305 - 450842305;
                    (Integer.rotateLeft(280370717 ^ var3_4, 5) - 174802110) * 280370717;
                    (int)(-3313329773684135089L ^ (long)var3_4 ^ -7120046862413329960L);
                    try {
                        ++var5_3;
                        if ((-6287323493625806713L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var4_5 = (var3_4 ^ 2128603360) + 872862469 - 872862469;
                    }
                    catch (IllegalStateException v3) {
                        var4_5 = (var3_4 ^ 2128603360) + 508765915 - 508765915;
                    }
                    continue block19;
                }
                case -255807044: {
                    (Integer.rotateRight(-189271081 ^ var3_4, 17) - -1499191740) * -189271081;
                    var4_5 = var3_4 ^ -1262759654 ^ -858622928 ^ -858622928;
                    Integer.rotateLeft(1639325285 ^ var3_4, 15) - -647279242;
                    (int)(-6700036452948579505L ^ (long)var3_4 ^ -7079514465766937640L);
                    var4_5 = (var3_4 ^ 2128603360) + -1992214263 - -1992214263;
                    --var5_3;
                    continue block19;
                }
                case -1725221643: {
                    Integer.rotateRight(-1895111537 ^ var3_4, 4) - 1454328972;
                    var4_5 = (int)((long)(var3_4 ^ -741975303) ^ -4758607265265756170L ^ -4758607265265756170L);
                    (Integer.rotateLeft(175520668 ^ var3_4, 4) - 1219417887) * 175520669;
                    var4_5 = (int)((long)(var3_4 ^ 2128603360) ^ 8788628695368908154L ^ 8788628695368908154L);
                    ++var5_3;
                    continue block19;
                }
            }
            Integer.rotateLeft(1691006309 ^ var3_4, 15) - 954832502;
            (int)(-6451376400768898225L ^ (long)var3_4 ^ -3764865140022255327L);
            var4_5 = (var3_4 ^ 2128603360) + -2005029313 - -2005029313;
        }
    }

    private byq khtj_2(byq byq2, float f, int n) {
        try {
            int n2 = 762861519;
            n2 = Integer.rotateLeft(n2 * -936347749, 9) ^ 0x4ABA01BD;
            n2 = System.identityHashCode(this) ^ n2;
            n2 = n ^ n2;
            int n3 = n2 ^ 0x23DAEDD1;
            if ((n3 ^ n2) != 601550289) {
                int cfr_ignored_0 = (0xEA2BA1E ^ n2) - 1578997153;
            }
            if ((0x3BC & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return new byq(class_3532.method_15363((float)(byq2.sbk() * f), (float)0.0f, (float)Float.intBitsToFloat(Integer.reverse(-1352396089) ^ 0xA03726F5)), class_3532.method_15363((float)(byq2.srl() * f), (float)0.0f, (float)Float.intBitsToFloat(10991076 - -1121405468)), bak.jnn(byq2.shsl_2() * f, 0.0f, Float.intBitsToFloat(-335128593 - -1467525137)), class_3532.method_15363((float)n, (float)0.0f, (float)Float.intBitsToFloat(2081854816 - 949458272)));
    }

    private void dyd(class_2338 class_23382, class_238 class_2382, class_238 class_2383, double d, double d2, double d3, class_287 class_2872, Matrix4f matrix4f, class_243 class_2432, byq byq2, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = d4 + (double)class_23382.method_10263();
        double d11 = d5 + (double)class_23382.method_10264();
        double d12 = d6 + (double)class_23382.method_10260();
        double d13 = d7 + (double)class_23382.method_10263();
        double d14 = d8 + (double)class_23382.method_10264();
        double d15 = d9 + (double)class_23382.method_10260();
        double d16 = class_2382.field_1323 + (d10 - class_2383.field_1323) * d;
        double d17 = class_2382.field_1322 + (d11 - class_2383.field_1322) * d2;
        double d18 = class_2382.field_1321 + (d12 - class_2383.field_1321) * d3;
        double d19 = class_2382.field_1323 + (d13 - class_2383.field_1323) * d;
        double d20 = class_2382.field_1322 + (d14 - class_2383.field_1322) * d2;
        double d21 = class_2382.field_1321 + (d15 - class_2383.field_1321) * d3;
        this.rkhkh(class_2872, matrix4f, d16 - class_2432.field_1352, d17 - class_2432.field_1351, d18 - class_2432.field_1350, d19 - class_2432.field_1352, d20 - class_2432.field_1351, d21 - class_2432.field_1350, byq2);
    }

    private void ak(shw_3 shw2) {
        class_3966 class_39662;
        Object object;
        int n = lf.dhddh(1742669013);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 21);
        shw_3 shw3 = shw2;
        n = Integer.rotateRight((shw3 != null ? System.identityHashCode(shw3) : 0) ^ n, 10);
        int n2 = n ^ 0xCBE143A5;
        if ((n2 ^ n) != -874429531) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xAC3E4770 ^ n, 8) + -538425909) * -1405204623;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (bak.mc.field_1687 == null) {
            this.shkh_6 = null;
            return;
        }
        class_238 class_2382 = null;
        List<class_238> list = null;
        class_265 class_2652 = null;
        class_2338 class_23382 = null;
        Object object2 = bak.mc.field_1765;
        if (object2 instanceof class_3965 && (object = (class_3965)object2).method_17783() == class_239.class_240.field_1332) {
            class_23382 = object.method_17777();
            class_2652 = bak.mc.field_1687.method_8320(class_23382).method_26218((class_1922)bak.mc.field_1687, class_23382);
            if (!class_2652.method_1110()) {
                class_2382 = class_2652.method_1107().method_996(class_23382);
                list = new ArrayList<class_238>();
                for (class_238 class_2383 : class_2652.method_1090()) {
                    list.add(class_2383.method_996(class_23382));
                }
            }
        } else if (this.bt.shzl() && (object2 = bak.mc.field_1765) instanceof class_3966 && (class_39662 = (class_3966)object2).method_17783() == class_239.class_240.field_1331 && (object2 = class_39662.method_17782()) != null) {
            class_238 class_2384;
            double d = class_3532.method_16436((double)shw2.skz_4(), (double)((class_1297)object2).field_6014, (double)object2.method_23317());
            double d2 = class_3532.method_16436((double)shw2.skz_4(), (double)((class_1297)object2).field_6036, (double)object2.method_23318());
            double d3 = class_3532.method_16436((double)shw2.skz_4(), (double)((class_1297)object2).field_5969, (double)object2.method_23321());
            class_2382 = class_2384 = object2.method_5829().method_989(d - object2.method_23317(), d2 - object2.method_23318(), d3 - object2.method_23321());
            list = Collections.singletonList(class_2384);
        }
        if (class_2382 == null || list == null || list.isEmpty()) {
            this.shkh_6 = null;
            return;
        }
        object = this.tsr();
        this.bdhw(shw2.ssha_2(), class_2652, class_23382, class_2382, list, (byq)object);
    }

    private boolean dzh_7() {
        try {
            int n = 1584229304;
            n = Integer.rotateLeft(n * 1913940053, 5) ^ 0x5D0903BE;
            int n2 = n ^ 0x4367EA35;
            if ((n2 ^ n) != 1130883637) {
                int cfr_ignored_0 = (0x1D0A818D ^ n) - 624910734;
            }
            if ((0x26B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.rad.shghkh();
    }

    private boolean btm_2() {
        int n = 1939115346;
        n = Integer.rotateLeft(n * -904082575, 13) ^ 0x25838BAB;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 2);
        int n2 = n ^ 0x6D2362A9;
        if ((n2 ^ n) != 1831035561) {
            int cfr_ignored_0 = (0x1EB7EFFB ^ n) + -764701831;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return !this.rad.shghkh();
    }

    private boolean thad() {
        int n = 1244102980;
        n = Integer.rotateLeft(n * 1401683573, 20) ^ 0xFD7E2DEB;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x3E513C8A;
        if ((n2 ^ n) != 1045511306) {
            int cfr_ignored_0 = (0x7476BDCE ^ n) + -632764445;
        }
        return !this.rad.shghkh();
    }

    private boolean dhmj() {
        int n = 54652434;
        n = Integer.rotateLeft(n * -1126055737, 3) ^ 0x4FB4F412;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 26);
        int n2 = n ^ 0x6E9F3FAC;
        if ((n2 ^ n) != 1855930284) {
            int cfr_ignored_0 = (0x6DDED1BE ^ n) - 838949007;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.thfl.shzl();
    }

    private boolean zjb() {
        int n = -143891711;
        n = Integer.rotateLeft(n * -1660814995, 20) ^ 0x4AB519C;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 16);
        int n2 = n ^ 0xB173D39D;
        if ((n2 ^ n) != -1317809251) {
            int cfr_ignored_0 = (0x461FB09C ^ n) - 1153367505;
        }
        return !this.thghs.shghkh();
    }

    private static String dwd(String string, int n, int n2, int n3) {
        int n4 = -1331248503;
        n4 = Integer.rotateLeft(n4 * 899585537, 21) ^ 0x2BA963F5;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = n4 ^ 0x9BC614A8;
        if ((n5 ^ n4) != -1681517400) {
            int cfr_ignored_0 = (0x2B60D621 ^ n4) + -30806005;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x3553287) + rlth ^ Integer.reverse(n2 + i * 1182894999), 6) - hdt_2);
        }
        return new String(cArray);
    }

    private static class_243 dsz_7(class_238 class_2382) {
        block0: {
            int n = lf.dhddh(-1929416216);
            class_238 class_2383 = class_2382;
            n = (class_2383 != null ? System.identityHashCode(class_2383) : 0) ^ n;
            int n2 = n ^ 0x56C779E4;
            if ((n2 ^ n) == 1455913444) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xDA38080C ^ n, 14) - 1898354863;
        }
        return class_2382.method_1005();
    }

    private static class_243 jnr(class_238 class_2382) {
        block0: {
            int n = -1753541883;
            n = Integer.rotateLeft(n * 610732795, 5) ^ 0x7B32D23F;
            class_238 class_2383 = class_2382;
            n = Integer.rotateLeft((class_2383 != null ? System.identityHashCode(class_2383) : 0) ^ n, 11);
            int n2 = n ^ 0x8F56A16;
            if ((n2 ^ n) == 150301206) break block0;
            int cfr_ignored_0 = (0x9F8E7913 ^ n) - 148501918;
        }
        return class_2382.method_1005();
    }

    private static double hmm(double d, double d2, double d3) {
        block0: {
            int n = -136171738;
            n = Integer.rotateLeft(n * -62185613, 11) ^ 0xBD19C7FD;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 18);
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d2) ^ n, 10);
            int n2 = n ^ 0xA34626F9;
            if ((n2 ^ n) == -1555683591) break block0;
            int cfr_ignored_0 = (0x54A409DF ^ n) - 1638646945;
        }
        return class_3532.method_16436((double)d, (double)d2, (double)d3);
    }

    private static double jyh(double d, double d2, double d3) {
        block0: {
            int n = lf.dhddh(-936848592);
            n = (int)Double.doubleToLongBits(d) ^ n;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d2) ^ n, 13);
            int n2 = n ^ 0xE7D08F8E;
            if ((n2 ^ n) == -405762162) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x2FF85CBE ^ n, 8) - -747578819) * 804805823;
        }
        return class_3532.method_16436((double)d, (double)d2, (double)d3);
    }

    private static float sham(byq byq2) {
        block0: {
            int n = lf.dhddh(105191692);
            int n2 = n ^ 0xAB6E545;
            if ((n2 ^ n) == 179758405) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xCF3FC49 ^ n, 4) + -1779880942;
            int cfr_ignored_1 = (int)(0xCE41527427D4EB4FL ^ (long)n ^ 0x5998831A2DB83153L);
        }
        return byq2.sbk();
    }

    private static float ttf(byq byq2) {
        block0: {
            int n = 1359224870;
            n = Integer.rotateLeft(n * 666450981, 6) ^ 0x8C141DED;
            byq byq3 = byq2;
            n = Integer.rotateLeft((byq3 != null ? System.identityHashCode(byq3) : 0) ^ n, 24);
            int n2 = n ^ 0x67A113E9;
            if ((n2 ^ n) == 1738609641) break block0;
            int cfr_ignored_0 = (0x36A533CF ^ n) + 2099393598;
        }
        return byq2.shsl_2();
    }

    private static class_4588 bdth(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3) {
        block0: {
            int n = lf.dhddh(1635948271);
            n = Float.floatToIntBits(f2) ^ n;
            n = Float.floatToIntBits(f3) ^ n;
            int n2 = n ^ 0x63B2634;
            if ((n2 ^ n) == 104539700) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x67B9B0DB ^ n, 15) + -1814427200) * 1740222683;
        }
        return class_2872.method_22918(matrix4f, f, f2, f3);
    }

    private static float thds_3(byq byq2) {
        block0: {
            int n = lf.dhddh(-719107311);
            byq byq3 = byq2;
            n = (byq3 != null ? System.identityHashCode(byq3) : 0) ^ n;
            int n2 = n ^ 0x5420432C;
            if ((n2 ^ n) == 1411400492) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x8103083D ^ n, 3) - -1547985250) * -2130507715;
            int cfr_ignored_1 = (int)(0x43B1A60027D4EB4FL ^ (long)n ^ 0xB170831A2DB92AB2L);
        }
        return byq2.srl();
    }

    private static class_4588 akhn(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3) {
        block0: {
            int n = 966323893;
            n = Integer.rotateLeft(n * 1996760551, 16) ^ 0x25EB84C4;
            n = Float.floatToIntBits(f) ^ n;
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0x94A44F7B;
            if ((n2 ^ n) == -1801171077) break block0;
            int cfr_ignored_0 = (0xAD3CA1CE ^ n) + 708562801;
        }
        return class_2872.method_22918(matrix4f, f, f2, f3);
    }

    private static class_4588 akhw(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3) {
        block0: {
            int n = 860836077;
            n = Integer.rotateLeft(n * -773738653, 3) ^ 0xF9979B02;
            class_287 class_2873 = class_2872;
            n = (class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xF74F3378;
            if ((n2 ^ n) == -145804424) break block0;
            int cfr_ignored_0 = (0xC4006395 ^ n) + 1651761608;
        }
        return class_2872.method_22918(matrix4f, f, f2, f3);
    }

    private static void dagh_3(class_284 class_2842, float f) {
        int n = -292242885;
        int n2 = (n = Integer.rotateLeft(n * -1763296059, 12) ^ 0x814F19CD) ^ 0xE90B6C31;
        if ((n2 ^ n) != -385127375) {
            int cfr_ignored_0 = (0x79FD60A ^ n) + -697855118;
        }
        class_2842.method_1251(f);
    }

    private static class_284 ash_4(class_5944 class_59442, String string) {
        block0: {
            int n = lf.dhddh(921290204);
            int n2 = n ^ 0x873EE0AA;
            if ((n2 ^ n) == -2025922390) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xB1D72576 ^ n, 9) - -1922357115) * -1311300233;
        }
        return class_59442.method_34582(string);
    }

    private static void jhz_4(class_284 class_2842, float f, float f2) {
        int n = lf.dhddh(1641911461);
        class_284 class_2843 = class_2842;
        n = (class_2843 != null ? System.identityHashCode(class_2843) : 0) ^ n;
        n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 5);
        int n2 = n ^ 0xBD04812E;
        if ((n2 ^ n) != -1123778258) {
            int cfr_ignored_0 = Integer.rotateRight(0xDCD9158B ^ n, 14) + -1029227760;
        }
        class_2842.method_1255(f, f2);
    }

    private static class_284 zddh_4(class_5944 class_59442, String string) {
        block0: {
            int n = 1175128183;
            n = Integer.rotateLeft(n * -1838247543, 11) ^ 0xD66BA49F;
            class_5944 class_59443 = class_59442;
            n = (class_59443 != null ? System.identityHashCode(class_59443) : 0) ^ n;
            int n2 = n ^ 0xC7C356E7;
            if ((n2 ^ n) == -943499545) break block0;
            int cfr_ignored_0 = (0x81C85E90 ^ n) - -894560892;
        }
        return class_59442.method_34582(string);
    }

    private static void khaq(class_284 class_2842, float f, float f2, float f3) {
        int n = -1365718126;
        n = Integer.rotateLeft(n * -1355166305, 4) ^ 0x4A48CF7F;
        class_284 class_2843 = class_2842;
        n = Integer.rotateRight((class_2843 != null ? System.identityHashCode(class_2843) : 0) ^ n, 9);
        n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 10);
        int n2 = n ^ 0x806F5E2F;
        if ((n2 ^ n) != -2140185041) {
            int cfr_ignored_0 = (0x2EF795BD ^ n) + -1173839067;
        }
        class_2842.method_1249(f, f2, f3);
    }

    private static boolean tshb_2() {
        block0: {
            int n = -937271066;
            int n2 = (n = Integer.rotateLeft(n * 34286401, 26) ^ 0x14FC3F79) ^ 0x79564492;
            if ((n2 ^ n) == 2035696786) break block0;
            int cfr_ignored_0 = (0xB1742474 ^ n) + -1830804705;
        }
        return yf.dnkh();
    }

    private static float hml(float f, float f2, float f3) {
        block0: {
            int n = 283526830;
            n = Integer.rotateLeft(n * -112826665, 7) ^ 0x5A684640;
            n = Float.floatToIntBits(f3) ^ n;
            int n2 = n ^ 0xF3A5F1B5;
            if ((n2 ^ n) == -207228491) break block0;
            int cfr_ignored_0 = (0xE343B71B ^ n) + 1872863543;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static float shl_4(int n) {
        block0: {
            int n2 = -1724059021;
            n2 = Integer.rotateLeft(n2 * -1221275501, 5) ^ 0xFBA76FE6;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 18)) ^ 0x936260DD;
            if ((n3 ^ n2) == -1822269219) break block0;
            int cfr_ignored_0 = (0xA5E92AE ^ n2) - -442684057;
        }
        return Float.intBitsToFloat(n);
    }

    private static float bhk(float f, float f2, float f3) {
        block0: {
            int n = 828859738;
            n = Integer.rotateLeft(n * -467048211, 28) ^ 0x8B2D4D63;
            n = Float.floatToIntBits(f) ^ n;
            n = Integer.rotateRight(Float.floatToIntBits(f3) ^ n, 16);
            int n2 = n ^ 0xBFB1C6E5;
            if ((n2 ^ n) == -1078868251) break block0;
            int cfr_ignored_0 = (0x8ED6A3BF ^ n) + 193532441;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static float jnn(float f, float f2, float f3) {
        block0: {
            int n = -630143661;
            n = Integer.rotateLeft(n * 2135038957, 19) ^ 0xA7A1FB84;
            n = Integer.rotateRight(Float.floatToIntBits(f3) ^ n, 15);
            int n2 = n ^ 0x4F4396B8;
            if ((n2 ^ n) == 1329829560) break block0;
            int cfr_ignored_0 = (0x953353EB ^ n) - 939262692;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static String[] tbt(String string) {
        int n = 1676830905;
        int n2 = (n = Integer.rotateLeft(n * 1572143915, 15) ^ 0x6D666A87) ^ 0xC8146009;
        if ((n2 ^ n) != -938188791) {
            int cfr_ignored_0 = (0xABE608B0 ^ n) + -950821947;
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

    private static CallSite bksh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1534225315;
            n3 = Integer.rotateLeft(n3 * -621888983, 28) ^ 0x7900FF9C;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 15);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xA6C41FBF;
            if ((n4 ^ n3) != -1497096257) {
                int cfr_ignored_0 = (0x2498BE2 ^ n3) - 195610593;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ tsht_2 ^ string.hashCode() ^ n2 + sths_3 + i * -226562477) + tsht_2) ^ sths_3));
            }
            String[] stringArray = bak.tbt(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] xw0n8shcuinl(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite xziiahjxm(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ r39qdolb56l ^ string.hashCode() ^ n2 + xkdmwgnb + i * 687462051) + r39qdolb56l) ^ xkdmwgnb));
            }
            String[] stringArray = bak.xw0n8shcuinl(new String(cArray));
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

