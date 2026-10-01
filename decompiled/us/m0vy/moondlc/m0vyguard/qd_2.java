/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1011
 *  net.minecraft.class_1043
 *  net.minecraft.class_1044
 *  net.minecraft.class_2960
 */
package us.m0vy.moondlc.m0vyguard;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Generated;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_2960;
import us.m0vy.moondlc.m0vyguard.bqm;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tdhs_2;
import us.m0vy.moondlc.m0vyguard.az_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class qd_2
implements tthy {
    private final Thread sha_2;
    private IMediaSession zghd_2;
    private byq tas_2 = byq.brz_2;
    private final Map thjgh = new ConcurrentHashMap();
    private final Map thfdh = new ConcurrentHashMap();
    private static final Random sght;
    private String bnh = "";
    private String shn_3 = "";
    private long jhy = 0x592E739CCE4C789CL ^ 0xA6D18C6331B38763L;
    private long hyl = 0L;
    private long hzh_4 = 0L;
    private boolean zfh_2 = false;
    private static final int jsha_2 = -2030872550;
    private static final int jtq = -1356125983;
    private static final int thrdh = 533862144;
    private static final int dka = 216220955;
    private static final int l4jfkj1 = -168522746;
    private static final int ua866ofd0 = -1004449303;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int pahto0rf;

    public qd_2() {
        this.sha_2 = new Thread(this::kf);
        this.sha_2.setDaemon(true);
        this.sha_2.start();
    }

    private void swd_3() {
        try {
            List<IMediaSession> list;
            try {
                int n = -2128151477;
                n = Integer.rotateLeft(n * 683732687, 24) ^ 0xE2D38ED4;
                n = Integer.rotateRight(System.identityHashCode(this) ^ n, 27);
                int n2 = n ^ 0xA1016FA0;
                if ((n2 ^ n) != -1593741408) {
                    int cfr_ignored_0 = (0x202793EB ^ n) + -1175120070;
                }
                if ((0x36A & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            if (!yf.khdha_2()) {
                qd_2.sthsh();
            }
            if ((list = MediaPlayerInfo.INSTANCE.getMediaSessions()) == null || list.isEmpty()) {
                this.zghd_2 = null;
                this.zfh_2 = false;
                return;
            }
            this.zghd_2 = (IMediaSession)qd_2.dhty(list.stream().filter(qd_2::atdh).sorted(qd_2::khths_2).findFirst(), null);
            if (this.zghd_2 != null && this.zghd_2.getMedia() != null) {
                String string;
                String string2 = this.zghd_2.getMedia().getTitle();
                String string3 = this.zghd_2.getMedia().getArtist();
                long l = this.zghd_2.getMedia().getPosition();
                long l2 = this.zghd_2.getMedia().getDuration();
                long l3 = l2 * (0x1DC051FE5EE96AC2L ^ 0x1DC051FE5EE9692AL);
                boolean bl = this.zghd_2.getMedia().isPlaying();
                if (l != this.jhy || bl != this.zfh_2) {
                    this.jhy = l;
                    this.hyl = l * (0x8CCA1F2466714791L ^ 0x8CCA1F2466714479L);
                    this.hzh_4 = System.currentTimeMillis();
                    this.zfh_2 = bl;
                }
                if (!(string = string3 + " - " + string2).equals(this.shn_3)) {
                    this.shn_3 = string;
                    this.bnh = "";
                    qd_2.dah_6(az_2.sngh_2(), string2, string3, l3);
                }
            } else {
                this.zfh_2 = false;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public long jaa_4() {
        try {
            int n = 526586181;
            n = Integer.rotateLeft(n * 1937206899, 16) ^ 0xA97E0E40;
            int n2 = n ^ 0x6DF92BE0;
            if ((n2 ^ n) != 1845046240) {
                int cfr_ignored_0 = (0x729A3AA5 ^ n) + -824360817;
            }
            if ((0x1EF & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (this.zghd_2 == null || this.zghd_2.getMedia() == null) {
            return 0L;
        }
        if (!this.zfh_2) {
            return this.hyl;
        }
        long l = System.currentTimeMillis() - this.hzh_4;
        long l2 = this.hyl + qd_2.szk(0xF47611F2DA099EEFL ^ 0xF47611F2DA09993FL, Math.max(0L, l));
        long l3 = this.zghd_2.getMedia().getDuration() * (0xF045A6CBEB55337L ^ 0xF045A6CBEB550DFL);
        return l3 > 0L ? qd_2.hkb(l3, l2) : l2;
    }

    public boolean dhlf() {
        int n;
        block4: {
            try {
                int n2 = 1249679273;
                n2 = Integer.rotateLeft(n2 * -274701627, 15) ^ 0x22871B5E;
                n2 = System.identityHashCode(this) ^ n2;
                int n3 = n2 ^ 0x125CA3D9;
                if ((n3 ^ n2) != 308061145) {
                    int cfr_ignored_0 = (0x58203470 ^ n2) - -1449527996;
                }
                if ((0x2BE & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = this.zghd_2 != null && this.zfh_2 ? 1 : 0;
            if (yf.tdhth_2() != 0) break block4;
            n = n ^ 0x36;
        }
        return n != 0;
    }

    public tdhs_2 trh() {
        block0: {
            int n = bqm.zdr(1729076864);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x28D9ED64;
            if ((n2 ^ n) == 685370724) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x4FD673E4 ^ n, 12) - -1353340969;
        }
        return az_2.sngh_2().shds_3();
    }

    public class_2960 bdhf() {
        try {
            class_1011 class_10112;
            try {
                int n = 518394506;
                n = Integer.rotateLeft(n * 1600683435, 25) ^ 0x75A78309;
                n = System.identityHashCode(this) ^ n;
                int n2 = n ^ 0xFF9D464B;
                if ((n2 ^ n) != -6470069) {
                    int cfr_ignored_0 = (0xE17B54C1 ^ n) - 624930248;
                }
                if ((0x1AE & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            if (!yf.khdha_2()) {
                qd_2.dhfd();
                throw null;
            }
            if (this.thjgh.size() > Integer.rotateLeft(0x22E8CC53 ^ 0x22B8CC53, 13)) {
                this.thjgh.clear();
                this.thfdh.clear();
            }
            boolean bl = this.zghd_2.getOwner().toLowerCase().contains("spotify");
            byte[] byArray = this.zghd_2.getMedia().getArtworkPng();
            int n = qd_2.khshr(byArray);
            if (this.thjgh.containsKey(qd_2.shna(n))) {
                this.tas_2 = (byq)this.thfdh.get(n);
                return (class_2960)this.thjgh.get(n);
            }
            class_2960 class_29602 = Moondlc.id("temp/" + qd_2.jab_2());
            class_1011 class_10113 = class_10112 = qd_2.tsz_7(byArray);
            if (bl) {
                int n3 = class_10112.method_4307();
                int n4 = class_10112.method_4323();
                int n5 = (int)((double)n3 * qd_2.zhh_6(0x3311A65114F3C4E1L ^ 0xCAD8EA4D67C98C8L));
                int n6 = (int)((double)n3 * Double.longBitsToDouble(0xC8A4E3B99F833750L ^ 0xF718CB4C5D0C6B79L));
                int n7 = (int)((double)n4 * qd_2.zdd_4(0xFB764308A6FF844EL ^ 0xC4BA6BFD6470D867L));
                int n8 = n3 - n5 - n6;
                int n9 = n4 - n7;
                if (n8 > 0 && n9 > 0) {
                    class_10113 = new class_1011(class_10112.method_4318(), n8, n9, false);
                    for (int i = 0; i < n9; ++i) {
                        for (int j = 0; j < n8; ++j) {
                            int n10 = j + n5;
                            int n11 = qd_2.shka_2(class_10112, n10, i);
                            class_10113.method_61941(j, i, n11);
                        }
                    }
                    class_10112.close();
                }
            }
            class_1011 class_10114 = class_10113;
            mc.execute(() -> qd_2.ddhz(class_29602, class_10114));
            this.tas_2 = this.tjsh(class_10113, 1);
            this.thfdh.put(n, this.tas_2);
            this.thjgh.put(n, class_29602);
            return class_29602;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public byq tjsh(class_1011 class_10112, int n) {
        int n2 = -949281583;
        n2 = Integer.rotateLeft(n2 * -1271950715, 14) ^ 0x731057E7;
        n2 = System.identityHashCode(this) ^ n2;
        class_1011 class_10113 = class_10112;
        n2 = Integer.rotateLeft((class_10113 != null ? System.identityHashCode(class_10113) : 0) ^ n2, 7);
        int n3 = n2 ^ 0x5A9591C6;
        if ((n3 ^ n2) != 1519751622) {
            int cfr_ignored_0 = (0x9DFE8D17 ^ n2) + -665551086;
        }
        if (!yf.khdha_2()) {
            qd_2.zbt_4();
            throw null;
        }
        int n4 = class_10112.method_4307();
        int n5 = qd_2.szz_2(class_10112);
        long l = 0L;
        long l2 = 0L;
        long l3 = 0L;
        long l4 = 0L;
        int n6 = 0;
        for (int i = 0; i < n5; i += n) {
            for (int j = 0; j < n4; j += n) {
                int n7 = qd_2.zaz_4(class_10112, j, i);
                int n8 = n7 >> (0x48B6F043 ^ 0x48B6F05B) & (Integer.reverse(-321891707) ^ 0xA14A0BC8);
                if (n8 == 0) continue;
                l += (long)n8;
                l2 += (long)(n7 >> 268542484 + -268542468 & (0x6E3246F9 ^ 0x6E324606));
                l3 += (long)(n7 >> (0x86949756 ^ 0x8694975E) & 257525051 - 257524796);
                l4 += (long)(n7 & (0x6AE269D8 ^ 0x6AE26927));
                ++n6;
            }
        }
        if (n6 == 0) {
            return byq.brz_2;
        }
        float f = Float.intBitsToFloat(-2116962853 + -1065989595);
        return new byq((float)l2 / (float)n6 + f, (float)l3 / (float)n6 + f, (float)l4 / (float)n6 + f);
    }

    private static String jab_2() {
        int n = 1177591891;
        int n2 = (n = Integer.rotateLeft(n * 632225271, 15) ^ 0xD10338EB) ^ 0x532BCDDB;
        if ((n2 ^ n) != 1395379675) {
            int cfr_ignored_0 = (0x151B6D88 ^ n) + -1465520357;
        }
        StringBuilder stringBuilder = new StringBuilder(-775684200 + 775684232);
        for (int i = 0; i < (qd_2.rkdh(327057981) ^ 0xBC417EE8); ++i) {
            char c = (char)((0x4A07E9C6 ^ 0x4A07E9A7) + sght.nextInt(Integer.rotateLeft(0xB804C39C ^ 0x8C04C39C, 7)));
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public boolean bdhl() {
        int n;
        block4: {
            try {
                int n2 = -1755678182;
                n2 = Integer.rotateLeft(n2 * 1217316395, 25) ^ 0x198BA831;
                n2 = System.identityHashCode(this) ^ n2;
                int n3 = n2 ^ 0xDC750294;
                if ((n3 ^ n2) != -596311404) {
                    int cfr_ignored_0 = (0x4B2F788E ^ n2) - 269609328;
                }
                if ((0x1D8 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = this.zghd_2 != null ? 1 : 0;
            if (yf.tdhth_2() != 0) break block4;
            n = n ^ 0x34A9;
        }
        return n != 0;
    }

    public boolean dkh_2(Object object) {
        try {
            int n = 1010598668;
            n = Integer.rotateLeft(n * -1766588475, 25) ^ 0x6F920C3;
            Object object2 = object;
            n = (object2 != null ? System.identityHashCode(object2) : 0) ^ n;
            int n2 = n ^ 0x58C948E2;
            if ((n2 ^ n) != 1489586402) {
                int cfr_ignored_0 = (0x64F5CBEE ^ n) - 2043802785;
            }
            if ((0xA3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (object != null && this.getClass() == object.getClass()) {
            qd_2 qd2_2 = (qd_2)object;
            return Objects.equals(this.sha_2, qd2_2.sha_2) && Objects.equals(this.zghd_2, qd2_2.zghd_2) && Objects.equals(this.tas_2, qd2_2.tas_2) && qd_2.dzb_4(this.thjgh, qd2_2.thjgh) && Objects.equals(this.thfdh, qd2_2.thfdh) && Objects.equals(this.bnh, qd2_2.bnh) && qd_2.thja_2(this.shn_3, qd2_2.shn_3);
        }
        return false;
    }

    public int azr() {
        try {
            int n = 50489333;
            n = Integer.rotateLeft(n * -1569315287, 22) ^ 0x1ABFD7D3;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x990A1615;
            if ((n2 ^ n) != -1727392235) {
                int cfr_ignored_0 = (0x9A0871E0 ^ n) - -1662185347;
            }
            if ((0x255 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        Object[] objectArray = new Object[1130174510 - 1130174503];
        objectArray[0] = this.sha_2;
        objectArray[1] = this.zghd_2;
        objectArray[2] = this.tas_2;
        objectArray[3] = this.thjgh;
        objectArray[4] = this.thfdh;
        objectArray[5] = this.bnh;
        objectArray[qd_2.sks_4((int)1225970650) ^ 0x5BCB4894] = this.shn_3;
        return Objects.hash(objectArray);
    }

    @Generated
    public Thread ztd_6() {
        block0: {
            int n = 1835379089;
            int n2 = (n = Integer.rotateLeft(n * 1588729003, 10) ^ 0xCB42F313) ^ 0xA8FF8DD3;
            if ((n2 ^ n) == -1459647021) break block0;
            int cfr_ignored_0 = (0xC59A2442 ^ n) - 184293631;
        }
        return this.sha_2;
    }

    @Generated
    public IMediaSession khyl() {
        block0: {
            int n = -319962058;
            int n2 = (n = Integer.rotateLeft(n * 1165234917, 27) ^ 0x9C410687) ^ 0xD50EBECB;
            if ((n2 ^ n) == -720453941) break block0;
            int cfr_ignored_0 = (0x39E37AFD ^ n) - 214829951;
        }
        return this.zghd_2;
    }

    @Generated
    public byq shkhm() {
        block0: {
            int n = bqm.zdr(-587467344);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x14055078;
            if ((n2 ^ n) == 335892600) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xC8FEA5C8 ^ n, 12) + 1530114675;
        }
        return this.tas_2;
    }

    @Generated
    public Map shyn() {
        block0: {
            int n = bqm.zdr(1078421833);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8762F423;
            if ((n2 ^ n) == -2023558109) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xC7259D6A ^ n, 11) + 569093905;
        }
        return this.thjgh;
    }

    @Generated
    public Map dhas_2() {
        block0: {
            int n = 1847718757;
            n = Integer.rotateLeft(n * 97214491, 8) ^ 0xADDE44DF;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 24);
            int n2 = n ^ 0x26C1EB7B;
            if ((n2 ^ n) == 650242939) break block0;
            int cfr_ignored_0 = (0x48E0181E ^ n) - 690554566;
        }
        return this.thfdh;
    }

    @Generated
    public String zbt() {
        block0: {
            int n = 1566781535;
            n = Integer.rotateLeft(n * -603004057, 18) ^ 0x5EA28A49;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x38C83DAD;
            if ((n2 ^ n) == 952647085) break block0;
            int cfr_ignored_0 = (0x65AB0DF2 ^ n) - -1136292547;
        }
        return this.bnh;
    }

    @Generated
    public String sqth() {
        block0: {
            int n = 1578425639;
            n = Integer.rotateLeft(n * 776092971, 10) ^ 0xE965E679;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x2AC260DD;
            if ((n2 ^ n) == 717381853) break block0;
            int cfr_ignored_0 = (0x74D6BDFA ^ n) + 208971087;
        }
        return this.shn_3;
    }

    /*
     * Unable to fully structure code
     */
    private static void ddhz(class_2960 var0, class_1011 var1_1) {
        var4_2 = 0;
        var2_3 = 48934517;
        var2_3 = Integer.rotateLeft(var2_3 * -78510185, 17) ^ -1040719952;
        v0 = var0;
        var2_3 = (v0 != null ? System.identityHashCode(v0) : 0) ^ var2_3;
        var3_4 = (var2_3 ^ -184936155 ^ -1800750227) + -1800750227;
        block16: while (true) {
            block33: {
                block31: {
                    block32: {
                        block34: {
                            block25: {
                                block35: {
                                    block30: {
                                        block29: {
                                            block28: {
                                                block27: {
                                                    block26: {
                                                        var4_2 = var3_4 - -1800750227 ^ -1800750227 ^ var2_3;
                                                        switch (var4_2 & 7) {
                                                            case 0: {
                                                                if (var4_2 == -1392118200) break block25;
                                                                if (var4_2 == -1539815000) break block26;
                                                                Integer.rotateLeft(1128724453 ^ var2_3, 11) - 703964150;
                                                                (int)(-9082535763583374513L ^ (long)var2_3 ^ 5674679678946291257L);
                                                                if (var4_2 == 1376183584) break block27;
                                                                if (var4_2 != -1780072944) {
                                                                    ** break;
                                                                }
                                                                break block28;
                                                            }
                                                            case 4: {
                                                                if (var4_2 == 756621260) break;
                                                                ** break;
                                                            }
                                                            case 1: {
                                                                if (var4_2 == 776046777) break block29;
                                                                if (var4_2 != -1741325903) {
                                                                    Integer.rotateRight(44381703 ^ var2_3, 3) - 1449077268;
                                                                    ** break;
                                                                }
                                                                break block30;
                                                            }
                                                            case 6: {
                                                                if (var4_2 == -806466266) break block31;
                                                                if (var4_2 == 27667174) break block32;
                                                                if (var4_2 != 840841198) {
                                                                    ** break;
                                                                }
                                                                break block33;
                                                            }
                                                            case 7: {
                                                                if (var4_2 != 922795223) {
                                                                    ** break;
                                                                }
                                                                break block34;
                                                            }
                                                            case 5: {
                                                                if (var4_2 == -184936155) ** GOTO lbl49
                                                                if (var4_2 == 1853359901) break block35;
                                                                (Integer.rotateLeft(-1927942504 ^ var2_3, 4) + 436568995) * -1927942503;
                                                                if (var4_2 != 1939979549) {
                                                                    ** break;
                                                                }
                                                                ** GOTO lbl63
lbl49:
                                                                // 1 sources

                                                                Integer.rotateRight(1240583210 ^ var2_3, 12) + -123381679;
                                                                if (!yf.dnkh()) {
                                                                    try {
                                                                        var4_2 += 4;
                                                                        var3_4 = (var2_3 ^ 756621260 ^ -1800750227) + -1800750227 ^ 1138900650 ^ 1138900650;
                                                                    }
                                                                    catch (UnsupportedOperationException v1) {
                                                                        var3_4 = (var2_3 ^ 756621260 ^ -1800750227) + -1800750227 ^ -438372726 ^ -438372726;
                                                                    }
                                                                    var4_2 += 4;
                                                                    continue block16;
                                                                }
                                                                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ 1939979549 ^ -1800750227) + -1800750227));
                                                                var4_2 += 3;
                                                                continue block16;
lbl63:
                                                                // 1 sources

                                                                (Integer.rotateLeft(-1021243076 ^ var2_3, 11) - -1520519809) * -1021243075;
                                                                throw null;
                                                            }
                                                        }
                                                        (Integer.rotateLeft(2046089949 ^ var2_3, 18) - -922476546) * 2046089949;
                                                        (int)(-4952142234157520049L ^ (long)var2_3 ^ 1490835625119112029L);
                                                        qd_2.mc.method_1531().method_4616(var0, (class_1044)new class_1043(var1_1));
                                                        return;
                                                    }
                                                    Integer.rotateLeft(-1951451124 ^ var2_3, 4) - -292198225;
                                                    (int)(-1521298395049540839L ^ (long)var2_3 ^ 8873841505846196247L);
                                                    var3_4 = (var2_3 ^ -184936155 ^ -1800750227) + -1800750227 + -1101130089 - -1101130089;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(1412404593 ^ var2_3, 13) + 908113898) * 1412404593;
                                                (int)(-7593848198404969649L ^ (long)var2_3 ^ -8365292159381241621L);
                                                (int)(3764917017412599951L ^ (long)var2_3 ^ -6532431861862775378L);
                                                var3_4 = (int)((long)((var2_3 ^ 1561205080 ^ -1800750227) + -1800750227) ^ -6119957321668850840L ^ -6119957321668850840L);
                                                (int)(2509052780616769224L ^ (long)var2_3 ^ 1809165085255919730L);
                                                var3_4 = (int)((long)((var2_3 ^ -184936155 ^ -1800750227) + -1800750227) ^ -4004393714197832652L ^ -4004393714197832652L);
                                                continue;
                                            }
                                            Integer.rotateRight(-1599034010 ^ var2_3, 7) - 2042797717;
                                            var3_4 = (var2_3 ^ -1170112161 ^ -1800750227) + -1800750227 ^ 53377915 ^ 53377915;
                                            (Integer.rotateLeft(2033699025 ^ var2_3, 18) + -1306595190) * 2033699025;
                                            (int)(-4934424652247930033L ^ (long)var2_3 ^ 3506196458367408859L);
                                            var3_4 = (var2_3 ^ 155759257 ^ -1800750227) + -1800750227 ^ 301673876 ^ 301673876;
                                            Integer.rotateRight(1524642791 ^ var2_3, 14) - 92530740;
                                            var3_4 = (int)((long)((var2_3 ^ -184936155 ^ -1800750227) + -1800750227) ^ -8174003512058704807L ^ -8174003512058704807L);
                                            continue;
                                        }
                                        Integer.rotateRight(1901179979 ^ var2_3, 17) + -1119718320;
                                        var3_4 = (int)((long)((var2_3 ^ 1294820816 ^ -1800750227) + -1800750227) ^ -8297332893620094180L ^ -8297332893620094180L);
                                        Integer.rotateRight(-1587819798 ^ var2_3, 7) + -1904529007;
                                        var3_4 = (var2_3 ^ -184936155 ^ -1800750227) + -1800750227 + -1748193570 - -1748193570;
                                        continue;
                                    }
                                    Integer.rotateRight(880579619 ^ var2_3, 9) + 1601408888;
                                    try {
                                        if ((451166439131046103L ^ (long)var2_3 | 1L) == 0L) {
                                            throw new IllegalStateException();
                                        }
                                        var3_4 = (var2_3 ^ -184936155 ^ -1800750227) + -1800750227 + 436419420 - 436419420;
                                    }
                                    catch (IllegalStateException v2) {
                                        var3_4 = (int)((long)((var2_3 ^ -184936155 ^ -1800750227) + -1800750227) ^ -1865965722459028645L ^ -1865965722459028645L);
                                    }
                                    ++var4_2;
                                    continue;
                                }
                                (Integer.rotateLeft(589737561 ^ var2_3, 7) + 1175239682) * 589737561;
                                (int)(-2192126688457594033L ^ (long)var2_3 ^ -164237237939572999L);
                                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -184936155 ^ -1800750227) + -1800750227));
                                (Integer.rotateLeft(-820978916 ^ var2_3, 12) - 392701855) * -820978915;
                                var4_2 += 3;
                                continue;
                            }
                            (Integer.rotateLeft(936941012 ^ var2_3, 9) - -946355225) * 936941013;
                            var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ 1585206343 ^ -1800750227) + -1800750227));
                            (Integer.rotateLeft(-1322953315 ^ var2_3, 9) - 2011364670) * -1322953315;
                            (int)(8329402701126626127L ^ (long)var2_3 ^ 734230887720897278L);
                            var3_4 = (var2_3 ^ -1381892024 ^ -1800750227) + -1800750227 ^ 182570798 ^ 182570798;
                            (Integer.rotateRight(-1382637505 ^ var2_3, 8) - 161154780) * -1382637505;
                            var3_4 = (int)((long)((var2_3 ^ -184936155 ^ -1800750227) + -1800750227) ^ -46757148226153044L ^ -46757148226153044L);
                            var4_2 += 3;
                            continue;
                        }
                        Integer.rotateLeft(-4581535 ^ var2_3, 18) + -68783110;
                        (int)(4397968841583684431L ^ (long)var2_3 ^ -8086068982484183104L);
                        var3_4 = (var2_3 ^ -1421447562 ^ -1800750227) + -1800750227 + -988059746 - -988059746;
                        (Integer.rotateLeft(267817904 ^ var2_3, 4) + -214335093) * 267817905;
                        var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -909508355 ^ -1800750227) + -1800750227));
                        (Integer.rotateRight(-1545499437 ^ var2_3, 7) + -592597816) * -1545499437;
                        var3_4 = (int)((long)((var2_3 ^ -184936155 ^ -1800750227) + -1800750227) ^ 8106697459894356369L ^ 8106697459894356369L);
                        var4_2 -= 2;
                        continue;
                    }
                    (Integer.rotateLeft(-278104228 ^ var2_3, 16) - 41947999) * -278104227;
                    try {
                        if ((-1481558106607782831L ^ (long)var2_3 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var3_4 = (var2_3 ^ -184936155 ^ -1800750227) + -1800750227 + 1209555268 - 1209555268;
                    }
                    catch (ArithmeticException v3) {
                        var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -184936155 ^ -1800750227) + -1800750227));
                    }
                    var4_2 += 3;
                    continue;
                }
                (Integer.rotateRight(-1044981165 ^ var2_3, 11) + 2038566728) * -1044981165;
                var3_4 = (int)((long)((var2_3 ^ -1053379669 ^ -1800750227) + -1800750227) ^ 3698468024999979172L ^ 3698468024999979172L);
                (Integer.rotateRight(1679873787 ^ var2_3, 15) + 609724320) * 1679873787;
                (int)(-1463066880774407643L ^ (long)var2_3 ^ -5356982102381528395L);
                var3_4 = (int)((long)((var2_3 ^ -1797230172 ^ -1800750227) + -1800750227) ^ -1574816380093592649L ^ -1574816380093592649L);
                (int)(-8199063056346416983L ^ (long)var2_3 ^ -2711525068399922753L);
                var3_4 = (var2_3 ^ -184936155 ^ -1800750227) + -1800750227;
                var4_2 -= 2;
                continue;
            }
            Integer.rotateRight(-1869437529 ^ var2_3, 5) - -2044744076;
            try {
                var3_4 = (var2_3 ^ -184936155 ^ -1800750227) + -1800750227 + 1428860576 - 1428860576;
            }
            catch (UnsupportedOperationException v4) {
                var3_4 = Integer.reverse(Integer.reverse((var2_3 ^ -184936155 ^ -1800750227) + -1800750227));
            }
            continue;
lbl197:
            // 7 sources

            Integer.rotateRight(779858947 ^ var2_3, 8) + -1520931944;
            var3_4 = (int)((long)((var2_3 ^ -184936155 ^ -1800750227) + -1800750227) ^ -8242081040310852854L ^ -8242081040310852854L);
        }
    }

    private static int khths_2(IMediaSession iMediaSession, IMediaSession iMediaSession2) {
        int n = 2078698522;
        int n2 = (n = Integer.rotateLeft(n * -706964445, 14) ^ 0x2F877B85) ^ 0xE4FAB26A;
        if ((n2 ^ n) != -453332374) {
            int cfr_ignored_0 = (0x9F1CDE70 ^ n) + -1518504615;
        }
        boolean bl = iMediaSession.getMedia().isPlaying();
        boolean bl2 = iMediaSession2.getMedia().isPlaying();
        return Boolean.compare(bl2, bl);
    }

    private static boolean atdh(IMediaSession iMediaSession) {
        int n = -2038618929;
        int n2 = (n = Integer.rotateLeft(n * -995646287, 4) ^ 0x8531DE74) ^ 0x58BCB340;
        if ((n2 ^ n) != 1488761664) {
            int cfr_ignored_0 = (0xDEC1978F ^ n) + -604236072;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return iMediaSession != null && iMediaSession.getMedia() != null && (!iMediaSession.getMedia().getTitle().isEmpty() || !iMediaSession.getMedia().getArtist().isEmpty());
    }

    private void kf() {
        while (true) {
            try {
                while (true) {
                    try {
                        int n = 1283664280;
                        n = Integer.rotateLeft(n * -2038381125, 19) ^ 0xFD33641E;
                        n = System.identityHashCode(this) ^ n;
                        int n2 = n ^ 0x3FDA7E28;
                        if ((n2 ^ n) != 1071283752) {
                            int cfr_ignored_0 = (0x735957B0 ^ n) - -304170303;
                        }
                        if ((0x212 & 0) != 0) {
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
                    Thread.sleep(0x22F33631CB560B59L ^ 0x22F33631CB560B3DL);
                    this.swd_3();
                }
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                continue;
            }
            break;
        }
    }

    private static String zakh_2(String string, int n, int n2, int n3) {
        int n4 = 620477231;
        n4 = Integer.rotateLeft(n4 * 1066286575, 20) ^ 0xE8141CA6;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = n ^ n4) ^ 0xC82C9728;
        if ((n5 ^ n4) != -936601816) {
            int cfr_ignored_0 = (0xECD72C07 ^ n4) + 2118531882;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x50A2F46E ^ n2 - i) + jtq, 4) ^ jsha_2 + i * -837398543));
        }
        return new String(cArray);
    }

    private static void sthsh() {
        int n = -1481713496;
        int n2 = (n = Integer.rotateLeft(n * 543268033, 5) ^ 0x6F8DF977) ^ 0x9EA0D5B2;
        if ((n2 ^ n) != -1633626702) {
            int cfr_ignored_0 = (0x390E0D1A ^ n) - -1477848730;
        }
        yf.athz_2();
    }

    private static Object dhty(Optional optional, Object object) {
        block0: {
            int n = 630120566;
            n = Integer.rotateLeft(n * -1655773805, 28) ^ 0x641124DC;
            Optional optional2 = optional;
            n = Integer.rotateRight((optional2 != null ? System.identityHashCode(optional2) : 0) ^ n, 2);
            Object object2 = object;
            n = (object2 != null ? System.identityHashCode(object2) : 0) ^ n;
            int n2 = n ^ 0x7F59FBCE;
            if ((n2 ^ n) == 2136603598) break block0;
            int cfr_ignored_0 = (0x5AD71BB8 ^ n) - -1338559620;
        }
        return optional.orElse(object);
    }

    private static void dah_6(az_2 az2_2, String string, String string2, long l) {
        int n = -341802683;
        n = Integer.rotateLeft(n * -644896167, 5) ^ 0xEFD8AF14;
        String string3 = string;
        n = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 4);
        int n2 = n ^ 0xEF3E23D3;
        if ((n2 ^ n) != -281140269) {
            int cfr_ignored_0 = (0x49EA296 ^ n) + -625816549;
        }
        az2_2.khnd(string, string2, l);
    }

    private static long szk(long l, long l2) {
        block0: {
            int n = 2126063926;
            n = Integer.rotateLeft(n * 1607477387, 14) ^ 0x8AA434EB;
            int n2 = (n = Integer.rotateRight((int)l ^ n, 10)) ^ 0xD1BEFD27;
            if ((n2 ^ n) == -776012505) break block0;
            int cfr_ignored_0 = (0xAF07D411 ^ n) + -1608349449;
        }
        return Math.min(l, l2);
    }

    private static long hkb(long l, long l2) {
        block0: {
            int n = 1969544116;
            n = Integer.rotateLeft(n * 82772073, 26) ^ 0x877ABD62;
            n = (int)l ^ n;
            int n2 = (n = Integer.rotateLeft((int)l2 ^ n, 25)) ^ 0x8C47E242;
            if ((n2 ^ n) == -1941446078) break block0;
            int cfr_ignored_0 = (0xF92339F6 ^ n) - -415440026;
        }
        return Math.min(l, l2);
    }

    private static void dhfd() {
        int n = bqm.zdr(-1380065815);
        int n2 = n ^ 0xBD463BC0;
        if ((n2 ^ n) != -1119470656) {
            int cfr_ignored_0 = Integer.rotateLeft(0x10FBE629 ^ n, 5) + 316571186;
            int cfr_ignored_1 = (int)(0xD249481427D4EB4FL ^ (long)n ^ 0x6D58831A2DB80943L);
        }
        yf.athz_2();
    }

    private static String bml(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 250861476;
            n4 = Integer.rotateLeft(n4 * -1919977025, 11) ^ 0xC4C672E9;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = n4 ^ 0xCFC9CA43;
            if ((n5 ^ n4) == -808859069) break block0;
            int cfr_ignored_0 = (0xC13A1DE7 ^ n4) + 615709263;
        }
        return qd_2.zakh_2(string, n, n2, n3);
    }

    private static int khshr(byte[] byArray) {
        block0: {
            int n = 1885973964;
            n = Integer.rotateLeft(n * 415482891, 16) ^ 0xFBE60110;
            n = Integer.rotateLeft((byArray != null ? System.identityHashCode(byArray) : 0) ^ n, 13);
            int n2 = n ^ 0x257C86B6;
            if ((n2 ^ n) == 628917942) break block0;
            int cfr_ignored_0 = (0x55152B7A ^ n) + 349353327;
        }
        return Arrays.hashCode(byArray);
    }

    private static Integer shna(int n) {
        block0: {
            int n2 = 848159543;
            n2 = Integer.rotateLeft(n2 * 1771266013, 25) ^ 0x74986DC4;
            int n3 = (n2 = n ^ n2) ^ 0x871A454E;
            if ((n3 ^ n2) == -2028321458) break block0;
            int cfr_ignored_0 = (0xB597A679 ^ n2) + 971955061;
        }
        return n;
    }

    private static class_1011 tsz_7(byte[] byArray) {
        block0: {
            int n = bqm.zdr(1665993633);
            int n2 = n ^ 0x34762DC7;
            if ((n2 ^ n) == 880160199) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x573B2666 ^ n, 13) - -1803074155;
        }
        return class_1011.method_49277((byte[])byArray);
    }

    private static double zhh_6(long l) {
        block0: {
            int n = 425392573;
            int n2 = (n = Integer.rotateLeft(n * -515412313, 10) ^ 0x563EA6E3) ^ 0x871834BB;
            if ((n2 ^ n) == -2028456773) break block0;
            int cfr_ignored_0 = (0x9E42CD06 ^ n) - -878470140;
        }
        return Double.longBitsToDouble(l);
    }

    private static double zdd_4(long l) {
        block0: {
            int n = bqm.zdr(-32624932);
            int n2 = (n = Integer.rotateLeft((int)l ^ n, 10)) ^ 0x60A8B858;
            if ((n2 ^ n) == 1621669976) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x9EA69684 ^ n, 6) - 982112567;
        }
        return Double.longBitsToDouble(l);
    }

    private static int shka_2(class_1011 class_10112, int n, int n2) {
        block0: {
            int n3 = 1719305822;
            n3 = Integer.rotateLeft(n3 * -936271333, 4) ^ 0xCB0ADF34;
            int n4 = (n3 = n2 ^ n3) ^ 0x6E2F6C44;
            if ((n4 ^ n3) == 1848601668) break block0;
            int cfr_ignored_0 = (0x855EA1A ^ n3) + -1779128244;
        }
        return class_10112.method_61940(n, n2);
    }

    private static void zbt_4() {
        int n = bqm.zdr(-380875293);
        int n2 = n ^ 0x208AF4F4;
        if ((n2 ^ n) != 545977588) {
            int cfr_ignored_0 = (Integer.rotateRight(0xC9C6B917 ^ n, 12) - 1936591108) * -909723369;
        }
        yf.athz_2();
    }

    private static int szz_2(class_1011 class_10112) {
        block0: {
            int n = 1465558690;
            n = Integer.rotateLeft(n * -1949016959, 17) ^ 0x304A85A1;
            class_1011 class_10113 = class_10112;
            n = Integer.rotateRight((class_10113 != null ? System.identityHashCode(class_10113) : 0) ^ n, 12);
            int n2 = n ^ 0x2511B11F;
            if ((n2 ^ n) == 621916447) break block0;
            int cfr_ignored_0 = (0x724B17BD ^ n) + 464310518;
        }
        return class_10112.method_4323();
    }

    private static int zaz_4(class_1011 class_10112, int n, int n2) {
        block0: {
            int n3 = 778240548;
            n3 = Integer.rotateLeft(n3 * 1937545781, 18) ^ 0xFC7673DA;
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 6)) ^ 0x29C05015;
            if ((n4 ^ n3) == 700469269) break block0;
            int cfr_ignored_0 = (0x7A35231 ^ n3) - -1421598295;
        }
        return class_10112.method_61940(n, n2);
    }

    private static int rkdh(int n) {
        block0: {
            int n2 = -834273492;
            n2 = Integer.rotateLeft(n2 * -1328204125, 28) ^ 0x167541BA;
            int n3 = (n2 = n ^ n2) ^ 0xB416C1F0;
            if ((n3 ^ n2) == -1273576976) break block0;
            int cfr_ignored_0 = (0x7A533EDC ^ n2) + 708650381;
        }
        return Integer.reverse(n);
    }

    private static boolean dzb_4(Object object, Object object2) {
        block0: {
            int n = bqm.zdr(-750024417);
            Object object3 = object;
            n = Integer.rotateLeft((object3 != null ? System.identityHashCode(object3) : 0) ^ n, 29);
            int n2 = n ^ 0x81004CF5;
            if ((n2 ^ n) == -2130686731) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x524BC5EA ^ n, 13) + -74803567;
        }
        return Objects.equals(object, object2);
    }

    private static boolean thja_2(Object object, Object object2) {
        block0: {
            int n = -1175421718;
            n = Integer.rotateLeft(n * 651787991, 27) ^ 0x7A1396D4;
            Object object3 = object;
            n = (object3 != null ? System.identityHashCode(object3) : 0) ^ n;
            Object object4 = object2;
            n = (object4 != null ? System.identityHashCode(object4) : 0) ^ n;
            int n2 = n ^ 0x25EA7557;
            if ((n2 ^ n) == 636122455) break block0;
            int cfr_ignored_0 = (0x9C1A09BD ^ n) + 1984650269;
        }
        return Objects.equals(object, object2);
    }

    private static int sks_4(int n) {
        block0: {
            int n2 = 165843912;
            n2 = Integer.rotateLeft(n2 * -2111388067, 20) ^ 0xDCE6D7AF;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 16)) ^ 0x66482984;
            if ((n3 ^ n2) == 1716005252) break block0;
            int cfr_ignored_0 = (0x6FAABA4C ^ n2) - 535668065;
        }
        return Integer.reverse(n);
    }

    private static String[] rym(String string) {
        int n = bqm.zdr(713826903);
        int n2 = n ^ 0x31E40308;
        if ((n2 ^ n) != 837026568) {
            int cfr_ignored_0 = (Integer.rotateRight(0x1B68215F ^ n, 6) - 1442425276) * 459809119;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite ghat_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 848442344;
            n3 = Integer.rotateLeft(n3 * -1917344155, 28) ^ 0xA31FCCF9;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 23);
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xB11D35E4;
            if ((n4 ^ n3) != -1323485724) {
                int cfr_ignored_0 = (0x838F060C ^ n3) + 456223790;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ thrdh ^ string.hashCode()) + (n2 + dka) + i ^ thrdh, 14) + dka);
            }
            String[] stringArray = qd_2.rym(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] djhj3m23b4(String string) {
        return string.split("\u0004\u000e", -1);
    }

    private static CallSite fh0tsmnu6rw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ l4jfkj1 ^ string.hashCode() ^ n2 + ua866ofd0 + i * -1164250839) + l4jfkj1) ^ ua866ofd0));
            }
            String[] stringArray = qd_2.djhj3m23b4(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
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

