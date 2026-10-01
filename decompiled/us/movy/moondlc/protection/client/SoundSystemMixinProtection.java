/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1113
 *  net.minecraft.class_2960
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.protection.client;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1113;
import net.minecraft.class_2960;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.bay;
import us.m0vy.moondlc.m0vyguard.bqs;
import us.m0vy.moondlc.m0vyguard.sk;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.zd_4;
import us.movy.moondlc.Moondlc;

public class SoundSystemMixinProtection {
    private static final int ae8psoihku8d = -726858127;
    private static final int gn4305hvl268 = -300971623;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int vfwohx3uephr;

    public static void playSound(class_1113 class_11132, CallbackInfo callbackInfo) {
        sk sk2;
        int n = 1728586490;
        n = Integer.rotateLeft(n * -1046003131, 26) ^ 0x827F17CB;
        class_1113 class_11133 = class_11132;
        n = Integer.rotateLeft((class_11133 != null ? System.identityHashCode(class_11133) : 0) ^ n, 18);
        int n2 = n ^ 0x3012CDC5;
        if ((n2 ^ n) != 806538693) {
            int cfr_ignored_0 = (0x571AEF3F ^ n) + -1533648676;
        }
        if ((sk2 = (sk)SoundSystemMixinProtection.q36d6vijhsyeit(Moondlc.getInstance()).dfr_2(sk.class)).rgha_2() && SoundSystemMixinProtection.nm7f8vt1n6(SoundSystemMixinProtection.r5crhve2eo(sk2)) && (class_11132.method_4775().equals((Object)SoundSystemMixinProtection.q4d6z14imgk9w(class_3417.field_14703)) || class_11132.method_4775().equals((Object)class_3417.field_15045.comp_3319()) || class_11132.method_4775().equals((Object)class_3417.field_14891.comp_3319()) || class_11132.method_4775().equals((Object)SoundSystemMixinProtection.xh8wm3ms9xok4(class_3417.field_19344)))) {
            callbackInfo.cancel();
        }
        if (sk2.rgha_2() && SoundSystemMixinProtection.hcm131mvz(sk2).alh() && (SoundSystemMixinProtection.pl5noki9ikeqe(class_11132.method_4775(), class_3417.field_14946.comp_3319()) || class_11132.method_4775().equals((Object)SoundSystemMixinProtection.zpzt0azg43qwizw(class_3417.field_15020)) || SoundSystemMixinProtection.qhsx4u34iol8nxj(class_11132.method_4775(), class_3417.field_14865.comp_3319()))) {
            callbackInfo.cancel();
        }
        if (sk2.rgha_2() && sk2.ash_2().alh() && (class_11132.method_4775().equals((Object)SoundSystemMixinProtection.gss2jnca98(class_3417.field_14957)) || SoundSystemMixinProtection.uouhgx0j2abf(class_11132.method_4775(), class_3417.field_14813.comp_3319()) || class_11132.method_4775().equals((Object)class_3417.field_14729.comp_3319()) || class_11132.method_4775().equals((Object)SoundSystemMixinProtection.v0qt17z4ogkcq3v(class_3417.field_14869)) || class_11132.method_4775().equals((Object)class_3417.field_14974.comp_3319()) || SoundSystemMixinProtection.u2lnp1c54ehr9yw(class_11132.method_4775(), class_3417.field_15149.comp_3319()) || SoundSystemMixinProtection.kxckhq0x(class_11132.method_4775(), SoundSystemMixinProtection.pfj2bufvl2(class_3417.field_15238)))) {
            SoundSystemMixinProtection.zt4z84adlrp(callbackInfo);
        }
        Moondlc.getInstance().getEventManager().azj_2(new bay(class_11132));
    }

    private static bqs q36d6vijhsyeit(Moondlc moondlc) {
        block0: {
            int n = zd_4.rdq(-974690707);
            Moondlc moondlc2 = moondlc;
            n = (moondlc2 != null ? System.identityHashCode(moondlc2) : 0) ^ n;
            int n2 = n ^ 0x20712763;
            if ((n2 ^ n) == 544286563) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xE596410E ^ n, 15) - -779124755;
        }
        return moondlc.getModuleManager();
    }

    private static s_3 r5crhve2eo(sk sk2) {
        block0: {
            int n = 607562961;
            int n2 = (n = Integer.rotateLeft(n * 533892251, 21) ^ 0x6C3076D4) ^ 0xD7A770DB;
            if ((n2 ^ n) == -676892453) break block0;
            int cfr_ignored_0 = (0xF391DC0A ^ n) + 2017228418;
        }
        return sk2.jw();
    }

    private static boolean nm7f8vt1n6(s_3 s2) {
        block0: {
            int n = zd_4.rdq(-1198648796);
            s_3 s3 = s2;
            n = (s3 != null ? System.identityHashCode(s3) : 0) ^ n;
            int n2 = n ^ 0x2D0769DE;
            if ((n2 ^ n) == 755460574) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x95897BFA ^ n, 5) + 537109121) * -1786151941;
        }
        return s2.alh();
    }

    private static class_2960 q4d6z14imgk9w(class_3414 class_34142) {
        block0: {
            int n = zd_4.rdq(-450410747);
            int n2 = n ^ 0x125D477F;
            if ((n2 ^ n) == 308103039) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xF77A007A ^ n, 17) + -64770559) * -142999429;
        }
        return class_34142.comp_3319();
    }

    private static class_2960 xh8wm3ms9xok4(class_3414 class_34142) {
        block0: {
            int n = zd_4.rdq(-1536633508);
            class_3414 class_34143 = class_34142;
            n = (class_34143 != null ? System.identityHashCode(class_34143) : 0) ^ n;
            int n2 = n ^ 0x61FFF97C;
            if ((n2 ^ n) == 1644165500) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xC5972C20 ^ n, 11) + -240388325;
        }
        return class_34142.comp_3319();
    }

    private static s_3 hcm131mvz(sk sk2) {
        block0: {
            int n = zd_4.rdq(1172153779);
            int n2 = n ^ 0x8C77EBF5;
            if ((n2 ^ n) == -1938297867) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xC9AA4E46 ^ n, 12) - 1878858165;
        }
        return sk2.hbgh();
    }

    private static boolean pl5noki9ikeqe(class_2960 class_29602, Object object) {
        block0: {
            int n = 1165346238;
            n = Integer.rotateLeft(n * -1795698659, 27) ^ 0x68038693;
            Object object2 = object;
            n = (object2 != null ? System.identityHashCode(object2) : 0) ^ n;
            int n2 = n ^ 0x684BAEF3;
            if ((n2 ^ n) == 1749790451) break block0;
            int cfr_ignored_0 = (0x2D3E6B4D ^ n) - 1194805678;
        }
        return class_29602.equals(object);
    }

    private static class_2960 zpzt0azg43qwizw(class_3414 class_34142) {
        block0: {
            int n = -276240468;
            int n2 = (n = Integer.rotateLeft(n * -748760117, 3) ^ 0x2BC3D925) ^ 0x604FB56;
            if ((n2 ^ n) == 100989782) break block0;
            int cfr_ignored_0 = (0xE98C1CFA ^ n) + 208573977;
        }
        return class_34142.comp_3319();
    }

    private static boolean qhsx4u34iol8nxj(class_2960 class_29602, Object object) {
        block0: {
            int n = 2129615712;
            n = Integer.rotateLeft(n * -1827960639, 6) ^ 0x8150CACB;
            Object object2 = object;
            n = (object2 != null ? System.identityHashCode(object2) : 0) ^ n;
            int n2 = n ^ 0x797ADB1A;
            if ((n2 ^ n) == 2038094618) break block0;
            int cfr_ignored_0 = (0x795807A ^ n) - 6598687;
        }
        return class_29602.equals(object);
    }

    private static class_2960 gss2jnca98(class_3414 class_34142) {
        block0: {
            int n = -1927874448;
            n = Integer.rotateLeft(n * 1388182273, 18) ^ 0x8C1FBBD7;
            class_3414 class_34143 = class_34142;
            n = Integer.rotateLeft((class_34143 != null ? System.identityHashCode(class_34143) : 0) ^ n, 26);
            int n2 = n ^ 0xF05E204;
            if ((n2 ^ n) == 252043780) break block0;
            int cfr_ignored_0 = (0x82131A74 ^ n) + -497895386;
        }
        return class_34142.comp_3319();
    }

    private static boolean uouhgx0j2abf(class_2960 class_29602, Object object) {
        block0: {
            int n = zd_4.rdq(662311608);
            int n2 = n ^ 0x762E7ECC;
            if ((n2 ^ n) == 1982758604) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x51546C74 ^ n, 13) - -577322681) * 1364487285;
        }
        return class_29602.equals(object);
    }

    private static class_2960 v0qt17z4ogkcq3v(class_3414 class_34142) {
        block0: {
            int n = -1291648594;
            n = Integer.rotateLeft(n * 2005763547, 16) ^ 0xBBF2D323;
            class_3414 class_34143 = class_34142;
            n = Integer.rotateLeft((class_34143 != null ? System.identityHashCode(class_34143) : 0) ^ n, 14);
            int n2 = n ^ 0x190AB269;
            if ((n2 ^ n) == 420131433) break block0;
            int cfr_ignored_0 = (0xAA09B3C7 ^ n) + 785955656;
        }
        return class_34142.comp_3319();
    }

    private static boolean u2lnp1c54ehr9yw(class_2960 class_29602, Object object) {
        block0: {
            int n = zd_4.rdq(1961052190);
            class_2960 class_29603 = class_29602;
            n = Integer.rotateRight((class_29603 != null ? System.identityHashCode(class_29603) : 0) ^ n, 21);
            int n2 = n ^ 0xC35F696D;
            if ((n2 ^ n) == -1017157267) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xB7BC2173 ^ n, 9) + 1143319592) * -1212407437;
        }
        return class_29602.equals(object);
    }

    private static class_2960 pfj2bufvl2(class_3414 class_34142) {
        block0: {
            int n = -1143785961;
            int n2 = (n = Integer.rotateLeft(n * 151471907, 13) ^ 0xCE45CD91) ^ 0x14940EA;
            if ((n2 ^ n) == 21577962) break block0;
            int cfr_ignored_0 = (0xBA9A76FD ^ n) + 721289410;
        }
        return class_34142.comp_3319();
    }

    private static boolean kxckhq0x(class_2960 class_29602, Object object) {
        block0: {
            int n = -230345328;
            n = Integer.rotateLeft(n * 1024369969, 27) ^ 0x666CE207;
            Object object2 = object;
            n = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 25);
            int n2 = n ^ 0xE9F62FBD;
            if ((n2 ^ n) == -369741891) break block0;
            int cfr_ignored_0 = (0x1BB31A2D ^ n) + -1886783641;
        }
        return class_29602.equals(object);
    }

    private static void zt4z84adlrp(CallbackInfo callbackInfo) {
        int n = 23890499;
        n = Integer.rotateLeft(n * -1501062239, 22) ^ 0x708EF13;
        CallbackInfo callbackInfo2 = callbackInfo;
        n = (callbackInfo2 != null ? System.identityHashCode(callbackInfo2) : 0) ^ n;
        int n2 = n ^ 0x3B198DE4;
        if ((n2 ^ n) != 991530468) {
            int cfr_ignored_0 = (0x3A7507A7 ^ n) + 551725028;
        }
        callbackInfo.cancel();
    }

    private static String[] ri5mqi35ku29(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite km5wjcif9eun1z(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ae8psoihku8d ^ string.hashCode() ^ n2 + gn4305hvl268 + i * -889447953) + ae8psoihku8d) ^ gn4305hvl268));
            }
            String[] stringArray = SoundSystemMixinProtection.ri5mqi35ku29(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

