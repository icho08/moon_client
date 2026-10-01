/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 */
package us.m0vy.moondlc.m0vyguard;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bthy;
import us.m0vy.moondlc.m0vyguard.bhr;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bghq;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.ts_4;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Auto Message", category=bzw.OTHER, desc="Sends configurable messages for kills, deaths and timer spam")
public class tta
extends bnq {
    private static final String jha_4 = "type your spammer message here";
    private final badh_2 zah_3 = new badh_2(this, "On Kill").bts(true);
    private final ts_4 jzs = new ts_4(this, "Kill Message").tshgh("%player% d".concat("eleted"));
    private final badh_2 shah = new badh_2(this, "On Death").bts(false);
    private final ts_4 hlf = new ts_4(this, "Deat".concat("h Message")).tshgh("nice try %".concat("player%"));
    private final badh_2 thal = new badh_2(this, "Spammer").bts(false);
    private final tay zhw_2 = new tay((hy)this, "Spam Delay", this::ssa_4).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(0xF81FBFC0 ^ 0xBA6FBFC0)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x36C0E77A ^ 0xD6C0E77D, 27))).ssd_5(Float.intBitsToFloat(0x1F5E5048 ^ 0x5E5E5048));
    private final badh_2 sha_6 = new badh_2(this, "Anti Spam").bts(true);
    private final Map thtz = new ConcurrentHashMap();
    private final Random zsh = new Random();
    private long thdz;
    private long jah_3;
    private final bql<bthy> szd_4 = this::khdhr;
    private final bql<bghq> sbz = this::khza_2;
    private final bql<btt> khhm = this::jshr;
    private static final int jsw_2 = -2005903156;
    private static final int bhd_2 = -1429375589;
    private static final int rah_2 = -1078423020;
    private static final int jsj_2 = 121858951;
    private static final int rdc9fepyqlglt = -747959827;
    private static final int cjcbt6qtitaww = -1406193754;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int y63td29dqxe9;

    @Override
    public void nc() {
        int n = -231698682;
        n = Integer.rotateLeft(n * -2124658309, 25) ^ 0x4E49041;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
        int n2 = n ^ 0xE06D4DB0;
        if ((n2 ^ n) != -529707600) {
            int cfr_ignored_0 = (0x125DC2B6 ^ n) + -766687369;
        }
        this.thtz.clear();
        this.thdz = 0L;
        this.jah_3 = 0L;
    }

    private void zyt_4() {
        int n = -740038174;
        n = Integer.rotateLeft(n * -992660375, 13) ^ 0x28193BB9;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x1721592E;
        if ((n2 ^ n) != 388061486) {
            int cfr_ignored_0 = (0xC4C2B0CC ^ n) - 1641155;
        }
        long l = System.currentTimeMillis();
        Iterator iterator = this.thtz.entrySet().iterator();
        while (iterator.hasNext()) {
            if (l - (Long)iterator.next().getValue() <= (0x2A64B8FA24AD4078L ^ 0x2A64B8FA24AD6E98L)) continue;
            iterator.remove();
        }
    }

    private void aaz(String string, String string2) {
        int n = 1862931221;
        n = Integer.rotateLeft(n * -1278295747, 7) ^ 0x8B5179DA;
        String string3 = string;
        n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
        String string4 = string2;
        n = (string4 != null ? System.identityHashCode(string4) : 0) ^ n;
        int n2 = n ^ 0xCE1D7D11;
        if ((n2 ^ n) != -836928239) {
            int cfr_ignored_0 = (0xA1176E04 ^ n) - 1240667750;
        }
        if (tta.mc.field_1724 == null || mc.method_1562() == null) {
            return;
        }
        long l = tta.afz();
        if (l - this.thdz < (0xEA03A2A54953505DL ^ 0xEA03A2A5495353D9L)) {
            return;
        }
        String string5 = string2 == null ? "" : string2;
        Object object = string.replace("%player%", string5).trim();
        if (tta.khlh_2((String)object)) {
            return;
        }
        if (this.sha_6.shzl()) {
            object = (String)object + " [" + tta.skhth_2(this) + "]";
        }
        tta.mc.field_1724.field_3944.method_45729((String)object);
        this.thdz = l;
    }

    private String zrh() {
        int n = -230514608;
        n = Integer.rotateLeft(n * 264935675, 23) ^ 0x4CD62734;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 9);
        int n2 = n ^ 0x76B5C227;
        if ((n2 ^ n) != 1991623207) {
            int cfr_ignored_0 = (0x84F76277 ^ n) - -178462966;
        }
        String string = "abcdefghijklmnopqrst".concat("uvwxyz0123456789");
        StringBuilder stringBuilder = new StringBuilder(4);
        for (int i = 0; i < 4; ++i) {
            stringBuilder.append(tta.zzl_4("abcdefghijk", "lmnopqrstuvwxy").concat("z0123456789").charAt(this.zsh.nextInt(tta.sma_2("霈뿪웉㒊孧扄褪퀍࿒嚷綐", Integer.rotateLeft(0x1AA7B472 ^ 0x914A06D0, 27), tta.rts_4(65016294) ^ 0x1F4FF6DA, Integer.rotateLeft(0xA710F29F ^ 0x3FABE115, 25)).concat("nopqrstuv").concat("wxyz0123456789").length())));
        }
        return tta.zmth_2(stringBuilder);
    }

    private String rjdh() {
        int n = -1217706259;
        int n2 = (n = Integer.rotateLeft(n * -356311311, 4) ^ 0xB36F50BA) ^ 0xFBF18364;
        if ((n2 ^ n) != -68058268) {
            int cfr_ignored_0 = (0x4C9AC589 ^ n) + -1783440439;
        }
        Path path = this.ajz_2();
        tta.dsgh_4(this, path);
        try {
            String string = tta.jhd_4(path, StandardCharsets.UTF_8).replace("\r", " ").replace("\n", " ").trim();
            return tta.dnl_2(string) ? "type your spam".concat(tta.thb("㨱ዘ毭䃙馷콥␄細嗔ꋩ﯎킠⥌ٹ开", 0x43FD42B3 ^ 0x472BE78A, tta.syl_2(1285696287) ^ 0x677B1A44, 0xD5F1FB4D ^ 0xE1BB3842)) : string;
        }
        catch (IOException iOException) {
            return "type your spamm".concat("er message here");
        }
    }

    private void rqt(Path path) {
        try {
            try {
                int n = -1183152122;
                n = Integer.rotateLeft(n * -151410151, 4) ^ 0xFE81E680;
                Path path2 = path;
                n = (path2 != null ? System.identityHashCode(path2) : 0) ^ n;
                int n2 = n ^ 0x1A072109;
                if ((n2 ^ n) != 436674825) {
                    int cfr_ignored_0 = (0xA37DA90F ^ n) + -417813695;
                }
                if ((0x89 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            if (yf.dnkh()) {
                throw null;
            }
            tta.thdd_4(path.getParent(), new FileAttribute[0]);
            if (!Files.exists(path, new LinkOption[0])) {
                Files.writeString(path, (CharSequence)tta.thb("仺昖Ἵ㑎芟뮫僐ৱ⅁혭轌ꑻ嶖", tta.std_2(0x661912B8 ^ 0x1362F038, 6), 1378620594 + 675149733, -1406882243 - 2052857832).concat("mer message here"), StandardCharsets.UTF_8, new OpenOption[0]);
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private Path ajz_2() {
        block0: {
            int n = 1426631410;
            int n2 = (n = Integer.rotateLeft(n * 1136956301, 14) ^ 0x42F0702) ^ 0x9304F4DC;
            if ((n2 ^ n) == -1828391716) break block0;
            int cfr_ignored_0 = (0xC60C5E2E ^ n) - -1398127693;
        }
        return class_310.method_1551().field_1697.toPath().resolve(tta.jqj(tta.thb("焙姚⃸ட튶뵐葽", tta.jzgh(-670984590) ^ 0xD17AC0D0, Integer.rotateLeft(0x81646295 ^ 0xCC59B6C6, 3), 1719226365 + 366054460))).resolve("spammer.txt");
    }

    private void jshr(btt btt2) {
        long l;
        try {
            int n = 1234616834;
            n = Integer.rotateLeft(n * 33582851, 18) ^ 0x14ACD24F;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0xD7AE999A;
            if ((n2 ^ n) != -676423270) {
                int cfr_ignored_0 = (0x9E385B98 ^ n) - 1378723034;
            }
            if ((0x311 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        this.zyt_4();
        if (!this.thal.shzl() || tta.mc.field_1724 == null || tta.mc.field_1687 == null) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (l2 - this.jah_3 >= (l = (long)(this.zhw_2.thw_5() * Float.intBitsToFloat(-1183044867 + -1963076349)))) {
            this.aaz(this.rjdh(), tta.mc.field_1724.method_5477().getString());
            this.jah_3 = l2;
        }
    }

    private void khza_2(bghq bghq2) {
        try {
            int n = -1883714061;
            n = Integer.rotateLeft(n * -357980441, 5) ^ 0xEE672298;
            int n2 = n ^ 0xD5BC59C9;
            if ((n2 ^ n) != -709076535) {
                int cfr_ignored_0 = (0x5A04943A ^ n) + 1939858740;
            }
            if ((0x350 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (tta.mc.field_1724 == null) {
            return;
        }
        Object object = bghq2.sll();
        if (!(object instanceof class_1657)) {
            return;
        }
        class_1657 class_16572 = (class_1657)object;
        if (class_16572 == tta.mc.field_1724) {
            if (this.shah.shzl()) {
                object = "";
                class_1297 class_12972 = bghq2.rnk().method_5529();
                if (class_12972 instanceof class_1657) {
                    class_1657 class_16573 = (class_1657)class_12972;
                    object = class_16573.method_5477().getString();
                } else {
                    object = tta.mc.field_1724.method_5477().getString();
                }
                this.aaz(this.hlf.dysh(), (String)object);
            }
            return;
        }
        if (!this.zah_3.shzl()) {
            return;
        }
        object = (Long)this.thtz.get(class_16572.method_5667());
        if (object != null && System.currentTimeMillis() - (Long)object <= (0xAAEC46DA8542CD40L ^ 0xAAEC46DA8542E3A0L)) {
            this.aaz(this.jzs.dysh(), class_16572.method_5477().getString());
            this.thtz.remove(class_16572.method_5667());
        }
    }

    private void khdhr(bthy bthy2) {
        class_1657 class_16572;
        block5: {
            block4: {
                class_1297 class_12972;
                int n = bhr.tmq_2(-1572004665);
                n = System.identityHashCode(this) ^ n;
                bthy bthy3 = bthy2;
                n = Integer.rotateRight((bthy3 != null ? System.identityHashCode(bthy3) : 0) ^ n, 11);
                int n2 = n ^ 0xE5FF8AA2;
                if ((n2 ^ n) != -436237662) {
                    int cfr_ignored_0 = Integer.rotateLeft(0x47B29665 ^ n, 11) - -1291987594;
                    int cfr_ignored_1 = (int)(0x8500385827D4EB4FL ^ (long)n ^ 0x8DC0831A2DB8A7D1L);
                }
                if (!((class_12972 = bthy2.khtf()) instanceof class_1657)) break block4;
                class_16572 = (class_1657)class_12972;
                if (tta.mc.field_1724 != null && class_16572 != tta.mc.field_1724) break block5;
            }
            return;
        }
        this.thtz.put(class_16572.method_5667(), System.currentTimeMillis());
    }

    private boolean ssa_4() {
        int n = -1148904713;
        n = Integer.rotateLeft(n * 714187125, 8) ^ 0xABC22CC6;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x302FE7D5;
        if ((n2 ^ n) != 808445909) {
            int cfr_ignored_0 = (0x8BAAFD22 ^ n) + -58915621;
        }
        return !this.thal.shzl();
    }

    private static String thb(String string, int n, int n2, int n3) {
        int n4 = -2014430759;
        n4 = Integer.rotateLeft(n4 * 2054128385, 20) ^ 0xC6C4F8C;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = n ^ n4) ^ 0xFDA716A7;
        if ((n5 ^ n4) != -39381337) {
            int cfr_ignored_0 = (0x7A492F7E ^ n4) - -2122424663;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xA0F495 ^ n2 ^ i * -1804544409 ^ jsw_2, 17) ^ bhd_2));
        }
        return new String(cArray);
    }

    private static long afz() {
        block0: {
            int n = bhr.tmq_2(295714026);
            int n2 = n ^ 0x73EBDEAA;
            if ((n2 ^ n) == 1944837802) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x624BE240 ^ n, 15) + -343014149;
        }
        return System.currentTimeMillis();
    }

    private static String jghq(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bhr.tmq_2(-1398625710);
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 3)) ^ 0xACE14DBD;
            if ((n5 ^ n4) == -1394520643) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x43E7EF ^ n4, 3) - 211203372;
        }
        return tta.thb(string, n, n2, n3);
    }

    private static boolean khlh_2(String string) {
        block0: {
            int n = 134715122;
            n = Integer.rotateLeft(n * -332866599, 3) ^ 0x290EF5F;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x35D9EF6A;
            if ((n2 ^ n) == 903475050) break block0;
            int cfr_ignored_0 = (0x3DDE7998 ^ n) - 703578036;
        }
        return string.isEmpty();
    }

    private static String skhth_2(tta tta2) {
        block0: {
            int n = -349513478;
            n = Integer.rotateLeft(n * -859762971, 4) ^ 0xC22D2FB6;
            tta tta3 = tta2;
            n = Integer.rotateLeft((tta3 != null ? System.identityHashCode(tta3) : 0) ^ n, 15);
            int n2 = n ^ 0x52D068D9;
            if ((n2 ^ n) == 1389390041) break block0;
            int cfr_ignored_0 = (0xB9FAB023 ^ n) - -591617963;
        }
        return tta2.zrh();
    }

    private static String bshh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1159454320;
            n4 = Integer.rotateLeft(n4 * 2102541467, 7) ^ 0xF431D551;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 18);
            int n5 = (n4 = n3 ^ n4) ^ 0xC9DAAA75;
            if ((n5 ^ n4) == -908416395) break block0;
            int cfr_ignored_0 = (0x8CC17405 ^ n4) - 1406384738;
        }
        return tta.thb(string, n, n2, n3);
    }

    private static String dthgh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bhr.tmq_2(661340117);
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 20)) ^ 0xE5272700;
            if ((n5 ^ n4) == -450418944) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xC24C18D5 ^ n4, 11) - -1953193722) * -1035200299;
            int cfr_ignored_1 = (int)(0xFEB6E827D4EB4FL ^ (long)n4 ^ 0x90A0831A2DB9AC2CL);
        }
        return tta.thb(string, n, n2, n3);
    }

    private static String zzl_4(String string, String string2) {
        block0: {
            int n = 938498233;
            int n2 = (n = Integer.rotateLeft(n * 218571311, 12) ^ 0xBDF7ADE3) ^ 0x6DD012BA;
            if ((n2 ^ n) == 1842352826) break block0;
            int cfr_ignored_0 = (0x5A204A03 ^ n) - -1183124050;
        }
        return string.concat(string2);
    }

    private static int rts_4(int n) {
        block0: {
            int n2 = bhr.tmq_2(-545405150);
            int n3 = n2 ^ 0x27E1759B;
            if ((n3 ^ n2) == 669087131) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xF89CB2B9 ^ n2, 18) + 525812642) * -123948359;
            int cfr_ignored_1 = (int)(0x3A2E1C8427D4EB4FL ^ (long)n2 ^ 0xC478831A2DB9D98DL);
        }
        return Integer.reverse(n);
    }

    private static String sma_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bhr.tmq_2(-1143124020);
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 22)) ^ 0x83E25612;
            if ((n5 ^ n4) == -2082318830) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x383F19DE ^ n4, 10) - -738082531) * 943659487;
        }
        return tta.thb(string, n, n2, n3);
    }

    private static String shash_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -815113568;
            n4 = Integer.rotateLeft(n4 * -637588307, 23) ^ 0x8EF15B24;
            n4 = Integer.rotateLeft(n2 ^ n4, 7);
            int n5 = (n4 = n3 ^ n4) ^ 0x3052EBBA;
            if ((n5 ^ n4) == 810740666) break block0;
            int cfr_ignored_0 = (0xFF38B11A ^ n4) - 1900824852;
        }
        return tta.thb(string, n, n2, n3);
    }

    private static String zmth_2(StringBuilder stringBuilder) {
        block0: {
            int n = -456915606;
            int n2 = (n = Integer.rotateLeft(n * -326659823, 16) ^ 0x15AE4AE0) ^ 0x4D37BB36;
            if ((n2 ^ n) == 1295498038) break block0;
            int cfr_ignored_0 = (0xA9F3BE5C ^ n) + -2041440269;
        }
        return stringBuilder.toString();
    }

    private static void dsgh_4(tta tta2, Path path) {
        int n = 2064580747;
        n = Integer.rotateLeft(n * 1604470997, 16) ^ 0x10083493;
        tta tta3 = tta2;
        n = Integer.rotateLeft((tta3 != null ? System.identityHashCode(tta3) : 0) ^ n, 8);
        Path path2 = path;
        n = (path2 != null ? System.identityHashCode(path2) : 0) ^ n;
        int n2 = n ^ 0xC5619FA2;
        if ((n2 ^ n) != -983457886) {
            int cfr_ignored_0 = (0xBE6E9F29 ^ n) - 419994299;
        }
        tta2.rqt(path);
    }

    private static String jhd_4(Path path, Charset charset) {
        block0: {
            int n = -1046774015;
            int n2 = (n = Integer.rotateLeft(n * -1499934867, 14) ^ 0x4F08CABC) ^ 0x229B61D1;
            if ((n2 ^ n) == 580608465) break block0;
            int cfr_ignored_0 = (0xE3001ED0 ^ n) - -26293971;
        }
        return Files.readString(path, charset);
    }

    private static String shdhf(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1993903291;
            n4 = Integer.rotateLeft(n4 * -1430494381, 24) ^ 0x6AAC9174;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 12);
            int n5 = (n4 = n2 ^ n4) ^ 0xCD0FA217;
            if ((n5 ^ n4) == -854613481) break block0;
            int cfr_ignored_0 = (0x4428D152 ^ n4) + -376477914;
        }
        return tta.thb(string, n, n2, n3);
    }

    private static boolean dnl_2(String string) {
        block0: {
            int n = -1171172304;
            int n2 = (n = Integer.rotateLeft(n * 701905861, 7) ^ 0x738BEA1C) ^ 0xCC2CC44C;
            if ((n2 ^ n) == -869481396) break block0;
            int cfr_ignored_0 = (0x761D907C ^ n) + -570755873;
        }
        return string.isEmpty();
    }

    private static int syl_2(int n) {
        block0: {
            int n2 = bhr.tmq_2(-1467133140);
            int n3 = n2 ^ 0x6DC6BE10;
            if ((n3 ^ n2) == 1841741328) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xC54BED3C ^ n2, 11) - -393258625) * -984879811;
        }
        return Integer.reverse(n);
    }

    private static Path thdd_4(Path path, FileAttribute[] fileAttributeArray) {
        block0: {
            int n = bhr.tmq_2(1436905517);
            Path path2 = path;
            n = (path2 != null ? System.identityHashCode(path2) : 0) ^ n;
            n = (fileAttributeArray != null ? System.identityHashCode(fileAttributeArray) : 0) ^ n;
            int n2 = n ^ 0xE4339C26;
            if ((n2 ^ n) == -466379738) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xB196EC0B ^ n, 9) + -2052836208;
        }
        return Files.createDirectories(path, fileAttributeArray);
    }

    private static int std_2(int n, int n2) {
        block0: {
            int n3 = 742767915;
            n3 = Integer.rotateLeft(n3 * 1638313207, 16) ^ 0xEF628652;
            int n4 = (n3 = n ^ n3) ^ 0x84C135C0;
            if ((n4 ^ n3) == -2067712576) break block0;
            int cfr_ignored_0 = (0xA88488EB ^ n3) + -1335206321;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static int jzgh(int n) {
        block0: {
            int n2 = bhr.tmq_2(-447637227);
            int n3 = n2 ^ 0x5CF0E0EC;
            if ((n3 ^ n2) == 1559290092) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xB9A179F9 ^ n2, 10) + 2129355874) * -1180599815;
            int cfr_ignored_1 = (int)(0x7B13D7C427D4EB4FL ^ (long)n2 ^ 0x52F8831A2DB95BF6L);
        }
        return Integer.reverse(n);
    }

    private static String jqj(String string) {
        block0: {
            int n = -561728519;
            int n2 = (n = Integer.rotateLeft(n * 77177911, 25) ^ 0x3E36919F) ^ 0x84746122;
            if ((n2 ^ n) == -2072747742) break block0;
            int cfr_ignored_0 = (0x5AF0D2DB ^ n) + -346533;
        }
        return string.toLowerCase();
    }

    private static String sdgh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1899536785;
            n4 = Integer.rotateLeft(n4 * -1403769075, 27) ^ 0xBE5AB4CA;
            n4 = n ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0xE1726FFB;
            if ((n5 ^ n4) == -512593925) break block0;
            int cfr_ignored_0 = (0x6FB53194 ^ n4) - 1330878094;
        }
        return tta.thb(string, n, n2, n3);
    }

    private static String[] bkhb(String string) {
        int n = 1776882631;
        n = Integer.rotateLeft(n * -662077197, 26) ^ 0xD7E56D8E;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xA1DA4212;
        if ((n2 ^ n) != -1579531758) {
            int cfr_ignored_0 = (0xC83351D5 ^ n) - 1501274248;
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

    private static CallSite dkhz_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 574959060;
            n3 = Integer.rotateLeft(n3 * -661479277, 24) ^ 0xFEDD27A4;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 14);
            Class clazz2 = clazz;
            n3 = Integer.rotateLeft((clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n3, 10);
            int n4 = n3 ^ 0xD1331946;
            if ((n4 ^ n3) != -785180346) {
                int cfr_ignored_0 = (0xF3763492 ^ n3) - 2108278536;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ rah_2 ^ string.hashCode() ^ n2 + jsj_2 + i * -1133538273) + rah_2) ^ jsj_2));
            }
            String[] stringArray = tta.bkhb(new String(cArray));
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

    private static String[] eg3jvyevzgfr4(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite zhdesu72ei(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ rdc9fepyqlglt ^ string.hashCode()) + (n2 + cjcbt6qtitaww) + i ^ rdc9fepyqlglt, 5) + cjcbt6qtitaww);
            }
            String[] stringArray = tta.eg3jvyevzgfr4(new String(cArray));
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

