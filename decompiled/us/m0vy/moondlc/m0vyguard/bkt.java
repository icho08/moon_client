/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
import java.util.Objects;
import lombok.Generated;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.tjq;
import us.m0vy.moondlc.m0vyguard.tkhs;

public class bkt {
    public static final bkt jdh_5;
    public static final bkt khghb;
    public static final bkt hqh;
    public static final bkt drq;
    public static final bkt thghf;
    public static final bkt thst;
    public static final bkt thjs_2;
    public static final bkt tma_2;
    private transient float[] hdy_2;
    private final int znn;
    private final int thlh_2;
    private final int rsh_2;
    private final int thrj;
    private static final ByteBuffer tzk_2;
    private static final int zz6ou2hvcx4z = 415406722;
    private static final int qhdeo77w = -1428568946;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int plpuorzqq4kz;

    public bkt(int n) {
        this(tjq.tdhb(n), tjq.hbs(n), tjq.hsb_2(n), tjq.ghzy_2(n));
    }

    public bkt(Color color) {
        this(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    public bkt(int n, int n2, int n3) {
        this(n, n2, n3, 255);
    }

    public bkt(int n, int n2, int n3, int n4) {
        n = class_3532.method_15340((int)n, (int)0, (int)255);
        n2 = class_3532.method_15340((int)n2, (int)0, (int)255);
        n3 = class_3532.method_15340((int)n3, (int)0, (int)255);
        n4 = class_3532.method_15340((int)n4, (int)0, (int)255);
        this.znn = n;
        this.thlh_2 = n2;
        this.rsh_2 = n3;
        this.thrj = n4;
    }

    public bkt(int n, int n2, int n3, float f) {
        n = class_3532.method_15340((int)n, (int)0, (int)255);
        n2 = class_3532.method_15340((int)n2, (int)0, (int)255);
        n3 = class_3532.method_15340((int)n3, (int)0, (int)255);
        f = class_3532.method_15363((float)f, (float)0.0f, (float)255.0f);
        this.znn = n;
        this.thlh_2 = n2;
        this.rsh_2 = n3;
        this.thrj = (int)f;
    }

    public int btkh() {
        int n = Math.round(this.bhsh_2(this.thrj));
        int n2 = Math.round(this.bhsh_2(this.znn));
        int n3 = Math.round(this.bhsh_2(this.thlh_2));
        int n4 = Math.round(this.bhsh_2(this.rsh_2));
        return (n & 0xFF) << 24 | (n2 & 0xFF) << 16 | (n3 & 0xFF) << 8 | n4 & 0xFF;
    }

    private int bhsh_2(float f) {
        return (int)Math.max(0.0f, Math.min(255.0f, f));
    }

    public static bkt shhh_2(String string) {
        String string2;
        String string3 = string2 = string.startsWith("#") ? string.substring(1) : string;
        if (string2.length() != 6 && string2.length() != 8) {
            throw new IllegalArgumentException("Hex color must be in the format #RRGGBB or #RRGGBBAA");
        }
        int n = Integer.parseInt(string2.substring(0, 2), 16);
        int n2 = Integer.parseInt(string2.substring(2, 4), 16);
        int n3 = Integer.parseInt(string2.substring(4, 6), 16);
        int n4 = string2.length() == 8 ? Integer.parseInt(string2.substring(6, 8), 16) : 255;
        return new bkt(n, n2, n3, n4);
    }

    public static bkt jsh(bkt bkt2, bkt bkt3, float f) {
        float f2 = Math.max(0.0f, Math.min(1.0f, f));
        int n = (int)((float)bkt2.khyh_2() + (float)(bkt3.khyh_2() - bkt2.khyh_2()) * f2);
        int n2 = (int)((float)bkt2.shghs_2() + (float)(bkt3.shghs_2() - bkt2.shghs_2()) * f2);
        int n3 = (int)((float)bkt2.shaz() + (float)(bkt3.shaz() - bkt2.shaz()) * f2);
        int n4 = (int)((float)bkt2.btr_2() + (float)(bkt3.btr_2() - bkt2.btr_2()) * f2);
        return new bkt(n, n2, n3, n4);
    }

    public static bkt hthb(int n) {
        int n2 = n >> 24 & 0xFF;
        int n3 = n >> 16 & 0xFF;
        int n4 = n >> 8 & 0xFF;
        int n5 = n & 0xFF;
        return new bkt(n3, n4, n5, n2);
    }

    public bkt zdhgh_2(float f) {
        return new bkt(this.znn, this.thlh_2, this.rsh_2, (int)f);
    }

    public bkt rwh_2(int n) {
        return new bkt(this.znn, this.thlh_2, this.rsh_2, n);
    }

    public bkt shbm(float f) {
        return this.rwh_2((int)((float)this.thrj * f));
    }

    public bkt ttz_8(bkt bkt2, float f) {
        f = Math.min(1.0f, Math.max(0.0f, f));
        return new bkt((int)tkhs.dskh(this.khyh_2(), bkt2.khyh_2(), f), (int)tkhs.dskh(this.shghs_2(), bkt2.shghs_2(), f), (int)tkhs.dskh(this.shaz(), bkt2.shaz(), f), (int)tkhs.dskh(this.btr_2(), bkt2.btr_2(), f));
    }

    public bkt jkd_2(float f) {
        f = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        return new bkt((int)((float)this.znn * (1.0f - f)), (int)((float)this.thlh_2 * (1.0f - f)), (int)((float)this.rsh_2 * (1.0f - f)), this.thrj);
    }

    public static bkt tth_9(float f, float f2, float f3) {
        if (f2 == 0.0f) {
            int n = (int)(f3 * 255.0f + 0.5f);
            return new bkt(n, n, n);
        }
        float f4 = (f - (float)Math.floor(f)) * 6.0f;
        float f5 = f4 - (float)Math.floor(f4);
        float f6 = f3 * (1.0f - f2);
        float f7 = f3 * (1.0f - f2 * f5);
        float f8 = f3 * (1.0f - f2 * (1.0f - f5));
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        switch ((int)f4) {
            case 0: {
                f9 = f3;
                f10 = f8;
                f11 = f6;
                break;
            }
            case 1: {
                f9 = f7;
                f10 = f3;
                f11 = f6;
                break;
            }
            case 2: {
                f9 = f6;
                f10 = f3;
                f11 = f8;
                break;
            }
            case 3: {
                f9 = f6;
                f10 = f7;
                f11 = f3;
                break;
            }
            case 4: {
                f9 = f8;
                f10 = f6;
                f11 = f3;
                break;
            }
            case 5: {
                f9 = f3;
                f10 = f6;
                f11 = f7;
            }
        }
        return new bkt((int)(f9 * 255.0f), (int)(f10 * 255.0f), (int)(f11 * 255.0f));
    }

    public float tdhy_2() {
        return this.tdl_3()[0];
    }

    public float dsha_3() {
        return this.tdl_3()[2];
    }

    public float dghkh_2() {
        return this.tdl_3()[1];
    }

    private float[] tdl_3() {
        if (this.hdy_2 == null) {
            this.hdy_2 = this.shjdh();
        }
        return this.hdy_2;
    }

    private float[] shjdh() {
        float f = (float)this.znn / 255.0f;
        float f2 = (float)this.thlh_2 / 255.0f;
        float f3 = (float)this.rsh_2 / 255.0f;
        float f4 = Math.max(f, Math.max(f2, f3));
        float f5 = Math.min(f, Math.min(f2, f3));
        float f6 = f4 - f5;
        float f7 = 0.0f;
        if (f6 != 0.0f) {
            f7 = f4 == f ? (f2 - f3) / f6 : (f4 == f2 ? (f3 - f) / f6 + 2.0f : (f - f2) / f6 + 4.0f);
            if ((f7 /= 6.0f) < 0.0f) {
                f7 += 1.0f;
            }
        }
        float f8 = f4 == 0.0f ? 0.0f : f6 / f4;
        return new float[]{f7, f8, f4};
    }

    public bkt ghtt_2(float f) {
        f = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        return new bkt((int)((float)this.znn + (255.0f - (float)this.znn) * f), (int)((float)this.thlh_2 + (255.0f - (float)this.thlh_2) * f), (int)((float)this.rsh_2 + (255.0f - (float)this.rsh_2) * f), this.thrj);
    }

    public boolean zdhs_4(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            bkt bkt2 = (bkt)object;
            return Float.compare(this.znn, bkt2.znn) == 0 && Float.compare(this.thlh_2, bkt2.thlh_2) == 0 && Float.compare(this.rsh_2, bkt2.rsh_2) == 0 && Float.compare(this.thrj, bkt2.thrj) == 0;
        }
        return false;
    }

    public float smz_2(bkt bkt2) {
        return Math.abs(this.tdhy_2() - bkt2.tdhy_2()) + Math.abs(this.dghkh_2() - bkt2.dghkh_2()) + Math.abs(this.dsha_3() - bkt2.dsha_3());
    }

    public int tdhs_2() {
        return Objects.hash(this.znn, this.thlh_2, this.rsh_2, this.thrj);
    }

    @Generated
    public int khyh_2() {
        return this.znn;
    }

    @Generated
    public int shghs_2() {
        return this.thlh_2;
    }

    @Generated
    public int shaz() {
        return this.rsh_2;
    }

    @Generated
    public int btr_2() {
        return this.thrj;
    }

    private static String[] snz04y4eg6r2(String string) {
        return string.split("\u0005\u001f", -1);
    }

    private static CallSite g2t3ccs3wc(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ zz6ou2hvcx4z ^ string.hashCode() ^ n2 + qhdeo77w + i * 163240261) + zz6ou2hvcx4z) ^ qhdeo77w));
            }
            String[] stringArray = bkt.snz04y4eg6r2(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

