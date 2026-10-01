/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_332
 */
package us.m0vy.moondlc.m0vyguard;

import lombok.Generated;
import net.minecraft.class_332;
import us.m0vy.moondlc.m0vyguard.bdhq;

public class bbf
extends bdhq {
    private final int dhah_4;
    private final int rzm;
    private final float jqw;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int uj8fmyvhk;

    protected bbf(class_332 class_3322, int n, int n2, float f) {
        super(class_3322);
        this.dhah_4 = n;
        this.rzm = n2;
        this.jqw = f;
    }

    public static bbf of(class_332 class_3322, int n, int n2, float f) {
        return new bbf(class_3322, n, n2, f);
    }

    @Generated
    public int getMouseX() {
        return this.dhah_4;
    }

    @Generated
    public int getMouseY() {
        return this.rzm;
    }

    @Generated
    public float getDelta() {
        return this.jqw;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

