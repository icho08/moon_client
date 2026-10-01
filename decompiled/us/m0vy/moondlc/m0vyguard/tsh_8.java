/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_304
 *  net.minecraft.class_3675
 *  net.minecraft.class_3675$class_306
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_304;
import net.minecraft.class_3675;
import us.m0vy.moondlc.m0vyguard.tdha;

public final class tsh_8
implements tdha {
    private static final int ckdd00uxzh6y = 1264539314;
    private static final int wiodtupx78 = 308400727;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int i3caaducsgf9;

    private tsh_8() {
    }

    public static void rghq() {
        if (mc == null || tsh_8.mc.field_1755 == null) {
            return;
        }
        long l = mc.method_22683().method_4490();
        tsh_8.sjkh(tsh_8.mc.field_1690.field_1894, l);
        tsh_8.sjkh(tsh_8.mc.field_1690.field_1881, l);
        tsh_8.sjkh(tsh_8.mc.field_1690.field_1913, l);
        tsh_8.sjkh(tsh_8.mc.field_1690.field_1849, l);
        tsh_8.sjkh(tsh_8.mc.field_1690.field_1903, l);
        tsh_8.sjkh(tsh_8.mc.field_1690.field_1832, l);
        tsh_8.sjkh(tsh_8.mc.field_1690.field_1867, l);
    }

    private static void sjkh(class_304 class_3042, long l) {
        class_3675.class_306 class_3062 = class_3042.method_1429();
        class_3042.method_23481(class_3675.method_15987((long)l, (int)class_3062.method_1444()));
    }

    private static String[] kfcybt27uk2(String string) {
        return string.split("\u0001\u0017", -1);
    }

    private static CallSite k33u1rrgnpp(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ckdd00uxzh6y ^ string.hashCode() ^ n2 + wiodtupx78 ^ i * -1021277477 ^ ckdd00uxzh6y, 7) ^ wiodtupx78));
            }
            String[] stringArray = tsh_8.kfcybt27uk2(new String(cArray));
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

