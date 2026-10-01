/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_284
 *  net.minecraft.class_290
 *  net.minecraft.class_2960
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_284;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import us.m0vy.moondlc.m0vyguard.bdr_2;
import us.m0vy.moondlc.m0vyguard.tdf;

public class tjz
extends tdf
implements bdr_2 {
    private class_284 thaw_2;
    private class_284 shdb_2;
    private class_284 thghw;
    private class_284 baz_2;
    private class_284 hwkh;
    private static final int p9vqgokchtmyf = 2044345031;
    private static final int wwbqcf6x8 = -1651751537;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int yj1dgxminulak2;

    public tjz(class_2960 class_29602) {
        super(class_29602, class_290.field_1575);
    }

    public void tqt(float f) {
        this.shdb_2.method_1251(f);
        this.thaw_2.method_1255(1.0f / (float)zak.method_4480(), 1.0f / (float)zak.method_4507());
        this.thghw.method_1251(1.0f);
        this.baz_2.method_1251(0.0f);
        this.hwkh.method_1249(1.0f, 1.0f, 1.0f);
    }

    @Override
    protected void haf() {
        this.thaw_2 = this.thrs_2("Resolution");
        this.shdb_2 = this.thrs_2("Offset");
        this.thghw = this.thrs_2("Saturation");
        this.baz_2 = this.thrs_2("TintIntensity");
        this.hwkh = this.thrs_2("TintColor");
        super.haf();
    }

    private static String[] zyup3o2noas7(String string) {
        return string.split("\u0005\u0014", -1);
    }

    private static CallSite abg9fh5paxxmc8(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ p9vqgokchtmyf ^ string.hashCode() ^ n2 + wwbqcf6x8 ^ i * 655468205 ^ p9vqgokchtmyf, 5) ^ wwbqcf6x8));
            }
            String[] stringArray = tjz.zyup3o2noas7(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

