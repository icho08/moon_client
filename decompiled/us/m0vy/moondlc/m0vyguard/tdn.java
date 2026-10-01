/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.NonNull
 *  net.minecraft.class_243
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import lombok.NonNull;
import net.minecraft.class_243;
import us.m0vy.moondlc.m0vyguard.btf_2;
import us.m0vy.moondlc.m0vyguard.tdq;
import us.m0vy.moondlc.m0vyguard.as_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class tdn {
    private static final btf_2 bdw;
    private final long tdth_2;
    private final tdq rmgh;
    private final tdq rfb;
    private final tdq tkf;
    private static final int dhds = -2102634111;
    private static final int khzz = -1826675309;
    private static final int stsh_2 = 1140277001;
    private static final int jght = 445042181;
    private static final int mz22k9sda = -414540601;
    private static final int f89ufgnkyxwt = 584779195;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int abishy4fu22nym;

    public tdn(long l, btf_2 btf2) {
        this.tdth_2 = l;
        this.rmgh = new tdq(l, btf2);
        this.rfb = new tdq(l, btf2);
        this.tkf = new tdq(l, btf2);
    }

    public tdn(long l) {
        this(l, bdw);
    }

    public tdn(long l, class_243 class_2432, btf_2 btf2) {
        this.tdth_2 = l;
        this.rmgh = new tdq(l, (float)class_2432.method_10216(), btf2);
        this.rfb = new tdq(l, (float)class_2432.method_10214(), btf2);
        this.tkf = new tdq(l, (float)class_2432.method_10215(), btf2);
    }

    public tdn(long l, class_243 class_2432) {
        this(l, class_2432, bdw);
    }

    public void dhmy(@NonNull class_243 class_2432) {
        if (class_2432 == null) {
            throw new NullPointerException("vec is marked non-null but is null");
        }
        this.rmgh.khadh_2((float)class_2432.method_10216());
        this.rfb.khadh_2((float)class_2432.method_10214());
        this.tkf.khadh_2((float)class_2432.method_10215());
    }

    public class_243 shj() {
        int n = -1353134864;
        n = Integer.rotateLeft(n * 213160809, 26) ^ 0x472ABAF5;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 19);
        int n2 = n ^ 0x2B77E821;
        if ((n2 ^ n) != 729278497) {
            int cfr_ignored_0 = (0x842F24D1 ^ n) + 1261925372;
        }
        return new class_243((double)((int)this.rmgh.swd()), (double)((int)tdn.zjb_2(this.rfb)), (double)((int)tdn.skha_4(this.tkf)));
    }

    public void rdha_2(btf_2 btf2) {
        int n = -376826119;
        n = Integer.rotateLeft(n * 909439017, 20) ^ 0xCEE738A5;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 7);
        btf_2 btf3 = btf2;
        n = (btf3 != null ? System.identityHashCode(btf3) : 0) ^ n;
        int n2 = n ^ 0x4487B0E2;
        if ((n2 ^ n) != 1149743330) {
            int cfr_ignored_0 = (0xAD0DA61B ^ n) - -1126115572;
        }
        this.rmgh.zzb_4(btf2);
        tdn.dhakh_2(this.rfb, btf2);
        this.tkf.zzb_4(btf2);
    }

    public void shqsh(long l) {
        try {
            int n = 781391528;
            n = Integer.rotateLeft(n * -2042798487, 7) ^ 0xCEA915DC;
            int n2 = n ^ 0x75AA6A18;
            if ((n2 ^ n) != 1974102552) {
                int cfr_ignored_0 = (0x5B397CB0 ^ n) - -1058376384;
            }
            if ((0x1BF & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!tdn.jrf()) {
            yf.athz_2();
            throw null;
        }
        tdn.zdhq(this.rmgh, l);
        this.rfb.zaz_5(l);
        this.tkf.zaz_5(l);
    }

    public void thtj_2(@NonNull class_243 class_2432) {
        int n = 0;
        int n2 = 1262133427;
        n2 = Integer.rotateLeft(n2 * 2106782679, 24) ^ 0x492A5E8E;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 27);
        int n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B)));
        block38: while (true) {
            switch (Integer.reverse(n3) ^ n2 ^ 0xDC9AE93B) {
                case 880211271: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x30D41E01 ^ n2, 9) + -301121190;
                    int cfr_ignored_1 = (int)(0xF266B03C27D4EB4FL ^ (long)n2 ^ 0x9D08831A2DB8491CL);
                    this.rmgh.khadh_2((float)tdn.jmd_2(class_2432));
                    tdn.aya(this.rfb, (float)class_2432.method_10214());
                    tdn.zshk_2(this.tkf, (float)class_2432.method_10215());
                    return;
                }
                case -518528621: {
                    int cfr_ignored_2 = (Integer.rotateLeft(0x4735C819 ^ n2, 11) + -1545545150) * 1194706969;
                    int cfr_ignored_3 = (int)(0x8587662427D4EB4FL ^ (long)n2 ^ 0x3138831A2DB8A6DFL);
                    if (!tdn.dhtb()) {
                        try {
                            n -= 3;
                            if ((0xA258685AEDFD4E2FL ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = Integer.reverse(n2 ^ 0xD0ACC626 ^ 0xDC9AE93B) + 948362530 - 948362530;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = Integer.reverse(n2 ^ 0xD0ACC626 ^ 0xDC9AE93B);
                        }
                        n -= 2;
                        continue block38;
                    }
                    n3 = (int)((long)Integer.reverse(n2 ^ 0xC87461F6 ^ 0xDC9AE93B) ^ 0xF8813F5454F6D7EFL ^ 0xF8813F5454F6D7EFL);
                    int cfr_ignored_4 = Integer.rotateRight(0x59C54103 ^ n2, 14) + -482312552;
                    n3 = Integer.reverse(n2 ^ 0x8218EAC6 ^ 0xDC9AE93B) ^ 0xD0DED4D2 ^ 0xD0DED4D2;
                    n -= 4;
                    continue block38;
                }
                case -793983450: {
                    int cfr_ignored_5 = Integer.rotateLeft(0xA74EBE8 ^ n2, 4) + 1216753747;
                    tdn.szl_2();
                    throw null;
                }
                case 1831470659: {
                    int cfr_ignored_6 = Integer.rotateLeft(0xF537809 ^ n2, 4) + -545707950;
                    int cfr_ignored_7 = (int)(0xCDE1D63427D4EB4FL ^ (long)n2 ^ 0x5118831A2DB83612L);
                    throw new NullPointerException(tdn.tthm_2("vec is marked n", tdn.zsgh_4("마畹⃪\udfd8謓䚹燩ⵔ\ud846韦䌷縒⦋逡侞竕㙳", tdn.shs_9(0x22489DFA ^ 0x5523D3D7, 21), Integer.rotateLeft(0x63533B07 ^ 0xA0A845A8, 28), 46823450 - -2037608181)));
                }
                case -2112296250: {
                    int cfr_ignored_8 = (Integer.rotateRight(0xA0D09B5F ^ n2, 7) - 2107666364) * -1596941473;
                    if (class_2432 != null) {
                        try {
                            n -= 2;
                            if ((0x40C78427D1B232A7L ^ (long)n2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n3 = Integer.reverse(n2 ^ 0x3476F547 ^ 0xDC9AE93B) + -1577588020 - -1577588020;
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = Integer.reverse(n2 ^ 0x3476F547 ^ 0xDC9AE93B) + -155681988 - -155681988;
                        }
                        ++n;
                        continue block38;
                    }
                    try {
                        n3 = Integer.reverse(n2 ^ 0x6D2A0643 ^ 0xDC9AE93B);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(n2 ^ 0x6D2A0643 ^ 0xDC9AE93B) + -1696709525 - -1696709525;
                    }
                    n += 3;
                    continue block38;
                }
                case -1722953225: {
                    int cfr_ignored_9 = Integer.rotateLeft(0x4DA73C45 ^ n2, 12) - 1805511574;
                    int cfr_ignored_10 = (int)(0x8F15927827D4EB4FL ^ (long)n2 ^ 0xD980831A2DB8B3FAL);
                    int cfr_ignored_11 = (int)(0x63DB33F5937284A9L ^ (long)n2 ^ 0x9A9BEA56F2756A67L);
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B)));
                    continue block38;
                }
                case -118627254: {
                    int cfr_ignored_12 = Integer.rotateRight(0x4697138F ^ n2, 11) - -1867973236;
                    n3 = Integer.reverse(n2 ^ 0x4DF37BBC ^ 0xDC9AE93B) ^ 0xADD0EF92 ^ 0xADD0EF92;
                    int cfr_ignored_13 = (Integer.rotateRight(0x8650405F ^ n2, 3) - 1209363132) * -2041560993;
                    n3 = Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B) ^ 0xE8193640 ^ 0xE8193640;
                    n += 3;
                    continue block38;
                }
                case 488261846: {
                    int cfr_ignored_14 = Integer.rotateLeft(0x3219064 ^ n2, 3) - 1701714775;
                    n3 = Integer.reverse(n2 ^ 0x8CC0934C ^ 0xDC9AE93B) ^ 0x49C65279 ^ 0x49C65279;
                    int cfr_ignored_15 = Integer.rotateRight(0x360E0A4F ^ n2, 9) - -1877942580;
                    n3 = Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B) ^ 0xA1505666 ^ 0xA1505666;
                    n += 2;
                    continue block38;
                }
                case 731105719: {
                    int cfr_ignored_16 = Integer.rotateRight(0x688F37CE ^ n2, 16) - -1380622035;
                    try {
                        ++n;
                        if ((0x1E2A4CF00BB3D80BL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B) + 497756187 - 497756187;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B)));
                    }
                    continue block38;
                }
                case 125603339: {
                    int cfr_ignored_17 = (Integer.rotateLeft(0xC3295D59 ^ n2, 11) + -1503662846) * -1020699303;
                    int cfr_ignored_18 = (int)(0x19BF36427D4EB4FL ^ (long)n2 ^ 0x1BB8831A2DB9AEE6L);
                    int cfr_ignored_19 = (int)(0x8F7D64F2A6B646F4L ^ (long)n2 ^ 0x349581DF76CEB32BL);
                    n3 = Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B);
                    continue block38;
                }
                case -1309179626: {
                    int cfr_ignored_20 = Integer.rotateLeft(0xA1D4F3EC ^ n2, 7) - -1658378033;
                    n3 = Integer.reverse(n2 ^ 0xB2886EB5 ^ 0xDC9AE93B) ^ 0x87362E96 ^ 0x87362E96;
                    int cfr_ignored_21 = (Integer.rotateLeft(0x67D750F4 ^ n2, 15) - -1754239801) * 1742164213;
                    n3 = Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B) ^ 0x971EC67F ^ 0x971EC67F;
                    --n;
                    continue block38;
                }
                case 1967189681: {
                    int cfr_ignored_22 = Integer.rotateRight(0x4AE6568B ^ n2, 12) + 373430800;
                    n3 = Integer.reverse(n2 ^ 0x99ED94E9 ^ 0xDC9AE93B) ^ 0xA1686056 ^ 0xA1686056;
                    int cfr_ignored_23 = (Integer.rotateLeft(0xCAB1FC10 ^ n2, 12) + -1880414933) * -894305263;
                    try {
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B)));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B);
                    }
                    n += 5;
                    continue block38;
                }
                case 472421271: {
                    int cfr_ignored_24 = (Integer.rotateLeft(0xBCECFCD1 ^ n2, 10) + -451920758) * -1125319471;
                    int cfr_ignored_25 = (int)(0x7E5E52EC27D4EB4FL ^ (long)n2 ^ 0x58A8831A2DB9516DL);
                    n3 = Integer.reverse(n2 ^ 0xD20EA2D7 ^ 0xDC9AE93B) ^ 0xA8EC250C ^ 0xA8EC250C;
                    int cfr_ignored_26 = (Integer.rotateRight(0xFABD669E ^ n2, 18) - 1632439389) * -88250721;
                    try {
                        if ((0x9C9199DB8944E1ADL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B) ^ 0xF44635AD ^ 0xF44635AD;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (int)((long)Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B) ^ 0x93D60FC9E43F3399L ^ 0x93D60FC9E43F3399L);
                    }
                    n += 4;
                    continue block38;
                }
                case -2082983333: {
                    int cfr_ignored_27 = (Integer.rotateRight(0x5EDC453A ^ n2, 14) + -2130050751) * 1591493947;
                    n3 = Integer.reverse(n2 ^ 0x236ADB9B ^ 0xDC9AE93B) + -347635848 - -347635848;
                    int cfr_ignored_28 = (Integer.rotateRight(0xB4DC08F7 ^ n2, 9) - -352144092) * -1260648201;
                    try {
                        if ((0x4361020016DD459FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B)));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B) ^ 0xA458E6F5 ^ 0xA458E6F5;
                    }
                    continue block38;
                }
                case 826033648: {
                    int cfr_ignored_29 = Integer.rotateRight(0x492EC883 ^ n2, 12) + -519575784;
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x313AFD54 ^ 0xDC9AE93B) ^ 0x63B913366BE3ED8BL ^ 0x63B913366BE3ED8BL);
                    int cfr_ignored_30 = Integer.rotateLeft(0x46DDE1AD ^ n2, 11) - -1724124370;
                    int cfr_ignored_31 = (int)(0x846F4F9027D4EB4FL ^ (long)n2 ^ 0x6250831A2DB8A50FL);
                    try {
                        n -= 2;
                        if ((0x290E8C38F5C4B759L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B) + 47104899 - 47104899;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B);
                    }
                    n += 2;
                    continue block38;
                }
                case 1920219024: {
                    int cfr_ignored_32 = Integer.rotateRight(0x9AD78A0F ^ n2, 6) - -998811892;
                    n3 = Integer.reverse(n2 ^ 0xDDF8CB4D ^ 0xDC9AE93B);
                    int cfr_ignored_33 = Integer.rotateLeft(0x7981D2EC ^ n2, 18) - -1156175409;
                    try {
                        if ((0xF66BC1E9D9B0225FL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B) + -1882132748 - -1882132748;
                    }
                    n -= 3;
                    continue block38;
                }
                case -1271639055: {
                    int cfr_ignored_34 = (Integer.rotateRight(0x3F591832 ^ n2, 10) + -1339585207) * 1062803507;
                    n3 = Integer.reverse(n2 ^ 0xABD05F3A ^ 0xDC9AE93B) ^ 0x3A2E7998 ^ 0x3A2E7998;
                    int cfr_ignored_35 = Integer.rotateLeft(0xA8931C2D ^ n2, 8) - 1848510638;
                    int cfr_ignored_36 = (int)(0x6A21B21027D4EB4FL ^ (long)n2 ^ 0x9950831A2DB97992L);
                    n3 = Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B) ^ 0x11AF002F ^ 0x11AF002F;
                    n += 5;
                    continue block38;
                }
                case 2034025940: {
                    int cfr_ignored_37 = Integer.rotateLeft(0x6EE9412D ^ n2, 16) - 1922859950;
                    int cfr_ignored_38 = (int)(0xAC5BEF1027D4EB4FL ^ (long)n2 ^ 0x2350831A2DB8F566L);
                    n3 = Integer.reverse(n2 ^ 0xB8FB4660 ^ 0xDC9AE93B) + 1426476559 - 1426476559;
                    int cfr_ignored_39 = Integer.rotateRight(0xCB105A63 ^ n2, 12) + -1688694472;
                    n3 = (int)((long)Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B) ^ 0xE572B081549C3E64L ^ 0xE572B081549C3E64L);
                    n += 3;
                    continue block38;
                }
            }
            int cfr_ignored_40 = Integer.rotateRight(0xD80C884E ^ n2, 14) - 769794221;
            n3 = Integer.reverse(n2 ^ 0xE117E193 ^ 0xDC9AE93B);
        }
    }

    private static String zsgh_4(String string, int n, int n2, int n3) {
        try {
            int n4 = -1349289669;
            n4 = Integer.rotateLeft(n4 * -1103132071, 8) ^ 0xB93D6CF4;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            n4 = Integer.rotateLeft(n ^ n4, 22);
            int n5 = n4 ^ 0x94A08095;
            if ((n5 ^ n4) != -1801420651) {
                int cfr_ignored_0 = (0x3B33F9AE ^ n4) + -1663615265;
            }
            if ((0x357 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xCA3B12AA ^ n2 ^ i * 740246067 ^ dhds, 10) ^ khzz));
        }
        return new String(cArray);
    }

    private static float zjb_2(tdq tdq2) {
        block0: {
            int n = as_2.akhh_2(1268503351);
            int n2 = n ^ 0x387DA646;
            if ((n2 ^ n) == 947758662) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x73E67571 ^ n, 17) + 222681066) * 1944483185;
            int cfr_ignored_1 = (int)(0xB154DB4C27D4EB4FL ^ (long)n ^ 0x4BE8831A2DB8CF78L);
        }
        return tdq2.swd();
    }

    private static float skha_4(tdq tdq2) {
        block0: {
            int n = 1363496831;
            int n2 = (n = Integer.rotateLeft(n * -644520779, 20) ^ 0x13429E8D) ^ 0x63166E63;
            if ((n2 ^ n) == 1662414435) break block0;
            int cfr_ignored_0 = (0x3253211C ^ n) + -1093798570;
        }
        return tdq2.swd();
    }

    private static void dhakh_2(tdq tdq2, btf_2 btf2) {
        int n = -2085465520;
        n = Integer.rotateLeft(n * -1569579249, 17) ^ 0xEC822682;
        tdq tdq3 = tdq2;
        n = Integer.rotateRight((tdq3 != null ? System.identityHashCode(tdq3) : 0) ^ n, 14);
        int n2 = n ^ 0x8F5F88FF;
        if ((n2 ^ n) != -1889564417) {
            int cfr_ignored_0 = (0xCEDDAAF ^ n) + 1983868442;
        }
        tdq2.zzb_4(btf2);
    }

    private static boolean jrf() {
        block0: {
            int n = -483273574;
            int n2 = (n = Integer.rotateLeft(n * 1782248403, 25) ^ 0xFDE2737A) ^ 0x19FA863D;
            if ((n2 ^ n) == 435848765) break block0;
            int cfr_ignored_0 = (0xFACB52A7 ^ n) - 555207391;
        }
        return yf.khdha_2();
    }

    private static void zdhq(tdq tdq2, long l) {
        int n = as_2.akhh_2(-1181888282);
        int n2 = (n = Integer.rotateRight((int)l ^ n, 17)) ^ 0x15893914;
        if ((n2 ^ n) != 361314580) {
            int cfr_ignored_0 = (Integer.rotateRight(0xAC04E9F2 ^ n, 8) + -654969975) * -1408964109;
        }
        tdq2.zaz_5(l);
    }

    private static boolean dhtb() {
        block0: {
            int n = -368114950;
            int n2 = (n = Integer.rotateLeft(n * -1263184959, 17) ^ 0xA1194198) ^ 0xB72DA235;
            if ((n2 ^ n) == -1221746123) break block0;
            int cfr_ignored_0 = (0x5D22A0CF ^ n) + -800932018;
        }
        return yf.khdha_2();
    }

    private static void szl_2() {
        int n = -1678621420;
        int n2 = (n = Integer.rotateLeft(n * 104308187, 9) ^ 0x81DFE0BE) ^ 0x199D106;
        if ((n2 ^ n) != 26857734) {
            int cfr_ignored_0 = (0x9A6B9412 ^ n) + -1333567501;
        }
        yf.athz_2();
    }

    private static String sdh_5(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1125188;
            n4 = Integer.rotateLeft(n4 * -758698815, 16) ^ 0xF2DDE9D3;
            n4 = n2 ^ n4;
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 27)) ^ 0x51541AAB;
            if ((n5 ^ n4) == 1364466347) break block0;
            int cfr_ignored_0 = (0xAEBACE17 ^ n4) + -654344780;
        }
        return tdn.zsgh_4(string, n, n2, n3);
    }

    private static int shs_9(int n, int n2) {
        block0: {
            int n3 = as_2.akhh_2(-92962463);
            int n4 = (n3 = n ^ n3) ^ 0x3CD5508F;
            if ((n4 ^ n3) == 1020612751) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xC6A0D1EE ^ n3, 11) - 299305741;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String tthm_2(String string, String string2) {
        block0: {
            int n = -1928950728;
            n = Integer.rotateLeft(n * -1021593131, 21) ^ 0x293C6A8D;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            String string4 = string2;
            n = Integer.rotateRight((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 29);
            int n2 = n ^ 0xC3ED7E84;
            if ((n2 ^ n) == -1007845756) break block0;
            int cfr_ignored_0 = (0x4EEBF2BC ^ n) + 55069481;
        }
        return string.concat(string2);
    }

    private static double jmd_2(class_243 class_2432) {
        block0: {
            int n = as_2.akhh_2(-1498455872);
            int n2 = n ^ 0x338023A;
            if ((n2 ^ n) == 54002234) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xA59762FA ^ n, 7) + 296917889) * -1516805381;
        }
        return class_2432.method_10216();
    }

    private static void aya(tdq tdq2, float f) {
        int n = as_2.akhh_2(-414356619);
        tdq tdq3 = tdq2;
        n = Integer.rotateRight((tdq3 != null ? System.identityHashCode(tdq3) : 0) ^ n, 5);
        int n2 = n ^ 0x350989BE;
        if ((n2 ^ n) != 889817534) {
            int cfr_ignored_0 = Integer.rotateRight(0xD244E2CB ^ n, 13) + 2058687952;
        }
        tdq2.khadh_2(f);
    }

    private static void zshk_2(tdq tdq2, float f) {
        int n = as_2.akhh_2(943815081);
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 21);
        int n2 = n ^ 0x66AE789B;
        if ((n2 ^ n) != 1722710171) {
            int cfr_ignored_0 = (Integer.rotateRight(0x5EEF0132 ^ n, 14) + -2091989943) * 1592721715;
        }
        tdq2.khadh_2(f);
    }

    private static String[] dshh_4(String string) {
        block0: {
            int n = as_2.akhh_2(-1566413946);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xE724E4B5;
            if ((n2 ^ n) == -417012555) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x45868F33 ^ n, 11) + 1873344104) * 1166446387;
        }
        return string.split("\u0005\u001f", -1);
    }

    private static CallSite smh_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1894936185;
            n3 = Integer.rotateLeft(n3 * 102936953, 11) ^ 0xF8AB9FC3;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x7FCDADC2;
            if ((n4 ^ n3) != 2144185794) {
                int cfr_ignored_0 = (0xF0C03C45 ^ n3) - -22744788;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ stsh_2 ^ string.hashCode() ^ n2 + jght ^ i * -170257655 ^ stsh_2, 6) ^ jght));
            }
            String[] stringArray = tdn.dshh_4(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] zw6oh13m9zw(String string) {
        return string.split("\b\u0019", -1);
    }

    private static CallSite vvpzzt6lw5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ mz22k9sda ^ string.hashCode() ^ n2 + f89ufgnkyxwt + i * 141131915) + mz22k9sda) ^ f89ufgnkyxwt));
            }
            String[] stringArray = tdn.zw6oh13m9zw(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

