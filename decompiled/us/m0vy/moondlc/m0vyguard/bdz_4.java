/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_266
 *  net.minecraft.class_268
 *  net.minecraft.class_269
 *  net.minecraft.class_270
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_4587
 *  net.minecraft.class_5250
 *  net.minecraft.class_5348
 *  net.minecraft.class_9011
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_2561;
import net.minecraft.class_266;
import net.minecraft.class_268;
import net.minecraft.class_269;
import net.minecraft.class_270;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_5250;
import net.minecraft.class_5348;
import net.minecraft.class_9011;
import us.m0vy.moondlc.m0vyguard.bjgh;

public final class bdz_4 {
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int imz5czy4k3b5d;

    private bdz_4() {
    }

    public static void bsdh(class_332 class_3322, class_266 class_2662) {
        class_5250 class_52502;
        int n;
        class_310 class_3102 = class_310.method_1551();
        if (class_3102.field_1724 == null || class_2662 == null) {
            return;
        }
        class_269 class_2692 = class_2662.method_1117();
        List<class_9011> list = class_2692.method_1184(class_2662).stream().filter(bdz_4::szkh).filter(bdz_4::zra_3).toList();
        list = list.size() > 15 ? new ArrayList<class_9011>(list.subList(list.size() - 15, list.size())) : new ArrayList<class_9011>(list);
        class_2561 class_25612 = class_2662.method_1114();
        int n2 = n = class_3102.field_1772.method_27525((class_5348)class_25612);
        int n3 = class_3102.field_1772.method_1727(":");
        ArrayList<class_5250> arrayList = new ArrayList<class_5250>();
        for (class_9011 class_90112 : list) {
            class_268 class_2682 = class_2692.method_1164(class_90112.comp_2127());
            class_52502 = class_268.method_1142((class_270)class_2682, (class_2561)class_2561.method_43470((String)class_90112.comp_2127()));
            arrayList.add(class_52502);
            n2 = Math.max(n2, class_3102.field_1772.method_27525((class_5348)class_52502) + n3 + class_3102.field_1772.method_1727(Integer.toString(class_90112.comp_2128())));
        }
        int n4 = list.size() * 9 + 13;
        int n5 = class_3102.method_22683().method_4486() - n2 - 6;
        int n6 = class_3102.method_22683().method_4502() / 2 - n4 / 2;
        class_52502 = class_3322.method_51448();
        bjgh.jghs.hrj((class_4587)class_52502, n5, n6, n2, n4, 4.0f, new Color(0, 0, 0, 110));
        int n7 = 0;
        for (class_2561 class_25613 : arrayList) {
            int n8 = n6 + 13 + n7 * 9;
            class_3322.method_51439(class_3102.field_1772, class_25613, n5 + 4, n8, -1, false);
            ++n7;
        }
        class_3322.method_51439(class_3102.field_1772, class_25612, n5 + n2 / 2 - n / 2, n6 + 4, -1, false);
    }

    private static boolean zra_3(class_9011 class_90112) {
        return !class_90112.comp_2127().startsWith("#");
    }

    private static boolean szkh(class_9011 class_90112) {
        return !class_90112.method_55385();
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

