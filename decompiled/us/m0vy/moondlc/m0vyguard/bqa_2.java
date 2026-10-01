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

public class bqa_2
extends tjd_2 {
    private final class_4587 dhts_4;
    private static final int c4jnktn0m7bn = 1535834640;
    private static final int y0kpruk = -2003150563;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int lcf08xy1lhzpe;

    public bqa_2(class_293 class_2932, class_4587 class_45872) {
        super(class_2932);
        this.dhts_4 = class_45872;
    }

    public bqa_2(class_4587 class_45872) {
        super(class_290.field_1576);
        this.dhts_4 = class_45872;
    }

    @Override
    public void jbn() {
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        bdht.zkhb_2();
        this.shqy();
        bdht.dhdt_4();
        if (khsj == this) {
            khsj = null;
        }
    }

    @Generated
    public class_4587 tja_3() {
        return this.dhts_4;
    }

    private static String[] x01kgws81ti213(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ej3fr924q19(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ c4jnktn0m7bn ^ string.hashCode() ^ n2 + y0kpruk + i * -331526953) + c4jnktn0m7bn) ^ y0kpruk));
            }
            String[] stringArray = bqa_2.x01kgws81ti213(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

