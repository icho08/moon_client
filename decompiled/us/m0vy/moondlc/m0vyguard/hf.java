/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_2960
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_2960;
import us.m0vy.moondlc.m0vyguard.bza;

public class hf {
    private final class_2960 jmw;
    private static final int vr6dsqekvd = -1297814327;
    private static final int xpwhcvy0s9 = 789403485;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int o65y42yu6tt;

    public hf(String string) {
        this.jmw = string.contains(":") ? class_2960.method_60654((String)string) : (string.contains("/") ? bza.id(string) : bza.id("icons/category/" + string));
    }

    @Generated
    public class_2960 tdhl_2() {
        return this.jmw;
    }

    private static String[] lp7du6dpko(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite yoz8spw05t(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ vr6dsqekvd ^ string.hashCode()) + (n2 + xpwhcvy0s9) + i ^ vr6dsqekvd, 15) + xpwhcvy0s9);
            }
            String[] stringArray = hf.lp7du6dpko(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

