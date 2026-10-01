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
import us.m0vy.moondlc.m0vyguard.tthz_2;

public class bd {
    private tthz_2 sdsh;
    private float shwsh;
    private static final int z82uo3tcozjlx = 1811198485;
    private static final int e8yfpfj = 1811273529;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int heyz3bpaj68feo;

    public float ghak() {
        return this.shwsh * 0.7f;
    }

    public float rghz(String string) {
        return this.sdsh.dht_10(string, this.shwsh);
    }

    public float zn_2(class_2561 class_25612) {
        return this.sdsh.zml(class_25612, this.shwsh);
    }

    @Generated
    public tthz_2 sjsh() {
        return this.sdsh;
    }

    @Generated
    public float khjsh() {
        return this.shwsh;
    }

    @Generated
    public bd(tthz_2 tthz2_2, float f) {
        this.sdsh = tthz2_2;
        this.shwsh = f;
    }

    private static String[] sn69094zenvu(String string) {
        return string.split("\u0004\u001b", -1);
    }

    private static CallSite zakvzxvcdu(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ z82uo3tcozjlx ^ string.hashCode() ^ n2 + e8yfpfj ^ i * 1997173543 ^ z82uo3tcozjlx, 24) ^ e8yfpfj));
            }
            String[] stringArray = bd.sn69094zenvu(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

