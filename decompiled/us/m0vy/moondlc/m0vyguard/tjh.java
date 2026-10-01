/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_4587
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bbk;
import us.m0vy.moondlc.m0vyguard.bdhq;
import us.m0vy.moondlc.m0vyguard.bza;
import us.m0vy.moondlc.m0vyguard.ban_2;
import us.m0vy.moondlc.m0vyguard.bkt;
import us.m0vy.moondlc.m0vyguard.tadh;
import us.m0vy.moondlc.m0vyguard.thz;
import us.m0vy.moondlc.m0vyguard.jz_2;
import us.m0vy.moondlc.m0vyguard.tt_3;
import us.m0vy.moondlc.m0vyguard.wt_2;

public class tjh {
    private static final class_310 mc;
    private static final long zlq;
    private static final int m7h0b1sx41 = 1978500615;
    private static final int vavyyhv = -224129513;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int tuiinfrsnmmv9;

    public void dba(class_332 class_3322, float f, float f2, float f3) {
        float f4;
        bdhq bdhq2 = bdhq.of(class_3322);
        thz thz2 = bza.getInstance().getThemeManager().bzm();
        ban_2 ban2 = bza.getInstance().getDiscordManager();
        class_2960 class_29602 = ban2 != null ? ban2.thwl() : null;
        String string = mc.method_1548().method_1676();
        float f5 = 10.2f;
        float f6 = f2 - 15.0f;
        if (class_29602 != null) {
            f4 = f5 + 6.0f;
            int n = (int)(f3 * 255.0f);
            int n2 = n << 24 | 0xFFFFFF;
            tt_3.tyz(class_3322, class_29602, f - 4.1f, f6, f4, f4 / 2.0f, 0, 128, 128, -1, n2);
        } else {
            bdhq2.drawText(bbk.jqy.rdhz(12.0f), "", f + 2.5f, f6 + 2.5f, thz2.bzy().zdhgh_2(f3 * 255.0f));
        }
        f4 = 49.0f;
        wt_2.rah_4(bbk.rqdh.rdhz(8.0f).sjsh(), string, 8.0f, thz2.bzy().zdhgh_2(f3 * 255.0f).btkh(), class_3322.method_51448().method_23760().method_23761(), f + 15.5f, f6 + 2.25f, 0.0f, true, 0.7f, 1.0f, f4);
        String string2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM")) + "  " + tjh.dtgh();
        wt_2.rah_4(bbk.rqdh.rdhz(6.0f).sjsh(), string2, 6.0f, new bkt(155, 155, 155, f3 * 255.0f).btkh(), class_3322.method_51448().method_23760().method_23761(), f + 15.5f, f6 + 10.5f, 0.0f, true, 0.05f, 0.85f, f4);
    }

    private static String dtgh() {
        long l = Math.max(0L, (System.currentTimeMillis() - zlq) / 1000L);
        long l2 = l / 3600L;
        long l3 = l % 3600L / 60L;
        if (l2 > 0L) {
            return l2 + "h " + l3 + "m";
        }
        return l3 + "m";
    }

    private void dtm_4(class_332 class_3322, class_2960 class_29602, float f, float f2, float f3, float f4, int n, int n2, int n3, int n4) {
        class_4587 class_45872 = class_3322.method_51448();
        bdhq bdhq2 = bdhq.of(class_3322);
        if (class_29602 != null) {
            if (f4 > 0.0f) {
                tadh.khdhh(class_45872, f, f2, f3, f3, jz_2.all(f4), new bkt(0, 0, 0, 255));
            }
            class_45872.method_22903();
            class_45872.method_46416(f, f2, 0.0f);
            class_45872.method_22905(f3, f3, 1.0f);
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            this.thbz(class_45872, class_29602, 0, 0, 1.0f, 1.0f, n, n, n2, n2, n3, n3, n4);
            RenderSystem.disableBlend();
            class_45872.method_46416(-f, -f2, 0.0f);
            class_45872.method_22909();
        }
    }

    private void thbz(class_4587 class_45872, class_2960 class_29602, int n, int n2, float f, float f2, float f3, float f4, int n3, int n4, int n5, int n6, int n7) {
        this.khhy(class_45872, class_29602, n, (float)n + f, n2, (float)n2 + f2, 0.0f, n3, n4, f3, f4, n5, n6, n7);
    }

    private void khhy(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, float f5, int n, int n2, float f6, float f7, int n3, int n4, int n5) {
        this.bshf(class_45872, class_29602, f, f2, f3, f4, (f6 + 0.0f) / (float)n3, (f6 + (float)n) / (float)n3, (f7 + 0.0f) / (float)n4, (f7 + (float)n2) / (float)n4, n5);
    }

    private void bshf(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n) {
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_2872.method_22918(matrix4f, f, f3, 0.0f).method_22913(f5, f7).method_39415(n);
        class_2872.method_22918(matrix4f, f, f4, 0.0f).method_22913(f5, f8).method_39415(n);
        class_2872.method_22918(matrix4f, f2, f4, 0.0f).method_22913(f6, f8).method_39415(n);
        class_2872.method_22918(matrix4f, f2, f3, 0.0f).method_22913(f6, f7).method_39415(n);
        class_286.method_43433((class_9801)class_2872.method_60800());
    }

    private static String[] a5jk3vnfujhja(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ypsv0kquv(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ m7h0b1sx41 ^ string.hashCode() ^ n2 + vavyyhv + i * 1151772487) + m7h0b1sx41) ^ vavyyhv));
            }
            String[] stringArray = tjh.a5jk3vnfujhja(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

