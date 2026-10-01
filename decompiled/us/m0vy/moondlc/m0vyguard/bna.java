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

public class bna
extends bmt_2 {
    protected zn_2 thqz;
    private static final int z3c17sopzn = -710024705;
    private static final int wd23pep9gaw9 = 1549338340;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ntoeqlx8;

    public bna(class_293 class_2932, zn_2 zn2) {
        super(class_2932);
        this.thqz = zn2;
    }

    @Override
    public void sw_2() {
        float f = 0.05f;
        float f2 = 0.5f;
        float f3 = 0.0f;
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.setShaderTexture((int)0, (int)this.thqz.khnk());
        class_5944 class_59442 = RenderSystem.setShader((class_10156)dt_2.jsr_2);
        class_59442.method_34582("Range").method_1251(this.thqz.dhz_10().range());
        class_59442.method_34582("Thickness").method_1251(f);
        class_59442.method_34582("Smoothness").method_1251(f2);
        class_59442.method_34582("EnableFadeout").method_35649(0);
        this.mdh();
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        if (sbgh == this) {
            sbgh = null;
        }
    }

    private static String[] quq5vlugxy4q8a(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite usl20slm7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ z3c17sopzn ^ string.hashCode() ^ n2 + wd23pep9gaw9 ^ i * -1378307331 ^ z3c17sopzn, 26) ^ wd23pep9gaw9));
            }
            String[] stringArray = bna.quq5vlugxy4q8a(new String(cArray));
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

