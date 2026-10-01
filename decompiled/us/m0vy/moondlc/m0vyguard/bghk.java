/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.PropertyMap
 *  net.minecraft.class_1268
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1297$class_5529
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1935
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_3532
 *  net.minecraft.class_5134
 *  net.minecraft.class_6880
 *  net.minecraft.class_745
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import net.minecraft.class_1268;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3532;
import net.minecraft.class_5134;
import net.minecraft.class_6880;
import net.minecraft.class_745;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bthy;
import us.m0vy.moondlc.m0vyguard.bkhw;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.sz_4;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Fake Player", category=bzw.OTHER, desc="Spawns a fake player for testing")
public class bghk
extends bnq {
    private static final int khfr = 900;
    private static final int thzj_2 = 800;
    private static final int bs_2 = 100;
    private final badh_2 hhdh = new badh_2(this, "Copy Inve".concat("ntory")).bts(false);
    private final badh_2 dhhj_2 = new badh_2(this, "Record").bts(false);
    private final badh_2 rrt = new badh_2(this, "Play").bts(false);
    private final badh_2 dhbb = new badh_2(this, "Auto Totem").bts(false);
    private final tay tth_8 = new tay((hy)this, "Totems", this::sbdh).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(0x2EFF139A ^ 0x6C7F139A)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.reverse(712510736) ^ 0x49B01E54));
    public static class_745 rsh_5;
    private final List thws = new ArrayList();
    private int dhwt_2;
    private int sqdh;
    private int dsa;
    private int thht;
    private final bql<bthy> shzkh = this::thlkh;
    private final bql<btt> jr = this::bs;
    private static final int shbb = 272153087;
    private static final int khkdh = 217885394;
    private static final int ka_2 = -1489568581;
    private static final int khfz_2 = -618118665;
    private static final int dujw15h8i4n5f = 110053606;
    private static final int y8zfd3nf = 1999129722;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int inc5wd6kstddk;

    @Override
    public void nt() {
        int n = -648989797;
        n = Integer.rotateLeft(n * 715616019, 8) ^ 0xCE81FF4B;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x13D021FA;
        if ((n2 ^ n) != 332407290) {
            int cfr_ignored_0 = (0xCA811261 ^ n) - 1750033191;
        }
        if (mc == null || bghk.mc.field_1687 == null || bghk.mc.field_1724 == null) {
            this.tskh_3();
            return;
        }
        GameProfile gameProfile = new GameProfile(bghk.znr(), bghk.thgha_2(bghk.mc.field_1724.method_7334()));
        bghk.zghd_2(gameProfile.getProperties(), (Multimap)bghk.mc.field_1724.method_7334().getProperties());
        rsh_5 = new class_745(bghk.mc.field_1687, gameProfile);
        rsh_5.method_5878((class_1297)bghk.mc.field_1724);
        bghk.anh_2(rsh_5, bghk.mc.field_1724.method_6032());
        rsh_5.method_6073(bghk.mc.field_1724.method_6067());
        bghk.rsh_5.field_6235 = 0;
        bghk.rsh_5.field_6254 = 941038184 + -941038174;
        rsh_5.method_5665(bghk.tka(rsh_5));
        rsh_5.method_5880(true);
        if (bghk.sbm_2(this.hhdh)) {
            bghk.dst_6(rsh_5, class_1268.field_5808, bghk.zha_7(bghk.mc.field_1724.method_6047()));
            bghk.han_2(rsh_5, class_1268.field_5810, bghk.mc.field_1724.method_6079().method_7972());
            rsh_5.method_31548().method_5447(1039080646 - 1039080610, bghk.shh_8(bghk.dtha_4(bghk.amn(bghk.mc.field_1724), Integer.reverse(-1663647485) ^ 0xC0836B1D)));
            bghk.dthh_2(rsh_5).method_5447(Integer.rotateLeft(0xC90614F7 ^ 0xC94C14F7, 15), bghk.srl_2(bghk.mc.field_1724.method_31548(), -502545960 - -502545997).method_7972());
            bghk.thkhh(rsh_5.method_31548(), 0xF76D7494 ^ 0xF76D74B2, bghk.zdd_6(bghk.mc.field_1724.method_31548(), 0xE48412B8 ^ 0xE484129E).method_7972());
            bghk.hna_2(bghk.jyk(rsh_5), 982700133 - 982700094, bghk.zthl(bghk.mc.field_1724.method_31548().method_5438(bghk.dbsh(1805172167) ^ 0xE3BD19F1)));
        }
        bghk.mc.field_1687.method_53875((class_1297)rsh_5);
        this.dsa = this.dhbb.shzl() ? Math.round(this.tth_8.thw_5()) : 0;
        this.thht = 0;
        this.thdq();
    }

    @Override
    public void nc() {
        int n = 0;
        int n2 = 1324756690;
        n2 = Integer.rotateLeft(n2 * 726845037, 21) ^ 0xC25B038D;
        int n3 = Integer.reverse(Integer.reverse(n2 - 1166968954));
        block32: while (true) {
            switch (n2 - n3) {
                case 1073845142: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x76C21305 ^ n2, 17) - 1709042902;
                    int cfr_ignored_1 = (int)(0xB470BD3827D4EB4FL ^ (long)n2 ^ 0x8700831A2DB8C530L);
                    rsh_5.method_31745(class_1297.class_5529.field_26998);
                    rsh_5.method_36209();
                    rsh_5 = null;
                    try {
                        --n;
                        if ((0xDA30348A83C81E1L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = n2 - -1087562380 + 2026791092 - 2026791092;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = n2 - -1087562380;
                    }
                    --n;
                    continue block32;
                }
                case 1166968954: {
                    int cfr_ignored_2 = Integer.rotateLeft(0x10E08CCD ^ n2, 5) - 261008398;
                    int cfr_ignored_3 = (int)(0xD25222F027D4EB4FL ^ (long)n2 ^ 0xB890831A2DB80975L);
                    if (rsh_5 != null) {
                        try {
                            if ((0xE173A7EC09B56909L ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = (int)((long)(n2 - 1073845142) ^ 0x8F89498B6C9C24D7L ^ 0x8F89498B6C9C24D7L);
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = (int)((long)(n2 - 1073845142) ^ 0xBB32D3956FF15189L ^ 0xBB32D3956FF15189L);
                        }
                        n -= 2;
                        continue block32;
                    }
                    try {
                        n += 4;
                        if ((0x3AEBD5AD32245295L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = n2 - -1087562380 ^ 0x4D6A7053 ^ 0x4D6A7053;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = n2 - -1087562380 + -1747975104 - -1747975104;
                    }
                    n += 2;
                    continue block32;
                }
                case -1087562380: {
                    int cfr_ignored_4 = Integer.rotateLeft(0x309C7A6D ^ n2, 9) - -414158226;
                    int cfr_ignored_5 = (int)(0xF22ED45027D4EB4FL ^ (long)n2 ^ 0x55D0831A2DB8498CL);
                    this.thws.clear();
                    this.sqdh = 0;
                    this.dhwt_2 = 0;
                    this.dsa = 0;
                    this.thht = 0;
                    return;
                }
                case 1709239251: {
                    int cfr_ignored_6 = (Integer.rotateLeft(0x4DB750B0 ^ n2, 12) + 1838179467) * 1303859377;
                    n3 = n2 - -376096753;
                    int cfr_ignored_7 = (Integer.rotateLeft(0xBECF13F5 ^ n2, 10) - 527501798) * -1093725195;
                    int cfr_ignored_8 = (int)(0x7C7DBDC827D4EB4FL ^ (long)n2 ^ 0x86E0831A2DB9552AL);
                    try {
                        n -= 4;
                        if ((0x18E97EA500F94039L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = n2 - 1166968954 ^ 0xF180415A ^ 0xF180415A;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)(n2 - 1166968954) ^ 0xD93B0C5E3A22AAE5L ^ 0xD93B0C5E3A22AAE5L);
                    }
                    n += 5;
                    continue block32;
                }
                case -184147061: {
                    int cfr_ignored_9 = Integer.rotateRight(0xBE72606 ^ n2, 4) - 1968912885;
                    try {
                        if ((0xC1AB55410D54E9E9L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (int)((long)(n2 - 1166968954) ^ 0x5C1BCCCE69FCCB84L ^ 0x5C1BCCCE69FCCB84L);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)(n2 - 1166968954) ^ 0xE30FC3B96A8A0805L ^ 0xE30FC3B96A8A0805L);
                    }
                    ++n;
                    continue block32;
                }
                case 456825759: {
                    int cfr_ignored_10 = Integer.rotateLeft(0x6ACB9DAC ^ n2, 16) - -217729265;
                    n3 = n2 - 262000405 + 1294585713 - 1294585713;
                    int cfr_ignored_11 = Integer.rotateRight(0x265AA52E ^ n2, 7) - -1453875251;
                    try {
                        if ((0x6FF5FC8638AB14CFL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (int)((long)(n2 - 1166968954) ^ 0x1542E54F554F2B96L ^ 0x1542E54F554F2B96L);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 - 1166968954;
                    }
                    n -= 2;
                    continue block32;
                }
                case -1129047399: {
                    int cfr_ignored_12 = Integer.rotateLeft(0xD86C65A1 ^ n2, 14) + 964554170;
                    int cfr_ignored_13 = (int)(0x1ADECB9C27D4EB4FL ^ (long)n2 ^ 0x6A48831A2DB9986CL);
                    n3 = Integer.reverse(Integer.reverse(n2 - -1335549411));
                    int cfr_ignored_14 = (Integer.rotateRight(0x5E1A9F1E ^ n2, 14) - 1771496413) * 1578802975;
                    n3 = n2 - 1166968954 + 1661343833 - 1661343833;
                    int cfr_ignored_15 = Integer.rotateLeft(0x53F2A1 ^ n2, 3) + 243794106;
                    int cfr_ignored_16 = (int)(0xC2E15C9C27D4EB4FL ^ (long)n2 ^ 0x4448831A2DB82813L);
                    n -= 4;
                    continue block32;
                }
                case 1823734545: {
                    int cfr_ignored_17 = (Integer.rotateLeft(0xC205851 ^ n2, 4) + 2085114122) * 203446353;
                    int cfr_ignored_18 = (int)(0xCE92F66C27D4EB4FL ^ (long)n2 ^ 0x11A8831A2DB830F4L);
                    try {
                        if ((0x9312FE17A90A63B9L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = n2 - 1166968954 ^ 0x13B9DC28 ^ 0x13B9DC28;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - 1166968954));
                    }
                    n -= 3;
                    continue block32;
                }
                case -2101748681: {
                    int cfr_ignored_19 = Integer.rotateRight(0x41F99062 ^ n2, 11) + 26614553;
                    try {
                        n += 2;
                        if ((0x54EE8429B54E2183L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = n2 - 1166968954 ^ 0x9E19E9D5 ^ 0x9E19E9D5;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 - 1166968954 ^ 0xA77A29E4 ^ 0xA77A29E4;
                    }
                    continue block32;
                }
                case -1316893880: {
                    int cfr_ignored_20 = Integer.rotateLeft(0x4468BE1 ^ n2, 3) + -1998024838;
                    int cfr_ignored_21 = (int)(0xC6F425DC27D4EB4FL ^ (long)n2 ^ 0xB6C8831A2DB82039L);
                    n3 = n2 - 163063001;
                    int cfr_ignored_22 = Integer.rotateRight(0xDF7B386B ^ n2, 14) + 340358192;
                    n3 = n2 - 1166968954;
                    n += 5;
                    continue block32;
                }
                case -979140514: {
                    int cfr_ignored_23 = (Integer.rotateRight(0xA7748A76 ^ n2, 7) - 1266312069) * -1485534601;
                    n3 = Integer.reverse(Integer.reverse(n2 - -167146952));
                    int cfr_ignored_24 = Integer.rotateLeft(0x9E25E961 ^ n2, 6) + 720691706;
                    int cfr_ignored_25 = (int)(0x5C97475C27D4EB4FL ^ (long)n2 ^ 0x73C8831A2DB914FFL);
                    n3 = n2 - 1166968954;
                    ++n;
                    continue block32;
                }
                case 1623509294: {
                    int cfr_ignored_26 = Integer.rotateLeft(0x70D78005 ^ n2, 17) - -1367990314;
                    int cfr_ignored_27 = (int)(0xB2652E3827D4EB4FL ^ (long)n2 ^ 0xA100831A2DB8C91BL);
                    n3 = n2 - -1262110135;
                    int cfr_ignored_28 = Integer.rotateLeft(0xFA90156C ^ n2, 18) - 1540372303;
                    int cfr_ignored_29 = (int)(0xB5B3F621441B833CL ^ (long)n2 ^ 0x11324484FD5EC6B6L);
                    n3 = n2 - 184732755;
                    int cfr_ignored_30 = (int)(0x5D42D27F03D846CEL ^ (long)n2 ^ 0x598ECB0376BB1754L);
                    n3 = (int)((long)(n2 - 1166968954) ^ 0xE443B97348C67631L ^ 0xE443B97348C67631L);
                    n += 2;
                    continue block32;
                }
                case -319259140: {
                    int cfr_ignored_31 = (Integer.rotateRight(0x1E4212B2 ^ n2, 6) + -1369578807) * 507646643;
                    n3 = n2 - -52148465 ^ 0xAA3331BA ^ 0xAA3331BA;
                    int cfr_ignored_32 = (Integer.rotateRight(0x15C2ED56 ^ n2, 5) - -1493672795) * 365096279;
                    n3 = n2 - 1166968954;
                    n -= 2;
                    continue block32;
                }
                case -432040972: {
                    int cfr_ignored_33 = Integer.rotateLeft(0x7685674C ^ n2, 17) - 1585783151;
                    n3 = (int)((long)(n2 - 738030306) ^ 0x8D0A474F642D5AECL ^ 0x8D0A474F642D5AECL);
                    int cfr_ignored_34 = Integer.rotateLeft(0x957B2E81 ^ n2, 5) + 508051674;
                    int cfr_ignored_35 = (int)(0x57C980BC27D4EB4FL ^ (long)n2 ^ 0xFC08831A2DB90242L);
                    n3 = n2 - 1166968954 + -1158370629 - -1158370629;
                    n -= 4;
                    continue block32;
                }
            }
            int cfr_ignored_36 = Integer.rotateLeft(0xC9720D89 ^ n2, 12) + 1764573906;
            int cfr_ignored_37 = (int)(0xBC0A3B427D4EB4FL ^ (long)n2 ^ 0xBA18831A2DB9BA50L);
            n3 = n2 - 1166968954 + -1076405574 - -1076405574;
        }
    }

    private boolean dyr(class_1657 class_16572) {
        int n = 46334251;
        n = Integer.rotateLeft(n * 646532419, 25) ^ 0x5291CBE6;
        class_1657 class_16573 = class_16572;
        n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
        int n2 = n ^ 0x9A21BF0B;
        if ((n2 ^ n) != -1709064437) {
            int cfr_ignored_0 = (0x98E2BE20 ^ n) + -1870125108;
        }
        return class_16572.field_6017 > 0.0f && !bghk.szsh(class_16572) && !bghk.dhrq(class_16572) && !class_16572.method_5799() && !bghk.dhfs_2(class_16572) && !class_16572.method_5771() && !bghk.khya(class_16572, class_1294.field_5919) && !class_16572.method_5765() && !bghk.shzw_2(class_16572) && !class_16572.method_31549().field_7479;
    }

    private float sqd_4(class_1657 class_16572, boolean bl) {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int n = 0;
        int n2 = -120065936;
        n2 = Integer.rotateLeft(n2 * 283933055, 27) ^ 0xE249D71;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 10);
        int n3 = Integer.rotateLeft(n2 ^ 0x8836B298, 22);
        block24: while (true) {
            switch (Integer.rotateRight(n3, 22) ^ n2) {
                case 815948172: {
                    int cfr_ignored_0 = Integer.rotateRight(0x9C5D41EA ^ n2, 6) + -207054191;
                    f3 *= Float.intBitsToFloat(Integer.rotateLeft(0x7CC6F1C2 ^ 0x7CC109C2, 11));
                    n3 = Integer.rotateLeft(n2 ^ 0xA4ADEA9E, 22);
                    --n;
                    continue block24;
                }
                case -1532106082: {
                    int cfr_ignored_1 = (Integer.rotateRight(0x51073D3A ^ n2, 13) + -734131903) * 1359428923;
                    return Math.max(Float.intBitsToFloat(0x2B8F8BF3 ^ 0x1643473E), bghk.sab_4(this, f3));
                }
                case -2009681256: {
                    int cfr_ignored_2 = Integer.rotateLeft(0xDD6DDFA8 ^ n2, 14) + -726944621;
                    f = class_16572.method_7261(Float.intBitsToFloat(-1245436683 + -1992566005));
                    f2 = Math.max(1.0f, (float)class_16572.method_45325(class_5134.field_23721));
                    f3 = f2 * (Float.intBitsToFloat(-1900806458 - 1348940281) + f * f * Float.intBitsToFloat(0xC8B4269E ^ 0xF7F8EA53));
                    if (bl) {
                        int cfr_ignored_3 = (int)(0x8491C5A1043893D1L ^ (long)n2 ^ 0x7632C4C2DC84A4F2L);
                        n3 = Integer.rotateLeft(n2 ^ 0x8C7B3BBE, 22) ^ 0xE3D21FD5 ^ 0xE3D21FD5;
                        n += 5;
                        continue block24;
                    }
                    int cfr_ignored_4 = (int)(0x6841D64CA4E1E492L ^ (long)n2 ^ 0x51E9857032037D52L);
                    n3 = Integer.rotateLeft(n2 ^ 0xB95C255E, 22) ^ 0x23744A7 ^ 0x23744A7;
                    int cfr_ignored_5 = (int)(0xD0EDCA0A477F4960L ^ (long)n2 ^ 0x6964424D69E60C0AL);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xA4ADEA9E, 22) ^ 0xB454C9E4BDFDF8C6L ^ 0xB454C9E4BDFDF8C6L);
                    n -= 4;
                    continue block24;
                }
                case -1938080834: {
                    int cfr_ignored_6 = (Integer.rotateLeft(0xCA5987DC ^ n2, 12) - -2060119329) * -900102179;
                    if (!(f > Float.intBitsToFloat(Integer.reverse(1995438334) ^ 0x40466EF4))) {
                        try {
                            n -= 3;
                            if ((0x3D8E0691F664590FL ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = Integer.rotateLeft(n2 ^ 0xA4ADEA9E, 22) ^ 0xD9C30A3B ^ 0xD9C30A3B;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = Integer.rotateLeft(n2 ^ 0xA4ADEA9E, 22) ^ 0xE4EA768B ^ 0xE4EA768B;
                        }
                        ++n;
                        continue block24;
                    }
                    try {
                        n -= 2;
                        if ((0xE29FCCAFCB3B8D7DL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x30A2618C, 22) + -620981306 - -620981306;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x30A2618C, 22) ^ 0x6DBB8E5FBAE5846EL ^ 0x6DBB8E5FBAE5846EL);
                    }
                    n += 3;
                    continue block24;
                }
                case -630257837: {
                    int cfr_ignored_7 = (Integer.rotateLeft(0x7ED98DFD ^ n2, 18) - 1622528222) * 2128186877;
                    int cfr_ignored_8 = (int)(0xBC6B23C027D4EB4FL ^ (long)n2 ^ 0xBAF0831A2DB8D507L);
                    int cfr_ignored_9 = (int)(0xE743CFD86544840L ^ (long)n2 ^ 0x848BC01B6BA7B139L);
                    n3 = Integer.rotateLeft(n2 ^ 0x8836B298, 22);
                    n -= 5;
                    continue block24;
                }
                case 547459769: {
                    int cfr_ignored_10 = (Integer.rotateRight(0x4DA66BA ^ n2, 3) + -1697640511) * 81422011;
                    n3 = Integer.rotateLeft(n2 ^ 0x8836B298, 22);
                    n += 3;
                    continue block24;
                }
                case -345737064: {
                    int cfr_ignored_11 = (Integer.rotateLeft(0xCA0FABF0 ^ n2, 12) + 2084794699) * -904942607;
                    n3 = Integer.rotateLeft(n2 ^ 0x38ED7469, 22) ^ 0x323CC620 ^ 0x323CC620;
                    int cfr_ignored_12 = (Integer.rotateRight(0x80A309BB ^ n2, 3) + -1743008544) * -2136798789;
                    try {
                        n -= 5;
                        if ((0xEAB90595F173403DL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x8836B298, 22)));
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x8836B298, 22) ^ 0x9AC157C2 ^ 0x9AC157C2;
                    }
                    continue block24;
                }
                case -1982693684: {
                    int cfr_ignored_13 = (Integer.rotateRight(0x85D65B37 ^ n2, 3) - 961719012) * -2049549513;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x8836B298, 22)));
                    int cfr_ignored_14 = Integer.rotateLeft(0x9598DE05 ^ n2, 5) - 568361430;
                    int cfr_ignored_15 = (int)(0x572A703827D4EB4FL ^ (long)n2 ^ 0x1D00831A2DB90385L);
                    n -= 2;
                    continue block24;
                }
                case 989827868: {
                    int cfr_ignored_16 = Integer.rotateRight(0xD52873C6 ^ n2, 13) - -733764555;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x8836B298, 22)));
                    int cfr_ignored_17 = (Integer.rotateLeft(0x3A4BFD99 ^ n2, 10) + 328291522) * 978058649;
                    int cfr_ignored_18 = (int)(0xF8F953A427D4EB4FL ^ (long)n2 ^ 0x5A38831A2DB85C23L);
                    n -= 4;
                    continue block24;
                }
                case 325732225: {
                    int cfr_ignored_19 = Integer.rotateRight(0xED1988A3 ^ n2, 16) + -1166726408;
                    n3 = Integer.rotateLeft(n2 ^ 0x8836B298, 22) ^ 0xA0030E6 ^ 0xA0030E6;
                    int cfr_ignored_20 = Integer.rotateRight(0x2F13404E ^ n2, 8) - -1213044563;
                    n -= 5;
                    continue block24;
                }
                case 1640480214: {
                    int cfr_ignored_21 = Integer.rotateRight(0xF649052E ^ n2, 17) - -684376115;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x94121050, 22) ^ 0xB8CD0861761E8DD2L ^ 0xB8CD0861761E8DD2L);
                    int cfr_ignored_22 = Integer.rotateRight(0x3B537086 ^ n2, 10) - 863518581;
                    n3 = Integer.rotateLeft(n2 ^ 0x8836B298, 22) ^ 0xA6F71858 ^ 0xA6F71858;
                    continue block24;
                }
                case 1240478687: {
                    int cfr_ignored_23 = Integer.rotateLeft(0xB564B228 ^ n2, 9) + -74501613;
                    try {
                        n -= 4;
                        if ((0xFD9108144C741897L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x8836B298, 22) ^ 0x5DAEA63E4AC1A6AEL ^ 0x5DAEA63E4AC1A6AEL);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x8836B298, 22);
                    }
                    continue block24;
                }
                case -1180240996: {
                    int cfr_ignored_24 = (Integer.rotateLeft(0x3FC1A358 ^ n2, 10) + -1127192861) * 1069654873;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x8836B298, 22)));
                    n -= 4;
                    continue block24;
                }
                case 1975771858: {
                    int cfr_ignored_25 = Integer.rotateRight(0xAE1A310A ^ n2, 8) + 428445553;
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x4B8E83CB, 22) ^ 0xD22414913D2E0AFCL ^ 0xD22414913D2E0AFCL);
                    int cfr_ignored_26 = Integer.rotateRight(0x847A7042 ^ n2, 3) + 254883641;
                    int cfr_ignored_27 = (int)(0x9726E24C1A10B8C7L ^ (long)n2 ^ 0x39E8F8928AA8839CL);
                    n3 = Integer.rotateLeft(n2 ^ 0x8836B298, 22);
                    continue block24;
                }
            }
            int cfr_ignored_28 = Integer.rotateLeft(0xE27F69AC ^ n2, 15) - 1909156623;
            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x8836B298, 22)));
        }
    }

    private float thss(float f) {
        try {
            int n = 1172170807;
            n = Integer.rotateLeft(n * 960561039, 8) ^ 0xFA5C07A3;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 5);
            int n2 = n ^ 0xABC0A35F;
            if ((n2 ^ n) != -1413438625) {
                int cfr_ignored_0 = (0xEE1D4B68 ^ n) - -1626282573;
            }
            if ((0x6E & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (rsh_5 == null) {
            return f;
        }
        float f2 = rsh_5.method_6096();
        float f3 = (float)rsh_5.method_45325(class_5134.field_23725);
        float f4 = 2.0f + f3 / Float.intBitsToFloat(Integer.reverse(-1341351814) ^ 0x1E99300D);
        float f5 = class_3532.method_15363((float)(f2 - f / f4), (float)(f2 * Float.intBitsToFloat(Integer.rotateLeft(0xB3C19875 ^ 0x570D54A6, 28))), (float)Float.intBitsToFloat(Integer.rotateLeft(0xDB6FF943 ^ 0xFBBFF943, 1)));
        f *= 1.0f - f5 / Float.intBitsToFloat(Integer.rotateLeft(0xC903C5DD ^ 0xC9420DDD, 8));
        class_1293 class_12932 = bghk.bs_2(rsh_5, class_1294.field_5907);
        if (class_12932 != null) {
            f *= Math.max(0.0f, 1.0f - (float)(class_12932.method_5578() + 1) * Float.intBitsToFloat(Integer.rotateLeft(0x3159C7E6 ^ 0x57303580, 13)));
        }
        return f;
    }

    /*
     * Unable to fully structure code
     */
    private void ank(float var1_1, boolean var2_2) {
        var3_3 = 0.0f;
        var4_4 = 0.0f;
        var5_5 = 0.0f;
        var8_6 = 0;
        var6_7 = -1060974153;
        var6_7 = Integer.rotateLeft(var6_7 * -542853851, 6) ^ 457615574;
        var6_7 = var2_2 ^ var6_7;
        var7_8 = Integer.rotateLeft(var6_7 ^ -784697958, 22) + 1904714846 - 1904714846;
        while (true) {
            block63: {
                block70: {
                    block73: {
                        block68: {
                            block71: {
                                block77: {
                                    block65: {
                                        block66: {
                                            block79: {
                                                block62: {
                                                    block64: {
                                                        block74: {
                                                            block76: {
                                                                block69: {
                                                                    block67: {
                                                                        block61: {
                                                                            block75: {
                                                                                block72: {
                                                                                    block78: {
                                                                                        var8_6 = Integer.rotateRight(var7_8, 22) ^ var6_7;
                                                                                        switch (var8_6 & 15) {
                                                                                            case 2: {
                                                                                                if (var8_6 != -156981006) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block61;
                                                                                            }
                                                                                            case 4: {
                                                                                                if (var8_6 == -1122873708) break;
                                                                                                if (var8_6 != -477779468) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block62;
                                                                                            }
                                                                                            case 5: {
                                                                                                if (var8_6 == 927515765) break block63;
                                                                                                if (var8_6 != -1692864747) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block64;
                                                                                            }
                                                                                            case 7: {
                                                                                                if (var8_6 != -1807246329) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block65;
                                                                                            }
                                                                                            case 9: {
                                                                                                if (var8_6 == 1275473737) break block66;
                                                                                                if (var8_6 == -748794551) break block67;
                                                                                                if (var8_6 != 1905466825) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block68;
                                                                                            }
                                                                                            case 10: {
                                                                                                if (var8_6 == -784697958) break block69;
                                                                                                if (var8_6 == 636203946) break block70;
                                                                                                if (var8_6 != 65284586) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block71;
                                                                                            }
                                                                                            case 11: {
                                                                                                if (var8_6 == -1492095109) break block72;
                                                                                                if (var8_6 != -1774934277) {
                                                                                                    Integer.rotateRight(1864825518 ^ var6_7, 16) - 2048260685;
                                                                                                    ** break;
                                                                                                }
                                                                                                break block73;
                                                                                            }
                                                                                            case 12: {
                                                                                                if (var8_6 != -1962615012) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block74;
                                                                                            }
                                                                                            case 13: {
                                                                                                if (var8_6 != 262563821) {
                                                                                                    ** break;
                                                                                                }
                                                                                                break block75;
                                                                                            }
                                                                                            case 14: {
                                                                                                if (var8_6 == -385163218) break block76;
                                                                                                if (var8_6 != -1156599250) {
                                                                                                    (Integer.rotateRight(1099222647 ^ var6_7, 11) - -210591836) * 1099222647;
                                                                                                    ** break;
                                                                                                }
                                                                                                break block77;
                                                                                            }
                                                                                            case 15: {
                                                                                                if (var8_6 == 63238479) break block78;
                                                                                                if (var8_6 != -1094699889) {
                                                                                                    Integer.rotateLeft(-1812586240 ^ var6_7, 5) + -282354117;
                                                                                                    ** break;
                                                                                                }
                                                                                                break block79;
                                                                                            }
                                                                                        }
                                                                                        Integer.rotateRight(1382967342 ^ var6_7, 13) - -4440883;
                                                                                        bghk.rsh_5.method_6033(Math.max(0.0f, var5_5));
                                                                                        return;
                                                                                    }
                                                                                    Integer.rotateLeft(-1545682259 ^ var6_7, 7) - -598265298;
                                                                                    (int)(7020105285563116367L ^ (long)var6_7 ^ 2616735531961773833L);
                                                                                    this.zsk();
                                                                                    return;
                                                                                }
                                                                                Integer.rotateLeft(225060393 ^ var6_7, 4) + -1539817934;
                                                                                (int)(-3469873892739978417L ^ (long)var6_7 ^ -1344180340310658464L);
                                                                                return;
                                                                            }
                                                                            (Integer.rotateLeft(-1389705607 ^ var6_7, 8) + -57956382) * -1389705607;
                                                                            (int)(8041291776605350735L ^ (long)var6_7 ^ 3312541674390516449L);
                                                                            if (!this.dhbb.shzl()) {
                                                                                var7_8 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_7 ^ -1122873708, 22)));
                                                                                continue;
                                                                            }
                                                                            var7_8 = Integer.rotateLeft(var6_7 ^ -748794551, 22) + 2093274383 - 2093274383;
                                                                            (Integer.rotateRight(-1280877901 ^ var6_7, 9) + -979264792) * -1280877901;
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateLeft(-991918568 ^ var6_7, 11) + -611460061) * -991918567;
                                                                        if (!this.dhbb.shzl()) {
                                                                            try {
                                                                                var8_6 += 4;
                                                                                if ((4629413255128217743L ^ (long)var6_7 | 1L) == 0L) {
                                                                                    throw new ArithmeticException();
                                                                                }
                                                                                var7_8 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_7 ^ -1122873708, 22)));
                                                                            }
                                                                            catch (ArithmeticException v0) {
                                                                                var7_8 = Integer.rotateLeft(var6_7 ^ -1122873708, 22) + 244893040 - 244893040;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        (int)(-2924205255591004067L ^ (long)var6_7 ^ -5129431861770321145L);
                                                                        var7_8 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_7 ^ -962215620, 22)));
                                                                        (int)(-4770242502083922506L ^ (long)var6_7 ^ -7052785375096678840L);
                                                                        var7_8 = Integer.rotateLeft(var6_7 ^ -748794551, 22) + -2008689680 - -2008689680;
                                                                        continue;
                                                                    }
                                                                    (Integer.rotateLeft(-195671268 ^ var6_7, 17) - -1697597537) * -195671267;
                                                                    if (this.dsa <= 0) {
                                                                        try {
                                                                            var8_6 -= 2;
                                                                            if ((-7767069367505289341L ^ (long)var6_7 | 1L) == 0L) {
                                                                                throw new NoSuchElementException();
                                                                            }
                                                                            var7_8 = Integer.rotateLeft(var6_7 ^ -1122873708, 22) + -125796663 - -125796663;
                                                                        }
                                                                        catch (NoSuchElementException v1) {
                                                                            var7_8 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_7 ^ -1122873708, 22)));
                                                                        }
                                                                        var8_6 += 2;
                                                                        continue;
                                                                    }
                                                                    var7_8 = Integer.rotateLeft(var6_7 ^ 63238479, 22) ^ 979655237 ^ 979655237;
                                                                    var8_6 -= 5;
                                                                    continue;
                                                                }
                                                                (Integer.rotateLeft(1229600092 ^ var6_7, 12) - -463858337) * 1229600093;
                                                                if (bghk.rsh_5 != null) {
                                                                    var7_8 = Integer.rotateLeft(var6_7 ^ -385163218, 22);
                                                                    continue;
                                                                }
                                                                try {
                                                                    var8_6 += 2;
                                                                    if ((-3225703553771818821L ^ (long)var6_7 | 1L) == 0L) {
                                                                        throw new UnsupportedOperationException();
                                                                    }
                                                                    var7_8 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_7 ^ -1492095109, 22)));
                                                                }
                                                                catch (UnsupportedOperationException v2) {
                                                                    var7_8 = (int)((long)Integer.rotateLeft(var6_7 ^ -1492095109, 22) ^ -3994089273130901793L ^ -3994089273130901793L);
                                                                }
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(-830159576 ^ var6_7, 12) + 108101395;
                                                            bghk.rsh_5.field_6235 = -826241447 + 826241457;
                                                            bghk.rsh_5.field_6254 = bghk.saw_4(-669583873) ^ -5281775;
                                                            bghk.rsh_5.field_6008 = Integer.rotateLeft(981822345 ^ 975530889, 12);
                                                            this.zbt_3(var2_2);
                                                            bghk.rkhk(this);
                                                            var3_3 = bghk.rsh_5.method_6067();
                                                            var4_4 = Math.min(var3_3, var1_1);
                                                            bghk.rsh_5.method_6073(Math.max(0.0f, var3_3 - var4_4));
                                                            var5_5 = bghk.ghhq(bghk.rsh_5) - (var1_1 -= var4_4);
                                                            if (!(var5_5 <= 0.0f)) {
                                                                var7_8 = Integer.rotateLeft(var6_7 ^ -495629312, 22) + -1640985066 - -1640985066;
                                                                Integer.rotateLeft(-1546386204 ^ var6_7, 7) - -620087593;
                                                                var7_8 = Integer.rotateLeft(var6_7 ^ -1122873708, 22) ^ -1110902829 ^ -1110902829;
                                                                continue;
                                                            }
                                                            try {
                                                                var8_6 += 4;
                                                                if ((-9144904144121924185L ^ (long)var6_7 | 1L) == 0L) {
                                                                    throw new UnsupportedOperationException();
                                                                }
                                                                var7_8 = Integer.rotateLeft(var6_7 ^ -156981006, 22) + -185967932 - -185967932;
                                                            }
                                                            catch (UnsupportedOperationException v3) {
                                                                var7_8 = Integer.rotateLeft(var6_7 ^ -156981006, 22) + 694771210 - 694771210;
                                                            }
                                                            continue;
                                                        }
                                                        Integer.rotateRight(1054611023 ^ var6_7, 10) - -1593552180;
                                                        try {
                                                            var8_6 += 4;
                                                            if ((-7606009350255272077L ^ (long)var6_7 | 1L) == 0L) {
                                                                throw new ArithmeticException();
                                                            }
                                                            var7_8 = Integer.rotateLeft(var6_7 ^ -784697958, 22);
                                                        }
                                                        catch (ArithmeticException v4) {
                                                            var7_8 = Integer.rotateLeft(var6_7 ^ -784697958, 22) ^ 1391427258 ^ 1391427258;
                                                        }
                                                        var8_6 += 5;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(-1100363855 ^ var6_7, 10) + 321703338) * -1100363855;
                                                    (int)(8996900731287300943L ^ (long)var6_7 ^ 3344066871782102119L);
                                                    var7_8 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_7 ^ -1838660271, 22)));
                                                    (Integer.rotateRight(1509432343 ^ var6_7, 14) - -378993148) * 1509432343;
                                                    try {
                                                        var8_6 -= 4;
                                                        if ((6944696779686182137L ^ (long)var6_7 | 1L) == 0L) {
                                                            throw new UnsupportedOperationException();
                                                        }
                                                        var7_8 = Integer.rotateLeft(var6_7 ^ -784697958, 22);
                                                    }
                                                    catch (UnsupportedOperationException v5) {
                                                        var7_8 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_7 ^ -784697958, 22)));
                                                    }
                                                    var8_6 += 3;
                                                    continue;
                                                }
                                                Integer.rotateLeft(2071039949 ^ var6_7, 18) - -149026546;
                                                (int)(-5061164240890172593L ^ (long)var6_7 ^ -4715124661397430697L);
                                                var7_8 = Integer.rotateLeft(var6_7 ^ -784697958, 22) + 1458837547 - 1458837547;
                                                (Integer.rotateLeft(826426192 ^ var6_7, 9) + -77347349) * 826426193;
                                                var8_6 += 4;
                                                continue;
                                            }
                                            (Integer.rotateRight(858212314 ^ var6_7, 9) + 908022433) * 858212315;
                                            var7_8 = (int)((long)Integer.rotateLeft(var6_7 ^ -376647135, 22) ^ -2069723073565285396L ^ -2069723073565285396L);
                                            (Integer.rotateRight(328454291 ^ var6_7, 5) + 1665392904) * 328454291;
                                            var7_8 = Integer.rotateLeft(var6_7 ^ -784697958, 22);
                                            var8_6 -= 5;
                                            continue;
                                        }
                                        (Integer.rotateRight(11224662 ^ var6_7, 3) - 421208997) * 11224663;
                                        (int)(7450615863767725514L ^ (long)var6_7 ^ 3620497400326742810L);
                                        var7_8 = Integer.rotateLeft(var6_7 ^ -53535744, 22);
                                        (int)(4796676385483668528L ^ (long)var6_7 ^ -7857450702266226445L);
                                        var7_8 = (int)((long)Integer.rotateLeft(var6_7 ^ -784697958, 22) ^ 7710044126609771145L ^ 7710044126609771145L);
                                        var8_6 -= 5;
                                        continue;
                                    }
                                    (Integer.rotateRight(-1752528417 ^ var6_7, 5) - 1579438396) * -1752528417;
                                    var7_8 = Integer.rotateLeft(var6_7 ^ -784697958, 22) + -46831987 - -46831987;
                                    var8_6 += 5;
                                    continue;
                                }
                                (Integer.rotateRight(-1991478305 ^ var6_7, 4) - -1533040836) * -1991478305;
                                var7_8 = Integer.rotateLeft(var6_7 ^ -2124227659, 22) + -1857177668 - -1857177668;
                                (Integer.rotateRight(11760754 ^ var6_7, 3) + 437827849) * 11760755;
                                try {
                                    var8_6 -= 2;
                                    if ((1276132560215319439L ^ (long)var6_7 | 1L) == 0L) {
                                        throw new IllegalStateException();
                                    }
                                    var7_8 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_7 ^ -784697958, 22)));
                                }
                                catch (IllegalStateException v6) {
                                    var7_8 = Integer.rotateLeft(var6_7 ^ -784697958, 22) + -602015022 - -602015022;
                                }
                                ++var8_6;
                                continue;
                            }
                            (Integer.rotateLeft(-237835088 ^ var6_7, 17) + 1290291339) * -237835087;
                            var7_8 = Integer.rotateLeft(var6_7 ^ -784697958, 22);
                            (Integer.rotateLeft(-147734827 ^ var6_7, 17) - -211567866) * -147734827;
                            (int)(3855944295245998927L ^ (long)var6_7 ^ -2548893240632162601L);
                            var8_6 += 2;
                            continue;
                        }
                        (Integer.rotateRight(1623354490 ^ var6_7, 15) + -1142373887) * 1623354491;
                        var7_8 = (int)((long)Integer.rotateLeft(var6_7 ^ -754844019, 22) ^ -4926750698733035212L ^ -4926750698733035212L);
                        Integer.rotateRight(1394880655 ^ var6_7, 13) - 364871820;
                        try {
                            var8_6 += 3;
                            if ((871357417661923871L ^ (long)var6_7 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var7_8 = Integer.rotateLeft(var6_7 ^ -784697958, 22) + 1460047943 - 1460047943;
                        }
                        catch (IllegalStateException v7) {
                            var7_8 = Integer.rotateLeft(var6_7 ^ -784697958, 22) ^ 327861164 ^ 327861164;
                        }
                        var8_6 += 4;
                        continue;
                    }
                    Integer.rotateRight(-1711785173 ^ var6_7, 6) + -1452488336;
                    var7_8 = Integer.rotateLeft(var6_7 ^ 2063527295, 22);
                    (Integer.rotateLeft(-1398602723 ^ var6_7, 8) - -333766978) * -1398602723;
                    (int)(7931307473860094799L ^ (long)var6_7 ^ -6255355733958102542L);
                    try {
                        var7_8 = Integer.rotateLeft(var6_7 ^ -784697958, 22);
                    }
                    catch (IllegalArgumentException v8) {
                        var7_8 = Integer.rotateLeft(var6_7 ^ -784697958, 22) ^ -484318684 ^ -484318684;
                    }
                    var8_6 -= 3;
                    continue;
                }
                (Integer.rotateLeft(303198968 ^ var6_7, 5) + 882477891) * 303198969;
                try {
                    var8_6 += 4;
                    if ((4961813608298255463L ^ (long)var6_7 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    var7_8 = (int)((long)Integer.rotateLeft(var6_7 ^ -784697958, 22) ^ -2264962619073468620L ^ -2264962619073468620L);
                }
                catch (IllegalStateException v9) {
                    var7_8 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var6_7 ^ -784697958, 22)));
                }
                var8_6 -= 2;
                continue;
            }
            Integer.rotateLeft(561314304 ^ var6_7, 7) + 294118715;
            try {
                var7_8 = Integer.rotateLeft(var6_7 ^ -784697958, 22) + -173555846 - -173555846;
            }
            catch (NoSuchElementException v10) {
                var7_8 = (int)((long)Integer.rotateLeft(var6_7 ^ -784697958, 22) ^ -8643589542811196269L ^ -8643589542811196269L);
            }
            continue;
lbl325:
            // 12 sources

            Integer.rotateLeft(-2093631960 ^ var6_7, 3) + -404836845;
            var7_8 = Integer.rotateLeft(var6_7 ^ -784697958, 22) + -694509086 - -694509086;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void zsk() {
        var3_1 = 0;
        var1_2 = 1470424022;
        var1_2 = Integer.rotateLeft(var1_2 * 519688103, 25) ^ 715156197;
        var1_2 = Integer.rotateRight(System.identityHashCode(this) ^ var1_2, 4);
        var2_3 = (var1_2 ^ 120797935 ^ -404673662) + -404673662 + 1843938805 - 1843938805;
        while (true) {
            block49: {
                block58: {
                    block51: {
                        block63: {
                            block53: {
                                block59: {
                                    block52: {
                                        block57: {
                                            block66: {
                                                block50: {
                                                    block62: {
                                                        block56: {
                                                            block61: {
                                                                block65: {
                                                                    block60: {
                                                                        block55: {
                                                                            block64: {
                                                                                block54: {
                                                                                    var3_1 = var2_3 - -404673662 ^ -404673662 ^ var1_2;
                                                                                    switch (var3_1 & 15) {
                                                                                        case 1: {
                                                                                            if (var3_1 != -572262511) {
                                                                                                ** break;
                                                                                            }
                                                                                            break block49;
                                                                                        }
                                                                                        case 2: {
                                                                                            if (var3_1 != -1203117054) {
                                                                                                ** break;
                                                                                            }
                                                                                            break block50;
                                                                                        }
                                                                                        case 3: {
                                                                                            if (var3_1 == 1801429763) break block51;
                                                                                            if (var3_1 != -2091197533) {
                                                                                                (Integer.rotateRight(1112608895 ^ var1_2, 11) - 204381852) * 1112608895;
                                                                                                ** break;
                                                                                            }
                                                                                            break block52;
                                                                                        }
                                                                                        case 6: {
                                                                                            if (var3_1 == 1987949222) break block53;
                                                                                            if (var3_1 == -465495242) break block54;
                                                                                            if (var3_1 != 1543830406) {
                                                                                                ** break;
                                                                                            }
                                                                                            break block55;
                                                                                        }
                                                                                        case 8: {
                                                                                            if (var3_1 == -1132779032) break block56;
                                                                                            if (var3_1 != 1005765976) {
                                                                                                (Integer.rotateRight(-1879325794 ^ var1_2, 4) - 1943687005) * -1879325793;
                                                                                                ** break;
                                                                                            }
                                                                                            break block57;
                                                                                        }
                                                                                        case 9: {
                                                                                            if (var3_1 != -1081931751) {
                                                                                                ** break;
                                                                                            }
                                                                                            break block58;
                                                                                        }
                                                                                        case 10: {
                                                                                            if (var3_1 == -1134267190) break;
                                                                                            if (var3_1 != -249616294) {
                                                                                                Integer.rotateRight(-1463710366 ^ var1_2, 8) + 1942863385;
                                                                                                ** break;
                                                                                            }
                                                                                            break block59;
                                                                                        }
                                                                                        case 13: {
                                                                                            if (var3_1 == -1899066947) break block60;
                                                                                            if (var3_1 != -1781838083) {
                                                                                                (Integer.rotateLeft(-1065759664 ^ var1_2, 11) + 1394433259) * -1065759663;
                                                                                                ** break;
                                                                                            }
                                                                                            break block61;
                                                                                        }
                                                                                        case 14: {
                                                                                            if (var3_1 == 1383696238) break block62;
                                                                                            if (var3_1 != 47433070) {
                                                                                                (Integer.rotateRight(1212420890 ^ var1_2, 12) + -996413599) * 1212420891;
                                                                                                ** break;
                                                                                            }
                                                                                            break block63;
                                                                                        }
                                                                                        case 15: {
                                                                                            if (var3_1 == -84052689) ** GOTO lbl69
                                                                                            if (var3_1 == -1395332881) break block64;
                                                                                            if (var3_1 == 120797935) break block65;
                                                                                            if (var3_1 != -993550497) {
                                                                                                ** break;
                                                                                            }
                                                                                            break block66;
lbl69:
                                                                                            // 1 sources

                                                                                            (Integer.rotateRight(-1383799714 ^ var1_2, 8) - 125126301) * -1383799713;
                                                                                            this.dsa = Math.max(0, this.dsa - 1);
                                                                                            bghk.rsh_5.method_6122(class_1268.field_5810, class_1799.field_8037);
                                                                                            bghk.rsh_5.method_6012();
                                                                                            bghk.rsh_5.method_6033(1.0f);
                                                                                            bghk.rsh_5.method_6073(Float.intBitsToFloat(1692713618 ^ 635749010));
                                                                                            bghk.rsh_5.method_5711((byte)(Integer.reverse(785045819) ^ -593800361));
                                                                                            bghk.mc.field_1687.method_43128((class_1657)bghk.mc.field_1724, bghk.rsh_5.method_23317(), bghk.rsh_5.method_23318(), bghk.rsh_5.method_23321(), class_3417.field_14931, class_3419.field_15248, 1.0f, 1.0f);
                                                                                            bghk.rsh_5.method_6092(new class_1293(class_1294.field_5924, Integer.reverse(-1259088551) ^ -1700016983, 1));
                                                                                            bghk.rsh_5.method_6092(new class_1293(class_1294.field_5898, 477012841 + -477012741, 1));
                                                                                            bghk.rsh_5.method_6092(new class_1293(class_1294.field_5918, -137050378 - -137051178, 0));
                                                                                            this.sqdh = 0;
                                                                                            this.thht = 1;
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    Integer.rotateRight(1708488138 ^ var1_2, 15) + 1496769201;
                                                                                    return;
                                                                                }
                                                                                Integer.rotateLeft(1780912261 ^ var1_2, 16) - -553050282;
                                                                                (int)(-6299341018121311409L ^ (long)var1_2 ^ -9223227888395289351L);
                                                                                bghk.rsh_5.method_6122(class_1268.field_5810, new class_1799((class_1935)class_1802.field_8288));
                                                                                try {
                                                                                    --var3_1;
                                                                                    if ((5141109537543607901L ^ (long)var1_2 | 1L) == 0L) {
                                                                                        throw new IllegalStateException();
                                                                                    }
                                                                                    var2_3 = (var1_2 ^ -84052689 ^ -404673662) + -404673662;
                                                                                }
                                                                                catch (IllegalStateException v0) {
                                                                                    var2_3 = (var1_2 ^ -84052689 ^ -404673662) + -404673662 ^ -1695585976 ^ -1695585976;
                                                                                }
                                                                                --var3_1;
                                                                                continue;
                                                                            }
                                                                            (Integer.rotateRight(22685274 ^ var1_2, 3) + 776487969) * 22685275;
                                                                            if (bghk.mc.field_1687 != null) {
                                                                                var2_3 = (var1_2 ^ -1899066947 ^ -404673662) + -404673662 ^ -1037867399 ^ -1037867399;
                                                                                Integer.rotateLeft(2041293224 ^ var1_2, 18) + -1071175021;
                                                                                continue;
                                                                            }
                                                                            (int)(-8601002798492458838L ^ (long)var1_2 ^ -3567840614685688681L);
                                                                            var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -1134267190 ^ -404673662) + -404673662));
                                                                            ++var3_1;
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateLeft(-686323659 ^ var1_2, 13) - 272047526) * -686323659;
                                                                        (int)(1559694662423604047L ^ (long)var1_2 ^ -5665384182772562277L);
                                                                        if (!bghk.jkj(bghk.thah_3(bghk.rsh_5), class_1802.field_8288)) {
                                                                            var2_3 = (var1_2 ^ -507571239 ^ -404673662) + -404673662 ^ 2110037331 ^ 2110037331;
                                                                            Integer.rotateRight(658261574 ^ var1_2, 7) - -995483211;
                                                                            var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -465495242 ^ -404673662) + -404673662));
                                                                            --var3_1;
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            if ((8399641694846089397L ^ (long)var1_2 | 1L) == 0L) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ -84052689 ^ -404673662) + -404673662));
                                                                        }
                                                                        catch (IllegalStateException v1) {
                                                                            var2_3 = (var1_2 ^ -84052689 ^ -404673662) + -404673662;
                                                                        }
                                                                        var3_1 -= 5;
                                                                        continue;
                                                                    }
                                                                    Integer.rotateRight(-1322694297 ^ var1_2, 9) - 2019394228;
                                                                    if (bghk.jkj(bghk.thah_3(bghk.rsh_5), class_1802.field_8288)) {
                                                                        var2_3 = (var1_2 ^ -1823076731 ^ -404673662) + -404673662 ^ -906187598 ^ -906187598;
                                                                        Integer.rotateRight(1410187274 ^ var1_2, 13) + 839377009;
                                                                        var2_3 = (var1_2 ^ -84052689 ^ -404673662) + -404673662 + 1298035812 - 1298035812;
                                                                        var3_1 += 5;
                                                                        continue;
                                                                    }
                                                                    var2_3 = (int)((long)((var1_2 ^ -1095994052 ^ -404673662) + -404673662) ^ -4383848545741137807L ^ -4383848545741137807L);
                                                                    Integer.rotateRight(-1086463962 ^ var1_2, 10) - 752600021;
                                                                    var2_3 = (var1_2 ^ -465495242 ^ -404673662) + -404673662;
                                                                    var3_1 += 2;
                                                                    continue;
                                                                }
                                                                (Integer.rotateRight(769810323 ^ var1_2, 8) + -1832439288) * 769810323;
                                                                if (bghk.rsh_5 != null) {
                                                                    try {
                                                                        var3_1 += 3;
                                                                        if ((6024470763158825579L ^ (long)var1_2 | 1L) == 0L) {
                                                                            throw new NoSuchElementException();
                                                                        }
                                                                        var2_3 = (var1_2 ^ -1395332881 ^ -404673662) + -404673662 ^ -776532618 ^ -776532618;
                                                                    }
                                                                    catch (NoSuchElementException v2) {
                                                                        var2_3 = (var1_2 ^ -1395332881 ^ -404673662) + -404673662 ^ -543566300 ^ -543566300;
                                                                    }
                                                                    ++var3_1;
                                                                    continue;
                                                                }
                                                                try {
                                                                    if ((-4825208973313405175L ^ (long)var1_2 | 1L) == 0L) {
                                                                        throw new NoSuchElementException();
                                                                    }
                                                                    var2_3 = (var1_2 ^ -1134267190 ^ -404673662) + -404673662;
                                                                }
                                                                catch (NoSuchElementException v3) {
                                                                    var2_3 = (var1_2 ^ -1134267190 ^ -404673662) + -404673662 + -2053216367 - -2053216367;
                                                                }
                                                                var3_1 += 3;
                                                                continue;
                                                            }
                                                            Integer.rotateRight(-85954198 ^ var1_2, 18) + 1703631633;
                                                            try {
                                                                var3_1 += 3;
                                                                if ((5335397470362610743L ^ (long)var1_2 | 1L) == 0L) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                var2_3 = (var1_2 ^ 120797935 ^ -404673662) + -404673662 + -879780177 - -879780177;
                                                            }
                                                            catch (IllegalStateException v4) {
                                                                var2_3 = (int)((long)((var1_2 ^ 120797935 ^ -404673662) + -404673662) ^ -3775368646243132029L ^ -3775368646243132029L);
                                                            }
                                                            --var3_1;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(-1247988669 ^ var1_2, 9) + 40301400;
                                                        (int)(2313565041391561228L ^ (long)var1_2 ^ 2538831156019719655L);
                                                        var2_3 = (int)((long)((var1_2 ^ 120797935 ^ -404673662) + -404673662) ^ -9151514057213736639L ^ -9151514057213736639L);
                                                        continue;
                                                    }
                                                    (Integer.rotateRight(993305719 ^ var1_2, 10) - 800950692) * 993305719;
                                                    var2_3 = (var1_2 ^ 120797935 ^ -404673662) + -404673662;
                                                    var3_1 += 5;
                                                    continue;
                                                }
                                                (Integer.rotateRight(188280598 ^ var1_2, 4) - 1614975717) * 188280599;
                                                var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ 120797935 ^ -404673662) + -404673662));
                                                (Integer.rotateRight(1520267479 ^ var1_2, 14) - -43103932) * 1520267479;
                                                ++var3_1;
                                                continue;
                                            }
                                            Integer.rotateLeft(-594594496 ^ var1_2, 14) + -1179315717;
                                            var2_3 = (var1_2 ^ 1319543931 ^ -404673662) + -404673662;
                                            Integer.rotateRight(-570216370 ^ var1_2, 14) - -423593811;
                                            try {
                                                var3_1 += 5;
                                                var2_3 = (var1_2 ^ 120797935 ^ -404673662) + -404673662 ^ -1003593770 ^ -1003593770;
                                            }
                                            catch (IllegalArgumentException v5) {
                                                var2_3 = (int)((long)((var1_2 ^ 120797935 ^ -404673662) + -404673662) ^ -7063495954061904716L ^ -7063495954061904716L);
                                            }
                                            var3_1 -= 5;
                                            continue;
                                        }
                                        (Integer.rotateRight(1133838874 ^ var1_2, 11) + 862511201) * 1133838875;
                                        var2_3 = (var1_2 ^ -1014333423 ^ -404673662) + -404673662 + 1553515507 - 1553515507;
                                        (Integer.rotateLeft(-1821839056 ^ var1_2, 5) + -569191413) * -1821839055;
                                        var2_3 = (var1_2 ^ 120797935 ^ -404673662) + -404673662 ^ 857895621 ^ 857895621;
                                        var3_1 -= 5;
                                        continue;
                                    }
                                    Integer.rotateRight(-1491328949 ^ var1_2, 7) + 1086687312;
                                    var2_3 = (int)((long)((var1_2 ^ -436392921 ^ -404673662) + -404673662) ^ 7228224508193771728L ^ 7228224508193771728L);
                                    (Integer.rotateLeft(793912912 ^ var1_2, 8) + -1085259029) * 793912913;
                                    var2_3 = (var1_2 ^ -1426168759 ^ -404673662) + -404673662;
                                    Integer.rotateLeft(-1194023328 ^ var1_2, 10) + 1713226971;
                                    var2_3 = (var1_2 ^ 120797935 ^ -404673662) + -404673662;
                                    var3_1 += 3;
                                    continue;
                                }
                                (Integer.rotateRight(-1692877422 ^ var1_2, 6) + -866348055) * -1692877421;
                                try {
                                    var3_1 += 4;
                                    if ((-2359941811966977343L ^ (long)var1_2 | 1L) == 0L) {
                                        throw new IllegalArgumentException();
                                    }
                                    var2_3 = (int)((long)((var1_2 ^ 120797935 ^ -404673662) + -404673662) ^ 7408155765729976867L ^ 7408155765729976867L);
                                }
                                catch (IllegalArgumentException v6) {
                                    var2_3 = (var1_2 ^ 120797935 ^ -404673662) + -404673662;
                                }
                                var3_1 -= 2;
                                continue;
                            }
                            Integer.rotateRight(897868559 ^ var1_2, 9) - 2137366028;
                            (int)(-686430820829255164L ^ (long)var1_2 ^ 6984132617447555363L);
                            var2_3 = (var1_2 ^ 120797935 ^ -404673662) + -404673662;
                            var3_1 -= 2;
                            continue;
                        }
                        (Integer.rotateRight(1071231442 ^ var1_2, 10) + -1078319191) * 1071231443;
                        var2_3 = (var1_2 ^ -29062179 ^ -404673662) + -404673662 + 2137047332 - 2137047332;
                        Integer.rotateLeft(-2059702752 ^ var1_2, 3) + 646968603;
                        var2_3 = (var1_2 ^ -403514315 ^ -404673662) + -404673662;
                        Integer.rotateLeft(1873255297 ^ var1_2, 16) + -1985383462;
                        (int)(-5974810248398705841L ^ (long)var1_2 ^ -7635709019747190789L);
                        var2_3 = (var1_2 ^ 120797935 ^ -404673662) + -404673662 + 48414424 - 48414424;
                        var3_1 += 4;
                        continue;
                    }
                    Integer.rotateRight(2046415650 ^ var1_2, 18) + -912379815;
                    try {
                        ++var3_1;
                        var2_3 = (var1_2 ^ 120797935 ^ -404673662) + -404673662 ^ 1771179897 ^ 1771179897;
                    }
                    catch (ArithmeticException v7) {
                        var2_3 = (var1_2 ^ 120797935 ^ -404673662) + -404673662;
                    }
                    var3_1 += 2;
                    continue;
                }
                Integer.rotateLeft(-279096827 ^ var1_2, 16) - 11177430;
                (int)(3310141569257237327L ^ (long)var1_2 ^ 360432118649189902L);
                var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ 120797935 ^ -404673662) + -404673662));
                var3_1 += 2;
                continue;
            }
            (Integer.rotateLeft(-1847793571 ^ var1_2, 5) - -1373781378) * -1847793571;
            (int)(6011819931385260879L ^ (long)var1_2 ^ 8192191870646422285L);
            var2_3 = Integer.reverse(Integer.reverse((var1_2 ^ 120797935 ^ -404673662) + -404673662));
            --var3_1;
            continue;
lbl311:
            // 11 sources

            Integer.rotateRight(393091015 ^ var1_2, 5) - -625835948;
            var2_3 = (var1_2 ^ 120797935 ^ -404673662) + -404673662 ^ 164854545 ^ 164854545;
        }
    }

    private void thdq() {
        try {
            int n = 1807801959;
            n = Integer.rotateLeft(n * 2053500601, 15) ^ 0x21F3BD17;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x53A31FB2;
            if ((n2 ^ n) != 1403199410) {
                int cfr_ignored_0 = (0x3863C1D5 ^ n) + 1028226463;
            }
            if ((0x3E0 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (rsh_5 == null || !this.dhbb.shzl() || rsh_5.method_6079().method_31574(class_1802.field_8288) || this.dsa <= 0) {
            return;
        }
        if (this.thht > 0) {
            --this.thht;
            return;
        }
        rsh_5.method_6122(class_1268.field_5810, new class_1799((class_1935)class_1802.field_8288));
    }

    private void zbt_3(boolean bl) {
        try {
            int n = -1387521299;
            n = Integer.rotateLeft(n * 1629052737, 17) ^ 0xDB7AE1E1;
            n = bl ^ n;
            int n2 = n ^ 0x3C1DAE96;
            if ((n2 ^ n) != 1008578198) {
                int cfr_ignored_0 = (0x9151B47B ^ n) + -377891708;
            }
            if ((0x7D & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (bghk.mc.field_1687 == null || bghk.mc.field_1724 == null || rsh_5 == null) {
            return;
        }
        bghk.mc.field_1687.method_43128((class_1657)bghk.mc.field_1724, rsh_5.method_23317(), rsh_5.method_23318(), rsh_5.method_23321(), bl ? class_3417.field_15016 : class_3417.field_15115, class_3419.field_15248, bl ? 1.0f : Float.intBitsToFloat(0x51D58170 ^ 0x6E958170), bl ? 1.0f : Float.intBitsToFloat(2023094617 + -956734768));
        if (bl) {
            bghk.mc.field_1724.method_7277((class_1297)rsh_5);
        }
    }

    private void ddz_6() {
        class_243 class_2432;
        int n = -1553934016;
        n = Integer.rotateLeft(n * 1285217101, 3) ^ 0xD8BAC092;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 5);
        int n2 = n ^ 0x2286CBBA;
        if ((n2 ^ n) != 579259322) {
            int cfr_ignored_0 = (0x81E612FA ^ n) + 316235735;
        }
        if (rsh_5 == null || bghk.mc.field_1724 == null) {
            return;
        }
        class_243 class_2433 = rsh_5.method_19538().method_1020(bghk.mc.field_1724.method_19538());
        if (class_2433.method_1027() < Double.longBitsToDouble(0x80022744D31724E2L ^ 0xBF1811A6380B67CFL)) {
            class_2433 = bghk.mc.field_1724.method_5828(1.0f);
        }
        if ((class_2432 = new class_243(class_2433.field_1352, 0.0, class_2433.field_1350)).method_1027() < Double.longBitsToDouble(0x7F87F3B96F504041L ^ 0x409DC55B844C036CL)) {
            return;
        }
        class_243 class_2434 = class_2432.method_1029().method_1021(Double.longBitsToDouble(0x47F182CA9C87435AL ^ 0x78244045C0AFB699L));
        rsh_5.method_18800(class_2434.field_1352, Double.longBitsToDouble(0x992B51E468BC973AL ^ 0xA6EC5BD9181F4030L), class_2434.field_1350);
        bghk.rsh_5.field_6037 = true;
    }

    private void bs(btt btt2) {
        try {
            int n = -1218640315;
            n = Integer.rotateLeft(n * 1831069599, 25) ^ 0x343EB0BA;
            btt btt3 = btt2;
            n = Integer.rotateRight((btt3 != null ? System.identityHashCode(btt3) : 0) ^ n, 3);
            int n2 = n ^ 0xA4B31C1;
            if ((n2 ^ n) != 172700097) {
                int cfr_ignored_0 = (0xBD163784 ^ n) - -1323339475;
            }
            if ((0x263 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (bghk.mc.field_1724 == null || bghk.mc.field_1687 == null || rsh_5 == null) {
            return;
        }
        if (this.dhhj_2.shzl()) {
            this.thws.add(new sz_4(bghk.mc.field_1724.method_23317(), bghk.mc.field_1724.method_23318(), bghk.mc.field_1724.method_23321(), bghk.mc.field_1724.method_36454(), bghk.mc.field_1724.method_36455()));
            return;
        }
        if (this.rrt.shzl() && !this.thws.isEmpty()) {
            ++this.dhwt_2;
            if (this.dhwt_2 >= this.thws.size()) {
                this.dhwt_2 = 0;
                return;
            }
            sz_4 sz2 = (sz_4)this.thws.get(this.dhwt_2);
            rsh_5.method_36456(sz2.yaw());
            rsh_5.method_36457(sz2.pitch());
            rsh_5.method_5636(sz2.yaw());
            rsh_5.method_5814(sz2.x(), sz2.y(), sz2.z());
        } else {
            this.dhwt_2 = 0;
        }
        this.thdq();
        if (rsh_5.method_29504()) {
            ++this.sqdh;
            if (this.sqdh > (0xE4173509 ^ 0xE4173503)) {
                this.tskh_3();
            }
        } else {
            this.sqdh = 0;
        }
    }

    private void thlkh(bthy bthy2) {
        float f = 0.0f;
        int n = 0;
        int n2 = 990615668;
        n2 = Integer.rotateLeft(n2 * 1625320793, 18) ^ 0x38E8164A;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 23);
        int n3 = (n2 ^ 0x6EBB6D32 ^ 0x10E9546C) + 283726956;
        block29: while (true) {
            switch (n3 - 283726956 ^ 0x10E9546C ^ n2) {
                case 1857776942: {
                    int cfr_ignored_0 = Integer.rotateRight(0x935FFEF ^ n2, 4) - 568827180;
                    return;
                }
                case 1857776945: {
                    int cfr_ignored_1 = Integer.rotateRight(0x25A14243 ^ n2, 7) + -1830509224;
                    if (bthy2.khtf() != rsh_5) {
                        int cfr_ignored_2 = (int)(0x25E2ED56F4AA4DFEL ^ (long)n2 ^ 0x27DD25E760DBE614L);
                        n3 = (n2 ^ 0x6EBB6D2E ^ 0x10E9546C) + 283726956 + 25596875 - 25596875;
                        continue block29;
                    }
                    int cfr_ignored_3 = (int)(0x5FEB1E50FB5E8FD4L ^ (long)n2 ^ 0xC1D13A0EE48F1207L);
                    n3 = (int)((long)((n2 ^ 0x980730DB ^ 0x10E9546C) + 283726956) ^ 0x329A49C34D115682L ^ 0x329A49C34D115682L);
                    int cfr_ignored_4 = (int)(0x29E74BE077797C88L ^ (long)n2 ^ 0x6AB022410237FE1FL);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x6EBB6D2F ^ 0x10E9546C) + 283726956));
                    n -= 5;
                    continue block29;
                }
                case 1857776943: {
                    int cfr_ignored_5 = (Integer.rotateRight(0xCB42F5F7 ^ n2, 12) - -1585879004) * -884804105;
                    f = this.sqd_4((class_1657)bghk.mc.field_1724, false);
                    this.ank(f, this.dyr((class_1657)bghk.mc.field_1724));
                    bghk.mc.field_1724.method_7350();
                    return;
                }
                case 1857776944: {
                    int cfr_ignored_6 = (Integer.rotateLeft(0x5A516D34 ^ n2, 14) - -197535609) * 1515285813;
                    if (rsh_5 == null) {
                        try {
                            n -= 3;
                            if ((0xED9C97F723140B89L ^ (long)n2 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n3 = (n2 ^ 0x6EBB6D2E ^ 0x10E9546C) + 283726956 + -1341791171 - -1341791171;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = (n2 ^ 0x6EBB6D2E ^ 0x10E9546C) + 283726956 + -1343377978 - -1343377978;
                        }
                        n -= 3;
                        continue block29;
                    }
                    try {
                        --n;
                        if ((0x6A0B4A3A0367465L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (n2 ^ 0x6EBB6D31 ^ 0x10E9546C) + 283726956;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (n2 ^ 0x6EBB6D31 ^ 0x10E9546C) + 283726956 ^ 0x69690D00 ^ 0x69690D00;
                    }
                    continue block29;
                }
                case 1857776946: {
                    int cfr_ignored_7 = (Integer.rotateLeft(0x4EA502DC ^ n2, 12) - -1973880865) * 1319437021;
                    if (bghk.mc.field_1724 != null) {
                        try {
                            n -= 4;
                            if ((0xFFD00D561EEC0C57L ^ (long)n2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n3 = (n2 ^ 0x6EBB6D30 ^ 0x10E9546C) + 283726956 ^ 0x12453230 ^ 0x12453230;
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = (int)((long)((n2 ^ 0x6EBB6D30 ^ 0x10E9546C) + 283726956) ^ 0x70A5EE2B46DE60L ^ 0x70A5EE2B46DE60L);
                        }
                        n += 3;
                        continue block29;
                    }
                    try {
                        n += 4;
                        if ((0xBA9F664082602C5DL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (int)((long)((n2 ^ 0x6EBB6D2E ^ 0x10E9546C) + 283726956) ^ 0xC0B5F30EFBAB11F9L ^ 0xC0B5F30EFBAB11F9L);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (n2 ^ 0x6EBB6D2E ^ 0x10E9546C) + 283726956;
                    }
                    continue block29;
                }
                case 1857776947: {
                    int cfr_ignored_8 = Integer.rotateRight(0x1D30910F ^ n2, 6) - -1925238772;
                    n3 = (n2 ^ 0xDFD05B2B ^ 0x10E9546C) + 283726956;
                    int cfr_ignored_9 = Integer.rotateLeft(0x88086045 ^ n2, 4) - 2103527318;
                    int cfr_ignored_10 = (int)(0x4ABACE7827D4EB4FL ^ (long)n2 ^ 0x6180831A2DB938A4L);
                    n3 = (n2 ^ 0x6EBB6D32 ^ 0x10E9546C) + 283726956 + -64078682 - -64078682;
                    continue block29;
                }
                case 1857776948: {
                    int cfr_ignored_11 = (Integer.rotateLeft(0xF0244211 ^ n2, 17) + 415342410) * -266059247;
                    int cfr_ignored_12 = (int)(0x3296EC2C27D4EB4FL ^ (long)n2 ^ 0x2528831A2DB9C8FCL);
                    n3 = (n2 ^ 0xF37915CC ^ 0x10E9546C) + 283726956 ^ 0x72B0E5A2 ^ 0x72B0E5A2;
                    int cfr_ignored_13 = Integer.rotateRight(0xB323EFC7 ^ n2, 9) - -1246255020;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x93C70641 ^ 0x10E9546C) + 283726956));
                    int cfr_ignored_14 = Integer.rotateRight(0xF0E8DECA ^ n2, 17) + 814782897;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x6EBB6D32 ^ 0x10E9546C) + 283726956));
                    n -= 4;
                    continue block29;
                }
                case 1857776949: {
                    int cfr_ignored_15 = (Integer.rotateLeft(0xFF618A19 ^ n2, 18) + -248686526) * -10384871;
                    int cfr_ignored_16 = (int)(0x3DD3242427D4EB4FL ^ (long)n2 ^ 0xB538831A2DB9D677L);
                    n3 = (n2 ^ 0xD3B0E516 ^ 0x10E9546C) + 283726956 + 321771875 - 321771875;
                    int cfr_ignored_17 = Integer.rotateRight(0x2BD84006 ^ n2, 8) - 1401774069;
                    try {
                        n += 2;
                        if ((0x4A09BE65C7F8AC39L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x6EBB6D32 ^ 0x10E9546C) + 283726956));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (n2 ^ 0x6EBB6D32 ^ 0x10E9546C) + 283726956 + -1746484210 - -1746484210;
                    }
                    n += 4;
                    continue block29;
                }
                case 1857776950: {
                    int cfr_ignored_18 = Integer.rotateLeft(0x7AA58BEC ^ n2, 18) - -563506993;
                    int cfr_ignored_19 = (int)(0xC2FA11D36EBE0DD1L ^ (long)n2 ^ 0xDED611CFE0842825L);
                    n3 = (int)((long)((n2 ^ 0x6EBB6D32 ^ 0x10E9546C) + 283726956) ^ 0x986DC4C75DD658E7L ^ 0x986DC4C75DD658E7L);
                    n += 3;
                    continue block29;
                }
                case 1857776951: {
                    int cfr_ignored_20 = (Integer.rotateRight(0xB5B557FF ^ n2, 9) - 89343772) * -1246406657;
                    n3 = (n2 ^ 0xADF2AF46 ^ 0x10E9546C) + 283726956 ^ 0xCDD92328 ^ 0xCDD92328;
                    int cfr_ignored_21 = Integer.rotateLeft(0xA1ECCC8C ^ n2, 7) - -1609931729;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x6EBB6D32 ^ 0x10E9546C) + 283726956));
                    n += 5;
                    continue block29;
                }
                case 1857776952: {
                    int cfr_ignored_22 = Integer.rotateLeft(0xFEE90C84 ^ n2, 18) - -493477065;
                    n3 = (n2 ^ 0x11BFE77E ^ 0x10E9546C) + 283726956;
                    int cfr_ignored_23 = (Integer.rotateLeft(0x429E2394 ^ n2, 11) - 360967719) * 1117660053;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x6EBB6D32 ^ 0x10E9546C) + 283726956));
                    int cfr_ignored_24 = (Integer.rotateLeft(0x3D400591 ^ n2, 10) + 1864256458) * 1027605905;
                    int cfr_ignored_25 = (int)(0xFFF2ABAC27D4EB4FL ^ (long)n2 ^ 0xAA28831A2DB85234L);
                    continue block29;
                }
                case 1857776953: {
                    int cfr_ignored_26 = (Integer.rotateRight(0xE39DF933 ^ n2, 15) + -1803629464) * -476186317;
                    n3 = (n2 ^ 0x6EBB6D32 ^ 0x10E9546C) + 283726956 + 879391686 - 879391686;
                    int cfr_ignored_27 = Integer.rotateRight(0xEA4509E2 ^ n2, 16) + 1656344985;
                    n += 5;
                    continue block29;
                }
                case 1857776954: {
                    int cfr_ignored_28 = Integer.rotateLeft(0xFEA56A84 ^ n2, 18) - -630880969;
                    n3 = (n2 ^ 0xF31CCCD1 ^ 0x10E9546C) + 283726956 ^ 0x99CF6923 ^ 0x99CF6923;
                    int cfr_ignored_29 = (Integer.rotateRight(0xCCA02416 ^ n2, 12) - -876479003) * -861920233;
                    n3 = (n2 ^ 0x6EBB6D32 ^ 0x10E9546C) + 283726956;
                    continue block29;
                }
                case 1857776955: {
                    int cfr_ignored_30 = (Integer.rotateRight(0x4A0ED7FE ^ n2, 12) - -64370947) * 1242486783;
                    n3 = (n2 ^ 0x9E8A2A4F ^ 0x10E9546C) + 283726956 ^ 0xE897B131 ^ 0xE897B131;
                    int cfr_ignored_31 = (Integer.rotateLeft(0x53815539 ^ n2, 13) + 554103074) * 1400984889;
                    int cfr_ignored_32 = (int)(0x9133FB0427D4EB4FL ^ (long)n2 ^ 0xB78831A2DB88FB6L);
                    n3 = (n2 ^ 0x6EBB6D32 ^ 0x10E9546C) + 283726956;
                    continue block29;
                }
                case 1857776956: {
                    int cfr_ignored_33 = (Integer.rotateLeft(0x763FD7F4 ^ n2, 17) - 1444464071) * 1983895541;
                    n3 = (n2 ^ 0x6EBB6D32 ^ 0x10E9546C) + 283726956;
                    int cfr_ignored_34 = Integer.rotateLeft(0x230CD6C0 ^ n2, 7) + 1122738299;
                    n += 2;
                    continue block29;
                }
                case 1857776957: {
                    int cfr_ignored_35 = Integer.rotateLeft(0xEB43F7C5 ^ n2, 16) - -2120703978;
                    int cfr_ignored_36 = (int)(0x29F159F827D4EB4FL ^ (long)n2 ^ 0x4E80831A2DB9FE33L);
                    n3 = (n2 ^ 0x78403ABF ^ 0x10E9546C) + 283726956;
                    int cfr_ignored_37 = (Integer.rotateLeft(0xA05DD21D ^ n2, 7) - 1874464958) * -1604464099;
                    int cfr_ignored_38 = (int)(0x62EF7C2027D4EB4FL ^ (long)n2 ^ 0x530831A2DB9680FL);
                    n3 = (int)((long)((n2 ^ 0x30E7651B ^ 0x10E9546C) + 283726956) ^ 0x4D127B08083A7C0DL ^ 0x4D127B08083A7C0DL);
                    int cfr_ignored_39 = Integer.rotateLeft(0x20B41261 ^ n2, 7) + -97789702;
                    int cfr_ignored_40 = (int)(0xE206BC5C27D4EB4FL ^ (long)n2 ^ 0x85C8831A2DB869DCL);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x6EBB6D32 ^ 0x10E9546C) + 283726956));
                    n -= 5;
                    continue block29;
                }
                case 1857776958: {
                    int cfr_ignored_41 = (Integer.rotateLeft(0xFBC5AA39 ^ n2, 18) + -2125644766) * -70931911;
                    int cfr_ignored_42 = (int)(0x3977040427D4EB4FL ^ (long)n2 ^ 0xF578831A2DB9DF3FL);
                    n3 = (n2 ^ 0x6EBB6D32 ^ 0x10E9546C) + 283726956 + 1908952776 - 1908952776;
                    n += 4;
                    continue block29;
                }
            }
            int cfr_ignored_43 = (Integer.rotateLeft(0x9738A3BC ^ n2, 5) - 1413051135) * -1757895747;
            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x6EBB6D32 ^ 0x10E9546C) + 283726956));
        }
    }

    private boolean sbdh() {
        int n = 666069859;
        n = Integer.rotateLeft(n * 997449749, 18) ^ 0x8450BC8C;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x21D70B19;
        if ((n2 ^ n) != 567741209) {
            int cfr_ignored_0 = (0x664607A ^ n) - 999720003;
        }
        return !this.dhbb.shzl();
    }

    private static String ghshq(String string, int n, int n2, int n3) {
        try {
            int n4 = -200344799;
            n4 = Integer.rotateLeft(n4 * -428977327, 18) ^ 0x2B3F9BD4;
            n4 = n ^ n4;
            n4 = n2 ^ n4;
            int n5 = n4 ^ 0xA11B23D0;
            if ((n5 ^ n4) != -1592056880) {
                int cfr_ignored_0 = (0x5515D8F1 ^ n4) + -523431990;
            }
            if ((0x396 & 0) != 0) {
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
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xC7FE81B9 ^ n2 ^ i * -1603986555 ^ shbb, 16) ^ khkdh));
        }
        return new String(cArray);
    }

    private static UUID znr() {
        block0: {
            int n = bkhw.khqn(1230886115);
            int n2 = n ^ 0x4B31F34B;
            if ((n2 ^ n) == 1261564747) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x26C27A8 ^ n, 3) + 1333161107;
        }
        return UUID.randomUUID();
    }

    private static String thgha_2(GameProfile gameProfile) {
        block0: {
            int n = -115982318;
            n = Integer.rotateLeft(n * 2109143749, 21) ^ 0x95AD1188;
            GameProfile gameProfile2 = gameProfile;
            n = (gameProfile2 != null ? System.identityHashCode(gameProfile2) : 0) ^ n;
            int n2 = n ^ 0xAD991B;
            if ((n2 ^ n) == 11376923) break block0;
            int cfr_ignored_0 = (0xF9BBD909 ^ n) - -259447408;
        }
        return gameProfile.getName();
    }

    private static boolean zghd_2(PropertyMap propertyMap, Multimap multimap) {
        block0: {
            int n = 979912975;
            n = Integer.rotateLeft(n * 440022087, 23) ^ 0x1860BD0C;
            PropertyMap propertyMap2 = propertyMap;
            n = Integer.rotateRight((propertyMap2 != null ? System.identityHashCode(propertyMap2) : 0) ^ n, 6);
            int n2 = n ^ 0x94FA06B1;
            if ((n2 ^ n) == -1795553615) break block0;
            int cfr_ignored_0 = (0xAE924FBE ^ n) + -907568435;
        }
        return propertyMap.putAll(multimap);
    }

    private static void anh_2(class_745 class_7452, float f) {
        int n = bkhw.khqn(-281063028);
        class_745 class_7453 = class_7452;
        n = Integer.rotateLeft((class_7453 != null ? System.identityHashCode(class_7453) : 0) ^ n, 22);
        n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 13);
        int n2 = n ^ 0xB59794F3;
        if ((n2 ^ n) != -1248357133) {
            int cfr_ignored_0 = (Integer.rotateRight(0x5AA8C57F ^ n, 14) - -20084324) * 1521010047;
        }
        class_7452.method_6033(f);
    }

    private static class_2561 tka(class_745 class_7452) {
        block0: {
            int n = -770113358;
            int n2 = (n = Integer.rotateLeft(n * -2113975657, 25) ^ 0xD1F3C0B9) ^ 0xFCB9B3EF;
            if ((n2 ^ n) == -54938641) break block0;
            int cfr_ignored_0 = (0x2EA0B35D ^ n) - -2145647379;
        }
        return class_7452.method_5477();
    }

    private static boolean sbm_2(badh_2 badh2) {
        block0: {
            int n = bkhw.khqn(1801768541);
            badh_2 badh3 = badh2;
            n = (badh3 != null ? System.identityHashCode(badh3) : 0) ^ n;
            int n2 = n ^ 0x70B3BED6;
            if ((n2 ^ n) == 1890827990) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x1BD7708B ^ n, 6) + 1668562960;
        }
        return badh2.shzl();
    }

    private static class_1799 zha_7(class_1799 class_17992) {
        block0: {
            int n = 420958304;
            n = Integer.rotateLeft(n * -1118592675, 26) ^ 0x83C7EE6D;
            class_1799 class_17993 = class_17992;
            n = (class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n;
            int n2 = n ^ 0xCC1303C9;
            if ((n2 ^ n) == -871169079) break block0;
            int cfr_ignored_0 = (0xD50453A9 ^ n) - -578190154;
        }
        return class_17992.method_7972();
    }

    private static void dst_6(class_745 class_7452, class_1268 class_12682, class_1799 class_17992) {
        int n = 2069970424;
        int n2 = (n = Integer.rotateLeft(n * -1748679665, 25) ^ 0xB9168B7B) ^ 0x239C1DFB;
        if ((n2 ^ n) != 597433851) {
            int cfr_ignored_0 = (0x58FD2003 ^ n) - -1506433585;
        }
        class_7452.method_6122(class_12682, class_17992);
    }

    private static void han_2(class_745 class_7452, class_1268 class_12682, class_1799 class_17992) {
        int n = -226919363;
        n = Integer.rotateLeft(n * 471274925, 14) ^ 0x8025C604;
        class_1268 class_12683 = class_12682;
        n = Integer.rotateLeft((class_12683 != null ? System.identityHashCode(class_12683) : 0) ^ n, 25);
        class_1799 class_17993 = class_17992;
        n = Integer.rotateRight((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 9);
        int n2 = n ^ 0xEC26D933;
        if ((n2 ^ n) != -332998349) {
            int cfr_ignored_0 = (0x1E5FA50E ^ n) - -1001248141;
        }
        class_7452.method_6122(class_12682, class_17992);
    }

    private static class_1661 amn(class_746 class_7462) {
        block0: {
            int n = 1061620417;
            int n2 = (n = Integer.rotateLeft(n * 2143500487, 7) ^ 0x2AFA08C1) ^ 0xC1C71117;
            if ((n2 ^ n) == -1043918569) break block0;
            int cfr_ignored_0 = (0xFE801BD6 ^ n) - 195441115;
        }
        return class_7462.method_31548();
    }

    private static class_1799 dtha_4(class_1661 class_16612, int n) {
        block0: {
            int n2 = -157624640;
            n2 = Integer.rotateLeft(n2 * -558867139, 18) ^ 0x2F918EAB;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 15)) ^ 0xAADCD7E;
            if ((n3 ^ n2) == 179162494) break block0;
            int cfr_ignored_0 = (0xFC371BBE ^ n2) + 1107081388;
        }
        return class_16612.method_5438(n);
    }

    private static class_1799 shh_8(class_1799 class_17992) {
        block0: {
            int n = 2144961055;
            int n2 = (n = Integer.rotateLeft(n * -738651319, 16) ^ 0x659C986E) ^ 0x92ABC848;
            if ((n2 ^ n) == -1834235832) break block0;
            int cfr_ignored_0 = (0xED724A57 ^ n) - -16042825;
        }
        return class_17992.method_7972();
    }

    private static class_1661 dthh_2(class_745 class_7452) {
        block0: {
            int n = 2051740024;
            int n2 = (n = Integer.rotateLeft(n * -1039274487, 12) ^ 0x3ED5F1ED) ^ 0x18C60F55;
            if ((n2 ^ n) == 415633237) break block0;
            int cfr_ignored_0 = (0x628D1E2D ^ n) + -1537839587;
        }
        return class_7452.method_31548();
    }

    private static class_1799 srl_2(class_1661 class_16612, int n) {
        block0: {
            int n2 = -1640991326;
            n2 = Integer.rotateLeft(n2 * -1196085221, 27) ^ 0xF7A6592;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 9)) ^ 0x84D0EADC;
            if ((n3 ^ n2) == -2066683172) break block0;
            int cfr_ignored_0 = (0x1AE09F7E ^ n2) - -1226099575;
        }
        return class_16612.method_5438(n);
    }

    private static class_1799 zdd_6(class_1661 class_16612, int n) {
        block0: {
            int n2 = 206884155;
            n2 = Integer.rotateLeft(n2 * -686217979, 11) ^ 0x71FE22BC;
            class_1661 class_16613 = class_16612;
            n2 = Integer.rotateRight((class_16613 != null ? System.identityHashCode(class_16613) : 0) ^ n2, 24);
            int n3 = (n2 = n ^ n2) ^ 0x35A3B30;
            if ((n3 ^ n2) == 56245040) break block0;
            int cfr_ignored_0 = (0xF0EF60B ^ n2) + -2105607091;
        }
        return class_16612.method_5438(n);
    }

    private static void thkhh(class_1661 class_16612, int n, class_1799 class_17992) {
        int n2 = bkhw.khqn(-1183771887);
        class_1661 class_16613 = class_16612;
        n2 = Integer.rotateRight((class_16613 != null ? System.identityHashCode(class_16613) : 0) ^ n2, 17);
        int n3 = n2 ^ 0x39CE85D6;
        if ((n3 ^ n2) != 969835990) {
            int cfr_ignored_0 = Integer.rotateRight(0x80BF96C7 ^ n2, 3) - -1685003948;
        }
        class_16612.method_5447(n, class_17992);
    }

    private static class_1661 jyk(class_745 class_7452) {
        block0: {
            int n = -1026330438;
            n = Integer.rotateLeft(n * 2016933877, 21) ^ 0x3F3EE985;
            class_745 class_7453 = class_7452;
            n = Integer.rotateLeft((class_7453 != null ? System.identityHashCode(class_7453) : 0) ^ n, 16);
            int n2 = n ^ 0xA67D6BD9;
            if ((n2 ^ n) == -1501729831) break block0;
            int cfr_ignored_0 = (0x64AE1B63 ^ n) + -75373270;
        }
        return class_7452.method_31548();
    }

    private static int dbsh(int n) {
        block0: {
            int n2 = -733026152;
            n2 = Integer.rotateLeft(n2 * -2030824049, 28) ^ 0x9E30FCB7;
            int n3 = (n2 = n ^ n2) ^ 0xECE56089;
            if ((n3 ^ n2) == -320511863) break block0;
            int cfr_ignored_0 = (0x38AB8811 ^ n2) - 141944373;
        }
        return Integer.reverse(n);
    }

    private static class_1799 zthl(class_1799 class_17992) {
        block0: {
            int n = 99807804;
            int n2 = (n = Integer.rotateLeft(n * -1973089829, 24) ^ 0xB1347AEB) ^ 0xBEC7D313;
            if ((n2 ^ n) == -1094200557) break block0;
            int cfr_ignored_0 = (0xBB35212F ^ n) - -803555101;
        }
        return class_17992.method_7972();
    }

    private static void hna_2(class_1661 class_16612, int n, class_1799 class_17992) {
        int n2 = 1902515512;
        n2 = Integer.rotateLeft(n2 * -27581931, 4) ^ 0xEE866DA4;
        int n3 = (n2 = Integer.rotateLeft(n ^ n2, 17)) ^ 0x2B4CBBEA;
        if ((n3 ^ n2) != 726449130) {
            int cfr_ignored_0 = (0x5A2AAED2 ^ n2) - 586748701;
        }
        class_16612.method_5447(n, class_17992);
    }

    private static boolean szsh(class_1657 class_16572) {
        block0: {
            int n = -524918133;
            int n2 = (n = Integer.rotateLeft(n * 426088325, 10) ^ 0x5BFE1777) ^ 0xE8BE67EC;
            if ((n2 ^ n) == -390174740) break block0;
            int cfr_ignored_0 = (0x8080567 ^ n) - -957861147;
        }
        return class_16572.method_24828();
    }

    private static boolean dhrq(class_1657 class_16572) {
        block0: {
            int n = 83564844;
            n = Integer.rotateLeft(n * 635040629, 16) ^ 0x763BE09D;
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0xF4EC800D;
            if ((n2 ^ n) == -185827315) break block0;
            int cfr_ignored_0 = (0xF0179921 ^ n) - -358290600;
        }
        return class_16572.method_6101();
    }

    private static boolean dhfs_2(class_1657 class_16572) {
        block0: {
            int n = 930363930;
            int n2 = (n = Integer.rotateLeft(n * -1616159505, 21) ^ 0x4F8FB689) ^ 0xC0DBF627;
            if ((n2 ^ n) == -1059326425) break block0;
            int cfr_ignored_0 = (0xF7AFCC3D ^ n) + 2102280842;
        }
        return class_16572.method_5869();
    }

    private static boolean khya(class_1657 class_16572, class_6880 class_68802) {
        block0: {
            int n = -1228268461;
            n = Integer.rotateLeft(n * -1995176957, 21) ^ 0x3A966E48;
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            class_6880 class_68803 = class_68802;
            n = (class_68803 != null ? System.identityHashCode(class_68803) : 0) ^ n;
            int n2 = n ^ 0x92741625;
            if ((n2 ^ n) == -1837885915) break block0;
            int cfr_ignored_0 = (0x24BE0A76 ^ n) - -537603899;
        }
        return class_16572.method_6059(class_68802);
    }

    private static boolean shzw_2(class_1657 class_16572) {
        block0: {
            int n = 449023536;
            n = Integer.rotateLeft(n * 510656825, 11) ^ 0xB472041E;
            class_1657 class_16573 = class_16572;
            n = Integer.rotateRight((class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n, 17);
            int n2 = n ^ 0x22F937C3;
            if ((n2 ^ n) == 586758083) break block0;
            int cfr_ignored_0 = (0x383AB9F3 ^ n) + 1479929961;
        }
        return class_16572.method_5624();
    }

    private static float sab_4(bghk bghk2, float f) {
        block0: {
            int n = -1371711064;
            n = Integer.rotateLeft(n * 2016457065, 25) ^ 0xA87CF51D;
            bghk bghk3 = bghk2;
            n = (bghk3 != null ? System.identityHashCode(bghk3) : 0) ^ n;
            int n2 = n ^ 0xC8D900FE;
            if ((n2 ^ n) == -925302530) break block0;
            int cfr_ignored_0 = (0x66E45956 ^ n) - 1325975119;
        }
        return bghk2.thss(f);
    }

    private static class_1293 bs_2(class_745 class_7452, class_6880 class_68802) {
        block0: {
            int n = 144383475;
            int n2 = (n = Integer.rotateLeft(n * -2074717727, 20) ^ 0x49923E76) ^ 0x2FA479E9;
            if ((n2 ^ n) == 799308265) break block0;
            int cfr_ignored_0 = (0x273F641A ^ n) - 1638459460;
        }
        return class_7452.method_6112(class_68802);
    }

    private static int saw_4(int n) {
        block0: {
            int n2 = bkhw.khqn(-426979238);
            int n3 = n2 ^ 0x1FD3231E;
            if ((n3 ^ n2) == 533930782) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xF95FF344 ^ n2, 18) - 922489975;
        }
        return Integer.reverse(n);
    }

    private static void rkhk(bghk bghk2) {
        int n = 1315947469;
        n = Integer.rotateLeft(n * 1693354409, 19) ^ 0x69AE7F01;
        bghk bghk3 = bghk2;
        n = (bghk3 != null ? System.identityHashCode(bghk3) : 0) ^ n;
        int n2 = n ^ 0x9F5245C1;
        if ((n2 ^ n) != -1621998143) {
            int cfr_ignored_0 = (0xD13D860C ^ n) - -1530108075;
        }
        bghk2.ddz_6();
    }

    private static float ghhq(class_745 class_7452) {
        block0: {
            int n = 813736005;
            n = Integer.rotateLeft(n * 1735387013, 5) ^ 0x8BA2FFF4;
            class_745 class_7453 = class_7452;
            n = (class_7453 != null ? System.identityHashCode(class_7453) : 0) ^ n;
            int n2 = n ^ 0x3AE322C1;
            if ((n2 ^ n) == 987964097) break block0;
            int cfr_ignored_0 = (0xA638284 ^ n) - 157975640;
        }
        return class_7452.method_6032();
    }

    private static class_1799 thah_3(class_745 class_7452) {
        block0: {
            int n = bkhw.khqn(119741517);
            int n2 = n ^ 0x4F6E7CF3;
            if ((n2 ^ n) == 1332641011) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x484D60BE ^ n, 12) - -977512899) * 1213030591;
        }
        return class_7452.method_6079();
    }

    private static boolean jkj(class_1799 class_17992, class_1792 class_17922) {
        block0: {
            int n = bkhw.khqn(1206538425);
            class_1799 class_17993 = class_17992;
            n = Integer.rotateRight((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 27);
            class_1792 class_17923 = class_17922;
            n = Integer.rotateLeft((class_17923 != null ? System.identityHashCode(class_17923) : 0) ^ n, 24);
            int n2 = n ^ 0x2A79FCE4;
            if ((n2 ^ n) == 712637668) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x6D93AC5D ^ n, 16) - 1228897918) * 1838394461;
            int cfr_ignored_1 = (int)(0xAF21026027D4EB4FL ^ (long)n ^ 0xF9B0831A2DB8F393L);
        }
        return class_17992.method_31574(class_17922);
    }

    private static String[] tdl_2(String string) {
        block0: {
            int n = -2077467845;
            n = Integer.rotateLeft(n * -1374043287, 12) ^ 0x93AC2729;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 6);
            int n2 = n ^ 0xE1EE9EE0;
            if ((n2 ^ n) == -504455456) break block0;
            int cfr_ignored_0 = (0x65C2C5DB ^ n) + 730511329;
        }
        return string.split("\u0002\u0019", -1);
    }

    private static CallSite dkd_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -677364884;
            n3 = Integer.rotateLeft(n3 * 167989811, 18) ^ 0x2C9D8107;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 18);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 29);
            int n4 = n3 ^ 0x9A4AA1CC;
            if ((n4 ^ n3) != -1706384948) {
                int cfr_ignored_0 = (0x4DEA9AA0 ^ n3) + -1526496892;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ka_2 ^ string.hashCode()) + (n2 + khfz_2) + i ^ ka_2, 19) + khfz_2);
            }
            String[] stringArray = bghk.tdl_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] rp8i9yl76gi(String string) {
        return string.split("\b\u001a", -1);
    }

    private static CallSite szdf5c5nyzkbtl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dujw15h8i4n5f ^ string.hashCode() ^ n2 + y8zfd3nf ^ i * -100628441 ^ dujw15h8i4n5f, 11) ^ y8zfd3nf));
            }
            String[] stringArray = bghk.rp8i9yl76gi(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

