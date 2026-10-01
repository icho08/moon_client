/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_2583
 *  net.minecraft.class_5251
 */
package us.m0vy.moondlc.m0vyguard;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_5251;
import us.m0vy.moondlc.m0vyguard.tl;

public class bzsh {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int w16nnfyg;

    public static List ahz(class_2561 class_25612, int n) {
        ArrayList arrayList = new ArrayList();
        class_25612.method_27658((arg_0, arg_1) -> bzsh.khghz_2(n, arrayList, arg_0, arg_1), class_2583.field_24360);
        return arrayList;
    }

    private static int jmgh(class_2583 class_25832, int n) {
        class_5251 class_52512 = class_25832.method_10973();
        return class_52512 != null ? class_52512.method_27716() | 0xFF000000 : n;
    }

    private static Optional khghz_2(int n, List list, class_2583 class_25832, String string) {
        if (!string.isEmpty()) {
            int n2 = bzsh.jmgh(class_25832, n);
            boolean bl = class_25832.method_10984();
            boolean bl2 = class_25832.method_10966();
            boolean bl3 = class_25832.method_10965();
            boolean bl4 = class_25832.method_10986();
            list.add(new tl(string, n2, bl, bl2, bl3, bl4));
        }
        return Optional.empty();
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

