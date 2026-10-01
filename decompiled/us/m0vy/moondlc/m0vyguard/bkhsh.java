/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_293
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bmt_2;
import us.m0vy.moondlc.m0vyguard.tkhr;

public class bkhsh
extends bmt_2 {
    private final class_4587 shs_8;
    private static final int k8k8397txglf = -61669675;
    private static final int feikvpxbj8 = -106623065;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int m9hd3fzr5xp;

    public bkhsh(class_293 class_2932, class_4587 class_45872) {
        super(class_2932);
        this.shs_8 = class_45872;
    }

    @Override
    public void sw_2() {
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        tkhr.dzs_7();
        this.mdh();
        tkhr.zsz();
        if (sbgh == this) {
            sbgh = null;
        }
    }

    @Generated
    public class_4587 zls_4() {
        return this.shs_8;
    }

    private static String[] jk84sf4v36hjl(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite lsd1jpfximmr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ k8k8397txglf ^ string.hashCode() ^ n2 + feikvpxbj8 + i * 1136434307) + k8k8397txglf) ^ feikvpxbj8));
            }
            String[] stringArray = bkhsh.jk84sf4v36hjl(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

