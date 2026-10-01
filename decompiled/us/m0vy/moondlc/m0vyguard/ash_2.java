/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.ttk;

public class ash_2
extends ttk {
    private final int shddh;
    private final int zmj;
    private final int baa;
    private static final int gcf9idl0 = 1157905497;
    private static final int am8719zki3 = -1708124395;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int oqn5ml8vfyc;

    @Generated
    public ash_2(int n, int n2, int n3) {
        this.shddh = n;
        this.zmj = n2;
        this.baa = n3;
    }

    @Generated
    public int khhdh_2() {
        block0: {
            int n = -1150065370;
            int n2 = (n = Integer.rotateLeft(n * 188018191, 4) ^ 0x16C03CA7) ^ 0xF40E7941;
            if ((n2 ^ n) == -200378047) break block0;
            int cfr_ignored_0 = (0x4F7D1C67 ^ n) + -538687502;
        }
        return this.shddh;
    }

    @Generated
    public int shqf() {
        block0: {
            int n = 1068371286;
            n = Integer.rotateLeft(n * 1514936191, 3) ^ 0x82706DD4;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
            int n2 = n ^ 0x757EDFA9;
            if ((n2 ^ n) == 1971249065) break block0;
            int cfr_ignored_0 = (0x4AD0D2FF ^ n) + -1623863455;
        }
        return this.zmj;
    }

    @Generated
    public int jjs_2() {
        block0: {
            int n = -1990698050;
            n = Integer.rotateLeft(n * -1578772507, 3) ^ 0x90F8A66C;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x66F35D2;
            if ((n2 ^ n) == 107951570) break block0;
            int cfr_ignored_0 = (0x8F376E6C ^ n) - 1195533222;
        }
        return this.baa;
    }

    private static String[] elkha44f(String string) {
        return string.split("\u0006\u0017", -1);
    }

    private static CallSite u1qa8tzw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ gcf9idl0 ^ string.hashCode()) + (n2 + am8719zki3) + i ^ gcf9idl0, 14) + am8719zki3);
            }
            String[] stringArray = ash_2.elkha44f(new String(cArray));
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

