/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 *  net.minecraft.class_2813
 *  net.minecraft.class_304
 *  net.minecraft.class_3675
 *  net.minecraft.class_3675$class_306
 *  net.minecraft.class_408
 *  net.minecraft.class_465
 *  net.minecraft.class_471
 *  net.minecraft.class_481
 *  net.minecraft.class_498
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import net.minecraft.class_2596;
import net.minecraft.class_2813;
import net.minecraft.class_304;
import net.minecraft.class_3675;
import net.minecraft.class_408;
import net.minecraft.class_465;
import net.minecraft.class_471;
import net.minecraft.class_481;
import net.minecraft.class_498;
import us.m0vy.moondlc.m0vyguard.bbsh;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bh;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.gha;
import us.m0vy.moondlc.m0vyguard.ghh_2;
import us.m0vy.moondlc.m0vyguard.km;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="InventoryMove", category=bzw.OTHER, desc="Lets you move while inventory screens are open")
public class hb
extends bnq {
    private final badh_2 hysh = new badh_2(this, "Move In".concat(" Inventory")).bts(true);
    private final badh_2 shjz = new badh_2(this, "Move In".concat(" Click GUI")).bts(true);
    private final Deque ly = new ArrayDeque();
    private bh sds_3 = bh.jtq_2;
    private class_304[] shtf_2;
    private static hb stm_2;
    private final bql<btt> rsk_2 = this::rdz_4;
    private final bql<ghh_2> shlz = this::rrz;
    private static final int sshdh = -1368039688;
    private static final int shj_4 = 1343052403;
    private static final int tz_2 = -1776562533;
    private static final int saq_3 = 972564822;
    private static final int bcfc30vnop = -1262811665;
    private static final int b182z93knlmqc = -1111555346;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int mu5kh7x3ashgep;

    public hb() {
        stm_2 = this;
    }

    public static hb tdm_2() {
        block0: {
            int n = bbsh.zadh_2(523226001);
            int n2 = n ^ 0x8F2DB344;
            if ((n2 ^ n) == -1892830396) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x900278D5 ^ n, 5) - 1957314822) * -1878886187;
            int cfr_ignored_1 = (int)(0x52B0D6E827D4EB4FL ^ (long)n ^ 0x50A0831A2DB908B0L);
        }
        return stm_2;
    }

    public boolean jndh() {
        block0: {
            int n = bbsh.zadh_2(948503011);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x2C0D64EE;
            if ((n2 ^ n) == 739075310) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x1484650D ^ n, 5) - -2140808242;
            int cfr_ignored_1 = (int)(0xD636CB3027D4EB4FL ^ (long)n ^ 0x6B10831A2DB801BCL);
        }
        return false;
    }

    @Override
    public void nt() {
        int n = 0;
        int n2 = 1912319538;
        n2 = Integer.rotateLeft(n2 * -1672384153, 20) ^ 0xB91A4DC6;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (int)((long)(n2 ^ 0xCB73051E) ^ 0xE8EEB0ABDC10396BL ^ 0xE8EEB0ABDC10396BL);
        while (true) {
            block21: {
                block27: {
                    block19: {
                        block18: {
                            block32: {
                                block33: {
                                    block28: {
                                        block31: {
                                            block26: {
                                                block22: {
                                                    block23: {
                                                        block24: {
                                                            block20: {
                                                                block30: {
                                                                    block29: {
                                                                        block25: {
                                                                            block16: {
                                                                                block17: {
                                                                                    if ((n = n3 ^ n2) > -881654498) break block16;
                                                                                    if (n > -1550121858) break block17;
                                                                                    if (n == -1656155502) break block18;
                                                                                    if (n == -1606067860) break block19;
                                                                                    int cfr_ignored_0 = Integer.rotateLeft(0xF260E0C4 ^ n2, 17) - 1578686199;
                                                                                    if (n == -1550121858) break block20;
                                                                                    break block21;
                                                                                }
                                                                                if (n == -1374162562) break block22;
                                                                                if (n == -968509046) break block23;
                                                                                int cfr_ignored_1 = Integer.rotateLeft(0x8ECF9084 ^ n2, 4) - 1333796663;
                                                                                if (n == -881654498) break block24;
                                                                                break block21;
                                                                            }
                                                                            if (n > 467260085) break block25;
                                                                            if (n == -271049076) break block26;
                                                                            if (n == -116974793) break block27;
                                                                            if (n == 467260085) break block28;
                                                                            break block21;
                                                                        }
                                                                        if (n > 1304225829) break block29;
                                                                        if (n == 1200963298) break block30;
                                                                        if (n == 1304225829) break block31;
                                                                        break block21;
                                                                    }
                                                                    if (n == 1410089682) break block32;
                                                                    if (n == 1530648668) break block33;
                                                                    int cfr_ignored_2 = Integer.rotateLeft(0x2E3622E9 ^ n2, 8) + -1662264974;
                                                                    int cfr_ignored_3 = (int)(0xEC848CD427D4EB4FL ^ (long)n2 ^ 0xE4D8831A2DB874D8L);
                                                                    break block21;
                                                                }
                                                                int cfr_ignored_4 = (Integer.rotateLeft(0x4FB021D1 ^ n2, 12) + -1431193718) * 1336943057;
                                                                int cfr_ignored_5 = (int)(0x8D028FEC27D4EB4FL ^ (long)n2 ^ 0xE2A8831A2DB8B7D4L);
                                                                throw null;
                                                            }
                                                            int cfr_ignored_6 = Integer.rotateRight(0xE8205F67 ^ n2, 16) - 541666484;
                                                            this.ly.clear();
                                                            this.sds_3 = bh.jtq_2;
                                                            this.sqz_4();
                                                            return;
                                                        }
                                                        int cfr_ignored_7 = (Integer.rotateRight(0x79EDCD3E ^ n2, 18) - -936805955) * 2045627711;
                                                        if (!yf.dnkh()) {
                                                            try {
                                                                n -= 2;
                                                                if ((0xE7B107BA58AB612DL ^ (long)n2 | 1L) == 0L) {
                                                                    throw new ArithmeticException();
                                                                }
                                                                n3 = n2 ^ 0xA39B047E ^ 0x746EF97 ^ 0x746EF97;
                                                            }
                                                            catch (ArithmeticException arithmeticException) {
                                                                n3 = n2 ^ 0xA39B047E ^ 0x3BFB876B ^ 0x3BFB876B;
                                                            }
                                                            n -= 4;
                                                            continue;
                                                        }
                                                        int cfr_ignored_8 = (int)(0xF18B65F60A9B1A4L ^ (long)n2 ^ 0x91CE0DE0986FB3E0L);
                                                        n3 = (int)((long)(n2 ^ 0x19FCD69A) ^ 0x55CA4E4168552C70L ^ 0x55CA4E4168552C70L);
                                                        int cfr_ignored_9 = (int)(0x395ED085FCA223B7L ^ (long)n2 ^ 0x5C7B35F7BC49DF6CL);
                                                        n3 = n2 ^ 0x47953EE2 ^ 0xCCF70175 ^ 0xCCF70175;
                                                        --n;
                                                        continue;
                                                    }
                                                    int cfr_ignored_10 = Integer.rotateRight(0x232E14AE ^ n2, 7) - 1190273101;
                                                    n3 = (n2 ^ 0xDFEB4EA) + -713591401 - -713591401;
                                                    int cfr_ignored_11 = (Integer.rotateRight(0x2CCB1493 ^ n2, 8) + 1895111944) * 751506579;
                                                    n3 = (int)((long)(n2 ^ 0xCB73051E) ^ 0x3C3EC82E6124DF35L ^ 0x3C3EC82E6124DF35L);
                                                    ++n;
                                                    continue;
                                                }
                                                int cfr_ignored_12 = (Integer.rotateLeft(0x7F4D07BC ^ n2, 18) - 1857130239) * 2135754685;
                                                n3 = n2 ^ 0xCB73051E ^ 0x91634FB1 ^ 0x91634FB1;
                                                int cfr_ignored_13 = (Integer.rotateLeft(0x6B9ECE7D ^ n2, 16) - 211329118) * 1805569661;
                                                int cfr_ignored_14 = (int)(0xA92C604027D4EB4FL ^ (long)n2 ^ 0x3DF0831A2DB8FF89L);
                                                continue;
                                            }
                                            int cfr_ignored_15 = Integer.rotateRight(0xBF6451CE ^ n2, 10) - 830703405;
                                            n3 = (int)((long)(n2 ^ 0x90A87FD5) ^ 0xD1A7DBC7F40A427EL ^ 0xD1A7DBC7F40A427EL);
                                            int cfr_ignored_16 = Integer.rotateRight(0x21559B8E ^ n2, 7) - 230389101;
                                            try {
                                                if ((0x9FE2983EDB4E4DB3L ^ (long)n2 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                n3 = (int)((long)(n2 ^ 0xCB73051E) ^ 0x5D6DCE1638C55622L ^ 0x5D6DCE1638C55622L);
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                n3 = n2 ^ 0xCB73051E ^ 0x9C2070B2 ^ 0x9C2070B2;
                                            }
                                            n += 5;
                                            continue;
                                        }
                                        int cfr_ignored_17 = Integer.rotateRight(0x18ACB067 ^ n2, 6) - 21429172;
                                        n3 = (int)((long)(n2 ^ 0xCB73051E) ^ 0x1D410763BD314D2AL ^ 0x1D410763BD314D2AL);
                                        int cfr_ignored_18 = (Integer.rotateRight(0x6C92967A ^ n2, 16) + 706598913) * 1821546107;
                                        continue;
                                    }
                                    int cfr_ignored_19 = Integer.rotateLeft(0x346CE964 ^ n2, 9) - 1569579607;
                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xCB73051E));
                                    int cfr_ignored_20 = (Integer.rotateRight(0xC71CC1F6 ^ n2, 11) - 551099397) * -954416649;
                                    n -= 4;
                                    continue;
                                }
                                int cfr_ignored_21 = Integer.rotateLeft(0x8EBBD6EC ^ n2, 4) - 1293723087;
                                n3 = (int)((long)(n2 ^ 0x36A48F32) ^ 0x6C27F329866DB34L ^ 0x6C27F329866DB34L);
                                int cfr_ignored_22 = Integer.rotateRight(0x612762C2 ^ n2, 15) + -937257799;
                                n3 = n2 ^ 0x3948601F;
                                int cfr_ignored_23 = (Integer.rotateRight(0x5016041E ^ n2, 13) - -1224204579) * 1343620127;
                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0xCB73051E));
                                n -= 5;
                                continue;
                            }
                            int cfr_ignored_24 = Integer.rotateRight(0x32613D07 ^ n2, 9) - 505676564;
                            n3 = (int)((long)(n2 ^ 0xFAC98EC6) ^ 0xC6D58D0C01D1E8F9L ^ 0xC6D58D0C01D1E8F9L);
                            int cfr_ignored_25 = Integer.rotateRight(0xA3E41D4A ^ n2, 7) + -587388111;
                            try {
                                n -= 2;
                                if ((0x8A9C2C53F5639853L ^ (long)n2 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                n3 = n2 ^ 0xCB73051E ^ 0xA4FD2CBA ^ 0xA4FD2CBA;
                            }
                            catch (IllegalStateException illegalStateException) {
                                n3 = (n2 ^ 0xCB73051E) + -1634107436 - -1634107436;
                            }
                            continue;
                        }
                        int cfr_ignored_26 = Integer.rotateLeft(0xFF70C52D ^ n2, 18) - -217743442;
                        int cfr_ignored_27 = (int)(0x3DC26B1027D4EB4FL ^ (long)n2 ^ 0x2B50831A2DB9D655L);
                        n3 = n2 ^ 0x9C07EEE0 ^ 0x861A5FD2 ^ 0x861A5FD2;
                        int cfr_ignored_28 = (Integer.rotateRight(0xFE38D9BA ^ n2, 18) + -851444543) * -29828677;
                        n3 = (int)((long)(n2 ^ 0xCB73051E) ^ 0xA63B386C37A9338BL ^ 0xA63B386C37A9338BL);
                        --n;
                        continue;
                    }
                    int cfr_ignored_29 = Integer.rotateLeft(0x42ACAEAC ^ n2, 11) - 390514191;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x68CF8386));
                    int cfr_ignored_30 = (Integer.rotateRight(0xAA8C745E ^ n2, 8) - -1419790691) * -1433635745;
                    try {
                        --n;
                        if ((0x8FE70F749C96033BL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (int)((long)(n2 ^ 0xCB73051E) ^ 0xC0E2430D4A8D2917L ^ 0xC0E2430D4A8D2917L);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 ^ 0xCB73051E;
                    }
                    n -= 5;
                    continue;
                }
                int cfr_ignored_31 = Integer.rotateRight(0x853F6FA7 ^ n2, 3) - 655107188;
                n3 = (n2 ^ 0xCBF984B6) + -1848898540 - -1848898540;
                int cfr_ignored_32 = (Integer.rotateRight(0xB2072F1F ^ n2, 9) - -1824762884) * -1308152033;
                try {
                    n -= 3;
                    n3 = n2 ^ 0xCB73051E ^ 0x68E19C08 ^ 0x68E19C08;
                }
                catch (ArithmeticException arithmeticException) {
                    n3 = n2 ^ 0xCB73051E;
                }
                continue;
            }
            int cfr_ignored_33 = Integer.rotateRight(0x8CAF6E66 ^ n2, 4) - 228326805;
            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xCB73051E));
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void nc() {
        var3_1 = 0;
        var1_2 = 96742984;
        var1_2 = Integer.rotateLeft(var1_2 * 2010602377, 14) ^ 1293087283;
        var1_2 = Integer.rotateLeft(System.identityHashCode(this) ^ var1_2, 3);
        var2_3 = var1_2 - -1998472432 + 952875852 - 952875852;
        while (true) {
            block26: {
                block28: {
                    block24: {
                        block31: {
                            block22: {
                                block21: {
                                    block23: {
                                        block30: {
                                            block32: {
                                                block29: {
                                                    block33: {
                                                        block27: {
                                                            block25: {
                                                                var3_1 = var1_2 - var2_3;
                                                                switch (var3_1 & 7) {
                                                                    case 7: {
                                                                        if (var3_1 == 827361975) break block21;
                                                                        if (var3_1 != 734792023) {
                                                                            (Integer.rotateLeft(-1975102152 ^ var1_2, 4) + -1025380093) * -1975102151;
                                                                            ** break;
                                                                        }
                                                                        break block22;
                                                                    }
                                                                    case 2: {
                                                                        if (var3_1 == -1853279822) break block23;
                                                                        if (var3_1 != -1700798814) {
                                                                            (Integer.rotateLeft(-1755867075 ^ var1_2, 5) - 1475939998) * -1755867075;
                                                                            (int)(6189412637186779983L ^ (long)var1_2 ^ -7966723592358918629L);
                                                                            ** break;
                                                                        }
                                                                        break block24;
                                                                    }
                                                                    case 0: {
                                                                        if (var3_1 == -1998472432) break block25;
                                                                        if (var3_1 == -254413144) break block26;
                                                                        if (var3_1 != 801444488) {
                                                                            ** break;
                                                                        }
                                                                        break block27;
                                                                    }
                                                                    case 4: {
                                                                        if (var3_1 > 191775260) ** GOTO lbl37
                                                                        if (var3_1 == -1724687908) break;
                                                                        if (var3_1 != 191775260) {
                                                                            ** break;
                                                                        }
                                                                        break block28;
lbl37:
                                                                        // 1 sources

                                                                        if (var3_1 == 1177406652) break block29;
                                                                        if (var3_1 != 2022106764) {
                                                                            ** break;
                                                                        }
                                                                        break block30;
                                                                    }
                                                                    case 5: {
                                                                        if (var3_1 == -344046771) break block31;
                                                                        if (var3_1 == 1637495509) break block32;
                                                                        if (var3_1 != 422050141) {
                                                                            ** break;
                                                                        }
                                                                        break block33;
                                                                    }
                                                                }
                                                                (Integer.rotateLeft(-270545104 ^ var1_2, 16) + 276280843) * -270545103;
                                                                this.szj_3();
                                                                this.sds_3 = bh.jtq_2;
                                                                hb.thjt_2(this);
                                                                return;
                                                            }
                                                            Integer.rotateLeft(1752259008 ^ var1_2, 16) + -1441301125;
                                                            if (!yf.khdha_2()) {
                                                                var2_3 = (int)((long)(var1_2 - 801444488) ^ 7457710626615020154L ^ 7457710626615020154L);
                                                                continue;
                                                            }
                                                            try {
                                                                if ((8823893801387344909L ^ (long)var1_2 | 1L) == 0L) {
                                                                    throw new IllegalArgumentException();
                                                                }
                                                                var2_3 = var1_2 - -1724687908 ^ 221953642 ^ 221953642;
                                                            }
                                                            catch (IllegalArgumentException v0) {
                                                                var2_3 = var1_2 - -1724687908;
                                                            }
                                                            var3_1 += 4;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(428288298 ^ var1_2, 6) + 465279825;
                                                        yf.athz_2();
                                                        var2_3 = Integer.reverse(Integer.reverse(var1_2 - -1699594705));
                                                        (Integer.rotateRight(-1568108873 ^ var1_2, 7) - -1293490332) * -1568108873;
                                                        var2_3 = var1_2 - -1724687908;
                                                        var3_1 += 2;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(-893987800 ^ var1_2, 12) + -1870573549;
                                                    var2_3 = (int)((long)(var1_2 - -1761313989) ^ 5955561322919229129L ^ 5955561322919229129L);
                                                    (Integer.rotateRight(1153595351 ^ var1_2, 11) - 1474961988) * 1153595351;
                                                    var2_3 = var1_2 - -1998472432 + 1277290823 - 1277290823;
                                                    var3_1 += 5;
                                                    continue;
                                                }
                                                (Integer.rotateRight(-128698894 ^ var1_2, 18) + 378546057) * -128698893;
                                                var2_3 = var1_2 - -388484707 + -1942717063 - -1942717063;
                                                Integer.rotateLeft(-1848846776 ^ var1_2, 5) + -1406430733;
                                                var2_3 = (int)((long)(var1_2 - -1998472432) ^ -9215854412379109908L ^ -9215854412379109908L);
                                                continue;
                                            }
                                            Integer.rotateRight(-1404882870 ^ var1_2, 8) + -528451535;
                                            var2_3 = Integer.reverse(Integer.reverse(var1_2 - 969826896));
                                            Integer.rotateLeft(1298183137 ^ var1_2, 12) + 1662216058;
                                            (int)(-8083365549778343089L ^ (long)var1_2 ^ -4122901310398221707L);
                                            var2_3 = (int)((long)(var1_2 - -1998472432) ^ 6328168314216419231L ^ 6328168314216419231L);
                                            var3_1 += 3;
                                            continue;
                                        }
                                        Integer.rotateLeft(-1273773751 ^ var1_2, 9) + -759036142;
                                        (int)(8548236112401066831L ^ (long)var1_2 ^ 2564944136247001235L);
                                        var2_3 = (int)((long)(var1_2 - 1341802356) ^ 6450520830951933376L ^ 6450520830951933376L);
                                        (Integer.rotateLeft(-535499011 ^ var1_2, 15) - 652644318) * -535499011;
                                        (int)(2496754237469682511L ^ (long)var1_2 ^ 9002839803573168285L);
                                        var2_3 = var1_2 - -1998472432;
                                        var3_1 -= 3;
                                        continue;
                                    }
                                    (Integer.rotateRight(1030021234 ^ var1_2, 10) + 1939131657) * 1030021235;
                                    var2_3 = Integer.reverse(Integer.reverse(var1_2 - -1998472432));
                                    (Integer.rotateLeft(-328313860 ^ var1_2, 16) - -1514550593) * -328313859;
                                    continue;
                                }
                                Integer.rotateLeft(223904293 ^ var1_2, 4) - -1575657034;
                                (int)(-3464908481049072817L ^ (long)var1_2 ^ -6539082510482525691L);
                                var2_3 = var1_2 - -1998472432 + -1544130860 - -1544130860;
                                (Integer.rotateLeft(-1807998563 ^ var1_2, 5) - -140136130) * -1807998563;
                                (int)(6237080451980520271L ^ (long)var1_2 ^ -2148072873796239156L);
                                var3_1 -= 3;
                                continue;
                            }
                            (Integer.rotateRight(-699564578 ^ var1_2, 13) - -138420963) * -699564577;
                            var2_3 = (int)((long)(var1_2 - -1124582756) ^ 3911204358457485568L ^ 3911204358457485568L);
                            Integer.rotateLeft(-727920543 ^ var1_2, 13) + -1017455878;
                            (int)(1598353852033461071L ^ (long)var1_2 ^ 128496737839579533L);
                            try {
                                var3_1 -= 4;
                                if ((-1003404960282931233L ^ (long)var1_2 | 1L) == 0L) {
                                    throw new UnsupportedOperationException();
                                }
                                var2_3 = (int)((long)(var1_2 - -1998472432) ^ 2331037346999803655L ^ 2331037346999803655L);
                            }
                            catch (UnsupportedOperationException v1) {
                                var2_3 = var1_2 - -1998472432 + 1007658242 - 1007658242;
                            }
                            continue;
                        }
                        (Integer.rotateLeft(-1133966255 ^ var1_2, 10) + -719971062) * -1133966255;
                        (int)(9141078454086986575L ^ (long)var1_2 ^ -5068657232145985434L);
                        var2_3 = Integer.reverse(Integer.reverse(var1_2 - -1998472432));
                        (Integer.rotateLeft(2147336152 ^ var1_2, 18) + -2078811549) * 2147336153;
                        var3_1 -= 4;
                        continue;
                    }
                    (Integer.rotateLeft(316214769 ^ var1_2, 5) + 1285967722) * 316214769;
                    (int)(-3428466594075579569L ^ (long)var1_2 ^ -4978585239598658298L);
                    var2_3 = var1_2 - 126097869 + -1672191482 - -1672191482;
                    Integer.rotateRight(299975950 ^ var1_2, 5) - 782564333;
                    var2_3 = (int)((long)(var1_2 - 441828156) ^ 6001492975777038387L ^ 6001492975777038387L);
                    (Integer.rotateRight(358872314 ^ var1_2, 5) + -1686615679) * 358872315;
                    var2_3 = (int)((long)(var1_2 - -1998472432) ^ 5998335665560381815L ^ 5998335665560381815L);
                    var3_1 += 2;
                    continue;
                }
                Integer.rotateLeft(-2123966880 ^ var1_2, 3) + -1345219365;
                var2_3 = var1_2 - -1998472432 + 1681145440 - 1681145440;
                var3_1 += 2;
                continue;
            }
            (Integer.rotateLeft(179169785 ^ var1_2, 4) + 1332540514) * 179169785;
            (int)(-4026420634038506673L ^ (long)var1_2 ^ 8284515663007464943L);
            var2_3 = var1_2 - 884392095 + -380030548 - -380030548;
            (Integer.rotateLeft(-1211856048 ^ var1_2, 9) + 1160412651) * -1211856047;
            var2_3 = var1_2 - -1998472432;
            --var3_1;
            continue;
lbl196:
            // 7 sources

            Integer.rotateLeft(100413089 ^ var1_2, 3) + -1108917062;
            (int)(-4085186403806942385L ^ (long)var1_2 ^ -267820029369113780L);
            var2_3 = var1_2 - -1998472432;
        }
    }

    private boolean rwj() {
        try {
            int n = -826735436;
            n = Integer.rotateLeft(n * -47885483, 8) ^ 0xCEA8659F;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 8);
            int n2 = n ^ 0x20A665E1;
            if ((n2 ^ n) != 547775969) {
                int cfr_ignored_0 = (0xEE1F6155 ^ n) + -695624710;
            }
            if ((0x18C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (hb.mc.field_1755 == null || hb.mc.field_1755 instanceof class_408 || hb.mc.field_1755 instanceof class_498 || hb.mc.field_1755 instanceof class_471) {
            return false;
        }
        boolean bl = this.zdl_4() && hb.zkt_2(this.hysh);
        boolean bl2 = hb.mc.field_1755 instanceof gha && hb.rkz(this.shjz);
        return bl || bl2;
    }

    private boolean zdl_4() {
        int n = 405275896;
        int n2 = (n = Integer.rotateLeft(n * -1373348859, 18) ^ 0xFC3F7027) ^ 0x6D1CC6DA;
        if ((n2 ^ n) != 1830602458) {
            int cfr_ignored_0 = (0x7534C222 ^ n) + 1587312098;
        }
        return hb.mc.field_1755 instanceof class_465 && !(hb.mc.field_1755 instanceof class_481) && !(hb.mc.field_1755 instanceof class_471);
    }

    private boolean khzb_2() {
        int n = 1507654079;
        n = Integer.rotateLeft(n * 1043897371, 28) ^ 0x6E0AF81;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xFAE11BC4;
        if ((n2 ^ n) != -85910588) {
            int cfr_ignored_0 = (0xA33DE27B ^ n) + -1907912569;
        }
        if (!hb.zmq()) {
            yf.athz_2();
        }
        return hb.mc.field_1724 != null && hb.mc.field_1724.field_3913 != null && (hb.mc.field_1724.field_3913.field_3905 != 0.0f || hb.mc.field_1724.field_3913.field_3907 != 0.0f);
    }

    private void hks() {
        int n = 0;
        int n2 = -2096077105;
        n2 = Integer.rotateLeft(n2 * 1299733087, 16) ^ 0xEC8EADD3;
        int n3 = (int)((long)(n2 ^ 0x924132F6) ^ 0x2FB6FE53458C1675L ^ 0x2FB6FE53458C1675L);
        while (true) {
            block28: {
                block30: {
                    block27: {
                        block41: {
                            block42: {
                                block26: {
                                    block32: {
                                        block40: {
                                            block36: {
                                                block39: {
                                                    block37: {
                                                        block33: {
                                                            block35: {
                                                                block25: {
                                                                    block31: {
                                                                        block38: {
                                                                            block34: {
                                                                                block23: {
                                                                                    block29: {
                                                                                        block24: {
                                                                                            if ((n = n3 ^ n2) > -317454403) break block23;
                                                                                            if (n > -1287059487) break block24;
                                                                                            if (n == -1841220874) break block25;
                                                                                            if (n == -1456454756) break block26;
                                                                                            int cfr_ignored_0 = (Integer.rotateRight(0xF2E31233 ^ n2, 17) + 1843188584) * -219999693;
                                                                                            if (n == -1287059487) break block27;
                                                                                            break block28;
                                                                                        }
                                                                                        if (n > -1182752144) break block29;
                                                                                        if (n == -1227102448) break block30;
                                                                                        if (n == -1182752144) break block31;
                                                                                        int cfr_ignored_1 = Integer.rotateRight(0x6869E02A ^ n2, 16) + -1456487343;
                                                                                        break block28;
                                                                                    }
                                                                                    if (n == -991991487) break block32;
                                                                                    if (n == -317454403) break block33;
                                                                                    break block28;
                                                                                }
                                                                                if (n > 623705147) break block34;
                                                                                if (n == -63422175) break block35;
                                                                                if (n == 88834267) break block36;
                                                                                int cfr_ignored_2 = (Integer.rotateRight(0x4832DD9A ^ n2, 12) + -1031375647) * 1211293083;
                                                                                if (n == 623705147) break block37;
                                                                                break block28;
                                                                            }
                                                                            if (n > 1341352857) break block38;
                                                                            if (n == 681347004) break block39;
                                                                            if (n == 1341352857) break block40;
                                                                            break block28;
                                                                        }
                                                                        if (n == 1425638311) break block41;
                                                                        if (n == 2092898208) break block42;
                                                                        int cfr_ignored_3 = (Integer.rotateLeft(0xD6CA8358 ^ n2, 13) + 115574499) * -691371175;
                                                                        break block28;
                                                                    }
                                                                    int cfr_ignored_4 = Integer.rotateRight(0x53DE178F ^ n2, 13) - 742553996;
                                                                    class_304[] class_304Array = new class_304[0x39D79311 ^ 0x39D79317];
                                                                    class_304Array[0] = hb.mc.field_1690.field_1894;
                                                                    class_304Array[1] = hb.mc.field_1690.field_1881;
                                                                    class_304Array[2] = hb.mc.field_1690.field_1913;
                                                                    class_304Array[3] = hb.mc.field_1690.field_1849;
                                                                    class_304Array[4] = hb.mc.field_1690.field_1903;
                                                                    class_304Array[5] = hb.mc.field_1690.field_1867;
                                                                    this.shtf_2 = class_304Array;
                                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xC7F37136));
                                                                    int cfr_ignored_5 = Integer.rotateLeft(0xF4C9DE28 ^ n2, 17) + -1462794733;
                                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xED1407BD));
                                                                    n -= 3;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_6 = Integer.rotateLeft(0x9062DEE4 ^ n2, 5) - -2141807401;
                                                                if (this.shtf_2 == null) {
                                                                    try {
                                                                        n += 3;
                                                                        if ((0x87C7879AFAE84413L ^ (long)n2 | 1L) == 0L) {
                                                                            throw new UnsupportedOperationException();
                                                                        }
                                                                        n3 = (int)((long)(n2 ^ 0xFC384121) ^ 0xA0B1099E0C78C945L ^ 0xA0B1099E0C78C945L);
                                                                    }
                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                        n3 = (int)((long)(n2 ^ 0xFC384121) ^ 0x271DBEB1FA98E440L ^ 0x271DBEB1FA98E440L);
                                                                    }
                                                                    n += 5;
                                                                    continue;
                                                                }
                                                                try {
                                                                    n += 2;
                                                                    if ((0x71F106BA47DDD6A7L ^ (long)n2 | 1L) == 0L) {
                                                                        throw new NoSuchElementException();
                                                                    }
                                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xED1407BD));
                                                                }
                                                                catch (NoSuchElementException noSuchElementException) {
                                                                    n3 = (n2 ^ 0xED1407BD) + 2146540517 - 2146540517;
                                                                }
                                                                n -= 5;
                                                                continue;
                                                            }
                                                            int cfr_ignored_7 = Integer.rotateLeft(0xE8BB9208 ^ n2, 16) + 856968755;
                                                            if (hb.mc.field_1690 == null) {
                                                                n3 = (n2 ^ 0x1019A89B) + 129497517 - 129497517;
                                                                int cfr_ignored_8 = Integer.rotateLeft(0xBA989ACD ^ n2, 10) - -1663541746;
                                                                int cfr_ignored_9 = (int)(0x782A34F027D4EB4FL ^ (long)n2 ^ 0x9490831A2DB95D85L);
                                                                n3 = n2 ^ 0xED1407BD;
                                                                n -= 2;
                                                                continue;
                                                            }
                                                            n3 = n2 ^ 0xB980A270;
                                                            int cfr_ignored_10 = (Integer.rotateLeft(0x8AACC91D ^ n2, 4) - -817235522) * -1968387811;
                                                            int cfr_ignored_11 = (int)(0x481E672027D4EB4FL ^ (long)n2 ^ 0x3330831A2DB93DEDL);
                                                            n += 2;
                                                            continue;
                                                        }
                                                        int cfr_ignored_12 = Integer.rotateRight(0x523C22AE ^ n2, 13) - -106573235;
                                                        return;
                                                    }
                                                    int cfr_ignored_13 = (Integer.rotateLeft(0x598D5A3C ^ n2, 14) - -595882881) * 1502435901;
                                                    try {
                                                        ++n;
                                                        if ((0xDEE921C758C96EB9L ^ (long)n2 | 1L) == 0L) {
                                                            throw new IllegalStateException();
                                                        }
                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x924132F6));
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x924132F6));
                                                    }
                                                    continue;
                                                }
                                                int cfr_ignored_14 = (Integer.rotateLeft(0xFD5C3CF0 ^ n2, 18) + -1299644341) * -44286735;
                                                n3 = n2 ^ 0x6B565231;
                                                int cfr_ignored_15 = (Integer.rotateRight(0x247E0E13 ^ n2, 7) + 1872843656) * 612240915;
                                                n3 = (int)((long)(n2 ^ 0x924132F6) ^ 0x5DF9BB40299F2C11L ^ 0x5DF9BB40299F2C11L);
                                                n -= 4;
                                                continue;
                                            }
                                            int cfr_ignored_16 = (Integer.rotateLeft(0xC72994B9 ^ n2, 11) + 577151394) * -953576263;
                                            int cfr_ignored_17 = (int)(0x59B3A8427D4EB4FL ^ (long)n2 ^ 0x8878831A2DB9A6E7L);
                                            n3 = n2 ^ 0x678E42E7;
                                            int cfr_ignored_18 = (Integer.rotateLeft(0x2E62F7D5 ^ n2, 8) - -1571184122) * 778237909;
                                            int cfr_ignored_19 = (int)(0xECD059E827D4EB4FL ^ (long)n2 ^ 0x4EA0831A2DB87471L);
                                            try {
                                                if ((0xC9827B39420A3EDBL ^ (long)n2 | 1L) == 0L) {
                                                    throw new IllegalStateException();
                                                }
                                                n3 = n2 ^ 0x924132F6 ^ 0xF3108199 ^ 0xF3108199;
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                n3 = n2 ^ 0x924132F6 ^ 0x226D0AAE ^ 0x226D0AAE;
                                            }
                                            n += 3;
                                            continue;
                                        }
                                        int cfr_ignored_20 = (Integer.rotateRight(0x15620B5A ^ n2, 5) + -1690501343) * 358746971;
                                        try {
                                            n3 = (int)((long)(n2 ^ 0x924132F6) ^ 0xD998E1B52B4175D2L ^ 0xD998E1B52B4175D2L);
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            n3 = n2 ^ 0x924132F6;
                                        }
                                        n -= 3;
                                        continue;
                                    }
                                    int cfr_ignored_21 = (Integer.rotateLeft(0x89F664F8 ^ n2, 4) + -1187784381) * -1980340999;
                                    n3 = n2 ^ 0x4C4B00FC ^ 0x47F93FFF ^ 0x47F93FFF;
                                    int cfr_ignored_22 = Integer.rotateLeft(0xA09645E0 ^ n2, 7) + 1989154139;
                                    try {
                                        if ((0x4CEFBA5F2B80026BL ^ (long)n2 | 1L) == 0L) {
                                            throw new NoSuchElementException();
                                        }
                                        n3 = (int)((long)(n2 ^ 0x924132F6) ^ 0x89572510BEE1C61EL ^ 0x89572510BEE1C61EL);
                                    }
                                    catch (NoSuchElementException noSuchElementException) {
                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x924132F6));
                                    }
                                    n -= 5;
                                    continue;
                                }
                                int cfr_ignored_23 = Integer.rotateLeft(0xF7D337AD ^ n2, 17) - 116481326;
                                int cfr_ignored_24 = (int)(0x3561999027D4EB4FL ^ (long)n2 ^ 0xCE50831A2DB9C712L);
                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x4F1672F0));
                                int cfr_ignored_25 = (Integer.rotateLeft(0x349FFD15 ^ n2, 9) - 1673348294) * 882900245;
                                int cfr_ignored_26 = (int)(0xF62D532827D4EB4FL ^ (long)n2 ^ 0x5B20831A2DB8418BL);
                                n3 = (n2 ^ 0x924132F6) + -1999761039 - -1999761039;
                                int cfr_ignored_27 = Integer.rotateLeft(0x38AEDE4C ^ n2, 10) - -511014289;
                                continue;
                            }
                            int cfr_ignored_28 = Integer.rotateRight(0xE0662D0E ^ n2, 15) - 817697773;
                            n3 = (n2 ^ 0xE21D4785) + -1187708039 - -1187708039;
                            int cfr_ignored_29 = Integer.rotateLeft(0x9DF44D8C ^ n2, 6) - 619905839;
                            n3 = n2 ^ 0x924132F6 ^ 0x6D405B66 ^ 0x6D405B66;
                            n -= 5;
                            continue;
                        }
                        int cfr_ignored_30 = Integer.rotateRight(0xC1295D43 ^ n2, 11) + 1751116376;
                        int cfr_ignored_31 = (int)(0xCC8E71DD8E117D7AL ^ (long)n2 ^ 0x1ECBD09101D234CDL);
                        n3 = (int)((long)(n2 ^ 0x924132F6) ^ 0x66D51329F250AFA2L ^ 0x66D51329F250AFA2L);
                        n += 5;
                        continue;
                    }
                    int cfr_ignored_32 = Integer.rotateLeft(0xD71B10E4 ^ n2, 13) - 279227095;
                    try {
                        if ((0xF8FBCFBEA97671B3L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = n2 ^ 0x924132F6;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 ^ 0x924132F6;
                    }
                    n += 4;
                    continue;
                }
                int cfr_ignored_33 = (Integer.rotateRight(0xC7DE13DA ^ n2, 11) + 943851169) * -941747237;
                n3 = n2 ^ 0xA3A20C1B ^ 0x1597C96D ^ 0x1597C96D;
                int cfr_ignored_34 = Integer.rotateRight(0xAA95C9A6 ^ n2, 8) - -1400829355;
                n3 = n2 ^ 0x94F919F6;
                int cfr_ignored_35 = (Integer.rotateLeft(0xB0D4E9B4 ^ n2, 9) - 1847979015) * -1328223819;
                n3 = (int)((long)(n2 ^ 0x924132F6) ^ 0x772B7FB44ECAEEEDL ^ 0x772B7FB44ECAEEEDL);
                continue;
            }
            int cfr_ignored_36 = (Integer.rotateRight(0x344A1A9B ^ n2, 9) + 1498863616) * 877271707;
            n3 = (int)((long)(n2 ^ 0x924132F6) ^ 0x809575BBF2D9FD2EL ^ 0x809575BBF2D9FD2EL);
        }
    }

    private void zhj_4() {
        try {
            int n = -1704552397;
            n = Integer.rotateLeft(n * 1980052287, 25) ^ 0x7B9F118C;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 13);
            int n2 = n ^ 0x3E8273B6;
            if ((n2 ^ n) != 1048736694) {
                int cfr_ignored_0 = (0xA4E4EB85 ^ n) + 1797512181;
            }
            if ((0x1E7 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        this.hks();
        if (this.shtf_2 == null) {
            return;
        }
        long l = mc.method_22683().method_4490();
        for (class_304 class_3042 : this.shtf_2) {
            class_3042.method_23481(class_3675.method_15987((long)l, (int)hb.bfl(class_3042).method_1444()));
        }
    }

    private void sqz_4() {
        int n = bbsh.zadh_2(-1696847707);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 5);
        int n2 = n ^ 0x93DA4F7D;
        if ((n2 ^ n) != -1814409347) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x90667D8 ^ n, 4) + 472134243) * 151414745;
        }
        this.hks();
        if (this.shtf_2 == null) {
            return;
        }
        for (class_304 class_3042 : this.shtf_2) {
            class_3042.method_23481(false);
        }
    }

    private void szj_3() {
        class_2813 class_28132;
        int n = bbsh.zadh_2(33464836);
        int n2 = n ^ 0xF189764C;
        if ((n2 ^ n) != -242649524) {
            int cfr_ignored_0 = Integer.rotateLeft(0xF077D448 ^ n, 17) + 585126899;
        }
        if (this.ly.isEmpty()) {
            return;
        }
        if (mc.method_1562() == null) {
            this.ly.clear();
            Moondlc.dhrn.warn(hb.tfb("糽昹ଘⱡ텼渚龫肃ꗥ亸珗ᔯ㸉⌝쑮銭럀墒緼曛ࠡⴱ혂ﭾ鱚膺꫺侅热ᗄ㻕‼씄錂둟妱䊌柧ࣔⷋ휶鵱虴ꭒ䳮熇᫥㿯⃅쨢途딶幙䎩撍ঞ㋹퟉蘆蜐ꡣ䴋皷᮳㲕⇹쫇鄴먒彨䁉教", 0xBB5A64B6 ^ 0x8E9612B3, 451057556 + 387929212, hb.khtt_4(0x60EE9FC4 ^ 0x266CA23, 28)));
            return;
        }
        while ((class_28132 = (class_2813)this.ly.pollFirst()) != null) {
            hb.sakh_2(this, (class_2596)class_28132);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void dhtb_2(class_2596 class_25962) {
        int n = -411972325;
        int n2 = (n = Integer.rotateLeft(n * -342146669, 28) ^ 0x2F8968C) ^ 0xF8B736F3;
        if ((n2 ^ n) != -122210573) {
            int cfr_ignored_0 = (0x1FC6FBE8 ^ n) + -111769470;
        }
        if (mc.method_1562() == null) {
            return;
        }
        boolean bl = km.zhm_2;
        km.zhm_2 = true;
        try {
            mc.method_1562().method_52787(class_25962);
        }
        catch (RuntimeException runtimeException) {
            Moondlc.dhrn.error("Failed to send a delayed inventory packet", (Throwable)runtimeException);
        }
        finally {
            km.zhm_2 = bl;
        }
    }

    private void rrz(ghh_2 ghh2) {
        class_2596 class_25962;
        int n = bbsh.zadh_2(1242843260);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 3);
        int n2 = n ^ 0x1A68387C;
        if ((n2 ^ n) != 443037820) {
            bbsh.sghz(1350332416, n);
            int cfr_ignored_0 = (int)(0xCE4B09B97F4A7C15L ^ (long)n ^ 0xEE023227030C3147L);
        }
        if (hb.mc.field_1724 == null || !((class_25962 = ghh2.zjd()) instanceof class_2813)) {
            return;
        }
        class_2813 class_28132 = (class_2813)class_25962;
        if (this.zdl_4() && (this.khzb_2() || this.sds_3 != bh.jtq_2)) {
            this.ly.addLast(class_28132);
            ghh2.dhtd_2();
            this.sds_3 = bh.bdhz;
            this.sqz_4();
        }
    }

    private void rdz_4(btt btt2) {
        int n = 0;
        int n2 = 413798869;
        n2 = Integer.rotateLeft(n2 * 839396125, 3) ^ 0x6729D697;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = Integer.reverse(Integer.reverse(n2 - 1743994192));
        block60: while (true) {
            switch (n2 - n3) {
                case 1568023626: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x8375825A ^ n2, 3) + -275224543) * -2089450917;
                    return;
                }
                case 273500824: {
                    int cfr_ignored_1 = Integer.rotateRight(0xD9D4F54B ^ n2, 14) + 1697076048;
                    if (this.ly.isEmpty()) {
                        n3 = Integer.reverse(Integer.reverse(n2 - -611408494));
                        int cfr_ignored_2 = Integer.rotateLeft(0x6ADB5E6D ^ n2, 16) - -185725330;
                        int cfr_ignored_3 = (int)(0xA869F05027D4EB4FL ^ (long)n2 ^ 0x1DD0831A2DB8FD02L);
                        n3 = n2 - -1564861618 + -57837931 - -57837931;
                        --n;
                        continue block60;
                    }
                    try {
                        n3 = (int)((long)(n2 - 1082573001) ^ 0x87290A1A5756CF92L ^ 0x87290A1A5756CF92L);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 - 1082573001 + 1234358991 - 1234358991;
                    }
                    continue block60;
                }
                case -948209635: {
                    int cfr_ignored_4 = (Integer.rotateLeft(0x9D963398 ^ n2, 6) + 428727971) * -1651100775;
                    if (!this.rwj()) {
                        n3 = (int)((long)(n2 - 1213116588) ^ 0x30000E4127A2E296L ^ 0x30000E4127A2E296L);
                        int cfr_ignored_5 = (Integer.rotateLeft(0xFED17134 ^ n2, 18) - -541436793) * -19828427;
                        n += 4;
                        continue block60;
                    }
                    n3 = n2 - -451440096;
                    n -= 4;
                    continue block60;
                }
                case -1564861618: {
                    int cfr_ignored_6 = (Integer.rotateLeft(0x1D5F6A70 ^ n2, 6) + -1830059317) * 492792433;
                    if (this.sds_3 == bh.bdhz) {
                        try {
                            n -= 4;
                            if ((0x87754DDECC3F24DDL ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = n2 - -1947103569;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = n2 - -1947103569;
                        }
                        continue block60;
                    }
                    int cfr_ignored_7 = (int)(0xB3FB84720A043B89L ^ (long)n2 ^ 0xF594D8BB8C34CA26L);
                    n3 = n2 - 1498749376 ^ 0x65EE3599 ^ 0x65EE3599;
                    int cfr_ignored_8 = (int)(0xD70EF138EE726EBFL ^ (long)n2 ^ 0x1F011057265803CCL);
                    n3 = n2 - 1736837235 ^ 0xE6373845 ^ 0xE6373845;
                    n += 3;
                    continue block60;
                }
                case 1082573001: {
                    int cfr_ignored_9 = Integer.rotateRight(0x5E30524F ^ n2, 14) - 1815582412;
                    this.szj_3();
                    this.sds_3 = bh.jtq_2;
                    n3 = (int)((long)(n2 - -797936442) ^ 0xFB2C6D34EDB28854L ^ 0xFB2C6D34EDB28854L);
                    int cfr_ignored_10 = (Integer.rotateRight(0x53C569F2 ^ n2, 13) + 692417417) * 1405446643;
                    n3 = (int)((long)(n2 - -1564861618) ^ 0x5604D58AF7123E58L ^ 0x5604D58AF7123E58L);
                    n -= 3;
                    continue block60;
                }
                case -1495542721: {
                    int cfr_ignored_11 = (Integer.rotateRight(0x98E77A1E ^ n2, 6) - -2006619939) * -1729660385;
                    this.szj_3();
                    this.sds_3 = bh.jtq_2;
                    n3 = (int)((long)(n2 - -1564861618) ^ 0x859A289BE2BB70ABL ^ 0x859A289BE2BB70ABL);
                    int cfr_ignored_12 = Integer.rotateLeft(0xC38AD941 ^ n2, 11) + -1305612774;
                    int cfr_ignored_13 = (int)(0x138777C27D4EB4FL ^ (long)n2 ^ 0x1388831A2DB9AFA1L);
                    n -= 3;
                    continue block60;
                }
                case -680975153: {
                    int cfr_ignored_14 = (Integer.rotateLeft(0x93025AD0 ^ n2, 5) + -777609621) * -1828562223;
                    this.sqz_4();
                    n3 = n2 - 1568023626 ^ 0x3E7273E8 ^ 0x3E7273E8;
                    int cfr_ignored_15 = Integer.rotateLeft(0x6BCE96A4 ^ n2, 16) - 308403479;
                    n -= 2;
                    continue block60;
                }
                case -1125737635: {
                    int cfr_ignored_16 = Integer.rotateRight(0xE9DB30EB ^ n2, 16) + 1441303472;
                    if (!this.zdl_4()) {
                        int cfr_ignored_17 = (int)(0x54C712A9E9BB4D7CL ^ (long)n2 ^ 0xD8231FC561DF045FL);
                        n3 = (int)((long)(n2 - 273500824) ^ 0x2A82442D18FA7CADL ^ 0x2A82442D18FA7CADL);
                        --n;
                        continue block60;
                    }
                    int cfr_ignored_18 = (int)(0x781F7EB5B2031FB1L ^ (long)n2 ^ 0x1BA8B5C4455DEFL);
                    n3 = n2 - 1681433641 ^ 0x6418BEBE ^ 0x6418BEBE;
                    int cfr_ignored_19 = (int)(0x990424487AB97431L ^ (long)n2 ^ 0xB5E039C113449FD9L);
                    n3 = Integer.reverse(Integer.reverse(n2 - -1564861618));
                    n += 4;
                    continue block60;
                }
                case 1743994192: {
                    int cfr_ignored_20 = Integer.rotateRight(0x104F968E ^ n2, 5) - -33498515;
                    if (hb.mc.field_1724 == null) {
                        try {
                            n += 2;
                            if ((0x4B38ADCB4A1F5959L ^ (long)n2 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n3 = Integer.reverse(Integer.reverse(n2 - -424660675));
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n3 = n2 - -424660675 ^ 0xBB349D7D ^ 0xBB349D7D;
                        }
                        n -= 2;
                        continue block60;
                    }
                    n3 = n2 - -1000596401;
                    n -= 4;
                    continue block60;
                }
                case 1736837235: {
                    int cfr_ignored_21 = Integer.rotateLeft(0xC5D3F3CD ^ n2, 11) - -116906738;
                    int cfr_ignored_22 = (int)(0x7615DF027D4EB4FL ^ (long)n2 ^ 0x4690831A2DB9A313L);
                    if (this.sds_3 != bh.bsw_2) {
                        try {
                            n3 = n2 - -948209635;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n3 = n2 - -948209635;
                        }
                        n -= 2;
                        continue block60;
                    }
                    int cfr_ignored_23 = (int)(0x5E11E3B9A7B49397L ^ (long)n2 ^ 0x3A0383DADC0911F2L);
                    n3 = n2 - -260110352 ^ 0xA1968CEE ^ 0xA1968CEE;
                    int cfr_ignored_24 = (int)(0x4B12F76632904C1FL ^ (long)n2 ^ 0x13BCA99363193BF4L);
                    n3 = Integer.reverse(Integer.reverse(n2 - 47348267));
                    n += 5;
                    continue block60;
                }
                case -451440096: {
                    int cfr_ignored_25 = Integer.rotateLeft(0xA1E51781 ^ n2, 7) + -1625589798;
                    int cfr_ignored_26 = (int)(0x6357B9BC27D4EB4FL ^ (long)n2 ^ 0x8E08831A2DB96B7EL);
                    this.zhj_4();
                    try {
                        n -= 2;
                        if ((0x96D267764BE67AF7L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = n2 - 1568023626 + 154902471 - 154902471;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - 1568023626));
                    }
                    continue block60;
                }
                case -424660675: {
                    int cfr_ignored_27 = (Integer.rotateLeft(0x31E8835C ^ n2, 9) - 260409183) * 837321565;
                    this.ly.clear();
                    this.sds_3 = bh.jtq_2;
                    this.sqz_4();
                    return;
                }
                case 1213116588: {
                    int cfr_ignored_28 = Integer.rotateLeft(0xC12AF520 ^ n2, 11) + 1754353179;
                    if (hb.mc.field_1755 == null) {
                        int cfr_ignored_29 = (int)(0x2121546ED30FF3C5L ^ (long)n2 ^ 0x55AD6AAC1CADEF93L);
                        n3 = n2 - -1794264304 + -1337253421 - -1337253421;
                        int cfr_ignored_30 = (int)(0xBB0EF93CFBDA3483L ^ (long)n2 ^ 0xF093B079220DBCCL);
                        n3 = (int)((long)(n2 - 1568023626) ^ 0xB9880579DDFD2A79L ^ 0xB9880579DDFD2A79L);
                        n -= 3;
                        continue block60;
                    }
                    try {
                        n -= 2;
                        if ((0xCFA1D5A1FC51E5D3L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 - -680975153));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 - -680975153;
                    }
                    n += 3;
                    continue block60;
                }
                case -1947103569: {
                    int cfr_ignored_31 = (Integer.rotateLeft(0xDB95A9D ^ n2, 4) - -1378904002) * 230251165;
                    int cfr_ignored_32 = (int)(0xCF0BF4A027D4EB4FL ^ (long)n2 ^ 0x1430831A2DB833C6L);
                    this.sqz_4();
                    this.sds_3 = bh.bsw_2;
                    return;
                }
                case 47348267: {
                    int cfr_ignored_33 = Integer.rotateRight(0x6AAAE56A ^ n2, 16) + -284203247;
                    this.szj_3();
                    this.sds_3 = bh.jtq_2;
                    n3 = (int)((long)(n2 - -948209635) ^ 0x4A0575C2716CB7A3L ^ 0x4A0575C2716CB7A3L);
                    ++n;
                    continue block60;
                }
                case -1000596401: {
                    int cfr_ignored_34 = (Integer.rotateLeft(0xEC5723B8 ^ n2, 16) + -1561660797) * -329833543;
                    if (hb.mc.field_1687 == null) {
                        int cfr_ignored_35 = (int)(0x150C1AB4B8559D7AL ^ (long)n2 ^ 0xC819BC18C1D387C9L);
                        n3 = n2 - -424660675;
                        n -= 2;
                        continue block60;
                    }
                    n3 = n2 - -1125737635;
                    n += 5;
                    continue block60;
                }
                case 1620249742: {
                    int cfr_ignored_36 = (Integer.rotateLeft(0x5FD726F4 ^ n2, 14) - -1620355385) * 1607935733;
                    n3 = n2 - -151792165 + 2130770267 - 2130770267;
                    int cfr_ignored_37 = Integer.rotateLeft(0x464EDEE1 ^ n2, 11) + -2014667654;
                    int cfr_ignored_38 = (int)(0x84FC70DC27D4EB4FL ^ (long)n2 ^ 0x1CC8831A2DB8A429L);
                    try {
                        ++n;
                        n3 = (int)((long)(n2 - 1743994192) ^ 0x7BDEF5410436E11CL ^ 0x7BDEF5410436E11CL);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - 1743994192));
                    }
                    continue block60;
                }
                case -2037057957: {
                    int cfr_ignored_39 = (Integer.rotateRight(0x79B2B7F ^ n2, 3) - -265821284) * 127609727;
                    n3 = (int)((long)(n2 - -1235978286) ^ 0xFEE9FACD9A1868B0L ^ 0xFEE9FACD9A1868B0L);
                    int cfr_ignored_40 = (Integer.rotateRight(0x8B67292 ^ n2, 4) + 309690089) * 146174611;
                    n3 = n2 - 1743994192 ^ 0x10C4BA81 ^ 0x10C4BA81;
                    int cfr_ignored_41 = Integer.rotateRight(0xBB2D6166 ^ n2, 10) - -1361286507;
                    n += 3;
                    continue block60;
                }
                case -516607605: {
                    int cfr_ignored_42 = Integer.rotateRight(0x7C60DAE3 ^ n2, 18) + 337125560;
                    n3 = Integer.reverse(Integer.reverse(n2 - -1183384020));
                    int cfr_ignored_43 = (Integer.rotateRight(0xB16C6513 ^ n2, 9) + -2139235192) * -1318296301;
                    int cfr_ignored_44 = (int)(0xCFCE5149A357264CL ^ (long)n2 ^ 0x5FE38A1DB7BE324DL);
                    n3 = Integer.reverse(Integer.reverse(n2 - -143796812));
                    int cfr_ignored_45 = (int)(0x83146D13DF3EC463L ^ (long)n2 ^ 0x275772CE73E0ABF9L);
                    n3 = n2 - 1743994192 ^ 0x8CACA35C ^ 0x8CACA35C;
                    n += 4;
                    continue block60;
                }
                case 1529647530: {
                    int cfr_ignored_46 = (Integer.rotateLeft(0x12A93915 ^ n2, 5) - 1188792518) * 313080085;
                    int cfr_ignored_47 = (int)(0xD01B972827D4EB4FL ^ (long)n2 ^ 0xD320831A2DB80DE6L);
                    try {
                        n += 5;
                        if ((0x201E67FB72BB39E5L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (int)((long)(n2 - 1743994192) ^ 0x565A40807C7CECEBL ^ 0x565A40807C7CECEBL);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (int)((long)(n2 - 1743994192) ^ 0x7E8B6023F5E0799DL ^ 0x7E8B6023F5E0799DL);
                    }
                    continue block60;
                }
                case 809957780: {
                    int cfr_ignored_48 = (Integer.rotateLeft(0x3A5F2AB4 ^ n2, 10) - 367250183) * 979315381;
                    try {
                        if ((0xBCF49E19949C16C7L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = n2 - 1743994192 + 788963456 - 788963456;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 - 1743994192 ^ 0xFDA8362A ^ 0xFDA8362A;
                    }
                    continue block60;
                }
                case -730422825: {
                    int cfr_ignored_49 = Integer.rotateRight(0x9672380F ^ n2, 5) - 1009936652;
                    n3 = n2 - -4163147 + 838547669 - 838547669;
                    int cfr_ignored_50 = Integer.rotateRight(0x1F75FEA7 ^ n2, 6) - -744000140;
                    int cfr_ignored_51 = (int)(0xE03118606D586551L ^ (long)n2 ^ 0xCDB0160331846DB3L);
                    n3 = n2 - -405986066 ^ 0xDCA1CF1A ^ 0xDCA1CF1A;
                    int cfr_ignored_52 = (int)(0x69A6E1202B12FD95L ^ (long)n2 ^ 0x3F309A96000D7E9CL);
                    n3 = (int)((long)(n2 - 1743994192) ^ 0xADADD0AA92BA347EL ^ 0xADADD0AA92BA347EL);
                    --n;
                    continue block60;
                }
                case 639765666: {
                    int cfr_ignored_53 = Integer.rotateRight(0x6E606062 ^ n2, 16) + 1644776217;
                    n3 = Integer.reverse(Integer.reverse(n2 - 1743994192));
                    int cfr_ignored_54 = Integer.rotateLeft(0x8AB480E5 ^ n2, 4) - -801555722;
                    int cfr_ignored_55 = (int)(0x48062ED827D4EB4FL ^ (long)n2 ^ 0xA0C0831A2DB93DDDL);
                    continue block60;
                }
                case -1646721316: {
                    int cfr_ignored_56 = Integer.rotateRight(0x6611A403 ^ n2, 15) + 1619032984;
                    int cfr_ignored_57 = (int)(0x4268E59B4854E065L ^ (long)n2 ^ 0x36465C1A3BED2900L);
                    n3 = n2 - 1277506063 ^ 0x1F03C7DC ^ 0x1F03C7DC;
                    int cfr_ignored_58 = (int)(0x58415DFC4B54F646L ^ (long)n2 ^ 0x46885A1A17AB1D53L);
                    n3 = n2 - 1743994192 + 1621241331 - 1621241331;
                    n -= 2;
                    continue block60;
                }
                case -38877260: {
                    int cfr_ignored_59 = Integer.rotateLeft(0xD9624A04 ^ n2, 14) - 1464112567;
                    n3 = Integer.reverse(Integer.reverse(n2 - -281664796));
                    int cfr_ignored_60 = Integer.rotateLeft(0xFE9AB7A5 ^ n2, 18) - -652616650;
                    int cfr_ignored_61 = (int)(0x3C28199827D4EB4FL ^ (long)n2 ^ 0xCE40831A2DB9D581L);
                    int cfr_ignored_62 = (int)(0xD85BC1F016BF190AL ^ (long)n2 ^ 0x7E90E1CDC9321D66L);
                    n3 = (int)((long)(n2 - 195288624) ^ 0x1EF49DE0C56E9794L ^ 0x1EF49DE0C56E9794L);
                    int cfr_ignored_63 = (int)(0x644BD0D92333DD6CL ^ (long)n2 ^ 0x5CC28AD441FF6546L);
                    n3 = n2 - 1743994192 ^ 0x9E69DEAA ^ 0x9E69DEAA;
                    continue block60;
                }
                case 937256666: {
                    int cfr_ignored_64 = (Integer.rotateLeft(0x9748E5B1 ^ n2, 5) + 1446080426) * -1756830287;
                    int cfr_ignored_65 = (int)(0x55FA4B8C27D4EB4FL ^ (long)n2 ^ 0x6A68831A2DB90625L);
                    n3 = Integer.reverse(Integer.reverse(n2 - 1176474448));
                    int cfr_ignored_66 = (Integer.rotateLeft(0x607AC83C ^ n2, 15) - -1287922049) * 1618659389;
                    try {
                        n -= 3;
                        if ((0x236982013CCEC833L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = n2 - 1743994192;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - 1743994192));
                    }
                    n += 3;
                    continue block60;
                }
                case 1494025307: {
                    int cfr_ignored_67 = Integer.rotateRight(0xF5AEFB0F ^ n2, 17) - -997325300;
                    n3 = n2 - -1049083137;
                    int cfr_ignored_68 = Integer.rotateRight(0x8C46DF62 ^ n2, 4) + 15903769;
                    try {
                        n -= 2;
                        if ((0x9941F8D7BC047D93L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 - 1743994192));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)(n2 - 1743994192) ^ 0xA6AE10E695AE8FBCL ^ 0xA6AE10E695AE8FBCL);
                    }
                    n += 4;
                    continue block60;
                }
                case -2147381669: {
                    int cfr_ignored_69 = Integer.rotateRight(0x5F27FC6A ^ n2, 14) + -1976225775;
                    n3 = (int)((long)(n2 - 1743994192) ^ 0x986D525C74A87953L ^ 0x986D525C74A87953L);
                    int cfr_ignored_70 = Integer.rotateRight(0x5157A2 ^ n2, 3) + 238500825;
                    continue block60;
                }
                case 1542285630: {
                    int cfr_ignored_71 = (Integer.rotateLeft(0xE86D6DF0 ^ n2, 16) + 698216267) * -395481615;
                    int cfr_ignored_72 = (int)(0xEDA3503099FD635AL ^ (long)n2 ^ 0x5D11FF493D927697L);
                    n3 = (int)((long)(n2 - -1367740206) ^ 0xFC8AEF8CD123E11EL ^ 0xFC8AEF8CD123E11EL);
                    int cfr_ignored_73 = (int)(0x258E0382F7FD855EL ^ (long)n2 ^ 0xFA752348F19BE6CDL);
                    n3 = n2 - 1743994192 ^ 0xD7BEB88F ^ 0xD7BEB88F;
                    n += 3;
                    continue block60;
                }
                case -276494595: {
                    int cfr_ignored_74 = (Integer.rotateRight(0xF055E73E ^ n2, 17) - 516202429) * -262805697;
                    try {
                        n3 = Integer.reverse(Integer.reverse(n2 - 1743994192));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - 1743994192));
                    }
                    n += 3;
                    continue block60;
                }
                case -180726697: {
                    int cfr_ignored_75 = (Integer.rotateRight(0xB94ECF3E ^ n2, 10) - 1961408445) * -1186017473;
                    n3 = Integer.reverse(Integer.reverse(n2 - 1348966584));
                    int cfr_ignored_76 = (Integer.rotateLeft(0x4B1AE73D ^ n2, 12) - 480223134) * 1260054333;
                    int cfr_ignored_77 = (int)(0x89A8490027D4EB4FL ^ (long)n2 ^ 0x6F70831A2DB8BE81L);
                    try {
                        n -= 3;
                        n3 = n2 - 1743994192 + -1955348102 - -1955348102;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (int)((long)(n2 - 1743994192) ^ 0xE28D06B4819FCA11L ^ 0xE28D06B4819FCA11L);
                    }
                    n -= 5;
                    continue block60;
                }
                case 684154361: {
                    int cfr_ignored_78 = Integer.rotateRight(0x64613306 ^ n2, 15) - 740478197;
                    n3 = n2 - 1743994192 ^ 0x5B5C4FE0 ^ 0x5B5C4FE0;
                    --n;
                    continue block60;
                }
            }
            int cfr_ignored_79 = Integer.rotateRight(0xF5CE0B66 ^ n2, 17) - -934215531;
            n3 = n2 - 1743994192;
        }
    }

    private static String dhzt_3(String string, int n, int n2, int n3) {
        int n4 = -605937485;
        n4 = Integer.rotateLeft(n4 * 1850112545, 15) ^ 0x70D5C1A8;
        n4 = n2 ^ n4;
        int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 11)) ^ 0x3078027B;
        if ((n5 ^ n4) != 813171323) {
            int cfr_ignored_0 = (0xEB9A22C8 ^ n4) - -206130603;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xD8E1ADD3 ^ n2 - i) + shj_4, 11) ^ sshdh + i * -1749228263));
        }
        return new String(cArray);
    }

    private static void thjt_2(hb hb2) {
        int n = 449783974;
        n = Integer.rotateLeft(n * 1392790809, 20) ^ 0xACD440C3;
        hb hb3 = hb2;
        n = Integer.rotateLeft((hb3 != null ? System.identityHashCode(hb3) : 0) ^ n, 17);
        int n2 = n ^ 0xE56CA2B;
        if ((n2 ^ n) != 240568875) {
            int cfr_ignored_0 = (0x1499E28D ^ n) + -1891362509;
        }
        hb2.sqz_4();
    }

    private static boolean zkt_2(badh_2 badh2) {
        block0: {
            int n = bbsh.zadh_2(-1519144486);
            badh_2 badh3 = badh2;
            n = (badh3 != null ? System.identityHashCode(badh3) : 0) ^ n;
            int n2 = n ^ 0x9154F618;
            if ((n2 ^ n) == -1856702952) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x342747C2 ^ n, 9) + 1428115385;
        }
        return badh2.shzl();
    }

    private static boolean rkz(badh_2 badh2) {
        block0: {
            int n = -889373317;
            int n2 = (n = Integer.rotateLeft(n * -718839797, 6) ^ 0x264258C6) ^ 0x8829AE5C;
            if ((n2 ^ n) == -2010534308) break block0;
            int cfr_ignored_0 = (0x42D49327 ^ n) - -300723699;
        }
        return badh2.shzl();
    }

    private static boolean zmq() {
        block0: {
            int n = -966027482;
            int n2 = (n = Integer.rotateLeft(n * 1673235167, 18) ^ 0x19B916F9) ^ 0x3E2A0A6B;
            if ((n2 ^ n) == 1042942571) break block0;
            int cfr_ignored_0 = (0xF8419D4D ^ n) + -897134770;
        }
        return yf.khdha_2();
    }

    private static class_3675.class_306 bfl(class_304 class_3042) {
        block0: {
            int n = 893052272;
            n = Integer.rotateLeft(n * 1932050169, 22) ^ 0x947D37E7;
            class_304 class_3043 = class_3042;
            n = (class_3043 != null ? System.identityHashCode(class_3043) : 0) ^ n;
            int n2 = n ^ 0x4CCBBACF;
            if ((n2 ^ n) == 1288420047) break block0;
            int cfr_ignored_0 = (0x79F15FBF ^ n) + 194630821;
        }
        return class_3042.method_1429();
    }

    private static int khtt_4(int n, int n2) {
        block0: {
            int n3 = bbsh.zadh_2(417917993);
            int n4 = (n3 = n2 ^ n3) ^ 0x5336B0FD;
            if ((n4 ^ n3) == 1396093181) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x4BDE5CD4 ^ n3, 12) - 877321447) * 1272863957;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String tfb(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1012246984;
            n4 = Integer.rotateLeft(n4 * 447988911, 5) ^ 0x26E26B97;
            n4 = Integer.rotateRight(n ^ n4, 12);
            int n5 = (n4 = n2 ^ n4) ^ 0x3693CB3E;
            if ((n5 ^ n4) == 915655486) break block0;
            int cfr_ignored_0 = (0xAC662F6 ^ n4) - -1179902346;
        }
        return hb.dhzt_3(string, n, n2, n3);
    }

    private static void sakh_2(hb hb2, class_2596 class_25962) {
        int n = -629960875;
        int n2 = (n = Integer.rotateLeft(n * -1052795501, 20) ^ 0xD58A1305) ^ 0x1F47603F;
        if ((n2 ^ n) != 524771391) {
            int cfr_ignored_0 = (0xC534EF6A ^ n) - -132758755;
        }
        hb2.dhtb_2(class_25962);
    }

    private static String shqgh(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bbsh.zadh_2(-1674863987);
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 3);
            int n5 = n4 ^ 0x4669F818;
            if ((n5 ^ n4) == 1181349912) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xDA426295 ^ n4, 14) - 1919389510) * -633183595;
            int cfr_ignored_1 = (int)(0x18F0CCA827D4EB4FL ^ (long)n4 ^ 0x6420831A2DB99C30L);
        }
        return hb.dhzt_3(string, n, n2, n3);
    }

    private static String[] twy(String string) {
        int n = 2145661259;
        int n2 = (n = Integer.rotateLeft(n * 1408566661, 19) ^ 0x290B5949) ^ 0x9E7CC372;
        if ((n2 ^ n) != -1635990670) {
            int cfr_ignored_0 = (0xE198F239 ^ n) + 1069645783;
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

    private static CallSite zmt_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -334719154;
            n3 = Integer.rotateLeft(n3 * -2051630759, 10) ^ 0x36BE0422;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            String string4 = string2;
            n3 = Integer.rotateRight((string4 != null ? System.identityHashCode(string4) : 0) ^ n3, 12);
            int n4 = n3 ^ 0x78112020;
            if ((n4 ^ n3) != 2014388256) {
                int cfr_ignored_0 = (0x941DB76E ^ n3) - -35225272;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ tz_2 ^ string.hashCode() ^ n2 + saq_3 + i * -126394935) + tz_2) ^ saq_3));
            }
            String[] stringArray = hb.twy(new String(cArray));
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

    private static String[] bvpmxikjiqn7d(String string) {
        return string.split("\u0006\u0014", -1);
    }

    private static CallSite t6l3pcwe6o1sxu(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bcfc30vnop ^ string.hashCode()) + (n2 + b182z93knlmqc) + i ^ bcfc30vnop, 25) + b182z93knlmqc);
            }
            String[] stringArray = hb.bvpmxikjiqn7d(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

