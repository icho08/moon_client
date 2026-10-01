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
import us.m0vy.moondlc.m0vyguard.tzw;
import us.m0vy.moondlc.m0vyguard.yf;

public class bhy {
    private static final int thw = 256;
    private final int[] hsth = new int[Integer.rotateLeft(0xBBC448EB ^ 0xBBC448AB, 3)];
    private static final int dyn = 2026498682;
    private static final int dhyj = 984628733;
    private static final int zic2gzhm3kz4 = 1474339027;
    private static final int btebph9wdzt8 = 474888620;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int lkirxehuyl;

    public bhy() {
        this(System.nanoTime());
    }

    public bhy(long l) {
        int n;
        tzw tzw2 = new tzw(l);
        int[] nArray = new int[Integer.reverse(-941645356) ^ 0x2B85FAE3];
        for (n = 0; n < 1115968715 + -1115968459; ++n) {
            nArray[n] = n;
        }
        for (n = 0xF18B05EF ^ 0xF18B0510; n > 0; --n) {
            int n2 = tzw2.nextInt(n + 1);
            int n3 = nArray[n];
            nArray[n] = nArray[n2];
            nArray[n2] = n3;
        }
        for (n = 0; n < -1519770913 + 1519771425; ++n) {
            this.hsth[n] = nArray[n & (Integer.reverse(-1784630605) ^ 0xCD4D0556)];
        }
    }

    public float khnt_2(float f) {
        try {
            int n = 734139185;
            n = Integer.rotateLeft(n * -1512045373, 16) ^ 0x7CA45C36;
            n = System.identityHashCode(this) ^ n;
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0x4E9FBB79;
            if ((n2 ^ n) != 1319091065) {
                int cfr_ignored_0 = (0x655DA848 ^ n) - -2089091419;
            }
            if ((0x7D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bhy.srkh_2()) {
            throw null;
        }
        int n = (int)Math.floor(f) & (Integer.reverse(1303449073) ^ 0x8FB08D4D);
        float f2 = f - (float)Math.floor(f);
        float f3 = bhy.zbdh(this, f2);
        int n3 = this.hsth[n];
        int n4 = this.hsth[n + 1];
        return bhy.dhak(this, f3, this.ashz_2(n3, f2), this.ashz_2(n4, f2 - 1.0f)) * 2.0f;
    }

    public float sdj_2(float f, float f2) {
        try {
            int n = 2011341355;
            n = Integer.rotateLeft(n * 1039349815, 15) ^ 0x96934BDA;
            n = System.identityHashCode(this) ^ n;
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 4);
            int n2 = n ^ 0x4619914E;
            if ((n2 ^ n) != 1176080718) {
                int cfr_ignored_0 = (0x31FB3365 ^ n) + -1803091;
            }
            if ((0xB9 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        int n = (int)Math.floor(f) & -62727851 - -62728106;
        int n3 = (int)Math.floor(f2) & (Integer.reverse(1351072608) ^ 0x6DDE1F5);
        float f3 = f - (float)Math.floor(f);
        float f4 = f2 - (float)Math.floor(f2);
        float f5 = this.tzk_2(f3);
        float f6 = this.tzk_2(f4);
        int n4 = this.hsth[this.hsth[n] + n3];
        int n5 = this.hsth[this.hsth[n] + n3 + 1];
        int n6 = this.hsth[this.hsth[n + 1] + n3];
        int n7 = this.hsth[this.hsth[n + 1] + n3 + 1];
        float f7 = this.sash(f5, bhy.sjz_4(this, n4, f3, f4), this.taq_2(n6, f3 - 1.0f, f4));
        float f8 = this.sash(f5, this.taq_2(n5, f3, f4 - 1.0f), this.taq_2(n7, f3 - 1.0f, f4 - 1.0f));
        return this.sash(f6, f7, f8);
    }

    public float hghkh(float f, float f2, float f3) {
        try {
            int n = -10770572;
            n = Integer.rotateLeft(n * -494821875, 14) ^ 0x35743D7E;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 24);
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xEF7C84BB;
            if ((n2 ^ n) != -277052229) {
                int cfr_ignored_0 = (0x102723CF ^ n) + -1391445790;
            }
            if ((0x128 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        int n = (int)Math.floor(f) & (Integer.reverse(-909414892) ^ 0x2876D36C);
        int n3 = (int)Math.floor(f2) & (Integer.reverse(1855918460) ^ 0x3E88F989);
        int n4 = (int)Math.floor(f3) & -1276395311 - -1276395566;
        float f4 = f - (float)Math.floor(f);
        float f5 = f2 - (float)Math.floor(f2);
        float f6 = f3 - (float)Math.floor(f3);
        float f7 = this.tzk_2(f4);
        float f8 = this.tzk_2(f5);
        float f9 = this.tzk_2(f6);
        int n5 = this.hsth[this.hsth[this.hsth[n] + n3] + n4];
        int n6 = this.hsth[this.hsth[this.hsth[n] + n3] + n4 + 1];
        int n7 = this.hsth[this.hsth[this.hsth[n] + n3 + 1] + n4];
        int n8 = this.hsth[this.hsth[this.hsth[n] + n3 + 1] + n4 + 1];
        int n9 = this.hsth[this.hsth[this.hsth[n + 1] + n3] + n4];
        int n10 = this.hsth[this.hsth[this.hsth[n + 1] + n3] + n4 + 1];
        int n11 = this.hsth[this.hsth[this.hsth[n + 1] + n3 + 1] + n4];
        int n12 = this.hsth[this.hsth[this.hsth[n + 1] + n3 + 1] + n4 + 1];
        float f10 = this.sash(f7, this.zmb(n5, f4, f5, f6), this.zmb(n9, f4 - 1.0f, f5, f6));
        float f11 = this.sash(f7, this.zmb(n7, f4, f5 - 1.0f, f6), this.zmb(n11, f4 - 1.0f, f5 - 1.0f, f6));
        float f12 = bhy.dzkh(this, f8, f10, f11);
        f10 = bhy.jyz(this, f7, bhy.dl_2(this, n6, f4, f5, f6 - 1.0f), this.zmb(n10, f4 - 1.0f, f5, f6 - 1.0f));
        f11 = bhy.hst_3(this, f7, this.zmb(n8, f4, f5 - 1.0f, f6 - 1.0f), this.zmb(n12, f4 - 1.0f, f5 - 1.0f, f6 - 1.0f));
        float f13 = this.sash(f8, f10, f11);
        return this.sash(f9, f12, f13);
    }

    private float tzk_2(float f) {
        try {
            int n = -102411211;
            n = Integer.rotateLeft(n * 1388596573, 18) ^ 0xD7050B0D;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 28);
            int n2 = n ^ 0x2010AF34;
            if ((n2 ^ n) != 537964340) {
                int cfr_ignored_0 = (0xD9F5FB01 ^ n) - 1090842772;
            }
            if ((0x162 & 0) != 0) {
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
        return f * f * f * (f * (f * Float.intBitsToFloat(Integer.rotateLeft(0x6F2D0F22 ^ 0x692D0F20, 29)) - Float.intBitsToFloat(Integer.rotateLeft(0x6B85AD1 ^ 0x28B85AD9, 27))) + Float.intBitsToFloat(0xE12C54CB ^ 0xA00C54CB));
    }

    private float sash(float f, float f2, float f3) {
        block0: {
            int n = 1007467174;
            n = Integer.rotateLeft(n * -1714037841, 17) ^ 0x143C11CE;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 13);
            n = Float.floatToIntBits(f3) ^ n;
            int n2 = n ^ 0x8E29AAAA;
            if ((n2 ^ n) == -1909871958) break block0;
            int cfr_ignored_0 = (0xB225100C ^ n) - 334309667;
        }
        return f2 + f * (f3 - f2);
    }

    private float ashz_2(int n, float f) {
        int n2 = 473489436;
        n2 = Integer.rotateLeft(n2 * 1563063005, 14) ^ 0x47F12932;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 9);
        int n3 = (n2 = Integer.rotateRight(n ^ n2, 10)) ^ 0x43F263C6;
        if ((n3 ^ n2) != 1139958726) {
            int cfr_ignored_0 = (0x5FCA83DA ^ n2) - -1225991277;
        }
        if (!bhy.thrz()) {
            bhy.ghsz_3();
        }
        return (n & 1) == 0 ? f : -f;
    }

    private float taq_2(int n, float f, float f2) {
        float f3 = 0.0f;
        int n2 = 0;
        int n3 = -528897121;
        n3 = Integer.rotateLeft(n3 * 1661541215, 7) ^ 0x1B43D9C8;
        n3 = Integer.rotateLeft(System.identityHashCode(this) ^ n3, 29);
        n3 = Float.floatToIntBits(f) ^ n3;
        int n4 = (int)((long)(1056742315 * 1013118645 + -578650988 ^ n3) ^ 0x4D3C4F1ED46210BFL ^ 0x4D3C4F1ED46210BFL);
        while (true) {
            block30: {
                block31: {
                    block54: {
                        block28: {
                            block44: {
                                block36: {
                                    block29: {
                                        block38: {
                                            block51: {
                                                block37: {
                                                    block45: {
                                                        block52: {
                                                            block32: {
                                                                block46: {
                                                                    block40: {
                                                                        block59: {
                                                                            block55: {
                                                                                block58: {
                                                                                    block56: {
                                                                                        block57: {
                                                                                            block39: {
                                                                                                block49: {
                                                                                                    block50: {
                                                                                                        block43: {
                                                                                                            block35: {
                                                                                                                block47: {
                                                                                                                    block33: {
                                                                                                                        block53: {
                                                                                                                            block48: {
                                                                                                                                block41: {
                                                                                                                                    block42: {
                                                                                                                                        block25: {
                                                                                                                                            block34: {
                                                                                                                                                block26: {
                                                                                                                                                    block27: {
                                                                                                                                                        if ((n2 = ((n4 ^ n3) - -578650988) * -1872181347) > 699182965) break block25;
                                                                                                                                                        if (n2 > -853735212) break block26;
                                                                                                                                                        if (n2 > -1873069459) break block27;
                                                                                                                                                        if (n2 == -2102648158) break block28;
                                                                                                                                                        if (n2 == -1873069459) break block29;
                                                                                                                                                        break block30;
                                                                                                                                                    }
                                                                                                                                                    if (n2 == -1410715730) break block31;
                                                                                                                                                    if (n2 == -857370605) break block32;
                                                                                                                                                    int cfr_ignored_0 = (Integer.rotateLeft(0x8C600039 ^ n3, 4) + 66954786) * -1939865543;
                                                                                                                                                    int cfr_ignored_1 = (int)(0x4ED2AE0427D4EB4FL ^ (long)n3 ^ 0xA178831A2DB93074L);
                                                                                                                                                    if (n2 == -853735212) break block33;
                                                                                                                                                    break block30;
                                                                                                                                                }
                                                                                                                                                if (n2 > 4096983) break block34;
                                                                                                                                                if (n2 == -410303922) break block35;
                                                                                                                                                if (n2 == -178243597) break block36;
                                                                                                                                                if (n2 == 4096983) break block37;
                                                                                                                                                break block30;
                                                                                                                                            }
                                                                                                                                            if (n2 == 162637104) break block38;
                                                                                                                                            if (n2 == 211506652) break block39;
                                                                                                                                            if (n2 == 699182965) break block40;
                                                                                                                                            break block30;
                                                                                                                                        }
                                                                                                                                        if (n2 > 1008743599) break block41;
                                                                                                                                        if (n2 > 796862401) break block42;
                                                                                                                                        if (n2 == 707995761) break block43;
                                                                                                                                        if (n2 == 796862401) break block44;
                                                                                                                                        break block30;
                                                                                                                                    }
                                                                                                                                    if (n2 == 809581058) break block45;
                                                                                                                                    if (n2 == 939073978) break block46;
                                                                                                                                    int cfr_ignored_2 = Integer.rotateLeft(0xE42B99E4 ^ n3, 15) - -1515896361;
                                                                                                                                    if (n2 == 1008743599) break block47;
                                                                                                                                    break block30;
                                                                                                                                }
                                                                                                                                if (n2 > 1289298767) break block48;
                                                                                                                                if (n2 == 1056742315) break block49;
                                                                                                                                if (n2 == 1199807153) break block50;
                                                                                                                                if (n2 == 1289298767) break block51;
                                                                                                                                break block30;
                                                                                                                            }
                                                                                                                            if (n2 == 1614084405) break block52;
                                                                                                                            if (n2 == 1673199825) break block53;
                                                                                                                            if (n2 == 1897267488) break block54;
                                                                                                                            break block30;
                                                                                                                        }
                                                                                                                        int cfr_ignored_3 = Integer.rotateRight(0x147F54E2 ^ n3, 5) + 2143872665;
                                                                                                                        f3 = -f - f2;
                                                                                                                        int cfr_ignored_4 = (int)(0x1F954024B0C40BEFL ^ (long)n3 ^ 0x7D39AD3BECF992FBL);
                                                                                                                        n4 = Integer.reverse(Integer.reverse(-1410715730 * 1013118645 + -578650988 ^ n3));
                                                                                                                        n2 -= 3;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    int cfr_ignored_5 = Integer.rotateRight(0x75781B43 ^ n3, 17) + 1038675032;
                                                                                                                    yf.athz_2();
                                                                                                                    n4 = 211506652 * 1013118645 + -578650988 ^ n3;
                                                                                                                    n2 -= 5;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                int cfr_ignored_6 = Integer.rotateLeft(0xEA94ADA8 ^ n3, 16) + 1818142355;
                                                                                                                yf.athz_2();
                                                                                                                n4 = (int)((long)(211506652 * 1013118645 + -578650988 ^ n3) ^ 0xBAFC31F935C2D80DL ^ 0xBAFC31F935C2D80DL);
                                                                                                                int cfr_ignored_7 = Integer.rotateRight(0x9D56BBA7 ^ n3, 6) - 299784308;
                                                                                                                continue;
                                                                                                            }
                                                                                                            int cfr_ignored_8 = Integer.rotateRight(0x70E2442E ^ n3, 17) - -1346117427;
                                                                                                            f3 = f + f2;
                                                                                                            try {
                                                                                                                n2 += 4;
                                                                                                                if ((0xA4C6BB73DB3968E5L ^ (long)n3 | 1L) == 0L) {
                                                                                                                    throw new NoSuchElementException();
                                                                                                                }
                                                                                                                n4 = -1410715730 * 1013118645 + -578650988 ^ n3;
                                                                                                            }
                                                                                                            catch (NoSuchElementException noSuchElementException) {
                                                                                                                n4 = -1410715730 * 1013118645 + -578650988 ^ n3 ^ 0x286F4F68 ^ 0x286F4F68;
                                                                                                            }
                                                                                                            n2 += 2;
                                                                                                            continue;
                                                                                                        }
                                                                                                        int cfr_ignored_9 = Integer.rotateLeft(0x19FABE21 ^ n3, 6) + 700097850;
                                                                                                        int cfr_ignored_10 = (int)(0xDB48101C27D4EB4FL ^ (long)n3 ^ 0xDD48831A2DB81B41L);
                                                                                                        f3 = 0.0f;
                                                                                                        int cfr_ignored_11 = (int)(0x1557C18CFB6B2022L ^ (long)n3 ^ 0x7E693A65BB63877EL);
                                                                                                        n4 = -1410715730 * 1013118645 + -578650988 ^ n3;
                                                                                                        continue;
                                                                                                    }
                                                                                                    int cfr_ignored_12 = Integer.rotateLeft(0x38376044 ^ n3, 10) - -753776777;
                                                                                                    f3 = -f + f2;
                                                                                                    n4 = (int)((long)(-1410715730 * 1013118645 + -578650988 ^ n3) ^ 0xD843E0FFF02908E0L ^ 0xD843E0FFF02908E0L);
                                                                                                    ++n2;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_13 = (Integer.rotateRight(0x912F993A ^ n3, 5) + -1725878975) * -1859151557;
                                                                                                if (yf.khdha_2()) {
                                                                                                    int cfr_ignored_14 = (int)(0xF09D6AB0E1105937L ^ (long)n3 ^ 0x28110E9349484CEBL);
                                                                                                    n4 = 1726391679 * 1013118645 + -578650988 ^ n3 ^ 0x2A1703C0 ^ 0x2A1703C0;
                                                                                                    int cfr_ignored_15 = (int)(0x3263BF07F7C6E4F1L ^ (long)n3 ^ 0x837F233E32C5C916L);
                                                                                                    n4 = 211506652 * 1013118645 + -578650988 ^ n3;
                                                                                                    ++n2;
                                                                                                    continue;
                                                                                                }
                                                                                                try {
                                                                                                    n4 = (int)((long)(-853735212 * 1013118645 + -578650988 ^ n3) ^ 0xB76E7CB1C35D8CD2L ^ 0xB76E7CB1C35D8CD2L);
                                                                                                }
                                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                                    n4 = (int)((long)(-853735212 * 1013118645 + -578650988 ^ n3) ^ 0x36D933BBF60D8985L ^ 0x36D933BBF60D8985L);
                                                                                                }
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_16 = (Integer.rotateRight(0x88F07FBA ^ n3, 4) + -1719855423) * -1997504581;
                                                                                            n2 = n & 3;
                                                                                            if (n2 == 3) break block55;
                                                                                            if (n2 == 1) break block56;
                                                                                            if (n2 == 0) break block57;
                                                                                            if (n2 == 2) break block58;
                                                                                            break block59;
                                                                                        }
                                                                                        n4 = (1749099396 * 1013118645 + -578650988 ^ n3) + -160784195 - -160784195;
                                                                                        int cfr_ignored_17 = (Integer.rotateRight(0x2F7BB656 ^ n3, 8) - -1000819803) * 796636759;
                                                                                        n4 = Integer.reverse(Integer.reverse(-410303922 * 1013118645 + -578650988 ^ n3));
                                                                                        ++n2;
                                                                                        continue;
                                                                                    }
                                                                                    n4 = (192693165 * 1013118645 + -578650988 ^ n3) + 705957886 - 705957886;
                                                                                    int cfr_ignored_18 = (Integer.rotateLeft(0xB8C99A14 ^ n3, 10) - 1690781607) * -1194747371;
                                                                                    n4 = 1199807153 * 1013118645 + -578650988 ^ n3;
                                                                                    ++n2;
                                                                                    continue;
                                                                                }
                                                                                try {
                                                                                    if ((0x72F157C0FBD0333BL ^ (long)n3 | 1L) == 0L) {
                                                                                        throw new IllegalStateException();
                                                                                    }
                                                                                    n4 = 699182965 * 1013118645 + -578650988 ^ n3 ^ 0x124AC3D5 ^ 0x124AC3D5;
                                                                                }
                                                                                catch (IllegalStateException illegalStateException) {
                                                                                    n4 = 699182965 * 1013118645 + -578650988 ^ n3 ^ 0xA4DF4F5C ^ 0xA4DF4F5C;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            try {
                                                                                n2 += 5;
                                                                                if ((0x837E1F1BA1E761A3L ^ (long)n3 | 1L) == 0L) {
                                                                                    throw new IllegalStateException();
                                                                                }
                                                                                n4 = 1673199825 * 1013118645 + -578650988 ^ n3 ^ 0x3DB23306 ^ 0x3DB23306;
                                                                            }
                                                                            catch (IllegalStateException illegalStateException) {
                                                                                n4 = (int)((long)(1673199825 * 1013118645 + -578650988 ^ n3) ^ 0xF0CB47485CDDD02FL ^ 0xF0CB47485CDDD02FL);
                                                                            }
                                                                            n2 += 4;
                                                                            continue;
                                                                        }
                                                                        n4 = 707995761 * 1013118645 + -578650988 ^ n3 ^ 0x6C4F8D6F ^ 0x6C4F8D6F;
                                                                        int cfr_ignored_19 = Integer.rotateLeft(0xDF79FA0 ^ n3, 4) + -1252396133;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_20 = Integer.rotateRight(0xCD8E120E ^ n3, 12) - -393097491;
                                                                    f3 = f - f2;
                                                                    n4 = (-1410715730 * 1013118645 + -578650988 ^ n3) + -497349760 - -497349760;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_21 = Integer.rotateLeft(0x72B8F648 ^ n3, 17) + -389844493;
                                                                n4 = (-1880465098 * 1013118645 + -578650988 ^ n3) + -1633498266 - -1633498266;
                                                                int cfr_ignored_22 = Integer.rotateRight(0xC2178B26 ^ n3, 11) - -2059962155;
                                                                try {
                                                                    n2 += 5;
                                                                    if ((0xE2E180E5E740C901L ^ (long)n3 | 1L) == 0L) {
                                                                        throw new IllegalArgumentException();
                                                                    }
                                                                    n4 = 1056742315 * 1013118645 + -578650988 ^ n3;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    n4 = 1056742315 * 1013118645 + -578650988 ^ n3;
                                                                }
                                                                ++n2;
                                                                continue;
                                                            }
                                                            int cfr_ignored_23 = (Integer.rotateRight(0x60051AB6 ^ n3, 15) - -1526998203) * 1610947255;
                                                            n4 = Integer.reverse(Integer.reverse(1685764081 * 1013118645 + -578650988 ^ n3));
                                                            int cfr_ignored_24 = Integer.rotateRight(0xEE47266F ^ n3, 16) - -553957716;
                                                            n4 = 1507618790 * 1013118645 + -578650988 ^ n3;
                                                            int cfr_ignored_25 = Integer.rotateLeft(0xD134D368 ^ n3, 13) + 1505966291;
                                                            n4 = (1056742315 * 1013118645 + -578650988 ^ n3) + -1691052138 - -1691052138;
                                                            continue;
                                                        }
                                                        int cfr_ignored_26 = Integer.rotateLeft(0x506BFD8D ^ n3, 13) - -1049537714;
                                                        int cfr_ignored_27 = (int)(0x92D953B027D4EB4FL ^ (long)n3 ^ 0x5A10831A2DB88863L);
                                                        n4 = (int)((long)(-11953932 * 1013118645 + -578650988 ^ n3) ^ 0xBEC2447EFB0035E0L ^ 0xBEC2447EFB0035E0L);
                                                        int cfr_ignored_28 = (Integer.rotateRight(0x601F689B ^ n3, 15) + -1473558016) * 1612671131;
                                                        n4 = (-703744769 * 1013118645 + -578650988 ^ n3) + -1240036998 - -1240036998;
                                                        int cfr_ignored_29 = (Integer.rotateRight(0x19184ED6 ^ n3, 6) - 240069413) * 421023447;
                                                        n4 = (int)((long)(1056742315 * 1013118645 + -578650988 ^ n3) ^ 0x9E137690A0009DCEL ^ 0x9E137690A0009DCEL);
                                                        --n2;
                                                        continue;
                                                    }
                                                    int cfr_ignored_30 = (Integer.rotateLeft(0xC27106B4 ^ n3, 11) - -1878167801) * -1032780107;
                                                    n4 = Integer.reverse(Integer.reverse(1956560163 * 1013118645 + -578650988 ^ n3));
                                                    int cfr_ignored_31 = (Integer.rotateRight(0xA0B483B2 ^ n3, 7) + 2050593225) * -1598782541;
                                                    try {
                                                        if ((0x454D13EB40015055L ^ (long)n3 | 1L) == 0L) {
                                                            throw new NoSuchElementException();
                                                        }
                                                        n4 = Integer.reverse(Integer.reverse(1056742315 * 1013118645 + -578650988 ^ n3));
                                                    }
                                                    catch (NoSuchElementException noSuchElementException) {
                                                        n4 = (int)((long)(1056742315 * 1013118645 + -578650988 ^ n3) ^ 0xA80223CD6D95524CL ^ 0xA80223CD6D95524CL);
                                                    }
                                                    continue;
                                                }
                                                int cfr_ignored_32 = (Integer.rotateRight(0xA6229EFE ^ n3, 7) - 579788797) * -1507680513;
                                                n4 = -1549840947 * 1013118645 + -578650988 ^ n3 ^ 0x6357AAA0 ^ 0x6357AAA0;
                                                int cfr_ignored_33 = (Integer.rotateRight(0xF079D937 ^ n3, 17) - 589229284) * -260449993;
                                                n4 = (1249204248 * 1013118645 + -578650988 ^ n3) + -688890246 - -688890246;
                                                int cfr_ignored_34 = Integer.rotateLeft(0x8F79EEED ^ n3, 4) - 1679920622;
                                                int cfr_ignored_35 = (int)(0x4DCB40D027D4EB4FL ^ (long)n3 ^ 0x7CD0831A2DB93647L);
                                                n4 = 1056742315 * 1013118645 + -578650988 ^ n3;
                                                n2 += 4;
                                                continue;
                                            }
                                            int cfr_ignored_36 = Integer.rotateRight(0x81777C6 ^ n3, 4) - -13295563;
                                            n4 = (int)((long)(-2131549666 * 1013118645 + -578650988 ^ n3) ^ 0xA72B48AC8694C3C5L ^ 0xA72B48AC8694C3C5L);
                                            int cfr_ignored_37 = Integer.rotateRight(0x2358ADE3 ^ n3, 7) + 1276816824;
                                            int cfr_ignored_38 = (int)(0x34EBEF5D23610E67L ^ (long)n3 ^ 0x23CA8A71E7E9C406L);
                                            n4 = (int)((long)(251854868 * 1013118645 + -578650988 ^ n3) ^ 0x21BB4AFC94E801E5L ^ 0x21BB4AFC94E801E5L);
                                            int cfr_ignored_39 = (int)(0x5892EFFE9964575FL ^ (long)n3 ^ 0x228DFE7B55991CF4L);
                                            n4 = 1056742315 * 1013118645 + -578650988 ^ n3;
                                            continue;
                                        }
                                        int cfr_ignored_40 = (Integer.rotateLeft(0xC8D4A534 ^ n3, 12) - 1444782215) * -925588171;
                                        int cfr_ignored_41 = (int)(0x2C709CF38D6461F7L ^ (long)n3 ^ 0xC497D67B38C9F530L);
                                        n4 = -499967489 * 1013118645 + -578650988 ^ n3 ^ 0x122584E1 ^ 0x122584E1;
                                        int cfr_ignored_42 = (int)(0xA1E684A2297CE34DL ^ (long)n3 ^ 0xF4349E4A3DBCEE1CL);
                                        n4 = 1056742315 * 1013118645 + -578650988 ^ n3;
                                        n2 += 5;
                                        continue;
                                    }
                                    int cfr_ignored_43 = (Integer.rotateRight(0x26A49D32 ^ n3, 7) + -1303599031) * 648322355;
                                    n4 = (int)((long)(-1309824817 * 1013118645 + -578650988 ^ n3) ^ 0xDEFFEAD87AF7557DL ^ 0xDEFFEAD87AF7557DL);
                                    int cfr_ignored_44 = (Integer.rotateLeft(0xBE5B5B50 ^ n3, 10) + 292400619) * -1101309103;
                                    n4 = 1056742315 * 1013118645 + -578650988 ^ n3 ^ 0x8A44E48F ^ 0x8A44E48F;
                                    n2 += 4;
                                    continue;
                                }
                                int cfr_ignored_45 = (Integer.rotateLeft(0x94D60A9D ^ n3, 5) - 172550206) * -1797911907;
                                int cfr_ignored_46 = (int)(0x5664A4A027D4EB4FL ^ (long)n3 ^ 0xB430831A2DB90118L);
                                n4 = Integer.reverse(Integer.reverse(-1030967699 * 1013118645 + -578650988 ^ n3));
                                int cfr_ignored_47 = (Integer.rotateRight(0xA73F8AD3 ^ n3, 7) + 1158639304) * -1489007917;
                                try {
                                    n2 += 3;
                                    if ((0xE512107AEF5ADBFDL ^ (long)n3 | 1L) == 0L) {
                                        throw new ArithmeticException();
                                    }
                                    n4 = (1056742315 * 1013118645 + -578650988 ^ n3) + -109127449 - -109127449;
                                }
                                catch (ArithmeticException arithmeticException) {
                                    n4 = Integer.reverse(Integer.reverse(1056742315 * 1013118645 + -578650988 ^ n3));
                                }
                                n2 -= 2;
                                continue;
                            }
                            int cfr_ignored_48 = Integer.rotateRight(0x260FE283 ^ n3, 7) + -1605759720;
                            n4 = Integer.reverse(Integer.reverse(-1752242665 * 1013118645 + -578650988 ^ n3));
                            int cfr_ignored_49 = (Integer.rotateLeft(0xB0BDC838 ^ n3, 9) + 1800986115) * -1329739719;
                            try {
                                ++n2;
                                if ((0xF5BE86A36930B3CBL ^ (long)n3 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                n4 = 1056742315 * 1013118645 + -578650988 ^ n3;
                            }
                            catch (IllegalStateException illegalStateException) {
                                n4 = 1056742315 * 1013118645 + -578650988 ^ n3 ^ 0x111FC3EF ^ 0x111FC3EF;
                            }
                            continue;
                        }
                        int cfr_ignored_50 = Integer.rotateRight(0x1F23DE26 ^ n3, 6) - -910850603;
                        int cfr_ignored_51 = (int)(0x1E103178B270898FL ^ (long)n3 ^ 0x9F81A852E83991F1L);
                        n4 = Integer.reverse(Integer.reverse(691022129 * 1013118645 + -578650988 ^ n3));
                        int cfr_ignored_52 = (int)(0xFD365BBF808784D9L ^ (long)n3 ^ 0x4A0FCDBCF29457BDL);
                        n4 = 1056742315 * 1013118645 + -578650988 ^ n3 ^ 0x63D95175 ^ 0x63D95175;
                        n2 -= 5;
                        continue;
                    }
                    int cfr_ignored_53 = (Integer.rotateLeft(0xBBC97939 ^ n3, 10) + -1044165342) * -1144424135;
                    int cfr_ignored_54 = (int)(0x797BD70427D4EB4FL ^ (long)n3 ^ 0x5378831A2DB95F26L);
                    n4 = -1807640812 * 1013118645 + -578650988 ^ n3;
                    int cfr_ignored_55 = (Integer.rotateRight(0x6E1CF637 ^ n3, 16) - 1507815396) * 1847391799;
                    n4 = 1056742315 * 1013118645 + -578650988 ^ n3;
                    --n2;
                    continue;
                }
                return f3;
            }
            int cfr_ignored_56 = (Integer.rotateLeft(0x8CD63AD5 ^ n3, 4) - 307150598) * -1932117291;
            int cfr_ignored_57 = (int)(0x4E6494E827D4EB4FL ^ (long)n3 ^ 0xD4A0831A2DB93118L);
            n4 = 1056742315 * 1013118645 + -578650988 ^ n3 ^ 0xEAA8C3EE ^ 0xEAA8C3EE;
        }
    }

    private float zmb(int n, float f, float f2, float f3) {
        float f4;
        try {
            int n2 = -1947005839;
            n2 = Integer.rotateLeft(n2 * 1050561317, 10) ^ 0x8A0519FF;
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 4);
            n2 = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n2, 18);
            int n3 = n2 ^ 0x1E7DAB22;
            if ((n3 ^ n2) != 511552290) {
                int cfr_ignored_0 = (0x958EA753 ^ n2) + 1285738374;
            }
            if ((0x249 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        int n4 = n & 1749131435 - 1749131420;
        float f5 = f4 = n4 < (0xA34996A5 ^ 0xA34996AD) ? f : f2;
        float f6 = n4 < 4 ? f2 : (n4 == -196678976 + 196678988 || n4 == (bhy.dbd_4(302784152) ^ 0x19783046) ? f : f3);
        return ((n4 & 1) == 0 ? f4 : -f4) + ((n4 & 2) == 0 ? f6 : -f6);
    }

    /*
     * Unable to fully structure code
     */
    public float twz_4(float var1_1, float var2_2, int var3_3, float var4_4, float var5_5) {
        var6_6 = 0.0f;
        var7_7 = 0.0f;
        var8_8 = 0.0f;
        var9_9 = 0.0f;
        var10_10 = 0;
        var11_11 = 0.0f;
        var14_12 = 0;
        var12_13 = -406155857;
        var12_13 = Integer.rotateLeft(var12_13 * 1837225909, 7) ^ 1816009221;
        var12_13 = Float.floatToIntBits(var2_2) ^ var12_13;
        var12_13 = Integer.rotateRight(Float.floatToIntBits(var5_5) ^ var12_13, 11);
        var13_14 = (762189847 * 1874980073 + -1423325828 ^ var12_13) + -614072916 - -614072916;
        while (true) {
            block37: {
                block39: {
                    block42: {
                        block35: {
                            block34: {
                                block43: {
                                    block41: {
                                        block33: {
                                            block44: {
                                                block40: {
                                                    block38: {
                                                        block46: {
                                                            block36: {
                                                                block45: {
                                                                    var14_12 = ((var13_14 ^ var12_13) - -1423325828) * 546155353;
                                                                    switch (var14_12 & 7) {
                                                                        case 0: {
                                                                            if (var14_12 != -358525528) {
                                                                                ** break;
                                                                            }
                                                                            break block33;
                                                                        }
                                                                        case 1: {
                                                                            if (var14_12 == -2127708743) break block34;
                                                                            if (var14_12 != -339430247) {
                                                                                (Integer.rotateRight(2083491322 ^ var12_13, 18) + 236966017) * 2083491323;
                                                                                ** break;
                                                                            }
                                                                            break block35;
                                                                        }
                                                                        case 2: {
                                                                            if (var14_12 == 144031890) break;
                                                                            if (var14_12 == 145906538) break block36;
                                                                            (Integer.rotateRight(1987582938 ^ var12_13, 17) + 1558773409) * 1987582939;
                                                                            if (var14_12 != -1297268270) {
                                                                                ** break;
                                                                            }
                                                                            break block37;
                                                                        }
                                                                        case 3: {
                                                                            if (var14_12 == 238483603) break block38;
                                                                            if (var14_12 != -1918032829) {
                                                                                ** break;
                                                                            }
                                                                            break block39;
                                                                        }
                                                                        case 4: {
                                                                            if (var14_12 != -1514314044) {
                                                                                ** break;
                                                                            }
                                                                            break block40;
                                                                        }
                                                                        case 5: {
                                                                            if (var14_12 != 89267365) {
                                                                                ** break;
                                                                            }
                                                                            break block41;
                                                                        }
                                                                        case 6: {
                                                                            if (var14_12 == -1964285922) break block42;
                                                                            if (var14_12 != 480810158) {
                                                                                Integer.rotateLeft(1570472256 ^ var12_13, 14) + 1513244155;
                                                                                ** break;
                                                                            }
                                                                            break block43;
                                                                        }
                                                                        case 7: {
                                                                            if (var14_12 == -517612769) break block44;
                                                                            if (var14_12 == 762189847) break block45;
                                                                            if (var14_12 != -1294176049) {
                                                                                ** break;
                                                                            }
                                                                            break block46;
                                                                        }
                                                                    }
                                                                    Integer.rotateRight(988731975 ^ var12_13, 10) - 659164628;
                                                                    if (var10_10 < var3_3) {
                                                                        var13_14 = (808268372 * 1874980073 + -1423325828 ^ var12_13) + -1824924166 - -1824924166;
                                                                        (Integer.rotateLeft(-1641718671 ^ var12_13, 6) + 719573226) * -1641718671;
                                                                        (int)(6672067781872380751L ^ (long)var12_13 ^ 1866886194004563198L);
                                                                        var13_14 = -1294176049 * 1874980073 + -1423325828 ^ var12_13 ^ -675682079 ^ -675682079;
                                                                        var14_12 += 4;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        var14_12 -= 4;
                                                                        var13_14 = (int)((long)(145906538 * 1874980073 + -1423325828 ^ var12_13) ^ 7302325542725040574L ^ 7302325542725040574L);
                                                                    }
                                                                    catch (ArithmeticException v0) {
                                                                        var13_14 = (int)((long)(145906538 * 1874980073 + -1423325828 ^ var12_13) ^ 8636676105377079244L ^ 8636676105377079244L);
                                                                    }
                                                                    continue;
                                                                }
                                                                Integer.rotateLeft(1207847789 ^ var12_13, 11) - -1138179730;
                                                                (int)(-8841439836006716593L ^ (long)var12_13 ^ 4021858615701317448L);
                                                                var6_6 = 0.0f;
                                                                var7_7 = 1.0f;
                                                                var8_8 = 1.0f;
                                                                var9_9 = 0.0f;
                                                                var10_10 = 0;
                                                                try {
                                                                    var14_12 += 4;
                                                                    if ((853443383393563403L ^ (long)var12_13 | 1L) == 0L) {
                                                                        throw new UnsupportedOperationException();
                                                                    }
                                                                    var13_14 = 144031890 * 1874980073 + -1423325828 ^ var12_13 ^ 376838273 ^ 376838273;
                                                                }
                                                                catch (UnsupportedOperationException v1) {
                                                                    var13_14 = Integer.reverse(Integer.reverse(144031890 * 1874980073 + -1423325828 ^ var12_13));
                                                                }
                                                                --var14_12;
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(-696654591 ^ var12_13, 13) + -48211366;
                                                            (int)(1498374022769208143L ^ (long)var12_13 ^ 7712558510331495495L);
                                                            var11_11 = var6_6 / var9_9;
                                                            (int)(6653704875717253336L ^ (long)var12_13 ^ -7504960289103211140L);
                                                            var13_14 = Integer.reverse(Integer.reverse(455902183 * 1874980073 + -1423325828 ^ var12_13));
                                                            (int)(567884009051056651L ^ (long)var12_13 ^ -896640143837781486L);
                                                            var13_14 = (-1297268270 * 1874980073 + -1423325828 ^ var12_13) + -690617380 - -690617380;
                                                            var14_12 += 3;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(7465167 ^ var12_13, 3) - 304664652;
                                                        var6_6 += bhy.tdgh_4(this, var1_1 * var7_7, var2_2 * var7_7) * var8_8;
                                                        var9_9 += var8_8;
                                                        var8_8 *= var4_4;
                                                        var7_7 *= var5_5;
                                                        ++var10_10;
                                                        try {
                                                            var14_12 += 2;
                                                            if ((-3439658279570369709L ^ (long)var12_13 | 1L) == 0L) {
                                                                throw new NoSuchElementException();
                                                            }
                                                            var13_14 = Integer.reverse(Integer.reverse(144031890 * 1874980073 + -1423325828 ^ var12_13));
                                                        }
                                                        catch (NoSuchElementException v2) {
                                                            var13_14 = (144031890 * 1874980073 + -1423325828 ^ var12_13) + -1658471782 - -1658471782;
                                                        }
                                                        var14_12 -= 4;
                                                        continue;
                                                    }
                                                    Integer.rotateRight(1166797358 ^ var12_13, 11) - 1884224205;
                                                    var13_14 = (469353847 * 1874980073 + -1423325828 ^ var12_13) + 1310236133 - 1310236133;
                                                    (Integer.rotateLeft(-838961968 ^ var12_13, 12) + -164772757) * -838961967;
                                                    (int)(3265168924905893058L ^ (long)var12_13 ^ -7576156412156053647L);
                                                    var13_14 = 442576671 * 1874980073 + -1423325828 ^ var12_13 ^ -1139719156 ^ -1139719156;
                                                    (int)(1889300144084881605L ^ (long)var12_13 ^ -5367736327713482335L);
                                                    var13_14 = 762189847 * 1874980073 + -1423325828 ^ var12_13;
                                                    var14_12 += 5;
                                                    continue;
                                                }
                                                Integer.rotateRight(-777127965 ^ var12_13, 13) + 1752081336;
                                                try {
                                                    var14_12 -= 5;
                                                    var13_14 = (int)((long)(762189847 * 1874980073 + -1423325828 ^ var12_13) ^ 5898301049160004912L ^ 5898301049160004912L);
                                                }
                                                catch (UnsupportedOperationException v3) {
                                                    var13_14 = Integer.reverse(Integer.reverse(762189847 * 1874980073 + -1423325828 ^ var12_13));
                                                }
                                                var14_12 += 4;
                                                continue;
                                            }
                                            Integer.rotateRight(1235778183 ^ var12_13, 12) - -272337516;
                                            var13_14 = 1633689843 * 1874980073 + -1423325828 ^ var12_13;
                                            Integer.rotateRight(-1491533553 ^ var12_13, 7) - 1080344588;
                                            var13_14 = (int)((long)(512843224 * 1874980073 + -1423325828 ^ var12_13) ^ 1078911735598087192L ^ 1078911735598087192L);
                                            Integer.rotateLeft(-1421814303 ^ var12_13, 8) + -1053325958;
                                            (int)(7634300503837698895L ^ (long)var12_13 ^ 777015084180930101L);
                                            var13_14 = 762189847 * 1874980073 + -1423325828 ^ var12_13 ^ -1589385127 ^ -1589385127;
                                            var14_12 += 5;
                                            continue;
                                        }
                                        Integer.rotateLeft(-710340787 ^ var12_13, 13) - -472483442;
                                        (int)(1665101990320204623L ^ (long)var12_13 ^ -4643067067359460378L);
                                        var13_14 = (int)((long)(762189847 * 1874980073 + -1423325828 ^ var12_13) ^ -7511210543050779134L ^ -7511210543050779134L);
                                        Integer.rotateRight(1477943406 ^ var12_13, 14) - -1355150195;
                                        var14_12 -= 3;
                                        continue;
                                    }
                                    (Integer.rotateLeft(-1471731656 ^ var12_13, 8) + 1694203395) * -1471731655;
                                    (int)(-4397279486726271736L ^ (long)var12_13 ^ -8195069657397975006L);
                                    var13_14 = (1056359132 * 1874980073 + -1423325828 ^ var12_13) + -586706793 - -586706793;
                                    (int)(8049426968931561607L ^ (long)var12_13 ^ 7146295105277227707L);
                                    var13_14 = 762189847 * 1874980073 + -1423325828 ^ var12_13;
                                    var14_12 += 2;
                                    continue;
                                }
                                (Integer.rotateRight(-1435978917 ^ var12_13, 8) + -1492428992) * -1435978917;
                                var13_14 = Integer.reverse(Integer.reverse(872336297 * 1874980073 + -1423325828 ^ var12_13));
                                (Integer.rotateRight(1594242843 ^ var12_13, 14) + -2044834944) * 1594242843;
                                (int)(-7084476622327829321L ^ (long)var12_13 ^ 4136813120981603980L);
                                var13_14 = 762189847 * 1874980073 + -1423325828 ^ var12_13 ^ 1015709892 ^ 1015709892;
                                var14_12 -= 3;
                                continue;
                            }
                            Integer.rotateRight(-1299711121 ^ var12_13, 9) - -1563094612;
                            var13_14 = (-1547376659 * 1874980073 + -1423325828 ^ var12_13) + 396537886 - 396537886;
                            (Integer.rotateRight(-315536997 ^ var12_13, 16) + -1118467840) * -315536997;
                            var13_14 = 762189847 * 1874980073 + -1423325828 ^ var12_13 ^ 823812872 ^ 823812872;
                            (Integer.rotateRight(89394646 ^ var12_13, 3) - -1450488795) * 89394647;
                            --var14_12;
                            continue;
                        }
                        (Integer.rotateLeft(1706131985 ^ var12_13, 15) + 1423728458) * 1706131985;
                        (int)(-6412232876287005873L ^ (long)var12_13 ^ -6545837909923535913L);
                        var13_14 = (int)((long)(-165809052 * 1874980073 + -1423325828 ^ var12_13) ^ 6855427639971657474L ^ 6855427639971657474L);
                        Integer.rotateLeft(602489225 ^ var12_13, 7) + 1570541266;
                        (int)(-2207907635253679281L ^ (long)var12_13 ^ 2456857745190055782L);
                        var13_14 = 762189847 * 1874980073 + -1423325828 ^ var12_13;
                        continue;
                    }
                    (Integer.rotateLeft(-1900723691 ^ var12_13, 4) - 1280352198) * -1900723691;
                    (int)(5478607128930609999L ^ (long)var12_13 ^ 2675282327117575646L);
                    try {
                        if ((2436825241389861899L ^ (long)var12_13 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var13_14 = 762189847 * 1874980073 + -1423325828 ^ var12_13;
                    }
                    catch (IllegalStateException v4) {
                        var13_14 = 762189847 * 1874980073 + -1423325828 ^ var12_13;
                    }
                    var14_12 -= 2;
                    continue;
                }
                Integer.rotateRight(1444689262 ^ var12_13, 13) - 1908938637;
                var13_14 = (int)((long)(-1723979173 * 1874980073 + -1423325828 ^ var12_13) ^ 1200038759381307643L ^ 1200038759381307643L);
                (Integer.rotateRight(1088572498 ^ var12_13, 11) + -540746455) * 1088572499;
                var13_14 = Integer.reverse(Integer.reverse(762189847 * 1874980073 + -1423325828 ^ var12_13));
                continue;
            }
            return var11_11;
lbl249:
            // 9 sources

            Integer.rotateRight(-1302770133 ^ var12_13, 9) + -1657923984;
            var13_14 = (762189847 * 1874980073 + -1423325828 ^ var12_13) + -1622893424 - -1622893424;
        }
    }

    private static boolean srkh_2() {
        block0: {
            int n = -2020742087;
            int n2 = (n = Integer.rotateLeft(n * 211190167, 3) ^ 0x23F167F9) ^ 0xADB5F0BA;
            if ((n2 ^ n) == -1380585286) break block0;
            int cfr_ignored_0 = (0x2A381C83 ^ n) + -949274943;
        }
        return yf.dnkh();
    }

    private static float zbdh(bhy bhy2, float f) {
        block0: {
            int n = 2023522935;
            n = Integer.rotateLeft(n * 735784455, 12) ^ 0x30366D0E;
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 9);
            int n2 = n ^ 0x3E8757C3;
            if ((n2 ^ n) == 1049057219) break block0;
            int cfr_ignored_0 = (0x461BD5B4 ^ n) + 1572174718;
        }
        return bhy2.tzk_2(f);
    }

    private static float dhak(bhy bhy2, float f, float f2, float f3) {
        block0: {
            int n = -1547851928;
            n = Integer.rotateLeft(n * -592670509, 14) ^ 0x19DC200D;
            n = Integer.rotateRight(Float.floatToIntBits(f2) ^ n, 12);
            n = Float.floatToIntBits(f3) ^ n;
            int n2 = n ^ 0x73F86AFA;
            if ((n2 ^ n) == 1945660154) break block0;
            int cfr_ignored_0 = (0xD045CD92 ^ n) - -1792785163;
        }
        return bhy2.sash(f, f2, f3);
    }

    private static float sjz_4(bhy bhy2, int n, float f, float f2) {
        block0: {
            int n2 = -62675869;
            n2 = Integer.rotateLeft(n2 * 1246127335, 26) ^ 0xFEE3CEAC;
            bhy bhy3 = bhy2;
            n2 = Integer.rotateLeft((bhy3 != null ? System.identityHashCode(bhy3) : 0) ^ n2, 3);
            int n3 = (n2 = n ^ n2) ^ 0x8ED6C191;
            if ((n3 ^ n2) == -1898528367) break block0;
            int cfr_ignored_0 = (0x729565F2 ^ n2) - -1193920591;
        }
        return bhy2.taq_2(n, f, f2);
    }

    private static float dzkh(bhy bhy2, float f, float f2, float f3) {
        block0: {
            int n = 1428484495;
            n = Integer.rotateLeft(n * 1213056905, 19) ^ 0x2C1737C4;
            bhy bhy3 = bhy2;
            n = Integer.rotateRight((bhy3 != null ? System.identityHashCode(bhy3) : 0) ^ n, 28);
            n = Float.floatToIntBits(f) ^ n;
            int n2 = n ^ 0xA4C3E271;
            if ((n2 ^ n) == -1530666383) break block0;
            int cfr_ignored_0 = (0xF1E713FE ^ n) + -1530336944;
        }
        return bhy2.sash(f, f2, f3);
    }

    private static float dl_2(bhy bhy2, int n, float f, float f2, float f3) {
        block0: {
            int n2 = -1534954201;
            n2 = Integer.rotateLeft(n2 * 1630982967, 5) ^ 0xBA35C2B3;
            bhy bhy3 = bhy2;
            n2 = (bhy3 != null ? System.identityHashCode(bhy3) : 0) ^ n2;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 17)) ^ 0x83B11E15;
            if ((n3 ^ n2) == -2085544427) break block0;
            int cfr_ignored_0 = (0x27336B32 ^ n2) - -1468854494;
        }
        return bhy2.zmb(n, f, f2, f3);
    }

    private static float jyz(bhy bhy2, float f, float f2, float f3) {
        block0: {
            int n = -353475358;
            n = Integer.rotateLeft(n * -1734442249, 24) ^ 0xAF1DD793;
            bhy bhy3 = bhy2;
            n = Integer.rotateRight((bhy3 != null ? System.identityHashCode(bhy3) : 0) ^ n, 24);
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0x5AEFBF0D;
            if ((n2 ^ n) == 1525661453) break block0;
            int cfr_ignored_0 = (0xB001DBEF ^ n) + -1095134654;
        }
        return bhy2.sash(f, f2, f3);
    }

    private static float hst_3(bhy bhy2, float f, float f2, float f3) {
        block0: {
            int n = 1980835484;
            n = Integer.rotateLeft(n * -1647731607, 26) ^ 0x18EB3371;
            bhy bhy3 = bhy2;
            n = (bhy3 != null ? System.identityHashCode(bhy3) : 0) ^ n;
            int n2 = n ^ 0xF1E89E60;
            if ((n2 ^ n) == -236413344) break block0;
            int cfr_ignored_0 = (0x87F9B8FC ^ n) + -294357389;
        }
        return bhy2.sash(f, f2, f3);
    }

    private static boolean thrz() {
        block0: {
            int n = 1165696303;
            int n2 = (n = Integer.rotateLeft(n * 978899773, 5) ^ 0x8CFDC453) ^ 0x2F58DA1;
            if ((n2 ^ n) == 49647009) break block0;
            int cfr_ignored_0 = (0x478E908E ^ n) + -1378489308;
        }
        return yf.khdha_2();
    }

    private static void ghsz_3() {
        int n = 366136133;
        int n2 = (n = Integer.rotateLeft(n * 383703785, 21) ^ 0x70AE05A8) ^ 0x5B7CE5D9;
        if ((n2 ^ n) != 1534911961) {
            int cfr_ignored_0 = (0x4EAE2E9C ^ n) - -647959147;
        }
        yf.athz_2();
    }

    private static int dbd_4(int n) {
        block0: {
            int n2 = -1486141810;
            int n3 = (n2 = Integer.rotateLeft(n2 * -754864047, 14) ^ 0x9BC69124) ^ 0xA7141F7F;
            if ((n3 ^ n2) == -1491853441) break block0;
            int cfr_ignored_0 = (0x7F59F1 ^ n2) + -400229188;
        }
        return Integer.reverse(n);
    }

    private static float tdgh_4(bhy bhy2, float f, float f2) {
        block0: {
            int n = -1396881154;
            n = Integer.rotateLeft(n * -1758748083, 15) ^ 0xBA25E504;
            bhy bhy3 = bhy2;
            n = Integer.rotateRight((bhy3 != null ? System.identityHashCode(bhy3) : 0) ^ n, 6);
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0x9D856A11;
            if ((n2 ^ n) == -1652200943) break block0;
            int cfr_ignored_0 = (0x313822EF ^ n) - 1189097337;
        }
        return bhy2.sdj_2(f, f2);
    }

    private static String[] dlf_2(String string) {
        int n = 1463728894;
        n = Integer.rotateLeft(n * 1985416821, 28) ^ 0xEBC705E0;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 16);
        int n2 = n ^ 0xBE611A20;
        if ((n2 ^ n) != -1100932576) {
            int cfr_ignored_0 = (0xE95FA0DE ^ n) - -1561934699;
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

    private static CallSite tzd(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -385603498;
            n3 = Integer.rotateLeft(n3 * -2124331487, 5) ^ 0x41E0A495;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 13);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 24);
            int n4 = n3 ^ 0x8FB18451;
            if ((n4 ^ n3) != -1884191663) {
                int cfr_ignored_0 = (0x66B5AC07 ^ n3) - -1439438993;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dyn ^ string.hashCode() ^ n2 + dhyj ^ i * -1015915325 ^ dyn, 9) ^ dhyj));
            }
            String[] stringArray = bhy.dlf_2(new String(cArray));
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

    private static String[] o49vc3azk3l(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite kfuea6nr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ zic2gzhm3kz4 ^ string.hashCode() ^ n2 + btebph9wdzt8 ^ i * -1230310503 ^ zic2gzhm3kz4, 17) ^ btebph9wdzt8));
            }
            String[] stringArray = bhy.o49vc3azk3l(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

