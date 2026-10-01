/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1269
 *  net.minecraft.class_1297
 *  net.minecraft.class_1304
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 *  net.minecraft.class_304
 *  net.minecraft.class_3675
 *  net.minecraft.class_3675$class_306
 *  net.minecraft.class_636
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2848;
import net.minecraft.class_304;
import net.minecraft.class_3675;
import net.minecraft.class_636;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bdh_3;
import us.m0vy.moondlc.m0vyguard.brz;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bghh;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tkhdh;
import us.m0vy.moondlc.m0vyguard.tkhd_2;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.mw;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="ElytraHelper", category=bzw.OTHER, desc="Provides helper utilities for safer elytra flight")
public class kz_2
extends bnq {
    private final bdh_3 rtz = new bdh_3(this, "Firewo".concat("rk Key")).ztn_4(-1);
    private final badh_2 saz = new badh_2(this, "Auto Start").bts(true);
    private final badh_2 shms = new badh_2((hy)this, "Fast Start", this::ztl).bts(true);
    private final badh_2 ghh = new badh_2(this, "Combat Re".concat("launch")).bts(true);
    private final tay thln = new tay((hy)this, "Relau".concat("nch Delay"), this::aym).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(0xA4F15334 ^ 0xE08B5334)).rkh_3(Float.intBitsToFloat(-614555055 - -1718181295)).ssd_5(Float.intBitsToFloat(0x46C384CC ^ 0x5EC84CC));
    private final badh_2 baz_3 = new badh_2((hy)this, "Relaunch".concat(" Firework"), this::thh_4).bts(true);
    private final badh_2 rsd_4 = new badh_2(this, "Auto Firework").bts(false);
    private final tay thaz_4 = new tay((hy)this, "Delay", this::bgha_2).shth_7(Float.intBitsToFloat(Integer.reverse(-1599255515) ^ 0xE6FAB505)).dhbs_2(Float.intBitsToFloat(299096228 - -858138460)).rkh_3(Float.intBitsToFloat(1629623690 + -525997450)).ssd_5(Float.intBitsToFloat(79728743 + 1063382937));
    private final badh_2 jhsh_2 = new badh_2((hy)this, "Only With ".concat("Target"), this::hhth).bts(false);
    private final badh_2 dhhh_4 = new badh_2((hy)this, "Only Whil".concat("e Gliding"), this::shs_8).bts(true);
    private final tkhd_2 jn = new tkhd_2();
    private final tkhd_2 hss_4 = new tkhd_2();
    private boolean zhh = false;
    private boolean jbh_2 = false;
    private boolean ghkh = false;
    private bghh shzf = bghh.dwh_2;
    private boolean hdw;
    private final bql<btt> khddh_2 = this::thght;
    private static final int dhky = -869962450;
    private static final int bsh_2 = 1413921618;
    private static final int rdd_2 = 73013821;
    private static final int shbd_2 = -1509823267;
    private static final int ucttf3zctpj = 234717251;
    private static final int eumqgr6st = -66352543;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int qzwwbnt4;

    @Override
    public void nt() {
        int n = -967283279;
        n = Integer.rotateLeft(n * -517711173, 14) ^ 0x765A3048;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 18);
        int n2 = n ^ 0x30588570;
        if ((n2 ^ n) != 811107696) {
            int cfr_ignored_0 = (0xF600E8C1 ^ n) - 524015627;
        }
        this.zhh = false;
        this.jbh_2 = false;
        this.ghkh = false;
        this.shzf = bghh.dwh_2;
        this.hdw = false;
        this.jn.zat();
        kz_2.shyth(this.hss_4);
    }

    @Override
    public void nc() {
        int n = -434564385;
        int n2 = (n = Integer.rotateLeft(n * -2025528399, 28) ^ 0xD56786E3) ^ 0x4DF7399B;
        if ((n2 ^ n) != 1308047771) {
            int cfr_ignored_0 = (0xABEE2B44 ^ n) - -475970800;
        }
        this.zhh = false;
        this.jbh_2 = false;
        this.ghkh = false;
        this.tsl_4();
        this.shzf = bghh.dwh_2;
        this.hdw = false;
    }

    private boolean ghzh() {
        boolean bl = false;
        boolean bl2 = false;
        int n = 0;
        int n2 = 950176563;
        n2 = Integer.rotateLeft(n2 * 427868853, 20) ^ 0x337C70DD;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 14);
        int n3 = Integer.reverse(Integer.reverse(1832044569 * -1006719569 + -1795435891 ^ n2));
        while (true) {
            block96: {
                block89: {
                    block84: {
                        block95: {
                            block90: {
                                block69: {
                                    block82: {
                                        block63: {
                                            block85: {
                                                block86: {
                                                    block59: {
                                                        block92: {
                                                            block87: {
                                                                block76: {
                                                                    block74: {
                                                                        block61: {
                                                                            block70: {
                                                                                block66: {
                                                                                    block80: {
                                                                                        block72: {
                                                                                            block62: {
                                                                                                block83: {
                                                                                                    block79: {
                                                                                                        block75: {
                                                                                                            block68: {
                                                                                                                block67: {
                                                                                                                    block60: {
                                                                                                                        block88: {
                                                                                                                            block93: {
                                                                                                                                block77: {
                                                                                                                                    block78: {
                                                                                                                                        block91: {
                                                                                                                                            block73: {
                                                                                                                                                block64: {
                                                                                                                                                    block94: {
                                                                                                                                                        block81: {
                                                                                                                                                            block65: {
                                                                                                                                                                block71: {
                                                                                                                                                                    if ((n = ((n3 ^ n2) - -1795435891) * -1357461169) == -1691070750) break block59;
                                                                                                                                                                    if (n == 2091450617) break block60;
                                                                                                                                                                    int cfr_ignored_0 = (Integer.rotateRight(0xE7925317 ^ n2, 15) - 253079300) * -409840873;
                                                                                                                                                                    if (n == -416237797) break block61;
                                                                                                                                                                    if (n == 1242705083) break block62;
                                                                                                                                                                    if (n == 1100244070) break block63;
                                                                                                                                                                    int cfr_ignored_1 = (Integer.rotateRight(0x78B6193E ^ n2, 18) - -1570067011) * 2025199935;
                                                                                                                                                                    if (n == -292441672) break block64;
                                                                                                                                                                    if (n == 961194921) break block65;
                                                                                                                                                                    if (n == -1731082542) break block66;
                                                                                                                                                                    if (n == -344541197) break block67;
                                                                                                                                                                    if (n == 1832370805) break block68;
                                                                                                                                                                    if (n == -727056973) break block69;
                                                                                                                                                                    if (n == 1835382669) break block70;
                                                                                                                                                                    if (n == 1166314660) break block71;
                                                                                                                                                                    if (n == -1517585699) break block72;
                                                                                                                                                                    if (n == 561088789) break block73;
                                                                                                                                                                    if (n == -1621266934) break block74;
                                                                                                                                                                    if (n == -1578541658) break block75;
                                                                                                                                                                    int cfr_ignored_2 = Integer.rotateRight(0xCAD63F86 ^ n2, 12) - -1806741387;
                                                                                                                                                                    if (n == -1907660708) break block76;
                                                                                                                                                                    if (n == -355152716) break block77;
                                                                                                                                                                    if (n == 1461750650) break block78;
                                                                                                                                                                    if (n == 586360007) break block79;
                                                                                                                                                                    if (n == -1882865703) break block80;
                                                                                                                                                                    if (n == -1545261406) break block81;
                                                                                                                                                                    if (n == 30219532) break block82;
                                                                                                                                                                    if (n == 1832044569) break block83;
                                                                                                                                                                    if (n == -5271154) break block84;
                                                                                                                                                                    if (n == -1028835049) break block85;
                                                                                                                                                                    if (n == 656969779) break block86;
                                                                                                                                                                    if (n == -740806660) break block87;
                                                                                                                                                                    int cfr_ignored_3 = (Integer.rotateRight(0x743EEFFA ^ n2, 17) + 402435713) * 1950281723;
                                                                                                                                                                    if (n == 1535336312) break block88;
                                                                                                                                                                    if (n == -846877777) break block89;
                                                                                                                                                                    if (n == -987293840) break block90;
                                                                                                                                                                    int cfr_ignored_4 = (Integer.rotateLeft(0x45D9967D ^ n2, 11) - 2042026078) * 1171887741;
                                                                                                                                                                    int cfr_ignored_5 = (int)(0x876B384027D4EB4FL ^ (long)n2 ^ 0x8DF0831A2DB8A307L);
                                                                                                                                                                    if (n == -755601569) break block91;
                                                                                                                                                                    if (n == 144487154) break block92;
                                                                                                                                                                    if (n == 1205691014) break block93;
                                                                                                                                                                    if (n == -470168026) break block94;
                                                                                                                                                                    if (n == -2091593685) break block95;
                                                                                                                                                                    break block96;
                                                                                                                                                                }
                                                                                                                                                                int cfr_ignored_6 = (Integer.rotateLeft(0xC8C99699 ^ n2, 12) + 1422318530) * -926312807;
                                                                                                                                                                int cfr_ignored_7 = (int)(0xA7B38A427D4EB4FL ^ (long)n2 ^ 0x8C38831A2DB9B927L);
                                                                                                                                                                if (!kz_2.mc.field_1724.method_5771()) {
                                                                                                                                                                    n3 = (-287580106 * -1006719569 + -1795435891 ^ n2) + 2143317043 - 2143317043;
                                                                                                                                                                    int cfr_ignored_8 = Integer.rotateRight(0xB5FBB52F ^ n2, 9) - 232296428;
                                                                                                                                                                    n3 = 961194921 * -1006719569 + -1795435891 ^ n2 ^ 0x1277C3E5 ^ 0x1277C3E5;
                                                                                                                                                                    --n;
                                                                                                                                                                    continue;
                                                                                                                                                                }
                                                                                                                                                                int cfr_ignored_9 = (int)(0xE9F4097ADE35D23DL ^ (long)n2 ^ 0xEF8570D85F5C7E39L);
                                                                                                                                                                n3 = -1578541658 * -1006719569 + -1795435891 ^ n2;
                                                                                                                                                                n += 2;
                                                                                                                                                                continue;
                                                                                                                                                            }
                                                                                                                                                            int cfr_ignored_10 = Integer.rotateLeft(0x2424540C ^ n2, 7) - 1690553519;
                                                                                                                                                            if (!kz_2.mc.field_1724.method_6128()) {
                                                                                                                                                                n3 = Integer.reverse(Integer.reverse(891686899 * -1006719569 + -1795435891 ^ n2));
                                                                                                                                                                int cfr_ignored_11 = (Integer.rotateRight(0x4A01B1BE ^ n2, 12) - -91085507) * 1241625023;
                                                                                                                                                                n3 = -1545261406 * -1006719569 + -1795435891 ^ n2 ^ 0x8E46BE01 ^ 0x8E46BE01;
                                                                                                                                                                ++n;
                                                                                                                                                                continue;
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                n += 4;
                                                                                                                                                                if ((0x4219DCFDFBAEB9BDL ^ (long)n2 | 1L) == 0L) {
                                                                                                                                                                    throw new NoSuchElementException();
                                                                                                                                                                }
                                                                                                                                                                n3 = 1242705083 * -1006719569 + -1795435891 ^ n2;
                                                                                                                                                            }
                                                                                                                                                            catch (NoSuchElementException noSuchElementException) {
                                                                                                                                                                n3 = 1242705083 * -1006719569 + -1795435891 ^ n2 ^ 0xED944CEA ^ 0xED944CEA;
                                                                                                                                                            }
                                                                                                                                                            continue;
                                                                                                                                                        }
                                                                                                                                                        int cfr_ignored_12 = (Integer.rotateRight(0xA317D29A ^ n2, 7) + -1002430495) * -1558719845;
                                                                                                                                                        if (this.jbh_2) {
                                                                                                                                                            int cfr_ignored_13 = (int)(0x9D15B507E75A7AF2L ^ (long)n2 ^ 0x977F02070EC297FAL);
                                                                                                                                                            n3 = Integer.reverse(Integer.reverse(561088789 * -1006719569 + -1795435891 ^ n2));
                                                                                                                                                            n += 4;
                                                                                                                                                            continue;
                                                                                                                                                        }
                                                                                                                                                        n3 = (1597016955 * -1006719569 + -1795435891 ^ n2) + 342086563 - 342086563;
                                                                                                                                                        int cfr_ignored_14 = Integer.rotateRight(0xB6EDEACF ^ n2, 9) - 724373068;
                                                                                                                                                        n3 = -292441672 * -1006719569 + -1795435891 ^ n2;
                                                                                                                                                        n -= 3;
                                                                                                                                                        continue;
                                                                                                                                                    }
                                                                                                                                                    int cfr_ignored_15 = Integer.rotateRight(0x6E6431E7 ^ n2, 16) - 1652533812;
                                                                                                                                                    bl2 = true;
                                                                                                                                                    n3 = (-846877777 * -1006719569 + -1795435891 ^ n2) + 1938059139 - 1938059139;
                                                                                                                                                    n += 5;
                                                                                                                                                    continue;
                                                                                                                                                }
                                                                                                                                                int cfr_ignored_16 = (Integer.rotateRight(0x5F2B7EF7 ^ n2, 14) - -1969094876) * 1596686071;
                                                                                                                                                if (!kz_2.mc.field_1724.method_24828()) {
                                                                                                                                                    int cfr_ignored_17 = (int)(0x2B0AA7E41828A6CBL ^ (long)n2 ^ 0xB2B8FCE2B6B1FBC4L);
                                                                                                                                                    n3 = Integer.reverse(Integer.reverse(-961575905 * -1006719569 + -1795435891 ^ n2));
                                                                                                                                                    int cfr_ignored_18 = (int)(0xB7BA42C4E0DBEE92L ^ (long)n2 ^ 0x78F90D042602C2A5L);
                                                                                                                                                    n3 = (-1517585699 * -1006719569 + -1795435891 ^ n2) + 76350513 - 76350513;
                                                                                                                                                    n += 4;
                                                                                                                                                    continue;
                                                                                                                                                }
                                                                                                                                                n3 = Integer.reverse(Integer.reverse(-344541197 * -1006719569 + -1795435891 ^ n2));
                                                                                                                                                n -= 3;
                                                                                                                                                continue;
                                                                                                                                            }
                                                                                                                                            int cfr_ignored_19 = (Integer.rotateLeft(0x99585F5 ^ n2, 4) - 762894310) * 160794101;
                                                                                                                                            int cfr_ignored_20 = (int)(0xCB272BC827D4EB4FL ^ (long)n2 ^ 0xAAE0831A2DB83B9FL);
                                                                                                                                            if (kz_2.mc.field_1724.method_24828()) {
                                                                                                                                                try {
                                                                                                                                                    n -= 3;
                                                                                                                                                    if ((0x767942CCB143F663L ^ (long)n2 | 1L) == 0L) {
                                                                                                                                                        throw new IllegalArgumentException();
                                                                                                                                                    }
                                                                                                                                                    n3 = (-355152716 * -1006719569 + -1795435891 ^ n2) + 1664791982 - 1664791982;
                                                                                                                                                }
                                                                                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                                    n3 = -355152716 * -1006719569 + -1795435891 ^ n2 ^ 0xB0DCB43C ^ 0xB0DCB43C;
                                                                                                                                                }
                                                                                                                                                continue;
                                                                                                                                            }
                                                                                                                                            n3 = -1897995978 * -1006719569 + -1795435891 ^ n2 ^ 0xCC97BC7F ^ 0xCC97BC7F;
                                                                                                                                            int cfr_ignored_21 = (Integer.rotateLeft(0xA723F4BD ^ n2, 7) - 1102594590) * -1490815811;
                                                                                                                                            int cfr_ignored_22 = (int)(0x65915A8027D4EB4FL ^ (long)n2 ^ 0x4870831A2DB966F3L);
                                                                                                                                            n3 = Integer.reverse(Integer.reverse(1205691014 * -1006719569 + -1795435891 ^ n2));
                                                                                                                                            ++n;
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                        int cfr_ignored_23 = Integer.rotateLeft(0x2518FD88 ^ n2, 7) + -2107354445;
                                                                                                                                        if (kz_2.mc.field_1724.method_24828()) {
                                                                                                                                            int cfr_ignored_24 = (int)(0xA4C790DD5F06A0B2L ^ (long)n2 ^ 0xDCCA72BEBA42E45EL);
                                                                                                                                            n3 = (int)((long)(1183351505 * -1006719569 + -1795435891 ^ n2) ^ 0x4B4542FC8E062430L ^ 0x4B4542FC8E062430L);
                                                                                                                                            int cfr_ignored_25 = (int)(0xB00DCB422EF7E921L ^ (long)n2 ^ 0x6BF4915C2964CDCAL);
                                                                                                                                            n3 = -355152716 * -1006719569 + -1795435891 ^ n2 ^ 0x77E25FD ^ 0x77E25FD;
                                                                                                                                            n += 2;
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                        n3 = 1205691014 * -1006719569 + -1795435891 ^ n2 ^ 0xD556F82 ^ 0xD556F82;
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                    int cfr_ignored_26 = (Integer.rotateRight(0xF8BA7A1E ^ n2, 18) - 586311901) * -121996769;
                                                                                                                                    this.jbh_2 = false;
                                                                                                                                    this.ghkh = false;
                                                                                                                                    bl2 = false;
                                                                                                                                    n3 = -846877777 * -1006719569 + -1795435891 ^ n2;
                                                                                                                                    int cfr_ignored_27 = Integer.rotateLeft(0x303B6709 ^ n2, 9) + -611378862;
                                                                                                                                    int cfr_ignored_28 = (int)(0xF289C93427D4EB4FL ^ (long)n2 ^ 0x6F18831A2DB848C2L);
                                                                                                                                    n += 2;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                int cfr_ignored_29 = (Integer.rotateLeft(0xFD988E3D ^ n2, 18) - -1177102178) * -40333763;
                                                                                                                                int cfr_ignored_30 = (int)(0x3F2A200027D4EB4FL ^ (long)n2 ^ 0xBD70831A2DB9D385L);
                                                                                                                                bl2 = true;
                                                                                                                                n3 = Integer.reverse(Integer.reverse(-846877777 * -1006719569 + -1795435891 ^ n2));
                                                                                                                                int cfr_ignored_31 = (Integer.rotateRight(0x202BB95B ^ n2, 7) + -374795968) * 539736411;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            int cfr_ignored_32 = Integer.rotateRight(0x1C3D75EF ^ n2, 6) - 1875830572;
                                                                                                                            this.tjkh_2(this.ghkh);
                                                                                                                            this.zhh = true;
                                                                                                                            this.jbh_2 = false;
                                                                                                                            this.ghkh = false;
                                                                                                                            this.hss_4.zat();
                                                                                                                            bl2 = true;
                                                                                                                            n3 = -965008604 * -1006719569 + -1795435891 ^ n2 ^ 0xE3D35E7C ^ 0xE3D35E7C;
                                                                                                                            int cfr_ignored_33 = Integer.rotateLeft(0xA2BD70E4 ^ n2, 7) - -1186051369;
                                                                                                                            n3 = Integer.reverse(Integer.reverse(-846877777 * -1006719569 + -1795435891 ^ n2));
                                                                                                                            n -= 3;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        int cfr_ignored_34 = Integer.rotateRight(0xE3223126 ^ n2, 15) - -2055105835;
                                                                                                                        bl = kz_2.mc.field_1724.method_6118(class_1304.field_6174).method_31574(class_1802.field_8833);
                                                                                                                        if (!bl) {
                                                                                                                            try {
                                                                                                                                n += 3;
                                                                                                                                if ((0xD64F9F069249C283L ^ (long)n2 | 1L) == 0L) {
                                                                                                                                    throw new IllegalArgumentException();
                                                                                                                                }
                                                                                                                                n3 = (int)((long)(-1578541658 * -1006719569 + -1795435891 ^ n2) ^ 0x89738D2EB044FFB1L ^ 0x89738D2EB044FFB1L);
                                                                                                                            }
                                                                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                n3 = -1578541658 * -1006719569 + -1795435891 ^ n2 ^ 0xF2A53225 ^ 0xF2A53225;
                                                                                                                            }
                                                                                                                            n -= 2;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        n3 = 2091450617 * -1006719569 + -1795435891 ^ n2 ^ 0x558DFDA8 ^ 0x558DFDA8;
                                                                                                                        int cfr_ignored_35 = (Integer.rotateLeft(0x881B0038 ^ n2, 4) + 2141365763) * -2011496391;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    int cfr_ignored_36 = Integer.rotateLeft(0xC51F34E0 ^ n2, 11) + -484112805;
                                                                                                                    if (!kz_2.mc.field_1724.method_5799()) {
                                                                                                                        n3 = (int)((long)(56459692 * -1006719569 + -1795435891 ^ n2) ^ 0x9847E06920257322L ^ 0x9847E06920257322L);
                                                                                                                        int cfr_ignored_37 = Integer.rotateLeft(0x89A032A0 ^ n2, 4) + -1362902885;
                                                                                                                        n3 = 1832370805 * -1006719569 + -1795435891 ^ n2;
                                                                                                                        --n;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    n3 = Integer.reverse(Integer.reverse(-1578541658 * -1006719569 + -1795435891 ^ n2));
                                                                                                                    int cfr_ignored_38 = (Integer.rotateLeft(0x9047C71C ^ n2, 5) - 2098117535) * -1874344163;
                                                                                                                    n += 4;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                int cfr_ignored_39 = Integer.rotateLeft(0x6D08E3E9 ^ n2, 16) + 946944114;
                                                                                                                int cfr_ignored_40 = (int)(0xAFBA4DD427D4EB4FL ^ (long)n2 ^ 0x66D8831A2DB8F2A5L);
                                                                                                                if (this.hss_4.tagh((long)this.thln.thw_5())) {
                                                                                                                    try {
                                                                                                                        n -= 3;
                                                                                                                        if ((0x9A4CB74067D83D95L ^ (long)n2 | 1L) == 0L) {
                                                                                                                            throw new UnsupportedOperationException();
                                                                                                                        }
                                                                                                                        n3 = (586360007 * -1006719569 + -1795435891 ^ n2) + -959315709 - -959315709;
                                                                                                                    }
                                                                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                                        n3 = 586360007 * -1006719569 + -1795435891 ^ n2;
                                                                                                                    }
                                                                                                                    n += 5;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                n3 = Integer.reverse(Integer.reverse(338705036 * -1006719569 + -1795435891 ^ n2));
                                                                                                                int cfr_ignored_41 = (Integer.rotateLeft(0x5B3F93F4 ^ n2, 14) - 286296519) * 1530893301;
                                                                                                                n3 = -470168026 * -1006719569 + -1795435891 ^ n2;
                                                                                                                ++n;
                                                                                                                continue;
                                                                                                            }
                                                                                                            int cfr_ignored_42 = (Integer.rotateLeft(0x8E55BD30 ^ n2, 4) + 1086294027) * -1906983631;
                                                                                                            if (!kz_2.mc.field_1724.method_5869()) {
                                                                                                                n3 = 1166314660 * -1006719569 + -1795435891 ^ n2 ^ 0xCB7A16B9 ^ 0xCB7A16B9;
                                                                                                                n -= 4;
                                                                                                                continue;
                                                                                                            }
                                                                                                            try {
                                                                                                                n += 4;
                                                                                                                if ((0x8F41574BF72F7225L ^ (long)n2 | 1L) == 0L) {
                                                                                                                    throw new IllegalStateException();
                                                                                                                }
                                                                                                                n3 = Integer.reverse(Integer.reverse(-1578541658 * -1006719569 + -1795435891 ^ n2));
                                                                                                            }
                                                                                                            catch (IllegalStateException illegalStateException) {
                                                                                                                n3 = (-1578541658 * -1006719569 + -1795435891 ^ n2) + 1354824280 - 1354824280;
                                                                                                            }
                                                                                                            n -= 5;
                                                                                                            continue;
                                                                                                        }
                                                                                                        int cfr_ignored_43 = (Integer.rotateLeft(0xD53A9370 ^ n2, 13) + -696944181) * -717581455;
                                                                                                        this.jbh_2 = false;
                                                                                                        this.ghkh = false;
                                                                                                        bl2 = false;
                                                                                                        try {
                                                                                                            if ((0x266F8A2D59213AEFL ^ (long)n2 | 1L) == 0L) {
                                                                                                                throw new NoSuchElementException();
                                                                                                            }
                                                                                                            n3 = (int)((long)(-846877777 * -1006719569 + -1795435891 ^ n2) ^ 0x970BFEC5E6F5849AL ^ 0x970BFEC5E6F5849AL);
                                                                                                        }
                                                                                                        catch (NoSuchElementException noSuchElementException) {
                                                                                                            n3 = -846877777 * -1006719569 + -1795435891 ^ n2 ^ 0xB7AE28FC ^ 0xB7AE28FC;
                                                                                                        }
                                                                                                        ++n;
                                                                                                        continue;
                                                                                                    }
                                                                                                    int cfr_ignored_44 = Integer.rotateLeft(0x27DC22A8 ^ n2, 7) + -670707309;
                                                                                                    kz_2.khts_2(kz_2.mc.field_1724);
                                                                                                    this.jbh_2 = true;
                                                                                                    this.ghkh = this.baz_3.shzl();
                                                                                                    this.zhh = true;
                                                                                                    kz_2.aqw(this.hss_4);
                                                                                                    bl2 = true;
                                                                                                    try {
                                                                                                        n -= 2;
                                                                                                        if ((0x41F38B8A862A9661L ^ (long)n2 | 1L) == 0L) {
                                                                                                            throw new NoSuchElementException();
                                                                                                        }
                                                                                                        n3 = (int)((long)(-846877777 * -1006719569 + -1795435891 ^ n2) ^ 0x398F6D7081FA93FAL ^ 0x398F6D7081FA93FAL);
                                                                                                    }
                                                                                                    catch (NoSuchElementException noSuchElementException) {
                                                                                                        n3 = (-846877777 * -1006719569 + -1795435891 ^ n2) + 418067890 - 418067890;
                                                                                                    }
                                                                                                    n += 3;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_45 = Integer.rotateRight(0xC07ABA2B ^ n2, 11) + 1396320880;
                                                                                                if (kz_2.ayz(this.ghh)) {
                                                                                                    try {
                                                                                                        n += 5;
                                                                                                        if ((0x1D01219382428437L ^ (long)n2 | 1L) == 0L) {
                                                                                                            throw new IllegalArgumentException();
                                                                                                        }
                                                                                                        n3 = (1535336312 * -1006719569 + -1795435891 ^ n2) + 505873086 - 505873086;
                                                                                                    }
                                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                                        n3 = 1535336312 * -1006719569 + -1795435891 ^ n2 ^ 0xF43D0651 ^ 0xF43D0651;
                                                                                                    }
                                                                                                    ++n;
                                                                                                    continue;
                                                                                                }
                                                                                                n3 = (846796278 * -1006719569 + -1795435891 ^ n2) + -70086912 - -70086912;
                                                                                                int cfr_ignored_46 = (Integer.rotateLeft(0xF512B874 ^ n2, 17) - -1314785977) * -183322507;
                                                                                                n3 = (1461750650 * -1006719569 + -1795435891 ^ n2) + -518935689 - -518935689;
                                                                                                n -= 2;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_47 = Integer.rotateLeft(0xDBD04A8D ^ n2, 14) - -1567185330;
                                                                                            int cfr_ignored_48 = (int)(0x1962E4B027D4EB4FL ^ (long)n2 ^ 0x3410831A2DB99F14L);
                                                                                            this.jbh_2 = false;
                                                                                            this.ghkh = false;
                                                                                            bl2 = false;
                                                                                            try {
                                                                                                ++n;
                                                                                                if ((0x9696D1F1A7210D1L ^ (long)n2 | 1L) == 0L) {
                                                                                                    throw new IllegalStateException();
                                                                                                }
                                                                                                n3 = -846877777 * -1006719569 + -1795435891 ^ n2;
                                                                                            }
                                                                                            catch (IllegalStateException illegalStateException) {
                                                                                                n3 = Integer.reverse(Integer.reverse(-846877777 * -1006719569 + -1795435891 ^ n2));
                                                                                            }
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_49 = (Integer.rotateRight(0xCB7F8133 ^ n2, 12) + -1462877080) * -880836301;
                                                                                        bl2 = false;
                                                                                        try {
                                                                                            n -= 4;
                                                                                            if ((0x3A5A62C563EA1C17L ^ (long)n2 | 1L) == 0L) {
                                                                                                throw new IllegalStateException();
                                                                                            }
                                                                                            n3 = -846877777 * -1006719569 + -1795435891 ^ n2;
                                                                                        }
                                                                                        catch (IllegalStateException illegalStateException) {
                                                                                            n3 = -846877777 * -1006719569 + -1795435891 ^ n2;
                                                                                        }
                                                                                        n -= 3;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_50 = (Integer.rotateRight(0xA5B5A65A ^ n2, 7) + 358401057) * -1514822053;
                                                                                    n3 = (-252187567 * -1006719569 + -1795435891 ^ n2) + -118092220 - -118092220;
                                                                                    int cfr_ignored_51 = Integer.rotateRight(0xAC0D89C3 ^ n2, 8) + -637448744;
                                                                                    int cfr_ignored_52 = (int)(0x3A3F905DE25D73BDL ^ (long)n2 ^ 0xDDCB08091C5DD9AEL);
                                                                                    n3 = 978683307 * -1006719569 + -1795435891 ^ n2;
                                                                                    int cfr_ignored_53 = (int)(0x54A5E3013B5DA143L ^ (long)n2 ^ 0x3B72BA08B9A1049AL);
                                                                                    n3 = (int)((long)(1832044569 * -1006719569 + -1795435891 ^ n2) ^ 0x68F9BE6F0BE6B8C9L ^ 0x68F9BE6F0BE6B8C9L);
                                                                                    n -= 3;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_54 = Integer.rotateLeft(0x10F1EE85 ^ n2, 5) - 296321366;
                                                                                int cfr_ignored_55 = (int)(0xD24340B827D4EB4FL ^ (long)n2 ^ 0x7C00831A2DB80957L);
                                                                                n3 = (int)((long)(1832044569 * -1006719569 + -1795435891 ^ n2) ^ 0x73E29F8BFA605189L ^ 0x73E29F8BFA605189L);
                                                                                int cfr_ignored_56 = (Integer.rotateRight(0x5DBB22B2 ^ n2, 14) + 1577505481) * 1572545203;
                                                                                --n;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_57 = (Integer.rotateLeft(0xF7F15074 ^ n2, 17) - 177626439) * -135180171;
                                                                            int cfr_ignored_58 = (int)(0x3F4E0C7F6D1A2DC1L ^ (long)n2 ^ 0xE58E1687A0A5D34DL);
                                                                            n3 = (1832044569 * -1006719569 + -1795435891 ^ n2) + -204057697 - -204057697;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_59 = Integer.rotateRight(0x6DE22487 ^ n2, 16) - 1388317588;
                                                                        n3 = 1234563642 * -1006719569 + -1795435891 ^ n2;
                                                                        int cfr_ignored_60 = (Integer.rotateLeft(0xB39A469C ^ n2, 9) - -1005835233) * -1281735011;
                                                                        n3 = (int)((long)(1832044569 * -1006719569 + -1795435891 ^ n2) ^ 0x61E2D31E8AE7B7F0L ^ 0x61E2D31E8AE7B7F0L);
                                                                        n -= 3;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_61 = Integer.rotateLeft(0xEF61128C ^ n2, 16) - 18800175;
                                                                    try {
                                                                        n += 3;
                                                                        if ((0x7E006F87A015663DL ^ (long)n2 | 1L) == 0L) {
                                                                            throw new ArithmeticException();
                                                                        }
                                                                        n3 = 1832044569 * -1006719569 + -1795435891 ^ n2;
                                                                    }
                                                                    catch (ArithmeticException arithmeticException) {
                                                                        n3 = Integer.reverse(Integer.reverse(1832044569 * -1006719569 + -1795435891 ^ n2));
                                                                    }
                                                                    n += 3;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_62 = Integer.rotateLeft(0xFB7A4CA0 ^ n2, 18) + 2016208539;
                                                                n3 = (-217414942 * -1006719569 + -1795435891 ^ n2) + -348134778 - -348134778;
                                                                int cfr_ignored_63 = Integer.rotateRight(0x21FD5447 ^ n2, 7) - 571134932;
                                                                n3 = 1832044569 * -1006719569 + -1795435891 ^ n2;
                                                                n += 2;
                                                                continue;
                                                            }
                                                            int cfr_ignored_64 = Integer.rotateRight(0xE6E13BE6 ^ n2, 15) - -106700779;
                                                            n3 = 730733508 * -1006719569 + -1795435891 ^ n2 ^ 0x63F6717F ^ 0x63F6717F;
                                                            int cfr_ignored_65 = (Integer.rotateRight(0xCEAEE83A ^ n2, 12) + 193707585) * -827398085;
                                                            try {
                                                                if ((0x6B65BA7FED493767L ^ (long)n2 | 1L) == 0L) {
                                                                    throw new UnsupportedOperationException();
                                                                }
                                                                n3 = Integer.reverse(Integer.reverse(1832044569 * -1006719569 + -1795435891 ^ n2));
                                                            }
                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                n3 = 1832044569 * -1006719569 + -1795435891 ^ n2;
                                                            }
                                                            --n;
                                                            continue;
                                                        }
                                                        int cfr_ignored_66 = (Integer.rotateLeft(0xC91584B5 ^ n2, 12) - 1576579366) * -921336651;
                                                        int cfr_ignored_67 = (int)(0xBA72A8827D4EB4FL ^ (long)n2 ^ 0xA860831A2DB9BA9FL);
                                                        try {
                                                            n += 5;
                                                            if ((0xD7AAC8F458FB79C1L ^ (long)n2 | 1L) == 0L) {
                                                                throw new ArithmeticException();
                                                            }
                                                            n3 = Integer.reverse(Integer.reverse(1832044569 * -1006719569 + -1795435891 ^ n2));
                                                        }
                                                        catch (ArithmeticException arithmeticException) {
                                                            n3 = 1832044569 * -1006719569 + -1795435891 ^ n2 ^ 0xE5108023 ^ 0xE5108023;
                                                        }
                                                        n += 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_68 = (Integer.rotateRight(0x48A5B552 ^ n2, 12) + -798059479) * 1218819411;
                                                    n3 = 330892099 * -1006719569 + -1795435891 ^ n2;
                                                    int cfr_ignored_69 = (Integer.rotateRight(0x9DF1D05E ^ n2, 6) - 614849181) * -1645096865;
                                                    n3 = (int)((long)(1832044569 * -1006719569 + -1795435891 ^ n2) ^ 0xE98BA1FE32E24434L ^ 0xE98BA1FE32E24434L);
                                                    n += 4;
                                                    continue;
                                                }
                                                int cfr_ignored_70 = Integer.rotateLeft(0x69300A28 ^ n2, 16) + -1053894125;
                                                try {
                                                    n += 5;
                                                    n3 = Integer.reverse(Integer.reverse(1832044569 * -1006719569 + -1795435891 ^ n2));
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    n3 = (1832044569 * -1006719569 + -1795435891 ^ n2) + -1002814164 - -1002814164;
                                                }
                                                n += 3;
                                                continue;
                                            }
                                            int cfr_ignored_71 = Integer.rotateLeft(0x86C867A5 ^ n2, 3) - 1453468726;
                                            int cfr_ignored_72 = (int)(0x447AC99827D4EB4FL ^ (long)n2 ^ 0x6E40831A2DB92524L);
                                            n3 = (-1730383480 * -1006719569 + -1795435891 ^ n2) + 895096833 - 895096833;
                                            int cfr_ignored_73 = (Integer.rotateLeft(0x50540579 ^ n2, 13) + -1098233630) * 1347683705;
                                            int cfr_ignored_74 = (int)(0x92E6AB4427D4EB4FL ^ (long)n2 ^ 0xABF8831A2DB8881CL);
                                            n3 = 2033929231 * -1006719569 + -1795435891 ^ n2 ^ 0x342E3CEE ^ 0x342E3CEE;
                                            int cfr_ignored_75 = Integer.rotateLeft(0xACA3C960 ^ n2, 8) + -332201509;
                                            n3 = 1832044569 * -1006719569 + -1795435891 ^ n2 ^ 0x55F7CC19 ^ 0x55F7CC19;
                                            n += 5;
                                            continue;
                                        }
                                        int cfr_ignored_76 = (Integer.rotateRight(0xEB4C2EDF ^ n2, 16) - -2104013764) * -347328801;
                                        n3 = (-243002804 * -1006719569 + -1795435891 ^ n2) + 1594720190 - 1594720190;
                                        int cfr_ignored_77 = Integer.rotateLeft(0xE30B4E04 ^ n2, 15) - -2101603913;
                                        n3 = (1832044569 * -1006719569 + -1795435891 ^ n2) + 228462231 - 228462231;
                                        int cfr_ignored_78 = Integer.rotateRight(0xD492168B ^ n2, 13) + -1039246832;
                                        ++n;
                                        continue;
                                    }
                                    int cfr_ignored_79 = Integer.rotateRight(0xC24358E2 ^ n2, 11) + -1970969959;
                                    n3 = (int)((long)(307445155 * -1006719569 + -1795435891 ^ n2) ^ 0x6B0F9269648BA7A3L ^ 0x6B0F9269648BA7A3L);
                                    int cfr_ignored_80 = (Integer.rotateRight(0x19B681DE ^ n2, 6) - 561469725) * 431391199;
                                    n3 = (int)((long)(1832044569 * -1006719569 + -1795435891 ^ n2) ^ 0x9FF0F23872DD2DB9L ^ 0x9FF0F23872DD2DB9L);
                                    int cfr_ignored_81 = (Integer.rotateLeft(0x65A04FF8 ^ n2, 15) + 1388793411) * 1705005049;
                                    continue;
                                }
                                int cfr_ignored_82 = (Integer.rotateLeft(0xB7435B10 ^ n2, 9) + 897951275) * -1220322543;
                                n3 = Integer.reverse(Integer.reverse(-1160364341 * -1006719569 + -1795435891 ^ n2));
                                int cfr_ignored_83 = (Integer.rotateLeft(0x3D559C9D ^ n2, 10) - 1908119102) * 1029020829;
                                int cfr_ignored_84 = (int)(0xFFE732A027D4EB4FL ^ (long)n2 ^ 0x9830831A2DB8521FL);
                                try {
                                    n -= 2;
                                    if ((0xB9D976E81ACC175DL ^ (long)n2 | 1L) == 0L) {
                                        throw new NoSuchElementException();
                                    }
                                    n3 = 1832044569 * -1006719569 + -1795435891 ^ n2;
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    n3 = Integer.reverse(Integer.reverse(1832044569 * -1006719569 + -1795435891 ^ n2));
                                }
                                n -= 3;
                                continue;
                            }
                            int cfr_ignored_85 = (Integer.rotateRight(0x66C7C8DB ^ n2, 15) + 1989079488) * 1724369115;
                            int cfr_ignored_86 = (int)(0xAD89F7EB162B3C89L ^ (long)n2 ^ 0x12A6E0E58234F6C2L);
                            n3 = (1492641860 * -1006719569 + -1795435891 ^ n2) + -516375418 - -516375418;
                            int cfr_ignored_87 = (int)(0x30E2E572A6AE95B8L ^ (long)n2 ^ 0x379581EED057CC14L);
                            n3 = (1832044569 * -1006719569 + -1795435891 ^ n2) + -279499729 - -279499729;
                            continue;
                        }
                        int cfr_ignored_88 = (Integer.rotateLeft(0xD29BFB39 ^ n2, 13) + -2059334878) * -761529543;
                        int cfr_ignored_89 = (int)(0x1029550427D4EB4FL ^ (long)n2 ^ 0x5778831A2DB98D83L);
                        n3 = 705862178 * -1006719569 + -1795435891 ^ n2;
                        int cfr_ignored_90 = Integer.rotateRight(0x1E6BE32B ^ n2, 6) + -1284628112;
                        try {
                            n += 4;
                            if ((0xAEAD87B58525B285L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n3 = 1832044569 * -1006719569 + -1795435891 ^ n2;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = (1832044569 * -1006719569 + -1795435891 ^ n2) + -2141528084 - -2141528084;
                        }
                        n += 5;
                        continue;
                    }
                    int cfr_ignored_91 = Integer.rotateLeft(0x4DCDB64 ^ n2, 3) - -1692651433;
                    n3 = (1832044569 * -1006719569 + -1795435891 ^ n2) + -92845737 - -92845737;
                    int cfr_ignored_92 = Integer.rotateLeft(0x5D9A7AC5 ^ n2, 14) - 1511161110;
                    int cfr_ignored_93 = (int)(0x9F28D4F827D4EB4FL ^ (long)n2 ^ 0x5480831A2DB89380L);
                    --n;
                    continue;
                }
                return bl2;
            }
            int cfr_ignored_94 = Integer.rotateRight(0x216AE482 ^ n2, 7) + 273631993;
            n3 = (1832044569 * -1006719569 + -1795435891 ^ n2) + 1167432404 - 1167432404;
        }
    }

    private void dkkh() {
        boolean bl;
        int n = -1677800268;
        n = Integer.rotateLeft(n * -910065319, 14) ^ 0x636E1BCD;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xA39448AE;
        if ((n2 ^ n) != -1550563154) {
            int cfr_ignored_0 = (0x386A841A ^ n) + -1035075132;
        }
        if (!(bl = kz_2.shsz(kz_2.mc.field_1724.method_6118(class_1304.field_6174), class_1802.field_8833))) {
            this.zhh = false;
            return;
        }
        if (kz_2.mc.field_1724.method_24828() || kz_2.mc.field_1724.method_5799() || kz_2.mc.field_1724.method_5869() || kz_2.mc.field_1724.method_5771()) {
            this.zhh = false;
            return;
        }
        if (!this.saz.shzl() || kz_2.mc.field_1724.method_6128() || kz_2.mc.field_1724.field_6017 <= 0.0f) {
            return;
        }
        kz_2.sdhr_2(this, this.shms.shzl() && !this.zhh);
        this.zhh = true;
    }

    private void tjkh_2(boolean bl) {
        int n = 0;
        int n2 = 1414160332;
        n2 = Integer.rotateLeft(n2 * 74421487, 20) ^ 0x97C0B169;
        n2 = System.identityHashCode(this) ^ n2;
        n2 = Integer.rotateLeft(bl ^ n2, 24);
        int n3 = -1662864987 + n2;
        block43: while (true) {
            switch (n3 - n2) {
                case -1662864984: {
                    int cfr_ignored_0 = Integer.rotateRight(0x52F434F ^ n2, 3) - -1525234228;
                    if (kz_2.mc.field_1724 != null) {
                        try {
                            n += 4;
                            if ((0xC2618C87C7B405DFL ^ (long)n2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n3 = -1662864985 + n2 + 1143165702 - 1143165702;
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = (int)((long)(-1662864985 + n2) ^ 0xB7312DD5D6CF32DL ^ 0xB7312DD5D6CF32DL);
                        }
                        ++n;
                        continue block43;
                    }
                    try {
                        if ((0xDDD0CCAAB82D7E61L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = -1662864986 + n2 ^ 0xC1A07DE7 ^ 0xC1A07DE7;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = -1662864986 + n2;
                    }
                    n += 3;
                    continue block43;
                }
                case -1662864987: {
                    int cfr_ignored_1 = Integer.rotateLeft(0x65382CC1 ^ n2, 15) + 1177225882;
                    int cfr_ignored_2 = (int)(0xA78A82FC27D4EB4FL ^ (long)n2 ^ 0xF888831A2DB8E2C4L);
                    if (this.shzf != bghh.dwh_2) {
                        try {
                            --n;
                            if ((0xE9CBAEBC1ED3DBFBL ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = Integer.reverse(Integer.reverse(-1662864986 + n2));
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = -1662864986 + n2 ^ 0x17EAB431 ^ 0x17EAB431;
                        }
                        n -= 5;
                        continue block43;
                    }
                    n3 = Integer.reverse(Integer.reverse(-1662864984 + n2));
                    int cfr_ignored_3 = (Integer.rotateLeft(0xBF52711 ^ n2, 4) + 1997363786) * 200615697;
                    int cfr_ignored_4 = (int)(0xC947892C27D4EB4FL ^ (long)n2 ^ 0xEF28831A2DB83F5EL);
                    n -= 4;
                    continue block43;
                }
                case -1662864983: {
                    int cfr_ignored_5 = (Integer.rotateLeft(0x3C330D78 ^ n2, 10) + 1317814467) * 1009978745;
                    this.hdw = bl;
                    kz_2.mc.field_1690.field_1903.method_23481(false);
                    this.shzf = bghh.thzy_2;
                    return;
                }
                case -1662864986: {
                    int cfr_ignored_6 = (Integer.rotateLeft(0x947BCB31 ^ n2, 5) + -10798550) * -1803826383;
                    int cfr_ignored_7 = (int)(0x56C9650C27D4EB4FL ^ (long)n2 ^ 0x3768831A2DB90043L);
                    return;
                }
                case -1662864985: {
                    int cfr_ignored_8 = Integer.rotateRight(0x53DEF4E2 ^ n2, 13) + 744310425;
                    if (!kz_2.mc.field_1724.method_24828()) {
                        try {
                            n3 = Integer.reverse(Integer.reverse(-1662864983 + n2));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = Integer.reverse(Integer.reverse(-1662864983 + n2));
                        }
                        continue block43;
                    }
                    try {
                        n += 2;
                        if ((0xC4CC66BA14E361FL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (int)((long)(-1662864986 + n2) ^ 0xC46F9372E8DBF4F1L ^ 0xC46F9372E8DBF4F1L);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = -1662864986 + n2;
                    }
                    continue block43;
                }
                case -1662864982: {
                    int cfr_ignored_9 = Integer.rotateLeft(0xA843CE9 ^ n2, 4) + 1247870834;
                    int cfr_ignored_10 = (int)(0xC83692D427D4EB4FL ^ (long)n2 ^ 0xD8D8831A2DB83DBCL);
                    n3 = 54500082 + n2;
                    int cfr_ignored_11 = Integer.rotateLeft(0xCCEB5BE1 ^ n2, 12) + -723665030;
                    int cfr_ignored_12 = (int)(0xE59F5DC27D4EB4FL ^ (long)n2 ^ 0x16C8831A2DB9B162L);
                    try {
                        n -= 5;
                        if ((0x8C909250F3A05431L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (int)((long)(-1662864987 + n2) ^ 0x237427B38240C94FL ^ 0x237427B38240C94FL);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = -1662864987 + n2 ^ 0x99DFB3A5 ^ 0x99DFB3A5;
                    }
                    continue block43;
                }
                case -1662864981: {
                    int cfr_ignored_13 = Integer.rotateRight(0x3569A843 ^ n2, 9) + 2083061592;
                    n3 = -363039229 + n2;
                    int cfr_ignored_14 = (Integer.rotateLeft(0xA03089F4 ^ n2, 7) - 1782469575) * -1607431691;
                    try {
                        n += 4;
                        if ((0xC69D5F0A358ED981L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(-1662864987 + n2));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)(-1662864987 + n2) ^ 0xEE32B87AC7E4E5DFL ^ 0xEE32B87AC7E4E5DFL);
                    }
                    n -= 4;
                    continue block43;
                }
                case -1662864980: {
                    int cfr_ignored_15 = (Integer.rotateLeft(0x174A4AD5 ^ n2, 5) - -698568954) * 390744789;
                    int cfr_ignored_16 = (int)(0xD5F8E4E827D4EB4FL ^ (long)n2 ^ 0x34A0831A2DB80620L);
                    n3 = (int)((long)(448555310 + n2) ^ 0x24998A74BFDDEEB5L ^ 0x24998A74BFDDEEB5L);
                    int cfr_ignored_17 = (Integer.rotateLeft(0x5204FADC ^ n2, 13) - -218628129) * 1376058077;
                    n3 = (int)((long)(1017210084 + n2) ^ 0x4A36596B891D5C5CL ^ 0x4A36596B891D5C5CL);
                    int cfr_ignored_18 = Integer.rotateRight(0x21BD3AE2 ^ n2, 7) + 440909977;
                    n3 = -1662864987 + n2 ^ 0x6692AE7C ^ 0x6692AE7C;
                    n -= 2;
                    continue block43;
                }
                case -1662864979: {
                    int cfr_ignored_19 = Integer.rotateRight(0x19A85C8B ^ n2, 6) + 532730896;
                    n3 = -332452558 + n2 + -62573589 - -62573589;
                    int cfr_ignored_20 = Integer.rotateLeft(0x5D7D0FC9 ^ n2, 14) + 1451395218;
                    int cfr_ignored_21 = (int)(0x9FCFA1F427D4EB4FL ^ (long)n2 ^ 0xBE98831A2DB8924EL);
                    n3 = (int)((long)(-578389041 + n2) ^ 0x107BEE507357F8C5L ^ 0x107BEE507357F8C5L);
                    int cfr_ignored_22 = Integer.rotateLeft(0x8B2B9368 ^ n2, 4) + -559646509;
                    n3 = (int)((long)(-1662864987 + n2) ^ 0xAF2AC6A47ED39F42L ^ 0xAF2AC6A47ED39F42L);
                    n += 2;
                    continue block43;
                }
                case -1662864978: {
                    int cfr_ignored_23 = Integer.rotateLeft(0x93816B41 ^ n2, 5) + -519463910;
                    int cfr_ignored_24 = (int)(0x5133C57C27D4EB4FL ^ (long)n2 ^ 0x7788831A2DB90FB6L);
                    n3 = -1911858991 + n2 ^ 0x29E65CE5 ^ 0x29E65CE5;
                    int cfr_ignored_25 = (Integer.rotateRight(0x875B227A ^ n2, 3) + 1751567361) * -2024070533;
                    try {
                        n += 5;
                        if ((0x31091CAF7D83D3A7L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(-1662864987 + n2));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = -1662864987 + n2 ^ 0x4FB55CD7 ^ 0x4FB55CD7;
                    }
                    n += 3;
                    continue block43;
                }
                case -1662864977: {
                    int cfr_ignored_26 = Integer.rotateRight(0xA8BE90CB ^ n2, 8) + 1936795600;
                    int cfr_ignored_27 = (int)(0x197657E446FD541FL ^ (long)n2 ^ 0x52B8414953199F3DL);
                    n3 = 267821800 + n2;
                    int cfr_ignored_28 = (int)(0xC3E68E7753C24603L ^ (long)n2 ^ 0xE19E6B3777202A1CL);
                    n3 = (int)((long)(-1662864987 + n2) ^ 0xA645C1F8A00AF584L ^ 0xA645C1F8A00AF584L);
                    continue block43;
                }
                case -1662864976: {
                    int cfr_ignored_29 = (Integer.rotateRight(0xB1D1F6F2 ^ n2, 9) + -1932884343) * -1311639821;
                    n3 = Integer.reverse(Integer.reverse(1433245377 + n2));
                    int cfr_ignored_30 = Integer.rotateLeft(0x2B169D8D ^ n2, 8) - 1008382798;
                    int cfr_ignored_31 = (int)(0xE9A433B027D4EB4FL ^ (long)n2 ^ 0x9A10831A2DB87E99L);
                    n3 = Integer.reverse(Integer.reverse(-1662864987 + n2));
                    continue block43;
                }
                case -1662864975: {
                    int cfr_ignored_32 = (Integer.rotateLeft(0x55BA6810 ^ n2, 13) + 1710242091) * 1438279697;
                    n3 = -1715680605 + n2 + -398719484 - -398719484;
                    int cfr_ignored_33 = (Integer.rotateLeft(0x2EB34D58 ^ n2, 8) + -1407976221) * 783502681;
                    n3 = Integer.reverse(Integer.reverse(1223924193 + n2));
                    int cfr_ignored_34 = (Integer.rotateLeft(0x14C6575D ^ n2, 5) - -2006830210) * 348542813;
                    int cfr_ignored_35 = (int)(0xD674F96027D4EB4FL ^ (long)n2 ^ 0xFB0831A2DB80138L);
                    n3 = -1662864987 + n2 ^ 0xE55D8897 ^ 0xE55D8897;
                    continue block43;
                }
                case -1662864974: {
                    int cfr_ignored_36 = Integer.rotateLeft(0xAE429B40 ^ n2, 8) + 510553083;
                    n3 = -48086356 + n2 + 489516156 - 489516156;
                    int cfr_ignored_37 = (Integer.rotateLeft(0x1FAE4591 ^ n2, 6) + -629666870) * 531514769;
                    int cfr_ignored_38 = (int)(0xDD1CEBAC27D4EB4FL ^ (long)n2 ^ 0x2A28831A2DB817E8L);
                    n3 = (int)((long)(1247878983 + n2) ^ 0x6E024F60B4772692L ^ 0x6E024F60B4772692L);
                    int cfr_ignored_39 = Integer.rotateRight(0x55148402 ^ n2, 13) + 1373215609;
                    n3 = -1662864987 + n2 ^ 0x2EBF921C ^ 0x2EBF921C;
                    continue block43;
                }
                case -1662864973: {
                    int cfr_ignored_40 = (Integer.rotateLeft(0x9EDF0C94 ^ n2, 6) - 1096820007) * -1629549419;
                    n3 = 491325242 + n2;
                    int cfr_ignored_41 = (Integer.rotateLeft(0x6D5DFABD ^ n2, 16) - 1119812638) * 1834875581;
                    int cfr_ignored_42 = (int)(0xAFEF548027D4EB4FL ^ (long)n2 ^ 0x5470831A2DB8F20FL);
                    try {
                        n -= 4;
                        n3 = (int)((long)(-1662864987 + n2) ^ 0xD4477539FF92890FL ^ 0xD4477539FF92890FL);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = -1662864987 + n2;
                    }
                    --n;
                    continue block43;
                }
                case -1662864972: {
                    int cfr_ignored_43 = (Integer.rotateRight(0x6A9B195A ^ n2, 16) + -316296927) * 1788549467;
                    n3 = Integer.reverse(Integer.reverse(372329375 + n2));
                    int cfr_ignored_44 = (Integer.rotateRight(0x1E256576 ^ n2, 6) - -1427838843) * 505767287;
                    try {
                        ++n;
                        if ((0x3A13799501CC515FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = -1662864987 + n2 + -1456592087 - -1456592087;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)(-1662864987 + n2) ^ 0x80901758BAA4C749L ^ 0x80901758BAA4C749L);
                    }
                    n -= 2;
                    continue block43;
                }
                case -1662864971: {
                    int cfr_ignored_45 = Integer.rotateLeft(0x7A6BB1E0 ^ n2, 18) + -681039525;
                    n3 = 422286727 + n2;
                    int cfr_ignored_46 = (Integer.rotateLeft(0xD6019775 ^ n2, 13) - -292620698) * -704538763;
                    int cfr_ignored_47 = (int)(0x14B3394827D4EB4FL ^ (long)n2 ^ 0x8FE0831A2DB984B7L);
                    try {
                        n -= 5;
                        if ((0xF48074CC2F0FD44FL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = -1662864987 + n2;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.reverse(Integer.reverse(-1662864987 + n2));
                    }
                    n -= 4;
                    continue block43;
                }
                case -1662864970: {
                    int cfr_ignored_48 = (Integer.rotateRight(0xABACB553 ^ n2, 8) + -834169784) * -1414744749;
                    n3 = -1769052307 + n2 ^ 0x3A5FBD65 ^ 0x3A5FBD65;
                    int cfr_ignored_49 = Integer.rotateRight(0x6E3954EB ^ n2, 16) + 1565452208;
                    n3 = -1662864987 + n2 ^ 0x1BA23553 ^ 0x1BA23553;
                    n += 2;
                    continue block43;
                }
                case -1662864969: {
                    int cfr_ignored_50 = Integer.rotateRight(0xDDEEAC0F ^ n2, 14) - -465275636;
                    n3 = -1662864987 + n2 + 1399931097 - 1399931097;
                    int cfr_ignored_51 = (Integer.rotateLeft(0xCBD25259 ^ n2, 12) + -1294624766) * -875408807;
                    int cfr_ignored_52 = (int)(0x960FC6427D4EB4FL ^ (long)n2 ^ 0x5B8831A2DB9BF10L);
                    n += 5;
                    continue block43;
                }
            }
            int cfr_ignored_53 = Integer.rotateLeft(0x39651749 ^ n2, 10) + -140807918;
            int cfr_ignored_54 = (int)(0xFBD7B97427D4EB4FL ^ (long)n2 ^ 0x8F98831A2DB85A7EL);
            n3 = (int)((long)(-1662864987 + n2) ^ 0x4450B6AC3DD5FDC4L ^ 0x4450B6AC3DD5FDC4L);
        }
    }

    private boolean aql() {
        boolean bl = false;
        int n = 0;
        int n2 = -484460740;
        n2 = Integer.rotateLeft(n2 * -739332811, 24) ^ 0x6569478;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 25);
        int n3 = 2052163713 * -577898461 + -704500901 ^ n2;
        while (true) {
            block95: {
                block71: {
                    block90: {
                        block85: {
                            block89: {
                                block72: {
                                    block70: {
                                        block78: {
                                            block69: {
                                                block92: {
                                                    block88: {
                                                        block79: {
                                                            block91: {
                                                                block93: {
                                                                    block80: {
                                                                        block82: {
                                                                            block76: {
                                                                                block83: {
                                                                                    block81: {
                                                                                        block74: {
                                                                                            block67: {
                                                                                                block63: {
                                                                                                    block68: {
                                                                                                        block84: {
                                                                                                            block86: {
                                                                                                                block64: {
                                                                                                                    block66: {
                                                                                                                        block94: {
                                                                                                                            block65: {
                                                                                                                                block77: {
                                                                                                                                    block75: {
                                                                                                                                        block73: {
                                                                                                                                            block87: {
                                                                                                                                                if ((n = ((n3 ^ n2) - -704500901) * 1950775179) == 663037857) break block63;
                                                                                                                                                if (n == -1492047149) break block64;
                                                                                                                                                int cfr_ignored_0 = Integer.rotateLeft(0x73E7D025 ^ n2, 17) - 225432502;
                                                                                                                                                int cfr_ignored_1 = (int)(0xB1557E1827D4EB4FL ^ (long)n2 ^ 0x140831A2DB8CF7BL);
                                                                                                                                                if (n == 713033247) break block65;
                                                                                                                                                if (n == -2101393581) break block66;
                                                                                                                                                if (n == -5292458) break block67;
                                                                                                                                                if (n == -606024155) break block68;
                                                                                                                                                if (n == -469960331) break block69;
                                                                                                                                                if (n == 739228618) break block70;
                                                                                                                                                if (n == -1986223151) break block71;
                                                                                                                                                if (n == 292315280) break block72;
                                                                                                                                                if (n == -105938858) break block73;
                                                                                                                                                if (n == 1038007152) break block74;
                                                                                                                                                if (n == -386557538) break block75;
                                                                                                                                                if (n == 1922099824) break block76;
                                                                                                                                                if (n == -238886930) break block77;
                                                                                                                                                if (n == 192881395) break block78;
                                                                                                                                                if (n == 38532704) break block79;
                                                                                                                                                int cfr_ignored_2 = Integer.rotateRight(0x97F62426 ^ n2, 5) - 1798045653;
                                                                                                                                                if (n == -1410016000) break block80;
                                                                                                                                                if (n == -1231550517) break block81;
                                                                                                                                                if (n == 1809846775) break block82;
                                                                                                                                                if (n == -510917734) break block83;
                                                                                                                                                if (n == 1725146442) break block84;
                                                                                                                                                if (n == 1108807795) break block85;
                                                                                                                                                if (n == 1830857966) break block86;
                                                                                                                                                if (n == 575311240) break block87;
                                                                                                                                                if (n == -1090561183) break block88;
                                                                                                                                                if (n == 1478470033) break block89;
                                                                                                                                                if (n == 797825183) break block90;
                                                                                                                                                if (n == 90531812) break block91;
                                                                                                                                                if (n == 938922108) break block92;
                                                                                                                                                if (n == 1952269668) break block93;
                                                                                                                                                if (n == 2052163713) break block94;
                                                                                                                                                break block95;
                                                                                                                                            }
                                                                                                                                            int cfr_ignored_3 = Integer.rotateLeft(0xEE95EE24 ^ n2, 16) - -393906793;
                                                                                                                                            this.tsl_4();
                                                                                                                                            this.shzf = bghh.dwh_2;
                                                                                                                                            bl = true;
                                                                                                                                            try {
                                                                                                                                                n -= 5;
                                                                                                                                                n3 = -1986223151 * -577898461 + -704500901 ^ n2;
                                                                                                                                            }
                                                                                                                                            catch (IllegalStateException illegalStateException) {
                                                                                                                                                n3 = (int)((long)(-1986223151 * -577898461 + -704500901 ^ n2) ^ 0x71F0CFCE4D272D8FL ^ 0x71F0CFCE4D272D8FL);
                                                                                                                                            }
                                                                                                                                            continue;
                                                                                                                                        }
                                                                                                                                        int cfr_ignored_4 = Integer.rotateRight(0x78B90DA6 ^ n2, 18) - -1564064171;
                                                                                                                                        kz_2.sshh_2(this);
                                                                                                                                        this.shzf = bghh.dwh_2;
                                                                                                                                        this.hdw = false;
                                                                                                                                        bl = true;
                                                                                                                                        n3 = -740873105 * -577898461 + -704500901 ^ n2 ^ 0xAAF2F4B2 ^ 0xAAF2F4B2;
                                                                                                                                        int cfr_ignored_5 = (Integer.rotateRight(0x3CA6111A ^ n2, 10) + 1551479137) * 1017516315;
                                                                                                                                        n3 = (-1986223151 * -577898461 + -704500901 ^ n2) + 928531035 - 928531035;
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                    int cfr_ignored_6 = (Integer.rotateLeft(0x83732CB9 ^ n2, 3) + -279967326) * -2089603911;
                                                                                                                                    int cfr_ignored_7 = (int)(0x41C1828427D4EB4FL ^ (long)n2 ^ 0xF878831A2DB92E52L);
                                                                                                                                    kz_2.mc.field_1724.method_23669();
                                                                                                                                    kz_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)kz_2.mc.field_1724, class_2848.class_2849.field_12982));
                                                                                                                                    kz_2.khrq(kz_2.mc.field_1690.field_1903, true);
                                                                                                                                    if (!this.hdw) {
                                                                                                                                        try {
                                                                                                                                            n -= 2;
                                                                                                                                            if ((0xBA55A1EA9B54C54DL ^ (long)n2 | 1L) == 0L) {
                                                                                                                                                throw new UnsupportedOperationException();
                                                                                                                                            }
                                                                                                                                            n3 = Integer.reverse(Integer.reverse(-2101393581 * -577898461 + -704500901 ^ n2));
                                                                                                                                        }
                                                                                                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                                                            n3 = -2101393581 * -577898461 + -704500901 ^ n2 ^ 0x3921DE4 ^ 0x3921DE4;
                                                                                                                                        }
                                                                                                                                        ++n;
                                                                                                                                        continue;
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        n -= 2;
                                                                                                                                        n3 = Integer.reverse(Integer.reverse(-5292458 * -577898461 + -704500901 ^ n2));
                                                                                                                                    }
                                                                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                        n3 = (-5292458 * -577898461 + -704500901 ^ n2) + 1624417145 - 1624417145;
                                                                                                                                    }
                                                                                                                                    n += 4;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                int cfr_ignored_8 = Integer.rotateRight(0xC5FA47AF ^ n2, 11) - -39039636;
                                                                                                                                if (!kz_2.tdhf_2(kz_2.mc.field_1724)) {
                                                                                                                                    n3 = 1725146442 * -577898461 + -704500901 ^ n2 ^ 0xCCADD4D5 ^ 0xCCADD4D5;
                                                                                                                                    int cfr_ignored_9 = (Integer.rotateRight(0xD481145B ^ n2, 13) + -1073801664) * -729738149;
                                                                                                                                    continue;
                                                                                                                                }
                                                                                                                                n3 = -105938858 * -577898461 + -704500901 ^ n2 ^ 0x7ADEF500 ^ 0x7ADEF500;
                                                                                                                                n += 3;
                                                                                                                                continue;
                                                                                                                            }
                                                                                                                            int cfr_ignored_10 = Integer.rotateLeft(0x159C9120 ^ n2, 5) + -1571605989;
                                                                                                                            bl = false;
                                                                                                                            try {
                                                                                                                                if ((0xC0D9A0E991C907E5L ^ (long)n2 | 1L) == 0L) {
                                                                                                                                    throw new IllegalArgumentException();
                                                                                                                                }
                                                                                                                                n3 = -1986223151 * -577898461 + -704500901 ^ n2 ^ 0x3DE513E9 ^ 0x3DE513E9;
                                                                                                                            }
                                                                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                                n3 = -1986223151 * -577898461 + -704500901 ^ n2 ^ 0x60E5D4F9 ^ 0x60E5D4F9;
                                                                                                                            }
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        int cfr_ignored_11 = Integer.rotateLeft(0x853DE2C9 ^ n2, 3) + 651957650;
                                                                                                                        int cfr_ignored_12 = (int)(0x478F4CF427D4EB4FL ^ (long)n2 ^ 0x6498831A2DB922CFL);
                                                                                                                        if (this.shzf != bghh.dwh_2) {
                                                                                                                            n3 = (1038007152 * -577898461 + -704500901 ^ n2) + 1818264636 - 1818264636;
                                                                                                                            continue;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            n -= 2;
                                                                                                                            if ((0x887A83E08E86F6A7L ^ (long)n2 | 1L) == 0L) {
                                                                                                                                throw new IllegalArgumentException();
                                                                                                                            }
                                                                                                                            n3 = 713033247 * -577898461 + -704500901 ^ n2 ^ 0x3B14845C ^ 0x3B14845C;
                                                                                                                        }
                                                                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                                                                            n3 = (int)((long)(713033247 * -577898461 + -704500901 ^ n2) ^ 0x710D4DFFCE234CD6L ^ 0x710D4DFFCE234CD6L);
                                                                                                                        }
                                                                                                                        n -= 3;
                                                                                                                        continue;
                                                                                                                    }
                                                                                                                    int cfr_ignored_13 = (Integer.rotateLeft(0xFD8519B1 ^ n2, 18) + -1216627798) * -41608783;
                                                                                                                    int cfr_ignored_14 = (int)(0x3F37B78C27D4EB4FL ^ (long)n2 ^ 0x9268831A2DB9D3BEL);
                                                                                                                    this.hdw = false;
                                                                                                                    this.shzf = bghh.dhrk;
                                                                                                                    bl = true;
                                                                                                                    n3 = Integer.reverse(Integer.reverse(811447626 * -577898461 + -704500901 ^ n2));
                                                                                                                    int cfr_ignored_15 = Integer.rotateLeft(0xB1EDE564 ^ n2, 9) - -1876138409;
                                                                                                                    n3 = (int)((long)(-1986223151 * -577898461 + -704500901 ^ n2) ^ 0xE18E09CAA09B3F6FL ^ 0xE18E09CAA09B3F6FL);
                                                                                                                    n += 2;
                                                                                                                    continue;
                                                                                                                }
                                                                                                                int cfr_ignored_16 = (Integer.rotateLeft(0x36C06918 ^ n2, 9) + -1515562717) * 918579481;
                                                                                                                if (this.shzf != bghh.thzy_2) {
                                                                                                                    try {
                                                                                                                        n -= 5;
                                                                                                                        n3 = Integer.reverse(Integer.reverse(575311240 * -577898461 + -704500901 ^ n2));
                                                                                                                    }
                                                                                                                    catch (ArithmeticException arithmeticException) {
                                                                                                                        n3 = 575311240 * -577898461 + -704500901 ^ n2;
                                                                                                                    }
                                                                                                                    continue;
                                                                                                                }
                                                                                                                try {
                                                                                                                    n += 2;
                                                                                                                    if ((0x63FFB1D413048DE5L ^ (long)n2 | 1L) == 0L) {
                                                                                                                        throw new NoSuchElementException();
                                                                                                                    }
                                                                                                                    n3 = Integer.reverse(Integer.reverse(-386557538 * -577898461 + -704500901 ^ n2));
                                                                                                                }
                                                                                                                catch (NoSuchElementException noSuchElementException) {
                                                                                                                    n3 = Integer.reverse(Integer.reverse(-386557538 * -577898461 + -704500901 ^ n2));
                                                                                                                }
                                                                                                                ++n;
                                                                                                                continue;
                                                                                                            }
                                                                                                            int cfr_ignored_17 = Integer.rotateLeft(0x93BC1DC4 ^ n2, 5) - -400213513;
                                                                                                            if (!kz_2.mc.field_1724.method_5771()) {
                                                                                                                n3 = (int)((long)(-1492047149 * -577898461 + -704500901 ^ n2) ^ 0x471368969B8FB04CL ^ 0x471368969B8FB04CL);
                                                                                                                int cfr_ignored_18 = (Integer.rotateRight(0x2A5B411B ^ n2, 8) + 627736960) * 710623515;
                                                                                                                --n;
                                                                                                                continue;
                                                                                                            }
                                                                                                            n3 = Integer.reverse(Integer.reverse(-105938858 * -577898461 + -704500901 ^ n2));
                                                                                                            n -= 4;
                                                                                                            continue;
                                                                                                        }
                                                                                                        int cfr_ignored_19 = (Integer.rotateLeft(0xF2254479 ^ n2, 17) + 1457580514) * -232438663;
                                                                                                        int cfr_ignored_20 = (int)(0x3097EA4427D4EB4FL ^ (long)n2 ^ 0x29F8831A2DB9CCFEL);
                                                                                                        if (!kz_2.mc.field_1724.method_5869()) {
                                                                                                            try {
                                                                                                                n -= 5;
                                                                                                                n3 = (int)((long)(1830857966 * -577898461 + -704500901 ^ n2) ^ 0x2EA760488C3770BEL ^ 0x2EA760488C3770BEL);
                                                                                                            }
                                                                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                                n3 = 1830857966 * -577898461 + -704500901 ^ n2 ^ 0x4E3E9A64 ^ 0x4E3E9A64;
                                                                                                            }
                                                                                                            n -= 5;
                                                                                                            continue;
                                                                                                        }
                                                                                                        n3 = -105938858 * -577898461 + -704500901 ^ n2;
                                                                                                        n -= 3;
                                                                                                        continue;
                                                                                                    }
                                                                                                    int cfr_ignored_21 = Integer.rotateRight(0x41D26E6E ^ n2, 11) - -52887923;
                                                                                                    if (!kz_2.mc.field_1724.method_24828()) {
                                                                                                        n3 = -1046455842 * -577898461 + -704500901 ^ n2;
                                                                                                        int cfr_ignored_22 = (Integer.rotateRight(0x933AD1DA ^ n2, 5) + -662894431) * -1824861733;
                                                                                                        n3 = Integer.reverse(Integer.reverse(-238886930 * -577898461 + -704500901 ^ n2));
                                                                                                        n -= 2;
                                                                                                        continue;
                                                                                                    }
                                                                                                    try {
                                                                                                        n += 3;
                                                                                                        n3 = -105938858 * -577898461 + -704500901 ^ n2;
                                                                                                    }
                                                                                                    catch (IllegalStateException illegalStateException) {
                                                                                                        n3 = (int)((long)(-105938858 * -577898461 + -704500901 ^ n2) ^ 0x67A4D2D35F8D2FDCL ^ 0x67A4D2D35F8D2FDCL);
                                                                                                    }
                                                                                                    n -= 2;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_23 = (Integer.rotateRight(0xBEA4707E ^ n2, 10) - 440876669) * -1096519553;
                                                                                                if (!kz_2.mc.field_1724.method_24828()) {
                                                                                                    int cfr_ignored_24 = (int)(0x675777D359446B54L ^ (long)n2 ^ 0x12D67E3B2D8F637FL);
                                                                                                    n3 = -1681648276 * -577898461 + -704500901 ^ n2 ^ 0xE9D069D8 ^ 0xE9D069D8;
                                                                                                    int cfr_ignored_25 = (int)(0x6BD764851AF3B1B9L ^ (long)n2 ^ 0x347AF95498557A7FL);
                                                                                                    n3 = (-238886930 * -577898461 + -704500901 ^ n2) + -1229926814 - -1229926814;
                                                                                                    n -= 3;
                                                                                                    continue;
                                                                                                }
                                                                                                try {
                                                                                                    n -= 3;
                                                                                                    if ((0xEF957D7DC4D0D361L ^ (long)n2 | 1L) == 0L) {
                                                                                                        throw new NoSuchElementException();
                                                                                                    }
                                                                                                    n3 = -105938858 * -577898461 + -704500901 ^ n2 ^ 0xB21493B4 ^ 0xB21493B4;
                                                                                                }
                                                                                                catch (NoSuchElementException noSuchElementException) {
                                                                                                    n3 = -105938858 * -577898461 + -704500901 ^ n2 ^ 0xF6EC0407 ^ 0xF6EC0407;
                                                                                                }
                                                                                                --n;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_26 = (Integer.rotateLeft(0x8B4F1B19 ^ n2, 4) + -487463102) * -1957749991;
                                                                                            int cfr_ignored_27 = (int)(0x49FDB52427D4EB4FL ^ (long)n2 ^ 0x9738831A2DB93E2AL);
                                                                                            kz_2.dds_2(this);
                                                                                            this.jn.zat();
                                                                                            n3 = (int)((long)(-927097010 * -577898461 + -704500901 ^ n2) ^ 0x63F62A145437E107L ^ 0x63F62A145437E107L);
                                                                                            int cfr_ignored_28 = Integer.rotateRight(0xD08DF527 ^ n2, 13) - 1166954228;
                                                                                            n3 = (int)((long)(-2101393581 * -577898461 + -704500901 ^ n2) ^ 0x79549F663BF1D195L ^ 0x79549F663BF1D195L);
                                                                                            n -= 5;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_29 = Integer.rotateLeft(0xB1196124 ^ n2, 9) - 1987076759;
                                                                                        if (!kz_2.mc.field_1724.method_6118(class_1304.field_6174).method_31574(class_1802.field_8833)) {
                                                                                            try {
                                                                                                if ((0xBF1B56E7175F2CD5L ^ (long)n2 | 1L) == 0L) {
                                                                                                    throw new ArithmeticException();
                                                                                                }
                                                                                                n3 = Integer.reverse(Integer.reverse(-105938858 * -577898461 + -704500901 ^ n2));
                                                                                            }
                                                                                            catch (ArithmeticException arithmeticException) {
                                                                                                n3 = -105938858 * -577898461 + -704500901 ^ n2 ^ 0x7D24A285 ^ 0x7D24A285;
                                                                                            }
                                                                                            n += 3;
                                                                                            continue;
                                                                                        }
                                                                                        n3 = -176800326 * -577898461 + -704500901 ^ n2;
                                                                                        int cfr_ignored_30 = Integer.rotateLeft(0xAA8E0B04 ^ n2, 8) - -1416563529;
                                                                                        n3 = 663037857 * -577898461 + -704500901 ^ n2;
                                                                                        n += 3;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_31 = (Integer.rotateLeft(0xF32737DC ^ n2, 17) - 1981637343) * -215533603;
                                                                                    try {
                                                                                        n -= 4;
                                                                                        if ((0x3AE714FE0AA62705L ^ (long)n2 | 1L) == 0L) {
                                                                                            throw new NoSuchElementException();
                                                                                        }
                                                                                        n3 = Integer.reverse(Integer.reverse(2052163713 * -577898461 + -704500901 ^ n2));
                                                                                    }
                                                                                    catch (NoSuchElementException noSuchElementException) {
                                                                                        n3 = Integer.reverse(Integer.reverse(2052163713 * -577898461 + -704500901 ^ n2));
                                                                                    }
                                                                                    n -= 5;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_32 = Integer.rotateRight(0x901704AA ^ n2, 5) + 1999056849;
                                                                                try {
                                                                                    n3 = (int)((long)(2052163713 * -577898461 + -704500901 ^ n2) ^ 0x6A90C446FD5112A3L ^ 0x6A90C446FD5112A3L);
                                                                                }
                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                    n3 = 2052163713 * -577898461 + -704500901 ^ n2;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_33 = (Integer.rotateRight(0x87EE1A96 ^ n2, 3) - 2050152293) * -2014438761;
                                                                            n3 = (2052163713 * -577898461 + -704500901 ^ n2) + 314782898 - 314782898;
                                                                            int cfr_ignored_34 = (Integer.rotateRight(0xC6B73F3F ^ n2, 11) - 344868828) * -961069249;
                                                                            ++n;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_35 = Integer.rotateRight(0xDB08E962 ^ n2, 14) + -1972248039;
                                                                        n3 = 1840046389 * -577898461 + -704500901 ^ n2;
                                                                        int cfr_ignored_36 = Integer.rotateLeft(0xD62FC069 ^ n2, 13) + -198841358;
                                                                        int cfr_ignored_37 = (int)(0x149D6E5427D4EB4FL ^ (long)n2 ^ 0x21D8831A2DB984EBL);
                                                                        n3 = (107066641 * -577898461 + -704500901 ^ n2) + 2124889341 - 2124889341;
                                                                        int cfr_ignored_38 = Integer.rotateLeft(0x830C02A5 ^ n2, 3) - -489557706;
                                                                        int cfr_ignored_39 = (int)(0x41BEAC9827D4EB4FL ^ (long)n2 ^ 0xA440831A2DB92EACL);
                                                                        n3 = 2052163713 * -577898461 + -704500901 ^ n2;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_40 = Integer.rotateRight(0x32A8A446 ^ n2, 9) - 650740661;
                                                                    n3 = 598477618 * -577898461 + -704500901 ^ n2 ^ 0xB748E040 ^ 0xB748E040;
                                                                    int cfr_ignored_41 = Integer.rotateLeft(0x21D22CA0 ^ n2, 7) + 483460763;
                                                                    n3 = Integer.reverse(Integer.reverse(2052163713 * -577898461 + -704500901 ^ n2));
                                                                    n -= 2;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_42 = (Integer.rotateRight(0xDBDBD1D2 ^ n2, 14) + -1543764055) * -606350893;
                                                                n3 = (int)((long)(91048327 * -577898461 + -704500901 ^ n2) ^ 0xC5CAAD27C00281ABL ^ 0xC5CAAD27C00281ABL);
                                                                int cfr_ignored_43 = (Integer.rotateRight(0xC8FA83D7 ^ n2, 12) - 1521718852) * -923106345;
                                                                try {
                                                                    n += 5;
                                                                    n3 = (int)((long)(2052163713 * -577898461 + -704500901 ^ n2) ^ 0x685A09285F14DC61L ^ 0x685A09285F14DC61L);
                                                                }
                                                                catch (IllegalStateException illegalStateException) {
                                                                    n3 = Integer.reverse(Integer.reverse(2052163713 * -577898461 + -704500901 ^ n2));
                                                                }
                                                                n += 3;
                                                                continue;
                                                            }
                                                            int cfr_ignored_44 = Integer.rotateRight(0xBE6A108F ^ n2, 10) - 322281612;
                                                            try {
                                                                n -= 2;
                                                                if ((0x462AB6308C6E2EB7L ^ (long)n2 | 1L) == 0L) {
                                                                    throw new ArithmeticException();
                                                                }
                                                                n3 = 2052163713 * -577898461 + -704500901 ^ n2 ^ 0x1C6A4C0E ^ 0x1C6A4C0E;
                                                            }
                                                            catch (ArithmeticException arithmeticException) {
                                                                n3 = 2052163713 * -577898461 + -704500901 ^ n2;
                                                            }
                                                            continue;
                                                        }
                                                        int cfr_ignored_45 = Integer.rotateRight(0xB50AF4A6 ^ n2, 9) - -256819371;
                                                        n3 = 1476246118 * -577898461 + -704500901 ^ n2 ^ 0x5A831E90 ^ 0x5A831E90;
                                                        int cfr_ignored_46 = Integer.rotateRight(0xE36CBAAB ^ n2, 15) + -1903674896;
                                                        n3 = 2052163713 * -577898461 + -704500901 ^ n2;
                                                        n += 3;
                                                        continue;
                                                    }
                                                    int cfr_ignored_47 = (Integer.rotateLeft(0x41A7DE11 ^ n2, 11) + -139361462) * 1101520401;
                                                    int cfr_ignored_48 = (int)(0x8315702C27D4EB4FL ^ (long)n2 ^ 0x1D28831A2DB8ABFBL);
                                                    n3 = Integer.reverse(Integer.reverse(-405321590 * -577898461 + -704500901 ^ n2));
                                                    int cfr_ignored_49 = Integer.rotateRight(0xE14599CA ^ n2, 15) + 1271611057;
                                                    n3 = 2052163713 * -577898461 + -704500901 ^ n2;
                                                    n -= 4;
                                                    continue;
                                                }
                                                int cfr_ignored_50 = (Integer.rotateRight(0xB3937DF6 ^ n2, 9) - -1019617275) * -1282179593;
                                                n3 = 1425655878 * -577898461 + -704500901 ^ n2 ^ 0xB9D4F9CA ^ 0xB9D4F9CA;
                                                int cfr_ignored_51 = (Integer.rotateLeft(0xA820830 ^ n2, 4) + 1243389195) * 176293937;
                                                try {
                                                    if ((0x2300B81D63D25829L ^ (long)n2 | 1L) == 0L) {
                                                        throw new ArithmeticException();
                                                    }
                                                    n3 = 2052163713 * -577898461 + -704500901 ^ n2;
                                                }
                                                catch (ArithmeticException arithmeticException) {
                                                    n3 = (int)((long)(2052163713 * -577898461 + -704500901 ^ n2) ^ 0xF0FBD6B596909EACL ^ 0xF0FBD6B596909EACL);
                                                }
                                                n -= 5;
                                                continue;
                                            }
                                            int cfr_ignored_52 = (Integer.rotateRight(0x1A9F8A7B ^ n2, 6) + 1034904608) * 446663291;
                                            n3 = 1157745437 * -577898461 + -704500901 ^ n2;
                                            int cfr_ignored_53 = Integer.rotateRight(0xC36A6D6E ^ n2, 11) - -1371480179;
                                            try {
                                                n += 2;
                                                if ((0xBA3F381FF1697F35L ^ (long)n2 | 1L) == 0L) {
                                                    throw new IllegalStateException();
                                                }
                                                n3 = (int)((long)(2052163713 * -577898461 + -704500901 ^ n2) ^ 0xD01005BB95AE3CEEL ^ 0xD01005BB95AE3CEEL);
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                n3 = 2052163713 * -577898461 + -704500901 ^ n2;
                                            }
                                            continue;
                                        }
                                        int cfr_ignored_54 = Integer.rotateLeft(0xF0A75148 ^ n2, 17) + 681604851;
                                        n3 = 1522008978 * -577898461 + -704500901 ^ n2;
                                        int cfr_ignored_55 = Integer.rotateRight(0x9C183D6B ^ n2, 6) + -347271376;
                                        try {
                                            n -= 2;
                                            if ((0x6BF558682216FC6BL ^ (long)n2 | 1L) == 0L) {
                                                throw new UnsupportedOperationException();
                                            }
                                            n3 = (int)((long)(2052163713 * -577898461 + -704500901 ^ n2) ^ 0xCAC456483FEF6C83L ^ 0xCAC456483FEF6C83L);
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            n3 = 2052163713 * -577898461 + -704500901 ^ n2 ^ 0xFD1D67A7 ^ 0xFD1D67A7;
                                        }
                                        --n;
                                        continue;
                                    }
                                    int cfr_ignored_56 = Integer.rotateRight(0xC6B43B6B ^ n2, 11) + 338743600;
                                    n3 = Integer.reverse(Integer.reverse(2052163713 * -577898461 + -704500901 ^ n2));
                                    int cfr_ignored_57 = Integer.rotateRight(0x2C86CFA2 ^ n2, 8) + 1756414937;
                                    --n;
                                    continue;
                                }
                                int cfr_ignored_58 = (Integer.rotateRight(0x6B959F97 ^ n2, 16) - 192672388) * 1804967831;
                                n3 = 2052163713 * -577898461 + -704500901 ^ n2;
                                int cfr_ignored_59 = Integer.rotateRight(0xDD970AE6 ^ n2, 14) - -643305195;
                                n += 3;
                                continue;
                            }
                            int cfr_ignored_60 = (Integer.rotateRight(0xE982293A ^ n2, 16) + 1260428609) * -377345733;
                            try {
                                --n;
                                if ((0x465D80310351D235L ^ (long)n2 | 1L) == 0L) {
                                    throw new ArithmeticException();
                                }
                                n3 = (2052163713 * -577898461 + -704500901 ^ n2) + -2111802696 - -2111802696;
                            }
                            catch (ArithmeticException arithmeticException) {
                                n3 = (2052163713 * -577898461 + -704500901 ^ n2) + -463934409 - -463934409;
                            }
                            ++n;
                            continue;
                        }
                        int cfr_ignored_61 = (Integer.rotateLeft(0xBADDDDBD ^ n2, 10) - -1522829026) * -1159864899;
                        int cfr_ignored_62 = (int)(0x786F738027D4EB4FL ^ (long)n2 ^ 0x1A70831A2DB95D0FL);
                        try {
                            n -= 5;
                            if ((0x5D439A563DA4D38FL ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = 2052163713 * -577898461 + -704500901 ^ n2;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = 2052163713 * -577898461 + -704500901 ^ n2 ^ 0x5BDBEED7 ^ 0x5BDBEED7;
                        }
                        --n;
                        continue;
                    }
                    int cfr_ignored_63 = Integer.rotateRight(0x27301646 ^ n2, 7) - -1020243531;
                    n3 = (-824494995 * -577898461 + -704500901 ^ n2) + 1518728059 - 1518728059;
                    int cfr_ignored_64 = (Integer.rotateLeft(0x9FF2D694 ^ n2, 6) - 1657117479) * -1611475307;
                    n3 = 2052163713 * -577898461 + -704500901 ^ n2 ^ 0xF206B766 ^ 0xF206B766;
                    int cfr_ignored_65 = (Integer.rotateRight(0x1C10C92 ^ n2, 3) + 985539817) * 29428883;
                    continue;
                }
                return bl;
            }
            int cfr_ignored_66 = (Integer.rotateLeft(0x455D9414 ^ n2, 11) - 1790086567) * 1163760661;
            int cfr_ignored_67 = (Integer.rotateLeft(0x4BF6C131 ^ n2, 12) + 926876714) * 1274462513;
            int cfr_ignored_68 = (int)(0x89446F0C27D4EB4FL ^ (long)n2 ^ 0x2368831A2DB8BF59L);
            n3 = (2052163713 * -577898461 + -704500901 ^ n2) + -1420288880 - -1420288880;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void tsl_4() {
        var3_1 = 0;
        var1_2 = -261244322;
        var1_2 = Integer.rotateLeft(var1_2 * -1430642789, 24) ^ 497768988;
        var1_2 = Integer.rotateLeft(System.identityHashCode(this) ^ var1_2, 6);
        var2_3 = Integer.reverse(var1_2 ^ 48669130 ^ 475431830) ^ -1166087570 ^ -1166087570;
        block27: while (true) {
            if ((var3_1 = Integer.reverse(var2_3) ^ var1_2 ^ 475431830) == 762479597) ** GOTO lbl122
            if (var3_1 == 80975024) ** GOTO lbl36
            (Integer.rotateLeft(-1435057552 ^ var1_2, 8) + -1463866677) * -1435057551;
            switch (var3_1) {
                case 48669130: {
                    (Integer.rotateLeft(-2059843940 ^ var1_2, 3) - 642591775) * -2059843939;
                    if (kz_2.mc.field_1690 != null) {
                        try {
                            var3_1 += 5;
                            if ((1063506583330592235L ^ (long)var1_2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var2_3 = Integer.reverse(var1_2 ^ 80975024 ^ 475431830) ^ 247407825 ^ 247407825;
                        }
                        catch (IllegalStateException v0) {
                            var2_3 = (int)((long)Integer.reverse(var1_2 ^ 80975024 ^ 475431830) ^ 3878543851419381307L ^ 3878543851419381307L);
                        }
                        ++var3_1;
                        continue block27;
                    }
                    var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 505611095 ^ 475431830)));
                    Integer.rotateRight(-1469205785 ^ var1_2, 8) - 1772505396;
                    var3_1 -= 2;
                    continue block27;
                }
                case -2103446994: {
                    (Integer.rotateRight(-1121930698 ^ var1_2, 10) - -346868795) * -1121930697;
                    kz_2.shdgh(kz_2.mc.field_1690.field_1903, kz_2.tdhsh(kz_2.mc.method_22683().method_4490(), kz_2.zsh_4(kz_2.mc.field_1690.field_1903.method_1429())));
                    return;
                }
lbl36:
                // 1 sources

                (Integer.rotateRight(-1427668874 ^ var1_2, 8) - -1234817659) * -1427668873;
                if (kz_2.mc.method_22683() != null) {
                    var2_3 = Integer.reverse(var1_2 ^ -2103446994 ^ 475431830);
                    (Integer.rotateLeft(1958335281 ^ var1_2, 17) + 652096042) * 1958335281;
                    (int)(-5329028242901505201L ^ (long)var1_2 ^ 533820704302875079L);
                    continue block27;
                }
                var2_3 = (int)((long)Integer.reverse(var1_2 ^ 296534983 ^ 475431830) ^ 4732818127996999604L ^ 4732818127996999604L);
                (Integer.rotateLeft(963306524 ^ var1_2, 10) - -129024353) * 963306525;
                var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 505611095 ^ 475431830)));
                ++var3_1;
                continue block27;
                case 505611095: {
                    Integer.rotateLeft(245574729 ^ var1_2, 4) + -903873518;
                    (int)(-3742066379972089009L ^ (long)var1_2 ^ -461474813346040334L);
                    return;
                }
                case 1710241910: {
                    (Integer.rotateLeft(-1284413572 ^ var1_2, 9) - -1088870593) * -1284413571;
                    try {
                        var3_1 -= 3;
                        if ((5746414440397149037L ^ (long)var1_2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var2_3 = Integer.reverse(var1_2 ^ 48669130 ^ 475431830) ^ -1761295364 ^ -1761295364;
                    }
                    catch (NoSuchElementException v1) {
                        var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 48669130 ^ 475431830)));
                    }
                    continue block27;
                }
                case 1907674747: {
                    (Integer.rotateRight(2095237111 ^ var1_2, 18) - 601085476) * 2095237111;
                    var2_3 = Integer.reverse(var1_2 ^ 2083807434 ^ 475431830) + 1001261206 - 1001261206;
                    (Integer.rotateLeft(-63756519 ^ var1_2, 18) + -1903207614) * -63756519;
                    (int)(4504031890727299919L ^ (long)var1_2 ^ -1209072351489437486L);
                    var2_3 = Integer.reverse(var1_2 ^ 48669130 ^ 475431830) ^ -47794127 ^ -47794127;
                    (Integer.rotateLeft(-2121254671 ^ var1_2, 3) + -1261140886) * -2121254671;
                    (int)(4837594753335094095L ^ (long)var1_2 ^ -3393318170764170348L);
                    continue block27;
                }
                case -80126837: {
                    Integer.rotateLeft(677381197 ^ var1_2, 8) - -402774898;
                    (int)(-1525969925043852465L ^ (long)var1_2 ^ -6228334136193943436L);
                    try {
                        var3_1 -= 5;
                        if ((7765227708931731691L ^ (long)var1_2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var2_3 = (int)((long)Integer.reverse(var1_2 ^ 48669130 ^ 475431830) ^ 8915420613120971648L ^ 8915420613120971648L);
                    }
                    catch (ArithmeticException v2) {
                        var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 48669130 ^ 475431830)));
                    }
                    var3_1 -= 5;
                    continue block27;
                }
                case 1101784123: {
                    Integer.rotateLeft(1053510217 ^ var1_2, 10) + -1627677166;
                    (int)(-253920716434117809L ^ (long)var1_2 ^ 3861980828929643810L);
                    var2_3 = Integer.reverse(var1_2 ^ -461553462 ^ 475431830);
                    Integer.rotateRight(1736551746 ^ var1_2, 15) + -1928226247;
                    try {
                        if ((-3129005388100584291L ^ (long)var1_2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 48669130 ^ 475431830)));
                    }
                    catch (IllegalStateException v3) {
                        var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 48669130 ^ 475431830)));
                    }
                    continue block27;
                }
                case -1955420603: {
                    Integer.rotateLeft(-543884536 ^ var1_2, 14) + 392693043;
                    (int)(-2783424100142080499L ^ (long)var1_2 ^ 7529643891654139759L);
                    var2_3 = (int)((long)Integer.reverse(var1_2 ^ 48669130 ^ 475431830) ^ 2449291844861352499L ^ 2449291844861352499L);
                    var3_1 -= 5;
                    continue block27;
                }
lbl122:
                // 1 sources

                Integer.rotateLeft(-2065681084 ^ var1_2, 3) - 461640311;
                var2_3 = Integer.reverse(var1_2 ^ -1982438412 ^ 475431830) ^ -426238434 ^ -426238434;
                (Integer.rotateRight(940245306 ^ var1_2, 10) + -843922111) * 940245307;
                var2_3 = (int)((long)Integer.reverse(var1_2 ^ -1813370770 ^ 475431830) ^ -306324066867864380L ^ -306324066867864380L);
                Integer.rotateLeft(811287845 ^ var1_2, 9) - -546636106;
                (int)(-942964157977400497L ^ (long)var1_2 ^ 3116635090599823362L);
                var2_3 = Integer.reverse(var1_2 ^ 48669130 ^ 475431830) ^ -2145418651 ^ -2145418651;
                var3_1 += 3;
                continue block27;
                case -1145815887: {
                    (Integer.rotateRight(1118032891 ^ var1_2, 11) + 372525728) * 1118032891;
                    (int)(-5128670147644802985L ^ (long)var1_2 ^ 7361153680840121463L);
                    var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 48669130 ^ 475431830)));
                    continue block27;
                }
                case -929931781: {
                    (Integer.rotateLeft(-1864081227 ^ var1_2, 5) - -1878698714) * -1864081227;
                    (int)(5933156643286346575L ^ (long)var1_2 ^ 6944694773864794492L);
                    var2_3 = Integer.reverse(var1_2 ^ -1557749358 ^ 475431830) ^ 1915888825 ^ 1915888825;
                    Integer.rotateLeft(-1514543323 ^ var1_2, 7) - 367041718;
                    (int)(7425108778746702671L ^ (long)var1_2 ^ 8016551485178995655L);
                    var2_3 = (int)((long)Integer.reverse(var1_2 ^ 2131951544 ^ 475431830) ^ 4093674058108607132L ^ 4093674058108607132L);
                    Integer.rotateRight(-1049995417 ^ var1_2, 11) - 1883124916;
                    var2_3 = Integer.reverse(var1_2 ^ 48669130 ^ 475431830) + 1390438974 - 1390438974;
                    var3_1 -= 5;
                    continue block27;
                }
                case 1382962827: {
                    (Integer.rotateRight(300399155 ^ var1_2, 5) + 795683688) * 300399155;
                    (int)(4220462844011926651L ^ (long)var1_2 ^ -3728920489363384075L);
                    var2_3 = Integer.reverse(var1_2 ^ -766648862 ^ 475431830) + -88618241 - -88618241;
                    (int)(-4023845968005626710L ^ (long)var1_2 ^ 2855934130971098497L);
                    var2_3 = Integer.reverse(Integer.reverse(Integer.reverse(var1_2 ^ 48669130 ^ 475431830)));
                    var3_1 += 3;
                    continue block27;
                }
                case -460724738: {
                    Integer.rotateRight(944224334 ^ var1_2, 10) - -720572243;
                    try {
                        if ((-7116965732525903913L ^ (long)var1_2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var2_3 = Integer.reverse(var1_2 ^ 48669130 ^ 475431830);
                    }
                    catch (IllegalArgumentException v4) {
                        var2_3 = (int)((long)Integer.reverse(var1_2 ^ 48669130 ^ 475431830) ^ 9134931085443001240L ^ 9134931085443001240L);
                    }
                    var3_1 += 2;
                    continue block27;
                }
                case 1111137677: {
                    (Integer.rotateRight(-1186830026 ^ var1_2, 10) - 1936219333) * -1186830025;
                    try {
                        var3_1 -= 3;
                        if ((962697601308127695L ^ (long)var1_2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var2_3 = (int)((long)Integer.reverse(var1_2 ^ 48669130 ^ 475431830) ^ 1166846078118998506L ^ 1166846078118998506L);
                    }
                    catch (IllegalStateException v5) {
                        var2_3 = Integer.reverse(var1_2 ^ 48669130 ^ 475431830);
                    }
                    --var3_1;
                    continue block27;
                }
            }
            Integer.rotateRight(990830118 ^ var1_2, 10) - 724207061;
            var2_3 = Integer.reverse(var1_2 ^ 48669130 ^ 475431830) + -1662706481 - -1662706481;
        }
    }

    private void khdj_2() {
        int n = 0;
        int n2 = -2103834703;
        n2 = Integer.rotateLeft(n2 * -201252453, 7) ^ 0xBA423CDB;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (int)((long)((n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847) ^ 0xE67FB8D16B255FF1L ^ 0xE67FB8D16B255FF1L);
        block43: while (true) {
            switch (n3 - -549847847 ^ 0xDF39FCD9 ^ n2) {
                case 1801510434: {
                    int cfr_ignored_0 = (Integer.rotateRight(0xDE6B9B3B ^ n2, 14) + -211457184) * -563373253;
                    if (!kz_2.mc.field_1724.method_6128()) {
                        try {
                            n -= 2;
                            if ((0x96362B4F1E5B8189L ^ (long)n2 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n3 = (n2 ^ 0xCAE80B9B ^ 0xDF39FCD9) + -549847847 ^ 0x8C44AD9B ^ 0x8C44AD9B;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n3 = (n2 ^ 0xCAE80B9B ^ 0xDF39FCD9) + -549847847 ^ 0x8BA36033 ^ 0x8BA36033;
                        }
                        n += 5;
                        continue block43;
                    }
                    try {
                        if ((0x73CA768BCB281DD1L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (n2 ^ 0x4B867FD1 ^ 0xDF39FCD9) + -549847847;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (n2 ^ 0x4B867FD1 ^ 0xDF39FCD9) + -549847847;
                    }
                    n -= 2;
                    continue block43;
                }
                case -890762341: {
                    int cfr_ignored_1 = (Integer.rotateLeft(0xABBE3051 ^ n2, 8) + -798656246) * -1413599151;
                    int cfr_ignored_2 = (int)(0x690C9E6C27D4EB4FL ^ (long)n2 ^ 0xC1A8831A2DB97FC8L);
                    return;
                }
                case -1615657859: {
                    int cfr_ignored_3 = Integer.rotateRight(0xF35F61AF ^ n2, 17) - 2095739756;
                    if (this.rtz.sdhkh() != -1) {
                        try {
                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x9E3C983E ^ 0xDF39FCD9) + -549847847));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = (n2 ^ 0x9E3C983E ^ 0xDF39FCD9) + -549847847 ^ 0x9534A72C ^ 0x9534A72C;
                        }
                        n -= 4;
                        continue block43;
                    }
                    n3 = (n2 ^ 0x23EE6A06 ^ 0xDF39FCD9) + -549847847 ^ 0x69E14067 ^ 0x69E14067;
                    int cfr_ignored_4 = Integer.rotateLeft(0x4AFF9525 ^ n2, 12) - 424718006;
                    int cfr_ignored_5 = (int)(0x884D3B1827D4EB4FL ^ (long)n2 ^ 0x8B40831A2DB8BD4BL);
                    continue block43;
                }
                case 1267105745: {
                    int cfr_ignored_6 = Integer.rotateLeft(0x61AF4C4C ^ n2, 15) - -661136273;
                    if (this.rtz.sdhkh() == -1) {
                        try {
                            n += 3;
                            if ((0xC2D36FE54B9AC697L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = (n2 ^ 0x23EE6A06 ^ 0xDF39FCD9) + -549847847;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x23EE6A06 ^ 0xDF39FCD9) + -549847847));
                        }
                        n += 3;
                        continue block43;
                    }
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x32684687 ^ 0xDF39FCD9) + -549847847));
                    int cfr_ignored_7 = (Integer.rotateLeft(0x928D914 ^ n2, 4) - 542107815) * 153671957;
                    n3 = (int)((long)((n2 ^ 0x9E3C983E ^ 0xDF39FCD9) + -549847847) ^ 0x887C1FDCA33A65CFL ^ 0x887C1FDCA33A65CFL);
                    n += 4;
                    continue block43;
                }
                case -1136622788: {
                    int cfr_ignored_8 = Integer.rotateRight(0xF5EB2D0E ^ n2, 17) - -875031571;
                    this.sdhq_2();
                    this.jn.zat();
                    n3 = (n2 ^ 0x23EE6A06 ^ 0xDF39FCD9) + -549847847 + 202506609 - 202506609;
                    int cfr_ignored_9 = (Integer.rotateRight(0x9355FEB7 ^ n2, 5) - -607684764) * -1823080777;
                    n += 4;
                    continue block43;
                }
                case -1493017699: {
                    int cfr_ignored_10 = Integer.rotateLeft(0xFEA94F89 ^ n2, 18) + -622968622;
                    int cfr_ignored_11 = (int)(0x3C1BE1B427D4EB4FL ^ (long)n2 ^ 0x3E18831A2DB9D5E6L);
                    if (this.jn.tagh(0x371A167595DAE6C1L ^ 0x371A167595DAE735L)) {
                        n3 = (n2 ^ 0x949220E5 ^ 0xDF39FCD9) + -549847847 + -115871562 - -115871562;
                        int cfr_ignored_12 = (Integer.rotateLeft(0x8D3472F1 ^ n2, 4) + 498567786) * -1925942543;
                        int cfr_ignored_13 = (int)(0x4F86DCCC27D4EB4FL ^ (long)n2 ^ 0x44E8831A2DB932DCL);
                        n3 = (n2 ^ 0xBC40833C ^ 0xDF39FCD9) + -549847847 + -2073020900 - -2073020900;
                        n += 4;
                        continue block43;
                    }
                    n3 = (n2 ^ 0x23EE6A06 ^ 0xDF39FCD9) + -549847847;
                    int cfr_ignored_14 = Integer.rotateRight(0x5F308082 ^ n2, 14) + -1958924551;
                    n += 4;
                    continue block43;
                }
                case -1640196034: {
                    int cfr_ignored_15 = (Integer.rotateRight(0xCC911516 ^ n2, 12) - -907072283) * -862907113;
                    if (brz.rzdh(this.rtz.sdhkh())) {
                        try {
                            n += 5;
                            if ((0xC29C68CA36FF77E5L ^ (long)n2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n3 = (n2 ^ 0xA7025B9D ^ 0xDF39FCD9) + -549847847 + 1908126788 - 1908126788;
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = (n2 ^ 0xA7025B9D ^ 0xDF39FCD9) + -549847847 ^ 0xEF4B1CCE ^ 0xEF4B1CCE;
                        }
                        continue block43;
                    }
                    n3 = (n2 ^ 0xC83208E5 ^ 0xDF39FCD9) + -549847847;
                    int cfr_ignored_16 = Integer.rotateLeft(0x75D6B05 ^ n2, 3) - -391277354;
                    int cfr_ignored_17 = (int)(0xC5EFC53827D4EB4FL ^ (long)n2 ^ 0x7700831A2DB8260EL);
                    n3 = (n2 ^ 0x23EE6A06 ^ 0xDF39FCD9) + -549847847 ^ 0x6F65D813 ^ 0x6F65D813;
                    continue block43;
                }
                case 602827270: {
                    int cfr_ignored_18 = Integer.rotateLeft(0xE171EFCC ^ n2, 15) - 1361684719;
                    return;
                }
                case 1858461852: {
                    int cfr_ignored_19 = (Integer.rotateLeft(0xCD43E550 ^ n2, 12) + -543792149) * -851188399;
                    n3 = (n2 ^ 0xB7131BDA ^ 0xDF39FCD9) + -549847847;
                    int cfr_ignored_20 = Integer.rotateRight(0x80096A06 ^ n2, 3) - -2055113227;
                    n3 = (n2 ^ 0x47B5710E ^ 0xDF39FCD9) + -549847847 + 2010776979 - 2010776979;
                    int cfr_ignored_21 = (Integer.rotateLeft(0x9160B550 ^ n2, 5) + -1626106901) * -1855933103;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847));
                    n -= 4;
                    continue block43;
                }
                case 2112592459: {
                    int cfr_ignored_22 = (Integer.rotateRight(0x308BD3BF ^ n2, 9) - -447986852) * 814470079;
                    n3 = (n2 ^ 0x128D8901 ^ 0xDF39FCD9) + -549847847 ^ 0x4941DBF6 ^ 0x4941DBF6;
                    int cfr_ignored_23 = (Integer.rotateLeft(0x50CAA179 ^ n2, 13) + -857264926) * 1355456889;
                    int cfr_ignored_24 = (int)(0x92780F4427D4EB4FL ^ (long)n2 ^ 0xE3F8831A2DB88921L);
                    try {
                        n -= 5;
                        if ((0x1354E82186B3619BL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (int)((long)((n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847) ^ 0x1C64348DECCE5136L ^ 0x1C64348DECCE5136L);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847;
                    }
                    continue block43;
                }
                case 556106434: {
                    int cfr_ignored_25 = (Integer.rotateRight(0x917E3357 ^ n2, 5) - -1566189884) * -1854000297;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x6565C04E ^ 0xDF39FCD9) + -549847847));
                    int cfr_ignored_26 = (Integer.rotateLeft(0x832F941D ^ n2, 3) - -417296706) * -2094033891;
                    int cfr_ignored_27 = (int)(0x419D3A2027D4EB4FL ^ (long)n2 ^ 0x8930831A2DB92EEBL);
                    try {
                        n -= 4;
                        if ((0x37ED4F462FC6FD93L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847;
                    }
                    continue block43;
                }
                case -354321579: {
                    int cfr_ignored_28 = (Integer.rotateRight(0x255FA7B7 ^ n2, 7) - -1963790748) * 627025847;
                    try {
                        n -= 5;
                        n3 = (int)((long)((n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847) ^ 0x54616F48444BD699L ^ 0x54616F48444BD699L);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847));
                    }
                    continue block43;
                }
                case 1995343790: {
                    int cfr_ignored_29 = Integer.rotateLeft(0xCA7409E8 ^ n2, 12) + -2006265261;
                    n3 = (int)((long)((n2 ^ 0x6C47BC61 ^ 0xDF39FCD9) + -549847847) ^ 0x21899E6471620836L ^ 0x21899E6471620836L);
                    int cfr_ignored_30 = (Integer.rotateLeft(0x49730F90 ^ n2, 12) + -380862037) * 1232277393;
                    n3 = (n2 ^ 0x34FFB6DB ^ 0xDF39FCD9) + -549847847 + -285878294 - -285878294;
                    int cfr_ignored_31 = (Integer.rotateRight(0xA1C62BF6 ^ n2, 7) - -1688407547) * -1580848137;
                    n3 = (n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847 + -1630253943 - -1630253943;
                    n += 3;
                    continue block43;
                }
                case 957719533: {
                    int cfr_ignored_32 = (Integer.rotateLeft(0x4F655A94 ^ n2, 12) - -1583114457) * 1332042389;
                    try {
                        --n;
                        if ((0xFBD164DB2D471BBL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847 + 629675709 - 629675709;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847));
                    }
                    continue block43;
                }
                case 418848616: {
                    int cfr_ignored_33 = Integer.rotateRight(0x3C7A5B47 ^ n2, 10) - 1462676692;
                    int cfr_ignored_34 = (int)(0xBF62E55CE4BD71E7L ^ (long)n2 ^ 0x37C905C918E8D314L);
                    n3 = (n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847 + -650254471 - -650254471;
                    n -= 5;
                    continue block43;
                }
                case -1030851503: {
                    int cfr_ignored_35 = (Integer.rotateRight(0xA160455A ^ n2, 7) + -1895430879) * -1587526309;
                    n3 = (int)((long)((n2 ^ 0x584803A7 ^ 0xDF39FCD9) + -549847847) ^ 0x62DFC95B28F232A6L ^ 0x62DFC95B28F232A6L);
                    int cfr_ignored_36 = Integer.rotateLeft(0x842DEB88 ^ n2, 3) + 99427507;
                    n3 = (n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847 + 1890288443 - 1890288443;
                    n += 2;
                    continue block43;
                }
                case 11066160: {
                    int cfr_ignored_37 = Integer.rotateRight(0x544E782 ^ n2, 3) + -1481267207;
                    n3 = (n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847 ^ 0xED478207 ^ 0xED478207;
                    continue block43;
                }
                case -741442134: {
                    int cfr_ignored_38 = (Integer.rotateRight(0x9F552B9F ^ n2, 6) - 1336797052) * -1621808225;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x57862651 ^ 0xDF39FCD9) + -549847847));
                    int cfr_ignored_39 = (Integer.rotateRight(0x377F3F5A ^ n2, 9) + -1127855327) * 931086171;
                    try {
                        n += 5;
                        if ((0x32A97E48DE430999L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (int)((long)((n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847) ^ 0x7AF37A7AA92AB9CEL ^ 0x7AF37A7AA92AB9CEL);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847;
                    }
                    n -= 4;
                    continue block43;
                }
                case 2000458660: {
                    int cfr_ignored_40 = Integer.rotateRight(0x685F08EE ^ n2, 16) - -1478511603;
                    n3 = (int)((long)((n2 ^ 0xDF1EBDC ^ 0xDF39FCD9) + -549847847) ^ 0x324C18416228420DL ^ 0x324C18416228420DL);
                    int cfr_ignored_41 = (Integer.rotateLeft(0x1987341D ^ n2, 6) - 465366718) * 428291101;
                    int cfr_ignored_42 = (int)(0xDB359A2027D4EB4FL ^ (long)n2 ^ 0xC930831A2DB81BBAL);
                    n3 = (n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847 ^ 0xC901DF1E ^ 0xC901DF1E;
                    n -= 5;
                    continue block43;
                }
                case -1161082423: {
                    int cfr_ignored_43 = (Integer.rotateLeft(0x5CA517BD ^ n2, 14) - 1012629278) * 1554323389;
                    int cfr_ignored_44 = (int)(0x9E17B98027D4EB4FL ^ (long)n2 ^ 0x8E70831A2DB891FEL);
                    n3 = (n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847 + -651469955 - -651469955;
                    continue block43;
                }
                case -1716884657: {
                    int cfr_ignored_45 = Integer.rotateRight(0x38223663 ^ n2, 10) + -796773064;
                    n3 = (n2 ^ 0xBFB915BD ^ 0xDF39FCD9) + -549847847 + -1322692703 - -1322692703;
                    int cfr_ignored_46 = Integer.rotateLeft(0xF565EF28 ^ n2, 17) + -1145727725;
                    n3 = (n2 ^ 0x8B5DD0BD ^ 0xDF39FCD9) + -549847847;
                    int cfr_ignored_47 = Integer.rotateRight(0x35AB79AE ^ n2, 9) - -2078188723;
                    n3 = (n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847 ^ 0x62328144 ^ 0x62328144;
                    continue block43;
                }
            }
            int cfr_ignored_48 = Integer.rotateRight(0x82B67C2A ^ n2, 3) + -663312303;
            n3 = (int)((long)((n2 ^ 0x6B60DE22 ^ 0xDF39FCD9) + -549847847) ^ 0xD064B3011990D839L ^ 0xD064B3011990D839L);
        }
    }

    private void tka_3() {
        boolean bl;
        int n = 982551017;
        n = Integer.rotateLeft(n * 301022607, 3) ^ 0x55AD477;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 25);
        int n2 = n ^ 0x3A989212;
        if ((n2 ^ n) != 983077394) {
            int cfr_ignored_0 = (0x81BFB ^ n) + -1150332220;
        }
        if (!kz_2.tfh(this.rsd_4)) {
            return;
        }
        if (this.dhhh_4.shzl() && !kz_2.mc.field_1724.method_6128()) {
            return;
        }
        class_1309 class_13092 = kz_2.atr().rkhh_2();
        boolean bl2 = bl = class_13092 != null;
        if (this.jhsh_2.shzl() && !bl) {
            return;
        }
        if (!kz_2.zht_8(this.jn, (long)kz_2.drk_2(this.thaz_4))) {
            return;
        }
        double d = Math.hypot(kz_2.znd_3((class_746)kz_2.mc.field_1724).field_1352, kz_2.mc.field_1724.method_18798().field_1350) * Double.longBitsToDouble(0xC6086EF43E129BC2L ^ 0x863C6EF43E129BC2L);
        if (bl) {
            double d2 = kz_2.haz_3(kz_2.mc.field_1724.method_19538(), class_13092.method_19538());
            double d3 = Math.hypot(class_13092.method_18798().field_1352, kz_2.dta_2((class_1309)class_13092).field_1350) * Double.longBitsToDouble(0xEA1767B4D997F818L ^ 0xAA2367B4D997F818L);
            if (d2 < Double.longBitsToDouble(0xD2162EB262DE0865L ^ 0x92022EB262DE0865L) && d > d3 * Double.longBitsToDouble(0x6996B9588DA7554DL ^ 0x567A7594416B9980L)) {
                return;
            }
        } else if (d > Double.longBitsToDouble(0x12ED8318F6FD220FL ^ 0x52DB8318F6FD220FL)) {
            return;
        }
        this.sdhq_2();
        kz_2.hhb(this.jn);
    }

    private void sdhq_2() {
        int n;
        try {
            int n2 = -844059346;
            n2 = Integer.rotateLeft(n2 * -27505065, 16) ^ 0x3D630741;
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 21);
            int n3 = n2 ^ 0x7AC4EFB;
            if ((n3 ^ n2) != 128732923) {
                int cfr_ignored_0 = (0xCA1CE3D5 ^ n2) - -707695105;
            }
            if ((0x1F0 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!kz_2.rss_2()) {
            kz_2.yq();
            throw null;
        }
        if (kz_2.mc.field_1724 == null || kz_2.mc.field_1761 == null) {
            return;
        }
        int n4 = -1;
        for (n = 0; n < (0x9CB1FDE3 ^ 0x9CB1FDEA); ++n) {
            class_1799 class_17992 = kz_2.mc.field_1724.method_31548().method_5438(n);
            if (class_17992.method_7960() || class_17992.method_7909() != class_1802.field_8639) continue;
            n4 = n;
            break;
        }
        if (n4 != -1) {
            n = kz_2.mc.field_1724.method_31548().field_7545;
            kz_2.mc.field_1724.method_31548().field_7545 = n4;
            kz_2.dsa_6(kz_2.mc.field_1761, (class_1657)kz_2.mc.field_1724, class_1268.field_5808);
            kz_2.mc.field_1724.method_6104(class_1268.field_5808);
            kz_2.mc.field_1724.method_31548().field_7545 = n;
        }
    }

    private void thght(btt btt2) {
        boolean bl = false;
        int n = 0;
        int n2 = -1787038788;
        n2 = Integer.rotateLeft(n2 * -1161725243, 25) ^ 0x36561B00;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 4);
        int n3 = (1263913984 * -731568409 + -2142128696 ^ n2) + -1312005771 - -1312005771;
        block38: while (true) {
            switch (((n3 ^ n2) - -2142128696) * -1723167529) {
                case 1075163587: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x2EEADBC4 ^ n2, 8) - -1295107081;
                    bl = this.ghzh();
                    if (bl) {
                        n3 = Integer.reverse(Integer.reverse(1169632623 * -731568409 + -2142128696 ^ n2));
                        int cfr_ignored_1 = (Integer.rotateRight(0x8EACF8F6 ^ n2, 4) - 1263518981) * -1901266697;
                        n -= 5;
                        continue block38;
                    }
                    n3 = (-1679777408 * -731568409 + -2142128696 ^ n2) + 984357559 - 984357559;
                    int cfr_ignored_2 = (Integer.rotateRight(0xEE16801E ^ n2, 16) - -652795171) * -300515297;
                    n3 = 1189529473 * -731568409 + -2142128696 ^ n2;
                    --n;
                    continue block38;
                }
                case 125900449: {
                    int cfr_ignored_3 = (Integer.rotateLeft(0x7FC2F818 ^ n2, 18) + 2096736803) * 2143483929;
                    if (kz_2.mc.field_1687 != null) {
                        int cfr_ignored_4 = (int)(0xD520A6E45AE4CB22L ^ (long)n2 ^ 0xB0B8797A6D620790L);
                        n3 = (-1274931463 * -731568409 + -2142128696 ^ n2) + -1810629355 - -1810629355;
                        n += 4;
                        continue block38;
                    }
                    try {
                        n += 5;
                        if ((0xFA120A23C290D7F7L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = -635307883 * -731568409 + -2142128696 ^ n2 ^ 0x81CB4F97 ^ 0x81CB4F97;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(Integer.reverse(-635307883 * -731568409 + -2142128696 ^ n2));
                    }
                    n -= 3;
                    continue block38;
                }
                case 1169632623: {
                    int cfr_ignored_5 = Integer.rotateRight(0x16AFDB2E ^ n2, 5) - -1012323891;
                    this.khdj_2();
                    this.tka_3();
                    return;
                }
                case 826331637: {
                    int cfr_ignored_6 = (Integer.rotateLeft(0x21D10A14 ^ n2, 7) - 481154983) * 567347733;
                    return;
                }
                case -635307883: {
                    int cfr_ignored_7 = Integer.rotateLeft(0xF4309D4D ^ n2, 17) - -1774146674;
                    int cfr_ignored_8 = (int)(0x3682337027D4EB4FL ^ (long)n2 ^ 0x9B90831A2DB9C0D5L);
                    return;
                }
                case 1263913984: {
                    int cfr_ignored_9 = (Integer.rotateRight(0xC22BD1B7 ^ n2, 11) - -2018769820) * -1037315657;
                    if (!yf.khdha_2()) {
                        n3 = (int)((long)(-2057009162 * -731568409 + -2142128696 ^ n2) ^ 0x6C696A8989DE3018L ^ 0x6C696A8989DE3018L);
                        n += 3;
                        continue block38;
                    }
                    n3 = (826257436 * -731568409 + -2142128696 ^ n2) + -68070939 - -68070939;
                    int cfr_ignored_10 = Integer.rotateLeft(0x6AC31DA4 ^ n2, 16) - -234998249;
                    n3 = (1819470289 * -731568409 + -2142128696 ^ n2) + 43361367 - 43361367;
                    n += 3;
                    continue block38;
                }
                case 1819470289: {
                    int cfr_ignored_11 = Integer.rotateLeft(0xBDEFA8 ^ n2, 3) + 459121811;
                    if (kz_2.mc.field_1724 == null) {
                        try {
                            n += 2;
                            if ((0x3E3AD943DF86E429L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            n3 = 826331637 * -731568409 + -2142128696 ^ n2 ^ 0x8FBA3C12 ^ 0x8FBA3C12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = (826331637 * -731568409 + -2142128696 ^ n2) + -613506517 - -613506517;
                        }
                        n += 5;
                        continue block38;
                    }
                    n3 = 125900449 * -731568409 + -2142128696 ^ n2 ^ 0xD5427B47 ^ 0xD5427B47;
                    int cfr_ignored_12 = (Integer.rotateLeft(0xE7E6B095 ^ n2, 15) - 424476998) * -404311915;
                    int cfr_ignored_13 = (int)(0x25541EA827D4EB4FL ^ (long)n2 ^ 0xC020831A2DB9E779L);
                    ++n;
                    continue block38;
                }
                case 1227185946: {
                    int cfr_ignored_14 = Integer.rotateLeft(0x4095DC5 ^ n2, 3) - -2122319338;
                    int cfr_ignored_15 = (int)(0xC6BBF3F827D4EB4FL ^ (long)n2 ^ 0x1A80831A2DB820A6L);
                    return;
                }
                case 1189529473: {
                    int cfr_ignored_16 = (Integer.rotateLeft(0xCA9C5A5D ^ n2, 12) - -1924362114) * -895722915;
                    int cfr_ignored_17 = (int)(0x82EF46027D4EB4FL ^ (long)n2 ^ 0x15B0831A2DB9BD8CL);
                    this.dkkh();
                    int cfr_ignored_18 = (int)(0xC5DF1E37C3452B4DL ^ (long)n2 ^ 0xC11F4A39ADBC266FL);
                    n3 = Integer.reverse(Integer.reverse(387165709 * -731568409 + -2142128696 ^ n2));
                    int cfr_ignored_19 = (int)(0x358BBE3BFB2B8810L ^ (long)n2 ^ 0x81073AE4EB07C6C6L);
                    n3 = (int)((long)(1169632623 * -731568409 + -2142128696 ^ n2) ^ 0xBC15EFA8F71DECFL ^ 0xBC15EFA8F71DECFL);
                    n += 4;
                    continue block38;
                }
                case -2057009162: {
                    int cfr_ignored_20 = Integer.rotateRight(0x35AA7E7 ^ n2, 3) - 1817703476;
                    yf.athz_2();
                    n3 = Integer.reverse(Integer.reverse(-243229162 * -731568409 + -2142128696 ^ n2));
                    int cfr_ignored_21 = (Integer.rotateLeft(0xD01E9F0 ^ n2, 4) + -1751583925) * 218229233;
                    n3 = Integer.reverse(Integer.reverse(1819470289 * -731568409 + -2142128696 ^ n2));
                    continue block38;
                }
                case -1274931463: {
                    int cfr_ignored_22 = (Integer.rotateRight(0x6AB0821F ^ n2, 16) - -272801540) * 1789952543;
                    if (!this.aql()) {
                        try {
                            ++n;
                            n3 = 1075163587 * -731568409 + -2142128696 ^ n2 ^ 0xA35F0CEE ^ 0xA35F0CEE;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = 1075163587 * -731568409 + -2142128696 ^ n2;
                        }
                        n += 3;
                        continue block38;
                    }
                    n3 = (1052728746 * -731568409 + -2142128696 ^ n2) + 117748911 - 117748911;
                    int cfr_ignored_23 = Integer.rotateRight(0xC46A4B42 ^ n2, 11) + -851657671;
                    n3 = 1227185946 * -731568409 + -2142128696 ^ n2 ^ 0x20443A36 ^ 0x20443A36;
                    n -= 4;
                    continue block38;
                }
                case -1562805794: {
                    int cfr_ignored_24 = Integer.rotateRight(0x22A9C107 ^ n2, 7) - 921435924;
                    n3 = (int)((long)(-86533734 * -731568409 + -2142128696 ^ n2) ^ 0x84157467D7449EDAL ^ 0x84157467D7449EDAL);
                    int cfr_ignored_25 = (Integer.rotateRight(0x49A1CCB2 ^ n2, 12) + -285906743) * 1235340467;
                    n3 = (1263913984 * -731568409 + -2142128696 ^ n2) + -1918425270 - -1918425270;
                    int cfr_ignored_26 = Integer.rotateRight(0x83FEAD43 ^ n2, 3) + 3447384;
                    n -= 4;
                    continue block38;
                }
                case 1177192850: {
                    int cfr_ignored_27 = Integer.rotateLeft(0xA8B39985 ^ n2, 8) - 1914517078;
                    int cfr_ignored_28 = (int)(0x6A0137B827D4EB4FL ^ (long)n2 ^ 0x9200831A2DB979D3L);
                    int cfr_ignored_29 = (int)(0xACFC641828417F10L ^ (long)n2 ^ 0x35409C310506F429L);
                    n3 = (int)((long)(-498012372 * -731568409 + -2142128696 ^ n2) ^ 0x7F4A2E237E845B97L ^ 0x7F4A2E237E845B97L);
                    int cfr_ignored_30 = (int)(0x49A28B614765E5D7L ^ (long)n2 ^ 0xEBB2427830893E94L);
                    n3 = 1263913984 * -731568409 + -2142128696 ^ n2;
                    n -= 2;
                    continue block38;
                }
                case 492245489: {
                    int cfr_ignored_31 = (Integer.rotateRight(0x4B54685A ^ n2, 12) + 597049889) * 1263822939;
                    n3 = (int)((long)(-1694958911 * -731568409 + -2142128696 ^ n2) ^ 0x100D6240D3B2152CL ^ 0x100D6240D3B2152CL);
                    int cfr_ignored_32 = Integer.rotateLeft(0x19BC6F81 ^ n2, 6) + 573513690;
                    int cfr_ignored_33 = (int)(0xDB0EC1BC27D4EB4FL ^ (long)n2 ^ 0x7E08831A2DB81BCCL);
                    int cfr_ignored_34 = (int)(0x8C36CC8FFD0954BAL ^ (long)n2 ^ 0x646F36A15252B5BCL);
                    n3 = (int)((long)(1263913984 * -731568409 + -2142128696 ^ n2) ^ 0xDEBE7123DC63EFA8L ^ 0xDEBE7123DC63EFA8L);
                    n += 2;
                    continue block38;
                }
                case 1280356479: {
                    int cfr_ignored_35 = Integer.rotateLeft(0x17245C48 ^ n2, 5) + -775631885;
                    n3 = -1106665656 * -731568409 + -2142128696 ^ n2 ^ 0x88852FCC ^ 0x88852FCC;
                    int cfr_ignored_36 = (Integer.rotateLeft(0xA800BE71 ^ n2, 8) + 1551150826) * -1476346255;
                    int cfr_ignored_37 = (int)(0x6AB2104C27D4EB4FL ^ (long)n2 ^ 0xDDE8831A2DB978B5L);
                    int cfr_ignored_38 = (int)(0x3BC987AA5CC935C9L ^ (long)n2 ^ 0xF224752190B5DA42L);
                    n3 = (int)((long)(1263913984 * -731568409 + -2142128696 ^ n2) ^ 0xF01A6BC3681B0BA4L ^ 0xF01A6BC3681B0BA4L);
                    n += 2;
                    continue block38;
                }
                case -508330818: {
                    int cfr_ignored_39 = Integer.rotateRight(0xF1EC47A2 ^ n2, 17) + 1341803481;
                    int cfr_ignored_40 = (int)(0xAD403838E738F755L ^ (long)n2 ^ 0x8D0102C2158CF751L);
                    n3 = (int)((long)(1898992790 * -731568409 + -2142128696 ^ n2) ^ 0xC89AF2A32789A9D9L ^ 0xC89AF2A32789A9D9L);
                    int cfr_ignored_41 = (int)(0x569D41D7A8025D5EL ^ (long)n2 ^ 0x7EDF9CB7419B00EBL);
                    n3 = (1263913984 * -731568409 + -2142128696 ^ n2) + -1448970874 - -1448970874;
                    n -= 5;
                    continue block38;
                }
                case 750769340: {
                    int cfr_ignored_42 = (Integer.rotateRight(0x5E27BCBB ^ n2, 14) + 1798142432) * 1579662523;
                    n3 = (945469645 * -731568409 + -2142128696 ^ n2) + 880444972 - 880444972;
                    int cfr_ignored_43 = Integer.rotateRight(0xB2CA2C2A ^ n2, 9) + -1428621231;
                    n3 = Integer.reverse(Integer.reverse(1799596363 * -731568409 + -2142128696 ^ n2));
                    int cfr_ignored_44 = Integer.rotateLeft(0x586E42A8 ^ n2, 14) + -1179143789;
                    n3 = 1263913984 * -731568409 + -2142128696 ^ n2;
                    continue block38;
                }
                case 517223357: {
                    int cfr_ignored_45 = Integer.rotateLeft(0x12F46128 ^ n2, 5) + 1341481747;
                    n3 = (-1472449695 * -731568409 + -2142128696 ^ n2) + -293148482 - -293148482;
                    int cfr_ignored_46 = Integer.rotateLeft(0x451AA12C ^ n2, 11) - 1654072207;
                    int cfr_ignored_47 = (int)(0xE60E84BD0343F20DL ^ (long)n2 ^ 0xF40ACA341F3C61CCL);
                    n3 = 686394565 * -731568409 + -2142128696 ^ n2 ^ 0xC477CFA7 ^ 0xC477CFA7;
                    int cfr_ignored_48 = (int)(0xBC4997B95B20431BL ^ (long)n2 ^ 0xD2027AF37D10D542L);
                    n3 = Integer.reverse(Integer.reverse(1263913984 * -731568409 + -2142128696 ^ n2));
                    continue block38;
                }
                case -808416983: {
                    int cfr_ignored_49 = Integer.rotateLeft(0x416D30EC ^ n2, 11) - -258569265;
                    try {
                        n += 3;
                        if ((0x7D81AC01B6EFD865L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse(1263913984 * -731568409 + -2142128696 ^ n2));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = 1263913984 * -731568409 + -2142128696 ^ n2;
                    }
                    --n;
                    continue block38;
                }
                case -2019039577: {
                    int cfr_ignored_50 = Integer.rotateLeft(0xC39626A9 ^ n2, 11) + -1282650702;
                    int cfr_ignored_51 = (int)(0x124889427D4EB4FL ^ (long)n2 ^ 0xEC58831A2DB9AF98L);
                    try {
                        n -= 3;
                        n3 = 1263913984 * -731568409 + -2142128696 ^ n2 ^ 0xDD16E23C ^ 0xDD16E23C;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(1263913984 * -731568409 + -2142128696 ^ n2));
                    }
                    continue block38;
                }
                case -2063263920: {
                    int cfr_ignored_52 = Integer.rotateRight(0xD72AE4AF ^ n2, 13) - 311382124;
                    n3 = 999140461 * -731568409 + -2142128696 ^ n2 ^ 0xF7D4CC15 ^ 0xF7D4CC15;
                    int cfr_ignored_53 = Integer.rotateRight(0x3BA20B4B ^ n2, 10) + 1023212880;
                    try {
                        if ((0x24E057A0452DF415L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = 1263913984 * -731568409 + -2142128696 ^ n2 ^ 0xDF18A882 ^ 0xDF18A882;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.reverse(Integer.reverse(1263913984 * -731568409 + -2142128696 ^ n2));
                    }
                    continue block38;
                }
                case 1464351688: {
                    int cfr_ignored_54 = Integer.rotateLeft(0x29069CA1 ^ n2, 8) + -64317766;
                    int cfr_ignored_55 = (int)(0xEBB4329C27D4EB4FL ^ (long)n2 ^ 0x9848831A2DB87AB9L);
                    n3 = 614996273 * -731568409 + -2142128696 ^ n2;
                    int cfr_ignored_56 = (Integer.rotateLeft(0x1338D254 ^ n2, 5) - 1480529767) * 322490965;
                    n3 = (int)((long)(1263913984 * -731568409 + -2142128696 ^ n2) ^ 0x56E8E241ACA1D2CCL ^ 0x56E8E241ACA1D2CCL);
                    continue block38;
                }
                case -1096195358: {
                    int cfr_ignored_57 = Integer.rotateLeft(0x25C1B65 ^ n2, 3) - 1300557942;
                    int cfr_ignored_58 = (int)(0xC0EEB55827D4EB4FL ^ (long)n2 ^ 0x97C0831A2DB82C0CL);
                    n3 = (1371486310 * -731568409 + -2142128696 ^ n2) + -638361323 - -638361323;
                    int cfr_ignored_59 = Integer.rotateLeft(0x8125C229 ^ n2, 3) + -1477434830;
                    int cfr_ignored_60 = (int)(0x43976C1427D4EB4FL ^ (long)n2 ^ 0x2558831A2DB92AFFL);
                    n3 = Integer.reverse(Integer.reverse(1263913984 * -731568409 + -2142128696 ^ n2));
                    int cfr_ignored_61 = (Integer.rotateLeft(0x2E371B71 ^ n2, 8) + -1660292630) * 775363441;
                    int cfr_ignored_62 = (int)(0xEC85B54C27D4EB4FL ^ (long)n2 ^ 0x97E8831A2DB874DAL);
                    continue block38;
                }
                case -1848177925: {
                    int cfr_ignored_63 = Integer.rotateRight(0xE60FEECB ^ n2, 15) + -531920432;
                    n3 = (int)((long)(1263913984 * -731568409 + -2142128696 ^ n2) ^ 0x6E1A7E30E69EE906L ^ 0x6E1A7E30E69EE906L);
                    int cfr_ignored_64 = (Integer.rotateRight(0xE0A41F3B ^ n2, 15) + 943548256) * -526115013;
                    n += 4;
                    continue block38;
                }
            }
            int cfr_ignored_65 = Integer.rotateRight(0xD785830E ^ n2, 13) - 495484397;
            n3 = (1263913984 * -731568409 + -2142128696 ^ n2) + 252319618 - 252319618;
        }
    }

    private boolean shs_8() {
        try {
            int n = -1891729283;
            n = Integer.rotateLeft(n * -857874157, 4) ^ 0x40345D25;
            int n2 = n ^ 0xA7F4E6B4;
            if ((n2 ^ n) != -1477122380) {
                int cfr_ignored_0 = (0x28CA66C9 ^ n) + -926910127;
            }
            if ((0xBD & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.rsd_4.shzl();
    }

    private boolean hhth() {
        try {
            int n = -236043373;
            n = Integer.rotateLeft(n * -1039626837, 28) ^ 0x4B2F4CB0;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x824CA025;
            if ((n2 ^ n) != -2108907483) {
                int cfr_ignored_0 = (0x73A2E3B6 ^ n) - 2059975902;
            }
            if ((0x1C4 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.rsd_4.shzl();
    }

    private boolean bgha_2() {
        int n = 1839945793;
        n = Integer.rotateLeft(n * 1902308751, 25) ^ 0x24BCE9DC;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 26);
        int n2 = n ^ 0xB4B26C66;
        if ((n2 ^ n) != -1263375258) {
            int cfr_ignored_0 = (0xD9193427 ^ n) + 1797750481;
        }
        return !this.rsd_4.shzl();
    }

    private boolean thh_4() {
        int n = -2065138856;
        int n2 = (n = Integer.rotateLeft(n * 427110419, 6) ^ 0x40A79210) ^ 0x91FA0F82;
        if ((n2 ^ n) != -1845883006) {
            int cfr_ignored_0 = (0x151274DA ^ n) + 2021602955;
        }
        return !this.ghh.shzl();
    }

    private boolean aym() {
        int n = mw.dts_8(2058211190);
        int n2 = n ^ 0x6B90A008;
        if ((n2 ^ n) != 1804640264) {
            int cfr_ignored_0 = (Integer.rotateRight(0x113D6F7E ^ n, 5) - 449716093) * 289238911;
        }
        return !this.ghh.shzl();
    }

    private boolean ztl() {
        int n = -427850916;
        int n2 = (n = Integer.rotateLeft(n * 640624823, 16) ^ 0x429F231E) ^ 0x4CE996DF;
        if ((n2 ^ n) != 1290376927) {
            int cfr_ignored_0 = (0xAA961583 ^ n) - -690103545;
        }
        return !this.saz.shzl();
    }

    private static String lq(String string, int n, int n2, int n3) {
        int n4 = -956171442;
        n4 = Integer.rotateLeft(n4 * -1959619289, 16) ^ 0xB0575F04;
        int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 27)) ^ 0x384509DB;
        if ((n5 ^ n4) != 944048603) {
            int cfr_ignored_0 = (0xFF44F295 ^ n4) + 1662293009;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x2E0F7B79) + n2 ^ i * -1754083523) ^ dhky) + bsh_2);
        }
        return new String(cArray);
    }

    private static void shyth(tkhd_2 tkhd2_2) {
        int n = 717935224;
        n = Integer.rotateLeft(n * -1122692925, 3) ^ 0x82ACAB01;
        tkhd_2 tkhd3 = tkhd2_2;
        n = (tkhd3 != null ? System.identityHashCode(tkhd3) : 0) ^ n;
        int n2 = n ^ 0xD3C26ED9;
        if ((n2 ^ n) != -742232359) {
            int cfr_ignored_0 = (0xF908BCA1 ^ n) + -26585373;
        }
        tkhd2_2.zat();
    }

    private static boolean ayz(badh_2 badh2) {
        block0: {
            int n = -162798927;
            int n2 = (n = Integer.rotateLeft(n * -716726049, 16) ^ 0x58C559C0) ^ 0x78779A65;
            if ((n2 ^ n) == 2021104229) break block0;
            int cfr_ignored_0 = (0x8E3C78D4 ^ n) - 2038110223;
        }
        return badh2.shzl();
    }

    private static void khts_2(class_746 class_7462) {
        int n = 1118682307;
        int n2 = (n = Integer.rotateLeft(n * 1780445743, 17) ^ 0xBF8F14B9) ^ 0x4C05A8B2;
        if ((n2 ^ n) != 1275439282) {
            int cfr_ignored_0 = (0xEA81471 ^ n) - -206465463;
        }
        class_7462.method_6043();
    }

    private static void aqw(tkhd_2 tkhd2_2) {
        int n = 1277448147;
        n = Integer.rotateLeft(n * -1269434835, 25) ^ 0x32034AFA;
        tkhd_2 tkhd3 = tkhd2_2;
        n = (tkhd3 != null ? System.identityHashCode(tkhd3) : 0) ^ n;
        int n2 = n ^ 0x797DF873;
        if ((n2 ^ n) != 2038298739) {
            int cfr_ignored_0 = (0x3559B7A0 ^ n) + 56993672;
        }
        tkhd2_2.zat();
    }

    private static boolean shsz(class_1799 class_17992, class_1792 class_17922) {
        block0: {
            int n = 1854348575;
            n = Integer.rotateLeft(n * 199866889, 7) ^ 0x7AE49FDE;
            class_1799 class_17993 = class_17992;
            n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
            class_1792 class_17923 = class_17922;
            n = Integer.rotateRight((class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n, 15);
            int n2 = n ^ 0xA07A3A9;
            if ((n2 ^ n) == 168272809) break block0;
            int cfr_ignored_0 = (0x6480BEB6 ^ n) + 705920636;
        }
        return class_17992.method_31574(class_17922);
    }

    private static void sdhr_2(kz_2 kz2, boolean bl) {
        int n = -174318069;
        n = Integer.rotateLeft(n * 1714914765, 5) ^ 0x53BEA2F6;
        kz_2 kz3 = kz2;
        n = Integer.rotateRight((kz3 != null ? System.identityHashCode(kz3) : 0) ^ n, 5);
        int n2 = (n = Integer.rotateRight(bl ^ n, 14)) ^ 0x2D8B7ECD;
        if ((n2 ^ n) != 764116685) {
            int cfr_ignored_0 = (0xD81760C6 ^ n) + 2053062509;
        }
        kz2.tjkh_2(bl);
    }

    private static boolean tdhf_2(class_746 class_7462) {
        block0: {
            int n = -357743183;
            n = Integer.rotateLeft(n * -1112159499, 20) ^ 0xDCF151CD;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0xA80C361F;
            if ((n2 ^ n) == -1475594721) break block0;
            int cfr_ignored_0 = (0x42A173AE ^ n) + -590113431;
        }
        return class_7462.method_5799();
    }

    private static void sshh_2(kz_2 kz2) {
        int n = mw.dts_8(483672981);
        kz_2 kz3 = kz2;
        n = (kz3 != null ? System.identityHashCode(kz3) : 0) ^ n;
        int n2 = n ^ 0x1FC14F90;
        if ((n2 ^ n) != 532762512) {
            int cfr_ignored_0 = Integer.rotateLeft(0x3150C05 ^ n, 3) - 1676284886;
            int cfr_ignored_1 = (int)(0xC1A7A23827D4EB4FL ^ (long)n ^ 0xB900831A2DB82E9EL);
        }
        kz2.tsl_4();
    }

    private static void khrq(class_304 class_3042, boolean bl) {
        int n = 534645662;
        n = Integer.rotateLeft(n * 264892759, 3) ^ 0xF0CD50D1;
        class_304 class_3043 = class_3042;
        n = (class_3043 != null ? System.identityHashCode(class_3043) : 0) ^ n;
        int n2 = n ^ 0xB5672486;
        if ((n2 ^ n) != -1251531642) {
            int cfr_ignored_0 = (0xAAB92F18 ^ n) - 210608549;
        }
        class_3042.method_23481(bl);
    }

    private static void dds_2(kz_2 kz2) {
        int n = 168966591;
        int n2 = (n = Integer.rotateLeft(n * 1345589189, 9) ^ 0x68CB50FB) ^ 0xA430EAAD;
        if ((n2 ^ n) != -1540298067) {
            int cfr_ignored_0 = (0xAE22D312 ^ n) - 1543600024;
        }
        kz2.sdhq_2();
    }

    private static int zsh_4(class_3675.class_306 class_3062) {
        block0: {
            int n = -699354006;
            n = Integer.rotateLeft(n * -1704974307, 12) ^ 0xAFEE9FD;
            class_3675.class_306 class_3063 = class_3062;
            n = (class_3063 != null ? System.identityHashCode(class_3063) : 0) ^ n;
            int n2 = n ^ 0x187C8D21;
            if ((n2 ^ n) == 410815777) break block0;
            int cfr_ignored_0 = (0xCE2C394B ^ n) + 1059365041;
        }
        return class_3062.method_1444();
    }

    private static boolean tdhsh(long l, int n) {
        block0: {
            int n2 = -243728186;
            n2 = Integer.rotateLeft(n2 * 1662622789, 27) ^ 0xB78FDD65;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 21)) ^ 0x29B6A0BF;
            if ((n3 ^ n2) == 699834559) break block0;
            int cfr_ignored_0 = (0xD8CFA079 ^ n2) + 104750102;
        }
        return class_3675.method_15987((long)l, (int)n);
    }

    private static void shdgh(class_304 class_3042, boolean bl) {
        int n = 1843533002;
        n = Integer.rotateLeft(n * -1571151639, 27) ^ 0x11E36B2D;
        class_304 class_3043 = class_3042;
        n = (class_3043 != null ? System.identityHashCode(class_3043) : 0) ^ n;
        int n2 = n ^ 0x82462956;
        if ((n2 ^ n) != -2109331114) {
            int cfr_ignored_0 = (0xEFA43D9C ^ n) + -358085049;
        }
        class_3042.method_23481(bl);
    }

    private static boolean tfh(badh_2 badh2) {
        block0: {
            int n = 1397409969;
            n = Integer.rotateLeft(n * -853412631, 26) ^ 0x988A1A8F;
            badh_2 badh3 = badh2;
            n = Integer.rotateRight((badh3 != null ? System.identityHashCode(badh3) : 0) ^ n, 26);
            int n2 = n ^ 0xC0ABCC21;
            if ((n2 ^ n) == -1062482911) break block0;
            int cfr_ignored_0 = (0x93E10490 ^ n) + -287818377;
        }
        return badh2.shzl();
    }

    private static tkhdh atr() {
        block0: {
            int n = 711201813;
            int n2 = (n = Integer.rotateLeft(n * -1813915221, 26) ^ 0x17348A0C) ^ 0x42C722BB;
            if ((n2 ^ n) == 1120346811) break block0;
            int cfr_ignored_0 = (0x68A336AE ^ n) - -29648043;
        }
        return tkhdh.zkhr_2();
    }

    private static float drk_2(tay tay2) {
        block0: {
            int n = mw.dts_8(-638543225);
            tay tay3 = tay2;
            n = Integer.rotateRight((tay3 != null ? System.identityHashCode(tay3) : 0) ^ n, 29);
            int n2 = n ^ 0x5704A376;
            if ((n2 ^ n) == 1459921782) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x8EF439F1 ^ n, 4) + 1408279402) * -1896597007;
            int cfr_ignored_1 = (int)(0x4C4697CC27D4EB4FL ^ (long)n ^ 0xD2E8831A2DB9355CL);
        }
        return tay2.thw_5();
    }

    private static boolean zht_8(tkhd_2 tkhd2_2, long l) {
        block0: {
            int n = 527408978;
            n = Integer.rotateLeft(n * 1736414023, 7) ^ 0x830C7B;
            int n2 = (n = Integer.rotateRight((int)l ^ n, 13)) ^ 0x5951B918;
            if ((n2 ^ n) == 1498528024) break block0;
            int cfr_ignored_0 = (0x463E264A ^ n) - -225572492;
        }
        return tkhd2_2.tagh(l);
    }

    private static class_243 znd_3(class_746 class_7462) {
        block0: {
            int n = 1359444907;
            int n2 = (n = Integer.rotateLeft(n * 996889393, 7) ^ 0x54AB4EAF) ^ 0x4F855E8B;
            if ((n2 ^ n) == 1334140555) break block0;
            int cfr_ignored_0 = (0x1E822520 ^ n) - 1270395767;
        }
        return class_7462.method_18798();
    }

    private static double haz_3(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = mw.dts_8(-126860989);
            int n2 = n ^ 0x17EB0724;
            if ((n2 ^ n) == 401278756) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xEF9B4667 ^ n, 16) - 137045428;
        }
        return class_2432.method_1022(class_2433);
    }

    private static class_243 dta_2(class_1309 class_13092) {
        block0: {
            int n = -639436013;
            int n2 = (n = Integer.rotateLeft(n * -1853203527, 26) ^ 0xCA0A4957) ^ 0x7B98CD19;
            if ((n2 ^ n) == 2073611545) break block0;
            int cfr_ignored_0 = (0xA27A360A ^ n) - 1618144604;
        }
        return class_13092.method_18798();
    }

    private static void hhb(tkhd_2 tkhd2_2) {
        int n = mw.dts_8(463029742);
        tkhd_2 tkhd3 = tkhd2_2;
        n = (tkhd3 != null ? System.identityHashCode(tkhd3) : 0) ^ n;
        int n2 = n ^ 0x38887265;
        if ((n2 ^ n) != 948466277) {
            int cfr_ignored_0 = Integer.rotateRight(0x2311378B ^ n, 7) + 1131632912;
        }
        tkhd2_2.zat();
    }

    private static boolean rss_2() {
        block0: {
            int n = 174473708;
            int n2 = (n = Integer.rotateLeft(n * -957963261, 28) ^ 0x10AA6525) ^ 0x552B5B0B;
            if ((n2 ^ n) == 1428904715) break block0;
            int cfr_ignored_0 = (0x5F4D1AE7 ^ n) - -1085196017;
        }
        return yf.khdha_2();
    }

    private static void yq() {
        int n = mw.dts_8(1602535523);
        int n2 = n ^ 0xD85B11D8;
        if ((n2 ^ n) != -665120296) {
            int cfr_ignored_0 = (Integer.rotateRight(0x87DFD1BB ^ n, 3) + 2021131488) * -2015374917;
        }
        yf.athz_2();
    }

    private static class_1269 dsa_6(class_636 class_6362, class_1657 class_16572, class_1268 class_12682) {
        block0: {
            int n = 0x74443734;
            n = Integer.rotateLeft(n * 1557665305, 21) ^ 0x47EE31DA;
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            class_1268 class_12683 = class_12682;
            n = (class_12683 != null ? System.identityHashCode(class_12683) : 0) ^ n;
            int n2 = n ^ 0x5D6500BE;
            if ((n2 ^ n) == 1566900414) break block0;
            int cfr_ignored_0 = (0x2921378A ^ n) + -1909668839;
        }
        return class_6362.method_2919(class_16572, class_12682);
    }

    private static String[] rnt(String string) {
        block0: {
            int n = -1476908725;
            n = Integer.rotateLeft(n * -139808837, 9) ^ 0x53953F04;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x99BEC4A;
            if ((n2 ^ n) == 161213514) break block0;
            int cfr_ignored_0 = (0xAE63C501 ^ n) + -53134529;
        }
        return string.split("\u0007\u001d", -1);
    }

    private static CallSite khtn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1625087303;
            n3 = Integer.rotateLeft(n3 * 1710540759, 5) ^ 0xD857CA59;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            n3 = Integer.rotateRight(n ^ n3, 19);
            int n4 = n3 ^ 0x53D8306E;
            if ((n4 ^ n3) != 1406677102) {
                int cfr_ignored_0 = (0x3304ED29 ^ n3) + -3240970;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ rdd_2 ^ string.hashCode() ^ n2 + shbd_2 ^ i * 1326618865 ^ rdd_2, 9) ^ shbd_2));
            }
            String[] stringArray = kz_2.rnt(new String(cArray));
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

    private static String[] lxzist3d(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ka78fyyq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ucttf3zctpj ^ string.hashCode() ^ n2 + eumqgr6st + i * -1753219465) + ucttf3zctpj) ^ eumqgr6st));
            }
            String[] stringArray = kz_2.lxzist3d(new String(cArray));
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

