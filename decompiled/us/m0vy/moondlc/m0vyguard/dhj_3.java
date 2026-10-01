/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_9449
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_9449;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tra;
import us.m0vy.moondlc.m0vyguard.ghh_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class dhj_3
implements tthy {
    private final bql<ghh_2> dsh_4 = dhj_3::shmdh;
    private static final int ssh_5 = 400588825;
    private static final int shsh_6 = 379480554;
    private static final int f6plu5d0m7 = 1883644158;
    private static final int ll9xue3dz9 = 1676816136;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int drq6n5xa4hb;

    public dhj_3() {
        Moondlc.getInstance().getEventManager().sdz_4(this);
    }

    private static void shmdh(ghh_2 ghh2) {
        Object object;
        int n = 1301928035;
        n = Integer.rotateLeft(n * 2100488595, 28) ^ 0xAC49C68D;
        ghh_2 ghh3 = ghh2;
        n = Integer.rotateRight((ghh3 != null ? System.identityHashCode(ghh3) : 0) ^ n, 27);
        int n2 = n ^ 0x236FCEE2;
        if ((n2 ^ n) != 594530018) {
            int cfr_ignored_0 = (0x6EF61681 ^ n) - -856697124;
        }
        if ((object = ghh2.zjd()) instanceof class_9449) {
            class_9449 class_94492 = (class_9449)object;
            if (dhj_3.mc.field_1724 == null) {
                return;
            }
            object = class_94492.comp_2532();
            if (((String)object).startsWith("ah me")) {
                dhj_3.mc.field_1724.field_3944.method_45729("/ah " + dhj_3.mc.field_1724.method_5477().getString());
                ghh2.dhtd_2();
            }
            if (((String)object).startsWith("ah sell ")) {
                String string = ((String)object).replaceFirst("ah sell ", "");
                String string2 = tra.dar_3(string);
                dhj_3.mc.field_1724.field_3944.method_45729("/ah sell " + Math.round(Float.parseFloat(string2)));
                ghh2.dhtd_2();
            }
        }
    }

    private static String adha_2(String string, int n, int n2, int n3) {
        try {
            int n4 = -26224219;
            n4 = Integer.rotateLeft(n4 * -1370120095, 12) ^ 0x93DB8E2D;
            int n5 = n4 ^ 0x65C99FB9;
            if ((n5 ^ n4) != 1707712441) {
                int cfr_ignored_0 = (0x9BA6461C ^ n4) + 1761162340;
            }
            if ((0x1ED & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x79287761 ^ n2 - i) + shsh_6, 27) ^ ssh_5 + i * 1446396211));
        }
        return new String(cArray);
    }

    private static String[] w5l1vvz4hg47(String string) {
        return string.split("\u0002\u001a", -1);
    }

    private static CallSite u4zw5c24o(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ f6plu5d0m7 ^ string.hashCode() ^ n2 + ll9xue3dz9 + i * -1166397167) + f6plu5d0m7) ^ ll9xue3dz9));
            }
            String[] stringArray = dhj_3.w5l1vvz4hg47(new String(cArray));
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

