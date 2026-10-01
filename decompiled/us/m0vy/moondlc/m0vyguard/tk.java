/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_2960;

public final class tk {
    private static final class_2960 zha_4;
    private static class_2960 dhy_2;
    private static final int kguy0hjy0q8 = 14685828;
    private static final int bw3nh7fzpy7c = 356748223;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int q47el2yuvg3;

    private tk() {
    }

    public static class_2960 dhfy() {
        int n = 1031837713;
        int n2 = (n = Integer.rotateLeft(n * 205277663, 13) ^ 0x589BB8BC) ^ 0xC19EF32C;
        if ((n2 ^ n) != -1046547668) {
            int cfr_ignored_0 = (0xFC1E6B3D ^ n) + 1588161238;
        }
        return dhy_2 != null ? dhy_2 : zha_4;
    }

    public static void zlf_2(class_2960 class_29602) {
        int n = -415402394;
        n = Integer.rotateLeft(n * -1130186487, 22) ^ 0x983E63AB;
        class_2960 class_29603 = class_29602;
        n = Integer.rotateLeft((class_29603 != null ? System.identityHashCode(class_29603) : 0) ^ n, 25);
        int n2 = n ^ 0xF34ADDF9;
        if ((n2 ^ n) != -213197319) {
            int cfr_ignored_0 = (0x1477AB9F ^ n) + 2121214132;
        }
        dhy_2 = class_29602;
    }

    public static boolean dtz_8() {
        block0: {
            int n = 924197240;
            int n2 = (n = Integer.rotateLeft(n * 1485726617, 13) ^ 0xF5158548) ^ 0x335859BD;
            if ((n2 ^ n) == 861428157) break block0;
            int cfr_ignored_0 = (0x44E78C5 ^ n) + 494790242;
        }
        return true;
    }

    public static void shtb_2() {
        block0: {
            int n = -1629440435;
            int n2 = (n = Integer.rotateLeft(n * -1198683859, 4) ^ 0x3C7BD240) ^ 0xD9D4ECAA;
            if ((n2 ^ n) == -640357206) break block0;
            int cfr_ignored_0 = (0x47345AE7 ^ n) - -332680848;
        }
    }

    private static String[] u56kozzxryz(String string) {
        return string.split("\u0003\u001a", -1);
    }

    private static CallSite hmq1z7o7qqm3yb(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ kguy0hjy0q8 ^ string.hashCode() ^ n2 + bw3nh7fzpy7c ^ i * -449529273 ^ kguy0hjy0q8, 25) ^ bw3nh7fzpy7c));
            }
            String[] stringArray = tk.u56kozzxryz(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

