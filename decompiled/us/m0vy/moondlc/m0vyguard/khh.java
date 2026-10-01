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
import us.m0vy.moondlc.m0vyguard.ghm;

public class khh {
    public static final khh dww;
    public static final khh thth_2;
    public static final khh khws_2;
    public static final khh yd;
    public static final khh dhsh_4;
    public static final khh shd_5;
    private transient float[] raa_2;
    private final float rmk;
    private final float sda_2;
    private final float thydh;
    private final float ssb;
    private static final ByteBuffer zad_4;
    private static final int qpz678ub = -793557865;
    private static final int dlt0t8gz08ns = 82763719;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int kszw7f3eizyo;

    public khh(float f, float f2, float f3) {
        this(f, f2, f3, 255.0f);
    }

    public khh(float f, float f2, float f3, float f4) {
        f = class_3532.method_15363((float)f, (float)0.0f, (float)255.0f);
        f2 = class_3532.method_15363((float)f2, (float)0.0f, (float)255.0f);
        f3 = class_3532.method_15363((float)f3, (float)0.0f, (float)255.0f);
        f4 = class_3532.method_15363((float)f4, (float)0.0f, (float)255.0f);
        this.rmk = f;
        this.sda_2 = f2;
        this.thydh = f3;
        this.ssb = f4;
    }

    public int rlsh() {
        int n = Math.round(this.sbh_4(this.ssb));
        int n2 = Math.round(this.sbh_4(this.rmk));
        int n3 = Math.round(this.sbh_4(this.sda_2));
        int n4 = Math.round(this.sbh_4(this.thydh));
        return (n & 0xFF) << 24 | (n2 & 0xFF) << 16 | (n3 & 0xFF) << 8 | n4 & 0xFF;
    }

    public String dhadh_2() {
        return String.format("#%02x%02x%02x%02x", Math.round(this.sbh_4(this.rmk)), Math.round(this.sbh_4(this.sda_2)), Math.round(this.sbh_4(this.thydh)), Math.round(this.sbh_4(this.ssb)));
    }

    private float sbh_4(float f) {
        return Math.max(0.0f, Math.min(255.0f, f));
    }

    public static khh tkhs(String string) {
        String string2;
        String string3 = string2 = string.startsWith("#") ? string.substring(1) : string;
        if (string2.length() != 6 && string2.length() != 8) {
            throw new IllegalArgumentException("Hex color must be in the format #RRGGBB or #RRGGBBAA");
        }
        float f = Integer.parseInt(string2.substring(0, 2), 16);
        float f2 = Integer.parseInt(string2.substring(2, 4), 16);
        float f3 = Integer.parseInt(string2.substring(4, 6), 16);
        float f4 = string2.length() == 8 ? (float)Integer.parseInt(string2.substring(6, 8), 16) : 255.0f;
        return new khh(f, f2, f3, f4);
    }

    public static khh thwz(int n) {
        float f = n >> 24 & 0xFF;
        float f2 = n >> 16 & 0xFF;
        float f3 = n >> 8 & 0xFF;
        float f4 = n & 0xFF;
        return new khh(f2, f3, f4, f);
    }

    public khh khhh_3(float f) {
        return new khh(this.rmk, this.sda_2, this.thydh, f);
    }

    public khh jad(float f) {
        return this.khhh_3(this.ssb * f);
    }

    public khh dthy(khh khh2, float f) {
        f = Math.min(1.0f, Math.max(0.0f, f));
        return new khh(ghm.haa(this.tlz(), khh2.tlz(), f), ghm.haa(this.rrm(), khh2.rrm(), f), ghm.haa(this.rkhj(), khh2.rkhj(), f), ghm.haa(this.tas_3(), khh2.tas_3(), f));
    }

    public static khh hlsh(float f, float f2, float f3) {
        if (f2 == 0.0f) {
            int n = (int)(f3 * 255.0f + 0.5f);
            return new khh(n, n, n);
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
        return new khh(f9 * 255.0f, f10 * 255.0f, f11 * 255.0f);
    }

    public float ghhd() {
        return this.tdha_3()[0];
    }

    public float sght_4() {
        return this.tdha_3()[2];
    }

    public float dlr_2() {
        return this.tdha_3()[1];
    }

    private float[] tdha_3() {
        if (this.raa_2 == null) {
            this.raa_2 = this.thmdh();
        }
        return this.raa_2;
    }

    private float[] thmdh() {
        float f = this.rmk / 255.0f;
        float f2 = this.sda_2 / 255.0f;
        float f3 = this.thydh / 255.0f;
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

    public static khh rshj(float f, float f2) {
        zad_4.clear();
        GL11.glReadPixels((int)((int)f), (int)((int)f2), (int)1, (int)1, (int)6408, (int)5121, (ByteBuffer)zad_4);
        int n = zad_4.get(0) & 0xFF;
        int n2 = zad_4.get(1) & 0xFF;
        int n3 = zad_4.get(2) & 0xFF;
        return new khh(n, n2, n3);
    }

    public boolean khtkh(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            khh khh2 = (khh)object;
            return Float.compare(this.rmk, khh2.rmk) == 0 && Float.compare(this.sda_2, khh2.sda_2) == 0 && Float.compare(this.thydh, khh2.thydh) == 0 && Float.compare(this.ssb, khh2.ssb) == 0;
        }
        return false;
    }

    public float aqz_2(khh khh2) {
        return Math.abs(this.ghhd() - khh2.ghhd()) + Math.abs(this.dlr_2() - khh2.dlr_2()) + Math.abs(this.sght_4() - khh2.sght_4());
    }

    public int qf() {
        return Objects.hash(Float.valueOf(this.rmk), Float.valueOf(this.sda_2), Float.valueOf(this.thydh), Float.valueOf(this.ssb));
    }

    public String thzy_2() {
        return String.format("RGBA(%.1f, %.1f, %.1f, %.1f)", Float.valueOf(this.rmk), Float.valueOf(this.sda_2), Float.valueOf(this.thydh), Float.valueOf(this.ssb));
    }

    @Generated
    public float tlz() {
        return this.rmk;
    }

    @Generated
    public float rrm() {
        return this.sda_2;
    }

    @Generated
    public float rkhj() {
        return this.thydh;
    }

    @Generated
    public float tas_3() {
        return this.ssb;
    }

    private static String[] y3nc7ekh1(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite id8op221gv(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ qpz678ub ^ string.hashCode()) + (n2 + dlt0t8gz08ns) + i ^ qpz678ub, 8) + dlt0t8gz08ns);
            }
            String[] stringArray = khh.y3nc7ekh1(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

