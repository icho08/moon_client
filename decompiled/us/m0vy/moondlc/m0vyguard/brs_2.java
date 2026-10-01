/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10156
 *  net.minecraft.class_10366
 *  net.minecraft.class_284
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_4184
 *  net.minecraft.class_5944
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Matrix4fc
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_10156;
import net.minecraft.class_10366;
import net.minecraft.class_284;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4184;
import net.minecraft.class_5944;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bghf;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fth;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="SkyShader", category=bzw.OTHER, desc="Draws shaders in the sky")
public class brs_2
extends bnq {
    private static brs_2 dhds_2;
    private final khd hmw = new khd(this, "Mode");
    private final fy thzr = new fy(this.hmw, "Water");
    private final fy thlm = new fy(this.hmw, "Caustic");
    private final fy rzdh = new fy(this.hmw, "Nebula");
    private final fy thar_2 = new fy(this.hmw, "Aurora");
    private final fy zwdh = new fy(this.hmw, "Starfall");
    private final fy hrs = new fy(this.hmw, "BlackHole");
    private final fy dhzt_2 = new fy(this.hmw, "Plasma");
    private final fy jqj = new fy(this.hmw, "Voronoi");
    private final fy tbr = new fy(this.hmw, "Stars");
    private final fy tkd_2 = new fy(this.hmw, "Core C".concat("austic"));
    private final fy swth = new fy(this.hmw, "Core Nebula");
    private final fy tas = new fy(this.hmw, "Radiant");
    private final fy thkd_2 = new fy(this.hmw, "Sunset");
    private final tay khhd = new tay(this, "Speed").shth_7(Float.intBitsToFloat(Integer.reverse(-514660031) ^ 0xBF5B864A)).dhbs_2(Float.intBitsToFloat(0x9AE00F1A ^ 0xDA400F1A)).rkh_3(Float.intBitsToFloat(-470043767 + 1506875716)).ssd_5(1.0f);
    private final tay rbw = new tay(this, "Scale").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(0xBD24503B ^ 0xFC84503B)).rkh_3(Float.intBitsToFloat(-1645978388 - 1592024300)).ssd_5(Float.intBitsToFloat(0xBC44E7B4 ^ 0xFCE4E7B4));
    private final tay dhdhw = new tay(this, "Intensity").shth_7(Float.intBitsToFloat(Integer.reverse(-1138676948) ^ 0xE579652)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xA91ECF40 ^ 0x308768E9, 19))).rkh_3(Float.intBitsToFloat(0xF4463994 ^ 0xCEC52BFB)).ssd_5(Float.intBitsToFloat(Integer.reverse(1303633004) ^ 0xA181AB8));
    private final tay jmr = new tay(this, "Alpha").shth_7(Float.intBitsToFloat(0xF3348845 ^ 0xCDAD11DF)).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(0x85C5818D ^ 0xB8894D40)).ssd_5(1.0f);
    private final badh_2 zrsh = new badh_2(this, "Theme Color").bts(true);
    private final bzw_2 dhra_2 = new bzw_2(this, "Custom Color", this::sfa_4).dhshy(new byq(Float.intBitsToFloat(0x5A752E8 ^ 0x46D852E8), Float.intBitsToFloat(Integer.rotateLeft(0xAD074BFE ^ 0xAF1CB3FE, 5)), Float.intBitsToFloat(Integer.reverse(1697097573) ^ 0xE59AE4A6), Float.intBitsToFloat(0x731D3944 ^ 0x30623944)));
    public static final fth hdb_2;
    private static final class_10156 dst_2;
    public static final fth bbq;
    private static final class_10156 hzz;
    public static final fth dhldh;
    private static final class_10156 khbd;
    public static final fth shkhk;
    private static final class_10156 sjl;
    public static final fth dakh;
    private static final class_10156 sshf;
    public static final fth zhh_3;
    private static final class_10156 zaj;
    public static final fth dhs_5;
    private static final class_10156 zghf;
    public static final fth bshk;
    private static final class_10156 bdhdh;
    public static final fth thkd;
    private static final class_10156 dhr_3;
    private static final fth dy;
    private static final class_10156 dhthj;
    private static final fth khdth_2;
    private static final class_10156 shsh_7;
    private static final fth hwb;
    private static final class_10156 sdh_2;
    private static final fth zsha;
    private static final class_10156 ghd_2;
    private long dls = 0x62F6035295D8E739L ^ 0x9D09FCAD6A2718C6L;
    private static final int dhts_2 = 2079226292;
    private static final int zzn = 1132132367;
    private static final int bhm_2 = 1054981149;
    private static final int dhdh = 1830133494;
    private static final int l0gtl3h = 732038226;
    private static final int ynwskf8bs4 = 1678697368;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int g2nmwmy73no;

    public static brs_2 sdj_4() {
        block0: {
            int n = -1289775050;
            int n2 = (n = Integer.rotateLeft(n * 326570573, 26) ^ 0xA2AD8C66) ^ 0x76FF05C7;
            if ((n2 ^ n) == 1996424647) break block0;
            int cfr_ignored_0 = (0xC5E09DF1 ^ n) - 1108043474;
        }
        return dhds_2;
    }

    public brs_2() {
        dhds_2 = this;
    }

    @Override
    public void nc() {
        try {
            int n = -1991286000;
            n = Integer.rotateLeft(n * 272067573, 10) ^ 0xAA43DBA3;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xBCE3E1A1;
            if ((n2 ^ n) != -1125916255) {
                int cfr_ignored_0 = (0x35AC82B1 ^ n) - 378768124;
            }
            if ((0xCB & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        this.dls = 0xDA137B77B6EB6EA5L ^ 0x25EC84884914915AL;
    }

    private class_10156 baa_4() {
        int n = -1839647164;
        int n2 = (n = Integer.rotateLeft(n * -1483677807, 23) ^ 0x962C912C) ^ 0x103FC5DB;
        if ((n2 ^ n) != 272614875) {
            int cfr_ignored_0 = (0x8266F39F ^ n) - -2074138709;
        }
        if (brs_2.shr(this.hmw) == null) {
            return dst_2;
        }
        String string = brs_2.sdf_3(this.hmw.sdh_2());
        int n3 = -1;
        switch (string.hashCode()) {
            case -2073142414: {
                if (!brs_2.thshr(string, "Caustic")) break;
                n3 = 0;
                break;
            }
            case -1965582497: {
                if (!string.equals("Nebula")) break;
                n3 = 1;
                break;
            }
            case 1972453248: {
                if (!string.equals("Aurora")) break;
                n3 = 2;
                break;
            }
            case 1381026029: {
                if (!string.equals(brs_2.zdh_5("뎫ꌧ銧跋﵊\udc16쾁", brs_2.shkh_7(0x7FCFEA6F ^ 0x1EB645D9, 3), 29376704 - -105964397, Integer.reverse(1156501305) ^ 0x4A8923))) break;
                n3 = 3;
                break;
            }
            case -959053505: {
                if (!brs_2.ghzq(string, "BlackHole")) break;
                n3 = 4;
                break;
            }
            case -1901891230: {
                if (!string.equals("Plasma")) break;
                n3 = 5;
                break;
            }
            case -1992528846: {
                if (!string.equals("Voronoi")) break;
                n3 = 332778558 - 332778552;
                break;
            }
            case 80204865: {
                if (!string.equals(brs_2.nr_2("괠붬谬鍀", brs_2.rbk(312585484) ^ 0xA25C724F, 26571250 - 475120095, Integer.rotateLeft(0xF292D2A9 ^ 0x390D32B0, 28)))) break;
                n3 = 627080966 - 627080959;
            }
        }
        return switch (n3) {
            case 0 -> hzz;
            case 1 -> khbd;
            case 2 -> sjl;
            case 3 -> sshf;
            case 4 -> zaj;
            case 5 -> zghf;
            case 6 -> bdhdh;
            case 7 -> dhr_3;
            default -> dst_2;
        };
    }

    public void zss_2() {
        if (brs_2.mc.field_1724 == null || brs_2.mc.field_1687 == null) {
            return;
        }
        if (this.dls < 0L) {
            this.dls = System.currentTimeMillis();
        }
        float f = (float)(System.currentTimeMillis() - this.dls) / 1000.0f;
        float f2 = mc.method_22683().method_4489();
        float f3 = mc.method_22683().method_4506();
        byq byq2 = this.zrsh.shzl() ? bhj_2.ths() : this.dhra_2.sdsh_4();
        float f4 = byq2.sbk() / 255.0f;
        float f5 = byq2.srl() / 255.0f;
        float f6 = byq2.shsl_2() / 255.0f;
        if (this.dhra_2()) {
            this.stq_4(this.swkh_2(), f, f4, f5, f6);
            return;
        }
        this.hrl(this.baa_4(), f, f2, f3, f4, f5, f6);
    }

    private boolean dhra_2() {
        int n = bghf.bdl_2(-548222444);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 16);
        int n2 = n ^ 0xFD548B8E;
        if ((n2 ^ n) != -44790898) {
            int cfr_ignored_0 = (Integer.rotateRight(0x2206419A ^ n, 7) + 589271265) * 570835355;
        }
        return this.hmw.sdh_2() == this.tkd_2 || brs_2.dkl(this.hmw) == this.swth || brs_2.hjy(this.hmw) == this.tas || this.hmw.sdh_2() == this.thkd_2;
    }

    /*
     * Unable to fully structure code
     */
    private class_10156 swkh_2() {
        var1_1 = null;
        var4_2 = 0;
        var2_3 = -287543106;
        var2_3 = Integer.rotateLeft(var2_3 * -105347471, 26) ^ 234476267;
        var2_3 = Integer.rotateRight(System.identityHashCode(this) ^ var2_3, 27);
        var3_4 = -10091023 + var2_3 + 932525214 - 932525214;
        block37: while (true) {
            if ((var4_2 = var3_4 - var2_3) == -334921206) ** GOTO lbl180
            if (var4_2 == 1285874189) ** GOTO lbl-1000
            if (var4_2 != -493036339) {
                switch (var4_2) {
                    case -1843130813: {
                        (Integer.rotateRight(1049395127 ^ var2_3, 10) - -1755244956) * 1049395127;
                        if (brs_2.szth_3(this.hmw) != this.thkd_2) {
                            try {
                                ++var4_2;
                                if ((232241583477253289L ^ (long)var2_3 | 1L) == 0L) {
                                    throw new NoSuchElementException();
                                }
                                var3_4 = -1982073111 + var2_3 ^ 1232464909 ^ 1232464909;
                            }
                            catch (NoSuchElementException v0) {
                                var3_4 = -1982073111 + var2_3 + 844327349 - 844327349;
                            }
                            --var4_2;
                            continue block37;
                        }
                        (int)(-2678281139355988220L ^ (long)var2_3 ^ 6308466305572673656L);
                        var3_4 = 240847463 + var2_3;
                        continue block37;
                    }
                    case 559390905: {
                        Integer.rotateRight(1720167822 ^ var2_3, 15) - 1858839405;
                        var1_1 = brs_2.sdh_2;
                        var3_4 = -2146577719 + var2_3 ^ -1808544232 ^ -1808544232;
                        continue block37;
                    }
                    case -1982073111: {
                        (Integer.rotateRight(894148414 ^ var2_3, 9) - 2022041533) * 894148415;
                        var1_1 = brs_2.sdh_2;
                        try {
                            if ((-7645846485344744431L ^ (long)var2_3 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var3_4 = -2146577719 + var2_3 ^ -1631632336 ^ -1631632336;
                        }
                        catch (ArithmeticException v1) {
                            var3_4 = Integer.reverse(Integer.reverse(-2146577719 + var2_3));
                        }
                        var4_2 -= 3;
                        continue block37;
                    }
                    case 1736733232: {
                        Integer.rotateRight(1001772422 ^ var2_3, 10) - 1063418485;
                        var1_1 = brs_2.shsh_7;
                        try {
                            if ((-4631817060332002445L ^ (long)var2_3 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            var3_4 = Integer.reverse(Integer.reverse(-2146577719 + var2_3));
                        }
                        catch (IllegalArgumentException v2) {
                            var3_4 = -2146577719 + var2_3;
                        }
                        var4_2 -= 4;
                        continue block37;
                    }
                    case -1846587295: {
                        (Integer.rotateLeft(896131057 ^ var2_3, 9) + 2083503466) * 896131057;
                        (int)(-586750204786185393L ^ (long)var2_3 ^ 2227174164194148967L);
                        var1_1 = brs_2.dhthj;
                        try {
                            var4_2 -= 5;
                            var3_4 = Integer.reverse(Integer.reverse(-2146577719 + var2_3));
                        }
                        catch (IllegalStateException v3) {
                            var3_4 = (int)((long)(-2146577719 + var2_3) ^ -886404341561125094L ^ -886404341561125094L);
                        }
                        var4_2 += 4;
                        continue block37;
                    }
                    case 240847463: {
                        Integer.rotateRight(-652562801 ^ var2_3, 14) - 1318634124;
                        var1_1 = brs_2.ghd_2;
                        var3_4 = -2146577719 + var2_3;
                        var4_2 -= 4;
                        continue block37;
                    }
                    case -10091023: {
                        (Integer.rotateRight(-557224558 ^ var2_3, 14) + -20847639) * -557224557;
                        if (brs_2.zkhdh_2(this.hmw) != this.tkd_2) {
                            var3_4 = -1755804577 + var2_3 ^ -673658674 ^ -673658674;
                            Integer.rotateLeft(-145018751 ^ var2_3, 17) + -127369510;
                            (int)(3884810684543069007L ^ (long)var2_3 ^ -4609290070154164734L);
                            var3_4 = (int)((long)(-1784863641 + var2_3) ^ 2579585740793618808L ^ 2579585740793618808L);
                            continue block37;
                        }
                        var3_4 = 1578405433 + var2_3 + 798474875 - 798474875;
                        Integer.rotateRight(-1699182517 ^ var2_3, 6) + -1061806000;
                        var3_4 = -1846587295 + var2_3;
                        --var4_2;
                        continue block37;
                    }
                    case -1784863641: {
                        (Integer.rotateLeft(1403319869 ^ var2_3, 13) - 626487454) * 1403319869;
                        (int)(-7992103731030856881L ^ (long)var2_3 ^ 5580104086771503101L);
                        if (this.hmw.sdh_2() == this.swth) {
                            var3_4 = (int)((long)(1736733232 + var2_3) ^ 7716097284138712917L ^ 7716097284138712917L);
                            --var4_2;
                            continue block37;
                        }
                        try {
                            var4_2 -= 3;
                            if ((5164119462952871679L ^ (long)var2_3 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            var3_4 = -1843130813 + var2_3;
                        }
                        catch (IllegalArgumentException v4) {
                            var3_4 = -1843130813 + var2_3 ^ 1847609903 ^ 1847609903;
                        }
                        ++var4_2;
                        continue block37;
                    }
                }
            }
            ** GOTO lbl138
lbl-1000:
            // 1 sources

            {
                (Integer.rotateLeft(-1814790448 ^ var2_3, 5) + -350684565) * -1814790447;
                var3_4 = (int)((long)(-10091023 + var2_3) ^ 8721827262580085701L ^ 8721827262580085701L);
                --var4_2;
                continue block37;
                case 63658091: {
                    (Integer.rotateRight(-677321030 ^ var2_3, 13) + 551129025) * -677321029;
                    var3_4 = (int)((long)(716738324 + var2_3) ^ -7744918599669838927L ^ -7744918599669838927L);
                    (Integer.rotateLeft(-408638255 ^ var2_3, 15) + 290360458) * -408638255;
                    (int)(2672326642194770767L ^ (long)var2_3 ^ -529028807756486659L);
                    var3_4 = -1943638861 + var2_3 + -660534410 - -660534410;
                    Integer.rotateRight(1085919591 ^ var2_3, 11) - -622986572;
                    var3_4 = (int)((long)(-10091023 + var2_3) ^ -1816323742034011410L ^ -1816323742034011410L);
                    continue block37;
                }
lbl138:
                // 1 sources

                Integer.rotateLeft(763479564 ^ var2_3, 8) - -2028692817;
                (int)(-7886180760618482576L ^ (long)var2_3 ^ -5930153212995270452L);
                var3_4 = Integer.reverse(Integer.reverse(644692615 + var2_3));
                (int)(3604660859856289688L ^ (long)var2_3 ^ 6528110914281392605L);
                var3_4 = (int)((long)(-10091023 + var2_3) ^ -7413751010183536938L ^ -7413751010183536938L);
                var4_2 += 2;
                continue block37;
                case 273093920: {
                    (Integer.rotateRight(-1226570502 ^ var2_3, 9) + 704264577) * -1226570501;
                    var3_4 = -1952993377 + var2_3 ^ 1879530103 ^ 1879530103;
                    Integer.rotateRight(437819723 ^ var2_3, 6) + 760754000;
                    var3_4 = 1613780061 + var2_3 + 758026447 - 758026447;
                    (Integer.rotateRight(25290294 ^ var2_3, 3) - 857243589) * 25290295;
                    var3_4 = -10091023 + var2_3 + -1581004960 - -1581004960;
                    continue block37;
                }
                case -146006801: {
                    Integer.rotateRight(-495824050 ^ var2_3, 15) - 1882568109;
                    var3_4 = 167647764 + var2_3 ^ 1745565447 ^ 1745565447;
                    (Integer.rotateLeft(1769543384 ^ var2_3, 16) + -905485469) * 1769543385;
                    var3_4 = (int)((long)(-10091023 + var2_3) ^ -5051291469577590797L ^ -5051291469577590797L);
                    continue block37;
                }
                case 1380195795: {
                    (Integer.rotateRight(1682054966 ^ var2_3, 15) - 677340869) * 1682054967;
                    var3_4 = -763834666 + var2_3 ^ 1639843980 ^ 1639843980;
                    (Integer.rotateRight(-386352097 ^ var2_3, 16) - 981231356) * -386352097;
                    try {
                        var3_4 = Integer.reverse(Integer.reverse(-10091023 + var2_3));
                    }
                    catch (IllegalArgumentException v5) {
                        var3_4 = (int)((long)(-10091023 + var2_3) ^ 834060100717678774L ^ 834060100717678774L);
                    }
                    var4_2 += 5;
                    continue block37;
                }
lbl180:
                // 1 sources

                (Integer.rotateRight(1375491379 ^ var2_3, 13) + -236195736) * 1375491379;
                (int)(4489915459755432288L ^ (long)var2_3 ^ 4166999743088021839L);
                var3_4 = Integer.reverse(Integer.reverse(-10091023 + var2_3));
                ++var4_2;
                continue block37;
                case 1071062707: {
                    Integer.rotateLeft(-679838291 ^ var2_3, 13) - 473093934;
                    (int)(1569737086235634511L ^ (long)var2_3 ^ 6507845610009888320L);
                    var3_4 = -10091023 + var2_3 + 815287563 - 815287563;
                    continue block37;
                }
                case -3112206: {
                    Integer.rotateRight(566248387 ^ var2_3, 7) + 447075288;
                    var3_4 = Integer.reverse(Integer.reverse(-1810761531 + var2_3));
                    Integer.rotateLeft(-1891699327 ^ var2_3, 4) + 1560107482;
                    (int)(5587942101340187471L ^ (long)var2_3 ^ 5334657907079853769L);
                    var3_4 = 2017338281 + var2_3 + -1974337678 - -1974337678;
                    (Integer.rotateLeft(895668149 ^ var2_3, 9) - 2069153318) * 895668149;
                    (int)(-589864313773823153L ^ (long)var2_3 ^ 4494736576575193713L);
                    var3_4 = (int)((long)(-10091023 + var2_3) ^ 3388995157079681388L ^ 3388995157079681388L);
                    var4_2 += 3;
                    continue block37;
                }
                case 37621705: {
                    Integer.rotateRight(-943341433 ^ var2_3, 11) - 894431124;
                    var3_4 = -10091023 + var2_3;
                    var4_2 += 4;
                    continue block37;
                }
                case -1252013408: {
                    Integer.rotateRight(-1796077214 ^ var2_3, 5) + 229425689;
                    var3_4 = -1002878635 + var2_3 ^ 1335925177 ^ 1335925177;
                    Integer.rotateLeft(344414756 ^ var2_3, 5) - -2134799977;
                    var3_4 = (int)((long)(-10091023 + var2_3) ^ -4942226093850813838L ^ -4942226093850813838L);
                    continue block37;
                }
                case 1762605815: {
                    Integer.rotateLeft(5032548 ^ var2_3, 3) - 229253463;
                    try {
                        if ((-609454460094922699L ^ (long)var2_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var3_4 = Integer.reverse(Integer.reverse(-10091023 + var2_3));
                    }
                    catch (ArithmeticException v6) {
                        var3_4 = -10091023 + var2_3 + 706735422 - 706735422;
                    }
                    var4_2 += 3;
                    continue block37;
                }
                case 725290406: {
                    Integer.rotateLeft(-1219554680 ^ var2_3, 9) + 921755059;
                    try {
                        if ((1518992832288309281L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var3_4 = -10091023 + var2_3 ^ -1965627485 ^ -1965627485;
                    }
                    catch (IllegalArgumentException v7) {
                        var3_4 = Integer.reverse(Integer.reverse(-10091023 + var2_3));
                    }
                    ++var4_2;
                    continue block37;
                }
                case -2146577719: {
                    return var1_1;
                }
            }
            (Integer.rotateLeft(-1526910083 ^ var2_3, 7) - -16327842) * -1526910083;
            (int)(7372284013900524367L ^ (long)var2_3 ^ -4039584717291822770L);
            var3_4 = -10091023 + var2_3 ^ -1373740776 ^ -1373740776;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void hrl(class_10156 class_101562, float f, float f2, float f3, float f4, float f5, float f6) {
        Matrix4f matrix4f = new Matrix4f((Matrix4fc)RenderSystem.getProjectionMatrix());
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        matrix4fStack.identity();
        RenderSystem.setProjectionMatrix((Matrix4f)new Matrix4f(), (class_10366)class_10366.field_54954);
        try {
            class_5944 class_59442 = RenderSystem.setShader((class_10156)class_101562);
            if (class_59442 == null) {
                return;
            }
            class_59442.method_34582("uTime").method_1251(f);
            class_59442.method_34582("uResolution").method_1255(f2, f3);
            class_59442.method_34582("uColor").method_1249(f4, f5, f6);
            class_59442.method_34582("uAlpha").method_1251(this.jmr.thw_5());
            class_59442.method_34582("uSpeed").method_1251(this.khhd.thw_5());
            class_59442.method_34582("uScale").method_1251(this.rbw.thw_5());
            class_59442.method_34582("uIntensity").method_1251(this.dhdhw.thw_5());
            class_4184 class_41842 = brs_2.mc.field_1773.method_19418();
            class_59442.method_34582("uCameraDir").method_1255((float)Math.toRadians(-class_41842.method_19330()), (float)Math.toRadians(class_41842.method_19329()));
            class_59442.method_34582("uFov").method_1251((float)((Integer)brs_2.mc.field_1690.method_41808().method_41753()).intValue());
            brs_2.dth_2();
            Matrix4f matrix4f2 = new Matrix4f();
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1592);
            class_2872.method_22918(matrix4f2, -1.0f, -1.0f, 1.0f);
            class_2872.method_22918(matrix4f2, 1.0f, -1.0f, 1.0f);
            class_2872.method_22918(matrix4f2, 1.0f, 1.0f, 1.0f);
            class_2872.method_22918(matrix4f2, -1.0f, 1.0f, 1.0f);
            class_286.method_43433((class_9801)class_2872.method_60800());
        }
        finally {
            brs_2.khshz(matrix4f);
            matrix4fStack.popMatrix();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void stq_4(class_10156 class_101562, float f, float f2, float f3, float f4) {
        Matrix4f matrix4f = new Matrix4f((Matrix4fc)RenderSystem.getProjectionMatrix());
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        matrix4fStack.identity();
        RenderSystem.setProjectionMatrix((Matrix4f)new Matrix4f(), (class_10366)class_10366.field_54954);
        try {
            class_5944 class_59442 = RenderSystem.setShader((class_10156)class_101562);
            if (class_59442 == null) {
                return;
            }
            class_4184 class_41842 = brs_2.mc.field_1773.method_19418();
            brs_2.dhdhs(class_59442, "Time", f * this.khhd.thw_5());
            brs_2.hsht(class_59442, "Accent", f2, f3, f4);
            brs_2.dhdhs(class_59442, "CameraYaw", (float)Math.toRadians(-class_41842.method_19330()));
            brs_2.dhdhs(class_59442, "CameraPitch", (float)Math.toRadians(class_41842.method_19329()));
            if (class_59442.method_34582("ColorModulator") != null) {
                class_59442.method_34582("ColorModulator").method_35657(1.0f, 1.0f, 1.0f, this.jmr.thw_5());
            }
            brs_2.dth_2();
            Matrix4f matrix4f2 = new Matrix4f();
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            class_2872.method_22918(matrix4f2, -1.0f, -1.0f, 1.0f).method_22913(0.0f, 0.0f).method_39415(-1);
            class_2872.method_22918(matrix4f2, 1.0f, -1.0f, 1.0f).method_22913(1.0f, 0.0f).method_39415(-1);
            class_2872.method_22918(matrix4f2, 1.0f, 1.0f, 1.0f).method_22913(1.0f, 1.0f).method_39415(-1);
            class_2872.method_22918(matrix4f2, -1.0f, 1.0f, 1.0f).method_22913(0.0f, 1.0f).method_39415(-1);
            class_286.method_43433((class_9801)class_2872.method_60800());
        }
        finally {
            brs_2.khshz(matrix4f);
            matrix4fStack.popMatrix();
        }
    }

    private static void dth_2() {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableDepthTest();
        RenderSystem.depthFunc((int)515);
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableCull();
    }

    private static void khshz(Matrix4f matrix4f) {
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableCull();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
        RenderSystem.depthFunc((int)515);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderSystem.setProjectionMatrix((Matrix4f)matrix4f, (class_10366)class_10366.field_54953);
    }

    private static void dhdhs(class_5944 class_59442, String string, float f) {
        try {
            int n = -1260369630;
            n = Integer.rotateLeft(n * 1948148427, 9) ^ 0xD41168A1;
            int n2 = n ^ 0x2C79827D;
            if ((n2 ^ n) != 746160765) {
                int cfr_ignored_0 = (0x9899CB5F ^ n) - 1093171323;
            }
            if ((0x3B3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (class_59442.method_34582(string) != null) {
            class_59442.method_34582(string).method_1251(f);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void hsht(class_5944 class_59442, String string, float f, float f2, float f3) {
        int n = 0;
        int n2 = bghf.bdl_2(2023869806);
        String string2 = string;
        n2 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n2;
        n2 = Float.floatToIntBits(f3) ^ n2;
        int n3 = (n2 ^ 0x44F2861B) + 1352434568 - 1352434568;
        while (true) {
            block25: {
                block35: {
                    block34: {
                        block28: {
                            block32: {
                                block29: {
                                    block22: {
                                        block26: {
                                            block24: {
                                                block23: {
                                                    block37: {
                                                        block33: {
                                                            block38: {
                                                                block36: {
                                                                    block30: {
                                                                        block31: {
                                                                            block17: {
                                                                                block18: {
                                                                                    block27: {
                                                                                        block20: {
                                                                                            block21: {
                                                                                                block19: {
                                                                                                    block16: {
                                                                                                        if ((n = n3 ^ n2) <= -882662290) break block16;
                                                                                                        if (n <= -535102610) break block17;
                                                                                                        break block18;
                                                                                                    }
                                                                                                    if (n <= -1803871411) break block19;
                                                                                                    if (n <= -1770723553) break block20;
                                                                                                    break block21;
                                                                                                }
                                                                                                if (n == -1857500713) break block22;
                                                                                                if (n == -1814258394) break block23;
                                                                                                if (n == -1803871411) break block24;
                                                                                                break block25;
                                                                                            }
                                                                                            if (n == -919184455) break block26;
                                                                                            break block27;
                                                                                        }
                                                                                        if (n == -1785497104) break block28;
                                                                                        if (n == -1770723553) {
                                                                                            int cfr_ignored_0 = (Integer.rotateRight(0x6FCFFBDA ^ n2, 16) + -1903354207) * 1875901403;
                                                                                            return;
                                                                                        }
                                                                                        int cfr_ignored_1 = Integer.rotateRight(0xB863F622 ^ n2, 10) + 1484287321;
                                                                                        break block25;
                                                                                    }
                                                                                    if (n == -882662290) break block29;
                                                                                    break block25;
                                                                                }
                                                                                if (n <= 1156744731) break block30;
                                                                                break block31;
                                                                            }
                                                                            if (n == -795099922) break block32;
                                                                            if (n == -575836038) break block33;
                                                                            int cfr_ignored_2 = Integer.rotateLeft(0x98136A64 ^ n2, 6) - 1857519959;
                                                                            if (n == -535102610) break block34;
                                                                            break block25;
                                                                        }
                                                                        if (n == 1239963244) break block35;
                                                                        break block36;
                                                                    }
                                                                    if (n == 313712982) break block37;
                                                                    if (n == 1156744731) break block38;
                                                                    int cfr_ignored_3 = (Integer.rotateLeft(0x39EE631 ^ n2, 3) + 1956347690) * 60745265;
                                                                    int cfr_ignored_4 = (int)(0xC12C480C27D4EB4FL ^ (long)n2 ^ 0x6D68831A2DB82F89L);
                                                                    break block25;
                                                                }
                                                                if (n != 1432806024) {
                                                                    int cfr_ignored_5 = Integer.rotateRight(0xDAF688A6 ^ n2, 14) - -2009584811;
                                                                    break block25;
                                                                } else {
                                                                    int cfr_ignored_6 = Integer.rotateRight(0xA7C167A7 ^ n2, 7) - 1422470260;
                                                                    brs_2.sjsh_2(class_59442, string).method_1249(f, f2, f3);
                                                                    try {
                                                                        n += 2;
                                                                        if ((0xCFD0FE72C9C4DE35L ^ (long)n2 | 1L) == 0L) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x9674E71F));
                                                                    }
                                                                    catch (IllegalStateException illegalStateException) {
                                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x9674E71F));
                                                                    }
                                                                    n += 3;
                                                                    continue;
                                                                }
                                                            }
                                                            int cfr_ignored_7 = (Integer.rotateRight(0xCCCF621B ^ n2, 12) + -780500864) * -858824165;
                                                            if (class_59442.method_34582(string) != null) {
                                                                n3 = n2 ^ 0x5566E288;
                                                                int cfr_ignored_8 = Integer.rotateRight(0x9FBBA302 ^ n2, 6) + 1544969337;
                                                                continue;
                                                            }
                                                            n3 = n2 ^ 0x9674E71F;
                                                            int cfr_ignored_9 = Integer.rotateLeft(0x7A56D261 ^ n2, 18) + -723445510;
                                                            int cfr_ignored_10 = (int)(0xB8E47C5C27D4EB4FL ^ (long)n2 ^ 0x5C8831A2DB8DC19L);
                                                            continue;
                                                        }
                                                        int cfr_ignored_11 = Integer.rotateLeft(0xBAD65E24 ^ n2, 10) - -1538062953;
                                                        n3 = (n2 ^ 0x44F2861B) + 278870894 - 278870894;
                                                        n -= 4;
                                                        continue;
                                                    }
                                                    int cfr_ignored_12 = (Integer.rotateRight(0xB072A95B ^ n2, 9) + 1648369984) * -1334662821;
                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xEEBD0868));
                                                    int cfr_ignored_13 = (Integer.rotateLeft(0xD6C1D2DC ^ n2, 13) - 97920991) * -691940643;
                                                    int cfr_ignored_14 = (int)(0x1D776F884069462EL ^ (long)n2 ^ 0x22604C61777B973FL);
                                                    n3 = (n2 ^ 0x44F2861B) + -1928767255 - -1928767255;
                                                    n -= 4;
                                                    continue;
                                                }
                                                int cfr_ignored_15 = (Integer.rotateRight(0xBF55CB9F ^ n2, 10) - 801195900) * -1084896353;
                                                int cfr_ignored_16 = (int)(0xAE30193D524AA64L ^ (long)n2 ^ 0xFE5766FAAFEFB817L);
                                                n3 = (int)((long)(n2 ^ 0xB9E5E706) ^ 0xB8512C5E16867F9CL ^ 0xB8512C5E16867F9CL);
                                                int cfr_ignored_17 = (int)(0x29309C4F91BA7326L ^ (long)n2 ^ 0xC5EFEFC71D6BFFB0L);
                                                n3 = (int)((long)(n2 ^ 0x44F2861B) ^ 0xC1380DC60A7B5C65L ^ 0xC1380DC60A7B5C65L);
                                                n += 4;
                                                continue;
                                            }
                                            int cfr_ignored_18 = (Integer.rotateRight(0xB63E4277 ^ n2, 9) - 367504292) * -1237433737;
                                            try {
                                                n3 = (int)((long)(n2 ^ 0x44F2861B) ^ 0xA7982F9F5E873F89L ^ 0xA7982F9F5E873F89L);
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x44F2861B));
                                            }
                                            n -= 3;
                                            continue;
                                        }
                                        int cfr_ignored_19 = Integer.rotateRight(0x1F2D42A3 ^ n2, 6) + -891768584;
                                        n3 = (n2 ^ 0xE05903D5) + 1085527025 - 1085527025;
                                        int cfr_ignored_20 = (Integer.rotateLeft(0xC3666F19 ^ n2, 11) + -1379593406) * -1016697063;
                                        int cfr_ignored_21 = (int)(0x1D4C12427D4EB4FL ^ (long)n2 ^ 0x7F38831A2DB9AE78L);
                                        int cfr_ignored_22 = (int)(0x9EB45D8339A075F7L ^ (long)n2 ^ 0x4676BFF310C890B9L);
                                        n3 = (n2 ^ 0x7FA439F1) + 207036700 - 207036700;
                                        int cfr_ignored_23 = (int)(0x1248713519F3C0F8L ^ (long)n2 ^ 0x1F1AFF547AD78941L);
                                        n3 = (n2 ^ 0x44F2861B) + 1649818403 - 1649818403;
                                        ++n;
                                        continue;
                                    }
                                    int cfr_ignored_24 = (Integer.rotateRight(0x8A4FD96 ^ n2, 4) - 274224229) * 145030551;
                                    n3 = n2 ^ 0x1384FDB;
                                    int cfr_ignored_25 = Integer.rotateLeft(0x41133A6C ^ n2, 11) - -441339313;
                                    n3 = (int)((long)(n2 ^ 0x44F2861B) ^ 0x4610BF1087E59C7DL ^ 0x4610BF1087E59C7DL);
                                    ++n;
                                    continue;
                                }
                                int cfr_ignored_26 = (Integer.rotateLeft(0x4197245D ^ n2, 11) - -173341058) * 1100424285;
                                int cfr_ignored_27 = (int)(0x83258A6027D4EB4FL ^ (long)n2 ^ 0xE9B0831A2DB8AB9AL);
                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x8756D686));
                                int cfr_ignored_28 = Integer.rotateRight(0xA0D61963 ^ n2, 7) + 2118824504;
                                try {
                                    if ((0x565F204650421DD3L ^ (long)n2 | 1L) == 0L) {
                                        throw new UnsupportedOperationException();
                                    }
                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x44F2861B));
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    n3 = (n2 ^ 0x44F2861B) + 1196427875 - 1196427875;
                                }
                                continue;
                            }
                            int cfr_ignored_29 = (Integer.rotateLeft(0xA6724534 ^ n2, 7) - 741605511) * -1502460619;
                            int cfr_ignored_30 = (int)(0x6214988881A2E828L ^ (long)n2 ^ 0xCC61CFF62B7769F8L);
                            n3 = n2 ^ 0x44F2861B ^ 0x6367F65F ^ 0x6367F65F;
                            n += 4;
                            continue;
                        }
                        int cfr_ignored_31 = (Integer.rotateRight(0x176401FE ^ n2, 5) - -646324995) * 392430079;
                        int cfr_ignored_32 = (int)(0x1347B3C9A3429E21L ^ (long)n2 ^ 0x9AE38A36C7658B5EL);
                        n3 = n2 ^ 0x44F2861B;
                        n -= 2;
                        continue;
                    }
                    int cfr_ignored_33 = (Integer.rotateRight(0x1D563292 ^ n2, 6) + -1848787223) * 492188307;
                    int cfr_ignored_34 = (int)(0xA2C35DAC98AA1BEAL ^ (long)n2 ^ 0x4629FDE7CCF2E857L);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x4C13DA34));
                    int cfr_ignored_35 = (int)(0x9583257E1EE4A450L ^ (long)n2 ^ 0xB78CF17AB38686D7L);
                    n3 = n2 ^ 0x44F2861B ^ 0xAFFDA5EA ^ 0xAFFDA5EA;
                    continue;
                }
                int cfr_ignored_36 = (Integer.rotateLeft(0x8FF316D5 ^ n2, 4) - 1926062854) * -1879894315;
                int cfr_ignored_37 = (int)(0x4D41B8E827D4EB4FL ^ (long)n2 ^ 0x8CA0831A2DB93752L);
                n3 = n2 ^ 0xEC7E2932;
                int cfr_ignored_38 = Integer.rotateLeft(0xDA7A52E1 ^ n2, 14) + 2033035386;
                int cfr_ignored_39 = (int)(0x18C8FCDC27D4EB4FL ^ (long)n2 ^ 0x4C8831A2DB99C40L);
                try {
                    if ((0xAEF96EF0D9C6E5E5L ^ (long)n2 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    n3 = (int)((long)(n2 ^ 0x44F2861B) ^ 0xDB1E6331427F4C42L ^ 0xDB1E6331427F4C42L);
                }
                catch (ArithmeticException arithmeticException) {
                    n3 = n2 ^ 0x44F2861B;
                }
                n += 5;
                continue;
            }
            int cfr_ignored_40 = (Integer.rotateRight(0xB7A3A5F6 ^ n2, 9) - 1093580805) * -1214011913;
            n3 = n2 ^ 0x44F2861B ^ 0xFE4AD7CF ^ 0xFE4AD7CF;
        }
    }

    private boolean sfa_4() {
        int n;
        block4: {
            try {
                int n2 = -1797886770;
                n2 = Integer.rotateLeft(n2 * 394321039, 17) ^ 0xE65B59F3;
                int n3 = n2 ^ 0x1B68700A;
                if ((n3 ^ n2) != 459829258) {
                    int cfr_ignored_0 = (0x8FBE1CC4 ^ n2) + -1972250652;
                }
                if ((0x1BC & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = !this.zrsh.shzl() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block4;
            n = n ^ 0xD03B;
        }
        return n != 0;
    }

    private static String nr_2(String string, int n, int n2, int n3) {
        int n4 = -1822460272;
        n4 = Integer.rotateLeft(n4 * 437972405, 16) ^ 0xEC5643E0;
        String string2 = string;
        n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 19);
        int n5 = n4 ^ 0x236FA653;
        if ((n5 ^ n4) != 594519635) {
            int cfr_ignored_0 = (0xB030D0C3 ^ n4) - -155244000;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x14CB9C86 ^ n2 - i) + zzn, 10) ^ dhts_2 + i * 1866395499));
        }
        return new String(cArray);
    }

    private static fy shr(khd khd2) {
        block0: {
            int n = -2003918217;
            n = Integer.rotateLeft(n * -32749675, 4) ^ 0xDA7CACD2;
            khd khd3 = khd2;
            n = Integer.rotateLeft((khd3 != null ? System.identityHashCode(khd3) : 0) ^ n, 27);
            int n2 = n ^ 0x484B8B9E;
            if ((n2 ^ n) == 1212910494) break block0;
            int cfr_ignored_0 = (0xC0C529E9 ^ n) + 1124880509;
        }
        return khd2.sdh_2();
    }

    private static String sdf_3(fy fy2) {
        block0: {
            int n = bghf.bdl_2(2107088882);
            fy fy3 = fy2;
            n = (fy3 != null ? System.identityHashCode(fy3) : 0) ^ n;
            int n2 = n ^ 0xF11F7693;
            if ((n2 ^ n) == -249596269) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x8C88E961 ^ n, 4) + 150069754;
            int cfr_ignored_1 = (int)(0x4E3A475C27D4EB4FL ^ (long)n ^ 0x73C8831A2DB931A5L);
        }
        return fy2.getName();
    }

    private static boolean thshr(String string, Object object) {
        block0: {
            int n = bghf.bdl_2(-1589741869);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 24);
            int n2 = n ^ 0x418DF065;
            if ((n2 ^ n) == 1099821157) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xE0B386B6 ^ n, 15) - 974843717) * -525105481;
        }
        return string.equals(object);
    }

    private static String hdhs_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1725039829;
            n4 = Integer.rotateLeft(n4 * 2065048487, 6) ^ 0x82149D11;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0xA15A7517;
            if ((n5 ^ n4) == -1587907305) break block0;
            int cfr_ignored_0 = (0xC78871C2 ^ n4) + -150247474;
        }
        return brs_2.nr_2(string, n, n2, n3);
    }

    private static int shkh_7(int n, int n2) {
        block0: {
            int n3 = 1158529164;
            n3 = Integer.rotateLeft(n3 * -1337383683, 20) ^ 0x710C6E86;
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0xD4523730;
            if ((n4 ^ n3) == -732809424) break block0;
            int cfr_ignored_0 = (0x915FF7BC ^ n3) - -718444431;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String zdh_5(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bghf.bdl_2(327662080);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0x7AEC42AF;
            if ((n5 ^ n4) == 2062303919) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x696BF8AF ^ n4, 16) - -932135828;
        }
        return brs_2.nr_2(string, n, n2, n3);
    }

    private static boolean ghzq(String string, Object object) {
        block0: {
            int n = 1874470977;
            n = Integer.rotateLeft(n * 992878371, 24) ^ 0x5D682005;
            Object object2 = object;
            n = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 6);
            int n2 = n ^ 0x582BA810;
            if ((n2 ^ n) == 1479256080) break block0;
            int cfr_ignored_0 = (0x37918051 ^ n) + -833331647;
        }
        return string.equals(object);
    }

    private static String thar(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bghf.bdl_2(1431856908);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0xB6D9EFEB;
            if ((n5 ^ n4) == -1227231253) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xE38188E7 ^ n4, 15) - -1861405900;
        }
        return brs_2.nr_2(string, n, n2, n3);
    }

    private static int rbk(int n) {
        block0: {
            int n2 = -311744447;
            n2 = Integer.rotateLeft(n2 * -138563449, 17) ^ 0x1026A8DC;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 21)) ^ 0xE00F849;
            if ((n3 ^ n2) == 234944585) break block0;
            int cfr_ignored_0 = (0xE36BD008 ^ n2) + 350194565;
        }
        return Integer.reverse(n);
    }

    private static fy dkl(khd khd2) {
        block0: {
            int n = -48965297;
            n = Integer.rotateLeft(n * -2130343567, 21) ^ 0x7333AE51;
            khd khd3 = khd2;
            n = (khd3 != null ? System.identityHashCode(khd3) : 0) ^ n;
            int n2 = n ^ 0xF608577F;
            if ((n2 ^ n) == -167225473) break block0;
            int cfr_ignored_0 = (0xB1C8E30 ^ n) + 1459579646;
        }
        return khd2.sdh_2();
    }

    private static fy hjy(khd khd2) {
        block0: {
            int n = -1353204916;
            int n2 = (n = Integer.rotateLeft(n * -11573233, 20) ^ 0x8EF0AFC0) ^ 0x7DC2C0FB;
            if ((n2 ^ n) == 2109915387) break block0;
            int cfr_ignored_0 = (0xD2957BB7 ^ n) + 2040711250;
        }
        return khd2.sdh_2();
    }

    private static fy zkhdh_2(khd khd2) {
        block0: {
            int n = 329818932;
            n = Integer.rotateLeft(n * -626657641, 9) ^ 0xDD25447A;
            khd khd3 = khd2;
            n = (khd3 != null ? System.identityHashCode(khd3) : 0) ^ n;
            int n2 = n ^ 0xF4AAFAEA;
            if ((n2 ^ n) == -190121238) break block0;
            int cfr_ignored_0 = (0xE70259DE ^ n) + 1548407919;
        }
        return khd2.sdh_2();
    }

    private static fy szth_3(khd khd2) {
        block0: {
            int n = 1559775425;
            int n2 = (n = Integer.rotateLeft(n * 432970985, 16) ^ 0xF9BD26E9) ^ 0xBAD41222;
            if ((n2 ^ n) == -1160506846) break block0;
            int cfr_ignored_0 = (0xE62C5AE3 ^ n) + 48001090;
        }
        return khd2.sdh_2();
    }

    private static class_284 sjsh_2(class_5944 class_59442, String string) {
        block0: {
            int n = -938695716;
            n = Integer.rotateLeft(n * 2132178851, 18) ^ 0xD6442144;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 18);
            int n2 = n ^ 0xE2806675;
            if ((n2 ^ n) == -494901643) break block0;
            int cfr_ignored_0 = (0x2A8CC5A9 ^ n) - 457186556;
        }
        return class_59442.method_34582(string);
    }

    private static String[] zwh(String string) {
        int n = -298868999;
        int n2 = (n = Integer.rotateLeft(n * -397929897, 20) ^ 0xF003F28C) ^ 0xEABF01CE;
        if ((n2 ^ n) != -356580914) {
            int cfr_ignored_0 = (0x4909F37 ^ n) + 1743565513;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite tbw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1516510068;
            n3 = Integer.rotateLeft(n3 * 2001713677, 4) ^ 0xE4E5C061;
            int n4 = n3 ^ 0x7BAFA01A;
            if ((n4 ^ n3) != 2075107354) {
                int cfr_ignored_0 = (0x21CBBB6E ^ n3) - 1389023960;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ bhm_2 ^ string.hashCode() ^ n2 + dhdh + i * -2065909525) + bhm_2) ^ dhdh));
            }
            String[] stringArray = brs_2.zwh(new String(cArray));
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

    private static String[] g7ackolgy(String string) {
        return string.split("\u0006\u001b", -1);
    }

    private static CallSite ouc7f58fg8nun(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ l0gtl3h ^ string.hashCode() ^ n2 + ynwskf8bs4 + i * 183602575) + l0gtl3h) ^ ynwskf8bs4));
            }
            String[] stringArray = brs_2.g7ackolgy(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

