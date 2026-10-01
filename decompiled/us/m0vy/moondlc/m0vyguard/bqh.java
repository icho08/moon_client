/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1657
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_7828
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_7828;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bjh;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bksh;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.dh;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.sj_2;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.ya_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Logout Spot", category=bzw.OTHER, desc="Displays a ghost where players logged out")
public class bqh
extends bnq {
    private final tay rkz = new tay(this, "Duration").shth_7(Float.intBitsToFloat(0xAF766A5F ^ 0xEE566A5F)).dhbs_2(Float.intBitsToFloat(0x94F56EFB ^ 0xD7636EFB)).rkh_3(Float.intBitsToFloat(0x55CDB5FC ^ 0x156DB5FC)).ssd_5(Float.intBitsToFloat(0x5747957C ^ 0x15F3957C));
    private final badh_2 tad = new badh_2(this, "Show Friends").bts(true);
    private final badh_2 jds_4 = new badh_2(this, "Through Walls").bts(true);
    private final bzw_2 bthh_2 = new bzw_2(this, "Player ".concat("Color")).dhshy(new byq(Float.intBitsToFloat(-353958461 + 1486355005), Float.intBitsToFloat(0x9326BCF3 ^ 0xD182BCF3), Float.intBitsToFloat(-586946939 - -1704991099), Float.intBitsToFloat(-262712970 + 1389866634)));
    private final bzw_2 jhb = new bzw_2(this, "Friend C".concat("olor")).dhshy(new byq(Float.intBitsToFloat(-1103015968 - 2073645024), Float.intBitsToFloat(Integer.reverse(205870157) ^ 0xF155A230), Float.intBitsToFloat(-1096468728 + -2074687240), Float.intBitsToFloat(-1059269220 - 2108544412)));
    private final Map dhhj = new ConcurrentHashMap();
    private final Map rlgh = new ConcurrentHashMap();
    private final bql<bksh> brgh = this::stt_4;
    private final bql<ya_2> shthz = this::shtw;
    private final bql<shw_3> tl_2 = this::dhsa;
    private static final int hqdh = 830811478;
    private static final int sskh_2 = 297578839;
    private static final int hqa = 2004043397;
    private static final int bkhs_2 = -526220872;
    private static final int l40983o03pq1 = -1984748269;
    private static final int i8j0e4zkfjall = -605476269;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int dw23e07je;

    @Override
    public void nc() {
        int n = -230480135;
        n = Integer.rotateLeft(n * -1744791203, 27) ^ 0xEFBE5F10;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 17);
        int n2 = n ^ 0xE1668694;
        if ((n2 ^ n) != -513374572) {
            int cfr_ignored_0 = (0x1325A06D ^ n) + -406133805;
        }
        this.dhhj.clear();
        this.rlgh.clear();
    }

    private void stdh(class_4587 class_45872, bjh bjh2, float f) {
        Color color = new Color((bjh2.tkl ? this.jhb.sdsh_4() : this.bthh_2.sdsh_4()).rk(), true);
        float f2 = 0.82f + (float)(Math.sin((double)(System.currentTimeMillis() - bjh2.htdh) / 180.0) * (double)0.18f);
        double d = (double)bjh2.bkhgh * 0.5;
        double d2 = bjh2.sthth;
        class_243 class_2432 = bqh.mc.field_1773.method_19418().method_19326();
        double d3 = bjh2.tth_3.field_1352 - class_2432.field_1352;
        double d4 = bjh2.tth_3.field_1351 - class_2432.field_1351;
        double d5 = bjh2.tth_3.field_1350 - class_2432.field_1350;
        class_238 class_2383 = new class_238(d3 - d, d4, d5 - d, d3 + d, d4 + d2, d5 + d).method_1014(0.004 + (double)f2 * 0.004);
        Color color2 = this.zmf_2(color, Math.min(92, Math.round((float)color.getAlpha() * 0.23f * f2)));
        Color color3 = this.zmf_2(color, Math.min(255, Math.round((float)color.getAlpha() * 0.88f)));
        if (this.jds_4.shzl()) {
            RenderSystem.disableDepthTest();
        }
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        this.bsn(class_45872, class_2383, color2, color3);
        if (this.jds_4.shzl()) {
            RenderSystem.enableDepthTest();
        }
        RenderSystem.disableBlend();
    }

    private void bsn(class_4587 class_45872, class_238 class_2383, Color color, Color color2) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        float f = (float)class_2383.field_1323;
        float f2 = (float)class_2383.field_1322;
        float f3 = (float)class_2383.field_1321;
        float f4 = (float)class_2383.field_1320;
        float f5 = (float)class_2383.field_1325;
        float f6 = (float)class_2383.field_1324;
        class_2872.method_22918(matrix4f, f, f2, f6).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f4, f2, f6).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f4, f5, f6).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f, f5, f6).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f, f2, f3).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f, f5, f3).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f4, f5, f3).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f4, f2, f3).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f, f2, f3).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f, f2, f6).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f, f5, f6).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f, f5, f3).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f4, f2, f3).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f4, f5, f3).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f4, f5, f6).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f4, f2, f6).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f, f5, f3).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f, f5, f6).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f4, f5, f6).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f4, f5, f3).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f, f2, f3).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f4, f2, f3).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f4, f2, f6).method_39415(color.getRGB());
        class_2872.method_22918(matrix4f, f, f2, f6).method_39415(color.getRGB());
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.lineWidth((float)1.5f);
        class_287 class_2873 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
        int n = color2.getRGB();
        this.shzt_3(class_2873, matrix4f, f, f2, f3, f4, f2, f3, n);
        this.shzt_3(class_2873, matrix4f, f4, f2, f3, f4, f2, f6, n);
        this.shzt_3(class_2873, matrix4f, f4, f2, f6, f, f2, f6, n);
        this.shzt_3(class_2873, matrix4f, f, f2, f6, f, f2, f3, n);
        this.shzt_3(class_2873, matrix4f, f, f5, f3, f4, f5, f3, n);
        this.shzt_3(class_2873, matrix4f, f4, f5, f3, f4, f5, f6, n);
        this.shzt_3(class_2873, matrix4f, f4, f5, f6, f, f5, f6, n);
        this.shzt_3(class_2873, matrix4f, f, f5, f6, f, f5, f3, n);
        this.shzt_3(class_2873, matrix4f, f, f2, f3, f, f5, f3, n);
        this.shzt_3(class_2873, matrix4f, f4, f2, f3, f4, f5, f3, n);
        this.shzt_3(class_2873, matrix4f, f4, f2, f6, f4, f5, f6, n);
        this.shzt_3(class_2873, matrix4f, f, f2, f6, f, f5, f6, n);
        class_286.method_43433((class_9801)class_2873.method_60800());
    }

    private void shzt_3(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, int n) {
        int n2 = 1820396793;
        n2 = Integer.rotateLeft(n2 * -1954837123, 9) ^ 0xBAE91E5F;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 15);
        Matrix4f matrix4f2 = matrix4f;
        n2 = (matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n2;
        int n3 = n2 ^ 0xD2C2EADB;
        if ((n3 ^ n2) != -758977829) {
            int cfr_ignored_0 = (0xBE43E622 ^ n2) + -1479414150;
        }
        class_2872.method_22918(matrix4f, f, f2, f3).method_39415(n);
        bqh.bkhh_2(class_2872, matrix4f, f4, f5, f6).method_39415(n);
    }

    /*
     * Unable to fully structure code
     */
    private Color zmf_2(Color var1_1, int var2_2) {
        var5_3 = 0;
        var3_4 = 844896340;
        var3_4 = Integer.rotateLeft(var3_4 * -1485815037, 19) ^ -172731310;
        var3_4 = var2_2 ^ var3_4;
        var4_5 = var3_4 - 2006552090;
        while (true) {
            block33: {
                block34: {
                    block38: {
                        block37: {
                            block41: {
                                block32: {
                                    block39: {
                                        block30: {
                                            block36: {
                                                block35: {
                                                    block40: {
                                                        block31: {
                                                            var5_3 = var3_4 - var4_5;
                                                            switch (var5_3 & 7) {
                                                                case 2: {
                                                                    if (var5_3 == 2006552090) break;
                                                                    if (var5_3 == -2023908886) break block30;
                                                                    (Integer.rotateLeft(1525802068 ^ var3_4, 14) - 128468327) * 1525802069;
                                                                    if (var5_3 == 1155119114) break block31;
                                                                    if (var5_3 != 1039536362) {
                                                                        ** break;
                                                                    }
                                                                    break block32;
                                                                }
                                                                case 3: {
                                                                    if (var5_3 == -990113541) break block33;
                                                                    if (var5_3 == 1134969867) break block34;
                                                                    (Integer.rotateLeft(-104559980 ^ var3_4, 18) - 1126852391) * -104559979;
                                                                    if (var5_3 != -108075821) {
                                                                        ** break;
                                                                    }
                                                                    break block35;
                                                                }
                                                                case 4: {
                                                                    if (var5_3 != -84646748) {
                                                                        ** break;
                                                                    }
                                                                    break block36;
                                                                }
                                                                case 5: {
                                                                    if (var5_3 == -1405685643) break block37;
                                                                    if (var5_3 != -179669531) {
                                                                        ** break;
                                                                    }
                                                                    break block38;
                                                                }
                                                                case 6: {
                                                                    if (var5_3 != -1749965034) {
                                                                        ** break;
                                                                    }
                                                                    break block39;
                                                                }
                                                                case 7: {
                                                                    if (var5_3 == -254150297) break block40;
                                                                    if (var5_3 != 232289503) {
                                                                        (Integer.rotateRight(49518834 ^ var3_4, 3) + 1608328329) * 49518835;
                                                                        if (var5_3 != -1191787729) ** break;
                                                                        Integer.rotateRight(2111252910 ^ var3_4, 18) - 1097575245;
                                                                        return new Color(var1_1.getRed(), var1_1.getGreen(), var1_1.getBlue(), Math.max(0, Math.min(1399453933 + -1399453678, var2_2)));
                                                                    }
                                                                    break block41;
                                                                }
                                                            }
                                                            Integer.rotateRight(-305812530 ^ var3_4, 16) - -817009363;
                                                            if (yf.khdha_2()) {
                                                                (int)(6489328649539544873L ^ (long)var3_4 ^ -8539817133122184756L);
                                                                var4_5 = var3_4 - 727794224 ^ -292516226 ^ -292516226;
                                                                (int)(-6275576879954708401L ^ (long)var3_4 ^ -6532550452058719232L);
                                                                var4_5 = var3_4 - -1191787729 + 260429412 - 260429412;
                                                                var5_3 -= 2;
                                                                continue;
                                                            }
                                                            (int)(704130604046272020L ^ (long)var3_4 ^ -2635925322816569766L);
                                                            var4_5 = Integer.reverse(Integer.reverse(var3_4 - -1539832296));
                                                            (int)(-5796954150412780723L ^ (long)var3_4 ^ -3124629093186997557L);
                                                            var4_5 = var3_4 - 1155119114;
                                                            var5_3 += 4;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(986610343 ^ var3_4, 10) - 593394036;
                                                        bqh.sta_3();
                                                        (int)(6732796691454540564L ^ (long)var3_4 ^ -7447182923338410226L);
                                                        var4_5 = var3_4 - -1191787729 + 871992421 - 871992421;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(-1984179396 ^ var3_4, 4) - -1306774657) * -1984179395;
                                                    var4_5 = Integer.reverse(Integer.reverse(var3_4 - 2006552090));
                                                    (Integer.rotateLeft(1890813305 ^ var3_4, 17) + -1441085214) * 1890813305;
                                                    (int)(-5620163288255632561L ^ (long)var3_4 ^ -6054945550540158509L);
                                                    var5_3 += 5;
                                                    continue;
                                                }
                                                (Integer.rotateRight(-1992996389 ^ var3_4, 4) + -1580101440) * -1992996389;
                                                var4_5 = var3_4 - -514414003 ^ -792297460 ^ -792297460;
                                                (Integer.rotateRight(-792574030 ^ var3_4, 13) + 1273253321) * -792574029;
                                                (int)(3964941305651973878L ^ (long)var3_4 ^ 7442393970175099869L);
                                                var4_5 = Integer.reverse(Integer.reverse(var3_4 - 2006552090));
                                                --var5_3;
                                                continue;
                                            }
                                            Integer.rotateRight(-360889970 ^ var3_4, 16) - 1770557293;
                                            var4_5 = var3_4 - 1706201716 + 1102842509 - 1102842509;
                                            Integer.rotateLeft(490282017 ^ var3_4, 6) + -1907882182;
                                            (int)(-2338579747491746993L ^ (long)var3_4 ^ -7401521839123983674L);
                                            try {
                                                ++var5_3;
                                                var4_5 = var3_4 - 2006552090 ^ -1493216811 ^ -1493216811;
                                            }
                                            catch (UnsupportedOperationException v0) {
                                                var4_5 = Integer.reverse(Integer.reverse(var3_4 - 2006552090));
                                            }
                                            continue;
                                        }
                                        (Integer.rotateLeft(1242831701 ^ var3_4, 12) - -53678458) * 1242831701;
                                        (int)(-8599986979467891889L ^ (long)var3_4 ^ -7520867229249258340L);
                                        try {
                                            var5_3 -= 2;
                                            if ((2816258539685725429L ^ (long)var3_4 | 1L) == 0L) {
                                                throw new IllegalStateException();
                                            }
                                            var4_5 = var3_4 - 2006552090;
                                        }
                                        catch (IllegalStateException v1) {
                                            var4_5 = Integer.reverse(Integer.reverse(var3_4 - 2006552090));
                                        }
                                        --var5_3;
                                        continue;
                                    }
                                    (Integer.rotateRight(406596022 ^ var3_4, 6) - -207180731) * 406596023;
                                    var4_5 = var3_4 - 35550047 + 392716364 - 392716364;
                                    Integer.rotateRight(-1011642005 ^ var3_4, 11) + -1222886608;
                                    try {
                                        var5_3 -= 4;
                                        var4_5 = (int)((long)(var3_4 - 2006552090) ^ -1814675188600381203L ^ -1814675188600381203L);
                                    }
                                    catch (IllegalArgumentException v2) {
                                        var4_5 = var3_4 - 2006552090 + -1980355212 - -1980355212;
                                    }
                                    var5_3 -= 2;
                                    continue;
                                }
                                (Integer.rotateLeft(-917604675 ^ var3_4, 12) - 1692270622) * -917604675;
                                (int)(863803273483971407L ^ (long)var3_4 ^ 5508046492733651496L);
                                var4_5 = Integer.reverse(Integer.reverse(var3_4 - 2006552090));
                                Integer.rotateLeft(-1570327959 ^ var3_4, 7) + -1362281998;
                                (int)(6977232870474836815L ^ (long)var3_4 ^ -4190455304808731527L);
                                ++var5_3;
                                continue;
                            }
                            Integer.rotateLeft(279185444 ^ var3_4, 5) - 138058647;
                            try {
                                if ((-7257532916344075345L ^ (long)var3_4 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                var4_5 = (int)((long)(var3_4 - 2006552090) ^ -5745519912473027288L ^ -5745519912473027288L);
                            }
                            catch (IllegalStateException v3) {
                                var4_5 = (int)((long)(var3_4 - 2006552090) ^ -5820772279779401161L ^ -5820772279779401161L);
                            }
                            var5_3 += 2;
                            continue;
                        }
                        (Integer.rotateLeft(1759134421 ^ var3_4, 16) - -1228163322) * 1759134421;
                        (int)(-6167419207839061169L ^ (long)var3_4 ^ 2639253530098596096L);
                        var4_5 = var3_4 - 2006552090 ^ 1047124097 ^ 1047124097;
                        (Integer.rotateLeft(-1460266767 ^ var3_4, 8) + 2049614954) * -1460266767;
                        (int)(7657446254394534735L ^ (long)var3_4 ^ -8005004189191538344L);
                        --var5_3;
                        continue;
                    }
                    Integer.rotateRight(2135945359 ^ var3_4, 18) - 1863041164;
                    var4_5 = var3_4 - -804969780 + 739504851 - 739504851;
                    Integer.rotateLeft(1963432685 ^ var3_4, 17) - 810115566;
                    (int)(-5209199325358003377L ^ (long)var3_4 ^ -7723529212480929093L);
                    try {
                        ++var5_3;
                        var4_5 = var3_4 - 2006552090 ^ 446420437 ^ 446420437;
                    }
                    catch (ArithmeticException v4) {
                        var4_5 = (int)((long)(var3_4 - 2006552090) ^ -6390486537644137667L ^ -6390486537644137667L);
                    }
                    ++var5_3;
                    continue;
                }
                Integer.rotateRight(-1969915482 ^ var3_4, 4) - -864593323;
                try {
                    var5_3 += 5;
                    var4_5 = Integer.reverse(Integer.reverse(var3_4 - 2006552090));
                }
                catch (NoSuchElementException v5) {
                    var4_5 = var3_4 - 2006552090 + -1981741158 - -1981741158;
                }
                var5_3 += 4;
                continue;
            }
            Integer.rotateLeft(2117249996 ^ var3_4, 18) - 1283484911;
            var4_5 = var3_4 - -757126537 + 1865723749 - 1865723749;
            Integer.rotateRight(1423632674 ^ var3_4, 13) + 1256184409;
            var4_5 = var3_4 - 2006552090 ^ -426071132 ^ -426071132;
            var5_3 -= 5;
            continue;
lbl213:
            // 7 sources

            Integer.rotateLeft(-1442779987 ^ var3_4, 8) - -1703262162;
            (int)(7544165512709991247L ^ (long)var3_4 ^ 8669573431147723957L);
            var4_5 = var3_4 - 2006552090 + -1690312243 - -1690312243;
        }
    }

    private sj_2 khdhs_2(class_1657 class_16572) {
        try {
            int n = 1375792971;
            n = Integer.rotateLeft(n * 1077315317, 16) ^ 0x23925D39;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 7);
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0xD19DFA33;
            if ((n2 ^ n) != -778175949) {
                int cfr_ignored_0 = (0x839D1578 ^ n) + -1667724881;
            }
            if ((0x264 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return new sj_2(bqh.dghy(class_16572), bqh.tadh_3(class_16572).getString(), bqh.ashgh(class_16572), class_16572.method_17681(), class_16572.method_17682(), bqh.khtsh_2(Moondlc.getInstance().getFriendManager(), class_16572.method_5477().getString()));
    }

    private void dhsa(shw_3 shw2) {
        int n = -1145762443;
        n = Integer.rotateLeft(n * -363099077, 8) ^ 0x8472B72;
        n = System.identityHashCode(this) ^ n;
        shw_3 shw3 = shw2;
        n = (shw3 != null ? System.identityHashCode(shw3) : 0) ^ n;
        int n2 = n ^ 0x49F45CDC;
        if ((n2 ^ n) != 1240751324) {
            int cfr_ignored_0 = (0xF24151A9 ^ n) + 109998046;
        }
        if (this.dhhj.isEmpty()) {
            return;
        }
        for (bjh bjh2 : this.dhhj.values()) {
            this.stdh(shw2.ssha_2(), bjh2, shw2.skz_4());
        }
    }

    private void shtw(ya_2 ya2) {
        int n = dh.skhz(1845037272);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 20);
        ya_2 ya3 = ya2;
        n = Integer.rotateRight((ya3 != null ? System.identityHashCode(ya3) : 0) ^ n, 5);
        int n2 = n ^ 0xC11D8869;
        if ((n2 ^ n) != -1055029143) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xACE480B1 ^ n, 8) + -200723286) * -1394310991;
            int cfr_ignored_1 = (int)(0x6E562E8C27D4EB4FL ^ (long)n ^ 0xA068831A2DB9717DL);
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (bqh.mc.field_1687 == null) {
            this.dhhj.clear();
            return;
        }
        long l = (long)(this.rkz.thw_5() * Float.intBitsToFloat(0x220C07A9 ^ 0x667607A9));
        Iterator iterator = this.dhhj.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            bjh bjh2 = (bjh)entry.getValue();
            if (System.currentTimeMillis() - bjh2.htdh <= l && bqh.mc.field_1687.method_18470((UUID)entry.getKey()) == null) continue;
            iterator.remove();
        }
        for (bjh bjh2 : bqh.mc.field_1687.method_18456()) {
            if (bjh2 == bqh.mc.field_1724) continue;
            this.rlgh.put(bjh2.method_5667(), this.khdhs_2((class_1657)bjh2));
        }
    }

    private void stt_4(bksh bksh2) {
        class_7828 class_78282;
        block6: {
            block5: {
                Object object;
                int n = -483136528;
                n = Integer.rotateLeft(n * 1164097967, 19) ^ 0xD6E5F12E;
                n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 21);
                bksh bksh3 = bksh2;
                n = Integer.rotateLeft((bksh3 != null ? System.identityHashCode(bksh3) : 0) ^ n, 13);
                int n2 = n ^ 0x879CBD93;
                if ((n2 ^ n) != -2019770989) {
                    int cfr_ignored_0 = (0x64AF5663 ^ n) + 932676388;
                }
                if (!((object = bksh2.asw()) instanceof class_7828)) break block5;
                class_78282 = (class_7828)object;
                if (bqh.mc.field_1687 != null && bqh.mc.field_1724 != null) break block6;
            }
            return;
        }
        for (UUID uUID : class_78282.comp_1105()) {
            class_1657 class_16572 = bqh.mc.field_1687.method_18470(uUID);
            sj_2 sj2_2 = class_16572 != null ? this.khdhs_2(class_16572) : (sj_2)this.rlgh.get(uUID);
            if (sj2_2 == null || bqh.mc.field_1724 != null && uUID.equals(bqh.mc.field_1724.method_5667()) || sj2_2.srz_2 && !this.tad.shzl()) continue;
            this.dhhj.put(uUID, new bjh(uUID, sj2_2.rrth, sj2_2.thnkh, sj2_2.qb, sj2_2.khdgh_2, sj2_2.srz_2, System.currentTimeMillis()));
        }
    }

    private static String dhzm(String string, int n, int n2, int n3) {
        int n4 = dh.skhz(1324386945);
        n4 = n2 ^ n4;
        int n5 = (n4 = n3 ^ n4) ^ 0x11804A5F;
        if ((n5 ^ n4) != 293620319) {
            int cfr_ignored_0 = (Integer.rotateRight(0x5F70C0DE ^ n4, 14) - -1828390371) * 1601224927;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xBA44198C ^ n2 ^ i * 1848261651 ^ hqdh, 18) ^ sskh_2));
        }
        return new String(cArray);
    }

    private static class_4588 bkhh_2(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3) {
        block0: {
            int n = -822827096;
            n = Integer.rotateLeft(n * 1894146447, 12) ^ 0xAD72D549;
            class_287 class_2873 = class_2872;
            n = Integer.rotateRight((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n, 4);
            Matrix4f matrix4f2 = matrix4f;
            n = (matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n;
            int n2 = n ^ 0x38F7C32A;
            if ((n2 ^ n) == 955761450) break block0;
            int cfr_ignored_0 = (0xF6036482 ^ n) + 546706057;
        }
        return class_2872.method_22918(matrix4f, f, f2, f3);
    }

    private static void sta_3() {
        int n = 844426929;
        int n2 = (n = Integer.rotateLeft(n * 177773181, 17) ^ 0xFCFFE0EB) ^ 0x3777A14C;
        if ((n2 ^ n) != 930586956) {
            int cfr_ignored_0 = (0x5234FFD ^ n) - 1646073622;
        }
        yf.athz_2();
    }

    private static UUID dghy(class_1657 class_16572) {
        block0: {
            int n = 634510080;
            int n2 = (n = Integer.rotateLeft(n * -1116334491, 12) ^ 0xC18377F3) ^ 0xA770452F;
            if ((n2 ^ n) == -1485814481) break block0;
            int cfr_ignored_0 = (0x82A19E2F ^ n) - -1250133252;
        }
        return class_16572.method_5667();
    }

    private static class_2561 tadh_3(class_1657 class_16572) {
        block0: {
            int n = 571456025;
            n = Integer.rotateLeft(n * -1887214045, 3) ^ 0xA1BB8D0A;
            class_1657 class_16573 = class_16572;
            n = Integer.rotateLeft((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 14);
            int n2 = n ^ 0xA8D9B244;
            if ((n2 ^ n) == -1462128060) break block0;
            int cfr_ignored_0 = (0x8AD6085D ^ n) + 1703430962;
        }
        return class_16572.method_5477();
    }

    private static class_243 ashgh(class_1657 class_16572) {
        block0: {
            int n = 1792487975;
            n = Integer.rotateLeft(n * -571274769, 23) ^ 0x2573BEA4;
            class_1657 class_16573 = class_16572;
            n = Integer.rotateLeft((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 29);
            int n2 = n ^ 0x2FFE4D3;
            if ((n2 ^ n) == 50324691) break block0;
            int cfr_ignored_0 = (0x6828D6F4 ^ n) - 2050070655;
        }
        return class_16572.method_19538();
    }

    private static boolean khtsh_2(kh_3 kh2, String string) {
        block0: {
            int n = -1622497614;
            n = Integer.rotateLeft(n * 1742715003, 5) ^ 0x813D1408;
            kh_3 kh3 = kh2;
            n = (kh3 != null ? System.identityHashCode(kh3) : 0) ^ n;
            int n2 = n ^ 0xB26C5DB0;
            if ((n2 ^ n) == -1301520976) break block0;
            int cfr_ignored_0 = (0x2D26FB02 ^ n) - -1447071755;
        }
        return kh2.adhj(string);
    }

    private static String[] zyb_2(String string) {
        int n = 201917430;
        int n2 = (n = Integer.rotateLeft(n * -1146495293, 16) ^ 0x3A8792C4) ^ 0x4D63F047;
        if ((n2 ^ n) != 1298395207) {
            int cfr_ignored_0 = (0x416AF3B1 ^ n) - -724003609;
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

    private static CallSite ghkhz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -975186824;
            n3 = Integer.rotateLeft(n3 * 19375311, 24) ^ 0x76A7EEC1;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 16);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xAFF1B67B;
            if ((n4 ^ n3) != -1343113605) {
                int cfr_ignored_0 = (0x6A2E6203 ^ n3) + 1484873607;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ hqa ^ string.hashCode() ^ n2 + bkhs_2 + i * -1268247761) + hqa) ^ bkhs_2));
            }
            String[] stringArray = bqh.zyb_2(new String(cArray));
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

    private static String[] hb65bulr0(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite txzykmbk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ l40983o03pq1 ^ string.hashCode() ^ n2 + i8j0e4zkfjall ^ i * -1928156819 ^ l40983o03pq1, 9) ^ i8j0e4zkfjall));
            }
            String[] stringArray = bqh.hb65bulr0(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

