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
import us.m0vy.moondlc.m0vyguard.bdhy;

public class bagh_2
extends bdhy {
    private final int bzq_2;
    private final int tzh;
    private final float shwy;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int vrmgsyf3qpfus6;

    protected bagh_2(class_332 class_3322, int n, int n2, float f) {
        super(class_3322);
        this.bzq_2 = n;
        this.tzh = n2;
        this.shwy = f;
    }

    public static bagh_2 of(class_332 class_3322, int n, int n2, float f) {
        return new bagh_2(class_3322, n, n2, f);
    }

    @Generated
    public int getMouseX() {
        return this.bzq_2;
    }

    @Generated
    public int getMouseY() {
        return this.tzh;
    }

    @Generated
    public float getDelta() {
        return this.shwy;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

