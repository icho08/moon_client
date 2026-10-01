/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.baa;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.bzth;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.movy.moondlc.Moondlc;

public class tkhz_2
implements tthy {
    private final bql<bbgh> sdl = tkhz_2::rsd;
    private static final int zi768jnfq6nq = 1266041835;
    private static final int hgnlw6g = 1601013009;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int l0vv0wjwt5g;

    public tkhz_2() {
        Moondlc.getInstance().getEventManager().sdz_4(this);
    }

    private static void rsd(bbgh bbgh2) {
        baa baa2 = Moondlc.getInstance().getMenuScreen();
        if (baa2 != null) {
            baa2.getMenuAnimation().khmf(baa2.isClosing() ? 0.0f : 1.0f);
            if (baa2.isClosing() && !(tkhz_2.mc.field_1755 instanceof baa)) {
                if (baa2.getMenuAnimation().tssh_2() > 0.01f) {
                    bzth bzth2 = bzth.of(bbgh2.dtn(), -1, -1, mc.method_61966().method_60637(false));
                    baa2.render(bzth2);
                } else {
                    baa2.finishCloseAnimation();
                }
            }
        }
    }

    private static String[] v4636kstgyk(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite gqyiodr20up(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ zi768jnfq6nq ^ string.hashCode() ^ n2 + hgnlw6g + i * -998241891) + zi768jnfq6nq) ^ hgnlw6g));
            }
            String[] stringArray = tkhz_2.v4636kstgyk(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

