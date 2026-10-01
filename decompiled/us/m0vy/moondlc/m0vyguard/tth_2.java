/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2960;

public final class tth_2
extends Record {
    private final class_2960 zghw;
    private final float nn;
    private final float blh;
    private final float hrgh;
    private final float ttt_3;
    private final int jat;
    private final int sas;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int okllfs766wpc;

    public tth_2(class_2960 class_29602, float f, float f2, float f3, float f4, int n, int n2) {
        this.zghw = class_29602;
        this.nn = f;
        this.blh = f2;
        this.hrgh = f3;
        this.ttt_3 = f4;
        this.jat = n;
        this.sas = n2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{tth_2.class, "texture;u1;v1;u2;v2;width;height", "زغو", "نن", "بلح", "حرغ", "تطت", "جات", "ساس"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{tth_2.class, "texture;u1;v1;u2;v2;width;height", "زغو", "نن", "بلح", "حرغ", "تطت", "جات", "ساس"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{tth_2.class, "texture;u1;v1;u2;v2;width;height", "زغو", "نن", "بلح", "حرغ", "تطت", "جات", "ساس"}, this, object);
    }

    public class_2960 texture() {
        return this.zghw;
    }

    public float u1() {
        return this.nn;
    }

    public float v1() {
        return this.blh;
    }

    public float u2() {
        return this.hrgh;
    }

    public float v2() {
        return this.ttt_3;
    }

    public int width() {
        return this.jat;
    }

    public int height() {
        return this.sas;
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

