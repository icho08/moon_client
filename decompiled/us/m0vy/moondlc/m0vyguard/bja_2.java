/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10156
 *  net.minecraft.class_290
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
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_5944;
import us.m0vy.moondlc.m0vyguard.bqw;
import us.m0vy.moondlc.m0vyguard.tbh;
import us.m0vy.moondlc.m0vyguard.tjd_2;
import us.m0vy.moondlc.m0vyguard.trd;

public class bja_2
extends tjd_2 {
    protected bqw dygh;
    private static final int pafovnm396w = 1343090348;
    private static final int szh73rrl0dke = -1293102099;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int r5tbh4tn;

    public bja_2(class_293 class_2932, bqw bqw2) {
        super(class_2932);
        this.dygh = bqw2;
    }

    public bja_2(bqw bqw2) {
        super(class_290.field_1575);
        this.dygh = bqw2;
    }

    public bja_2(trd trd2) {
        this(trd2.dma());
    }

    @Override
    public void jbn() {
        float f = 0.05f;
        float f2 = 0.5f;
        float f3 = 0.0f;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (int)this.dygh.zas());
        class_5944 class_59442 = RenderSystem.setShader((class_10156)tbh.hab);
        class_59442.method_34582("Range").method_1251(this.dygh.dhksh().range());
        class_59442.method_34582("Thickness").method_1251(f);
        class_59442.method_34582("Smoothness").method_1251(f2);
        class_59442.method_34582("EnableFadeout").method_35649(0);
        this.shqy();
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        if (khsj == this) {
            khsj = null;
        }
    }

    private static String[] pq0ckmwnkob(String string) {
        return string.split("\u0006\u000e", -1);
    }

    private static CallSite eixy059q4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ pafovnm396w ^ string.hashCode() ^ n2 + szh73rrl0dke + i * -1555417471) + pafovnm396w) ^ szh73rrl0dke));
            }
            String[] stringArray = bja_2.pq0ckmwnkob(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

