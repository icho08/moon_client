/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.zb;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Vehicle Boost", category=bzw.OTHER, desc="Boosts player velocity when leaving a vehicle")
public class bkhd
extends bnq {
    public final tay sqj = new tay(this, "Horizo".concat("ntal Speed")).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0xA12C1C78 ^ 0x921F288F, 22))).dhbs_2(Float.intBitsToFloat(-425222231 - -1517838423)).rkh_3(Float.intBitsToFloat(1491765234 + -454933285)).ssd_5(2.0f);
    public final tay tht_6 = new tay(this, "Vertical Speed").shth_7(Float.intBitsToFloat(0x16AFA310 ^ 0x2B636FDD)).dhbs_2(Float.intBitsToFloat(902132248 - -182095336)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x79B86777 ^ 0x10560111, 5))).ssd_5(1.0f);
    private boolean shdw = false;
    private final bql<btt> ztkh_2 = this::dshm_2;
    private static final int shqsh = 1293303626;
    private static final int tzsh = -681790393;
    private static final int jqth = 1513898201;
    private static final int shna_2 = 1776226691;
    private static final int glx1wt7n = 1151805660;
    private static final int f2k8kjzkm2bnk = -680169730;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int mo3r7skojdmomw;

    @Override
    public void nt() {
        try {
            int n = -900383882;
            n = Integer.rotateLeft(n * -2103339389, 4) ^ 0x757148E6;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8913EB9D;
            if ((n2 ^ n) != -1995183203) {
                int cfr_ignored_0 = (0x4346D0EB ^ n) - -1729324758;
            }
            if ((0x1C4 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bkhd.ghrk()) {
            throw null;
        }
        this.shdw = bkhd.mc.field_1724 != null && bkhd.mc.field_1724.method_5765();
        super.nt();
    }

    private void dshm_2(btt btt2) {
        boolean bl = false;
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        int n = 0;
        int n2 = zb.dhshf(638407444);
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x2BDE232F, 12)));
        block34: while (true) {
            switch (Integer.rotateRight(n3, 12) ^ n2) {
                case 735978287: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x46EB6348 ^ n2, 11) + -1696684813;
                    if (bkhd.mc.field_1724 != null) {
                        n3 = Integer.rotateLeft(n2 ^ 0x82D8A5B2, 12) ^ 0xE9854ED3 ^ 0xE9854ED3;
                        int cfr_ignored_1 = Integer.rotateLeft(0x3545D4C9 ^ n2, 9) + 2010276754;
                        int cfr_ignored_2 = (int)(0xF7F77AF427D4EB4FL ^ (long)n2 ^ 0x898831A2DB8423FL);
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x26F07826, 12)));
                        n += 5;
                        continue block34;
                    }
                    int cfr_ignored_3 = (int)(0x137F68B115201CFEL ^ (long)n2 ^ 0x2C12E6F3C2DB8B2FL);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xAD760D73, 12) ^ 0x9CC9F3C5820E93F0L ^ 0x9CC9F3C5820E93F0L);
                    int cfr_ignored_4 = (int)(0x6273EDA0F7300F22L ^ (long)n2 ^ 0x263122D3E5636936L);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x56D1F9B2, 12) ^ 0x76195CFE1A454A70L ^ 0x76195CFE1A454A70L);
                    continue block34;
                }
                case 640040210: {
                    int cfr_ignored_5 = (Integer.rotateRight(0x133FE57E ^ n2, 5) - 1494903165) * 322954623;
                    d = Math.toRadians(bkhd.mc.field_1724.method_36454());
                    d2 = -Math.sin(d) * (double)this.sqj.thw_5();
                    d3 = this.tht_6.thw_5();
                    d4 = Math.cos(d) * (double)this.sqj.thw_5();
                    bkhd.mc.field_1724.method_18800(d2, d3, d4);
                    try {
                        if ((0xC2A602493B8CDCABL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0xC933BD29, 12);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xC933BD29, 12) ^ 0x926C31DF9C1C85BAL ^ 0x926C31DF9C1C85BAL);
                    }
                    n += 5;
                    continue block34;
                }
                case -102914110: {
                    int cfr_ignored_6 = (Integer.rotateRight(0x3ADC4C9F ^ n2, 10) - 621471356) * 987516063;
                    if (bl) {
                        n3 = Integer.rotateLeft(n2 ^ 0xC933BD29, 12) ^ 0xF3F456CC ^ 0xF3F456CC;
                        int cfr_ignored_7 = (Integer.rotateRight(0x2702BD1F ^ n2, 7) - -1112373764) * 654490911;
                        n += 5;
                        continue block34;
                    }
                    try {
                        n += 2;
                        if ((0x4BF7C0BC8B0E94C5L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x26263D12, 12) + 1211447963 - 1211447963;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x26263D12, 12)));
                    }
                    n += 5;
                    continue block34;
                }
                case -919356119: {
                    int cfr_ignored_8 = (Integer.rotateLeft(0x77F20498 ^ n2, 17) + -1968427613) * 2012349593;
                    this.shdw = bl;
                    return;
                }
                case -1928916187: {
                    int cfr_ignored_9 = Integer.rotateRight(0x904E2F02 ^ n2, 5) + 2111131769;
                    this.shdw = bl;
                    return;
                }
                case 1456601522: {
                    int cfr_ignored_10 = (Integer.rotateLeft(0xDFF61ADD ^ n2, 14) - 590012414) * -537519395;
                    int cfr_ignored_11 = (int)(0x1D44B4E027D4EB4FL ^ (long)n2 ^ 0x94B0831A2DB99758L);
                    return;
                }
                case 653293606: {
                    int cfr_ignored_12 = (Integer.rotateLeft(0xB2132099 ^ n2, 9) + -1800498750) * -1307369319;
                    int cfr_ignored_13 = (int)(0x70A18EA427D4EB4FL ^ (long)n2 ^ 0xE038831A2DB94C92L);
                    bl = bkhd.mc.field_1724.method_5765();
                    if (!this.shdw) {
                        int cfr_ignored_14 = (int)(0x92E78E1AA151F2C8L ^ (long)n2 ^ 0xE1458E101EB6881EL);
                        n3 = Integer.rotateLeft(n2 ^ 0x8D071325, 12);
                        continue block34;
                    }
                    int cfr_ignored_15 = (int)(0x42CD66C93ACF7515L ^ (long)n2 ^ 0x30E2B92D110D284BL);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xF9DDA7C2, 12) ^ 0x9CE61839CC3F4E93L ^ 0x9CE61839CC3F4E93L);
                    ++n;
                    continue block34;
                }
                case 1864897185: {
                    int cfr_ignored_16 = (Integer.rotateLeft(0x14197EB9 ^ n2, 5) + 1936979874) * 337215161;
                    int cfr_ignored_17 = (int)(0xD6ABD08427D4EB4FL ^ (long)n2 ^ 0x5C78831A2DB80086L);
                    n3 = Integer.rotateLeft(n2 ^ 0xEECADED6, 12) ^ 0x8BAD6295 ^ 0x8BAD6295;
                    int cfr_ignored_18 = (Integer.rotateLeft(0xD3DE4455 ^ n2, 13) - -1404574330) * -740408235;
                    int cfr_ignored_19 = (int)(0x116CEA6827D4EB4FL ^ (long)n2 ^ 0x29A0831A2DB98F08L);
                    int cfr_ignored_20 = (int)(0x2FF9CF0FC8A78CB8L ^ (long)n2 ^ 0x636F5DFCE257F222L);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x359BB443, 12) ^ 0x106D8510FF68B403L ^ 0x106D8510FF68B403L);
                    int cfr_ignored_21 = (int)(0x7220E9CF4D7569FDL ^ (long)n2 ^ 0x2EEE565928DD4990L);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x2BDE232F, 12) ^ 0x96E5209FBE4A62FEL ^ 0x96E5209FBE4A62FEL);
                    n -= 2;
                    continue block34;
                }
                case 616798795: {
                    int cfr_ignored_22 = Integer.rotateLeft(0x453149C4 ^ n2, 11) - 1700105719;
                    n3 = Integer.rotateLeft(n2 ^ 0xBA5CF359, 12);
                    int cfr_ignored_23 = Integer.rotateLeft(0xC90CB201 ^ n2, 12) + 1558654298;
                    int cfr_ignored_24 = (int)(0xBBE1C3C27D4EB4FL ^ (long)n2 ^ 0xC508831A2DB9BAADL);
                    n3 = Integer.rotateLeft(n2 ^ 0x2BDE232F, 12) ^ 0x998023A ^ 0x998023A;
                    --n;
                    continue block34;
                }
                case -203829779: {
                    int cfr_ignored_25 = (Integer.rotateLeft(0xE3EF8DD0 ^ n2, 15) + -1637889173) * -470839855;
                    n3 = Integer.rotateLeft(n2 ^ 0x6BD38792, 12) + -871398310 - -871398310;
                    int cfr_ignored_26 = (Integer.rotateRight(0xEA50611B ^ n2, 16) + 1679384960) * -363831013;
                    int cfr_ignored_27 = (int)(0xB288F2F58BE7CD34L ^ (long)n2 ^ 0x189BDB7C614EC8C0L);
                    n3 = Integer.rotateLeft(n2 ^ 0x2BDE232F, 12) ^ 0x8E0E1937 ^ 0x8E0E1937;
                    n += 2;
                    continue block34;
                }
                case 1241802687: {
                    int cfr_ignored_28 = (Integer.rotateLeft(0xF2E826B1 ^ n2, 17) + 1853509290) * -219666767;
                    int cfr_ignored_29 = (int)(0x305A888C27D4EB4FL ^ (long)n2 ^ 0xEC68831A2DB9CD64L);
                    int cfr_ignored_30 = (int)(0xEEB4E983E95260A9L ^ (long)n2 ^ 0x2E771E173A7470B8L);
                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x2BDE232F, 12) ^ 0xE383C25170636B37L ^ 0xE383C25170636B37L);
                    continue block34;
                }
                case 357744641: {
                    int cfr_ignored_31 = (Integer.rotateLeft(0x8ECE5051 ^ n2, 4) + 1331255562) * -1899081647;
                    int cfr_ignored_32 = (int)(0x4C7CFE6C27D4EB4FL ^ (long)n2 ^ 0x1A8831A2DB93528L);
                    n3 = Integer.rotateLeft(n2 ^ 0x26936FCF, 12) + 61464758 - 61464758;
                    int cfr_ignored_33 = (Integer.rotateLeft(0x9542331 ^ n2, 4) + 630055466) * 156508977;
                    int cfr_ignored_34 = (int)(0xCBE68D0C27D4EB4FL ^ (long)n2 ^ 0xE768831A2DB83A1CL);
                    try {
                        if ((0xF72D70C2A8371397L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x2BDE232F, 12) + -682066752 - -682066752;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x2BDE232F, 12);
                    }
                    continue block34;
                }
                case 665118041: {
                    int cfr_ignored_35 = (Integer.rotateLeft(0x88D31719 ^ n2, 4) + -1779602622) * -1999431911;
                    int cfr_ignored_36 = (int)(0x4A61B92427D4EB4FL ^ (long)n2 ^ 0x8F38831A2DB93912L);
                    n3 = Integer.rotateLeft(n2 ^ 0x8B31B7FC, 12) + -1122718931 - -1122718931;
                    int cfr_ignored_37 = Integer.rotateLeft(0xF5F26B24 ^ n2, 17) - -860317545;
                    try {
                        if ((0xAB1CB9CBD1CF7FAFL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x2BDE232F, 12) ^ 0x49F41B44 ^ 0x49F41B44;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x2BDE232F, 12)));
                    }
                    n -= 3;
                    continue block34;
                }
                case 1524714264: {
                    int cfr_ignored_38 = Integer.rotateRight(0x40FEBD87 ^ n2, 11) - -482962796;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x2BDE232F, 12)));
                    int cfr_ignored_39 = Integer.rotateRight(0x1221A86B ^ n2, 5) + 913376304;
                    n -= 3;
                    continue block34;
                }
                case -2142187163: {
                    int cfr_ignored_40 = (Integer.rotateLeft(0x5A53E1DC ^ n2, 14) - -192546593) * 1515446749;
                    try {
                        n -= 4;
                        if ((0x7B653A7999F91E41L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.rotateLeft(n2 ^ 0x2BDE232F, 12) + 495267116 - 495267116;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.rotateLeft(n2 ^ 0x2BDE232F, 12);
                    }
                    continue block34;
                }
                case -1314461370: {
                    int cfr_ignored_41 = (Integer.rotateRight(0x49D96F97 ^ n2, 12) - -172875132) * 1238986647;
                    n3 = Integer.rotateLeft(n2 ^ 0xB97698F3, 12);
                    int cfr_ignored_42 = (Integer.rotateRight(0xD3E5ADBE ^ n2, 13) - -1389516483) * -739922497;
                    n3 = Integer.rotateLeft(n2 ^ 0x2BDE232F, 12) ^ 0x6D9985B3 ^ 0x6D9985B3;
                    int cfr_ignored_43 = (Integer.rotateLeft(0xA1D07090 ^ n2, 7) + -1667546965) * -1580175215;
                    n += 4;
                    continue block34;
                }
                case 253408424: {
                    int cfr_ignored_44 = (Integer.rotateLeft(0xCF0CC8DD ^ n2, 12) - 384430590) * -821245731;
                    int cfr_ignored_45 = (int)(0xDBE66E027D4EB4FL ^ (long)n2 ^ 0x30B0831A2DB9B6ADL);
                    n3 = Integer.rotateLeft(n2 ^ 0x2BDE232F, 12);
                    continue block34;
                }
                case 1399733709: {
                    int cfr_ignored_46 = Integer.rotateRight(0x980FB66E ^ n2, 6) - 1849996941;
                    n3 = Integer.rotateLeft(n2 ^ 0xC7F9296B, 12) + -1514765484 - -1514765484;
                    int cfr_ignored_47 = (Integer.rotateRight(0xEAFEAC57 ^ n2, 16) - 2033483204) * -352408489;
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x2BDE232F, 12)));
                    n += 4;
                    continue block34;
                }
                case -1690413563: {
                    int cfr_ignored_48 = Integer.rotateLeft(0xFD3CB225 ^ n2, 18) - -1363725898;
                    int cfr_ignored_49 = (int)(0x3F8E1C1827D4EB4FL ^ (long)n2 ^ 0xC540831A2DB9D2CDL);
                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xA4E680F1, 12)));
                    int cfr_ignored_50 = (Integer.rotateLeft(0xE6213B71 ^ n2, 15) + -496774678) * -434029711;
                    int cfr_ignored_51 = (int)(0x2493954C27D4EB4FL ^ (long)n2 ^ 0xD7E8831A2DB9E4F6L);
                    int cfr_ignored_52 = (int)(0xDB0D001EDB600671L ^ (long)n2 ^ 0xFD4D7A73F7C41BCBL);
                    n3 = Integer.rotateLeft(n2 ^ 0x2BDE232F, 12) + 471138193 - 471138193;
                    n += 4;
                    continue block34;
                }
                case 1421597269: {
                    int cfr_ignored_53 = Integer.rotateRight(0x56977A0E ^ n2, 13) - -2135595283;
                    try {
                        n -= 3;
                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x2BDE232F, 12)));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x2BDE232F, 12) ^ 0x529A178EFCF01CDFL ^ 0x529A178EFCF01CDFL);
                    }
                    --n;
                    continue block34;
                }
            }
            int cfr_ignored_54 = (Integer.rotateRight(0x25DF049A ^ n2, 7) + -1705038367) * 635372699;
            n3 = Integer.rotateLeft(n2 ^ 0x2BDE232F, 12);
        }
    }

    private static String thdd(String string, int n, int n2, int n3) {
        try {
            int n4 = 1050206297;
            n4 = Integer.rotateLeft(n4 * 1495708695, 25) ^ 0x99148995;
            n4 = Integer.rotateRight(n2 ^ n4, 8);
            int n5 = n4 ^ 0x65FA8C82;
            if ((n5 ^ n4) != 1710918786) {
                int cfr_ignored_0 = (0x5B626CDB ^ n4) - 1229596455;
            }
            if ((0x3E1 & 0) != 0) {
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
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x660CE491 ^ n2 - i) + tzsh, 10) ^ shqsh + i * 1026545843));
        }
        return new String(cArray);
    }

    private static boolean ghrk() {
        block0: {
            int n = -290356069;
            int n2 = (n = Integer.rotateLeft(n * 808946785, 24) ^ 0xCF0294D0) ^ 0x1F468D46;
            if ((n2 ^ n) == 524717382) break block0;
            int cfr_ignored_0 = (0xF1F709DD ^ n) + 1086669298;
        }
        return yf.dnkh();
    }

    private static String[] zbf(String string) {
        block0: {
            int n = 1164040254;
            n = Integer.rotateLeft(n * -1278509921, 14) ^ 0x6DC2320B;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 28);
            int n2 = n ^ 0x7F8696AF;
            if ((n2 ^ n) == 2139526831) break block0;
            int cfr_ignored_0 = (0x3AE74E91 ^ n) + -15500755;
        }
        return string.split("\u0005\u001f", -1);
    }

    private static CallSite dlsh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 2114022643;
            n3 = Integer.rotateLeft(n3 * 1855158937, 3) ^ 0x54BE2388;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xF685732B;
            if ((n4 ^ n3) != -159026389) {
                int cfr_ignored_0 = (0x88841FD8 ^ n3) + 1459454095;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ jqth ^ string.hashCode() ^ n2 + shna_2 + i * -248487403) + jqth) ^ shna_2));
            }
            String[] stringArray = bkhd.zbf(new String(cArray));
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

    private static String[] dwx4th9fa(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite m5d5b4scw4gnk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ glx1wt7n ^ string.hashCode() ^ n2 + f2k8kjzkm2bnk + i * -854672901) + glx1wt7n) ^ f2k8kjzkm2bnk));
            }
            String[] stringArray = bkhd.dwx4th9fa(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

