/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bht_2;
import us.m0vy.moondlc.m0vyguard.bghdh;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.yf;

public final class ky {
    private static final float rbt = 1.0E-5f;
    private float rjn;
    private float rsha_2;
    private float zsb_2 = Float.intBitsToFloat(-1330692024 - 820985928);
    private static final int thdr = -1563604375;
    private static final int rdsh = -970340021;
    private static final int q3puoii7ml = -557802719;
    private static final int ls34mj01ydqlg = 252114161;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int q9j3fz6l;

    public lb zft(lb lb2, lb lb3) {
        try {
            int n = 1291736745;
            n = Integer.rotateLeft(n * -2118236217, 13) ^ 0xC16F40F9;
            lb lb4 = lb2;
            n = Integer.rotateLeft((lb4 != null ? System.identityHashCode(lb4) : 0) ^ n, 15);
            lb lb5 = lb3;
            n = (lb5 != null ? System.identityHashCode(lb5) : 0) ^ n;
            int n2 = n ^ 0x9ED172BF;
            if ((n2 ^ n) != -1630440769) {
                int cfr_ignored_0 = (0xD22F2416 ^ n) + 1580133290;
            }
            if ((0x196 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            ky.dhzy_2();
        }
        if (lb2 == null || lb3 == null) {
            return lb3 != null ? lb3 : lb2;
        }
        float f = ky.tda_5(lb2.sry(), lb3.sry());
        float f2 = f - ky.jqt_2(lb2);
        float f3 = lb3.khdhd_2() - lb2.khdhd_2();
        float f4 = bghdh.ryz();
        if (!Float.isFinite(f4) || f4 <= ky.zas_2(Integer.rotateLeft(0x7C0C508D ^ 0xF7543EC2, 15))) {
            this.ryq();
            return new lb(lb2.sry() + this.khthh_2(f2), ky.khld(lb2.khdhd_2() + ky.dhzd(this, f3), Float.intBitsToFloat(0x16DACC52 ^ 0xD46ECC52), Float.intBitsToFloat(1605653542 - 486560806)));
        }
        this.sdhj(f4);
        float f5 = this.rny(f2, f4);
        float f6 = this.jdt_3(f3, f4);
        float f7 = ky.ghshz(lb2) + f6;
        float f8 = class_3532.method_15363((float)f7, (float)ky.shksh(Integer.reverse(1610813752) ^ 0xDE3CC006), (float)Float.intBitsToFloat(424286834 + 694805902));
        if (f8 != f7) {
            this.rsha_2 = 0.0f;
        }
        return new lb(lb2.sry() + f5, f8);
    }

    public void ryq() {
        int n = 1086460390;
        n = Integer.rotateLeft(n * -1697268331, 4) ^ 0xE6AEB83;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x2D2CD287;
        if ((n2 ^ n) != 757912199) {
            int cfr_ignored_0 = (0x6DEEC361 ^ n) - 1558916681;
        }
        this.rjn = 0.0f;
        this.rsha_2 = 0.0f;
        this.zsb_2 = Float.intBitsToFloat(-1544687323 - 606990629);
    }

    private void sdhj(float f) {
        int n = 0;
        int n2 = -1047380727;
        n2 = Integer.rotateLeft(n2 * 113819215, 26) ^ 0xEECDE782;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 23);
        n2 = Float.floatToIntBits(f) ^ n2;
        int n3 = Integer.reverse(Integer.reverse((n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592));
        while (true) {
            block25: {
                block40: {
                    block29: {
                        block22: {
                            block28: {
                                block41: {
                                    block27: {
                                        block35: {
                                            block23: {
                                                block24: {
                                                    block34: {
                                                        block39: {
                                                            block33: {
                                                                block38: {
                                                                    block36: {
                                                                        block30: {
                                                                            block37: {
                                                                                block31: {
                                                                                    block32: {
                                                                                        block20: {
                                                                                            block26: {
                                                                                                block21: {
                                                                                                    if ((n = n3 - 1860677592 ^ 0x6EE7AFD8 ^ n2) > 89447663) break block20;
                                                                                                    if (n > -204639841) break block21;
                                                                                                    if (n == -1774566459) break block22;
                                                                                                    if (n == -1390669133) break block23;
                                                                                                    if (n == -204639841) break block24;
                                                                                                    break block25;
                                                                                                }
                                                                                                if (n > -45835466) break block26;
                                                                                                if (n == -190942241) break block27;
                                                                                                if (n == -45835466) break block28;
                                                                                                break block25;
                                                                                            }
                                                                                            if (n == 76504462) break block29;
                                                                                            if (n == 89447663) break block30;
                                                                                            int cfr_ignored_0 = (Integer.rotateLeft(0xD4571E74 ^ n2, 13) - -1159049401) * -732488075;
                                                                                            break block25;
                                                                                        }
                                                                                        if (n > 1088827009) break block31;
                                                                                        if (n > 597623376) break block32;
                                                                                        if (n == 189926076) break block33;
                                                                                        if (n == 597623376) break block34;
                                                                                        break block25;
                                                                                    }
                                                                                    if (n == 1039784772) break block35;
                                                                                    if (n == 1088827009) break block36;
                                                                                    int cfr_ignored_1 = (Integer.rotateLeft(0x7E1FEC75 ^ n2, 18) - 1245397350) * 2116021365;
                                                                                    int cfr_ignored_2 = (int)(0xBCAD424827D4EB4FL ^ (long)n2 ^ 0x79E0831A2DB8D48BL);
                                                                                    break block25;
                                                                                }
                                                                                if (n > 1342122733) break block37;
                                                                                if (n == 1209665033) break block38;
                                                                                if (n == 1342122733) break block39;
                                                                                int cfr_ignored_3 = (Integer.rotateRight(0x4AD4A93F ^ n2, 12) - 337518044) * 1255450943;
                                                                                break block25;
                                                                            }
                                                                            if (n == 1549945385) break block40;
                                                                            if (n == 1563585887) break block41;
                                                                            int cfr_ignored_4 = (Integer.rotateRight(0x8636F256 ^ n2, 3) - 1157953445) * -2043219369;
                                                                            break block25;
                                                                        }
                                                                        int cfr_ignored_5 = Integer.rotateRight(0x1B818F0F ^ n2, 6) - 1494086156;
                                                                        if (Math.abs(this.zsb_2 - f) > Float.intBitsToFloat(-1744252745 - 1625361163)) {
                                                                            int cfr_ignored_6 = (int)(0xD0E199666716C615L ^ (long)n2 ^ 0xCFBC029E770C0C12L);
                                                                            n3 = (n2 ^ 0x1E925DDA ^ 0x6EE7AFD8) + 1860677592 + 1774541200 - 1774541200;
                                                                            int cfr_ignored_7 = (int)(0x22B50D4C5D07ACA5L ^ (long)n2 ^ 0xE7E876BCA26DE8BBL);
                                                                            n3 = (n2 ^ 0x481A0609 ^ 0x6EE7AFD8) + 1860677592 + 1781717642 - 1781717642;
                                                                            continue;
                                                                        }
                                                                        n3 = (n2 ^ 0xCA0E9DF6 ^ 0x6EE7AFD8) + 1860677592;
                                                                        int cfr_ignored_8 = (Integer.rotateRight(0x5ABD8C33 ^ n2, 14) + 22124904) * 1522371635;
                                                                        n3 = (int)((long)((n2 ^ 0xB520ABC ^ 0x6EE7AFD8) + 1860677592) ^ 0x4A686E7550DC8083L ^ 0x4A686E7550DC8083L);
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_9 = Integer.rotateRight(0x9CF77CB ^ n2, 4) + 880615632;
                                                                    if (ky.tdq_4(this.zsb_2)) {
                                                                        try {
                                                                            n -= 2;
                                                                            n3 = (n2 ^ 0x554DCEF ^ 0x6EE7AFD8) + 1860677592;
                                                                        }
                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                            n3 = (n2 ^ 0x554DCEF ^ 0x6EE7AFD8) + 1860677592 ^ 0x6C514EB ^ 0x6C514EB;
                                                                        }
                                                                        n -= 2;
                                                                        continue;
                                                                    }
                                                                    n3 = (int)((long)((n2 ^ 0x481A0609 ^ 0x6EE7AFD8) + 1860677592) ^ 0xA73B06EC22FA194CL ^ 0xA73B06EC22FA194CL);
                                                                    n -= 4;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_10 = Integer.rotateRight(0x56460A27 ^ n2, 13) - 1993923060;
                                                                this.rjn = 0.0f;
                                                                this.rsha_2 = 0.0f;
                                                                this.zsb_2 = f;
                                                                try {
                                                                    ++n;
                                                                    if ((0x4D65F0EFD0E1F547L ^ (long)n2 | 1L) == 0L) {
                                                                        throw new UnsupportedOperationException();
                                                                    }
                                                                    n3 = (n2 ^ 0xB520ABC ^ 0x6EE7AFD8) + 1860677592 + 818787140 - 818787140;
                                                                }
                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                    n3 = (n2 ^ 0xB520ABC ^ 0x6EE7AFD8) + 1860677592 ^ 0x539FCE21 ^ 0x539FCE21;
                                                                }
                                                                n += 3;
                                                                continue;
                                                            }
                                                            int cfr_ignored_11 = (Integer.rotateRight(0xF963933 ^ n2, 4) + -410088344) * 261503283;
                                                            return;
                                                        }
                                                        int cfr_ignored_12 = Integer.rotateRight(0x50F582EE ^ n2, 13) - -770147827;
                                                        try {
                                                            if ((0x82AD3422D5BD3D1BL ^ (long)n2 | 1L) == 0L) {
                                                                throw new IllegalStateException();
                                                            }
                                                            n3 = (int)((long)((n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592) ^ 0xD5C8A04110ED4D1DL ^ 0xD5C8A04110ED4D1DL);
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            n3 = (n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592 + -1011274348 - -1011274348;
                                                        }
                                                        n -= 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_13 = Integer.rotateLeft(0x66916544 ^ n2, 15) - 1878581879;
                                                    try {
                                                        n -= 2;
                                                        if ((0xB5EBA5B597B85101L ^ (long)n2 | 1L) == 0L) {
                                                            throw new UnsupportedOperationException();
                                                        }
                                                        n3 = (n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592 ^ 0x78EEDEC4 ^ 0x78EEDEC4;
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        n3 = (n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592 + -1155758622 - -1155758622;
                                                    }
                                                    --n;
                                                    continue;
                                                }
                                                int cfr_ignored_14 = Integer.rotateLeft(0xD5924D8D ^ n2, 13) - -518716594;
                                                int cfr_ignored_15 = (int)(0x1720E3B027D4EB4FL ^ (long)n2 ^ 0x3A10831A2DB98390L);
                                                n3 = (n2 ^ 0x20595EF0 ^ 0x6EE7AFD8) + 1860677592 ^ 0x6CEA6ECC ^ 0x6CEA6ECC;
                                                int cfr_ignored_16 = Integer.rotateRight(0x76C9BD86 ^ n2, 17) - 1724617333;
                                                n3 = (n2 ^ 0x99EF2178 ^ 0x6EE7AFD8) + 1860677592 ^ 0x199DFAFE ^ 0x199DFAFE;
                                                int cfr_ignored_17 = Integer.rotateRight(0x9855F08A ^ n2, 6) + 1992671217;
                                                n3 = (n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592 ^ 0xD7D95C95 ^ 0xD7D95C95;
                                                continue;
                                            }
                                            int cfr_ignored_18 = Integer.rotateRight(0x8BE2C20A ^ n2, 4) + -187490703;
                                            n3 = (int)((long)((n2 ^ 0x4A9B34DE ^ 0x6EE7AFD8) + 1860677592) ^ 0xCAD3EAE67CCEFE63L ^ 0xCAD3EAE67CCEFE63L);
                                            int cfr_ignored_19 = (Integer.rotateRight(0xCF6D8653 ^ n2, 12) + 580969288) * -814905773;
                                            n3 = (n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592 + -761855571 - -761855571;
                                            int cfr_ignored_20 = (Integer.rotateRight(0xB05A9397 ^ n2, 9) - 1599438468) * -1336241257;
                                            continue;
                                        }
                                        int cfr_ignored_21 = (Integer.rotateRight(0x1BF14B52 ^ n2, 6) + 1721089577) * 468798291;
                                        n3 = (int)((long)((n2 ^ 0x2946A284 ^ 0x6EE7AFD8) + 1860677592) ^ 0x8504D5084FF497FL ^ 0x8504D5084FF497FL);
                                        int cfr_ignored_22 = Integer.rotateRight(0xEEF51623 ^ n2, 16) + -200585864;
                                        int cfr_ignored_23 = (int)(0xD1638ACBC805FCB8L ^ (long)n2 ^ 0xE8E75CB802560F16L);
                                        n3 = (int)((long)((n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592) ^ 0x72656A423126152FL ^ 0x72656A423126152FL);
                                        continue;
                                    }
                                    int cfr_ignored_24 = (Integer.rotateLeft(0x39AE9D71 ^ n2, 10) + 8564714) * 967744881;
                                    int cfr_ignored_25 = (int)(0xFB1C334C27D4EB4FL ^ (long)n2 ^ 0x9BE8831A2DB85BE9L);
                                    n3 = (int)((long)((n2 ^ 0x21A1759A ^ 0x6EE7AFD8) + 1860677592) ^ 0x61CE494ACAE7458DL ^ 0x61CE494ACAE7458DL);
                                    int cfr_ignored_26 = Integer.rotateLeft(0xB0DE4900 ^ n2, 9) + 1867019835;
                                    n3 = (n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592 ^ 0x3D931D87 ^ 0x3D931D87;
                                    n -= 3;
                                    continue;
                                }
                                int cfr_ignored_27 = Integer.rotateLeft(0x3F237C89 ^ n2, 10) + -1448496174;
                                int cfr_ignored_28 = (int)(0xFD91D2B427D4EB4FL ^ (long)n2 ^ 0x5818831A2DB856F2L);
                                n3 = (int)((long)((n2 ^ 0x5205DACF ^ 0x6EE7AFD8) + 1860677592) ^ 0xC22F4C452DA6850CL ^ 0xC22F4C452DA6850CL);
                                int cfr_ignored_29 = (Integer.rotateLeft(0x7FD46079 ^ n2, 18) + 2132102626) * 2144624761;
                                int cfr_ignored_30 = (int)(0xBD66CE4427D4EB4FL ^ (long)n2 ^ 0x61F8831A2DB8D71CL);
                                int cfr_ignored_31 = (int)(0x92BDF83303312B3FL ^ (long)n2 ^ 0xD16CAD1AD5888AAL);
                                n3 = (n2 ^ 0x9F030376 ^ 0x6EE7AFD8) + 1860677592 + 125315470 - 125315470;
                                int cfr_ignored_32 = (int)(0xB76E1A439916E6E3L ^ (long)n2 ^ 0xC9F7FE9E36E0C30DL);
                                n3 = (int)((long)((n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592) ^ 0x1E817B4496EA2AECL ^ 0x1E817B4496EA2AECL);
                                n += 2;
                                continue;
                            }
                            int cfr_ignored_33 = Integer.rotateLeft(0x37A92869 ^ n2, 9) + -1042709518;
                            int cfr_ignored_34 = (int)(0xF51B865427D4EB4FL ^ (long)n2 ^ 0xF1D8831A2DB847E6L);
                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x2AB9FCB7 ^ 0x6EE7AFD8) + 1860677592));
                            int cfr_ignored_35 = Integer.rotateLeft(0x4770B388 ^ n2, 11) + -1425843021;
                            int cfr_ignored_36 = (int)(0x42C83F7ABD9BBFE2L ^ (long)n2 ^ 0x8385B78484E32841L);
                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x429129FE ^ 0x6EE7AFD8) + 1860677592));
                            int cfr_ignored_37 = (int)(0xB88E9A9B3E82F9DFL ^ (long)n2 ^ 0xC846B1B60898DCCCL);
                            n3 = (int)((long)((n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592) ^ 0x67FD7F0ECC84F322L ^ 0x67FD7F0ECC84F322L);
                            n -= 3;
                            continue;
                        }
                        int cfr_ignored_38 = (Integer.rotateLeft(0x5FEA5554 ^ n2, 14) - -1581386649) * 1609192789;
                        try {
                            n += 4;
                            if ((0x11F1678467A9AE03L ^ (long)n2 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592));
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n3 = (int)((long)((n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592) ^ 0x4C2D5D52C5F40919L ^ 0x4C2D5D52C5F40919L);
                        }
                        n -= 5;
                        continue;
                    }
                    int cfr_ignored_39 = (Integer.rotateRight(0x7EBCB6F7 ^ n2, 18) - 1563936548) * 2126296823;
                    n3 = (n2 ^ 0x2CFAAAF6 ^ 0x6EE7AFD8) + 1860677592 ^ 0x7411CB39 ^ 0x7411CB39;
                    int cfr_ignored_40 = Integer.rotateRight(0x8E83AB66 ^ n2, 4) - 1179607189;
                    try {
                        n += 5;
                        if ((0x89DA278A31D28C31L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592 + -2080906542 - -2080906542;
                    }
                    n += 3;
                    continue;
                }
                int cfr_ignored_41 = (Integer.rotateRight(0x463EC37 ^ n2, 3) - -1938343452) * 73657399;
                n3 = Integer.reverse(Integer.reverse((n2 ^ 0xEEB67C22 ^ 0x6EE7AFD8) + 1860677592));
                int cfr_ignored_42 = (Integer.rotateRight(0xEA635932 ^ n2, 16) + 1717922889) * -362587853;
                n3 = (n2 ^ 0x8C7DF0D ^ 0x6EE7AFD8) + 1860677592 + 2041130673 - 2041130673;
                int cfr_ignored_43 = (Integer.rotateRight(0x581571FF ^ n2, 14) - -1359581924) * 1477800447;
                n3 = (int)((long)((n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592) ^ 0x9A4DB9F4382F5356L ^ 0x9A4DB9F4382F5356L);
                n += 2;
                continue;
            }
            int cfr_ignored_44 = (Integer.rotateLeft(0x40F3E7B4 ^ n2, 11) - -504975865) * 1089726389;
            n3 = (int)((long)((n2 ^ 0x40E62E81 ^ 0x6EE7AFD8) + 1860677592) ^ 0x4297DA92B4F9B144L ^ 0x4297DA92B4F9B144L);
        }
    }

    private float rny(float f, float f2) {
        float f3 = 0.0f;
        int n = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int n2 = 0;
        int n3 = 1226030756;
        n3 = Integer.rotateLeft(n3 * 268592475, 16) ^ 0x1934DFFE;
        n3 = System.identityHashCode(this) ^ n3;
        n3 = Float.floatToIntBits(f2) ^ n3;
        int n4 = -354036013 + n3 ^ 0x625955AF ^ 0x625955AF;
        while (true) {
            block40: {
                block45: {
                    block48: {
                        block51: {
                            block53: {
                                block57: {
                                    block46: {
                                        block39: {
                                            block59: {
                                                block58: {
                                                    block41: {
                                                        block44: {
                                                            block52: {
                                                                block60: {
                                                                    block61: {
                                                                        block38: {
                                                                            block55: {
                                                                                block54: {
                                                                                    block42: {
                                                                                        block47: {
                                                                                            block56: {
                                                                                                block49: {
                                                                                                    block50: {
                                                                                                        block35: {
                                                                                                            block43: {
                                                                                                                block36: {
                                                                                                                    block37: {
                                                                                                                        if ((n2 = n4 - n3) > -986281753) break block35;
                                                                                                                        if (n2 > -1922233183) break block36;
                                                                                                                        if (n2 > -2063035040) break block37;
                                                                                                                        if (n2 == -2138954443) break block38;
                                                                                                                        if (n2 == -2063035040) break block39;
                                                                                                                        break block40;
                                                                                                                    }
                                                                                                                    if (n2 == -1997072755) break block41;
                                                                                                                    if (n2 == -1922233183) break block42;
                                                                                                                    break block40;
                                                                                                                }
                                                                                                                if (n2 > -1811303855) break block43;
                                                                                                                if (n2 == -1880164913) break block44;
                                                                                                                if (n2 == -1811303855) break block45;
                                                                                                                break block40;
                                                                                                            }
                                                                                                            if (n2 == -1599823792) break block46;
                                                                                                            if (n2 == -1089112194) break block47;
                                                                                                            if (n2 == -986281753) break block48;
                                                                                                            break block40;
                                                                                                        }
                                                                                                        if (n2 > -354036013) break block49;
                                                                                                        if (n2 > -869849248) break block50;
                                                                                                        if (n2 == -886968293) break block51;
                                                                                                        if (n2 == -869849248) break block52;
                                                                                                        break block40;
                                                                                                    }
                                                                                                    if (n2 == -787375538) break block53;
                                                                                                    if (n2 == -520610090) break block54;
                                                                                                    int cfr_ignored_0 = Integer.rotateLeft(0x53E27001 ^ n3, 13) + 751382362;
                                                                                                    int cfr_ignored_1 = (int)(0x9150DE3C27D4EB4FL ^ (long)n3 ^ 0x4108831A2DB88F70L);
                                                                                                    if (n2 == -354036013) break block55;
                                                                                                    break block40;
                                                                                                }
                                                                                                if (n2 > 539654991) break block56;
                                                                                                if (n2 == 527338580) break block57;
                                                                                                if (n2 == 539654991) break block58;
                                                                                                int cfr_ignored_2 = Integer.rotateLeft(0xF7BF618C ^ n3, 17) - 76181295;
                                                                                                break block40;
                                                                                            }
                                                                                            if (n2 == 988036932) break block59;
                                                                                            if (n2 == 1163077076) break block60;
                                                                                            if (n2 == 1952377156) break block61;
                                                                                            break block40;
                                                                                        }
                                                                                        int cfr_ignored_3 = Integer.rotateLeft(0xFA21D18C ^ n3, 18) - 1316355887;
                                                                                        if (!Float.isFinite(f)) {
                                                                                            n4 = 946043728 + n3 + 1155978256 - 1155978256;
                                                                                            int cfr_ignored_4 = Integer.rotateLeft(0xDADBEEC5 ^ n3, 14) - -2063628010;
                                                                                            int cfr_ignored_5 = (int)(0x186940F827D4EB4FL ^ (long)n3 ^ 0x7C80831A2DB99D03L);
                                                                                            n4 = Integer.reverse(Integer.reverse(-1922233183 + n3));
                                                                                            n2 -= 5;
                                                                                            continue;
                                                                                        }
                                                                                        n4 = -349453020 + n3 ^ 0x8C9E41EB ^ 0x8C9E41EB;
                                                                                        int cfr_ignored_6 = Integer.rotateLeft(0xC40CDBE5 ^ n3, 11) - -1041481738;
                                                                                        int cfr_ignored_7 = (int)(0x6BE75D827D4EB4FL ^ (long)n3 ^ 0x16C0831A2DB9A0ADL);
                                                                                        n4 = -2138954443 + n3 ^ 0x366D27E8 ^ 0x366D27E8;
                                                                                        n2 -= 3;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_8 = (Integer.rotateLeft(0x8EEDDCF8 ^ n3, 4) + 1395351875) * -1897014023;
                                                                                    this.rjn = 0.0f;
                                                                                    f5 = 0.0f;
                                                                                    try {
                                                                                        n2 += 5;
                                                                                        n4 = (int)((long)(-1811303855 + n3) ^ 0xDAC28102F4E0745FL ^ 0xDAC28102F4E0745FL);
                                                                                    }
                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                        n4 = -1811303855 + n3;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_9 = Integer.rotateLeft(0xC4103724 ^ n3, 11) - -1034662761;
                                                                                throw null;
                                                                            }
                                                                            int cfr_ignored_10 = (Integer.rotateRight(0x3111625F ^ n3, 9) - -176650052) * 823222879;
                                                                            if (yf.dnkh()) {
                                                                                n4 = -486589065 + n3 + 452067869 - 452067869;
                                                                                int cfr_ignored_11 = Integer.rotateRight(0xDB71808F ^ n3, 14) - -1759760244;
                                                                                n4 = (int)((long)(-520610090 + n3) ^ 0xBF69E0A9BCE4106BL ^ 0xBF69E0A9BCE4106BL);
                                                                                continue;
                                                                            }
                                                                            try {
                                                                                ++n2;
                                                                                if ((0xF085AE7E9683BB97L ^ (long)n3 | 1L) == 0L) {
                                                                                    throw new UnsupportedOperationException();
                                                                                }
                                                                                n4 = -1089112194 + n3;
                                                                            }
                                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                n4 = -1089112194 + n3;
                                                                            }
                                                                            n2 += 5;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_12 = Integer.rotateLeft(0xDCF64941 ^ n3, 14) + -969900518;
                                                                        int cfr_ignored_13 = (int)(0x1E44E77C27D4EB4FL ^ (long)n3 ^ 0x3388831A2DB99158L);
                                                                        f3 = f + this.rjn;
                                                                        n = Math.round(f3 / f2);
                                                                        f4 = (float)n * f2;
                                                                        this.rjn = f3 - f4;
                                                                        f5 = f4;
                                                                        try {
                                                                            if ((0xBA40E8BF87190C59L ^ (long)n3 | 1L) == 0L) {
                                                                                throw new UnsupportedOperationException();
                                                                            }
                                                                            n4 = -1811303855 + n3 ^ 0x274A414F ^ 0x274A414F;
                                                                        }
                                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                                            n4 = -1811303855 + n3 + 2014634583 - 2014634583;
                                                                        }
                                                                        n2 -= 5;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_14 = (Integer.rotateLeft(0xD04913F1 ^ n3, 13) + 1027017066) * -800517135;
                                                                    int cfr_ignored_15 = (int)(0x12FBBDCC27D4EB4FL ^ (long)n3 ^ 0x86E8831A2DB98826L);
                                                                    n4 = Integer.reverse(Integer.reverse(-87516008 + n3));
                                                                    int cfr_ignored_16 = Integer.rotateRight(0x51F4BF4F ^ n3, 13) - -251606580;
                                                                    try {
                                                                        n2 += 4;
                                                                        if ((0xC8E1B37E9669B819L ^ (long)n3 | 1L) == 0L) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                        n4 = -354036013 + n3 + 259819213 - 259819213;
                                                                    }
                                                                    catch (IllegalStateException illegalStateException) {
                                                                        n4 = -354036013 + n3 ^ 0x3C595518 ^ 0x3C595518;
                                                                    }
                                                                    continue;
                                                                }
                                                                int cfr_ignored_17 = Integer.rotateRight(0xE5F2E523 ^ n3, 15) + -590913928;
                                                                n4 = 1962150288 + n3 ^ 0x75D27D5B ^ 0x75D27D5B;
                                                                int cfr_ignored_18 = Integer.rotateRight(0xBDC6D626 ^ n3, 10) - -9335339;
                                                                int cfr_ignored_19 = (int)(0x1CD8CF6076F0E900L ^ (long)n3 ^ 0x63B0215229279460L);
                                                                n4 = Integer.reverse(Integer.reverse(1803329865 + n3));
                                                                int cfr_ignored_20 = (int)(0x4B073F4DBAA1748CL ^ (long)n3 ^ 0x83EBB9F1123F3BDFL);
                                                                n4 = -354036013 + n3;
                                                                n2 += 3;
                                                                continue;
                                                            }
                                                            int cfr_ignored_21 = Integer.rotateLeft(0x91261A80 ^ n3, 5) + -1745169221;
                                                            n4 = 49306314 + n3;
                                                            int cfr_ignored_22 = Integer.rotateRight(0x14A5DC07 ^ n3, 5) - -2072820716;
                                                            int cfr_ignored_23 = (int)(0x14C46E030A2278FCL ^ (long)n3 ^ 0x2176D8F70ADF8459L);
                                                            n4 = (int)((long)(-354036013 + n3) ^ 0xC26344FE41BCE2B2L ^ 0xC26344FE41BCE2B2L);
                                                            n2 += 5;
                                                            continue;
                                                        }
                                                        int cfr_ignored_24 = (Integer.rotateLeft(0x68B60D91 ^ n3, 16) + -1301724214) * 1756761489;
                                                        int cfr_ignored_25 = (int)(0xAA04A3AC27D4EB4FL ^ (long)n3 ^ 0xBA28831A2DB8F9D8L);
                                                        try {
                                                            --n2;
                                                            if ((0xFD5579FC0550B14BL ^ (long)n3 | 1L) == 0L) {
                                                                throw new IllegalArgumentException();
                                                            }
                                                            n4 = -354036013 + n3;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            n4 = (int)((long)(-354036013 + n3) ^ 0x88FD6FA27E7462E3L ^ 0x88FD6FA27E7462E3L);
                                                        }
                                                        continue;
                                                    }
                                                    int cfr_ignored_26 = Integer.rotateRight(0xCC1B186A ^ n3, 12) + -1146776559;
                                                    n4 = 1999625396 + n3 ^ 0x4A8010F ^ 0x4A8010F;
                                                    int cfr_ignored_27 = (Integer.rotateRight(0x81D4AA3F ^ n3, 3) - -1122091812) * -2116769217;
                                                    try {
                                                        n2 -= 3;
                                                        if ((0x68B0EB7FD77F477BL ^ (long)n3 | 1L) == 0L) {
                                                            throw new UnsupportedOperationException();
                                                        }
                                                        n4 = Integer.reverse(Integer.reverse(-354036013 + n3));
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        n4 = -354036013 + n3 ^ 0x388D7F57 ^ 0x388D7F57;
                                                    }
                                                    n2 += 2;
                                                    continue;
                                                }
                                                int cfr_ignored_28 = (Integer.rotateRight(0xB28D315E ^ n3, 9) - -1552508515) * -1299369633;
                                                n4 = 96064383 + n3;
                                                int cfr_ignored_29 = Integer.rotateRight(0x5C66A30B ^ n3, 14) + 885742992;
                                                try {
                                                    n2 -= 5;
                                                    if ((0xC208CDBAB4AF8A8FL ^ (long)n3 | 1L) == 0L) {
                                                        throw new UnsupportedOperationException();
                                                    }
                                                    n4 = -354036013 + n3 + 1135613167 - 1135613167;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    n4 = Integer.reverse(Integer.reverse(-354036013 + n3));
                                                }
                                                n2 -= 3;
                                                continue;
                                            }
                                            int cfr_ignored_30 = (Integer.rotateRight(0xE6C44E5F ^ n3, 15) - -165471044) * -423342497;
                                            try {
                                                if ((0xF2F1A3AE1AF301DDL ^ (long)n3 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                n4 = -354036013 + n3;
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                n4 = (int)((long)(-354036013 + n3) ^ 0x14173680527282EEL ^ 0x14173680527282EEL);
                                            }
                                            continue;
                                        }
                                        int cfr_ignored_31 = (Integer.rotateLeft(0x96FDA1B4 ^ n3, 5) - 1293169671) * -1761762891;
                                        n4 = -1708218708 + n3 + -28239938 - -28239938;
                                        int cfr_ignored_32 = Integer.rotateLeft(0x7EA9D328 ^ n3, 18) + 1525559571;
                                        n4 = -354036013 + n3 ^ 0x8C3A0A66 ^ 0x8C3A0A66;
                                        int cfr_ignored_33 = Integer.rotateRight(0xB577D507 ^ n3, 9) - -35624172;
                                        n2 += 4;
                                        continue;
                                    }
                                    int cfr_ignored_34 = (Integer.rotateRight(0x728D33FF ^ n3, 17) - -478745828) * 1921856511;
                                    try {
                                        n2 -= 3;
                                        n4 = -354036013 + n3;
                                    }
                                    catch (ArithmeticException arithmeticException) {
                                        n4 = -354036013 + n3 + -518847041 - -518847041;
                                    }
                                    ++n2;
                                    continue;
                                }
                                int cfr_ignored_35 = (Integer.rotateRight(0x527A29F ^ n3, 3) - -1540730756) * 86483615;
                                try {
                                    n2 -= 3;
                                    n4 = (int)((long)(-354036013 + n3) ^ 0x7EC73007780367FL ^ 0x7EC73007780367FL);
                                }
                                catch (IllegalStateException illegalStateException) {
                                    n4 = -354036013 + n3 + -339630988 - -339630988;
                                }
                                n2 += 3;
                                continue;
                            }
                            int cfr_ignored_36 = Integer.rotateLeft(0x7350DB4C ^ n3, 17) - -81253009;
                            int cfr_ignored_37 = (int)(0x32EE8DFAB8CED316L ^ (long)n3 ^ 0xE685BD2E5D0BC80CL);
                            n4 = -354036013 + n3 ^ 0xBF731D38 ^ 0xBF731D38;
                            continue;
                        }
                        int cfr_ignored_38 = Integer.rotateLeft(0xB9EE2E8D ^ n3, 10) - -2009775538;
                        int cfr_ignored_39 = (int)(0x7B5C80B027D4EB4FL ^ (long)n3 ^ 0xFC10831A2DB95B68L);
                        try {
                            n4 = -354036013 + n3;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n4 = -354036013 + n3 ^ 0x48285256 ^ 0x48285256;
                        }
                        continue;
                    }
                    int cfr_ignored_40 = (Integer.rotateLeft(0xA6F0FA14 ^ n3, 7) - 999024551) * -1494156779;
                    try {
                        n2 += 3;
                        if ((0x4C73889AAFC7899L ^ (long)n3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n4 = -354036013 + n3 + -275767089 - -275767089;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n4 = -354036013 + n3 + -1594104370 - -1594104370;
                    }
                    --n2;
                    continue;
                }
                return f5;
            }
            int cfr_ignored_41 = (Integer.rotateRight(0xE5F54917 ^ n3, 15) - -586057468) * -436909801;
            n4 = -354036013 + n3 ^ 0xA4049EB6 ^ 0xA4049EB6;
        }
    }

    private float jdt_3(float f, float f2) {
        try {
            int n = -1612823081;
            n = Integer.rotateLeft(n * 390073769, 16) ^ 0x100D49CF;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x4A7A4A7E;
            if ((n2 ^ n) != 1249528446) {
                int cfr_ignored_0 = (0xD5A40FA9 ^ n) - -1768777890;
            }
            if ((0x2C6 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!Float.isFinite(f)) {
            this.rsha_2 = 0.0f;
            return 0.0f;
        }
        float f3 = f + this.rsha_2;
        int n = Math.round(f3 / f2);
        float f4 = (float)n * f2;
        this.rsha_2 = f3 - f4;
        return f4;
    }

    private float khthh_2(float f) {
        int n = 292353964;
        n = Integer.rotateLeft(n * -943316049, 25) ^ 0xE9DDD77D;
        n = System.identityHashCode(this) ^ n;
        n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 8);
        int n2 = n ^ 0xE5A90BEB;
        if ((n2 ^ n) != -441906197) {
            int cfr_ignored_0 = (0xF4C5FC47 ^ n) + 621526469;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return Float.isFinite(f) ? f : 0.0f;
    }

    private static void dhzy_2() {
        int n = -1935825904;
        int n2 = (n = Integer.rotateLeft(n * -1843409141, 9) ^ 0xC5C85670) ^ 0xEAF2B31C;
        if ((n2 ^ n) != -353193188) {
            int cfr_ignored_0 = (0x666F170C ^ n) - -1023037154;
        }
        yf.athz_2();
    }

    private static float tda_5(float f, float f2) {
        block0: {
            int n = 561392124;
            n = Integer.rotateLeft(n * -911110449, 14) ^ 0x19D37F09;
            n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 27);
            int n2 = n ^ 0x17FDEEFA;
            if ((n2 ^ n) == 402517754) break block0;
            int cfr_ignored_0 = (0x368BC706 ^ n) - 1110424145;
        }
        return bghdh.bds_3(f, f2);
    }

    private static float jqt_2(lb lb2) {
        block0: {
            int n = -1522059702;
            n = Integer.rotateLeft(n * -73809291, 17) ^ 0xEB10FEF6;
            lb lb3 = lb2;
            n = Integer.rotateRight((lb3 != null ? System.identityHashCode(lb3) : 0) ^ n, 24);
            int n2 = n ^ 0x6B2CD25F;
            if ((n2 ^ n) == 1798099551) break block0;
            int cfr_ignored_0 = (0xCE6BE415 ^ n) - -1928420962;
        }
        return lb2.sry();
    }

    private static float zas_2(int n) {
        block0: {
            int n2 = bht_2.rthgh(-1082347923);
            int n3 = (n2 = n ^ n2) ^ 0x49D2320;
            if ((n3 ^ n2) == 77407008) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xBBE18D4D ^ n2, 10) - -995247218;
            int cfr_ignored_1 = (int)(0x7953237027D4EB4FL ^ (long)n2 ^ 0xBB90831A2DB95F77L);
        }
        return Float.intBitsToFloat(n);
    }

    private static float dhzd(ky ky2, float f) {
        block0: {
            int n = 272368561;
            int n2 = (n = Integer.rotateLeft(n * -639035779, 22) ^ 0x5C8186A0) ^ 0xA2797011;
            if ((n2 ^ n) == -1569099759) break block0;
            int cfr_ignored_0 = (0xB24573A0 ^ n) + 1144669775;
        }
        return ky2.khthh_2(f);
    }

    private static float khld(float f, float f2, float f3) {
        block0: {
            int n = 684289099;
            n = Integer.rotateLeft(n * -1983138333, 23) ^ 0x318A39B1;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 16);
            n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 12);
            int n2 = n ^ 0x239D4AC0;
            if ((n2 ^ n) == 597510848) break block0;
            int cfr_ignored_0 = (0xB54268B ^ n) + 1946470870;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static float ghshz(lb lb2) {
        block0: {
            int n = bht_2.rthgh(-1584692845);
            lb lb3 = lb2;
            n = Integer.rotateLeft((lb3 != null ? System.identityHashCode(lb3) : 0) ^ n, 7);
            int n2 = n ^ 0xB50F0F20;
            if ((n2 ^ n) == -1257304288) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x14848EB3 ^ n, 5) + -2140477720) * 344231603;
        }
        return lb2.khdhd_2();
    }

    private static float shksh(int n) {
        block0: {
            int n2 = -1698224930;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1230505311, 14) ^ 0x131F1F31) ^ 0x533E2271;
            if ((n3 ^ n2) == 1396580977) break block0;
            int cfr_ignored_0 = (0xC9F906AF ^ n2) - 1466377020;
        }
        return Float.intBitsToFloat(n);
    }

    private static boolean tdq_4(float f) {
        block0: {
            int n = 81206725;
            n = Integer.rotateLeft(n * -596032817, 17) ^ 0xA1F5BA2;
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 26);
            int n2 = n ^ 0xA56F59AF;
            if ((n2 ^ n) == -1519429201) break block0;
            int cfr_ignored_0 = (0xA1B8446A ^ n) - 312647727;
        }
        return Float.isFinite(f);
    }

    private static String[] dhtq_2(String string) {
        int n = bht_2.rthgh(1741273976);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x6B2B1C3E;
        if ((n2 ^ n) != 1797987390) {
            int cfr_ignored_0 = Integer.rotateRight(0xCE2A746 ^ n, 4) - -1815093067;
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

    private static CallSite sal_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1843492945;
            n3 = Integer.rotateLeft(n3 * -1530294987, 16) ^ 0x83A3D320;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xCD4F45B9;
            if ((n4 ^ n3) != -850442823) {
                int cfr_ignored_0 = (0x5F51C216 ^ n3) - 525947228;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ thdr ^ string.hashCode() ^ n2 + rdsh + i * -620626947) + thdr) ^ rdsh));
            }
            String[] stringArray = ky.dhtq_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType3) : lookup.findVirtual(clazz, stringArray[1], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] wg7899oh163k0(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite gfl5tgvuw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ q3puoii7ml ^ string.hashCode() ^ n2 + ls34mj01ydqlg ^ i * -1015599407 ^ q3puoii7ml, 18) ^ ls34mj01ydqlg));
            }
            String[] stringArray = ky.wg7899oh163k0(new String(cArray));
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

