/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1297
 *  net.minecraft.class_1922
 *  net.minecraft.class_1937
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2374
 *  net.minecraft.class_238
 *  net.minecraft.class_239
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_2533
 *  net.minecraft.class_2561
 *  net.minecraft.class_2680
 *  net.minecraft.class_310
 *  net.minecraft.class_329
 *  net.minecraft.class_337
 *  net.minecraft.class_345
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_638
 *  net.minecraft.class_9779
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2533;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_329;
import net.minecraft.class_337;
import net.minecraft.class_345;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_9779;
import us.m0vy.moondlc.m0vyguard.dh_3;
import us.m0vy.moondlc.m0vyguard.ssh_3;
import us.m0vy.moondlc.m0vyguard.zd_3;
import us.m0vy.moondlc.m0vyguard.yf;

public final class ghm
implements dh_3 {
    private static final int bzj = 65536;
    private static final double bdy = Math.PI * 2;
    private static final double[] rrgh;
    private static final int rab = -1191520000;
    private static final int shthn = -298013416;
    private static final int bwdh = 1003098701;
    private static final int ddy = 1891573508;
    private static final int m8pml400 = 1284243752;
    private static final int su5v78wwywm5o = -329990166;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int mjwz2n86wxhy;

    public static double ghrth(double d) {
        int n = zd_3.sdhk_2(-1815790487);
        int n2 = n ^ 0x195E869F;
        if ((n2 ^ n) != 425625247) {
            int cfr_ignored_0 = (Integer.rotateRight(0x8A9BBAF6 ^ n, 4) - -851885307) * -1969505545;
        }
        int n3 = (int)(d * Double.longBitsToDouble(0xA9AE8715F9DA5FB9L ^ 0xE96AD8259413973AL)) & (Integer.reverse(-2006732052) ^ 0x374D39EE);
        return rrgh[n3];
    }

    public static double shtr_2(double d) {
        try {
            int n = -548024280;
            n = Integer.rotateLeft(n * -857325309, 21) ^ 0xBFCBD3CB;
            n = (int)Double.doubleToLongBits(d) ^ n;
            int n2 = n ^ 0x5EDABD8F;
            if ((n2 ^ n) != 1591393679) {
                int cfr_ignored_0 = (0x818F6DA7 ^ n) + 976911865;
            }
            if ((0x309 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!ghm.ass_3()) {
            yf.athz_2();
        }
        int n = (int)(d * ghm.sds_3(0x77A479F2F96204CCL ^ 0x376026C294ABCC4FL) + ghm.trth(0xB414084E0D4B7675L ^ 0xF4C4084E0D4B7675L)) & 795841383 - 795775848;
        return rrgh[n];
    }

    public static float sdhs_2(double d, double d2) {
        block0: {
            int n = 1340682433;
            int n2 = (n = Integer.rotateLeft(n * 1935697035, 12) ^ 0xAAECBAA6) ^ 0xAC6E3A17;
            if ((n2 ^ n) == -1402062313) break block0;
            int cfr_ignored_0 = (0xE3870AD6 ^ n) - -2022769489;
        }
        return (float)(d + (d2 - d) * Math.random());
    }

    public static double thah_2(double d, double d2, double d3, double d4, double d5) {
        block0: {
            int n = zd_3.sdhk_2(-695393376);
            n = (int)Double.doubleToLongBits(d2) ^ n;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d3) ^ n, 7);
            int n2 = n ^ 0xBBA80984;
            if ((n2 ^ n) == -1146615420) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x6D252A24 ^ n, 16) - 1004386711;
        }
        return Math.pow(1.0 - d, Double.longBitsToDouble(0x8448C374D707D7A7L ^ 0xC440C374D707D7A7L)) * d2 + Double.longBitsToDouble(0xDE0AEC1FE705BC7EL ^ 0x9E02EC1FE705BC7EL) * d * Math.pow(1.0 - d, Double.longBitsToDouble(0x348B8DAAC329D64EL ^ 0x748B8DAAC329D64EL)) * d3 + Double.longBitsToDouble(0xF65364626661F946L ^ 0xB65B64626661F946L) * ghm.sydh_2(d, Double.longBitsToDouble(0xCE7A49F5A941C5A3L ^ 0x8E7A49F5A941C5A3L)) * (1.0 - d) * d4 + Math.pow(d, ghm.ztd_5(0x9A963F52AD1558FBL ^ 0xDA9E3F52AD1558FBL)) * d5;
    }

    public static boolean stn(class_243 class_2432) {
        int n = zd_3.sdhk_2(897614519);
        int n2 = n ^ 0xB7E3760E;
        if ((n2 ^ n) != -1209829874) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x8263F4B9 ^ n, 3) + -830979678) * -2107378503;
            int cfr_ignored_1 = (int)(0x40D15A8427D4EB4FL ^ (long)n ^ 0x4878831A2DB92C73L);
        }
        return ghm.btt(ghm.ajd(ghm.mc.field_1687, new class_3959(ghm.mc.field_1724.method_33571(), class_2432, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)ghm.mc.field_1724))) == class_239.class_240.field_1333;
    }

    public static boolean sat_4(class_243 class_2432) {
        Object object;
        Object object2;
        Object object3;
        int n = 1243029534;
        n = Integer.rotateLeft(n * 1064049859, 8) ^ 0x54B7A115;
        class_243 class_2433 = class_2432;
        n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
        int n2 = n ^ 0xD54B14B5;
        if ((n2 ^ n) != -716499787) {
            int cfr_ignored_0 = (0x9F5C34AB ^ n) + 2087106111;
        }
        class_243 class_2434 = ghm.mc.field_1724.method_33571();
        class_243 class_2435 = ghm.hzn_2(class_2432, class_2434);
        double d = ghm.dzgh(class_2435);
        class_2435 = ghm.hlth(class_2435);
        HashSet<class_2338> hashSet = new HashSet<class_2338>();
        int n3 = 0;
        double d2 = Double.longBitsToDouble(0x30CBF49EE25CB125L ^ 0xF1BF49EE25CB125L);
        for (double d3 = 0.0; d3 <= d; d3 += d2) {
            Object object4;
            object3 = class_2434.method_1019(class_2435.method_1021(d3));
            object2 = class_2338.method_49638((class_2374)object3);
            if (hashSet.contains(object2)) continue;
            hashSet.add((class_2338)object2);
            object = ghm.rwr(ghm.mc.field_1687, (class_2338)object2);
            if (object.method_26215()) continue;
            class_2248 class_22482 = ghm.shnd((class_2680)object);
            if (object.method_27852(class_2246.field_10033) || object.method_27852(class_2246.field_10285) || object.method_26204() instanceof class_2533 || (object4 = object.method_26220((class_1922)ghm.mc.field_1687, (class_2338)object2)).method_1110()) continue;
            ++n3;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        class_337 class_3372 = ghm.ghbz(ghm.mc.field_1705);
        if (class_3372 != null) {
            object3 = class_337.class;
            try {
                object2 = ((Class)object3).getField(ghm.tdhd_3("镼쓑琨ꮇ\udbd3୓몽", 265533881 + 53906486, ghm.snz_2(-1826023370) ^ 0x6168B4C1, Integer.rotateLeft(0x11D0C31B ^ 0xF59C6AC3, 13)));
                object = (Map)((Field)object2).get(class_3372);
                for (Object object4 : object.keySet()) {
                    class_345 class_3452 = (class_345)object.get(object4);
                    List list = ghm.btb_2(class_3452).method_10855();
                    list.stream().allMatch(arg_0 -> ghm.shth_6(atomicBoolean, arg_0));
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return n3 <= (atomicBoolean.get() ? 3 : (ghm.mc.field_1724.method_31548().field_7545 == 0 ? 2 : 1));
    }

    public static int rrk(String string, String string2) {
        int n;
        block4: {
            int n2 = -392520384;
            n2 = Integer.rotateLeft(n2 * -6262703, 27) ^ 0x3E0122CD;
            String string3 = string;
            n2 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n2;
            String string4 = string2;
            n2 = (string4 != null ? System.identityHashCode(string4) : 0) ^ n2;
            int n3 = n2 ^ 0x52184B5D;
            if ((n3 ^ n2) != 1377323869) {
                int cfr_ignored_0 = (0xBA82D61D ^ n2) + 631919314;
            }
            int n4 = string.length();
            int n5 = string2.length();
            int[] nArray = new int[n5 + 1];
            int n6 = 0;
            while (n6 <= n5) {
                nArray[n6] = n6++;
            }
            for (int i = 1; i <= n4; ++i) {
                int n7 = nArray[0];
                nArray[0] = i;
                for (int j = 1; j <= n5; ++j) {
                    int n8 = nArray[j];
                    int n9 = ghm.dkhs(string, i - 1) == string2.charAt(j - 1) ? 0 : 1;
                    nArray[j] = Math.min(ghm.ghkhth(nArray[j] + 1, nArray[j - 1] + 1), n7 + n9);
                    n7 = n8;
                }
            }
            n = nArray[n5];
            if (ghm.ddhw() != 0) break block4;
            n = n ^ 0xA100;
        }
        return n;
    }

    public static float haa(double d, double d2, double d3) {
        int n = 0;
        int n2 = -718750491;
        n2 = Integer.rotateLeft(n2 * -1690825329, 19) ^ 0x269BD50B;
        int n3 = Integer.reverse(Integer.reverse(n2 - 630210865));
        while (true) {
            block16: {
                block19: {
                    block23: {
                        block17: {
                            block22: {
                                block13: {
                                    block21: {
                                        block28: {
                                            block14: {
                                                block18: {
                                                    block15: {
                                                        block27: {
                                                            block25: {
                                                                block26: {
                                                                    block24: {
                                                                        block20: {
                                                                            block11: {
                                                                                block12: {
                                                                                    if ((n = n2 - n3) > -707765039) break block11;
                                                                                    if (n > -1885862906) break block12;
                                                                                    if (n == -2079862295) break block13;
                                                                                    if (n == -1935050849) break block14;
                                                                                    int cfr_ignored_0 = Integer.rotateLeft(0x9BB6B348 ^ n2, 6) + -545434381;
                                                                                    if (n == -1885862906) break block15;
                                                                                    break block16;
                                                                                }
                                                                                if (n == -1284786102) break block17;
                                                                                if (n == -819849879) break block18;
                                                                                int cfr_ignored_1 = (Integer.rotateLeft(0x185D1A78 ^ n2, 6) + -140258365) * 408754809;
                                                                                if (n == -707765039) break block19;
                                                                                break block16;
                                                                            }
                                                                            if (n > -484923969) break block20;
                                                                            if (n == -534893402) break block21;
                                                                            if (n == -528646903) break block22;
                                                                            int cfr_ignored_2 = Integer.rotateRight(0xAFED954B ^ n2, 8) + 1378005840;
                                                                            if (n == -484923969) break block23;
                                                                            break block16;
                                                                        }
                                                                        if (n > -273205428) break block24;
                                                                        if (n == -323207994) break block25;
                                                                        if (n == -273205428) break block26;
                                                                        int cfr_ignored_3 = Integer.rotateRight(0xF91D2C2 ^ n2, 4) + -419027783;
                                                                        break block16;
                                                                    }
                                                                    if (n == 630210865) break block27;
                                                                    if (n == 1188968115) break block28;
                                                                    int cfr_ignored_4 = Integer.rotateLeft(0x2F3D5065 ^ n2, 8) - -1127589002;
                                                                    int cfr_ignored_5 = (int)(0xED8FFE5827D4EB4FL ^ (long)n2 ^ 0x1C0831A2DB876CEL);
                                                                    break block16;
                                                                }
                                                                int cfr_ignored_6 = (Integer.rotateRight(0x4711F3B ^ n2, 3) + -1911527584) * 74522427;
                                                                return (float)(d + (d2 - d) * d3);
                                                            }
                                                            int cfr_ignored_7 = Integer.rotateRight(0xE75E8143 ^ n2, 15) + 147801688;
                                                            ghm.thl();
                                                            throw null;
                                                        }
                                                        int cfr_ignored_8 = (Integer.rotateRight(0x5E3DFC1B ^ n2, 14) + 1843340928) * 1581120539;
                                                        if (!yf.khdha_2()) {
                                                            try {
                                                                n3 = n2 - -323207994;
                                                            }
                                                            catch (ArithmeticException arithmeticException) {
                                                                n3 = n2 - -323207994 ^ 0xB1D9B7E4 ^ 0xB1D9B7E4;
                                                            }
                                                            n -= 2;
                                                            continue;
                                                        }
                                                        n3 = n2 - -1894028726;
                                                        int cfr_ignored_9 = (Integer.rotateLeft(0xB372A159 ^ n2, 9) + -1086379774) * -1284333223;
                                                        int cfr_ignored_10 = (int)(0x71C00F6427D4EB4FL ^ (long)n2 ^ 0xE3B8831A2DB94E51L);
                                                        n3 = n2 - -273205428 ^ 0x8CEEA82B ^ 0x8CEEA82B;
                                                        n += 2;
                                                        continue;
                                                    }
                                                    int cfr_ignored_11 = (Integer.rotateLeft(0xA223EB3C ^ n2, 7) - -1497949313) * -1574704323;
                                                    n3 = Integer.reverse(Integer.reverse(n2 - -515675423));
                                                    int cfr_ignored_12 = (Integer.rotateLeft(0x6A9BA8DD ^ n2, 16) - -315158018) * 1788586205;
                                                    int cfr_ignored_13 = (int)(0xA82906E027D4EB4FL ^ (long)n2 ^ 0xF0B0831A2DB8FD83L);
                                                    int cfr_ignored_14 = (int)(0x32CB68E9930A6835L ^ (long)n2 ^ 0x2CA3EAA72B4DC847L);
                                                    n3 = n2 - -850927315 ^ 0xEF26C01D ^ 0xEF26C01D;
                                                    int cfr_ignored_15 = (int)(0xCED7AE973FF6AA72L ^ (long)n2 ^ 0xA05EB35EAFC2307EL);
                                                    n3 = n2 - 630210865 ^ 0x5A69DACA ^ 0x5A69DACA;
                                                    n -= 5;
                                                    continue;
                                                }
                                                int cfr_ignored_16 = (Integer.rotateRight(0xCBF5C17F ^ n2, 12) - -1222636132) * -873086593;
                                                n3 = n2 - 899929802 + -1689282166 - -1689282166;
                                                int cfr_ignored_17 = Integer.rotateLeft(0x171B474C ^ n2, 5) - -794082961;
                                                try {
                                                    n3 = Integer.reverse(Integer.reverse(n2 - 630210865));
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    n3 = (int)((long)(n2 - 630210865) ^ 0x1638208193F9B04L ^ 0x1638208193F9B04L);
                                                }
                                                n -= 2;
                                                continue;
                                            }
                                            int cfr_ignored_18 = (Integer.rotateLeft(0xAF8FA914 ^ n2, 8) - 1187190951) * -1349539563;
                                            n3 = Integer.reverse(Integer.reverse(n2 - 1673104448));
                                            int cfr_ignored_19 = Integer.rotateLeft(0x32E07824 ^ n2, 9) - 764160919;
                                            n3 = n2 - -642196162 + 1980348436 - 1980348436;
                                            int cfr_ignored_20 = (Integer.rotateLeft(0x1AB01DFD ^ n2, 6) - 1068581086) * 447749629;
                                            int cfr_ignored_21 = (int)(0xD802B3C027D4EB4FL ^ (long)n2 ^ 0x9AF0831A2DB81DD4L);
                                            n3 = n2 - 630210865 + -1060709415 - -1060709415;
                                            continue;
                                        }
                                        int cfr_ignored_22 = Integer.rotateLeft(0xC4F47120 ^ n2, 11) + -570994149;
                                        int cfr_ignored_23 = (int)(0x531C784C7994136L ^ (long)n2 ^ 0x72794381794BA7B2L);
                                        n3 = n2 - 630210865 + 819574316 - 819574316;
                                        n += 5;
                                        continue;
                                    }
                                    int cfr_ignored_24 = (Integer.rotateRight(0x7350741E ^ n2, 17) - -82071843) * 1934652447;
                                    n3 = Integer.reverse(Integer.reverse(n2 - 312053574));
                                    int cfr_ignored_25 = (Integer.rotateLeft(0x53DC36B4 ^ n2, 13) - 738737927) * 1406940853;
                                    try {
                                        n -= 2;
                                        n3 = n2 - 630210865 + 1097760694 - 1097760694;
                                    }
                                    catch (NoSuchElementException noSuchElementException) {
                                        n3 = Integer.reverse(Integer.reverse(n2 - 630210865));
                                    }
                                    n += 2;
                                    continue;
                                }
                                int cfr_ignored_26 = (Integer.rotateRight(0x29CDA512 ^ n2, 8) + 340040809) * 701342995;
                                try {
                                    if ((0xEBAABCE4C38FDA7FL ^ (long)n2 | 1L) == 0L) {
                                        throw new IllegalStateException();
                                    }
                                    n3 = n2 - 630210865 ^ 0xF1A60CE4 ^ 0xF1A60CE4;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    n3 = n2 - 630210865;
                                }
                                n += 5;
                                continue;
                            }
                            int cfr_ignored_27 = (Integer.rotateRight(0x7DF950FE ^ n2, 18) - 1166962173) * 2113491199;
                            n3 = n2 - 630210865 ^ 0xAB3A40C5 ^ 0xAB3A40C5;
                            int cfr_ignored_28 = (Integer.rotateRight(0x3B9D65D3 ^ n2, 10) + 1013773256) * 1000170963;
                            continue;
                        }
                        int cfr_ignored_29 = Integer.rotateLeft(0xE49C2C49 ^ n2, 15) + -1287193582;
                        int cfr_ignored_30 = (int)(0x262E827427D4EB4FL ^ (long)n2 ^ 0xF998831A2DB9E18CL);
                        int cfr_ignored_31 = (int)(0x64CE8816D6236806L ^ (long)n2 ^ 0xED5D60F52B2B644CL);
                        n3 = (int)((long)(n2 - -677452294) ^ 0x363436F79974CC72L ^ 0x363436F79974CC72L);
                        int cfr_ignored_32 = (int)(0xC9B45CBDA0371EEEL ^ (long)n2 ^ 0x440B8CDDC6FA3EB9L);
                        n3 = (int)((long)(n2 - 630210865) ^ 0xD5A2EE63E86F07C8L ^ 0xD5A2EE63E86F07C8L);
                        n += 5;
                        continue;
                    }
                    int cfr_ignored_33 = Integer.rotateRight(0xBD36358A ^ n2, 10) + -303162639;
                    n3 = n2 - 443130595;
                    int cfr_ignored_34 = (Integer.rotateLeft(0x7B31519 ^ n2, 3) + -217240254) * 129176857;
                    int cfr_ignored_35 = (int)(0xC501BB2427D4EB4FL ^ (long)n2 ^ 0x8B38831A2DB827D2L);
                    n3 = n2 - 1416917855 + 1626289489 - 1626289489;
                    int cfr_ignored_36 = Integer.rotateLeft(0xBF599265 ^ n2, 10) - 808868214;
                    int cfr_ignored_37 = (int)(0x7DEB3C5827D4EB4FL ^ (long)n2 ^ 0x85C0831A2DB95607L);
                    n3 = n2 - 630210865;
                    n -= 4;
                    continue;
                }
                int cfr_ignored_38 = (Integer.rotateLeft(0x645DF09C ^ n2, 15) - 733856287) * 1683878045;
                n3 = Integer.reverse(Integer.reverse(n2 - -61120849));
                int cfr_ignored_39 = (Integer.rotateRight(0xE4EC027B ^ n2, 15) + -1124996064) * -454294917;
                int cfr_ignored_40 = (int)(0xA7F7F9FCBAEBF585L ^ (long)n2 ^ 0xE89B964102CE23EL);
                n3 = Integer.reverse(Integer.reverse(n2 - 1855191024));
                int cfr_ignored_41 = (int)(0x549608BD23456EDL ^ (long)n2 ^ 0x3C6768DB56FDA743L);
                n3 = n2 - 630210865 ^ 0x8826C9CD ^ 0x8826C9CD;
                continue;
            }
            int cfr_ignored_42 = (Integer.rotateLeft(0x3C1B591 ^ n2, 3) + 2027068362) * 63026577;
            int cfr_ignored_43 = (int)(0xC1731BAC27D4EB4FL ^ (long)n2 ^ 0xCA28831A2DB82F37L);
            n3 = n2 - 630210865 ^ 0x26E9376F ^ 0x26E9376F;
        }
    }

    public static class_239 ddf_4(double d, float f, float f2, class_1297 class_12972) {
        class_243 class_2432 = ghm.mc.field_1724.method_5836(1.0f);
        class_243 class_2433 = ghm.aagh_2(f2, f);
        class_243 class_2434 = class_2432.method_1031(class_2433.field_1352 * d, class_2433.field_1351 * d, class_2433.field_1350 * d);
        return ghm.mc.field_1687.method_17742(new class_3959(class_2432, class_2434, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, class_12972));
    }

    public static boolean thtz(class_1297 class_12972, class_243 class_2432, class_243 class_2433, class_238 class_2383, Predicate predicate, double d, class_1297 class_12973) {
        try {
            int n = -297459911;
            n = Integer.rotateLeft(n * -1200390077, 25) ^ 0x37692E66;
            class_1297 class_12974 = class_12972;
            n = Integer.rotateRight((class_12974 != null ? System.identityHashCode(class_12974) : 0) ^ n, 25);
            class_243 class_2434 = class_2432;
            n = (class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n;
            int n2 = n ^ 0x7C64F27C;
            if ((n2 ^ n) != 2086990460) {
                int cfr_ignored_0 = (0x9221ED45 ^ n) + -1417490971;
            }
            if ((0x93 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_1937 class_19372 = class_12972.method_37908();
        double d2 = d;
        for (class_1297 class_12975 : class_19372.method_8333(class_12972, class_2383, predicate)) {
            class_238 class_2384 = ghm.dhnq(class_12975).method_1014((double)ghm.sth_4(class_12975));
            Optional optional = class_2384.method_992(class_2432, class_2433);
            if (ghm.khjz(class_2384, class_2432)) {
                if (!(d2 >= 0.0)) continue;
                if (class_12975 == class_12973) {
                    return true;
                }
                d2 = 0.0;
                continue;
            }
            if (!optional.isPresent()) continue;
            class_243 class_2435 = (class_243)ghm.tqt_3(optional);
            double d3 = ghm.sthz_3(class_2432, class_2435);
            if (class_12975.method_5668() == class_12972.method_5668()) {
                if (d2 != 0.0 || class_12975 != class_12973) continue;
                return true;
            }
            if (class_12975 == class_12973) {
                return true;
            }
            d2 = d3;
        }
        return false;
    }

    public static boolean tdz_8(double d, float f, float f2, class_1297 class_12972, class_1297 class_12973, boolean bl) {
        try {
            int n = 528171655;
            n = Integer.rotateLeft(n * 563577973, 27) ^ 0x8F1FBF13;
            n = (int)Double.doubleToLongBits(d) ^ n;
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 22);
            int n2 = n ^ 0x23269A16;
            if ((n2 ^ n) != 589732374) {
                int cfr_ignored_0 = (0x3C5DD891 ^ n) + 199561840;
            }
            if ((0xD2 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (class_12973 != null && class_12972 != null && ghm.mc.field_1687 != null) {
            double d2;
            double d3;
            class_243 class_2432;
            float f3 = ghm.tqf(mc).method_60637(false);
            class_243 class_2433 = ghm.bwj(class_12972, f3);
            class_243 class_2434 = ghm.ww(class_12973.method_5829());
            if (bl && (class_2432 = ghm.mc.field_1687.method_17742(new class_3959(class_2433, class_2434, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, class_12972))) != null && class_2432.method_17783() == class_239.class_240.field_1332 && (d3 = class_2432.method_17784().method_1025(class_2433)) < (d2 = class_2434.method_1025(class_2433))) {
                int n = 0;
                if (yf.tdhth_2() == 0) {
                    n = n ^ 0x8C14;
                }
                return n != 0;
            }
            class_2432 = ghm.dnz_2(f2, f);
            class_243 class_2435 = class_2433.method_1019(class_2432.method_1021(d));
            class_238 class_2383 = ghm.zbsh(ghm.rzm_2(class_12972).method_18804(class_2432.method_1021(d)), 1.0);
            return ghm.thtz(class_12972, class_2433, class_2435, class_2383, ghm::shyd, d * d, class_12973);
        }
        return false;
    }

    public static class_243 aagh_2(float f, float f2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        class_243 class_2432 = null;
        int n = 0;
        int n2 = 582754274;
        n2 = Integer.rotateLeft(n2 * -2020737223, 4) ^ 0x8A38E7A6;
        n2 = Float.floatToIntBits(f2) ^ n2;
        int n3 = Integer.rotateLeft(n2 ^ 0x5BFDE084, 5);
        while (true) {
            block28: {
                block30: {
                    block39: {
                        block33: {
                            block32: {
                                block25: {
                                    block26: {
                                        block37: {
                                            block31: {
                                                block35: {
                                                    block42: {
                                                        block36: {
                                                            block40: {
                                                                block41: {
                                                                    block27: {
                                                                        block38: {
                                                                            block34: {
                                                                                block23: {
                                                                                    block29: {
                                                                                        block24: {
                                                                                            if ((n = Integer.rotateRight(n3, 5) ^ n2) > -666827906) break block23;
                                                                                            if (n > -1275698239) break block24;
                                                                                            if (n == -1968811556) break block25;
                                                                                            if (n == -1812892350) break block26;
                                                                                            if (n == -1275698239) break block27;
                                                                                            break block28;
                                                                                        }
                                                                                        if (n > -852028063) break block29;
                                                                                        if (n == -928500850) break block30;
                                                                                        if (n == -852028063) break block31;
                                                                                        break block28;
                                                                                    }
                                                                                    if (n == -687501411) break block32;
                                                                                    if (n == -666827906) break block33;
                                                                                    int cfr_ignored_0 = Integer.rotateRight(0xD4CFCF02 ^ n2, 13) + -913854343;
                                                                                    break block28;
                                                                                }
                                                                                if (n > 21181558) break block34;
                                                                                if (n == -556393660) break block35;
                                                                                if (n == -348866340) break block36;
                                                                                int cfr_ignored_1 = (Integer.rotateRight(0x29C76F7E ^ n2, 8) - 327425917) * 700936063;
                                                                                if (n == 21181558) break block37;
                                                                                break block28;
                                                                            }
                                                                            if (n > 1543364740) break block38;
                                                                            if (n == 134226463) break block39;
                                                                            if (n == 1543364740) break block40;
                                                                            break block28;
                                                                        }
                                                                        if (n == 1801217921) break block41;
                                                                        if (n == 1992091429) break block42;
                                                                        int cfr_ignored_2 = (Integer.rotateRight(0x849E6F3 ^ n2, 4) + 89167528) * 139060979;
                                                                        break block28;
                                                                    }
                                                                    int cfr_ignored_3 = (Integer.rotateRight(0xD748D777 ^ n2, 13) - 372225700) * -683092105;
                                                                    f3 = -f2 * Float.intBitsToFloat(0x7C141BF5 ^ 0x409AE1C0) - Float.intBitsToFloat(Integer.reverse(-741562571) ^ 0xECAC3C10);
                                                                    f4 = -f * Float.intBitsToFloat(-1359290206 + -1919673965);
                                                                    f5 = class_3532.method_15362((float)f3);
                                                                    f6 = class_3532.method_15374((float)f3);
                                                                    f7 = -class_3532.method_15362((float)f4);
                                                                    f8 = class_3532.method_15374((float)f4);
                                                                    class_2432 = new class_243((double)(f6 * f7), (double)f8, (double)(f5 * f7));
                                                                    try {
                                                                        --n;
                                                                        if ((0xC976E7A5D45ECFD1L ^ (long)n2 | 1L) == 0L) {
                                                                            throw new NoSuchElementException();
                                                                        }
                                                                        n3 = Integer.rotateLeft(n2 ^ 0xC8A8338E, 5) + -922109934 - -922109934;
                                                                    }
                                                                    catch (NoSuchElementException noSuchElementException) {
                                                                        n3 = Integer.rotateLeft(n2 ^ 0xC8A8338E, 5) + 397473580 - 397473580;
                                                                    }
                                                                    n -= 4;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_4 = (Integer.rotateLeft(0xBEBE57FC ^ n2, 10) - 493504191) * -1094821891;
                                                                yf.athz_2();
                                                                try {
                                                                    n += 5;
                                                                    if ((0x539E12E170ED86D5L ^ (long)n2 | 1L) == 0L) {
                                                                        throw new ArithmeticException();
                                                                    }
                                                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xB3F663C1, 5)));
                                                                }
                                                                catch (ArithmeticException arithmeticException) {
                                                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xB3F663C1, 5) ^ 0x6EC5EA12A189E044L ^ 0x6EC5EA12A189E044L);
                                                                }
                                                                n -= 5;
                                                                continue;
                                                            }
                                                            int cfr_ignored_5 = Integer.rotateRight(0x69E5CC62 ^ n2, 16) + -684630247;
                                                            if (!ghm.stt_5()) {
                                                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x6B5C6781, 5) ^ 0xB0291DEFC6A9354AL ^ 0xB0291DEFC6A9354AL);
                                                                int cfr_ignored_6 = Integer.rotateRight(0x6E7E8E0A ^ n2, 16) + 1706087025;
                                                                n -= 5;
                                                                continue;
                                                            }
                                                            int cfr_ignored_7 = (int)(0xAE6DC576C7D84A1EL ^ (long)n2 ^ 0x779D43036F1AF10AL);
                                                            n3 = Integer.rotateLeft(n2 ^ 0xB3F663C1, 5) ^ 0x6DE72398 ^ 0x6DE72398;
                                                            n += 5;
                                                            continue;
                                                        }
                                                        int cfr_ignored_8 = (Integer.rotateRight(0xC97BC0D2 ^ n2, 12) + 1784281257) * -914636589;
                                                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xAEE8C5CF, 5)));
                                                        int cfr_ignored_9 = (Integer.rotateLeft(0xFE401331 ^ n2, 18) + -836767190) * -29355215;
                                                        int cfr_ignored_10 = (int)(0x3CF2BD0C27D4EB4FL ^ (long)n2 ^ 0x8768831A2DB9D434L);
                                                        n3 = Integer.rotateLeft(n2 ^ 0xE189D9C7, 5);
                                                        int cfr_ignored_11 = Integer.rotateRight(0xE01870EE ^ n2, 15) - 659770381;
                                                        n3 = Integer.rotateLeft(n2 ^ 0x5BFDE084, 5) + -1501866902 - -1501866902;
                                                        n += 4;
                                                        continue;
                                                    }
                                                    int cfr_ignored_12 = (Integer.rotateRight(0x475054D3 ^ n2, 11) + -1491606328) * 1196446931;
                                                    int cfr_ignored_13 = (int)(0xB55883C9647C9EE7L ^ (long)n2 ^ 0xFAE2044AC6E8C760L);
                                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xC1E0D5C0, 5)));
                                                    int cfr_ignored_14 = (int)(0xBD046C93EB82A2FBL ^ (long)n2 ^ 0x24571BB6BED0D7D9L);
                                                    n3 = Integer.rotateLeft(n2 ^ 0x5BFDE084, 5) ^ 0x80224194 ^ 0x80224194;
                                                    n += 3;
                                                    continue;
                                                }
                                                int cfr_ignored_15 = (Integer.rotateLeft(0xE0F892F4 ^ n2, 15) - 1115122375) * -520580363;
                                                n3 = Integer.rotateLeft(n2 ^ 0xDECAE69, 5) ^ 0x4B8F479 ^ 0x4B8F479;
                                                int cfr_ignored_16 = Integer.rotateLeft(0x5399BD04 ^ n2, 13) - 603685559;
                                                try {
                                                    n -= 3;
                                                    if ((0xF3B93E96EF2FF38BL ^ (long)n2 | 1L) == 0L) {
                                                        throw new ArithmeticException();
                                                    }
                                                    n3 = Integer.rotateLeft(n2 ^ 0x5BFDE084, 5) + 476831686 - 476831686;
                                                }
                                                catch (ArithmeticException arithmeticException) {
                                                    n3 = Integer.rotateLeft(n2 ^ 0x5BFDE084, 5);
                                                }
                                                continue;
                                            }
                                            int cfr_ignored_17 = (Integer.rotateLeft(0x24AE60F4 ^ n2, 7) - 1971018951) * 615407861;
                                            n3 = Integer.rotateLeft(n2 ^ 0x3ED3B065, 5) ^ 0xFAFE89CF ^ 0xFAFE89CF;
                                            int cfr_ignored_18 = (Integer.rotateRight(0xD92EF213 ^ n2, 14) + 1359802248) * -651234797;
                                            try {
                                                n -= 4;
                                                if ((0x73D19D558A7E79ADL ^ (long)n2 | 1L) == 0L) {
                                                    throw new ArithmeticException();
                                                }
                                                n3 = Integer.rotateLeft(n2 ^ 0x5BFDE084, 5) ^ 0xA1BBE944 ^ 0xA1BBE944;
                                            }
                                            catch (ArithmeticException arithmeticException) {
                                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x5BFDE084, 5) ^ 0xF33823E771E4C3C7L ^ 0xF33823E771E4C3C7L);
                                            }
                                            n += 4;
                                            continue;
                                        }
                                        int cfr_ignored_19 = Integer.rotateLeft(0x9547A9E9 ^ n2, 5) + 403386994;
                                        int cfr_ignored_20 = (int)(0x57F507D427D4EB4FL ^ (long)n2 ^ 0xF2D8831A2DB9023BL);
                                        try {
                                            if ((0xD8D6133EB3ED7AEFL ^ (long)n2 | 1L) == 0L) {
                                                throw new ArithmeticException();
                                            }
                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x5BFDE084, 5)));
                                        }
                                        catch (ArithmeticException arithmeticException) {
                                            n3 = Integer.rotateLeft(n2 ^ 0x5BFDE084, 5) + 1851783269 - 1851783269;
                                        }
                                        n += 3;
                                        continue;
                                    }
                                    int cfr_ignored_21 = Integer.rotateLeft(0x8121A4E8 ^ n2, 3) + -1485793453;
                                    try {
                                        n += 5;
                                        if ((0x3CD11DE8A66BFC79L ^ (long)n2 | 1L) == 0L) {
                                            throw new IllegalArgumentException();
                                        }
                                        n3 = Integer.rotateLeft(n2 ^ 0x5BFDE084, 5) ^ 0x5D755BA6 ^ 0x5D755BA6;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        n3 = Integer.rotateLeft(n2 ^ 0x5BFDE084, 5);
                                    }
                                    n += 3;
                                    continue;
                                }
                                int cfr_ignored_22 = Integer.rotateRight(0x2151A243 ^ n2, 7) + 222315864;
                                try {
                                    n -= 5;
                                    if ((0x28DB344A3E1CC8AFL ^ (long)n2 | 1L) == 0L) {
                                        throw new IllegalStateException();
                                    }
                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x5BFDE084, 5) ^ 0xB3F378C47EC37162L ^ 0xB3F378C47EC37162L);
                                }
                                catch (IllegalStateException illegalStateException) {
                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x5BFDE084, 5) ^ 0x9FD03F9E900EFE90L ^ 0x9FD03F9E900EFE90L);
                                }
                                continue;
                            }
                            int cfr_ignored_23 = (Integer.rotateRight(0x2CDE5CF3 ^ n2, 8) + 1934287016) * 752770291;
                            n3 = Integer.rotateLeft(n2 ^ 0xF8F64746, 5);
                            int cfr_ignored_24 = Integer.rotateRight(0x4F368367 ^ n2, 12) - -1678276428;
                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xAC55432A, 5)));
                            int cfr_ignored_25 = Integer.rotateLeft(0xE86AD809 ^ n2, 16) + 692963410;
                            int cfr_ignored_26 = (int)(0x2AD8763427D4EB4FL ^ (long)n2 ^ 0x1118831A2DB9F861L);
                            n3 = Integer.rotateLeft(n2 ^ 0x5BFDE084, 5) + 2047069884 - 2047069884;
                            n -= 4;
                            continue;
                        }
                        int cfr_ignored_27 = Integer.rotateLeft(0xC283ADEC ^ n2, 11) - -1840271665;
                        n3 = Integer.rotateLeft(n2 ^ 0x56837F99, 5) ^ 0xB0F88FDE ^ 0xB0F88FDE;
                        int cfr_ignored_28 = (Integer.rotateLeft(0x82C708D5 ^ n2, 3) - -629690106) * -2100885291;
                        int cfr_ignored_29 = (int)(0x4075A6E827D4EB4FL ^ (long)n2 ^ 0xB0A0831A2DB92D3AL);
                        n3 = Integer.rotateLeft(n2 ^ 0x5BFDE084, 5) + 0x2CCCEC - 0x2CCCEC;
                        continue;
                    }
                    int cfr_ignored_30 = Integer.rotateLeft(0x33EDFA28 ^ n2, 9) + 1311697427;
                    int cfr_ignored_31 = (int)(0xC31F63CF9CC76B04L ^ (long)n2 ^ 0x3AEFF53D2D2E2BEFL);
                    n3 = Integer.rotateLeft(n2 ^ 0x50200418, 5);
                    int cfr_ignored_32 = (int)(0x86219A6A3796A1F9L ^ (long)n2 ^ 0xC9A4A39EB8D4A192L);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x5BFDE084, 5) ^ 0x1F6BD47F486452D3L ^ 0x1F6BD47F486452D3L);
                    continue;
                }
                return class_2432;
            }
            int cfr_ignored_33 = (Integer.rotateLeft(0x18E5A3F1 ^ n2, 6) + 137132394) * 417702897;
            int cfr_ignored_34 = (int)(0xDA570DCC27D4EB4FL ^ (long)n2 ^ 0xE6E8831A2DB8197FL);
            n3 = Integer.rotateLeft(n2 ^ 0x5BFDE084, 5) + 629353461 - 629353461;
        }
    }

    public static float thhth_2(float f, float f2) {
        try {
            int n = 1043297738;
            n = Integer.rotateLeft(n * -1058596253, 19) ^ 0xECB08B74;
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0x60289C77;
            if ((n2 ^ n) != 1613274231) {
                int cfr_ignored_0 = (0x5E07E9BD ^ n) + -570435855;
            }
            if ((0x1BA & 0) != 0) {
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
        float f3 = (f - f2) % Float.intBitsToFloat(Integer.reverse(-1251578591) ^ 0xC70266AD);
        if (f3 < Float.intBitsToFloat(Integer.rotateLeft(0x554F1E08 ^ 0x557FD308, 10))) {
            f3 += Float.intBitsToFloat(Integer.rotateLeft(0x307553B ^ 0x307D253, 15));
        } else if (f3 > Float.intBitsToFloat(0xC5666749 ^ 0x86526749)) {
            f3 -= Float.intBitsToFloat(-396744584 - -1532614536);
        }
        return f3;
    }

    public static String azsh_2(String string) {
        if ((string = string.replaceAll("\\s+", "")).isEmpty()) {
            return "";
        }
        try {
            double d = new ssh_3(string).sshw_2().tkz_4();
            return String.valueOf(d);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
            return string;
        }
    }

    @Generated
    private ghm() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    private static boolean shyd(class_1297 class_12972) {
        try {
            int n = 1520233897;
            n = Integer.rotateLeft(n * -463781173, 7) ^ 0x12DFC41B;
            int n2 = n ^ 0xF6C60679;
            if ((n2 ^ n) != -154794375) {
                int cfr_ignored_0 = (0xAC5AEBD0 ^ n) - -2027838602;
            }
            if ((0x1B0 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !class_12972.method_7325() && class_12972.method_5863();
    }

    private static boolean shth_6(AtomicBoolean atomicBoolean, class_2561 class_25612) {
        int n = 0;
        int n2 = 484331619;
        n2 = Integer.rotateLeft(n2 * -1520264717, 20) ^ 0x19256A;
        AtomicBoolean atomicBoolean2 = atomicBoolean;
        n2 = Integer.rotateRight((atomicBoolean2 != null ? System.identityHashCode(atomicBoolean2) : 0) ^ n2, 18);
        int n3 = n2 ^ 0x942CBB23;
        while (true) {
            block31: {
                block15: {
                    block22: {
                        block29: {
                            block23: {
                                block30: {
                                    block20: {
                                        block28: {
                                            block16: {
                                                block19: {
                                                    block21: {
                                                        block25: {
                                                            block27: {
                                                                block26: {
                                                                    block13: {
                                                                        block17: {
                                                                            block24: {
                                                                                block14: {
                                                                                    block18: {
                                                                                        if ((n = n3 ^ n2) == 1265089943) break block13;
                                                                                        if (n == -1120102150) break block14;
                                                                                        int cfr_ignored_0 = Integer.rotateLeft(0xDF518B69 ^ n2, 14) + 255688946;
                                                                                        int cfr_ignored_1 = (int)(0x1DE3255427D4EB4FL ^ (long)n2 ^ 0xB7D8831A2DB99617L);
                                                                                        if (n == -925309076) break block15;
                                                                                        if (n == 1868720904) break block16;
                                                                                        if (n == -1809007837) break block17;
                                                                                        if (n == 1303061860) break block18;
                                                                                        if (n == 206280660) break block19;
                                                                                        if (n == 917514743) break block20;
                                                                                        if (n == 92455620) break block21;
                                                                                        if (n == 702643044) break block22;
                                                                                        if (n == 363758877) break block23;
                                                                                        if (n == 642040807) break block24;
                                                                                        if (n == 1911018578) break block25;
                                                                                        if (n == -1284246425) break block26;
                                                                                        int cfr_ignored_2 = (Integer.rotateLeft(0x4F292115 ^ n2, 12) - -1705467706) * 1328095509;
                                                                                        int cfr_ignored_3 = (int)(0x8D9B8F2827D4EB4FL ^ (long)n2 ^ 0xE320831A2DB8B6E6L);
                                                                                        if (n == 1307276108) break block27;
                                                                                        if (n == 393835439) break block28;
                                                                                        if (n == -1472918878) break block29;
                                                                                        int cfr_ignored_4 = (Integer.rotateLeft(0x8D4E4459 ^ n2, 4) + 551020034) * -1924250535;
                                                                                        int cfr_ignored_5 = (int)(0x4FFCEA6427D4EB4FL ^ (long)n2 ^ 0x29B8831A2DB93228L);
                                                                                        if (n == -1229499816) break block30;
                                                                                        break block31;
                                                                                    }
                                                                                    int cfr_ignored_6 = Integer.rotateLeft(0x5878DB2C ^ n2, 14) - -1157617265;
                                                                                    if (class_25612.getString().contains("\u00eb\u0141\u0142\u0119\u0088\u0141\u0119".concat("\u0088\u0083\u00eb\u0141\u02db\u0119\u0088\u0141\u0119\u0088\u2026"))) {
                                                                                        int cfr_ignored_7 = (int)(0x7ED264FC7C58371EL ^ (long)n2 ^ 0x34883403951B5075L);
                                                                                        n3 = n2 ^ 0x2644C3E7;
                                                                                        n -= 2;
                                                                                        continue;
                                                                                    }
                                                                                    n3 = n2 ^ 0x20BC084;
                                                                                    int cfr_ignored_8 = Integer.rotateRight(0x37DCE44A ^ n2, 9) + -937606095;
                                                                                    n3 = (int)((long)(n2 ^ 0xBD3C98FA) ^ 0xE0E2ACFA9E164F40L ^ 0xE0E2ACFA9E164F40L);
                                                                                    n += 4;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_9 = (Integer.rotateRight(0x1D0B94D6 ^ n2, 6) - -2000378587) * 487298263;
                                                                                return true;
                                                                            }
                                                                            int cfr_ignored_10 = Integer.rotateRight(0x3750392A ^ n2, 9) + -1223390383;
                                                                            atomicBoolean.set(true);
                                                                            n3 = (int)((long)(n2 ^ 0x8475A18C) ^ 0xD416FE3CC9212627L ^ 0xD416FE3CC9212627L);
                                                                            int cfr_ignored_11 = Integer.rotateRight(0x7D8F523 ^ n2, 3) + -140292488;
                                                                            n3 = n2 ^ 0xBD3C98FA;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_12 = (Integer.rotateRight(0x85B62532 ^ n2, 3) + 896278601) * -2051660493;
                                                                        if (!yf.dnkh()) {
                                                                            n3 = n2 ^ 0x4DAB2564;
                                                                            n += 4;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_13 = (int)(0x4B1B1B608235A67AL ^ (long)n2 ^ 0xCBB1C8D8B7D33BE7L);
                                                                        n3 = n2 ^ 0x9FF11672;
                                                                        int cfr_ignored_14 = (int)(0xAAB06DC1ACC80497L ^ (long)n2 ^ 0x26F39523F208F8B1L);
                                                                        n3 = (n2 ^ 0x4B67BD97) + -1473683864 - -1473683864;
                                                                        n -= 5;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_15 = (Integer.rotateLeft(0x91F262BC ^ n2, 5) - -1330146305) * -1846385987;
                                                                    throw null;
                                                                }
                                                                int cfr_ignored_16 = Integer.rotateLeft(0x1030C308 ^ n2, 5) + -96125645;
                                                                n3 = n2 ^ 0xE185B64A;
                                                                int cfr_ignored_17 = Integer.rotateRight(0x5258BEE2 ^ n2, 13) + -48448359;
                                                                int cfr_ignored_18 = (int)(0x75D6F43FAC22570BL ^ (long)n2 ^ 0x150F94F75531467CL);
                                                                n3 = (int)((long)(n2 ^ 0x942CBB23) ^ 0xDDFF602A4D61539FL ^ 0xDDFF602A4D61539FL);
                                                                n -= 3;
                                                                continue;
                                                            }
                                                            int cfr_ignored_19 = Integer.rotateRight(0xBCDCDD82 ^ n2, 10) + -484675079;
                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x8956DCBF));
                                                            int cfr_ignored_20 = Integer.rotateRight(0xEF14AC2B ^ n2, 16) + -136415120;
                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x942CBB23));
                                                            n -= 5;
                                                            continue;
                                                        }
                                                        int cfr_ignored_21 = (Integer.rotateRight(0xC9A663DF ^ n2, 12) - 1870903100) * -911842337;
                                                        try {
                                                            n += 3;
                                                            if ((0x1713746B2A8528D7L ^ (long)n2 | 1L) == 0L) {
                                                                throw new ArithmeticException();
                                                            }
                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x942CBB23));
                                                        }
                                                        catch (ArithmeticException arithmeticException) {
                                                            n3 = n2 ^ 0x942CBB23;
                                                        }
                                                        n -= 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_22 = Integer.rotateLeft(0x44413CC5 ^ n2, 11) - 1212414742;
                                                    int cfr_ignored_23 = (int)(0x86F392F827D4EB4FL ^ (long)n2 ^ 0xD880831A2DB8A036L);
                                                    n3 = (n2 ^ 0x602B1929) + -606834147 - -606834147;
                                                    int cfr_ignored_24 = Integer.rotateLeft(0xF414FA0D ^ n2, 17) - -1830295858;
                                                    int cfr_ignored_25 = (int)(0x36A6543027D4EB4FL ^ (long)n2 ^ 0x5510831A2DB9C09DL);
                                                    try {
                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x942CBB23));
                                                    }
                                                    catch (NoSuchElementException noSuchElementException) {
                                                        n3 = (int)((long)(n2 ^ 0x942CBB23) ^ 0xA30EA1F1256DE94BL ^ 0xA30EA1F1256DE94BL);
                                                    }
                                                    continue;
                                                }
                                                int cfr_ignored_26 = Integer.rotateRight(0x36C6344F ^ n2, 9) - -1503791924;
                                                n3 = n2 ^ 0xDBB56A2A ^ 0x299ABC25 ^ 0x299ABC25;
                                                int cfr_ignored_27 = Integer.rotateLeft(0x66F1C805 ^ n2, 15) - 2074400726;
                                                int cfr_ignored_28 = (int)(0xA443663827D4EB4FL ^ (long)n2 ^ 0x3100831A2DB8E557L);
                                                n3 = (n2 ^ 0xB40403F9) + -1527751231 - -1527751231;
                                                int cfr_ignored_29 = Integer.rotateRight(0xA9BA3A8B ^ n2, 8) + -1846888944;
                                                n3 = (n2 ^ 0x942CBB23) + 356304987 - 356304987;
                                                n -= 5;
                                                continue;
                                            }
                                            int cfr_ignored_30 = (Integer.rotateLeft(0x2826E515 ^ n2, 8) - -518824762) * 673637653;
                                            int cfr_ignored_31 = (int)(0xEA944B2827D4EB4FL ^ (long)n2 ^ 0x6B20831A2DB878F9L);
                                            try {
                                                n -= 2;
                                                if ((0x4A534B35F4B5564BL ^ (long)n2 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                n3 = (n2 ^ 0x942CBB23) + 564982735 - 564982735;
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                n3 = (n2 ^ 0x942CBB23) + 1880572982 - 1880572982;
                                            }
                                            continue;
                                        }
                                        int cfr_ignored_32 = Integer.rotateLeft(0xB05B2E24 ^ n2, 9) - 1600664983;
                                        n3 = (n2 ^ 0x7D48AEC8) + -549359863 - -549359863;
                                        int cfr_ignored_33 = Integer.rotateLeft(0xB2C4A389 ^ n2, 9) + -1439863598;
                                        int cfr_ignored_34 = (int)(0x70760DB427D4EB4FL ^ (long)n2 ^ 0xE618831A2DB94D3DL);
                                        n3 = (n2 ^ 0x942CBB23) + 611202561 - 611202561;
                                        continue;
                                    }
                                    int cfr_ignored_35 = (Integer.rotateRight(0x4C6A489F ^ n2, 12) - 1161587324) * 1282033823;
                                    n3 = n2 ^ 0x942CBB23 ^ 0xF896BCFD ^ 0xF896BCFD;
                                    int cfr_ignored_36 = Integer.rotateRight(0x56B3AD8F ^ n2, 13) - -2078301300;
                                    continue;
                                }
                                int cfr_ignored_37 = Integer.rotateLeft(0xEBC35185 ^ n2, 16) - -1861976490;
                                int cfr_ignored_38 = (int)(0x2971FFB827D4EB4FL ^ (long)n2 ^ 0x200831A2DB9FF32L);
                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0xBAEE426F));
                                int cfr_ignored_39 = Integer.rotateRight(0x1BD725E7 ^ n2, 6) - 1667970612;
                                n3 = n2 ^ 0xC36F86BD ^ 0x21BAE77 ^ 0x21BAE77;
                                int cfr_ignored_40 = Integer.rotateRight(0xDBE7E98B ^ n2, 14) + -1519196400;
                                n3 = (n2 ^ 0x942CBB23) + 2049458630 - 2049458630;
                                continue;
                            }
                            int cfr_ignored_41 = (Integer.rotateLeft(0xBB67559C ^ n2, 10) - -1243546337) * -1150855779;
                            n3 = n2 ^ 0x942CBB23 ^ 0x9EC2351 ^ 0x9EC2351;
                            int cfr_ignored_42 = (Integer.rotateRight(0xBC01D2B6 ^ n2, 10) - -929684667) * -1140731209;
                            n -= 2;
                            continue;
                        }
                        int cfr_ignored_43 = Integer.rotateLeft(0xCE9490E8 ^ n2, 12) + 140192595;
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xDC05DEAE));
                        int cfr_ignored_44 = Integer.rotateLeft(0x746B5309 ^ n2, 17) + 492612946;
                        int cfr_ignored_45 = (int)(0xB6D9FD3427D4EB4FL ^ (long)n2 ^ 0x718831A2DB8C062L);
                        n3 = n2 ^ 0xD112F79B;
                        int cfr_ignored_46 = (Integer.rotateRight(0xB370E537 ^ n2, 9) - -1089904412) * -1284446921;
                        n3 = (int)((long)(n2 ^ 0x942CBB23) ^ 0x632BFE6C8625A955L ^ 0x632BFE6C8625A955L);
                        n += 3;
                        continue;
                    }
                    int cfr_ignored_47 = (Integer.rotateRight(0x163AD4BF ^ n2, 5) - -1250074020) * 372954303;
                    n3 = n2 ^ 0x35431DB2 ^ 0xA453DDBD ^ 0xA453DDBD;
                    int cfr_ignored_48 = Integer.rotateRight(0xB4E012B ^ n2, 4) + 1657783152;
                    n3 = n2 ^ 0x44C25C43 ^ 0x6780D280 ^ 0x6780D280;
                    int cfr_ignored_49 = (Integer.rotateLeft(0xDBBCDED1 ^ n2, 14) + -1606641014) * -608379183;
                    int cfr_ignored_50 = (int)(0x190E70EC27D4EB4FL ^ (long)n2 ^ 0x1CA8831A2DB99FCDL);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x942CBB23));
                    n -= 4;
                    continue;
                }
                int cfr_ignored_51 = Integer.rotateLeft(0x47198E01 ^ n2, 11) + -1602891430;
                int cfr_ignored_52 = (int)(0x85AB203C27D4EB4FL ^ (long)n2 ^ 0xBD08831A2DB8A687L);
                try {
                    n -= 4;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x942CBB23));
                }
                catch (IllegalStateException illegalStateException) {
                    n3 = n2 ^ 0x942CBB23;
                }
                continue;
            }
            int cfr_ignored_53 = Integer.rotateLeft(0x7FB35FA0 ^ n2, 18) + 2065052571;
            n3 = n2 ^ 0x942CBB23;
        }
    }

    private static String atth(String string, int n, int n2, int n3) {
        try {
            int n4 = -623887091;
            n4 = Integer.rotateLeft(n4 * -256067221, 4) ^ 0x2CDAA67E;
            n4 = Integer.rotateLeft(n ^ n4, 28);
            n4 = n2 ^ n4;
            int n5 = n4 ^ 0x67E37DC6;
            if ((n5 ^ n4) != 1742962118) {
                int cfr_ignored_0 = (0xBD3340CB ^ n4) + -240978403;
            }
            if ((0x2A3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x90A96DA2 ^ n2 - i) + shthn, 4) ^ rab + i * 496611235));
        }
        return new String(cArray);
    }

    private static boolean ass_3() {
        block0: {
            int n = 68904272;
            int n2 = (n = Integer.rotateLeft(n * -92405217, 14) ^ 0x30F3C64) ^ 0xC526DD04;
            if ((n2 ^ n) == -987308796) break block0;
            int cfr_ignored_0 = (0xC13DB854 ^ n) + 1639385245;
        }
        return yf.khdha_2();
    }

    private static double sds_3(long l) {
        block0: {
            int n = -1818303605;
            n = Integer.rotateLeft(n * -554631361, 21) ^ 0x2C43E669;
            int n2 = (n = (int)l ^ n) ^ 0xF227D995;
            if ((n2 ^ n) == -232269419) break block0;
            int cfr_ignored_0 = (0x61B93A1E ^ n) + -1290171497;
        }
        return Double.longBitsToDouble(l);
    }

    private static double trth(long l) {
        block0: {
            int n = zd_3.sdhk_2(1916068053);
            int n2 = n ^ 0x74F84AD;
            if ((n2 ^ n) == 122651821) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x757B6478 ^ n, 17) + 1045350851) * 1971020921;
        }
        return Double.longBitsToDouble(l);
    }

    private static double sydh_2(double d, double d2) {
        block0: {
            int n = -348210083;
            n = Integer.rotateLeft(n * -1734507775, 11) ^ 0xE4139C84;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 16);
            int n2 = n ^ 0xF61C4165;
            if ((n2 ^ n) == -165920411) break block0;
            int cfr_ignored_0 = (0x1D22FD38 ^ n) - -1623579702;
        }
        return Math.pow(d, d2);
    }

    private static double ztd_5(long l) {
        block0: {
            int n = -501469209;
            int n2 = (n = Integer.rotateLeft(n * -1071694627, 24) ^ 0x1C1E8825) ^ 0x7A5BBE85;
            if ((n2 ^ n) == 2052832901) break block0;
            int cfr_ignored_0 = (0x98479162 ^ n) + 517613466;
        }
        return Double.longBitsToDouble(l);
    }

    private static class_3965 ajd(class_638 class_6382, class_3959 class_39592) {
        block0: {
            int n = -475842356;
            n = Integer.rotateLeft(n * -1991055891, 4) ^ 0xB1D6BDCA;
            class_638 class_6383 = class_6382;
            n = (class_6383 != null ? System.identityHashCode(class_6383) : 0) ^ n;
            class_3959 class_39593 = class_39592;
            n = (class_39593 != null ? System.identityHashCode(class_39593) : 0) ^ n;
            int n2 = n ^ 0x7B9EB474;
            if ((n2 ^ n) == 2073998452) break block0;
            int cfr_ignored_0 = (0x983D8CB8 ^ n) + -144065541;
        }
        return class_6382.method_17742(class_39592);
    }

    private static class_239.class_240 btt(class_3965 class_39652) {
        block0: {
            int n = zd_3.sdhk_2(297087010);
            class_3965 class_39653 = class_39652;
            n = Integer.rotateRight((class_39653 != null ? System.identityHashCode(class_39653) : 0) ^ n, 4);
            int n2 = n ^ 0x7E746F27;
            if ((n2 ^ n) == 2121559847) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x6FC15F05 ^ n, 16) - -1933041450;
            int cfr_ignored_1 = (int)(0xAD73F13827D4EB4FL ^ (long)n ^ 0x1F00831A2DB8F736L);
        }
        return class_39652.method_17783();
    }

    private static class_243 hzn_2(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = zd_3.sdhk_2(1345615123);
            int n2 = n ^ 0xEB2FCB44;
            if ((n2 ^ n) == -349189308) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xBB1BBE57 ^ n, 10) - -1397118012) * -1155809705;
        }
        return class_2432.method_1020(class_2433);
    }

    private static double dzgh(class_243 class_2432) {
        block0: {
            int n = -1490131626;
            int n2 = (n = Integer.rotateLeft(n * 1811186809, 14) ^ 0xC34D6D6F) ^ 0xDCD6790D;
            if ((n2 ^ n) == -589924083) break block0;
            int cfr_ignored_0 = (0x7BF81C5B ^ n) + 909766497;
        }
        return class_2432.method_1033();
    }

    private static class_243 hlth(class_243 class_2432) {
        block0: {
            int n = -1493378058;
            int n2 = (n = Integer.rotateLeft(n * 485482151, 24) ^ 0x92B43EC2) ^ 0x5C9179FD;
            if ((n2 ^ n) == 1553037821) break block0;
            int cfr_ignored_0 = (0xFA6DA20B ^ n) - -1776614631;
        }
        return class_2432.method_1029();
    }

    private static class_2680 rwr(class_638 class_6382, class_2338 class_23382) {
        block0: {
            int n = -1803137903;
            n = Integer.rotateLeft(n * -413681033, 27) ^ 0x39DEE7B0;
            class_638 class_6383 = class_6382;
            n = (class_6383 != null ? System.identityHashCode(class_6383) : 0) ^ n;
            class_2338 class_23383 = class_23382;
            n = Integer.rotateLeft((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 23);
            int n2 = n ^ 0x344165FD;
            if ((n2 ^ n) == 876701181) break block0;
            int cfr_ignored_0 = (0xA0C7296C ^ n) - 1422638907;
        }
        return class_6382.method_8320(class_23382);
    }

    private static class_2248 shnd(class_2680 class_26802) {
        block0: {
            int n = -2072761808;
            n = Integer.rotateLeft(n * 1554707447, 10) ^ 0x347A41B9;
            class_2680 class_26803 = class_26802;
            n = Integer.rotateLeft((class_26803 != null ? System.identityHashCode(class_26803) : 0) ^ n, 11);
            int n2 = n ^ 0xBC3583AE;
            if ((n2 ^ n) == -1137343570) break block0;
            int cfr_ignored_0 = (0x3841A99E ^ n) - 1212452264;
        }
        return class_26802.method_26204();
    }

    private static class_337 ghbz(class_329 class_3292) {
        block0: {
            int n = 1663154475;
            n = Integer.rotateLeft(n * -13243629, 3) ^ 0xC8C28AF2;
            class_329 class_3293 = class_3292;
            n = (class_3293 != null ? System.identityHashCode(class_3293) : 0) ^ n;
            int n2 = n ^ 0x5C880A3B;
            if ((n2 ^ n) == 1552419387) break block0;
            int cfr_ignored_0 = (0x3FA9B310 ^ n) - 700418882;
        }
        return class_3292.method_1740();
    }

    private static int snz_2(int n) {
        block0: {
            int n2 = -508658614;
            n2 = Integer.rotateLeft(n2 * 29699433, 7) ^ 0xE0E051E7;
            int n3 = (n2 = n ^ n2) ^ 0x8942C4D8;
            if ((n3 ^ n2) == -1992112936) break block0;
            int cfr_ignored_0 = (0x68ECB892 ^ n2) - 13348150;
        }
        return Integer.reverse(n);
    }

    private static String tdhd_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1005907131;
            n4 = Integer.rotateLeft(n4 * -763004493, 27) ^ 0x672A7877;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0xBBBCB6D9;
            if ((n5 ^ n4) == -1145260327) break block0;
            int cfr_ignored_0 = (0x7FB7A59C ^ n4) + 665640590;
        }
        return ghm.atth(string, n, n2, n3);
    }

    private static class_2561 btb_2(class_345 class_3452) {
        block0: {
            int n = zd_3.sdhk_2(-497730004);
            int n2 = n ^ 0x17951F90;
            if ((n2 ^ n) == 395648912) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xF5C021BC ^ n, 17) - -962480897) * -171957827;
        }
        return class_3452.method_5414();
    }

    private static char dkhs(String string, int n) {
        block0: {
            int n2 = zd_3.sdhk_2(-315504321);
            String string2 = string;
            n2 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n2;
            int n3 = (n2 = n ^ n2) ^ 0xD7EC5097;
            if ((n3 ^ n2) == -672378729) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x3ADD99A8 ^ n2, 10) + 624114323;
        }
        return string.charAt(n);
    }

    private static int ghkhth(int n, int n2) {
        block0: {
            int n3 = zd_3.sdhk_2(445446934);
            int n4 = n3 ^ 0x16387BB3;
            if ((n4 ^ n3) == 372800435) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xCB480A5 ^ n3, 4) - -1908853962;
            int cfr_ignored_1 = (int)(0xCE062E9827D4EB4FL ^ (long)n3 ^ 0xA040831A2DB831DDL);
        }
        return Math.min(n, n2);
    }

    private static int ddhw() {
        block0: {
            int n = zd_3.sdhk_2(-749855965);
            int n2 = n ^ 0x73EDD35F;
            if ((n2 ^ n) == 1944965983) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xA0A3C87C ^ n, 7) - 2016601663) * -1599879043;
        }
        return yf.tdhth_2();
    }

    private static void thl() {
        int n = 227839100;
        int n2 = (n = Integer.rotateLeft(n * 167877085, 17) ^ 0xF68C8AF2) ^ 0xD82C5C16;
        if ((n2 ^ n) != -668181482) {
            int cfr_ignored_0 = (0xD5B8D06A ^ n) - 1250352288;
        }
        yf.athz_2();
    }

    private static class_238 dhnq(class_1297 class_12972) {
        block0: {
            int n = zd_3.sdhk_2(-961149951);
            int n2 = n ^ 0x5DDEEDDE;
            if ((n2 ^ n) == 0x5DDEEDDE) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x9B68E9DF ^ n, 6) - -703467204) * -1687623201;
        }
        return class_12972.method_5829();
    }

    private static float sth_4(class_1297 class_12972) {
        block0: {
            int n = zd_3.sdhk_2(-12906516);
            class_1297 class_12973 = class_12972;
            n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
            int n2 = n ^ 0xC4976A37;
            if ((n2 ^ n) == -996709833) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x3BAC65DB ^ n, 10) + 1044247744) * 1001154011;
        }
        return class_12972.method_5871();
    }

    private static boolean khjz(class_238 class_2383, class_243 class_2432) {
        block0: {
            int n = -1111934940;
            n = Integer.rotateLeft(n * 173705939, 14) ^ 0x76E917B8;
            class_243 class_2433 = class_2432;
            n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
            int n2 = n ^ 0xFEEBF4E7;
            if ((n2 ^ n) == -18090777) break block0;
            int cfr_ignored_0 = (0x4352CCC3 ^ n) - 716355036;
        }
        return class_2383.method_1006(class_2432);
    }

    private static Object tqt_3(Optional optional) {
        block0: {
            int n = -863635113;
            n = Integer.rotateLeft(n * -1961295393, 25) ^ 0x3F9108A0;
            Optional optional2 = optional;
            n = (optional2 != null ? System.identityHashCode(optional2) : 0) ^ n;
            int n2 = n ^ 0x44C66C71;
            if ((n2 ^ n) == 1153854577) break block0;
            int cfr_ignored_0 = (0x88439526 ^ n) - -830798720;
        }
        return optional.get();
    }

    private static double sthz_3(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = 1300516809;
            n = Integer.rotateLeft(n * 1161139007, 27) ^ 0x34B1E7B6;
            class_243 class_2434 = class_2433;
            n = (class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n;
            int n2 = n ^ 0xEF99634C;
            if ((n2 ^ n) == -275160244) break block0;
            int cfr_ignored_0 = (0xA21D2C85 ^ n) - 559925925;
        }
        return class_2432.method_1025(class_2433);
    }

    private static class_9779 tqf(class_310 class_3102) {
        block0: {
            int n = 1796651934;
            n = Integer.rotateLeft(n * 1940479581, 9) ^ 0x6E42B15D;
            class_310 class_3103 = class_3102;
            n = Integer.rotateRight((class_3103 != null ? System.identityHashCode(class_3103) : 0) ^ n, 21);
            int n2 = n ^ 0x8BF533E4;
            if ((n2 ^ n) == -1946864668) break block0;
            int cfr_ignored_0 = (0xE0E3887A ^ n) + 811884928;
        }
        return class_3102.method_61966();
    }

    private static class_243 bwj(class_1297 class_12972, float f) {
        block0: {
            int n = zd_3.sdhk_2(-2012856439);
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x72432340;
            if ((n2 ^ n) == 1917002560) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xFA451CC9 ^ n, 18) + 1388059538;
            int cfr_ignored_1 = (int)(0x38F7B2F427D4EB4FL ^ (long)n ^ 0x9898831A2DB9DC3EL);
        }
        return class_12972.method_5836(f);
    }

    private static class_243 ww(class_238 class_2383) {
        block0: {
            int n = zd_3.sdhk_2(-1614565936);
            class_238 class_2384 = class_2383;
            n = (class_2384 != null ? System.identityHashCode(class_2384) : 0) ^ n;
            int n2 = n ^ 0x261BAE6;
            if ((n2 ^ n) == 39959270) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x9DA21736 ^ n, 6) - 452882117) * -1650321609;
        }
        return class_2383.method_1005();
    }

    private static class_243 dnz_2(float f, float f2) {
        block0: {
            int n = -852184824;
            n = Integer.rotateLeft(n * 839441789, 20) ^ 0xAD28D270;
            n = Float.floatToIntBits(f) ^ n;
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0xDDF132F1;
            if ((n2 ^ n) == -571395343) break block0;
            int cfr_ignored_0 = (0x10C583F9 ^ n) + -824238299;
        }
        return ghm.aagh_2(f, f2);
    }

    private static class_238 rzm_2(class_1297 class_12972) {
        block0: {
            int n = -305365329;
            n = Integer.rotateLeft(n * 2050934529, 13) ^ 0x77535553;
            class_1297 class_12973 = class_12972;
            n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
            int n2 = n ^ 0xE3CEBE9B;
            if ((n2 ^ n) == -472990053) break block0;
            int cfr_ignored_0 = (0xE02C034 ^ n) - -1490064465;
        }
        return class_12972.method_5829();
    }

    private static class_238 zbsh(class_238 class_2383, double d) {
        block0: {
            int n = zd_3.sdhk_2(732995813);
            int n2 = n ^ 0xAF993388;
            if ((n2 ^ n) == -1348914296) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x8429936D ^ n, 3) - 90601838;
            int cfr_ignored_1 = (int)(0x469B3D5027D4EB4FL ^ (long)n ^ 0x87D0831A2DB920E7L);
        }
        return class_2383.method_1014(d);
    }

    private static boolean stt_5() {
        block0: {
            int n = 1808968363;
            int n2 = (n = Integer.rotateLeft(n * -844491781, 12) ^ 0x54E1F790) ^ 0x9FEC95C5;
            if ((n2 ^ n) == -1611885115) break block0;
            int cfr_ignored_0 = (0xF43E3F6E ^ n) - -623851158;
        }
        return yf.khdha_2();
    }

    private static String[] thsht(String string) {
        int n = 164113384;
        int n2 = (n = Integer.rotateLeft(n * 2080434881, 17) ^ 0x29E7CA5A) ^ 0x346AD6EF;
        if ((n2 ^ n) != 879417071) {
            int cfr_ignored_0 = (0x3DA2FD07 ^ n) + -1466261493;
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

    private static CallSite ad(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -589413168;
            n3 = Integer.rotateLeft(n3 * -769813949, 9) ^ 0xF475F4D5;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 19);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xCD0EEAA2;
            if ((n4 ^ n3) != -854660446) {
                int cfr_ignored_0 = (0x11D0AE72 ^ n3) + -91599042;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bwdh ^ string.hashCode()) + (n2 + ddy) + i ^ bwdh, 8) + ddy);
            }
            String[] stringArray = ghm.thsht(new String(cArray));
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

    private static String[] vnt5lbso8gca(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite jewdzviajgjw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ m8pml400 ^ string.hashCode()) + (n2 + su5v78wwywm5o) + i ^ m8pml400, 14) + su5v78wwywm5o);
            }
            String[] stringArray = ghm.vnt5lbso8gca(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

