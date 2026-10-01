/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Supplier
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_276
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_3532
 *  net.minecraft.class_9801
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.common.base.Supplier;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_276;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_3532;
import net.minecraft.class_9801;
import us.m0vy.moondlc.m0vyguard.bkhz_2;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tkhd_2;
import us.m0vy.moondlc.m0vyguard.sgh;
import us.m0vy.moondlc.m0vyguard.ghz_2;
import us.m0vy.moondlc.m0vyguard.mf;
import us.movy.moondlc.Moondlc;

public class bthr
implements tthy,
bkhz_2 {
    private static final class_276 rdr_2;
    public static final Supplier ztdh_2;
    public static final Supplier dhbh_2;
    private final tkhd_2 bqj = new tkhd_2();
    private static ghz_2 sjm_2;
    private static ghz_2 thnt;
    private float thnd = 1.0f;
    private float rdhh = 0.5f;
    private final mf[] shthth = new mf[2];
    private static final int e6st62w = 702627191;
    private static final int r2o05xqlowrql = -923186689;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int wpm64wq1ld;

    public void thqd() {
        sjm_2 = new ghz_2(Moondlc.id("kawase_down/data"));
        thnt = new ghz_2(Moondlc.id("kawase_up/data"));
    }

    public void hhgh() {
        class_276 class_2762;
        if (sjm_2 == null || thnt == null) {
            return;
        }
        if (this.bqj.tagh(25L) && (class_2762 = mc.method_1522()) != null && class_2762.method_30277() > 0 && class_2762.field_1482 > 0 && class_2762.field_1481 > 0) {
            mf mf2;
            mf mf3;
            int n;
            int n2;
            int n3;
            int n4;
            float f;
            float f2;
            this.thnd = sgh.shsha();
            float f3 = this.thnd - 0.5f;
            if (f3 >= 0.0f) {
                f2 = Math.max(0.005f, f3);
                f = 0.5f;
                n4 = f3 > 5.0f ? 7 : (f3 > 3.0f ? 5 : 3);
            } else {
                float f4 = class_3532.method_15363((float)(this.thnd / 0.5f), (float)0.0f, (float)1.0f);
                f = 1.0f - 0.5f * f4;
                f2 = 0.005f;
                n4 = 3;
            }
            mf mf4 = (mf)ztdh_2.get();
            mf mf5 = (mf)dhbh_2.get();
            mf4.setDownscale(f).setLinear();
            mf5.setDownscale(f).setLinear();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            int n5 = bdn_2.method_4486();
            int n6 = bdn_2.method_4502();
            sjm_2.aghl();
            sjm_2.bghk(f2, class_2762.field_1482, class_2762.field_1481);
            mf4.setup();
            class_2762.method_35610();
            RenderSystem.setShaderTexture((int)0, (int)class_2762.method_30277());
            this.zghl_2(0.0f, 0.0f, n5, n6);
            mf4.stop();
            mf[] mfArray = this.shthth;
            mfArray[0] = mf4;
            mfArray[1] = mf5;
            for (n3 = 1; n3 < n4; ++n3) {
                n2 = n3 & 1;
                n = n2 ^ 1;
                mf3 = mfArray[n];
                mf2 = mfArray[n2];
                mf2.setup();
                mf3.method_35610();
                RenderSystem.setShaderTexture((int)0, (int)mf3.method_30277());
                sjm_2.bghk(f2, mf3.field_1482, mf3.field_1481);
                this.zghl_2(0.0f, 0.0f, n5, n6);
                mf3.method_1242();
                mf2.stop();
            }
            thnt.aghl();
            for (n3 = 0; n3 < n4; ++n3) {
                n2 = n3 & 1;
                n = n2 ^ 1;
                mf3 = mfArray[n2];
                mf2 = mfArray[n];
                mf2.setup();
                mf3.method_35610();
                RenderSystem.setShaderTexture((int)0, (int)mf3.method_30277());
                thnt.bghk(f2, mf3.field_1482, mf3.field_1481);
                this.zghl_2(0.0f, 0.0f, n5, n6);
                mf3.method_1242();
                mf3.stop();
            }
            class_2762.method_1242();
            class_2762.method_1235(true);
            RenderSystem.setShaderTexture((int)0, (int)0);
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
        }
    }

    private void zghl_2(float f, float f2, float f3, float f4) {
        int n = -1;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22912(f, f2, 0.0f).method_22913(0.0f, 1.0f).method_39415(n);
        class_2872.method_22912(f, f2 + f4, 0.0f).method_22913(0.0f, 0.0f).method_39415(n);
        class_2872.method_22912(f + f3, f2 + f4, 0.0f).method_22913(1.0f, 0.0f).method_39415(n);
        class_2872.method_22912(f + f3, f2, 0.0f).method_22913(1.0f, 1.0f).method_39415(n);
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    public static int khtk_2() {
        return ((mf)dhbh_2.get()).method_30277();
    }

    @Generated
    public void tak_4(float f) {
        this.thnd = f;
    }

    @Generated
    public void bjz(float f) {
        this.rdhh = f;
    }

    private static mf dhkhm() {
        return new mf(false).setLinear();
    }

    private static mf khbn() {
        return new mf(false).setLinear();
    }

    private static String[] c2a5l0oe8(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite awq7slv6sjyjhq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ e6st62w ^ string.hashCode() ^ n2 + r2o05xqlowrql ^ i * -510651903 ^ e6st62w, 13) ^ r2o05xqlowrql));
            }
            String[] stringArray = bthr.c2a5l0oe8(new String(cArray));
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

