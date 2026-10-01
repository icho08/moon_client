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
import us.m0vy.moondlc.m0vyguard.tah_2;

public class st_3 {
    public static final st_3 jzt;
    public static final st_3 rthm;
    public static final st_3 twb;
    public static final st_3 s_3;
    public static final st_3 hdl;
    public static final st_3 jzh_2;
    private transient float[] sss;
    private final float zhw;
    private final float tzr;
    private final float shakh;
    private final float shkhs;
    private static final ByteBuffer hrd;
    private static final int pir5d27hdqea = -1505276285;
    private static final int oe67v2x23 = 952439486;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int d0fvun7w;

    public st_3(float f, float f2, float f3) {
        this(f, f2, f3, 255.0f);
    }

    public st_3(float f, float f2, float f3, float f4) {
        f = class_3532.method_15363((float)f, (float)0.0f, (float)255.0f);
        f2 = class_3532.method_15363((float)f2, (float)0.0f, (float)255.0f);
        f3 = class_3532.method_15363((float)f3, (float)0.0f, (float)255.0f);
        f4 = class_3532.method_15363((float)f4, (float)0.0f, (float)255.0f);
        this.zhw = f;
        this.tzr = f2;
        this.shakh = f3;
        this.shkhs = f4;
    }

    public int adhd_2() {
        int n = Math.round(this.dt_3(this.shkhs));
        int n2 = Math.round(this.dt_3(this.zhw));
        int n3 = Math.round(this.dt_3(this.tzr));
        int n4 = Math.round(this.dt_3(this.shakh));
        return (n & 0xFF) << 24 | (n2 & 0xFF) << 16 | (n3 & 0xFF) << 8 | n4 & 0xFF;
    }

    public String atw() {
        return String.format("#%02x%02x%02x%02x", Math.round(this.dt_3(this.zhw)), Math.round(this.dt_3(this.tzr)), Math.round(this.dt_3(this.shakh)), Math.round(this.dt_3(this.shkhs)));
    }

    private float dt_3(float f) {
        return Math.max(0.0f, Math.min(255.0f, f));
    }

    public static st_3 ththh(String string) {
        String string2 = string.startsWith("#") ? string.substring(1) : string;
        String string3 = string2;
        if (string2.length() != 6 && string2.length() != 8) {
            throw new IllegalArgumentException("Hex color must be in the format #RRGGBB or #RRGGBBAA");
        }
        float f = Integer.parseInt(string2.substring(0, 2), 16);
        float f2 = Integer.parseInt(string2.substring(2, 4), 16);
        float f3 = Integer.parseInt(string2.substring(4, 6), 16);
        float f4 = string2.length() == 8 ? (float)Integer.parseInt(string2.substring(6, 8), 16) : 255.0f;
        return new st_3(f, f2, f3, f4);
    }

    public static st_3 khkt_2(int n) {
        float f = n >> 24 & 0xFF;
        float f2 = n >> 16 & 0xFF;
        float f3 = n >> 8 & 0xFF;
        float f4 = n & 0xFF;
        return new st_3(f2, f3, f4, f);
    }

    public st_3 sdhz_3(float f) {
        return new st_3(this.zhw, this.tzr, this.shakh, f);
    }

    public st_3 thjj(float f) {
        return this.sdhz_3(this.shkhs * f);
    }

    public st_3 rkkh(st_3 st2_2, float f) {
        f = Math.min(1.0f, Math.max(0.0f, f));
        return new st_3(tah_2.j_2(this.khdn(), st2_2.khdn(), f), tah_2.j_2(this.shkhgh(), st2_2.shkhgh(), f), tah_2.j_2(this.ama_2(), st2_2.ama_2(), f), tah_2.j_2(this.khhh(), st2_2.khhh(), f));
    }

    public static st_3 hyth(float f, float f2, float f3) {
        if (f2 == 0.0f) {
            int n = (int)(f3 * 255.0f + 0.5f);
            return new st_3(n, n, n);
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
        return new st_3(f9 * 255.0f, f10 * 255.0f, f11 * 255.0f);
    }

    public float ttz_6() {
        return this.dwsh()[0];
    }

    public float dths_4() {
        return this.dwsh()[2];
    }

    public float tdw_2() {
        return this.dwsh()[1];
    }

    private float[] dwsh() {
        if (this.sss == null) {
            this.sss = this.sfn_2();
        }
        return this.sss;
    }

    private float[] sfn_2() {
        float f = this.zhw / 255.0f;
        float f2 = this.tzr / 255.0f;
        float f3 = this.shakh / 255.0f;
        float f4 = Math.max(f, Math.max(f2, f3));
        float f5 = Math.min(f, Math.min(f2, f3));
        float f6 = f4 - f5;
        float f7 = 0.0f;
        if (f6 != 0.0f) {
            float f8;
            f7 = f4 == f ? (f2 - f3) / f6 : (f4 == f2 ? (f3 - f) / f6 + 2.0f : (f - f2) / f6 + 4.0f);
            f7 /= 6.0f;
            if (f8 < 0.0f) {
                f7 += 1.0f;
            }
        }
        float f9 = f4 == 0.0f ? 0.0f : f6 / f4;
        float f10 = f4;
        return new float[]{f7, f9, f10};
    }

    public static st_3 sydh(float f, float f2) {
        hrd.clear();
        GL11.glReadPixels((int)((int)f), (int)((int)f2), (int)1, (int)1, (int)6408, (int)5121, (ByteBuffer)hrd);
        int n = hrd.get(0) & 0xFF;
        int n2 = hrd.get(1) & 0xFF;
        int n3 = hrd.get(2) & 0xFF;
        return new st_3(n, n2, n3);
    }

    public boolean bsa(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        st_3 st2_2 = (st_3)object;
        return Float.compare(this.zhw, st2_2.zhw) == 0 && Float.compare(this.tzr, st2_2.tzr) == 0 && Float.compare(this.shakh, st2_2.shakh) == 0 && Float.compare(this.shkhs, st2_2.shkhs) == 0;
    }

    public float sshl_2(st_3 st2_2) {
        return Math.abs(this.ttz_6() - st2_2.ttz_6()) + Math.abs(this.tdw_2() - st2_2.tdw_2()) + Math.abs(this.dths_4() - st2_2.dths_4());
    }

    public int jhth() {
        return Objects.hash(Float.valueOf(this.zhw), Float.valueOf(this.tzr), Float.valueOf(this.shakh), Float.valueOf(this.shkhs));
    }

    public String szgh_4() {
        return String.format("RGBA(%.1f, %.1f, %.1f, %.1f)", Float.valueOf(this.zhw), Float.valueOf(this.tzr), Float.valueOf(this.shakh), Float.valueOf(this.shkhs));
    }

    @Generated
    public float khdn() {
        return this.zhw;
    }

    @Generated
    public float shkhgh() {
        return this.tzr;
    }

    @Generated
    public float ama_2() {
        return this.shakh;
    }

    @Generated
    public float khhh() {
        return this.shkhs;
    }

    private static String[] nbz4puvp9(String string) {
        return string.split("\u0001\u0014", -1);
    }

    private static CallSite rt7ajhydfi(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ pir5d27hdqea ^ string.hashCode() ^ n2 + oe67v2x23 + i * 963762029) + pir5d27hdqea) ^ oe67v2x23));
            }
            String[] stringArray = st_3.nbz4puvp9(new String(cArray));
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

