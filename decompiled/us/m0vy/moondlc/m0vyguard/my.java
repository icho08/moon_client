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
import us.m0vy.moondlc.m0vyguard.bfdh;
import us.m0vy.moondlc.m0vyguard.bnsh;
import us.m0vy.moondlc.m0vyguard.lb;

public class my {
    private final lb shff;
    private final bnsh ty;
    private final float btht_2;
    private final float bha_4;
    private final float jhgh;
    private final int dhrq;
    private static final int tr6eqs0 = 526388979;
    private static final int jmflm48 = -1179244939;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int n2r0xhxv;

    public my(lb lb2, bnsh bnsh2, float f, float f2, float f3, int n) {
        this.shff = lb2;
        this.ty = bnsh2;
        this.btht_2 = f;
        this.bha_4 = f2;
        this.dhrq = n;
        this.jhgh = f3;
    }

    public my(lb lb2, float f, float f2, long l, int n) {
        this(lb2, bnsh.sta, f, f2, l, n);
    }

    @Generated
    public lb shdhn() {
        block0: {
            int n = 27371827;
            n = Integer.rotateLeft(n * -1988551827, 13) ^ 0x4D1DAEA0;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xB98F38E4;
            if ((n2 ^ n) == -1181796124) break block0;
            int cfr_ignored_0 = (0xB82E91D7 ^ n) + -1032323795;
        }
        return this.shff;
    }

    @Generated
    public bnsh dhthd() {
        block0: {
            int n = -85332604;
            int n2 = (n = Integer.rotateLeft(n * 384253889, 5) ^ 0x929417DE) ^ 0x130817E;
            if ((n2 ^ n) == 19956094) break block0;
            int cfr_ignored_0 = (0xFBD96CFA ^ n) - -227170026;
        }
        return this.ty;
    }

    @Generated
    public float bfy() {
        block0: {
            int n = 459247781;
            int n2 = (n = Integer.rotateLeft(n * -1916263619, 5) ^ 0xBF30BD7F) ^ 0x24873D7C;
            if ((n2 ^ n) == 612842876) break block0;
            int cfr_ignored_0 = (0x3FD8ADD9 ^ n) + 2046608375;
        }
        return this.btht_2;
    }

    @Generated
    public float dzkh_4() {
        block0: {
            int n = bfdh.shsd(450731885);
            int n2 = n ^ 0x7A5D8AE5;
            if ((n2 ^ n) == 2052950757) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x60801588 ^ n, 15) + -1277150541;
        }
        return this.bha_4;
    }

    @Generated
    public float shsy() {
        block0: {
            int n = 946939622;
            n = Integer.rotateLeft(n * 1142791213, 12) ^ 0x4607676D;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x2B3276A6;
            if ((n2 ^ n) == 724727462) break block0;
            int cfr_ignored_0 = (0x13435040 ^ n) + 1938011721;
        }
        return this.jhgh;
    }

    @Generated
    public int hgh_2() {
        block0: {
            int n = -281205994;
            n = Integer.rotateLeft(n * -1523532541, 19) ^ 0x9C9A05DE;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xBC5CAD29;
            if ((n2 ^ n) == -1134777047) break block0;
            int cfr_ignored_0 = (0x53618E3F ^ n) - 327243386;
        }
        return this.dhrq;
    }

    private static String[] cc79aj83h(String string) {
        return string.split("\u0001\u0013", -1);
    }

    private static CallSite fibc2v08p(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ tr6eqs0 ^ string.hashCode() ^ n2 + jmflm48 ^ i * 813016229 ^ tr6eqs0, 3) ^ jmflm48));
            }
            String[] stringArray = my.cc79aj83h(new String(cArray));
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

