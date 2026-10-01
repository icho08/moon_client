/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1297
 *  net.minecraft.class_1747
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.hsh_3;
import us.m0vy.moondlc.m0vyguard.tq_2;

@tq_2(name="Ignore Entity", category=bzw.OTHER, desc="Ignore player hitboxes when placing or tracing through them")
public class sm_2
extends bnq {
    private static final sm_2 thbt_2;
    private static final int ukdj8seoq = -1213646764;
    private static final int hsug4ic = -1958077474;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int k06tu4d8chwz;

    public boolean thz_7(class_1297 class_12972) {
        block0: {
            int n = -896467845;
            n = Integer.rotateLeft(n * 518880071, 7) ^ 0xF0F5DC82;
            class_1297 class_12973 = class_12972;
            n = Integer.rotateRight((class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n, 23);
            int n2 = n ^ 0xF5AF046;
            if ((n2 ^ n) == 257617990) break block0;
            int cfr_ignored_0 = (0xC5CA0C3D ^ n) + -2138245837;
        }
        return sm_2.slb_2(this, class_12972);
    }

    public boolean sskh(class_1297 class_12972) {
        return this.rgha_2() && class_12972 != null && this.hyw();
    }

    private boolean hyw() {
        if (sm_2.mc.field_1724 == null || sm_2.mc.field_1687 == null || sm_2.mc.field_1690 == null || !sm_2.mc.field_1690.field_1904.method_1434()) {
            return false;
        }
        return this.zja(sm_2.mc.field_1724.method_6047()) || this.zja(sm_2.mc.field_1724.method_6079());
    }

    private boolean zja(class_1799 class_17992) {
        return class_17992 != null && !class_17992.method_7960() && (class_17992.method_7909() instanceof class_1747 || class_17992.method_31574(class_1802.field_8301) || class_17992.method_31574(class_1802.field_8705) || class_17992.method_31574(class_1802.field_8187));
    }

    @Generated
    public static sm_2 zjh_2() {
        block0: {
            int n = 1436945660;
            int n2 = (n = Integer.rotateLeft(n * -1150248477, 18) ^ 0x41D047A9) ^ 0xCCC04C51;
            if ((n2 ^ n) == -859812783) break block0;
            int cfr_ignored_0 = (0x996640AD ^ n) + 1945075963;
        }
        return thbt_2;
    }

    private static boolean slb_2(sm_2 sm2, class_1297 class_12972) {
        block0: {
            int n = hsh_3.rqsh(-937742002);
            class_1297 class_12973 = class_12972;
            n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
            int n2 = n ^ 0x64265FA3;
            if ((n2 ^ n) == 1680236451) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xAC3D6EED ^ n, 8) - -540144146;
            int cfr_ignored_1 = (int)(0x6E8FC0D027D4EB4FL ^ (long)n ^ 0x7CD0831A2DB970CEL);
        }
        return sm2.sskh(class_12972);
    }

    private static String[] z8mz4skz(String string) {
        return string.split("\u0007\u0010", -1);
    }

    private static CallSite gi6k2jjf0tm1c3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ukdj8seoq ^ string.hashCode() ^ n2 + hsug4ic + i * -1956708637) + ukdj8seoq) ^ hsug4ic));
            }
            String[] stringArray = sm_2.z8mz4skz(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

