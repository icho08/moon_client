/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_10444
 *  net.minecraft.class_128
 *  net.minecraft.class_129
 *  net.minecraft.class_1309
 *  net.minecraft.class_148
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 *  net.minecraft.class_241
 *  net.minecraft.class_2561
 *  net.minecraft.class_2960
 *  net.minecraft.class_308
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_4597$class_4598
 *  net.minecraft.class_4608
 *  net.minecraft.class_742
 *  net.minecraft.class_811
 *  org.jetbrains.annotations.Nullable
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_10444;
import net.minecraft.class_128;
import net.minecraft.class_129;
import net.minecraft.class_1309;
import net.minecraft.class_148;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_241;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_308;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_742;
import net.minecraft.class_811;
import org.jetbrains.annotations.Nullable;
import us.m0vy.moondlc.m0vyguard.bdhj;
import us.m0vy.moondlc.m0vyguard.bdhn;
import us.m0vy.moondlc.m0vyguard.bss_2;
import us.m0vy.moondlc.m0vyguard.ttl;
import us.m0vy.moondlc.m0vyguard.tkhr;
import us.m0vy.moondlc.m0vyguard.khh;
import us.m0vy.moondlc.m0vyguard.dt_2;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.q;
import us.m0vy.moondlc.m0vyguard.qz_2;
import us.movy.moondlc.mixin.accessors.DrawContextAccessor;

public class bdhy
extends class_332
implements dl {
    private final class_332 rth;
    private static final int whtt406 = 1005740772;
    private static final int ptgl43x = -79900057;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int l07xgyxnv0;

    protected bdhy(class_332 class_3322) {
        super(class_310.method_1551(), ((DrawContextAccessor)class_3322).getVertexConsumers());
        this.rth = class_3322;
    }

    public static bdhy of(class_332 class_3322) {
        return new bdhy(class_3322);
    }

    public void drawClientRect(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        boolean bl = true;
        this.drawSquircle(f, f2, f3, f4, f7, bss_2.all(6.0f), ttl.das_6().khhh_3(178.5f));
    }

    public void pushMatrix() {
        this.method_51448().method_22903();
    }

    public void popMatrix() {
        this.method_51448().method_22909();
    }

    public void drawRect(float f, float f2, float f3, float f4, khh khh2) {
        tkhr.smt(this.method_51448(), f, f2, f3, f4, khh2);
    }

    public void drawLine(class_241 class_2412, class_241 class_2413, khh khh2) {
        tkhr.aws_2(this.method_51448(), class_2412, class_2413, khh2);
    }

    public void drawBezier(class_241 class_2412, class_241 class_2413, class_241 class_2414, class_241 class_2415, khh khh2, int n) {
        tkhr.ddhy_2(this.method_51448(), class_2412, class_2413, class_2414, class_2415, khh2, n);
    }

    public void drawSquircle(float f, float f2, float f3, float f4, float f5, bss_2 bss2, khh khh2) {
        tkhr.ghry(this.method_51448(), f, f2, f3, f4, f5, bss2, khh2);
    }

    public void drawRoundedRect(float f, float f2, float f3, float f4, bss_2 bss2, khh khh2) {
        tkhr.zrj_2(this.method_51448(), f, f2, f3, f4, bss2, khh2);
    }

    public void drawRoundedRect(float f, float f2, float f3, float f4, bss_2 bss2, qz_2 qz2_2) {
        tkhr.ghdy(this.method_51448(), f, f2, f3, f4, bss2, qz2_2);
    }

    public void drawLiquidGlass(float f, float f2, float f3, float f4, float f5, float f6, bss_2 bss2, khh khh2) {
        bss2 = new bss_2(bss2.topLeftRadius() * f5 / 2.0f, bss2.topRightRadius() * f5 / 2.0f, bss2.bottomLeftRadius() * f5 / 2.0f, bss2.bottomRightRadius() * f5 / 2.0f);
        tkhr.sshy(this.method_51448(), f - 5.0f, f2 - 5.0f, f3 + 10.0f, f4 + 10.0f, bss2, khh2, khh2.tas_3() / 255.0f, f4 == 240.0f ? 100 : 50, khh2.khhh_3(255.0f), 1.0f, true, 0.0f, f6, f5, false);
    }

    public void drawLiquidGlass(float f, float f2, float f3, float f4, float f5, bss_2 bss2, khh khh2, boolean bl) {
        bss2 = new bss_2(bss2.topLeftRadius() * f5 / 2.0f, bss2.topRightRadius() * f5 / 2.0f, bss2.bottomLeftRadius() * f5 / 2.0f, bss2.bottomRightRadius() * f5 / 2.0f);
        tkhr.sndh(this.method_51448(), f, f2, f3, f4, bss2, khh2, khh2.tas_3() / 255.0f, f4 == 240.0f ? 100.0f : 50.0f, khh2.khhh_3(255.0f), 1.0f, true, 0.0f, 0.08f, f5, bl);
    }

    public void drawLoadingRect(float f, float f2, float f3, float f4, float f5, bss_2 bss2, khh khh2) {
        tkhr.hzth(this.method_51448(), f, f2, f3, f4, f5, bss2, khh2);
    }

    public void drawRoundedBorder(float f, float f2, float f3, float f4, float f5, bss_2 bss2, khh khh2) {
        tkhr.dhqj(this.method_51448(), f, f2, f3, f4, f5, bss2, khh2);
    }

    public void drawTexture(class_2960 class_29602, q q2) {
        this.drawTexture(class_29602, q2, khh.dww);
    }

    public void drawTexture(class_2960 class_29602, q q2, khh khh2) {
        tkhr.rlgh(this.method_51448(), class_29602, q2.ghdhw(), q2.thkhh_2(), q2.thn(), q2.jdth(), khh2);
    }

    public void drawTexture(class_2960 class_29602, float f, float f2, float f3, float f4) {
        tkhr.rlgh(this.method_51448(), class_29602, f, f2, f3, f4, khh.dww);
    }

    public void drawTexture(class_2960 class_29602, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, khh khh2) {
        tkhr.sshd_3(this.method_51448(), class_29602, f, f2, f3, f4, f5, f6, f7, f8, khh2);
    }

    public void drawTexture(class_2960 class_29602, float f, float f2, float f3, float f4, khh khh2) {
        tkhr.rlgh(this.method_51448(), class_29602, f, f2, f3, f4, khh2);
    }

    public void drawSprite(bdhn bdhn2, float f, float f2, float f3, float f4, khh khh2) {
        tkhr.zt_3(this.method_51448(), bdhn2, f, f2, f3, f4, khh2);
    }

    public void drawRoundedTexture(class_2960 class_29602, float f, float f2, float f3, float f4, bss_2 bss2) {
        tkhr.skgh_2(this.method_51448(), class_29602, f, f2, f3, f4, bss2);
    }

    public void drawRoundedTexture(class_2960 class_29602, float f, float f2, float f3, float f4, bss_2 bss2, khh khh2) {
        tkhr.sshh_4(this.method_51448(), class_29602, f, f2, f3, f4, bss2, khh2);
    }

    public void drawShadow(float f, float f2, float f3, float f4, float f5, bss_2 bss2, khh khh2) {
        tkhr.tshj(this.method_51448(), f, f2, f3, f4, f5, bss2, khh2);
    }

    public void drawBlurredRect(float f, float f2, float f3, float f4, float f5, bss_2 bss2, khh khh2) {
        tkhr.shdhz_2(this.method_51448(), f, f2, f3, f4, f5, bss2, khh2);
    }

    public void drawBlurredRect(float f, float f2, float f3, float f4, float f5, float f6, bss_2 bss2, khh khh2) {
        tkhr.jam_2(this.method_51448(), f, f2, f3, f4, f5, f6, bss2, khh2);
    }

    public void drawText(bdhj bdhj2, String string, float f, float f2, khh khh2) {
        dt_2.sthq_2(bdhj2.ztdh(), string, bdhj2.thshf(), khh2.rlsh(), this.method_51448().method_23760().method_23761(), f, f2, 0.0f);
    }

    public void drawText(bdhj bdhj2, class_2561 class_25612, float f, float f2) {
        dt_2.dtw_2(bdhj2.ztdh(), class_25612, bdhj2.thshf(), this.method_51448().method_23760().method_23761(), f, f2, 0.0f);
    }

    public void drawFadeoutText(bdhj bdhj2, String string, float f, float f2, khh khh2, float f3, float f4) {
        dt_2.dhaz_2(bdhj2.ztdh(), string, bdhj2.thshf(), khh2.rlsh(), this.method_51448().method_23760().method_23761(), f, f2, 0.0f, true, f3, f4);
    }

    public void drawFadeoutText(bdhj bdhj2, String string, float f, float f2, khh khh2, float f3, float f4, float f5) {
        dt_2.swl(bdhj2.ztdh(), string, bdhj2.thshf(), khh2.rlsh(), this.method_51448().method_23760().method_23761(), f, f2, 0.0f, true, f3, f4, f5);
    }

    public void drawCenteredText(bdhj bdhj2, String string, float f, float f2, khh khh2) {
        this.drawText(bdhj2, string, f - bdhj2.ztdh().rjj(string, bdhj2.thshf()) / 2.0f, f2, khh2);
    }

    public void drawRightText(bdhj bdhj2, String string, float f, float f2, khh khh2) {
        this.drawText(bdhj2, string, f - bdhj2.ztdh().rjj(string, bdhj2.thshf()), f2, khh2);
    }

    public void drawItem(class_1792 class_17922, float f, float f2, float f3) {
        this.drawItem(class_17922.method_7854(), f, f2, f3);
    }

    public void drawItem(class_1799 class_17992, float f, float f2, float f3) {
        this.method_51448().method_22903();
        this.method_51448().method_46416(f, f2, 0.0f);
        this.method_51448().method_22905(f3, f3, f3);
        class_308.method_24210();
        this.method_51427(class_17992, 0, 0);
        class_308.method_24210();
        this.method_51448().method_22909();
    }

    public void drawHead(class_742 class_7422, float f, float f2, float f3, bss_2 bss2, khh khh2) {
        tkhr.brw(this.method_51448(), class_7422, f, f2, f3, bss2, khh2);
    }

    public void drawHead(class_1309 class_13092, float f, float f2, float f3, bss_2 bss2, khh khh2) {
        tkhr.hath_2(this.method_51448(), class_13092, f, f2, f3, bss2, khh2);
    }

    public void drawBatchItem(class_1799 class_17992, int n, int n2) {
        this.drawBatchItem((class_1309)bdhy.mc.field_1724, (class_1937)bdhy.mc.field_1687, class_17992, n, n2, 0);
    }

    private void drawBatchItem(@Nullable class_1309 class_13092, @Nullable class_1937 class_19372, class_1799 class_17992, int n, int n2, int n3) {
        this.drawBatchItem(class_13092, class_19372, class_17992, n, n2, n3, 0);
    }

    private void drawBatchItem(@Nullable class_1309 class_13092, @Nullable class_1937 class_19372, class_1799 class_17992, int n, int n2, int n3, int n4) {
        class_4587 class_45872 = this.method_51448();
        class_10444 class_104442 = ((DrawContextAccessor)this.rth).getItemRenderState();
        class_4597.class_4598 class_45982 = ((DrawContextAccessor)this.rth).getVertexConsumers();
        if (!class_17992.method_7960()) {
            mc.method_65386().method_65598(class_104442, class_17992, class_811.field_4317, false, class_19372, class_13092, n3);
            class_45872.method_22903();
            class_45872.method_46416((float)(n + 8), (float)(n2 + 8), (float)(150 + (class_104442.method_65607() ? n4 : 0)));
            try {
                boolean bl;
                class_45872.method_22905(16.0f, -16.0f, 16.0f);
                boolean bl2 = bl = !class_104442.method_65608();
                if (bl) {
                    class_308.method_24210();
                }
                class_104442.method_65604(class_45872, (class_4597)class_45982, 0xF000F0, class_4608.field_21444);
                if (bl) {
                    class_308.method_24211();
                }
            }
            catch (Throwable throwable) {
                class_128 class_1282 = class_128.method_560((Throwable)throwable, (String)"Rendering item");
                class_129 class_1292 = class_1282.method_562("Item being rendered");
                class_1292.method_577("Item Type", () -> bdhy.lambda$drawBatchItem$0(class_17992));
                class_1292.method_577("Item Components", () -> bdhy.lambda$drawBatchItem$1(class_17992));
                class_1292.method_577("Item Foil", () -> bdhy.lambda$drawBatchItem$2(class_17992));
                throw new class_148(class_1282);
            }
            class_45872.method_22909();
        }
    }

    private static String lambda$drawBatchItem$2(class_1799 class_17992) throws Exception {
        return String.valueOf(class_17992.method_7958());
    }

    private static String lambda$drawBatchItem$1(class_1799 class_17992) throws Exception {
        return String.valueOf(class_17992.method_57353());
    }

    private static String lambda$drawBatchItem$0(class_1799 class_17992) throws Exception {
        return String.valueOf(class_17992.method_7909());
    }

    private static String[] lfcvesp1pryrk(String string) {
        return string.split("\u0003\u0014", -1);
    }

    private static CallSite sqj9vzubff(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ whtt406 ^ string.hashCode() ^ n2 + ptgl43x ^ i * -357052113 ^ whtt406, 10) ^ ptgl43x));
            }
            String[] stringArray = bdhy.lfcvesp1pryrk(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
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

