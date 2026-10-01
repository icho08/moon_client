/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1308
 *  net.minecraft.class_1309
 *  net.minecraft.class_1429
 *  net.minecraft.class_1541
 *  net.minecraft.class_1657
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import net.minecraft.class_1297;
import net.minecraft.class_1308;
import net.minecraft.class_1309;
import net.minecraft.class_1429;
import net.minecraft.class_1541;
import net.minecraft.class_1657;
import us.m0vy.moondlc.m0vyguard.bbd_2;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.blh_2;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.ttgh;
import us.m0vy.moondlc.m0vyguard.tsl;
import us.m0vy.moondlc.m0vyguard.hz_2;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Nametags", category=bzw.OTHER, desc="Shows custom nametags for players and world entities")
public class ad
extends bnq {
    private static ad brn;
    public final bbd_2 rnz = new bbd_2(this, "Render For");
    public final s_3 snsh = new s_3(this.rnz, "Players").thst();
    public final s_3 dhsh = new s_3(this.rnz, "Friends").thst();
    public final s_3 ryf = new s_3(this.rnz, "Mobs");
    public final s_3 shshz_2 = new s_3(this.rnz, "Animals");
    public final s_3 dl_2 = new s_3(this.rnz, "TNT");
    public final bbd_2 daq = new bbd_2(this, "Info To Render");
    public final s_3 hrk = new s_3(this.daq, "Name").thst();
    public final s_3 shtd = new s_3(this.daq, "Health").thst();
    public final s_3 tmth = new s_3(this.daq, "Absorption").thst();
    public final s_3 rfw = new s_3(this.daq, "Distance");
    public final s_3 rza = new s_3(this.daq, "Ping");
    public final s_3 zzz = new s_3(this.daq, "Armor").thst();
    public final s_3 zkn = new s_3(this.daq, "Hand Items").thst();
    public final s_3 rks = new s_3(this.daq, "Enchants").thst();
    public final s_3 dhna_2 = new s_3(this.daq, "Effects");
    public final s_3 dhbl = new s_3(this.daq, "Special Item").thst();
    public final tay dhts = new tay(this, "Scale").shth_7(Float.intBitsToFloat(Integer.reverse(-192930041) ^ 0xDFF4CDE2)).dhbs_2(Float.intBitsToFloat(1069755851 - -1888821)).rkh_3(Float.intBitsToFloat(Integer.reverse(-519472900) ^ 0x2525C4A)).ssd_5(1.0f);
    public final tay dhtha_2 = new tay(this, "Y Offset").shth_7(Float.intBitsToFloat(Integer.reverse(1546428584) ^ 0xD4F5343A)).dhbs_2(Float.intBitsToFloat(1517098791 - 407705383)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x8CC8C245 ^ 0x8CC83E45, 14))).ssd_5(0.0f);
    public final badh_2 smd = new badh_2(this, "Blur").bts(false);
    public final badh_2 dhtw_2 = new badh_2((hy)this, "Item Ba".concat("ckgrounds"), ad::djh).bts(true);
    public final badh_2 zzy_2 = new badh_2((hy)this, "Item Gr".concat("ouping"), ad::dhhh_2).bts(true);
    public final badh_2 znd_2 = new badh_2((hy)this, "Shulker".concat(" Preview"), ad::sny_2).bts(true);
    public final bzw_2 rzm_2 = new bzw_2(this, "Fill Color").dhshy(new byq(Float.intBitsToFloat(-1678155985 - 1524195119), Float.intBitsToFloat(0x3D6F65A9 ^ 0x7CE765A9), Float.intBitsToFloat(844856174 + 253002898), Float.intBitsToFloat(Integer.reverse(-1775433565) ^ 0x862CB469)));
    public final bzw_2 rhkh = new bzw_2(this, "Accent Color").dhshy(new byq(Float.intBitsToFloat(703308329 - -422469079), Float.intBitsToFloat(Integer.reverse(707243515) ^ 0x9CD9E454), Float.intBitsToFloat(-1141165699 - 2035626365), Float.intBitsToFloat(-604249484 - -1734679948)));
    public final bzw_2 rts_2 = new bzw_2(this, "Friend Fill").dhshy(new byq(Float.intBitsToFloat(409926252 - -682689940), Float.intBitsToFloat(0xE96146EB ^ 0xA88146EB), Float.intBitsToFloat(Integer.rotateLeft(0xC91DD98C ^ 0xC91FD50C, 13)), Float.intBitsToFloat(Integer.rotateLeft(0x8016282A ^ 0x4F16283A, 26))));
    private final ttgh dhtl_2 = new ttgh(this);
    private final bql<hz_2> thtb_2 = this::hsz_4;
    private static final int thsr = -1290843375;
    private static final int rlh = -1806105188;
    private static final int thh = -1793418241;
    private static final int jta_3 = 497522462;
    private static final int wokuwdtba8w29 = -1099776464;
    private static final int hwf4jr4j = 1674586513;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int j1s4ewtuz;

    public static ad ghst_2() {
        block0: {
            int n = -639863941;
            int n2 = (n = Integer.rotateLeft(n * 40653413, 15) ^ 0x817E3A57) ^ 0x3E9CF88E;
            if ((n2 ^ n) == 1050474638) break block0;
            int cfr_ignored_0 = (0xE7408BF5 ^ n) + 1477453986;
        }
        return brn;
    }

    public ad() {
        brn = this;
    }

    public boolean rna_2(class_1657 class_16572) {
        if (class_16572 == null || class_16572 == ad.mc.field_1724 || !class_16572.method_5805()) {
            return false;
        }
        if (((blh_2)Moondlc.getInstance().getModuleManager().dfr_2(blh_2.class)).rgha_2() && blh_2.dhwj(class_16572)) {
            return false;
        }
        boolean bl = this.dngh_2(class_16572);
        return bl ? this.rnz.tzn_3("Friends") : this.rnz.tzn_3("Players");
    }

    public boolean dths_2(class_1297 class_12972) {
        block6: {
            block5: {
                if (!(class_12972 instanceof class_1309)) break block5;
                class_1309 class_13092 = (class_1309)class_12972;
                if (class_12972 != ad.mc.field_1724 && class_13092.method_5805()) break block6;
            }
            return false;
        }
        if (class_12972 instanceof class_1657) {
            class_1657 class_16572 = (class_1657)class_12972;
            return this.rna_2(class_16572);
        }
        if (class_12972 instanceof class_1429) {
            return this.rnz.tzn_3("Animals");
        }
        return class_12972 instanceof class_1308 && this.rnz.tzn_3("Mobs");
    }

    public boolean tkha_4(class_1297 class_12972) {
        return class_12972 instanceof class_1541 && this.rnz.tzn_3("TNT");
    }

    public boolean dngh_2(class_1657 class_16572) {
        block0: {
            int n = 526138986;
            n = Integer.rotateLeft(n * -1624019941, 8) ^ 0x1C331E7B;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 5);
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0x290B40BB;
            if ((n2 ^ n) == 688603323) break block0;
            int cfr_ignored_0 = (0x36577ED1 ^ n) - 1799824895;
        }
        return ad.dhkhh_2(Moondlc.getInstance()).adhj(class_16572.method_7334().getName());
    }

    public boolean tbh_3() {
        block0: {
            int n = 1978994364;
            n = Integer.rotateLeft(n * 1679063277, 28) ^ 0x263F5785;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x844EDCAF;
            if ((n2 ^ n) == -2075206481) break block0;
            int cfr_ignored_0 = (0xF1BBD213 ^ n) - -1078123138;
        }
        return this.daq.tzn_3(ad.szj_2("狝썞ᆧ柳", ad.thzw(0xEDD37CB9 ^ 0x30B5744, 12), -2145137807 + -1333791412, 0x88239270 ^ 0x14D877CA));
    }

    public boolean dwgh_2() {
        boolean bl = false;
        int n = 0;
        int n2 = 1058513399;
        n2 = Integer.rotateLeft(n2 * 167678331, 8) ^ 0x615BC8A7;
        int n3 = (int)((long)(n2 ^ 0xF803B487) ^ 0xFADBD0C7C68AA9ECL ^ 0xFADBD0C7C68AA9ECL);
        while (true) {
            block22: {
                block32: {
                    block38: {
                        block33: {
                            block20: {
                                block36: {
                                    block27: {
                                        block21: {
                                            block35: {
                                                block37: {
                                                    block25: {
                                                        block31: {
                                                            block24: {
                                                                block26: {
                                                                    block30: {
                                                                        block19: {
                                                                            block34: {
                                                                                block28: {
                                                                                    block29: {
                                                                                        block17: {
                                                                                            block23: {
                                                                                                block18: {
                                                                                                    if ((n = n3 ^ n2) > -259012033) break block17;
                                                                                                    if (n > -1145002082) break block18;
                                                                                                    if (n == -2053630396) break block19;
                                                                                                    if (n == -1701294772) break block20;
                                                                                                    int cfr_ignored_0 = Integer.rotateRight(0x834AC76E ^ n2, 3) - -362035827;
                                                                                                    if (n == -1145002082) break block21;
                                                                                                    break block22;
                                                                                                }
                                                                                                if (n > -807579234) break block23;
                                                                                                if (n == -1032915982) break block24;
                                                                                                if (n == -807579234) break block25;
                                                                                                break block22;
                                                                                            }
                                                                                            if (n == -758186012) break block26;
                                                                                            if (n == -259012033) break block27;
                                                                                            break block22;
                                                                                        }
                                                                                        if (n > 541021169) break block28;
                                                                                        if (n > 274110737) break block29;
                                                                                        if (n == -133974905) break block30;
                                                                                        if (n == 274110737) break block31;
                                                                                        int cfr_ignored_1 = Integer.rotateRight(0x7C724583 ^ n2, 18) + 372509208;
                                                                                        break block22;
                                                                                    }
                                                                                    if (n == 511024573) break block32;
                                                                                    if (n == 541021169) break block33;
                                                                                    int cfr_ignored_2 = Integer.rotateRight(0x89C7CEA3 ^ n2, 4) + -1282431752;
                                                                                    break block22;
                                                                                }
                                                                                if (n > 1433884731) break block34;
                                                                                if (n == 843289245) break block35;
                                                                                if (n == 1433884731) break block36;
                                                                                int cfr_ignored_3 = (Integer.rotateLeft(0xD2B12255 ^ n2, 13) - -2016360570) * -760143275;
                                                                                int cfr_ignored_4 = (int)(0x10038C6827D4EB4FL ^ (long)n2 ^ 0xE5A0831A2DB98DD6L);
                                                                                break block22;
                                                                            }
                                                                            if (n == 1473428166) break block37;
                                                                            if (n == 1747433511) break block38;
                                                                            break block22;
                                                                        }
                                                                        int cfr_ignored_5 = (Integer.rotateRight(0xE5B1A65E ^ n2, 15) - -723467107) * -441342369;
                                                                        bl = ad.dbm(this.daq, "Health");
                                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x1E759DBD));
                                                                        int cfr_ignored_6 = (Integer.rotateRight(0x197B30DF ^ n2, 6) - 440961596) * 427503839;
                                                                        n += 2;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_7 = (Integer.rotateLeft(0x38BAF0FC ^ n2, 10) - -486486593) * 951775485;
                                                                    if (yf.dnkh()) {
                                                                        try {
                                                                            if ((0x1BD894BB1AEC9DBDL ^ (long)n2 | 1L) == 0L) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            n3 = n2 ^ 0xD2CEFFE4;
                                                                        }
                                                                        catch (IllegalStateException illegalStateException) {
                                                                            n3 = n2 ^ 0xD2CEFFE4;
                                                                        }
                                                                        n -= 2;
                                                                        continue;
                                                                    }
                                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x85981644));
                                                                    n += 4;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_8 = (Integer.rotateRight(0x524974F6 ^ n2, 13) - -79509243) * 1380545783;
                                                                throw null;
                                                            }
                                                            int cfr_ignored_9 = Integer.rotateRight(0x771F43C3 ^ n2, 17) + 1898370008;
                                                            try {
                                                                if ((0x3B5781494F38ECD3L ^ (long)n2 | 1L) == 0L) {
                                                                    throw new NoSuchElementException();
                                                                }
                                                                n3 = n2 ^ 0xF803B487;
                                                            }
                                                            catch (NoSuchElementException noSuchElementException) {
                                                                n3 = n2 ^ 0xF803B487;
                                                            }
                                                            continue;
                                                        }
                                                        int cfr_ignored_10 = (Integer.rotateRight(0x3A1DFD32 ^ n2, 10) + 234833993) * 975043891;
                                                        n3 = (int)((long)(n2 ^ 0x914009D) ^ 0xE8393F21AD90A60DL ^ 0xE8393F21AD90A60DL);
                                                        int cfr_ignored_11 = Integer.rotateRight(0xE5B56AF ^ n2, 4) - -1049813396;
                                                        n3 = n2 ^ 0xBEA759F0;
                                                        int cfr_ignored_12 = (Integer.rotateRight(0x53EF4A56 ^ n2, 13) - 777494437) * 1408191063;
                                                        n3 = n2 ^ 0xF803B487 ^ 0x2A2759AC ^ 0x2A2759AC;
                                                        n -= 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_13 = Integer.rotateLeft(0x262EC2C1 ^ n2, 7) + -1543031654;
                                                    int cfr_ignored_14 = (int)(0xE49C6CFC27D4EB4FL ^ (long)n2 ^ 0x2488831A2DB864E9L);
                                                    n3 = n2 ^ 0x52BD606B;
                                                    int cfr_ignored_15 = (Integer.rotateRight(0x5F2EA2F2 ^ n2, 14) + -1962714487) * 1596891891;
                                                    n3 = (n2 ^ 0xF803B487) + 724837988 - 724837988;
                                                    n -= 2;
                                                    continue;
                                                }
                                                int cfr_ignored_16 = (Integer.rotateRight(0x1C39B392 ^ n2, 6) + 1868193257) * 473543571;
                                                n3 = n2 ^ 0x31C8C8EC;
                                                int cfr_ignored_17 = Integer.rotateRight(0xFA64D0AB ^ n2, 18) + 1452467184;
                                                n3 = n2 ^ 0xF803B487;
                                                int cfr_ignored_18 = (Integer.rotateLeft(0xADB592FD ^ n2, 8) - 224029662) * -1380609283;
                                                int cfr_ignored_19 = (int)(0x6F073CC027D4EB4FL ^ (long)n2 ^ 0x84F0831A2DB973DFL);
                                                n += 2;
                                                continue;
                                            }
                                            int cfr_ignored_20 = (Integer.rotateRight(0xA253F4B3 ^ n2, 7) + -1400356632) * -1571556173;
                                            n3 = (n2 ^ 0xED2B0D17) + 1426430269 - 1426430269;
                                            int cfr_ignored_21 = Integer.rotateLeft(0x68BF558D ^ n2, 16) - -1282868402;
                                            int cfr_ignored_22 = (int)(0xAA0DFBB027D4EB4FL ^ (long)n2 ^ 0xA10831A2DB8F9CAL);
                                            n3 = (n2 ^ 0xD8093AE4) + -56557723 - -56557723;
                                            int cfr_ignored_23 = Integer.rotateLeft(0xAE55148C ^ n2, 8) - 548084783;
                                            n3 = n2 ^ 0xF803B487;
                                            continue;
                                        }
                                        tsl.khlt(1606080512, n2);
                                        int cfr_ignored_24 = (int)(0xC18DA1B97F4A7C15L ^ (long)n2 ^ 0xBE023227030C2ECAL);
                                        try {
                                            n += 3;
                                            if ((0x83E8DECF2EBDAE49L ^ (long)n2 | 1L) == 0L) {
                                                throw new IllegalArgumentException();
                                            }
                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xF803B487));
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            n3 = n2 ^ 0xF803B487 ^ 0xCFDBB64E ^ 0xCFDBB64E;
                                        }
                                        continue;
                                    }
                                    int cfr_ignored_25 = Integer.rotateLeft(0xBEFF189 ^ n2, 4) + 1986780882;
                                    int cfr_ignored_26 = (int)(0xC95D5FB427D4EB4FL ^ (long)n2 ^ 0x4218831A2DB83F6BL);
                                    n3 = (n2 ^ 0x373A9EE2) + -1957111110 - -1957111110;
                                    int cfr_ignored_27 = Integer.rotateRight(0x7B4E02 ^ n2, 3) + 323752313;
                                    try {
                                        if ((0x7F9930E53F87B6FDL ^ (long)n2 | 1L) == 0L) {
                                            throw new IllegalArgumentException();
                                        }
                                        n3 = n2 ^ 0xF803B487 ^ 0x160E648F ^ 0x160E648F;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        n3 = n2 ^ 0xF803B487;
                                    }
                                    n += 3;
                                    continue;
                                }
                                int cfr_ignored_28 = Integer.rotateRight(0x1C4275A7 ^ n2, 6) - 1885986420;
                                try {
                                    n -= 4;
                                    if ((0xBAD5B01628229569L ^ (long)n2 | 1L) == 0L) {
                                        throw new IllegalArgumentException();
                                    }
                                    n3 = (n2 ^ 0xF803B487) + 1065255029 - 1065255029;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    n3 = n2 ^ 0xF803B487 ^ 0x5C1A0A06 ^ 0x5C1A0A06;
                                }
                                n += 5;
                                continue;
                            }
                            int cfr_ignored_29 = (Integer.rotateRight(0xB8047457 ^ n2, 10) - 1290253764) * -1207667625;
                            n3 = (n2 ^ 0xF0C3A58C) + -626631881 - -626631881;
                            int cfr_ignored_30 = Integer.rotateRight(0x7AA668C3 ^ n2, 18) + -561754408;
                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xF803B487));
                            int cfr_ignored_31 = Integer.rotateLeft(0x283391C5 ^ n2, 8) - -493074922;
                            int cfr_ignored_32 = (int)(0xEA813FF827D4EB4FL ^ (long)n2 ^ 0x8280831A2DB878D3L);
                            n -= 4;
                            continue;
                        }
                        int cfr_ignored_33 = (Integer.rotateLeft(0x586EA4FD ^ n2, 14) - -1178363426) * 1483646205;
                        int cfr_ignored_34 = (int)(0x9ADC0AC027D4EB4FL ^ (long)n2 ^ 0xE8F0831A2DB89869L);
                        n3 = n2 ^ 0xDD9EE7C5 ^ 0xB0299A83 ^ 0xB0299A83;
                        int cfr_ignored_35 = (Integer.rotateRight(0x8D0B05E ^ n2, 4) - 363002525) * 147894367;
                        n3 = (int)((long)(n2 ^ 0x2D3D77EA) ^ 0xC05364260B42D468L ^ 0xC05364260B42D468L);
                        int cfr_ignored_36 = (Integer.rotateRight(0xA15C2956 ^ n2, 7) - -1903779675) * -1587795625;
                        n3 = n2 ^ 0xF803B487 ^ 0x5D2CB5DA ^ 0x5D2CB5DA;
                        --n;
                        continue;
                    }
                    int cfr_ignored_37 = (Integer.rotateLeft(0x6542A2BC ^ n2, 15) - 1198478335) * 1698865853;
                    n3 = n2 ^ 0xF803B487 ^ 0xAF00A090 ^ 0xAF00A090;
                    continue;
                }
                return bl;
            }
            int cfr_ignored_38 = Integer.rotateRight(0xFE6166AB ^ n2, 18) + -769061392;
            n3 = n2 ^ 0xF803B487;
        }
    }

    public boolean khns() {
        block0: {
            int n = -1577215709;
            n = Integer.rotateLeft(n * 2030556273, 11) ^ 0xA33FEE3F;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 16);
            int n2 = n ^ 0xA1636457;
            if ((n2 ^ n) == -1587321769) break block0;
            int cfr_ignored_0 = (0x9EFD74 ^ n) + 2045117664;
        }
        return ad.stl(this.daq, ad.szj_2("巄㺯䣯魅▪矺虔킏拺", ad.adt_3(-1419644322) ^ 0xF45C097A, 47021721 - -255803801, 1122666571 + 911379307));
    }

    /*
     * Unable to fully structure code
     */
    public boolean bdgh_2() {
        var3_1 = 0;
        var1_2 = 887676205;
        var1_2 = Integer.rotateLeft(var1_2 * 1013116765, 14) ^ -1319310522;
        var1_2 = Integer.rotateLeft(System.identityHashCode(this) ^ var1_2, 23);
        var2_3 = 1142647198 + var1_2 ^ 1690336395 ^ 1690336395;
        while (true) {
            block42: {
                block34: {
                    block36: {
                        block32: {
                            block33: {
                                block39: {
                                    block40: {
                                        block43: {
                                            block38: {
                                                block37: {
                                                    block35: {
                                                        block31: {
                                                            block41: {
                                                                var3_1 = var2_3 - var1_2;
                                                                switch (var3_1 & 7) {
                                                                    case 3: {
                                                                        if (var3_1 == -24594925) break block31;
                                                                        if (var3_1 != 1179214011) {
                                                                            Integer.rotateLeft(1214097416 ^ var1_2, 12) + -944441293;
                                                                            ** break;
                                                                        }
                                                                        break block32;
                                                                    }
                                                                    case 4: {
                                                                        if (var3_1 == -430984020) break block33;
                                                                        if (var3_1 != -53700404) {
                                                                            if (var3_1 == 1473665972) break;
                                                                            ** break;
                                                                        }
                                                                        break block34;
                                                                    }
                                                                    case 7: {
                                                                        if (var3_1 == 1194773591) break block35;
                                                                        if (var3_1 != 1077227791) {
                                                                            ** break;
                                                                        }
                                                                        break block36;
                                                                    }
                                                                    case 0: {
                                                                        if (var3_1 != -1214249536) {
                                                                            ** break;
                                                                        }
                                                                        break block37;
                                                                    }
                                                                    case 5: {
                                                                        if (var3_1 == 1885381101) break block38;
                                                                        if (var3_1 != 2106816197) {
                                                                            ** break;
                                                                        }
                                                                        break block39;
                                                                    }
                                                                    case 6: {
                                                                        if (var3_1 == -1017581882) break block40;
                                                                        if (var3_1 != 1142647198) {
                                                                            ** break;
                                                                        }
                                                                        break block41;
                                                                    }
                                                                    case 2: {
                                                                        if (var3_1 == -1362361454) break block42;
                                                                        if (var3_1 != -1169807110) {
                                                                            (Integer.rotateLeft(-878703112 ^ var1_2, 12) + -1396748221) * -878703111;
                                                                            ** break;
                                                                        }
                                                                        break block43;
                                                                    }
                                                                }
                                                                (Integer.rotateLeft(672921073 ^ var1_2, 8) + -541038742) * 672921073;
                                                                (int)(-1537596865370592433L ^ (long)var1_2 ^ 5397708301862992003L);
                                                                return this.daq.tzn_3("Distance");
                                                            }
                                                            Integer.rotateLeft(1526747624 ^ var1_2, 14) + 157780563;
                                                            if (!yf.dnkh()) {
                                                                var2_3 = 1473665972 + var1_2 ^ 1353723250 ^ 1353723250;
                                                                (Integer.rotateLeft(1487607804 ^ var1_2, 14) - -1055553857) * 1487607805;
                                                                var3_1 -= 2;
                                                                continue;
                                                            }
                                                            try {
                                                                if ((3448478891856158413L ^ (long)var1_2 | 1L) == 0L) {
                                                                    throw new UnsupportedOperationException();
                                                                }
                                                                var2_3 = -24594925 + var1_2 + 327905121 - 327905121;
                                                            }
                                                            catch (UnsupportedOperationException v0) {
                                                                var2_3 = -24594925 + var1_2 ^ -39922373 ^ -39922373;
                                                            }
                                                            --var3_1;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(1867352077 ^ var1_2, 16) - 2126584014;
                                                        (int)(-5908962197818250417L ^ (long)var1_2 ^ -5687902180909451729L);
                                                        throw null;
                                                    }
                                                    Integer.rotateRight(1703972066 ^ var1_2, 15) + 1356770969;
                                                    var2_3 = -285470542 + var1_2 + -1488682056 - -1488682056;
                                                    Integer.rotateRight(-10326814 ^ var1_2, 18) + -246886759;
                                                    var2_3 = Integer.reverse(Integer.reverse(1142647198 + var1_2));
                                                    var3_1 += 2;
                                                    continue;
                                                }
                                                Integer.rotateRight(887527586 ^ var1_2, 9) + 1816795865;
                                                var2_3 = 1142647198 + var1_2;
                                                var3_1 += 5;
                                                continue;
                                            }
                                            (Integer.rotateLeft(-252797731 ^ var1_2, 17) - 826449406) * -252797731;
                                            (int)(3628831338076105551L ^ (long)var1_2 ^ -7444306035583891095L);
                                            var2_3 = 992888709 + var1_2 + -625427901 - -625427901;
                                            (Integer.rotateRight(-198349262 ^ var1_2, 17) + -1780615351) * -198349261;
                                            var2_3 = -62719971 + var1_2;
                                            (Integer.rotateLeft(-142206887 ^ var1_2, 17) + -40201726) * -142206887;
                                            (int)(3833889724080384847L ^ (long)var1_2 ^ -7946457394035701832L);
                                            var2_3 = 1142647198 + var1_2;
                                            continue;
                                        }
                                        (Integer.rotateLeft(-896664679 ^ var1_2, 12) + -1953556798) * -896664679;
                                        (int)(594287839367457615L ^ (long)var1_2 ^ 6212859834417135023L);
                                        var2_3 = -1345578826 + var1_2 + 147182455 - 147182455;
                                        Integer.rotateLeft(-340835188 ^ var1_2, 16) - -1902711761;
                                        var2_3 = 400577009 + var1_2 ^ -749319550 ^ -749319550;
                                        (Integer.rotateLeft(-1357050028 ^ var1_2, 8) - 954366567) * -1357050027;
                                        var2_3 = 1142647198 + var1_2;
                                        continue;
                                    }
                                    (Integer.rotateLeft(1424325912 ^ var1_2, 13) + 1277674787) * 1424325913;
                                    var2_3 = Integer.reverse(Integer.reverse(403212392 + var1_2));
                                    (Integer.rotateLeft(875262520 ^ var1_2, 9) + 1436578819) * 875262521;
                                    var2_3 = (int)((long)(1430639290 + var1_2) ^ 4992022664406176856L ^ 4992022664406176856L);
                                    Integer.rotateRight(602301187 ^ var1_2, 7) + 1564712088;
                                    var2_3 = Integer.reverse(Integer.reverse(1142647198 + var1_2));
                                    ++var3_1;
                                    continue;
                                }
                                (Integer.rotateRight(-166531969 ^ var1_2, 17) - -794279268) * -166531969;
                                var2_3 = (int)((long)(668129944 + var1_2) ^ 4281148861005390025L ^ 4281148861005390025L);
                                (Integer.rotateRight(-1158718625 ^ var1_2, 10) - -1487294532) * -1158718625;
                                (int)(-3655482535833191391L ^ (long)var1_2 ^ -4507981479650511013L);
                                var2_3 = Integer.reverse(Integer.reverse(1142647198 + var1_2));
                                continue;
                            }
                            (Integer.rotateLeft(291481168 ^ var1_2, 5) + 519226091) * 291481169;
                            try {
                                var3_1 += 4;
                                var2_3 = 1142647198 + var1_2;
                            }
                            catch (UnsupportedOperationException v1) {
                                var2_3 = 1142647198 + var1_2 + 1003998295 - 1003998295;
                            }
                            --var3_1;
                            continue;
                        }
                        (Integer.rotateRight(-955664006 ^ var1_2, 11) + 512431361) * -955664005;
                        try {
                            var3_1 += 4;
                            if ((7528058199102618751L ^ (long)var1_2 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            var2_3 = 1142647198 + var1_2;
                        }
                        catch (NoSuchElementException v2) {
                            var2_3 = 1142647198 + var1_2;
                        }
                        var3_1 += 3;
                        continue;
                    }
                    Integer.rotateRight(1089470375 ^ var1_2, 11) - -512912268;
                    try {
                        var3_1 += 5;
                        if ((-4119249557849253749L ^ (long)var1_2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var2_3 = 1142647198 + var1_2;
                    }
                    catch (UnsupportedOperationException v3) {
                        var2_3 = 1142647198 + var1_2;
                    }
                    continue;
                }
                Integer.rotateLeft(2040637924 ^ var1_2, 18) - -1091489321;
                var2_3 = -776165173 + var1_2;
                (Integer.rotateRight(1132772575 ^ var1_2, 11) - 829455932) * 1132772575;
                (int)(-538567467070149622L ^ (long)var1_2 ^ -4464413219197133604L);
                var2_3 = 1921341955 + var1_2 + 344792016 - 344792016;
                (int)(3812916278316185168L ^ (long)var1_2 ^ -7260292854410918907L);
                var2_3 = 1142647198 + var1_2;
                var3_1 -= 4;
                continue;
            }
            (Integer.rotateLeft(1657939124 ^ var1_2, 15) - -70250233) * 1657939125;
            var2_3 = (int)((long)(-1544474531 + var1_2) ^ 5814325827208261734L ^ 5814325827208261734L);
            (Integer.rotateLeft(1768224848 ^ var1_2, 16) + -946360085) * 1768224849;
            try {
                var3_1 -= 2;
                var2_3 = 1142647198 + var1_2;
            }
            catch (NoSuchElementException v4) {
                var2_3 = 1142647198 + var1_2;
            }
            continue;
lbl205:
            // 8 sources

            (Integer.rotateLeft(-1991586311 ^ var1_2, 4) + -1536389022) * -1991586311;
            (int)(5474235041201843023L ^ (long)var1_2 ^ 4249290396883565089L);
            var2_3 = Integer.reverse(Integer.reverse(1142647198 + var1_2));
        }
    }

    public boolean khqq() {
        block0: {
            int n = tsl.dla_3(-578884761);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x38AC0CB7;
            if ((n2 ^ n) == 950799543) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xE5D2E7D0 ^ n, 15) + -655904405) * -439162927;
        }
        return ad.sdd(this.daq, "Ping");
    }

    public boolean ghkhgh() {
        block0: {
            int n = tsl.dla_3(114643568);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
            int n2 = n ^ 0x1D3A2BB3;
            if ((n2 ^ n) == 490351539) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x1BEF79C3 ^ n, 6) + 1717394904;
        }
        return this.daq.tzn_3("Effects");
    }

    public boolean khsa_3() {
        int n;
        block1: {
            int n2 = 1817016728;
            n2 = Integer.rotateLeft(n2 * 1620809325, 22) ^ 0x79558EB0;
            n2 = System.identityHashCode(this) ^ n2;
            int n3 = n2 ^ 0x9B60BF74;
            if ((n3 ^ n2) != -1688158348) {
                int cfr_ignored_0 = (0xF72DC6EC ^ n2) + 1232455623;
            }
            n = ad.dqh_3(this.daq, ad.szj_2("邠ℿ薋嘡", ad.dhagh(1382175935) ^ 0xDB618ADD, 0xFE9F2CAB ^ 0x1191BC00, Integer.rotateLeft(0x431C4F0C ^ 0x40FB8CF0, 3)));
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x813E;
        }
        return n != 0;
    }

    public boolean dhghh() {
        block0: {
            int n = tsl.dla_3(-158205742);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 22);
            int n2 = n ^ 0xC564D7FD;
            if ((n2 ^ n) == -983246851) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x33F52F2F ^ n, 9) - 1326339564;
        }
        return this.daq.tzn_3("Hand Items");
    }

    public boolean zshw() {
        block0: {
            int n = -983399259;
            n = Integer.rotateLeft(n * -1790599251, 26) ^ 0x428AAA28;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x981FCB7C;
            if ((n2 ^ n) == -1742746756) break block0;
            int cfr_ignored_0 = (0x5D7D4FD9 ^ n) - 1035537012;
        }
        return this.daq.tzn_3("Enchants");
    }

    public boolean zaw_4() {
        try {
            int n = 1111038698;
            n = Integer.rotateLeft(n * 1139399409, 3) ^ 0x97AD4B;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xFE082F10;
            if ((n2 ^ n) != -33018096) {
                int cfr_ignored_0 = (0xBC3135FA ^ n) + 1983992132;
            }
            if ((0x357 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return ad.khghh(this.daq, "Speci".concat("al Item"));
    }

    public boolean thj_5() {
        block0: {
            int n = tsl.dla_3(-1737108014);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 20);
            int n2 = n ^ 0xFCD87D43;
            if ((n2 ^ n) == -52921021) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x64ADA891 ^ n, 15) + 895813834) * 1689102481;
            int cfr_ignored_1 = (int)(0xA61F06AC27D4EB4FL ^ (long)n ^ 0xF028831A2DB8E1EFL);
        }
        return this.rnz.tzn_3("Items");
    }

    public boolean tthdh() {
        block0: {
            int n = -485954226;
            n = Integer.rotateLeft(n * 702293265, 23) ^ 0x2961985;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 18);
            int n2 = n ^ 0x5A77E3DF;
            if ((n2 ^ n) == 1517806559) break block0;
            int cfr_ignored_0 = (0xB97F0E91 ^ n) + -1383915070;
        }
        return this.dhtw_2.hdh();
    }

    public boolean dkn_2() {
        return this.zzy_2.hdh();
    }

    public boolean stha_4() {
        block0: {
            int n = 1204224982;
            n = Integer.rotateLeft(n * 449157857, 5) ^ 0x35072E48;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xC811C2AA;
            if ((n2 ^ n) == -938360150) break block0;
            int cfr_ignored_0 = (0x8FD6C17C ^ n) + -537240974;
        }
        return this.znd_2.hdh();
    }

    public float dfs_3() {
        block0: {
            int n = -664795143;
            n = Integer.rotateLeft(n * 309971911, 25) ^ 0x3E05FF96;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xD431E586;
            if ((n2 ^ n) == -734927482) break block0;
            int cfr_ignored_0 = (0xC51E27F ^ n) - 1083413185;
        }
        return ad.zfr(this.dhts);
    }

    public float hkhkh() {
        block0: {
            int n = -1558224922;
            n = Integer.rotateLeft(n * -1770656747, 22) ^ 0x7C75D84D;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x2968001A;
            if ((n2 ^ n) == 694681626) break block0;
            int cfr_ignored_0 = (0x8A775FFC ^ n) - -1390941899;
        }
        return this.dhtha_2.thw_5();
    }

    public List thq() {
        int n = -1160947230;
        n = Integer.rotateLeft(n * 1844868881, 14) ^ 0xBD004D69;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x1B255F6B;
        if ((n2 ^ n) != 455434091) {
            int cfr_ignored_0 = (0xA1E80689 ^ n) - -706103231;
        }
        return new ArrayList();
    }

    public Color shhth() {
        int n = 0;
        int n2 = -176732841;
        n2 = Integer.rotateLeft(n2 * 2099679093, 16) ^ 0xE5B978E1;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 22);
        int n3 = 454452828 * -686158615 + -1357164262 ^ n2;
        block21: while (true) {
            switch (((n3 ^ n2) - -1357164262) * 1511492441) {
                case -1330782268: {
                    int cfr_ignored_0 = Integer.rotateRight(0xF24B5CC7 ^ n2, 17) - 1534974804;
                    return new Color(this.rzm_2.sdsh_4().rk(), true);
                }
                case 454452828: {
                    int cfr_ignored_1 = Integer.rotateLeft(0x4C8EA4C ^ n2, 3) - -1733165457;
                    if (!yf.khdha_2()) {
                        n3 = (int)((long)(-412516080 * -686158615 + -1357164262 ^ n2) ^ 0xDE928F141FFCCCF2L ^ 0xDE928F141FFCCCF2L);
                        int cfr_ignored_2 = Integer.rotateLeft(0x73D46EAC ^ n2, 17) - 186058255;
                        n3 = (int)((long)(1958672812 * -686158615 + -1357164262 ^ n2) ^ 0x6365E48ED54B19CEL ^ 0x6365E48ED54B19CEL);
                        n += 5;
                        continue block21;
                    }
                    try {
                        --n;
                        if ((0x959DC0A9F833DBBBL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (-1330782268 * -686158615 + -1357164262 ^ n2) + 1637834791 - 1637834791;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (-1330782268 * -686158615 + -1357164262 ^ n2) + 1246464462 - 1246464462;
                    }
                    continue block21;
                }
                case 1958672812: {
                    int cfr_ignored_3 = (Integer.rotateRight(0xC671F3BE ^ n2, 11) - 204088125) * -965610561;
                    yf.athz_2();
                    n3 = (int)((long)(-1330782268 * -686158615 + -1357164262 ^ n2) ^ 0x41734BE0E5059D57L ^ 0x41734BE0E5059D57L);
                    int cfr_ignored_4 = (Integer.rotateRight(0x53F6A3DB ^ n2, 13) + 792426176) * 1408672731;
                    --n;
                    continue block21;
                }
                case 325122364: {
                    int cfr_ignored_5 = Integer.rotateLeft(0xE1873288 ^ n2, 15) + 1404878259;
                    n3 = (232286040 * -686158615 + -1357164262 ^ n2) + 1663230077 - 1663230077;
                    int cfr_ignored_6 = Integer.rotateLeft(0xAD1F7501 ^ n2, 8) + -80950694;
                    int cfr_ignored_7 = (int)(0x6FADDB3C27D4EB4FL ^ (long)n2 ^ 0x4B08831A2DB9728AL);
                    try {
                        n -= 2;
                        if ((0x5B544A9F6AFCE31FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (454452828 * -686158615 + -1357164262 ^ n2) + -911262334 - -911262334;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)(454452828 * -686158615 + -1357164262 ^ n2) ^ 0x3B9537D999D8FF99L ^ 0x3B9537D999D8FF99L);
                    }
                    ++n;
                    continue block21;
                }
                case 1204250858: {
                    int cfr_ignored_8 = (Integer.rotateLeft(0x1CA77DFC ^ n2, 6) - 2091245759) * 480738813;
                    n3 = (int)((long)(-1992219852 * -686158615 + -1357164262 ^ n2) ^ 0xA9B024A69E057F16L ^ 0xA9B024A69E057F16L);
                    int cfr_ignored_9 = (Integer.rotateRight(0x30A736BA ^ n2, 9) + -392347711) * 816264891;
                    n3 = 46681747 * -686158615 + -1357164262 ^ n2 ^ 0xC34CEF3F ^ 0xC34CEF3F;
                    int cfr_ignored_10 = Integer.rotateRight(0xD72AB0A ^ n2, 4) + -1522510479;
                    n3 = 454452828 * -686158615 + -1357164262 ^ n2 ^ 0x85CF0A83 ^ 0x85CF0A83;
                    n -= 2;
                    continue block21;
                }
                case -1759843188: {
                    int cfr_ignored_11 = (Integer.rotateLeft(0xBB22E778 ^ n2, 10) + -1382570301) * -1155340423;
                    n3 = (-121538572 * -686158615 + -1357164262 ^ n2) + -1261794195 - -1261794195;
                    int cfr_ignored_12 = Integer.rotateRight(0x6F4F326E ^ n2, 16) - 2129967757;
                    int cfr_ignored_13 = (int)(0x97EB4911204F6459L ^ (long)n2 ^ 0x6F528C2D33948207L);
                    n3 = (int)((long)(-503275330 * -686158615 + -1357164262 ^ n2) ^ 0x4DC92F33975CCAB0L ^ 0x4DC92F33975CCAB0L);
                    int cfr_ignored_14 = (int)(0xB6820F1920D593D5L ^ (long)n2 ^ 0xE3428D18DC8CC0D5L);
                    n3 = (int)((long)(454452828 * -686158615 + -1357164262 ^ n2) ^ 0x569BAF893275CA10L ^ 0x569BAF893275CA10L);
                    --n;
                    continue block21;
                }
                case -1023854060: {
                    int cfr_ignored_15 = Integer.rotateRight(0xE5D3DCC2 ^ n2, 15) + -653960519;
                    try {
                        n -= 4;
                        if ((0xAB93E0FAC0FEF0C3L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = 454452828 * -686158615 + -1357164262 ^ n2;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = Integer.reverse(Integer.reverse(454452828 * -686158615 + -1357164262 ^ n2));
                    }
                    n += 2;
                    continue block21;
                }
                case -437351033: {
                    int cfr_ignored_16 = Integer.rotateRight(0x14065D86 ^ n2, 5) - 1898115701;
                    n3 = -179909556 * -686158615 + -1357164262 ^ n2 ^ 0xDA7B68A4 ^ 0xDA7B68A4;
                    int cfr_ignored_17 = (Integer.rotateLeft(0x4B797EB4 ^ n2, 12) - 672397063) * 1266253493;
                    n3 = Integer.reverse(Integer.reverse(454452828 * -686158615 + -1357164262 ^ n2));
                    n += 2;
                    continue block21;
                }
                case 1673869967: {
                    int cfr_ignored_18 = Integer.rotateLeft(0x3154976D ^ n2, 9) - -40110738;
                    int cfr_ignored_19 = (int)(0xF3E6395027D4EB4FL ^ (long)n2 ^ 0x8FD0831A2DB84A1DL);
                    n3 = 627313104 * -686158615 + -1357164262 ^ n2;
                    int cfr_ignored_20 = (Integer.rotateRight(0xA64D4D1F ^ n2, 7) - 666498556) * -1504883425;
                    n3 = Integer.reverse(Integer.reverse(262384125 * -686158615 + -1357164262 ^ n2));
                    int cfr_ignored_21 = Integer.rotateRight(0x933E02EF ^ n2, 5) - -656410068;
                    n3 = (int)((long)(454452828 * -686158615 + -1357164262 ^ n2) ^ 0x7F5328FBDEA21B40L ^ 0x7F5328FBDEA21B40L);
                    n += 2;
                    continue block21;
                }
                case -281130908: {
                    int cfr_ignored_22 = Integer.rotateRight(0xE2470BCA ^ n2, 15) + 1794641073;
                    n3 = (int)((long)(1819217023 * -686158615 + -1357164262 ^ n2) ^ 0xCA9CC98880C117E2L ^ 0xCA9CC98880C117E2L);
                    int cfr_ignored_23 = Integer.rotateRight(0xF441C5AE ^ n2, 17) - -1739288755;
                    n3 = (454452828 * -686158615 + -1357164262 ^ n2) + -516337039 - -516337039;
                    int cfr_ignored_24 = (Integer.rotateLeft(0xDD8A4F1C ^ n2, 14) - -669174881) * -578138339;
                    n -= 2;
                    continue block21;
                }
                case -1781789315: {
                    int cfr_ignored_25 = Integer.rotateRight(0x408D69AE ^ n2, 11) - -713200819;
                    n3 = (int)((long)(-82026963 * -686158615 + -1357164262 ^ n2) ^ 0xC7FB036B93AAFB53L ^ 0xC7FB036B93AAFB53L);
                    int cfr_ignored_26 = (Integer.rotateLeft(0x6C96FBF4 ^ n2, 16) - 715530695) * 1821834229;
                    n3 = 779284735 * -686158615 + -1357164262 ^ n2;
                    int cfr_ignored_27 = (Integer.rotateLeft(0x5AFCA8D4 ^ n2, 14) - 150343911) * 1526507733;
                    n3 = Integer.reverse(Integer.reverse(454452828 * -686158615 + -1357164262 ^ n2));
                    n += 2;
                    continue block21;
                }
                case -164369275: {
                    int cfr_ignored_28 = (Integer.rotateLeft(0xDD0FE570 ^ n2, 14) + -917870645) * -586160783;
                    n3 = -813744566 * -686158615 + -1357164262 ^ n2;
                    int cfr_ignored_29 = Integer.rotateRight(0xC39CEB6F ^ n2, 11) - -1268899412;
                    n3 = (int)((long)(454452828 * -686158615 + -1357164262 ^ n2) ^ 0x1C696C13090AE1BEL ^ 0x1C696C13090AE1BEL);
                    n += 2;
                    continue block21;
                }
                case -1972179744: {
                    int cfr_ignored_30 = (Integer.rotateLeft(0xE06C70B5 ^ n2, 15) - 830424358) * -529764171;
                    int cfr_ignored_31 = (int)(0x22DEDE8827D4EB4FL ^ (long)n2 ^ 0x4060831A2DB9E86CL);
                    n3 = (-1015459235 * -686158615 + -1357164262 ^ n2) + -905755327 - -905755327;
                    int cfr_ignored_32 = Integer.rotateLeft(0xBFF62AE1 ^ n2, 10) + 1127010426;
                    int cfr_ignored_33 = (int)(0x7D4484DC27D4EB4FL ^ (long)n2 ^ 0xF4C8831A2DB95758L);
                    n3 = -308360330 * -686158615 + -1357164262 ^ n2 ^ 0xFB81837B ^ 0xFB81837B;
                    int cfr_ignored_34 = Integer.rotateRight(0x457D3E87 ^ n2, 11) - 1854419348;
                    n3 = Integer.reverse(Integer.reverse(454452828 * -686158615 + -1357164262 ^ n2));
                    n -= 3;
                    continue block21;
                }
            }
            int cfr_ignored_35 = Integer.rotateLeft(0x81031A40 ^ n2, 3) + -1547842309;
            n3 = (454452828 * -686158615 + -1357164262 ^ n2) + 1003449950 - 1003449950;
        }
    }

    public Color q() {
        int n = tsl.dla_3(1053429663);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 19);
        int n2 = n ^ 0x52BF7922;
        if ((n2 ^ n) != 1388280098) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x6C7576BD ^ n, 16) - 647430174) * 1819637437;
            int cfr_ignored_1 = (int)(0xAEC7D88027D4EB4FL ^ (long)n ^ 0x4C70831A2DB8F05EL);
        }
        return new Color(ad.dlgh_2(ad.bat_4(this.rhkh)), true);
    }

    public Color thdhn() {
        int n = 2047749250;
        int n2 = (n = Integer.rotateLeft(n * -535645167, 13) ^ 0x9EB75534) ^ 0x1B88A019;
        if ((n2 ^ n) != 461938713) {
            int cfr_ignored_0 = (0x61868C9B ^ n) - 652316199;
        }
        return new Color(ad.khny(this.rts_2.sdsh_4()), true);
    }

    private void hsz_4(hz_2 hz2_2) {
        int n = 0;
        int n2 = 939306529;
        n2 = Integer.rotateLeft(n2 * 825227695, 10) ^ 0x1D3224D0;
        hz_2 hz3 = hz2_2;
        n2 = (hz3 != null ? System.identityHashCode(hz3) : 0) ^ n2;
        int n3 = Integer.reverse(Integer.reverse(n2 - 491728492));
        while (true) {
            block29: {
                block47: {
                    block41: {
                        block48: {
                            block33: {
                                block36: {
                                    block46: {
                                        block37: {
                                            block49: {
                                                block40: {
                                                    block45: {
                                                        block31: {
                                                            block27: {
                                                                block35: {
                                                                    block34: {
                                                                        block30: {
                                                                            block43: {
                                                                                block28: {
                                                                                    block42: {
                                                                                        block44: {
                                                                                            block38: {
                                                                                                block39: {
                                                                                                    block24: {
                                                                                                        block32: {
                                                                                                            block25: {
                                                                                                                block26: {
                                                                                                                    if ((n = n2 - n3) > -1014859295) break block24;
                                                                                                                    if (n > -1798235675) break block25;
                                                                                                                    if (n > -1904548085) break block26;
                                                                                                                    if (n == -2044113499) break block27;
                                                                                                                    if (n == -1904548085) break block28;
                                                                                                                    int cfr_ignored_0 = (Integer.rotateLeft(0xD9DD99D4 ^ n2, 14) - 1714634727) * -639788587;
                                                                                                                    break block29;
                                                                                                                }
                                                                                                                if (n == -1825622917) break block30;
                                                                                                                if (n == -1798235675) break block31;
                                                                                                                break block29;
                                                                                                            }
                                                                                                            if (n > -1070444635) break block32;
                                                                                                            if (n == -1122646711) break block33;
                                                                                                            if (n == -1070444635) break block34;
                                                                                                            break block29;
                                                                                                        }
                                                                                                        if (n == -1052723963) break block35;
                                                                                                        if (n == -1019617045) break block36;
                                                                                                        int cfr_ignored_1 = Integer.rotateRight(0x1646BB2B ^ n2, 5) + -1225897616;
                                                                                                        if (n == -1014859295) break block37;
                                                                                                        break block29;
                                                                                                    }
                                                                                                    if (n > 491728492) break block38;
                                                                                                    if (n > -491827306) break block39;
                                                                                                    if (n == -786562624) break block40;
                                                                                                    if (n == -491827306) break block41;
                                                                                                    break block29;
                                                                                                }
                                                                                                if (n == -208678955) break block42;
                                                                                                if (n == 491728492) break block43;
                                                                                                break block29;
                                                                                            }
                                                                                            if (n > 794271172) break block44;
                                                                                            if (n == 553979882) break block45;
                                                                                            if (n == 794271172) break block46;
                                                                                            int cfr_ignored_2 = (Integer.rotateLeft(0x44A2BE79 ^ n2, 11) + 1410510818) * 1151516281;
                                                                                            int cfr_ignored_3 = (int)(0x8610104427D4EB4FL ^ (long)n2 ^ 0xDDF8831A2DB8A1F1L);
                                                                                            break block29;
                                                                                        }
                                                                                        if (n == 1122995800) break block47;
                                                                                        if (n == 1544897903) break block48;
                                                                                        int cfr_ignored_4 = Integer.rotateRight(0x420756AE ^ n2, 11) - 54599245;
                                                                                        if (n == 1748638952) break block49;
                                                                                        break block29;
                                                                                    }
                                                                                    int cfr_ignored_5 = Integer.rotateLeft(0x7C8D5361 ^ n2, 18) + 427472890;
                                                                                    int cfr_ignored_6 = (int)(0xBE3FFD5C27D4EB4FL ^ (long)n2 ^ 0x7C8831A2DB8D1AEL);
                                                                                    return;
                                                                                }
                                                                                int cfr_ignored_7 = (Integer.rotateRight(0x10C78A72 ^ n2, 5) + 210199305) * 281512563;
                                                                                if (!ad.mc.field_1690.field_1842) {
                                                                                    n3 = n2 - -1825622917 ^ 0xF62EDD0 ^ 0xF62EDD0;
                                                                                    n -= 3;
                                                                                    continue;
                                                                                }
                                                                                try {
                                                                                    if ((0x6FF35C3730BE2D8BL ^ (long)n2 | 1L) == 0L) {
                                                                                        throw new IllegalArgumentException();
                                                                                    }
                                                                                    n3 = n2 - -208678955 + -389889835 - -389889835;
                                                                                }
                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                    n3 = (int)((long)(n2 - -208678955) ^ 0x5F9718E44F727DD5L ^ 0x5F9718E44F727DD5L);
                                                                                }
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_8 = (Integer.rotateLeft(0x718435F5 ^ n2, 17) - -1017108506) * 1904489973;
                                                                            int cfr_ignored_9 = (int)(0xB3369BC827D4EB4FL ^ (long)n2 ^ 0xCAE0831A2DB8CBBCL);
                                                                            if (!yf.khdha_2()) {
                                                                                try {
                                                                                    n += 2;
                                                                                    if ((0x5F05EF9E739C9475L ^ (long)n2 | 1L) == 0L) {
                                                                                        throw new IllegalStateException();
                                                                                    }
                                                                                    n3 = Integer.reverse(Integer.reverse(n2 - -1070444635));
                                                                                }
                                                                                catch (IllegalStateException illegalStateException) {
                                                                                    n3 = n2 - -1070444635 + 9761451 - 9761451;
                                                                                }
                                                                                --n;
                                                                                continue;
                                                                            }
                                                                            n3 = n2 - 350632696 + -193591504 - -193591504;
                                                                            int cfr_ignored_10 = (Integer.rotateLeft(0x79774299 ^ n2, 18) + -1177636926) * 2037858969;
                                                                            int cfr_ignored_11 = (int)(0xBBC5ECA427D4EB4FL ^ (long)n2 ^ 0x2438831A2DB8DA5AL);
                                                                            n3 = n2 - -1904548085;
                                                                            ++n;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_12 = (Integer.rotateLeft(0xB37A74F8 ^ n2, 9) + -1070479037) * -1283820295;
                                                                        this.dhtl_2.jghn(hz2_2.sdm_3(), hz2_2.jzsh_2());
                                                                        return;
                                                                    }
                                                                    int cfr_ignored_13 = (Integer.rotateRight(0xA49305D3 ^ n2, 7) + -232041528) * -1533868589;
                                                                    yf.athz_2();
                                                                    throw null;
                                                                }
                                                                int cfr_ignored_14 = (Integer.rotateRight(0xFCA675FF ^ n2, 18) - -1668945636) * -56199681;
                                                                n3 = n2 - 423902201 + 1933819177 - 1933819177;
                                                                int cfr_ignored_15 = Integer.rotateRight(0x3885A083 ^ n2, 10) + -594800872;
                                                                n3 = n2 - 491728492 + 1612917995 - 1612917995;
                                                                continue;
                                                            }
                                                            int cfr_ignored_16 = Integer.rotateRight(0xB9CAC46B ^ n2, 10) + -2081724368;
                                                            n3 = n2 - -297639359 + 1152564500 - 1152564500;
                                                            int cfr_ignored_17 = Integer.rotateRight(0x3D34D4B ^ n2, 3) + 2062809936;
                                                            n3 = n2 - 491728492 + 1394630823 - 1394630823;
                                                            int cfr_ignored_18 = (Integer.rotateRight(0x39E19F6 ^ n2, 3) - 1954726917) * 60692983;
                                                            n -= 4;
                                                            continue;
                                                        }
                                                        int cfr_ignored_19 = Integer.rotateLeft(0xB30E864D ^ n2, 9) - -1289756018;
                                                        int cfr_ignored_20 = (int)(0x71BC287027D4EB4FL ^ (long)n2 ^ 0xAD90831A2DB94EA9L);
                                                        try {
                                                            ++n;
                                                            n3 = (int)((long)(n2 - 491728492) ^ 0x1BFBEF1818E1FA47L ^ 0x1BFBEF1818E1FA47L);
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            n3 = Integer.reverse(Integer.reverse(n2 - 491728492));
                                                        }
                                                        ++n;
                                                        continue;
                                                    }
                                                    int cfr_ignored_21 = (Integer.rotateLeft(0x9DA5450 ^ n2, 4) + 902681835) * 165303377;
                                                    try {
                                                        n -= 3;
                                                        if ((0x17F34887BC670833L ^ (long)n2 | 1L) == 0L) {
                                                            throw new NoSuchElementException();
                                                        }
                                                        n3 = Integer.reverse(Integer.reverse(n2 - 491728492));
                                                    }
                                                    catch (NoSuchElementException noSuchElementException) {
                                                        n3 = (int)((long)(n2 - 491728492) ^ 0x6D85751E0873732EL ^ 0x6D85751E0873732EL);
                                                    }
                                                    --n;
                                                    continue;
                                                }
                                                int cfr_ignored_22 = (Integer.rotateRight(0x5E37FD52 ^ n2, 14) + 1831160873) * 1580727635;
                                                try {
                                                    n3 = n2 - 491728492 + 582105633 - 582105633;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    n3 = (int)((long)(n2 - 491728492) ^ 0xA5200F65130CF783L ^ 0xA5200F65130CF783L);
                                                }
                                                continue;
                                            }
                                            int cfr_ignored_23 = Integer.rotateRight(0xC9CB0082 ^ n2, 12) + 1945284345;
                                            n3 = n2 - 491728492;
                                            n += 3;
                                            continue;
                                        }
                                        int cfr_ignored_24 = (Integer.rotateLeft(0x493D5CF5 ^ n2, 12) - -489955098) * 1228758261;
                                        int cfr_ignored_25 = (int)(0x8B8FF2C827D4EB4FL ^ (long)n2 ^ 0x18E0831A2DB8BACEL);
                                        n3 = n2 - 491728492 ^ 0x34B8D13 ^ 0x34B8D13;
                                        int cfr_ignored_26 = (Integer.rotateLeft(0x87F3F4FC ^ n2, 3) - 2062043583) * -2014055171;
                                        n -= 5;
                                        continue;
                                    }
                                    int cfr_ignored_27 = (Integer.rotateLeft(0xE18E60B8 ^ n2, 15) + 1419466115) * -510762823;
                                    try {
                                        n3 = (int)((long)(n2 - 491728492) ^ 0xAFFD374E7A30BEE1L ^ 0xAFFD374E7A30BEE1L);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        n3 = n2 - 491728492 + -2057335300 - -2057335300;
                                    }
                                    n += 2;
                                    continue;
                                }
                                int cfr_ignored_28 = Integer.rotateRight(0x7AB5B5E2 ^ n2, 18) + -530668135;
                                n3 = n2 - 1811276262;
                                int cfr_ignored_29 = Integer.rotateRight(0xDFA8EEEA ^ n2, 14) + 433229201;
                                n3 = n2 - 491728492 ^ 0x897FAF29 ^ 0x897FAF29;
                                int cfr_ignored_30 = (Integer.rotateLeft(0xDDC48435 ^ n2, 14) - -550919770) * -574323659;
                                int cfr_ignored_31 = (int)(0x1F762A0827D4EB4FL ^ (long)n2 ^ 0xA960831A2DB9933DL);
                                continue;
                            }
                            int cfr_ignored_32 = Integer.rotateRight(0x2CA6B567 ^ n2, 8) - 1821218484;
                            try {
                                n -= 4;
                                if ((0xFDB6532EBDC9C9A5L ^ (long)n2 | 1L) == 0L) {
                                    throw new IllegalArgumentException();
                                }
                                n3 = Integer.reverse(Integer.reverse(n2 - 491728492));
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                n3 = n2 - 491728492;
                            }
                            continue;
                        }
                        int cfr_ignored_33 = (Integer.rotateLeft(0x57555FDC ^ n2, 13) - -1749796129) * 1465212893;
                        int cfr_ignored_34 = (int)(0xC0CDC357B63E90ECL ^ (long)n2 ^ 0x7BDFA0CEDAFE2C4AL);
                        n3 = n2 - 1108365517 + -1242808962 - -1242808962;
                        int cfr_ignored_35 = (int)(0xDFCAF67EC46AE9C1L ^ (long)n2 ^ 0x118D446628A41244L);
                        n3 = n2 - 491728492;
                        ++n;
                        continue;
                    }
                    int cfr_ignored_36 = (Integer.rotateLeft(0x9F4E1419 ^ n2, 6) + 1322389058) * -1622272999;
                    int cfr_ignored_37 = (int)(0x5DFCBA2427D4EB4FL ^ (long)n2 ^ 0x8938831A2DB91628L);
                    n3 = n2 - 1806497439;
                    int cfr_ignored_38 = Integer.rotateLeft(0xF0CF8E9 ^ n2, 4) + -688929934;
                    int cfr_ignored_39 = (int)(0xCDBE56D427D4EB4FL ^ (long)n2 ^ 0x50D8831A2DB836ADL);
                    n3 = Integer.reverse(Integer.reverse(n2 - -2028400041));
                    int cfr_ignored_40 = (Integer.rotateLeft(0xB01FBD1 ^ n2, 4) + 1503337866) * 184679377;
                    int cfr_ignored_41 = (int)(0xC9B355EC27D4EB4FL ^ (long)n2 ^ 0x56A8831A2DB83EB7L);
                    n3 = n2 - 491728492 + 932172433 - 932172433;
                    continue;
                }
                int cfr_ignored_42 = (Integer.rotateRight(0x4E34625A ^ n2, 12) + 2092271649) * 1312055899;
                n3 = (int)((long)(n2 - 1943492826) ^ 0xCD39E071010F1A68L ^ 0xCD39E071010F1A68L);
                int cfr_ignored_43 = (Integer.rotateRight(0x63226BE ^ n2, 3) - -999272387) * 103950015;
                try {
                    n -= 2;
                    if ((0xD36D26D15F9F73C7L ^ (long)n2 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    n3 = Integer.reverse(Integer.reverse(n2 - 491728492));
                }
                catch (IllegalStateException illegalStateException) {
                    n3 = n2 - 491728492;
                }
                n -= 2;
                continue;
            }
            int cfr_ignored_44 = Integer.rotateLeft(0xCCA28A0C ^ n2, 12) - -871606609;
            n3 = Integer.reverse(Integer.reverse(n2 - 491728492));
        }
    }

    private static boolean sny_2() {
        block0: {
            int n = 967270478;
            int n2 = (n = Integer.rotateLeft(n * -1626115029, 3) ^ 0xB96CDA49) ^ 0x21B37AA4;
            if ((n2 ^ n) == 565410468) break block0;
            int cfr_ignored_0 = (0x18141AEA ^ n) + -244745320;
        }
        return true;
    }

    private static boolean dhhh_2() {
        block0: {
            int n = tsl.dla_3(-1108789229);
            int n2 = n ^ 0xAF8DDCD9;
            if ((n2 ^ n) == -1349657383) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x1264E4CA ^ n, 5) + 1049973681;
        }
        return true;
    }

    private static boolean djh() {
        block0: {
            int n = -1822873704;
            int n2 = (n = Integer.rotateLeft(n * 1524400739, 20) ^ 0xF363A433) ^ 0x2DA83866;
            if ((n2 ^ n) == 765999206) break block0;
            int cfr_ignored_0 = (0xBEF11FFE ^ n) - 935240578;
        }
        return true;
    }

    private static String szj_2(String string, int n, int n2, int n3) {
        int n4 = 1795806031;
        n4 = Integer.rotateLeft(n4 * 1964523021, 13) ^ 0x6F8A42CC;
        int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 11)) ^ 0x276F971B;
        if ((n5 ^ n4) != 661624603) {
            int cfr_ignored_0 = (0x4C664454 ^ n4) - -256235343;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x402B5504 ^ n2 ^ i * 1818962087 ^ thsr, 18) ^ rlh));
        }
        return new String(cArray);
    }

    private static kh_3 dhkhh_2(Moondlc moondlc) {
        block0: {
            int n = -186940608;
            int n2 = (n = Integer.rotateLeft(n * -2047476639, 11) ^ 0x51DFB9CE) ^ 0xD3DE1F44;
            if ((n2 ^ n) == -740417724) break block0;
            int cfr_ignored_0 = (0x27059C04 ^ n) + -1020552953;
        }
        return moondlc.getFriendManager();
    }

    private static int thzw(int n, int n2) {
        block0: {
            int n3 = 874849657;
            n3 = Integer.rotateLeft(n3 * -1696359663, 23) ^ 0x6196799F;
            int n4 = (n3 = n2 ^ n3) ^ 0xB3473916;
            if ((n4 ^ n3) == -1287177962) break block0;
            int cfr_ignored_0 = (0x87621C6F ^ n3) + -662252998;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static boolean dbm(bbd_2 bbd2, String string) {
        block0: {
            int n = 1926815266;
            n = Integer.rotateLeft(n * -1450454155, 12) ^ 0xA4F4D932;
            bbd_2 bbd3 = bbd2;
            n = (bbd3 != null ? System.identityHashCode(bbd3) : 0) ^ n;
            int n2 = n ^ 0x422C3E08;
            if ((n2 ^ n) == 1110195720) break block0;
            int cfr_ignored_0 = (0x30F4E02A ^ n) - -333662015;
        }
        return bbd2.tzn_3(string);
    }

    private static int adt_3(int n) {
        block0: {
            int n2 = 1112535747;
            n2 = Integer.rotateLeft(n2 * -828531719, 13) ^ 0x441C6B52;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 5)) ^ 0x8A91F888;
            if ((n3 ^ n2) == -1970145144) break block0;
            int cfr_ignored_0 = (0xC8DE0A4B ^ n2) - 1471812521;
        }
        return Integer.reverse(n);
    }

    private static boolean stl(bbd_2 bbd2, String string) {
        block0: {
            int n = tsl.dla_3(356938291);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xB20FCB9F;
            if ((n2 ^ n) == -1307587681) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xA749B9AC ^ n, 7) - 1179327247;
        }
        return bbd2.tzn_3(string);
    }

    private static String raa_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1689893005;
            n4 = Integer.rotateLeft(n4 * 748204973, 19) ^ 0x257F3F19;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 17)) ^ 0x7DAC4B59;
            if ((n5 ^ n4) == 2108443481) break block0;
            int cfr_ignored_0 = (0x1915F3D4 ^ n4) - -926421584;
        }
        return ad.szj_2(string, n, n2, n3);
    }

    private static String tfw_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -405344412;
            n4 = Integer.rotateLeft(n4 * 1339678267, 26) ^ 0x179B9B;
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 24)) ^ 0x1782C4EE;
            if ((n5 ^ n4) == 394446062) break block0;
            int cfr_ignored_0 = (0xF0542B8A ^ n4) + -1775305014;
        }
        return ad.szj_2(string, n, n2, n3);
    }

    private static boolean sdd(bbd_2 bbd2, String string) {
        block0: {
            int n = 1106897380;
            n = Integer.rotateLeft(n * -1165136351, 25) ^ 0xB53EBADD;
            bbd_2 bbd3 = bbd2;
            n = (bbd3 != null ? System.identityHashCode(bbd3) : 0) ^ n;
            int n2 = n ^ 0x2F675991;
            if ((n2 ^ n) == 795302289) break block0;
            int cfr_ignored_0 = (0x6E9EB075 ^ n) + 791896605;
        }
        return bbd2.tzn_3(string);
    }

    private static int dhagh(int n) {
        block0: {
            int n2 = -445283832;
            n2 = Integer.rotateLeft(n2 * 879136627, 10) ^ 0xB47E60E6;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 5)) ^ 0x8222ED77;
            if ((n3 ^ n2) == -2111640201) break block0;
            int cfr_ignored_0 = (0x67576F7F ^ n2) - 1151678802;
        }
        return Integer.reverse(n);
    }

    private static boolean dqh_3(bbd_2 bbd2, String string) {
        block0: {
            int n = 238118030;
            n = Integer.rotateLeft(n * 883033345, 9) ^ 0x9CF5464;
            bbd_2 bbd3 = bbd2;
            n = (bbd3 != null ? System.identityHashCode(bbd3) : 0) ^ n;
            int n2 = n ^ 0xD6DCCEFC;
            if ((n2 ^ n) == -690172164) break block0;
            int cfr_ignored_0 = (0xD8EDAA72 ^ n) - -673595389;
        }
        return bbd2.tzn_3(string);
    }

    private static String shhn(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1493422230;
            n4 = Integer.rotateLeft(n4 * -1619729973, 22) ^ 0x599B08E6;
            n4 = n ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x8159BB47;
            if ((n5 ^ n4) == -2124825785) break block0;
            int cfr_ignored_0 = (0xD85A6BD1 ^ n4) + -478256289;
        }
        return ad.szj_2(string, n, n2, n3);
    }

    private static boolean khghh(bbd_2 bbd2, String string) {
        block0: {
            int n = tsl.dla_3(756106529);
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 20);
            int n2 = n ^ 0x8877C188;
            if ((n2 ^ n) == -2005417592) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xA56684A9 ^ n, 7) + 197636018;
            int cfr_ignored_1 = (int)(0x67D42A9427D4EB4FL ^ (long)n ^ 0xA858831A2DB96279L);
        }
        return bbd2.tzn_3(string);
    }

    private static float zfr(tay tay2) {
        block0: {
            int n = tsl.dla_3(182259131);
            tay tay3 = tay2;
            n = (tay3 != null ? System.identityHashCode(tay3) : 0) ^ n;
            int n2 = n ^ 0xE4593C54;
            if ((n2 ^ n) == -463913900) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xEE8431EF ^ n, 16) - -429937876;
        }
        return tay2.thw_5();
    }

    private static byq bat_4(bzw_2 bzw2_2) {
        block0: {
            int n = tsl.dla_3(-1436847255);
            bzw_2 bzw3_2 = bzw2_2;
            n = (bzw3_2 != null ? System.identityHashCode(bzw3_2) : 0) ^ n;
            int n2 = n ^ 0x281E842A;
            if ((n2 ^ n) == 673088554) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x8245F743 ^ n, 3) + -891908008;
        }
        return bzw2_2.sdsh_4();
    }

    private static int dlgh_2(byq byq2) {
        block0: {
            int n = -2082892085;
            int n2 = (n = Integer.rotateLeft(n * -990352605, 15) ^ 0x8F2530AE) ^ 0xC4DDDC9B;
            if ((n2 ^ n) == -992093029) break block0;
            int cfr_ignored_0 = (0x47044A50 ^ n) + -1159335216;
        }
        return byq2.rk();
    }

    private static int khny(byq byq2) {
        block0: {
            int n = -1148709174;
            int n2 = (n = Integer.rotateLeft(n * 1612203289, 3) ^ 0xDBADC1D) ^ 0x8DED82FF;
            if ((n2 ^ n) == -1913814273) break block0;
            int cfr_ignored_0 = (0x36659435 ^ n) + 2041103237;
        }
        return byq2.rk();
    }

    private static String[] ahz_2(String string) {
        block0: {
            int n = 2082779037;
            n = Integer.rotateLeft(n * -495421343, 22) ^ 0xCA94B39B;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x319BEE9B;
            if ((n2 ^ n) == 832302747) break block0;
            int cfr_ignored_0 = (0x4DBF4106 ^ n) + 894211162;
        }
        return string.split("\u0001\u0017", -1);
    }

    private static CallSite kgh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1003526105;
            n3 = Integer.rotateLeft(n3 * 1853088859, 8) ^ 0x682DD7ED;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 18);
            int n4 = n3 ^ 0x7047FDEB;
            if ((n4 ^ n3) != 1883766251) {
                int cfr_ignored_0 = (0xB46895CC ^ n3) - 1139957517;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ thh ^ string.hashCode() ^ n2 + jta_3 ^ i * 685104417 ^ thh, 21) ^ jta_3));
            }
            String[] stringArray = ad.ahz_2(new String(cArray));
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

    private static String[] cybx9hfzb37(String string) {
        return string.split("\u0007\u001b", -1);
    }

    private static CallSite raw2ctgtn1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ wokuwdtba8w29 ^ string.hashCode() ^ n2 + hwf4jr4j ^ i * -1997777997 ^ wokuwdtba8w29, 7) ^ hwf4jr4j));
            }
            String[] stringArray = ad.cybx9hfzb37(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

