/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_408
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_408;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bhl_2;
import us.m0vy.moondlc.m0vyguard.thw_3;

public class bzf_2
extends thw_3 {
    private static final int zreeysgwc = 1223216001;
    private static final int jkcstyfs9 = 484020138;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int tyn112q7h;

    public bzf_2() {
        super(10.0f, 150.0f);
        this.khta_3().setWidth(110.0f);
        this.khta_3().setHeight(130.0f);
    }

    @Override
    public String getName() {
        return "Notifications";
    }

    @Override
    public void lh(class_4587 class_45872) {
        if (bhl_2.skgh.isEmpty() && bzf_2.mc.field_1755 instanceof class_408) {
            bhl_2.khby(class_45872, this.khta_3().getX(), this.khta_3().getY());
        }
        bhl_2.hmt_2(class_45872, this.khta_3().getX(), this.khta_3().getY());
    }

    private static String[] qgtom56ujn(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite viv43sag9ya8j(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ zreeysgwc ^ string.hashCode() ^ n2 + jkcstyfs9 ^ i * 1997082859 ^ zreeysgwc, 20) ^ jkcstyfs9));
            }
            String[] stringArray = bzf_2.qgtom56ujn(new String(cArray));
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

