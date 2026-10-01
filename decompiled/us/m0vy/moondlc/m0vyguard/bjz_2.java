/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.function.Predicate;
import us.m0vy.moondlc.m0vyguard.bbd_2;
import us.m0vy.moondlc.m0vyguard.s_3;

public class bjz_2
extends s_3 {
    private final Predicate dmk;
    private static final int ws5zket0uqj = 5946183;
    private static final int fi75m13pq079 = 486027608;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int fx6lo865ax7do;

    public bjz_2(bbd_2 bbd2, String string, Predicate predicate) {
        super(bbd2, string);
        this.dmk = predicate;
    }

    public bjz_2(bbd_2 bbd2, String string, String string2, Predicate predicate) {
        super(bbd2, string, string2);
        this.dmk = predicate;
    }

    public boolean thrh_2(Object object) {
        return this.dmk.test(object) && this.alh();
    }

    private static String[] u18yal0e(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite dc3eg30ipb1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ws5zket0uqj ^ string.hashCode()) + (n2 + fi75m13pq079) + i ^ ws5zket0uqj, 18) + fi75m13pq079);
            }
            String[] stringArray = bjz_2.u18yal0e(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

