/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_1044
 *  net.minecraft.class_2561
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_5944
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
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_1044;
import net.minecraft.class_2561;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_5944;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.brb;
import us.m0vy.moondlc.m0vyguard.bzr_2;
import us.m0vy.moondlc.m0vyguard.bkd_2;
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.trk;
import us.m0vy.moondlc.m0vyguard.trw;
import us.m0vy.moondlc.m0vyguard.tzm;
import us.m0vy.moondlc.m0vyguard.dhb_3;
import us.m0vy.moondlc.m0vyguard.dhsh_5;
import us.m0vy.moondlc.m0vyguard.tn_2;
import us.m0vy.moondlc.m0vyguard.qf;
import us.m0vy.moondlc.m0vyguard.mn;

public final class bsh_2 {
    private static final dhsh_5 rghk;
    private String khaf_2;
    private class_1044 zba_2;
    private trk hthf;
    private qf tht_5;
    private Map dhsh_7;
    private Map jmh_2;
    private Supplier shz_3;
    private volatile boolean jjz;
    private static final int kokhmjbj73ai = 159298266;
    private static final int rvtbgro0tg96m = 1116394278;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int k3hjc003icfnte;

    public bsh_2(String string, class_1044 class_10443, trk trk2, qf qf2, Map map, Map map2) {
        this.khaf_2 = string;
        this.zba_2 = class_10443;
        this.hthf = trk2;
        this.tht_5 = qf2;
        this.dhsh_7 = map;
        this.jmh_2 = map2;
        this.jjz = true;
    }

    private bsh_2(String string, Supplier supplier) {
        this.khaf_2 = string;
        this.shz_3 = supplier;
        this.jjz = false;
    }

    public static bsh_2 zfsh_2(String string, Supplier supplier) {
        return new bsh_2(string, supplier);
    }

    public trk tkk() {
        this.khgha();
        return this.hthf;
    }

    public qf syl() {
        this.khgha();
        return this.tht_5;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void khgha() {
        if (this.jjz) {
            return;
        }
        bsh_2 bsh2 = this;
        synchronized (bsh2) {
            if (this.jjz) {
                return;
            }
            bsh_2 bsh3 = (bsh_2)this.shz_3.get();
            this.khaf_2 = bsh3.khaf_2;
            this.zba_2 = bsh3.zba_2;
            this.hthf = bsh3.hthf;
            this.tht_5 = bsh3.tht_5;
            this.dhsh_7 = bsh3.dhsh_7;
            this.jmh_2 = bsh3.jmh_2;
            this.shz_3 = null;
            this.jjz = true;
        }
    }

    private mn rdhh(float f, float f2) {
        this.khgha();
        return new mn(Float.valueOf(f), Float.valueOf(f2));
    }

    public void sdt(class_4587 class_45872, class_2561 class_25612, float f, float f2, float f3, float f4, float f5, float f6, int n, float f7) {
        if (class_25612 == null) {
            return;
        }
        try {
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            this.dam_4(f7, f4, f5, n);
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            this.bza_2(matrix4f, (class_4588)class_2872, bkd_2.tla_2(bzr_2.hjt(class_25612)), f3, (f4 + f7 * 0.5f) * 0.5f * f3, f6, f, f2 + this.syl().baselineHeight() * f3, 0.0f);
            this.ba(class_2872);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void rzt_2(class_4587 class_45872, String string, float f, float f2, float f3, float f4, int n, int n2, float f5, float f6, float f7, int n3, float f8) {
        try {
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            this.dam_4(f8, f4, f6, n3);
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            this.dhdt_3(matrix4f, (class_4588)class_2872, bzr_2.sdl_2(string), f3, (f4 + f8 * 0.5f) * 0.5f * f3, f7, f, f2 + this.syl().baselineHeight() * f3, 0.0f, n, n2, f5);
            this.ba(class_2872);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void skhw_2(class_4587 class_45872, String string, float f, float f2, float f3, float f4, int n, int n2, float f5, float f6, float f7, int n3, float f8) {
        try {
            Matrix4f matrix4f = class_45872.method_23760().method_23761();
            this.dam_4(f8, f4, f6, n3);
            class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            this.dhdt_3(matrix4f, (class_4588)class_2872, string == null ? "" : string, f3, (f4 + f8 * 0.5f) * 0.5f * f3, f7, f, f2 + this.syl().baselineHeight() * f3, 0.0f, n, n2, f5);
            this.ba(class_2872);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void ba(class_287 class_2872) {
        class_286.method_43433((class_9801)class_2872.method_60800());
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.setShader((class_10156)class_10142.field_53880);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)true);
    }

    private void dam_4(float f, float f2, float f3, int n) {
        this.khgha();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.setShaderTexture((int)0, (int)this.zba_2.method_4624());
        boolean bl = f > 0.0f;
        class_5944 class_59442 = rghk.rtth();
        if (class_59442 == null) {
            return;
        }
        rghk.zhd_5("uRange").method_1251(this.tkk().range());
        rghk.zhd_5("uThickness").method_1251(f2);
        rghk.zhd_5("uSmoothness").method_1251(f3);
        rghk.zhd_5("uOutline").method_35649(bl ? 1 : 0);
        if (bl) {
            rghk.zhd_5("uOutlineThickness").method_1251(f);
            float[] fArray = brb.adk(n);
            rghk.zhd_5("uOutlineColor").method_35657(fArray[0], fArray[1], fArray[2], fArray[3]);
        }
    }

    public void zhh_2(class_4587 class_45872, class_2561 class_25612, float f, float f2, float f3, float f4) {
        mn mn2 = this.rdhh(f, f2);
        this.sdt(class_45872, class_25612, ((Float)mn2.thash_2()).floatValue(), ((Float)mn2.tsa_3()).floatValue(), f3, f4, 0.5f, 0.0f, -1, f4);
    }

    public void zskh_4(class_4587 class_45872, String string, float f, float f2, float f3, Color color, float f4) {
        mn mn2 = this.rdhh(f, f2);
        this.rzt_2(class_45872, string, ((Float)mn2.thash_2()).floatValue(), ((Float)mn2.tsa_3()).floatValue(), f3, f4, color.getRGB(), -1, -1.0f, 0.5f, 0.0f, -1, f4);
    }

    public void ttm_2(class_4587 class_45872, String string, float f, float f2, float f3, Color color, float f4) {
        mn mn2 = this.rdhh(f, f2);
        this.skhw_2(class_45872, string, ((Float)mn2.thash_2()).floatValue(), ((Float)mn2.tsa_3()).floatValue(), f3, f4, color.getRGB(), -1, -1.0f, 0.5f, 0.0f, -1, f4);
    }

    public void zd(class_4587 class_45872, String string, float f, float f2, float f3, Color color, Color color2, float f4, float f5) {
        mn mn2 = this.rdhh(f, f2);
        this.rzt_2(class_45872, string, ((Float)mn2.thash_2()).floatValue(), ((Float)mn2.tsa_3()).floatValue(), f3, f5, color.getRGB(), color2.getRGB(), f4, 0.5f, 0.0f, -1, f5);
    }

    public void jdz(class_4587 class_45872, String string, float f, float f2, float f3, Color color, Color color2, float f4) {
        this.zd(class_45872, string, f, f2, f3, color, color2, f4, 0.0f);
    }

    public void sthr_2(class_4587 class_45872, class_2561 class_25612, float f, float f2, float f3) {
        this.zhh_2(class_45872, class_25612, f, f2, f3, 0.0f);
    }

    public void thdsh_2(class_4587 class_45872, String string, float f, float f2, float f3, Color color) {
        this.zskh_4(class_45872, string, f, f2, f3, color, 0.0f);
    }

    public void fth(class_4587 class_45872, String string, float f, float f2, float f3, Color color) {
        this.ttm_2(class_45872, string, f, f2, f3, color, 0.0f);
    }

    public void sjw_2(class_4587 class_45872, String string, float f, float f2, float f3, Color color, float f4) {
        this.zskh_4(class_45872, string, f - this.saf_2(string, f3, f4) / 2.0f, f2, f3, color, f4);
    }

    public void thsz_4(class_4587 class_45872, String string, float f, float f2, float f3, Color color) {
        this.sjw_2(class_45872, string, f, f2, f3, color, 0.0f);
    }

    public void khms_2(class_4587 class_45872, String string, float f, float f2, float f3, Color color, Color color2, float f4, float f5) {
        this.zd(class_45872, string, f - this.saf_2(string, f3, f5) / 2.0f, f2, f3, color, color2, f4, f5);
    }

    public void znb(class_4587 class_45872, String string, float f, float f2, float f3, Color color, Color color2, float f4) {
        this.khms_2(class_45872, string, f, f2, f3, color, color2, f4, 0.0f);
    }

    public void az_2(class_4587 class_45872, String string, float f, float f2, float f3, float f4, Color color, float f5, Duration duration, Duration duration2) {
        if (color.getAlpha() <= 0) {
            return;
        }
        float f6 = this.shdf_2(string, f4);
        if (f6 <= f3) {
            this.thdsh_2(class_45872, string, f, f2, f4, color);
        } else {
            tzm.hds_2(class_45872, f, f2 - f4 / 4.0f, f3, f4 * 1.5f);
            long l = duration.toMillis();
            long l2 = duration2.toMillis();
            long l3 = l + l2;
            long l4 = System.currentTimeMillis() % l3;
            float f7 = l4 < l ? (float)l4 / (float)l : 1.0f;
            float f8 = tbm.shat.apply(f7) * (f6 + f5);
            this.thdsh_2(class_45872, string, f - f8, f2, f4, color);
            this.thdsh_2(class_45872, string, f - f8 + (f6 + f5), f2, f4, color);
            tzm.jdz_4(class_45872);
        }
    }

    public static char shgh(char c) {
        return switch (c) {
            case 'à', 'á', 'â', 'ã', 'ä', 'å', 'ą' -> 'a';
            case 'À', 'Á', 'Â', 'Ã', 'Ä', 'Å', 'Ą' -> 'A';
            case 'ç', 'ć', 'č' -> 'c';
            case 'Ç', 'Ć', 'Č' -> 'C';
            case 'è', 'é', 'ê', 'ë', 'ę' -> 'e';
            case 'È', 'É', 'Ê', 'Ë', 'Ę' -> 'E';
            case 'ł' -> 'l';
            case 'Ł' -> 'L';
            case 'ñ', 'ń' -> 'n';
            case 'Ñ', 'Ń' -> 'N';
            case 'ò', 'ó', 'ô', 'õ', 'ö', 'ø' -> 'o';
            case 'Ò', 'Ó', 'Ô', 'Õ', 'Ö', 'Ø' -> 'O';
            case 'ś', 'š' -> 's';
            case 'Ś', 'Š' -> 'S';
            case 'ź', 'ż', 'ž' -> 'z';
            case 'Ź', 'Ż', 'Ž' -> 'Z';
            case 'ù', 'ú', 'û', 'ü' -> 'u';
            case 'Ù', 'Ú', 'Û', 'Ü' -> 'U';
            case 'ý', 'ÿ' -> 'y';
            case 'Ý' -> 'Y';
            default -> c;
        };
    }

    public tn_2 zsy_3(int n) {
        char c;
        tn_2 tn2 = (tn_2)this.dhsh_7.get(n);
        if (tn2 == null && n > 127 && (c = bsh_2.shgh((char)n)) != n) {
            tn2 = (tn_2)this.dhsh_7.get(c);
        }
        return tn2;
    }

    public void dhdt_3(Matrix4f matrix4f, class_4588 class_45882, String string, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2, float f7) {
        this.khgha();
        int n3 = -1;
        float f8 = f4;
        float f9 = this.shdf_2(string, f);
        float f10 = (float)(System.currentTimeMillis() % 3000L) / 3000.0f;
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            tn_2 tn2 = this.zsy_3(c);
            if (tn2 == null) continue;
            Map map = (Map)this.jmh_2.get(n3);
            if (map != null) {
                f4 += map.getOrDefault(c, Float.valueOf(0.0f)).floatValue() * f;
            }
            int n4 = n;
            if (f7 > 1.0f) {
                n4 = brb.trsh_2(n, n2, f4 - f8, f9, f10, f7);
            }
            f4 += tn2.khbq(matrix4f, class_45882, f, f4, f5, f6, n4) + f2 + f3;
            n3 = c;
        }
    }

    public void bza_2(Matrix4f matrix4f, class_4588 class_45882, List list, float f, float f2, float f3, float f4, float f5, float f6) {
        this.khgha();
        int n = -1;
        for (int i = 0; i < list.size(); ++i) {
            dhb_3 dhb2 = (dhb_3)list.get(i);
            char c = dhb2.c();
            int n2 = dhb2.color();
            tn_2 tn2 = this.zsy_3(c);
            if (tn2 == null) continue;
            Map map = (Map)this.jmh_2.get(n);
            if (map != null) {
                f4 += map.getOrDefault(c, Float.valueOf(0.0f)).floatValue() * f;
            }
            f4 += tn2.khbq(matrix4f, class_45882, f, f4, f5, f6, n2) + f2 + f3;
            n = c;
        }
    }

    public float khmw(float f) {
        return f;
    }

    public float thj(class_2561 class_25612, float f) {
        return this.ssgh_4(class_25612, f, 0.0f);
    }

    public float ssgh_4(class_2561 class_25612, float f, float f2) {
        this.khgha();
        if (class_25612 == null) {
            return 0.0f;
        }
        List list = bkd_2.tla_2(class_25612);
        int n = -1;
        float f3 = 0.0f;
        for (int i = 0; i < list.size(); ++i) {
            char c = ((dhb_3)list.get(i)).c();
            tn_2 tn2 = this.zsy_3(c);
            if (tn2 == null) continue;
            Map map = (Map)this.jmh_2.get(n);
            if (map != null) {
                f3 += map.getOrDefault(c, Float.valueOf(0.0f)).floatValue() * f * (1.0f + f2);
            }
            f3 += tn2.dhay(f);
            n = c;
        }
        return f3;
    }

    public float shdf_2(String string, float f) {
        return this.saf_2(string, f, 0.0f);
    }

    public float saf_2(String string, float f, float f2) {
        this.khgha();
        int n = -1;
        float f3 = 0.0f;
        String string2 = bzr_2.sdl_2(string);
        for (int i = 0; i < string2.length(); ++i) {
            char c = string2.charAt(i);
            tn_2 tn2 = this.zsy_3(c);
            if (tn2 == null) continue;
            Map map = (Map)this.jmh_2.get(n);
            if (map != null) {
                f3 += map.getOrDefault(c, Float.valueOf(0.0f)).floatValue() * f * (1.0f + f2);
            }
            f3 += tn2.dhay(f) * (1.0f + f2);
            n = c;
        }
        return f3;
    }

    public float sdk_3(String string, float f) {
        return this.tlq(string, f, 0.0f);
    }

    public float tlq(String string, float f, float f2) {
        this.khgha();
        if (string == null || string.isEmpty()) {
            return 0.0f;
        }
        int n = -1;
        float f3 = 0.0f;
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            tn_2 tn2 = this.zsy_3(c);
            if (tn2 == null) continue;
            Map map = (Map)this.jmh_2.get(n);
            if (map != null) {
                f3 += map.getOrDefault(c, Float.valueOf(0.0f)).floatValue() * f * (1.0f + f2);
            }
            f3 += tn2.dhay(f) * (1.0f + f2);
            n = c;
        }
        return f3;
    }

    public float zrt_4() {
        return 10.0f;
    }

    public static trw rzk() {
        return new trw();
    }

    private static String[] y6vhdqzp(String string) {
        return string.split("\u0004\u0019", -1);
    }

    private static CallSite bdajxyv4ltxj3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ kokhmjbj73ai ^ string.hashCode() ^ n2 + rvtbgro0tg96m ^ i * -333855777 ^ kokhmjbj73ai, 13) ^ rvtbgro0tg96m));
            }
            String[] stringArray = bsh_2.y6vhdqzp(new String(cArray));
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

