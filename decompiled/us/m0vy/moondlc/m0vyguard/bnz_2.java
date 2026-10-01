/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 *  net.minecraft.class_2720
 *  net.minecraft.class_2856
 *  net.minecraft.class_2856$class_2857
 */
package us.m0vy.moondlc.m0vyguard;

import net.minecraft.class_2596;
import net.minecraft.class_2720;
import net.minecraft.class_2856;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bksh;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tq_2;

@tq_2(name="No Server Pack", category=bzw.OTHER, desc="Blocks server resource pack requests")
public class bnz_2
extends bnq {
    private final bql<bksh> tts = bnz_2::shthkh;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int pucm5y5trzh0l;

    private static void shthkh(bksh bksh2) {
        class_2596 class_25962;
        int n = 737988499;
        int n2 = (n = Integer.rotateLeft(n * -727025257, 27) ^ 0xCD13B697) ^ 0x13F14ED0;
        if ((n2 ^ n) != 334581456) {
            int cfr_ignored_0 = (0x380D8143 ^ n) + 363962401;
        }
        if ((class_25962 = bksh2.asw()) instanceof class_2720) {
            class_2720 class_27202 = (class_2720)class_25962;
            if (mc.method_1562() != null) {
                mc.method_1562().method_52787((class_2596)new class_2856(class_27202.comp_2158(), class_2856.class_2857.field_13016));
                mc.method_1562().method_52787((class_2596)new class_2856(class_27202.comp_2158(), class_2856.class_2857.field_13017));
                bksh2.dhtd_2();
            }
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

