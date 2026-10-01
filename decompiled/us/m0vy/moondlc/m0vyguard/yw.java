/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1667
 *  net.minecraft.class_1676
 *  net.minecraft.class_1684
 *  net.minecraft.class_1685
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1935
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_241
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_3857
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_4587
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1667;
import net.minecraft.class_1676;
import net.minecraft.class_1684;
import net.minecraft.class_1685;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_239;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_3857;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4587;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.btsh;
import us.m0vy.moondlc.m0vyguard.bdk;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bkd;
import us.m0vy.moondlc.m0vyguard.bmn;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.trd;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.zth_8;
import us.m0vy.moondlc.m0vyguard.ghdh_3;
import us.movy.moondlc.Moondlc;

@tq_2(name="Predictions", category=bzw.OTHER, desc="Predicts projectile trajectories")
public class yw
extends bnq {
    private final badh_2 thkhs = new badh_2(this, "Ender Pearl").bts(true);
    private final badh_2 khtha = new badh_2(this, "Trident").bts(false);
    private final badh_2 bkk = new badh_2(this, "Arrow").bts(false);
    private final badh_2 khdm = new badh_2(this, "Through".concat(" walls")).bts(true);
    private final badh_2 jzd_3 = new badh_2(this, "Friendly i".concat("ndicator")).bts(false);
    private final bzw_2 tdl_2 = new bzw_2(this, "Friend C".concat("olor"), this::alq).dhshy(new byq(0.0f, Float.intBitsToFloat(0xEA0C966B ^ 0xA973966B), 0.0f, Float.intBitsToFloat(-1398888000 - 1763682752)));
    private final badh_2 bdk = new badh_2(this, "Show Thrower").bts(true);
    private final bzw_2 htha_2 = new bzw_2(this, "Panel Color").dhshy(new byq(Float.intBitsToFloat(Integer.rotateLeft(0xFBDFDE1A ^ 0xF9D35E1A, 5)), Float.intBitsToFloat(0x50F1CC6E ^ 0x1169CC6E), Float.intBitsToFloat(-282618262 + 1385720214), Float.intBitsToFloat(1943885392 + -818894416)));
    private final badh_2 dya_2 = new badh_2(this, "Liquid").bts(false);
    private final List trt_2 = new ArrayList();
    private static final String thty_2 = "Unknown";
    private final bql<shw_3> sfs = this::htdh_2;
    private final bql<bbgh> khdj_2 = this::jshf;
    private static final int bfd = -510387573;
    private static final int btk = -1398970839;
    private static final int hbt = 1299510042;
    private static final int dtd_3 = 1428090257;
    private static final int nlruhtf = -61023260;
    private static final int b95wk4cy = -825608917;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int pfrcse0uhh;

    private void shsm_2(bbgh bbgh2) {
        ghdh_3 ghdh2 = bbgh2.dtn();
        class_4587 class_45872 = ghdh2.method_51448();
        trd trd2 = bmn.sdha_2.twy_2(7.0f);
        for (bdk bdk2 : this.trt_2) {
            class_241 class_2412 = btsh.zgha_4(new class_243(bdk2.dzd_4.field_1352, bdk2.dzd_4.field_1351, bdk2.dzd_4.field_1350));
            if (class_2412 == null) continue;
            float f = 4.0f;
            float f2 = 4.0f;
            float f3 = 1.0f;
            float f4 = 16.0f * f3;
            String string = String.format("%.1fs", (double)(bdk2.tthf * 50) / 1000.0);
            float f5 = trd2.dak(string);
            float f6 = Math.max(f4, f5) + f * 2.0f;
            float f7 = f2 * 2.0f + f4 + 2.0f + trd2.ghtz_4();
            float f8 = class_2412.field_1343 - f6 / 2.0f;
            float f9 = class_2412.field_1342;
            if (this.dya_2.shzl()) {
                ghdh2.drawLiquidGlass(f8, f9, f6, f7, 1.0f, zth_8.all(2.0f), this.htha_2.sdsh_4(), true);
            } else {
                ghdh2.drawRoundedRect(f8, f9, f6, f7, zth_8.all(2.0f), this.htha_2.sdsh_4());
            }
            float f10 = f8 + (f6 - f4) / 2.0f;
            float f11 = f9 + f2;
            ghdh2.drawItem(bdk2.thtt_2, f10, f11, f3);
            float f12 = f8 + (f6 - f5) / 2.0f;
            float f13 = f9 + f2 + f4 + 2.0f;
            ghdh2.drawText(trd2, string, f12, f13, bhj_2.bzs());
            if (!this.bdk.shzl() || bdk2.khsht.contains(thty_2)) continue;
            float f14 = trd2.dak(bdk2.khsht);
            float f15 = class_2412.field_1343 - f14 / 2.0f;
            float f16 = f9 + f7 + 2.0f;
            byq byq2 = bdk2.dhtb_2 && this.jzd_3.shzl() ? this.tdl_2.sdsh_4() : bhj_2.bzs();
            ghdh2.drawText(trd2, bdk2.khsht, f15, f16, byq2);
        }
    }

    private void tzd_7(shw_3 shw2) {
        class_4587 class_45872 = shw2.ssha_2();
        this.trt_2.clear();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ZERO);
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        for (class_1297 class_12972 : yw.mc.field_1687.method_18112()) {
            String string;
            class_1685 class_16852;
            boolean bl = class_12972 instanceof class_1684;
            boolean bl2 = class_12972 instanceof class_1685 && !(class_16852 = (class_1685)class_12972).method_7441() && !class_16852.field_36331;
            boolean bl3 = class_12972 instanceof class_1667;
            if (!(bl && this.thkhs.shzl() || bl2 && this.khtha.shzl()) && (!bl3 || !this.bkk.shzl()) || (bl3 || bl2) && class_12972.method_18798().method_1027() < 0.001) continue;
            UUID uUID = ((class_1676)class_12972).method_24921() != null ? ((class_1676)class_12972).method_24921().method_5667() : null;
            class_1657 class_16572 = uUID != null ? yw.mc.field_1687.method_18470(uUID) : null;
            boolean bl4 = false;
            String string2 = thty_2;
            if (class_16572 != null) {
                string = class_16572.method_5477().getString();
                bl4 = Moondlc.getInstance().getFriendManager().adhj(string) || string.equals(mc.method_1548().method_1676());
                String string3 = string2 = mc.method_1548().method_1676().equals(string) ? "You" : string;
            }
            if (class_12972 instanceof class_3857) {
                class_3857 class_38572 = (class_3857)class_12972;
                string = class_38572.method_7495();
            } else {
                string = class_12972 instanceof class_1685 ? new class_1799((class_1935)class_1802.field_8547) : (class_12972 instanceof class_1667 ? new class_1799((class_1935)class_1802.field_8107) : new class_1799((class_1935)class_1802.field_8634));
            }
            this.ssr_2(class_12972, bl4, (class_1799)string, string2, class_45872);
        }
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
    }

    private void ssr_2(class_1297 class_12972, boolean bl, class_1799 class_17992, String string, class_4587 class_45872) {
        byq byq2 = bl && this.jzd_3.shzl() ? this.tdl_2.sdsh_4() : bhj_2.ths();
        class_243 class_2432 = class_12972.method_18798();
        class_243 class_2433 = class_12972.method_19538();
        int n = 0;
        float f = byq2.sbk() / 255.0f;
        float f2 = byq2.srl() / 255.0f;
        float f3 = byq2.shsl_2() / 255.0f;
        float f4 = byq2.tzdh_2() / 255.0f;
        for (int i = 0; i <= 149; ++i) {
            class_3965 class_39652;
            class_243 class_2434 = class_2433;
            class_2433 = class_2433.method_1019(class_2432);
            class_2432 = this.dhlkh(class_12972, class_2432);
            boolean bl2 = this.khdm.shzl();
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
            if (bl2) {
                class_2872.method_22918(matrix4f, (float)class_2434.field_1352, (float)class_2434.field_1351, (float)class_2434.field_1350).method_22915(f, f2, f3, f4);
            }
            if ((class_39652 = yw.mc.field_1687.method_17742(new class_3959(class_2434, class_2433, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, class_12972))).method_17783() == class_239.class_240.field_1332) {
                class_2433 = class_39652.method_17784();
            }
            if (bl2) {
                class_2872.method_22918(matrix4f, (float)class_2433.field_1352, (float)class_2433.field_1351, (float)class_2433.field_1350).method_22915(f, f2, f3, f4);
                class_286.method_43433((class_9801)class_2872.method_60800());
            } else {
                class_2872.method_60800();
            }
            if (class_39652.method_17783() == class_239.class_240.field_1332 || class_2433.field_1351 < -128.0) {
                this.trt_2.add(new bdk(class_2433, n, bl, class_17992, string));
                break;
            }
            ++n;
        }
    }

    private class_243 dhlkh(class_1297 class_12972, class_243 class_2432) {
        int n = 224417444;
        n = Integer.rotateLeft(n * -1436248867, 6) ^ 0xDF533D12;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 17);
        class_243 class_2433 = class_2432;
        n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
        int n2 = n ^ 0x3CDC7199;
        if ((n2 ^ n) != 1021079961) {
            int cfr_ignored_0 = (0x31BC273D ^ n) + 2043041546;
        }
        class_243 class_2434 = class_2432;
        class_243 class_2435 = class_2434 = yw.hlr(class_12972) ? class_2434.method_1021(Double.longBitsToDouble(0xC739E815E6BB07EAL ^ 0xF8D0718C7F229E70L)) : yw.jhj(class_2434, Double.longBitsToDouble(0x291D162C8255DA60L ^ 0x16F2B838F8B49DCEL));
        if (!class_12972.method_5740()) {
            class_2434 = class_2434.method_1023(0.0, Double.longBitsToDouble(0x62C1C705B5398C48L ^ 0x5D5F7F545EBC92F0L), 0.0);
        }
        return class_2434;
    }

    private void jshf(bbgh bbgh2) {
        int n = 1240230346;
        n = Integer.rotateLeft(n * 1169860151, 25) ^ 0x3273B1E8;
        bbgh bbgh3 = bbgh2;
        n = Integer.rotateLeft((bbgh3 != null ? System.identityHashCode(bbgh3) : 0) ^ n, 11);
        int n2 = n ^ 0x5F0A4407;
        if ((n2 ^ n) != 1594508295) {
            int cfr_ignored_0 = (0x16E62DCD ^ n) - 1671577934;
        }
        this.shsm_2(bbgh2);
    }

    private void htdh_2(shw_3 shw2) {
        int n = bkd.hwf(1800661578);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x98B41E37;
        if ((n2 ^ n) != -1733026249) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xF3E7F47D ^ n, 17) - -1921762722) * -202902403;
            int cfr_ignored_1 = (int)(0x31555A4027D4EB4FL ^ (long)n ^ 0x49F0831A2DB9CF7BL);
        }
        this.tzd_7(shw2);
    }

    private boolean alq() {
        int n = 569684687;
        n = Integer.rotateLeft(n * 765310869, 26) ^ 0x7A54FA42;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
        int n2 = n ^ 0xAF23BF4E;
        if ((n2 ^ n) != -1356611762) {
            int cfr_ignored_0 = (0x8ED70D81 ^ n) + 318138466;
        }
        return !this.jzd_3.shzl();
    }

    private static String shn(String string, int n, int n2, int n3) {
        int n4 = 711227103;
        n4 = Integer.rotateLeft(n4 * -1117347159, 6) ^ 0x9CB3CC2C;
        n4 = Integer.rotateLeft(n ^ n4, 22);
        int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 21)) ^ 0x9D3AD52F;
        if ((n5 ^ n4) != -1657088721) {
            int cfr_ignored_0 = (0xB75EA3F0 ^ n4) - 714216034;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x897919E4) + n2 ^ i * -1331484375) ^ bfd) + btk);
        }
        return new String(cArray);
    }

    private static boolean hlr(class_1297 class_12972) {
        block0: {
            int n = -1544095914;
            n = Integer.rotateLeft(n * 356762755, 18) ^ 0xAAD549A6;
            class_1297 class_12973 = class_12972;
            n = Integer.rotateRight((class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n, 20);
            int n2 = n ^ 0x76BCE5FD;
            if ((n2 ^ n) == 1992091133) break block0;
            int cfr_ignored_0 = (0xD54A12AB ^ n) + -269884182;
        }
        return class_12972.method_5799();
    }

    private static class_243 jhj(class_243 class_2432, double d) {
        block0: {
            int n = -1997730775;
            n = Integer.rotateLeft(n * -1547960529, 5) ^ 0x69312915;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 13);
            int n2 = n ^ 0xE66A38C6;
            if ((n2 ^ n) == -429246266) break block0;
            int cfr_ignored_0 = (0x6E8734EF ^ n) - -292520061;
        }
        return class_2432.method_1021(d);
    }

    private static String[] dhzz(String string) {
        int n = 1803808731;
        n = Integer.rotateLeft(n * -974895841, 28) ^ 0xAAE38D12;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xA9BBEE9A;
        if ((n2 ^ n) != -1447301478) {
            int cfr_ignored_0 = (0xC2380141 ^ n) + 1881132306;
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

    private static CallSite aas_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -374604333;
            n3 = Integer.rotateLeft(n3 * -951265319, 27) ^ 0xB9FF679C;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 9);
            int n4 = n3 ^ 0x9E560DFE;
            if ((n4 ^ n3) != -1638527490) {
                int cfr_ignored_0 = (0x77FDF02D ^ n3) + 1735904939;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ hbt ^ string.hashCode() ^ n2 + dtd_3 + i * -1536905933) + hbt) ^ dtd_3));
            }
            String[] stringArray = yw.dhzz(new String(cArray));
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

    private static String[] tn2x85h4q(String string) {
        return string.split("\u0003\u0014", -1);
    }

    private static CallSite h5vnzlne(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ nlruhtf ^ string.hashCode() ^ n2 + b95wk4cy ^ i * 1892271399 ^ nlruhtf, 4) ^ b95wk4cy));
            }
            String[] stringArray = yw.tn2x85h4q(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

