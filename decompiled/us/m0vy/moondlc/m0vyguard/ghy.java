/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1309
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Random;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1309;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.brb;
import us.m0vy.moondlc.m0vyguard.tdhz_2;
import us.m0vy.moondlc.m0vyguard.tzth;
import us.m0vy.moondlc.m0vyguard.shw_3;

public class ghy
extends tzth {
    private static final class_2960 dhks;
    private static final long ztn_2 = 1500L;
    private final long khqth = System.currentTimeMillis();
    private long dskh_2 = System.nanoTime();
    private float shzw_2;
    private class_1309 dhs_3;
    private static final int dtdh = 852820163;
    private static final int rzn = -1051244281;
    private static final int aowdt5oj = -54056838;
    private static final int xir0ffujle9q = 877181654;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int s6ifjd0l84wir;

    @Override
    public void ththd() {
        class_1309 class_13092 = this.dhagh_2();
        if (class_13092 != this.dhs_3) {
            this.dhs_3 = class_13092;
            this.shzw_2 = 0.0f;
            this.dskh_2 = System.nanoTime();
        }
    }

    @Override
    public void ht_2(shw_3 shw2) {
        class_1309 class_13092 = this.dhagh_2();
        float f = this.ghsht();
        if (class_13092 == null || f <= 0.01f || !this.ssn_3()) {
            return;
        }
        tdhz_2 tdhz2_2 = tdhz_2.trb();
        class_4587 class_45872 = shw2.ssha_2();
        class_4184 class_41842 = ghy.mc.field_1773.method_19418();
        double d = ghy.shkdh() - class_41842.method_19326().field_1352;
        double d2 = ghy.ghtb_2() - class_41842.method_19326().field_1351;
        double d3 = ghy.qn() - class_41842.method_19326().field_1350;
        float f2 = class_13092.method_17682();
        double d4 = (float)System.currentTimeMillis() * tdhz2_2.tqs().thw_5() % 1500.0f;
        boolean bl = d4 > 750.0;
        float f3 = (float)(d4 / 750.0);
        f3 = bl ? (f3 -= 1.0f) : 1.0f - f3;
        f3 = f3 < 0.5f ? 2.0f * f3 * f3 : (float)(1.0 - Math.pow(-2.0f * f3 + 2.0f, 2.0) / 2.0);
        double d5 = f2 / 2.0f * (f3 > 0.5f ? 1.0f - f3 : f3) * (bl ? -1.0f : 1.0f);
        float f4 = class_13092.field_6235 == 0 ? 0.0f : ((float)class_13092.field_6235 - shw2.skz_4()) / 10.0f;
        long l = System.nanoTime();
        float f5 = (float)(l - this.dskh_2) / 2000000.0f;
        this.dskh_2 = l;
        this.shzw_2 += f4 * f5;
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)dhks);
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE, (GlStateManager.class_4535)GlStateManager.class_4535.ZERO, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        class_45872.method_22903();
        class_45872.method_22904(d, d2 + (double)(f2 * f3) + d5, d3);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        int n = (int)tdhz2_2.rsh_5().thw_5();
        int n2 = (int)tdhz2_2.zhk_3().thw_5();
        long l2 = (long)((float)(System.currentTimeMillis() - this.khqth) / (2.5f / Math.max(tdhz2_2.tqs().thw_5(), 0.1f)));
        int n3 = tdhz2_2.zbgh_2().getRGB();
        int n4 = tdhz2_2.hshl().getRGB();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n2; ++j) {
                class_45872.method_22903();
                float f6 = (float)j / (float)Math.max(1, n2 - 1);
                float f7 = this.dhsht(shw2.skz_4());
                float f8 = (0.5f * (1.0f - f6) + 0.5f * f6) * f * tdhz2_2.zal().thw_5();
                float f9 = 0.2f * ((float)l2 + this.shzw_2 - (float)j * 3.5f) / 15.0f;
                float f10 = f6 < 0.5f ? f6 * 2.0f : (1.0f - f6) * 2.0f;
                double d6 = Math.sin((double)f10 * Math.PI) * (double)tdhz2_2.dtth_2().thw_5() * (double)f7;
                Random random = new Random((long)j * 12345L);
                double d7 = (random.nextDouble() - 0.5) * d6;
                double d8 = (random.nextDouble() - 0.5) * d6;
                double d9 = (random.nextDouble() - 0.5) * d6;
                double d10 = d7 * (double)f - d7;
                double d11 = d8 * (double)f - d8;
                double d12 = d9 * (double)f - d9;
                double d13 = tdhz2_2.tdhr().thw_5() * f7;
                switch (i) {
                    case 0: {
                        class_45872.method_22904(Math.cos(f9) * d13 + d10, d11, Math.sin(f9) * d13 + d12);
                        break;
                    }
                    case 1: {
                        class_45872.method_22904(-Math.sin(f9) * d13 + d10, d11, Math.cos(f9) * d13 + d12);
                        break;
                    }
                    case 2: {
                        class_45872.method_22904(-Math.cos(f9) * d13 + d10, d11, -Math.sin(f9) * d13 + d12);
                        break;
                    }
                    case 3: {
                        class_45872.method_22904(Math.sin(f9) * d13 + d10, d11, -Math.cos(f9) * d13 + d12);
                    }
                }
                float f11 = f8 * 0.5f * f7;
                int n5 = brb.rgh(n3, n4, ((float)i + f6) / (float)Math.max(1, n));
                int n6 = this.thra_2(n5, class_3532.method_15363((float)(f * 1.55f), (float)0.0f, (float)1.0f));
                class_45872.method_22907(class_41842.method_23767());
                Matrix4f matrix4f = class_45872.method_23760().method_23761();
                class_2872.method_22918(matrix4f, -f11, -f11, 0.0f).method_22913(1.0f, 1.0f).method_39415(n6);
                class_2872.method_22918(matrix4f, f11, -f11, 0.0f).method_22913(0.0f, 1.0f).method_39415(n6);
                class_2872.method_22918(matrix4f, f11, f11, 0.0f).method_22913(0.0f, 0.0f).method_39415(n6);
                class_2872.method_22918(matrix4f, -f11, f11, 0.0f).method_22913(1.0f, 0.0f).method_39415(n6);
                class_45872.method_22909();
            }
        }
        class_286.method_43433((class_9801)class_2872.method_60800());
        class_45872.method_22909();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.disableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA);
        RenderSystem.enableCull();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private int thra_2(int n, float f) {
        int n2 = 368323079;
        n2 = Integer.rotateLeft(n2 * -1515354503, 10) ^ 0x63B1F189;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 14);
        int n3 = n2 ^ 0x289BC72;
        if ((n3 ^ n2) != 42581106) {
            int cfr_ignored_0 = (0x177D9675 ^ n2) - -1502884859;
        }
        int n4 = class_3532.method_15340((int)Math.round(f * Float.intBitsToFloat(-73695208 + 1206091752)), (int)0, (int)(-1250298660 - -1250298915));
        return n4 << 683443539 - 683443515 | n & (Integer.reverse(1813212538) ^ 0x5E4937C9);
    }

    private static String[] dnn(String string) {
        int n = -2101901778;
        int n2 = (n = Integer.rotateLeft(n * 1320260967, 17) ^ 0x68162FCE) ^ 0x1EBBF6A5;
        if ((n2 ^ n) != 515634853) {
            int cfr_ignored_0 = (0x9C0C708B ^ n) - 862896853;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite hsn_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 649863251;
            n3 = Integer.rotateLeft(n3 * -87117009, 20) ^ 0x89E9142C;
            String string3 = string2;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 17);
            int n4 = n3 ^ 0xB3FCA718;
            if ((n4 ^ n3) != -1275287784) {
                int cfr_ignored_0 = (0x9540874B ^ n3) + -2084438134;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dtdh ^ string.hashCode()) + (n2 + rzn) + i ^ dtdh, 9) + rzn);
            }
            String[] stringArray = ghy.dnn(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] pyqtw695wuvf8i(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite fu1kt02yk(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ aowdt5oj ^ string.hashCode() ^ n2 + xir0ffujle9q + i * -943477619) + aowdt5oj) ^ xir0ffujle9q));
            }
            String[] stringArray = ghy.pyqtw695wuvf8i(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

