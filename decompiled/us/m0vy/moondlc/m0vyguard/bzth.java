/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_332
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_332;
import us.m0vy.moondlc.m0vyguard.ghdh_3;

public class bzth
extends ghdh_3 {
    private final int ztsh;
    private final int rlm;
    private final float shshz;
    private static final int wg7dwjn = -1149497883;
    private static final int c5kg6bi0pysk = -1217833304;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ofm5ohs0ir;

    protected bzth(class_332 class_3322, int n, int n2, float f) {
        super(class_3322);
        this.ztsh = n;
        this.rlm = n2;
        this.shshz = f;
    }

    public static bzth of(class_332 class_3322, int n, int n2, float f) {
        return new bzth(class_3322, n, n2, f);
    }

    @Generated
    public int getMouseX() {
        return this.ztsh;
    }

    @Generated
    public int getMouseY() {
        return this.rlm;
    }

    @Generated
    public float getDelta() {
        block0: {
            int n = -1910218309;
            n = Integer.rotateLeft(n * 312644049, 4) ^ 0xD6F193FE;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x559C3AD2;
            if ((n2 ^ n) == 1436302034) break block0;
            int cfr_ignored_0 = (0xDBB85B69 ^ n) + 464705833;
        }
        return this.shshz;
    }

    private static String[] yhkdn44yqh0a9(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite dwy8izbovkl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ wg7dwjn ^ string.hashCode()) + (n2 + c5kg6bi0pysk) + i ^ wg7dwjn, 3) + c5kg6bi0pysk);
            }
            String[] stringArray = bzth.yhkdn44yqh0a9(new String(cArray));
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

