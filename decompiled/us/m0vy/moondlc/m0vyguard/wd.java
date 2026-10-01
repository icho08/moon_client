/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_238
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2824
 *  net.minecraft.class_2828
 *  net.minecraft.class_2879
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2828;
import net.minecraft.class_2879;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btj_2;
import us.m0vy.moondlc.m0vyguard.bhh_3;
import us.m0vy.moondlc.m0vyguard.tkhj;
import us.m0vy.moondlc.m0vyguard.tkhdh;
import us.m0vy.moondlc.m0vyguard.sj;
import us.m0vy.moondlc.m0vyguard.ny;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class wd {
    private long nd = 0L;
    private int khkb = 0;
    private boolean khst_3 = false;
    private boolean h_2 = false;
    private long zha_2 = 0L;
    private int jss_2 = 0;
    public long jtz_3 = 0L;
    public double sagh_3 = 0.0;
    public double jkhsh = 0.0;
    public double tah = 0.0;
    private static final int khshs_2 = 663611260;
    private static final int hnj = -1753365580;
    private static final int zsa = 1838917800;
    private static final int daa_3 = -552266863;
    private static final int gy9hkvxitwx = 1536442339;
    private static final int b8vnfs8oftvf = -1358500263;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int q41jy959;

    public void khqz() {
        int n = tkhj.tghs_4(-791936635);
        int n2 = n ^ 0x112605A;
        if ((n2 ^ n) != 17981530) {
            int cfr_ignored_0 = (Integer.rotateRight(0xD1DE61DF ^ n, 13) - 1850439996) * -773955105;
        }
        this.nd = 0L;
        this.khkb = 0;
        this.khst_3 = false;
        this.h_2 = false;
        this.zha_2 = 0L;
        this.jss_2 = 0;
        this.jtz_3 = 0L;
        this.sagh_3 = 0.0;
        this.jkhsh = 0.0;
        this.tah = 0.0;
    }

    public void dwj(class_746 class_7462) {
        this.khst_3 = false;
        this.jss_2 = 0;
        if (class_7462.method_7261(0.5f) >= 1.0f) {
            if (this.nd == 0L) {
                this.nd = System.currentTimeMillis();
            }
        } else {
            this.nd = 0L;
        }
        long l = System.currentTimeMillis();
        if (this.h_2 && l - this.zha_2 > 180L) {
            this.h_2 = false;
        }
    }

    public List tkhdh_2(class_310 class_3102, class_2596 class_25962, String string) {
        try {
            int n = 1337269158;
            n = Integer.rotateLeft(n * 1708570365, 25) ^ 0x667CA7EB;
            n = System.identityHashCode(this) ^ n;
            class_310 class_3103 = class_3102;
            n = Integer.rotateRight((class_3103 != null ? System.identityHashCode(class_3103) : 0) ^ n, 29);
            int n2 = n ^ 0x4DE0316E;
            if ((n2 ^ n) != 1306538350) {
                int cfr_ignored_0 = (0x2552AC8 ^ n) - -706115069;
            }
            if ((0x16B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        ArrayList<sj> arrayList = new ArrayList<sj>();
        class_746 class_7462 = class_3102.field_1724;
        if (class_7462 == null || class_3102.field_1687 == null) {
            return arrayList;
        }
        if (class_25962 instanceof class_2828) {
            this.khst_3 = true;
        } else if (class_25962 instanceof class_2879) {
            this.h_2 = false;
        } else if (class_25962 instanceof class_2824) {
            ++this.jss_2;
            long l = System.currentTimeMillis();
            if (!this.khst_3 && wd.thnt_2(string, "Polar Enterprise")) {
                arrayList.add(new sj(bhh_3.thss, "POLAR-".concat(wd.dkt_2("坫漩ۖ๬㘒ⷊ앿", Integer.rotateLeft(0x49921116 ^ 0xAAFE59D9, 26), wd.bbb(1043214937) ^ 0x211128C6, 1310132503 + 1509413575)), wd.dkt_2("ᲱⓌ䴲ׁ㷗♍캏웱\udf5dꞯ述졚㣭ᤫॷবᨐ㩭쫌ଡ଼㭅寓", -1882050610 + -1413542949, wd.qd(2139475524) ^ 0xAC4FC3FC, 0xC639720E ^ 0x6E37A9D0).concat(wd.dkt_2("郃ꂔ텳쇙㋈ʵግ揵叾䰣듥鵄跸附븦嚉体", -344263834 + -1152644165, Integer.rotateLeft(0x9E8D29E4 ^ 0xA629257D, 14), wd.shyl(661336923) ^ 0x72C20D3A)), Float.intBitsToFloat(wd.dhfr(0x55214877 ^ 0x89ED84B8, 26)), "Attack packet sent before movement/rotation packet in the same tick", 0.0, 0.0, "Send PlayerMoveC2SPacket (with updated rotation) BEFORE PlayerInteractEntityC2SPacket."));
            }
            if (this.jss_2 > 1) {
                arrayList.add(new sj(bhh_3.thss, "POLAR-ORDER-B", wd.ars_2("Duplicate Att".concat("ack Packets in"), " Single Tick"), Float.intBitsToFloat(Integer.reverse(800883348) ^ 0x163C4D50), String.format(wd.thghd_2("囎ẹ睔濲垛ᰭ쳚핦鷈뗕ꈷ勉ꍴ댌쏀큺\u0007턏憹繂䛡꺶蝈뿶꟎챞꓾볙䔣涋և稴嫈䭨ﯔ\ud83aꠄ袭른夛䧧깔웠\udeb1", 0x5287C167 ^ 0x9C27F82, wd.aath_2(0x1D8B9C0A ^ 0x265923E8, 29), -986766824 + -488654394), this.jss_2), this.jss_2, 1.0, "Throttle attack packets to at most 1 per tick."));
            }
            this.h_2 = true;
            this.zha_2 = l;
            if (this.nd > 0L) {
                long l2;
                long l3;
                this.jtz_3 = l3 = l - this.nd;
                String string2 = string;
                int n = -1;
                switch (string2.hashCode()) {
                    case 1838807491: {
                        if (!wd.tah_6(string2, "Polar Enterprise")) break;
                        n = 0;
                        break;
                    }
                    case -1808119063: {
                        if (!string2.equals("Strict")) break;
                        n = 1;
                        break;
                    }
                    case 1727163223: {
                        if (!wd.sshf(string2, "Lenient")) break;
                        n = 2;
                    }
                }
                switch (n) {
                    case 0: {
                        long l4 = 0xBA4E3C466AB022DCL ^ 0xBA4E3C466AB022F1L;
                        break;
                    }
                    case 1: {
                        long l4 = 0x274CE7511B6DEFB1L ^ 0x274CE7511B6DEFAFL;
                        break;
                    }
                    case 2: {
                        long l4 = 0xF65EC3E9EC57606BL ^ 0xF65EC3E9EC576061L;
                        break;
                    }
                    default: {
                        long l4 = l2 = 0x92EF6098840C5B60L ^ 0x92EF6098840C5B74L;
                    }
                }
                if (l3 < l2) {
                    ++this.khkb;
                    if (this.khkb >= 2) {
                        float f = class_3532.method_15363((float)(1.0f - (float)l3 / (float)(l2 + 1L)), (float)wd.bghl(Integer.rotateLeft(0xDD5E98F2 ^ 0xDD5E9F1A, 19)), (float)wd.shhw_2(362230998 - -702954446));
                        arrayList.add(new sj(bhh_3.khtz_2, "POLAR-COMBAT-A", "Bot Pattern ".concat("8 (0ms Cooldown ").concat("Reaction Delay)"), f, String.format("Attacked immediately (%dms < %dms) upon 100%% weapon charge across %d hits", wd.zkh_5(l3), l2, this.khkb), l3, l2, "Add randomized human reaction latency (25-85ms) after weapon charge completes."));
                    }
                } else {
                    this.khkb = 0;
                }
            }
            this.kkh(class_3102, class_7462, string, arrayList);
        }
        return arrayList;
    }

    private void kkh(class_310 class_3102, class_746 class_7462, String string, List list) {
        ny ny2;
        float f = class_7462.method_36454();
        float f2 = class_7462.method_36455();
        if (btj_2.dhsw_2 != null && btj_2.dhsw_2.length >= 2) {
            f = btj_2.dhsw_2[0];
            f2 = btj_2.dhsw_2[1];
        } else {
            ny2 = Moondlc.getInstance().getRotationHandler();
            if (ny2 != null && !ny2.smf()) {
                f = ny2.wk().sry();
                f2 = ny2.wk().khdhd_2();
            }
        }
        ny2 = class_7462.method_33571();
        float f3 = f2 * ((float)Math.PI / 180);
        float f4 = -f * ((float)Math.PI / 180);
        float f5 = class_3532.method_15362((float)f3);
        class_243 class_2432 = new class_243((double)(class_3532.method_15374((float)f4) * f5), (double)(-class_3532.method_15374((float)f3)), (double)(class_3532.method_15362((float)f4) * f5));
        class_243 class_2433 = ny2.method_1019(class_2432.method_1021(6.0));
        class_1309 class_13092 = null;
        tkhdh tkhdh2 = tkhdh.zkhr_2();
        if (tkhdh2 != null && tkhdh2.rgha_2() && tkhdh2.rkhh_2() != null) {
            class_13092 = tkhdh2.rkhh_2();
        }
        if (class_13092 == null) {
            class_13092 = this.awsh(class_7462, (class_243)ny2, class_2433);
        }
        if (class_13092 != null) {
            class_3965 class_39652;
            boolean bl;
            double d;
            double d2;
            class_238 class_2383 = class_13092.method_5829();
            this.sagh_3 = d2 = this.thsz_3((class_243)ny2, class_2383);
            switch (string) {
                case "Polar Enterprise": {
                    double d3 = 3.01;
                    break;
                }
                case "Strict": {
                    double d3 = 3.08;
                    break;
                }
                case "Lenient": {
                    double d3 = 3.35;
                    break;
                }
                default: {
                    double d3 = d = 3.15;
                }
            }
            if (d2 > d) {
                float f6 = class_3532.method_15363((float)((float)(d2 / d) - 0.2f), (float)0.7f, (float)0.99f);
                list.add(new sj(bhh_3.khtz_2, "POLAR-COMBAT-B", "Survival Reach Limit Violation", f6, String.format("Hit distance to unexpanded AABB: %.3fm > Max: %.2fm", d2, d), d2, d, "Reduce Aura Attack Range to <= 3.00m."));
            }
            if (!(bl = class_2383.method_992((class_243)ny2, class_2433).isPresent()) && d2 > 0.4) {
                double d4;
                double d5;
                class_243 class_2434 = class_2383.method_1005();
                class_243 class_2435 = class_2434.method_1020((class_243)ny2).method_1029();
                double d6 = class_3532.method_15350((double)class_2432.method_1026(class_2435), (double)-1.0, (double)1.0);
                double d7 = Math.toDegrees(Math.acos(d6));
                double d8 = Math.toDegrees(Math.atan2(Math.max(class_2383.method_17939(), class_2383.method_17941()) * 0.5, d2));
                this.jkhsh = d5 = Math.max(0.0, d7 - d8);
                switch (string) {
                    case "Polar Enterprise": {
                        double d9 = 0.0;
                        break;
                    }
                    case "Strict": {
                        double d9 = 2.5;
                        break;
                    }
                    case "Lenient": {
                        double d9 = 12.0;
                        break;
                    }
                    default: {
                        double d9 = d4 = 5.0;
                    }
                }
                if (d5 > d4) {
                    float f7 = class_3532.method_15363((float)((float)(d5 / 15.0) + 0.6f), (float)0.75f, (float)0.99f);
                    list.add(new sj(bhh_3.khtz_2, "POLAR-COMBAT-C", "Raycast Hitbox Miss / Angle Violation", f7, String.format("Crosshair missed entity AABB by %.2f° on attack packet", d5), d5, d4, "Enable Strict Raycast verification in Aura settings before sending attack packets."));
                }
            }
            if ((class_39652 = class_3102.field_1687.method_17742(new class_3959((class_243)ny2, class_2383.method_1005(), class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)class_7462))).method_17783() == class_239.class_240.field_1332 && class_39652.method_17784().method_1022((class_243)ny2) < d2 - 0.1) {
                list.add(new sj(bhh_3.khtz_2, "POLAR-COMBAT-E", "Wall / Obstacle Occlusion Penetration", 0.95f, String.format("Line of sight blocked by block: %s", class_3102.field_1687.method_8320(class_39652.method_17777()).method_26204().method_9518().getString()), 1.0, 0.0, "Enable 'Require Line Of Sight' and disable 'Through Walls' in Aura."));
            }
            if (class_7462.field_3913 != null) {
                float f8 = class_7462.field_3913.field_3905;
                float f9 = class_7462.field_3913.field_3907;
                if (Math.abs(f8) > 0.01f || Math.abs(f9) > 0.01f) {
                    float f10 = class_7462.method_36454();
                    float f11 = Math.abs(class_3532.method_15393((float)(f - f10)));
                    this.tah = f11;
                    if (f11 > 45.0f && string.equals("Polar Enterprise")) {
                        list.add(new sj(bhh_3.thss, "POLAR-COMBAT-F", "Silent Move-Fix / Strafe Angle Desync", 0.88f, String.format("Server yaw deviates from camera input yaw by %.1f° during strafing", Float.valueOf(f11)), f11, 45.0, "Use 'Move Correction' mode or align silent strafing with server rotation vectors."));
                    }
                }
            }
        }
    }

    private class_1309 awsh(class_746 class_7462, class_243 class_2432, class_243 class_2433) {
        try {
            int n = -1955851486;
            n = Integer.rotateLeft(n * -656241017, 23) ^ 0x6D0E2DF8;
            class_243 class_2434 = class_2433;
            n = (class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n;
            int n2 = n ^ 0x86F3F983;
            if ((n2 ^ n) != -2030831229) {
                int cfr_ignored_0 = (0xD9FEAA1 ^ n) - -2039478723;
            }
            if ((0x2D9 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!wd.thqk()) {
            yf.athz_2();
            throw null;
        }
        class_1309 class_13092 = null;
        double d = wd.rnt_2(0x694A16BC9B6CDE71L ^ 0x16A5E9436493218EL);
        if (class_7462.field_17892 == null) {
            return null;
        }
        for (class_1297 class_12972 : class_7462.field_17892.method_18112()) {
            double d2;
            class_238 class_2383;
            class_1309 class_13093;
            if (class_12972 == class_7462 || !(class_12972 instanceof class_1309) || !(class_13093 = (class_1309)class_12972).method_5805() || !(class_2383 = class_13093.method_5829()).method_992(class_2432, class_2433).isPresent() && !(this.thsz_3(class_2432, class_2383) <= Double.longBitsToDouble(0x67AB5E4996A8F943L ^ 0x27A5382FF0CE9F25L)) || !((d2 = class_7462.method_5858(class_12972)) < d)) continue;
            d = d2;
            class_13092 = class_13093;
        }
        return class_13092;
    }

    private double thsz_3(class_243 class_2432, class_238 class_2383) {
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        int n = 0;
        int n2 = 787976259;
        n2 = Integer.rotateLeft(n2 * 1996806949, 3) ^ 0x84D0FD83;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 15);
        class_243 class_2433 = class_2432;
        n2 = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n2;
        int n3 = (int)((long)(1389914501 * -2022996079 + 1538399901 ^ n2) ^ 0x4BBD7846C4CCB972L ^ 0x4BBD7846C4CCB972L);
        while (true) {
            block15: {
                block23: {
                    block22: {
                        block12: {
                            block14: {
                                block27: {
                                    block28: {
                                        block19: {
                                            block24: {
                                                block20: {
                                                    block17: {
                                                        block29: {
                                                            block26: {
                                                                block13: {
                                                                    block18: {
                                                                        block25: {
                                                                            block21: {
                                                                                block10: {
                                                                                    block16: {
                                                                                        block11: {
                                                                                            if ((n = ((n3 ^ n2) - 1538399901) * 915151217) > 168729541) break block10;
                                                                                            if (n > -486669414) break block11;
                                                                                            if (n == -2057194321) break block12;
                                                                                            if (n == -1845887559) break block13;
                                                                                            int cfr_ignored_0 = Integer.rotateLeft(0xA06553A5 ^ n2, 7) - 1889714230;
                                                                                            int cfr_ignored_1 = (int)(0x62D7FD9827D4EB4FL ^ (long)n2 ^ 0x640831A2DB9687EL);
                                                                                            if (n == -486669414) break block14;
                                                                                            break block15;
                                                                                        }
                                                                                        if (n > -91978278) break block16;
                                                                                        if (n == -414842151) break block17;
                                                                                        if (n == -91978278) break block18;
                                                                                        break block15;
                                                                                    }
                                                                                    if (n == -23051118) break block19;
                                                                                    if (n == 168729541) break block20;
                                                                                    int cfr_ignored_2 = Integer.rotateRight(0x63F55062 ^ n2, 15) + 521296665;
                                                                                    break block15;
                                                                                }
                                                                                if (n > 1109231880) break block21;
                                                                                if (n == 187132118) break block22;
                                                                                if (n == 908335050) break block23;
                                                                                if (n == 1109231880) break block24;
                                                                                break block15;
                                                                            }
                                                                            if (n > 1703806953) break block25;
                                                                            if (n == 1389914501) break block26;
                                                                            if (n == 1703806953) break block27;
                                                                            break block15;
                                                                        }
                                                                        if (n == 1800566447) break block28;
                                                                        if (n == 1965736386) break block29;
                                                                        break block15;
                                                                    }
                                                                    int cfr_ignored_3 = (Integer.rotateRight(0xEF79D7DA ^ n2, 16) + 69124769) * -277227557;
                                                                    yf.athz_2();
                                                                    throw null;
                                                                }
                                                                int cfr_ignored_4 = (Integer.rotateLeft(0x487BBC30 ^ n2, 12) + -883332853) * 1216068657;
                                                                d = wd.thyk(class_2432.field_1352, class_2383.field_1323, class_2383.field_1320);
                                                                d2 = class_3532.method_15350((double)class_2432.field_1351, (double)class_2383.field_1322, (double)class_2383.field_1325);
                                                                d3 = class_3532.method_15350((double)class_2432.field_1350, (double)class_2383.field_1321, (double)class_2383.field_1324);
                                                                return class_2432.method_1022(new class_243(d, d2, d3));
                                                            }
                                                            int cfr_ignored_5 = Integer.rotateRight(0x68F6ED86 ^ n2, 16) - -1169923467;
                                                            if (wd.std_6()) {
                                                                int cfr_ignored_6 = (int)(0xAD46BA38EDAF05BFL ^ (long)n2 ^ 0x890117EDF058F75CL);
                                                                n3 = 312668363 * -2022996079 + 1538399901 ^ n2;
                                                                int cfr_ignored_7 = (int)(0xDD92AFCF7F7F16BFL ^ (long)n2 ^ 0xA2EE324DD65816F4L);
                                                                n3 = (-1845887559 * -2022996079 + 1538399901 ^ n2) + -1738248857 - -1738248857;
                                                                n += 4;
                                                                continue;
                                                            }
                                                            try {
                                                                n += 2;
                                                                if ((0x4278B92C9B94DC3FL ^ (long)n2 | 1L) == 0L) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                n3 = -91978278 * -2022996079 + 1538399901 ^ n2;
                                                            }
                                                            catch (IllegalStateException illegalStateException) {
                                                                n3 = (-91978278 * -2022996079 + 1538399901 ^ n2) + 65276257 - 65276257;
                                                            }
                                                            --n;
                                                            continue;
                                                        }
                                                        int cfr_ignored_8 = (Integer.rotateLeft(0x6D4CF38 ^ n2, 3) + -668813565) * 114609977;
                                                        n3 = (-611278545 * -2022996079 + 1538399901 ^ n2) + 1567600685 - 1567600685;
                                                        int cfr_ignored_9 = (Integer.rotateRight(0xE782037E ^ n2, 15) - 219941757) * -410909825;
                                                        n3 = -2104798013 * -2022996079 + 1538399901 ^ n2 ^ 0x1EBEEC13 ^ 0x1EBEEC13;
                                                        int cfr_ignored_10 = (Integer.rotateRight(0x4C0EEA7A ^ n2, 12) + 975963137) * 1276045947;
                                                        n3 = Integer.reverse(Integer.reverse(1389914501 * -2022996079 + 1538399901 ^ n2));
                                                        ++n;
                                                        continue;
                                                    }
                                                    int cfr_ignored_11 = (Integer.rotateLeft(0x9038C95C ^ n2, 5) - 2067661151) * -1875326627;
                                                    n3 = 1730928006 * -2022996079 + 1538399901 ^ n2;
                                                    int cfr_ignored_12 = Integer.rotateRight(0xF77C4442 ^ n2, 17) + -60169415;
                                                    n3 = (1389914501 * -2022996079 + 1538399901 ^ n2) + -150450783 - -150450783;
                                                    n += 4;
                                                    continue;
                                                }
                                                int cfr_ignored_13 = Integer.rotateLeft(0xFA469DCC ^ n2, 18) - 1391114991;
                                                n3 = 920330380 * -2022996079 + 1538399901 ^ n2 ^ 0xA4F30D2A ^ 0xA4F30D2A;
                                                int cfr_ignored_14 = (Integer.rotateLeft(0x3CF51B31 ^ n2, 10) + 1712056874) * 1022696241;
                                                int cfr_ignored_15 = (int)(0xFE47B50C27D4EB4FL ^ (long)n2 ^ 0x9768831A2DB8515EL);
                                                n3 = Integer.reverse(Integer.reverse(1816502670 * -2022996079 + 1538399901 ^ n2));
                                                int cfr_ignored_16 = Integer.rotateRight(0x1FBC0FEE ^ n2, 6) - -601649907;
                                                n3 = (int)((long)(1389914501 * -2022996079 + 1538399901 ^ n2) ^ 0x87F00DE77867EC3CL ^ 0x87F00DE77867EC3CL);
                                                n -= 3;
                                                continue;
                                            }
                                            int cfr_ignored_17 = Integer.rotateLeft(0x2DEBAF0D ^ n2, 8) - -1813524018;
                                            int cfr_ignored_18 = (int)(0xEF59013027D4EB4FL ^ (long)n2 ^ 0xFF10831A2DB87363L);
                                            n3 = 913668719 * -2022996079 + 1538399901 ^ n2 ^ 0x8B9DDBBA ^ 0x8B9DDBBA;
                                            int cfr_ignored_19 = (Integer.rotateLeft(0x9C11755 ^ n2, 4) - 851407494) * 163649365;
                                            int cfr_ignored_20 = (int)(0xCB73B96827D4EB4FL ^ (long)n2 ^ 0x8FA0831A2DB83B36L);
                                            try {
                                                n -= 3;
                                                if ((0xD0E665BB8391C59FL ^ (long)n2 | 1L) == 0L) {
                                                    throw new UnsupportedOperationException();
                                                }
                                                n3 = 1389914501 * -2022996079 + 1538399901 ^ n2;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                n3 = (1389914501 * -2022996079 + 1538399901 ^ n2) + 137746138 - 137746138;
                                            }
                                            n += 3;
                                            continue;
                                        }
                                        int cfr_ignored_21 = Integer.rotateRight(0x4501948A ^ n2, 11) + 1603181553;
                                        n3 = Integer.reverse(Integer.reverse(-1596001255 * -2022996079 + 1538399901 ^ n2));
                                        int cfr_ignored_22 = (Integer.rotateRight(0xEC0863E ^ n2, 4) - -844242755) * 247498303;
                                        n3 = (1389914501 * -2022996079 + 1538399901 ^ n2) + -1563697184 - -1563697184;
                                        int cfr_ignored_23 = Integer.rotateRight(0xE69FF92E ^ n2, 15) - -239285299;
                                        n += 4;
                                        continue;
                                    }
                                    int cfr_ignored_24 = (Integer.rotateRight(0x2E09C39B ^ n2, 8) + -1752412416) * 772391835;
                                    n3 = (int)((long)(1389914501 * -2022996079 + 1538399901 ^ n2) ^ 0xA058DB061339A451L ^ 0xA058DB061339A451L);
                                    int cfr_ignored_25 = (Integer.rotateLeft(0xD1C7CAF8 ^ n2, 13) + 1804546883) * -775435527;
                                    --n;
                                    continue;
                                }
                                int cfr_ignored_26 = (Integer.rotateRight(0xB4B0F9BF ^ n2, 9) - -439624356) * -1263470145;
                                n3 = (-543682223 * -2022996079 + 1538399901 ^ n2) + -471225088 - -471225088;
                                int cfr_ignored_27 = Integer.rotateRight(0xF12DD60E ^ n2, 17) - 954895085;
                                n3 = Integer.reverse(Integer.reverse(1389914501 * -2022996079 + 1538399901 ^ n2));
                                continue;
                            }
                            int cfr_ignored_28 = Integer.rotateLeft(0x2F25C9E5 ^ n2, 8) - -1175383562;
                            int cfr_ignored_29 = (int)(0xED9767D827D4EB4FL ^ (long)n2 ^ 0x32C0831A2DB876FFL);
                            n3 = -1331429121 * -2022996079 + 1538399901 ^ n2 ^ 0xDA695EA ^ 0xDA695EA;
                            int cfr_ignored_30 = (Integer.rotateRight(0xBC687376 ^ n2, 10) - -721184123) * -1134005385;
                            int cfr_ignored_31 = (int)(0xD8978AB76C799B13L ^ (long)n2 ^ 0xE81E1440CD001CFEL);
                            n3 = (-229268962 * -2022996079 + 1538399901 ^ n2) + -930653844 - -930653844;
                            int cfr_ignored_32 = (int)(0x319788C2DE265A24L ^ (long)n2 ^ 0xECF570FF4F6FCEFEL);
                            n3 = (1389914501 * -2022996079 + 1538399901 ^ n2) + 776158336 - 776158336;
                            n -= 5;
                            continue;
                        }
                        int cfr_ignored_33 = (Integer.rotateLeft(0xAAF6EFBC ^ n2, 8) - -1203460353) * -1426657347;
                        n3 = (-1105176928 * -2022996079 + 1538399901 ^ n2) + -1278782729 - -1278782729;
                        int cfr_ignored_34 = Integer.rotateRight(0x82E864A6 ^ n2, 3) - -561918123;
                        int cfr_ignored_35 = (int)(0x18BD58A468864684L ^ (long)n2 ^ 0x4C381DBF762F9CABL);
                        n3 = 688279277 * -2022996079 + 1538399901 ^ n2 ^ 0x5EB2E1A0 ^ 0x5EB2E1A0;
                        int cfr_ignored_36 = (int)(0x7C4474060A54B6DEL ^ (long)n2 ^ 0x157CD81A969B5559L);
                        n3 = 1389914501 * -2022996079 + 1538399901 ^ n2;
                        n -= 5;
                        continue;
                    }
                    int cfr_ignored_37 = Integer.rotateRight(0x24BD8A07 ^ n2, 7) - 2001819156;
                    n3 = 1439102721 * -2022996079 + 1538399901 ^ n2;
                    int cfr_ignored_38 = Integer.rotateRight(0xC2014446 ^ n2, 11) - -2105220171;
                    n3 = (int)((long)(756770679 * -2022996079 + 1538399901 ^ n2) ^ 0x2989D4BC6621D197L ^ 0x2989D4BC6621D197L);
                    int cfr_ignored_39 = (Integer.rotateLeft(0xDDF3BB3C ^ n2, 14) - -454997121) * -571229379;
                    n3 = 1389914501 * -2022996079 + 1538399901 ^ n2;
                    continue;
                }
                int cfr_ignored_40 = (Integer.rotateLeft(0xE54AD498 ^ n2, 15) + -932356701) * -448080743;
                n3 = (int)((long)(-927289539 * -2022996079 + 1538399901 ^ n2) ^ 0x60F7FDB3EC129FB2L ^ 0x60F7FDB3EC129FB2L);
                int cfr_ignored_41 = (Integer.rotateRight(0x56517D7E ^ n2, 13) - 2017186173) * 1448181119;
                try {
                    n3 = 1389914501 * -2022996079 + 1538399901 ^ n2;
                }
                catch (ArithmeticException arithmeticException) {
                    n3 = (1389914501 * -2022996079 + 1538399901 ^ n2) + -315734738 - -315734738;
                }
                continue;
            }
            int cfr_ignored_42 = (Integer.rotateLeft(0xE946A9FD ^ n2, 16) - 1139553502) * -381244931;
            int cfr_ignored_43 = (int)(0x2BF407C027D4EB4FL ^ (long)n2 ^ 0xF2F0831A2DB9FA39L);
            n3 = (1389914501 * -2022996079 + 1538399901 ^ n2) + 1200624392 - 1200624392;
        }
    }

    private static String dkt_2(String string, int n, int n2, int n3) {
        int n4 = tkhj.tghs_4(1703844674);
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = Integer.rotateRight(n ^ n4, 20)) ^ 0x90DA52A7;
        if ((n5 ^ n4) != -1864740185) {
            int cfr_ignored_0 = Integer.rotateLeft(0xF554C9E5 ^ n4, 17) - -1180560906;
            int cfr_ignored_1 = (int)(0x37E667D827D4EB4FL ^ (long)n4 ^ 0x32C0831A2DB9C21DL);
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x5269CCBF ^ n2 - i) + hnj, 22) ^ khshs_2 + i * -89330777));
        }
        return new String(cArray);
    }

    private static String sdhn_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1008222957;
            n4 = Integer.rotateLeft(n4 * 2025554017, 24) ^ 0xA86398C2;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 24)) ^ 0xA0CDCA5C;
            if ((n5 ^ n4) == -1597126052) break block0;
            int cfr_ignored_0 = (0x9CD588B1 ^ n4) + -1926454759;
        }
        return wd.dkt_2(string, n, n2, n3);
    }

    private static boolean thnt_2(String string, Object object) {
        block0: {
            int n = 1349597546;
            n = Integer.rotateLeft(n * 1496752859, 7) ^ 0x27C1A969;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            Object object2 = object;
            n = Integer.rotateLeft((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 27);
            int n2 = n ^ 0xD733C36B;
            if ((n2 ^ n) == -684473493) break block0;
            int cfr_ignored_0 = (0x8742FA01 ^ n) - 147650129;
        }
        return string.equals(object);
    }

    private static int bbb(int n) {
        block0: {
            int n2 = -956818332;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1907804275, 4) ^ 0xEDFA7008) ^ 0x233D4D42;
            if ((n3 ^ n2) == 591220034) break block0;
            int cfr_ignored_0 = (0xE5C55126 ^ n2) + -1956325916;
        }
        return Integer.reverse(n);
    }

    private static int qd(int n) {
        block0: {
            int n2 = 311414517;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1715076861, 7) ^ 0xEEEF78ED) ^ 0x227C2835;
            if ((n3 ^ n2) == 578562101) break block0;
            int cfr_ignored_0 = (0x30F3E6C0 ^ n2) + -1446031462;
        }
        return Integer.reverse(n);
    }

    private static int shyl(int n) {
        block0: {
            int n2 = -858998035;
            n2 = Integer.rotateLeft(n2 * 549650557, 12) ^ 0x2B132DBB;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 28)) ^ 0xF4F95D57;
            if ((n3 ^ n2) == -184984233) break block0;
            int cfr_ignored_0 = (0x3835E7BA ^ n2) - -548148247;
        }
        return Integer.reverse(n);
    }

    private static int dhfr(int n, int n2) {
        block0: {
            int n3 = tkhj.tghs_4(634701470);
            int n4 = n3 ^ 0x68329C35;
            if ((n4 ^ n3) == 1748147253) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x4DE65AAB ^ n3, 12) + 1933744624;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String drw_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 847216609;
            n4 = Integer.rotateLeft(n4 * -51406973, 11) ^ 0x82DA4DAA;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 5)) ^ 0x5046C149;
            if ((n5 ^ n4) == 1346814281) break block0;
            int cfr_ignored_0 = (0x6239BEA8 ^ n4) - -313372020;
        }
        return wd.dkt_2(string, n, n2, n3);
    }

    private static String ars_2(String string, String string2) {
        block0: {
            int n = tkhj.tghs_4(399100197);
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            String string4 = string2;
            n = Integer.rotateLeft((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 15);
            int n2 = n ^ 0x469327D;
            if ((n2 ^ n) == 74003069) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x13A0FB58 ^ n, 5) + 1692143331) * 329317209;
        }
        return string.concat(string2);
    }

    private static int aath_2(int n, int n2) {
        block0: {
            int n3 = 1935210114;
            n3 = Integer.rotateLeft(n3 * -1607587365, 24) ^ 0x5C4D1DE9;
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 29)) ^ 0x6DD81AE9;
            if ((n4 ^ n3) == 1842879209) break block0;
            int cfr_ignored_0 = (0x1E80EC6B ^ n3) + -997390324;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String thghd_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -556428466;
            n4 = Integer.rotateLeft(n4 * -1281965049, 12) ^ 0x2AF7223D;
            n4 = n2 ^ n4;
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 21)) ^ 0x9AFAFBC4;
            if ((n5 ^ n4) == -1694827580) break block0;
            int cfr_ignored_0 = (0x442F688A ^ n4) - -1972004367;
        }
        return wd.dkt_2(string, n, n2, n3);
    }

    private static String shshs(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1306214255;
            n4 = Integer.rotateLeft(n4 * 334022477, 6) ^ 0xC1974641;
            n4 = n ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0xF832B5B4;
            if ((n5 ^ n4) == -130894412) break block0;
            int cfr_ignored_0 = (0xB5E98ADB ^ n4) + -15714220;
        }
        return wd.dkt_2(string, n, n2, n3);
    }

    private static String thkh_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tkhj.tghs_4(-385790027);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0xB19920F5;
            if ((n5 ^ n4) == -1315364619) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x58986F40 ^ n4, 14) + -1093462021;
        }
        return wd.dkt_2(string, n, n2, n3);
    }

    private static boolean tah_6(String string, Object object) {
        block0: {
            int n = -1386109015;
            int n2 = (n = Integer.rotateLeft(n * 835244091, 25) ^ 0xC5A6D169) ^ 0xCD224641;
            if ((n2 ^ n) == -853391807) break block0;
            int cfr_ignored_0 = (0x6043E1E8 ^ n) + -1004895997;
        }
        return string.equals(object);
    }

    private static boolean sshf(String string, Object object) {
        block0: {
            int n = tkhj.tghs_4(1531114170);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            Object object2 = object;
            n = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 19);
            int n2 = n ^ 0x528B9E88;
            if ((n2 ^ n) == 1384881800) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x9C96C32 ^ n, 4) + 868333897) * 164195379;
        }
        return string.equals(object);
    }

    private static float bghl(int n) {
        block0: {
            int n2 = tkhj.tghs_4(-1270056134);
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 9)) ^ 0xF9B5E36D;
            if ((n3 ^ n2) == -105520275) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x4DF99857 ^ n2, 12) - 1972834756) * 1308203095;
        }
        return Float.intBitsToFloat(n);
    }

    private static float shhw_2(int n) {
        block0: {
            int n2 = tkhj.tghs_4(1614534749);
            int n3 = n2 ^ 0x234C4E28;
            if ((n3 ^ n2) == 592203304) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x43779675 ^ n2, 11) - 802740070) * 1131910773;
            int cfr_ignored_1 = (int)(0x81C5384827D4EB4FL ^ (long)n2 ^ 0x8DE0831A2DB8AE5BL);
        }
        return Float.intBitsToFloat(n);
    }

    private static String syz_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tkhj.tghs_4(-798650917);
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 28)) ^ 0xC08FD6CC;
            if ((n5 ^ n4) == -1064315188) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x10EA5B17 ^ n4, 5) - 280930052) * 283794199;
        }
        return wd.dkt_2(string, n, n2, n3);
    }

    private static String ztz_7(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1387568534;
            n4 = Integer.rotateLeft(n4 * 1419579585, 26) ^ 0x4F7C8FAF;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 25);
            int n5 = (n4 = n3 ^ n4) ^ 0xA7CE9184;
            if ((n5 ^ n4) == -1479634556) break block0;
            int cfr_ignored_0 = (0xF57A0C12 ^ n4) + 2018533294;
        }
        return wd.dkt_2(string, n, n2, n3);
    }

    private static String zghb_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -886965799;
            n4 = Integer.rotateLeft(n4 * -1306346677, 24) ^ 0x9E609FAA;
            n4 = n ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0xC016A824;
            if ((n5 ^ n4) == -1072256988) break block0;
            int cfr_ignored_0 = (0xB3751FD ^ n4) - 877479992;
        }
        return wd.dkt_2(string, n, n2, n3);
    }

    private static Long zkh_5(long l) {
        block0: {
            int n = -1719195718;
            int n2 = (n = Integer.rotateLeft(n * -2007592575, 19) ^ 0x7E3D5B90) ^ 0x59FCB3B6;
            if ((n2 ^ n) == 1509733302) break block0;
            int cfr_ignored_0 = (0xC07B940C ^ n) + 1104705007;
        }
        return l;
    }

    private static String sghj(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1556744147;
            n4 = Integer.rotateLeft(n4 * -570052357, 4) ^ 0x4BF0E11F;
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 14)) ^ 0x1D45DDD7;
            if ((n5 ^ n4) == 491118039) break block0;
            int cfr_ignored_0 = (0x418FDA04 ^ n4) - -1750734178;
        }
        return wd.dkt_2(string, n, n2, n3);
    }

    private static boolean thqk() {
        block0: {
            int n = 1197887312;
            int n2 = (n = Integer.rotateLeft(n * 374493485, 24) ^ 0x241A3917) ^ 0x5AB8AC9;
            if ((n2 ^ n) == 95128265) break block0;
            int cfr_ignored_0 = (0x42CDC599 ^ n) + -490018532;
        }
        return yf.khdha_2();
    }

    private static double rnt_2(long l) {
        block0: {
            int n = tkhj.tghs_4(-1764821846);
            int n2 = n ^ 0xFFE45486;
            if ((n2 ^ n) == -1813370) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x692AA02C ^ n, 16) - -1064893297;
        }
        return Double.longBitsToDouble(l);
    }

    private static boolean std_6() {
        block0: {
            int n = 238080662;
            int n2 = (n = Integer.rotateLeft(n * -1062954823, 4) ^ 0xF3F668C9) ^ 0xE60DAB96;
            if ((n2 ^ n) == -435311722) break block0;
            int cfr_ignored_0 = (0xE83D7900 ^ n) + 1795343377;
        }
        return yf.khdha_2();
    }

    private static double thyk(double d, double d2, double d3) {
        block0: {
            int n = -1074557760;
            n = Integer.rotateLeft(n * -1147676267, 9) ^ 0x8EDD4828;
            n = (int)Double.doubleToLongBits(d) ^ n;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d2) ^ n, 8);
            int n2 = n ^ 0x81768DDF;
            if ((n2 ^ n) == -2122936865) break block0;
            int cfr_ignored_0 = (0x3E85011F ^ n) - -1908480345;
        }
        return class_3532.method_15350((double)d, (double)d2, (double)d3);
    }

    private static String[] ra(String string) {
        block0: {
            int n = 145747414;
            n = Integer.rotateLeft(n * -1449377567, 10) ^ 0x1C7A6CFD;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 15);
            int n2 = n ^ 0x409D3168;
            if ((n2 ^ n) == 1084043624) break block0;
            int cfr_ignored_0 = (0x4832DCBE ^ n) + -2009504402;
        }
        return string.split("\u0005\u0016", -1);
    }

    private static CallSite aka(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1301408305;
            n3 = Integer.rotateLeft(n3 * -1486679707, 14) ^ 0xAE2C7F9C;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 29);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 14);
            int n4 = n3 ^ 0x75E596B4;
            if ((n4 ^ n3) != 1977980596) {
                int cfr_ignored_0 = (0xC78B837B ^ n3) + -1880383435;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ zsa ^ string.hashCode() ^ n2 + daa_3 ^ i * -1006103087 ^ zsa, 6) ^ daa_3));
            }
            String[] stringArray = wd.ra(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] glxre117(String string) {
        return string.split("\u0002\u000e", -1);
    }

    private static CallSite v12mj7f92em8zq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ gy9hkvxitwx ^ string.hashCode() ^ n2 + b8vnfs8oftvf ^ i * 340169879 ^ gy9hkvxitwx, 18) ^ b8vnfs8oftvf));
            }
            String[] stringArray = wd.glxre117(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

