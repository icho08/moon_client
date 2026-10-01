/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10156
 *  net.minecraft.class_293
 *  net.minecraft.class_5944
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_10156;
import net.minecraft.class_293;
import net.minecraft.class_5944;
import us.m0vy.moondlc.m0vyguard.bmt_2;
import us.m0vy.moondlc.m0vyguard.dt_2;
import us.m0vy.moondlc.m0vyguard.zn_2;

public class yj
extends bmt_2 {
    protected zn_2 tshs;
    private float bak_2;
    private float thak_2;
    private float khlq;
    private float nkh;
    private static final int l4i0nnczm03s2 = -77254736;
    private static final int i9urq29mldol = -2111338537;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int wiu95otgl;

    public yj(class_293 class_2932, zn_2 zn2, float f, float f2, float f3, float f4) {
        super(class_2932);
        this.tshs = zn2;
        this.bak_2 = f;
        this.thak_2 = f2;
        this.khlq = f3;
        this.nkh = f4;
    }

    @Override
    public void sw_2() {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (int)this.tshs.khnk());
        class_5944 class_59442 = RenderSystem.setShader((class_10156)dt_2.jsr_2);
        float f = 0.05f;
        float f2 = 0.5f;
        class_59442.method_34582("Range").method_1251(this.tshs.dhz_10().range());
        class_59442.method_34582("Thickness").method_1251(f);
        class_59442.method_34582("Smoothness").method_1251(f2);
        class_59442.method_34582("EnableFadeout").method_35649(1);
        class_59442.method_34582("FadeoutStart").method_1251(this.bak_2);
        class_59442.method_34582("FadeoutEnd").method_1251(this.thak_2);
        class_59442.method_34582("MaxWidth").method_1251(this.khlq);
        class_59442.method_34582("TextPosX").method_1251(this.nkh);
        this.mdh();
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        if (sbgh == this) {
            sbgh = null;
        }
    }

    private static String[] dixb1htzj(String string) {
        return string.split("\u0003\u001a", -1);
    }

    private static CallSite cwrmec0nlpy5y(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ l4i0nnczm03s2 ^ string.hashCode()) + (n2 + i9urq29mldol) + i ^ l4i0nnczm03s2, 22) + i9urq29mldol);
            }
            String[] stringArray = yj.dixb1htzj(new String(cArray));
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

