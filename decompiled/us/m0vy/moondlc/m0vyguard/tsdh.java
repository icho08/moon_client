/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bkhh;
import us.m0vy.moondlc.m0vyguard.qm;
import us.m0vy.moondlc.m0vyguard.ngh;

public class tsdh
extends qm {
    private float dhtd_3;
    private static final int fdk0jjw60a = 382274603;
    private static final int q1n329v6ry = 609668445;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int hk5jcxkioxd2c;

    @Override
    public String getName() {
        return "FPS";
    }

    public tsdh() {
        super(50.0f, 100.0f);
    }

    @Override
    public String thkf() {
        this.dhtd_3 = ngh.dmy_2((int)this.dhtd_3, mc.method_47599(), 0.2f);
        return String.valueOf((int)this.dhtd_3);
    }

    @Override
    public void lh(class_4587 class_45872) {
        super.lh(class_45872);
    }

    @Override
    public bkhh agh() {
        return null;
    }

    private static String[] xl1a5581efe7(String string) {
        return string.split("\b\u001c", -1);
    }

    private static CallSite horiuytq1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ fdk0jjw60a ^ string.hashCode() ^ n2 + q1n329v6ry ^ i * 932451657 ^ fdk0jjw60a, 23) ^ q1n329v6ry));
            }
            String[] stringArray = tsdh.xl1a5581efe7(new String(cArray));
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

