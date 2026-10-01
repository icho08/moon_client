/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Supplier
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
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
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_9801;
import us.m0vy.moondlc.m0vyguard.bsz;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.mf;
import us.m0vy.moondlc.m0vyguard.yt;

public class bmk
implements dl,
bsz {
    public static final Supplier thkt_2;
    public static final Supplier bthz_2;
    private long rtth_2 = 0L;
    private static yt bkz;
    private static yt thshd;
    private float zs_3 = 1.0f;
    private float jlm = 0.5f;
    private static final int g5au5onpoylm = 232263524;
    private static final int ofsx1h9ily5w = 136072592;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int r1iwwo7i2ao4v5;

    public void khzj_2() {
        bkz = new yt(class_2960.method_60655((String)"moondlc", (String)"kawase_down/data"));
        thshd = new yt(class_2960.method_60655((String)"moondlc", (String)"kawase_up/data"));
    }

    public void afr() {
        if (bkz == null || thshd == null) {
            return;
        }
        long l = System.currentTimeMillis();
        if (l - this.rtth_2 > 25L) {
            int n;
            int n2;
            this.rtth_2 = l;
            this.zs_3 = 1.0f;
            mf mf2 = (mf)thkt_2.get();
            mf mf3 = (mf)bthz_2.get();
            mf2.setDownscale(this.jlm).setLinear();
            mf3.setDownscale(this.jlm).setLinear();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            bkz.rtth();
            bkz.zkhz(this.zs_3, bmk.mc.method_1522().field_1482, bmk.mc.method_1522().field_1481);
            mf2.setup();
            mc.method_1522().method_35610();
            RenderSystem.setShaderTexture((int)0, (int)mc.method_1522().method_30277());
            this.ghsl(0.0f, 0.0f, dyt.method_4486(), dyt.method_4502());
            mf2.stop();
            mf[] mfArray = new mf[]{mf2, mf3};
            int n3 = 3;
            for (n2 = 1; n2 < 3; ++n2) {
                n = n2 % 2;
                mfArray[n].setup();
                mfArray[(n + 1) % 2].method_35610();
                RenderSystem.setShaderTexture((int)0, (int)mfArray[(n + 1) % 2].method_30277());
                bkz.zkhz(this.zs_3, mfArray[(n + 1) % 2].field_1482, mfArray[(n + 1) % 2].field_1481);
                this.ghsl(0.0f, 0.0f, dyt.method_4486(), dyt.method_4502());
                mfArray[(n + 1) % 2].method_1242();
                mfArray[n].stop();
            }
            thshd.rtth();
            for (n2 = 0; n2 < 3; ++n2) {
                n = n2 % 2;
                mfArray[(n + 1) % 2].setup();
                mfArray[n].method_35610();
                RenderSystem.setShaderTexture((int)0, (int)mfArray[n].method_30277());
                thshd.zkhz(this.zs_3, mfArray[n].field_1482, mfArray[n].field_1481);
                this.ghsl(0.0f, 0.0f, dyt.method_4486(), dyt.method_4502());
                mfArray[n].method_1242();
                mfArray[n].stop();
            }
            mc.method_1522().method_1242();
            mc.method_1522().method_1235(true);
            RenderSystem.setShaderTexture((int)0, (int)0);
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
        }
    }

    private void ghsl(float f, float f2, float f3, float f4) {
        int n = -1;
        class_287 class_2872 = RenderSystem.renderThreadTesselator().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        class_2872.method_22912(f, f2, 0.0f).method_22913(0.0f, 1.0f).method_39415(n);
        class_2872.method_22912(f, f2 + f4, 0.0f).method_22913(0.0f, 0.0f).method_39415(n);
        class_2872.method_22912(f + f3, f2 + f4, 0.0f).method_22913(1.0f, 0.0f).method_39415(n);
        class_2872.method_22912(f + f3, f2, 0.0f).method_22913(1.0f, 1.0f).method_39415(n);
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    public static int jkhq() {
        return ((mf)bthz_2.get()).method_30277();
    }

    @Generated
    public void thdhz_2(float f) {
        this.zs_3 = f;
    }

    @Generated
    public void bsr(float f) {
        this.jlm = f;
    }

    private static mf btd_3() {
        return new mf(false).setLinear();
    }

    private static mf dsa_7() {
        return new mf(false).setLinear();
    }

    private static String[] h7ib7xjrci(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ctozbwzoev(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ g5au5onpoylm ^ string.hashCode()) + (n2 + ofsx1h9ily5w) + i ^ g5au5onpoylm, 16) + ofsx1h9ily5w);
            }
            String[] stringArray = bmk.h7ib7xjrci(new String(cArray));
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

