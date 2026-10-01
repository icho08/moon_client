/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_638
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_638;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bmq;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Visual Range", category=bzw.OTHER, desc="Renders range circles around selected players")
public class hr
extends bnq {
    private final badh_2 hgh = new badh_2(this, "Show Self").bts(false);
    private final badh_2 shzf_2 = new badh_2(this, "Show Pla".concat("yers")).bts(true);
    private final badh_2 zld = new badh_2(this, "Show Fr".concat("iends")).bts(false);
    private final tay dhzt_3 = new tay(this, "Range").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(-2068952387 + -1135495869)).rkh_3(Float.intBitsToFloat(0xB05A9FF1 ^ 0x8D96533C)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x61EEB9B9 ^ 0x41EEB999, 25)));
    private final tay slm = new tay(this, "Line Width").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(848398858) ^ 0x1091894C)).rkh_3(Float.intBitsToFloat(1607645732 + -559069732)).ssd_5(2.0f);
    private final tay zzq = new tay(this, "Fill Alpha").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(-1830341791 - 1338454881)).rkh_3(Float.intBitsToFloat(1867829930 + -783602346)).ssd_5(Float.intBitsToFloat(Integer.reverse(991955198) ^ 0x3D2404DC));
    private final tay bza_4 = new tay(this, "YOffset").shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(-190559599) ^ 0xB652252F)).rkh_3(Float.intBitsToFloat(126921306 + 882060464)).ssd_5(Float.intBitsToFloat(Integer.reverse(908935832) ^ 0x240E78A1));
    private final tay zdj = new tay(this, "Quality").shth_7(Float.intBitsToFloat(-246203305 + 1345110953)).dhbs_2(Float.intBitsToFloat(Integer.reverse(2133319559) ^ 0xA30BE4FE)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xCD6877BD ^ 0xCD4837BD, 9))).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x1FDA036A ^ 0xF42036A, 2)));
    private final bzw_2 rtsh = new bzw_2(this, "Outside Color").dhshy(new byq(Float.intBitsToFloat(Integer.rotateLeft(0x9065D23 ^ 0x12FE5D21, 29)), Float.intBitsToFloat(Integer.reverse(-1764159739) ^ 0xE27C9B69), Float.intBitsToFloat(Integer.rotateLeft(0x8C479A9 ^ 0x594479A1, 27)), Float.intBitsToFloat(Integer.reverse(1451805404) ^ 0x7801116A)));
    private final bzw_2 bthy = new bzw_2(this, "Inside Color").dhshy(new byq(Float.intBitsToFloat(537983099 + 578488197), Float.intBitsToFloat(901495779 + 230900765), Float.intBitsToFloat(-214765099 - -1339952683), Float.intBitsToFloat(0x886658CE ^ 0xCB3A58CE)));
    private final badh_2 sthm_2 = new badh_2(this, "Pulse").bts(true);
    private final bql<shw_3> rly = this::thaa_4;
    private static final int shkhl = 918085149;
    private static final int shan = -266629092;
    private static final int rshgh = -435150174;
    private static final int tss_3 = 272131833;
    private static final int dhhrhrm = 1873568233;
    private static final int jxbezpu4i6esu = -1074386136;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int buwyy1gb2f;

    private boolean sdhl_2(class_1657 class_16572) {
        if (class_16572 == null || !class_16572.method_5805() || class_16572.method_7325()) {
            return false;
        }
        if (class_16572 == hr.mc.field_1724) {
            return this.hgh.shzl();
        }
        if (Moondlc.getInstance().getFriendManager().adhj(class_16572.method_5477().getString())) {
            return this.zld.shzl();
        }
        return this.shzf_2.shzl();
    }

    private boolean smb(class_1657 class_16572) {
        int n = -380144524;
        n = Integer.rotateLeft(n * 1911499299, 7) ^ 0x31349081;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xE089A3B;
        if ((n2 ^ n) != 235444795) {
            int cfr_ignored_0 = (0xE75FEE4F ^ n) - 151253024;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        float f = hr.zak_4(this.dhzt_3) + hr.rghh(class_16572) * Float.intBitsToFloat(0x15AFD7D ^ 0x3E5AFD7D);
        if (class_16572 == hr.mc.field_1724) {
            for (class_1657 class_16573 : hr.ztw_4(hr.mc.field_1687)) {
                if (class_16573 == hr.mc.field_1724 || !class_16573.method_5805() || class_16573.method_7325() || (!hr.shqt_2(hr.dja_4(hr.ddz_8()), class_16573.method_5477().getString()) ? !hr.tal_4(this.shzf_2) : !hr.dhthy(this.zld)) || !this.tl_2(class_16572, class_16573, f)) continue;
                return true;
            }
            return false;
        }
        return this.tl_2(class_16572, (class_1657)hr.mc.field_1724, f);
    }

    private boolean tl_2(class_1657 class_16572, class_1657 class_16573, float f) {
        double d;
        int n = bmq.rrf(-302241118);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 2);
        class_1657 class_16574 = class_16573;
        n = (class_16574 != null ? System.identityHashCode(class_16574) : 0) ^ n;
        int n2 = n ^ 0xFED11E2A;
        if ((n2 ^ n) != -19849686) {
            int cfr_ignored_0 = Integer.rotateLeft(0x132D3488 ^ n, 5) + 1456929715;
        }
        if (hr.thbm()) {
            throw null;
        }
        double d2 = class_16572.method_23317() - class_16573.method_23317();
        return d2 * d2 + (d = class_16572.method_23321() - class_16573.method_23321()) * d <= (double)(f * f);
    }

    private void dhrth(Matrix4f matrix4f, double d, double d2, double d3, float f, Color color, int n) {
        int n2 = Math.max(0, Math.min(255, Math.round(this.zzq.thw_5())));
        Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), n2);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27381, class_290.field_1576);
        class_2872.method_22918(matrix4f, (float)d, (float)d2, (float)d3).method_39415(color2.getRGB());
        for (int i = 0; i <= n; ++i) {
            double d4 = Math.PI * 2 * (double)i / (double)n;
            float f2 = (float)(d + Math.cos(d4) * (double)f);
            float f3 = (float)(d3 + Math.sin(d4) * (double)f);
            class_2872.method_22918(matrix4f, f2, (float)d2, f3).method_39415(color2.getRGB());
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    private void thtth(Matrix4f matrix4f, double d, double d2, double d3, float f, Color color, int n) {
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29345, class_290.field_1576);
        for (int i = 0; i <= n; ++i) {
            double d4 = Math.PI * 2 * (double)i / (double)n;
            float f2 = (float)(d + Math.cos(d4) * (double)f);
            float f3 = (float)(d3 + Math.sin(d4) * (double)f);
            class_2872.method_22918(matrix4f, f2, (float)d2, f3).method_39415(color.getRGB());
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    private void thaa_4(shw_3 shw2) {
        int n = 849052921;
        n = Integer.rotateLeft(n * 1471756481, 16) ^ 0x8177F612;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 25);
        shw_3 shw3 = shw2;
        n = (shw3 != null ? System.identityHashCode(shw3) : 0) ^ n;
        int n2 = n ^ 0xE3BD51F2;
        if ((n2 ^ n) != -474131982) {
            int cfr_ignored_0 = (0xD126D50B ^ n) + 2061480602;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (hr.mc.field_1724 == null || hr.mc.field_1687 == null) {
            return;
        }
        if (this.slm.thw_5() <= 0.0f) {
            return;
        }
        class_4184 class_41842 = hr.mc.field_1773.method_19418();
        class_243 class_2432 = class_41842.method_19326();
        float f = shw2.skz_4();
        int n3 = Math.round(this.zdj.thw_5());
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA);
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        RenderSystem.lineWidth((float)this.slm.thw_5());
        class_4587 class_45872 = shw2.ssha_2();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        for (class_1657 class_16572 : hr.mc.field_1687.method_18456()) {
            if (!this.sdhl_2(class_16572)) continue;
            double d = class_3532.method_16436((double)f, (double)class_16572.field_6014, (double)class_16572.method_23317()) - class_2432.field_1352;
            double d2 = class_3532.method_16436((double)f, (double)class_16572.field_6036, (double)class_16572.method_23318()) - class_2432.field_1351 + (double)this.bza_4.thw_5();
            double d3 = class_3532.method_16436((double)f, (double)class_16572.field_5969, (double)class_16572.method_23321()) - class_2432.field_1350;
            boolean bl = this.smb(class_16572);
            Color color = new Color((bl ? this.bthy.sdsh_4() : this.rtsh.sdsh_4()).rk(), true);
            float f2 = this.dhzt_3.thw_5() + class_16572.method_17681() * Float.intBitsToFloat(Integer.rotateLeft(0x9EF3C923 ^ 0x62F3C923, 30));
            if (this.sthm_2.shzl()) {
                f2 += (float)Math.sin((double)(System.currentTimeMillis() + (long)class_16572.method_5628() * (0x7D82A33570A0716AL ^ 0x7D82A33570A0713FL)) / Double.longBitsToDouble(0xF99C0DD2751CD2EAL ^ 0xB9F9EDD2751CD2EAL)) * Float.intBitsToFloat(676033880 - -348382929);
            }
            this.dhrth(matrix4f, d, d2, d3, f2, color, n3);
            this.thtth(matrix4f, d, d2, d3, f2, color, n3);
        }
        RenderSystem.lineWidth((float)1.0f);
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private static String thmq(String string, int n, int n2, int n3) {
        int n4 = 526653890;
        n4 = Integer.rotateLeft(n4 * 1377377825, 4) ^ 0x273DC8AE;
        n4 = n ^ n4;
        int n5 = (n4 = n2 ^ n4) ^ 0xF11A5540;
        if ((n5 ^ n4) != -249932480) {
            int cfr_ignored_0 = (0xEE7E4C82 ^ n4) - -1320441080;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xD83959FD) + i ^ shkhl, 20) ^ n2 + shan));
        }
        return new String(cArray);
    }

    private static float zak_4(tay tay2) {
        block0: {
            int n = bmq.rrf(-482221067);
            tay tay3 = tay2;
            n = (tay3 != null ? System.identityHashCode(tay3) : 0) ^ n;
            int n2 = n ^ 0xDA970F54;
            if ((n2 ^ n) == -627634348) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x39D6ECA1 ^ n, 10) + 90457786;
            int cfr_ignored_1 = (int)(0xFB64429C27D4EB4FL ^ (long)n ^ 0x7848831A2DB85B19L);
        }
        return tay2.thw_5();
    }

    private static float rghh(class_1657 class_16572) {
        block0: {
            int n = bmq.rrf(-1453154947);
            class_1657 class_16573 = class_16572;
            n = (class_16573 != null ? System.identityHashCode(class_16573) : 0) ^ n;
            int n2 = n ^ 0x1B328DF1;
            if ((n2 ^ n) == 456297969) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xB250108C ^ n, 9) - -1676697553;
        }
        return class_16572.method_17681();
    }

    private static List ztw_4(class_638 class_6382) {
        block0: {
            int n = -1068463790;
            int n2 = (n = Integer.rotateLeft(n * -528640717, 15) ^ 0xD261D684) ^ 0x3A695C50;
            if ((n2 ^ n) == 979983440) break block0;
            int cfr_ignored_0 = (0xFA39D502 ^ n) - 1079758927;
        }
        return class_6382.method_18456();
    }

    private static Moondlc ddz_8() {
        block0: {
            int n = -1147888693;
            int n2 = (n = Integer.rotateLeft(n * 696271017, 23) ^ 0x7CFE277A) ^ 0xC452FC4C;
            if ((n2 ^ n) == -1001194420) break block0;
            int cfr_ignored_0 = (0x7FC66787 ^ n) + -936005558;
        }
        return Moondlc.getInstance();
    }

    private static kh_3 dja_4(Moondlc moondlc) {
        block0: {
            int n = -2136249148;
            n = Integer.rotateLeft(n * 2096100609, 21) ^ 0xFCA115E3;
            Moondlc moondlc2 = moondlc;
            n = (moondlc2 != null ? System.identityHashCode(moondlc2) : 0) ^ n;
            int n2 = n ^ 0x8D8050CB;
            if ((n2 ^ n) == -1920970549) break block0;
            int cfr_ignored_0 = (0xD2B3C0F ^ n) - -1053982315;
        }
        return moondlc.getFriendManager();
    }

    private static boolean shqt_2(kh_3 kh2, String string) {
        block0: {
            int n = 415212872;
            int n2 = (n = Integer.rotateLeft(n * -1540009639, 12) ^ 0x2D5913C0) ^ 0x4FD6FEF0;
            if ((n2 ^ n) == 1339490032) break block0;
            int cfr_ignored_0 = (0x57695BB8 ^ n) - -814931618;
        }
        return kh2.adhj(string);
    }

    private static boolean dhthy(badh_2 badh2) {
        block0: {
            int n = bmq.rrf(898524937);
            int n2 = n ^ 0xBAF8AA67;
            if ((n2 ^ n) == -1158108569) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x8F76CD6E ^ n, 4) - 1673559949;
        }
        return badh2.shzl();
    }

    private static boolean tal_4(badh_2 badh2) {
        block0: {
            int n = 1541323960;
            int n2 = (n = Integer.rotateLeft(n * 236402729, 28) ^ 0x1BCB5BE8) ^ 0x7EB93E79;
            if ((n2 ^ n) == 2126069369) break block0;
            int cfr_ignored_0 = (0x256782C1 ^ n) - 1668144170;
        }
        return badh2.shzl();
    }

    private static boolean thbm() {
        block0: {
            int n = -1709859217;
            int n2 = (n = Integer.rotateLeft(n * 1639045893, 17) ^ 0xAB1D1CCE) ^ 0x8D6D396;
            if ((n2 ^ n) == 148296598) break block0;
            int cfr_ignored_0 = (0x92C34DF9 ^ n) - 2024951149;
        }
        return yf.dnkh();
    }

    private static String[] dmt_4(String string) {
        int n = -150354679;
        int n2 = (n = Integer.rotateLeft(n * 176035815, 10) ^ 0x4C74D395) ^ 0x2A0E0B07;
        if ((n2 ^ n) != 705563399) {
            int cfr_ignored_0 = (0xDD07CE0E ^ n) - -878938375;
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

    private static CallSite ddhj(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1913993294;
            n3 = Integer.rotateLeft(n3 * 1055553595, 5) ^ 0xFFCE1D6B;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 6);
            int n4 = n3 ^ 0x3459D928;
            if ((n4 ^ n3) != 878303528) {
                int cfr_ignored_0 = (0xB9B31E9A ^ n3) - 583761562;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ rshgh ^ string.hashCode() ^ n2 + tss_3 ^ i * 1861589621 ^ rshgh, 17) ^ tss_3));
            }
            String[] stringArray = hr.dmt_4(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] pj0gfhudg2(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite xzov90tkfim(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ dhhrhrm ^ string.hashCode() ^ n2 + jxbezpu4i6esu + i * 132298677) + dhhrhrm) ^ jxbezpu4i6esu));
            }
            String[] stringArray = hr.pj0gfhudg2(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

