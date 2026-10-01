/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_7833
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
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.tdhz_2;
import us.m0vy.moondlc.m0vyguard.tzth;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.an;
import us.m0vy.moondlc.m0vyguard.ly;
import us.m0vy.moondlc.m0vyguard.ngh;

public class lr
extends tzth {
    public final String thmj;
    private float zsf_2 = 1.0f;
    private float khst = 0.0f;
    private float bsy = 1.0f;
    private boolean jshd_2 = false;
    private static final int khbh = -147277341;
    private static final int jqa = -187667546;
    private static final int zwf = -699286053;
    private static final int srt = 315304397;
    private static final int q4g8eduql1 = 959395686;
    private static final int j2y5u7kmh = 1843878796;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int erwsu8erleei53;

    public lr() {
        this("target/rounded_target_esp");
    }

    public lr(String string) {
        this.thmj = string;
    }

    @Override
    public boolean dqkh() {
        block0: {
            int n = -1209659823;
            n = Integer.rotateLeft(n * -762566325, 15) ^ 0xBF2AECFE;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 2);
            int n2 = n ^ 0x1CBC16C;
            if ((n2 ^ n) == 30130540) break block0;
            int cfr_ignored_0 = (0xB62DCF3D ^ n) + -357191892;
        }
        return true;
    }

    @Override
    public void ththd() {
        if (sbh_2 == null || !this.ssn_3()) {
            return;
        }
        float f = tdhz_2.trb().khsgh().thw_5();
        this.khst = this.zsf_2;
        if (thdhs_2.khbk() > 0.8) {
            this.zsf_2 += this.bsy * f;
            if (this.bsy > 25.0f * Math.max(f, 0.1f)) {
                this.jshd_2 = true;
            }
            if (this.bsy < -25.0f * Math.max(f, 0.1f)) {
                this.jshd_2 = false;
            }
        }
        this.bsy = (float)((double)(this.jshd_2 ? this.bsy - 0.5f * f : this.bsy + 0.5f * f) * thdhs_2.khbk());
    }

    @Override
    public void ht_2(shw_3 shw2) {
        if (sbh_2 == null || !this.ssn_3()) {
            return;
        }
        class_4184 class_41842 = lr.mc.field_1773.method_19418();
        double d = lr.shkdh() - class_41842.method_19326().field_1352;
        double d2 = lr.ghtb_2() - class_41842.method_19326().field_1351;
        double d3 = lr.qn() - class_41842.method_19326().field_1350;
        double d4 = ngh.hht_3(this.khkkh, ls_2.khbk()) * tdhz_2.trb().ztk().thw_5() * this.dhsht(shw2.skz_4());
        class_4587 class_45872 = new class_4587();
        RenderSystem.disableDepthTest();
        RenderSystem.disableCull();
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(class_41842.method_19329()));
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(class_41842.method_19330() + 180.0f));
        class_45872.method_22904(d, d2 + (double)(sbh_2.method_17682() / 2.0f), d3);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-class_41842.method_19330()));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(class_41842.method_19329()));
        class_45872.method_22907(class_7833.field_40718.rotationDegrees(ngh.hht_3(this.khst, this.zsf_2)));
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.setShaderTexture((int)0, (class_2960)an.khds(this.thmj));
        class_45872.method_22904(-d4 / 2.0, -d4 / 2.0, -0.01);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        int n = (int)(thdhs_2.khbk() * (double)tdhz_2.trb().bsl_2().thw_5() * 255.0);
        int n2 = tdhz_2.trb().shthd(n).getRGB();
        int n3 = tdhz_2.trb().jda_2(n).getRGB();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22918(matrix4f, 0.0f, (float)d4, 0.0f).method_22913(0.0f, 1.0f).method_39415(n2);
        class_2872.method_22918(matrix4f, (float)d4, (float)d4, 0.0f).method_22913(1.0f, 1.0f).method_39415(n3);
        class_2872.method_22918(matrix4f, (float)d4, 0.0f, 0.0f).method_22913(1.0f, 0.0f).method_39415(n2);
        class_2872.method_22918(matrix4f, 0.0f, 0.0f, 0.0f).method_22913(0.0f, 0.0f).method_39415(n3);
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA);
        RenderSystem.disableBlend();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private static String bbh_2(String string, int n, int n2, int n3) {
        int n4 = ly.jkht(-1410468080);
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 16)) ^ 0xED146CAA;
        if ((n5 ^ n4) != -317428566) {
            int cfr_ignored_0 = (Integer.rotateRight(0x46F99BBA ^ n4, 11) + -1667794239) * 1190763451;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xC60828C5) + i ^ khbh, 11) ^ n2 + jqa));
        }
        return new String(cArray);
    }

    private static String[] afdh(String string) {
        block0: {
            int n = -1191654405;
            n = Integer.rotateLeft(n * 931085809, 13) ^ 0x62C0A61E;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 19);
            int n2 = n ^ 0xFB6E36B2;
            if ((n2 ^ n) == -76663118) break block0;
            int cfr_ignored_0 = (0x4396FD49 ^ n) + 2073693844;
        }
        return string.split("\u0002\u0018", -1);
    }

    private static CallSite shjs(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -2052068513;
            n3 = Integer.rotateLeft(n3 * 1405523491, 19) ^ 0x56B28622;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 2);
            String string3 = string2;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 16);
            int n4 = n3 ^ 0x236598F4;
            if ((n4 ^ n3) != 593860852) {
                int cfr_ignored_0 = (0xA6CA73AB ^ n3) + -1415400219;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ zwf ^ string.hashCode() ^ n2 + srt ^ i * -1576207591 ^ zwf, 25) ^ srt));
            }
            String[] stringArray = lr.afdh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType3) : lookup.findVirtual(clazz, stringArray[3], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] tp5ar3ydixm(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite n67hjb0gr8c3v(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ q4g8eduql1 ^ string.hashCode() ^ n2 + j2y5u7kmh ^ i * 1873245445 ^ q4g8eduql1, 28) ^ j2y5u7kmh));
            }
            String[] stringArray = lr.tp5ar3ydixm(new String(cArray));
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

