/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1044
 *  net.minecraft.class_2561
 *  net.minecraft.class_4588
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Map;
import lombok.Generated;
import net.minecraft.class_1044;
import net.minecraft.class_2561;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bd;
import us.m0vy.moondlc.m0vyguard.bsdh_2;
import us.m0vy.moondlc.m0vyguard.bsw_2;
import us.m0vy.moondlc.m0vyguard.bzl_2;
import us.m0vy.moondlc.m0vyguard.bfh;
import us.m0vy.moondlc.m0vyguard.tdha;
import us.m0vy.moondlc.m0vyguard.dh_2;
import us.m0vy.moondlc.m0vyguard.zs_2;

public final class tthz_2
implements tdha {
    private final String znh_2;
    private final class_1044 sa;
    private final bzl_2 daw_2;
    private final bsdh_2 zqgh;
    private final Map radh;
    private final Map jsw;
    private static final int sutnywb2qa = -372857135;
    private static final int e8uzaomqnj = 1932333644;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int it6fptsb;

    private tthz_2(String string, class_1044 class_10443, bzl_2 bzl2, bsdh_2 bsdh2, Map map, Map map2) {
        this.znh_2 = string;
        this.sa = class_10443;
        this.daw_2 = bzl2;
        this.zqgh = bsdh2;
        this.radh = map;
        this.jsw = map2;
    }

    public int nh_2() {
        return this.sa.method_4624();
    }

    public void zad_6(Matrix4f matrix4f, class_4588 class_45882, String string, float f, float f2, float f3, float f4, float f5, float f6, int n) {
        this.sa.method_4527(true, true);
        string = dh_2.ddhz_4(string);
        int n2 = -1;
        boolean bl = false;
        for (int i = 0; i < string.length(); ++i) {
            int n3 = string.charAt(i);
            if (n3 == 7424) {
                n3 = 1040;
            }
            if (bl) {
                bl = false;
                continue;
            }
            if (n3 == 167) {
                bl = true;
                continue;
            }
            zs_2 zs2 = (zs_2)this.radh.get(n3);
            if (zs2 == null) continue;
            Map map = (Map)this.jsw.get(n2);
            if (map != null) {
                f4 += map.getOrDefault(n3, Float.valueOf(0.0f)).floatValue() * f;
            }
            f4 += zs2.sss_7(matrix4f, class_45882, f, f4, f5, f6, n) + f2 + f3;
            n2 = n3;
        }
    }

    public void thdha_2(Matrix4f matrix4f, class_4588 class_45882, String string, float f, float f2, float f3, float f4, float f5, float f6, bsw_2 bsw2) {
        this.sa.method_4527(true, true);
        string = dh_2.ddhz_4(string);
        int n = -1;
        boolean bl = false;
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (bl) {
                bl = false;
                continue;
            }
            if (c == '§') {
                bl = true;
                continue;
            }
            zs_2 zs2 = (zs_2)this.radh.get(c);
            if (zs2 == null) continue;
            Map map = (Map)this.jsw.get(n);
            if (map != null) {
                f4 += map.getOrDefault(c, Float.valueOf(0.0f)).floatValue() * f;
            }
            f4 += zs2.khyh(matrix4f, class_45882, f, f4, f5, f6, bsw2) + f2 + f3;
            n = c;
        }
    }

    public float dht_10(String string, float f) {
        string = dh_2.ddhz_4(string);
        int n = -1;
        float f2 = 0.0f;
        boolean bl = false;
        for (int i = 0; i < string.length(); ++i) {
            int n2 = string.charAt(i);
            if (n2 == 7424) {
                n2 = 1040;
            }
            if (bl) {
                bl = false;
                continue;
            }
            if (n2 == 167) {
                bl = true;
                continue;
            }
            zs_2 zs2 = (zs_2)this.radh.get(n2);
            if (zs2 == null) continue;
            Map map = (Map)this.jsw.get(n);
            if (map != null) {
                f2 += map.getOrDefault(n2, Float.valueOf(0.0f)).floatValue() * f;
            }
            f2 += zs2.tshq_2(f);
            n = n2;
        }
        return f2;
    }

    public float zml(class_2561 class_25612, float f) {
        return this.dht_10(class_25612.getString(), f);
    }

    public bd rdhz(float f) {
        return new bd(this, f);
    }

    public static bfh aghgh() {
        return new bfh();
    }

    @Generated
    public String getName() {
        return this.znh_2;
    }

    @Generated
    public bzl_2 dhh_5() {
        return this.daw_2;
    }

    @Generated
    public bsdh_2 dhht_4() {
        return this.zqgh;
    }

    private static String[] m12s0jebfms(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite dk0leyk71v(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ sutnywb2qa ^ string.hashCode() ^ n2 + e8uzaomqnj + i * 686562963) + sutnywb2qa) ^ e8uzaomqnj));
            }
            String[] stringArray = tthz_2.m12s0jebfms(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

