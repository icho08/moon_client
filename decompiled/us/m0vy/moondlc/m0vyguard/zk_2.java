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
 *  net.minecraft.class_1309
 *  net.minecraft.class_238
 *  net.minecraft.class_239
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_3966
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_746
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
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_3966;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_746;
import net.minecraft.class_7833;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bthy;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzq_2;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byz;
import us.m0vy.moondlc.m0vyguard.bys;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tdz;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.ny;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Hit Bubbles", category=bzw.OTHER, desc="Shows a configurable glass bubble at the point of impact")
public final class zk_2
extends bnq {
    private static final class_2960 tdhw;
    private static final int sql = 64;
    private static final int thay_2 = 64;
    private static final long hs = 65L;
    private static final bzq_2[] zds_4;
    private final khd jfz = new khd(this, "Color Mode");
    private final fy jmgh = new fy(this.jfz, "Client");
    private final fy dhwh = new fy(this.jfz, "Rainbow");
    private final fy tdz_4 = new fy(this.jfz, "Picker");
    private final fy dhqt_2 = new fy(this.jfz, "Double Picker");
    private final bzw_2 ddm = new bzw_2(this, "Primary Color", this::day_3).dhshy(new byq(Float.intBitsToFloat(2022465457 + -902062001), Float.intBitsToFloat(Integer.reverse(245725754) ^ 0x1F21A570), Float.intBitsToFloat(0xA28FAA9D ^ 0xE047AA9D), Float.intBitsToFloat(Integer.rotateLeft(0xF890B07E ^ 0x690B0F8, 23))));
    private final bzw_2 zdf = new bzw_2(this, "Secondar".concat("y Color"), this::dhdt).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-241489814) ^ 0x1464D98F), Float.intBitsToFloat(Integer.rotateLeft(0x3F841A5B ^ 0x3F8609DB, 13)), Float.intBitsToFloat(Integer.rotateLeft(0x1AFAE84F ^ 0x1AFBE5B3, 14)), Float.intBitsToFloat(-249026224 + 1381422768)));
    private final tay sqkh = new tay(this, "Opacity").shth_7(Float.intBitsToFloat(0xD7C4B50C ^ 0xEA0879C1)).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(-143519125 - -1171962466)).ssd_5(1.0f);
    private final tay sjb_2 = new tay(this, "Life Time").shth_7(Float.intBitsToFloat(Integer.rotateLeft(0xF2368FA9 ^ 0xCB68FB9, 26))).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1684518846) ^ 0x7A999D9)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x3E28A5C5 ^ 0x3F2185C5, 6))).ssd_5(Float.intBitsToFloat(-1246548440 + -1888939560)).ghshz_2("ms");
    private final tay thfs_2 = new tay(this, "Spawn Du".concat("ration")).shth_7(Float.intBitsToFloat(579504697 - -532510151)).dhbs_2(Float.intBitsToFloat(0x9370FD20 ^ 0xD74B7D20)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xFB117407 ^ 0x89117417, 26))).ssd_5(Float.intBitsToFloat(354611763 + 777457101)).ghshz_2("ms");
    private final tay khzj_2 = new tay(this, "Shatter Duration").shth_7(Float.intBitsToFloat(0xC4C945D4 ^ 0x87DF45D4)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x279E8339 ^ 0xFB9E811C, 21))).rkh_3(Float.intBitsToFloat(1870563963 - 758549115)).ssd_5(Float.intBitsToFloat(2127560492 - 984448812)).ghshz_2("ms");
    private final tay dhdh_6 = new tay(this, "Size").shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x2DCF1D27 ^ 0x1EFC5AF4, 19))).dhbs_2(Float.intBitsToFloat(1006556682 + 69282294)).rkh_3(Float.intBitsToFloat(Integer.reverse(-1375588970) ^ 0x54F88CB8)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xBFA1C9A9 ^ 0xBFA1CE5D, 19)));
    private final tay jzd = new tay(this, "Surface".concat(" Offset")).shth_7(0.0f).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(-1206743420 - 2059780535)).ssd_5(Float.intBitsToFloat(-2110340205 - 1136051091));
    private final tay slt = new tay(this, "Rotation Speed").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(-736554724) ^ 0x7CBC982B)).rkh_3(Float.intBitsToFloat(-1404495298 + -1789467198)).ssd_5(Float.intBitsToFloat(0xF1524B70 ^ 0xB29A4B70)).ghshz_2("deg/s");
    private final badh_2 szw_2 = new badh_2(this, "Glass Ani".concat("mation")).bts(true);
    private final tay ghf = new tay((hy)this, "Glass Pieces", this::tthsh).shth_7(Float.intBitsToFloat(-11129349 + 1093259781)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xCACD5978 ^ 0xCACD79D8, 17))).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(0xC10F0B64 ^ 0x81EF0B64));
    private final tay wd = new tay((hy)this, "Scatter Distance", this::tthd_3).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x6ABD320C ^ 0xA66ED6C0, 12))).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(-710499541 + 1747331490)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x9216A28E ^ 0xF4703D28, 17)));
    private final badh_2 ttkh = new badh_2(this, "More E".concat("ffects")).bts(true);
    private final badh_2 bnn = new badh_2(this, "Throug".concat("h Walls")).bts(false);
    private final List dhthr = new ArrayList();
    private final Random dzy_2 = new Random(0x2F34962FA4B2EDE8L ^ 0x2F34962FA43B6BEBL);
    private boolean hkhkh;
    private long jyw;
    private int dws_2;
    private final bql<bthy> jnh = this::tngh_2;
    private final bql<shw_3> zkht_2 = this::tqz_4;
    private static final int thrm = 118087811;
    private static final int dtdh_2 = -189636108;
    private static final int tdq_2 = -383655932;
    private static final int sdw_3 = 1282333382;
    private static final int tu75jztqu = -557477802;
    private static final int d4wseaxkb = 36111270;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int acng1ujuyu;

    private class_243 khlsh(class_1309 class_13092) {
        double d;
        class_243 class_2432;
        class_3966 class_39662;
        int n = 1510616517;
        n = Integer.rotateLeft(n * -1132197419, 16) ^ 0x19974D7A;
        class_1309 class_13093 = class_13092;
        n = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 21);
        int n2 = n ^ 0xF3C4ABBC;
        if ((n2 ^ n) != -205214788) {
            int cfr_ignored_0 = (0xA9CE8679 ^ n) - -2121914036;
        }
        class_243 class_2433 = null;
        class_239 class_2392 = zk_2.mc.field_1765;
        if (class_2392 instanceof class_3966 && zk_2.ztkh_3(class_39662 = (class_3966)class_2392) == class_13092) {
            class_2433 = zk_2.khkz_2(class_39662);
        }
        class_39662 = zk_2.dthf_2(class_13092).method_1014((double)class_13092.method_5871() + Double.longBitsToDouble(0xF5DBD9AFAEA2383L ^ 0x30C9C77BBD4437F8L));
        if (class_2433 == null && (class_2433 = (class_243)class_39662.method_992((class_243)(class_2392 = zk_2.mc.field_1724.method_33571()), class_2392.method_1019((class_2432 = zk_2.shhs_2(this)).method_1021(d = Math.max(zk_2.bhsh(0x694B878627DDE1FFL ^ 0x2943878627DDE1FFL), class_2392.method_1022(class_39662.method_1005()) + 1.0)))).orElse(null)) == null) {
            class_2433 = class_39662.method_992((class_243)class_2392, class_39662.method_1005()).orElse(class_39662.method_1005());
        }
        if ((class_2392 = class_2433.method_1020(class_39662.method_1005())).method_1027() < zk_2.aaj_2(0xE4DF35112D8DCE4EL ^ 0xDA6FF3E68D3823C3L)) {
            class_2392 = zk_2.shath(zk_2.mc.field_1724).method_1020(zk_2.tjr_2((class_238)class_39662));
        }
        class_2392 = zk_2.smn((class_243)class_2392) < Double.longBitsToDouble(0xA931DA28DD117258L ^ 0x97811CDF7DA49FD5L) ? new class_243(0.0, 0.0, 1.0) : class_2392.method_1029();
        return zk_2.khtgh(class_2433, zk_2.zkhk_2((class_243)class_2392, zk_2.bzk(this.jzd)));
    }

    private class_243 dhath() {
        ny ny2 = Moondlc.getInstance().getRotationHandler();
        if (ny2 != null && !ny2.smf()) {
            lb lb2 = ny2.dhdf();
            return zk_2.sal_3(lb2.sry(), lb2.khdhd_2());
        }
        return zk_2.mc.field_1724.method_5828(1.0f);
    }

    private static class_243 sal_3(float f, float f2) {
        int n = -1086594244;
        n = Integer.rotateLeft(n * -1493634005, 9) ^ 0x10DD7C16;
        n = Float.floatToIntBits(f) ^ n;
        n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 12);
        int n2 = n ^ 0xE824793A;
        if ((n2 ^ n) != -400262854) {
            int cfr_ignored_0 = (0x571F9A06 ^ n) + -86232348;
        }
        float f3 = f2 * Float.intBitsToFloat(-1837155253 + -1441808918);
        float f4 = -f * Float.intBitsToFloat(Integer.reverse(-1823139384) ^ 0x2F1650FC);
        float f5 = class_3532.method_15362((float)f3);
        return new class_243((double)(zk_2.dsf_4(f4) * f5), (double)(-class_3532.method_15374((float)f3)), (double)(class_3532.method_15362((float)f4) * f5));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void tqz_4(shw_3 shw2) {
        byz byz2;
        if (this.dhthr.isEmpty() || zk_2.mc.field_1724 == null || zk_2.mc.field_1687 == null) {
            return;
        }
        this.jyw = System.currentTimeMillis();
        Iterator iterator = this.dhthr.iterator();
        while (iterator.hasNext()) {
            byz2 = (byz)iterator.next();
            if (byz2.bwh(this.jyw) >= byz2.jaz_2) {
                iterator.remove();
                continue;
            }
            byz2.thdsh.removeIf(this::zkz_3);
            if (!this.ttkh.shzl() || !(byz2.bwh(this.jyw) < byz2.rthn())) continue;
            this.jzz_4(byz2);
        }
        if (this.dhthr.isEmpty()) {
            return;
        }
        this.dws_2 = bhj_2.ths().rk();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        if (this.bnn.shzl()) {
            RenderSystem.disableDepthTest();
        } else {
            RenderSystem.enableDepthTest();
        }
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableCull();
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)tdhw);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        try {
            byz2 = zk_2.mc.field_1773.method_19418();
            class_243 class_2432 = byz2.method_19326();
            for (byz byz3 : this.dhthr) {
                this.zth_5(shw2.ssha_2(), byz3, (class_4184)byz2, class_2432);
            }
            this.hkhkh = false;
        }
        catch (RuntimeException runtimeException) {
            if (!this.hkhkh) {
                Moondlc.dhrn.error("Failed to render Hit Bubbles", (Throwable)runtimeException);
                this.hkhkh = true;
            }
        }
        finally {
            RenderSystem.depthMask((boolean)true);
            RenderSystem.enableDepthTest();
            RenderSystem.enableCull();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableBlend();
            RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
    }

    private void jzz_4(byz byz2) {
        float f = 0.0f;
        int n = 0;
        int n2 = 2102009768;
        n2 = Integer.rotateLeft(n2 * -1743596417, 13) ^ 0x6083710C;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = 1077344627 + n2 ^ 0x8F932564 ^ 0x8F932564;
        while (true) {
            block23: {
                block32: {
                    block25: {
                        block20: {
                            block37: {
                                block22: {
                                    block26: {
                                        block21: {
                                            block27: {
                                                block36: {
                                                    block35: {
                                                        block31: {
                                                            block30: {
                                                                block28: {
                                                                    block34: {
                                                                        block33: {
                                                                            block29: {
                                                                                block18: {
                                                                                    block24: {
                                                                                        block19: {
                                                                                            if ((n = n3 - n2) > 945563135) break block18;
                                                                                            if (n > -984541023) break block19;
                                                                                            if (n == -1664714839) break block20;
                                                                                            if (n == -1367829537) break block21;
                                                                                            if (n == -984541023) break block22;
                                                                                            break block23;
                                                                                        }
                                                                                        if (n > -924398537) break block24;
                                                                                        if (n == -978566729) break block25;
                                                                                        if (n == -924398537) break block26;
                                                                                        int cfr_ignored_0 = (Integer.rotateLeft(0xE71092FD ^ n2, 15) - -10523682) * -418344195;
                                                                                        int cfr_ignored_1 = (int)(0x25A23CC027D4EB4FL ^ (long)n2 ^ 0x84F0831A2DB9E695L);
                                                                                        break block23;
                                                                                    }
                                                                                    if (n == -138801650) break block27;
                                                                                    if (n == 945563135) break block28;
                                                                                    break block23;
                                                                                }
                                                                                if (n > 1374044239) break block29;
                                                                                if (n == 1077344627) break block30;
                                                                                if (n == 1314819395) break block31;
                                                                                int cfr_ignored_2 = (Integer.rotateLeft(0xF3824E38 ^ n2, 17) + -2128275453) * -209564103;
                                                                                if (n == 1374044239) break block32;
                                                                                break block23;
                                                                            }
                                                                            if (n > 1851762949) break block33;
                                                                            if (n == 1591015301) break block34;
                                                                            if (n == 1851762949) break block35;
                                                                            break block23;
                                                                        }
                                                                        if (n == 1965860386) break block36;
                                                                        if (n == 2093846425) break block37;
                                                                        int cfr_ignored_3 = (Integer.rotateLeft(0xCAC72B74 ^ n2, 12) - -1837374905) * -892916875;
                                                                        break block23;
                                                                    }
                                                                    int cfr_ignored_4 = Integer.rotateLeft(0x717E0068 ^ n2, 17) + -1029723181;
                                                                    return;
                                                                }
                                                                int cfr_ignored_5 = Integer.rotateRight(0xB267A4C3 ^ n2, 9) + -1628794152;
                                                                if (byz2.thdsh.size() < 1274874697 - 1274874633) {
                                                                    int cfr_ignored_6 = (int)(0x67653B774331ECC3L ^ (long)n2 ^ 0x8B9E4AD022A1631BL);
                                                                    n3 = Integer.reverse(Integer.reverse(256511640 + n2));
                                                                    int cfr_ignored_7 = (int)(0x199FDB269FD0D224L ^ (long)n2 ^ 0x4B3DF3125F6F9EEEL);
                                                                    n3 = 1314819395 + n2;
                                                                    n += 3;
                                                                    continue;
                                                                }
                                                                n3 = (int)((long)(1591015301 + n2) ^ 0x68390BF4533B9CBFL ^ 0x68390BF4533B9CBFL);
                                                                n += 4;
                                                                continue;
                                                            }
                                                            int cfr_ignored_8 = (Integer.rotateLeft(0x5789DDD ^ n2, 3) - -1376207618) * 91790813;
                                                            int cfr_ignored_9 = (int)(0xC7CA33E027D4EB4FL ^ (long)n2 ^ 0x9AB0831A2DB82245L);
                                                            if (this.jyw >= byz2.zfy) {
                                                                n3 = 945563135 + n2 + 1907570255 - 1907570255;
                                                                int cfr_ignored_10 = (Integer.rotateRight(0xBAC64017 ^ n2, 10) - -1570807292) * -1161412585;
                                                                continue;
                                                            }
                                                            try {
                                                                n -= 3;
                                                                if ((0x16C18F10DFB4D5B9L ^ (long)n2 | 1L) == 0L) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                n3 = Integer.reverse(Integer.reverse(1591015301 + n2));
                                                            }
                                                            catch (IllegalStateException illegalStateException) {
                                                                n3 = Integer.reverse(Integer.reverse(1591015301 + n2));
                                                            }
                                                            n -= 5;
                                                            continue;
                                                        }
                                                        int cfr_ignored_11 = (Integer.rotateLeft(0x4443AF59 ^ n2, 11) + 1217387266) * 1145286489;
                                                        int cfr_ignored_12 = (int)(0x86F1016427D4EB4FL ^ (long)n2 ^ 0xFFB8831A2DB8A033L);
                                                        f = byz2.ssht_2 * (Float.intBitsToFloat(2003030244 + -947743358) + this.dzy_2.nextFloat() * Float.intBitsToFloat(Integer.reverse(1224579808) ^ 0x39BFD974));
                                                        byz2.thdsh.add(new bys(zk_2.abs_3(this.dzy_2) * zk_2.dhkgh(1755237658 + -619367706), Float.intBitsToFloat(0x61B2C70 ^ 0xC4EB2C70) + this.dzy_2.nextFloat() * Float.intBitsToFloat(Integer.rotateLeft(0x983B9A38 ^ 0x983B1CD8, 15)), Float.intBitsToFloat(Integer.reverse(722116729) ^ 0xA10550D4) + this.dzy_2.nextFloat(), f, byz2.zfy));
                                                        byz2.zfy += 0x646352B8A8518ACBL ^ 0x646352B8A8518A8AL;
                                                        try {
                                                            n += 3;
                                                            if ((0xE8D45CB93C0EDFF3L ^ (long)n2 | 1L) == 0L) {
                                                                throw new ArithmeticException();
                                                            }
                                                            n3 = 1077344627 + n2 + -1796807041 - -1796807041;
                                                        }
                                                        catch (ArithmeticException arithmeticException) {
                                                            n3 = (int)((long)(1077344627 + n2) ^ 0x7A7127959772F2EDL ^ 0x7A7127959772F2EDL);
                                                        }
                                                        --n;
                                                        continue;
                                                    }
                                                    int cfr_ignored_13 = Integer.rotateRight(0x6BA19ACA ^ n2, 16) + 217013681;
                                                    n3 = (int)((long)(1817035217 + n2) ^ 0x2009F1468194BFDDL ^ 0x2009F1468194BFDDL);
                                                    int cfr_ignored_14 = (Integer.rotateLeft(0xDEC00659 ^ n2, 14) + -39951358) * -557840807;
                                                    int cfr_ignored_15 = (int)(0x1C72A86427D4EB4FL ^ (long)n2 ^ 0xADB8831A2DB99534L);
                                                    n3 = 1077344627 + n2;
                                                    n -= 3;
                                                    continue;
                                                }
                                                int cfr_ignored_16 = (Integer.rotateLeft(0x4DCD8CD9 ^ n2, 12) + 1883352450) * 1305316569;
                                                int cfr_ignored_17 = (int)(0x8F7F22E427D4EB4FL ^ (long)n2 ^ 0xB8B8831A2DB8B32FL);
                                                try {
                                                    n += 5;
                                                    if ((0x15DE81258A9E43F9L ^ (long)n2 | 1L) == 0L) {
                                                        throw new ArithmeticException();
                                                    }
                                                    n3 = Integer.reverse(Integer.reverse(1077344627 + n2));
                                                }
                                                catch (ArithmeticException arithmeticException) {
                                                    n3 = 1077344627 + n2 + 1504519347 - 1504519347;
                                                }
                                                continue;
                                            }
                                            int cfr_ignored_18 = (Integer.rotateLeft(0xEB024C14 ^ n2, 16) - 2040845735) * -352170987;
                                            n3 = -398352437 + n2 ^ 0x68A785A5 ^ 0x68A785A5;
                                            int cfr_ignored_19 = (Integer.rotateRight(0x6EFA841A ^ n2, 16) + 1957928545) * 1861911579;
                                            try {
                                                if ((0x706AC16362E3B91BL ^ (long)n2 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                n3 = Integer.reverse(Integer.reverse(1077344627 + n2));
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                n3 = 1077344627 + n2 + 1449753116 - 1449753116;
                                            }
                                            n += 3;
                                            continue;
                                        }
                                        int cfr_ignored_20 = (Integer.rotateRight(0x3F86085E ^ n2, 10) - -1248288099) * 1065748575;
                                        n3 = (int)((long)(-1542667171 + n2) ^ 0x175ECB7F1EE42178L ^ 0x175ECB7F1EE42178L);
                                        int cfr_ignored_21 = (Integer.rotateRight(0x678C32FA ^ n2, 15) + -1906848895) * 1737241339;
                                        n3 = (int)((long)(504059285 + n2) ^ 0x8582B757899ACABFL ^ 0x8582B757899ACABFL);
                                        int cfr_ignored_22 = Integer.rotateLeft(0xC346FC89 ^ n2, 11) + -1443482670;
                                        int cfr_ignored_23 = (int)(0x1F452B427D4EB4FL ^ (long)n2 ^ 0x5818831A2DB9AE39L);
                                        n3 = Integer.reverse(Integer.reverse(1077344627 + n2));
                                        n += 3;
                                        continue;
                                    }
                                    int cfr_ignored_24 = (Integer.rotateLeft(0x501FDBC ^ n2, 3) - -1617209089) * 84016573;
                                    n3 = (int)((long)(1077344627 + n2) ^ 0x64F5B42BF10221B7L ^ 0x64F5B42BF10221B7L);
                                    ++n;
                                    continue;
                                }
                                int cfr_ignored_25 = (Integer.rotateRight(0x753531FF ^ n2, 17) - 902737180) * 1966420479;
                                n3 = -843989930 + n2;
                                int cfr_ignored_26 = Integer.rotateRight(0x637FE7CF ^ n2, 15) - 282767692;
                                int cfr_ignored_27 = (int)(0x5D2E602865B10834L ^ (long)n2 ^ 0x3D2007D1EB4F178DL);
                                n3 = 1077344627 + n2 + -395479943 - -395479943;
                                n += 5;
                                continue;
                            }
                            int cfr_ignored_28 = (Integer.rotateLeft(0x42D94B39 ^ n2, 11) + 481147682) * 1121536825;
                            int cfr_ignored_29 = (int)(0x806BE50427D4EB4FL ^ (long)n2 ^ 0x3778831A2DB8AD06L);
                            n3 = 917729285 + n2 ^ 0xBAFC6AFB ^ 0xBAFC6AFB;
                            int cfr_ignored_30 = Integer.rotateLeft(0xA2CD801 ^ n2, 4) + 1070319450;
                            int cfr_ignored_31 = (int)(0xC89E763C27D4EB4FL ^ (long)n2 ^ 0x1108831A2DB83CEDL);
                            n3 = Integer.reverse(Integer.reverse(-604614447 + n2));
                            int cfr_ignored_32 = Integer.rotateLeft(0x76712789 ^ n2, 17) + 1544644818;
                            int cfr_ignored_33 = (int)(0xB4C389B427D4EB4FL ^ (long)n2 ^ 0xEE18831A2DB8C456L);
                            n3 = (int)((long)(1077344627 + n2) ^ 0xA77069E5A7D7C26L ^ 0xA77069E5A7D7C26L);
                            continue;
                        }
                        int cfr_ignored_34 = (Integer.rotateRight(0x87276C92 ^ n2, 3) + 1646511337) * -2027459437;
                        n3 = 1713569887 + n2 ^ 0x26E1AAC3 ^ 0x26E1AAC3;
                        int cfr_ignored_35 = Integer.rotateLeft(0xCA7B402D ^ n2, 12) - -1991613266;
                        int cfr_ignored_36 = (int)(0x8C9EE1027D4EB4FL ^ (long)n2 ^ 0x2150831A2DB9BC42L);
                        try {
                            if ((0xA420CFAAE9890D37L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = (int)((long)(1077344627 + n2) ^ 0x1698C44DE9CBF025L ^ 0x1698C44DE9CBF025L);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = Integer.reverse(Integer.reverse(1077344627 + n2));
                        }
                        continue;
                    }
                    int cfr_ignored_37 = Integer.rotateLeft(0xAA0DB66D ^ n2, 8) - -1677281682;
                    int cfr_ignored_38 = (int)(0x68BF185027D4EB4FL ^ (long)n2 ^ 0xCDD0831A2DB97CAFL);
                    n3 = -2131358744 + n2 + -540920999 - -540920999;
                    int cfr_ignored_39 = (Integer.rotateLeft(0x7DC4FA3C ^ n2, 18) - 1060629631) * 2110061117;
                    n3 = 1077344627 + n2;
                    n += 5;
                    continue;
                }
                int cfr_ignored_40 = (Integer.rotateLeft(0x51184B1C ^ n2, 13) - -699484257) * 1360546589;
                n3 = (int)((long)(1077344627 + n2) ^ 0x99BACF9B406E169AL ^ 0x99BACF9B406E169AL);
                n -= 4;
                continue;
            }
            int cfr_ignored_41 = (Integer.rotateRight(0xF30CCA37 ^ n2, 17) - 1927945188) * -217265609;
            n3 = Integer.reverse(Integer.reverse(1077344627 + n2));
        }
    }

    private void zth_5(class_4587 class_45872, byz byz2, class_4184 class_41842, class_243 class_2432) {
        float f = byz2.bwh(this.jyw);
        float f2 = class_3532.method_15363((float)(f / byz2.shshh), (float)0.0f, (float)1.0f);
        float f3 = zk_2.baz_3(f2);
        float f4 = class_3532.method_15363((float)((f - byz2.rthn()) / byz2.ssht_2), (float)0.0f, (float)1.0f);
        boolean bl = byz2.thd && f4 > 0.0f;
        float f5 = bl ? 0.0f : f3 * (1.0f - zk_2.thy_2(f4));
        float f6 = byz2.tsy * 0.5f;
        class_45872.method_22903();
        class_45872.method_22904(byz2.rzsh_2.field_1352 - class_2432.field_1352, byz2.rzsh_2.field_1351 - class_2432.field_1351, byz2.rzsh_2.field_1350 - class_2432.field_1350);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-class_41842.method_19330()));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(class_41842.method_19329()));
        float f7 = Math.min(f, byz2.rthn());
        class_45872.method_22907(class_7833.field_40718.rotationDegrees(-f7 * byz2.dda_4 / 1000.0f));
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        if (f5 > 0.001f) {
            float f8 = f6 * f3;
            this.ghbl(matrix4f, f8, f5);
        }
        if (byz2.thd && f4 > 0.0f) {
            this.thkh_2(matrix4f, byz2, f6, f4);
        }
        if (!byz2.thdsh.isEmpty()) {
            this.rfz_2(class_45872, byz2, f6, Math.max(f5, 1.0f - f4));
        }
        class_45872.method_22909();
    }

    private void ghbl(Matrix4f matrix4f, float f, float f2) {
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)tdhw);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, -f, f, 0.0f).method_22913(0.0f, 1.0f).method_39415(this.zya_2(0, f2));
        class_2872.method_22918(matrix4f, f, f, 0.0f).method_22913(1.0f, 1.0f).method_39415(this.zya_2(90, f2));
        class_2872.method_22918(matrix4f, f, -f, 0.0f).method_22913(1.0f, 0.0f).method_39415(this.zya_2(180, f2));
        class_2872.method_22918(matrix4f, -f, -f, 0.0f).method_22913(0.0f, 0.0f).method_39415(this.zya_2(270, f2));
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    private bzq_2[] dfz(int n) {
        float f;
        try {
            int n2 = -1669448009;
            n2 = Integer.rotateLeft(n2 * -258134797, 7) ^ 0x1E0C42C8;
            n2 = System.identityHashCode(this) ^ n2;
            n2 = Integer.rotateLeft(n ^ n2, 27);
            int n3 = n2 ^ 0x6B07597B;
            if ((n3 ^ n2) != 1795643771) {
                int cfr_ignored_0 = (0xF77967CC ^ n2) - -978119521;
            }
            if ((0x18F & 0) != 0) {
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
        float[] fArray = new float[n];
        float f2 = 0.0f;
        for (int i = 0; i < n; ++i) {
            fArray[i] = f = Float.intBitsToFloat(-349367559 + 1407171028) + this.dzy_2.nextFloat() * zk_2.rhl_2(-1555826833 + -1675464969);
            f2 += f;
        }
        bzq_2[] bzqArray = new bzq_2[n];
        f = (this.dzy_2.nextFloat() - Float.intBitsToFloat(907149390 - -149815218)) * zk_2.hzh_2(0x64D5BBA1 ^ 0x5A7BAFDA);
        float f3 = (this.dzy_2.nextFloat() - zk_2.thjb(Integer.reverse(605054963) ^ 0xF0E60824)) * Float.intBitsToFloat(Integer.rotateLeft(0x4BA4AAE9 ^ 0x892BCD3C, 19));
        float f4 = this.dzy_2.nextFloat() * Float.intBitsToFloat(Integer.reverse(1538734434) ^ 0x655E201);
        for (int i = 0; i < n; ++i) {
            float f5 = Float.intBitsToFloat(Integer.reverse(-544275582) ^ 0x109FE20) * fArray[i] / f2;
            float f6 = f4 + f5;
            float f7 = f4 + f5 * (Float.intBitsToFloat(0xA6A38354 ^ 0x9800545E) + this.dzy_2.nextFloat() * Float.intBitsToFloat(0x47FABFBA ^ 0x7942EE56));
            float f8 = Float.intBitsToFloat(Integer.rotateLeft(0xD796231B ^ 0x867ADFA3, 14)) + this.dzy_2.nextFloat() * Float.intBitsToFloat(1946443765 - 896190043);
            float f9 = zk_2.khlr(f4);
            float f10 = class_3532.method_15374((float)f4);
            float f11 = class_3532.method_15362((float)f7) * f8;
            float f12 = class_3532.method_15374((float)f7) * f8;
            float f13 = zk_2.zhn(f6);
            float f14 = zk_2.dhghq(f6);
            float f15 = (f4 + f6) * zk_2.ghsq(zk_2.tsq(-661553285) ^ 0xE1FE891B) + (this.dzy_2.nextFloat() - Float.intBitsToFloat(Integer.rotateLeft(0xA76FA776 ^ 0x576FA775, 28))) * Float.intBitsToFloat(Integer.rotateLeft(0x7B10A08B ^ 0x6420035C, 1));
            float f16 = class_3532.method_15362((float)f15);
            float f17 = class_3532.method_15374((float)f15);
            float f18 = Float.intBitsToFloat(-9078008 - -1069733604) + this.dzy_2.nextFloat() * Float.intBitsToFloat(0x42FE38D2 ^ 0x7DF164FB);
            float f19 = (this.dzy_2.nextFloat() - Float.intBitsToFloat(1388047640 + -331083032)) * Float.intBitsToFloat(0xB7886361 ^ 0x892BB46B);
            bzqArray[i] = new bzq_2(f, f3, f9, f10, f11, f12, f13, f14, f16, f17, f18, f19);
            f4 = f6;
        }
        return bzqArray;
    }

    private void thkh_2(Matrix4f matrix4f, byz byz2, float f, float f2) {
        float f3 = zk_2.thy_2(f2);
        float f4 = (float)Math.pow(1.0f - f2, 1.35);
        if (f4 <= 0.001f) {
            return;
        }
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)tdhw);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27379, class_290.field_1575);
        float f5 = class_3532.method_15374((float)(f2 * (float)Math.PI));
        for (int i = 0; i < byz2.tln.length; ++i) {
            bzq_2 bzq2 = byz2.tln[i];
            float f6 = byz2.dhshk * bzq2.ham * f3;
            float f7 = bzq2.rzz * f6;
            float f8 = bzq2.thll * f6 - byz2.dhshk * 0.38f * f3 * f3;
            float f9 = bzq2.thtd_3 * byz2.dhshk * f5;
            int n = this.zya_2(i * 43, f4);
            zk_2.dhthz(class_2872, matrix4f, bzq2.shkn, bzq2.sbgh_2, f, f7, f8, f9, n);
            zk_2.dhthz(class_2872, matrix4f, bzq2.bay, bzq2.bmj, f, f7, f8, f9, n);
            zk_2.dhthz(class_2872, matrix4f, bzq2.khld, bzq2.shzb_2, f, f7, f8, f9, n);
            zk_2.dhthz(class_2872, matrix4f, bzq2.shkn, bzq2.sbgh_2, f, f7, f8, f9, n);
            zk_2.dhthz(class_2872, matrix4f, bzq2.khld, bzq2.shzb_2, f, f7, f8, f9, n);
            zk_2.dhthz(class_2872, matrix4f, bzq2.szy_2, bzq2.shsb_2, f, f7, f8, f9, n);
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    private static void dhthz(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, int n) {
        int n2 = 1567171108;
        n2 = Integer.rotateLeft(n2 * 9725565, 22) ^ 0x998872C3;
        class_287 class_2873 = class_2872;
        n2 = (class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n2;
        Matrix4f matrix4f2 = matrix4f;
        n2 = Integer.rotateLeft((matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n2, 27);
        int n3 = n2 ^ 0x39663794;
        if ((n3 ^ n2) != 963000212) {
            int cfr_ignored_0 = (0x640F15B0 ^ n2) + -1423640845;
        }
        float f7 = f * f3 + f4;
        float f8 = f2 * f3 + f5;
        float f9 = Float.intBitsToFloat(0x592F093F ^ 0x662F093F) + f * Float.intBitsToFloat(0x32A3D4CB ^ 0xDA3D4CB);
        float f10 = zk_2.sdz_8(436796892 + 620167716) + f2 * Float.intBitsToFloat(0x3C878BC8 ^ 0x3878BC8);
        class_2872.method_22918(matrix4f, f7, f8, f6).method_22913(f9, f10).method_39415(n);
    }

    private void rfz_2(class_4587 class_45872, byz byz2, float f, float f2) {
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
        for (bys bys2 : byz2.thdsh) {
            float f3 = bys2.bhq_2(this.jyw);
            float f4 = (float)Math.toRadians((bys2.hdhq + bys2.trz * f3) % 360.0f);
            float f5 = class_3532.method_16439((float)zk_2.thy_2(f3), (float)(f * 0.65f), (float)(f * 1.35f));
            float f6 = (float)Math.sin(f4) * f5;
            float f7 = (float)(-Math.cos(f4)) * f5;
            float f8 = f3 * bys2.tysh * f * 0.18f;
            float f9 = (1.0f - f3) * (1.0f - f3) * f2;
            int n = zk_2.tqk_2(this.zya_2(Math.round((float)Math.toDegrees(f4)), f9), f3 * 0.5f);
            class_2872.method_22918(matrix4f, f6, f7, -f8).method_39415(n);
            class_2872.method_22918(matrix4f, f6, f7, f8).method_39415(n);
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.setShader((class_10156)class_10142.field_53880);
    }

    /*
     * Exception decompiling
     */
    private int zya_2(int var1_1, float var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
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

    private static int tqk_2(int n, float f) {
        int n2 = 1197948899;
        n2 = Integer.rotateLeft(n2 * -1644452355, 14) ^ 0xD5FF14E8;
        n2 = Integer.rotateRight(Float.floatToIntBits(f) ^ n2, 19);
        int n3 = n2 ^ 0xF6369D50;
        if ((n3 ^ n2) != -164192944) {
            int cfr_ignored_0 = (0xB151A2B3 ^ n2) + -756294718;
        }
        int n4 = n >>> -644210941 - -644210965;
        int n5 = n >> 1343811215 + -1343811199 & Integer.rotateLeft(0xDFF78FCF ^ 0xDFF78C33, 30);
        int n6 = n >> -181972356 - -181972364 & Integer.rotateLeft(0x708E0CE6 ^ 0x708E0F1A, 30);
        int n7 = n & (0x9AB1AF87 ^ 0x9AB1AF78);
        n5 = Math.round(class_3532.method_48781((float)f, (int)n5, (int)(Integer.reverse(-1080805962) ^ 0x6DAC2902)));
        n6 = Math.round(class_3532.method_48781((float)f, (int)n6, (int)(727568916 + -727568661)));
        n7 = Math.round(class_3532.method_48781((float)f, (int)n7, (int)Integer.rotateLeft(0x61485CFF ^ 0x614FA4FF, 21)));
        return n4 << 1117277726 - 1117277702 | n5 << -973635744 + 973635760 | n6 << (Integer.reverse(-41612135) ^ 0x9930A1B7) | n7;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static int bqa_2(int var0, int var1_1, float var2_2) {
        var3_3 = 0;
        var4_4 = 0;
        var5_5 = 0;
        var6_6 = 0;
        var7_7 = 0;
        var10_8 = 0;
        var8_9 = -1008572283;
        var8_9 = Integer.rotateLeft(var8_9 * 608498165, 24) ^ 1696658113;
        var9_10 = var8_9 ^ -1977800911 ^ -878485470 ^ -878485470;
        block23: while (true) {
            if ((var10_8 = var9_10 ^ var8_9) == -1072169573) ** GOTO lbl170
            if (var10_8 == -245304697) {
                return var7_7;
            }
            (Integer.rotateLeft(-190474660 ^ var8_9, 17) - -1536502689) * -190474659;
            switch (var10_8) {
                case -1977800911: {
                    Integer.rotateLeft(658265189 ^ var8_9, 7) - -995371146;
                    (int)(-1905310335798809777L ^ (long)var8_9 ^ 702705690329245388L);
                    if (!yf.dnkh()) {
                        var9_10 = Integer.reverse(Integer.reverse(var8_9 ^ 727294520));
                        Integer.rotateLeft(1009610221 ^ var8_9, 10) - 0x4DDDEEEE;
                        (int)(-99145367989982385L ^ (long)var8_9 ^ 8849717416242467054L);
                        var10_8 += 2;
                        continue block23;
                    }
                    (int)(3819599733646580367L ^ (long)var8_9 ^ 2161786023552075730L);
                    var9_10 = var8_9 ^ 390521053 ^ -1351055482 ^ -1351055482;
                    ++var10_8;
                    continue block23;
                }
                case 727294520: {
                    Integer.rotateLeft(357773056 ^ var8_9, 5) + -1720692677;
                    var2_2 = class_3532.method_15363((float)var2_2, (float)0.0f, (float)1.0f);
                    var3_3 = Math.round(class_3532.method_48781((float)var2_2, (int)(var0 >>> (1089017970 ^ 1089017962)), (int)(var1_1 >>> (-1952333239 ^ -1952333231))));
                    var4_4 = Math.round(class_3532.method_48781((float)var2_2, (int)(var0 >> (-1692709552 ^ -1692709568) & 1434979842 + -1434979587), (int)(var1_1 >> -138265886 + 138265902 & Integer.rotateLeft(1738230840 ^ 1617120312, 13))));
                    var5_5 = Math.round(class_3532.method_48781((float)var2_2, (int)(var0 >> 2115577949 + -2115577941 & (Integer.reverse(-244342692) ^ 973469296)), (int)(var1_1 >> (Integer.reverse(1020355920) ^ 178686772) & -1111564351 + 1111564606)));
                    var6_6 = Math.round(class_3532.method_48781((float)var2_2, (int)(var0 & -1514933815 + 1514934070), (int)(var1_1 & Integer.rotateLeft(1078288895 ^ -1136303620, 6))));
                    var7_7 = var3_3 << Integer.rotateLeft(-1285443483 ^ -1285442715, 27) | var4_4 << 1377587198 - 1377587182 | var5_5 << -313130726 + 313130734 | var6_6;
                    (int)(8560576849749524642L ^ (long)var8_9 ^ 8350587620109271115L);
                    var9_10 = (var8_9 ^ -1931733243) + 1451582347 - 1451582347;
                    (int)(-2100385421457917769L ^ (long)var8_9 ^ 2331740481065085026L);
                    var9_10 = (var8_9 ^ -245304697) + 546533500 - 546533500;
                    continue block23;
                }
                case -1746908467: {
                    (Integer.rotateRight(983554226 ^ var8_9, 10) + 498654409) * 983554227;
                    var9_10 = var8_9 ^ 93552275 ^ 1764140988 ^ 1764140988;
                    Integer.rotateLeft(-1480557944 ^ var8_9, 7) + 1420588467;
                    var9_10 = (int)((long)(var8_9 ^ -1977800911) ^ -6034580045874358189L ^ -6034580045874358189L);
                    continue block23;
                }
                case -85047959: {
                    (Integer.rotateRight(1008850611 ^ var8_9, 10) + 1282842344) * 1008850611;
                    var9_10 = var8_9 ^ 1394651626 ^ -266893713 ^ -266893713;
                    Integer.rotateRight(1306566286 ^ var8_9, 12) - 1922093677;
                    var9_10 = Integer.reverse(Integer.reverse(var8_9 ^ -1977800911));
                    Integer.rotateLeft(1601058689 ^ var8_9, 14) + -1833543718;
                    (int)(-7071608281477354673L ^ (long)var8_9 ^ -3600483753623251352L);
                    var10_8 += 3;
                    continue block23;
                }
                case -385368641: {
                    (Integer.rotateLeft(-1913212968 ^ var8_9, 4) + 893184611) * -1913212967;
                    var9_10 = Integer.reverse(Integer.reverse(var8_9 ^ 2011088609));
                    (Integer.rotateRight(-1011024105 ^ var8_9, 11) - -1203731708) * -1011024105;
                    var9_10 = var8_9 ^ -1977800911 ^ 1574878036 ^ 1574878036;
                    (Integer.rotateLeft(-2134132943 ^ var8_9, 3) + -1660367318) * -2134132943;
                    (int)(4789887218683800399L ^ (long)var8_9 ^ -3501404561821062877L);
                    var10_8 -= 5;
                    continue block23;
                }
                case -1247359990: {
                    Integer.rotateLeft(-196967359 ^ var8_9, 17) + -1737776358;
                    (int)(3958710785191242575L ^ (long)var8_9 ^ -6230585936007544783L);
                    try {
                        var10_8 -= 2;
                        if ((510318044011592359L ^ (long)var8_9 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var9_10 = Integer.reverse(Integer.reverse(var8_9 ^ -1977800911));
                    }
                    catch (NoSuchElementException v0) {
                        var9_10 = Integer.reverse(Integer.reverse(var8_9 ^ -1977800911));
                    }
                    continue block23;
                }
                case -254727887: {
                    (Integer.rotateRight(-476616737 ^ var8_9, 15) - -1816972484) * -476616737;
                    try {
                        var10_8 += 5;
                        var9_10 = (int)((long)(var8_9 ^ -1977800911) ^ -9141939453238016437L ^ -9141939453238016437L);
                    }
                    catch (IllegalArgumentException v1) {
                        var9_10 = (var8_9 ^ -1977800911) + -580379357 - -580379357;
                    }
                    ++var10_8;
                    continue block23;
                }
                case 689991450: {
                    (Integer.rotateLeft(-1003321776 ^ var8_9, 11) + -964959509) * -1003321775;
                    var9_10 = (int)((long)(var8_9 ^ 104845024) ^ -5237065436154990614L ^ -5237065436154990614L);
                    Integer.rotateLeft(-837328860 ^ var8_9, 12) - -114146409;
                    var9_10 = Integer.reverse(Integer.reverse(var8_9 ^ -1977800911));
                    continue block23;
                }
                case -260836009: {
                    (Integer.rotateLeft(166484221 ^ var8_9, 4) - 939288030) * 166484221;
                    (int)(-3792322531036959921L ^ (long)var8_9 ^ 1220619647476841324L);
                    var9_10 = (var8_9 ^ 1390822211) + 1746687675 - 1746687675;
                    (Integer.rotateRight(1937635039 ^ var8_9, 17) - 10388540) * 1937635039;
                    var9_10 = (int)((long)(var8_9 ^ -1977800911) ^ -4314837443972632594L ^ -4314837443972632594L);
                    var10_8 -= 5;
                    continue block23;
                }
                case -397954467: {
                    Integer.rotateRight(-1437696310 ^ var8_9, 8) + -1545668175;
                    var9_10 = var8_9 ^ -1211290459 ^ 1683026075 ^ 1683026075;
                    Integer.rotateLeft(-1330858336 ^ var8_9, 9) + 1766309019;
                    var9_10 = var8_9 ^ -1977800911 ^ 61318369 ^ 61318369;
                    (Integer.rotateLeft(-1479123600 ^ var8_9, 7) + 1465053131) * -1479123599;
                    var10_8 -= 5;
                    continue block23;
                }
                case 617184018: {
                    Integer.rotateLeft(152498529 ^ var8_9, 4) + 505731578;
                    (int)(-3772785738419737777L ^ (long)var8_9 ^ 4884297944342739609L);
                    try {
                        if ((-7203354915671853593L ^ (long)var8_9 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var9_10 = (int)((long)(var8_9 ^ -1977800911) ^ -1150098797343344906L ^ -1150098797343344906L);
                    }
                    catch (UnsupportedOperationException v2) {
                        var9_10 = (int)((long)(var8_9 ^ -1977800911) ^ 5623826274093979721L ^ 5623826274093979721L);
                    }
                    continue block23;
                }
                case -323918548: {
                    (Integer.rotateLeft(799694649 ^ var8_9, 8) + -906025182) * 799694649;
                    (int)(-1362073887129146545L ^ (long)var8_9 ^ 2267706560840497120L);
                    var9_10 = var8_9 ^ 182757453;
                    (Integer.rotateRight(-137531457 ^ var8_9, 17) - 104736604) * -137531457;
                    try {
                        if ((7963774663110359285L ^ (long)var8_9 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var9_10 = (int)((long)(var8_9 ^ -1977800911) ^ 3670849578575161136L ^ 3670849578575161136L);
                    }
                    catch (IllegalStateException v3) {
                        var9_10 = var8_9 ^ -1977800911;
                    }
                    var10_8 += 2;
                    continue block23;
                }
lbl170:
                // 1 sources

                Integer.rotateRight(479283683 ^ var8_9, 6) + 2046136760;
                var9_10 = var8_9 ^ -337144678 ^ 893178986 ^ 893178986;
                Integer.rotateRight(-557531121 ^ var8_9, 14) - -30351092;
                var9_10 = (int)((long)(var8_9 ^ -1977800911) ^ -3442518922129115187L ^ -3442518922129115187L);
                Integer.rotateRight(-556122834 ^ var8_9, 14) - 13305805;
                continue block23;
                default: {
                    (Integer.rotateLeft(-1384375784 ^ var8_9, 8) + 107268131) * -1384375783;
                    var9_10 = (int)((long)(var8_9 ^ -1977800911) ^ -5495293974718477674L ^ -5495293974718477674L);
                    continue block23;
                }
                case 390521053: 
            }
            break;
        }
        (Integer.rotateRight(-2133058413 ^ var8_9, 3) + -1627056888) * -2133058413;
        throw null;
    }

    private static float thy_2(float f) {
        try {
            int n = 1262283737;
            n = Integer.rotateLeft(n * -587717325, 9) ^ 0x856E2FDB;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xE2894DD5;
            if ((n2 ^ n) != -494318123) {
                int cfr_ignored_0 = (0xA9B5A60C ^ n) - 2071620405;
            }
            if ((0x36E & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        f = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        float f2 = 1.0f - f;
        return 1.0f - f2 * f2 * f2;
    }

    private static float baz_3(float f) {
        block0: {
            int n = -686911351;
            int n2 = (n = Integer.rotateLeft(n * 1337849609, 12) ^ 0xB7EF15C0) ^ 0x7FDEA12B;
            if ((n2 ^ n) == 2145296683) break block0;
            int cfr_ignored_0 = (0xA8D031A2 ^ n) + -1001924117;
        }
        return (float)Math.sin((double)class_3532.method_15363((float)f, (float)0.0f, (float)1.0f) * Double.longBitsToDouble(0x36A38DA38CD66066L ^ 0x76AAAC58D8924D7EL) * Double.longBitsToDouble(0x4B5713BDA59AAE03L ^ 0x74B713BDA59AAE03L));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void nc() {
        var3_1 = 0;
        var1_2 = -2116156648;
        var1_2 = Integer.rotateLeft(var1_2 * -579937149, 6) ^ -973943970;
        var1_2 = System.identityHashCode(this) ^ var1_2;
        var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 1519364708 ^ 1158458532)));
        while (true) {
            block34: {
                block39: {
                    block35: {
                        block40: {
                            block31: {
                                block37: {
                                    block32: {
                                        block41: {
                                            block38: {
                                                block33: {
                                                    block36: {
                                                        var3_1 = Integer.reverse(var2_3) ^ var1_2 ^ 1158458532;
                                                        switch (var3_1 & 7) {
                                                            case 7: {
                                                                if (var3_1 != 24470015) {
                                                                    ** break;
                                                                }
                                                                break block31;
                                                            }
                                                            case 4: {
                                                                if (var3_1 > 577789044) ** GOTO lbl21
                                                                if (var3_1 == -772365860) break block32;
                                                                if (var3_1 != 577789044) {
                                                                    Integer.rotateLeft(-418863808 ^ var1_2, 15) + -26631685;
                                                                    ** break;
                                                                }
                                                                break block33;
lbl21:
                                                                // 1 sources

                                                                if (var3_1 == 1519364708) break;
                                                                if (var3_1 != 1697856484) {
                                                                    Integer.rotateLeft(-2087737779 ^ var1_2, 3) - -222117234;
                                                                    (int)(4700922863842290511L ^ (long)var1_2 ^ -1328417741614796885L);
                                                                    ** break;
                                                                }
                                                                break block34;
                                                            }
                                                            case 0: {
                                                                if (var3_1 != -463127896) {
                                                                    ** break;
                                                                }
                                                                break block35;
                                                            }
                                                            case 1: {
                                                                if (var3_1 == -1704227623) break block36;
                                                                if (var3_1 != -715331607) {
                                                                    ** break;
                                                                }
                                                                break block37;
                                                            }
                                                            case 5: {
                                                                if (var3_1 == 996586677) break block38;
                                                                if (var3_1 != -774118499) {
                                                                    Integer.rotateRight(-1799912657 ^ var1_2, 5) - 110526956;
                                                                    ** break;
                                                                }
                                                                break block39;
                                                            }
                                                            case 6: {
                                                                if (var3_1 == -2012408770) break block40;
                                                                if (var3_1 == -1815359882) ** GOTO lbl51
                                                                if (var3_1 != 1847920286) {
                                                                    ** break;
                                                                }
                                                                break block41;
lbl51:
                                                                // 1 sources

                                                                Integer.rotateLeft(1325919080 ^ var1_2, 12) + -1772937005;
                                                                throw null;
                                                            }
                                                        }
                                                        (Integer.rotateLeft(-1105055751 ^ var1_2, 10) + 176254562) * -1105055751;
                                                        (int)(8975816736831236943L ^ (long)var1_2 ^ -74165245392104208L);
                                                        if (!yf.dnkh()) {
                                                            try {
                                                                ++var3_1;
                                                                var2_3 = (int)((long)Integer.reverse(var1_2 ^ -1704227623 ^ 1158458532) ^ 9051363789405798373L ^ 9051363789405798373L);
                                                            }
                                                            catch (ArithmeticException v0) {
                                                                var2_3 = Integer.reverse(var1_2 ^ -1704227623 ^ 1158458532) + -2082846695 - -2082846695;
                                                            }
                                                            continue;
                                                        }
                                                        var2_3 = Integer.reverse(var1_2 ^ -1498320156 ^ 1158458532) ^ -233483483 ^ -233483483;
                                                        (Integer.rotateRight(386222454 ^ var1_2, 5) - -838761339) * 386222455;
                                                        var2_3 = (int)((long)Integer.reverse(var1_2 ^ -1815359882 ^ 1158458532) ^ 5824167040489014448L ^ 5824167040489014448L);
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(797458277 ^ var1_2, 8) - -975352714;
                                                    (int)(-1352608930259997873L ^ (long)var1_2 ^ -2323713259263723612L);
                                                    this.dhthr.clear();
                                                    this.hkhkh = false;
                                                    return;
                                                }
                                                (Integer.rotateLeft(-1128513136 ^ var1_2, 10) + -550924373) * -1128513135;
                                                var2_3 = (int)((long)Integer.reverse(var1_2 ^ 206762589 ^ 1158458532) ^ 4329032595673193778L ^ 4329032595673193778L);
                                                Integer.rotateLeft(1685782689 ^ var1_2, 15) + 792900282;
                                                (int)(-6428415007388275889L ^ (long)var1_2 ^ -6897118680858435518L);
                                                var2_3 = Integer.reverse(var1_2 ^ 1519364708 ^ 1158458532) + 555618629 - 555618629;
                                                (Integer.rotateRight(-1337713762 ^ var1_2, 9) - 1553790813) * -1337713761;
                                                var3_1 += 2;
                                                continue;
                                            }
                                            Integer.rotateLeft(-1029968896 ^ var1_2, 11) + -1791020229;
                                            (int)(3792679896567823863L ^ (long)var1_2 ^ 7060016743100040341L);
                                            var2_3 = Integer.reverse(var1_2 ^ 958698483 ^ 1158458532) + -887105848 - -887105848;
                                            (int)(1248666479235938921L ^ (long)var1_2 ^ -5590955997067374727L);
                                            var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 1519364708 ^ 1158458532)));
                                            var3_1 += 5;
                                            continue;
                                        }
                                        Integer.rotateLeft(-1100223679 ^ var1_2, 10) + 326048794;
                                        (int)(8996298130195802959L ^ (long)var1_2 ^ 8613278435805582435L);
                                        var2_3 = Integer.reverse(var1_2 ^ -371156314 ^ 1158458532) + 1847988840 - 1847988840;
                                        (Integer.rotateRight(-1158160013 ^ var1_2, 10) + -1469977560) * -1158160013;
                                        try {
                                            var3_1 -= 2;
                                            if ((-4867887631180578135L ^ (long)var1_2 | 1L) == 0L) {
                                                throw new IllegalArgumentException();
                                            }
                                            var2_3 = Integer.reverse(var1_2 ^ 1519364708 ^ 1158458532) + -906741652 - -906741652;
                                        }
                                        catch (IllegalArgumentException v1) {
                                            var2_3 = Integer.reverse(var1_2 ^ 1519364708 ^ 1158458532) + 553193377 - 553193377;
                                        }
                                        continue;
                                    }
                                    Integer.rotateLeft(-697703927 ^ var1_2, 13) + -80740782;
                                    (int)(1502878687548468047L ^ (long)var1_2 ^ 7284716545731298407L);
                                    var2_3 = (int)((long)Integer.reverse(var1_2 ^ -892445365 ^ 1158458532) ^ -6056245094619938131L ^ -6056245094619938131L);
                                    Integer.rotateLeft(1069862925 ^ var1_2, 10) - -1120743218;
                                    (int)(-182819989570131121L ^ (long)var1_2 ^ 76705342124742461L);
                                    (int)(-5131076035711956175L ^ (long)var1_2 ^ 9115042717838400580L);
                                    var2_3 = Integer.reverse(var1_2 ^ 1519364708 ^ 1158458532) ^ -773322843 ^ -773322843;
                                    ++var3_1;
                                    continue;
                                }
                                Integer.rotateLeft(1692404576 ^ var1_2, 15) + 998178779;
                                var2_3 = (int)((long)Integer.reverse(var1_2 ^ 1422559201 ^ 1158458532) ^ -5625623455179350888L ^ -5625623455179350888L);
                                Integer.rotateRight(247131842 ^ var1_2, 4) + -855603015;
                                try {
                                    var3_1 += 5;
                                    if ((5204727450966350593L ^ (long)var1_2 | 1L) == 0L) {
                                        throw new ArithmeticException();
                                    }
                                    var2_3 = Integer.reverse(var1_2 ^ 1519364708 ^ 1158458532) + 1487871119 - 1487871119;
                                }
                                catch (ArithmeticException v2) {
                                    var2_3 = (int)((long)Integer.reverse(var1_2 ^ 1519364708 ^ 1158458532) ^ 985776346339252898L ^ 985776346339252898L);
                                }
                                var3_1 -= 2;
                                continue;
                            }
                            (Integer.rotateRight(105960022 ^ var1_2, 3) - -936962139) * 105960023;
                            var2_3 = Integer.reverse(var1_2 ^ 1799667872 ^ 1158458532) + 864011196 - 864011196;
                            Integer.rotateLeft(2055608077 ^ var1_2, 18) - -627414578;
                            (int)(-5173306455464023217L ^ (long)var1_2 ^ -8137860378199007816L);
                            var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 40917914 ^ 1158458532)));
                            (Integer.rotateRight(-1185209186 ^ var1_2, 10) - 1986465373) * -1185209185;
                            var2_3 = Integer.reverse(var1_2 ^ 1519364708 ^ 1158458532) + 80753294 - 80753294;
                            var3_1 -= 3;
                            continue;
                        }
                        Integer.rotateLeft(-1001692887 ^ var1_2, 11) + -914463950;
                        (int)(502660518903081807L ^ (long)var1_2 ^ 7158615756164931618L);
                        var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 1519364708 ^ 1158458532)));
                        Integer.rotateLeft(-843402911 ^ var1_2, 12) + -302441990;
                        (int)(1083150191048321871L ^ (long)var1_2 ^ -4339074092511939647L);
                        var3_1 += 5;
                        continue;
                    }
                    (Integer.rotateRight(1467877594 ^ var1_2, 13) + -1667190367) * 1467877595;
                    try {
                        var3_1 -= 4;
                        if ((-1383935945719845755L ^ (long)var1_2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var2_3 = Integer.reverse(var1_2 ^ 1519364708 ^ 1158458532) + 1957795150 - 1957795150;
                    }
                    catch (UnsupportedOperationException v3) {
                        var2_3 = Integer.reverse(var1_2 ^ 1519364708 ^ 1158458532) ^ -1355051025 ^ -1355051025;
                    }
                    var3_1 += 2;
                    continue;
                }
                (Integer.rotateRight(-1616107366 ^ var1_2, 6) + 1513523681) * -1616107365;
                var2_3 = Integer.reverse(var1_2 ^ 1545040609 ^ 1158458532);
                Integer.rotateLeft(-1179447060 ^ var1_2, 10) - -2129876017;
                try {
                    if ((-7785227020205289259L ^ (long)var1_2 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    var2_3 = Integer.reverse(var1_2 ^ 1519364708 ^ 1158458532);
                }
                catch (IllegalStateException v4) {
                    var2_3 = Integer.reverse(var1_2 ^ 1519364708 ^ 1158458532) ^ -1628438517 ^ -1628438517;
                }
                var3_1 += 5;
                continue;
            }
            Integer.rotateLeft(1809596268 ^ var1_2, 16) - 336153935;
            var2_3 = (int)((long)Integer.reverse(var1_2 ^ 1519364708 ^ 1158458532) ^ -1555483910808966236L ^ -1555483910808966236L);
            (Integer.rotateLeft(317432732 ^ var1_2, 5) - 1323724575) * 317432733;
            var3_1 += 2;
            continue;
lbl213:
            // 8 sources

            (Integer.rotateRight(-1102911562 ^ var1_2, 10) - 242724421) * -1102911561;
            var2_3 = (int)((long)Integer.reverse(var1_2 ^ 1519364708 ^ 1158458532) ^ -4748559339245935256L ^ -4748559339245935256L);
        }
    }

    private boolean zkz_3(bys bys2) {
        return bys2.bhq_2(this.jyw) >= 1.0f;
    }

    private void tngh_2(bthy bthy2) {
        class_1309 class_13092;
        try {
            int n = 1226950316;
            n = Integer.rotateLeft(n * -822281221, 22) ^ 0xE300DD4D;
            bthy bthy3 = bthy2;
            n = Integer.rotateRight((bthy3 != null ? System.identityHashCode(bthy3) : 0) ^ n, 8);
            int n2 = n ^ 0xC1C82D36;
            if ((n2 ^ n) != -1043845834) {
                int cfr_ignored_0 = (0x88E9EB9A ^ n) - -592620997;
            }
            if ((0x122 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_1297 class_12972 = bthy2.khtf();
        if (!(class_12972 instanceof class_1309) || !(class_13092 = (class_1309)class_12972).method_5805() || zk_2.mc.field_1724 == null) {
            return;
        }
        if (this.dhthr.size() >= Integer.rotateLeft(0x36358F5E ^ 0x26358F5E, 10)) {
            this.dhthr.removeFirst();
        }
        class_12972 = this.khlsh(class_13092);
        float f = this.sjb_2.thw_5();
        float f2 = Math.min(this.thfs_2.thw_5(), Math.max(Float.intBitsToFloat(0xD910CC69 ^ 0x9B58CC69), f - Float.intBitsToFloat(-739557605 - -1859961061)));
        float f3 = Math.min(this.khzj_2.thw_5(), Math.max(Float.intBitsToFloat(-392577600 + 1504592448), f - f2));
        boolean bl = this.szw_2.shzl();
        int n = class_3532.method_15340((int)Math.round(this.ghf.thw_5()), (int)4, (int)(-1423255643 + 1423255655));
        bzq_2[] bzqArray = bl ? this.dfz(n) : zds_4;
        this.dhthr.add(new byz((class_243)class_12972, f, f2, f3, this.dhdh_6.thw_5(), this.slt.thw_5(), bl, bzqArray, this.wd.thw_5(), System.currentTimeMillis()));
    }

    private boolean tthd_3() {
        int n;
        block1: {
            int n2 = -2140426964;
            int n3 = (n2 = Integer.rotateLeft(n2 * -984363135, 9) ^ 0xF09D31D0) ^ 0xC326B1BD;
            if ((n3 ^ n2) != -1020874307) {
                int cfr_ignored_0 = (0x434D1C91 ^ n2) - 940838635;
            }
            n = !this.szw_2.shzl() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0xEADF;
        }
        return n != 0;
    }

    private boolean tthsh() {
        try {
            int n = 150018134;
            n = Integer.rotateLeft(n * -216376941, 24) ^ 0xC2B2CA21;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x37B6BF16;
            if ((n2 ^ n) != 934723350) {
                int cfr_ignored_0 = (0x3F47A740 ^ n) + 205133617;
            }
            if ((0x249 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.szw_2.shzl();
    }

    private boolean dhdt() {
        int n = tdz.tjh(434870730);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
        int n2 = n ^ 0x9E929D97;
        if ((n2 ^ n) != -1634558569) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x8779045D ^ n, 3) - 1812276862) * -2022112163;
            int cfr_ignored_1 = (int)(0x45CBAA6027D4EB4FL ^ (long)n ^ 0xA9B0831A2DB92646L);
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.dhqt_2.shghkh();
    }

    private boolean day_3() {
        int n = tdz.tjh(2088933791);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 23);
        int n2 = n ^ 0xE25266CE;
        if ((n2 ^ n) != -497916210) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x9ED0FF51 ^ n, 6) + 1068272138) * -1630470319;
            int cfr_ignored_1 = (int)(0x5C62516C27D4EB4FL ^ (long)n ^ 0x5FA8831A2DB91515L);
        }
        return !this.tdz_4.shghkh() && !this.dhqt_2.shghkh();
    }

    private static String tkz_3(String string, int n, int n2, int n3) {
        try {
            int n4 = -1499133119;
            n4 = Integer.rotateLeft(n4 * 1571534175, 12) ^ 0x864BF66D;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 18);
            n4 = Integer.rotateRight(n ^ n4, 13);
            int n5 = n4 ^ 0x49D3EC98;
            if ((n5 ^ n4) != 1238625432) {
                int cfr_ignored_0 = (0xEF76E7D9 ^ n4) + 778445797;
            }
            if ((0x182 & 0) != 0) {
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
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x6883B234) + n2 ^ i * 1982618073) ^ thrm) + dtdh_2);
        }
        return new String(cArray);
    }

    private static class_1297 ztkh_3(class_3966 class_39662) {
        block0: {
            int n = -1033972391;
            n = Integer.rotateLeft(n * 319481675, 13) ^ 0xA0F84AF4;
            class_3966 class_39663 = class_39662;
            n = (class_39663 != null ? System.identityHashCode(class_39663) : 0) ^ n;
            int n2 = n ^ 0x783CD5D1;
            if ((n2 ^ n) == 2017252817) break block0;
            int cfr_ignored_0 = (0xBA620088 ^ n) - -455786936;
        }
        return class_39662.method_17782();
    }

    private static class_243 khkz_2(class_3966 class_39662) {
        block0: {
            int n = 982801302;
            n = Integer.rotateLeft(n * -312784471, 12) ^ 0x3002A018;
            class_3966 class_39663 = class_39662;
            n = Integer.rotateLeft((class_39663 != null ? System.identityHashCode(class_39663) : 0) ^ n, 24);
            int n2 = n ^ 0x64715ED1;
            if ((n2 ^ n) == 1685151441) break block0;
            int cfr_ignored_0 = (0x5EE50547 ^ n) + 867838637;
        }
        return class_39662.method_17784();
    }

    private static class_238 dthf_2(class_1309 class_13092) {
        block0: {
            int n = -1045090692;
            int n2 = (n = Integer.rotateLeft(n * -1570456093, 8) ^ 0x493D2ABF) ^ 0xA42E20D2;
            if ((n2 ^ n) == -1540480814) break block0;
            int cfr_ignored_0 = (0x659B0EAE ^ n) + -1413973021;
        }
        return class_13092.method_5829();
    }

    private static class_243 shhs_2(zk_2 zk2_2) {
        block0: {
            int n = 692311836;
            int n2 = (n = Integer.rotateLeft(n * 66868025, 21) ^ 0x9496560) ^ 0x337DFB7C;
            if ((n2 ^ n) == 863894396) break block0;
            int cfr_ignored_0 = (0x1A3E2C60 ^ n) - -1107659276;
        }
        return zk2_2.dhath();
    }

    private static double bhsh(long l) {
        block0: {
            int n = tdz.tjh(2034321636);
            int n2 = (n = Integer.rotateRight((int)l ^ n, 14)) ^ 0x2545CF69;
            if ((n2 ^ n) == 625332073) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x5C04878D ^ n, 14) - 686426446;
            int cfr_ignored_1 = (int)(0x9EB629B027D4EB4FL ^ (long)n ^ 0xAE10831A2DB890BDL);
        }
        return Double.longBitsToDouble(l);
    }

    private static double aaj_2(long l) {
        block0: {
            int n = tdz.tjh(-83964423);
            int n2 = (n = (int)l ^ n) ^ 0xB75E8D42;
            if ((n2 ^ n) == -1218540222) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x4DA040BB ^ n, 12) + 1791325664) * 1302347963;
        }
        return Double.longBitsToDouble(l);
    }

    private static class_243 shath(class_746 class_7462) {
        block0: {
            int n = -1426249170;
            n = Integer.rotateLeft(n * 418982545, 28) ^ 0xF38B3BA3;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0x2E29216D;
            if ((n2 ^ n) == 774447469) break block0;
            int cfr_ignored_0 = (0x84D40B43 ^ n) - -539830351;
        }
        return class_7462.method_33571();
    }

    private static class_243 tjr_2(class_238 class_2383) {
        block0: {
            int n = -826116034;
            int n2 = (n = Integer.rotateLeft(n * -1952240191, 15) ^ 0xD07E53F5) ^ 0x88896251;
            if ((n2 ^ n) == -2004262319) break block0;
            int cfr_ignored_0 = (0x464B1A6F ^ n) + 867061746;
        }
        return class_2383.method_1005();
    }

    private static double smn(class_243 class_2432) {
        block0: {
            int n = -303642824;
            n = Integer.rotateLeft(n * -1588363057, 8) ^ 0xAF99389C;
            class_243 class_2433 = class_2432;
            n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
            int n2 = n ^ 0x6FB001EE;
            if ((n2 ^ n) == 1873805806) break block0;
            int cfr_ignored_0 = (0x8256C6D6 ^ n) - 1953472916;
        }
        return class_2432.method_1027();
    }

    private static float bzk(tay tay2) {
        block0: {
            int n = 271569606;
            n = Integer.rotateLeft(n * 1154270497, 12) ^ 0xADF2ADBE;
            tay tay3 = tay2;
            n = Integer.rotateRight((tay3 != null ? System.identityHashCode(tay3) : 0) ^ n, 23);
            int n2 = n ^ 0x6F91CCB;
            if ((n2 ^ n) == 116989131) break block0;
            int cfr_ignored_0 = (0x16D6CE0D ^ n) + -1556913034;
        }
        return tay2.thw_5();
    }

    private static class_243 zkhk_2(class_243 class_2432, double d) {
        block0: {
            int n = tdz.tjh(1801075258);
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 5);
            int n2 = n ^ 0x2CFB5033;
            if ((n2 ^ n) == 754667571) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x47A16A09 ^ n, 11) + -1326877102;
            int cfr_ignored_1 = (int)(0x8513C43427D4EB4FL ^ (long)n ^ 0x7518831A2DB8A7F6L);
        }
        return class_2432.method_1021(d);
    }

    private static class_243 khtgh(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = 352967978;
            int n2 = (n = Integer.rotateLeft(n * 45764975, 25) ^ 0x25C6FEAA) ^ 0xC3655404;
            if ((n2 ^ n) == -1016769532) break block0;
            int cfr_ignored_0 = (0xD66C892E ^ n) - 523827080;
        }
        return class_2432.method_1019(class_2433);
    }

    private static float dsf_4(float f) {
        block0: {
            int n = 1414175785;
            n = Integer.rotateLeft(n * 2077582391, 3) ^ 0x746D2C81;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xC46060DF;
            if ((n2 ^ n) == -1000316705) break block0;
            int cfr_ignored_0 = (0x902AFCF6 ^ n) + 1074073057;
        }
        return class_3532.method_15374((float)f);
    }

    private static float abs_3(Random random) {
        block0: {
            int n = tdz.tjh(-1869445088);
            Random random2 = random;
            n = Integer.rotateLeft((random2 != null ? System.identityHashCode(random2) : 0) ^ n, 10);
            int n2 = n ^ 0x148BD87F;
            if ((n2 ^ n) == 344709247) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x8419505F ^ n, 3) - 57563836) * -2078715809;
        }
        return random.nextFloat();
    }

    private static float dhkgh(int n) {
        block0: {
            int n2 = 299656776;
            n2 = Integer.rotateLeft(n2 * -1495422243, 3) ^ 0x5159D1FB;
            int n3 = (n2 = n ^ n2) ^ 0xA9B75E;
            if ((n3 ^ n2) == 11122526) break block0;
            int cfr_ignored_0 = (0x1175D116 ^ n2) + -1369084713;
        }
        return Float.intBitsToFloat(n);
    }

    private static float rhl_2(int n) {
        block0: {
            int n2 = 874872775;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1073721603, 26) ^ 0xF2BBE391) ^ 0xF0CC83DD;
            if ((n3 ^ n2) == -255032355) break block0;
            int cfr_ignored_0 = (0xC4E9FC1A ^ n2) + -1393885590;
        }
        return Float.intBitsToFloat(n);
    }

    private static float hzh_2(int n) {
        block0: {
            int n2 = -146215962;
            int n3 = (n2 = Integer.rotateLeft(n2 * -632107987, 22) ^ 0x166BA366) ^ 0xEEC2A92C;
            if ((n3 ^ n2) == -289232596) break block0;
            int cfr_ignored_0 = (0x198A42CA ^ n2) - 1450218648;
        }
        return Float.intBitsToFloat(n);
    }

    private static float thjb(int n) {
        block0: {
            int n2 = -1346425377;
            int n3 = (n2 = Integer.rotateLeft(n2 * 159261383, 9) ^ 0xDFF3890A) ^ 0x5A5A8B6A;
            if ((n3 ^ n2) == 1515883370) break block0;
            int cfr_ignored_0 = (0xF5E5A6B5 ^ n2) + -1854850998;
        }
        return Float.intBitsToFloat(n);
    }

    private static float khlr(float f) {
        block0: {
            int n = -1602530840;
            n = Integer.rotateLeft(n * 1616605863, 6) ^ 0xA4760257;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x32D98930;
            if ((n2 ^ n) == 853117232) break block0;
            int cfr_ignored_0 = (0x92A2D8D8 ^ n) + -1746091043;
        }
        return class_3532.method_15362((float)f);
    }

    private static float zhn(float f) {
        block0: {
            int n = tdz.tjh(359641665);
            int n2 = n ^ 0x29D9E3C6;
            if ((n2 ^ n) == 702145478) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x3CB65187 ^ n, 10) - 1584496276;
        }
        return class_3532.method_15362((float)f);
    }

    private static float dhghq(float f) {
        block0: {
            int n = -1456812786;
            n = Integer.rotateLeft(n * -172820431, 6) ^ 0x8F5CDD8;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xA28B12C9;
            if ((n2 ^ n) == -1567943991) break block0;
            int cfr_ignored_0 = (0xBA1DFC7 ^ n) - 178079698;
        }
        return class_3532.method_15374((float)f);
    }

    private static int tsq(int n) {
        block0: {
            int n2 = -1942119781;
            int n3 = (n2 = Integer.rotateLeft(n2 * -2039873255, 12) ^ 0x23EE387F) ^ 0x30E9D565;
            if ((n3 ^ n2) == 820630885) break block0;
            int cfr_ignored_0 = (0xBCD44FFE ^ n2) - 1455215821;
        }
        return Integer.reverse(n);
    }

    private static float ghsq(int n) {
        block0: {
            int n2 = 1434377;
            int n3 = (n2 = Integer.rotateLeft(n2 * -399743983, 19) ^ 0xCD20D6BD) ^ 0x9D729C33;
            if ((n3 ^ n2) == -1653433293) break block0;
            int cfr_ignored_0 = (0x9D677F3A ^ n2) + -1646055761;
        }
        return Float.intBitsToFloat(n);
    }

    private static float sdz_8(int n) {
        block0: {
            int n2 = -1305165435;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1560793411, 15) ^ 0x6A5B00A) ^ 0xF477BB8;
            if ((n3 ^ n2) == 256342968) break block0;
            int cfr_ignored_0 = (0xBD73BA3D ^ n2) + 1274452332;
        }
        return Float.intBitsToFloat(n);
    }

    private static float jfth(int n) {
        block0: {
            int n2 = 310467917;
            n2 = Integer.rotateLeft(n2 * 1390711819, 8) ^ 0xEA46033D;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 19)) ^ 0xC4B86DE;
            if ((n3 ^ n2) == 206276318) break block0;
            int cfr_ignored_0 = (0x1ECADB93 ^ n2) + -1831004816;
        }
        return Float.intBitsToFloat(n);
    }

    private static int shfsh(float f, float f2, float f3) {
        block0: {
            int n = 472455828;
            n = Integer.rotateLeft(n * -2062692159, 15) ^ 0xD26CAE61;
            n = Float.floatToIntBits(f) ^ n;
            n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 22);
            int n2 = n ^ 0x41A6422B;
            if ((n2 ^ n) == 1101414955) break block0;
            int cfr_ignored_0 = (0x5D8F58BF ^ n) - 661766245;
        }
        return Color.HSBtoRGB(f, f2, f3);
    }

    private static boolean hfa(fy fy2) {
        block0: {
            int n = -1815813976;
            n = Integer.rotateLeft(n * 2012437589, 23) ^ 0x356BDFEC;
            fy fy3 = fy2;
            n = (fy3 != null ? System.identityHashCode(fy3) : 0) ^ n;
            int n2 = n ^ 0xCA68A46;
            if ((n2 ^ n) == 212240966) break block0;
            int cfr_ignored_0 = (0x9F626AEE ^ n) - -1416281458;
        }
        return fy2.shghkh();
    }

    private static float bkhw(int n) {
        block0: {
            int n2 = -1627017904;
            n2 = Integer.rotateLeft(n2 * 890823951, 26) ^ 0xBEB8E23A;
            int n3 = (n2 = n ^ n2) ^ 0x2FA81052;
            if ((n3 ^ n2) == 799543378) break block0;
            int cfr_ignored_0 = (0xB0ADBD02 ^ n2) - 429324413;
        }
        return Float.intBitsToFloat(n);
    }

    private static double tzsh_4(long l) {
        block0: {
            int n = 2138657313;
            int n2 = (n = Integer.rotateLeft(n * -498972961, 5) ^ 0x81FF2C17) ^ 0xE158913F;
            if ((n2 ^ n) == -514289345) break block0;
            int cfr_ignored_0 = (0x9E21C31E ^ n) - -1631897530;
        }
        return Double.longBitsToDouble(l);
    }

    private static byq dhq_2(bzw_2 bzw2_2) {
        block0: {
            int n = tdz.tjh(-1243662770);
            bzw_2 bzw3_2 = bzw2_2;
            n = Integer.rotateRight((bzw3_2 != null ? System.identityHashCode(bzw3_2) : 0) ^ n, 25);
            int n2 = n ^ 0xDE559462;
            if ((n2 ^ n) == -564816798) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x6B8AA22C ^ n, 16) - 170345103;
        }
        return bzw2_2.sdsh_4();
    }

    private static byq yy(bzw_2 bzw2_2) {
        block0: {
            int n = 1134607084;
            n = Integer.rotateLeft(n * 1793694679, 5) ^ 0x4944142F;
            bzw_2 bzw3_2 = bzw2_2;
            n = (bzw3_2 != null ? System.identityHashCode(bzw3_2) : 0) ^ n;
            int n2 = n ^ 0xEB3278B6;
            if ((n2 ^ n) == -349013834) break block0;
            int cfr_ignored_0 = (0xA892C25A ^ n) - -1533092383;
        }
        return bzw2_2.sdsh_4();
    }

    private static int jtb(int n, int n2, float f) {
        block0: {
            int n3 = tdz.tjh(-936695332);
            n3 = Integer.rotateRight(n ^ n3, 5);
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 5)) ^ 0x1A6496DD;
            if ((n4 ^ n3) == 442799837) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xD24FBF01 ^ n3, 13) + 2080751706;
            int cfr_ignored_1 = (int)(0x10FD113C27D4EB4FL ^ (long)n3 ^ 0xDF08831A2DB98C2BL);
        }
        return zk_2.bqa_2(n, n2, f);
    }

    private static String[] blr(String string) {
        block0: {
            int n = tdz.tjh(-1574028915);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x70828DA;
            if ((n2 ^ n) == 117975258) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xA5261157 ^ n, 7) - 66697412) * -1524231849;
        }
        return string.split("\u0002\u000e", -1);
    }

    private static CallSite dhmz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1662798382;
            n3 = Integer.rotateLeft(n3 * 1601655121, 16) ^ 0x7D0FD081;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            n3 = Integer.rotateLeft(n ^ n3, 3);
            int n4 = n3 ^ 0xCB099B2E;
            if ((n4 ^ n3) != -888562898) {
                int cfr_ignored_0 = (0xA815D100 ^ n3) - -610129010;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ tdq_2 ^ string.hashCode() ^ n2 + sdw_3 + i * -618615033) + tdq_2) ^ sdw_3));
            }
            String[] stringArray = zk_2.blr(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] i6otugnj99454(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite jkf4pvbr9ol73q(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ tu75jztqu ^ string.hashCode()) + (n2 + d4wseaxkb) + i ^ tu75jztqu, 24) + d4wseaxkb);
            }
            String[] stringArray = zk_2.i6otugnj99454(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

