/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_2596
 *  net.minecraft.class_2680
 *  net.minecraft.class_2828
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_3532
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2828;
import net.minecraft.class_3532;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bna_2;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tsh_2;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.ghh_2;
import us.m0vy.moondlc.m0vyguard.km;

@tq_2(name="NoClip", category=bzw.OTHER, desc="Attempts to phase through blocks and desync position safely")
public class fs_2
extends bnq {
    private final List thlt = new CopyOnWriteArrayList();
    private boolean dzh_4 = false;
    private boolean khshsh = false;
    private final bql<ghh_2> shdn = this::bhz_4;
    private final bql<bna_2> thya_2 = fs_2::dms_2;
    private final bql<btt> twt = this::ddhkh;
    private static final int jml = 478283340;
    private static final int rbkh = 66521948;
    private static final int a9lsnllqoxim = -533218485;
    private static final int efx4wdi6h2 = 2129995062;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int aikp6970;

    @Override
    public void nt() {
        int n = -299445983;
        int n2 = (n = Integer.rotateLeft(n * -2057644325, 23) ^ 0x187C2831) ^ 0x4B6FD6AE;
        if ((n2 ^ n) != 1265620654) {
            int cfr_ignored_0 = (0xA549078F ^ n) - -1029067027;
        }
        this.thlt.clear();
        this.dzh_4 = false;
        this.khshsh = false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void nc() {
        int n = 1520760010;
        n = Integer.rotateLeft(n * -2129695217, 19) ^ 0x21C03287;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x4581D30;
        if ((n2 ^ n) != 72883504) {
            int cfr_ignored_0 = (0x5EFCE9FA ^ n) - 1912346786;
        }
        if (!this.khshsh && this.dzh_4 && fs_2.mc.field_1724 != null && fs_2.mc.field_1724.field_3944 != null) {
            double d = fs_2.mc.field_1724.method_23317();
            double d2 = fs_2.mc.field_1724.method_23318();
            double d3 = fs_2.mc.field_1724.method_23321();
            float f = fs_2.hthgh(fs_2.mc.field_1724);
            float f2 = fs_2.dthn(fs_2.mc.field_1724);
            fs_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2830(d - Double.longBitsToDouble(0x62215F9EEAF7C833L ^ 0x2292D79EEAF7C833L), d2, d3 - Double.longBitsToDouble(0x55D06451D1476514L ^ 0x1563EC51D1476514L), f, f2, false, false));
            fs_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2830(d, d2, d3, f, f2, fs_2.thghs(fs_2.mc.field_1724), false));
        }
        if (fs_2.mc.field_1724 != null && fs_2.mc.field_1724.field_3944 != null && !this.thlt.isEmpty()) {
            boolean bl = km.zhm_2;
            try {
                km.zhm_2 = true;
                for (class_2596 class_25962 : this.thlt) {
                    fs_2.mc.field_1724.field_3944.method_52787(class_25962);
                }
            }
            finally {
                km.zhm_2 = bl;
            }
            this.thlt.clear();
        }
    }

    private void ddhkh(btt btt2) {
        int n;
        int n2;
        int n3 = -950961936;
        n3 = Integer.rotateLeft(n3 * 415240057, 13) ^ 0xFFD4869D;
        btt btt3 = btt2;
        n3 = Integer.rotateLeft((btt3 != null ? System.identityHashCode(btt3) : 0) ^ n3, 18);
        int n4 = n3 ^ 0x4CAD9D16;
        if ((n4 ^ n3) != 1286446358) {
            int cfr_ignored_0 = (0x8BFCE5E6 ^ n3) - 962189413;
        }
        if (fs_2.mc.field_1724 == null || fs_2.mc.field_1687 == null) {
            return;
        }
        fs_2.mc.field_1724.method_18800(fs_2.mc.field_1724.method_18798().field_1352, 0.0, fs_2.mc.field_1724.method_18798().field_1350);
        class_238 class_2383 = fs_2.mc.field_1724.method_5829().method_1014(Double.longBitsToDouble(0xA7D4028044D74EDCL ^ 0x988460CD9626E720L));
        int n5 = class_3532.method_15357((double)class_2383.field_1323);
        int n6 = class_3532.method_15357((double)class_2383.field_1322);
        int n7 = class_3532.method_15357((double)class_2383.field_1321);
        int n8 = class_3532.method_15357((double)class_2383.field_1320);
        int n9 = class_3532.method_15357((double)class_2383.field_1325);
        int n10 = class_3532.method_15357((double)class_2383.field_1324);
        long l = 0L;
        long l2 = 0L;
        for (n2 = n5; n2 <= n8; ++n2) {
            for (n = n6; n <= n9; ++n) {
                for (int i = n7; i <= n10; ++i) {
                    class_2338 class_23382 = new class_2338(n2, n, i);
                    class_2680 class_26802 = fs_2.mc.field_1687.method_8320(class_23382);
                    ++l;
                    if (!class_26802.method_51367()) continue;
                    ++l2;
                }
            }
        }
        n2 = l2 == 0L ? 1 : 0;
        int n11 = n = l2 > 0L && l2 < l ? 1 : 0;
        if (!this.dzh_4 && n != 0) {
            double d = fs_2.mc.field_1724.method_23317();
            double d2 = fs_2.mc.field_1724.method_23318();
            double d3 = fs_2.mc.field_1724.method_23321();
            float f = fs_2.mc.field_1724.method_36454();
            float f2 = fs_2.mc.field_1724.method_36455();
            boolean bl = fs_2.mc.field_1724.method_24828();
            for (int i = 0; i < 2; ++i) {
                fs_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2830(d, d2, d3, f, f2, bl, false));
            }
            this.dzh_4 = true;
            return;
        }
        if (this.dzh_4 && n2 != 0) {
            this.khshsh = true;
            this.dwkh();
        }
    }

    private static void dms_2(bna_2 bna2) {
        int n = -1240911953;
        int n2 = (n = Integer.rotateLeft(n * -2112171131, 9) ^ 0xEE23A6C3) ^ 0xB8CCAA4F;
        if ((n2 ^ n) != -1194546609) {
            int cfr_ignored_0 = (0xEC585E0 ^ n) - -834607689;
        }
        bna2.dhtd_2();
    }

    private void bhz_4(ghh_2 ghh2) {
        int n = tsh_2.ajkh(1649731446);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x69346D61;
        if ((n2 ^ n) != 1765043553) {
            int cfr_ignored_0 = (Integer.rotateRight(0xB608A17 ^ n, 4) - 1695438852) * 190876183;
        }
        if (fs_2.mc.field_1724 == null) {
            return;
        }
        class_2596 class_25962 = ghh2.zjd();
        if (class_25962 instanceof class_2828) {
            this.thlt.add(class_25962);
            ghh2.dhtd_2();
        }
    }

    private static float hthgh(class_746 class_7462) {
        block0: {
            int n = -1546283382;
            int n2 = (n = Integer.rotateLeft(n * 1246288657, 27) ^ 0x3674AFD1) ^ 0xA2363C2;
            if ((n2 ^ n) == 170091458) break block0;
            int cfr_ignored_0 = (0xA9F6F548 ^ n) - -1880405754;
        }
        return class_7462.method_36454();
    }

    private static float dthn(class_746 class_7462) {
        block0: {
            int n = 1989546922;
            n = Integer.rotateLeft(n * -233755481, 5) ^ 0x67C0F984;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0x4DC0C2C0;
            if ((n2 ^ n) == 1304478400) break block0;
            int cfr_ignored_0 = (0x3B56D16A ^ n) - -447659508;
        }
        return class_7462.method_36455();
    }

    private static boolean thghs(class_746 class_7462) {
        block0: {
            int n = 2086545347;
            int n2 = (n = Integer.rotateLeft(n * -1185865743, 26) ^ 0x405313B5) ^ 0xFECEE2A4;
            if ((n2 ^ n) == -19995996) break block0;
            int cfr_ignored_0 = (0x8290C567 ^ n) + -1842452687;
        }
        return class_7462.method_24828();
    }

    private static String[] dthl_2(String string) {
        block0: {
            int n = -433973788;
            n = Integer.rotateLeft(n * -470044559, 23) ^ 0xCA4D727E;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 25);
            int n2 = n ^ 0x557BEE45;
            if ((n2 ^ n) == 1434185285) break block0;
            int cfr_ignored_0 = (0xB359FBA1 ^ n) - 2727420;
        }
        return string.split("\u0006\u001c", -1);
    }

    private static CallSite aay_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -711232055;
            n3 = Integer.rotateLeft(n3 * -1205726695, 19) ^ 0xEC2C2505;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 4);
            int n4 = n3 ^ 0x6D3D64B0;
            if ((n4 ^ n3) != 1832740016) {
                int cfr_ignored_0 = (0xB8A61179 ^ n3) + -71359886;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ jml ^ string.hashCode()) + (n2 + rbkh) + i ^ jml, 25) + rbkh);
            }
            String[] stringArray = fs_2.dthl_2(new String(cArray));
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

    private static String[] nxryv4u1zbon(String string) {
        return string.split("\u0007\u001a", -1);
    }

    private static CallSite lf03orqnv1x(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ a9lsnllqoxim ^ string.hashCode() ^ n2 + efx4wdi6h2 ^ i * -1852524393 ^ a9lsnllqoxim, 5) ^ efx4wdi6h2));
            }
            String[] stringArray = fs_2.nxryv4u1zbon(new String(cArray));
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

