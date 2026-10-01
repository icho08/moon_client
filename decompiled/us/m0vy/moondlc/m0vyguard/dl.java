/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 *  net.minecraft.class_310
 *  net.minecraft.class_7204
 */
package us.m0vy.moondlc.m0vyguard;

import net.minecraft.class_2596;
import net.minecraft.class_310;
import net.minecraft.class_7204;
import us.m0vy.moondlc.m0vyguard.bhw;
import us.m0vy.moondlc.m0vyguard.bkd_2;
import us.m0vy.moondlc.m0vyguard.thdh;

public interface dl {
    public static final class_310 mc;

    public static class_310 shsw_2() {
        class_310 class_3102 = mc;
        return class_3102 != null ? class_3102 : class_310.method_1551();
    }

    public static void sbth(class_310 class_3102) {
        if (class_3102 == null || mc == class_3102) {
            return;
        }
        bhw.hhm(class_3102);
    }

    default public void sth_8(String string) {
        bkd_2.jha_4(string);
    }

    default public void tshl_2(class_7204 class_72042) {
        thdh.adhq(class_72042);
    }

    default public void bza_4(class_7204 class_72042) {
        thdh.dzd_8(class_72042);
    }

    default public void bsz_3(class_2596 class_25962) {
        thdh.btj_2(class_25962);
    }

    default public void tash_4(class_2596 class_25962) {
        thdh.dht_5(class_25962);
    }
}

