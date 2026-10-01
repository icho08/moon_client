/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10149
 *  net.minecraft.class_10151$class_10152
 *  net.minecraft.class_10156
 *  net.minecraft.class_284
 *  net.minecraft.class_293
 *  net.minecraft.class_2960
 *  net.minecraft.class_4668
 *  net.minecraft.class_4668$class_5942
 *  net.minecraft.class_5944
 *  org.jetbrains.annotations.ApiStatus$Internal
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import net.minecraft.class_10149;
import net.minecraft.class_10151;
import net.minecraft.class_10156;
import net.minecraft.class_284;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4668;
import net.minecraft.class_5944;
import org.jetbrains.annotations.ApiStatus;
import us.m0vy.moondlc.m0vyguard.tdha;
import us.movy.moondlc.mixin.accessors.ShaderProgramAccessor;

public class tdf
implements tdha {
    private static final List hshr;
    protected class_5944 zjw;
    protected class_10156 dham_2;
    private static final int vrtikddp3mdl = 1988301192;
    private static final int ba307yactz61 = -1183535382;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int lexk72zlnqudgl;

    public tdf(class_2960 class_29602, class_293 class_2932) {
        this.dham_2 = new class_10156(class_29602.method_45138("core/"), class_2932, class_10149.field_53930);
        hshr.add(this::hzq_2);
    }

    public class_4668 bthd() {
        return new class_4668.class_5942(this.dham_2);
    }

    public class_5944 tfd_2() {
        if (this.zjw == null) {
            System.err.println("[MoonDLC] Warning: Shader program not loaded, cannot use: " + String.valueOf(this.dham_2));
            return null;
        }
        return RenderSystem.setShader((class_10156)this.dham_2);
    }

    protected void haf() {
    }

    public class_284 thrs_2(String string) {
        if (this.zjw == null) {
            System.err.println("[MoonDLC] Warning: Shader program not loaded, cannot find uniform: " + string);
            return null;
        }
        return ((ShaderProgramAccessor)this.zjw).getUniformsByName().get(string);
    }

    @ApiStatus.Internal
    public static void shyt_2() {
        hshr.forEach(Runnable::run);
    }

    private void hzq_2() {
        try {
            this.zjw = mc.method_62887().method_64062(this.dham_2);
            this.haf();
        }
        catch (class_10151.class_10152 class_101522) {
            // empty catch block
        }
    }

    private static String[] z32s1uec7upkfe(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite qboa6wkw4wjo(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ vrtikddp3mdl ^ string.hashCode()) + (n2 + ba307yactz61) + i ^ vrtikddp3mdl, 17) + ba307yactz61);
            }
            String[] stringArray = tdf.z32s1uec7upkfe(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

