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
import net.minecraft.class_5944;
import org.jetbrains.annotations.ApiStatus;
import us.m0vy.moondlc.m0vyguard.sw_2;
import us.movy.moondlc.mixin.accessors.ShaderProgramAccessor;

public class fth {
    private static final List dhaz_4;
    protected class_5944 dhzw_2;
    protected class_10156 ttn_2;
    private static final int ezpl7bd9ms3c = 1586603037;
    private static final int q1887f7h7 = -1308177689;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int t4j3qeg9geh5;

    public fth(class_2960 class_29602, class_293 class_2932) {
        this.ttn_2 = new class_10156(class_29602.method_45138("core/"), class_2932, class_10149.field_53930);
        dhaz_4.add(this::ghshm);
    }

    public void ka(class_5944 class_59442) {
    }

    public sw_2 zzk_3() {
        return new sw_2(this);
    }

    public class_5944 aghl() {
        return RenderSystem.setShader((class_10156)this.ttn_2);
    }

    protected void zd_3() {
    }

    public class_284 rthw(String string) {
        if (this.dhzw_2 == null) {
            try {
                this.dhzw_2 = class_310.method_1551().method_62887().method_64062(this.ttn_2);
                if (this.dhzw_2 != null) {
                    this.zd_3();
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (this.dhzw_2 == null) {
            return null;
        }
        Map<String, class_284> map = ((ShaderProgramAccessor)this.dhzw_2).getUniformsByName();
        return map != null ? map.get(string) : null;
    }

    public class_10156 zshh_3() {
        return this.ttn_2;
    }

    @ApiStatus.Internal
    public static void sbl_2() {
        dhaz_4.forEach(Runnable::run);
    }

    private void ghshm() {
        try {
            this.dhzw_2 = class_310.method_1551().method_62887().method_64062(this.ttn_2);
            this.zd_3();
        }
        catch (class_10151.class_10152 class_101522) {
            throw new RuntimeException("Failed to initialize shader program", class_101522);
        }
    }

    private static String[] hdk90386rs(String string) {
        return string.split("\u0006\u001d", -1);
    }

    private static CallSite yulghztutb(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ezpl7bd9ms3c ^ string.hashCode() ^ n2 + q1887f7h7 + i * -314217633) + ezpl7bd9ms3c) ^ q1887f7h7));
            }
            String[] stringArray = fth.hdk90386rs(new String(cArray));
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

