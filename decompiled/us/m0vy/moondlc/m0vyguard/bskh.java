/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_2338
 *  net.minecraft.class_2382
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_2596
 *  net.minecraft.class_2828$class_2829
 *  net.minecraft.class_2833
 *  net.minecraft.class_310
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_2382;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_2833;
import net.minecraft.class_310;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.bdh_3;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzh_4;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tat;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.kb;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Boat Tp", category=bzw.OTHER, desc="Teleports player and boat to looked block on key press")
public class bskh
extends bnq {
    public final bdh_3 rmb = new bdh_3(this, "Tele".concat("port Key")).ztn_4(-1);
    public final tay znb = new tay(this, "Range").shth_7(Float.intBitsToFloat(2053991562 + -961375370)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x76935984 ^ 0x76937839, 17))).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x4D94C9E0 ^ 0x1D94C9C0, 25))).ssd_5(Float.intBitsToFloat(Integer.reverse(-202873800) ^ 0x5EEE17CF));
    public final tay srs = new tay(this, "Step Size").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(0xB50780CE ^ 0xF4A780CE)).rkh_3(Float.intBitsToFloat(0x1C92D2E8 ^ 0x2392D2E8)).ssd_5(Float.intBitsToFloat(Integer.reverse(413659939) ^ 0x85CFE518));
    private final bql<kb> hght = this::khrk;
    private static final int rtw_2 = 112925214;
    private static final int rkhf = -628429150;
    private static final int bdhs_2 = -18996468;
    private static final int ttz = -1624532736;
    private static final int mvew199g = 953068366;
    private static final int newntjl = -1471657810;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int y7dkhrqb;

    private class_243 rjd(double d) {
        class_243 class_2432;
        class_243 class_2433;
        int n = tat.ghdd_2(1064970472);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 23);
        int n2 = n ^ 0x8985C06F;
        if ((n2 ^ n) != -1987723153) {
            int cfr_ignored_0 = Integer.rotateRight(0xB6FFE887 ^ n, 9) - 760924052;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        class_310 class_3102 = bskh.jthsh();
        if (class_3102.field_1724 == null) {
            return null;
        }
        class_243 class_2434 = bskh.daq_2(class_3102.field_1724);
        class_3965 class_39652 = class_3102.field_1687.method_17742(new class_3959(class_2434, class_2433 = class_2434.method_1019((class_2432 = class_3102.field_1724.method_5828(1.0f)).method_1021(d)), class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)class_3102.field_1724));
        if (class_39652 != null && class_39652.method_17783() == class_239.class_240.field_1332) {
            class_2338 class_23382 = bskh.zsb(class_39652);
            class_2338 class_23383 = class_23382.method_10093(class_39652.method_17780());
            return class_243.method_24955((class_2382)class_23383);
        }
        return null;
    }

    private void khrk(kb kb2) {
        int n = 411675490;
        n = Integer.rotateLeft(n * -561883019, 15) ^ 0xD2928F1;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 10);
        kb kb3 = kb2;
        n = Integer.rotateLeft((kb3 != null ? System.identityHashCode(kb3) : 0) ^ n, 16);
        int n2 = n ^ 0x8DFCBC73;
        if ((n2 ^ n) != -1912816525) {
            int cfr_ignored_0 = (0x95751711 ^ n) + 1255272370;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (bskh.mc.field_1724 == null || bskh.mc.field_1687 == null) {
            return;
        }
        if (kb2.dnd_3() == 1 && this.rmb.sdhkh() != -1 && kb2.zthgh_2() == this.rmb.sdhkh()) {
            class_1297 class_12972 = bskh.mc.field_1724.method_5854();
            if (class_12972 != null) {
                class_243 class_2432 = this.rjd(this.znb.thw_5());
                if (class_2432 != null) {
                    class_243 class_2433 = class_12972.method_19538();
                    double d = class_2433.method_1022(class_2432);
                    double d2 = this.srs.thw_5();
                    int n3 = (int)Math.ceil(d / d2);
                    for (int i = 1; i <= n3; ++i) {
                        double d3 = (double)i / (double)n3;
                        double d4 = class_2433.field_1352 + (class_2432.field_1352 - class_2433.field_1352) * d3;
                        double d5 = class_2433.field_1351 + (class_2432.field_1351 - class_2433.field_1351) * d3;
                        double d6 = class_2433.field_1350 + (class_2432.field_1350 - class_2433.field_1350) * d3;
                        class_12972.method_5814(d4, d5, d6);
                        bskh.mc.field_1724.method_5814(d4, d5, d6);
                        bskh.mc.field_1724.field_3944.method_52787((class_2596)new class_2833(class_12972.method_19538(), class_12972.method_36454(), class_12972.method_36455(), class_12972.method_24828()));
                        bskh.mc.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2829(d4, d5, d6, true, false));
                    }
                    bzh_4.ttht_3(class_2561.method_30163((String)("§a[BoatTp] Teleported " + String.format("%.1f", d) + " blocks.")));
                } else {
                    bzh_4.ttht_3(class_2561.method_30163((String)"\u00a7c[BoatTp] Cannot find ta".concat("rget block to teleport to.")));
                }
            } else {
                bzh_4.ttht_3(class_2561.method_30163((String)"\u00a7c[BoatTp] You must be in a ".concat("boat/vehicle to teleport.")));
            }
        }
    }

    private static String ssy_4(String string, int n, int n2, int n3) {
        int n4 = 769236829;
        n4 = Integer.rotateLeft(n4 * 2086684257, 6) ^ 0xEF4DD023;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 22)) ^ 0x30F5B788;
        if ((n5 ^ n4) != 821409672) {
            int cfr_ignored_0 = (0x1D2C28D5 ^ n4) + 1152461652;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x28092C16) + rtw_2 ^ Integer.reverse(n2 + i * -37515153), 14) - rkhf);
        }
        return new String(cArray);
    }

    private static class_310 jthsh() {
        block0: {
            int n = tat.ghdd_2(1613629807);
            int n2 = n ^ 0x7DA0DA8B;
            if ((n2 ^ n) == 2107693707) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x1D8ED3E4 ^ n, 6) - -1733736489;
        }
        return class_310.method_1551();
    }

    private static class_243 daq_2(class_746 class_7462) {
        block0: {
            int n = 1824364617;
            int n2 = (n = Integer.rotateLeft(n * 1704171721, 25) ^ 0x94ECD63) ^ 0x5C67C667;
            if ((n2 ^ n) == 1550304871) break block0;
            int cfr_ignored_0 = (0x30DA5E2E ^ n) + 595085491;
        }
        return class_7462.method_33571();
    }

    private static class_2338 zsb(class_3965 class_39652) {
        block0: {
            int n = -229131347;
            int n2 = (n = Integer.rotateLeft(n * 444994555, 17) ^ 0x23AC9D17) ^ 0xE482E93;
            if ((n2 ^ n) == 239611539) break block0;
            int cfr_ignored_0 = (0xFC1F953E ^ n) + -2073066047;
        }
        return class_39652.method_17777();
    }

    private static String[] dhar_2(String string) {
        int n = -1512073913;
        n = Integer.rotateLeft(n * 1364542781, 9) ^ 0x9AAD956D;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x85F29857;
        if ((n2 ^ n) != -2047698857) {
            int cfr_ignored_0 = (0x202D0D10 ^ n) - 1464421094;
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

    private static CallSite dhdhz_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1577671751;
            n3 = Integer.rotateLeft(n3 * 236202857, 20) ^ 0xABCAE1F4;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 10);
            n3 = n ^ n3;
            int n4 = n3 ^ 0x14AACEB2;
            if ((n4 ^ n3) != 346738354) {
                int cfr_ignored_0 = (0xB55C6D0B ^ n3) - 477540951;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ bdhs_2 ^ string.hashCode()) + (n2 + ttz) + i ^ bdhs_2, 24) + ttz);
            }
            String[] stringArray = bskh.dhar_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] csrv44p5mspw(String string) {
        return string.split("\u0006\u000e", -1);
    }

    private static CallSite e6zum1lil2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ mvew199g ^ string.hashCode() ^ n2 + newntjl + i * -689186587) + mvew199g) ^ newntjl));
            }
            String[] stringArray = bskh.csrv44p5mspw(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

