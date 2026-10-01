/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1735
 *  net.minecraft.class_310
 *  net.minecraft.class_5498
 *  net.minecraft.class_9779
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import net.minecraft.class_1735;
import net.minecraft.class_310;
import net.minecraft.class_5498;
import net.minecraft.class_9779;
import us.m0vy.moondlc.m0vyguard.bbd_2;
import us.m0vy.moondlc.m0vyguard.bjz;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bdh_4;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Animation", category=bzw.OTHER, desc="Animates selected actions")
public class btn_2
extends bnq {
    private static btn_2 sjsh;
    private final bbd_2 sjt = new bbd_2(this, "Animate");
    private final s_3 syb = new s_3(this.sjt, "Player List").thst();
    private final s_3 bsw = new s_3(this.sjt, "Inventory").thst();
    private final s_3 khd = new s_3(this.sjt, "Camera Zoom");
    private final s_3 jhz_3 = new s_3(this.sjt, "Chunk Update").thst();
    private final s_3 tta = new s_3(this.sjt, "Perspective Change");
    private final s_3 jha = new s_3(this.sjt, "Chat".concat(" Messages")).thst();
    private final s_3 rhth_2 = new s_3(this.sjt, "Items").thst();
    private final khd tsn_2 = new khd((hy)this, "Chunk Animation", this::kh_3);
    private final fy sjk = new fy(this.tsn_2, "Quart").rhh_3();
    private final fy thkh_4 = new fy(this.tsn_2, "Circ");
    private final fy bsk = new fy(this.tsn_2, "Sine");
    private final fy jar = new fy(this.tsn_2, "Cubic");
    private final tay sghkh = new tay((hy)this, "Speed", this::zjh_3).shth_7(2.0f).dhbs_2(Float.intBitsToFloat(1876003001 + -783386809)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x6707D481 ^ 0x6B07D485, 28)));
    private final bjz sss_2 = new bjz();
    private boolean dds_3;
    private class_5498 tdd_2;
    private double tfr;
    private double dt_4;
    private double bwr;
    private long thzz_4;
    private static final long rwz = 320000000L;
    private final Map shlt_2 = new WeakHashMap();
    private static final int sdt_2 = -948247072;
    private static final int dhzs_4 = 844824493;
    private static final int zhq = -1704785719;
    private static final int thld_2 = -1699334011;
    private static final int xs6cb2eanse = 283923446;
    private static final int o1zj0mi = -645573453;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int jp5ye7rt86bk;

    public static btn_2 shrh_2() {
        block0: {
            int n = 383215030;
            int n2 = (n = Integer.rotateLeft(n * -2041980305, 27) ^ 0xB2276DBE) ^ 0xABC64C4F;
            if ((n2 ^ n) == -1413067697) break block0;
            int cfr_ignored_0 = (0xBD1129F9 ^ n) + -1966445530;
        }
        return sjsh;
    }

    public btn_2() {
        sjsh = this;
    }

    @Override
    public void nt() {
        try {
            int n = -499239092;
            n = Integer.rotateLeft(n * 2017921919, 25) ^ 0x304A3BDD;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x3B16B6CE;
            if ((n2 ^ n) != 991344334) {
                int cfr_ignored_0 = (0xD9288182 ^ n) - -1036947387;
            }
            if ((0x1C4 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        this.dds_3 = false;
        this.sss_2.shkh_6(0.0);
        btn_2.szb_2(this);
    }

    @Override
    public void nc() {
        int n = bdh_4.khghl(-874626168);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x16053806;
        if ((n2 ^ n) != 369440774) {
            int cfr_ignored_0 = Integer.rotateRight(0xDDDB7B8E ^ n, 14) - -504261267;
        }
        this.dds_3 = false;
        btn_2.hngh(this.sss_2, 0.0);
        this.dzy();
    }

    public boolean thnh_2() {
        return this.jhz_3.alh();
    }

    public long khkhm() {
        long l = 0L;
        int n = 0;
        int n2 = 74395263;
        n2 = Integer.rotateLeft(n2 * -1507098325, 21) ^ 0x9C3B0E67;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 10);
        int n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3CE218F5 ^ 0xDD38A8DB) + -583489317));
        block23: while (true) {
            switch (n3 - -583489317 ^ 0xDD38A8DB ^ n2) {
                case 681758543: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0x6169D691 ^ n2, 15) + -802252086) * 1634326161;
                    int cfr_ignored_1 = (int)(0xA3DB78AC27D4EB4FL ^ (long)n2 ^ 0xC28831A2DB8EA67L);
                    yf.athz_2();
                    int cfr_ignored_2 = (int)(0xBFAC790B20EB3B14L ^ (long)n2 ^ 0xF668D658D0ED289L);
                    n3 = (int)((long)((n2 ^ 0x18415D26 ^ 0xDD38A8DB) + -583489317) ^ 0xB315D59F386F9011L ^ 0xB315D59F386F9011L);
                    --n;
                    continue block23;
                }
                case 406936870: {
                    int cfr_ignored_3 = (Integer.rotateRight(0x625BEC9E ^ n2, 15) - -310426019) * 1650191519;
                    l = (long)(this.sghkh.thw_5() * btn_2.dhka_2(Integer.reverse(2115345002) ^ 0x1491A87E));
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x99510C48 ^ 0xDD38A8DB) + -583489317));
                    continue block23;
                }
                case 1021450485: {
                    int cfr_ignored_4 = Integer.rotateRight(0x74BB7E4F ^ n2, 17) - 655485644;
                    if (yf.khdha_2()) {
                        n3 = (n2 ^ 0xA8C141DA ^ 0xDD38A8DB) + -583489317 ^ 0x7A6112A ^ 0x7A6112A;
                        int cfr_ignored_5 = (Integer.rotateRight(0x8098C2B6 ^ n2, 3) - -1763888315) * -2137472329;
                        n3 = (n2 ^ 0x18415D26 ^ 0xDD38A8DB) + -583489317 + -756452071 - -756452071;
                        continue block23;
                    }
                    int cfr_ignored_6 = (int)(0x5526624BA83569BEL ^ (long)n2 ^ 0x39E79CD9285B079DL);
                    n3 = (n2 ^ 0x42964F7E ^ 0xDD38A8DB) + -583489317 ^ 0xE6685179 ^ 0xE6685179;
                    int cfr_ignored_7 = (int)(0x4F8DFE3313BF75B1L ^ (long)n2 ^ 0x116EBCD104532CAL);
                    n3 = (n2 ^ 0x28A2CF4F ^ 0xDD38A8DB) + -583489317 ^ 0x964F1E05 ^ 0x964F1E05;
                    n += 5;
                    continue block23;
                }
                case -1404756238: {
                    int cfr_ignored_8 = (Integer.rotateRight(0xC761BD77 ^ n2, 11) - 691245220) * -949895817;
                    int cfr_ignored_9 = (int)(0x1D12786DDEA33B54L ^ (long)n2 ^ 0xDAB71F58D8F97F5L);
                    n3 = (n2 ^ 0xF01F9277 ^ 0xDD38A8DB) + -583489317 ^ 0x2ABABC68 ^ 0x2ABABC68;
                    int cfr_ignored_10 = (int)(0xE41B9109BA341C79L ^ (long)n2 ^ 0xDF63B8DBC3D465E6L);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3CE218F5 ^ 0xDD38A8DB) + -583489317));
                    continue block23;
                }
                case 346609538: {
                    int cfr_ignored_11 = (Integer.rotateRight(0x6E5B5C77 ^ n2, 16) - 1634587044) * 1851481207;
                    n3 = (n2 ^ 0x3CE218F5 ^ 0xDD38A8DB) + -583489317 + 984853824 - 984853824;
                    int cfr_ignored_12 = Integer.rotateLeft(0x834FCF09 ^ n2, 3) + -351817390;
                    int cfr_ignored_13 = (int)(0x41FD613427D4EB4FL ^ (long)n2 ^ 0x3F18831A2DB92E2BL);
                    continue block23;
                }
                case 1057310196: {
                    int cfr_ignored_14 = (Integer.rotateRight(0x1CA18F7A ^ n2, 6) + 2079194881) * 480350075;
                    n3 = (n2 ^ 0x88BB5571 ^ 0xDD38A8DB) + -583489317 ^ 0x3EF6C11F ^ 0x3EF6C11F;
                    int cfr_ignored_15 = (Integer.rotateLeft(0x901CB0D0 ^ n2, 5) + 2010581099) * -1877167919;
                    int cfr_ignored_16 = (int)(0x74E347FDEE63529DL ^ (long)n2 ^ 0x728B10755E1D4417L);
                    n3 = (n2 ^ 0x124ABCB8 ^ 0xDD38A8DB) + -583489317;
                    int cfr_ignored_17 = (int)(0x147F5E77E2AFB902L ^ (long)n2 ^ 0x419F09EC8923852FL);
                    n3 = (int)((long)((n2 ^ 0x3CE218F5 ^ 0xDD38A8DB) + -583489317) ^ 0x10226AB6037F9F23L ^ 0x10226AB6037F9F23L);
                    continue block23;
                }
                case -714657201: {
                    int cfr_ignored_18 = Integer.rotateRight(0xC2C66BCA ^ n2, 11) + -1704678223;
                    try {
                        n += 4;
                        if ((0x36AAD6268051C9F3L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (n2 ^ 0x3CE218F5 ^ 0xDD38A8DB) + -583489317;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3CE218F5 ^ 0xDD38A8DB) + -583489317));
                    }
                    n -= 4;
                    continue block23;
                }
                case -312429289: {
                    int cfr_ignored_19 = Integer.rotateLeft(0x694F3A69 ^ n2, 16) + -990531086;
                    int cfr_ignored_20 = (int)(0xABFD945427D4EB4FL ^ (long)n2 ^ 0xD5D8831A2DB8FA2AL);
                    n3 = (n2 ^ 0xBECA6631 ^ 0xDD38A8DB) + -583489317;
                    int cfr_ignored_21 = (Integer.rotateLeft(0x93E286F9 ^ n2, 5) + -322177182) * -1813870855;
                    int cfr_ignored_22 = (int)(0x515028C427D4EB4FL ^ (long)n2 ^ 0xACF8831A2DB90F71L);
                    int cfr_ignored_23 = (int)(0xADE8771540E2A555L ^ (long)n2 ^ 0x135A4D76B18CF601L);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3CE218F5 ^ 0xDD38A8DB) + -583489317));
                    n += 5;
                    continue block23;
                }
                case 1689223847: {
                    int cfr_ignored_24 = (Integer.rotateRight(0x42B8A31A ^ n2, 11) + 414801761) * 1119396635;
                    try {
                        n -= 4;
                        n3 = (n2 ^ 0x3CE218F5 ^ 0xDD38A8DB) + -583489317 ^ 0x423A0EDE ^ 0x423A0EDE;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (n2 ^ 0x3CE218F5 ^ 0xDD38A8DB) + -583489317 ^ 0xB72FBF7A ^ 0xB72FBF7A;
                    }
                    ++n;
                    continue block23;
                }
                case -1384607355: {
                    int cfr_ignored_25 = (Integer.rotateRight(0x3C8CC537 ^ n2, 10) - 1500086500) * 1015858487;
                    n3 = (int)((long)((n2 ^ 0x3CE218F5 ^ 0xDD38A8DB) + -583489317) ^ 0x392CA9A36C2AB0ABL ^ 0x392CA9A36C2AB0ABL);
                    continue block23;
                }
                case -1850065821: {
                    int cfr_ignored_26 = (Integer.rotateLeft(0xB146B3FC ^ n2, 9) - 2079156927) * -1320766467;
                    int cfr_ignored_27 = (int)(0xD8F7B128814FF286L ^ (long)n2 ^ 0x9F21CE2C1E2A1C3EL);
                    n3 = (n2 ^ 0x63369CAB ^ 0xDD38A8DB) + -583489317 + -1729564130 - -1729564130;
                    int cfr_ignored_28 = (int)(0x666941344693E312L ^ (long)n2 ^ 0x7F1841943D036103L);
                    n3 = (n2 ^ 0x3CE218F5 ^ 0xDD38A8DB) + -583489317;
                    n += 4;
                    continue block23;
                }
                case 216449718: {
                    int cfr_ignored_29 = Integer.rotateRight(0x99C97D8E ^ n2, 6) - -1547447443;
                    n3 = (int)((long)((n2 ^ 0x84855161 ^ 0xDD38A8DB) + -583489317) ^ 0x7D029E7FCF890C23L ^ 0x7D029E7FCF890C23L);
                    int cfr_ignored_30 = (Integer.rotateRight(0xC3D575B3 ^ n2, 11) + -1154031640) * -1009420877;
                    int cfr_ignored_31 = (int)(0x93812E8B31AA8910L ^ (long)n2 ^ 0xA066AFE6E9068AD3L);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xC7B4B47F ^ 0xDD38A8DB) + -583489317));
                    int cfr_ignored_32 = (int)(0x93E59E698D929B80L ^ (long)n2 ^ 0xC1A3D796CC268A1AL);
                    n3 = (n2 ^ 0x3CE218F5 ^ 0xDD38A8DB) + -583489317 ^ 0x55B76E2C ^ 0x55B76E2C;
                    n += 2;
                    continue block23;
                }
                case 144767032: {
                    int cfr_ignored_33 = Integer.rotateLeft(0x2C2931A0 ^ n2, 8) + 1566220699;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x72D8915A ^ 0xDD38A8DB) + -583489317));
                    int cfr_ignored_34 = (Integer.rotateLeft(0xF3FA22D1 ^ n2, 17) + -1884825974) * -201710895;
                    int cfr_ignored_35 = (int)(0x31488CEC27D4EB4FL ^ (long)n2 ^ 0xE4A8831A2DB9CF40L);
                    try {
                        n += 3;
                        n3 = (int)((long)((n2 ^ 0x3CE218F5 ^ 0xDD38A8DB) + -583489317) ^ 0x89F5E861D0CE5A4CL ^ 0x89F5E861D0CE5A4CL);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (n2 ^ 0x3CE218F5 ^ 0xDD38A8DB) + -583489317 ^ 0xE33B1702 ^ 0xE33B1702;
                    }
                    n += 3;
                    continue block23;
                }
                case -2118043464: {
                    int cfr_ignored_36 = Integer.rotateLeft(0x2415DF4D ^ n2, 7) - 1661184398;
                    int cfr_ignored_37 = (int)(0xE6A7717027D4EB4FL ^ (long)n2 ^ 0x1F90831A2DB8609FL);
                    int cfr_ignored_38 = (int)(0xE404833840A97E69L ^ (long)n2 ^ 0xFB004DE107F465D8L);
                    n3 = (n2 ^ 0x9A6320B0 ^ 0xDD38A8DB) + -583489317;
                    int cfr_ignored_39 = (int)(0xDE81AE2B925B7EA7L ^ (long)n2 ^ 0xA127E805066810D2L);
                    n3 = (n2 ^ 0x3CE218F5 ^ 0xDD38A8DB) + -583489317 ^ 0xDFD7AC22 ^ 0xDFD7AC22;
                    n -= 5;
                    continue block23;
                }
                case -1722741688: {
                    return l;
                }
            }
            int cfr_ignored_40 = (Integer.rotateRight(0xBB2F059B ^ n2, 10) + -1357951744) * -1154546277;
            n3 = (n2 ^ 0x3CE218F5 ^ 0xDD38A8DB) + -583489317 + -1956291952 - -1956291952;
        }
    }

    public float hzm() {
        int n = bdh_4.khghl(-2066637994);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xE5A8228E;
        if ((n2 ^ n) != -441965938) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x6179B9D8 ^ n, 15) + -769974173) * 1635367385;
        }
        if (!this.rgha_2() || !this.rhk() || btn_2.mc.field_1690 == null) {
            return 0.0f;
        }
        boolean bl = btn_2.mc.field_1690.field_1907.method_1434();
        if (bl != this.dds_3) {
            this.dds_3 = bl;
            this.sss_2.shd_6(bl ? 1.0 : 0.0, bl ? 0x62B2C539B77DA921L ^ 0x62B2C539B77DA9D1L : 0x367E6C4A1091DE0AL ^ 0x367E6C4A1091DEB4L, bl ? tbm.srdh : tbm.la);
        }
        this.sss_2.ddhdh();
        return (float)Math.max(0.0, Math.min(1.0, this.sss_2.khbk()));
    }

    public float thkw(long l) {
        try {
            int n = -1933518784;
            n = Integer.rotateLeft(n * -885188779, 22) ^ 0x148D430;
            n = (int)l ^ n;
            int n2 = n ^ 0x4ADFE0F5;
            if ((n2 ^ n) != 1256186101) {
                int cfr_ignored_0 = (0xC61F38B5 ^ n) + -1704521166;
            }
            if ((0x299 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!btn_2.shjj()) {
            yf.athz_2();
            throw null;
        }
        if (!this.rgha_2() || !this.adht_2()) {
            return 1.0f;
        }
        float f = btn_2.rta(1.0f, (float)(System.currentTimeMillis() - l) / Math.max(Float.intBitsToFloat(btn_2.dhhl(0x46C5E071 ^ 0x46C5E825, 19)), this.sghkh.thw_5() * Float.intBitsToFloat(btn_2.thbq(0x35C5F008 ^ 0x3D847008, 3))));
        return btn_2.rshdh(0x56DD56BE ^ 0x69817E48) + Float.intBitsToFloat(0x30AE28A6 ^ 0xEA1748F) * this.stdh_3(f);
    }

    public double dzth_3(double d) {
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        int n = 0;
        int n2 = -494987842;
        n2 = Integer.rotateLeft(n2 * -480184525, 18) ^ 0x9FAB087D;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = Integer.reverse(Integer.reverse(n2 - 1938500559));
        block45: while (true) {
            switch (n2 - n3) {
                case 1938500559: {
                    int cfr_ignored_0 = (Integer.rotateRight(0xF9148CDB ^ n2, 18) + 769306048) * -116093733;
                    if (!btn_2.trt_2()) {
                        try {
                            n -= 5;
                            if ((0xF1CCAAB4DDD5BF9L ^ (long)n2 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            n3 = (int)((long)(n2 - -1435138150) ^ 0xBEF49DFA3D5582DAL ^ 0xBEF49DFA3D5582DAL);
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = n2 - -1435138150;
                        }
                        n += 2;
                        continue block45;
                    }
                    try {
                        n -= 5;
                        if ((0x50E7DC4CDB7BFCCBL ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = n2 - 148487756 ^ 0xC72EAE3E ^ 0xC72EAE3E;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 - 148487756 + -1317345032 - -1317345032;
                    }
                    n += 4;
                    continue block45;
                }
                case -1435138150: {
                    int cfr_ignored_1 = Integer.rotateRight(0x87EFA687 ^ n2, 3) - 2053294484;
                    yf.athz_2();
                    throw null;
                }
                case 148487756: {
                    int cfr_ignored_2 = (Integer.rotateRight(0x22544E13 ^ n2, 7) + 747836296) * 575950355;
                    d2 = Math.max(0.0, Math.min(1.0, d));
                    if (this.tsn_2.sdh_2() != this.thkh_4) {
                        int cfr_ignored_3 = (int)(0x6A2DD973EF58D10CL ^ (long)n2 ^ 0x4F971202593F798AL);
                        n3 = (int)((long)(n2 - 481235992) ^ 0xC3829BE3B68FBE8DL ^ 0xC3829BE3B68FBE8DL);
                        int cfr_ignored_4 = (int)(0x796FF1AB5941866BL ^ (long)n2 ^ 0x1E267E30F7F15F0EL);
                        n3 = n2 - 1506093476;
                        continue block45;
                    }
                    n3 = (int)((long)(n2 - -1218415509) ^ 0xA8F6783210037F9L ^ 0xA8F6783210037F9L);
                    int cfr_ignored_5 = Integer.rotateLeft(0xAAF81488 ^ n2, 8) + -1201136717;
                    n3 = Integer.reverse(Integer.reverse(n2 - 1860654546));
                    n -= 3;
                    continue block45;
                }
                case 1396608065: {
                    int cfr_ignored_6 = (Integer.rotateRight(0xF678E16 ^ n2, 4) - -504900635) * 258444823;
                    d3 = 1.0 - d2;
                    d4 = 1.0 - d3 * d3 * d3;
                    n3 = n2 - -1810191012 ^ 0x79D9CFB6 ^ 0x79D9CFB6;
                    continue block45;
                }
                case -457963328: {
                    int cfr_ignored_7 = (Integer.rotateLeft(0x1985C118 ^ n2, 6) + 462422307) * 428196121;
                    if (btn_2.zty_3(this.tsn_2) == this.bsk) {
                        n3 = n2 - -399301195;
                        int cfr_ignored_8 = Integer.rotateRight(0x9AC61CAB ^ n2, 6) + -1034217488;
                        n += 3;
                        continue block45;
                    }
                    int cfr_ignored_9 = (int)(0x31EEF7B80A29118L ^ (long)n2 ^ 0x2387CDF6D917ABECL);
                    n3 = n2 - -1233539243;
                    int cfr_ignored_10 = (int)(0x1C8F0A433A8EA1BL ^ (long)n2 ^ 0x1C38ABE22F11AE40L);
                    n3 = n2 - -455928947 + -1594541442 - -1594541442;
                    n += 5;
                    continue block45;
                }
                case 1506093476: {
                    int cfr_ignored_11 = (Integer.rotateLeft(0x6EDB659D ^ n2, 16) - 1894706494) * 1859872157;
                    int cfr_ignored_12 = (int)(0xAC69CBA027D4EB4FL ^ (long)n2 ^ 0x6A30831A2DB8F502L);
                    if (btn_2.zty_3(this.tsn_2) != this.bsk) {
                        int cfr_ignored_13 = (int)(0x2AB6F7619FF871E9L ^ (long)n2 ^ 0x13B3F34318F5F8BCL);
                        n3 = Integer.reverse(Integer.reverse(n2 - 662572800));
                        int cfr_ignored_14 = (int)(0xDC72E63A0B1F6706L ^ (long)n2 ^ 0x3104DA8D352A1534L);
                        n3 = n2 - -455928947 + -499150838 - -499150838;
                        continue block45;
                    }
                    n3 = n2 - -399301195 + -1465680850 - -1465680850;
                    continue block45;
                }
                case 1860654546: {
                    int cfr_ignored_15 = Integer.rotateRight(0xB4C0650E ^ n2, 9) - -408298515;
                    d4 = Math.sqrt(1.0 - Math.pow(d2 - 1.0, Double.longBitsToDouble(0x81E5510CD9D83928L ^ 0xC1E5510CD9D83928L)));
                    n3 = n2 - 1146938236 ^ 0x28068AB6 ^ 0x28068AB6;
                    int cfr_ignored_16 = (Integer.rotateRight(0xDDC89B5B ^ n2, 14) + -542609600) * -574055589;
                    n3 = n2 - -1810191012 + -378994804 - -378994804;
                    n += 4;
                    continue block45;
                }
                case -455928947: {
                    int cfr_ignored_17 = (Integer.rotateRight(0x71ACFD97 ^ n2, 17) - -934259580) * 1907162519;
                    if (this.tsn_2.sdh_2() == this.jar) {
                        n3 = n2 - 1396608065 + 1129142083 - 1129142083;
                        n -= 5;
                        continue block45;
                    }
                    try {
                        n -= 3;
                        n3 = (int)((long)(n2 - -2125989340) ^ 0xC75EC626602D21FDL ^ 0xC75EC626602D21FDL);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 - -2125989340;
                    }
                    n += 4;
                    continue block45;
                }
                case -2125989340: {
                    int cfr_ignored_18 = (Integer.rotateRight(0xC6E70CBA ^ n2, 11) + 441985473) * -957936453;
                    d3 = 1.0 - d2;
                    d4 = 1.0 - d3 * d3 * d3 * d3;
                    try {
                        n -= 2;
                        n3 = n2 - -1810191012;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 - -1810191012 ^ 0x22853CD3 ^ 0x22853CD3;
                    }
                    n += 3;
                    continue block45;
                }
                case -399301195: {
                    int cfr_ignored_19 = (Integer.rotateLeft(0x566344F0 ^ n2, 13) + 2053306443) * 1449346289;
                    d4 = Math.sin(d2 * Double.longBitsToDouble(0xD0D48688C51D7C2AL ^ 0x90DDA77391595132L) / Double.longBitsToDouble(0x77876C8DDB91B735L ^ 0x37876C8DDB91B735L));
                    try {
                        n += 3;
                        if ((0xB3EF325AAA339101L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = (int)((long)(n2 - -1810191012) ^ 0xCE31030AB0B72D28L ^ 0xCE31030AB0B72D28L);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 - -1810191012 ^ 0xB2BCCD7 ^ 0xB2BCCD7;
                    }
                    n -= 4;
                    continue block45;
                }
                case -1670076209: {
                    int cfr_ignored_20 = (Integer.rotateRight(0xD8BCB15F ^ n2, 14) - 1127684540) * -658722465;
                    n3 = (int)((long)(n2 - -1437609245) ^ 0xEE6663B2153DA03AL ^ 0xEE6663B2153DA03AL);
                    int cfr_ignored_21 = (Integer.rotateLeft(0x725CABFC ^ n2, 17) - -577342785) * 1918675965;
                    n3 = n2 - 1938500559;
                    int cfr_ignored_22 = (Integer.rotateRight(0x5F54E4D3 ^ n2, 14) + -1884990264) * 1599399123;
                    n += 4;
                    continue block45;
                }
                case 123114191: {
                    int cfr_ignored_23 = (Integer.rotateLeft(0xBCBBD1B9 ^ n2, 10) + -551811934) * -1128541767;
                    int cfr_ignored_24 = (int)(0x7E097F8427D4EB4FL ^ (long)n2 ^ 0x278831A2DB951C3L);
                    n3 = n2 - -1925857987 + 1943068635 - 1943068635;
                    int cfr_ignored_25 = (Integer.rotateRight(0x28F5931B ^ n2, 8) + -98930816) * 687182619;
                    n3 = n2 - 1952833242 ^ 0xC1742E10 ^ 0xC1742E10;
                    int cfr_ignored_26 = (Integer.rotateRight(0x71C58796 ^ n2, 17) - -884405659) * 1908770711;
                    n3 = Integer.reverse(Integer.reverse(n2 - 1938500559));
                    continue block45;
                }
                case -1260644466: {
                    int cfr_ignored_27 = (Integer.rotateRight(0x92FFC637 ^ n2, 5) - -782852124) * -1828731337;
                    n3 = Integer.reverse(Integer.reverse(n2 - -764082705));
                    int cfr_ignored_28 = Integer.rotateRight(0x9563B726 ^ n2, 5) - 460377301;
                    n3 = (int)((long)(n2 - 1938500559) ^ 0x728EF31FD0059F64L ^ 0x728EF31FD0059F64L);
                    n += 4;
                    continue block45;
                }
                case -210671284: {
                    int cfr_ignored_29 = (Integer.rotateLeft(0xFC8C4CB4 ^ n2, 18) - -1722095353) * -57914187;
                    n3 = n2 - 1938500559 ^ 0x95662D6A ^ 0x95662D6A;
                    int cfr_ignored_30 = (Integer.rotateRight(0x2947DD7A ^ n2, 8) + 68251905) * 692575611;
                    n += 2;
                    continue block45;
                }
                case 1197774290: {
                    int cfr_ignored_31 = (Integer.rotateRight(0xCA33D8B6 ^ n2, 12) - -2136679099) * -902571849;
                    try {
                        n += 5;
                        n3 = (int)((long)(n2 - 1938500559) ^ 0xCBA1F30181D97C75L ^ 0xCBA1F30181D97C75L);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 - 1938500559;
                    }
                    n -= 2;
                    continue block45;
                }
                case 1917166416: {
                    int cfr_ignored_32 = (Integer.rotateRight(0x4E975F33 ^ n2, 12) + -2001590680) * 1318543155;
                    n3 = n2 - -1893475190 + 1194125422 - 1194125422;
                    int cfr_ignored_33 = Integer.rotateRight(0x7EAACCAF ^ n2, 18) - 1527539820;
                    try {
                        if ((0xF0E3298FB8DE4993L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 - 1938500559));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 - 1938500559 ^ 0x42B6BC8D ^ 0x42B6BC8D;
                    }
                    continue block45;
                }
                case 998474879: {
                    int cfr_ignored_34 = Integer.rotateRight(0xF8774D8B ^ n2, 18) + 449839888;
                    try {
                        if ((0xF400739A02FC4143L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = n2 - 1938500559 + 1091507614 - 1091507614;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 - 1938500559 + 2057598362 - 2057598362;
                    }
                    continue block45;
                }
                case -1673154282: {
                    int cfr_ignored_35 = (Integer.rotateLeft(0xA0E9A595 ^ n2, 7) - -2136429498) * -1595300459;
                    int cfr_ignored_36 = (int)(0x625B0BA827D4EB4FL ^ (long)n2 ^ 0xEA20831A2DB96967L);
                    try {
                        n -= 3;
                        if ((0xD8552E2C83E8E6C3L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (int)((long)(n2 - 1938500559) ^ 0x48791263EC3DBBFDL ^ 0x48791263EC3DBBFDL);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 - 1938500559 ^ 0x7DD105A7 ^ 0x7DD105A7;
                    }
                    --n;
                    continue block45;
                }
                case 1779164097: {
                    int cfr_ignored_37 = (Integer.rotateRight(0xE618DA9E ^ n2, 15) - -513796003) * -434578785;
                    n3 = n2 - 307664090 ^ 0x5EFA477F ^ 0x5EFA477F;
                    int cfr_ignored_38 = (Integer.rotateRight(0x43ABC436 ^ n2, 11) - 908747205) * 1135330359;
                    int cfr_ignored_39 = (int)(0x64FACA9DAB18F956L ^ (long)n2 ^ 0x684B9A82098B6424L);
                    n3 = n2 - 1405258437;
                    int cfr_ignored_40 = (int)(0xEAF6AFD89521DF8FL ^ (long)n2 ^ 0xA2C1E6F04438783CL);
                    n3 = Integer.reverse(Integer.reverse(n2 - 1938500559));
                    n += 5;
                    continue block45;
                }
                case -1959570300: {
                    int cfr_ignored_41 = Integer.rotateRight(0x9F97FEC6 ^ n2, 6) - 1472559413;
                    n3 = n2 - -1828336854;
                    int cfr_ignored_42 = Integer.rotateRight(0xDCFE880A ^ n2, 14) + -953149327;
                    n3 = n2 - 1938500559 ^ 0x2515F151 ^ 0x2515F151;
                    continue block45;
                }
                case -1395400812: {
                    int cfr_ignored_43 = Integer.rotateLeft(0x184E966C ^ n2, 6) - -169748913;
                    n3 = Integer.reverse(Integer.reverse(n2 - 1938500559));
                    int cfr_ignored_44 = (Integer.rotateLeft(0xB075B671 ^ n2, 9) + 1654568682) * -1334462863;
                    int cfr_ignored_45 = (int)(0x72C7184C27D4EB4FL ^ (long)n2 ^ 0xCDE8831A2DB9485FL);
                    ++n;
                    continue block45;
                }
                case 799702236: {
                    int cfr_ignored_46 = Integer.rotateRight(0x6B18FF06 ^ n2, 16) - -60522251;
                    n3 = Integer.reverse(Integer.reverse(n2 - -168139991));
                    int cfr_ignored_47 = Integer.rotateLeft(0xB9CF09CC ^ n2, 10) - -2073047313;
                    try {
                        n += 4;
                        if ((0xBFB2729EDE74268DL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = n2 - 1938500559 + -1543946556 - -1543946556;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(n2 - 1938500559));
                    }
                    continue block45;
                }
                case -1810191012: {
                    return d4;
                }
            }
            int cfr_ignored_48 = (Integer.rotateRight(0x8B950E3A ^ n2, 4) + -345352127) * -1953165765;
            n3 = Integer.reverse(Integer.reverse(n2 - 1938500559));
        }
    }

    public boolean rhk() {
        block0: {
            int n = -140857117;
            n = Integer.rotateLeft(n * 237336857, 23) ^ 0x4DBEF361;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xEBDB4EC0;
            if ((n2 ^ n) == -337948992) break block0;
            int cfr_ignored_0 = (0x1C41FE23 ^ n) + -360440175;
        }
        return this.syb.alh();
    }

    public boolean adht_2() {
        block0: {
            int n = -379882206;
            int n2 = (n = Integer.rotateLeft(n * -1547652657, 21) ^ 0xD966A03) ^ 0x578CD30A;
            if ((n2 ^ n) == 1468846858) break block0;
            int cfr_ignored_0 = (0xBED7A628 ^ n) - 135613970;
        }
        return btn_2.ghdw(this.bsw);
    }

    public boolean dzy_4() {
        block0: {
            int n = 2042487622;
            int n2 = (n = Integer.rotateLeft(n * 1738683949, 16) ^ 0x340970CD) ^ 0x4DA43314;
            if ((n2 ^ n) == 1302606612) break block0;
            int cfr_ignored_0 = (0x3419D052 ^ n) + 1720004337;
        }
        return this.khd.alh();
    }

    public boolean ghdhb() {
        block0: {
            int n = 1148682660;
            n = Integer.rotateLeft(n * -564219067, 22) ^ 0x408822B0;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
            int n2 = n ^ 0x13B10F32;
            if ((n2 ^ n) == 330370866) break block0;
            int cfr_ignored_0 = (0x57C68E96 ^ n) + -5293697;
        }
        return btn_2.jdhj(this.tta);
    }

    public float jad_2(boolean bl) {
        double d;
        int n = bdh_4.khghl(1521995021);
        n = System.identityHashCode(this) ^ n;
        int n2 = (n = Integer.rotateRight(bl ^ n, 27)) ^ 0xAAC539B9;
        if ((n2 ^ n) != -1429915207) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xF072F4B4 ^ n, 17) - 575226119) * -260901707;
        }
        double d2 = d = bl ? 1.0 : 0.0;
        if (!this.rgha_2() || !btn_2.rah_3(this) || btn_2.mc.field_1690 == null) {
            this.tfr = d;
            this.bwr = d;
            this.dt_4 = d;
            this.thzz_4 = 0L;
            this.tdd_2 = btn_2.mc.field_1690 == null ? null : btn_2.mc.field_1690.method_31044();
            return (float)d;
        }
        class_5498 class_54982 = btn_2.mc.field_1690.method_31044();
        if (this.tdd_2 == null) {
            this.tdd_2 = class_54982;
            this.tfr = d;
            this.dt_4 = d;
            this.bwr = d;
            return (float)d;
        }
        this.shw();
        if (class_54982 != this.tdd_2 || d != this.bwr) {
            boolean bl2;
            boolean bl3 = bl2 = class_54982 != this.tdd_2 && !class_54982.method_31034() && !this.tdd_2.method_31034();
            if (bl2) {
                this.tfr = 0.0;
            }
            this.tdd_2 = class_54982;
            this.dt_4 = this.tfr;
            this.bwr = d;
            this.thzz_4 = System.nanoTime();
        }
        btn_2.dhks(this);
        return (float)Math.max(0.0, btn_2.zfs(1.0, this.tfr));
    }

    private void shw() {
        if (this.thzz_4 == 0L) {
            this.tfr = this.bwr;
            return;
        }
        double d = (double)(System.nanoTime() - this.thzz_4) / 3.2E8;
        if (d >= 1.0) {
            this.tfr = this.bwr;
            this.thzz_4 = 0L;
            return;
        }
        double d2 = Math.max(0.0, d);
        double d3 = 1.0 - Math.pow(1.0 - d2, 3.0);
        this.tfr = this.dt_4 + (this.bwr - this.dt_4) * d3;
    }

    private void dzy() {
        int n = -1881656353;
        n = Integer.rotateLeft(n * 476028425, 26) ^ 0xE4E8E2C9;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x9F31F3B6;
        if ((n2 ^ n) != -1624116298) {
            int cfr_ignored_0 = (0x10E9C069 ^ n) - 896488738;
        }
        this.tdd_2 = null;
        this.tfr = 0.0;
        this.dt_4 = 0.0;
        this.bwr = 0.0;
        this.thzz_4 = 0L;
    }

    public boolean shsh_7() {
        block0: {
            int n = -100044137;
            n = Integer.rotateLeft(n * 2063144339, 22) ^ 0x95E642;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 15);
            int n2 = n ^ 0xBEF14E9E;
            if ((n2 ^ n) == -1091481954) break block0;
            int cfr_ignored_0 = (0x44F83C09 ^ n) + 1802042156;
        }
        return btn_2.shsz_3(this.jha);
    }

    public boolean shdha_2() {
        block0: {
            int n = 2083650442;
            n = Integer.rotateLeft(n * 1170427279, 10) ^ 0x442EFADB;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 9);
            int n2 = n ^ 0xAA7CA45D;
            if ((n2 ^ n) == -1434672035) break block0;
            int cfr_ignored_0 = (0xD64D5FD7 ^ n) + 1135244005;
        }
        return btn_2.sh(this.rhth_2);
    }

    public float dhthth(class_1735 class_17352, boolean bl) {
        try {
            int n = 1806031629;
            n = Integer.rotateLeft(n * -739717033, 16) ^ 0x35446B3C;
            class_1735 class_17353 = class_17352;
            n = Integer.rotateRight((class_17353 != null ? System.identityHashCode(class_17353) : 0) ^ n, 5);
            n = Integer.rotateLeft(bl ^ n, 25);
            int n2 = n ^ 0xCEDA14AE;
            if ((n2 ^ n) != -824568658) {
                int cfr_ignored_0 = (0xA57FCFA3 ^ n) - 1534769633;
            }
            if ((0x33F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            btn_2.thad_3();
        }
        float f = this.shlt_2.getOrDefault(class_17352, btn_2.shddh(1.0f)).floatValue();
        float f2 = bl ? Float.intBitsToFloat(btn_2.shth_5(1039189860) ^ 0x19430FBC) : 1.0f;
        float f3 = bl ? Float.intBitsToFloat(Integer.reverse(-162215596) ^ 0x6A432A6F) : Float.intBitsToFloat(0x9D919200 ^ 0xDD319200);
        float f4 = mc.method_61966() != null ? btn_2.sf_2(mc).method_60636() : Float.intBitsToFloat(Integer.rotateLeft(0xDC0B2870 ^ 0x10D8FCBC, 12));
        float f5 = f + (f2 - f) * (1.0f - (float)btn_2.dzn_2(-f3 * f4));
        this.shlt_2.put(class_17352, Float.valueOf(f5));
        return f5;
    }

    private float stdh_3(float f) {
        try {
            int n = -971198787;
            n = Integer.rotateLeft(n * -892513363, 5) ^ 0x5BE94E47;
            n = System.identityHashCode(this) ^ n;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 4);
            int n2 = n ^ 0xAC63CC43;
            if ((n2 ^ n) != -1402745789) {
                int cfr_ignored_0 = (0x6A7F62FE ^ n) + 2068455835;
            }
            if ((0x11F & 0) != 0) {
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
        float f2 = Math.max(0.0f, Math.min(1.0f, f));
        float f3 = Float.intBitsToFloat(Integer.reverse(766977308) ^ 0x77D20D4);
        float f4 = f3 + 1.0f;
        return 1.0f + f4 * (float)Math.pow(f2 - 1.0f, Double.longBitsToDouble(0x1555E5A669866B96L ^ 0x555DE5A669866B96L)) + f3 * (float)Math.pow(f2 - 1.0f, Double.longBitsToDouble(0x914FB4774B6DBE0DL ^ 0xD14FB4774B6DBE0DL));
    }

    private boolean zjh_3() {
        int n = -1177091562;
        n = Integer.rotateLeft(n * -48240839, 16) ^ 0x9EBB8827;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 13);
        int n2 = n ^ 0x4AA26319;
        if ((n2 ^ n) != 1252156185) {
            int cfr_ignored_0 = (0xF375610F ^ n) - -1761649487;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return !this.jhz_3.alh();
    }

    private boolean kh_3() {
        try {
            int n = 42804655;
            n = Integer.rotateLeft(n * -1093478975, 8) ^ 0x8F473759;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xEAC01D9F;
            if ((n2 ^ n) != -356508257) {
                int cfr_ignored_0 = (0xE84D3830 ^ n) + -1329615532;
            }
            if ((0x14E & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.jhz_3.alh();
    }

    private static String dsth(String string, int n, int n2, int n3) {
        int n4 = -950448687;
        n4 = Integer.rotateLeft(n4 * -1681171315, 26) ^ 0x36117D2D;
        n4 = Integer.rotateLeft(n ^ n4, 12);
        int n5 = (n4 = n2 ^ n4) ^ 0x2061E14A;
        if ((n5 ^ n4) != 543285578) {
            int cfr_ignored_0 = (0xE738AC9B ^ n4) + 1238866696;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xBD3FB3A4 ^ n2 - i) + dhzs_4, 12) ^ sdt_2 + i * 1690751555));
        }
        return new String(cArray);
    }

    private static void szb_2(btn_2 btn2) {
        int n = 589220132;
        n = Integer.rotateLeft(n * -2032065639, 14) ^ 0x86EF2C55;
        btn_2 btn3 = btn2;
        n = Integer.rotateLeft((btn3 != null ? System.identityHashCode(btn3) : 0) ^ n, 5);
        int n2 = n ^ 0xE149F58C;
        if ((n2 ^ n) != -515246708) {
            int cfr_ignored_0 = (0xC2573CA8 ^ n) + 1181721087;
        }
        btn2.dzy();
    }

    private static void hngh(bjz bjz2, double d) {
        int n = bdh_4.khghl(-701542326);
        bjz bjz3 = bjz2;
        n = Integer.rotateLeft((bjz3 != null ? System.identityHashCode(bjz3) : 0) ^ n, 25);
        n = (int)Double.doubleToLongBits(d) ^ n;
        int n2 = n ^ 0x7AB45706;
        if ((n2 ^ n) != 2058639110) {
            int cfr_ignored_0 = Integer.rotateLeft(0xAC9B074C ^ n, 8) - -349994641;
        }
        bjz2.shkh_6(d);
    }

    private static float dhka_2(int n) {
        block0: {
            int n2 = 368637771;
            n2 = Integer.rotateLeft(n2 * -1424899361, 5) ^ 0x8641F7AB;
            int n3 = (n2 = n ^ n2) ^ 0x60802400;
            if ((n3 ^ n2) == 1619010560) break block0;
            int cfr_ignored_0 = (0x7578D34B ^ n2) + 802700867;
        }
        return Float.intBitsToFloat(n);
    }

    private static boolean shjj() {
        block0: {
            int n = 1283466648;
            int n2 = (n = Integer.rotateLeft(n * -918630251, 13) ^ 0x2A3972E6) ^ 0xBC4B37C4;
            if ((n2 ^ n) == -1135921212) break block0;
            int cfr_ignored_0 = (0xF0CB125C ^ n) + -518322654;
        }
        return yf.khdha_2();
    }

    private static int dhhl(int n, int n2) {
        block0: {
            int n3 = bdh_4.khghl(1298127115);
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 8)) ^ 0x1EB500E3;
            if ((n4 ^ n3) == 515178723) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x53EAD9E8 ^ n3, 13) + 768475731;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int thbq(int n, int n2) {
        block0: {
            int n3 = bdh_4.khghl(-783403202);
            int n4 = (n3 = Integer.rotateRight(n ^ n3, 3)) ^ 0x8AF6C775;
            if ((n4 ^ n3) == -1963538571) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x5BB8F04B ^ n3, 14) + 532854864;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float rta(float f, float f2) {
        block0: {
            int n = -23377608;
            n = Integer.rotateLeft(n * 1049314697, 8) ^ 0x8626A137;
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0x8B013ED4;
            if ((n2 ^ n) == -1962852652) break block0;
            int cfr_ignored_0 = (0x759A77EC ^ n) - -2024961030;
        }
        return Math.min(f, f2);
    }

    private static float rshdh(int n) {
        block0: {
            int n2 = 250350338;
            int n3 = (n2 = Integer.rotateLeft(n2 * 289589309, 18) ^ 0xF4CA14F6) ^ 0xA939D0D9;
            if ((n3 ^ n2) == -1455828775) break block0;
            int cfr_ignored_0 = (0xA7D5DBDB ^ n2) + -10125938;
        }
        return Float.intBitsToFloat(n);
    }

    private static boolean trt_2() {
        block0: {
            int n = -1507266942;
            int n2 = (n = Integer.rotateLeft(n * 795838837, 7) ^ 0x5885D167) ^ 0xFC929651;
            if ((n2 ^ n) == -57502127) break block0;
            int cfr_ignored_0 = (0x5ABA78D3 ^ n) - -788669018;
        }
        return yf.khdha_2();
    }

    private static fy zty_3(khd khd2) {
        block0: {
            int n = 422577934;
            n = Integer.rotateLeft(n * -43710183, 17) ^ 0x673DE7E8;
            khd khd3 = khd2;
            n = (khd3 != null ? System.identityHashCode(khd3) : 0) ^ n;
            int n2 = n ^ 0x86C7CDD0;
            if ((n2 ^ n) == -2033726000) break block0;
            int cfr_ignored_0 = (0x9FF7CADE ^ n) + 453348312;
        }
        return khd2.sdh_2();
    }

    private static boolean ghdw(s_3 s2) {
        block0: {
            int n = 1512343501;
            int n2 = (n = Integer.rotateLeft(n * 195053703, 28) ^ 0xE5381210) ^ 0xAE06715;
            if ((n2 ^ n) == 182478613) break block0;
            int cfr_ignored_0 = (0x50C4E0D8 ^ n) + 997710233;
        }
        return s2.alh();
    }

    private static boolean jdhj(s_3 s2) {
        block0: {
            int n = -996289698;
            int n2 = (n = Integer.rotateLeft(n * 1972637277, 5) ^ 0xF9C3D8BC) ^ 0x4A109BD3;
            if ((n2 ^ n) == 1242602451) break block0;
            int cfr_ignored_0 = (0x8E8D488D ^ n) + 470852910;
        }
        return s2.alh();
    }

    private static boolean rah_3(btn_2 btn2) {
        block0: {
            int n = 569408622;
            n = Integer.rotateLeft(n * -1102956317, 25) ^ 0xB0F8A43;
            btn_2 btn3 = btn2;
            n = Integer.rotateLeft((btn3 != null ? System.identityHashCode(btn3) : 0) ^ n, 18);
            int n2 = n ^ 0xE06EE3DE;
            if ((n2 ^ n) == -529603618) break block0;
            int cfr_ignored_0 = (0xC19E9FB0 ^ n) - 1770238026;
        }
        return btn2.ghdhb();
    }

    private static void dhks(btn_2 btn2) {
        int n = -1613263486;
        n = Integer.rotateLeft(n * 909981367, 25) ^ 0xBF698D47;
        btn_2 btn3 = btn2;
        n = (btn3 != null ? System.identityHashCode(btn3) : 0) ^ n;
        int n2 = n ^ 0x34133C75;
        if ((n2 ^ n) != 873675893) {
            int cfr_ignored_0 = (0xABC4B1F7 ^ n) + -135829633;
        }
        btn2.shw();
    }

    private static double zfs(double d, double d2) {
        block0: {
            int n = 1422857118;
            int n2 = (n = Integer.rotateLeft(n * 119789501, 12) ^ 0xBB692AC7) ^ 0xE8BD781B;
            if ((n2 ^ n) == -390236133) break block0;
            int cfr_ignored_0 = (0xBC726B85 ^ n) - 1495844265;
        }
        return Math.min(d, d2);
    }

    private static boolean shsz_3(s_3 s2) {
        block0: {
            int n = -721031366;
            n = Integer.rotateLeft(n * -807839915, 14) ^ 0xF5BFA5F4;
            s_3 s3 = s2;
            n = Integer.rotateLeft((s3 != null ? System.identityHashCode(s3) : 0) ^ n, 5);
            int n2 = n ^ 0x8F8003A8;
            if ((n2 ^ n) == -1887435864) break block0;
            int cfr_ignored_0 = (0x5A85EC92 ^ n) - -1469918034;
        }
        return s2.alh();
    }

    private static boolean sh(s_3 s2) {
        block0: {
            int n = 851232621;
            n = Integer.rotateLeft(n * 1809867757, 9) ^ 0xC9311EBA;
            s_3 s3 = s2;
            n = (s3 != null ? System.identityHashCode(s3) : 0) ^ n;
            int n2 = n ^ 0x56BD67A7;
            if ((n2 ^ n) == 1455253415) break block0;
            int cfr_ignored_0 = (0x6401A0CA ^ n) + -1466098268;
        }
        return s2.alh();
    }

    private static void thad_3() {
        int n = bdh_4.khghl(-1617696645);
        int n2 = n ^ 0x13DD9AFC;
        if ((n2 ^ n) != 333290236) {
            int cfr_ignored_0 = Integer.rotateRight(0x8C4E7287 ^ n, 4) - 31292820;
        }
        yf.athz_2();
    }

    private static Float shddh(float f) {
        block0: {
            int n = -1613361642;
            n = Integer.rotateLeft(n * -342431285, 7) ^ 0xFCEFAB64;
            n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 9);
            int n2 = n ^ 0x5950FE6D;
            if ((n2 ^ n) == 1498480237) break block0;
            int cfr_ignored_0 = (0xC686F07B ^ n) + -1428089913;
        }
        return Float.valueOf(f);
    }

    private static int shth_5(int n) {
        block0: {
            int n2 = bdh_4.khghl(-629156599);
            int n3 = n2 ^ 0xEDE92926;
            if ((n3 ^ n2) == -303486682) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x3796FC2F ^ n2, 9) - -1079629588;
        }
        return Integer.reverse(n);
    }

    private static class_9779 sf_2(class_310 class_3102) {
        block0: {
            int n = bdh_4.khghl(-472818526);
            class_310 class_3103 = class_3102;
            n = (class_3103 != null ? System.identityHashCode(class_3103) : 0) ^ n;
            int n2 = n ^ 0xEA339346;
            if ((n2 ^ n) == -365718714) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x9E2CFE4 ^ n, 4) - 919915479;
        }
        return class_3102.method_61966();
    }

    private static double dzn_2(double d) {
        block0: {
            int n = 1044463958;
            int n2 = (n = Integer.rotateLeft(n * -1455773005, 16) ^ 0xFE1513CA) ^ 0xF01662F6;
            if ((n2 ^ n) == -266968330) break block0;
            int cfr_ignored_0 = (0xCE5723A0 ^ n) - -617120899;
        }
        return Math.exp(d);
    }

    private static String[] bnn(String string) {
        block0: {
            int n = 848790910;
            n = Integer.rotateLeft(n * 2000674247, 16) ^ 0x22B0B3EF;
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 18);
            int n2 = n ^ 0x4F0934EA;
            if ((n2 ^ n) == 1326003434) break block0;
            int cfr_ignored_0 = (0x7D9EB194 ^ n) - 1118594195;
        }
        return string.split("\u0004\u0015", -1);
    }

    private static CallSite awdh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 489265646;
            n3 = Integer.rotateLeft(n3 * 379074761, 16) ^ 0x26B36D03;
            String string3 = string;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 23);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 3);
            int n4 = n3 ^ 0x5FBF6DB5;
            if ((n4 ^ n3) != 1606380981) {
                int cfr_ignored_0 = (0x4296F45B ^ n3) + -1258451802;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ zhq ^ string.hashCode() ^ n2 + thld_2 ^ i * 1529915061 ^ zhq, 16) ^ thld_2));
            }
            String[] stringArray = btn_2.bnn(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] kx02b5c9sgmreo(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite xkpfqd8g55(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ xs6cb2eanse ^ string.hashCode()) + (n2 + o1zj0mi) + i ^ xs6cb2eanse, 8) + o1zj0mi);
            }
            String[] stringArray = btn_2.kx02b5c9sgmreo(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

