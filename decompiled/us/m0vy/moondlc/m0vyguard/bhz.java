/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3532
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_3532;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tb_2;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="F5 Controller", category=bzw.OTHER, desc="Smooth third-person camera")
public class bhz
extends bnq {
    private static bhz hssh_2;
    private final khd zbd_2 = new khd(this, "Animatio".concat("n Type"));
    private final fy jzd_2 = new fy(this.zbd_2, "Smooth").rhh_3();
    private final fy tdt_2 = new fy(this.zbd_2, "Bounce");
    private final fy thkhf = new fy(this.zbd_2, "Elastic");
    private final fy zsj_2 = new fy(this.zbd_2, "EaseOut");
    private final fy bmt_2 = new fy(this.zbd_2, "EaseInOut");
    private final tay sha = new tay(this, "Distanc".concat("e Speed")).shth_7(Float.intBitsToFloat(-1735540002 - 1550445524)).dhbs_2(Float.intBitsToFloat(-784775945 + 1841740553)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xBC081CBF ^ 0x3300E97D, 2))).ssd_5(Float.intBitsToFloat(-1539800534 - 1718334813));
    private final tay rtn = new tay(this, "Rotatio".concat("n Smoothness")).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0xC8C928B1 ^ 0x47950041, 22))).dhbs_2(Float.intBitsToFloat(Integer.reverse(917860050) ^ 0x7476AD6C)).rkh_3(Float.intBitsToFloat(-1651689677 - 1634295849)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x839F1A5E ^ 0xB0AC5D9D, 19)));
    private final tay rwt = new tay(this, "Camera Di".concat("stance")).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(0x10072F54 ^ 0x51272F54)).rkh_3(Float.intBitsToFloat(1382282444 + -345450495)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x4C175D5 ^ 0xCD75D5, 4)));
    private final badh_2 dhbk = new badh_2(this, "Smooth R".concat("otation")).bts(true);
    private final badh_2 sths_2 = new badh_2(this, "Smooth Distance").bts(true);
    private final badh_2 bwl = new badh_2(this, "Crouch".concat(" Animation")).bts(true);
    private final tay stdh = new tay((hy)this, "Crouch Height", this::thhb).shth_7(Float.intBitsToFloat(0x2B0FE60A ^ 0x16C32AC7)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(-2101051372) ^ 0x15CDEF8C)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x1197006 ^ 0x116B006, 10)));
    private final badh_2 dsz_4 = new badh_2(this, "Jump Animation").bts(true);
    private final tay rsl = new tay((hy)this, "Jump Strength", this::bha_3).shth_7(Float.intBitsToFloat(-680110326 - -1737074934)).dhbs_2(Float.intBitsToFloat(-346771671 - -1430999255)).rkh_3(Float.intBitsToFloat(Integer.reverse(-1426430149) ^ 0xE12A9398)).ssd_5(2.0f);
    private final tay zdkh = new tay(this, "Animation".concat(" Speed")).shth_7(Float.intBitsToFloat(Integer.reverse(-1761402874) ^ 0x5C2717E3)).dhbs_2(Float.intBitsToFloat(-1272264345 + -1972449229)).rkh_3(Float.intBitsToFloat(-958343545 + 1967325315)).ssd_5(Float.intBitsToFloat(-542988094 - -1579820043));
    private float rsr;
    private float khwsh;
    private float za;
    private float thrkh;
    private float hagh_2;
    private float zkdh;
    private float thha;
    private float rrd_2;
    private boolean jz_2;
    private boolean sh = true;
    private final bql<btt> rhd = this::tzh_2;
    private static final int shkht_2 = -332590225;
    private static final int sskh = 659829590;
    private static final int bhr = -268763553;
    private static final int htq = -726743643;
    private static final int r12zk79pl = 1696877080;
    private static final int riasspji8t = -1846216196;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int fjfb6ev1ht;

    public static bhz zshdh() {
        block0: {
            int n = tb_2.ams_2(1668414297);
            int n2 = n ^ 0xBC70FEF3;
            if ((n2 ^ n) == -1133445389) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xDF0105AA ^ n, 14) + 92098257;
        }
        return hssh_2;
    }

    public bhz() {
        hssh_2 = this;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void nt() {
        var3_1 = 0;
        var1_2 = 1720257965;
        var1_2 = Integer.rotateLeft(var1_2 * 296639797, 10) ^ -1156082084;
        var1_2 = System.identityHashCode(this) ^ var1_2;
        var2_3 = (int)((long)(var1_2 ^ 37002755) ^ 2714332536803900754L ^ 2714332536803900754L);
        block44: while (true) {
            if ((var3_1 = var2_3 ^ var1_2) == -1432523752) ** GOTO lbl243
            if (var3_1 == 472158440) ** GOTO lbl202
            (Integer.rotateRight(2043960478 ^ var1_2, 18) - -988490147) * 2043960479;
            if (var3_1 == -1983921670) {
                (Integer.rotateRight(-818430785 ^ var1_2, 12) - 471693916) * -818430785;
                return;
            }
            switch (var3_1) {
                case -1355731629: {
                    (Integer.rotateRight(1199587615 ^ var1_2, 11) - -1394245124) * 1199587615;
                    if (bhz.mc.field_1690 == null) {
                        var2_3 = (var1_2 ^ -1983921670) + 258556462 - 258556462;
                        var3_1 -= 3;
                        continue block44;
                    }
                    var2_3 = (var1_2 ^ 1440765989) + 1100931993 - 1100931993;
                    Integer.rotateRight(268143651 ^ var1_2, 4) + -204236936;
                    var3_1 -= 3;
                    continue block44;
                }
                case -197249615: {
                    Integer.rotateLeft(2067244553 ^ var1_2, 18) + -266683822;
                    (int)(-5078643984690779313L ^ (long)var1_2 ^ -1362194738820096293L);
                    this.ghzk_2();
                    this.jz_2 = true;
                    try {
                        var3_1 += 4;
                        if ((-8151841826334308101L ^ (long)var1_2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ -1983921670));
                    }
                    catch (IllegalStateException v0) {
                        var2_3 = var1_2 ^ -1983921670 ^ 1049153597 ^ 1049153597;
                    }
                    var3_1 -= 5;
                    continue block44;
                }
                case 1440765989: {
                    Integer.rotateLeft(-713668667 ^ var1_2, 13) - -575647722;
                    (int)(1712751010337057615L ^ (long)var1_2 ^ 3350822271223169624L);
                    if (!bhz.mc.field_1690.method_31044().method_31034()) {
                        (int)(3658944557710525844L ^ (long)var1_2 ^ -6912987024831035297L);
                        var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ -197249615));
                        ++var3_1;
                        continue block44;
                    }
                    try {
                        var3_1 += 3;
                        if ((5434870234091095039L ^ (long)var1_2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var2_3 = var1_2 ^ -1983921670 ^ 1140756879 ^ 1140756879;
                    }
                    catch (NoSuchElementException v1) {
                        var2_3 = Integer.reverse(Integer.reverse(var1_2 ^ -1983921670));
                    }
                    continue block44;
                }
                case 37002755: {
                    Integer.rotateRight(-671422197 ^ var1_2, 13) + 733992848;
                    this.sh = true;
                    this.jz_2 = false;
                    if (bhz.mc.field_1724 == null) {
                        try {
                            ++var3_1;
                            if ((-6592253285648512969L ^ (long)var1_2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var2_3 = var1_2 ^ -1983921670 ^ -1782226940 ^ -1782226940;
                        }
                        catch (IllegalStateException v2) {
                            var2_3 = var1_2 ^ -1983921670 ^ 402659256 ^ 402659256;
                        }
                        continue block44;
                    }
                    (int)(4386355399449271219L ^ (long)var1_2 ^ 1192654725082895471L);
                    var2_3 = (var1_2 ^ -1355731629) + -2035037254 - -2035037254;
                    continue block44;
                }
                case -316256535: {
                    Integer.rotateRight(2031938090 ^ var1_2, 18) + -1361184175;
                    try {
                        if ((-4479249295034814775L ^ (long)var1_2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var2_3 = var1_2 ^ 37002755;
                    }
                    catch (IllegalStateException v3) {
                        var2_3 = (int)((long)(var1_2 ^ 37002755) ^ 2900630402015092110L ^ 2900630402015092110L);
                    }
                    ++var3_1;
                    continue block44;
                }
                case -1081669849: {
                    (Integer.rotateRight(-1820477773 ^ var1_2, 5) + -526991640) * -1820477773;
                    try {
                        var3_1 += 4;
                        var2_3 = var1_2 ^ 37002755;
                    }
                    catch (NoSuchElementException v4) {
                        var2_3 = (int)((long)(var1_2 ^ 37002755) ^ -618417877252815630L ^ -618417877252815630L);
                    }
                    var3_1 -= 2;
                    continue block44;
                }
                case -1328959038: {
                    Integer.rotateLeft(724887968 ^ var1_2, 8) + 1069935003;
                    var2_3 = var1_2 ^ 1103507284;
                    (Integer.rotateRight(175079378 ^ var1_2, 4) + 1205737897) * 175079379;
                    try {
                        var2_3 = var1_2 ^ 37002755;
                    }
                    catch (UnsupportedOperationException v5) {
                        var2_3 = (int)((long)(var1_2 ^ 37002755) ^ -5189084292651319669L ^ -5189084292651319669L);
                    }
                    continue block44;
                }
                case 214974845: {
                    Integer.rotateRight(192441891 ^ var1_2, 4) + 1743975800;
                    var2_3 = (var1_2 ^ 1995516163) + -1441806268 - -1441806268;
                    (Integer.rotateLeft(-1904224455 ^ var1_2, 4) + 1171828514) * -1904224455;
                    (int)(5534212575863302991L ^ (long)var1_2 ^ 1114785056233698379L);
                    try {
                        var3_1 += 4;
                        if ((1547750248420071275L ^ (long)var1_2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var2_3 = (int)((long)(var1_2 ^ 37002755) ^ -1211774671434645680L ^ -1211774671434645680L);
                    }
                    catch (UnsupportedOperationException v6) {
                        var2_3 = (int)((long)(var1_2 ^ 37002755) ^ -5855419260722777993L ^ -5855419260722777993L);
                    }
                    var3_1 += 3;
                    continue block44;
                }
                case 1009686811: {
                    Integer.rotateLeft(831511565 ^ var1_2, 9) - 80299214;
                    (int)(-919453197761451185L ^ (long)var1_2 ^ 1806087599035009963L);
                    try {
                        var3_1 -= 5;
                        var2_3 = (int)((long)(var1_2 ^ 37002755) ^ -7848867448451239753L ^ -7848867448451239753L);
                    }
                    catch (ArithmeticException v7) {
                        var2_3 = var1_2 ^ 37002755;
                    }
                    continue block44;
                }
                case -1571501640: {
                    (Integer.rotateRight(252915550 ^ var1_2, 4) - -676308067) * 252915551;
                    var2_3 = var1_2 ^ -1186235246 ^ -776092313 ^ -776092313;
                    Integer.rotateRight(1367713418 ^ var1_2, 13) + -477312527;
                    (int)(8230373639324833227L ^ (long)var1_2 ^ -5827897783944656479L);
                    var2_3 = (int)((long)(var1_2 ^ 1798174634) ^ 6406831699666561021L ^ 6406831699666561021L);
                    (int)(-8430543763883619413L ^ (long)var1_2 ^ -6968484683177739312L);
                    var2_3 = var1_2 ^ 37002755 ^ -1106908330 ^ -1106908330;
                    var3_1 -= 5;
                    continue block44;
                }
                case -582882822: {
                    Integer.rotateRight(1079079906 ^ var1_2, 11) + -835016807;
                    var2_3 = (int)((long)(var1_2 ^ -1374627115) ^ -3824821693452350139L ^ -3824821693452350139L);
                    (Integer.rotateRight(-1891066790 ^ var1_2, 4) + 1579716129) * -1891066789;
                    try {
                        --var3_1;
                        if ((-1229043189977411587L ^ (long)var1_2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var2_3 = (var1_2 ^ 37002755) + 1241578741 - 1241578741;
                    }
                    catch (IllegalArgumentException v8) {
                        var2_3 = (int)((long)(var1_2 ^ 37002755) ^ -4950634697752993001L ^ -4950634697752993001L);
                    }
                    var3_1 += 2;
                    continue block44;
                }
                case 1286814506: {
                    Integer.rotateRight(557881198 ^ var1_2, 7) - 187692429;
                    try {
                        var2_3 = var1_2 ^ 37002755;
                    }
                    catch (IllegalArgumentException v9) {
                        var2_3 = (var1_2 ^ 37002755) + -1683570191 - -1683570191;
                    }
                    var3_1 -= 3;
                    continue block44;
                }
                case -1424208459: {
                    (Integer.rotateRight(812693810 ^ var1_2, 9) + -503051191) * 812693811;
                    try {
                        var3_1 += 5;
                        if ((-5612635747789573349L ^ (long)var1_2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var2_3 = var1_2 ^ 37002755 ^ -853300199 ^ -853300199;
                    }
                    catch (ArithmeticException v10) {
                        var2_3 = var1_2 ^ 37002755 ^ -867998031 ^ -867998031;
                    }
                    var3_1 += 5;
                    continue block44;
                }
lbl202:
                // 1 sources

                Integer.rotateRight(-995300598 ^ var1_2, 11) + -716302991;
                var2_3 = (int)((long)(var1_2 ^ -432361359) ^ -6656929416995323833L ^ -6656929416995323833L);
                Integer.rotateLeft(-731086716 ^ var1_2, 13) - -1115607241;
                try {
                    var3_1 += 4;
                    var2_3 = var1_2 ^ 37002755 ^ 2620233 ^ 2620233;
                }
                catch (NoSuchElementException v11) {
                    var2_3 = (var1_2 ^ 37002755) + -447302937 - -447302937;
                }
                var3_1 -= 5;
                continue block44;
                case 623079589: {
                    (Integer.rotateRight(36638810 ^ var1_2, 3) + 1209047585) * 36638811;
                    (int)(3176341481459599763L ^ (long)var1_2 ^ -4751328623384726024L);
                    var2_3 = var1_2 ^ 37002755;
                    var3_1 -= 4;
                    continue block44;
                }
                case -1352629576: {
                    Integer.rotateRight(1411174382 ^ var1_2, 13) - 869977357;
                    try {
                        if ((1887519760843064287L ^ (long)var1_2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var2_3 = var1_2 ^ 37002755;
                    }
                    catch (IllegalStateException v12) {
                        var2_3 = var1_2 ^ 37002755;
                    }
                    continue block44;
                }
                case 493975638: {
                    Integer.rotateRight(-356182486 ^ var1_2, 16) + 1916489297;
                    var2_3 = (int)((long)(var1_2 ^ 880146695) ^ -8439439621893348167L ^ -8439439621893348167L);
                    (Integer.rotateRight(-707698766 ^ var1_2, 13) + -390580791) * -707698765;
                    var2_3 = (var1_2 ^ 37002755) + -643993935 - -643993935;
                    var3_1 += 5;
                    continue block44;
                }
lbl243:
                // 1 sources

                (Integer.rotateLeft(-1659824136 ^ var1_2, 6) + 158303811) * -1659824135;
                var2_3 = (var1_2 ^ 38952391) + 942532010 - 942532010;
                (Integer.rotateLeft(99603224 ^ var1_2, 3) + -1134022877) * 99603225;
                var2_3 = (var1_2 ^ -1392748340) + 760847964 - 760847964;
                (Integer.rotateRight(600793695 ^ var1_2, 7) - 1517979836) * 600793695;
                var2_3 = var1_2 ^ 37002755 ^ 1286834347 ^ 1286834347;
                var3_1 -= 2;
                continue block44;
            }
            (Integer.rotateRight(956604914 ^ var1_2, 10) + -336774263) * 956604915;
            var2_3 = var1_2 ^ 37002755 ^ 837601152 ^ 837601152;
        }
    }

    @Override
    public void nc() {
        int n = 0;
        int n2 = 828901086;
        n2 = Integer.rotateLeft(n2 * -1070411583, 15) ^ 0x55C098A0;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x1F097CE5 ^ 0xECA26B1F)));
        while (true) {
            block18: {
                block17: {
                    block24: {
                        block27: {
                            block15: {
                                block19: {
                                    block28: {
                                        block30: {
                                            block23: {
                                                block29: {
                                                    block20: {
                                                        block16: {
                                                            block25: {
                                                                block21: {
                                                                    block26: {
                                                                        block22: {
                                                                            block13: {
                                                                                block14: {
                                                                                    if ((n = Integer.reverse(n3) ^ n2 ^ 0xECA26B1F) > -912429046) break block13;
                                                                                    if (n > -1168945031) break block14;
                                                                                    if (n == -1750493242) break block15;
                                                                                    if (n == -1513193748) break block16;
                                                                                    if (n == -1168945031) break block17;
                                                                                    break block18;
                                                                                }
                                                                                if (n == -1027690158) break block19;
                                                                                if (n == -995046132) break block20;
                                                                                int cfr_ignored_0 = Integer.rotateRight(0xD2FD7BA7 ^ n2, 13) - -1861248908;
                                                                                if (n == -912429046) break block21;
                                                                                break block18;
                                                                            }
                                                                            if (n > 520715493) break block22;
                                                                            if (n == -789547128) break block23;
                                                                            if (n == 490584064) break block24;
                                                                            if (n == 520715493) break block25;
                                                                            break block18;
                                                                        }
                                                                        if (n > 840165547) break block26;
                                                                        if (n == 667758580) break block27;
                                                                        if (n == 840165547) break block28;
                                                                        break block18;
                                                                    }
                                                                    if (n == 1263015122) break block29;
                                                                    if (n == 1761683230) break block30;
                                                                    break block18;
                                                                }
                                                                int cfr_ignored_1 = Integer.rotateRight(0xD8D1BBAF ^ n2, 14) - 1170430316;
                                                                this.sh = true;
                                                                this.thha = 0.0f;
                                                                this.rrd_2 = 0.0f;
                                                                return;
                                                            }
                                                            int cfr_ignored_2 = Integer.rotateRight(0x859F368A ^ n2, 3) + 849689073;
                                                            if (bhz.bfa()) {
                                                                n3 = Integer.reverse(n2 ^ 0xA008490B ^ 0xECA26B1F) + -333431459 - -333431459;
                                                                int cfr_ignored_3 = Integer.rotateLeft(0xBC76A560 ^ n2, 10) + -692345381;
                                                                n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xC99D700A ^ 0xECA26B1F)));
                                                                n -= 4;
                                                                continue;
                                                            }
                                                            try {
                                                                n3 = (int)((long)Integer.reverse(n2 ^ 0xA5CE7EEC ^ 0xECA26B1F) ^ 0xD66270492BE104E8L ^ 0xD66270492BE104E8L);
                                                            }
                                                            catch (NoSuchElementException noSuchElementException) {
                                                                n3 = (int)((long)Integer.reverse(n2 ^ 0xA5CE7EEC ^ 0xECA26B1F) ^ 0x984E826BB8D99EA3L ^ 0x984E826BB8D99EA3L);
                                                            }
                                                            --n;
                                                            continue;
                                                        }
                                                        int cfr_ignored_4 = (Integer.rotateRight(0x76D1C13F ^ n2, 17) - 1740899804) * 1993457983;
                                                        bhz.sagh_4();
                                                        n3 = Integer.reverse(n2 ^ 0xC99D700A ^ 0xECA26B1F) ^ 0x2FFF438 ^ 0x2FFF438;
                                                        int cfr_ignored_5 = (Integer.rotateLeft(0xC774A111 ^ n2, 11) + 729620554) * -948657903;
                                                        int cfr_ignored_6 = (int)(0x5C60F2C27D4EB4FL ^ (long)n2 ^ 0xE328831A2DB9A65DL);
                                                        n += 2;
                                                        continue;
                                                    }
                                                    int cfr_ignored_7 = Integer.rotateRight(0x5ECAC6 ^ n2, 3) - 265825589;
                                                    n3 = Integer.reverse(n2 ^ 0x97F32065 ^ 0xECA26B1F);
                                                    int cfr_ignored_8 = Integer.rotateRight(0x50C382AF ^ n2, 13) - -871730580;
                                                    try {
                                                        --n;
                                                        if ((0x157F5BBC6178A8D1L ^ (long)n2 | 1L) == 0L) {
                                                            throw new IllegalStateException();
                                                        }
                                                        n3 = (int)((long)Integer.reverse(n2 ^ 0x1F097CE5 ^ 0xECA26B1F) ^ 0x4858941BA4698D81L ^ 0x4858941BA4698D81L);
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        n3 = Integer.reverse(n2 ^ 0x1F097CE5 ^ 0xECA26B1F);
                                                    }
                                                    n -= 5;
                                                    continue;
                                                }
                                                int cfr_ignored_9 = (Integer.rotateLeft(0x1B515970 ^ n2, 6) + 1396143051) * 458316145;
                                                try {
                                                    if ((0x4D4780B5E09A8269L ^ (long)n2 | 1L) == 0L) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    n3 = Integer.reverse(n2 ^ 0x1F097CE5 ^ 0xECA26B1F);
                                                }
                                                catch (NoSuchElementException noSuchElementException) {
                                                    n3 = Integer.reverse(n2 ^ 0x1F097CE5 ^ 0xECA26B1F);
                                                }
                                                n += 2;
                                                continue;
                                            }
                                            int cfr_ignored_10 = (Integer.rotateLeft(0x340BEFDC ^ n2, 9) - 1372564191) * 873197533;
                                            int cfr_ignored_11 = (int)(0x164F880E298F77DL ^ (long)n2 ^ 0xC71098215DDAF18L);
                                            n3 = Integer.reverse(n2 ^ 0x1F097CE5 ^ 0xECA26B1F) ^ 0xB32E225F ^ 0xB32E225F;
                                            n += 3;
                                            continue;
                                        }
                                        int cfr_ignored_12 = Integer.rotateRight(0xB281B24A ^ n2, 9) + -1575864783;
                                        n3 = Integer.reverse(n2 ^ 0xE8C76B4F ^ 0xECA26B1F);
                                        int cfr_ignored_13 = (Integer.rotateRight(0xC171D81B ^ n2, 11) + 1898367616) * -1049503717;
                                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x1F097CE5 ^ 0xECA26B1F)));
                                        n -= 4;
                                        continue;
                                    }
                                    int cfr_ignored_14 = (Integer.rotateRight(0xFADB4313 ^ n2, 18) + 1693105800) * -86293741;
                                    n3 = Integer.reverse(n2 ^ 0x1F097CE5 ^ 0xECA26B1F);
                                    int cfr_ignored_15 = (Integer.rotateRight(0x2621DB5E ^ n2, 7) - -1569247331) * 639753055;
                                    n -= 4;
                                    continue;
                                }
                                int cfr_ignored_16 = (Integer.rotateLeft(0xD9A4BB7D ^ n2, 14) - 1599099742) * -643515523;
                                int cfr_ignored_17 = (int)(0x1B16154027D4EB4FL ^ (long)n2 ^ 0xD7F0831A2DB99BFDL);
                                n3 = Integer.reverse(n2 ^ 0xC1E3DD68 ^ 0xECA26B1F);
                                int cfr_ignored_18 = (Integer.rotateLeft(0x436D5BF0 ^ n2, 11) + 781959499) * 1131240433;
                                n3 = Integer.reverse(n2 ^ 0x1F097CE5 ^ 0xECA26B1F) + -2053052383 - -2053052383;
                                continue;
                            }
                            int cfr_ignored_19 = (Integer.rotateLeft(0xA56ED379 ^ n2, 7) + 214514402) * -1519463559;
                            int cfr_ignored_20 = (int)(0x67DC7D4427D4EB4FL ^ (long)n2 ^ 0x7F8831A2DB96269L);
                            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x88524CC9 ^ 0xECA26B1F)));
                            int cfr_ignored_21 = Integer.rotateLeft(0x7DDB7AE8 ^ n2, 18) + 1106346323;
                            n3 = Integer.reverse(n2 ^ 0x1F097CE5 ^ 0xECA26B1F);
                            n -= 5;
                            continue;
                        }
                        int cfr_ignored_22 = (Integer.rotateLeft(0x2B18EAD9 ^ n2, 8) + 1013059458) * 723053273;
                        int cfr_ignored_23 = (int)(0xE9AA44E427D4EB4FL ^ (long)n2 ^ 0x74B8831A2DB87E85L);
                        n3 = (int)((long)Integer.reverse(n2 ^ 0x3017870A ^ 0xECA26B1F) ^ 0xEA274246B27FDB1L ^ 0xEA274246B27FDB1L);
                        int cfr_ignored_24 = Integer.rotateLeft(0x87F8FF20 ^ n2, 3) + 2072282139;
                        try {
                            n += 5;
                            if ((0xB7C5A160F35F2C75L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x1F097CE5 ^ 0xECA26B1F)));
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = (int)((long)Integer.reverse(n2 ^ 0x1F097CE5 ^ 0xECA26B1F) ^ 0x477636520373787AL ^ 0x477636520373787AL);
                        }
                        n -= 2;
                        continue;
                    }
                    int cfr_ignored_25 = Integer.rotateLeft(0xB9BF9A88 ^ n2, 10) + -2104404557;
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x1C3D8683 ^ 0xECA26B1F)));
                    int cfr_ignored_26 = (Integer.rotateRight(0xBA29B016 ^ n2, 10) - -1888882203) * -1171673065;
                    n3 = Integer.reverse(n2 ^ 0x22C8FA ^ 0xECA26B1F) ^ 0xF0B1D1D9 ^ 0xF0B1D1D9;
                    int cfr_ignored_27 = (Integer.rotateLeft(0xFC1BAD38 ^ n2, 18) + -1950902013) * -65295047;
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x1F097CE5 ^ 0xECA26B1F)));
                    n += 2;
                    continue;
                }
                int cfr_ignored_28 = (Integer.rotateLeft(0x6EFB795 ^ n2, 3) - -614147514) * 116373397;
                int cfr_ignored_29 = (int)(0xC45D19A827D4EB4FL ^ (long)n2 ^ 0xCE20831A2DB8256BL);
                n3 = Integer.reverse(n2 ^ 0xEBA6D1AA ^ 0xECA26B1F);
                int cfr_ignored_30 = (Integer.rotateLeft(0x6661A014 ^ n2, 15) - 1781531047) * 1717674005;
                n3 = (int)((long)Integer.reverse(n2 ^ 0x1F097CE5 ^ 0xECA26B1F) ^ 0x8C4412F7A7FA2494L ^ 0x8C4412F7A7FA2494L);
                n += 5;
                continue;
            }
            int cfr_ignored_31 = (Integer.rotateRight(0x27414952 ^ n2, 7) + -985300951) * 658590035;
            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x1F097CE5 ^ 0xECA26B1F)));
        }
    }

    public boolean bghdh(boolean bl) {
        int n = tb_2.ams_2(1660830911);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 10);
        int n2 = (n = Integer.rotateRight(bl ^ n, 4)) ^ 0x390B60D1;
        if ((n2 ^ n) != 957046993) {
            int cfr_ignored_0 = Integer.rotateRight(0x5BF5246E ^ n, 14) - 655165581;
        }
        if (!yf.khdha_2()) {
            bhz.zks();
        }
        return this.rgha_2() && bl && bhz.mc.field_1724 != null && bhz.mc.field_1687 != null;
    }

    public float zqs(float f) {
        int n = 1084898935;
        n = Integer.rotateLeft(n * -1485233385, 7) ^ 0x2BC31B3E;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 10);
        int n2 = n ^ 0x4E1DBA28;
        if ((n2 ^ n) != 1310571048) {
            int cfr_ignored_0 = (0xEB7845F ^ n) + -291752967;
        }
        if (bhz.mc.field_1724 == null) {
            return 0.0f;
        }
        return bhz.bnr(this.dhbk) ? this.thrkh + (this.za - this.thrkh) * f : bhz.mc.field_1724.method_5705(f);
    }

    public float zsj_2(float f) {
        int n = 719230458;
        n = Integer.rotateLeft(n * -1069381521, 15) ^ 0x7E6EF61D;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 6);
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0xF2E84E96;
        if ((n2 ^ n) != -219656554) {
            int cfr_ignored_0 = (0xD836DB6C ^ n) - 89462300;
        }
        if (bhz.mc.field_1724 == null) {
            return 0.0f;
        }
        return bhz.dtsh(this.dhbk) ? class_3532.method_15363((float)(this.zkdh + (this.hagh_2 - this.zkdh) * f), (float)bhz.thz_6(-229276764 + -799114148), (float)Float.intBitsToFloat(1394602048 - 275509312)) : bhz.mc.field_1724.method_5695(f);
    }

    public float ajj(float f) {
        int n = -1169814423;
        n = Integer.rotateLeft(n * 1680295523, 18) ^ 0x9F2DF3FA;
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0x7754AA90;
        if ((n2 ^ n) != 2002037392) {
            int cfr_ignored_0 = (0xCD12A6F9 ^ n) + 1012985444;
        }
        return this.sths_2.shzl() ? this.khwsh + (this.rsr - this.khwsh) * f : this.rwt.thw_5();
    }

    public float dwsh_2(float f) {
        int n = 0;
        int n2 = -1022369218;
        n2 = Integer.rotateLeft(n2 * 804980245, 13) ^ 0xBD1F49E3;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (1260503509 * -595069141 + 231489839 ^ n2) + 1012574510 - 1012574510;
        block23: while (true) {
            switch (((n3 ^ n2) - 231489839) * 609423235) {
                case 1260503508: {
                    int cfr_ignored_0 = Integer.rotateRight(0xDC325A6F ^ n2, 14) - -1367960916;
                    throw null;
                }
                case 1260503510: {
                    int cfr_ignored_1 = Integer.rotateLeft(0xBD810AA9 ^ n2, 10) + -151131726;
                    int cfr_ignored_2 = (int)(0x7F33A49427D4EB4FL ^ (long)n2 ^ 0xB458831A2DB953B6L);
                    return this.rrd_2 + (this.thha - this.rrd_2) * f;
                }
                case 1260503509: {
                    int cfr_ignored_3 = (Integer.rotateRight(0xAFE159BA ^ n2, 8) + 1353153729) * -1344185925;
                    if (!yf.dnkh()) {
                        n3 = (722470600 * -595069141 + 231489839 ^ n2) + -1618878901 - -1618878901;
                        int cfr_ignored_4 = Integer.rotateRight(0xB67D154A ^ n2, 9) + 495137585;
                        n3 = 1260503510 * -595069141 + 231489839 ^ n2;
                        n += 3;
                        continue block23;
                    }
                    int cfr_ignored_5 = (int)(0x29062EDD3B8FFC72L ^ (long)n2 ^ 0xA0CABBAC03C3FFDDL);
                    n3 = 1075302882 * -595069141 + 231489839 ^ n2;
                    int cfr_ignored_6 = (int)(0x2E0459CA30F5A33CL ^ (long)n2 ^ 0x4EE4AD58BD5FF1D9L);
                    n3 = 1260503508 * -595069141 + 231489839 ^ n2 ^ 0xD5EF366A ^ 0xD5EF366A;
                    n -= 3;
                    continue block23;
                }
                case 1260503511: {
                    int cfr_ignored_7 = Integer.rotateRight(0xC0C671C3 ^ n2, 11) + 1550149080;
                    try {
                        n += 4;
                        n3 = (int)((long)(1260503509 * -595069141 + 231489839 ^ n2) ^ 0xB808CB526BF0A200L ^ 0xB808CB526BF0A200L);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(Integer.reverse(1260503509 * -595069141 + 231489839 ^ n2));
                    }
                    n += 4;
                    continue block23;
                }
                case 1260503512: {
                    int cfr_ignored_8 = (Integer.rotateRight(0x726F17D3 ^ n2, 17) + -539917880) * 1919883219;
                    try {
                        if ((0x88395F98A7795D89L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (int)((long)(1260503509 * -595069141 + 231489839 ^ n2) ^ 0xAF58BCD52B23217CL ^ 0xAF58BCD52B23217CL);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = 1260503509 * -595069141 + 231489839 ^ n2 ^ 0xC5D23D83 ^ 0xC5D23D83;
                    }
                    n -= 3;
                    continue block23;
                }
                case 1260503513: {
                    int cfr_ignored_9 = Integer.rotateRight(0x4E29FA6B ^ n2, 12) + 2071130672;
                    n3 = (-154055303 * -595069141 + 231489839 ^ n2) + -2063857030 - -2063857030;
                    int cfr_ignored_10 = Integer.rotateRight(0x857E29AB ^ n2, 3) + 782543600;
                    int cfr_ignored_11 = (int)(0x987AF1530AABE667L ^ (long)n2 ^ 0x1FD6D9E437E89D24L);
                    n3 = (-1441246785 * -595069141 + 231489839 ^ n2) + -1914082606 - -1914082606;
                    int cfr_ignored_12 = (int)(0x20B8474AE18E02A3L ^ (long)n2 ^ 0x73E50FAFFE61ECA1L);
                    n3 = Integer.reverse(Integer.reverse(1260503509 * -595069141 + 231489839 ^ n2));
                    n += 4;
                    continue block23;
                }
                case 1260503514: {
                    int cfr_ignored_13 = (Integer.rotateLeft(0x8B77E1DC ^ n2, 4) - -404621089) * -1955077667;
                    n3 = -827262609 * -595069141 + 231489839 ^ n2;
                    int cfr_ignored_14 = Integer.rotateRight(0x283D8FCB ^ n2, 8) + -472774448;
                    n3 = 1260503509 * -595069141 + 231489839 ^ n2 ^ 0xAB11F12C ^ 0xAB11F12C;
                    n += 2;
                    continue block23;
                }
                case 1260503515: {
                    int cfr_ignored_15 = (Integer.rotateRight(0xCDEB5A13 ^ n2, 12) + -203585656) * -840213997;
                    n3 = -384132633 * -595069141 + 231489839 ^ n2;
                    int cfr_ignored_16 = Integer.rotateRight(0x17724E2F ^ n2, 5) - -617277716;
                    n3 = (1260503509 * -595069141 + 231489839 ^ n2) + -1586060624 - -1586060624;
                    --n;
                    continue block23;
                }
                case 1260503516: {
                    int cfr_ignored_17 = Integer.rotateRight(0xDC68F627 ^ n2, 14) - -1257017868;
                    n3 = Integer.reverse(Integer.reverse(-1177059660 * -595069141 + 231489839 ^ n2));
                    tb_2.sa_4(1738652192, n2);
                    int cfr_ignored_18 = (int)(0xF996C3997F4A7C15L ^ (long)n2 ^ 0x7A423227030C5EFCL);
                    try {
                        n -= 5;
                        if ((0x62928155FD5EBF6FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse(1260503509 * -595069141 + 231489839 ^ n2));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)(1260503509 * -595069141 + 231489839 ^ n2) ^ 0x63FDD497FB20554BL ^ 0x63FDD497FB20554BL);
                    }
                    n += 5;
                    continue block23;
                }
                case 1260503517: {
                    int cfr_ignored_19 = Integer.rotateRight(0x2D77F8A7 ^ n2, 8) - -2048607372;
                    n3 = (int)((long)(-859696735 * -595069141 + 231489839 ^ n2) ^ 0xD2120EEBC9B227A8L ^ 0xD2120EEBC9B227A8L);
                    int cfr_ignored_20 = (Integer.rotateLeft(0x18555F15 ^ n2, 6) - -155966778) * 408248085;
                    int cfr_ignored_21 = (int)(0xDAE7F12827D4EB4FL ^ (long)n2 ^ 0x1F20831A2DB8181EL);
                    n3 = -637685130 * -595069141 + 231489839 ^ n2;
                    int cfr_ignored_22 = Integer.rotateRight(0x3BD147CB ^ n2, 10) + 1119178960;
                    n3 = Integer.reverse(Integer.reverse(1260503509 * -595069141 + 231489839 ^ n2));
                    continue block23;
                }
                case 1260503518: {
                    int cfr_ignored_23 = Integer.rotateRight(0x1405C9AA ^ n2, 5) + 1896942289;
                    try {
                        --n;
                        if ((0x666A1C257B14963L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse(1260503509 * -595069141 + 231489839 ^ n2));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(Integer.reverse(1260503509 * -595069141 + 231489839 ^ n2));
                    }
                    --n;
                    continue block23;
                }
                case 1260503519: {
                    int cfr_ignored_24 = (Integer.rotateLeft(0x11F710D0 ^ n2, 5) + 826845291) * 301404369;
                    int cfr_ignored_25 = (int)(0x9DE1D42354D5C6ABL ^ (long)n2 ^ 0x5536651876709612L);
                    n3 = 1260503509 * -595069141 + 231489839 ^ n2;
                    n += 2;
                    continue block23;
                }
                case 1260503520: {
                    int cfr_ignored_26 = Integer.rotateLeft(0x14F4AF4C ^ n2, 5) - -1912678033;
                    n3 = 576423171 * -595069141 + 231489839 ^ n2;
                    int cfr_ignored_27 = (Integer.rotateLeft(0x9DBF3DB9 ^ n2, 6) + 512104610) * -1648411207;
                    int cfr_ignored_28 = (int)(0x5F0D938427D4EB4FL ^ (long)n2 ^ 0xDA78831A2DB913CAL);
                    n3 = 1260503509 * -595069141 + 231489839 ^ n2;
                    continue block23;
                }
            }
            int cfr_ignored_29 = (Integer.rotateLeft(0xBC727E11 ^ n2, 10) + -700783798) * -1133347311;
            int cfr_ignored_30 = (int)(0x7EC0D02C27D4EB4FL ^ (long)n2 ^ 0x5D28831A2DB95050L);
            n3 = (int)((long)(1260503509 * -595069141 + 231489839 ^ n2) ^ 0xEF60D930B2C79EF9L ^ 0xEF60D930B2C79EF9L);
        }
    }

    private void ghzk_2() {
        int n = 0;
        int n2 = -4345005;
        n2 = Integer.rotateLeft(n2 * 446897109, 10) ^ 0x83B94A8A;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = n2 - 564514124 ^ 0x7B580B41 ^ 0x7B580B41;
        block33: while (true) {
            switch (n2 - n3) {
                case -1799200955: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0xD071EBB8 ^ n2, 13) + 1109994115) * -797840455;
                    this.za = this.thrkh = bhz.mc.field_1724.method_36454();
                    this.hagh_2 = this.zkdh = bhz.zfq_2(bhz.mc.field_1724);
                    this.rsr = this.khwsh = bhz.bzw_2(this.rwt);
                    this.thha = 0.0f;
                    this.rrd_2 = 0.0f;
                    this.sh = false;
                    return;
                }
                case -263204534: {
                    int cfr_ignored_1 = Integer.rotateRight(0xBD7CEE2B ^ n2, 10) + -159484304;
                    throw null;
                }
                case 564514124: {
                    int cfr_ignored_2 = Integer.rotateLeft(0x414EDDA1 ^ n2, 11) + -320178758;
                    int cfr_ignored_3 = (int)(0x83FC739C27D4EB4FL ^ (long)n2 ^ 0x1A48831A2DB8AA29L);
                    if (bhz.ans()) {
                        try {
                            if ((0xB55323E740DA65B3L ^ (long)n2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n3 = n2 - -263204534;
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = n2 - -263204534 + -280259399 - -280259399;
                        }
                        n -= 5;
                        continue block33;
                    }
                    n3 = n2 - 1977473721 + 1485361645 - 1485361645;
                    int cfr_ignored_4 = (Integer.rotateRight(0xD0C5476 ^ n2, 4) - -1730422395) * 218911863;
                    continue block33;
                }
                case 1977473721: {
                    int cfr_ignored_5 = (Integer.rotateRight(0x230A39FB ^ n2, 7) + 1117430944) * 587872763;
                    if (bhz.mc.field_1724 != null) {
                        int cfr_ignored_6 = (int)(0xBF161A27E9B7C94BL ^ (long)n2 ^ 0xC93F1FDC69B0D3FDL);
                        n3 = (int)((long)(n2 - -1799200955) ^ 0xB966BE8B00DC5E4FL ^ 0xB966BE8B00DC5E4FL);
                        n += 2;
                        continue block33;
                    }
                    int cfr_ignored_7 = (int)(0xF56E028CBCE4F93EL ^ (long)n2 ^ 0xF869B57A095A470DL);
                    n3 = n2 - -1192428989 ^ 0xB9FF10E2 ^ 0xB9FF10E2;
                    n -= 4;
                    continue block33;
                }
                case -1192428989: {
                    int cfr_ignored_8 = Integer.rotateRight(0x5ED32E6 ^ n2, 3) - -1139357419;
                    return;
                }
                case -1286003177: {
                    int cfr_ignored_9 = (Integer.rotateLeft(0xD92906D1 ^ n2, 14) + 1347777162) * -651622703;
                    int cfr_ignored_10 = (int)(0x1B9BA8EC27D4EB4FL ^ (long)n2 ^ 0xACA8831A2DB99AE6L);
                    n3 = n2 - 743123992 ^ 0x39A57A62 ^ 0x39A57A62;
                    int cfr_ignored_11 = Integer.rotateRight(0xA934B102 ^ n2, 8) + -2118185351;
                    n3 = n2 - -453359202;
                    int cfr_ignored_12 = (Integer.rotateRight(0x1D715CDF ^ n2, 6) - -1793597892) * 493968607;
                    n3 = (int)((long)(n2 - 564514124) ^ 0xECCA3720498EB469L ^ 0xECCA3720498EB469L);
                    ++n;
                    continue block33;
                }
                case 119486175: {
                    int cfr_ignored_13 = Integer.rotateRight(0xAED2252E ^ n2, 8) - 802168781;
                    try {
                        n3 = n2 - 564514124;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - 564514124));
                    }
                    n -= 2;
                    continue block33;
                }
                case -1938701657: {
                    int cfr_ignored_14 = (Integer.rotateRight(0x8FB8C3B ^ n2, 4) + 450075232) * 150703163;
                    n3 = n2 - -1593924753;
                    int cfr_ignored_15 = Integer.rotateLeft(0xD7E35004 ^ n2, 13) - 686051255;
                    int cfr_ignored_16 = (int)(0x52774F501F53C858L ^ (long)n2 ^ 0x63D0F2146B97093FL);
                    n3 = n2 - 1593770793;
                    int cfr_ignored_17 = (int)(0xFC3933552D0BFFE2L ^ (long)n2 ^ 0x9BDA96A404E255A3L);
                    n3 = n2 - 564514124 ^ 0x690C7162 ^ 0x690C7162;
                    n -= 4;
                    continue block33;
                }
                case 1379063460: {
                    int cfr_ignored_18 = Integer.rotateRight(0x623A848E ^ n2, 15) - -378295187;
                    n3 = n2 - 1922288218 + -1037118805 - -1037118805;
                    int cfr_ignored_19 = Integer.rotateRight(0x594BAD2B ^ n2, 14) + -729311376;
                    n3 = Integer.reverse(Integer.reverse(n2 - 564514124));
                    n -= 2;
                    continue block33;
                }
                case -54119398: {
                    int cfr_ignored_20 = (Integer.rotateRight(0x768BDF3B ^ n2, 17) + 1598924640) * 1988878139;
                    n3 = Integer.reverse(Integer.reverse(n2 - -1118713455));
                    int cfr_ignored_21 = (Integer.rotateLeft(0xCAA8AAB5 ^ n2, 12) - -1899345114) * -894915915;
                    int cfr_ignored_22 = (int)(0x81A048827D4EB4FL ^ (long)n2 ^ 0xF460831A2DB9BDE5L);
                    try {
                        n += 5;
                        n3 = n2 - 564514124 ^ 0x469602C6 ^ 0x469602C6;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 - 564514124 ^ 0x8B43186A ^ 0x8B43186A;
                    }
                    n -= 4;
                    continue block33;
                }
                case 1736912360: {
                    int cfr_ignored_23 = Integer.rotateLeft(0x74B3FB2D ^ n2, 17) - 640223662;
                    int cfr_ignored_24 = (int)(0xB601551027D4EB4FL ^ (long)n2 ^ 0x5750831A2DB8C1D3L);
                    n3 = (int)((long)(n2 - 1133024955) ^ 0x3CCC4588FD6587F9L ^ 0x3CCC4588FD6587F9L);
                    int cfr_ignored_25 = Integer.rotateLeft(0xD40D5D28 ^ n2, 13) + -1308891373;
                    try {
                        if ((0x8A74571EF2982725L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (int)((long)(n2 - 564514124) ^ 0xC85D84B926713B26L ^ 0xC85D84B926713B26L);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 - 564514124 + 650634187 - 650634187;
                    }
                    n += 4;
                    continue block33;
                }
                case 138954367: {
                    int cfr_ignored_26 = (Integer.rotateLeft(0xB1B952F8 ^ n2, 9) + -1982944445) * -1313254663;
                    n3 = (int)((long)(n2 - 542534171) ^ 0xAFCE653B7B0E25EDL ^ 0xAFCE653B7B0E25EDL);
                    int cfr_ignored_27 = Integer.rotateRight(0xB8766C8E ^ n2, 10) - 1521796205;
                    n3 = Integer.reverse(Integer.reverse(n2 - -332202024));
                    int cfr_ignored_28 = (Integer.rotateRight(0x7EAD38DA ^ n2, 18) + 1532461473) * 2125281499;
                    n3 = n2 - 564514124;
                    continue block33;
                }
                case -1469146957: {
                    int cfr_ignored_29 = (Integer.rotateRight(0xE9F78772 ^ n2, 16) + 1498875401) * -369653901;
                    n3 = Integer.reverse(Integer.reverse(n2 - 906183735));
                    int cfr_ignored_30 = Integer.rotateLeft(0x8862E089 ^ n2, 4) + -2007576622;
                    int cfr_ignored_31 = (int)(0x4AD04EB427D4EB4FL ^ (long)n2 ^ 0x6018831A2DB93871L);
                    try {
                        ++n;
                        if ((0x5CC550DCAE2CCB81L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 - 564514124));
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 - 564514124;
                    }
                    continue block33;
                }
                case -1379153821: {
                    int cfr_ignored_32 = (Integer.rotateRight(0x427D045F ^ n2, 11) - 293676732) * 1115489375;
                    try {
                        n -= 2;
                        n3 = n2 - 564514124 ^ 0xAD02006E ^ 0xAD02006E;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)(n2 - 564514124) ^ 0xC7FFDFA4D875EAA9L ^ 0xC7FFDFA4D875EAA9L);
                    }
                    continue block33;
                }
                case -2139910788: {
                    int cfr_ignored_33 = (Integer.rotateLeft(0x5C14FC19 ^ n2, 14) + 719857218) * 1544879129;
                    int cfr_ignored_34 = (int)(0x9EA6522427D4EB4FL ^ (long)n2 ^ 0x5938831A2DB8909DL);
                    n3 = n2 - -784723629 + 1296966675 - 1296966675;
                    int cfr_ignored_35 = (Integer.rotateLeft(0x3D12229D ^ n2, 10) - 1771032638) * 1024598685;
                    int cfr_ignored_36 = (int)(0xFFA08CA027D4EB4FL ^ (long)n2 ^ 0xE430831A2DB85290L);
                    n3 = (int)((long)(n2 - 970636480) ^ 0xD3AD6CF40E32A595L ^ 0xD3AD6CF40E32A595L);
                    int cfr_ignored_37 = Integer.rotateRight(0xCC7F12EB ^ n2, 12) + -943658576;
                    n3 = n2 - 564514124;
                    n += 4;
                    continue block33;
                }
                case 922964972: {
                    int cfr_ignored_38 = (Integer.rotateLeft(0x95BC4CFC ^ n2, 5) - 640348607) * -1782821635;
                    try {
                        n += 3;
                        if ((0x59D92CE0AE6DBA0BL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (int)((long)(n2 - 564514124) ^ 0x735C5895F7BC647L ^ 0x735C5895F7BC647L);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)(n2 - 564514124) ^ 0x2390386A64564575L ^ 0x2390386A64564575L);
                    }
                    n += 5;
                    continue block33;
                }
                case 1208789390: {
                    int cfr_ignored_39 = (Integer.rotateRight(0x476AD037 ^ n2, 11) - -1437805084) * 1198182455;
                    n3 = n2 - 564514124 ^ 0x679E41AE ^ 0x679E41AE;
                    int cfr_ignored_40 = Integer.rotateLeft(0x67C287CD ^ n2, 15) - -1796468466;
                    int cfr_ignored_41 = (int)(0xA57029F027D4EB4FL ^ (long)n2 ^ 0xAE90831A2DB8E731L);
                    n -= 3;
                    continue block33;
                }
            }
            int cfr_ignored_42 = (Integer.rotateLeft(0xAD304615 ^ n2, 8) - -46785594) * -1389345259;
            int cfr_ignored_43 = (int)(0x6F82E82827D4EB4FL ^ (long)n2 ^ 0x2D20831A2DB972D4L);
            n3 = n2 - 564514124;
        }
    }

    private void tzgh_2() {
        if (bhz.mc.field_1724 == null) {
            return;
        }
        if (this.sh) {
            this.ghzk_2();
            return;
        }
        this.thrkh = this.za;
        this.zkdh = this.hagh_2;
        this.khwsh = this.rsr;
        this.rrd_2 = this.thha;
        float f = this.dhhj_2(this.rtn.thw_5());
        if (this.dhbk.shzl()) {
            this.za += class_3532.method_15393((float)(bhz.mc.field_1724.method_36454() - this.za)) * f;
            this.hagh_2 = class_3532.method_15363((float)(this.hagh_2 + (bhz.mc.field_1724.method_36455() - this.hagh_2) * f), (float)-90.0f, (float)90.0f);
        } else {
            this.za = bhz.mc.field_1724.method_36454();
            this.hagh_2 = bhz.mc.field_1724.method_36455();
        }
        this.rsr = this.sths_2.shzl() ? this.rsr + (this.rwt.thw_5() - this.rsr) * this.dhhj_2(this.sha.thw_5()) : this.rwt.thw_5();
        float f2 = 0.0f;
        if (this.bwl.shzl() && bhz.mc.field_1724.method_5715()) {
            f2 = -this.stdh.thw_5();
        }
        if (this.dsz_4.shzl() && !bhz.mc.field_1724.method_24828()) {
            f2 += (float)(-bhz.mc.field_1724.method_18798().field_1351 * (double)this.rsl.thw_5());
        }
        this.thha += (f2 - this.thha) * this.zdkh.thw_5();
    }

    private float dhhj_2(float f) {
        float f2 = 0.0f;
        int n = 0;
        int n2 = -1734897129;
        n2 = Integer.rotateLeft(n2 * -961102151, 16) ^ 0xE68C3CC6;
        int n3 = (int)((long)Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958) ^ 0x4030F0A6336540E6L ^ 0x4030F0A6336540E6L);
        while (true) {
            block50: {
                block74: {
                    block53: {
                        block59: {
                            block80: {
                                block57: {
                                    block61: {
                                        block77: {
                                            block73: {
                                                block68: {
                                                    block78: {
                                                        block47: {
                                                            block64: {
                                                                block79: {
                                                                    block82: {
                                                                        block63: {
                                                                            block54: {
                                                                                block62: {
                                                                                    block84: {
                                                                                        block67: {
                                                                                            block69: {
                                                                                                block72: {
                                                                                                    block49: {
                                                                                                        block85: {
                                                                                                            block48: {
                                                                                                                block52: {
                                                                                                                    block83: {
                                                                                                                        block55: {
                                                                                                                            block58: {
                                                                                                                                block71: {
                                                                                                                                    block81: {
                                                                                                                                        block75: {
                                                                                                                                            block76: {
                                                                                                                                                block65: {
                                                                                                                                                    block70: {
                                                                                                                                                        block66: {
                                                                                                                                                            block44: {
                                                                                                                                                                block60: {
                                                                                                                                                                    block56: {
                                                                                                                                                                        block45: {
                                                                                                                                                                            block51: {
                                                                                                                                                                                block46: {
                                                                                                                                                                                    if ((n = Integer.reverse(n3) ^ n2 ^ 0x23291958) > 127587356) break block44;
                                                                                                                                                                                    if (n > -902210357) break block45;
                                                                                                                                                                                    if (n > -1738032756) break block46;
                                                                                                                                                                                    if (n == -1936449280) break block47;
                                                                                                                                                                                    if (n == -1793926013) break block48;
                                                                                                                                                                                    int cfr_ignored_0 = (Integer.rotateRight(0xC51F4997 ^ n2, 11) - -483948412) * -987805289;
                                                                                                                                                                                    if (n == -1738032756) break block49;
                                                                                                                                                                                    break block50;
                                                                                                                                                                                }
                                                                                                                                                                                if (n > -1460236798) break block51;
                                                                                                                                                                                if (n == -1508495520) break block52;
                                                                                                                                                                                if (n == -1460236798) break block53;
                                                                                                                                                                                break block50;
                                                                                                                                                                            }
                                                                                                                                                                            if (n == -937385740) break block54;
                                                                                                                                                                            if (n == -902210357) break block55;
                                                                                                                                                                            int cfr_ignored_1 = (Integer.rotateRight(0x78350B13 ^ n2, 18) + -1832257912) * 2016742163;
                                                                                                                                                                            break block50;
                                                                                                                                                                        }
                                                                                                                                                                        if (n > -514754975) break block56;
                                                                                                                                                                        if (n == -736902654) break block57;
                                                                                                                                                                        if (n == -690326108) break block58;
                                                                                                                                                                        if (n == -514754975) break block59;
                                                                                                                                                                        break block50;
                                                                                                                                                                    }
                                                                                                                                                                    if (n > -174737867) break block60;
                                                                                                                                                                    if (n == -222863601) break block61;
                                                                                                                                                                    if (n == -174737867) break block62;
                                                                                                                                                                    break block50;
                                                                                                                                                                }
                                                                                                                                                                if (n == -141113551) break block63;
                                                                                                                                                                if (n == 127587356) break block64;
                                                                                                                                                                int cfr_ignored_2 = Integer.rotateRight(0x4666814B ^ n2, 11) + -1966651568;
                                                                                                                                                                break block50;
                                                                                                                                                            }
                                                                                                                                                            if (n > 862122482) break block65;
                                                                                                                                                            if (n > 485268440) break block66;
                                                                                                                                                            if (n == 306515281) break block67;
                                                                                                                                                            if (n == 0x1C221C2C) break block68;
                                                                                                                                                            if (n == 485268440) break block69;
                                                                                                                                                            break block50;
                                                                                                                                                        }
                                                                                                                                                        if (n > 730522448) break block70;
                                                                                                                                                        if (n == 578629968) break block71;
                                                                                                                                                        if (n == 730522448) break block72;
                                                                                                                                                        int cfr_ignored_3 = Integer.rotateRight(0xC4CA8723 ^ n2, 11) + -656147336;
                                                                                                                                                        break block50;
                                                                                                                                                    }
                                                                                                                                                    if (n == 793328138) break block73;
                                                                                                                                                    if (n == 862122482) break block74;
                                                                                                                                                    break block50;
                                                                                                                                                }
                                                                                                                                                if (n > 1636104862) break block75;
                                                                                                                                                if (n > 1078003516) break block76;
                                                                                                                                                if (n == 1060083187) break block77;
                                                                                                                                                if (n == 1078003516) break block78;
                                                                                                                                                break block50;
                                                                                                                                            }
                                                                                                                                            if (n == 1631516260) break block79;
                                                                                                                                            if (n == 1636104862) break block80;
                                                                                                                                            int cfr_ignored_4 = Integer.rotateRight(0xB369FEE ^ n2, 4) - 1610284301;
                                                                                                                                            break block50;
                                                                                                                                        }
                                                                                                                                        if (n > 1853083949) break block81;
                                                                                                                                        if (n == 1752165039) break block82;
                                                                                                                                        if (n == 1853083949) break block83;
                                                                                                                                        break block50;
                                                                                                                                    }
                                                                                                                                    if (n == 2041144169) break block84;
                                                                                                                                    if (n == 2101522064) break block85;
                                                                                                                                    break block50;
                                                                                                                                }
                                                                                                                                int cfr_ignored_5 = (Integer.rotateLeft(0xF883AABD ^ n2, 18) - 474958878) * -125588803;
                                                                                                                                int cfr_ignored_6 = (int)(0x3A31048027D4EB4FL ^ (long)n2 ^ 0xF470831A2DB9D9B3L);
                                                                                                                                if (bhz.dghd(this.zbd_2) == this.tdt_2) {
                                                                                                                                    try {
                                                                                                                                        ++n;
                                                                                                                                        n3 = Integer.reverse(n2 ^ 0xD6DA75A4 ^ 0x23291958) + -1576358450 - -1576358450;
                                                                                                                                    }
                                                                                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                                                        n3 = (int)((long)Integer.reverse(n2 ^ 0xD6DA75A4 ^ 0x23291958) ^ 0xBA28C0C44586B47L ^ 0xBA28C0C44586B47L);
                                                                                                                                    }
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    n += 3;
                                                                                                                                    if ((0xC1C7C4CBF01496EBL ^ (long)n2 | 1L) == 0L) {
                                                                                                                                        throw new NoSuchElementException();
                                                                                                                                    }
                                                                                                                                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x12450D51 ^ 0x23291958)));
                                                                                                                                }
                                                                                                                                catch (NoSuchElementException noSuchElementException) {
                                                                                                                                    n3 = Integer.reverse(n2 ^ 0x12450D51 ^ 0x23291958) ^ 0xE2F9B784 ^ 0xE2F9B784;
                                                                                                                                }
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            int cfr_ignored_7 = Integer.rotateLeft(0xE9688305 ^ n2, 16) - 1208319190;
                                                                                                                            int cfr_ignored_8 = (int)(0x2BDA2D3827D4EB4FL ^ (long)n2 ^ 0xA700831A2DB9FA65L);
                                                                                                                            f2 = Math.min(f * Float.intBitsToFloat(-651091859 - -1720639379), 1.0f);
                                                                                                                            try {
                                                                                                                                n += 2;
                                                                                                                                if ((0xC37187A09DC30B17L ^ (long)n2 | 1L) == 0L) {
                                                                                                                                    throw new ArithmeticException();
                                                                                                                                }
                                                                                                                                n3 = (int)((long)Integer.reverse(n2 ^ 0x3362F1F2 ^ 0x23291958) ^ 0x6365B90C7DB02F0EL ^ 0x6365B90C7DB02F0EL);
                                                                                                                            }
                                                                                                                            catch (ArithmeticException arithmeticException) {
                                                                                                                                n3 = Integer.reverse(n2 ^ 0x3362F1F2 ^ 0x23291958);
                                                                                                                            }
                                                                                                                            n += 3;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        int cfr_ignored_9 = Integer.rotateRight(0x9BF4E34F ^ n2, 6) - -419093044;
                                                                                                                        if (this.zbd_2.sdh_2() != this.zsj_2) {
                                                                                                                            int cfr_ignored_10 = (int)(0xBE2BB761AB39EC8CL ^ (long)n2 ^ 0x93B39AC0223ED186L);
                                                                                                                            n3 = Integer.reverse(n2 ^ 0xACF462AE ^ 0x23291958) + -1559364117 - -1559364117;
                                                                                                                            int cfr_ignored_11 = (int)(0xFF912529F9917F3AL ^ (long)n2 ^ 0xB7233F91055252F3L);
                                                                                                                            n3 = Integer.reverse(n2 ^ 0x7D42AE90 ^ 0x23291958) + 939029314 - 939029314;
                                                                                                                            ++n;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        n3 = Integer.reverse(n2 ^ 0x1786EF7B ^ 0x23291958) + -487452130 - -487452130;
                                                                                                                        int cfr_ignored_12 = (Integer.rotateLeft(0xE3174935 ^ n2, 15) - -2077262682) * -485013195;
                                                                                                                        int cfr_ignored_13 = (int)(0x21A5E70827D4EB4FL ^ (long)n2 ^ 0x3360831A2DB9EE9AL);
                                                                                                                        n3 = (int)((long)Integer.reverse(n2 ^ 0x9867B98C ^ 0x23291958) ^ 0xEEE052FA4F20E52AL ^ 0xEEE052FA4F20E52AL);
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    int cfr_ignored_14 = (Integer.rotateRight(0x5DA8D972 ^ n2, 14) + 1540355081) * 1571346803;
                                                                                                                    yf.athz_2();
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                int cfr_ignored_15 = Integer.rotateRight(0xF3DA74C2 ^ n2, 17) + -1949187399;
                                                                                                                if (!bhz.zygh()) {
                                                                                                                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x6E73D12D ^ 0x23291958)));
                                                                                                                    continue;
                                                                                                                }
                                                                                                                try {
                                                                                                                    n += 5;
                                                                                                                    if ((0x6448E624A54789A5L ^ (long)n2 | 1L) == 0L) {
                                                                                                                        throw new NoSuchElementException();
                                                                                                                    }
                                                                                                                    n3 = Integer.reverse(n2 ^ 0x227D3150 ^ 0x23291958);
                                                                                                                }
                                                                                                                catch (NoSuchElementException noSuchElementException) {
                                                                                                                    n3 = Integer.reverse(n2 ^ 0x227D3150 ^ 0x23291958) ^ 0x9785B8E5 ^ 0x9785B8E5;
                                                                                                                }
                                                                                                                --n;
                                                                                                                continue;
                                                                                                            }
                                                                                                            int cfr_ignored_16 = Integer.rotateLeft(0x437CB28D ^ n2, 11) - 813121102;
                                                                                                            int cfr_ignored_17 = (int)(0x81CE1CB027D4EB4FL ^ (long)n2 ^ 0xC410831A2DB8AE4DL);
                                                                                                            if (!bhz.zygh()) {
                                                                                                                try {
                                                                                                                    n += 5;
                                                                                                                    if ((0x9B29FE6E47617E11L ^ (long)n2 | 1L) == 0L) {
                                                                                                                        throw new ArithmeticException();
                                                                                                                    }
                                                                                                                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x6E73D12D ^ 0x23291958)));
                                                                                                                }
                                                                                                                catch (ArithmeticException arithmeticException) {
                                                                                                                    n3 = Integer.reverse(n2 ^ 0x6E73D12D ^ 0x23291958);
                                                                                                                }
                                                                                                                n += 2;
                                                                                                                continue;
                                                                                                            }
                                                                                                            try {
                                                                                                                --n;
                                                                                                                if ((0x3541A1CA7BA10E75L ^ (long)n2 | 1L) == 0L) {
                                                                                                                    throw new ArithmeticException();
                                                                                                                }
                                                                                                                n3 = Integer.reverse(n2 ^ 0x227D3150 ^ 0x23291958) + -1841897724 - -1841897724;
                                                                                                            }
                                                                                                            catch (ArithmeticException arithmeticException) {
                                                                                                                n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x227D3150 ^ 0x23291958)));
                                                                                                            }
                                                                                                            n -= 4;
                                                                                                            continue;
                                                                                                        }
                                                                                                        int cfr_ignored_18 = (Integer.rotateRight(0x89D5425F ^ n2, 4) - -1255102276) * -1982512545;
                                                                                                        if (bhz.tdhf(this.zbd_2) != this.bmt_2) {
                                                                                                            n3 = Integer.reverse(n2 ^ 0xF595B635 ^ 0x23291958) + 600768706 - 600768706;
                                                                                                            ++n;
                                                                                                            continue;
                                                                                                        }
                                                                                                        n3 = Integer.reverse(n2 ^ 0x79A96369 ^ 0x23291958) + -96736080 - -96736080;
                                                                                                        int cfr_ignored_19 = Integer.rotateRight(0xDBBC2922 ^ n2, 14) + -1608082855;
                                                                                                        n -= 2;
                                                                                                        continue;
                                                                                                    }
                                                                                                    int cfr_ignored_20 = Integer.rotateLeft(0x7AF602AD ^ n2, 18) - -400035282;
                                                                                                    int cfr_ignored_21 = (int)(0xB844AC9027D4EB4FL ^ (long)n2 ^ 0xA450831A2DB8DD58L);
                                                                                                    f2 = (float)(1.0 - bhz.ghthz(1.0f - f, bhz.jnb(0x509FF16598FBCD9AL ^ 0x109FF16598FBCD9AL)));
                                                                                                    int cfr_ignored_22 = (int)(0x5599BFE1E9DEB68EL ^ (long)n2 ^ 0x82B31F0E963B06E2L);
                                                                                                    n3 = Integer.reverse(n2 ^ 0x3362F1F2 ^ 0x23291958);
                                                                                                    n -= 2;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_23 = Integer.rotateRight(0x593E938F ^ n2, 14) - -755925620;
                                                                                                f2 = 2.0f * f * f;
                                                                                                n3 = Integer.reverse(n2 ^ 0xB61CF617 ^ 0x23291958) + -920399382 - -920399382;
                                                                                                int cfr_ignored_24 = Integer.rotateLeft(0xE186F6AC ^ n2, 15) - 1404403215;
                                                                                                n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x3362F1F2 ^ 0x23291958)));
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_25 = Integer.rotateRight(0x365CE542 ^ n2, 9) + -1717738951;
                                                                                            f2 = f * (1.0f + (float)Math.sin((double)f * Double.longBitsToDouble(0x9AB774863918244CL ^ 0xDABE557D6D5C0954L)) * bhz.sash_4(Integer.reverse(1834550829) ^ 0x89AC567B));
                                                                                            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xCB480F85 ^ 0x23291958)));
                                                                                            int cfr_ignored_26 = (Integer.rotateLeft(0x4782A638 ^ n2, 11) + -1389379581) * 1199744569;
                                                                                            n3 = Integer.reverse(n2 ^ 0x3362F1F2 ^ 0x23291958) + -2033225488 - -2033225488;
                                                                                            n += 2;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_27 = (Integer.rotateRight(0x5973881E ^ n2, 14) - -648340771) * 1500743711;
                                                                                        if (this.zbd_2.sdh_2() != this.thkhf) {
                                                                                            n3 = Integer.reverse(n2 ^ 0xF84C0836 ^ 0x23291958) + -1712190280 - -1712190280;
                                                                                            int cfr_ignored_28 = (Integer.rotateLeft(0x1FB68494 ^ n2, 6) - -612913881) * 532055189;
                                                                                            n3 = Integer.reverse(n2 ^ 0xCA395CCB ^ 0x23291958);
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_29 = (int)(0x1FCB160D1B572FDL ^ (long)n2 ^ 0x9FB16FD91EDDAE28L);
                                                                                        n3 = Integer.reverse(n2 ^ 0x1CEC9BD8 ^ 0x23291958) + 462824896 - 462824896;
                                                                                        n += 3;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_30 = (Integer.rotateRight(0xD4D1433B ^ n2, 13) + -910900384) * -724483269;
                                                                                    if (f < Float.intBitsToFloat(Integer.rotateLeft(0xBF1C47A8 ^ 0xBF1C4048, 19))) {
                                                                                        int cfr_ignored_31 = (int)(0x5A473B2A4F6C281DL ^ (long)n2 ^ 0x8B24526BAB1D195FL);
                                                                                        n3 = Integer.reverse(n2 ^ 0x2B8AE350 ^ 0x23291958) ^ 0x93ABEAD1 ^ 0x93ABEAD1;
                                                                                        n -= 5;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_32 = (int)(0x3E7ED02B3C75E3ACL ^ (long)n2 ^ 0x5D26B4583C7FD12CL);
                                                                                    n3 = Integer.reverse(n2 ^ 0xC3CC9DFA ^ 0x23291958);
                                                                                    int cfr_ignored_33 = (int)(0x37E58A147285D840L ^ (long)n2 ^ 0xE95829B84BA7C21AL);
                                                                                    n3 = Integer.reverse(n2 ^ 0xC820A0F4 ^ 0x23291958) + 788370684 - 788370684;
                                                                                    n -= 5;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_34 = Integer.rotateLeft(0x8BD16980 ^ n2, 4) + -222730821;
                                                                                f2 = f;
                                                                                try {
                                                                                    n += 4;
                                                                                    if ((0xA58BB88B5335B967L ^ (long)n2 | 1L) == 0L) {
                                                                                        throw new IllegalArgumentException();
                                                                                    }
                                                                                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x3362F1F2 ^ 0x23291958)));
                                                                                }
                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                    n3 = (int)((long)Integer.reverse(n2 ^ 0x3362F1F2 ^ 0x23291958) ^ 0xEC86BB203F4C365CL ^ 0xEC86BB203F4C365CL);
                                                                                }
                                                                                n += 2;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_35 = (Integer.rotateRight(0x8E4302DA ^ n2, 4) + 1048246177) * -1908210981;
                                                                            f2 = 1.0f - (float)Math.pow(bhz.thhn_2(0x18F6C89C ^ 0xD8F6C89C) * f + 2.0f, Double.longBitsToDouble(0x605B7FF39FBF77D0L ^ 0x205B7FF39FBF77D0L)) / 2.0f;
                                                                            n3 = Integer.reverse(n2 ^ 0x9EDD67CF ^ 0x23291958) + 707947477 - 707947477;
                                                                            int cfr_ignored_36 = (Integer.rotateLeft(0x5A289478 ^ n2, 14) + -280520253) * 1512608889;
                                                                            n3 = Integer.reverse(n2 ^ 0x3362F1F2 ^ 0x23291958);
                                                                            n += 5;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_37 = Integer.rotateLeft(0x6AFDC104 ^ n2, 16) - -115867977;
                                                                        n3 = Integer.reverse(n2 ^ 0x90326EE1 ^ 0x23291958) ^ 0x35EEDDBE ^ 0x35EEDDBE;
                                                                        int cfr_ignored_38 = Integer.rotateLeft(0xDF727BA5 ^ n2, 14) - 322607158;
                                                                        int cfr_ignored_39 = (int)(0x1DC0D59827D4EB4FL ^ (long)n2 ^ 0x5640831A2DB99650L);
                                                                        try {
                                                                            n3 = Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958) ^ 0x8856A201 ^ 0x8856A201;
                                                                        }
                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                            n3 = Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958) ^ 0xAB338DE4 ^ 0xAB338DE4;
                                                                        }
                                                                        n -= 3;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_40 = (Integer.rotateRight(0xB4C620D2 ^ n2, 9) + -396650327) * -1262083885;
                                                                    n3 = (int)((long)Integer.reverse(n2 ^ 0x3136283A ^ 0x23291958) ^ 0x3FC3D05DAACACAA4L ^ 0x3FC3D05DAACACAA4L);
                                                                    int cfr_ignored_41 = (Integer.rotateLeft(0xB724043D ^ n2, 9) - 834282142) * -1222376387;
                                                                    int cfr_ignored_42 = (int)(0x7596AA0027D4EB4FL ^ (long)n2 ^ 0xA970831A2DB946FCL);
                                                                    n3 = Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958);
                                                                    n += 3;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_43 = Integer.rotateRight(0xEADBE322 ^ n2, 16) + 1962811481;
                                                                n3 = (int)((long)Integer.reverse(n2 ^ 0x13CA00FE ^ 0x23291958) ^ 0xFA6B28AEAA2145E0L ^ 0xFA6B28AEAA2145E0L);
                                                                int cfr_ignored_44 = Integer.rotateRight(0xDED57E0E ^ n2, 14) - 3662573;
                                                                n3 = Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958) ^ 0x577041AA ^ 0x577041AA;
                                                                n += 4;
                                                                continue;
                                                            }
                                                            int cfr_ignored_45 = Integer.rotateRight(0x7A948B62 ^ n2, 18) + -598048743;
                                                            n3 = Integer.reverse(n2 ^ 0x598183E0 ^ 0x23291958) + -220471678 - -220471678;
                                                            int cfr_ignored_46 = Integer.rotateRight(0x66266B0A ^ n2, 15) + 1661244785;
                                                            n3 = Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958);
                                                            int cfr_ignored_47 = Integer.rotateRight(0xF5430906 ^ n2, 17) - -1216629003;
                                                            continue;
                                                        }
                                                        int cfr_ignored_48 = Integer.rotateLeft(0x85A31065 ^ n2, 3) - 857512822;
                                                        int cfr_ignored_49 = (int)(0x4711BE5827D4EB4FL ^ (long)n2 ^ 0x81C0831A2DB923F2L);
                                                        try {
                                                            ++n;
                                                            if ((0x8D8782AFE81920C7L ^ (long)n2 | 1L) == 0L) {
                                                                throw new UnsupportedOperationException();
                                                            }
                                                            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958)));
                                                        }
                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                            n3 = Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958) + -1121204282 - -1121204282;
                                                        }
                                                        n += 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_50 = Integer.rotateRight(0x44E9A5E3 ^ n2, 11) + 1554560440;
                                                    try {
                                                        n -= 2;
                                                        if ((0x79081DA25168559FL ^ (long)n2 | 1L) == 0L) {
                                                            throw new IllegalArgumentException();
                                                        }
                                                        n3 = Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958) + 1548675820 - 1548675820;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        n3 = Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958) + 55168548 - 55168548;
                                                    }
                                                    continue;
                                                }
                                                int cfr_ignored_51 = Integer.rotateLeft(0xDBC78760 ^ n2, 14) + -1584987173;
                                                n3 = Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958) ^ 0xA18850F9 ^ 0xA18850F9;
                                                int cfr_ignored_52 = Integer.rotateLeft(0xCC893F88 ^ n2, 12) + -922988365;
                                                n -= 3;
                                                continue;
                                            }
                                            int cfr_ignored_53 = (Integer.rotateLeft(0xD15F1D54 ^ n2, 13) - 1591880807) * -782295723;
                                            n3 = (int)((long)Integer.reverse(n2 ^ 0xA0D421A2 ^ 0x23291958) ^ 0x3A88D43EF56E1773L ^ 0x3A88D43EF56E1773L);
                                            int cfr_ignored_54 = (Integer.rotateLeft(0xCBAE97DC ^ n2, 12) - -1367211297) * -877750307;
                                            try {
                                                n -= 4;
                                                n3 = Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958) + -1349703197 - -1349703197;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958)));
                                            }
                                            n -= 4;
                                            continue;
                                        }
                                        int cfr_ignored_55 = (Integer.rotateRight(0xC0B31F7E ^ n2, 11) - 1510895485) * -1062002817;
                                        n3 = Integer.reverse(n2 ^ 0xBD150A60 ^ 0x23291958) + -1520261039 - -1520261039;
                                        int cfr_ignored_56 = Integer.rotateRight(0xFCF1A66B ^ n2, 18) + -1516190160;
                                        n3 = Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958) + 612201818 - 612201818;
                                        n -= 4;
                                        continue;
                                    }
                                    int cfr_ignored_57 = Integer.rotateLeft(0x8907D6A8 ^ n2, 4) + -1672438381;
                                    n3 = Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958);
                                    n -= 2;
                                    continue;
                                }
                                int cfr_ignored_58 = (Integer.rotateLeft(0xBCCF3390 ^ n2, 10) + -512434773) * -1127271535;
                                try {
                                    n += 5;
                                    if ((0xB25C384076FC62BL ^ (long)n2 | 1L) == 0L) {
                                        throw new NoSuchElementException();
                                    }
                                    n3 = Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958) + -2024687654 - -2024687654;
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    n3 = (int)((long)Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958) ^ 0xAC6092B987A8955AL ^ 0xAC6092B987A8955AL);
                                }
                                continue;
                            }
                            int cfr_ignored_59 = Integer.rotateLeft(0x285CD700 ^ n2, 8) + -409229253;
                            int cfr_ignored_60 = (int)(0x3A50DCF261B8B8AAL ^ (long)n2 ^ 0x44940FC28A73D970L);
                            n3 = (int)((long)Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958) ^ 0xB58D0A64F8B308D4L ^ 0xB58D0A64F8B308D4L);
                            n -= 5;
                            continue;
                        }
                        int cfr_ignored_61 = Integer.rotateLeft(0x37871FE5 ^ n2, 9) - -1111852042;
                        int cfr_ignored_62 = (int)(0xF535B1D827D4EB4FL ^ (long)n2 ^ 0x9EC0831A2DB847BAL);
                        n3 = Integer.reverse(n2 ^ 0xE2696AC0 ^ 0x23291958) + -808159965 - -808159965;
                        int cfr_ignored_63 = Integer.rotateLeft(0xAE04B7E4 ^ n2, 8) - 384820183;
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x42D63704 ^ 0x23291958)));
                        int cfr_ignored_64 = Integer.rotateRight(0xE0758383 ^ n2, 15) + 848858136;
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958)));
                        --n;
                        continue;
                    }
                    int cfr_ignored_65 = Integer.rotateRight(0xBF077CEA ^ n2, 10) + 642105233;
                    n3 = Integer.reverse(n2 ^ 0xD0A2CE05 ^ 0x23291958);
                    int cfr_ignored_66 = (Integer.rotateLeft(0x46726A99 ^ n2, 11) + -1942452286) * 1181903513;
                    int cfr_ignored_67 = (int)(0x84C0C4A427D4EB4FL ^ (long)n2 ^ 0x7438831A2DB8A450L);
                    try {
                        if ((0xCB9B70391017B393L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958) ^ 0x9603238C ^ 0x9603238C;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958) ^ 0xF635BDCFE911355L ^ 0xF635BDCFE911355L);
                    }
                    n += 3;
                    continue;
                }
                return f2;
            }
            int cfr_ignored_68 = (Integer.rotateRight(0xA83F49FA ^ n2, 8) + 1678218369) * -1472247301;
            n3 = Integer.reverse(n2 ^ 0xA6162F60 ^ 0x23291958);
        }
    }

    private void tzh_2(btt btt2) {
        boolean bl;
        int n = tb_2.ams_2(1431407893);
        int n2 = n ^ 0xFD1C4CEC;
        if ((n2 ^ n) != -48476948) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xA84DC1F9 ^ n, 8) + 1707613282) * -1471299079;
            int cfr_ignored_1 = (int)(0x6AFF6FC427D4EB4FL ^ (long)n ^ 0x22F8831A2DB9782FL);
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        if (bhz.mc.field_1724 == null || bhz.mc.field_1687 == null || bhz.mc.field_1690 == null) {
            return;
        }
        boolean bl2 = bl = !bhz.mc.field_1690.method_31044().method_31034();
        if (bl && !this.jz_2) {
            this.ghzk_2();
        }
        if (!bl && this.jz_2) {
            this.sh = true;
        }
        this.jz_2 = bl;
        if (bl) {
            this.tzgh_2();
        }
    }

    private boolean bha_3() {
        try {
            int n = -856210080;
            n = Integer.rotateLeft(n * 1188991671, 12) ^ 0x97E4193A;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 15);
            int n2 = n ^ 0xE3F85935;
            if ((n2 ^ n) != -470263499) {
                int cfr_ignored_0 = (0x2F0F1C55 ^ n) + -582515883;
            }
            if ((0x2F3 & 0) != 0) {
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
        return !this.dsz_4.shzl();
    }

    private boolean thhb() {
        try {
            int n = -462481435;
            n = Integer.rotateLeft(n * 2057223067, 5) ^ 0x156524CA;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 15);
            int n2 = n ^ 0xC4A29DA4;
            if ((n2 ^ n) != -995975772) {
                int cfr_ignored_0 = (0x20CD8A41 ^ n) + 1702527439;
            }
            if ((0x266 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.bwl.shzl();
    }

    private static String atsh_2(String string, int n, int n2, int n3) {
        try {
            int n4 = 1206091258;
            n4 = Integer.rotateLeft(n4 * 1476763359, 24) ^ 0xD3FDF961;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            n4 = n ^ n4;
            int n5 = n4 ^ 0xB5683DF0;
            if ((n5 ^ n4) != -1251459600) {
                int cfr_ignored_0 = (0xF28B400A ^ n4) - 371656034;
            }
            if ((0x337 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x5304196B) + i ^ shkht_2, 25) ^ n2 + sskh));
        }
        return new String(cArray);
    }

    private static boolean bfa() {
        block0: {
            int n = 1165649625;
            int n2 = (n = Integer.rotateLeft(n * -502108195, 4) ^ 0x2DF848E2) ^ 0xB2C55CD;
            if ((n2 ^ n) == 187454925) break block0;
            int cfr_ignored_0 = (0x4E563314 ^ n) + 1108289911;
        }
        return yf.khdha_2();
    }

    private static void sagh_4() {
        int n = -1845957605;
        int n2 = (n = Integer.rotateLeft(n * -1698019855, 13) ^ 0x80ACA1C6) ^ 0xA4E74BC2;
        if ((n2 ^ n) != -1528345662) {
            int cfr_ignored_0 = (0x351FA7D9 ^ n) + 1363045256;
        }
        yf.athz_2();
    }

    private static void zks() {
        int n = tb_2.ams_2(-64001647);
        int n2 = n ^ 0xF63B5051;
        if ((n2 ^ n) != -163884975) {
            int cfr_ignored_0 = Integer.rotateLeft(0xA1439C0 ^ n, 4) + 1020304763;
        }
        yf.athz_2();
    }

    private static boolean bnr(badh_2 badh2) {
        block0: {
            int n = 1800768390;
            n = Integer.rotateLeft(n * -479387097, 20) ^ 0xF8B478A8;
            badh_2 badh3 = badh2;
            n = (badh3 != null ? System.identityHashCode(badh3) : 0) ^ n;
            int n2 = n ^ 0xAEE0FF85;
            if ((n2 ^ n) == -1360986235) break block0;
            int cfr_ignored_0 = (0xC5B57403 ^ n) + 1188964024;
        }
        return badh2.shzl();
    }

    private static boolean dtsh(badh_2 badh2) {
        block0: {
            int n = 620930457;
            n = Integer.rotateLeft(n * -1824731735, 28) ^ 0x2C48A357;
            badh_2 badh3 = badh2;
            n = (badh3 != null ? System.identityHashCode(badh3) : 0) ^ n;
            int n2 = n ^ 0xB68999F3;
            if ((n2 ^ n) == -1232496141) break block0;
            int cfr_ignored_0 = (0x938B3C6A ^ n) - 540823313;
        }
        return badh2.shzl();
    }

    private static float thz_6(int n) {
        block0: {
            int n2 = -2099104897;
            int n3 = (n2 = Integer.rotateLeft(n2 * 891082923, 27) ^ 0xA6EDB1D7) ^ 0x8898169A;
            if ((n3 ^ n2) == -2003298662) break block0;
            int cfr_ignored_0 = (0xA7A25E5 ^ n2) - 1597236323;
        }
        return Float.intBitsToFloat(n);
    }

    private static boolean ans() {
        block0: {
            int n = tb_2.ams_2(-746753254);
            int n2 = n ^ 0xAABDB192;
            if ((n2 ^ n) == -1430408814) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x79C0C288 ^ n, 18) + -1028313677;
        }
        return yf.dnkh();
    }

    private static float zfq_2(class_746 class_7462) {
        block0: {
            int n = tb_2.ams_2(-2019971987);
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0xA6D62E08;
            if ((n2 ^ n) == -1495912952) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x214F8265 ^ n, 7) - 217999734;
            int cfr_ignored_1 = (int)(0xE3FD2C5827D4EB4FL ^ (long)n ^ 0xA5C0831A2DB86A2BL);
        }
        return class_7462.method_36455();
    }

    private static float bzw_2(tay tay2) {
        block0: {
            int n = tb_2.ams_2(-1199257836);
            int n2 = n ^ 0x41EBFC06;
            if ((n2 ^ n) == 1105984518) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xF96F3B12 ^ n, 18) + 953534057) * -110150893;
        }
        return tay2.thw_5();
    }

    private static boolean zygh() {
        block0: {
            int n = -2045512436;
            int n2 = (n = Integer.rotateLeft(n * 1947445327, 5) ^ 0x6E11F898) ^ 0xB2C5E978;
            if ((n2 ^ n) == -1295652488) break block0;
            int cfr_ignored_0 = (0x34D61C74 ^ n) + -571154112;
        }
        return yf.khdha_2();
    }

    private static fy dghd(khd khd2) {
        block0: {
            int n = tb_2.ams_2(1496569462);
            int n2 = n ^ 0x9B7AA86A;
            if ((n2 ^ n) == -1686460310) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xC2497E1C ^ n, 11) - -1958484833) * -1035370979;
        }
        return khd2.sdh_2();
    }

    private static float sash_4(int n) {
        block0: {
            int n2 = 1385926009;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1617540153, 6) ^ 0x2A803AA5) ^ 0xB0834D11;
            if ((n3 ^ n2) == -1333572335) break block0;
            int cfr_ignored_0 = (0xE218C068 ^ n2) - 1372031011;
        }
        return Float.intBitsToFloat(n);
    }

    private static double jnb(long l) {
        block0: {
            int n = tb_2.ams_2(1703888461);
            int n2 = n ^ 0xF91E339E;
            if ((n2 ^ n) == -115461218) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x9C9175D3 ^ n, 6) + -100998200) * -1668188717;
        }
        return Double.longBitsToDouble(l);
    }

    private static double ghthz(double d, double d2) {
        block0: {
            int n = -1260096317;
            n = Integer.rotateLeft(n * -1513956265, 25) ^ 0x4E39F1CB;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 10);
            int n2 = n ^ 0x80941F85;
            if ((n2 ^ n) == -2137776251) break block0;
            int cfr_ignored_0 = (0x34706B46 ^ n) - -930019893;
        }
        return Math.pow(d, d2);
    }

    private static fy tdhf(khd khd2) {
        block0: {
            int n = -589524339;
            int n2 = (n = Integer.rotateLeft(n * 413338365, 22) ^ 0x85B82B2B) ^ 0x5BBE3BBC;
            if ((n2 ^ n) == 1539193788) break block0;
            int cfr_ignored_0 = (0x8762A931 ^ n) - 1147256630;
        }
        return khd2.sdh_2();
    }

    private static float thhn_2(int n) {
        block0: {
            int n2 = 531628912;
            int n3 = (n2 = Integer.rotateLeft(n2 * -590686995, 16) ^ 0x29B6FB26) ^ 0xD1B3F983;
            if ((n3 ^ n2) == -776734333) break block0;
            int cfr_ignored_0 = (0xCE03FAF3 ^ n2) - -625207192;
        }
        return Float.intBitsToFloat(n);
    }

    private static String[] zmj(String string) {
        int n = -549357420;
        int n2 = (n = Integer.rotateLeft(n * 884180189, 12) ^ 0x53290337) ^ 0x6E0D21A;
        if ((n2 ^ n) != 115397146) {
            int cfr_ignored_0 = (0xD9A1AA8E ^ n) - -2038132986;
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

    private static CallSite ssa_8(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 530066827;
            n3 = Integer.rotateLeft(n3 * 1453174975, 27) ^ 0x314C4545;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 9);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 18);
            int n4 = n3 ^ 0xD245575;
            if ((n4 ^ n3) != 220484981) {
                int cfr_ignored_0 = (0x12BC78FE ^ n3) - -689461614;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ bhr ^ string.hashCode() ^ n2 + htq + i * 1549699541) + bhr) ^ htq));
            }
            String[] stringArray = bhz.zmj(new String(cArray));
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

    private static String[] f9a8p93ijxupa(String string) {
        return string.split("\u0007\u0016", -1);
    }

    private static CallSite ff2z2ubn3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ r12zk79pl ^ string.hashCode() ^ n2 + riasspji8t + i * -1318422985) + r12zk79pl) ^ riasspji8t));
            }
            String[] stringArray = bhz.f9a8p93ijxupa(new String(cArray));
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

