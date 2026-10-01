/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.protection.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import us.m0vy.moondlc.m0vyguard.nk;
import us.m0vy.moondlc.m0vyguard.ht_4;
import us.movy.moondlc.Moondlc;

public class MinecraftClientMixinProtection {
    private static final int yp47r5zn2i7vo = 1667061810;
    private static final int i8s3240 = -1522457178;
    private static final String PPPPPPPPPPPPPPPPPPPPPPPPPP = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int y9vaqof6;

    public static void init() {
        int n = 190101563;
        int n2 = (n = Integer.rotateLeft(n * -1611137291, 28) ^ 0xD38DBB9E) ^ 0x46D2D240;
        if ((n2 ^ n) != 1188221504) {
            int cfr_ignored_0 = (0x4D866A7B ^ n) - -1095472469;
        }
        ht_4.shzh_3();
        Moondlc.INSTANCE.initialize();
    }

    public static void shutdown() {
        int n = -1331598341;
        int n2 = (n = Integer.rotateLeft(n * -1494693029, 21) ^ 0x4B5F22E1) ^ 0x7261DC43;
        if ((n2 ^ n) != 1919016003) {
            int cfr_ignored_0 = (0xC2C0B7B8 ^ n) + -437786800;
        }
        MinecraftClientMixinProtection.uj7w77lg4zs2(Moondlc.INSTANCE);
    }

    public static void updateTitle(CallbackInfoReturnable callbackInfoReturnable) {
        if (!Moondlc.INSTANCE.isPanic()) {
            callbackInfoReturnable.setReturnValue((Object)nk.azj());
        }
    }

    private static void uj7w77lg4zs2(Moondlc moondlc) {
        int n = 1231577091;
        int n2 = (n = Integer.rotateLeft(n * 134827909, 9) ^ 0x68DA8FBB) ^ 0xEE27F1FD;
        if ((n2 ^ n) != -299372035) {
            int cfr_ignored_0 = (0xA74F91FE ^ n) - -1085045744;
        }
        moondlc.shutdown();
    }

    private static String[] qyjapyrlss(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite pl1vn3u7tozdh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ yp47r5zn2i7vo ^ string.hashCode() ^ n2 + i8s3240 + i * -171720131) + yp47r5zn2i7vo) ^ i8s3240));
            }
            String[] stringArray = MinecraftClientMixinProtection.qyjapyrlss(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void PPPPPPPPPPPPPPPPPPPPPPPPPP() {
    }
}

