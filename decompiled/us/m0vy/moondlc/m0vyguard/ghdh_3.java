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
import us.m0vy.moondlc.m0vyguard.bkha_2;
import us.m0vy.moondlc.m0vyguard.bdht;
import us.m0vy.moondlc.m0vyguard.bgha;
import us.m0vy.moondlc.m0vyguard.bhj_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tbh;
import us.m0vy.moondlc.m0vyguard.tthn;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.trd;
import us.m0vy.moondlc.m0vyguard.sgh;
import us.m0vy.moondlc.m0vyguard.zth_8;
import us.m0vy.moondlc.m0vyguard.fh;
import us.movy.moondlc.Moondlc;
import us.movy.moondlc.mixin.accessors.DrawContextAccessor;

public class ghdh_3
extends class_332
implements tthy {
    private final class_332 htd;
    private static final int j0448guqdz = -2016303036;
    private static final int wdtpsziwsv2q8 = -1630861040;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kkgr4p09cioe;

    protected ghdh_3(class_332 class_3322) {
        super(class_310.method_1551(), ((DrawContextAccessor)class_3322).getVertexConsumers());
        this.htd = class_3322;
    }

    public static ghdh_3 of(class_332 class_3322) {
        return new ghdh_3(class_3322);
    }

    public class_4587 getContext() {
        return this.method_51448();
    }

    public class_332 getOriginalContext() {
        return this.htd;
    }

    public class_4597 getVertexConsumerProvider() {
        block0: {
            int n = -1017013456;
            n = Integer.rotateLeft(n * -1189215221, 27) ^ 0xE1256F78;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x4A65C882;
            if ((n2 ^ n) == 1248184450) break block0;
            int cfr_ignored_0 = (0x890453B2 ^ n) + 262481008;
        }
        return ((DrawContextAccessor)((Object)this)).getVertexConsumers();
    }

    public void drawClientRect(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = sgh.dhsn_2();
        if (sgh.dfs()) {
            this.drawBlurredRect(f, f2, f3, f4, 45.0f, f7, zth_8.all(f8), byq.brz_2.tkhl_2(255.0f * f5 * sgh.tqa()));
        }
        if (sgh.drgh()) {
            this.drawLiquidGlass(f, f2, f3, f4, f7, Math.max(0.0f, sgh.aat() - sgh.aat() * 0.85f * f6), zth_8.all(f8), byq.brz_2.tkhl_2(255.0f * f5 * sgh.swk_2()));
        }
        boolean bl = Moondlc.getInstance().getThemeManager().zskh_2() == tthn.jthj;
        float f9 = sgh.zha() / 100.0f;
        float f10 = bl ? 0.8f - (0.8f - f9) * sgh.swk_2() : 0.7f;
        this.drawSquircle(f, f2, f3, f4, f7, zth_8.all(f8), bhj_2.khhy_2().tkhl_2(255.0f * f10 * f5));
    }

    public void pushMatrix() {
        int n = -1750441119;
        n = Integer.rotateLeft(n * 1284379593, 12) ^ 0x64B1C0BB;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 15);
        int n2 = n ^ 0xCFBCA33F;
        if ((n2 ^ n) != -809721025) {
            int cfr_ignored_0 = (0x5816C05E ^ n) - -48031472;
        }
        this.method_51448().method_22903();
    }

    public void popMatrix() {
        int n = 378848053;
        int n2 = (n = Integer.rotateLeft(n * 818499343, 10) ^ 0xBF8E039C) ^ 0xC896312;
        if ((n2 ^ n) != 210330386) {
            int cfr_ignored_0 = (0x1A1DA027 ^ n) + -1778974560;
        }
        ghdh_3.jmbwxl5m(ghdh_3.v7cu6s9e1(this));
    }

    public void drawRect(float f, float f2, float f3, float f4, byq byq2) {
        bdht.tqkh(this.method_51448(), f, f2, f3, f4, byq2);
    }

    public void drawLine(class_241 class_2412, class_241 class_2413, byq byq2) {
        bdht.jdr_2(this.method_51448(), class_2412, class_2413, byq2);
    }

    public void drawBezier(class_241 class_2412, class_241 class_2413, class_241 class_2414, class_241 class_2415, byq byq2, int n) {
        bdht.zfz(this.method_51448(), class_2412, class_2413, class_2414, class_2415, byq2, n);
    }

    public void drawSquircle(float f, float f2, float f3, float f4, float f5, zth_8 zth2, byq byq2) {
        bdht.tzs_5(this.method_51448(), f, f2, f3, f4, f5, zth2, byq2);
    }

    public void drawRoundedRect(float f, float f2, float f3, float f4, zth_8 zth2, byq byq2) {
        bdht.sqr_2(this.method_51448(), f, f2, f3, f4, zth2, byq2);
    }

    public void drawRoundedRect(float f, float f2, float f3, float f4, zth_8 zth2, bkha_2 bkha2) {
        bdht.sbd_3(this.method_51448(), f, f2, f3, f4, zth2, bkha2);
    }

    public void drawLiquidGlass(float f, float f2, float f3, float f4, float f5, float f6, zth_8 zth2, byq byq2) {
        zth2 = new zth_8(zth2.topLeftRadius() * f5 / 2.0f, zth2.topRightRadius() * f5 / 2.0f, zth2.bottomLeftRadius() * f5 / 2.0f, zth2.bottomRightRadius() * f5 / 2.0f);
        float f7 = Math.abs(f6 - 0.08f) < 1.0E-4f ? sgh.aat() : f6;
        bdht.zkb_2(this.method_51448(), f - 5.0f * sgh.tqa(), f2 - 5.0f * sgh.tqa(), f3 + 10.0f * sgh.tqa(), f4 + 10.0f * sgh.tqa(), zth2, byq2, byq2.tzdh_2() / 255.0f * sgh.swk_2(), (sgh.dthsh() + (f4 == 240.0f ? 2.0f : 1.0f)) * sgh.swk_2(), byq2.tkhl_2(255.0f), 1.0f, true, 0.0f, f7 * sgh.swk_2(), f5, false);
    }

    public void drawLiquidGlass(float f, float f2, float f3, float f4, float f5, zth_8 zth2, byq byq2, boolean bl) {
        zth2 = new zth_8(zth2.topLeftRadius() * f5 / 2.0f, zth2.topRightRadius() * f5 / 2.0f, zth2.bottomLeftRadius() * f5 / 2.0f, zth2.bottomRightRadius() * f5 / 2.0f);
        bdht.zkb_2(this.method_51448(), f, f2, f3, f4, zth2, byq2, byq2.tzdh_2() / 255.0f, sgh.dthsh() + (f4 == 240.0f ? 2.0f : 1.0f), byq2.tkhl_2(255.0f), 1.0f, true, 0.0f, sgh.aat(), f5, bl);
    }

    public void drawLoadingRect(float f, float f2, float f3, float f4, float f5, zth_8 zth2, byq byq2) {
        bdht.rsh_4(this.method_51448(), f, f2, f3, f4, f5, zth2, byq2);
    }

    public void drawRoundedBorder(float f, float f2, float f3, float f4, float f5, zth_8 zth2, byq byq2) {
        bdht.khshy(this.method_51448(), f, f2, f3, f4, f5, zth2, byq2);
    }

    public void drawTexture(class_2960 class_29602, fh fh2) {
        this.drawTexture(class_29602, fh2, byq.brz_2);
    }

    public void drawTexture(class_2960 class_29602, fh fh2, byq byq2) {
        bdht.dhmq(this.method_51448(), class_29602, fh2.khdb_2(), fh2.sw(), fh2.shfz(), fh2.khll(), byq2);
    }

    public void drawTexture(class_2960 class_29602, float f, float f2, float f3, float f4) {
        bdht.dhmq(this.method_51448(), class_29602, f, f2, f3, f4, byq.brz_2);
    }

    public void drawTexture(class_2960 class_29602, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, byq byq2) {
        bdht.bsr_2(this.method_51448(), class_29602, f, f2, f3, f4, f5, f6, f7, f8, byq2);
    }

    public void drawTexture(class_2960 class_29602, float f, float f2, float f3, float f4, byq byq2) {
        bdht.dhmq(this.method_51448(), class_29602, f, f2, f3, f4, byq2);
    }

    public void drawSprite(bgha bgha2, float f, float f2, float f3, float f4, byq byq2) {
        bdht.zkhs_3(this.method_51448(), bgha2, f, f2, f3, f4, byq2);
    }

    public void drawRoundedTexture(class_2960 class_29602, float f, float f2, float f3, float f4, zth_8 zth2) {
        bdht.khzs(this.method_51448(), class_29602, f, f2, f3, f4, zth2);
    }

    public void drawRoundedTexture(class_2960 class_29602, float f, float f2, float f3, float f4, zth_8 zth2, byq byq2) {
        bdht.ryth(this.method_51448(), class_29602, f, f2, f3, f4, zth2, byq2);
    }

    public void drawSquircleTexture(class_2960 class_29602, float f, float f2, float f3, float f4, float f5, zth_8 zth2, byq byq2) {
        bdht.qy(this.method_51448(), class_29602, f, f2, f3, f4, f5, zth2, byq2);
    }

    public void drawShadow(float f, float f2, float f3, float f4, float f5, zth_8 zth2, byq byq2) {
        bdht.jfgh(this.method_51448(), f, f2, f3, f4, f5, zth2, byq2);
    }

    public void drawBlurredRect(float f, float f2, float f3, float f4, float f5, zth_8 zth2, byq byq2) {
        bdht.bjth(this.method_51448(), f, f2, f3, f4, f5, zth2, byq2);
    }

    public void drawBlurredRect(float f, float f2, float f3, float f4, float f5, float f6, zth_8 zth2, byq byq2) {
        bdht.zfy(this.method_51448(), f, f2, f3, f4, f5, f6, zth2, byq2);
    }

    public void drawText(trd trd2, String string, float f, float f2, byq byq2) {
        tbh.thal_2(trd2.dma(), string, trd2.ghtz_4(), byq2.rk(), this.method_51448().method_23760().method_23761(), f, f2, 0.0f);
    }

    public void drawText(trd trd2, class_2561 class_25612, float f, float f2) {
        tbh.dhtgh(trd2.dma(), class_25612, trd2.ghtz_4(), this.method_51448().method_23760().method_23761(), f, f2, 0.0f);
    }

    public void drawFadeoutText(trd trd2, String string, float f, float f2, byq byq2, float f3, float f4) {
        tbh.tghd(trd2.dma(), string, trd2.ghtz_4(), byq2.rk(), this.method_51448().method_23760().method_23761(), f, f2, 0.0f, true, f3, f4);
    }

    public void drawFadeoutText(trd trd2, String string, float f, float f2, byq byq2, float f3, float f4, float f5) {
        tbh.an(trd2.dma(), string, trd2.ghtz_4(), byq2.rk(), this.method_51448().method_23760().method_23761(), f, f2, 0.0f, true, f3, f4, f5);
    }

    public void drawCenteredText(trd trd2, String string, float f, float f2, byq byq2) {
        this.drawText(trd2, string, f - trd2.dma().dzh_3(string, trd2.ghtz_4()) / 2.0f, f2, byq2);
    }

    public void drawRightText(trd trd2, String string, float f, float f2, byq byq2) {
        this.drawText(trd2, string, f - trd2.dma().dzh_3(string, trd2.ghtz_4()), f2, byq2);
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

    public void drawHead(class_742 class_7423, float f, float f2, float f3, zth_8 zth2, byq byq2) {
        bdht.htb(this.method_51448(), class_7423, f, f2, f3, zth2, byq2);
    }

    public void drawHead(class_1309 class_13092, float f, float f2, float f3, zth_8 zth2, byq byq2) {
        bdht.zshk(this.method_51448(), class_13092, f, f2, f3, zth2, byq2);
    }

    public void drawBatchItem(class_1799 class_17992, int n, int n2) {
        this.drawBatchItem((class_1309)ghdh_3.mc.field_1724, (class_1937)ghdh_3.mc.field_1687, class_17992, n, n2, 0);
    }

    private void drawBatchItem(@Nullable class_1309 class_13092, @Nullable class_1937 class_19372, class_1799 class_17992, int n, int n2, int n3) {
        this.drawBatchItem(class_13092, class_19372, class_17992, n, n2, n3, 0);
    }

    private void drawBatchItem(@Nullable class_1309 class_13092, @Nullable class_1937 class_19372, class_1799 class_17992, int n, int n2, int n3, int n4) {
        class_4587 class_45872 = this.method_51448();
        class_10444 class_104442 = ((DrawContextAccessor)this.htd).getItemRenderState();
        class_4597.class_4598 class_45982 = ((DrawContextAccessor)this.htd).getVertexConsumers();
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
                class_128 class_1283 = class_128.method_560((Throwable)throwable, (String)"Rendering item");
                class_129 class_1292 = class_1283.method_562("Item being rendered");
                class_1292.method_577("Item Type", () -> ghdh_3.lambda$drawBatchItem$0(class_17992));
                class_1292.method_577("Item Components", () -> ghdh_3.lambda$drawBatchItem$1(class_17992));
                class_1292.method_577("Item Foil", () -> ghdh_3.lambda$drawBatchItem$2(class_17992));
                throw new class_148(class_1283);
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

    private static class_4587 v7cu6s9e1(ghdh_3 ghdh2) {
        return ghdh2.method_51448();
    }

    private static void jmbwxl5m(class_4587 class_45872) {
        class_45872.method_22909();
    }

    private static String[] hxogjc5yak08(String string) {
        return string.split("\u0003\u001c", -1);
    }

    private static CallSite c9cuvq9s(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ j0448guqdz ^ string.hashCode() ^ n2 + wdtpsziwsv2q8 ^ i * -1775974761 ^ j0448guqdz, 8) ^ wdtpsziwsv2q8));
            }
            String[] stringArray = ghdh_3.hxogjc5yak08(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

