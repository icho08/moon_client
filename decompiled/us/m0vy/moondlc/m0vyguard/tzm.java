/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_4587
 *  org.joml.Matrix4f
 *  org.joml.Vector4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Stack;
import net.minecraft.class_4587;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import us.m0vy.moondlc.m0vyguard.tdhz;
import us.m0vy.moondlc.m0vyguard.dl;

public class tzm
implements dl {
    private static final Stack shtd_2;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int bxsbxvq5;

    public static void hds_2(class_4587 class_45872, float f, float f2, float f3, float f4) {
        float f5 = (float)mc.method_22683().method_4495();
        int n = mc.method_22683().method_4506();
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        Vector4f vector4f = new Vector4f(f, f2, 0.0f, 1.0f);
        Vector4f vector4f2 = new Vector4f(f + f3, f2 + f4, 0.0f, 1.0f);
        matrix4f.transform(vector4f);
        matrix4f.transform(vector4f2);
        float f6 = Math.min(vector4f.x(), vector4f2.x());
        float f7 = Math.min(vector4f.y(), vector4f2.y());
        float f8 = Math.max(vector4f.x(), vector4f2.x());
        float f9 = Math.max(vector4f.y(), vector4f2.y());
        int n2 = Math.round(f6 * f5);
        int n3 = Math.round((float)n - f9 * f5);
        int n4 = Math.round((f8 - f6) * f5);
        int n5 = Math.round((f9 - f7) * f5);
        class_45872.method_22903();
        tdhz tdhz2 = new tdhz(n2, n3, n4, n5);
        if (!shtd_2.isEmpty()) {
            tdhz tdhz3 = (tdhz)shtd_2.peek();
            int n6 = Math.max(tdhz3.khah_3, tdhz2.khah_3);
            int n7 = Math.max(tdhz3.jat_2, tdhz2.jat_2);
            int n8 = Math.min(tdhz3.khah_3 + tdhz3.dkhb, tdhz2.khah_3 + tdhz2.dkhb);
            int n9 = Math.min(tdhz3.jat_2 + tdhz3.thdhz, tdhz2.jat_2 + tdhz2.thdhz);
            tdhz2.khah_3 = n6;
            tdhz2.jat_2 = n7;
            tdhz2.dkhb = Math.max(0, n8 - n6);
            tdhz2.thdhz = Math.max(0, n9 - n7);
        }
        shtd_2.push(tdhz2);
        RenderSystem.enableScissor((int)tdhz2.khah_3, (int)tdhz2.jat_2, (int)tdhz2.dkhb, (int)tdhz2.thdhz);
    }

    public static void jdz_4(class_4587 class_45872) {
        if (!shtd_2.isEmpty()) {
            shtd_2.pop();
        }
        if (shtd_2.isEmpty()) {
            RenderSystem.disableScissor();
        } else {
            tdhz tdhz2 = (tdhz)shtd_2.peek();
            RenderSystem.enableScissor((int)tdhz2.khah_3, (int)tdhz2.jat_2, (int)tdhz2.dkhb, (int)tdhz2.thdhz);
        }
        class_45872.method_22909();
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

