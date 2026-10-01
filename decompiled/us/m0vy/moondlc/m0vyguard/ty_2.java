/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1657
 *  net.minecraft.class_239
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 */
package us.m0vy.moondlc.m0vyguard;

import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_239;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.jf;
import us.m0vy.moondlc.m0vyguard.tq_2;

@tq_2(name="MultiTask", category=bzw.OTHER, desc="Allows mining and attacking while using items")
public class ty_2
extends bnq {
    private final bql<btt> dth_4 = ty_2::ardh;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int c2b45buu010;

    private static void ardh(btt btt2) {
        class_3965 class_39652;
        int n = jf.dld_4(1975185725);
        int n2 = n ^ 0xC4C67BFA;
        if ((n2 ^ n) != -993625094) {
            int cfr_ignored_0 = Integer.rotateRight(0xB17C8AC7 ^ n, 9) - -2106430124;
        }
        if (ty_2.mc.field_1724 == null || ty_2.mc.field_1687 == null || ty_2.mc.field_1761 == null) {
            return;
        }
        class_239 class_2392 = ty_2.mc.field_1765;
        if (class_2392 instanceof class_3965 && (class_39652 = (class_3965)class_2392).method_17777() != null && ty_2.mc.field_1690.field_1886.method_1434() && !ty_2.mc.field_1687.method_8320(class_39652.method_17777()).method_26215()) {
            ty_2.mc.field_1761.method_2910(class_39652.method_17777(), class_39652.method_17780());
            ty_2.mc.field_1724.method_6104(class_1268.field_5808);
        }
        if ((class_2392 = ty_2.mc.field_1765) instanceof class_3966 && (class_39652 = (class_3966)class_2392).method_17782() != null && ty_2.mc.field_1690.field_1886.method_1434() && ty_2.mc.field_1724.method_7261(Float.intBitsToFloat(-1010722033 + 2067686641)) > Float.intBitsToFloat(0x2F7165A3 ^ 0x101703C5)) {
            ty_2.mc.field_1761.method_2918((class_1657)ty_2.mc.field_1724, class_39652.method_17782());
            ty_2.mc.field_1724.method_6104(class_1268.field_5808);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

