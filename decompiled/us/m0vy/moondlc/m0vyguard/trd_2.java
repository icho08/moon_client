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

public class trd_2
extends bmt_2 {
    private final class_4587 dhad_3;
    private static final int u3026rtroskl = -1852672260;
    private static final int bfad509iny = 767961136;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int w5tf9k6tkr2z;

    public trd_2(class_293 class_2932, class_4587 class_45872) {
        super(class_2932);
        this.dhad_3 = class_45872;
    }

    @Override
    public void sw_2() {
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.enableBlend();
        this.mdh();
        tkhr.zsz();
        RenderSystem.setShaderTexture((int)0, (int)0);
        if (sbgh == this) {
            sbgh = null;
        }
    }

    @Generated
    public class_4587 dhhs() {
        return this.dhad_3;
    }

    private static String[] e6nppfjpr(String string) {
        return string.split("\u0005\u0016", -1);
    }

    private static CallSite gthjj3ethu3n1w(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ u3026rtroskl ^ string.hashCode() ^ n2 + bfad509iny ^ i * 1232893771 ^ u3026rtroskl, 6) ^ bfad509iny));
            }
            String[] stringArray = trd_2.e6nppfjpr(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

