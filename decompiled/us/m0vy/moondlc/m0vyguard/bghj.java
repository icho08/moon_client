/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bth_5;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.blh_2;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tkhdh;
import us.m0vy.moondlc.m0vyguard.ddh_8;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.tw_2;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Auto Trap", category=bzw.OTHER, desc="Automatically places traps around targets")
public class bghj
extends ddh_8 {
    private static final bghj rmh;
    private boolean stht_4 = false;
    private final bql<btt> bhdh_2 = new tw_2(this);
    private static final int jfm = -686527327;
    private static final int thkq = 1187803654;
    private static final int xut2sblwd = -702481362;
    private static final int psxtqmbi = -1547584578;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int fnnr1xfk7s9m6;

    public static bghj tdhj_2() {
        block0: {
            int n = bth_5.dhtz_2(-1490148415);
            int n2 = n ^ 0xD01D4748;
            if ((n2 ^ n) == -803387576) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x77336489 ^ n, 17) + 1939262418;
            int cfr_ignored_1 = (int)(0xB581CAB427D4EB4FL ^ (long)n ^ 0x6818831A2DB8C6D2L);
        }
        return rmh;
    }

    private bghj() {
    }

    public boolean shhf() {
        return this.rgha_2() && this.stht_4;
    }

    public static boolean thk_3() {
        int n = 347609979;
        int n2 = (n = Integer.rotateLeft(n * -1620916335, 20) ^ 0x28A182C6) ^ 0xB78F2A3B;
        if ((n2 ^ n) != -1215354309) {
            int cfr_ignored_0 = (0xA3373140 ^ n) + 1514017155;
        }
        return bghj.sfgh(rmh) && bghj.rmh.stht_4;
    }

    @Override
    public void nc() {
        int n = bth_5.dhtz_2(536635165);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x7FA5659C;
        if ((n2 ^ n) != 2141545884) {
            int cfr_ignored_0 = Integer.rotateLeft(0x60590281 ^ n, 15) + -1356534566;
            int cfr_ignored_1 = (int)(0xA2EBACBC27D4EB4FL ^ (long)n ^ 0xA408831A2DB8E806L);
        }
        this.stht_4 = false;
        super.nc();
    }

    private class_1657 zyh_4() {
        double d;
        double d2;
        class_1657 class_16572;
        class_1309 class_13092;
        int n = 1734294637;
        n = Integer.rotateLeft(n * 588856653, 10) ^ 0x64EE900C;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 10);
        int n2 = n ^ 0x80DA0208;
        if ((n2 ^ n) != -2133196280) {
            int cfr_ignored_0 = (0xE7853E65 ^ n) + 1405100187;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null || class_3102.field_1687 == null) {
            return null;
        }
        tkhdh tkhdh2 = tkhdh.zkhr_2();
        if (tkhdh2.rgha_2() && (class_13092 = tkhdh2.rkhh_2()) instanceof class_1657 && bghj.jhf_2(class_16572 = (class_1657)class_13092) && !class_16572.method_7325() && !blh_2.dhwj(class_16572) && (d2 = class_3102.field_1724.method_5858((class_1297)class_16572)) <= (d = (double)this.dhmd.thw_5() + 1.0) * d) {
            return class_16572;
        }
        class_16572 = null;
        double d3 = bghj.dhash(0xFC627997C9F2549EL ^ 0xBC04F997C9F2549EL);
        d = bghj.dhyb(this.dhmd) * this.dhmd.thw_5();
        for (class_1657 class_16573 : class_3102.field_1687.method_18456()) {
            double d4;
            double d5;
            if (class_16573 == class_3102.field_1724 || !class_16573.method_5805() || class_16573.method_7325() || blh_2.dhwj(class_16573) || bghj.zan_4(bghj.jhh_4(Moondlc.getInstance()), bghj.dhhj(class_16573).getString()) || !((d5 = class_3102.field_1724.method_5858((class_1297)class_16573)) <= d) || !((d4 = bghj.ddj_3(this, class_16573)) < d3)) continue;
            d3 = d4;
            class_16572 = class_16573;
        }
        return class_16572;
    }

    private double rhkh_2(class_1657 class_16572) {
        int n = bth_5.dhtz_2(415362759);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xF161005B;
        if ((n2 ^ n) != -245301157) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xE9A0EE9C ^ n, 16) - 1322943519) * -375329123;
        }
        class_310 class_3102 = bghj.dat_8();
        if (class_3102.field_1724 == null) {
            return Double.longBitsToDouble(0xB2B3CE3DD995A69FL ^ 0xF2C54E3DD995A69FL);
        }
        class_243 class_2432 = bghj.zsq_2(class_3102.field_1724);
        double d = class_16572.method_23317() - class_2432.field_1352;
        double d2 = class_16572.method_23318() + class_16572.method_5829().method_17940() / Double.longBitsToDouble(0xF91C7D5B787CA996L ^ 0xB91C7D5B787CA996L) - class_2432.field_1351;
        double d3 = class_16572.method_23321() - class_2432.field_1350;
        double d4 = Math.sqrt(d * d + d3 * d3);
        float f = (float)Math.toDegrees(Math.atan2(d3, d)) - Float.intBitsToFloat(1803182037 - 684089301);
        float f2 = (float)(-Math.toDegrees(Math.atan2(d2, d4)));
        float f3 = Math.abs(this.ztdh_2(bghj.swy_2(class_3102.field_1724) - f));
        float f4 = bghj.rla_2(class_3102.field_1724.method_36455() - f2);
        return Math.sqrt(f3 * f3 + f4 * f4);
    }

    private float ztdh_2(float f) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        int n = 0;
        int n2 = 681220699;
        n2 = Integer.rotateLeft(n2 * 862261931, 12) ^ 0xB3DC13AF;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 23);
        int n3 = Integer.rotateLeft(n2 ^ 0xD20ABA8B, 20) ^ 0xA38D467A ^ 0xA38D467A;
        while (true) {
            block31: {
                block29: {
                    block40: {
                        block50: {
                            block32: {
                                block45: {
                                    block52: {
                                        block33: {
                                            block49: {
                                                block39: {
                                                    block34: {
                                                        block44: {
                                                            block37: {
                                                                block36: {
                                                                    block47: {
                                                                        block46: {
                                                                            block43: {
                                                                                block30: {
                                                                                    block51: {
                                                                                        block54: {
                                                                                            block38: {
                                                                                                block53: {
                                                                                                    block48: {
                                                                                                        block41: {
                                                                                                            block42: {
                                                                                                                block26: {
                                                                                                                    block35: {
                                                                                                                        block27: {
                                                                                                                            block28: {
                                                                                                                                if ((n = Integer.rotateRight(n3, 20) ^ n2) > -367654984) break block26;
                                                                                                                                if (n > -1276217995) break block27;
                                                                                                                                if (n > -1697878943) break block28;
                                                                                                                                if (n == -1909477546) break block29;
                                                                                                                                if (n == -1697878943) break block30;
                                                                                                                                break block31;
                                                                                                                            }
                                                                                                                            if (n == -1345553201) break block32;
                                                                                                                            if (n == -1335804333) break block33;
                                                                                                                            int cfr_ignored_0 = Integer.rotateLeft(0x742DA1E9 ^ n2, 17) + 367278706;
                                                                                                                            int cfr_ignored_1 = (int)(0xB69F0FD427D4EB4FL ^ (long)n2 ^ 0xE2D8831A2DB8C0EFL);
                                                                                                                            if (n == -1276217995) break block34;
                                                                                                                            break block31;
                                                                                                                        }
                                                                                                                        if (n > -880692713) break block35;
                                                                                                                        if (n == -1050211191) break block36;
                                                                                                                        if (n == -880692713) break block37;
                                                                                                                        int cfr_ignored_2 = Integer.rotateRight(0xF623088F ^ n2, 17) - -761550708;
                                                                                                                        break block31;
                                                                                                                    }
                                                                                                                    if (n == -771048821) break block38;
                                                                                                                    if (n == -754247571) break block39;
                                                                                                                    if (n == -367654984) break block40;
                                                                                                                    break block31;
                                                                                                                }
                                                                                                                if (n > 518164491) break block41;
                                                                                                                if (n > -213343090) break block42;
                                                                                                                if (n == -216467295) break block43;
                                                                                                                if (n == -213343090) break block44;
                                                                                                                break block31;
                                                                                                            }
                                                                                                            if (n == -75133030) break block45;
                                                                                                            if (n == 456678247) break block46;
                                                                                                            if (n == 518164491) break block47;
                                                                                                            break block31;
                                                                                                        }
                                                                                                        if (n > 599184943) break block48;
                                                                                                        if (n == 518373173) break block49;
                                                                                                        if (n == 552622055) break block50;
                                                                                                        if (n == 599184943) break block51;
                                                                                                        break block31;
                                                                                                    }
                                                                                                    if (n == 872811704) break block52;
                                                                                                    if (n == 1996437355) break block53;
                                                                                                    int cfr_ignored_3 = Integer.rotateLeft(0xBDB0CEC1 ^ n2, 10) + -54089574;
                                                                                                    int cfr_ignored_4 = (int)(0x7F0260FC27D4EB4FL ^ (long)n2 ^ 0x3C88831A2DB953D5L);
                                                                                                    if (n == 2146592137) break block54;
                                                                                                    break block31;
                                                                                                }
                                                                                                int cfr_ignored_5 = Integer.rotateRight(0xD96DD60A ^ n2, 14) + 1487571569;
                                                                                                f2 -= Float.intBitsToFloat(Integer.reverse(-2088690076) ^ 0x65CC81C1);
                                                                                                n3 = Integer.rotateLeft(n2 ^ 0x9ACC6C61, 20) ^ 0xFDA4FBCB ^ 0xFDA4FBCB;
                                                                                                int cfr_ignored_6 = (Integer.rotateRight(0xA91C7ABA ^ n2, 8) + 2127592385) * -1457751365;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_7 = (Integer.rotateLeft(0x264A3D59 ^ n2, 7) + -1487205118) * 642399577;
                                                                                            int cfr_ignored_8 = (int)(0xE4F8936427D4EB4FL ^ (long)n2 ^ 0xDBB8831A2DB86420L);
                                                                                            if (bghj.ghad_2()) {
                                                                                                try {
                                                                                                    if ((0x95942EA4BF244C41L ^ (long)n2 | 1L) == 0L) {
                                                                                                        throw new IllegalStateException();
                                                                                                    }
                                                                                                    n3 = Integer.rotateLeft(n2 ^ 0x1B385B67, 20) ^ 0x4B3234F1 ^ 0x4B3234F1;
                                                                                                }
                                                                                                catch (IllegalStateException illegalStateException) {
                                                                                                    n3 = Integer.rotateLeft(n2 ^ 0x1B385B67, 20);
                                                                                                }
                                                                                                continue;
                                                                                            }
                                                                                            try {
                                                                                                n3 = Integer.rotateLeft(n2 ^ 0x7FF26589, 20);
                                                                                            }
                                                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                n3 = Integer.rotateLeft(n2 ^ 0x7FF26589, 20) + 326896076 - 326896076;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_9 = (Integer.rotateRight(0xE4AE40F6 ^ n2, 15) - -1250460411) * -458342153;
                                                                                        f2 = f % Float.intBitsToFloat(807590648 - -328279304);
                                                                                        if (!(f2 >= Float.intBitsToFloat(Integer.reverse(1177060580) ^ 0x64151462))) {
                                                                                            try {
                                                                                                n -= 5;
                                                                                                if ((0xAB4EFBCDAB4C6043L ^ (long)n2 | 1L) == 0L) {
                                                                                                    throw new NoSuchElementException();
                                                                                                }
                                                                                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x9ACC6C61, 20)));
                                                                                            }
                                                                                            catch (NoSuchElementException noSuchElementException) {
                                                                                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x9ACC6C61, 20) ^ 0x94ECB5A1DC80324AL ^ 0x94ECB5A1DC80324AL);
                                                                                            }
                                                                                            n -= 4;
                                                                                            continue;
                                                                                        }
                                                                                        try {
                                                                                            n += 3;
                                                                                            if ((0xE35257319E8EFB8BL ^ (long)n2 | 1L) == 0L) {
                                                                                                throw new IllegalStateException();
                                                                                            }
                                                                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x76FF376B, 20)));
                                                                                        }
                                                                                        catch (IllegalStateException illegalStateException) {
                                                                                            n3 = Integer.rotateLeft(n2 ^ 0x76FF376B, 20) + -1077974173 - -1077974173;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_10 = (Integer.rotateLeft(0x6AC54378 ^ n2, 16) + -230634813) * 1791312761;
                                                                                    f2 += Float.intBitsToFloat(192560205 + 943309747);
                                                                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x63741C55, 20) ^ 0x6560F8C53ABF3238L ^ 0x6560F8C53ABF3238L);
                                                                                    int cfr_ignored_11 = Integer.rotateRight(0x7DF2C967 ^ n2, 18) - 1153696436;
                                                                                    n3 = Integer.rotateLeft(n2 ^ 0xF318F8A1, 20);
                                                                                    n += 5;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_12 = Integer.rotateRight(0xAB796BC7 ^ n2, 8) - -938365868;
                                                                                if (!(f2 < Float.intBitsToFloat(0xDEC27402 ^ 0x1DF67402))) {
                                                                                    try {
                                                                                        n += 5;
                                                                                        if ((0x86C7062E7F0527DBL ^ (long)n2 | 1L) == 0L) {
                                                                                            throw new UnsupportedOperationException();
                                                                                        }
                                                                                        n3 = Integer.rotateLeft(n2 ^ 0xF318F8A1, 20);
                                                                                    }
                                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                        n3 = Integer.rotateLeft(n2 ^ 0xF318F8A1, 20);
                                                                                    }
                                                                                    n += 3;
                                                                                    continue;
                                                                                }
                                                                                try {
                                                                                    --n;
                                                                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x23B6D62F, 20)));
                                                                                }
                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x23B6D62F, 20)));
                                                                                }
                                                                                n += 2;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_13 = Integer.rotateRight(0xDA633CCF ^ n2, 14) - 1986133068;
                                                                            f3 = f2;
                                                                            n3 = Integer.rotateLeft(n2 ^ 0xDE241FC5, 20);
                                                                            int cfr_ignored_14 = Integer.rotateRight(0xCF95E80F ^ n2, 12) - 663009548;
                                                                            n3 = Integer.rotateLeft(n2 ^ 0x8E2FAF56, 20) ^ 0xCDEFE0E6 ^ 0xCDEFE0E6;
                                                                            n -= 5;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_15 = (Integer.rotateRight(0x5F065252 ^ n2, 14) + -2044618967) * 1594249811;
                                                                        throw null;
                                                                    }
                                                                    int cfr_ignored_16 = Integer.rotateRight(0x342518EF ^ n2, 9) - 1423680556;
                                                                    throw null;
                                                                }
                                                                int cfr_ignored_17 = (Integer.rotateLeft(0x79D45811 ^ n2, 18) + -988526262) * 2043959313;
                                                                int cfr_ignored_18 = (int)(0xBB66F62C27D4EB4FL ^ (long)n2 ^ 0x1128831A2DB8DB1CL);
                                                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x77277794, 20)));
                                                                int cfr_ignored_19 = Integer.rotateRight(0xAFE85042 ^ n2, 8) + 1367299897;
                                                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x7CBEA235, 20)));
                                                                int cfr_ignored_20 = (Integer.rotateRight(0x3370C0DE ^ n2, 9) - 1057290781) * 863027423;
                                                                n3 = Integer.rotateLeft(n2 ^ 0xD20ABA8B, 20) ^ 0xDAF75CD3 ^ 0xDAF75CD3;
                                                                ++n;
                                                                continue;
                                                            }
                                                            int cfr_ignored_21 = Integer.rotateRight(0xDB45DC87 ^ n2, 14) - -1848421484;
                                                            n3 = Integer.rotateLeft(n2 ^ 0x507EACAB, 20) ^ 0x97FD9681 ^ 0x97FD9681;
                                                            int cfr_ignored_22 = Integer.rotateLeft(0xA55CBD68 ^ n2, 7) + 177770195;
                                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xD20ABA8B, 20)));
                                                            n -= 3;
                                                            continue;
                                                        }
                                                        int cfr_ignored_23 = (Integer.rotateRight(0xB3599C1B ^ n2, 9) + -1137211776) * -1285972965;
                                                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x6629D5BF, 20) ^ 0xA51EA2B0895FB9E1L ^ 0xA51EA2B0895FB9E1L);
                                                        int cfr_ignored_24 = Integer.rotateRight(0x51ACD207 ^ n2, 13) - -397734380;
                                                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xD20ABA8B, 20) ^ 0x7D788F986BDB8F6DL ^ 0x7D788F986BDB8F6DL);
                                                        int cfr_ignored_25 = (Integer.rotateLeft(0x27FCE71 ^ n2, 3) + 1373085418) * 41930353;
                                                        int cfr_ignored_26 = (int)(0xC0CD604C27D4EB4FL ^ (long)n2 ^ 0x3DE8831A2DB82C4BL);
                                                        ++n;
                                                        continue;
                                                    }
                                                    int cfr_ignored_27 = Integer.rotateLeft(0xD68D1EA1 ^ n2, 13) + -9153350;
                                                    int cfr_ignored_28 = (int)(0x143FB09C27D4EB4FL ^ (long)n2 ^ 0x9C48831A2DB985AEL);
                                                    n3 = Integer.rotateLeft(n2 ^ 0xE189B3D5, 20) ^ 0xE5A7E17C ^ 0xE5A7E17C;
                                                    int cfr_ignored_29 = Integer.rotateLeft(0x9CA4DB4C ^ n2, 6) - -61592209;
                                                    int cfr_ignored_30 = (int)(0x7BE7C3C712A62704L ^ (long)n2 ^ 0x7AFEE9FFB52F5A1EL);
                                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x6A897E69, 20) ^ 0x1C8FDFA1C7424B9CL ^ 0x1C8FDFA1C7424B9CL);
                                                    int cfr_ignored_31 = (int)(0x1C0F88EDB0B1E121L ^ (long)n2 ^ 0xECABADD0396595CEL);
                                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xD20ABA8B, 20)));
                                                    n -= 4;
                                                    continue;
                                                }
                                                int cfr_ignored_32 = (Integer.rotateLeft(0x7F891091 ^ n2, 18) + 1979097290) * 2139689105;
                                                int cfr_ignored_33 = (int)(0xBD3BBEAC27D4EB4FL ^ (long)n2 ^ 0x8028831A2DB8D7A6L);
                                                n3 = Integer.rotateLeft(n2 ^ 0x4844FEA5, 20) ^ 0x63A569B ^ 0x63A569B;
                                                int cfr_ignored_34 = (Integer.rotateLeft(0x3E53707D ^ n2, 10) - -1871167906) * 1045655677;
                                                int cfr_ignored_35 = (int)(0xFCE1DE4027D4EB4FL ^ (long)n2 ^ 0x41F0831A2DB85412L);
                                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xD20ABA8B, 20) ^ 0xB1543739CD4702B3L ^ 0xB1543739CD4702B3L);
                                                n -= 2;
                                                continue;
                                            }
                                            int cfr_ignored_36 = (Integer.rotateLeft(0x928672B5 ^ n2, 5) - -1029340378) * -1836682571;
                                            int cfr_ignored_37 = (int)(0x5034DC8827D4EB4FL ^ (long)n2 ^ 0x4460831A2DB90DB8L);
                                            n3 = Integer.rotateLeft(n2 ^ 0xD20ABA8B, 20);
                                            n += 5;
                                            continue;
                                        }
                                        int cfr_ignored_38 = (Integer.rotateRight(0x23D814D2 ^ n2, 7) + 1535648937) * 601363667;
                                        n3 = Integer.rotateLeft(n2 ^ 0x2B2678DE, 20);
                                        int cfr_ignored_39 = (Integer.rotateRight(0xBBDF7C16 ^ n2, 10) - -999447067) * -1142981609;
                                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x90317972, 20) ^ 0x14D938B9CDACEF2L ^ 0x14D938B9CDACEF2L);
                                        int cfr_ignored_40 = (Integer.rotateLeft(0x70FC6259 ^ n2, 17) + -1293055998) * 1895588441;
                                        int cfr_ignored_41 = (int)(0xB24ECC6427D4EB4FL ^ (long)n2 ^ 0x65B8831A2DB8C94CL);
                                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xD20ABA8B, 20) ^ 0x65F37688FD279CCL ^ 0x65F37688FD279CCL);
                                        n -= 5;
                                        continue;
                                    }
                                    int cfr_ignored_42 = Integer.rotateLeft(0xD340BEC4 ^ n2, 13) - -1724598025;
                                    n3 = Integer.rotateLeft(n2 ^ 0x86B95E6F, 20);
                                    int cfr_ignored_43 = Integer.rotateLeft(0x388717C0 ^ n2, 10) + -591822981;
                                    try {
                                        n -= 3;
                                        if ((0xDBDE56313AF90FF7L ^ (long)n2 | 1L) == 0L) {
                                            throw new IllegalArgumentException();
                                        }
                                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xD20ABA8B, 20)));
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        n3 = Integer.rotateLeft(n2 ^ 0xD20ABA8B, 20) + 1934820435 - 1934820435;
                                    }
                                    --n;
                                    continue;
                                }
                                int cfr_ignored_44 = (Integer.rotateLeft(0x22C91AD8 ^ n2, 7) + 985128803) * 583604953;
                                n3 = Integer.rotateLeft(n2 ^ 0xFF9B3D54, 20) + 293385012 - 293385012;
                                int cfr_ignored_45 = (Integer.rotateRight(0x68DC3517 ^ n2, 16) - -1224209148) * 1759261975;
                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xD20ABA8B, 20)));
                                int cfr_ignored_46 = (Integer.rotateLeft(0x3838A151 ^ n2, 10) + -751228918) * 943235409;
                                int cfr_ignored_47 = (int)(0xFA8A0F6C27D4EB4FL ^ (long)n2 ^ 0xE3A8831A2DB858C5L);
                                continue;
                            }
                            int cfr_ignored_48 = Integer.rotateLeft(0xA6E8A968 ^ n2, 7) + 982131411;
                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x83311674, 20)));
                            int cfr_ignored_49 = Integer.rotateRight(0x8224924B ^ n2, 3) + -959752624;
                            n3 = Integer.rotateLeft(n2 ^ 0xD20ABA8B, 20);
                            continue;
                        }
                        int cfr_ignored_50 = (Integer.rotateLeft(0xB5C777F5 ^ n2, 9) - 126166502) * -1245218827;
                        int cfr_ignored_51 = (int)(0x7775D9C827D4EB4FL ^ (long)n2 ^ 0x4EE0831A2DB9433AL);
                        try {
                            n += 4;
                            if ((0xAF676700D26D0117L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n3 = Integer.rotateLeft(n2 ^ 0xD20ABA8B, 20) ^ 0xD6C5AAA ^ 0xD6C5AAA;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = Integer.rotateLeft(n2 ^ 0xD20ABA8B, 20) + 1694850326 - 1694850326;
                        }
                        continue;
                    }
                    int cfr_ignored_52 = Integer.rotateRight(0xF90FC5A3 ^ n2, 18) + 759598584;
                    n3 = Integer.rotateLeft(n2 ^ 0xD20ABA8B, 20) + -147704862 - -147704862;
                    n += 3;
                    continue;
                }
                return f3;
            }
            int cfr_ignored_53 = Integer.rotateLeft(0x3675848C ^ n2, 9) - -1667716049;
            n3 = Integer.rotateLeft(n2 ^ 0xD20ABA8B, 20) + -763800765 - -763800765;
        }
    }

    private static boolean sfgh(bghj bghj2) {
        block0: {
            int n = 1863039490;
            int n2 = (n = Integer.rotateLeft(n * 1729373419, 7) ^ 0x22999A25) ^ 0x2B4F9A3A;
            if ((n2 ^ n) == 726637114) break block0;
            int cfr_ignored_0 = (0x44442038 ^ n) - -170392325;
        }
        return bghj2.rgha_2();
    }

    private static boolean jhf_2(class_1657 class_16572) {
        block0: {
            int n = -1698220576;
            int n2 = (n = Integer.rotateLeft(n * -554047807, 21) ^ 0x5C31FB05) ^ 0xC1D61DA8;
            if ((n2 ^ n) == -1042932312) break block0;
            int cfr_ignored_0 = (0x5B112848 ^ n) - 2099726614;
        }
        return class_16572.method_5805();
    }

    private static double dhash(long l) {
        block0: {
            int n = -691783164;
            int n2 = (n = Integer.rotateLeft(n * 455873769, 6) ^ 0x4982DA5B) ^ 0xF817198;
            if ((n2 ^ n) == 260141464) break block0;
            int cfr_ignored_0 = (0xD9454B9C ^ n) - 909370411;
        }
        return Double.longBitsToDouble(l);
    }

    private static float dhyb(tay tay2) {
        block0: {
            int n = 82464521;
            n = Integer.rotateLeft(n * 963533027, 23) ^ 0xFBC4539E;
            tay tay3 = tay2;
            n = (tay3 != null ? System.identityHashCode(tay3) : 0) ^ n;
            int n2 = n ^ 0x7DFD086C;
            if ((n2 ^ n) == 2113734764) break block0;
            int cfr_ignored_0 = (0x79174765 ^ n) - 1124308338;
        }
        return tay2.thw_5();
    }

    private static kh_3 jhh_4(Moondlc moondlc) {
        block0: {
            int n = bth_5.dhtz_2(1671025214);
            Moondlc moondlc2 = moondlc;
            n = Integer.rotateRight((moondlc2 != null ? System.identityHashCode(moondlc2) : 0) ^ n, 26);
            int n2 = n ^ 0x1774CF82;
            if ((n2 ^ n) == 393531266) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x74ED1DBC ^ n, 17) - 756300031) * 1961696701;
        }
        return moondlc.getFriendManager();
    }

    private static class_2561 dhhj(class_1657 class_16572) {
        block0: {
            int n = bth_5.dhtz_2(717144121);
            int n2 = n ^ 0x579EE1E6;
            if ((n2 ^ n) == 1470030310) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x7D2021DF ^ n, 18) - 725727548) * 2099257823;
        }
        return class_16572.method_5477();
    }

    private static boolean zan_4(kh_3 kh2, String string) {
        block0: {
            int n = bth_5.dhtz_2(1103848522);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xACA8E15D;
            if ((n2 ^ n) == -1398218403) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xED638517 ^ n, 16) - -1016414972) * -312244969;
        }
        return kh2.adhj(string);
    }

    private static double ddj_3(bghj bghj2, class_1657 class_16572) {
        block0: {
            int n = bth_5.dhtz_2(1310123687);
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0xD4F1BEA0;
            if ((n2 ^ n) == -722354528) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x9AE75807 ^ n, 6) - -966703084;
        }
        return bghj2.rhkh_2(class_16572);
    }

    private static class_310 dat_8() {
        block0: {
            int n = 1073530290;
            int n2 = (n = Integer.rotateLeft(n * 116156077, 22) ^ 0x1B46367) ^ 0x3CA53971;
            if ((n2 ^ n) == 1017461105) break block0;
            int cfr_ignored_0 = (0x359FCC3 ^ n) + -2115476293;
        }
        return class_310.method_1551();
    }

    private static class_243 zsq_2(class_746 class_7462) {
        block0: {
            int n = 1255526364;
            int n2 = (n = Integer.rotateLeft(n * 1917987633, 8) ^ 0x17B9FFCD) ^ 0x4F8D56;
            if ((n2 ^ n) == 5213526) break block0;
            int cfr_ignored_0 = (0x4A9A428A ^ n) - 1681098713;
        }
        return class_7462.method_33571();
    }

    private static float swy_2(class_746 class_7462) {
        block0: {
            int n = -1316767944;
            n = Integer.rotateLeft(n * -487539873, 10) ^ 0xE5B99A79;
            class_746 class_7463 = class_7462;
            n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 19);
            int n2 = n ^ 0xD93E19C9;
            if ((n2 ^ n) == -650241591) break block0;
            int cfr_ignored_0 = (0x68BDAEF1 ^ n) + 183412521;
        }
        return class_7462.method_36454();
    }

    private static float rla_2(float f) {
        block0: {
            int n = -1714848099;
            n = Integer.rotateLeft(n * -1323583163, 15) ^ 0xDE8FA120;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 2);
            int n2 = n ^ 0x4A383D81;
            if ((n2 ^ n) == 1245199745) break block0;
            int cfr_ignored_0 = (0xD3F1431C ^ n) + -1410685288;
        }
        return Math.abs(f);
    }

    private static boolean ghad_2() {
        block0: {
            int n = -457299812;
            int n2 = (n = Integer.rotateLeft(n * -70264283, 6) ^ 0xAFC00977) ^ 0x5596E745;
            if ((n2 ^ n) == 1435952965) break block0;
            int cfr_ignored_0 = (0xB128CFD9 ^ n) - -515432745;
        }
        return yf.dnkh();
    }

    private static String[] tha_8(String string) {
        int n = bth_5.dhtz_2(9715997);
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 19);
        int n2 = n ^ 0x7708948C;
        if ((n2 ^ n) != 1997051020) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x779CD591 ^ n, 17) + -2141488182) * 2006766993;
            int cfr_ignored_1 = (int)(0xB52E7BAC27D4EB4FL ^ (long)n ^ 0xA28831A2DB8C78DL);
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

    private static CallSite khas_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 792904133;
            n3 = Integer.rotateLeft(n3 * 1853939709, 23) ^ 0xF1D1F598;
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            n3 = Integer.rotateRight(n ^ n3, 13);
            int n4 = n3 ^ 0x12BFA655;
            if ((n4 ^ n3) != 314549845) {
                int cfr_ignored_0 = (0x3DFD6790 ^ n3) - 1974447004;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ jfm ^ string.hashCode() ^ n2 + thkq + i * -102822345) + jfm) ^ thkq));
            }
            String[] stringArray = bghj.tha_8(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] oetlmm0rwh5(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite blqe7flxtw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ xut2sblwd ^ string.hashCode()) + (n2 + psxtqmbi) + i ^ xut2sblwd, 10) + psxtqmbi);
            }
            String[] stringArray = bghj.oetlmm0rwh5(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

