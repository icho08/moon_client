/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1268
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1747
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1819
 *  net.minecraft.class_1922
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_304
 *  net.minecraft.class_3966
 *  net.minecraft.class_6880
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import lombok.Generated;
import net.minecraft.class_1268;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1819;
import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_304;
import net.minecraft.class_3966;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.Nr;
import us.m0vy.moondlc.m0vyguard.bsr_2;
import us.m0vy.moondlc.m0vyguard.bghj;
import us.m0vy.moondlc.m0vyguard.bls_2;
import us.m0vy.moondlc.m0vyguard.bhdh_2;
import us.m0vy.moondlc.m0vyguard.js_2;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.rj;
import us.m0vy.moondlc.m0vyguard.rsh_3;
import us.m0vy.moondlc.m0vyguard.sw;
import us.m0vy.moondlc.m0vyguard.at_3;
import us.m0vy.moondlc.m0vyguard.fa;
import us.m0vy.moondlc.m0vyguard.kf;
import us.m0vy.moondlc.m0vyguard.lkh;
import us.m0vy.moondlc.m0vyguard.lq;
import us.m0vy.moondlc.m0vyguard.ngh;
import us.m0vy.moondlc.m0vyguard.hm_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class tzr
implements dl {
    private static final long khsa_3 = 380L;
    private static final long zh_2 = 180L;
    private static final long jrk = 260L;
    private final rsh_3 tagh_2 = new rsh_3();
    private final at_3 shdj = new at_3(hm_2.rshf);
    private final lkh bash = new lkh();
    private long zfd_2 = 0x362CE53D09CC965AL ^ 0xC9D31AC2F63369A5L;
    private int hbj = 0x64EC706A ^ 0xE4EC706A;
    private bhdh_2 hw_2;
    private static final int jsl_2 = 1677471517;
    private static final int shas_4 = -1724016427;
    private static final int stb_2 = 1127991351;
    private static final int tdhm = -1283741605;
    private static final int upgzmtg26 = -1559611984;
    private static final int r7yjlzw8uu = 715576803;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int acv432cafk8uq;

    public tzr() {
        bsr_2.dhtsh_2().jkhh_2(new lq(1, this::tqj));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void dhshr() {
        class_1657 class_16572;
        class_1309 class_13092;
        hm_2 hm2;
        int n = 673893695;
        int n2 = (n = Integer.rotateLeft(n * -351663453, 12) ^ 0x42E11B17) ^ 0x2894FC9C;
        if ((n2 ^ n) != 680852636) {
            int cfr_ignored_0 = (0xBE31A3 ^ n) + -1750303700;
        }
        if (this.hw_2 == null || this.hw_2.khkhdh == null || tzr.mc.field_1724 == null || tzr.mc.field_1761 == null) {
            this.ssa_5();
            return;
        }
        bls_2 bls2 = bls_2.tzy_3();
        if (bls2 == null) {
            hm2 = hm_2.say;
        } else {
            String string = bls2.ghah_3().sdh_2().getName();
            int n3 = -1;
            switch (string.hashCode()) {
                case -1911998296: {
                    if (!tzr.sghh_3(string, "Packet")) break;
                    n3 = 0;
                    break;
                }
                case 73298841: {
                    if (!string.equals("Legit")) break;
                    n3 = 1;
                }
            }
            switch (n3) {
                case 0: {
                    hm2 = hm_2.dzh;
                    break;
                }
                case 1: {
                    hm2 = hm_2.rshf;
                    break;
                }
                default: {
                    hm2 = hm_2.say;
                }
            }
        }
        this.shdj.dqm = hm2;
        boolean bl = this.bdhdh();
        if (!bl) {
            return;
        }
        if (this.shdhj(tzr.dhghs_2(this))) {
            return;
        }
        if (tzr.mc.field_1724.method_6039() && this.hw_2.thwd) {
            tzr.mc.field_1761.method_2897((class_1657)tzr.mc.field_1724);
        }
        if (this.hw_2.zls && (class_13092 = this.hw_2.khkhdh) instanceof class_1657 && this.bash.thh_2(class_16572 = (class_1657)class_13092, this.hw_2.bssh)) {
            this.ghtt_4();
            return;
        }
        this.rfl();
        Nr.nbh();
        try {
            tzr.mc.field_1761.method_2918((class_1657)tzr.mc.field_1724, (class_1297)this.hw_2.khkhdh);
            tzr.jghz(tzr.mc.field_1724, class_1268.field_5808);
        }
        catch (Throwable throwable) {
            tzr.rhz_4();
            throw throwable;
        }
        Nr.ndk();
        this.ghtt_4();
        tzr.jsz_2(this);
    }

    public boolean bdhdh() {
        boolean bl;
        int n = js_2.aa(-1795632183);
        int n2 = n ^ 0x64731210;
        if ((n2 ^ n) != 1685262864) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xF08BC1D9 ^ n, 17) + 625612930) * -259276327;
            int cfr_ignored_1 = (int)(0x32396FE427D4EB4FL ^ (long)n ^ 0x22B8831A2DB9C9A3L);
        }
        if (this.hw_2 == null || this.hw_2.khkhdh == null || tzr.mc.field_1724 == null || tzr.mc.field_1687 == null || tzr.mc.field_1761 == null) {
            this.ssa_5();
            return false;
        }
        if (tzr.khghq(this)) {
            this.ssa_5();
            return false;
        }
        if (tzr.hdy_2(this)) {
            tzr.szd_3(this);
            return false;
        }
        boolean bl2 = bl = tzr.thdb(this) || this.bkn();
        if (bl) {
            tzr.khdhj(this);
        }
        if (this.hw_2.khjs_2) {
            return bl;
        }
        if (this.hw_2.bsd_3) {
            if (bl) {
                return true;
            }
            if (!this.saz() && !tzr.mc.field_1724.method_24828()) {
                this.abs_2(0x5EB532B272556254L ^ 0x5EB532B2725562E0L);
                return false;
            }
            return !tzr.thrw(this);
        }
        return true;
    }

    private boolean zthf() {
        int n = -736426286;
        int n2 = (n = Integer.rotateLeft(n * -1830294885, 11) ^ 0x4EB8C0DC) ^ 0x6B1B3BA4;
        if ((n2 ^ n) != 1796946852) {
            int cfr_ignored_0 = (0xBF003D76 ^ n) + 1981188521;
        }
        return this.hw_2.sthm && tzr.shat_3() || this.hw_2.dla && tzr.bzsh(this) || this.hw_2.shf_4 && tzr.mc.field_1724.method_5771() || this.hw_2.rdhn && (tzr.mc.field_1724.method_5799() || tzr.mc.field_1724.method_5869()) || this.hw_2.bshm && kf.zws() || this.hw_2.zqw && this.zkb() || this.hw_2.sham_2 && tzr.shhz_3(this);
    }

    private boolean zzf_4() {
        int n = 1528596222;
        n = Integer.rotateLeft(n * 532953937, 4) ^ 0x661239F9;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xB0E61254;
        if ((n2 ^ n) != -1327099308) {
            int cfr_ignored_0 = (0xEBFA94AA ^ n) - 909324287;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return tzr.mc.field_1724.method_6115() && tzr.mc.field_1724.method_6030().method_7909() instanceof class_1819;
    }

    private boolean zkb() {
        int n = js_2.aa(1355283349);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 7);
        int n2 = n ^ 0x87D3F6E0;
        if ((n2 ^ n) != -2016151840) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xD7140D75 ^ n, 13) - 264978534) * -686551691;
            int cfr_ignored_1 = (int)(0x15A6A34827D4EB4FL ^ (long)n ^ 0xBBE0831A2DB9869CL);
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (tzr.mc.field_1761 != null && tzr.mc.field_1761.method_2923()) {
            return true;
        }
        return tzr.zdhm_2(tzr.mc.field_1690.field_1886) && tzr.mc.field_1765 != null && tzr.mc.field_1765.method_17783() == class_239.class_240.field_1332;
    }

    private boolean bkhl() {
        int n = -531945121;
        n = Integer.rotateLeft(n * -1292315313, 5) ^ 0x2D401B1B;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x60D62ADB;
        if ((n2 ^ n) != 1624648411) {
            int cfr_ignored_0 = (0x809D0384 ^ n) + 550920070;
        }
        boolean bl = bghj.tdhj_2().shhf() || sw.thdt_4();
        boolean bl2 = tzr.bkf(tzr.mc.field_1724).method_7909() instanceof class_1747 || tzr.sqr(tzr.mc.field_1724.method_6079()) instanceof class_1747;
        return bl || tzr.mc.field_1690.field_1904.method_1434() && bl2;
    }

    private boolean shdhj(class_1297 class_12972) {
        return this.hw_2.jzj_2 && class_12972 != this.hw_2.khkhdh;
    }

    private boolean bsm() {
        try {
            int n = -2105871976;
            n = Integer.rotateLeft(n * 611270853, 15) ^ 0xC1AB74AC;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x94256221;
            if ((n2 ^ n) != -1809489375) {
                int cfr_ignored_0 = (0x165F93B9 ^ n) + -672484074;
            }
            if ((0x293 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (this.hw_2.sal_2) {
            int n = !this.tagh_2.rdm(this.hw_2.rwd_2) ? 1 : 0;
            if (yf.tdhth_2() == 0) {
                n = n ^ 0x74E4;
            }
            return n != 0;
        }
        return !this.tagh_2.dghq_2(this.hw_2.rwd_2);
    }

    private boolean snm() {
        int n = 1400506313;
        int n2 = (n = Integer.rotateLeft(n * -772704251, 6) ^ 0x9925E268) ^ 0x5F459F18;
        if ((n2 ^ n) != 1598398232) {
            int cfr_ignored_0 = (0xC3F98D1 ^ n) - -307871323;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return !tzr.mc.field_1724.method_24828() && tzr.mc.field_1724.field_6017 > 0.0f && !tzr.khnz_2(this);
    }

    private boolean bkn() {
        int n = 1831263611;
        n = Integer.rotateLeft(n * -1743705351, 24) ^ 0x13F9D5EB;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 2);
        int n2 = n ^ 0x807A7D7F;
        if ((n2 ^ n) != -2139456129) {
            int cfr_ignored_0 = (0xED5CA004 ^ n) + 1053533367;
        }
        if (!this.hw_2.zyb) {
            int n3 = 0;
            if (tzr.bhj() == 0) {
                n3 = n3 ^ 0xD4AB;
            }
            return n3 != 0;
        }
        Nr nr = tzr.shft_2();
        if (nr == null || !nr.rgha_2()) {
            return false;
        }
        if (tzr.dmkh(nr).dhbn("Web Lag")) {
            return nr.nU();
        }
        return tzr.mc.field_1724.method_24828() && nr.nU();
    }

    private void rfl() {
        int n = 0;
        int n2 = 355324564;
        n2 = Integer.rotateLeft(n2 * -1490054417, 8) ^ 0x237D4F71;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (-108838505 * 1293462781 + 1713640861 ^ n2) + -1355760780 - -1355760780;
        block36: while (true) {
            switch (((n3 ^ n2) - 1713640861) * -946483115) {
                case 873497071: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x921D63A ^ n2, 4) + 527863873) * 153212475;
                    return;
                }
                case -656886772: {
                    int cfr_ignored_1 = (Integer.rotateLeft(0x8A6B1E9C ^ n2, 4) - -950643681) * -1972691299;
                    Nr.nfI().ngu();
                    n3 = Integer.reverse(Integer.reverse(873497071 * 1293462781 + 1713640861 ^ n2));
                    n += 4;
                    continue block36;
                }
                case -108838505: {
                    int cfr_ignored_2 = (Integer.rotateRight(0xB4F90DBE ^ n2, 9) - -293189315) * -1258746433;
                    if (this.snm()) {
                        try {
                            if ((0xCFEC9CC989D58869L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n3 = Integer.reverse(Integer.reverse(873497071 * 1293462781 + 1713640861 ^ n2));
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = (int)((long)(873497071 * 1293462781 + 1713640861 ^ n2) ^ 0xED94F5D884821928L ^ 0xED94F5D884821928L);
                        }
                        n += 3;
                        continue block36;
                    }
                    n3 = 669003780 * 1293462781 + 1713640861 ^ n2;
                    int cfr_ignored_3 = (Integer.rotateRight(0x73EF9836 ^ n2, 17) - 241241541) * 1945081911;
                    continue block36;
                }
                case 669003780: {
                    int cfr_ignored_4 = (Integer.rotateRight(0x3BAB8652 ^ n2, 10) + 1042473769) * 1001096787;
                    if (!this.bkn()) {
                        try {
                            n += 4;
                            if ((0xA69AD50D7DC022D1L ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = (873497071 * 1293462781 + 1713640861 ^ n2) + -848848794 - -848848794;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = Integer.reverse(Integer.reverse(873497071 * 1293462781 + 1713640861 ^ n2));
                        }
                        n += 5;
                        continue block36;
                    }
                    try {
                        n += 2;
                        n3 = Integer.reverse(Integer.reverse(-656886772 * 1293462781 + 1713640861 ^ n2));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse(-656886772 * 1293462781 + 1713640861 ^ n2));
                    }
                    n += 4;
                    continue block36;
                }
                case 121663658: {
                    int cfr_ignored_5 = (Integer.rotateLeft(0xDD8FE2BC ^ n2, 14) - -657845249) * -577772867;
                    n3 = Integer.reverse(Integer.reverse(-815509612 * 1293462781 + 1713640861 ^ n2));
                    int cfr_ignored_6 = Integer.rotateLeft(0xEC051608 ^ n2, 16) + -1728361933;
                    try {
                        if ((0x454A64931168E7EBL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (int)((long)(-108838505 * 1293462781 + 1713640861 ^ n2) ^ 0x3EA616C5BC83FF6AL ^ 0x3EA616C5BC83FF6AL);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (int)((long)(-108838505 * 1293462781 + 1713640861 ^ n2) ^ 0xAD70EDC988812F52L ^ 0xAD70EDC988812F52L);
                    }
                    continue block36;
                }
                case 745937040: {
                    int cfr_ignored_7 = (Integer.rotateRight(0x56C3D7F3 ^ n2, 13) + -2045459032) * 1455675379;
                    try {
                        n += 5;
                        n3 = (int)((long)(-108838505 * 1293462781 + 1713640861 ^ n2) ^ 0x2B603F77ACC77CB7L ^ 0x2B603F77ACC77CB7L);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (-108838505 * 1293462781 + 1713640861 ^ n2) + 188451780 - 188451780;
                    }
                    n -= 4;
                    continue block36;
                }
                case -1611723219: {
                    int cfr_ignored_8 = Integer.rotateLeft(0x5A38A42D ^ n2, 14) - -247889746;
                    int cfr_ignored_9 = (int)(0x988A0A1027D4EB4FL ^ (long)n2 ^ 0xE950831A2DB89CC5L);
                    n3 = -185134209 * 1293462781 + 1713640861 ^ n2 ^ 0xD1601FF3 ^ 0xD1601FF3;
                    int cfr_ignored_10 = Integer.rotateRight(0xF45512C7 ^ n2, 17) - -1700076204;
                    n3 = Integer.reverse(Integer.reverse(-108838505 * 1293462781 + 1713640861 ^ n2));
                    ++n;
                    continue block36;
                }
                case 1301793702: {
                    int cfr_ignored_11 = (Integer.rotateRight(0xFCFB955B ^ n2, 18) + -1496009408) * -50621093;
                    try {
                        n += 4;
                        n3 = (int)((long)(-108838505 * 1293462781 + 1713640861 ^ n2) ^ 0xE4A7BF31B1144012L ^ 0xE4A7BF31B1144012L);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = -108838505 * 1293462781 + 1713640861 ^ n2 ^ 0x3A2FF34F ^ 0x3A2FF34F;
                    }
                    continue block36;
                }
                case 260967388: {
                    int cfr_ignored_12 = (Integer.rotateLeft(0xB1D69758 ^ n2, 9) + -1923484957) * -1311336615;
                    n3 = -694116593 * 1293462781 + 1713640861 ^ n2 ^ 0xD88D6D5D ^ 0xD88D6D5D;
                    int cfr_ignored_13 = (Integer.rotateRight(0x35DDD8B3 ^ n2, 9) + -1975853848) * 903731379;
                    try {
                        --n;
                        n3 = (int)((long)(-108838505 * 1293462781 + 1713640861 ^ n2) ^ 0x385B934304662382L ^ 0x385B934304662382L);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = -108838505 * 1293462781 + 1713640861 ^ n2 ^ 0xADBC98D7 ^ 0xADBC98D7;
                    }
                    continue block36;
                }
                case 148241682: {
                    int cfr_ignored_14 = Integer.rotateRight(0xBA9BEAAE ^ n2, 10) - -1656812979;
                    n3 = Integer.reverse(Integer.reverse(-2111533070 * 1293462781 + 1713640861 ^ n2));
                    int cfr_ignored_15 = (Integer.rotateRight(0x14E1125A ^ n2, 5) + -1952524255) * 350294619;
                    try {
                        n += 2;
                        n3 = -108838505 * 1293462781 + 1713640861 ^ n2 ^ 0x2074EC73 ^ 0x2074EC73;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(-108838505 * 1293462781 + 1713640861 ^ n2));
                    }
                    continue block36;
                }
                case -2123413050: {
                    int cfr_ignored_16 = Integer.rotateLeft(0x2063C521 ^ n2, 7) + -260932038;
                    int cfr_ignored_17 = (int)(0xE2D16B1C27D4EB4FL ^ (long)n2 ^ 0x2B48831A2DB86873L);
                    n3 = Integer.reverse(Integer.reverse(-108838505 * 1293462781 + 1713640861 ^ n2));
                    --n;
                    continue block36;
                }
                case -1869727063: {
                    int cfr_ignored_18 = Integer.rotateRight(0xA777A963 ^ n2, 7) + 1272652344;
                    try {
                        n += 5;
                        n3 = (int)((long)(-108838505 * 1293462781 + 1713640861 ^ n2) ^ 0x3BBA555A4DC97532L ^ 0x3BBA555A4DC97532L);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = -108838505 * 1293462781 + 1713640861 ^ n2;
                    }
                    n -= 3;
                    continue block36;
                }
                case 1870111593: {
                    int cfr_ignored_19 = Integer.rotateRight(0x413BCE82 ^ n2, 11) + -358899463;
                    n3 = (int)((long)(535920993 * 1293462781 + 1713640861 ^ n2) ^ 0xB06FC1E4A840E41AL ^ 0xB06FC1E4A840E41AL);
                    int cfr_ignored_20 = Integer.rotateLeft(0x20516668 ^ n2, 7) + -298252845;
                    int cfr_ignored_21 = (int)(0x629470FAA78E5B5CL ^ (long)n2 ^ 0x1C8583AF4D9F68F9L);
                    n3 = (581258315 * 1293462781 + 1713640861 ^ n2) + -688430332 - -688430332;
                    int cfr_ignored_22 = (int)(0x245D737193391909L ^ (long)n2 ^ 0x1B93EAC1C935E56BL);
                    n3 = (int)((long)(-108838505 * 1293462781 + 1713640861 ^ n2) ^ 0xC13892AE65827FCFL ^ 0xC13892AE65827FCFL);
                    n -= 4;
                    continue block36;
                }
                case 1476530961: {
                    int cfr_ignored_23 = (Integer.rotateRight(0x7B5BB21E ^ n2, 18) - -193449763) * 2069606943;
                    try {
                        n += 5;
                        n3 = (-108838505 * 1293462781 + 1713640861 ^ n2) + -1824264107 - -1824264107;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)(-108838505 * 1293462781 + 1713640861 ^ n2) ^ 0x6AEE76A4983D9ECDL ^ 0x6AEE76A4983D9ECDL);
                    }
                    n += 5;
                    continue block36;
                }
            }
            int cfr_ignored_24 = Integer.rotateRight(0x3617458F ^ n2, 9) - -1859187828;
            n3 = -108838505 * 1293462781 + 1713640861 ^ n2 ^ 0xD1CB44B0 ^ 0xD1CB44B0;
        }
    }

    private boolean khb() {
        try {
            int n = -88235167;
            n = Integer.rotateLeft(n * 1018559609, 9) ^ 0x404EDAF9;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x19A10EDB;
            if ((n2 ^ n) != 429985499) {
                int cfr_ignored_0 = (0xE31CADBA ^ n) - 1159921553;
            }
            if ((0x19A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (this.saz()) {
            this.ssa_5();
            return false;
        }
        boolean bl = tzr.thjr(tzr.mc.field_1690.field_1903);
        boolean bl2 = !tzr.mc.field_1724.method_24828();
        boolean bl3 = this.khshs();
        if (!(bl2 || bl && bl3)) {
            this.ssa_5();
            return false;
        }
        Nr nr = Nr.nfI();
        if (nr != null && nr.rgha_2() && nr.neP().dhbn("Web Lag") && tzr.dhad_3() && (!tzr.srsh_2(tzr.mc.field_1724) || nr.nU())) {
            return tzr.dqd_2(this, 0xDBC10FA2817C36BAL ^ 0xDBC10FA2817C360EL);
        }
        long l = bl3 ? 0xAB2C30E5611EA268L ^ 0xAB2C30E5611EA36CL : (bl ? 0xB23C662532627861L ^ 0xB23C66253262791DL : 0x34C90A3DAA948AEEL ^ 0x34C90A3DAA948A5AL);
        return this.abs_2(l);
    }

    private boolean abs_2(long l) {
        long l2 = 0L;
        int n = 0;
        boolean bl = false;
        int n2 = 0;
        int n3 = -2046435247;
        n3 = Integer.rotateLeft(n3 * -1428139337, 27) ^ 0x7C5AB0E3;
        n3 = Integer.rotateRight(System.identityHashCode(this) ^ n3, 28);
        n3 = (int)l ^ n3;
        int n4 = (-108990121 * 1086465723 + 1489105015 ^ n3) + -1171517524 - -1171517524;
        block37: while (true) {
            switch (((n4 ^ n3) - 1489105015) * -2016858509) {
                case 212072624: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x17E36816 ^ n3, 5) - -387499547) * 400779287;
                    if (this.hbj != n) {
                        n4 = (1574332187 * 1086465723 + 1489105015 ^ n3) + 1440087350 - 1440087350;
                        int cfr_ignored_1 = Integer.rotateLeft(0x6AB438E8 ^ n3, 16) + -265256109;
                        n4 = -943200920 * 1086465723 + 1489105015 ^ n3;
                        continue block37;
                    }
                    try {
                        if ((0x2833D6E9CEFF8A45L ^ (long)n3 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n4 = (int)((long)(1563719014 * 1086465723 + 1489105015 ^ n3) ^ 0x969CDA95B9CFB62BL ^ 0x969CDA95B9CFB62BL);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n4 = 1563719014 * 1086465723 + 1489105015 ^ n3;
                    }
                    continue block37;
                }
                case -943200920: {
                    int cfr_ignored_2 = Integer.rotateRight(0x63F9D987 ^ n3, 15) - 530511508;
                    this.zfd_2 = l2;
                    this.hbj = n;
                    bl = true;
                    try {
                        if ((0x3CE39C7B93C834D1L ^ (long)n3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n4 = (int)((long)(-1947373105 * 1086465723 + 1489105015 ^ n3) ^ 0x9012737273301FE1L ^ 0x9012737273301FE1L);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n4 = -1947373105 * 1086465723 + 1489105015 ^ n3;
                    }
                    n2 += 4;
                    continue block37;
                }
                case 974527532: {
                    int cfr_ignored_3 = Integer.rotateLeft(0x4A2B8BC5 ^ n3, 12) - -6058986;
                    int cfr_ignored_4 = (int)(0x889925F827D4EB4FL ^ (long)n3 ^ 0xB680831A2DB8BCE3L);
                    this.ssa_5();
                    bl = false;
                    int cfr_ignored_5 = (int)(0xAA74103C191B9E82L ^ (long)n3 ^ 0xDD08FE84C622F939L);
                    n4 = (-1800156630 * 1086465723 + 1489105015 ^ n3) + 437626001 - 437626001;
                    int cfr_ignored_6 = (int)(0x3E24CE146A2F0EA5L ^ (long)n3 ^ 0x615818EDE66DD198L);
                    n4 = Integer.reverse(Integer.reverse(-1947373105 * 1086465723 + 1489105015 ^ n3));
                    n2 += 5;
                    continue block37;
                }
                case 764953230: {
                    int cfr_ignored_7 = (Integer.rotateRight(0xB34C0D36 ^ n3, 9) - -1164756795) * -1286861513;
                    bl = true;
                    n4 = (int)((long)(-1947373105 * 1086465723 + 1489105015 ^ n3) ^ 0xFD0DE4D72BBAE62L ^ 0xFD0DE4D72BBAE62L);
                    int cfr_ignored_8 = Integer.rotateRight(0x78BE16A ^ n3, 3) + -296883439;
                    n2 += 4;
                    continue block37;
                }
                case -1910828401: {
                    int cfr_ignored_9 = (Integer.rotateRight(0x93CD07FB ^ n3, 5) + -365848928) * -1815279621;
                    bl = true;
                    n4 = (553128063 * 1086465723 + 1489105015 ^ n3) + -390438972 - -390438972;
                    int cfr_ignored_10 = Integer.rotateLeft(0x3FD1E880 ^ n3, 10) + -1094138181;
                    n4 = -1947373105 * 1086465723 + 1489105015 ^ n3 ^ 0x9E0E29C8 ^ 0x9E0E29C8;
                    continue block37;
                }
                case 1563719014: {
                    int cfr_ignored_11 = Integer.rotateRight(0xCBB892E3 ^ n3, 12) + -1346934600;
                    if (l2 - this.zfd_2 <= l) {
                        n4 = (-1837096774 * 1086465723 + 1489105015 ^ n3) + 1912522047 - 1912522047;
                        int cfr_ignored_12 = (Integer.rotateLeft(0xC9F83DD1 ^ n3, 12) + 2037193610) * -906478127;
                        int cfr_ignored_13 = (int)(0xB4A93EC27D4EB4FL ^ (long)n3 ^ 0xDAA8831A2DB9BB44L);
                        n4 = Integer.reverse(Integer.reverse(-1910828401 * 1086465723 + 1489105015 ^ n3));
                        continue block37;
                    }
                    n4 = 1964621857 * 1086465723 + 1489105015 ^ n3;
                    int cfr_ignored_14 = (Integer.rotateRight(0xB46EC7BE ^ n3, 9) - -574107843) * -1267808321;
                    n4 = 974527532 * 1086465723 + 1489105015 ^ n3 ^ 0x9DC26939 ^ 0x9DC26939;
                    n2 -= 4;
                    continue block37;
                }
                case -108990121: {
                    int cfr_ignored_15 = Integer.rotateLeft(0xE91CB964 ^ n3, 16) - 1054347863;
                    l2 = System.currentTimeMillis();
                    n = this.hw_2.khkhdh.method_5628();
                    if (this.zfd_2 != (0x651696961D49F5A4L ^ 0x9AE96969E2B60A5BL)) {
                        try {
                            n2 -= 4;
                            if ((0x45CFC838535FB433L ^ (long)n3 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n4 = 212072624 * 1086465723 + 1489105015 ^ n3 ^ 0x600BE017 ^ 0x600BE017;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n4 = (int)((long)(212072624 * 1086465723 + 1489105015 ^ n3) ^ 0x28875F6238908D82L ^ 0x28875F6238908D82L);
                        }
                        n2 -= 5;
                        continue block37;
                    }
                    n4 = -943200920 * 1086465723 + 1489105015 ^ n3;
                    int cfr_ignored_16 = Integer.rotateLeft(0x5779AF29 ^ n3, 13) + -1676028622;
                    int cfr_ignored_17 = (int)(0x95CB011427D4EB4FL ^ (long)n3 ^ 0xFF58831A2DB88647L);
                    n2 += 4;
                    continue block37;
                }
                case -1498082249: {
                    int cfr_ignored_18 = (Integer.rotateRight(0x6D683593 ^ n3, 16) + 1140595720) * 1835546003;
                    n4 = 293084870 * 1086465723 + 1489105015 ^ n3;
                    int cfr_ignored_19 = Integer.rotateRight(0x91423CA3 ^ n3, 5) + -1688013064;
                    n4 = (int)((long)(-108990121 * 1086465723 + 1489105015 ^ n3) ^ 0x650286663636D630L ^ 0x650286663636D630L);
                    n2 += 2;
                    continue block37;
                }
                case -223012238: {
                    int cfr_ignored_20 = (Integer.rotateRight(0xA877D8DF ^ n3, 8) - 1793122876) * -1468540705;
                    try {
                        n2 -= 5;
                        if ((0x309CC6AD701C249L ^ (long)n3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n4 = (-108990121 * 1086465723 + 1489105015 ^ n3) + 911565164 - 911565164;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n4 = Integer.reverse(Integer.reverse(-108990121 * 1086465723 + 1489105015 ^ n3));
                    }
                    continue block37;
                }
                case -1959156780: {
                    int cfr_ignored_21 = Integer.rotateLeft(0x5A78A5CC ^ n3, 14) - -117853457;
                    n4 = (int)((long)(-1022138556 * 1086465723 + 1489105015 ^ n3) ^ 0x83944EE08755F2D4L ^ 0x83944EE08755F2D4L);
                    int cfr_ignored_22 = Integer.rotateRight(0x8C5CA903 ^ n3, 4) + 60167832;
                    n4 = -79537030 * 1086465723 + 1489105015 ^ n3 ^ 0x7411BE68 ^ 0x7411BE68;
                    int cfr_ignored_23 = (Integer.rotateLeft(0xECBBB1B5 ^ n3, 16) - -1357372378) * -323243595;
                    int cfr_ignored_24 = (int)(0x2E091F8827D4EB4FL ^ (long)n3 ^ 0xC260831A2DB9F1C3L);
                    n4 = -108990121 * 1086465723 + 1489105015 ^ n3;
                    n2 += 4;
                    continue block37;
                }
                case 121376518: {
                    int cfr_ignored_25 = (Integer.rotateRight(0xAEFADD5B ^ n3, 8) + 884895040) * -1359291045;
                    try {
                        if ((0xEBF0DA9ACF8BD11BL ^ (long)n3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n4 = -108990121 * 1086465723 + 1489105015 ^ n3 ^ 0xE5009B86 ^ 0xE5009B86;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n4 = -108990121 * 1086465723 + 1489105015 ^ n3;
                    }
                    continue block37;
                }
                case 1228937380: {
                    int cfr_ignored_26 = Integer.rotateRight(0x2D4E7C2F ^ n3, 8) - -2132891412;
                    n4 = -1253779421 * 1086465723 + 1489105015 ^ n3 ^ 0xEEE82741 ^ 0xEEE82741;
                    int cfr_ignored_27 = Integer.rotateRight(0xE0CA5B82 ^ n3, 15) + 1021228025;
                    int cfr_ignored_28 = (int)(0x5E676A6B6FF1D24FL ^ (long)n3 ^ 0x29A613505FB9111FL);
                    n4 = (int)((long)(-108990121 * 1086465723 + 1489105015 ^ n3) ^ 0x16889B06A8BFE59AL ^ 0x16889B06A8BFE59AL);
                    --n2;
                    continue block37;
                }
                case 413555009: {
                    int cfr_ignored_29 = Integer.rotateRight(0x1FD0F2A7 ^ n3, 6) - -559218316;
                    int cfr_ignored_30 = (int)(0xB67AF6BD964BD0F2L ^ (long)n3 ^ 0x100BE0245AC2C124L);
                    n4 = (int)((long)(400766470 * 1086465723 + 1489105015 ^ n3) ^ 0xD013F159A8FEF9E0L ^ 0xD013F159A8FEF9E0L);
                    int cfr_ignored_31 = (int)(0xC535C97C27F00AF1L ^ (long)n3 ^ 0x6F888353EEC427BAL);
                    n4 = -108990121 * 1086465723 + 1489105015 ^ n3 ^ 0x396720EE ^ 0x396720EE;
                    n2 += 2;
                    continue block37;
                }
                case 1623589869: {
                    int cfr_ignored_32 = (Integer.rotateLeft(0x221A6E18 ^ n3, 7) + 630256675) * 572157465;
                    n4 = (1492553676 * 1086465723 + 1489105015 ^ n3) + 1472027340 - 1472027340;
                    int cfr_ignored_33 = Integer.rotateRight(0x1DD9434A ^ n3, 6) + -1582512847;
                    n4 = -1996904838 * 1086465723 + 1489105015 ^ n3 ^ 0x9A34A11C ^ 0x9A34A11C;
                    int cfr_ignored_34 = Integer.rotateRight(0xC016783 ^ n3, 4) + 2022254616;
                    n4 = (int)((long)(-108990121 * 1086465723 + 1489105015 ^ n3) ^ 0x15B5300B82F3BBDCL ^ 0x15B5300B82F3BBDCL);
                    ++n2;
                    continue block37;
                }
                case -850157078: {
                    int cfr_ignored_35 = Integer.rotateRight(0x65DA730B ^ n3, 15) + 1506905488;
                    try {
                        n2 += 3;
                        if ((0x8908193D8C192E19L ^ (long)n3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n4 = -108990121 * 1086465723 + 1489105015 ^ n3 ^ 0xEF6FEACE ^ 0xEF6FEACE;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n4 = -108990121 * 1086465723 + 1489105015 ^ n3 ^ 0x5D02F5AC ^ 0x5D02F5AC;
                    }
                    n2 += 5;
                    continue block37;
                }
                case -578689480: {
                    int cfr_ignored_36 = (Integer.rotateLeft(0xBDD240D5 ^ n3, 10) - 13859078) * -1110294315;
                    int cfr_ignored_37 = (int)(0x7F60EEE827D4EB4FL ^ (long)n3 ^ 0x20A0831A2DB95310L);
                    int cfr_ignored_38 = (int)(0xDD6B8A171F4A639CL ^ (long)n3 ^ 0xE95EF2273C1E1706L);
                    n4 = Integer.reverse(Integer.reverse(-108990121 * 1086465723 + 1489105015 ^ n3));
                    n2 -= 3;
                    continue block37;
                }
                case -1204320441: {
                    int cfr_ignored_39 = Integer.rotateLeft(0xFE0C0C29 ^ n3, 18) + -942467022;
                    int cfr_ignored_40 = (int)(0x3CBEA21427D4EB4FL ^ (long)n3 ^ 0xB958831A2DB9D4ACL);
                    n4 = -1145985661 * 1086465723 + 1489105015 ^ n3 ^ 0x89F6B309 ^ 0x89F6B309;
                    int cfr_ignored_41 = Integer.rotateRight(0xED47B967 ^ n3, 16) - -1072885068;
                    int cfr_ignored_42 = (int)(0x4BA6937E8BCC4F6BL ^ (long)n3 ^ 0xDB8DDB2B65F13A9CL);
                    n4 = -108990121 * 1086465723 + 1489105015 ^ n3 ^ 0x679760BE ^ 0x679760BE;
                    n2 -= 2;
                    continue block37;
                }
                case -724155399: {
                    int cfr_ignored_43 = Integer.rotateRight(0xF9E85F42 ^ n3, 18) + 1199646777;
                    try {
                        n4 = -108990121 * 1086465723 + 1489105015 ^ n3 ^ 0x29558B36 ^ 0x29558B36;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n4 = Integer.reverse(Integer.reverse(-108990121 * 1086465723 + 1489105015 ^ n3));
                    }
                    continue block37;
                }
                case -631206129: {
                    int cfr_ignored_44 = (Integer.rotateRight(0x858D7C32 ^ n3, 3) + 813672777) * -2054325197;
                    n4 = 1079566918 * 1086465723 + 1489105015 ^ n3 ^ 0xDE7C496 ^ 0xDE7C496;
                    int cfr_ignored_45 = (Integer.rotateLeft(0x92CD491D ^ n3, 5) - -885425730) * -1832040163;
                    int cfr_ignored_46 = (int)(0x507FE72027D4EB4FL ^ (long)n3 ^ 0x3330831A2DB90D2EL);
                    n4 = (int)((long)(-108990121 * 1086465723 + 1489105015 ^ n3) ^ 0xA6491F630B6E14EDL ^ 0xA6491F630B6E14EDL);
                    continue block37;
                }
                case -1325924215: {
                    int cfr_ignored_47 = (Integer.rotateRight(0x4AA66912 ^ n3, 12) + 243554409) * 1252419859;
                    n4 = 2129607632 * 1086465723 + 1489105015 ^ n3;
                    int cfr_ignored_48 = Integer.rotateLeft(0x81BEB00D ^ n3, 3) - -1166741298;
                    int cfr_ignored_49 = (int)(0x430C1E3027D4EB4FL ^ (long)n3 ^ 0xC110831A2DB92BC9L);
                    n4 = (1402763734 * 1086465723 + 1489105015 ^ n3) + -1041791784 - -1041791784;
                    int cfr_ignored_50 = Integer.rotateLeft(0x376DF3CC ^ n3, 9) - -1162992401;
                    n4 = -108990121 * 1086465723 + 1489105015 ^ n3;
                    n2 += 5;
                    continue block37;
                }
                case -1947373105: {
                    return bl;
                }
            }
            int cfr_ignored_51 = (Integer.rotateRight(0x58B94877 ^ n3, 14) - -1026726492) * 1488537719;
            n4 = Integer.reverse(Integer.reverse(-108990121 * 1086465723 + 1489105015 ^ n3));
        }
    }

    private void ssa_5() {
        int n = 0;
        int n2 = 1308666267;
        n2 = Integer.rotateLeft(n2 * 744938873, 19) ^ 0xD7B5A242;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 3);
        int n3 = Integer.reverse(Integer.reverse(n2 ^ 0x5B60AE0A));
        while (true) {
            block30: {
                block32: {
                    block37: {
                        block29: {
                            block35: {
                                block28: {
                                    block33: {
                                        block39: {
                                            block38: {
                                                block27: {
                                                    block44: {
                                                        block43: {
                                                            block41: {
                                                                block42: {
                                                                    block34: {
                                                                        block40: {
                                                                            block36: {
                                                                                block25: {
                                                                                    block31: {
                                                                                        block26: {
                                                                                            if ((n = n3 ^ n2) > 66796380) break block25;
                                                                                            if (n > -1346738797) break block26;
                                                                                            if (n == -1773089322) break block27;
                                                                                            if (n == -1497739148) break block28;
                                                                                            if (n == -1346738797) break block29;
                                                                                            break block30;
                                                                                        }
                                                                                        if (n > -958600254) break block31;
                                                                                        if (n == -1323753584) break block32;
                                                                                        if (n == -958600254) break block33;
                                                                                        break block30;
                                                                                    }
                                                                                    if (n == 21400458) break block34;
                                                                                    if (n == 66796380) break block35;
                                                                                    break block30;
                                                                                }
                                                                                if (n > 774732629) break block36;
                                                                                if (n == 593930552) break block37;
                                                                                if (n == 739528753) break block38;
                                                                                int cfr_ignored_0 = Integer.rotateLeft(0x29F5D668 ^ n2, 8) + 421696979;
                                                                                if (n == 774732629) break block39;
                                                                                break block30;
                                                                            }
                                                                            if (n > 1533062666) break block40;
                                                                            if (n == 1029802676) break block41;
                                                                            if (n == 1533062666) break block42;
                                                                            break block30;
                                                                        }
                                                                        if (n == 1654935581) break block43;
                                                                        if (n == 1686291451) break block44;
                                                                        int cfr_ignored_1 = (Integer.rotateLeft(0x31B5475C ^ n2, 9) - 156320607) * 833963869;
                                                                        break block30;
                                                                    }
                                                                    int cfr_ignored_2 = Integer.rotateLeft(0xFF8C5149 ^ n2, 18) + -161777902;
                                                                    int cfr_ignored_3 = (int)(0x3D3EFF7427D4EB4FL ^ (long)n2 ^ 0x398831A2DB9D7ACL);
                                                                    tzr.zshn();
                                                                    throw null;
                                                                }
                                                                int cfr_ignored_4 = (Integer.rotateRight(0xEEFD1E7A ^ n2, 16) + -184266751) * -285401477;
                                                                if (!tzr.azz_3()) {
                                                                    try {
                                                                        n += 4;
                                                                        if ((0x7EBAF28694A199CFL ^ (long)n2 | 1L) == 0L) {
                                                                            throw new ArithmeticException();
                                                                        }
                                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x1468B8A));
                                                                    }
                                                                    catch (ArithmeticException arithmeticException) {
                                                                        n3 = (n2 ^ 0x1468B8A) + -1385045376 - -1385045376;
                                                                    }
                                                                    --n;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_5 = (int)(0x69616246E21BDD94L ^ (long)n2 ^ 0x39FD0884400F7F13L);
                                                                n3 = n2 ^ 0x3D618AB4 ^ 0xA56E0EB ^ 0xA56E0EB;
                                                                n += 4;
                                                                continue;
                                                            }
                                                            int cfr_ignored_6 = Integer.rotateLeft(0xBFD172A5 ^ n2, 10) - 1052410166;
                                                            int cfr_ignored_7 = (int)(0x7D63DC9827D4EB4FL ^ (long)n2 ^ 0x4440831A2DB95716L);
                                                            this.zfd_2 = 0xF26BFE749582B0E8L ^ 0xD94018B6A7D4F17L;
                                                            this.hbj = Integer.rotateLeft(0xD4C718EE ^ 0xC4C718EE, 3);
                                                            return;
                                                        }
                                                        int cfr_ignored_8 = (Integer.rotateLeft(0xD041F010 ^ n2, 13) + 1012511019) * -800985071;
                                                        try {
                                                            ++n;
                                                            n3 = n2 ^ 0x5B60AE0A;
                                                        }
                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x5B60AE0A));
                                                        }
                                                        continue;
                                                    }
                                                    int cfr_ignored_9 = Integer.rotateLeft(0xF42A9261 ^ n2, 17) + -1786423046;
                                                    int cfr_ignored_10 = (int)(0x36983C5C27D4EB4FL ^ (long)n2 ^ 0x85C8831A2DB9C0E1L);
                                                    try {
                                                        n += 2;
                                                        if ((0x6044E5FF46831B53L ^ (long)n2 | 1L) == 0L) {
                                                            throw new ArithmeticException();
                                                        }
                                                        n3 = n2 ^ 0x5B60AE0A ^ 0x41EC10A6 ^ 0x41EC10A6;
                                                    }
                                                    catch (ArithmeticException arithmeticException) {
                                                        n3 = (int)((long)(n2 ^ 0x5B60AE0A) ^ 0x3E34B8013F1E3A37L ^ 0x3E34B8013F1E3A37L);
                                                    }
                                                    n += 4;
                                                    continue;
                                                }
                                                int cfr_ignored_11 = (Integer.rotateLeft(0xFFB46091 ^ n2, 18) + -80391990) * -4956015;
                                                int cfr_ignored_12 = (int)(0x3D06CEAC27D4EB4FL ^ (long)n2 ^ 0x6028831A2DB9D7DCL);
                                                try {
                                                    n -= 5;
                                                    if ((0x8C01B6574342FC19L ^ (long)n2 | 1L) == 0L) {
                                                        throw new IllegalArgumentException();
                                                    }
                                                    n3 = n2 ^ 0x5B60AE0A ^ 0xA6F5E482 ^ 0xA6F5E482;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x5B60AE0A));
                                                }
                                                n += 4;
                                                continue;
                                            }
                                            int cfr_ignored_13 = (Integer.rotateLeft(0xCC876AB8 ^ n2, 12) + -926708861) * -863540551;
                                            n3 = (n2 ^ 0xD8A3A8F) + 1328291560 - 1328291560;
                                            int cfr_ignored_14 = Integer.rotateLeft(0xE7C9C428 ^ n2, 15) + 365715475;
                                            try {
                                                if ((0x9083F632E9322029L ^ (long)n2 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                n3 = (int)((long)(n2 ^ 0x5B60AE0A) ^ 0x2DB2D1A090797626L ^ 0x2DB2D1A090797626L);
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                n3 = (n2 ^ 0x5B60AE0A) + 1293620578 - 1293620578;
                                            }
                                            continue;
                                        }
                                        int cfr_ignored_15 = Integer.rotateLeft(0xB5344968 ^ n2, 9) + -172850477;
                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xF5FBD2C9));
                                        int cfr_ignored_16 = (Integer.rotateRight(0x139D873B ^ n2, 5) + 1685127008) * 329090875;
                                        n3 = n2 ^ 0x5B60AE0A ^ 0xDEFC6599 ^ 0xDEFC6599;
                                        n += 2;
                                        continue;
                                    }
                                    int cfr_ignored_17 = Integer.rotateLeft(0x2566C ^ n2, 3) - 77993551;
                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x47A2E9C7));
                                    int cfr_ignored_18 = Integer.rotateLeft(0x3EC4672C ^ n2, 10) - -1641669233;
                                    int cfr_ignored_19 = (int)(0xA1048253C89A6A2EL ^ (long)n2 ^ 0xF9D75D872F7AEFD8L);
                                    n3 = (int)((long)(n2 ^ 0x5B60AE0A) ^ 0x209F6D139129428L ^ 0x209F6D139129428L);
                                    n -= 4;
                                    continue;
                                }
                                int cfr_ignored_20 = Integer.rotateRight(0x210F4686 ^ n2, 7) - 87501173;
                                try {
                                    n += 4;
                                    if ((0x1A06A54B4C56EB21L ^ (long)n2 | 1L) == 0L) {
                                        throw new UnsupportedOperationException();
                                    }
                                    n3 = n2 ^ 0x5B60AE0A;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    n3 = (int)((long)(n2 ^ 0x5B60AE0A) ^ 0x5260EF5FF4BEC46L ^ 0x5260EF5FF4BEC46L);
                                }
                                continue;
                            }
                            int cfr_ignored_21 = (Integer.rotateLeft(0x94C45075 ^ n2, 5) - 136535398) * -1799073675;
                            int cfr_ignored_22 = (int)(0x5676FE4827D4EB4FL ^ (long)n2 ^ 0x1E0831A2DB9013CL);
                            try {
                                if ((0xD708DCC9BDF85FE1L ^ (long)n2 | 1L) == 0L) {
                                    throw new NoSuchElementException();
                                }
                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x5B60AE0A));
                            }
                            catch (NoSuchElementException noSuchElementException) {
                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x5B60AE0A));
                            }
                            --n;
                            continue;
                        }
                        int cfr_ignored_23 = (Integer.rotateRight(0x53B03493 ^ n2, 13) + 649329928) * 1404056723;
                        try {
                            ++n;
                            if ((0xD6015AD522C89CD1L ^ (long)n2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n3 = n2 ^ 0x5B60AE0A ^ 0xB2A36A6B ^ 0xB2A36A6B;
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = n2 ^ 0x5B60AE0A;
                        }
                        continue;
                    }
                    int cfr_ignored_24 = Integer.rotateLeft(0xB3FEE4C0 ^ n2, 9) + -801418629;
                    n3 = (int)((long)(n2 ^ 0xC60F0641) ^ 0xE91148EFC0D7BEA6L ^ 0xE91148EFC0D7BEA6L);
                    int cfr_ignored_25 = Integer.rotateLeft(0xA22CF7AC ^ n2, 7) - -1479566065;
                    n3 = n2 ^ 0x18A41775;
                    int cfr_ignored_26 = (Integer.rotateRight(0xD2EB537E ^ n2, 13) - -1898136707) * -756329601;
                    n3 = (int)((long)(n2 ^ 0x5B60AE0A) ^ 0x72E6C34E25923743L ^ 0x72E6C34E25923743L);
                    --n;
                    continue;
                }
                int cfr_ignored_27 = (Integer.rotateLeft(0x7749A014 ^ n2, 17) - 1984430503) * 2001313813;
                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x54A06FE4));
                int cfr_ignored_28 = (Integer.rotateRight(0x9BF79657 ^ n2, 6) - -413609020) * -1678272937;
                n3 = (int)((long)(n2 ^ 0xF2AF8D18) ^ 0x50A41F45C2AF9AC2L ^ 0x50A41F45C2AF9AC2L);
                int cfr_ignored_29 = Integer.rotateLeft(0x108EB18C ^ n2, 5) - 94707503;
                n3 = (int)((long)(n2 ^ 0x5B60AE0A) ^ 0xAE7AD041DCC2EA12L ^ 0xAE7AD041DCC2EA12L);
                --n;
                continue;
            }
            int cfr_ignored_30 = Integer.rotateRight(0x7956B282 ^ n2, 18) + -1243792135;
            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x5B60AE0A));
        }
    }

    private boolean saz() {
        int n = -249285260;
        n = Integer.rotateLeft(n * -1252995727, 4) ^ 0xA36CFA88;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 12);
        int n2 = n ^ 0xD26C65D7;
        if ((n2 ^ n) != -764647977) {
            int cfr_ignored_0 = (0x234850A3 ^ n) - 1649667666;
        }
        return tzr.hthd_2(tzr.mc.field_1724) || tzr.shts_4(tzr.mc.field_1724) || tzr.mc.field_1724.method_5771() || tzr.dngh(this) || tzr.ahz_3(tzr.mc.field_1724, class_1294.field_5919) || tzr.mc.field_1724.method_6059(class_1294.field_5902) || tzr.mc.field_1724.method_6059(class_1294.field_5906) || kf.zws() || tzr.mc.field_1724.method_6101() || tzr.mc.field_1724.method_5765() || tzr.mc.field_1724.method_31549().field_7479;
    }

    private boolean khka_2() {
        int n = -1755473181;
        int n2 = (n = Integer.rotateLeft(n * 528051531, 28) ^ 0x83F1E013) ^ 0xAE2117C9;
        if ((n2 ^ n) != -1373562935) {
            int cfr_ignored_0 = (0x397C8D2A ^ n) + -1700982066;
        }
        if (tzr.mc.field_1687 == null || tzr.mc.field_1724 == null) {
            int n3 = 0;
            if (yf.tdhth_2() == 0) {
                n3 = n3 ^ 0x5532;
            }
            return n3 != 0;
        }
        return tzr.mc.field_1687.method_8320(tzr.mc.field_1724.method_24515()).method_27852(class_2246.field_27879);
    }

    private boolean khshs() {
        int n = js_2.aa(-1202244864);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
        int n2 = n ^ 0x7DC9CC4B;
        if ((n2 ^ n) != 2110377035) {
            int cfr_ignored_0 = Integer.rotateRight(0xC59EFF4B ^ n, 11) + -224491184;
        }
        if (tzr.mc.field_1687 == null || tzr.mc.field_1724 == null) {
            return false;
        }
        class_2338 class_23382 = tzr.mc.field_1724.method_24515().method_10086(2);
        return !tzr.mc.field_1687.method_8320(class_23382).method_26220((class_1922)tzr.mc.field_1687, class_23382).method_1110();
    }

    private class_1297 sdhb_2() {
        class_3966 class_39662 = rj.thrq(this.hw_2.hkt, this.hw_2.rsgh_2, this.hw_2.dta_3);
        if (class_39662 != null) {
            return class_39662.method_17782();
        }
        return null;
    }

    private void ghtt_4() {
        int n = js_2.aa(-1098599011);
        int n2 = n ^ 0x916C4FA1;
        if ((n2 ^ n) != -1855172703) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x2FE8FA3C ^ n, 8) - -778834817) * 803797565;
        }
        this.tagh_2.hthh_2(this.shkh_2());
    }

    private long shkh_2() {
        float f;
        int n = 1141138154;
        n = Integer.rotateLeft(n * 1498273879, 16) ^ 0x9C0A1240;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x2B388D9A;
        if ((n2 ^ n) != 725126554) {
            int cfr_ignored_0 = (0x6F3CEF70 ^ n) + -564297609;
        }
        if (!this.hw_2.sal_2) {
            return 0x1C55571D6216BE9EL ^ 0x1C55571D6216BF6AL;
        }
        float f2 = Math.max(1.0f, this.hw_2.shfkh);
        float f3 = f2 == (f = Math.max(f2, this.hw_2.dhjth)) ? f2 : ngh.zthw(f2, f);
        return Math.max(1L, (long)Math.round(Float.intBitsToFloat(Integer.reverse(-1879025176) ^ 0x53E00009) / f3));
    }

    @Generated
    public rsh_3 sshdh_2() {
        block0: {
            int n = -1617618847;
            n = Integer.rotateLeft(n * 11062161, 10) ^ 0xE5ADF965;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xDEA88808;
            if ((n2 ^ n) == -559380472) break block0;
            int cfr_ignored_0 = (0x413D9069 ^ n) + 786361271;
        }
        return this.tagh_2;
    }

    @Generated
    public at_3 daa_8() {
        block0: {
            int n = 1202249022;
            n = Integer.rotateLeft(n * -1020335871, 22) ^ 0x962C25;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x14A0118E;
            if ((n2 ^ n) == 346034574) break block0;
            int cfr_ignored_0 = (0x5308CCB0 ^ n) - 1162973413;
        }
        return this.shdj;
    }

    @Generated
    public lkh zqz() {
        block0: {
            int n = 316130591;
            n = Integer.rotateLeft(n * -2054408619, 16) ^ 0x5C6D315B;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xB4105EF5;
            if ((n2 ^ n) == -1273995531) break block0;
            int cfr_ignored_0 = (0xA6C79BEA ^ n) - 499989295;
        }
        return this.bash;
    }

    @Generated
    public long sshr_2() {
        block0: {
            int n = 458591909;
            n = Integer.rotateLeft(n * 1660872371, 17) ^ 0x58D53915;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8A8F062D;
            if ((n2 ^ n) == -1970338259) break block0;
            int cfr_ignored_0 = (0x91DA8888 ^ n) + 16351088;
        }
        return this.zfd_2;
    }

    @Generated
    public int shsb() {
        block0: {
            int n = js_2.aa(1752363576);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xC1EC0E86;
            if ((n2 ^ n) == -1041494394) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xA99EFCBE ^ n, 8) - -1902233027) * -1449198401;
        }
        return this.hbj;
    }

    @Generated
    public bhdh_2 bdw() {
        block0: {
            int n = js_2.aa(1086818439);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xB5D557D2;
            if ((n2 ^ n) == -1244309550) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xF512DF55 ^ n, 17) - -1314477434) * -183312555;
            int cfr_ignored_1 = (int)(0x37A0716827D4EB4FL ^ (long)n ^ 0x1FA0831A2DB9C291L);
        }
        return this.hw_2;
    }

    @Generated
    public tzr dwh_4(bhdh_2 bhdh2_2) {
        int n = js_2.aa(2028873336);
        bhdh_2 bhdh3_2 = bhdh2_2;
        n = Integer.rotateLeft((bhdh3_2 != null ? System.identityHashCode(bhdh3_2) : 0) ^ n, 23);
        int n2 = n ^ 0xC5DB4726;
        if ((n2 ^ n) != -975485146) {
            int cfr_ignored_0 = (Integer.rotateRight(0xBD35615E ^ n, 10) - -304846435) * -1120575137;
        }
        this.hw_2 = bhdh2_2;
        return this;
    }

    private void tqj(fa fa2) {
        int n = -1424011042;
        n = Integer.rotateLeft(n * -349361657, 8) ^ 0xAA4F6C56;
        fa fa3 = fa2;
        n = Integer.rotateRight((fa3 != null ? System.identityHashCode(fa3) : 0) ^ n, 18);
        int n2 = n ^ 0x304E11A7;
        if ((n2 ^ n) != 810422695) {
            int cfr_ignored_0 = (0x9B514179 ^ n) + -1899714973;
        }
        boolean bl = this.hw_2 != null && this.hw_2.khkhdh != null && (this.hw_2.khjs_2 || this.hw_2.bsd_3) && this.tagh_2.snt_3() && this.snm();
        this.shdj.zrs_3(fa2, bl);
    }

    private static String bakh(String string, int n, int n2, int n3) {
        int n4 = js_2.aa(1252027966);
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 16);
        int n5 = (n4 = Integer.rotateRight(n ^ n4, 21)) ^ 0x67B20D4C;
        if ((n5 ^ n4) != 1739722060) {
            int cfr_ignored_0 = (Integer.rotateRight(0x2D126372 ^ n4, 8) + 2039982601) * 756179827;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x3B9122FD ^ n2 ^ i * 1889846769 ^ jsl_2, 27) ^ shas_4));
        }
        return new String(cArray);
    }

    private static boolean sghh_3(String string, Object object) {
        block0: {
            int n = 1905393245;
            n = Integer.rotateLeft(n * 1447621869, 28) ^ 0xDB5C7E7C;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 25);
            Object object2 = object;
            n = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 17);
            int n2 = n ^ 0x6E403466;
            if ((n2 ^ n) == 1849701478) break block0;
            int cfr_ignored_0 = (0x1FD1CA3B ^ n) + -752081273;
        }
        return string.equals(object);
    }

    private static class_1297 dhghs_2(tzr tzr2) {
        block0: {
            int n = 1558515717;
            n = Integer.rotateLeft(n * -204859107, 15) ^ 0x3396730C;
            tzr tzr3 = tzr2;
            n = Integer.rotateLeft((tzr3 != null ? System.identityHashCode(tzr3) : 0) ^ n, 15);
            int n2 = n ^ 0xA03FF386;
            if ((n2 ^ n) == -1606421626) break block0;
            int cfr_ignored_0 = (0xFCDAE383 ^ n) + 1443488006;
        }
        return tzr2.sdhb_2();
    }

    private static void jghz(class_746 class_7462, class_1268 class_12682) {
        int n = 420076255;
        n = Integer.rotateLeft(n * -2057369393, 17) ^ 0xF61271E4;
        class_746 class_7463 = class_7462;
        n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
        int n2 = n ^ 0xCC6EAF34;
        if ((n2 ^ n) != -865161420) {
            int cfr_ignored_0 = (0xD56775EB ^ n) - 1838274972;
        }
        class_7462.method_6104(class_12682);
    }

    private static void rhz_4() {
        int n = 420249991;
        int n2 = (n = Integer.rotateLeft(n * -2076843625, 24) ^ 0x26AE0E45) ^ 0x4C1307E2;
        if ((n2 ^ n) != 1276315618) {
            int cfr_ignored_0 = (0x551F8665 ^ n) - 2123011258;
        }
        Nr.ndk();
    }

    private static void jsz_2(tzr tzr2) {
        int n = -620617369;
        int n2 = (n = Integer.rotateLeft(n * 1535465637, 26) ^ 0xF1AB2415) ^ 0xEB555898;
        if ((n2 ^ n) != -346728296) {
            int cfr_ignored_0 = (0x305779FF ^ n) + 226929269;
        }
        tzr2.ssa_5();
    }

    private static boolean khghq(tzr tzr2) {
        block0: {
            int n = js_2.aa(441437970);
            int n2 = n ^ 0xC0E046F1;
            if ((n2 ^ n) == -1059043599) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xDAAF89E3 ^ n, 14) + 2141147576;
        }
        return tzr2.bsm();
    }

    private static boolean hdy_2(tzr tzr2) {
        block0: {
            int n = -113305114;
            int n2 = (n = Integer.rotateLeft(n * -1375595309, 26) ^ 0xAF9789D7) ^ 0xC754C0F8;
            if ((n2 ^ n) == -950746888) break block0;
            int cfr_ignored_0 = (0x3E6BD91E ^ n) + -1915866195;
        }
        return tzr2.zthf();
    }

    private static void szd_3(tzr tzr2) {
        int n = js_2.aa(590983341);
        tzr tzr3 = tzr2;
        n = (tzr3 != null ? System.identityHashCode(tzr3) : 0) ^ n;
        int n2 = n ^ 0xD4191867;
        if ((n2 ^ n) != -736552857) {
            int cfr_ignored_0 = Integer.rotateRight(0xF720A8CA ^ n, 17) + -246280271;
        }
        tzr2.ssa_5();
    }

    private static boolean thdb(tzr tzr2) {
        block0: {
            int n = 27078313;
            int n2 = (n = Integer.rotateLeft(n * 132153947, 4) ^ 0xF22A8555) ^ 0x446C6835;
            if ((n2 ^ n) == 1147955253) break block0;
            int cfr_ignored_0 = (0x45F1469C ^ n) + 18578987;
        }
        return tzr2.snm();
    }

    private static void khdhj(tzr tzr2) {
        int n = js_2.aa(-2143278698);
        tzr tzr3 = tzr2;
        n = (tzr3 != null ? System.identityHashCode(tzr3) : 0) ^ n;
        int n2 = n ^ 0xA47D29C6;
        if ((n2 ^ n) != -1535301178) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x243D0050 ^ n, 7) + 1740679403) * 607977553;
        }
        tzr2.ssa_5();
    }

    private static boolean thrw(tzr tzr2) {
        block0: {
            int n = js_2.aa(-944471859);
            tzr tzr3 = tzr2;
            n = (tzr3 != null ? System.identityHashCode(tzr3) : 0) ^ n;
            int n2 = n ^ 0xDC68333E;
            if ((n2 ^ n) == -597150914) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x1BDCB3F3 ^ n, 6) + 1679255976) * 467448819;
        }
        return tzr2.khb();
    }

    private static boolean shat_3() {
        block0: {
            int n = -577177867;
            int n2 = (n = Integer.rotateLeft(n * 112603697, 18) ^ 0xB54423DB) ^ 0x80FB070B;
            if ((n2 ^ n) == -2131032309) break block0;
            int cfr_ignored_0 = (0x5D63F1FE ^ n) - -221815251;
        }
        return kf.bsy_2();
    }

    private static boolean bzsh(tzr tzr2) {
        block0: {
            int n = -1701901087;
            n = Integer.rotateLeft(n * 1765838333, 9) ^ 0x6216DD08;
            tzr tzr3 = tzr2;
            n = Integer.rotateLeft((tzr3 != null ? System.identityHashCode(tzr3) : 0) ^ n, 10);
            int n2 = n ^ 0x1E059A36;
            if ((n2 ^ n) == 503683638) break block0;
            int cfr_ignored_0 = (0x848A96D7 ^ n) - 1676272477;
        }
        return tzr2.zzf_4();
    }

    private static boolean shhz_3(tzr tzr2) {
        block0: {
            int n = 1645446857;
            int n2 = (n = Integer.rotateLeft(n * 669855237, 27) ^ 0xC4EB2421) ^ 0x537E24EA;
            if ((n2 ^ n) == 1400775914) break block0;
            int cfr_ignored_0 = (0x316DA223 ^ n) + -107203762;
        }
        return tzr2.bkhl();
    }

    private static boolean zdhm_2(class_304 class_3042) {
        block0: {
            int n = -1135080918;
            n = Integer.rotateLeft(n * 413756021, 10) ^ 0x9F882AF4;
            class_304 class_3043 = class_3042;
            n = (class_3043 != null ? System.identityHashCode(class_3043) : 0) ^ n;
            int n2 = n ^ 0x51DEA10F;
            if ((n2 ^ n) == 1373544719) break block0;
            int cfr_ignored_0 = (0xED86AB25 ^ n) + 1235699146;
        }
        return class_3042.method_1434();
    }

    private static class_1799 bkf(class_746 class_7462) {
        block0: {
            int n = -1632184399;
            int n2 = (n = Integer.rotateLeft(n * -1424537545, 19) ^ 0xA6340641) ^ 0x11555395;
            if ((n2 ^ n) == 290804629) break block0;
            int cfr_ignored_0 = (0x8FE38424 ^ n) + -233821603;
        }
        return class_7462.method_6047();
    }

    private static class_1792 sqr(class_1799 class_17992) {
        block0: {
            int n = 1062975840;
            int n2 = (n = Integer.rotateLeft(n * -2034236327, 18) ^ 0x7D3D363B) ^ 0xFBDE9E89;
            if ((n2 ^ n) == -69296503) break block0;
            int cfr_ignored_0 = (0xC48527E9 ^ n) - 2144264766;
        }
        return class_17992.method_7909();
    }

    private static boolean khnz_2(tzr tzr2) {
        block0: {
            int n = -1091742084;
            int n2 = (n = Integer.rotateLeft(n * -2127048187, 11) ^ 0x985A1BE1) ^ 0x99FB490D;
            if ((n2 ^ n) == -1711585011) break block0;
            int cfr_ignored_0 = (0x27161F71 ^ n) - -1239473669;
        }
        return tzr2.saz();
    }

    private static int bhj() {
        block0: {
            int n = 1436067132;
            int n2 = (n = Integer.rotateLeft(n * -1979847189, 9) ^ 0xC3E52209) ^ 0x10BFA728;
            if ((n2 ^ n) == 280995624) break block0;
            int cfr_ignored_0 = (0x45270214 ^ n) - 1542365686;
        }
        return yf.tdhth_2();
    }

    private static Nr shft_2() {
        block0: {
            int n = 1582996748;
            int n2 = (n = Integer.rotateLeft(n * -762120835, 25) ^ 0xCC0B75BA) ^ 0x93012E79;
            if ((n2 ^ n) == -1828639111) break block0;
            int cfr_ignored_0 = (0xCD5BB375 ^ n) + 1792987113;
        }
        return Nr.nfI();
    }

    private static khd dmkh(Nr nr) {
        block0: {
            int n = 1978445788;
            int n2 = (n = Integer.rotateLeft(n * 134511727, 28) ^ 0x6420F038) ^ 0x3A269056;
            if ((n2 ^ n) == 975605846) break block0;
            int cfr_ignored_0 = (0x4FCA3F8A ^ n) - -1343951101;
        }
        return nr.neP();
    }

    private static boolean thjr(class_304 class_3042) {
        block0: {
            int n = 485472358;
            int n2 = (n = Integer.rotateLeft(n * -986369507, 16) ^ 0xE1261A9F) ^ 0x9BBC33A6;
            if ((n2 ^ n) == -1682164826) break block0;
            int cfr_ignored_0 = (0x87538BC0 ^ n) - -310738095;
        }
        return class_3042.method_1434();
    }

    private static String tsf_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 828773736;
            n4 = Integer.rotateLeft(n4 * 203070915, 28) ^ 0x576D537D;
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 24)) ^ 0xB6A6A71F;
            if ((n5 ^ n4) == -1230592225) break block0;
            int cfr_ignored_0 = (0x87C0B277 ^ n4) - -1997052323;
        }
        return tzr.bakh(string, n, n2, n3);
    }

    private static boolean dhad_3() {
        block0: {
            int n = -478415615;
            int n2 = (n = Integer.rotateLeft(n * -1587293861, 5) ^ 0xAE6CAC4A) ^ 0x80D7BA3C;
            if ((n2 ^ n) == -2133345732) break block0;
            int cfr_ignored_0 = (0x63AC4F3D ^ n) + 1052383017;
        }
        return kf.zws();
    }

    private static boolean srsh_2(class_746 class_7462) {
        block0: {
            int n = 2042774850;
            int n2 = (n = Integer.rotateLeft(n * 766278417, 15) ^ 0xD6C00D8E) ^ 0xCA101A12;
            if ((n2 ^ n) == -904914414) break block0;
            int cfr_ignored_0 = (0xB3D25F50 ^ n) - 1738579181;
        }
        return class_7462.method_24828();
    }

    private static boolean dqd_2(tzr tzr2, long l) {
        block0: {
            int n = -484044769;
            n = Integer.rotateLeft(n * 307027533, 10) ^ 0x3A5F3E7C;
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 8)) ^ 0x8E8CAE7F;
            if ((n2 ^ n) == -1903382913) break block0;
            int cfr_ignored_0 = (0x6DAABE60 ^ n) + 1013724010;
        }
        return tzr2.abs_2(l);
    }

    private static boolean azz_3() {
        block0: {
            int n = 1913616337;
            int n2 = (n = Integer.rotateLeft(n * -505892559, 13) ^ 0x2BB43168) ^ 0xC43E5711;
            if ((n2 ^ n) == -1002547439) break block0;
            int cfr_ignored_0 = (0xB63120C0 ^ n) + 2041299809;
        }
        return yf.khdha_2();
    }

    private static void zshn() {
        int n = -893733327;
        int n2 = (n = Integer.rotateLeft(n * -1607695101, 13) ^ 0x9E7949D6) ^ 0xA71DB862;
        if ((n2 ^ n) != -1491224478) {
            int cfr_ignored_0 = (0x6DA70E53 ^ n) - 247058579;
        }
        yf.athz_2();
    }

    private static boolean hthd_2(class_746 class_7462) {
        block0: {
            int n = js_2.aa(8226539);
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0x4AE5C3F8;
            if ((n2 ^ n) == 1256571896) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x4A984513 ^ n, 12) + 214826120) * 1251493139;
        }
        return class_7462.method_5799();
    }

    private static boolean shts_4(class_746 class_7462) {
        block0: {
            int n = -690190733;
            n = Integer.rotateLeft(n * -484326893, 24) ^ 0x82BB4B64;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0x7CE191FA;
            if ((n2 ^ n) == 2095157754) break block0;
            int cfr_ignored_0 = (0xAA3D1789 ^ n) + -1902980892;
        }
        return class_7462.method_5869();
    }

    private static boolean dngh(tzr tzr2) {
        block0: {
            int n = 1694829208;
            n = Integer.rotateLeft(n * -932940379, 13) ^ 0xB4671A08;
            tzr tzr3 = tzr2;
            n = (tzr3 != null ? System.identityHashCode(tzr3) : 0) ^ n;
            int n2 = n ^ 0x38138181;
            if ((n2 ^ n) == 0x38138181) break block0;
            int cfr_ignored_0 = (0x5D168B19 ^ n) + 428551506;
        }
        return tzr2.khka_2();
    }

    private static boolean ahz_3(class_746 class_7462, class_6880 class_68802) {
        block0: {
            int n = js_2.aa(24994540);
            class_746 class_7463 = class_7462;
            n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 22);
            class_6880 class_68803 = class_68802;
            n = (class_68803 != null ? System.identityHashCode(class_68803) : 0) ^ n;
            int n2 = n ^ 0x21BB99D1;
            if ((n2 ^ n) == 565942737) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x20C6FB3D ^ n, 7) - -59372642) * 549911357;
            int cfr_ignored_1 = (int)(0xE274550027D4EB4FL ^ (long)n ^ 0x5770831A2DB86939L);
        }
        return class_7462.method_6059(class_68802);
    }

    private static String[] hshk(String string) {
        block0: {
            int n = -348353062;
            n = Integer.rotateLeft(n * 1675805839, 19) ^ 0x748A0042;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 15);
            int n2 = n ^ 0x76B1775A;
            if ((n2 ^ n) == 1991341914) break block0;
            int cfr_ignored_0 = (0x9D8DFA80 ^ n) - -101336339;
        }
        return string.split("\u0002\u001c", -1);
    }

    private static CallSite tskh_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1823987563;
            n3 = Integer.rotateLeft(n3 * -1946788421, 15) ^ 0xF1A455B7;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 16);
            int n4 = n3 ^ 0x471B7D72;
            if ((n4 ^ n3) != 1192983922) {
                int cfr_ignored_0 = (0xD45355E7 ^ n3) + 426660780;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ stb_2 ^ string.hashCode()) + (n2 + tdhm) + i ^ stb_2, 14) + tdhm);
            }
            String[] stringArray = tzr.hshk(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] p68h7okp621lp(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite nsvfvkjwu(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ upgzmtg26 ^ string.hashCode() ^ n2 + r7yjlzw8uu ^ i * 1571137081 ^ upgzmtg26, 3) ^ r7yjlzw8uu));
            }
            String[] stringArray = tzr.p68h7okp621lp(new String(cArray));
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

