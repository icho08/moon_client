/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_2960
 *  net.minecraft.class_327
 *  net.minecraft.class_332
 *  net.minecraft.class_4597$class_4598
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Objects;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_4597;
import us.m0vy.moondlc.m0vyguard.bd;
import us.m0vy.moondlc.m0vyguard.bsw_2;
import us.m0vy.moondlc.m0vyguard.bkt;
import us.m0vy.moondlc.m0vyguard.tadh;
import us.m0vy.moondlc.m0vyguard.tdha;
import us.m0vy.moondlc.m0vyguard.jz_2;
import us.m0vy.moondlc.m0vyguard.hf;
import us.m0vy.moondlc.m0vyguard.wt_2;
import us.movy.moondlc.mixin.accessors.DrawContextAccessor;

public class bdhq
extends class_332
implements tdha {
    private final class_332 dhdj;
    private static final int yuhb7v97u = 244914406;
    private static final int vtv6fd3ifc = -1665125644;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int fxf08roy0d;

    public bdhq(class_4597.class_4598 class_45982) {
        super(mc, class_45982);
        this.dhdj = this;
    }

    public bdhq(class_332 class_3322) {
        super(mc, ((DrawContextAccessor)class_3322).getVertexConsumers());
        this.dhdj = class_3322;
    }

    public static bdhq of(class_332 class_3322) {
        return new bdhq(class_3322);
    }

    public void method_44379(int n, int n2, int n3, int n4) {
        if (this.dhdj != this && this.dhdj != null) {
            this.dhdj.method_44379(n, n2, n3, n4);
        } else {
            super.method_44379(n, n2, n3, n4);
        }
    }

    public void method_44380() {
        if (this.dhdj != this && this.dhdj != null) {
            this.dhdj.method_44380();
        } else {
            super.method_44380();
        }
    }

    public void drawText(bd bd2, String string, float f, float f2, bkt bkt2) {
        wt_2.sdhj_2(bd2.sjsh(), string, bd2.khjsh(), bkt2.btkh(), this.method_51448().method_23760().method_23761(), f, f2, 0.0f);
    }

    public void drawText(bd bd2, String string, float f, float f2, bsw_2 bsw2) {
        wt_2.zhh_4(bd2.sjsh(), string, bd2.khjsh(), bsw2, this.method_51448().method_23760().method_23761(), f, f2, 0.0f);
    }

    public void drawText(bd bd2, class_2561 class_25612, float f, float f2) {
        wt_2.tff(bd2.sjsh(), class_25612, bd2.khjsh(), this.method_51448().method_23760().method_23761(), f, f2, 0.0f);
    }

    public void drawText(bd bd2, class_2561 class_25612, float f, float f2, float f3) {
        wt_2.khth_2(bd2.sjsh(), class_25612, bd2.khjsh(), this.method_51448().method_23760().method_23761(), f, f2, 0.0f, (int)f3);
    }

    public void drawSquircle(float f, float f2, float f3, float f4, float f5, jz_2 jz2, bkt bkt2) {
        tadh.hkk(this.method_51448(), f, f2, f3, f4, f5, jz2, bkt2);
    }

    public void drawRoundedRect(float f, float f2, float f3, float f4, jz_2 jz2, bkt bkt2) {
        tadh.khdhh(this.method_51448(), f, f2, f3, f4, jz2, bkt2);
    }

    public void drawRoundedRect(float f, float f2, float f3, float f4, jz_2 jz2, bsw_2 bsw2) {
        tadh.sghkh_2(this.method_51448(), f, f2, f3, f4, jz2, bsw2);
    }

    public void drawRect(float f, float f2, float f3, float f4, bkt bkt2) {
        tadh.ddhk(this.method_51448(), f, f2, f3, f4, bkt2);
    }

    public int drawTextWithBackground(class_327 class_3272, class_2561 class_25612, int n, int n2, int n3, jz_2 jz2, bkt bkt2, bkt bkt3) {
        int n4 = n - 3;
        int n5 = n2 - 2;
        int n6 = n3 + 6;
        Objects.requireNonNull(class_3272);
        this.drawRoundedRect((float)n4, (float)n5, (float)n6, 13.0f, jz2, bkt3);
        return this.method_51439(class_3272, class_25612, n, n2, bkt2.btkh(), true);
    }

    public void drawSprite(hf hf2, float f, float f2, float f3, float f4, bkt bkt2) {
        tadh.zat_7(this.method_51448(), hf2, f, f2, f3, f4, bkt2);
    }

    public void drawRoundedCorner(float f, float f2, float f3, float f4, float f5, float f6, bkt bkt2, jz_2 jz2) {
        f3 = Math.round(f3);
        f4 = Math.round(f4);
        this.method_44379((int)Math.ceil(f - 10.0f), (int)(f2 - 10.0f), (int)(f + f6), (int)(f2 + f6));
        this.drawRoundedBorder(f, f2, f3, f4, f5, jz2, bkt2);
        this.method_44380();
        this.method_44379((int)(f + f3 - f6), (int)(f2 - 10.0f), (int)(f + f3 + 10.0f), (int)(f2 + f6));
        this.drawRoundedBorder(f, f2, f3, f4, f5, jz2, bkt2);
        this.method_44380();
        this.method_44379((int)(f - 10.0f), (int)(f2 + f4 - f6), (int)(f + f6), (int)(f2 + f4 + 10.0f));
        this.drawRoundedBorder(f, f2, f3, f4, f5, jz2, bkt2);
        this.method_44380();
        this.method_44379((int)(f + f3 - f6), (int)(f2 + f4 - f6), (int)(f + f3 + 10.0f), (int)(f2 + f4 + 10.0f));
        this.drawRoundedBorder(f, f2, f3, f4, f5, jz2, bkt2);
        this.method_44380();
    }

    public void drawRoundedBorder(float f, float f2, float f3, float f4, float f5, jz_2 jz2, bkt bkt2) {
        tadh.aad(this.method_51448(), f, f2, f3, f4, f5, jz2, bkt2);
    }

    public void drawTexture(class_2960 class_29602, float f, float f2, float f3, float f4, bkt bkt2) {
        tadh.slz(this.method_51448(), class_29602, f, f2, f3, f4, bkt2);
    }

    public void pushMatrix() {
        this.method_51448().method_22903();
    }

    public void popMatrix() {
        this.method_51448().method_22909();
    }

    private static String[] ube7tkxcp(String string) {
        return string.split("\u0005\u0014", -1);
    }

    private static CallSite x537znpdon6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ yuhb7v97u ^ string.hashCode() ^ n2 + vtv6fd3ifc ^ i * 1062844937 ^ yuhb7v97u, 11) ^ vtv6fd3ifc));
            }
            String[] stringArray = bdhq.ube7tkxcp(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

