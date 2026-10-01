/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1297
 *  net.minecraft.class_1303
 *  net.minecraft.class_1542
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_2478
 *  net.minecraft.class_2596
 *  net.minecraft.class_2680
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_2828$class_2831
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 *  net.minecraft.class_2879
 *  net.minecraft.class_2885
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_4050
 *  net.minecraft.class_638
 *  net.minecraft.class_7204
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1303;
import net.minecraft.class_1542;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2478;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2828;
import net.minecraft.class_2848;
import net.minecraft.class_2879;
import net.minecraft.class_2885;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4050;
import net.minecraft.class_638;
import net.minecraft.class_7204;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.baf;
import us.m0vy.moondlc.m0vyguard.bzr;
import us.m0vy.moondlc.m0vyguard.bfn;
import us.m0vy.moondlc.m0vyguard.thdh;
import us.m0vy.moondlc.m0vyguard.tshh;
import us.m0vy.moondlc.m0vyguard.kha;
import us.m0vy.moondlc.m0vyguard.dj_2;
import us.m0vy.moondlc.m0vyguard.lj;
import us.m0vy.moondlc.m0vyguard.mth;
import us.m0vy.moondlc.m0vyguard.nw;
import us.m0vy.moondlc.m0vyguard.yf;

public final class btj_2 {
    private static final class_310 mc;
    private static final List zshm;
    public static Map jrh;
    public static float[] dhsw_2;
    public static Boolean dhsdh_2;
    public static Float rsj_2;
    private static final int thkh_2 = 1546094096;
    private static final int dhkht = -569734110;
    private static final int sjf_2 = 2058831895;
    private static final int khzm_2 = -377963144;
    private static final int wnmkyf00yd = 1091395361;
    private static final int sp18e26el2t = 918660214;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ykk7qeluu0n8l;

    public static void sdd_3(float f, float f2) {
        int n = -1234893226;
        n = Integer.rotateLeft(n * -2039761233, 14) ^ 0xCF9198CB;
        n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 15);
        n = Float.floatToIntBits(f2) ^ n;
        int n2 = n ^ 0xF2E8183E;
        if ((n2 ^ n) != -219670466) {
            int cfr_ignored_0 = (0x448D1E68 ^ n) + -964135242;
        }
        dhsw_2 = new float[]{f, class_3532.method_15363((float)f2, (float)btj_2.aghk(975761606 - 2004152518), (float)Float.intBitsToFloat(Integer.rotateLeft(0x48CE9959 ^ 0x484BF159, 7)))};
        rsj_2 = Float.valueOf(f);
    }

    public static void hrr() {
        int n = -1619573604;
        int n2 = (n = Integer.rotateLeft(n * -2049898427, 14) ^ 0x94D6445D) ^ 0x3ED03DB0;
        if ((n2 ^ n) != 1053834672) {
            int cfr_ignored_0 = (0xA1A7792C ^ n) + 0x3D5D5D55;
        }
        dhsw_2 = null;
        dhsdh_2 = null;
        rsj_2 = null;
    }

    public static boolean tmz_4(class_2338 class_23382, dj_2 dj2_2, boolean bl) {
        return btj_2.zdhz_3(class_23382, dj2_2, bl, true);
    }

    public static boolean zdhz_3(class_2338 class_23382, dj_2 dj2_2, boolean bl, boolean bl2) {
        class_3965 class_39652 = btj_2.twd_4(class_23382, dj2_2, bl);
        return btj_2.hshkh(class_23382, class_39652, bl2);
    }

    public static boolean hshkh(class_2338 class_23382, class_3965 class_39652, boolean bl) {
        boolean bl2;
        if (class_39652 == null || btj_2.mc.field_1687 == null || btj_2.mc.field_1761 == null || btj_2.mc.field_1724 == null) {
            return false;
        }
        class_2680 class_26802 = btj_2.mc.field_1687.method_8320(class_39652.method_17777());
        if ((class_26802.method_26215() || class_26802.method_51176()) && !jrh.containsKey(class_39652.method_17777())) {
            return false;
        }
        boolean bl3 = bl2 = btj_2.ghzm(btj_2.mc.field_1687.method_8320(class_39652.method_17777()).method_26204()) && !btj_2.mc.field_1724.method_5715();
        if (bl2) {
            btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)btj_2.mc.field_1724, class_2848.class_2849.field_12979));
        }
        btj_2.bhd_2(arg_0 -> btj_2.ghdk(class_39652, arg_0));
        jrh.put(class_23382, System.currentTimeMillis());
        if (bl2) {
            btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)btj_2.mc.field_1724, class_2848.class_2849.field_12984));
        }
        if (bl) {
            btj_2.mc.field_1724.method_6104(class_1268.field_5808);
        }
        return true;
    }

    public static class_243 sbz(class_1297 class_12972) {
        try {
            int n = -1543409684;
            n = Integer.rotateLeft(n * 1900953955, 7) ^ 0x1C699131;
            class_1297 class_12973 = class_12972;
            n = Integer.rotateRight((class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n, 24);
            int n2 = n ^ 0xFAB94FCA;
            if ((n2 ^ n) != -88518710) {
                int cfr_ignored_0 = (0x5EB82026 ^ n) + -1008276010;
            }
            if ((0x2B1 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (btj_2.tlt()) {
            throw null;
        }
        return class_12972.method_19538().method_1031(0.0, (double)btj_2.shmn(class_12972, class_12972.method_18376()), 0.0);
    }

    public static float[] msh(class_243 class_2432) {
        return btj_2.zkhw(btj_2.sbz((class_1297)btj_2.mc.field_1724), class_2432);
    }

    public static float[] zkhw(class_243 class_2432, class_243 class_2433) {
        double d = class_2433.field_1352 - class_2432.field_1352;
        double d2 = (class_2433.field_1351 - class_2432.field_1351) * -1.0;
        double d3 = class_2433.field_1350 - class_2432.field_1350;
        double d4 = class_3532.method_15355((float)((float)(d * d + d3 * d3)));
        float f = (float)class_3532.method_15338((double)(Math.toDegrees(Math.atan2(d3, d)) - 90.0));
        float f2 = (float)class_3532.method_15350((double)class_3532.method_15338((double)Math.toDegrees(Math.atan2(d2, d4))), (double)-90.0, (double)90.0);
        float f3 = baf.tssh_3();
        float f4 = f - btj_2.mc.field_1724.method_36454();
        float f5 = f2 - btj_2.mc.field_1724.method_36455();
        f4 = class_3532.method_15393((float)f4);
        f4 = (float)Math.round(f4 / f3) * f3;
        f5 = (float)Math.round(f5 / f3) * f3;
        return new float[]{btj_2.mc.field_1724.method_36454() + f4, btj_2.mc.field_1724.method_36455() + f5};
    }

    public static float[] dhnz(class_243 class_2432) {
        return btj_2.thsf_2(btj_2.sbz((class_1297)btj_2.mc.field_1724), class_2432);
    }

    public static float[] thsf_2(class_243 class_2432, class_243 class_2433) {
        double d = class_2433.field_1352 - class_2432.field_1352;
        double d2 = (class_2433.field_1351 - class_2432.field_1351) * -1.0;
        double d3 = class_2433.field_1350 - class_2432.field_1350;
        double d4 = class_3532.method_15355((float)((float)(d * d + d3 * d3)));
        float f = (float)class_3532.method_15338((double)(Math.toDegrees(Math.atan2(d3, d)) - 90.0));
        float f2 = (float)class_3532.method_15350((double)class_3532.method_15338((double)Math.toDegrees(Math.atan2(d2, d4))), (double)-90.0, (double)90.0);
        float f3 = class_3532.method_15393((float)(f - btj_2.mc.field_1724.method_36454()));
        f = btj_2.mc.field_1724.method_36454() + f3;
        return new float[]{f, f2};
    }

    public static boolean dghdh(class_2338 class_23382, nw nw2, dj_2 dj2_2, tshh tshh2, int n, boolean bl) {
        return btj_2.shthh(class_23382, nw2, dj2_2, tshh2, n, bl, true);
    }

    public static boolean shthh(class_2338 class_23382, nw nw2, dj_2 dj2_2, tshh tshh2, int n, boolean bl, boolean bl2) {
        return btj_2.jkhj(class_23382, nw2, dj2_2, tshh2, n, bl, bl2, true);
    }

    public static boolean jkhj(class_2338 class_23382, nw nw2, dj_2 dj2_2, tshh tshh2, int n, boolean bl, boolean bl2, boolean bl3) {
        if (btj_2.mc.field_1724 == null || btj_2.mc.field_1761 == null) {
            return false;
        }
        int n2 = btj_2.mc.field_1724.method_31548().field_7545;
        if (n == -1) {
            return false;
        }
        bfn.awy(n);
        boolean bl4 = btj_2.afw(class_23382, nw2, dj2_2, tshh2, bl2, bl3);
        if (bl) {
            bfn.awy(n2);
        }
        return bl4;
    }

    public static boolean tbs(class_2338 class_23382, nw nw2, dj_2 dj2_2, tshh tshh2) {
        return btj_2.khtz_4(class_23382, nw2, dj2_2, tshh2, true);
    }

    public static boolean khtz_4(class_2338 class_23382, nw nw2, dj_2 dj2_2, tshh tshh2, boolean bl) {
        return btj_2.afw(class_23382, nw2, dj2_2, tshh2, bl, true);
    }

    public static boolean afw(class_2338 class_23382, nw nw2, dj_2 dj2_2, tshh tshh2, boolean bl, boolean bl2) {
        boolean bl3;
        class_3965 class_39652 = btj_2.twd_4(class_23382, dj2_2, bl);
        if (class_39652 == null || btj_2.mc.field_1687 == null || btj_2.mc.field_1761 == null || btj_2.mc.field_1724 == null) {
            return false;
        }
        boolean bl4 = btj_2.mc.field_1724.method_5624();
        boolean bl5 = bl3 = btj_2.ghzm(btj_2.mc.field_1687.method_8320(class_39652.method_17777()).method_26204()) && !btj_2.mc.field_1724.method_5715();
        if (nw2 == nw.shrb) {
            float[] fArray = btj_2.dhnz(class_39652.method_17784());
            float f = btj_2.mc.field_1724.method_36454();
            float f2 = btj_2.mc.field_1724.method_36455();
            btj_2.mc.field_1724.method_36456(fArray[0]);
            btj_2.mc.field_1724.method_36457(fArray[1]);
            if (bl3) {
                btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)btj_2.mc.field_1724, class_2848.class_2849.field_12979));
            }
            btj_2.bhd_2(arg_0 -> btj_2.dhyw(class_39652, arg_0));
            jrh.put(class_23382, System.currentTimeMillis());
            if (bl3) {
                btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)btj_2.mc.field_1724, class_2848.class_2849.field_12984));
            }
            btj_2.mc.field_1724.method_36456(f);
            btj_2.mc.field_1724.method_36457(f2);
            if (bl2) {
                btj_2.mc.field_1724.method_6104(class_1268.field_5808);
            }
            return true;
        }
        if (nw2 == nw.dhtf_2) {
            float[] fArray = btj_2.msh(class_39652.method_17784());
            if (bl4) {
                btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)btj_2.mc.field_1724, class_2848.class_2849.field_12985));
            }
            if (bl3) {
                btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)btj_2.mc.field_1724, class_2848.class_2849.field_12979));
            }
            btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2830(btj_2.mc.field_1724.method_23317(), btj_2.mc.field_1724.method_23318(), btj_2.mc.field_1724.method_23321(), fArray[0], fArray[1], btj_2.mc.field_1724.method_24828(), btj_2.mc.field_1724.field_5976));
            btj_2.bhd_2(arg_0 -> btj_2.zdht_3(class_39652, arg_0));
            jrh.put(class_23382, System.currentTimeMillis());
            btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2830(btj_2.mc.field_1724.method_23317(), btj_2.mc.field_1724.method_23318(), btj_2.mc.field_1724.method_23321(), btj_2.mc.field_1724.method_36454(), btj_2.mc.field_1724.method_36455(), btj_2.mc.field_1724.method_24828(), btj_2.mc.field_1724.field_5976));
            if (bl3) {
                btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)btj_2.mc.field_1724, class_2848.class_2849.field_12984));
            }
            if (bl4) {
                btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)btj_2.mc.field_1724, class_2848.class_2849.field_12981));
            }
            if (bl2) {
                btj_2.mc.field_1724.method_6104(class_1268.field_5808);
            }
            return true;
        }
        if (bl4) {
            btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)btj_2.mc.field_1724, class_2848.class_2849.field_12985));
        }
        if (bl3) {
            btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)btj_2.mc.field_1724, class_2848.class_2849.field_12979));
        }
        float[] fArray = btj_2.msh(class_39652.method_17784());
        switch (nw2.ordinal()) {
            case 0: {
                break;
            }
            case 1: {
                btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2831(fArray[0], fArray[1], btj_2.mc.field_1724.method_24828(), btj_2.mc.field_1724.field_5976));
                break;
            }
        }
        if (tshh2 == tshh.rzn_2) {
            btj_2.mc.field_1761.method_2896(btj_2.mc.field_1724, class_1268.field_5808, class_39652);
        } else if (tshh2 == tshh.haf) {
            btj_2.bhd_2(arg_0 -> btj_2.smj_2(class_39652, arg_0));
        }
        jrh.put(class_23382, System.currentTimeMillis());
        if (bl3) {
            btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)btj_2.mc.field_1724, class_2848.class_2849.field_12984));
        }
        if (bl4) {
            btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)btj_2.mc.field_1724, class_2848.class_2849.field_12981));
        }
        if (bl2) {
            btj_2.mc.field_1724.method_6104(class_1268.field_5808);
        }
        return true;
    }

    public static boolean shysh(class_2338 class_23382, dj_2 dj2_2, boolean bl) {
        return btj_2.zlm(class_23382, dj2_2, bl, true);
    }

    public static boolean zlm(class_2338 class_23382, dj_2 dj2_2, boolean bl, boolean bl2) {
        boolean bl3;
        class_3965 class_39652 = btj_2.twd_4(class_23382, dj2_2, bl);
        if (class_39652 == null || btj_2.mc.field_1687 == null || btj_2.mc.field_1761 == null || btj_2.mc.field_1724 == null) {
            return false;
        }
        boolean bl4 = bl3 = btj_2.ghzm(btj_2.mc.field_1687.method_8320(class_39652.method_17777()).method_26204()) && !btj_2.mc.field_1724.method_5715();
        if (bl3) {
            btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)btj_2.mc.field_1724, class_2848.class_2849.field_12979));
        }
        float[] fArray = btj_2.msh(class_39652.method_17784());
        btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2828.class_2830(btj_2.mc.field_1724.method_23317(), btj_2.mc.field_1724.method_23318(), btj_2.mc.field_1724.method_23321(), fArray[0], fArray[1], btj_2.mc.field_1724.method_24828(), btj_2.mc.field_1724.field_5976));
        btj_2.bhd_2(arg_0 -> btj_2.shkhz(class_39652, arg_0));
        jrh.put(class_23382, System.currentTimeMillis());
        if (bl3) {
            btj_2.mc.field_1724.field_3944.method_52787((class_2596)new class_2848((class_1297)btj_2.mc.field_1724, class_2848.class_2849.field_12984));
        }
        if (bl2) {
            btj_2.mc.field_1724.method_6104(class_1268.field_5808);
        }
        return true;
    }

    public static boolean bhb_2(class_2338 class_23382, dj_2 dj2_2, boolean bl) {
        boolean bl2;
        class_3965 class_39652 = btj_2.twd_4(class_23382, dj2_2, bl);
        if (class_39652 == null || btj_2.mc.field_1687 == null || btj_2.mc.field_1761 == null || btj_2.mc.field_1724 == null) {
            return false;
        }
        boolean bl3 = bl2 = btj_2.ghzm(btj_2.mc.field_1687.method_8320(class_39652.method_17777()).method_26204()) && !btj_2.mc.field_1724.method_5715();
        if (bl2) {
            thdh.dht_5((class_2596)new class_2848((class_1297)btj_2.mc.field_1724, class_2848.class_2849.field_12979));
        }
        thdh.adhq(arg_0 -> btj_2.zhgh(class_39652, arg_0));
        jrh.put(class_23382, System.currentTimeMillis());
        thdh.dht_5((class_2596)new class_2879(class_1268.field_5808));
        if (bl2) {
            thdh.dht_5((class_2596)new class_2848((class_1297)btj_2.mc.field_1724, class_2848.class_2849.field_12984));
        }
        return true;
    }

    public static float[] jqb(class_2338 class_23382, dj_2 dj2_2, boolean bl) {
        class_3965 class_39652 = btj_2.twd_4(class_23382, dj2_2, bl);
        if (class_39652 != null) {
            return btj_2.msh(class_39652.method_17784());
        }
        return null;
    }

    public static boolean dha_2(class_2338 class_23382, dj_2 dj2_2, boolean bl) {
        return btj_2.zsw_3(class_23382, dj2_2, bl) != null;
    }

    public static class_3965 zsw_3(class_2338 class_23382, dj_2 dj2_2, boolean bl) {
        btj_2.khfz();
        if (jrh.containsKey(class_23382)) {
            long l = System.currentTimeMillis() - (Long)jrh.get(class_23382);
            if (l > 50L && btj_2.mc.field_1687 != null && btj_2.mc.field_1687.method_8320(class_23382).method_45474()) {
                jrh.remove(class_23382);
            } else {
                return null;
            }
        }
        return btj_2.twd_4(class_23382, dj2_2, bl);
    }

    public static void bhd_2(class_7204 class_72042) {
        int n = mth.jrsh(1839238462);
        class_7204 class_72043 = class_72042;
        n = (class_72043 != null ? System.identityHashCode(class_72043) : 0) ^ n;
        int n2 = n ^ 0x1CB99764;
        if ((n2 ^ n) != 481924964) {
            int cfr_ignored_0 = (Integer.rotateRight(0x71191A5A ^ n, 17) + -1234710495) * 1897470555;
        }
        thdh.adhq(class_72042);
    }

    public static class_3965 twd_4(class_2338 class_23382, dj_2 dj2_2, boolean bl) {
        class_1297 class_129722;
        if (btj_2.mc.field_1687 == null || btj_2.mc.field_1724 == null) {
            return null;
        }
        btj_2.khfz();
        if (!bl) {
            for (class_1297 class_129722 : new ArrayList(btj_2.mc.field_1687.method_18467(class_1297.class, new class_238(class_23382)))) {
                if (class_129722 instanceof class_1542 || class_129722 instanceof class_1303) continue;
                return null;
            }
        }
        if (!btj_2.mc.field_1687.method_8320(class_23382).method_45474()) {
            return null;
        }
        if (dj2_2 == dj_2.shh_7) {
            return kha.hrm(new class_3959(btj_2.sbz((class_1297)btj_2.mc.field_1724), class_23382.method_46558(), class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)btj_2.mc.field_1724), class_23382);
        }
        ArrayList arrayList = btj_2.zhd_7(class_23382);
        class_129722 = arrayList.iterator();
        while (class_129722.hasNext()) {
            List list;
            lj lj2 = (lj)class_129722.next();
            if (dj2_2 != dj_2.khr) {
                list = btj_2.jwt_2(class_23382);
                if (list.isEmpty()) {
                    return null;
                }
                if (!list.contains(lj2.jhkh)) continue;
            }
            list = null;
            if (dj2_2 == dj_2.thghb) {
                class_243 class_2432 = btj_2.hshw(lj2.jhkh, lj2.sdz_4, 0.0f, 6.0f);
                if (class_2432 != null) {
                    return new class_3965(class_2432, lj2.jhkh, lj2.sdz_4, false);
                }
            } else {
                double d = (Math.random() - 0.5) * 0.02;
                double d2 = (Math.random() - 0.5) * 0.02;
                double d3 = (Math.random() - 0.5) * 0.02;
                int n = lj2.jhkh.method_62675().method_10263();
                int n2 = lj2.jhkh.method_62675().method_10264();
                int n3 = lj2.jhkh.method_62675().method_10260();
                class_243 class_2433 = new class_243((double)lj2.sdz_4.method_10263() + 0.5 + (double)n * 0.5 + (n == 0 ? d : 0.0), (double)lj2.sdz_4.method_10264() + 0.5 + (double)n2 * 0.5 + (n2 == 0 ? d2 : 0.0), (double)lj2.sdz_4.method_10260() + 0.5 + (double)n3 * 0.5 + (n3 == 0 ? d3 : 0.0));
                list = new class_3965(class_2433, lj2.jhkh, lj2.sdz_4, false);
            }
            return list;
        }
        return null;
    }

    public static class_243 hshw(class_2350 class_23502, class_2338 class_23382, float f, float f2) {
        class_243 class_2432;
        double d;
        double d2;
        class_238 class_2383 = btj_2.bwgh(class_23502);
        double d3 = (class_2383.field_1323 + class_2383.field_1320) / 2.0;
        double d4 = (class_2383.field_1322 + class_2383.field_1325) / 2.0;
        double d5 = (class_2383.field_1321 + class_2383.field_1324) / 2.0;
        class_243 class_2433 = new class_243((double)class_23382.method_10263() + d3, (double)class_23382.method_10264() + d4, (double)class_23382.method_10260() + d5);
        if (!btj_2.zjh_4(class_2433, class_23382, class_23502, f, f2)) {
            return class_2433;
        }
        if (class_2383.field_1320 - class_2383.field_1323 == 0.0) {
            for (d2 = class_2383.field_1322; d2 < class_2383.field_1325; d2 += (double)0.1f) {
                for (d = class_2383.field_1321; d < class_2383.field_1324; d += (double)0.1f) {
                    class_2432 = new class_243((double)class_23382.method_10263() + class_2383.field_1323, (double)class_23382.method_10264() + d2, (double)class_23382.method_10260() + d);
                    if (btj_2.zjh_4(class_2432, class_23382, class_23502, f, f2)) continue;
                    return class_2432;
                }
            }
        }
        if (class_2383.field_1325 - class_2383.field_1322 == 0.0) {
            for (d2 = class_2383.field_1323; d2 < class_2383.field_1320; d2 += (double)0.1f) {
                for (d = class_2383.field_1321; d < class_2383.field_1324; d += (double)0.1f) {
                    class_2432 = new class_243((double)class_23382.method_10263() + d2, (double)class_23382.method_10264() + class_2383.field_1322, (double)class_23382.method_10260() + d);
                    if (btj_2.zjh_4(class_2432, class_23382, class_23502, f, f2)) continue;
                    return class_2432;
                }
            }
        }
        if (class_2383.field_1324 - class_2383.field_1321 == 0.0) {
            for (d2 = class_2383.field_1323; d2 < class_2383.field_1320; d2 += (double)0.1f) {
                for (d = class_2383.field_1322; d < class_2383.field_1325; d += (double)0.1f) {
                    class_2432 = new class_243((double)class_23382.method_10263() + d2, (double)class_23382.method_10264() + d, (double)class_23382.method_10260() + class_2383.field_1321);
                    if (btj_2.zjh_4(class_2432, class_23382, class_23502, f, f2)) continue;
                    return class_2432;
                }
            }
        }
        return null;
    }

    private static class_238 bwgh(class_2350 class_23502) {
        return switch (bzr.thdhy[class_23502.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> new class_238((double)0.15f, 1.0, (double)0.15f, (double)0.85f, 1.0, (double)0.85f);
            case 2 -> new class_238((double)0.15f, 0.0, (double)0.15f, (double)0.85f, 0.0, (double)0.85f);
            case 3 -> new class_238(1.0, (double)0.15f, (double)0.15f, 1.0, (double)0.85f, (double)0.85f);
            case 4 -> new class_238(0.0, (double)0.15f, (double)0.15f, 0.0, (double)0.85f, (double)0.85f);
            case 5 -> new class_238((double)0.15f, (double)0.15f, 0.0, (double)0.85f, (double)0.85f, 0.0);
            case 6 -> new class_238((double)0.15f, (double)0.15f, 1.0, (double)0.85f, (double)0.85f, 1.0);
        };
    }

    private static boolean zjh_4(class_243 class_2432, class_2338 class_23382, class_2350 class_23502, float f, float f2) {
        class_3959 class_39592 = new class_3959(btj_2.sbz((class_1297)btj_2.mc.field_1724), class_2432, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)btj_2.mc.field_1724);
        class_3965 class_39652 = btj_2.mc.field_1687.method_17742(class_39592);
        float f3 = btj_2.shwth(class_2432);
        if (class_39652 != null && class_39652.method_17783() == class_239.class_240.field_1332 && !class_39652.method_17777().equals((Object)class_23382) && f3 > f * f) {
            return true;
        }
        return f3 > f2 * f2;
    }

    public static ArrayList zhd_7(class_2338 class_23382) {
        ArrayList<lj> arrayList = new ArrayList<lj>();
        if (btj_2.mc.field_1687 == null) {
            return arrayList;
        }
        btj_2.khfz();
        if (btj_2.tmb(class_23382.method_10069(0, -1, 0))) {
            arrayList.add(new lj(class_23382.method_10069(0, -1, 0), class_2350.field_11036));
        }
        if (btj_2.tmb(class_23382.method_10069(0, 1, 0))) {
            arrayList.add(new lj(class_23382.method_10069(0, 1, 0), class_2350.field_11033));
        }
        if (btj_2.tmb(class_23382.method_10069(-1, 0, 0))) {
            arrayList.add(new lj(class_23382.method_10069(-1, 0, 0), class_2350.field_11034));
        }
        if (btj_2.tmb(class_23382.method_10069(1, 0, 0))) {
            arrayList.add(new lj(class_23382.method_10069(1, 0, 0), class_2350.field_11039));
        }
        if (btj_2.tmb(class_23382.method_10069(0, 0, 1))) {
            arrayList.add(new lj(class_23382.method_10069(0, 0, 1), class_2350.field_11043));
        }
        if (btj_2.tmb(class_23382.method_10069(0, 0, -1))) {
            arrayList.add(new lj(class_23382.method_10069(0, 0, -1), class_2350.field_11035));
        }
        return arrayList;
    }

    public static List jwt_2(class_2338 class_23382) {
        ArrayList<class_2350> arrayList = new ArrayList<class_2350>();
        if (btj_2.mc.field_1724 == null) {
            return arrayList;
        }
        class_243 class_2432 = class_23382.method_46558();
        class_243 class_2433 = btj_2.sbz((class_1297)btj_2.mc.field_1724);
        double d = class_2433.field_1352 - class_2432.method_1031((double)0.5, (double)0.0, (double)0.0).field_1352;
        double d2 = class_2433.field_1352 - class_2432.method_1031((double)-0.5, (double)0.0, (double)0.0).field_1352;
        double d3 = class_2433.field_1350 - class_2432.method_1031((double)0.0, (double)0.0, (double)0.5).field_1350;
        double d4 = class_2433.field_1350 - class_2432.method_1031((double)0.0, (double)0.0, (double)-0.5).field_1350;
        double d5 = class_2433.field_1351 - class_2432.method_1031((double)0.0, (double)0.5, (double)0.0).field_1351;
        double d6 = class_2433.field_1351 - class_2432.method_1031((double)0.0, (double)-0.5, (double)0.0).field_1351;
        if (d > 0.0 && btj_2.tmb(class_23382.method_10067())) {
            arrayList.add(class_2350.field_11034);
        }
        if (d2 < 0.0 && btj_2.tmb(class_23382.method_10078())) {
            arrayList.add(class_2350.field_11039);
        }
        if (d3 > 0.0 && btj_2.tmb(class_23382.method_10095())) {
            arrayList.add(class_2350.field_11035);
        }
        if (d4 < 0.0 && btj_2.tmb(class_23382.method_10072())) {
            arrayList.add(class_2350.field_11043);
        }
        if (d5 < 0.0 && btj_2.tmb(class_23382.method_10084())) {
            arrayList.add(class_2350.field_11033);
        }
        if (d6 > 0.0 && btj_2.tmb(class_23382.method_10074())) {
            arrayList.add(class_2350.field_11036);
        }
        return arrayList;
    }

    public static boolean tmb(class_2338 class_23382) {
        int n = mth.jrsh(-1368940117);
        int n2 = n ^ 0x2AFB30F1;
        if ((n2 ^ n) != 721105137) {
            int cfr_ignored_0 = (Integer.rotateRight(0x849C915A ^ n, 3) + 324221217) * -2070113957;
        }
        if (btj_2.mc.field_1687 == null) {
            return false;
        }
        class_2680 class_26802 = btj_2.srd_4(btj_2.mc.field_1687, class_23382);
        if (class_26802.method_26204() instanceof class_2478) {
            return false;
        }
        String string = btj_2.tshs_4(class_26802.method_26204().getClass());
        if (string.contains("SignBlock") || string.contains(btj_2.zdhf("䁓♵諅", -1342353232 - -1326902707, 0x37989B35 ^ 0x7636979F, btj_2.ztb_3(999931995) ^ 0xEF3CBE31))) {
            return false;
        }
        if (btj_2.dha_3(class_26802)) {
            return true;
        }
        Long l = (Long)jrh.get(class_23382);
        if (l == null) {
            return false;
        }
        long l2 = btj_2.tzz() - l;
        if (l2 > (0x39FE3758692BD35FL ^ 0x39FE3758692BD3A5L)) {
            if (btj_2.mc.field_1687.method_8320(class_23382).method_45474()) {
                jrh.remove(class_23382);
            }
            return false;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public static float shwth(class_243 var0) {
        var1_1 = 0.0;
        var3_2 = 0.0;
        var5_3 = 0.0;
        var7_4 = 0.0f;
        var10_5 = 0;
        var8_6 = 1834387152;
        var8_6 = Integer.rotateLeft(var8_6 * 579161173, 19) ^ -2066683531;
        var9_7 = (int)((long)(850170638 + var8_6) ^ 6842160105192335452L ^ 6842160105192335452L);
        block26: while (true) {
            if ((var10_5 = var9_7 - var8_6) == -1235060111) ** GOTO lbl158
            if (var10_5 == 1102733972) ** GOTO lbl125
            Integer.rotateRight(-1952960149 ^ var8_6, 4) + -338978000;
            if (var10_5 == 1984108601) ** GOTO lbl49
            switch (var10_5) {
                case 850170638: {
                    (Integer.rotateLeft(-2113937455 ^ var8_6, 3) + -1034307190) * -2113937455;
                    (int)(4849657632842378063L ^ (long)var8_6 ^ 2209159765684726603L);
                    if (btj_2.mc.field_1724 == null) {
                        (int)(-2832761806026350345L ^ (long)var8_6 ^ -488066952816223055L);
                        var9_7 = Integer.reverse(Integer.reverse(1741074873 + var8_6));
                        var10_5 -= 5;
                        continue block26;
                    }
                    try {
                        var10_5 += 3;
                        if ((1763747056340027171L ^ (long)var8_6 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var9_7 = 1984108601 + var8_6 + -1772758498 - -1772758498;
                    }
                    catch (IllegalArgumentException v0) {
                        var9_7 = Integer.reverse(Integer.reverse(1984108601 + var8_6));
                    }
                    var10_5 += 5;
                    continue block26;
                }
                case 1741074873: {
                    (Integer.rotateRight(930729822 ^ var8_6, 9) - -1138902115) * 930729823;
                    var7_4 = Float.intBitsToFloat(-1382925688 + -772946569);
                    try {
                        var10_5 += 2;
                        var9_7 = (int)((long)(-1243976288 + var8_6) ^ 7992380477264084303L ^ 7992380477264084303L);
                    }
                    catch (IllegalStateException v1) {
                        var9_7 = -1243976288 + var8_6 ^ -852924772 ^ -852924772;
                    }
                    var10_5 += 5;
                    continue block26;
                }
lbl49:
                // 1 sources

                (Integer.rotateLeft(1152151537 ^ var8_6, 11) + 1430203754) * 1152151537;
                (int)(-8782369140740134065L ^ (long)var8_6 ^ 9144703191835255276L);
                var1_1 = var0.field_1352 - btj_2.mc.field_1724.method_23317();
                var3_2 = var0.field_1350 - btj_2.jss_2(btj_2.mc.field_1724);
                var5_3 = var0.field_1351 - (btj_2.skhj(btj_2.mc.field_1724) + (double)btj_2.mc.field_1724.method_18381(btj_2.dbh(btj_2.mc.field_1724)));
                var7_4 = (float)(var1_1 * var1_1 + var3_2 * var3_2 + var5_3 * var5_3);
                var9_7 = 2029542625 + var8_6;
                Integer.rotateRight(-632005082 ^ var8_6, 14) - 1955923413;
                var9_7 = (int)((long)(-1243976288 + var8_6) ^ 501657575465702430L ^ 501657575465702430L);
                continue block26;
                case 802927893: {
                    (Integer.rotateRight(1087790815 ^ var8_6, 11) - -564978628) * 1087790815;
                    var9_7 = -1813617513 + var8_6 + 2111918289 - 2111918289;
                    Integer.rotateRight(-1723592122 ^ var8_6, 6) - -1818503755;
                    var9_7 = 850170638 + var8_6 + 1141910611 - 1141910611;
                    --var10_5;
                    continue block26;
                }
                case 800427893: {
                    Integer.rotateRight(2039135119 ^ var8_6, 18) - -1138076276;
                    var9_7 = 850170638 + var8_6 + -1482888955 - -1482888955;
                    (Integer.rotateRight(544010686 ^ var8_6, 7) - -242293443) * 544010687;
                    var10_5 += 3;
                    continue block26;
                }
                case -1615385199: {
                    (Integer.rotateLeft(-534643148 ^ var8_6, 15) - 679176071) * -534643147;
                    var9_7 = -16609129 + var8_6;
                    Integer.rotateLeft(218577416 ^ var8_6, 4) + -1740790221;
                    try {
                        var10_5 -= 5;
                        if ((-5964414386734715609L ^ (long)var8_6 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var9_7 = 850170638 + var8_6 + -522383567 - -522383567;
                    }
                    catch (UnsupportedOperationException v2) {
                        var9_7 = Integer.reverse(Integer.reverse(850170638 + var8_6));
                    }
                    --var10_5;
                    continue block26;
                }
                case -1722806609: {
                    (Integer.rotateLeft(-814265355 ^ var8_6, 12) - 600822246) * -814265355;
                    (int)(992451940729547599L ^ (long)var8_6 ^ 3954304621290829402L);
                    try {
                        if ((-1491080248854270637L ^ (long)var8_6 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var9_7 = (int)((long)(850170638 + var8_6) ^ 1681628218937905345L ^ 1681628218937905345L);
                    }
                    catch (UnsupportedOperationException v3) {
                        var9_7 = (int)((long)(850170638 + var8_6) ^ -1010922649127306516L ^ -1010922649127306516L);
                    }
                    continue block26;
                }
                case -465274066: {
                    (Integer.rotateLeft(-451426051 ^ var8_6, 15) - -1036061218) * -451426051;
                    (int)(2856802514124467023L ^ (long)var8_6 ^ 3526462656690643611L);
                    var9_7 = -1126190742 + var8_6;
                    (Integer.rotateRight(-1600862442 ^ var8_6, 7) - 1986116325) * -1600862441;
                    try {
                        if ((-8328830404120247221L ^ (long)var8_6 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var9_7 = Integer.reverse(Integer.reverse(850170638 + var8_6));
                    }
                    catch (IllegalStateException v4) {
                        var9_7 = 850170638 + var8_6 + 546184320 - 546184320;
                    }
                    var10_5 += 2;
                    continue block26;
                }
lbl125:
                // 1 sources

                (Integer.rotateLeft(1988623228 ^ var8_6, 17) - 1591022399) * 1988623229;
                var9_7 = (int)((long)(-1933822244 + var8_6) ^ -2963368146984186288L ^ -2963368146984186288L);
                Integer.rotateRight(393945519 ^ var8_6, 5) - -599346324;
                var9_7 = 850170638 + var8_6;
                Integer.rotateRight(-696680341 ^ var8_6, 13) + -49009616;
                var10_5 += 3;
                continue block26;
                case -1452927920: {
                    Integer.rotateRight(1269799466 ^ var8_6, 12) + 782322257;
                    try {
                        var9_7 = 850170638 + var8_6 + 977101770 - 977101770;
                    }
                    catch (ArithmeticException v5) {
                        var9_7 = 850170638 + var8_6 + -1957184907 - -1957184907;
                    }
                    var10_5 -= 3;
                    continue block26;
                }
                case -1720569153: {
                    (Integer.rotateLeft(-1682475472 ^ var8_6, 6) + -543887605) * -1682475471;
                    var9_7 = (int)((long)(850170638 + var8_6) ^ -3831875404209013758L ^ -3831875404209013758L);
                    ++var10_5;
                    continue block26;
                }
                case -591362677: {
                    Integer.rotateRight(601491234 ^ var8_6, 7) + 1539603545;
                    var9_7 = (int)((long)(850170638 + var8_6) ^ -3110227871732830560L ^ -3110227871732830560L);
                    Integer.rotateRight(1505354319 ^ var8_6, 14) - -505411892;
                    continue block26;
                }
lbl158:
                // 1 sources

                Integer.rotateRight(1212686374 ^ var8_6, 12) - -988183595;
                var9_7 = (int)((long)(393725010 + var8_6) ^ -6458315435730385286L ^ -6458315435730385286L);
                (Integer.rotateLeft(-1587605923 ^ var8_6, 7) - -1897898882) * -1587605923;
                (int)(7200587714080861007L ^ (long)var8_6 ^ -4778175056180581878L);
                var9_7 = -17691466 + var8_6;
                (Integer.rotateLeft(352351185 ^ var8_6, 5) + -1888770678) * 352351185;
                (int)(-2904014803350262961L ^ (long)var8_6 ^ 5091463527201768116L);
                var9_7 = (int)((long)(850170638 + var8_6) ^ 2920767876465511550L ^ 2920767876465511550L);
                var10_5 -= 4;
                continue block26;
                case -990338581: {
                    Integer.rotateRight(422722350 ^ var8_6, 6) - 292735437;
                    var9_7 = (int)((long)(-834858652 + var8_6) ^ 6218095969871304291L ^ 6218095969871304291L);
                    Integer.rotateRight(-232475697 ^ var8_6, 17) - 1456432460;
                    var9_7 = Integer.reverse(Integer.reverse(850170638 + var8_6));
                    Integer.rotateLeft(383553768 ^ var8_6, 5) + -921490605;
                    var10_5 -= 5;
                    continue block26;
                }
                case -1243976288: {
                    return var7_4;
                }
            }
            (Integer.rotateLeft(-908720528 ^ var8_6, 12) + 1967679179) * -908720527;
            var9_7 = Integer.reverse(Integer.reverse(850170638 + var8_6));
        }
    }

    public static boolean ghzm(class_2248 class_22482) {
        int n = mth.jrsh(1382587419);
        class_2248 class_22483 = class_22482;
        n = (class_22483 != null ? System.identityHashCode(class_22483) : 0) ^ n;
        int n2 = n ^ 0x3C461A39;
        if ((n2 ^ n) != 1011227193) {
            int cfr_ignored_0 = Integer.rotateRight(0x6E2E8622 ^ n, 16) + 1543495001;
        }
        if (zshm.contains(class_22482)) {
            return true;
        }
        if (class_22482 instanceof class_2478) {
            return true;
        }
        String string = class_22482.getClass().getSimpleName();
        return string.contains("SignBlock") || string.contains("Sign");
    }

    public static void khfz() {
        int n = mth.jrsh(-1778944766);
        int n2 = n ^ 0x41597992;
        if ((n2 ^ n) != 1096382866) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xD4AE0C90 ^ n, 13) + -982440789) * -726791023;
        }
        long l = System.currentTimeMillis();
        jrh.entrySet().removeIf(arg_0 -> btj_2.zdkh_4(l, arg_0));
    }

    private static boolean zdkh_4(long l, Map.Entry entry) {
        int n = mth.jrsh(-200379949);
        n = (int)l ^ n;
        Map.Entry entry2 = entry;
        n = (entry2 != null ? System.identityHashCode(entry2) : 0) ^ n;
        int n2 = n ^ 0x2A991A45;
        if ((n2 ^ n) != 714676805) {
            int cfr_ignored_0 = (Integer.rotateRight(0xDE976B96 ^ n, 14) - -122444187) * -560501865;
        }
        if (l - (Long)entry.getValue() > (0xB8E2B0EA0ADCF640L ^ 0xB8E2B0EA0ADCF4AEL)) {
            return true;
        }
        if (btj_2.mc.field_1687 == null) {
            return false;
        }
        return !btj_2.mc.field_1687.method_8320((class_2338)entry.getKey()).method_45474();
    }

    private static class_2596 zhgh(class_3965 class_39652, int n) {
        return new class_2885(class_1268.field_5808, class_39652, n);
    }

    private static class_2596 shkhz(class_3965 class_39652, int n) {
        return new class_2885(class_1268.field_5808, class_39652, n);
    }

    private static class_2596 smj_2(class_3965 class_39652, int n) {
        return new class_2885(class_1268.field_5808, class_39652, n);
    }

    private static class_2596 zdht_3(class_3965 class_39652, int n) {
        return new class_2885(class_1268.field_5808, class_39652, n);
    }

    private static class_2596 dhyw(class_3965 class_39652, int n) {
        return new class_2885(class_1268.field_5808, class_39652, n);
    }

    private static class_2596 ghdk(class_3965 class_39652, int n) {
        return new class_2885(class_1268.field_5808, class_39652, n);
    }

    private static String jghz_2(String string, int n, int n2, int n3) {
        int n4 = -1729675371;
        n4 = Integer.rotateLeft(n4 * 239594797, 28) ^ 0x77B374A1;
        int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 8)) ^ 0x2A16A30D;
        if ((n5 ^ n4) != 706126605) {
            int cfr_ignored_0 = (0xB2F19C98 ^ n4) - 1436865953;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x7585C705) + thkh_2 ^ Integer.reverse(n2 + i * -835656521), 25) - dhkht);
        }
        return new String(cArray);
    }

    private static float aghk(int n) {
        block0: {
            int n2 = 1240088034;
            n2 = Integer.rotateLeft(n2 * -1862903659, 22) ^ 0x15CEEDB;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 24)) ^ 0x6D783D2B;
            if ((n3 ^ n2) == 1836596523) break block0;
            int cfr_ignored_0 = (0x249200C9 ^ n2) + -1200523413;
        }
        return Float.intBitsToFloat(n);
    }

    private static boolean tlt() {
        block0: {
            int n = 1214763053;
            int n2 = (n = Integer.rotateLeft(n * -214400871, 14) ^ 0xBC00A490) ^ 0xEBB27377;
            if ((n2 ^ n) == -340626569) break block0;
            int cfr_ignored_0 = (0xA3D5A35A ^ n) - -862487660;
        }
        return yf.dnkh();
    }

    private static float shmn(class_1297 class_12972, class_4050 class_40502) {
        block0: {
            int n = 220196928;
            int n2 = (n = Integer.rotateLeft(n * 1694190079, 7) ^ 0x7D121F4B) ^ 0x9E358ACA;
            if ((n2 ^ n) == -1640658230) break block0;
            int cfr_ignored_0 = (0x932A7A8A ^ n) + 996611726;
        }
        return class_12972.method_18381(class_40502);
    }

    private static class_2680 srd_4(class_638 class_6382, class_2338 class_23382) {
        block0: {
            int n = -762655742;
            n = Integer.rotateLeft(n * 336667507, 11) ^ 0x5135A217;
            class_2338 class_23383 = class_23382;
            n = Integer.rotateLeft((class_23383 != null ? System.identityHashCode(class_23383) : 0) ^ n, 9);
            int n2 = n ^ 0x850B3096;
            if ((n2 ^ n) == -2062864234) break block0;
            int cfr_ignored_0 = (0x5781FC94 ^ n) + -2070001822;
        }
        return class_6382.method_8320(class_23382);
    }

    private static String tshs_4(Class clazz) {
        block0: {
            int n = 1122585373;
            n = Integer.rotateLeft(n * 973199667, 9) ^ 0xF0FBFCE7;
            Class clazz2 = clazz;
            n = (clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n;
            int n2 = n ^ 0x98F0677E;
            if ((n2 ^ n) == -1729075330) break block0;
            int cfr_ignored_0 = (0xDA192C63 ^ n) - -1763929731;
        }
        return clazz.getSimpleName();
    }

    private static int ztb_3(int n) {
        block0: {
            int n2 = -1564884168;
            n2 = Integer.rotateLeft(n2 * -1980831217, 10) ^ 0xEF8A817;
            int n3 = (n2 = n ^ n2) ^ 0x2396A205;
            if ((n3 ^ n2) == 597074437) break block0;
            int cfr_ignored_0 = (0x812F613D ^ n2) - -2119597352;
        }
        return Integer.reverse(n);
    }

    private static String zdhf(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1885069484;
            n4 = Integer.rotateLeft(n4 * 1803351979, 16) ^ 0x18B14DC1;
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 5)) ^ 0xB8B31665;
            if ((n5 ^ n4) == -1196222875) break block0;
            int cfr_ignored_0 = (0x37170931 ^ n4) + -1066929762;
        }
        return btj_2.jghz_2(string, n, n2, n3);
    }

    private static boolean dha_3(class_2680 class_26802) {
        block0: {
            int n = 1538470342;
            int n2 = (n = Integer.rotateLeft(n * 655519661, 26) ^ 0x9AAC4041) ^ 0xED715D53;
            if ((n2 ^ n) == -311337645) break block0;
            int cfr_ignored_0 = (0xB6C26C95 ^ n) + 663707290;
        }
        return class_26802.method_51367();
    }

    private static long tzz() {
        block0: {
            int n = mth.jrsh(1527298511);
            int n2 = n ^ 0xDAA4AE39;
            if ((n2 ^ n) == -626741703) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x81AC17F6 ^ n, 3) - -1204517371) * -2119428105;
        }
        return System.currentTimeMillis();
    }

    private static double jss_2(class_746 class_7462) {
        block0: {
            int n = -1088121604;
            n = Integer.rotateLeft(n * -1936067727, 28) ^ 0x4118D6F2;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0x89789070;
            if ((n2 ^ n) == -1988587408) break block0;
            int cfr_ignored_0 = (0x365C048C ^ n) + 2055426578;
        }
        return class_7462.method_23321();
    }

    private static double skhj(class_746 class_7462) {
        block0: {
            int n = 1781448533;
            int n2 = (n = Integer.rotateLeft(n * -1637873955, 12) ^ 0xD75D2F44) ^ 0x6BC2C497;
            if ((n2 ^ n) == 1807926423) break block0;
            int cfr_ignored_0 = (0x1EC7BC2 ^ n) + 872466411;
        }
        return class_7462.method_23318();
    }

    private static class_4050 dbh(class_746 class_7462) {
        block0: {
            int n = 222127310;
            n = Integer.rotateLeft(n * 982956863, 8) ^ 0xD4892FB6;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0xDD3591A7;
            if ((n2 ^ n) == -583691865) break block0;
            int cfr_ignored_0 = (0xD008F569 ^ n) + -867373596;
        }
        return class_7462.method_18376();
    }

    private static String[] thrdh(String string) {
        int n = -1524763789;
        int n2 = (n = Integer.rotateLeft(n * 855716747, 5) ^ 0xCC0A46B4) ^ 0x29EC38D;
        if ((n2 ^ n) != 43959181) {
            int cfr_ignored_0 = (0xA78330FE ^ n) - -1464957639;
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

    private static CallSite jshz_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1928448717;
            n3 = Integer.rotateLeft(n3 * 915782207, 17) ^ 0x69D07900;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 26);
            n3 = Integer.rotateRight(n ^ n3, 3);
            int n4 = n3 ^ 0xCE330275;
            if ((n4 ^ n3) != -835517835) {
                int cfr_ignored_0 = (0x433D3746 ^ n3) - 1404849609;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ sjf_2 ^ string.hashCode() ^ n2 + khzm_2 + i * -56246933) + sjf_2) ^ khzm_2));
            }
            String[] stringArray = btj_2.thrdh(new String(cArray));
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

    private static String[] t65sm6pacg(String string) {
        return string.split("\u0004\u001b", -1);
    }

    private static CallSite fw01uq5vn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ wnmkyf00yd ^ string.hashCode()) + (n2 + sp18e26el2t) + i ^ wnmkyf00yd, 15) + sp18e26el2t);
            }
            String[] stringArray = btj_2.t65sm6pacg(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

