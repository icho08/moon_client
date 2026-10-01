/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_10151
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_2561
 *  net.minecraft.class_279
 *  net.minecraft.class_2960
 *  net.minecraft.class_9960
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import lombok.Generated;
import net.minecraft.class_10151;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_279;
import net.minecraft.class_2960;
import net.minecraft.class_9960;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bsf_2;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tdw;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.rh;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.ya_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Outlines", category=bzw.OTHER, desc="Player outlines and shader glow ESP effects")
public class thd_2
extends bnq {
    private static thd_2 rmz;
    private static final class_2960 khhm_2;
    private static final float hghk = 2.0f;
    private static final float thzd_3 = 0.2f;
    private static final float tsh_8 = 1.0f;
    private final khd stt_5 = new khd(this, "Mode");
    private final fy ththa_2 = new fy(this.stt_5, "Outline");
    private final fy thhn = new fy(this.stt_5, "Glow");
    private final badh_2 thkhw = new badh_2(this, "Show Friends").bts(true);
    private final tay thkhsh = new tay(this, "Max Dis".concat("tance")).shth_7(Float.intBitsToFloat(0xFF9BABC6 ^ 0xBE1BABC6)).dhbs_2(Float.intBitsToFloat(1139294574 + -6832494)).rkh_3(Float.intBitsToFloat(1977265235 - 886746195)).ssd_5(Float.intBitsToFloat(714569764 - -409503708));
    private final bzw_2 dhhw = new bzw_2(this, "Outline Color", this::dmq_2).dhshy(new byq(Float.intBitsToFloat(0x6507EB79 ^ 0x2678EB79), Float.intBitsToFloat(Integer.reverse(-567865065) ^ 0xABF7E47B), Float.intBitsToFloat(Integer.reverse(1647218643) ^ 0x888E7446), Float.intBitsToFloat(-1052471044 + -2110099708)));
    private final tay jsa_3 = new tay((hy)this, "Glow Radius", this::jda).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x45BAB446 ^ 0xAC98775, 2))).dhbs_2(Float.intBitsToFloat(Integer.reverse(-573965166) ^ 0x99F93BB)).rkh_3(Float.intBitsToFloat(641625686 + 395206263)).ssd_5(1.0f);
    private final tay shaq_2 = new tay((hy)this, "Glow Inte".concat("nsity"), this::dhaz).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(932400222) ^ 0x3B12C9EC)).rkh_3(Float.intBitsToFloat(698168718 + 338663231)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xF046625D ^ 0xC546516E, 6)));
    private final tay msh = new tay((hy)this, "Outline ".concat("Sharpness"), this::khql).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(-999890364 - -2084117948)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xBC26C055 ^ 0x70EBFD99, 16))).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xA29B10D9 ^ 0xC404D6BF, 9)));
    private final tay skh_4 = new tay((hy)this, "Blur Radius", this::zshs_2).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(-878991651 - -1965316387)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.reverse(1887927039) ^ 0xBFDEE10E));
    private final tay rll = new tay((hy)this, "Brightness", this::ghzsh).shth_7(Float.intBitsToFloat(0xC08F240E ^ 0xFF8F240E)).dhbs_2(Float.intBitsToFloat(-312487327 - -1396714911)).rkh_3(Float.intBitsToFloat(0x8E105618 ^ 0xB3DC9AD5)).ssd_5(2.0f);
    private final tay dhab_2 = new tay((hy)this, "Saturation", this::thzd_3).shth_7(0.0f).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(0x51E96357 ^ 0x6C25AF9A)).ssd_5(1.0f);
    private final badh_2 khtw = new badh_2((hy)this, "Auto Color", this::tdz_2).bts(true);
    private final badh_2 sjh = new badh_2((hy)this, "Render Self", this::jns_2).bts(false);
    private final bzw_2 rrq = new bzw_2(this, "Color 1", this::shh_7).dhshy(byq.rghk("#8A98FFFF"));
    private final bzw_2 sdth_3 = new bzw_2(this, "Color 2", this::alk).dhshy(byq.rghk("#FF6BACFF"));
    private final badh_2 hfa_2 = new badh_2((hy)this, "Rainbow", this::tqgh).bts(false);
    private final tay dhlsh = new tay((hy)this, "Rainbo".concat("w Speed"), this::ns_2).shth_7(Float.intBitsToFloat(Integer.reverse(857999772) ^ 0x45CE801)).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1796874945) ^ 0xBC1BA729)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xD44EA107 ^ 0xBDA0C761, 5))).ssd_5(1.0f);
    private final tay thdhz_2 = new tay((hy)this, "Rain".concat("bow Scale"), this::rtj).shth_7(Float.intBitsToFloat(-1482818415 + -1775316932)).dhbs_2(Float.intBitsToFloat(-391808343 - -1476035927)).rkh_3(Float.intBitsToFloat(0xC5BAE125 ^ 0xF8762DE8)).ssd_5(1.0f);
    private final badh_2 shqr = new badh_2((hy)this, "Outline", this::shzkh_2).bts(false);
    private final tay thhk_2 = new tay((hy)this, "Outline".concat(" Width"), this::srq).shth_7(Float.intBitsToFloat(0xF57F721E ^ 0xCA7F721E)).dhbs_2(Float.intBitsToFloat(-312636631 - -1390572759)).rkh_3(Float.intBitsToFloat(-155784107 + 1212748715)).ssd_5(1.0f);
    private final bzw_2 dghw = new bzw_2(this, "Outline Col".concat("or (Glow)"), this::tdz_6).dhshy(byq.rghk("#8A98FFFF"));
    private final Set hqz_2 = new HashSet();
    private boolean sda_3;
    private final bql<ya_2> dnk = this::shth_2;
    private final bql<shw_3> khk = this::lth;
    private final bql<bsf_2> zfn = this::bh;
    private static final int thha_2 = -1440514868;
    private static final int rghw = 726397884;
    private static final int rss = 1055345032;
    private static final int thzm_2 = -2089387540;
    private static final int nz1oaww = -1599342810;
    private static final int g8uipayb6 = 1219961874;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int u6fvs5si7g2;

    public static thd_2 zlw() {
        block0: {
            int n = 731981038;
            int n2 = (n = Integer.rotateLeft(n * 1302006529, 8) ^ 0xCA42FAA) ^ 0xE15D96AD;
            if ((n2 ^ n) == -513960275) break block0;
            int cfr_ignored_0 = (0xCAFCB243 ^ n) - -93842197;
        }
        return rmz;
    }

    public thd_2() {
        rmz = this;
    }

    @Override
    public void nt() {
        try {
            int n = 145285843;
            n = Integer.rotateLeft(n * 1462155711, 19) ^ 0xDE2C1E92;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xEA2E8FAD;
            if ((n2 ^ n) != -366047315) {
                int cfr_ignored_0 = (0xE2866D7E ^ n) - -1934505646;
            }
            if ((0xD1 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        this.hqz_2.clear();
        this.sda_3 = false;
        if (thd_2.mc.field_1687 != null && thd_2.mc.field_1724 != null) {
            if (this.stt_5.sdh_2() == this.ththa_2) {
                thd_2.dzt_5(this);
            } else {
                this.akhh();
            }
        }
    }

    @Override
    public void nc() {
        int n = 0;
        int n2 = 1937391711;
        n2 = Integer.rotateLeft(n2 * -768462017, 28) ^ 0x7F559DBE;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 2);
        int n3 = 1193794584 + n2 ^ 0xED9DAA41 ^ 0xED9DAA41;
        while (true) {
            block25: {
                block29: {
                    block28: {
                        block34: {
                            block40: {
                                block38: {
                                    block23: {
                                        block27: {
                                            block39: {
                                                block22: {
                                                    block33: {
                                                        block30: {
                                                            block24: {
                                                                block41: {
                                                                    block35: {
                                                                        block36: {
                                                                            block37: {
                                                                                block31: {
                                                                                    block32: {
                                                                                        block20: {
                                                                                            block26: {
                                                                                                block21: {
                                                                                                    if ((n = n3 - n2) > 305895700) break block20;
                                                                                                    if (n > -1632869259) break block21;
                                                                                                    if (n == -1892996446) break block22;
                                                                                                    if (n == -1802312908) break block23;
                                                                                                    int cfr_ignored_0 = Integer.rotateRight(0xB7EF41EF ^ n2, 9) - 1247189804;
                                                                                                    if (n == -1632869259) break block24;
                                                                                                    break block25;
                                                                                                }
                                                                                                if (n > -58289191) break block26;
                                                                                                if (n == -1581602281) break block27;
                                                                                                if (n == -58289191) break block28;
                                                                                                break block25;
                                                                                            }
                                                                                            if (n == 299091350) break block29;
                                                                                            if (n == 305895700) break block30;
                                                                                            break block25;
                                                                                        }
                                                                                        if (n > 1193794584) break block31;
                                                                                        if (n > 753078899) break block32;
                                                                                        if (n == 674946282) break block33;
                                                                                        if (n == 753078899) break block34;
                                                                                        break block25;
                                                                                    }
                                                                                    if (n == 1064813135) break block35;
                                                                                    if (n == 1193794584) break block36;
                                                                                    int cfr_ignored_1 = Integer.rotateLeft(0xCEA8A301 ^ n2, 12) + 180968538;
                                                                                    int cfr_ignored_2 = (int)(0xC1A0D3C27D4EB4FL ^ (long)n2 ^ 0xE708831A2DB9B5E5L);
                                                                                    break block25;
                                                                                }
                                                                                if (n > 1422434515) break block37;
                                                                                if (n == 1372869473) break block38;
                                                                                if (n == 1422434515) break block39;
                                                                                int cfr_ignored_3 = Integer.rotateLeft(0x7A8C61C5 ^ n2, 18) - -614631914;
                                                                                int cfr_ignored_4 = (int)(0xB83ECFF827D4EB4FL ^ (long)n2 ^ 0x6280831A2DB8DDACL);
                                                                                break block25;
                                                                            }
                                                                            if (n == 1425420793) break block40;
                                                                            if (n == 1919181725) break block41;
                                                                            int cfr_ignored_5 = Integer.rotateLeft(0x8F40EEED ^ n2, 4) - 1564118510;
                                                                            int cfr_ignored_6 = (int)(0x4DF240D027D4EB4FL ^ (long)n2 ^ 0x7CD0831A2DB93635L);
                                                                            break block25;
                                                                        }
                                                                        int cfr_ignored_7 = (Integer.rotateLeft(0x68B8D3D9 ^ n2, 16) + -1296087422) * 1756943321;
                                                                        int cfr_ignored_8 = (int)(0xAA0A7DE427D4EB4FL ^ (long)n2 ^ 0x6B8831A2DB8F9C5L);
                                                                        this.hqz_2.clear();
                                                                        this.sda_3 = false;
                                                                        if (thd_2.mc.field_1687 != null) {
                                                                            try {
                                                                                ++n;
                                                                                if ((0xDBC7FA0A1870AF33L ^ (long)n2 | 1L) == 0L) {
                                                                                    throw new ArithmeticException();
                                                                                }
                                                                                n3 = -1632869259 + n2 ^ 0x5BDE2AF5 ^ 0x5BDE2AF5;
                                                                            }
                                                                            catch (ArithmeticException arithmeticException) {
                                                                                n3 = -1632869259 + n2 + 1400066697 - 1400066697;
                                                                            }
                                                                            n += 2;
                                                                            continue;
                                                                        }
                                                                        n3 = 1838021155 + n2;
                                                                        int cfr_ignored_9 = Integer.rotateLeft(0x9B5886EC ^ n2, 6) - -736758321;
                                                                        n3 = 1919181725 + n2;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_10 = Integer.rotateLeft(0x44CD2468 ^ n2, 11) + 1496647635;
                                                                    this.akhh();
                                                                    n3 = 1693582649 + n2 + -67786372 - -67786372;
                                                                    int cfr_ignored_11 = (Integer.rotateRight(0x74E0FBDB ^ n2, 17) + 731651776) * 1960901595;
                                                                    n3 = Integer.reverse(Integer.reverse(1919181725 + n2));
                                                                    continue;
                                                                }
                                                                int cfr_ignored_12 = Integer.rotateRight(0x279805CE ^ n2, 7) - -809086163;
                                                                tdw.skhn().thfn();
                                                                return;
                                                            }
                                                            int cfr_ignored_13 = (Integer.rotateRight(0x3690AB36 ^ n2, 9) - -1612555579) * 915450679;
                                                            if (thd_2.mc.field_1724 != null) {
                                                                n3 = 1064813135 + n2 + -1582854778 - -1582854778;
                                                                n += 5;
                                                                continue;
                                                            }
                                                            n3 = 1919181725 + n2 + 1837211070 - 1837211070;
                                                            int cfr_ignored_14 = Integer.rotateLeft(0xF8E2A645 ^ n2, 18) - 667926934;
                                                            int cfr_ignored_15 = (int)(0x3A50087827D4EB4FL ^ (long)n2 ^ 0xED80831A2DB9D971L);
                                                            n += 3;
                                                            continue;
                                                        }
                                                        int cfr_ignored_16 = (Integer.rotateLeft(0xF0660BB0 ^ n2, 17) + 548997515) * -261747791;
                                                        n3 = (int)((long)(-215200111 + n2) ^ 0x5A92811D779BDAAFL ^ 0x5A92811D779BDAAFL);
                                                        int cfr_ignored_17 = Integer.rotateLeft(0x8410CACC ^ n2, 3) - 40250863;
                                                        n3 = Integer.reverse(Integer.reverse(1193794584 + n2));
                                                        --n;
                                                        continue;
                                                    }
                                                    int cfr_ignored_18 = Integer.rotateRight(0xB845C78B ^ n2, 10) + 1422969104;
                                                    n3 = -1400094948 + n2 ^ 0x4621B554 ^ 0x4621B554;
                                                    int cfr_ignored_19 = (Integer.rotateLeft(0x4225B9D0 ^ n2, 11) + 116334443) * 1109768657;
                                                    try {
                                                        n -= 2;
                                                        n3 = Integer.reverse(Integer.reverse(1193794584 + n2));
                                                    }
                                                    catch (ArithmeticException arithmeticException) {
                                                        n3 = 1193794584 + n2;
                                                    }
                                                    continue;
                                                }
                                                int cfr_ignored_20 = (Integer.rotateLeft(0x60ABC1B8 ^ n2, 15) + -1188424573) * 1621868985;
                                                n3 = (int)((long)(815438368 + n2) ^ 0xD8330CF49BD59F71L ^ 0xD8330CF49BD59F71L);
                                                int cfr_ignored_21 = (Integer.rotateLeft(0xFA5F7ED8 ^ n2, 18) + 1441659747) * -94404903;
                                                try {
                                                    n -= 3;
                                                    if ((0x8F6AD1011FFF09FDL ^ (long)n2 | 1L) == 0L) {
                                                        throw new ArithmeticException();
                                                    }
                                                    n3 = Integer.reverse(Integer.reverse(1193794584 + n2));
                                                }
                                                catch (ArithmeticException arithmeticException) {
                                                    n3 = 1193794584 + n2 ^ 0xD5C46A33 ^ 0xD5C46A33;
                                                }
                                                n -= 3;
                                                continue;
                                            }
                                            int cfr_ignored_22 = (Integer.rotateLeft(0xFADD4BF4 ^ n2, 18) - 1697239495) * -86160395;
                                            try {
                                                n += 3;
                                                if ((0x89F2E1D0B444F2A1L ^ (long)n2 | 1L) == 0L) {
                                                    throw new UnsupportedOperationException();
                                                }
                                                n3 = 1193794584 + n2 ^ 0xB4F3EF04 ^ 0xB4F3EF04;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                n3 = 1193794584 + n2 + -1083141770 - -1083141770;
                                            }
                                            n += 5;
                                            continue;
                                        }
                                        int cfr_ignored_23 = Integer.rotateRight(0xEBB4FC27 ^ n2, 16) - -1891096588;
                                        n3 = (int)((long)(126783823 + n2) ^ 0xAB550D193524FD2AL ^ 0xAB550D193524FD2AL);
                                        int cfr_ignored_24 = Integer.rotateRight(0x2C59F5E2 ^ n2, 8) + 1665295769;
                                        n3 = (int)((long)(-1821671537 + n2) ^ 0x4204A2EFF2372851L ^ 0x4204A2EFF2372851L);
                                        int cfr_ignored_25 = Integer.rotateRight(0x8AC7440E ^ n2, 4) - -763437843;
                                        n3 = Integer.reverse(Integer.reverse(1193794584 + n2));
                                        n += 4;
                                        continue;
                                    }
                                    int cfr_ignored_26 = Integer.rotateLeft(0x7D0F1BE5 ^ n2, 18) - 691142646;
                                    int cfr_ignored_27 = (int)(0xBFBDB5D827D4EB4FL ^ (long)n2 ^ 0x96C0831A2DB8D2AAL);
                                    n3 = -1638237343 + n2 + -826085806 - -826085806;
                                    int cfr_ignored_28 = Integer.rotateLeft(0x45550181 ^ n2, 11) + 1772670426;
                                    int cfr_ignored_29 = (int)(0x87E7AFBC27D4EB4FL ^ (long)n2 ^ 0xA208831A2DB8A21EL);
                                    n3 = Integer.reverse(Integer.reverse(1193794584 + n2));
                                    int cfr_ignored_30 = (Integer.rotateLeft(0x29B422D8 ^ n2, 8) + 288216931) * 699671257;
                                    --n;
                                    continue;
                                }
                                int cfr_ignored_31 = (Integer.rotateRight(0x8B925DB7 ^ n2, 4) - -350816156) * -1953342025;
                                n3 = (int)((long)(1768966732 + n2) ^ 0xC27F058A16DAF4D0L ^ 0xC27F058A16DAF4D0L);
                                int cfr_ignored_32 = (Integer.rotateLeft(0x20BA1E50 ^ n2, 7) + -85505301) * 549068369;
                                try {
                                    n += 2;
                                    if ((0xDEDC405C54F45AEDL ^ (long)n2 | 1L) == 0L) {
                                        throw new IllegalStateException();
                                    }
                                    n3 = Integer.reverse(Integer.reverse(1193794584 + n2));
                                }
                                catch (IllegalStateException illegalStateException) {
                                    n3 = 1193794584 + n2;
                                }
                                n += 4;
                                continue;
                            }
                            int cfr_ignored_33 = (Integer.rotateRight(0xBB1CE95A ^ n2, 10) + -1394745055) * -1155733157;
                            n3 = Integer.reverse(Integer.reverse(-260415558 + n2));
                            int cfr_ignored_34 = Integer.rotateRight(0x1400732B ^ n2, 5) + 1886097776;
                            n3 = 1193794584 + n2 ^ 0x4C02743F ^ 0x4C02743F;
                            n -= 3;
                            continue;
                        }
                        int cfr_ignored_35 = Integer.rotateRight(0x45235E83 ^ n2, 11) + 1671827736;
                        n3 = 1193794584 + n2 ^ 0xF12FD9EA ^ 0xF12FD9EA;
                        int cfr_ignored_36 = (Integer.rotateLeft(0xE606639 ^ n2, 4) + -1039531998) * 241198649;
                        int cfr_ignored_37 = (int)(0xCCD2C80427D4EB4FL ^ (long)n2 ^ 0x6D78831A2DB83474L);
                        n -= 4;
                        continue;
                    }
                    int cfr_ignored_38 = Integer.rotateRight(0x21026DA3 ^ n2, 7) + 61400568;
                    int cfr_ignored_39 = (int)(0x427BB29DA7670C7BL ^ (long)n2 ^ 0x984B827DE3D12926L);
                    n3 = 1193794584 + n2 + -1226700940 - -1226700940;
                    n -= 3;
                    continue;
                }
                int cfr_ignored_40 = (Integer.rotateLeft(0x885208FC ^ n2, 4) - -2041793089) * -2007889667;
                n3 = -37153454 + n2 ^ 0xC4322645 ^ 0xC4322645;
                int cfr_ignored_41 = Integer.rotateRight(0x5646FE82 ^ n2, 13) + 1995862265;
                try {
                    n += 3;
                    if ((0xA30CA715307DEB9BL ^ (long)n2 | 1L) == 0L) {
                        throw new IllegalArgumentException();
                    }
                    n3 = Integer.reverse(Integer.reverse(1193794584 + n2));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    n3 = (int)((long)(1193794584 + n2) ^ 0xE216D210A90388FBL ^ 0xE216D210A90388FBL);
                }
                n -= 2;
                continue;
            }
            int cfr_ignored_42 = Integer.rotateLeft(0xB658CA41 ^ n2, 9) + 421403930;
            int cfr_ignored_43 = (int)(0x74EA647C27D4EB4FL ^ (long)n2 ^ 0x3588831A2DB94405L);
            n3 = 1193794584 + n2 ^ 0x52C031DE ^ 0x52C031DE;
        }
    }

    public boolean szt_2(class_1297 class_12972) {
        int n = 565595400;
        int n2 = (n = Integer.rotateLeft(n * -602658707, 12) ^ 0x1DE3F0B8) ^ 0x9644E65C;
        if ((n2 ^ n) != -1773869476) {
            int cfr_ignored_0 = (0xB7F2AB54 ^ n) - -637542935;
        }
        return thd_2.khwgh(this) && thd_2.shss(this.stt_5) == this.ththa_2 && class_12972 != null && this.hqz_2.contains(class_12972.method_5628());
    }

    public byq zlz_4() {
        block0: {
            int n = 385293198;
            n = Integer.rotateLeft(n * 1057442579, 7) ^ 0x66CB72B1;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 4);
            int n2 = n ^ 0x224ED384;
            if ((n2 ^ n) == 575591300) break block0;
            int cfr_ignored_0 = (0x34B9C80A ^ n) + 2131537024;
        }
        return this.dhhw.sdsh_4();
    }

    private void zwl() {
        if (thd_2.mc.field_1687 == null || thd_2.mc.field_1724 == null) {
            this.hqz_2.clear();
            return;
        }
        HashSet<Integer> hashSet = new HashSet<Integer>();
        boolean bl = thd_2.mc.field_1690.method_31044().method_31034();
        double d = this.thkhsh.thw_5() * this.thkhsh.thw_5();
        for (class_1657 class_16572 : thd_2.mc.field_1687.method_18456()) {
            if (!this.shsh_3(class_16572, bl, d)) continue;
            hashSet.add(class_16572.method_5628());
        }
        this.hqz_2.clear();
        this.hqz_2.addAll(hashSet);
    }

    private boolean shsh_3(class_1657 class_16572, boolean bl, double d) {
        int n = 1204948664;
        n = Integer.rotateLeft(n * 1004632577, 18) ^ 0x5367B1AF;
        class_1657 class_16573 = class_16572;
        n = Integer.rotateRight((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 10);
        n = (int)Double.doubleToLongBits(d) ^ n;
        int n2 = n ^ 0xB0C80527;
        if ((n2 ^ n) != -1329068761) {
            int cfr_ignored_0 = (0xF71A0B9F ^ n) - 1587192964;
        }
        if (class_16572 == null || !thd_2.thdhs_2(class_16572)) {
            return false;
        }
        if (class_16572 == thd_2.mc.field_1724 && bl) {
            return false;
        }
        boolean bl2 = thd_2.rja_2(thd_2.zghkh_2(Moondlc.getInstance()), thd_2.jhgh_2(class_16572).getString());
        if (bl2 && !this.thkhw.shzl()) {
            return false;
        }
        return thd_2.mc.field_1724.method_5858((class_1297)class_16572) <= d;
    }

    private void ssf_4() {
        if (thd_2.mc.field_1687 == null || thd_2.mc.field_1724 == null || this.sda_3) {
            return;
        }
        this.skhf(2.0f * this.jsa_3.thw_5(), this.shaq_2.thw_5() / 10.0f, this.msh.thw_5());
    }

    private void akhh() {
        this.skhf(2.0f, 0.2f, 1.0f);
    }

    private void skhf(float f, float f2, float f3) {
        int n = -1528867507;
        int n2 = (n = Integer.rotateLeft(n * 2024350389, 23) ^ 0x85C7A9B7) ^ 0xC470FC22;
        if ((n2 ^ n) != -999228382) {
            int cfr_ignored_0 = (0x60AFA96F ^ n) - 1630797935;
        }
        if (thd_2.mc.field_1687 == null || thd_2.mc.field_1724 == null || mc.method_62887() == null) {
            return;
        }
        try {
            class_279 class_2792 = thd_2.dyz(mc.method_62887(), khhm_2, class_9960.field_53903);
            if (class_2792 == null) {
                return;
            }
            try {
                thd_2.khtq_2(class_2792, "uRadius", Math.max(Float.intBitsToFloat(Integer.rotateLeft(0xC24483C5 ^ 0xB177B08A, 26)), f));
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                thd_2.khght_2(class_2792, "uIntensity", Math.max(0.0f, f2));
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                class_2792.method_57799("uSharpness", Math.max(0.0f, f3));
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                thd_2.tjq_2(class_2792, "Glow".concat("Intensity"), Math.max(0.0f, f2 * Float.intBitsToFloat(Integer.rotateLeft(0xD743EC78 ^ 0xD741E578, 13))));
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                class_2792.method_57799("Origina".concat("lIntensity"), thd_2.khjq(0.0f, f3));
            }
            catch (Exception exception) {}
        }
        catch (Exception exception) {
            System.err.println("[Outlines] Failed to load outline post effect: " + thd_2.dkth_2(exception));
            exception.printStackTrace();
            this.sda_3 = true;
        }
    }

    @Generated
    public khd zzdh_3() {
        block0: {
            int n = rh.shhs(-930239479);
            int n2 = n ^ 0xE9FEDBB3;
            if ((n2 ^ n) == -369173581) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x217377BA ^ n, 7) + 291053249) * 561215419;
        }
        return this.stt_5;
    }

    @Generated
    public fy rbj() {
        block0: {
            int n = -170201534;
            n = Integer.rotateLeft(n * -712098911, 3) ^ 0x22B3DC62;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 27);
            int n2 = n ^ 0xEB27DAC4;
            if ((n2 ^ n) == -349709628) break block0;
            int cfr_ignored_0 = (0x1EFD3486 ^ n) - 134591418;
        }
        return this.ththa_2;
    }

    @Generated
    public fy djj() {
        block0: {
            int n = 323706672;
            n = Integer.rotateLeft(n * 234601227, 14) ^ 0x4D5746D0;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 20);
            int n2 = n ^ 0xCC68C94C;
            if ((n2 ^ n) == -865547956) break block0;
            int cfr_ignored_0 = (0xDF23967C ^ n) + 1741077393;
        }
        return this.thhn;
    }

    @Generated
    public badh_2 dsz_6() {
        block0: {
            int n = -600125693;
            n = Integer.rotateLeft(n * 1563285013, 13) ^ 0x3B07731;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 23);
            int n2 = n ^ 0x4D291945;
            if ((n2 ^ n) == 1294539077) break block0;
            int cfr_ignored_0 = (0x9113D646 ^ n) + 1603739296;
        }
        return this.thkhw;
    }

    @Generated
    public tay srd_3() {
        block0: {
            int n = -1540805115;
            n = Integer.rotateLeft(n * 551747839, 10) ^ 0x52742AD5;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xD2A0E376;
            if ((n2 ^ n) == -761207946) break block0;
            int cfr_ignored_0 = (0x7689CD73 ^ n) - 1963733356;
        }
        return this.thkhsh;
    }

    @Generated
    public tay zsk_4() {
        block0: {
            int n = -1723992668;
            n = Integer.rotateLeft(n * -1560737979, 10) ^ 0x35F10878;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 3);
            int n2 = n ^ 0x2AC264A1;
            if ((n2 ^ n) == 717382817) break block0;
            int cfr_ignored_0 = (0xB3FF9105 ^ n) + -793947722;
        }
        return this.skh_4;
    }

    @Generated
    public tay khzd() {
        block0: {
            int n = 612625989;
            n = Integer.rotateLeft(n * 478991395, 6) ^ 0x53AEB9C8;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xA96AF0DF;
            if ((n2 ^ n) == -1452609313) break block0;
            int cfr_ignored_0 = (0x8DE91E9A ^ n) + 984135095;
        }
        return this.rll;
    }

    @Generated
    public tay khf() {
        block0: {
            int n = -1755767717;
            n = Integer.rotateLeft(n * -648383305, 26) ^ 0xF7535D7F;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 8);
            int n2 = n ^ 0x68891835;
            if ((n2 ^ n) == 1753815093) break block0;
            int cfr_ignored_0 = (0xFFD0046E ^ n) - 115049917;
        }
        return this.dhab_2;
    }

    @Generated
    public badh_2 dsf_3() {
        block0: {
            int n = 692742517;
            n = Integer.rotateLeft(n * 140430369, 22) ^ 0xE7271B07;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 18);
            int n2 = n ^ 0x77A7C5D4;
            if ((n2 ^ n) == 2007483860) break block0;
            int cfr_ignored_0 = (0x5EEDACA1 ^ n) + 1488633285;
        }
        return this.khtw;
    }

    @Generated
    public badh_2 thdhth() {
        return this.sjh;
    }

    @Generated
    public bzw_2 zkth() {
        block0: {
            int n = rh.shhs(-1012854275);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x62D34650;
            if ((n2 ^ n) == 1658013264) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xA17257AD ^ n, 7) - -1858716370;
            int cfr_ignored_1 = (int)(0x63C0F99027D4EB4FL ^ (long)n ^ 0xE50831A2DB96A50L);
        }
        return this.rrq;
    }

    @Generated
    public bzw_2 hf_2() {
        block0: {
            int n = 867738613;
            n = Integer.rotateLeft(n * -882714857, 20) ^ 0x82773DB1;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x7150BFF1;
            if ((n2 ^ n) == 1901117425) break block0;
            int cfr_ignored_0 = (0x42E81C04 ^ n) + 1167380922;
        }
        return this.sdth_3;
    }

    @Generated
    public badh_2 shss_2() {
        block0: {
            int n = -1662786860;
            n = Integer.rotateLeft(n * -1779044223, 28) ^ 0x956A2BF7;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 3);
            int n2 = n ^ 0x341DC478;
            if ((n2 ^ n) == 874366072) break block0;
            int cfr_ignored_0 = (0xA8FE26AC ^ n) - -1396065689;
        }
        return this.hfa_2;
    }

    @Generated
    public tay shjkh() {
        block0: {
            int n = 1702225438;
            int n2 = (n = Integer.rotateLeft(n * -177346417, 19) ^ 0x2A9C1A4C) ^ 0x4132D033;
            if ((n2 ^ n) == 1093849139) break block0;
            int cfr_ignored_0 = (0x2447362D ^ n) - -575091328;
        }
        return this.dhlsh;
    }

    @Generated
    public tay khsq() {
        block0: {
            int n = 996087947;
            n = Integer.rotateLeft(n * 1466325045, 23) ^ 0x5A765841;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x9DF13AD8;
            if ((n2 ^ n) == -1645135144) break block0;
            int cfr_ignored_0 = (0xA6AE2253 ^ n) + -521777387;
        }
        return this.thdhz_2;
    }

    @Generated
    public badh_2 shtb() {
        block0: {
            int n = 488203884;
            n = Integer.rotateLeft(n * -295850057, 19) ^ 0xBE918BEE;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 26);
            int n2 = n ^ 0xE05EB838;
            if ((n2 ^ n) == -530663368) break block0;
            int cfr_ignored_0 = (0xFD47DE54 ^ n) + -857646788;
        }
        return this.shqr;
    }

    @Generated
    public tay dtdh_3() {
        block0: {
            int n = rh.shhs(-1224562515);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
            int n2 = n ^ 0x165441D9;
            if ((n2 ^ n) == 374620633) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xA156E974 ^ n, 7) - -1914444729) * -1588139659;
        }
        return this.thhk_2;
    }

    @Generated
    public bzw_2 hhh_2() {
        block0: {
            int n = -219168438;
            n = Integer.rotateLeft(n * 465037229, 20) ^ 0xE4EEE2F2;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x988960D6;
            if ((n2 ^ n) == -1735827242) break block0;
            int cfr_ignored_0 = (0x6A66A19C ^ n) + -1643310675;
        }
        return this.dghw;
    }

    private void bh(bsf_2 bsf2_2) {
        int n = 0;
        int n2 = 1535282801;
        n2 = Integer.rotateLeft(n2 * 1712004749, 17) ^ 0x1AB2F4D;
        bsf_2 bsf3 = bsf2_2;
        n2 = Integer.rotateRight((bsf3 != null ? System.identityHashCode(bsf3) : 0) ^ n2, 15);
        int n3 = -1035483423 + n2 ^ 0xA57A234F ^ 0xA57A234F;
        block23: while (true) {
            switch (n3 - n2) {
                case -813454819: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x7AFA7756 ^ n2, 18) - -390983003) * 2063234903;
                    return;
                }
                case -946452182: {
                    int cfr_ignored_1 = Integer.rotateLeft(0xA3918FC5 ^ n2, 7) - -755103722;
                    int cfr_ignored_2 = (int)(0x612321F827D4EB4FL ^ (long)n2 ^ 0xBE80831A2DB96F97L);
                    tdw.skhn().zghf(this);
                    n3 = Integer.reverse(Integer.reverse(-813454819 + n2));
                    continue block23;
                }
                case -1035483423: {
                    int cfr_ignored_3 = (Integer.rotateLeft(0xA20B8B90 ^ n2, 7) + -1547467349) * -1576301679;
                    if (this.stt_5.sdh_2() != this.thhn) {
                        n3 = 58804471 + n2;
                        int cfr_ignored_4 = Integer.rotateRight(0x5B3A0A67 ^ n2, 14) - 275046836;
                        n3 = -813454819 + n2;
                        --n;
                        continue block23;
                    }
                    int cfr_ignored_5 = (int)(0x84DAD5A904E733A9L ^ (long)n2 ^ 0x5622C57D9C74A464L);
                    n3 = Integer.reverse(Integer.reverse(-946452182 + n2));
                    ++n;
                    continue block23;
                }
                case 393848024: {
                    int cfr_ignored_6 = (Integer.rotateRight(0x948D1116 ^ n2, 5) - 24293605) * -1802694377;
                    int cfr_ignored_7 = (int)(0x61F7A7654990CFB4L ^ (long)n2 ^ 0xB3BA5F92644F6E3EL);
                    n3 = -1331132239 + n2;
                    int cfr_ignored_8 = (int)(0x46465D23AF709130L ^ (long)n2 ^ 0x47379252D947215DL);
                    n3 = (int)((long)(-1035483423 + n2) ^ 0x58F3E5F6FA3DCBB4L ^ 0x58F3E5F6FA3DCBB4L);
                    continue block23;
                }
                case 1287705129: {
                    int cfr_ignored_9 = Integer.rotateRight(0xE4D1BEE2 ^ n2, 15) + -1178354535;
                    n3 = -1926990553 + n2 ^ 0x214C61E ^ 0x214C61E;
                    int cfr_ignored_10 = (Integer.rotateRight(0xF4933BBF ^ n2, 17) - -1573790884) * -191677505;
                    try {
                        n -= 5;
                        if ((0x20DB54D50B31BC73L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = -1035483423 + n2 + 1797735095 - 1797735095;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = -1035483423 + n2 ^ 0x64189FB9 ^ 0x64189FB9;
                    }
                    continue block23;
                }
                case -1136737682: {
                    int cfr_ignored_11 = (Integer.rotateRight(0xED96175F ^ n2, 16) - -913673284) * -308930721;
                    n3 = Integer.reverse(Integer.reverse(-1959605742 + n2));
                    int cfr_ignored_12 = (Integer.rotateRight(0x9F2D41B ^ n2, 4) + 952454784) * 166908955;
                    try {
                        n -= 2;
                        n3 = -1035483423 + n2 ^ 0xDCCB3C1B ^ 0xDCCB3C1B;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = -1035483423 + n2 + 143735429 - 143735429;
                    }
                    continue block23;
                }
                case 730828229: {
                    int cfr_ignored_13 = (Integer.rotateLeft(0x530E725D ^ n2, 13) - 320698494) * 1393455709;
                    int cfr_ignored_14 = (int)(0x91BCDC6027D4EB4FL ^ (long)n2 ^ 0x45B0831A2DB88EA8L);
                    try {
                        if ((0x83FBF8CB35B4CA41L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = -1035483423 + n2 ^ 0x275C5F15 ^ 0x275C5F15;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = -1035483423 + n2;
                    }
                    n -= 2;
                    continue block23;
                }
                case -1666471398: {
                    int cfr_ignored_15 = (Integer.rotateLeft(0xA975E915 ^ n2, 8) - -1985685306) * -1451890411;
                    int cfr_ignored_16 = (int)(0x6BC7472827D4EB4FL ^ (long)n2 ^ 0x7320831A2DB97A5FL);
                    n3 = (int)((long)(-1198360055 + n2) ^ 0x742FA53A8DA8CBBBL ^ 0x742FA53A8DA8CBBBL);
                    int cfr_ignored_17 = Integer.rotateLeft(0x989271EC ^ n2, 6) - 2115594959;
                    n3 = -1035483423 + n2;
                    int cfr_ignored_18 = (Integer.rotateRight(0x96AC3C32 ^ n2, 5) + 1127803209) * -1767097293;
                    n -= 2;
                    continue block23;
                }
                case -1138446743: {
                    int cfr_ignored_19 = (Integer.rotateRight(0x71E030DE ^ n2, 17) - -830240227) * 1910517983;
                    n3 = -1035483423 + n2;
                    ++n;
                    continue block23;
                }
                case -40794580: {
                    int cfr_ignored_20 = Integer.rotateLeft(0xF939150D ^ n2, 18) - 843525070;
                    int cfr_ignored_21 = (int)(0x3B8BBB3027D4EB4FL ^ (long)n2 ^ 0x8B10831A2DB9DAC6L);
                    try {
                        ++n;
                        n3 = -1035483423 + n2 + -1219313541 - -1219313541;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = -1035483423 + n2 ^ 0xB30537B6 ^ 0xB30537B6;
                    }
                    n += 2;
                    continue block23;
                }
                case 140015343: {
                    int cfr_ignored_22 = (Integer.rotateLeft(0x38B1B8DD ^ n2, 10) - -505216514) * 951171293;
                    int cfr_ignored_23 = (int)(0xFA0316E027D4EB4FL ^ (long)n2 ^ 0xD0B0831A2DB859D7L);
                    int cfr_ignored_24 = (int)(0x93E5ACFED31A8D0EL ^ (long)n2 ^ 0xA48D6A86E13A8A1AL);
                    n3 = -1035483423 + n2 + -2126676384 - -2126676384;
                    n -= 3;
                    continue block23;
                }
                case -1740575396: {
                    int cfr_ignored_25 = Integer.rotateRight(0x19E121A7 ^ n2, 6) - 648065652;
                    n3 = Integer.reverse(Integer.reverse(2031425809 + n2));
                    int cfr_ignored_26 = Integer.rotateLeft(0x8B06684D ^ n2, 4) - -635158386;
                    int cfr_ignored_27 = (int)(0x49B4C67027D4EB4FL ^ (long)n2 ^ 0x7190831A2DB93EB8L);
                    n3 = -1035483423 + n2;
                    int cfr_ignored_28 = (Integer.rotateRight(0xA6AA4BDE ^ n2, 7) - 855428893) * -1498788897;
                    n -= 2;
                    continue block23;
                }
                case -1749543917: {
                    int cfr_ignored_29 = Integer.rotateRight(0xB3D367AB ^ n2, 9) + -889770768;
                    n3 = 108536034 + n2 + -1623845174 - -1623845174;
                    int cfr_ignored_30 = Integer.rotateLeft(0x28B7FD0C ^ n2, 8) - -224050257;
                    n3 = (int)((long)(-1035483423 + n2) ^ 0x7A0F81B4F96045L ^ 0x7A0F81B4F96045L);
                    n -= 2;
                    continue block23;
                }
            }
            int cfr_ignored_31 = (Integer.rotateLeft(0x6CEB087C ^ n2, 16) - 886285887) * 1827342461;
            n3 = (int)((long)(-1035483423 + n2) ^ 0x7456FB05C55135A8L ^ 0x7456FB05C55135A8L);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void lth(shw_3 var1_1) {
        var4_2 = 0;
        var2_3 = -1832435491;
        var2_3 = Integer.rotateLeft(var2_3 * -1391878049, 28) ^ 1206884207;
        var2_3 = Integer.rotateRight(System.identityHashCode(this) ^ var2_3, 26);
        v0 = var1_1;
        var2_3 = Integer.rotateLeft((v0 != null ? System.identityHashCode(v0) : 0) ^ var2_3, 17);
        var3_4 = (int)((long)(var2_3 ^ 197386347) ^ -6258924557651519290L ^ -6258924557651519290L);
        while (true) {
            block45: {
                block38: {
                    block44: {
                        block36: {
                            block37: {
                                block35: {
                                    block42: {
                                        block39: {
                                            block43: {
                                                block41: {
                                                    block40: {
                                                        var4_2 = var3_4 ^ var2_3;
                                                        switch (var4_2 & 7) {
                                                            case 5: {
                                                                if (var4_2 != -1853198179) {
                                                                    ** break;
                                                                }
                                                                break block35;
                                                            }
                                                            case 3: {
                                                                if (var4_2 > -1855587605) ** GOTO lbl25
                                                                if (var4_2 == -2138776637) break block36;
                                                                if (var4_2 != -1855587605) {
                                                                    (Integer.rotateLeft(1836616149 ^ var2_3, 16) - 1173770246) * 1836616149;
                                                                    (int)(-5779763293722449073L ^ (long)var2_3 ^ -5575312190225190331L);
                                                                    ** break;
                                                                }
                                                                break block37;
lbl25:
                                                                // 1 sources

                                                                if (var4_2 == 197386347) break;
                                                                if (var4_2 != 1943792267) {
                                                                    ** break;
                                                                }
                                                                break block38;
                                                            }
                                                            case 6: {
                                                                if (var4_2 == -1527515162) break block39;
                                                                if (var4_2 != 1744807910) {
                                                                    ** break;
                                                                }
                                                                break block40;
                                                            }
                                                            case 2: {
                                                                if (var4_2 == -121127838) break block41;
                                                                if (var4_2 == 1132378530) break block42;
                                                                Integer.rotateRight(1237258211 ^ var2_3, 12) + -226456648;
                                                                if (var4_2 != 1839795674) {
                                                                    ** break;
                                                                }
                                                                break block43;
                                                            }
                                                            case 1: {
                                                                if (var4_2 == -1360970247) break block44;
                                                                if (var4_2 != -1050132031) {
                                                                    if (var4_2 != 1647783409) ** break;
                                                                    (Integer.rotateRight(-96112769 ^ var2_3, 18) - 1388715932) * -96112769;
                                                                    return;
                                                                }
                                                                break block45;
                                                            }
                                                        }
                                                        Integer.rotateRight(-1934660121 ^ var2_3, 4) - 228322868;
                                                        if (this.stt_5.sdh_2() == this.thhn) {
                                                            var3_4 = (int)((long)(var2_3 ^ 1617363584) ^ -2884393952279108013L ^ -2884393952279108013L);
                                                            Integer.rotateRight(20352618 ^ var2_3, 3) + 704175633;
                                                            var3_4 = var2_3 ^ 1744807910;
                                                            continue;
                                                        }
                                                        var3_4 = var2_3 ^ 2120339811 ^ 1031514893 ^ 1031514893;
                                                        (Integer.rotateRight(-357858690 ^ var2_3, 16) - 1864526973) * -357858689;
                                                        var3_4 = (int)((long)(var2_3 ^ 1647783409) ^ 9072600677830738155L ^ 9072600677830738155L);
                                                        continue;
                                                    }
                                                    Integer.rotateRight(1380109482 ^ var2_3, 13) + -93034543;
                                                    tdw.skhn().byd(this, var1_1.ssha_2(), var1_1.skz_4());
                                                    try {
                                                        var4_2 += 3;
                                                        if ((-5869551297299262275L ^ (long)var2_3 | 1L) == 0L) {
                                                            throw new UnsupportedOperationException();
                                                        }
                                                        var3_4 = (int)((long)(var2_3 ^ 1647783409) ^ -1679755042851181549L ^ -1679755042851181549L);
                                                    }
                                                    catch (UnsupportedOperationException v1) {
                                                        var3_4 = var2_3 ^ 1647783409 ^ 1710215075 ^ 1710215075;
                                                    }
                                                    var4_2 -= 5;
                                                    continue;
                                                }
                                                (Integer.rotateRight(631136214 ^ var2_3, 7) - -1836369371) * 631136215;
                                                var3_4 = var2_3 ^ 1906497271;
                                                (Integer.rotateLeft(454673397 ^ var2_3, 6) - 1283217894) * 454673397;
                                                (int)(-2761993240032515249L ^ (long)var2_3 ^ 2801383116683878023L);
                                                try {
                                                    if ((7549332350959910619L ^ (long)var2_3 | 1L) == 0L) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    var3_4 = (var2_3 ^ 197386347) + -274525682 - -274525682;
                                                }
                                                catch (NoSuchElementException v2) {
                                                    var3_4 = var2_3 ^ 197386347 ^ 1025360947 ^ 1025360947;
                                                }
                                                var4_2 += 4;
                                                continue;
                                            }
                                            Integer.rotateLeft(2106921121 ^ var2_3, 18) + 963289786;
                                            (int)(-4672556510481159345L ^ (long)var2_3 ^ -9202961690072132706L);
                                            var3_4 = (var2_3 ^ 611886203) + 133688921 - 133688921;
                                            Integer.rotateRight(-162277845 ^ var2_3, 17) + -662401424;
                                            try {
                                                var4_2 -= 5;
                                                if ((-2209645213895261175L ^ (long)var2_3 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                var3_4 = var2_3 ^ 197386347 ^ -843093310 ^ -843093310;
                                            }
                                            catch (NoSuchElementException v3) {
                                                var3_4 = (var2_3 ^ 197386347) + -1078951399 - -1078951399;
                                            }
                                            var4_2 -= 4;
                                            continue;
                                        }
                                        (Integer.rotateRight(254507774 ^ var2_3, 4) - -626949123) * 254507775;
                                        (int)(-7105213501040722358L ^ (long)var2_3 ^ -7593545184706390245L);
                                        var3_4 = var2_3 ^ 1811429537;
                                        (int)(-7843449787047950575L ^ (long)var2_3 ^ 1334180920441473949L);
                                        var3_4 = (var2_3 ^ 197386347) + -66015425 - -66015425;
                                        continue;
                                    }
                                    (Integer.rotateLeft(100232764 ^ var2_3, 3) - -1114507137) * 100232765;
                                    try {
                                        var4_2 += 2;
                                        var3_4 = (var2_3 ^ 197386347) + 1803858940 - 1803858940;
                                    }
                                    catch (NoSuchElementException v4) {
                                        var3_4 = (int)((long)(var2_3 ^ 197386347) ^ 4002102182415234547L ^ 4002102182415234547L);
                                    }
                                    var4_2 -= 3;
                                    continue;
                                }
                                Integer.rotateRight(-900196498 ^ var2_3, 12) - -2063043187;
                                try {
                                    var4_2 -= 3;
                                    if ((5599095668938010665L ^ (long)var2_3 | 1L) == 0L) {
                                        throw new NoSuchElementException();
                                    }
                                    var3_4 = (int)((long)(var2_3 ^ 197386347) ^ -5674370375502321589L ^ -5674370375502321589L);
                                }
                                catch (NoSuchElementException v5) {
                                    var3_4 = (var2_3 ^ 197386347) + 320538591 - 320538591;
                                }
                                ++var4_2;
                                continue;
                            }
                            (Integer.rotateRight(-1544584742 ^ var2_3, 7) + -564242271) * -1544584741;
                            var3_4 = (int)((long)(var2_3 ^ -1557908805) ^ -7374975533604206507L ^ -7374975533604206507L);
                            (Integer.rotateLeft(-649101708 ^ var2_3, 14) - 1425928007) * -649101707;
                            try {
                                ++var4_2;
                                var3_4 = var2_3 ^ 197386347 ^ -1386150971 ^ -1386150971;
                            }
                            catch (ArithmeticException v6) {
                                var3_4 = var2_3 ^ 197386347 ^ -340360277 ^ -340360277;
                            }
                            continue;
                        }
                        Integer.rotateLeft(-1333114011 ^ var2_3, 9) - 1696383094;
                        (int)(8230580485807729487L ^ (long)var2_3 ^ 4017355016073988512L);
                        var3_4 = (int)((long)(var2_3 ^ 1767731373) ^ -187399758671400405L ^ -187399758671400405L);
                        (Integer.rotateLeft(408577744 ^ var2_3, 6) + -145747349) * 408577745;
                        var3_4 = (int)((long)(var2_3 ^ 197386347) ^ -3898871478821662769L ^ -3898871478821662769L);
                        var4_2 -= 2;
                        continue;
                    }
                    Integer.rotateLeft(2129161792 ^ var2_3, 18) + 1652750587;
                    var3_4 = (int)((long)(var2_3 ^ -528557869) ^ 1673320601518049279L ^ 1673320601518049279L);
                    Integer.rotateLeft(1532257793 ^ var2_3, 14) + 328595802;
                    (int)(-7356972780571268273L ^ (long)var2_3 ^ 7856673698407292444L);
                    (int)(4185989463316643443L ^ (long)var2_3 ^ -4392441494900712962L);
                    var3_4 = (var2_3 ^ 197386347) + 1164330002 - 1164330002;
                    continue;
                }
                Integer.rotateRight(970223554 ^ var2_3, 10) + 85403577;
                if (rh.ddh_10(var2_3, -2108329441)) {
                    (Integer.rotateLeft(-1986620812 ^ var2_3, 4) - -1382458553) * -1986620811;
                }
                var3_4 = var2_3 ^ 197386347 ^ 1803415890 ^ 1803415890;
                continue;
            }
            (Integer.rotateRight(628836895 ^ var2_3, 7) - -1907648260) * 628836895;
            var3_4 = var2_3 ^ 586839102;
            Integer.rotateRight(369449130 ^ var2_3, 5) + -1358734383;
            try {
                var4_2 -= 4;
                if ((75528730392737537L ^ (long)var2_3 | 1L) == 0L) {
                    throw new UnsupportedOperationException();
                }
                var3_4 = var2_3 ^ 197386347 ^ -1668213928 ^ -1668213928;
            }
            catch (UnsupportedOperationException v7) {
                var3_4 = var2_3 ^ 197386347 ^ 1152363375 ^ 1152363375;
            }
            var4_2 += 4;
            continue;
lbl206:
            // 7 sources

            (Integer.rotateRight(1119775775 ^ var2_3, 11) - 426555132) * 1119775775;
            var3_4 = (int)((long)(var2_3 ^ 197386347) ^ 5523880440208059905L ^ 5523880440208059905L);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void shth_2(ya_2 var1_1) {
        var4_2 = 0;
        var2_3 = 1874334708;
        var2_3 = Integer.rotateLeft(var2_3 * 932583833, 4) ^ 2051683720;
        var2_3 = System.identityHashCode(this) ^ var2_3;
        var3_4 = (var2_3 ^ -1150944205 ^ 2106985856) + 2106985856 ^ 816494856 ^ 816494856;
        while (true) {
            block65: {
                block75: {
                    block66: {
                        block64: {
                            block60: {
                                block78: {
                                    block63: {
                                        block69: {
                                            block73: {
                                                block76: {
                                                    block71: {
                                                        block58: {
                                                            block77: {
                                                                block61: {
                                                                    block68: {
                                                                        block67: {
                                                                            block72: {
                                                                                block59: {
                                                                                    block74: {
                                                                                        block70: {
                                                                                            block62: {
                                                                                                var4_2 = var3_4 - 2106985856 ^ 2106985856 ^ var2_3;
                                                                                                switch (var4_2 & 15) {
                                                                                                    case 0: {
                                                                                                        if (var4_2 != -489057584) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block58;
                                                                                                    }
                                                                                                    case 3: {
                                                                                                        if (var4_2 == -1150944205) break block59;
                                                                                                        if (var4_2 != 1794503123) {
                                                                                                            Integer.rotateLeft(748466861 ^ var2_3, 8) - 1800880686;
                                                                                                            (int)(-1284057438284879025L ^ (long)var2_3 ^ -4300793495679372915L);
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block60;
                                                                                                    }
                                                                                                    case 4: {
                                                                                                        if (var4_2 == 774901060) break block61;
                                                                                                        if (var4_2 != -716983980) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block62;
                                                                                                    }
                                                                                                    case 5: {
                                                                                                        if (var4_2 != 164226789) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block63;
                                                                                                    }
                                                                                                    case 6: {
                                                                                                        if (var4_2 == -1646783370) break block64;
                                                                                                        if (var4_2 == -650728730) break block65;
                                                                                                        if (var4_2 != -171662282) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block66;
                                                                                                    }
                                                                                                    case 7: {
                                                                                                        if (var4_2 == 1276311895) break;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    case 8: {
                                                                                                        if (var4_2 == -1115422488) break block67;
                                                                                                        if (var4_2 != 692272968) {
                                                                                                            Integer.rotateRight(903753702 ^ var2_3, 9) - -1975161835;
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block68;
                                                                                                    }
                                                                                                    case 10: {
                                                                                                        if (var4_2 == -1204513206) break block69;
                                                                                                        if (var4_2 == -1091169702) break block70;
                                                                                                        if (var4_2 == -2085502822) break block71;
                                                                                                        if (var4_2 == -1394404438) break block72;
                                                                                                        if (var4_2 != 1471847610) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block73;
                                                                                                    }
                                                                                                    case 11: {
                                                                                                        if (var4_2 != 1724492699) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block74;
                                                                                                    }
                                                                                                    case 13: {
                                                                                                        if (var4_2 == 184147997) break block75;
                                                                                                        if (var4_2 == -1838908883) break block76;
                                                                                                        (Integer.rotateLeft(-736336355 ^ var2_3, 13) - -1278346050) * -736336355;
                                                                                                        (int)(1634463755214842703L ^ (long)var2_3 ^ 7867932697475776652L);
                                                                                                        if (var4_2 != -1262536467) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block77;
                                                                                                    }
                                                                                                    case 14: {
                                                                                                        if (var4_2 != -1801779266) {
                                                                                                            ** break;
                                                                                                        }
                                                                                                        break block78;
                                                                                                    }
                                                                                                }
                                                                                                (Integer.rotateRight(-2098854185 ^ var2_3, 3) - -566725820) * -2098854185;
                                                                                                if (this.stt_5.sdh_2() != this.ththa_2) {
                                                                                                    (int)(7248968269538099345L ^ (long)var2_3 ^ -501932036047149854L);
                                                                                                    var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1394404438 ^ 2106985856) + 2106985856));
                                                                                                    var4_2 -= 3;
                                                                                                    continue;
                                                                                                }
                                                                                                try {
                                                                                                    var4_2 -= 5;
                                                                                                    var3_4 = (var2_3 ^ 1724492699 ^ 2106985856) + 2106985856 + 10576413 - 10576413;
                                                                                                }
                                                                                                catch (IllegalArgumentException v0) {
                                                                                                    var3_4 = (var2_3 ^ 1724492699 ^ 2106985856) + 2106985856;
                                                                                                }
                                                                                                continue;
                                                                                            }
                                                                                            Integer.rotateLeft(1009997352 ^ var2_3, 10) + 1318391315;
                                                                                            yf.athz_2();
                                                                                            throw null;
                                                                                        }
                                                                                        Integer.rotateRight(1598229899 ^ var2_3, 14) + -1921236208;
                                                                                        yf.athz_2();
                                                                                        throw null;
                                                                                    }
                                                                                    Integer.rotateRight(-791028081 ^ var2_3, 13) - 1321177740;
                                                                                    this.zwl();
                                                                                    this.ssf_4();
                                                                                    try {
                                                                                        var3_4 = (var2_3 ^ -1115422488 ^ 2106985856) + 2106985856;
                                                                                    }
                                                                                    catch (IllegalArgumentException v1) {
                                                                                        var3_4 = (var2_3 ^ -1115422488 ^ 2106985856) + 2106985856;
                                                                                    }
                                                                                    var4_2 += 5;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateRight(2077048406 ^ var2_3, 18) - 37235621) * 2077048407;
                                                                                if (yf.khdha_2()) {
                                                                                    var3_4 = (var2_3 ^ 1276311895 ^ 2106985856) + 2106985856;
                                                                                    var4_2 += 4;
                                                                                    continue;
                                                                                }
                                                                                (int)(-8445434320770007954L ^ (long)var2_3 ^ 7567909444235475014L);
                                                                                var3_4 = (var2_3 ^ -166266217 ^ 2106985856) + 2106985856;
                                                                                (int)(3783766247437443351L ^ (long)var2_3 ^ -4916405161766042412L);
                                                                                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1091169702 ^ 2106985856) + 2106985856));
                                                                                continue;
                                                                            }
                                                                            Integer.rotateLeft(115580357 ^ var2_3, 3) - -638731754;
                                                                            (int)(-4300599028248941745L ^ (long)var2_3 ^ -7313701646390254221L);
                                                                            if (this.hqz_2.isEmpty()) {
                                                                                try {
                                                                                    --var4_2;
                                                                                    if ((-493236431276652861L ^ (long)var2_3 | 1L) == 0L) {
                                                                                        throw new ArithmeticException();
                                                                                    }
                                                                                    var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1115422488 ^ 2106985856) + 2106985856));
                                                                                }
                                                                                catch (ArithmeticException v2) {
                                                                                    var3_4 = (var2_3 ^ -1115422488 ^ 2106985856) + 2106985856;
                                                                                }
                                                                                var4_2 -= 4;
                                                                                continue;
                                                                            }
                                                                            (int)(4876826869229351773L ^ (long)var2_3 ^ 942706211996641930L);
                                                                            var3_4 = (var2_3 ^ 692272968 ^ 2106985856) + 2106985856 + 1641651023 - 1641651023;
                                                                            var4_2 -= 5;
                                                                            continue;
                                                                        }
                                                                        Integer.rotateRight(1731678215 ^ var2_3, 15) - -2079305708;
                                                                        return;
                                                                    }
                                                                    Integer.rotateLeft(-128904147 ^ var2_3, 18) - 372183214;
                                                                    (int)(4243439852463647567L ^ (long)var2_3 ^ -8552191543917029354L);
                                                                    this.hqz_2.clear();
                                                                    this.akhh();
                                                                    (int)(-5141536695474070654L ^ (long)var2_3 ^ -3293422221700965222L);
                                                                    var3_4 = (var2_3 ^ -1115422488 ^ 2106985856) + 2106985856 + 1967210194 - 1967210194;
                                                                    continue;
                                                                }
                                                                Integer.rotateLeft(1059314305 ^ var2_3, 10) + -1447750438;
                                                                (int)(-175230559019799729L ^ (long)var2_3 ^ 1443547829031687923L);
                                                                try {
                                                                    var4_2 += 4;
                                                                    var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1150944205 ^ 2106985856) + 2106985856));
                                                                }
                                                                catch (NoSuchElementException v3) {
                                                                    var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1150944205 ^ 2106985856) + 2106985856));
                                                                }
                                                                var4_2 -= 3;
                                                                continue;
                                                            }
                                                            (Integer.rotateLeft(1844186548 ^ var2_3, 16) - 1408452615) * 1844186549;
                                                            var3_4 = (int)((long)((var2_3 ^ -853356051 ^ 2106985856) + 2106985856) ^ -509472303449174668L ^ -509472303449174668L);
                                                            (Integer.rotateRight(-1359140841 ^ var2_3, 8) - 889551364) * -1359140841;
                                                            var3_4 = (var2_3 ^ -1150944205 ^ 2106985856) + 2106985856 + 1767034043 - 1767034043;
                                                            var4_2 += 4;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(-832297843 ^ var2_3, 12) - 41815118;
                                                        (int)(925079262658358095L ^ (long)var2_3 ^ -1724734508823366532L);
                                                        var3_4 = (var2_3 ^ -1150944205 ^ 2106985856) + 2106985856 ^ 877713142 ^ 877713142;
                                                        var4_2 -= 4;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(1951548828 ^ var2_3, 17) - 441715999) * 1951548829;
                                                    var3_4 = (var2_3 ^ 2074451114 ^ 2106985856) + 2106985856 + -1630648321 - -1630648321;
                                                    Integer.rotateLeft(808315680 ^ var2_3, 9) + -638773221;
                                                    (int)(-6634478612084023834L ^ (long)var2_3 ^ -3691776111413630454L);
                                                    var3_4 = (int)((long)((var2_3 ^ -1150944205 ^ 2106985856) + 2106985856) ^ 5564600300602772597L ^ 5564600300602772597L);
                                                    continue;
                                                }
                                                Integer.rotateLeft(182336004 ^ var2_3, 4) - 1430693303;
                                                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ 1997108070 ^ 2106985856) + 2106985856));
                                                Integer.rotateLeft(1292418696 ^ var2_3, 12) + 1483518387;
                                                try {
                                                    if ((8529523310909123853L ^ (long)var2_3 | 1L) == 0L) {
                                                        throw new IllegalStateException();
                                                    }
                                                    var3_4 = (int)((long)((var2_3 ^ -1150944205 ^ 2106985856) + 2106985856) ^ 6608334986096341134L ^ 6608334986096341134L);
                                                }
                                                catch (IllegalStateException v4) {
                                                    var3_4 = (var2_3 ^ -1150944205 ^ 2106985856) + 2106985856 + -1462205685 - -1462205685;
                                                }
                                                continue;
                                            }
                                            (Integer.rotateLeft(-1808721003 ^ var2_3, 5) - -162531770) * -1808721003;
                                            (int)(6234026043038296911L ^ (long)var2_3 ^ -7628953620306132778L);
                                            var3_4 = (var2_3 ^ 1426517337 ^ 2106985856) + 2106985856 ^ -994177849 ^ -994177849;
                                            (Integer.rotateLeft(2008630493 ^ var2_3, 17) - -2083719682) * 2008630493;
                                            (int)(-5400965079638938801L ^ (long)var2_3 ^ 2931987505877665734L);
                                            try {
                                                var4_2 += 3;
                                                if ((8108266859486605509L ^ (long)var2_3 | 1L) == 0L) {
                                                    throw new UnsupportedOperationException();
                                                }
                                                var3_4 = (int)((long)((var2_3 ^ -1150944205 ^ 2106985856) + 2106985856) ^ 3748148858537124831L ^ 3748148858537124831L);
                                            }
                                            catch (UnsupportedOperationException v5) {
                                                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1150944205 ^ 2106985856) + 2106985856));
                                            }
                                            ++var4_2;
                                            continue;
                                        }
                                        Integer.rotateLeft(-1691030176 ^ var2_3, 6) + -809083429;
                                        var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -858746991 ^ 2106985856) + 2106985856));
                                        Integer.rotateRight(-198590909 ^ var2_3, 17) + -1788106408;
                                        try {
                                            var4_2 += 2;
                                            if ((6039442881095798263L ^ (long)var2_3 | 1L) == 0L) {
                                                throw new UnsupportedOperationException();
                                            }
                                            var3_4 = (var2_3 ^ -1150944205 ^ 2106985856) + 2106985856 ^ 1651681747 ^ 1651681747;
                                        }
                                        catch (UnsupportedOperationException v6) {
                                            var3_4 = (var2_3 ^ -1150944205 ^ 2106985856) + 2106985856;
                                        }
                                        var4_2 += 2;
                                        continue;
                                    }
                                    (Integer.rotateRight(1135579350 ^ var2_3, 11) - 916465957) * 1135579351;
                                    var3_4 = (var2_3 ^ -1553831210 ^ 2106985856) + 2106985856;
                                    (Integer.rotateRight(-848667977 ^ var2_3, 12) - -465659036) * -848667977;
                                    var3_4 = (var2_3 ^ -1150944205 ^ 2106985856) + 2106985856 ^ -881124687 ^ -881124687;
                                    --var4_2;
                                    continue;
                                }
                                Integer.rotateRight(657545186 ^ var2_3, 7) + -1017691239;
                                try {
                                    var3_4 = (var2_3 ^ -1150944205 ^ 2106985856) + 2106985856 + 1464931117 - 1464931117;
                                }
                                catch (NoSuchElementException v7) {
                                    var3_4 = (int)((long)((var2_3 ^ -1150944205 ^ 2106985856) + 2106985856) ^ 2067286710200989297L ^ 2067286710200989297L);
                                }
                                continue;
                            }
                            Integer.rotateLeft(715877384 ^ var2_3, 8) + 790606899;
                            (int)(5486058909040068655L ^ (long)var2_3 ^ 3924069955233461653L);
                            var3_4 = (var2_3 ^ -1150944205 ^ 2106985856) + 2106985856;
                            var4_2 += 2;
                            continue;
                        }
                        (Integer.rotateRight(-1400963969 ^ var2_3, 8) - -406965604) * -1400963969;
                        try {
                            if ((2354316660977234153L ^ (long)var2_3 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            var3_4 = (var2_3 ^ -1150944205 ^ 2106985856) + 2106985856 + -1575722390 - -1575722390;
                        }
                        catch (IllegalArgumentException v8) {
                            var3_4 = (var2_3 ^ -1150944205 ^ 2106985856) + 2106985856 ^ 341394321 ^ 341394321;
                        }
                        var4_2 -= 2;
                        continue;
                    }
                    Integer.rotateRight(1110497763 ^ var2_3, 11) + 138936760;
                    try {
                        var4_2 -= 2;
                        if ((-6598877140738521203L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var3_4 = (int)((long)((var2_3 ^ -1150944205 ^ 2106985856) + 2106985856) ^ 918431446411966118L ^ 918431446411966118L);
                    }
                    catch (IllegalStateException v9) {
                        var3_4 = (var2_3 ^ -1150944205 ^ 2106985856) + 2106985856 + 1755264152 - 1755264152;
                    }
                    var4_2 += 5;
                    continue;
                }
                Integer.rotateRight(2083830927 ^ var2_3, 18) - 247493772;
                try {
                    var4_2 -= 2;
                    var3_4 = (var2_3 ^ -1150944205 ^ 2106985856) + 2106985856 + -74781369 - -74781369;
                }
                catch (ArithmeticException v10) {
                    var3_4 = (var2_3 ^ -1150944205 ^ 2106985856) + 2106985856 ^ 294921653 ^ 294921653;
                }
                ++var4_2;
                continue;
            }
            (Integer.rotateLeft(-1463958735 ^ var2_3, 8) + 1935163946) * -1463958735;
            (int)(7642446991646321487L ^ (long)var2_3 ^ 2839663713516616143L);
            var3_4 = (var2_3 ^ -1632399863 ^ 2106985856) + 2106985856;
            Integer.rotateRight(340705475 ^ var2_3, 5) + 2045179608;
            try {
                var4_2 += 5;
                if ((2370882298976795029L ^ (long)var2_3 | 1L) == 0L) {
                    throw new ArithmeticException();
                }
                var3_4 = (var2_3 ^ -1150944205 ^ 2106985856) + 2106985856 ^ -435526870 ^ -435526870;
            }
            catch (ArithmeticException v11) {
                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -1150944205 ^ 2106985856) + 2106985856));
            }
            var4_2 += 4;
            continue;
lbl330:
            // 12 sources

            Integer.rotateLeft(-882830943 ^ var2_3, 12) + -1524710982;
            (int)(708120243831368527L ^ (long)var2_3 ^ -9058846501996216714L);
            var3_4 = (var2_3 ^ -1150944205 ^ 2106985856) + 2106985856 + -441791628 - -441791628;
        }
    }

    private boolean tdz_6() {
        int n;
        block4: {
            try {
                int n2 = -1758111142;
                n2 = Integer.rotateLeft(n2 * -241513937, 8) ^ 0x2D58CB5A;
                n2 = System.identityHashCode(this) ^ n2;
                int n3 = n2 ^ 0xDDAADE2;
                if ((n3 ^ n2) != 232435170) {
                    int cfr_ignored_0 = (0x9AEFF7B8 ^ n2) + 1168688315;
                }
                if ((0x325 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = this.stt_5.sdh_2() != this.thhn || !this.shqr.shzl() || this.khtw.shzl() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block4;
            n = n ^ 0x8FC5;
        }
        return n != 0;
    }

    private boolean srq() {
        try {
            int n = -1443700571;
            n = Integer.rotateLeft(n * -1181779465, 23) ^ 0xE48C9C6A;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 3);
            int n2 = n ^ 0x96014F9F;
            if ((n2 ^ n) != -1778298977) {
                int cfr_ignored_0 = (0x3FF3AF3A ^ n) - 798687754;
            }
            if ((0x12C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return this.stt_5.sdh_2() != this.thhn || !this.shqr.shzl();
    }

    private boolean shzkh_2() {
        try {
            int n = 1625124045;
            n = Integer.rotateLeft(n * -2031208751, 18) ^ 0x932F14D3;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x2E62B641;
            if ((n2 ^ n) != 778221121) {
                int cfr_ignored_0 = (0x4EBFDA8C ^ n) + -707065121;
            }
            if ((0x20B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return this.stt_5.sdh_2() != this.thhn;
    }

    private boolean rtj() {
        int n = -693460229;
        int n2 = (n = Integer.rotateLeft(n * -838459973, 9) ^ 0xC40F38A5) ^ 0x94E14724;
        if ((n2 ^ n) != -1797175516) {
            int cfr_ignored_0 = (0x424BE5DF ^ n) - 1993906433;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return this.stt_5.sdh_2() != this.thhn || this.khtw.shzl() || !this.hfa_2.shzl();
    }

    private boolean ns_2() {
        int n = -1037020435;
        n = Integer.rotateLeft(n * -175877445, 15) ^ 0xC4706BD6;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 6);
        int n2 = n ^ 0x24BE26A3;
        if ((n2 ^ n) != 616441507) {
            int cfr_ignored_0 = (0xE68E744E ^ n) - 168294884;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return this.stt_5.sdh_2() != this.thhn || this.khtw.shzl() || !this.hfa_2.shzl();
    }

    private boolean tqgh() {
        try {
            int n = 890054109;
            n = Integer.rotateLeft(n * 798112501, 11) ^ 0x76A76302;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xDEA60F02;
            if ((n2 ^ n) != -559542526) {
                int cfr_ignored_0 = (0xEBAB2ADF ^ n) - -1222621727;
            }
            if ((0x1F2 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return this.stt_5.sdh_2() != this.thhn || this.khtw.shzl();
    }

    private boolean alk() {
        int n = 1956931233;
        n = Integer.rotateLeft(n * 584107167, 7) ^ 0xA02A5E90;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 27);
        int n2 = n ^ 0xC6CCE910;
        if ((n2 ^ n) != -959649520) {
            int cfr_ignored_0 = (0xB2688FB1 ^ n) + -1910825480;
        }
        return this.stt_5.sdh_2() != this.thhn || this.khtw.shzl();
    }

    private boolean shh_7() {
        int n = 2116130216;
        n = Integer.rotateLeft(n * 1313942991, 22) ^ 0xCF991019;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
        int n2 = n ^ 0xC43DA71A;
        if ((n2 ^ n) != -1002592486) {
            int cfr_ignored_0 = (0xBA1C32B2 ^ n) - 764674666;
        }
        return this.stt_5.sdh_2() != this.thhn || this.khtw.shzl();
    }

    private boolean jns_2() {
        try {
            int n = -132246678;
            n = Integer.rotateLeft(n * 1603567109, 4) ^ 0xF5CC1A8F;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x9CD23E9;
            if ((n2 ^ n) != 164439017) {
                int cfr_ignored_0 = (0xF1D33083 ^ n) - -43042306;
            }
            if ((0x352 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return this.stt_5.sdh_2() != this.thhn;
    }

    private boolean tdz_2() {
        try {
            int n = 1166840371;
            n = Integer.rotateLeft(n * -1178101535, 7) ^ 0x570A8A85;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x797D88D2;
            if ((n2 ^ n) != 2038270162) {
                int cfr_ignored_0 = (0x3CF11AE1 ^ n) + 2106309138;
            }
            if ((0x34E & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return this.stt_5.sdh_2() != this.thhn;
    }

    private boolean thzd_3() {
        int n = rh.shhs(798174256);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 19);
        int n2 = n ^ 0xF55A3237;
        if ((n2 ^ n) != -178638281) {
            int cfr_ignored_0 = Integer.rotateRight(0xDAC91E07 ^ n, 14) - -2101853676;
        }
        return this.stt_5.sdh_2() != this.thhn;
    }

    private boolean ghzsh() {
        int n;
        block1: {
            int n2 = -1066879732;
            n2 = Integer.rotateLeft(n2 * -753380859, 20) ^ 0x280AC42A;
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 6);
            int n3 = n2 ^ 0xC70EC279;
            if ((n3 ^ n2) != -955334023) {
                int cfr_ignored_0 = (0x7667775 ^ n2) - 1866398334;
            }
            n = this.stt_5.sdh_2() != this.thhn ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x844D;
        }
        return n != 0;
    }

    private boolean zshs_2() {
        int n;
        block1: {
            int n2 = -989984401;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1691846333, 21) ^ 0x2360506D) ^ 0xD0BFCDF5;
            if ((n3 ^ n2) != -792736267) {
                int cfr_ignored_0 = (0x1441C49A ^ n2) - -279518271;
            }
            n = this.stt_5.sdh_2() != this.thhn ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x4B0A;
        }
        return n != 0;
    }

    private boolean khql() {
        int n = rh.shhs(-1504365437);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 25);
        int n2 = n ^ 0x97D9CD05;
        if ((n2 ^ n) != -1747333883) {
            int cfr_ignored_0 = Integer.rotateRight(0x318CF986 ^ n, 9) - 74438261;
        }
        return this.stt_5.sdh_2() != this.ththa_2;
    }

    private boolean dhaz() {
        int n = -1201324345;
        n = Integer.rotateLeft(n * -1989234827, 28) ^ 0x54A0C6D4;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 24);
        int n2 = n ^ 0xECB8DF21;
        if ((n2 ^ n) != -323428575) {
            int cfr_ignored_0 = (0x54DDE1E6 ^ n) - -242821489;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return this.stt_5.sdh_2() != this.ththa_2;
    }

    private boolean jda() {
        try {
            int n = -690230142;
            n = Integer.rotateLeft(n * 1416851649, 14) ^ 0x67E3FDAC;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 12);
            int n2 = n ^ 0x850699E9;
            if ((n2 ^ n) != -2063164951) {
                int cfr_ignored_0 = (0x53DD756B ^ n) - -1248693414;
            }
            if ((0x351 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return this.stt_5.sdh_2() != this.ththa_2;
    }

    private boolean dmq_2() {
        int n;
        block1: {
            int n2 = 1928374389;
            n2 = Integer.rotateLeft(n2 * 1021224631, 24) ^ 0xFBB7D336;
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 15);
            int n3 = n2 ^ 0xB568E0A0;
            if ((n3 ^ n2) != -1251417952) {
                int cfr_ignored_0 = (0xC79848D5 ^ n2) + -1484480385;
            }
            n = this.stt_5.sdh_2() != this.ththa_2 ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0xD5A6;
        }
        return n != 0;
    }

    private static String tdf_4(String string, int n, int n2, int n3) {
        try {
            int n4 = 569757824;
            n4 = Integer.rotateLeft(n4 * -1983679921, 4) ^ 0xFCBF371F;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 3);
            n4 = n3 ^ n4;
            int n5 = n4 ^ 0xF1AA05EE;
            if ((n5 ^ n4) != -240515602) {
                int cfr_ignored_0 = (0xD05FD56E ^ n4) - 1574957518;
            }
            if ((0x12C & 0) != 0) {
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
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xD658E451 ^ n2 ^ i * -1743502301 ^ thha_2, 9) ^ rghw));
        }
        return new String(cArray);
    }

    private static void dzt_5(thd_2 thd2) {
        int n = 767824675;
        int n2 = (n = Integer.rotateLeft(n * -529372003, 16) ^ 0xC43AC8F6) ^ 0xF958E47D;
        if ((n2 ^ n) != -111614851) {
            int cfr_ignored_0 = (0xD49CF75E ^ n) - -284468464;
        }
        thd2.ssf_4();
    }

    private static boolean khwgh(thd_2 thd2) {
        block0: {
            int n = -169794456;
            n = Integer.rotateLeft(n * -715708515, 9) ^ 0x4817E7D3;
            thd_2 thd3 = thd2;
            n = (thd3 != null ? System.identityHashCode(thd3) : 0) ^ n;
            int n2 = n ^ 0x7464348B;
            if ((n2 ^ n) == 1952724107) break block0;
            int cfr_ignored_0 = (0x818510E3 ^ n) + 2000121455;
        }
        return thd2.rgha_2();
    }

    private static fy shss(khd khd2) {
        block0: {
            int n = rh.shhs(5588519);
            int n2 = n ^ 0x4338159B;
            if ((n2 ^ n) == 1127749019) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x436D53BC ^ n, 11) - 781894399) * 1131238333;
        }
        return khd2.sdh_2();
    }

    private static boolean thdhs_2(class_1657 class_16572) {
        block0: {
            int n = -80344267;
            int n2 = (n = Integer.rotateLeft(n * 1396750033, 10) ^ 0xE0C8DFF5) ^ 0x68F473EA;
            if ((n2 ^ n) == 1760850922) break block0;
            int cfr_ignored_0 = (0x93C278DF ^ n) + 1151971131;
        }
        return class_16572.method_5805();
    }

    private static kh_3 zghkh_2(Moondlc moondlc) {
        block0: {
            int n = 1831181826;
            n = Integer.rotateLeft(n * 1170204235, 16) ^ 0x94809661;
            Moondlc moondlc2 = moondlc;
            n = Integer.rotateRight((moondlc2 != null ? System.identityHashCode(moondlc2) : 0) ^ n, 8);
            int n2 = n ^ 0xD6E698F7;
            if ((n2 ^ n) == -689530633) break block0;
            int cfr_ignored_0 = (0xBBC306F5 ^ n) - 1959400854;
        }
        return moondlc.getFriendManager();
    }

    private static class_2561 jhgh_2(class_1657 class_16572) {
        block0: {
            int n = -1380580055;
            int n2 = (n = Integer.rotateLeft(n * -87282139, 27) ^ 0x47724BA2) ^ 0xC8D4AD07;
            if ((n2 ^ n) == -925586169) break block0;
            int cfr_ignored_0 = (0x6562A82E ^ n) + -1529359595;
        }
        return class_16572.method_5477();
    }

    private static boolean rja_2(kh_3 kh2, String string) {
        block0: {
            int n = 1616195621;
            n = Integer.rotateLeft(n * -918892511, 7) ^ 0x2EE5175C;
            kh_3 kh3 = kh2;
            n = Integer.rotateRight((kh3 != null ? System.identityHashCode(kh3) : 0) ^ n, 10);
            int n2 = n ^ 0x97B8935B;
            if ((n2 ^ n) == -1749511333) break block0;
            int cfr_ignored_0 = (0xF7EDA37E ^ n) + -1770110953;
        }
        return kh2.adhj(string);
    }

    private static class_279 dyz(class_10151 class_101512, class_2960 class_29602, Set set) {
        block0: {
            int n = -1550462090;
            n = Integer.rotateLeft(n * -1769729291, 4) ^ 0xB896BA79;
            class_10151 class_101513 = class_101512;
            n = Integer.rotateLeft((class_101513 != null ? System.identityHashCode(class_101513) : 0) ^ n, 18);
            class_2960 class_29603 = class_29602;
            n = Integer.rotateLeft((class_29603 != null ? System.identityHashCode(class_29603) : 0) ^ n, 26);
            int n2 = n ^ 0xEF19C35F;
            if ((n2 ^ n) == -283524257) break block0;
            int cfr_ignored_0 = (0x4C8C1029 ^ n) - -1294395022;
        }
        return class_101512.method_62941(class_29602, set);
    }

    private static void khtq_2(class_279 class_2792, String string, float f) {
        int n = rh.shhs(-1482026131);
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 4);
        n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 22);
        int n2 = n ^ 0x239D6131;
        if ((n2 ^ n) != 597516593) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x8437725C ^ n, 3) - 118782047) * -2076741027;
        }
        class_2792.method_57799(string, f);
    }

    private static void khght_2(class_279 class_2792, String string, float f) {
        int n = -1266807746;
        n = Integer.rotateLeft(n * 803917115, 17) ^ 0x61C11E08;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 7);
        int n2 = n ^ 0x2B60CC22;
        if ((n2 ^ n) != 727764002) {
            int cfr_ignored_0 = (0x9F1EC01C ^ n) + 99491498;
        }
        class_2792.method_57799(string, f);
    }

    private static void tjq_2(class_279 class_2792, String string, float f) {
        int n = rh.shhs(1199379465);
        class_279 class_2793 = class_2792;
        n = (class_2793 != null ? System.identityHashCode(class_2793) : 0) ^ n;
        int n2 = n ^ 0xE2BD5588;
        if ((n2 ^ n) != -490908280) {
            int cfr_ignored_0 = Integer.rotateLeft(0xA5C04181 ^ n, 7) + 379948506;
            int cfr_ignored_1 = (int)(0x6772EFBC27D4EB4FL ^ (long)n ^ 0x2208831A2DB96334L);
        }
        class_2792.method_57799(string, f);
    }

    private static float khjq(float f, float f2) {
        block0: {
            int n = -1238582627;
            n = Integer.rotateLeft(n * -1510252795, 4) ^ 0x9852561A;
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 19);
            int n2 = n ^ 0xDCC49C03;
            if ((n2 ^ n) == -591094781) break block0;
            int cfr_ignored_0 = (0x6AE8269E ^ n) - -2114046158;
        }
        return Math.max(f, f2);
    }

    private static String dkth_2(Exception exception) {
        block0: {
            int n = rh.shhs(-2033881606);
            Exception exception2 = exception;
            n = Integer.rotateLeft((exception2 != null ? System.identityHashCode(exception2) : 0) ^ n, 12);
            int n2 = n ^ 0xBA81EA01;
            if ((n2 ^ n) == -1165891071) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x3C4487FB ^ n, 10) + 1353324192) * 1011124219;
        }
        return exception.getMessage();
    }

    private static String[] jghf(String string) {
        int n = rh.shhs(2082596211);
        int n2 = n ^ 0xB8BDBBD6;
        if ((n2 ^ n) != -1195525162) {
            int cfr_ignored_0 = Integer.rotateLeft(0xC49C5EA5 ^ n, 11) - -749923018;
            int cfr_ignored_1 = (int)(0x62EF09827D4EB4FL ^ (long)n ^ 0x1C40831A2DB9A18CL);
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

    private static CallSite ssdh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1967899891;
            n3 = Integer.rotateLeft(n3 * -1942613019, 5) ^ 0x2BF29853;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            n3 = Integer.rotateRight(n ^ n3, 11);
            int n4 = n3 ^ 0x9F1225DB;
            if ((n4 ^ n3) != -1626200613) {
                int cfr_ignored_0 = (0xEA59E128 ^ n3) + -1051968101;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ rss ^ string.hashCode() ^ n2 + thzm_2 + i * 1462678253) + rss) ^ thzm_2));
            }
            String[] stringArray = thd_2.jghf(new String(cArray));
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

    private static String[] j1i5b3h4xn(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite mtz4mv141iap2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ nz1oaww ^ string.hashCode() ^ n2 + g8uipayb6 + i * 443131661) + nz1oaww) ^ g8uipayb6));
            }
            String[] stringArray = thd_2.j1i5b3h4xn(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

