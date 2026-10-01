/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1297
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_4587
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
import java.util.List;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1297;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bjgh;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bqt;
import us.m0vy.moondlc.m0vyguard.tbkh;
import us.m0vy.moondlc.m0vyguard.tdj;
import us.m0vy.moondlc.m0vyguard.ra_2;
import us.m0vy.moondlc.m0vyguard.ngh;

public class byn
extends bqt {
    private static final int dha_4 = 40;
    private static final float tdd_3 = 86.0f;
    private static final float rns = 36.0f;
    private static final float hyq = 16.0f;
    private static final float jwd = 5.0f;
    private static final float bjd_2 = 31.0f;
    private static final float dhbh = 12.0f;
    private static final float thzh_4 = 10.0f;
    private final float[] dhaa_3 = new float[40];
    private int bd;
    private long dhth_7;
    private float jbf = 1.0f;
    private final ra_2 thzsh = new ra_2("Emotka", List.of("Right", "Left"), "Right");
    private final ra_2 sfz = new ra_2("Speed Unit", List.of("BPS", "KM/H"), "BPS");
    private final tdj bwj = new tdj("Widget Size", 0.6f, 1.5f, 0.05f, this.khta_3().getScale(), "%.1f");
    private static final int shk3d2e2 = -125335498;
    private static final int kv98sgl = 15170056;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int yvkc3fpq;

    public byn() {
        super(80.0f, 120.0f);
        this.bwj.tyt_3(this::thd);
        this.rght(this.thzsh);
        this.rght(this.sfz);
        this.rght(this.bwj);
    }

    @Override
    public String getName() {
        return "Moondlc Speed Graph";
    }

    @Override
    public void lh(class_4587 class_45872) {
        if (byn.mc.field_1724 == null) {
            return;
        }
        float f = (float)ngh.khmkh((class_1297)byn.mc.field_1724);
        this.bkhy(f);
        float f2 = this.awd_2();
        float f3 = this.bhh_3(true, f2);
        if (!this.tdha_2()) {
            return;
        }
        float f4 = this.zfj_2(this.khta_3().getX());
        float f5 = this.zfj_2(this.khta_3().getY());
        class_45872.method_22903();
        float f6 = 0.92f + 0.08f * f3;
        class_45872.method_46416(f4 + 43.0f, f5 + 18.0f, 0.0f);
        class_45872.method_22905(f6, f6, 1.0f);
        class_45872.method_46416(-(f4 + 43.0f), -(f5 + 18.0f), 0.0f);
        tbkh.bsdh_2(class_45872, f4, f5, 86.0f, 36.0f, f3, 6.0f);
        tbkh.tzy_2(class_45872, f4, f5, 86.0f, 16.0f, tbkh.sty, 0.35f, f3);
        tbkh.sshth_2(class_45872, f4 + 1.0f, f5 + 16.0f, 84.0f, f3);
        this.jbf = this.khhs_3(this.jbf, this.thzsh.thnth("Right") ? 1.0f : 0.0f, f2, 12.0f);
        tbkh.dmkh_2(class_45872, f4, f5, 86.0f, "Speed", "y", brz_2.tsf, f3, this.jbf);
        boolean bl = this.sfz.thnth("KM/H");
        float f7 = bl ? f * 3.6f : f;
        String string = bl ? String.format("%.1f km/h", Float.valueOf(f7)) : String.format("%.2f bps", Float.valueOf(f7));
        this.ghgh().zskh_4(class_45872, string, f4 + 6.0f, f5 + 19.0f, 6.4f, tbkh.hkdh(f3), 0.0f);
        float f8 = f4 + 5.0f;
        float f9 = f5 + 31.0f;
        float f10 = 76.0f;
        this.bkz(class_45872, f8, f5 + 18.0f, f10, 14.0f, f3);
        this.tar_2(class_45872, f8, f9, f10, 12.0f, f3);
        class_45872.method_22909();
        this.khta_3().setWidth(86.0f);
        this.khta_3().setHeight(36.0f);
    }

    private void bkhy(float f) {
        long l = System.currentTimeMillis();
        if (l - this.dhth_7 < 80L) {
            return;
        }
        this.dhaa_3[this.bd] = f;
        this.bd = (this.bd + 1) % 40;
        this.dhth_7 = l;
    }

    private void bkz(class_4587 class_45872, float f, float f2, float f3, float f4, float f5) {
        Color color = bas_4.zsz_4();
        Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.round(38.0f * f5));
        bjgh.jghs.hrj(class_45872, f, f2 + f4 / 2.0f, f3, 0.5f, 0.0f, color2);
        bjgh.jghs.hrj(class_45872, f + f3 / 2.0f, f2, 0.5f, f4, 0.0f, color2);
    }

    private void tar_2(class_4587 class_45872, float f, float f2, float f3, float f4, float f5) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
        Color color = bas_4.tdth_2(Math.round(235.0f * f5));
        int n = 3;
        for (int i = 0; i < 39; ++i) {
            int n2 = (this.bd + Math.max(0, i - 1)) % 40;
            int n3 = (this.bd + i) % 40;
            int n4 = (this.bd + i + 1) % 40;
            int n5 = (this.bd + Math.min(39, i + 2)) % 40;
            float f6 = f2 - Math.min(this.dhaa_3[n2], 10.0f) / 10.0f * f4;
            float f7 = f2 - Math.min(this.dhaa_3[n3], 10.0f) / 10.0f * f4;
            float f8 = f2 - Math.min(this.dhaa_3[n4], 10.0f) / 10.0f * f4;
            float f9 = f2 - Math.min(this.dhaa_3[n5], 10.0f) / 10.0f * f4;
            float f10 = f + (float)i / 39.0f * f3;
            float f11 = f + (float)(i + 1) / 39.0f * f3;
            float f12 = f10;
            float f13 = f7;
            for (int j = 1; j <= n; ++j) {
                float f14 = (float)j / (float)n;
                float f15 = f10 + (f11 - f10) * f14;
                float f16 = this.zha_4(f6, f7, f8, f9, f14);
                class_2872.method_22918(matrix4f, f12, f13, 0.0f).method_39415(color.getRGB());
                class_2872.method_22918(matrix4f, f15, f16, 0.0f).method_39415(color.getRGB());
                f12 = f15;
                f13 = f16;
            }
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.disableBlend();
    }

    private float zha_4(float f, float f2, float f3, float f4, float f5) {
        float f6 = f5 * f5;
        float f7 = f6 * f5;
        return 0.5f * (2.0f * f2 + (-f + f3) * f5 + (2.0f * f - 5.0f * f2 + 4.0f * f3 - f4) * f6 + (-f + 3.0f * f2 - 3.0f * f3 + f4) * f7);
    }

    private void thd(Float f) {
        this.khta_3().setScale(f.floatValue());
        bzz.zhs_7().asd();
    }

    private static String[] h53mf3tm(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite cydki5621f82s6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ shk3d2e2 ^ string.hashCode()) + (n2 + kv98sgl) + i ^ shk3d2e2, 13) + kv98sgl);
            }
            String[] stringArray = byn.h53mf3tm(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

