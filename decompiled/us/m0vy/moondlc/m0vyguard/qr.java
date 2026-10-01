/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1291
 *  net.minecraft.class_1293
 *  net.minecraft.class_2561
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587
 *  net.minecraft.class_5321
 *  net.minecraft.class_6880
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_2561;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.bqt;
import us.m0vy.moondlc.m0vyguard.tbkh;
import us.m0vy.moondlc.m0vyguard.tdj;
import us.m0vy.moondlc.m0vyguard.ra_2;

public class qr
extends bqt {
    private static final float shshgh = 84.0f;
    private static final float bghf = 6.4f;
    private static final float zhth_2 = 11.5f;
    private final Map zta = new HashMap();
    private float shzz = -1.0f;
    private float thaj = -1.0f;
    private float jkhs_2 = 1.0f;
    private final ra_2 hjd = new ra_2("Emotka", List.of("Right", "Left"), "Right");
    private final ra_2 zyr = new ra_2("Sort By", List.of("Time", "Level", "Name"), "Time");
    private final tdj dft_2 = new tdj("Widget Size", 0.6f, 1.5f, 0.05f, this.khta_3().getScale(), "%.1f");
    private static final int fwxexgq = -1890974050;
    private static final int b2m9ujbo = -2093011387;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int nozghgdelmi2;

    public qr() {
        super(370.0f, 32.0f);
        this.dft_2.tyt_3(this::khthr);
        this.rght(this.hjd);
        this.rght(this.zyr);
        this.rght(this.dft_2);
    }

    @Override
    public String getName() {
        return "Moondlc Potions";
    }

    @Override
    public void lh(class_4587 class_45872) {
        if (qr.mc.field_1724 == null) {
            return;
        }
        float f = this.awd_2();
        List list = this.dsht_2(f);
        boolean bl = list.isEmpty() && !this.tthy();
        float f2 = this.bhh_3(!bl, f);
        if (bl && !this.tdha_2()) {
            return;
        }
        if (this.shzz < 0.0f) {
            this.shzz = 84.0f;
        }
        this.shzz = this.khhs_3(this.shzz, this.jagh_2(list), f, 12.0f);
        float f3 = this.zfj_2(this.shzz);
        float f4 = this.zfj_2(this.khta_3().getX());
        float f5 = this.zfj_2(this.khta_3().getY());
        float f6 = 0.0f;
        for (class_1293 class_12932 : list) {
            f6 += 11.5f * this.zta.getOrDefault(class_12932.method_5586(), Float.valueOf(0.0f)).floatValue();
        }
        float f7 = 17.0f + f6 + 10.0f - 3.0f;
        if (this.thaj < 0.0f) {
            this.thaj = f7;
        }
        this.thaj = this.khhs_3(this.thaj, f7, f, 24.0f);
        class_45872.method_22903();
        float f8 = f2;
        class_45872.method_46416(f4 + f3 / 2.0f, f5 + this.thaj / 2.0f, 0.0f);
        class_45872.method_22905(f8, f8, 1.0f);
        class_45872.method_46416(-(f4 + f3 / 2.0f), -(f5 + this.thaj / 2.0f), 0.0f);
        tbkh.sqy(class_45872, f4, f5, f3, this.thaj, f2);
        tbkh.tzy_2(class_45872, f4, f5, f3, 16.0f, tbkh.sty, 0.35f, f2);
        tbkh.sshth_2(class_45872, f4 + 1.0f, f5 + 16.0f, f3 - 2.0f, f2);
        this.jkhs_2 = this.khhs_3(this.jkhs_2, this.hjd.thnth("Right") ? 1.0f : 0.0f, f, 12.0f);
        tbkh.dmkh_2(class_45872, f4, f5, f3, "PotionsList", "P", brz_2.tsf, f2, this.jkhs_2);
        float f9 = 0.0f;
        for (class_1293 class_12933 : list) {
            float f10 = this.zta.getOrDefault(class_12933.method_5586(), Float.valueOf(0.0f)).floatValue() * f2;
            if (f10 < 0.05f) continue;
            float f11 = f5 + 19.6f + f9;
            float f12 = 8.0f;
            float f13 = f4 + 6.0f;
            float f14 = f11 + (11.5f - f12) / 2.0f - 0.5f;
            String string = class_12933.method_5579().method_40230().map(qr::tsth_2).orElse("");
            if (!string.isEmpty()) {
                class_2960 class_29602 = class_2960.method_60655((String)"minecraft", (String)("textures/mob_effect/" + string + ".png"));
                this.daz_2(class_45872, class_29602, f13, f14, f12, f12, new Color(255, 255, 255, Math.round(255.0f * f10)));
            }
            float f15 = f13 + f12 + 3.5f;
            String string2 = class_12933.method_48559() ? "**:**" : this.btq(class_12933.method_5584());
            float f16 = this.ghgh().shdf_2(string2, 6.4f);
            float f17 = f4 + f3 - 6.0f - f16;
            float f18 = f17 - f15 - 4.0f;
            String string3 = this.jzt_2(this.ghgh(), this.shtt_2(class_12933), 6.4f, f18);
            this.ghgh().zskh_4(class_45872, string3, f15, f11 + 5.75f - 3.8400002f, 6.4f, tbkh.hkdh(f10), 0.0f);
            this.ghgh().zskh_4(class_45872, string2, f17, f11 + 5.75f - 3.8400002f, 6.4f, tbkh.djd_3(f10), 0.0f);
            f9 += 11.5f * this.zta.getOrDefault(class_12933.method_5586(), Float.valueOf(0.0f)).floatValue();
        }
        class_45872.method_22909();
        this.khta_3().setWidth(f3);
        this.khta_3().setHeight(this.thaj);
    }

    private void daz_2(class_4587 class_45872, class_2960 class_29602, float f, float f2, float f3, float f4, Color color) {
        if (class_29602 == null) {
            return;
        }
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.setShaderTexture((int)0, (class_2960)class_29602);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        int n = color.getRGB();
        class_2872.method_22918(matrix4f, f, f2, 0.0f).method_22913(0.0f, 0.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f, f2 + f4, 0.0f).method_22913(0.0f, 1.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f + f3, f2 + f4, 0.0f).method_22913(1.0f, 1.0f).method_39415(n);
        class_2872.method_22918(matrix4f, f + f3, f2, 0.0f).method_22913(1.0f, 0.0f).method_39415(n);
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.disableBlend();
    }

    private List dsht_2(float f) {
        ArrayList arrayList = new ArrayList(qr.mc.field_1724.method_6088().values());
        for (class_1293 object : arrayList) {
            String string = object.method_5586();
            this.zta.put(string, Float.valueOf(this.khhs_3(this.zta.getOrDefault(string, Float.valueOf(0.0f)).floatValue(), 1.0f, f, 18.0f)));
        }
        this.zta.entrySet().removeIf(arg_0 -> this.sths_2(arrayList, f, arg_0));
        for (Map.Entry entry : new ArrayList(this.zta.entrySet())) {
            boolean bl = arrayList.stream().anyMatch(arg_0 -> qr.dhtha_2(entry, arg_0));
            if (bl) continue;
            this.zta.put((String)entry.getKey(), Float.valueOf(this.khhs_3(((Float)entry.getValue()).floatValue(), 0.0f, f, 10.0f)));
        }
        if (this.zyr.thnth("Level")) {
            arrayList.sort(qr::shdhq);
        } else if (this.zyr.thnth("Name")) {
            arrayList.sort(Comparator.comparing(this::shtt_2, String.CASE_INSENSITIVE_ORDER));
        } else {
            arrayList.sort(Comparator.comparingInt(class_1293::method_5584));
        }
        return arrayList;
    }

    private float jagh_2(List list) {
        float f = Math.max(84.0f, tbkh.rmh_2("PotionsList", "P"));
        for (class_1293 class_12932 : list) {
            String string = class_12932.method_48559() ? "**:**" : this.btq(class_12932.method_5584());
            float f2 = 17.5f + this.ghgh().shdf_2(this.shtt_2(class_12932), 6.4f) + 7.0f + this.ghgh().shdf_2(string, 6.4f) + 6.0f;
            f = Math.max(f, f2);
        }
        return Math.min(f, this.stj());
    }

    private String shtt_2(class_1293 class_12932) {
        class_6880 class_68802 = class_12932.method_5579();
        String string = class_2561.method_43471((String)((class_1291)class_68802.comp_349()).method_5567()).getString();
        int n = class_12932.method_5578();
        if (n <= 0) {
            return string;
        }
        return string + " " + (n + 1);
    }

    @Override
    protected String btq(int n) {
        int n2 = n / 20;
        int n3 = n2 / 60;
        int n4 = n2 % 60;
        return String.format("%d:%02d", n3, n4);
    }

    private float stj() {
        if (mc.method_22683() == null) {
            return 180.0f;
        }
        return Math.max(84.0f, (float)mc.method_22683().method_4486() - this.khta_3().getX() - 8.0f);
    }

    private static int shdhq(class_1293 class_12932, class_1293 class_12933) {
        return Integer.compare(class_12933.method_5578(), class_12932.method_5578());
    }

    private static boolean dhtha_2(Map.Entry entry, class_1293 class_12932) {
        return class_12932.method_5586().equals(entry.getKey());
    }

    private boolean sths_2(List list, float f, Map.Entry entry) {
        return list.stream().noneMatch(arg_0 -> qr.shmh(entry, arg_0)) && this.khhs_3(((Float)entry.getValue()).floatValue(), 0.0f, f, 10.0f) < 0.02f;
    }

    private static boolean shmh(Map.Entry entry, class_1293 class_12932) {
        return class_12932.method_5586().equals(entry.getKey());
    }

    private static String tsth_2(class_5321 class_53212) {
        return class_53212.method_29177().method_12832();
    }

    private void khthr(Float f) {
        this.khta_3().setScale(f.floatValue());
        bzz.zhs_7().asd();
    }

    private static String[] e3jb7ta78muayi(String string) {
        return string.split("\b\u001f", -1);
    }

    private static CallSite u92cyc27pn8(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ fwxexgq ^ string.hashCode()) + (n2 + b2m9ujbo) + i ^ fwxexgq, 10) + b2m9ujbo);
            }
            String[] stringArray = qr.e3jb7ta78muayi(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

