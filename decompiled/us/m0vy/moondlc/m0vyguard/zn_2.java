/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1044;
import net.minecraft.class_2561;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.bdhj;
import us.m0vy.moondlc.m0vyguard.bla;
import us.m0vy.moondlc.m0vyguard.bhf_2;
import us.m0vy.moondlc.m0vyguard.da;
import us.m0vy.moondlc.m0vyguard.za;

public final class zn_2 {
    private final String rsy_2;
    private final class_1044 shda_4;
    private final za kn;
    private final bla khmf;
    private final Map tygh;
    private final Map dhshq;
    private final ConcurrentHashMap dfsh = new ConcurrentHashMap();
    private static final int shm5yquit0 = -1848893676;
    private static final int d6ylxek = -1491710068;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int otks28xx5ev;

    private zn_2(String string, class_1044 class_10443, za za2, bla bla2, Map map, Map map2) {
        this.rsy_2 = string;
        this.shda_4 = class_10443;
        this.kn = za2;
        this.khmf = bla2;
        this.tygh = map;
        this.dhshq = map2;
    }

    public int khnk() {
        return this.shda_4.method_4624();
    }

    public void thzkh(Matrix4f matrix4f, class_4588 class_45882, String string, float f, float f2, float f3, float f4, float f5, float f6, int n) {
        int n2 = -1;
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
            da da2 = (da)this.tygh.get(c);
            if (da2 == null) continue;
            Map map = (Map)this.dhshq.get(n2);
            if (map != null) {
                f4 += map.getOrDefault(c, Float.valueOf(0.0f)).floatValue() * f;
            }
            f4 += da2.shs_10(matrix4f, class_45882, f, f4, f5, f6, n) + f2 + f3;
            n2 = c;
        }
    }

    public float zssh(String string, float f) {
        string = string.replace("і", "i").replace("І", "I");
        int n = -1;
        float f2 = 0.0f;
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
            da da2 = (da)this.tygh.get(c);
            if (da2 == null) continue;
            Map map = (Map)this.dhshq.get(n);
            if (map != null) {
                f2 += map.getOrDefault(c, Float.valueOf(0.0f)).floatValue() * f;
            }
            f2 += da2.ssdh_4(f) + 0.25f;
            n = c;
        }
        return f2;
    }

    private static long khaw(String string, float f, boolean bl) {
        int n = string.hashCode();
        return (long)n & 0xFFFFFFFFL ^ (long)Float.floatToIntBits(f) << 32 ^ (bl ? -7046029254386353131L : 0L);
    }

    public float rjj(String string, float f) {
        boolean bl;
        long l = zn_2.khaw(string = string.replace("і", "i").replace("І", "I"), f, bl = false);
        Float f2 = (Float)this.dfsh.get(l);
        if (f2 != null) {
            return f2.floatValue();
        }
        float f3 = this.zssh(string, f);
        this.dfsh.put(l, Float.valueOf(f3));
        return f3;
    }

    public void tsq_3() {
        this.dfsh.clear();
    }

    public float azf_2(class_2561 class_25612, float f) {
        return this.rjj(class_25612.getString(), f);
    }

    public bdhj thds(float f) {
        return new bdhj(this, f);
    }

    public String getName() {
        return this.rsy_2;
    }

    public za dhz_10() {
        return this.kn;
    }

    public bla jsd_4() {
        return this.khmf;
    }

    public static bhf_2 szf_3() {
        return new bhf_2();
    }

    private static String[] s4vqli06(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite chsbv0fttoz1t3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ shm5yquit0 ^ string.hashCode() ^ n2 + d6ylxek ^ i * -1344394539 ^ shm5yquit0, 8) ^ d6ylxek));
            }
            String[] stringArray = zn_2.s4vqli06(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

