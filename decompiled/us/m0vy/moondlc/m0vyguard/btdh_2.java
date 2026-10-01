/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.SplittableRandom;
import java.util.concurrent.CancellationException;
import us.m0vy.moondlc.m0vyguard.bss_4;
import us.m0vy.moondlc.m0vyguard.tkhs_2;
import us.m0vy.moondlc.m0vyguard.tzl;
import us.m0vy.moondlc.m0vyguard.za_2;
import us.m0vy.moondlc.m0vyguard.yf;

public final class btdh_2 {
    private static final int rda_2 = 24;
    private static final int tya = 2;
    private static final int thdt_2 = 50;
    private static final int hfkh = 30000;
    private static final int rqh_2 = 64;
    private static final int thms = 7;
    private final float[] khthh_2;
    private final float[] sym;
    private final float[] dmt;
    private final float[] thl;
    private final float[] znd;
    private final float[] jwth;
    private final int sjn;
    private final int dhthd;
    private final float zsz_3;
    private final float jdha;
    private final float ztb;
    private final float th_5;
    private static final int thfkh = -111713497;
    private static final int sjd_3 = 829638157;
    private static final int thkr = -905190259;
    private static final int hdq = -688701026;
    private static final int an68lhxfm = -750254052;
    private static final int wpk5xk7kdy68r = -1049728295;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int rsrjnt38l7zg;

    private btdh_2(float[] fArray, float[] fArray2, float[] fArray3, float[] fArray4, float[] fArray5, float[] fArray6, int n, int n2, float f, float f2, float f3) {
        this.khthh_2 = fArray;
        this.sym = fArray2;
        this.dmt = fArray3;
        this.thl = fArray4;
        this.znd = fArray5;
        this.jwth = fArray6;
        this.sjn = n;
        this.dhthd = n2;
        this.zsz_3 = f;
        this.jdha = f2;
        this.ztb = f3;
        float f4 = 1.0f - (float)Math.exp((float)(-n) / Float.intBitsToFloat(0xD630500D ^ 0x92CA500D));
        float f5 = btdh_2.btw(1.0f - (float)Math.sqrt(Math.max(0.0f, f)) * Float.intBitsToFloat(Integer.reverse(-2055703230) ^ 0x7D4878C7), Float.intBitsToFloat(Integer.reverse(-124046700) ^ 0x170015D2), 1.0f);
        this.th_5 = Math.min(Float.intBitsToFloat(Integer.rotateLeft(0x2D3F764C ^ 0xEFB0E9F9, 17)), f4 * f5);
    }

    public void zkhsh_2(float[] fArray, float[] fArray2, float[] fArray3) {
        int n = 0;
        float f = 0.0f;
        int n2 = 0;
        int n3 = 0;
        float f2 = 0.0f;
        int n4 = 0;
        int n5 = -1638201180;
        n5 = Integer.rotateLeft(n5 * 886922431, 12) ^ 0xA9A92968;
        n5 = Integer.rotateRight(System.identityHashCode(this) ^ n5, 14);
        n5 = (fArray2 != null ? System.identityHashCode(fArray2) : 0) ^ n5;
        int n6 = -2078180708 + n5;
        block75: while (true) {
            switch (n6 - n5) {
                case 161407075: {
                    int cfr_ignored_0 = Integer.rotateLeft(0xB5A938C5 ^ n5, 9) - 64716566;
                    int cfr_ignored_1 = (int)(0x771B96F827D4EB4FL ^ (long)n5 ^ 0xD080831A2DB943E6L);
                    return;
                }
                case 10798626: {
                    int cfr_ignored_2 = Integer.rotateLeft(0xE1A2CDAC ^ n5, 15) - 1460963087;
                    f = this.thl[n];
                    n2 = n * btdh_2.dww(0xD65FCA23 ^ 0x8E5FCA23, 6);
                    n3 = 0;
                    try {
                        n4 += 4;
                        if ((0x14B584642893BE5L ^ (long)n5 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n6 = 1217566488 + n5 + 1501621539 - 1501621539;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n6 = 1217566488 + n5 ^ 0x7C489BA6 ^ 0x7C489BA6;
                    }
                    n4 += 5;
                    continue block75;
                }
                case -269177986: {
                    int cfr_ignored_3 = (Integer.rotateLeft(0xB54AC15C ^ n5, 9) - -127202977) * -1253392035;
                    if (n < 2) {
                        try {
                            n4 -= 2;
                            n6 = -1831269495 + n5 + 1534126793 - 1534126793;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n6 = -1831269495 + n5;
                        }
                        continue block75;
                    }
                    int cfr_ignored_4 = (int)(0x258A0377042A209AL ^ (long)n5 ^ 0xFB9EC4E7BA13E6C5L);
                    n6 = Integer.reverse(Integer.reverse(161407075 + n5));
                    n4 -= 2;
                    continue block75;
                }
                case 402957493: {
                    int cfr_ignored_5 = Integer.rotateRight(0x37106A02 ^ n5, 9) + -1353026183;
                    if (fArray3.length < 2) {
                        int cfr_ignored_6 = (int)(0x85EE21F4D181BF64L ^ (long)n5 ^ 0xBE996FB085EEA60DL);
                        n6 = -1329744840 + n5 + 417405482 - 417405482;
                        int cfr_ignored_7 = (int)(0x2C0CF7C4528830A9L ^ (long)n5 ^ 0x12F869A39A75F5C8L);
                        n6 = (int)((long)(-1675793575 + n5) ^ 0x2B45B870BA015C12L ^ 0x2B45B870BA015C12L);
                        n4 += 3;
                        continue block75;
                    }
                    try {
                        n4 += 3;
                        if ((0x328CA1009A03593FL ^ (long)n5 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n6 = 551622079 + n5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n6 = Integer.reverse(Integer.reverse(551622079 + n5));
                    }
                    n4 -= 5;
                    continue block75;
                }
                case 1970262509: {
                    int cfr_ignored_8 = Integer.rotateLeft(0xA450F8A5 ^ n5, 7) - -366232778;
                    int cfr_ignored_9 = (int)(0x66E2569827D4EB4FL ^ (long)n5 ^ 0x5040831A2DB96015L);
                    fArray2[n] = (float)Math.tanh(f);
                    ++n;
                    n6 = Integer.reverse(Integer.reverse(-546345741 + n5));
                    continue block75;
                }
                case -538557302: {
                    int cfr_ignored_10 = (Integer.rotateLeft(0xBA607558 ^ n5, 10) + -1777609501) * -1168083623;
                    n = 0;
                    try {
                        n4 += 5;
                        if ((0x985CB1182FF4A6D5L ^ (long)n5 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n6 = -269177986 + n5 ^ 0x85A14647 ^ 0x85A14647;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n6 = (int)((long)(-269177986 + n5) ^ 0x2C69F20D052A6B27L ^ 0x2C69F20D052A6B27L);
                    }
                    n4 += 3;
                    continue block75;
                }
                case -256356753: {
                    int cfr_ignored_11 = Integer.rotateLeft(0x42908180 ^ n5, 11) + 333270459;
                    if (fArray2.length >= 1767933879 + -1767933855) {
                        try {
                            n6 = 402957493 + n5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n6 = 402957493 + n5 + -524986887 - -524986887;
                        }
                        continue block75;
                    }
                    n6 = (int)((long)(460988901 + n5) ^ 0x35448664D1F6FD5DL ^ 0x35448664D1F6FD5DL);
                    int cfr_ignored_12 = Integer.rotateRight(0x7BB71DE6 ^ n5, 18) - -7717355;
                    n6 = (int)((long)(-1675793575 + n5) ^ 0x31E21F427E048CF5L ^ 0x31E21F427E048CF5L);
                    --n4;
                    continue block75;
                }
                case -2078180708: {
                    int cfr_ignored_13 = (Integer.rotateRight(0xD25F4153 ^ n5, 13) + 2112260168) * -765509293;
                    if (fArray.length != -520817421 - -520817443) {
                        n6 = -1675793575 + n5 + -1285480184 - -1285480184;
                        int cfr_ignored_14 = Integer.rotateRight(0x6ADB40E ^ n5, 3) - -748262163;
                        continue block75;
                    }
                    try {
                        n6 = -256356753 + n5 ^ 0x7544696B ^ 0x7544696B;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n6 = Integer.reverse(Integer.reverse(-256356753 + n5));
                    }
                    continue block75;
                }
                case -546345741: {
                    int cfr_ignored_15 = Integer.rotateRight(0x4A167CE7 ^ n5, 12) - -48840908;
                    if (n >= btdh_2.dym_2(0x165119BA ^ 0x105119BA, 10)) {
                        n6 = -538557302 + n5;
                        int cfr_ignored_16 = Integer.rotateRight(0x5AA16A8B ^ n5, 14) + -35027440;
                        continue block75;
                    }
                    try {
                        --n4;
                        if ((0x719571F17E72E265L ^ (long)n5 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n6 = 10798626 + n5;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n6 = 10798626 + n5 + -1849408336 - -1849408336;
                    }
                    ++n4;
                    continue block75;
                }
                case 1217566488: {
                    int cfr_ignored_17 = (Integer.rotateLeft(0xDE5A48DC ^ n5, 14) - -246648353) * -564508451;
                    if (n3 >= -1579292127 - -1579292149) {
                        n6 = 2058743833 + n5;
                        int cfr_ignored_18 = Integer.rotateLeft(0x1833ACC4 ^ n5, 6) - -224425225;
                        n6 = 1970262509 + n5 ^ 0x627C5170 ^ 0x627C5170;
                        n4 -= 5;
                        continue block75;
                    }
                    int cfr_ignored_19 = (int)(0xA6CEB84B54F81060L ^ (long)n5 ^ 0x8DE66543DBE6E04CL);
                    n6 = (int)((long)(-1670200594 + n5) ^ 0x9F25D7B6CD79A4CBL ^ 0x9F25D7B6CD79A4CBL);
                    int cfr_ignored_20 = (int)(0xF92F3543DC1F0CB8L ^ (long)n5 ^ 0x97F7748DE2565F8FL);
                    n6 = (int)((long)(-407517596 + n5) ^ 0x4A9BE4205BB734F6L ^ 0x4A9BE4205BB734F6L);
                    ++n4;
                    continue block75;
                }
                case 793931903: {
                    int cfr_ignored_21 = Integer.rotateRight(0xCEF01C66 ^ n5, 12) - 326176661;
                    if (n3 >= (Integer.reverse(-543578416) ^ 0xB6599E3)) {
                        int cfr_ignored_22 = (int)(0x4510F4CB2718896AL ^ (long)n5 ^ 0x14E68282E9F327F0L);
                        n6 = (int)((long)(-1599174851 + n5) ^ 0x21FFCB7F44B83B56L ^ 0x21FFCB7F44B83B56L);
                        int cfr_ignored_23 = (int)(0x464FAEDCCC77C082L ^ (long)n5 ^ 0xA0C9545C7A23214EL);
                        n6 = -2058118679 + n5;
                        continue block75;
                    }
                    n6 = -887481327 + n5;
                    int cfr_ignored_24 = (Integer.rotateRight(0xB8CA6237 ^ n5, 10) - 1692369892) * -1194696137;
                    n6 = (int)((long)(795304748 + n5) ^ 0x962810C6A45FFE33L ^ 0x962810C6A45FFE33L);
                    continue block75;
                }
                case 795304748: {
                    int cfr_ignored_25 = (Integer.rotateLeft(0x7959C0BC ^ n5, 18) - -1237584385) * 2035925181;
                    f += this.znd[n2 + n3] * fArray2[n3];
                    ++n3;
                    int cfr_ignored_26 = (int)(0xF1A113B91143592CL ^ (long)n5 ^ 0xDA02EE35497E4E93L);
                    n6 = 793931903 + n5 + 1270658788 - 1270658788;
                    n4 += 2;
                    continue block75;
                }
                case -2003157098: {
                    int cfr_ignored_27 = Integer.rotateRight(0x782BCE27 ^ n5, 18) - -1851025932;
                    f += this.znd[n2 + n3] * fArray2[n3];
                    ++n3;
                    n6 = -828190414 + n5;
                    int cfr_ignored_28 = (Integer.rotateLeft(0x605E7E54 ^ n5, 15) - -1345393817) * 1616805461;
                    n6 = (int)((long)(793931903 + n5) ^ 0xD69EB1B867A0D9CEL ^ 0xD69EB1B867A0D9CEL);
                    n4 -= 4;
                    continue block75;
                }
                case -2058118679: {
                    int cfr_ignored_29 = Integer.rotateRight(0x50C435E6 ^ n5, 13) - -870308331;
                    fArray3[n] = (float)Math.tanh(f);
                    ++n;
                    int cfr_ignored_30 = (int)(0xA86CCC7A47D02C3EL ^ (long)n5 ^ 0x65844313A35AFD08L);
                    n6 = 965983991 + n5;
                    int cfr_ignored_31 = (int)(0xFB876880487576CCL ^ (long)n5 ^ 0x2C705C5916BE5ADFL);
                    n6 = Integer.reverse(Integer.reverse(-269177986 + n5));
                    continue block75;
                }
                case 551622079: {
                    int cfr_ignored_32 = Integer.rotateRight(0x27DC2EE ^ n5, 3) - 1368930829;
                    n = 0;
                    n6 = -1033494549 + n5 ^ 0xB909D461 ^ 0xB909D461;
                    int cfr_ignored_33 = Integer.rotateRight(0x8E0CA1CB ^ n5, 4) + 937768656;
                    n6 = -546345741 + n5 ^ 0x9333C6A ^ 0x9333C6A;
                    --n4;
                    continue block75;
                }
                case -1675793575: {
                    int cfr_ignored_34 = Integer.rotateRight(0x3385BC6F ^ n5, 9) - 1099919532;
                    throw new IllegalArgumentException("Invalid Neuro inf".concat("erence buffer size"));
                }
                case -1831269495: {
                    int cfr_ignored_35 = (Integer.rotateRight(0xBA6EC2F6 ^ n5, 10) - -1748550907) * -1167146249;
                    f = this.jwth[n];
                    n2 = n * (-332308429 + 332308453);
                    n3 = 0;
                    try {
                        n4 -= 5;
                        n6 = 793931903 + n5 + -626927557 - -626927557;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n6 = 793931903 + n5;
                    }
                    n4 += 3;
                    continue block75;
                }
                case -407517596: {
                    int cfr_ignored_36 = (Integer.rotateLeft(0xFA7E0018 ^ n5, 18) + 1503633955) * -92405735;
                    f2 = (fArray[n3] - this.khthh_2[n3]) * this.sym[n3];
                    f += this.dmt[n2 + n3] * f2;
                    ++n3;
                    try {
                        ++n4;
                        n6 = 1217566488 + n5;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n6 = (int)((long)(1217566488 + n5) ^ 0x7EEE952236432751L ^ 0x7EEE952236432751L);
                    }
                    n4 -= 2;
                    continue block75;
                }
                case 2217331: {
                    int cfr_ignored_37 = (Integer.rotateRight(0x82D66CDA ^ n5, 3) + -598422111) * -2099876645;
                    n6 = (int)((long)(811809335 + n5) ^ 0xE3C3CAAE62939959L ^ 0xE3C3CAAE62939959L);
                    int cfr_ignored_38 = (Integer.rotateRight(0x79095BD7 ^ n5, 18) - -1400914364) * 2030656471;
                    n6 = (int)((long)(-2078180708 + n5) ^ 0xA0C4D22BAFCE6443L ^ 0xA0C4D22BAFCE6443L);
                    n4 -= 5;
                    continue block75;
                }
                case -818246285: {
                    int cfr_ignored_39 = (Integer.rotateLeft(0x305BBA59 ^ n5, 9) + -545705982) * 811317849;
                    int cfr_ignored_40 = (int)(0xF2E9146427D4EB4FL ^ (long)n5 ^ 0xD5B8831A2DB84803L);
                    n6 = -518800193 + n5;
                    int cfr_ignored_41 = Integer.rotateRight(0x70609ECB ^ n5, 17) + -1609508400;
                    try {
                        n4 += 4;
                        n6 = -2078180708 + n5 + -942688060 - -942688060;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n6 = (int)((long)(-2078180708 + n5) ^ 0xB14C22C03BE86D3FL ^ 0xB14C22C03BE86D3FL);
                    }
                    n4 -= 2;
                    continue block75;
                }
                case -697402986: {
                    int cfr_ignored_42 = Integer.rotateRight(0xE5B18FE3 ^ n5, 15) + -723645512;
                    n6 = (int)((long)(-1509873584 + n5) ^ 0x4DD06591EC4A4029L ^ 0x4DD06591EC4A4029L);
                    int cfr_ignored_43 = (Integer.rotateRight(0xD35C972 ^ n5, 4) + -1646197751) * 221628787;
                    try {
                        n6 = -2078180708 + n5;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n6 = -2078180708 + n5 ^ 0xE98E0CA9 ^ 0xE98E0CA9;
                    }
                    n4 += 3;
                    continue block75;
                }
                case -1056920396: {
                    int cfr_ignored_44 = (Integer.rotateLeft(0xAFC157D4 ^ n5, 8) - 1288126951) * -1346283563;
                    try {
                        if ((0x525E4FEA76A8B02DL ^ (long)n5 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n6 = -2078180708 + n5 + -990645533 - -990645533;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n6 = -2078180708 + n5 ^ 0x656ADCAE ^ 0x656ADCAE;
                    }
                    ++n4;
                    continue block75;
                }
                case 1438935410: {
                    int cfr_ignored_45 = (Integer.rotateRight(0x73BD0D9B ^ n5, 17) + 138560768) * 1941769627;
                    try {
                        if ((0x5918BAC9E7EF3AF3L ^ (long)n5 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n6 = Integer.reverse(Integer.reverse(-2078180708 + n5));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n6 = -2078180708 + n5 + -1541223797 - -1541223797;
                    }
                    continue block75;
                }
                case 1342763884: {
                    int cfr_ignored_46 = (Integer.rotateRight(0xBFE89D5E ^ n5, 10) - 1099476381) * -1075274401;
                    try {
                        ++n4;
                        if ((0x817C8FD5CD944181L ^ (long)n5 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n6 = -2078180708 + n5 + -100533337 - -100533337;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n6 = Integer.reverse(Integer.reverse(-2078180708 + n5));
                    }
                    n4 -= 4;
                    continue block75;
                }
                case -1894737657: {
                    int cfr_ignored_47 = Integer.rotateLeft(0x874D9849 ^ n5, 3) + 1724059666;
                    int cfr_ignored_48 = (int)(0x45FF367427D4EB4FL ^ (long)n5 ^ 0x9198831A2DB9262FL);
                    n6 = (int)((long)(-1240217220 + n5) ^ 0xD6DD18629D3C2E6CL ^ 0xD6DD18629D3C2E6CL);
                    int cfr_ignored_49 = (Integer.rotateLeft(0x27901654 ^ n5, 7) - -825207961) * 663754325;
                    n6 = -2078180708 + n5 ^ 0xC288F728 ^ 0xC288F728;
                    int cfr_ignored_50 = Integer.rotateLeft(0x36FB67AC ^ n5, 9) - -1395708657;
                    n4 += 4;
                    continue block75;
                }
                case 718338352: {
                    int cfr_ignored_51 = Integer.rotateLeft(0xEC822D41 ^ n5, 16) + -1474225638;
                    int cfr_ignored_52 = (int)(0x2E30837C27D4EB4FL ^ (long)n5 ^ 0xFB88831A2DB9F1B0L);
                    n6 = -662205120 + n5 + -664344244 - -664344244;
                    int cfr_ignored_53 = (Integer.rotateLeft(0x51D40FDD ^ n5, 13) - -318010626) * 1372852189;
                    int cfr_ignored_54 = (int)(0x9366A1E027D4EB4FL ^ (long)n5 ^ 0xBEB0831A2DB88B1CL);
                    int cfr_ignored_55 = (int)(0xE33E24E3A72FC48DL ^ (long)n5 ^ 0xB4B782EC723C6BADL);
                    n6 = -2078180708 + n5 ^ 0x299E7DB7 ^ 0x299E7DB7;
                    n4 += 5;
                    continue block75;
                }
                case 483132412: {
                    int cfr_ignored_56 = (Integer.rotateLeft(0x79FBDEB4 ^ n5, 18) - -908224761) * 2046549685;
                    try {
                        n4 -= 4;
                        if ((0xECFED98041E89975L ^ (long)n5 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n6 = -2078180708 + n5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n6 = -2078180708 + n5;
                    }
                    continue block75;
                }
                case 646857136: {
                    int cfr_ignored_57 = Integer.rotateRight(0xA14F32EE ^ n5, 7) - -1930114547;
                    int cfr_ignored_58 = (int)(0x5DBBC3E82CEE8E86L ^ (long)n5 ^ 0x7AA0956EE62B16A6L);
                    n6 = -761413798 + n5 ^ 0xE7E63DA ^ 0xE7E63DA;
                    int cfr_ignored_59 = (int)(0xCAD8E1430421D3F1L ^ (long)n5 ^ 0x3FF6C4F05CC43860L);
                    n6 = Integer.reverse(Integer.reverse(-2078180708 + n5));
                    continue block75;
                }
                case 1109571474: {
                    int cfr_ignored_60 = (Integer.rotateLeft(0x88007511 ^ n5, 4) + 2087439434) * -2013235951;
                    int cfr_ignored_61 = (int)(0x4AB2DB2C27D4EB4FL ^ (long)n5 ^ 0x4B28831A2DB938B4L);
                    n6 = 1905759337 + n5 ^ 0x19995698 ^ 0x19995698;
                    int cfr_ignored_62 = Integer.rotateLeft(0xDC0CDE9 ^ n5, 4) + -1363767694;
                    int cfr_ignored_63 = (int)(0xCF7263D427D4EB4FL ^ (long)n5 ^ 0x3AD8831A2DB83335L);
                    try {
                        n4 -= 2;
                        if ((0x6A8A91991037FE9BL ^ (long)n5 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n6 = -2078180708 + n5 + -432932435 - -432932435;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n6 = Integer.reverse(Integer.reverse(-2078180708 + n5));
                    }
                    continue block75;
                }
                case 1878668770: {
                    int cfr_ignored_64 = Integer.rotateLeft(0x5B86F6C4 ^ n5, 14) - 431325431;
                    n6 = Integer.reverse(Integer.reverse(268325457 + n5));
                    int cfr_ignored_65 = (Integer.rotateLeft(0xAFCBA154 ^ n5, 8) - 1309026407) * -1345609387;
                    try {
                        ++n4;
                        if ((0x1A169F8957906D27L ^ (long)n5 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n6 = -2078180708 + n5 + -1106411924 - -1106411924;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n6 = -2078180708 + n5 + 1442472217 - 1442472217;
                    }
                    n4 += 3;
                    continue block75;
                }
                case -1226270973: {
                    int cfr_ignored_66 = Integer.rotateRight(0x96BE60E7 ^ n5, 5) - 1164663604;
                    int cfr_ignored_67 = (int)(0x3AEA91E5C8418CC6L ^ (long)n5 ^ 0xDEBB5C30E2ABD804L);
                    n6 = -2083491888 + n5;
                    int cfr_ignored_68 = (int)(0x16871DAAD2B8DC6BL ^ (long)n5 ^ 0xC62569C243F180DFL);
                    n6 = -2078180708 + n5;
                    n4 += 3;
                    continue block75;
                }
                case -1928831276: {
                    int cfr_ignored_69 = Integer.rotateLeft(0xAB8D9060 ^ n5, 8) + -897443109;
                    n6 = (int)((long)(-1037234972 + n5) ^ 0xED73C2DA5C515253L ^ 0xED73C2DA5C515253L);
                    int cfr_ignored_70 = (Integer.rotateLeft(0x38F0B9DD ^ n5, 10) - -377216770) * 955300317;
                    int cfr_ignored_71 = (int)(0xFA4217E027D4EB4FL ^ (long)n5 ^ 0xD2B0831A2DB85955L);
                    int cfr_ignored_72 = (int)(0xF998BA26269CA88EL ^ (long)n5 ^ 0x893C818AAA3A5EE0L);
                    n6 = 1019457667 + n5 ^ 0x33EE1EFB ^ 0x33EE1EFB;
                    int cfr_ignored_73 = (int)(0x5E17C9ED83551385L ^ (long)n5 ^ 0x6EABCA19DC2D11FEL);
                    n6 = -2078180708 + n5 ^ 0x15886D9C ^ 0x15886D9C;
                    --n4;
                    continue block75;
                }
                case -1004450058: {
                    int cfr_ignored_74 = Integer.rotateRight(0x87FF3E4B ^ n5, 3) + 2084973136;
                    n6 = 116042331 + n5;
                    int cfr_ignored_75 = Integer.rotateLeft(0x773FAEA8 ^ n5, 17) + 1964230035;
                    try {
                        n6 = (int)((long)(-2078180708 + n5) ^ 0x3D6848F523FA0283L ^ 0x3D6848F523FA0283L);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n6 = -2078180708 + n5;
                    }
                    ++n4;
                    continue block75;
                }
                case 2118845747: {
                    int cfr_ignored_76 = Integer.rotateRight(0x6BE0B3E2 ^ n5, 16) + 345204633;
                    try {
                        n4 -= 4;
                        if ((0x69A3E362CA2C84B1L ^ (long)n5 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n6 = Integer.reverse(Integer.reverse(-2078180708 + n5));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n6 = -2078180708 + n5 + -760023578 - -760023578;
                    }
                    n4 -= 3;
                    continue block75;
                }
                case 427938729: {
                    int cfr_ignored_77 = (Integer.rotateLeft(0xEDC4CE79 ^ n5, 16) + -818765854) * -305869191;
                    int cfr_ignored_78 = (int)(0x2F76604427D4EB4FL ^ (long)n5 ^ 0x3DF8831A2DB9F33DL);
                    n6 = Integer.reverse(Integer.reverse(850378316 + n5));
                    int cfr_ignored_79 = (Integer.rotateRight(0x58B15F6 ^ n5, 3) - -1338685435) * 93001207;
                    n6 = -2078180708 + n5 + 23718713 - 23718713;
                    continue block75;
                }
            }
            int cfr_ignored_80 = (Integer.rotateRight(0xCABA99D7 ^ n5, 12) - -1862909884) * -893740585;
            n6 = Integer.reverse(Integer.reverse(-2078180708 + n5));
        }
    }

    public static btdh_2 haj(List list, tkhs_2 tkhs2) {
        int n;
        int n2 = 1525195850;
        int n3 = (n2 = Integer.rotateLeft(n2 * -157344029, 6) ^ 0xC52532D8) ^ 0xD0538DBB;
        if ((n3 ^ n2) != -799830597) {
            int cfr_ignored_0 = (0x8ABB29F1 ^ n2) + 107366752;
        }
        if (list.size() < (0x9D3396F ^ 0x9D3390F)) {
            throw new IllegalArgumentException(btdh_2.tmh_3("Not enough", btdh_2.bss("ཪ伄輯켿༸伥轪켹༫伧輺켦༯伹", btdh_2.hma(844677638) ^ 0xAC61E13, 0x3C954630 ^ 0x1E9A6CEA, 0x2278849C ^ 0x28752C2E)));
        }
        SplittableRandom splittableRandom = new SplittableRandom(0x73DD188DEBCCF435L ^ 0x73DD56C8BE9EBB79L ^ (long)list.size());
        int[] nArray = btdh_2.ghty_2(list.size(), splittableRandom);
        int n4 = Math.min(nArray.length, 0xF06AE9D9 ^ 0xF06A9CE9);
        int n5 = n4 - (n = Math.max(Integer.rotateLeft(0x135FA980 ^ 0x135BA980, 18), Math.min(Integer.reverse(-742181872) ^ 0x82CC873, n4 / (Integer.reverse(1055528631) ^ 0xED685776))));
        if (n5 < -1650909628 + 1650909676) {
            n = Math.max(259131904 + -259131896, n4 / (0x32D188CB ^ 0x32D188DF));
            n5 = n4 - n;
        }
        float[] fArray = btdh_2.dhdj_2(list, nArray, n4);
        float[] fArray2 = btdh_2.thqz(list, nArray, n4, fArray);
        float[] fArray3 = new float[Integer.reverse(-790591047) ^ 0x9D91051B];
        float[] fArray4 = new float[Integer.reverse(-547584424) ^ 0x1A613AE3];
        float[] fArray5 = new float[0x8599D29C ^ 0x8599D2AC];
        float[] fArray6 = new float[2];
        btdh_2.akhm(fArray3, splittableRandom, (float)Math.sqrt(Double.longBitsToDouble(0x4A4CAB7D089949D3L ^ 0x758C196B4A5110D8L)));
        btdh_2.akhm(fArray5, splittableRandom, (float)Math.sqrt(Double.longBitsToDouble(0x16EF83AD2392A0F8L ^ 0x29220A75BE1B7866L)));
        za_2 za2_2 = new za_2(fArray3.length);
        za_2 za3 = new za_2(fArray4.length);
        za_2 za4 = new za_2(fArray5.length);
        za_2 za5 = new za_2(fArray6.length);
        float[] fArray7 = new float[fArray3.length];
        float[] fArray8 = new float[fArray4.length];
        float[] fArray9 = new float[fArray5.length];
        float[] fArray10 = new float[fArray6.length];
        float[] fArray11 = new float[Integer.reverse(2067221945) ^ 0x9DB2ECC6];
        float[] fArray12 = new float[2];
        float[] fArray13 = new float[Integer.rotateLeft(0x300F2F32 ^ 0x300F2EB2, 28)];
        float[] fArray14 = (float[])fArray3.clone();
        float[] fArray15 = (float[])fArray4.clone();
        float[] fArray16 = (float[])fArray5.clone();
        float[] fArray17 = (float[])fArray6.clone();
        float f = btdh_2.zwm(0xF87DB497 ^ 0x87FDB497);
        int n6 = 0;
        int n7 = 0;
        long l = 0L;
        for (int i = 1; i <= (Integer.reverse(641365191) ^ 0xE32E5C56); ++i) {
            btdh_2.jsdh_2();
            btdh_2.sshf_2(nArray, n5, splittableRandom);
            float f2 = Float.intBitsToFloat(553122626 - -443376896) * (float)Math.pow(Double.longBitsToDouble(0x257FD57790DE5EC7L ^ 0x1A90E644A3ED6DF4L), i - 1);
            for (int j = 0; j < n5; j += 64) {
                btdh_2.tdhgh();
                int n8 = btdh_2.jwm(n5, j + (1891804985 + -1891804921));
                int n9 = n8 - j;
                Arrays.fill(fArray7, 0.0f);
                Arrays.fill(fArray8, 0.0f);
                Arrays.fill(fArray9, 0.0f);
                Arrays.fill(fArray10, 0.0f);
                for (int k = j; k < n8; ++k) {
                    tzl tzl2 = (tzl)list.get(nArray[k]);
                    btdh_2.dqt_3(btdh_2.dhsz_2(tzl2), fArray, fArray2, fArray3, fArray4, fArray5, fArray6, fArray11, fArray12);
                    float f3 = tzl2.sts();
                    float f4 = tzl2.ghza_3();
                    float f5 = 2.0f * (fArray12[0] - f3) * (1.0f - fArray12[0] * fArray12[0]);
                    float f6 = 2.0f * (fArray12[1] - f4) * (1.0f - fArray12[1] * fArray12[1]);
                    for (int i2 = 0; i2 < (btdh_2.thtz_3(-286357728) ^ 0x4E1776F); ++i2) {
                        int n10 = i2;
                        fArray9[n10] = fArray9[n10] + f5 * fArray11[i2];
                        int n11 = 1749916982 - 1749916958 + i2;
                        fArray9[n11] = fArray9[n11] + f6 * fArray11[i2];
                        float f7 = f5 * fArray5[i2] + f6 * fArray5[-1117216847 - -1117216871 + i2];
                        fArray13[i2] = f7 * (1.0f - fArray11[i2] * fArray11[i2]);
                    }
                    fArray10[0] = fArray10[0] + f5;
                    fArray10[1] = fArray10[1] + f6;
                    float[] fArray18 = tzl2.ghzsh_2();
                    for (int i3 = 0; i3 < 222277446 - 222277422; ++i3) {
                        float f8 = fArray13[i3];
                        int n12 = i3;
                        fArray8[n12] = fArray8[n12] + f8;
                        int n13 = i3 * (531403944 - 531403922);
                        for (int i4 = 0; i4 < (Integer.reverse(2119527815) ^ 0xE1B6AA68); ++i4) {
                            float f9 = (fArray18[i4] - fArray[i4]) * fArray2[i4];
                            int n14 = n13 + i4;
                            fArray7[n14] = fArray7[n14] + f8 * f9;
                        }
                    }
                }
                btdh_2.aghkh(fArray3, fArray7, za2_2, n9, f2, ++l, btdh_2.tkh_2(Integer.rotateLeft(0xE0037519 ^ 0x73E1A302, 25)));
                btdh_2.aghkh(fArray4, fArray8, za3, n9, f2, l, 0.0f);
                btdh_2.szsh_2(fArray5, fArray9, za4, n9, f2, l, Float.intBitsToFloat(Integer.reverse(246907720) ^ 0x25E628DC));
                btdh_2.dmth_2(fArray6, fArray10, za5, n9, f2, l, 0.0f);
            }
            float f10 = btdh_2.bgh(list, nArray, n5, n, fArray, fArray2, fArray3, fArray4, fArray5, fArray6, fArray11, fArray12);
            tkhs2.onProgress(i, f10);
            if (f10 + btdh_2.zdt_6(0x186F8F7D ^ 0x2F484AD1) < f) {
                f = f10;
                n6 = i;
                btdh_2.bsl(fArray3, 0, fArray14, 0, fArray3.length);
                btdh_2.blth(fArray4, 0, fArray15, 0, fArray4.length);
                System.arraycopy(fArray5, 0, fArray16, 0, fArray5.length);
                System.arraycopy(fArray6, 0, fArray17, 0, fArray6.length);
                n7 = 0;
                continue;
            }
            if (++n7 >= (0xD7085C0C ^ 0xD7085C0B)) break;
        }
        float[] fArray19 = btdh_2.khqt_2(list, nArray, n4);
        return new btdh_2(fArray, fArray2, fArray14, fArray15, fArray16, fArray17, list.size(), n6, f, fArray19[0], fArray19[1]);
    }

    private static void dqt_3(float[] fArray, float[] fArray2, float[] fArray3, float[] fArray4, float[] fArray5, float[] fArray6, float[] fArray7, float[] fArray8, float[] fArray9) {
        int n = 0;
        float f = 0.0f;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 252313280;
        n5 = Integer.rotateLeft(n5 * 1868339507, 6) ^ 0xFDA18BDE;
        n5 = (fArray != null ? System.identityHashCode(fArray) : 0) ^ n5;
        n5 = Integer.rotateRight((fArray2 != null ? System.identityHashCode(fArray2) : 0) ^ n5, 20);
        int n6 = Integer.reverse(Integer.reverse(Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5)));
        while (true) {
            block43: {
                block72: {
                    block55: {
                        block78: {
                            block71: {
                                block60: {
                                    block46: {
                                        block48: {
                                            block50: {
                                                block42: {
                                                    block62: {
                                                        block54: {
                                                            block57: {
                                                                block56: {
                                                                    block51: {
                                                                        block52: {
                                                                            block75: {
                                                                                block45: {
                                                                                    block41: {
                                                                                        block67: {
                                                                                            block65: {
                                                                                                block61: {
                                                                                                    block73: {
                                                                                                        block70: {
                                                                                                            block64: {
                                                                                                                block40: {
                                                                                                                    block66: {
                                                                                                                        block77: {
                                                                                                                            block47: {
                                                                                                                                block76: {
                                                                                                                                    block74: {
                                                                                                                                        block68: {
                                                                                                                                            block69: {
                                                                                                                                                block58: {
                                                                                                                                                    block63: {
                                                                                                                                                        block59: {
                                                                                                                                                            block37: {
                                                                                                                                                                block53: {
                                                                                                                                                                    block49: {
                                                                                                                                                                        block38: {
                                                                                                                                                                            block44: {
                                                                                                                                                                                block39: {
                                                                                                                                                                                    if ((n4 = Integer.reverse(n6) ^ n5 ^ 0x8D974DA5) > 385278040) break block37;
                                                                                                                                                                                    if (n4 > -968351822) break block38;
                                                                                                                                                                                    if (n4 > -1290825491) break block39;
                                                                                                                                                                                    if (n4 == -1317464527) break block40;
                                                                                                                                                                                    if (n4 == -1299003944) break block41;
                                                                                                                                                                                    if (n4 == -1290825491) break block42;
                                                                                                                                                                                    break block43;
                                                                                                                                                                                }
                                                                                                                                                                                if (n4 > -1093595452) break block44;
                                                                                                                                                                                if (n4 == -1285494619) break block45;
                                                                                                                                                                                if (n4 == -1093595452) break block46;
                                                                                                                                                                                int cfr_ignored_0 = Integer.rotateLeft(0x1D594D44 ^ n5, 6) - -1842480521;
                                                                                                                                                                                break block43;
                                                                                                                                                                            }
                                                                                                                                                                            if (n4 == -997988500) break block47;
                                                                                                                                                                            if (n4 == -968351822) break block48;
                                                                                                                                                                            break block43;
                                                                                                                                                                        }
                                                                                                                                                                        if (n4 > -178619431) break block49;
                                                                                                                                                                        if (n4 == -639452497) break block50;
                                                                                                                                                                        if (n4 == -249106639) break block51;
                                                                                                                                                                        if (n4 == -178619431) break block52;
                                                                                                                                                                        break block43;
                                                                                                                                                                    }
                                                                                                                                                                    if (n4 > -99494270) break block53;
                                                                                                                                                                    if (n4 == -155757521) break block54;
                                                                                                                                                                    if (n4 == -99494270) break block55;
                                                                                                                                                                    break block43;
                                                                                                                                                                }
                                                                                                                                                                if (n4 == 265911460) break block56;
                                                                                                                                                                if (n4 == 385278040) break block57;
                                                                                                                                                                int cfr_ignored_1 = Integer.rotateRight(0x440BAFEE ^ n5, 11) - 1103621389;
                                                                                                                                                                break block43;
                                                                                                                                                            }
                                                                                                                                                            if (n4 > 1016207777) break block58;
                                                                                                                                                            if (n4 > 487546549) break block59;
                                                                                                                                                            if (n4 == 437976780) break block60;
                                                                                                                                                            if (n4 == 478209076) break block61;
                                                                                                                                                            int cfr_ignored_2 = (Integer.rotateLeft(0x2D0DD215 ^ n5, 8) - 2030702534) * 755880469;
                                                                                                                                                            int cfr_ignored_3 = (int)(0xEFBF7C2827D4EB4FL ^ (long)n5 ^ 0x520831A2DB872AFL);
                                                                                                                                                            if (n4 == 487546549) break block62;
                                                                                                                                                            break block43;
                                                                                                                                                        }
                                                                                                                                                        if (n4 > 698657366) break block63;
                                                                                                                                                        if (n4 == 497626857) break block64;
                                                                                                                                                        if (n4 == 698657366) break block65;
                                                                                                                                                        break block43;
                                                                                                                                                    }
                                                                                                                                                    if (n4 == 1006481299) break block66;
                                                                                                                                                    if (n4 == 1016207777) break block67;
                                                                                                                                                    int cfr_ignored_4 = (Integer.rotateLeft(0xE89586BD ^ n5, 16) - 779677726) * -392853827;
                                                                                                                                                    int cfr_ignored_5 = (int)(0x2A27288027D4EB4FL ^ (long)n5 ^ 0xAC70831A2DB9F99FL);
                                                                                                                                                    break block43;
                                                                                                                                                }
                                                                                                                                                if (n4 > 1318173763) break block68;
                                                                                                                                                if (n4 > 1101932821) break block69;
                                                                                                                                                if (n4 == 1029345083) break block70;
                                                                                                                                                if (n4 == 1101932821) break block71;
                                                                                                                                                break block43;
                                                                                                                                            }
                                                                                                                                            if (n4 == 1297693289) break block72;
                                                                                                                                            if (n4 == 1318173763) break block73;
                                                                                                                                            int cfr_ignored_6 = Integer.rotateRight(0xE9B931AB ^ n5, 16) + 1372234480;
                                                                                                                                            break block43;
                                                                                                                                        }
                                                                                                                                        if (n4 > 1777323823) break block74;
                                                                                                                                        if (n4 == 1451469867) break block75;
                                                                                                                                        if (n4 == 1777323823) break block76;
                                                                                                                                        break block43;
                                                                                                                                    }
                                                                                                                                    if (n4 == 2045131546) break block77;
                                                                                                                                    if (n4 == 2136871281) break block78;
                                                                                                                                    break block43;
                                                                                                                                }
                                                                                                                                int cfr_ignored_7 = Integer.rotateRight(0x4DF1B506 ^ n5, 12) - 1956809461;
                                                                                                                                fArray8[n] = (float)Math.tanh(f);
                                                                                                                                ++n;
                                                                                                                                int cfr_ignored_8 = (int)(0xC2C6FCF9078B1796L ^ (long)n5 ^ 0x482C3A5D40A285CL);
                                                                                                                                n6 = Integer.reverse(n5 ^ 0x3D5A8F3B ^ 0x8D974DA5);
                                                                                                                                n4 -= 2;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            int cfr_ignored_9 = Integer.rotateRight(0xFC62302F ^ n5, 18) - -1807649556;
                                                                                                                            if (n3 >= (Integer.reverse(921987585) ^ 0x80562F74)) {
                                                                                                                                int cfr_ignored_10 = (int)(0xC8F05528CE2E3F00L ^ (long)n5 ^ 0x572150EF85263C31L);
                                                                                                                                n6 = Integer.reverse(n5 ^ 0xC72C584B ^ 0x8D974DA5) + -864408324 - -864408324;
                                                                                                                                int cfr_ignored_11 = (int)(0x38FEB82F077E0617L ^ (long)n5 ^ 0x8D2EC24FF709DC2CL);
                                                                                                                                n6 = Integer.reverse(n5 ^ 0x29A4AA56 ^ 0x8D974DA5);
                                                                                                                                ++n4;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if ((0xAF6CA464C9777229L ^ (long)n5 | 1L) == 0L) {
                                                                                                                                    throw new NoSuchElementException();
                                                                                                                                }
                                                                                                                                n6 = Integer.reverse(n5 ^ 0xB1791631 ^ 0x8D974DA5);
                                                                                                                            }
                                                                                                                            catch (NoSuchElementException noSuchElementException) {
                                                                                                                                n6 = (int)((long)Integer.reverse(n5 ^ 0xB1791631 ^ 0x8D974DA5) ^ 0x3A1185BF865D38C7L ^ 0x3A1185BF865D38C7L);
                                                                                                                            }
                                                                                                                            n4 -= 2;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        int cfr_ignored_12 = (Integer.rotateRight(0xD93302BA ^ n5, 14) + 1368060865) * -650968389;
                                                                                                                        f = fArray7[n];
                                                                                                                        n2 = n * (0x1185C99 ^ 0x1185C81);
                                                                                                                        n3 = 0;
                                                                                                                        n6 = (int)((long)Integer.reverse(n5 ^ 0x8CADBBB8 ^ 0x8D974DA5) ^ 0xE91766AC18F8295L ^ 0xE91766AC18F8295L);
                                                                                                                        int cfr_ignored_13 = (Integer.rotateLeft(0x14A9DCF0 ^ n5, 5) + -2064687029) * 346676465;
                                                                                                                        n6 = Integer.reverse(n5 ^ 0xC483E76C ^ 0x8D974DA5) + -1651638481 - -1651638481;
                                                                                                                        n4 += 4;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    int cfr_ignored_14 = (Integer.rotateRight(0x8E33FD1B ^ n5, 4) + 1017726336) * -1909195493;
                                                                                                                    n = 0;
                                                                                                                    n6 = Integer.reverse(Integer.reverse(Integer.reverse(n5 ^ 0x69312151 ^ 0x8D974DA5)));
                                                                                                                    int cfr_ignored_15 = Integer.rotateLeft(0x8C7695C5 ^ n5, 4) - 112837142;
                                                                                                                    int cfr_ignored_16 = (int)(0x4EC43BF827D4EB4FL ^ (long)n5 ^ 0x8A80831A2DB93059L);
                                                                                                                    n6 = Integer.reverse(n5 ^ 0x5683AC2B ^ 0x8D974DA5) + 278525678 - 278525678;
                                                                                                                    n4 -= 4;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                int cfr_ignored_17 = Integer.rotateLeft(0x8D8432E4 ^ n5, 4) - 660588759;
                                                                                                                f += fArray6[n2 + n3] * fArray8[n3];
                                                                                                                ++n3;
                                                                                                                try {
                                                                                                                    n4 -= 2;
                                                                                                                    n6 = Integer.reverse(n5 ^ 0xC483E76C ^ 0x8D974DA5) + -2085300160 - -2085300160;
                                                                                                                }
                                                                                                                catch (NoSuchElementException noSuchElementException) {
                                                                                                                    n6 = Integer.reverse(n5 ^ 0xC483E76C ^ 0x8D974DA5) ^ 0xB24B421 ^ 0xB24B421;
                                                                                                                }
                                                                                                                ++n4;
                                                                                                                continue;
                                                                                                            }
                                                                                                            int cfr_ignored_18 = (Integer.rotateLeft(0xBB24849D ^ n5, 10) - -1379291586) * -1155234659;
                                                                                                            int cfr_ignored_19 = (int)(0x79962AA027D4EB4FL ^ (long)n5 ^ 0xA830831A2DB95EFDL);
                                                                                                            f += fArray4[n2 + n3] * (fArray[n3] - fArray2[n3]) * fArray3[n3];
                                                                                                            ++n3;
                                                                                                            n6 = Integer.reverse(n5 ^ 0x3C9219A1 ^ 0x8D974DA5);
                                                                                                            int cfr_ignored_20 = Integer.rotateRight(0xD2087F03 ^ n5, 13) + 1935999128;
                                                                                                            n4 -= 3;
                                                                                                            continue;
                                                                                                        }
                                                                                                        int cfr_ignored_21 = Integer.rotateLeft(0xA63EB7AC ^ n5, 7) - 636869903;
                                                                                                        if (n < 1443821866 + -1443821842) {
                                                                                                            n6 = Integer.reverse(n5 ^ 0x4E91BC43 ^ 0x8D974DA5) ^ 0x632F3AD3 ^ 0x632F3AD3;
                                                                                                            n4 += 3;
                                                                                                            continue;
                                                                                                        }
                                                                                                        n6 = Integer.reverse(n5 ^ 0xA1104CF4 ^ 0x8D974DA5) + 527251997 - 527251997;
                                                                                                        int cfr_ignored_22 = Integer.rotateRight(0x48D81D6A ^ n5, 12) + -695652591;
                                                                                                        n6 = Integer.reverse(n5 ^ 0x3BFDAF93 ^ 0x8D974DA5);
                                                                                                        continue;
                                                                                                    }
                                                                                                    int cfr_ignored_23 = (Integer.rotateLeft(0x710133BC ^ n5, 17) - -1283267841) * 1895904189;
                                                                                                    f = fArray5[n];
                                                                                                    n2 = n * (Integer.reverse(231426649) ^ 0x9A52D3A6);
                                                                                                    n3 = 0;
                                                                                                    try {
                                                                                                        if ((0x317D6B27F8BAE78DL ^ (long)n5 | 1L) == 0L) {
                                                                                                            throw new NoSuchElementException();
                                                                                                        }
                                                                                                        n6 = (int)((long)Integer.reverse(n5 ^ 0x3C9219A1 ^ 0x8D974DA5) ^ 0xA8D24B2E5DE94FF5L ^ 0xA8D24B2E5DE94FF5L);
                                                                                                    }
                                                                                                    catch (NoSuchElementException noSuchElementException) {
                                                                                                        n6 = Integer.reverse(Integer.reverse(Integer.reverse(n5 ^ 0x3C9219A1 ^ 0x8D974DA5)));
                                                                                                    }
                                                                                                    --n4;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_24 = Integer.rotateRight(0xB8A19C87 ^ n5, 10) - 1609536404;
                                                                                                f = fArray5[n];
                                                                                                n2 = n * (Integer.reverse(231426649) ^ 0x9A52D3A6);
                                                                                                n3 = 0;
                                                                                                try {
                                                                                                    n4 -= 4;
                                                                                                    if ((0x4D66D770DD0BB3E1L ^ (long)n5 | 1L) == 0L) {
                                                                                                        throw new UnsupportedOperationException();
                                                                                                    }
                                                                                                    n6 = Integer.reverse(n5 ^ 0x3C9219A1 ^ 0x8D974DA5) + -1639109114 - -1639109114;
                                                                                                }
                                                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                    n6 = (int)((long)Integer.reverse(n5 ^ 0x3C9219A1 ^ 0x8D974DA5) ^ 0xAFC479F1CB75677BL ^ 0xAFC479F1CB75677BL);
                                                                                                }
                                                                                                n4 += 4;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_25 = Integer.rotateLeft(0xBC6D4561 ^ n5, 10) + -711391750;
                                                                                            int cfr_ignored_26 = (int)(0x7EDFEB5C27D4EB4FL ^ (long)n5 ^ 0x2BC8831A2DB9506EL);
                                                                                            fArray9[n] = (float)Math.tanh(f);
                                                                                            ++n;
                                                                                            int cfr_ignored_27 = (int)(0xD6ADA0F3947FF8F0L ^ (long)n5 ^ 0xBC97E44C0AC6008AL);
                                                                                            n6 = Integer.reverse(n5 ^ 0x5683AC2B ^ 0x8D974DA5) + -442872891 - -442872891;
                                                                                            ++n4;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_28 = (Integer.rotateRight(0xFAA87C36 ^ n5, 18) - 1589946821) * -89621449;
                                                                                        if (n3 < Integer.rotateLeft(0x4A5D15CB ^ 0x4A5D1ECB, 25)) {
                                                                                            int cfr_ignored_29 = (int)(0x84F5511191461BC1L ^ (long)n5 ^ 0x5F53EE3FCCA4A43BL);
                                                                                            n6 = Integer.reverse(Integer.reverse(Integer.reverse(n5 ^ 0x13DA7FB2 ^ 0x8D974DA5)));
                                                                                            int cfr_ignored_30 = (int)(0x592F4FFA4A91E837L ^ (long)n5 ^ 0x628459902B491F8FL);
                                                                                            n6 = Integer.reverse(n5 ^ 0x1DA92EE9 ^ 0x8D974DA5);
                                                                                            ++n4;
                                                                                            continue;
                                                                                        }
                                                                                        n6 = Integer.reverse(n5 ^ 0x69EFCF2F ^ 0x8D974DA5) ^ 0x9AE51F09 ^ 0x9AE51F09;
                                                                                        int cfr_ignored_31 = (Integer.rotateRight(0xFCF5229E ^ n5, 18) - -1509109667) * -51043681;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_32 = Integer.rotateRight(0x59C2A982 ^ n5, 14) + -487578119;
                                                                                    return;
                                                                                }
                                                                                int cfr_ignored_33 = (Integer.rotateRight(0x10CD713E ^ n5, 5) - 222188989) * 281899327;
                                                                                n = 0;
                                                                                try {
                                                                                    n4 += 4;
                                                                                    if ((0xD9F174BAAADD914FL ^ (long)n5 | 1L) == 0L) {
                                                                                        throw new ArithmeticException();
                                                                                    }
                                                                                    n6 = Integer.reverse(n5 ^ 0x3D5A8F3B ^ 0x8D974DA5) + -2131837168 - -2131837168;
                                                                                }
                                                                                catch (ArithmeticException arithmeticException) {
                                                                                    n6 = (int)((long)Integer.reverse(n5 ^ 0x3D5A8F3B ^ 0x8D974DA5) ^ 0xE7011E71097DF6FFL ^ 0xE7011E71097DF6FFL);
                                                                                }
                                                                                --n4;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_34 = (Integer.rotateLeft(0xCA5E0478 ^ n5, 12) + -2051003965) * -899808135;
                                                                            if (n >= 2) {
                                                                                n6 = Integer.reverse(n5 ^ 0x371C366F ^ 0x8D974DA5) ^ 0xAAC17D30 ^ 0xAAC17D30;
                                                                                int cfr_ignored_35 = (Integer.rotateRight(0xCE23661A ^ n5, 12) + -89719711) * -836540901;
                                                                                n6 = (int)((long)Integer.reverse(n5 ^ 0xB292C5D8 ^ 0x8D974DA5) ^ 0x6CE7CE8A3C570D84L ^ 0x6CE7CE8A3C570D84L);
                                                                                n4 -= 5;
                                                                                continue;
                                                                            }
                                                                            n6 = (int)((long)Integer.reverse(n5 ^ 0x727B9B6B ^ 0x8D974DA5) ^ 0xB4562313100E264BL ^ 0xB4562313100E264BL);
                                                                            int cfr_ignored_36 = (Integer.rotateLeft(0xA07591F1 ^ n5, 7) + 1922714474) * -1602907663;
                                                                            int cfr_ignored_37 = (int)(0x62C73FCC27D4EB4FL ^ (long)n5 ^ 0x82E8831A2DB9685FL);
                                                                            n6 = Integer.reverse(n5 ^ 0x79E63B1A ^ 0x8D974DA5) + -1602372291 - -1602372291;
                                                                            n4 += 4;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_38 = Integer.rotateRight(0x5D1E03A2 ^ n5, 14) + 1258295257;
                                                                        int cfr_ignored_39 = (int)(0x13237290323FE1EL ^ (long)n5 ^ 0x9322CAF4071BAFB5L);
                                                                        n6 = Integer.reverse(n5 ^ 0x714BF659 ^ 0x8D974DA5);
                                                                        int cfr_ignored_40 = (int)(0x4DD58803AEFDC279L ^ (long)n5 ^ 0xED7791487FD5367AL);
                                                                        n6 = Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5);
                                                                        ++n4;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_41 = Integer.rotateLeft(0xC07A0609 ^ n5, 11) + 1394891346;
                                                                    int cfr_ignored_42 = (int)(0x2C8A83427D4EB4FL ^ (long)n5 ^ 0xAD18831A2DB9A840L);
                                                                    int cfr_ignored_43 = (int)(0x72F23611F7FEE12FL ^ (long)n5 ^ 0x9153234E39794835L);
                                                                    n6 = Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5);
                                                                    n4 += 4;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_44 = (Integer.rotateLeft(0xD445E018 ^ n5, 13) + -1194081757) * -733618151;
                                                                n6 = Integer.reverse(n5 ^ 0xF354FE69 ^ 0x8D974DA5);
                                                                int cfr_ignored_45 = (Integer.rotateLeft(0xB4049F59 ^ n5, 9) + -789779710) * -1274765479;
                                                                int cfr_ignored_46 = (int)(0x76B6316427D4EB4FL ^ (long)n5 ^ 0x9FB8831A2DB940BDL);
                                                                n6 = Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5) ^ 0x1DB053B0 ^ 0x1DB053B0;
                                                                int cfr_ignored_47 = Integer.rotateRight(0x46B717A3 ^ n5, 11) + -1802929160;
                                                                n4 += 2;
                                                                continue;
                                                            }
                                                            int cfr_ignored_48 = Integer.rotateLeft(0x4BDB9625 ^ n5, 12) - 871681462;
                                                            int cfr_ignored_49 = (int)(0x8969381827D4EB4FL ^ (long)n5 ^ 0x8D40831A2DB8BF03L);
                                                            try {
                                                                n4 -= 2;
                                                                if ((0x3439F4C3CB9E9847L ^ (long)n5 | 1L) == 0L) {
                                                                    throw new IllegalArgumentException();
                                                                }
                                                                n6 = Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5);
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                n6 = Integer.reverse(Integer.reverse(Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5)));
                                                            }
                                                            ++n4;
                                                            continue;
                                                        }
                                                        int cfr_ignored_50 = (Integer.rotateRight(0x79D51E93 ^ n5, 18) + -986950904) * 2044010131;
                                                        n6 = Integer.reverse(n5 ^ 0xDD5100FC ^ 0x8D974DA5) + 373037736 - 373037736;
                                                        int cfr_ignored_51 = (Integer.rotateLeft(0x6EFCFDD4 ^ n5, 16) - 1962957799) * 1862073813;
                                                        n6 = Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5) ^ 0xEC851A5 ^ 0xEC851A5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_52 = Integer.rotateRight(0x559F086B ^ n5, 13) + 1654629424;
                                                    n6 = Integer.reverse(Integer.reverse(Integer.reverse(n5 ^ 0x6AB1EF94 ^ 0x8D974DA5)));
                                                    int cfr_ignored_53 = Integer.rotateRight(0xFBC4C78A ^ n5, 18) + -2127443727;
                                                    try {
                                                        if ((0xCF2EC84963D4310DL ^ (long)n5 | 1L) == 0L) {
                                                            throw new IllegalArgumentException();
                                                        }
                                                        n6 = (int)((long)Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5) ^ 0xEF8AEC7B957ECE91L ^ 0xEF8AEC7B957ECE91L);
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        n6 = Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5);
                                                    }
                                                    continue;
                                                }
                                                int cfr_ignored_54 = (Integer.rotateLeft(0x4896E854 ^ n5, 12) - -828128921) * 1217849429;
                                                try {
                                                    n4 -= 3;
                                                    if ((0x918086A7602DD3DDL ^ (long)n5 | 1L) == 0L) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    n6 = Integer.reverse(Integer.reverse(Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5)));
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    n6 = (int)((long)Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5) ^ 0xE98A2A344873D262L ^ 0xE98A2A344873D262L);
                                                }
                                                continue;
                                            }
                                            int cfr_ignored_55 = (Integer.rotateRight(0xFD7D16B7 ^ n5, 18) - -1232904348) * -42133833;
                                            n6 = Integer.reverse(n5 ^ 0x42D736E2 ^ 0x8D974DA5) + 1959876885 - 1959876885;
                                            int cfr_ignored_56 = Integer.rotateRight(0xD8C373AB ^ n5, 14) + 1141416176;
                                            int cfr_ignored_57 = (int)(0x15B5102F8F1054A5L ^ (long)n5 ^ 0xDD2FD293526D86BBL);
                                            n6 = (int)((long)Integer.reverse(n5 ^ 0x8EC685A8 ^ 0x8D974DA5) ^ 0x27FBD229570E79E4L ^ 0x27FBD229570E79E4L);
                                            int cfr_ignored_58 = (int)(0x2C1B9CD89A77D10EL ^ (long)n5 ^ 0xC4C1F85C593BF5E6L);
                                            n6 = Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5);
                                            n4 += 4;
                                            continue;
                                        }
                                        int cfr_ignored_59 = Integer.rotateRight(0x92281E6A ^ n5, 5) + -1220981231;
                                        n6 = (int)((long)Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5) ^ 0x8DC7C11ADDF0AB46L ^ 0x8DC7C11ADDF0AB46L);
                                        n4 += 2;
                                        continue;
                                    }
                                    int cfr_ignored_60 = (Integer.rotateLeft(0x5D2172D0 ^ n5, 14) + 1265272427) * 1562473169;
                                    n6 = Integer.reverse(Integer.reverse(Integer.reverse(n5 ^ 0x3BF9D7E5 ^ 0x8D974DA5)));
                                    int cfr_ignored_61 = (Integer.rotateLeft(0x56432F99 ^ n5, 13) + 1988125378) * 1447243673;
                                    int cfr_ignored_62 = (int)(0x94F181A427D4EB4FL ^ (long)n5 ^ 0xFE38831A2DB88432L);
                                    try {
                                        n4 += 2;
                                        if ((0x98E565A241407609L ^ (long)n5 | 1L) == 0L) {
                                            throw new IllegalStateException();
                                        }
                                        n6 = Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5) ^ 0xAD14939F ^ 0xAD14939F;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        n6 = Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5) + 1670104436 - 1670104436;
                                    }
                                    n4 -= 5;
                                    continue;
                                }
                                int cfr_ignored_63 = (Integer.rotateLeft(0x9C2A391D ^ n5, 6) - -310736450) * -1674954467;
                                int cfr_ignored_64 = (int)(0x5E98972027D4EB4FL ^ (long)n5 ^ 0xD330831A2DB910E0L);
                                n6 = Integer.reverse(Integer.reverse(Integer.reverse(n5 ^ 0xDD73B98B ^ 0x8D974DA5)));
                                int cfr_ignored_65 = (Integer.rotateLeft(0xAEB6F11 ^ n5, 4) + 1457525322) * 183201553;
                                int cfr_ignored_66 = (int)(0xC859C12C27D4EB4FL ^ (long)n5 ^ 0x7F28831A2DB83D62L);
                                n6 = Integer.reverse(n5 ^ 0x51E87278 ^ 0x8D974DA5) ^ 0xBC79CABB ^ 0xBC79CABB;
                                int cfr_ignored_67 = Integer.rotateRight(0xC5ED0502 ^ n5, 11) + -65979783;
                                n6 = Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5) ^ 0xAE0A8A01 ^ 0xAE0A8A01;
                                --n4;
                                continue;
                            }
                            int cfr_ignored_68 = (Integer.rotateLeft(0x9CD2C334 ^ n5, 6) - 31670919) * -1663909067;
                            try {
                                if ((0x8624C56D2D16345BL ^ (long)n5 | 1L) == 0L) {
                                    throw new UnsupportedOperationException();
                                }
                                n6 = Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5) ^ 0xEA978ED5 ^ 0xEA978ED5;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                n6 = Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5) + 1533126221 - 1533126221;
                            }
                            n4 += 4;
                            continue;
                        }
                        int cfr_ignored_69 = (Integer.rotateRight(0x539F67D2 ^ n5, 13) + 615199145) * 1402955731;
                        int cfr_ignored_70 = (int)(0x8AC1A44989D53ADDL ^ (long)n5 ^ 0xB5E3DF198E9CB852L);
                        n6 = (int)((long)Integer.reverse(n5 ^ 0xAB34389C ^ 0x8D974DA5) ^ 0x955E82A9ADE33561L ^ 0x955E82A9ADE33561L);
                        int cfr_ignored_71 = (int)(0x55F30AC20CC03EB8L ^ (long)n5 ^ 0xE8F4D53386570637L);
                        n6 = Integer.reverse(Integer.reverse(Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5)));
                        continue;
                    }
                    int cfr_ignored_72 = Integer.rotateRight(0xD32E088B ^ n5, 13) + -1762613232;
                    n6 = Integer.reverse(n5 ^ 0xD5EF3163 ^ 0x8D974DA5) + 339549146 - 339549146;
                    int cfr_ignored_73 = Integer.rotateLeft(0x24AFC3AC ^ n5, 7) - 1973833999;
                    try {
                        if ((0xBF6DAE0D401FBF03L ^ (long)n5 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n6 = Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5) + 656345232 - 656345232;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n6 = Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5);
                    }
                    continue;
                }
                int cfr_ignored_74 = (Integer.rotateRight(0xC02D9A16 ^ n5, 11) - 1239631845) * -1070753257;
                n6 = Integer.reverse(Integer.reverse(Integer.reverse(n5 ^ 0x6A5BC4E2 ^ 0x8D974DA5)));
                int cfr_ignored_75 = (Integer.rotateRight(0xFB4C4133 ^ n5, 18) + 1922663528) * -78888653;
                n6 = Integer.reverse(n5 ^ 0x7AB3B449 ^ 0x8D974DA5);
                int cfr_ignored_76 = (Integer.rotateLeft(0x76C11DBD ^ n5, 17) - 1707096350) * 1992367549;
                int cfr_ignored_77 = (int)(0xB473B38027D4EB4FL ^ (long)n5 ^ 0x9A70831A2DB8C536L);
                n6 = Integer.reverse(Integer.reverse(Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5)));
                n4 += 4;
                continue;
            }
            int cfr_ignored_78 = (Integer.rotateRight(0x4AF79C3B ^ n5, 12) + 408521312) * 1257741371;
            n6 = Integer.reverse(n5 ^ 0xB360E8A5 ^ 0x8D974DA5) ^ 0xFED256AB ^ 0xFED256AB;
        }
    }

    private static float bshw(List list, int[] nArray, int n, int n2, float[] fArray, float[] fArray2, float[] fArray3, float[] fArray4, float[] fArray5, float[] fArray6, float[] fArray7, float[] fArray8) {
        double d = 0.0;
        int n3 = n + n2;
        for (int i = n; i < n3; ++i) {
            tzl tzl2 = (tzl)list.get(nArray[i]);
            btdh_2.dqt_3(tzl2.ghzsh_2(), fArray, fArray2, fArray3, fArray4, fArray5, fArray6, fArray7, fArray8);
            float f = fArray8[0] - tzl2.sts();
            float f2 = fArray8[1] - tzl2.ghza_3();
            d += (double)(f * f + f2 * f2);
        }
        return (float)(d / (double)(n2 * 2));
    }

    private static void aghkh(float[] fArray, float[] fArray2, za_2 za2_2, int n, float f, long l, float f2) {
        double d = 1.0 - Math.pow(0.9, l);
        double d2 = 1.0 - Math.pow(0.999, l);
        float f3 = 1.0f / (float)n;
        int n2 = 0;
        while (n2 < fArray.length) {
            float f4 = fArray2[n2] * f3 + f2 * fArray[n2];
            za2_2.jjw[n2] = 0.9f * za2_2.jjw[n2] + 0.1f * f4;
            za2_2.hjt[n2] = 0.999f * za2_2.hjt[n2] + 0.001f * f4 * f4;
            double d3 = (double)za2_2.jjw[n2] / d;
            double d4 = (double)za2_2.hjt[n2] / d2;
            int n3 = n2++;
            fArray[n3] = fArray[n3] - f * (float)(d3 / (Math.sqrt(d4) + 1.0E-8));
        }
    }

    private static float[] dhdj_2(List list, int[] nArray, int n) {
        double[] dArray = new double[22];
        for (int i = 0; i < n; ++i) {
            float[] fArray = ((tzl)list.get(nArray[i])).ghzsh_2();
            for (int j = 0; j < 22; ++j) {
                int n2 = j;
                dArray[n2] = dArray[n2] + (double)fArray[j];
            }
        }
        float[] fArray = new float[22];
        for (int i = 0; i < 22; ++i) {
            fArray[i] = (float)(dArray[i] / (double)n);
        }
        return fArray;
    }

    private static float[] thqz(List list, int[] nArray, int n, float[] fArray) {
        double[] dArray = new double[22];
        for (int i = 0; i < n; ++i) {
            float[] fArray2 = ((tzl)list.get(nArray[i])).ghzsh_2();
            int n2 = 0;
            while (n2 < 22) {
                double d = fArray2[n2] - fArray[n2];
                int n3 = n2++;
                dArray[n3] = dArray[n3] + d * d;
            }
        }
        float[] fArray3 = new float[22];
        for (int i = 0; i < 22; ++i) {
            double d = Math.sqrt(dArray[i] / (double)Math.max(1, n - 1));
            fArray3[i] = d < 1.0E-4 ? 1.0f : (float)(1.0 / d);
        }
        return fArray3;
    }

    private static float[] khqt_2(List list, int[] nArray, int n) {
        double d = 0.0;
        double d2 = 0.0;
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            tzl tzl2 = (tzl)list.get(nArray[i]);
            float f = Math.abs(tzl2.sts() * 90.0f);
            float f2 = Math.abs(tzl2.ghza_3() * 45.0f);
            if (!(f > 0.05f) && !(f2 > 0.05f)) continue;
            d += (double)f;
            d2 += (double)f2;
            ++n2;
        }
        if (n2 == 0) {
            return new float[]{30.0f, 18.0f};
        }
        return new float[]{btdh_2.btw((float)(d / (double)n2) * 2.5f, 8.0f, 90.0f), btdh_2.btw((float)(d2 / (double)n2) * 2.5f, 5.0f, 60.0f)};
    }

    private static int[] ghty_2(int n, SplittableRandom splittableRandom) {
        int n2 = bss_4.hdhgh(115475591);
        n2 = n ^ n2;
        SplittableRandom splittableRandom2 = splittableRandom;
        n2 = Integer.rotateRight((splittableRandom2 != null ? System.identityHashCode(splittableRandom2) : 0) ^ n2, 11);
        int n3 = n2 ^ 0xB17E72CD;
        if ((n3 ^ n2) != -1317113139) {
            int cfr_ignored_0 = Integer.rotateRight(0xB79C764A ^ n2, 9) + 1078981169;
        }
        int[] nArray = new int[n];
        for (int i = 0; i < n; ++i) {
            nArray[i] = i;
        }
        btdh_2.ths_3(nArray, n, splittableRandom);
        return nArray;
    }

    private static void ths_3(int[] nArray, int n, SplittableRandom splittableRandom) {
        try {
            int n2 = 1942659602;
            n2 = Integer.rotateLeft(n2 * -1449377505, 28) ^ 0x7CF97D12;
            n2 = (nArray != null ? System.identityHashCode(nArray) : 0) ^ n2;
            n2 = n ^ n2;
            int n3 = n2 ^ 0x43B38310;
            if ((n3 ^ n2) != 1135837968) {
                int cfr_ignored_0 = (0x30792102 ^ n2) + 1605433907;
            }
            if ((0x1C0 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            btdh_2.azt_3();
        }
        for (int i = n - 1; i > 0; --i) {
            int n4 = splittableRandom.nextInt(i + 1);
            int n5 = nArray[i];
            nArray[i] = nArray[n4];
            nArray[n4] = n5;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void akhm(float[] var0, SplittableRandom var1_1, float var2_2) {
        var3_3 = 0;
        var6_4 = 0;
        var4_5 = -1548506555;
        var4_5 = Integer.rotateLeft(var4_5 * 2022002559, 12) ^ -51266647;
        var4_5 = Integer.rotateRight((var0 != null ? System.identityHashCode(var0) : 0) ^ var4_5, 14);
        v0 = var1_1;
        var4_5 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var4_5;
        var5_6 = Integer.reverse(Integer.reverse(Integer.reverse(var4_5 ^ -776732862 ^ -392012106)));
        while (true) {
            block34: {
                block30: {
                    block31: {
                        block32: {
                            block39: {
                                block35: {
                                    block36: {
                                        block42: {
                                            block41: {
                                                block37: {
                                                    block40: {
                                                        block33: {
                                                            block38: {
                                                                var6_4 = Integer.reverse(var5_6) ^ var4_5 ^ -392012106;
                                                                switch (var6_4 & 7) {
                                                                    case 5: {
                                                                        if (var6_4 == -1377447595) break block30;
                                                                        if (var6_4 == 1260040205) break block31;
                                                                        if (var6_4 != 1494742325) {
                                                                            ** break;
                                                                        }
                                                                        break block32;
                                                                    }
                                                                    case 1: {
                                                                        if (var6_4 != 600321209) {
                                                                            ** break;
                                                                        }
                                                                        break block33;
                                                                    }
                                                                    case 7: {
                                                                        if (var6_4 == -1768654169) break;
                                                                        if (var6_4 == 127388879) break block34;
                                                                        Integer.rotateLeft(-106708244 ^ var4_5, 18) - 1060256207;
                                                                        if (var6_4 != 1236545519) {
                                                                            ** break;
                                                                        }
                                                                        break block35;
                                                                    }
                                                                    case 4: {
                                                                        if (var6_4 != 1008028860) {
                                                                            ** break;
                                                                        }
                                                                        break block36;
                                                                    }
                                                                    case 2: {
                                                                        if (var6_4 == -1255083310) break block37;
                                                                        if (var6_4 == -776732862) break block38;
                                                                        (Integer.rotateRight(-969391014 ^ var4_5, 11) + 86894113) * -969391013;
                                                                        if (var6_4 == -306806622) break block39;
                                                                        if (var6_4 != -701545678) {
                                                                            ** break;
                                                                        }
                                                                        break block40;
                                                                    }
                                                                    case 0: {
                                                                        if (var6_4 != 1731727376) {
                                                                            ** break;
                                                                        }
                                                                        break block41;
                                                                    }
                                                                    case 6: {
                                                                        if (var6_4 != 1190898166) {
                                                                            ** break;
                                                                        }
                                                                        break block42;
                                                                    }
                                                                }
                                                                (Integer.rotateRight(-694059073 ^ var4_5, 13) - 32249692) * -694059073;
                                                                var0[var3_3] = (float)var1_1.nextDouble(-var2_2, var2_2);
                                                                ++var3_3;
                                                                var5_6 = (int)((long)Integer.reverse(var4_5 ^ -701545678 ^ -392012106) ^ 2141827658241108512L ^ 2141827658241108512L);
                                                                --var6_4;
                                                                continue;
                                                            }
                                                            bss_4.ddhd(1905577472, var4_5);
                                                            (int)(-1178896670108517355L ^ (long)var4_5 ^ -7925717251082390890L);
                                                            var3_3 = 0;
                                                            var5_6 = Integer.reverse(var4_5 ^ -720645134 ^ -392012106) + -1206289471 - -1206289471;
                                                            (Integer.rotateRight(-357032749 ^ var4_5, 16) + 1890131144) * -357032749;
                                                            var5_6 = (int)((long)Integer.reverse(var4_5 ^ -701545678 ^ -392012106) ^ -3494011378830550630L ^ -3494011378830550630L);
                                                            var6_4 -= 4;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(245950651 ^ var4_5, 4) + -892219936) * 245950651;
                                                        return;
                                                    }
                                                    (Integer.rotateLeft(272126801 ^ var4_5, 5) + -80759286) * 272126801;
                                                    (int)(-3275527137992053937L ^ (long)var4_5 ^ 551835102812309700L);
                                                    if (var3_3 >= var0.length) {
                                                        (int)(6939019717107524910L ^ (long)var4_5 ^ 5631421427681553737L);
                                                        var5_6 = (int)((long)Integer.reverse(var4_5 ^ 1047478455 ^ -392012106) ^ 6733589902430546874L ^ 6733589902430546874L);
                                                        (int)(-7461587260797695699L ^ (long)var4_5 ^ -4132602867423077065L);
                                                        var5_6 = (int)((long)Integer.reverse(var4_5 ^ 600321209 ^ -392012106) ^ 497759616038130470L ^ 497759616038130470L);
                                                        var6_4 -= 5;
                                                        continue;
                                                    }
                                                    var5_6 = Integer.reverse(var4_5 ^ 287167385 ^ -392012106) + -758338149 - -758338149;
                                                    (Integer.rotateRight(1973910815 ^ var4_5, 17) - 1134937596) * 1973910815;
                                                    var5_6 = Integer.reverse(Integer.reverse(Integer.reverse(var4_5 ^ -1768654169 ^ -392012106)));
                                                    var6_4 += 5;
                                                    continue;
                                                }
                                                Integer.rotateRight(-1516489905 ^ var4_5, 7) - 306697676;
                                                try {
                                                    var6_4 += 2;
                                                    if ((1312283808063589331L ^ (long)var4_5 | 1L) == 0L) {
                                                        throw new IllegalStateException();
                                                    }
                                                    var5_6 = Integer.reverse(Integer.reverse(Integer.reverse(var4_5 ^ -776732862 ^ -392012106)));
                                                }
                                                catch (IllegalStateException v1) {
                                                    var5_6 = Integer.reverse(var4_5 ^ -776732862 ^ -392012106) ^ -451671485 ^ -451671485;
                                                }
                                                continue;
                                            }
                                            (Integer.rotateLeft(1698799092 ^ var4_5, 15) - 1196408775) * 1698799093;
                                            try {
                                                --var6_4;
                                                if ((4712173210862306337L ^ (long)var4_5 | 1L) == 0L) {
                                                    throw new ArithmeticException();
                                                }
                                                var5_6 = Integer.reverse(var4_5 ^ -776732862 ^ -392012106) ^ 1100161561 ^ 1100161561;
                                            }
                                            catch (ArithmeticException v2) {
                                                var5_6 = Integer.reverse(Integer.reverse(Integer.reverse(var4_5 ^ -776732862 ^ -392012106)));
                                            }
                                            --var6_4;
                                            continue;
                                        }
                                        Integer.rotateLeft(-1795950367 ^ var4_5, 5) + 233357946;
                                        (int)(6215344464309054287L ^ (long)var4_5 ^ 5821046666835853651L);
                                        var5_6 = Integer.reverse(var4_5 ^ 2046342668 ^ -392012106) ^ 1947878292 ^ 1947878292;
                                        Integer.rotateLeft(-1801779412 ^ var4_5, 5) - 52657551;
                                        (int)(2409470908304537439L ^ (long)var4_5 ^ -5801717201897918671L);
                                        var5_6 = Integer.reverse(var4_5 ^ -776732862 ^ -392012106);
                                        continue;
                                    }
                                    Integer.rotateRight(-2057826294 ^ var4_5, 3) + 705138801;
                                    var5_6 = Integer.reverse(var4_5 ^ -776732862 ^ -392012106) + 659931159 - 659931159;
                                    var6_4 += 5;
                                    continue;
                                }
                                Integer.rotateLeft(1413175468 ^ var4_5, 13) - 932011023;
                                var5_6 = Integer.reverse(var4_5 ^ -658229540 ^ -392012106) + 452913527 - 452913527;
                                Integer.rotateRight(284948807 ^ var4_5, 5) - 316722900;
                                var5_6 = Integer.reverse(var4_5 ^ -1065225233 ^ -392012106);
                                bss_4.ddhd(-1386907360, var4_5);
                                (int)(3702522502917553173L ^ (long)var4_5 ^ -269597884552459499L);
                                var5_6 = Integer.reverse(Integer.reverse(Integer.reverse(var4_5 ^ -776732862 ^ -392012106)));
                                var6_4 += 3;
                                continue;
                            }
                            bss_4.ddhd(572794080, var4_5);
                            (int)(-4894465731052536811L ^ (long)var4_5 ^ 5170750465311036919L);
                            var5_6 = Integer.reverse(var4_5 ^ 1689319423 ^ -392012106) + -1054849014 - -1054849014;
                            Integer.rotateRight(-1720656241 ^ var4_5, 6) - -1727491444;
                            (int)(-1334165096698250101L ^ (long)var4_5 ^ -3268668208995862743L);
                            var5_6 = Integer.reverse(Integer.reverse(Integer.reverse(var4_5 ^ -776732862 ^ -392012106)));
                            continue;
                        }
                        Integer.rotateRight(-1098297786 ^ var4_5, 10) - 385751477;
                        var5_6 = (int)((long)Integer.reverse(var4_5 ^ 1171310439 ^ -392012106) ^ -7089561449570939024L ^ -7089561449570939024L);
                        (Integer.rotateRight(859089334 ^ var4_5, 9) - 935210053) * 859089335;
                        try {
                            var6_4 += 3;
                            if ((8145476759556742925L ^ (long)var4_5 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            var5_6 = Integer.reverse(Integer.reverse(Integer.reverse(var4_5 ^ -776732862 ^ -392012106)));
                        }
                        catch (NoSuchElementException v3) {
                            var5_6 = Integer.reverse(Integer.reverse(Integer.reverse(var4_5 ^ -776732862 ^ -392012106)));
                        }
                        continue;
                    }
                    Integer.rotateRight(-1946320849 ^ var4_5, 4) - -133159700;
                    try {
                        var6_4 += 2;
                        if ((1380235489686947041L ^ (long)var4_5 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var5_6 = Integer.reverse(var4_5 ^ -776732862 ^ -392012106) + 865908903 - 865908903;
                    }
                    catch (ArithmeticException v4) {
                        var5_6 = Integer.reverse(var4_5 ^ -776732862 ^ -392012106) ^ -1451780924 ^ -1451780924;
                    }
                    var6_4 += 5;
                    continue;
                }
                Integer.rotateRight(-921083262 ^ var4_5, 12) + 1584434425;
                var5_6 = Integer.reverse(var4_5 ^ -358216437 ^ -392012106) ^ -688031446 ^ -688031446;
                (Integer.rotateRight(-1889331042 ^ var4_5, 4) - 1633524317) * -1889331041;
                var5_6 = Integer.reverse(var4_5 ^ -776732862 ^ -392012106) + -346904526 - -346904526;
                (Integer.rotateLeft(-1742801700 ^ var4_5, 6) - 1880966623) * -1742801699;
                var6_4 -= 5;
                continue;
            }
            (Integer.rotateRight(312275094 ^ var4_5, 5) - 1163837797) * 312275095;
            var5_6 = Integer.reverse(Integer.reverse(Integer.reverse(var4_5 ^ -776732862 ^ -392012106)));
            var6_4 += 5;
            continue;
lbl208:
            // 8 sources

            (Integer.rotateRight(1779093207 ^ var4_5, 16) - -609440956) * 1779093207;
            var5_6 = Integer.reverse(Integer.reverse(Integer.reverse(var4_5 ^ -776732862 ^ -392012106)));
        }
    }

    private static void tdhgh() {
        int n = 0;
        int n2 = 1102180432;
        n2 = Integer.rotateLeft(n2 * -686397603, 16) ^ 0x1EBFACE7;
        int n3 = (n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619 ^ 0x3D98732A ^ 0x3D98732A;
        while (true) {
            block21: {
                block24: {
                    block35: {
                        block32: {
                            block26: {
                                block20: {
                                    block28: {
                                        block30: {
                                            block25: {
                                                block18: {
                                                    block34: {
                                                        block29: {
                                                            block23: {
                                                                block33: {
                                                                    block19: {
                                                                        block31: {
                                                                            block27: {
                                                                                block16: {
                                                                                    block22: {
                                                                                        block17: {
                                                                                            if ((n = n3 - 1741095619 ^ 0x67C702C3 ^ n2) > -78168801) break block16;
                                                                                            if (n > -559516290) break block17;
                                                                                            if (n == -1875200239) break block18;
                                                                                            if (n == -1385706105) break block19;
                                                                                            if (n == -559516290) break block20;
                                                                                            break block21;
                                                                                        }
                                                                                        if (n > -344150913) break block22;
                                                                                        if (n == -403248899) break block23;
                                                                                        if (n == -344150913) break block24;
                                                                                        int cfr_ignored_0 = Integer.rotateRight(0xE525C06A ^ n2, 15) + -1007686639;
                                                                                        break block21;
                                                                                    }
                                                                                    if (n == -170817991) break block25;
                                                                                    if (n == -78168801) break block26;
                                                                                    int cfr_ignored_1 = (Integer.rotateLeft(0x87F4CEF5 ^ n2, 3) - 2063773414) * -2013999371;
                                                                                    int cfr_ignored_2 = (int)(0x454660C827D4EB4FL ^ (long)n2 ^ 0x3CE0831A2DB9275DL);
                                                                                    break block21;
                                                                                }
                                                                                if (n > 1089218741) break block27;
                                                                                if (n == 21163995) break block28;
                                                                                if (n == 934899197) break block29;
                                                                                int cfr_ignored_3 = (Integer.rotateLeft(0x8190285D ^ n2, 3) - -1261272450) * -2121258915;
                                                                                int cfr_ignored_4 = (int)(0x4322866027D4EB4FL ^ (long)n2 ^ 0xF1B0831A2DB92B94L);
                                                                                if (n == 1089218741) break block30;
                                                                                break block21;
                                                                            }
                                                                            if (n > 1698068337) break block31;
                                                                            if (n == 1511070806) break block32;
                                                                            if (n == 1698068337) break block33;
                                                                            int cfr_ignored_5 = (Integer.rotateLeft(0xA7DAC799 ^ n2, 7) + 1474022082) * -1478834279;
                                                                            int cfr_ignored_6 = (int)(0x656869A427D4EB4FL ^ (long)n2 ^ 0x2E38831A2DB96701L);
                                                                            break block21;
                                                                        }
                                                                        if (n == 2020189156) break block34;
                                                                        if (n == 2100094090) break block35;
                                                                        int cfr_ignored_7 = (Integer.rotateLeft(0x3DE048BD ^ n2, 10) - -2105119202) * 1038108861;
                                                                        int cfr_ignored_8 = (int)(0xFF52E68027D4EB4FL ^ (long)n2 ^ 0x3070831A2DB85374L);
                                                                        break block21;
                                                                    }
                                                                    int cfr_ignored_9 = Integer.rotateRight(0xB841883 ^ n2, 4) + 1767675672;
                                                                    if (!Thread.currentThread().isInterrupted()) {
                                                                        int cfr_ignored_10 = (int)(0x60379C318B8513E5L ^ (long)n2 ^ 0xC513DBB9DCED6DBEL);
                                                                        n3 = (n2 ^ 0x98EC58B0 ^ 0x67C702C3) + 1741095619 + 355138863 - 355138863;
                                                                        int cfr_ignored_11 = (int)(0xABD3CAF0869854DBL ^ (long)n2 ^ 0x6891C1835290FA76L);
                                                                        n3 = (n2 ^ 0xE7F6E8FD ^ 0x67C702C3) + 1741095619 ^ 0x2DE07481 ^ 0x2DE07481;
                                                                        n += 2;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        n -= 5;
                                                                        if ((0xE77218AB495F175BL ^ (long)n2 | 1L) == 0L) {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x65367771 ^ 0x67C702C3) + 1741095619));
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        n3 = (n2 ^ 0x65367771 ^ 0x67C702C3) + 1741095619 + -1334717642 - -1334717642;
                                                                    }
                                                                    ++n;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_12 = (Integer.rotateRight(0x2F9CC9D6 ^ n2, 8) - -933621723) * 798804439;
                                                                throw new CancellationException("Neuro train".concat("ing cancelled"));
                                                            }
                                                            int cfr_ignored_13 = Integer.rotateLeft(0x8040AFC0 ^ n2, 3) + -1942820997;
                                                            return;
                                                        }
                                                        int cfr_ignored_14 = (Integer.rotateRight(0x7B24375E ^ n2, 18) - -306162787) * 2065971039;
                                                        n3 = (n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619 ^ 0x6F203BF2 ^ 0x6F203BF2;
                                                        int cfr_ignored_15 = (Integer.rotateRight(0x535217D7 ^ n2, 13) - 458129988) * 1397888983;
                                                        n += 3;
                                                        continue;
                                                    }
                                                    int cfr_ignored_16 = Integer.rotateRight(0x3ACA1E63 ^ n2, 10) + 584535352;
                                                    n3 = (n2 ^ 0x28874F8 ^ 0x67C702C3) + 1741095619 + -553298611 - -553298611;
                                                    int cfr_ignored_17 = (Integer.rotateLeft(0x62FE7E78 ^ n2, 15) + 19853251) * 1660845689;
                                                    int cfr_ignored_18 = (int)(0x8B486198CFC01CCL ^ (long)n2 ^ 0xF143D54BF8BFBCB8L);
                                                    n3 = (int)((long)((n2 ^ 0xE75C21B7 ^ 0x67C702C3) + 1741095619) ^ 0xB0B1BF37527E39A4L ^ 0xB0B1BF37527E39A4L);
                                                    int cfr_ignored_19 = (int)(0x428ABFEED9625958L ^ (long)n2 ^ 0x82AD7E77499728C4L);
                                                    n3 = (int)((long)((n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619) ^ 0x685F71D124202796L ^ 0x685F71D124202796L);
                                                    ++n;
                                                    continue;
                                                }
                                                int cfr_ignored_20 = Integer.rotateRight(0x38F5B2EE ^ n2, 10) - -367113715;
                                                n3 = (n2 ^ 0x6402545B ^ 0x67C702C3) + 1741095619;
                                                int cfr_ignored_21 = Integer.rotateRight(0xA628CB0B ^ n2, 7) + 592328080;
                                                n3 = Integer.reverse(Integer.reverse((n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619));
                                                n -= 4;
                                                continue;
                                            }
                                            int cfr_ignored_22 = (Integer.rotateLeft(0x703BF6F1 ^ n2, 17) + -1683978646) * 1882978033;
                                            int cfr_ignored_23 = (int)(0xB28958CC27D4EB4FL ^ (long)n2 ^ 0x4CE8831A2DB8C8C3L);
                                            try {
                                                if ((0x26E297C10E6EAF37L ^ (long)n2 | 1L) == 0L) {
                                                    throw new IllegalArgumentException();
                                                }
                                                n3 = (n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619 ^ 0xFDA4F1A4 ^ 0xFDA4F1A4;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                n3 = (int)((long)((n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619) ^ 0xD3889B36B0577909L ^ 0xD3889B36B0577909L);
                                            }
                                            continue;
                                        }
                                        int cfr_ignored_24 = Integer.rotateRight(0x252D9842 ^ n2, 7) + -2065494215;
                                        n3 = (int)((long)((n2 ^ 0xEF032136 ^ 0x67C702C3) + 1741095619) ^ 0x79B8B75454C2D889L ^ 0x79B8B75454C2D889L);
                                        int cfr_ignored_25 = (Integer.rotateRight(0xC659D73E ^ n2, 11) - 155103165) * -967190721;
                                        n3 = (n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619 + 2038465836 - 2038465836;
                                        n -= 5;
                                        continue;
                                    }
                                    int cfr_ignored_26 = Integer.rotateLeft(0xADE1AA88 ^ n2, 8) + 313607603;
                                    n3 = (n2 ^ 0xDAEDB07B ^ 0x67C702C3) + 1741095619 ^ 0x8DF15747 ^ 0x8DF15747;
                                    int cfr_ignored_27 = Integer.rotateLeft(0x46A201A0 ^ n2, 11) + -1845767781;
                                    n3 = (n2 ^ 0x11CABC27 ^ 0x67C702C3) + 1741095619 + -343140641 - -343140641;
                                    int cfr_ignored_28 = (Integer.rotateRight(0xD720F917 ^ n2, 13) - 291227908) * -685704937;
                                    n3 = (int)((long)((n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619) ^ 0xF51F264F8A598872L ^ 0xF51F264F8A598872L);
                                    n -= 5;
                                    continue;
                                }
                                int cfr_ignored_29 = Integer.rotateLeft(0x708A4C84 ^ n2, 17) - -1524833481;
                                n3 = Integer.reverse(Integer.reverse((n2 ^ 0x49B5AD02 ^ 0x67C702C3) + 1741095619));
                                int cfr_ignored_30 = Integer.rotateLeft(0x71F6E104 ^ n2, 17) - -784146761;
                                int cfr_ignored_31 = (int)(0x472A2899206A7A3BL ^ (long)n2 ^ 0xAC428C670F512385L);
                                n3 = (n2 ^ 0xA7009A40 ^ 0x67C702C3) + 1741095619 + -1288140626 - -1288140626;
                                int cfr_ignored_32 = (int)(0x578AA75F037158FBL ^ (long)n2 ^ 0xB3CECA514AD102C4L);
                                n3 = (n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619 ^ 0xC5542FFE ^ 0xC5542FFE;
                                n -= 3;
                                continue;
                            }
                            int cfr_ignored_33 = Integer.rotateLeft(0xB5C5B5E0 ^ n2, 9) + 122594651;
                            try {
                                --n;
                                if ((0x1D6B73E874B639CBL ^ (long)n2 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                n3 = (n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619 + 472692911 - 472692911;
                            }
                            catch (IllegalStateException illegalStateException) {
                                n3 = (n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619 + -1557772024 - -1557772024;
                            }
                            n -= 2;
                            continue;
                        }
                        int cfr_ignored_34 = (Integer.rotateRight(0x5AB6E2F3 ^ n2, 14) + 8592040) * 1521935091;
                        try {
                            n += 4;
                            if ((0x3C2480F3B8DD4F9FL ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = (n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619 ^ 0xDF7703FE ^ 0xDF7703FE;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619));
                        }
                        n += 5;
                        continue;
                    }
                    int cfr_ignored_35 = (Integer.rotateRight(0xE6345816 ^ n2, 15) - -457946651) * -432777193;
                    n3 = (n2 ^ 0x52593445 ^ 0x67C702C3) + 1741095619 ^ 0x2C6F7123 ^ 0x2C6F7123;
                    int cfr_ignored_36 = Integer.rotateLeft(0x95CCC5CC ^ n2, 5) - 673813231;
                    try {
                        n += 3;
                        n3 = (n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619 ^ 0xF5E7F39F ^ 0xF5E7F39F;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619 ^ 0x109A767F ^ 0x109A767F;
                    }
                    --n;
                    continue;
                }
                int cfr_ignored_37 = Integer.rotateRight(0xB7293E43 ^ n2, 9) + 844900696;
                n3 = (n2 ^ 0x67821701 ^ 0x67C702C3) + 1741095619 + 582424861 - 582424861;
                int cfr_ignored_38 = Integer.rotateRight(0xC1E4C00B ^ n2, 11) + 2131812496;
                n3 = (n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619 ^ 0x99766125 ^ 0x99766125;
                int cfr_ignored_39 = (Integer.rotateRight(0x7FE98E96 ^ n2, 18) - -2119834779) * 2146012823;
                n += 4;
                continue;
            }
            int cfr_ignored_40 = Integer.rotateLeft(0x3FB40741 ^ n2, 10) + -1154842598;
            int cfr_ignored_41 = (int)(0xFD06A97C27D4EB4FL ^ (long)n2 ^ 0xAF88831A2DB857DCL);
            n3 = (n2 ^ 0xAD67CD87 ^ 0x67C702C3) + 1741095619 ^ 0xAE0F499D ^ 0xAE0F499D;
        }
    }

    public void thl_2(DataOutput dataOutput) throws IOException {
        int n = -822942529;
        n = Integer.rotateLeft(n * -1171554575, 11) ^ 0x9D2622C3;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 9);
        DataOutput dataOutput2 = dataOutput;
        n = (dataOutput2 != null ? System.identityHashCode(dataOutput2) : 0) ^ n;
        int n2 = n ^ 0xCCC21536;
        if ((n2 ^ n) != -859695818) {
            int cfr_ignored_0 = (0x230F189 ^ n) + -854165162;
        }
        dataOutput.writeInt(Integer.reverse(-88514654) ^ 0x45FA9D49);
        dataOutput.writeInt(0xA092E1FF ^ 0xA092E1E7);
        btdh_2.dhhs_3(dataOutput, this.khthh_2);
        btdh_2.dhhs_3(dataOutput, this.sym);
        btdh_2.dhhs_3(dataOutput, this.dmt);
        btdh_2.khzth_2(dataOutput, this.thl);
        btdh_2.ddhth(dataOutput, this.znd);
        btdh_2.dhhs_3(dataOutput, this.jwth);
        dataOutput.writeInt(this.sjn);
        dataOutput.writeInt(this.dhthd);
        dataOutput.writeFloat(this.zsz_3);
        dataOutput.writeFloat(this.jdha);
        dataOutput.writeFloat(this.ztb);
    }

    public static btdh_2 drw(DataInput dataInput) throws IOException {
        int n = 781001466;
        int n2 = (n = Integer.rotateLeft(n * -1603452709, 16) ^ 0xE4F6FCB3) ^ 0x9451B591;
        if ((n2 ^ n) != -1806584431) {
            int cfr_ignored_0 = (0xBADC976B ^ n) + 534895290;
        }
        int n3 = dataInput.readInt();
        int n4 = dataInput.readInt();
        if (n3 != Integer.rotateLeft(0x9FFC35B2 ^ 0x9FFEF5B2, 19) || n4 != (btdh_2.sakh_3(-183399621) ^ 0xDCD188B7)) {
            throw new IOException("Unsupported Neuro model architecture");
        }
        float[] fArray = btdh_2.thtz_4(dataInput, Integer.rotateLeft(0x457EDDF ^ 0x47BEDDF, 15));
        float[] fArray2 = btdh_2.tbz_2(dataInput, Integer.rotateLeft(0x63954238 ^ 0x63834238, 16));
        float[] fArray3 = btdh_2.jr(dataInput, 46510802 - 46510274);
        float[] fArray4 = btdh_2.thtz_4(dataInput, Integer.reverse(-508968639) ^ 0x8283959F);
        float[] fArray5 = btdh_2.khsht_2(dataInput, Integer.rotateLeft(0x149E7D61 ^ 0x179E7D61, 12));
        float[] fArray6 = btdh_2.zya(dataInput, 2);
        int n5 = dataInput.readInt();
        int n6 = dataInput.readInt();
        float f = dataInput.readFloat();
        float f2 = dataInput.readFloat();
        float f3 = dataInput.readFloat();
        if (n5 < 0 || n6 < 0 || !Float.isFinite(f) || f < 0.0f || !Float.isFinite(f2) || f2 <= 0.0f || !Float.isFinite(f3) || f3 <= 0.0f) {
            throw new IOException(btdh_2.bss("頦堊᠗\ud817預堕᠑\ud845頫堀᠐\ud817頊塅", Integer.rotateLeft(0xD72E4AF4 ^ 0xAC4F11C0, 10), btdh_2.dhhb_2(0x3C008EAB ^ 0xBACACDD7, 12), Integer.rotateLeft(0xD8D01666 ^ 0xBCA4AA0E, 27)).concat("model metadata"));
        }
        return new btdh_2(fArray, fArray2, fArray3, fArray4, fArray5, fArray6, n5, n6, f, f2, f3);
    }

    private static void dhhs_3(DataOutput dataOutput, float[] fArray) throws IOException {
        int n = -585429531;
        int n2 = (n = Integer.rotateLeft(n * 1954534283, 28) ^ 0x1FB5D528) ^ 0x96F6D2E3;
        if ((n2 ^ n) != -1762209053) {
            int cfr_ignored_0 = (0x4BEDDF06 ^ n) - 1696281386;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        dataOutput.writeInt(fArray.length);
        for (float f : fArray) {
            dataOutput.writeFloat(f);
        }
    }

    private static float[] thtz_4(DataInput dataInput, int n) throws IOException {
        try {
            int n2 = 79718208;
            n2 = Integer.rotateLeft(n2 * -566227215, 10) ^ 0x77F3A25;
            int n3 = n2 ^ 0x38F8170A;
            if ((n3 ^ n2) != 955782922) {
                int cfr_ignored_0 = (0x3C38704A ^ n2) + 1167047994;
            }
            if ((0xD5 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        int n4 = dataInput.readInt();
        if (n4 != n) {
            throw new IOException(btdh_2.jla("Corrupt Neur", btdh_2.bss("쁲耽䁪x쁴聺䁵i쀽聼䁯o쁼聤", btdh_2.bthth(-86733162) ^ 0x624A62A8, 1371906568 + 1804611226, 1337163862 - 2145682298)));
        }
        float[] fArray = new float[n4];
        for (int i = 0; i < n4; ++i) {
            fArray[i] = dataInput.readFloat();
            if (btdh_2.shdb_2(fArray[i])) continue;
            throw new IOException("Non-finite valu".concat("e in Neuro model"));
        }
        return fArray;
    }

    public int jdhs() {
        block0: {
            int n = bss_4.hdhgh(-752093606);
            int n2 = n ^ 0x36B336BD;
            if ((n2 ^ n) == 917714621) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xE598C0E7 ^ n, 15) - -774046924;
        }
        return this.sjn;
    }

    public int zghw_2() {
        block0: {
            int n = -1868226944;
            n = Integer.rotateLeft(n * -1015550915, 8) ^ 0xD9F8CEF5;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x92252725;
            if ((n2 ^ n) == -1843058907) break block0;
            int cfr_ignored_0 = (0x28039A5 ^ n) + -214161527;
        }
        return this.dhthd;
    }

    public float ssha_3() {
        block0: {
            int n = bss_4.hdhgh(681624144);
            int n2 = n ^ 0xF0C01C86;
            if ((n2 ^ n) == -255845242) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xD860DED6 ^ n, 14) - 941136677) * -664740137;
        }
        return this.zsz_3;
    }

    public float ddd_6() {
        block0: {
            int n = -1457460441;
            n = Integer.rotateLeft(n * 387810929, 19) ^ 0x683CEC58;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xC98F26B5;
            if ((n2 ^ n) == -913365323) break block0;
            int cfr_ignored_0 = (0x60AFCD92 ^ n) - 1756047350;
        }
        return this.jdha;
    }

    public float tkl() {
        block0: {
            int n = bss_4.hdhgh(-340650165);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x97342D23;
            if ((n2 ^ n) == -1758188253) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x7C863A68 ^ n, 18) + 413053395;
        }
        return this.ztb;
    }

    public float zhj_2() {
        block0: {
            int n = bss_4.hdhgh(-1748309472);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x182F77F4;
            if ((n2 ^ n) == 405764084) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x8FE59DD4 ^ n, 4) - 1898691559) * -1880777259;
        }
        return this.th_5;
    }

    private static float btw(float f, float f2, float f3) {
        block0: {
            int n = bss_4.hdhgh(1156737356);
            n = Float.floatToIntBits(f) ^ n;
            n = Float.floatToIntBits(f3) ^ n;
            int n2 = n ^ 0x428FD84B;
            if ((n2 ^ n) == 1116723275) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x67DB107 ^ n, 3) - -845803756;
        }
        return Math.max(f2, Math.min(f3, f));
    }

    private static String bss(String string, int n, int n2, int n3) {
        try {
            int n4 = -943691203;
            n4 = Integer.rotateLeft(n4 * 1163092723, 15) ^ 0x832EF398;
            n4 = n ^ n4;
            n4 = n2 ^ n4;
            int n5 = n4 ^ 0x9916056D;
            if ((n5 ^ n4) != -1726610067) {
                int cfr_ignored_0 = (0x5ED66F50 ^ n4) + 445044587;
            }
            if ((0x397 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x6769E0BB) + i ^ thfkh, 18) ^ n2 + sjd_3));
        }
        return new String(cArray);
    }

    private static String rsd_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -586208411;
            n4 = Integer.rotateLeft(n4 * 342355499, 26) ^ 0x77273EBC;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 10);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 9)) ^ 0x27B31FE6;
            if ((n5 ^ n4) == 666050534) break block0;
            int cfr_ignored_0 = (0xFABC3483 ^ n4) - 511887668;
        }
        return btdh_2.bss(string, n, n2, n3);
    }

    private static int dym_2(int n, int n2) {
        block0: {
            int n3 = bss_4.hdhgh(572973408);
            int n4 = (n3 = n ^ n3) ^ 0x1145A4F5;
            if ((n4 ^ n3) == 289776885) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x33634595 ^ n3, 9) - 1029901382) * 862143893;
            int cfr_ignored_1 = (int)(0xF1D1EBA827D4EB4FL ^ (long)n3 ^ 0x2A20831A2DB84E72L);
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int dww(int n, int n2) {
        block0: {
            int n3 = -1466094784;
            n3 = Integer.rotateLeft(n3 * -172594903, 20) ^ 0x2B180498;
            n3 = Integer.rotateRight(n ^ n3, 14);
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 12)) ^ 0x54F1187E;
            if ((n4 ^ n3) == 1425086590) break block0;
            int cfr_ignored_0 = (0xFC6C333E ^ n3) + 1235376011;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String thth_6(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 408015562;
            n4 = Integer.rotateLeft(n4 * 1262749767, 26) ^ 0xE20A6597;
            n4 = n ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x3103C1F4;
            if ((n5 ^ n4) == 822329844) break block0;
            int cfr_ignored_0 = (0x2952133E ^ n4) - 1506292709;
        }
        return btdh_2.bss(string, n, n2, n3);
    }

    private static int hma(int n) {
        block0: {
            int n2 = bss_4.hdhgh(600843418);
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 4)) ^ 0x409E2CEA;
            if ((n3 ^ n2) == 1084108010) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x634E0870 ^ n2, 15) + 181445835) * 1666058353;
        }
        return Integer.reverse(n);
    }

    private static String tmh_3(String string, String string2) {
        block0: {
            int n = bss_4.hdhgh(-1702129901);
            String string3 = string;
            n = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 12);
            String string4 = string2;
            n = Integer.rotateRight((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 22);
            int n2 = n ^ 0x53B0C4BF;
            if ((n2 ^ n) == 1404093631) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xC93B4BAC ^ n, 12) - 1653328143;
        }
        return string.concat(string2);
    }

    private static float zwm(int n) {
        block0: {
            int n2 = 1999903872;
            n2 = Integer.rotateLeft(n2 * 631018165, 24) ^ 0x18BB590D;
            int n3 = (n2 = n ^ n2) ^ 0x51467431;
            if ((n3 ^ n2) == 1363571761) break block0;
            int cfr_ignored_0 = (0x267268B1 ^ n2) + -1502549612;
        }
        return Float.intBitsToFloat(n);
    }

    private static void jsdh_2() {
        int n = bss_4.hdhgh(-638757414);
        int n2 = n ^ 0x18788C68;
        if ((n2 ^ n) != 410553448) {
            int cfr_ignored_0 = (Integer.rotateRight(0xC195D9B2 ^ n, 11) + 1971518409) * -1047144013;
        }
        btdh_2.tdhgh();
    }

    private static void sshf_2(int[] nArray, int n, SplittableRandom splittableRandom) {
        int n2 = bss_4.hdhgh(-1526906121);
        int n3 = (n2 = n ^ n2) ^ 0x6EBCD771;
        if ((n3 ^ n2) != 1857869681) {
            int cfr_ignored_0 = Integer.rotateRight(0xCA419586 ^ n2, 12) - -2108769675;
        }
        btdh_2.ths_3(nArray, n, splittableRandom);
    }

    private static int jwm(int n, int n2) {
        block0: {
            int n3 = 1107696812;
            n3 = Integer.rotateLeft(n3 * 950428537, 22) ^ 0x404DDA10;
            n3 = n ^ n3;
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 18)) ^ 0x42EE949A;
            if ((n4 ^ n3) == 1122931866) break block0;
            int cfr_ignored_0 = (0xE88836 ^ n3) - -1317498288;
        }
        return Math.min(n, n2);
    }

    private static float[] dhsz_2(tzl tzl2) {
        block0: {
            int n = -1876049282;
            n = Integer.rotateLeft(n * 89283035, 3) ^ 0xF6AC977F;
            tzl tzl3 = tzl2;
            n = Integer.rotateLeft((tzl3 != null ? System.identityHashCode(tzl3) : 0) ^ n, 22);
            int n2 = n ^ 0xF2176C08;
            if ((n2 ^ n) == -233346040) break block0;
            int cfr_ignored_0 = (0x623AAE76 ^ n) + 1508297073;
        }
        return tzl2.ghzsh_2();
    }

    private static int thtz_3(int n) {
        block0: {
            int n2 = 151779534;
            n2 = Integer.rotateLeft(n2 * 1295215107, 9) ^ 0x44A27CAE;
            int n3 = (n2 = n ^ n2) ^ 0xB0370B0B;
            if ((n3 ^ n2) == -1338569973) break block0;
            int cfr_ignored_0 = (0xB93CF3C5 ^ n2) - 1913447959;
        }
        return Integer.reverse(n);
    }

    private static float tkh_2(int n) {
        block0: {
            int n2 = -889399962;
            int n3 = (n2 = Integer.rotateLeft(n2 * 496693933, 7) ^ 0xEC6853B0) ^ 0x1D120634;
            if ((n3 ^ n2) == 487720500) break block0;
            int cfr_ignored_0 = (0xD7EED352 ^ n2) + 443937326;
        }
        return Float.intBitsToFloat(n);
    }

    private static void szsh_2(float[] fArray, float[] fArray2, za_2 za2_2, int n, float f, long l, float f2) {
        int n2 = 749793532;
        n2 = Integer.rotateLeft(n2 * 1935949113, 17) ^ 0x9DC97087;
        n2 = (fArray2 != null ? System.identityHashCode(fArray2) : 0) ^ n2;
        za_2 za3 = za2_2;
        n2 = (za3 != null ? System.identityHashCode(za3) : 0) ^ n2;
        int n3 = n2 ^ 0x18DF348;
        if ((n3 ^ n2) != 26080072) {
            int cfr_ignored_0 = (0x2D3D03B4 ^ n2) + -1241579755;
        }
        btdh_2.aghkh(fArray, fArray2, za2_2, n, f, l, f2);
    }

    private static void dmth_2(float[] fArray, float[] fArray2, za_2 za2_2, int n, float f, long l, float f2) {
        int n2 = 1673471262;
        n2 = Integer.rotateLeft(n2 * -1394600553, 25) ^ 0x485F49A8;
        n2 = Integer.rotateRight((fArray != null ? System.identityHashCode(fArray) : 0) ^ n2, 28);
        za_2 za3 = za2_2;
        n2 = (za3 != null ? System.identityHashCode(za3) : 0) ^ n2;
        int n3 = n2 ^ 0x2407335C;
        if ((n3 ^ n2) != 604451676) {
            int cfr_ignored_0 = (0x47B81642 ^ n2) - -1877791451;
        }
        btdh_2.aghkh(fArray, fArray2, za2_2, n, f, l, f2);
    }

    private static float bgh(List list, int[] nArray, int n, int n2, float[] fArray, float[] fArray2, float[] fArray3, float[] fArray4, float[] fArray5, float[] fArray6, float[] fArray7, float[] fArray8) {
        block0: {
            int n3 = -1232892040;
            n3 = Integer.rotateLeft(n3 * -438201003, 19) ^ 0x1971E41C;
            n3 = (nArray != null ? System.identityHashCode(nArray) : 0) ^ n3;
            n3 = Integer.rotateLeft((fArray3 != null ? System.identityHashCode(fArray3) : 0) ^ n3, 15);
            int n4 = n3 ^ 0xE5734E22;
            if ((n4 ^ n3) == -445428190) break block0;
            int cfr_ignored_0 = (0x53F0C15A ^ n3) - -147763900;
        }
        return btdh_2.bshw(list, nArray, n, n2, fArray, fArray2, fArray3, fArray4, fArray5, fArray6, fArray7, fArray8);
    }

    private static float zdt_6(int n) {
        block0: {
            int n2 = 1756232098;
            n2 = Integer.rotateLeft(n2 * 184977979, 17) ^ 0x3BBC35F8;
            int n3 = (n2 = n ^ n2) ^ 0x4526EB5B;
            if ((n3 ^ n2) == 1160178523) break block0;
            int cfr_ignored_0 = (0x2D8B12F9 ^ n2) - -947801053;
        }
        return Float.intBitsToFloat(n);
    }

    private static void bsl(Object object, int n, Object object2, int n2, int n3) {
        int n4 = 304066226;
        n4 = Integer.rotateLeft(n4 * 295617547, 5) ^ 0x5D68F28F;
        n4 = n ^ n4;
        int n5 = (n4 = n2 ^ n4) ^ 0xA8C9F8FD;
        if ((n5 ^ n4) != -1463158531) {
            int cfr_ignored_0 = (0xBAD6564F ^ n4) - -294015422;
        }
        System.arraycopy(object, n, object2, n2, n3);
    }

    private static void blth(Object object, int n, Object object2, int n2, int n3) {
        int n4 = bss_4.hdhgh(2123020543);
        Object object3 = object;
        n4 = (object3 != null ? System.identityHashCode(object3) : 0) ^ n4;
        Object object4 = object2;
        n4 = (object4 != null ? System.identityHashCode(object4) : 0) ^ n4;
        int n5 = n4 ^ 0x7063508A;
        if ((n5 ^ n4) != 1885556874) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xEE9E875 ^ n4, 4) - -760167066) * 250210421;
            int cfr_ignored_1 = (int)(0xCC5B464827D4EB4FL ^ (long)n4 ^ 0x71E0831A2DB83567L);
        }
        System.arraycopy(object, n, object2, n2, n3);
    }

    private static void azt_3() {
        int n = -741331367;
        int n2 = (n = Integer.rotateLeft(n * 1749882595, 9) ^ 0xE21E1D78) ^ 0x81577545;
        if ((n2 ^ n) != -2124974779) {
            int cfr_ignored_0 = (0x52875B1C ^ n) - -1808609086;
        }
        yf.athz_2();
    }

    private static void khzth_2(DataOutput dataOutput, float[] fArray) {
        int n = 1702302126;
        n = Integer.rotateLeft(n * -548576837, 11) ^ 0x39150770;
        n = Integer.rotateRight((fArray != null ? System.identityHashCode(fArray) : 0) ^ n, 29);
        int n2 = n ^ 0x784D511B;
        if ((n2 ^ n) != 2018332955) {
            int cfr_ignored_0 = (0x1D3A40B5 ^ n) - 1194757572;
        }
        btdh_2.dhhs_3(dataOutput, fArray);
    }

    private static void ddhth(DataOutput dataOutput, float[] fArray) {
        int n = bss_4.hdhgh(-2054751794);
        n = (fArray != null ? System.identityHashCode(fArray) : 0) ^ n;
        int n2 = n ^ 0xD6CCD1A5;
        if ((n2 ^ n) != -691220059) {
            int cfr_ignored_0 = Integer.rotateRight(0x534A286B ^ n, 13) + 442008624;
        }
        btdh_2.dhhs_3(dataOutput, fArray);
    }

    private static int sakh_3(int n) {
        block0: {
            int n2 = -873904536;
            n2 = Integer.rotateLeft(n2 * 790993469, 26) ^ 0x5D713596;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 21)) ^ 0x6EAE74BA;
            if ((n3 ^ n2) == 1856926906) break block0;
            int cfr_ignored_0 = (0xA54732D2 ^ n2) + -1822364612;
        }
        return Integer.reverse(n);
    }

    private static float[] tbz_2(DataInput dataInput, int n) {
        block0: {
            int n2 = 115491385;
            n2 = Integer.rotateLeft(n2 * -1803774193, 18) ^ 0xC629A17C;
            DataInput dataInput2 = dataInput;
            n2 = Integer.rotateRight((dataInput2 != null ? System.identityHashCode(dataInput2) : 0) ^ n2, 4);
            int n3 = (n2 = n ^ n2) ^ 0x833A9CB0;
            if ((n3 ^ n2) == -2093310800) break block0;
            int cfr_ignored_0 = (0x85D8DE89 ^ n2) + 1001645110;
        }
        return btdh_2.thtz_4(dataInput, n);
    }

    private static float[] jr(DataInput dataInput, int n) {
        block0: {
            int n2 = 1130669149;
            n2 = Integer.rotateLeft(n2 * 1800218397, 16) ^ 0x3C339287;
            DataInput dataInput2 = dataInput;
            n2 = Integer.rotateRight((dataInput2 != null ? System.identityHashCode(dataInput2) : 0) ^ n2, 12);
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 8)) ^ 0xD75E9400;
            if ((n3 ^ n2) == -681667584) break block0;
            int cfr_ignored_0 = (0x943A305D ^ n2) + -1521346832;
        }
        return btdh_2.thtz_4(dataInput, n);
    }

    private static float[] khsht_2(DataInput dataInput, int n) {
        block0: {
            int n2 = bss_4.hdhgh(1799945226);
            DataInput dataInput2 = dataInput;
            n2 = Integer.rotateRight((dataInput2 != null ? System.identityHashCode(dataInput2) : 0) ^ n2, 14);
            int n3 = n2 ^ 0xBCF47995;
            if ((n3 ^ n2) == -1124828779) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xD7BC859F ^ n2, 13) - 607243644) * -675510881;
        }
        return btdh_2.thtz_4(dataInput, n);
    }

    private static float[] zya(DataInput dataInput, int n) {
        block0: {
            int n2 = bss_4.hdhgh(432271745);
            DataInput dataInput2 = dataInput;
            n2 = Integer.rotateLeft((dataInput2 != null ? System.identityHashCode(dataInput2) : 0) ^ n2, 5);
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 2)) ^ 0xFBBB04F3;
            if ((n3 ^ n2) == -71629581) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xE278F572 ^ n2, 15) + 1896044553) * -495389325;
        }
        return btdh_2.thtz_4(dataInput, n);
    }

    private static int dhhb_2(int n, int n2) {
        block0: {
            int n3 = -766677292;
            n3 = Integer.rotateLeft(n3 * 657365077, 14) ^ 0xCA781AB1;
            n3 = n ^ n3;
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 13)) ^ 0xDBE64CD7;
            if ((n4 ^ n3) == -605664041) break block0;
            int cfr_ignored_0 = (0x9AB2203 ^ n3) + 790335355;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int bthth(int n) {
        block0: {
            int n2 = 1428256163;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1782112227, 11) ^ 0xCBF21E46) ^ 0xC7BAE508;
            if ((n3 ^ n2) == -944052984) break block0;
            int cfr_ignored_0 = (0x929B90AB ^ n2) - 1880094024;
        }
        return Integer.reverse(n);
    }

    private static String jla(String string, String string2) {
        block0: {
            int n = 710015449;
            int n2 = (n = Integer.rotateLeft(n * -2108321737, 12) ^ 0xD6504AD3) ^ 0x45AB1235;
            if ((n2 ^ n) == 1168839221) break block0;
            int cfr_ignored_0 = (0x6FFAEBEC ^ n) + 335536662;
        }
        return string.concat(string2);
    }

    private static boolean shdb_2(float f) {
        block0: {
            int n = 1574192926;
            n = Integer.rotateLeft(n * 81509401, 21) ^ 0x3FF1F93C;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x380C2FF;
            if ((n2 ^ n) == 58770175) break block0;
            int cfr_ignored_0 = (0x5E5485E1 ^ n) - 1601106733;
        }
        return Float.isFinite(f);
    }

    private static String zza_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bss_4.hdhgh(-345125520);
            n4 = n ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x9A8F1E33;
            if ((n5 ^ n4) == -1701896653) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x71E2D343 ^ n4, 17) + -824888232;
        }
        return btdh_2.bss(string, n, n2, n3);
    }

    private static String[] dndh_2(String string) {
        int n = 1915955862;
        n = Integer.rotateLeft(n * 1325589925, 14) ^ 0x2FB5B6B6;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xF652A5B4;
        if ((n2 ^ n) != -162355788) {
            int cfr_ignored_0 = (0x84618F22 ^ n) - -302481008;
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

    private static CallSite dshs(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 620681104;
            n3 = Integer.rotateLeft(n3 * -1246351275, 17) ^ 0xF7F8671A;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 2);
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 6);
            int n4 = n3 ^ 0x86CD83BD;
            if ((n4 ^ n3) != -2033351747) {
                int cfr_ignored_0 = (0xA233542D ^ n3) + -718177912;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ thkr ^ string.hashCode()) + (n2 + hdq) + i ^ thkr, 18) + hdq);
            }
            String[] stringArray = btdh_2.dndh_2(new String(cArray));
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

    private static String[] ljh82ul8l73t81(String string) {
        return string.split("\u0001\u000f", -1);
    }

    private static CallSite l1g1gimsk6yasl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ an68lhxfm ^ string.hashCode() ^ n2 + wpk5xk7kdy68r ^ i * 568652279 ^ an68lhxfm, 3) ^ wpk5xk7kdy68r));
            }
            String[] stringArray = btdh_2.ljh82ul8l73t81(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

