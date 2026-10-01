/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1297
 *  net.minecraft.class_1684
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587
 *  net.minecraft.class_7833
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1684;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bgha_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tzd;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Pearl Particles", category=bzw.OTHER, desc="Creates a particle trail behind ender pearls")
public class bthh_2
extends bnq {
    private final bzw_2 hsdh = new bzw_2(this, "Color").dhshy(new byq(Float.intBitsToFloat(Integer.rotateLeft(0xE9070793 ^ 0xE945F793, 8)), Float.intBitsToFloat(0x8056F78B ^ 0xC365F78B), Float.intBitsToFloat(Integer.reverse(1713091625) ^ 0xD752D866), Float.intBitsToFloat(1803870312 + -671473768))).tqdh(false);
    private final tay dhsm = new tay(this, "Spawn Rate").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(-321712573 - -1414328765)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xD675B46B ^ 0xF6E5B46B, 1)));
    private final tay hbd = new tay(this, "Size").shth_7(Float.intBitsToFloat(Integer.reverse(1081792623) ^ 0xCB5792CF)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x5FBB0F98 ^ 0x5FB4CF98, 10))).rkh_3(Float.intBitsToFloat(0x3629F60B ^ 0xA0A2101)).ssd_5(Float.intBitsToFloat(Integer.reverse(-87536982) ^ 0x6BCB8AC5));
    private final tay hsgh = new tay(this, "Lifetime").shth_7(Float.intBitsToFloat(0x92E0C0FE ^ 0xADE0C0FE)).dhbs_2(Float.intBitsToFloat(1455950610 - 378014482)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x6C815750 ^ 0x8AE731CE, 25))).ssd_5(Float.intBitsToFloat(0x852F0EC ^ 0x3752F0EC));
    private final tay khhf_2 = new tay(this, "Spread").shth_7(Float.intBitsToFloat(-1500798085 + -1785187441)).dhbs_2(Float.intBitsToFloat(Integer.reverse(1277166926) ^ 0x4CECC8FF)).rkh_3(Float.intBitsToFloat(0xF4CD38B4 ^ 0xC8EEEFBE)).ssd_5(Float.intBitsToFloat(Integer.reverse(585717502) ^ 0x41265B89));
    private final tay rshr = new tay(this, "Gravity").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(-1345767618 - 1926460591)).rkh_3(Float.intBitsToFloat(0x3244AA38 ^ 0x8C7B857)).ssd_5(Float.intBitsToFloat(0x907549FE ^ 0xAC765B91));
    private final tay jty_2 = new tay(this, "Fade Speed").shth_7(Float.intBitsToFloat(Integer.reverse(-482221426) ^ 0x4FDE1B5D)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(0x5B59746A ^ 0x6695B8A7)).ssd_5(2.0f);
    private final badh_2 shqs_2 = new badh_2(this, "Color An".concat("imation")).bts(false);
    private final Map zwt = new HashMap();
    private final List thja = new ArrayList();
    private final class_2960 zqs = Moondlc.id("images/partic".concat("les/bloom.png"));
    private final bql<btt> zmm = this::aaw_2;
    private final bql<shw_3> zjs = this::jhk_2;
    private static final int snh_2 = -1867075831;
    private static final int thnm = 1067595100;
    private static final int dbk = 1539958020;
    private static final int hzh = 462723683;
    private static final int kdcebbhs97 = 1433366544;
    private static final int rm7xfu1 = 1849552086;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int bpsb78566q4ad;

    @Override
    public void nt() {
        int n = tzd.zqkh_2(-553927252);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x9784EDC4;
        if ((n2 ^ n) != -1752896060) {
            int cfr_ignored_0 = Integer.rotateLeft(0x497F5068 ^ n, 12) + -355968045;
        }
        this.zwt.clear();
        this.thja.clear();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void nc() {
        var3_1 = 0;
        var1_2 = 731231694;
        var1_2 = Integer.rotateLeft(var1_2 * 235599667, 19) ^ 1667374228;
        var1_2 = System.identityHashCode(this) ^ var1_2;
        var2_3 = (var1_2 ^ -517601086 ^ 847046282) + 847046282 + -507535911 - -507535911;
        while (true) {
            block31: {
                block24: {
                    block26: {
                        block25: {
                            block29: {
                                block23: {
                                    block30: {
                                        block27: {
                                            block33: {
                                                block22: {
                                                    block28: {
                                                        block32: {
                                                            var3_1 = var2_3 - 847046282 ^ 847046282 ^ var1_2;
                                                            switch (var3_1 & 7) {
                                                                case 0: {
                                                                    if (var3_1 == -1254677936) break block22;
                                                                    if (var3_1 == 239784336) break block23;
                                                                    (Integer.rotateRight(-396329125 ^ var1_2, 16) + 671943488) * -396329125;
                                                                    if (var3_1 != 1529287440) {
                                                                        ** break;
                                                                    }
                                                                    break block24;
                                                                }
                                                                case 1: {
                                                                    if (var3_1 == 925446673) break block25;
                                                                    if (var3_1 == -613770759) break block26;
                                                                    Integer.rotateLeft(-814378651 ^ var1_2, 12) - 597310070;
                                                                    (int)(992831890716420943L ^ (long)var1_2 ^ -8953011910753012129L);
                                                                    if (var3_1 != 2124709841) {
                                                                        ** break;
                                                                    }
                                                                    break block27;
                                                                }
                                                                case 2: {
                                                                    if (var3_1 != 785447282) {
                                                                        if (var3_1 == -517601086) break;
                                                                        Integer.rotateRight(-977984409 ^ var1_2, 11) - -179501132;
                                                                        ** break;
                                                                    }
                                                                    break block28;
                                                                }
                                                                case 3: {
                                                                    if (var3_1 != 87656611) {
                                                                        ** break;
                                                                    }
                                                                    break block29;
                                                                }
                                                                case 4: {
                                                                    if (var3_1 != 434857764) {
                                                                        ** break;
                                                                    }
                                                                    break block30;
                                                                }
                                                                case 6: {
                                                                    if (var3_1 == 1424796974) break block31;
                                                                    if (var3_1 == -675486882) break block32;
                                                                    Integer.rotateRight(280144994 ^ var1_2, 5) + 167804697;
                                                                    if (var3_1 != 1900758222) {
                                                                        ** break;
                                                                    }
                                                                    break block33;
                                                                }
                                                            }
                                                            (Integer.rotateLeft(-148383715 ^ var1_2, 17) - -231683394) * -148383715;
                                                            (int)(3861122136019364687L ^ (long)var1_2 ^ 1238634045986424571L);
                                                            if (!yf.khdha_2()) {
                                                                var2_3 = (var1_2 ^ 51960849 ^ 847046282) + 847046282;
                                                                Integer.rotateLeft(-1974319775 ^ var1_2, 4) + -1001126406;
                                                                (int)(5251455946551782223L ^ (long)var1_2 ^ 3154915687432535056L);
                                                                var2_3 = (var1_2 ^ -675486882 ^ 847046282) + 847046282 + 201217129 - 201217129;
                                                                var3_1 += 4;
                                                                continue;
                                                            }
                                                            try {
                                                                --var3_1;
                                                                if ((1699262104382995835L ^ (long)var1_2 | 1L) == 0L) {
                                                                    throw new IllegalArgumentException();
                                                                }
                                                                var2_3 = (var1_2 ^ 785447282 ^ 847046282) + 847046282 ^ -113951632 ^ -113951632;
                                                            }
                                                            catch (IllegalArgumentException v0) {
                                                                var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ 785447282 ^ 847046282) + 847046282));
                                                            }
                                                            var3_1 -= 2;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(370136196 ^ var1_2, 5) - -1337435337;
                                                        bthh_2.dhdm_2();
                                                        throw null;
                                                    }
                                                    Integer.rotateLeft(-1958213655 ^ var1_2, 4) + -501836686;
                                                    (int)(5330759837612829519L ^ (long)var1_2 ^ -5847779967681085916L);
                                                    this.zwt.clear();
                                                    this.thja.clear();
                                                    return;
                                                }
                                                (Integer.rotateLeft(736395325 ^ var1_2, 8) - 1426663070) * 736395325;
                                                (int)(-1633067236672083121L ^ (long)var1_2 ^ -6813802087752106115L);
                                                var2_3 = (var1_2 ^ -1613419745 ^ 847046282) + 847046282 ^ -608202153 ^ -608202153;
                                                Integer.rotateLeft(1995976200 ^ var1_2, 17) + 1818964531;
                                                (int)(-1844091373012829277L ^ (long)var1_2 ^ 875273762723881217L);
                                                var2_3 = (var1_2 ^ -517601086 ^ 847046282) + 847046282 + 1334337337 - 1334337337;
                                                ++var3_1;
                                                continue;
                                            }
                                            (Integer.rotateLeft(1463819609 ^ var1_2, 13) + -1792987902) * 1463819609;
                                            (int)(-7641848374947943601L ^ (long)var1_2 ^ -7225881453656504780L);
                                            var2_3 = (var1_2 ^ 327989559 ^ 847046282) + 847046282 + -534569485 - -534569485;
                                            (Integer.rotateLeft(-15629232 ^ var1_2, 18) + -411261717) * -15629231;
                                            (int)(8853033829222316764L ^ (long)var1_2 ^ 7766934934670760041L);
                                            var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -517601086 ^ 847046282) + 847046282));
                                            var3_1 += 2;
                                            continue;
                                        }
                                        Integer.rotateLeft(1852945060 ^ var1_2, 16) - 1679966487;
                                        var2_3 = (var1_2 ^ -976553950 ^ 847046282) + 847046282 ^ -444640886 ^ -444640886;
                                        Integer.rotateRight(1587937411 ^ var1_2, 14) + 2054663960;
                                        var2_3 = (int)((long)((var1_2 ^ -517601086 ^ 847046282) + 847046282) ^ -3722461597452021341L ^ -3722461597452021341L);
                                        var3_1 += 5;
                                        continue;
                                    }
                                    (Integer.rotateRight(-1038040042 ^ var1_2, 11) - -2041225755) * -1038040041;
                                    var2_3 = (var1_2 ^ 1265017175 ^ 847046282) + 847046282;
                                    Integer.rotateRight(-32537530 ^ var1_2, 18) - -935418955;
                                    (int)(7443785486835656391L ^ (long)var1_2 ^ -4927797072932281526L);
                                    var2_3 = (var1_2 ^ -517601086 ^ 847046282) + 847046282 ^ -1073623182 ^ -1073623182;
                                    continue;
                                }
                                Integer.rotateRight(230442050 ^ var1_2, 4) + -1372986567;
                                var2_3 = (int)((long)((var1_2 ^ -517601086 ^ 847046282) + 847046282) ^ -4596410630939012916L ^ -4596410630939012916L);
                                var3_1 += 3;
                                continue;
                            }
                            (Integer.rotateLeft(45294333 ^ var1_2, 3) - 1477368798) * 45294333;
                            (int)(-4611249786520802481L ^ (long)var1_2 ^ -1949914490191991342L);
                            try {
                                if ((-294937982585854229L ^ (long)var1_2 | 1L) == 0L) {
                                    throw new IllegalArgumentException();
                                }
                                var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -517601086 ^ 847046282) + 847046282));
                            }
                            catch (IllegalArgumentException v1) {
                                var2_3 = (int)((long)((var1_2 ^ -517601086 ^ 847046282) + 847046282) ^ -3730700543678926858L ^ -3730700543678926858L);
                            }
                            var3_1 -= 4;
                            continue;
                        }
                        (Integer.rotateRight(103417654 ^ var1_2, 3) - -1015775547) * 103417655;
                        var2_3 = (var1_2 ^ -106202992 ^ 847046282) + 847046282 + 1523217166 - 1523217166;
                        Integer.rotateLeft(1652954400 ^ var1_2, 15) + -224776677;
                        var2_3 = (var1_2 ^ -517601086 ^ 847046282) + 847046282 + 869400412 - 869400412;
                        var3_1 += 2;
                        continue;
                    }
                    (Integer.rotateLeft(-656834928 ^ var1_2, 14) + 1186198187) * -656834927;
                    var2_3 = (var1_2 ^ -517601086 ^ 847046282) + 847046282;
                    continue;
                }
                Integer.rotateLeft(1840359712 ^ var1_2, 16) + 1289820699;
                var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ 1744369868 ^ 847046282) + 847046282));
                (Integer.rotateLeft(1642250037 ^ var1_2, 15) - -556611930) * 1642250037;
                (int)(-6678819520664769713L ^ (long)var1_2 ^ -2350734857027916943L);
                (int)(-2422421045861456166L ^ (long)var1_2 ^ 6105101317017047314L);
                var2_3 = (int)((long)((var1_2 ^ -1236774438 ^ 847046282) + 847046282) ^ 4620064199815521142L ^ 4620064199815521142L);
                (int)(4557798499607940000L ^ (long)var1_2 ^ -1847512330533350576L);
                var2_3 = (var1_2 ^ -517601086 ^ 847046282) + 847046282 ^ 677013464 ^ 677013464;
                var3_1 += 2;
                continue;
            }
            (Integer.rotateRight(-1436659629 ^ var1_2, 8) + -1513531064) * -1436659629;
            var2_3 = (var1_2 ^ -2141302315 ^ 847046282) + 847046282 + -1994431729 - -1994431729;
            (Integer.rotateLeft(173215061 ^ var1_2, 4) - 1147944070) * 173215061;
            (int)(-3971713728623875249L ^ (long)var1_2 ^ -4926793843883885550L);
            var2_3 = (var1_2 ^ -517601086 ^ 847046282) + 847046282 + 1251595860 - 1251595860;
            var3_1 -= 3;
            continue;
lbl192:
            // 7 sources

            Integer.rotateLeft(678973736 ^ var1_2, 8) + -353406189;
            var2_3 = (var1_2 ^ -517601086 ^ 847046282) + 847046282 ^ -2042416921 ^ -2042416921;
        }
    }

    private void ads() {
        if (bthh_2.mc.field_1724 == null || bthh_2.mc.field_1687 == null) {
            this.zwt.clear();
            this.thja.clear();
            return;
        }
        this.zwt.entrySet().removeIf(bthh_2::ttn);
        for (class_1297 class_12972 : bthh_2.mc.field_1687.method_18112()) {
            if (!(class_12972 instanceof class_1684)) continue;
            class_1684 class_16842 = (class_1684)class_12972;
            class_243 class_2432 = class_16842.method_19538();
            if (this.zwt.containsKey(class_16842.method_5628())) {
                this.r_2(class_2432);
            }
            this.zwt.put(class_16842.method_5628(), class_2432);
        }
        Iterator<Object> iterator = this.thja.iterator();
        while (iterator.hasNext()) {
            if (!((bgha_2)iterator.next()).tkhk()) continue;
            iterator.remove();
        }
    }

    private void r_2(class_243 class_2432) {
        try {
            int n = 58817318;
            n = Integer.rotateLeft(n * 1154819443, 12) ^ 0xAF9BEC80;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 2);
            class_243 class_2433 = class_2432;
            n = Integer.rotateLeft((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 14);
            int n2 = n ^ 0xD26044D1;
            if ((n2 ^ n) != -765442863) {
                int cfr_ignored_0 = (0xD1E13FF7 ^ n) - 1624591844;
            }
            if ((0x174 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            bthh_2.dhl_4();
        }
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        int n = Math.round(this.dhsm.thw_5());
        float f = this.khhf_2.thw_5();
        float f2 = this.rshr.thw_5();
        for (int i = 0; i < n; ++i) {
            this.thja.add(new bgha_2(this, class_2432, threadLocalRandom.nextFloat(-f, f), threadLocalRandom.nextFloat(-f * Float.intBitsToFloat(638552997 - -410023003), f * Float.intBitsToFloat(Integer.reverse(465265870) ^ 0x4DA6DDD8)), threadLocalRandom.nextFloat(-f, f), f2, this.thja.size()));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void htm_2(shw_3 shw2) {
        if (this.thja.isEmpty()) {
            return;
        }
        class_243 class_2432 = bthh_2.mc.field_1773.method_19418().method_19326();
        float f = shw2.skz_4();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableCull();
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)this.zqs);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        try {
            for (bgha_2 bgha2_2 : this.thja) {
                this.rdhk(shw2.ssha_2(), bgha2_2, class_2432, f);
            }
        }
        finally {
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            RenderSystem.setShaderTexture((int)0, (int)0);
            RenderSystem.depthMask((boolean)true);
            RenderSystem.defaultBlendFunc();
            RenderSystem.enableDepthTest();
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
        }
    }

    private void rdhk(class_4587 class_45872, bgha_2 bgha2_2, class_243 class_2432, float f) {
        double d = this.shdr(bgha2_2.hhj, bgha2_2.tqw, f) - class_2432.field_1352;
        double d2 = this.shdr(bgha2_2.khat_2, bgha2_2.thzdh_2, f) - class_2432.field_1351;
        double d3 = this.shdr(bgha2_2.khzl, bgha2_2.jshz_2, f) - class_2432.field_1350;
        float f2 = bgha2_2.tly_2();
        float f3 = (float)Math.pow(Math.max(0.0, 1.0 - (double)f2), this.jty_2.thw_5());
        if (f3 <= 0.001f) {
            return;
        }
        Color color = this.dshw_2(bgha2_2.shtm, f3);
        float f4 = this.hbd.thw_5();
        float f5 = f4 / 2.0f;
        class_45872.method_22903();
        class_45872.method_22904(d, d2, d3);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-bthh_2.mc.field_1773.method_19418().method_19330()));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(bthh_2.mc.field_1773.method_19418().method_19329()));
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, -f5, f5, 0.0f).method_22913(0.0f, 1.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        class_2872.method_22918(matrix4f, f5, f5, 0.0f).method_22913(1.0f, 1.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        class_2872.method_22918(matrix4f, f5, -f5, 0.0f).method_22913(1.0f, 0.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        class_2872.method_22918(matrix4f, -f5, -f5, 0.0f).method_22913(0.0f, 0.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        class_286.method_43433((class_9801)class_2872.method_60800());
        class_45872.method_22909();
    }

    private Color dshw_2(int n, float f) {
        Color color;
        int n2 = 951234965;
        n2 = Integer.rotateLeft(n2 * 1559039351, 17) ^ 0x321736B9;
        int n3 = (n2 = n ^ n2) ^ 0x12D5375;
        if ((n3 ^ n2) != 19747701) {
            int cfr_ignored_0 = (0x399FE2E0 ^ n2) - -1049324544;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        if (this.shqs_2.shzl()) {
            color = Color.getHSBColor((float)((bthh_2.dhngh() / (0x7ACFA9E368BF5185L ^ 0x7ACFA9E368BF5189L) + (long)n * (0xDC4665D014BA8544L ^ 0xDC4665D014BA8554L)) % (0x1DA326E6BCA40131L ^ 0x1DA326E6BCA40059L)) / bthh_2.zaz_6(Integer.reverse(1252906086) ^ 0x259FB552), Float.intBitsToFloat(bthh_2.nb(0x19CC5E6E ^ 0x7FABB808, 11)), 1.0f);
        } else {
            byq byq2 = this.hsdh.sdsh_4();
            color = new Color(Math.round(byq2.sbk()), bthh_2.dhaq_2(byq2.srl()), Math.round(byq2.shsl_2()), Math.round(bthh_2.khar(byq2)));
        }
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.max(0, Math.min(0xEAA5ABC3 ^ 0xEAA5AB3C, Math.round((float)color.getAlpha() * f))));
    }

    private double shdr(double d, double d2, float f) {
        try {
            int n = 168112665;
            n = Integer.rotateLeft(n * 1758407217, 5) ^ 0x48278272;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 3);
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 24);
            int n2 = n ^ 0x5F29C0AB;
            if ((n2 ^ n) != 1596571819) {
                int cfr_ignored_0 = (0x552CF2B2 ^ n) - 659535882;
            }
            if ((0x294 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return d + (d2 - d) * (double)f;
    }

    private static boolean ttn(Map.Entry entry) {
        return !(bthh_2.mc.field_1687.method_8469(((Integer)entry.getKey()).intValue()) instanceof class_1684);
    }

    private void jhk_2(shw_3 shw2) {
        int n = tzd.zqkh_2(-1594356604);
        n = System.identityHashCode(this) ^ n;
        shw_3 shw3 = shw2;
        n = (shw3 != null ? System.identityHashCode(shw3) : 0) ^ n;
        int n2 = n ^ 0xEC0A38D7;
        if ((n2 ^ n) != -334874409) {
            int cfr_ignored_0 = (Integer.rotateRight(0x4CF23453 ^ n, 12) + 1437726024) * 1290941523;
        }
        this.htm_2(shw2);
    }

    private void aaw_2(btt btt2) {
        int n = 773983265;
        n = Integer.rotateLeft(n * 2108885637, 27) ^ 0x2D952339;
        n = System.identityHashCode(this) ^ n;
        btt btt3 = btt2;
        n = Integer.rotateRight((btt3 != null ? System.identityHashCode(btt3) : 0) ^ n, 12);
        int n2 = n ^ 0x22F35563;
        if ((n2 ^ n) != 586372451) {
            int cfr_ignored_0 = (0xCD15942 ^ n) + -675141332;
        }
        this.ads();
    }

    private static String khyth(String string, int n, int n2, int n3) {
        int n4 = tzd.zqkh_2(-1224719898);
        n4 = Integer.rotateLeft(n ^ n4, 12);
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 21)) ^ 0x216C8F99;
        if ((n5 ^ n4) != 560762777) {
            int cfr_ignored_0 = (Integer.rotateRight(0x966CCE7F ^ n4, 5) - 998940828) * -1771254145;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xD725C0E7 ^ n2 - i) + thnm, 12) ^ snh_2 + i * -348497277));
        }
        return new String(cArray);
    }

    private static void dhdm_2() {
        int n = 725998144;
        int n2 = (n = Integer.rotateLeft(n * 1984681837, 18) ^ 0x66275F7D) ^ 0xB9C1D7CA;
        if ((n2 ^ n) != -1178478646) {
            int cfr_ignored_0 = (0x92840D8A ^ n) + -439796560;
        }
        yf.athz_2();
    }

    private static void dhl_4() {
        int n = -172704432;
        int n2 = (n = Integer.rotateLeft(n * -1165551495, 19) ^ 0x2EF6BEA) ^ 0x49F077EA;
        if ((n2 ^ n) != 1240496106) {
            int cfr_ignored_0 = (0xBC44CABA ^ n) + 1502749915;
        }
        yf.athz_2();
    }

    private static long dhngh() {
        block0: {
            int n = -1435127469;
            int n2 = (n = Integer.rotateLeft(n * -1581617387, 13) ^ 0x5E9ACAA0) ^ 0x3963F1A2;
            if ((n2 ^ n) == 962851234) break block0;
            int cfr_ignored_0 = (0x931640F1 ^ n) - -2138621302;
        }
        return System.currentTimeMillis();
    }

    private static float zaz_6(int n) {
        block0: {
            int n2 = 2082646315;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1835178985, 22) ^ 0xC73CF604) ^ 0x5298F94E;
            if ((n3 ^ n2) == 1385757006) break block0;
            int cfr_ignored_0 = (0x2EBA5065 ^ n2) + 1061408072;
        }
        return Float.intBitsToFloat(n);
    }

    private static int nb(int n, int n2) {
        block0: {
            int n3 = tzd.zqkh_2(679017021);
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0x4A963F84;
            if ((n4 ^ n3) == 1251360644) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x62EEC5B9 ^ n3, 15) + -12087134) * 1659815353;
            int cfr_ignored_1 = (int)(0xA05C6B8427D4EB4FL ^ (long)n3 ^ 0x2A78831A2DB8ED69L);
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int dhaq_2(float f) {
        block0: {
            int n = tzd.zqkh_2(-1060635123);
            int n2 = n ^ 0x2A57BFEE;
            if ((n2 ^ n) == 710393838) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xEA9041E3 ^ n, 16) + 1809160632;
        }
        return Math.round(f);
    }

    private static float khar(byq byq2) {
        block0: {
            int n = 868691415;
            n = Integer.rotateLeft(n * -1722191919, 8) ^ 0xA42B9415;
            byq byq3 = byq2;
            n = (byq3 != null ? System.identityHashCode(byq3) : 0) ^ n;
            int n2 = n ^ 0x129E39D0;
            if ((n2 ^ n) == 312359376) break block0;
            int cfr_ignored_0 = (0x21591407 ^ n) + 2060150569;
        }
        return byq2.tzdh_2();
    }

    private static String[] sds(String string) {
        block0: {
            int n = 404622781;
            n = Integer.rotateLeft(n * -2026667921, 27) ^ 0xD9672A47;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 17);
            int n2 = n ^ 0xA9BAE554;
            if ((n2 ^ n) == -1447369388) break block0;
            int cfr_ignored_0 = (0xB1A4E8E9 ^ n) + -2077875487;
        }
        return string.split("\u0005\u001b", -1);
    }

    private static CallSite jbsh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 613237087;
            n3 = Integer.rotateLeft(n3 * -963812267, 12) ^ 0x804AFC5D;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x3AF38C72;
            if ((n4 ^ n3) != 989039730) {
                int cfr_ignored_0 = (0x1E7ECD2D ^ n3) + 631346359;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dbk ^ string.hashCode() ^ n2 + hzh ^ i * 1344077033 ^ dbk, 19) ^ hzh));
            }
            String[] stringArray = bthh_2.sds(new String(cArray));
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

    private static String[] jjk1iy4wx3xhx(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ip8mdu12mej8c(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ kdcebbhs97 ^ string.hashCode() ^ n2 + rm7xfu1 ^ i * -1180383233 ^ kdcebbhs97, 3) ^ rm7xfu1));
            }
            String[] stringArray = bthh_2.jjk1iy4wx3xhx(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

