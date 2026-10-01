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
import us.m0vy.moondlc.m0vyguard.bdht;
import us.m0vy.moondlc.m0vyguard.tjd_2;
import us.m0vy.moondlc.m0vyguard.zth_8;
import us.m0vy.moondlc.m0vyguard.fth;

public class bshq
extends tjd_2 {
    private final class_4587 tft_2;
    private final float shhz_3;
    private final float thhw_2;
    private final float bhf_2;
    private final zth_8 shzn;
    private static final int nfc937t = 1797150815;
    private static final int oka89fcymphn9 = -1012419750;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ik5aoyog;

    public bshq(class_293 class_2932, class_4587 class_45872, float f, float f2, float f3, zth_8 zth2) {
        super(class_2932);
        this.tft_2 = class_45872;
        this.shhz_3 = f;
        this.thhw_2 = f2;
        this.bhf_2 = f3;
        this.shzn = zth2;
    }

    @Override
    public void jbn() {
        fth fth2 = bdht.sthgh;
        fth2.aghl();
        fth2.rthw("Size").method_1255(this.shhz_3, this.thhw_2);
        fth2.rthw("Radius").method_35657(this.shzn.topLeftRadius() * 3.0f, this.shzn.bottomLeftRadius() * 3.0f, this.shzn.topRightRadius() * 3.0f, this.shzn.bottomRightRadius() * 3.0f);
        fth2.rthw("Smoothness").method_1251(this.bhf_2);
        bdht.zkhb_2();
        this.shqy();
        bdht.dhdt_4();
        if (khsj == this) {
            khsj = null;
        }
    }

    @Generated
    public class_4587 shmk() {
        return this.tft_2;
    }

    private static String[] uw7z61g89m(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite qcnck6sajg(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ nfc937t ^ string.hashCode()) + (n2 + oka89fcymphn9) + i ^ nfc937t, 21) + oka89fcymphn9);
            }
            String[] stringArray = bshq.uw7z61g89m(new String(cArray));
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

