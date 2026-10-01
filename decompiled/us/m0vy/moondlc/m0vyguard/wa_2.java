/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10042
 *  net.minecraft.class_10055
 *  net.minecraft.class_1007
 *  net.minecraft.class_1297
 *  net.minecraft.class_1799
 *  net.minecraft.class_1921
 *  net.minecraft.class_1937
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_2596
 *  net.minecraft.class_2663
 *  net.minecraft.class_2960
 *  net.minecraft.class_315
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_4597$class_4598
 *  net.minecraft.class_5498
 *  net.minecraft.class_591
 *  net.minecraft.class_742
 *  net.minecraft.class_7833
 *  net.minecraft.class_897
 *  net.minecraft.class_898
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.ToLongFunction;
import net.minecraft.class_10042;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_1921;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2663;
import net.minecraft.class_2960;
import net.minecraft.class_315;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_5498;
import net.minecraft.class_591;
import net.minecraft.class_742;
import net.minecraft.class_7833;
import net.minecraft.class_897;
import net.minecraft.class_898;
import us.m0vy.moondlc.m0vyguard.bba_2;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bksh;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.ttj;
import us.m0vy.moondlc.m0vyguard.thf;
import us.m0vy.moondlc.m0vyguard.trn;
import us.m0vy.moondlc.m0vyguard.hk;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="TotemAnimation", category=bzw.OTHER, desc="Renders a soul model when a player pops a totem")
public class wa_2
extends bnq {
    private static wa_2 jws;
    private static final String dtgh_2 = "Texture";
    private static final String brl = "Classic";
    private static final String rdr = "Detailed";
    private static final String thshs_2 = "Mirror";
    private static final String ztf = "Liquid";
    private static final String rhh_4 = "Glass";
    private static final String khghd = "Smoke";
    private static final String khya_2 = "Solid";
    private static final ThreadLocal hdgh_2;
    private final khd fw_2 = new khd(this, "Style");
    private final fy saa_3 = new fy(this.fw_2, "Texture");
    private final fy tssh = new fy(this.fw_2, "Classic");
    private final fy dhdn = new fy(this.fw_2, "Detailed");
    private final fy thdkh_2 = new fy(this.fw_2, "Mirror");
    private final fy zds = new fy(this.fw_2, "Liquid");
    private final fy jbz = new fy(this.fw_2, "Glass");
    private final fy bad_4 = new fy(this.fw_2, "Smoke");
    private final fy skhb = new fy(this.fw_2, "Solid");
    private final badh_2 shsd_2 = new badh_2(this, "Self").bts(true);
    private final badh_2 tds_2 = new badh_2(this, "Friends").bts(true);
    private final badh_2 thykh = new badh_2(this, "Others").bts(true);
    private final badh_2 thkhb = new badh_2((hy)this, "Self F".concat("irst Person"), this::sthd_2).bts(false);
    private final khd jtdh_2 = new khd(this, "Color Mode");
    private final fy dhshw = new fy(this.jtdh_2, "Target");
    private final fy shrkh = new fy(this.jtdh_2, "Theme");
    private final fy hbr = new fy(this.jtdh_2, "Custom");
    private final bzw_2 dhhdh = new bzw_2(this, "Custom ".concat("Color"), this::ddd_7).dhshy(new byq(Float.intBitsToFloat(-1895166591 + -1278086529), Float.intBitsToFloat(-1171404465 - 1995753807), Float.intBitsToFloat(-1845300077 - 1317270675), Float.intBitsToFloat(0x8E51F41C ^ 0xCD03F41C)));
    private final bzw_2 sjb = new bzw_2(this, "Self Color", this::jhw).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(1484797980) ^ 0x7B1B011A), Float.intBitsToFloat(-1975557953 - 1191272639), Float.intBitsToFloat(0x4A456285 ^ 0x93A6285), Float.intBitsToFloat(375913288 + 754189496)));
    private final bzw_2 khkgh = new bzw_2(this, "Friend Color", this::dghl).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-341242205) ^ 0x87DA95D7), Float.intBitsToFloat(0xC4B4D3A5 ^ 0x87DFD3A5), Float.intBitsToFloat(0xABA16B39 ^ 0xE9516B39), Float.intBitsToFloat(1766904207 - 636801423)));
    private final bzw_2 khkhy = new bzw_2(this, "Other Color", this::khft).dhshy(new byq(Float.intBitsToFloat(0xDBC44CA4 ^ 0x98BB4CA4), Float.intBitsToFloat(-2023526338 + -1151692862), Float.intBitsToFloat(Integer.reverse(-1116249296) ^ 0x4E1AEEBD), Float.intBitsToFloat(Integer.reverse(1186650847) ^ 0xB8075D62)));
    private final tay jskh_2 = new tay(this, "Alpha").shth_7(Float.intBitsToFloat(0x96B5866 ^ 0x484B5866)).dhbs_2(Float.intBitsToFloat(696437824 + 435958720)).rkh_3(Float.intBitsToFloat(350945269 - -733282315)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xC0367D86 ^ 0xC026BB46, 10)));
    private final tay dssh = new tay(this, "Duration").shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x1EB3DDE4 ^ 0x1F4BDDE4, 5))).dhbs_2(Float.intBitsToFloat(0x2C580F3F ^ 0x6CB80F3F)).rkh_3(Float.intBitsToFloat(0x249BFF3E ^ 0x195733F3)).ssd_5(Float.intBitsToFloat(Integer.reverse(1745815243) ^ 0x9379698C));
    private final tay shkw = new tay(this, "Rise Speed").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(0x25B46E2E ^ 0x65ADF7B4)).rkh_3(Float.intBitsToFloat(-856557368 + 1873927746)).ssd_5(Float.intBitsToFloat(-1474718069 + -1759593631));
    private final tay shsa_4 = new tay(this, "Scale").shth_7(Float.intBitsToFloat(-1828990510 + -1410689900)).dhbs_2(Float.intBitsToFloat(-1242639658 - 1980263536)).rkh_3(Float.intBitsToFloat(Integer.reverse(1346502797) ^ 0x8C4C8EC7)).ssd_5(1.0f);
    private final tay shqdh = new tay(this, "Fade Time").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(0x90F7BB15 ^ 0xD43FBB15)).rkh_3(Float.intBitsToFloat(1729385025 - 628380225)).ssd_5(Float.intBitsToFloat(-291122192 - -1428958224));
    private final tay rma_2 = new tay(this, "Bobbing").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(1982908323 + -934332323)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xEE6A25C8 ^ 0x5457556B, 28))).ssd_5(Float.intBitsToFloat(1310879541 + -286462732));
    private final tay sfm = new tay(this, "Spin").shth_7(Float.intBitsToFloat(Integer.reverse(-501238204) ^ 0xE159F847)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xABECF4E7 ^ 0xABEC728F, 15))).rkh_3(Float.intBitsToFloat(977128916 - -107098668)).ssd_5(0.0f);
    private final tay tsd_3 = new tay(this, "Max D".concat("istance")).shth_7(Float.intBitsToFloat(Integer.reverse(-1053165469) ^ 0x879F9C83)).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1672176232) ^ 0x5A992A39)).rkh_3(Float.intBitsToFloat(1019119536 - -63010896)).ssd_5(Float.intBitsToFloat(-1886743737 + -1291490119));
    private final tay shtn_2 = new tay(this, "Max Souls").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(0xF9F3A1D3 ^ 0xBBF3A1D3)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.reverse(-1748278700) ^ 0x6B06D3E9));
    private final badh_2 ths_2 = new badh_2(this, "Through Walls").bts(true);
    private final badh_2 jthh = new badh_2(this, "Full Bright").bts(true);
    private final badh_2 shdh_8 = new badh_2(this, "Equipment").bts(false);
    private final tay jdgh_2 = new tay((hy)this, "Fill Alpha", this::zjth).shth_7(Float.intBitsToFloat(-1100048900 - 2110690812)).dhbs_2(Float.intBitsToFloat(Integer.reverse(-438824807) ^ 0xDA401BA7)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xCC7B5D8E ^ 0xCC7B1D2E, 16))).ssd_5(Float.intBitsToFloat(Integer.reverse(653693457) ^ 0xCA7D6F64));
    private final tay khkth = new tay((hy)this, "Line Width", this::ghht_2).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(0xDB319265 ^ 0x9B919265)).rkh_3(Float.intBitsToFloat(22400221 - -1014431728)).ssd_5(Float.intBitsToFloat(0x5E482228 ^ 0x61FB111B));
    private final tay brth = new tay((hy)this, "Layers", this::thdhj).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(297220838) ^ 0x271CED88)).rkh_3(1.0f).ssd_5(1.0f);
    private final tay khrq = new tay((hy)this, "Tint St".concat("rength"), this::tthr).shth_7(0.0f).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(-1856432406) ^ 0x6A245644)).ssd_5(Float.intBitsToFloat(217757335 + 833838564));
    private final tay shz_2 = new tay((hy)this, "Color Opacity", this::hlm).shth_7(0.0f).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(1147434387) ^ 0xF4E2EAEF)).ssd_5(Float.intBitsToFloat(-1351922050 + -1881886334));
    private final tay dhrz = new tay((hy)this, "Liquid ".concat("Distortion"), this::khsw_2).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x9D55CC3B ^ 0x892E8B95, 7))).rkh_3(Float.intBitsToFloat(Integer.reverse(844300481) ^ 0xB803D823)).ssd_5(Float.intBitsToFloat(-1506470713 - 1768978721));
    private final tay shhdh = new tay((hy)this, "Liquid Speed", this::zbq).shth_7(Float.intBitsToFloat(-518215423 - -1546658764)).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(-806431940 - -1815413710)).ssd_5(Float.intBitsToFloat(-698661473 + 1741197675));
    private final bzw_2 shns_2 = new bzw_2(this, "Solid Color", this::zyd_4).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-691629717) ^ 0x9437636B), Float.intBitsToFloat(0xF04EB8E ^ 0x4C3DEB8E), Float.intBitsToFloat(310643044 - -821753500), Float.intBitsToFloat(Integer.reverse(-1596567690) ^ 0x2DAE6B05)));
    private final tay shrs_2 = new tay((hy)this, "Glass Blur", this::tfm_2).shth_7(Float.intBitsToFloat(0x26A9D582 ^ 0x6629D582)).dhbs_2(Float.intBitsToFloat(0x31F4E864 ^ 0x7304E864)).rkh_3(2.0f).ssd_5(Float.intBitsToFloat(-855387994 + 1963732826));
    private final tay khmw = new tay((hy)this, "Glass ".concat("Refraction"), this::zk).shth_7(0.0f).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(2114999906 + -1086556565)).ssd_5(Float.intBitsToFloat(Integer.reverse(660104377) ^ 0xA2007C82));
    private final tay shyz = new tay((hy)this, "Glass Brightness", this::dhak_2).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x88F850EE ^ 0x88C750EE, 8))).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(-850743182 - -1879186523)).ssd_5(Float.intBitsToFloat(-1686384873 - 1542222574));
    private final badh_2 tthn = new badh_2((hy)this, "Glass Chromatic", this::shty).bts(true);
    private final bzw_2 dhwd_2 = new bzw_2(this, "Smoke Color", this::zhm_2).dhshy(new byq(Float.intBitsToFloat(Integer.rotateLeft(0xE9926448 ^ 0xE9936824, 14)), Float.intBitsToFloat(-1531416811 - 1636724501), Float.intBitsToFloat(Integer.rotateLeft(0x83BA2FDA ^ 0x839BB5DA, 9)), Float.intBitsToFloat(1845417659 - 715970235)));
    private final tay khkf = new tay((hy)this, "Smoke Int".concat("ensity"), this::ddha_4).shth_7(Float.intBitsToFloat(391952012 - -644879937)).dhbs_2(Float.intBitsToFloat(845058152 - -232877976)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xED174189 ^ 0x202A0D45, 8))).ssd_5(1.0f);
    private final tay zja_2 = new tay((hy)this, "Smoke Speed", this::thfd).shth_7(Float.intBitsToFloat(-209758384 + 1238201725)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(0x3AE0015E ^ 0x6C3D654)).ssd_5(Float.intBitsToFloat(Integer.reverse(-667492028) ^ 0x1C610A7D));
    private final List km = new ArrayList();
    private final bba_2 sjq = new bba_2();
    private final bql<bksh> khdht_2 = this::khhs;
    private final bql<btt> smj = this::skh_4;
    private final bql<shw_3> dnl = this::rkhsh;
    private static final int sjm = -1644194780;
    private static final int ssw_2 = -1255328870;
    private static final int dhash_2 = -401036243;
    private static final int hdt_4 = 1515848526;
    private static final int teejy1w = -1907529358;
    private static final int jgqow6iy = 167981536;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int qkipjrn57pj;

    public static wa_2 dhht() {
        block0: {
            int n = 193527877;
            int n2 = (n = Integer.rotateLeft(n * -327153991, 27) ^ 0xABE04591) ^ 0x55C0DC1D;
            if ((n2 ^ n) == 1438702621) break block0;
            int cfr_ignored_0 = (0x5E49DC58 ^ n) - -1927420058;
        }
        return jws;
    }

    public wa_2() {
        jws = this;
        jws = this;
    }

    @Override
    public void nt() {
        int n = -759179056;
        n = Integer.rotateLeft(n * -1093669881, 13) ^ 0xA4670C24;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 10);
        int n2 = n ^ 0xCBD65A1F;
        if ((n2 ^ n) != -875144673) {
            int cfr_ignored_0 = (0x196982CF ^ n) + 1460767858;
        }
        this.km.clear();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void nc() {
        var3_1 = 0;
        var1_2 = -314068213;
        var1_2 = Integer.rotateLeft(var1_2 * -1719742595, 14) ^ -270354759;
        var2_3 = Integer.reverse(Integer.reverse(-1315622844 * -1882099243 + -1284911460 ^ var1_2));
        while (true) {
            block43: {
                block35: {
                    block39: {
                        block44: {
                            block41: {
                                block46: {
                                    block45: {
                                        block47: {
                                            block36: {
                                                block38: {
                                                    block37: {
                                                        block42: {
                                                            block40: {
                                                                var3_1 = ((var2_3 ^ var1_2) - -1284911460) * 1893220221;
                                                                switch (var3_1 & 7) {
                                                                    case 0: {
                                                                        if (var3_1 != -2099641504) {
                                                                            ** break;
                                                                        }
                                                                        break block35;
                                                                    }
                                                                    case 1: {
                                                                        if (var3_1 == -1637697255) break block36;
                                                                        if (var3_1 != 1253008465) {
                                                                            Integer.rotateLeft(1497270217 ^ var1_2, 14) + -756019054;
                                                                            (int)(-7238364372474205361L ^ (long)var1_2 ^ -5865794366190609719L);
                                                                            ** break;
                                                                        }
                                                                        break block37;
                                                                    }
                                                                    case 2: {
                                                                        if (var3_1 != -1274704630) {
                                                                            ** break;
                                                                        }
                                                                        break block38;
                                                                    }
                                                                    case 3: {
                                                                        if (var3_1 == 1229925763) break block39;
                                                                        if (var3_1 != -1919577693) {
                                                                            ** break;
                                                                        }
                                                                        break block40;
                                                                    }
                                                                    case 4: {
                                                                        if (var3_1 == -181802036) break block41;
                                                                        if (var3_1 != -1315622844) {
                                                                            (Integer.rotateRight(-750869698 ^ var1_2, 13) - -1728879683) * -750869697;
                                                                            ** break;
                                                                        }
                                                                        break block42;
                                                                    }
                                                                    case 5: {
                                                                        if (var3_1 == -350243939) break block43;
                                                                        if (var3_1 == 1017488269) break block44;
                                                                        if (var3_1 == -1042377587) break;
                                                                        if (var3_1 != -266442643) {
                                                                            ** break;
                                                                        }
                                                                        break block45;
                                                                    }
                                                                    case 7: {
                                                                        if (var3_1 == -977198513) break block46;
                                                                        if (var3_1 != 795112279) {
                                                                            (Integer.rotateRight(-1976209222 ^ var1_2, 4) + -1059699263) * -1976209221;
                                                                            ** break;
                                                                        }
                                                                        break block47;
                                                                    }
                                                                }
                                                                Integer.rotateLeft(-1217129659 ^ var1_2, 9) - 996930710;
                                                                (int)(8486678871588268879L ^ (long)var1_2 ^ -8682795933110811044L);
                                                                this.km.clear();
                                                                this.sjq.sjm();
                                                                wa_2.hdgh_2.remove();
                                                                return;
                                                            }
                                                            (Integer.rotateLeft(1326568252 ^ var1_2, 12) - -1752812673) * 1326568253;
                                                            yf.athz_2();
                                                            throw null;
                                                        }
                                                        (Integer.rotateRight(943039282 ^ var1_2, 10) + -757308855) * 943039283;
                                                        if (!wa_2.rlk()) {
                                                            try {
                                                                ++var3_1;
                                                                if ((3312688956582873767L ^ (long)var1_2 | 1L) == 0L) {
                                                                    throw new IllegalArgumentException();
                                                                }
                                                                var2_3 = (-1919577693 * -1882099243 + -1284911460 ^ var1_2) + -1163311540 - -1163311540;
                                                            }
                                                            catch (IllegalArgumentException v0) {
                                                                var2_3 = (-1919577693 * -1882099243 + -1284911460 ^ var1_2) + -567853515 - -567853515;
                                                            }
                                                            var3_1 += 5;
                                                            continue;
                                                        }
                                                        (int)(-4946732828803016025L ^ (long)var1_2 ^ -6623048553635194014L);
                                                        var2_3 = (1210712890 * -1882099243 + -1284911460 ^ var1_2) + 1928257864 - 1928257864;
                                                        (int)(-4155494691663833641L ^ (long)var1_2 ^ -7908120809572916872L);
                                                        var2_3 = (int)((long)(-1042377587 * -1882099243 + -1284911460 ^ var1_2) ^ 5372160423383282886L ^ 5372160423383282886L);
                                                        --var3_1;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(265844605 ^ var1_2, 4) - -275507362) * 265844605;
                                                    (int)(-3644862078833595569L ^ (long)var1_2 ^ 5760248071866300164L);
                                                    var2_3 = Integer.reverse(Integer.reverse(-784228445 * -1882099243 + -1284911460 ^ var1_2));
                                                    Integer.rotateLeft(724001097 ^ var1_2, 8) + 1042442002;
                                                    (int)(-1615156793551033521L ^ (long)var1_2 ^ 7176630154674339578L);
                                                    try {
                                                        var3_1 += 4;
                                                        if ((2334866055108499523L ^ (long)var1_2 | 1L) == 0L) {
                                                            throw new UnsupportedOperationException();
                                                        }
                                                        var2_3 = Integer.reverse(Integer.reverse(-1315622844 * -1882099243 + -1284911460 ^ var1_2));
                                                    }
                                                    catch (UnsupportedOperationException v1) {
                                                        var2_3 = (-1315622844 * -1882099243 + -1284911460 ^ var1_2) + -82717423 - -82717423;
                                                    }
                                                    continue;
                                                }
                                                Integer.rotateRight(2049044331 ^ var1_2, 18) + -830890704;
                                                var2_3 = 2122396218 * -1882099243 + -1284911460 ^ var1_2 ^ -91070114 ^ -91070114;
                                                Integer.rotateLeft(-2122357692 ^ var1_2, 3) - -1295334537;
                                                var2_3 = Integer.reverse(Integer.reverse(-1315622844 * -1882099243 + -1284911460 ^ var1_2));
                                                Integer.rotateRight(1679585954 ^ var1_2, 15) + 600801497;
                                                var3_1 -= 5;
                                                continue;
                                            }
                                            Integer.rotateLeft(-1885924351 ^ var1_2, 4) + 1739131738;
                                            (int)(5559054082587814735L ^ (long)var1_2 ^ -8572457742240237670L);
                                            var2_3 = (398853960 * -1882099243 + -1284911460 ^ var1_2) + 750496085 - 750496085;
                                            Integer.rotateLeft(829476357 ^ var1_2, 9) - 17207766;
                                            (int)(-882036782708495537L ^ (long)var1_2 ^ 4395657384773044821L);
                                            (int)(3813915624278255699L ^ (long)var1_2 ^ 9037462651600487434L);
                                            var2_3 = (-1315622844 * -1882099243 + -1284911460 ^ var1_2) + -1594892995 - -1594892995;
                                            var3_1 += 3;
                                            continue;
                                        }
                                        Integer.rotateLeft(-1287437532 ^ var1_2, 9) - -1182613353;
                                        var2_3 = -73189879 * -1882099243 + -1284911460 ^ var1_2 ^ -698790055 ^ -698790055;
                                        (Integer.rotateLeft(1212035996 ^ var1_2, 12) - -1008345313) * 1212035997;
                                        var2_3 = (int)((long)(-1315622844 * -1882099243 + -1284911460 ^ var1_2) ^ -5340396965322363365L ^ -5340396965322363365L);
                                        var3_1 += 4;
                                        continue;
                                    }
                                    Integer.rotateLeft(-65676087 ^ var1_2, 18) + -1962714222;
                                    (int)(4514703544428063567L ^ (long)var1_2 ^ 1772310601829830815L);
                                    var2_3 = -1186755746 * -1882099243 + -1284911460 ^ var1_2 ^ -862437561 ^ -862437561;
                                    (Integer.rotateRight(1346186107 ^ var1_2, 13) + -1144659168) * 1346186107;
                                    try {
                                        var3_1 -= 4;
                                        if ((-5521790038018696103L ^ (long)var1_2 | 1L) == 0L) {
                                            throw new UnsupportedOperationException();
                                        }
                                        var2_3 = (int)((long)(-1315622844 * -1882099243 + -1284911460 ^ var1_2) ^ -2636589671034531315L ^ -2636589671034531315L);
                                    }
                                    catch (UnsupportedOperationException v2) {
                                        var2_3 = Integer.reverse(Integer.reverse(-1315622844 * -1882099243 + -1284911460 ^ var1_2));
                                    }
                                    var3_1 += 2;
                                    continue;
                                }
                                (Integer.rotateRight(39428926 ^ var1_2, 3) - 1295541181) * 39428927;
                                var2_3 = 1061048462 * -1882099243 + -1284911460 ^ var1_2 ^ 2026192217 ^ 2026192217;
                                (Integer.rotateLeft(934492337 ^ var1_2, 9) + -1022264150) * 934492337;
                                (int)(-792186530732643505L ^ (long)var1_2 ^ -3429346967783192622L);
                                var2_3 = (int)((long)(1971581397 * -1882099243 + -1284911460 ^ var1_2) ^ 8478019762592702755L ^ 8478019762592702755L);
                                (Integer.rotateLeft(625915316 ^ var1_2, 7) - -1998217209) * 625915317;
                                var2_3 = -1315622844 * -1882099243 + -1284911460 ^ var1_2 ^ 345196773 ^ 345196773;
                                var3_1 -= 4;
                                continue;
                            }
                            (Integer.rotateLeft(2123475548 ^ var1_2, 18) - 1476477023) * 2123475549;
                            var2_3 = (259860709 * -1882099243 + -1284911460 ^ var1_2) + 1055187518 - 1055187518;
                            Integer.rotateRight(-1086422546 ^ var1_2, 10) - 753883917;
                            var2_3 = (int)((long)(-1315622844 * -1882099243 + -1284911460 ^ var1_2) ^ 910024532923676060L ^ 910024532923676060L);
                            var3_1 += 5;
                            continue;
                        }
                        Integer.rotateLeft(99429804 ^ var1_2, 3) - -1139398897;
                        var2_3 = -656474246 * -1882099243 + -1284911460 ^ var1_2;
                        (Integer.rotateLeft(986389625 ^ var1_2, 10) + 586551778) * 986389625;
                        (int)(-542206274325648561L ^ (long)var1_2 ^ -7351982243222889182L);
                        try {
                            var3_1 -= 2;
                            var2_3 = Integer.reverse(Integer.reverse(-1315622844 * -1882099243 + -1284911460 ^ var1_2));
                        }
                        catch (ArithmeticException v3) {
                            var2_3 = (int)((long)(-1315622844 * -1882099243 + -1284911460 ^ var1_2) ^ -338644181996354145L ^ -338644181996354145L);
                        }
                        ++var3_1;
                        continue;
                    }
                    (Integer.rotateLeft(1849555669 ^ var1_2, 16) - 1574895366) * 1849555669;
                    (int)(-6012493621438911665L ^ (long)var1_2 ^ 6098018043919135951L);
                    var2_3 = Integer.reverse(Integer.reverse(-176819901 * -1882099243 + -1284911460 ^ var1_2));
                    Integer.rotateRight(248355975 ^ var1_2, 4) - -817654892;
                    (int)(2459959254761175205L ^ (long)var1_2 ^ -963340131862976106L);
                    var2_3 = 110641928 * -1882099243 + -1284911460 ^ var1_2 ^ 842605266 ^ 842605266;
                    (int)(2987981210382121970L ^ (long)var1_2 ^ 2258603658424090431L);
                    var2_3 = (-1315622844 * -1882099243 + -1284911460 ^ var1_2) + 1281534644 - 1281534644;
                    var3_1 -= 4;
                    continue;
                }
                Integer.rotateLeft(-1758334592 ^ var1_2, 5) + 1399446971;
                var2_3 = (int)((long)(-434463366 * -1882099243 + -1284911460 ^ var1_2) ^ 5019286034907089199L ^ 5019286034907089199L);
                Integer.rotateLeft(109727333 ^ var1_2, 3) - -820175498;
                (int)(-4307446374349870257L ^ (long)var1_2 ^ 4449700580301481376L);
                try {
                    var3_1 -= 5;
                    if ((-788195816722086005L ^ (long)var1_2 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    var2_3 = (-1315622844 * -1882099243 + -1284911460 ^ var1_2) + 222802683 - 222802683;
                }
                catch (ArithmeticException v4) {
                    var2_3 = (int)((long)(-1315622844 * -1882099243 + -1284911460 ^ var1_2) ^ -7643692684053557259L ^ -7643692684053557259L);
                }
                var3_1 -= 4;
                continue;
            }
            Integer.rotateLeft(-393951123 ^ var1_2, 16) - 745661550;
            (int)(3041731092787030863L ^ (long)var1_2 ^ 3589513051473836477L);
            try {
                --var3_1;
                if ((-3730636855156150239L ^ (long)var1_2 | 1L) == 0L) {
                    throw new NoSuchElementException();
                }
                var2_3 = Integer.reverse(Integer.reverse(-1315622844 * -1882099243 + -1284911460 ^ var1_2));
            }
            catch (NoSuchElementException v5) {
                var2_3 = -1315622844 * -1882099243 + -1284911460 ^ var1_2 ^ 2062275784 ^ 2062275784;
            }
            var3_1 += 4;
            continue;
lbl246:
            // 8 sources

            Integer.rotateLeft(1033373696 ^ var1_2, 10) + 2043057979;
            var2_3 = -1315622844 * -1882099243 + -1284911460 ^ var1_2 ^ -1311802844 ^ -1311802844;
        }
    }

    public void bhq(class_1297 class_12972) {
        class_742 class_7423;
        block10: {
            block9: {
                int n = -323462993;
                n = Integer.rotateLeft(n * -1306959873, 21) ^ 0x9D407968;
                n = System.identityHashCode(this) ^ n;
                int n2 = n ^ 0x8E58780D;
                if ((n2 ^ n) != -1906804723) {
                    int cfr_ignored_0 = (0x62E020A2 ^ n) - 486094409;
                }
                if (!yf.khdha_2()) {
                    wa_2.nf();
                    throw null;
                }
                if (!(class_12972 instanceof class_742)) break block9;
                class_7423 = (class_742)class_12972;
                if (wa_2.mc.field_1687 != null && wa_2.mc.field_1724 != null) break block10;
            }
            return;
        }
        ttj ttj2 = this.dhshk(class_7423);
        if (ttj2 == ttj.dtz_2 && (!this.shsd_2.shzl() || !this.thkhb.shzl() && wa_2.tnt_2(wa_2.mc.field_1690) == class_5498.field_26664)) {
            return;
        }
        if (ttj2 == ttj.daj_2 && !this.tds_2.shzl()) {
            return;
        }
        if (ttj2 == ttj.thdhsh && !this.thykh.shzl()) {
            return;
        }
        class_897 class_8972 = wa_2.bst_3(mc.method_1561(), (class_1297)class_7423);
        if (!(class_8972 instanceof class_1007)) {
            return;
        }
        class_1007 class_10072 = (class_1007)class_8972;
        class_10055 class_100552 = class_10072.method_62608();
        wa_2.khzk_2(class_10072, class_7423, class_100552, 1.0f);
        class_243 class_2432 = new class_243(class_100552.field_53325, class_100552.field_53326, class_100552.field_53327);
        this.zhsh_3(class_100552);
        this.km.add(new hk(class_7423, class_10072, class_100552, class_2432, ttj2, class_7423.method_5477().getString(), System.currentTimeMillis(), this.km.size()));
        wa_2.jmj(this);
    }

    private void zhsh_3(class_10055 class_100552) {
        class_100552.field_53337 = null;
        class_100552.field_53464 = null;
        class_100552.field_53338 = null;
        class_100552.field_53324 = null;
        class_100552.field_53335 = false;
        class_100552.field_53460 = false;
        class_100552.field_53462 = false;
        class_100552.field_53333 = false;
        class_100552.field_53461 = false;
        class_100552.field_53336 = class_243.field_1353;
        class_100552.field_53539 = 0;
        class_100552.field_53540 = 0;
        class_100552.field_53522 = false;
        class_100552.field_53532 = false;
        if (!this.shdh_8.shzl()) {
            class_100552.field_55309 = class_1799.field_8037;
            class_100552.field_53418 = class_1799.field_8037;
            class_100552.field_53419 = class_1799.field_8037;
            class_100552.field_53420 = class_1799.field_8037;
            class_100552.field_55305.method_65605();
            class_100552.field_55307.method_65605();
            class_100552.field_53467.method_65605();
            class_100552.field_55317.method_65605();
        }
    }

    private void zds_4() {
        int n = 0;
        int n2 = 0;
        int n3 = -538998300;
        n3 = Integer.rotateLeft(n3 * -375024977, 3) ^ 0x861B7595;
        n3 = System.identityHashCode(this) ^ n3;
        int n4 = 1451144479 + n3 + -1066214482 - -1066214482;
        block48: while (true) {
            switch (n4 - n3) {
                case -1905639438: {
                    int cfr_ignored_0 = (Integer.rotateRight(0x62AEAA5F ^ n3, 15) - -142327620) * 1655614047;
                    this.km.removeFirst();
                    n4 = Integer.reverse(Integer.reverse(-1700373540 + n3));
                    --n2;
                    continue block48;
                }
                case 942623267: {
                    int cfr_ignored_1 = Integer.rotateRight(0x5B93EB8E ^ n3, 14) - 457647469;
                    n = Math.max(1, Math.round(wa_2.tta(this.shtn_2)));
                    if (this.km.size() <= n) {
                        try {
                            if ((0x1BA5565871B90A3FL ^ (long)n3 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n4 = (int)((long)(1714545713 + n3) ^ 0xEFE6E143A5DAB271L ^ 0xEFE6E143A5DAB271L);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n4 = Integer.reverse(Integer.reverse(1714545713 + n3));
                        }
                        n2 += 4;
                        continue block48;
                    }
                    n4 = -242655408 + n3 ^ 0x2C4C2C0A ^ 0x2C4C2C0A;
                    int cfr_ignored_2 = (Integer.rotateLeft(0x96F25478 ^ n3, 5) + 1270208963) * -1762503559;
                    n4 = -2112030538 + n3 ^ 0x40C34D61 ^ 0x40C34D61;
                    n2 -= 2;
                    continue block48;
                }
                case -705517647: {
                    int cfr_ignored_3 = Integer.rotateRight(0x1357290B ^ n3, 5) + 1542166416;
                    throw null;
                }
                case -2112030538: {
                    int cfr_ignored_4 = (Integer.rotateRight(0xF137CD3A ^ n3, 17) + 975141185) * -248001221;
                    this.km.sort(wa_2.sas_3(hk::spawnTime));
                    try {
                        n2 += 4;
                        n4 = (int)((long)(-1700373540 + n3) ^ 0x62719BE284A2F5FDL ^ 0x62719BE284A2F5FDL);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n4 = -1700373540 + n3 + -219762737 - -219762737;
                    }
                    --n2;
                    continue block48;
                }
                case -2001648163: {
                    int cfr_ignored_5 = Integer.rotateRight(0xC9A52A4E ^ n3, 12) - 1868414637;
                    this.km.sort(wa_2.sas_3(hk::spawnTime));
                    n4 = Integer.reverse(Integer.reverse(-1700373540 + n3));
                    n2 += 5;
                    continue block48;
                }
                case 1451144479: {
                    int cfr_ignored_6 = (Integer.rotateLeft(0x5B1678D8 ^ n3, 14) + 202785123) * 1528199385;
                    if (yf.dnkh()) {
                        int cfr_ignored_7 = (int)(0x107D41BB130131F4L ^ (long)n3 ^ 0x7E06EAB198CF8D2BL);
                        n4 = (int)((long)(-432744793 + n3) ^ 0xEEBAEE0D0414C6B6L ^ 0xEEBAEE0D0414C6B6L);
                        int cfr_ignored_8 = (int)(0x13824C42C9F46119L ^ (long)n3 ^ 0x65F55F5B39158AD5L);
                        n4 = -705517647 + n3;
                        continue block48;
                    }
                    n4 = 942623267 + n3;
                    n2 -= 2;
                    continue block48;
                }
                case -494517692: {
                    int cfr_ignored_9 = Integer.rotateRight(0x70BB4DC6 ^ n3, 17) - -1425274315;
                    return;
                }
                case -1700373540: {
                    int cfr_ignored_10 = Integer.rotateRight(0x951787E3 ^ n3, 5) + 305599416;
                    if (this.km.size() > n) {
                        n4 = 1910953077 + n3 + 1462445792 - 1462445792;
                        int cfr_ignored_11 = Integer.rotateLeft(0xDE7B16A5 ^ n3, 14) - -180003530;
                        int cfr_ignored_12 = (int)(0x1CC9B89827D4EB4FL ^ (long)n3 ^ 0x8C40831A2DB99442L);
                        n4 = Integer.reverse(Integer.reverse(-1905639438 + n3));
                        continue block48;
                    }
                    try {
                        --n2;
                        n4 = -494517692 + n3;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n4 = Integer.reverse(Integer.reverse(-494517692 + n3));
                    }
                    n2 -= 4;
                    continue block48;
                }
                case 1714545713: {
                    int cfr_ignored_13 = Integer.rotateRight(0x1BB1D6C3 ^ n3, 6) + 1592172760;
                    return;
                }
                case 1700771576: {
                    int cfr_ignored_14 = (Integer.rotateRight(0x8CEC7F1B ^ n3, 4) + 352387968) * -1930658021;
                    try {
                        n2 += 2;
                        if ((0xC0C411FBA3835CB1L ^ (long)n3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n4 = Integer.reverse(Integer.reverse(1451144479 + n3));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n4 = 1451144479 + n3 + -935384537 - -935384537;
                    }
                    ++n2;
                    continue block48;
                }
                case 1404085638: {
                    int cfr_ignored_15 = (Integer.rotateLeft(0xF13E8E1C ^ n3, 17) - 988861599) * -247558627;
                    try {
                        n2 -= 3;
                        n4 = 1451144479 + n3 ^ 0x2E4145A7 ^ 0x2E4145A7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n4 = 1451144479 + n3;
                    }
                    n2 -= 4;
                    continue block48;
                }
                case -1810053698: {
                    int cfr_ignored_16 = Integer.rotateRight(0xCD7EAA46 ^ n3, 12) - -424395339;
                    n4 = -1784780406 + n3 + 1872163659 - 1872163659;
                    int cfr_ignored_17 = (Integer.rotateLeft(0x9326C015 ^ n3, 5) - -703667770) * -1826177003;
                    int cfr_ignored_18 = (int)(0x51946E2827D4EB4FL ^ (long)n3 ^ 0x2120831A2DB90EF9L);
                    n4 = 1451144479 + n3 ^ 0xDE789A97 ^ 0xDE789A97;
                    n2 += 4;
                    continue block48;
                }
                case -143002150: {
                    int cfr_ignored_19 = Integer.rotateRight(0xD432F98E ^ n3, 13) - -1232480403;
                    try {
                        n4 = Integer.reverse(Integer.reverse(1451144479 + n3));
                    }
                    catch (IllegalStateException illegalStateException) {
                        n4 = 1451144479 + n3;
                    }
                    n2 -= 5;
                    continue block48;
                }
                case 1506893174: {
                    int cfr_ignored_20 = (Integer.rotateLeft(0x3064EFC ^ n3, 3) - 1646342079) * 50745085;
                    n4 = Integer.reverse(Integer.reverse(44218139 + n3));
                    int cfr_ignored_21 = (Integer.rotateRight(0x395F7B16 ^ n3, 10) - -152205595) * 962558743;
                    int cfr_ignored_22 = (int)(0x2B47ADB94B821A5FL ^ (long)n3 ^ 0xA6025BB7CF99FB5EL);
                    n4 = 1451144479 + n3;
                    continue block48;
                }
                case 1091657388: {
                    int cfr_ignored_23 = (Integer.rotateRight(0xD0E5AB7A ^ n3, 13) + 1345151745) * -790254725;
                    n4 = 167596586 + n3 + -2015139432 - -2015139432;
                    int cfr_ignored_24 = Integer.rotateRight(0xBAE60D67 ^ n3, 10) - -1506197836;
                    n4 = Integer.reverse(Integer.reverse(1451144479 + n3));
                    int cfr_ignored_25 = Integer.rotateLeft(0x7583F7EC ^ n3, 17) - 1062773967;
                    n2 -= 3;
                    continue block48;
                }
                case -1330136330: {
                    int cfr_ignored_26 = (Integer.rotateRight(0x80300DB6 ^ n3, 3) - -1976612795) * -2144334409;
                    n4 = Integer.reverse(Integer.reverse(-1096847312 + n3));
                    int cfr_ignored_27 = (Integer.rotateLeft(0x73C35A71 ^ n3, 17) + 151360234) * 1942182513;
                    int cfr_ignored_28 = (int)(0xB171F44C27D4EB4FL ^ (long)n3 ^ 0x15E8831A2DB8CF32L);
                    try {
                        n2 += 4;
                        n4 = Integer.reverse(Integer.reverse(1451144479 + n3));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n4 = 1451144479 + n3 ^ 0xE136C5CC ^ 0xE136C5CC;
                    }
                    n2 -= 2;
                    continue block48;
                }
                case -7454692: {
                    int cfr_ignored_29 = Integer.rotateLeft(0x818C085 ^ n3, 4) - -10686634;
                    int cfr_ignored_30 = (int)(0xCAAA6EB827D4EB4FL ^ (long)n3 ^ 0x2000831A2DB83885L);
                    n4 = Integer.reverse(Integer.reverse(888552314 + n3));
                    int cfr_ignored_31 = (Integer.rotateLeft(0x5DF4C5F1 ^ n3, 14) + 1694603114) * 1576322545;
                    int cfr_ignored_32 = (int)(0x9F466BCC27D4EB4FL ^ (long)n3 ^ 0x2AE8831A2DB8935DL);
                    try {
                        if ((0xE0DB332655B67273L ^ (long)n3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n4 = 1451144479 + n3;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n4 = 1451144479 + n3 ^ 0x96C21DD1 ^ 0x96C21DD1;
                    }
                    continue block48;
                }
                case 588356380: {
                    int cfr_ignored_33 = (Integer.rotateLeft(0x9444709D ^ n3, 5) - -123256258) * -1807454051;
                    int cfr_ignored_34 = (int)(0x56F6DEA027D4EB4FL ^ (long)n3 ^ 0x4030831A2DB9003CL);
                    n4 = -2060763253 + n3;
                    int cfr_ignored_35 = Integer.rotateRight(0x6105A4CE ^ n3, 15) - -1005808595;
                    try {
                        n2 += 2;
                        if ((0x788357967863FF9BL ^ (long)n3 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n4 = Integer.reverse(Integer.reverse(1451144479 + n3));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n4 = 1451144479 + n3 + 1828921673 - 1828921673;
                    }
                    ++n2;
                    continue block48;
                }
                case -1163243082: {
                    int cfr_ignored_36 = (Integer.rotateLeft(0x74835B18 ^ n3, 17) + 541435683) * 1954765593;
                    n4 = -994416321 + n3 + -1669398328 - -1669398328;
                    int cfr_ignored_37 = Integer.rotateLeft(0xBD6B1D81 ^ n3, 10) + -195677734;
                    int cfr_ignored_38 = (int)(0x7FD9B3BC27D4EB4FL ^ (long)n3 ^ 0x9A08831A2DB95262L);
                    try {
                        if ((0x35B458D0094894EDL ^ (long)n3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n4 = 1451144479 + n3 + -673340573 - -673340573;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n4 = 1451144479 + n3;
                    }
                    continue block48;
                }
                case 318637039: {
                    int cfr_ignored_39 = (Integer.rotateLeft(0x18CCF654 ^ n3, 6) - 86995815) * 416085589;
                    try {
                        ++n2;
                        if ((0xDB7660DCEB6AA7A3L ^ (long)n3 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n4 = 1451144479 + n3 ^ 0x277ECE24 ^ 0x277ECE24;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n4 = (int)((long)(1451144479 + n3) ^ 0xFEB5D0E9653600F2L ^ 0xFEB5D0E9653600F2L);
                    }
                    n2 -= 5;
                    continue block48;
                }
                case 1454023560: {
                    int cfr_ignored_40 = (Integer.rotateLeft(0x7036BB0 ^ n3, 3) + -574117493) * 117664689;
                    try {
                        n2 += 2;
                        if ((0x861CCA7127A89E5BL ^ (long)n3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n4 = 1451144479 + n3 ^ 0xB62F74D9 ^ 0xB62F74D9;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n4 = Integer.reverse(Integer.reverse(1451144479 + n3));
                    }
                    ++n2;
                    continue block48;
                }
                case 1418068834: {
                    int cfr_ignored_41 = (Integer.rotateLeft(0xA0AF1B5C ^ n3, 7) - 2039607135) * -1599136931;
                    n4 = 52801684 + n3 + -509448549 - -509448549;
                    int cfr_ignored_42 = Integer.rotateRight(0xBAC6FCC2 ^ n3, 10) + -1569310023;
                    int cfr_ignored_43 = (int)(0xAC0DEB92B7368EDL ^ (long)n3 ^ 0x40029A552AFDB850L);
                    n4 = 1414407997 + n3 ^ 0x69CC35A8 ^ 0x69CC35A8;
                    int cfr_ignored_44 = (int)(0xD112EB34A91C40C6L ^ (long)n3 ^ 0x2B199E8B7AAA0FF4L);
                    n4 = 1451144479 + n3 ^ 0xB4F67499 ^ 0xB4F67499;
                    n2 += 3;
                    continue block48;
                }
            }
            int cfr_ignored_45 = (Integer.rotateLeft(0xE595DB5 ^ n3, 4) - -1053820890) * 240737717;
            int cfr_ignored_46 = (int)(0xCCEBF38827D4EB4FL ^ (long)n3 ^ 0x1A60831A2DB83406L);
            n4 = 1451144479 + n3 ^ 0x3A74FF19 ^ 0x3A74FF19;
        }
    }

    private void jqh_2(hk hk2, float f) {
        hdgh_2.set(new trn(this, hk2, f));
    }

    private void jjy() {
        hdgh_2.remove();
    }

    public static boolean hkhk() {
        return hdgh_2.get() != null;
    }

    public static trn dhbh() {
        return (trn)hdgh_2.get();
    }

    public static class_1921 zwd(class_2960 class_29602, class_1921 class_19212) {
        trn trn2 = (trn)hdgh_2.get();
        if (trn2 == null) {
            return class_19212;
        }
        return trn2.zsk_3(class_29602, class_19212);
    }

    public static int rhth(int n) {
        try {
            int n2 = 1371299530;
            n2 = Integer.rotateLeft(n2 * -1703516237, 20) ^ 0x623E84E1;
            n2 = n ^ n2;
            int n3 = n2 ^ 0xBF49670B;
            if ((n3 ^ n2) != -1085708533) {
                int cfr_ignored_0 = (0xEEF539C1 ^ n2) - -1528272488;
            }
            if ((0x276 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        trn trn2 = (trn)hdgh_2.get();
        return trn2 == null ? n : wa_2.tfa_3(trn2, n);
    }

    public static boolean jjth() {
        trn trn2 = (trn)hdgh_2.get();
        return trn2 != null && trn2.zdhw();
    }

    public void zaz(class_4587 class_45872, class_591 class_5912, class_10055 class_100552) {
        trn trn2 = (trn)hdgh_2.get();
        if (trn2 == null || !trn2.dthth()) {
            return;
        }
        this.sjq.hyr(class_45872, class_5912, trn2);
    }

    private ttj dhshk(class_742 class_7423) {
        int n = 2036315609;
        n = Integer.rotateLeft(n * -1778386897, 21) ^ 0xAC1EB74;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
        int n2 = n ^ 0xDF4D09E5;
        if ((n2 ^ n) != -548599323) {
            int cfr_ignored_0 = (0xA612BC3C ^ n) - 2060826418;
        }
        if (class_7423 == wa_2.mc.field_1724) {
            return ttj.dtz_2;
        }
        boolean bl = wa_2.zzh_8().getFriendManager().adhj(wa_2.znq(class_7423).getString());
        return bl ? ttj.daj_2 : ttj.thdhsh;
    }

    private byq tnj(hk hk2) {
        try {
            int n = 2055433375;
            n = Integer.rotateLeft(n * -542336177, 11) ^ 0x8D84E093;
            n = System.identityHashCode(this) ^ n;
            hk hk3 = hk2;
            n = (hk3 != null ? System.identityHashCode(hk3) : 0) ^ n;
            int n2 = n ^ 0xD67128F;
            if ((n2 ^ n) != 224858767) {
                int cfr_ignored_0 = (0x77E47E10 ^ n) + -599111566;
            }
            if ((0xE9 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            wa_2.bsj_2();
        }
        if (this.jtdh_2.sdh_2() == this.shrkh) {
            byq byq2 = bhj_2.ths();
            return byq2;
        }
        if (wa_2.jb(this.jtdh_2) == this.hbr) {
            return wa_2.zht_5(this.dhhdh);
        }
        return switch (wa_2.jyt_2(hk2).ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> this.sjb.sdsh_4();
            case 1 -> wa_2.ddh_8(this.khkgh);
            case 2 -> this.khkhy.sdsh_4();
        };
    }

    private int dhbdh() {
        block0: {
            int n = -1863136011;
            int n2 = (n = Integer.rotateLeft(n * 388454601, 24) ^ 0x66C5918E) ^ 0x9261FB82;
            if ((n2 ^ n) == -1839072382) break block0;
            int cfr_ignored_0 = (0x2933777 ^ n) - -775648766;
        }
        return Math.max(1, Math.round(wa_2.tfj_2(this.dssh) * Float.intBitsToFloat(0xF10CC6E9 ^ 0xB576C6E9)));
    }

    public boolean ghdsh_2() {
        int n = 1745111814;
        n = Integer.rotateLeft(n * -1880416999, 7) ^ 0xEF6761F7;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 29);
        int n2 = n ^ 0x9EA77DDF;
        if ((n2 ^ n) != -1633190433) {
            int cfr_ignored_0 = (0xF6A336D9 ^ n) - -2136785817;
        }
        return wa_2.hht_4(this.fw_2) == this.dhdn;
    }

    public boolean saz_4() {
        try {
            int n = 2126174617;
            n = Integer.rotateLeft(n * -840153723, 9) ^ 0xD3CF02C6;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 12);
            int n2 = n ^ 0x2E9AADA5;
            if ((n2 ^ n) != 781888933) {
                int cfr_ignored_0 = (0x5020743C ^ n) + 1576695384;
            }
            if ((0x360 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return wa_2.ddhj_2(this.fw_2) == this.thdkh_2;
    }

    public boolean thksh() {
        try {
            int n = -1137593531;
            n = Integer.rotateLeft(n * -1520529401, 3) ^ 0x1311AD2F;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 9);
            int n2 = n ^ 0x322C3979;
            if ((n2 ^ n) != 841759097) {
                int cfr_ignored_0 = (0x8E1D8A3C ^ n) + 880301034;
            }
            if ((0x1E8 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return this.fw_2.sdh_2() == this.zds;
    }

    public boolean tghr() {
        int n = -1264656330;
        n = Integer.rotateLeft(n * -609159753, 19) ^ 0xAA445D45;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xF2F2E10D;
        if ((n2 ^ n) != -218963699) {
            int cfr_ignored_0 = (0x466C013B ^ n) - 201089009;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return this.fw_2.sdh_2() == this.jbz;
    }

    public boolean jkth() {
        int n = 216032426;
        n = Integer.rotateLeft(n * 738197191, 18) ^ 0xE526FB59;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x9DD60436;
        if ((n2 ^ n) != -1646918602) {
            int cfr_ignored_0 = (0x9136609C ^ n) - -463802165;
        }
        return this.fw_2.sdh_2() == this.bad_4;
    }

    public boolean byf() {
        int n = 575750539;
        n = Integer.rotateLeft(n * -1016570247, 13) ^ 0xCCC025A0;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
        int n2 = n ^ 0xF2BBA89F;
        if ((n2 ^ n) != -222582625) {
            int cfr_ignored_0 = (0xD0EAE914 ^ n) + 1460573380;
        }
        if (wa_2.dtth()) {
            throw null;
        }
        return wa_2.zbh(this.fw_2) == this.skhb;
    }

    public boolean jl_2() {
        try {
            int n = -967630169;
            n = Integer.rotateLeft(n * -784522437, 6) ^ 0x2A6CAA76;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8E3A5705;
            if ((n2 ^ n) != -1908779259) {
                int cfr_ignored_0 = (0x486975A2 ^ n) - -668823673;
            }
            if ((0x311 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return this.saz_4() || this.thksh() || this.tghr() || this.jkth();
    }

    public boolean shq() {
        int n = thf.ssm_3(-809881771);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 17);
        int n2 = n ^ 0x5A51E7B8;
        if ((n2 ^ n) != 1515317176) {
            int cfr_ignored_0 = Integer.rotateLeft(0x95EBC8ED ^ n, 5) - 736818158;
            int cfr_ignored_1 = (int)(0x575966D027D4EB4FL ^ (long)n ^ 0x30D0831A2DB90363L);
        }
        if (!yf.khdha_2()) {
            wa_2.ashs();
            throw null;
        }
        return this.ghdsh_2() || wa_2.ras_4(this) || this.byf();
    }

    private static float dthq_2(float f) {
        try {
            int n = -1642017363;
            n = Integer.rotateLeft(n * 1220587111, 24) ^ 0xE0BD1A25;
            int n2 = n ^ 0xDEC51D3B;
            if ((n2 ^ n) != -557507269) {
                int cfr_ignored_0 = (0x40E5D096 ^ n) + -2056902402;
            }
            if ((0x2AE & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        float f2 = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        return 1.0f - (float)Math.pow(1.0f - f2, wa_2.aysh(0xA932E4291B048B72L ^ 0xE93AE4291B048B72L));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void rkhsh(shw_3 shw2) {
        int n = 1211854211;
        n = Integer.rotateLeft(n * -695680451, 16) ^ 0x1735E9D0;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 21);
        shw_3 shw3 = shw2;
        n = (shw3 != null ? System.identityHashCode(shw3) : 0) ^ n;
        int n2 = n ^ 0x4E70B261;
        if ((n2 ^ n) != 1316008545) {
            int cfr_ignored_0 = (0x64BDFE2 ^ n) + -1526938404;
        }
        if (this.km.isEmpty() || wa_2.mc.field_1773 == null) {
            return;
        }
        class_243 class_2432 = wa_2.mc.field_1773.method_19418().method_19326();
        class_4597.class_4598 class_45982 = mc.method_22940().method_23000();
        long l = System.currentTimeMillis();
        long l2 = this.dhbdh();
        for (hk hk2 : List.copyOf(this.km)) {
            float f = hk2.alphaFactor(l, l2, this.shqdh.thw_5());
            if (f <= Float.intBitsToFloat(Integer.rotateLeft(0x1BE02706 ^ 0x6B43E53B, 12))) continue;
            float f2 = (float)(l - hk2.spawnTime()) / Float.intBitsToFloat(0x1B8A071B ^ 0x5FF0071B);
            float f3 = class_3532.method_15363((float)((float)(l - hk2.spawnTime()) / (float)l2), (float)0.0f, (float)1.0f);
            double d = this.shkw.thw_5() * f2;
            double d2 = Math.sin((double)f3 * Double.longBitsToDouble(0xC0E3E0784212189CL ^ 0x80EAC18316563584L) * Double.longBitsToDouble(0x8E0EBC3541BC056EL ^ 0xCE0EBC3541BC056EL)) * (double)this.rma_2.thw_5();
            float f4 = this.shsa_4.thw_5() * (Float.intBitsToFloat(Integer.reverse(1977036838) ^ 0x5B792921) + wa_2.dthq_2(f3) * Float.intBitsToFloat(0x421555DB ^ 0x7F3682D1));
            int n3 = this.jthh.shzl() ? -917126504 + 932855384 : mc.method_1561().method_23839((class_1297)hk2.player(), shw2.skz_4());
            shw2.ssha_2().method_22903();
            shw2.ssha_2().method_22904(hk2.position().field_1352 - class_2432.field_1352, hk2.position().field_1351 + d + d2 - class_2432.field_1351, hk2.position().field_1350 - class_2432.field_1350);
            if (this.sfm.thw_5() != 0.0f) {
                shw2.ssha_2().method_22907(class_7833.field_40716.rotationDegrees(f2 * this.sfm.thw_5()));
            }
            if (f4 != 1.0f) {
                shw2.ssha_2().method_22905(f4, f4, f4);
            }
            this.jqh_2(hk2, f);
            try {
                hk2.renderer().method_4054((class_10042)hk2.state(), shw2.ssha_2(), (class_4597)class_45982, n3);
            }
            finally {
                this.jjy();
                shw2.ssha_2().method_22909();
            }
        }
        class_45982.method_22993();
    }

    private void skh_4(btt btt2) {
        try {
            int n = -708844930;
            n = Integer.rotateLeft(n * 1093463989, 15) ^ 0x725433C7;
            btt btt3 = btt2;
            n = Integer.rotateRight((btt3 != null ? System.identityHashCode(btt3) : 0) ^ n, 28);
            int n2 = n ^ 0x44992A62;
            if ((n2 ^ n) != 1150888546) {
                int cfr_ignored_0 = (0x9126C81C ^ n) - -1210553584;
            }
            if ((0x27A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (wa_2.mc.field_1724 == null) {
            this.km.clear();
            return;
        }
        long l = System.currentTimeMillis();
        long l2 = this.dhbdh();
        double d = this.tsd_3.thw_5() * this.tsd_3.thw_5();
        class_243 class_2432 = wa_2.mc.field_1724.method_19538();
        Iterator iterator = this.km.iterator();
        while (iterator.hasNext()) {
            hk hk2 = (hk)iterator.next();
            if (l - hk2.spawnTime() < l2 && !(hk2.position().method_1025(class_2432) > d)) continue;
            iterator.remove();
        }
        this.zds_4();
    }

    private void khhs(bksh bksh2) {
        class_2663 class_26632;
        class_2596 class_25962;
        int n = -1779906966;
        n = Integer.rotateLeft(n * 1939360527, 25) ^ 0x7F2B1354;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x4A4AB774;
        if ((n2 ^ n) != 1246410612) {
            int cfr_ignored_0 = (0xDFA2711E ^ n) + 1722011694;
        }
        if ((class_25962 = bksh2.asw()) instanceof class_2663 && (class_26632 = (class_2663)class_25962).method_11470() == Integer.rotateLeft(0x7A34AD4D ^ 0x7A34214D, 22)) {
            mc.execute(() -> this.szt_4(class_26632));
        }
    }

    private void szt_4(class_2663 class_26632) {
        class_1297 class_12972;
        int n = 1098442080;
        n = Integer.rotateLeft(n * 1361753601, 9) ^ 0x3C4A5BE0;
        class_2663 class_26633 = class_26632;
        n = (class_26633 != null ? System.identityHashCode(class_26633) : 0) ^ n;
        int n2 = n ^ 0x44B32595;
        if ((n2 ^ n) != 1152591253) {
            int cfr_ignored_0 = (0x5CBC0F5 ^ n) - 133709653;
        }
        if (wa_2.mc.field_1687 != null && (class_12972 = class_26632.method_11469((class_1937)wa_2.mc.field_1687)) != null) {
            this.bhq(class_12972);
        }
    }

    private boolean thfd() {
        int n = -1141744211;
        int n2 = (n = Integer.rotateLeft(n * 1961074207, 7) ^ 0x225AD56B) ^ 0x60DF507B;
        if ((n2 ^ n) != 1625247867) {
            int cfr_ignored_0 = (0xDB2D0DD6 ^ n) + 1840372113;
        }
        return !this.jkth();
    }

    private boolean ddha_4() {
        int n = 1468129743;
        n = Integer.rotateLeft(n * -1677919165, 16) ^ 0xCCF15BE2;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 26);
        int n2 = n ^ 0xF87806F;
        if ((n2 ^ n) != 260538479) {
            int cfr_ignored_0 = (0x580661A0 ^ n) - -1379400098;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return !this.jkth();
    }

    private boolean zhm_2() {
        int n;
        block1: {
            int n2 = 339595910;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1277378481, 13) ^ 0xE3FA9496) ^ 0x943E3A2F;
            if ((n3 ^ n2) != -1807861201) {
                int cfr_ignored_0 = (0x8003E8A9 ^ n2) - -877183947;
            }
            n = !this.jkth() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x696D;
        }
        return n != 0;
    }

    private boolean shty() {
        int n;
        block1: {
            int n2 = 749885759;
            n2 = Integer.rotateLeft(n2 * 1414734653, 16) ^ 0x3ADF1EE2;
            n2 = System.identityHashCode(this) ^ n2;
            int n3 = n2 ^ 0x2C6A4FCD;
            if ((n3 ^ n2) != 745164749) {
                int cfr_ignored_0 = (0xD816F2 ^ n2) + -605749149;
            }
            n = !this.tghr() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x76D3;
        }
        return n != 0;
    }

    private boolean dhak_2() {
        int n = -90012926;
        int n2 = (n = Integer.rotateLeft(n * 143378485, 6) ^ 0x61DDF942) ^ 0x5517808D;
        if ((n2 ^ n) != 1427603597) {
            int cfr_ignored_0 = (0xAFB5038F ^ n) - -250224025;
        }
        return !this.tghr();
    }

    private boolean zk() {
        int n = thf.ssm_3(848834242);
        int n2 = n ^ 0x3082D88E;
        if ((n2 ^ n) != 813881486) {
            int cfr_ignored_0 = Integer.rotateLeft(0x21AF64C ^ n, 3) - 1168208495;
        }
        return !this.tghr();
    }

    private boolean tfm_2() {
        int n;
        block1: {
            int n2 = 659878933;
            n2 = Integer.rotateLeft(n2 * -1154720653, 17) ^ 0xAEC7B931;
            n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 24);
            int n3 = n2 ^ 0x31A18339;
            if ((n3 ^ n2) != 832668473) {
                int cfr_ignored_0 = (0x16F5772C ^ n2) + 771430807;
            }
            n = !this.tghr() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x5910;
        }
        return n != 0;
    }

    private boolean zyd_4() {
        int n = -593640744;
        n = Integer.rotateLeft(n * -1353198481, 18) ^ 0xCF72CA16;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x87F16A19;
        if ((n2 ^ n) != -2014221799) {
            int cfr_ignored_0 = (0x5B6CA8C1 ^ n) + -1369415519;
        }
        return !this.byf();
    }

    private boolean zbq() {
        int n = -1616776527;
        n = Integer.rotateLeft(n * 17017971, 23) ^ 0x4DD28651;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x28944BA2;
        if ((n2 ^ n) != 680807330) {
            int cfr_ignored_0 = (0xB735B913 ^ n) + 1632276372;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.thksh();
    }

    private boolean khsw_2() {
        try {
            int n = 676762083;
            n = Integer.rotateLeft(n * -858551587, 14) ^ 0x33F4CD19;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 9);
            int n2 = n ^ 0xFBF5C033;
            if ((n2 ^ n) != -67780557) {
                int cfr_ignored_0 = (0xD3A351D0 ^ n) - 2127086025;
            }
            if ((0x304 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.thksh();
    }

    private boolean hlm() {
        int n;
        block1: {
            int n2 = -1615227830;
            n2 = Integer.rotateLeft(n2 * -458863153, 19) ^ 0x57F604A;
            n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 26);
            int n3 = n2 ^ 0xBCEBCF25;
            if ((n3 ^ n2) != -1125396699) {
                int cfr_ignored_0 = (0x23525B6F ^ n2) - 238911540;
            }
            n = !this.jl_2() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x8985;
        }
        return n != 0;
    }

    private boolean tthr() {
        int n = -1036204570;
        int n2 = (n = Integer.rotateLeft(n * -1950480585, 7) ^ 0x820C50DC) ^ 0x17FF060A;
        if ((n2 ^ n) != 402589194) {
            int cfr_ignored_0 = (0xD5C3C3EC ^ n) - 1539979045;
        }
        return !this.jl_2();
    }

    private boolean thdhj() {
        int n = 1016741592;
        n = Integer.rotateLeft(n * -898664535, 23) ^ 0x7C8965F9;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 13);
        int n2 = n ^ 0x121CD192;
        if ((n2 ^ n) != 303878546) {
            int cfr_ignored_0 = (0x2E86EF4A ^ n) + -81146592;
        }
        return !this.shq();
    }

    private boolean ghht_2() {
        int n = thf.ssm_3(-1937012929);
        int n2 = n ^ 0x27199DE1;
        if ((n2 ^ n) != 655990241) {
            int cfr_ignored_0 = (Integer.rotateRight(0xAB921ADE ^ n, 8) - -888217571) * -1416488225;
        }
        return !this.ghdsh_2();
    }

    private boolean zjth() {
        int n = -1475983517;
        n = Integer.rotateLeft(n * 1514696925, 10) ^ 0x7A552D3A;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x636665BF;
        if ((n2 ^ n) != 1667655103) {
            int cfr_ignored_0 = (0xCB6022DC ^ n) - 1149945321;
        }
        return !this.ghdsh_2();
    }

    private boolean khft() {
        try {
            int n = -1316663152;
            n = Integer.rotateLeft(n * 676814463, 18) ^ 0xF47CD50A;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 27);
            int n2 = n ^ 0x35EC5EE8;
            if ((n2 ^ n) != 904683240) {
                int cfr_ignored_0 = (0x84690E78 ^ n) - -1113430961;
            }
            if ((0x1BC & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return this.jtdh_2.sdh_2() != this.dhshw;
    }

    private boolean dghl() {
        int n = 1299825057;
        n = Integer.rotateLeft(n * 1942462723, 13) ^ 0x6858BCC6;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 25);
        int n2 = n ^ 0x4D647F7A;
        if ((n2 ^ n) != 1298431866) {
            int cfr_ignored_0 = (0x1DBEDB ^ n) + 723648175;
        }
        return this.jtdh_2.sdh_2() != this.dhshw;
    }

    private boolean jhw() {
        int n;
        block4: {
            try {
                int n2 = -183776164;
                n2 = Integer.rotateLeft(n2 * 644846357, 14) ^ 0x4D816D67;
                n2 = System.identityHashCode(this) ^ n2;
                int n3 = n2 ^ 0x53994FE6;
                if ((n3 ^ n2) != 1402556390) {
                    int cfr_ignored_0 = (0xA69283BA ^ n2) + -1997081534;
                }
                if ((0x297 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = this.jtdh_2.sdh_2() != this.dhshw ? 1 : 0;
            if (yf.tdhth_2() != 0) break block4;
            n = n ^ 0xF885;
        }
        return n != 0;
    }

    private boolean ddd_7() {
        int n = 480736620;
        int n2 = (n = Integer.rotateLeft(n * -123117785, 7) ^ 0xBD26785A) ^ 0xEA312D31;
        if ((n2 ^ n) != -365875919) {
            int cfr_ignored_0 = (0xF696585D ^ n) - -1805719013;
        }
        return this.jtdh_2.sdh_2() != this.hbr;
    }

    private boolean sthd_2() {
        int n = -1267436808;
        n = Integer.rotateLeft(n * 1321960277, 17) ^ 0x64F9125B;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
        int n2 = n ^ 0xFD7C18E1;
        if ((n2 ^ n) != -42198815) {
            int cfr_ignored_0 = (0x49086A19 ^ n) - -396689765;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return !this.shsd_2.shzl();
    }

    private static String jss(String string, int n, int n2, int n3) {
        int n4 = thf.ssm_3(603790035);
        int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 15)) ^ 0xE1BBFD54;
        if ((n5 ^ n4) != -507773612) {
            int cfr_ignored_0 = Integer.rotateRight(0xC246E787 ^ n4, 11) - -1963743084;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x549084A3) + n2 ^ i * -2108216105) ^ sjm) + ssw_2);
        }
        return new String(cArray);
    }

    private static boolean rlk() {
        block0: {
            int n = -676022395;
            int n2 = (n = Integer.rotateLeft(n * -145383313, 13) ^ 0x2D2637A6) ^ 0xA6147834;
            if ((n2 ^ n) == -1508607948) break block0;
            int cfr_ignored_0 = (0x71A0CFB1 ^ n) + -703892001;
        }
        return yf.khdha_2();
    }

    private static void nf() {
        int n = thf.ssm_3(-445862362);
        int n2 = n ^ 0xD22F5754;
        if ((n2 ^ n) != -768649388) {
            int cfr_ignored_0 = (Integer.rotateRight(0x3743F972 ^ n, 9) + -1248275447) * 927201651;
        }
        yf.athz_2();
    }

    private static class_5498 tnt_2(class_315 class_3152) {
        block0: {
            int n = 942981296;
            n = Integer.rotateLeft(n * -341364417, 19) ^ 0xE034B20F;
            class_315 class_3153 = class_3152;
            n = Integer.rotateRight((class_3153 != null ? System.identityHashCode(class_3153) : 0) ^ n, 3);
            int n2 = n ^ 0x87EDE8F8;
            if ((n2 ^ n) == -2014451464) break block0;
            int cfr_ignored_0 = (0xBFD92848 ^ n) - -914813176;
        }
        return class_3152.method_31044();
    }

    private static class_897 bst_3(class_898 class_8982, class_1297 class_12972) {
        block0: {
            int n = 368535197;
            int n2 = (n = Integer.rotateLeft(n * -638518613, 24) ^ 0x307BD7F2) ^ 0xBA268E7B;
            if ((n2 ^ n) == -1171878277) break block0;
            int cfr_ignored_0 = (0xAFD1E8E6 ^ n) + -1795959348;
        }
        return class_8982.method_3953(class_12972);
    }

    private static void khzk_2(class_1007 class_10072, class_742 class_7423, class_10055 class_100552, float f) {
        int n = -545992224;
        n = Integer.rotateLeft(n * 1706049411, 18) ^ 0x60406751;
        class_742 class_7424 = class_7423;
        n = (class_7424 != null ? System.identityHashCode(class_7424) : 0) ^ n;
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0x852BCCE0;
        if ((n2 ^ n) != -2060727072) {
            int cfr_ignored_0 = (0x5A5F1D00 ^ n) - -148253662;
        }
        class_10072.method_62604(class_7423, class_100552, f);
    }

    private static void jmj(wa_2 wa2_2) {
        int n = thf.ssm_3(-1167190325);
        wa_2 wa3 = wa2_2;
        n = (wa3 != null ? System.identityHashCode(wa3) : 0) ^ n;
        int n2 = n ^ 0xF652376D;
        if ((n2 ^ n) != -162384019) {
            int cfr_ignored_0 = Integer.rotateRight(0x4C3C21A6 ^ n, 12) - 1067823701;
        }
        wa2_2.zds_4();
    }

    private static float tta(tay tay2) {
        block0: {
            int n = thf.ssm_3(-1249859516);
            tay tay3 = tay2;
            n = Integer.rotateRight((tay3 != null ? System.identityHashCode(tay3) : 0) ^ n, 6);
            int n2 = n ^ 0x3BC71A69;
            if ((n2 ^ n) == 1002904169) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x8E47B22D ^ n, 4) - 1057764014;
            int cfr_ignored_1 = (int)(0x4CF51C1027D4EB4FL ^ (long)n ^ 0xC550831A2DB9343BL);
        }
        return tay2.thw_5();
    }

    private static Comparator sas_3(ToLongFunction toLongFunction) {
        block0: {
            int n = 1530262041;
            n = Integer.rotateLeft(n * -160837957, 11) ^ 0x62456CE5;
            ToLongFunction toLongFunction2 = toLongFunction;
            n = (toLongFunction2 != null ? System.identityHashCode(toLongFunction2) : 0) ^ n;
            int n2 = n ^ 0xD2CCC11F;
            if ((n2 ^ n) == -758333153) break block0;
            int cfr_ignored_0 = (0x89F93306 ^ n) - -824474884;
        }
        return Comparator.comparingLong(toLongFunction);
    }

    private static int tfa_3(trn trn2, int n) {
        block0: {
            int n2 = -266388405;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1019946503, 13) ^ 0xCFF7655E) ^ 0x5446A8EF;
            if ((n3 ^ n2) == 1413916911) break block0;
            int cfr_ignored_0 = (0xA45994A4 ^ n2) - 1392790638;
        }
        return trn2.zfl(n);
    }

    private static Moondlc zzh_8() {
        block0: {
            int n = thf.ssm_3(-528645069);
            int n2 = n ^ 0x723527F9;
            if ((n2 ^ n) == 1916086265) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x9248A3CA ^ n, 5) + -1154911055;
        }
        return Moondlc.getInstance();
    }

    private static class_2561 znq(class_742 class_7423) {
        block0: {
            int n = thf.ssm_3(1255659754);
            class_742 class_7424 = class_7423;
            n = (class_7424 != null ? System.identityHashCode(class_7424) : 0) ^ n;
            int n2 = n ^ 0x55DBDBC;
            if ((n2 ^ n) == 90029500) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x4F8A6556 ^ n, 12) - -1507859291) * 1334469975;
        }
        return class_7423.method_5477();
    }

    private static void bsj_2() {
        int n = thf.ssm_3(-587706340);
        int n2 = n ^ 0xC3398A68;
        if ((n2 ^ n) != -1019639192) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x1FC1DA74 ^ n, 6) - -589884601) * 532798069;
        }
        yf.athz_2();
    }

    private static fy jb(khd khd2) {
        block0: {
            int n = -1922311800;
            int n2 = (n = Integer.rotateLeft(n * -874934195, 10) ^ 0x27EE9F08) ^ 0x339A0E2C;
            if ((n2 ^ n) == 865734188) break block0;
            int cfr_ignored_0 = (0xBEF1D7A4 ^ n) - -2042903520;
        }
        return khd2.sdh_2();
    }

    private static byq zht_5(bzw_2 bzw2_2) {
        block0: {
            int n = -578287119;
            int n2 = (n = Integer.rotateLeft(n * -1621337921, 15) ^ 0xB3FD9440) ^ 0xBDC78B0C;
            if ((n2 ^ n) == -1110996212) break block0;
            int cfr_ignored_0 = (0x604F82FD ^ n) + 2106086677;
        }
        return bzw2_2.sdsh_4();
    }

    private static ttj jyt_2(hk hk2) {
        block0: {
            int n = -741813678;
            n = Integer.rotateLeft(n * 652709725, 13) ^ 0x7D1BB4A4;
            hk hk3 = hk2;
            n = Integer.rotateRight((hk3 != null ? System.identityHashCode(hk3) : 0) ^ n, 12);
            int n2 = n ^ 0x29189D72;
            if ((n2 ^ n) == 689479026) break block0;
            int cfr_ignored_0 = (0xFAD04F20 ^ n) - -1013710248;
        }
        return hk2.target();
    }

    private static byq ddh_8(bzw_2 bzw2_2) {
        block0: {
            int n = 1375887466;
            int n2 = (n = Integer.rotateLeft(n * -397732219, 25) ^ 0xB7470C3D) ^ 0x70A43459;
            if ((n2 ^ n) == 1889809497) break block0;
            int cfr_ignored_0 = (0x22A65433 ^ n) + -720473283;
        }
        return bzw2_2.sdsh_4();
    }

    private static float tfj_2(tay tay2) {
        block0: {
            int n = thf.ssm_3(-1116901889);
            tay tay3 = tay2;
            n = Integer.rotateLeft((tay3 != null ? System.identityHashCode(tay3) : 0) ^ n, 23);
            int n2 = n ^ 0xF5A9D9ED;
            if ((n2 ^ n) == -173418003) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x48C4B412 ^ n, 12) + -735089303) * 1220850707;
        }
        return tay2.thw_5();
    }

    private static fy hht_4(khd khd2) {
        block0: {
            int n = 1847031676;
            int n2 = (n = Integer.rotateLeft(n * -1446009675, 10) ^ 0xDC8AD600) ^ 0x90959FB4;
            if ((n2 ^ n) == -1869242444) break block0;
            int cfr_ignored_0 = (0xFE82E8C8 ^ n) + -70968065;
        }
        return khd2.sdh_2();
    }

    private static fy ddhj_2(khd khd2) {
        block0: {
            int n = -238553509;
            n = Integer.rotateLeft(n * -1136425605, 24) ^ 0xFE443B0C;
            khd khd3 = khd2;
            n = (khd3 != null ? System.identityHashCode(khd3) : 0) ^ n;
            int n2 = n ^ 0x21C1E799;
            if ((n2 ^ n) == 566355865) break block0;
            int cfr_ignored_0 = (0xD00611C2 ^ n) - 1236083203;
        }
        return khd2.sdh_2();
    }

    private static boolean dtth() {
        block0: {
            int n = thf.ssm_3(1744377420);
            int n2 = n ^ 0x62EAF10D;
            if ((n2 ^ n) == 1659564301) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x513E741 ^ n, 3) + -1580818406;
            int cfr_ignored_1 = (int)(0xC7A1497C27D4EB4FL ^ (long)n ^ 0x6F88831A2DB82293L);
        }
        return yf.dnkh();
    }

    private static fy zbh(khd khd2) {
        block0: {
            int n = 196781299;
            n = Integer.rotateLeft(n * 1566368657, 15) ^ 0x9CA64253;
            khd khd3 = khd2;
            n = Integer.rotateRight((khd3 != null ? System.identityHashCode(khd3) : 0) ^ n, 20);
            int n2 = n ^ 0xC32022BA;
            if ((n2 ^ n) == -1021304134) break block0;
            int cfr_ignored_0 = (0xC89A8649 ^ n) + 438191931;
        }
        return khd2.sdh_2();
    }

    private static void ashs() {
        int n = 1805525620;
        int n2 = (n = Integer.rotateLeft(n * 2022156035, 4) ^ 0xDDCA3B16) ^ 0x74E3E430;
        if ((n2 ^ n) != 1961092144) {
            int cfr_ignored_0 = (0x1F7DC644 ^ n) - 708658811;
        }
        yf.athz_2();
    }

    private static boolean ras_4(wa_2 wa2_2) {
        block0: {
            int n = -1409953825;
            n = Integer.rotateLeft(n * 261675655, 14) ^ 0x939D9D2A;
            wa_2 wa3 = wa2_2;
            n = Integer.rotateRight((wa3 != null ? System.identityHashCode(wa3) : 0) ^ n, 21);
            int n2 = n ^ 0x48A40E0B;
            if ((n2 ^ n) == 1218711051) break block0;
            int cfr_ignored_0 = (0xE351C1D4 ^ n) + 381449374;
        }
        return wa2_2.jl_2();
    }

    private static double aysh(long l) {
        block0: {
            int n = -1157820127;
            n = Integer.rotateLeft(n * -2019961009, 3) ^ 0x383DEDAC;
            int n2 = (n = Integer.rotateRight((int)l ^ n, 15)) ^ 0xC8FD636A;
            if ((n2 ^ n) == -922918038) break block0;
            int cfr_ignored_0 = (0x7200724B ^ n) - -338302234;
        }
        return Double.longBitsToDouble(l);
    }

    private static String[] zzk_4(String string) {
        int n = 1163835480;
        n = Integer.rotateLeft(n * -1802617859, 24) ^ 0x3E2D49A7;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x8979A61F;
        if ((n2 ^ n) != -1988516321) {
            int cfr_ignored_0 = (0xCC271E47 ^ n) - -1676492352;
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

    private static CallSite dkhf(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -659140349;
            n3 = Integer.rotateLeft(n3 * -159888827, 13) ^ 0xC179C92B;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0xC38280E5;
            if ((n4 ^ n3) != -1014857499) {
                int cfr_ignored_0 = (0x1B34D1E6 ^ n3) - 980156698;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dhash_2 ^ string.hashCode()) + (n2 + hdt_4) + i ^ dhash_2, 17) + hdt_4);
            }
            String[] stringArray = wa_2.zzk_4(new String(cArray));
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

    private static String[] elgaxd91f(String string) {
        return string.split("\u0005\u0016", -1);
    }

    private static CallSite kdj2in3qukbdg(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ teejy1w ^ string.hashCode()) + (n2 + jgqow6iy) + i ^ teejy1w, 28) + jgqow6iy);
            }
            String[] stringArray = wa_2.elgaxd91f(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

