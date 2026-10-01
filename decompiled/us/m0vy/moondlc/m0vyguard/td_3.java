/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.minecraft.class_1657
 *  net.minecraft.class_1713
 *  net.minecraft.class_1723
 *  net.minecraft.class_1735
 *  net.minecraft.class_1799
 *  net.minecraft.class_2561
 *  net.minecraft.class_481
 *  net.minecraft.class_490
 *  net.minecraft.class_5250
 *  net.minecraft.class_636
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1723;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_481;
import net.minecraft.class_490;
import net.minecraft.class_5250;
import net.minecraft.class_636;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bdh_3;
import us.m0vy.moondlc.m0vyguard.bdhb;
import us.m0vy.moondlc.m0vyguard.brz;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzh_4;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.ty;
import us.m0vy.moondlc.m0vyguard.h_2;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fw_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Inventory Sorter", category=bzw.OTHER, desc="Restores your inventory layout from a saved layout")
public class td_3
extends bnq {
    private static final Gson thdth_2;
    private final Path drd_2 = Path.of(bdhb.hya_2, "inventory_sorter_layout.json");
    private final bdh_3 thsdh = new bdh_3(this, "Save Layout Key");
    private final bdh_3 tzy = new bdh_3(this, "Load L".concat("ayout Key"));
    private final fw_2 thshz_2 = new fw_2(this, "Save Layout").ghbt(this::dzgh_2);
    private final fw_2 ttl = new fw_2(this, "Load Layout").ghbt(this::jwd_2);
    private final khd qw = new khd(this, "Speed Mode");
    private final fy thaj_2 = new fy(this.qw, "Instant").rhh_3();
    private final fy zzkh = new fy(this.qw, "Delayed");
    private final tay dhdh_2 = new tay((hy)this, "Instant Actions", this::htm).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(-619951604) ^ 0x72A230DB)).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(-1703156727 - 1477174281));
    private final tay zdb_2 = new tay((hy)this, "Actions ".concat("Per Tick"), this::dhghk).shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.reverse(-1422136943) ^ 0xC8B7DCD5)).rkh_3(1.0f).ssd_5(1.0f);
    private final tay rkl = new tay((hy)this, "Delay Ticks", this::shad_4).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(897600427 + 203404373)).rkh_3(1.0f).ssd_5(2.0f);
    private final khd jrh_2 = new khd(this, "Extra Items");
    private final fy thsk_2 = new fy(this.jrh_2, "Keep").rhh_3();
    private final fy skd = new fy(this.jrh_2, "Move To ".concat("Empty"));
    private final fy shza_2 = new fy(this.jrh_2, "Drop");
    private final badh_2 zfr = new badh_2(this, "Restore Empty Slots").bts(true);
    private final badh_2 sthdh = new badh_2(this, "Incl".concat("ude Armor")).bts(true);
    private final badh_2 dhdth = new badh_2(this, "Include Offhand").bts(true);
    private final badh_2 dhzsh = new badh_2(this, "Exact Item Data").bts(false);
    private final badh_2 thhh = new badh_2(this, "Allow Invento".concat("ry Screen")).bts(true);
    private final badh_2 zst = new badh_2(this, "Stop On Container").bts(true);
    private final Map sshb = new LinkedHashMap();
    private boolean dhrl;
    private boolean ztj;
    private boolean ghl;
    private int tkhw;
    private int sdhf;
    private final bql<btt> ddgh = this::bygh;
    private static final int sshk = -1475863182;
    private static final int dhthb = -1262665887;
    private static final int bqt_2 = 86239633;
    private static final int shghr = -208988495;
    private static final int wbcx27nslr = 1405148468;
    private static final int xz84rtni = -475557972;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int h9rinmc0x8bk;

    public td_3() {
        this.dhf_2(false);
    }

    @Override
    public void nc() {
        int n = -972861791;
        int n2 = (n = Integer.rotateLeft(n * -1719361789, 18) ^ 0x2B0DE3F1) ^ 0xE0534AE6;
        if ((n2 ^ n) != -531412250) {
            int cfr_ignored_0 = (0x26500447 ^ n) - -1998056739;
        }
        this.ghl = false;
        this.tkhw = 0;
        this.sdhf = 0;
    }

    private void dzgh_2() {
        int n = -221895957;
        int n2 = (n = Integer.rotateLeft(n * 995589133, 27) ^ 0x73F7BCBC) ^ 0xA516AB6F;
        if ((n2 ^ n) != -1525240977) {
            int cfr_ignored_0 = (0x57D08984 ^ n) - 202957742;
        }
        if (!this.adz_2(true)) {
            return;
        }
        this.sshb.clear();
        Iterator iterator = td_3.khfkh(this).iterator();
        while (iterator.hasNext()) {
            int n3 = td_3.raz_3((Integer)iterator.next());
            class_1799 class_17992 = this.trr(n3);
            ty ty2 = ty.thhr_2(n3, class_17992);
            this.sshb.put(n3, ty2);
        }
        td_3.twgh(this);
        td_3.tksh((class_2561)class_2561.method_43470((String)("Inventory layout saved: " + this.sshb.size() + " slots.")));
    }

    private void jwd_2() {
        try {
            int n = -681264781;
            n = Integer.rotateLeft(n * -46987111, 25) ^ 0x91095AE;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 27);
            int n2 = n ^ 0x961577DC;
            if ((n2 ^ n) != -1776977956) {
                int cfr_ignored_0 = (0x4171CEAF ^ n) + -1206092109;
            }
            if ((0x267 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (this.sshb.isEmpty()) {
            this.dhf_2(true);
        }
        if (this.sshb.isEmpty()) {
            td_3.dtdh_2((class_2561)td_3.dakh_3("No saved inventory layout."));
            return;
        }
        if (!this.adz_2(true)) {
            return;
        }
        this.ghl = true;
        this.tkhw = 0;
        this.sdhf = 0;
        bzh_4.ttht_3((class_2561)class_2561.method_43470((String)"Inventory resto".concat(td_3.shts_2("埗ね食慑짥別㫙荪殨峉", 0xC251AAA ^ 0x95038D3, Integer.reverse(897158385) ^ 0x9FE39122, td_3.skhq_2(0xDD02BA32 ^ 0xEAAEB1E1, 14)))));
    }

    private void dndh() {
        if (!this.adz_2(false)) {
            if (this.zst.shzl()) {
                this.ghl = false;
                bzh_4.rkt((class_2561)class_2561.method_43470((String)"Inventory restore stopped: wrong screen/container."));
            }
            return;
        }
        if (this.thaj_2.shghkh()) {
            int n = (int)this.dhdh_2.hkj();
            for (int i = 0; i < n; ++i) {
                if (this.dghh_2()) continue;
                this.dnm_2();
                return;
            }
            return;
        }
        if (this.tkhw > 0) {
            --this.tkhw;
            return;
        }
        int n = (int)this.zdb_2.hkj();
        for (int i = 0; i < n; ++i) {
            if (this.dghh_2()) continue;
            this.dnm_2();
            return;
        }
        this.tkhw = (int)this.rkl.hkj();
    }

    private boolean dghh_2() {
        ty ty2;
        int n;
        int n2 = h_2.shjs_2(1491913708);
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 10);
        int n3 = n2 ^ 0x30786A62;
        if ((n3 ^ n2) != 813197922) {
            int cfr_ignored_0 = Integer.rotateRight(0x6894A18E ^ n2, 16) - -1369624723;
        }
        if (this.sdhf++ > 791263677 + -791263277) {
            this.ghl = false;
            bzh_4.rkt((class_2561)class_2561.method_43470((String)"Inventory restore stopped: safety limit."));
            int n4 = 0;
            if (yf.tdhth_2() == 0) {
                n4 = n4 ^ 0x7FD2;
            }
            return n4 != 0;
        }
        Iterator iterator = td_3.khbd(this).iterator();
        while (iterator.hasNext()) {
            n = (Integer)iterator.next();
            ty2 = (ty)this.sshb.get(n);
            if (ty2 == null) continue;
            class_1799 class_17992 = this.trr(n);
            if (td_3.dny(ty2)) {
                if (!this.zfr.shzl() || class_17992.method_7960() || this.adq_2(class_17992) || !this.ddhth_2(n)) continue;
                return true;
            }
            if (ty2.arz_2(class_17992, this.dhzsh.shzl())) continue;
            int n5 = this.zy(ty2, n);
            if (n5 != -1) {
                this.thhz_3(n5, n);
                return true;
            }
            if (class_17992.method_7960() || td_3.dhs_9(this, class_17992) || !this.ddhth_2(n)) continue;
            return true;
        }
        iterator = this.tghb_2().iterator();
        while (iterator.hasNext()) {
            n = (Integer)iterator.next();
            ty2 = td_3.dthz_2(this, n);
            if (ty2.method_7960() || this.adq_2((class_1799)ty2) || !td_3.ssth(this, n)) continue;
            return true;
        }
        return false;
    }

    private void dnm_2() {
        try {
            int n = 881869717;
            n = Integer.rotateLeft(n * 865385811, 14) ^ 0xDB35213A;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xE94C8F6A;
            if ((n2 ^ n) != -380858518) {
                int cfr_ignored_0 = (0xDDDCCCFF ^ n) + 918897568;
            }
            if ((0x321 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        this.ghl = false;
        this.tkhw = 0;
        this.sdhf = 0;
        bzh_4.ttht_3((class_2561)class_2561.method_43470((String)"Inventory restore finished."));
    }

    private int zy(ty ty2, int n) {
        try {
            int n2 = 1762374266;
            n2 = Integer.rotateLeft(n2 * 332346063, 5) ^ 0x2CBF7903;
            n2 = System.identityHashCode(this) ^ n2;
            ty ty3 = ty2;
            n2 = Integer.rotateLeft((ty3 != null ? System.identityHashCode(ty3) : 0) ^ n2, 23);
            int n3 = n2 ^ 0x374A67A1;
            if ((n3 ^ n2) != 927623073) {
                int cfr_ignored_0 = (0x5E41D5DB ^ n2) - -1198085797;
            }
            if ((0x18A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        Iterator iterator = this.tghb_2().iterator();
        while (iterator.hasNext()) {
            class_1799 class_17992;
            int n4 = (Integer)iterator.next();
            if (n4 == n || (class_17992 = this.trr(n4)).method_7960() || this.zrk(n4) || !td_3.shshm(ty2, class_17992, this.dhzsh.shzl())) continue;
            return n4;
        }
        return -1;
    }

    private boolean zrk(int n) {
        ty ty2;
        int n2 = 526554302;
        n2 = Integer.rotateLeft(n2 * 709248427, 28) ^ 0x75F386A7;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 27);
        int n3 = n2 ^ 0xD0092109;
        if ((n3 ^ n2) != -804708087) {
            int cfr_ignored_0 = (0xCF6BB5B7 ^ n2) + -700923750;
        }
        if ((ty2 = (ty)this.sshb.get(n)) == null) {
            return false;
        }
        class_1799 class_17992 = this.trr(n);
        if (ty2.taq_4()) {
            return class_17992.method_7960();
        }
        return ty2.arz_2(class_17992, this.dhzsh.shzl());
    }

    private boolean adq_2(class_1799 class_17992) {
        int n = -1361288036;
        n = Integer.rotateLeft(n * 2082205185, 17) ^ 0xBA836565;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x5E2F716E;
        if ((n2 ^ n) != 1580167534) {
            int cfr_ignored_0 = (0xF0F315F2 ^ n) + -1635492211;
        }
        if (yf.dnkh()) {
            throw null;
        }
        for (ty ty2 : this.sshb.values()) {
            if (ty2.taq_4() || !td_3.khadh(ty2, class_17992, td_3.dds_6(this.dhzsh))) continue;
            return true;
        }
        return false;
    }

    private boolean ddhth_2(int n) {
        int n2;
        try {
            int n3 = 1751035481;
            n3 = Integer.rotateLeft(n3 * -104918877, 4) ^ 0x3EAD6C6E;
            n3 = System.identityHashCode(this) ^ n3;
            int n4 = n3 ^ 0xB4F552DF;
            if ((n4 ^ n3) != -1258990881) {
                int cfr_ignored_0 = (0xDCABFC86 ^ n3) - 1743496885;
            }
            if ((0x28A & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (this.thsk_2.shghkh()) {
            return false;
        }
        if (td_3.thqh(this.shza_2)) {
            this.shhdh_2(n);
            return true;
        }
        if (this.skd.shghkh() && (n2 = this.dhdj(n)) != -1) {
            this.thhz_3(n, n2);
            return true;
        }
        return false;
    }

    private int dhdj(int n) {
        int n2 = 750929428;
        int n3 = (n2 = Integer.rotateLeft(n2 * 696695383, 4) ^ 0xFF1E4077) ^ 0x46F934B0;
        if ((n3 ^ n2) != 1190737072) {
            int cfr_ignored_0 = (0x6A3B72A4 ^ n2) - -1746106021;
        }
        Iterator iterator = this.tghb_2().iterator();
        while (iterator.hasNext()) {
            ty ty2;
            int n4 = (Integer)iterator.next();
            if (n4 == n || (ty2 = (ty)this.sshb.get(td_3.ghdkh(n4))) == null || !ty2.taq_4() || !this.trr(n4).method_7960()) continue;
            return n4;
        }
        return -1;
    }

    /*
     * Unable to fully structure code
     */
    private void thhz_3(int var1_1, int var2_2) {
        var3_3 = 0;
        var6_4 = 0;
        var4_5 = -1156319988;
        var4_5 = Integer.rotateLeft(var4_5 * -1812963817, 16) ^ 657788897;
        var4_5 = System.identityHashCode(this) ^ var4_5;
        var4_5 = Integer.rotateRight(var1_1 ^ var4_5, 2);
        var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124) ^ -1519594637 ^ -1519594637;
        block40: while (true) {
            if ((var6_4 = Integer.reverse(var5_6) ^ var4_5 ^ -16830124) == 1133761378) ** GOTO lbl160
            if (var6_4 == -764548701) ** GOTO lbl-1000
            if (var6_4 != -723851358) {
                switch (var6_4) {
                    case -245656249: {
                        Integer.rotateLeft(-914655187 ^ var4_5, 12) - 1783704750;
                        (int)(849445369612135247L ^ (long)var4_5 ^ 5859327263668550210L);
                        return;
                    }
                    case 1729978700: {
                        Integer.rotateLeft(-120218772 ^ var4_5, 18) - 641429839;
                        return;
                    }
                    case 247288499: {
                        (Integer.rotateRight(1603206239 ^ var4_5, 14) - -1766969668) * 1603206239;
                        return;
                    }
                    case -530670407: {
                        (Integer.rotateRight(254008411 ^ var4_5, 4) + -642429376) * 254008411;
                        var3_3 = td_3.mc.field_1724.field_7512.field_7763;
                        td_3.mc.field_1761.method_2906(var3_3, var1_1, 0, class_1713.field_7790, (class_1657)td_3.mc.field_1724);
                        td_3.mc.field_1761.method_2906(var3_3, var2_2, 0, class_1713.field_7790, (class_1657)td_3.mc.field_1724);
                        td_3.mc.field_1761.method_2906(var3_3, var1_1, 0, class_1713.field_7790, (class_1657)td_3.mc.field_1724);
                        return;
                    }
                    case -862047096: {
                        Integer.rotateLeft(-1405319007 ^ var4_5, 8) + -541971782;
                        (int)(7966347242990005071L ^ (long)var4_5 ^ -5744197176251551539L);
                        if (td_3.mc.field_1724 == null) {
                            (int)(8022093039795701011L ^ (long)var4_5 ^ -7256674609250864263L);
                            var5_6 = (int)((long)Integer.reverse(var4_5 ^ -245656249 ^ -16830124) ^ 7914251195718576128L ^ 7914251195718576128L);
                            var6_4 -= 2;
                            continue block40;
                        }
                        var5_6 = Integer.reverse(var4_5 ^ -572898716 ^ -16830124);
                        Integer.rotateRight(-1339904665 ^ var4_5, 9) - 1485872820;
                        var5_6 = Integer.reverse(var4_5 ^ -2000945053 ^ -16830124);
                        var6_4 += 5;
                        continue block40;
                    }
                    case -1380587313: {
                        Integer.rotateRight(784204874 ^ var4_5, 8) + -1386208207;
                        if (var1_1 == var2_2) {
                            try {
                                var6_4 += 2;
                                var5_6 = Integer.reverse(var4_5 ^ 247288499 ^ -16830124) + 1013763077 - 1013763077;
                            }
                            catch (IllegalArgumentException v0) {
                                var5_6 = (int)((long)Integer.reverse(var4_5 ^ 247288499 ^ -16830124) ^ 7244760729534174607L ^ 7244760729534174607L);
                            }
                            continue block40;
                        }
                        try {
                            var6_4 += 2;
                            if ((-2353145419600421491L ^ (long)var4_5 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var5_6 = (int)((long)Integer.reverse(var4_5 ^ -530670407 ^ -16830124) ^ 7525201334756607770L ^ 7525201334756607770L);
                        }
                        catch (ArithmeticException v1) {
                            var5_6 = Integer.reverse(Integer.reverse(Integer.reverse(var4_5 ^ -530670407 ^ -16830124)));
                        }
                        continue block40;
                    }
                    case -2000945053: {
                        Integer.rotateRight(-225024605 ^ var4_5, 17) + 1687416312;
                        if (td_3.mc.field_1761 == null) {
                            try {
                                var6_4 -= 2;
                                var5_6 = (int)((long)Integer.reverse(var4_5 ^ 1729978700 ^ -16830124) ^ -3437636166324942383L ^ -3437636166324942383L);
                            }
                            catch (NoSuchElementException v2) {
                                var5_6 = Integer.reverse(var4_5 ^ 1729978700 ^ -16830124) ^ -12138812 ^ -12138812;
                            }
                            ++var6_4;
                            continue block40;
                        }
                        try {
                            var5_6 = Integer.reverse(var4_5 ^ -1380587313 ^ -16830124);
                        }
                        catch (NoSuchElementException v3) {
                            var5_6 = (int)((long)Integer.reverse(var4_5 ^ -1380587313 ^ -16830124) ^ 6588787197057602655L ^ 6588787197057602655L);
                        }
                        var6_4 += 2;
                        continue block40;
                    }
                    case -692491056: {
                        (Integer.rotateLeft(-632488364 ^ var4_5, 14) - 1940941671) * -632488363;
                        try {
                            var6_4 += 3;
                            if ((-5045741424263013485L ^ (long)var4_5 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var5_6 = (int)((long)Integer.reverse(var4_5 ^ -862047096 ^ -16830124) ^ 4064961984897664620L ^ 4064961984897664620L);
                        }
                        catch (ArithmeticException v4) {
                            var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124) ^ -1682286710 ^ -1682286710;
                        }
                        continue block40;
                    }
                    case 827721744: {
                        (Integer.rotateRight(253621467 ^ var4_5, 4) + -654424640) * 253621467;
                        var5_6 = Integer.reverse(var4_5 ^ 150760933 ^ -16830124);
                        (Integer.rotateRight(-333580673 ^ var4_5, 16) - -1677821796) * -333580673;
                        var5_6 = Integer.reverse(Integer.reverse(Integer.reverse(var4_5 ^ 1383640101 ^ -16830124)));
                        (Integer.rotateLeft(-1664603183 ^ var4_5, 6) + 10153354) * -1664603183;
                        (int)(6807901036050967375L ^ (long)var4_5 ^ -673143995832397532L);
                        var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124);
                        var6_4 += 2;
                        continue block40;
                    }
                }
            }
            ** GOTO lbl146
lbl-1000:
            // 1 sources

            {
                Integer.rotateRight(-773249685 ^ var4_5, 13) + 1872308016;
                var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124) + 1719691894 - 1719691894;
                continue block40;
                case -487087928: {
                    Integer.rotateRight(-1455260025 ^ var4_5, 8) - -2090143340;
                    var5_6 = Integer.reverse(Integer.reverse(Integer.reverse(var4_5 ^ -648933997 ^ -16830124)));
                    (Integer.rotateRight(-816364417 ^ var4_5, 12) - 535751324) * -816364417;
                    try {
                        var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124) + -831560822 - -831560822;
                    }
                    catch (IllegalStateException v5) {
                        var5_6 = Integer.reverse(Integer.reverse(Integer.reverse(var4_5 ^ -862047096 ^ -16830124)));
                    }
                    var6_4 += 4;
                    continue block40;
                }
                case 665999904: {
                    Integer.rotateLeft(-318798908 ^ var4_5, 16) - -1219587081;
                    var5_6 = Integer.reverse(Integer.reverse(Integer.reverse(var4_5 ^ -628171297 ^ -16830124)));
                    (Integer.rotateRight(267455255 ^ var4_5, 4) - -225577212) * 267455255;
                    (int)(-7679858049852827438L ^ (long)var4_5 ^ -5843730021343918330L);
                    var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124) + 751939544 - 751939544;
                    var6_4 -= 2;
                    continue block40;
                }
lbl146:
                // 1 sources

                Integer.rotateLeft(424826509 ^ var4_5, 6) - 357964366;
                (int)(-2602807149153948849L ^ (long)var4_5 ^ 869338876541934096L);
                try {
                    var6_4 -= 5;
                    if ((6719566355676127873L ^ (long)var4_5 | 1L) == 0L) {
                        throw new UnsupportedOperationException();
                    }
                    var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124) + -1363370116 - -1363370116;
                }
                catch (UnsupportedOperationException v6) {
                    var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124);
                }
                var6_4 += 2;
                continue block40;
lbl160:
                // 1 sources

                Integer.rotateLeft(598664545 ^ var4_5, 7) + 1451976186;
                (int)(-2225821256650527921L ^ (long)var4_5 ^ 7766601705859870697L);
                try {
                    --var6_4;
                    var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124) ^ -856999439 ^ -856999439;
                }
                catch (UnsupportedOperationException v7) {
                    var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124);
                }
                --var6_4;
                continue block40;
                case -1004307796: {
                    Integer.rotateLeft(31560300 ^ var4_5, 3) - 1051613775;
                    var5_6 = (int)((long)Integer.reverse(var4_5 ^ -6310334 ^ -16830124) ^ 6606635493692264199L ^ 6606635493692264199L);
                    (Integer.rotateLeft(998460401 ^ var4_5, 10) + 960745834) * 998460401;
                    (int)(-490358219402319025L ^ (long)var4_5 ^ 3956556421104426930L);
                    var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124);
                    var6_4 -= 5;
                    continue block40;
                }
                case 242131225: {
                    Integer.rotateRight(-1026121849 ^ var4_5, 11) - -1671761772;
                    var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124) ^ 428715921 ^ 428715921;
                    var6_4 -= 3;
                    continue block40;
                }
                case 515886236: {
                    (Integer.rotateRight(486932183 ^ var4_5, 6) - -2011727036) * 486932183;
                    var5_6 = (int)((long)Integer.reverse(var4_5 ^ -1368950134 ^ -16830124) ^ -918077502644678318L ^ -918077502644678318L);
                    Integer.rotateRight(-753962514 ^ var4_5, 13) - -1824756979;
                    var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124) ^ 1442519589 ^ 1442519589;
                    var6_4 += 4;
                    continue block40;
                }
                case -412389957: {
                    Integer.rotateLeft(-987395356 ^ var4_5, 11) - -471240489;
                    try {
                        --var6_4;
                        if ((-7675439639528038811L ^ (long)var4_5 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124);
                    }
                    catch (IllegalArgumentException v8) {
                        var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124) + -73638557 - -73638557;
                    }
                    continue block40;
                }
                case 716964277: {
                    (Integer.rotateRight(-580979173 ^ var4_5, 14) + -757240704) * -580979173;
                    try {
                        var6_4 += 4;
                        if ((5036162568870105765L ^ (long)var4_5 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124) + -306737361 - -306737361;
                    }
                    catch (NoSuchElementException v9) {
                        var5_6 = (int)((long)Integer.reverse(var4_5 ^ -862047096 ^ -16830124) ^ -231333685985592924L ^ -231333685985592924L);
                    }
                    var6_4 += 3;
                    continue block40;
                }
                case -1265430328: {
                    (Integer.rotateLeft(-47021412 ^ var4_5, 18) - -1384419297) * -47021411;
                    var5_6 = Integer.reverse(var4_5 ^ -723116859 ^ -16830124) + 1919318323 - 1919318323;
                    (Integer.rotateLeft(1243785209 ^ var4_5, 12) + -24119710) * 1243785209;
                    (int)(-8606368149818512561L ^ (long)var4_5 ^ -1227086749998990095L);
                    (int)(-104891010548743033L ^ (long)var4_5 ^ 5273095638008484039L);
                    var5_6 = (int)((long)Integer.reverse(var4_5 ^ -862047096 ^ -16830124) ^ -5064510751521578469L ^ -5064510751521578469L);
                    var6_4 += 2;
                    continue block40;
                }
                case 676014727: {
                    Integer.rotateLeft(1481517325 ^ var4_5, 14) - -1244358706;
                    (int)(-7278794256841118897L ^ (long)var4_5 ^ -932100974406232024L);
                    var5_6 = Integer.reverse(var4_5 ^ -1433113149 ^ -16830124) + -1434599420 - -1434599420;
                    (Integer.rotateLeft(1707652021 ^ var4_5, 15) - 1470849574) * 1707652021;
                    (int)(-6378753451595863217L ^ (long)var4_5 ^ -4152174707976117467L);
                    var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124) ^ -1541256777 ^ -1541256777;
                    ++var6_4;
                }
            }
            Integer.rotateLeft(-993787511 ^ var4_5, 11) + -669397294;
            (int)(465752799776664399L ^ (long)var4_5 ^ -6766514291664641732L);
            var5_6 = Integer.reverse(var4_5 ^ -862047096 ^ -16830124) + 1031443699 - 1031443699;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void shhdh_2(int var1_1) {
        var2_2 = 0;
        var5_3 = 0;
        var3_4 = -2106169404;
        var3_4 = Integer.rotateLeft(var3_4 * 1319408515, 23) ^ -1590639356;
        var3_4 = Integer.rotateRight(System.identityHashCode(this) ^ var3_4, 7);
        var3_4 = Integer.rotateLeft(var1_1 ^ var3_4, 29);
        var4_5 = 2116218427 + var3_4 + 1989546279 - 1989546279;
        while (true) {
            block36: {
                block41: {
                    block31: {
                        block34: {
                            block30: {
                                block29: {
                                    block40: {
                                        block33: {
                                            block37: {
                                                block38: {
                                                    block35: {
                                                        block28: {
                                                            block32: {
                                                                block39: {
                                                                    var5_3 = var4_5 - var3_4;
                                                                    switch (var5_3 & 7) {
                                                                        case 0: {
                                                                            if (var5_3 == 337957024) break block28;
                                                                            if (var5_3 == -1053389840) break block29;
                                                                            if (var5_3 != 1884406616) {
                                                                                ** break;
                                                                            }
                                                                            break block30;
                                                                        }
                                                                        case 2: {
                                                                            if (var5_3 != 890919810) {
                                                                                ** break;
                                                                            }
                                                                            break block31;
                                                                        }
                                                                        case 3: {
                                                                            if (var5_3 != 2116218427) {
                                                                                if (var5_3 == 861703315) break;
                                                                                (Integer.rotateLeft(1229566393 ^ var3_4, 12) + -464903006) * 1229566393;
                                                                                (int)(-8360053630818784433L ^ (long)var3_4 ^ -4433649684686783961L);
                                                                                ** break;
                                                                            }
                                                                            break block32;
                                                                        }
                                                                        case 5: {
                                                                            if (var5_3 == -426847035) break block33;
                                                                            if (var5_3 == -1004504755) break block34;
                                                                            Integer.rotateRight(112583915 ^ var3_4, 3) + -731621456;
                                                                            if (var5_3 == -2097907243) break block35;
                                                                            if (var5_3 != 12959901) {
                                                                                ** break;
                                                                            }
                                                                            break block36;
                                                                        }
                                                                        case 6: {
                                                                            if (var5_3 == -1954969186) break block37;
                                                                            if (var5_3 != 1503866006) {
                                                                                (Integer.rotateRight(71898899 ^ var3_4, 3) + -1992856952) * 71898899;
                                                                                ** break;
                                                                            }
                                                                            break block38;
                                                                        }
                                                                        case 7: {
                                                                            if (var5_3 == -566902225) break block39;
                                                                            if (var5_3 == 1644423927) break block40;
                                                                            if (var5_3 != 787232279) {
                                                                                ** break;
                                                                            }
                                                                            break block41;
                                                                        }
                                                                    }
                                                                    (Integer.rotateRight(-2030154761 ^ var3_4, 3) - 1562956324) * -2030154761;
                                                                    return;
                                                                }
                                                                (Integer.rotateLeft(-340797764 ^ var3_4, 16) - -1901551617) * -340797763;
                                                                if (td_3.mc.field_1761 != null) {
                                                                    var4_5 = Integer.reverse(Integer.reverse(337957024 + var3_4));
                                                                    var5_3 -= 5;
                                                                    continue;
                                                                }
                                                                var4_5 = (int)((long)(861703315 + var3_4) ^ -3970526627180219574L ^ -3970526627180219574L);
                                                                continue;
                                                            }
                                                            Integer.rotateRight(1217085070 ^ var3_4, 12) - -851824019;
                                                            if (td_3.mc.field_1724 == null) {
                                                                var4_5 = 861703315 + var3_4 ^ 1417669739 ^ 1417669739;
                                                                Integer.rotateRight(2016038891 ^ var3_4, 18) + -1854059344;
                                                                var5_3 += 2;
                                                                continue;
                                                            }
                                                            (int)(5235190965571956050L ^ (long)var3_4 ^ -5074263532619219809L);
                                                            var4_5 = -2062877112 + var3_4 + -949624077 - -949624077;
                                                            (int)(-862370052694977749L ^ (long)var3_4 ^ -8974569119610288703L);
                                                            var4_5 = -566902225 + var3_4 ^ -1408909598 ^ -1408909598;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(-1905229983 ^ var3_4, 4) + 1140657146;
                                                        (int)(5531213486099852111L ^ (long)var3_4 ^ 6901910577404785748L);
                                                        var2_2 = td_3.mc.field_1724.field_7512.field_7763;
                                                        td_3.hd_2(td_3.mc.field_1761, var2_2, var1_1, 1, class_1713.field_7795, (class_1657)td_3.mc.field_1724);
                                                        return;
                                                    }
                                                    (Integer.rotateLeft(-44920651 ^ var3_4, 18) - -1319295706) * -44920651;
                                                    (int)(4602747573677386575L ^ (long)var3_4 ^ -9196206290631011823L);
                                                    var4_5 = 1609090012 + var3_4 + 1434744559 - 1434744559;
                                                    (Integer.rotateRight(667562482 ^ var3_4, 7) + -707155063) * 667562483;
                                                    (int)(6117941916608873537L ^ (long)var3_4 ^ 7706858875154400287L);
                                                    var4_5 = 2116218427 + var3_4;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(-505223180 ^ var3_4, 15) - 1591195079) * -505223179;
                                                var4_5 = 2116218427 + var3_4 + -819774375 - -819774375;
                                                Integer.rotateLeft(-1952415255 ^ var3_4, 4) + -322086286;
                                                (int)(5265323502597368655L ^ (long)var3_4 ^ -6712471096136220683L);
                                                var5_3 -= 5;
                                                continue;
                                            }
                                            (Integer.rotateLeft(-1079344043 ^ var3_4, 10) - 973317510) * -1079344043;
                                            (int)(9014001281015278415L ^ (long)var3_4 ^ -6223830536566515743L);
                                            try {
                                                if ((6261508963729630553L ^ (long)var3_4 | 1L) == 0L) {
                                                    throw new IllegalStateException();
                                                }
                                                var4_5 = 2116218427 + var3_4;
                                            }
                                            catch (IllegalStateException v0) {
                                                var4_5 = Integer.reverse(Integer.reverse(2116218427 + var3_4));
                                            }
                                            continue;
                                        }
                                        Integer.rotateRight(555695663 ^ var3_4, 7) - 119940844;
                                        var4_5 = Integer.reverse(Integer.reverse(-147293151 + var3_4));
                                        Integer.rotateLeft(-889512960 ^ var3_4, 12) + -1731853509;
                                        var4_5 = (int)((long)(2116218427 + var3_4) ^ 5530814231840147822L ^ 5530814231840147822L);
                                        var5_3 += 3;
                                        continue;
                                    }
                                    (Integer.rotateLeft(-946784579 ^ var3_4, 11) - 787693598) * -946784579;
                                    (int)(370307270566013775L ^ (long)var3_4 ^ -3715325544121129066L);
                                    var4_5 = Integer.reverse(Integer.reverse(2116218427 + var3_4));
                                    (Integer.rotateLeft(-618102563 ^ var3_4, 14) - -1908065794) * -618102563;
                                    (int)(1844838537637456719L ^ (long)var3_4 ^ -6867845283280478491L);
                                    ++var5_3;
                                    continue;
                                }
                                (Integer.rotateRight(-894320230 ^ var3_4, 12) + -1880878879) * -894320229;
                                var4_5 = 694229155 + var3_4;
                                (Integer.rotateLeft(-387669416 ^ var3_4, 16) + 940394467) * -387669415;
                                var4_5 = 2116218427 + var3_4;
                                var5_3 -= 4;
                                continue;
                            }
                            Integer.rotateRight(-299494962 ^ var3_4, 16) - -621164755;
                            var4_5 = (int)((long)(152663321 + var3_4) ^ -4264064620364798218L ^ -4264064620364798218L);
                            (Integer.rotateRight(-746966341 ^ var3_4, 13) + -1607875616) * -746966341;
                            try {
                                var5_3 -= 4;
                                if ((7722299921216810811L ^ (long)var3_4 | 1L) == 0L) {
                                    throw new NoSuchElementException();
                                }
                                var4_5 = Integer.reverse(Integer.reverse(2116218427 + var3_4));
                            }
                            catch (NoSuchElementException v1) {
                                var4_5 = (int)((long)(2116218427 + var3_4) ^ 5672538433084469350L ^ 5672538433084469350L);
                            }
                            var5_3 += 4;
                            continue;
                        }
                        Integer.rotateLeft(-115462843 ^ var3_4, 18) - 788863638;
                        (int)(4299956296319560527L ^ (long)var3_4 ^ -324115024711132536L);
                        try {
                            var5_3 -= 3;
                            var4_5 = 2116218427 + var3_4 ^ -323761718 ^ -323761718;
                        }
                        catch (NoSuchElementException v2) {
                            var4_5 = 2116218427 + var3_4 + 1471668123 - 1471668123;
                        }
                        var5_3 -= 4;
                        continue;
                    }
                    Integer.rotateRight(-1032036370 ^ var3_4, 11) - -1855111923;
                    (int)(-3814900168795376L ^ (long)var3_4 ^ 1858968052952355381L);
                    var4_5 = 2116218427 + var3_4 + -401153872 - -401153872;
                    var5_3 += 2;
                    continue;
                }
                Integer.rotateRight(-1530855894 ^ var3_4, 7) + -138647983;
                (int)(6805299946199464548L ^ (long)var3_4 ^ 7858142377006797107L);
                var4_5 = 2116218427 + var3_4 + 144623082 - 144623082;
                continue;
            }
            (Integer.rotateLeft(35599260 ^ var3_4, 3) - 1176821535) * 35599261;
            var4_5 = -408997988 + var3_4 ^ 1617907096 ^ 1617907096;
            (Integer.rotateLeft(763643413 ^ var3_4, 8) - -2023613498) * 763643413;
            (int)(-1209524190737798321L ^ (long)var3_4 ^ 3251743079420949436L);
            try {
                var5_3 += 2;
                if ((4268958350763274809L ^ (long)var3_4 | 1L) == 0L) {
                    throw new ArithmeticException();
                }
                var4_5 = (int)((long)(2116218427 + var3_4) ^ 5265181814306861100L ^ 5265181814306861100L);
            }
            catch (ArithmeticException v3) {
                var4_5 = (int)((long)(2116218427 + var3_4) ^ -7346946070928470489L ^ -7346946070928470489L);
            }
            continue;
lbl214:
            // 7 sources

            (Integer.rotateRight(-522719138 ^ var3_4, 15) - 1048820381) * -522719137;
            var4_5 = 2116218427 + var3_4 ^ -1101719992 ^ -1101719992;
        }
    }

    private class_1799 trr(int n) {
        class_1799 class_17992 = null;
        int n2 = 0;
        int n3 = 22000844;
        n3 = Integer.rotateLeft(n3 * -1933581655, 24) ^ 0x4FA103FF;
        n3 = Integer.rotateLeft(System.identityHashCode(this) ^ n3, 20);
        n3 = Integer.rotateRight(n ^ n3, 13);
        int n4 = Integer.reverse(Integer.reverse(-1245531929 * 357687437 + -1669239767 ^ n3));
        while (true) {
            block54: {
                block64: {
                    block56: {
                        block79: {
                            block68: {
                                block55: {
                                    block78: {
                                        block63: {
                                            block53: {
                                                block76: {
                                                    block74: {
                                                        block71: {
                                                            block52: {
                                                                block51: {
                                                                    block72: {
                                                                        block67: {
                                                                            block77: {
                                                                                block61: {
                                                                                    block70: {
                                                                                        block62: {
                                                                                            block59: {
                                                                                                block75: {
                                                                                                    block69: {
                                                                                                        block57: {
                                                                                                            block60: {
                                                                                                                block73: {
                                                                                                                    block65: {
                                                                                                                        block66: {
                                                                                                                            block48: {
                                                                                                                                block58: {
                                                                                                                                    block49: {
                                                                                                                                        block50: {
                                                                                                                                            if ((n2 = ((n4 ^ n3) - -1669239767) * 737862213) > -684023730) break block48;
                                                                                                                                            if (n2 > -1425296109) break block49;
                                                                                                                                            if (n2 > -1551530363) break block50;
                                                                                                                                            if (n2 == -1972817794) break block51;
                                                                                                                                            if (n2 == -1697199630) break block52;
                                                                                                                                            int cfr_ignored_0 = (Integer.rotateLeft(0x8E51859D ^ n3, 4) - 1077726526) * -1907260003;
                                                                                                                                            int cfr_ignored_1 = (int)(0x4CE32BA027D4EB4FL ^ (long)n3 ^ 0xAA30831A2DB93417L);
                                                                                                                                            if (n2 == -1551530363) break block53;
                                                                                                                                            break block54;
                                                                                                                                        }
                                                                                                                                        if (n2 == -1473984199) break block55;
                                                                                                                                        if (n2 == -1441791693) break block56;
                                                                                                                                        if (n2 == -1425296109) break block57;
                                                                                                                                        break block54;
                                                                                                                                    }
                                                                                                                                    if (n2 > -1063352625) break block58;
                                                                                                                                    if (n2 == -1360959056) break block59;
                                                                                                                                    if (n2 == -1245531929) break block60;
                                                                                                                                    if (n2 == -1063352625) break block61;
                                                                                                                                    break block54;
                                                                                                                                }
                                                                                                                                if (n2 == -1002541121) break block62;
                                                                                                                                if (n2 == -831305954) break block63;
                                                                                                                                int cfr_ignored_2 = (Integer.rotateRight(0x3FBB895E ^ n3, 10) - -1139588707) * 1069255007;
                                                                                                                                if (n2 == -684023730) break block64;
                                                                                                                                break block54;
                                                                                                                            }
                                                                                                                            if (n2 > 695192654) break block65;
                                                                                                                            if (n2 > -66844395) break block66;
                                                                                                                            if (n2 == -349719908) break block67;
                                                                                                                            if (n2 == -112037074) break block68;
                                                                                                                            if (n2 == -66844395) break block69;
                                                                                                                            break block54;
                                                                                                                        }
                                                                                                                        if (n2 == 611645924) break block70;
                                                                                                                        if (n2 == 678170441) break block71;
                                                                                                                        int cfr_ignored_3 = Integer.rotateRight(0xA7DF64E ^ n3, 4) - 1235120813;
                                                                                                                        if (n2 == 695192654) break block72;
                                                                                                                        break block54;
                                                                                                                    }
                                                                                                                    if (n2 > 1178636676) break block73;
                                                                                                                    if (n2 == 1085194618) break block74;
                                                                                                                    if (n2 == 1113878686) break block75;
                                                                                                                    if (n2 == 1178636676) break block76;
                                                                                                                    break block54;
                                                                                                                }
                                                                                                                if (n2 == 1418081241) break block77;
                                                                                                                if (n2 == 1855533359) break block78;
                                                                                                                int cfr_ignored_4 = Integer.rotateRight(0xD844E583 ^ n3, 14) + 884304408;
                                                                                                                if (n2 == 1905348312) break block79;
                                                                                                                break block54;
                                                                                                            }
                                                                                                            int cfr_ignored_5 = Integer.rotateRight(0x53830CCF ^ n3, 13) - 557591628;
                                                                                                            if (yf.khdha_2()) {
                                                                                                                n4 = (-1063352625 * 357687437 + -1669239767 ^ n3) + -1298123761 - -1298123761;
                                                                                                                int cfr_ignored_6 = (Integer.rotateRight(0xF7575F36 ^ n3, 17) - -135125307) * -145268937;
                                                                                                                n2 -= 3;
                                                                                                                continue;
                                                                                                            }
                                                                                                            try {
                                                                                                                n2 -= 5;
                                                                                                                if ((0x83C73814FB7B7FFDL ^ (long)n3 | 1L) == 0L) {
                                                                                                                    throw new ArithmeticException();
                                                                                                                }
                                                                                                                n4 = -1360959056 * 357687437 + -1669239767 ^ n3;
                                                                                                            }
                                                                                                            catch (ArithmeticException arithmeticException) {
                                                                                                                n4 = (int)((long)(-1360959056 * 357687437 + -1669239767 ^ n3) ^ 0x2007F664D5360181L ^ 0x2007F664D5360181L);
                                                                                                            }
                                                                                                            continue;
                                                                                                        }
                                                                                                        int cfr_ignored_7 = Integer.rotateLeft(0x48A4B1A1 ^ n3, 12) + -800120390;
                                                                                                        int cfr_ignored_8 = (int)(0x8A161F9C27D4EB4FL ^ (long)n3 ^ 0xC248831A2DB8B9FDL);
                                                                                                        if (n >= td_3.mc.field_1724.field_7498.field_7761.size()) {
                                                                                                            try {
                                                                                                                --n2;
                                                                                                                if ((0x2B9F3A5ACCC9413DL ^ (long)n3 | 1L) == 0L) {
                                                                                                                    throw new UnsupportedOperationException();
                                                                                                                }
                                                                                                                n4 = -66844395 * 357687437 + -1669239767 ^ n3;
                                                                                                            }
                                                                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                                n4 = (int)((long)(-66844395 * 357687437 + -1669239767 ^ n3) ^ 0x6A074D7858898D4CL ^ 0x6A074D7858898D4CL);
                                                                                                            }
                                                                                                            n2 += 2;
                                                                                                            continue;
                                                                                                        }
                                                                                                        int cfr_ignored_9 = (int)(0xF63983EDFCA6DF24L ^ (long)n3 ^ 0xFAAB35FE456E41A2L);
                                                                                                        n4 = (int)((long)(-1978718824 * 357687437 + -1669239767 ^ n3) ^ 0x2D636B20D75B7463L ^ 0x2D636B20D75B7463L);
                                                                                                        int cfr_ignored_10 = (int)(0xE192B837FBF29F22L ^ (long)n3 ^ 0x8D1F3B56C5626EF4L);
                                                                                                        n4 = (-1002541121 * 357687437 + -1669239767 ^ n3) + -820931627 - -820931627;
                                                                                                        n2 += 3;
                                                                                                        continue;
                                                                                                    }
                                                                                                    int cfr_ignored_11 = Integer.rotateRight(0xD1AC5F4B ^ n3, 13) + 1748838736;
                                                                                                    class_17992 = class_1799.field_8037;
                                                                                                    n4 = -684023730 * 357687437 + -1669239767 ^ n3 ^ 0xE9833D93 ^ 0xE9833D93;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_12 = Integer.rotateRight(0x5038DB27 ^ n3, 13) - -1153423116;
                                                                                                class_17992 = class_1799.field_8037;
                                                                                                try {
                                                                                                    --n2;
                                                                                                    n4 = (int)((long)(-684023730 * 357687437 + -1669239767 ^ n3) ^ 0xA53F4AA47C14EE9AL ^ 0xA53F4AA47C14EE9AL);
                                                                                                }
                                                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                                                    n4 = Integer.reverse(Integer.reverse(-684023730 * 357687437 + -1669239767 ^ n3));
                                                                                                }
                                                                                                --n2;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_13 = Integer.rotateLeft(0xC6767D85 ^ n3, 11) - 213307990;
                                                                                            int cfr_ignored_14 = (int)(0x4C4D3B827D4EB4FL ^ (long)n3 ^ 0x5A00831A2DB9A458L);
                                                                                            td_3.shkhs();
                                                                                            throw null;
                                                                                        }
                                                                                        int cfr_ignored_15 = (Integer.rotateRight(0xD0C5EABA ^ n3, 13) + 1280641985) * -792335685;
                                                                                        class_17992 = td_3.rys(td_3.mc.field_1724.field_7498, n).method_7677();
                                                                                        n4 = (int)((long)(1301914988 * 357687437 + -1669239767 ^ n3) ^ 0xD120E4C3149E634DL ^ 0xD120E4C3149E634DL);
                                                                                        int cfr_ignored_16 = Integer.rotateLeft(0xD2CE76C ^ n3, 4) - -1664244401;
                                                                                        n4 = (-684023730 * 357687437 + -1669239767 ^ n3) + -496374146 - -496374146;
                                                                                        n2 += 2;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_17 = (Integer.rotateRight(0xA1966DBE ^ n3, 7) - -1785403075) * -1583977025;
                                                                                    if (td_3.mc.field_1724.field_7498 != null) {
                                                                                        n4 = -349719908 * 357687437 + -1669239767 ^ n3 ^ 0x36AB4F64 ^ 0x36AB4F64;
                                                                                        int cfr_ignored_18 = (Integer.rotateLeft(0xD22AFEB4 ^ n3, 13) - 2006087431) * -768934219;
                                                                                        n2 -= 2;
                                                                                        continue;
                                                                                    }
                                                                                    n4 = Integer.reverse(Integer.reverse(1113878686 * 357687437 + -1669239767 ^ n3));
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_19 = Integer.rotateLeft(0x727F6A60 ^ n3, 17) + -506756901;
                                                                                if (td_3.mc.field_1724 != null) {
                                                                                    int cfr_ignored_20 = (int)(0xE6582D179D94A380L ^ (long)n3 ^ 0xA75FF79ABC266161L);
                                                                                    n4 = (-866403597 * 357687437 + -1669239767 ^ n3) + -383231191 - -383231191;
                                                                                    int cfr_ignored_21 = (int)(0x3AE09634E3260EDEL ^ (long)n3 ^ 0xD1190AFFE69BD810L);
                                                                                    n4 = (int)((long)(611645924 * 357687437 + -1669239767 ^ n3) ^ 0xCEE3F2C998BC9C5CL ^ 0xCEE3F2C998BC9C5CL);
                                                                                    continue;
                                                                                }
                                                                                try {
                                                                                    ++n2;
                                                                                    if ((0xDF6BBD2901BC5279L ^ (long)n3 | 1L) == 0L) {
                                                                                        throw new IllegalStateException();
                                                                                    }
                                                                                    n4 = 1113878686 * 357687437 + -1669239767 ^ n3 ^ 0xD256C805 ^ 0xD256C805;
                                                                                }
                                                                                catch (IllegalStateException illegalStateException) {
                                                                                    n4 = 1113878686 * 357687437 + -1669239767 ^ n3 ^ 0xC9A30E1A ^ 0xC9A30E1A;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_22 = Integer.rotateLeft(0x2237E081 ^ n3, 7) + 690081498;
                                                                            int cfr_ignored_23 = (int)(0xE0854EBC27D4EB4FL ^ (long)n3 ^ 0x6008831A2DB86CDBL);
                                                                            if (td_3.mc.field_1724 != null) {
                                                                                n4 = (-757459808 * 357687437 + -1669239767 ^ n3) + 866089675 - 866089675;
                                                                                int cfr_ignored_24 = Integer.rotateRight(0x3DF06207 ^ n3, 10) - -2072412652;
                                                                                n4 = (611645924 * 357687437 + -1669239767 ^ n3) + -1000127567 - -1000127567;
                                                                                continue;
                                                                            }
                                                                            try {
                                                                                if ((0xBA0481CE8E85D505L ^ (long)n3 | 1L) == 0L) {
                                                                                    throw new ArithmeticException();
                                                                                }
                                                                                n4 = 1113878686 * 357687437 + -1669239767 ^ n3;
                                                                            }
                                                                            catch (ArithmeticException arithmeticException) {
                                                                                n4 = (1113878686 * 357687437 + -1669239767 ^ n3) + 229757225 - 229757225;
                                                                            }
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_25 = (Integer.rotateRight(0x870BE17F ^ n3, 3) - 1590554012) * -2029264513;
                                                                        if (n >= 0) {
                                                                            try {
                                                                                if ((0x735F35AF846032DBL ^ (long)n3 | 1L) == 0L) {
                                                                                    throw new NoSuchElementException();
                                                                                }
                                                                                n4 = -1425296109 * 357687437 + -1669239767 ^ n3;
                                                                            }
                                                                            catch (NoSuchElementException noSuchElementException) {
                                                                                n4 = -1425296109 * 357687437 + -1669239767 ^ n3;
                                                                            }
                                                                            n2 -= 5;
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            --n2;
                                                                            if ((0x72174C44D2CFC461L ^ (long)n3 | 1L) == 0L) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            n4 = -66844395 * 357687437 + -1669239767 ^ n3 ^ 0xE90DA56F ^ 0xE90DA56F;
                                                                        }
                                                                        catch (IllegalStateException illegalStateException) {
                                                                            n4 = -66844395 * 357687437 + -1669239767 ^ n3 ^ 0xA235EE50 ^ 0xA235EE50;
                                                                        }
                                                                        n2 += 3;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_26 = (Integer.rotateRight(0x7A8114B3 ^ n3, 18) + -637591320) * 2055279795;
                                                                    n4 = -1245531929 * 357687437 + -1669239767 ^ n3 ^ 0xA07EBB5E ^ 0xA07EBB5E;
                                                                    int cfr_ignored_27 = Integer.rotateLeft(0x65155FCC ^ n3, 15) - 1106524399;
                                                                    --n2;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_28 = (Integer.rotateRight(0x3048CAB3 ^ n3, 9) + -584176920) * 810076851;
                                                                n4 = (-367540800 * 357687437 + -1669239767 ^ n3) + 140706137 - 140706137;
                                                                int cfr_ignored_29 = Integer.rotateLeft(0x1237AAC8 ^ n3, 5) + 958090611;
                                                                try {
                                                                    n2 += 3;
                                                                    if ((0x8A284921F0EF83E9L ^ (long)n3 | 1L) == 0L) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                    n4 = (int)((long)(-1245531929 * 357687437 + -1669239767 ^ n3) ^ 0x35AD5F7F6A1D2115L ^ 0x35AD5F7F6A1D2115L);
                                                                }
                                                                catch (IllegalStateException illegalStateException) {
                                                                    n4 = -1245531929 * 357687437 + -1669239767 ^ n3;
                                                                }
                                                                continue;
                                                            }
                                                            int cfr_ignored_30 = Integer.rotateLeft(0x6DEC84C0 ^ n3, 16) + 1409397371;
                                                            n4 = (int)((long)(-1429678392 * 357687437 + -1669239767 ^ n3) ^ 0xD176EC413D849913L ^ 0xD176EC413D849913L);
                                                            int cfr_ignored_31 = Integer.rotateLeft(0x8B905EE0 ^ n3, 4) + -354870181;
                                                            try {
                                                                n4 = (-1245531929 * 357687437 + -1669239767 ^ n3) + -322880360 - -322880360;
                                                            }
                                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                                n4 = -1245531929 * 357687437 + -1669239767 ^ n3 ^ 0xCD92C19F ^ 0xCD92C19F;
                                                            }
                                                            n2 -= 5;
                                                            continue;
                                                        }
                                                        int cfr_ignored_32 = Integer.rotateLeft(0xF1C3BAA8 ^ n3, 17) + 1259420051;
                                                        int cfr_ignored_33 = (int)(0x76AD5291FAE18C05L ^ (long)n3 ^ 0x58533970E32D408BL);
                                                        n4 = (int)((long)(-715648250 * 357687437 + -1669239767 ^ n3) ^ 0xCF12BC10C6983AFBL ^ 0xCF12BC10C6983AFBL);
                                                        int cfr_ignored_34 = (int)(0x2E5FF73E9100DDF9L ^ (long)n3 ^ 0x130DEEB240D5F16EL);
                                                        n4 = (-1245531929 * 357687437 + -1669239767 ^ n3) + 553563875 - 553563875;
                                                        continue;
                                                    }
                                                    int cfr_ignored_35 = Integer.rotateLeft(0x1F87E928 ^ n3, 6) + -707601645;
                                                    try {
                                                        --n2;
                                                        n4 = Integer.reverse(Integer.reverse(-1245531929 * 357687437 + -1669239767 ^ n3));
                                                    }
                                                    catch (NoSuchElementException noSuchElementException) {
                                                        n4 = -1245531929 * 357687437 + -1669239767 ^ n3;
                                                    }
                                                    continue;
                                                }
                                                int cfr_ignored_36 = (Integer.rotateRight(0xE9E76F5E ^ n3, 16) - 1466178461) * -370708641;
                                                n4 = -1245531929 * 357687437 + -1669239767 ^ n3 ^ 0x93CAA3A3 ^ 0x93CAA3A3;
                                                n2 += 5;
                                                continue;
                                            }
                                            int cfr_ignored_37 = (Integer.rotateRight(0xEFCB29F ^ n3, 4) - -721993604) * 251441823;
                                            n4 = Integer.reverse(Integer.reverse(-1245531929 * 357687437 + -1669239767 ^ n3));
                                            int cfr_ignored_38 = Integer.rotateRight(0xC4C7746A ^ n3, 11) + -662390767;
                                            n2 += 3;
                                            continue;
                                        }
                                        int cfr_ignored_39 = Integer.rotateRight(0xF89F4DCF ^ n3, 18) - 531106636;
                                        int cfr_ignored_40 = (int)(0x2A1EA570BEEA9F63L ^ (long)n3 ^ 0xB791B166C5E1F9ECL);
                                        n4 = -1245531929 * 357687437 + -1669239767 ^ n3;
                                        n2 += 3;
                                        continue;
                                    }
                                    int cfr_ignored_41 = Integer.rotateRight(0xF61F0AAF ^ n3, 17) - -769660308;
                                    try {
                                        n2 += 3;
                                        n4 = (int)((long)(-1245531929 * 357687437 + -1669239767 ^ n3) ^ 0xD3326693A0D10030L ^ 0xD3326693A0D10030L);
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        n4 = (int)((long)(-1245531929 * 357687437 + -1669239767 ^ n3) ^ 0xEC4C37460CB7012BL ^ 0xEC4C37460CB7012BL);
                                    }
                                    --n2;
                                    continue;
                                }
                                int cfr_ignored_42 = (Integer.rotateLeft(0xBFEF81B5 ^ n3, 10) - 1113478182) * -1074822731;
                                int cfr_ignored_43 = (int)(0x7D5D2F8827D4EB4FL ^ (long)n3 ^ 0xA260831A2DB9576BL);
                                n4 = -505701212 * 357687437 + -1669239767 ^ n3;
                                int cfr_ignored_44 = Integer.rotateRight(0x98556886 ^ n3, 6) - 1991591797;
                                try {
                                    if ((0x1CFA512A29162D4DL ^ (long)n3 | 1L) == 0L) {
                                        throw new IllegalStateException();
                                    }
                                    n4 = -1245531929 * 357687437 + -1669239767 ^ n3 ^ 0x2A57710B ^ 0x2A57710B;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    n4 = -1245531929 * 357687437 + -1669239767 ^ n3 ^ 0x74873B76 ^ 0x74873B76;
                                }
                                n2 += 3;
                                continue;
                            }
                            int cfr_ignored_45 = Integer.rotateRight(0xD951DC23 ^ n3, 14) + 1430734712;
                            try {
                                if ((0x24100766C996FAD9L ^ (long)n3 | 1L) == 0L) {
                                    throw new UnsupportedOperationException();
                                }
                                n4 = -1245531929 * 357687437 + -1669239767 ^ n3;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                n4 = -1245531929 * 357687437 + -1669239767 ^ n3 ^ 0x53201F80 ^ 0x53201F80;
                            }
                            n2 += 4;
                            continue;
                        }
                        int cfr_ignored_46 = (Integer.rotateRight(0x8610B33F ^ n3, 3) - 1080251356) * -2045725889;
                        try {
                            --n2;
                            if ((0x4272780E1647D4F3L ^ (long)n3 | 1L) == 0L) {
                                throw new UnsupportedOperationException();
                            }
                            n4 = (int)((long)(-1245531929 * 357687437 + -1669239767 ^ n3) ^ 0x84AFD186E053CF9AL ^ 0x84AFD186E053CF9AL);
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n4 = -1245531929 * 357687437 + -1669239767 ^ n3 ^ 0x6B0A7434 ^ 0x6B0A7434;
                        }
                        n2 += 3;
                        continue;
                    }
                    int cfr_ignored_47 = Integer.rotateRight(0xC05ACDE2 ^ n3, 11) + 1331465625;
                    try {
                        n2 -= 3;
                        if ((0xE7B7F9E022177463L ^ (long)n3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n4 = Integer.reverse(Integer.reverse(-1245531929 * 357687437 + -1669239767 ^ n3));
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n4 = (int)((long)(-1245531929 * 357687437 + -1669239767 ^ n3) ^ 0xC8D88CC75D385305L ^ 0xC8D88CC75D385305L);
                    }
                    continue;
                }
                return class_17992;
            }
            int cfr_ignored_48 = (Integer.rotateLeft(0x1D61739D ^ n3, 6) - -1825923266) * 492925853;
            int cfr_ignored_49 = (int)(0xDFD3DDA027D4EB4FL ^ (long)n3 ^ 0x4630831A2DB81276L);
            n4 = Integer.reverse(Integer.reverse(-1245531929 * 357687437 + -1669239767 ^ n3));
        }
    }

    private List tghb_2() {
        int n;
        try {
            int n2 = 360517089;
            n2 = Integer.rotateLeft(n2 * -743539017, 7) ^ 0x40E93A3D;
            n2 = System.identityHashCode(this) ^ n2;
            int n3 = n2 ^ 0xE0565DD1;
            if ((n3 ^ n2) != -531210799) {
                int cfr_ignored_0 = (0xF52B5030 ^ n2) - 1974419095;
            }
            if ((0x10F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (this.sthdh.shzl()) {
            arrayList.add(5);
            arrayList.add(-859368993 + 859368999);
            arrayList.add(td_3.thkhm(-411326016 + 411326023));
            arrayList.add(Integer.reverse(1849178443) ^ 0xD29C1C7E);
        }
        for (n = Integer.rotateLeft(0xA225585C ^ 0xA221D85C, 17); n <= -97423158 + 97423193; ++n) {
            arrayList.add(n);
        }
        for (n = 0xB3E50947 ^ 0xB3E50963; n <= Integer.rotateLeft(0x476A1797 ^ 0xF76A1797, 6); ++n) {
            arrayList.add(n);
        }
        if (this.dhdth.shzl()) {
            arrayList.add(-606561506 + 606561551);
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    private boolean adz_2(boolean var1_1) {
        var2_2 = false;
        var5_3 = 0;
        var3_4 = 1601117529;
        var3_4 = Integer.rotateLeft(var3_4 * -1932658625, 27) ^ -2091620225;
        var3_4 = Integer.rotateRight(System.identityHashCode(this) ^ var3_4, 22);
        var4_5 = var3_4 - 2131381642 ^ -1341959432 ^ -1341959432;
        block75: while (true) {
            if ((var5_3 = var3_4 - var4_5) == 1438711444) ** GOTO lbl348
            if (var5_3 == 1083977375) ** GOTO lbl495
            (Integer.rotateLeft(-752771335 ^ var3_4, 13) + -1787830430) * -752771335;
            (int)(1266409539261229903L ^ (long)var3_4 ^ -7135809461109027081L);
            if (var5_3 == 1746338095) ** GOTO lbl400
            if (var5_3 == -377192557) ** GOTO lbl282
            if (var5_3 == -2056294642) ** GOTO lbl242
            switch (var5_3) {
                case 2131381642: {
                    Integer.rotateRight(-361696534 ^ var3_4, 16) + 1745553809;
                    if (td_3.mc.field_1724 == null) {
                        var4_5 = (int)((long)(var3_4 - 1671529081) ^ -7740689588667533238L ^ -7740689588667533238L);
                        Integer.rotateLeft(-384067132 ^ var3_4, 16) - 1052065271;
                        var4_5 = var3_4 - 1554954299;
                        continue block75;
                    }
                    var4_5 = var3_4 - 1285520390 ^ 1786303568 ^ 1786303568;
                    (Integer.rotateRight(1900415154 ^ var3_4, 17) + -1143427895) * 1900415155;
                    var4_5 = var3_4 - 1352590214;
                    var5_3 -= 4;
                    continue block75;
                }
                case 664915769: {
                    (Integer.rotateLeft(1736934841 ^ var3_4, 15) + -1916350302) * 1736934841;
                    (int)(-6542275037081834673L ^ (long)var3_4 ^ -6163031941597042757L);
                    if (td_3.mc.field_1755 instanceof class_481) {
                        try {
                            var5_3 += 3;
                            var4_5 = var3_4 - -1158808439 ^ -1848196917 ^ -1848196917;
                        }
                        catch (UnsupportedOperationException v0) {
                            var4_5 = Integer.reverse(Integer.reverse(var3_4 - -1158808439));
                        }
                        var5_3 += 4;
                        continue block75;
                    }
                    (int)(-909656540518862206L ^ (long)var3_4 ^ 9012997209840569105L);
                    var4_5 = var3_4 - -351784605;
                    var5_3 += 3;
                    continue block75;
                }
                case -346200686: {
                    (Integer.rotateRight(-1314012482 ^ var3_4, 9) - -2006436803) * -1314012481;
                    bzh_4.rkt((class_2561)class_2561.method_43470((String)"Close chests and".concat(" containers be").concat(td_3.sas_7("臞⤴탾砈譽㋕\uda00䗠钔㰮", 168705147 + -1816399160, 1000957107 + 2002940121, td_3.shmsh(2106705598) ^ 914436622))));
                    try {
                        if ((87514917398969749L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var4_5 = var3_4 - 916134799 + -88127473 - -88127473;
                    }
                    catch (IllegalStateException v1) {
                        var4_5 = var3_4 - 916134799 ^ -2035477574 ^ -2035477574;
                    }
                    continue block75;
                }
                case 2041985714: {
                    (Integer.rotateRight(509450738 ^ var3_4, 6) + -1313651831) * 509450739;
                    if (td_3.mc.field_1761 == null) {
                        try {
                            var5_3 -= 4;
                            if ((6224946763906614611L ^ (long)var3_4 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var4_5 = var3_4 - 1554954299 ^ 17241808 ^ 17241808;
                        }
                        catch (IllegalStateException v2) {
                            var4_5 = (int)((long)(var3_4 - 1554954299) ^ 7768941930273365381L ^ 7768941930273365381L);
                        }
                        --var5_3;
                        continue block75;
                    }
                    var4_5 = var3_4 - 664915769;
                    var5_3 -= 5;
                    continue block75;
                }
                case -1838056346: {
                    Integer.rotateLeft(315759524 ^ var3_4, 5) - 1271855127;
                    if (!this.thhh.shzl()) {
                        try {
                            var5_3 += 4;
                            if ((3702733364873863297L ^ (long)var3_4 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var4_5 = (int)((long)(var3_4 - -2056294642) ^ 1433395762232953973L ^ 1433395762232953973L);
                        }
                        catch (ArithmeticException v3) {
                            var4_5 = Integer.reverse(Integer.reverse(var3_4 - -2056294642));
                        }
                        var5_3 -= 5;
                        continue block75;
                    }
                    var4_5 = (int)((long)(var3_4 - 1506450133) ^ -5684373159441992482L ^ -5684373159441992482L);
                    (Integer.rotateRight(-1031628581 ^ var3_4, 11) + -1842470464) * -1031628581;
                    var4_5 = var3_4 - -1816097880 ^ -1028397535 ^ -1028397535;
                    var5_3 += 3;
                    continue block75;
                }
                case -511784838: {
                    (Integer.rotateRight(2073255955 ^ var3_4, 18) + -80330360) * 2073255955;
                    td_3.dhh_7((class_2561)class_2561.method_43470((String)"Inventory Sorter do".concat("es not support crea").concat("tive inventory.")));
                    var4_5 = (int)((long)(var3_4 - -2146958230) ^ 7881554602904314101L ^ 7881554602904314101L);
                    (Integer.rotateLeft(-1035950467 ^ var3_4, 11) - -1976448930) * -1035950467;
                    (int)(68126016003173199L ^ (long)var3_4 ^ -1301396143850542027L);
                    var4_5 = var3_4 - 1880815106 + 164504972 - 164504972;
                    var5_3 += 5;
                    continue block75;
                }
                case -646641992: {
                    Integer.rotateRight(-417852882 ^ var3_4, 15) - 4707021;
                    bzh_4.rkt((class_2561)td_3.tnb("Open only normal".concat(" inventory or").concat(td_3.thht_2("ᅼ皒\ude6a➴輛ᓘ籲얓ⵜ늬ᨾ揀쬣僧롏ƚ楢캏", 309849518 ^ 1522150949, td_3.bfm(2041647724) ^ -803091660, -1265051440 - 1756765472))));
                    (int)(7490637060721104340L ^ (long)var3_4 ^ -3458553530790485447L);
                    var4_5 = var3_4 - 1360167617 + -1757540867 - -1757540867;
                    (int)(-6482051226503407451L ^ (long)var3_4 ^ -4831882524371394105L);
                    var4_5 = var3_4 - -2021377351;
                    continue block75;
                }
                case -351784605: {
                    (Integer.rotateLeft(979570256 ^ var3_4, 10) + 375151339) * 979570257;
                    if (td_3.mc.field_1755 != null) {
                        try {
                            var5_3 -= 3;
                            if ((-774931957027145831L ^ (long)var3_4 | 1L) == 0L) {
                                throw new IllegalArgumentException();
                            }
                            var4_5 = Integer.reverse(Integer.reverse(var3_4 - -1838056346));
                        }
                        catch (IllegalArgumentException v4) {
                            var4_5 = var3_4 - -1838056346;
                        }
                        var5_3 -= 4;
                        continue block75;
                    }
                    try {
                        var5_3 += 5;
                        if ((2180450041287438819L ^ (long)var3_4 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var4_5 = var3_4 - -1166027496 ^ 1414356235 ^ 1414356235;
                    }
                    catch (NoSuchElementException v5) {
                        var4_5 = (int)((long)(var3_4 - -1166027496) ^ 3525522484835147826L ^ 3525522484835147826L);
                    }
                    continue block75;
                }
                case 916134799: {
                    (Integer.rotateLeft(-1804778191 ^ var3_4, 5) + -40304598) * -1804778191;
                    (int)(6259980444508678991L ^ (long)var3_4 ^ 3127894089668296814L);
                    var2_2 = false;
                    var4_5 = (int)((long)(var3_4 - -2028538825) ^ -7935670084579058455L ^ -7935670084579058455L);
                    Integer.rotateLeft(-495211383 ^ var3_4, 15) + 1901560786;
                    (int)(2362422452318169935L ^ (long)var3_4 ^ -569561204402820029L);
                    var4_5 = var3_4 - 326290677;
                    ++var5_3;
                    continue block75;
                }
                case -1030183217: {
                    Integer.rotateRight(1065038467 ^ var3_4, 10) + -1270301416;
                    bzh_4.rkt((class_2561)class_2561.method_43470((String)"Player/world i".concat("s not ready.")));
                    try {
                        var5_3 -= 2;
                        if ((3800046984758866791L ^ (long)var3_4 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var4_5 = (int)((long)(var3_4 - -277788821) ^ 6822614154536351838L ^ 6822614154536351838L);
                    }
                    catch (ArithmeticException v6) {
                        var4_5 = var3_4 - -277788821;
                    }
                    continue block75;
                }
                case -1158808439: {
                    Integer.rotateRight(1303469127 ^ var3_4, 12) - 1826081748;
                    if (!var1_1) {
                        try {
                            var5_3 += 5;
                            if ((8671359104677078493L ^ (long)var3_4 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var4_5 = (int)((long)(var3_4 - 1880815106) ^ 7056963480335087823L ^ 7056963480335087823L);
                        }
                        catch (IllegalStateException v7) {
                            var4_5 = var3_4 - 1880815106 ^ 17305228 ^ 17305228;
                        }
                        continue block75;
                    }
                    var4_5 = (int)((long)(var3_4 - -1385946972) ^ 8101504403907463467L ^ 8101504403907463467L);
                    (Integer.rotateRight(1160386747 ^ var3_4, 11) + 1685495264) * 1160386747;
                    var4_5 = var3_4 - -511784838 + 1697735815 - 1697735815;
                    var5_3 -= 4;
                    continue block75;
                }
                case 1352590214: {
                    Integer.rotateRight(-61721749 ^ var3_4, 18) + -1840129744;
                    if (td_3.mc.field_1687 != null) {
                        var4_5 = (int)((long)(var3_4 - 2041985714) ^ -8133267763960125480L ^ -8133267763960125480L);
                        var5_3 += 5;
                        continue block75;
                    }
                    (int)(5253131505212411495L ^ (long)var3_4 ^ 4898739373419871260L);
                    var4_5 = var3_4 - -715232158 ^ 73643856 ^ 73643856;
                    (int)(4836888908712192176L ^ (long)var3_4 ^ -3108883345316566127L);
                    var4_5 = var3_4 - 1554954299 ^ 466124311 ^ 466124311;
                    var5_3 -= 2;
                    continue block75;
                }
                case -1816097880: {
                    (Integer.rotateRight(94693214 ^ var3_4, 3) - -1286233187) * 94693215;
                    if (td_3.mc.field_1755 instanceof class_490) {
                        var4_5 = var3_4 - -1021520946 + 54419984 - 54419984;
                        (Integer.rotateLeft(1732979069 ^ var3_4, 15) - -2038979234) * 1732979069;
                        (int)(-6487005078634566833L ^ (long)var3_4 ^ -869050579623025118L);
                        var4_5 = Integer.reverse(Integer.reverse(var3_4 - -377192557));
                        var5_3 -= 4;
                        continue block75;
                    }
                    var4_5 = var3_4 - -2056294642;
                    continue block75;
                }
                case 1554954299: {
                    Integer.rotateRight(-74973913 ^ var3_4, 18) - 2044020468;
                    if (!var1_1) {
                        try {
                            var5_3 += 2;
                            var4_5 = var3_4 - -277788821 ^ -1515790324 ^ -1515790324;
                        }
                        catch (UnsupportedOperationException v8) {
                            var4_5 = (int)((long)(var3_4 - -277788821) ^ 8748719304262224844L ^ 8748719304262224844L);
                        }
                        ++var5_3;
                        continue block75;
                    }
                    try {
                        var5_3 -= 4;
                        var4_5 = (int)((long)(var3_4 - -1030183217) ^ 3992729281090583266L ^ 3992729281090583266L);
                    }
                    catch (UnsupportedOperationException v9) {
                        var4_5 = var3_4 - -1030183217 + 818226431 - 818226431;
                    }
                    var5_3 -= 5;
                    continue block75;
                }
lbl242:
                // 1 sources

                (Integer.rotateLeft(1762538585 ^ var3_4, 16) + -1122634238) * 1762538585;
                (int)(-6071808442646598833L ^ (long)var3_4 ^ -3911232127911789912L);
                if (var1_1) {
                    var4_5 = var3_4 - -732683395 ^ 1175297804 ^ 1175297804;
                    Integer.rotateLeft(-1814466428 ^ var3_4, 5) - -340639945;
                    var4_5 = var3_4 - -646641992 ^ 1185626422 ^ 1185626422;
                    continue block75;
                }
                var4_5 = var3_4 - -2021377351;
                Integer.rotateLeft(252388004 ^ var3_4, 4) - -692661993;
                continue block75;
                case 66893299: {
                    Integer.rotateRight(-70826678 ^ var3_4, 18) + -2122382543;
                    if (var1_1) {
                        var4_5 = var3_4 - -346200686 + -1456979596 - -1456979596;
                        var5_3 += 3;
                        continue block75;
                    }
                    var4_5 = var3_4 - -1330914502 ^ -847909912 ^ -847909912;
                    Integer.rotateRight(529535503 ^ var3_4, 6) - -691024116;
                    var4_5 = Integer.reverse(Integer.reverse(var3_4 - 916134799));
                    var5_3 += 5;
                    continue block75;
                }
                case -1166027496: {
                    Integer.rotateRight(-1354993662 ^ var3_4, 8) + 1018113913;
                    if (td_3.mc.field_1724.field_7512 == td_3.mc.field_1724.field_7498) {
                        var4_5 = var3_4 - 294523784;
                        var5_3 += 4;
                        continue block75;
                    }
                    var4_5 = var3_4 - 497981659 + -946198221 - -946198221;
                    (Integer.rotateLeft(-1344332656 ^ var3_4, 8) + 1348605099) * -1344332655;
                    var4_5 = Integer.reverse(Integer.reverse(var3_4 - 66893299));
                    var5_3 -= 3;
                    continue block75;
                }
lbl282:
                // 1 sources

                (Integer.rotateLeft(-1015686699 ^ var3_4, 11) - -1348272122) * -1015686699;
                (int)(128202953387731791L ^ (long)var3_4 ^ 1342216837415939679L);
                if (td_3.mc.field_1724.field_7512 == td_3.mc.field_1724.field_7498) {
                    var4_5 = Integer.reverse(Integer.reverse(var3_4 - 294523784));
                    Integer.rotateLeft(278586765 ^ var3_4, 5) - 119499598;
                    (int)(-3303307106721666225L ^ (long)var3_4 ^ 7642752716107155841L);
                    continue block75;
                }
                var4_5 = (int)((long)(var3_4 - 208668657) ^ -810830181546373782L ^ -810830181546373782L);
                (Integer.rotateRight(-529761606 ^ var3_4, 15) + 830503873) * -529761605;
                var4_5 = var3_4 - 66893299;
                var5_3 += 4;
                continue block75;
                case -2021377351: {
                    Integer.rotateRight(1308987394 ^ var3_4, 12) + 1997148025;
                    var2_2 = false;
                    try {
                        var5_3 += 5;
                        if ((-8029265560127120707L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var4_5 = Integer.reverse(Integer.reverse(var3_4 - 326290677));
                    }
                    catch (IllegalStateException v10) {
                        var4_5 = var3_4 - 326290677 + 1443401590 - 1443401590;
                    }
                    var5_3 -= 5;
                    continue block75;
                }
                case 1880815106: {
                    (Integer.rotateLeft(-1501019236 ^ var3_4, 7) - 786288415) * -1501019235;
                    var2_2 = false;
                    try {
                        if ((-8575497046742845047L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var4_5 = var3_4 - 326290677 ^ -553247321 ^ -553247321;
                    }
                    catch (IllegalArgumentException v11) {
                        var4_5 = var3_4 - 326290677 ^ 687697582 ^ 687697582;
                    }
                    continue block75;
                }
                case -277788821: {
                    Integer.rotateRight(430791406 ^ var3_4, 6) - 542876173;
                    var2_2 = false;
                    try {
                        var5_3 += 3;
                        if ((-3593305848710733171L ^ (long)var3_4 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        var4_5 = var3_4 - 326290677 + -153471091 - -153471091;
                    }
                    catch (UnsupportedOperationException v12) {
                        var4_5 = var3_4 - 326290677 ^ 905288617 ^ 905288617;
                    }
                    var5_3 -= 4;
                    continue block75;
                }
                case 294523784: {
                    Integer.rotateLeft(2062251556 ^ var3_4, 18) - -421466729;
                    var2_2 = true;
                    var4_5 = (int)((long)(var3_4 - 2021008809) ^ 2683197071351558870L ^ 2683197071351558870L);
                    (Integer.rotateRight(1661119867 ^ var3_4, 15) + 28352800) * 1661119867;
                    var4_5 = Integer.reverse(Integer.reverse(var3_4 - 326290677));
                    continue block75;
                }
lbl348:
                // 1 sources

                (Integer.rotateLeft(-1180309840 ^ var3_4, 10) + 2138345099) * -1180309839;
                try {
                    var5_3 -= 2;
                    if ((-5246833229359031203L ^ (long)var3_4 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    var4_5 = var3_4 - 2131381642;
                }
                catch (NoSuchElementException v13) {
                    var4_5 = var3_4 - 2131381642 ^ 935740896 ^ 935740896;
                }
                continue block75;
                case -559319537: {
                    (Integer.rotateLeft(-1510469795 ^ var3_4, 7) - 493321086) * -1510469795;
                    (int)(7442938768540363599L ^ (long)var3_4 ^ -4634059868104727740L);
                    var4_5 = var3_4 - 1952523546 + 1367845576 - 1367845576;
                    Integer.rotateLeft(-25860443 ^ var3_4, 18) - -728429258;
                    (int)(4379689718469946191L ^ (long)var3_4 ^ 7800378703065240670L);
                    (int)(7484328704059123470L ^ (long)var3_4 ^ -6347194910000848278L);
                    var4_5 = Integer.reverse(Integer.reverse(var3_4 - 2131381642));
                    ++var5_3;
                    continue block75;
                }
                case -1674873660: {
                    (Integer.rotateLeft(-1699210052 ^ var3_4, 6) - -1062659585) * -1699210051;
                    var4_5 = var3_4 - -209253364 ^ 770280342 ^ 770280342;
                    (Integer.rotateLeft(510953149 ^ var3_4, 6) - -1267077090) * 510953149;
                    (int)(-2538296809087505585L ^ (long)var3_4 ^ -6021168553334926243L);
                    try {
                        var5_3 -= 3;
                        if ((3480138323849406007L ^ (long)var3_4 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var4_5 = Integer.reverse(Integer.reverse(var3_4 - 2131381642));
                    }
                    catch (NoSuchElementException v14) {
                        var4_5 = var3_4 - 2131381642 ^ -1467899291 ^ -1467899291;
                    }
                    var5_3 -= 4;
                    continue block75;
                }
                case -1487108848: {
                    (Integer.rotateRight(1781449087 ^ var3_4, 16) - -536408676) * 1781449087;
                    var4_5 = var3_4 - 2131381642 ^ 355151404 ^ 355151404;
                    Integer.rotateRight(-783485170 ^ var3_4, 13) - 1555007981;
                    var5_3 -= 5;
                    continue block75;
                }
lbl400:
                // 1 sources

                (Integer.rotateLeft(-383597516 ^ var3_4, 16) - 1066623367) * -383597515;
                var4_5 = Integer.reverse(Integer.reverse(var3_4 - 1547526827));
                Integer.rotateRight(1574920547 ^ var3_4, 14) + 1651141176;
                (int)(5088437003270469142L ^ (long)var3_4 ^ 8758832173404594410L);
                var4_5 = var3_4 - 1410495733;
                (int)(-37241049482036984L ^ (long)var3_4 ^ -6945613109965466842L);
                var4_5 = var3_4 - 2131381642 ^ 1552562205 ^ 1552562205;
                continue block75;
                case -766208486: {
                    (Integer.rotateLeft(393543825 ^ var3_4, 5) + -611798838) * 393543825;
                    (int)(-3042270968839607473L ^ (long)var3_4 ^ -6906125880113232290L);
                    var4_5 = (int)((long)(var3_4 - -1912486220) ^ -4180748397760343332L ^ -4180748397760343332L);
                    (Integer.rotateRight(63874170 ^ var3_4, 3) + 2053343745) * 63874171;
                    var4_5 = var3_4 - 2131381642 + -183225135 - -183225135;
                    --var5_3;
                    continue block75;
                }
                case -1945176149: {
                    Integer.rotateLeft(807200748 ^ var3_4, 9) - -673336113;
                    var4_5 = (int)((long)(var3_4 - -80672702) ^ -5034874945313946465L ^ -5034874945313946465L);
                    Integer.rotateLeft(159133001 ^ var3_4, 4) + 711400210;
                    (int)(-3760924103900075185L ^ (long)var3_4 ^ -317359625270183348L);
                    try {
                        if ((-6596881130846098025L ^ (long)var3_4 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        var4_5 = var3_4 - 2131381642 + 216922313 - 216922313;
                    }
                    catch (ArithmeticException v15) {
                        var4_5 = (int)((long)(var3_4 - 2131381642) ^ 161936426176326895L ^ 161936426176326895L);
                    }
                    var5_3 -= 4;
                    continue block75;
                }
                case 683470575: {
                    Integer.rotateLeft(898287781 ^ var3_4, 9) - -2144605386;
                    (int)(-632642943956227249L ^ (long)var3_4 ^ 3476923060789461921L);
                    var4_5 = (int)((long)(var3_4 - 1710943633) ^ -5203314972646392849L ^ -5203314972646392849L);
                    Integer.rotateRight(-755170002 ^ var3_4, 13) - -1862189107;
                    (int)(1622275058334097194L ^ (long)var3_4 ^ 600328153020465367L);
                    var4_5 = Integer.reverse(Integer.reverse(var3_4 - 1371496184));
                    (int)(-5106009297009689870L ^ (long)var3_4 ^ 7080067055126503318L);
                    var4_5 = var3_4 - 2131381642 + 568957734 - 568957734;
                    var5_3 += 3;
                    continue block75;
                }
                case 559282323: {
                    Integer.rotateRight(-1401234130 ^ var3_4, 8) - -415340595;
                    var4_5 = var3_4 - -2027578871 ^ -1612189431 ^ -1612189431;
                    Integer.rotateRight(-881922069 ^ var3_4, 12) + -1496535888;
                    try {
                        var5_3 -= 4;
                        if ((-858212162031072391L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var4_5 = var3_4 - 2131381642 ^ 2009000576 ^ 2009000576;
                    }
                    catch (IllegalStateException v16) {
                        var4_5 = (int)((long)(var3_4 - 2131381642) ^ 5768824934547688087L ^ 5768824934547688087L);
                    }
                    var5_3 += 2;
                    continue block75;
                }
                case -2064107230: {
                    (Integer.rotateRight(1504553111 ^ var3_4, 14) - -530249340) * 1504553111;
                    var4_5 = var3_4 - -1257853128 ^ -1866791253 ^ -1866791253;
                    (Integer.rotateRight(240539187 ^ var3_4, 4) + -1059975320) * 240539187;
                    var4_5 = Integer.reverse(Integer.reverse(var3_4 - 2131381642));
                    var5_3 += 2;
                    continue block75;
                }
                case -75188786: {
                    Integer.rotateLeft(-1363105564 ^ var3_4, 8) - 766644951;
                    var4_5 = var3_4 - -289959195;
                    Integer.rotateLeft(1991654669 ^ var3_4, 17) - 1684997070;
                    (int)(-5475089411939701937L ^ (long)var3_4 ^ -2661483231316490792L);
                    var4_5 = var3_4 - 639499312 ^ 1906712122 ^ 1906712122;
                    (Integer.rotateRight(181578623 ^ var3_4, 4) - 1407214492) * 181578623;
                    var4_5 = var3_4 - 2131381642 + 1827890609 - 1827890609;
                    ++var5_3;
                    continue block75;
                }
lbl495:
                // 1 sources

                Integer.rotateRight(-653104925 ^ var3_4, 14) + 1301828280;
                var4_5 = Integer.reverse(Integer.reverse(var3_4 - -39518809));
                (Integer.rotateRight(-1953579754 ^ var3_4, 4) - -358185755) * -1953579753;
                try {
                    var5_3 -= 4;
                    if ((-226154575319960515L ^ (long)var3_4 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    var4_5 = var3_4 - 2131381642;
                }
                catch (NoSuchElementException v17) {
                    var4_5 = (int)((long)(var3_4 - 2131381642) ^ -7509209783536166142L ^ -7509209783536166142L);
                }
                continue block75;
                case 665154596: {
                    (Integer.rotateRight(-1585716942 ^ var3_4, 7) + -1839340471) * -1585716941;
                    var4_5 = var3_4 - 1253555584;
                    (Integer.rotateRight(-751567745 ^ var3_4, 13) - -1750519140) * -751567745;
                    var4_5 = var3_4 - 2131381642;
                    var5_3 -= 3;
                    continue block75;
                }
                case -569259353: {
                    (Integer.rotateRight(-655635598 ^ var3_4, 14) + 1223377417) * -655635597;
                    var4_5 = var3_4 - -623523229 ^ -229578480 ^ -229578480;
                    Integer.rotateRight(-366354422 ^ var3_4, 16) + 1601159281;
                    try {
                        if ((3792585592936045263L ^ (long)var3_4 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var4_5 = var3_4 - 2131381642;
                    }
                    catch (IllegalArgumentException v18) {
                        var4_5 = Integer.reverse(Integer.reverse(var3_4 - 2131381642));
                    }
                    ++var5_3;
                    continue block75;
                }
                case -1381522532: {
                    Integer.rotateRight(-526740117 ^ var3_4, 15) + 924170032;
                    (int)(-1418580088784998744L ^ (long)var3_4 ^ -7158056277280131727L);
                    var4_5 = Integer.reverse(Integer.reverse(var3_4 - 2131381642));
                    var5_3 -= 2;
                    continue block75;
                }
                case 1256100616: {
                    (Integer.rotateLeft(806366580 ^ var3_4, 9) - -699195321) * 806366581;
                    var4_5 = var3_4 - 811216249;
                    (Integer.rotateLeft(-1654636164 ^ var3_4, 6) - 319130943) * -1654636163;
                    var4_5 = (int)((long)(var3_4 - 2131381642) ^ 4342242225792657909L ^ 4342242225792657909L);
                    ++var5_3;
                    continue block75;
                }
                case 1895940869: {
                    (Integer.rotateLeft(-1569949187 ^ var3_4, 7) - -1350540066) * -1569949187;
                    (int)(6980253692772805455L ^ (long)var3_4 ^ 5976420853980163180L);
                    var4_5 = var3_4 - 2131381642 + -1982244878 - -1982244878;
                    (Integer.rotateRight(-155409509 ^ var3_4, 17) + -449483008) * -155409509;
                    var5_3 += 2;
                    continue block75;
                }
                case 326290677: {
                    return var2_2;
                }
            }
            Integer.rotateRight(-874307954 ^ var3_4, 12) - -1260498323;
            var4_5 = Integer.reverse(Integer.reverse(var3_4 - 2131381642));
        }
    }

    private void zdq_3() {
        int n = -1129915385;
        n = Integer.rotateLeft(n * 654708327, 27) ^ 0x9A84868A;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xC308E86A;
        if ((n2 ^ n) != -1022826390) {
            int cfr_ignored_0 = (0x7FAE346D ^ n) + -681207722;
        }
        JsonObject jsonObject = new JsonObject();
        td_3.asha_2(jsonObject, td_3.thht_2("咐㌮鯎戒쪻全㦆", td_3.tdf_3(1559820985) ^ 0x36ACA97B, -49104866 - -2090963717, Integer.rotateLeft(0xE7083E08 ^ 0x99F8B80E, 15)), 1);
        jsonObject.addProperty("savedAt", (Number)td_3.tysh());
        JsonArray jsonArray = new JsonArray();
        for (ty ty2 : this.sshb.values()) {
            jsonArray.add((JsonElement)ty2.hhkh());
        }
        jsonObject.add("slots", (JsonElement)jsonArray);
        try {
            Files.createDirectories(this.drd_2.getParent(), new FileAttribute[0]);
            Files.writeString(this.drd_2, (CharSequence)thdth_2.toJson((JsonElement)jsonObject), new OpenOption[0]);
        }
        catch (IOException iOException) {
            bzh_4.dhght_2((class_2561)class_2561.method_43470((String)"Failed to save inventory layout file."));
            iOException.printStackTrace();
        }
    }

    private void dhf_2(boolean bl) {
        int n = 1092011962;
        n = Integer.rotateLeft(n * 1394369285, 14) ^ 0x975F3398;
        n = System.identityHashCode(this) ^ n;
        int n2 = (n = Integer.rotateLeft(bl ^ n, 20)) ^ 0x3A5BE40B;
        if ((n2 ^ n) != 979100683) {
            int cfr_ignored_0 = (0x7B4D23B1 ^ n) - -1785326082;
        }
        if (!Files.exists(this.drd_2, new LinkOption[0])) {
            return;
        }
        try {
            JsonObject jsonObject = (JsonObject)thdth_2.fromJson(Files.readString(this.drd_2), JsonObject.class);
            if (jsonObject == null || !jsonObject.has("slots")) {
                return;
            }
            this.sshb.clear();
            JsonArray jsonArray = jsonObject.getAsJsonArray("slots");
            for (int i = 0; i < jsonArray.size(); ++i) {
                ty ty2 = ty.azf(jsonArray.get(i).getAsJsonObject());
                if (ty2 == null) continue;
                this.sshb.put(ty2.thqa_2, ty2);
            }
            if (bl) {
                bzh_4.ttht_3((class_2561)class_2561.method_43470((String)"Inventory layout loaded from file."));
            }
        }
        catch (Exception exception) {
            if (bl) {
                bzh_4.dhght_2((class_2561)class_2561.method_43470((String)"Failed to load inv".concat("entory layout file.")));
            }
            exception.printStackTrace();
        }
    }

    private void bygh(btt btt2) {
        boolean bl;
        boolean bl2;
        int n = 2041765843;
        int n2 = (n = Integer.rotateLeft(n * -1853449087, 5) ^ 0x3F8379B7) ^ 0xC254FF14;
        if ((n2 ^ n) != -1034617068) {
            int cfr_ignored_0 = (0xBBE620C7 ^ n) - 295134349;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (td_3.mc.field_1724 == null) {
            return;
        }
        boolean bl3 = bl2 = this.thsdh.sdhkh() != -1 && brz.rzdh(this.thsdh.sdhkh());
        if (bl2 && !this.dhrl) {
            this.dzgh_2();
        }
        this.dhrl = bl2;
        boolean bl4 = bl = this.tzy.sdhkh() != -1 && brz.rzdh(this.tzy.sdhkh());
        if (bl && !this.ztj) {
            this.jwd_2();
        }
        this.ztj = bl;
        if (this.ghl) {
            this.dndh();
        }
    }

    private boolean shad_4() {
        int n = 202612379;
        int n2 = (n = Integer.rotateLeft(n * -1203357687, 15) ^ 0x6B265680) ^ 0x42C0B53A;
        if ((n2 ^ n) != 1119925562) {
            int cfr_ignored_0 = (0x4ED32BA1 ^ n) - -286734160;
        }
        return !this.zzkh.shghkh();
    }

    private boolean dhghk() {
        int n = h_2.shjs_2(1154692919);
        int n2 = n ^ 0x1D3B36C4;
        if ((n2 ^ n) != 490419908) {
            int cfr_ignored_0 = (Integer.rotateRight(0x59E801F3 ^ n, 14) + -411706456) * 1508377075;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return !this.zzkh.shghkh();
    }

    private boolean htm() {
        int n = 805327841;
        n = Integer.rotateLeft(n * -1225254779, 14) ^ 0xBD6DE17D;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x53EED825;
        if ((n2 ^ n) != 1408161829) {
            int cfr_ignored_0 = (0x63EE8BC4 ^ n) + 2109055481;
        }
        return !this.thaj_2.shghkh();
    }

    private static String thht_2(String string, int n, int n2, int n3) {
        int n4 = h_2.shjs_2(-614968202);
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 6);
        int n5 = (n4 = Integer.rotateLeft(n ^ n4, 15)) ^ 0x1952D4A1;
        if ((n5 ^ n4) != 424858785) {
            int cfr_ignored_0 = (Integer.rotateRight(0xC20A80D7 ^ n4, 11) - -2086454972) * -1039499049;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x37F1D7BF ^ n2 ^ i * 1511010511 ^ sshk, 7) ^ dhthb));
        }
        return new String(cArray);
    }

    private static List khfkh(td_3 td2) {
        block0: {
            int n = -767145304;
            n = Integer.rotateLeft(n * 640742401, 4) ^ 0x69E00CA5;
            td_3 td3 = td2;
            n = Integer.rotateLeft((td3 != null ? System.identityHashCode(td3) : 0) ^ n, 10);
            int n2 = n ^ 0xA4EC71F0;
            if ((n2 ^ n) == -1528008208) break block0;
            int cfr_ignored_0 = (0x76AA3B58 ^ n) - 229356461;
        }
        return td2.tghb_2();
    }

    private static int raz_3(Integer n) {
        block0: {
            int n2 = -1678441037;
            n2 = Integer.rotateLeft(n2 * 805997371, 12) ^ 0xFB2F5000;
            Integer n3 = n;
            n2 = (n3 != null ? System.identityHashCode(n3) : 0) ^ n2;
            int n4 = n2 ^ 0x686603DB;
            if ((n4 ^ n2) == 1751516123) break block0;
            int cfr_ignored_0 = (0xF3930668 ^ n2) - 1020904978;
        }
        return n;
    }

    private static void twgh(td_3 td2) {
        int n = 1862701783;
        n = Integer.rotateLeft(n * 2061453923, 5) ^ 0xA26EF71D;
        td_3 td3 = td2;
        n = (td3 != null ? System.identityHashCode(td3) : 0) ^ n;
        int n2 = n ^ 0x330F6BD9;
        if ((n2 ^ n) != 856648665) {
            int cfr_ignored_0 = (0x5C09F90E ^ n) - -1872853184;
        }
        td2.zdq_3();
    }

    private static void tksh(class_2561 class_25612) {
        int n = -497494247;
        int n2 = (n = Integer.rotateLeft(n * -887600127, 3) ^ 0x84F5C4E4) ^ 0x66908B60;
        if ((n2 ^ n) != 1720748896) {
            int cfr_ignored_0 = (0x84C85C79 ^ n) + 667598814;
        }
        bzh_4.ttht_3(class_25612);
    }

    private static String hdd(String string, int n, int n2, int n3) {
        block0: {
            int n4 = h_2.shjs_2(1248218267);
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 22);
            int n5 = (n4 = n ^ n4) ^ 0xEE331CCC;
            if ((n5 ^ n4) == -298640180) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xA4555057 ^ n4, 7) - -357410364) * -1537912745;
        }
        return td_3.thht_2(string, n, n2, n3);
    }

    private static class_5250 dakh_3(String string) {
        block0: {
            int n = h_2.shjs_2(-1662805934);
            int n2 = n ^ 0xE936FAB5;
            if ((n2 ^ n) == -382272843) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x75D562E7 ^ n, 17) - 0x49349934;
        }
        return class_2561.method_43470((String)string);
    }

    private static void dtdh_2(class_2561 class_25612) {
        int n = 1320460907;
        int n2 = (n = Integer.rotateLeft(n * 210981503, 9) ^ 0x14348C05) ^ 0x95B58140;
        if ((n2 ^ n) != -1783267008) {
            int cfr_ignored_0 = (0xDB01232B ^ n) - 606323803;
        }
        bzh_4.rkt(class_25612);
    }

    private static int skhq_2(int n, int n2) {
        block0: {
            int n3 = h_2.shjs_2(-2142413988);
            int n4 = (n3 = n ^ n3) ^ 0xCE93EF28;
            if ((n4 ^ n3) == -829165784) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x4EDEB474 ^ n3, 12) - -1856669369) * 1323218037;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String shts_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = h_2.shjs_2(-687923757);
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 18);
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 26)) ^ 0xC4CDAE48;
            if ((n5 ^ n4) == -993153464) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x1232B39B ^ n4, 5) + 948002560) * 305312667;
        }
        return td_3.thht_2(string, n, n2, n3);
    }

    private static List khbd(td_3 td2) {
        block0: {
            int n = 1586470364;
            n = Integer.rotateLeft(n * 1085352313, 22) ^ 0x6565DA61;
            td_3 td3 = td2;
            n = (td3 != null ? System.identityHashCode(td3) : 0) ^ n;
            int n2 = n ^ 0x4F389E46;
            if ((n2 ^ n) == 1329110598) break block0;
            int cfr_ignored_0 = (0x11B7039A ^ n) - 501317537;
        }
        return td2.tghb_2();
    }

    private static boolean dny(ty ty2) {
        block0: {
            int n = h_2.shjs_2(-398009733);
            int n2 = n ^ 0xB838229A;
            if ((n2 ^ n) == -1204280678) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x507EF8E1 ^ n, 13) + -1010974086;
            int cfr_ignored_1 = (int)(0x92CC56DC27D4EB4FL ^ (long)n ^ 0x50C8831A2DB88849L);
        }
        return ty2.taq_4();
    }

    private static boolean dhs_9(td_3 td2, class_1799 class_17992) {
        block0: {
            int n = 1380855276;
            n = Integer.rotateLeft(n * 2017955717, 28) ^ 0xF2B4BFAD;
            td_3 td3 = td2;
            n = Integer.rotateLeft((td3 != null ? System.identityHashCode(td3) : 0) ^ n, 9);
            class_1799 class_17993 = class_17992;
            n = Integer.rotateLeft((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 22);
            int n2 = n ^ 0x82FF9DDA;
            if ((n2 ^ n) == -2097177126) break block0;
            int cfr_ignored_0 = (0xD0B1B036 ^ n) + -839615309;
        }
        return td2.adq_2(class_17992);
    }

    private static class_1799 dthz_2(td_3 td2, int n) {
        block0: {
            int n2 = h_2.shjs_2(168531526);
            td_3 td3 = td2;
            n2 = (td3 != null ? System.identityHashCode(td3) : 0) ^ n2;
            int n3 = n2 ^ 0x275C553F;
            if ((n3 ^ n2) == 660362559) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x2D57C379 ^ n2, 8) + -2114041118) * 760726393;
            int cfr_ignored_1 = (int)(0xEFE56D4427D4EB4FL ^ (long)n2 ^ 0x27F8831A2DB8721BL);
        }
        return td2.trr(n);
    }

    private static boolean ssth(td_3 td2, int n) {
        block0: {
            int n2 = h_2.shjs_2(2039892024);
            int n3 = n2 ^ 0x78BD3737;
            if ((n3 ^ n2) == 2025666359) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x12B7F0F ^ n2, 3) - 681705996;
        }
        return td2.ddhth_2(n);
    }

    private static boolean shshm(ty ty2, class_1799 class_17992, boolean bl) {
        block0: {
            int n = h_2.shjs_2(886809010);
            class_1799 class_17993 = class_17992;
            n = Integer.rotateLeft((class_17993 != null ? System.identityHashCode(class_17993) : 0) ^ n, 28);
            int n2 = (n = Integer.rotateLeft(bl ^ n, 19)) ^ 0x21F0545A;
            if ((n2 ^ n) == 569398362) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x152BF5E8 ^ n, 5) + -1800378797;
        }
        return ty2.arz_2(class_17992, bl);
    }

    private static boolean dds_6(badh_2 badh2) {
        block0: {
            int n = 801036692;
            n = Integer.rotateLeft(n * 902447083, 24) ^ 0x1D533E3D;
            badh_2 badh3 = badh2;
            n = Integer.rotateRight((badh3 != null ? System.identityHashCode(badh3) : 0) ^ n, 17);
            int n2 = n ^ 0x4B3FF1E5;
            if ((n2 ^ n) == 1262481893) break block0;
            int cfr_ignored_0 = (0x64812871 ^ n) + -1419987829;
        }
        return badh2.shzl();
    }

    private static boolean khadh(ty ty2, class_1799 class_17992, boolean bl) {
        block0: {
            int n = 614089983;
            int n2 = (n = Integer.rotateLeft(n * -1893852047, 14) ^ 0x957B1E89) ^ 0x7CB4F9A8;
            if ((n2 ^ n) == 2092235176) break block0;
            int cfr_ignored_0 = (0x582EBD57 ^ n) - 410862885;
        }
        return ty2.arz_2(class_17992, bl);
    }

    private static boolean thqh(fy fy2) {
        block0: {
            int n = h_2.shjs_2(1358609812);
            int n2 = n ^ 0x205E0998;
            if ((n2 ^ n) == 543033752) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x70A4B40C ^ n, 17) - -1471189841;
        }
        return fy2.shghkh();
    }

    private static Integer ghdkh(int n) {
        block0: {
            int n2 = -1200242323;
            n2 = Integer.rotateLeft(n2 * -758567511, 6) ^ 0xC4973962;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 24)) ^ 0x7C0ADD7C;
            if ((n3 ^ n2) == 2081086844) break block0;
            int cfr_ignored_0 = (0xC47F1C11 ^ n2) - 1924831668;
        }
        return n;
    }

    private static void hd_2(class_636 class_6362, int n, int n2, int n3, class_1713 class_17132, class_1657 class_16572) {
        int n4 = 201900775;
        n4 = Integer.rotateLeft(n4 * 988898227, 11) ^ 0x36AE54C2;
        n4 = n ^ n4;
        class_1713 class_17133 = class_17132;
        n4 = Integer.rotateRight((class_17133 != null ? System.identityHashCode(class_17133) : 0) ^ n4, 9);
        int n5 = n4 ^ 0xE5B8B86A;
        if ((n5 ^ n4) != -440878998) {
            int cfr_ignored_0 = (0xE9B07A8D ^ n4) + -1564693360;
        }
        class_6362.method_2906(n, n2, n3, class_17132, class_16572);
    }

    private static void shkhs() {
        int n = -394689605;
        int n2 = (n = Integer.rotateLeft(n * 2105279729, 28) ^ 0xF6CC049F) ^ 0xBFC1F3BE;
        if ((n2 ^ n) != -1077808194) {
            int cfr_ignored_0 = (0x57B87005 ^ n) + -1068999281;
        }
        yf.athz_2();
    }

    private static class_1735 rys(class_1723 class_17232, int n) {
        block0: {
            int n2 = h_2.shjs_2(698017638);
            class_1723 class_17233 = class_17232;
            n2 = Integer.rotateLeft((class_17233 != null ? System.identityHashCode(class_17233) : 0) ^ n2, 22);
            int n3 = n2 ^ 0x207016B1;
            if ((n3 ^ n2) == 544216753) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x9EAF1D7 ^ n2, 4) - 936437828) * 166392279;
        }
        return class_17232.method_7611(n);
    }

    private static Integer thkhm(int n) {
        block0: {
            int n2 = 754129604;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1414616647, 5) ^ 0xC42C7B24) ^ 0x1B7B1F0;
            if ((n3 ^ n2) == 28815856) break block0;
            int cfr_ignored_0 = (0x2D44AB34 ^ n2) - -1360635678;
        }
        return n;
    }

    private static String tkhh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1771422042;
            n4 = Integer.rotateLeft(n4 * 2015187273, 5) ^ 0x3B356AA0;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 14);
            int n5 = n4 ^ 0x5B59F2B6;
            if ((n5 ^ n4) == 1532621494) break block0;
            int cfr_ignored_0 = (0x32CC33EC ^ n4) - 1026019800;
        }
        return td_3.thht_2(string, n, n2, n3);
    }

    private static void dhh_7(class_2561 class_25612) {
        int n = -1409277751;
        n = Integer.rotateLeft(n * -1213485183, 10) ^ 0x5285F705;
        class_2561 class_25613 = class_25612;
        n = (class_25613 != null ? System.identityHashCode(class_25613) : 0) ^ n;
        int n2 = n ^ 0x78BAA901;
        if ((n2 ^ n) != 2025498881) {
            int cfr_ignored_0 = (0xD4BA89C8 ^ n) + 2085827141;
        }
        bzh_4.rkt(class_25612);
    }

    private static int bfm(int n) {
        block0: {
            int n2 = 181650735;
            n2 = Integer.rotateLeft(n2 * -2126817501, 12) ^ 0x395784CB;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 10)) ^ 0x29DF2D25;
            if ((n3 ^ n2) == 702491941) break block0;
            int cfr_ignored_0 = (0x230CE80A ^ n2) - -1708042351;
        }
        return Integer.reverse(n);
    }

    private static class_5250 tnb(String string) {
        block0: {
            int n = -100155883;
            int n2 = (n = Integer.rotateLeft(n * 1158071423, 19) ^ 0xFE231F9E) ^ 0x780A9254;
            if ((n2 ^ n) == 2013958740) break block0;
            int cfr_ignored_0 = (0x820D2C41 ^ n) + -523644174;
        }
        return class_2561.method_43470((String)string);
    }

    private static int shmsh(int n) {
        block0: {
            int n2 = 1949175836;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1770213043, 14) ^ 0xF8087965) ^ 0x598F44B;
            if ((n3 ^ n2) == 93910091) break block0;
            int cfr_ignored_0 = (0x71B6E457 ^ n2) - 1286722743;
        }
        return Integer.reverse(n);
    }

    private static String sas_7(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -306970154;
            n4 = Integer.rotateLeft(n4 * -2012495167, 23) ^ 0x430D8A28;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0x93E32606;
            if ((n5 ^ n4) == -1813830138) break block0;
            int cfr_ignored_0 = (0x7E5727D0 ^ n4) - 56083948;
        }
        return td_3.thht_2(string, n, n2, n3);
    }

    private static int tdf_3(int n) {
        block0: {
            int n2 = 1280255077;
            n2 = Integer.rotateLeft(n2 * 1395949721, 9) ^ 0xBCA3B1F8;
            int n3 = (n2 = n ^ n2) ^ 0xE6D20A29;
            if ((n3 ^ n2) == -422442455) break block0;
            int cfr_ignored_0 = (0xAA9D2E4C ^ n2) + -214918486;
        }
        return Integer.reverse(n);
    }

    private static void asha_2(JsonObject jsonObject, String string, Number number) {
        int n = 117703836;
        n = Integer.rotateLeft(n * -123080089, 28) ^ 0x80985F02;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 9);
        int n2 = n ^ 0xEAF378EC;
        if ((n2 ^ n) != -353142548) {
            int cfr_ignored_0 = (0xEDF77C70 ^ n) + -484949421;
        }
        jsonObject.addProperty(string, number);
    }

    private static long tysh() {
        block0: {
            int n = -666483578;
            int n2 = (n = Integer.rotateLeft(n * 1133215699, 26) ^ 0x5EC680FA) ^ 0x3D7E3DEB;
            if ((n2 ^ n) == 1031683563) break block0;
            int cfr_ignored_0 = (0xE538796D ^ n) + 1566222100;
        }
        return System.currentTimeMillis();
    }

    private static String[] dbsh_2(String string) {
        int n = -1815758851;
        n = Integer.rotateLeft(n * 126396745, 15) ^ 0x4F6464E7;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 12);
        int n2 = n ^ 0x11C9D6BE;
        if ((n2 ^ n) != 298440382) {
            int cfr_ignored_0 = (0x820C6143 ^ n) + 1056160649;
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

    private static CallSite zyl(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 2129466201;
            n3 = Integer.rotateLeft(n3 * 1482044345, 8) ^ 0xD503DEEB;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            String string3 = string2;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0xB8C981EC;
            if ((n4 ^ n3) != -1194753556) {
                int cfr_ignored_0 = (0xC62492B5 ^ n3) - -1674230379;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ bqt_2 ^ string.hashCode() ^ n2 + shghr + i * 823294661) + bqt_2) ^ shghr));
            }
            String[] stringArray = td_3.dbsh_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] rzffzsxa1(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite kucl6wr7h7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ wbcx27nslr ^ string.hashCode() ^ n2 + xz84rtni + i * -642479165) + wbcx27nslr) ^ xz84rtni));
            }
            String[] stringArray = td_3.rzffzsxa1(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

