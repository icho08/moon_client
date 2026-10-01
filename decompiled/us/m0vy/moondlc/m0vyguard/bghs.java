/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2813
 *  net.minecraft.class_2824
 *  net.minecraft.class_2828
 *  net.minecraft.class_2833
 *  net.minecraft.class_2846
 *  net.minecraft.class_2851
 *  net.minecraft.class_2868
 *  net.minecraft.class_287
 *  net.minecraft.class_2879
 *  net.minecraft.class_2885
 *  net.minecraft.class_2886
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_310
 *  net.minecraft.class_634
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2813;
import net.minecraft.class_2824;
import net.minecraft.class_2828;
import net.minecraft.class_2833;
import net.minecraft.class_2846;
import net.minecraft.class_2851;
import net.minecraft.class_2868;
import net.minecraft.class_287;
import net.minecraft.class_2879;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_310;
import net.minecraft.class_634;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tjh_2;
import us.m0vy.moondlc.m0vyguard.tkhd_2;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.shk_3;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tth_8;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.ghh_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.km;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Blink", category=bzw.OTHER, desc="Queues movement packets and releases them later")
public class bghs
extends bnq {
    private final khd thw_2 = new khd(this, "Release");
    private final fy m_2 = new fy(this.thw_2, "Manual");
    private final fy dsn = new fy(this.thw_2, "Pulse");
    private final tay zghz_2 = new tay((hy)this, "Pulse Delay", this::dkgh_2).shth_7(Float.intBitsToFloat(Integer.reverse(1330726990) ^ 0x305A8AF2)).dhbs_2(Float.intBitsToFloat(1589541984 + -421674080)).rkh_3(Float.intBitsToFloat(0xBB5897F6 ^ 0xF91097F6)).ssd_5(Float.intBitsToFloat(Integer.reverse(773696037) ^ 0xE06E3874));
    private final tay dhzq_2 = new tay(this, "Packet Limit").shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x4437BBA8 ^ 0x9437BB88, 25))).dhbs_2(Float.intBitsToFloat(Integer.reverse(-934910830) ^ 0xD5C6213)).rkh_3(Float.intBitsToFloat(996252538 - -96363654)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x82CA281E ^ 0x82C2475E, 11)));
    private final badh_2 thmr = new badh_2(this, "Move Only").bts(true);
    private final badh_2 khwq = new badh_2((hy)this, "Actions", this::bwh_2).bts(false);
    private final badh_2 thwn = new badh_2(this, "Hurt Release").bts(true);
    private final badh_2 yth = new badh_2(this, "Render").bts(true);
    private final bzw_2 shbj = new bzw_2(this, "Color", this::twz).dhshy(bhj_2.bsdh_2);
    private final Queue bkt_2 = new ConcurrentLinkedQueue();
    private final tkhd_2 bkhy = new tkhd_2();
    private class_238 jtsh_2;
    private class_243 dld = class_243.field_1353;
    private boolean shh_5;
    private int ham_2;
    private final bql<ghh_2> bsz_2 = this::dhghm;
    private final bql<btt> shnq = this::tlw;
    private final bql<shw_3> shlb = this::jdt_4;
    private static final int bmh = -1389110377;
    private static final int jrd = -314412348;
    private static final int shqz = 220748756;
    private static final int rhgh_2 = -1916754493;
    private static final int x6b1667rk8tt = -744538128;
    private static final int x6f29te = 898659080;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int kn0smqmi2vzrr;

    @Override
    public void nt() {
        int n = 1984281202;
        n = Integer.rotateLeft(n * 1523241381, 11) ^ 0xAF269DD1;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x677E512E;
        if ((n2 ^ n) != 1736331566) {
            int cfr_ignored_0 = (0x113BEB5C ^ n) - 662033856;
        }
        this.bkt_2.clear();
        this.bkhy.zat();
        bghs.jqr(this);
        this.ham_2 = bghs.mc.field_1724 != null ? bghs.mc.field_1724.field_6235 : 0;
    }

    @Override
    public void nc() {
        int n = 0;
        int n2 = -739619246;
        n2 = Integer.rotateLeft(n2 * -419851875, 18) ^ 0x5D938D51;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 5);
        int n3 = Integer.rotateLeft(n2 ^ 0x743C77DB, 9) ^ 0x496B15B5 ^ 0x496B15B5;
        while (true) {
            block15: {
                block17: {
                    block14: {
                        block12: {
                            block13: {
                                block24: {
                                    block25: {
                                        block18: {
                                            block27: {
                                                block22: {
                                                    block20: {
                                                        block26: {
                                                            block16: {
                                                                block21: {
                                                                    block23: {
                                                                        block19: {
                                                                            block10: {
                                                                                block11: {
                                                                                    if ((n = Integer.rotateRight(n3, 9) ^ n2) > 13025358) break block10;
                                                                                    if (n > -1473421838) break block11;
                                                                                    if (n == -1730602285) break block12;
                                                                                    if (n == -1500466955) break block13;
                                                                                    int cfr_ignored_0 = (Integer.rotateRight(0xE738D632 ^ n2, 15) + 71274313) * -415705549;
                                                                                    if (n == -1473421838) break block14;
                                                                                    break block15;
                                                                                }
                                                                                if (n == -189294901) break block16;
                                                                                if (n == -126455006) break block17;
                                                                                int cfr_ignored_1 = (Integer.rotateRight(0x3F4FA313 ^ n2, 10) + -1358799224) * 1062183699;
                                                                                if (n == 13025358) break block18;
                                                                                break block15;
                                                                            }
                                                                            if (n > 1406338939) break block19;
                                                                            if (n == 728564843) break block20;
                                                                            if (n == 761157201) break block21;
                                                                            if (n == 1406338939) break block22;
                                                                            break block15;
                                                                        }
                                                                        if (n > 1826558945) break block23;
                                                                        if (n == 1523677613) break block24;
                                                                        if (n == 1826558945) break block25;
                                                                        int cfr_ignored_2 = Integer.rotateRight(0xF304D3C3 ^ n2, 17) + 1911768024;
                                                                        break block15;
                                                                    }
                                                                    if (n == 1950119899) break block26;
                                                                    if (n == 1975449765) break block27;
                                                                    int cfr_ignored_3 = Integer.rotateLeft(0x7C0E0444 ^ n2, 18) - 168829815;
                                                                    break block15;
                                                                }
                                                                int cfr_ignored_4 = (Integer.rotateLeft(0x18B84AB4 ^ n2, 6) - 45001479) * 414730933;
                                                                this.zrth_2();
                                                                this.bkt_2.clear();
                                                                this.jtsh_2 = null;
                                                                this.dld = class_243.field_1353;
                                                                return;
                                                            }
                                                            int cfr_ignored_5 = (Integer.rotateRight(0xBF0A1116 ^ n2, 10) - 647344357) * -1089859305;
                                                            yf.athz_2();
                                                            throw null;
                                                        }
                                                        int cfr_ignored_6 = Integer.rotateLeft(0x7012329 ^ n2, 3) + -578756302;
                                                        int cfr_ignored_7 = (int)(0xC5B38D1427D4EB4FL ^ (long)n2 ^ 0xE758831A2DB826B6L);
                                                        if (bghs.jjb()) {
                                                            try {
                                                                n -= 4;
                                                                if ((0x5B91398BCC8FFE85L ^ (long)n2 | 1L) == 0L) {
                                                                    throw new ArithmeticException();
                                                                }
                                                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x2D5E5651, 9) ^ 0x7D99677785F35E3EL ^ 0x7D99677785F35E3EL);
                                                            }
                                                            catch (ArithmeticException arithmeticException) {
                                                                n3 = Integer.rotateLeft(n2 ^ 0x2D5E5651, 9);
                                                            }
                                                            n -= 3;
                                                            continue;
                                                        }
                                                        n3 = Integer.rotateLeft(n2 ^ 0xF4B796CB, 9) + 1320849952 - 1320849952;
                                                        n += 2;
                                                        continue;
                                                    }
                                                    int cfr_ignored_8 = Integer.rotateRight(0xF9DB97CE ^ n2, 18) - 1173684525;
                                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x9CAC9CC6, 9)));
                                                    int cfr_ignored_9 = Integer.rotateRight(0xAE38B2EE ^ n2, 8) - 490424845;
                                                    int cfr_ignored_10 = (int)(0x68AF3FBC5F30D495L ^ (long)n2 ^ 0x820872D2520D7C8FL);
                                                    n3 = Integer.rotateLeft(n2 ^ 0x743C77DB, 9);
                                                    n -= 3;
                                                    continue;
                                                }
                                                int cfr_ignored_11 = (Integer.rotateLeft(0xE381AC19 ^ n2, 15) + -1861126590) * -478041063;
                                                int cfr_ignored_12 = (int)(0x2133022427D4EB4FL ^ (long)n2 ^ 0xF938831A2DB9EFB7L);
                                                int cfr_ignored_13 = (int)(0x30D550C3C608920EL ^ (long)n2 ^ 0x5CF740A2DF3BCC7BL);
                                                n3 = Integer.rotateLeft(n2 ^ 0x92E27D44, 9) ^ 0xAC0FEA4E ^ 0xAC0FEA4E;
                                                int cfr_ignored_14 = (int)(0x6458339CE8F45F5EL ^ (long)n2 ^ 0x9A491D5B459B6561L);
                                                n3 = Integer.rotateLeft(n2 ^ 0x743C77DB, 9);
                                                n -= 3;
                                                continue;
                                            }
                                            int cfr_ignored_15 = (Integer.rotateLeft(0x8164F670 ^ n2, 3) + -1349028149) * -2124089743;
                                            n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x743C77DB, 9) ^ 0x3B76C2432FB9BD2EL ^ 0x3B76C2432FB9BD2EL);
                                            int cfr_ignored_16 = Integer.rotateRight(0xD6B8CAC7 ^ n2, 13) - 79572308;
                                            n -= 3;
                                            continue;
                                        }
                                        int cfr_ignored_17 = Integer.rotateLeft(0x23B2C800 ^ n2, 7) + 1459869499;
                                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x3234AEA7, 9) ^ 0x9642FE9A178ABB81L ^ 0x9642FE9A178ABB81L);
                                        int cfr_ignored_18 = (Integer.rotateRight(0x6051663B ^ n2, 15) + -1371996064) * 1615947323;
                                        try {
                                            n -= 3;
                                            n3 = Integer.rotateLeft(n2 ^ 0x743C77DB, 9);
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            n3 = Integer.rotateLeft(n2 ^ 0x743C77DB, 9);
                                        }
                                        n -= 3;
                                        continue;
                                    }
                                    int cfr_ignored_19 = Integer.rotateLeft(0xEE5B2004 ^ n2, 16) - -513376329;
                                    n3 = Integer.rotateLeft(n2 ^ 0x705C320F, 9) ^ 0x93A6E8A3 ^ 0x93A6E8A3;
                                    int cfr_ignored_20 = Integer.rotateLeft(0x20B142EC ^ n2, 7) - -103499313;
                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x743C77DB, 9) ^ 0xB6356CE1C288B0FAL ^ 0xB6356CE1C288B0FAL);
                                    n -= 5;
                                    continue;
                                }
                                int cfr_ignored_21 = Integer.rotateRight(0xBDC4B40E ^ n2, 10) - -13669139;
                                try {
                                    --n;
                                    if ((0x8C0870528F92FAE7L ^ (long)n2 | 1L) == 0L) {
                                        throw new NoSuchElementException();
                                    }
                                    n3 = Integer.rotateLeft(n2 ^ 0x743C77DB, 9) ^ 0x9B2B4FCC ^ 0x9B2B4FCC;
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x743C77DB, 9)));
                                }
                                continue;
                            }
                            int cfr_ignored_22 = Integer.rotateLeft(0xC2BE7B81 ^ n2, 11) + -1720806438;
                            int cfr_ignored_23 = (int)(0xCD5BC27D4EB4FL ^ (long)n2 ^ 0x5608831A2DB9ADC8L);
                            n3 = Integer.rotateLeft(n2 ^ 0x9D5DE582, 9) + -1090998016 - -1090998016;
                            int cfr_ignored_24 = (Integer.rotateLeft(0x3F9DA69C ^ n2, 10) - -1200305121) * 1067296413;
                            n3 = Integer.rotateLeft(n2 ^ 0x743C77DB, 9);
                            n -= 5;
                            continue;
                        }
                        int cfr_ignored_25 = Integer.rotateRight(0xF0A4A64B ^ n2, 17) + 676184656;
                        n3 = Integer.rotateLeft(n2 ^ 0x743C77DB, 9);
                        int cfr_ignored_26 = (Integer.rotateRight(0xFB784CD2 ^ n2, 18) + 2012146857) * -76002093;
                        n -= 3;
                        continue;
                    }
                    int cfr_ignored_27 = (Integer.rotateRight(0x2216AE36 ^ n2, 7) - 622639045) * 571911735;
                    n3 = Integer.rotateLeft(n2 ^ 0x743C77DB, 9) ^ 0x6A2CC4DE ^ 0x6A2CC4DE;
                    int cfr_ignored_28 = (Integer.rotateRight(0x91055BF ^ n2, 4) - 492306780) * 152065471;
                    n += 4;
                    continue;
                }
                int cfr_ignored_29 = (Integer.rotateLeft(0x17500CF8 ^ n2, 5) + -686870205) * 391122169;
                int cfr_ignored_30 = (int)(0xB5F97AFC0C452245L ^ (long)n2 ^ 0x888D439BFACC623L);
                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x743C77DB, 9) ^ 0xEDFD21E0B5F76FACL ^ 0xEDFD21E0B5F76FACL);
                n += 2;
                continue;
            }
            int cfr_ignored_31 = (Integer.rotateLeft(0x2222487D ^ n2, 7) - 646211166) * 572672125;
            int cfr_ignored_32 = (int)(0xE090E64027D4EB4FL ^ (long)n2 ^ 0x31F0831A2DB86CF0L);
            n3 = Integer.rotateLeft(n2 ^ 0x743C77DB, 9);
        }
    }

    private boolean thaz_4(class_2596 class_25962) {
        boolean bl;
        int n = -1613013176;
        n = Integer.rotateLeft(n * 1927178739, 23) ^ 0xAA7897E0;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 27);
        int n2 = n ^ 0x8174BA51;
        if ((n2 ^ n) != -2123056559) {
            int cfr_ignored_0 = (0x1EAFE519 ^ n) - -1007263015;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        boolean bl2 = bl = class_25962 instanceof class_2828 || class_25962 instanceof class_2851 || class_25962 instanceof class_2833;
        if (bghs.zzb_2(this.thmr)) {
            return bl;
        }
        if (bl) {
            return true;
        }
        return this.khwq.shzl() && (class_25962 instanceof class_2846 || class_25962 instanceof class_2885 || class_25962 instanceof class_2824 || class_25962 instanceof class_2886 || class_25962 instanceof class_2879 || class_25962 instanceof class_2868 || class_25962 instanceof class_2813);
    }

    private void zrth_2() {
        int n = 700043354;
        n = Integer.rotateLeft(n * -17328707, 5) ^ 0x84EA4E85;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x884E575F;
        if ((n2 ^ n) != -2008131745) {
            int cfr_ignored_0 = (0xA1F78705 ^ n) - -811616607;
        }
        if (this.bkt_2.isEmpty()) {
            bghs.ghtd(this.bkhy);
            bghs.hks_2(this);
            return;
        }
        this.shh_5 = true;
        try {
            class_2596 class_25962;
            while ((class_25962 = (class_2596)this.bkt_2.poll()) != null) {
                this.tkhh_4(class_25962);
            }
            this.shh_5 = false;
        }
        catch (Throwable throwable) {
            this.shh_5 = false;
            bghs.shdh_8(this.bkhy);
            bghs.khbd_2(this);
            throw throwable;
        }
        bghs.thqw(this.bkhy);
        this.tzh_8();
    }

    private void tkhh_4(class_2596 class_25962) {
        try {
            int n = -1406290553;
            n = Integer.rotateLeft(n * 964032407, 17) ^ 0x69FD9745;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 15);
            int n2 = n ^ 0x69F178CF;
            if ((n2 ^ n) != 1777432783) {
                int cfr_ignored_0 = (0xC5DCCD48 ^ n) - 2010061966;
            }
            if ((0xD3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (mc.method_1562() != null) {
            boolean bl = km.zhm_2;
            km.zhm_2 = true;
            try {
                bghs.bad_2(mc).method_52787(class_25962);
            }
            finally {
                km.zhm_2 = bl;
            }
        }
    }

    private void tzh_8() {
        if (bghs.mc.field_1724 == null) {
            this.jtsh_2 = null;
            this.dld = class_243.field_1353;
            return;
        }
        this.jtsh_2 = bghs.mc.field_1724.method_5829();
        this.dld = bghs.mc.field_1724.method_19538();
    }

    private void jdt_4(shw_3 shw2) {
        int n = 0;
        int n2 = 389551529;
        n2 = Integer.rotateLeft(n2 * -275882613, 17) ^ 0x68567D66;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 12);
        int n3 = (n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594 + 1413756688 - 1413756688;
        while (true) {
            block40: {
                block49: {
                    block52: {
                        block59: {
                            block55: {
                                block63: {
                                    block46: {
                                        block60: {
                                            block41: {
                                                block42: {
                                                    block39: {
                                                        block58: {
                                                            block43: {
                                                                block62: {
                                                                    block48: {
                                                                        block61: {
                                                                            block54: {
                                                                                block45: {
                                                                                    block53: {
                                                                                        block47: {
                                                                                            block38: {
                                                                                                block56: {
                                                                                                    block57: {
                                                                                                        block50: {
                                                                                                            block51: {
                                                                                                                block35: {
                                                                                                                    block44: {
                                                                                                                        block36: {
                                                                                                                            block37: {
                                                                                                                                if ((n = n3 - -1308802594 ^ 0xB1FD41DE ^ n2) > -922265154) break block35;
                                                                                                                                if (n > -1463261860) break block36;
                                                                                                                                if (n > -2043794702) break block37;
                                                                                                                                if (n == -2113192145) break block38;
                                                                                                                                if (n == -2043794702) break block39;
                                                                                                                                int cfr_ignored_0 = (Integer.rotateLeft(0x85773778 ^ n2, 3) + 768431811) * -2055784583;
                                                                                                                                break block40;
                                                                                                                            }
                                                                                                                            if (n == -1737100792) break block41;
                                                                                                                            if (n == -1543712942) break block42;
                                                                                                                            if (n == -1463261860) break block43;
                                                                                                                            break block40;
                                                                                                                        }
                                                                                                                        if (n > -1215272465) break block44;
                                                                                                                        if (n == -1223313777) break block45;
                                                                                                                        if (n == -1215272465) break block46;
                                                                                                                        int cfr_ignored_1 = (Integer.rotateLeft(0xD01EFA79 ^ n2, 13) + 941487074) * -803276167;
                                                                                                                        int cfr_ignored_2 = (int)(0x12AC544427D4EB4FL ^ (long)n2 ^ 0x55F8831A2DB98889L);
                                                                                                                        break block40;
                                                                                                                    }
                                                                                                                    if (n == -1056443776) break block47;
                                                                                                                    if (n == -948146562) break block48;
                                                                                                                    int cfr_ignored_3 = Integer.rotateLeft(0x7781F0A1 ^ n2, 17) + 2098840250;
                                                                                                                    int cfr_ignored_4 = (int)(0xB5335E9C27D4EB4FL ^ (long)n2 ^ 0x4048831A2DB8C7B7L);
                                                                                                                    if (n == -922265154) break block49;
                                                                                                                    break block40;
                                                                                                                }
                                                                                                                if (n > 474416149) break block50;
                                                                                                                if (n > -548486135) break block51;
                                                                                                                if (n == -791099493) break block52;
                                                                                                                if (n == -548486135) break block53;
                                                                                                                break block40;
                                                                                                            }
                                                                                                            if (n == -418623670) break block54;
                                                                                                            if (n == 462530189) break block55;
                                                                                                            if (n == 474416149) break block56;
                                                                                                            break block40;
                                                                                                        }
                                                                                                        if (n > 1352571807) break block57;
                                                                                                        if (n == 498143126) break block58;
                                                                                                        if (n == 635894210) break block59;
                                                                                                        if (n == 1352571807) break block60;
                                                                                                        break block40;
                                                                                                    }
                                                                                                    if (n == 1554560944) break block61;
                                                                                                    if (n == 1615575606) break block62;
                                                                                                    if (n == 1647549037) break block63;
                                                                                                    break block40;
                                                                                                }
                                                                                                int cfr_ignored_5 = Integer.rotateLeft(0x716CD385 ^ n2, 17) - -1064616874;
                                                                                                int cfr_ignored_6 = (int)(0xB3DE7DB827D4EB4FL ^ (long)n2 ^ 0x600831A2DB8CA6DL);
                                                                                                byq byq2 = this.shbj.sdsh_4();
                                                                                                byq byq3 = byq2.tkhl_2(Float.intBitsToFloat(Integer.reverse(-1615849219) ^ 0xFD2C0DF9));
                                                                                                byq byq4 = byq2.tkhl_2(Float.intBitsToFloat(0xC605FEBB ^ 0x8563FEBB));
                                                                                                shk_3.thsh_9(false);
                                                                                                shw2.ssha_2().method_22903();
                                                                                                shk_3.tsh(shw2.ssha_2());
                                                                                                class_289 class_2892 = class_289.method_1348();
                                                                                                class_287 class_2872 = class_2892.method_60827(class_293.class_5596.field_27382, class_290.field_1576);
                                                                                                tth_8.khldh(shw2.ssha_2(), class_2872, this.jtsh_2, byq3);
                                                                                                shk_3.tbgh_2(class_2872);
                                                                                                class_287 class_2873 = class_2892.method_60827(class_293.class_5596.field_29344, class_290.field_1576);
                                                                                                tth_8.zsz_6(shw2.ssha_2(), class_2873, this.jtsh_2, byq4);
                                                                                                shk_3.tbgh_2(class_2873);
                                                                                                shw2.ssha_2().method_22909();
                                                                                                shk_3.tsd_6();
                                                                                                return;
                                                                                            }
                                                                                            int cfr_ignored_7 = (Integer.rotateLeft(0xC9F4E834 ^ n2, 12) - 2030419335) * -906696651;
                                                                                            yf.athz_2();
                                                                                            throw null;
                                                                                        }
                                                                                        int cfr_ignored_8 = Integer.rotateLeft(0xA313FB49 ^ n2, 7) + -1010234094;
                                                                                        int cfr_ignored_9 = (int)(0x61A1557427D4EB4FL ^ (long)n2 ^ 0x5798831A2DB96E93L);
                                                                                        return;
                                                                                    }
                                                                                    int cfr_ignored_10 = Integer.rotateLeft(0xB8235788 ^ n2, 10) + 1353005235;
                                                                                    if (this.dld == class_243.field_1353) {
                                                                                        int cfr_ignored_11 = (int)(0xDA47099751DA3607L ^ (long)n2 ^ 0xEE5E6F079728195FL);
                                                                                        n3 = (int)((long)((n2 ^ 0xC107F280 ^ 0xB1FD41DE) + -1308802594) ^ 0xC5FE9F676007B34L ^ 0xC5FE9F676007B34L);
                                                                                        continue;
                                                                                    }
                                                                                    n3 = (n2 ^ 0x1C470415 ^ 0xB1FD41DE) + -1308802594 + -792117496 - -792117496;
                                                                                    ++n;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_12 = Integer.rotateLeft(0x4F3632D ^ n2, 3) - -1646878290;
                                                                                int cfr_ignored_13 = (int)(0xC641CD1027D4EB4FL ^ (long)n2 ^ 0x6750831A2DB82152L);
                                                                                if (!yf.khdha_2()) {
                                                                                    n3 = (n2 ^ 0xD73D804D ^ 0xB1FD41DE) + -1308802594;
                                                                                    int cfr_ignored_14 = (Integer.rotateLeft(0x7F5F8930 ^ n2, 18) + 1894726667) * 2136967473;
                                                                                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x820B3F2F ^ 0xB1FD41DE) + -1308802594));
                                                                                    continue;
                                                                                }
                                                                                try {
                                                                                    if ((0xD9A0AF04A6C329F9L ^ (long)n2 | 1L) == 0L) {
                                                                                        throw new NoSuchElementException();
                                                                                    }
                                                                                    n3 = (n2 ^ 0x5CA8B7B0 ^ 0xB1FD41DE) + -1308802594 + 1736533418 - 1736533418;
                                                                                }
                                                                                catch (NoSuchElementException noSuchElementException) {
                                                                                    n3 = (n2 ^ 0x5CA8B7B0 ^ 0xB1FD41DE) + -1308802594;
                                                                                }
                                                                                n += 5;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_15 = (Integer.rotateRight(0x422189F3 ^ n2, 11) + 107828136) * 1109494259;
                                                                            if (this.jtsh_2 != null) {
                                                                                n3 = (n2 ^ 0xC77C6E7E ^ 0xB1FD41DE) + -1308802594 + -1151688975 - -1151688975;
                                                                                int cfr_ignored_16 = Integer.rotateLeft(0x9F063380 ^ n2, 6) + 1176361915;
                                                                                n += 4;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_17 = (int)(0x670031ED9A65CB9CL ^ (long)n2 ^ 0x9EABF8786C1F63D1L);
                                                                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0xC107F280 ^ 0xB1FD41DE) + -1308802594));
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_18 = Integer.rotateRight(0x7BD197E6 ^ n2, 18) - 46072853;
                                                                        if (!this.yth.shzl()) {
                                                                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0xC107F280 ^ 0xB1FD41DE) + -1308802594));
                                                                            ++n;
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            if ((0xA58D5963C63BEFE1L ^ (long)n2 | 1L) == 0L) {
                                                                                throw new ArithmeticException();
                                                                            }
                                                                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0xE70C4F4A ^ 0xB1FD41DE) + -1308802594));
                                                                        }
                                                                        catch (ArithmeticException arithmeticException) {
                                                                            n3 = (n2 ^ 0xE70C4F4A ^ 0xB1FD41DE) + -1308802594 + 514130727 - 514130727;
                                                                        }
                                                                        n -= 3;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_19 = Integer.rotateRight(0x22327BAE ^ n2, 7) - 679123277;
                                                                    if (bghs.mc.field_1724 == null) {
                                                                        try {
                                                                            n += 2;
                                                                            if ((0x6811F5BDDADAE545L ^ (long)n2 | 1L) == 0L) {
                                                                                throw new NoSuchElementException();
                                                                            }
                                                                            n3 = (n2 ^ 0xC107F280 ^ 0xB1FD41DE) + -1308802594 + 744150771 - 744150771;
                                                                        }
                                                                        catch (NoSuchElementException noSuchElementException) {
                                                                            n3 = (n2 ^ 0xC107F280 ^ 0xB1FD41DE) + -1308802594 + 246859628 - 246859628;
                                                                        }
                                                                        n += 4;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        n -= 3;
                                                                        if ((0x954C74C118113109L ^ (long)n2 | 1L) == 0L) {
                                                                            throw new ArithmeticException();
                                                                        }
                                                                        n3 = (n2 ^ 0xDF4EC409 ^ 0xB1FD41DE) + -1308802594 ^ 0xEF5CC948 ^ 0xEF5CC948;
                                                                    }
                                                                    catch (ArithmeticException arithmeticException) {
                                                                        n3 = (n2 ^ 0xDF4EC409 ^ 0xB1FD41DE) + -1308802594 ^ 0x6C9871DF ^ 0x6C9871DF;
                                                                    }
                                                                    n += 3;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_20 = (Integer.rotateRight(0x79C3416 ^ n2, 3) - -263721499) * 127677463;
                                                                if (bghs.mc.field_1724 != null) {
                                                                    int cfr_ignored_21 = (int)(0xB4E5A62221A1DBD1L ^ (long)n2 ^ 0xB1348FF04C84C41AL);
                                                                    n3 = (int)((long)((n2 ^ 0xDF4EC409 ^ 0xB1FD41DE) + -1308802594) ^ 0x6E8855260F621C18L ^ 0x6E8855260F621C18L);
                                                                    n += 3;
                                                                    continue;
                                                                }
                                                                try {
                                                                    if ((0xACCFA21CE324020DL ^ (long)n2 | 1L) == 0L) {
                                                                        throw new UnsupportedOperationException();
                                                                    }
                                                                    n3 = (n2 ^ 0xC107F280 ^ 0xB1FD41DE) + -1308802594 ^ 0x714FAF2B ^ 0x714FAF2B;
                                                                }
                                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                                    n3 = (n2 ^ 0xC107F280 ^ 0xB1FD41DE) + -1308802594 + 466492200 - 466492200;
                                                                }
                                                                continue;
                                                            }
                                                            int cfr_ignored_22 = (Integer.rotateRight(0xDE06A6FB ^ n2, 14) + -416557152) * -569989381;
                                                            n3 = (n2 ^ 0x7453F44A ^ 0xB1FD41DE) + -1308802594 + -33675582 - -33675582;
                                                            int cfr_ignored_23 = (Integer.rotateRight(0x1784C7F7 ^ n2, 5) - -579742172) * 394577911;
                                                            n3 = (n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594;
                                                            continue;
                                                        }
                                                        int cfr_ignored_24 = (Integer.rotateLeft(0x44ED16B8 ^ n2, 11) + 1561550723) * 1156388537;
                                                        try {
                                                            n -= 5;
                                                            n3 = (n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594 + -160317416 - -160317416;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            n3 = (n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594 + -1948178104 - -1948178104;
                                                        }
                                                        continue;
                                                    }
                                                    int cfr_ignored_25 = Integer.rotateLeft(0xF87C2960 ^ n2, 18) + 459710939;
                                                    n3 = (int)((long)((n2 ^ 0xB925427B ^ 0xB1FD41DE) + -1308802594) ^ 0x52502EA1441B91BCL ^ 0x52502EA1441B91BCL);
                                                    int cfr_ignored_26 = Integer.rotateRight(0xF8DB07E6 ^ n2, 18) - 652448789;
                                                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594));
                                                    int cfr_ignored_27 = (Integer.rotateLeft(0x41EEA0BC ^ n2, 11) - 4396543) * 1106157757;
                                                    ++n;
                                                    continue;
                                                }
                                                int cfr_ignored_28 = (Integer.rotateRight(0x26F6DF37 ^ n2, 7) - -1136482588) * 653713207;
                                                n3 = (n2 ^ 0x4E80ECCC ^ 0xB1FD41DE) + -1308802594 + -1080664393 - -1080664393;
                                                int cfr_ignored_29 = (Integer.rotateRight(0x696909BA ^ n2, 16) + -938095423) * 1768491451;
                                                n3 = (n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594;
                                                continue;
                                            }
                                            int cfr_ignored_30 = (Integer.rotateLeft(0xBD952694 ^ n2, 10) - -110277849) * -1114298731;
                                            try {
                                                n -= 2;
                                                if ((0xF9AF0FD9183DEF2BL ^ (long)n2 | 1L) == 0L) {
                                                    throw new ArithmeticException();
                                                }
                                                n3 = (n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594 ^ 0xF5F2ECB8 ^ 0xF5F2ECB8;
                                            }
                                            catch (ArithmeticException arithmeticException) {
                                                n3 = (int)((long)((n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594) ^ 0x5292A501BADCE3D1L ^ 0x5292A501BADCE3D1L);
                                            }
                                            continue;
                                        }
                                        int cfr_ignored_31 = (Integer.rotateRight(0x494035BF ^ n2, 12) - -484171428) * 1228944831;
                                        n3 = (n2 ^ 0x76B8CE45 ^ 0xB1FD41DE) + -1308802594 ^ 0x146DAB14 ^ 0x146DAB14;
                                        int cfr_ignored_32 = Integer.rotateRight(0x1251996E ^ n2, 5) - 1010774925;
                                        n3 = (n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594 ^ 0x5654D341 ^ 0x5654D341;
                                        n -= 3;
                                        continue;
                                    }
                                    int cfr_ignored_33 = Integer.rotateLeft(0xC4A49428 ^ n2, 11) + -733245421;
                                    n3 = (n2 ^ 0x2AAA65DE ^ 0xB1FD41DE) + -1308802594 + -1365311224 - -1365311224;
                                    int cfr_ignored_34 = Integer.rotateLeft(0xA34F9DA0 ^ n2, 7) + -889080421;
                                    try {
                                        n -= 3;
                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594));
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        n3 = (int)((long)((n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594) ^ 0x7B929B4D659C1DEL ^ 0x7B929B4D659C1DEL);
                                    }
                                    n += 3;
                                    continue;
                                }
                                int cfr_ignored_35 = Integer.rotateLeft(0xACEE0EE0 ^ n2, 8) + -181310373;
                                int cfr_ignored_36 = (int)(0xBC0DBE09016AEE02L ^ (long)n2 ^ 0x8162CE662722D5CAL);
                                n3 = (int)((long)((n2 ^ 0x4BEEF986 ^ 0xB1FD41DE) + -1308802594) ^ 0x699369B49242A81FL ^ 0x699369B49242A81FL);
                                int cfr_ignored_37 = (int)(0x808167BA8A31867L ^ (long)n2 ^ 0xD1879DF5CBE9BDC1L);
                                n3 = (n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594 + -1473397747 - -1473397747;
                                continue;
                            }
                            int cfr_ignored_38 = Integer.rotateRight(0x790BCFA6 ^ n2, 18) - -1395932075;
                            n3 = (int)((long)((n2 ^ 0x884DF25C ^ 0xB1FD41DE) + -1308802594) ^ 0xDF705FB138A7E9CEL ^ 0xDF705FB138A7E9CEL);
                            int cfr_ignored_39 = (Integer.rotateLeft(0x8E0C8354 ^ n2, 4) - 937526887) * -1911782571;
                            try {
                                if ((0x28E57F4368B05DC1L ^ (long)n2 | 1L) == 0L) {
                                    throw new NoSuchElementException();
                                }
                                n3 = Integer.reverse(Integer.reverse((n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594));
                            }
                            catch (NoSuchElementException noSuchElementException) {
                                n3 = (int)((long)((n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594) ^ 0x23E0AED6C4646D4L ^ 0x23E0AED6C4646D4L);
                            }
                            continue;
                        }
                        int cfr_ignored_40 = (Integer.rotateRight(0x7908DF1B ^ n2, 18) + -1401904256) * 2030624539;
                        try {
                            if ((0xA082E9AA3890D86FL ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = (n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = (int)((long)((n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594) ^ 0x3B73603043D248BCL ^ 0x3B73603043D248BCL);
                        }
                        n -= 4;
                        continue;
                    }
                    int cfr_ignored_41 = Integer.rotateLeft(0xD2F1D9E4 ^ n2, 13) - -1884880425;
                    int cfr_ignored_42 = (int)(0x7F94B1C4B0A5658BL ^ (long)n2 ^ 0x9EF9ADF9303152F8L);
                    n3 = (int)((long)((n2 ^ 0x44291B46 ^ 0xB1FD41DE) + -1308802594) ^ 0x4CE05A7AC2263D0AL ^ 0x4CE05A7AC2263D0AL);
                    int cfr_ignored_43 = (int)(0xF8A864A347376E53L ^ (long)n2 ^ 0x343642DD27805C81L);
                    n3 = (int)((long)((n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594) ^ 0x15A74F0B2B6730F4L ^ 0x15A74F0B2B6730F4L);
                    n -= 2;
                    continue;
                }
                int cfr_ignored_44 = Integer.rotateLeft(0x413765CD ^ n2, 11) - -367856882;
                int cfr_ignored_45 = (int)(0x8385CBF027D4EB4FL ^ (long)n2 ^ 0x6A90831A2DB8AADAL);
                n3 = (n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594 ^ 0x45CF25F ^ 0x45CF25F;
                int cfr_ignored_46 = (Integer.rotateLeft(0xDE30CDB8 ^ n2, 14) + -330921853) * -567226951;
                n += 3;
                continue;
            }
            int cfr_ignored_47 = (Integer.rotateRight(0x56629CBF ^ n2, 13) - 2051971676) * 1449303231;
            n3 = (int)((long)((n2 ^ 0xB715B68F ^ 0xB1FD41DE) + -1308802594) ^ 0x9170C1CDD6A72EDAL ^ 0x9170C1CDD6A72EDAL);
        }
    }

    private void tlw(btt btt2) {
        int n = 0;
        int n2 = -379336183;
        n2 = Integer.rotateLeft(n2 * -1751888021, 13) ^ 0x735E5AF2;
        btt btt3 = btt2;
        n2 = (btt3 != null ? System.identityHashCode(btt3) : 0) ^ n2;
        int n3 = Integer.reverse(Integer.reverse(586143773 * -394728703 + -1111172211 ^ n2));
        block51: while (true) {
            switch (((n3 ^ n2) - -1111172211) * 1816139009) {
                case 586143773: {
                    int cfr_ignored_0 = Integer.rotateRight(0x3AEE3207 ^ n2, 10) - 657829396;
                    if (bghs.mc.field_1724 == null) {
                        n3 = (-412969507 * -394728703 + -1111172211 ^ n2) + -1423942021 - -1423942021;
                        int cfr_ignored_1 = Integer.rotateRight(0xC499C36E ^ n2, 11) - -755218035;
                        n3 = (586143769 * -394728703 + -1111172211 ^ n2) + -685331072 - -685331072;
                        --n;
                        continue block51;
                    }
                    n3 = -1400100563 * -394728703 + -1111172211 ^ n2 ^ 0xA4D5D0DA ^ 0xA4D5D0DA;
                    int cfr_ignored_2 = Integer.rotateRight(0x3704A42A ^ n2, 9) + -1376944047;
                    n3 = Integer.reverse(Integer.reverse(586143774 * -394728703 + -1111172211 ^ n2));
                    n -= 4;
                    continue block51;
                }
                case 586143769: {
                    int cfr_ignored_3 = (Integer.rotateRight(0x7768817A ^ n2, 17) + 2047167745) * 2003337595;
                    return;
                }
                case 586143770: {
                    int cfr_ignored_4 = Integer.rotateRight(0xADFF7F82 ^ n2, 8) + 374214649;
                    this.zrth_2();
                    try {
                        --n;
                        if ((0x856741C48BE67441L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (586143768 * -394728703 + -1111172211 ^ n2) + 1054353433 - 1054353433;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(Integer.reverse(586143768 * -394728703 + -1111172211 ^ n2));
                    }
                    n -= 2;
                    continue block51;
                }
                case 586143775: {
                    int cfr_ignored_5 = Integer.rotateRight(0x92BC6647 ^ n2, 5) - -919731756;
                    if (bghs.mc.field_1724.field_6235 > this.ham_2) {
                        n3 = 586143770 * -394728703 + -1111172211 ^ n2 ^ 0x9896828A ^ 0x9896828A;
                        int cfr_ignored_6 = (Integer.rotateLeft(0x172C08DC ^ n2, 5) - -760040993) * 388761821;
                        n += 5;
                        continue block51;
                    }
                    try {
                        n -= 2;
                        n3 = (586143768 * -394728703 + -1111172211 ^ n2) + 1311278882 - 1311278882;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)(586143768 * -394728703 + -1111172211 ^ n2) ^ 0x39CE5ECDB9EB7C2BL ^ 0x39CE5ECDB9EB7C2BL);
                    }
                    n -= 4;
                    continue block51;
                }
                case 586143767: {
                    int cfr_ignored_7 = Integer.rotateRight(0x2B6599C6 ^ n2, 8) - 1168850485;
                    if (this.bkhy.tagh((long)this.zghz_2.thw_5())) {
                        try {
                            if ((0xDEA310961B48F02FL ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n3 = 586143771 * -394728703 + -1111172211 ^ n2 ^ 0xAC8E716B ^ 0xAC8E716B;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = (int)((long)(586143771 * -394728703 + -1111172211 ^ n2) ^ 0x6EB2AB0319769DDAL ^ 0x6EB2AB0319769DDAL);
                        }
                        n += 3;
                        continue block51;
                    }
                    try {
                        n += 5;
                        if ((0x4C2FAC883B93F335L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (586143772 * -394728703 + -1111172211 ^ n2) + 86229417 - 86229417;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = 586143772 * -394728703 + -1111172211 ^ n2;
                    }
                    continue block51;
                }
                case 586143772: {
                    int cfr_ignored_8 = Integer.rotateLeft(0xF6076D4C ^ n2, 17) - -817636497;
                    return;
                }
                case 586143768: {
                    int cfr_ignored_9 = Integer.rotateLeft(0xA2E905E0 ^ n2, 7) + -1097509541;
                    this.ham_2 = bghs.mc.field_1724.field_6235;
                    if (!this.thw_2.skhth(this.dsn)) {
                        int cfr_ignored_10 = (int)(0xD4BD27F66A730B69L ^ (long)n2 ^ 0xB29C1855EDF404ABL);
                        n3 = (-1718978441 * -394728703 + -1111172211 ^ n2) + 1174539837 - 1174539837;
                        int cfr_ignored_11 = (int)(0x5AE6EE042AFA2D72L ^ (long)n2 ^ 0x21789947A1C3181CL);
                        n3 = 586143772 * -394728703 + -1111172211 ^ n2;
                        n -= 2;
                        continue block51;
                    }
                    try {
                        --n;
                        if ((0x2EAB12B35A1A5499L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(586143767 * -394728703 + -1111172211 ^ n2));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (586143767 * -394728703 + -1111172211 ^ n2) + 2132841155 - 2132841155;
                    }
                    --n;
                    continue block51;
                }
                case 586143774: {
                    int cfr_ignored_12 = Integer.rotateLeft(0x203B29C1 ^ n2, 7) + -343429734;
                    int cfr_ignored_13 = (int)(0xE28987FC27D4EB4FL ^ (long)n2 ^ 0xF288831A2DB868C2L);
                    if (!this.thwn.shzl()) {
                        n3 = Integer.reverse(Integer.reverse(586143768 * -394728703 + -1111172211 ^ n2));
                        int cfr_ignored_14 = (Integer.rotateLeft(0x691E1A5D ^ n2, 16) - -1090334594) * 1763580509;
                        int cfr_ignored_15 = (int)(0xABACB46027D4EB4FL ^ (long)n2 ^ 0x95B0831A2DB8FA88L);
                        n += 5;
                        continue block51;
                    }
                    int cfr_ignored_16 = (int)(0x13F38870CF9AFF52L ^ (long)n2 ^ 0xED91538605838A36L);
                    n3 = (int)((long)(1689277550 * -394728703 + -1111172211 ^ n2) ^ 0x93D3DE053BC70BFFL ^ 0x93D3DE053BC70BFFL);
                    int cfr_ignored_17 = (int)(0x901F560C7657EFFDL ^ (long)n2 ^ 0x5168201C24DC8DEFL);
                    n3 = 586143775 * -394728703 + -1111172211 ^ n2 ^ 0x9641C835 ^ 0x9641C835;
                    n += 2;
                    continue block51;
                }
                case 586143771: {
                    int cfr_ignored_18 = Integer.rotateLeft(0xFAA5D6A5 ^ n2, 18) - 1584569654;
                    int cfr_ignored_19 = (int)(0x3817789827D4EB4FL ^ (long)n2 ^ 0xC40831A2DB9DDFFL);
                    this.zrth_2();
                    try {
                        ++n;
                        if ((0xE7166E89CBA527A1L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = 586143772 * -394728703 + -1111172211 ^ n2 ^ 0xAB490218 ^ 0xAB490218;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = 586143772 * -394728703 + -1111172211 ^ n2;
                    }
                    continue block51;
                }
                case 586143776: {
                    int cfr_ignored_20 = Integer.rotateRight(0x1B8163AE ^ n2, 6) - 1493741901;
                    n3 = (1063556825 * -394728703 + -1111172211 ^ n2) + 319379077 - 319379077;
                    int cfr_ignored_21 = (Integer.rotateRight(0x6DEE85F7 ^ n2, 16) - 1413470244) * 1844348407;
                    n3 = 586143773 * -394728703 + -1111172211 ^ n2;
                    continue block51;
                }
                case 586143777: {
                    int cfr_ignored_22 = (Integer.rotateRight(0xAB149333 ^ n2, 8) + -1143246232) * -1424714957;
                    n3 = 1111679636 * -394728703 + -1111172211 ^ n2;
                    int cfr_ignored_23 = Integer.rotateLeft(0x9812108 ^ n2, 4) + 721461043;
                    n3 = 467433714 * -394728703 + -1111172211 ^ n2 ^ 0x595F36EB ^ 0x595F36EB;
                    int cfr_ignored_24 = (Integer.rotateRight(0xBF24D17F ^ n2, 10) - 701693340) * -1088106113;
                    n3 = (int)((long)(586143773 * -394728703 + -1111172211 ^ n2) ^ 0xFC1D7FCF37DDB876L ^ 0xFC1D7FCF37DDB876L);
                    n -= 3;
                    continue block51;
                }
                case 586143778: {
                    int cfr_ignored_25 = (Integer.rotateRight(0x39B29B1E ^ n2, 10) - 16672733) * 968006431;
                    n3 = 1954957551 * -394728703 + -1111172211 ^ n2;
                    int cfr_ignored_26 = Integer.rotateRight(0x6E3C47C2 ^ n2, 16) + 1571442617;
                    n3 = -276789177 * -394728703 + -1111172211 ^ n2;
                    int cfr_ignored_27 = Integer.rotateRight(0xBC822BAA ^ n2, 10) + -668931887;
                    n3 = 586143773 * -394728703 + -1111172211 ^ n2;
                    n += 2;
                    continue block51;
                }
                case 586143779: {
                    int cfr_ignored_28 = (Integer.rotateRight(0xC1220853 ^ n2, 11) + 1736221000) * -1054734253;
                    n3 = (int)((long)(-1638385313 * -394728703 + -1111172211 ^ n2) ^ 0x796DA5862E7DFC34L ^ 0x796DA5862E7DFC34L);
                    int cfr_ignored_29 = (Integer.rotateLeft(0x868A2499 ^ n2, 3) + 1326976450) * -2037767015;
                    int cfr_ignored_30 = (int)(0x44388AA427D4EB4FL ^ (long)n2 ^ 0xE838831A2DB925A0L);
                    try {
                        if ((0xBE40438A592B7CA7L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = 586143773 * -394728703 + -1111172211 ^ n2 ^ 0xBE23EC6A ^ 0xBE23EC6A;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(Integer.reverse(586143773 * -394728703 + -1111172211 ^ n2));
                    }
                    n -= 3;
                    continue block51;
                }
                case 586143780: {
                    int cfr_ignored_31 = (Integer.rotateLeft(0xAD819F8 ^ n2, 4) + 1418249283) * 181934585;
                    try {
                        if ((0x3EA9766AE99B8B31L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = 586143773 * -394728703 + -1111172211 ^ n2 ^ 0xA5669EFF ^ 0xA5669EFF;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = 586143773 * -394728703 + -1111172211 ^ n2 ^ 0xD4279B72 ^ 0xD4279B72;
                    }
                    n -= 4;
                    continue block51;
                }
                case 586143781: {
                    int cfr_ignored_32 = Integer.rotateRight(0xA9AF6202 ^ n2, 8) + -1868923527;
                    n3 = 135917977 * -394728703 + -1111172211 ^ n2 ^ 0x8B94DE7F ^ 0x8B94DE7F;
                    int cfr_ignored_33 = (Integer.rotateLeft(0xB148F598 ^ n2, 9) + 2083740835) * -1320618599;
                    int cfr_ignored_34 = (int)(0xE541E6BDF80520C1L ^ (long)n2 ^ 0x300B3CB9BAA46752L);
                    n3 = 586143773 * -394728703 + -1111172211 ^ n2;
                    ++n;
                    continue block51;
                }
                case 586143782: {
                    int cfr_ignored_35 = Integer.rotateLeft(0x898CAFA0 ^ n2, 4) + -1402543205;
                    try {
                        n -= 5;
                        if ((0x9E32D87778BAE275L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (586143773 * -394728703 + -1111172211 ^ n2) + -2003989939 - -2003989939;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = 586143773 * -394728703 + -1111172211 ^ n2 ^ 0x562EA035 ^ 0x562EA035;
                    }
                    continue block51;
                }
                case 586143783: {
                    int cfr_ignored_36 = Integer.rotateRight(0x55DDBECA ^ n2, 13) + 1782036913;
                    n3 = (int)((long)(859078111 * -394728703 + -1111172211 ^ n2) ^ 0xBEB8731B0149AE10L ^ 0xBEB8731B0149AE10L);
                    int cfr_ignored_37 = (Integer.rotateLeft(0xCCEAA7D1 ^ n2, 12) + -725094006) * -857036847;
                    int cfr_ignored_38 = (int)(0xE5809EC27D4EB4FL ^ (long)n2 ^ 0xEEA8831A2DB9B161L);
                    n3 = (int)((long)(586143773 * -394728703 + -1111172211 ^ n2) ^ 0x3D15B8B4954DED32L ^ 0x3D15B8B4954DED32L);
                    n -= 2;
                    continue block51;
                }
                case 586143784: {
                    int cfr_ignored_39 = Integer.rotateRight(0x5D484AC7 ^ n2, 14) - 1344187732;
                    n3 = 1362661035 * -394728703 + -1111172211 ^ n2 ^ 0x2C54543F ^ 0x2C54543F;
                    int cfr_ignored_40 = (Integer.rotateRight(0x432607E ^ n2, 3) - -2039001475) * 70410367;
                    try {
                        n -= 3;
                        if ((0x971DD5D2F08D69D9L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = 586143773 * -394728703 + -1111172211 ^ n2 ^ 0xDC841267 ^ 0xDC841267;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = 586143773 * -394728703 + -1111172211 ^ n2;
                    }
                    continue block51;
                }
                case 586143785: {
                    int cfr_ignored_41 = Integer.rotateLeft(0xF2DF31E8 ^ n2, 17) + 1835313747;
                    try {
                        n += 5;
                        if ((0x275A4D872D46D3A9L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.reverse(Integer.reverse(586143773 * -394728703 + -1111172211 ^ n2));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (586143773 * -394728703 + -1111172211 ^ n2) + -214565506 - -214565506;
                    }
                    n -= 2;
                    continue block51;
                }
                case 586143786: {
                    int cfr_ignored_42 = Integer.rotateLeft(0x1E5B6F25 ^ n2, 6) - -1318054730;
                    int cfr_ignored_43 = (int)(0xDCE9C11827D4EB4FL ^ (long)n2 ^ 0x7F40831A2DB81402L);
                    int cfr_ignored_44 = (int)(0x96C7CCCEF5266DB9L ^ (long)n2 ^ 0x64ED26FF2054805EL);
                    n3 = (int)((long)(-1414113728 * -394728703 + -1111172211 ^ n2) ^ 0xBD3FD8AD1D032823L ^ 0xBD3FD8AD1D032823L);
                    int cfr_ignored_45 = (int)(0x62A59DAE2F412802L ^ (long)n2 ^ 0xC62C9231AB23689AL);
                    n3 = (int)((long)(586143773 * -394728703 + -1111172211 ^ n2) ^ 0xCDFC1AAF12F748A0L ^ 0xCDFC1AAF12F748A0L);
                    continue block51;
                }
                case 586143787: {
                    int cfr_ignored_46 = (Integer.rotateRight(0xA9FF3FFF ^ n2, 8) - -1706664164) * -1442889729;
                    n3 = -831856314 * -394728703 + -1111172211 ^ n2;
                    int cfr_ignored_47 = Integer.rotateLeft(0xD5C063C8 ^ n2, 13) + -425085837;
                    try {
                        n -= 5;
                        if ((0xDC5C1F2C2779298DL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = 586143773 * -394728703 + -1111172211 ^ n2;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (586143773 * -394728703 + -1111172211 ^ n2) + -227972464 - -227972464;
                    }
                    continue block51;
                }
                case 586143788: {
                    int cfr_ignored_48 = Integer.rotateLeft(0x49261E9 ^ n2, 3) + -1843955086;
                    int cfr_ignored_49 = (int)(0xC620CFD427D4EB4FL ^ (long)n2 ^ 0x62D8831A2DB82190L);
                    n3 = 2013531543 * -394728703 + -1111172211 ^ n2 ^ 0x7AB16DBC ^ 0x7AB16DBC;
                    int cfr_ignored_50 = (Integer.rotateLeft(0x1F106F98 ^ n2, 6) + -950328669) * 521170841;
                    n3 = 1572477176 * -394728703 + -1111172211 ^ n2 ^ 0xD1F0A4BA ^ 0xD1F0A4BA;
                    int cfr_ignored_51 = Integer.rotateRight(0x5ABA52E2 ^ n2, 14) + 15575193;
                    n3 = 586143773 * -394728703 + -1111172211 ^ n2 ^ 0xCF0CD45E ^ 0xCF0CD45E;
                    continue block51;
                }
                case 586143789: {
                    int cfr_ignored_52 = Integer.rotateRight(0x17DBC96B ^ n2, 5) + -402980048;
                    n3 = Integer.reverse(Integer.reverse(227474518 * -394728703 + -1111172211 ^ n2));
                    int cfr_ignored_53 = (Integer.rotateLeft(0x6FFEE514 ^ n2, 16) - -1808048985) * 1878975765;
                    try {
                        n -= 3;
                        if ((0x62D1461C0D6EC503L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (int)((long)(586143773 * -394728703 + -1111172211 ^ n2) ^ 0x8190DBB47619D1F2L ^ 0x8190DBB47619D1F2L);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)(586143773 * -394728703 + -1111172211 ^ n2) ^ 0xD9F2EDCC9FC799E4L ^ 0xD9F2EDCC9FC799E4L);
                    }
                    n -= 2;
                    continue block51;
                }
            }
            int cfr_ignored_54 = Integer.rotateLeft(0x7D3DF6A9 ^ n2, 18) + 786333106;
            int cfr_ignored_55 = (int)(0xBF8F589427D4EB4FL ^ (long)n2 ^ 0x4C58831A2DB8D2CFL);
            n3 = Integer.reverse(Integer.reverse(586143773 * -394728703 + -1111172211 ^ n2));
        }
    }

    private void dhghm(ghh_2 ghh2) {
        int n = -1895996925;
        n = Integer.rotateLeft(n * 21554363, 27) ^ 0x61CC7A50;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 5);
        ghh_2 ghh3 = ghh2;
        n = Integer.rotateLeft((ghh3 != null ? System.identityHashCode(ghh3) : 0) ^ n, 11);
        int n2 = n ^ 0xA0A33DD8;
        if ((n2 ^ n) != -1599914536) {
            int cfr_ignored_0 = (0x2E5E5FDB ^ n) - 516163780;
        }
        if (this.shh_5 || bghs.mc.field_1724 == null || mc.method_1542()) {
            return;
        }
        class_2596 class_25962 = ghh2.zjd();
        if (!this.thaz_4(class_25962)) {
            return;
        }
        this.bkt_2.add(class_25962);
        ghh2.dhtd_2();
        if ((float)this.bkt_2.size() >= this.dhzq_2.thw_5()) {
            this.zrth_2();
        }
    }

    private boolean twz() {
        int n = 1777864958;
        n = Integer.rotateLeft(n * -315631771, 21) ^ 0x7C5CBA4B;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xFEA100B5;
        if ((n2 ^ n) != -23002955) {
            int cfr_ignored_0 = (0x9759104B ^ n) - -27340442;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return !this.yth.shzl();
    }

    private boolean bwh_2() {
        block0: {
            int n = tjh_2.akhdh(1787776623);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xCC28FE4D;
            if ((n2 ^ n) == -869728691) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xA6A7B022 ^ n, 7) + 850129753;
        }
        return this.thmr.shzl();
    }

    private boolean dkgh_2() {
        int n = 236210722;
        int n2 = (n = Integer.rotateLeft(n * 398239149, 28) ^ 0xA67331C9) ^ 0x1D988407;
        if ((n2 ^ n) != 496534535) {
            int cfr_ignored_0 = (0x138CCE25 ^ n) - 1910067028;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return !this.thw_2.skhth(this.dsn);
    }

    private static String tthk(String string, int n, int n2, int n3) {
        try {
            int n4 = 384143341;
            n4 = Integer.rotateLeft(n4 * 931111345, 15) ^ 0x878A6180;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            n4 = n ^ n4;
            int n5 = n4 ^ 0xD64D6539;
            if ((n5 ^ n4) != -699570887) {
                int cfr_ignored_0 = (0xC0A8EAD4 ^ n4) - -1698464895;
            }
            if ((0x1B5 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0xBFA799D4) + bmh ^ Integer.reverse(n2 + i * -807939), 24) - jrd);
        }
        return new String(cArray);
    }

    private static void jqr(bghs bghs2) {
        int n = 1942185313;
        n = Integer.rotateLeft(n * -1329260895, 16) ^ 0x1C3827EF;
        bghs bghs3 = bghs2;
        n = Integer.rotateRight((bghs3 != null ? System.identityHashCode(bghs3) : 0) ^ n, 11);
        int n2 = n ^ 0x22AFE439;
        if ((n2 ^ n) != 581952569) {
            int cfr_ignored_0 = (0x516C8158 ^ n) + 603808850;
        }
        bghs2.tzh_8();
    }

    private static boolean jjb() {
        block0: {
            int n = -1898298568;
            int n2 = (n = Integer.rotateLeft(n * 866397029, 3) ^ 0x435CE563) ^ 0xAF43FC4C;
            if ((n2 ^ n) == -1354498996) break block0;
            int cfr_ignored_0 = (0x2199BF74 ^ n) + -1471397744;
        }
        return yf.khdha_2();
    }

    private static boolean zzb_2(badh_2 badh2) {
        block0: {
            int n = 1950672655;
            n = Integer.rotateLeft(n * 232118487, 9) ^ 0xAE3F3D;
            badh_2 badh3 = badh2;
            n = (badh3 != null ? System.identityHashCode(badh3) : 0) ^ n;
            int n2 = n ^ 0xE9C76DD0;
            if ((n2 ^ n) == -372806192) break block0;
            int cfr_ignored_0 = (0x9D838ADF ^ n) - 683463114;
        }
        return badh2.shzl();
    }

    private static void ghtd(tkhd_2 tkhd2_2) {
        int n = tjh_2.akhdh(-2050425468);
        int n2 = n ^ 0xF26F9D81;
        if ((n2 ^ n) != -227566207) {
            int cfr_ignored_0 = Integer.rotateLeft(0x77A76005 ^ n, 17) - -2120073258;
            int cfr_ignored_1 = (int)(0xB515CE3827D4EB4FL ^ (long)n ^ 0x6100831A2DB8C7FAL);
        }
        tkhd2_2.zat();
    }

    private static void hks_2(bghs bghs2) {
        int n = -55504328;
        n = Integer.rotateLeft(n * -1141587351, 18) ^ 0x6085750F;
        bghs bghs3 = bghs2;
        n = Integer.rotateLeft((bghs3 != null ? System.identityHashCode(bghs3) : 0) ^ n, 19);
        int n2 = n ^ 0xCA3F60EF;
        if ((n2 ^ n) != -901816081) {
            int cfr_ignored_0 = (0x368E72D7 ^ n) - -776838662;
        }
        bghs2.tzh_8();
    }

    private static void thqw(tkhd_2 tkhd2_2) {
        int n = -479615922;
        n = Integer.rotateLeft(n * -503037953, 16) ^ 0x9B0B2B40;
        tkhd_2 tkhd3 = tkhd2_2;
        n = (tkhd3 != null ? System.identityHashCode(tkhd3) : 0) ^ n;
        int n2 = n ^ 0x325D9B88;
        if ((n2 ^ n) != 844995464) {
            int cfr_ignored_0 = (0xD1343FC6 ^ n) - -208127318;
        }
        tkhd2_2.zat();
    }

    private static void shdh_8(tkhd_2 tkhd2_2) {
        int n = 718261441;
        n = Integer.rotateLeft(n * 152272043, 14) ^ 0x9D0DE69F;
        tkhd_2 tkhd3 = tkhd2_2;
        n = (tkhd3 != null ? System.identityHashCode(tkhd3) : 0) ^ n;
        int n2 = n ^ 0x271EBA2E;
        if ((n2 ^ n) != 656325166) {
            int cfr_ignored_0 = (0xDD176EF ^ n) - 1672148858;
        }
        tkhd2_2.zat();
    }

    private static void khbd_2(bghs bghs2) {
        int n = 1415481958;
        n = Integer.rotateLeft(n * 49197621, 16) ^ 0xD696640A;
        bghs bghs3 = bghs2;
        n = Integer.rotateLeft((bghs3 != null ? System.identityHashCode(bghs3) : 0) ^ n, 27);
        int n2 = n ^ 0x2A916B5A;
        if ((n2 ^ n) != 714173274) {
            int cfr_ignored_0 = (0x7ECFE13C ^ n) - 320742908;
        }
        bghs2.tzh_8();
    }

    private static class_634 bad_2(class_310 class_3102) {
        block0: {
            int n = 1421848977;
            int n2 = (n = Integer.rotateLeft(n * 2052225799, 12) ^ 0xC48D4673) ^ 0x7FDEF170;
            if ((n2 ^ n) == 2145317232) break block0;
            int cfr_ignored_0 = (0x2B6140E1 ^ n) + -783596131;
        }
        return class_3102.method_1562();
    }

    private static String[] sghl_2(String string) {
        block0: {
            int n = -1343112784;
            int n2 = (n = Integer.rotateLeft(n * -930856401, 18) ^ 0x80147507) ^ 0x4405D71F;
            if ((n2 ^ n) == 1141233439) break block0;
            int cfr_ignored_0 = (0xEBF46EAF ^ n) + 1968887499;
        }
        return string.split("\u0002\u000e", -1);
    }

    private static CallSite bht_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -990381155;
            n3 = Integer.rotateLeft(n3 * 869296231, 10) ^ 0xEF54CD2C;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x9132F5B3;
            if ((n4 ^ n3) != -1858931277) {
                int cfr_ignored_0 = (0x55C50E2E ^ n3) - 773120465;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ shqz ^ string.hashCode()) + (n2 + rhgh_2) + i ^ shqz, 7) + rhgh_2);
            }
            String[] stringArray = bghs.sghl_2(new String(cArray));
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

    private static String[] old0bymeu(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite bbg7gdhntdvpbb(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ x6b1667rk8tt ^ string.hashCode() ^ n2 + x6f29te ^ i * 405331683 ^ x6b1667rk8tt, 16) ^ x6f29te));
            }
            String[] stringArray = bghs.old0bymeu(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

