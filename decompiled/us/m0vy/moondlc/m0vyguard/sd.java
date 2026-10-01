/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1041
 *  net.minecraft.class_1304
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1713
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_304
 *  net.minecraft.class_310
 *  net.minecraft.class_3675
 *  net.minecraft.class_3675$class_306
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1041;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3675;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bdh_3;
import us.m0vy.moondlc.m0vyguard.brz;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.baq_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tas_2;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Elytra Swap", category=bzw.OTHER, desc="Safely swaps an elytra and chestplate")
public class sd
extends bnq {
    private static final int khghdh = 6;
    private static final class_1792[] shzk;
    private final bdh_3 dhakh_2 = new bdh_3(this, "Swap Key");
    private baq_2 dhzy = baq_2.sta_2;
    private boolean zan_2;
    private int tshd_2 = -1;
    private class_304[] srn;
    private final bql<btt> shdz = this::ddw_4;
    private static final int khjl = 49124344;
    private static final int jyf = -509968119;
    private static final int tws = -1209731769;
    private static final int zzj = -2066006723;
    private static final int cudncpet85mm = 704806637;
    private static final int y8t48de = -1862971879;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int tzp8i5hc2km8;

    @Override
    public void nt() {
        int n = 291947828;
        n = Integer.rotateLeft(n * -1124340853, 12) ^ 0x33772FFC;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 11);
        int n2 = n ^ 0xCF850D19;
        if ((n2 ^ n) != -813363943) {
            int cfr_ignored_0 = (0xDEE3C82D ^ n) + -2008366502;
        }
        this.zan_2 = false;
        sd.ghtt(this, false);
    }

    @Override
    public void nc() {
        int n = 2133657877;
        n = Integer.rotateLeft(n * 496131387, 21) ^ 0xCAAA78FF;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xC8160DF6;
        if ((n2 ^ n) != -938078730) {
            int cfr_ignored_0 = (0xB73B04E3 ^ n) - 723472035;
        }
        this.tfs_3(true);
        this.zan_2 = false;
    }

    public void khzz_2() {
        int n = 0;
        int n2 = tas_2.sdha_3(-637141498);
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = Integer.reverse(Integer.reverse(-1297320206 + n2));
        while (true) {
            block21: {
                block29: {
                    block33: {
                        block25: {
                            block26: {
                                block32: {
                                    block30: {
                                        block23: {
                                            block18: {
                                                block28: {
                                                    block24: {
                                                        block19: {
                                                            block35: {
                                                                block34: {
                                                                    block20: {
                                                                        block31: {
                                                                            block27: {
                                                                                block16: {
                                                                                    block22: {
                                                                                        block17: {
                                                                                            if ((n = n3 - n2) > 530126114) break block16;
                                                                                            if (n > -1297320206) break block17;
                                                                                            if (n == -1811779694) break block18;
                                                                                            if (n == -1807747221) break block19;
                                                                                            if (n == -1297320206) break block20;
                                                                                            break block21;
                                                                                        }
                                                                                        if (n > -12341412) break block22;
                                                                                        if (n == -351429256) break block23;
                                                                                        if (n == -12341412) break block24;
                                                                                        break block21;
                                                                                    }
                                                                                    if (n == 199989216) break block25;
                                                                                    if (n == 530126114) break block26;
                                                                                    int cfr_ignored_0 = Integer.rotateRight(0x1E96864A ^ n2, 6) + -1198005711;
                                                                                    break block21;
                                                                                }
                                                                                if (n > 1035193153) break block27;
                                                                                if (n == 693638916) break block28;
                                                                                if (n == 861533185) break block29;
                                                                                if (n == 1035193153) break block30;
                                                                                break block21;
                                                                            }
                                                                            if (n > 1522775017) break block31;
                                                                            if (n == 1418326557) break block32;
                                                                            if (n == 1522775017) break block33;
                                                                            int cfr_ignored_1 = Integer.rotateRight(0xAAE9EC66 ^ n2, 8) - -1229897835;
                                                                            break block21;
                                                                        }
                                                                        if (n == 1704925517) break block34;
                                                                        if (n == 1850438663) break block35;
                                                                        break block21;
                                                                    }
                                                                    int cfr_ignored_2 = (Integer.rotateLeft(0xC8BF013C ^ n2, 12) - 1400817023) * -927006403;
                                                                    if (this.dhzy != baq_2.sta_2) {
                                                                        n3 = Integer.reverse(Integer.reverse(-674074982 + n2));
                                                                        int cfr_ignored_3 = (Integer.rotateLeft(0x8C200950 ^ n2, 4) + -62996501) * -1944057519;
                                                                        n3 = 1850438663 + n2 ^ 0x4D323E48 ^ 0x4D323E48;
                                                                        --n;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        n -= 3;
                                                                        if ((0xB1966869257EBDC9L ^ (long)n2 | 1L) == 0L) {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                        n3 = (int)((long)(1704925517 + n2) ^ 0x632D7AC6D5D68D1FL ^ 0x632D7AC6D5D68D1FL);
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        n3 = 1704925517 + n2;
                                                                    }
                                                                    n += 4;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_4 = (Integer.rotateLeft(0xBA691AF0 ^ n2, 10) + -1760042421) * -1167516943;
                                                                this.thkht();
                                                                int cfr_ignored_5 = (int)(0x41348458362B3863L ^ (long)n2 ^ 0xF5C0A0E58BE12FB8L);
                                                                n3 = 1850438663 + n2 ^ 0x8AED216F ^ 0x8AED216F;
                                                                continue;
                                                            }
                                                            int cfr_ignored_6 = (Integer.rotateLeft(0x7C838190 ^ n2, 18) + 407523243) * 2088993169;
                                                            return;
                                                        }
                                                        int cfr_ignored_7 = Integer.rotateLeft(0x5AD1C1A4 ^ n2, 14) - 63181335;
                                                        try {
                                                            --n;
                                                            n3 = (int)((long)(-1297320206 + n2) ^ 0x4C1A087683E5C181L ^ 0x4C1A087683E5C181L);
                                                        }
                                                        catch (NoSuchElementException noSuchElementException) {
                                                            n3 = -1297320206 + n2;
                                                        }
                                                        n += 3;
                                                        continue;
                                                    }
                                                    int cfr_ignored_8 = (Integer.rotateRight(0x836446DF ^ n2, 3) - -310234052) * -2090580257;
                                                    n3 = 170693676 + n2 + 1375498020 - 1375498020;
                                                    int cfr_ignored_9 = (Integer.rotateRight(0xFF5146BA ^ n2, 18) + -281727039) * -11450693;
                                                    try {
                                                        n3 = -1297320206 + n2 + 445033824 - 445033824;
                                                    }
                                                    catch (NoSuchElementException noSuchElementException) {
                                                        n3 = (int)((long)(-1297320206 + n2) ^ 0xBD3AF5A45D108F77L ^ 0xBD3AF5A45D108F77L);
                                                    }
                                                    n -= 4;
                                                    continue;
                                                }
                                                int cfr_ignored_10 = (Integer.rotateLeft(0xDBC8B3D0 ^ n2, 14) + -1582602901) * -607603759;
                                                n3 = 254549026 + n2 ^ 0x1815D26F ^ 0x1815D26F;
                                                int cfr_ignored_11 = Integer.rotateLeft(0xFF3352C9 ^ n2, 18) + -342579822;
                                                int cfr_ignored_12 = (int)(0x3D81FCF427D4EB4FL ^ (long)n2 ^ 0x498831A2DB9D6D2L);
                                                n3 = -1297320206 + n2;
                                                continue;
                                            }
                                            int cfr_ignored_13 = Integer.rotateLeft(0x441AD8A5 ^ n2, 11) - 1134418742;
                                            int cfr_ignored_14 = (int)(0x86A8769827D4EB4FL ^ (long)n2 ^ 0x1040831A2DB8A081L);
                                            int cfr_ignored_15 = (int)(0xC6FDB951CACA3C2EL ^ (long)n2 ^ 0x8FD35927837A202AL);
                                            n3 = Integer.reverse(Integer.reverse(-1394045862 + n2));
                                            int cfr_ignored_16 = (int)(0x3B984ED6F36957CDL ^ (long)n2 ^ 0x60DD2A6154BDDAE1L);
                                            n3 = (int)((long)(-1297320206 + n2) ^ 0x2231B4EBD2D46BBBL ^ 0x2231B4EBD2D46BBBL);
                                            ++n;
                                            continue;
                                        }
                                        int cfr_ignored_17 = (Integer.rotateRight(0x6DC52F2 ^ n2, 3) + -653546871) * 115102451;
                                        int cfr_ignored_18 = (int)(0x87FB8204D2C49C41L ^ (long)n2 ^ 0xF979693AC3A4A226L);
                                        n3 = -1297320206 + n2 ^ 0xAD7CC1C8 ^ 0xAD7CC1C8;
                                        n -= 5;
                                        continue;
                                    }
                                    int cfr_ignored_19 = Integer.rotateRight(0x1104F127 ^ n2, 5) - 334942964;
                                    n3 = 2007016877 + n2 + -1198540673 - -1198540673;
                                    int cfr_ignored_20 = (Integer.rotateLeft(0xDCCF66F4 ^ n2, 14) - -1048897849) * -590387467;
                                    n3 = -1297320206 + n2;
                                    continue;
                                }
                                int cfr_ignored_21 = (Integer.rotateRight(0xB33205FE ^ n2, 9) - -1217636099) * -1288567297;
                                try {
                                    n3 = Integer.reverse(Integer.reverse(-1297320206 + n2));
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    n3 = Integer.reverse(Integer.reverse(-1297320206 + n2));
                                }
                                --n;
                                continue;
                            }
                            int cfr_ignored_22 = (Integer.rotateLeft(0xAA5B45C ^ n2, 4) - 1315862111) * 178631773;
                            try {
                                if ((0x86C23560AEAF84A7L ^ (long)n2 | 1L) == 0L) {
                                    throw new IllegalStateException();
                                }
                                n3 = -1297320206 + n2;
                            }
                            catch (IllegalStateException illegalStateException) {
                                n3 = Integer.reverse(Integer.reverse(-1297320206 + n2));
                            }
                            n += 4;
                            continue;
                        }
                        int cfr_ignored_23 = Integer.rotateRight(0xD3702F8F ^ n2, 13) - -1628216948;
                        n3 = Integer.reverse(Integer.reverse(-865467876 + n2));
                        int cfr_ignored_24 = Integer.rotateLeft(0xD6842FC9 ^ n2, 13) + -27301742;
                        int cfr_ignored_25 = (int)(0x143681F427D4EB4FL ^ (long)n2 ^ 0xFE98831A2DB985BCL);
                        n3 = (int)((long)(-1297320206 + n2) ^ 0xB60F4F69E89610F8L ^ 0xB60F4F69E89610F8L);
                        int cfr_ignored_26 = Integer.rotateLeft(0x4C11B2C0 ^ n2, 12) + 981615739;
                        continue;
                    }
                    int cfr_ignored_27 = (Integer.rotateRight(0x9025861E ^ n2, 5) - 2028526813) * -1876589025;
                    n3 = -1282180163 + n2;
                    int cfr_ignored_28 = Integer.rotateRight(0x33CEF7EB ^ n2, 9) + 1248699568;
                    try {
                        n3 = -1297320206 + n2 ^ 0x9950F988 ^ 0x9950F988;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = -1297320206 + n2;
                    }
                    continue;
                }
                int cfr_ignored_29 = Integer.rotateLeft(0xADC3145 ^ n2, 4) - 1426560662;
                int cfr_ignored_30 = (int)(0xC86E9F7827D4EB4FL ^ (long)n2 ^ 0xC380831A2DB83D0CL);
                n3 = Integer.reverse(Integer.reverse(-1429233084 + n2));
                int cfr_ignored_31 = (Integer.rotateLeft(0x33774AF8 ^ n2, 9) + 1070576451) * 863455993;
                n3 = -1297320206 + n2;
                n -= 2;
                continue;
            }
            int cfr_ignored_32 = (Integer.rotateLeft(0x27947471 ^ n2, 7) + -816334614) * 664040561;
            int cfr_ignored_33 = (int)(0xE526DA4C27D4EB4FL ^ (long)n2 ^ 0x49E8831A2DB8679CL);
            n3 = -1297320206 + n2;
        }
    }

    private void thkht() {
        int n = 0;
        int n2 = -577167138;
        n2 = Integer.rotateLeft(n2 * 1940776809, 4) ^ 0xFD84F77B;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 25);
        int n3 = Integer.reverse(Integer.reverse(-613129309 * 1003238809 + 1647702663 ^ n2));
        while (true) {
            block48: {
                block61: {
                    block63: {
                        block50: {
                            block66: {
                                block49: {
                                    block64: {
                                        block72: {
                                            block56: {
                                                block53: {
                                                    block46: {
                                                        block68: {
                                                            block73: {
                                                                block62: {
                                                                    block65: {
                                                                        block71: {
                                                                            block57: {
                                                                                block51: {
                                                                                    block55: {
                                                                                        block47: {
                                                                                            block69: {
                                                                                                block45: {
                                                                                                    block54: {
                                                                                                        block58: {
                                                                                                            block70: {
                                                                                                                block67: {
                                                                                                                    block59: {
                                                                                                                        block60: {
                                                                                                                            block42: {
                                                                                                                                block52: {
                                                                                                                                    block43: {
                                                                                                                                        block44: {
                                                                                                                                            if ((n = ((n3 ^ n2) - 1647702663) * 1849446057) > -397205628) break block42;
                                                                                                                                            if (n > -942728954) break block43;
                                                                                                                                            if (n > -1858422802) break block44;
                                                                                                                                            if (n == -2047592265) break block45;
                                                                                                                                            if (n == -1926585285) break block46;
                                                                                                                                            int cfr_ignored_0 = (Integer.rotateLeft(0xE1CCD959 ^ n2, 15) + 1546383618) * -506668711;
                                                                                                                                            int cfr_ignored_1 = (int)(0x237E776427D4EB4FL ^ (long)n2 ^ 0x13B8831A2DB9EB2DL);
                                                                                                                                            if (n == -1858422802) break block47;
                                                                                                                                            break block48;
                                                                                                                                        }
                                                                                                                                        if (n == -1676052118) break block49;
                                                                                                                                        if (n == -1172688540) break block50;
                                                                                                                                        if (n == -942728954) break block51;
                                                                                                                                        break block48;
                                                                                                                                    }
                                                                                                                                    if (n > -832724422) break block52;
                                                                                                                                    if (n == -907430082) break block53;
                                                                                                                                    if (n == -894928142) break block54;
                                                                                                                                    if (n == -832724422) break block55;
                                                                                                                                    break block48;
                                                                                                                                }
                                                                                                                                if (n == -649070206) break block56;
                                                                                                                                if (n == -613129309) break block57;
                                                                                                                                int cfr_ignored_2 = Integer.rotateLeft(0xA8BBE709 ^ n2, 8) + 1931385170;
                                                                                                                                int cfr_ignored_3 = (int)(0x6A09493427D4EB4FL ^ (long)n2 ^ 0x6F18831A2DB979C3L);
                                                                                                                                if (n == -397205628) break block58;
                                                                                                                                break block48;
                                                                                                                            }
                                                                                                                            if (n > 437602380) break block59;
                                                                                                                            if (n > 132313832) break block60;
                                                                                                                            if (n == -350347908) break block61;
                                                                                                                            if (n == -94604291) break block62;
                                                                                                                            int cfr_ignored_4 = (Integer.rotateLeft(0xD76DEB75 ^ n2, 13) - 447554150) * -680662155;
                                                                                                                            int cfr_ignored_5 = (int)(0x15DF454827D4EB4FL ^ (long)n2 ^ 0x77E0831A2DB9866FL);
                                                                                                                            if (n == 132313832) break block63;
                                                                                                                            break block48;
                                                                                                                        }
                                                                                                                        if (n == 202315644) break block64;
                                                                                                                        if (n == 237138353) break block65;
                                                                                                                        if (n == 437602380) break block66;
                                                                                                                        break block48;
                                                                                                                    }
                                                                                                                    if (n > 1758207425) break block67;
                                                                                                                    if (n == 1405407476) break block68;
                                                                                                                    if (n == 1462095341) break block69;
                                                                                                                    if (n == 1758207425) break block70;
                                                                                                                    break block48;
                                                                                                                }
                                                                                                                if (n == 1848916201) break block71;
                                                                                                                if (n == 1956964358) break block72;
                                                                                                                int cfr_ignored_6 = (Integer.rotateLeft(0x4A6D8C3D ^ n2, 12) - 128031390) * 1248693309;
                                                                                                                int cfr_ignored_7 = (int)(0x88DF220027D4EB4FL ^ (long)n2 ^ 0xB970831A2DB8BC6FL);
                                                                                                                if (n == 2144540637) break block73;
                                                                                                                break block48;
                                                                                                            }
                                                                                                            int cfr_ignored_8 = (Integer.rotateRight(0xE0B47B97 ^ n2, 15) - 976787076) * -525042793;
                                                                                                            this.tshd_2 = this.sh_2();
                                                                                                            if (this.tshd_2 == -1) {
                                                                                                                n3 = Integer.reverse(Integer.reverse(-354637576 * 1003238809 + 1647702663 ^ n2));
                                                                                                                int cfr_ignored_9 = (Integer.rotateRight(0xEAE8937 ^ n2, 4) - -880788252) * 246319415;
                                                                                                                n3 = (int)((long)(-832724422 * 1003238809 + 1647702663 ^ n2) ^ 0xD11CF43DC8992AA1L ^ 0xD11CF43DC8992AA1L);
                                                                                                                continue;
                                                                                                            }
                                                                                                            try {
                                                                                                                n -= 2;
                                                                                                                if ((0xE5C6375C8FC9DBA7L ^ (long)n2 | 1L) == 0L) {
                                                                                                                    throw new UnsupportedOperationException();
                                                                                                                }
                                                                                                                n3 = (-397205628 * 1003238809 + 1647702663 ^ n2) + 1666131820 - 1666131820;
                                                                                                            }
                                                                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                                n3 = (-397205628 * 1003238809 + 1647702663 ^ n2) + 1142112925 - 1142112925;
                                                                                                            }
                                                                                                            n -= 4;
                                                                                                            continue;
                                                                                                        }
                                                                                                        int cfr_ignored_10 = (Integer.rotateRight(0x8F970FF6 ^ n2, 4) - 1739099653) * -1885925385;
                                                                                                        sd.mc.field_1724.method_5728(false);
                                                                                                        this.tdht_3();
                                                                                                        this.dhzy = baq_2.khrh_2;
                                                                                                        return;
                                                                                                    }
                                                                                                    int cfr_ignored_11 = Integer.rotateLeft(0xE77AEA85 ^ n2, 15) - 205522262;
                                                                                                    int cfr_ignored_12 = (int)(0x25C844B827D4EB4FL ^ (long)n2 ^ 0x7400831A2DB9E641L);
                                                                                                    yf.athz_2();
                                                                                                    n3 = (int)((long)(-1836356638 * 1003238809 + 1647702663 ^ n2) ^ 0xA065E0F948349E02L ^ 0xA065E0F948349E02L);
                                                                                                    int cfr_ignored_13 = Integer.rotateLeft(0x8934DD69 ^ n2, 4) + -1580962062;
                                                                                                    int cfr_ignored_14 = (int)(0x4B86735427D4EB4FL ^ (long)n2 ^ 0x1BD8831A2DB93ADDL);
                                                                                                    n3 = (int)((long)(1848916201 * 1003238809 + 1647702663 ^ n2) ^ 0xF698D81866FF1024L ^ 0xF698D81866FF1024L);
                                                                                                    n += 5;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_15 = (Integer.rotateLeft(0x6E1714D4 ^ n2, 16) - 1495868647) * 1847006421;
                                                                                                if (sd.mc.field_1761 != null) {
                                                                                                    int cfr_ignored_16 = (int)(0x7014A2966051A8F9L ^ (long)n2 ^ 0xB85C0C10AAD54DF8L);
                                                                                                    n3 = 1462095341 * 1003238809 + 1647702663 ^ n2 ^ 0xF30DBA43 ^ 0xF30DBA43;
                                                                                                    n -= 3;
                                                                                                    continue;
                                                                                                }
                                                                                                try {
                                                                                                    n3 = (-942728954 * 1003238809 + 1647702663 ^ n2) + 1678620543 - 1678620543;
                                                                                                }
                                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                                    n3 = -942728954 * 1003238809 + 1647702663 ^ n2;
                                                                                                }
                                                                                                n -= 4;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_17 = (Integer.rotateLeft(0x35D751DC ^ n2, 9) - -1989113633) * 903303645;
                                                                                            if (mc.method_1562() != null) {
                                                                                                n3 = -521602534 * 1003238809 + 1647702663 ^ n2 ^ 0xBBDDB6F2 ^ 0xBBDDB6F2;
                                                                                                int cfr_ignored_18 = Integer.rotateRight(0x2579E066 ^ n2, 7) - -1910518891;
                                                                                                n3 = 1758207425 * 1003238809 + 1647702663 ^ n2;
                                                                                                n += 2;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_19 = (int)(0x23165C064CF59C80L ^ (long)n2 ^ 0x457C5558C227EBFDL);
                                                                                            n3 = (int)((long)(-942728954 * 1003238809 + 1647702663 ^ n2) ^ 0x308E55A5BE5B5B7AL ^ 0x308E55A5BE5B5B7AL);
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_20 = Integer.rotateRight(0x1A170726 ^ n2, 6) - 757562581;
                                                                                        return;
                                                                                    }
                                                                                    int cfr_ignored_21 = Integer.rotateRight(0x486CC56B ^ n2, 12) + -913733840;
                                                                                    return;
                                                                                }
                                                                                int cfr_ignored_22 = (Integer.rotateRight(0x3C4D5E17 ^ n2, 10) - 1371276292) * 1011703319;
                                                                                return;
                                                                            }
                                                                            int cfr_ignored_23 = Integer.rotateRight(0xE0313B6E ^ n2, 15) - 710136205;
                                                                            if (yf.khdha_2()) {
                                                                                try {
                                                                                    n += 4;
                                                                                    if ((0x55BB3F122B59F9D5L ^ (long)n2 | 1L) == 0L) {
                                                                                        throw new IllegalArgumentException();
                                                                                    }
                                                                                    n3 = (int)((long)(1848916201 * 1003238809 + 1647702663 ^ n2) ^ 0xF2959A3F90FA09C7L ^ 0xF2959A3F90FA09C7L);
                                                                                }
                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                    n3 = Integer.reverse(Integer.reverse(1848916201 * 1003238809 + 1647702663 ^ n2));
                                                                                }
                                                                                n -= 2;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_24 = (int)(0xC88ABEA2D9A0E4AFL ^ (long)n2 ^ 0x80357FF232783CC4L);
                                                                            n3 = (int)((long)(-123847588 * 1003238809 + 1647702663 ^ n2) ^ 0x146ACB52DBCF98AEL ^ 0x146ACB52DBCF98AEL);
                                                                            int cfr_ignored_25 = (int)(0x449108C76EDA12DEL ^ (long)n2 ^ 0xECFE1107DE9B24F3L);
                                                                            n3 = (int)((long)(-894928142 * 1003238809 + 1647702663 ^ n2) ^ 0xA562F3BDD7D3105L ^ 0xA562F3BDD7D3105L);
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_26 = (Integer.rotateLeft(0x90147194 ^ n2, 5) - 1993826343) * -1877708395;
                                                                        if (sd.mc.field_1724 == null) {
                                                                            int cfr_ignored_27 = (int)(0xE37885322D318023L ^ (long)n2 ^ 0xF71496D0FB606B20L);
                                                                            n3 = -942728954 * 1003238809 + 1647702663 ^ n2;
                                                                            continue;
                                                                        }
                                                                        n3 = -800071208 * 1003238809 + 1647702663 ^ n2 ^ 0x24CEC89E ^ 0x24CEC89E;
                                                                        int cfr_ignored_28 = Integer.rotateLeft(0x92B2506C ^ n2, 5) - -940221361;
                                                                        n3 = -2047592265 * 1003238809 + 1647702663 ^ n2;
                                                                        n += 5;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_29 = (Integer.rotateRight(0xD856B16 ^ n2, 4) - -1484417307) * 226847511;
                                                                    try {
                                                                        n += 2;
                                                                        if ((0x3D33B9B32D2A99E1L ^ (long)n2 | 1L) == 0L) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                        n3 = -613129309 * 1003238809 + 1647702663 ^ n2;
                                                                    }
                                                                    catch (IllegalStateException illegalStateException) {
                                                                        n3 = -613129309 * 1003238809 + 1647702663 ^ n2 ^ 0x9AFD40A2 ^ 0x9AFD40A2;
                                                                    }
                                                                    continue;
                                                                }
                                                                int cfr_ignored_30 = (Integer.rotateLeft(0xD4FF4EDC ^ n2, 13) - -817353761) * -721465635;
                                                                n3 = -958376840 * 1003238809 + 1647702663 ^ n2 ^ 0xCBC7B395 ^ 0xCBC7B395;
                                                                int cfr_ignored_31 = (Integer.rotateLeft(0xC9DC9A9C ^ n2, 12) - 1981044767) * -908289379;
                                                                try {
                                                                    n -= 3;
                                                                    if ((0xCA929E110CB2B839L ^ (long)n2 | 1L) == 0L) {
                                                                        throw new NoSuchElementException();
                                                                    }
                                                                    n3 = Integer.reverse(Integer.reverse(-613129309 * 1003238809 + 1647702663 ^ n2));
                                                                }
                                                                catch (NoSuchElementException noSuchElementException) {
                                                                    n3 = (-613129309 * 1003238809 + 1647702663 ^ n2) + 575882412 - 575882412;
                                                                }
                                                                n -= 4;
                                                                continue;
                                                            }
                                                            int cfr_ignored_32 = (Integer.rotateRight(0x763496 ^ n2, 3) - 313392485) * 7746711;
                                                            n3 = (904839258 * 1003238809 + 1647702663 ^ n2) + -765637131 - -765637131;
                                                            int cfr_ignored_33 = (Integer.rotateLeft(0xED5E37D8 ^ n2, 16) + -1027186077) * -312592423;
                                                            try {
                                                                n -= 3;
                                                                n3 = (-613129309 * 1003238809 + 1647702663 ^ n2) + 1155294381 - 1155294381;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                n3 = Integer.reverse(Integer.reverse(-613129309 * 1003238809 + 1647702663 ^ n2));
                                                            }
                                                            continue;
                                                        }
                                                        int cfr_ignored_34 = Integer.rotateLeft(0xEFBF30C4 ^ n2, 16) - 210011895;
                                                        n3 = -360426786 * 1003238809 + 1647702663 ^ n2 ^ 0x341E41E5 ^ 0x341E41E5;
                                                        int cfr_ignored_35 = (Integer.rotateRight(0x2217676 ^ n2, 3) - 1181415301) * 35747447;
                                                        try {
                                                            --n;
                                                            if ((0xFBF1E2F3C36A957FL ^ (long)n2 | 1L) == 0L) {
                                                                throw new ArithmeticException();
                                                            }
                                                            n3 = Integer.reverse(Integer.reverse(-613129309 * 1003238809 + 1647702663 ^ n2));
                                                        }
                                                        catch (ArithmeticException arithmeticException) {
                                                            n3 = (int)((long)(-613129309 * 1003238809 + 1647702663 ^ n2) ^ 0x798878672FB5ABC5L ^ 0x798878672FB5ABC5L);
                                                        }
                                                        ++n;
                                                        continue;
                                                    }
                                                    int cfr_ignored_36 = Integer.rotateLeft(0x989A4204 ^ n2, 6) - 2131467703;
                                                    n3 = (int)((long)(1640294877 * 1003238809 + 1647702663 ^ n2) ^ 0x5430F37100322CC6L ^ 0x5430F37100322CC6L);
                                                    int cfr_ignored_37 = Integer.rotateRight(0x1060F24A ^ n2, 5) + 1766961;
                                                    try {
                                                        n += 2;
                                                        if ((0x815355CE817A4EBDL ^ (long)n2 | 1L) == 0L) {
                                                            throw new IllegalStateException();
                                                        }
                                                        n3 = (int)((long)(-613129309 * 1003238809 + 1647702663 ^ n2) ^ 0x3DF34EEAFCD53432L ^ 0x3DF34EEAFCD53432L);
                                                    }
                                                    catch (IllegalStateException illegalStateException) {
                                                        n3 = (int)((long)(-613129309 * 1003238809 + 1647702663 ^ n2) ^ 0xE4DCE69CEA0590DAL ^ 0xE4DCE69CEA0590DAL);
                                                    }
                                                    ++n;
                                                    continue;
                                                }
                                                int cfr_ignored_38 = Integer.rotateLeft(0x22A47E29 ^ n2, 7) + 910747186;
                                                int cfr_ignored_39 = (int)(0xE016D01427D4EB4FL ^ (long)n2 ^ 0x5D58831A2DB86DFCL);
                                                n3 = Integer.reverse(Integer.reverse(-613129309 * 1003238809 + 1647702663 ^ n2));
                                                int cfr_ignored_40 = (Integer.rotateLeft(0xDB81EA1C ^ n2, 14) - -1726416737) * -612242915;
                                                n += 5;
                                                continue;
                                            }
                                            int cfr_ignored_41 = (Integer.rotateRight(0xD3B24FDA ^ n2, 13) + -1493874015) * -743288869;
                                            try {
                                                n -= 3;
                                                if ((0xF5C7114E309F05A1L ^ (long)n2 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                n3 = (int)((long)(-613129309 * 1003238809 + 1647702663 ^ n2) ^ 0x6A5EE3BE4F2D1131L ^ 0x6A5EE3BE4F2D1131L);
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                n3 = -613129309 * 1003238809 + 1647702663 ^ n2 ^ 0xF9B3ED78 ^ 0xF9B3ED78;
                                            }
                                            n += 4;
                                            continue;
                                        }
                                        int cfr_ignored_42 = Integer.rotateRight(0xF295C966 ^ n2, 17) - 1686176405;
                                        try {
                                            n3 = (int)((long)(-613129309 * 1003238809 + 1647702663 ^ n2) ^ 0xB24B6C162E01BD42L ^ 0xB24B6C162E01BD42L);
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            n3 = -613129309 * 1003238809 + 1647702663 ^ n2 ^ 0xA12157BE ^ 0xA12157BE;
                                        }
                                        continue;
                                    }
                                    int cfr_ignored_43 = Integer.rotateLeft(0xAB6EB8C5 ^ n2, 8) - -960102634;
                                    int cfr_ignored_44 = (int)(0x69DC16F827D4EB4FL ^ (long)n2 ^ 0xD080831A2DB97E69L);
                                    int cfr_ignored_45 = (int)(0xE4B636324D5735BCL ^ (long)n2 ^ 0x9114561D905E64BDL);
                                    n3 = -1209322837 * 1003238809 + 1647702663 ^ n2 ^ 0x3D3A9276 ^ 0x3D3A9276;
                                    int cfr_ignored_46 = (int)(0xF38C4D14639230EDL ^ (long)n2 ^ 0x67580B979AFC4AC9L);
                                    n3 = -613129309 * 1003238809 + 1647702663 ^ n2;
                                    continue;
                                }
                                int cfr_ignored_47 = Integer.rotateLeft(0x439DC62D ^ n2, 11) - 880320174;
                                int cfr_ignored_48 = (int)(0x812F681027D4EB4FL ^ (long)n2 ^ 0x2D50831A2DB8AF8FL);
                                n3 = -1389575555 * 1003238809 + 1647702663 ^ n2 ^ 0x2AC1222C ^ 0x2AC1222C;
                                int cfr_ignored_49 = Integer.rotateLeft(0xA0B5BA4D ^ n2, 7) - 2053058190;
                                int cfr_ignored_50 = (int)(0x6207147027D4EB4FL ^ (long)n2 ^ 0xD590831A2DB969DFL);
                                try {
                                    n3 = (-613129309 * 1003238809 + 1647702663 ^ n2) + -1647986170 - -1647986170;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    n3 = (-613129309 * 1003238809 + 1647702663 ^ n2) + -2143973953 - -2143973953;
                                }
                                ++n;
                                continue;
                            }
                            int cfr_ignored_51 = (Integer.rotateRight(0xF6255C57 ^ n2, 17) - -756822588) * -165323689;
                            try {
                                if ((0x5B000097BC548741L ^ (long)n2 | 1L) == 0L) {
                                    throw new IllegalArgumentException();
                                }
                                n3 = (-613129309 * 1003238809 + 1647702663 ^ n2) + 742226200 - 742226200;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                n3 = (int)((long)(-613129309 * 1003238809 + 1647702663 ^ n2) ^ 0x441515974A1F0AFBL ^ 0x441515974A1F0AFBL);
                            }
                            n -= 2;
                            continue;
                        }
                        int cfr_ignored_52 = (Integer.rotateLeft(0x737B5C34 ^ n2, 17) - 5097863) * 1937464373;
                        n3 = -115761998 * 1003238809 + 1647702663 ^ n2;
                        int cfr_ignored_53 = (Integer.rotateLeft(0x840EE2F1 ^ n2, 3) + 36379242) * -2079399183;
                        int cfr_ignored_54 = (int)(0x46BC4CCC27D4EB4FL ^ (long)n2 ^ 0x64E8831A2DB920A9L);
                        try {
                            n3 = -613129309 * 1003238809 + 1647702663 ^ n2 ^ 0xC60D514E ^ 0xC60D514E;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            n3 = Integer.reverse(Integer.reverse(-613129309 * 1003238809 + 1647702663 ^ n2));
                        }
                        n += 2;
                        continue;
                    }
                    int cfr_ignored_55 = Integer.rotateLeft(0x1D54F5C8 ^ n2, 6) + -1851301261;
                    n3 = (-468749643 * 1003238809 + 1647702663 ^ n2) + -1154430369 - -1154430369;
                    int cfr_ignored_56 = Integer.rotateRight(0xEFA2C9E3 ^ n2, 16) + 152310200;
                    n3 = Integer.reverse(Integer.reverse(-613129309 * 1003238809 + 1647702663 ^ n2));
                    int cfr_ignored_57 = Integer.rotateRight(0xE2AF972B ^ n2, 15) + 2007035248;
                    n -= 2;
                    continue;
                }
                int cfr_ignored_58 = Integer.rotateLeft(0x1385288C ^ n2, 5) - 1635616815;
                try {
                    n -= 3;
                    n3 = -613129309 * 1003238809 + 1647702663 ^ n2 ^ 0x973BBED7 ^ 0x973BBED7;
                }
                catch (IllegalStateException illegalStateException) {
                    n3 = Integer.reverse(Integer.reverse(-613129309 * 1003238809 + 1647702663 ^ n2));
                }
                ++n;
                continue;
            }
            int cfr_ignored_59 = (Integer.rotateLeft(0x56A96515 ^ n2, 13) - -2099192634) * 1453942037;
            int cfr_ignored_60 = (int)(0x941BCB2827D4EB4FL ^ (long)n2 ^ 0x6B20831A2DB885E6L);
            n3 = (-613129309 * 1003238809 + 1647702663 ^ n2) + 1409031575 - 1409031575;
        }
    }

    private void khzb() {
        int n = -241513508;
        n = Integer.rotateLeft(n * 1479207357, 14) ^ 0x43002D12;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 18);
        int n2 = n ^ 0xA0C0E1C9;
        if ((n2 ^ n) != -1597972023) {
            int cfr_ignored_0 = (0x515A2A15 ^ n) + 2066637252;
        }
        if (this.tshd_2 < 0 || this.tshd_2 >= sd.sba(0xE82485A3 ^ 0xE824A1A3, 24) || sd.mc.field_1724 == null || sd.mc.field_1761 == null) {
            return;
        }
        int n3 = this.tshd_2 < sd.slth_2(0x31545108 ^ 0x7154510A, 2) ? 1176889837 + -1176889801 + this.tshd_2 : this.tshd_2;
        int n4 = sd.mc.field_1724.field_7512.field_7763;
        sd.mc.field_1761.method_2906(n4, n3, 0, class_1713.field_7790, (class_1657)sd.mc.field_1724);
        sd.mc.field_1761.method_2906(n4, 0x9DFB153C ^ 0x9DFB153A, 0, class_1713.field_7790, (class_1657)sd.mc.field_1724);
        sd.mc.field_1761.method_2906(n4, n3, 0, class_1713.field_7790, (class_1657)sd.mc.field_1724);
    }

    private int sh_2() {
        int n = -190895469;
        n = Integer.rotateLeft(n * 492845483, 8) ^ 0x1BE6B691;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 18);
        int n2 = n ^ 0x41F49043;
        if ((n2 ^ n) != 1106546755) {
            int cfr_ignored_0 = (0xB56BBAD0 ^ n) - 478533118;
        }
        if (sd.mc.field_1724 == null) {
            int n3 = -1;
            if (sd.skhn_2() == 0) {
                n3 = n3 ^ 0x2A90;
            }
            return n3;
        }
        if (!sd.zqa(sd.mc.field_1724, class_1304.field_6174).method_31574(class_1802.field_8833)) {
            return this.tsj_2(class_1802.field_8833);
        }
        for (class_1792 class_17922 : shzk) {
            int n4 = this.tsj_2(class_17922);
            if (n4 == -1) continue;
            return n4;
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     */
    private int tsj_2(class_1792 var1_1) {
        var2_2 = 0;
        var3_3 = 0;
        var6_4 = 0;
        var4_5 = 176422865;
        var4_5 = Integer.rotateLeft(var4_5 * -292024397, 7) ^ 373727110;
        var4_5 = System.identityHashCode(this) ^ var4_5;
        v0 = var1_1;
        var4_5 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var4_5;
        var5_6 = var4_5 - -1572534084 ^ 181945414 ^ 181945414;
        block36: while (true) {
            block78: {
                block62: {
                    block69: {
                        block65: {
                            block72: {
                                block70: {
                                    block74: {
                                        block68: {
                                            block67: {
                                                block60: {
                                                    block61: {
                                                        block75: {
                                                            block76: {
                                                                block63: {
                                                                    block66: {
                                                                        block64: {
                                                                            block59: {
                                                                                block77: {
                                                                                    block71: {
                                                                                        block73: {
                                                                                            var6_4 = var4_5 - var5_6;
                                                                                            switch (var6_4 & 15) {
                                                                                                case 9: {
                                                                                                    if (var6_4 == -1339494455) break block59;
                                                                                                    if (var6_4 != -749242551) {
                                                                                                        Integer.rotateLeft(-1277738943 ^ var4_5, 9) + -881957094;
                                                                                                        (int)(8171199315945253711L ^ (long)var4_5 ^ 2416325348543778586L);
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block60;
                                                                                                }
                                                                                                case 14: {
                                                                                                    if (var6_4 != -1120678242) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block61;
                                                                                                }
                                                                                                case 15: {
                                                                                                    if (var6_4 == -416251761) break block62;
                                                                                                    if (var6_4 == 160353695) break block63;
                                                                                                    (Integer.rotateLeft(-807504783 ^ var4_5, 12) + 810399978) * -807504783;
                                                                                                    (int)(967388040598448975L ^ (long)var4_5 ^ 5325650707825145608L);
                                                                                                    if (var6_4 != 1328448943) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block64;
                                                                                                }
                                                                                                case 4: {
                                                                                                    if (var6_4 > -20695948) ** GOTO lbl44
                                                                                                    if (var6_4 == -174050828) break block65;
                                                                                                    if (var6_4 != -20695948) {
                                                                                                        (Integer.rotateLeft(-1956293616 ^ var4_5, 4) + -442315477) * -1956293615;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block66;
lbl44:
                                                                                                    // 1 sources

                                                                                                    if (var6_4 == 366584980) break block67;
                                                                                                    if (var6_4 != 727228852) {
                                                                                                        Integer.rotateLeft(-2088984980 ^ var4_5, 3) - -260780465;
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block68;
                                                                                                }
                                                                                                case 0: {
                                                                                                    if (var6_4 != -884821072) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block69;
                                                                                                }
                                                                                                case 8: {
                                                                                                    if (var6_4 != -380408776) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block70;
                                                                                                }
                                                                                                case 12: {
                                                                                                    if (var6_4 != -1572534084) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block71;
                                                                                                }
                                                                                                case 10: {
                                                                                                    if (var6_4 != 1989694762) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block72;
                                                                                                }
                                                                                                case 13: {
                                                                                                    if (var6_4 != -1805989219) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block73;
                                                                                                }
                                                                                                case 2: {
                                                                                                    if (var6_4 == -248310046) break block74;
                                                                                                    if (var6_4 == 367458354) break block75;
                                                                                                    if (var6_4 != 1016562098) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block76;
                                                                                                }
                                                                                                case 11: {
                                                                                                    if (var6_4 == -1483445701) break;
                                                                                                    if (var6_4 != -1586320965) {
                                                                                                        ** break;
                                                                                                    }
                                                                                                    break block77;
                                                                                                }
                                                                                                case 7: {
                                                                                                    if (var6_4 != 858868135) {
                                                                                                        if (var6_4 != 1530499703) ** break;
                                                                                                        Integer.rotateLeft(1068115532 ^ var4_5, 10) - -1174912401;
                                                                                                        ++var2_2;
                                                                                                        try {
                                                                                                            if ((-278352782364445311L ^ (long)var4_5 | 1L) == 0L) {
                                                                                                                throw new NoSuchElementException();
                                                                                                            }
                                                                                                            var5_6 = (int)((long)(var4_5 - 1328448943) ^ 779606841846063967L ^ 779606841846063967L);
                                                                                                        }
                                                                                                        catch (NoSuchElementException v1) {
                                                                                                            var5_6 = var4_5 - 1328448943 ^ 1024615429 ^ 1024615429;
                                                                                                        }
                                                                                                        var6_4 -= 5;
                                                                                                        continue block36;
                                                                                                    }
                                                                                                    break block78;
                                                                                                }
                                                                                            }
                                                                                            (Integer.rotateRight(1823280819 ^ var4_5, 16) + 760375016) * 1823280819;
                                                                                            var3_3 = var2_2;
                                                                                            var5_6 = (int)((long)(var4_5 - -644937885) ^ 1768664893763099503L ^ 1768664893763099503L);
                                                                                            Integer.rotateLeft(56434476 ^ var4_5, 3) - 1822713231;
                                                                                            var5_6 = var4_5 - 858868135;
                                                                                            var6_4 -= 4;
                                                                                            continue;
                                                                                        }
                                                                                        Integer.rotateRight(584302850 ^ var4_5, 7) + 1006763641;
                                                                                        var3_3 = var2_2;
                                                                                        try {
                                                                                            if ((-3289310050589128417L ^ (long)var4_5 | 1L) == 0L) {
                                                                                                throw new UnsupportedOperationException();
                                                                                            }
                                                                                            var5_6 = var4_5 - 858868135 ^ -2073305830 ^ -2073305830;
                                                                                        }
                                                                                        catch (UnsupportedOperationException v2) {
                                                                                            var5_6 = var4_5 - 858868135 + 1786910821 - 1786910821;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    Integer.rotateLeft(446014273 ^ var4_5, 6) + 1014785050;
                                                                                    (int)(-2871311410530030769L ^ (long)var4_5 ^ -1763015105656119905L);
                                                                                    var2_2 = 0;
                                                                                    var5_6 = var4_5 - 377487371 + -2079418376 - -2079418376;
                                                                                    (Integer.rotateRight(1533628243 ^ var4_5, 14) + 371079752) * 1533628243;
                                                                                    var5_6 = var4_5 - 1328448943 + 1643747454 - 1643747454;
                                                                                    var6_4 += 3;
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateRight(-1685679269 ^ var4_5, 6) + -643205312) * -1685679269;
                                                                                var3_3 = -1;
                                                                                try {
                                                                                    if ((-8034291526510268335L ^ (long)var4_5 | 1L) == 0L) {
                                                                                        throw new ArithmeticException();
                                                                                    }
                                                                                    var5_6 = Integer.reverse(Integer.reverse(var4_5 - 858868135));
                                                                                }
                                                                                catch (ArithmeticException v3) {
                                                                                    var5_6 = var4_5 - 858868135 + -805456415 - -805456415;
                                                                                }
                                                                                var6_4 += 4;
                                                                                continue;
                                                                            }
                                                                            Integer.rotateLeft(1020305580 ^ var4_5, 10) - 1637946383;
                                                                            if (!sd.srth_2(sd.mc.field_1724).method_5438(var2_2).method_31574(var1_1)) {
                                                                                (int)(-8056854696070936738L ^ (long)var4_5 ^ 7484524298914926001L);
                                                                                var5_6 = var4_5 - 1530499703 + 2096889221 - 2096889221;
                                                                                var6_4 -= 5;
                                                                                continue;
                                                                            }
                                                                            try {
                                                                                var6_4 -= 2;
                                                                                var5_6 = Integer.reverse(Integer.reverse(var4_5 - -1483445701));
                                                                            }
                                                                            catch (NoSuchElementException v4) {
                                                                                var5_6 = var4_5 - -1483445701;
                                                                            }
                                                                            var6_4 -= 5;
                                                                            continue;
                                                                        }
                                                                        Integer.rotateLeft(21766060 ^ var4_5, 3) - 747992335;
                                                                        if (var2_2 < (-1638084207 ^ -1638084171)) {
                                                                            var5_6 = var4_5 - -1339494455;
                                                                            var6_4 += 3;
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            var5_6 = var4_5 - -1586320965 + 567830446 - 567830446;
                                                                        }
                                                                        catch (NoSuchElementException v5) {
                                                                            var5_6 = var4_5 - -1586320965 + 1224366530 - 1224366530;
                                                                        }
                                                                        var6_4 -= 3;
                                                                        continue;
                                                                    }
                                                                    (Integer.rotateRight(-2033269417 ^ var4_5, 3) - 1466401988) * -2033269417;
                                                                    var5_6 = var4_5 - 158717553 ^ 387271400 ^ 387271400;
                                                                    (Integer.rotateRight(761481498 ^ var4_5, 8) + -2090632863) * 761481499;
                                                                    try {
                                                                        var6_4 -= 4;
                                                                        var5_6 = (int)((long)(var4_5 - -1572534084) ^ -2043678578697924106L ^ -2043678578697924106L);
                                                                    }
                                                                    catch (IllegalStateException v6) {
                                                                        var5_6 = (int)((long)(var4_5 - -1572534084) ^ -239993593442323483L ^ -239993593442323483L);
                                                                    }
                                                                    var6_4 += 4;
                                                                    continue;
                                                                }
                                                                Integer.rotateLeft(1851247361 ^ var4_5, 16) + 1627337818;
                                                                (int)(-5988268820478497969L ^ (long)var4_5 ^ 3965563620359205915L);
                                                                var5_6 = var4_5 - -1572534084 ^ 1693222225 ^ 1693222225;
                                                                var6_4 += 5;
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(-316211704 ^ var4_5, 16) + -1139383757;
                                                            var5_6 = var4_5 - -1572534084 + -1981906234 - -1981906234;
                                                            Integer.rotateLeft(-678458003 ^ var4_5, 13) - 515882862;
                                                            (int)(1530418275548457807L ^ (long)var4_5 ^ -4913283045001689173L);
                                                            var6_4 -= 5;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(1826174283 ^ var4_5, 16) + 850072400;
                                                        try {
                                                            var6_4 += 5;
                                                            if ((-3723252056894418373L ^ (long)var4_5 | 1L) == 0L) {
                                                                throw new IllegalStateException();
                                                            }
                                                            var5_6 = (int)((long)(var4_5 - -1572534084) ^ -1967426828331635733L ^ -1967426828331635733L);
                                                        }
                                                        catch (IllegalStateException v7) {
                                                            var5_6 = var4_5 - -1572534084;
                                                        }
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(2039382156 ^ var4_5, 18) - -1130418129;
                                                    var5_6 = Integer.reverse(Integer.reverse(var4_5 - -1011840519));
                                                    Integer.rotateLeft(2037068940 ^ var4_5, 18) - -1202127825;
                                                    var5_6 = Integer.reverse(Integer.reverse(var4_5 - -1572534084));
                                                    (Integer.rotateRight(-471608621 ^ var4_5, 15) + -1661720888) * -471608621;
                                                    ++var6_4;
                                                    continue;
                                                }
                                                Integer.rotateRight(-1269267642 ^ var4_5, 9) - -619346763;
                                                (int)(-5122216994129771905L ^ (long)var4_5 ^ -8583746085294908411L);
                                                var5_6 = var4_5 - -1572534084 + 1686156496 - 1686156496;
                                                var6_4 += 3;
                                                continue;
                                            }
                                            Integer.rotateLeft(267012 ^ var4_5, 3) - 81521847;
                                            var5_6 = var4_5 - -1234525115;
                                            Integer.rotateRight(573806819 ^ var4_5, 7) + 681386680;
                                            (int)(1284994051493843602L ^ (long)var4_5 ^ -7790946720610546053L);
                                            var5_6 = var4_5 - -1572534084 ^ 1835271133 ^ 1835271133;
                                            continue;
                                        }
                                        Integer.rotateLeft(1964750540 ^ var4_5, 17) - 850969071;
                                        var5_6 = var4_5 - -317511837;
                                        (Integer.rotateRight(-1328598345 ^ var4_5, 9) - 1836368740) * -1328598345;
                                        (int)(4789233185609979694L ^ (long)var4_5 ^ 8150003655252846908L);
                                        var5_6 = var4_5 - -1572534084 ^ 931116769 ^ 931116769;
                                        var6_4 -= 5;
                                        continue;
                                    }
                                    Integer.rotateRight(589610090 ^ var4_5, 7) + 1171288081;
                                    var5_6 = (int)((long)(var4_5 - 2094373444) ^ 4663044157206357581L ^ 4663044157206357581L);
                                    (Integer.rotateRight(2090500798 ^ var4_5, 18) - 454259773) * 2090500799;
                                    try {
                                        var6_4 -= 4;
                                        if ((5541851318064517479L ^ (long)var4_5 | 1L) == 0L) {
                                            throw new ArithmeticException();
                                        }
                                        var5_6 = var4_5 - -1572534084 ^ 1191308727 ^ 1191308727;
                                    }
                                    catch (ArithmeticException v8) {
                                        var5_6 = Integer.reverse(Integer.reverse(var4_5 - -1572534084));
                                    }
                                    var6_4 -= 5;
                                    continue;
                                }
                                (Integer.rotateRight(1553511706 ^ var4_5, 14) + 987467105) * 1553511707;
                                try {
                                    var5_6 = var4_5 - -1572534084 + -132542002 - -132542002;
                                }
                                catch (ArithmeticException v9) {
                                    var5_6 = var4_5 - -1572534084;
                                }
                                var6_4 += 4;
                                continue;
                            }
                            Integer.rotateRight(166948487 ^ var4_5, 4) - 953680276;
                            try {
                                --var6_4;
                                if ((-5693986234960649365L ^ (long)var4_5 | 1L) == 0L) {
                                    throw new IllegalArgumentException();
                                }
                                var5_6 = (int)((long)(var4_5 - -1572534084) ^ -9183565876029732379L ^ -9183565876029732379L);
                            }
                            catch (IllegalArgumentException v10) {
                                var5_6 = var4_5 - -1572534084;
                            }
                            var6_4 -= 2;
                            continue;
                        }
                        (Integer.rotateRight(-360343106 ^ var4_5, 16) - 1787510077) * -360343105;
                        try {
                            var6_4 -= 4;
                            if ((7499727166449957301L ^ (long)var4_5 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var5_6 = Integer.reverse(Integer.reverse(var4_5 - -1572534084));
                        }
                        catch (ArithmeticException v11) {
                            var5_6 = var4_5 - -1572534084;
                        }
                        var6_4 -= 3;
                        continue;
                    }
                    (Integer.rotateRight(402969523 ^ var4_5, 6) + -319602200) * 402969523;
                    (int)(-6820738221037181769L ^ (long)var4_5 ^ 4612626099565293438L);
                    var5_6 = (int)((long)(var4_5 - 1110290109) ^ -886514443825140898L ^ -886514443825140898L);
                    (int)(-6382263723420255640L ^ (long)var4_5 ^ -5432939930442079478L);
                    var5_6 = var4_5 - -1572534084 + 1838344633 - 1838344633;
                    var6_4 -= 4;
                    continue;
                }
                (Integer.rotateLeft(-1124058920 ^ var4_5, 10) + -412843677) * -1124058919;
                var5_6 = Integer.reverse(Integer.reverse(var4_5 - 928014546));
                (Integer.rotateLeft(1016823352 ^ var4_5, 10) + 1529997315) * 1016823353;
                (int)(7620791203792567511L ^ (long)var4_5 ^ 505122546002787925L);
                var5_6 = Integer.reverse(Integer.reverse(var4_5 - 1010256987));
                (int)(8185929792298381991L ^ (long)var4_5 ^ 8862002993842179813L);
                var5_6 = (int)((long)(var4_5 - -1572534084) ^ 3700687307742077508L ^ 3700687307742077508L);
                var6_4 += 4;
                continue;
            }
            return var3_3;
lbl337:
            // 14 sources

            (Integer.rotateLeft(-412829775 ^ var4_5, 15) + 160423338) * -412829775;
            (int)(2726394714173795151L ^ (long)var4_5 ^ -3573462155858942339L);
            var5_6 = var4_5 - -1572534084 ^ 364063486 ^ 364063486;
        }
    }

    private void khkh_3() {
        try {
            int n = 1037792382;
            n = Integer.rotateLeft(n * 1998102541, 20) ^ 0x51036A29;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x7118BF7D;
            if ((n2 ^ n) != 1897447293) {
                int cfr_ignored_0 = (0x4CC3CB03 ^ n) + 1066036946;
            }
            if ((0x2EE & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (this.srn == null && sd.mc.field_1690 != null) {
            class_304[] class_304Array = new class_304[-702092958 + 702092964];
            class_304Array[0] = sd.mc.field_1690.field_1894;
            class_304Array[1] = sd.mc.field_1690.field_1881;
            class_304Array[2] = sd.mc.field_1690.field_1913;
            class_304Array[3] = sd.mc.field_1690.field_1849;
            class_304Array[4] = sd.mc.field_1690.field_1903;
            class_304Array[5] = sd.mc.field_1690.field_1867;
            this.srn = class_304Array;
        }
    }

    private void tdht_3() {
        try {
            int n = -114639603;
            n = Integer.rotateLeft(n * -1797794077, 8) ^ 0x5BC6ACBE;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xA968CDE2;
            if ((n2 ^ n) != -1452749342) {
                int cfr_ignored_0 = (0x504270EF ^ n) - 907225883;
            }
            if ((0x31B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        sd.zdw_3(this);
        if (this.srn == null) {
            return;
        }
        for (class_304 class_3042 : this.srn) {
            sd.jkh(class_3042, false);
        }
    }

    private void tqb_2() {
        int n = 748629391;
        n = Integer.rotateLeft(n * -1606239515, 18) ^ 0xB5D7FCC2;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x7AAD6C4C;
        if ((n2 ^ n) != 2058185804) {
            int cfr_ignored_0 = (0x563241C3 ^ n) - -1464191683;
        }
        if (yf.dnkh()) {
            throw null;
        }
        this.khkh_3();
        if (this.srn == null || sd.rzth(mc) == null) {
            return;
        }
        long l = sd.bss_3(mc).method_4490();
        for (class_304 class_3042 : this.srn) {
            sd.arl(class_3042, sd.aza_2(l, sd.khzr(class_3042.method_1429())));
        }
    }

    /*
     * Unable to fully structure code
     */
    private void tfs_3(boolean var1_1) {
        var4_2 = 0;
        var2_3 = 726567180;
        var2_3 = Integer.rotateLeft(var2_3 * 365532441, 3) ^ 1486682099;
        var2_3 = var1_1 ^ var2_3;
        var3_4 = (var2_3 ^ -757231642 ^ -1570723779) + -1570723779;
        while (true) {
            block50: {
                block42: {
                    block44: {
                        block52: {
                            block49: {
                                block46: {
                                    block45: {
                                        block40: {
                                            block48: {
                                                block39: {
                                                    block41: {
                                                        block47: {
                                                            block51: {
                                                                block43: {
                                                                    var4_2 = var3_4 - -1570723779 ^ -1570723779 ^ var2_3;
                                                                    switch (var4_2 & 7) {
                                                                        case 0: {
                                                                            if (var4_2 == -76601784) break block39;
                                                                            if (var4_2 == 1887167784) break block40;
                                                                            if (var4_2 != -307080696) {
                                                                                ** break;
                                                                            }
                                                                            break block41;
                                                                        }
                                                                        case 3: {
                                                                            if (var4_2 != -437874093) {
                                                                                ** break;
                                                                            }
                                                                            break block42;
                                                                        }
                                                                        case 4: {
                                                                            if (var4_2 != -1627643916) {
                                                                                ** break;
                                                                            }
                                                                            break block43;
                                                                        }
                                                                        case 5: {
                                                                            if (var4_2 == 1198563445) break block44;
                                                                            if (var4_2 != -682620163) {
                                                                                ** break;
                                                                            }
                                                                            break block45;
                                                                        }
                                                                        case 6: {
                                                                            if (var4_2 == -1438359242) break block46;
                                                                            if (var4_2 == -757231642) break block47;
                                                                            if (var4_2 != 658918366) {
                                                                                if (var4_2 == -1252732930) break;
                                                                                ** break;
                                                                            }
                                                                            break block48;
                                                                        }
                                                                        case 7: {
                                                                            if (var4_2 == 530547207) break block49;
                                                                            if (var4_2 == 813036687) break block50;
                                                                            if (var4_2 == -363621137) break block51;
                                                                            if (var4_2 != -1929765089) {
                                                                                ** break;
                                                                            }
                                                                            break block52;
                                                                        }
                                                                    }
                                                                    (Integer.rotateRight(488799071 ^ var2_3, 6) - -1953853508) * 488799071;
                                                                    if (sd.mc.field_1724 == null) {
                                                                        try {
                                                                            var4_2 += 5;
                                                                            if ((-2961464051935278309L ^ (long)var2_3 | 1L) == 0L) {
                                                                                throw new UnsupportedOperationException();
                                                                            }
                                                                            var3_4 = (var2_3 ^ -1627643916 ^ -1570723779) + -1570723779 + -1659103582 - -1659103582;
                                                                        }
                                                                        catch (UnsupportedOperationException v0) {
                                                                            var3_4 = (int)((long)((var2_3 ^ -1627643916 ^ -1570723779) + -1570723779) ^ -6448702559777601786L ^ -6448702559777601786L);
                                                                        }
                                                                        var4_2 += 4;
                                                                        continue;
                                                                    }
                                                                    (int)(-6406523243676521661L ^ (long)var2_3 ^ 1687691467547534335L);
                                                                    var3_4 = (var2_3 ^ -363621137 ^ -1570723779) + -1570723779 + -463928777 - -463928777;
                                                                    var4_2 -= 4;
                                                                    continue;
                                                                }
                                                                (Integer.rotateLeft(786475152 ^ var2_3, 8) + -1315829589) * 786475153;
                                                                return;
                                                            }
                                                            Integer.rotateLeft(-1837176891 ^ var2_3, 5) - -1044664298;
                                                            (int)(5822109748452191055L ^ (long)var2_3 ^ 7962508289650527305L);
                                                            this.tqb_2();
                                                            (int)(-3262764270113392381L ^ (long)var2_3 ^ 6281677776959309985L);
                                                            var3_4 = (var2_3 ^ -1627643916 ^ -1570723779) + -1570723779;
                                                            var4_2 -= 3;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(-1847846553 ^ var2_3, 5) - -1375423820;
                                                        this.dhzy = baq_2.sta_2;
                                                        this.tshd_2 = -1;
                                                        if (!var1_1) {
                                                            try {
                                                                if ((-6800208001700219235L ^ (long)var2_3 | 1L) == 0L) {
                                                                    throw new ArithmeticException();
                                                                }
                                                                var3_4 = (var2_3 ^ -1627643916 ^ -1570723779) + -1570723779 + -839483049 - -839483049;
                                                            }
                                                            catch (ArithmeticException v1) {
                                                                var3_4 = (var2_3 ^ -1627643916 ^ -1570723779) + -1570723779 + -192898955 - -192898955;
                                                            }
                                                            var4_2 -= 4;
                                                            continue;
                                                        }
                                                        var3_4 = (var2_3 ^ -1252732930 ^ -1570723779) + -1570723779 ^ -2082591455 ^ -2082591455;
                                                        (Integer.rotateLeft(-649651083 ^ var2_3, 14) - 1408897382) * -649651083;
                                                        (int)(2014712431293819727L ^ (long)var2_3 ^ -7358737642663863750L);
                                                        continue;
                                                    }
                                                    (Integer.rotateRight(1645005335 ^ var2_3, 15) - -471197692) * 1645005335;
                                                    try {
                                                        var4_2 += 4;
                                                        var3_4 = (int)((long)((var2_3 ^ -757231642 ^ -1570723779) + -1570723779) ^ -5931845433416340179L ^ -5931845433416340179L);
                                                    }
                                                    catch (ArithmeticException v2) {
                                                        var3_4 = (int)((long)((var2_3 ^ -757231642 ^ -1570723779) + -1570723779) ^ -6723091448165273452L ^ -6723091448165273452L);
                                                    }
                                                    var4_2 -= 3;
                                                    continue;
                                                }
                                                (Integer.rotateRight(1075763578 ^ var2_3, 11) + -937822975) * 1075763579;
                                                var3_4 = (var2_3 ^ -757231642 ^ -1570723779) + -1570723779 + 23758737 - 23758737;
                                                var4_2 -= 4;
                                                continue;
                                            }
                                            (Integer.rotateLeft(837253816 ^ var2_3, 9) + 258308995) * 837253817;
                                            try {
                                                var4_2 += 3;
                                                var3_4 = (var2_3 ^ -757231642 ^ -1570723779) + -1570723779;
                                            }
                                            catch (IllegalArgumentException v3) {
                                                var3_4 = (var2_3 ^ -757231642 ^ -1570723779) + -1570723779 + 698161435 - 698161435;
                                            }
                                            ++var4_2;
                                            continue;
                                        }
                                        Integer.rotateLeft(-355162715 ^ var2_3, 16) - 1948102198;
                                        (int)(2911026957272804175L ^ (long)var2_3 ^ -1567108521865380579L);
                                        var3_4 = (var2_3 ^ 2092772071 ^ -1570723779) + -1570723779 + -1548283310 - -1548283310;
                                        (Integer.rotateLeft(-1658660 ^ var2_3, 18) - 21826015) * -1658659;
                                        var3_4 = (var2_3 ^ -757231642 ^ -1570723779) + -1570723779 ^ 1995040942 ^ 1995040942;
                                        continue;
                                    }
                                    (Integer.rotateRight(-2111600806 ^ var2_3, 3) + -961871071) * -2111600805;
                                    var3_4 = (var2_3 ^ -1066458334 ^ -1570723779) + -1570723779 + 636036569 - 636036569;
                                    Integer.rotateRight(1617673510 ^ var2_3, 15) - -1318484267;
                                    try {
                                        --var4_2;
                                        if ((-5006851499936584249L ^ (long)var2_3 | 1L) == 0L) {
                                            throw new NoSuchElementException();
                                        }
                                        var3_4 = (var2_3 ^ -757231642 ^ -1570723779) + -1570723779;
                                    }
                                    catch (NoSuchElementException v4) {
                                        var3_4 = (var2_3 ^ -757231642 ^ -1570723779) + -1570723779 ^ 304290076 ^ 304290076;
                                    }
                                    var4_2 -= 5;
                                    continue;
                                }
                                Integer.rotateRight(-339343613 ^ var2_3, 16) + -1856472936;
                                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -757231642 ^ -1570723779) + -1570723779));
                                var4_2 -= 4;
                                continue;
                            }
                            (Integer.rotateRight(-1946926057 ^ var2_3, 4) - -151921148) * -1946926057;
                            var3_4 = (var2_3 ^ -795077291 ^ -1570723779) + -1570723779;
                            Integer.rotateLeft(-1518775128 ^ var2_3, 7) + 235855763;
                            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -757231642 ^ -1570723779) + -1570723779));
                            continue;
                        }
                        Integer.rotateRight(1706142763 ^ var2_3, 15) + 1424062576;
                        try {
                            var4_2 += 3;
                            if ((-6061260227837175377L ^ (long)var2_3 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -757231642 ^ -1570723779) + -1570723779));
                        }
                        catch (IllegalStateException v5) {
                            var3_4 = (int)((long)((var2_3 ^ -757231642 ^ -1570723779) + -1570723779) ^ -8610071267281867393L ^ -8610071267281867393L);
                        }
                        var4_2 -= 4;
                        continue;
                    }
                    Integer.rotateLeft(-1263077503 ^ var2_3, 9) + -427452454;
                    (int)(8504020661039328079L ^ (long)var2_3 ^ 5622888283231568345L);
                    var3_4 = (int)((long)((var2_3 ^ -1580274762 ^ -1570723779) + -1570723779) ^ 6378448853407504452L ^ 6378448853407504452L);
                    Integer.rotateRight(-165992441 ^ var2_3, 17) - -777553900;
                    (int)(7132412488053204417L ^ (long)var2_3 ^ 3155905421892741159L);
                    var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ 242396313 ^ -1570723779) + -1570723779));
                    (int)(6576900255824185823L ^ (long)var2_3 ^ 5958072731057068890L);
                    var3_4 = (var2_3 ^ -757231642 ^ -1570723779) + -1570723779 ^ 2029240253 ^ 2029240253;
                    ++var4_2;
                    continue;
                }
                (Integer.rotateLeft(1137977593 ^ var2_3, 11) + 990811490) * 1137977593;
                (int)(-9122455818152383665L ^ (long)var2_3 ^ -1082971561923137764L);
                var3_4 = (var2_3 ^ -1022186089 ^ -1570723779) + -1570723779 + 1374352566 - 1374352566;
                Integer.rotateRight(-1793356858 ^ var2_3, 5) - 313756725;
                try {
                    var4_2 += 2;
                    if ((3419515428001856875L ^ (long)var2_3 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    var3_4 = (var2_3 ^ -757231642 ^ -1570723779) + -1570723779 ^ -1878233518 ^ -1878233518;
                }
                catch (IllegalStateException v6) {
                    var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -757231642 ^ -1570723779) + -1570723779));
                }
                var4_2 -= 2;
                continue;
            }
            (Integer.rotateLeft(855922577 ^ var2_3, 9) + 837040586) * 855922577;
            (int)(-1029360947009623217L ^ (long)var2_3 ^ 1020209464058859196L);
            var3_4 = (var2_3 ^ -40779933 ^ -1570723779) + -1570723779;
            (Integer.rotateLeft(-1721013700 ^ var2_3, 6) - -1738572673) * -1721013699;
            try {
                if ((-8445472443438836839L ^ (long)var2_3 | 1L) == 0L) {
                    throw new UnsupportedOperationException();
                }
                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -757231642 ^ -1570723779) + -1570723779));
            }
            catch (UnsupportedOperationException v7) {
                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -757231642 ^ -1570723779) + -1570723779));
            }
            var4_2 -= 2;
            continue;
lbl228:
            // 7 sources

            (Integer.rotateLeft(645447129 ^ var2_3, 7) + -1392731006) * 645447129;
            (int)(-1960732817124693169L ^ (long)var2_3 ^ -2686253029267053499L);
            var3_4 = (var2_3 ^ -757231642 ^ -1570723779) + -1570723779 ^ 252823444 ^ 252823444;
        }
    }

    private void ddw_4(btt btt2) {
        boolean bl;
        int n = -1944492257;
        n = Integer.rotateLeft(n * 370307189, 16) ^ 0x5533A6C5;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 17);
        int n2 = n ^ 0x7684F15E;
        if ((n2 ^ n) != 1988424030) {
            int cfr_ignored_0 = (0xFA9D9641 ^ n) + 65121347;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (sd.mc.field_1724 == null || sd.mc.field_1687 == null || sd.mc.field_1761 == null) {
            this.tfs_3(false);
            return;
        }
        if (this.dhzy == baq_2.khrh_2) {
            this.khzb();
            this.tqb_2();
            this.dhzy = baq_2.sta_2;
            this.tshd_2 = -1;
        }
        boolean bl2 = bl = this.dhakh_2.sdhkh() != -1 && brz.rzdh(this.dhakh_2.sdhkh());
        if (bl && !this.zan_2 && this.dhzy == baq_2.sta_2 && sd.mc.field_1755 == null) {
            this.thkht();
        }
        this.zan_2 = bl;
    }

    private static String tqa_3(String string, int n, int n2, int n3) {
        int n4 = -2017959850;
        n4 = Integer.rotateLeft(n4 * 203952559, 22) ^ 0x7C77F821;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = n ^ n4) ^ 0x3CDC9BD2;
        if ((n5 ^ n4) != 1021090770) {
            int cfr_ignored_0 = (0xBB64FB84 ^ n4) - -1342862231;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x19B8496C ^ n2 ^ i * -364421819 ^ khjl, 23) ^ jyf));
        }
        return new String(cArray);
    }

    private static void ghtt(sd sd2, boolean bl) {
        int n = 451896075;
        n = Integer.rotateLeft(n * 869172931, 10) ^ 0x40992654;
        int n2 = (n = bl ^ n) ^ 0xC7588CFB;
        if ((n2 ^ n) != -950498053) {
            int cfr_ignored_0 = (0xDDB7EFF0 ^ n) + -1340406374;
        }
        sd2.tfs_3(bl);
    }

    private static int sba(int n, int n2) {
        block0: {
            int n3 = -37516369;
            n3 = Integer.rotateLeft(n3 * 876238967, 8) ^ 0x60C4184E;
            n3 = Integer.rotateLeft(n ^ n3, 13);
            int n4 = (n3 = n2 ^ n3) ^ 0xCDB033FB;
            if ((n4 ^ n3) == -844090373) break block0;
            int cfr_ignored_0 = (0x3073B854 ^ n3) + 452572752;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int slth_2(int n, int n2) {
        block0: {
            int n3 = 103815624;
            n3 = Integer.rotateLeft(n3 * 618969801, 3) ^ 0xCF76C189;
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 8)) ^ 0x25944440;
            if ((n4 ^ n3) == 630473792) break block0;
            int cfr_ignored_0 = (0x23A45D88 ^ n3) - -1464719505;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int skhn_2() {
        block0: {
            int n = tas_2.sdha_3(1635568568);
            int n2 = n ^ 0x1140506A;
            if ((n2 ^ n) == 289427562) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x703C9BD2 ^ n, 17) + -1682670167) * 1883020243;
        }
        return yf.tdhth_2();
    }

    private static class_1799 zqa(class_746 class_7462, class_1304 class_13042) {
        block0: {
            int n = tas_2.sdha_3(1930011521);
            int n2 = n ^ 0x9B29461E;
            if ((n2 ^ n) == -1691793890) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xE820E59F ^ n, 16) - 542731644) * -400497249;
        }
        return class_7462.method_6118(class_13042);
    }

    private static class_1661 srth_2(class_746 class_7462) {
        block0: {
            int n = tas_2.sdha_3(1704670426);
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0xB614EBCA;
            if ((n2 ^ n) == -1240142902) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xD38FDF10 ^ n, 13) + -1563844053) * -745545967;
        }
        return class_7462.method_31548();
    }

    private static void zdw_3(sd sd2) {
        int n = tas_2.sdha_3(1776148171);
        sd sd3 = sd2;
        n = (sd3 != null ? System.identityHashCode(sd3) : 0) ^ n;
        int n2 = n ^ 0x92F62467;
        if ((n2 ^ n) != -1829362585) {
            int cfr_ignored_0 = Integer.rotateLeft(0xFB2BFAAC ^ n, 18) - 1857092111;
        }
        sd2.khkh_3();
    }

    private static void jkh(class_304 class_3042, boolean bl) {
        int n = tas_2.sdha_3(-1969539022);
        class_304 class_3043 = class_3042;
        n = Integer.rotateLeft((class_3043 != null ? System.identityHashCode(class_3043) : 0) ^ n, 26);
        int n2 = (n = bl ^ n) ^ 0x55F40C7E;
        if ((n2 ^ n) != 1442057342) {
            int cfr_ignored_0 = Integer.rotateLeft(0xDF6F344C ^ n, 14) - 315946095;
        }
        class_3042.method_23481(bl);
    }

    private static class_1041 rzth(class_310 class_3102) {
        block0: {
            int n = -1117680135;
            int n2 = (n = Integer.rotateLeft(n * 1229479417, 7) ^ 0x6706E3FE) ^ 0x5938EA32;
            if ((n2 ^ n) == 1496902194) break block0;
            int cfr_ignored_0 = (0xE45967CB ^ n) + -556350750;
        }
        return class_3102.method_22683();
    }

    private static class_1041 bss_3(class_310 class_3102) {
        block0: {
            int n = 656924430;
            int n2 = (n = Integer.rotateLeft(n * -1866571679, 13) ^ 0xAA60E066) ^ 0xF70E7425;
            if ((n2 ^ n) == -150047707) break block0;
            int cfr_ignored_0 = (0xD029AB2B ^ n) - 329173223;
        }
        return class_3102.method_22683();
    }

    private static int khzr(class_3675.class_306 class_3062) {
        block0: {
            int n = -1272528688;
            int n2 = (n = Integer.rotateLeft(n * -1967977721, 6) ^ 0x23EE10D1) ^ 0x4A818912;
            if ((n2 ^ n) == 1250003218) break block0;
            int cfr_ignored_0 = (0xFEA749C2 ^ n) + 710565516;
        }
        return class_3062.method_1444();
    }

    private static boolean aza_2(long l, int n) {
        block0: {
            int n2 = 249826935;
            n2 = Integer.rotateLeft(n2 * -1882598505, 26) ^ 0xCA20BE6F;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 18)) ^ 0xCD7BA606;
            if ((n3 ^ n2) == -847534586) break block0;
            int cfr_ignored_0 = (0xC39FA871 ^ n2) + -373380205;
        }
        return class_3675.method_15987((long)l, (int)n);
    }

    private static void arl(class_304 class_3042, boolean bl) {
        int n = tas_2.sdha_3(-993353345);
        int n2 = (n = bl ^ n) ^ 0x15BC0DD4;
        if ((n2 ^ n) != 364645844) {
            int cfr_ignored_0 = Integer.rotateRight(0xD176ACAB ^ n, 13) + 1639745520;
        }
        class_3042.method_23481(bl);
    }

    private static String[] sthr(String string) {
        block0: {
            int n = -724702185;
            n = Integer.rotateLeft(n * -1543361607, 12) ^ 0x95FE1466;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x4C51526A;
            if ((n2 ^ n) == 1280397930) break block0;
            int cfr_ignored_0 = (0x989CBE7D ^ n) - 1841944268;
        }
        return string.split("\u0004\u001d", -1);
    }

    private static CallSite tns_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -940921683;
            n3 = Integer.rotateLeft(n3 * -1481407417, 3) ^ 0x5F1767A4;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 20);
            n3 = Integer.rotateRight(n ^ n3, 9);
            int n4 = n3 ^ 0x826240E0;
            if ((n4 ^ n3) != -2107490080) {
                int cfr_ignored_0 = (0x4588EC4D ^ n3) - 1427451496;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ tws ^ string.hashCode() ^ n2 + zzj + i * -173018175) + tws) ^ zzj));
            }
            String[] stringArray = sd.sthr(new String(cArray));
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

    private static String[] zps0orj4p3w6(String string) {
        return string.split("\u0007\u0011", -1);
    }

    private static CallSite mmp4rna3dh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ cudncpet85mm ^ string.hashCode() ^ n2 + y8t48de + i * -1572802523) + cudncpet85mm) ^ y8t48de));
            }
            String[] stringArray = sd.zps0orj4p3w6(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

