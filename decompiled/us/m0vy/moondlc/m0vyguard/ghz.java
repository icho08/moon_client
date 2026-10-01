/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.brz;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzh_4;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bky;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tsa;
import us.m0vy.moondlc.m0vyguard.hn;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.lq;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Vehicle Control", category=bzw.OTHER, desc="Control your vehicle with increased speed and glide options")
public class ghz
extends bnq {
    public final tay bakh_2 = new tay(this, "Base Horizontal").shth_7(Float.intBitsToFloat(0xA506581D ^ 0x98CA94D0)).dhbs_2(Float.intBitsToFloat(-965543105 - -2058159297)).rkh_3(Float.intBitsToFloat(Integer.reverse(-386773403) ^ 0x9BBE83DA)).ssd_5(Float.intBitsToFloat(-1075881606 - -2132846214));
    public final tay dhzr_2 = new tay(this, "Base Vertical").shth_7(Float.intBitsToFloat(-317911773 - -1354743722)).dhbs_2(Float.intBitsToFloat(-535961342 - -1628577534)).rkh_3(Float.intBitsToFloat(-1086306954 - -2123138903)).ssd_5(Float.intBitsToFloat(-1341982014 + -1901053839));
    public final badh_2 thr_3 = new badh_2(this, "Sprint S".concat("peed")).bts(true);
    public final tay dds_2 = new tay((hy)this, "Sprint Horizontal", this::jhkh).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x9AB5C84B ^ 0xFCDC262D, 13))).dhbs_2(Float.intBitsToFloat(Integer.reverse(874837592) ^ 0x5B4F242C)).rkh_3(Float.intBitsToFloat(Integer.reverse(-163800502) ^ 0x6F95F0A2)).ssd_5(Float.intBitsToFloat(-482973206 + 1567200790));
    public final tay zny = new tay((hy)this, "Sprin".concat("t Vertical"), this::dhsh_8).shth_7(Float.intBitsToFloat(Integer.reverse(-1734775252) ^ 0x9BA55D4)).dhbs_2(Float.intBitsToFloat(496264288 - -596351904)).rkh_3(Float.intBitsToFloat(-1197672161 + -2060463186)).ssd_5(2.0f);
    public final tay bja_2 = new tay(this, "Glide").shth_7(Float.intBitsToFloat(-824327598 - 272902328)).dhbs_2(Float.intBitsToFloat(Integer.reverse(633074724) ^ 0x1AB6443E)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xC93C3EAA ^ 0x287BBAD0, 11))).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xFD360CFE ^ 0x64ACB2E7, 16)));
    public final badh_2 jbz_2 = new badh_2(this, "Mouse Co".concat("ntrol")).bts(false);
    public final badh_2 sth_4 = new badh_2(this, "No Glide O".concat("n Sprint")).bts(false);
    public final badh_2 tbh = new badh_2(this, "Rehook").bts(false);
    public final tay dh_5 = new tay((hy)this, "Unhook After", this::zlj).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(817359437) ^ 0xF377ED0C)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.reverse(-70142223) ^ 0xCFED8BDF));
    public final tay shwr = new tay((hy)this, "Hook After", this::shad_2).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xE297A2C1 ^ 0xE287EAC1, 10))).rkh_3(1.0f).ssd_5(2.0f);
    private boolean rbz = false;
    private int khff = -1;
    private boolean sjz_3 = false;
    private int jtk_2 = 0;
    private int shsh_8 = 0;
    private final bql<btt> tz_4 = this::dta_4;
    private static final int brw = 281561645;
    private static final int yr = 580829122;
    private static final int zzdh = -7446947;
    private static final int wr = 1486036433;
    private static final int yuq99lkyeo8 = 558031386;
    private static final int jj3iv46l6o4g = 1667309447;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ors9m6aop4j5;

    public ghz() {
        tsa.asa_3().jkhh_2(new lq(1, this::khdh_2));
    }

    @Override
    public void nt() {
        int n = 496828256;
        n = Integer.rotateLeft(n * 756453073, 12) ^ 0xF340216A;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x696105FB;
        if ((n2 ^ n) != 1767966203) {
            int cfr_ignored_0 = (0x74FDFA9B ^ n) + -227131240;
        }
        bzh_4.ttht_3(class_2561.method_30163((String)ghz.anz(ghz.tghy("澙\ud900请䑍㘧劙ཛྷ金ꯈ摗혬胤犅⽊餈䯂шꃞኁ콜륀毼⑾阴䃢㊇太்쑮", ghz.hshf(0x8AD3824C ^ 0x80B5DD93, 10), Integer.rotateLeft(0x591F879C ^ 0xD2EC9206, 4), ghz.jnd(0xCE08DA22 ^ 0x4CDF7795, 25)), " to go down, Jump Key to go up.")));
        this.rbz = false;
        this.khff = -1;
        this.jtk_2 = 0;
        this.shsh_8 = 0;
        this.sjz_3 = false;
        super.nt();
    }

    @Override
    public void nc() {
        int n = 1957741385;
        int n2 = (n = Integer.rotateLeft(n * 1880715469, 5) ^ 0xA238E6B2) ^ 0x186F01C0;
        if ((n2 ^ n) != 409928128) {
            int cfr_ignored_0 = (0x6CDFC289 ^ n) - 1994293965;
        }
        this.khff = -1;
        super.nc();
    }

    private void tbm() {
        int n = -54683110;
        n = Integer.rotateLeft(n * -368593305, 26) ^ 0x89A026F1;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x129328FF;
        if ((n2 ^ n) != 311634175) {
            int cfr_ignored_0 = (0xEE2EB2E5 ^ n) - 85949536;
        }
        if (!this.tbh.shzl()) {
            this.jtk_2 = 0;
            this.shsh_8 = 0;
            this.khff = -1;
            this.sjz_3 = false;
            return;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null || class_3102.field_1687 == null) {
            return;
        }
        class_1297 class_12972 = class_3102.field_1724.method_5854();
        if (class_12972 != null) {
            ++this.jtk_2;
            this.shsh_8 = 0;
            this.sjz_3 = false;
            if (this.jtk_2 >= (int)this.dh_5.thw_5()) {
                this.khff = class_12972.method_5628();
                class_3102.field_1724.method_5848();
                this.jtk_2 = 0;
            }
        } else if (this.khff != -1) {
            ++this.shsh_8;
            this.jtk_2 = 0;
            if (this.shsh_8 >= (int)this.shwr.thw_5()) {
                class_1297 class_12973 = class_3102.field_1687.method_8469(this.khff);
                if (class_12973 != null && !class_12973.method_31481()) {
                    double d;
                    double d2 = class_3102.field_1724.method_5858(class_12973);
                    if (d2 <= (d = ghz.hat(class_3102.field_1724)) * d) {
                        if (!this.sjz_3) {
                            class_3102.field_1761.method_2905((class_1657)class_3102.field_1724, class_12973, class_1268.field_5808);
                            this.sjz_3 = true;
                        } else {
                            class_3102.field_1724.method_5873(class_12973, true);
                            this.khff = -1;
                        }
                    } else {
                        bzh_4.ttht_3(ghz.rbt_2("\u00a7c[VehicleContro".concat("l] Rehook failed: V").concat(ghz.thzd("壷뱩珔Ƃ흀敼㣧캥鱮厘띇䔯ᢴ꺪籵㏘솉霉", Integer.rotateLeft(0x7FA88F2F ^ 0xF70E4CE2, 11), -655603539 - 1413122192, ghz.htn_2(0x969E03E6 ^ 0xDB1EB52E, 29)))));
                        this.khff = -1;
                    }
                } else {
                    bzh_4.ttht_3(ghz.shsh_8("\u00a7c[VehicleControl] Rehook failed: Vehicle is gone."));
                    this.khff = -1;
                }
            }
        } else {
            this.jtk_2 = 0;
            this.shsh_8 = 0;
            this.sjz_3 = false;
        }
    }

    private void dta_4(btt btt2) {
        float f;
        double d;
        int n = 94032292;
        n = Integer.rotateLeft(n * 1955569313, 11) ^ 0x35544A75;
        n = System.identityHashCode(this) ^ n;
        btt btt3 = btt2;
        n = (btt3 != null ? System.identityHashCode(btt3) : 0) ^ n;
        int n2 = n ^ 0x35EF0A16;
        if ((n2 ^ n) != 904858134) {
            int cfr_ignored_0 = (0x3075DBB2 ^ n) + 174467812;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (ghz.mc.field_1724 == null || ghz.mc.field_1687 == null) {
            this.rbz = false;
            return;
        }
        class_1297 class_12972 = ghz.mc.field_1724.method_5854();
        if (class_12972 == null) {
            this.rbz = false;
            this.tbm();
            return;
        }
        if (!this.rbz) {
            this.rbz = true;
            bzh_4.ttht_3(class_2561.method_30163((String)("§e[VehicleControl] Controlling vehicle: " + class_12972.method_5864().method_5897().getString())));
        }
        boolean bl = ghz.mc.field_1690.field_1867.method_1434() && this.thr_3.shzl();
        double d2 = bl ? (double)this.dds_2.thw_5() : (double)this.bakh_2.thw_5();
        double d3 = bl ? (double)this.zny.thw_5() : (double)this.dhzr_2.thw_5();
        double d4 = d = ghz.mc.field_1724.field_6250 != 0.0f || ghz.mc.field_1724.field_6212 != 0.0f ? d2 : 0.0;
        if (this.jbz_2.shzl()) {
            class_12972.method_36456(ghz.mc.field_1724.method_36454());
        }
        boolean bl2 = ghz.mc.field_1690.field_1832.method_1434() || brz.rzdh(Integer.rotateLeft(0x47E5519B ^ 0x47E55B33, 29)) || brz.rzdh(1211983012 + -1211982667);
        double d5 = 0.0;
        if (ghz.mc.field_1690.field_1903.method_1434()) {
            d5 = d3;
        } else if (bl2) {
            d5 = -d3;
        } else if (!(class_12972.method_5799() || bl && this.sth_4.shzl())) {
            d5 = this.bja_2.thw_5();
        }
        float f2 = ghz.mc.field_1724.field_3913.field_3905;
        float f3 = ghz.mc.field_1724.field_3913.field_3907;
        float f4 = f = this.jbz_2.shzl() ? ghz.mc.field_1724.method_36454() : class_12972.method_36454();
        if (f2 == 0.0f && f3 == 0.0f) {
            class_12972.method_18800(0.0, d5, 0.0);
        } else {
            if (f2 != 0.0f) {
                if (f3 > 0.0f) {
                    f += f2 > 0.0f ? Float.intBitsToFloat(Integer.reverse(1214220155) ^ 0x1CD5FA12) : Float.intBitsToFloat(-1947830096 - 1236433072);
                } else if (f3 < 0.0f) {
                    f += f2 > 0.0f ? Float.intBitsToFloat(-1656878797 + -1527384371) : Float.intBitsToFloat(Integer.reverse(1843881464) ^ 0xDD92E7B6);
                }
                f3 = 0.0f;
                f2 = f2 > 0.0f ? 1.0f : Float.intBitsToFloat(0x5AE4C1E1 ^ 0xE564C1E1);
            }
            double d6 = Math.sin(Math.toRadians(f + Float.intBitsToFloat(Integer.rotateLeft(0x825818FC ^ 0x525819F6, 22))));
            double d7 = Math.cos(Math.toRadians(f + Float.intBitsToFloat(Integer.rotateLeft(0x9172620B ^ 0x9BA2620A, 30))));
            double d8 = (double)f2 * d * d7 + (double)f3 * d * d6;
            double d9 = (double)f2 * d * d6 - (double)f3 * d * d7;
            class_12972.method_18800(d8, d5, d9);
        }
        this.tbm();
    }

    private void khdh_2(bky bky2) {
        int n = hn.zk_2(-165552205);
        bky bky3 = bky2;
        n = Integer.rotateRight((bky3 != null ? System.identityHashCode(bky3) : 0) ^ n, 8);
        int n2 = n ^ 0x9B2900A;
        if ((n2 ^ n) != 162697226) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xFF934FB9 ^ n, 18) + -147568990) * -7123015;
            int cfr_ignored_1 = (int)(0x3D21E18427D4EB4FL ^ (long)n ^ 0x3E78831A2DB9D792L);
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        if (!this.rgha_2()) {
            return;
        }
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null) {
            return;
        }
        class_1297 class_12972 = class_3102.field_1724.method_5854();
        if (class_12972 != null || this.khff >= 0) {
            boolean bl = class_12972 != null && (class_12972.method_24828() || class_12972.method_5799());
            bky2.hfr(bky2.aakh_2() && bl);
            if (bky2.aakh_2()) {
                this.khff = -1;
            }
        }
    }

    private boolean shad_2() {
        int n = -926570902;
        n = Integer.rotateLeft(n * 1069021049, 20) ^ 0x11279C30;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xF7E0F959;
        if ((n2 ^ n) != -136251047) {
            int cfr_ignored_0 = (0x3F255F33 ^ n) - -913398014;
        }
        return !this.tbh.shzl();
    }

    private boolean zlj() {
        int n = hn.zk_2(213152677);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 5);
        int n2 = n ^ 0xC0413C8D;
        if ((n2 ^ n) != -1069466483) {
            int cfr_ignored_0 = Integer.rotateLeft(0xCCF54F28 ^ n, 12) + -703449837;
        }
        return !this.tbh.shzl();
    }

    private boolean dhsh_8() {
        try {
            int n = 1875430240;
            n = Integer.rotateLeft(n * -1583367045, 27) ^ 0xF5DEDF00;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xDE038808;
            if ((n2 ^ n) != -570193912) {
                int cfr_ignored_0 = (0xB1CB4368 ^ n) - 197497180;
            }
            if ((0x299 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.thr_3.shzl();
    }

    private boolean jhkh() {
        int n = -260999915;
        n = Integer.rotateLeft(n * -1303902841, 24) ^ 0xCCA794D9;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 9);
        int n2 = n ^ 0xA76F1794;
        if ((n2 ^ n) != -1485891692) {
            int cfr_ignored_0 = (0x571E6281 ^ n) + -1702379499;
        }
        return !this.thr_3.shzl();
    }

    private static String thzd(String string, int n, int n2, int n3) {
        int n4 = 157406211;
        n4 = Integer.rotateLeft(n4 * 199359421, 3) ^ 0xCD00553B;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = n ^ n4) ^ 0x59B92D9C;
        if ((n5 ^ n4) != 1505308060) {
            int cfr_ignored_0 = (0x50D8F99F ^ n4) - -1258338786;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x4B3EA2CB ^ n2 - i) + yr, 16) ^ brw + i * 1149153865));
        }
        return new String(cArray);
    }

    private static int hshf(int n, int n2) {
        block0: {
            int n3 = hn.zk_2(88016433);
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0xC25A8D27;
            if ((n4 ^ n3) == -1034253017) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xC7658B16 ^ n3, 11) - 698971877) * -949646569;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int jnd(int n, int n2) {
        block0: {
            int n3 = hn.zk_2(1715534000);
            int n4 = (n3 = n ^ n3) ^ 0x47D584F8;
            if ((n4 ^ n3) == 1205175544) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x21957C48 ^ n3, 7) + 360164339;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String tghy(String string, int n, int n2, int n3) {
        block0: {
            int n4 = hn.zk_2(955376805);
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 13);
            int n5 = (n4 = n ^ n4) ^ 0x96F9DFD6;
            if ((n5 ^ n4) == -1762009130) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xAE083B73 ^ n4, 8) + 391959080) * -1375192205;
        }
        return ghz.thzd(string, n, n2, n3);
    }

    private static String anz(String string, String string2) {
        block0: {
            int n = 1247327320;
            int n2 = (n = Integer.rotateLeft(n * 1665332885, 17) ^ 0xBA8FFCF0) ^ 0x25393614;
            if ((n2 ^ n) == 624506388) break block0;
            int cfr_ignored_0 = (0x6F61824C ^ n) - -1831151774;
        }
        return string.concat(string2);
    }

    private static double hat(class_746 class_7462) {
        block0: {
            int n = -773062563;
            n = Integer.rotateLeft(n * -1121294403, 12) ^ 0x6A17B907;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0xFF35A11D;
            if ((n2 ^ n) == -13262563) break block0;
            int cfr_ignored_0 = (0x2ED9A140 ^ n) - 1639828944;
        }
        return class_7462.method_55755();
    }

    private static int htn_2(int n, int n2) {
        block0: {
            int n3 = 297988373;
            n3 = Integer.rotateLeft(n3 * -1473624797, 12) ^ 0xE9B2FCA9;
            n3 = Integer.rotateRight(n ^ n3, 26);
            int n4 = (n3 = n2 ^ n3) ^ 0x1E890E8A;
            if ((n4 ^ n3) == 512298634) break block0;
            int cfr_ignored_0 = (0xF4BFF9F ^ n3) - 1664375527;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static class_2561 rbt_2(String string) {
        block0: {
            int n = -1674184638;
            n = Integer.rotateLeft(n * 445632571, 25) ^ 0x80FD1595;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 22);
            int n2 = n ^ 0xE4D352E1;
            if ((n2 ^ n) == -455912735) break block0;
            int cfr_ignored_0 = (0x78E6AAA3 ^ n) + -294623217;
        }
        return class_2561.method_30163((String)string);
    }

    private static String zmr(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -214731575;
            n4 = Integer.rotateLeft(n4 * 683187915, 15) ^ 0x8744F55C;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 11)) ^ 0x1AD7CA75;
            if ((n5 ^ n4) == 450349685) break block0;
            int cfr_ignored_0 = (0xE9E4BEBC ^ n4) - -545624370;
        }
        return ghz.thzd(string, n, n2, n3);
    }

    private static class_2561 shsh_8(String string) {
        block0: {
            int n = -1625877375;
            n = Integer.rotateLeft(n * 1159566087, 8) ^ 0x3D1AA994;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 25);
            int n2 = n ^ 0x1D8B2DE2;
            if ((n2 ^ n) == 495660514) break block0;
            int cfr_ignored_0 = (0x829C3963 ^ n) + 1990964515;
        }
        return class_2561.method_30163((String)string);
    }

    private static String[] rdt_2(String string) {
        block0: {
            int n = -130096787;
            int n2 = (n = Integer.rotateLeft(n * 2037599725, 27) ^ 0x23F4BBB1) ^ 0xD720CD85;
            if ((n2 ^ n) == -685716091) break block0;
            int cfr_ignored_0 = (0x2F1E2CE8 ^ n) - 1389902527;
        }
        return string.split("\u0001\u001b", -1);
    }

    private static CallSite shnsh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 64861769;
            n3 = Integer.rotateLeft(n3 * -1027269539, 25) ^ 0x5594CD5;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x6563CEDA;
            if ((n4 ^ n3) != 1701039834) {
                int cfr_ignored_0 = (0x66BE7893 ^ n3) - -1914733147;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ zzdh ^ string.hashCode() ^ n2 + wr + i * -541374259) + zzdh) ^ wr));
            }
            String[] stringArray = ghz.rdt_2(new String(cArray));
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

    private static String[] du5s206k70mdub(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite qavfrf9gj0z(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ yuq99lkyeo8 ^ string.hashCode() ^ n2 + jj3iv46l6o4g + i * -1794171289) + yuq99lkyeo8) ^ jj3iv46l6o4g));
            }
            String[] stringArray = ghz.du5s206k70mdub(new String(cArray));
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

