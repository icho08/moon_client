/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jetbrains.annotations.NotNull;

public final class jz_2
extends Record {
    private final float thnw;
    private final float khksh;
    private final float bmr;
    private final float znj;
    public static final jz_2 shhb;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int rh2x7eycjf97gv;

    public jz_2(float f, float f2, float f3, float f4) {
        this.thnw = f;
        this.khksh = f2;
        this.bmr = f3;
        this.znj = f4;
    }

    public static jz_2 all(float f) {
        return new jz_2(f, f, f, f);
    }

    public static jz_2 topLeft(float f) {
        return new jz_2(f, 0.0f, 0.0f, 0.0f);
    }

    public static jz_2 topRight(float f) {
        return new jz_2(0.0f, f, 0.0f, 0.0f);
    }

    public static jz_2 bottomRight(float f) {
        return new jz_2(0.0f, 0.0f, f, 0.0f);
    }

    public static jz_2 bottomLeft(float f) {
        return new jz_2(0.0f, 0.0f, 0.0f, f);
    }

    public static jz_2 top(float f, float f2) {
        return new jz_2(f, f2, 0.0f, 0.0f);
    }

    public static jz_2 bottom(float f, float f2) {
        return new jz_2(0.0f, 0.0f, f2, f);
    }

    public static jz_2 left(float f, float f2) {
        return new jz_2(f, 0.0f, 0.0f, f2);
    }

    public static jz_2 right(float f, float f2) {
        return new jz_2(0.0f, f, f2, 0.0f);
    }

    @Override
    @NotNull
    public String toString() {
        return "BorderRadius{topLeftRadius=" + this.thnw + ", topRightRadius=" + this.khksh + ", bottomRightRadius=" + this.bmr + ", bottomLeftRadius=" + this.znj + "}";
    }

    public float topLeftRadius() {
        return this.thnw;
    }

    public float topRightRadius() {
        return this.khksh;
    }

    public float bottomRightRadius() {
        return this.bmr;
    }

    public float bottomLeftRadius() {
        return this.znj;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{jz_2.class, "topLeftRadius;topRightRadius;bottomRightRadius;bottomLeftRadius", "ثنو", "خكش", "بمر", "زنج"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{jz_2.class, "topLeftRadius;topRightRadius;bottomRightRadius;bottomLeftRadius", "ثنو", "خكش", "بمر", "زنج"}, this, object);
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

