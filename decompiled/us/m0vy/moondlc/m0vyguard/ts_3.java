/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_3966
 */
package us.m0vy.moondlc.m0vyguard;

import net.minecraft.class_1657;
import net.minecraft.class_239;
import net.minecraft.class_3966;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.jr;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.movy.moondlc.Moondlc;

@tq_2(name="Click Friend", category=bzw.OTHER, desc="Middle click on a player to add/remove them as a friend")
public class ts_3
extends bnq {
    private final bql<jr> hdhb = ts_3::ghdz_4;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int g6tzzc7h4ur;

    private static void ghdz_4(jr jr2) {
        class_3966 class_39662;
        Object object;
        int n = 488049371;
        n = Integer.rotateLeft(n * 539688375, 27) ^ 0x6FECDFD0;
        jr jr3 = jr2;
        n = Integer.rotateRight((jr3 != null ? System.identityHashCode(jr3) : 0) ^ n, 18);
        int n2 = n ^ 0xFD80DFD6;
        if ((n2 ^ n) != -41885738) {
            int cfr_ignored_0 = (0xE097D50D ^ n) - -769772365;
        }
        if (jr2.sth_7() == 1 && jr2.tnq_2() == 2 && ts_3.mc.field_1765 != null && ts_3.mc.field_1765.method_17783() == class_239.class_240.field_1331 && (object = (class_39662 = (class_3966)ts_3.mc.field_1765).method_17782()) instanceof class_1657) {
            String string;
            class_1657 class_16572 = (class_1657)object;
            object = Moondlc.getInstance().getFriendManager();
            if (((kh_3)object).adhj(string = class_16572.method_5477().getString())) {
                ((kh_3)object).jjm(string);
            } else {
                ((kh_3)object).zfz_4(string);
            }
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

