/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_437
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_437;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tkhd;
import us.m0vy.moondlc.m0vyguard.tq_2;

@tq_2(name="Click GUI", category=bzw.OTHER, key=344, desc="Opens the modern client settings interface")
public class dha_6
extends bnq {
    private static final dha_6 rtf_2;
    private static final int tv1hjdd63ay = -140221272;
    private static final int mlzxqp1zvu = 600433342;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int q4z8dfi8jh19j;

    @Override
    public void nt() {
        if (dha_6.mc.field_1755 != null) {
            return;
        }
        mc.method_1507((class_437)new tkhd());
        this.tba(false);
    }

    @Generated
    public static dha_6 tkq_2() {
        return rtf_2;
    }

    private static String[] mxtuxz0ri9m(String string) {
        return string.split("\u0006\u0018", -1);
    }

    private static CallSite d8z4ixyzv789v0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ tv1hjdd63ay ^ string.hashCode()) + (n2 + mlzxqp1zvu) + i ^ tv1hjdd63ay, 12) + mlzxqp1zvu);
            }
            String[] stringArray = dha_6.mxtuxz0ri9m(new String(cArray));
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

