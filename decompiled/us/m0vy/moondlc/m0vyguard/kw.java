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
import us.m0vy.moondlc.m0vyguard.bqw;
import us.m0vy.moondlc.m0vyguard.tbh;
import us.m0vy.moondlc.m0vyguard.tjd_2;

public class kw
extends tjd_2 {
    protected bqw hss;
    private float tls;
    private float dhghj;
    private float khagh_2;
    private float taj_2;
    private static final int sbhbcrn7s5z = -916173396;
    private static final int bsabptp7 = -178601343;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ohnalfkepzxmjw;

    public kw(class_293 class_2932, bqw bqw2, float f, float f2, float f3, float f4) {
        super(class_2932);
        this.hss = bqw2;
        this.tls = f;
        this.dhghj = f2;
        this.khagh_2 = f3;
        this.taj_2 = f4;
    }

    @Override
    public void jbn() {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (int)this.hss.zas());
        class_5944 class_59442 = RenderSystem.setShader((class_10156)tbh.hab);
        float f = 0.05f;
        float f2 = 0.5f;
        class_59442.method_34582("Range").method_1251(this.hss.dhksh().range());
        class_59442.method_34582("Thickness").method_1251(f);
        class_59442.method_34582("Smoothness").method_1251(f2);
        class_59442.method_34582("EnableFadeout").method_35649(1);
        class_59442.method_34582("FadeoutStart").method_1251(this.tls);
        class_59442.method_34582("FadeoutEnd").method_1251(this.dhghj);
        class_59442.method_34582("MaxWidth").method_1251(this.khagh_2);
        class_59442.method_34582("TextPosX").method_1251(this.taj_2);
        this.shqy();
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        if (khsj == this) {
            khsj = null;
        }
    }

    private static String[] rgmmpig7t1ror0(String string) {
        return string.split("\u0003\u001f", -1);
    }

    private static CallSite uitbuf6erhvjn2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ sbhbcrn7s5z ^ string.hashCode() ^ n2 + bsabptp7 ^ i * -419095695 ^ sbhbcrn7s5z, 21) ^ bsabptp7));
            }
            String[] stringArray = kw.rgmmpig7t1ror0(new String(cArray));
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

