/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1743
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1819
 *  net.minecraft.class_1829
 *  net.minecraft.class_1835
 *  net.minecraft.class_746
 *  net.minecraft.class_9362
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1743;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1819;
import net.minecraft.class_1829;
import net.minecraft.class_1835;
import net.minecraft.class_746;
import net.minecraft.class_9362;
import us.m0vy.moondlc.m0vyguard.bdl;
import us.m0vy.moondlc.m0vyguard.brh_2;
import us.m0vy.moondlc.m0vyguard.bfn;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.ns;
import us.m0vy.moondlc.m0vyguard.yf;

public class lkh
implements dl {
    private static final int bfs = 616273561;
    private static final int bghk = 1838404368;
    private static final int w5z0ek9 = 2038746649;
    private static final int a00j5g42ykjc = -1357682075;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int tght9fakya;

    public boolean thh_2(class_1657 class_16572, boolean bl) {
        int n = 727200852;
        n = Integer.rotateLeft(n * 1600191365, 10) ^ 0xD777D341;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 13);
        class_1657 class_16573 = class_16572;
        n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
        int n2 = n ^ 0x8CA091B;
        if ((n2 ^ n) != 147458331) {
            int cfr_ignored_0 = (0x23923D4F ^ n) - -1430750796;
        }
        if (!lkh.khlth()) {
            yf.athz_2();
        }
        if (lkh.mc.field_1724 == null || lkh.mc.field_1761 == null || !lkh.rha_4(this, class_16572)) {
            return false;
        }
        int n3 = this.skht_2(true);
        int n4 = this.skht_2(false);
        if (bl && n3 != -1) {
            return lkh.rhs(this, class_16572, n3, true);
        }
        if (n3 != -1) {
            return this.fl(() -> this.bay_2(class_16572, n3), bl ? 0xB5C0F37B ^ 0xB5C0F358 : 779327320 - 779327170);
        }
        if (n4 != -1) {
            return this.fl(() -> this.syn_2(class_16572, n4, bl), bl ? lkh.shhn_2(0xED505ACC ^ 0xED505A9C, 29) : -1075695548 + 1075695583);
        }
        return false;
    }

    private boolean fl(brh_2 brh2, int n) {
        boolean bl = false;
        int n2 = 0;
        int n3 = -1815576766;
        n3 = Integer.rotateLeft(n3 * 1830088495, 21) ^ 0xA70DC113;
        brh_2 brh3 = brh2;
        n3 = (brh3 != null ? System.identityHashCode(brh3) : 0) ^ n3;
        int n4 = Integer.reverse(n3 ^ 0x80D4645E ^ 0x6B4A0BBB) + -1331610232 - -1331610232;
        block28: while (true) {
            switch (Integer.reverse(n4) ^ n3 ^ 0x6B4A0BBB) {
                case -2133564322: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0x981AB9F5 ^ n3, 6) - 1872372710) * -1743078923;
                    int cfr_ignored_1 = (int)(0x5AA817C827D4EB4FL ^ (long)n3 ^ 0xD2E0831A2DB91881L);
                    if (!ns.stsh_4()) {
                        n4 = Integer.reverse(Integer.reverse(Integer.reverse(n3 ^ 0x1151987F ^ 0x6B4A0BBB)));
                        n2 -= 5;
                        continue block28;
                    }
                    try {
                        n4 = Integer.reverse(n3 ^ 0xE29CBAAE ^ 0x6B4A0BBB) + -84980299 - -84980299;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n4 = Integer.reverse(n3 ^ 0xE29CBAAE ^ 0x6B4A0BBB);
                    }
                    n2 += 3;
                    continue block28;
                }
                case 290560127: {
                    int cfr_ignored_2 = (Integer.rotateLeft(0xB1F90DDC ^ n3, 9) - -1853469473) * -1309078051;
                    bl = brh2.run();
                    try {
                        n4 = Integer.reverse(n3 ^ 0xC717FA31 ^ 0x6B4A0BBB) ^ 0x5AC2321 ^ 0x5AC2321;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n4 = Integer.reverse(n3 ^ 0xC717FA31 ^ 0x6B4A0BBB) ^ 0x8D390850 ^ 0x8D390850;
                    }
                    continue block28;
                }
                case -493045074: {
                    int cfr_ignored_3 = (Integer.rotateRight(0xA7B465B6 ^ n3, 7) - 1396043845) * -1481349705;
                    lkh.hss(n, brh2::run);
                    bl = true;
                    try {
                        --n2;
                        n4 = Integer.reverse(n3 ^ 0xC717FA31 ^ 0x6B4A0BBB);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n4 = Integer.reverse(n3 ^ 0xC717FA31 ^ 0x6B4A0BBB);
                    }
                    n2 -= 5;
                    continue block28;
                }
                case 228413687: {
                    int cfr_ignored_4 = Integer.rotateRight(0x582BA90F ^ n3, 14) - -1314449396;
                    n4 = Integer.reverse(n3 ^ 0x49894624 ^ 0x6B4A0BBB) ^ 0x36FA93F0 ^ 0x36FA93F0;
                    int cfr_ignored_5 = (Integer.rotateRight(0x1096379B ^ n3, 5) + 109992704) * 278280091;
                    n4 = Integer.reverse(n3 ^ 0x80D4645E ^ 0x6B4A0BBB) + -2140465328 - -2140465328;
                    ++n2;
                    continue block28;
                }
                case -125146127: {
                    int cfr_ignored_6 = Integer.rotateRight(0xE9C39A2E ^ n3, 16) - 1393380045;
                    try {
                        if ((0x51D239D8C8DCABF3L ^ (long)n3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n4 = Integer.reverse(Integer.reverse(Integer.reverse(n3 ^ 0x80D4645E ^ 0x6B4A0BBB)));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n4 = (int)((long)Integer.reverse(n3 ^ 0x80D4645E ^ 0x6B4A0BBB) ^ 0xA8DBB852ED23AB78L ^ 0xA8DBB852ED23AB78L);
                    }
                    n2 += 2;
                    continue block28;
                }
                case -165161046: {
                    int cfr_ignored_7 = (Integer.rotateRight(0x25515436 ^ n3, 7) - -1992896059) * 626086967;
                    n4 = (int)((long)Integer.reverse(n3 ^ 0x32A00347 ^ 0x6B4A0BBB) ^ 0x8A340B48EC8D3C85L ^ 0x8A340B48EC8D3C85L);
                    int cfr_ignored_8 = Integer.rotateRight(0xB891AE0F ^ n3, 10) - 1577169676;
                    n4 = Integer.reverse(n3 ^ 0xF86E2A5E ^ 0x6B4A0BBB) ^ 0x76FAB02F ^ 0x76FAB02F;
                    int cfr_ignored_9 = Integer.rotateRight(0xB521CC2B ^ n3, 9) + -210413456;
                    n4 = Integer.reverse(n3 ^ 0x80D4645E ^ 0x6B4A0BBB) ^ 0x36DC3D83 ^ 0x36DC3D83;
                    --n2;
                    continue block28;
                }
                case 1991882260: {
                    int cfr_ignored_10 = Integer.rotateRight(0x98F91C0E ^ n3, 6) - -1970797331;
                    n4 = Integer.reverse(n3 ^ 0x51A87154 ^ 0x6B4A0BBB) + 414328043 - 414328043;
                    int cfr_ignored_11 = Integer.rotateLeft(0xA3CBB625 ^ n3, 7) - -636965450;
                    int cfr_ignored_12 = (int)(0x6179181827D4EB4FL ^ (long)n3 ^ 0xCD40831A2DB96F23L);
                    n4 = Integer.reverse(n3 ^ 0x80D4645E ^ 0x6B4A0BBB) + 1746318031 - 1746318031;
                    n2 += 5;
                    continue block28;
                }
                case -1264196305: {
                    int cfr_ignored_13 = Integer.rotateLeft(0x6293C9A5 ^ n3, 15) - -196933066;
                    int cfr_ignored_14 = (int)(0xA021679827D4EB4FL ^ (long)n3 ^ 0x3240831A2DB8ED93L);
                    try {
                        --n2;
                        if ((0xDFE0898A8DAD945DL ^ (long)n3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n4 = Integer.reverse(n3 ^ 0x80D4645E ^ 0x6B4A0BBB) ^ 0x38E1F38B ^ 0x38E1F38B;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n4 = (int)((long)Integer.reverse(n3 ^ 0x80D4645E ^ 0x6B4A0BBB) ^ 0x8EA5CF677947ED08L ^ 0x8EA5CF677947ED08L);
                    }
                    n2 += 2;
                    continue block28;
                }
                case -1464941854: {
                    int cfr_ignored_15 = (Integer.rotateLeft(0x5BED6F18 ^ n3, 14) + 639505187) * 1542287129;
                    n4 = Integer.reverse(n3 ^ 0xC41D1A80 ^ 0x6B4A0BBB);
                    int cfr_ignored_16 = (Integer.rotateRight(0x80514ABE ^ n3, 3) - -1909085123) * -2142156097;
                    try {
                        n2 += 4;
                        if ((0x68D21DB952FA827L ^ (long)n3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n4 = Integer.reverse(n3 ^ 0x80D4645E ^ 0x6B4A0BBB);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n4 = Integer.reverse(n3 ^ 0x80D4645E ^ 0x6B4A0BBB) ^ 0x4A67A65F ^ 0x4A67A65F;
                    }
                    --n2;
                    continue block28;
                }
                case -2138106259: {
                    int cfr_ignored_17 = (Integer.rotateRight(0x9B643916 ^ n3, 6) - -712996635) * -1687930601;
                    n4 = Integer.reverse(n3 ^ 0x5A29A0DC ^ 0x6B4A0BBB);
                    int cfr_ignored_18 = (Integer.rotateRight(0x19F2E95B ^ n3, 6) + 684187968) * 435349851;
                    n4 = Integer.reverse(n3 ^ 0x7D869091 ^ 0x6B4A0BBB) + 338540676 - 338540676;
                    int cfr_ignored_19 = (Integer.rotateRight(0x81E1397B ^ n3, 3) + -1096575712) * -2115946117;
                    n4 = (int)((long)Integer.reverse(n3 ^ 0x80D4645E ^ 0x6B4A0BBB) ^ 0xE08E3A69CFC465ABL ^ 0xE08E3A69CFC465ABL);
                    continue block28;
                }
                case -164809542: {
                    int cfr_ignored_20 = Integer.rotateRight(0x812C18E2 ^ n3, 3) + -1464556903;
                    n4 = Integer.reverse(Integer.reverse(Integer.reverse(n3 ^ 0xBBA2CE4E ^ 0x6B4A0BBB)));
                    int cfr_ignored_21 = Integer.rotateLeft(0xF56E2609 ^ n3, 17) + -1129039278;
                    int cfr_ignored_22 = (int)(0x37DC883427D4EB4FL ^ (long)n3 ^ 0xED18831A2DB9C268L);
                    n4 = Integer.reverse(n3 ^ 0x80D4645E ^ 0x6B4A0BBB) + 441431344 - 441431344;
                    n2 -= 4;
                    continue block28;
                }
                case -1399832079: {
                    int cfr_ignored_23 = (Integer.rotateLeft(0x7A24BBD ^ n3, 3) - -251344098) * 128076733;
                    int cfr_ignored_24 = (int)(0xC510E58027D4EB4FL ^ (long)n3 ^ 0x3670831A2DB827F0L);
                    n4 = Integer.reverse(n3 ^ 0x80D4645E ^ 0x6B4A0BBB) ^ 0x75F72C1D ^ 0x75F72C1D;
                    n2 += 2;
                    continue block28;
                }
                case -1223004261: {
                    int cfr_ignored_25 = (Integer.rotateRight(0x7356FF3F ^ n3, 17) - -68778020) * 1935081279;
                    n4 = Integer.reverse(Integer.reverse(Integer.reverse(n3 ^ 0x3D177F20 ^ 0x6B4A0BBB)));
                    int cfr_ignored_26 = Integer.rotateRight(0x1335A76B ^ n3, 5) + 1474094384;
                    n4 = Integer.reverse(n3 ^ 0x80D4645E ^ 0x6B4A0BBB) + 837216716 - 837216716;
                    n2 += 5;
                    continue block28;
                }
                case -954729935: {
                    return bl;
                }
            }
            int cfr_ignored_27 = (Integer.rotateRight(0x71106392 ^ n3, 17) + -1252413975) * 1896899475;
            n4 = Integer.reverse(n3 ^ 0x80D4645E ^ 0x6B4A0BBB) ^ 0x1935F894 ^ 0x1935F894;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean tshl(class_1657 class_16572, int n, boolean bl) {
        block8: {
            try {
                int n2 = -2073139652;
                n2 = Integer.rotateLeft(n2 * 955685519, 9) ^ 0x23685BAA;
                n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 29);
                class_1657 class_16573 = class_16572;
                n2 = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n2;
                int n3 = n2 ^ 0x335D74DF;
                if ((n3 ^ n2) != 861762783) {
                    int cfr_ignored_0 = (0xB73312E3 ^ n2) + -1947196462;
                }
                if ((0x3E2 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            int n4 = lkh.mc.field_1724.method_31548().field_7545;
            if (n != n4) {
                lkh.mc.field_1724.method_31548().field_7545 = n;
            }
            try {
                lkh.zthz(this, class_16572);
                if (n == n4) break block8;
                lkh.mc.field_1724.method_31548().field_7545 = n4;
            }
            catch (Throwable throwable) {
                if (n != n4) {
                    lkh.zkh_2((class_746)lkh.mc.field_1724).field_7545 = n4;
                    lkh.das_8(n4);
                }
                throw throwable;
            }
            bfn.hhz_4(n4);
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean dzd_5(class_1657 class_16572, int n, boolean bl) {
        int n2;
        block9: {
            int n3 = 1489771099;
            n3 = Integer.rotateLeft(n3 * 481914271, 24) ^ 0xD1E9328C;
            n3 = System.identityHashCode(this) ^ n3;
            class_1657 class_16573 = class_16572;
            n3 = Integer.rotateLeft((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n3, 20);
            int n4 = n3 ^ 0x943B60CC;
            if ((n4 ^ n3) != -1808047924) {
                int cfr_ignored_0 = (0xCCF77A97 ^ n3) - -1886771315;
            }
            if (yf.dnkh()) {
                throw null;
            }
            n2 = this.sas_8();
            if (n2 == -1) {
                return false;
            }
            int n5 = lkh.rdht((class_746)lkh.mc.field_1724).field_7545;
            bfn.thght_2(n, n2);
            try {
                if (n2 != n5) {
                    lkh.mc.field_1724.method_31548().field_7545 = n2;
                }
                try {
                    lkh.twm_2(this, class_16572);
                    if (n2 == n5) break block9;
                    lkh.mc.field_1724.method_31548().field_7545 = n5;
                }
                catch (Throwable throwable) {
                    if (n2 != n5) {
                        lkh.khty((class_746)lkh.mc.field_1724).field_7545 = n5;
                        bfn.hhz_4(n5);
                    }
                    throw throwable;
                }
                bfn.hhz_4(n5);
            }
            catch (Throwable throwable) {
                bfn.thght_2(n, n2);
                throw throwable;
            }
        }
        lkh.thdr_2(n, n2);
        return true;
    }

    private void zdsh_4(class_1657 class_16572) {
        try {
            int n = 1340640172;
            n = Integer.rotateLeft(n * -842701635, 14) ^ 0x4B1DCEE;
            n = System.identityHashCode(this) ^ n;
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0x69C91D62;
            if ((n2 ^ n) != 1774787938) {
                int cfr_ignored_0 = (0x262196CE ^ n) + -308066274;
            }
            if ((0x80 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        lkh.mc.field_1761.method_2918((class_1657)lkh.mc.field_1724, (class_1297)class_16572);
        lkh.ghbm(lkh.mc.field_1724, class_1268.field_5808);
    }

    private boolean tky(class_1657 class_16572) {
        int n = bdl.hghj(406786469);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 18);
        int n2 = n ^ 0x25EDAC2F;
        if ((n2 ^ n) != 636333103) {
            int cfr_ignored_0 = Integer.rotateRight(0x3DD2BD8A ^ n, 10) + -2132634895;
        }
        if (class_16572 == null || !lkh.dhrd_2(class_16572)) {
            int n3 = 0;
            if (yf.tdhth_2() == 0) {
                n3 = n3 ^ 0x7C9;
            }
            return n3 != 0;
        }
        return lkh.hzz(this, class_16572) || class_16572.method_6039() && lkh.ts_3(this, class_16572);
    }

    private boolean trf(class_1657 class_16572) {
        try {
            int n = -632096234;
            n = Integer.rotateLeft(n * 2055806501, 14) ^ 0x2E43A9A4;
            int n2 = n ^ 0x322B61F7;
            if ((n2 ^ n) != 841703927) {
                int cfr_ignored_0 = (0xE8799BE1 ^ n) - 1406910602;
            }
            if ((0x201 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return lkh.shtsh_2(class_16572).method_7909() instanceof class_1819 || lkh.khah_3(class_16572.method_6079()) instanceof class_1819;
    }

    private boolean aaw(class_1657 class_16572) {
        block0: {
            int n = 1752325295;
            n = Integer.rotateLeft(n * 1506265719, 3) ^ 0x469415ED;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x6425A6AF;
            if ((n2 ^ n) == 1680189103) break block0;
            int cfr_ignored_0 = (0xC57FA00 ^ n) - -1169351310;
        }
        return lkh.hkhq(class_16572.method_6030()) instanceof class_1819;
    }

    private int skht_2(boolean bl) {
        int n = 334978920;
        n = Integer.rotateLeft(n * -376893131, 26) ^ 0x1447E346;
        int n2 = (n = Integer.rotateRight(bl ^ n, 5)) ^ 0x6C85E64E;
        if ((n2 ^ n) != 1820714574) {
            int cfr_ignored_0 = (0x7F72B926 ^ n) - 1523628339;
        }
        int n3 = bl ? 0 : Integer.reverse(-1269132755) ^ 0xB4495A24;
        int n4 = bl ? 337627485 + -337627476 : -979266566 + 979266602;
        int n5 = -1;
        int n6 = -1;
        for (int i = n3; i < n4; ++i) {
            class_1799 class_17992 = lkh.dqd_3(lkh.hyj(lkh.mc.field_1724), i);
            int n7 = lkh.dmsh_2(this, class_17992);
            if (n7 <= n6) continue;
            n6 = n7;
            n5 = i;
        }
        return n5;
    }

    private int zkhk(class_1799 class_17992) {
        int n = 295019203;
        n = Integer.rotateLeft(n * -561677087, 5) ^ 0x4C7B9EEF;
        class_1799 class_17993 = class_17992;
        n = Integer.rotateLeft((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 16);
        int n2 = n ^ 0x66A2F790;
        if ((n2 ^ n) != 1721956240) {
            int cfr_ignored_0 = (0x77375553 ^ n) - -739933678;
        }
        if (class_17992 == null || !(lkh.thzh(class_17992) instanceof class_1743)) {
            int n3 = -1;
            if (lkh.qz() == 0) {
                n3 = n3 ^ 0x1A33;
            }
            return n3;
        }
        if (lkh.zbw(class_17992, class_1802.field_22025)) {
            return Integer.rotateLeft(0x60FF478F ^ 0x60FF878F, 19);
        }
        if (lkh.shqz_2(class_17992, class_1802.field_8556)) {
            return 5;
        }
        if (lkh.hsj(class_17992, class_1802.field_8475)) {
            return 4;
        }
        if (class_17992.method_31574(class_1802.field_8062)) {
            return 3;
        }
        if (lkh.rlh_2(class_17992, class_1802.field_8825)) {
            return 2;
        }
        if (class_17992.method_31574(class_1802.field_8406)) {
            return 1;
        }
        return 0;
    }

    private int sas_8() {
        int n = 766576755;
        n = Integer.rotateLeft(n * -672603653, 7) ^ 0x91558F6;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xA31AD3BA;
        if ((n2 ^ n) != -1558522950) {
            int cfr_ignored_0 = (0x8EABDBC9 ^ n) - 128447804;
        }
        int n3 = lkh.ghjr((class_746)lkh.mc.field_1724).field_7545;
        int n4 = -1;
        int n5 = -1;
        for (int i = 0; i < 2124764057 + -2124764048; ++i) {
            class_1799 class_17992 = lkh.mc.field_1724.method_31548().method_5438(i);
            if (class_17992.method_7960()) {
                return i;
            }
            if (i == n3) continue;
            if (n5 == -1) {
                n5 = i;
            }
            if (n4 != -1 || lkh.shbj(this, class_17992)) continue;
            n4 = i;
        }
        if (n4 != -1) {
            return n4;
        }
        if (n5 != -1) {
            return n5;
        }
        return n3;
    }

    private boolean ahd_2(class_1799 class_17992) {
        try {
            int n = -1667635680;
            n = Integer.rotateLeft(n * 1313907555, 28) ^ 0x4A4B5062;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 9);
            int n2 = n ^ 0xE9F0A2D6;
            if ((n2 ^ n) != -370105642) {
                int cfr_ignored_0 = (0x756944F6 ^ n) + -1734601698;
            }
            if ((0xDE & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return class_17992.method_7909() instanceof class_1829 || lkh.zdh_4(class_17992) instanceof class_1743 || class_17992.method_7909() instanceof class_9362 || class_17992.method_7909() instanceof class_1835;
    }

    private boolean syn_2(class_1657 class_16572, int n, boolean bl) {
        block0: {
            int n2 = bdl.hghj(-834195711);
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 4);
            class_1657 class_16573 = class_16572;
            n2 = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n2;
            int n3 = n2 ^ 0x787B663E;
            if ((n3 ^ n2) == 2021353022) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xB63C493F ^ n2, 9) - 363494876) * -1237563073;
        }
        return this.dzd_5(class_16572, n, bl);
    }

    private boolean bay_2(class_1657 class_16572, int n) {
        block0: {
            int n2 = bdl.hghj(1062973063);
            n2 = System.identityHashCode(this) ^ n2;
            class_1657 class_16573 = class_16572;
            n2 = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n2;
            int n3 = n2 ^ 0x90444CAF;
            if ((n3 ^ n2) == -1874572113) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xAF1FE228 ^ n2, 8) + 960102931;
        }
        return this.tshl(class_16572, n, false);
    }

    private static boolean khlth() {
        block0: {
            int n = bdl.hghj(-1975611734);
            int n2 = n ^ 0x90A857EA;
            if ((n2 ^ n) == -1868015638) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x1A96D940 ^ n, 6) + 1017245179;
        }
        return yf.khdha_2();
    }

    private static boolean rha_4(lkh lkh2, class_1657 class_16572) {
        block0: {
            int n = -865194508;
            int n2 = (n = Integer.rotateLeft(n * 773213295, 8) ^ 0xECD3681B) ^ 0xBAEF5C5B;
            if ((n2 ^ n) == -1158718373) break block0;
            int cfr_ignored_0 = (0x768171AF ^ n) - -1635038452;
        }
        return lkh2.tky(class_16572);
    }

    private static boolean rhs(lkh lkh2, class_1657 class_16572, int n, boolean bl) {
        block0: {
            int n2 = 909601152;
            n2 = Integer.rotateLeft(n2 * -1644474285, 7) ^ 0x21F4EA3C;
            lkh lkh3 = lkh2;
            n2 = (lkh3 != null ? System.identityHashCode(lkh3) : 0) ^ n2;
            class_1657 class_16573 = class_16572;
            n2 = Integer.rotateLeft((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n2, 11);
            int n3 = n2 ^ 0xB70ADE48;
            if ((n3 ^ n2) == -1224024504) break block0;
            int cfr_ignored_0 = (0x813DB7C8 ^ n2) - -88016086;
        }
        return lkh2.tshl(class_16572, n, bl);
    }

    private static int shhn_2(int n, int n2) {
        block0: {
            int n3 = bdl.hghj(-80227348);
            int n4 = n3 ^ 0x56AA08D9;
            if ((n4 ^ n3) == 1453983961) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xAD9DDB35 ^ n3, 8) - 175844006) * -1382163659;
            int cfr_ignored_1 = (int)(0x6F2F750827D4EB4FL ^ (long)n3 ^ 0x1760831A2DB9738FL);
        }
        return Integer.rotateLeft(n, n2);
    }

    private static void hss(long l, Runnable runnable) {
        int n = -759714025;
        n = Integer.rotateLeft(n * -949209821, 22) ^ 0x7ECD14F1;
        Runnable runnable2 = runnable;
        n = Integer.rotateLeft((runnable2 != null ? System.identityHashCode(runnable2) : 0) ^ n, 25);
        int n2 = n ^ 0xC9725F7C;
        if ((n2 ^ n) != -915251332) {
            int cfr_ignored_0 = (0x1BC5F06B ^ n) - -705503996;
        }
        ns.taz(l, runnable);
    }

    private static void zthz(lkh lkh2, class_1657 class_16572) {
        int n = bdl.hghj(1800284781);
        lkh lkh3 = lkh2;
        n = (lkh3 != null ? System.identityHashCode(lkh3) : 0) ^ n;
        class_1657 class_16573 = class_16572;
        n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
        int n2 = n ^ 0xA78C3523;
        if ((n2 ^ n) != -1483983581) {
            int cfr_ignored_0 = Integer.rotateRight(0xCCC21F4E ^ n, 12) - -807442003;
        }
        lkh2.zdsh_4(class_16572);
    }

    private static class_1661 zkh_2(class_746 class_7462) {
        block0: {
            int n = -1943129971;
            int n2 = (n = Integer.rotateLeft(n * 1149704245, 18) ^ 0x14553790) ^ 0xD6237126;
            if ((n2 ^ n) == -702320346) break block0;
            int cfr_ignored_0 = (0x5A0D41AB ^ n) + 1853806934;
        }
        return class_7462.method_31548();
    }

    private static void das_8(int n) {
        int n2 = 1929052956;
        int n3 = (n2 = Integer.rotateLeft(n2 * -1221645121, 18) ^ 0x74474CE1) ^ 0xCAB2F68C;
        if ((n3 ^ n2) != -894241140) {
            int cfr_ignored_0 = (0xB849F590 ^ n2) - -158110598;
        }
        bfn.hhz_4(n);
    }

    private static class_1661 rdht(class_746 class_7462) {
        block0: {
            int n = -1789429889;
            n = Integer.rotateLeft(n * -990599361, 19) ^ 0x61D43EDF;
            class_746 class_7463 = class_7462;
            n = Integer.rotateLeft((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 11);
            int n2 = n ^ 0x42F210FE;
            if ((n2 ^ n) == 1123160318) break block0;
            int cfr_ignored_0 = (0xD7A56781 ^ n) - -288223902;
        }
        return class_7462.method_31548();
    }

    private static void twm_2(lkh lkh2, class_1657 class_16572) {
        int n = bdl.hghj(150467018);
        class_1657 class_16573 = class_16572;
        n = Integer.rotateRight((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 12);
        int n2 = n ^ 0x1857CE84;
        if ((n2 ^ n) != 408407684) {
            int cfr_ignored_0 = Integer.rotateRight(0x10A03F4E ^ n, 5) - 130369965;
        }
        lkh2.zdsh_4(class_16572);
    }

    private static class_1661 khty(class_746 class_7462) {
        block0: {
            int n = 1368544605;
            n = Integer.rotateLeft(n * 106860699, 5) ^ 0xCD421E8;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0xB28B3C79;
            if ((n2 ^ n) == -1299497863) break block0;
            int cfr_ignored_0 = (0xE3196924 ^ n) + -1909818455;
        }
        return class_7462.method_31548();
    }

    private static void thdr_2(int n, int n2) {
        int n3 = -612051422;
        n3 = Integer.rotateLeft(n3 * -30962249, 11) ^ 0x1233F89D;
        int n4 = (n3 = Integer.rotateRight(n ^ n3, 23)) ^ 0xC6212D09;
        if ((n4 ^ n3) != -970904311) {
            int cfr_ignored_0 = (0x1DA5FB2B ^ n3) + -216381411;
        }
        bfn.thght_2(n, n2);
    }

    private static void ghbm(class_746 class_7462, class_1268 class_12682) {
        int n = 1214932175;
        n = Integer.rotateLeft(n * -1616918799, 7) ^ 0xF8B930A;
        class_746 class_7463 = class_7462;
        n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
        class_1268 class_12683 = class_12682;
        n = Integer.rotateLeft((class_12683 != null ? System.identityHashCode(class_12683) : 0) ^ n, 2);
        int n2 = n ^ 0xE81D270E;
        if ((n2 ^ n) != -400742642) {
            int cfr_ignored_0 = (0xA07743C1 ^ n) - 1318372232;
        }
        class_7462.method_6104(class_12682);
    }

    private static boolean dhrd_2(class_1657 class_16572) {
        block0: {
            int n = 941480677;
            int n2 = (n = Integer.rotateLeft(n * 1019146133, 15) ^ 0x9E6014EA) ^ 0x13729AF1;
            if ((n2 ^ n) == 326277873) break block0;
            int cfr_ignored_0 = (0x2B6F4014 ^ n) + 636908346;
        }
        return class_16572.method_5805();
    }

    private static boolean hzz(lkh lkh2, class_1657 class_16572) {
        block0: {
            int n = 693647120;
            int n2 = (n = Integer.rotateLeft(n * 1375397529, 28) ^ 0xE4E65A70) ^ 0x687D2B4;
            if ((n2 ^ n) == 109564596) break block0;
            int cfr_ignored_0 = (0x2FDFE5A4 ^ n) - -1892958054;
        }
        return lkh2.aaw(class_16572);
    }

    private static boolean ts_3(lkh lkh2, class_1657 class_16572) {
        block0: {
            int n = 198676497;
            n = Integer.rotateLeft(n * 443913871, 11) ^ 0x97E05C57;
            lkh lkh3 = lkh2;
            n = Integer.rotateRight((lkh3 != null ? System.identityHashCode(lkh3) : 0) ^ n, 7);
            class_1657 class_16573 = class_16572;
            n = Integer.rotateRight((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 28);
            int n2 = n ^ 0x449B6CF0;
            if ((n2 ^ n) == 1151036656) break block0;
            int cfr_ignored_0 = (0x4F4CFCE1 ^ n) + -1361090462;
        }
        return lkh2.trf(class_16572);
    }

    private static class_1799 shtsh_2(class_1657 class_16572) {
        block0: {
            int n = -547679103;
            int n2 = (n = Integer.rotateLeft(n * 312748769, 6) ^ 0x75ECC7C2) ^ 0x4EB1943B;
            if ((n2 ^ n) == 1320260667) break block0;
            int cfr_ignored_0 = (0x91EA80BA ^ n) - 752053936;
        }
        return class_16572.method_6047();
    }

    private static class_1792 khah_3(class_1799 class_17992) {
        block0: {
            int n = -109170117;
            int n2 = (n = Integer.rotateLeft(n * -673411953, 9) ^ 0xF0865750) ^ 0xBF299599;
            if ((n2 ^ n) == -1087793767) break block0;
            int cfr_ignored_0 = (0x4657A7A2 ^ n) - 999491803;
        }
        return class_17992.method_7909();
    }

    private static class_1792 hkhq(class_1799 class_17992) {
        block0: {
            int n = -1543832346;
            n = Integer.rotateLeft(n * -1111950551, 6) ^ 0xAB029DC5;
            class_1799 class_17993 = class_17992;
            n = Integer.rotateLeft((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 17);
            int n2 = n ^ 0xC026DCE8;
            if ((n2 ^ n) == -1071194904) break block0;
            int cfr_ignored_0 = (0x63DC200E ^ n) + -122173500;
        }
        return class_17992.method_7909();
    }

    private static class_1661 hyj(class_746 class_7462) {
        block0: {
            int n = 522114446;
            n = Integer.rotateLeft(n * 245580115, 23) ^ 0xA7F5A071;
            class_746 class_7463 = class_7462;
            n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 14);
            int n2 = n ^ 0xE6D8441;
            if ((n2 ^ n) == 242058305) break block0;
            int cfr_ignored_0 = (0x117351CF ^ n) + 728026426;
        }
        return class_7462.method_31548();
    }

    private static class_1799 dqd_3(class_1661 class_16612, int n) {
        block0: {
            int n2 = bdl.hghj(-900823061);
            class_1661 class_16613 = class_16612;
            n2 = Integer.rotateRight((class_16613 != null ? System.identityHashCode(class_16613) : 0) ^ n2, 22);
            int n3 = (n2 = n ^ n2) ^ 0xFBC531EB;
            if ((n3 ^ n2) == -70962709) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x318BB600 ^ n2, 9) + 71870779;
        }
        return class_16612.method_5438(n);
    }

    private static int dmsh_2(lkh lkh2, class_1799 class_17992) {
        block0: {
            int n = bdl.hghj(-1088822459);
            lkh lkh3 = lkh2;
            n = (lkh3 != null ? System.identityHashCode(lkh3) : 0) ^ n;
            class_1799 class_17993 = class_17992;
            n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
            int n2 = n ^ 0xCFCE55C6;
            if ((n2 ^ n) == -808561210) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x70D7B683 ^ n, 17) + -1367557864;
        }
        return lkh2.zkhk(class_17992);
    }

    private static class_1792 thzh(class_1799 class_17992) {
        block0: {
            int n = 543361185;
            n = Integer.rotateLeft(n * -1338286787, 24) ^ 0x246E11B8;
            class_1799 class_17993 = class_17992;
            n = Integer.rotateLeft((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 22);
            int n2 = n ^ 0xD214A14F;
            if ((n2 ^ n) == -770399921) break block0;
            int cfr_ignored_0 = (0xF277A9EE ^ n) + -1098616380;
        }
        return class_17992.method_7909();
    }

    private static int qz() {
        block0: {
            int n = 1574780416;
            int n2 = (n = Integer.rotateLeft(n * -1203588915, 8) ^ 0x96263AFA) ^ 0xD00FAF23;
            if ((n2 ^ n) == -804278493) break block0;
            int cfr_ignored_0 = (0x8DD29123 ^ n) - 692933988;
        }
        return yf.tdhth_2();
    }

    private static boolean zbw(class_1799 class_17992, class_1792 class_17922) {
        block0: {
            int n = bdl.hghj(2026789122);
            class_1799 class_17993 = class_17992;
            n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
            class_1792 class_17923 = class_17922;
            n = (class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n;
            int n2 = n ^ 0x780155E2;
            if ((n2 ^ n) == 2013353442) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xCF0CE0 ^ n, 3) + 493891163;
        }
        return class_17992.method_31574(class_17922);
    }

    private static boolean shqz_2(class_1799 class_17992, class_1792 class_17922) {
        block0: {
            int n = bdl.hghj(1146500046);
            class_1792 class_17923 = class_17922;
            n = (class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n;
            int n2 = n ^ 0x246D66;
            if ((n2 ^ n) == 2387302) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x44725EA8 ^ n, 11) + 1312232851;
        }
        return class_17992.method_31574(class_17922);
    }

    private static boolean hsj(class_1799 class_17992, class_1792 class_17922) {
        block0: {
            int n = bdl.hghj(1346913734);
            class_1799 class_17993 = class_17992;
            n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
            class_1792 class_17923 = class_17922;
            n = (class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n;
            int n2 = n ^ 0x979CD55B;
            if ((n2 ^ n) == -1751329445) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xC7D4909D ^ n, 11) - 924525118) * -942370659;
            int cfr_ignored_1 = (int)(0x5663EA027D4EB4FL ^ (long)n ^ 0x8030831A2DB9A71DL);
        }
        return class_17992.method_31574(class_17922);
    }

    private static boolean rlh_2(class_1799 class_17992, class_1792 class_17922) {
        block0: {
            int n = -427166221;
            n = Integer.rotateLeft(n * -1047321949, 11) ^ 0x4524099F;
            class_1792 class_17923 = class_17922;
            n = Integer.rotateRight((class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n, 9);
            int n2 = n ^ 0xEFB9A8F7;
            if ((n2 ^ n) == -273045257) break block0;
            int cfr_ignored_0 = (0x9305D04 ^ n) + 1531869847;
        }
        return class_17992.method_31574(class_17922);
    }

    private static class_1661 ghjr(class_746 class_7462) {
        block0: {
            int n = -1650367717;
            int n2 = (n = Integer.rotateLeft(n * -451149089, 15) ^ 0xDE8EBBE4) ^ 0x6741C456;
            if ((n2 ^ n) == 1732363350) break block0;
            int cfr_ignored_0 = (0xFAE0A74D ^ n) - 1776771553;
        }
        return class_7462.method_31548();
    }

    private static boolean shbj(lkh lkh2, class_1799 class_17992) {
        block0: {
            int n = -524107863;
            n = Integer.rotateLeft(n * -1856837709, 21) ^ 0x384C08E2;
            class_1799 class_17993 = class_17992;
            n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
            int n2 = n ^ 0x5BAE985A;
            if ((n2 ^ n) == 1538168922) break block0;
            int cfr_ignored_0 = (0xBB6C27F3 ^ n) + -1329512085;
        }
        return lkh2.ahd_2(class_17992);
    }

    private static class_1792 zdh_4(class_1799 class_17992) {
        block0: {
            int n = -1483688825;
            int n2 = (n = Integer.rotateLeft(n * 199709931, 18) ^ 0xD087039F) ^ 0x30246C84;
            if ((n2 ^ n) == 807693444) break block0;
            int cfr_ignored_0 = (0x97B4D803 ^ n) + 531776327;
        }
        return class_17992.method_7909();
    }

    private static String[] ddh_7(String string) {
        int n = 148839704;
        int n2 = (n = Integer.rotateLeft(n * 1099458319, 20) ^ 0x5893B04B) ^ 0xC151CF8C;
        if ((n2 ^ n) != -1051603060) {
            int cfr_ignored_0 = (0xC98ED294 ^ n) + -1326302266;
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

    private static CallSite shht(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1347617634;
            n3 = Integer.rotateLeft(n3 * 713338263, 12) ^ 0x5044B2AD;
            n3 = n ^ n3;
            n3 = n2 ^ n3;
            int n4 = n3 ^ 0xF61B18B6;
            if ((n4 ^ n3) != -165996362) {
                int cfr_ignored_0 = (0x59B7E428 ^ n3) - -195965543;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bfs ^ string.hashCode()) + (n2 + bghk) + i ^ bfs, 19) + bghk);
            }
            String[] stringArray = lkh.ddh_7(new String(cArray));
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

    private static String[] xrjerovjul(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite bjb9zkglyyoi(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ w5z0ek9 ^ string.hashCode() ^ n2 + a00j5g42ykjc ^ i * -1705490971 ^ w5z0ek9, 18) ^ a00j5g42ykjc));
            }
            String[] stringArray = lkh.xrjerovjul(new String(cArray));
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

