/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_437
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_310;
import net.minecraft.class_437;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tkhd;
import us.m0vy.moondlc.m0vyguard.dd;
import us.m0vy.moondlc.m0vyguard.tq_2;

@tq_2(name="Modern ClickGUI", category=bzw.OTHER, desc="Modern clean user interface for managing modules and configs")
public class da_2
extends bnq {
    public static da_2 hhs_4;
    private static final int rah06958s = 123677633;
    private static final int ye66iye = 2098979697;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int d1hfkinjh4;

    public da_2() {
        hhs_4 = this;
    }

    @Override
    public void nt() {
        int n = dd.ts_2(1094030062);
        int n2 = n ^ 0x23EBC853;
        if ((n2 ^ n) != 602654803) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x62DE5ABD ^ n, 15) - -45442018) * 1658739389;
            int cfr_ignored_1 = (int)(0xA06CF48027D4EB4FL ^ (long)n ^ 0x1470831A2DB8ED08L);
        }
        da_2.dfs_4(mc, new tkhd());
    }

    private static void dfs_4(class_310 class_3102, class_437 class_4372) {
        int n = 58258788;
        n = Integer.rotateLeft(n * -1588667241, 5) ^ 0xA7005023;
        class_310 class_3103 = class_3102;
        n = Integer.rotateLeft((class_3103 != null ? System.identityHashCode(class_3103) : 0) ^ n, 29);
        class_437 class_4373 = class_4372;
        n = Integer.rotateRight((class_4373 != null ? System.identityHashCode(class_4373) : 0) ^ n, 8);
        int n2 = n ^ 0xE7F8CD96;
        if ((n2 ^ n) != -403124842) {
            int cfr_ignored_0 = (0xE48038F2 ^ n) + -125757408;
        }
        class_3102.method_1507(class_4372);
    }

    private static String[] utmjic1rix(String string) {
        return string.split("\u0001\u001a", -1);
    }

    private static CallSite vnnpgt7u(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ rah06958s ^ string.hashCode() ^ n2 + ye66iye + i * -597310879) + rah06958s) ^ ye66iye));
            }
            String[] stringArray = da_2.utmjic1rix(new String(cArray));
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

