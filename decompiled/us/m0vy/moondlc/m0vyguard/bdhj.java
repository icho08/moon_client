/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_2561
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_2561;
import us.m0vy.moondlc.m0vyguard.zn_2;

public class bdhj {
    private zn_2 bdt;
    private float dhzd;
    private static final int ac5ns5rtyuuk = 248730649;
    private static final int p72nldg = -745711412;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int rvancnw3g7m;

    public float rfs_2() {
        return this.dhzd * 0.7f;
    }

    public float tqth(String string) {
        return this.bdt.rjj(string, this.dhzd);
    }

    public float btth(class_2561 class_25612) {
        return this.bdt.azf_2(class_25612, this.dhzd);
    }

    @Generated
    public zn_2 ztdh() {
        return this.bdt;
    }

    @Generated
    public float thshf() {
        return this.dhzd;
    }

    @Generated
    public bdhj(zn_2 zn2, float f) {
        this.bdt = zn2;
        this.dhzd = f;
    }

    private static String[] alucgzwn(String string) {
        return string.split("\u0001\u0018", -1);
    }

    private static CallSite vu5vcloe43j(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ac5ns5rtyuuk ^ string.hashCode() ^ n2 + p72nldg + i * -723646081) + ac5ns5rtyuuk) ^ p72nldg));
            }
            String[] stringArray = bdhj.alucgzwn(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

