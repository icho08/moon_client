/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.bshz_2;
import us.m0vy.moondlc.m0vyguard.bhj_2;

public class ttht_2
extends bshz_2 {
    private static final int yybl3cl5z = -1586098390;
    private static final int hupdb9jn3q25 = 1178927727;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int dq89nhzaim0;

    @Override
    protected void bws_2(bzth bzth2) {
        bzth2.drawRect(this.sdht_2, this.shat_2, this.zshl, this.zqkh, bhj_2.daw_4());
    }

    @Override
    public float jfn() {
        this.zqkh = 4.0f;
        return 4.0f;
    }

    private static String[] tc3xihbq(String string) {
        return string.split("\u0006\u0019", -1);
    }

    private static CallSite ll7m44675z128z(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ yybl3cl5z ^ string.hashCode()) + (n2 + hupdb9jn3q25) + i ^ yybl3cl5z, 17) + hupdb9jn3q25);
            }
            String[] stringArray = ttht_2.tc3xihbq(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

