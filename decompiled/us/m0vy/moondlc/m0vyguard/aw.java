/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.class_10055
 *  net.minecraft.class_1011
 *  net.minecraft.class_1043
 *  net.minecraft.class_1044
 *  net.minecraft.class_1060
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_742
 *  net.minecraft.class_8685
 *  net.minecraft.class_8685$class_7920
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.authlib.GameProfile;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.class_10055;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_1060;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_742;
import net.minecraft.class_8685;
import us.m0vy.moondlc.m0vyguard.bbd_2;
import us.m0vy.moondlc.m0vyguard.bdhgh;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bsh_3;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hl;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.kh_3;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

@tq_2(name="Capes", category=bzw.OTHER, desc="Selects and smoothly animates player capes")
public class aw
extends bnq {
    private static final class_2960 dhzk_2;
    private static final int thta_4 = 17;
    private static final long jfkh = 15000000000L;
    private static final Map dny;
    private static aw dhsz_4;
    private final khd rt_2 = new khd(this, "Cape");
    private final bbd_2 thsb_2 = new bbd_2(this, "Targets");
    private final s_3 rrl = new s_3(this.thsb_2, "Self").thst();
    private final s_3 tdw_2 = new s_3(this.thsb_2, "Friends");
    private final s_3 dhsgh = new s_3(this.thsb_2, "Enemies");
    private final badh_2 shjkh = new badh_2(this, "Elytra").bts(false);
    private final badh_2 jjy = new badh_2(this, "Wave Cape").bts(true);
    private final tay lk = new tay((hy)this, "Wave Strength", this::adf).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xA05C6352 ^ 0xA0586F52, 12))).rkh_3(Float.intBitsToFloat(0x204F53F2 ^ 0x1D839F3F)).ssd_5(Float.intBitsToFloat(-699020896 - -1773601581));
    private final tay zkhb = new tay((hy)this, "Wave Speed", this::jghj).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0x82A5706A ^ 0x8545706A, 3))).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x25CB0621 ^ 0x21C30621, 4))).rkh_3(Float.intBitsToFloat(0xD2C5D8C0 ^ 0xEF09140D)).ssd_5(Float.intBitsToFloat(0xB744951D ^ 0x88A2F37B));
    private final tay hwm = new tay((hy)this, "Wave S".concat("moothness"), this::bthsh).shth_7(Float.intBitsToFloat(958740163 - -119195965)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x16CE3A9E ^ 0x7ECE3A8E, 26))).rkh_3(Float.intBitsToFloat(Integer.reverse(1905232531) ^ 0xF651F18E)).ssd_5(Float.intBitsToFloat(269264680 + 824400088));
    private final Map shdh_6 = new HashMap();
    private class_1043 dhjs_2;
    private static final int hly = 1369772023;
    private static final int shwh_2 = 801273334;
    private static final int khka_2 = 1442887443;
    private static final int khnz = 1254634280;
    private static final int a7leoy4fke5n = 686253490;
    private static final int ch3shvmylhysl = 768527026;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int wy2qbokuqje;

    public aw() {
        dhsz_4 = this;
        new fy(this.rt_2, "Client").rhh_3();
        new fy(this.rt_2, "Vanilla");
        for (String string : dny.keySet()) {
            new fy(this.rt_2, string);
        }
    }

    public static aw tqd_2() {
        block0: {
            int n = bdhgh.dwz_4(-2034541671);
            int n2 = n ^ 0xA2B2A15;
            if ((n2 ^ n) == 170600981) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x8C90718C ^ n, 4) - 165371695;
        }
        return dhsz_4;
    }

    @Override
    public void nc() {
        int n = 0;
        int n2 = -1820808346;
        n2 = Integer.rotateLeft(n2 * 303943805, 5) ^ 0x442E09EE;
        int n3 = (n2 ^ 0x2ECF4EB9 ^ 0x2AB5EFF2) + 716566514;
        block20: while (true) {
            switch (n3 - 716566514 ^ 0x2AB5EFF2 ^ n2) {
                case 785338040: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0x8D845790 ^ n2, 4) + 660879787) * -1920706671;
                    if (aw.srz(mc) != null) {
                        n3 = (int)((long)((n2 ^ 0xC8F7E10 ^ 0x2AB5EFF2) + 716566514) ^ 0x7BCC08527E143EB2L ^ 0x7BCC08527E143EB2L);
                        int cfr_ignored_1 = Integer.rotateRight(0x5E329C07 ^ n2, 14) - 1820230676;
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x2ECF4EBB ^ 0x2AB5EFF2) + 716566514));
                        --n;
                        continue block20;
                    }
                    int cfr_ignored_2 = (int)(0xDD4AB543A9811470L ^ (long)n2 ^ 0x97F79FB1D3C61744L);
                    n3 = (n2 ^ 0x2ECF4EBA ^ 0x2AB5EFF2) + 716566514 ^ 0x7F89E04A ^ 0x7F89E04A;
                    n += 4;
                    continue block20;
                }
                case 785338042: {
                    int cfr_ignored_3 = (Integer.rotateRight(0x57EF035B ^ n2, 13) + -1437661376) * 1475281755;
                    this.dhjs_2 = null;
                    this.shdh_6.clear();
                    return;
                }
                case 785338043: {
                    int cfr_ignored_4 = (Integer.rotateRight(0x48B77D7A ^ n2, 12) + -761933567) * 1219984763;
                    mc.method_1531().method_4615(dhzk_2);
                    try {
                        n += 3;
                        if ((0x74C01126B2CBF32DL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (int)((long)((n2 ^ 0x2ECF4EBA ^ 0x2AB5EFF2) + 716566514) ^ 0xE03E786468162957L ^ 0xE03E786468162957L);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x2ECF4EBA ^ 0x2AB5EFF2) + 716566514));
                    }
                    n += 2;
                    continue block20;
                }
                case 785338041: {
                    int cfr_ignored_5 = (Integer.rotateLeft(0x558576D0 ^ n2, 13) + 1602683499) * 1434810065;
                    if (this.dhjs_2 == null) {
                        try {
                            --n;
                            if ((0x8F8E05583570B111L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n3 = (n2 ^ 0x2ECF4EBA ^ 0x2AB5EFF2) + 716566514;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = (n2 ^ 0x2ECF4EBA ^ 0x2AB5EFF2) + 716566514 + -1323264006 - -1323264006;
                        }
                        continue block20;
                    }
                    n3 = (n2 ^ 0x2ECF4EB8 ^ 0x2AB5EFF2) + 716566514 + 1958215990 - 1958215990;
                    int cfr_ignored_6 = (Integer.rotateLeft(0xCC7D85FC ^ n2, 12) - -946808641) * -864188931;
                    n += 5;
                    continue block20;
                }
                case 785338044: {
                    int cfr_ignored_7 = Integer.rotateRight(0xEDD0D06E ^ n2, 16) - -794370931;
                    n3 = (n2 ^ 0x2ECF4EB9 ^ 0x2AB5EFF2) + 716566514;
                    continue block20;
                }
                case 785338045: {
                    int cfr_ignored_8 = Integer.rotateRight(0x3CF16206 ^ n2, 10) - 1704492533;
                    n3 = (n2 ^ 0xC41AAE9A ^ 0x2AB5EFF2) + 716566514 + 19417684 - 19417684;
                    int cfr_ignored_9 = (Integer.rotateRight(0xA692F9BA ^ n2, 7) + 808049857) * -1500317253;
                    n3 = (n2 ^ 0x95E8A1F2 ^ 0x2AB5EFF2) + 716566514 ^ 0x80D52766 ^ 0x80D52766;
                    int cfr_ignored_10 = (Integer.rotateLeft(0x6429FAD4 ^ n2, 15) - 628293351) * 1680472789;
                    n3 = (int)((long)((n2 ^ 0x2ECF4EB9 ^ 0x2AB5EFF2) + 716566514) ^ 0x4C7AD1A6E44166F8L ^ 0x4C7AD1A6E44166F8L);
                    continue block20;
                }
                case 785338046: {
                    int cfr_ignored_11 = (Integer.rotateLeft(0x42E4587C ^ n2, 11) - 503600703) * 1122261117;
                    n3 = (n2 ^ 0x1D9C7251 ^ 0x2AB5EFF2) + 716566514 + -1287370327 - -1287370327;
                    int cfr_ignored_12 = (Integer.rotateLeft(0xA44F8691 ^ n2, 7) + -369169718) * -1538292079;
                    int cfr_ignored_13 = (int)(0x66FD28AC27D4EB4FL ^ (long)n2 ^ 0xAC28831A2DB9602BL);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x2ECF4EB9 ^ 0x2AB5EFF2) + 716566514));
                    n += 3;
                    continue block20;
                }
                case 785338047: {
                    int cfr_ignored_14 = Integer.rotateLeft(0x304A1908 ^ n2, 9) + -581523661;
                    n3 = (n2 ^ 0x1C7422AF ^ 0x2AB5EFF2) + 716566514;
                    int cfr_ignored_15 = (Integer.rotateRight(0xEB9ABAD2 ^ n2, 16) + -1944437079) * -342181165;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x2ECF4EB9 ^ 0x2AB5EFF2) + 716566514));
                    n -= 3;
                    continue block20;
                }
                case 785338048: {
                    int cfr_ignored_16 = (Integer.rotateRight(0x66357077 ^ n2, 15) - 1691762084) * 1714778231;
                    n3 = (n2 ^ 0x63782D85 ^ 0x2AB5EFF2) + 716566514 ^ 0x86C92925 ^ 0x86C92925;
                    int cfr_ignored_17 = Integer.rotateLeft(0x6BC920E5 ^ n2, 16) - 297310966;
                    int cfr_ignored_18 = (int)(0xA97B8ED827D4EB4FL ^ (long)n2 ^ 0xE0C0831A2DB8FF26L);
                    n3 = (n2 ^ 0x2ECF4EB9 ^ 0x2AB5EFF2) + 716566514 ^ 0xD4AB4089 ^ 0xD4AB4089;
                    int cfr_ignored_19 = Integer.rotateRight(0xAA02318A ^ n2, 8) + -1700684047;
                    continue block20;
                }
                case 785338049: {
                    int cfr_ignored_20 = Integer.rotateLeft(0x1F4B1DC5 ^ n2, 6) - -831112682;
                    int cfr_ignored_21 = (int)(0xDDF9B3F827D4EB4FL ^ (long)n2 ^ 0x9A80831A2DB81622L);
                    n3 = (n2 ^ 0x27636937 ^ 0x2AB5EFF2) + 716566514 ^ 0x755DCAFA ^ 0x755DCAFA;
                    int cfr_ignored_22 = (Integer.rotateLeft(0x786CF835 ^ n2, 18) - -1718637146) * 2020407349;
                    int cfr_ignored_23 = (int)(0xBADE560827D4EB4FL ^ (long)n2 ^ 0x5160831A2DB8D86DL);
                    int cfr_ignored_24 = (int)(0xFAB7EC26EB670B30L ^ (long)n2 ^ 0x253D1A7DED4658BEL);
                    n3 = (n2 ^ 0x1A1FA4C6 ^ 0x2AB5EFF2) + 716566514;
                    int cfr_ignored_25 = (int)(0x30944D0F67EF4369L ^ (long)n2 ^ 0x676E036D7DF5CCF9L);
                    n3 = (n2 ^ 0x2ECF4EB9 ^ 0x2AB5EFF2) + 716566514;
                    n += 4;
                    continue block20;
                }
                case 785338050: {
                    int cfr_ignored_26 = Integer.rotateLeft(0xCD0940C1 ^ n2, 12) + -662931814;
                    int cfr_ignored_27 = (int)(0xFBBEEFC27D4EB4FL ^ (long)n2 ^ 0x2088831A2DB9B2A6L);
                    n3 = (n2 ^ 0xBE2CF833 ^ 0x2AB5EFF2) + 716566514 ^ 0x83AAD0EC ^ 0x83AAD0EC;
                    int cfr_ignored_28 = Integer.rotateRight(0x44651C6B ^ n2, 11) + 1285296176;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xAAB294C5 ^ 0x2AB5EFF2) + 716566514));
                    int cfr_ignored_29 = (Integer.rotateLeft(0x94AF0FD8 ^ n2, 5) + 93358691) * -1800466471;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x2ECF4EB9 ^ 0x2AB5EFF2) + 716566514));
                    continue block20;
                }
                case 785338051: {
                    int cfr_ignored_30 = (Integer.rotateLeft(0xB8A616B0 ^ n2, 10) + 1618632331) * -1197074767;
                    n3 = (n2 ^ 0xCE9071B2 ^ 0x2AB5EFF2) + 716566514 + -1494576121 - -1494576121;
                    int cfr_ignored_31 = Integer.rotateLeft(0x8390C ^ n2, 3) - 89950127;
                    n3 = (n2 ^ 0x2ECF4EB9 ^ 0x2AB5EFF2) + 716566514 ^ 0x34A4F35C ^ 0x34A4F35C;
                    n -= 2;
                    continue block20;
                }
                case 785338052: {
                    int cfr_ignored_32 = Integer.rotateRight(0x3319047 ^ n2, 3) - 1734219732;
                    n3 = (n2 ^ 0x7165D8 ^ 0x2AB5EFF2) + 716566514 ^ 0x6358767 ^ 0x6358767;
                    int cfr_ignored_33 = Integer.rotateLeft(0x1C56F145 ^ n2, 6) - 1927599766;
                    int cfr_ignored_34 = (int)(0xDEE45F7827D4EB4FL ^ (long)n2 ^ 0x4380831A2DB81019L);
                    n3 = (n2 ^ 0x2ECF4EB9 ^ 0x2AB5EFF2) + 716566514 ^ 0x7DE43E05 ^ 0x7DE43E05;
                    ++n;
                    continue block20;
                }
                case 785338053: {
                    int cfr_ignored_35 = Integer.rotateRight(0x2CEDFDA6 ^ n2, 8) - 1966036565;
                    int cfr_ignored_36 = (int)(0xB418EE1A770279BCL ^ (long)n2 ^ 0x214422B7085EC5E0L);
                    n3 = (int)((long)((n2 ^ 0x2ECF4EB9 ^ 0x2AB5EFF2) + 716566514) ^ 0xFB455AA59A0E8E66L ^ 0xFB455AA59A0E8E66L);
                    n += 4;
                    continue block20;
                }
            }
            int cfr_ignored_37 = (Integer.rotateRight(0x9752BA3F ^ n2, 5) - 1466051804) * -1756186049;
            n3 = (int)((long)((n2 ^ 0x2ECF4EB9 ^ 0x2AB5EFF2) + 716566514) ^ 0xF7375734B3198C42L ^ 0xF7375734B3198C42L);
        }
    }

    public class_8685 thhh(class_8685 class_86852, GameProfile gameProfile) {
        int n = 1370800408;
        n = Integer.rotateLeft(n * -1877907805, 27) ^ 0x10916A43;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 17);
        GameProfile gameProfile2 = gameProfile;
        n = Integer.rotateLeft((gameProfile2 != null ? System.identityHashCode(gameProfile2) : 0) ^ n, 22);
        int n2 = n ^ 0xDED0A3C6;
        if ((n2 ^ n) != -556751930) {
            int cfr_ignored_0 = (0x8F6462DE ^ n) + 287178794;
        }
        if (!aw.khbb(this) || class_86852 == null || gameProfile == null || !aw.shlj(this, gameProfile)) {
            return class_86852;
        }
        class_2960 class_29602 = this.rt_2.dhbn("Vanilla") ? aw.dhhy_2(class_86852) : (this.rt_2.dhbn("Client") ? this.tds_4() : (class_2960)dny.get(this.rt_2.sdh_2().getName()));
        if (class_29602 == null) {
            return class_86852;
        }
        class_2960 class_29603 = aw.dshn_2(this.shjkh) ? class_29602 : (class_86852.comp_1628() != null ? class_86852.comp_1628() : aw.tghkh_2(aw.ddhm_2("̩﷫\ude83뾠顴礀寊㓫ᗚ흽뀸鋐玞沾", Integer.rotateLeft(0xFD1738F9 ^ 0xD57B47A2, 23), aw.azd_2(502644080) ^ 0x5AC0E94A, Integer.rotateLeft(0x737D9FE3 ^ 0xFD00594A, 28)).concat("/equipment/win").concat("gs/elytra.png")));
        return new class_8685(class_86852.comp_1626(), class_86852.comp_1911(), class_29602, class_29603, aw.zbz(class_86852), class_86852.comp_1630());
    }

    public void khhf_2(class_742 class_7423, class_10055 class_100552, float f) {
        if (!(this.rgha_2() && this.jjy.shzl() && class_7423 != null && class_100552 != null && class_100552.field_53520 != null && class_100552.field_53520.comp_1627() != null && this.athgh(class_7423.method_7334()))) {
            if (class_100552 != null) {
                this.shdh_6.remove(class_100552.field_53528);
            }
            return;
        }
        long l = System.nanoTime();
        hl hl2 = this.shdh_6.computeIfAbsent(class_100552.field_53528, arg_0 -> aw.tkhs_4(class_7423, l, arg_0));
        hl2.say_3(f, l);
        hl2.aft(class_7423, this.lk.thw_5(), this.zkhb.thw_5(), this.hwm.thw_5());
        if (this.shdh_6.size() > 256) {
            this.shdh_6.entrySet().removeIf(arg_0 -> aw.als_2(l, arg_0));
        }
    }

    public boolean tdhw(class_10055 class_100552) {
        return this.rgha_2() && this.jjy.shzl() && class_100552 != null && !class_100552.field_53333 && class_100552.field_53532 && class_100552.field_53520 != null && class_100552.field_53520.comp_1627() != null && this.shdh_6.containsKey(class_100552.field_53528);
    }

    public boolean hss_3(class_4587 class_45872, class_4597 class_45972, int n, class_10055 class_100552) {
        return bsh_3.ztsh_3(this, class_45872, class_45972, n, class_100552);
    }

    public hl dhldh(int n) {
        block0: {
            int n2 = 1573326013;
            n2 = Integer.rotateLeft(n2 * -440315491, 3) ^ 0xC7983D72;
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 4);
            int n3 = (n2 = n ^ n2) ^ 0x33EC675D;
            if ((n3 ^ n2) == 871130973) break block0;
            int cfr_ignored_0 = (0x6E2B6BE0 ^ n2) + 1114241486;
        }
        return (hl)this.shdh_6.get(n);
    }

    private boolean athgh(GameProfile gameProfile) {
        int n = -1479354046;
        n = Integer.rotateLeft(n * 1365956553, 25) ^ 0x32182A0E;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 16);
        int n2 = n ^ 0x6A434E7A;
        if ((n2 ^ n) != 1782795898) {
            int cfr_ignored_0 = (0xCD919738 ^ n) + -943926331;
        }
        boolean bl = mc.method_52701(gameProfile.getId());
        String string = aw.atn(gameProfile);
        boolean bl2 = string != null && aw.rs_2(Moondlc.getInstance()).adhj(string);
        boolean bl3 = !bl && !bl2;
        return bl && this.rrl.alh() || bl2 && this.tdw_2.alh() || bl3 && this.dhsgh.alh();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private class_2960 tds_4() {
        int n = -1120552114;
        n = Integer.rotateLeft(n * -303178197, 3) ^ 0x9FB22EC1;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 29);
        int n2 = n ^ 0xB8728452;
        if ((n2 ^ n) != -1200454574) {
            int cfr_ignored_0 = (0x5473F1C ^ n) - -1497641200;
        }
        if (this.dhjs_2 != null) {
            return dhzk_2;
        }
        try {
            InputStream inputStream;
            block9: {
                class_2960 class_29603;
                inputStream = aw.class.getResourceAsStream(aw.zdkh_2("/assets/moondlc/texture", "s/m0vy/2p/2pud0th4inazv.png"));
                try {
                    if (inputStream != null) break block9;
                    Moondlc.dhrn.error(aw.dth("Client cape", aw.shda_2("蹭烪厎㊼ᕥ훍맭飅筟婰", aw.zbb_2(42809173) ^ 0xC024ACC1, 0x52743F83 ^ 0xB6B5A9EA, aw.tds_3(0xFC55BD16 ^ 0x81816F1D, 27))).concat(" missing from ").concat("mod resources"));
                    class_29603 = null;
                    if (inputStream == null) return class_29603;
                }
                catch (Throwable throwable) {
                    if (inputStream == null) throw throwable;
                    try {
                        inputStream.close();
                        throw throwable;
                    }
                    catch (Throwable throwable2) {
                        aw.thzq_2(throwable, throwable2);
                    }
                    throw throwable;
                }
                inputStream.close();
                return class_29603;
            }
            class_1011 class_10112 = aw.tkh_6(inputStream);
            this.dhjs_2 = new class_1043(class_10112);
            mc.method_1531().method_4616(dhzk_2, (class_1044)this.dhjs_2);
            class_2960 class_29602 = dhzk_2;
            if (inputStream == null) return class_29602;
            inputStream.close();
            return class_29602;
        }
        catch (Exception exception) {
            Moondlc.dhrn.error(aw.ghtsh("Failed to load c", "lient cape texture"), (Throwable)exception);
            return null;
        }
    }

    private static Map sww_2() {
        int n = -1758966806;
        int n2 = (n = Integer.rotateLeft(n * 63869155, 8) ^ 0xD163577A) ^ 0x6CBEE591;
        if ((n2 ^ n) != 1824449937) {
            int cfr_ignored_0 = (0xFB96AE7B ^ n) - 686491328;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        aw.jzh(linkedHashMap, aw.shda_2("꾠具牃፰㓭헿", Integer.reverse(1908307468) ^ 0x525445F5, 0x7B0B0AEB ^ 0xFED337CE, aw.zdh_8(0x403DE53F ^ 0x4EF590E4, 24)).concat(aw.zghs("殰镣똑휡ᆃ㍟屺約黜", -674531804 + 722444557, 0x7F67FA8A ^ 0x3C408176, aw.zgh(0xA29BB78 ^ 0x175F78CA, 10))), "15th_anni".concat("versary"));
        aw.dds(linkedHashMap, "Bacon", "bacon");
        aw.jzh(linkedHashMap, aw.shda_2("㭺얂蟅ꀌ䅳掫಄", Integer.rotateLeft(0x3E077865 ^ 0xC04E7B81, 26), aw.jzl(1492405591) ^ 0xCA0DB136, 681699819 - 1301487990), "birthday");
        aw.jzh(linkedHashMap, aw.rml("Cherry Bl", "ossom"), "cherry_blossom");
        aw.jzh(linkedHashMap, aw.shda_2("ఓ⽫乇榟裴", -1834599713 - -65527166, Integer.rotateLeft(0x3DAFA38 ^ 0xE3FD7336, 29), aw.bdhn(0x7DCAB27 ^ 0x1AAA6895, 10)), "cobalt");
        aw.jzh(linkedHashMap, "Common", "common");
        aw.jzh(linkedHashMap, "Danny ".concat("Bstyle"), "danny_bstyle");
        aw.jzh(linkedHashMap, "Followers", "followers");
        aw.jzh(linkedHashMap, "Home", "home");
        aw.jzh(linkedHashMap, "MCC 15th".concat(" Year"), "mcc_1".concat("5th_years"));
        aw.jzh(linkedHashMap, "Menace", "menace");
        aw.jzh(linkedHashMap, "Migrator", "migrator");
        aw.jzh(linkedHashMap, "Millionth Customer", "millionth".concat("_customer"));
        aw.jzh(linkedHashMap, "Minecon 2011", "minecon_2011");
        aw.jzh(linkedHashMap, "Mine".concat("con 2012"), "mineco".concat("n_2012"));
        aw.jzh(linkedHashMap, "Minecon 2013", "mineco".concat("n_2013"));
        aw.jzh(linkedHashMap, "Minecon 2014", "mine".concat("con_2014"));
        aw.jzh(linkedHashMap, "Minecon 2015", "mine".concat("con_2015"));
        aw.jzh(linkedHashMap, "Minecon 2016", "minecon_2016");
        aw.jzh(linkedHashMap, "Mine".concat("con 2017"), "minec".concat("on_2017"));
        aw.jzh(linkedHashMap, "Minecon 2018", "minec".concat("on_2018"));
        aw.jzh(linkedHashMap, "Minec".concat("on 2019"), "minecon".concat("_2019"));
        aw.jzh(linkedHashMap, "Minecraft E".concat("xperience"), "minecraft_".concat("experience"));
        aw.jzh(linkedHashMap, "Mojang", "mojang");
        aw.jzh(linkedHashMap, "Mojang C".concat("lassic"), "mojang_old");
        aw.jzh(linkedHashMap, "Mojang St".concat("udios"), "mojang_s".concat("tudios"));
        aw.jzh(linkedHashMap, "Mojira".concat(" Moderator"), "mojira_moderator");
        aw.jzh(linkedHashMap, "New Years 2010", "new_ye".concat("ars_2010"));
        aw.jzh(linkedHashMap, "New Year".concat("s 2011"), "new_years_2011");
        aw.jzh(linkedHashMap, "Office", "office");
        aw.jzh(linkedHashMap, "Pancake", "pancake");
        aw.jzh(linkedHashMap, "Prismarine", "prismarine");
        aw.jzh(linkedHashMap, "Purple H".concat("eart"), "purpl".concat("e_heart"));
        aw.jzh(linkedHashMap, "Realms", "realms_new");
        aw.jzh(linkedHashMap, "Realms Classic", "realms_old");
        aw.jzh(linkedHashMap, "Scrolls", "scrolls");
        aw.jzh(linkedHashMap, "Snowman", "snowman");
        aw.jzh(linkedHashMap, "Spade", "spade");
        aw.jzh(linkedHashMap, "Translator", "translator");
        aw.jzh(linkedHashMap, "Turtle", "turtle");
        aw.jzh(linkedHashMap, "Valentine", "valentine");
        aw.jzh(linkedHashMap, "Yearn", "yearn");
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static void jzh(Map map, String string, String string2) {
        int n = 100287062;
        n = Integer.rotateLeft(n * -1811215937, 24) ^ 0x18DA6C22;
        Map map2 = map;
        n = (map2 != null ? System.identityHashCode(map2) : 0) ^ n;
        int n2 = n ^ 0x3029D44A;
        if ((n2 ^ n) != 808047690) {
            int cfr_ignored_0 = (0x35D3961C ^ n) - 912406957;
        }
        map.put(string, class_2960.method_60655((String)"moondlc", (String)("textures/cape/minecraft/" + string2 + ".png")));
    }

    private static boolean als_2(long l, Map.Entry entry) {
        return l - ((hl)entry.getValue()).sar_2 > 15000000000L;
    }

    private static hl tkhs_4(class_742 class_7423, long l, Integer n) {
        return new hl(class_7423.field_6012, l);
    }

    private boolean bthsh() {
        int n = 642614247;
        int n2 = (n = Integer.rotateLeft(n * 431042425, 11) ^ 0x73BE3637) ^ 0x55E4AD79;
        if ((n2 ^ n) != 1441049977) {
            int cfr_ignored_0 = (0x73A92E9E ^ n) - 1633324060;
        }
        return !this.jjy.shzl();
    }

    private boolean jghj() {
        int n = -1946957452;
        n = Integer.rotateLeft(n * 971629723, 23) ^ 0xA55D6D7B;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 9);
        int n2 = n ^ 0xF4AA7018;
        if ((n2 ^ n) != -190156776) {
            int cfr_ignored_0 = (0x7F59B96C ^ n) + -1015913065;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return !this.jjy.shzl();
    }

    private boolean adf() {
        try {
            int n = 665892378;
            n = Integer.rotateLeft(n * 117827637, 17) ^ 0xF90B9D2D;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xBAC6841D;
            if ((n2 ^ n) != -1161395171) {
                int cfr_ignored_0 = (0x9D763207 ^ n) - 1892016062;
            }
            if ((0x250 & 0) != 0) {
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
        return !this.jjy.shzl();
    }

    private static String shda_2(String string, int n, int n2, int n3) {
        int n4 = bdhgh.dwz_4(647543371);
        n4 = n ^ n4;
        int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 11)) ^ 0xFCED549B;
        if ((n5 ^ n4) != -51555173) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xDA75EED0 ^ n4, 14) + 2024114795) * -629805359;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x19AC711E ^ n2 - i) + shwh_2, 11) ^ hly + i * 392093997));
        }
        return new String(cArray);
    }

    private static class_1060 srz(class_310 class_3102) {
        block0: {
            int n = -1322550966;
            int n2 = (n = Integer.rotateLeft(n * 485301265, 4) ^ 0x258AACFA) ^ 0x23970D03;
            if ((n2 ^ n) == 597101827) break block0;
            int cfr_ignored_0 = (0x92BC7449 ^ n) - 246922191;
        }
        return class_3102.method_1531();
    }

    private static boolean khbb(aw aw2) {
        block0: {
            int n = 446666982;
            n = Integer.rotateLeft(n * -1219691669, 8) ^ 0xD56599A1;
            aw aw3 = aw2;
            n = Integer.rotateRight((aw3 != null ? System.identityHashCode(aw3) : 0) ^ n, 18);
            int n2 = n ^ 0xDD6247AC;
            if ((n2 ^ n) == -580761684) break block0;
            int cfr_ignored_0 = (0xC7FDDF4A ^ n) - 872639936;
        }
        return aw2.rgha_2();
    }

    private static boolean shlj(aw aw2, GameProfile gameProfile) {
        block0: {
            int n = -1999931208;
            n = Integer.rotateLeft(n * 28601545, 23) ^ 0xAA45ED4D;
            aw aw3 = aw2;
            n = (aw3 != null ? System.identityHashCode(aw3) : 0) ^ n;
            GameProfile gameProfile2 = gameProfile;
            n = Integer.rotateRight((gameProfile2 != null ? System.identityHashCode(gameProfile2) : 0) ^ n, 7);
            int n2 = n ^ 0x1F9E5886;
            if ((n2 ^ n) == 530471046) break block0;
            int cfr_ignored_0 = (0x9755203E ^ n) + -1339088362;
        }
        return aw2.athgh(gameProfile);
    }

    private static class_2960 dhhy_2(class_8685 class_86852) {
        block0: {
            int n = -256067836;
            int n2 = (n = Integer.rotateLeft(n * 1690615291, 22) ^ 0x8539A7AE) ^ 0xD6271CE7;
            if ((n2 ^ n) == -702079769) break block0;
            int cfr_ignored_0 = (0x269BABE3 ^ n) + -1536430984;
        }
        return class_86852.comp_1627();
    }

    private static boolean dshn_2(badh_2 badh2) {
        block0: {
            int n = bdhgh.dwz_4(-427826446);
            badh_2 badh3 = badh2;
            n = (badh3 != null ? System.identityHashCode(badh3) : 0) ^ n;
            int n2 = n ^ 0x6CF8E47;
            if ((n2 ^ n) == 114265671) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xE0B06CB5 ^ n, 15) - 968542502) * -525308747;
            int cfr_ignored_1 = (int)(0x2202C28827D4EB4FL ^ (long)n ^ 0x7860831A2DB9E9D4L);
        }
        return badh2.shzl();
    }

    private static int azd_2(int n) {
        block0: {
            int n2 = bdhgh.dwz_4(-1873153894);
            int n3 = n2 ^ 0x26C7BFC2;
            if ((n3 ^ n2) == 650624962) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xB69E4F58 ^ n2, 9) + 562641635) * -1231138983;
        }
        return Integer.reverse(n);
    }

    private static String ddhm_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bdhgh.dwz_4(-1391974880);
            n4 = Integer.rotateLeft(n ^ n4, 14);
            int n5 = (n4 = n3 ^ n4) ^ 0xA4BAE57C;
            if ((n5 ^ n4) == -1531255428) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x9B2C35C ^ n4, 4) - 822298463) * 162710365;
        }
        return aw.shda_2(string, n, n2, n3);
    }

    private static class_2960 tghkh_2(String string) {
        block0: {
            int n = 295248822;
            int n2 = (n = Integer.rotateLeft(n * -1156677003, 22) ^ 0xBDDA3390) ^ 0x7B32CB5F;
            if ((n2 ^ n) == 2066926431) break block0;
            int cfr_ignored_0 = (0x6AABE8E9 ^ n) + 1062106490;
        }
        return class_2960.method_60656((String)string);
    }

    private static class_8685.class_7920 zbz(class_8685 class_86852) {
        block0: {
            int n = 231208718;
            n = Integer.rotateLeft(n * 1417025871, 3) ^ 0x16578FF5;
            class_8685 class_86853 = class_86852;
            n = Integer.rotateLeft((class_86853 != null ? System.identityHashCode(class_86853) : 0) ^ n, 24);
            int n2 = n ^ 0x5A65F709;
            if ((n2 ^ n) == 1516631817) break block0;
            int cfr_ignored_0 = (0x57A20007 ^ n) - -1336841223;
        }
        return class_86852.comp_1629();
    }

    private static String atn(GameProfile gameProfile) {
        block0: {
            int n = 585552368;
            n = Integer.rotateLeft(n * 306552279, 13) ^ 0xDA85DCE4;
            GameProfile gameProfile2 = gameProfile;
            n = Integer.rotateRight((gameProfile2 != null ? System.identityHashCode(gameProfile2) : 0) ^ n, 5);
            int n2 = n ^ 0x3127A072;
            if ((n2 ^ n) == 824680562) break block0;
            int cfr_ignored_0 = (0x13C17182 ^ n) - 1690587470;
        }
        return gameProfile.getName();
    }

    private static kh_3 rs_2(Moondlc moondlc) {
        block0: {
            int n = 2101267455;
            int n2 = (n = Integer.rotateLeft(n * -311647187, 10) ^ 0xC22AABAF) ^ 0x9E1D1A20;
            if ((n2 ^ n) == -1642259936) break block0;
            int cfr_ignored_0 = (0xE323D1DF ^ n) + 592595830;
        }
        return moondlc.getFriendManager();
    }

    private static String zdkh_2(String string, String string2) {
        block0: {
            int n = -726100396;
            n = Integer.rotateLeft(n * 1771866287, 18) ^ 0xB2B9E732;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0xBC0A65CC;
            if ((n2 ^ n) == -1140169268) break block0;
            int cfr_ignored_0 = (0x68B2F398 ^ n) + -1871415986;
        }
        return string.concat(string2);
    }

    private static String tss_7(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 433836238;
            n4 = Integer.rotateLeft(n4 * 440013507, 20) ^ 0x89312DA3;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x80F41F3E;
            if ((n5 ^ n4) == -2131484866) break block0;
            int cfr_ignored_0 = (0x992FCFF0 ^ n4) - 1801507103;
        }
        return aw.shda_2(string, n, n2, n3);
    }

    private static int zbb_2(int n) {
        block0: {
            int n2 = 1359183973;
            n2 = Integer.rotateLeft(n2 * -1336370897, 5) ^ 0xC1FDC403;
            int n3 = (n2 = n ^ n2) ^ 0xF67569FD;
            if ((n3 ^ n2) == -160077315) break block0;
            int cfr_ignored_0 = (0xA776E998 ^ n2) - 2049954153;
        }
        return Integer.reverse(n);
    }

    private static int tds_3(int n, int n2) {
        block0: {
            int n3 = 1562640324;
            n3 = Integer.rotateLeft(n3 * -1131145297, 28) ^ 0x8A1AA806;
            int n4 = (n3 = n ^ n3) ^ 0x71DDA362;
            if ((n4 ^ n3) == 1910350690) break block0;
            int cfr_ignored_0 = (0x2CFE5CA6 ^ n3) + 970643525;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String dth(String string, String string2) {
        block0: {
            int n = 554426807;
            n = Integer.rotateLeft(n * 348506347, 8) ^ 0x78F5AB9D;
            String string3 = string;
            n = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 2);
            String string4 = string2;
            n = Integer.rotateLeft((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 21);
            int n2 = n ^ 0x6C260E27;
            if ((n2 ^ n) == 1814433319) break block0;
            int cfr_ignored_0 = (0x4D2DEF90 ^ n) + -157509562;
        }
        return string.concat(string2);
    }

    private static String dtht_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1932512736;
            n4 = Integer.rotateLeft(n4 * 1162367745, 8) ^ 0x4A11EFE6;
            n4 = Integer.rotateLeft(n2 ^ n4, 25);
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 2)) ^ 0xFA94CBE4;
            if ((n5 ^ n4) == -90911772) break block0;
            int cfr_ignored_0 = (0x7644F9C4 ^ n4) + 838810786;
        }
        return aw.shda_2(string, n, n2, n3);
    }

    private static String khzh_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bdhgh.dwz_4(287563398);
            n4 = Integer.rotateRight(n ^ n4, 22);
            int n5 = (n4 = n3 ^ n4) ^ 0x4E04D79;
            if ((n5 ^ n4) == 81808761) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x15C393FF ^ n4, 5) - -1492350180) * 365138943;
        }
        return aw.shda_2(string, n, n2, n3);
    }

    private static class_1011 tkh_6(InputStream inputStream) {
        block0: {
            int n = 718752917;
            n = Integer.rotateLeft(n * -34520937, 14) ^ 0xDE7FB76D;
            InputStream inputStream2 = inputStream;
            n = (inputStream2 != null ? System.identityHashCode(inputStream2) : 0) ^ n;
            int n2 = n ^ 0x228CDDBE;
            if ((n2 ^ n) == 579657150) break block0;
            int cfr_ignored_0 = (0x85B912B ^ n) + 1530478425;
        }
        return class_1011.method_4309((InputStream)inputStream);
    }

    private static void thzq_2(Throwable throwable, Throwable throwable2) {
        int n = bdhgh.dwz_4(-456646698);
        Throwable throwable3 = throwable;
        n = (throwable3 != null ? System.identityHashCode(throwable3) : 0) ^ n;
        Throwable throwable4 = throwable2;
        n = Integer.rotateRight((throwable4 != null ? System.identityHashCode(throwable4) : 0) ^ n, 17);
        int n2 = n ^ 0xED66C84;
        if ((n2 ^ n) != 248933508) {
            int cfr_ignored_0 = (Integer.rotateRight(0xEA1E7352 ^ n, 16) + 1577948713) * -367103149;
        }
        throwable.addSuppressed(throwable2);
    }

    private static String ghtsh(String string, String string2) {
        block0: {
            int n = -235017360;
            n = Integer.rotateLeft(n * 961373065, 5) ^ 0xD916D581;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            String string4 = string2;
            n = (string4 != null ? System.identityHashCode(string4) : 0) ^ n;
            int n2 = n ^ 0xF40603DA;
            if ((n2 ^ n) == -200932390) break block0;
            int cfr_ignored_0 = (0x5FBE8AA ^ n) - 23684766;
        }
        return string.concat(string2);
    }

    private static int zdh_8(int n, int n2) {
        block0: {
            int n3 = bdhgh.dwz_4(287448638);
            int n4 = n3 ^ 0xE68F6178;
            if ((n4 ^ n3) == -426811016) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xF7AD7F46 ^ n3, 17) - 39848117;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int zgh(int n, int n2) {
        block0: {
            int n3 = bdhgh.dwz_4(704337959);
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 16)) ^ 0xDBC7EA01;
            if ((n4 ^ n3) == -607655423) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xF23CB226 ^ n3, 17) - 1505178069;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String zghs(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 180962911;
            n4 = Integer.rotateLeft(n4 * 1956396595, 24) ^ 0x5EEAAA8E;
            n4 = Integer.rotateLeft(n ^ n4, 17);
            int n5 = (n4 = n3 ^ n4) ^ 0xD205E49A;
            if ((n5 ^ n4) == -771365734) break block0;
            int cfr_ignored_0 = (0xD8CCA2C5 ^ n4) + 1508369090;
        }
        return aw.shda_2(string, n, n2, n3);
    }

    private static void dds(Map map, String string, String string2) {
        int n = bdhgh.dwz_4(-516369433);
        int n2 = n ^ 0xF654A288;
        if ((n2 ^ n) != -162225528) {
            int cfr_ignored_0 = Integer.rotateRight(0x176C716F ^ n, 5) - -629187668;
        }
        aw.jzh(map, string, string2);
    }

    private static int jzl(int n) {
        block0: {
            int n2 = 1592896117;
            n2 = Integer.rotateLeft(n2 * 1899939513, 16) ^ 0x38D9AAFE;
            int n3 = (n2 = n ^ n2) ^ 0x30A855BA;
            if ((n3 ^ n2) == 816338362) break block0;
            int cfr_ignored_0 = (0x6E59FFCF ^ n2) + 758286394;
        }
        return Integer.reverse(n);
    }

    private static String twsh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -382525001;
            n4 = Integer.rotateLeft(n4 * 1114413693, 6) ^ 0x9FDA97C7;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 5);
            int n5 = (n4 = n ^ n4) ^ 0x963930A5;
            if ((n5 ^ n4) == -1774636891) break block0;
            int cfr_ignored_0 = (0x7F0A1112 ^ n4) + 1676604705;
        }
        return aw.shda_2(string, n, n2, n3);
    }

    private static String hty(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1788431328;
            n4 = Integer.rotateLeft(n4 * -1980872491, 14) ^ 0x5CE3CEEA;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 3);
            int n5 = (n4 = n2 ^ n4) ^ 0xA914B402;
            if ((n5 ^ n4) == -1458260990) break block0;
            int cfr_ignored_0 = (0x3C720022 ^ n4) - -380544398;
        }
        return aw.shda_2(string, n, n2, n3);
    }

    private static String rml(String string, String string2) {
        block0: {
            int n = 1309414340;
            n = Integer.rotateLeft(n * -25534195, 13) ^ 0xE45F2278;
            String string3 = string2;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            int n2 = n ^ 0xF4717F06;
            if ((n2 ^ n) == -193888506) break block0;
            int cfr_ignored_0 = (0xBA7D6CC2 ^ n) - 1036715117;
        }
        return string.concat(string2);
    }

    private static String jdj_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 2023911058;
            n4 = Integer.rotateLeft(n4 * 1545238435, 4) ^ 0xB42EEE5A;
            n4 = n ^ n4;
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 13)) ^ 0xDE9D2830;
            if ((n5 ^ n4) == -560125904) break block0;
            int cfr_ignored_0 = (0xA63F46A2 ^ n4) - -35754661;
        }
        return aw.shda_2(string, n, n2, n3);
    }

    private static int bdhn(int n, int n2) {
        block0: {
            int n3 = 809125101;
            n3 = Integer.rotateLeft(n3 * -1318678317, 22) ^ 0x80D79699;
            n3 = Integer.rotateRight(n ^ n3, 14);
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 8)) ^ 0x3DD3A1AC;
            if ((n4 ^ n3) == 1037279660) break block0;
            int cfr_ignored_0 = (0xDE9E541 ^ n3) + -1343934741;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String atkh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1778184822;
            n4 = Integer.rotateLeft(n4 * 1680644747, 26) ^ 0xEB4AF6E7;
            int n5 = (n4 = n ^ n4) ^ 0x85E65389;
            if ((n5 ^ n4) == -2048502903) break block0;
            int cfr_ignored_0 = (0x13E55E03 ^ n4) - 439379593;
        }
        return aw.shda_2(string, n, n2, n3);
    }

    private static String[] shtt(String string) {
        int n = bdhgh.dwz_4(-139305420);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x358D82D;
        if ((n2 ^ n) != 56154157) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xF4EA8619 ^ n, 17) + -1396450238) * -185956839;
            int cfr_ignored_1 = (int)(0x3658282427D4EB4FL ^ (long)n ^ 0xAD38831A2DB9C161L);
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

    private static CallSite bsk_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -794016556;
            n3 = Integer.rotateLeft(n3 * 1774553089, 6) ^ 0xA2B0D284;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            n3 = n2 ^ n3;
            int n4 = n3 ^ 0x92B2250;
            if ((n4 ^ n3) != 153821776) {
                int cfr_ignored_0 = (0xD9876684 ^ n3) + 2607412;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ khka_2 ^ string.hashCode()) + (n2 + khnz) + i ^ khka_2, 5) + khnz);
            }
            String[] stringArray = aw.shtt(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType3) : lookup.findVirtual(clazz, stringArray[1], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] xawaqm89(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite mh04oepw82(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ a7leoy4fke5n ^ string.hashCode() ^ n2 + ch3shvmylhysl ^ i * -236974737 ^ a7leoy4fke5n, 12) ^ ch3shvmylhysl));
            }
            String[] stringArray = aw.xawaqm89(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

