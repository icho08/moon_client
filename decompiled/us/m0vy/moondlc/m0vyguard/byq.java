/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_3532
 *  org.lwjgl.opengl.GL11
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
import java.util.Objects;
import lombok.Generated;
import net.minecraft.class_3532;
import org.lwjgl.opengl.GL11;
import us.m0vy.moondlc.m0vyguard.tra;

public class byq {
    public static final byq brz_2;
    public static final byq dhww;
    public static final byq haw;
    public static final byq sn;
    public static final byq hzq_2;
    public static final byq bkhz;
    private transient float[] jds_2;
    private final float hd_3;
    private final float db_2;
    private final float djn;
    private final float tghd;
    private static final ByteBuffer dhtkh_2;
    private static final int xirkm717v = 807729797;
    private static final int dq6g42h = 1637771073;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int fnd28ebegg8s;

    public byq(float f, float f2, float f3) {
        this(f, f2, f3, 255.0f);
    }

    public byq(float f, float f2, float f3, float f4) {
        f = class_3532.method_15363((float)f, (float)0.0f, (float)255.0f);
        f2 = class_3532.method_15363((float)f2, (float)0.0f, (float)255.0f);
        f3 = class_3532.method_15363((float)f3, (float)0.0f, (float)255.0f);
        f4 = class_3532.method_15363((float)f4, (float)0.0f, (float)255.0f);
        this.hd_3 = f;
        this.db_2 = f2;
        this.djn = f3;
        this.tghd = f4;
    }

    public int rk() {
        int n = Math.round(this.thbr(this.tghd));
        int n2 = Math.round(this.thbr(this.hd_3));
        int n3 = Math.round(this.thbr(this.db_2));
        int n4 = Math.round(this.thbr(this.djn));
        return (n & 0xFF) << 24 | (n2 & 0xFF) << 16 | (n3 & 0xFF) << 8 | n4 & 0xFF;
    }

    public String ddl_4() {
        return String.format("#%02x%02x%02x%02x", Math.round(this.thbr(this.hd_3)), Math.round(this.thbr(this.db_2)), Math.round(this.thbr(this.djn)), Math.round(this.thbr(this.tghd)));
    }

    private float thbr(float f) {
        return Math.max(0.0f, Math.min(255.0f, f));
    }

    public static byq rghk(String string) {
        String string2;
        String string3 = string2 = string.startsWith("#") ? string.substring(1) : string;
        if (string2.length() != 6 && string2.length() != 8) {
            throw new IllegalArgumentException("Hex color must be in the format #RRGGBB or #RRGGBBAA");
        }
        float f = Integer.parseInt(string2.substring(0, 2), 16);
        float f2 = Integer.parseInt(string2.substring(2, 4), 16);
        float f3 = Integer.parseInt(string2.substring(4, 6), 16);
        float f4 = string2.length() == 8 ? (float)Integer.parseInt(string2.substring(6, 8), 16) : 255.0f;
        return new byq(f, f2, f3, f4);
    }

    public static byq tkhw(int n) {
        float f = n >> 24 & 0xFF;
        float f2 = n >> 16 & 0xFF;
        float f3 = n >> 8 & 0xFF;
        float f4 = n & 0xFF;
        return new byq(f2, f3, f4, f);
    }

    public byq tkhl_2(float f) {
        return new byq(this.hd_3, this.db_2, this.djn, f);
    }

    public byq thzz_4(float f) {
        return this.tkhl_2(this.tghd * f);
    }

    public byq dkhw_2(byq byq2, float f) {
        f = Math.min(1.0f, Math.max(0.0f, f));
        return new byq(tra.thn_3(this.sbk(), byq2.sbk(), f), tra.thn_3(this.srl(), byq2.srl(), f), tra.thn_3(this.shsl_2(), byq2.shsl_2(), f), tra.thn_3(this.tzdh_2(), byq2.tzdh_2(), f));
    }

    public static byq slz_2(float f, float f2, float f3) {
        if (f2 == 0.0f) {
            int n = (int)(f3 * 255.0f + 0.5f);
            return new byq(n, n, n);
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
        return new byq(f9 * 255.0f, f10 * 255.0f, f11 * 255.0f);
    }

    public float ztdh_4() {
        return this.thshgh()[0];
    }

    public float dzt_3() {
        return this.thshgh()[2];
    }

    public float shjm() {
        return this.thshgh()[1];
    }

    private float[] thshgh() {
        if (this.jds_2 == null) {
            this.jds_2 = this.zdht_2();
        }
        return this.jds_2;
    }

    private float[] zdht_2() {
        float f = this.hd_3 / 255.0f;
        float f2 = this.db_2 / 255.0f;
        float f3 = this.djn / 255.0f;
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

    public static byq djk_2(float f, float f2) {
        dhtkh_2.clear();
        GL11.glReadPixels((int)((int)f), (int)((int)f2), (int)1, (int)1, (int)6408, (int)5121, (ByteBuffer)dhtkh_2);
        int n = dhtkh_2.get(0) & 0xFF;
        int n2 = dhtkh_2.get(1) & 0xFF;
        int n3 = dhtkh_2.get(2) & 0xFF;
        return new byq(n, n2, n3);
    }

    public boolean shnf(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            byq byq2 = (byq)object;
            return Float.compare(this.hd_3, byq2.hd_3) == 0 && Float.compare(this.db_2, byq2.db_2) == 0 && Float.compare(this.djn, byq2.djn) == 0 && Float.compare(this.tghd, byq2.tghd) == 0;
        }
        return false;
    }

    public float shlz(byq byq2) {
        return Math.abs(this.ztdh_4() - byq2.ztdh_4()) + Math.abs(this.shjm() - byq2.shjm()) + Math.abs(this.dzt_3() - byq2.dzt_3());
    }

    public int dhghh_2() {
        return Objects.hash(Float.valueOf(this.hd_3), Float.valueOf(this.db_2), Float.valueOf(this.djn), Float.valueOf(this.tghd));
    }

    public String zan() {
        return String.format("RGBA(%.1f, %.1f, %.1f, %.1f)", Float.valueOf(this.hd_3), Float.valueOf(this.db_2), Float.valueOf(this.djn), Float.valueOf(this.tghd));
    }

    @Generated
    public float sbk() {
        return this.hd_3;
    }

    @Generated
    public float srl() {
        return this.db_2;
    }

    @Generated
    public float shsl_2() {
        return this.djn;
    }

    @Generated
    public float tzdh_2() {
        return this.tghd;
    }

    private static String[] b8re4a3u69(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite nk26xvjopd7c10(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ xirkm717v ^ string.hashCode()) + (n2 + dq6g42h) + i ^ xirkm717v, 24) + dq6g42h);
            }
            String[] stringArray = byq.b8re4a3u69(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

