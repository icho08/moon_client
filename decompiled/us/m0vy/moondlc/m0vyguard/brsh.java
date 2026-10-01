/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4587
 *  net.minecraft.class_7833
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Map;
import lombok.Generated;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.ds;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.zz_4;
import us.m0vy.moondlc.m0vyguard.ghdh_3;
import us.m0vy.moondlc.m0vyguard.fy;
import us.movy.moondlc.Moondlc;

@tq_2(name="Waypoints", category=bzw.OTHER, desc="World waypoints by coordinates. Use $wp")
public class brsh
extends bnq {
    private static brsh bnkh;
    private final khd dhtgh = new khd(this, "Arrow Style");
    private final fy shykh = new fy(this.dhtgh, "2D").rhh_3();
    private final fy dwl = new fy(this.dhtgh, "3D");
    private final bzw_2 ddw_2 = new bzw_2(this, "Arrow Color").dhshy(new byq(Float.intBitsToFloat(Integer.reverse(621058420) ^ 0x6DE620A4), Float.intBitsToFloat(Integer.rotateLeft(0x6D0E7C58 ^ 0x6D1EA398, 10)), Float.intBitsToFloat(Integer.rotateLeft(0x8CFE7ECE ^ 0x8CF6112E, 11)), Float.intBitsToFloat(864317291 - -268079253)));
    private final bzw_2 skhs_3 = new bzw_2(this, "Text Color").dhshy(new byq(Float.intBitsToFloat(950702714 + 181693830), Float.intBitsToFloat(-1430941608 - 1731629144), Float.intBitsToFloat(-348718532 + 1481115076), Float.intBitsToFloat(-1790674553 + -1371896199)));
    private float khdhz_2 = Float.intBitsToFloat(-181461331 + 1285087571);
    private static final float rrh_2 = 6.4f;
    private static final float zqz_2 = 10.0f;
    private static final class_2960 dhqf;
    private static final class_2960 dqz_2;
    private final bql<bbgh> rfj = this::sha_10;
    private static final int sm_2 = -357970345;
    private static final int thdh_3 = 803132307;
    private static final int tzb = 125553225;
    private static final int takh = 452057749;
    private static final int pmfgcthpk = 152598914;
    private static final int y8l5i36u1xs = -575556407;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int cdwvnt1o0;

    public brsh() {
        bnkh = this;
    }

    private void badh_2(class_4587 class_45872, float f, float f2, float f3, float f4, byq byq2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)dhqf);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        float f5 = byq2.sbk() / 255.0f;
        float f6 = byq2.srl() / 255.0f;
        float f7 = byq2.shsl_2() / 255.0f;
        float f8 = byq2.tzdh_2() / 255.0f;
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22913(0.0f, 0.0f).method_22915(f5, f6, f7, f8);
        class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f).method_22913(0.0f, 1.0f).method_22915(f5, f6, f7, f8);
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_22913(1.0f, 1.0f).method_22915(f5, f6, f7, f8);
        class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_22913(1.0f, 0.0f).method_22915(f5, f6, f7, f8);
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
        RenderSystem.disableBlend();
        class_45872.method_22909();
    }

    private void ssgh_2(class_4587 class_45872, float f, float f2, float f3, float f4, byq byq2) {
        class_45872.method_22903();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)dqz_2);
        float f5 = byq2.sbk() / 255.0f;
        float f6 = byq2.srl() / 255.0f;
        float f7 = byq2.shsl_2() / 255.0f;
        float f8 = byq2.tzdh_2() / 255.0f;
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f, f2, -1.0f).method_22913(0.0f, 0.0f).method_22915(f5 * 0.4f, f6 * 0.4f, f7 * 0.4f, f8);
        class_2872.method_22918(matrix4f, f, f2 + f4, -1.0f).method_22913(0.0f, 1.0f).method_22915(f5 * 0.4f, f6 * 0.4f, f7 * 0.4f, f8);
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, -1.0f).method_22913(1.0f, 1.0f).method_22915(f5 * 0.4f, f6 * 0.4f, f7 * 0.4f, f8);
        class_2872.method_22918(matrix4f, f + f3, f2, -1.0f).method_22913(1.0f, 0.0f).method_22915(f5 * 0.4f, f6 * 0.4f, f7 * 0.4f, f8);
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
        class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f, f2, -0.5f).method_22913(0.0f, 0.0f).method_22915(f5 * 0.7f, f6 * 0.7f, f7 * 0.7f, f8);
        class_2872.method_22918(matrix4f, f, f2 + f4, -0.5f).method_22913(0.0f, 1.0f).method_22915(f5 * 0.7f, f6 * 0.7f, f7 * 0.7f, f8);
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, -0.5f).method_22913(1.0f, 1.0f).method_22915(f5 * 0.7f, f6 * 0.7f, f7 * 0.7f, f8);
        class_2872.method_22918(matrix4f, f + f3, f2, -0.5f).method_22913(1.0f, 0.0f).method_22915(f5 * 0.7f, f6 * 0.7f, f7 * 0.7f, f8);
        class_9801 class_98013 = class_2872.method_60794();
        if (class_98013 != null) {
            class_286.method_43433((class_9801)class_98013);
        }
        class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22913(0.0f, 0.0f).method_22915(f5, f6, f7, f8);
        class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f).method_22913(0.0f, 1.0f).method_22915(f5, f6, f7, f8);
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_22913(1.0f, 1.0f).method_22915(f5, f6, f7, f8);
        class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_22913(1.0f, 0.0f).method_22915(f5, f6, f7, f8);
        class_9801 class_98014 = class_2872.method_60794();
        if (class_98014 != null) {
            class_286.method_43433((class_9801)class_98014);
        }
        RenderSystem.disableBlend();
        class_45872.method_22909();
    }

    @Generated
    public static brsh trs_2() {
        block0: {
            int n = 800884944;
            int n2 = (n = Integer.rotateLeft(n * 1611996741, 17) ^ 0x2911AEB4) ^ 0xA20DFA46;
            if ((n2 ^ n) == -1576142266) break block0;
            int cfr_ignored_0 = (0x8DB17296 ^ n) + 470460093;
        }
        return bnkh;
    }

    private void sha_10(bbgh bbgh2) {
        int n = ds.dhghf(-2030801300);
        n = System.identityHashCode(this) ^ n;
        bbgh bbgh3 = bbgh2;
        n = Integer.rotateLeft((bbgh3 != null ? System.identityHashCode(bbgh3) : 0) ^ n, 19);
        int n2 = n ^ 0xE71A7E05;
        if ((n2 ^ n) != -417694203) {
            int cfr_ignored_0 = Integer.rotateLeft(0x61EE1069 ^ n, 15) + -533619726;
            int cfr_ignored_1 = (int)(0xA35CBE5427D4EB4FL ^ (long)n ^ 0x81D8831A2DB8EB68L);
        }
        if (brsh.mc.field_1724 == null || brsh.mc.field_1687 == null || brsh.mc.field_1690.field_1842) {
            return;
        }
        zz_4 zz2_2 = Moondlc.getInstance().getWayPointsManager();
        if (zz2_2 == null || zz2_2.ztn_3().isEmpty()) {
            return;
        }
        double d = brsh.mc.field_1724.method_23317();
        double d2 = brsh.mc.field_1724.method_23321();
        float f = brsh.mc.field_1724.method_36454();
        int n3 = mc.method_22683().method_4486() / 2;
        int n4 = mc.method_22683().method_4502() / 2;
        double d3 = brsh.mc.field_1724.method_23317() - brsh.mc.field_1724.field_6014;
        double d4 = brsh.mc.field_1724.method_23321() - brsh.mc.field_1724.field_5969;
        float f2 = (float)Math.sqrt(d3 * d3 + d4 * d4) * Float.intBitsToFloat(Integer.reverse(445719225) ^ 0xDCE48958);
        float f3 = class_3532.method_16439((float)class_3532.method_15363((float)(f2 / Float.intBitsToFloat(0xDFFBB6EC ^ 0x9EFBB6EC)), (float)0.0f, (float)1.0f), (float)Float.intBitsToFloat(Integer.rotateLeft(0x400F0969 ^ 0x48360969, 3)), (float)Float.intBitsToFloat(-1388492708 + -1795770460));
        this.khdhz_2 += (f3 - this.khdhz_2) * Float.intBitsToFloat(Integer.rotateLeft(0x7B08F127 ^ 0xE2928ABE, 15));
        ghdh_3 ghdh2 = bbgh2.dtn();
        class_4587 class_45872 = ghdh2.method_51448();
        for (Map.Entry entry : zz2_2.ztn_3()) {
            String string = (String)entry.getKey();
            class_243 class_2432 = (class_243)entry.getValue();
            double d5 = class_2432.field_1352 - d;
            double d6 = class_2432.field_1350 - d2;
            double d7 = Math.sqrt(d5 * d5 + d6 * d6);
            if (d7 < Double.longBitsToDouble(0x17E089C5953CA539L ^ 0x2859105C0CA53CA3L)) continue;
            double d8 = Math.toDegrees(Math.atan2(d6, d5));
            double d9 = class_3532.method_15338((double)(d8 - (double)f + Double.longBitsToDouble(0xC51CD86D1CA26FBEL ^ 0x857A586D1CA26FBEL)));
            float f4 = (float)((double)n3 + Math.cos(Math.toRadians(d9)) * (double)this.khdhz_2);
            float f5 = (float)((double)n4 + Math.sin(Math.toRadians(d9)) * (double)this.khdhz_2);
            class_45872.method_22903();
            class_45872.method_46416(f4, f5, 0.0f);
            class_45872.method_22907(class_7833.field_40718.rotationDegrees((float)d9 + Float.intBitsToFloat(Integer.rotateLeft(0x88B6B9EB ^ 0x3CB6B9A9, 24))));
            boolean bl = this.dhtgh.dhbn("3D");
            if (bl) {
                this.ssgh_2(class_45872, Float.intBitsToFloat(0x867271BA ^ 0x46D271BA), Float.intBitsToFloat(Integer.rotateLeft(0x50A43D09 ^ 0x50A73F89, 14)), Float.intBitsToFloat(Integer.rotateLeft(0xB3945173 ^ 0x23945153, 25)), Float.intBitsToFloat(Integer.reverse(-1991238289) ^ 0xB7980A91), this.ddw_2.sdsh_4());
            } else {
                this.badh_2(class_45872, Float.intBitsToFloat(Integer.reverse(-611446913) ^ 0x3E5071DB), Float.intBitsToFloat(0x32ABE58A ^ 0xF20BE58A), Float.intBitsToFloat(1995109213 - 902493021), Float.intBitsToFloat(0xBF46C280 ^ 0xFE66C280), this.ddw_2.sdsh_4());
            }
            class_45872.method_22909();
            Color color = new Color(this.skhs_3.sdsh_4().rk());
            float f6 = f5 + Float.intBitsToFloat(1597002329 - 512774745);
            brz_2.thtkh_2.thsz_4(class_45872, string, f4, f6, Float.intBitsToFloat(1405197176 - 318033579), color);
            brz_2.thtkh_2.thsz_4(class_45872, String.format("%.0fm", d7), f4, f6 + Float.intBitsToFloat(-688984075 - -1776147672) + 2.0f, Float.intBitsToFloat(Integer.reverse(1244581117) ^ 0xFFBFB89F), color);
        }
    }

    private static String dghth(String string, int n, int n2, int n3) {
        int n4 = -1780120988;
        n4 = Integer.rotateLeft(n4 * 38356685, 13) ^ 0xD2B58DE6;
        n4 = n ^ n4;
        int n5 = (n4 = n2 ^ n4) ^ 0x407931B1;
        if ((n5 ^ n4) != 1081684401) {
            int cfr_ignored_0 = (0xD59CB3D5 ^ n4) - -650381741;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x88F490B2 ^ n2 ^ i * 1749673041 ^ sm_2, 25) ^ thdh_3));
        }
        return new String(cArray);
    }

    private static String[] tdr_4(String string) {
        int n = 188432639;
        n = Integer.rotateLeft(n * 976694243, 21) ^ 0x75FE4AD9;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 12);
        int n2 = n ^ 0xD82061F7;
        if ((n2 ^ n) != -668966409) {
            int cfr_ignored_0 = (0xD31B2108 ^ n) - 1314651058;
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

    private static CallSite dhyh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1105801417;
            n3 = Integer.rotateLeft(n3 * 490690699, 24) ^ 0xB45808BB;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 4);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x900ABA85;
            if ((n4 ^ n3) != -1878345083) {
                int cfr_ignored_0 = (0x2E1C75B2 ^ n3) + -795627594;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ tzb ^ string.hashCode() ^ n2 + takh + i * 2032558767) + tzb) ^ takh));
            }
            String[] stringArray = brsh.tdr_4(new String(cArray));
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

    private static String[] unmmpxmmi(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite b1w281blr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ pmfgcthpk ^ string.hashCode() ^ n2 + y8l5i36u1xs + i * 1113407981) + pmfgcthpk) ^ y8l5i36u1xs));
            }
            String[] stringArray = brsh.unmmpxmmi(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

