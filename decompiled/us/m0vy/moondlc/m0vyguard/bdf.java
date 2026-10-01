/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Map;
import net.minecraft.class_2338;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.byw;
import us.m0vy.moondlc.m0vyguard.trh_2;
import us.m0vy.moondlc.m0vyguard.mj;

public final class bdf {
    private static final Map zka_2;
    private static final int wpqta9b7lg = 1597607440;
    private static final int u2uw2gg = -1836384498;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int zwnvm0dn;

    public static void btdh_2(class_4587 class_45872) {
        zka_2.forEach((arg_0, arg_1) -> bdf.haz_2(class_45872, arg_0, arg_1));
    }

    public static void bhm_2(class_2338 class_23382, Color color, int n, Color color2, byw byw2, trh_2 trh2_2, long l) {
        if (trh2_2 == trh_2.dht_3) {
            return;
        }
        zka_2.put(new mj(class_23382, color, n, color2, byw2, trh2_2, l), System.currentTimeMillis());
    }

    public static boolean shdz_2(class_2338 class_23382) {
        return zka_2.keySet().stream().anyMatch(arg_0 -> bdf.khal(class_23382, arg_0));
    }

    private static boolean khal(class_2338 class_23382, mj mj2) {
        return mj2.pos().equals((Object)class_23382);
    }

    private static void haz_2(class_4587 class_45872, mj mj2, Long l) {
        if (System.currentTimeMillis() - l > mj2.tlk) {
            zka_2.remove(mj2);
        } else {
            mj2.renderWithTime(System.currentTimeMillis() - l, class_45872);
        }
    }

    private static String[] ai5frf32(String string) {
        return string.split("\u0001\u001d", -1);
    }

    private static CallSite pe1yiv8lsfr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ wpqta9b7lg ^ string.hashCode() ^ n2 + u2uw2gg + i * -1439786625) + wpqta9b7lg) ^ u2uw2gg));
            }
            String[] stringArray = bdf.ai5frf32(new String(cArray));
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

