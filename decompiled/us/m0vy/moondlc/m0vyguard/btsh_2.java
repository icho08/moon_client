/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1657
 *  net.minecraft.class_1802
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_7833
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.lwjgl.opengl.GL11
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
import java.util.NoSuchElementException;
import lombok.Generated;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_7833;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import us.m0vy.moondlc.m0vyguard.bbd_2;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.dhgh_3;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.ssh_8;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fd_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Wings", category=bzw.OTHER, desc="Translucent wings behind your back")
public class btsh_2
extends bnq {
    private static btsh_2 tth_4;
    private static final float dz = 8.0f;
    private static final int dsj_2 = 220;
    private static final dhgh_3[] rtw;
    public final bbd_2 zad_3 = new bbd_2(this, "Show To");
    public final s_3 dkhd = new s_3(this.zad_3, "Self").thst();
    public final s_3 zms = new s_3(this.zad_3, "Friends").thst();
    public final s_3 shkhh_2 = new s_3(this.zad_3, "Others");
    private final tay bsgh_2 = new tay(this, "Size").shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x488CB691 ^ 0x488CC811, 15))).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xD270CFB3 ^ 0x7585562A, 3))).rkh_3(Float.intBitsToFloat(1281908899 - 253465558)).ssd_5(1.0f);
    private final badh_2 thza_4 = new badh_2(this, "Theme Color").bts(true);
    private final bzw_2 dhsa_3 = new bzw_2(this, "Color 1", this::zdhr_2).dhshy(new byq(Float.intBitsToFloat(Integer.rotateLeft(0x530E1C8C ^ 0x530A2B7C, 12)), Float.intBitsToFloat(102582754 - -1009432094), Float.intBitsToFloat(Integer.rotateLeft(0xC0726928 ^ 0xE1F96928, 1)), Float.intBitsToFloat(-517845017 + 1650241561)));
    private final bzw_2 sdn_3 = new bzw_2(this, "Color 2", this::thsd_4).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-258358929) ^ 0xB4CB990F), Float.intBitsToFloat(Integer.reverse(830364438) ^ 0x2BCC7E8C), Float.intBitsToFloat(1481143981 + -348747437), Float.intBitsToFloat(0x312112D7 ^ 0x725E12D7)));
    private float thhth_2;
    private boolean bar_2;
    private final bql<shw_3> twz_2 = this::bshn;
    private static final int dhrw = -2119119841;
    private static final int thhq_2 = 293139449;
    private static final int hsh = -522717554;
    private static final int dza_2 = -1960931351;
    private static final int u5aolzb526 = -188864139;
    private static final int sfi6l8te6wcf = 2054956950;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int lankix1k4ae;

    public btsh_2() {
        tth_4 = this;
    }

    /*
     * Unable to fully structure code
     */
    private int dtkh(int var1_1) {
        var2_2 = 0.0f;
        var3_3 = 0;
        var6_4 = 0;
        var4_5 = 504300402;
        var4_5 = Integer.rotateLeft(var4_5 * 1094319385, 13) ^ 537994739;
        var4_5 = Integer.rotateRight(System.identityHashCode(this) ^ var4_5, 25);
        var5_6 = var4_5 ^ -1319223138 ^ -104747137 ^ -104747137;
        while (true) {
            block46: {
                block39: {
                    block35: {
                        block40: {
                            block36: {
                                block43: {
                                    block37: {
                                        block45: {
                                            block44: {
                                                block38: {
                                                    block34: {
                                                        block33: {
                                                            block41: {
                                                                block42: {
                                                                    var6_4 = var5_6 ^ var4_5;
                                                                    switch (var6_4 & 7) {
                                                                        case 1: {
                                                                            if (var6_4 == 894567625) break block33;
                                                                            if (var6_4 == 777782169) break block34;
                                                                            if (var6_4 != 15348505) {
                                                                                ** break;
                                                                            }
                                                                            break block35;
                                                                        }
                                                                        case 3: {
                                                                            if (var6_4 != 49860619) {
                                                                                ** break;
                                                                            }
                                                                            break block36;
                                                                        }
                                                                        case 4: {
                                                                            if (var6_4 != -1267406548) {
                                                                                ** break;
                                                                            }
                                                                            break block37;
                                                                        }
                                                                        case 5: {
                                                                            if (var6_4 == -1668539931) break block38;
                                                                            if (var6_4 == 697334885) break;
                                                                            Integer.rotateLeft(-2145684031 ^ var4_5, 3) + -2018451046;
                                                                            (int)(4803612353613851471L ^ (long)var4_5 ^ 5370686704098814082L);
                                                                            if (var6_4 == 1415789029) break block39;
                                                                            if (var6_4 != -173365883) {
                                                                                ** break;
                                                                            }
                                                                            break block40;
                                                                        }
                                                                        case 6: {
                                                                            if (var6_4 == -1319223138) break block41;
                                                                            if (var6_4 == -1994370754) break block42;
                                                                            if (var6_4 == -786549770) break block43;
                                                                            if (var6_4 == 789559406) break block44;
                                                                            if (var6_4 != -1848472698) {
                                                                                (Integer.rotateLeft(75949209 ^ var4_5, 3) + -1867297342) * 75949209;
                                                                                (int)(-4164621686507508913L ^ (long)var4_5 ^ 7509896527099732409L);
                                                                                ** break;
                                                                            }
                                                                            break block45;
                                                                        }
                                                                        case 7: {
                                                                            if (var6_4 != 1487807007) {
                                                                                ** break;
                                                                            }
                                                                            break block46;
                                                                        }
                                                                    }
                                                                    (Integer.rotateRight(-35252686 ^ var4_5, 18) + -1019588791) * -35252685;
                                                                    var2_2 = (float)((Math.sin((double)var1_1 * Double.longBitsToDouble(-6434920028522099898L ^ -7410980282866933955L) + (double)System.currentTimeMillis() * Double.longBitsToDouble(-1650922029149801885L ^ -2992961478520661089L)) + 1.0) / Double.longBitsToDouble(-8400535377419651082L ^ -3788849358992263178L));
                                                                    var3_3 = btsh_2.tjs(this.dhsa_3.sdsh_4(), btsh_2.ajf(this.sdn_3), var2_2).rk();
                                                                    (int)(-8097286962647856885L ^ (long)var4_5 ^ -5935311917719440752L);
                                                                    var5_6 = (int)((long)(var4_5 ^ 325375943) ^ 8333391126164284579L ^ 8333391126164284579L);
                                                                    (int)(2248319085823185946L ^ (long)var4_5 ^ -5051063224408763466L);
                                                                    var5_6 = var4_5 ^ 1487807007 ^ 1725425680 ^ 1725425680;
                                                                    continue;
                                                                }
                                                                (Integer.rotateLeft(734858680 ^ var4_5, 8) + 1379027075) * 734858681;
                                                                var3_3 = btsh_2.sqgh_2(bas_4.hmq(var1_1));
                                                                var5_6 = var4_5 ^ -458001858;
                                                                Integer.rotateLeft(1433364772 ^ var4_5, 13) - 1557879447;
                                                                var5_6 = var4_5 ^ 1487807007 ^ 531046086 ^ 531046086;
                                                                var6_4 += 2;
                                                                continue;
                                                            }
                                                            (Integer.rotateLeft(-1003918892 ^ var4_5, 11) - -983470105) * -1003918891;
                                                            if (!this.thza_4.shzl()) {
                                                                var5_6 = (int)((long)(var4_5 ^ 697334885) ^ 6479910516414961939L ^ 6479910516414961939L);
                                                                (Integer.rotateRight(-1205514990 ^ var4_5, 10) + 1356985449) * -1205514989;
                                                                continue;
                                                            }
                                                            var5_6 = (int)((long)(var4_5 ^ -1994370754) ^ 7247353758217727660L ^ 7247353758217727660L);
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(683351304 ^ var4_5, 8) + -217701581;
                                                        try {
                                                            var6_4 += 3;
                                                            if ((-4701282447961936281L ^ (long)var4_5 | 1L) == 0L) {
                                                                throw new NoSuchElementException();
                                                            }
                                                            var5_6 = Integer.reverse(Integer.reverse(var4_5 ^ -1319223138));
                                                        }
                                                        catch (NoSuchElementException v0) {
                                                            var5_6 = Integer.reverse(Integer.reverse(var4_5 ^ -1319223138));
                                                        }
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(-1343235651 ^ var4_5, 8) - 1382612254) * -1343235651;
                                                    (int)(7880586315276020559L ^ (long)var4_5 ^ 1328706038533814123L);
                                                    var5_6 = (var4_5 ^ -22155752) + -904394706 - -904394706;
                                                    (Integer.rotateLeft(-749621803 ^ var4_5, 13) - -1690194938) * -749621803;
                                                    (int)(1288878213993655119L ^ (long)var4_5 ^ -387165419494339049L);
                                                    var5_6 = var4_5 ^ -1319223138 ^ 1245554304 ^ 1245554304;
                                                    Integer.rotateRight(-2114177205 ^ var4_5, 3) + -1041739440;
                                                    var6_4 += 3;
                                                    continue;
                                                }
                                                (Integer.rotateRight(2073395547 ^ var4_5, 18) + -76003008) * 2073395547;
                                                var5_6 = Integer.reverse(Integer.reverse(var4_5 ^ 1718181223));
                                                Integer.rotateRight(809476303 ^ var4_5, 9) - -602793908;
                                                try {
                                                    var6_4 += 4;
                                                    if ((4349999618696782045L ^ (long)var4_5 | 1L) == 0L) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    var5_6 = Integer.reverse(Integer.reverse(var4_5 ^ -1319223138));
                                                }
                                                catch (IllegalArgumentException v1) {
                                                    var5_6 = (int)((long)(var4_5 ^ -1319223138) ^ 7217624928526441355L ^ 7217624928526441355L);
                                                }
                                                var6_4 -= 5;
                                                continue;
                                            }
                                            Integer.rotateLeft(966425740 ^ var4_5, 10) - -32328657;
                                            var5_6 = (int)((long)(var4_5 ^ -1797315077) ^ -8789842065987302190L ^ -8789842065987302190L);
                                            (Integer.rotateRight(-909623461 ^ var4_5, 12) + 1939688256) * -909623461;
                                            var5_6 = var4_5 ^ -1319223138 ^ -433222573 ^ -433222573;
                                            var6_4 -= 2;
                                            continue;
                                        }
                                        (Integer.rotateRight(-1794388238 ^ var4_5, 5) + 281783945) * -1794388237;
                                        var5_6 = var4_5 ^ 1855620620 ^ 115946359 ^ 115946359;
                                        (Integer.rotateRight(-1824391501 ^ var4_5, 5) + -648317208) * -1824391501;
                                        try {
                                            var6_4 += 3;
                                            var5_6 = (var4_5 ^ -1319223138) + -205667834 - -205667834;
                                        }
                                        catch (IllegalStateException v2) {
                                            var5_6 = Integer.reverse(Integer.reverse(var4_5 ^ -1319223138));
                                        }
                                        var6_4 += 4;
                                        continue;
                                    }
                                    (Integer.rotateRight(1363212795 ^ var4_5, 13) + -616831840) * 1363212795;
                                    var5_6 = var4_5 ^ 381335662 ^ -1365440143 ^ -1365440143;
                                    Integer.rotateRight(-1023117022 ^ var4_5, 11) + -1578612135;
                                    try {
                                        if ((4686179150598148209L ^ (long)var4_5 | 1L) == 0L) {
                                            throw new IllegalStateException();
                                        }
                                        var5_6 = var4_5 ^ -1319223138 ^ -2058213 ^ -2058213;
                                    }
                                    catch (IllegalStateException v3) {
                                        var5_6 = (int)((long)(var4_5 ^ -1319223138) ^ 5624329558028918572L ^ 5624329558028918572L);
                                    }
                                    var6_4 -= 2;
                                    continue;
                                }
                                (Integer.rotateLeft(180921649 ^ var4_5, 4) + 1386848298) * 180921649;
                                (int)(-4000873172129486001L ^ (long)var4_5 ^ -1483791928759141083L);
                                var5_6 = var4_5 ^ 1823668033;
                                (Integer.rotateRight(-1617551142 ^ var4_5, 6) + 1468766625) * -1617551141;
                                var5_6 = (int)((long)(var4_5 ^ -1319223138) ^ -8858583216914528480L ^ -8858583216914528480L);
                                continue;
                            }
                            Integer.rotateRight(-294564313 ^ var4_5, 16) - -468314636;
                            try {
                                var6_4 -= 3;
                                if ((-8426804311071758953L ^ (long)var4_5 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                var5_6 = Integer.reverse(Integer.reverse(var4_5 ^ -1319223138));
                            }
                            catch (IllegalStateException v4) {
                                var5_6 = var4_5 ^ -1319223138 ^ 2090065689 ^ 2090065689;
                            }
                            continue;
                        }
                        Integer.rotateLeft(-1945804148 ^ var4_5, 4) - -117141969;
                        var5_6 = Integer.reverse(Integer.reverse(var4_5 ^ 1760665006));
                        (Integer.rotateRight(-1857056425 ^ var4_5, 5) - -1660929852) * -1857056425;
                        var5_6 = Integer.reverse(Integer.reverse(var4_5 ^ -1319223138));
                        (Integer.rotateLeft(320366453 ^ var4_5, 5) - 1414669926) * 320366453;
                        (int)(-3338634861998707889L ^ (long)var4_5 ^ 8061587481452613252L);
                        continue;
                    }
                    Integer.rotateLeft(-510219420 ^ var4_5, 15) - 1436311639;
                    var5_6 = var4_5 ^ -176362441;
                    Integer.rotateRight(-938304850 ^ var4_5, 12) - 1050565197;
                    var5_6 = var4_5 ^ -1319223138;
                    (Integer.rotateRight(1689161175 ^ var4_5, 15) - 897633348) * 1689161175;
                    var6_4 -= 2;
                    continue;
                }
                Integer.rotateLeft(1794630176 ^ var4_5, 16) + -127794917;
                try {
                    if ((3361223618016482331L ^ (long)var4_5 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    var5_6 = var4_5 ^ -1319223138;
                }
                catch (IllegalStateException v5) {
                    var5_6 = var4_5 ^ -1319223138 ^ 488752028 ^ 488752028;
                }
                continue;
            }
            return var3_3;
lbl222:
            // 7 sources

            (Integer.rotateLeft(93022549 ^ var4_5, 3) - -1338023802) * 93022549;
            (int)(-4091019536330593457L ^ (long)var4_5 ^ 8331803459094848418L);
            var5_6 = (int)((long)(var4_5 ^ -1319223138) ^ 4980381190882837920L ^ 4980381190882837920L);
        }
    }

    private boolean jdy_2(class_1657 class_16572) {
        block0: {
            int n = ssh_8.ssw(682094516);
            n = System.identityHashCode(this) ^ n;
            class_1657 class_16573 = class_16572;
            n = Integer.rotateRight((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 10);
            int n2 = n ^ 0x5734D453;
            if ((n2 ^ n) == 1463080019) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x7F933BE7 ^ n, 18) - 1999757364;
        }
        return class_16572.method_6118(class_1304.field_6174).method_31574(class_1802.field_8833);
    }

    private void shghd_2(class_4587 class_45872, class_1657 class_16572, float f, class_243 class_2432) {
        double d = class_3532.method_16436((double)f, (double)class_16572.field_6014, (double)class_16572.method_23317()) - class_2432.field_1352;
        double d2 = class_3532.method_16436((double)f, (double)class_16572.field_6036, (double)class_16572.method_23318()) - class_2432.field_1351;
        double d3 = class_3532.method_16436((double)f, (double)class_16572.field_5969, (double)class_16572.method_23321()) - class_2432.field_1350;
        float f2 = this.zzgh(class_16572, f);
        float f3 = class_3532.method_15363((float)class_16572.field_42108.method_48570(f), (float)0.0f, (float)1.0f);
        fd_2 fd2_2 = this.jsz_4(class_16572, f);
        if (fd2_2 == null) {
            return;
        }
        float f4 = (float)Math.sin(((float)class_16572.field_6012 + f) * fd2_2.bjs_2) * fd2_2.ttkh_2;
        float f5 = (8.0f + f4 + f3 * fd2_2.thtt_3) * fd2_2.shkf;
        float f6 = this.bsgh_2.hkj() * fd2_2.jrl;
        int n = this.hal();
        int n2 = this.jal_2(n);
        int n3 = this.dbkh(n);
        int n4 = n;
        class_45872.method_22903();
        class_45872.method_22904(d, d2, d3);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(180.0f - f2));
        if (fd2_2.twt_2 != 0.0f || fd2_2.tsdh_2 != 0.0f) {
            class_45872.method_46416(0.0f, fd2_2.twt_2, fd2_2.tsdh_2);
        }
        if (fd2_2.shta_3 != 0.0f) {
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(fd2_2.shta_3));
        }
        if (fd2_2.hst_4 != 0.0f) {
            class_45872.method_22907(class_7833.field_40718.rotationDegrees(fd2_2.hst_4));
        }
        class_45872.method_46416(0.0f, fd2_2.dhwf, fd2_2.dhbz_2);
        class_45872.method_22905(f6, f6, f6);
        this.tthy_2(class_45872, -1.0f, f5, n, n2, n3, n4, fd2_2);
        this.tthy_2(class_45872, 1.0f, f5, n, n2, n3, n4, fd2_2);
        class_45872.method_22909();
    }

    private void tthy_2(class_4587 class_45872, float f, float f2, int n, int n2, int n3, int n4, fd_2 fd2_2) {
        class_45872.method_22903();
        class_45872.method_46416(f * fd2_2.khka, fd2_2.zyt_2, fd2_2.bsb_2);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(f * f2));
        class_45872.method_22907(class_7833.field_40718.rotationDegrees(f * fd2_2.shbq));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(fd2_2.hjgh));
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        this.sthh_3(class_45872, f, 1.22f, btsh_2.sfsh_2(n2, 48), btsh_2.sfsh_2(n2, 0));
        this.sthh_3(class_45872, f, 0.84f, btsh_2.sfsh_2(n3, 57), btsh_2.sfsh_2(n3, 0));
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA);
        this.sthh_3(class_45872, f, 1.0f, btsh_2.sfsh_2(n, 220), btsh_2.sfsh_2(n, 10));
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        this.khaa(class_45872, f, 1.0f, btsh_2.sfsh_2(n4, 136));
        this.sdj_3(class_45872, f, 0.96f, btsh_2.sfsh_2(n2, 44));
        class_45872.method_22909();
    }

    private void sthh_3(class_4587 class_45872, float f, float f2, int n, int n2) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27379, class_290.field_1576);
        for (int i = 0; i < rtw.length; ++i) {
            dhgh_3 dhgh2 = rtw[i];
            dhgh_3 dhgh3 = rtw[(i + 1) % rtw.length];
            this.bkhs(class_2872, matrix4f, 0.0f, 0.0f, 0.0f, n);
            this.bkhs(class_2872, matrix4f, f * dhgh2.dhdd_4 * f2, dhgh2.dqdh * f2, 0.0f, this.dyth(n2, dhgh2.btha));
            this.bkhs(class_2872, matrix4f, f * dhgh3.dhdd_4 * f2, dhgh3.dqdh * f2, 0.0f, this.dyth(n2, dhgh3.btha));
        }
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
    }

    private void khaa(class_4587 class_45872, float f, float f2, int n) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.lineWidth((float)1.35f);
        GL11.glEnable((int)2848);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29345, class_290.field_1576);
        for (dhgh_3 dhgh2 : rtw) {
            this.bkhs(class_2872, matrix4f, f * dhgh2.dhdd_4 * f2, dhgh2.dqdh * f2, 0.0f, n);
        }
        this.bkhs(class_2872, matrix4f, f * btsh_2.rtw[0].dhdd_4 * f2, btsh_2.rtw[0].dqdh * f2, 0.0f, n);
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
        GL11.glDisable((int)2848);
    }

    private void sdj_3(class_4587 class_45872, float f, float f2, int n) {
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        int[] nArray = new int[]{2, 4, 7, 9, 11};
        RenderSystem.lineWidth((float)0.9f);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
        for (int n2 : nArray) {
            dhgh_3 dhgh2 = rtw[n2];
            this.bkhs(class_2872, matrix4f, 0.0f, 0.0f, 0.0f, btsh_2.sfsh_2(n, Math.max(8, (int)((float)btsh_2.thww(n) * 0.75f))));
            this.bkhs(class_2872, matrix4f, f * dhgh2.dhdd_4 * f2, dhgh2.dqdh * f2, 0.0f, this.dyth(n, dhgh2.btha));
        }
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
    }

    private int dyth(int n, float f) {
        try {
            int n2 = -1380573904;
            n2 = Integer.rotateLeft(n2 * 199514923, 28) ^ 0x213252B5;
            n2 = n ^ n2;
            n2 = Integer.rotateLeft(Float.floatToIntBits(f) ^ n2, 29);
            int n3 = n2 ^ 0x965DADC0;
            if ((n3 ^ n2) != -1772245568) {
                int cfr_ignored_0 = (0x3BEBB0F0 ^ n2) + 1605730326;
            }
            if ((0x2C3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return btsh_2.sfsh_2(n, Math.max(0, Math.min(-1495931696 - -1495931951, (int)((float)btsh_2.thww(n) * f))));
    }

    private static int sfsh_2(int n, int n2) {
        block0: {
            int n3 = 143819575;
            n3 = Integer.rotateLeft(n3 * -224288475, 15) ^ 0x1C5FD892;
            int n4 = (n3 = n ^ n3) ^ 0xB67E29DD;
            if ((n4 ^ n3) == -1233245731) break block0;
            int cfr_ignored_0 = (0xBEECAAEA ^ n3) + 1524310999;
        }
        return btsh_2.tkhl(n2, 0, -1699293525 + 1699293780) << 1680087787 + -1680087763 | n & (Integer.reverse(1252816826) ^ 0x5D11CAAD);
    }

    private static int thww(int n) {
        block0: {
            int n2 = 249529603;
            int n3 = (n2 = Integer.rotateLeft(n2 * -120821503, 7) ^ 0xE7117711) ^ 0xE424D647;
            if ((n3 ^ n2) == -467347897) break block0;
            int cfr_ignored_0 = (0xEAFB5344 ^ n2) - 1606707601;
        }
        return n >> (Integer.reverse(150475332) ^ 0x22481F08) & (Integer.reverse(177554649) ^ 0x9B22A9AF);
    }

    private static int hay(int n) {
        block0: {
            int n2 = -1128432935;
            n2 = Integer.rotateLeft(n2 * -1650943037, 17) ^ 0xB78A885D;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 11)) ^ 0xDDD3F46C;
            if ((n3 ^ n2) == -573311892) break block0;
            int cfr_ignored_0 = (0x616E8EB5 ^ n2) + 480117005;
        }
        return n >> 967737118 - 967737102 & -979748674 + 979748929;
    }

    private static int tzf(int n) {
        block0: {
            int n2 = -773907402;
            n2 = Integer.rotateLeft(n2 * -1970220751, 7) ^ 0xA50F4D54;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 13)) ^ 0x1A8C1674;
            if ((n3 ^ n2) == 445388404) break block0;
            int cfr_ignored_0 = (0xCB530A42 ^ n2) + -712516942;
        }
        return n >> -678523067 - -678523075 & 230226473 + -230226218;
    }

    private static int thfkh(int n) {
        block0: {
            int n2 = -549244754;
            n2 = Integer.rotateLeft(n2 * 1079198097, 19) ^ 0xE3F14240;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 3)) ^ 0x522383BB;
            if ((n3 ^ n2) == 1378059195) break block0;
            int cfr_ignored_0 = (0x8D60B315 ^ n2) + 1060388058;
        }
        return n & Integer.rotateLeft(0xCCBC09A3 ^ 0xB33C09A3, 9);
    }

    private static int zsa_7(int n, int n2, int n3, int n4) {
        block0: {
            int n5 = 1365856807;
            n5 = Integer.rotateLeft(n5 * 1647108695, 9) ^ 0x1055832C;
            n5 = n ^ n5;
            int n6 = (n5 = n2 ^ n5) ^ 0xC1B82F09;
            if ((n6 ^ n5) == -1044893943) break block0;
            int cfr_ignored_0 = (0x90D17D2E ^ n5) + -1702611736;
        }
        return n4 << Integer.rotateLeft(0xE33D9FE2 ^ 0xE3319FE2, 17) | n << (Integer.reverse(471911265) ^ 0x86D30428) | n2 << 1418271467 - 1418271459 | n3;
    }

    private void bkhs(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3, int n) {
        int n2 = -815214271;
        n2 = Integer.rotateLeft(n2 * -605876855, 24) ^ 0xD5FD3465;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 27);
        Matrix4f matrix4f2 = matrix4f;
        n2 = (matrix4f2 != null ? System.identityHashCode(matrix4f2) : 0) ^ n2;
        int n3 = n2 ^ 0x5658699C;
        if ((n3 ^ n2) != 1448634780) {
            int cfr_ignored_0 = (0x9930B8DD ^ n2) - -768343321;
        }
        btsh_2.asth(class_2872, matrix4f, f, f2, f3).method_22915((float)btsh_2.bnz_2(n) / Float.intBitsToFloat(Integer.reverse(585891652) ^ 0x6180D744), (float)btsh_2.tzf(n) / Float.intBitsToFloat(1358747662 + -226351118), (float)btsh_2.thfkh(n) / Float.intBitsToFloat(2109522328 + -977125784), (float)btsh_2.thww(n) / Float.intBitsToFloat(-1030627956 - 2131942796));
    }

    private int hal() {
        block0: {
            int n = 386059094;
            n = Integer.rotateLeft(n * 526437871, 12) ^ 0xA522516C;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xA39E2CE7;
            if ((n2 ^ n) == -1549914905) break block0;
            int cfr_ignored_0 = (0xB49CE7B1 ^ n) + -1115241524;
        }
        return this.dtkh(0);
    }

    private int jal_2(int n) {
        int n2 = 0;
        int n3 = 0;
        int n4 = 1111157287;
        n4 = Integer.rotateLeft(n4 * 2122345363, 22) ^ 0x8EF1C7E3;
        n4 = System.identityHashCode(this) ^ n4;
        n4 = Integer.rotateRight(n ^ n4, 10);
        int n5 = (int)((long)Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E) ^ 0x2C066139E93A6E4CL ^ 0x2C066139E93A6E4CL);
        while (true) {
            block29: {
                block43: {
                    block36: {
                        block42: {
                            block38: {
                                block34: {
                                    block40: {
                                        block26: {
                                            block41: {
                                                block37: {
                                                    block32: {
                                                        block27: {
                                                            block33: {
                                                                block28: {
                                                                    block31: {
                                                                        block39: {
                                                                            block35: {
                                                                                block24: {
                                                                                    block30: {
                                                                                        block25: {
                                                                                            if ((n3 = Integer.reverse(n5) ^ n4 ^ 0x4766E54E) > 509077649) break block24;
                                                                                            if (n3 > -1323936334) break block25;
                                                                                            if (n3 == -1886213580) break block26;
                                                                                            if (n3 == -1614520118) break block27;
                                                                                            int cfr_ignored_0 = (Integer.rotateRight(0x891EC5B6 ^ n4, 4) - -1625845691) * -1994472009;
                                                                                            if (n3 == -1323936334) break block28;
                                                                                            break block29;
                                                                                        }
                                                                                        if (n3 > -1010658298) break block30;
                                                                                        if (n3 == -1298903279) break block31;
                                                                                        if (n3 == -1010658298) break block32;
                                                                                        break block29;
                                                                                    }
                                                                                    if (n3 == -326270162) break block33;
                                                                                    if (n3 == 509077649) break block34;
                                                                                    int cfr_ignored_1 = Integer.rotateRight(0x591C83C3 ^ n4, 14) + -825125928;
                                                                                    break block29;
                                                                                }
                                                                                if (n3 > 1087376124) break block35;
                                                                                if (n3 == 830909468) break block36;
                                                                                if (n3 == 914634118) break block37;
                                                                                if (n3 == 1087376124) break block38;
                                                                                break block29;
                                                                            }
                                                                            if (n3 > 1285355768) break block39;
                                                                            if (n3 == 1180090275) break block40;
                                                                            if (n3 == 1285355768) break block41;
                                                                            break block29;
                                                                        }
                                                                        if (n3 == 1735945932) break block42;
                                                                        if (n3 == 1832092567) break block43;
                                                                        break block29;
                                                                    }
                                                                    int cfr_ignored_2 = (Integer.rotateLeft(0xC9812FF9 ^ n4, 12) + 1795321442) * -914280455;
                                                                    int cfr_ignored_3 = (int)(0xB3381C427D4EB4FL ^ (long)n4 ^ 0xFEF8831A2DB9BBB6L);
                                                                    n2 = btsh_2.twth(byq.tkhw(n), new byq(btsh_2.ghd_2(-1223575368 - 1938995384), Float.intBitsToFloat(398513550 + 733882994), Float.intBitsToFloat(Integer.rotateLeft(0xC7CF9BD8 ^ 0xC7CF1D26, 15)), Float.intBitsToFloat(Integer.rotateLeft(0x483C8CF9 ^ 0x493170F9, 6))), Float.intBitsToFloat(133889539 + 915693094)).rk();
                                                                    n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0x6D338397 ^ 0x4766E54E)));
                                                                    ++n3;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_4 = Integer.rotateRight(0x58F3E6AE ^ n4, 14) - -907637171;
                                                                throw null;
                                                            }
                                                            int cfr_ignored_5 = (Integer.rotateLeft(0xBB5D06FC ^ n4, 10) - -1264486465) * -1151531267;
                                                            if (yf.dnkh()) {
                                                                int cfr_ignored_6 = (int)(0x73AB610288DFE201L ^ (long)n4 ^ 0x3F75DD0C3F254A87L);
                                                                n5 = Integer.reverse(n4 ^ 0xF3CEAB4E ^ 0x4766E54E) ^ 0x1191847B ^ 0x1191847B;
                                                                int cfr_ignored_7 = (int)(0xE9D8814E1C788CEL ^ (long)n4 ^ 0xED590F3CEABBB0EAL);
                                                                n5 = Integer.reverse(n4 ^ 0xB11655B2 ^ 0x4766E54E) + -1726874160 - -1726874160;
                                                                n3 += 2;
                                                                continue;
                                                            }
                                                            int cfr_ignored_8 = (int)(0x620D16CFC24DB921L ^ (long)n4 ^ 0xD0EF4828896569CBL);
                                                            n5 = Integer.reverse(n4 ^ 0x9BEDEAD9 ^ 0x4766E54E);
                                                            int cfr_ignored_9 = (int)(0x86A2C958342B88AL ^ (long)n4 ^ 0xA45BCA368A33BD05L);
                                                            n5 = Integer.reverse(n4 ^ 0xB2944F11 ^ 0x4766E54E);
                                                            ++n3;
                                                            continue;
                                                        }
                                                        int cfr_ignored_10 = (Integer.rotateRight(0xFDED5E7E ^ n4, 18) - -1004793731) * -34775425;
                                                        n5 = (int)((long)Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E) ^ 0x4C0ACA524121F109L ^ 0x4C0ACA524121F109L);
                                                        --n3;
                                                        continue;
                                                    }
                                                    int cfr_ignored_11 = Integer.rotateRight(0x9248FAE3 ^ n4, 5) + -1154219848;
                                                    try {
                                                        n5 = (int)((long)Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E) ^ 0xB66B5AEE66A783BEL ^ 0xB66B5AEE66A783BEL);
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        n5 = Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E) + -16642129 - -16642129;
                                                    }
                                                    n3 -= 5;
                                                    continue;
                                                }
                                                int cfr_ignored_12 = (Integer.rotateRight(0xDCC5701F ^ n4, 14) - -1069141252) * -591040481;
                                                try {
                                                    if ((0x9567A55EC91BE15FL ^ (long)n4 | 1L) == 0L) {
                                                        throw new UnsupportedOperationException();
                                                    }
                                                    n5 = (int)((long)Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E) ^ 0xA41EB6BD322C1E77L ^ 0xA41EB6BD322C1E77L);
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    n5 = Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E) ^ 0x56450D9A ^ 0x56450D9A;
                                                }
                                                n3 -= 2;
                                                continue;
                                            }
                                            int cfr_ignored_13 = Integer.rotateLeft(0x2A7EA368 ^ n4, 8) + 699623635;
                                            try {
                                                if ((0x34E2C985050D071BL ^ (long)n4 | 1L) == 0L) {
                                                    throw new IllegalArgumentException();
                                                }
                                                n5 = Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E) + 11185684 - 11185684;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                n5 = Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E);
                                            }
                                            n3 += 5;
                                            continue;
                                        }
                                        int cfr_ignored_14 = (Integer.rotateLeft(0x5EE69FF1 ^ n4, 14) + -2109014678) * 1592172529;
                                        int cfr_ignored_15 = (int)(0x9C5431CC27D4EB4FL ^ (long)n4 ^ 0x9EE8831A2DB89579L);
                                        try {
                                            n5 = (int)((long)Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E) ^ 0xE9E2DC8A076C5F6FL ^ 0xE9E2DC8A076C5F6FL);
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            n5 = Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E);
                                        }
                                        continue;
                                    }
                                    int cfr_ignored_16 = (Integer.rotateRight(0xBB3815F7 ^ n4, 10) - -1339537372) * -1153952265;
                                    try {
                                        --n3;
                                        if ((0x7DC3956CA95D2179L ^ (long)n4 | 1L) == 0L) {
                                            throw new ArithmeticException();
                                        }
                                        n5 = Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E) ^ 0x7633EE0F ^ 0x7633EE0F;
                                    }
                                    catch (ArithmeticException arithmeticException) {
                                        n5 = (int)((long)Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E) ^ 0x17DD25C276A1D2B0L ^ 0x17DD25C276A1D2B0L);
                                    }
                                    continue;
                                }
                                int cfr_ignored_17 = (Integer.rotateRight(0x440012DA ^ n4, 11) + 1080027041) * 1140855515;
                                n5 = Integer.reverse(n4 ^ 0x84D17EA6 ^ 0x4766E54E) + 376310521 - 376310521;
                                int cfr_ignored_18 = Integer.rotateRight(0x51ABF1AA ^ n4, 13) + -399514927;
                                try {
                                    n3 -= 4;
                                    if ((0x9322E4381F22A08BL ^ (long)n4 | 1L) == 0L) {
                                        throw new IllegalArgumentException();
                                    }
                                    n5 = Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    n5 = Integer.reverse(Integer.reverse(Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E)));
                                }
                                n3 -= 4;
                                continue;
                            }
                            int cfr_ignored_19 = (Integer.rotateLeft(0x2C203F3C ^ n4, 8) - 1548044159) * 740310845;
                            n5 = Integer.reverse(n4 ^ 0xD5D88D1C ^ 0x4766E54E) + -293440655 - -293440655;
                            int cfr_ignored_20 = (Integer.rotateLeft(0x75FDE659 ^ n4, 17) + 1310491650) * 1979573849;
                            int cfr_ignored_21 = (int)(0xB74F486427D4EB4FL ^ (long)n4 ^ 0x6DB8831A2DB8C34FL);
                            try {
                                if ((0xB530CBDE29B0CE43L ^ (long)n4 | 1L) == 0L) {
                                    throw new IllegalArgumentException();
                                }
                                n5 = Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E) ^ 0xF141C35A ^ 0xF141C35A;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                n5 = (int)((long)Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E) ^ 0x682E2764AFDCF697L ^ 0x682E2764AFDCF697L);
                            }
                            ++n3;
                            continue;
                        }
                        int cfr_ignored_22 = Integer.rotateLeft(0x5FAE3641 ^ n4, 14) + -1703530214;
                        int cfr_ignored_23 = (int)(0x9D1C987C27D4EB4FL ^ (long)n4 ^ 0xCD88831A2DB897E8L);
                        try {
                            n3 += 3;
                            if ((0xC4E1916CDED497E3L ^ (long)n4 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n5 = Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E) + 671439197 - 671439197;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n5 = Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E) ^ 0xECB05FD4 ^ 0xECB05FD4;
                        }
                        n3 -= 5;
                        continue;
                    }
                    int cfr_ignored_24 = (Integer.rotateLeft(0x488D3235 ^ n4, 12) - -847858778) * 1217212981;
                    int cfr_ignored_25 = (int)(0x8A3F9C0827D4EB4FL ^ (long)n4 ^ 0xC560831A2DB8B9AEL);
                    n5 = Integer.reverse(n4 ^ 0x70220592 ^ 0x4766E54E);
                    int cfr_ignored_26 = (Integer.rotateLeft(0x7E78F8F5 ^ n4, 18) - 1426310374) * 2121857269;
                    int cfr_ignored_27 = (int)(0xBCCA56C827D4EB4FL ^ (long)n4 ^ 0x50E0831A2DB8D445L);
                    n5 = Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E) + -439121202 - -439121202;
                    int cfr_ignored_28 = (Integer.rotateRight(0x69D51997 ^ n4, 16) - -718555004) * 1775573399;
                    continue;
                }
                return n2;
            }
            int cfr_ignored_29 = Integer.rotateRight(0x804952C7 ^ n4, 3) - -1925274284;
            n5 = Integer.reverse(n4 ^ 0xEC8D832E ^ 0x4766E54E);
        }
    }

    private int dbkh(int n) {
        int n2 = -347371376;
        n2 = Integer.rotateLeft(n2 * -541555071, 7) ^ 0x130D7C08;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (n2 = n ^ n2) ^ 0xCBC1CCD0;
        if ((n3 ^ n2) != -876491568) {
            int cfr_ignored_0 = (0x208A4440 ^ n2) - 1408958926;
        }
        return btsh_2.shtd(btsh_2.rfth(byq.tkhw(n), new byq(Float.intBitsToFloat(0x9628DC4 ^ 0x4A1D8DC4), Float.intBitsToFloat(Integer.reverse(-563010076) ^ 0x64DB8E7B), btsh_2.fn(496138359 + 636258185), Float.intBitsToFloat(Integer.reverse(1863201518) ^ 0x343370F6)), Float.intBitsToFloat(-891220378 + 1949023847)));
    }

    /*
     * Unable to fully structure code
     */
    private float zzgh(class_1657 var1_1, float var2_2) {
        var3_3 = 0.0f;
        var4_4 = 0.0f;
        var7_5 = 0;
        var5_6 = 1349330174;
        var5_6 = Integer.rotateLeft(var5_6 * -406467891, 20) ^ 1976581542;
        var5_6 = Integer.rotateLeft(System.identityHashCode(this) ^ var5_6, 6);
        var5_6 = Float.floatToIntBits(var2_2) ^ var5_6;
        var6_7 = var5_6 - 1350837886 ^ 1859473833 ^ 1859473833;
        while (true) {
            block62: {
                block76: {
                    block69: {
                        block79: {
                            block77: {
                                block71: {
                                    block68: {
                                        block75: {
                                            block72: {
                                                block80: {
                                                    block64: {
                                                        block61: {
                                                            block66: {
                                                                block67: {
                                                                    block78: {
                                                                        block63: {
                                                                            block73: {
                                                                                block70: {
                                                                                    block74: {
                                                                                        block65: {
                                                                                            var7_5 = var5_6 - var6_7;
                                                                                            switch (var7_5 & 15) {
                                                                                                case 0: {
                                                                                                    if (var7_5 == -457343952) break block61;
                                                                                                    if (var7_5 == 609982848) break block62;
                                                                                                    if (var7_5 != -1537069696) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block63;
                                                                                                }
                                                                                                case 1: {
                                                                                                    if (var7_5 == -245513695) break block64;
                                                                                                    if (var7_5 != -665085599) {
                                                                                                        (Integer.rotateLeft(522024980 ^ var5_6, 6) - -923850329) * 522024981;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block65;
                                                                                                }
                                                                                                case 2: {
                                                                                                    if (var7_5 == 610111154) break block66;
                                                                                                    if (var7_5 != 1307916962) {
                                                                                                        (Integer.rotateLeft(-822665292 ^ var5_6, 12) - 340424199) * -822665291;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block67;
                                                                                                }
                                                                                                case 4: {
                                                                                                    if (var7_5 == -1236080572) break block68;
                                                                                                    if (var7_5 != 1359688420) {
                                                                                                        Integer.rotateLeft(1753181857 ^ var5_6, 16) + -1412692806;
                                                                                                        (int)(-6139038940120421553L ^ (long)var5_6 ^ 8955552007485716554L);
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block69;
                                                                                                }
                                                                                                case 5: {
                                                                                                    if (var7_5 != 2111940005) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block70;
                                                                                                }
                                                                                                case 6: {
                                                                                                    if (var7_5 != -750523210) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block71;
                                                                                                }
                                                                                                case 8: {
                                                                                                    if (var7_5 == -309775080) break block72;
                                                                                                    if (var7_5 != 670391480) {
                                                                                                        (Integer.rotateRight(-902360161 ^ var5_6, 12) - -2130116740) * -902360161;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block73;
                                                                                                }
                                                                                                case 11: {
                                                                                                    if (var7_5 == -1836451077) break block74;
                                                                                                    if (var7_5 == -1867584709) break block75;
                                                                                                    Integer.rotateLeft(-1485473951 ^ var5_6, 7) + 1268192250;
                                                                                                    (int)(7334069508024625999L ^ (long)var5_6 ^ 5748989072797951582L);
                                                                                                    if (var7_5 != 1381082379) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block76;
                                                                                                }
                                                                                                case 13: {
                                                                                                    if (var7_5 == -368615283) break block77;
                                                                                                    if (var7_5 != 376356765) {
                                                                                                        (Integer.rotateRight(-1519984937 ^ var5_6, 7) - 198351684) * -1519984937;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block78;
                                                                                                }
                                                                                                case 14: {
                                                                                                    if (var7_5 != -137112386) {
                                                                                                        if (var7_5 == 1350837886) break;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block79;
                                                                                                }
                                                                                                case 15: {
                                                                                                    if (var7_5 != 51676239) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block80;
                                                                                                }
                                                                                            }
                                                                                            Integer.rotateRight(1893797679 ^ var5_6, 17) - -1348569620;
                                                                                            var3_3 = class_3532.method_17821((float)var2_2, (float)var1_1.field_6220, (float)var1_1.field_6283);
                                                                                            if (var1_1 == btsh_2.mc.field_1724) {
                                                                                                var6_7 = var5_6 - -1859782808;
                                                                                                (Integer.rotateLeft(-727513196 ^ var5_6, 13) - -1004828121) * -727513195;
                                                                                                var6_7 = Integer.reverse(Integer.reverse(var5_6 - 2111940005));
                                                                                                ++var7_5;
                                                                                                continue;
                                                                                            }
                                                                                            var6_7 = var5_6 - -1836451077 ^ 59189257 ^ 59189257;
                                                                                            continue;
                                                                                        }
                                                                                        Integer.rotateLeft(-845338880 ^ var5_6, 12) + -362457029;
                                                                                        var3_3 = class_3532.method_17821((float)var2_2, (float)var1_1.field_6220, (float)var1_1.field_6283);
                                                                                        if (var1_1 != btsh_2.mc.field_1724) {
                                                                                            var6_7 = Integer.reverse(Integer.reverse(var5_6 - -1126712033));
                                                                                            (Integer.rotateRight(-2073788262 ^ var5_6, 3) + 210317793) * -2073788261;
                                                                                            var6_7 = Integer.reverse(Integer.reverse(var5_6 - -1836451077));
                                                                                            var7_5 += 5;
                                                                                            continue;
                                                                                        }
                                                                                        var6_7 = var5_6 - 2111940005;
                                                                                        var7_5 -= 5;
                                                                                        continue;
                                                                                    }
                                                                                    Integer.rotateLeft(-197083703 ^ var5_6, 17) + -1741383022;
                                                                                    (int)(3959248961773300559L ^ (long)var5_6 ^ -2695260228521705419L);
                                                                                    var4_4 = var3_3;
                                                                                    try {
                                                                                        --var7_5;
                                                                                        var6_7 = var5_6 - 609982848 + -2057305139 - -2057305139;
                                                                                    }
                                                                                    catch (IllegalArgumentException v0) {
                                                                                        var6_7 = var5_6 - 609982848 + 1691878815 - 1691878815;
                                                                                    }
                                                                                    var7_5 -= 4;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateRight(-834716902 ^ var5_6, 12) + -33175711) * -834716901;
                                                                                if (!this.bar_2) {
                                                                                    try {
                                                                                        var7_5 += 2;
                                                                                        if ((-3116791554687167891L ^ (long)var5_6 | 1L) == 0L) {
                                                                                            throw new NoSuchElementException();
                                                                                        }
                                                                                        var6_7 = var5_6 - -1537069696 ^ -257931838 ^ -257931838;
                                                                                    }
                                                                                    catch (NoSuchElementException v1) {
                                                                                        var6_7 = (int)((long)(var5_6 - -1537069696) ^ 4424100272417216721L ^ 4424100272417216721L);
                                                                                    }
                                                                                    var7_5 -= 4;
                                                                                    continue;
                                                                                }
                                                                                try {
                                                                                    --var7_5;
                                                                                    var6_7 = var5_6 - 670391480 + 1652929505 - 1652929505;
                                                                                }
                                                                                catch (IllegalArgumentException v2) {
                                                                                    var6_7 = var5_6 - 670391480 + 1946047618 - 1946047618;
                                                                                }
                                                                                --var7_5;
                                                                                continue;
                                                                            }
                                                                            (Integer.rotateRight(-158676494 ^ var5_6, 17) + -550759543) * -158676493;
                                                                            if (var1_1.field_6012 < 2) {
                                                                                try {
                                                                                    var7_5 -= 5;
                                                                                    if ((-5850901598430642173L ^ (long)var5_6 | 1L) == 0L) {
                                                                                        throw new NoSuchElementException();
                                                                                    }
                                                                                    var6_7 = var5_6 - -1537069696 ^ 34640278 ^ 34640278;
                                                                                }
                                                                                catch (NoSuchElementException v3) {
                                                                                    var6_7 = var5_6 - -1537069696;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            try {
                                                                                if ((5708805008551681437L ^ (long)var5_6 | 1L) == 0L) {
                                                                                    throw new UnsupportedOperationException();
                                                                                }
                                                                                var6_7 = var5_6 - 376356765 + -1467740199 - -1467740199;
                                                                            }
                                                                            catch (UnsupportedOperationException v4) {
                                                                                var6_7 = var5_6 - 376356765 + 955869775 - 955869775;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateRight(2128503967 ^ var5_6, 18) - 1632358012) * 2128503967;
                                                                        this.thhth_2 = var3_3;
                                                                        this.bar_2 = true;
                                                                        var4_4 = this.thhth_2;
                                                                        var6_7 = (int)((long)(var5_6 - -1691884811) ^ 6283936488205300934L ^ 6283936488205300934L);
                                                                        (Integer.rotateRight(1331164182 ^ var5_6, 12) - -1610338843) * 1331164183;
                                                                        var6_7 = (int)((long)(var5_6 - 609982848) ^ 7209113133269373970L ^ 7209113133269373970L);
                                                                        var7_5 -= 3;
                                                                        continue;
                                                                    }
                                                                    Integer.rotateLeft(1405767501 ^ var5_6, 13) - 702364046;
                                                                    (int)(-7964368069183870129L ^ (long)var5_6 ^ 4580304969495252768L);
                                                                    var4_4 = this.thhth_2 = btsh_2.tfj(this.thhth_2, var3_3, Float.intBitsToFloat(-1029954847 + 2126765343));
                                                                    try {
                                                                        ++var7_5;
                                                                        if ((-5516317625597953497L ^ (long)var5_6 | 1L) == 0L) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                        var6_7 = var5_6 - 609982848 + 699910851 - 699910851;
                                                                    }
                                                                    catch (IllegalStateException v5) {
                                                                        var6_7 = var5_6 - 609982848 + 841290628 - 841290628;
                                                                    }
                                                                    var7_5 -= 2;
                                                                    continue;
                                                                }
                                                                (Integer.rotateRight(-839196938 ^ var5_6, 12) - -172056827) * -839196937;
                                                                var6_7 = var5_6 - -172141163 + 1437418056 - 1437418056;
                                                                Integer.rotateLeft(1316635268 ^ var5_6, 12) - -2060735177;
                                                                var6_7 = var5_6 - 1350837886 ^ 2057636577 ^ 2057636577;
                                                                var7_5 -= 2;
                                                                continue;
                                                            }
                                                            (Integer.rotateLeft(-579823684 ^ var5_6, 14) - -721420545) * -579823683;
                                                            var6_7 = var5_6 - 439069782 + 470911936 - 470911936;
                                                            (Integer.rotateLeft(-1601576675 ^ var5_6, 7) - 1963975102) * -1601576675;
                                                            (int)(7078338238868679503L ^ (long)var5_6 ^ 7147356757096491431L);
                                                            var6_7 = var5_6 - -142566409 ^ 713582008 ^ 713582008;
                                                            (Integer.rotateRight(1743813683 ^ var5_6, 15) + -1703106200) * 1743813683;
                                                            var6_7 = var5_6 - 1350837886;
                                                            var7_5 -= 5;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(772282302 ^ var5_6, 8) - -1755807939) * 772282303;
                                                        try {
                                                            var7_5 -= 2;
                                                            var6_7 = var5_6 - 1350837886 + 514037929 - 514037929;
                                                        }
                                                        catch (UnsupportedOperationException v6) {
                                                            var6_7 = var5_6 - 1350837886 + 890962416 - 890962416;
                                                        }
                                                        continue;
                                                    }
                                                    Integer.rotateRight(811644674 ^ var5_6, 9) + -535574407;
                                                    var6_7 = (int)((long)(var5_6 - -613170766) ^ 3509220658748307747L ^ 3509220658748307747L);
                                                    (Integer.rotateLeft(2110061436 ^ var5_6, 18) - 1060639551) * 2110061437;
                                                    var6_7 = (int)((long)(var5_6 - 1350837886) ^ -9218927889188951024L ^ -9218927889188951024L);
                                                    Integer.rotateLeft(-89708116 ^ var5_6, 18) - 1587260175;
                                                    continue;
                                                }
                                                (Integer.rotateRight(-114427173 ^ var5_6, 18) + 820969408) * -114427173;
                                                var6_7 = (int)((long)(var5_6 - 844314785) ^ -1757609994437241229L ^ -1757609994437241229L);
                                                (Integer.rotateLeft(-57963080 ^ var5_6, 18) + -1723611005) * -57963079;
                                                var6_7 = Integer.reverse(Integer.reverse(var5_6 - 1466043373));
                                                Integer.rotateRight(1811457926 ^ var5_6, 16) - 393865333;
                                                var6_7 = var5_6 - 1350837886 + -1592847529 - -1592847529;
                                                continue;
                                            }
                                            Integer.rotateLeft(868702053 ^ var5_6, 9) - 1233204342;
                                            (int)(-1047657181273068721L ^ (long)var5_6 ^ 1135051254556806970L);
                                            var6_7 = Integer.reverse(Integer.reverse(var5_6 - -1102986334));
                                            Integer.rotateLeft(1112485293 ^ var5_6, 11) - 200550190;
                                            (int)(-9152014212580185265L ^ (long)var5_6 ^ -409683417631249366L);
                                            var6_7 = Integer.reverse(Integer.reverse(var5_6 - 1350837886));
                                            (Integer.rotateRight(-278757705 ^ var5_6, 16) - 21690212) * -278757705;
                                            var7_5 -= 3;
                                            continue;
                                        }
                                        (Integer.rotateLeft(1598603069 ^ var5_6, 14) - -1909667938) * 1598603069;
                                        (int)(-7063314373211264177L ^ (long)var5_6 ^ -2346231257400568283L);
                                        var6_7 = var5_6 - -53228356 ^ 916021099 ^ 916021099;
                                        (Integer.rotateRight(1365140126 ^ var5_6, 13) - -557084579) * 1365140127;
                                        try {
                                            --var7_5;
                                            if ((5432150538833508909L ^ (long)var5_6 | 1L) == 0L) {
                                                throw new NoSuchElementException();
                                            }
                                            var6_7 = (int)((long)(var5_6 - 1350837886) ^ -9159446651644126577L ^ -9159446651644126577L);
                                        }
                                        catch (NoSuchElementException v7) {
                                            var6_7 = var5_6 - 1350837886 ^ 1532640466 ^ 1532640466;
                                        }
                                        continue;
                                    }
                                    (Integer.rotateLeft(-482354951 ^ var5_6, 15) + -1994857118) * -482354951;
                                    (int)(2417719159821757263L ^ (long)var5_6 ^ 1222871447290638027L);
                                    var6_7 = var5_6 - -1523161144;
                                    (Integer.rotateLeft(-1614288455 ^ var5_6, 6) + 1569909922) * -1614288455;
                                    (int)(6734367450731965263L ^ (long)var5_6 ^ 8248486865988556603L);
                                    try {
                                        if ((-7121019718793644455L ^ (long)var5_6 | 1L) == 0L) {
                                            throw new ArithmeticException();
                                        }
                                        var6_7 = var5_6 - 1350837886 + 2011257705 - 2011257705;
                                    }
                                    catch (ArithmeticException v8) {
                                        var6_7 = var5_6 - 1350837886 + -1427466695 - -1427466695;
                                    }
                                    var7_5 += 2;
                                    continue;
                                }
                                Integer.rotateLeft(-812264091 ^ var5_6, 12) - 662861430;
                                (int)(947861865140382543L ^ (long)var5_6 ^ 846820878405187487L);
                                var6_7 = var5_6 - 795289524 ^ -2117442386 ^ -2117442386;
                                Integer.rotateLeft(1233117516 ^ var5_6, 12) - -354818193;
                                (int)(7432940683701456443L ^ (long)var5_6 ^ -4240264849175518305L);
                                var6_7 = Integer.reverse(Integer.reverse(var5_6 - 1350837886));
                                var7_5 += 4;
                                continue;
                            }
                            Integer.rotateLeft(-17583292 ^ var5_6, 18) - -471837577;
                            var6_7 = (int)((long)(var5_6 - -1605552428) ^ 7722406928474506638L ^ 7722406928474506638L);
                            (Integer.rotateRight(906427702 ^ var5_6, 9) - -1892267835) * 906427703;
                            try {
                                if ((7930227642462939935L ^ (long)var5_6 | 1L) == 0L) {
                                    throw new UnsupportedOperationException();
                                }
                                var6_7 = var5_6 - 1350837886 + -32174085 - -32174085;
                            }
                            catch (UnsupportedOperationException v9) {
                                var6_7 = var5_6 - 1350837886;
                            }
                            continue;
                        }
                        (Integer.rotateRight(980501522 ^ var5_6, 10) + 404020585) * 980501523;
                        var6_7 = var5_6 - 16811161 + -1473420327 - -1473420327;
                        Integer.rotateRight(1749003563 ^ var5_6, 16) + -1542219920;
                        try {
                            if ((973325784129234543L ^ (long)var5_6 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var6_7 = (int)((long)(var5_6 - 1350837886) ^ -4986367051701268587L ^ -4986367051701268587L);
                        }
                        catch (ArithmeticException v10) {
                            var6_7 = var5_6 - 1350837886 ^ -999230050 ^ -999230050;
                        }
                        continue;
                    }
                    (Integer.rotateRight(-1973797154 ^ var5_6, 4) - -984925155) * -1973797153;
                    try {
                        var6_7 = var5_6 - 1350837886;
                    }
                    catch (IllegalStateException v11) {
                        var6_7 = Integer.reverse(Integer.reverse(var5_6 - 1350837886));
                    }
                    continue;
                }
                Integer.rotateLeft(897056397 ^ var5_6, 9) - 2112189006;
                (int)(-592979058416620721L ^ (long)var5_6 ^ 6633946399576179291L);
                var6_7 = Integer.reverse(Integer.reverse(var5_6 - 1725168767));
                Integer.rotateRight(-860617622 ^ var5_6, 12) + -836098031;
                var6_7 = (int)((long)(var5_6 - 1350837886) ^ -4518199006869524334L ^ -4518199006869524334L);
                Integer.rotateLeft(-851909527 ^ var5_6, 12) + -566147086;
                (int)(1119789182660963151L ^ (long)var5_6 ^ 7626990117411467973L);
                continue;
            }
            return var4_4;
lbl364:
            // 12 sources

            Integer.rotateLeft(784218916 ^ var5_6, 8) - -1385772905;
            var6_7 = var5_6 - 1350837886;
        }
    }

    private static float athd(float f, float f2, float f3) {
        try {
            int n = 181014659;
            n = Integer.rotateLeft(n * -737889981, 24) ^ 0x63489A66;
            int n2 = n ^ 0x6BF9F07;
            if ((n2 ^ n) != 113221383) {
                int cfr_ignored_0 = (0xC758F84 ^ n) - -298917433;
            }
            if ((0x12B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        float f4 = class_3532.method_15393((float)(f2 - f));
        f4 = btsh_2.ghds(f4, -f3, f3);
        return f + f4;
    }

    /*
     * Unable to fully structure code
     */
    private fd_2 jsz_4(class_1657 var1_1, float var2_2) {
        var3_3 = 0.0f;
        var4_4 = 0.0f;
        var5_5 = 0.0f;
        var6_6 = 0.0f;
        var7_7 = null;
        var10_8 = 0;
        var8_9 = ssh_8.ssw(-728127923);
        var8_9 = Integer.rotateRight(System.identityHashCode(this) ^ var8_9, 13);
        v0 = var1_1;
        var8_9 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var8_9;
        var9_10 = Integer.reverse(Integer.reverse(var8_9 - -640664623));
        while (true) {
            block68: {
                block59: {
                    block60: {
                        block74: {
                            block76: {
                                block79: {
                                    block66: {
                                        block71: {
                                            block75: {
                                                block69: {
                                                    block64: {
                                                        block62: {
                                                            block67: {
                                                                block80: {
                                                                    block70: {
                                                                        block72: {
                                                                            block78: {
                                                                                block77: {
                                                                                    block63: {
                                                                                        block73: {
                                                                                            block65: {
                                                                                                block61: {
                                                                                                    var10_8 = var8_9 - var9_10;
                                                                                                    switch (var10_8 & 15) {
                                                                                                        case 0: {
                                                                                                            if (var10_8 != -1827599184) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block59;
                                                                                                        }
                                                                                                        case 1: {
                                                                                                            if (var10_8 == 1135855105) break block60;
                                                                                                            if (var10_8 == -640664623) break block61;
                                                                                                            if (var10_8 != 67254849) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block62;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            if (var10_8 != -141275678) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block63;
                                                                                                        }
                                                                                                        case 4: {
                                                                                                            if (var10_8 == -985994636) break block64;
                                                                                                            if (var10_8 != 359138772) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block65;
                                                                                                        }
                                                                                                        case 5: {
                                                                                                            if (var10_8 != 374292021) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block66;
                                                                                                        }
                                                                                                        case 6: {
                                                                                                            if (var10_8 == 1083469286) break;
                                                                                                            if (var10_8 != -1872327338) {
                                                                                                                Integer.rotateRight(136454338 ^ var8_9, 4) + 8361657;
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block67;
                                                                                                        }
                                                                                                        case 7: {
                                                                                                            if (var10_8 != 604518487) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block68;
                                                                                                        }
                                                                                                        case 8: {
                                                                                                            if (var10_8 == -187080712) break block69;
                                                                                                            if (var10_8 == 727113800) break block70;
                                                                                                            Integer.rotateRight(273254183 ^ var8_9, 5) - -45810444;
                                                                                                            if (var10_8 == 11707224) break block71;
                                                                                                            if (var10_8 != 1974656936) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block72;
                                                                                                        }
                                                                                                        case 9: {
                                                                                                            if (var10_8 != 1016356313) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block73;
                                                                                                        }
                                                                                                        case 10: {
                                                                                                            if (var10_8 == -1521904758) break block74;
                                                                                                            if (var10_8 != 1284052634) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block75;
                                                                                                        }
                                                                                                        case 12: {
                                                                                                            if (var10_8 != 204706300) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block76;
                                                                                                        }
                                                                                                        case 13: {
                                                                                                            if (var10_8 == 583635789) break block77;
                                                                                                            if (var10_8 != 123857997) {
                                                                                                                Integer.rotateLeft(666891585 ^ var8_9, 7) + -727952870;
                                                                                                                (int)(-1941795275524478129L ^ (long)var8_9 ^ 5442744298136692683L);
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block78;
                                                                                                        }
                                                                                                        case 14: {
                                                                                                            if (var10_8 != -1197637954) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block79;
                                                                                                        }
                                                                                                        case 15: {
                                                                                                            if (var10_8 != -1028061073) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            break block80;
                                                                                                        }
                                                                                                    }
                                                                                                    (Integer.rotateLeft(413127825 ^ var8_9, 6) + -4694838) * 413127825;
                                                                                                    (int)(-2725387319668053169L ^ (long)var8_9 ^ 587863899831277963L);
                                                                                                    if (var1_1.method_5715()) {
                                                                                                        (int)(7800103063149444440L ^ (long)var8_9 ^ -1323697268354222674L);
                                                                                                        var9_10 = Integer.reverse(Integer.reverse(var8_9 - 1320413507));
                                                                                                        (int)(-818087981358253861L ^ (long)var8_9 ^ -2318873819553446758L);
                                                                                                        var9_10 = var8_9 - 1974656936 + 633073175 - 633073175;
                                                                                                        continue;
                                                                                                    }
                                                                                                    (int)(2917020242650844620L ^ (long)var8_9 ^ 5879879310101183783L);
                                                                                                    var9_10 = Integer.reverse(Integer.reverse(var8_9 - 359138772));
                                                                                                    var10_8 += 3;
                                                                                                    continue;
                                                                                                }
                                                                                                Integer.rotateLeft(-802110392 ^ var8_9, 13) + 977626099;
                                                                                                if (yf.khdha_2()) {
                                                                                                    var9_10 = (int)((long)(var8_9 - -1390210553) ^ 8841638298432805667L ^ 8841638298432805667L);
                                                                                                    (Integer.rotateLeft(-1187219752 ^ var8_9, 10) + 1924137827) * -1187219751;
                                                                                                    var9_10 = (int)((long)(var8_9 - -141275678) ^ 6680414468505669419L ^ 6680414468505669419L);
                                                                                                    var10_8 += 2;
                                                                                                    continue;
                                                                                                }
                                                                                                (int)(4457718615374962091L ^ (long)var8_9 ^ 260127510714504808L);
                                                                                                var9_10 = Integer.reverse(Integer.reverse(var8_9 - 975224661));
                                                                                                (int)(-5872998028276752788L ^ (long)var8_9 ^ 3143802049825534252L);
                                                                                                var9_10 = Integer.reverse(Integer.reverse(var8_9 - 1016356313));
                                                                                                var10_8 += 2;
                                                                                                continue;
                                                                                            }
                                                                                            Integer.rotateRight(70783278 ^ var8_9, 3) - -2027441203;
                                                                                            var7_7 = new fd_2(0.0f, 0.0f, Float.intBitsToFloat(btsh_2.dhtt_3(46032394 ^ 1900375095, 4)), Float.intBitsToFloat(Integer.reverse(-1974547788) ^ 278904476), 0.0f, 0.0f, 1.0f, 1.0f, Float.intBitsToFloat(Integer.reverse(-1451140026) ^ 1543688313), btsh_2.tzm_3(btsh_2.rsr(-1404881392) ^ 1224524341), Float.intBitsToFloat(Integer.rotateLeft(941231438 ^ 643884747, 7)), btsh_2.tmsh_2(766885343 - -250485035), Float.intBitsToFloat(Integer.rotateLeft(550497949 ^ 549715357, 12)), Float.intBitsToFloat(1158355417 - -2071258663), Float.intBitsToFloat(Integer.reverse(-927793068) ^ 401936284));
                                                                                            try {
                                                                                                if ((-2202151371251187327L ^ (long)var8_9 | 1L) == 0L) {
                                                                                                    throw new NoSuchElementException();
                                                                                                }
                                                                                                var9_10 = var8_9 - 604518487 ^ -1676500229 ^ -1676500229;
                                                                                            }
                                                                                            catch (NoSuchElementException v1) {
                                                                                                var9_10 = var8_9 - 604518487;
                                                                                            }
                                                                                            var10_8 += 3;
                                                                                            continue;
                                                                                        }
                                                                                        (Integer.rotateLeft(-1664107139 ^ var8_9, 6) - 25530718) * -1664107139;
                                                                                        (int)(6808619377921157967L ^ (long)var8_9 ^ -2598432836533284565L);
                                                                                        yf.athz_2();
                                                                                        try {
                                                                                            if ((-7714882793488547761L ^ (long)var8_9 | 1L) == 0L) {
                                                                                                throw new IllegalArgumentException();
                                                                                            }
                                                                                            var9_10 = (int)((long)(var8_9 - -141275678) ^ -6127420952803581239L ^ -6127420952803581239L);
                                                                                        }
                                                                                        catch (IllegalArgumentException v2) {
                                                                                            var9_10 = var8_9 - -141275678 + -60544476 - -60544476;
                                                                                        }
                                                                                        --var10_8;
                                                                                        continue;
                                                                                    }
                                                                                    (Integer.rotateRight(-1870297066 ^ var8_9, 5) - -2071389723) * -1870297065;
                                                                                    var3_3 = btsh_2.ssb_4(var2_2, var1_1.field_6004, var1_1.method_36455());
                                                                                    if (!btsh_2.std_3(var1_1)) {
                                                                                        var9_10 = var8_9 - 123857997 + 1370444558 - 1370444558;
                                                                                        continue;
                                                                                    }
                                                                                    try {
                                                                                        if ((-5014653565235214057L ^ (long)var8_9 | 1L) == 0L) {
                                                                                            throw new UnsupportedOperationException();
                                                                                        }
                                                                                        var9_10 = var8_9 - 583635789 + 1962048228 - 1962048228;
                                                                                    }
                                                                                    catch (UnsupportedOperationException v3) {
                                                                                        var9_10 = var8_9 - 583635789;
                                                                                    }
                                                                                    var10_8 += 3;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateLeft(-2110123107 ^ var8_9, 3) - -916062402) * -2110123107;
                                                                                (int)(4650175110820719439L ^ (long)var8_9 ^ -8777371525285598016L);
                                                                                var4_4 = (float)var1_1.method_6003() + var2_2;
                                                                                var5_5 = btsh_2.tkhd_3(var4_4 * var4_4 / Float.intBitsToFloat(Integer.rotateLeft(1037006615 ^ 1036989919, 16)), 0.0f, 1.0f);
                                                                                var6_6 = var5_5 * (Float.intBitsToFloat(Integer.reverse(651511337) ^ 1456909156) - var3_3);
                                                                                var7_7 = new fd_2(Float.intBitsToFloat(Integer.reverse(609055119) ^ -819943841), Float.intBitsToFloat(-1077492344 - -2133114775), 0.0f, 0.0f, var6_6, 0.0f, Float.intBitsToFloat(btsh_2.htj_2(-1986015331 ^ -710898414, 8)), Float.intBitsToFloat(-498808635 - -1562819674), Float.intBitsToFloat(888479069 ^ 154784144), Float.intBitsToFloat(36160740 + 1022146045), btsh_2.thzk_2(Integer.reverse(-814246087) ^ -1583013314), Float.intBitsToFloat(Integer.reverse(-1711732162) ^ 1092967702), btsh_2.rtn_2(btsh_2.brs_2(-240709997 ^ -240685373, 17)), btsh_2.thr_5(-1380998792 ^ 1840226680), Float.intBitsToFloat(-701468703 + 1741991639));
                                                                                var9_10 = var8_9 - -420571986 ^ 137123836 ^ 137123836;
                                                                                Integer.rotateLeft(1786024584 ^ var8_9, 16) + -394568269;
                                                                                var9_10 = Integer.reverse(Integer.reverse(var8_9 - 604518487));
                                                                                continue;
                                                                            }
                                                                            (Integer.rotateRight(149947738 ^ var8_9, 4) + 426657057) * 149947739;
                                                                            if (btsh_2.tdd_3(var1_1)) {
                                                                                var9_10 = var8_9 - 784270248 + -496658247 - -496658247;
                                                                                (Integer.rotateLeft(-1925813612 ^ var8_9, 4) - 502564647) * -1925813611;
                                                                                var9_10 = var8_9 - 727113800;
                                                                                continue;
                                                                            }
                                                                            (int)(7300427062849760253L ^ (long)var8_9 ^ 6487214459711219569L);
                                                                            var9_10 = var8_9 - -929742154 ^ -1354245397 ^ -1354245397;
                                                                            (int)(6788897009315055453L ^ (long)var8_9 ^ -87805431105384001L);
                                                                            var9_10 = var8_9 - 1083469286 ^ 810717461 ^ 810717461;
                                                                            continue;
                                                                        }
                                                                        Integer.rotateRight(-1372147154 ^ var8_9, 8) - 486355661;
                                                                        var7_7 = new fd_2(0.0f, 0.0f, Float.intBitsToFloat(-406543526 ^ -659463723), Float.intBitsToFloat(Integer.reverse(1426639475) ^ -207627161), Float.intBitsToFloat(-182694175 - -1282650399), 0.0f, 1.0f, 1.0f, btsh_2.tsh_2(-211360219 + 1255238599), btsh_2.tghh(Integer.reverse(1072065086) ^ 1019635708), btsh_2.adhd(-956996148 + 1988123843), btsh_2.dhnt(-1085552305 + 2102922683), Float.intBitsToFloat(Integer.rotateLeft(721663595 ^ 579057261, 29)), Float.intBitsToFloat(-1255325774 ^ 1974288306), Float.intBitsToFloat(-1650333463 + -1605117530));
                                                                        (int)(-6212982515623444547L ^ (long)var8_9 ^ -1742033609140928929L);
                                                                        var9_10 = Integer.reverse(Integer.reverse(var8_9 - 604518487));
                                                                        var10_8 -= 2;
                                                                        continue;
                                                                    }
                                                                    Integer.rotateLeft(-11856660 ^ var8_9, 18) - -294311985;
                                                                    var7_7 = null;
                                                                    var9_10 = var8_9 - 1472628310 + -1374673028 - -1374673028;
                                                                    (Integer.rotateLeft(1851054096 ^ var8_9, 16) + 1621346603) * 1851054097;
                                                                    var9_10 = var8_9 - 604518487;
                                                                    --var10_8;
                                                                    continue;
                                                                }
                                                                Integer.rotateRight(-1046954614 ^ var8_9, 11) + 1977389809;
                                                                var7_7 = null;
                                                                var9_10 = var8_9 - 1441387106;
                                                                (Integer.rotateLeft(327974492 ^ var8_9, 5) - 1650519135) * 327974493;
                                                                var9_10 = var8_9 - 604518487 + -1554902455 - -1554902455;
                                                                var10_8 -= 3;
                                                                continue;
                                                            }
                                                            (Integer.rotateRight(-875254118 ^ var8_9, 12) + -1289829407) * -875254117;
                                                            (int)(1470750886749283157L ^ (long)var8_9 ^ -5965027448552848125L);
                                                            var9_10 = var8_9 - -798851206 + -1041717549 - -1041717549;
                                                            (int)(-8267235191994341690L ^ (long)var8_9 ^ 4592204393434756952L);
                                                            var9_10 = Integer.reverse(Integer.reverse(var8_9 - -640664623));
                                                            ++var10_8;
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(1500472661 ^ var8_9, 14) - -656743290) * 1500472661;
                                                        (int)(-7215387379772363953L ^ (long)var8_9 ^ 7755342706791455338L);
                                                        var9_10 = Integer.reverse(Integer.reverse(var8_9 - 1634833166));
                                                        Integer.rotateLeft(1237434628 ^ var8_9, 12) - -220987721;
                                                        var9_10 = Integer.reverse(Integer.reverse(var8_9 - -640664623));
                                                        var10_8 += 2;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(1835588629 ^ var8_9, 16) - 1141917126) * 1835588629;
                                                    (int)(-5775178055356716209L ^ (long)var8_9 ^ 1810591198662423141L);
                                                    var9_10 = var8_9 - -1791924074 + -1045787149 - -1045787149;
                                                    Integer.rotateRight(431632966 ^ var8_9, 6) - 568964533;
                                                    var9_10 = (int)((long)(var8_9 - 1939975058) ^ -8010139272650283651L ^ -8010139272650283651L);
                                                    (Integer.rotateLeft(764667132 ^ var8_9, 8) - -1991878209) * 764667133;
                                                    var9_10 = (int)((long)(var8_9 - -640664623) ^ -5686639750203944598L ^ -5686639750203944598L);
                                                    continue;
                                                }
                                                (Integer.rotateRight(994667998 ^ var8_9, 10) - 843181341) * 994667999;
                                                var9_10 = Integer.reverse(Integer.reverse(var8_9 - 390169080));
                                                (Integer.rotateRight(-1875623145 ^ var8_9, 5) - 2058469124) * -1875623145;
                                                try {
                                                    var10_8 -= 5;
                                                    if ((-4182381529178203103L ^ (long)var8_9 | 1L) == 0L) {
                                                        throw new ArithmeticException();
                                                    }
                                                    var9_10 = (int)((long)(var8_9 - -640664623) ^ -2577899440599789630L ^ -2577899440599789630L);
                                                }
                                                catch (ArithmeticException v4) {
                                                    var9_10 = var8_9 - -640664623;
                                                }
                                                ++var10_8;
                                                continue;
                                            }
                                            (Integer.rotateRight(-1381738434 ^ var8_9, 8) - 189025981) * -1381738433;
                                            var9_10 = var8_9 - -545208357;
                                            (Integer.rotateLeft(-25582187 ^ var8_9, 18) - -719803322) * -25582187;
                                            (int)(4380607879398615887L ^ (long)var8_9 ^ -1576115721120132025L);
                                            try {
                                                if ((-9176091199395715457L ^ (long)var8_9 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                var9_10 = var8_9 - -640664623 + -520930308 - -520930308;
                                            }
                                            catch (NoSuchElementException v5) {
                                                var9_10 = Integer.reverse(Integer.reverse(var8_9 - -640664623));
                                            }
                                            var10_8 -= 5;
                                            continue;
                                        }
                                        Integer.rotateLeft(-683445811 ^ var8_9, 13) - 361260814;
                                        (int)(1581291166737165135L ^ (long)var8_9 ^ 4796477751609099826L);
                                        var9_10 = Integer.reverse(Integer.reverse(var8_9 - 855928259));
                                        (Integer.rotateRight(-50171721 ^ var8_9, 18) - -1482078876) * -50171721;
                                        (int)(-8108765390340800626L ^ (long)var8_9 ^ 4385687113568006974L);
                                        var9_10 = var8_9 - -1290365510 + 1185120496 - 1185120496;
                                        (int)(3657731413743307427L ^ (long)var8_9 ^ 4890473075459606612L);
                                        var9_10 = Integer.reverse(Integer.reverse(var8_9 - -640664623));
                                        var10_8 -= 4;
                                        continue;
                                    }
                                    (Integer.rotateRight(783899866 ^ var8_9, 8) + -1395663455) * 783899867;
                                    var9_10 = var8_9 - 1958506097 ^ 222846738 ^ 222846738;
                                    Integer.rotateLeft(1002384613 ^ var8_9, 10) - 1082396406;
                                    (int)(-500600118675444913L ^ (long)var8_9 ^ -522273408315531318L);
                                    (int)(1955672378805926605L ^ (long)var8_9 ^ 2172348251158453142L);
                                    var9_10 = var8_9 - 159770775;
                                    (int)(4313302349334047764L ^ (long)var8_9 ^ 2752901551437634150L);
                                    var9_10 = var8_9 - -640664623 + -909488351 - -909488351;
                                    var10_8 += 2;
                                    continue;
                                }
                                Integer.rotateRight(-1189783477 ^ var8_9, 10) + 1844662352;
                                try {
                                    var10_8 += 5;
                                    if ((5571650671573948149L ^ (long)var8_9 | 1L) == 0L) {
                                        throw new IllegalArgumentException();
                                    }
                                    var9_10 = (int)((long)(var8_9 - -640664623) ^ -5909506742976275288L ^ -5909506742976275288L);
                                }
                                catch (IllegalArgumentException v6) {
                                    var9_10 = var8_9 - -640664623 ^ 2028759769 ^ 2028759769;
                                }
                                var10_8 -= 3;
                                continue;
                            }
                            Integer.rotateRight(-968691550 ^ var8_9, 11) + 108577497;
                            try {
                                var10_8 += 3;
                                if ((-8879752839735743957L ^ (long)var8_9 | 1L) == 0L) {
                                    throw new NoSuchElementException();
                                }
                                var9_10 = var8_9 - -640664623;
                            }
                            catch (NoSuchElementException v7) {
                                var9_10 = var8_9 - -640664623 + 1149858865 - 1149858865;
                            }
                            var10_8 += 3;
                            continue;
                        }
                        (Integer.rotateLeft(-290958511 ^ var8_9, 16) + -356534774) * -290958511;
                        (int)(3178131128029866831L ^ (long)var8_9 ^ 551835102812435940L);
                        var9_10 = var8_9 - -640664623;
                        var10_8 -= 4;
                        continue;
                    }
                    (Integer.rotateRight(-218343565 ^ var8_9, 17) + 1894528552) * -218343565;
                    try {
                        var10_8 += 5;
                        if ((-7753019917870713783L ^ (long)var8_9 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var9_10 = (int)((long)(var8_9 - -640664623) ^ 6155900922366943215L ^ 6155900922366943215L);
                    }
                    catch (UnsupportedOperationException v8) {
                        var9_10 = var8_9 - -640664623;
                    }
                    continue;
                }
                (Integer.rotateRight(-929488865 ^ var8_9, 12) - 1323860732) * -929488865;
                var9_10 = var8_9 - -1120113786 + -1669820106 - -1669820106;
                Integer.rotateLeft(1433092617 ^ var8_9, 13) + 1549442642;
                (int)(-7504707595285501105L ^ (long)var8_9 ^ 2673030527303844450L);
                var9_10 = var8_9 - -640664623 + 269383462 - 269383462;
                continue;
            }
            return var7_7;
lbl384:
            // 15 sources

            Integer.rotateLeft(-2032906996 ^ var8_9, 3) - 1477637039;
            var9_10 = Integer.reverse(Integer.reverse(var8_9 - -640664623));
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void nc() {
        var3_1 = 0;
        var1_2 = 1019857120;
        var1_2 = Integer.rotateLeft(var1_2 * 2057276539, 4) ^ 1722938166;
        var1_2 = System.identityHashCode(this) ^ var1_2;
        var2_3 = (int)((long)((var1_2 ^ -772063554 ^ 1034672722) + 1034672722) ^ -3363113324081747492L ^ -3363113324081747492L);
        block18: while (true) {
            block29: {
                block33: {
                    block30: {
                        block28: {
                            block39: {
                                block32: {
                                    block34: {
                                        block36: {
                                            block35: {
                                                block31: {
                                                    block37: {
                                                        block38: {
                                                            var3_1 = var2_3 - 1034672722 ^ 1034672722 ^ var1_2;
                                                            switch (var3_1 & 7) {
                                                                case 2: {
                                                                    if (var3_1 != -879890958) {
                                                                        ** break;
                                                                    }
                                                                    break block28;
                                                                }
                                                                case 3: {
                                                                    if (var3_1 != 937099675) {
                                                                        ** break;
                                                                    }
                                                                    break block29;
                                                                }
                                                                case 4: {
                                                                    if (var3_1 == 1579224644) break block30;
                                                                    if (var3_1 == 971288652) break block31;
                                                                    if (var3_1 == -662139468) break block32;
                                                                    if (var3_1 != -47218652) {
                                                                        ** break;
                                                                    }
                                                                    break block33;
                                                                }
                                                                case 5: {
                                                                    if (var3_1 == -1341995675) break block34;
                                                                    if (var3_1 == -23465003) break block35;
                                                                    if (var3_1 != 1846797765) {
                                                                        ** break;
                                                                    }
                                                                    break block36;
                                                                }
                                                                case 6: {
                                                                    if (var3_1 != 1698722142) {
                                                                        if (var3_1 == -772063554) break;
                                                                        ** break;
                                                                    }
                                                                    break block37;
                                                                }
                                                                case 7: {
                                                                    if (var3_1 == 393234951) break block38;
                                                                    if (var3_1 == 411229703) ** GOTO lbl41
                                                                    if (var3_1 != -1716699329) {
                                                                        ** break;
                                                                    }
                                                                    break block39;
lbl41:
                                                                    // 1 sources

                                                                    (Integer.rotateLeft(362163865 ^ var1_2, 5) + -1584577598) * 362163865;
                                                                    (int)(-2944086813862204593L ^ (long)var1_2 ^ -272323628996492392L);
                                                                    btsh_2.zjt();
                                                                    (int)(-5868554141299632756L ^ (long)var1_2 ^ -7547151356927217460L);
                                                                    var2_3 = (var1_2 ^ 834592658 ^ 1034672722) + 1034672722 + 460647826 - 460647826;
                                                                    (int)(6173733611675337881L ^ (long)var1_2 ^ -471234004392802678L);
                                                                    var2_3 = (var1_2 ^ 393234951 ^ 1034672722) + 1034672722 ^ 719721600 ^ 719721600;
                                                                    --var3_1;
                                                                    continue block18;
                                                                }
                                                            }
                                                            (Integer.rotateLeft(-1625573539 ^ var1_2, 6) - 1220072318) * -1625573539;
                                                            (int)(6748953417367219023L ^ (long)var1_2 ^ -3481138363497900413L);
                                                            if (!yf.khdha_2()) {
                                                                (int)(3456615419442366664L ^ (long)var1_2 ^ 5161475590401290785L);
                                                                var2_3 = (var1_2 ^ 411229703 ^ 1034672722) + 1034672722 + -61836795 - -61836795;
                                                                continue;
                                                            }
                                                            var2_3 = (var1_2 ^ 393234951 ^ 1034672722) + 1034672722 ^ -129073091 ^ -129073091;
                                                            ++var3_1;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(-189193854 ^ var1_2, 17) + -1496797703;
                                                        this.bar_2 = false;
                                                        super.nc();
                                                        return;
                                                    }
                                                    Integer.rotateRight(146614923 ^ var1_2, 4) + 323339792;
                                                    var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -205564684 ^ 1034672722) + 1034672722));
                                                    (Integer.rotateRight(-192494189 ^ var1_2, 17) + -1599108088) * -192494189;
                                                    var2_3 = (var1_2 ^ -772063554 ^ 1034672722) + 1034672722 + -46069319 - -46069319;
                                                    Integer.rotateRight(-1875040061 ^ var1_2, 5) + 2076544728;
                                                    var3_1 -= 3;
                                                    continue;
                                                }
                                                Integer.rotateRight(-2098287954 ^ var1_2, 3) - -549172659;
                                                (int)(1763140996998161926L ^ (long)var1_2 ^ 2574531431123098942L);
                                                var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -772063554 ^ 1034672722) + 1034672722));
                                                var3_1 += 4;
                                                continue;
                                            }
                                            Integer.rotateLeft(271516457 ^ var1_2, 5) + -99679950;
                                            (int)(-3270267452321895601L ^ (long)var1_2 ^ -6388211922965624598L);
                                            try {
                                                var3_1 += 2;
                                                var2_3 = (var1_2 ^ -772063554 ^ 1034672722) + 1034672722;
                                            }
                                            catch (IllegalArgumentException v0) {
                                                var2_3 = (var1_2 ^ -772063554 ^ 1034672722) + 1034672722 ^ -546663916 ^ -546663916;
                                            }
                                            var3_1 -= 4;
                                            continue;
                                        }
                                        (Integer.rotateLeft(-1326172143 ^ var1_2, 9) + 1911581002) * -1326172143;
                                        (int)(8234434085084523343L ^ (long)var1_2 ^ -3375303772254680740L);
                                        var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -772063554 ^ 1034672722) + 1034672722));
                                        Integer.rotateLeft(1242497440 ^ var1_2, 12) + -64040549;
                                        --var3_1;
                                        continue;
                                    }
                                    Integer.rotateRight(-2033990609 ^ var1_2, 3) - 1444045036;
                                    try {
                                        if ((9187851701771902379L ^ (long)var1_2 | 1L) == 0L) {
                                            throw new ArithmeticException();
                                        }
                                        var2_3 = (var1_2 ^ -772063554 ^ 1034672722) + 1034672722 + -202840655 - -202840655;
                                    }
                                    catch (ArithmeticException v1) {
                                        var2_3 = (var1_2 ^ -772063554 ^ 1034672722) + 1034672722 + -330546496 - -330546496;
                                    }
                                    continue;
                                }
                                (Integer.rotateLeft(-1847316299 ^ var1_2, 5) - -1358985946) * -1847316299;
                                (int)(6005161460766141263L ^ (long)var1_2 ^ -4584520272203674756L);
                                var2_3 = (var1_2 ^ -987986988 ^ 1034672722) + 1034672722 + -898249636 - -898249636;
                                (Integer.rotateLeft(-114246247 ^ var1_2, 18) + 826578114) * -114246247;
                                (int)(4288011390973963087L ^ (long)var1_2 ^ -2722281826285921579L);
                                var2_3 = (var1_2 ^ -772063554 ^ 1034672722) + 1034672722 + -1555275071 - -1555275071;
                                var3_1 += 4;
                                continue;
                            }
                            Integer.rotateRight(673442178 ^ var1_2, 8) + -524884487;
                            var2_3 = (int)((long)((var1_2 ^ 15818935 ^ 1034672722) + 1034672722) ^ -2541900997122725064L ^ -2541900997122725064L);
                            Integer.rotateLeft(1466784329 ^ var1_2, 13) + -1701081582;
                            (int)(-7647124862530163889L ^ (long)var1_2 ^ 1556137819715962478L);
                            var2_3 = (var1_2 ^ 965060208 ^ 1034672722) + 1034672722;
                            Integer.rotateRight(-1727119574 ^ var1_2, 6) + -1927854767;
                            var2_3 = (var1_2 ^ -772063554 ^ 1034672722) + 1034672722 + -339741362 - -339741362;
                            ++var3_1;
                            continue;
                        }
                        (Integer.rotateRight(1075913339 ^ var1_2, 11) + -933180384) * 1075913339;
                        var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -772063554 ^ 1034672722) + 1034672722));
                        Integer.rotateLeft(-1359566112 ^ var1_2, 8) + 876367963;
                        var3_1 -= 5;
                        continue;
                    }
                    Integer.rotateRight(600610375 ^ var1_2, 7) - 1512296916;
                    var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ 46927524 ^ 1034672722) + 1034672722));
                    Integer.rotateLeft(1634707789 ^ var1_2, 15) - -790421618;
                    (int)(-6639142097388246193L ^ (long)var1_2 ^ -896072177387246997L);
                    try {
                        var3_1 += 3;
                        var2_3 = (var1_2 ^ -772063554 ^ 1034672722) + 1034672722 ^ 1791778500 ^ 1791778500;
                    }
                    catch (IllegalArgumentException v2) {
                        var2_3 = (var1_2 ^ -772063554 ^ 1034672722) + 1034672722;
                    }
                    continue;
                }
                (Integer.rotateRight(-43513414 ^ var1_2, 18) + -1275671359) * -43513413;
                try {
                    var3_1 += 2;
                    var2_3 = (int)((long)((var1_2 ^ -772063554 ^ 1034672722) + 1034672722) ^ -2080025289143935585L ^ -2080025289143935585L);
                }
                catch (ArithmeticException v3) {
                    var2_3 = (int)((long)((var1_2 ^ -772063554 ^ 1034672722) + 1034672722) ^ 8484088488282395611L ^ 8484088488282395611L);
                }
                continue;
            }
            Integer.rotateRight(1849635503 ^ var1_2, 16) - 1577370220;
            var2_3 = (var1_2 ^ 1003750812 ^ 1034672722) + 1034672722 ^ 1357332733 ^ 1357332733;
            Integer.rotateLeft(1172082916 ^ var1_2, 11) - 2048076503;
            try {
                --var3_1;
                if ((3042997319527858313L ^ (long)var1_2 | 1L) == 0L) {
                    throw new IllegalArgumentException();
                }
                var2_3 = (var1_2 ^ -772063554 ^ 1034672722) + 1034672722 + -1235739228 - -1235739228;
            }
            catch (IllegalArgumentException v4) {
                var2_3 = (var1_2 ^ -772063554 ^ 1034672722) + 1034672722 + 1735103645 - 1735103645;
            }
            continue;
lbl200:
            // 7 sources

            Integer.rotateLeft(182767688 ^ var1_2, 4) + 1444075507;
            var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -772063554 ^ 1034672722) + 1034672722));
        }
    }

    @Generated
    public static btsh_2 khda() {
        block0: {
            int n = -1582048907;
            int n2 = (n = Integer.rotateLeft(n * -156353215, 10) ^ 0xBDEDC9B1) ^ 0x5537D704;
            if ((n2 ^ n) == 1429722884) break block0;
            int cfr_ignored_0 = (0xF4840E71 ^ n) - 604148278;
        }
        return tth_4;
    }

    private void bshn(shw_3 shw2) {
        int n = -768473513;
        n = Integer.rotateLeft(n * -475271459, 18) ^ 0xD24ECDE4;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xF7B7CC99;
        if ((n2 ^ n) != -138949479) {
            int cfr_ignored_0 = (0x2585CACE ^ n) + 1905646801;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (btsh_2.mc.field_1724 == null || btsh_2.mc.field_1687 == null || btsh_2.mc.field_1773 == null) {
            return;
        }
        class_4587 class_45872 = shw2.ssha_2();
        float f = shw2.skz_4();
        class_243 class_2432 = btsh_2.mc.field_1773.method_19418().method_19326();
        class_45872.method_22903();
        RenderSystem.enableBlend();
        RenderSystem.disableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        if (this.zad_3.tzn_3("Self") && !btsh_2.mc.field_1690.method_31044().method_31034() && btsh_2.mc.field_1724.method_5805() && !this.jdy_2((class_1657)btsh_2.mc.field_1724)) {
            try {
                this.shghd_2(class_45872, (class_1657)btsh_2.mc.field_1724, f, class_2432);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        for (class_1297 class_12972 : btsh_2.mc.field_1687.method_18112()) {
            boolean bl;
            class_1657 class_16572;
            if (!(class_12972 instanceof class_1657) || class_12972 == btsh_2.mc.field_1724 || !(class_16572 = (class_1657)class_12972).method_5805() || this.jdy_2(class_16572) || (bl = Moondlc.getInstance().getFriendManager().adhj(class_16572.method_5477().getString())) && !this.zad_3.tzn_3("Friends") || !bl && !this.zad_3.tzn_3("Others")) continue;
            try {
                this.shghd_2(class_45872, class_16572, f, class_2432);
            }
            catch (Exception exception) {}
        }
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ZERO);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        class_45872.method_22909();
    }

    private boolean thsd_4() {
        block0: {
            int n = -330665817;
            n = Integer.rotateLeft(n * -1360922139, 25) ^ 0xDEADCC46;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 29);
            int n2 = n ^ 0x148DDC7C;
            if ((n2 ^ n) == 344841340) break block0;
            int cfr_ignored_0 = (0xF8C7ACDB ^ n) + -295352290;
        }
        return this.thza_4.shzl();
    }

    private boolean zdhr_2() {
        block0: {
            int n = -1892447694;
            n = Integer.rotateLeft(n * -1007236633, 9) ^ 0x60C04BE3;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8DB9AD5;
            if ((n2 ^ n) == 148609749) break block0;
            int cfr_ignored_0 = (0x87E810E7 ^ n) - -395163624;
        }
        return this.thza_4.shzl();
    }

    private static String thyd(String string, int n, int n2, int n3) {
        try {
            int n4 = -568323074;
            n4 = Integer.rotateLeft(n4 * 1139281175, 12) ^ 0x11A54B8E;
            n4 = n2 ^ n4;
            int n5 = n4 ^ 0x42E36FB6;
            if ((n5 ^ n4) != 1122201526) {
                int cfr_ignored_0 = (0x9CC37C48 ^ n4) + -961800507;
            }
            if ((0x157 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0xBAA3F9E8) + n2 ^ i * -1210864513) ^ dhrw) + thhq_2);
        }
        return new String(cArray);
    }

    private static int sqgh_2(Color color) {
        block0: {
            int n = ssh_8.ssw(-1238211404);
            int n2 = n ^ 0x81F09D1D;
            if ((n2 ^ n) == -2114937571) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x37C2F9A9 ^ n, 9) + -990258510;
            int cfr_ignored_1 = (int)(0xF570579427D4EB4FL ^ (long)n ^ 0x5258831A2DB84731L);
        }
        return color.getRGB();
    }

    private static byq ajf(bzw_2 bzw2_2) {
        block0: {
            int n = -2143543208;
            n = Integer.rotateLeft(n * -1639164673, 5) ^ 0xB49FE6C4;
            bzw_2 bzw3_2 = bzw2_2;
            n = (bzw3_2 != null ? System.identityHashCode(bzw3_2) : 0) ^ n;
            int n2 = n ^ 0x18BA4818;
            if ((n2 ^ n) == 414861336) break block0;
            int cfr_ignored_0 = (0x98866840 ^ n) - 1436653832;
        }
        return bzw2_2.sdsh_4();
    }

    private static byq tjs(byq byq2, byq byq3, float f) {
        block0: {
            int n = -849634198;
            int n2 = (n = Integer.rotateLeft(n * -624446511, 7) ^ 0xED99D6CB) ^ 0xD366A61B;
            if ((n2 ^ n) == -748247525) break block0;
            int cfr_ignored_0 = (0x1E3D3A71 ^ n) + 1276944387;
        }
        return byq2.dkhw_2(byq3, f);
    }

    private static int tkhl(int n, int n2, int n3) {
        block0: {
            int n4 = ssh_8.ssw(1356091376);
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 19)) ^ 0x89E39E16;
            if ((n5 ^ n4) == -1981571562) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xD937D1E6 ^ n4, 14) - 1377831445;
        }
        return class_3532.method_15340((int)n, (int)n2, (int)n3);
    }

    private static class_4588 asth(class_287 class_2872, Matrix4f matrix4f, float f, float f2, float f3) {
        block0: {
            int n = -1557075337;
            n = Integer.rotateLeft(n * -1021021477, 18) ^ 0x69094B5C;
            class_287 class_2873 = class_2872;
            n = Integer.rotateRight((class_2873 != null ? System.identityHashCode(class_2873) : 0) ^ n, 10);
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 17);
            int n2 = n ^ 0xF06269B9;
            if ((n2 ^ n) == -261985863) break block0;
            int cfr_ignored_0 = (0x535283CE ^ n) - -21587395;
        }
        return class_2872.method_22918(matrix4f, f, f2, f3);
    }

    private static int bnz_2(int n) {
        block0: {
            int n2 = ssh_8.ssw(1733488836);
            int n3 = n2 ^ 0x385754AD;
            if ((n3 ^ n2) == 945247405) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x5F05A469 ^ n2, 14) + -2045999118;
            int cfr_ignored_1 = (int)(0x9DB70A5427D4EB4FL ^ (long)n2 ^ 0xE9D8831A2DB896BFL);
        }
        return btsh_2.hay(n);
    }

    private static float ghd_2(int n) {
        block0: {
            int n2 = 2006828410;
            n2 = Integer.rotateLeft(n2 * 415703887, 18) ^ 0x765A4B55;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 19)) ^ 0xDFF81063;
            if ((n3 ^ n2) == -537391005) break block0;
            int cfr_ignored_0 = (0xA865D519 ^ n2) - -208373389;
        }
        return Float.intBitsToFloat(n);
    }

    private static byq twth(byq byq2, byq byq3, float f) {
        block0: {
            int n = 67132705;
            n = Integer.rotateLeft(n * 411582031, 24) ^ 0xC16E9F0D;
            byq byq4 = byq3;
            n = (byq4 != null ? System.identityHashCode(byq4) : 0) ^ n;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 27);
            int n2 = n ^ 0x1A950DAD;
            if ((n2 ^ n) == 445975981) break block0;
            int cfr_ignored_0 = (0x1E95508C ^ n) + -911275531;
        }
        return byq2.dkhw_2(byq3, f);
    }

    private static float fn(int n) {
        block0: {
            int n2 = ssh_8.ssw(-1032481474);
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 12)) ^ 0xB26E6ED3;
            if ((n3 ^ n2) == -1301385517) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x701BFBED ^ n2, 17) - -1748950802;
            int cfr_ignored_1 = (int)(0xB2A955D027D4EB4FL ^ (long)n2 ^ 0x56D0831A2DB8C883L);
        }
        return Float.intBitsToFloat(n);
    }

    private static byq rfth(byq byq2, byq byq3, float f) {
        block0: {
            int n = -1497959294;
            n = Integer.rotateLeft(n * -708110967, 7) ^ 0x25173B4C;
            byq byq4 = byq3;
            n = (byq4 != null ? System.identityHashCode(byq4) : 0) ^ n;
            int n2 = n ^ 0xA62160C3;
            if ((n2 ^ n) == -1507761981) break block0;
            int cfr_ignored_0 = (0x979441 ^ n) + -1362060537;
        }
        return byq2.dkhw_2(byq3, f);
    }

    private static int shtd(byq byq2) {
        block0: {
            int n = 1851010973;
            n = Integer.rotateLeft(n * 2010307343, 19) ^ 0x16862ED9;
            byq byq3 = byq2;
            n = Integer.rotateRight((byq3 != null ? System.identityHashCode(byq3) : 0) ^ n, 18);
            int n2 = n ^ 0x35E4EA7E;
            if ((n2 ^ n) == 904194686) break block0;
            int cfr_ignored_0 = (0x5BB0C5E3 ^ n) - -729449105;
        }
        return byq2.rk();
    }

    private static float tfj(float f, float f2, float f3) {
        block0: {
            int n = -703220370;
            n = Integer.rotateLeft(n * 222869633, 13) ^ 0xAF2BD7A4;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 2);
            n = Float.floatToIntBits(f3) ^ n;
            int n2 = n ^ 0x64551747;
            if ((n2 ^ n) == 1683298119) break block0;
            int cfr_ignored_0 = (0xB240A229 ^ n) + 1684092437;
        }
        return btsh_2.athd(f, f2, f3);
    }

    private static float ghds(float f, float f2, float f3) {
        block0: {
            int n = ssh_8.ssw(410851528);
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x8C7A1E86;
            if ((n2 ^ n) == -1938153850) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x9407064E ^ n, 5) - -248028499;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static float ssb_4(float f, float f2, float f3) {
        block0: {
            int n = -1584250410;
            n = Integer.rotateLeft(n * 1448891547, 8) ^ 0x2CFEE75C;
            n = Float.floatToIntBits(f2) ^ n;
            n = Integer.rotateRight(Float.floatToIntBits(f3) ^ n, 11);
            int n2 = n ^ 0x9D96A117;
            if ((n2 ^ n) == -1651072745) break block0;
            int cfr_ignored_0 = (0x3C04E0C1 ^ n) + -1051636652;
        }
        return class_3532.method_16439((float)f, (float)f2, (float)f3);
    }

    private static boolean std_3(class_1657 class_16572) {
        block0: {
            int n = 367063031;
            n = Integer.rotateLeft(n * -838421317, 18) ^ 0x86F471C;
            class_1657 class_16573 = class_16572;
            n = Integer.rotateLeft((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 9);
            int n2 = n ^ 0x1AD0CB34;
            if ((n2 ^ n) == 449891124) break block0;
            int cfr_ignored_0 = (0xF3024C3 ^ n) + 910918504;
        }
        return class_16572.method_6128();
    }

    private static float tkhd_3(float f, float f2, float f3) {
        block0: {
            int n = -162411985;
            n = Integer.rotateLeft(n * 1395695281, 24) ^ 0x780824C6;
            n = Integer.rotateRight(Float.floatToIntBits(f2) ^ n, 28);
            n = Integer.rotateRight(Float.floatToIntBits(f3) ^ n, 8);
            int n2 = n ^ 0xE093EF33;
            if ((n2 ^ n) == -527175885) break block0;
            int cfr_ignored_0 = (0x16C2251C ^ n) + -559583581;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static int htj_2(int n, int n2) {
        block0: {
            int n3 = -1472401763;
            n3 = Integer.rotateLeft(n3 * 1716801605, 10) ^ 0x1390393A;
            int n4 = (n3 = n ^ n3) ^ 0xBB8BE643;
            if ((n4 ^ n3) == -1148459453) break block0;
            int cfr_ignored_0 = (0x13B708DE ^ n3) + -605796157;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float thzk_2(int n) {
        block0: {
            int n2 = -1270662724;
            n2 = Integer.rotateLeft(n2 * 1122278399, 4) ^ 0xC5E20C4D;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 21)) ^ 0xC5D11BFD;
            if ((n3 ^ n2) == -976151555) break block0;
            int cfr_ignored_0 = (0x71922241 ^ n2) - -1878849137;
        }
        return Float.intBitsToFloat(n);
    }

    private static int brs_2(int n, int n2) {
        block0: {
            int n3 = -273502825;
            n3 = Integer.rotateLeft(n3 * -310478385, 23) ^ 0xFFFC4A41;
            int n4 = (n3 = Integer.rotateRight(n ^ n3, 24)) ^ 0x4665A634;
            if ((n4 ^ n3) == 1181066804) break block0;
            int cfr_ignored_0 = (0xA9D70BA3 ^ n3) + -1214270740;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float rtn_2(int n) {
        block0: {
            int n2 = -1044916332;
            n2 = Integer.rotateLeft(n2 * 248331779, 21) ^ 0xAA37A6C1;
            int n3 = (n2 = n ^ n2) ^ 0x327D9339;
            if ((n3 ^ n2) == 847090489) break block0;
            int cfr_ignored_0 = (0xF3CA44AD ^ n2) + 1919188732;
        }
        return Float.intBitsToFloat(n);
    }

    private static float thr_5(int n) {
        block0: {
            int n2 = ssh_8.ssw(1015855063);
            int n3 = n2 ^ 0xF26122CD;
            if ((n3 ^ n2) == -228515123) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xCEED951A ^ n2, 12) + 321039713) * -823290597;
        }
        return Float.intBitsToFloat(n);
    }

    private static boolean tdd_3(class_1657 class_16572) {
        block0: {
            int n = -904538717;
            int n2 = (n = Integer.rotateLeft(n * -648039087, 9) ^ 0x11F19508) ^ 0xAB3A886;
            if ((n2 ^ n) == 179546246) break block0;
            int cfr_ignored_0 = (0xC0A67D25 ^ n) - -1027313719;
        }
        return class_16572.method_5799();
    }

    private static float tsh_2(int n) {
        block0: {
            int n2 = 90399133;
            n2 = Integer.rotateLeft(n2 * -2124661447, 5) ^ 0x358264C2;
            int n3 = (n2 = n ^ n2) ^ 0xAA36645B;
            if ((n3 ^ n2) == -1439275941) break block0;
            int cfr_ignored_0 = (0xAF5505C6 ^ n2) - -1419624785;
        }
        return Float.intBitsToFloat(n);
    }

    private static float tghh(int n) {
        block0: {
            int n2 = 990826697;
            n2 = Integer.rotateLeft(n2 * 681964165, 28) ^ 0x1B34E083;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 21)) ^ 0xF1A8B537;
            if ((n3 ^ n2) == -240601801) break block0;
            int cfr_ignored_0 = (0xCAA665FE ^ n2) + 601710337;
        }
        return Float.intBitsToFloat(n);
    }

    private static float adhd(int n) {
        block0: {
            int n2 = ssh_8.ssw(451414921);
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 23)) ^ 0xADF3B693;
            if ((n3 ^ n2) == -1376536941) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xB71BBD1A ^ n2, 9) + 817464673) * -1222918885;
        }
        return Float.intBitsToFloat(n);
    }

    private static float dhnt(int n) {
        block0: {
            int n2 = -1647114639;
            n2 = Integer.rotateLeft(n2 * 586760143, 15) ^ 0xC503DD33;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 23)) ^ 0x37E79637;
            if ((n3 ^ n2) == 937924151) break block0;
            int cfr_ignored_0 = (0xAA349046 ^ n2) - -2005149467;
        }
        return Float.intBitsToFloat(n);
    }

    private static int dhtt_3(int n, int n2) {
        block0: {
            int n3 = -142953508;
            n3 = Integer.rotateLeft(n3 * 1798636811, 4) ^ 0xFF3B0603;
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 16)) ^ 0x31FDC0BF;
            if ((n4 ^ n3) == 838713535) break block0;
            int cfr_ignored_0 = (0xC6877363 ^ n3) - 1241966944;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int rsr(int n) {
        block0: {
            int n2 = -1762978939;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1606872469, 15) ^ 0xFC302939) ^ 0xE4F7C9E7;
            if ((n3 ^ n2) == -453522969) break block0;
            int cfr_ignored_0 = (0x721CDA62 ^ n2) + -1078287957;
        }
        return Integer.reverse(n);
    }

    private static float tzm_3(int n) {
        block0: {
            int n2 = ssh_8.ssw(1916189195);
            int n3 = (n2 = n ^ n2) ^ 0xD96C100E;
            if ((n3 ^ n2) == -647229426) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xAB5AAA05 ^ n2, 8) - -1000852010;
            int cfr_ignored_1 = (int)(0x69E8043827D4EB4FL ^ (long)n2 ^ 0xF500831A2DB97E01L);
        }
        return Float.intBitsToFloat(n);
    }

    private static float tmsh_2(int n) {
        block0: {
            int n2 = 1022480228;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1647869063, 11) ^ 0x8CE483C3) ^ 0x112D1C45;
            if ((n3 ^ n2) == 288169029) break block0;
            int cfr_ignored_0 = (0x2DDCD321 ^ n2) - 1799947335;
        }
        return Float.intBitsToFloat(n);
    }

    private static void zjt() {
        int n = 947015142;
        int n2 = (n = Integer.rotateLeft(n * 232377929, 24) ^ 0xDD91F2AC) ^ 0x98B221F4;
        if ((n2 ^ n) != -1733156364) {
            int cfr_ignored_0 = (0xA0C06C12 ^ n) + 289718772;
        }
        yf.athz_2();
    }

    private static String[] zmm(String string) {
        block0: {
            int n = 1038890044;
            n = Integer.rotateLeft(n * 1035437111, 18) ^ 0x4596289F;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 13);
            int n2 = n ^ 0x654B64;
            if ((n2 ^ n) == 6638436) break block0;
            int cfr_ignored_0 = (0x3D897F58 ^ n) - -1842796866;
        }
        return string.split("\u0006\u001a", -1);
    }

    private static CallSite jkhd(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1757175929;
            n3 = Integer.rotateLeft(n3 * -1973033991, 6) ^ 0xA8C7CF6B;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 24);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 13);
            int n4 = n3 ^ 0x2E3B6FC7;
            if ((n4 ^ n3) != 775647175) {
                int cfr_ignored_0 = (0xB978F040 ^ n3) - 1643563988;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ hsh ^ string.hashCode()) + (n2 + dza_2) + i ^ hsh, 18) + dza_2);
            }
            String[] stringArray = btsh_2.zmm(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] rhh995xt3hdsv(String string) {
        return string.split("\u0007\u001e", -1);
    }

    private static CallSite o0wwpzox32(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ u5aolzb526 ^ string.hashCode() ^ n2 + sfi6l8te6wcf + i * 1108610079) + u5aolzb526) ^ sfi6l8te6wcf));
            }
            String[] stringArray = btsh_2.rhh995xt3hdsv(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
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

