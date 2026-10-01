/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_243
 *  net.minecraft.class_287
 *  net.minecraft.class_2960
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_7833
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import lombok.Generated;
import net.minecraft.class_243;
import net.minecraft.class_287;
import net.minecraft.class_2960;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.m0vy.moondlc.m0vyguard.yb;
import us.m0vy.moondlc.m0vyguard.yf;

public class tdhd
implements tthy {
    private class_243 ts_4;
    private class_243 bfz;
    private class_243 jgh;
    private float khsd = Float.intBitsToFloat(Integer.rotateLeft(0xCC0026 ^ 0x8CC002E, 27));
    private final class_2960 rthy;
    private int ddhd_2;
    private int shsht_2 = 0xABC8FA43 ^ 0xABC8FA27;
    private double swh = Double.longBitsToDouble(0x657A5A840324F3B4L ^ 0x5ADE2065448AE7CFL);
    private boolean khlh_2;
    private boolean bjq;
    private final fa_2 thsk;
    private final fa_2 srs_2;
    private final byq thhr;
    private static final int thkhn = 103828659;
    private static final int sthl_2 = 1173063946;
    private static final int g8ron167d44n = -1758738550;
    private static final int kqgqqlp5z = 1553374612;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int iru0ghyfprz;

    public tdhd(class_243 class_2432, class_243 class_2433, class_2960 class_29602, byq byq2) {
        this.ts_4 = class_2432;
        this.bfz = class_2432;
        this.jgh = class_2433;
        this.rthy = class_29602;
        this.thhr = byq2;
        this.ddhd_2 = 0;
        long l = this.shsht_2 * 5;
        this.thsk = new fa_2(l, jkh.zthd);
        this.srs_2 = new fa_2(l, jkh.htf);
        this.khlh_2 = true;
    }

    public void rydh() {
        ++this.ddhd_2;
        if (this.ddhd_2 >= this.shsht_2) {
            this.ajs();
        }
        this.bfz = this.ts_4;
        this.ts_4 = this.ts_4.method_1019(this.jgh);
    }

    public void thdh_8(class_287 class_2872, class_4184 class_41842) {
        this.thsk.khmf(this.sjq_2() ? 0.0f : 1.0f);
        this.srs_2.khmf(this.sjq_2() ? 0.0f : 1.0f);
        float f = 10.0f;
        byq byq2 = byq.tkhw(this.thhr.rk()).tkhl_2(255.0f * this.thsk.tssh_2());
        RenderSystem.setShaderTexture((int)0, (class_2960)this.rthy);
        class_4587 class_45872 = new class_4587();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(class_41842.method_19329()));
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(class_41842.method_19330() + 180.0f));
        class_243 class_2432 = this.tnb_2(this.bfz, this.ts_4);
        class_45872.method_22904(class_2432.method_10216(), class_2432.method_10214(), class_2432.method_10215());
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-class_41842.method_19330()));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(class_41842.method_19329()));
        class_2872.method_22918(matrix4f, 0.0f, -f, 0.0f).method_22913(0.0f, 1.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, -f, -f, 0.0f).method_22913(1.0f, 1.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, -f, 0.0f, 0.0f).method_22913(1.0f, 0.0f).method_39415(byq2.rk());
        class_2872.method_22918(matrix4f, 0.0f, 0.0f, 0.0f).method_22913(0.0f, 0.0f).method_39415(byq2.rk());
    }

    public void tmkh_2(double d, double d2, double d3) {
        try {
            int n = -591686526;
            n = Integer.rotateLeft(n * 141692349, 9) ^ 0x82079EDF;
            n = System.identityHashCode(this) ^ n;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 24);
            int n2 = n ^ 0x3E07A030;
            if ((n2 ^ n) != 1040687152) {
                int cfr_ignored_0 = (0xE2BC34B2 ^ n) + -1594902892;
            }
            if ((0x2DC & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            tdhd.zshh_4();
        }
        this.ts_4 = new class_243(d, d2, d3);
    }

    /*
     * Unable to fully structure code
     */
    public void ar(double var1_1, double var3_2, double var5_3) {
        var9_4 = 0;
        var7_5 = 2000301854;
        var7_5 = Integer.rotateLeft(var7_5 * 1930083719, 16) ^ -237246697;
        var7_5 = System.identityHashCode(this) ^ var7_5;
        var7_5 = (int)Double.doubleToLongBits(var1_1) ^ var7_5;
        var8_6 = Integer.reverse(Integer.reverse(var7_5 ^ -1175427796));
        while (true) {
            block37: {
                block45: {
                    block38: {
                        block44: {
                            block41: {
                                block48: {
                                    block47: {
                                        block46: {
                                            block42: {
                                                block40: {
                                                    block43: {
                                                        block39: {
                                                            var9_4 = var8_6 ^ var7_5;
                                                            switch (var9_4 & 7) {
                                                                case 1: {
                                                                    if (var9_4 == 1973161961) break block37;
                                                                    if (var9_4 == 152079201) break block38;
                                                                    Integer.rotateLeft(897089797 ^ var7_5, 9) - 2113224406;
                                                                    (int)(-591608482812859569L ^ (long)var7_5 ^ -6701212097067859387L);
                                                                    if (var9_4 == -1649780311) break block39;
                                                                    if (var9_4 != 1486736897) {
                                                                        ** break;
                                                                    }
                                                                    break block40;
                                                                }
                                                                case 2: {
                                                                    if (var9_4 != 861026426) {
                                                                        ** break;
                                                                    }
                                                                    break block41;
                                                                }
                                                                case 4: {
                                                                    if (var9_4 == -1827658260) break block42;
                                                                    if (var9_4 == -1734264948) break block43;
                                                                    (Integer.rotateRight(-1589368845 ^ var7_5, 7) + -1952549464) * -1589368845;
                                                                    if (var9_4 == 1154678172) break block44;
                                                                    if (var9_4 == -1175427796) break;
                                                                    if (var9_4 == -1049907636) break block45;
                                                                    if (var9_4 != -1393069484) {
                                                                        ** break;
                                                                    }
                                                                    break block46;
                                                                }
                                                                case 5: {
                                                                    if (var9_4 != 285628709) {
                                                                        ** break;
                                                                    }
                                                                    break block47;
                                                                }
                                                                case 7: {
                                                                    if (var9_4 != -1057854849) {
                                                                        ** break;
                                                                    }
                                                                    break block48;
                                                                }
                                                            }
                                                            (Integer.rotateRight(-874171045 ^ var7_5, 12) + -1256254144) * -874171045;
                                                            if (!yf.khdha_2()) {
                                                                try {
                                                                    ++var9_4;
                                                                    if ((3893622587940502639L ^ (long)var7_5 | 1L) == 0L) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                    var8_6 = var7_5 ^ -1649780311;
                                                                }
                                                                catch (IllegalStateException v0) {
                                                                    var8_6 = (var7_5 ^ -1649780311) + -56681762 - -56681762;
                                                                }
                                                                continue;
                                                            }
                                                            try {
                                                                if ((6287964122390192475L ^ (long)var7_5 | 1L) == 0L) {
                                                                    throw new NoSuchElementException();
                                                                }
                                                                var8_6 = (var7_5 ^ -1734264948) + -282910506 - -282910506;
                                                            }
                                                            catch (NoSuchElementException v1) {
                                                                var8_6 = Integer.reverse(Integer.reverse(var7_5 ^ -1734264948));
                                                            }
                                                            --var9_4;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(924542250 ^ var7_5, 9) + -1330716847;
                                                        tdhd.sna_2();
                                                        (int)(5055235950143790902L ^ (long)var7_5 ^ 7048411070453195166L);
                                                        var8_6 = (var7_5 ^ 1215920622) + -26308723 - -26308723;
                                                        (int)(5701254252009213970L ^ (long)var7_5 ^ 2621814958614328300L);
                                                        var8_6 = Integer.reverse(Integer.reverse(var7_5 ^ -1734264948));
                                                        continue;
                                                    }
                                                    Integer.rotateRight(-1020488986 ^ var7_5, 11) - -1497143019;
                                                    this.jgh = new class_243(var1_1, var3_2, var5_3);
                                                    return;
                                                }
                                                Integer.rotateLeft(-1279770391 ^ var7_5, 9) + -944931982;
                                                (int)(8145585471021706063L ^ (long)var7_5 ^ 2366785752642703300L);
                                                var8_6 = Integer.reverse(Integer.reverse(var7_5 ^ -1926220663));
                                                (Integer.rotateRight(-985115233 ^ var7_5, 11) - -400556676) * -985115233;
                                                (int)(-196340936732799085L ^ (long)var7_5 ^ 1484616584252118877L);
                                                var8_6 = (int)((long)(var7_5 ^ -941280054) ^ 2794483479381429442L ^ 2794483479381429442L);
                                                (int)(-8718012105091273531L ^ (long)var7_5 ^ 3543396426210649047L);
                                                var8_6 = (int)((long)(var7_5 ^ -1175427796) ^ -6309686249235563747L ^ -6309686249235563747L);
                                                continue;
                                            }
                                            (Integer.rotateRight(2121631678 ^ var7_5, 18) - 1419317053) * 2121631679;
                                            var8_6 = var7_5 ^ -1727084637;
                                            (Integer.rotateRight(-782437573 ^ var7_5, 13) + 1587483488) * -782437573;
                                            try {
                                                --var9_4;
                                                var8_6 = (int)((long)(var7_5 ^ -1175427796) ^ 2338986022929016481L ^ 2338986022929016481L);
                                            }
                                            catch (UnsupportedOperationException v2) {
                                                var8_6 = var7_5 ^ -1175427796;
                                            }
                                            continue;
                                        }
                                        Integer.rotateRight(1333620167 ^ var7_5, 12) - -1534203308;
                                        var8_6 = (var7_5 ^ -614444492) + -452029946 - -452029946;
                                        Integer.rotateRight(1528214315 ^ var7_5, 14) + 203247984;
                                        try {
                                            if ((7790191745825121299L ^ (long)var7_5 | 1L) == 0L) {
                                                throw new IllegalArgumentException();
                                            }
                                            var8_6 = var7_5 ^ -1175427796;
                                        }
                                        catch (IllegalArgumentException v3) {
                                            var8_6 = var7_5 ^ -1175427796 ^ 1423589980 ^ 1423589980;
                                        }
                                        var9_4 += 3;
                                        continue;
                                    }
                                    (Integer.rotateRight(-1240476066 ^ var7_5, 9) - 273192093) * -1240476065;
                                    var8_6 = (var7_5 ^ 1798692933) + 3529550 - 3529550;
                                    (Integer.rotateLeft(-1089540624 ^ var7_5, 10) + 657223499) * -1089540623;
                                    try {
                                        ++var9_4;
                                        var8_6 = var7_5 ^ -1175427796;
                                    }
                                    catch (UnsupportedOperationException v4) {
                                        var8_6 = (int)((long)(var7_5 ^ -1175427796) ^ -3572191003209972727L ^ -3572191003209972727L);
                                    }
                                    continue;
                                }
                                (Integer.rotateLeft(1740809712 ^ var7_5, 15) + -1796229301) * 1740809713;
                                var8_6 = Integer.reverse(Integer.reverse(var7_5 ^ -841640277));
                                (Integer.rotateLeft(1336973396 ^ var7_5, 12) - -1430253209) * 1336973397;
                                (int)(8937382549804689558L ^ (long)var7_5 ^ 1249609772572562910L);
                                var8_6 = Integer.reverse(Integer.reverse(var7_5 ^ -1025585520));
                                (int)(8957534786676874809L ^ (long)var7_5 ^ -2185632736032238258L);
                                var8_6 = var7_5 ^ -1175427796 ^ 691880545 ^ 691880545;
                                continue;
                            }
                            Integer.rotateLeft(-1516477184 ^ var7_5, 7) + 307092027;
                            try {
                                var8_6 = (int)((long)(var7_5 ^ -1175427796) ^ -394296026603958111L ^ -394296026603958111L);
                            }
                            catch (IllegalArgumentException v5) {
                                var8_6 = var7_5 ^ -1175427796;
                            }
                            var9_4 -= 4;
                            continue;
                        }
                        Integer.rotateRight(-1080491001 ^ var7_5, 10) - 937761812;
                        var8_6 = (var7_5 ^ 660141865) + 610124478 - 610124478;
                        Integer.rotateRight(-602231190 ^ var7_5, 14) + -1416053231;
                        (int)(-1808380367534781331L ^ (long)var7_5 ^ 5924151242484637727L);
                        var8_6 = var7_5 ^ -1114380170;
                        (int)(-5654415137898161968L ^ (long)var7_5 ^ 844184454015930079L);
                        var8_6 = var7_5 ^ -1175427796 ^ 1688066523 ^ 1688066523;
                        ++var9_4;
                        continue;
                    }
                    Integer.rotateRight(-2130127314 ^ var7_5, 3) - -1536192819;
                    try {
                        var9_4 += 2;
                        if ((4555999591060839077L ^ (long)var7_5 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var8_6 = (int)((long)(var7_5 ^ -1175427796) ^ -1757112013215989122L ^ -1757112013215989122L);
                    }
                    catch (IllegalArgumentException v6) {
                        var8_6 = (var7_5 ^ -1175427796) + 1075393511 - 1075393511;
                    }
                    var9_4 += 5;
                    continue;
                }
                (Integer.rotateLeft(1419368701 ^ var7_5, 13) - 1124001246) * 1419368701;
                (int)(-7625870976347739313L ^ (long)var7_5 ^ 1220619647476859271L);
                try {
                    --var9_4;
                    if ((7302215619091345745L ^ (long)var7_5 | 1L) == 0L) {
                        throw new UnsupportedOperationException();
                    }
                    var8_6 = Integer.reverse(Integer.reverse(var7_5 ^ -1175427796));
                }
                catch (UnsupportedOperationException v7) {
                    var8_6 = (int)((long)(var7_5 ^ -1175427796) ^ -4193784071802791336L ^ -4193784071802791336L);
                }
                continue;
            }
            (Integer.rotateRight(-894260133 ^ var7_5, 12) + -1879015872) * -894260133;
            var8_6 = var7_5 ^ 918622441;
            Integer.rotateRight(278037322 ^ var7_5, 5) + 102466865;
            try {
                var9_4 -= 3;
                var8_6 = (var7_5 ^ -1175427796) + 1269930067 - 1269930067;
            }
            catch (NoSuchElementException v8) {
                var8_6 = (int)((long)(var7_5 ^ -1175427796) ^ -1910238425077451943L ^ -1910238425077451943L);
            }
            var9_4 -= 3;
            continue;
lbl215:
            // 6 sources

            Integer.rotateRight(1707491018 ^ var7_5, 15) + 1465858481;
            var8_6 = Integer.reverse(Integer.reverse(var7_5 ^ -1175427796));
        }
    }

    private void ajs() {
        int n = 525827690;
        n = Integer.rotateLeft(n * 783282277, 12) ^ 0x7AF61392;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x4898DA50;
        if ((n2 ^ n) != 1217976912) {
            int cfr_ignored_0 = (0x57CFA43A ^ n) + 590769247;
        }
        this.khlh_2 = false;
    }

    public boolean sjq_2() {
        int n = 1307988019;
        int n2 = (n = Integer.rotateLeft(n * 207878109, 24) ^ 0x3F827F46) ^ 0x31610D92;
        if ((n2 ^ n) != 828444050) {
            int cfr_ignored_0 = (0x7C975DA1 ^ n) - 1213226250;
        }
        return !this.khlh_2;
    }

    public boolean rhn_2() {
        try {
            int n = -1983513396;
            n = Integer.rotateLeft(n * -135644859, 24) ^ 0xA4BA09F4;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xA0301CCC;
            if ((n2 ^ n) != -1607459636) {
                int cfr_ignored_0 = (0x29F5E000 ^ n) - -1125470220;
            }
            if ((0x2A4 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return this.sjq_2() && this.thsk.tssh_2() == 0.0f;
    }

    private class_243 tnb_2(class_243 class_2432, class_243 class_2433) {
        double d = class_2432.method_10216() + (class_2433.method_10216() - class_2432.method_10216()) * (double)tdhd.dhza_3() - tdhd.mc.method_1561().field_4686.method_19326().method_10216();
        double d2 = class_2432.method_10214() + (class_2433.method_10214() - class_2432.method_10214()) * (double)tdhd.dhza_3() - tdhd.mc.method_1561().field_4686.method_19326().method_10214();
        double d3 = class_2432.method_10215() + (class_2433.method_10215() - class_2432.method_10215()) * (double)tdhd.dhza_3() - tdhd.mc.method_1561().field_4686.method_19326().method_10215();
        return new class_243(d, d2, d3);
    }

    private static float dhza_3() {
        return mc.method_61966().method_60637(false);
    }

    @Generated
    public class_243 shtq_2() {
        block0: {
            int n = 299234755;
            int n2 = (n = Integer.rotateLeft(n * -1774091415, 23) ^ 0xC473E4F3) ^ 0x3F2C20F4;
            if ((n2 ^ n) == 1059856628) break block0;
            int cfr_ignored_0 = (0x2EF9D537 ^ n) + -674582029;
        }
        return this.ts_4;
    }

    @Generated
    public class_243 aay() {
        block0: {
            int n = 344425963;
            n = Integer.rotateLeft(n * -1199201475, 28) ^ 0x55AB2F7E;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0xB7FCB080;
            if ((n2 ^ n) == -1208176512) break block0;
            int cfr_ignored_0 = (0xA37B356B ^ n) + 315675100;
        }
        return this.bfz;
    }

    @Generated
    public class_243 dad_5() {
        block0: {
            int n = 1401167778;
            int n2 = (n = Integer.rotateLeft(n * 364570437, 9) ^ 0xF59C4E0B) ^ 0x8E01D82F;
            if ((n2 ^ n) == -1912481745) break block0;
            int cfr_ignored_0 = (0xDD85C78D ^ n) + -239224586;
        }
        return this.jgh;
    }

    @Generated
    public float ghtgh() {
        block0: {
            int n = 1601099559;
            int n2 = (n = Integer.rotateLeft(n * 1417017561, 17) ^ 0x3E5A56B3) ^ 0x9419E7D6;
            if ((n2 ^ n) == -1810241578) break block0;
            int cfr_ignored_0 = (0xCB7730F1 ^ n) + -1757428264;
        }
        return this.khsd;
    }

    @Generated
    public class_2960 dnh() {
        block0: {
            int n = 556469469;
            n = Integer.rotateLeft(n * 1683347201, 25) ^ 0x23F18C5B;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 26);
            int n2 = n ^ 0xB0A3EF06;
            if ((n2 ^ n) == -1331433722) break block0;
            int cfr_ignored_0 = (0x9188E3DB ^ n) - -1136421553;
        }
        return this.rthy;
    }

    @Generated
    public int zwz_4() {
        block0: {
            int n = yb.khthgh(1180827010);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xCF4AC876;
            if ((n2 ^ n) == -817182602) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x892B35F4 ^ n, 4) - -1600575545) * -1993656843;
        }
        return this.ddhd_2;
    }

    @Generated
    public int zty_2() {
        block0: {
            int n = 325022913;
            n = Integer.rotateLeft(n * -945881165, 8) ^ 0xA6C3F2C0;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 3);
            int n2 = n ^ 0xD83668D9;
            if ((n2 ^ n) == -667522855) break block0;
            int cfr_ignored_0 = (0xCB691C18 ^ n) - 29798193;
        }
        return this.shsht_2;
    }

    @Generated
    public double shd_2() {
        block0: {
            int n = 1627918665;
            int n2 = (n = Integer.rotateLeft(n * -1219618427, 26) ^ 0x648362FE) ^ 0xEEF5896A;
            if ((n2 ^ n) == -285898390) break block0;
            int cfr_ignored_0 = (0x8FFD9823 ^ n) - -1097512372;
        }
        return this.swh;
    }

    @Generated
    public boolean ttr() {
        block0: {
            int n = 521426576;
            n = Integer.rotateLeft(n * -1307574013, 22) ^ 0xC728BD2F;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 7);
            int n2 = n ^ 0x1DC860D0;
            if ((n2 ^ n) == 499671248) break block0;
            int cfr_ignored_0 = (0x2DC3640 ^ n) + 287508493;
        }
        return this.khlh_2;
    }

    @Generated
    public boolean agha() {
        block0: {
            int n = 946316326;
            n = Integer.rotateLeft(n * 908940637, 14) ^ 0x63FD8278;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x1E46A6A0;
            if ((n2 ^ n) == 507946656) break block0;
            int cfr_ignored_0 = (0x26210286 ^ n) - -1925315700;
        }
        return this.bjq;
    }

    @Generated
    public fa_2 sjgh() {
        block0: {
            int n = -638455433;
            n = Integer.rotateLeft(n * -878133329, 14) ^ 0xF5D97D45;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x6AF492E4;
            if ((n2 ^ n) == 1794413284) break block0;
            int cfr_ignored_0 = (0xB3056393 ^ n) + 2100449209;
        }
        return this.thsk;
    }

    @Generated
    public fa_2 khdh_5() {
        block0: {
            int n = 1062369211;
            n = Integer.rotateLeft(n * 1641087473, 17) ^ 0xBB96A5BA;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 27);
            int n2 = n ^ 0xA367728A;
            if ((n2 ^ n) == -1553501558) break block0;
            int cfr_ignored_0 = (0x9C350531 ^ n) + 1421343323;
        }
        return this.srs_2;
    }

    @Generated
    public byq zrgh_2() {
        block0: {
            int n = yb.khthgh(-834194383);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 8);
            int n2 = n ^ 0xF075015A;
            if ((n2 ^ n) == -260767398) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x3E32356B ^ n, 10) + -1938680016;
        }
        return this.thhr;
    }

    @Generated
    public void hdn(class_243 class_2432) {
        int n = 221542023;
        n = Integer.rotateLeft(n * -1717422845, 21) ^ 0x75FEA7D4;
        n = System.identityHashCode(this) ^ n;
        class_243 class_2433 = class_2432;
        n = Integer.rotateRight((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 23);
        int n2 = n ^ 0x29FB9275;
        if ((n2 ^ n) != 704352885) {
            int cfr_ignored_0 = (0x24CFE4F2 ^ n) - -654846933;
        }
        this.ts_4 = class_2432;
    }

    @Generated
    public void stb(class_243 class_2432) {
        int n = yb.khthgh(475515792);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 2);
        int n2 = n ^ 0xA32F46B8;
        if ((n2 ^ n) != -1557182792) {
            int cfr_ignored_0 = Integer.rotateLeft(0xBF788D28 ^ n, 10) + 871806739;
        }
        this.bfz = class_2432;
    }

    @Generated
    public void khsf_2(class_243 class_2432) {
        int n = 1380863254;
        n = Integer.rotateLeft(n * 948605743, 18) ^ 0x1AE07A92;
        n = System.identityHashCode(this) ^ n;
        class_243 class_2433 = class_2432;
        n = Integer.rotateLeft((class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n, 19);
        int n2 = n ^ 0xA609BBC4;
        if ((n2 ^ n) != -1509311548) {
            int cfr_ignored_0 = (0xF447F6D2 ^ n) + 1800889575;
        }
        this.jgh = class_2432;
    }

    @Generated
    public void tkhth(float f) {
        int n = -660848674;
        n = Integer.rotateLeft(n * -302866211, 6) ^ 0xA20A4D69;
        n = System.identityHashCode(this) ^ n;
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0x5B41FAC4;
        if ((n2 ^ n) != 1531050692) {
            int cfr_ignored_0 = (0x83DDC51A ^ n) + 309695296;
        }
        this.khsd = f;
    }

    @Generated
    public void rlb(int n) {
        int n2 = -977834616;
        n2 = Integer.rotateLeft(n2 * 1910027339, 19) ^ 0x9E5D4711;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 10);
        int n3 = (n2 = n ^ n2) ^ 0xD73BD7B4;
        if ((n3 ^ n2) != -683944012) {
            int cfr_ignored_0 = (0x128CBA3C ^ n2) - 1272315244;
        }
        this.ddhd_2 = n;
    }

    @Generated
    public void bts_2(int n) {
        int n2 = -1829966160;
        n2 = Integer.rotateLeft(n2 * 1092780181, 14) ^ 0x158E2461;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 29);
        int n3 = n2 ^ 0x55E979E6;
        if ((n3 ^ n2) != 1441364454) {
            int cfr_ignored_0 = (0xC7059756 ^ n2) + 1267344780;
        }
        this.shsht_2 = n;
    }

    @Generated
    public void smz_3(double d) {
        int n = -2130573038;
        n = Integer.rotateLeft(n * -489136609, 22) ^ 0x5E8BFAD4;
        n = System.identityHashCode(this) ^ n;
        n = (int)Double.doubleToLongBits(d) ^ n;
        int n2 = n ^ 0x371F3DC4;
        if ((n2 ^ n) != 924794308) {
            int cfr_ignored_0 = (0xB61D34D6 ^ n) - -1025537897;
        }
        this.swh = d;
    }

    @Generated
    public void dht(boolean bl) {
        int n = yb.khthgh(397882300);
        n = System.identityHashCode(this) ^ n;
        int n2 = (n = bl ^ n) ^ 0xB79F1E5B;
        if ((n2 ^ n) != -1214308773) {
            int cfr_ignored_0 = Integer.rotateRight(0xA0282DE7 ^ n, 7) - 1765486132;
        }
        this.khlh_2 = bl;
    }

    @Generated
    public void ghbf(boolean bl) {
        int n = -227115593;
        n = Integer.rotateLeft(n * 2053535457, 18) ^ 0x9548F59A;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x6CF3CB41;
        if ((n2 ^ n) != 1827916609) {
            int cfr_ignored_0 = (0x9E85B6F6 ^ n) - -164698221;
        }
        this.bjq = bl;
    }

    private static void zshh_4() {
        int n = -157633956;
        int n2 = (n = Integer.rotateLeft(n * -366836065, 21) ^ 0x328E60A3) ^ 0xDE4357DE;
        if ((n2 ^ n) != -566011938) {
            int cfr_ignored_0 = (0x28D9E582 ^ n) - -966302353;
        }
        yf.athz_2();
    }

    private static void sna_2() {
        int n = 1978267808;
        int n2 = (n = Integer.rotateLeft(n * -391757041, 19) ^ 0x69BCF5C) ^ 0x33C13136;
        if ((n2 ^ n) != 868299062) {
            int cfr_ignored_0 = (0x4628C996 ^ n) - -152085985;
        }
        yf.athz_2();
    }

    private static String[] syd_2(String string) {
        int n = 82622455;
        n = Integer.rotateLeft(n * 799939021, 12) ^ 0x4A8625D;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 6);
        int n2 = n ^ 0x6C3A5319;
        if ((n2 ^ n) != 1815761689) {
            int cfr_ignored_0 = (0x68D6E4EE ^ n) - -232600956;
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

    private static CallSite stsh_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1419333986;
            n3 = Integer.rotateLeft(n3 * -1365926213, 12) ^ 0x46F62456;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x765D957E;
            if ((n4 ^ n3) != 1985844606) {
                int cfr_ignored_0 = (0x22C4C41C ^ n3) - -202750275;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ thkhn ^ string.hashCode() ^ n2 + sthl_2 ^ i * -197957093 ^ thkhn, 14) ^ sthl_2));
            }
            String[] stringArray = tdhd.syd_2(new String(cArray));
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

    private static String[] f8pj5zijtlg(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite cpshmvvx3f(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ g8ron167d44n ^ string.hashCode() ^ n2 + kqgqqlp5z ^ i * -467075591 ^ g8ron167d44n, 18) ^ kqgqqlp5z));
            }
            String[] stringArray = tdhd.f8pj5zijtlg(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

