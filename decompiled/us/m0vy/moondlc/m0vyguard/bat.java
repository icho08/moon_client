/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_2960;
import us.m0vy.moondlc.m0vyguard.bza;

public class bat {
    public final class_2960 khdhb;
    private static final int hdjg7rmlf37lm = -1439690544;
    private static final int gje9ngkuske = 1216974954;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int cwp181tdkh4w;

    public bat(String string) {
        this.khdhb = bza.id(this.tthf(string));
    }

    public bat(class_2960 class_29602) {
        this.khdhb = class_2960.method_60655((String)class_29602.method_12836(), (String)class_29602.method_12832());
    }

    public String tthf(String string) {
        if (class_2960.method_20208((String)string)) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toLowerCase().toCharArray()) {
            if (!class_2960.method_29184((char)c)) continue;
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public class_2960 ghzf() {
        return this.khdhb;
    }

    private static String[] rui2b9269a4r(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite wwqoh55psi9(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ hdjg7rmlf37lm ^ string.hashCode()) + (n2 + gje9ngkuske) + i ^ hdjg7rmlf37lm, 14) + gje9ngkuske);
            }
            String[] stringArray = bat.rui2b9269a4r(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

