/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import net.minecraft.class_1309;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bghdh;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.lb;

public interface bmd_2
extends tthy {
    public static final int shft = 8;

    public lb ysh(lb var1, lb var2, class_1309 var3, boolean var4, boolean var5);

    default public int hbdh(lb lb2, lb lb3) {
        if (lb2 == null || lb3 == null) {
            return 0;
        }
        float f = Math.abs(bghdh.ttb_2(lb2.sry(), lb3.sry()));
        float f2 = Math.abs(lb3.khdhd_2() - lb2.khdhd_2());
        float f3 = Math.max(1.0f, this.shgh_3());
        float f4 = Math.max(1.0f, this.hghs());
        int n = (int)Math.ceil(Math.max(f / f3, f2 / f4));
        return class_3532.method_15340((int)n, (int)0, (int)8);
    }

    default public float shgh_3() {
        return 30.0f;
    }

    default public float hghs() {
        return 18.0f;
    }

    default public boolean ahy(lb lb2, lb lb3, class_1309 class_13092) {
        return true;
    }

    default public void tf() {
    }

    default public void mgh(class_1309 class_13092) {
    }
}

