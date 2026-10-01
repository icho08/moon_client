/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_304
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bjd;
import us.m0vy.moondlc.m0vyguard.bdth;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tsf;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="TargetStrafe", category=bzw.OTHER, desc="Strafes around your Aura combat target")
public class tda
extends bnq {
    private final khd wy = new khd(this, "Mode");
    private final fy dhfh = new fy(this.wy, "Matrix");
    private final fy khrm = new fy(this.wy, "Grim");
    private final khd shs = new khd((hy)this, "Grim Point", this::tkh_3);
    private final fy khft = new fy(this.shs, "Cube");
    private final fy rqk = new fy(this.shs, "Center");
    private final fy smsh = new fy(this.shs, "Circle");
    private final khd shhr_2 = new khd((hy)this, "Matrix Point", this::bad_4);
    private final fy ray_2 = new fy(this.shhr_2, "Circle");
    private final fy dhyl = new fy(this.shhr_2, "Cube");
    private final khd jqt = new khd(this, "Direction");
    private final fy jat_4 = new fy(this.jqt, "Clockwise");
    private final fy zam = new fy(this.jqt, "Counterclockwise");
    private final fy haw_2 = new fy(this.jqt, "Random");
    private final badh_2 zwsh = new badh_2(this, "Auto Jump").bts(true);
    private final badh_2 zfs = new badh_2(this, "Only Key Pressed").bts(false);
    private final badh_2 bkhk = new badh_2(this, "In Front O".concat("f Target")).bts(false);
    private final tay ztl = new tay((hy)this, "Grim Radius", this::jysh).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x710CAB4B ^ 0xBDDF7787, 12))).dhbs_2(Float.intBitsToFloat(Integer.reverse(991621401) ^ 0xA74F58DC)).rkh_3(Float.intBitsToFloat(1817425128 - 808443358)).ssd_5(Float.intBitsToFloat(Integer.reverse(-682242564) ^ 0xED12B9));
    private final tay drt = new tay((hy)this, "Matrix R".concat("adius"), this::sdz_6).shth_7(Float.intBitsToFloat(251516493 - -785315456)).dhbs_2(Float.intBitsToFloat(-65936086 + 1154357974)).rkh_3(Float.intBitsToFloat(Integer.reverse(-829479423) ^ 0xBC472679)).ssd_5(Float.intBitsToFloat(-2068677229 - 1150451091));
    private final tay tdt = new tay((hy)this, "Matrix S".concat("peed"), this::zsf_3).shth_7(Float.intBitsToFloat(128357705 + 908474244)).dhbs_2(1.0f).rkh_3(Float.intBitsToFloat(Integer.reverse(-954495894) ^ 0x6A120FE9)).ssd_5(Float.intBitsToFloat(-2019601632 + -1225111942));
    private int znkh = 0;
    private final bql<tsf> dkhj = this::hdh_5;
    private final bql<btt> hty = this::ft;
    private static final int rla_2 = -134783599;
    private static final int jfsh = -825708889;
    private static final int trth = -1063734837;
    private static final int drw = -131250326;
    private static final int skhimrgcuxyuq = -398777644;
    private static final int qwgadhf85 = -235696528;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int lc0rs6ta;

    @Override
    public void nt() {
        int n = -1842599699;
        n = Integer.rotateLeft(n * -612828937, 18) ^ 0x2F2942DF;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 18);
        int n2 = n ^ 0xED98E9EE;
        if ((n2 ^ n) != -308745746) {
            int cfr_ignored_0 = (0x7FB4C103 ^ n) + -1632234164;
        }
        this.znkh = 0;
    }

    private boolean shqth() {
        int n;
        block4: {
            try {
                int n2 = 567637738;
                n2 = Integer.rotateLeft(n2 * -529665327, 24) ^ 0x4055A389;
                n2 = System.identityHashCode(this) ^ n2;
                int n3 = n2 ^ 0x48BB2246;
                if ((n3 ^ n2) != 1220223558) {
                    int cfr_ignored_0 = (0x696E54AC ^ n2) + -579845649;
                }
                if ((0x2B5 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = tda.mc.field_1690.field_1894.method_1434() || tda.rz_2(tda.mc.field_1690.field_1881) || tda.mc.field_1690.field_1913.method_1434() || tda.rks_2(tda.mc.field_1690.field_1849) ? 1 : 0;
            if (tda.thhb_2() != 0) break block4;
            n = n ^ 0x624B;
        }
        return n != 0;
    }

    private class_1309 jyy() {
        return bjd.shfn();
    }

    private int haz() {
        if (this.zam.shghkh()) {
            return -1;
        }
        if (this.haw_2.shghkh()) {
            return System.currentTimeMillis() / 3000L % 2L == 0L ? 1 : -1;
        }
        return 1;
    }

    private class_243[] rtdh(class_243 class_2432, class_243 class_2433, double d) {
        try {
            int n = -905904765;
            n = Integer.rotateLeft(n * -65672801, 9) ^ 0x98751DE5;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 22);
            class_243 class_2434 = class_2432;
            n = (class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n;
            int n2 = n ^ 0xEDE2FD97;
            if ((n2 ^ n) != -303891049) {
                int cfr_ignored_0 = (0x27E20014 ^ n) - -35485221;
            }
            if ((0x374 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return new class_243[]{new class_243(class_2432.field_1352 - d, class_2433.field_1351, class_2432.field_1350 - d), new class_243(class_2432.field_1352 - d, class_2433.field_1351, class_2432.field_1350 + d), new class_243(class_2432.field_1352 + d, class_2433.field_1351, class_2432.field_1350 + d), new class_243(class_2432.field_1352 + d, class_2433.field_1351, class_2432.field_1350 - d)};
    }

    private void ft(btt btt2) {
        try {
            int n = -303548822;
            n = Integer.rotateLeft(n * -1721958149, 10) ^ 0xB5938CA1;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0xD2253C2F;
            if ((n2 ^ n) != -769311697) {
                int cfr_ignored_0 = (0x3FCD0A45 ^ n) + -418004704;
            }
            if ((0x220 & 0) != 0) {
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
        if (tda.mc.field_1724 == null || tda.mc.field_1687 == null) {
            return;
        }
        if (!this.dhfh.shghkh()) {
            return;
        }
        class_1309 class_13092 = this.jyy();
        if (class_13092 == null || !class_13092.method_5805() || (double)tda.mc.field_1724.method_5739((class_1297)class_13092) > Double.longBitsToDouble(0xA2FF5313DCFB043EL ^ 0xE2E75313DCFB043EL)) {
            return;
        }
        if (this.zfs.shzl() && !this.shqth()) {
            return;
        }
        if (this.zwsh.shzl() && tda.mc.field_1724.method_24828()) {
            tda.mc.field_1724.method_6043();
        }
        class_243 class_2432 = tda.mc.field_1724.method_19538();
        class_243 class_2433 = class_13092.method_19538();
        double d = this.drt.thw_5();
        int n = this.haz();
        double d2 = this.tdt.thw_5();
        if (this.bkhk.shzl()) {
            float f = class_13092.method_36454();
            double d3 = class_2433.field_1352 - Math.sin(Math.toRadians(f)) * d * (double)n;
            double d4 = class_2433.field_1350 + Math.cos(Math.toRadians(f)) * d * (double)n;
            float f2 = (float)Math.toDegrees(Math.atan2(d4 - class_2432.field_1350, d3 - class_2432.field_1352)) - Float.intBitsToFloat(0xE6B2EA57 ^ 0xA406EA57);
            tda.mc.field_1724.method_18800(-Math.sin(Math.toRadians(f2)) * d2, tda.mc.field_1724.method_18798().field_1351, Math.cos(Math.toRadians(f2)) * d2);
            return;
        }
        if (this.dhyl.shghkh()) {
            class_243[] class_243Array = this.rtdh(class_2433, class_2432, d);
            if (class_2432.method_1022(class_243Array[this.znkh]) < Double.longBitsToDouble(0x888C8695F1582D41L ^ 0xB76C8695F1582D41L)) {
                this.znkh = (this.znkh + n + class_243Array.length) % class_243Array.length;
            }
            class_243 class_2434 = class_243Array[this.znkh];
            class_243 class_2435 = class_2434.method_1020(class_2432).method_1029();
            float f = (float)Math.toDegrees(Math.atan2(class_2435.field_1350, class_2435.field_1352)) - Float.intBitsToFloat(1636929636 - 517836900);
            tda.mc.field_1724.method_18800(-Math.sin(Math.toRadians(f)) * d2, tda.mc.field_1724.method_18798().field_1351, Math.cos(Math.toRadians(f)) * d2);
        } else {
            double d5 = Math.atan2(class_2432.field_1350 - class_2433.field_1350, class_2432.field_1352 - class_2433.field_1352);
            double d6 = class_2433.field_1352 + d * Math.cos(d5 += (double)n * d2 / Math.max(class_2432.method_1022(class_2433), d));
            double d7 = class_2433.field_1350 + d * Math.sin(d5);
            float f = (float)Math.toDegrees(Math.atan2(d7 - class_2432.field_1350, d6 - class_2432.field_1352)) - Float.intBitsToFloat(1978924614 - 859831878);
            tda.mc.field_1724.method_18800(-Math.sin(Math.toRadians(f)) * d2, tda.mc.field_1724.method_18798().field_1351, Math.cos(Math.toRadians(f)) * d2);
        }
    }

    private void hdh_5(tsf tsf2) {
        class_243 class_2432;
        try {
            int n = -1365638816;
            n = Integer.rotateLeft(n * -1816843221, 14) ^ 0x92A90F64;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 26);
            tsf tsf3 = tsf2;
            n = (tsf3 != null ? System.identityHashCode(tsf3) : 0) ^ n;
            int n2 = n ^ 0x22C11CBB;
            if ((n2 ^ n) != 583081147) {
                int cfr_ignored_0 = (0x8C5B1DDB ^ n) - 356271508;
            }
            if ((0x135 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (tda.mc.field_1724 == null || tda.mc.field_1687 == null) {
            return;
        }
        if (!this.khrm.shghkh()) {
            return;
        }
        class_1309 class_13092 = this.jyy();
        if (class_13092 == null || !class_13092.method_5805() || (double)tda.mc.field_1724.method_5739((class_1297)class_13092) > Double.longBitsToDouble(0x3CB53F3C8DC61A8L ^ 0x43D353F3C8DC61A8L)) {
            return;
        }
        if (this.zfs.shzl() && !this.shqth()) {
            return;
        }
        class_243 class_2433 = tda.mc.field_1724.method_19538();
        class_243 class_2434 = class_13092.method_19538();
        double d = this.ztl.thw_5();
        int n = this.haz();
        if (this.bkhk.shzl()) {
            float f = class_13092.method_36454();
            if (this.rqk.shghkh()) {
                class_2432 = class_2434.method_1031(-Math.sin(Math.toRadians(f)) * d * (double)n, 0.0, Math.cos(Math.toRadians(f)) * d * (double)n);
            } else {
                double d2 = Math.cos((double)System.currentTimeMillis() / Double.longBitsToDouble(0x56ABF1A175EF93F8L ^ 0x16D4B1A175EF93F8L)) * d * (double)n;
                class_2432 = class_2434.method_1031(-Math.sin(Math.toRadians(f)) * d + Math.cos(Math.toRadians(f)) * d2, 0.0, Math.cos(Math.toRadians(f)) * d + Math.sin(Math.toRadians(f)) * d2);
            }
        } else if (this.khft.shghkh()) {
            class_243[] class_243Array = this.rtdh(class_2434, class_2433, d);
            if (class_2433.method_1022(class_243Array[this.znkh]) < Double.longBitsToDouble(0xF709A37877E8911AL ^ 0xC8E9A37877E8911AL)) {
                this.znkh = (this.znkh + n + class_243Array.length) % class_243Array.length;
            }
            class_2432 = class_243Array[this.znkh];
        } else if (this.smsh.shghkh()) {
            double d3 = (double)(System.currentTimeMillis() % (0x5A369AC6EEA40EDDL ^ 0x5A369AC6EEA400CDL)) / Double.longBitsToDouble(0xEC9A3D01F4F848C6L ^ 0xAC361D01F4F848C6L) * Double.longBitsToDouble(0x111AB3A797BBD62DL ^ 0x510AB3A797BBD62DL) * Double.longBitsToDouble(0x3B200B9A7028C86EL ^ 0x7B292A61246CE576L);
            double d4 = n > 0 ? d3 : Double.longBitsToDouble(0xA8AADC6924EC2F4AL ^ 0xE8B3FD9270A80252L) - d3;
            class_2432 = new class_243(class_2434.field_1352 + Math.cos(d4) * d, class_2433.field_1351, class_2434.field_1350 + Math.sin(d4) * d);
        } else {
            class_2432 = new class_243(class_2434.field_1352, class_2433.field_1351, class_2434.field_1350);
        }
        class_243 class_2435 = class_2432.method_1020(class_2433).method_1029();
        float f = (float)Math.toDegrees(Math.atan2(class_2435.field_1350, class_2435.field_1352)) - Float.intBitsToFloat(276364423 + 842728313);
        float f2 = class_3532.method_15393((float)(f - tda.mc.field_1724.method_36454()));
        float f3 = 0.0f;
        float f4 = 0.0f;
        if (f2 >= Float.intBitsToFloat(0xAF5F9CBD ^ 0x6EEB9CBD) && f2 < Float.intBitsToFloat(1385085431 + -282769911)) {
            f3 = 1.0f;
        } else if (f2 >= Float.intBitsToFloat(0xFC5C489 ^ 0x4E71C489) && f2 < Float.intBitsToFloat(-1590339017 - 1588484663)) {
            f3 = 1.0f;
            f4 = Float.intBitsToFloat(944903921 + -2027034353);
        } else if (f2 >= Float.intBitsToFloat(Integer.reverse(1861559811) ^ 0x82E3AF76) && f2 < Float.intBitsToFloat(Integer.rotateLeft(0x1E6A0C68 ^ 0x3E6A0434, 19))) {
            f4 = Float.intBitsToFloat(Integer.reverse(-1280463907) ^ 0x455B5CD);
        } else if (f2 >= Float.intBitsToFloat(0x973ABFB0 ^ 0xD5DBBFB0) && f2 < Float.intBitsToFloat(Integer.rotateLeft(0xED1C5EBD ^ 0xEC1028BD, 6))) {
            f3 = Float.intBitsToFloat(0xA1DA1F20 ^ 0x1E5A1F20);
            f4 = Float.intBitsToFloat(1197957886 - -2014878978);
        } else if (f2 >= Float.intBitsToFloat(0x57EB4752 ^ 0x956C4752) && f2 < Float.intBitsToFloat(-606850791 + -438317337)) {
            f3 = 1.0f;
            f4 = 1.0f;
        } else if (f2 >= Float.intBitsToFloat(0x26F20B27 ^ 0xE4130B27) && f2 < Float.intBitsToFloat(0x23A8101E ^ 0xE12F101E)) {
            f4 = 1.0f;
        } else if (f2 >= Float.intBitsToFloat(Integer.rotateLeft(0x46816B0B ^ 0x77596B07, 28)) && f2 < Float.intBitsToFloat(Integer.rotateLeft(0x83CAFC38 ^ 0x83CB79FA, 15))) {
            f3 = Float.intBitsToFloat(Integer.rotateLeft(0xCB195AB2 ^ 0xCB19584C, 22));
            f4 = 1.0f;
        } else {
            f3 = Float.intBitsToFloat(-1380365627 - -298235195);
        }
        tsf2.thds_4(f3);
        tsf2.dshb(f4);
        if (this.zwsh.shzl() && tda.mc.field_1724.method_24828()) {
            tsf2.khht(true);
        }
    }

    private boolean zsf_3() {
        try {
            int n = 2115385395;
            n = Integer.rotateLeft(n * -313193611, 22) ^ 0x84BBE10A;
            int n2 = n ^ 0x713947DE;
            if ((n2 ^ n) != 1899579358) {
                int cfr_ignored_0 = (0xF2F7FED ^ n) + 856970970;
            }
            if ((0x127 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.dhfh.shghkh();
    }

    private boolean sdz_6() {
        try {
            int n = 595072212;
            n = Integer.rotateLeft(n * -1062323679, 6) ^ 0x1604ADC9;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xC92F1DA4;
            if ((n2 ^ n) != -919659100) {
                int cfr_ignored_0 = (0xEA570970 ^ n) - 1851293719;
            }
            if ((0x232 & 0) != 0) {
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
        return !this.dhfh.shghkh();
    }

    private boolean jysh() {
        int n;
        block1: {
            int n2 = bdth.sash_2(2051162271);
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 21);
            int n3 = n2 ^ 0xDCD08891;
            if ((n3 ^ n2) != -590313327) {
                int cfr_ignored_0 = Integer.rotateRight(0xA692C80E ^ n2, 7) - 807655661;
            }
            n = !this.khrm.shghkh() ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0x23BF;
        }
        return n != 0;
    }

    private boolean bad_4() {
        try {
            int n = -510136968;
            n = Integer.rotateLeft(n * 2120912031, 24) ^ 0x8438D981;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 22);
            int n2 = n ^ 0x61ECDF87;
            if ((n2 ^ n) != 1642913671) {
                int cfr_ignored_0 = (0x807B32FF ^ n) + -447832509;
            }
            if ((0x31B & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.dhfh.shghkh();
    }

    private boolean tkh_3() {
        int n = 1655763131;
        int n2 = (n = Integer.rotateLeft(n * -1071624041, 14) ^ 0x2DD5AC4D) ^ 0xAB0ACE77;
        if ((n2 ^ n) != -1425355145) {
            int cfr_ignored_0 = (0xC9BA3ECC ^ n) - 510061641;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.khrm.shghkh();
    }

    private static String ssw_3(String string, int n, int n2, int n3) {
        int n4 = 596031910;
        n4 = Integer.rotateLeft(n4 * 1659711077, 28) ^ 0xB149DC2D;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = n ^ n4) ^ 0xB3B6FCE4;
        if ((n5 ^ n4) != -1279853340) {
            int cfr_ignored_0 = (0x90304542 ^ n4) - -1330769145;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xC06B12BA) + i ^ rla_2, 18) ^ n2 + jfsh));
        }
        return new String(cArray);
    }

    private static boolean rz_2(class_304 class_3042) {
        block0: {
            int n = -501676728;
            int n2 = (n = Integer.rotateLeft(n * 1143097513, 19) ^ 0x2179E6CC) ^ 0x13BCD249;
            if ((n2 ^ n) == 331141705) break block0;
            int cfr_ignored_0 = (0xF1A5D701 ^ n) + -2038320522;
        }
        return class_3042.method_1434();
    }

    private static boolean rks_2(class_304 class_3042) {
        block0: {
            int n = -1191364832;
            n = Integer.rotateLeft(n * -1217918875, 14) ^ 0xCC21998F;
            class_304 class_3043 = class_3042;
            n = (class_3043 != null ? System.identityHashCode(class_3043) : 0) ^ n;
            int n2 = n ^ 0xD2A89B36;
            if ((n2 ^ n) == -760702154) break block0;
            int cfr_ignored_0 = (0x6A55AC16 ^ n) - -1617079035;
        }
        return class_3042.method_1434();
    }

    private static int thhb_2() {
        block0: {
            int n = -1933026768;
            int n2 = (n = Integer.rotateLeft(n * 2017153453, 12) ^ 0x6EFB37D3) ^ 0x4CAF2767;
            if ((n2 ^ n) == 1286547303) break block0;
            int cfr_ignored_0 = (0xC0677D57 ^ n) + 1398080225;
        }
        return yf.tdhth_2();
    }

    private static String[] thdl(String string) {
        int n = 311488010;
        int n2 = (n = Integer.rotateLeft(n * 6336679, 4) ^ 0x95134DD1) ^ 0xFC52D8B9;
        if ((n2 ^ n) != -61679431) {
            int cfr_ignored_0 = (0xEEC236B3 ^ n) - -1679975622;
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite jrq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -317033377;
            n3 = Integer.rotateLeft(n3 * -1086751789, 6) ^ 0xD4EA9192;
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            n3 = Integer.rotateLeft(n ^ n3, 23);
            int n4 = n3 ^ 0x927DB820;
            if ((n4 ^ n3) != -1837254624) {
                int cfr_ignored_0 = (0x7F67CC7F ^ n3) - -109562991;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ trth ^ string.hashCode()) + (n2 + drw) + i ^ trth, 22) + drw);
            }
            String[] stringArray = tda.thdl(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] mfz5ayw2jw(String string) {
        return string.split("\u0004\u0019", -1);
    }

    private static CallSite bcgpnfacn6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ skhimrgcuxyuq ^ string.hashCode() ^ n2 + qwgadhf85 ^ i * -152623977 ^ skhimrgcuxyuq, 23) ^ qwgadhf85));
            }
            String[] stringArray = tda.mfz5ayw2jw(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

