/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 */
package us.m0vy.moondlc.m0vyguard;

import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.tthdh;

public abstract class bhd_3
extends class_437 {
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";

    protected bhd_3() {
        super((class_2561)class_2561.method_43473());
    }

    public abstract void render(bzth var1);

    public void method_25420(class_332 class_3322, int n, int n2, float f) {
    }

    public final void method_25394(class_332 class_3322, int n, int n2, float f) {
        super.method_25394(class_3322, n, n2, f);
        bzth bzth2 = bzth.of(class_3322, n, n2, f);
        this.render(bzth2);
    }

    public final boolean method_25402(double d, double d2, int n) {
        tthdh tthdh2 = tthdh.fromButtonIndex(n);
        this.onMouseClicked(d, d2, tthdh2);
        return super.method_25402(d, d2, n);
    }

    public final boolean method_25406(double d, double d2, int n) {
        tthdh tthdh2 = tthdh.fromButtonIndex(n);
        this.onMouseReleased(d, d2, tthdh2);
        return super.method_25406(d, d2, n);
    }

    public final boolean method_25403(double d, double d2, int n, double d3, double d4) {
        tthdh tthdh2 = tthdh.fromButtonIndex(n);
        this.onMouseDragged(d, d2, tthdh2, d3, d4);
        return super.method_25403(d, d2, n, d3, d4);
    }

    public void onMouseClicked(double d, double d2, tthdh tthdh2) {
    }

    public void onMouseReleased(double d, double d2, tthdh tthdh2) {
    }

    public void onMouseDragged(double d, double d2, tthdh tthdh2, double d3, double d4) {
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

