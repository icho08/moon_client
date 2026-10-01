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
 *  net.minecraft.class_310
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
import java.util.Map;
import net.minecraft.class_10149;
import net.minecraft.class_10151;
import net.minecraft.class_10156;
import net.minecraft.class_284;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4668;
import net.minecraft.class_5944;
import org.jetbrains.annotations.ApiStatus;
import us.movy.moondlc.mixin.accessors.ShaderProgramAccessor;

public class dhsh_5 {
    private static final List hhq_2;
    protected class_5944 dhdgh_2;
    protected class_10156 khthm;
    private static final int dkf6kp0 = 715417118;
    private static final int fscj87qzh5i2v = -1425364123;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int q5o9p23pmmjcz;

    public dhsh_5(class_2960 class_29602, class_293 class_2932) {
        this.khthm = new class_10156(class_29602.method_12832().startsWith("core/") ? class_29602 : class_29602.method_45138("core/"), class_2932, class_10149.field_53930);
        hhq_2.add(this::thbj);
    }

    public class_4668.class_5942 dtd_5() {
        return new class_4668.class_5942(this.khthm);
    }

    public class_5944 rtth() {
        return RenderSystem.setShader((class_10156)this.khthm);
    }

    protected void tdy_3() {
    }

    public class_284 zhd_5(String string) {
        if (this.dhdgh_2 == null) {
            try {
                this.dhdgh_2 = class_310.method_1551().method_62887().method_64062(this.khthm);
                if (this.dhdgh_2 != null) {
                    this.tdy_3();
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (this.dhdgh_2 == null) {
            return null;
        }
        Map<String, class_284> map = ((ShaderProgramAccessor)this.dhdgh_2).getUniformsByName();
        return map != null ? map.get(string) : null;
    }

    @ApiStatus.Internal
    public static void tyz_3() {
        hhq_2.forEach(Runnable::run);
    }

    private void thbj() {
        try {
            this.dhdgh_2 = class_310.method_1551().method_62887().method_64062(this.khthm);
            this.tdy_3();
        }
        catch (class_10151.class_10152 class_101522) {
            throw new RuntimeException("Failed to initialize shader program", class_101522);
        }
    }

    private static String[] sgwxufeog(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite m60zlslwbokdh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ dkf6kp0 ^ string.hashCode() ^ n2 + fscj87qzh5i2v + i * -1333531997) + dkf6kp0) ^ fscj87qzh5i2v));
            }
            String[] stringArray = dhsh_5.sgwxufeog(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

