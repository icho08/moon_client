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
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
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
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.Generated;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
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
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bthy;
import us.m0vy.moondlc.m0vyguard.bjd;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bghq;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.blh;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.taz;
import us.m0vy.moondlc.m0vyguard.tdhgh;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.sy_2;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="FragEffects", category=bzw.OTHER, desc="Vega frag strike effect")
public class sht_6
extends bnq {
    private static sht_6 rthf;
    private static final class_2960 zfa_2;
    private static final long thzth = 1000L;
    private static final long thn_3 = 300L;
    private static final long hht_4 = 260L;
    private static final long khbl = 620L;
    private static final float rsm = 0.5f;
    private final badh_2 jshh = new badh_2(this, "NoMobsDetect").bts(true);
    private final List tks_2 = new ArrayList();
    private final List dd_3 = new ArrayList();
    private class_1309 jthr;
    private long shmkh;
    private boolean zhd_2;
    private boolean thkhh;
    private final bql<bthy> zdgh_2 = this::hzdh;
    private final bql<bghq> khdf = this::sak_3;
    private final bql<btt> ddhq = this::hsb;
    private final bql<bbgh> dhtha = this::khrw;
    private final bql<shw_3> hkl = this::zzr_4;
    private static final int khst_2 = -705986888;
    private static final int rdf_2 = -1043774718;
    private static final int rkd_2 = 354051403;
    private static final int dhgh = -454563632;
    private static final int b8tg80cqmo0 = 362236525;
    private static final int frftzs0j = 561263800;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int tuy2iz3asn;

    public sht_6() {
        rthf = this;
    }

    @Override
    public void nc() {
        try {
            int n = -468510025;
            n = Integer.rotateLeft(n * 1103118033, 12) ^ 0x839993ED;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x63BDC4FF;
            if ((n2 ^ n) != 1673381119) {
                int cfr_ignored_0 = (0x87AEDE48 ^ n) + 252871331;
            }
            if ((0x340 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            sht_6.dsj_2();
        }
        this.tks_2.clear();
        this.dd_3.clear();
        this.jthr = null;
        this.shmkh = 0L;
        this.zhd_2 = false;
        this.thkhh = false;
    }

    private void dhn_5() {
        taz taz2;
        Object object;
        class_239 class_2392;
        if (sht_6.mc.field_1724 == null || sht_6.mc.field_1687 == null) {
            this.tks_2.clear();
            return;
        }
        class_1309 class_13092 = bjd.shfn();
        if (class_13092 != null) {
            this.khsr_2(class_13092);
        }
        if ((class_2392 = sht_6.mc.field_1765) instanceof class_3966 && (class_2392 = (object = (class_3966)class_2392).method_17782()) instanceof class_1309) {
            taz2 = (class_1309)class_2392;
            this.khsr_2((class_1309)taz2);
        }
        object = this.tks_2.iterator();
        while (object.hasNext()) {
            taz2 = (taz)object.next();
            taz2.zna();
            if (!taz2.dhma()) continue;
            object.remove();
        }
    }

    private void khsr_2(class_1309 class_13092) {
        int n = 2140650330;
        n = Integer.rotateLeft(n * 532300243, 11) ^ 0xA33E4A52;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 12);
        class_1309 class_13093 = class_13092;
        n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
        int n2 = n ^ 0xDFADA63C;
        if ((n2 ^ n) != -542267844) {
            int cfr_ignored_0 = (0xA03A1D66 ^ n) - 130689221;
        }
        if (!this.dhdgh(class_13092) || class_13092.field_6012 < 2 || class_13092.method_6032() <= 0.0f) {
            return;
        }
        for (taz taz2 : this.tks_2) {
            if (!sht_6.dhkht(taz2) || !sht_6.daz_8(taz2, class_13092)) continue;
            taz2.hjsh(class_13092, 0x1C6972C969DC00B3L ^ 0x1C6972C969DC035BL);
            return;
        }
        if (this.tks_2.isEmpty()) {
            this.tks_2.add(new taz(this, class_13092, 0x722ACF379767B51L ^ 0x722ACF3797678B9L, () -> this.dsq_4(class_13092)));
        }
    }

    private boolean dhdgh(class_1309 class_13092) {
        int n = 1178005132;
        n = Integer.rotateLeft(n * -762686793, 28) ^ 0xE58C6BC5;
        n = System.identityHashCode(this) ^ n;
        class_1309 class_13093 = class_13092;
        n = Integer.rotateLeft((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 6);
        int n2 = n ^ 0xCDF44817;
        if ((n2 ^ n) != -839628777) {
            int cfr_ignored_0 = (0x8BC2A69B ^ n) + 1938093843;
        }
        if (class_13092 == null || class_13092 == sht_6.mc.field_1724) {
            return false;
        }
        return !this.jshh.shzl() || class_13092 instanceof class_1657;
    }

    private boolean ddl_3(class_1309 class_13092) {
        int n = -1461041224;
        n = Integer.rotateLeft(n * 2101227029, 4) ^ 0x9FEC0FE;
        n = System.identityHashCode(this) ^ n;
        class_1309 class_13093 = class_13092;
        n = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 11);
        int n2 = n ^ 0x763F8466;
        if ((n2 ^ n) != 1983874150) {
            int cfr_ignored_0 = (0xDED5C3DE ^ n) - -679711996;
        }
        if (!sht_6.dth_9()) {
            yf.athz_2();
            throw null;
        }
        for (taz taz2 : this.tks_2) {
            if (!sht_6.zdt_7(taz2) || !taz2.zdth_2(class_13092)) continue;
            return true;
        }
        return false;
    }

    private void lsh(class_1309 class_13092) {
        int n = -1732544614;
        n = Integer.rotateLeft(n * -774505803, 12) ^ 0x6E9D635B;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x10B6EDFD;
        if ((n2 ^ n) != 280423933) {
            int cfr_ignored_0 = (0x880D9A67 ^ n) + -1626765460;
        }
        this.tks_2.removeIf(arg_0 -> sht_6.shgha(class_13092, arg_0));
    }

    private void qq(class_1309 class_13092) {
        try {
            int n = -1221732619;
            n = Integer.rotateLeft(n * 1753151031, 20) ^ 0xA6E13B8C;
            int n2 = n ^ 0x54CE03F9;
            if ((n2 ^ n) != 1422787577) {
                int cfr_ignored_0 = (0xE3E3D50C ^ n) + -1458283387;
            }
            if ((0x205 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (class_13092 == null) {
            return;
        }
        this.has_2();
        this.zwr();
        this.dza_2((class_1297)class_13092);
        sht_6.zd_4(this, class_13092, Integer.rotateLeft(0xB30D75FB ^ 0xBA6D75FB, 16), sht_6.tna_4(0xEBFBC1BF ^ 0xA8EDC1BF));
        this.jkhl(class_13092, 1193603884 + -1193600284, Float.intBitsToFloat(-1989956649 + -1166191575));
        this.jthr = class_13092;
    }

    private void has_2() {
        try {
            int n = 482383028;
            n = Integer.rotateLeft(n * -114654337, 27) ^ 0xD79ECDA1;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0x240A543A;
            if ((n2 ^ n) != 604656698) {
                int cfr_ignored_0 = (0x38CAC08E ^ n) - 1597807898;
            }
            if ((0x111 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        this.shmkh = System.currentTimeMillis();
        this.zhd_2 = true;
        this.thkhh = false;
    }

    private void zwr() {
        int n = -734108001;
        n = Integer.rotateLeft(n * -312887883, 18) ^ 0xC3903989;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xC5A0460B;
        if ((n2 ^ n) != -979352053) {
            int cfr_ignored_0 = (0x119E2094 ^ n) - -1464341601;
        }
        sy_2.tzr_2("strike".concat("sf-2.wav"), -2045606281 - -2045606311);
    }

    private void dza_2(class_1297 class_12972) {
        int n = -122185443;
        n = Integer.rotateLeft(n * 915057171, 14) ^ 0x159996A7;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xF32AEB17;
        if ((n2 ^ n) != -215291113) {
            int cfr_ignored_0 = (0xB9D720A ^ n) - -1014740178;
        }
        if (sht_6.mc.field_1724 == null || class_12972 == null) {
            return;
        }
        class_243 class_2432 = sht_6.mc.field_1724.method_33571();
        class_243 class_2433 = class_12972.method_19538().method_1031(0.0, (double)sht_6.hdd_3(class_12972) * Double.longBitsToDouble(0xE89B4D66348ED42DL ^ 0xD77B4D66348ED42DL), 0.0);
        class_243 class_2434 = sht_6.khla(class_2433, class_2432);
        double d = Math.sqrt(class_2434.field_1352 * class_2434.field_1352 + class_2434.field_1350 * class_2434.field_1350);
        float f = (float)class_3532.method_15338((double)(Math.toDegrees(Math.atan2(class_2434.field_1350, class_2434.field_1352)) - Double.longBitsToDouble(0x3B7A14E82B585E8BL ^ 0x7B2C94E82B585E8BL)));
        float f2 = (float)(-Math.toDegrees(Math.atan2(class_2434.field_1351, d)));
        if (Math.abs(class_3532.method_15393((float)(sht_6.zlz_3(sht_6.mc.field_1724) - f))) > Float.intBitsToFloat(sht_6.zjy_2(0x387BE34 ^ 0x4B87BE24, 26)) || Math.abs(class_3532.method_15393((float)(sht_6.mc.field_1724.method_36455() - f2))) > Float.intBitsToFloat(20983874 - -1063243710)) {
            sht_6.mc.field_1724.method_36456(f);
            sht_6.mc.field_1724.method_36457(f2);
        }
    }

    private float dhk_4() {
        long l;
        if (!this.zhd_2) {
            return 0.0f;
        }
        long l2 = System.currentTimeMillis() - this.shmkh;
        if (l2 < 260L) {
            return 0.5f + 0.5f * this.tsb_3((float)l2 / 260.0f);
        }
        if (!this.thkhh) {
            this.thkhh = true;
            if (this.jthr != null) {
                this.jkhl(this.jthr, 360, 2400.0f);
                this.jkhl(this.jthr, 1200, 300.0f);
            }
        }
        if ((l = l2 - 260L) >= 620L) {
            this.zhd_2 = false;
            return 0.0f;
        }
        return 1.0f - this.tsb_3((float)l / 620.0f);
    }

    private float skhj_2(boolean bl) {
        float f;
        int n = 218787473;
        n = Integer.rotateLeft(n * -1245800711, 5) ^ 0x6011A495;
        int n2 = (n = Integer.rotateLeft(bl ^ n, 10)) ^ 0x6AA9903D;
        if ((n2 ^ n) != 1789497405) {
            int cfr_ignored_0 = (0x67A3FEAC ^ n) - -1530639130;
        }
        float f2 = f = bl ? sht_6.dkq_2(this) : this.sthd_4();
        if (f < Float.intBitsToFloat(0xEF7B0FA5 ^ 0xD4D8D8AF)) {
            return 0.0f;
        }
        return f > Float.intBitsToFloat(0x4BF1AA04 ^ 0x748F1256) ? 1.0f : f;
    }

    /*
     * Unable to fully structure code
     */
    private float sthd_4() {
        var1_1 = 0L;
        var3_2 = 0L;
        var5_3 = 0.0f;
        var8_4 = 0;
        var6_5 = -1102799007;
        var6_5 = Integer.rotateLeft(var6_5 * 1349597097, 11) ^ 928583224;
        var6_5 = System.identityHashCode(this) ^ var6_5;
        var7_6 = Integer.rotateLeft(var6_5 ^ -1955666845, 15) + 682176532 - 682176532;
        while (true) {
            block61: {
                block64: {
                    block63: {
                        block71: {
                            block75: {
                                block57: {
                                    block66: {
                                        block65: {
                                            block60: {
                                                block62: {
                                                    block74: {
                                                        block69: {
                                                            block56: {
                                                                block72: {
                                                                    block70: {
                                                                        block79: {
                                                                            block67: {
                                                                                block59: {
                                                                                    block68: {
                                                                                        block77: {
                                                                                            block78: {
                                                                                                block58: {
                                                                                                    block73: {
                                                                                                        block76: {
                                                                                                            var8_4 = Integer.rotateRight(var7_6, 15) ^ var6_5;
                                                                                                            switch (var8_4 & 15) {
                                                                                                                case 0: {
                                                                                                                    if (var8_4 == 1137698864) break block56;
                                                                                                                    if (var8_4 != -1715429200) {
                                                                                                                        (Integer.rotateRight(-162918626 ^ var6_5, 17) - -682265635) * -162918625;
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block57;
                                                                                                                }
                                                                                                                case 5: {
                                                                                                                    if (var8_4 != -697773851) {
                                                                                                                        if (var8_4 == 742608677) break;
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block58;
                                                                                                                }
                                                                                                                case 14: {
                                                                                                                    if (var8_4 != 543375182) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block59;
                                                                                                                }
                                                                                                                case 15: {
                                                                                                                    if (var8_4 != 721754415) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block60;
                                                                                                                }
                                                                                                                case 7: {
                                                                                                                    if (var8_4 == -1817422041) break block61;
                                                                                                                    if (var8_4 == 203877143) break block62;
                                                                                                                    if (var8_4 != 1961573175) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block63;
                                                                                                                }
                                                                                                                case 10: {
                                                                                                                    if (var8_4 != 294348554) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block64;
                                                                                                                }
                                                                                                                case 3: {
                                                                                                                    if (var8_4 == -1918775885) break block65;
                                                                                                                    if (var8_4 == 1349962787) break block66;
                                                                                                                    Integer.rotateRight(1377059907 ^ var6_5, 13) + -187571368;
                                                                                                                    if (var8_4 == -1955666845) break block67;
                                                                                                                    if (var8_4 != -105909709) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block68;
                                                                                                                }
                                                                                                                case 2: {
                                                                                                                    if (var8_4 > -1443370190) ** GOTO lbl57
                                                                                                                    if (var8_4 == -1643246078) break block69;
                                                                                                                    if (var8_4 != -1443370190) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block70;
lbl57:
                                                                                                                    // 1 sources

                                                                                                                    if (var8_4 == -522398382) break block71;
                                                                                                                    if (var8_4 == -125439774) break block72;
                                                                                                                    if (var8_4 != 1677930962) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block73;
                                                                                                                }
                                                                                                                case 6: {
                                                                                                                    if (var8_4 == 351500070) break block74;
                                                                                                                    if (var8_4 == 201201206) break block75;
                                                                                                                    if (var8_4 != 61158118) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block76;
                                                                                                                }
                                                                                                                case 4: {
                                                                                                                    if (var8_4 != 808554708) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block77;
                                                                                                                }
                                                                                                                case 11: {
                                                                                                                    if (var8_4 != -1374996677) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block78;
                                                                                                                }
                                                                                                                case 8: {
                                                                                                                    if (var8_4 != -1886776056) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block79;
                                                                                                                }
                                                                                                            }
                                                                                                            Integer.rotateRight(1496694147 ^ var6_5, 14) + -773877224;
                                                                                                            var3_2 = var1_1 - (2775125458597213731L ^ 2775125458597213991L);
                                                                                                            if (var3_2 < (-8473510404864610318L ^ -8473510404864610914L)) {
                                                                                                                var7_6 = Integer.rotateLeft(var6_5 ^ 2079438510, 15) ^ -548596615 ^ -548596615;
                                                                                                                (Integer.rotateLeft(-2074201891 ^ var6_5, 3) - 197495294) * -2074201891;
                                                                                                                (int)(5110634362736798543L ^ (long)var6_5 ^ -4562002274066817016L);
                                                                                                                var7_6 = Integer.rotateLeft(var6_5 ^ 1677930962, 15) ^ -809325710 ^ -809325710;
                                                                                                                var8_4 -= 5;
                                                                                                                continue;
                                                                                                            }
                                                                                                            try {
                                                                                                                var8_4 -= 4;
                                                                                                                if ((877051152226874595L ^ (long)var6_5 | 1L) == 0L) {
                                                                                                                    throw new NoSuchElementException();
                                                                                                                }
                                                                                                                var7_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_5 ^ -1374996677, 15)));
                                                                                                            }
                                                                                                            catch (NoSuchElementException v0) {
                                                                                                                var7_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_5 ^ -1374996677, 15)));
                                                                                                            }
                                                                                                            ++var8_4;
                                                                                                            continue;
                                                                                                        }
                                                                                                        Integer.rotateRight(421313443 ^ var6_5, 6) + 249059320;
                                                                                                        var5_3 = 0.0f;
                                                                                                        var7_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_5 ^ 643548637, 15)));
                                                                                                        (Integer.rotateLeft(1164463920 ^ var6_5, 11) + 1811887627) * 1164463921;
                                                                                                        var7_6 = Integer.rotateLeft(var6_5 ^ -1817422041, 15) ^ -135998844 ^ -135998844;
                                                                                                        var8_4 += 4;
                                                                                                        continue;
                                                                                                    }
                                                                                                    Integer.rotateLeft(-1309297088 ^ var6_5, 9) + -1860259589;
                                                                                                    var5_3 = 1.0f - this.tsb_3((float)var3_2 / Float.intBitsToFloat(-1307735972 + -1844611164));
                                                                                                    (int)(711229914177781253L ^ (long)var6_5 ^ 7700492179171294828L);
                                                                                                    var7_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_5 ^ -1817422041, 15)));
                                                                                                    continue;
                                                                                                }
                                                                                                Integer.rotateLeft(2025973864 ^ var6_5, 18) + -1546075181;
                                                                                                var1_1 = System.currentTimeMillis() - this.shmkh;
                                                                                                if (var1_1 >= (8223131882788258686L ^ 8223131882788258426L)) {
                                                                                                    (int)(-5677178238200493667L ^ (long)var6_5 ^ -4214913755305422916L);
                                                                                                    var7_6 = Integer.rotateLeft(var6_5 ^ 742608677, 15);
                                                                                                    var8_4 += 2;
                                                                                                    continue;
                                                                                                }
                                                                                                var7_6 = Integer.rotateLeft(var6_5 ^ 543375182, 15);
                                                                                                Integer.rotateLeft(553903301 ^ var6_5, 7) - 64377622;
                                                                                                (int)(-2039766726541513905L ^ (long)var6_5 ^ 7530162725422918323L);
                                                                                                var8_4 += 3;
                                                                                                continue;
                                                                                            }
                                                                                            (Integer.rotateRight(-1692414338 ^ var6_5, 6) - -851992451) * -1692414337;
                                                                                            var5_3 = 0.0f;
                                                                                            var7_6 = Integer.rotateLeft(var6_5 ^ -1817422041, 15);
                                                                                            continue;
                                                                                        }
                                                                                        Integer.rotateLeft(-1948277244 ^ var6_5, 4) - -193807945;
                                                                                        var5_3 = 0.0f;
                                                                                        var7_6 = (int)((long)Integer.rotateLeft(var6_5 ^ -1112108783, 15) ^ -4345548341821614258L ^ -4345548341821614258L);
                                                                                        Integer.rotateLeft(-1142105695 ^ var6_5, 10) + -972293702;
                                                                                        (int)(8745559038966950735L ^ (long)var6_5 ^ 1317447039465381741L);
                                                                                        var7_6 = Integer.rotateLeft(var6_5 ^ -1817422041, 15) ^ -2128234579 ^ -2128234579;
                                                                                        continue;
                                                                                    }
                                                                                    Integer.rotateLeft(-2065219616 ^ var6_5, 3) + 475945819;
                                                                                    throw null;
                                                                                }
                                                                                Integer.rotateLeft(1902622413 ^ var6_5, 17) - -1075002866;
                                                                                (int)(-5488453151141598385L ^ (long)var6_5 ^ -3706318344866444677L);
                                                                                var5_3 = Float.intBitsToFloat(1490424893 + -433460285) + Float.intBitsToFloat(1429833044 + -372868436) * sht_6.jshs_2(this, (float)var1_1 / Float.intBitsToFloat(409882347 - -722710805));
                                                                                var7_6 = Integer.rotateLeft(var6_5 ^ -1817422041, 15) ^ -1314361386 ^ -1314361386;
                                                                                (Integer.rotateLeft(-1515099724 ^ var6_5, 7) - 349793287) * -1515099723;
                                                                                var8_4 -= 3;
                                                                                continue;
                                                                            }
                                                                            Integer.rotateLeft(-1469495127 ^ var6_5, 8) + 1763535794;
                                                                            (int)(7700001511917808463L ^ (long)var6_5 ^ 3483678460230596710L);
                                                                            if (!sht_6.thz_2()) {
                                                                                (int)(-2107284831156231487L ^ (long)var6_5 ^ 3046685189769291859L);
                                                                                var7_6 = Integer.rotateLeft(var6_5 ^ -1886776056, 15) + -1456812571 - -1456812571;
                                                                                var8_4 -= 4;
                                                                                continue;
                                                                            }
                                                                            (int)(8666767866998703430L ^ (long)var6_5 ^ -1470017602428641956L);
                                                                            var7_6 = Integer.rotateLeft(var6_5 ^ -105909709, 15) + 1279218310 - 1279218310;
                                                                            var8_4 += 5;
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateLeft(911478972 ^ var6_5, 9) - -1735678465) * 911478973;
                                                                        if (!this.zhd_2) {
                                                                            var7_6 = Integer.rotateLeft(var6_5 ^ -1491098834, 15) ^ -1953202331 ^ -1953202331;
                                                                            Integer.rotateLeft(-1801488031 ^ var6_5, 5) + 61690362;
                                                                            (int)(6209856252019010383L ^ (long)var6_5 ^ 6037219448949637514L);
                                                                            var7_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_5 ^ 61158118, 15)));
                                                                            var8_4 += 4;
                                                                            continue;
                                                                        }
                                                                        (int)(-5848577237122240788L ^ (long)var6_5 ^ -6446309703025758086L);
                                                                        var7_6 = Integer.rotateLeft(var6_5 ^ 545700940, 15) ^ -1884395897 ^ -1884395897;
                                                                        (int)(4267527665632726217L ^ (long)var6_5 ^ 7415927556994882467L);
                                                                        var7_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_5 ^ -697773851, 15)));
                                                                        var8_4 -= 5;
                                                                        continue;
                                                                    }
                                                                    Integer.rotateRight(-926165726 ^ var6_5, 12) + 1426878041;
                                                                    (int)(5876715979442273777L ^ (long)var6_5 ^ 7595582156840439501L);
                                                                    var7_6 = (int)((long)Integer.rotateLeft(var6_5 ^ -1955666845, 15) ^ -3565933188373542285L ^ -3565933188373542285L);
                                                                    var8_4 += 5;
                                                                    continue;
                                                                }
                                                                Integer.rotateRight(-1920415673 ^ var6_5, 4) - 669900756;
                                                                var7_6 = Integer.rotateLeft(var6_5 ^ -1031923195, 15) + 1089268596 - 1089268596;
                                                                (Integer.rotateLeft(249014032 ^ var6_5, 4) + -797255125) * 249014033;
                                                                try {
                                                                    var8_4 += 4;
                                                                    if ((7672265990716214185L ^ (long)var6_5 | 1L) == 0L) {
                                                                        throw new UnsupportedOperationException();
                                                                    }
                                                                    var7_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_5 ^ -1955666845, 15)));
                                                                }
                                                                catch (UnsupportedOperationException v1) {
                                                                    var7_6 = (int)((long)Integer.rotateLeft(var6_5 ^ -1955666845, 15) ^ 218476056184486731L ^ 218476056184486731L);
                                                                }
                                                                ++var8_4;
                                                                continue;
                                                            }
                                                            (Integer.rotateLeft(1489913529 ^ var6_5, 14) + -984076382) * 1489913529;
                                                            (int)(-7314716040454935729L ^ (long)var6_5 ^ 3204455283333568808L);
                                                            try {
                                                                var8_4 -= 2;
                                                                if ((8808004237379091999L ^ (long)var6_5 | 1L) == 0L) {
                                                                    throw new NoSuchElementException();
                                                                }
                                                                var7_6 = Integer.rotateLeft(var6_5 ^ -1955666845, 15) ^ 956642687 ^ 956642687;
                                                            }
                                                            catch (NoSuchElementException v2) {
                                                                var7_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_5 ^ -1955666845, 15)));
                                                            }
                                                            var8_4 += 2;
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(2057375928 ^ var6_5, 18) + -572611197) * 2057375929;
                                                        var7_6 = Integer.rotateLeft(var6_5 ^ 805138224, 15) ^ 865054395 ^ 865054395;
                                                        Integer.rotateLeft(1090384292 ^ var6_5, 11) - -484580841;
                                                        var7_6 = Integer.rotateLeft(var6_5 ^ -1955666845, 15);
                                                        var8_4 -= 5;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(-1919514071 ^ var6_5, 4) + 697850418;
                                                    (int)(5702722697144101711L ^ (long)var6_5 ^ -5379405606434557031L);
                                                    try {
                                                        var8_4 += 3;
                                                        var7_6 = (int)((long)Integer.rotateLeft(var6_5 ^ -1955666845, 15) ^ -813280472034912301L ^ -813280472034912301L);
                                                    }
                                                    catch (IllegalStateException v3) {
                                                        var7_6 = Integer.rotateLeft(var6_5 ^ -1955666845, 15) + -84875240 - -84875240;
                                                    }
                                                    var8_4 -= 4;
                                                    continue;
                                                }
                                                Integer.rotateRight(-689760062 ^ var6_5, 13) + 165519033;
                                                try {
                                                    var8_4 -= 5;
                                                    var7_6 = (int)((long)Integer.rotateLeft(var6_5 ^ -1955666845, 15) ^ 1533766660036492722L ^ 1533766660036492722L);
                                                }
                                                catch (IllegalArgumentException v4) {
                                                    var7_6 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_5 ^ -1955666845, 15)));
                                                }
                                                var8_4 += 5;
                                                continue;
                                            }
                                            Integer.rotateRight(-1454129233 ^ var6_5, 8) - -2055088788;
                                            var7_6 = (int)((long)Integer.rotateLeft(var6_5 ^ -297432662, 15) ^ 8959540403355498821L ^ 8959540403355498821L);
                                            (Integer.rotateLeft(-1703486340 ^ var6_5, 6) - -1195224513) * -1703486339;
                                            var7_6 = Integer.rotateLeft(var6_5 ^ -1955666845, 15) + -1868718836 - -1868718836;
                                            ++var8_4;
                                            continue;
                                        }
                                        (Integer.rotateLeft(1427724888 ^ var6_5, 13) + 1383043043) * 1427724889;
                                        var7_6 = Integer.rotateLeft(var6_5 ^ -1634245145, 15) ^ 678720689 ^ 678720689;
                                        Integer.rotateLeft(488445161 ^ var6_5, 6) + -1964824718;
                                        (int)(-2328437061963158705L ^ (long)var6_5 ^ -8585968541122424178L);
                                        var7_6 = (int)((long)Integer.rotateLeft(var6_5 ^ -1955666845, 15) ^ 8780616972738900729L ^ 8780616972738900729L);
                                        var8_4 -= 2;
                                        continue;
                                    }
                                    Integer.rotateLeft(1962774765 ^ var6_5, 17) - 789720046;
                                    (int)(-5309956371904140465L ^ (long)var6_5 ^ -9164681093239488177L);
                                    var7_6 = Integer.rotateLeft(var6_5 ^ 544295603, 15) + -570638807 - -570638807;
                                    Integer.rotateRight(1209253863 ^ var6_5, 12) - -1094591436;
                                    try {
                                        var8_4 += 4;
                                        if ((5393533800261615949L ^ (long)var6_5 | 1L) == 0L) {
                                            throw new IllegalStateException();
                                        }
                                        var7_6 = Integer.rotateLeft(var6_5 ^ -1955666845, 15) + -1844328911 - -1844328911;
                                    }
                                    catch (IllegalStateException v5) {
                                        var7_6 = Integer.rotateLeft(var6_5 ^ -1955666845, 15);
                                    }
                                    var8_4 += 2;
                                    continue;
                                }
                                Integer.rotateRight(911802027 ^ var6_5, 9) + -1725663760;
                                var7_6 = Integer.rotateLeft(var6_5 ^ -877098542, 15);
                                (Integer.rotateRight(714542355 ^ var6_5, 8) + 749221000) * 714542355;
                                var7_6 = Integer.rotateLeft(var6_5 ^ -1955666845, 15) + 1361542313 - 1361542313;
                                var8_4 += 4;
                                continue;
                            }
                            Integer.rotateLeft(-1561490871 ^ var6_5, 7) + -1088332270;
                            (int)(6944309231731665743L ^ (long)var6_5 ^ -5361391207925060241L);
                            try {
                                var8_4 += 5;
                                if ((-4028464021465613011L ^ (long)var6_5 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                var7_6 = Integer.rotateLeft(var6_5 ^ -1955666845, 15);
                            }
                            catch (IllegalStateException v6) {
                                var7_6 = (int)((long)Integer.rotateLeft(var6_5 ^ -1955666845, 15) ^ -6512005614329553530L ^ -6512005614329553530L);
                            }
                            var8_4 += 2;
                            continue;
                        }
                        (Integer.rotateRight(-874761473 ^ var6_5, 12) - -1274557412) * -874761473;
                        (int)(8600476547550426802L ^ (long)var6_5 ^ -953537064232336537L);
                        var7_6 = Integer.rotateLeft(var6_5 ^ -1955666845, 15) ^ 589745344 ^ 589745344;
                        var8_4 += 2;
                        continue;
                    }
                    Integer.rotateRight(-640378738 ^ var6_5, 14) - 1696340077;
                    var7_6 = Integer.rotateLeft(var6_5 ^ 1683612633, 15) + -1697957923 - -1697957923;
                    Integer.rotateLeft(-424450104 ^ var6_5, 15) + -199806861;
                    try {
                        var8_4 += 2;
                        var7_6 = Integer.rotateLeft(var6_5 ^ -1955666845, 15) + 383395454 - 383395454;
                    }
                    catch (IllegalStateException v7) {
                        var7_6 = Integer.rotateLeft(var6_5 ^ -1955666845, 15);
                    }
                    continue;
                }
                Integer.rotateLeft(-1715789919 ^ var6_5, 6) + -1576635462;
                (int)(6559969616483117903L ^ (long)var6_5 ^ -7041233868934276158L);
                var7_6 = Integer.rotateLeft(var6_5 ^ 978939376, 15);
                Integer.rotateRight(1821617219 ^ var6_5, 16) + 708803416;
                try {
                    var8_4 -= 4;
                    if ((-7740401973199095655L ^ (long)var6_5 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    var7_6 = Integer.rotateLeft(var6_5 ^ -1955666845, 15) ^ -2057389237 ^ -2057389237;
                }
                catch (NoSuchElementException v8) {
                    var7_6 = (int)((long)Integer.rotateLeft(var6_5 ^ -1955666845, 15) ^ -1849058259069472245L ^ -1849058259069472245L);
                }
                var8_4 += 2;
                continue;
            }
            return var5_3;
lbl380:
            // 14 sources

            (Integer.rotateLeft(-1841758916 ^ var6_5, 5) - -1186707073) * -1841758915;
            var7_6 = Integer.rotateLeft(var6_5 ^ -1955666845, 15) ^ 1176381206 ^ 1176381206;
        }
    }

    private void smz(bbgh bbgh2) {
        float f = this.skhj_2(true);
        if (f == 0.0f) {
            return;
        }
        int n = mc.method_22683().method_4486();
        int n2 = mc.method_22683().method_4502();
        float f2 = (float)n / 2.0f * (1.0f - f) * (1.0f - f);
        float f3 = (float)n2 / 2.0f * (1.0f - f) * (1.0f - f);
        int n3 = class_3532.method_15340((int)((int)(255.0f * (1.0f - f / 1.25f))), (int)0, (int)255);
        int n4 = class_3532.method_15340((int)((int)(190.0f * f)), (int)0, (int)255);
        int n5 = n4 << 24 | 0xFF0000 | n3 << 8 | n3;
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ZERO);
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (class_2960)zfa_2);
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        class_4587 class_45872 = bbgh2.dtn().method_51448();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        float f4 = -f2;
        float f5 = -f3;
        float f6 = (float)n + f2;
        float f7 = (float)n2 + f3;
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f4, f5, 0.0f).method_22913(0.0f, 0.0f).method_39415(n5);
        class_2872.method_22918(matrix4f, f4, f7, 0.0f).method_22913(0.0f, 1.0f).method_39415(n5);
        class_2872.method_22918(matrix4f, f6, f7, 0.0f).method_22913(1.0f, 1.0f).method_39415(n5);
        class_2872.method_22918(matrix4f, f6, f5, 0.0f).method_22913(1.0f, 0.0f).method_39415(n5);
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
    }

    private void jkhl(class_1309 class_13092, int n, float f) {
        int n2 = 622738467;
        n2 = Integer.rotateLeft(n2 * 1111621967, 7) ^ 0x5B32A08B;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (n2 = n ^ n2) ^ 0x5C3DFABE;
        if ((n3 ^ n2) != 1547565758) {
            int cfr_ignored_0 = (0x7923C69D ^ n2) - -858883853;
        }
        if (class_13092 == null) {
            return;
        }
        float f2 = Float.intBitsToFloat(1325011880 - 288179931);
        float f3 = f2 / 2.0f;
        class_243 class_2432 = sht_6.zthl_2(class_13092.method_19538(), 0.0, class_13092.method_17682() * Float.intBitsToFloat(955732778 + 99554108), 0.0);
        for (int i = 0; i < n; ++i) {
            float f4 = (float)i / (float)n;
            float f5 = -f3 / 2.0f + (float)Math.random() * f3;
            float f6 = Float.intBitsToFloat(Integer.reverse(-132852029) ^ 0xFDEB281F) + (Float.intBitsToFloat(1833457875 - -1325691898) + (float)Math.random() * Float.intBitsToFloat(-1774113981 + -1463888707) / sht_6.dshd(Integer.reverse(-1294021958) ^ 0x1CF37B4D));
            float f7 = f2 * (float)Math.random();
            this.dd_3.add(new blh(class_2432.method_1031(0.0, (double)f5, 0.0), f4 * Float.intBitsToFloat(1185330382 + -49460430), Float.intBitsToFloat(sht_6.asq(0x7D1E9EB3 ^ 0x7D1E8133, 17)), Float.intBitsToFloat(-826168839 - -1883133447) + f6, sht_6.awa_2(0x9AA51B7C ^ 0xD8B51B7C) * (float)Math.random(), f7, f));
        }
    }

    private void tsl_2() {
        try {
            int n = -73387458;
            n = Integer.rotateLeft(n * -1646816867, 10) ^ 0x93E9B65;
            int n2 = n ^ 0xFD1C7B20;
            if ((n2 ^ n) != -48465120) {
                int cfr_ignored_0 = (0x6BC491E ^ n) + 1727912020;
            }
            if ((0x7A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!this.dd_3.isEmpty()) {
            this.dd_3.removeIf(blh::jat);
        }
    }

    private void sdz(shw_3 shw2) {
        float f;
        float f2 = f = this.rgha_2() ? 1.0f : 0.0f;
        if (f == 0.0f || this.dd_3.isEmpty() || sht_6.mc.field_1773 == null) {
            return;
        }
        class_4587 class_45872 = shw2.ssha_2();
        class_4184 class_41842 = sht_6.mc.field_1773.method_19418();
        class_243 class_2432 = class_41842.method_19326();
        boolean bl = this.zhd_2 && System.currentTimeMillis() - this.shmkh < 260L;
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableCull();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        boolean bl2 = false;
        for (blh blh2 : this.dd_3) {
            float f3 = class_3532.method_15363((float)(Math.min(blh2.thkhl() * 3.0f, 1.0f) * blh2.zghr()), (float)0.0f, (float)1.0f) * f;
            if (f3 <= 0.0f) continue;
            int n = this.dzn(f3, blh2.bss);
            class_243 class_2433 = blh2.znb_2().method_1020(class_2432);
            float f4 = bl ? 0.022f : 0.014f + 0.018f * blh2.zghr();
            this.sjb_2(class_2872, class_45872, class_41842, class_2433, f4, n);
            bl2 = true;
        }
        this.shsa_2(class_2872, bl2);
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableCull();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableBlend();
    }

    private int dzn(float f, float f2) {
        int n = 582820239;
        n = Integer.rotateLeft(n * -1330128599, 14) ^ 0xEE4BC617;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 28);
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 21);
        int n2 = n ^ 0xDDC90C8C;
        if ((n2 ^ n) != -574026612) {
            int cfr_ignored_0 = (0xFF742D03 ^ n) + -1326812683;
        }
        int n3 = class_3532.method_15340((int)((int)(Float.intBitsToFloat(Integer.rotateLeft(0xBCEB3A41 ^ 0xA7133A43, 29)) * f)), (int)0, (int)(Integer.reverse(-898997633) ^ 0xFE4656AC));
        int n4 = class_3532.method_15340((int)((int)(Float.intBitsToFloat(-1730167726 + -1432403026) * f2)), (int)0, (int)Integer.rotateLeft(0x1F50F5B6 ^ 0x1F4F15B6, 19));
        int n5 = class_3532.method_15340((int)((int)(Float.intBitsToFloat(1948689666 - 816293122) * f * f2)), (int)0, (int)sht_6.zrd_4(0xAA4A3C8E ^ 0xA9B63C8E, 14));
        return n3 << (Integer.reverse(894485370) ^ 0x5EC30AB4) | n4 << -1354345105 - -1354345121 | n5 << (0x6522AC94 ^ 0x6522AC9C) | n5;
    }

    private void sjb_2(class_287 class_2872, class_4587 class_45872, class_4184 class_41842, class_243 class_2432, float f, int n) {
        class_45872.method_22903();
        class_45872.method_22904(class_2432.field_1352, class_2432.field_1351, class_2432.field_1350);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(180.0f - class_41842.method_19330()));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(-class_41842.method_19329()));
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_22918(matrix4f, -f, -f, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, -f, f, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f, f, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f, -f, 0.0f).method_39415(n);
        class_45872.method_22909();
    }

    private void shsa_2(class_287 class_2872, boolean bl) {
        class_9801 class_98012 = class_2872.method_60794();
        if (bl && class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
    }

    private float tsb_3(float f) {
        int n = tdhgh.rty(-501520616);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 26);
        int n2 = n ^ 0x89168E69;
        if ((n2 ^ n) != -1995010455) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x6B0DE971 ^ n, 16) + -83041302) * 1796073841;
            int cfr_ignored_1 = (int)(0xA9BF474C27D4EB4FL ^ (long)n ^ 0x73E8831A2DB8FEAFL);
        }
        f = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        return 1.0f - (float)Math.pow(1.0f - f, Double.longBitsToDouble(0x6FC8256D47CE9511L ^ 0x2FC0256D47CE9511L));
    }

    @Generated
    public static sht_6 dhat_4() {
        block0: {
            int n = tdhgh.rty(-160723443);
            int n2 = n ^ 0xD777826D;
            if ((n2 ^ n) == -680033683) break block0;
            tdhgh.thah_4(555486304, n);
            int cfr_ignored_0 = (int)(0xBF2B75D97F4A7C15L ^ (long)n ^ 0x16C23227030CD387L);
        }
        return rthf;
    }

    private static boolean shgha(class_1309 class_13092, taz taz2) {
        block0: {
            int n = 997028493;
            n = Integer.rotateLeft(n * -698276119, 25) ^ 0xD0AA7BC3;
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0x33047199;
            if ((n2 ^ n) == 855929241) break block0;
            int cfr_ignored_0 = (0x8690314 ^ n) + -591036077;
        }
        return taz2.zdth_2(class_13092);
    }

    private void dsq_4(class_1309 class_13092) {
        int n = tdhgh.rty(-1888871597);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 27);
        class_1309 class_13093 = class_13092;
        n = Integer.rotateLeft((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 5);
        int n2 = n ^ 0xAEE9E50D;
        if ((n2 ^ n) != -1360403187) {
            int cfr_ignored_0 = (Integer.rotateRight(0x2183FE5E ^ n, 7) - 324627613) * 562298463;
        }
        this.qq(class_13092);
    }

    private void zzr_4(shw_3 shw2) {
        int n = -637868328;
        int n2 = (n = Integer.rotateLeft(n * -550766395, 15) ^ 0x9770DE11) ^ 0xF41BD527;
        if ((n2 ^ n) != -199502553) {
            int cfr_ignored_0 = (0x2DE133FF ^ n) - 1706150658;
        }
        this.sdz(shw2);
    }

    private void khrw(bbgh bbgh2) {
        int n = tdhgh.rty(-1015157112);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x32C33FA2;
        if ((n2 ^ n) != 851656610) {
            int cfr_ignored_0 = Integer.rotateRight(0xF1BED12A ^ n, 17) + 1249440593;
        }
        this.smz(bbgh2);
    }

    private void hsb(btt btt2) {
        int n = 1110620318;
        n = Integer.rotateLeft(n * 1847876279, 13) ^ 0x745C6695;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x390CBDF2;
        if ((n2 ^ n) != 957136370) {
            int cfr_ignored_0 = (0x7B3E056C ^ n) - -1728442038;
        }
        this.dhn_5();
        this.tsl_2();
    }

    private void sak_3(bghq bghq2) {
        boolean bl;
        class_1309 class_13092;
        int n = tdhgh.rty(-443626430);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 5);
        bghq bghq3 = bghq2;
        n = (bghq3 != null ? System.identityHashCode(bghq3) : 0) ^ n;
        int n2 = n ^ 0x353EEB87;
        if ((n2 ^ n) != 893315975) {
            int cfr_ignored_0 = Integer.rotateLeft(0xD0B027C5 ^ n, 13) - 1236430870;
            int cfr_ignored_1 = (int)(0x120289F827D4EB4FL ^ (long)n ^ 0xEE80831A2DB989D4L);
        }
        if (!this.dhdgh(class_13092 = bghq2.sll())) {
            return;
        }
        boolean bl2 = this.ddl_3(class_13092);
        class_1297 class_12972 = bghq2.rnk() != null ? bghq2.rnk().method_5529() : null;
        boolean bl3 = bl = class_12972 == sht_6.mc.field_1724;
        if (bl2 || bl) {
            this.qq(class_13092);
            this.lsh(class_13092);
        }
    }

    private void hzdh(bthy bthy2) {
        class_1297 class_12972;
        int n = 1521878608;
        n = Integer.rotateLeft(n * 689816761, 3) ^ 0x60A269C7;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 25);
        bthy bthy3 = bthy2;
        n = Integer.rotateRight((bthy3 != null ? System.identityHashCode(bthy3) : 0) ^ n, 15);
        int n2 = n ^ 0xC5C90290;
        if ((n2 ^ n) != -976682352) {
            int cfr_ignored_0 = (0x9F7F04C0 ^ n) - -7833682;
        }
        if ((class_12972 = bthy2.khtf()) instanceof class_1309) {
            class_1309 class_13092 = (class_1309)class_12972;
            this.khsr_2(class_13092);
        }
    }

    private static String dhf(String string, int n, int n2, int n3) {
        int n4 = -688272924;
        n4 = Integer.rotateLeft(n4 * -1815153481, 4) ^ 0x652D5D77;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateRight(n ^ n4, 2)) ^ 0xD66165BC;
        if ((n5 ^ n4) != -698260036) {
            int cfr_ignored_0 = (0x98AC58 ^ n4) - 453361061;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x3312D6D0) + n2 ^ i * -2042368929) ^ khst_2) + rdf_2);
        }
        return new String(cArray);
    }

    private static void dsj_2() {
        int n = -1788064072;
        int n2 = (n = Integer.rotateLeft(n * 1641008071, 26) ^ 0xCF0CF753) ^ 0xF3172688;
        if ((n2 ^ n) != -216586616) {
            int cfr_ignored_0 = (0x667B6830 ^ n) + -1847035067;
        }
        yf.athz_2();
    }

    private static boolean dhkht(taz taz2) {
        block0: {
            int n = -1374787340;
            n = Integer.rotateLeft(n * 1852282611, 26) ^ 0xD06E99E2;
            taz taz3 = taz2;
            n = (taz3 != null ? System.identityHashCode(taz3) : 0) ^ n;
            int n2 = n ^ 0x4333C49C;
            if ((n2 ^ n) == 1127466140) break block0;
            int cfr_ignored_0 = (0xED3DAC68 ^ n) - 1753144089;
        }
        return taz2.taf_2();
    }

    private static boolean daz_8(taz taz2, class_1309 class_13092) {
        block0: {
            int n = -201090642;
            n = Integer.rotateLeft(n * -25043147, 25) ^ 0x24B73A3B;
            class_1309 class_13093 = class_13092;
            n = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 4);
            int n2 = n ^ 0xAA81A61E;
            if ((n2 ^ n) == -1434343906) break block0;
            int cfr_ignored_0 = (0x5E823FB0 ^ n) - 2019482654;
        }
        return taz2.zdth_2(class_13092);
    }

    private static boolean dth_9() {
        block0: {
            int n = tdhgh.rty(-388607725);
            int n2 = n ^ 0x636DF156;
            if ((n2 ^ n) == 1668149590) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x8BBBA045 ^ n, 4) - -266991722;
            int cfr_ignored_1 = (int)(0x49090E7827D4EB4FL ^ (long)n ^ 0xE180831A2DB93FC3L);
        }
        return yf.khdha_2();
    }

    private static boolean zdt_7(taz taz2) {
        block0: {
            int n = 301175774;
            n = Integer.rotateLeft(n * -224988047, 26) ^ 0x90EF5E66;
            taz taz3 = taz2;
            n = (taz3 != null ? System.identityHashCode(taz3) : 0) ^ n;
            int n2 = n ^ 0x68B87888;
            if ((n2 ^ n) == 1756919944) break block0;
            int cfr_ignored_0 = (0x794BEB56 ^ n) - 1876528058;
        }
        return taz2.taf_2();
    }

    private static float tna_4(int n) {
        block0: {
            int n2 = 1861557209;
            int n3 = (n2 = Integer.rotateLeft(n2 * -558791565, 18) ^ 0xBAC91097) ^ 0xF7D98C2C;
            if ((n3 ^ n2) == -136737748) break block0;
            int cfr_ignored_0 = (0x992C97F5 ^ n2) + 1374347456;
        }
        return Float.intBitsToFloat(n);
    }

    private static void zd_4(sht_6 sht2_2, class_1309 class_13092, int n, float f) {
        int n2 = 1525303907;
        n2 = Integer.rotateLeft(n2 * -1268056831, 25) ^ 0x971E9299;
        sht_6 sht3_2 = sht2_2;
        n2 = (sht3_2 != null ? System.identityHashCode(sht3_2) : 0) ^ n2;
        class_1309 class_13093 = class_13092;
        n2 = Integer.rotateLeft((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n2, 9);
        int n3 = n2 ^ 0x60B55504;
        if ((n3 ^ n2) != 1622496516) {
            int cfr_ignored_0 = (0x3A5F1F67 ^ n2) + -661663005;
        }
        sht2_2.jkhl(class_13092, n, f);
    }

    private static float hdd_3(class_1297 class_12972) {
        block0: {
            int n = -1636370836;
            int n2 = (n = Integer.rotateLeft(n * -12126637, 8) ^ 0x6EEE9696) ^ 0xD01EB301;
            if ((n2 ^ n) == -803294463) break block0;
            int cfr_ignored_0 = (0x4E68456D ^ n) + -464965589;
        }
        return class_12972.method_17682();
    }

    private static class_243 khla(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = 1704386954;
            int n2 = (n = Integer.rotateLeft(n * 1388608117, 27) ^ 0xA2D099EB) ^ 0x413C3F98;
            if ((n2 ^ n) == 1094467480) break block0;
            int cfr_ignored_0 = (0x24AADE12 ^ n) - 1160615646;
        }
        return class_2432.method_1020(class_2433);
    }

    private static float zlz_3(class_746 class_7462) {
        block0: {
            int n = 181513279;
            n = Integer.rotateLeft(n * 1542350347, 16) ^ 0x6034BE0A;
            class_746 class_7463 = class_7462;
            n = Integer.rotateLeft((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 7);
            int n2 = n ^ 0xAF7FFF27;
            if ((n2 ^ n) == -1350566105) break block0;
            int cfr_ignored_0 = (0xA5AE5318 ^ n) - -1225332541;
        }
        return class_7462.method_36454();
    }

    private static int zjy_2(int n, int n2) {
        block0: {
            int n3 = tdhgh.rty(1110257532);
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 28)) ^ 0x4A9643D9;
            if ((n4 ^ n3) == 1251361753) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x8BB6CA5 ^ n3, 4) - 319801142;
            int cfr_ignored_1 = (int)(0xCA09C29827D4EB4FL ^ (long)n3 ^ 0x7840831A2DB839C2L);
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float dkq_2(sht_6 sht2_2) {
        block0: {
            int n = -273503944;
            n = Integer.rotateLeft(n * -1158589349, 9) ^ 0xE9DF200F;
            sht_6 sht3_2 = sht2_2;
            n = Integer.rotateLeft((sht3_2 != null ? System.identityHashCode(sht3_2) : 0) ^ n, 21);
            int n2 = n ^ 0x35A939E9;
            if ((n2 ^ n) == 900282857) break block0;
            int cfr_ignored_0 = (0xDA1B90D1 ^ n) + -350234446;
        }
        return sht2_2.dhk_4();
    }

    private static boolean thz_2() {
        block0: {
            int n = 1814082881;
            int n2 = (n = Integer.rotateLeft(n * 1552934519, 6) ^ 0xFF946A16) ^ 0xE9393850;
            if ((n2 ^ n) == -382126000) break block0;
            int cfr_ignored_0 = (0x85198D11 ^ n) + 144782179;
        }
        return yf.dnkh();
    }

    private static float jshs_2(sht_6 sht2_2, float f) {
        block0: {
            int n = tdhgh.rty(-1007560274);
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 2);
            int n2 = n ^ 0xB400373F;
            if ((n2 ^ n) == -1275054273) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x77F1EE91 ^ n, 17) + -1968602422) * 2012343953;
            int cfr_ignored_1 = (int)(0xB54340AC27D4EB4FL ^ (long)n ^ 0x7C28831A2DB8C757L);
        }
        return sht2_2.tsb_3(f);
    }

    private static class_243 zthl_2(class_243 class_2432, double d, double d2, double d3) {
        block0: {
            int n = tdhgh.rty(-276223630);
            class_243 class_2433 = class_2432;
            n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
            n = (int)Double.doubleToLongBits(d3) ^ n;
            int n2 = n ^ 0x5371A701;
            if ((n2 ^ n) == 1399957249) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xBCF88E73 ^ n, 10) + -428417240) * -1124561293;
        }
        return class_2432.method_1031(d, d2, d3);
    }

    private static float dshd(int n) {
        block0: {
            int n2 = -1171837724;
            n2 = Integer.rotateLeft(n2 * 624040469, 14) ^ 0x30D9CB4E;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 21)) ^ 0x609686DD;
            if ((n3 ^ n2) == 1620477661) break block0;
            int cfr_ignored_0 = (0xDAB1AA39 ^ n2) + 2114129199;
        }
        return Float.intBitsToFloat(n);
    }

    private static int asq(int n, int n2) {
        block0: {
            int n3 = -1563719953;
            n3 = Integer.rotateLeft(n3 * 105660121, 9) ^ 0x74F833AF;
            int n4 = (n3 = n2 ^ n3) ^ 0xD765C7B;
            if ((n4 ^ n3) == 225860731) break block0;
            int cfr_ignored_0 = (0xAFBDDA94 ^ n3) + -363434793;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float awa_2(int n) {
        block0: {
            int n2 = tdhgh.rty(1389510630);
            int n3 = (n2 = n ^ n2) ^ 0x5554B9E1;
            if ((n3 ^ n2) == 1431615969) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x7868607 ^ n2, 3) - -307766764;
        }
        return Float.intBitsToFloat(n);
    }

    private static int zrd_4(int n, int n2) {
        block0: {
            int n3 = 226118375;
            n3 = Integer.rotateLeft(n3 * -1020667809, 6) ^ 0x8ABB9717;
            int n4 = (n3 = n2 ^ n3) ^ 0x33BF67C5;
            if ((n4 ^ n3) == 868181957) break block0;
            int cfr_ignored_0 = (0x3EC52D22 ^ n3) - -1188677905;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String[] khwz_2(String string) {
        int n = 1408604017;
        int n2 = (n = Integer.rotateLeft(n * 1692696505, 17) ^ 0x7B4EE9F6) ^ 0x164A5626;
        if ((n2 ^ n) != 373970470) {
            int cfr_ignored_0 = (0x45BFC157 ^ n) + 332288203;
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

    private static CallSite taz_6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 326135359;
            n3 = Integer.rotateLeft(n3 * -422477081, 20) ^ 0x76676C6B;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 23);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x5AF6D048;
            if ((n4 ^ n3) != 1526124616) {
                int cfr_ignored_0 = (0x4986BE77 ^ n3) - 397488319;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ rkd_2 ^ string.hashCode() ^ n2 + dhgh + i * -636650815) + rkd_2) ^ dhgh));
            }
            String[] stringArray = sht_6.khwz_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType3) : lookup.findVirtual(clazz, stringArray[0], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] fzwa75r9(String string) {
        return string.split("\u0007\u0012", -1);
    }

    private static CallSite vtmdkcdikjm(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ b8tg80cqmo0 ^ string.hashCode() ^ n2 + frftzs0j ^ i * -155183489 ^ b8tg80cqmo0, 5) ^ frftzs0j));
            }
            String[] stringArray = sht_6.fzwa75r9(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

