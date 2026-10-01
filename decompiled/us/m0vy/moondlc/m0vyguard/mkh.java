/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1792
 *  net.minecraft.class_1802
 *  net.minecraft.class_2246
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_2382
 *  net.minecraft.class_239
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2680
 *  net.minecraft.class_2769
 *  net.minecraft.class_2885
 *  net.minecraft.class_3965
 *  net.minecraft.class_4969
 *  net.minecraft.class_638
 *  net.minecraft.class_7204
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2769;
import net.minecraft.class_2885;
import net.minecraft.class_3965;
import net.minecraft.class_4969;
import net.minecraft.class_638;
import net.minecraft.class_7204;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bjd_2;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.btj_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bfn;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tas;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tjf;
import us.m0vy.moondlc.m0vyguard.dj_2;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.zm_2;
import us.m0vy.moondlc.m0vyguard.km;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Anchor Tap", category=bzw.OTHER, desc="Automatically charges and detonates respawn anchors")
public class mkh
extends bnq {
    private static final int hkd = 8;
    private static final class_2350[] thza_2;
    private static mkh rtht_2;
    public final tay shar_2 = new tay(this, "Delay").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(0xBB0DCFEF ^ 0xFBADCFEF)).rkh_3(1.0f).ssd_5(0.0f);
    public final badh_2 dhlkh = new badh_2(this, "Safe Anchor").bts(false);
    public final badh_2 jwr = new badh_2(this, "Air Replace").bts(false);
    private tjf dhwdh = tjf.zthk;
    private zm_2 shad_4;
    private class_2338 bzsh_2;
    private class_3965 sddh_2;
    private class_2338 tlh_2;
    private class_3965 jjd;
    private boolean thza;
    private boolean ssr;
    private boolean bzq;
    private boolean dhdr_2;
    private boolean brr;
    private int khsq_2 = -1;
    private int bthh = -1;
    private int szs_2;
    private int khzl_2;
    private final bql<btt> thhd = this::zghh_4;
    private final bql<bjd_2> hrd_2 = this::daa_4;
    private static final int khm = -679819220;
    private static final int dhyn = 1543863350;
    private static final int shht_2 = -671396186;
    private static final int sthn = -1419077579;
    private static final int rvut7tx = -1660940110;
    private static final int dxato8ift = 311336932;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int twbi6fii;

    public mkh() {
        rtht_2 = this;
    }

    public static mkh khta() {
        block0: {
            int n = tas.dsr_2(1836643617);
            int n2 = n ^ 0x3B63D31F;
            if ((n2 ^ n) == 996397855) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x561B263E ^ n, 13) - 1906786493) * 1444619839;
        }
        return rtht_2;
    }

    @Override
    public void nt() {
        int n = 0;
        int n2 = -1487617266;
        n2 = Integer.rotateLeft(n2 * 1555201529, 9) ^ 0x5D1D26CD;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x47AD161B ^ 0xC53D8470)));
        block22: while (true) {
            switch (Integer.reverse(n3) ^ n2 ^ 0xC53D8470) {
                case 715064265: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0x1384DD95 ^ n2, 5) - 1635021894) * 327474581;
                    int cfr_ignored_1 = (int)(0xD13673A827D4EB4FL ^ (long)n2 ^ 0x1A20831A2DB80FBDL);
                    this.thza = false;
                    this.ssr = false;
                    this.als();
                    return;
                }
                case 1202525723: {
                    int cfr_ignored_2 = (Integer.rotateRight(0xDD9E0772 ^ n2, 14) + -629111287) * -576845965;
                    if (yf.khdha_2()) {
                        n3 = (int)((long)Integer.reverse(n2 ^ 0x2A9F03C9 ^ 0xC53D8470) ^ 0xE7D6C9379F751754L ^ 0xE7D6C9379F751754L);
                        continue block22;
                    }
                    n3 = Integer.reverse(n2 ^ 0x24A489F8 ^ 0xC53D8470);
                    continue block22;
                }
                case 614763000: {
                    int cfr_ignored_3 = Integer.rotateRight(0xCD4B5726 ^ n2, 12) - -528667435;
                    mkh.zghgh_2();
                    throw null;
                }
                case -537754199: {
                    int cfr_ignored_4 = (Integer.rotateLeft(0x5E64DBBC ^ n2, 14) - 1922317055) * 1583668157;
                    n3 = Integer.reverse(n2 ^ 0x1BBF24B8 ^ 0xC53D8470) ^ 0x9A060416 ^ 0x9A060416;
                    int cfr_ignored_5 = Integer.rotateRight(0x54FD5027 ^ n2, 13) - 1326076916;
                    int cfr_ignored_6 = (int)(0x642205BB324DCA65L ^ (long)n2 ^ 0xF606A8286FED6595L);
                    n3 = Integer.reverse(n2 ^ 0x6EE1EF3B ^ 0xC53D8470) + 463456421 - 463456421;
                    int cfr_ignored_7 = (int)(0x4DAF0529F7DF301FL ^ (long)n2 ^ 0xF723230D9B19368FL);
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x47AD161B ^ 0xC53D8470) ^ 0xA2581329A5523335L ^ 0xA2581329A5523335L);
                    n += 3;
                    continue block22;
                }
                case -138220663: {
                    int cfr_ignored_8 = (Integer.rotateRight(0xBD354D17 ^ n2, 10) - -305007356) * -1120580329;
                    try {
                        n -= 2;
                        if ((0xDAB2180987838EB3L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(n2 ^ 0x47AD161B ^ 0xC53D8470) + -405917211 - -405917211;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)Integer.reverse(n2 ^ 0x47AD161B ^ 0xC53D8470) ^ 0xDCFF0215A5C4D528L ^ 0xDCFF0215A5C4D528L);
                    }
                    n += 5;
                    continue block22;
                }
                case 986842187: {
                    int cfr_ignored_9 = (Integer.rotateLeft(0x1324AB95 ^ n2, 5) - 1439589958) * 321170325;
                    int cfr_ignored_10 = (int)(0xD19605A827D4EB4FL ^ (long)n2 ^ 0xF620831A2DB80EFDL);
                    n3 = Integer.reverse(n2 ^ 0x47AD161B ^ 0xC53D8470) + 931059355 - 931059355;
                    int cfr_ignored_11 = (Integer.rotateLeft(0x5E54249C ^ n2, 14) - 1888357919) * 1582572701;
                    n -= 4;
                    continue block22;
                }
                case -473607205: {
                    int cfr_ignored_12 = (Integer.rotateLeft(0x239E07B8 ^ n2, 7) + 1417711235) * 597559225;
                    n3 = Integer.reverse(n2 ^ 0x47AD161B ^ 0xC53D8470) + 639380423 - 639380423;
                    continue block22;
                }
                case 1559773314: {
                    int cfr_ignored_13 = Integer.rotateRight(0xDB9F3522 ^ n2, 14) + -1666904487;
                    try {
                        if ((0xD5788001E43D0F1DL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(n2 ^ 0x47AD161B ^ 0xC53D8470);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x47AD161B ^ 0xC53D8470)));
                    }
                    ++n;
                    continue block22;
                }
                case 980283463: {
                    int cfr_ignored_14 = (Integer.rotateRight(0xF97968FB ^ n2, 18) + 974214560) * -109483781;
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x47AD161B ^ 0xC53D8470) ^ 0xCF6C82758E0AC92CL ^ 0xCF6C82758E0AC92CL);
                    int cfr_ignored_15 = (Integer.rotateLeft(0xE4689A18 ^ n2, 15) + -1391966173) * -462906855;
                    n += 4;
                    continue block22;
                }
                case -949532757: {
                    int cfr_ignored_16 = (Integer.rotateLeft(0xBBFBD9D8 ^ n2, 10) + -941817757) * -1141122599;
                    int cfr_ignored_17 = (int)(0xB5FA925C0F416BE5L ^ (long)n2 ^ 0xD9C8D2312CECC624L);
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x47AD161B ^ 0xC53D8470)));
                    n -= 3;
                    continue block22;
                }
                case -300878994: {
                    int cfr_ignored_18 = (Integer.rotateLeft(0xDD146F9C ^ n2, 14) - -908647649) * -585863267;
                    int cfr_ignored_19 = (int)(0xC132BEE762A5BDFDL ^ (long)n2 ^ 0x80BE09F880DC2FB4L);
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x47AD161B ^ 0xC53D8470)));
                    continue block22;
                }
                case -692529983: {
                    int cfr_ignored_20 = Integer.rotateRight(0xD101E683 ^ n2, 13) + 1402505496;
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x47AD161B ^ 0xC53D8470)));
                    n += 5;
                    continue block22;
                }
                case 1096619771: {
                    int cfr_ignored_21 = (Integer.rotateLeft(0xE04A7CD1 ^ n2, 15) + 761445514) * -531989295;
                    int cfr_ignored_22 = (int)(0x22F8D2EC27D4EB4FL ^ (long)n2 ^ 0x58A8831A2DB9E820L);
                    n3 = Integer.reverse(n2 ^ 0xFFE27744 ^ 0xC53D8470);
                    int cfr_ignored_23 = (Integer.rotateLeft(0xDC7B7035 ^ n2, 14) - -1219480154) * -595890123;
                    int cfr_ignored_24 = (int)(0x1EC9DE0827D4EB4FL ^ (long)n2 ^ 0x4160831A2DB99042L);
                    n3 = Integer.reverse(n2 ^ 0x47AD161B ^ 0xC53D8470) + -874646139 - -874646139;
                    n -= 2;
                    continue block22;
                }
                case -1732108017: {
                    int cfr_ignored_25 = Integer.rotateLeft(0xC9DEFE8 ^ n2, 4) + -1954698157;
                    try {
                        if ((0x7EBFCCE2BDB8BE57L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(n2 ^ 0x47AD161B ^ 0xC53D8470) + -1401892110 - -1401892110;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(n2 ^ 0x47AD161B ^ 0xC53D8470) ^ 0xC309FBDA ^ 0xC309FBDA;
                    }
                    n += 3;
                    continue block22;
                }
            }
            int cfr_ignored_26 = Integer.rotateLeft(0xA9E0B225 ^ n2, 8) - -1768738378;
            int cfr_ignored_27 = (int)(0x6B521C1827D4EB4FL ^ (long)n2 ^ 0xC540831A2DB97B75L);
            n3 = Integer.reverse(n2 ^ 0x47AD161B ^ 0xC53D8470) + -1673260956 - -1673260956;
        }
    }

    @Override
    public void nc() {
        int n = 0;
        int n2 = 1683903200;
        n2 = Integer.rotateLeft(n2 * 700293105, 7) ^ 0x44022401;
        int n3 = Integer.rotateLeft(n2 ^ 0xB35B0CA1, 9) ^ 0x20DE3D60 ^ 0x20DE3D60;
        while (true) {
            block16: {
                block21: {
                    block28: {
                        block23: {
                            block24: {
                                block25: {
                                    block13: {
                                        block20: {
                                            block30: {
                                                block19: {
                                                    block14: {
                                                        block27: {
                                                            block29: {
                                                                block15: {
                                                                    block18: {
                                                                        block26: {
                                                                            block22: {
                                                                                block11: {
                                                                                    block17: {
                                                                                        block12: {
                                                                                            if ((n = Integer.rotateRight(n3, 9) ^ n2) > -569934190) break block11;
                                                                                            if (n > -1465068638) break block12;
                                                                                            if (n == -1990845924) break block13;
                                                                                            if (n == -1589534177) break block14;
                                                                                            if (n == -1465068638) break block15;
                                                                                            break block16;
                                                                                        }
                                                                                        if (n > -1048280237) break block17;
                                                                                        if (n == -1285878623) break block18;
                                                                                        if (n == -1048280237) break block19;
                                                                                        int cfr_ignored_0 = (Integer.rotateLeft(0x3D5A2379 ^ n2, 10) + 1917315810) * 1029317497;
                                                                                        int cfr_ignored_1 = (int)(0xFFE88D4427D4EB4FL ^ (long)n2 ^ 0xE7F8831A2DB85200L);
                                                                                        break block16;
                                                                                    }
                                                                                    if (n == -882110701) break block20;
                                                                                    if (n == -569934190) break block21;
                                                                                    int cfr_ignored_2 = (Integer.rotateRight(0x1E470412 ^ n2, 6) + -1359536791) * 507970579;
                                                                                    break block16;
                                                                                }
                                                                                if (n > -382379414) break block22;
                                                                                if (n == -500357611) break block23;
                                                                                if (n == -466316086) break block24;
                                                                                int cfr_ignored_3 = Integer.rotateLeft(0x8A7C1868 ^ n2, 4) + -916155437;
                                                                                if (n == -382379414) break block25;
                                                                                break block16;
                                                                            }
                                                                            if (n > 275607930) break block26;
                                                                            if (n == -200937566) break block27;
                                                                            if (n == 275607930) break block28;
                                                                            int cfr_ignored_4 = Integer.rotateLeft(0x3F30048D ^ n2, 10) - -1423037362;
                                                                            int cfr_ignored_5 = (int)(0xFD82AAB027D4EB4FL ^ (long)n2 ^ 0xA810831A2DB856D4L);
                                                                            break block16;
                                                                        }
                                                                        if (n == 312983311) break block29;
                                                                        if (n == 538701966) break block30;
                                                                        break block16;
                                                                    }
                                                                    int cfr_ignored_6 = Integer.rotateLeft(0x4A93B6E5 ^ n2, 12) - 205571318;
                                                                    int cfr_ignored_7 = (int)(0x882118D827D4EB4FL ^ (long)n2 ^ 0xCCC0831A2DB8BD93L);
                                                                    if (!mkh.shra_2()) {
                                                                        try {
                                                                            ++n;
                                                                            if ((0xE3CB83248AFA6099L ^ (long)n2 | 1L) == 0L) {
                                                                                throw new IllegalArgumentException();
                                                                            }
                                                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x12A7BF0F, 9)));
                                                                        }
                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                            n3 = Integer.rotateLeft(n2 ^ 0x12A7BF0F, 9) + 718335588 - 718335588;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_8 = (int)(0x8C0175D93CEE0F09L ^ (long)n2 ^ 0x16C2B56FE534B5D3L);
                                                                    n3 = Integer.rotateLeft(n2 ^ 0x9E2F6D05, 9);
                                                                    int cfr_ignored_9 = (int)(0xB9133F1C7C9A86F2L ^ (long)n2 ^ 0x83483586F6C2DFF7L);
                                                                    n3 = Integer.rotateLeft(n2 ^ 0xA8ACD3A2, 9) + 1274557379 - 1274557379;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_10 = Integer.rotateRight(0x1D5CFD4E ^ n2, 6) - -1834988627;
                                                                mkh.afh(this);
                                                                this.thza = false;
                                                                this.ssr = false;
                                                                return;
                                                            }
                                                            int cfr_ignored_11 = Integer.rotateLeft(0x199163A1 ^ n2, 6) + 486059962;
                                                            int cfr_ignored_12 = (int)(0xDB23CD9C27D4EB4FL ^ (long)n2 ^ 0x6648831A2DB81B96L);
                                                            yf.athz_2();
                                                            n3 = Integer.rotateLeft(n2 ^ 0xA8ACD3A2, 9);
                                                            n += 3;
                                                            continue;
                                                        }
                                                        int cfr_ignored_13 = (Integer.rotateRight(0x1EF85B1B ^ n2, 6) + -999250048) * 519592731;
                                                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x48F79675, 9)));
                                                        int cfr_ignored_14 = (Integer.rotateRight(0xDB14A95B ^ n2, 14) + -1948376768) * -619402917;
                                                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xB35B0CA1, 9) ^ 0xF453CAB1A9AF83E9L ^ 0xF453CAB1A9AF83E9L);
                                                        n += 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_15 = Integer.rotateRight(0xCD41732B ^ n2, 12) + -548761232;
                                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xF19196B9, 9) ^ 0xAB0511D200AC2B98L ^ 0xAB0511D200AC2B98L);
                                                    int cfr_ignored_16 = (Integer.rotateRight(0x650FFA37 ^ n2, 15) - 1095560164) * 1695545911;
                                                    n3 = Integer.rotateLeft(n2 ^ 0xB35B0CA1, 9) + 1669375439 - 1669375439;
                                                    n -= 5;
                                                    continue;
                                                }
                                                int cfr_ignored_17 = Integer.rotateRight(0xB0CCA522 ^ n2, 9) + 1831181913;
                                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x4A880F3B, 9)));
                                                int cfr_ignored_18 = (Integer.rotateLeft(0x5EE595B8 ^ n2, 14) + -2111127421) * 1592104377;
                                                int cfr_ignored_19 = (int)(0x5260E760AF991C3CL ^ (long)n2 ^ 0x33B19381C35F0910L);
                                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xB35B0CA1, 9)));
                                                n -= 5;
                                                continue;
                                            }
                                            int cfr_ignored_20 = Integer.rotateRight(0x1C84A06F ^ n2, 6) - 2020412588;
                                            n3 = Integer.rotateLeft(n2 ^ 0xA041F9FD, 9);
                                            int cfr_ignored_21 = (Integer.rotateRight(0xFDE0A35A ^ n2, 18) + -1030658271) * -35609765;
                                            n3 = Integer.rotateLeft(n2 ^ 0xCA1E03CD, 9) + -514638558 - -514638558;
                                            int cfr_ignored_22 = (Integer.rotateLeft(0x794A0FD5 ^ n2, 18) - -1269462522) * 2034896853;
                                            int cfr_ignored_23 = (int)(0xBBF8A1E827D4EB4FL ^ (long)n2 ^ 0xBEA0831A2DB8DA20L);
                                            n3 = Integer.rotateLeft(n2 ^ 0xB35B0CA1, 9);
                                            continue;
                                        }
                                        int cfr_ignored_24 = (Integer.rotateRight(0x7067AD5B ^ n2, 17) + -1595171520) * 1885842779;
                                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x93F9F72F, 9) ^ 0xA46DC7F3DD5ECDACL ^ 0xA46DC7F3DD5ECDACL);
                                        int cfr_ignored_25 = Integer.rotateLeft(0x1CA06DC4 ^ n2, 6) - 2076895735;
                                        int cfr_ignored_26 = (int)(0xF634BE5505C4D89CL ^ (long)n2 ^ 0x81DAC73A4A1E41B8L);
                                        n3 = Integer.rotateLeft(n2 ^ 0xE0AAF053, 9) ^ 0x6508A9BE ^ 0x6508A9BE;
                                        int cfr_ignored_27 = (int)(0x3CE581914BB0B481L ^ (long)n2 ^ 0xFE525BD29225D41AL);
                                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xB35B0CA1, 9) ^ 0xB349CD7AF16CC6E0L ^ 0xB349CD7AF16CC6E0L);
                                        n += 2;
                                        continue;
                                    }
                                    int cfr_ignored_28 = Integer.rotateLeft(0x61D35044 ^ n2, 15) - -587966601;
                                    n3 = Integer.rotateLeft(n2 ^ 0xAFE95715, 9) + 1697120407 - 1697120407;
                                    int cfr_ignored_29 = (Integer.rotateRight(0x730F3BFF ^ n2, 17) - -214572260) * 1930378239;
                                    int cfr_ignored_30 = (int)(0x71E12F4313C6AC99L ^ (long)n2 ^ 0xA3F6EB3EA2154E13L);
                                    n3 = Integer.rotateLeft(n2 ^ 0xB35B0CA1, 9) + 1742435694 - 1742435694;
                                    n -= 3;
                                    continue;
                                }
                                int cfr_ignored_31 = Integer.rotateRight(0x47D0F04F ^ n2, 11) - -1230325556;
                                n3 = Integer.rotateLeft(n2 ^ 0x49C55945, 9) + 1136153689 - 1136153689;
                                int cfr_ignored_32 = Integer.rotateLeft(0x7F72B660 ^ n2, 18) + 1933685979;
                                try {
                                    n += 2;
                                    if ((0x9AA959C736106F81L ^ (long)n2 | 1L) == 0L) {
                                        throw new ArithmeticException();
                                    }
                                    n3 = Integer.rotateLeft(n2 ^ 0xB35B0CA1, 9) + 909678915 - 909678915;
                                }
                                catch (ArithmeticException arithmeticException) {
                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xB35B0CA1, 9)));
                                }
                                n -= 3;
                                continue;
                            }
                            int cfr_ignored_33 = (Integer.rotateLeft(0xF45C0F7D ^ n2, 17) - -1685880994) * -195293315;
                            int cfr_ignored_34 = (int)(0x36EEA14027D4EB4FL ^ (long)n2 ^ 0xBFF0831A2DB9C00CL);
                            n3 = Integer.rotateLeft(n2 ^ 0xC592417C, 9) ^ 0x6B0DAE43 ^ 0x6B0DAE43;
                            int cfr_ignored_35 = Integer.rotateRight(0x3DDC90AF ^ n2, 10) - -2112674708;
                            n3 = Integer.rotateLeft(n2 ^ 0xB35B0CA1, 9) ^ 0x63DAE0CB ^ 0x63DAE0CB;
                            int cfr_ignored_36 = Integer.rotateLeft(0x1276F968 ^ n2, 5) + 1086706387;
                            n += 2;
                            continue;
                        }
                        int cfr_ignored_37 = (Integer.rotateRight(0x7EDCCBB ^ n2, 3) + -97949216) * 133024955;
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x13899CF4, 9) ^ 0x54E110108A2B8D92L ^ 0x54E110108A2B8D92L);
                        int cfr_ignored_38 = (Integer.rotateLeft(0x4434CF7D ^ n2, 11) - 1187168094) * 1144311677;
                        int cfr_ignored_39 = (int)(0x8686614027D4EB4FL ^ (long)n2 ^ 0x3FF0831A2DB8A0DDL);
                        int cfr_ignored_40 = (int)(0x5BF88FAA3FED6CEBL ^ (long)n2 ^ 0xE224B36922F11A20L);
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x7F7C81E4, 9) ^ 0xD0D2CB640F53CF83L ^ 0xD0D2CB640F53CF83L);
                        int cfr_ignored_41 = (int)(0xA46A5016C026365DL ^ (long)n2 ^ 0x5D5D4CFF979CE505L);
                        n3 = Integer.rotateLeft(n2 ^ 0xB35B0CA1, 9) ^ 0x36B72696 ^ 0x36B72696;
                        n += 3;
                        continue;
                    }
                    int cfr_ignored_42 = (Integer.rotateRight(0x44D2F2F7 ^ n2, 11) - 1508444964) * 1154675447;
                    n3 = Integer.rotateLeft(n2 ^ 0x25499FF5, 9) ^ 0x17EF9665 ^ 0x17EF9665;
                    int cfr_ignored_43 = Integer.rotateRight(0xC50B6326 ^ n2, 11) - -524377899;
                    try {
                        n -= 2;
                        if ((0x5032389F250F7647L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0xB35B0CA1, 9);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.rotateLeft(n2 ^ 0xB35B0CA1, 9) ^ 0xCDC58079 ^ 0xCDC58079;
                    }
                    n -= 5;
                    continue;
                }
                int cfr_ignored_44 = Integer.rotateRight(0xF02DC96E ^ n2, 17) - 434701197;
                n3 = Integer.rotateLeft(n2 ^ 0xB35B0CA1, 9) ^ 0xABDD2715 ^ 0xABDD2715;
                int cfr_ignored_45 = Integer.rotateRight(0x6CC98C23 ^ n2, 16) + 818255736;
                n -= 5;
                continue;
            }
            int cfr_ignored_46 = (Integer.rotateLeft(0x2606917D ^ n2, 7) - -1624687266) * 637964669;
            int cfr_ignored_47 = (int)(0xE4B43F4027D4EB4FL ^ (long)n2 ^ 0x83F0831A2DB864B9L);
            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xB35B0CA1, 9)));
        }
    }

    public boolean ththf() {
        class_239 class_2392;
        int n = 1173953847;
        n = Integer.rotateLeft(n * 814988753, 17) ^ 0xE13C12D9;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 12);
        int n2 = n ^ 0x844BD2FF;
        if ((n2 ^ n) != -2075405569) {
            int cfr_ignored_0 = (0xC1B2CFC8 ^ n) - 2124021498;
        }
        if (mkh.zrz_2()) {
            throw null;
        }
        if (!this.rgha_2() || mkh.mc.field_1724 == null || mkh.mc.field_1687 == null || mkh.mc.field_1755 != null) {
            return false;
        }
        if (this.dhwdh != tjf.zthk || this.ssr) {
            return true;
        }
        if (!mkh.mc.field_1690.field_1904.method_1434() || !((class_2392 = mkh.mc.field_1765) instanceof class_3965)) {
            return false;
        }
        class_3965 class_39652 = (class_3965)class_2392;
        return mkh.azt(mkh.mc.field_1687.method_8320(mkh.znr_2(class_39652)), class_2246.field_23152);
    }

    private void thldh() {
        class_3965 class_39652;
        try {
            int n = -1132018746;
            n = Integer.rotateLeft(n * 211598467, 10) ^ 0xDDBAD63B;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x72C191E9;
            if ((n2 ^ n) != 1925288425) {
                int cfr_ignored_0 = (0xCE47522F ^ n) + 427424351;
            }
            if ((0x2F7 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_239 class_2392 = mkh.mc.field_1765;
        if (!(class_2392 instanceof class_3965) || !mkh.mc.field_1687.method_8320((class_39652 = (class_3965)class_2392).method_17777()).method_27852(class_2246.field_23152)) {
            return;
        }
        if (btj_2.shwth(mkh.dkm_2(class_39652)) > mkh.tbt_3(Integer.reverse(1419882546) ^ 0xE1D852A)) {
            return;
        }
        this.bzsh_2 = mkh.zdh_3(class_39652).method_10062();
        this.sddh_2 = this.thnm(class_39652);
        this.khsq_2 = mkh.mc.field_1724.method_31548().field_7545;
        this.ssr = true;
        this.dhwdh = tjf.dtm;
        this.asb();
    }

    private void asb() {
        int n = tas.dsr_2(-1088634559);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xF9C1A785;
        if ((n2 ^ n) != -104749179) {
            int cfr_ignored_0 = Integer.rotateLeft(0x46DD66C4 ^ n, 11) - -1725099785;
        }
        mkh.szd_2(this);
        if (this.bzsh_2 == null) {
            mkh.thtd_4(this);
            return;
        }
        class_2680 class_26802 = mkh.jql(mkh.mc.field_1687, this.bzsh_2);
        if (!class_26802.method_27852(class_2246.field_23152)) {
            if (this.brr && this.jwr.shzl()) {
                this.jlsh();
            } else {
                mkh.bthz_2(this);
            }
            return;
        }
        if (this.brr) {
            if (++this.khzl_2 > (Integer.reverse(1009576345) ^ 0x99973434)) {
                this.als();
            } else {
                this.add_2();
            }
            return;
        }
        int n3 = (Integer)class_26802.method_11654((class_2769)class_4969.field_23153);
        if (this.dhdr_2 && n3 == 0) {
            if (++this.khzl_2 <= -1381767741 - -1381767749) {
                this.add_2();
                return;
            }
            this.dhdr_2 = false;
            this.khzl_2 = 0;
        } else if (n3 > 0) {
            this.dhdr_2 = false;
            this.khzl_2 = 0;
        }
        if (mkh.shk(this.dhlkh) && mkh.rhm_2(this)) {
            return;
        }
        if (n3 == 0) {
            int n4 = mkh.tkht_2(this, class_1802.field_8801);
            if (n4 == -1) {
                this.als();
                return;
            }
            mkh.shnz_2(this, zm_2.zqdh, n4, mkh.shtdh_2(this), null, false);
            return;
        }
        int n5 = mkh.tsb(this);
        if (n5 == -1) {
            this.als();
            return;
        }
        this.dshs_3(zm_2.br, n5, mkh.khnsh(this), null, !mkh.shdd(this.jwr));
    }

    private boolean dhsd_3() {
        try {
            int n = 1930669744;
            n = Integer.rotateLeft(n * 2048876507, 8) ^ 0x8428ADB4;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x54FBA679;
            if ((n2 ^ n) != 1425778297) {
                int cfr_ignored_0 = (0x27E808C9 ^ n) + 56139838;
            }
            if ((0xE3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_2338[] class_2338Array = this.tsn_3();
        if (class_2338Array.length == 0) {
            int n = 0;
            if (yf.tdhth_2() == 0) {
                n = n ^ 0x89CE;
            }
            return n != 0;
        }
        for (class_2338 class_23382 : class_2338Array) {
            if (!mkh.khwy(class_23382)) continue;
            return false;
        }
        int n = this.zjdh(class_1802.field_8281);
        if (n == -1) {
            mkh.zss_8(this);
            return true;
        }
        for (class_2338 class_23383 : class_2338Array) {
            if (!mkh.nk(mkh.mc.field_1687.method_8320(class_23383))) continue;
            class_3965 class_39652 = mkh.hha_4(class_23383, dj_2.sjw_2, false);
            if (class_39652 == null) {
                class_39652 = mkh.tjth_2(class_23383, dj_2.shh_7, false);
            }
            if (class_39652 == null) continue;
            mkh.awh(this, zm_2.sba_2, n, class_39652, class_23383, false);
            return true;
        }
        mkh.ddr_4(this);
        return true;
    }

    private void jlsh() {
        int n = this.zjdh(class_1802.field_23141);
        if (n == -1) {
            this.als();
            return;
        }
        class_3965 class_39652 = btj_2.twd_4(this.bzsh_2, dj_2.sjw_2, false);
        if (class_39652 == null) {
            class_39652 = btj_2.twd_4(this.bzsh_2, dj_2.shh_7, false);
        }
        if (class_39652 == null) {
            if (++this.khzl_2 > 8) {
                this.als();
            } else {
                this.add_2();
            }
            return;
        }
        this.dshs_3(zm_2.dhjsh, n, class_39652, this.bzsh_2, true);
    }

    private void dshs_3(zm_2 zm2, int n, class_3965 class_39652, class_2338 class_23382, boolean bl) {
        int n2 = 0;
        int n3 = 930535931;
        n3 = Integer.rotateLeft(n3 * 199124063, 21) ^ 0x27C50155;
        n3 = System.identityHashCode(this) ^ n3;
        zm_2 zm3 = zm2;
        n3 = (zm3 != null ? System.identityHashCode((Object)zm3) : 0) ^ n3;
        int n4 = (int)((long)((n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210) ^ 0x658234B5A948F785L ^ 0x658234B5A948F785L);
        while (true) {
            block25: {
                block23: {
                    block46: {
                        block34: {
                            block31: {
                                block45: {
                                    block43: {
                                        block38: {
                                            block40: {
                                                block24: {
                                                    block39: {
                                                        block48: {
                                                            block44: {
                                                                block26: {
                                                                    block32: {
                                                                        block33: {
                                                                            block41: {
                                                                                block28: {
                                                                                    block27: {
                                                                                        block47: {
                                                                                            block37: {
                                                                                                block30: {
                                                                                                    block42: {
                                                                                                        block35: {
                                                                                                            block36: {
                                                                                                                block20: {
                                                                                                                    block29: {
                                                                                                                        block21: {
                                                                                                                            block22: {
                                                                                                                                if ((n2 = n4 - -839777210 ^ 0xCDF20446 ^ n3) > -83356609) break block20;
                                                                                                                                if (n2 > -1232423316) break block21;
                                                                                                                                if (n2 > -1833698508) break block22;
                                                                                                                                if (n2 == -2077281167) break block23;
                                                                                                                                if (n2 == -1833698508) break block24;
                                                                                                                                break block25;
                                                                                                                            }
                                                                                                                            if (n2 == -1609634110) break block26;
                                                                                                                            if (n2 == -1534718769) break block27;
                                                                                                                            if (n2 == -1232423316) break block28;
                                                                                                                            break block25;
                                                                                                                        }
                                                                                                                        if (n2 > -980467074) break block29;
                                                                                                                        if (n2 == -1196325965) break block30;
                                                                                                                        if (n2 == -980467074) break block31;
                                                                                                                        int cfr_ignored_0 = Integer.rotateRight(0x8B1F423 ^ n3, 4) + 300560248;
                                                                                                                        break block25;
                                                                                                                    }
                                                                                                                    if (n2 == -392331404) break block32;
                                                                                                                    if (n2 == -201351752) break block33;
                                                                                                                    if (n2 == -83356609) break block34;
                                                                                                                    break block25;
                                                                                                                }
                                                                                                                if (n2 > 681436863) break block35;
                                                                                                                if (n2 > 246831722) break block36;
                                                                                                                if (n2 == 2173862) break block37;
                                                                                                                if (n2 == 246831722) break block38;
                                                                                                                break block25;
                                                                                                            }
                                                                                                            if (n2 == 301858040) break block39;
                                                                                                            if (n2 == 385005789) break block40;
                                                                                                            if (n2 == 681436863) break block41;
                                                                                                            break block25;
                                                                                                        }
                                                                                                        if (n2 > 1453448703) break block42;
                                                                                                        if (n2 == 1012736587) break block43;
                                                                                                        if (n2 == 1196673308) break block44;
                                                                                                        if (n2 == 1453448703) break block45;
                                                                                                        break block25;
                                                                                                    }
                                                                                                    if (n2 == 1650097306) break block46;
                                                                                                    if (n2 == 1810316414) break block47;
                                                                                                    int cfr_ignored_1 = (Integer.rotateRight(0x7E967E97 ^ n3, 18) - 1486287748) * 2123792023;
                                                                                                    if (n2 == 1927786455) break block48;
                                                                                                    break block25;
                                                                                                }
                                                                                                int cfr_ignored_2 = Integer.rotateLeft(0x7B312D64 ^ n3, 18) - -279830953;
                                                                                                if (class_39652 == null) {
                                                                                                    n4 = Integer.reverse(Integer.reverse((n3 ^ 0xB68AB66C ^ 0xCDF20446) + -839777210));
                                                                                                    n2 += 4;
                                                                                                    continue;
                                                                                                }
                                                                                                n4 = (n3 ^ 0x1DD8EE46 ^ 0xCDF20446) + -839777210;
                                                                                                int cfr_ignored_3 = Integer.rotateLeft(0x84AA8960 ^ n3, 3) + 352600539;
                                                                                                n4 = (n3 ^ 0xA4860CCF ^ 0xCDF20446) + -839777210 + -685476877 - -685476877;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_4 = (Integer.rotateRight(0x4326F976 ^ n3, 11) - 638964869) * 1126627703;
                                                                                            if (n >= 0) {
                                                                                                int cfr_ignored_5 = (int)(0xF337BF37DE68E78L ^ (long)n3 ^ 0xA96377EE7D7B3B7L);
                                                                                                n4 = Integer.reverse(Integer.reverse((n3 ^ 0xE89D7F74 ^ 0xCDF20446) + -839777210));
                                                                                                ++n2;
                                                                                                continue;
                                                                                            }
                                                                                            n4 = (n3 ^ 0x2549ED4D ^ 0xCDF20446) + -839777210 + 1932679573 - 1932679573;
                                                                                            int cfr_ignored_6 = Integer.rotateLeft(0x2C349EC5 ^ n3, 8) - 1589434646;
                                                                                            int cfr_ignored_7 = (int)(0xEE8630F827D4EB4FL ^ (long)n3 ^ 0x9C80831A2DB870DDL);
                                                                                            n4 = Integer.reverse(Integer.reverse((n3 ^ 0xB68AB66C ^ 0xCDF20446) + -839777210));
                                                                                            n2 -= 5;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_8 = Integer.rotateLeft(0xDE7A9861 ^ n3, 14) + -181005574;
                                                                                        int cfr_ignored_9 = (int)(0x1CC8365C27D4EB4FL ^ (long)n3 ^ 0x91C8831A2DB99441L);
                                                                                        mkh.hkh_3();
                                                                                        int cfr_ignored_10 = (int)(0x15E3C480BE704D02L ^ (long)n3 ^ 0x7471B05361238616L);
                                                                                        n4 = (n3 ^ 0xAB07BF88 ^ 0xCDF20446) + -839777210 + -590749096 - -590749096;
                                                                                        int cfr_ignored_11 = (int)(0xB0E113B6D46EE2AEL ^ (long)n3 ^ 0xDA1D646E3E7ACC13L);
                                                                                        n4 = (n3 ^ 0x212BA6 ^ 0xCDF20446) + -839777210 + 356197845 - 356197845;
                                                                                        n2 += 3;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_12 = Integer.rotateLeft(0x2D4FE64D ^ n3, 8) - -2130017650;
                                                                                    int cfr_ignored_13 = (int)(0xEFFD487027D4EB4FL ^ (long)n3 ^ 0x6D90831A2DB8722BL);
                                                                                    this.shad_4 = zm2;
                                                                                    this.bthh = n;
                                                                                    this.jjd = class_39652;
                                                                                    this.tlh_2 = class_23382;
                                                                                    this.bzq = bl;
                                                                                    this.dhwdh = tjf.tthsh;
                                                                                    return;
                                                                                }
                                                                                int cfr_ignored_14 = Integer.rotateLeft(0x8E7B3844 ^ n3, 4) - 1162440567;
                                                                                mkh.hwy(this);
                                                                                return;
                                                                            }
                                                                            int cfr_ignored_15 = Integer.rotateLeft(0xDF6BACE9 ^ n3, 14) + 308776818;
                                                                            int cfr_ignored_16 = (int)(0x1DD902D427D4EB4FL ^ (long)n3 ^ 0xF8D8831A2DB99663L);
                                                                            if (yf.khdha_2()) {
                                                                                n4 = (n3 ^ 0xABB78DDB ^ 0xCDF20446) + -839777210;
                                                                                int cfr_ignored_17 = Integer.rotateLeft(0x9D2BEE8D ^ n3, 6) - 212828750;
                                                                                int cfr_ignored_18 = (int)(0x5F9940B027D4EB4FL ^ (long)n3 ^ 0x7C10831A2DB912E3L);
                                                                                n4 = (n3 ^ 0x212BA6 ^ 0xCDF20446) + -839777210;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_19 = (int)(0x6F0C2415AC2C9F26L ^ (long)n3 ^ 0xB55B94EAC56B73C9L);
                                                                            n4 = (n3 ^ 0x6BE73C7E ^ 0xCDF20446) + -839777210 ^ 0xCF896F3F ^ 0xCF896F3F;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_20 = Integer.rotateRight(0x6DD9C867 ^ n3, 16) - 1371333556;
                                                                        if (!yf.khdha_2()) {
                                                                            int cfr_ignored_21 = (int)(0xF028D8E9F6E9F4B3L ^ (long)n3 ^ 0x4CA3216012404D80L);
                                                                            n4 = (int)((long)((n3 ^ 0x5CC73A26 ^ 0xCDF20446) + -839777210) ^ 0x6F6CA6C547342881L ^ 0x6F6CA6C547342881L);
                                                                            int cfr_ignored_22 = (int)(0x8342A7B0053AE8D1L ^ (long)n3 ^ 0xB210C6C62A84AB54L);
                                                                            n4 = Integer.reverse(Integer.reverse((n3 ^ 0x6BE73C7E ^ 0xCDF20446) + -839777210));
                                                                            n2 -= 4;
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            if ((0x98AB9C4CA57B12F9L ^ (long)n3 | 1L) == 0L) {
                                                                                throw new IllegalArgumentException();
                                                                            }
                                                                            n4 = Integer.reverse(Integer.reverse((n3 ^ 0x212BA6 ^ 0xCDF20446) + -839777210));
                                                                        }
                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                            n4 = (n3 ^ 0x212BA6 ^ 0xCDF20446) + -839777210;
                                                                        }
                                                                        n2 -= 4;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_23 = Integer.rotateLeft(0x8B7BF7A0 ^ n3, 4) + -396321893;
                                                                    if (n > -1780677892 - -1780677900) {
                                                                        try {
                                                                            n2 -= 3;
                                                                            if ((0x6B6D1D4C2308825FL ^ (long)n3 | 1L) == 0L) {
                                                                                throw new ArithmeticException();
                                                                            }
                                                                            n4 = (n3 ^ 0xB68AB66C ^ 0xCDF20446) + -839777210 + -1343629478 - -1343629478;
                                                                        }
                                                                        catch (ArithmeticException arithmeticException) {
                                                                            n4 = (n3 ^ 0xB68AB66C ^ 0xCDF20446) + -839777210 + -186541873 - -186541873;
                                                                        }
                                                                        n2 += 3;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_24 = (int)(0x40AE8054C3528828L ^ (long)n3 ^ 0xFDD94A16EB772C8CL);
                                                                    n4 = (n3 ^ 0xB8B183B3 ^ 0xCDF20446) + -839777210 ^ 0x22E9206 ^ 0x22E9206;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_25 = Integer.rotateLeft(0x7371D0E4 ^ n3, 17) - -14292265;
                                                                try {
                                                                    n2 -= 4;
                                                                    if ((0x5BED5386B717C9DDL ^ (long)n3 | 1L) == 0L) {
                                                                        throw new UnsupportedOperationException();
                                                                    }
                                                                    n4 = (int)((long)((n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210) ^ 0x7EB2C58F2313CABEL ^ 0x7EB2C58F2313CABEL);
                                                                }
                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                    n4 = Integer.reverse(Integer.reverse((n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210));
                                                                }
                                                                ++n2;
                                                                continue;
                                                            }
                                                            int cfr_ignored_26 = (Integer.rotateRight(0x9BCC21B6 ^ n3, 6) - -501894075) * -1681120841;
                                                            n4 = (int)((long)((n3 ^ 0x5E2411E ^ 0xCDF20446) + -839777210) ^ 0x1057F82E0AD01FBDL ^ 0x1057F82E0AD01FBDL);
                                                            int cfr_ignored_27 = (Integer.rotateLeft(0xB3681535 ^ n3, 9) - -1107808090) * -1285024459;
                                                            int cfr_ignored_28 = (int)(0x71DABB0827D4EB4FL ^ (long)n3 ^ 0x8B60831A2DB94E64L);
                                                            n4 = (n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210;
                                                            n2 += 2;
                                                            continue;
                                                        }
                                                        int cfr_ignored_29 = (Integer.rotateRight(0x447FC292 ^ n3, 11) + 1339436777) * 1149223571;
                                                        n4 = (n3 ^ 0xFA113479 ^ 0xCDF20446) + -839777210 + -121511877 - -121511877;
                                                        int cfr_ignored_30 = Integer.rotateRight(0xE749D287 ^ n3, 15) - 105782676;
                                                        int cfr_ignored_31 = (int)(0xEC26F62BF3D18E8BL ^ (long)n3 ^ 0x11272B10E630759CL);
                                                        n4 = Integer.reverse(Integer.reverse((n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210));
                                                        continue;
                                                    }
                                                    int cfr_ignored_32 = (Integer.rotateLeft(0x7826377D ^ n3, 18) - -1862379682) * 2015770493;
                                                    int cfr_ignored_33 = (int)(0xBA94994027D4EB4FL ^ (long)n3 ^ 0xCFF0831A2DB8D8F8L);
                                                    int cfr_ignored_34 = (int)(0xD6BDF7459871D01FL ^ (long)n3 ^ 0x13FBFC505B1800AAL);
                                                    n4 = (n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210 + -610198661 - -610198661;
                                                    continue;
                                                }
                                                int cfr_ignored_35 = (Integer.rotateRight(0x3377C2D3 ^ n3, 9) + 1071527624) * 863486675;
                                                n4 = (n3 ^ 0xEF4A435B ^ 0xCDF20446) + -839777210;
                                                int cfr_ignored_36 = (Integer.rotateLeft(0xD4CAEB71 ^ n3, 13) + -923786774) * -724898959;
                                                int cfr_ignored_37 = (int)(0x1678454C27D4EB4FL ^ (long)n3 ^ 0x77E8831A2DB98121L);
                                                n4 = (n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210 + 352315756 - 352315756;
                                                int cfr_ignored_38 = (Integer.rotateLeft(0xF81F29BC ^ n3, 18) - 270773503) * -132175427;
                                                continue;
                                            }
                                            int cfr_ignored_39 = Integer.rotateLeft(0x2CEA3DA0 ^ n3, 8) + 1958417819;
                                            n4 = (n3 ^ 0x3A9A258C ^ 0xCDF20446) + -839777210 + 1296032126 - 1296032126;
                                            int cfr_ignored_40 = (Integer.rotateRight(0x10EFC7B7 ^ n3, 5) - 291950180) * 284149687;
                                            n4 = (int)((long)((n3 ^ 0x345A5A2B ^ 0xCDF20446) + -839777210) ^ 0x2BC73C21489F18F6L ^ 0x2BC73C21489F18F6L);
                                            int cfr_ignored_41 = (Integer.rotateLeft(0x7F028B7D ^ n3, 18) - 1705804638) * 2130873213;
                                            int cfr_ignored_42 = (int)(0xBDB0254027D4EB4FL ^ (long)n3 ^ 0xB7F0831A2DB8D6B1L);
                                            n4 = (n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210 ^ 0xA75C074D ^ 0xA75C074D;
                                            n2 -= 5;
                                            continue;
                                        }
                                        int cfr_ignored_43 = Integer.rotateRight(0x9F43D32F ^ n3, 6) - 1301557740;
                                        int cfr_ignored_44 = (int)(0x5ADFDE3F2752BD99L ^ (long)n3 ^ 0x410E82168015186EL);
                                        n4 = (n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210 + 1299859307 - 1299859307;
                                        ++n2;
                                        continue;
                                    }
                                    int cfr_ignored_45 = (Integer.rotateLeft(0x48F38DBD ^ n3, 12) - -639907554) * 1223921085;
                                    int cfr_ignored_46 = (int)(0x8A41238027D4EB4FL ^ (long)n3 ^ 0xBA70831A2DB8B953L);
                                    try {
                                        n2 -= 2;
                                        if ((0x2FF118D3CBCA0DBL ^ (long)n3 | 1L) == 0L) {
                                            throw new NoSuchElementException();
                                        }
                                        n4 = (n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210 + -565237346 - -565237346;
                                    }
                                    catch (NoSuchElementException noSuchElementException) {
                                        n4 = (n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210 ^ 0x155F5359 ^ 0x155F5359;
                                    }
                                    --n2;
                                    continue;
                                }
                                int cfr_ignored_47 = (Integer.rotateLeft(0x5FFEEB3D ^ n3, 14) - -1539564642) * 1610541885;
                                int cfr_ignored_48 = (int)(0x9D4C450027D4EB4FL ^ (long)n3 ^ 0x7770831A2DB89749L);
                                try {
                                    n4 = (n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210 ^ 0xF6DB15EC ^ 0xF6DB15EC;
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    n4 = (int)((long)((n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210) ^ 0x7112A151CBFE441EL ^ 0x7112A151CBFE441EL);
                                }
                                n2 += 5;
                                continue;
                            }
                            int cfr_ignored_49 = Integer.rotateLeft(0x2AA89A65 ^ n3, 8) - 784879990;
                            int cfr_ignored_50 = (int)(0xE81A345827D4EB4FL ^ (long)n3 ^ 0x95C0831A2DB87DE5L);
                            int cfr_ignored_51 = (int)(0x1A960A1CB2397FL ^ (long)n3 ^ 0xD164F5D789D9ADE4L);
                            n4 = (n3 ^ 0x9F987CCB ^ 0xCDF20446) + -839777210 + -615177052 - -615177052;
                            int cfr_ignored_52 = (int)(0xD0A5776361EA4C97L ^ (long)n3 ^ 0x13B60F6762080C9BL);
                            n4 = (int)((long)((n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210) ^ 0x3625497191D946CL ^ 0x3625497191D946CL);
                            continue;
                        }
                        int cfr_ignored_53 = (Integer.rotateLeft(0xA06EDD7C ^ n3, 7) - 1909092671) * -1603347075;
                        n4 = (n3 ^ 0xAD6D7CC8 ^ 0xCDF20446) + -839777210 + -378334383 - -378334383;
                        int cfr_ignored_54 = Integer.rotateRight(0x23059EA6 ^ n3, 7) - 1108071765;
                        int cfr_ignored_55 = (int)(0xC7ABDF8DF7FD257L ^ (long)n3 ^ 0x8681724C5F89B524L);
                        n4 = (n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210;
                        --n2;
                        continue;
                    }
                    int cfr_ignored_56 = Integer.rotateLeft(0xB4D0C4E4 ^ n3, 9) - -375032105;
                    n4 = (n3 ^ 0xBE9A24AC ^ 0xCDF20446) + -839777210 ^ 0x7514115C ^ 0x7514115C;
                    int cfr_ignored_57 = Integer.rotateRight(0xF8F4A6C7 ^ n3, 18) - 704500052;
                    n4 = (n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210;
                    n2 -= 5;
                    continue;
                }
                int cfr_ignored_58 = (Integer.rotateRight(0x6232CD76 ^ n3, 15) - -393969531) * 1647496567;
                n4 = (n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210;
                int cfr_ignored_59 = Integer.rotateRight(0xA500BC0B ^ n3, 7) + -9149296;
                --n2;
                continue;
            }
            int cfr_ignored_60 = Integer.rotateRight(0x1CB3E8A3 ^ n3, 6) + 2116471544;
            n4 = (int)((long)((n3 ^ 0x289DE6BF ^ 0xCDF20446) + -839777210) ^ 0xD6F924D12985BF15L ^ 0xD6F924D12985BF15L);
        }
    }

    private void zdn_2() {
        int n = 560508251;
        n = Integer.rotateLeft(n * -1098114089, 8) ^ 0x5AA9F97A;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x9E6B536E;
        if ((n2 ^ n) != -1637133458) {
            int cfr_ignored_0 = (0xBF03FE35 ^ n) - -630028430;
        }
        if (mkh.thhf()) {
            throw null;
        }
        if (mkh.mc.field_1724 == null || mkh.mc.field_1687 == null || mkh.mc.field_1761 == null || this.shad_4 == null || this.jjd == null || this.bthh < 0 || this.bthh > -1255167722 + 1255167730) {
            this.als();
            return;
        }
        bfn.shkz(this.bthh);
        boolean bl = km.zhm_2;
        km.zhm_2 = true;
        try {
            mkh.thal(this::zshdh_2);
            mkh.mc.field_1724.method_6104(class_1268.field_5808);
        }
        finally {
            km.zhm_2 = bl;
        }
        if (this.tlh_2 != null) {
            btj_2.jrh.put(this.tlh_2, System.currentTimeMillis());
        }
        if (this.shad_4 == zm_2.zqdh) {
            this.dhdr_2 = true;
            this.khzl_2 = 0;
        } else if (this.shad_4 == zm_2.br) {
            this.brr = true;
            this.khzl_2 = 0;
        }
        this.dhwdh = tjf.rtgh_2;
    }

    private void add_2() {
        this.szs_2 = 1;
        this.dhwdh = tjf.dhya_2;
    }

    /*
     * Unable to fully structure code
     */
    private int zjk_2() {
        var1_1 = 0;
        var2_2 = 0;
        var3_3 = 0;
        var6_4 = 0;
        var4_5 = 1988126451;
        var4_5 = Integer.rotateLeft(var4_5 * 820287021, 11) ^ 866516296;
        var4_5 = Integer.rotateLeft(System.identityHashCode(this) ^ var4_5, 24);
        var5_6 = var4_5 - 1460671084 + 819699106 - 819699106;
        while (true) {
            block81: {
                block68: {
                    block78: {
                        block60: {
                            block62: {
                                block73: {
                                    block63: {
                                        block70: {
                                            block65: {
                                                block64: {
                                                    block61: {
                                                        block71: {
                                                            block79: {
                                                                block75: {
                                                                    block82: {
                                                                        block77: {
                                                                            block67: {
                                                                                block72: {
                                                                                    block80: {
                                                                                        block74: {
                                                                                            block83: {
                                                                                                block76: {
                                                                                                    block66: {
                                                                                                        block69: {
                                                                                                            var6_4 = var4_5 - var5_6;
                                                                                                            switch (var6_4 & 15) {
                                                                                                                case 0: {
                                                                                                                    if (var6_4 != -1134408944) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block60;
                                                                                                                }
                                                                                                                case 1: {
                                                                                                                    if (var6_4 == 161999137) break block61;
                                                                                                                    if (var6_4 == -933439439) break block62;
                                                                                                                    if (var6_4 != 924497425) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block63;
                                                                                                                }
                                                                                                                case 2: {
                                                                                                                    if (var6_4 == -855232398) break;
                                                                                                                    if (var6_4 != 263840882) {
                                                                                                                        (Integer.rotateLeft(-1836090404 ^ var4_5, 5) - -1010983201) * -1836090403;
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block64;
                                                                                                                }
                                                                                                                case 5: {
                                                                                                                    if (var6_4 == -2006012763) break block65;
                                                                                                                    if (var6_4 != 2074160485) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block66;
                                                                                                                }
                                                                                                                case 6: {
                                                                                                                    if (var6_4 == 218138918) break block67;
                                                                                                                    if (var6_4 != -217559274) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block68;
                                                                                                                }
                                                                                                                case 8: {
                                                                                                                    if (var6_4 != 1394403816) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block69;
                                                                                                                }
                                                                                                                case 9: {
                                                                                                                    if (var6_4 != -598154391) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block70;
                                                                                                                }
                                                                                                                case 10: {
                                                                                                                    if (var6_4 == -2109337718) break block71;
                                                                                                                    if (var6_4 == -292283638) break block72;
                                                                                                                    Integer.rotateLeft(-892653939 ^ var4_5, 12) - -1829223858;
                                                                                                                    (int)(610660718556277583L ^ (long)var4_5 ^ -283582628064805598L);
                                                                                                                    if (var6_4 != -1285422118) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block73;
                                                                                                                }
                                                                                                                case 11: {
                                                                                                                    if (var6_4 != -550553301) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block74;
                                                                                                                }
                                                                                                                case 12: {
                                                                                                                    if (var6_4 == 1557543804) break block75;
                                                                                                                    if (var6_4 != 1460671084) {
                                                                                                                        (Integer.rotateRight(1419878559 ^ var4_5, 13) - 1139806844) * 1419878559;
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block76;
                                                                                                                }
                                                                                                                case 13: {
                                                                                                                    if (var6_4 != 1745265517) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block77;
                                                                                                                }
                                                                                                                case 14: {
                                                                                                                    if (var6_4 == -1451894962) break block78;
                                                                                                                    if (var6_4 == -247701746) break block79;
                                                                                                                    if (var6_4 != 883754814) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block80;
                                                                                                                }
                                                                                                                case 15: {
                                                                                                                    if (var6_4 == -1415183793) break block81;
                                                                                                                    if (var6_4 == -1429949713) break block82;
                                                                                                                    (Integer.rotateLeft(1916211480 ^ var4_5, 17) + -653741789) * 1916211481;
                                                                                                                    if (var6_4 != -456506129) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block83;
                                                                                                                }
                                                                                                            }
                                                                                                            Integer.rotateLeft(1063756996 ^ var4_5, 10) - -1310027017;
                                                                                                            ++var2_2;
                                                                                                            (int)(3330649052941249216L ^ (long)var4_5 ^ 5919239162655404448L);
                                                                                                            var5_6 = var4_5 - 1044635637 + -301290591 - -301290591;
                                                                                                            (int)(-1958912807208935166L ^ (long)var4_5 ^ -1500626656327211920L);
                                                                                                            var5_6 = (int)((long)(var4_5 - 2074160485) ^ 2076697973964063172L ^ 2076697973964063172L);
                                                                                                            continue;
                                                                                                        }
                                                                                                        (Integer.rotateLeft(-1142090128 ^ var4_5, 10) + -971811125) * -1142090127;
                                                                                                        var3_3 = -1;
                                                                                                        var5_6 = (int)((long)(var4_5 - 29534843) ^ -1136841411085278625L ^ -1136841411085278625L);
                                                                                                        Integer.rotateLeft(-817854739 ^ var4_5, 12) - 489551342;
                                                                                                        (int)(1004910541343615823L ^ (long)var4_5 ^ -5994146955570596299L);
                                                                                                        var5_6 = (int)((long)(var4_5 - -1415183793) ^ 4511032189876069881L ^ 4511032189876069881L);
                                                                                                        var6_4 += 5;
                                                                                                        continue;
                                                                                                    }
                                                                                                    Integer.rotateLeft(-1195018104 ^ var4_5, 10) + 1682388915;
                                                                                                    if (var2_2 >= -603590164 - -603590173) {
                                                                                                        try {
                                                                                                            var5_6 = var4_5 - 1394403816 + -123245711 - -123245711;
                                                                                                        }
                                                                                                        catch (IllegalStateException v0) {
                                                                                                            var5_6 = var4_5 - 1394403816 + -1783254744 - -1783254744;
                                                                                                        }
                                                                                                        continue;
                                                                                                    }
                                                                                                    try {
                                                                                                        var6_4 -= 3;
                                                                                                        if ((1834336192382185213L ^ (long)var4_5 | 1L) == 0L) {
                                                                                                            throw new IllegalStateException();
                                                                                                        }
                                                                                                        var5_6 = Integer.reverse(Integer.reverse(var4_5 - 883754814));
                                                                                                    }
                                                                                                    catch (IllegalStateException v1) {
                                                                                                        var5_6 = var4_5 - 883754814 + -545935781 - -545935781;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                (Integer.rotateLeft(564319772 ^ var4_5, 7) - 387288223) * 564319773;
                                                                                                if (!yf.dnkh()) {
                                                                                                    (int)(290728757365808596L ^ (long)var4_5 ^ 4465219235908396480L);
                                                                                                    var5_6 = var4_5 - -182515349;
                                                                                                    (int)(5089269918219870535L ^ (long)var4_5 ^ -8251333849898213232L);
                                                                                                    var5_6 = var4_5 - 218138918 + 386900216 - 386900216;
                                                                                                    var6_4 += 5;
                                                                                                    continue;
                                                                                                }
                                                                                                (int)(6526992213525539639L ^ (long)var4_5 ^ -1379041088768501512L);
                                                                                                var5_6 = (int)((long)(var4_5 - 1657741418) ^ -3878150232410318122L ^ -3878150232410318122L);
                                                                                                (int)(1618239323464894459L ^ (long)var4_5 ^ -5377784141270908613L);
                                                                                                var5_6 = (int)((long)(var4_5 - -1429949713) ^ -4128162211134532783L ^ -4128162211134532783L);
                                                                                                var6_4 -= 5;
                                                                                                continue;
                                                                                            }
                                                                                            Integer.rotateRight(1577432111 ^ var4_5, 14) - 1728999660;
                                                                                            if (yf.dnkh()) {
                                                                                                try {
                                                                                                    var5_6 = (int)((long)(var4_5 - -1429949713) ^ 1729321017877690845L ^ 1729321017877690845L);
                                                                                                }
                                                                                                catch (IllegalArgumentException v2) {
                                                                                                    var5_6 = Integer.reverse(Integer.reverse(var4_5 - -1429949713));
                                                                                                }
                                                                                                var6_4 -= 4;
                                                                                                continue;
                                                                                            }
                                                                                            try {
                                                                                                --var6_4;
                                                                                                if ((-7873483542092451051L ^ (long)var4_5 | 1L) == 0L) {
                                                                                                    throw new IllegalStateException();
                                                                                                }
                                                                                                var5_6 = Integer.reverse(Integer.reverse(var4_5 - 218138918));
                                                                                            }
                                                                                            catch (IllegalStateException v3) {
                                                                                                var5_6 = (int)((long)(var4_5 - 218138918) ^ 6662370947181508785L ^ 6662370947181508785L);
                                                                                            }
                                                                                            var6_4 += 4;
                                                                                            continue;
                                                                                        }
                                                                                        Integer.rotateLeft(1661947948 ^ var4_5, 15) - 54023311;
                                                                                        var2_2 = 0;
                                                                                        (int)(-5658821594529710389L ^ (long)var4_5 ^ 6488396019606277950L);
                                                                                        var5_6 = (int)((long)(var4_5 - -1661324282) ^ 6006405996973857818L ^ 6006405996973857818L);
                                                                                        (int)(7516820558912972314L ^ (long)var4_5 ^ -4215052543701320333L);
                                                                                        var5_6 = (int)((long)(var4_5 - 2074160485) ^ -7756635404553114115L ^ -7756635404553114115L);
                                                                                        var6_4 -= 4;
                                                                                        continue;
                                                                                    }
                                                                                    (Integer.rotateRight(96493079 ^ var4_5, 3) - -1230437372) * 96493079;
                                                                                    if (!mkh.mc.field_1724.method_31548().method_5438(var2_2).method_31574(class_1802.field_8801)) {
                                                                                        (int)(8810892453869801259L ^ (long)var4_5 ^ -3066200811887306404L);
                                                                                        var5_6 = var4_5 - -292283638 + -732971254 - -732971254;
                                                                                        continue;
                                                                                    }
                                                                                    var5_6 = var4_5 - -53287017 ^ -2019270876 ^ -2019270876;
                                                                                    (Integer.rotateRight(-167234473 ^ var4_5, 17) - -816056892) * -167234473;
                                                                                    var5_6 = (int)((long)(var4_5 - -855232398) ^ 3875532097180801976L ^ 3875532097180801976L);
                                                                                    --var6_4;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateRight(-1311138594 ^ var4_5, 9) - -1917346275) * -1311138593;
                                                                                var3_3 = var2_2;
                                                                                try {
                                                                                    if ((4983238292284500257L ^ (long)var4_5 | 1L) == 0L) {
                                                                                        throw new IllegalArgumentException();
                                                                                    }
                                                                                    var5_6 = var4_5 - -1415183793 + -1370115310 - -1370115310;
                                                                                }
                                                                                catch (IllegalArgumentException v4) {
                                                                                    var5_6 = var4_5 - -1415183793;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            Integer.rotateLeft(-230692883 ^ var4_5, 17) - 1511699694;
                                                                            (int)(3498533643907033935L ^ (long)var4_5 ^ 7985026287787429067L);
                                                                            var1_1 = mkh.mc.field_1724.method_31548().field_7545;
                                                                            if (!mkh.mc.field_1724.method_31548().method_5438(var1_1).method_31574(class_1802.field_8801)) {
                                                                                (int)(4791756086491378162L ^ (long)var4_5 ^ -8864350742299596498L);
                                                                                var5_6 = var4_5 - 1745265517 + 670597337 - 670597337;
                                                                                ++var6_4;
                                                                                continue;
                                                                            }
                                                                            try {
                                                                                var6_4 -= 5;
                                                                                var5_6 = (int)((long)(var4_5 - -550553301) ^ 3029514255015341990L ^ 3029514255015341990L);
                                                                            }
                                                                            catch (IllegalStateException v5) {
                                                                                var5_6 = var4_5 - -550553301 + -1086926429 - -1086926429;
                                                                            }
                                                                            var6_4 += 3;
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateRight(611284983 ^ var4_5, 7) - 1843209764) * 611284983;
                                                                        var3_3 = var1_1;
                                                                        (int)(6926057205776934611L ^ (long)var4_5 ^ 7339358927999561197L);
                                                                        var5_6 = (int)((long)(var4_5 - -1415183793) ^ 3068075872333795788L ^ 3068075872333795788L);
                                                                        var6_4 += 5;
                                                                        continue;
                                                                    }
                                                                    Integer.rotateRight(-2133890298 ^ var4_5, 3) - -1652845323;
                                                                    throw null;
                                                                }
                                                                Integer.rotateLeft(-1512255512 ^ var4_5, 7) + 437963859;
                                                                var5_6 = var4_5 - 2078902660 + 857109460 - 857109460;
                                                                Integer.rotateRight(-1378068378 ^ var4_5, 8) - 302797717;
                                                                try {
                                                                    var6_4 -= 4;
                                                                    if ((3465798011891037933L ^ (long)var4_5 | 1L) == 0L) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                    var5_6 = Integer.reverse(Integer.reverse(var4_5 - 1460671084));
                                                                }
                                                                catch (IllegalStateException v6) {
                                                                    var5_6 = Integer.reverse(Integer.reverse(var4_5 - 1460671084));
                                                                }
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(1556653384 ^ var4_5, 14) + 1084859123;
                                                            var5_6 = var4_5 - -647076624;
                                                            Integer.rotateLeft(-690997084 ^ var4_5, 13) - 127171351;
                                                            (int)(-8607595985255400422L ^ (long)var4_5 ^ -6382676853297857338L);
                                                            var5_6 = var4_5 - -919552904;
                                                            (int)(-33824628433345227L ^ (long)var4_5 ^ 6065002447838663390L);
                                                            var5_6 = Integer.reverse(Integer.reverse(var4_5 - 1460671084));
                                                            var6_4 += 2;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(-1379284639 ^ var4_5, 8) + 265093626;
                                                        (int)(8033128005848329039L ^ (long)var4_5 ^ 3731376439735972647L);
                                                        (int)(-3889594114765091755L ^ (long)var4_5 ^ 4104368363596954075L);
                                                        var5_6 = (int)((long)(var4_5 - 1460671084) ^ 986053586984940668L ^ 986053586984940668L);
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(1445397592 ^ var4_5, 13) + 1930896867) * 1445397593;
                                                    var5_6 = (int)((long)(var4_5 - 1042059797) ^ -213119938734440784L ^ -213119938734440784L);
                                                    (Integer.rotateLeft(1534884861 ^ var4_5, 14) - 410034910) * 1534884861;
                                                    (int)(-7363713319425479857L ^ (long)var4_5 ^ 6264651230131822156L);
                                                    var5_6 = Integer.reverse(Integer.reverse(var4_5 - -1143855009));
                                                    (Integer.rotateRight(-575773326 ^ var4_5, 14) + -595859447) * -575773325;
                                                    var5_6 = var4_5 - 1460671084;
                                                    var6_4 += 2;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(1178216724 ^ var4_5, 11) - -2056742745) * 1178216725;
                                                var5_6 = var4_5 - 307972038 + 705930669 - 705930669;
                                                (Integer.rotateRight(1872158199 ^ var4_5, 16) - -2019393500) * 1872158199;
                                                try {
                                                    --var6_4;
                                                    if ((-812864135446864729L ^ (long)var4_5 | 1L) == 0L) {
                                                        throw new UnsupportedOperationException();
                                                    }
                                                    var5_6 = var4_5 - 1460671084 ^ -330473189 ^ -330473189;
                                                }
                                                catch (UnsupportedOperationException v7) {
                                                    var5_6 = var4_5 - 1460671084 + -2127491835 - -2127491835;
                                                }
                                                var6_4 -= 2;
                                                continue;
                                            }
                                            (Integer.rotateLeft(1538750421 ^ var4_5, 14) - 529867270) * 1538750421;
                                            (int)(-7420285219899118769L ^ (long)var4_5 ^ 5665672479691546586L);
                                            var5_6 = (int)((long)(var4_5 - -1676044070) ^ -4514209771245211789L ^ -4514209771245211789L);
                                            Integer.rotateLeft(-746979679 ^ var4_5, 13) + -1608289094;
                                            (int)(1282207150530423631L ^ (long)var4_5 ^ 6649708998272060999L);
                                            var5_6 = var4_5 - 1460671084 ^ 406169390 ^ 406169390;
                                            Integer.rotateRight(-1736790161 ^ var4_5, 6) - 2067324332;
                                            continue;
                                        }
                                        Integer.rotateLeft(1359031977 ^ var4_5, 13) + -746437198;
                                        (int)(-7803752355491157169L ^ (long)var4_5 ^ -263316429741716810L);
                                        var5_6 = var4_5 - 1460671084;
                                        (Integer.rotateLeft(-919534027 ^ var4_5, 12) - 1632460710) * -919534027;
                                        (int)(829691509347773263L ^ (long)var4_5 ^ -5953614558924260650L);
                                        continue;
                                    }
                                    Integer.rotateRight(1579693550 ^ var4_5, 14) - 1799104269;
                                    var5_6 = var4_5 - -184315171 + 939286612 - 939286612;
                                    Integer.rotateRight(1229655143 ^ var4_5, 12) - -462151756;
                                    try {
                                        var5_6 = Integer.reverse(Integer.reverse(var4_5 - 1460671084));
                                    }
                                    catch (ArithmeticException v8) {
                                        var5_6 = Integer.reverse(Integer.reverse(var4_5 - 1460671084));
                                    }
                                    continue;
                                }
                                Integer.rotateLeft(364678753 ^ var4_5, 5) + -1506616070;
                                (int)(-2950385125703750833L ^ (long)var4_5 ^ -4771419656739617843L);
                                var5_6 = (int)((long)(var4_5 - 1139104457) ^ -395076280978436276L ^ -395076280978436276L);
                                (Integer.rotateLeft(-1084278604 ^ var4_5, 10) - 820346119) * -1084278603;
                                var5_6 = var4_5 - 1460671084;
                                Integer.rotateLeft(1829922368 ^ var4_5, 16) + 966263035;
                                var6_4 -= 4;
                                continue;
                            }
                            (Integer.rotateLeft(1197102356 ^ var4_5, 11) - -1471288153) * 1197102357;
                            try {
                                if ((3630856966327195201L ^ (long)var4_5 | 1L) == 0L) {
                                    throw new NoSuchElementException();
                                }
                                var5_6 = var4_5 - 1460671084 ^ -642421690 ^ -642421690;
                            }
                            catch (NoSuchElementException v9) {
                                var5_6 = var4_5 - 1460671084 ^ 1749682928 ^ 1749682928;
                            }
                            continue;
                        }
                        (Integer.rotateLeft(631253969 ^ var4_5, 7) + -1832718966) * 631253969;
                        (int)(-1796226052040365233L ^ (long)var4_5 ^ -673143995832441868L);
                        var5_6 = (int)((long)(var4_5 - -436512681) ^ 657697064172392525L ^ 657697064172392525L);
                        (Integer.rotateLeft(-1355913072 ^ var4_5, 8) + 989612203) * -1355913071;
                        (int)(4900530535336001507L ^ (long)var4_5 ^ -6886742824388057643L);
                        var5_6 = (int)((long)(var4_5 - 1460671084) ^ -4428265526740002026L ^ -4428265526740002026L);
                        var6_4 += 2;
                        continue;
                    }
                    Integer.rotateRight(166891335 ^ var4_5, 4) - 951908564;
                    var5_6 = var4_5 - 1118154433;
                    (Integer.rotateLeft(-528382060 ^ var4_5, 15) - 873269799) * -528382059;
                    var5_6 = Integer.reverse(Integer.reverse(var4_5 - 1460671084));
                    var6_4 -= 2;
                    continue;
                }
                Integer.rotateLeft(-112368980 ^ var4_5, 18) - 884773391;
                var5_6 = var4_5 - 1226791762;
                Integer.rotateRight(364277327 ^ var4_5, 5) - -1519060276;
                var5_6 = var4_5 - 1460671084 ^ 1318160107 ^ 1318160107;
                var6_4 -= 3;
                continue;
            }
            return var3_3;
lbl401:
            // 14 sources

            (Integer.rotateRight(674767007 ^ var4_5, 8) - -483814788) * 674767007;
            var5_6 = var4_5 - 1460671084 ^ -483452582 ^ -483452582;
        }
    }

    private int zjdh(class_1792 class_17922) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = -988779046;
        n4 = Integer.rotateLeft(n4 * 1078109819, 28) ^ 0x7DFE7A9A;
        n4 = System.identityHashCode(this) ^ n4;
        class_1792 class_17923 = class_17922;
        n4 = Integer.rotateRight((class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n4, 11);
        int n5 = Integer.reverse(Integer.reverse(-914952108 + n4));
        while (true) {
            block35: {
                block49: {
                    block56: {
                        block55: {
                            block51: {
                                block44: {
                                    block36: {
                                        block54: {
                                            block38: {
                                                block33: {
                                                    block48: {
                                                        block37: {
                                                            block57: {
                                                                block42: {
                                                                    block50: {
                                                                        block43: {
                                                                            block34: {
                                                                                block40: {
                                                                                    block47: {
                                                                                        block53: {
                                                                                            block41: {
                                                                                                block52: {
                                                                                                    block45: {
                                                                                                        block46: {
                                                                                                            block30: {
                                                                                                                block39: {
                                                                                                                    block31: {
                                                                                                                        block32: {
                                                                                                                            if ((n3 = n5 - n4) > -663226535) break block30;
                                                                                                                            if (n3 > -1206524204) break block31;
                                                                                                                            if (n3 > -1652543843) break block32;
                                                                                                                            if (n3 == -1784350214) break block33;
                                                                                                                            if (n3 == -1652543843) break block34;
                                                                                                                            break block35;
                                                                                                                        }
                                                                                                                        if (n3 == -1633877237) break block36;
                                                                                                                        if (n3 == -1238177208) break block37;
                                                                                                                        if (n3 == -1206524204) break block38;
                                                                                                                        break block35;
                                                                                                                    }
                                                                                                                    if (n3 > -914952108) break block39;
                                                                                                                    if (n3 == -1104109515) break block40;
                                                                                                                    if (n3 == -914952108) break block41;
                                                                                                                    int cfr_ignored_0 = Integer.rotateRight(0xEE485D62 ^ n4, 16) + -551490023;
                                                                                                                    break block35;
                                                                                                                }
                                                                                                                if (n3 == -794060267) break block42;
                                                                                                                if (n3 == -743617521) break block43;
                                                                                                                if (n3 == -663226535) break block44;
                                                                                                                break block35;
                                                                                                            }
                                                                                                            if (n3 > 45635568) break block45;
                                                                                                            if (n3 > -204505838) break block46;
                                                                                                            if (n3 == -584127083) break block47;
                                                                                                            if (n3 == -204505838) break block48;
                                                                                                            break block35;
                                                                                                        }
                                                                                                        if (n3 == -41232498) break block49;
                                                                                                        if (n3 == -41230679) break block50;
                                                                                                        int cfr_ignored_1 = (Integer.rotateRight(0xD89D1BF ^ n4, 4) - -1475476132) * 227135935;
                                                                                                        if (n3 == 45635568) break block51;
                                                                                                        break block35;
                                                                                                    }
                                                                                                    if (n3 > 491195594) break block52;
                                                                                                    if (n3 == 234917409) break block53;
                                                                                                    if (n3 == 491195594) break block54;
                                                                                                    int cfr_ignored_2 = (Integer.rotateRight(0x1B461093 ^ n4, 6) + 1373217032) * 457576595;
                                                                                                    break block35;
                                                                                                }
                                                                                                if (n3 == 634385288) break block55;
                                                                                                if (n3 == 744979323) break block56;
                                                                                                if (n3 == 2067902617) break block57;
                                                                                                break block35;
                                                                                            }
                                                                                            int cfr_ignored_3 = (Integer.rotateRight(0xA32C9A53 ^ n4, 7) + -960213176) * -1557357997;
                                                                                            n = 0;
                                                                                            try {
                                                                                                n5 = -41230679 + n4;
                                                                                            }
                                                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                n5 = -41230679 + n4 ^ 0xFC55BCD8 ^ 0xFC55BCD8;
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_4 = Integer.rotateLeft(0x81B4661 ^ n4, 4) + -5561094;
                                                                                        int cfr_ignored_5 = (int)(0xCAA9E85C27D4EB4FL ^ (long)n4 ^ 0x2DC8831A2DB83882L);
                                                                                        n2 = -1;
                                                                                        n5 = -41232498 + n4 ^ 0x741BCF9F ^ 0x741BCF9F;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_6 = Integer.rotateLeft(0x18B31CC1 ^ n4, 6) + 34478746;
                                                                                    int cfr_ignored_7 = (int)(0xDA01B2FC27D4EB4FL ^ (long)n4 ^ 0x9888831A2DB819D2L);
                                                                                    if (mkh.mc.field_1724.method_31548().method_5438(n).method_31574(class_17922)) {
                                                                                        int cfr_ignored_8 = (int)(0xBAF372DC45C07AF7L ^ (long)n4 ^ 0x18C847330EC8D837L);
                                                                                        n5 = -1104109515 + n4 + -188828496 - -188828496;
                                                                                        n3 -= 3;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_9 = (int)(0x8A96B64DF3B3C42AL ^ (long)n4 ^ 0x91EB2BD47372B8FCL);
                                                                                    n5 = Integer.reverse(Integer.reverse(-743617521 + n4));
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_10 = Integer.rotateLeft(0x180E51ED ^ n4, 6) - -300315922;
                                                                                int cfr_ignored_11 = (int)(0xDABCFFD027D4EB4FL ^ (long)n4 ^ 0x2D0831A2DB818A8L);
                                                                                n2 = n;
                                                                                int cfr_ignored_12 = (int)(0x8F2FA3B8CD229C29L ^ (long)n4 ^ 0xBA0156F6C374B38EL);
                                                                                n5 = Integer.reverse(Integer.reverse(12138109 + n4));
                                                                                int cfr_ignored_13 = (int)(0x573057D1EB9616B4L ^ (long)n4 ^ 0x52D31B9FD64F03B1L);
                                                                                n5 = Integer.reverse(Integer.reverse(-41232498 + n4));
                                                                                n3 -= 4;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_14 = (Integer.rotateRight(0xA07A347A ^ n4, 7) + 1932130817) * -1602603909;
                                                                            n2 = n;
                                                                            try {
                                                                                n3 += 2;
                                                                                if ((0xE21C5A211CC5F1FDL ^ (long)n4 | 1L) == 0L) {
                                                                                    throw new UnsupportedOperationException();
                                                                                }
                                                                                n5 = Integer.reverse(Integer.reverse(-41232498 + n4));
                                                                            }
                                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                n5 = Integer.reverse(Integer.reverse(-41232498 + n4));
                                                                            }
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_15 = (Integer.rotateRight(0xD810D076 ^ n4, 14) - 778493317) * -669986697;
                                                                        ++n;
                                                                        n5 = 602135982 + n4;
                                                                        int cfr_ignored_16 = (Integer.rotateLeft(0x6F53471C ^ n4, 16) - 2138258335) * 1867728669;
                                                                        n5 = Integer.reverse(Integer.reverse(-41230679 + n4));
                                                                        n3 += 3;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_17 = (Integer.rotateLeft(0xCCBE793C ^ n4, 12) - -814854785) * -859932355;
                                                                    if (n < 1508124951 + -1508124942) {
                                                                        try {
                                                                            if ((0xC259DDADA39C68E5L ^ (long)n4 | 1L) == 0L) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            n5 = (int)((long)(-584127083 + n4) ^ 0xC9275ADC0CAF105DL ^ 0xC9275ADC0CAF105DL);
                                                                        }
                                                                        catch (IllegalStateException illegalStateException) {
                                                                            n5 = (int)((long)(-584127083 + n4) ^ 0x608BA17FE78C8590L ^ 0x608BA17FE78C8590L);
                                                                        }
                                                                        ++n3;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        n3 -= 3;
                                                                        n5 = 234917409 + n4 ^ 0x25EC431F ^ 0x25EC431F;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        n5 = 234917409 + n4 + 945826810 - 945826810;
                                                                    }
                                                                    continue;
                                                                }
                                                                int cfr_ignored_18 = (Integer.rotateRight(0xB8FBA47A ^ n4, 10) + 1792444929) * -1191467909;
                                                                n5 = Integer.reverse(Integer.reverse(563714736 + n4));
                                                                int cfr_ignored_19 = (Integer.rotateRight(0xC5E40B37 ^ n4, 11) - -84215068) * -974910665;
                                                                try {
                                                                    --n3;
                                                                    if ((0x2A46400CE2651ECDL ^ (long)n4 | 1L) == 0L) {
                                                                        throw new ArithmeticException();
                                                                    }
                                                                    n5 = -914952108 + n4 + -135134732 - -135134732;
                                                                }
                                                                catch (ArithmeticException arithmeticException) {
                                                                    n5 = Integer.reverse(Integer.reverse(-914952108 + n4));
                                                                }
                                                                n3 -= 3;
                                                                continue;
                                                            }
                                                            int cfr_ignored_20 = (Integer.rotateRight(0x70D58E1F ^ n4, 17) - -1371941636) * 1893043743;
                                                            n5 = Integer.reverse(Integer.reverse(24946631 + n4));
                                                            int cfr_ignored_21 = (Integer.rotateLeft(0xA003A4D8 ^ n4, 7) + 1691260259) * -1610373927;
                                                            n5 = -914952108 + n4 ^ 0xE8019A1A ^ 0xE8019A1A;
                                                            n3 -= 3;
                                                            continue;
                                                        }
                                                        int cfr_ignored_22 = Integer.rotateLeft(0x4AD4E04C ^ n4, 12) - 337954927;
                                                        n5 = -1294560395 + n4;
                                                        int cfr_ignored_23 = (Integer.rotateRight(0x8314673 ^ n4, 4) + 39135016) * 137447027;
                                                        n5 = Integer.reverse(Integer.reverse(-914952108 + n4));
                                                        n3 += 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_24 = Integer.rotateLeft(0x670511A1 ^ n4, 15) + 2113585594;
                                                    int cfr_ignored_25 = (int)(0xA5B7BF9C27D4EB4FL ^ (long)n4 ^ 0x8248831A2DB8E6BEL);
                                                    n5 = (int)((long)(-405433066 + n4) ^ 0xC835A55163FA3668L ^ 0xC835A55163FA3668L);
                                                    int cfr_ignored_26 = Integer.rotateRight(0x54B5F887 ^ n4, 13) - 1181136788;
                                                    try {
                                                        ++n3;
                                                        if ((0xDCE01E619F2AEE01L ^ (long)n4 | 1L) == 0L) {
                                                            throw new ArithmeticException();
                                                        }
                                                        n5 = (int)((long)(-914952108 + n4) ^ 0x76AC04A704CFDDE9L ^ 0x76AC04A704CFDDE9L);
                                                    }
                                                    catch (ArithmeticException arithmeticException) {
                                                        n5 = -914952108 + n4 + -56262231 - -56262231;
                                                    }
                                                    n3 -= 2;
                                                    continue;
                                                }
                                                int cfr_ignored_27 = (Integer.rotateRight(0xB7457333 ^ n4, 9) + 902206056) * -1220185293;
                                                n5 = 1999714704 + n4;
                                                int cfr_ignored_28 = (Integer.rotateLeft(0x5D14E1D4 ^ n4, 14) - 1239742439) * 1561649621;
                                                try {
                                                    --n3;
                                                    if ((0x272C80EDF14DD105L ^ (long)n4 | 1L) == 0L) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    n5 = -914952108 + n4 ^ 0xD007FE23 ^ 0xD007FE23;
                                                }
                                                catch (NoSuchElementException noSuchElementException) {
                                                    n5 = -914952108 + n4 ^ 0xA2E5C7F2 ^ 0xA2E5C7F2;
                                                }
                                                n3 += 4;
                                                continue;
                                            }
                                            int cfr_ignored_29 = Integer.rotateRight(0xF4B4572B ^ n4, 17) + -1506529936;
                                            n5 = (int)((long)(1313215873 + n4) ^ 0xC95006757152362AL ^ 0xC95006757152362AL);
                                            int cfr_ignored_30 = Integer.rotateLeft(0x116F94AC ^ n4, 5) - 551591951;
                                            int cfr_ignored_31 = (int)(0x892F87A109E59EB2L ^ (long)n4 ^ 0xF232DF78C642BF8EL);
                                            n5 = -638166283 + n4 ^ 0x86E2A2F6 ^ 0x86E2A2F6;
                                            int cfr_ignored_32 = (int)(0xC1B41CB11B1C4B66L ^ (long)n4 ^ 0xC412FA8B6DEA2EB9L);
                                            n5 = -914952108 + n4 + 1215815518 - 1215815518;
                                            continue;
                                        }
                                        int cfr_ignored_33 = Integer.rotateLeft(0xFF060F0D ^ n4, 18) - -434540082;
                                        int cfr_ignored_34 = (int)(0x3DB4A13027D4EB4FL ^ (long)n4 ^ 0xBF10831A2DB9D6B8L);
                                        n5 = 1246209848 + n4 ^ 0x5B41BD8 ^ 0x5B41BD8;
                                        int cfr_ignored_35 = (Integer.rotateRight(0x2CFCA83E ^ n4, 8) - 1995833021) * 754755647;
                                        int cfr_ignored_36 = (int)(0x35B7BDB310F8F915L ^ (long)n4 ^ 0x8616ED42090DC6BEL);
                                        n5 = Integer.reverse(Integer.reverse(-914952108 + n4));
                                        n3 -= 3;
                                        continue;
                                    }
                                    int cfr_ignored_37 = Integer.rotateLeft(0x28708B45 ^ n4, 8) - -369197930;
                                    int cfr_ignored_38 = (int)(0xEAC2257827D4EB4FL ^ (long)n4 ^ 0xB780831A2DB87855L);
                                    try {
                                        n3 += 3;
                                        if ((0xA0B77806B6A5A6ABL ^ (long)n4 | 1L) == 0L) {
                                            throw new UnsupportedOperationException();
                                        }
                                        n5 = -914952108 + n4;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        n5 = -914952108 + n4 ^ 0xD28909AC ^ 0xD28909AC;
                                    }
                                    ++n3;
                                    continue;
                                }
                                int cfr_ignored_39 = Integer.rotateRight(0xC607B4A3 ^ n4, 11) + -11763976;
                                n5 = 1967895277 + n4 + 1156874405 - 1156874405;
                                int cfr_ignored_40 = Integer.rotateRight(0x40A94822 ^ n4, 11) + -656581799;
                                try {
                                    ++n3;
                                    n5 = (int)((long)(-914952108 + n4) ^ 0xAA58384757593CD6L ^ 0xAA58384757593CD6L);
                                }
                                catch (ArithmeticException arithmeticException) {
                                    n5 = (int)((long)(-914952108 + n4) ^ 0x93F36279C1F43B4CL ^ 0x93F36279C1F43B4CL);
                                }
                                ++n3;
                                continue;
                            }
                            int cfr_ignored_41 = Integer.rotateLeft(0x7377A520 ^ n4, 17) + -2449893;
                            try {
                                n3 += 2;
                                if ((0xDB855319BB8E1959L ^ (long)n4 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                n5 = -914952108 + n4 + 2143793117 - 2143793117;
                            }
                            catch (IllegalStateException illegalStateException) {
                                n5 = -914952108 + n4;
                            }
                            n3 -= 2;
                            continue;
                        }
                        int cfr_ignored_42 = (Integer.rotateRight(0xE68C595F ^ n4, 15) - -279154244) * -427009697;
                        n5 = 143984395 + n4 + -1780918486 - -1780918486;
                        int cfr_ignored_43 = (Integer.rotateRight(0xCB7BD0B3 ^ n4, 12) + -1470372632) * -881078093;
                        int cfr_ignored_44 = (int)(0x9ED58F46C89614AL ^ (long)n4 ^ 0x4C9815A139B3BE0BL);
                        n5 = -533762952 + n4 + -678849903 - -678849903;
                        int cfr_ignored_45 = (int)(0xE2BE26E8DB016563L ^ (long)n4 ^ 0xB0A17AB131E068ADL);
                        n5 = (int)((long)(-914952108 + n4) ^ 0xA1C1EC3B8C1E3C2DL ^ 0xA1C1EC3B8C1E3C2DL);
                        n3 -= 2;
                        continue;
                    }
                    int cfr_ignored_46 = (Integer.rotateLeft(0x269B6951 ^ n4, 7) + -1322295286) * 647719249;
                    int cfr_ignored_47 = (int)(0xE429C76C27D4EB4FL ^ (long)n4 ^ 0x73A8831A2DB86582L);
                    int cfr_ignored_48 = (int)(0xBEE778C447A3C09BL ^ (long)n4 ^ 0xCF843F47A10D01FL);
                    n5 = -99636167 + n4;
                    int cfr_ignored_49 = (int)(0x5745B3B137DE9D81L ^ (long)n4 ^ 0x9A12A30EC025035AL);
                    n5 = Integer.reverse(Integer.reverse(-914952108 + n4));
                    n3 += 4;
                    continue;
                }
                return n2;
            }
            int cfr_ignored_50 = (Integer.rotateRight(0x339114BE ^ n4, 9) - 1122968125) * 865146047;
            n5 = -914952108 + n4;
        }
    }

    private class_3965 z_2() {
        if (this.bzsh_2 == null) {
            return null;
        }
        if (this.sddh_2 != null && this.bzsh_2.equals((Object)this.sddh_2.method_17777())) {
            class_243 class_2432 = this.sddh_2.method_17784();
            double d = this.brh(class_2432.field_1352, (double)this.bzsh_2.method_10263() + 0.15, (double)this.bzsh_2.method_10263() + 0.85);
            double d2 = this.brh(class_2432.field_1351, (double)this.bzsh_2.method_10264() + 0.15, (double)this.bzsh_2.method_10264() + 0.95);
            double d3 = this.brh(class_2432.field_1350, (double)this.bzsh_2.method_10260() + 0.15, (double)this.bzsh_2.method_10260() + 0.85);
            return new class_3965(new class_243(d, d2, d3), this.sddh_2.method_17780(), this.bzsh_2, false);
        }
        return new class_3965(class_243.method_24953((class_2382)this.bzsh_2), class_2350.field_11036, this.bzsh_2, false);
    }

    private class_2338[] tsn_3() {
        class_2338[] class_2338Array;
        int n = -1017594314;
        n = Integer.rotateLeft(n * 362802061, 10) ^ 0xD0067051;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xC8B7EAD4;
        if ((n2 ^ n) != -927470892) {
            int cfr_ignored_0 = (0xBEF54E2 ^ n) + 203111204;
        }
        class_2338[] class_2338Array2 = new class_2338[thza_2.length];
        int n3 = 0;
        class_2350 class_23502 = this.jta_4();
        if (class_23502 != null) {
            class_2338Array = this.bzsh_2.method_10093(class_23502);
            if (!mkh.mc.field_1724.method_5829().method_994(new class_238((class_2338)class_2338Array))) {
                class_2338Array2[n3++] = class_2338Array;
            }
        }
        for (class_2338 class_23382 : thza_2) {
            if (class_23382 == class_23502) continue;
            class_2338 class_23383 = this.bzsh_2.method_10093((class_2350)class_23382);
            if (mkh.mc.field_1724.method_5829().method_994(new class_238(class_23383))) continue;
            class_2338Array2[n3++] = class_23383;
        }
        class_2338Array = new class_2338[n3];
        System.arraycopy(class_2338Array2, 0, class_2338Array, 0, n3);
        return class_2338Array;
    }

    private class_2350 jta_4() {
        class_243 class_2432 = mkh.mc.field_1724.method_19538().method_1020(class_243.method_24953((class_2382)this.bzsh_2));
        if (Math.abs(class_2432.field_1352) > Math.abs(class_2432.field_1350)) {
            return class_2432.field_1352 >= 0.0 ? class_2350.field_11034 : class_2350.field_11039;
        }
        return class_2432.field_1350 >= 0.0 ? class_2350.field_11035 : class_2350.field_11043;
    }

    private class_3965 thnm(class_3965 class_39652) {
        try {
            int n = 40237560;
            n = Integer.rotateLeft(n * -561135245, 18) ^ 0x41C3E973;
            n = System.identityHashCode(this) ^ n;
            class_3965 class_39653 = class_39652;
            n = Integer.rotateLeft((class_39653 != null ? System.identityHashCode(class_39653) : 0) ^ n, 11);
            int n2 = n ^ 0x14175E68;
            if ((n2 ^ n) != 337075816) {
                int cfr_ignored_0 = (0x1672A790 ^ n) - -1985578191;
            }
            if ((0x3C3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return new class_3965(class_39652.method_17784(), class_39652.method_17780(), class_39652.method_17777(), class_39652.method_17781());
    }

    private double brh(double d, double d2, double d3) {
        block0: {
            int n = -1535764594;
            n = Integer.rotateLeft(n * -1870475055, 11) ^ 0x778DD36F;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 11);
            int n2 = n ^ 0xCADF4471;
            if ((n2 ^ n) == -891337615) break block0;
            int cfr_ignored_0 = (0x6EA953FF ^ n) + 1490887396;
        }
        return Math.max(d2, Math.min(d3, d));
    }

    /*
     * Unable to fully structure code
     */
    private void dhkhsh() {
        var3_1 = 0;
        var1_2 = 1969041461;
        var1_2 = Integer.rotateLeft(var1_2 * 2000085413, 18) ^ 2058095513;
        var1_2 = Integer.rotateRight(System.identityHashCode(this) ^ var1_2, 24);
        var2_3 = -298002745 + var1_2;
        block28: while (true) {
            if ((var3_1 = var2_3 - var1_2) == -60499837) ** GOTO lbl137
            if (var3_1 == -1031594788) ** GOTO lbl-1000
            if (var3_1 != -158019133) {
                switch (var3_1) {
                    case -298002745: {
                        Integer.rotateLeft(-397854367 ^ var1_2, 16) + 624660986;
                        (int)(3097235590808398671L ^ (long)var1_2 ^ -3186152587905075162L);
                        if (this.dhwdh != tjf.zthk) {
                            (int)(-6455965286939302346L ^ (long)var1_2 ^ 7421201862005285150L);
                            var2_3 = Integer.reverse(Integer.reverse(979095265 + var1_2));
                            ++var3_1;
                            continue block28;
                        }
                        try {
                            var3_1 -= 4;
                            if ((2826686205188084825L ^ (long)var1_2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            var2_3 = 1156102839 + var1_2 ^ 706658288 ^ 706658288;
                        }
                        catch (IllegalArgumentException v0) {
                            var2_3 = 1156102839 + var1_2;
                        }
                        continue block28;
                    }
                    case 979095265: {
                        (Integer.rotateLeft(64525784 ^ var1_2, 3) + 2073543779) * 64525785;
                        if (mkh.mc.field_1724 == null) {
                            var2_3 = 1156102839 + var1_2 ^ 979518372 ^ 979518372;
                            var3_1 += 3;
                            continue block28;
                        }
                        var2_3 = (int)((long)(-1056234023 + var1_2) ^ -703838191329813282L ^ -703838191329813282L);
                        Integer.rotateRight(1149754830 ^ var1_2, 11) - 1355905837;
                        var3_1 -= 5;
                        continue block28;
                    }
                    case -1056234023: {
                        (Integer.rotateRight(-905624101 ^ var1_2, 12) + 2063668416) * -905624101;
                        if (this.khsq_2 >= 0) {
                            var2_3 = Integer.reverse(Integer.reverse(842021499 + var1_2));
                            Integer.rotateLeft(1224638308 ^ var1_2, 12) - -617673641;
                            continue block28;
                        }
                        (int)(-746716873325201210L ^ (long)var1_2 ^ -4856199943076297065L);
                        var2_3 = -1201148475 + var1_2;
                        (int)(-4128434522534949530L ^ (long)var1_2 ^ 5199800509001244856L);
                        var2_3 = 1156102839 + var1_2 + -1378976102 - -1378976102;
                        var3_1 -= 2;
                        continue block28;
                    }
                    case 842021499: {
                        Integer.rotateRight(-1148581078 ^ var1_2, 10) + -1173030575;
                        if (this.khsq_2 >= -412535727 + 412535736) {
                            var2_3 = 1156102839 + var1_2 ^ 732106009 ^ 732106009;
                            (Integer.rotateRight(-266710670 ^ var1_2, 17) + 395148297) * -266710669;
                            var3_1 += 5;
                            continue block28;
                        }
                        try {
                            if ((8638288140957307573L ^ (long)var1_2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var2_3 = -1031594788 + var1_2 + -1558235444 - -1558235444;
                        }
                        catch (ArithmeticException v1) {
                            var2_3 = Integer.reverse(Integer.reverse(-1031594788 + var1_2));
                        }
                        var3_1 += 5;
                        continue block28;
                    }
                }
            }
            ** GOTO lbl222
lbl-1000:
            // 1 sources

            {
                (Integer.rotateRight(1966464799 ^ var1_2, 17) - 904111100) * 1966464799;
                bfn.shkz(this.khsq_2);
                (int)(2536449766906332612L ^ (long)var1_2 ^ 8236919435704658871L);
                var2_3 = Integer.reverse(Integer.reverse(1156102839 + var1_2));
                var3_1 -= 3;
                continue block28;
                case -1111403800: {
                    Integer.rotateRight(-719092126 ^ var1_2, 13) + -743774951;
                    bfn.shkz(this.khsq_2);
                    try {
                        var3_1 -= 5;
                        var2_3 = Integer.reverse(Integer.reverse(1156102839 + var1_2));
                    }
                    catch (IllegalStateException v2) {
                        var2_3 = 1156102839 + var1_2 + 593071576 - 593071576;
                    }
                    var3_1 += 5;
                    continue block28;
                }
                case 1156102839: {
                    Integer.rotateRight(-1516313969 ^ var1_2, 7) - 312151692;
                    this.als();
                    return;
                }
                case 1535967915: {
                    Integer.rotateLeft(-888001491 ^ var1_2, 12) - -1684997970;
                    (int)(693697348514409295L ^ (long)var1_2 ^ -481741011669107056L);
                    var2_3 = (int)((long)(2068394991 + var1_2) ^ -2544406562993512497L ^ -2544406562993512497L);
                    (Integer.rotateRight(1230855798 ^ var1_2, 12) - -424931451) * 1230855799;
                    (int)(-1945366288040357288L ^ (long)var1_2 ^ -6186034829967595568L);
                    var2_3 = Integer.reverse(Integer.reverse(-298002745 + var1_2));
                    var3_1 -= 5;
                    continue block28;
                }
                case 816443661: {
                    Integer.rotateRight(-438971829 ^ var1_2, 15) + -649980336;
                    var2_3 = -1730205017 + var1_2;
                    Integer.rotateRight(1080548331 ^ var1_2, 11) + -789495632;
                    var2_3 = -298002745 + var1_2;
                    var3_1 += 5;
                    continue block28;
                }
                case -1726031035: {
                    (Integer.rotateRight(512923322 ^ var1_2, 6) + -1206001727) * 512923323;
                    var2_3 = Integer.reverse(Integer.reverse(1101856502 + var1_2));
                    (Integer.rotateRight(1276493403 ^ var1_2, 12) + 989834304) * 1276493403;
                    var2_3 = (int)((long)(400337325 + var1_2) ^ 8880635016554516259L ^ 8880635016554516259L);
                    (Integer.rotateLeft(-1816418884 ^ var1_2, 5) - -401166081) * -1816418883;
                    var2_3 = -298002745 + var1_2 + 654588740 - 654588740;
                    ++var3_1;
                    continue block28;
                }
lbl137:
                // 1 sources

                (Integer.rotateRight(95439006 ^ var1_2, 3) - -1263113635) * 95439007;
                var2_3 = (int)((long)(-1551976349 + var1_2) ^ -5412530403619647481L ^ -5412530403619647481L);
                Integer.rotateLeft(-1406943804 ^ var1_2, 8) - -592340489;
                try {
                    var3_1 += 4;
                    var2_3 = -298002745 + var1_2;
                }
                catch (IllegalStateException v3) {
                    var2_3 = Integer.reverse(Integer.reverse(-298002745 + var1_2));
                }
                var3_1 -= 2;
                continue block28;
                case -1652216538: {
                    Integer.rotateLeft(-688304851 ^ var1_2, 13) - 210630574;
                    (int)(1462512162539105103L ^ (long)var1_2 ^ 4274060194834122054L);
                    var2_3 = Integer.reverse(Integer.reverse(630364582 + var1_2));
                    (Integer.rotateLeft(1029835032 ^ var1_2, 10) + 1933359395) * 1029835033;
                    var2_3 = (int)((long)(-298002745 + var1_2) ^ 1267364915194983405L ^ 1267364915194983405L);
                    var3_1 -= 5;
                    continue block28;
                }
                case 2124151310: {
                    Integer.rotateRight(1280114607 ^ var1_2, 12) - 1102091628;
                    var2_3 = 1202017946 + var1_2 ^ -544301582 ^ -544301582;
                    Integer.rotateRight(-667252054 ^ var1_2, 14) + 863267281;
                    var2_3 = -298002745 + var1_2 ^ 1728912619 ^ 1728912619;
                    var3_1 += 4;
                    continue block28;
                }
                case -1012943182: {
                    (Integer.rotateLeft(-1458211951 ^ var1_2, 8) + 2113314250) * -1458211951;
                    (int)(7757412614641347407L ^ (long)var1_2 ^ 5055434730182900382L);
                    var2_3 = -2005722152 + var1_2;
                    (Integer.rotateRight(282929823 ^ var1_2, 5) - 254134396) * 282929823;
                    var2_3 = Integer.reverse(Integer.reverse(-298002745 + var1_2));
                    (Integer.rotateLeft(1720287125 ^ var1_2, 15) - 1862537798) * 1720287125;
                    (int)(-6612461107710465201L ^ (long)var1_2 ^ 6782565187279447462L);
                    var3_1 -= 2;
                    continue block28;
                }
                case -1097537692: {
                    (Integer.rotateRight(-545240902 ^ var1_2, 14) + 350645697) * -545240901;
                    try {
                        --var3_1;
                        if ((-2792287459814305563L ^ (long)var1_2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var2_3 = Integer.reverse(Integer.reverse(-298002745 + var1_2));
                    }
                    catch (IllegalStateException v4) {
                        var2_3 = -298002745 + var1_2 + -843098896 - -843098896;
                    }
                    ++var3_1;
                    continue block28;
                }
                case -266851969: {
                    (Integer.rotateRight(2118479227 ^ var1_2, 18) + 1321591072) * 2118479227;
                    var2_3 = 1831414210 + var1_2 ^ -794299955 ^ -794299955;
                    Integer.rotateLeft(2143199757 ^ var1_2, 18) - 2087927502;
                    (int)(-4824467699854415025L ^ (long)var1_2 ^ -1940907290937206839L);
                    (int)(-3276017935551108432L ^ (long)var1_2 ^ -8978436141451179837L);
                    var2_3 = -1028203898 + var1_2 + 1600580646 - 1600580646;
                    (int)(-7231285391440785183L ^ (long)var1_2 ^ 6705710128414628507L);
                    var2_3 = Integer.reverse(Integer.reverse(-298002745 + var1_2));
                    var3_1 -= 4;
                    continue block28;
                }
                case 93095655: {
                    (Integer.rotateRight(-2096721870 ^ var1_2, 3) + -500624055) * -2096721869;
                    var2_3 = (int)((long)(-713876180 + var1_2) ^ 5808301091216086465L ^ 5808301091216086465L);
                    Integer.rotateRight(-2040872126 ^ var1_2, 3) + 1230718009;
                    var2_3 = (int)((long)(-298002745 + var1_2) ^ -1414840436647017259L ^ -1414840436647017259L);
                    continue block28;
                }
lbl222:
                // 1 sources

                (Integer.rotateRight(1609353938 ^ var1_2, 14) + -1576390999) * 1609353939;
                (int)(4093339307933646909L ^ (long)var1_2 ^ 1270940598016007245L);
                var2_3 = -298002745 + var1_2 ^ 1859592288 ^ 1859592288;
                continue block28;
                case -1465538622: {
                    Integer.rotateLeft(1360304420 ^ var1_2, 13) - -706991465;
                    var2_3 = -722958297 + var1_2 ^ 1629840864 ^ 1629840864;
                    Integer.rotateRight(-653431026 ^ var1_2, 14) - 1291719149;
                    var2_3 = -298002745 + var1_2;
                    var3_1 -= 2;
                }
            }
            (Integer.rotateLeft(-80436963 ^ var1_2, 18) - 1874665918) * -80436963;
            (int)(4145017137822755663L ^ (long)var1_2 ^ -2076015279758254371L);
            var2_3 = Integer.reverse(Integer.reverse(-298002745 + var1_2));
        }
    }

    private void bsa_2() {
        try {
            int n = 1684818193;
            n = Integer.rotateLeft(n * 1075391449, 9) ^ 0xFCD9EDF;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0x727458D1;
            if ((n2 ^ n) != 1920227537) {
                int cfr_ignored_0 = (0x161811C0 ^ n) - 1709112996;
            }
            if ((0xF8 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        this.shad_4 = null;
        this.bthh = -1;
        this.jjd = null;
        this.tlh_2 = null;
        this.bzq = false;
    }

    private void als() {
        try {
            int n = -771542924;
            n = Integer.rotateLeft(n * 1334773371, 20) ^ 0x73CE65A6;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x40A32BB8;
            if ((n2 ^ n) != 1084435384) {
                int cfr_ignored_0 = (0x92A01BCC ^ n) + 376185809;
            }
            if ((0x3AA & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        this.dhwdh = tjf.zthk;
        this.bsa_2();
        this.bzsh_2 = null;
        this.sddh_2 = null;
        this.dhdr_2 = false;
        this.brr = false;
        this.khsq_2 = -1;
        this.szs_2 = 0;
        this.khzl_2 = 0;
    }

    private class_2596 zshdh_2(int n) {
        int n2 = 1466172320;
        n2 = Integer.rotateLeft(n2 * 969993805, 8) ^ 0x2C7DE514;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (n2 = Integer.rotateRight(n ^ n2, 14)) ^ 0xE08A42ED;
        if ((n3 ^ n2) != -527809811) {
            int cfr_ignored_0 = (0xB7EE414D ^ n2) - -1647664084;
        }
        return new class_2885(class_1268.field_5808, this.jjd, n);
    }

    /*
     * Unable to fully structure code
     */
    private void daa_4(bjd_2 var1_1) {
        var4_2 = 0;
        var2_3 = 52367054;
        var2_3 = Integer.rotateLeft(var2_3 * 101535253, 25) ^ -1638262337;
        var2_3 = System.identityHashCode(this) ^ var2_3;
        v0 = var1_1;
        var2_3 = Integer.rotateLeft((v0 != null ? System.identityHashCode(v0) : 0) ^ var2_3, 20);
        var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ -839013844 ^ -416685008)));
        while (true) {
            block84: {
                block76: {
                    block78: {
                        block72: {
                            block94: {
                                block93: {
                                    block73: {
                                        block85: {
                                            block71: {
                                                block83: {
                                                    block95: {
                                                        block79: {
                                                            block86: {
                                                                block82: {
                                                                    block92: {
                                                                        block89: {
                                                                            block74: {
                                                                                block88: {
                                                                                    block98: {
                                                                                        block80: {
                                                                                            block96: {
                                                                                                block77: {
                                                                                                    block90: {
                                                                                                        block97: {
                                                                                                            block75: {
                                                                                                                block91: {
                                                                                                                    block81: {
                                                                                                                        block87: {
                                                                                                                            var4_2 = Integer.reverse(var3_4) ^ var2_3 ^ -416685008;
                                                                                                                            switch (var4_2 & 15) {
                                                                                                                                case 0: {
                                                                                                                                    if (var4_2 == -266981088) break block71;
                                                                                                                                    if (var4_2 == 987371808) break block72;
                                                                                                                                    if (var4_2 != -78102592) {
                                                                                                                                        ** break;
                                                                                                                                    }
                                                                                                                                    break block73;
                                                                                                                                }
                                                                                                                                case 3: {
                                                                                                                                    if (var4_2 != -764875693) {
                                                                                                                                        ** break;
                                                                                                                                    }
                                                                                                                                    break block74;
                                                                                                                                }
                                                                                                                                case 4: {
                                                                                                                                    if (var4_2 != -672151468) {
                                                                                                                                        ** break;
                                                                                                                                    }
                                                                                                                                    break block75;
                                                                                                                                }
                                                                                                                                case 5: {
                                                                                                                                    if (var4_2 == -1170949627) break block76;
                                                                                                                                    if (var4_2 == 1609320933) break block77;
                                                                                                                                    (Integer.rotateLeft(2119439857 ^ var2_3, 18) + 1351370602) * 2119439857;
                                                                                                                                    (int)(-4834970664419660977L ^ (long)var2_3 ^ -8437349753419148260L);
                                                                                                                                    if (var4_2 != -1510311435) {
                                                                                                                                        ** break;
                                                                                                                                    }
                                                                                                                                    break block78;
                                                                                                                                }
                                                                                                                                case 6: {
                                                                                                                                    if (var4_2 == 1435275382) break block79;
                                                                                                                                    if (var4_2 == 820264822) break block80;
                                                                                                                                    Integer.rotateRight(-1069592025 ^ var2_3, 11) - 1275630068;
                                                                                                                                    if (var4_2 != -1187873834) {
                                                                                                                                        ** break;
                                                                                                                                    }
                                                                                                                                    break block81;
                                                                                                                                }
                                                                                                                                case 7: {
                                                                                                                                    if (var4_2 == 18285239) break;
                                                                                                                                    ** break;
                                                                                                                                }
                                                                                                                                case 8: {
                                                                                                                                    if (var4_2 == -394099272) break block82;
                                                                                                                                    if (var4_2 == -313957944) break block83;
                                                                                                                                    Integer.rotateRight(-1168159034 ^ var2_3, 10) - -1779947211;
                                                                                                                                    if (var4_2 != 256323064) {
                                                                                                                                        ** break;
                                                                                                                                    }
                                                                                                                                    break block84;
                                                                                                                                }
                                                                                                                                case 9: {
                                                                                                                                    if (var4_2 == -1435781655) break block85;
                                                                                                                                    if (var4_2 == 361217193) break block86;
                                                                                                                                    if (var4_2 == -252268503) break block87;
                                                                                                                                    if (var4_2 != -1013548055) {
                                                                                                                                        ** break;
                                                                                                                                    }
                                                                                                                                    break block88;
                                                                                                                                }
                                                                                                                                case 10: {
                                                                                                                                    if (var4_2 != 1117271466) {
                                                                                                                                        ** break;
                                                                                                                                    }
                                                                                                                                    break block89;
                                                                                                                                }
                                                                                                                                case 11: {
                                                                                                                                    if (var4_2 != 1141247659) {
                                                                                                                                        ** break;
                                                                                                                                    }
                                                                                                                                    break block90;
                                                                                                                                }
                                                                                                                                case 12: {
                                                                                                                                    if (var4_2 != -839013844) {
                                                                                                                                        ** break;
                                                                                                                                    }
                                                                                                                                    break block91;
                                                                                                                                }
                                                                                                                                case 13: {
                                                                                                                                    if (var4_2 == 1616596765) break block92;
                                                                                                                                    if (var4_2 != 68620365) {
                                                                                                                                        ** break;
                                                                                                                                    }
                                                                                                                                    break block93;
                                                                                                                                }
                                                                                                                                case 14: {
                                                                                                                                    if (var4_2 != 1591455662) {
                                                                                                                                        ** break;
                                                                                                                                    }
                                                                                                                                    break block94;
                                                                                                                                }
                                                                                                                                case 15: {
                                                                                                                                    if (var4_2 == -1107903585) break block95;
                                                                                                                                    if (var4_2 == 288184719) break block96;
                                                                                                                                    if (var4_2 == -811803153) break block97;
                                                                                                                                    if (var4_2 != 107062143) {
                                                                                                                                        ** break;
                                                                                                                                    }
                                                                                                                                    break block98;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            (Integer.rotateLeft(1425730356 ^ var2_3, 13) - 1321212551) * 1425730357;
                                                                                                                            bfn.shkz(this.khsq_2);
                                                                                                                            if (!this.bzq) {
                                                                                                                                var3_4 = Integer.reverse(var2_3 ^ 1233914598 ^ -416685008);
                                                                                                                                Integer.rotateRight(-1407678706 ^ var2_3, 8) - -615122451;
                                                                                                                                var3_4 = Integer.reverse(var2_3 ^ -672151468 ^ -416685008) + 1291973248 - 1291973248;
                                                                                                                                var4_2 += 3;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if ((-3780619193956747501L ^ (long)var2_3 | 1L) == 0L) {
                                                                                                                                    throw new UnsupportedOperationException();
                                                                                                                                }
                                                                                                                                var3_4 = Integer.reverse(var2_3 ^ -811803153 ^ -416685008) + 1875620262 - 1875620262;
                                                                                                                            }
                                                                                                                            catch (UnsupportedOperationException v1) {
                                                                                                                                var3_4 = Integer.reverse(var2_3 ^ -811803153 ^ -416685008);
                                                                                                                            }
                                                                                                                            var4_2 -= 3;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        (Integer.rotateLeft(-1490179560 ^ var2_3, 7) + 1122318371) * -1490179559;
                                                                                                                        if (this.dhwdh != tjf.tthsh) {
                                                                                                                            try {
                                                                                                                                var4_2 += 3;
                                                                                                                                if ((1077544138348754073L ^ (long)var2_3 | 1L) == 0L) {
                                                                                                                                    throw new ArithmeticException();
                                                                                                                                }
                                                                                                                                var3_4 = Integer.reverse(var2_3 ^ 107062143 ^ -416685008) + -34879736 - -34879736;
                                                                                                                            }
                                                                                                                            catch (ArithmeticException v2) {
                                                                                                                                var3_4 = (int)((long)Integer.reverse(var2_3 ^ 107062143 ^ -416685008) ^ -7824142031329528414L ^ -7824142031329528414L);
                                                                                                                            }
                                                                                                                            var4_2 -= 3;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        var3_4 = Integer.reverse(var2_3 ^ 1141247659 ^ -416685008) + -1072154614 - -1072154614;
                                                                                                                        (Integer.rotateLeft(-1397579600 ^ var2_3, 8) + -302050165) * -1397579599;
                                                                                                                        --var4_2;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    Integer.rotateRight(1144796262 ^ var2_3, 11) - 1202190229;
                                                                                                                    yf.athz_2();
                                                                                                                    var3_4 = Integer.reverse(var2_3 ^ 1609305219 ^ -416685008) ^ -605186520 ^ -605186520;
                                                                                                                    Integer.rotateLeft(1930872769 ^ var2_3, 17) + -199241830;
                                                                                                                    (int)(-5646271501094818993L ^ (long)var2_3 ^ 3353074071036808857L);
                                                                                                                    var3_4 = Integer.reverse(var2_3 ^ -764875693 ^ -416685008) + 1888661420 - 1888661420;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                Integer.rotateLeft(1579825065 ^ var2_3, 14) + 1803181234;
                                                                                                                (int)(-7162806345730299057L ^ (long)var2_3 ^ -3577965755486399264L);
                                                                                                                if (!yf.khdha_2()) {
                                                                                                                    var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ -116919718 ^ -416685008)));
                                                                                                                    Integer.rotateLeft(-2064822044 ^ var2_3, 3) - 488270551;
                                                                                                                    var3_4 = Integer.reverse(var2_3 ^ -1187873834 ^ -416685008) ^ 1377248760 ^ 1377248760;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                (int)(5996058091919326081L ^ (long)var2_3 ^ 8309447361334414269L);
                                                                                                                var3_4 = Integer.reverse(var2_3 ^ -196879395 ^ -416685008) ^ 23590314 ^ 23590314;
                                                                                                                (int)(258340769258667155L ^ (long)var2_3 ^ 7093136290354408186L);
                                                                                                                var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ -764875693 ^ -416685008)));
                                                                                                                var4_2 += 2;
                                                                                                                continue;
                                                                                                            }
                                                                                                            Integer.rotateRight(-2144575545 ^ var2_3, 3) - -1984087980;
                                                                                                            this.szs_2 = Math.max(1, Math.round(this.shar_2.thw_5()));
                                                                                                            this.dhwdh = tjf.dhya_2;
                                                                                                            var3_4 = (int)((long)Integer.reverse(var2_3 ^ 1282719132 ^ -416685008) ^ 8462182576953008405L ^ 8462182576953008405L);
                                                                                                            Integer.rotateRight(-820888145 ^ var2_3, 12) - 395515756;
                                                                                                            var3_4 = (int)((long)Integer.reverse(var2_3 ^ -1013548055 ^ -416685008) ^ -5814467901024040102L ^ -5814467901024040102L);
                                                                                                            var4_2 += 3;
                                                                                                            continue;
                                                                                                        }
                                                                                                        (Integer.rotateLeft(-118738180 ^ var2_3, 18) - 687328191) * -118738179;
                                                                                                        this.als();
                                                                                                        try {
                                                                                                            var4_2 += 3;
                                                                                                            if ((4002355055494066941L ^ (long)var2_3 | 1L) == 0L) {
                                                                                                                throw new IllegalArgumentException();
                                                                                                            }
                                                                                                            var3_4 = Integer.reverse(var2_3 ^ -1013548055 ^ -416685008) + -548205710 - -548205710;
                                                                                                        }
                                                                                                        catch (IllegalArgumentException v3) {
                                                                                                            var3_4 = Integer.reverse(var2_3 ^ -1013548055 ^ -416685008);
                                                                                                        }
                                                                                                        var4_2 -= 2;
                                                                                                        continue;
                                                                                                    }
                                                                                                    (Integer.rotateRight(-486303854 ^ var2_3, 15) + -2117273111) * -486303853;
                                                                                                    this.zdn_2();
                                                                                                    try {
                                                                                                        var4_2 += 2;
                                                                                                        var3_4 = (int)((long)Integer.reverse(var2_3 ^ -1013548055 ^ -416685008) ^ 173113883371193870L ^ 173113883371193870L);
                                                                                                    }
                                                                                                    catch (IllegalStateException v4) {
                                                                                                        var3_4 = Integer.reverse(var2_3 ^ -1013548055 ^ -416685008) + -467221424 - -467221424;
                                                                                                    }
                                                                                                    --var4_2;
                                                                                                    continue;
                                                                                                }
                                                                                                (Integer.rotateRight(-857652326 ^ var2_3, 12) + -744173855) * -857652325;
                                                                                                if (mkh.mc.field_1687 == null) {
                                                                                                    (int)(-4665883744949593252L ^ (long)var2_3 ^ 1988386200106226607L);
                                                                                                    var3_4 = Integer.reverse(var2_3 ^ 820264822 ^ -416685008) + 1093044687 - 1093044687;
                                                                                                    --var4_2;
                                                                                                    continue;
                                                                                                }
                                                                                                try {
                                                                                                    ++var4_2;
                                                                                                    var3_4 = Integer.reverse(var2_3 ^ 1117271466 ^ -416685008) + 746148156 - 746148156;
                                                                                                }
                                                                                                catch (IllegalArgumentException v5) {
                                                                                                    var3_4 = Integer.reverse(var2_3 ^ 1117271466 ^ -416685008) + 1363695138 - 1363695138;
                                                                                                }
                                                                                                var4_2 += 5;
                                                                                                continue;
                                                                                            }
                                                                                            (Integer.rotateLeft(1641472880 ^ var2_3, 15) + -580703797) * 1641472881;
                                                                                            if (mkh.mc.field_1687 == null) {
                                                                                                try {
                                                                                                    var4_2 -= 3;
                                                                                                    var3_4 = (int)((long)Integer.reverse(var2_3 ^ 820264822 ^ -416685008) ^ -642527843575917744L ^ -642527843575917744L);
                                                                                                }
                                                                                                catch (IllegalStateException v6) {
                                                                                                    var3_4 = Integer.reverse(var2_3 ^ 820264822 ^ -416685008) ^ -1961066613 ^ -1961066613;
                                                                                                }
                                                                                                var4_2 += 4;
                                                                                                continue;
                                                                                            }
                                                                                            var3_4 = Integer.reverse(var2_3 ^ 1117271466 ^ -416685008);
                                                                                            var4_2 -= 3;
                                                                                            continue;
                                                                                        }
                                                                                        (Integer.rotateRight(-1017522881 ^ var2_3, 11) - -1405193764) * -1017522881;
                                                                                        this.dhkhsh();
                                                                                        return;
                                                                                    }
                                                                                    (Integer.rotateRight(1210887315 ^ var2_3, 12) + -1043954424) * 1210887315;
                                                                                    if (this.dhwdh == tjf.rtgh_2) {
                                                                                        var3_4 = Integer.reverse(var2_3 ^ 2052326564 ^ -416685008) ^ 153612145 ^ 153612145;
                                                                                        (Integer.rotateRight(-1354843689 ^ var2_3, 8) - 1022763076) * -1354843689;
                                                                                        var3_4 = Integer.reverse(var2_3 ^ 18285239 ^ -416685008);
                                                                                        var4_2 += 3;
                                                                                        continue;
                                                                                    }
                                                                                    var3_4 = (int)((long)Integer.reverse(var2_3 ^ -1013548055 ^ -416685008) ^ 7085261193883089353L ^ 7085261193883089353L);
                                                                                    ++var4_2;
                                                                                    continue;
                                                                                }
                                                                                Integer.rotateLeft(785365704 ^ var2_3, 8) + -1350222477;
                                                                                return;
                                                                            }
                                                                            Integer.rotateRight(696938830 ^ var2_3, 8) - 203511725;
                                                                            if (mkh.mc.field_1724 != null) {
                                                                                (int)(367046057605989580L ^ (long)var2_3 ^ -462917399360854047L);
                                                                                var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ 1609320933 ^ -416685008)));
                                                                                var4_2 += 5;
                                                                                continue;
                                                                            }
                                                                            try {
                                                                                var4_2 += 4;
                                                                                if ((6485126426780741573L ^ (long)var2_3 | 1L) == 0L) {
                                                                                    throw new ArithmeticException();
                                                                                }
                                                                                var3_4 = Integer.reverse(var2_3 ^ 820264822 ^ -416685008) ^ 425845133 ^ 425845133;
                                                                            }
                                                                            catch (ArithmeticException v7) {
                                                                                var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ 820264822 ^ -416685008)));
                                                                            }
                                                                            var4_2 += 4;
                                                                            continue;
                                                                        }
                                                                        Integer.rotateLeft(-1562748244 ^ var2_3, 7) - -1127310833;
                                                                        if (mkh.mc.field_1761 == null) {
                                                                            (int)(-4515788483376045166L ^ (long)var2_3 ^ -7356256605173567624L);
                                                                            var3_4 = Integer.reverse(var2_3 ^ -1961981862 ^ -416685008);
                                                                            (int)(3599781327154958004L ^ (long)var2_3 ^ 100795513989746232L);
                                                                            var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ 820264822 ^ -416685008)));
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            --var4_2;
                                                                            if ((-8628303055978718581L ^ (long)var2_3 | 1L) == 0L) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            var3_4 = Integer.reverse(var2_3 ^ -252268503 ^ -416685008);
                                                                        }
                                                                        catch (IllegalStateException v8) {
                                                                            var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ -252268503 ^ -416685008)));
                                                                        }
                                                                        continue;
                                                                    }
                                                                    Integer.rotateLeft(1451943976 ^ var2_3, 13) + 2133834771;
                                                                    var3_4 = Integer.reverse(var2_3 ^ -1207974468 ^ -416685008) ^ -1608355724 ^ -1608355724;
                                                                    (Integer.rotateRight(1196719451 ^ var2_3, 11) + -1483158208) * 1196719451;
                                                                    (int)(-8660682987252388637L ^ (long)var2_3 ^ -2874425034269482417L);
                                                                    var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ 243020342 ^ -416685008)));
                                                                    (int)(-1166875061461297169L ^ (long)var2_3 ^ 2868806291344093773L);
                                                                    var3_4 = Integer.reverse(var2_3 ^ -839013844 ^ -416685008);
                                                                    ++var4_2;
                                                                    continue;
                                                                }
                                                                (Integer.rotateRight(2074778491 ^ var2_3, 18) + -33131744) * 2074778491;
                                                                var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ -839013844 ^ -416685008)));
                                                                continue;
                                                            }
                                                            Integer.rotateRight(1822411554 ^ var2_3, 16) + 733427801;
                                                            try {
                                                                var4_2 += 4;
                                                                var3_4 = Integer.reverse(var2_3 ^ -839013844 ^ -416685008) + -1574697785 - -1574697785;
                                                            }
                                                            catch (IllegalArgumentException v9) {
                                                                var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ -839013844 ^ -416685008)));
                                                            }
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(1305948873 ^ var2_3, 12) + 1902953874;
                                                        (int)(-8113906581183861937L ^ (long)var2_3 ^ -4280527297356188902L);
                                                        try {
                                                            if ((7571585209472964425L ^ (long)var2_3 | 1L) == 0L) {
                                                                throw new IllegalStateException();
                                                            }
                                                            var3_4 = (int)((long)Integer.reverse(var2_3 ^ -839013844 ^ -416685008) ^ -5037694536749775086L ^ -5037694536749775086L);
                                                        }
                                                        catch (IllegalStateException v10) {
                                                            var3_4 = (int)((long)Integer.reverse(var2_3 ^ -839013844 ^ -416685008) ^ 3254650004769439290L ^ 3254650004769439290L);
                                                        }
                                                        var4_2 -= 4;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(250489345 ^ var2_3, 4) + -751520422;
                                                    (int)(-3720953798213702833L ^ (long)var2_3 ^ -790237586144086680L);
                                                    (int)(1612559452505370939L ^ (long)var2_3 ^ 1296560862270685456L);
                                                    var3_4 = Integer.reverse(var2_3 ^ -839013844 ^ -416685008);
                                                    var4_2 -= 4;
                                                    continue;
                                                }
                                                (Integer.rotateRight(-2033917606 ^ var2_3, 3) + 1446308129) * -2033917605;
                                                try {
                                                    var4_2 += 3;
                                                    var3_4 = Integer.reverse(var2_3 ^ -839013844 ^ -416685008);
                                                }
                                                catch (IllegalStateException v11) {
                                                    var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ -839013844 ^ -416685008)));
                                                }
                                                --var4_2;
                                                continue;
                                            }
                                            Integer.rotateLeft(1595101292 ^ var2_3, 14) - -2018223025;
                                            var3_4 = Integer.reverse(var2_3 ^ 1080815398 ^ -416685008) ^ -1421976062 ^ -1421976062;
                                            Integer.rotateLeft(111683076 ^ var2_3, 3) - -759547465;
                                            var3_4 = (int)((long)Integer.reverse(var2_3 ^ -839013844 ^ -416685008) ^ -8554172922421947575L ^ -8554172922421947575L);
                                            continue;
                                        }
                                        (Integer.rotateRight(429442678 ^ var2_3, 6) - 501065605) * 429442679;
                                        try {
                                            var4_2 -= 2;
                                            if ((-2130658322656740609L ^ (long)var2_3 | 1L) == 0L) {
                                                throw new ArithmeticException();
                                            }
                                            var3_4 = Integer.reverse(var2_3 ^ -839013844 ^ -416685008) ^ 165669569 ^ 165669569;
                                        }
                                        catch (ArithmeticException v12) {
                                            var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ -839013844 ^ -416685008)));
                                        }
                                        var4_2 += 5;
                                        continue;
                                    }
                                    (Integer.rotateRight(819190130 ^ var2_3, 9) + -301665271) * 819190131;
                                    var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ 556377439 ^ -416685008)));
                                    (Integer.rotateRight(-467550885 ^ var2_3, 15) + -1535931072) * -467550885;
                                    (int)(-933585284801173655L ^ (long)var2_3 ^ -8704688996188140601L);
                                    var3_4 = Integer.reverse(var2_3 ^ -1200348626 ^ -416685008);
                                    (int)(-389538949430292479L ^ (long)var2_3 ^ -3046800882870757151L);
                                    var3_4 = Integer.reverse(var2_3 ^ -839013844 ^ -416685008) ^ 480979325 ^ 480979325;
                                    var4_2 += 3;
                                    continue;
                                }
                                (Integer.rotateLeft(406816984 ^ var2_3, 6) + -200330909) * 406816985;
                                var3_4 = Integer.reverse(var2_3 ^ 1994078217 ^ -416685008) + 631259488 - 631259488;
                                Integer.rotateRight(-1823658841 ^ var2_3, 5) - -625604748;
                                var3_4 = (int)((long)Integer.reverse(var2_3 ^ -839013844 ^ -416685008) ^ 2161879657101617967L ^ 2161879657101617967L);
                                var4_2 -= 5;
                                continue;
                            }
                            (Integer.rotateRight(1498323894 ^ var2_3, 14) - -723355067) * 1498323895;
                            var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ 283042115 ^ -416685008)));
                            Integer.rotateRight(1227176202 ^ var2_3, 12) + -538998927;
                            (int)(4474842968164641441L ^ (long)var2_3 ^ 6233477234374857186L);
                            var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ -839013844 ^ -416685008)));
                            continue;
                        }
                        (Integer.rotateRight(594594102 ^ var2_3, 7) - 1325792453) * 594594103;
                        var3_4 = Integer.reverse(var2_3 ^ -1250856393 ^ -416685008) + 1386168667 - 1386168667;
                        Integer.rotateLeft(-1317433020 ^ var2_3, 9) - -2112473481;
                        var3_4 = Integer.reverse(var2_3 ^ -839013844 ^ -416685008) ^ -1744752194 ^ -1744752194;
                        ++var4_2;
                        continue;
                    }
                    (Integer.rotateRight(1277686910 ^ var2_3, 12) - 1026833021) * 1277686911;
                    var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ 1409972482 ^ -416685008)));
                    Integer.rotateRight(-1331460242 ^ var2_3, 9) - 1747649933;
                    var3_4 = (int)((long)Integer.reverse(var2_3 ^ -839013844 ^ -416685008) ^ -5379465613821104409L ^ -5379465613821104409L);
                    --var4_2;
                    continue;
                }
                Integer.rotateRight(-1623413046 ^ var2_3, 6) + 1287047601;
                var3_4 = Integer.reverse(var2_3 ^ 653669297 ^ -416685008);
                (Integer.rotateRight(1547217018 ^ var2_3, 14) + 792331777) * 1547217019;
                try {
                    var4_2 += 3;
                    var3_4 = Integer.reverse(var2_3 ^ -839013844 ^ -416685008) + 751756994 - 751756994;
                }
                catch (UnsupportedOperationException v13) {
                    var3_4 = Integer.reverse(var2_3 ^ -839013844 ^ -416685008) ^ 1424205910 ^ 1424205910;
                }
                var4_2 -= 2;
                continue;
            }
            Integer.rotateLeft(-1220270296 ^ var2_3, 9) + 899570963;
            (int)(1067521227682478095L ^ (long)var2_3 ^ -3693566510233964432L);
            var3_4 = Integer.reverse(var2_3 ^ -511585829 ^ -416685008);
            (int)(7697963776498068877L ^ (long)var2_3 ^ -5766574239557781384L);
            var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ -839013844 ^ -416685008)));
            continue;
lbl447:
            // 15 sources

            (Integer.rotateRight(-1852226145 ^ var2_3, 5) - -1511191172) * -1852226145;
            var3_4 = Integer.reverse(Integer.reverse(Integer.reverse(var2_3 ^ -839013844 ^ -416685008)));
        }
    }

    private void zghh_4(btt btt2) {
        boolean bl;
        int n = 330807067;
        n = Integer.rotateLeft(n * 527043091, 7) ^ 0xD289CBB2;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
        btt btt3 = btt2;
        n = Integer.rotateLeft((btt3 != null ? System.identityHashCode(btt3) : 0) ^ n, 20);
        int n2 = n ^ 0x12215964;
        if ((n2 ^ n) != 304175460) {
            int cfr_ignored_0 = (0x196EE7F ^ n) + 2133897968;
        }
        if (mkh.mc.field_1724 == null || mkh.mc.field_1687 == null || mkh.mc.field_1761 == null) {
            this.dhkhsh();
            return;
        }
        boolean bl2 = bl = mkh.mc.field_1690.field_1904.method_1434() && mkh.mc.field_1755 == null;
        if (!bl) {
            this.ssr = false;
        }
        if (bl && !this.thza && this.dhwdh == tjf.zthk) {
            this.thldh();
        }
        this.thza = bl;
        if (this.dhwdh == tjf.dhya_2 && this.szs_2-- <= 0) {
            this.dhwdh = tjf.dtm;
        }
        if (this.dhwdh == tjf.dtm) {
            this.asb();
        }
        if (this.dhwdh == tjf.tthsh && this.jjd != null) {
            float[] fArray = btj_2.msh(this.jjd.method_17784());
            btj_2.sdd_3(fArray[0], fArray[1]);
        }
    }

    private static String y_2(String string, int n, int n2, int n3) {
        try {
            int n4 = 1443814925;
            n4 = Integer.rotateLeft(n4 * 1105332821, 25) ^ 0x70F01CDF;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            n4 = Integer.rotateLeft(n ^ n4, 29);
            int n5 = n4 ^ 0x800E3A3F;
            if ((n5 ^ n4) != -2146551233) {
                int cfr_ignored_0 = (0xD600E432 ^ n4) - -33421435;
            }
            if ((0x2DB & 0) != 0) {
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
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0xCCF42379) + khm ^ Integer.reverse(n2 + i * -1375161171), 11) - dhyn);
        }
        return new String(cArray);
    }

    private static void zghgh_2() {
        int n = -647586926;
        int n2 = (n = Integer.rotateLeft(n * 1252184013, 9) ^ 0x10AC245B) ^ 0x7551E964;
        if ((n2 ^ n) != 1968302436) {
            int cfr_ignored_0 = (0xAC3772F6 ^ n) - 1495826315;
        }
        yf.athz_2();
    }

    private static boolean shra_2() {
        block0: {
            int n = -1755029722;
            int n2 = (n = Integer.rotateLeft(n * -434536159, 16) ^ 0x4C88B0B9) ^ 0xAA3EA0D2;
            if ((n2 ^ n) == -1438736174) break block0;
            int cfr_ignored_0 = (0x3D5AFFF4 ^ n) - -234576691;
        }
        return yf.khdha_2();
    }

    private static void afh(mkh mkh2) {
        int n = -906258596;
        n = Integer.rotateLeft(n * 1730109533, 26) ^ 0xEFB94AD9;
        mkh mkh3 = mkh2;
        n = (mkh3 != null ? System.identityHashCode(mkh3) : 0) ^ n;
        int n2 = n ^ 0x9BCB8113;
        if ((n2 ^ n) != -1681161965) {
            int cfr_ignored_0 = (0x5230164F ^ n) - 1565092818;
        }
        mkh2.dhkhsh();
    }

    private static boolean zrz_2() {
        block0: {
            int n = 345441325;
            int n2 = (n = Integer.rotateLeft(n * -583936029, 22) ^ 0xBF265D1B) ^ 0x85F93A19;
            if ((n2 ^ n) == -2047264231) break block0;
            int cfr_ignored_0 = (0x916E3E34 ^ n) - 1485334717;
        }
        return yf.dnkh();
    }

    private static class_2338 znr_2(class_3965 class_39652) {
        block0: {
            int n = -1870682978;
            n = Integer.rotateLeft(n * 524100563, 20) ^ 0x6B3B168B;
            class_3965 class_39653 = class_39652;
            n = (class_39653 != null ? System.identityHashCode(class_39653) : 0) ^ n;
            int n2 = n ^ 0x38CBA0AB;
            if ((n2 ^ n) == 952869035) break block0;
            int cfr_ignored_0 = (0xA8B40435 ^ n) - 1663154301;
        }
        return class_39652.method_17777();
    }

    private static boolean azt(class_2680 class_26802, class_2248 class_22482) {
        block0: {
            int n = tas.dsr_2(1310705986);
            class_2680 class_26803 = class_26802;
            n = Integer.rotateRight((class_26803 != null ? System.identityHashCode(class_26803) : 0) ^ n, 17);
            class_2248 class_22483 = class_22482;
            n = (class_22483 != null ? System.identityHashCode(class_22483) : 0) ^ n;
            int n2 = n ^ 0x2A70D74A;
            if ((n2 ^ n) == 712038218) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x646F1E08 ^ n, 15) + 768754227;
        }
        return class_26802.method_27852(class_22482);
    }

    private static class_243 dkm_2(class_3965 class_39652) {
        block0: {
            int n = -1944687193;
            n = Integer.rotateLeft(n * 2017891949, 21) ^ 0xB885A15A;
            class_3965 class_39653 = class_39652;
            n = (class_39653 != null ? System.identityHashCode(class_39653) : 0) ^ n;
            int n2 = n ^ 0x1B6C51EA;
            if ((n2 ^ n) == 460083690) break block0;
            int cfr_ignored_0 = (0x977A3C4D ^ n) - -1979815925;
        }
        return class_39652.method_17784();
    }

    private static float tbt_3(int n) {
        block0: {
            int n2 = -968355535;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1772754223, 8) ^ 0xAE508274) ^ 0x54DAA3BC;
            if ((n3 ^ n2) == 1423614908) break block0;
            int cfr_ignored_0 = (0x9292B28D ^ n2) - -1096886382;
        }
        return Float.intBitsToFloat(n);
    }

    private static class_2338 zdh_3(class_3965 class_39652) {
        block0: {
            int n = tas.dsr_2(853399859);
            int n2 = n ^ 0xF1F593C4;
            if ((n2 ^ n) == -235564092) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xC3284AF7 ^ n, 11) - -1505840348) * -1020769545;
        }
        return class_39652.method_17777();
    }

    private static void szd_2(mkh mkh2) {
        int n = -718450651;
        int n2 = (n = Integer.rotateLeft(n * -1412274459, 13) ^ 0x13D0CC5D) ^ 0x8962DC87;
        if ((n2 ^ n) != -1990009721) {
            int cfr_ignored_0 = (0x5C4F8CA2 ^ n) + 186550739;
        }
        mkh2.bsa_2();
    }

    private static void thtd_4(mkh mkh2) {
        int n = -1642714106;
        int n2 = (n = Integer.rotateLeft(n * 998417027, 23) ^ 0x99C2030E) ^ 0x4D5F7265;
        if ((n2 ^ n) != 1298100837) {
            int cfr_ignored_0 = (0xD3495E63 ^ n) + 1205976500;
        }
        mkh2.als();
    }

    private static class_2680 jql(class_638 class_6382, class_2338 class_23382) {
        block0: {
            int n = 93103189;
            n = Integer.rotateLeft(n * -1860681645, 19) ^ 0x99893AB4;
            class_2338 class_23383 = class_23382;
            n = Integer.rotateRight((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 28);
            int n2 = n ^ 0x846E2D5E;
            if ((n2 ^ n) == -2073154210) break block0;
            int cfr_ignored_0 = (0x81E2890B ^ n) + -2128079427;
        }
        return class_6382.method_8320(class_23382);
    }

    private static void bthz_2(mkh mkh2) {
        int n = 1348003437;
        int n2 = (n = Integer.rotateLeft(n * -2003388861, 21) ^ 0x7B845545) ^ 0x97D5C029;
        if ((n2 ^ n) != -1747599319) {
            int cfr_ignored_0 = (0xC78D2644 ^ n) - -1118353849;
        }
        mkh2.als();
    }

    private static boolean shk(badh_2 badh2) {
        block0: {
            int n = -740803472;
            int n2 = (n = Integer.rotateLeft(n * -91307527, 25) ^ 0xE1A97DFA) ^ 0x9CB3CDB9;
            if ((n2 ^ n) == -1665937991) break block0;
            int cfr_ignored_0 = (0x4F6BF1C9 ^ n) - -1442194804;
        }
        return badh2.shzl();
    }

    private static boolean rhm_2(mkh mkh2) {
        block0: {
            int n = tas.dsr_2(1295664557);
            mkh mkh3 = mkh2;
            n = Integer.rotateRight((mkh3 != null ? System.identityHashCode(mkh3) : 0) ^ n, 20);
            int n2 = n ^ 0xB00BCA71;
            if ((n2 ^ n) == -1341404559) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xFD318FDC ^ n, 18) - -1386345761) * -47083555;
        }
        return mkh2.dhsd_3();
    }

    private static int tkht_2(mkh mkh2, class_1792 class_17922) {
        block0: {
            int n = 201287678;
            n = Integer.rotateLeft(n * 1753483009, 18) ^ 0xF1CED302;
            mkh mkh3 = mkh2;
            n = (mkh3 != null ? System.identityHashCode(mkh3) : 0) ^ n;
            int n2 = n ^ 0x425407CA;
            if ((n2 ^ n) == 1112803274) break block0;
            int cfr_ignored_0 = (0x49AB6034 ^ n) - 1028989463;
        }
        return mkh2.zjdh(class_17922);
    }

    private static class_3965 shtdh_2(mkh mkh2) {
        block0: {
            int n = -36103572;
            n = Integer.rotateLeft(n * -1193994229, 20) ^ 0x2CE01D2B;
            mkh mkh3 = mkh2;
            n = Integer.rotateRight((mkh3 != null ? System.identityHashCode(mkh3) : 0) ^ n, 11);
            int n2 = n ^ 0x75AB9F21;
            if ((n2 ^ n) == 1974181665) break block0;
            int cfr_ignored_0 = (0x8872854D ^ n) + -1745954514;
        }
        return mkh2.z_2();
    }

    private static void shnz_2(mkh mkh2, zm_2 zm2, int n, class_3965 class_39652, class_2338 class_23382, boolean bl) {
        int n2 = -1504333272;
        n2 = Integer.rotateLeft(n2 * 1405002095, 4) ^ 0x573BD304;
        zm_2 zm3 = zm2;
        n2 = (zm3 != null ? System.identityHashCode((Object)zm3) : 0) ^ n2;
        class_2338 class_23383 = class_23382;
        n2 = Integer.rotateRight((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n2, 5);
        int n3 = n2 ^ 0x5A7DDAA;
        if ((n3 ^ n2) != 94887338) {
            int cfr_ignored_0 = (0xA3F26F82 ^ n2) + -767796241;
        }
        mkh2.dshs_3(zm2, n, class_39652, class_23382, bl);
    }

    private static int tsb(mkh mkh2) {
        block0: {
            int n = -35472933;
            n = Integer.rotateLeft(n * 719125897, 15) ^ 0x651B87A9;
            mkh mkh3 = mkh2;
            n = (mkh3 != null ? System.identityHashCode(mkh3) : 0) ^ n;
            int n2 = n ^ 0xE57C228E;
            if ((n2 ^ n) == -444849522) break block0;
            int cfr_ignored_0 = (0x189E9B55 ^ n) - -587074479;
        }
        return mkh2.zjk_2();
    }

    private static class_3965 khnsh(mkh mkh2) {
        block0: {
            int n = -232588140;
            int n2 = (n = Integer.rotateLeft(n * -414639701, 14) ^ 0xEFF2D9BC) ^ 0x94A6792D;
            if ((n2 ^ n) == -1801029331) break block0;
            int cfr_ignored_0 = (0x668485B9 ^ n) + -1382068967;
        }
        return mkh2.z_2();
    }

    private static boolean shdd(badh_2 badh2) {
        block0: {
            int n = -42298316;
            n = Integer.rotateLeft(n * -385505665, 11) ^ 0xFE6CE9A1;
            badh_2 badh3 = badh2;
            n = Integer.rotateLeft((badh3 != null ? System.identityHashCode(badh3) : 0) ^ n, 10);
            int n2 = n ^ 0x971B82AE;
            if ((n2 ^ n) == -1759804754) break block0;
            int cfr_ignored_0 = (0x6A61169A ^ n) - 269329733;
        }
        return badh2.shzl();
    }

    private static boolean khwy(class_2338 class_23382) {
        block0: {
            int n = tas.dsr_2(-2085392542);
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            int n2 = n ^ 0x902B8A2D;
            if ((n2 ^ n) == -1876194771) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x1398E54F ^ n, 5) - 1675715532;
        }
        return btj_2.tmb(class_23382);
    }

    private static void zss_8(mkh mkh2) {
        int n = -591558375;
        n = Integer.rotateLeft(n * 1800099161, 27) ^ 0xF598D759;
        mkh mkh3 = mkh2;
        n = (mkh3 != null ? System.identityHashCode(mkh3) : 0) ^ n;
        int n2 = n ^ 0x45BACB0C;
        if ((n2 ^ n) != 1169869580) {
            int cfr_ignored_0 = (0x99074215 ^ n) + 906971103;
        }
        mkh2.als();
    }

    private static boolean nk(class_2680 class_26802) {
        block0: {
            int n = 630974593;
            int n2 = (n = Integer.rotateLeft(n * -962626581, 10) ^ 0x81B4CBE0) ^ 0xBC628987;
            if ((n2 ^ n) == -1134392953) break block0;
            int cfr_ignored_0 = (0x99F96106 ^ n) - 1029742836;
        }
        return class_26802.method_45474();
    }

    private static class_3965 hha_4(class_2338 class_23382, dj_2 dj2_2, boolean bl) {
        block0: {
            int n = 1568562701;
            n = Integer.rotateLeft(n * -1510549631, 5) ^ 0xAA3D55DD;
            class_2338 class_23383 = class_23382;
            n = Integer.rotateRight((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 16);
            dj_2 dj3 = dj2_2;
            n = (dj3 != null ? System.identityHashCode((Object)dj3) : 0) ^ n;
            int n2 = n ^ 0x9134699F;
            if ((n2 ^ n) == -1858836065) break block0;
            int cfr_ignored_0 = (0xCC4A3792 ^ n) - -852096888;
        }
        return btj_2.twd_4(class_23382, dj2_2, bl);
    }

    private static class_3965 tjth_2(class_2338 class_23382, dj_2 dj2_2, boolean bl) {
        block0: {
            int n = -359415872;
            n = Integer.rotateLeft(n * 1127644149, 6) ^ 0xDD36D613;
            class_2338 class_23383 = class_23382;
            n = (class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n;
            dj_2 dj3 = dj2_2;
            n = (dj3 != null ? System.identityHashCode((Object)dj3) : 0) ^ n;
            int n2 = n ^ 0x4708B8B2;
            if ((n2 ^ n) == 1191753906) break block0;
            int cfr_ignored_0 = (0xAD9B0772 ^ n) - 1280799322;
        }
        return btj_2.twd_4(class_23382, dj2_2, bl);
    }

    private static void awh(mkh mkh2, zm_2 zm2, int n, class_3965 class_39652, class_2338 class_23382, boolean bl) {
        int n2 = 664378530;
        n2 = Integer.rotateLeft(n2 * 1832408031, 24) ^ 0x4F08BAE1;
        mkh mkh3 = mkh2;
        n2 = (mkh3 != null ? System.identityHashCode(mkh3) : 0) ^ n2;
        int n3 = (n2 = Integer.rotateLeft(n ^ n2, 19)) ^ 0xFF56F2A0;
        if ((n3 ^ n2) != -11079008) {
            int cfr_ignored_0 = (0xD8CF6E02 ^ n2) - -2140839930;
        }
        mkh2.dshs_3(zm2, n, class_39652, class_23382, bl);
    }

    private static void ddr_4(mkh mkh2) {
        int n = 1355223884;
        int n2 = (n = Integer.rotateLeft(n * 2120914291, 10) ^ 0xB999CB28) ^ 0x55C67DCD;
        if ((n2 ^ n) != 1439071693) {
            int cfr_ignored_0 = (0x5016E81 ^ n) + -1219140354;
        }
        mkh2.als();
    }

    private static void hkh_3() {
        int n = 672750245;
        int n2 = (n = Integer.rotateLeft(n * -700347861, 5) ^ 0x1B1F2BAD) ^ 0x82F76750;
        if ((n2 ^ n) != -2097715376) {
            int cfr_ignored_0 = (0xAAEE3DF5 ^ n) - -896627242;
        }
        yf.athz_2();
    }

    private static void hwy(mkh mkh2) {
        int n = -1836511795;
        int n2 = (n = Integer.rotateLeft(n * -140786177, 19) ^ 0xAE77C19E) ^ 0x1F2913F4;
        if ((n2 ^ n) != 522785780) {
            int cfr_ignored_0 = (0x8DA01E39 ^ n) + 1887984987;
        }
        mkh2.als();
    }

    private static boolean thhf() {
        block0: {
            int n = 920216457;
            int n2 = (n = Integer.rotateLeft(n * 1682177933, 26) ^ 0x2485B353) ^ 0x66FB089B;
            if ((n2 ^ n) == 1727727771) break block0;
            int cfr_ignored_0 = (0x50226B12 ^ n) + 790365781;
        }
        return yf.dnkh();
    }

    private static void thal(class_7204 class_72042) {
        int n = 1963741655;
        int n2 = (n = Integer.rotateLeft(n * -2059502933, 25) ^ 0xD4ADA1DF) ^ 0x97E982ED;
        if ((n2 ^ n) != -1746304275) {
            int cfr_ignored_0 = (0xE2E5D33A ^ n) + -303923496;
        }
        btj_2.bhd_2(class_72042);
    }

    private static String[] ssha(String string) {
        block0: {
            int n = 1311515189;
            int n2 = (n = Integer.rotateLeft(n * -671766361, 21) ^ 0xB38BFC05) ^ 0x311FD165;
            if ((n2 ^ n) == 824168805) break block0;
            int cfr_ignored_0 = (0x7F33F350 ^ n) - 73946865;
        }
        return string.split("\u0005\u001e", -1);
    }

    private static CallSite shlh_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1439768561;
            n3 = Integer.rotateLeft(n3 * 913789039, 19) ^ 0x6F725199;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 2);
            int n4 = n3 ^ 0x7C821E9B;
            if ((n4 ^ n3) != 2088902299) {
                int cfr_ignored_0 = (0x2953016A ^ n3) - 2069951424;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ shht_2 ^ string.hashCode()) + (n2 + sthn) + i ^ shht_2, 14) + sthn);
            }
            String[] stringArray = mkh.ssha(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] tvsairn4ou0gpv(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite t3r4v2p3go0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ rvut7tx ^ string.hashCode()) + (n2 + dxato8ift) + i ^ rvut7tx, 28) + dxato8ift);
            }
            String[] stringArray = mkh.tvsairn4ou0gpv(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

