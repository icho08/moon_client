/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_241
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1309;
import net.minecraft.class_241;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.wm;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="ElytraBooster", category=bzw.OTHER, desc="Adjusts firework acceleration while gliding")
public final class byk
extends bnq {
    private static final String[] dhrs_2;
    private static final float zbh = 1.5f;
    private static final float tsz = 2.5f;
    private final khd thqw = new khd(this, "Mode");
    private final fy khhs = new fy(this.thqw, "Custom").rhh_3();
    private final fy bzd_2 = new fy(this.thqw, "LonyGrief");
    private final fy zghh = new fy(this.thqw, "BravoHVH");
    private final fy syl = new fy(this.thqw, "ReallyWorld");
    private final fy bhj_2 = new fy(this.thqw, "SlimeWorld");
    private final tay[] tjy = new tay[dhrs_2.length];
    private final tay[] js = new tay[dhrs_2.length];
    private static final int khths_2 = -2039649667;
    private static final int dhms_2 = 654416570;
    private static final int dhya = 425348852;
    private static final int tqf = -1376608245;
    private static final int etmu3gm5e = 1616351489;
    private static final int rhrxrrom29o = -2054620379;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int gaxnus43q;

    public byk() {
        for (int i = 0; i < dhrs_2.length; ++i) {
            String string = dhrs_2[i];
            this.tjy[i] = this.dmgh("Yaw " + string);
            this.js[i] = this.dmgh("Pitch " + string);
        }
    }

    public class_241 adht(class_1309 class_13092) {
        float f = 0.0f;
        class_241 class_2412 = null;
        int n = 0;
        int n2 = -815977589;
        n2 = Integer.rotateLeft(n2 * 1329103333, 12) ^ 0x826A1AFD;
        class_1309 class_13093 = class_13092;
        n2 = Integer.rotateRight((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n2, 21);
        int n3 = n2 ^ 0xD27B59DB;
        while (true) {
            block39: {
                block68: {
                    block58: {
                        block51: {
                            block53: {
                                block48: {
                                    block57: {
                                        block46: {
                                            block37: {
                                                block52: {
                                                    block61: {
                                                        block56: {
                                                            block41: {
                                                                block67: {
                                                                    block71: {
                                                                        block72: {
                                                                            block60: {
                                                                                block47: {
                                                                                    block42: {
                                                                                        block44: {
                                                                                            block69: {
                                                                                                block63: {
                                                                                                    block36: {
                                                                                                        block74: {
                                                                                                            block38: {
                                                                                                                block66: {
                                                                                                                    block73: {
                                                                                                                        block62: {
                                                                                                                            block50: {
                                                                                                                                block43: {
                                                                                                                                    block70: {
                                                                                                                                        block64: {
                                                                                                                                            block65: {
                                                                                                                                                block54: {
                                                                                                                                                    block59: {
                                                                                                                                                        block55: {
                                                                                                                                                            block33: {
                                                                                                                                                                block49: {
                                                                                                                                                                    block45: {
                                                                                                                                                                        block34: {
                                                                                                                                                                            block40: {
                                                                                                                                                                                block35: {
                                                                                                                                                                                    if ((n = n3 ^ n2) > 115328230) break block33;
                                                                                                                                                                                    if (n > -1058740485) break block34;
                                                                                                                                                                                    if (n > -1888253284) break block35;
                                                                                                                                                                                    if (n == -2107314765) break block36;
                                                                                                                                                                                    if (n == -1980996006) break block37;
                                                                                                                                                                                    int cfr_ignored_0 = (Integer.rotateLeft(0x851144F8 ^ n2, 3) + 561314115) * -2062465799;
                                                                                                                                                                                    if (n == -1888253284) break block38;
                                                                                                                                                                                    break block39;
                                                                                                                                                                                }
                                                                                                                                                                                if (n > -1634437086) break block40;
                                                                                                                                                                                if (n == -1725326275) break block41;
                                                                                                                                                                                if (n == -1634437086) break block42;
                                                                                                                                                                                break block39;
                                                                                                                                                                            }
                                                                                                                                                                            if (n == -1613727543) break block43;
                                                                                                                                                                            if (n == -1058740485) break block44;
                                                                                                                                                                            int cfr_ignored_1 = (Integer.rotateRight(0x4FE54237 ^ n2, 12) - -1323260956) * 1340424759;
                                                                                                                                                                            break block39;
                                                                                                                                                                        }
                                                                                                                                                                        if (n > -524471693) break block45;
                                                                                                                                                                        if (n == -814701210) break block46;
                                                                                                                                                                        if (n == -763668005) break block47;
                                                                                                                                                                        int cfr_ignored_2 = (Integer.rotateLeft(0x329FB1D8 ^ n2, 9) + 632563811) * 849326553;
                                                                                                                                                                        if (n == -524471693) break block48;
                                                                                                                                                                        break block39;
                                                                                                                                                                    }
                                                                                                                                                                    if (n > -395256472) break block49;
                                                                                                                                                                    if (n == -473823299) break block50;
                                                                                                                                                                    if (n == -395256472) break block51;
                                                                                                                                                                    break block39;
                                                                                                                                                                }
                                                                                                                                                                if (n == -275191583) break block52;
                                                                                                                                                                if (n == 115328230) break block53;
                                                                                                                                                                int cfr_ignored_3 = (Integer.rotateRight(0x128DAA33 ^ n2, 5) + 1132804968) * 311274035;
                                                                                                                                                                break block39;
                                                                                                                                                            }
                                                                                                                                                            if (n > 997849189) break block54;
                                                                                                                                                            if (n > 595720295) break block55;
                                                                                                                                                            if (n == 118271805) break block56;
                                                                                                                                                            if (n == 535512141) break block57;
                                                                                                                                                            if (n == 595720295) break block58;
                                                                                                                                                            break block39;
                                                                                                                                                        }
                                                                                                                                                        if (n > 645355926) break block59;
                                                                                                                                                        if (n == 597702630) break block60;
                                                                                                                                                        if (n == 645355926) break block61;
                                                                                                                                                        break block39;
                                                                                                                                                    }
                                                                                                                                                    if (n == 665400618) break block62;
                                                                                                                                                    if (n == 997849189) break block63;
                                                                                                                                                    break block39;
                                                                                                                                                }
                                                                                                                                                if (n > 1669910796) break block64;
                                                                                                                                                if (n > 1171340032) break block65;
                                                                                                                                                if (n == 1134930230) break block66;
                                                                                                                                                if (n == 1171340032) break block67;
                                                                                                                                                break block39;
                                                                                                                                            }
                                                                                                                                            if (n == 1213076132) break block68;
                                                                                                                                            if (n == 1669910796) break block69;
                                                                                                                                            break block39;
                                                                                                                                        }
                                                                                                                                        if (n > 1920355069) break block70;
                                                                                                                                        if (n == 1903393993) break block71;
                                                                                                                                        if (n == 1920355069) break block72;
                                                                                                                                        break block39;
                                                                                                                                    }
                                                                                                                                    if (n == 2027717981) break block73;
                                                                                                                                    if (n == 2032970251) break block74;
                                                                                                                                    int cfr_ignored_4 = (Integer.rotateLeft(0x72460FF0 ^ n2, 17) + -623276725) * 1917194225;
                                                                                                                                    break block39;
                                                                                                                                }
                                                                                                                                int cfr_ignored_5 = (Integer.rotateLeft(0xA48DFB75 ^ n2, 7) - -242281882) * -1534198923;
                                                                                                                                int cfr_ignored_6 = (int)(0x663F554827D4EB4FL ^ (long)n2 ^ 0x57E0831A2DB961AFL);
                                                                                                                                class_2412 = byk.thkt(this, class_13092.method_36454(), byk.tqs_4(class_13092));
                                                                                                                                n3 = (int)((long)(n2 ^ 0x484E12A4) ^ 0x2179185D6869BB96L ^ 0x2179185D6869BB96L);
                                                                                                                                int cfr_ignored_7 = Integer.rotateRight(0x1BC0EFE2 ^ n2, 6) + 1622846361;
                                                                                                                                n -= 5;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            int cfr_ignored_8 = Integer.rotateRight(0x328F8242 ^ n2, 9) + 599680313;
                                                                                                                            class_2412 = new class_241(Float.intBitsToFloat(Integer.reverse(1414142683) ^ 0xE498522A), Float.intBitsToFloat(-480560818 - -1550108338));
                                                                                                                            try {
                                                                                                                                n -= 2;
                                                                                                                                if ((0x70E2C2F9A0DEE81FL ^ (long)n2 | 1L) == 0L) {
                                                                                                                                    throw new IllegalStateException();
                                                                                                                                }
                                                                                                                                n3 = n2 ^ 0x484E12A4;
                                                                                                                            }
                                                                                                                            catch (IllegalStateException illegalStateException) {
                                                                                                                                n3 = (n2 ^ 0x484E12A4) + -1663983423 - -1663983423;
                                                                                                                            }
                                                                                                                            n -= 2;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        int cfr_ignored_9 = Integer.rotateLeft(0x409E80A5 ^ n2, 11) - -678481098;
                                                                                                                        int cfr_ignored_10 = (int)(0x822C2E9827D4EB4FL ^ (long)n2 ^ 0xA040831A2DB8A989L);
                                                                                                                        if (!this.thqw.skhth(this.khhs)) {
                                                                                                                            n3 = n2 ^ 0x49154BB7;
                                                                                                                            int cfr_ignored_11 = (Integer.rotateLeft(0xBBEE4214 ^ n2, 10) - -969433177) * -1142013419;
                                                                                                                            n3 = (int)((long)(n2 ^ 0x43A5A936) ^ 0xB5579DA1F84F8710L ^ 0xB5579DA1F84F8710L);
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        n3 = n2 ^ 0x9FD078C9 ^ 0xF29A8264 ^ 0xF29A8264;
                                                                                                                        int cfr_ignored_12 = (Integer.rotateRight(0xF26B8BB7 ^ n2, 17) - 1600359012) * -227832905;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    int cfr_ignored_13 = Integer.rotateLeft(0x5A12FDAC ^ n2, 14) - -324380913;
                                                                                                                    if (!this.thqw.skhth(this.syl)) {
                                                                                                                        try {
                                                                                                                            n3 = (int)((long)(n2 ^ 0x3B79F865) ^ 0xFF0E3B6E2F99549FL ^ 0xFF0E3B6E2F99549FL);
                                                                                                                        }
                                                                                                                        catch (ArithmeticException arithmeticException) {
                                                                                                                            n3 = n2 ^ 0x3B79F865 ^ 0xA3C0123F ^ 0xA3C0123F;
                                                                                                                        }
                                                                                                                        --n;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if ((0xC0520AB3DE1C51CBL ^ (long)n2 | 1L) == 0L) {
                                                                                                                            throw new IllegalStateException();
                                                                                                                        }
                                                                                                                        n3 = (n2 ^ 0x6388D10C) + 1470059891 - 1470059891;
                                                                                                                    }
                                                                                                                    catch (IllegalStateException illegalStateException) {
                                                                                                                        n3 = (n2 ^ 0x6388D10C) + -1026479353 - -1026479353;
                                                                                                                    }
                                                                                                                    n += 5;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                int cfr_ignored_14 = (Integer.rotateRight(0x8EC27B9E ^ n2, 4) - 1307219805) * -1899856993;
                                                                                                                if (byk.shzd_4(this.thqw, this.bzd_2)) {
                                                                                                                    try {
                                                                                                                        ++n;
                                                                                                                        n3 = n2 ^ 0x8F738A9C ^ 0xAD5CAB40 ^ 0xAD5CAB40;
                                                                                                                    }
                                                                                                                    catch (IllegalStateException illegalStateException) {
                                                                                                                        n3 = (n2 ^ 0x8F738A9C) + 1332923771 - 1332923771;
                                                                                                                    }
                                                                                                                    n += 2;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                int cfr_ignored_15 = (int)(0x412BEE8E8CC24B24L ^ (long)n2 ^ 0x206DD5376D6F2F86L);
                                                                                                                n3 = (n2 ^ 0x34CE6FB2) + 460382191 - 460382191;
                                                                                                                int cfr_ignored_16 = (int)(0xF08EB676EF70AEDCL ^ (long)n2 ^ 0x919D1252A69E4CCCL);
                                                                                                                n3 = (int)((long)(n2 ^ 0x9E947822) ^ 0xE4E9C161C0323A19L ^ 0xE4E9C161C0323A19L);
                                                                                                                n -= 3;
                                                                                                                continue;
                                                                                                            }
                                                                                                            int cfr_ignored_17 = (Integer.rotateRight(0x932B325E ^ n2, 5) - -694634339) * -1825885601;
                                                                                                            f = byk.thlt_2(class_13092.method_36454(), class_13092.method_36455());
                                                                                                            class_2412 = new class_241(f, f);
                                                                                                            n3 = (n2 ^ 0x484E12A4) + -1326304092 - -1326304092;
                                                                                                            continue;
                                                                                                        }
                                                                                                        int cfr_ignored_18 = (Integer.rotateRight(0x81C3BB96 ^ n2, 3) - -1156491675) * -2117878889;
                                                                                                        class_2412 = new class_241(Float.intBitsToFloat(Integer.rotateLeft(0xD2EA550F ^ 0xD2EA52F7, 19)), Float.intBitsToFloat(-1820607586 - 1404812190));
                                                                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x609EB648));
                                                                                                        int cfr_ignored_19 = (Integer.rotateLeft(0xCE9DE3FC ^ n2, 12) - 159136447) * -828513283;
                                                                                                        n3 = (n2 ^ 0x484E12A4) + 1959398239 - 1959398239;
                                                                                                        continue;
                                                                                                    }
                                                                                                    int cfr_ignored_20 = Integer.rotateLeft(0xCEA1E940 ^ n2, 12) + 167304699;
                                                                                                    class_2412 = byk.dhz_5(byk.tdhz(class_13092), class_13092.method_36455(), byk.hdgh(0xD4E7D784 ^ 0xEB1E4E1E));
                                                                                                    n3 = (int)((long)(n2 ^ 0x484E12A4) ^ 0xA1F95B07C130EA8BL ^ 0xA1F95B07C130EA8BL);
                                                                                                    int cfr_ignored_21 = (Integer.rotateRight(0xEEED6E17 ^ n2, 16) - -216140796) * -286429673;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_22 = Integer.rotateLeft(0xBD2C948C ^ n2, 10) - -322724817;
                                                                                                if (this.thqw.skhth(this.bhj_2)) {
                                                                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xAAAC27EC));
                                                                                                    int cfr_ignored_23 = (Integer.rotateRight(0x66E32133 ^ n2, 15) + 2044634216) * 1726161203;
                                                                                                    n3 = n2 ^ 0x23A037E6;
                                                                                                    ++n;
                                                                                                    continue;
                                                                                                }
                                                                                                n3 = (n2 ^ 0x11ECE830) + 182249712 - 182249712;
                                                                                                int cfr_ignored_24 = (Integer.rotateRight(0x7FDBF633 ^ n2, 18) + -2147455128) * 2145121843;
                                                                                                n3 = (int)((long)(n2 ^ 0x792CAA0B) ^ 0xAE6095EFDB6B2FA6L ^ 0xAE6095EFDB6B2FA6L);
                                                                                                --n;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_25 = (Integer.rotateLeft(0x50193AD8 ^ n2, 13) + -1217675421) * 1343830745;
                                                                                            class_2412 = byk.dthr(byk.swgh(class_13092), class_13092.method_36455(), Float.intBitsToFloat(562034413 + 508855284));
                                                                                            n3 = n2 ^ 0xD6BD3B7;
                                                                                            int cfr_ignored_26 = (Integer.rotateLeft(0x152C929C ^ n2, 5) - -1799135201) * 355242653;
                                                                                            n3 = n2 ^ 0x484E12A4 ^ 0x76A0B633 ^ 0x76A0B633;
                                                                                            n += 3;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_27 = (Integer.rotateRight(0x474A3A9F ^ n2, 11) - -1504003972) * 1196047007;
                                                                                        class_2412 = byk.dthr(byk.swgh(class_13092), class_13092.method_36455(), Float.intBitsToFloat(562034413 + 508855284));
                                                                                        try {
                                                                                            n += 2;
                                                                                            if ((0xD7F06DFE3494D7CBL ^ (long)n2 | 1L) == 0L) {
                                                                                                throw new IllegalArgumentException();
                                                                                            }
                                                                                            n3 = (n2 ^ 0x484E12A4) + 1880127184 - 1880127184;
                                                                                        }
                                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                                            n3 = n2 ^ 0x484E12A4;
                                                                                        }
                                                                                        n -= 5;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_28 = Integer.rotateLeft(0x10ECEA6D ^ n2, 5) - 286130798;
                                                                                    int cfr_ignored_29 = (int)(0xD25E445027D4EB4FL ^ (long)n2 ^ 0x75D0831A2DB8096DL);
                                                                                    if (!this.thqw.skhth(this.zghh)) {
                                                                                        try {
                                                                                            if ((0x6F223C34CE0B3D4FL ^ (long)n2 | 1L) == 0L) {
                                                                                                throw new UnsupportedOperationException();
                                                                                            }
                                                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x78DC855D));
                                                                                        }
                                                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                            n3 = (n2 ^ 0x78DC855D) + 207647788 - 207647788;
                                                                                        }
                                                                                        n -= 4;
                                                                                        continue;
                                                                                    }
                                                                                    try {
                                                                                        --n;
                                                                                        if ((0xE7EC2B3A1500CD37L ^ (long)n2 | 1L) == 0L) {
                                                                                            throw new ArithmeticException();
                                                                                        }
                                                                                        n3 = (n2 ^ 0x8264EDB3) + 1446414705 - 1446414705;
                                                                                    }
                                                                                    catch (ArithmeticException arithmeticException) {
                                                                                        n3 = (int)((long)(n2 ^ 0x8264EDB3) ^ 0x7D2E2E0B522D7572L ^ 0x7D2E2E0B522D7572L);
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_30 = Integer.rotateRight(0x97D968E3 ^ n2, 5) + 1739674296;
                                                                                if (class_13092 != null) {
                                                                                    n3 = (n2 ^ 0x27A9352A) + -2063226171 - -2063226171;
                                                                                    int cfr_ignored_31 = Integer.rotateRight(0xD8B93D2E ^ n2, 14) - 1120667597;
                                                                                    n -= 4;
                                                                                    continue;
                                                                                }
                                                                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA8E488FF));
                                                                                int cfr_ignored_32 = (Integer.rotateLeft(0x21B0A934 ^ n2, 7) - 415374471) * 565225781;
                                                                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0xE3C207BD));
                                                                                n -= 5;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_33 = Integer.rotateRight(0xDAB98826 ^ n2, 14) - -2133517355;
                                                                            class_2412 = byk.ghsz_2(class_13092.method_36454(), class_13092.method_36455(), Float.intBitsToFloat(Integer.rotateLeft(0xA4817DD4 ^ 0x3D18EDD5, 18)));
                                                                            n3 = (n2 ^ 0x484E12A4) + -641116258 - -641116258;
                                                                            int cfr_ignored_34 = Integer.rotateRight(0xD0D0DB66 ^ n2, 13) - 1302868117;
                                                                            n += 3;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_35 = (Integer.rotateLeft(0x68927CB5 ^ n2, 16) - -1373980378) * 1754430645;
                                                                        int cfr_ignored_36 = (int)(0xAA20D28827D4EB4FL ^ (long)n2 ^ 0x5860831A2DB8F990L);
                                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xD27B59DB));
                                                                        n += 4;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_37 = Integer.rotateLeft(0x89BF7144 ^ n2, 4) - -1299425673;
                                                                    n3 = (n2 ^ 0x926BD637) + 1568177842 - 1568177842;
                                                                    int cfr_ignored_38 = Integer.rotateLeft(0x365C6C68 ^ n2, 9) + -1718698029;
                                                                    try {
                                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xD27B59DB));
                                                                    }
                                                                    catch (ArithmeticException arithmeticException) {
                                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xD27B59DB));
                                                                    }
                                                                    ++n;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_39 = (Integer.rotateRight(0x1188EB1B ^ n2, 5) + 603068288) * 294185755;
                                                                n3 = (n2 ^ 0xD27B59DB) + 1491901593 - 1491901593;
                                                                int cfr_ignored_40 = Integer.rotateLeft(0xA561E36C ^ n2, 7) - 188229967;
                                                                n += 3;
                                                                continue;
                                                            }
                                                            int cfr_ignored_41 = Integer.rotateLeft(0xC0872764 ^ n2, 11) - 1421567063;
                                                            try {
                                                                n -= 2;
                                                                if ((0xB6084FB6ECB059B9L ^ (long)n2 | 1L) == 0L) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                n3 = (int)((long)(n2 ^ 0xD27B59DB) ^ 0x8987DB246A8C4DAFL ^ 0x8987DB246A8C4DAFL);
                                                            }
                                                            catch (IllegalStateException illegalStateException) {
                                                                n3 = n2 ^ 0xD27B59DB;
                                                            }
                                                            n += 5;
                                                            continue;
                                                        }
                                                        int cfr_ignored_42 = Integer.rotateLeft(0x1EDA560D ^ n2, 6) - -1060238642;
                                                        int cfr_ignored_43 = (int)(0xDC68F83027D4EB4FL ^ (long)n2 ^ 0xD10831A2DB81500L);
                                                        n3 = (int)((long)(n2 ^ 0x2ADB93E7) ^ 0x93CAAC0D511AFD9FL ^ 0x93CAAC0D511AFD9FL);
                                                        int cfr_ignored_44 = (Integer.rotateLeft(0x4007CE50 ^ n2, 11) + -984638741) * 1074253393;
                                                        int cfr_ignored_45 = (int)(0x6C0A6615B2504DEBL ^ (long)n2 ^ 0x315BA81360F175C5L);
                                                        n3 = n2 ^ 0xD27B59DB;
                                                        n += 4;
                                                        continue;
                                                    }
                                                    int cfr_ignored_46 = (Integer.rotateRight(0x92E8F876 ^ n2, 5) - -829180539) * -1830225801;
                                                    n3 = n2 ^ 0x1143D908;
                                                    int cfr_ignored_47 = (Integer.rotateRight(0x5CD00713 ^ n2, 14) + 1099856520) * 1557137171;
                                                    n3 = n2 ^ 0xD27B59DB;
                                                    int cfr_ignored_48 = (Integer.rotateLeft(0x4446CE14 ^ n2, 11) - 1223725991) * 1145490965;
                                                    ++n;
                                                    continue;
                                                }
                                                int cfr_ignored_49 = Integer.rotateRight(0x58295647 ^ n2, 14) - -1319169580;
                                                n3 = (int)((long)(n2 ^ 0xCECD66F8) ^ 0x69099437AB56DFCDL ^ 0x69099437AB56DFCDL);
                                                int cfr_ignored_50 = Integer.rotateRight(0x18F93C8A ^ n2, 6) + 176944113;
                                                n3 = n2 ^ 0xD27B59DB ^ 0x5AEC8B88 ^ 0x5AEC8B88;
                                                n -= 5;
                                                continue;
                                            }
                                            int cfr_ignored_51 = Integer.rotateLeft(0x3AC4CBCD ^ n2, 10) - 573721870;
                                            int cfr_ignored_52 = (int)(0xF87665F027D4EB4FL ^ (long)n2 ^ 0x3690831A2DB85D3DL);
                                            n3 = (n2 ^ 0xDBD3AB0A) + -1754316910 - -1754316910;
                                            int cfr_ignored_53 = Integer.rotateLeft(0xD59C4B24 ^ n2, 13) - -498419561;
                                            n3 = n2 ^ 0x4D4FA5C5;
                                            int cfr_ignored_54 = Integer.rotateRight(0x1F8D7BAB ^ n2, 6) + -696280848;
                                            n3 = (int)((long)(n2 ^ 0xD27B59DB) ^ 0x53A43C1FFD6384E5L ^ 0x53A43C1FFD6384E5L);
                                            continue;
                                        }
                                        int cfr_ignored_55 = Integer.rotateLeft(0xE3AA3EE5 ^ n2, 15) - -1778696970;
                                        int cfr_ignored_56 = (int)(0x211890D827D4EB4FL ^ (long)n2 ^ 0xDCC0831A2DB9EFE0L);
                                        int cfr_ignored_57 = (int)(0x87B73801D6407CF5L ^ (long)n2 ^ 0x8D73603302CCA2BFL);
                                        n3 = (n2 ^ 0xF05FCFEA) + 699590611 - 699590611;
                                        int cfr_ignored_58 = (int)(0xFC01E0C215A722C5L ^ (long)n2 ^ 0x3CF4E7FDBEAC55D2L);
                                        n3 = n2 ^ 0xD27B59DB;
                                        continue;
                                    }
                                    int cfr_ignored_59 = (Integer.rotateLeft(0xFB1BAAD4 ^ n2, 18) - 1823952615) * -82072875;
                                    n3 = (int)((long)(n2 ^ 0xEE20A049) ^ 0x2644715F464390A6L ^ 0x2644715F464390A6L);
                                    int cfr_ignored_60 = (Integer.rotateRight(0x767B617F ^ n2, 17) - 1565420956) * 1987797375;
                                    n3 = (n2 ^ 0xD27B59DB) + 1672271595 - 1672271595;
                                    continue;
                                }
                                int cfr_ignored_61 = Integer.rotateLeft(0x8746816C ^ n2, 3) - 1709656911;
                                int cfr_ignored_62 = (int)(0x85D5AED11FD43C14L ^ (long)n2 ^ 0xA0D2F31B830EA67AL);
                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA5B7D83D));
                                int cfr_ignored_63 = (int)(0xAE994A710A0AD78L ^ (long)n2 ^ 0xD43EEDF2A1D7B802L);
                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0xD27B59DB));
                                continue;
                            }
                            int cfr_ignored_64 = (Integer.rotateRight(0x62B53A73 ^ n2, 15) + -128994520) * 1656044147;
                            n3 = (int)((long)(n2 ^ 0xA32F0C39) ^ 0x90FD32719CB7BAE6L ^ 0x90FD32719CB7BAE6L);
                            int cfr_ignored_65 = (Integer.rotateRight(0x154E3A33 ^ n2, 5) + -1730761880) * 357448243;
                            n3 = (int)((long)(n2 ^ 0x7D536830) ^ 0x19C3EBA50B5959E9L ^ 0x19C3EBA50B5959E9L);
                            int cfr_ignored_66 = Integer.rotateRight(0x7FADDEC3 ^ n2, 18) + 2053871832;
                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xD27B59DB));
                            n += 2;
                            continue;
                        }
                        int cfr_ignored_67 = (Integer.rotateRight(0x21AD257B ^ n2, 7) + 408234272) * 564995451;
                        try {
                            n3 = n2 ^ 0xD27B59DB ^ 0x7363A365 ^ 0x7363A365;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = n2 ^ 0xD27B59DB ^ 0x3C145335 ^ 0x3C145335;
                        }
                        --n;
                        continue;
                    }
                    int cfr_ignored_68 = (Integer.rotateRight(0x3279B27F ^ n2, 9) - 555367580) * 846836351;
                    int cfr_ignored_69 = (int)(0xD35B83EC6E5ED1E7L ^ (long)n2 ^ 0xFAA8100E58E80B66L);
                    n3 = n2 ^ 0xD27B59DB ^ 0x7811869A ^ 0x7811869A;
                    n += 2;
                    continue;
                }
                return class_2412;
            }
            int cfr_ignored_70 = (Integer.rotateLeft(0x1BBE11C ^ n2, 3) - 975036831) * 29090077;
            n3 = (n2 ^ 0xD27B59DB) + -77317329 - -77317329;
        }
    }

    private tay dmgh(String string) {
        int n = 834087954;
        n = Integer.rotateLeft(n * 683351955, 27) ^ 0xF22CD773;
        n = System.identityHashCode(this) ^ n;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x7B49E069;
        if ((n2 ^ n) != 2068439145) {
            int cfr_ignored_0 = (0x4AFECC7B ^ n) - 1804635187;
        }
        return new tay((hy)this, string, this::dsz_5).shth_7(Float.intBitsToFloat(1768063106 + -698515586)).dhbs_2(byk.jzr(Integer.rotateLeft(0xB9216656 ^ 0xBD21665E, 27))).rkh_3(Float.intBitsToFloat(121301669 - -887680101)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x8B6B18B ^ 0x8B68E4B, 16)));
    }

    /*
     * Unable to fully structure code
     */
    private class_241 hbt_2(float var1_1, float var2_2) {
        var3_3 = 0;
        var4_4 = 0;
        var5_5 = 0.0f;
        var6_6 = 0.0f;
        var7_7 = null;
        var10_8 = 0;
        var8_9 = -413502760;
        var8_9 = Integer.rotateLeft(var8_9 * 2129867685, 27) ^ -152714759;
        var9_10 = var8_9 - -1197180890 + -1667570489 - -1667570489;
        while (true) {
            block37: {
                block26: {
                    block28: {
                        block38: {
                            block32: {
                                block35: {
                                    block29: {
                                        block33: {
                                            block36: {
                                                block27: {
                                                    block30: {
                                                        block31: {
                                                            block34: {
                                                                var10_8 = var8_9 - var9_10;
                                                                switch (var10_8 & 7) {
                                                                    case 4: {
                                                                        if (var10_8 == 1488852220) break block26;
                                                                        if (var10_8 == -2128155260) break block27;
                                                                        (Integer.rotateLeft(20280061 ^ var8_9, 3) - 701926366) * 20280061;
                                                                        (int)(-4357271396597568689L ^ (long)var8_9 ^ 4967614537449089758L);
                                                                        if (var10_8 != -1722376372) {
                                                                            ** break;
                                                                        }
                                                                        break block28;
                                                                    }
                                                                    case 5: {
                                                                        if (var10_8 != 705986877) {
                                                                            ** break;
                                                                        }
                                                                        break block29;
                                                                    }
                                                                    case 0: {
                                                                        if (var10_8 == 2125510928) break block30;
                                                                        if (var10_8 != -1929625456) {
                                                                            Integer.rotateRight(1930190703 ^ var8_9, 17) - -220385876;
                                                                            ** break;
                                                                        }
                                                                        break block31;
                                                                    }
                                                                    case 2: {
                                                                        if (var10_8 == -151171718) break block32;
                                                                        if (var10_8 != -1482904054) {
                                                                            Integer.rotateLeft(1437241896 ^ var8_9, 13) + 1678070291;
                                                                            ** break;
                                                                        }
                                                                        break block33;
                                                                    }
                                                                    case 6: {
                                                                        if (var10_8 == -1197180890) break block34;
                                                                        if (var10_8 != -1666782882) {
                                                                            ** break;
                                                                        }
                                                                        break block35;
                                                                    }
                                                                    case 1: {
                                                                        if (var10_8 == 1725497777) break;
                                                                        if (var10_8 != 1611130121) {
                                                                            ** break;
                                                                        }
                                                                        break block36;
                                                                    }
                                                                    case 7: {
                                                                        if (var10_8 == 1192725863) break block37;
                                                                        if (var10_8 != -517650169) {
                                                                            ** break;
                                                                        }
                                                                        break block38;
                                                                    }
                                                                }
                                                                Integer.rotateRight(-1680663574 ^ var8_9, 6) + -487718767;
                                                                var5_5 = var6_6;
                                                                try {
                                                                    var10_8 += 3;
                                                                    var9_10 = var8_9 - -1929625456;
                                                                }
                                                                catch (IllegalArgumentException v0) {
                                                                    var9_10 = var8_9 - -1929625456 ^ -2068468106 ^ -2068468106;
                                                                }
                                                                continue;
                                                            }
                                                            (Integer.rotateRight(548309271 ^ var8_9, 7) - -109037308) * 548309271;
                                                            var3_3 = byk.snt_4(var1_1);
                                                            var4_4 = byk.snt_4(var2_2);
                                                            var5_5 = byk.dnz_3(this.tjy[var3_3]);
                                                            var6_6 = byk.zdy_2(this.js[var4_4]);
                                                            if (var6_6 > var5_5) {
                                                                (int)(4551648246503147034L ^ (long)var8_9 ^ -7305654429077482620L);
                                                                var9_10 = var8_9 - 647666658 + -106722907 - -106722907;
                                                                (int)(6696318730460543046L ^ (long)var8_9 ^ -3917863972452494323L);
                                                                var9_10 = Integer.reverse(Integer.reverse(var8_9 - 1725497777));
                                                                ++var10_8;
                                                                continue;
                                                            }
                                                            var9_10 = var8_9 - -1065045847 ^ 1706907233 ^ 1706907233;
                                                            Integer.rotateRight(645656998 ^ var8_9, 7) - -1386225067;
                                                            var9_10 = var8_9 - -1929625456;
                                                            --var10_8;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(480975107 ^ var8_9, 6) + 2098570904;
                                                        var7_7 = new class_241(var5_5, var6_6);
                                                        var9_10 = Integer.reverse(Integer.reverse(var8_9 - 1192725863));
                                                        Integer.rotateRight(-577448318 ^ var8_9, 14) + -647784199;
                                                        var10_8 -= 4;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(1187241128 ^ var8_9, 11) + -1776986221;
                                                    (int)(-3146658480762348441L ^ (long)var8_9 ^ 6404661634583233912L);
                                                    var9_10 = var8_9 - -1197180890;
                                                    var10_8 -= 4;
                                                    continue;
                                                }
                                                Integer.rotateLeft(1217713605 ^ var8_9, 12) - -832339434;
                                                (int)(-8491963741610120369L ^ (long)var8_9 ^ 756748885857712541L);
                                                try {
                                                    --var10_8;
                                                    if ((-7282901397816160053L ^ (long)var8_9 | 1L) == 0L) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    var9_10 = var8_9 - -1197180890;
                                                }
                                                catch (NoSuchElementException v1) {
                                                    var9_10 = var8_9 - -1197180890 + 759306114 - 759306114;
                                                }
                                                var10_8 -= 3;
                                                continue;
                                            }
                                            (Integer.rotateRight(-1804418977 ^ var8_9, 5) - -29168964) * -1804418977;
                                            var9_10 = var8_9 - 1990846232 ^ -658881604 ^ -658881604;
                                            Integer.rotateLeft(-1309627263 ^ var8_9, 9) + -1870495014;
                                            (int)(8305203669969988431L ^ (long)var8_9 ^ -574064804030231723L);
                                            var9_10 = var8_9 - -1197180890 + 1771084871 - 1771084871;
                                            var10_8 += 2;
                                            continue;
                                        }
                                        (Integer.rotateLeft(-357157795 ^ var8_9, 16) - 1886254718) * -357157795;
                                        (int)(2883599399199763279L ^ (long)var8_9 ^ -3913483927725408808L);
                                        var9_10 = var8_9 - -2067312503 + -187501251 - -187501251;
                                        (Integer.rotateLeft(1985711641 ^ var8_9, 17) + 1500763202) * 1985711641;
                                        (int)(-5410758137649763505L ^ (long)var8_9 ^ -4811952053385903101L);
                                        try {
                                            var10_8 -= 3;
                                            if ((-2516497174471712071L ^ (long)var8_9 | 1L) == 0L) {
                                                throw new NoSuchElementException();
                                            }
                                            var9_10 = Integer.reverse(Integer.reverse(var8_9 - -1197180890));
                                        }
                                        catch (NoSuchElementException v2) {
                                            var9_10 = Integer.reverse(Integer.reverse(var8_9 - -1197180890));
                                        }
                                        var10_8 += 3;
                                        continue;
                                    }
                                    Integer.rotateLeft(-432392224 ^ var8_9, 15) + -446012581;
                                    var9_10 = Integer.reverse(Integer.reverse(var8_9 - -1197180890));
                                    (Integer.rotateLeft(657056884 ^ var8_9, 7) - -1032828601) * 657056885;
                                    --var10_8;
                                    continue;
                                }
                                (Integer.rotateLeft(1052408852 ^ var8_9, 10) - -1661819481) * 1052408853;
                                (int)(-2405273362891287987L ^ (long)var8_9 ^ 8956902079754670316L);
                                var9_10 = (int)((long)(var8_9 - -1085477562) ^ -6817559970573651477L ^ -6817559970573651477L);
                                (int)(-5058955629161189716L ^ (long)var8_9 ^ 585897272839953988L);
                                var9_10 = var8_9 - -1197180890 ^ -2065976541 ^ -2065976541;
                                continue;
                            }
                            Integer.rotateRight(-44756861 ^ var8_9, 18) + -1314218216;
                            var9_10 = var8_9 - -1197180890 ^ 761530117 ^ 761530117;
                            var10_8 -= 5;
                            continue;
                        }
                        (Integer.rotateRight(181575098 ^ var8_9, 4) + 1407105217) * 181575099;
                        var9_10 = (int)((long)(var8_9 - 928329514) ^ 7990986783541678871L ^ 7990986783541678871L);
                        Integer.rotateRight(928904007 ^ var8_9, 9) - -1195502380;
                        (int)(-3272482401235552437L ^ (long)var8_9 ^ 6935708308161431802L);
                        var9_10 = Integer.reverse(Integer.reverse(var8_9 - -1691160852));
                        (int)(6427477045471899221L ^ (long)var8_9 ^ 419940990670675892L);
                        var9_10 = var8_9 - -1197180890 ^ 1534604347 ^ 1534604347;
                        var10_8 += 3;
                        continue;
                    }
                    Integer.rotateLeft(1365353640 ^ var8_9, 13) + -550465645;
                    var9_10 = Integer.reverse(Integer.reverse(var8_9 - -2004897552));
                    Integer.rotateLeft(1706861541 ^ var8_9, 15) - 1446344694;
                    (int)(-6409169997669274801L ^ (long)var8_9 ^ -1819310100998200371L);
                    var9_10 = var8_9 - 2019492728;
                    (Integer.rotateRight(-337426277 ^ var8_9, 16) + -1797035520) * -337426277;
                    var9_10 = Integer.reverse(Integer.reverse(var8_9 - -1197180890));
                    continue;
                }
                (Integer.rotateLeft(948334716 ^ var8_9, 10) - -593150401) * 948334717;
                var9_10 = Integer.reverse(Integer.reverse(var8_9 - -1428862762));
                Integer.rotateLeft(551566657 ^ var8_9, 7) + -8058342;
                (int)(-2138484711594071217L ^ (long)var8_9 ^ -2627706234111235724L);
                (int)(-501178035411475383L ^ (long)var8_9 ^ 1659031756473655239L);
                var9_10 = var8_9 - 1186470218;
                (int)(1219250373151066847L ^ (long)var8_9 ^ -5264000501970007034L);
                var9_10 = var8_9 - -1197180890 ^ -1248728058 ^ -1248728058;
                continue;
            }
            return var7_7;
lbl219:
            // 8 sources

            (Integer.rotateLeft(-119331655 ^ var8_9, 18) + 668930466) * -119331655;
            (int)(4202292227521964879L ^ (long)var8_9 ^ -1695461111245448846L);
            var9_10 = var8_9 - -1197180890;
        }
    }

    private static class_241 ghsz_2(float f, float f2, float f3) {
        int n = -498769449;
        n = Integer.rotateLeft(n * 1844080299, 9) ^ 0x58B20F96;
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 6);
        n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 20);
        int n2 = n ^ 0x1EB73466;
        if ((n2 ^ n) != 515322982) {
            int cfr_ignored_0 = (0xFCF255B1 ^ n) + -412260148;
        }
        float f4 = byk.shkh_3(f);
        float f5 = 1.0f - f4 / byk.ahr(-1181357134 - 2002906034);
        float f6 = byk.drz(f2);
        float f7 = Math.min(f3 * Float.intBitsToFloat(Integer.reverse(984919743) ^ 0xC2461E6F), Float.intBitsToFloat(-842926418 + 1913900001));
        float f8 = f7 + (f3 - f7) * f5 * f6;
        return new class_241(f8, f8);
    }

    /*
     * Unable to fully structure code
     */
    private static float sat_5(float var0, float var1_1) {
        var2_2 = 0.0f;
        var3_3 = 0.0f;
        var4_4 = 0.0f;
        var5_5 = 0.0f;
        var6_6 = 0.0f;
        var9_7 = 0;
        var7_8 = -1691110543;
        var7_8 = Integer.rotateLeft(var7_8 * 130216107, 9) ^ 1650032459;
        var7_8 = Integer.rotateRight(Float.floatToIntBits(var0) ^ var7_8, 21);
        var7_8 = Float.floatToIntBits(var1_1) ^ var7_8;
        var8_9 = Integer.reverse(Integer.reverse(var7_8 ^ 1759928523));
        block28: while (true) {
            if ((var9_7 = var8_9 ^ var7_8) == -1597628296) ** GOTO lbl73
            if (var9_7 == 1759928523) ** GOTO lbl50
            switch (var9_7) {
                case 18833694: {
                    (Integer.rotateRight(-84057058 ^ var7_8, 18) - 1762442973) * -84057057;
                    byk.khah_2();
                    try {
                        var9_7 -= 4;
                        if ((-1784000682130074219L ^ (long)var7_8 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var8_9 = Integer.reverse(Integer.reverse(var7_8 ^ -1625002516));
                    }
                    catch (ArithmeticException v0) {
                        var8_9 = Integer.reverse(Integer.reverse(var7_8 ^ -1625002516));
                    }
                    var9_7 += 3;
                    continue block28;
                }
                case -1625002516: {
                    Integer.rotateRight(-420501241 ^ var7_8, 15) - -77392108;
                    var2_2 = byk.zakh(var0);
                    var3_3 = Math.abs(class_3532.method_15363((float)var1_1, (float)Float.intBitsToFloat(Integer.rotateLeft(183983358 ^ 180875774, 10)), (float)Float.intBitsToFloat(466924762 + 652167974)));
                    if (!(var3_3 >= Float.intBitsToFloat(-931970050 ^ -1962982402))) {
                        try {
                            --var9_7;
                            if ((734804974608646421L ^ (long)var7_8 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            var8_9 = (var7_8 ^ -1426461833) + 449879101 - 449879101;
                        }
                        catch (NoSuchElementException v1) {
                            var8_9 = var7_8 ^ -1426461833 ^ 2045566877 ^ 2045566877;
                        }
                        var9_7 -= 3;
                        continue block28;
                    }
                    var8_9 = (var7_8 ^ -1597628296) + -273823379 - -273823379;
                    (Integer.rotateRight(-1327885421 ^ var7_8, 9) + 1858469384) * -1327885421;
                    continue block28;
                }
lbl50:
                // 1 sources

                (Integer.rotateLeft(-127772047 ^ var7_8, 18) + 407278314) * -127772047;
                (int)(4238155857278593871L ^ (long)var7_8 ^ 1578655817852901488L);
                if (byk.thshh()) {
                    var8_9 = var7_8 ^ -1625002516 ^ -654938645 ^ -654938645;
                    --var9_7;
                    continue block28;
                }
                var8_9 = (int)((long)(var7_8 ^ 18833694) ^ 5761282571213176048L ^ 5761282571213176048L);
                continue block28;
                case -1426461833: {
                    (Integer.rotateLeft(1979403833 ^ var7_8, 17) + 1305221154) * 1979403833;
                    (int)(-5239410383016105137L ^ (long)var7_8 ^ 4429434381978354498L);
                    var4_4 = Float.intBitsToFloat(-860774899 + 1931245166) + Float.intBitsToFloat(-973390523 ^ -87667231) * (float)Math.sin(Math.toRadians(var2_2 * 2.0f));
                    var5_5 = Float.intBitsToFloat(Integer.reverse(1997278241) ^ -1140972395) + Float.intBitsToFloat(1792765793 ^ 1442457807) * (float)Math.sin(Math.toRadians(byk.khwt(var3_3, Float.intBitsToFloat(-1580012063 - 1595862497)) * 2.0f));
                    var6_6 = byk.tmy(byk.stth_2(Integer.rotateLeft(1800999973 ^ 985000733, 14)), Math.max(var4_4, var5_5));
                    (int)(808638374272099404L ^ (long)var7_8 ^ 5031251727945284512L);
                    var8_9 = var7_8 ^ 1351453284 ^ 396358843 ^ 396358843;
                    var9_7 -= 5;
                    continue block28;
                }
lbl73:
                // 1 sources

                Integer.rotateLeft(946058688 ^ var7_8, 10) + -663707269;
                var6_6 = Float.intBitsToFloat(Integer.rotateLeft(-1064953077 ^ 1056168346, 29));
                (int)(123407242397151616L ^ (long)var7_8 ^ 2380037117958401725L);
                var8_9 = Integer.reverse(Integer.reverse(var7_8 ^ -577549797));
                (int)(-4021873062841239588L ^ (long)var7_8 ^ 2518893137848319375L);
                var8_9 = (var7_8 ^ 1351453284) + 830457961 - 830457961;
                continue block28;
                case 2017200208: {
                    Integer.rotateLeft(1171955041 ^ var7_8, 11) + 2044112378;
                    (int)(-8689639010113098929L ^ (long)var7_8 ^ -7221377854029126911L);
                    var8_9 = Integer.reverse(Integer.reverse(var7_8 ^ 1512371407));
                    (Integer.rotateLeft(707458448 ^ var7_8, 8) + 529619883) * 707458449;
                    (int)(-3368391631672511101L ^ (long)var7_8 ^ -2440828720045355181L);
                    var8_9 = var7_8 ^ 821901273;
                    (int)(126004744733745780L ^ (long)var7_8 ^ -6036108764274250066L);
                    var8_9 = var7_8 ^ 1759928523;
                    var9_7 += 2;
                    continue block28;
                }
                case -2010476116: {
                    Integer.rotateLeft(1053019013 ^ var7_8, 10) - -1642904490;
                    (int)(-256311862166754481L ^ (long)var7_8 ^ 3891254226507552051L);
                    var8_9 = (int)((long)(var7_8 ^ 420146480) ^ -2626141995639042599L ^ -2626141995639042599L);
                    (Integer.rotateRight(1663491450 ^ var7_8, 15) + 101871873) * 1663491451;
                    try {
                        ++var9_7;
                        if ((4261039214451866389L ^ (long)var7_8 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var8_9 = var7_8 ^ 1759928523;
                    }
                    catch (IllegalStateException v2) {
                        var8_9 = var7_8 ^ 1759928523;
                    }
                    var9_7 -= 2;
                    continue block28;
                }
                case -226665378: {
                    (Integer.rotateLeft(505311192 ^ var7_8, 6) + -1441977757) * 505311193;
                    var8_9 = var7_8 ^ 1122447834 ^ -1817122546 ^ -1817122546;
                    (Integer.rotateRight(-1316164390 ^ var7_8, 9) + -2073145951) * -1316164389;
                    var8_9 = var7_8 ^ 1759928523 ^ -1258279506 ^ -1258279506;
                    var9_7 += 4;
                    continue block28;
                }
                case 322030391: {
                    (Integer.rotateRight(2084191806 ^ var7_8, 18) - 258681021) * 2084191807;
                    var8_9 = (int)((long)(var7_8 ^ -946611271) ^ 1949162371666370016L ^ 1949162371666370016L);
                    Integer.rotateRight(-1423439830 ^ var7_8, 8) + -1103717295;
                    var8_9 = var7_8 ^ 1759928523 ^ 977741675 ^ 977741675;
                    continue block28;
                }
                case -1699200356: {
                    Integer.rotateRight(1544413638 ^ var7_8, 14) - 705426997;
                    (int)(-7529647605724508496L ^ (long)var7_8 ^ 6897893282840740563L);
                    var8_9 = var7_8 ^ -1592674024 ^ -692060357 ^ -692060357;
                    (int)(-2211950432629130187L ^ (long)var7_8 ^ -2816201057975374006L);
                    var8_9 = var7_8 ^ 1759928523;
                    var9_7 += 3;
                    continue block28;
                }
                case -2000831900: {
                    (Integer.rotateRight(916410875 ^ var7_8, 9) + -1582789472) * 916410875;
                    var8_9 = var7_8 ^ 779449605;
                    (Integer.rotateLeft(305392592 ^ var7_8, 5) + 950480235) * 305392593;
                    var8_9 = var7_8 ^ 1759928523;
                    Integer.rotateLeft(1667906976 ^ var7_8, 15) + 238753179;
                    var9_7 += 5;
                    continue block28;
                }
                case -1155588648: {
                    (Integer.rotateLeft(-223984392 ^ var7_8, 17) + 1719662915) * -223984391;
                    var8_9 = var7_8 ^ 1824832863 ^ 567737996 ^ 567737996;
                    (Integer.rotateRight(-8098082 ^ var7_8, 18) - -177796067) * -8098081;
                    var8_9 = Integer.reverse(Integer.reverse(var7_8 ^ 1759928523));
                    var9_7 -= 2;
                    continue block28;
                }
                case -14210842: {
                    Integer.rotateRight(122412426 ^ var7_8, 3) + -426937615;
                    var8_9 = (var7_8 ^ 1531340272) + 1244153156 - 1244153156;
                    (Integer.rotateLeft(2120424405 ^ var7_8, 18) - 1381891590) * 2120424405;
                    (int)(-4840888115741267121L ^ (long)var7_8 ^ -7592924823287180174L);
                    var8_9 = (var7_8 ^ 1759928523) + 12396657 - 12396657;
                    var9_7 -= 5;
                    continue block28;
                }
                case -778388135: {
                    (Integer.rotateRight(472233374 ^ var7_8, 6) - 1827577181) * 472233375;
                    try {
                        if ((4886377307223974835L ^ (long)var7_8 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var8_9 = (var7_8 ^ 1759928523) + -508097274 - -508097274;
                    }
                    catch (UnsupportedOperationException v3) {
                        var8_9 = (var7_8 ^ 1759928523) + -2152794 - -2152794;
                    }
                    var9_7 += 3;
                    continue block28;
                }
                case 1548208246: {
                    (Integer.rotateLeft(916036500 ^ var7_8, 9) - -1594395097) * 916036501;
                    try {
                        var9_7 -= 4;
                        var8_9 = (var7_8 ^ 1759928523) + -1670470218 - -1670470218;
                    }
                    catch (IllegalArgumentException v4) {
                        var8_9 = (int)((long)(var7_8 ^ 1759928523) ^ -6439423193658086462L ^ -6439423193658086462L);
                    }
                    var9_7 += 4;
                    continue block28;
                }
                case -1905511375: {
                    Integer.rotateRight(227737679 ^ var7_8, 4) - -1456822068;
                    var8_9 = var7_8 ^ 1136062283 ^ 451510736 ^ 451510736;
                    Integer.rotateLeft(1504088676 ^ var7_8, 14) - -544646825;
                    var8_9 = var7_8 ^ 1759928523 ^ -2139391730 ^ -2139391730;
                    var9_7 += 2;
                    continue block28;
                }
                case 1028514881: {
                    (Integer.rotateRight(92848151 ^ var7_8, 3) - -1343430140) * 92848151;
                    var8_9 = Integer.reverse(Integer.reverse(var7_8 ^ 312139453));
                    Integer.rotateLeft(-782895195 ^ var7_8, 13) - 1573297206;
                    (int)(1434213516378958671L ^ (long)var7_8 ^ 5638650881927383583L);
                    var8_9 = var7_8 ^ 1257231155;
                    Integer.rotateRight(-254675614 ^ var7_8, 17) + 768235033;
                    var8_9 = Integer.reverse(Integer.reverse(var7_8 ^ 1759928523));
                    var9_7 -= 2;
                    continue block28;
                }
                case 1351453284: {
                    return var6_6;
                }
            }
            Integer.rotateRight(1335066794 ^ var7_8, 12) + -1489357871;
            var8_9 = Integer.reverse(Integer.reverse(var7_8 ^ 1759928523));
        }
    }

    private static int snt_4(float f) {
        int n = 390144586;
        n = Integer.rotateLeft(n * -1120926983, 6) ^ 0x844F6972;
        n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 3);
        int n2 = n ^ 0x6E4A2246;
        if ((n2 ^ n) != 1850352198) {
            int cfr_ignored_0 = (0x790B000C ^ n) - -1536568223;
        }
        float f2 = byk.azkh(f);
        return Math.min((int)(f2 / Float.intBitsToFloat(Integer.reverse(402769482) ^ 0x12C38018)), dhrs_2.length - 1);
    }

    private static float zakh(float f) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        int n = 0;
        int n2 = -329253246;
        n2 = Integer.rotateLeft(n2 * -1365680993, 21) ^ 0x64A2983F;
        n2 = Integer.rotateRight(Float.floatToIntBits(f) ^ n2, 26);
        int n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x9F9E191D, 9)));
        while (true) {
            block32: {
                block47: {
                    block31: {
                        block48: {
                            block50: {
                                block52: {
                                    block46: {
                                        block33: {
                                            block30: {
                                                block53: {
                                                    block54: {
                                                        block39: {
                                                            block40: {
                                                                block51: {
                                                                    block41: {
                                                                        block37: {
                                                                            block35: {
                                                                                block38: {
                                                                                    block45: {
                                                                                        block44: {
                                                                                            block34: {
                                                                                                block49: {
                                                                                                    block42: {
                                                                                                        block43: {
                                                                                                            block27: {
                                                                                                                block36: {
                                                                                                                    block28: {
                                                                                                                        block29: {
                                                                                                                            if ((n = Integer.rotateRight(n3, 9) ^ n2) > -555434632) break block27;
                                                                                                                            if (n > -1587589083) break block28;
                                                                                                                            if (n > -1947156453) break block29;
                                                                                                                            if (n == -2079174482) break block30;
                                                                                                                            if (n == -1947156453) break block31;
                                                                                                                            break block32;
                                                                                                                        }
                                                                                                                        if (n == -1877206656) break block33;
                                                                                                                        if (n == -1617028835) break block34;
                                                                                                                        int cfr_ignored_0 = (Integer.rotateLeft(0xD7884958 ^ n2, 13) + 501121251) * -678934183;
                                                                                                                        if (n == -1587589083) break block35;
                                                                                                                        break block32;
                                                                                                                    }
                                                                                                                    if (n > -882682302) break block36;
                                                                                                                    if (n == -1323176517) break block37;
                                                                                                                    if (n == -882682302) break block38;
                                                                                                                    int cfr_ignored_1 = Integer.rotateLeft(0xCD8B2D84 ^ n2, 12) - -398974409;
                                                                                                                    break block32;
                                                                                                                }
                                                                                                                if (n == -826262896) break block39;
                                                                                                                if (n == -801675509) break block40;
                                                                                                                if (n == -555434632) break block41;
                                                                                                                break block32;
                                                                                                            }
                                                                                                            if (n > 670353973) break block42;
                                                                                                            if (n > -91648376) break block43;
                                                                                                            if (n == -514612109) break block44;
                                                                                                            if (n == -91648376) break block45;
                                                                                                            int cfr_ignored_2 = Integer.rotateRight(0x923D8B0B ^ n2, 5) + -1177455216;
                                                                                                            break block32;
                                                                                                        }
                                                                                                        if (n == 253176279) break block46;
                                                                                                        if (n == 532278048) break block47;
                                                                                                        int cfr_ignored_3 = (Integer.rotateLeft(0x30AA7E39 ^ n2, 9) + -385685470) * 816479801;
                                                                                                        int cfr_ignored_4 = (int)(0xF218D00427D4EB4FL ^ (long)n2 ^ 0x5D78831A2DB849E0L);
                                                                                                        if (n == 670353973) break block48;
                                                                                                        break block32;
                                                                                                    }
                                                                                                    if (n > 989874393) break block49;
                                                                                                    if (n == 928927152) break block50;
                                                                                                    if (n == 989874393) break block51;
                                                                                                    int cfr_ignored_5 = (Integer.rotateLeft(0xDDAB9C74 ^ n2, 14) - -601517753) * -575955851;
                                                                                                    break block32;
                                                                                                }
                                                                                                if (n == 1300192173) break block52;
                                                                                                if (n == 1537421373) break block53;
                                                                                                if (n == 2035363275) break block54;
                                                                                                break block32;
                                                                                            }
                                                                                            int cfr_ignored_6 = (Integer.rotateLeft(0xB9B8FFF0 ^ n2, 10) + -2117821109) * -1179058191;
                                                                                            f2 = Math.abs(class_3532.method_15393((float)f));
                                                                                            if (!(f2 > Float.intBitsToFloat(-1845756034 + -1330118526))) {
                                                                                                int cfr_ignored_7 = (int)(0x1740D8AFA8E45BD8L ^ (long)n2 ^ 0x4C2F9D7B4C978350L);
                                                                                                n3 = Integer.rotateLeft(n2 ^ 0xE899FC9F, 9);
                                                                                                int cfr_ignored_8 = (int)(0xD252144187A16AF8L ^ (long)n2 ^ 0xD5F3C3F12ED60975L);
                                                                                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xCB635642, 9) ^ 0x6D83C1294A0A0693L ^ 0x6D83C1294A0A0693L);
                                                                                                n -= 5;
                                                                                                continue;
                                                                                            }
                                                                                            n3 = Integer.rotateLeft(n2 ^ 0x1797E0D8, 9);
                                                                                            int cfr_ignored_9 = Integer.rotateLeft(0x1D0B22AC ^ n2, 6) - -2001284593;
                                                                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xE153A473, 9)));
                                                                                            n += 5;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_10 = (Integer.rotateRight(0xFBC652DF ^ n2, 18) - -2124306372) * -70888737;
                                                                                        f2 = Float.intBitsToFloat(Integer.reverse(1063346779) ^ 0x997286FC) - f2;
                                                                                        try {
                                                                                            n -= 4;
                                                                                            if ((0x3476D91B2B8565DFL ^ (long)n2 | 1L) == 0L) {
                                                                                                throw new ArithmeticException();
                                                                                            }
                                                                                            n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xCB635642, 9) ^ 0xB226DC0FFC4C5940L ^ 0xB226DC0FFC4C5940L);
                                                                                        }
                                                                                        catch (ArithmeticException arithmeticException) {
                                                                                            n3 = Integer.rotateLeft(n2 ^ 0xCB635642, 9) + 527956861 - 527956861;
                                                                                        }
                                                                                        n += 5;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_11 = (Integer.rotateLeft(0x70114178 ^ n2, 17) + -1770746685) * 1880179065;
                                                                                    f3 = class_3532.method_15363((float)f2, (float)0.0f, (float)Float.intBitsToFloat(0xED35660F ^ 0xAF01660F));
                                                                                    try {
                                                                                        n -= 4;
                                                                                        if ((0x200DCD8093C5A64DL ^ (long)n2 | 1L) == 0L) {
                                                                                            throw new UnsupportedOperationException();
                                                                                        }
                                                                                        n3 = Integer.rotateLeft(n2 ^ 0x1FB9EB20, 9) ^ 0x1B7FD967 ^ 0x1B7FD967;
                                                                                    }
                                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                        n3 = Integer.rotateLeft(n2 ^ 0x1FB9EB20, 9) + 1455668980 - 1455668980;
                                                                                    }
                                                                                    n -= 4;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_12 = (Integer.rotateLeft(0xF06D7311 ^ n2, 17) + 564039242) * -261262575;
                                                                                int cfr_ignored_13 = (int)(0x32DFDD2C27D4EB4FL ^ (long)n2 ^ 0x4728831A2DB9C86EL);
                                                                                if (f2 > byk.zmj_2(414091200 - -696612928)) {
                                                                                    try {
                                                                                        n -= 5;
                                                                                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xA15F5025, 9) ^ 0xE03D66581928E431L ^ 0xE03D66581928E431L);
                                                                                    }
                                                                                    catch (ArithmeticException arithmeticException) {
                                                                                        n3 = Integer.rotateLeft(n2 ^ 0xA15F5025, 9) ^ 0xE79E5B08 ^ 0xE79E5B08;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                n3 = Integer.rotateLeft(n2 ^ 0xACCBED97, 9) + 1163862050 - 1163862050;
                                                                                int cfr_ignored_14 = (Integer.rotateLeft(0xEB091618 ^ n2, 16) + 2054638627) * -351726055;
                                                                                n3 = Integer.rotateLeft(n2 ^ 0xFA898E88, 9) ^ 0xE4A1B6AE ^ 0xE4A1B6AE;
                                                                                n += 5;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_15 = Integer.rotateLeft(0x4B29160C ^ n2, 12) - 509037231;
                                                                            f2 = Float.intBitsToFloat(Integer.reverse(126744694) ^ 0x2CABB1E0) - f2;
                                                                            int cfr_ignored_16 = (int)(0x85CCF34FBEC474EAL ^ (long)n2 ^ 0x1BEFB13B12F2A648L);
                                                                            n3 = Integer.rotateLeft(n2 ^ 0xFA898E88, 9);
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_17 = Integer.rotateLeft(0xCF54A2AC ^ n2, 12) - 530403855;
                                                                        n3 = Integer.rotateLeft(n2 ^ 0x9BBCA5A2, 9) + 130136224 - 130136224;
                                                                        int cfr_ignored_18 = (Integer.rotateLeft(0xE188D210 ^ n2, 15) + 1408175915) * -511127023;
                                                                        n3 = Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) + 1900559479 - 1900559479;
                                                                        n += 2;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_19 = Integer.rotateLeft(0x8226D3CD ^ n2, 3) - -955169522;
                                                                    int cfr_ignored_20 = (int)(0x40947DF027D4EB4FL ^ (long)n2 ^ 0x690831A2DB92CF9L);
                                                                    try {
                                                                        n3 = Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) ^ 0xEAC52D8F ^ 0xEAC52D8F;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        n3 = Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) + 131308818 - 131308818;
                                                                    }
                                                                    continue;
                                                                }
                                                                int cfr_ignored_21 = Integer.rotateLeft(0x90504ECD ^ n2, 5) - 2115447310;
                                                                int cfr_ignored_22 = (int)(0x52E2E0F027D4EB4FL ^ (long)n2 ^ 0x3C90831A2DB90814L);
                                                                n3 = Integer.rotateLeft(n2 ^ 0xBA101DA0, 9) ^ 0x9A3616B1 ^ 0x9A3616B1;
                                                                int cfr_ignored_23 = (Integer.rotateLeft(0xFB639D3C ^ n2, 18) - 1970121087) * -77357763;
                                                                try {
                                                                    n -= 4;
                                                                    if ((0xA89F42F324134551L ^ (long)n2 | 1L) == 0L) {
                                                                        throw new ArithmeticException();
                                                                    }
                                                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) ^ 0xB4E4B0C7EC29EA4DL ^ 0xB4E4B0C7EC29EA4DL);
                                                                }
                                                                catch (ArithmeticException arithmeticException) {
                                                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) ^ 0xD952796331724600L ^ 0xD952796331724600L);
                                                                }
                                                                --n;
                                                                continue;
                                                            }
                                                            int cfr_ignored_24 = Integer.rotateLeft(0xDA768F6C ^ n2, 14) - 2025389391;
                                                            try {
                                                                if ((0x6FA9D9B51651752BL ^ (long)n2 | 1L) == 0L) {
                                                                    throw new IllegalArgumentException();
                                                                }
                                                                n3 = Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) + 963660266 - 963660266;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x9F9E191D, 9)));
                                                            }
                                                            ++n;
                                                            continue;
                                                        }
                                                        int cfr_ignored_25 = Integer.rotateRight(0xB51BDFE2 ^ n2, 9) + -222446695;
                                                        try {
                                                            --n;
                                                            if ((0x47E117FB3150111L ^ (long)n2 | 1L) == 0L) {
                                                                throw new ArithmeticException();
                                                            }
                                                            n3 = Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) + 770471806 - 770471806;
                                                        }
                                                        catch (ArithmeticException arithmeticException) {
                                                            n3 = Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) + 1119670428 - 1119670428;
                                                        }
                                                        continue;
                                                    }
                                                    int cfr_ignored_26 = Integer.rotateRight(0x524BA6A3 ^ n2, 13) + -75051784;
                                                    int cfr_ignored_27 = (int)(0xA102984094EBC497L ^ (long)n2 ^ 0xCDF1E5647208EFD4L);
                                                    n3 = Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) + 268716452 - 268716452;
                                                    continue;
                                                }
                                                int cfr_ignored_28 = Integer.rotateLeft(0x42CF5129 ^ n2, 11) + 460878642;
                                                int cfr_ignored_29 = (int)(0x807DFF1427D4EB4FL ^ (long)n2 ^ 0x358831A2DB8AD2AL);
                                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xA179B5E6, 9)));
                                                int cfr_ignored_30 = (Integer.rotateRight(0xE7081F5B ^ n2, 15) + -27694272) * -418898085;
                                                n3 = Integer.rotateLeft(n2 ^ 0x9F9E191D, 9);
                                                n += 3;
                                                continue;
                                            }
                                            int cfr_ignored_31 = (Integer.rotateRight(0xA950C39E ^ n2, 8) - -2061152419) * -1454324833;
                                            n3 = Integer.rotateLeft(n2 ^ 0xE78AAD91, 9);
                                            int cfr_ignored_32 = Integer.rotateLeft(0xFF615B88 ^ n2, 18) + -249056077;
                                            n3 = Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) ^ 0xE8985ECE ^ 0xE8985ECE;
                                            int cfr_ignored_33 = (Integer.rotateRight(0x6BA82BB ^ n2, 3) + -722242592) * 112886459;
                                            continue;
                                        }
                                        int cfr_ignored_34 = Integer.rotateRight(0xF6E7F2C2 ^ n2, 17) + -361495367;
                                        n3 = Integer.rotateLeft(n2 ^ 0x5284A53B, 9);
                                        int cfr_ignored_35 = Integer.rotateRight(0x8A171763 ^ n2, 4) + -1121356744;
                                        try {
                                            n -= 5;
                                            if ((0x6E356DEDFA1C0C2FL ^ (long)n2 | 1L) == 0L) {
                                                throw new ArithmeticException();
                                            }
                                            n3 = Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) + -1295645823 - -1295645823;
                                        }
                                        catch (ArithmeticException arithmeticException) {
                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x9F9E191D, 9)));
                                        }
                                        n -= 4;
                                        continue;
                                    }
                                    int cfr_ignored_36 = Integer.rotateRight(0x75FE4982 ^ n2, 17) + 1311278585;
                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x25492DC5, 9)));
                                    int cfr_ignored_37 = (Integer.rotateRight(0x1DCE85F7 ^ n2, 6) - -1604331484) * 500073975;
                                    n3 = Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) ^ 0xC5796327 ^ 0xC5796327;
                                    int cfr_ignored_38 = Integer.rotateLeft(0xEB45E329 ^ n2, 16) + -2116804302;
                                    int cfr_ignored_39 = (int)(0x29F74D1427D4EB4FL ^ (long)n2 ^ 0x6758831A2DB9FE3FL);
                                    n -= 2;
                                    continue;
                                }
                                int cfr_ignored_40 = (Integer.rotateLeft(0xC91969D9 ^ n2, 12) + 1584492674) * -921081383;
                                int cfr_ignored_41 = (int)(0xBABC7E427D4EB4FL ^ (long)n2 ^ 0x72B8831A2DB9BA86L);
                                int cfr_ignored_42 = (int)(0x420C4FB9E9CF4B28L ^ (long)n2 ^ 0x62031F2D6D7729C9L);
                                n3 = Integer.rotateLeft(n2 ^ 0xE9477FCD, 9) + 1674822880 - 1674822880;
                                int cfr_ignored_43 = (int)(0x41A259E977D69602L ^ (long)n2 ^ 0x4EA2231ED7232E95L);
                                n3 = Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) + -1252159167 - -1252159167;
                                n += 2;
                                continue;
                            }
                            int cfr_ignored_44 = Integer.rotateRight(0x2AC296EA ^ n2, 8) + 837674385;
                            n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xF66AFC76, 9) ^ 0x4EB044E5DC4CB8AAL ^ 0x4EB044E5DC4CB8AAL);
                            int cfr_ignored_45 = (Integer.rotateLeft(0x746E9494 ^ n2, 17) - 499227943) * 1953404053;
                            n3 = Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) + -665133578 - -665133578;
                            n += 2;
                            continue;
                        }
                        int cfr_ignored_46 = Integer.rotateLeft(0xD0217729 ^ n2, 13) + 946539826;
                        int cfr_ignored_47 = (int)(0x1293D91427D4EB4FL ^ (long)n2 ^ 0x4F58831A2DB988F6L);
                        int cfr_ignored_48 = (int)(0x1E88DE5760A0C0DDL ^ (long)n2 ^ 0x41DE0DF27A9D90C0L);
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xE1E24305, 9) ^ 0xAC83F8BD54240938L ^ 0xAC83F8BD54240938L);
                        int cfr_ignored_49 = (int)(0xC20CEE5A969B2D7EL ^ (long)n2 ^ 0x21C5E185A1DA29C8L);
                        n3 = Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) + 1583868808 - 1583868808;
                        n += 5;
                        continue;
                    }
                    int cfr_ignored_50 = (Integer.rotateLeft(0x5AF95A19 ^ n2, 14) + 143624258) * 1526290969;
                    int cfr_ignored_51 = (int)(0x984BF42427D4EB4FL ^ (long)n2 ^ 0x1538831A2DB89D46L);
                    n3 = Integer.rotateLeft(n2 ^ 0xA238DBF8, 9) + -1801753426 - -1801753426;
                    int cfr_ignored_52 = Integer.rotateLeft(0xA1C4CEAD ^ n2, 7) - -1691179474;
                    int cfr_ignored_53 = (int)(0x6376609027D4EB4FL ^ (long)n2 ^ 0x3C50831A2DB96B3DL);
                    try {
                        n -= 5;
                        n3 = Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) ^ 0xACD0A2A ^ 0xACD0A2A;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x9F9E191D, 9)));
                    }
                    n += 2;
                    continue;
                }
                return f3;
            }
            int cfr_ignored_54 = (Integer.rotateRight(0x71EB0D5B ^ n2, 17) + -808174272) * 1911229787;
            n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x9F9E191D, 9) ^ 0xD6BED932A5DFC142L ^ 0xD6BED932A5DFC142L);
        }
    }

    private static float ayf(float f) {
        int n = wm.daq(1745214898);
        int n2 = n ^ 0x31A51E99;
        if ((n2 ^ n) != 832904857) {
            int cfr_ignored_0 = Integer.rotateRight(0x59A0C32B ^ n, 14) + -556449424;
        }
        float f2 = Math.abs(class_3532.method_15393((float)f));
        float f3 = Math.abs(f2 - Float.intBitsToFloat(0x82C36696 ^ 0xC0F76696));
        f3 = Math.min(f3, Math.abs(f2 - Float.intBitsToFloat(1511091038 - 386558814)));
        return Math.min(Float.intBitsToFloat(0x26FA7B34 ^ 0x64CE7B34), f3);
    }

    /*
     * Unable to fully structure code
     */
    private static float akh_2(float var0) {
        var1_1 = 0.0f;
        var2_2 = 0.0f;
        var5_3 = 0;
        var3_4 = -462661782;
        var3_4 = Integer.rotateLeft(var3_4 * -1434859511, 9) ^ 1530069711;
        var3_4 = Float.floatToIntBits(var0) ^ var3_4;
        var4_5 = -301369990 * 1048517139 + 1319864695 ^ var3_4 ^ 408427561 ^ 408427561;
        block50: while (true) {
            block113: {
                block89: {
                    block118: {
                        block100: {
                            block94: {
                                block105: {
                                    block119: {
                                        block107: {
                                            block106: {
                                                block104: {
                                                    block103: {
                                                        block92: {
                                                            block117: {
                                                                block120: {
                                                                    block93: {
                                                                        block114: {
                                                                            block95: {
                                                                                block97: {
                                                                                    block122: {
                                                                                        block96: {
                                                                                            block121: {
                                                                                                block111: {
                                                                                                    block109: {
                                                                                                        block115: {
                                                                                                            block112: {
                                                                                                                block116: {
                                                                                                                    block90: {
                                                                                                                        block102: {
                                                                                                                            block108: {
                                                                                                                                block91: {
                                                                                                                                    block99: {
                                                                                                                                        block101: {
                                                                                                                                            block98: {
                                                                                                                                                block110: {
                                                                                                                                                    var5_3 = ((var4_5 ^ var3_4) - 1319864695) * -1206992869;
                                                                                                                                                    switch (var5_3 & 15) {
                                                                                                                                                        case 5: {
                                                                                                                                                            if (var5_3 != 1129177893) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block89;
                                                                                                                                                        }
                                                                                                                                                        case 3: {
                                                                                                                                                            if (var5_3 != 1423339859) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block90;
                                                                                                                                                        }
                                                                                                                                                        case 1: {
                                                                                                                                                            if (var5_3 != 1772293601) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block91;
                                                                                                                                                        }
                                                                                                                                                        case 15: {
                                                                                                                                                            if (var5_3 == 152376671) break block92;
                                                                                                                                                            if (var5_3 == 1165728783) break block93;
                                                                                                                                                            Integer.rotateRight(1714735818 ^ var3_4, 15) + 1690447281;
                                                                                                                                                            if (var5_3 != 1814655887) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block94;
                                                                                                                                                        }
                                                                                                                                                        case 14: {
                                                                                                                                                            if (var5_3 == 1609513086) break block95;
                                                                                                                                                            if (var5_3 == -1606577026) break block96;
                                                                                                                                                            (Integer.rotateLeft(-1605242499 ^ var3_4, 7) - 1850334558) * -1605242499;
                                                                                                                                                            (int)(7125643764581067599L ^ (long)var3_4 ^ 4895556943411243031L);
                                                                                                                                                            if (var5_3 != -1492658994) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block97;
                                                                                                                                                        }
                                                                                                                                                        case 0: {
                                                                                                                                                            if (var5_3 != -1789764576) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block98;
                                                                                                                                                        }
                                                                                                                                                        case 12: {
                                                                                                                                                            if (var5_3 > 335156012) ** GOTO lbl51
                                                                                                                                                            if (var5_3 == -230793396) break block99;
                                                                                                                                                            if (var5_3 != 335156012) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block100;
lbl51:
                                                                                                                                                            // 1 sources

                                                                                                                                                            if (var5_3 == 407134252) break block101;
                                                                                                                                                            if (var5_3 == 1400702764) break block102;
                                                                                                                                                            if (var5_3 != 1955676156) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block103;
                                                                                                                                                        }
                                                                                                                                                        case 2: {
                                                                                                                                                            if (var5_3 > -302091214) ** GOTO lbl65
                                                                                                                                                            if (var5_3 == -1216890990) break block104;
                                                                                                                                                            if (var5_3 == -688858318) break block105;
                                                                                                                                                            (Integer.rotateLeft(1498526000 ^ var3_4, 14) + -717089781) * 1498526001;
                                                                                                                                                            if (var5_3 != -302091214) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block106;
lbl65:
                                                                                                                                                            // 1 sources

                                                                                                                                                            if (var5_3 == 483732530) break block107;
                                                                                                                                                            if (var5_3 == 711425586) break block108;
                                                                                                                                                            (Integer.rotateRight(1352212027 ^ var3_4, 13) + -957855648) * 1352212027;
                                                                                                                                                            if (var5_3 != 1363745138) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block109;
                                                                                                                                                        }
                                                                                                                                                        case 8: {
                                                                                                                                                            if (var5_3 != -709286600) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block110;
                                                                                                                                                        }
                                                                                                                                                        case 10: {
                                                                                                                                                            if (var5_3 > -301369990) ** GOTO lbl84
                                                                                                                                                            if (var5_3 == -521023862) break block111;
                                                                                                                                                            if (var5_3 != -301369990) {
                                                                                                                                                                Integer.rotateRight(416941798 ^ var3_4, 6) - 113538325;
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block112;
lbl84:
                                                                                                                                                            // 1 sources

                                                                                                                                                            if (var5_3 == 922043834) break block113;
                                                                                                                                                            if (var5_3 != 1968971866) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block114;
                                                                                                                                                        }
                                                                                                                                                        case 4: {
                                                                                                                                                            if (var5_3 == -1452430028) break block115;
                                                                                                                                                            if (var5_3 != 1012517924) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block116;
                                                                                                                                                        }
                                                                                                                                                        case 7: {
                                                                                                                                                            if (var5_3 != 790564103) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block117;
                                                                                                                                                        }
                                                                                                                                                        case 6: {
                                                                                                                                                            if (var5_3 == -1021423930) break;
                                                                                                                                                            if (var5_3 != -1319543770) {
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block118;
                                                                                                                                                        }
                                                                                                                                                        case 11: {
                                                                                                                                                            if (var5_3 == -1693679813) ** GOTO lbl112
                                                                                                                                                            if (var5_3 == 841615259) break block119;
                                                                                                                                                            if (var5_3 == -311513861) break block120;
                                                                                                                                                            if (var5_3 == 1650680811) break block121;
                                                                                                                                                            if (var5_3 != -506814181) {
                                                                                                                                                                Integer.rotateLeft(1363062824 ^ var3_4, 13) + -621480941;
                                                                                                                                                                ** break;
                                                                                                                                                            }
                                                                                                                                                            break block122;
lbl112:
                                                                                                                                                            // 1 sources

                                                                                                                                                            (Integer.rotateLeft(1599772533 ^ var3_4, 14) - -1873414554) * 1599772533;
                                                                                                                                                            (int)(-7068336633089299633L ^ (long)var3_4 ^ -8079313583043209727L);
                                                                                                                                                            var2_2 = Float.intBitsToFloat(Integer.rotateLeft(-334519119 ^ -1972815049, 17));
                                                                                                                                                            (int)(-3153205615105596008L ^ (long)var3_4 ^ -2515591303277443670L);
                                                                                                                                                            var4_5 = Integer.reverse(Integer.reverse(-967538398 * 1048517139 + 1319864695 ^ var3_4));
                                                                                                                                                            (int)(5678175805320323067L ^ (long)var3_4 ^ 2373357525439426632L);
                                                                                                                                                            var4_5 = (int)((long)(922043834 * 1048517139 + 1319864695 ^ var3_4) ^ 7378326413552381078L ^ 7378326413552381078L);
                                                                                                                                                            var5_3 -= 4;
                                                                                                                                                            continue block50;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    (Integer.rotateRight(1631810326 ^ var3_4, 15) - -880242971) * 1631810327;
                                                                                                                                                    var2_2 = Float.intBitsToFloat(Integer.reverse(133188155) ^ -484361005);
                                                                                                                                                    var4_5 = (2048169367 * 1048517139 + 1319864695 ^ var3_4) + 1099280194 - 1099280194;
                                                                                                                                                    (Integer.rotateLeft(-354330576 ^ var3_4, 16) + 1973898507) * -354330575;
                                                                                                                                                    var4_5 = (922043834 * 1048517139 + 1319864695 ^ var3_4) + 634051765 - 634051765;
                                                                                                                                                    var5_3 -= 2;
                                                                                                                                                    continue;
                                                                                                                                                }
                                                                                                                                                Integer.rotateRight(2058808046 ^ var3_4, 18) - -528215539;
                                                                                                                                                var2_2 = byk.khhdh(-273401849 - -1328688735);
                                                                                                                                                try {
                                                                                                                                                    var5_3 += 3;
                                                                                                                                                    if ((8357196207402758015L ^ (long)var3_4 | 1L) == 0L) {
                                                                                                                                                        throw new IllegalArgumentException();
                                                                                                                                                    }
                                                                                                                                                    var4_5 = (922043834 * 1048517139 + 1319864695 ^ var3_4) + 694371946 - 694371946;
                                                                                                                                                }
                                                                                                                                                catch (IllegalArgumentException v0) {
                                                                                                                                                    var4_5 = 922043834 * 1048517139 + 1319864695 ^ var3_4;
                                                                                                                                                }
                                                                                                                                                continue;
                                                                                                                                            }
                                                                                                                                            (Integer.rotateLeft(-1216932968 ^ var3_4, 9) + 1003028131) * -1216932967;
                                                                                                                                            var2_2 = byk.khhdh(-273401849 - -1328688735);
                                                                                                                                            (int)(9174870029900141867L ^ (long)var3_4 ^ -6760521424413043850L);
                                                                                                                                            var4_5 = (731436404 * 1048517139 + 1319864695 ^ var3_4) + -1818025582 - -1818025582;
                                                                                                                                            (int)(4277589416624016286L ^ (long)var3_4 ^ -1971841048810628245L);
                                                                                                                                            var4_5 = Integer.reverse(Integer.reverse(922043834 * 1048517139 + 1319864695 ^ var3_4));
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                        (Integer.rotateLeft(-1391403496 ^ var3_4, 8) + -110590941) * -1391403495;
                                                                                                                                        if (var1_1 <= Float.intBitsToFloat(20666616 + 1096460040)) {
                                                                                                                                            var4_5 = Integer.reverse(Integer.reverse(-230793396 * 1048517139 + 1319864695 ^ var3_4));
                                                                                                                                            Integer.rotateRight(-1143787537 ^ var3_4, 10) - -1024430804;
                                                                                                                                            --var5_3;
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                        (int)(-1802636042068721970L ^ (long)var3_4 ^ 9031079449113288742L);
                                                                                                                                        var4_5 = Integer.reverse(Integer.reverse(-1389053203 * 1048517139 + 1319864695 ^ var3_4));
                                                                                                                                        (int)(8820624452543833109L ^ (long)var3_4 ^ -5541220517856585469L);
                                                                                                                                        var4_5 = (-521023862 * 1048517139 + 1319864695 ^ var3_4) + -249763311 - -249763311;
                                                                                                                                        var5_3 += 2;
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                    (Integer.rotateRight(1117971698 ^ var3_4, 11) + 370628745) * 1117971699;
                                                                                                                                    var2_2 = Float.intBitsToFloat(-1265046454 - 1977989399);
                                                                                                                                    (int)(-3790253630276143512L ^ (long)var3_4 ^ 6755260013934426909L);
                                                                                                                                    var4_5 = Integer.reverse(Integer.reverse(922043834 * 1048517139 + 1319864695 ^ var3_4));
                                                                                                                                    var5_3 += 5;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                Integer.rotateLeft(-2119679200 ^ var3_4, 3) + -1212301285;
                                                                                                                                if (var1_1 <= Float.intBitsToFloat(-1686680993 - 1497582175)) {
                                                                                                                                    var4_5 = (int)((long)(123172362 * 1048517139 + 1319864695 ^ var3_4) ^ 6959025156107243878L ^ 6959025156107243878L);
                                                                                                                                    (Integer.rotateLeft(882802640 ^ var3_4, 9) + 1670322539) * 882802641;
                                                                                                                                    var4_5 = 1400702764 * 1048517139 + 1319864695 ^ var3_4 ^ -2143742521 ^ -2143742521;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                (int)(4536314396322680733L ^ (long)var3_4 ^ -8169072153734557639L);
                                                                                                                                var4_5 = Integer.reverse(Integer.reverse(-1045213896 * 1048517139 + 1319864695 ^ var3_4));
                                                                                                                                (int)(-1290586288210156850L ^ (long)var3_4 ^ 2902405923206754812L);
                                                                                                                                var4_5 = 1423339859 * 1048517139 + 1319864695 ^ var3_4;
                                                                                                                                var5_3 -= 5;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            (Integer.rotateLeft(-1426435524 ^ var3_4, 8) - -1196583809) * -1426435523;
                                                                                                                            if (!(var1_1 <= Float.intBitsToFloat(Integer.rotateLeft(-1685185875 ^ -1150674259, 1)))) {
                                                                                                                                (int)(2298236991234993420L ^ (long)var3_4 ^ 705706974611739160L);
                                                                                                                                var4_5 = -222737978 * 1048517139 + 1319864695 ^ var3_4 ^ -965224889 ^ -965224889;
                                                                                                                                (int)(-6621654704916647572L ^ (long)var3_4 ^ -5966481158140140057L);
                                                                                                                                var4_5 = -1452430028 * 1048517139 + 1319864695 ^ var3_4 ^ -390024616 ^ -390024616;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                var4_5 = (1650680811 * 1048517139 + 1319864695 ^ var3_4) + -1145124940 - -1145124940;
                                                                                                                            }
                                                                                                                            catch (ArithmeticException v1) {
                                                                                                                                var4_5 = 1650680811 * 1048517139 + 1319864695 ^ var3_4 ^ -1339776004 ^ -1339776004;
                                                                                                                            }
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        (Integer.rotateRight(952385599 ^ var3_4, 10) - -467573028) * 952385599;
                                                                                                                        var2_2 = Float.intBitsToFloat(-1273939130 ^ -1959305952);
                                                                                                                        try {
                                                                                                                            var5_3 -= 4;
                                                                                                                            if ((-416759452880065347L ^ (long)var3_4 | 1L) == 0L) {
                                                                                                                                throw new IllegalStateException();
                                                                                                                            }
                                                                                                                            var4_5 = 922043834 * 1048517139 + 1319864695 ^ var3_4 ^ -491739856 ^ -491739856;
                                                                                                                        }
                                                                                                                        catch (IllegalStateException v2) {
                                                                                                                            var4_5 = 922043834 * 1048517139 + 1319864695 ^ var3_4 ^ 1755193502 ^ 1755193502;
                                                                                                                        }
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    (Integer.rotateLeft(461027836 ^ var3_4, 6) - 1480205503) * 461027837;
                                                                                                                    if (!(var1_1 <= Float.intBitsToFloat(1111910741 ^ 1730901))) {
                                                                                                                        (int)(-2075282179236736818L ^ (long)var3_4 ^ -4124119160504816713L);
                                                                                                                        var4_5 = Integer.reverse(Integer.reverse(-1763270521 * 1048517139 + 1319864695 ^ var3_4));
                                                                                                                        (int)(-3990990513828942055L ^ (long)var3_4 ^ -5477645740013241109L);
                                                                                                                        var4_5 = 1012517924 * 1048517139 + 1319864695 ^ var3_4;
                                                                                                                        var5_3 -= 4;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    (int)(-5084651398501565175L ^ (long)var3_4 ^ -7094137472947003634L);
                                                                                                                    var4_5 = -1693679813 * 1048517139 + 1319864695 ^ var3_4 ^ -214246745 ^ -214246745;
                                                                                                                    var5_3 += 3;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                (Integer.rotateRight(926817398 ^ var3_4, 9) - -1260187259) * 926817399;
                                                                                                                if (!(var1_1 <= Float.intBitsToFloat(-1249097524 - 1930053836))) {
                                                                                                                    try {
                                                                                                                        var5_3 += 3;
                                                                                                                        if ((825783463929406483L ^ (long)var3_4 | 1L) == 0L) {
                                                                                                                            throw new ArithmeticException();
                                                                                                                        }
                                                                                                                        var4_5 = (407134252 * 1048517139 + 1319864695 ^ var3_4) + -1880917766 - -1880917766;
                                                                                                                    }
                                                                                                                    catch (ArithmeticException v3) {
                                                                                                                        var4_5 = 407134252 * 1048517139 + 1319864695 ^ var3_4;
                                                                                                                    }
                                                                                                                    continue;
                                                                                                                }
                                                                                                                try {
                                                                                                                    if ((3157087996779365641L ^ (long)var3_4 | 1L) == 0L) {
                                                                                                                        throw new UnsupportedOperationException();
                                                                                                                    }
                                                                                                                    var4_5 = -1789764576 * 1048517139 + 1319864695 ^ var3_4;
                                                                                                                }
                                                                                                                catch (UnsupportedOperationException v4) {
                                                                                                                    var4_5 = Integer.reverse(Integer.reverse(-1789764576 * 1048517139 + 1319864695 ^ var3_4));
                                                                                                                }
                                                                                                                --var5_3;
                                                                                                                continue;
                                                                                                            }
                                                                                                            (Integer.rotateRight(1402228415 ^ var3_4, 13) - 592652380) * 1402228415;
                                                                                                            var1_1 = byk.tm(class_3532.method_15363((float)var0, (float)Float.intBitsToFloat(-35122442 ^ 1062998774), (float)byk.thsa(Integer.reverse(-684836567) ^ -701991701)));
                                                                                                            if (var1_1 <= Float.intBitsToFloat(Integer.reverse(-1699894915) ^ -30034599)) {
                                                                                                                try {
                                                                                                                    --var5_3;
                                                                                                                    var4_5 = 1363745138 * 1048517139 + 1319864695 ^ var3_4 ^ -175357937 ^ -175357937;
                                                                                                                }
                                                                                                                catch (IllegalStateException v5) {
                                                                                                                    var4_5 = (int)((long)(1363745138 * 1048517139 + 1319864695 ^ var3_4) ^ -6317886143564616078L ^ -6317886143564616078L);
                                                                                                                }
                                                                                                                continue;
                                                                                                            }
                                                                                                            try {
                                                                                                                var5_3 -= 5;
                                                                                                                if ((-7572843410980899295L ^ (long)var3_4 | 1L) == 0L) {
                                                                                                                    throw new NoSuchElementException();
                                                                                                                }
                                                                                                                var4_5 = (int)((long)(-1606577026 * 1048517139 + 1319864695 ^ var3_4) ^ -5644739732718485699L ^ -5644739732718485699L);
                                                                                                            }
                                                                                                            catch (NoSuchElementException v6) {
                                                                                                                var4_5 = Integer.reverse(Integer.reverse(-1606577026 * 1048517139 + 1319864695 ^ var3_4));
                                                                                                            }
                                                                                                            var5_3 += 3;
                                                                                                            continue;
                                                                                                        }
                                                                                                        (Integer.rotateLeft(-1014908555 ^ var3_4, 11) - -1324149658) * -1014908555;
                                                                                                        (int)(86438416523520847L ^ (long)var3_4 ^ -3179397188464037961L);
                                                                                                        if (var1_1 <= Float.intBitsToFloat(851115618 + 256967070)) {
                                                                                                            var4_5 = -1258028206 * 1048517139 + 1319864695 ^ var3_4 ^ -1770195721 ^ -1770195721;
                                                                                                            (Integer.rotateRight(21442683 ^ var3_4, 3) + 737967648) * 21442683;
                                                                                                            var4_5 = (-506814181 * 1048517139 + 1319864695 ^ var3_4) + -1814645234 - -1814645234;
                                                                                                            var5_3 -= 4;
                                                                                                            continue;
                                                                                                        }
                                                                                                        var4_5 = (1772293601 * 1048517139 + 1319864695 ^ var3_4) + -818018569 - -818018569;
                                                                                                        var5_3 += 5;
                                                                                                        continue;
                                                                                                    }
                                                                                                    Integer.rotateRight(197976299 ^ var3_4, 4) + 1915542448;
                                                                                                    var2_2 = 1.0f;
                                                                                                    var4_5 = -2037203526 * 1048517139 + 1319864695 ^ var3_4;
                                                                                                    (Integer.rotateRight(-608539046 ^ var3_4, 14) + -1611596767) * -608539045;
                                                                                                    var4_5 = 922043834 * 1048517139 + 1319864695 ^ var3_4;
                                                                                                    ++var5_3;
                                                                                                    continue;
                                                                                                }
                                                                                                (Integer.rotateRight(-2016560034 ^ var3_4, 3) - 1984392861) * -2016560033;
                                                                                                var2_2 = Float.intBitsToFloat(Integer.rotateLeft(-2114878512 ^ -2114879432, 20));
                                                                                                try {
                                                                                                    var5_3 -= 4;
                                                                                                    if ((8598895291058559347L ^ (long)var3_4 | 1L) == 0L) {
                                                                                                        throw new NoSuchElementException();
                                                                                                    }
                                                                                                    var4_5 = (922043834 * 1048517139 + 1319864695 ^ var3_4) + 1187876027 - 1187876027;
                                                                                                }
                                                                                                catch (NoSuchElementException v7) {
                                                                                                    var4_5 = (922043834 * 1048517139 + 1319864695 ^ var3_4) + 1871564221 - 1871564221;
                                                                                                }
                                                                                                var5_3 -= 5;
                                                                                                continue;
                                                                                            }
                                                                                            (Integer.rotateLeft(-1452509540 ^ var3_4, 8) - -2004878305) * -1452509539;
                                                                                            var2_2 = Float.intBitsToFloat(Integer.reverse(447722113) ^ -1105957694);
                                                                                            var4_5 = -320280067 * 1048517139 + 1319864695 ^ var3_4;
                                                                                            (Integer.rotateRight(232688115 ^ var3_4, 4) + -1303358552) * 232688115;
                                                                                            var4_5 = 922043834 * 1048517139 + 1319864695 ^ var3_4 ^ -169069933 ^ -169069933;
                                                                                            var5_3 += 3;
                                                                                            continue;
                                                                                        }
                                                                                        (Integer.rotateRight(2029207806 ^ var3_4, 18) - -1445822979) * 2029207807;
                                                                                        if (var1_1 <= Float.intBitsToFloat(byk.hqf(-1692632700 ^ 1528592513, 22))) {
                                                                                            var4_5 = -1021423930 * 1048517139 + 1319864695 ^ var3_4 ^ 1088357460 ^ 1088357460;
                                                                                            continue;
                                                                                        }
                                                                                        var4_5 = (579183779 * 1048517139 + 1319864695 ^ var3_4) + 265278332 - 265278332;
                                                                                        (Integer.rotateLeft(-1111524400 ^ var3_4, 10) + -24273557) * -1111524399;
                                                                                        var4_5 = 711425586 * 1048517139 + 1319864695 ^ var3_4 ^ 572995565 ^ 572995565;
                                                                                        var5_3 -= 3;
                                                                                        continue;
                                                                                    }
                                                                                    Integer.rotateRight(-1116929845 ^ var3_4, 10) + -191842352;
                                                                                    var2_2 = byk.khshth(-1963316227 + -1270492157);
                                                                                    var4_5 = 922043834 * 1048517139 + 1319864695 ^ var3_4;
                                                                                    (Integer.rotateLeft(1028324669 ^ var3_4, 10) - 1886538142) * 1028324669;
                                                                                    (int)(-2160539680314545L ^ (long)var3_4 ^ 6588910403302478369L);
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateLeft(1763399736 ^ var3_4, 16) + -1095938557) * 1763399737;
                                                                                var4_5 = Integer.reverse(Integer.reverse(-301369990 * 1048517139 + 1319864695 ^ var3_4));
                                                                                continue;
                                                                            }
                                                                            Integer.rotateRight(-2078163026 ^ var3_4, 3) - 74700109;
                                                                            var4_5 = (1873035668 * 1048517139 + 1319864695 ^ var3_4) + -1738400734 - -1738400734;
                                                                            (Integer.rotateLeft(1208621016 ^ var3_4, 12) + -1114209693) * 1208621017;
                                                                            try {
                                                                                var5_3 -= 3;
                                                                                if ((4148814597735789901L ^ (long)var3_4 | 1L) == 0L) {
                                                                                    throw new IllegalStateException();
                                                                                }
                                                                                var4_5 = Integer.reverse(Integer.reverse(-301369990 * 1048517139 + 1319864695 ^ var3_4));
                                                                            }
                                                                            catch (IllegalStateException v8) {
                                                                                var4_5 = -301369990 * 1048517139 + 1319864695 ^ var3_4 ^ -2130660161 ^ -2130660161;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateLeft(1121316276 ^ var3_4, 11) - 474310663) * 1121316277;
                                                                        var4_5 = 2116126727 * 1048517139 + 1319864695 ^ var3_4;
                                                                        (Integer.rotateLeft(-636704711 ^ var3_4, 14) + 1810234914) * -636704711;
                                                                        (int)(1782869117403196239L ^ (long)var3_4 ^ -1046942764904112979L);
                                                                        try {
                                                                            var5_3 += 2;
                                                                            if ((-2164628931576531547L ^ (long)var3_4 | 1L) == 0L) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            var4_5 = Integer.reverse(Integer.reverse(-301369990 * 1048517139 + 1319864695 ^ var3_4));
                                                                        }
                                                                        catch (IllegalStateException v9) {
                                                                            var4_5 = (-301369990 * 1048517139 + 1319864695 ^ var3_4) + -1423571485 - -1423571485;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    Integer.rotateRight(-1615783029 ^ var3_4, 6) + 1523578128;
                                                                    var4_5 = 53996767 * 1048517139 + 1319864695 ^ var3_4 ^ 1893854067 ^ 1893854067;
                                                                    (Integer.rotateLeft(-2013783696 ^ var3_4, 3) + 2070459339) * -2013783695;
                                                                    try {
                                                                        var5_3 += 3;
                                                                        if ((1920944809094745761L ^ (long)var3_4 | 1L) == 0L) {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                        var4_5 = -301369990 * 1048517139 + 1319864695 ^ var3_4 ^ 923561985 ^ 923561985;
                                                                    }
                                                                    catch (IllegalArgumentException v10) {
                                                                        var4_5 = -301369990 * 1048517139 + 1319864695 ^ var3_4 ^ 1648629914 ^ 1648629914;
                                                                    }
                                                                    var5_3 += 4;
                                                                    continue;
                                                                }
                                                                Integer.rotateLeft(-67608096 ^ var3_4, 18) + -2022606501;
                                                                var4_5 = (int)((long)(-301369990 * 1048517139 + 1319864695 ^ var3_4) ^ -7283199649334482006L ^ -7283199649334482006L);
                                                                Integer.rotateLeft(-1858239324 ^ var3_4, 5) - -1697599721;
                                                                --var5_3;
                                                                continue;
                                                            }
                                                            Integer.rotateRight(-1105009074 ^ var3_4, 10) - 177701549;
                                                            var4_5 = (1550784475 * 1048517139 + 1319864695 ^ var3_4) + 1553388944 - 1553388944;
                                                            Integer.rotateLeft(49644201 ^ var3_4, 3) + 1612214706;
                                                            (int)(-4591652280245884081L ^ (long)var3_4 ^ -6604384705079399073L);
                                                            (int)(-4352326795394836306L ^ (long)var3_4 ^ 2800500735462746851L);
                                                            var4_5 = (int)((long)(-301369990 * 1048517139 + 1319864695 ^ var3_4) ^ -1082494908963388484L ^ -1082494908963388484L);
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(-353416976 ^ var3_4, 16) + 2002220107) * -353416975;
                                                        try {
                                                            var4_5 = Integer.reverse(Integer.reverse(-301369990 * 1048517139 + 1319864695 ^ var3_4));
                                                        }
                                                        catch (NoSuchElementException v11) {
                                                            var4_5 = -301369990 * 1048517139 + 1319864695 ^ var3_4 ^ -224045001 ^ -224045001;
                                                        }
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(959831589 ^ var3_4, 10) - -236747338;
                                                    (int)(-322165599283909809L ^ (long)var3_4 ^ 2107828774068837087L);
                                                    var4_5 = Integer.reverse(Integer.reverse(-301369990 * 1048517139 + 1319864695 ^ var3_4));
                                                    var5_3 -= 5;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(-322179792 ^ var3_4, 16) + -1324394485) * -322179791;
                                                var4_5 = (int)((long)(658234813 * 1048517139 + 1319864695 ^ var3_4) ^ -4505742111621101029L ^ -4505742111621101029L);
                                                Integer.rotateLeft(1514087876 ^ var3_4, 14) - -234671625;
                                                try {
                                                    var5_3 += 2;
                                                    if ((-4389554340854191673L ^ (long)var3_4 | 1L) == 0L) {
                                                        throw new UnsupportedOperationException();
                                                    }
                                                    var4_5 = -301369990 * 1048517139 + 1319864695 ^ var3_4;
                                                }
                                                catch (UnsupportedOperationException v12) {
                                                    var4_5 = -301369990 * 1048517139 + 1319864695 ^ var3_4;
                                                }
                                                var5_3 += 2;
                                                continue;
                                            }
                                            Integer.rotateLeft(1752297068 ^ var3_4, 16) - -1440121265;
                                            var4_5 = 224214814 * 1048517139 + 1319864695 ^ var3_4;
                                            Integer.rotateRight(1923305835 ^ var3_4, 17) + -433816784;
                                            try {
                                                var5_3 -= 5;
                                                var4_5 = (int)((long)(-301369990 * 1048517139 + 1319864695 ^ var3_4) ^ 1856634483971970034L ^ 1856634483971970034L);
                                            }
                                            catch (IllegalArgumentException v13) {
                                                var4_5 = (int)((long)(-301369990 * 1048517139 + 1319864695 ^ var3_4) ^ 5413636430809338979L ^ 5413636430809338979L);
                                            }
                                            var5_3 += 4;
                                            continue;
                                        }
                                        Integer.rotateLeft(533403872 ^ var3_4, 6) + -571104677;
                                        var4_5 = 1536371963 * 1048517139 + 1319864695 ^ var3_4;
                                        (Integer.rotateLeft(643941565 ^ var3_4, 7) - -1439403490) * 643941565;
                                        (int)(-1958104314319410353L ^ (long)var3_4 ^ 2913973107368158327L);
                                        try {
                                            var5_3 -= 4;
                                            if ((3238524645201917979L ^ (long)var3_4 | 1L) == 0L) {
                                                throw new NoSuchElementException();
                                            }
                                            var4_5 = -301369990 * 1048517139 + 1319864695 ^ var3_4;
                                        }
                                        catch (NoSuchElementException v14) {
                                            var4_5 = (int)((long)(-301369990 * 1048517139 + 1319864695 ^ var3_4) ^ -2510642999766643368L ^ -2510642999766643368L);
                                        }
                                        var5_3 -= 3;
                                        continue;
                                    }
                                    (Integer.rotateRight(1178766807 ^ var3_4, 11) - -2039690172) * 1178766807;
                                    var4_5 = (int)((long)(234073443 * 1048517139 + 1319864695 ^ var3_4) ^ 7124104972012745132L ^ 7124104972012745132L);
                                    (Integer.rotateRight(-1061798566 ^ var3_4, 11) + 1517227297) * -1061798565;
                                    var4_5 = (-1752214516 * 1048517139 + 1319864695 ^ var3_4) + -1926510761 - -1926510761;
                                    Integer.rotateRight(592412903 ^ var3_4, 7) - 1258175284;
                                    var4_5 = (-301369990 * 1048517139 + 1319864695 ^ var3_4) + 1596034019 - 1596034019;
                                    ++var5_3;
                                    continue;
                                }
                                Integer.rotateRight(1926341410 ^ var3_4, 17) + -339713959;
                                (int)(5056755998210945225L ^ (long)var3_4 ^ -7718194687324642933L);
                                var4_5 = (int)((long)(-301369990 * 1048517139 + 1319864695 ^ var3_4) ^ 7468946702704341233L ^ 7468946702704341233L);
                                var5_3 -= 3;
                                continue;
                            }
                            Integer.rotateLeft(-1492961215 ^ var3_4, 7) + 1036087066;
                            (int)(7327803528696884047L ^ (long)var3_4 ^ -3348282174490450254L);
                            try {
                                var5_3 -= 4;
                                if ((3749727391272140421L ^ (long)var3_4 | 1L) == 0L) {
                                    throw new NoSuchElementException();
                                }
                                var4_5 = -301369990 * 1048517139 + 1319864695 ^ var3_4 ^ 942157333 ^ 942157333;
                            }
                            catch (NoSuchElementException v15) {
                                var4_5 = -301369990 * 1048517139 + 1319864695 ^ var3_4;
                            }
                            var5_3 -= 4;
                            continue;
                        }
                        (Integer.rotateRight(711454227 ^ var3_4, 8) + 653489032) * 711454227;
                        try {
                            ++var5_3;
                            if ((6194730180484438175L ^ (long)var3_4 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            var4_5 = (int)((long)(-301369990 * 1048517139 + 1319864695 ^ var3_4) ^ -2988034978949221052L ^ -2988034978949221052L);
                        }
                        catch (UnsupportedOperationException v16) {
                            var4_5 = -301369990 * 1048517139 + 1319864695 ^ var3_4 ^ 1492659302 ^ 1492659302;
                        }
                        var5_3 += 2;
                        continue;
                    }
                    (Integer.rotateLeft(1760418492 ^ var3_4, 16) - -1188357121) * 1760418493;
                    var4_5 = (-1727547213 * 1048517139 + 1319864695 ^ var3_4) + -1511768711 - -1511768711;
                    Integer.rotateRight(-304239089 ^ var3_4, 16) - -768232692;
                    var4_5 = Integer.reverse(Integer.reverse(-301369990 * 1048517139 + 1319864695 ^ var3_4));
                    var5_3 += 3;
                    continue;
                }
                (Integer.rotateLeft(1734451965 ^ var3_4, 15) - -1993319458) * 1734451965;
                (int)(-6497835817923974321L ^ (long)var3_4 ^ -1949914490191944073L);
                var4_5 = (int)((long)(-301369990 * 1048517139 + 1319864695 ^ var3_4) ^ -3874381335723534322L ^ -3874381335723534322L);
                Integer.rotateRight(-1999798518 ^ var3_4, 4) + -1790967439;
                continue;
            }
            return var2_2;
lbl569:
            // 18 sources

            Integer.rotateRight(-642356254 ^ var3_4, 14) + 1635037081;
            var4_5 = Integer.reverse(Integer.reverse(-301369990 * 1048517139 + 1319864695 ^ var3_4));
        }
    }

    private boolean dsz_5() {
        int n = 954611570;
        int n2 = (n = Integer.rotateLeft(n * -1140389765, 17) ^ 0x74110BE6) ^ 0xF90226D8;
        if ((n2 ^ n) != -117299496) {
            int cfr_ignored_0 = (0xC1E411AA ^ n) + -838033407;
        }
        return !this.khhs.shghkh();
    }

    private static String sqh_4(String string, int n, int n2, int n3) {
        int n4 = -619249133;
        n4 = Integer.rotateLeft(n4 * 35054015, 13) ^ 0xA923BE67;
        int n5 = (n4 = n ^ n4) ^ 0x6E96B6A6;
        if ((n5 ^ n4) != 1855370918) {
            int cfr_ignored_0 = (0xB581B4B5 ^ n4) + 1342309853;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x67B6E125) + i ^ khths_2, 17) ^ n2 + dhms_2));
        }
        return new String(cArray);
    }

    private static float tqs_4(class_1309 class_13092) {
        block0: {
            int n = wm.daq(-608836706);
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0xA2EE54EF;
            if ((n2 ^ n) == -1561438993) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x795BB771 ^ n, 18) + -1233594902) * 2036053873;
            int cfr_ignored_1 = (int)(0xBBE9194C27D4EB4FL ^ (long)n ^ 0xCFE8831A2DB8DA03L);
        }
        return class_13092.method_36455();
    }

    private static class_241 thkt(byk byk2, float f, float f2) {
        block0: {
            int n = -1571972815;
            n = Integer.rotateLeft(n * 713157059, 16) ^ 0x99FC61D2;
            byk byk3 = byk2;
            n = Integer.rotateRight((byk3 != null ? System.identityHashCode(byk3) : 0) ^ n, 19);
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x236BCBA0;
            if ((n2 ^ n) == 594267040) break block0;
            int cfr_ignored_0 = (0x81265291 ^ n) - 1624129820;
        }
        return byk2.hbt_2(f, f2);
    }

    private static boolean shzd_4(khd khd2, fy fy2) {
        block0: {
            int n = wm.daq(1486397709);
            khd khd3 = khd2;
            n = Integer.rotateLeft((khd3 != null ? System.identityHashCode(khd3) : 0) ^ n, 27);
            fy fy3 = fy2;
            n = Integer.rotateRight((fy3 != null ? System.identityHashCode(fy3) : 0) ^ n, 16);
            int n2 = n ^ 0x66E2E6D1;
            if ((n2 ^ n) == 1726146257) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x3E7A47DC ^ n, 10) - -1792257313) * 1048201181;
        }
        return khd2.skhth(fy2);
    }

    private static float thlt_2(float f, float f2) {
        block0: {
            int n = -1647798926;
            n = Integer.rotateLeft(n * -2146039817, 4) ^ 0xB2085585;
            n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 5);
            int n2 = n ^ 0x556D4FF;
            if ((n2 ^ n) == 89576703) break block0;
            int cfr_ignored_0 = (0x989E418D ^ n) - -1322423812;
        }
        return byk.sat_5(f, f2);
    }

    private static float tdhz(class_1309 class_13092) {
        block0: {
            int n = 1788635139;
            n = Integer.rotateLeft(n * 1384428163, 20) ^ 0xC24AEE77;
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0xA57D4EF;
            if ((n2 ^ n) == 173528303) break block0;
            int cfr_ignored_0 = (0x60CBBCEC ^ n) + 1388600688;
        }
        return class_13092.method_36454();
    }

    private static float hdgh(int n) {
        block0: {
            int n2 = -1847142613;
            int n3 = (n2 = Integer.rotateLeft(n2 * 682086729, 6) ^ 0xB3B1A48A) ^ 0xEC72CF0E;
            if ((n3 ^ n2) == -328020210) break block0;
            int cfr_ignored_0 = (0x7D941825 ^ n2) - 1540459040;
        }
        return Float.intBitsToFloat(n);
    }

    private static class_241 dhz_5(float f, float f2, float f3) {
        block0: {
            int n = 390672641;
            n = Integer.rotateLeft(n * -2002546809, 3) ^ 0xB18D59E0;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 13);
            n = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n, 16);
            int n2 = n ^ 0xFE43DB31;
            if ((n2 ^ n) == -29107407) break block0;
            int cfr_ignored_0 = (0xE90AEA30 ^ n) + 1964485537;
        }
        return byk.ghsz_2(f, f2, f3);
    }

    private static float swgh(class_1309 class_13092) {
        block0: {
            int n = -2050410824;
            int n2 = (n = Integer.rotateLeft(n * 682627495, 28) ^ 0xA8CACCEB) ^ 0xFDE8BE2A;
            if ((n2 ^ n) == -35078614) break block0;
            int cfr_ignored_0 = (0x78218892 ^ n) + 466608232;
        }
        return class_13092.method_36454();
    }

    private static class_241 dthr(float f, float f2, float f3) {
        block0: {
            int n = -1660725332;
            n = Integer.rotateLeft(n * 1996713555, 20) ^ 0x5580B95E;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xCFD23043;
            if ((n2 ^ n) == -808308669) break block0;
            int cfr_ignored_0 = (0x52D167EF ^ n) + 1509356421;
        }
        return byk.ghsz_2(f, f2, f3);
    }

    private static float jzr(int n) {
        block0: {
            int n2 = 647722493;
            n2 = Integer.rotateLeft(n2 * -686858075, 6) ^ 0x9446CBB5;
            int n3 = (n2 = n ^ n2) ^ 0x97C09D6F;
            if ((n3 ^ n2) == -1748984465) break block0;
            int cfr_ignored_0 = (0xB15BE892 ^ n2) + 1157619919;
        }
        return Float.intBitsToFloat(n);
    }

    private static float dnz_3(tay tay2) {
        block0: {
            int n = 2084087363;
            int n2 = (n = Integer.rotateLeft(n * 1355353427, 28) ^ 0xB563EB54) ^ 0xD2894114;
            if ((n2 ^ n) == -762756844) break block0;
            int cfr_ignored_0 = (0xAEB1E757 ^ n) + -263406801;
        }
        return tay2.thw_5();
    }

    private static float zdy_2(tay tay2) {
        block0: {
            int n = 225544984;
            int n2 = (n = Integer.rotateLeft(n * -358685821, 13) ^ 0xA829523A) ^ 0x5B498BC6;
            if ((n2 ^ n) == 1531546566) break block0;
            int cfr_ignored_0 = (0x563800DE ^ n) - 1488746342;
        }
        return tay2.thw_5();
    }

    private static float shkh_3(float f) {
        block0: {
            int n = wm.daq(-591020416);
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 12);
            int n2 = n ^ 0xB76FA356;
            if ((n2 ^ n) == -1217420458) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x6BAA1DD6 ^ n, 16) - 234306597) * 1806310871;
        }
        return byk.ayf(f);
    }

    private static float ahr(int n) {
        block0: {
            int n2 = -1903979081;
            n2 = Integer.rotateLeft(n2 * 690874695, 15) ^ 0xC7F14AFF;
            int n3 = (n2 = n ^ n2) ^ 0xD4EFE24D;
            if ((n3 ^ n2) == -722476467) break block0;
            int cfr_ignored_0 = (0x5A6C77FA ^ n2) - 1144753949;
        }
        return Float.intBitsToFloat(n);
    }

    private static float drz(float f) {
        block0: {
            int n = -1178568563;
            int n2 = (n = Integer.rotateLeft(n * 1912671843, 22) ^ 0xF7E227B) ^ 0x26EE9E72;
            if ((n2 ^ n) == 653172338) break block0;
            int cfr_ignored_0 = (0x9F2EE6FF ^ n) + -1502573388;
        }
        return byk.akh_2(f);
    }

    private static boolean thshh() {
        block0: {
            int n = wm.daq(783046339);
            int n2 = n ^ 0x21428972;
            if ((n2 ^ n) == 558008690) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xFEEDFB1 ^ n, 4) + -229984854) * 267313073;
            int cfr_ignored_1 = (int)(0xCD5C718C27D4EB4FL ^ (long)n ^ 0x1E68831A2DB83769L);
        }
        return yf.khdha_2();
    }

    private static void khah_2() {
        int n = 1743231039;
        int n2 = (n = Integer.rotateLeft(n * -1799221121, 10) ^ 0xE6C00E80) ^ 0xC7BB1182;
        if ((n2 ^ n) != -944041598) {
            int cfr_ignored_0 = (0xA05C89BD ^ n) - 355374754;
        }
        yf.athz_2();
    }

    private static float khwt(float f, float f2) {
        block0: {
            int n = 4706335;
            n = Integer.rotateLeft(n * -947020853, 18) ^ 0x83667348;
            n = Float.floatToIntBits(f) ^ n;
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0xB5613552;
            if ((n2 ^ n) == -1251920558) break block0;
            int cfr_ignored_0 = (0xB526E54D ^ n) + 304478405;
        }
        return Math.min(f, f2);
    }

    private static float stth_2(int n) {
        block0: {
            int n2 = 1957097242;
            n2 = Integer.rotateLeft(n2 * 1154780067, 22) ^ 0xD0EF4DDD;
            int n3 = (n2 = n ^ n2) ^ 0x16EE553;
            if ((n3 ^ n2) == 24044883) break block0;
            int cfr_ignored_0 = (0x75C80A49 ^ n2) + -1724597957;
        }
        return Float.intBitsToFloat(n);
    }

    private static float tmy(float f, float f2) {
        block0: {
            int n = -397051934;
            n = Integer.rotateLeft(n * -1381536075, 26) ^ 0x196E9105;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xAEBCA87D;
            if ((n2 ^ n) == -1363367811) break block0;
            int cfr_ignored_0 = (0x46E9DF9F ^ n) + -344369789;
        }
        return Math.max(f, f2);
    }

    private static float azkh(float f) {
        block0: {
            int n = wm.daq(1622572980);
            int n2 = n ^ 0x7E9C1350;
            if ((n2 ^ n) == 2124157776) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x1E2A6CE4 ^ n, 6) - -1417621801;
        }
        return byk.zakh(f);
    }

    private static float zmj_2(int n) {
        block0: {
            int n2 = 1833829514;
            int n3 = (n2 = Integer.rotateLeft(n2 * 482729953, 13) ^ 0x3B350A80) ^ 0x7E6DC546;
            if ((n3 ^ n2) == 2121123142) break block0;
            int cfr_ignored_0 = (0x1323C1CC ^ n2) + 856583356;
        }
        return Float.intBitsToFloat(n);
    }

    private static float thsa(int n) {
        block0: {
            int n2 = wm.daq(157694859);
            int n3 = (n2 = n ^ n2) ^ 0x7F716DEA;
            if ((n3 ^ n2) == 2138140138) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x76175661 ^ n2, 17) + 1362171130;
            int cfr_ignored_1 = (int)(0xB4A5F85C27D4EB4FL ^ (long)n2 ^ 0xDC8831A2DB8C49AL);
        }
        return Float.intBitsToFloat(n);
    }

    private static float tm(float f) {
        block0: {
            int n = 331460928;
            int n2 = (n = Integer.rotateLeft(n * -687021987, 20) ^ 0x6B16BA54) ^ 0x69493903;
            if ((n2 ^ n) == 1766406403) break block0;
            int cfr_ignored_0 = (0x7A888843 ^ n) + -653648120;
        }
        return Math.abs(f);
    }

    private static int hqf(int n, int n2) {
        block0: {
            int n3 = wm.daq(426534726);
            n3 = Integer.rotateLeft(n ^ n3, 18);
            int n4 = (n3 = n2 ^ n3) ^ 0x9D18DD01;
            if ((n4 ^ n3) == -1659314943) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x8474BA47 ^ n3, 3) - 243281364;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float khshth(int n) {
        block0: {
            int n2 = wm.daq(-341836164);
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 18)) ^ 0x358CE6E2;
            if ((n3 ^ n2) == 898426594) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xDE13189E ^ n2, 14) - -391275939) * -569173857;
        }
        return Float.intBitsToFloat(n);
    }

    private static float khhdh(int n) {
        block0: {
            int n2 = 1268097270;
            n2 = Integer.rotateLeft(n2 * -1318766775, 10) ^ 0x941F5445;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 21)) ^ 0x1B5E094;
            if ((n3 ^ n2) == 28696724) break block0;
            int cfr_ignored_0 = (0x4A204062 ^ n2) + -708561286;
        }
        return Float.intBitsToFloat(n);
    }

    private static String[] bfd(String string) {
        int n = -1710743344;
        n = Integer.rotateLeft(n * -1447399217, 23) ^ 0xDE24DBCF;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xDF60FD2D;
        if ((n2 ^ n) != -547291859) {
            int cfr_ignored_0 = (0x4568DDFD ^ n) + -2095002546;
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

    private static CallSite zsj_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1570470705;
            n3 = Integer.rotateLeft(n3 * 185079499, 26) ^ 0x30CF4AB6;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 14);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 11);
            int n4 = n3 ^ 0x5D35C0CA;
            if ((n4 ^ n3) != 1563803850) {
                int cfr_ignored_0 = (0xAEBBFB ^ n3) + -452628459;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dhya ^ string.hashCode()) + (n2 + tqf) + i ^ dhya, 3) + tqf);
            }
            String[] stringArray = byk.bfd(new String(cArray));
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

    private static String[] vb8zyo6x(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite fb3er66zvqhz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ etmu3gm5e ^ string.hashCode()) + (n2 + rhrxrrom29o) + i ^ etmu3gm5e, 21) + rhrxrrom29o);
            }
            String[] stringArray = byk.vb8zyo6x(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

