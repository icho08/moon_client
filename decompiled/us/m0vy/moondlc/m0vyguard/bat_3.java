/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_290
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
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bdht;
import us.m0vy.moondlc.m0vyguard.tjd_2;

public class bat_3
extends tjd_2 {
    private final class_4587 jhd_4;
    private static final int o5tnlxdq = 89752367;
    private static final int qka7g6dax7fo = -1599777892;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int uun5m67752;

    public bat_3(class_293 class_2932, class_4587 class_45872) {
        super(class_2932);
        this.jhd_4 = class_45872;
    }

    public bat_3(class_4587 class_45872) {
        super(class_290.field_1575);
        this.jhd_4 = class_45872;
    }

    @Override
    public void jbn() {
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.enableBlend();
        this.shqy();
        bdht.dhdt_4();
        RenderSystem.setShaderTexture((int)0, (int)0);
        if (khsj == this) {
            khsj = null;
        }
    }

    @Generated
    public class_4587 dhms_2() {
        return this.jhd_4;
    }

    private static String[] yktr6rj8ba1e(String string) {
        return string.split("\u0004\u001f", -1);
    }

    private static CallSite hy0jre7r67bvo7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ o5tnlxdq ^ string.hashCode() ^ n2 + qka7g6dax7fo + i * -1408700075) + o5tnlxdq) ^ qka7g6dax7fo));
            }
            String[] stringArray = bat_3.yktr6rj8ba1e(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

