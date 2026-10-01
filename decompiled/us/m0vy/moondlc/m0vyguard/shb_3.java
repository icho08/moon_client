/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.runtime.ObjectMethods;
import us.m0vy.moondlc.m0vyguard.bzn;
import us.m0vy.moondlc.m0vyguard.t_3;

public final class shb_3
extends Record {
    private final String ddhr;
    private final boolean hww;
    private final boolean bthf;
    private final t_3 dthh;
    private static final int pzne0svq03 = -1197658774;
    private static final int gims1sz = -1113041277;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int y0uxgvm4w6kb7v;

    public shb_3(String string, boolean bl, boolean bl2, t_3 t2) {
        this.ddhr = string;
        this.hww = bl;
        this.bthf = bl2;
        this.dthh = t2;
    }

    @Override
    public final String toString() {
        block0: {
            int n = bzn.tdth_4(1790750703);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 4);
            int n2 = n ^ 0xC15CAF9C;
            if ((n2 ^ n) == -1050890340) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xABE00073 ^ n, 8) + -729961176) * -1411383181;
        }
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{shb_3.class, "name;required;vararg;validator", "دذر", "حوو", "بثف", "دثح"}, this);
    }

    @Override
    public final int hashCode() {
        block0: {
            int n = -1467661452;
            int n2 = (n = Integer.rotateLeft(n * -1072529233, 7) ^ 0x84F1E896) ^ 0xCDDC5986;
            if ((n2 ^ n) == -841197178) break block0;
            int cfr_ignored_0 = (0x65591AF2 ^ n) + -1873016297;
        }
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{shb_3.class, "name;required;vararg;validator", "دذر", "حوو", "بثف", "دثح"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        block0: {
            int n = -425146354;
            n = Integer.rotateLeft(n * 2114894269, 6) ^ 0xFDF33EF0;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 15);
            Object object2 = object;
            n = (object2 != null ? System.identityHashCode(object2) : 0) ^ n;
            int n2 = n ^ 0x2FA21305;
            if ((n2 ^ n) == 799150853) break block0;
            int cfr_ignored_0 = (0xC90ADB0B ^ n) - -801674854;
        }
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{shb_3.class, "name;required;vararg;validator", "دذر", "حوو", "بثف", "دثح"}, this, object);
    }

    public String name() {
        block0: {
            int n = -1926568907;
            n = Integer.rotateLeft(n * 4319669, 19) ^ 0x7F9ACED8;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xAB569EB4;
            if ((n2 ^ n) == -1420386636) break block0;
            int cfr_ignored_0 = (0x267C7A81 ^ n) - -745183686;
        }
        return this.ddhr;
    }

    public boolean required() {
        block0: {
            int n = 295576981;
            n = Integer.rotateLeft(n * 1206484419, 5) ^ 0x29FC39BC;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0xF145BC49;
            if ((n2 ^ n) == -247088055) break block0;
            int cfr_ignored_0 = (0xE0DB99DC ^ n) + -2082700391;
        }
        return this.hww;
    }

    public boolean vararg() {
        block0: {
            int n = bzn.tdth_4(-1323919603);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
            int n2 = n ^ 0xDB5FA794;
            if ((n2 ^ n) == -614488172) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x6A493099 ^ n, 16) + -482704958) * 1783181465;
            int cfr_ignored_1 = (int)(0xA8FB9EA427D4EB4FL ^ (long)n ^ 0xC038831A2DB8FC26L);
        }
        return this.bthf;
    }

    public t_3 validator() {
        block0: {
            int n = bzn.tdth_4(320591753);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xA09A89B3;
            if ((n2 ^ n) == -1600484941) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xB3815E3A ^ n, 9) + -1056438207) * -1283367365;
        }
        return this.dthh;
    }

    private static String[] vxqi59517jkj11(String string) {
        return string.split("\b\u000f", -1);
    }

    private static CallSite rpm43u16pfr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ pzne0svq03 ^ string.hashCode() ^ n2 + gims1sz ^ i * -1087642929 ^ pzne0svq03, 15) ^ gims1sz));
            }
            String[] stringArray = shb_3.vxqi59517jkj11(new String(cArray));
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

