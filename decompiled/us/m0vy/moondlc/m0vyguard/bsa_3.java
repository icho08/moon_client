/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bly;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;

@tq_2(name="Aspect Ratio", category=bzw.OTHER, desc="Allows changing screen aspect ratio")
public class bsa_3
extends bnq {
    private static bsa_3 tal;
    public final khd khdn_2;
    public final khd dham;
    private final fy thkht_2;
    private final fy bla;
    private final fy zdl;
    private final fy dat_4;
    private final fy gha_2;
    public final tay rrz_2;
    private static final int hthdh = 2074016275;
    private static final int twf = -803750217;
    private static final int rst_2 = -1989834500;
    private static final int ssd_4 = -1827099998;
    private static final int zu2ithu = 40019465;
    private static final int o18a22v = -887165618;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int gab5mxl95ab;

    public static bsa_3 zmd_2() {
        block0: {
            int n = -1891314298;
            int n2 = (n = Integer.rotateLeft(n * 435854747, 12) ^ 0xAEDC81F0) ^ 0xA6791498;
            if ((n2 ^ n) == -1502014312) break block0;
            int cfr_ignored_0 = (0x293DC11E ^ n) - -1357765554;
        }
        return tal;
    }

    public bsa_3() {
        this.dham = this.khdn_2 = new khd(this, "Mode");
        this.thkht_2 = new fy(this.khdn_2, "16:9");
        this.bla = new fy(this.khdn_2, "4:3");
        this.zdl = new fy(this.khdn_2, "1:1");
        this.dat_4 = new fy(this.khdn_2, "16:10");
        this.gha_2 = new fy(this.khdn_2, "Custom");
        this.rrz_2 = new tay((hy)this, "AspectRatio", this::zghh_3).shth_7(Float.intBitsToFloat(-2050682038 + -1207453309)).dhbs_2(Float.intBitsToFloat(0xBC8FD344 ^ 0xFC2FD344)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x419B5107 ^ 0x8D488DCB, 12))).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xC3F9BDC8 ^ 0xF867104, 7)));
        tal = this;
    }

    public float zba_3() {
        float f = 0.0f;
        int n = 0;
        int n2 = -2135044073;
        n2 = Integer.rotateLeft(n2 * -978411473, 6) ^ 0xFD7447BB;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 26);
        int n3 = Integer.rotateLeft(n2 ^ 0xD7D044AF, 7) + -1501268811 - -1501268811;
        block55: while (true) {
            switch (Integer.rotateRight(n3, 7) ^ n2) {
                case -29856789: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0xC7FCEA15 ^ n2, 11) - 1006499782) * -939726315;
                    int cfr_ignored_1 = (int)(0x54E442827D4EB4FL ^ (long)n2 ^ 0x7520831A2DB9A74DL);
                    f = Float.intBitsToFloat(Integer.rotateLeft(0x71ECBA61 ^ 0x24736F34, 9));
                    try {
                        n += 2;
                        if ((0x21D3767844E8E735L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xA0B213B1, 7) ^ 0xCD8D976197504DL ^ 0xCD8D976197504DL);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.rotateLeft(n2 ^ 0xA0B213B1, 7);
                    }
                    continue block55;
                }
                case -674216785: {
                    int cfr_ignored_2 = Integer.rotateRight(0x3558832A ^ n2, 9) + 2048229713;
                    if (!this.rgha_2()) {
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x66DDEF16, 7) ^ 0x99561EEE29CADA45L ^ 0x99561EEE29CADA45L);
                        int cfr_ignored_3 = Integer.rotateLeft(0xC00C878D ^ n2, 11) - 1172441422;
                        int cfr_ignored_4 = (int)(0x2BE29B027D4EB4FL ^ (long)n2 ^ 0xAE10831A2DB9A8ADL);
                        n3 = Integer.rotateLeft(n2 ^ 0xD3BA1AC9, 7) ^ 0x6AD5950F ^ 0x6AD5950F;
                        ++n;
                        continue block55;
                    }
                    try {
                        n += 3;
                        if ((0xC5046F684D9C852FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x28F23DFF, 7) ^ 0xBB88040F ^ 0xBB88040F;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x28F23DFF, 7)));
                    }
                    --n;
                    continue block55;
                }
                case -424006584: {
                    int cfr_ignored_5 = Integer.rotateRight(0xB6C590CE ^ n2, 9) - 642394157;
                    f = this.rrz_2.thw_5();
                    int cfr_ignored_6 = (int)(0x63B72761691F2FA4L ^ (long)n2 ^ 0xB3B21E8DA46F6ABFL);
                    n3 = Integer.rotateLeft(n2 ^ 0xA0B213B1, 7) + -952266723 - -952266723;
                    continue block55;
                }
                case 1595161284: {
                    int cfr_ignored_7 = Integer.rotateLeft(0xBE802B85 ^ n2, 10) - 367191126;
                    int cfr_ignored_8 = (int)(0x7C3285B827D4EB4FL ^ (long)n2 ^ 0xF600831A2DB955B4L);
                    if (this.bla.shghkh()) {
                        try {
                            n -= 2;
                            if ((0x92C75FF7D5BFF411L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xFE386BEB, 7) ^ 0xF5737019486D3905L ^ 0xF5737019486D3905L);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xFE386BEB, 7) ^ 0x49C55095BD309ABFL ^ 0x49C55095BD309ABFL);
                        }
                        n += 5;
                        continue block55;
                    }
                    try {
                        n -= 4;
                        if ((0xA22A22713213F12FL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x6C1EFC9, 7) ^ 0x1122A62D62C7A051L ^ 0x1122A62D62C7A051L);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x6C1EFC9, 7)));
                    }
                    n += 5;
                    continue block55;
                }
                case 949823360: {
                    int cfr_ignored_9 = Integer.rotateRight(0x59FA6F26 ^ n2, 14) - -374270763;
                    f = bsa_3.jhb_2(-1273631017 + -1950949898);
                    try {
                        n -= 3;
                        if ((0x5E92E32AAABFF783L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xA0B213B1, 7)));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.rotateLeft(n2 ^ 0xA0B213B1, 7) ^ 0x9FE48A75 ^ 0x9FE48A75;
                    }
                    n += 2;
                    continue block55;
                }
                case -1199124214: {
                    int cfr_ignored_10 = (Integer.rotateRight(0x88050BFA ^ n2, 4) + 2096763521) * -2012935173;
                    f = (float)mc.method_22683().method_4489() / (float)mc.method_22683().method_4506();
                    try {
                        --n;
                        if ((0xDD70B39E22D6983L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0xA0B213B1, 7) ^ 0xA3336132 ^ 0xA3336132;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.rotateLeft(n2 ^ 0xA0B213B1, 7) + -1714379206 - -1714379206;
                    }
                    n -= 2;
                    continue block55;
                }
                case -742778167: {
                    int cfr_ignored_11 = Integer.rotateRight(0x2B2B3A2A ^ n2, 8) + 1050258001;
                    f = (float)mc.method_22683().method_4489() / (float)mc.method_22683().method_4506();
                    try {
                        n += 5;
                        if ((0x7A9E838AD7EA0281L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xA0B213B1, 7)));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.rotateLeft(n2 ^ 0xA0B213B1, 7);
                    }
                    n += 2;
                    continue block55;
                }
                case 113373129: {
                    int cfr_ignored_12 = Integer.rotateLeft(0x1C3AE0A1 ^ n2, 6) + 1870582458;
                    int cfr_ignored_13 = (int)(0xDE884E9C27D4EB4FL ^ (long)n2 ^ 0x6048831A2DB810C1L);
                    if (this.zdl.shghkh()) {
                        n3 = Integer.rotateLeft(n2 ^ 0xB1DFFC3B, 7) + -697019289 - -697019289;
                        int cfr_ignored_14 = (Integer.rotateLeft(0x5B774051 ^ n2, 14) + 399403274) * 1534541905;
                        int cfr_ignored_15 = (int)(0x99C5EE6C27D4EB4FL ^ (long)n2 ^ 0x21A8831A2DB89E5AL);
                        n3 = Integer.rotateLeft(n2 ^ 0x2DB1AC7B, 7);
                        n -= 5;
                        continue block55;
                    }
                    int cfr_ignored_16 = (int)(0x2BFC820840E918F1L ^ (long)n2 ^ 0xF9604D61CAC5FA28L);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x1DF69320, 7) ^ 0xA9D937AAC8FEE102L ^ 0xA9D937AAC8FEE102L);
                    int cfr_ignored_17 = (int)(0x47D3441095CC554DL ^ (long)n2 ^ 0x7551E72B51BD2277L);
                    n3 = Integer.rotateLeft(n2 ^ 0x24F591F2, 7);
                    continue block55;
                }
                case -682818696: {
                    int cfr_ignored_18 = Integer.rotateLeft(0x6F5DADA8 ^ n2, 16) + -2135578989;
                    f = Float.intBitsToFloat(1381737560 + -309859871);
                    try {
                        n += 2;
                        if ((0x846F2CDC39991587L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0xA0B213B1, 7) ^ 0x42190A0D ^ 0x42190A0D;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.rotateLeft(n2 ^ 0xA0B213B1, 7);
                    }
                    n += 3;
                    continue block55;
                }
                case 620073458: {
                    int cfr_ignored_19 = (Integer.rotateRight(0xD59BACD3 ^ n2, 13) + -499675960) * -711217965;
                    if (bsa_3.bqm(this.dat_4)) {
                        try {
                            n -= 3;
                            if ((0xF1849CC451E9AD27L ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = Integer.rotateLeft(n2 ^ 0x389D2780, 7) ^ 0x86FDF094 ^ 0x86FDF094;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = Integer.rotateLeft(n2 ^ 0x389D2780, 7);
                        }
                        n += 3;
                        continue block55;
                    }
                    n3 = Integer.rotateLeft(n2 ^ 0x3249DFA, 7) + 26447272 - 26447272;
                    int cfr_ignored_20 = (Integer.rotateLeft(0x4EB1B6B5 ^ n2, 12) - -1948074202) * 1320269493;
                    int cfr_ignored_21 = (int)(0x8C03188827D4EB4FL ^ (long)n2 ^ 0xCC60831A2DB8B5D7L);
                    n3 = Integer.rotateLeft(n2 ^ 0xD74D0378, 7) + -1386767084 - -1386767084;
                    n -= 5;
                    continue block55;
                }
                case 686964223: {
                    int cfr_ignored_22 = (Integer.rotateLeft(0x9EF24FD5 ^ n2, 6) - 1135954438) * -1628287019;
                    int cfr_ignored_23 = (int)(0x5C40E1E827D4EB4FL ^ (long)n2 ^ 0x3EA0831A2DB91550L);
                    if (!this.gha_2.shghkh()) {
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x5F143AC4, 7)));
                        continue block55;
                    }
                    n3 = Integer.rotateLeft(n2 ^ 0x696ED1A9, 7) ^ 0x83A3626F ^ 0x83A3626F;
                    int cfr_ignored_24 = (Integer.rotateLeft(0xE15749B0 ^ n2, 15) + 1307544459) * -514373199;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xE6BA2C48, 7) ^ 0x9ECA3485C9FAA6C2L ^ 0x9ECA3485C9FAA6C2L);
                    ++n;
                    continue block55;
                }
                case 766618747: {
                    int cfr_ignored_25 = Integer.rotateRight(0x15FEFD0B ^ n2, 5) + -1371651184;
                    f = 1.0f;
                    n3 = Integer.rotateLeft(n2 ^ 0xA0B213B1, 7);
                    --n;
                    continue block55;
                }
                case 261392205: {
                    int cfr_ignored_26 = (Integer.rotateLeft(0x9816EEB4 ^ n2, 6) - 1864664839) * -1743327563;
                    try {
                        n += 3;
                        if ((0xA3DFD1BA6D33E1A5L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0xD7D044AF, 7) ^ 0x592CE16E ^ 0x592CE16E;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.rotateLeft(n2 ^ 0xD7D044AF, 7);
                    }
                    n -= 5;
                    continue block55;
                }
                case 670635539: {
                    int cfr_ignored_27 = Integer.rotateLeft(0x8F08350C ^ n2, 4) - 1448872879;
                    n3 = Integer.rotateLeft(n2 ^ 0xE61ABDB, 7) + -1727009922 - -1727009922;
                    int cfr_ignored_28 = Integer.rotateRight(0xFD498AA6 ^ n2, 18) - -1337628331;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x8599B84D, 7)));
                    int cfr_ignored_29 = (Integer.rotateRight(0x2433CE92 ^ n2, 7) + 1722000105) * 607374995;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xD7D044AF, 7) ^ 0x154A29A6D79DFDFBL ^ 0x154A29A6D79DFDFBL);
                    continue block55;
                }
                case 614438443: {
                    int cfr_ignored_30 = (Integer.rotateLeft(0x61913610 ^ n2, 15) + -722261205) * 1636906513;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x790CB8FA, 7) ^ 0x8A016C63FAE6207FL ^ 0x8A016C63FAE6207FL);
                    int cfr_ignored_31 = Integer.rotateRight(0xD8F7F3E3 ^ n2, 14) + 1248077752;
                    try {
                        n -= 5;
                        if ((0x2CFFD72C80B4DBD3L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xD7D044AF, 7)));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xD7D044AF, 7) ^ 0x36FE23FB65FE9254L ^ 0x36FE23FB65FE9254L);
                    }
                    n += 5;
                    continue block55;
                }
                case 1481595449: {
                    bly.shhr_2(-1522731744, n2);
                    int cfr_ignored_32 = (int)(0x3B0B8C997F4A7C15L ^ (long)n2 ^ 0xE4423227030DDBC6L);
                    n3 = Integer.rotateLeft(n2 ^ 0xFD64B218, 7) ^ 0x4661DF93 ^ 0x4661DF93;
                    int cfr_ignored_33 = (Integer.rotateLeft(0xB774EAF0 ^ n2, 9) + 998642251) * -1217074447;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xD7D044AF, 7)));
                    int cfr_ignored_34 = (Integer.rotateRight(0xAC89D37B ^ n2, 8) + -384943328) * -1400253573;
                    n += 2;
                    continue block55;
                }
                case -1919816516: {
                    int cfr_ignored_35 = Integer.rotateRight(0xCADE662F ^ n2, 12) - -1790181652;
                    try {
                        n -= 5;
                        if ((0x80841D6BA36267E5L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xD7D044AF, 7)));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.rotateLeft(n2 ^ 0xD7D044AF, 7);
                    }
                    continue block55;
                }
                case -88619409: {
                    int cfr_ignored_36 = Integer.rotateRight(0x6DDED36E ^ n2, 16) - 1381579149;
                    n3 = Integer.rotateLeft(n2 ^ 0xF4BB7298, 7) ^ 0xD260A2C8 ^ 0xD260A2C8;
                    int cfr_ignored_37 = Integer.rotateRight(0x8B59B8B ^ n2, 4) + 307983632;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xD7D044AF, 7)));
                    n += 4;
                    continue block55;
                }
                case 941198693: {
                    int cfr_ignored_38 = (Integer.rotateRight(0x3A86F83B ^ n2, 10) + 448114272) * 981923899;
                    try {
                        n += 2;
                        if ((0xF80F231B9D74AB0FL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0xD7D044AF, 7) + -1520368927 - -1520368927;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.rotateLeft(n2 ^ 0xD7D044AF, 7);
                    }
                    continue block55;
                }
                case -1843440039: {
                    int cfr_ignored_39 = Integer.rotateRight(0x3DBCD3AB ^ n2, 10) + 2117812464;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xD313DC7B, 7) ^ 0xBC0B8F03EF634275L ^ 0xBC0B8F03EF634275L);
                    int cfr_ignored_40 = (Integer.rotateRight(0x84F0199E ^ n2, 3) - 493926749) * -2064639585;
                    n3 = Integer.rotateLeft(n2 ^ 0x5792CA5A, 7);
                    int cfr_ignored_41 = (Integer.rotateRight(0xD8FD76DE ^ n2, 14) - 1259275293) * -654477601;
                    n3 = Integer.rotateLeft(n2 ^ 0xD7D044AF, 7);
                    n += 2;
                    continue block55;
                }
                case 314593120: {
                    int cfr_ignored_42 = (Integer.rotateLeft(0x82B5E551 ^ n2, 3) + -664509430) * -2102008495;
                    int cfr_ignored_43 = (int)(0x40074B6C27D4EB4FL ^ (long)n2 ^ 0x6BA8831A2DB92DDFL);
                    n3 = Integer.rotateLeft(n2 ^ 0x60B390EF, 7) ^ 0x50DACA73 ^ 0x50DACA73;
                    int cfr_ignored_44 = (Integer.rotateLeft(0x8C49B995 ^ n2, 4) - 21698630) * -1941325419;
                    int cfr_ignored_45 = (int)(0x4EFB17A827D4EB4FL ^ (long)n2 ^ 0xD220831A2DB93027L);
                    n3 = Integer.rotateLeft(n2 ^ 0xD7D044AF, 7);
                    int cfr_ignored_46 = (Integer.rotateRight(0x8742CD6 ^ n2, 4) - 175050021) * 141831383;
                    continue block55;
                }
                case 1974254122: {
                    int cfr_ignored_47 = (Integer.rotateRight(0x24C2F377 ^ n2, 7) - 2012813988) * 616756087;
                    try {
                        --n;
                        if ((0x56BD2FB16E912AEDL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0xD7D044AF, 7) + 224729192 - 224729192;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xD7D044AF, 7)));
                    }
                    continue block55;
                }
                case 2033395698: {
                    int cfr_ignored_48 = Integer.rotateRight(0x3C41DFAF ^ n2, 10) - 1347925356;
                    int cfr_ignored_49 = (int)(0xAD68F552C69CFD15L ^ (long)n2 ^ 0x17D5418A010CF700L);
                    n3 = Integer.rotateLeft(n2 ^ 0xD7D044AF, 7) + 1136552660 - 1136552660;
                    n -= 4;
                    continue block55;
                }
                case 1586513869: {
                    int cfr_ignored_50 = Integer.rotateLeft(0xA642172C ^ n2, 7) - 643722639;
                    n3 = Integer.rotateLeft(n2 ^ 0xF387E3F4, 7) + 349770913 - 349770913;
                    int cfr_ignored_51 = Integer.rotateRight(0xBDC66FC7 ^ n2, 10) - -10147756;
                    n3 = Integer.rotateLeft(n2 ^ 0xD7D044AF, 7) ^ 0x57FCF02E ^ 0x57FCF02E;
                    n += 3;
                    continue block55;
                }
                case -1598942287: {
                    return f;
                }
            }
            int cfr_ignored_52 = Integer.rotateRight(0x249BB68E ^ n2, 7) - 1933097581;
            n3 = Integer.rotateLeft(n2 ^ 0xD7D044AF, 7) ^ 0xD87D70EC ^ 0xD87D70EC;
        }
    }

    private boolean zghh_3() {
        int n = bly.dhwq(-1145235074);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x5AA2A4E3;
        if ((n2 ^ n) != 1520608483) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xE11FBD9D ^ n, 15) - 1194693950) * -518013539;
            int cfr_ignored_1 = (int)(0x23AD13A027D4EB4FL ^ (long)n ^ 0xDA30831A2DB9EA8BL);
        }
        return !this.gha_2.shghkh();
    }

    private static String jhz(String string, int n, int n2, int n3) {
        int n4 = bly.dhwq(2003356526);
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 27)) ^ 0x1FBE63B;
        if ((n5 ^ n4) != 33285691) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x76932D55 ^ n4, 17) - 1613765766) * 1989356885;
            int cfr_ignored_1 = (int)(0xB421836827D4EB4FL ^ (long)n4 ^ 0xFBA0831A2DB8C592L);
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x68E852B3 ^ n2 - i) + twf, 14) ^ hthdh + i * -835353551));
        }
        return new String(cArray);
    }

    private static boolean bqm(fy fy2) {
        block0: {
            int n = 1212283601;
            n = Integer.rotateLeft(n * 2038180635, 14) ^ 0x1002C4D9;
            fy fy3 = fy2;
            n = (fy3 != null ? System.identityHashCode(fy3) : 0) ^ n;
            int n2 = n ^ 0x47B70395;
            if ((n2 ^ n) == 1203176341) break block0;
            int cfr_ignored_0 = (0xFF6F944 ^ n) - -1109105520;
        }
        return fy2.shghkh();
    }

    private static float jhb_2(int n) {
        block0: {
            int n2 = bly.dhwq(-810514159);
            int n3 = n2 ^ 0x6E78DAC5;
            if ((n3 ^ n2) == 1853414085) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xA1C853D4 ^ n2, 7) - -1684027929) * -1580706859;
        }
        return Float.intBitsToFloat(n);
    }

    private static String[] zst_5(String string) {
        int n = -1014690852;
        int n2 = (n = Integer.rotateLeft(n * -825430319, 23) ^ 0x9DF88104) ^ 0x695D1231;
        if ((n2 ^ n) != 1767707185) {
            int cfr_ignored_0 = (0xAAD819ED ^ n) + 1349046768;
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

    private static CallSite khml(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -536654227;
            n3 = Integer.rotateLeft(n3 * -556500889, 19) ^ 0x80956375;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            String string4 = string2;
            n3 = Integer.rotateRight((string4 != null ? System.identityHashCode(string4) : 0) ^ n3, 6);
            int n4 = n3 ^ 0x59EC554B;
            if ((n4 ^ n3) != 1508660555) {
                int cfr_ignored_0 = (0xB9EF1B26 ^ n3) - 1760584072;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ rst_2 ^ string.hashCode() ^ n2 + ssd_4 ^ i * 8888173 ^ rst_2, 26) ^ ssd_4));
            }
            String[] stringArray = bsa_3.zst_5(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] m8168ccodfzlo(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite qaezun328re(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ zu2ithu ^ string.hashCode()) + (n2 + o18a22v) + i ^ zu2ithu, 17) + o18a22v);
            }
            String[] stringArray = bsa_3.m8168ccodfzlo(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

