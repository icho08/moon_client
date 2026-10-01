/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_10366
 *  net.minecraft.class_276
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_10366;
import net.minecraft.class_276;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import us.m0vy.moondlc.m0vyguard.bkhz_2;
import us.m0vy.moondlc.m0vyguard.btkh_2;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.ghz_2;
import us.m0vy.moondlc.m0vyguard.mf;
import us.movy.moondlc.Moondlc;
import us.movy.moondlc.mixin.accessors.FramebufferAccessor;

public class bzkh_2
implements tthy,
bkhz_2 {
    private static final float tqj = 0.05f;
    private static final float dbz = 0.5f;
    private final mf shbz_2 = new mf(false).setLinear();
    private final mf tbt = new mf(false).setDownscale(0.5f).setLinear();
    private final mf rkhz = new mf(false).setDownscale(0.5f).setLinear();
    private ghz_2 dwh;
    private ghz_2 dr_2;
    private btkh_2 dkdh;
    private int bms_2;
    private int khjgh;
    private static final int gw77zaba = -2080378040;
    private static final int na79m6qr2 = 117459397;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int fhacws2henw;

    public void tyw_2() {
        this.dwh = new ghz_2(Moondlc.id("kawase_down/data"));
        this.dr_2 = new ghz_2(Moondlc.id("kawase_up/data"));
        this.dkdh = new btkh_2(Moondlc.id("fog_blur/data"));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void zhk(float f, float f2, float f3, int n, float f4, float f5, boolean bl) {
        int n2;
        class_276 class_2762 = mc.method_1522();
        int n3 = n2 = class_2762 == null ? 0 : ((FramebufferAccessor)class_2762).getDepthAttachment();
        if (this.dwh != null && this.dr_2 != null && this.dkdh != null && n2 > 0 && class_2762 != null && class_2762.method_30277() > 0 && class_2762.field_1482 > 0 && class_2762.field_1481 > 0) {
            this.bms_2 = class_2762.field_1482;
            this.khjgh = class_2762.field_1481;
            this.shbz_2.setFixedSize(this.bms_2, this.khjgh);
            this.tbt.setFixedSize(this.bms_2, this.khjgh);
            this.rkhz.setFixedSize(this.bms_2, this.khjgh);
            RenderSystem.backupProjectionMatrix();
            Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
            matrix4fStack.pushMatrix();
            matrix4fStack.translation(0.0f, 0.0f, -11000.0f);
            RenderSystem.setProjectionMatrix((Matrix4f)new Matrix4f().setOrtho(0.0f, (float)this.bms_2, (float)this.khjgh, 0.0f, 1000.0f, 21000.0f), (class_10366)class_10366.field_54954);
            try {
                this.shkhkh(class_2762);
                int n4 = this.khwd_2(Math.max(1.0f, f4), Math.max(1, n));
                this.zwb(class_2762, n2, n4, f, f2, Math.max(this.zqsh(), f2 + 16.0f), f3, f5, bl);
            }
            finally {
                matrix4fStack.popMatrix();
                RenderSystem.restoreProjectionMatrix();
                class_2762.method_1235(true);
            }
        }
    }

    private void shkhkh(class_276 class_2762) {
        this.shbz_2.setDownscale(1.0f).setLinear();
        this.bjw(this.shbz_2);
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableBlend();
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        class_2762.method_35610();
        RenderSystem.setShaderTexture((int)0, (int)class_2762.method_30277());
        this.jkgh();
        class_2762.method_1242();
        RenderSystem.setShaderTexture((int)0, (int)0);
        this.shbz_2.stop();
    }

    private int khwd_2(float f, int n) {
        mf mf2;
        int n2;
        this.tbt.setDownscale(0.5f).setLinear();
        this.rkhz.setDownscale(0.5f).setLinear();
        mf[] mfArray = new mf[]{this.tbt, this.rkhz};
        mf mf3 = this.shbz_2;
        int n3 = Math.min(n, 16);
        this.dwh.aghl();
        for (n2 = 0; n2 < n3; ++n2) {
            mf2 = mfArray[n2 % mfArray.length];
            this.bjw(mf2);
            mf3.method_35610();
            RenderSystem.setShaderTexture((int)0, (int)mf3.method_30277());
            this.dwh.bghk(f, mf3.field_1482, mf3.field_1481);
            this.jkgh();
            mf3.method_1242();
            mf2.stop();
            mf3 = mf2;
        }
        this.dr_2.aghl();
        for (n2 = 0; n2 < n3; ++n2) {
            mf2 = mf3 == this.tbt ? this.rkhz : this.tbt;
            this.bjw(mf2);
            mf3.method_35610();
            RenderSystem.setShaderTexture((int)0, (int)mf3.method_30277());
            this.dr_2.bghk(f, mf3.field_1482, mf3.field_1481);
            this.jkgh();
            mf3.method_1242();
            mf2.stop();
            mf3 = mf2;
        }
        RenderSystem.setShaderTexture((int)0, (int)0);
        return mf3.method_30277();
    }

    private void bjw(mf mf2) {
        mf2.setup();
        mf2.method_1235(true);
    }

    private float zqsh() {
        return bzkh_2.mc.field_1773 == null ? 1024.0f : Math.max(64.0f, bzkh_2.mc.field_1773.method_32796());
    }

    private void zwb(class_276 class_2762, int n, int n2, float f, float f2, float f3, float f4, float f5, boolean bl) {
        class_2762.method_1235(true);
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableBlend();
        this.dkdh.aghl();
        this.dkdh.zjz_3(f, f2, 0.05f, f3, f4, Math.max(0.0f, f5), bl);
        RenderSystem.setShaderTexture((int)0, (int)this.shbz_2.method_30277());
        RenderSystem.setShaderTexture((int)1, (int)n2);
        RenderSystem.setShaderTexture((int)2, (int)n);
        this.jkgh();
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.setShaderTexture((int)1, (int)0);
        RenderSystem.setShaderTexture((int)2, (int)0);
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
    }

    private void jkgh() {
        this.zzy_4(0.0f, 0.0f, this.bms_2, this.khjgh);
    }

    private void zzy_4(float f, float f2, float f3, float f4) {
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22912(f, f2, 0.0f).method_22913(0.0f, 1.0f).method_39415(-1);
        class_2872.method_22912(f, f2 + f4, 0.0f).method_22913(0.0f, 0.0f).method_39415(-1);
        class_2872.method_22912(f + f3, f2 + f4, 0.0f).method_22913(1.0f, 0.0f).method_39415(-1);
        class_2872.method_22912(f + f3, f2, 0.0f).method_22913(1.0f, 1.0f).method_39415(-1);
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    private static String[] fmr5fi4q0v3mob(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite pax3tprls7mn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ gw77zaba ^ string.hashCode() ^ n2 + na79m6qr2 ^ i * -1014932351 ^ gw77zaba, 23) ^ na79m6qr2));
            }
            String[] stringArray = bzkh_2.fmr5fi4q0v3mob(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

