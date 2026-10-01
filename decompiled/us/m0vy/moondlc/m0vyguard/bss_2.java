/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class bss_2
extends Record {
    private final float rdl;
    private final float khwt_2;
    private final float thdy_2;
    private final float rtk_2;
    public static final bss_2 khsh_5;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int but0jmn29gy0w;

    public bss_2(float f, float f2, float f3, float f4) {
        this.rdl = f;
        this.khwt_2 = f2;
        this.thdy_2 = f3;
        this.rtk_2 = f4;
    }

    public static bss_2 all(float f) {
        return new bss_2(f, f, f, f);
    }

    public static bss_2 topLeft(float f) {
        return new bss_2(f, 0.0f, 0.0f, 0.0f);
    }

    public static bss_2 topRight(float f) {
        return new bss_2(0.0f, f, 0.0f, 0.0f);
    }

    public static bss_2 bottomRight(float f) {
        return new bss_2(0.0f, 0.0f, f, 0.0f);
    }

    public static bss_2 bottomLeft(float f) {
        return new bss_2(0.0f, 0.0f, 0.0f, f);
    }

    public static bss_2 top(float f, float f2) {
        return new bss_2(f, f2, 0.0f, 0.0f);
    }

    public static bss_2 bottom(float f, float f2) {
        return new bss_2(0.0f, 0.0f, f2, f);
    }

    public static bss_2 left(float f, float f2) {
        return new bss_2(f, 0.0f, 0.0f, f2);
    }

    public static bss_2 right(float f, float f2) {
        return new bss_2(0.0f, f, f2, 0.0f);
    }

    @Override
    public String toString() {
        return "BorderRadius{topLeftRadius=" + this.rdl + ", topRightRadius=" + this.khwt_2 + ", bottomRightRadius=" + this.thdy_2 + ", bottomLeftRadius=" + this.rtk_2 + "}";
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bss_2.class, "topLeftRadius;topRightRadius;bottomRightRadius;bottomLeftRadius", "ردل", "خوط", "ثضي", "رطك"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bss_2.class, "topLeftRadius;topRightRadius;bottomRightRadius;bottomLeftRadius", "ردل", "خوط", "ثضي", "رطك"}, this, object);
    }

    public float topLeftRadius() {
        return this.rdl;
    }

    public float topRightRadius() {
        return this.khwt_2;
    }

    public float bottomRightRadius() {
        return this.thdy_2;
    }

    public float bottomLeftRadius() {
        return this.rtk_2;
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

