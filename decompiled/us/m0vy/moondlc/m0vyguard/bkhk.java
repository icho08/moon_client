/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_293
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bss_2;
import us.m0vy.moondlc.m0vyguard.bmt_2;
import us.m0vy.moondlc.m0vyguard.tkhr;
import us.m0vy.moondlc.m0vyguard.dhsh_5;

public class bkhk
extends bmt_2 {
    private final class_4587 hzs_4;
    private final float zsw;
    private final float dhsj_2;
    private final float sgh_2;
    private final bss_2 dsn_2;
    private static final int r93ct12tl = 132749717;
    private static final int gcx8wo0o = 1036007822;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int itk3k6zf3;

    public bkhk(class_293 class_2932, class_4587 class_45872, float f, float f2, float f3, bss_2 bss2) {
        super(class_2932);
        this.hzs_4 = class_45872;
        this.zsw = f;
        this.dhsj_2 = f2;
        this.sgh_2 = f3;
        this.dsn_2 = bss2;
    }

    @Override
    public void sw_2() {
        dhsh_5 dhsh2 = tkhr.zqsh;
        dhsh2.rtth();
        dhsh2.zhd_5("Size").method_1255(this.zsw, this.dhsj_2);
        dhsh2.zhd_5("Radius").method_35657(this.dsn_2.topLeftRadius() * 3.0f, this.dsn_2.bottomLeftRadius() * 3.0f, this.dsn_2.topRightRadius() * 3.0f, this.dsn_2.bottomRightRadius() * 3.0f);
        dhsh2.zhd_5("Smoothness").method_1251(this.sgh_2);
        tkhr.dzs_7();
        this.mdh();
        tkhr.zsz();
        if (sbgh == this) {
            sbgh = null;
        }
    }

    @Generated
    public class_4587 dbk() {
        return this.hzs_4;
    }

    private static String[] u6uvcvldt79by(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite tu8jvlbbets(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ r93ct12tl ^ string.hashCode()) + (n2 + gcx8wo0o) + i ^ r93ct12tl, 3) + gcx8wo0o);
            }
            String[] stringArray = bkhk.u6uvcvldt79by(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

