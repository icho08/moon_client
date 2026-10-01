/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_315
 *  net.minecraft.class_3532
 *  net.minecraft.class_5498
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_315;
import net.minecraft.class_3532;
import net.minecraft.class_5498;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.khth_3;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="FreeLook", category=bzw.OTHER, desc="Look around freely without changing player rotation")
public class bks
extends bnq {
    private static bks szt;
    private final khd jdw_2 = new khd(this, "Perspective");
    private final fy hnkh = new fy(this.jdw_2, "Back");
    private final fy khdb = new fy(this.jdw_2, "Front");
    private final tay ddhkh = new tay(this, "SenseBoost").shth_7(Float.intBitsToFloat(-1101659061 - -2138491010)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x611AE280 ^ 0xADD7DF4C, 16))).ssd_5(1.0f);
    private final badh_2 dmr = new badh_2(this, "No Pi".concat("tch Limit")).bts(false);
    private float tss_2 = 0.0f;
    private float byw = 0.0f;
    private class_5498 dts_2;
    private final bql<btt> hla = this::sfy_2;
    private static final int dghm = 313103667;
    private static final int hmn = 935586335;
    private static final int bs = -856157270;
    private static final int dl = -1844950171;
    private static final int pwj12uzzbzr2p = 103816572;
    private static final int whrsva9p = -975975801;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int g8oyf8jolym7;

    public static bks sla_3() {
        block0: {
            int n = khth_3.shqa_2(1654094160);
            int n2 = n ^ 0x851E9FE6;
            if ((n2 ^ n) == -2061590554) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xE789E6B6 ^ n, 15) - 235966277) * -410392905;
        }
        return szt;
    }

    public bks() {
        szt = this;
    }

    @Override
    public void nt() {
        try {
            int n = 184639175;
            n = Integer.rotateLeft(n * -1571827757, 7) ^ 0x17555281;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xDCC29C79;
            if ((n2 ^ n) != -591225735) {
                int cfr_ignored_0 = (0xD7C3C2BE ^ n) + 174491902;
            }
            if ((0x3BE & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            bks.azz();
            throw null;
        }
        if (bks.mc.field_1724 != null) {
            this.tss_2 = bks.mc.field_1724.method_36454();
            this.byw = bks.azb_2(bks.mc.field_1724);
            this.dts_2 = bks.mc.field_1690.method_31044();
            this.khthn();
        }
    }

    @Override
    public void nc() {
        int n = 0;
        int n2 = -306894825;
        n2 = Integer.rotateLeft(n2 * 1158009723, 8) ^ 0x346A8642;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793 ^ 0x321E3734 ^ 0x321E3734;
        block32: while (true) {
            switch (n3 - 1075258793 ^ 0x401725A9 ^ n2) {
                case -2040440878: {
                    int cfr_ignored_0 = Integer.rotateRight(0x9BB945EB ^ n2, 6) + -540207440;
                    return;
                }
                case 23913669: {
                    int cfr_ignored_1 = (Integer.rotateLeft(0x5E33EEF4 ^ n2, 14) - 1822920391) * 1580461813;
                    if (this.dts_2 != null) {
                        int cfr_ignored_2 = (int)(0xA8CE7820D0E3A62DL ^ (long)n2 ^ 0xD316D74B77CFC4DL);
                        n3 = (n2 ^ 0xD3A1FF77 ^ 0x401725A9) + 1075258793 ^ 0x376D72B7 ^ 0x376D72B7;
                        int cfr_ignored_3 = (int)(0xC6400F102787089BL ^ (long)n2 ^ 0xE35083BDEA102151L);
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0xE00B2887 ^ 0x401725A9) + 1075258793));
                        continue block32;
                    }
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x866157D2 ^ 0x401725A9) + 1075258793));
                    int cfr_ignored_4 = (Integer.rotateRight(0x3B4261D6 ^ n2, 10) - 828864549) * 994206167;
                    n += 4;
                    continue block32;
                }
                case 954054861: {
                    int cfr_ignored_5 = (Integer.rotateRight(0xEA8237F3 ^ n2, 16) + 1780639144) * -360564749;
                    if (bks.dhd_9()) {
                        int cfr_ignored_6 = (int)(0xA7A82942FEB420CEL ^ (long)n2 ^ 0xAFF531DBBABAE281L);
                        n3 = (n2 ^ 0x7E2B3EB0 ^ 0x401725A9) + 1075258793;
                        int cfr_ignored_7 = (int)(0x65FB2071A6AE4164L ^ (long)n2 ^ 0xBD9381EF79EF6627L);
                        n3 = (n2 ^ 0xD1008814 ^ 0x401725A9) + 1075258793 + 1064600813 - 1064600813;
                        continue block32;
                    }
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x10B7EB7 ^ 0x401725A9) + 1075258793));
                    int cfr_ignored_8 = Integer.rotateLeft(0xB46A0284 ^ n2, 9) - -583799497;
                    n3 = (n2 ^ 0x16CE4C5 ^ 0x401725A9) + 1075258793 + -1928304283 - -1928304283;
                    n -= 2;
                    continue block32;
                }
                case -536139641: {
                    int cfr_ignored_9 = (Integer.rotateLeft(0x838624D1 ^ n2, 3) + -241429366) * -2088360751;
                    int cfr_ignored_10 = (int)(0x41348AEC27D4EB4FL ^ (long)n2 ^ 0xE8A8831A2DB92FB8L);
                    bks.tzb(bks.mc.field_1690, this.dts_2);
                    this.dts_2 = null;
                    try {
                        n3 = (n2 ^ 0x866157D2 ^ 0x401725A9) + 1075258793 ^ 0xD4CDD7AC ^ 0xD4CDD7AC;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x866157D2 ^ 0x401725A9) + 1075258793));
                    }
                    n -= 2;
                    continue block32;
                }
                case -788494316: {
                    int cfr_ignored_11 = Integer.rotateLeft(0xFAD6C704 ^ n2, 18) - 1683994807;
                    throw null;
                }
                case 2012966496: {
                    int cfr_ignored_12 = (Integer.rotateLeft(0xB3EECD1D ^ n2, 9) - -834112066) * -1276195555;
                    int cfr_ignored_13 = (int)(0x715C632027D4EB4FL ^ (long)n2 ^ 0x3B30831A2DB94F69L);
                    n3 = (n2 ^ 0xF951E8D0 ^ 0x401725A9) + 1075258793 + 1629890607 - 1629890607;
                    int cfr_ignored_14 = Integer.rotateRight(0x4526442E ^ n2, 11) - 1677713613;
                    n3 = (int)((long)((n2 ^ 0x51D04A4 ^ 0x401725A9) + 1075258793) ^ 0xDF27E7A21253E47DL ^ 0xDF27E7A21253E47DL);
                    int cfr_ignored_15 = (Integer.rotateRight(0x2795F7DB ^ n2, 7) + -813260096) * 664139739;
                    n3 = (n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793;
                    continue block32;
                }
                case 218245089: {
                    int cfr_ignored_16 = Integer.rotateLeft(0xE6218D48 ^ n2, 15) + -496125197;
                    try {
                        if ((0xE1CD04C379D2F607L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (int)((long)((n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793) ^ 0x85418FA0CFCBCD71L ^ 0x85418FA0CFCBCD71L);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793 ^ 0x818D6F18 ^ 0x818D6F18;
                    }
                    n -= 5;
                    continue block32;
                }
                case 1682212412: {
                    int cfr_ignored_17 = (Integer.rotateRight(0x77810AB6 ^ n2, 17) - 2097015621) * 2004945591;
                    n3 = (n2 ^ 0x98C584D0 ^ 0x401725A9) + 1075258793 ^ 0x811F351A ^ 0x811F351A;
                    int cfr_ignored_18 = Integer.rotateRight(0x22F068A2 ^ n2, 7) + 1064979161;
                    n3 = (int)((long)((n2 ^ 0xE988AB35 ^ 0x401725A9) + 1075258793) ^ 0x49696713A8AA5F69L ^ 0x49696713A8AA5F69L);
                    int cfr_ignored_19 = Integer.rotateLeft(0xF03F2A05 ^ n2, 17) - 470005206;
                    int cfr_ignored_20 = (int)(0x328D843827D4EB4FL ^ (long)n2 ^ 0xF500831A2DB9C8CAL);
                    n3 = (n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793 ^ 0x909C2E70 ^ 0x909C2E70;
                    n += 3;
                    continue block32;
                }
                case -265690281: {
                    int cfr_ignored_21 = (Integer.rotateRight(0xFE63FBD7 ^ n2, 18) - -763814332) * -27001897;
                    try {
                        n += 4;
                        n3 = (n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793 ^ 0xCF9FC8E0 ^ 0xCF9FC8E0;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)((n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793) ^ 0x3F69EA7276C34750L ^ 0x3F69EA7276C34750L);
                    }
                    n += 5;
                    continue block32;
                }
                case -131258186: {
                    int cfr_ignored_22 = (Integer.rotateRight(0x1852EAB2 ^ n2, 6) + -160953655) * 408087219;
                    int cfr_ignored_23 = (int)(0xE49697158179086FL ^ (long)n2 ^ 0xD35BCE41EBF864FCL);
                    n3 = (n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793;
                    ++n;
                    continue block32;
                }
                case -1941979283: {
                    int cfr_ignored_24 = Integer.rotateLeft(0xACA5024 ^ n2, 4) - 1390236567;
                    int cfr_ignored_25 = (int)(0x4D6C76209A374AA2L ^ (long)n2 ^ 0x1131F8DD6E633709L);
                    n3 = (int)((long)((n2 ^ 0x2A089CE3 ^ 0x401725A9) + 1075258793) ^ 0xE95912F946433B5AL ^ 0xE95912F946433B5AL);
                    int cfr_ignored_26 = (int)(0x70280AB44F4DA15AL ^ (long)n2 ^ 0xE8185228B9934D81L);
                    n3 = (int)((long)((n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793) ^ 0x8D854EA49A4FD7F8L ^ 0x8D854EA49A4FD7F8L);
                    n -= 2;
                    continue block32;
                }
                case 459013948: {
                    int cfr_ignored_27 = Integer.rotateRight(0x8AAAFC0E ^ n2, 4) - -820894483;
                    n3 = (n2 ^ 0x7991705D ^ 0x401725A9) + 1075258793;
                    int cfr_ignored_28 = Integer.rotateRight(0x24A5E002 ^ n2, 7) + 1953742713;
                    int cfr_ignored_29 = (int)(0xA6A7DC289C6984CBL ^ (long)n2 ^ 0x4521F460F2B0E09EL);
                    n3 = (n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793 + -1365525068 - -1365525068;
                    n += 5;
                    continue block32;
                }
                case 1387938682: {
                    int cfr_ignored_30 = (Integer.rotateLeft(0xEB9B7775 ^ n2, 16) - -1942940058) * -342132875;
                    int cfr_ignored_31 = (int)(0x2929D94827D4EB4FL ^ (long)n2 ^ 0x4FE0831A2DB9FF82L);
                    try {
                        if ((0xD8FC269FB35487CFL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793 + -822801116 - -822801116;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793;
                    }
                    n -= 2;
                    continue block32;
                }
                case -464869811: {
                    int cfr_ignored_32 = (Integer.rotateLeft(0xF0425938 ^ n2, 17) + 476474627) * -264087239;
                    try {
                        n += 5;
                        n3 = (n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793 + 1870501485 - 1870501485;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793;
                    }
                    n -= 3;
                    continue block32;
                }
                case -1812552745: {
                    int cfr_ignored_33 = Integer.rotateLeft(0x9C2264AC ^ n2, 6) - -326643697;
                    n3 = (n2 ^ 0x70357326 ^ 0x401725A9) + 1075258793 ^ 0x8A42E9FB ^ 0x8A42E9FB;
                    int cfr_ignored_34 = Integer.rotateLeft(0xA7CFF80C ^ n2, 7) - 1452058799;
                    n3 = (int)((long)((n2 ^ 0x52A9C1C4 ^ 0x401725A9) + 1075258793) ^ 0xC752331D249D90DL ^ 0xC752331D249D90DL);
                    int cfr_ignored_35 = (Integer.rotateLeft(0xC82929C ^ n2, 4) - -2010292193) * 209883805;
                    n3 = (n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793 ^ 0x79C262D3 ^ 0x79C262D3;
                    --n;
                    continue block32;
                }
                case 817992611: {
                    int cfr_ignored_36 = Integer.rotateLeft(0x599503CC ^ n2, 14) - -580315921;
                    n3 = (n2 ^ 0x62A1A8C ^ 0x401725A9) + 1075258793 + -747347432 - -747347432;
                    int cfr_ignored_37 = Integer.rotateLeft(0x8EFFF804 ^ n2, 4) - 1432135607;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3177D7D0 ^ 0x401725A9) + 1075258793));
                    int cfr_ignored_38 = Integer.rotateLeft(0xFD9BDA08 ^ n2, 18) + -1170405837;
                    n3 = (n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793 ^ 0xDA001857 ^ 0xDA001857;
                    n -= 2;
                    continue block32;
                }
                case -1530940907: {
                    int cfr_ignored_39 = (Integer.rotateRight(0x8F93555F ^ n2, 4) - 1731524028) * -1886169761;
                    n3 = (n2 ^ 0x9B1B318D ^ 0x401725A9) + 1075258793 ^ 0x9F724139 ^ 0x9F724139;
                    int cfr_ignored_40 = (Integer.rotateRight(0xFD2F8BDA ^ n2, 18) + -1390440799) * -47215653;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793));
                    n -= 2;
                    continue block32;
                }
                case -1771299156: {
                    int cfr_ignored_41 = Integer.rotateLeft(0x2650ADA8 ^ n2, 7) + -1474124141;
                    try {
                        --n;
                        n3 = (int)((long)((n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793) ^ 0xCDEBEE10B2497CF9L ^ 0xCDEBEE10B2497CF9L);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793));
                    }
                    n -= 2;
                    continue block32;
                }
            }
            int cfr_ignored_42 = Integer.rotateLeft(0xD2A15780 ^ n2, 13) + -2048444485;
            n3 = (n2 ^ 0x38DDB8CD ^ 0x401725A9) + 1075258793 + -709159497 - -709159497;
        }
    }

    public void das_2(double d, double d2) {
        float f = this.ddhkh.thw_5();
        this.tss_2 += (float)d * 0.15f * f;
        this.byw += (float)d2 * 0.15f * f;
        this.tthl();
    }

    private void tthl() {
        try {
            int n = -1046316111;
            n = Integer.rotateLeft(n * -223444689, 7) ^ 0x5FD920BA;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 19);
            int n2 = n ^ 0x7D7C1B49;
            if ((n2 ^ n) != 2105285449) {
                int cfr_ignored_0 = (0xBCDE60F8 ^ n) - -2073206306;
            }
            if ((0x3CE & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!this.dmr.shzl()) {
            this.byw = class_3532.method_15363((float)this.byw, (float)Float.intBitsToFloat(0xFC4A97AF ^ 0x3EFE97AF), (float)Float.intBitsToFloat(Integer.rotateLeft(0x2D149C8C ^ 0x2D14DE38, 16)));
        }
    }

    private void khthn() {
        int n = -1751506711;
        n = Integer.rotateLeft(n * -1789428467, 15) ^ 0x8BBE570C;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 24);
        int n2 = n ^ 0x8B01F755;
        if ((n2 ^ n) != -1962805419) {
            int cfr_ignored_0 = (0x1C9BD7BC ^ n) - -473480914;
        }
        if (bks.mc.field_1690 == null) {
            return;
        }
        bks.mc.field_1690.method_31043(this.khdb.shghkh() ? class_5498.field_26666 : class_5498.field_26665);
    }

    public float zyj() {
        block0: {
            int n = -569619180;
            n = Integer.rotateLeft(n * 1175490499, 21) ^ 0xAD0C5269;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x34F802FB;
            if ((n2 ^ n) == 888668923) break block0;
            int cfr_ignored_0 = (0xEAF44FEF ^ n) - 1601966377;
        }
        return this.tss_2;
    }

    public float sta_6() {
        block0: {
            int n = khth_3.shqa_2(1074389534);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 20);
            int n2 = n ^ 0x1EDB179B;
            if ((n2 ^ n) == 517674907) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x5ED2F585 ^ n, 14) - 2145999446;
            int cfr_ignored_1 = (int)(0x9C605BB827D4EB4FL ^ (long)n ^ 0x4A00831A2DB89511L);
        }
        return this.byw;
    }

    public boolean ztm_2() {
        block0: {
            int n = 882851646;
            int n2 = (n = Integer.rotateLeft(n * 2059822591, 5) ^ 0x43022F40) ^ 0x764BB2FF;
            if ((n2 ^ n) == 1984672511) break block0;
            int cfr_ignored_0 = (0x42D48DC1 ^ n) + -257551404;
        }
        return this.khdb.shghkh();
    }

    private void sfy_2(btt btt2) {
        int n = 0;
        int n2 = -224129916;
        n2 = Integer.rotateLeft(n2 * 794462317, 8) ^ 0xA891CE4F;
        btt btt3 = btt2;
        n2 = Integer.rotateRight((btt3 != null ? System.identityHashCode(btt3) : 0) ^ n2, 13);
        int n3 = Integer.reverse(Integer.reverse((n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489));
        while (true) {
            block23: {
                block24: {
                    block28: {
                        block44: {
                            block42: {
                                block41: {
                                    block29: {
                                        block25: {
                                            block35: {
                                                block22: {
                                                    block30: {
                                                        block36: {
                                                            block43: {
                                                                block31: {
                                                                    block40: {
                                                                        block37: {
                                                                            block21: {
                                                                                block34: {
                                                                                    block27: {
                                                                                        block38: {
                                                                                            block39: {
                                                                                                block32: {
                                                                                                    block33: {
                                                                                                        block18: {
                                                                                                            block26: {
                                                                                                                block19: {
                                                                                                                    block20: {
                                                                                                                        if ((n = n3 - -463191489 ^ 0xE464423F ^ n2) > -72890845) break block18;
                                                                                                                        if (n > -1749512259) break block19;
                                                                                                                        if (n > -1960340251) break block20;
                                                                                                                        if (n == -1993309799) break block21;
                                                                                                                        if (n == -1960340251) break block22;
                                                                                                                        break block23;
                                                                                                                    }
                                                                                                                    if (n == -1882379873) break block24;
                                                                                                                    if (n == -1749512259) break block25;
                                                                                                                    int cfr_ignored_0 = (Integer.rotateLeft(0xCBB8837C ^ n2, 12) - -1347056833) * -877100163;
                                                                                                                    break block23;
                                                                                                                }
                                                                                                                if (n > -881688659) break block26;
                                                                                                                if (n == -1238851333) break block27;
                                                                                                                if (n == -881688659) break block28;
                                                                                                                break block23;
                                                                                                            }
                                                                                                            if (n == -737989544) break block29;
                                                                                                            if (n == -358660533) break block30;
                                                                                                            int cfr_ignored_1 = Integer.rotateLeft(0x8B490648 ^ n2, 4) + -499817997;
                                                                                                            if (n == -72890845) break block31;
                                                                                                            break block23;
                                                                                                        }
                                                                                                        if (n > 462601509) break block32;
                                                                                                        if (n > 148823835) break block33;
                                                                                                        if (n == 135199575) break block34;
                                                                                                        if (n == 148823835) break block35;
                                                                                                        int cfr_ignored_2 = (Integer.rotateRight(0x1AEEA956 ^ n2, 6) - 1195647141) * 451848535;
                                                                                                        break block23;
                                                                                                    }
                                                                                                    if (n == 163773346) break block36;
                                                                                                    if (n == 458326875) break block37;
                                                                                                    if (n == 462601509) break block38;
                                                                                                    break block23;
                                                                                                }
                                                                                                if (n > 1536152762) break block39;
                                                                                                if (n == 931862825) break block40;
                                                                                                if (n == 1536152762) break block41;
                                                                                                break block23;
                                                                                            }
                                                                                            if (n == 1940090851) break block42;
                                                                                            if (n == 1979398309) break block43;
                                                                                            int cfr_ignored_3 = Integer.rotateRight(0x99BA7902 ^ n2, 6) + -1577957767;
                                                                                            if (n == 2076581891) break block44;
                                                                                            break block23;
                                                                                        }
                                                                                        int cfr_ignored_4 = (Integer.rotateRight(0xC2E62D3 ^ n2, 4) + 2113640136) * 204366547;
                                                                                        yf.athz_2();
                                                                                        throw null;
                                                                                    }
                                                                                    int cfr_ignored_5 = Integer.rotateLeft(0xDB6C6941 ^ n2, 14) + -1770103270;
                                                                                    int cfr_ignored_6 = (int)(0x19DEC77C27D4EB4FL ^ (long)n2 ^ 0x7388831A2DB99E6CL);
                                                                                    return;
                                                                                }
                                                                                int cfr_ignored_7 = Integer.rotateRight(0x70EC5A06 ^ n2, 17) - -1325627915;
                                                                                if (bks.mc.field_1724 != null) {
                                                                                    int cfr_ignored_8 = (int)(0xEB001E8373A1020EL ^ (long)n2 ^ 0xC0762BF1FF3A7BD1L);
                                                                                    n3 = (n2 ^ 0x89308199 ^ 0xE464423F) + -463191489;
                                                                                    n += 4;
                                                                                    continue;
                                                                                }
                                                                                try {
                                                                                    n += 5;
                                                                                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xB628A0FB ^ 0xE464423F) + -463191489));
                                                                                }
                                                                                catch (NoSuchElementException noSuchElementException) {
                                                                                    n3 = (int)((long)((n2 ^ 0xB628A0FB ^ 0xE464423F) + -463191489) ^ 0xF76A270A9D87FCD6L ^ 0xF76A270A9D87FCD6L);
                                                                                }
                                                                                --n;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_9 = (Integer.rotateLeft(0x6DC88EF8 ^ n2, 16) + 1336340291) * 1841860345;
                                                                            this.khthn();
                                                                            this.tthl();
                                                                            return;
                                                                        }
                                                                        int cfr_ignored_10 = (Integer.rotateLeft(0x696F1D59 ^ n2, 16) + -925750014) * 1768889689;
                                                                        int cfr_ignored_11 = (int)(0xABDDB36427D4EB4FL ^ (long)n2 ^ 0x9BB8831A2DB8FA6AL);
                                                                        if (yf.khdha_2()) {
                                                                            try {
                                                                                if ((0xCD9C9F922FE6B30FL ^ (long)n2 | 1L) == 0L) {
                                                                                    throw new NoSuchElementException();
                                                                                }
                                                                                n3 = (n2 ^ 0x80EFB57 ^ 0xE464423F) + -463191489 ^ 0x53B93829 ^ 0x53B93829;
                                                                            }
                                                                            catch (NoSuchElementException noSuchElementException) {
                                                                                n3 = (n2 ^ 0x80EFB57 ^ 0xE464423F) + -463191489 + -329048439 - -329048439;
                                                                            }
                                                                            n += 2;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_12 = (int)(0x813B1A41338268F7L ^ (long)n2 ^ 0xC9F2ABB72AC8AFA7L);
                                                                        n3 = (n2 ^ 0x3FFE3FAF ^ 0xE464423F) + -463191489;
                                                                        int cfr_ignored_13 = (int)(0x6B754D6DBDE2DA62L ^ (long)n2 ^ 0x67ABB7764FE37B3BL);
                                                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x1B92BD25 ^ 0xE464423F) + -463191489));
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_14 = Integer.rotateLeft(0x48648529 ^ n2, 12) + -930496718;
                                                                    int cfr_ignored_15 = (int)(0x8AD62B1427D4EB4FL ^ (long)n2 ^ 0xAB58831A2DB8B87DL);
                                                                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x9A40CD93 ^ 0xE464423F) + -463191489));
                                                                    int cfr_ignored_16 = (Integer.rotateRight(0xAEE6C452 ^ n2, 8) + 844064041) * -1360608173;
                                                                    int cfr_ignored_17 = (int)(0x6A03672702B74C5EL ^ (long)n2 ^ 0x333EC9DD639B79D7L);
                                                                    n3 = (n2 ^ 0xD097FE82 ^ 0xE464423F) + -463191489 + -320175652 - -320175652;
                                                                    int cfr_ignored_18 = (int)(0xBE02B529C25C913FL ^ (long)n2 ^ 0x9723480AD958D1D4L);
                                                                    n3 = (n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489;
                                                                    n -= 2;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_19 = (Integer.rotateRight(0x96CBC76 ^ n2, 4) - 680030597) * 158121079;
                                                                n3 = (int)((long)((n2 ^ 0x11B4C856 ^ 0xE464423F) + -463191489) ^ 0x992E7BF3614D74CEL ^ 0x992E7BF3614D74CEL);
                                                                int cfr_ignored_20 = (Integer.rotateLeft(0xDF0877FC ^ n2, 14) - 107226815) * -553093123;
                                                                try {
                                                                    n3 = (n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489 + -1737565139 - -1737565139;
                                                                }
                                                                catch (ArithmeticException arithmeticException) {
                                                                    n3 = (n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489 + 597709296 - 597709296;
                                                                }
                                                                n += 3;
                                                                continue;
                                                            }
                                                            int cfr_ignored_21 = Integer.rotateLeft(0xB3E9ACE9 ^ n2, 9) + -844525710;
                                                            int cfr_ignored_22 = (int)(0x715B02D427D4EB4FL ^ (long)n2 ^ 0xF8D8831A2DB94F67L);
                                                            n3 = (n2 ^ 0x25803CF6 ^ 0xE464423F) + -463191489 ^ 0x9BFD617D ^ 0x9BFD617D;
                                                            int cfr_ignored_23 = Integer.rotateLeft(0xCD4C2A9 ^ n2, 4) + -1843318350;
                                                            int cfr_ignored_24 = (int)(0xCE666C9427D4EB4FL ^ (long)n2 ^ 0x2458831A2DB8311DL);
                                                            n3 = (n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489;
                                                            continue;
                                                        }
                                                        int cfr_ignored_25 = Integer.rotateRight(0xF9C7DC0E ^ n2, 18) - 1133593837;
                                                        n3 = (n2 ^ 0xE8566EF8 ^ 0xE464423F) + -463191489 ^ 0xA9A889F ^ 0xA9A889F;
                                                        int cfr_ignored_26 = (Integer.rotateLeft(0x4E0E047C ^ n2, 12) - 2014325311) * 1309541501;
                                                        n3 = (int)((long)((n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489) ^ 0xAEA017EA06DA3C92L ^ 0xAEA017EA06DA3C92L);
                                                        n += 3;
                                                        continue;
                                                    }
                                                    int cfr_ignored_27 = Integer.rotateRight(0xF70B3FAF ^ n2, 17) - -289778324;
                                                    int cfr_ignored_28 = (int)(0x8F48A0314F15133BL ^ (long)n2 ^ 0xBD125299DD50B340L);
                                                    n3 = (n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489 + 794403973 - 794403973;
                                                    continue;
                                                }
                                                int cfr_ignored_29 = (Integer.rotateRight(0x6E341513 ^ n2, 16) + 1554787464) * 1848907027;
                                                n3 = (int)((long)((n2 ^ 0x5A3E63FB ^ 0xE464423F) + -463191489) ^ 0x99BDC14C5FB55AF2L ^ 0x99BDC14C5FB55AF2L);
                                                int cfr_ignored_30 = (Integer.rotateLeft(0xD20E11B4 ^ n2, 13) - 1947321351) * -770829899;
                                                try {
                                                    if ((0xBA817DECB7F16789L ^ (long)n2 | 1L) == 0L) {
                                                        throw new UnsupportedOperationException();
                                                    }
                                                    n3 = (n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    n3 = (n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489 ^ 0x60C4271C ^ 0x60C4271C;
                                                }
                                                n -= 4;
                                                continue;
                                            }
                                            int cfr_ignored_31 = Integer.rotateLeft(0x58BBDD4D ^ n2, 14) - -1021482098;
                                            int cfr_ignored_32 = (int)(0x9A09737027D4EB4FL ^ (long)n2 ^ 0x1B90831A2DB899C3L);
                                            n3 = (n2 ^ 0xF6F2841A ^ 0xE464423F) + -463191489 ^ 0x863F4A39 ^ 0x863F4A39;
                                            int cfr_ignored_33 = (Integer.rotateLeft(0x787F7199 ^ n2, 18) + -1681104702) * 2021618073;
                                            int cfr_ignored_34 = (int)(0xBACDDFA427D4EB4FL ^ (long)n2 ^ 0x4238831A2DB8D84AL);
                                            n3 = (n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489 ^ 0xC1D5CD8 ^ 0xC1D5CD8;
                                            n -= 3;
                                            continue;
                                        }
                                        int cfr_ignored_35 = Integer.rotateRight(0xF81ADB0A ^ n2, 18) + 262022513;
                                        int cfr_ignored_36 = (int)(0x1AB90FDC356C3DC6L ^ (long)n2 ^ 0xE2C8A66B80AB98A3L);
                                        n3 = (n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489;
                                        n -= 5;
                                        continue;
                                    }
                                    int cfr_ignored_37 = (Integer.rotateLeft(0xACEBB0D0 ^ n2, 8) + -186120085) * -1393839919;
                                    try {
                                        if ((0xD6D47B70AB4CFE01L ^ (long)n2 | 1L) == 0L) {
                                            throw new ArithmeticException();
                                        }
                                        n3 = (n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489 ^ 0x131560C2 ^ 0x131560C2;
                                    }
                                    catch (ArithmeticException arithmeticException) {
                                        n3 = (n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489 + 1357373673 - 1357373673;
                                    }
                                    n -= 2;
                                    continue;
                                }
                                int cfr_ignored_38 = Integer.rotateRight(0x76332DC7 ^ n2, 17) - 1418734164;
                                n3 = (n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489 + 2067619825 - 2067619825;
                                n += 5;
                                continue;
                            }
                            int cfr_ignored_39 = (Integer.rotateLeft(0xF96A93F8 ^ n2, 18) + 944081475) * -110455815;
                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x22713DA0 ^ 0xE464423F) + -463191489));
                            int cfr_ignored_40 = Integer.rotateRight(0xCF267843 ^ n2, 12) + 436612952;
                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x9A9F19F9 ^ 0xE464423F) + -463191489));
                            int cfr_ignored_41 = (Integer.rotateLeft(0xAD720ED1 ^ n2, 8) + 86862474) * -1385034031;
                            int cfr_ignored_42 = (int)(0x6FC0A0EC27D4EB4FL ^ (long)n2 ^ 0xBCA8831A2DB97250L);
                            n3 = (n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489;
                            n -= 4;
                            continue;
                        }
                        int cfr_ignored_43 = Integer.rotateRight(0x95A9EF4A ^ n2, 5) + 603035953;
                        int cfr_ignored_44 = (int)(0xBCE651E3356109EEL ^ (long)n2 ^ 0x5EB6A671E8FAD41DL);
                        n3 = (n2 ^ 0xB42B137B ^ 0xE464423F) + -463191489 + 1883353575 - 1883353575;
                        int cfr_ignored_45 = (int)(0x7A01DD29B91F066AL ^ (long)n2 ^ 0x4723BE8DF7F359D2L);
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489));
                        ++n;
                        continue;
                    }
                    int cfr_ignored_46 = Integer.rotateRight(0x29C686C7 ^ n2, 8) - 325579092;
                    try {
                        n3 = (n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489 + -956032552 - -956032552;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489 ^ 0x221066CF ^ 0x221066CF;
                    }
                    n += 4;
                    continue;
                }
                int cfr_ignored_47 = Integer.rotateRight(0x2C3F712F ^ n2, 8) - 1611420652;
                n3 = Integer.reverse(Integer.reverse((n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489));
                continue;
            }
            int cfr_ignored_48 = Integer.rotateRight(0xC8168B22 ^ n2, 12) + 1058568281;
            n3 = (n2 ^ 0x1B51835B ^ 0xE464423F) + -463191489 ^ 0x31891050 ^ 0x31891050;
        }
    }

    private static String jyth(String string, int n, int n2, int n3) {
        int n4 = 469783921;
        n4 = Integer.rotateLeft(n4 * -1788320811, 23) ^ 0xF99DB974;
        n4 = n2 ^ n4;
        int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 25)) ^ 0xA40815F;
        if ((n5 ^ n4) != 171999583) {
            int cfr_ignored_0 = (0x1640D42E ^ n4) - 613741074;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x76B31F0B ^ n2 ^ i * -1140547667 ^ dghm, 11) ^ hmn));
        }
        return new String(cArray);
    }

    private static void azz() {
        int n = -1192525437;
        int n2 = (n = Integer.rotateLeft(n * -752922281, 14) ^ 0x383C4E3F) ^ 0xAB44852A;
        if ((n2 ^ n) != -1421572822) {
            int cfr_ignored_0 = (0x13AF04A9 ^ n) + 1784869975;
        }
        yf.athz_2();
    }

    private static float azb_2(class_746 class_7462) {
        block0: {
            int n = -37873310;
            n = Integer.rotateLeft(n * -1785922109, 25) ^ 0x49BC9CEE;
            class_746 class_7463 = class_7462;
            n = Integer.rotateRight((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 10);
            int n2 = n ^ 0xE14E12F2;
            if ((n2 ^ n) == -514977038) break block0;
            int cfr_ignored_0 = (0x1CF00B90 ^ n) - -935314690;
        }
        return class_7462.method_36455();
    }

    private static boolean dhd_9() {
        block0: {
            int n = 191222454;
            int n2 = (n = Integer.rotateLeft(n * 18788077, 10) ^ 0x2FF7FAF2) ^ 0xC1B05282;
            if ((n2 ^ n) == -1045409150) break block0;
            int cfr_ignored_0 = (0xCAD58034 ^ n) - 1232396040;
        }
        return yf.dnkh();
    }

    private static void tzb(class_315 class_3152, class_5498 class_54982) {
        int n = khth_3.shqa_2(1424127047);
        class_5498 class_54983 = class_54982;
        n = Integer.rotateLeft((class_54983 != null ? System.identityHashCode(class_54983) : 0) ^ n, 16);
        int n2 = n ^ 0x92407DC8;
        if ((n2 ^ n) != -1841267256) {
            int cfr_ignored_0 = Integer.rotateRight(0xC6A2098F ^ n, 11) - 301778828;
        }
        class_3152.method_31043(class_54982);
    }

    private static String[] dth_7(String string) {
        int n = 1545899419;
        n = Integer.rotateLeft(n * -2107476509, 11) ^ 0x443C2F01;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 23);
        int n2 = n ^ 0xAC614154;
        if ((n2 ^ n) != -1402912428) {
            int cfr_ignored_0 = (0xF045CCCF ^ n) - 1650933603;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite bsh_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1877377791;
            n3 = Integer.rotateLeft(n3 * -786304491, 24) ^ 0x40053397;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 2);
            n3 = n ^ n3;
            int n4 = n3 ^ 0xB13B74FC;
            if ((n4 ^ n3) != -1321503492) {
                int cfr_ignored_0 = (0xDEDDF603 ^ n3) - -1521486749;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ bs ^ string.hashCode() ^ n2 + dl ^ i * -1640124263 ^ bs, 15) ^ dl));
            }
            String[] stringArray = bks.dth_7(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] x4y1aneqdao(String string) {
        return string.split("\b\u0016", -1);
    }

    private static CallSite jup4oclj(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ pwj12uzzbzr2p ^ string.hashCode() ^ n2 + whrsva9p + i * -2048052921) + pwj12uzzbzr2p) ^ whrsva9p));
            }
            String[] stringArray = bks.x4y1aneqdao(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

