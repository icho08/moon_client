/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.bkhh;
import us.m0vy.moondlc.m0vyguard.qm;

public class bzh
extends qm {
    private static final int tnras9zydu = 1555051066;
    private static final int fsxx3rri6q2fd = -447578914;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int i596zn41fam;

    @Override
    public String getName() {
        return "XYZ";
    }

    public bzh() {
        super(30.0f, 120.0f);
    }

    @Override
    public String thkf() {
        String string = String.format("%.1f", bzh.mc.field_1724.method_23317());
        String string2 = String.format("%.1f", bzh.mc.field_1724.method_23318());
        String string3 = String.format("%.1f", bzh.mc.field_1724.method_23321());
        return string + ", " + string2 + ", " + string3;
    }

    @Override
    public bkhh agh() {
        return null;
    }

    private static String[] snh8rw3gaoz(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ejnxju23(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ tnras9zydu ^ string.hashCode() ^ n2 + fsxx3rri6q2fd ^ i * -1735034031 ^ tnras9zydu, 17) ^ fsxx3rri6q2fd));
            }
            String[] stringArray = bzh.snh8rw3gaoz(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

