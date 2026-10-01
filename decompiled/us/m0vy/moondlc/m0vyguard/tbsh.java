/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1297
 *  net.minecraft.class_1308
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 *  org.lwjgl.opengl.GL11
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1308;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL11;
import us.m0vy.moondlc.m0vyguard.bdb;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Tracers", category=bzw.OTHER, desc="Draws lines to tracked entities")
public class tbsh
extends bnq {
    private final badh_2 tbn = new badh_2(this, "Players").bts(true);
    private final badh_2 rkw = new badh_2(this, "Mobs").bts(false);
    private final badh_2 hzm_2 = new badh_2(this, "Show Friends").bts(true);
    private final tay thhz_4 = new tay(this, "Max Dist".concat("ance")).shth_7(Float.intBitsToFloat(1383588901 + -293069861)).dhbs_2(Float.intBitsToFloat(1405061318 - 272599238)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xD3B7BA22 ^ 0xD3A79A22, 10))).ssd_5(Float.intBitsToFloat(0xA8EB8DE6 ^ 0xEA6B8DE6));
    private final tay thha_3 = new tay(this, "Line Width").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(0x453E729A ^ 0x5FE729A)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x339D0F94 ^ 0xAE3B63, 22))).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x9229132A ^ 0x9256932A, 7)));
    private final khd tha_6 = new khd(this, "Target P".concat("oint"));
    private final fy snf = new fy(this.tha_6, "Head");
    private final fy ny = new fy(this.tha_6, "Body").rhh_3();
    private final fy rsh_3 = new fy(this.tha_6, "Legs");
    private final bzw_2 ztr = new bzw_2(this, "Player".concat(" Color")).dhshy(new byq(Float.intBitsToFloat(99097906 - -1033298638), Float.intBitsToFloat(Integer.rotateLeft(0x9954CFCA ^ 0x82ACCFC8, 29)), Float.intBitsToFloat(Integer.reverse(277256086) ^ 0x2A966108), Float.intBitsToFloat(Integer.reverse(2112717488) ^ 0x4E3EB7BE)));
    private final bzw_2 dtl = new bzw_2(this, "Frien".concat("d Color")).dhshy(new byq(0.0f, Float.intBitsToFloat(Integer.rotateLeft(0x67683731 ^ 0x67605F51, 11)), Float.intBitsToFloat(Integer.rotateLeft(0x7FF2011F ^ 0xBFF211C0, 18)), Float.intBitsToFloat(0x42E41DDF ^ 0x19B1DDF)));
    private final bzw_2 dzl_2 = new bzw_2(this, "Mob Color").dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-1119004987) ^ 0xE015B2BD), Float.intBitsToFloat(1262662688 - 135115808), Float.intBitsToFloat(919363909 + 197238459), Float.intBitsToFloat(-981219296 - -2113615840)));
    private final bql<shw_3> khzk_2 = this::khdkh_2;
    private static final int ththy = -576449624;
    private static final int thzq = 712854276;
    private static final int thghd = 1400073801;
    private static final int thyy = 388525216;
    private static final int pvn3xuuu66t = -1304376469;
    private static final int fdiywyygsusg = 1196733354;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int iryfxy4od7c0tc;

    @Override
    public void nt() {
        block0: {
            int n = 1063085618;
            n = Integer.rotateLeft(n * -80043295, 3) ^ 0xEE3882D9;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 21);
            int n2 = n ^ 0x6D9B5A29;
            if ((n2 ^ n) == 1838897705) break block0;
            int cfr_ignored_0 = (0x52C63C1B ^ n) + 1756823323;
        }
    }

    @Override
    public void nc() {
        block0: {
            int n = bdb.tz(-1110749506);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 25);
            int n2 = n ^ 0x6696BEB3;
            if ((n2 ^ n) == 1721155251) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xDB5DF00D ^ n, 14) - -1799507762;
            int cfr_ignored_1 = (int)(0x19EF5E3027D4EB4FL ^ (long)n ^ 0x4110831A2DB99E0FL);
        }
    }

    private void rak_2(class_4587 class_45872, float f) {
        if (tbsh.mc.field_1690.field_1842 || tbsh.mc.field_1724 == null || tbsh.mc.field_1687 == null) {
            return;
        }
        if (this.thha_3.thw_5() <= 0.0f) {
            return;
        }
        class_243 class_2432 = tbsh.mc.field_1773.method_19418().method_19326();
        class_243 class_2433 = class_243.method_1030((float)tbsh.mc.field_1724.method_5695(f), (float)tbsh.mc.field_1724.method_5705(f));
        class_243 class_2434 = class_2433.method_1021(0.1);
        class_4587.class_4665 class_46652 = class_45872.method_23760();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        RenderSystem.setShader((class_10156)class_10142.field_53864);
        RenderSystem.lineWidth((float)this.thha_3.thw_5());
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27377, class_290.field_29337);
        boolean bl = false;
        for (class_1297 class_12972 : tbsh.mc.field_1687.method_18112()) {
            double d;
            class_1309 class_13092;
            if (!(class_12972 instanceof class_1309) || (class_13092 = (class_1309)class_12972) == tbsh.mc.field_1724 || !class_13092.method_5805() || !this.atq_2(class_13092) || (d = (double)tbsh.mc.field_1724.method_5739((class_1297)class_13092)) > (double)this.thhz_4.thw_5()) continue;
            class_243 class_2435 = this.tha_6.dhbn("Head") ? class_13092.method_30950(f).method_1031(0.0, (double)class_13092.method_18381(class_13092.method_18376()), 0.0) : (this.tha_6.dhbn("Body") ? class_13092.method_30950(f).method_1031(0.0, (double)class_13092.method_17682() / 2.0, 0.0) : class_13092.method_30950(f));
            Color color = this.dk_2(class_13092);
            this.rhj_2(class_2872, class_46652, class_2434, class_2435.method_1020(class_2432), color);
            bl = true;
        }
        if (bl) {
            class_286.method_43433((class_9801)class_2872.method_60800());
        }
        GL11.glDisable((int)2848);
        RenderSystem.lineWidth((float)1.0f);
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private boolean atq_2(class_1309 class_13092) {
        int n = 182084404;
        n = Integer.rotateLeft(n * 1104037169, 26) ^ 0x6AC5916;
        n = System.identityHashCode(this) ^ n;
        class_1309 class_13093 = class_13092;
        n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
        int n2 = n ^ 0x53DB24B3;
        if ((n2 ^ n) != 1406870707) {
            int cfr_ignored_0 = (0x59014787 ^ n) + -166745509;
        }
        if (class_13092 instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_13092;
            if (!this.tbn.shzl()) {
                return false;
            }
            if (tbsh.thkhq(Moondlc.getInstance().getFriendManager(), class_16572.method_5477().getString()) && !tbsh.rshs(this.hzm_2)) {
                return false;
            }
            return !tbsh.dqth(class_16572);
        }
        return this.rkw.shzl() && class_13092 instanceof class_1308;
    }

    private Color dk_2(class_1309 class_13092) {
        try {
            int n = 1636254225;
            n = Integer.rotateLeft(n * -1136651021, 5) ^ 0xAB3EBF5B;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xBD67BF5E;
            if ((n2 ^ n) != -1117274274) {
                int cfr_ignored_0 = (0xDCE0FD4F ^ n) + -116335255;
            }
            if ((0x139 & 0) != 0) {
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
        if (class_13092 instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_13092;
            return new Color((tbsh.ddhl(tbsh.dyz_4()).adhj(tbsh.zzy(class_16572).getString()) ? this.dtl.sdsh_4() : tbsh.stgh_3(this.ztr)).rk(), true);
        }
        return new Color(this.dzl_2.sdsh_4().rk(), true);
    }

    private void rhj_2(class_287 class_2872, class_4587.class_4665 class_46652, class_243 class_2432, class_243 class_2433, Color color) {
        try {
            int n = 1968329275;
            n = Integer.rotateLeft(n * 19362921, 13) ^ 0x984BE382;
            class_4587.class_4665 class_46653 = class_46652;
            n = (class_46653 != null ? System.identityHashCode(class_46653) : 0) ^ n;
            class_243 class_2434 = class_2432;
            n = (class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n;
            int n2 = n ^ 0xC9D40AC3;
            if ((n2 ^ n) != -908850493) {
                int cfr_ignored_0 = (0xBC8658F8 ^ n) - -1942569513;
            }
            if ((0x289 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        Vector3f vector3f = this.dhghr((float)(class_2433.field_1352 - class_2432.field_1352), (float)(class_2433.field_1351 - class_2432.field_1351), (float)(class_2433.field_1350 - class_2432.field_1350));
        tbsh.khd(class_2872, class_46652.method_23761(), (float)class_2432.field_1352, (float)class_2432.field_1351, (float)class_2432.field_1350).method_1336(color.getRed(), color.getGreen(), color.getBlue(), tbsh.rsl(color)).method_60831(class_46652, vector3f.x, vector3f.y, vector3f.z);
        class_2872.method_22918(class_46652.method_23761(), (float)class_2433.field_1352, (float)class_2433.field_1351, (float)class_2433.field_1350).method_1336(color.getRed(), color.getGreen(), tbsh.hqd(color), tbsh.ttha(color)).method_60831(class_46652, vector3f.x, vector3f.y, vector3f.z);
    }

    /*
     * Unable to fully structure code
     */
    private Vector3f dhghr(float var1_1, float var2_2, float var3_3) {
        var4_4 = 0.0f;
        var5_5 = null;
        var8_6 = 0;
        var6_7 = -1733457222;
        var6_7 = Integer.rotateLeft(var6_7 * -851904851, 3) ^ -92476863;
        var6_7 = Integer.rotateLeft(System.identityHashCode(this) ^ var6_7, 18);
        var6_7 = Float.floatToIntBits(var1_1) ^ var6_7;
        var7_8 = (var6_7 ^ 667036399 ^ -1338810601) + -1338810601 + -1523994087 - -1523994087;
        block24: while (true) {
            block33: {
                block32: {
                    if ((var8_6 = var7_8 - -1338810601 ^ -1338810601 ^ var6_7) == -752645849) break block32;
                    if (var8_6 == -1558443927) ** GOTO lbl109
                    (Integer.rotateRight(-411049165 ^ var6_7, 15) + 215622248) * -411049165;
                    if (var8_6 == -465841389) ** GOTO lbl170
                    break block33;
                }
                Integer.rotateLeft(1346408261 ^ var6_7, 13) - -1137772394;
                (int)(-7858181599860036785L ^ (long)var6_7 ^ -4647570666986895307L);
                var5_5 = new Vector3f(0.0f, 1.0f, 0.0f);
                if (!bdb.khsgh_2(var6_7, 1102098448)) {
                    (Integer.rotateLeft(-840306311 ^ var6_7, 12) + -206447390) * -840306311;
                    (int)(1106582879780268879L ^ (long)var6_7 ^ 4897808743224947559L);
                }
                var7_8 = (var6_7 ^ -1940307607 ^ -1338810601) + -1338810601;
                continue;
            }
            switch (var8_6) {
                case 971293915: {
                    Integer.rotateRight(-1116961881 ^ var6_7, 10) - -192835468;
                    var5_5 = new Vector3f(var1_1 / var4_4, var2_2 / var4_4, var3_3 / var4_4);
                    try {
                        --var8_6;
                        if ((-6982000104530609485L ^ (long)var6_7 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var7_8 = (var6_7 ^ -1940307607 ^ -1338810601) + -1338810601 + 1716511906 - 1716511906;
                    }
                    catch (NoSuchElementException v0) {
                        var7_8 = (var6_7 ^ -1940307607 ^ -1338810601) + -1338810601 + -1934876268 - -1934876268;
                    }
                    continue block24;
                }
                case 667036399: {
                    Integer.rotateRight(-604913722 ^ var6_7, 14) - -1499211723;
                    var4_4 = tbsh.ghkhb(var1_1 * var1_1 + var2_2 * var2_2 + var3_3 * var3_3);
                    if (var4_4 <= Float.intBitsToFloat(Integer.reverse(1933100641) ^ -1095586855)) {
                        (int)(5487954277611546993L ^ (long)var6_7 ^ -4621443575685237373L);
                        var7_8 = (var6_7 ^ 1666974748 ^ -1338810601) + -1338810601 ^ 273760962 ^ 273760962;
                        (int)(7417304821862476183L ^ (long)var6_7 ^ -2040271932803686386L);
                        var7_8 = (var6_7 ^ -752645849 ^ -1338810601) + -1338810601 + 926727515 - 926727515;
                        ++var8_6;
                        continue block24;
                    }
                    (int)(8683250956944700438L ^ (long)var6_7 ^ -4032291532558345005L);
                    var7_8 = (var6_7 ^ -1552454315 ^ -1338810601) + -1338810601 ^ 43656392 ^ 43656392;
                    (int)(-84927101512233663L ^ (long)var6_7 ^ 8354275909974642805L);
                    var7_8 = (var6_7 ^ 971293915 ^ -1338810601) + -1338810601;
                    continue block24;
                }
                case -255532262: {
                    (Integer.rotateRight(1873136606 ^ var6_7, 16) - -1989062883) * 1873136607;
                    var7_8 = (var6_7 ^ -645215138 ^ -1338810601) + -1338810601 ^ -1480959202 ^ -1480959202;
                    Integer.rotateLeft(-1149487411 ^ var6_7, 10) - -1201126898;
                    (int)(8777120881019513679L ^ (long)var6_7 ^ -3706318344866406836L);
                    if (bdb.khsgh_2(var6_7, 327489592)) {
                        (Integer.rotateRight(877081303 ^ var6_7, 9) - 1492961092) * 877081303;
                    }
                    var7_8 = Integer.reverse(Integer.reverse((var6_7 ^ 667036399 ^ -1338810601) + -1338810601));
                    continue block24;
                }
                case 22700062: {
                    Integer.rotateRight(-292311134 ^ var6_7, 16) + -398466087;
                    try {
                        --var8_6;
                        if ((-2949997392175243089L ^ (long)var6_7 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var7_8 = (var6_7 ^ 667036399 ^ -1338810601) + -1338810601 + 1986364309 - 1986364309;
                    }
                    catch (UnsupportedOperationException v1) {
                        var7_8 = (var6_7 ^ 667036399 ^ -1338810601) + -1338810601 + -1298961901 - -1298961901;
                    }
                    var8_6 += 4;
                    continue block24;
                }
                case 1296165526: {
                    (Integer.rotateRight(-90023629 ^ var6_7, 18) + 1577479272) * -90023629;
                    (int)(-2993665067876445405L ^ (long)var6_7 ^ 5153936320550142265L);
                    var7_8 = (int)((long)((var6_7 ^ 667036399 ^ -1338810601) + -1338810601) ^ 7552924013540489735L ^ 7552924013540489735L);
                    continue block24;
                }
                case 178304088: {
                    (Integer.rotateRight(-588788170 ^ var6_7, 14) - -999319611) * -588788169;
                    var7_8 = (var6_7 ^ -1750476342 ^ -1338810601) + -1338810601 ^ 974282299 ^ 974282299;
                    Integer.rotateLeft(371187752 ^ var6_7, 5) + -1304837101;
                    if (bdb.khsgh_2(var6_7, 2037037815)) {
                        (Integer.rotateLeft(1588105240 ^ var6_7, 14) + 2059866659) * 1588105241;
                    }
                    var7_8 = (int)((long)((var6_7 ^ 667036399 ^ -1338810601) + -1338810601) ^ -8410728210334005225L ^ -8410728210334005225L);
                    var8_6 += 3;
                    continue block24;
                }
lbl109:
                // 1 sources

                (Integer.rotateLeft(304619960 ^ var6_7, 5) + 926528643) * 304619961;
                var7_8 = Integer.reverse(Integer.reverse((var6_7 ^ -1644319326 ^ -1338810601) + -1338810601));
                (Integer.rotateLeft(-575898639 ^ var6_7, 14) + -599744150) * -575898639;
                (int)(2242464737295395663L ^ (long)var6_7 ^ 6262399430318199788L);
                var7_8 = (int)((long)((var6_7 ^ -2007046054 ^ -1338810601) + -1338810601) ^ 4551355752669863999L ^ 4551355752669863999L);
                Integer.rotateLeft(-727772723 ^ var6_7, 13) - -1012873458;
                (int)(1598144480967715663L ^ (long)var6_7 ^ -9038580303673065078L);
                var7_8 = (int)((long)((var6_7 ^ 667036399 ^ -1338810601) + -1338810601) ^ -8548145553472744563L ^ -8548145553472744563L);
                var8_6 += 2;
                continue block24;
                case 393441294: {
                    bdb.zdy_3(-648772000, var6_7);
                    (int)(5144236508995812373L ^ (long)var6_7 ^ 198776476694029078L);
                    var7_8 = (var6_7 ^ 667036399 ^ -1338810601) + -1338810601;
                    var8_6 -= 3;
                    continue block24;
                }
                case -1713442825: {
                    (Integer.rotateRight(-1465737186 ^ var6_7, 8) - 1880031965) * -1465737185;
                    var7_8 = Integer.reverse(Integer.reverse((var6_7 ^ 1718818491 ^ -1338810601) + -1338810601));
                    (Integer.rotateLeft(-1758302243 ^ var6_7, 5) - 1400449790) * -1758302243;
                    (int)(6161137458727938895L ^ (long)var6_7 ^ 9128940593139484368L);
                    try {
                        var8_6 -= 2;
                        var7_8 = Integer.reverse(Integer.reverse((var6_7 ^ 667036399 ^ -1338810601) + -1338810601));
                    }
                    catch (IllegalStateException v2) {
                        var7_8 = (int)((long)((var6_7 ^ 667036399 ^ -1338810601) + -1338810601) ^ -7878287569143082551L ^ -7878287569143082551L);
                    }
                    var8_6 += 3;
                    continue block24;
                }
                case -931373408: {
                    (Integer.rotateRight(-494334926 ^ var6_7, 15) + 1928730953) * -494334925;
                    var7_8 = (var6_7 ^ 1824812841 ^ -1338810601) + -1338810601;
                    (Integer.rotateLeft(1044162705 ^ var6_7, 10) + -1917450038) * 1044162705;
                    (int)(-248253592986391729L ^ (long)var6_7 ^ -1141518357078977331L);
                    try {
                        var7_8 = (var6_7 ^ 667036399 ^ -1338810601) + -1338810601;
                    }
                    catch (NoSuchElementException v3) {
                        var7_8 = (var6_7 ^ 667036399 ^ -1338810601) + -1338810601;
                    }
                    var8_6 -= 5;
                    continue block24;
                }
                case 1491839811: {
                    Integer.rotateLeft(-1590007384 ^ var6_7, 7) + -1972344173;
                    (int)(4309199618446610188L ^ (long)var6_7 ^ 5260586133225462347L);
                    var7_8 = Integer.reverse(Integer.reverse((var6_7 ^ 667036399 ^ -1338810601) + -1338810601));
                    continue block24;
                }
lbl170:
                // 1 sources

                Integer.rotateRight(1662121710 ^ var6_7, 15) - 59409933;
                var7_8 = (int)((long)((var6_7 ^ 1873307943 ^ -1338810601) + -1338810601) ^ -9011087419003304778L ^ -9011087419003304778L);
                Integer.rotateLeft(-1930665115 ^ var6_7, 4) - 352168054;
                (int)(5647176761278262095L ^ (long)var6_7 ^ 7476119529894523244L);
                try {
                    var8_6 -= 4;
                    if ((7420006542455919437L ^ (long)var6_7 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    var7_8 = Integer.reverse(Integer.reverse((var6_7 ^ 667036399 ^ -1338810601) + -1338810601));
                }
                catch (ArithmeticException v4) {
                    var7_8 = (var6_7 ^ 667036399 ^ -1338810601) + -1338810601 + -1144487458 - -1144487458;
                }
                ++var8_6;
                continue block24;
                case 1467421670: {
                    Integer.rotateLeft(832034401 ^ var6_7, 9) + 96507130;
                    (int)(-926201811154179249L ^ (long)var6_7 ^ 993187866294635419L);
                    var7_8 = Integer.reverse(Integer.reverse((var6_7 ^ 667036399 ^ -1338810601) + -1338810601));
                    (Integer.rotateLeft(-2110711043 ^ var6_7, 3) - -934288418) * -2110711043;
                    (int)(4648757977771469647L ^ (long)var6_7 ^ -7714522013226160938L);
                    var8_6 += 5;
                    continue block24;
                }
                case -1940307607: {
                    return var5_5;
                }
            }
            (Integer.rotateLeft(253049597 ^ var6_7, 4) - -672152610) * 253049597;
            (int)(-3627767421800748209L ^ (long)var6_7 ^ -3102835994798836066L);
            var7_8 = Integer.reverse(Integer.reverse((var6_7 ^ 667036399 ^ -1338810601) + -1338810601));
        }
    }

    private void khdkh_2(shw_3 shw2) {
        int n = -1112202994;
        n = Integer.rotateLeft(n * 52546689, 26) ^ 0x5A804C46;
        shw_3 shw3 = shw2;
        n = Integer.rotateRight((shw3 != null ? System.identityHashCode(shw3) : 0) ^ n, 7);
        int n2 = n ^ 0x9AB8FFAD;
        if ((n2 ^ n) != -1699151955) {
            int cfr_ignored_0 = (0x270DDEA3 ^ n) + 1429384105;
        }
        this.rak_2(shw2.ssha_2(), shw2.skz_4());
    }

    private static String dhft(String string, int n, int n2, int n3) {
        int n4 = 241858252;
        n4 = Integer.rotateLeft(n4 * -751983379, 12) ^ 0x501794AB;
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 25);
        int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 19)) ^ 0x33A0582B;
        if ((n5 ^ n4) != 866146347) {
            int cfr_ignored_0 = (0x3DCA2EE7 ^ n4) + 1272022342;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x117CE266 ^ n2 ^ i * 392066273 ^ ththy, 20) ^ thzq));
        }
        return new String(cArray);
    }

    private static boolean thkhq(kh_3 kh2, String string) {
        block0: {
            int n = bdb.tz(1414505422);
            kh_3 kh3 = kh2;
            n = (kh3 != null ? System.identityHashCode(kh3) : 0) ^ n;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xDABCF41A;
            if ((n2 ^ n) == -625150950) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x8EF357D4 ^ n, 4) - 1406484967) * -1896654891;
        }
        return kh2.adhj(string);
    }

    private static boolean rshs(badh_2 badh2) {
        block0: {
            int n = bdb.tz(2020737444);
            badh_2 badh3 = badh2;
            n = (badh3 != null ? System.identityHashCode(badh3) : 0) ^ n;
            int n2 = n ^ 0xEA6AF47B;
            if ((n2 ^ n) == -362089349) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x9218F5DF ^ n, 5) - -1251777220) * -1843857953;
        }
        return badh2.shzl();
    }

    private static boolean dqth(class_1657 class_16572) {
        block0: {
            int n = 1812986620;
            n = Integer.rotateLeft(n * 886049993, 9) ^ 0xBEE4AE60;
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0x7391DCDB;
            if ((n2 ^ n) == 1938939099) break block0;
            int cfr_ignored_0 = (0x1F9E2627 ^ n) - -1339015904;
        }
        return class_16572.method_7325();
    }

    private static Moondlc dyz_4() {
        block0: {
            int n = -1025747017;
            int n2 = (n = Integer.rotateLeft(n * 881722483, 8) ^ 0x1254E17A) ^ 0xBE1C9EC2;
            if ((n2 ^ n) == -1105420606) break block0;
            int cfr_ignored_0 = (0x7CC0C975 ^ n) + -1852687414;
        }
        return Moondlc.getInstance();
    }

    private static kh_3 ddhl(Moondlc moondlc) {
        block0: {
            int n = 1855757233;
            int n2 = (n = Integer.rotateLeft(n * 963475199, 27) ^ 0x97362EF5) ^ 0x76B2A0AB;
            if ((n2 ^ n) == 1991418027) break block0;
            int cfr_ignored_0 = (0x182E3B1A ^ n) + -1541007448;
        }
        return moondlc.getFriendManager();
    }

    private static class_2561 zzy(class_1657 class_16572) {
        block0: {
            int n = 730705322;
            n = Integer.rotateLeft(n * -1383945939, 6) ^ 0x9671D004;
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0x83118438;
            if ((n2 ^ n) == -2096004040) break block0;
            int cfr_ignored_0 = (0xA89C2992 ^ n) - 2009092000;
        }
        return class_16572.method_5477();
    }

    private static byq stgh_3(bzw_2 bzw2_2) {
        block0: {
            int n = bdb.tz(-82621369);
            int n2 = n ^ 0xB72241F5;
            if ((n2 ^ n) == -1222491659) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x4C310DB2 ^ n, 12) + 1045317577) * 1278283187;
        }
        return bzw2_2.sdsh_4();
    }

    private static class_4588 khd(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3) {
        block0: {
            int n = 209203213;
            n = Integer.rotateLeft(n * 953477771, 21) ^ 0x650B3AE4;
            class_287 class_2873 = class_2872;
            n = Integer.rotateLeft((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n, 12);
            Matrix4f matrix4f2 = matrix4f;
            n = (matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n;
            int n2 = n ^ 0x300F4B0F;
            if ((n2 ^ n) == 806308623) break block0;
            int cfr_ignored_0 = (0x3C777B02 ^ n) - 282031213;
        }
        return class_2872.method_22918(matrix4f, f, f2, f3);
    }

    private static int rsl(Color color) {
        block0: {
            int n = -1805253344;
            int n2 = (n = Integer.rotateLeft(n * 240481309, 21) ^ 0xE8758675) ^ 0x41248C0E;
            if ((n2 ^ n) == 1092914190) break block0;
            int cfr_ignored_0 = (0xD542892E ^ n) + 46909186;
        }
        return color.getAlpha();
    }

    private static int hqd(Color color) {
        block0: {
            int n = 1257869548;
            int n2 = (n = Integer.rotateLeft(n * 719176145, 25) ^ 0xF3954819) ^ 0xDBF3694C;
            if ((n2 ^ n) == -604804788) break block0;
            int cfr_ignored_0 = (0x910AF9A0 ^ n) - 1409756007;
        }
        return color.getBlue();
    }

    private static int ttha(Color color) {
        block0: {
            int n = bdb.tz(-166744916);
            Color color2 = color;
            n = (color2 != null ? System.identityHashCode(color2) : 0) ^ n;
            int n2 = n ^ 0xD8C7ECCB;
            if ((n2 ^ n) == -657986357) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x2EC84067 ^ n, 8) - -1365414988;
        }
        return color.getAlpha();
    }

    private static float ghkhb(float f) {
        block0: {
            int n = 2118565860;
            int n2 = (n = Integer.rotateLeft(n * 792463187, 10) ^ 0x451271D0) ^ 0x4DD6359D;
            if ((n2 ^ n) == 1305884061) break block0;
            int cfr_ignored_0 = (0x33908A79 ^ n) - 1720691162;
        }
        return class_3532.method_15355((float)f);
    }

    private static String[] ayh(String string) {
        block0: {
            int n = -917229121;
            int n2 = (n = Integer.rotateLeft(n * -1340380119, 17) ^ 0x273A16F0) ^ 0x6384BD58;
            if ((n2 ^ n) == 1669643608) break block0;
            int cfr_ignored_0 = (0xAAD08CE7 ^ n) + 2033382465;
        }
        return string.split("\b\u000e", -1);
    }

    private static CallSite sfs(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1356809135;
            n3 = Integer.rotateLeft(n3 * -657697425, 24) ^ 0x483E1CF9;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            n3 = n ^ n3;
            int n4 = n3 ^ 0xC9309976;
            if ((n4 ^ n3) != -919561866) {
                int cfr_ignored_0 = (0x66102527 ^ n3) + 694517224;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ thghd ^ string.hashCode() ^ n2 + thyy ^ i * 341103459 ^ thghd, 26) ^ thyy));
            }
            String[] stringArray = tbsh.ayh(new String(cArray));
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

    private static String[] nnu4uv9f0(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite hjw83w23li7wjm(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ pvn3xuuu66t ^ string.hashCode()) + (n2 + fdiywyygsusg) + i ^ pvn3xuuu66t, 3) + fdiywyygsusg);
            }
            String[] stringArray = tbsh.nnu4uv9f0(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

