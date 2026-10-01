/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 */
package us.m0vy.moondlc.m0vyguard;

import net.minecraft.class_2561;
import us.m0vy.moondlc.m0vyguard.bth_3;
import us.m0vy.moondlc.m0vyguard.bzh_4;
import us.m0vy.moondlc.m0vyguard.dhm_3;

public sealed interface ah_2
permits bth_3, dhm_3 {
    public static bth_3 tsy(Object object) {
        return new bth_3(object);
    }

    public static dhm_3 thsdh_2(String string) {
        bzh_4.dhght_2(class_2561.method_30163((String)string));
        return new dhm_3(string);
    }
}

