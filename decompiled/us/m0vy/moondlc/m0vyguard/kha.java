/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1922
 *  net.minecraft.class_2246
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2374
 *  net.minecraft.class_243
 *  net.minecraft.class_259
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 *  net.minecraft.class_3959
 *  net.minecraft.class_3965
 */
package us.m0vy.moondlc.m0vyguard;

import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_243;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import us.m0vy.moondlc.m0vyguard.dl;

public class kha
implements dl {
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int juz63qrtc;

    public static class_3965 hrm(class_3959 class_39592, class_2338 class_23382) {
        return (class_3965)class_1922.method_17744((class_243)class_39592.method_17750(), (class_243)class_39592.method_17747(), (Object)class_39592, (arg_0, arg_1) -> kha.jthd_2(class_23382, arg_0, arg_1), kha::dhy_4);
    }

    private static class_3965 dhy_4(class_3959 class_39592) {
        class_243 class_2432 = class_39592.method_17750().method_1020(class_39592.method_17747());
        return class_3965.method_17778((class_243)class_39592.method_17747(), (class_2350)class_2350.method_10142((double)class_2432.field_1352, (double)class_2432.field_1351, (double)class_2432.field_1350), (class_2338)class_2338.method_49638((class_2374)class_39592.method_17747()));
    }

    private static class_3965 jthd_2(class_2338 class_23382, class_3959 class_39592, class_2338 class_23383) {
        class_2680 class_26802 = !class_23383.equals((Object)class_23382) ? class_2246.field_10124.method_9564() : class_2246.field_10540.method_9564();
        class_243 class_2432 = class_39592.method_17750();
        class_243 class_2433 = class_39592.method_17747();
        class_265 class_2652 = class_39592.method_17748(class_26802, (class_1922)kha.mc.field_1687, class_23383);
        class_3965 class_39652 = kha.mc.field_1687.method_17745(class_2432, class_2433, class_23383, class_2652, class_26802);
        class_265 class_2653 = class_259.method_1073();
        class_3965 class_39653 = class_2653.method_1092(class_2432, class_2433, class_23383);
        double d = class_39652 == null ? Double.MAX_VALUE : class_39592.method_17750().method_1025(class_39652.method_17784());
        double d2 = class_39653 == null ? Double.MAX_VALUE : class_39592.method_17750().method_1025(class_39653.method_17784());
        return d <= d2 ? class_39652 : class_39653;
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

