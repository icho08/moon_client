/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_239
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_3532
 *  net.minecraft.class_3966
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_3532;
import net.minecraft.class_3966;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bsn_2;
import us.m0vy.moondlc.m0vyguard.btdh_2;
import us.m0vy.moondlc.m0vyguard.bzh_4;
import us.m0vy.moondlc.m0vyguard.bghdh;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.ttth;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tkhdh;
import us.m0vy.moondlc.m0vyguard.tzl;
import us.m0vy.moondlc.m0vyguard.dj;
import us.m0vy.moondlc.m0vyguard.dht_6;
import us.m0vy.moondlc.m0vyguard.sth_8;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.ksh;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public final class ba_2
implements tthy {
    public static final int jjh = 96;
    private static final ba_2 INSTANCE;
    private static final int dqy = 1313100593;
    private static final int zwb = 1313686577;
    private static final int drj = 1;
    private static final int dzd = 100000;
    private static final int thkh = 32;
    private static final int zhd_4 = 26;
    private static final double rdhd = 64.0;
    private static final float jk = 72.0f;
    private static final float khthdh = 55.0f;
    private final Object shthb = new Object();
    private final Object rrw = new Object();
    private final ArrayList sthd_3 = new ArrayList(Integer.reverse(1005582774) ^ 0x6D9FD7DC);
    private final ArrayDeque shjgh = new ArrayDeque(0xDD6B6DD6 ^ 0xDD6B6DF6);
    private final float[] jlj = new float[Integer.reverse(194093226) ^ 0x550589C6];
    private final float[] ban_2 = new float[1611973282 + -1611973260];
    private final ExecutorService skhj_2 = Executors.newSingleThreadExecutor(ba_2::zma_3);
    private final bql<btt> tbb = this::dzt_7;
    private final bql<ksh> hnd_2 = this::dhzs_2;
    private volatile btdh_2 khjh_2;
    private volatile boolean dhshz_2;
    private volatile boolean khsb_2;
    private volatile boolean ttha_2;
    private volatile int jkb;
    private volatile float drth = Float.intBitsToFloat(-1295985953 - 855691999);
    private boolean khdth;
    private boolean dksh;
    private boolean tyd_2;
    private long rds_4;
    private long shdq_2;
    private int ttth_2;
    private int tzz_3 = -781274168 + 781274208;
    private int dhs;
    private class_1309 thdha_2;
    private int zhth = Integer.rotateLeft(0xFD1F63BC ^ 0xFD1F23BC, 17);
    private float ghth_2;
    private float rmt;
    private boolean jygh;
    private Future znw;
    private Path dhzd_2;
    private Path kdh;
    private Path khz;
    private static final int khghs = -1928587001;
    private static final int skhh_4 = 32282064;
    private static final int dhn = 378680511;
    private static final int thzw_2 = 1553718864;
    private static final int n2v3g98ja = -973808248;
    private static final int hkqtz2xmwq6f = 2128181141;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int nocbicrkv81;

    private ba_2() {
    }

    public static ba_2 ghthgh() {
        block0: {
            int n = -938693523;
            int n2 = (n = Integer.rotateLeft(n * -1593625451, 19) ^ 0x10900C3B) ^ 0x54583344;
            if ((n2 ^ n) == 1415066436) break block0;
            int cfr_ignored_0 = (0x9C549F29 ^ n) - 1774618687;
        }
        return INSTANCE;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void dtj_4() {
        try {
            int n = 381155599;
            n = Integer.rotateLeft(n * -1413605741, 19) ^ 0xEC28C27E;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 19);
            int n2 = n ^ 0x8BB6D325;
            if ((n2 ^ n) != -1950952667) {
                int cfr_ignored_0 = (0x9D012A2A ^ n) + 597169169;
            }
            if ((0x2E5 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        Object object = this.shthb;
        synchronized (object) {
            if (this.khdth) {
                return;
            }
            this.dhzd_2 = dj.sdr_2.toPath().resolve(ba_2.tkha_2("㥧抟䲚뚲", ba_2.thak_2(1787807047) ^ 0xDE3C39C9, 0xD39B50B4 ^ 0xDD90FDFB, 1992163625 - 841821458));
            this.kdh = this.dhzd_2.resolve("combat-sa".concat(ba_2.tkha_2("鞣챍ᡢ丁摏騲뀯", 405453962 - -846230345, ba_2.sghd(789772602) ^ 0x6FFD9BE4, -758027759 + 1908369926)));
            this.khz = this.dhzd_2.resolve(ba_2.sqj_2(ba_2.tkha_2("幯ց⮏통蟕귛叠秶⽘픫לּ", ba_2.bkhs_2(-1949492182) ^ 0x5AC0A624, Integer.rotateLeft(0x5C5C74D1 ^ 0xAE7BD9B8, 7), Integer.rotateLeft(0x4D674311 ^ 0x6CCF6D98, 23)), ba_2.tkha_2("䪉ᅻ㽧씊錿뤬䜒", 0x8638B1FF ^ 0xE0C4A1C6, ba_2.sjt_3(1099819825) ^ 0xFEAD2893, Integer.reverse(847435332) ^ 0x66FB955B)));
            ba_2.s_3(this);
            ba_2.znsh_2(Moondlc.getInstance().getEventManager(), this);
            this.khdth = true;
        }
    }

    public String tzk_4() {
        int n = sth_8.thad_2(1552118801);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x6FCCAEE0;
        if ((n2 ^ n) != 1875685088) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x334FDAF1 ^ n, 9) + 990454378) * 860871409;
            int cfr_ignored_1 = (int)(0xF1FD74CC27D4EB4FL ^ (long)n ^ 0x14E8831A2DB84E2BL);
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        ba_2.twa_2(this);
        this.stz_2();
        this.skhr();
        tkhdh tkhdh2 = tkhdh.zkhr_2();
        if (tkhdh2.rgha_2()) {
            tkhdh2.dhaq(false, false);
        }
        ba_2.dhkt(this);
        this.ttth_2 = 0;
        this.tyd_2 = false;
        this.dhshz_2 = true;
        return "Neuro: recording r\u0119cznej walki rozpocz\u0119ty. Walcz normalnie; dane zapisz\u0105 si\u0119 po .neuro stop.";
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String dhs() {
        List list;
        try {
            int n = 1286495066;
            n = Integer.rotateLeft(n * -882862607, 24) ^ 0xD985FA4E;
            int n2 = n ^ 0xB71E7B9E;
            if ((n2 ^ n) != -1222739042) {
                int cfr_ignored_0 = (0xFBB020C4 ^ n) + 1591785663;
            }
            if ((0x376 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!ba_2.khtth()) {
            yf.athz_2();
            throw null;
        }
        this.rrd_2();
        if (!this.dhshz_2) {
            return "Neuro: nagrywanie nie jest aktywne.";
        }
        this.dhshz_2 = false;
        this.dhlz();
        Object object = this.shthb;
        synchronized (object) {
            list = List.copyOf(this.sthd_3);
            long l = ++this.rds_4;
            this.ttha_2 = list.size() >= -2122491262 - -2122491358;
            this.jkb = 0;
            this.drth = ba_2.zghy_2(Integer.rotateLeft(0xBD54E9E1 ^ 0x4D54E9FE, 26));
            this.znw = this.skhj_2.submit(() -> this.dnh_3(list, l));
        }
        if (list.size() < (Integer.reverse(-1370688737) ^ 0xF8CF3215)) {
            return "Neuro: zapisano " + list.size() + " próbek, ale potrzeba co najmniej 96. Nagraj dłuższą walkę.";
        }
        return "Neuro: zapisano " + list.size() + " próbek z " + this.ttth_2 + " ataków. Trening działa w tle.";
    }

    public String dzr_3() {
        int n = 96640150;
        n = Integer.rotateLeft(n * 300127023, 10) ^ 0x26AF81D1;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 23);
        int n2 = n ^ 0xA88ADD92;
        if ((n2 ^ n) != -1467294318) {
            int cfr_ignored_0 = (0xAD484104 ^ n) - 1873166238;
        }
        ba_2.jtdh_2(this);
        if (this.dhshz_2) {
            return "Neuro: najpierw zako\u0144cz nagrywanie komend\u0105 .neuro stop.";
        }
        if (this.ttha_2) {
            return "Neuro: trening nadal trwa (epoka " + this.jkb + ").";
        }
        if (this.khjh_2 == null) {
            return "Neuro: brak wytrenowanego modelu. U\u017cyj .neuro record, walcz i wpisz .neuro stop.";
        }
        tkhdh tkhdh2 = tkhdh.zkhr_2();
        ba_2.slkh_2(tkhdh2.shhsh_2);
        boolean bl = this.dksh = !tkhdh2.rgha_2();
        if (this.dksh) {
            ba_2.thya(tkhdh2, true, false);
        }
        this.khsb_2 = true;
        return ba_2.shdh_3(Locale.ROOT, "Neuro: odtwarzanie aktywne (%".concat("d pr\u00f3bek, pewno\u015b\u0107 %.0f%%)."), new Object[]{ba_2.jq(this.khjh_2), Float.valueOf(this.khjh_2.zhj_2() * Float.intBitsToFloat(Integer.reverse(-1651868032) ^ 0x43B651B9))});
    }

    public String tshsh_2() {
        try {
            int n = 12213555;
            n = Integer.rotateLeft(n * -114784725, 11) ^ 0x87D3758F;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 10);
            int n2 = n ^ 0xF708853D;
            if ((n2 ^ n) != -150436547) {
                int cfr_ignored_0 = (0xF7B2D80E ^ n) + 643341636;
            }
            if ((0x3A5 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        ba_2.zss(this);
        if (this.dhshz_2) {
            return this.dhs();
        }
        if (this.khsb_2) {
            ba_2.thz(this);
            return "Neuro: odtwarza".concat("nie zatrzymane.");
        }
        if (this.ttha_2) {
            this.stz_2();
            return ba_2.tkha_2("쓶鼮넫䬃ᵫ㜭줊떢來憘㯠췲빢倯", -1758562332 + 1404768021, ba_2.qs_2(-1896574926) ^ 0xA324DFFD, 0x6DEE091F ^ 0x7CC784ED).concat(ba_2.tkha_2("헐踶ꀥ娂౴♳\ud842꒠廑烟⫤\udcfa꼲", ba_2.dhkb(0xFF1AAAAB ^ 0xC68B46CA, 22), 1356701330 - 1002835579, 0x49B8B9D4 ^ 0x58913426)).concat("chczasowy model").concat(" pozosta\u0142 bez zmian.");
        }
        return "Neuro: \u017caden tr".concat("yb nie jest aktywny.");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String rma_2() {
        int n = -480983253;
        n = Integer.rotateLeft(n * -2022242679, 25) ^ 0xC6298899;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xDBA7C38D;
        if ((n2 ^ n) != -609762419) {
            int cfr_ignored_0 = (0x38F304A6 ^ n) - -98909472;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        ba_2.bzkh(this);
        this.dhshz_2 = false;
        this.skhr();
        ba_2.hthsh(this);
        this.dhlz();
        Object object = this.shthb;
        synchronized (object) {
            ba_2.dns_2(this.sthd_3);
            this.shdq_2 = 0L;
            this.ttth_2 = 0;
            this.khjh_2 = null;
            ++this.rds_4;
        }
        object = this.rrw;
        synchronized (object) {
            ba_2.tlz_4(this.kdh);
            ba_2.hbth(this.khz);
            ba_2.shth_4(ba_2.tjl(this.kdh));
            ba_2.tlz_4(ba_2.bll(this.khz));
        }
        return "Neuro: datas".concat("et i model zos").concat("ta\u0142y wyczyszczone.");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String khmk() {
        int n;
        int n2 = 835287084;
        int n3 = (n2 = Integer.rotateLeft(n2 * 500797055, 18) ^ 0x45A2FEAF) ^ 0xE67D799;
        if ((n3 ^ n2) != 241686425) {
            int cfr_ignored_0 = (0x3FAEAFB5 ^ n2) - -788050498;
        }
        if (yf.dnkh()) {
            throw null;
        }
        ba_2.thy_5(this);
        btdh_2 btdh2 = this.khjh_2;
        Object object = this.shthb;
        synchronized (object) {
            n = this.sthd_3.size();
        }
        Object object2 = this.dhshz_2 ? "record" : (this.khsb_2 ? "play" : (object = this.ttha_2 ? "training" : "idle"));
        if (btdh2 == null) {
            String string = this.ttha_2 ? ", epoka=" + this.jkb + (Float.isFinite(this.drth) ? String.format(Locale.ROOT, ", loss=%.5f", Float.valueOf(this.drth)) : "") : "";
            return "Neuro: tryb=" + (String)object + ", próbki=" + n + ", model=brak" + string + ".";
        }
        Object[] objectArray = new Object[Integer.rotateLeft(0xA96687AF ^ 0xA966879F, 29)];
        objectArray[0] = object;
        objectArray[1] = n;
        objectArray[2] = btdh2.jdhs();
        objectArray[3] = btdh2.zghw_2();
        objectArray[4] = Float.valueOf(btdh2.ssha_3());
        objectArray[5] = Float.valueOf(btdh2.zhj_2() * Float.intBitsToFloat(Integer.reverse(684858210) ^ 0x4104B14));
        return String.format(Locale.ROOT, "Neuro: tryb=%s, pr\u00f3bki=%d".concat(", model=%d pr\u00f3bek/%d epo").concat("k, loss=%.5f, pewno\u015b\u0107=%.0f%%."), objectArray);
    }

    public boolean shnkh(float[] fArray, float[] fArray2, float[] fArray3) {
        int n = sth_8.thad_2(2081431794);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 5);
        n = Integer.rotateLeft((fArray != null ? System.identityHashCode(fArray) : 0) ^ n, 9);
        int n2 = n ^ 0xC68C4231;
        if ((n2 ^ n) != -963886543) {
            int cfr_ignored_0 = Integer.rotateRight(0xBA9C62C3 ^ n, 10) + -1655860008;
        }
        btdh_2 btdh2 = this.khjh_2;
        if (!this.khsb_2 || btdh2 == null) {
            int n3 = 0;
            if (yf.tdhth_2() == 0) {
                n3 = n3 ^ 0xC7D;
            }
            return n3 != 0;
        }
        btdh2.zkhsh_2(fArray, fArray2, fArray3);
        return Float.isFinite(fArray3[0]) && Float.isFinite(fArray3[1]);
    }

    public float dkhkh() {
        try {
            int n = 1006760626;
            n = Integer.rotateLeft(n * -174962931, 15) ^ 0xAC69FDDD;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 21);
            int n2 = n ^ 0x46CF4EEE;
            if ((n2 ^ n) != 1187991278) {
                int cfr_ignored_0 = (0x7ACEBC5C ^ n) + 1133454332;
            }
            if ((0x352 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        btdh_2 btdh2 = this.khjh_2;
        return btdh2 == null ? 0.0f : btdh2.zhj_2();
    }

    public float dhds() {
        btdh_2 btdh2;
        int n = sth_8.thad_2(-1828286390);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 12);
        int n2 = n ^ 0xF609E318;
        if ((n2 ^ n) != -167124200) {
            int cfr_ignored_0 = (Integer.rotateRight(0x650F7352 ^ n, 15) + 1094489641) * 1695511379;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        return (btdh2 = this.khjh_2) == null ? Float.intBitsToFloat(Integer.rotateLeft(0x80078668 ^ 0x600786EB, 23)) : btdh2.ddd_6();
    }

    public float khkdh() {
        try {
            int n = -160541241;
            n = Integer.rotateLeft(n * -2131709279, 25) ^ 0x7DD58062;
            int n2 = n ^ 0x815F2A4D;
            if ((n2 ^ n) != -2124469683) {
                int cfr_ignored_0 = (0x77317F8A ^ n) - 1193691968;
            }
            if ((0x341 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        btdh_2 btdh2 = this.khjh_2;
        return btdh2 == null ? Float.intBitsToFloat(192321707 + 907634517) : btdh2.tkl();
    }

    public int ss() {
        return this.tzz_3;
    }

    public boolean sdh_7() {
        block0: {
            int n = 1095726908;
            n = Integer.rotateLeft(n * -1281346827, 20) ^ 0x1E4BFA68;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x4A45C709;
            if ((n2 ^ n) == 1246086921) break block0;
            int cfr_ignored_0 = (0xB0AB035 ^ n) - -1754580429;
        }
        return this.khsb_2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void tzy() {
        btdh_2 btdh2;
        List list;
        try {
            int n = 318681404;
            n = Integer.rotateLeft(n * 1992329047, 19) ^ 0x997B27E;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
            int n2 = n ^ 0xA3F956B;
            if ((n2 ^ n) != 171939179) {
                int cfr_ignored_0 = (0x18C12457 ^ n) + 280022713;
            }
            if ((0x2A3 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (!this.khdth) {
            return;
        }
        this.dhshz_2 = false;
        this.skhr();
        this.stz_2();
        Object object = this.shthb;
        synchronized (object) {
            list = List.copyOf(this.sthd_3);
            btdh2 = this.khjh_2;
        }
        object = this.rrw;
        synchronized (object) {
            try {
                this.tghq_2(list);
                if (btdh2 != null) {
                    this.zst_7(btdh2);
                }
            }
            catch (IOException iOException) {
                Moondlc.dhrn.error("Failed to persist Neuro state during shutdown", (Throwable)iOException);
            }
        }
        Moondlc.getInstance().getEventManager().shbt_2(this);
        this.skhj_2.shutdownNow();
        try {
            if (!this.skhj_2.awaitTermination(0x2AD2EEA31A38AC6AL ^ 0x2AD2EEA31A38AC68L, TimeUnit.SECONDS)) {
                Moondlc.dhrn.warn("Neuro trainer d".concat("id not terminate wi").concat("thin two seconds"));
            }
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
        this.khdth = false;
    }

    private void rshz_2() {
        Object object;
        float f;
        class_1309 class_13092;
        if (ba_2.mc.field_1724 == null || ba_2.mc.field_1687 == null) {
            return;
        }
        if (tkhdh.zkhr_2().rgha_2()) {
            this.dkha_2();
            if (!this.tyd_2) {
                this.tyd_2 = true;
                bzh_4.rkt(class_2561.method_30163((String)"Neuro: nagrywanie wstrzymane, ponieważ Aura jest włączona."));
            }
            return;
        }
        class_1309 class_13093 = class_13092 = this.dhs > 0 && this.tts_6(this.thdha_2) ? this.thdha_2 : this.bghd();
        if (class_13092 == null) {
            this.dkha_2();
            return;
        }
        class_746 class_7462 = ba_2.mc.field_1724;
        float f2 = class_7462.method_36454();
        float f3 = class_7462.method_36455();
        float f4 = this.jygh ? class_3532.method_15393((float)(f2 - this.ghth_2)) : 0.0f;
        float f5 = f = this.jygh ? f3 - this.rmt : 0.0f;
        if (this.jygh && this.zhth == class_13092.method_5628() && Float.isFinite(f4) && Float.isFinite(f) && Math.abs(f4) <= 120.0f && Math.abs(f) <= 90.0f) {
            object = new tzl((float[])this.jlj.clone(), bsn_2.dash_4(f4), bsn_2.hndh(f));
            if (this.dhs > 0 && this.thdha_2 == class_13092) {
                this.daq_3((tzl)object);
            } else {
                this.tfgh(class_13092.method_5628(), (tzl)object);
            }
        }
        object = new lb(f2, f3);
        lb lb2 = bghdh.dss(class_13092.method_5829().method_1005());
        bsn_2.zwk(this.ban_2, class_7462, class_13092, (lb)object, lb2, f4, f, this.tzz_3, class_7462.method_7261(0.0f) >= 0.9f);
        System.arraycopy(this.ban_2, 0, this.jlj, 0, 22);
        this.zhth = class_13092.method_5628();
        this.ghth_2 = f2;
        this.rmt = f3;
        this.jygh = true;
        if (this.dhs > 0) {
            --this.dhs;
            if (this.dhs == 0) {
                this.thdha_2 = null;
            }
        }
    }

    private void zmd_4(class_1297 class_12972) {
        class_1309 class_13092;
        block12: {
            block11: {
                try {
                    int n = 586054953;
                    n = Integer.rotateLeft(n * -1203148557, 22) ^ 0x3E6ECF48;
                    n = System.identityHashCode(this) ^ n;
                    class_1297 class_12973 = class_12972;
                    n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
                    int n2 = n ^ 0xAE22D24E;
                    if ((n2 ^ n) != -1373449650) {
                        int cfr_ignored_0 = (0x8CCCAF67 ^ n) - -1560888329;
                    }
                    if ((0x1BB & 0) != 0) {
                        throw new RuntimeException();
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw null;
                }
                if (!(class_12972 instanceof class_1309)) break block11;
                class_13092 = (class_1309)class_12972;
                if (ba_2.mc.field_1724 != null) break block12;
            }
            return;
        }
        if (this.khsb_2) {
            this.tzz_3 = 0;
        }
        if (!this.dhshz_2 || tkhdh.zkhr_2().rgha_2()) {
            return;
        }
        this.tzz_3 = 0;
        this.thdha_2 = class_13092;
        this.dhs = -1716921448 - -1716921474;
        ++this.ttth_2;
        for (ttth ttth2 : this.shjgh) {
            if (ttth2.raq_2 != class_13092.method_5628()) continue;
            this.daq_3(ttth2.bath_2);
        }
        this.shjgh.clear();
    }

    private class_1309 bghd() {
        class_1309 class_13092;
        class_3966 class_39662;
        try {
            int n = 1888160462;
            n = Integer.rotateLeft(n * 1529295365, 28) ^ 0xB6B189A8;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 16);
            int n2 = n ^ 0x5D2D55FC;
            if ((n2 ^ n) != 1563252220) {
                int cfr_ignored_0 = (0x2DA65F32 ^ n) - 847087995;
            }
            if ((0xBB & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_239 class_2392 = ba_2.mc.field_1765;
        if (class_2392 instanceof class_3966 && (class_2392 = (class_39662 = (class_3966)class_2392).method_17782()) instanceof class_1309 && this.tts_6(class_13092 = (class_1309)class_2392)) {
            return class_13092;
        }
        class_39662 = ba_2.mc.field_1724;
        class_13092 = null;
        double d = Double.longBitsToDouble(0x4DD68583BA43225BL ^ 0x32268583BA43225BL);
        for (class_1297 class_12972 : ba_2.mc.field_1687.method_18112()) {
            double d2;
            class_1309 class_13093;
            if (!(class_12972 instanceof class_1309) || !this.tts_6(class_13093 = (class_1309)class_12972)) continue;
            class_243 class_2432 = class_13093.method_5829().method_1005();
            double d3 = class_39662.method_33571().method_1025(class_2432);
            if (d3 > Double.longBitsToDouble(0xE8C13D303CF12CBEL ^ 0xA8913D303CF12CBEL)) continue;
            lb lb2 = bghdh.dss(class_2432);
            float f = Math.abs(bghdh.ttb_2(class_39662.method_36454(), lb2.sry()));
            float f2 = Math.abs(lb2.khdhd_2() - class_39662.method_36455());
            if (f > Float.intBitsToFloat(Integer.rotateLeft(0x630802E6 ^ 0x43080263, 23)) || f2 > Float.intBitsToFloat(0x3F05F076 ^ 0x7D59F076) || !((d2 = (double)f + (double)f2 * Double.longBitsToDouble(0xEF492DAD8DBAB53CL ^ 0xD0A8B43414232CA6L) + Math.sqrt(d3) * Double.longBitsToDouble(0x2CF3497E8CA7D0C0L ^ 0x13252F18EAC1B6A6L)) < d)) continue;
            d = d2;
            class_13092 = class_13093;
        }
        return class_13092;
    }

    private boolean tts_6(class_1309 class_13092) {
        int n;
        block1: {
            int n2 = 742784851;
            n2 = Integer.rotateLeft(n2 * -1323322367, 7) ^ 0x4728C60F;
            n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 13);
            class_1309 class_13093 = class_13092;
            n2 = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n2;
            int n3 = n2 ^ 0x4DA5DE68;
            if ((n3 ^ n2) != 1302716008) {
                int cfr_ignored_0 = (0x61E0213B ^ n2) - 848221910;
            }
            n = class_13092 != null && class_13092 != ba_2.mc.field_1724 && class_13092.method_5805() && !class_13092.method_7325() && class_13092.method_37908() == ba_2.mc.field_1687 && ba_2.mc.field_1724.method_5858((class_1297)class_13092) <= Double.longBitsToDouble(0x9ED2F3C55843BE96L ^ 0xDE82F3C55843BE96L) ? 1 : 0;
            if (yf.tdhth_2() != 0) break block1;
            n = n ^ 0xC034;
        }
        return n != 0;
    }

    /*
     * Unable to fully structure code
     */
    private void tfgh(int var1_1, tzl var2_2) {
        var5_3 = 0;
        var3_4 = -1222748320;
        var3_4 = Integer.rotateLeft(var3_4 * -1227019881, 18) ^ -1527668143;
        var3_4 = System.identityHashCode(this) ^ var3_4;
        var3_4 = var1_1 ^ var3_4;
        var4_5 = Integer.reverse(Integer.reverse(-271205282 * -1156299559 + 1104961417 ^ var3_4));
        while (true) {
            block39: {
                block37: {
                    block40: {
                        block41: {
                            block42: {
                                block44: {
                                    block33: {
                                        block34: {
                                            block45: {
                                                block36: {
                                                    block38: {
                                                        block35: {
                                                            block43: {
                                                                var5_3 = ((var4_5 ^ var3_4) - 1104961417) * -1790444695;
                                                                switch (var5_3 & 7) {
                                                                    case 0: {
                                                                        if (var5_3 == 387915368) break block33;
                                                                        if (var5_3 == 1164751696) break block34;
                                                                        (Integer.rotateRight(339653810 ^ var3_4, 5) + 2012577993) * 339653811;
                                                                        if (var5_3 != 184313872) {
                                                                            ** break;
                                                                        }
                                                                        break block35;
                                                                    }
                                                                    case 1: {
                                                                        if (var5_3 != -1333879327) {
                                                                            ** break;
                                                                        }
                                                                        break block36;
                                                                    }
                                                                    case 2: {
                                                                        if (var5_3 != 909724330) {
                                                                            ** break;
                                                                        }
                                                                        break block37;
                                                                    }
                                                                    case 4: {
                                                                        if (var5_3 == 1732612796) break block38;
                                                                        if (var5_3 != -1935825076) {
                                                                            ** break;
                                                                        }
                                                                        break block39;
                                                                    }
                                                                    case 5: {
                                                                        if (var5_3 != 2087662581) {
                                                                            if (var5_3 == 377493557) break;
                                                                            ** break;
                                                                        }
                                                                        break block40;
                                                                    }
                                                                    case 6: {
                                                                        if (var5_3 == -1912176130) break block41;
                                                                        if (var5_3 == -938845450) break block42;
                                                                        if (var5_3 != -271205282) {
                                                                            ** break;
                                                                        }
                                                                        break block43;
                                                                    }
                                                                    case 7: {
                                                                        if (var5_3 == 1855854511) break block44;
                                                                        if (var5_3 != 779732447) {
                                                                            ** break;
                                                                        }
                                                                        break block45;
                                                                    }
                                                                }
                                                                (Integer.rotateLeft(-802311303 ^ var3_4, 13) + 971397858) * -802311303;
                                                                (int)(1341823392542944079L ^ (long)var3_4 ^ -4037332917478127377L);
                                                                this.shjgh.removeFirst();
                                                                var4_5 = Integer.reverse(Integer.reverse(-1126606274 * -1156299559 + 1104961417 ^ var3_4));
                                                                (Integer.rotateRight(1318279935 ^ var3_4, 12) - -2009750500) * 1318279935;
                                                                var4_5 = 184313872 * -1156299559 + 1104961417 ^ var3_4 ^ 542487545 ^ 542487545;
                                                                var5_3 += 4;
                                                                continue;
                                                            }
                                                            Integer.rotateRight(941039942 ^ var3_4, 10) - -819288395;
                                                            if (this.shjgh.size() != (1895119267 ^ 1895119235)) {
                                                                try {
                                                                    var5_3 -= 2;
                                                                    if ((5716526333307515643L ^ (long)var3_4 | 1L) == 0L) {
                                                                        throw new NoSuchElementException();
                                                                    }
                                                                    var4_5 = 184313872 * -1156299559 + 1104961417 ^ var3_4;
                                                                }
                                                                catch (NoSuchElementException v0) {
                                                                    var4_5 = Integer.reverse(Integer.reverse(184313872 * -1156299559 + 1104961417 ^ var3_4));
                                                                }
                                                                continue;
                                                            }
                                                            try {
                                                                --var5_3;
                                                                if ((-320343709775099317L ^ (long)var3_4 | 1L) == 0L) {
                                                                    throw new ArithmeticException();
                                                                }
                                                                var4_5 = 377493557 * -1156299559 + 1104961417 ^ var3_4 ^ -299470882 ^ -299470882;
                                                            }
                                                            catch (ArithmeticException v1) {
                                                                var4_5 = (377493557 * -1156299559 + 1104961417 ^ var3_4) + 930861254 - 930861254;
                                                            }
                                                            var5_3 += 4;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(-1675507327 ^ var3_4, 6) + -327875110;
                                                        (int)(6814904718961470287L ^ (long)var3_4 ^ 3605275650169573623L);
                                                        this.shjgh.addLast(new ttth(var1_1, var2_2));
                                                        return;
                                                    }
                                                    (Integer.rotateLeft(1621428661 ^ var3_4, 15) - -1202074586) * 1621428661;
                                                    (int)(-6766755711875224753L ^ (long)var3_4 ^ -5593326588734674434L);
                                                    var4_5 = (-173482896 * -1156299559 + 1104961417 ^ var3_4) + 1198419935 - 1198419935;
                                                    (Integer.rotateRight(1405418198 ^ var3_4, 13) - 691535653) * 1405418199;
                                                    try {
                                                        var5_3 += 3;
                                                        if ((-885989350004944553L ^ (long)var3_4 | 1L) == 0L) {
                                                            throw new ArithmeticException();
                                                        }
                                                        var4_5 = Integer.reverse(Integer.reverse(-271205282 * -1156299559 + 1104961417 ^ var3_4));
                                                    }
                                                    catch (ArithmeticException v2) {
                                                        var4_5 = -271205282 * -1156299559 + 1104961417 ^ var3_4 ^ 2010609457 ^ 2010609457;
                                                    }
                                                    continue;
                                                }
                                                Integer.rotateRight(898614819 ^ var3_4, 9) + -2134467208;
                                                var4_5 = Integer.reverse(Integer.reverse(-165562056 * -1156299559 + 1104961417 ^ var3_4));
                                                (Integer.rotateLeft(-1740372620 ^ var3_4, 6) - 1956268103) * -1740372619;
                                                var4_5 = (int)((long)(119024658 * -1156299559 + 1104961417 ^ var3_4) ^ 2153021464541549641L ^ 2153021464541549641L);
                                                (Integer.rotateRight(-988764457 ^ var3_4, 11) - -513682620) * -988764457;
                                                var4_5 = (int)((long)(-271205282 * -1156299559 + 1104961417 ^ var3_4) ^ -4797250970877017097L ^ -4797250970877017097L);
                                                var5_3 += 3;
                                                continue;
                                            }
                                            (Integer.rotateLeft(697794097 ^ var3_4, 8) + 230025002) * 697794097;
                                            (int)(-1502566150031742129L ^ (long)var3_4 ^ 6730773791564659610L);
                                            var4_5 = -1153970202 * -1156299559 + 1104961417 ^ var3_4 ^ -1782462440 ^ -1782462440;
                                            Integer.rotateLeft(794703080 ^ var3_4, 8) + -1060763821;
                                            var4_5 = -271205282 * -1156299559 + 1104961417 ^ var3_4;
                                            --var5_3;
                                            continue;
                                        }
                                        Integer.rotateRight(-1270972222 ^ var3_4, 9) + -672188743;
                                        var4_5 = 1867238934 * -1156299559 + 1104961417 ^ var3_4 ^ 347721311 ^ 347721311;
                                        Integer.rotateLeft(11663276 ^ var3_4, 3) - 434806031;
                                        try {
                                            if ((-7144448387698196745L ^ (long)var3_4 | 1L) == 0L) {
                                                throw new IllegalArgumentException();
                                            }
                                            var4_5 = -271205282 * -1156299559 + 1104961417 ^ var3_4 ^ -2111785999 ^ -2111785999;
                                        }
                                        catch (IllegalArgumentException v3) {
                                            var4_5 = -271205282 * -1156299559 + 1104961417 ^ var3_4;
                                        }
                                        var5_3 -= 2;
                                        continue;
                                    }
                                    (Integer.rotateLeft(-957348739 ^ var3_4, 11) - 460204638) * -957348739;
                                    (int)(306994917137509199L ^ (long)var3_4 ^ -6201312538429643436L);
                                    var4_5 = -115121434 * -1156299559 + 1104961417 ^ var3_4;
                                    Integer.rotateLeft(1240998988 ^ var3_4, 12) - -110492561;
                                    var4_5 = (int)((long)(-271205282 * -1156299559 + 1104961417 ^ var3_4) ^ 7174213020759883330L ^ 7174213020759883330L);
                                    continue;
                                }
                                Integer.rotateRight(1113186415 ^ var3_4, 11) - 222284972;
                                var4_5 = Integer.reverse(Integer.reverse(-1260354504 * -1156299559 + 1104961417 ^ var3_4));
                                Integer.rotateRight(1653154379 ^ var3_4, 15) + -218577328;
                                var4_5 = (-271205282 * -1156299559 + 1104961417 ^ var3_4) + -1177302889 - -1177302889;
                                var5_3 -= 2;
                                continue;
                            }
                            Integer.rotateRight(-1302917174 ^ var3_4, 9) + -1662482255;
                            var4_5 = 168253197 * -1156299559 + 1104961417 ^ var3_4 ^ -181930921 ^ -181930921;
                            Integer.rotateRight(15468935 ^ var3_4, 3) - 552781460;
                            var4_5 = (int)((long)(-656198613 * -1156299559 + 1104961417 ^ var3_4) ^ 3557104475041734284L ^ 3557104475041734284L);
                            (Integer.rotateLeft(852807485 ^ var3_4, 9) - 740472734) * 852807485;
                            (int)(-1124104403686200497L ^ (long)var3_4 ^ 4571297770240494877L);
                            var4_5 = Integer.reverse(Integer.reverse(-271205282 * -1156299559 + 1104961417 ^ var3_4));
                            continue;
                        }
                        (Integer.rotateLeft(2105792440 ^ var3_4, 18) + 928300675) * 2105792441;
                        var4_5 = 1290826959 * -1156299559 + 1104961417 ^ var3_4 ^ 1164306925 ^ 1164306925;
                        (Integer.rotateRight(-1794388097 ^ var3_4, 5) - 281788316) * -1794388097;
                        try {
                            var5_3 -= 2;
                            if ((6189357871777624623L ^ (long)var3_4 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            var4_5 = Integer.reverse(Integer.reverse(-271205282 * -1156299559 + 1104961417 ^ var3_4));
                        }
                        catch (NoSuchElementException v4) {
                            var4_5 = -271205282 * -1156299559 + 1104961417 ^ var3_4;
                        }
                        var5_3 += 5;
                        continue;
                    }
                    (Integer.rotateLeft(-24328039 ^ var3_4, 18) + -680924734) * -24328039;
                    (int)(4341019946060671823L ^ (long)var3_4 ^ 3474671260975879597L);
                    var4_5 = (-271205282 * -1156299559 + 1104961417 ^ var3_4) + 1844487482 - 1844487482;
                    Integer.rotateRight(1007505359 ^ var3_4, 10) - 1241139532;
                    var5_3 -= 2;
                    continue;
                }
                Integer.rotateLeft(-1580868320 ^ var3_4, 7) + -1689033189;
                var4_5 = (-2029478575 * -1156299559 + 1104961417 ^ var3_4) + 190116911 - 190116911;
                (Integer.rotateLeft(-1049528875 ^ var3_4, 11) - 1897587718) * -1049528875;
                (int)(271302192719522639L ^ (long)var3_4 ^ 5377442103539903062L);
                var4_5 = -271205282 * -1156299559 + 1104961417 ^ var3_4;
                (Integer.rotateLeft(-1510839280 ^ var3_4, 7) + 481867051) * -1510839279;
                var5_3 += 3;
                continue;
            }
            (Integer.rotateRight(-2122834053 ^ var3_4, 3) + -1310101728) * -2122834053;
            var4_5 = Integer.reverse(Integer.reverse(-1396159796 * -1156299559 + 1104961417 ^ var3_4));
            (Integer.rotateRight(232413495 ^ var3_4, 4) - -1311871772) * 232413495;
            var4_5 = -271205282 * -1156299559 + 1104961417 ^ var3_4 ^ 1659219634 ^ 1659219634;
            var5_3 -= 4;
            continue;
lbl224:
            // 8 sources

            Integer.rotateLeft(760984992 ^ var3_4, 8) + -2106024549;
            var4_5 = (int)((long)(-271205282 * -1156299559 + 1104961417 ^ var3_4) ^ 1026808135544761094L ^ 1026808135544761094L);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void daq_3(tzl tzl2) {
        int n = 1870587288;
        n = Integer.rotateLeft(n * -2110245705, 11) ^ 0x673572DE;
        tzl tzl3 = tzl2;
        n = (tzl3 != null ? System.identityHashCode(tzl3) : 0) ^ n;
        int n2 = n ^ 0x14C816CA;
        if ((n2 ^ n) != 348657354) {
            int cfr_ignored_0 = (0x7BB6F352 ^ n) - 107687323;
        }
        if (Math.abs(tzl2.sts()) < Float.intBitsToFloat(Integer.rotateLeft(0xC2B5E83B ^ 0xC491364F, 23)) && Math.abs(tzl2.ghza_3()) < Float.intBitsToFloat(-2093302477 - 1228384964) && ThreadLocalRandom.current().nextInt(3) != 0) {
            return;
        }
        Object object = this.shthb;
        synchronized (object) {
            ++this.shdq_2;
            if (this.sthd_3.size() < 1957393123 - 1957293123) {
                this.sthd_3.add(tzl2);
                return;
            }
            long l = ThreadLocalRandom.current().nextLong(this.shdq_2);
            if (l < (0xCF2755A4F04E24D0L ^ 0xCF2755A4F04FA270L)) {
                this.sthd_3.set((int)l, tzl2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void dhta_4(List list, long l) {
        try {
            try {
                int n = -1095213235;
                n = Integer.rotateLeft(n * -1843957099, 5) ^ 0xAD683200;
                n = Integer.rotateRight(System.identityHashCode(this) ^ n, 3);
                n = Integer.rotateLeft((int)l ^ n, 17);
                int n2 = n ^ 0x9E5A3A8B;
                if ((n2 ^ n) != -1638253941) {
                    int cfr_ignored_0 = (0x20E265C6 ^ n) - 1062231628;
                }
                if ((0x398 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            if (!yf.khdha_2()) {
                yf.athz_2();
            }
            Object object = this.rrw;
            synchronized (object) {
                block50: {
                    if (this.tss_2(l)) break block50;
                    return;
                }
                this.tghq_2(list);
            }
            if (list.size() < (0x7DD27700 ^ 0x7DD27760) || !this.tss_2(l)) {
                return;
            }
            object = btdh_2.haj(list, this::thwsh);
            Object object2 = this.shthb;
            synchronized (object2) {
                block51: {
                    if (this.tss_2(l)) break block51;
                    return;
                }
                this.khjh_2 = object;
            }
            object2 = this.rrw;
            synchronized (object2) {
                if (this.tss_2(l)) {
                    this.zst_7((btdh_2)object);
                }
            }
            this.jghsh(String.format(Locale.ROOT, "Neuro: trening zako\u0144czony \u2014 %d pr\u00f3".concat("bek, loss %.5f, pewno\u015b\u0107 %.0f%%."), ((btdh_2)object).jdhs(), Float.valueOf(((btdh_2)object).ssha_3()), Float.valueOf(((btdh_2)object).zhj_2() * Float.intBitsToFloat(-2107471805 - 1067092035))));
        }
        catch (CancellationException cancellationException) {
            Moondlc.dhrn.info("Neuro train".concat("ing cancelled"));
        }
        catch (Exception exception) {
            Moondlc.dhrn.error("Neuro training or persistence failed", (Throwable)exception);
            this.thshs_2("Neuro: trening ni".concat("e powi\u00f3d\u0142 si\u0119. Szc").concat("zeg\u00f3\u0142y zapisano w").concat(" logu klienta."));
        }
        finally {
            Object object = this.shthb;
            synchronized (object) {
                if (this.rds_4 == l) {
                    this.ttha_2 = false;
                    this.znw = null;
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean tss_2(long l) {
        int n = 1024026380;
        n = Integer.rotateLeft(n * -362383399, 13) ^ 0x5D87EDD8;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 11);
        int n2 = (n = (int)l ^ n) ^ 0x32E89844;
        if ((n2 ^ n) != 854104132) {
            int cfr_ignored_0 = (0xFE1FF48 ^ n) + 847627547;
        }
        if (yf.dnkh()) {
            throw null;
        }
        Object object = this.shthb;
        synchronized (object) {
            return this.rds_4 == l && !Thread.currentThread().isInterrupted();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void stz_2() {
        int n = -1788899453;
        n = Integer.rotateLeft(n * -749005809, 12) ^ 0x44F94D3B;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
        int n2 = n ^ 0xB687D56D;
        if ((n2 ^ n) != -1232611987) {
            int cfr_ignored_0 = (0x23D85AEE ^ n) - -1117497151;
        }
        Object object = this.shthb;
        synchronized (object) {
            ++this.rds_4;
            if (this.znw != null) {
                this.znw.cancel(true);
                this.znw = null;
            }
            this.ttha_2 = false;
            this.jkb = 0;
            this.drth = Float.intBitsToFloat(Integer.reverse(1313519713) ^ 0xF9DD5272);
        }
    }

    private void skhr() {
        tkhdh tkhdh2;
        int n = sth_8.thad_2(1748257509);
        int n2 = n ^ 0x60DC8292;
        if ((n2 ^ n) != 1625064082) {
            int cfr_ignored_0 = (Integer.rotateRight(0x8E8C877 ^ n, 4) - 411952548) * 149473399;
        }
        if (yf.dnkh()) {
            throw null;
        }
        this.khsb_2 = false;
        if (this.dksh && (tkhdh2 = tkhdh.zkhr_2()).rgha_2()) {
            tkhdh2.dhaq(false, false);
        }
        this.dksh = false;
    }

    private void dhlz() {
        int n = 532978268;
        n = Integer.rotateLeft(n * -1539383371, 21) ^ 0x4BDCBC0F;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 21);
        int n2 = n ^ 0x5AD8D3F5;
        if ((n2 ^ n) != 1524159477) {
            int cfr_ignored_0 = (0x451C49A9 ^ n) - 1564355242;
        }
        this.shjgh.clear();
        this.thdha_2 = null;
        this.dhs = 0;
        this.tzz_3 = 0x8ADD8A35 ^ 0x8ADD8A1D;
        this.dkha_2();
    }

    private void zydh_2() {
        if (!this.dhshz_2 && !this.khsb_2) {
            return;
        }
        this.tzz_3 = Math.min(40, this.tzz_3 + 1);
        if (this.dhshz_2) {
            this.rshz_2();
        }
    }

    private void dkha_2() {
        try {
            int n = -376917140;
            n = Integer.rotateLeft(n * -676267105, 22) ^ 0xF4E36F95;
            int n2 = n ^ 0x36DFE539;
            if ((n2 ^ n) != 920642873) {
                int cfr_ignored_0 = (0xDF575655 ^ n) + 1712248201;
            }
            if ((0x37B & 0) != 0) {
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
        this.jygh = false;
        this.zhth = 2010916890 + 136566758;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void ghzr() {
        int n = 233597984;
        n = Integer.rotateLeft(n * -93009613, 16) ^ 0x240530E8;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 10);
        int n2 = n ^ 0xED8527CD;
        if ((n2 ^ n) != -310040627) {
            int cfr_ignored_0 = (0xE0694BED ^ n) + -138796518;
        }
        if (yf.dnkh()) {
            throw null;
        }
        Object object = this.rrw;
        synchronized (object) {
            try {
                Files.createDirectories(this.dhzd_2, new FileAttribute[0]);
                this.thht_4();
            }
            catch (IOException iOException) {
                this.sthd_3.clear();
                this.shdq_2 = 0L;
                Moondlc.dhrn.error("Failed to load Neuro dataset", (Throwable)iOException);
            }
            try {
                this.srb();
            }
            catch (IOException iOException) {
                this.khjh_2 = null;
                Moondlc.dhrn.error("Failed to load Neuro model", (Throwable)iOException);
            }
        }
    }

    private void thht_4() throws IOException {
        try {
            int n = -158310038;
            n = Integer.rotateLeft(n * 2072192939, 19) ^ 0xEDB4E9F0;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x8028A133;
            if ((n2 ^ n) != -2144820941) {
                int cfr_ignored_0 = (0x76B8C059 ^ n) - -1086122151;
            }
            if ((0x27C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!Files.isRegularFile(this.kdh, new LinkOption[0])) {
            return;
        }
        ArrayList<tzl> arrayList = new ArrayList<tzl>();
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(Files.newInputStream(this.kdh, new OpenOption[0])));){
            if (dataInputStream.readInt() != 1427854330 - 114753737 || dataInputStream.readInt() != 1) {
                throw new IOException("Unsupported Neuro dataset format");
            }
            int n = dataInputStream.readInt();
            int n3 = dataInputStream.readInt();
            if (n != 192223286 + -192223264 || n3 < 0 || n3 > (Integer.reverse(794673466) ^ 0x5C823C54)) {
                throw new IOException("Corrupt Neuro ".concat("dataset header"));
            }
            arrayList.ensureCapacity(n3);
            for (int i = 0; i < n3; ++i) {
                float[] fArray = new float[689436039 - 689436017];
                for (int j = 0; j < (Integer.reverse(-1831543772) ^ 0x243B2B5F); ++j) {
                    fArray[j] = dataInputStream.readFloat();
                    if (Float.isFinite(fArray[j])) continue;
                    throw new IOException("Non-finite Neuro ".concat("dataset feature"));
                }
                float f = dataInputStream.readFloat();
                float f2 = dataInputStream.readFloat();
                if (!Float.isFinite(f) || !Float.isFinite(f2)) {
                    throw new IOException("Non-finite Neuro dataset output");
                }
                arrayList.add(new tzl(fArray, f, f2));
            }
            if (dataInputStream.read() != -1) {
                throw new IOException("Unexpected trailing data in Neuro dataset");
            }
        }
        catch (EOFException eOFException) {
            throw new IOException("Truncated N".concat("euro dataset"), eOFException);
        }
        this.sthd_3.clear();
        this.sthd_3.addAll(arrayList);
        this.shdq_2 = this.sthd_3.size();
    }

    private void srb() throws IOException {
        int n = -2118163465;
        n = Integer.rotateLeft(n * 1262819105, 15) ^ 0xAD64D7C0;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 17);
        int n2 = n ^ 0x635C0766;
        if ((n2 ^ n) != 1666975590) {
            int cfr_ignored_0 = (0xE2E36491 ^ n) - 416995012;
        }
        if (!Files.isRegularFile(this.khz, new LinkOption[0])) {
            return;
        }
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(Files.newInputStream(this.khz, new OpenOption[0])));){
            if (dataInputStream.readInt() != -122417584 - -1436104161 || dataInputStream.readInt() != 1) {
                throw new IOException("Unsupported Neuro model format");
            }
            btdh_2 btdh2 = btdh_2.drw(dataInputStream);
            if (dataInputStream.read() != -1) {
                throw new IOException("Unexpected tra".concat("iling data ").concat("in Neuro model"));
            }
            this.khjh_2 = btdh2;
        }
        catch (EOFException eOFException) {
            throw new IOException("Truncate".concat("d Neuro model"), eOFException);
        }
    }

    private void tghq_2(List list) throws IOException {
        try {
            int n = 1361816087;
            n = Integer.rotateLeft(n * -2138722543, 3) ^ 0x16ADC1DD;
            n = System.identityHashCode(this) ^ n;
            List list2 = list;
            n = Integer.rotateRight((list2 != null ? System.identityHashCode(list2) : 0) ^ n, 14);
            int n2 = n ^ 0xA3F73E42;
            if ((n2 ^ n) != -1544077758) {
                int cfr_ignored_0 = (0xF2DC9455 ^ n) - 1071889722;
            }
            if ((0x332 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        Files.createDirectories(this.dhzd_2, new FileAttribute[0]);
        Path path = ba_2.bll(this.kdh);
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path, new OpenOption[0])));){
            dataOutputStream.writeInt(1432099688 - 118999095);
            dataOutputStream.writeInt(1);
            dataOutputStream.writeInt(Integer.rotateLeft(0x40A6F7B ^ 0x40A377B, 22));
            dataOutputStream.writeInt(list.size());
            for (tzl tzl2 : list) {
                for (float f : tzl2.ghzsh_2()) {
                    dataOutputStream.writeFloat(f);
                }
                dataOutputStream.writeFloat(tzl2.sts());
                dataOutputStream.writeFloat(tzl2.ghza_3());
            }
        }
        ba_2.thgh_2(path, this.kdh);
    }

    private void zst_7(btdh_2 btdh2) throws IOException {
        int n = 962535705;
        int n2 = (n = Integer.rotateLeft(n * -1157173093, 10) ^ 0xDB9536FB) ^ 0x4F2B1EB2;
        if ((n2 ^ n) != 1328225970) {
            int cfr_ignored_0 = (0x76743FAB ^ n) + -1298124946;
        }
        Files.createDirectories(this.dhzd_2, new FileAttribute[0]);
        Path path = ba_2.bll(this.khz);
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path, new OpenOption[0])));){
            dataOutputStream.writeInt(0xB934C609 ^ 0xF7798238);
            dataOutputStream.writeInt(1);
            btdh2.thl_2(dataOutputStream);
        }
        ba_2.thgh_2(path, this.khz);
    }

    private static void thgh_2(Path path, Path path2) throws IOException {
        try {
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        }
        catch (AtomicMoveNotSupportedException atomicMoveNotSupportedException) {
            Files.move(path, path2, StandardCopyOption.REPLACE_EXISTING);
        }
    }

    private static Path bll(Path path) {
        block0: {
            int n = sth_8.thad_2(656620546);
            Path path2 = path;
            n = Integer.rotateLeft((path2 != null ? System.identityHashCode(path2) : 0) ^ n, 8);
            int n2 = n ^ 0x544F397;
            if ((n2 ^ n) == 88404887) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x2267CF95 ^ n, 7) - 787464774) * 577228693;
            int cfr_ignored_1 = (int)(0xE0D561A827D4EB4FL ^ (long)n ^ 0x3E20831A2DB86C7BL);
        }
        return path.resolveSibling(String.valueOf(path.getFileName()) + ".tmp");
    }

    private static void tlz_4(Path path) {
        try {
            int n = -145725839;
            n = Integer.rotateLeft(n * -726672325, 15) ^ 0xD9909DCB;
            int n2 = n ^ 0x17E0E8E7;
            if ((n2 ^ n) != 400615655) {
                int cfr_ignored_0 = (0xE0B08E96 ^ n) - 1296091585;
            }
            Files.deleteIfExists(path);
        }
        catch (IOException iOException) {
            Moondlc.dhrn.error("Failed to delete Neuro file {}", (Object)path, (Object)iOException);
        }
    }

    private void jghsh(String string) {
        try {
            int n = 1418801030;
            n = Integer.rotateLeft(n * 1317722717, 12) ^ 0xF0EAB7E9;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 23);
            int n2 = n ^ 0x692F6C0B;
            if ((n2 ^ n) != 1764715531) {
                int cfr_ignored_0 = (0x3DBE438D ^ n) - -1067299586;
            }
            if ((0x108 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (mc != null) {
            mc.execute(() -> ba_2.rkhf(string));
        }
    }

    private void thshs_2(String string) {
        try {
            int n = -828859022;
            n = Integer.rotateLeft(n * -1724077985, 19) ^ 0x44F0494E;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 15);
            int n2 = n ^ 0x535ECE93;
            if ((n2 ^ n) != 1398722195) {
                int cfr_ignored_0 = (0x9DC653E1 ^ n) + 1020685117;
            }
            if ((0x148 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (mc != null) {
            mc.execute(() -> ba_2.thqm(string));
        }
    }

    private void rrd_2() {
        int n = 0;
        int n2 = 1494627652;
        n2 = Integer.rotateLeft(n2 * -365235017, 22) ^ 0x629B32EB;
        int n3 = Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3) ^ 0x62D51CF4 ^ 0x62D51CF4;
        while (true) {
            block32: {
                block44: {
                    block30: {
                        block41: {
                            block35: {
                                block33: {
                                    block42: {
                                        block43: {
                                            block39: {
                                                block31: {
                                                    block34: {
                                                        block37: {
                                                            block38: {
                                                                block29: {
                                                                    block40: {
                                                                        block36: {
                                                                            block27: {
                                                                                block28: {
                                                                                    if ((n = Integer.reverse(n3) ^ n2 ^ 0x4889D1C3) > -491978221) break block27;
                                                                                    if (n > -1311181500) break block28;
                                                                                    if (n == -2081849869) break block29;
                                                                                    if (n == -1902157687) break block30;
                                                                                    if (n == -1311181500) break block31;
                                                                                    break block32;
                                                                                }
                                                                                if (n == -1295412526) break block33;
                                                                                if (n == -1106285793) break block34;
                                                                                int cfr_ignored_0 = (Integer.rotateRight(0xF23A65BE ^ n2, 17) - 1500508477) * -231053889;
                                                                                if (n == -491978221) break block35;
                                                                                break block32;
                                                                            }
                                                                            if (n > 975426660) break block36;
                                                                            if (n == -215190249) break block37;
                                                                            if (n == 970731082) break block38;
                                                                            if (n == 975426660) break block39;
                                                                            break block32;
                                                                        }
                                                                        if (n > 1338900236) break block40;
                                                                        if (n == 1119644926) break block41;
                                                                        if (n == 1338900236) break block42;
                                                                        int cfr_ignored_1 = (Integer.rotateLeft(0x1032B8D5 ^ n2, 5) - -92143354) * 271759573;
                                                                        int cfr_ignored_2 = (int)(0xD28016E827D4EB4FL ^ (long)n2 ^ 0xD0A0831A2DB808D1L);
                                                                        break block32;
                                                                    }
                                                                    if (n == 1432726784) break block43;
                                                                    if (n == 1546537045) break block44;
                                                                    break block32;
                                                                }
                                                                int cfr_ignored_3 = (Integer.rotateLeft(0x6F5E0ED4 ^ n2, 16) - -2134807833) * 1868435157;
                                                                return;
                                                            }
                                                            int cfr_ignored_4 = Integer.rotateLeft(0xCA805740 ^ n2, 12) + -1981272069;
                                                            if (!this.khdth) {
                                                                try {
                                                                    n -= 3;
                                                                    if ((0x95C4DE2E5C049D6DL ^ (long)n2 | 1L) == 0L) {
                                                                        throw new IllegalArgumentException();
                                                                    }
                                                                    n3 = Integer.reverse(n2 ^ 0xF32C7517 ^ 0x4889D1C3);
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xF32C7517 ^ 0x4889D1C3)));
                                                                }
                                                                continue;
                                                            }
                                                            try {
                                                                ++n;
                                                                if ((0x6ED0B8BDB2A204DDL ^ (long)n2 | 1L) == 0L) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                n3 = Integer.reverse(n2 ^ 0x83E97DF3 ^ 0x4889D1C3);
                                                            }
                                                            catch (IllegalStateException illegalStateException) {
                                                                n3 = Integer.reverse(n2 ^ 0x83E97DF3 ^ 0x4889D1C3) + -665726481 - -665726481;
                                                            }
                                                            ++n;
                                                            continue;
                                                        }
                                                        int cfr_ignored_5 = Integer.rotateLeft(0x976772C0 ^ n2, 5) + 1508148347;
                                                        this.dtj_4();
                                                        try {
                                                            n += 5;
                                                            n3 = (int)((long)Integer.reverse(n2 ^ 0x83E97DF3 ^ 0x4889D1C3) ^ 0x614E75C8A81B28D9L ^ 0x614E75C8A81B28D9L);
                                                        }
                                                        catch (NoSuchElementException noSuchElementException) {
                                                            n3 = (int)((long)Integer.reverse(n2 ^ 0x83E97DF3 ^ 0x4889D1C3) ^ 0x402D68350C00F2EDL ^ 0x402D68350C00F2EDL);
                                                        }
                                                        ++n;
                                                        continue;
                                                    }
                                                    int cfr_ignored_6 = (Integer.rotateLeft(0xE960E41C ^ n2, 16) - 1192836767) * -379526115;
                                                    n3 = Integer.reverse(n2 ^ 0x66B000A0 ^ 0x4889D1C3);
                                                    int cfr_ignored_7 = Integer.rotateRight(0x25E5CACA ^ n2, 7) + -1691275855;
                                                    try {
                                                        n += 4;
                                                        if ((0xF91B8442AEF61EEDL ^ (long)n2 | 1L) == 0L) {
                                                            throw new NoSuchElementException();
                                                        }
                                                        n3 = Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3);
                                                    }
                                                    catch (NoSuchElementException noSuchElementException) {
                                                        n3 = (int)((long)Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3) ^ 0xF365F253536FFD69L ^ 0xF365F253536FFD69L);
                                                    }
                                                    n -= 4;
                                                    continue;
                                                }
                                                int cfr_ignored_8 = Integer.rotateRight(0x512977AB ^ n2, 13) + -664593168;
                                                n3 = Integer.reverse(n2 ^ 0xBD85F69F ^ 0x4889D1C3) ^ 0x89B1B025 ^ 0x89B1B025;
                                                int cfr_ignored_9 = (Integer.rotateLeft(0xE6CD4EBD ^ n2, 15) - -147183586) * -422752579;
                                                int cfr_ignored_10 = (int)(0x247FE08027D4EB4FL ^ (long)n2 ^ 0x3C70831A2DB9E52EL);
                                                try {
                                                    n += 3;
                                                    if ((0xB0462673D50C9847L ^ (long)n2 | 1L) == 0L) {
                                                        throw new UnsupportedOperationException();
                                                    }
                                                    n3 = (int)((long)Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3) ^ 0x6A9DD9EA46CE6A5L ^ 0x6A9DD9EA46CE6A5L);
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    n3 = (int)((long)Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3) ^ 0xAADE6EE2A259B0BBL ^ 0xAADE6EE2A259B0BBL);
                                                }
                                                continue;
                                            }
                                            int cfr_ignored_11 = (Integer.rotateRight(0x123BC81B ^ n2, 5) + 966449792) * 305907739;
                                            n3 = Integer.reverse(n2 ^ 0xCFC94F5F ^ 0x4889D1C3);
                                            int cfr_ignored_12 = Integer.rotateRight(0x56E20A4A ^ n2, 13) + -1984111055;
                                            try {
                                                n -= 5;
                                                if ((0xBED795640BF2139BL ^ (long)n2 | 1L) == 0L) {
                                                    throw new UnsupportedOperationException();
                                                }
                                                n3 = Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3) + -845912277 - -845912277;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                n3 = Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3) ^ 0x5C580AE0 ^ 0x5C580AE0;
                                            }
                                            n += 4;
                                            continue;
                                        }
                                        int cfr_ignored_13 = Integer.rotateRight(0xB6ED8B06 ^ n2, 9) - 723612917;
                                        n3 = Integer.reverse(n2 ^ 0x93DE918D ^ 0x4889D1C3) + -2079346272 - -2079346272;
                                        int cfr_ignored_14 = Integer.rotateLeft(0x932619E1 ^ n2, 5) + -704986758;
                                        int cfr_ignored_15 = (int)(0x5194B7DC27D4EB4FL ^ (long)n2 ^ 0x92C8831A2DB90EF8L);
                                        int cfr_ignored_16 = (int)(0xC64C8D20F1DCD984L ^ (long)n2 ^ 0xE7312F0A482E2148L);
                                        n3 = Integer.reverse(n2 ^ 0x309BAEAB ^ 0x4889D1C3) + -147897653 - -147897653;
                                        int cfr_ignored_17 = (int)(0x8D1075C6E8576784L ^ (long)n2 ^ 0x16FD1C1D342EB7F1L);
                                        n3 = Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3);
                                        continue;
                                    }
                                    int cfr_ignored_18 = Integer.rotateLeft(0xA178F768 ^ n2, 7) + -1845259053;
                                    try {
                                        n -= 2;
                                        if ((0x74E227B258546D55L ^ (long)n2 | 1L) == 0L) {
                                            throw new UnsupportedOperationException();
                                        }
                                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3)));
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        n3 = Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3) + -169124468 - -169124468;
                                    }
                                    n -= 2;
                                    continue;
                                }
                                int cfr_ignored_19 = Integer.rotateRight(0x23292967 ^ n2, 7) - 1180279476;
                                try {
                                    n += 2;
                                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3)));
                                }
                                catch (ArithmeticException arithmeticException) {
                                    n3 = (int)((long)Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3) ^ 0x54AEA98E623B27L ^ 0x54AEA98E623B27L);
                                }
                                n += 4;
                                continue;
                            }
                            int cfr_ignored_20 = (Integer.rotateLeft(0xBEB69539 ^ n2, 10) + 477737250) * -1095330503;
                            int cfr_ignored_21 = (int)(0x7C043B0427D4EB4FL ^ (long)n2 ^ 0x8B78831A2DB955D9L);
                            n3 = Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3);
                            n -= 2;
                            continue;
                        }
                        int cfr_ignored_22 = (Integer.rotateLeft(0x31B02BF8 ^ n2, 9) + 145945155) * 833629177;
                        n3 = Integer.reverse(n2 ^ 0x805AD2AC ^ 0x4889D1C3) ^ 0xDC1C47FF ^ 0xDC1C47FF;
                        int cfr_ignored_23 = (Integer.rotateRight(0x8A0CF3 ^ n2, 3) + 353710248) * 9047283;
                        int cfr_ignored_24 = (int)(0x10D345EAE947C9EDL ^ (long)n2 ^ 0x76A51E3C68FD8C77L);
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3)));
                        continue;
                    }
                    int cfr_ignored_25 = Integer.rotateRight(0xDCBA663 ^ n2, 4) + -1341733576;
                    n3 = Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3);
                    continue;
                }
                int cfr_ignored_26 = Integer.rotateLeft(0xAAAC86C4 ^ n2, 8) - -1354632969;
                n3 = Integer.reverse(n2 ^ 0x8A13EDB2 ^ 0x4889D1C3);
                int cfr_ignored_27 = Integer.rotateLeft(0x23C67861 ^ n2, 7) + 1499869946;
                int cfr_ignored_28 = (int)(0xE174D65C27D4EB4FL ^ (long)n2 ^ 0x51C8831A2DB86F38L);
                try {
                    n -= 5;
                    if ((0xF3C91ADFA271CFE9L ^ (long)n2 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    n3 = Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3);
                }
                catch (NoSuchElementException noSuchElementException) {
                    n3 = Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3);
                }
                n -= 2;
                continue;
            }
            int cfr_ignored_29 = Integer.rotateLeft(0xFA2169C8 ^ n2, 18) + 1315532403;
            n3 = (int)((long)Integer.reverse(n2 ^ 0x39DC2E4A ^ 0x4889D1C3) ^ 0x73A698D9C1F377CBL ^ 0x73A698D9C1F377CBL);
        }
    }

    private static void thqm(String string) {
        int n = -1432061952;
        int n2 = (n = Integer.rotateLeft(n * 517111317, 16) ^ 0xBA3161B6) ^ 0x644935E8;
        if ((n2 ^ n) != 1682519528) {
            int cfr_ignored_0 = (0xCEED4DE8 ^ n) - -1987959969;
        }
        bzh_4.dhght_2(class_2561.method_30163((String)string));
    }

    private static void rkhf(String string) {
        int n = -1964937571;
        n = Integer.rotateLeft(n * -1841308045, 5) ^ 0xDE2F4621;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x1CF0783D;
        if ((n2 ^ n) != 485521469) {
            int cfr_ignored_0 = (0x961116A0 ^ n) - -2002377023;
        }
        bzh_4.ttht_3(class_2561.method_30163((String)string));
    }

    private void thwsh(int n, float f) {
        int n2 = 655653724;
        n2 = Integer.rotateLeft(n2 * 1862156605, 21) ^ 0x1149A67F;
        n2 = System.identityHashCode(this) ^ n2;
        n2 = Integer.rotateLeft(Float.floatToIntBits(f) ^ n2, 10);
        int n3 = n2 ^ 0x7C77F159;
        if ((n3 ^ n2) != 2088235353) {
            int cfr_ignored_0 = (0x5B638A05 ^ n2) - -152437370;
        }
        this.jkb = n;
        this.drth = f;
    }

    private void dnh_3(List list, long l) {
        int n = 1847627441;
        n = Integer.rotateLeft(n * -874947371, 11) ^ 0x1BA03B7F;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 28);
        int n2 = (n = Integer.rotateLeft((int)l ^ n, 13)) ^ 0xA4379A5F;
        if ((n2 ^ n) != -1539859873) {
            int cfr_ignored_0 = (0xCA1714EE ^ n) - -398962372;
        }
        this.dhta_4(list, l);
    }

    private void dhzs_2(ksh ksh2) {
        int n = 1132620425;
        int n2 = (n = Integer.rotateLeft(n * 1365465493, 6) ^ 0x54F7712F) ^ 0x8790CE46;
        if ((n2 ^ n) != -2020553146) {
            int cfr_ignored_0 = (0xC412A4CF ^ n) + 1267142002;
        }
        this.zmd_4(ksh2.jthm());
    }

    private void dzt_7(btt btt2) {
        int n = 1359251543;
        n = Integer.rotateLeft(n * -229597975, 19) ^ 0x35C7BFF5;
        n = System.identityHashCode(this) ^ n;
        btt btt3 = btt2;
        n = (btt3 != null ? System.identityHashCode(btt3) : 0) ^ n;
        int n2 = n ^ 0xDEC95EAB;
        if ((n2 ^ n) != -557228373) {
            int cfr_ignored_0 = (0x8FCDD6FC ^ n) + -70382716;
        }
        this.zydh_2();
    }

    /*
     * Unable to fully structure code
     */
    private static Thread zma_3(Runnable var0) {
        var2_1 = null;
        var5_2 = 0;
        var3_3 = -1825914767;
        var3_3 = Integer.rotateLeft(var3_3 * 1246167223, 15) ^ 2140175734;
        var4_4 = -1805140508 + var3_3 ^ 1492181602 ^ 1492181602;
        while (true) {
            block42: {
                block39: {
                    block44: {
                        block41: {
                            block45: {
                                block47: {
                                    block37: {
                                        block48: {
                                            block36: {
                                                block46: {
                                                    block49: {
                                                        block38: {
                                                            block40: {
                                                                block43: {
                                                                    var5_2 = var4_4 - var3_3;
                                                                    switch (var5_2 & 7) {
                                                                        case 2: {
                                                                            if (var5_2 != 1161881082) {
                                                                                ** break;
                                                                            }
                                                                            break block36;
                                                                        }
                                                                        case 0: {
                                                                            if (var5_2 == -2099264656) break block37;
                                                                            if (var5_2 == -1902231720) break block38;
                                                                            if (var5_2 != -664023584) {
                                                                                ** break;
                                                                            }
                                                                            break block39;
                                                                        }
                                                                        case 1: {
                                                                            if (var5_2 != 1818863721) {
                                                                                ** break;
                                                                            }
                                                                            break block40;
                                                                        }
                                                                        case 7: {
                                                                            if (var5_2 == 374228023) break block41;
                                                                            if (var5_2 == 918204711) break block42;
                                                                            if (var5_2 != 1793150639) {
                                                                                ** break;
                                                                            }
                                                                            break block43;
                                                                        }
                                                                        case 3: {
                                                                            if (var5_2 != -227274837) {
                                                                                ** break;
                                                                            }
                                                                            break block44;
                                                                        }
                                                                        case 6: {
                                                                            if (var5_2 != -2052951850) {
                                                                                ** break;
                                                                            }
                                                                            break block45;
                                                                        }
                                                                        case 4: {
                                                                            if (var5_2 != 877003548) {
                                                                                if (var5_2 == -1805140508) break;
                                                                                ** break;
                                                                            }
                                                                            break block46;
                                                                        }
                                                                        case 5: {
                                                                            if (var5_2 == 1734324253) break block47;
                                                                            if (var5_2 == -1435375243) break block48;
                                                                            if (var5_2 != 1855444357) {
                                                                                ** break;
                                                                            }
                                                                            break block49;
                                                                        }
                                                                    }
                                                                    (Integer.rotateLeft(1180780825 ^ var3_3, 11) + -1977255614) * 1180780825;
                                                                    (int)(-8875496298144011441L ^ (long)var3_3 ^ 3690844043089585270L);
                                                                    if (!yf.dnkh()) {
                                                                        var4_4 = Integer.reverse(Integer.reverse(1818863721 + var3_3));
                                                                        --var5_2;
                                                                        continue;
                                                                    }
                                                                    var4_4 = 1793150639 + var3_3 + 635481660 - 635481660;
                                                                    Integer.rotateLeft(-599423904 ^ var3_3, 14) + -1329027365;
                                                                    var5_2 += 2;
                                                                    continue;
                                                                }
                                                                (Integer.rotateRight(-1739824034 ^ var3_3, 6) - 1973274269) * -1739824033;
                                                                throw null;
                                                            }
                                                            Integer.rotateRight(4146375 ^ var3_3, 3) - 201782100;
                                                            var1_5 = new Thread(var0, "moondlc-".concat("neuro-trainer"));
                                                            var1_5.setDaemon(true);
                                                            var1_5.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Thread;Ljava/lang/Throwable;)V, rnz_2(java.lang.Thread java.lang.Throwable ), (Ljava/lang/Thread;Ljava/lang/Throwable;)V)());
                                                            var2_1 = var1_5;
                                                            var4_4 = Integer.reverse(Integer.reverse(-1340036290 + var3_3));
                                                            (Integer.rotateLeft(1584488181 ^ var3_3, 14) - 1947737830) * 1584488181;
                                                            (int)(-7150607040881824945L ^ (long)var3_3 ^ 2080807176304628822L);
                                                            var4_4 = 918204711 + var3_3 ^ -1545428555 ^ -1545428555;
                                                            var5_2 += 2;
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(-70567496 ^ var3_3, 18) + -2114347901) * -70567495;
                                                        try {
                                                            var5_2 -= 5;
                                                            var4_4 = -1805140508 + var3_3 ^ 1005103159 ^ 1005103159;
                                                        }
                                                        catch (IllegalArgumentException v0) {
                                                            var4_4 = (int)((long)(-1805140508 + var3_3) ^ -621869020061504470L ^ -621869020061504470L);
                                                        }
                                                        ++var5_2;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(-648712015 ^ var3_3, 14) + 1438008490) * -648712015;
                                                    (int)(2010820452189268815L ^ (long)var3_3 ^ 4641103564464822814L);
                                                    var4_4 = Integer.reverse(Integer.reverse(-1479050263 + var3_3));
                                                    (Integer.rotateRight(1471971902 ^ var3_3, 13) - -1540266819) * 1471971903;
                                                    (int)(-3669956491054314064L ^ (long)var3_3 ^ -7387926967556360206L);
                                                    var4_4 = Integer.reverse(Integer.reverse(-1805140508 + var3_3));
                                                    continue;
                                                }
                                                (Integer.rotateRight(-303752929 ^ var3_3, 16) - -753161732) * -303752929;
                                                (int)(4571217658913604647L ^ (long)var3_3 ^ -8571667716196674767L);
                                                var4_4 = (int)((long)(-2108488264 + var3_3) ^ -5064708839129742495L ^ -5064708839129742495L);
                                                (int)(-8750626939411302482L ^ (long)var3_3 ^ -927063768465497906L);
                                                var4_4 = -1805140508 + var3_3 + -22410815 - -22410815;
                                                var5_2 -= 4;
                                                continue;
                                            }
                                            (Integer.rotateRight(1476972186 ^ var3_3, 14) + -1385258015) * 1476972187;
                                            try {
                                                --var5_2;
                                                if ((4476380514636024969L ^ (long)var3_3 | 1L) == 0L) {
                                                    throw new NoSuchElementException();
                                                }
                                                var4_4 = -1805140508 + var3_3;
                                            }
                                            catch (NoSuchElementException v1) {
                                                var4_4 = -1805140508 + var3_3;
                                            }
                                            var5_2 -= 5;
                                            continue;
                                        }
                                        (Integer.rotateRight(385540342 ^ var3_3, 5) - -859906811) * 385540343;
                                        try {
                                            var5_2 += 4;
                                            var4_4 = (int)((long)(-1805140508 + var3_3) ^ 711312674582366075L ^ 711312674582366075L);
                                        }
                                        catch (IllegalStateException v2) {
                                            var4_4 = Integer.reverse(Integer.reverse(-1805140508 + var3_3));
                                        }
                                        continue;
                                    }
                                    (Integer.rotateRight(1213308947 ^ var3_3, 12) + -968883832) * 1213308947;
                                    var4_4 = -118387091 + var3_3;
                                    Integer.rotateLeft(1728985000 ^ var3_3, 15) + 2132171923;
                                    var4_4 = -1805140508 + var3_3 + -1200793722 - -1200793722;
                                    Integer.rotateLeft(2083841420 ^ var3_3, 18) - 247819055;
                                    var5_2 -= 5;
                                    continue;
                                }
                                Integer.rotateRight(-879442193 ^ var3_3, 12) - -1419659732;
                                var4_4 = -935299497 + var3_3;
                                (Integer.rotateLeft(494677520 ^ var3_3, 6) + -1771621589) * 494677521;
                                (int)(-1138335838828185526L ^ (long)var3_3 ^ 6799076073934048694L);
                                var4_4 = -1805140508 + var3_3 + -1633483149 - -1633483149;
                                var5_2 += 5;
                                continue;
                            }
                            (Integer.rotateRight(402428506 ^ var3_3, 5) + -336373727) * 402428507;
                            var4_4 = -1583821719 + var3_3 + -1387671562 - -1387671562;
                            Integer.rotateLeft(3524801 ^ var3_3, 3) + 182513306;
                            (int)(-4429458475309536433L ^ (long)var3_3 ^ 3497189259112622303L);
                            try {
                                var5_2 -= 2;
                                if ((-856864541786798945L ^ (long)var3_3 | 1L) == 0L) {
                                    throw new IllegalArgumentException();
                                }
                                var4_4 = -1805140508 + var3_3 ^ -830147646 ^ -830147646;
                            }
                            catch (IllegalArgumentException v3) {
                                var4_4 = -1805140508 + var3_3 ^ 1397729558 ^ 1397729558;
                            }
                            var5_2 += 5;
                            continue;
                        }
                        (Integer.rotateLeft(451449456 ^ var3_3, 6) + 1183275723) * 451449457;
                        var4_4 = (int)((long)(-1805140508 + var3_3) ^ -5458641230334641087L ^ -5458641230334641087L);
                        continue;
                    }
                    (Integer.rotateLeft(702640569 ^ var3_3, 8) + 380265634) * 702640569;
                    (int)(-1489601293032559793L ^ (long)var3_3 ^ 4789722352167975798L);
                    try {
                        if ((7585013675498070783L ^ (long)var3_3 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var4_4 = Integer.reverse(Integer.reverse(-1805140508 + var3_3));
                    }
                    catch (UnsupportedOperationException v4) {
                        var4_4 = -1805140508 + var3_3 ^ 1605226672 ^ 1605226672;
                    }
                    var5_2 += 4;
                    continue;
                }
                Integer.rotateLeft(-1160233024 ^ var3_3, 10) + -1534240901;
                var4_4 = -1465029317 + var3_3 ^ -458364618 ^ -458364618;
                Integer.rotateLeft(981125024 ^ var3_3, 10) + 423349147;
                try {
                    if ((-374783387443154233L ^ (long)var3_3 | 1L) == 0L) {
                        throw new UnsupportedOperationException();
                    }
                    var4_4 = -1805140508 + var3_3 ^ 1036170775 ^ 1036170775;
                }
                catch (UnsupportedOperationException v5) {
                    var4_4 = Integer.reverse(Integer.reverse(-1805140508 + var3_3));
                }
                var5_2 -= 4;
                continue;
            }
            return var2_1;
lbl213:
            // 9 sources

            Integer.rotateRight(-1888942717 ^ var3_3, 4) + 1645562392;
            var4_4 = -1805140508 + var3_3 ^ -918938841 ^ -918938841;
        }
    }

    private static void rnz_2(Thread thread, Throwable throwable) {
        int n = -1727890796;
        n = Integer.rotateLeft(n * 1499572725, 11) ^ 0xF05CA7A0;
        Thread thread2 = thread;
        n = (thread2 != null ? System.identityHashCode(thread2) : 0) ^ n;
        Throwable throwable2 = throwable;
        n = (throwable2 != null ? System.identityHashCode(throwable2) : 0) ^ n;
        int n2 = n ^ 0xB96392A;
        if ((n2 ^ n) != 194394410) {
            int cfr_ignored_0 = (0x929443BE ^ n) - 439467149;
        }
        Moondlc.dhrn.error("Uncaught error ".concat("in Neuro trainer"), throwable);
    }

    private static String tkha_2(String string, int n, int n2, int n3) {
        int n4 = sth_8.thad_2(1641295723);
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 2);
        int n5 = (n4 = n2 ^ n4) ^ 0xF45D2323;
        if ((n5 ^ n4) != -195222749) {
            int cfr_ignored_0 = Integer.rotateLeft(0x95890C48 ^ n4, 5) + 536222707;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x781EC6F0 ^ n2 - i) + skhh_4, 15) ^ khghs + i * 1513433581));
        }
        return new String(cArray);
    }

    private static int thak_2(int n) {
        block0: {
            int n2 = 2106012518;
            n2 = Integer.rotateLeft(n2 * 255441183, 8) ^ 0x778B801E;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 17)) ^ 0x5EFD64E5;
            if ((n3 ^ n2) == 1593664741) break block0;
            int cfr_ignored_0 = (0x237A5783 ^ n2) + 1889329560;
        }
        return Integer.reverse(n);
    }

    private static int sghd(int n) {
        block0: {
            int n2 = -12391423;
            int n3 = (n2 = Integer.rotateLeft(n2 * -55422887, 21) ^ 0x72011961) ^ 0xF91BF191;
            if ((n3 ^ n2) == -115609199) break block0;
            int cfr_ignored_0 = (0x6591D90 ^ n2) - 177946471;
        }
        return Integer.reverse(n);
    }

    private static int bkhs_2(int n) {
        block0: {
            int n2 = 2132371666;
            n2 = Integer.rotateLeft(n2 * 1783789309, 21) ^ 0x2D3281D2;
            int n3 = (n2 = n ^ n2) ^ 0xF199A5A4;
            if ((n3 ^ n2) == -241588828) break block0;
            int cfr_ignored_0 = (0x8E80CD76 ^ n2) + -1785726477;
        }
        return Integer.reverse(n);
    }

    private static int sjt_3(int n) {
        block0: {
            int n2 = -369189026;
            int n3 = (n2 = Integer.rotateLeft(n2 * 263863429, 23) ^ 0xC652CF9D) ^ 0xED310E80;
            if ((n3 ^ n2) == -315552128) break block0;
            int cfr_ignored_0 = (0x4CF91DE ^ n2) - -1810825929;
        }
        return Integer.reverse(n);
    }

    private static String sqj_2(String string, String string2) {
        block0: {
            int n = sth_8.thad_2(-1706787844);
            int n2 = n ^ 0x75EFD4D4;
            if ((n2 ^ n) == 1978651860) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xEFABAF28 ^ n, 16) + 170382611;
        }
        return string.concat(string2);
    }

    private static void s_3(ba_2 ba2) {
        int n = -954535663;
        n = Integer.rotateLeft(n * 1058257261, 14) ^ 0x4884BF27;
        ba_2 ba3 = ba2;
        n = Integer.rotateRight((ba3 != null ? System.identityHashCode(ba3) : 0) ^ n, 8);
        int n2 = n ^ 0x863A567E;
        if ((n2 ^ n) != -2042997122) {
            int cfr_ignored_0 = (0x4120A76F ^ n) + 1354889954;
        }
        ba2.ghzr();
    }

    private static void znsh_2(dht_6 dht2, Object object) {
        int n = 769348579;
        n = Integer.rotateLeft(n * 947133759, 6) ^ 0xE14CE62B;
        Object object2 = object;
        n = Integer.rotateLeft((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 24);
        int n2 = n ^ 0xDD1085A8;
        if ((n2 ^ n) != -586119768) {
            int cfr_ignored_0 = (0xF0CBD64B ^ n) - -1799802675;
        }
        dht2.sdz_4(object);
    }

    private static void twa_2(ba_2 ba2) {
        int n = 621237847;
        n = Integer.rotateLeft(n * 1793309151, 14) ^ 0xC6074D21;
        ba_2 ba3 = ba2;
        n = Integer.rotateRight((ba3 != null ? System.identityHashCode(ba3) : 0) ^ n, 11);
        int n2 = n ^ 0xEBDFBC1D;
        if ((n2 ^ n) != -337658851) {
            int cfr_ignored_0 = (0xCED8EA4A ^ n) + 942459660;
        }
        ba2.rrd_2();
    }

    private static void dhkt(ba_2 ba2) {
        int n = sth_8.thad_2(2147200996);
        ba_2 ba3 = ba2;
        n = (ba3 != null ? System.identityHashCode(ba3) : 0) ^ n;
        int n2 = n ^ 0x581BC5FD;
        if ((n2 ^ n) != 1478215165) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x27E06A19 ^ n, 7) + -662013886) * 669018649;
            int cfr_ignored_1 = (int)(0xE552C42427D4EB4FL ^ (long)n ^ 0x7538831A2DB86774L);
        }
        ba2.dhlz();
    }

    private static String dhkh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = sth_8.thad_2(1645525861);
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 13)) ^ 0x57ED44D7;
            if ((n5 ^ n4) == 1475167447) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x35F9FFB2 ^ n4, 9) + -1918659127) * 905576371;
        }
        return ba_2.tkha_2(string, n, n2, n3);
    }

    private static boolean khtth() {
        block0: {
            int n = -372510074;
            int n2 = (n = Integer.rotateLeft(n * 1123830023, 23) ^ 0x4F7A9AF3) ^ 0xD7CA1EDC;
            if ((n2 ^ n) == -674619684) break block0;
            int cfr_ignored_0 = (0x3E01EC5A ^ n) + -1102621743;
        }
        return yf.khdha_2();
    }

    private static float zghy_2(int n) {
        block0: {
            int n2 = 1024797615;
            n2 = Integer.rotateLeft(n2 * 375632845, 25) ^ 0xF1B6B20B;
            int n3 = (n2 = n ^ n2) ^ 0xD4370226;
            if ((n3 ^ n2) == -734592474) break block0;
            int cfr_ignored_0 = (0xE9222989 ^ n2) + -665067467;
        }
        return Float.intBitsToFloat(n);
    }

    private static void jtdh_2(ba_2 ba2) {
        int n = -502214692;
        n = Integer.rotateLeft(n * 1264469335, 9) ^ 0xC614125C;
        ba_2 ba3 = ba2;
        n = (ba3 != null ? System.identityHashCode(ba3) : 0) ^ n;
        int n2 = n ^ 0x424FFF6B;
        if ((n2 ^ n) != 1112538987) {
            int cfr_ignored_0 = (0xA05F30B7 ^ n) + -922683982;
        }
        ba2.rrd_2();
    }

    private static fy slkh_2(fy fy2) {
        block0: {
            int n = sth_8.thad_2(585526028);
            int n2 = n ^ 0x48C6110F;
            if ((n2 ^ n) == 1220940047) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x6A207A03 ^ n, 16) + -565418600;
        }
        return fy2.rhh_3();
    }

    private static void thya(tkhdh tkhdh2, boolean bl, boolean bl2) {
        int n = sth_8.thad_2(22206922);
        tkhdh tkhdh3 = tkhdh2;
        n = Integer.rotateRight((tkhdh3 != null ? System.identityHashCode(tkhdh3) : 0) ^ n, 27);
        int n2 = (n = bl ^ n) ^ 0x1183B0A1;
        if ((n2 ^ n) != 293843105) {
            int cfr_ignored_0 = Integer.rotateRight(0x10D1696B ^ n, 5) + 230253360;
        }
        tkhdh2.dhaq(bl, bl2);
    }

    private static String skhk_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1797284474;
            n4 = Integer.rotateLeft(n4 * -506970581, 18) ^ 0x1CB406E1;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 20);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 3)) ^ 0x14C24689;
            if ((n5 ^ n4) == 348276361) break block0;
            int cfr_ignored_0 = (0x7FE224F3 ^ n4) + -981495535;
        }
        return ba_2.tkha_2(string, n, n2, n3);
    }

    private static String sdl(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -747217890;
            n4 = Integer.rotateLeft(n4 * -1562053957, 21) ^ 0x6A45045B;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 16);
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 11)) ^ 0x1B8919C8;
            if ((n5 ^ n4) == 461969864) break block0;
            int cfr_ignored_0 = (0xC8FF45D6 ^ n4) - 1678870137;
        }
        return ba_2.tkha_2(string, n, n2, n3);
    }

    private static int jq(btdh_2 btdh2) {
        block0: {
            int n = -1248278704;
            n = Integer.rotateLeft(n * 1812303013, 15) ^ 0x6233EA3E;
            btdh_2 btdh3 = btdh2;
            n = Integer.rotateLeft((btdh3 != null ? System.identityHashCode(btdh3) : 0) ^ n, 14);
            int n2 = n ^ 0x14691462;
            if ((n2 ^ n) == 342430818) break block0;
            int cfr_ignored_0 = (0xA1F1D332 ^ n) - -1131055339;
        }
        return btdh2.jdhs();
    }

    private static String shdh_3(Locale locale, String string, Object[] objectArray) {
        block0: {
            int n = sth_8.thad_2(2015405425);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x1CDEE8BA;
            if ((n2 ^ n) == 484370618) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x64FE4DCB ^ n, 15) + 1059654352;
        }
        return String.format(locale, string, objectArray);
    }

    private static void zss(ba_2 ba2) {
        int n = sth_8.thad_2(-581957770);
        int n2 = n ^ 0x5F9EA934;
        if ((n2 ^ n) != 1604233524) {
            int cfr_ignored_0 = Integer.rotateRight(0x82CEAE42 ^ n, 3) + -614155975;
        }
        ba2.rrd_2();
    }

    private static void thz(ba_2 ba2) {
        int n = -475596056;
        int n2 = (n = Integer.rotateLeft(n * -2077373545, 24) ^ 0x9B3747EA) ^ 0x2773820B;
        if ((n2 ^ n) != 661881355) {
            int cfr_ignored_0 = (0xC4D578E3 ^ n) - -132288923;
        }
        ba2.skhr();
    }

    private static int qs_2(int n) {
        block0: {
            int n2 = 1980183619;
            n2 = Integer.rotateLeft(n2 * -109606991, 13) ^ 0xE1B42ABA;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 11)) ^ 0x62FBFA60;
            if ((n3 ^ n2) == 1660680800) break block0;
            int cfr_ignored_0 = (0x14FCCE23 ^ n2) + 1156932623;
        }
        return Integer.reverse(n);
    }

    private static int dhkb(int n, int n2) {
        block0: {
            int n3 = sth_8.thad_2(409416711);
            int n4 = n3 ^ 0x585C6DC1;
            if ((n4 ^ n3) == 1482452417) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x403B59C6 ^ n3, 11) - -879919563;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String hthq(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1270037453;
            n4 = Integer.rotateLeft(n4 * -107374833, 7) ^ 0x85E3AAB7;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 26);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 29)) ^ 0x2CCF4F97;
            if ((n5 ^ n4) == 751783831) break block0;
            int cfr_ignored_0 = (0x98838BA4 ^ n4) + -1921629248;
        }
        return ba_2.tkha_2(string, n, n2, n3);
    }

    private static void bzkh(ba_2 ba2) {
        int n = sth_8.thad_2(-2023751641);
        ba_2 ba3 = ba2;
        n = (ba3 != null ? System.identityHashCode(ba3) : 0) ^ n;
        int n2 = n ^ 0x5AA16168;
        if ((n2 ^ n) != 1520525672) {
            int cfr_ignored_0 = Integer.rotateRight(0xDDC1614F ^ n, 14) - -557291572;
        }
        ba2.rrd_2();
    }

    private static void hthsh(ba_2 ba2) {
        int n = -1356826960;
        int n2 = (n = Integer.rotateLeft(n * -1040615097, 14) ^ 0xFBFCE7DE) ^ 0x2A0AEFDF;
        if ((n2 ^ n) != 705359839) {
            int cfr_ignored_0 = (0x852A996F ^ n) - -2109980853;
        }
        ba2.stz_2();
    }

    private static void dns_2(ArrayList arrayList) {
        int n = -1138904606;
        n = Integer.rotateLeft(n * 1385238869, 18) ^ 0x7CCC8335;
        ArrayList arrayList2 = arrayList;
        n = (arrayList2 != null ? System.identityHashCode(arrayList2) : 0) ^ n;
        int n2 = n ^ 0xE7D30372;
        if ((n2 ^ n) != -405601422) {
            int cfr_ignored_0 = (0x5BCEB290 ^ n) - 2143769724;
        }
        arrayList.clear();
    }

    private static void hbth(Path path) {
        int n = 1690686485;
        int n2 = (n = Integer.rotateLeft(n * 1026609899, 11) ^ 0x984E5BC1) ^ 0xAB9FCC6C;
        if ((n2 ^ n) != -1415590804) {
            int cfr_ignored_0 = (0xCF5A1879 ^ n) - -492905697;
        }
        ba_2.tlz_4(path);
    }

    private static Path tjl(Path path) {
        block0: {
            int n = 1313175672;
            int n2 = (n = Integer.rotateLeft(n * -1116152597, 28) ^ 0x52B7795D) ^ 0x5EDDA66F;
            if ((n2 ^ n) == 1591584367) break block0;
            int cfr_ignored_0 = (0x1098DE17 ^ n) - 1877396878;
        }
        return ba_2.bll(path);
    }

    private static void shth_4(Path path) {
        int n = 1035090787;
        int n2 = (n = Integer.rotateLeft(n * 385773675, 18) ^ 0x2AFE635B) ^ 0x61A98A39;
        if ((n2 ^ n) != 1638500921) {
            int cfr_ignored_0 = (0x5C1BB15A ^ n) + -845523958;
        }
        ba_2.tlz_4(path);
    }

    private static String awb(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1476085257;
            n4 = Integer.rotateLeft(n4 * 135833205, 16) ^ 0x1D07CC8C;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 4);
            int n5 = (n4 = n2 ^ n4) ^ 0x9FDC9B6;
            if ((n5 ^ n4) == 167627190) break block0;
            int cfr_ignored_0 = (0xA1F97041 ^ n4) - -1242911439;
        }
        return ba_2.tkha_2(string, n, n2, n3);
    }

    private static void thy_5(ba_2 ba2) {
        int n = 1673604243;
        n = Integer.rotateLeft(n * 1770980653, 10) ^ 0xC6AD257A;
        ba_2 ba3 = ba2;
        n = Integer.rotateLeft((ba3 != null ? System.identityHashCode(ba3) : 0) ^ n, 17);
        int n2 = n ^ 0x9071CB6C;
        if ((n2 ^ n) != -1871590548) {
            int cfr_ignored_0 = (0xF3B0E7FF ^ n) + -788102181;
        }
        ba2.rrd_2();
    }

    private static String[] dghkh(String string) {
        int n = sth_8.thad_2(-2138376183);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x2B474159;
        if ((n2 ^ n) != 726090073) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xABCDB950 ^ n, 8) + -767094805) * -1412581039;
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

    private static CallSite jdh_5(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1288406013;
            n3 = Integer.rotateLeft(n3 * 145065011, 13) ^ 0x9273410;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 9);
            String string3 = string2;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 9);
            int n4 = n3 ^ 0xC7D6955E;
            if ((n4 ^ n3) != -942238370) {
                int cfr_ignored_0 = (0x8B1D16A3 ^ n3) - -377846528;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ dhn ^ string.hashCode() ^ n2 + thzw_2 ^ i * -1461155603 ^ dhn, 18) ^ thzw_2));
            }
            String[] stringArray = ba_2.dghkh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[1], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] c3g69zaktw4(String string) {
        return string.split("\b\u000f", -1);
    }

    private static CallSite tj6g7vjnit(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ n2v3g98ja ^ string.hashCode()) + (n2 + hkqtz2xmwq6f) + i ^ n2v3g98ja, 5) + hkqtz2xmwq6f);
            }
            String[] stringArray = ba_2.c3g69zaktw4(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

