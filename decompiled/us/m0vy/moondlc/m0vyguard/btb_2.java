/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1675
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1675;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import us.m0vy.moondlc.m0vyguard.tthy;

public final class btb_2
implements tthy {
    private static final int f4ud75n = -1068520700;
    private static final int m8vgr47r5ae = 1464543054;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int b6uz2yc7;

    private btb_2() {
    }

    public static class_3965 zaq_3(class_243 class_2432, class_243 class_2433, class_3959.class_3960 class_39602, class_1297 class_12972) {
        if (btb_2.mc.field_1687 == null) {
            return null;
        }
        return btb_2.mc.field_1687.method_17742(new class_3959(class_2432, class_2433, class_39602, class_3959.class_242.field_1348, class_12972));
    }

    public static class_3966 tza_7(double d, class_243 class_2432, Predicate predicate) {
        class_1297 class_12972 = btb_2.mc.field_1719;
        if (class_12972 == null) {
            return null;
        }
        class_243 class_2433 = class_12972.method_5836(1.0f);
        class_243 class_2434 = class_2433.method_1019(class_2432.method_1021(d));
        class_238 class_2383 = class_12972.method_5829().method_18804(class_2432.method_1021(d)).method_1009(1.0, 1.0, 1.0);
        return class_1675.method_18075((class_1297)class_12972, (class_243)class_2433, (class_243)class_2434, (class_238)class_2383, arg_0 -> btb_2.thks_2(predicate, arg_0), (double)(d * d));
    }

    public static boolean khtw(class_243 class_2432, double d, class_238 class_2383) {
        if (btb_2.mc.field_1724 == null) {
            return false;
        }
        class_243 class_2433 = btb_2.mc.field_1724.method_33571();
        return class_2383.method_1006(class_2433) || class_2383.method_992(class_2433, class_2433.method_1019(class_2432.method_1021(d))).isPresent();
    }

    private static boolean thks_2(Predicate predicate, class_1297 class_12972) {
        return !class_12972.method_7325() && predicate.test(class_12972);
    }

    private static String[] wzs5nyr75ofl(String string) {
        return string.split("\u0005\u0014", -1);
    }

    private static CallSite tlkyoc4gik0zx(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ f4ud75n ^ string.hashCode()) + (n2 + m8vgr47r5ae) + i ^ f4ud75n, 27) + m8vgr47r5ae);
            }
            String[] stringArray = btb_2.wzs5nyr75ofl(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
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

