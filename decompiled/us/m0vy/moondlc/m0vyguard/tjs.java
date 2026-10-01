/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1937
 *  net.minecraft.class_243
 *  net.minecraft.class_2596
 *  net.minecraft.class_2663
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  org.joml.Matrix4f
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2663;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bthy;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bzw_2;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bghq;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bksh;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.ttsh;
import us.m0vy.moondlc.m0vyguard.tdhd_2;
import us.m0vy.moondlc.m0vyguard.trt_2;
import us.m0vy.moondlc.m0vyguard.tsth;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.zd;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.wkh;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Kill Effects", category=bzw.OTHER, desc="Displays lightning, particle bursts, or a 3D voxel Soul assembling from particles when targets die")
public class tjs
extends bnq {
    private static final Random jfh_2;
    private static final class_2960 rdm;
    private static final class_2960 rjd_2;
    private static final class_2960 t_2;
    private static final float tdht = 16.67f;
    public final khd ssha = new khd(this, "Mode");
    public final fy sthj = new fy(this.ssha, "Particles");
    public final fy thth_5 = new fy(this.ssha, "Lightning");
    public final fy thtgh_2 = new fy(this.ssha, "Soul").rhh_3();
    public final badh_2 dhrz_2 = new badh_2(this, "Trigg".concat("er on Hit")).bts(false);
    public final bzw_2 sys = new bzw_2(this, "Color 1").dhshy(new byq(Float.intBitsToFloat(Integer.rotateLeft(0x1E10395B ^ 0x1E14165B, 12)), Float.intBitsToFloat(Integer.rotateLeft(0xA57428B ^ 0xA555B2B, 13)), Float.intBitsToFloat(0x1F1B6559 ^ 0x5C646559), Float.intBitsToFloat(243820841 - -888575703)));
    public final bzw_2 khysh = new bzw_2(this, "Color 2", this::shz_8).dhshy(new byq(Float.intBitsToFloat(Integer.reverse(-1967611659) ^ 0xEC591D51), Float.intBitsToFloat(1566734041 + -442529497), Float.intBitsToFloat(Integer.rotateLeft(0x9F1803B2 ^ 0x9F18854C, 15)), Float.intBitsToFloat(-1394458139 + -1768112613)));
    public final tay shbsh = new tay((hy)this, "Particl".concat("e Size"), this::rfy).shth_7(Float.intBitsToFloat(1640000637 + -631018867)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x7AE5339F ^ 0x7D35339F, 3))).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0xDE489466 ^ 0xD47337B1, 8))).ssd_5(Float.intBitsToFloat(-2056545991 + -1207293610));
    public final tay ght = new tay((hy)this, "Count", this::khna_2).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0xD9826167 ^ 0x998261E3, 23))).dhbs_2(Float.intBitsToFloat(0xB68252F9 ^ 0xF2CA52F9)).rkh_3(Float.intBitsToFloat(-1908044577 + -1285917919)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xE9ADC886 ^ 0xD9ADC988, 22)));
    public final tay dhh_6 = new tay((hy)this, "Lifetime", this::thkhgh).shth_7(Float.intBitsToFloat(0xED2CE81A ^ 0xA964E81A)).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0xA908BF4 ^ 0xD7508BD6, 25))).rkh_3(Float.intBitsToFloat(1395474423 + -275070967)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x41FD4228 ^ 0xE5AD4220, 27)));
    public final tay skw = new tay((hy)this, "Flight D".concat("uration"), this::ghthn).shth_7(Float.intBitsToFloat(0xF99CFD9F ^ 0xC7856405)).dhbs_2(Float.intBitsToFloat(Integer.reverse(559381299) ^ 0xF3F88CE2)).rkh_3(Float.intBitsToFloat(Integer.reverse(-585089852) ^ 0x1E70C876)).ssd_5(Float.intBitsToFloat(Integer.reverse(1067435877) ^ 0x987A6066));
    public final tay jthl = new tay((hy)this, "Sprea".concat("d / Burst"), this::dkw_2).shth_7(Float.intBitsToFloat(Integer.rotateLeft(0xA69BCAAC ^ 0x1ECA2FB2, 13))).dhbs_2(Float.intBitsToFloat(-100874377 + 1149450377)).rkh_3(Float.intBitsToFloat(-172538528 - -1181520298)).ssd_5(Float.intBitsToFloat(1891029155 - 856881561));
    public final tay dhz_6 = new tay((hy)this, "Soul F".concat("loat Speed"), this::smm).shth_7(0.0f).dhbs_2(Float.intBitsToFloat(525665527 - -550173449)).rkh_3(Float.intBitsToFloat(0x895BF109 ^ 0xB4173DC4)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0x468035D0 ^ 0x75B30427, 21)));
    public final tay thas_4 = new tay((hy)this, "Glow Inte".concat("nsity"), this::dhhk).shth_7(Float.intBitsToFloat(Integer.reverse(168393281) ^ 0xBF925C9D)).dhbs_2(2.0f).rkh_3(Float.intBitsToFloat(0x2946869E ^ 0x148A4A53)).ssd_5(Float.intBitsToFloat(Integer.rotateLeft(0xAF0E921 ^ 0x39B70A12, 11)));
    public final badh_2 htr = new badh_2((hy)this, "Gravity", this::jzw_2).bts(true);
    private final List thsa = new CopyOnWriteArrayList();
    private final List jdhgh = new CopyOnWriteArrayList();
    private final List jbn = new CopyOnWriteArrayList();
    private final wkh trd = new wkh(rdm);
    private final wkh jsd_2 = new wkh(rjd_2);
    private final wkh stw = new wkh(t_2);
    private final Int2LongOpenHashMap mq = new Int2LongOpenHashMap();
    private final bql<bthy> shbkh = this::rnh;
    private final bql<bghq> rry = this::al;
    private final bql<bksh> jsd_4 = this::mj;
    private final bql<btt> rsd = this::zad;
    private final bql<shw_3> bqf = this::dht_2;
    private static final int btd_3 = 345006385;
    private static final int hwt_2 = 1378776290;
    private static final int sath_3 = -1104095097;
    private static final int sqgh = 1854774640;
    private static final int hbxqsrg8yy0 = -1781762702;
    private static final int dsu039q = 1790606815;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int bquvaj6kj47z;

    @Override
    public void nc() {
        int n = -1020690664;
        int n2 = (n = Integer.rotateLeft(n * 1389826361, 13) ^ 0x58AD40BF) ^ 0x3692018C;
        if ((n2 ^ n) != 915538316) {
            int cfr_ignored_0 = (0xF5BB7E94 ^ n) - 13986741;
        }
        this.thsa.clear();
        this.jdhgh.clear();
        this.jbn.clear();
        this.mq.clear();
    }

    private void dab_2(class_1309 class_13092) {
        int n;
        try {
            int n2 = -802547069;
            n2 = Integer.rotateLeft(n2 * -1992001279, 27) ^ 0x33CF2A3D;
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 16);
            int n3 = n2 ^ 0xA9D44ADB;
            if ((n3 ^ n2) != -1445704997) {
                int cfr_ignored_0 = (0x79FE5058 ^ n2) - 357486405;
            }
            if ((0x193 & 0) != 0) {
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
        if (class_13092 == null || class_13092 == tjs.mc.field_1724) {
            return;
        }
        long l = System.currentTimeMillis();
        if (l - this.mq.getOrDefault(n = tjs.rzt_3(class_13092), 0L) < (0xF915ABAF7F8FFA4AL ^ 0xF915ABAF7F8FFD9AL)) {
            return;
        }
        this.mq.put(n, l);
        byq byq2 = tjs.rad_3(this.sys);
        byq byq3 = this.khysh.sdsh_4();
        if (this.ssha.skhth(this.thtgh_2)) {
            this.ab(class_13092, byq2, byq3);
        } else if (tjs.zghf_2(this.ssha, this.sthj)) {
            tjs.thnd(this, class_13092, byq2);
        } else if (tjs.swa_2(this.ssha, this.thth_5)) {
            tjs.tkhgh(this, class_13092, byq2);
        }
    }

    private static List hsd_4(class_1309 class_13092) {
        int n = -1289958098;
        n = Integer.rotateLeft(n * 282699247, 21) ^ 0x24A151E9;
        class_1309 class_13093 = class_13092;
        n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
        int n2 = n ^ 0x55DE9938;
        if ((n2 ^ n) != 1440651576) {
            int cfr_ignored_0 = (0xE6C25416 ^ n) - -1354384648;
        }
        ArrayList<tsth> arrayList = new ArrayList<tsth>();
        String string = tjs.thm_5(tjs.trd_2(class_13092)).toLowerCase();
        float f = tjs.trq(class_13092);
        float f2 = class_13092.method_17681();
        if (class_13092 instanceof class_1657 || string.contains("player")) {
            float f3;
            float f4 = Float.intBitsToFloat(Integer.rotateLeft(0x88266B2E ^ 0x882668DE, 20));
            float f5 = Float.intBitsToFloat(Integer.reverse(1739548414) ^ 0x4066F5E6);
            float f6 = Float.intBitsToFloat(-700175098 + 1761334010);
            float f7 = tjs.shj_4(-683379287 + 1731955287);
            float f8 = Float.intBitsToFloat(1134556903 + -85980903);
            float f9 = f3 = Float.intBitsToFloat(-1234561048 - 1999247336);
            float f10 = f9 + f6;
            float f11 = f10 + f4;
            arrayList.add(new tsth(-f4 / 2.0f, f10, -f4 / 2.0f, f4 / 2.0f, f11, f4 / 2.0f, Float.intBitsToFloat(Integer.rotateLeft(0x7907A5F7 ^ 0xB07A5E7, 26))));
            arrayList.add(new tsth(-f5 / 2.0f, f9, -f7 / 2.0f, f5 / 2.0f, f10, f7 / 2.0f, Float.intBitsToFloat(Integer.rotateLeft(0x16BD756 ^ 0x16BF7AE, 17))));
            arrayList.add(new tsth(f5 / 2.0f, f9, -f7 / 2.0f, f5 / 2.0f + f8, f10, f7 / 2.0f, Float.intBitsToFloat(0x9652C043 ^ 0xD7D2C043)));
            arrayList.add(new tsth(-f5 / 2.0f - f8, f9, -f7 / 2.0f, -f5 / 2.0f, f10, f7 / 2.0f, tjs.zqw_2(0x9561C949 ^ 0xD4E1C949)));
            arrayList.add(new tsth(Float.intBitsToFloat(Integer.rotateLeft(0x87A8A00B ^ 0x3D95D0A8, 28)), 0.0f, -f7 / 2.0f, f5 / 2.0f, f9, f7 / 2.0f, Float.intBitsToFloat(Integer.rotateLeft(0x2463470F ^ 0x246367BF, 17))));
            arrayList.add(new tsth(-f5 / 2.0f, 0.0f, -f7 / 2.0f, Float.intBitsToFloat(-95796896 - 1051093590), f9, f7 / 2.0f, Float.intBitsToFloat(0xA77AC8E6 ^ 0xE61AC8E6)));
            return arrayList;
        }
        float f12 = Math.max(Float.intBitsToFloat(468963003 + 582968440), f / Float.intBitsToFloat(0x1E7D0AF2 ^ 0x21849368));
        if (string.contains("zombie") || string.contains("drowned") || string.contains("husk")) {
            float f13;
            float f14 = Float.intBitsToFloat(Integer.reverse(-1242210320) ^ 0x30FAAFAD) * f12;
            float f15 = Float.intBitsToFloat(-221158327 - -1278122935) * f12;
            float f16 = Float.intBitsToFloat(Integer.rotateLeft(0x5F03242A ^ 0x5F033B8A, 17)) * f12;
            float f17 = Float.intBitsToFloat(tjs.shl_5(0x9D23173D ^ 0x7523173E, 28)) * f12;
            float f18 = Float.intBitsToFloat(0x130D091 ^ 0x3F51973F) * f12;
            float f19 = tjs.zyz_3(-114801361 - -1172604830) * f12;
            float f20 = f13 = Float.intBitsToFloat(-295229782 - -1356388694) * f12;
            float f21 = f20 + f16;
            float f22 = f21 + f14;
            arrayList.add(new tsth(-f14 / 2.0f, f21, -f14 / 2.0f, f14 / 2.0f, f22, f14 / 2.0f, Float.intBitsToFloat(Integer.reverse(2044062699) ^ 0x961FAB9E)));
            arrayList.add(new tsth(-f15 / 2.0f, f20, -f17 / 2.0f, f15 / 2.0f, f21, f17 / 2.0f, Float.intBitsToFloat(Integer.rotateLeft(0xB3F72E19 ^ 0xB3F52199, 13))));
            arrayList.add(new tsth(f15 / 2.0f, f21 - f18, -f17 / 2.0f, f15 / 2.0f + f18, f21, f19, Float.intBitsToFloat(0xE1648479 ^ 0xA0F48479)));
            arrayList.add(new tsth(-f15 / 2.0f - f18, f21 - f18, -f17 / 2.0f, -f15 / 2.0f, f21, f19, Float.intBitsToFloat(-2008765660 + -1186245412)));
            arrayList.add(new tsth(Float.intBitsToFloat(0x83BC64F0 ^ 0xB81FB3FA), 0.0f, -f17 / 2.0f, f15 / 2.0f, f20, f17 / 2.0f, Float.intBitsToFloat(1543420524 - 446610028)));
            arrayList.add(new tsth(-f15 / 2.0f, 0.0f, -f17 / 2.0f, Float.intBitsToFloat(-1041892204 + -104998282), f20, f17 / 2.0f, tjs.dhath_2(0xAD2A6AD8 ^ 0xEC4A6AD8)));
        } else if (string.contains("enderman")) {
            float f23 = Float.intBitsToFloat(0x6D47C45A ^ 0x5247C45A);
            float f24 = Float.intBitsToFloat(1858619246 - 789491156);
            float f25 = Float.intBitsToFloat(-849629320 + 1914143675);
            arrayList.add(new tsth(-f23 / 2.0f, f - f23, -f23 / 2.0f, f23 / 2.0f, f, f23 / 2.0f, Float.intBitsToFloat(Integer.reverse(-661875286) ^ 0x1409311B)));
            arrayList.add(new tsth(Float.intBitsToFloat(0x9B0C2F4D ^ 0x258C2F4D), f24, tjs.ght_2(Integer.reverse(-360510009) ^ 0x5DB0C157), Float.intBitsToFloat(Integer.rotateLeft(0x2F30AF07 ^ 0xFF30AF00, 27)), f24 + f25, Float.intBitsToFloat(0xAC2B0875 ^ 0x922B0875), tjs.rkm(-1857410364 - 1333930692)));
            arrayList.add(new tsth(tjs.ddsh_2(Integer.rotateLeft(0x42BA8AB1 ^ 0x42BA95F1, 17)), tjs.jtr_2(1044390456 - -7540987), Float.intBitsToFloat(-1052931588 - 57720111), tjs.khthw(1752086518 + -699148442), f24 + f25, tjs.zkhd(Integer.reverse(131582727) ^ 0xDD1F272D), Float.intBitsToFloat(tjs.qr(-1046483091) ^ 0xF767F983)));
            arrayList.add(new tsth(Float.intBitsToFloat(-409664299 - 684881273), tjs.thghkh(0x44A790FB ^ 0x7A14A3C8), Float.intBitsToFloat(tjs.khdw(0x4B314212 ^ 0xD286FB8B, 11)), tjs.khdz(Integer.rotateLeft(0xE1148E8 ^ 0xE0698E8, 11)), f24 + f25, Float.intBitsToFloat(169155587 + 867676362), Float.intBitsToFloat(Integer.reverse(940511932) ^ 0x7CD8F01C)));
            arrayList.add(new tsth(Float.intBitsToFloat(923358891 - -102400095), 0.0f, Float.intBitsToFloat(-350183297 - 760468402), tjs.ghthw(0x8050101D ^ 0xBE1CDCD0), f24, Float.intBitsToFloat(Integer.rotateLeft(0x8A25E819 ^ 0xB916DCEE, 22)), Float.intBitsToFloat(Integer.rotateLeft(0x20FACF8F ^ 0x20FACB98, 20))));
            arrayList.add(new tsth(tjs.dak_4(-1857817267 - -755554176), 0.0f, tjs.ghbh_2(0xDC900138 ^ 0x615CCDF5), Float.intBitsToFloat(-1211500535 - -89775873), f24, tjs.bdhj(tjs.shfa(-1899887616) ^ 0x3DEC8FBC), Float.intBitsToFloat(0x93BA73CF ^ 0xD2CA73CF)));
        } else if (string.contains("creeper")) {
            float f26 = Float.intBitsToFloat(-5798666 - -1062763274) * f12;
            float f27 = Float.intBitsToFloat(1400262645 + -343298037) * f12;
            float f28 = Float.intBitsToFloat(0x4621DD36 ^ 0x7961DD36) * f12;
            float f29 = Float.intBitsToFloat(Integer.reverse(-614002549) ^ 0xEF88E6DB) * f12;
            float f30 = Float.intBitsToFloat(-1588534502 + -1653494718) * f12;
            float f31 = Float.intBitsToFloat(Integer.rotateLeft(0xC46F94C9 ^ 0x3E6F94C9, 30)) * f12;
            float f32 = f30 + f28;
            float f33 = f32 + f26;
            arrayList.add(new tsth(-f26 / 2.0f, f32, -f26 / 2.0f, f26 / 2.0f, f33, f26 / 2.0f, Float.intBitsToFloat(399841880 - -706405800)));
            arrayList.add(new tsth(-f27 / 2.0f, f30, -f29 / 2.0f, f27 / 2.0f, f32, f29 / 2.0f, Float.intBitsToFloat(0x9E560778 ^ 0xDC5A0778)));
            arrayList.add(new tsth(Float.intBitsToFloat(Integer.reverse(-1678641649) ^ 0xCD234314) * f12, 0.0f, Float.intBitsToFloat(0xA92C2E9C ^ 0x972C2E9C) * f12, Float.intBitsToFloat(Integer.rotateLeft(0x7E2F1FC8 ^ 0xAAE3D31B, 28)) * f12 + f31, f30, Float.intBitsToFloat(-573583126 + 1613770518) * f12 + f31, Float.intBitsToFloat(1976089468 - 883473276)));
            arrayList.add(new tsth(Float.intBitsToFloat(Integer.reverse(1054862122) ^ 0xE99B37B1) * f12 - f31, 0.0f, Float.intBitsToFloat(Integer.rotateLeft(0x8378FB5D ^ 0x378FB52, 26)) * f12, Float.intBitsToFloat(-1570423893 + 451383586) * f12, f30, Float.intBitsToFloat(Integer.reverse(1305530175) ^ 0xC2F30BB2) * f12 + f31, Float.intBitsToFloat(Integer.reverse(-324251650) ^ 0x3ED23537)));
            arrayList.add(new tsth(Float.intBitsToFloat(Integer.rotateLeft(0x5CA86AA2 ^ 0x6FE73991, 10)) * f12, 0.0f, Float.intBitsToFloat(Integer.rotateLeft(0xD0BAE075 ^ 0x10BAE062, 27)) * f12 - f31, Float.intBitsToFloat(532810856 + 495632485) * f12 + f31, f30, Float.intBitsToFloat(-381946679 + -725349577) * f12, Float.intBitsToFloat(Integer.reverse(1253873709) ^ 0xF5393D52)));
            arrayList.add(new tsth(Float.intBitsToFloat(0x3BE7A361 ^ 0x86AB6FAC) * f12 - f31, 0.0f, Float.intBitsToFloat(877711081 + -1985007337) * f12 - f31, Float.intBitsToFloat(0xBFAFC3E ^ 0xB6B630F3) * f12, f30, Float.intBitsToFloat(0x38856543 ^ 0x86856543) * f12, Float.intBitsToFloat(-1968807242 + -1233543862)));
        } else if (string.contains("spider") || string.contains("silverfish") || string.contains("endermite")) {
            float f34 = Math.max(Float.intBitsToFloat(0xC604D800 ^ 0xF8C814CD), f2 / Float.intBitsToFloat(Integer.reverse(-1574137299) ^ 0x8BFA0776));
            float f35 = Float.intBitsToFloat(Integer.rotateLeft(0xECE4FEB ^ 0xF5C4729B, 30)) * f34;
            float f36 = Float.intBitsToFloat(Integer.reverse(-1934802291) ^ 0x8E42B531) * f34;
            float f37 = Float.intBitsToFloat(0x58374D12 ^ 0x66F5C24E) * f34;
            float f38 = Float.intBitsToFloat(928437507 - -132721405) * f34;
            float f39 = Float.intBitsToFloat(Integer.rotateLeft(0x2A14AF17 ^ 0x2A145317, 14)) * f34;
            float f40 = Float.intBitsToFloat(-2121775125 + -1112033259) * f34;
            arrayList.add(new tsth(-f36 / 2.0f, f35, Float.intBitsToFloat(Integer.rotateLeft(0x42507589 ^ 0xA317C571, 22)) * f34, f36 / 2.0f, f35 + f36, Float.intBitsToFloat(-918194143 - -1962072523) * f34 + f36, Float.intBitsToFloat(-439998362 + 1541003162)));
            arrayList.add(new tsth(-f37 / 2.0f, f35, Float.intBitsToFloat(1748702697 + 1442659331) * f34, f37 / 2.0f, f35 + f37, Float.intBitsToFloat(Integer.reverse(-1243528034) ^ 0x471AD641) * f34, Float.intBitsToFloat(-1077193106 - 2119915118)));
            arrayList.add(new tsth(-f38 / 2.0f, f35, Float.intBitsToFloat(1983220021 - -1208142007) * f34 - f40, f38 / 2.0f, f35 + f39, Float.intBitsToFloat(Integer.reverse(-1086924542) ^ 0xFEA33D11) * f34, Float.intBitsToFloat(Integer.rotateLeft(0x95AD7C09 ^ 0x9DECFC09, 3))));
            for (int i = 0; i < 4; ++i) {
                float f41 = (Float.intBitsToFloat(Integer.reverse(281546959) ^ 0xCD44DFC5) - (float)i * Float.intBitsToFloat(506575024 + 535290090)) * f34;
                arrayList.add(new tsth(f37 / 2.0f, 0.0f, f41 - Float.intBitsToFloat(Integer.reverse(1954545544) ^ 0x2CB332E3), f37 / 2.0f + Float.intBitsToFloat(1440437873 - 382634404) * f34, f35 + Float.intBitsToFloat(Integer.rotateLeft(0x83A65475 ^ 0x4F6B4B79, 17)) * f34, f41 + Float.intBitsToFloat(338084362 + 690358979), Float.intBitsToFloat(0x81FC8951 ^ 0xC0FC8951)));
                arrayList.add(new tsth(-f37 / 2.0f - Float.intBitsToFloat(2114573444 + -1056769975) * f34, 0.0f, f41 - Float.intBitsToFloat(0x536E8E58 ^ 0x6E224295), -f37 / 2.0f, f35 + Float.intBitsToFloat(981616929 + 60248185) * f34, f41 + Float.intBitsToFloat(0x52D8E67E ^ 0x6F942AB3), Float.intBitsToFloat(0x5C548EE0 ^ 0x1D548EE0)));
            }
        } else if (string.contains("iron_golem") || string.contains("warden") || string.contains("ravager")) {
            arrayList.add(new tsth(Float.intBitsToFloat(Integer.rotateLeft(0xBC433DAA ^ 0xBC433CD7, 23)), Float.intBitsToFloat(Integer.rotateLeft(0x95C0AFD1 ^ 0xA6F39DD1, 21)), Float.intBitsToFloat(-941785483 - 157122165), Float.intBitsToFloat(0x66EC2219 ^ 0x586C2219), Float.intBitsToFloat(Integer.rotateLeft(0x81081232 ^ 0xB2401701, 11)), Float.intBitsToFloat(Integer.rotateLeft(0xC335A81 ^ 0xC33A081, 14)), Float.intBitsToFloat(Integer.rotateLeft(0x49B84077 ^ 0x99B84057, 25))));
            arrayList.add(new tsth(Float.intBitsToFloat(-1226446113 + 136975649), Float.intBitsToFloat(1879165705 - 810876476), Float.intBitsToFloat(Integer.rotateLeft(0x133B7E93 ^ 0x13398413, 14)), Float.intBitsToFloat(Integer.rotateLeft(0x4770EFBF ^ 0x8370EFB0, 26)), Float.intBitsToFloat(125101888 + 949059366), Float.intBitsToFloat(-1379440862 - 1864853282), Float.intBitsToFloat(Integer.rotateLeft(0xDFAAF54D ^ 0xD7EEF54D, 3))));
            arrayList.add(new tsth(Float.intBitsToFloat(Integer.rotateLeft(0x7F7079B9 ^ 0xF77079A6, 25)), Float.intBitsToFloat(Integer.reverse(14345975) ^ 0xD12B97CD), Float.intBitsToFloat(Integer.rotateLeft(0x5C704580 ^ 0xAE1623ED, 29)), Float.intBitsToFloat(-363028129 - -1425864763), Float.intBitsToFloat(-1669914696 - 1550891346), Float.intBitsToFloat(Integer.rotateLeft(0x58CC2F86 ^ 0xCBFF1CC9, 26)), Float.intBitsToFloat(-2082952314 - 1109961606)));
            arrayList.add(new tsth(Float.intBitsToFloat(Integer.rotateLeft(0x1E824038 ^ 0x471BDA87, 24)), Float.intBitsToFloat(0xED09D0D4 ^ 0xD3451C19), Float.intBitsToFloat(1320752710 + 1871951495), Float.intBitsToFloat(Integer.rotateLeft(0x60217B66 ^ 0x6021C476, 16)), Float.intBitsToFloat(940034343 - -134126911), Float.intBitsToFloat(0x412D7EC1 ^ 0x7F61B20C), Float.intBitsToFloat(Integer.rotateLeft(0x2991B14 ^ 0x12F51B14, 2))));
            arrayList.add(new tsth(Float.intBitsToFloat(0x985684E ^ 0x34F0AAC1), 0.0f, Float.intBitsToFloat(-527819890 - 574443201), Float.intBitsToFloat(-890858212 + 1943796288), Float.intBitsToFloat(0xC793A5E0 ^ 0xF83F692D), Float.intBitsToFloat(0x82C4CDBF ^ 0xBC880172), Float.intBitsToFloat(Integer.rotateLeft(0x7B262CBA ^ 0xFB262EB1, 21))));
            arrayList.add(new tsth(Float.intBitsToFloat(Integer.rotateLeft(0xFEF5B61D ^ 0xF4C8C4E6, 22)), 0.0f, Float.intBitsToFloat(1329508526 - -1863195679), Float.intBitsToFloat(Integer.reverse(897817381) ^ 0x19AC0323), Float.intBitsToFloat(-1377689571 + -1848988496), Float.intBitsToFloat(-671547760 - -1716768317), Float.intBitsToFloat(0x6E97CB3C ^ 0x2FE7CB3C)));
        } else if (string.contains("slime") || string.contains("magma_cube")) {
            float f42 = f2 * Float.intBitsToFloat(Integer.rotateLeft(0xBAA69192 ^ 0xBAA6916E, 22));
            arrayList.add(new tsth(-f42, 0.0f, -f42, f42, f, f42, Float.intBitsToFloat(Integer.rotateLeft(0xC5C1BD17 ^ 0xD1A1BD15, 29))));
            arrayList.add(new tsth(-f42 * Float.intBitsToFloat(0x60F1C28A ^ 0x5FF1C28A), f * Float.intBitsToFloat(1403177631 - 354601631), -f42 * Float.intBitsToFloat(Integer.reverse(-2056183874) ^ 0x42F88EA1), f42 * Float.intBitsToFloat(Integer.rotateLeft(0x89C7CC61 ^ 0x893BCC61, 6)), f * Float.intBitsToFloat(-105236065 - -1166394977), f42 * Float.intBitsToFloat(Integer.reverse(373184927) ^ 0xC69A7C68), Float.intBitsToFloat(Integer.rotateLeft(0x665005B7 ^ 0x762C05B7, 2))));
        } else if (string.contains("cow") || string.contains("pig") || string.contains("sheep") || string.contains("horse") || string.contains("wolf") || string.contains("cat") || string.contains("fox") || string.contains("llama") || string.contains("hoglin") || string.contains("camel") || string.contains("sniffer") || string.contains("panda") || string.contains("polar_bear") || string.contains("goat") || string.contains("rabbit") || string.contains("donkey") || string.contains("mule") || string.contains("strider") || f < f2 * Float.intBitsToFloat(0x8EC7D6DD ^ 0xB161B0BB) && !string.contains("player")) {
            float f43 = Math.max(Float.intBitsToFloat(254356516 + 799252649), f / Float.intBitsToFloat(704982908 + 363725751));
            float f44 = Float.intBitsToFloat(0x7A02A4A6 ^ 0x4522A4A6) * f43;
            float f45 = Float.intBitsToFloat(1497928522 + -438866762) * f43;
            float f46 = 1.0f * f43;
            float f47 = Float.intBitsToFloat(Integer.rotateLeft(0x9446F66E ^ 0xD446F610, 23)) * f43;
            float f48 = Float.intBitsToFloat(0x5CFA78F0 ^ 0x63FA78F0) * f43;
            float f49 = Float.intBitsToFloat(0xF3AC90C7 ^ 0xCD2C90C7) * f43;
            arrayList.add(new tsth(-f44 / 2.0f, f47, -f46 / 2.0f, f44 / 2.0f, f47 + f45, f46 / 2.0f, Float.intBitsToFloat(Integer.reverse(1837784979) ^ 0x8BDA51B6)));
            arrayList.add(new tsth(-f48 / 2.0f, f47 + f45 * Float.intBitsToFloat(Integer.reverse(-857016015) ^ 0xB39F5733), f46 / 2.0f - Float.intBitsToFloat(1837072965 - 800241016) * f43, f48 / 2.0f, f47 + f45 * Float.intBitsToFloat(Integer.reverse(-133661882) ^ 0x5DDE101F) + f48, f46 / 2.0f - Float.intBitsToFloat(-2118127494 + -1140007853) * f43 + f48, Float.intBitsToFloat(-1096584931 + -2094756125)));
            arrayList.add(new tsth(f44 / 2.0f - f49, 0.0f, f46 / 2.0f - f49, f44 / 2.0f, f47, f46 / 2.0f, Float.intBitsToFloat(Integer.reverse(-838219405) ^ 0x8FD39073)));
            arrayList.add(new tsth(-f44 / 2.0f, 0.0f, f46 / 2.0f - f49, -f44 / 2.0f + f49, f47, f46 / 2.0f, Float.intBitsToFloat(-1924459656 + -1275794296)));
            arrayList.add(new tsth(f44 / 2.0f - f49, 0.0f, -f46 / 2.0f, f44 / 2.0f, f47, -f46 / 2.0f + f49, Float.intBitsToFloat(1616388549 + -521675205)));
            arrayList.add(new tsth(-f44 / 2.0f, 0.0f, -f46 / 2.0f, -f44 / 2.0f + f49, f47, -f46 / 2.0f + f49, Float.intBitsToFloat(Integer.rotateLeft(0x57BA3777 ^ 0x57B83D77, 13))));
        } else if (string.contains("bat") || string.contains("phantom") || string.contains("ghast") || string.contains("blaze") || string.contains("bee") || string.contains("dragon") || string.contains("allay") || string.contains("vex") || string.contains("parrot")) {
            arrayList.add(new tsth(-f2 * Float.intBitsToFloat(Integer.reverse(438932755) ^ 0xF6299458), f * Float.intBitsToFloat(Integer.rotateLeft(0xCA3DF0A5 ^ 0xCA3DF151, 21)), -f2 * Float.intBitsToFloat(0x946400D5 ^ 0xAAE400D5), f2 * Float.intBitsToFloat(0x368CD889 ^ 0x80CD889), f * Float.intBitsToFloat(0x4122149E ^ 0x7E62149E), f2 * Float.intBitsToFloat(-147473503 + 1196049503), Float.intBitsToFloat(1725525383 - 617442695)));
            arrayList.add(new tsth(f2 * Float.intBitsToFloat(-1979394640 + -1266996656), f * Float.intBitsToFloat(Integer.rotateLeft(0xD3139651 ^ 0xA8A0FF6, 27)), -f2 * Float.intBitsToFloat(-1201135644 - 2048611095), f2 * Float.intBitsToFloat(1598347688 + -537188776), f * Float.intBitsToFloat(0xD57B2910 ^ 0xEA5D4F76), f2 * Float.intBitsToFloat(-645342848 + 1690563405), Float.intBitsToFloat(Integer.rotateLeft(0x51933014 ^ 0x519371E4, 16))));
            arrayList.add(new tsth(-f2 * Float.intBitsToFloat(-332999427 + 1394158339), f * Float.intBitsToFloat(-1001748963 + 2055358128), -f2 * Float.intBitsToFloat(0xA1E9222D ^ 0x9FA5EEE0), -f2 * Float.intBitsToFloat(Integer.reverse(-463894651) ^ 0x9F619A27), f * Float.intBitsToFloat(Integer.rotateLeft(0x7F93B70A ^ 0x19F5882C, 16)), f2 * Float.intBitsToFloat(-1678119340 + -1571627399), Float.intBitsToFloat(-427357783 - -1533605463)));
        } else {
            float f50;
            float f51 = Float.intBitsToFloat(-442899211 + 1499863819) * f12;
            float f52 = Float.intBitsToFloat(Integer.reverse(479898459) ^ 0xE5D55938) * f12;
            float f53 = Float.intBitsToFloat(2098022526 + -1036863614) * f12;
            float f54 = Float.intBitsToFloat(Integer.reverse(-1314689581) ^ 0xF536C58D) * f12;
            float f55 = Float.intBitsToFloat(Integer.rotateLeft(0x87155230 ^ 0x8715A830, 14)) * f12;
            float f56 = f50 = Float.intBitsToFloat(0xC54D2E32 ^ 0xFA0D2E32) * f12;
            float f57 = f56 + f53;
            float f58 = f57 + f51;
            arrayList.add(new tsth(-f51 / 2.0f, f57, -f51 / 2.0f, f51 / 2.0f, f58, f51 / 2.0f, Float.intBitsToFloat(Integer.reverse(-1129374295) ^ 0xD470F53D)));
            arrayList.add(new tsth(-f52 / 2.0f, f56, -f54 / 2.0f, f52 / 2.0f, f57, f54 / 2.0f, Float.intBitsToFloat(203569700 + 902677980)));
            arrayList.add(new tsth(f52 / 2.0f, f56, -f54 / 2.0f, f52 / 2.0f + f55, f57, f54 / 2.0f, Float.intBitsToFloat(Integer.rotateLeft(0x436D765E ^ 0xC36D761F, 24))));
            arrayList.add(new tsth(-f52 / 2.0f - f55, f56, -f54 / 2.0f, -f52 / 2.0f, f57, f54 / 2.0f, Float.intBitsToFloat(0xF64D4E63 ^ 0xB7CD4E63)));
            arrayList.add(new tsth(Float.intBitsToFloat(Integer.reverse(-578530848) ^ 0x3C29F6B1), 0.0f, -f54 / 2.0f, f52 / 2.0f, f56, f54 / 2.0f, Float.intBitsToFloat(Integer.rotateLeft(0x3D9F1DCF ^ 0x3D9F3D7F, 17))));
            arrayList.add(new tsth(-f52 / 2.0f, 0.0f, -f54 / 2.0f, Float.intBitsToFloat(1965249310 - -1182827500), f56, f54 / 2.0f, Float.intBitsToFloat(Integer.rotateLeft(0x24CFC5F2 ^ 0x248EA5F2, 8))));
        }
        return arrayList;
    }

    private void ab(class_1309 class_13092, byq byq2, byq byq3) {
        int n = zd.syd(-1331125769);
        n = System.identityHashCode(this) ^ n;
        class_1309 class_13093 = class_13092;
        n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
        int n2 = n ^ 0xF0438E15;
        if ((n2 ^ n) != -264008171) {
            int cfr_ignored_0 = Integer.rotateRight(0x40EB2FE2 ^ n, 11) + -522687591;
        }
        class_243 class_2432 = class_13092.method_19538();
        float f = class_13092 instanceof class_1657 ? Float.intBitsToFloat(Integer.rotateLeft(0xD59AB2D0 ^ 0xCC0328EF, 24)) : class_13092.method_17681();
        float f2 = class_13092 instanceof class_1657 ? Float.intBitsToFloat(1365208874 + -293144772) : class_13092.method_17682();
        float f3 = class_13092.field_6283 != 0.0f ? class_13092.field_6283 : class_13092.method_36454();
        int n3 = Math.max(Integer.reverse(-1125667798) ^ 0x5435E723, Math.round(this.ght.thw_5()));
        long l = Math.max(0x35406E30402336F0L ^ 0x35406E30402335D0L, (long)Math.round(this.dhh_6.thw_5()));
        float f4 = this.shbsh.thw_5();
        float f5 = this.jthl.thw_5();
        boolean bl = this.htr.shzl();
        List list = tjs.hsd_4(class_13092);
        float f6 = 0.0f;
        for (tsth tsth2 : list) {
            f6 += tsth2.jtf_2;
        }
        float f7 = (float)Math.toRadians(f3);
        float f8 = class_3532.method_15374((float)f7);
        float f9 = class_3532.method_15362((float)f7);
        for (int i = 0; i < n3; ++i) {
            float f10 = (float)i / (float)n3;
            float f11 = jfh_2.nextFloat() * f6;
            tsth tsth3 = (tsth)list.get(0);
            float f12 = 0.0f;
            for (tsth tsth4 : list) {
                if (!(f11 <= (f12 += tsth4.jtf_2))) continue;
                tsth3 = tsth4;
                break;
            }
            class_243 class_2433 = tsth3.tzb_4();
            float f13 = (float)(class_2433.field_1352 * (double)f9 - class_2433.field_1350 * (double)f8);
            float f14 = (float)class_2433.field_1351;
            float f15 = (float)(class_2433.field_1352 * (double)f8 + class_2433.field_1350 * (double)f9);
            double d = (double)f5 * (Double.longBitsToDouble(0xFBEF816E1325D735L ^ 0xC40CB25D5325D735L) + jfh_2.nextDouble() * Double.longBitsToDouble(0x96E90BDF339C351BL ^ 0xA9009246939C351BL));
            double d2 = (jfh_2.nextDouble() - Double.longBitsToDouble(0xA4E4076BC5884679L ^ 0x9B04076BC5884679L)) * d * Double.longBitsToDouble(0x639FB8555BAB04B9L ^ 0x239FB8555BAB04B9L);
            double d3 = bl ? Double.longBitsToDouble(0x4F7BA105E2A9C342L ^ 0x70DA4A80FC1192AEL) + jfh_2.nextDouble() * Double.longBitsToDouble(0xADD45BD51CDC20F1L ^ 0x92787320DE537CD8L) : (jfh_2.nextDouble() - Double.longBitsToDouble(0x906B4DB662783868L ^ 0xAF8B4DB662783868L)) * d * Double.longBitsToDouble(0x2F085FB175E47302L ^ 0x10F05FB175E47302L);
            double d4 = (jfh_2.nextDouble() - Double.longBitsToDouble(0xF36FADA03EA112A8L ^ 0xCC8FADA03EA112A8L)) * d * Double.longBitsToDouble(0x4FA67F5696A9F5C9L ^ 0xFA67F5696A9F5C9L);
            double d5 = class_2432.field_1352 + (jfh_2.nextDouble() - Double.longBitsToDouble(0x4D466FF6F5C03BEDL ^ 0x72A66FF6F5C03BEDL)) * (double)f * Double.longBitsToDouble(0x8DBAE9A59A0CEF71L ^ 0xB25C8FC3FC6A8917L);
            double d6 = class_2432.field_1351 + jfh_2.nextDouble() * (double)f2;
            double d7 = class_2432.field_1350 + (jfh_2.nextDouble() - Double.longBitsToDouble(0x5EFB77AF76CA30A7L ^ 0x611B77AF76CA30A7L)) * (double)f * Double.longBitsToDouble(0x5FA4C97A331F8335L ^ 0x6042AF1C5579E553L);
            class_2960 class_29602 = i % 3 == 0 ? rdm : rjd_2;
            long l2 = l + (long)jfh_2.nextInt(Integer.rotateLeft(0x213748FC ^ 0x201B48FC, 16));
            this.jbn.add(new ttsh(this, class_2432, d5, d6, d7, f13, f14, f15, d2, d3, d4, byq2, byq3, f10, bl, l2, f4, class_29602));
        }
    }

    private void thbs_2(class_1309 class_13092, byq byq2) {
        int n = -1679082764;
        n = Integer.rotateLeft(n * -1757543781, 21) ^ 0xF5E1C1B7;
        n = System.identityHashCode(this) ^ n;
        byq byq3 = byq2;
        n = (byq3 != null ? System.identityHashCode(byq3) : 0) ^ n;
        int n2 = n ^ 0x87006AF5;
        if ((n2 ^ n) != -2030015755) {
            int cfr_ignored_0 = (0x1CEB5001 ^ n) - 190732464;
        }
        class_243 class_2432 = class_13092.method_19538();
        float f = class_13092 instanceof class_1657 ? Float.intBitsToFloat(-1845376083 + -1390948883) : class_13092.method_17681();
        float f2 = class_13092 instanceof class_1657 ? Float.intBitsToFloat(Integer.reverse(1989764178) ^ 0x75C0FF08) : class_13092.method_17682();
        int n3 = Math.max(-1090383207 - -1090383219, Math.round(this.ght.thw_5()));
        long l = Math.max(0x8AFE44A3030295E1L ^ 0x8AFE44A303029529L, (long)Math.round(this.dhh_6.thw_5()));
        boolean bl = this.htr.shzl();
        this.ssh_4(class_2432.method_1031(0.0, (double)(f2 - Float.intBitsToFloat(Integer.rotateLeft(0x6CAE549D ^ 0x9AB148B5, 9))), 0.0), f * Float.intBitsToFloat(839878001 - -212388987), n3 / (1941454705 + -1941454698), byq2, l, bl, false);
        this.tdr_3(class_2432, f * Float.intBitsToFloat(356077427 - -700216092), f2 * Float.intBitsToFloat(Integer.rotateLeft(0xFF6F1C28 ^ 0x66E0C5B1, 10)), n3 / 2, byq2, l, bl);
        this.bby(class_2432, new class_243((double)(f * Float.intBitsToFloat(0x409B1199 ^ 0x7E7A5637)), (double)(f2 * Float.intBitsToFloat(-1938752148 - 1295056236)), 0.0), f * Float.intBitsToFloat(1374309092 - 330430712), f2 * Float.intBitsToFloat(-333098558 + 1384023368), n3 / Integer.rotateLeft(0x2ADE6200 ^ 0x2EDE6200, 9), byq2, l, bl);
        this.bby(class_2432, new class_243((double)(-f * Float.intBitsToFloat(Integer.reverse(2128758777) ^ 0xA10300D0)), (double)(f2 * Float.intBitsToFloat(Integer.reverse(1276834997) ^ 0x926F5832)), 0.0), f * Float.intBitsToFloat(Integer.rotateLeft(0x594F0681 ^ 0xE9B7E7C6, 6)), f2 * Float.intBitsToFloat(-1752867036 + -1491175450), n3 / (0x2AA0954D ^ 0x2AA09545), byq2, l, bl);
        this.bby(class_2432, new class_243((double)(f * Float.intBitsToFloat(Integer.reverse(-1685589409) ^ 0xC46C36D3)), (double)(f2 * Float.intBitsToFloat(Integer.reverse(-837182033) ^ 0xCB6E924E)), 0.0), f * Float.intBitsToFloat(-1571426282 + -1681004812), f2 * Float.intBitsToFloat(1549196517 + -494916264), n3 / (Integer.reverse(1648748853) ^ 0xAC97A241), byq2, l, bl);
        this.bby(class_2432, new class_243((double)(-f * Float.intBitsToFloat(-1747507596 + -1504923498)), (double)(f2 * Float.intBitsToFloat(1172183378 + -117903125)), 0.0), f * Float.intBitsToFloat(410690476 + 631845726), f2 * Float.intBitsToFloat(Integer.reverse(-1723256030) ^ 0x7A1B98A4), n3 / Integer.rotateLeft(0xD27639D6 ^ 0xD275B9D6, 17), byq2, l, bl);
        this.ssh_4(class_2432.method_1031(0.0, (double)(f2 * Float.intBitsToFloat(Integer.reverse(778329645) ^ 0x8B6E5C95)), 0.0), f * Float.intBitsToFloat(0xBF0F871D ^ 0x81D88D20), n3 / (485118948 - 485118942), byq2, Math.round((float)l * Float.intBitsToFloat(0xF72966AF ^ 0xC865AA62)), false, true);
    }

    private void bqf(class_1309 class_13092, byq byq2) {
        int n = zd.syd(1605601262);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
        byq byq3 = byq2;
        n = (byq3 != null ? System.identityHashCode(byq3) : 0) ^ n;
        int n2 = n ^ 0x1F870D01;
        if ((n2 ^ n) != 528944385) {
            int cfr_ignored_0 = Integer.rotateRight(0x40348AEF ^ n, 11) - -893750740;
        }
        class_243 class_2432 = class_13092.method_19538().method_1031(0.0, Double.longBitsToDouble(0x3608F794D31B3FD6L ^ 0x9B16E0D4A82A64CL), 0.0);
        float f = class_13092 instanceof class_1657 ? Float.intBitsToFloat(0x3D0A579C ^ 0x2EC31FA) : class_13092.method_17682();
        float f2 = class_13092 instanceof class_1657 ? Float.intBitsToFloat(Integer.reverse(-1939749554) ^ 0x4DBA1FAB) : class_13092.method_17681();
        this.jdhgh.add(new trt_2(this, class_2432, f, byq2));
        int n3 = Math.max(999185745 - 999185727, Math.round(this.ght.thw_5() * Float.intBitsToFloat(Integer.reverse(1017562430) ^ 0x423AFCA6)));
        this.ssh_4(class_2432.method_1031(0.0, (double)(f * Float.intBitsToFloat(0xDF2904CC ^ 0xE01A37FF)), 0.0), f2 * Float.intBitsToFloat(Integer.reverse(-513659352) ^ 0x2B744687), n3, byq2, Math.round(this.dhh_6.thw_5() * Float.intBitsToFloat(-1937599351 - 1299564476)), false, true);
    }

    private void ssh_4(class_243 class_2432, float f, int n, byq byq2, long l, boolean bl, boolean bl2) {
        int n2 = zd.syd(-1257212666);
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 28);
        class_243 class_2433 = class_2432;
        n2 = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n2;
        int n3 = n2 ^ 0x18A5A85;
        if ((n3 ^ n2) != 25844357) {
            int cfr_ignored_0 = Integer.rotateRight(0xB49A2F83 ^ n2, 9) + -485924840;
        }
        for (int i = 0; i < n; ++i) {
            double d = jfh_2.nextDouble() * Double.longBitsToDouble(0x31D1A9DF8332D9DL ^ 0x43143B66AC770085L) * Double.longBitsToDouble(0x6AADF49E8677D943L ^ 0x2AADF49E8677D943L);
            double d2 = Math.acos(Double.longBitsToDouble(0x891A4D3BEF0568DEL ^ 0xC91A4D3BEF0568DEL) * jfh_2.nextDouble() - 1.0);
            double d3 = (double)f * Math.cbrt(jfh_2.nextDouble());
            double d4 = d3 * Math.sin(d2) * Math.cos(d);
            double d5 = d3 * Math.cos(d2);
            double d6 = d3 * Math.sin(d2) * Math.sin(d);
            double d7 = bl2 ? Double.longBitsToDouble(0xE04B583F36C2B62EL ^ 0xDFEB3A72E4331FD2L) : (bl ? Double.longBitsToDouble(0x52616FF2D3F66950L ^ 0x6DC6E2BD0CCD0D0AL) : Double.longBitsToDouble(0xC7F52BEC1C7E7914L ^ 0xF86DB898A01407EEL));
            double d8 = (jfh_2.nextDouble() - Double.longBitsToDouble(0x69491EA98C6755B5L ^ 0x56A91EA98C6755B5L)) * d7;
            double d9 = bl2 ? Double.longBitsToDouble(0xD00912C4C36856L ^ 0x3F589A6678A916ACL) + jfh_2.nextDouble() * Double.longBitsToDouble(0x5E19D33B9B08322EL ^ 0x618BBDAC1647ED15L) : (bl ? Double.longBitsToDouble(0x78E03D7A9FCF6640L ^ 0x477AA2C4E907D279L) + jfh_2.nextDouble() * Double.longBitsToDouble(0x5661B8B79F3F7FBCL ^ 0x69C5C256D8916BC7L) : (jfh_2.nextDouble() - Double.longBitsToDouble(0xDFB57D8E34117A53L ^ 0xE0557D8E34117A53L)) * Double.longBitsToDouble(0x1640846213FC776EL ^ 0x29D4FE8354526315L));
            double d10 = (jfh_2.nextDouble() - Double.longBitsToDouble(0xE041DD12D53250BCL ^ 0xDFA1DD12D53250BCL)) * d7;
            this.tmdh(class_2432, d4, d5, d6, d8, d9, d10, byq2, l, bl, bl2);
        }
    }

    private void tdr_3(class_243 class_2432, float f, float f2, int n, byq byq2, long l, boolean bl) {
        int n2 = -992762046;
        n2 = Integer.rotateLeft(n2 * 1754727299, 22) ^ 0xFD52A1CE;
        n2 = Integer.rotateLeft(Float.floatToIntBits(f2) ^ n2, 4);
        int n3 = n2 ^ 0x5209DBF7;
        if ((n3 ^ n2) != 1376377847) {
            int cfr_ignored_0 = (0x96DA7CB5 ^ n2) + 361246931;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        for (int i = 0; i < n; ++i) {
            double d = (jfh_2.nextDouble() - Double.longBitsToDouble(0x9FFE1F31D268B83L ^ 0x361FE1F31D268B83L)) * (double)f * Double.longBitsToDouble(0x986FB38AE6338B3AL ^ 0xD86FB38AE6338B3AL);
            double d2 = jfh_2.nextDouble() * (double)f2;
            double d3 = (jfh_2.nextDouble() - Double.longBitsToDouble(0xB42F63952928DCF7L ^ 0x8BCF63952928DCF7L)) * (double)f * Double.longBitsToDouble(0x9EC7E3A780B74A23L ^ 0xA13185C1E6D12C45L);
            double d4 = (jfh_2.nextDouble() - Double.longBitsToDouble(0xC690C634775F830AL ^ 0xF970C634775F830AL)) * (bl ? Double.longBitsToDouble(0x838D74417EF2C969L ^ 0xBC290EA0395CDD12L) : Double.longBitsToDouble(0x31ECAEEE9490B3CEL ^ 0xE7A29C5969CFA74L));
            double d5 = bl ? Double.longBitsToDouble(0x70EEF6D43BBFA6CFL ^ 0x4F7665A087D5D835L) + jfh_2.nextDouble() * Double.longBitsToDouble(0xDFDFC07A40A899F8L ^ 0xE07DAEEDCDE746C3L) : (jfh_2.nextDouble() - Double.longBitsToDouble(0xFC2482B055D65DF7L ^ 0xC3C482B055D65DF7L)) * Double.longBitsToDouble(0x373A390063F23BD8L ^ 0x8AE43E1245C2FA3L);
            double d6 = (jfh_2.nextDouble() - Double.longBitsToDouble(0xA6F4C90375A2996FL ^ 0x9914C90375A2996FL)) * (bl ? Double.longBitsToDouble(0x2B235FA9EF2F6A61L ^ 0x14872548A8817E1AL) : Double.longBitsToDouble(0x5E3D615FCFD4AB2DL ^ 0x61ABE674CDD8E297L));
            this.tmdh(class_2432, d, d2, d3, d4, d5, d6, byq2, l, bl, false);
        }
    }

    private void bby(class_243 class_2432, class_243 class_2433, float f, float f2, int n, byq byq2, long l, boolean bl) {
        try {
            int n2 = 539266016;
            n2 = Integer.rotateLeft(n2 * 1761968197, 3) ^ 0x5054C7FF;
            n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 26);
            n2 = Integer.rotateLeft(Float.floatToIntBits(f) ^ n2, 10);
            int n3 = n2 ^ 0xDB02F83A;
            if ((n3 ^ n2) != -620562374) {
                int cfr_ignored_0 = (0xFB2673DA ^ n2) + 1715137931;
            }
            if ((0x292 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        class_243 class_2434 = class_2432.method_1019(class_2433);
        for (int i = 0; i < n; ++i) {
            double d = (jfh_2.nextDouble() - Double.longBitsToDouble(0x5BA76BF95BA64636L ^ 0x64476BF95BA64636L)) * (double)f * Double.longBitsToDouble(0x1D2AD59D9B85F93CL ^ 0x5D2AD59D9B85F93CL);
            double d2 = -jfh_2.nextDouble() * (double)f2;
            double d3 = (jfh_2.nextDouble() - Double.longBitsToDouble(0x664F468751CC4001L ^ 0x59AF468751CC4001L)) * (double)f * Double.longBitsToDouble(0x3C624DBB5ECF5037L ^ 0x7C624DBB5ECF5037L);
            double d4 = (jfh_2.nextDouble() - Double.longBitsToDouble(0x836960E7DED3AC0CL ^ 0xBC8960E7DED3AC0CL)) * (bl ? Double.longBitsToDouble(0xB9C0233BFB5333D9L ^ 0x8660417629A29A25L) : Double.longBitsToDouble(0xBCFBD18C6EB3DA2FL ^ 0x8369BF1BE3FC0514L));
            double d5 = bl ? Double.longBitsToDouble(0xBC333A9EBB3ABFFAL ^ 0x83A15409367560C1L) + jfh_2.nextDouble() * Double.longBitsToDouble(0x3629017ECC86344EL ^ 0x9B5AD76FDA0DD37L) : (jfh_2.nextDouble() - Double.longBitsToDouble(0x62F8E93C94AD12C8L ^ 0x5D18E93C94AD12C8L)) * Double.longBitsToDouble(0x91E02084C510156CL ^ 0xAE7042C917E1BC90L);
            double d6 = (jfh_2.nextDouble() - Double.longBitsToDouble(0x2B3DFEBDF4C3B5DAL ^ 0x14DDFEBDF4C3B5DAL)) * (bl ? Double.longBitsToDouble(0xC763A2C7940070CEL ^ 0xF8C3C08A46F1D932L) : Double.longBitsToDouble(0xF6E85296789BAE9L ^ 0x30FCEBBEEAC665D2L));
            this.tmdh(class_2434, d, d2, d3, d4, d5, d6, byq2, l, bl, false);
        }
    }

    private void tmdh(class_243 class_2432, double d, double d2, double d3, double d4, double d5, double d6, byq byq2, long l, boolean bl, boolean bl2) {
        int n = 1420351357;
        n = Integer.rotateLeft(n * 2096760991, 27) ^ 0x99B3C720;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 22);
        class_243 class_2433 = class_2432;
        n = (class_2433 != null ? System.identityHashCode(class_2433) : 0) ^ n;
        int n2 = n ^ 0x128C6AAB;
        if ((n2 ^ n) != 311192235) {
            int cfr_ignored_0 = (0x4624BDD6 ^ n) + 1967664116;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        class_2960 class_29602 = bl2 || jfh_2.nextBoolean() ? rdm : rjd_2;
        float f = this.shbsh.thw_5();
        float f2 = (bl2 ? Float.intBitsToFloat(0x9BF86EB5 ^ 0xA46B5D86) : Float.intBitsToFloat(0x937C4C97 ^ 0xAC0F7FA4)) * f * (Float.intBitsToFloat(-1344672191 - 1887458471) + jfh_2.nextFloat() * Float.intBitsToFloat(Integer.rotateLeft(0xA129763C ^ 0x9554450F, 7)));
        this.thsa.add(new tdhd_2(this, class_2432.method_1031(d, d2, d3), d4, d5, d6, byq2.tkhl_2(bl2 ? Float.intBitsToFloat(0xAD220E2 ^ 0x49E620E2) : Float.intBitsToFloat(1190058683 + -57662139)), bl, l + (long)jfh_2.nextInt(Integer.rotateLeft(0xE9742182 ^ 0xE9769D82, 23)), f2, class_29602));
    }

    private static double tadh_4(double d, double d2, double d3) {
        block0: {
            int n = 309330293;
            n = Integer.rotateLeft(n * -1426671303, 3) ^ 0xCAE2A5FE;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 26);
            n = Integer.rotateRight((int)Double.doubleToLongBits(d2) ^ n, 2);
            int n2 = n ^ 0xB6787C7B;
            if ((n2 ^ n) == -1233617797) break block0;
            int cfr_ignored_0 = (0xA4087D0E ^ n) + 1507584567;
        }
        return d + (d2 - d) * d3;
    }

    private static float zqm(float f) {
        try {
            int n = -792187950;
            n = Integer.rotateLeft(n * -1065507487, 4) ^ 0x5817A37D;
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 15);
            int n2 = n ^ 0xF73CA58A;
            if ((n2 ^ n) != -147020406) {
                int cfr_ignored_0 = (0x27F48E58 ^ n) + -694969060;
            }
            if ((0x32C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        f = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        return f < Float.intBitsToFloat(-1722441279 - 1515561409) ? Float.intBitsToFloat(999768883 - -82361549) * f * f * f : 1.0f - (float)Math.pow(Float.intBitsToFloat(0x6AEDEF69 ^ 0xAAEDEF69) * f + 2.0f, Double.longBitsToDouble(0x4E93C62B584433B2L ^ 0xE9BC62B584433B2L)) / 2.0f;
    }

    private static float zdhdh_2(float f) {
        try {
            int n = 1090195510;
            n = Integer.rotateLeft(n * -1737972151, 12) ^ 0x7B9A2C0F;
            int n2 = n ^ 0xAF3E9EC0;
            if ((n2 ^ n) != -1354850624) {
                int cfr_ignored_0 = (0xEFC58EF6 ^ n) + 1580517950;
            }
            if ((0x349 & 0) != 0) {
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
        f = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        return 1.0f - (float)Math.pow(1.0 - (double)f, Double.longBitsToDouble(0x9F785D6055E0E1BL ^ 0x49FF85D6055E0E1BL));
    }

    private static int ghsb(int n, int n2, float f) {
        int n3 = 1407339877;
        n3 = Integer.rotateLeft(n3 * 319233947, 7) ^ 0x30AC2055;
        int n4 = (n3 = n ^ n3) ^ 0xED31EFA2;
        if ((n4 ^ n3) != -315494494) {
            int cfr_ignored_0 = (0xBED3A2C7 ^ n3) + 514633037;
        }
        f = class_3532.method_15363((float)f, (float)0.0f, (float)1.0f);
        int n5 = n >> (Integer.reverse(1160329539) ^ 0xC29C94BA) & -468964160 + 468964415;
        int n6 = n >> (Integer.reverse(1468186212) ^ 0x267D41FA) & 947659675 + -947659420;
        int n7 = n >> (0x71222362 ^ 0x7122236A) & (Integer.reverse(1284961016) ^ 0x1F4F69CD);
        int n8 = n & (Integer.reverse(-217240856) ^ 0x1754B030);
        int n9 = n2 >> (Integer.reverse(-1878583674) ^ 0x6168E011) & -2002629911 - -2002630166;
        int n10 = n2 >> Integer.rotateLeft(0x86C6F870 ^ 0x86C67870, 21) & 1589233574 - 1589233319;
        int n11 = n2 >> 6551377 + -6551369 & (Integer.reverse(775033293) ^ 0xB3884C8B);
        int n12 = n2 & (Integer.reverse(2105834751) ^ 0xFF3E2141);
        int n13 = (int)((float)n5 + (float)(n9 - n5) * f);
        int n14 = (int)((float)n6 + (float)(n10 - n6) * f);
        int n15 = (int)((float)n7 + (float)(n11 - n7) * f);
        int n16 = (int)((float)n8 + (float)(n12 - n8) * f);
        return n13 << -2102082262 + 2102082286 | n14 << (0x934C26E6 ^ 0x934C26F6) | n15 << -1737904662 + 1737904670 | n16;
    }

    private static int sy(int n, float f) {
        int n2 = 543322078;
        n2 = Integer.rotateLeft(n2 * 1273334999, 8) ^ 0x2FCCAA82;
        n2 = n ^ n2;
        n2 = Integer.rotateLeft(Float.floatToIntBits(f) ^ n2, 23);
        int n3 = n2 ^ 0x314A3AFA;
        if ((n3 ^ n2) != 826948346) {
            int cfr_ignored_0 = (0x11285524 ^ n2) + 630723514;
        }
        int n4 = class_3532.method_15340((int)Math.round((float)(n >> 924148231 - 924148207 & 549523357 + -549523102) * class_3532.method_15363((float)f, (float)0.0f, (float)1.0f)), (int)0, (int)Integer.rotateLeft(0xF67BEDD9 ^ 0xF67BEE25, 30));
        return n4 << (0x51096E0D ^ 0x51096E15) | n & (Integer.reverse(-1180545419) ^ 0xAE8DBA62);
    }

    private void dht_2(shw_3 shw2) {
        Object object2;
        int n = zd.syd(-1404483212);
        shw_3 shw3 = shw2;
        n = Integer.rotateRight((shw3 != null ? System.identityHashCode(shw3) : 0) ^ n, 15);
        int n2 = n ^ 0x1795AE22;
        if ((n2 ^ n) != 395685410) {
            int cfr_ignored_0 = (Integer.rotateRight(0xBBDCE756 ^ n, 10) - -1004690779) * -1143150761;
        }
        if (this.thsa.isEmpty() && this.jdhgh.isEmpty() && this.jbn.isEmpty()) {
            return;
        }
        class_4587 class_45872 = shw2.ssha_2();
        class_4184 class_41842 = tjs.mc.field_1773.method_19418();
        float f = shw2.skz_4();
        float f2 = this.dhz_6.thw_5();
        float f3 = this.skw.thw_5();
        float f4 = this.thas_4.thw_5();
        this.trd.yf();
        this.jsd_2.yf();
        this.stw.yf();
        for (Object object2 : this.jdhgh) {
            ((trt_2)object2).rzsh(class_41842, f, this.trd, this.jsd_2, this.stw);
        }
        this.jdhgh.removeIf(trt_2::asl);
        for (Object object2 : this.thsa) {
            ((tdhd_2)object2).khzsh();
            ((tdhd_2)object2).abr(class_41842, f, this.trd, this.jsd_2);
        }
        this.thsa.removeIf(tdhd_2::shtk_2);
        for (Object object2 : this.jbn) {
            ((ttsh)object2).zyb(f2, f3);
            ((ttsh)object2).dhsgh_2(class_41842, f, f2, f3, f4, this.trd, this.jsd_2);
        }
        this.jbn.removeIf(ttsh::as_2);
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA);
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableCull();
        Quaternionf quaternionf = class_41842.method_23767();
        object2 = new Vector3f(1.0f, 0.0f, 0.0f).rotate((Quaternionfc)quaternionf);
        Vector3f vector3f = new Vector3f(0.0f, 1.0f, 0.0f).rotate((Quaternionfc)quaternionf);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        this.trd.rghth(matrix4f, (Vector3f)object2, vector3f);
        this.jsd_2.rghth(matrix4f, (Vector3f)object2, vector3f);
        this.stw.rghth(matrix4f, (Vector3f)object2, vector3f);
        RenderSystem.depthMask((boolean)true);
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private void zad(btt btt2) {
        try {
            int n = 1863940214;
            n = Integer.rotateLeft(n * 1002454905, 28) ^ 0x7A12F791;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xAC4B8BB0;
            if ((n2 ^ n) != -1404335184) {
                int cfr_ignored_0 = (0xC352F3C6 ^ n) + -316610256;
            }
            if ((0x3C7 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (tjs.mc.field_1724 == null || tjs.mc.field_1687 == null) {
            return;
        }
        for (class_1297 class_12972 : tjs.mc.field_1687.method_18112()) {
            class_1309 class_13092;
            if (!(class_12972 instanceof class_1309) || (class_13092 = (class_1309)class_12972) == tjs.mc.field_1724 || !(class_13092.method_6032() <= 0.0f) && class_13092.field_6213 <= 0) continue;
            this.dab_2(class_13092);
        }
    }

    private void mj(bksh bksh2) {
        class_1309 class_13092;
        class_2663 class_26632;
        int n = 1675845320;
        n = Integer.rotateLeft(n * -1836678125, 13) ^ 0xB8EE4235;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 2);
        bksh bksh3 = bksh2;
        n = Integer.rotateLeft((bksh3 != null ? System.identityHashCode(bksh3) : 0) ^ n, 5);
        int n2 = n ^ 0x7EFFCC31;
        if ((n2 ^ n) != 2130693169) {
            int cfr_ignored_0 = (0x1D1C92F9 ^ n) - -1732296243;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (tjs.mc.field_1724 == null || tjs.mc.field_1687 == null) {
            return;
        }
        class_2596 class_25962 = bksh2.asw();
        if (class_25962 instanceof class_2663 && (class_26632 = (class_2663)class_25962).method_11470() == 3 && (class_25962 = class_26632.method_11469((class_1937)tjs.mc.field_1687)) instanceof class_1309 && (class_13092 = (class_1309)class_25962) != tjs.mc.field_1724) {
            this.dab_2(class_13092);
        }
    }

    private void al(bghq bghq2) {
        class_1309 class_13092;
        int n = -1702929530;
        n = Integer.rotateLeft(n * -1986805369, 15) ^ 0x405B48F7;
        n = System.identityHashCode(this) ^ n;
        bghq bghq3 = bghq2;
        n = Integer.rotateRight((bghq3 != null ? System.identityHashCode(bghq3) : 0) ^ n, 10);
        int n2 = n ^ 0x92FC7A61;
        if ((n2 ^ n) != -1828947359) {
            int cfr_ignored_0 = (0x88321E7 ^ n) + -761624451;
        }
        if ((class_13092 = bghq2.sll()) == null || class_13092 == tjs.mc.field_1724) {
            return;
        }
        this.dab_2(class_13092);
    }

    private void rnh(bthy bthy2) {
        class_1309 class_13092;
        int n = zd.syd(1838326027);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 4);
        bthy bthy3 = bthy2;
        n = Integer.rotateLeft((bthy3 != null ? System.identityHashCode(bthy3) : 0) ^ n, 6);
        int n2 = n ^ 0xEA250637;
        if ((n2 ^ n) != -366672329) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x87B7A73C ^ n, 3) - 1939529599) * -2018007235;
        }
        if (yf.dnkh()) {
            throw null;
        }
        if (!this.dhrz_2.shzl()) {
            return;
        }
        class_1297 class_12972 = bthy2.khtf();
        if (class_12972 instanceof class_1309 && (class_13092 = (class_1309)class_12972) != tjs.mc.field_1724) {
            this.dab_2(class_13092);
        }
    }

    private boolean jzw_2() {
        block0: {
            int n = -1053623156;
            n = Integer.rotateLeft(n * 1068268283, 17) ^ 0x25691D4D;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xB1442C5B;
            if ((n2 ^ n) == -1320932261) break block0;
            int cfr_ignored_0 = (0x7076D0D7 ^ n) + -461540472;
        }
        return this.ssha.skhth(this.thth_5);
    }

    private boolean dhhk() {
        int n = -1922625468;
        n = Integer.rotateLeft(n * -1412872501, 18) ^ 0xBA12B461;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
        int n2 = n ^ 0x50B91CD8;
        if ((n2 ^ n) != 1354308824) {
            int cfr_ignored_0 = (0xDDDE0C9C ^ n) - 91459972;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return !this.ssha.skhth(this.thtgh_2);
    }

    private boolean smm() {
        int n = 1990317013;
        n = Integer.rotateLeft(n * -277584915, 12) ^ 0xB708C425;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 12);
        int n2 = n ^ 0xB07D334;
        if ((n2 ^ n) != 185062196) {
            int cfr_ignored_0 = (0x7DA600E1 ^ n) - -205667154;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return !this.ssha.skhth(this.thtgh_2);
    }

    private boolean dkw_2() {
        try {
            int n = -1043160534;
            n = Integer.rotateLeft(n * 212517861, 26) ^ 0xAE303DE3;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xAC7A1AE4;
            if ((n2 ^ n) != -1401283868) {
                int cfr_ignored_0 = (0x6DA8B8CE ^ n) - -907432499;
            }
            if ((0x299 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return !this.ssha.skhth(this.thtgh_2);
    }

    private boolean ghthn() {
        int n = 784778164;
        n = Integer.rotateLeft(n * 124587929, 3) ^ 0xE7805A66;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 8);
        int n2 = n ^ 0x380E8299;
        if ((n2 ^ n) != 940475033) {
            int cfr_ignored_0 = (0x16C8412D ^ n) + -1512539141;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        return !this.ssha.skhth(this.thtgh_2);
    }

    private boolean thkhgh() {
        block0: {
            int n = 997852603;
            int n2 = (n = Integer.rotateLeft(n * 1053723469, 22) ^ 0x816D3BD3) ^ 0x8323D641;
            if ((n2 ^ n) == -2094803391) break block0;
            int cfr_ignored_0 = (0xB859D3FA ^ n) + 2097728445;
        }
        return this.ssha.skhth(this.thth_5);
    }

    private boolean khna_2() {
        block0: {
            int n = 176302167;
            n = Integer.rotateLeft(n * -589741855, 17) ^ 0xF84C51F0;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xC0920158;
            if ((n2 ^ n) == -1064173224) break block0;
            int cfr_ignored_0 = (0xCA10290F ^ n) + -814896041;
        }
        return this.ssha.skhth(this.thth_5);
    }

    private boolean rfy() {
        block0: {
            int n = zd.syd(189643570);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x4627E70B;
            if ((n2 ^ n) == 1177020171) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x4D6A5C39 ^ n, 12) + 1681836578) * 1298816057;
            int cfr_ignored_1 = (int)(0x8FD8F20427D4EB4FL ^ (long)n ^ 0x1978831A2DB8B260L);
        }
        return this.ssha.skhth(this.thth_5);
    }

    private boolean shz_8() {
        block0: {
            int n = 1683020213;
            n = Integer.rotateLeft(n * 103762047, 4) ^ 0xB979DD1B;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 8);
            int n2 = n ^ 0xC96C190D;
            if ((n2 ^ n) == -915662579) break block0;
            int cfr_ignored_0 = (0xAD3CC0B8 ^ n) - 1438457689;
        }
        return this.ssha.skhth(this.thth_5);
    }

    private static String hzw(String string, int n, int n2, int n3) {
        try {
            int n4 = -881675387;
            n4 = Integer.rotateLeft(n4 * 2088003315, 17) ^ 0x69C0F8C9;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            n4 = Integer.rotateLeft(n3 ^ n4, 8);
            int n5 = n4 ^ 0x4FE5A1D9;
            if ((n5 ^ n4) != 1340449241) {
                int cfr_ignored_0 = (0x8497125C ^ n4) + 1523686289;
            }
            if ((0x2D5 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xEB4BFFE4 ^ n2 - i) + hwt_2, 13) ^ btd_3 + i * 1238375803));
        }
        return new String(cArray);
    }

    private static int rzt_3(class_1309 class_13092) {
        block0: {
            int n = -1290859451;
            int n2 = (n = Integer.rotateLeft(n * 559010863, 17) ^ 0x1A678099) ^ 0xB73935CE;
            if ((n2 ^ n) == -1220987442) break block0;
            int cfr_ignored_0 = (0x436398B ^ n) - -1288332129;
        }
        return class_13092.method_5628();
    }

    private static byq rad_3(bzw_2 bzw2_2) {
        block0: {
            int n = 1902715410;
            n = Integer.rotateLeft(n * 725276469, 9) ^ 0x170F8A4B;
            bzw_2 bzw3_2 = bzw2_2;
            n = (bzw3_2 != null ? System.identityHashCode(bzw3_2) : 0) ^ n;
            int n2 = n ^ 0x7D480854;
            if ((n2 ^ n) == 2101872724) break block0;
            int cfr_ignored_0 = (0xC212A46 ^ n) - 1554132570;
        }
        return bzw2_2.sdsh_4();
    }

    private static boolean zghf_2(khd khd2, fy fy2) {
        block0: {
            int n = -1297215864;
            n = Integer.rotateLeft(n * -779895027, 4) ^ 0x6B4145BC;
            khd khd3 = khd2;
            n = (khd3 != null ? System.identityHashCode(khd3) : 0) ^ n;
            fy fy3 = fy2;
            n = Integer.rotateLeft((fy3 != null ? System.identityHashCode(fy3) : 0) ^ n, 7);
            int n2 = n ^ 0xB095DA77;
            if ((n2 ^ n) == -1332356489) break block0;
            int cfr_ignored_0 = (0x23BD4FF ^ n) + -1560663314;
        }
        return khd2.skhth(fy2);
    }

    private static void thnd(tjs tjs2, class_1309 class_13092, byq byq2) {
        int n = 191405654;
        n = Integer.rotateLeft(n * -373618133, 11) ^ 0xBBF35D11;
        tjs tjs3 = tjs2;
        n = Integer.rotateRight((tjs3 != null ? System.identityHashCode(tjs3) : 0) ^ n, 22);
        byq byq3 = byq2;
        n = (byq3 != null ? System.identityHashCode(byq3) : 0) ^ n;
        int n2 = n ^ 0x5BC3D05A;
        if ((n2 ^ n) != 1539559514) {
            int cfr_ignored_0 = (0x50AB4E0C ^ n) - 701562642;
        }
        tjs2.thbs_2(class_13092, byq2);
    }

    private static boolean swa_2(khd khd2, fy fy2) {
        block0: {
            int n = -1172768969;
            n = Integer.rotateLeft(n * 1865065367, 26) ^ 0xFD436669;
            khd khd3 = khd2;
            n = Integer.rotateRight((khd3 != null ? System.identityHashCode(khd3) : 0) ^ n, 4);
            fy fy3 = fy2;
            n = (fy3 != null ? System.identityHashCode(fy3) : 0) ^ n;
            int n2 = n ^ 0x6488BE96;
            if ((n2 ^ n) == 1686683286) break block0;
            int cfr_ignored_0 = (0xDE9049A1 ^ n) + 1995413160;
        }
        return khd2.skhth(fy2);
    }

    private static void tkhgh(tjs tjs2, class_1309 class_13092, byq byq2) {
        int n = -539995535;
        n = Integer.rotateLeft(n * -1948633201, 11) ^ 0xF1E17396;
        tjs tjs3 = tjs2;
        n = Integer.rotateRight((tjs3 != null ? System.identityHashCode(tjs3) : 0) ^ n, 26);
        byq byq3 = byq2;
        n = (byq3 != null ? System.identityHashCode(byq3) : 0) ^ n;
        int n2 = n ^ 0x59C65328;
        if ((n2 ^ n) != 1506169640) {
            int cfr_ignored_0 = (0x86160159 ^ n) + 547653452;
        }
        tjs2.bqf(class_13092, byq2);
    }

    private static class_1299 trd_2(class_1309 class_13092) {
        block0: {
            int n = zd.syd(-943559593);
            int n2 = n ^ 0x971FA14D;
            if ((n2 ^ n) == -1759534771) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x50DDCD1A ^ n, 13) + -818317983) * 1356713243;
        }
        return class_13092.method_5864();
    }

    private static String thm_5(class_1299 class_12992) {
        block0: {
            int n = -50761689;
            int n2 = (n = Integer.rotateLeft(n * -2050432729, 21) ^ 0xC9B02CAA) ^ 0x7447CC55;
            if ((n2 ^ n) == 1950862421) break block0;
            int cfr_ignored_0 = (0x88BEBC72 ^ n) - 1465604144;
        }
        return class_12992.toString();
    }

    private static float trq(class_1309 class_13092) {
        block0: {
            int n = -304262341;
            int n2 = (n = Integer.rotateLeft(n * 422218419, 13) ^ 0x66B971C2) ^ 0x2B1EBD18;
            if ((n2 ^ n) == 723434776) break block0;
            int cfr_ignored_0 = (0xC6C3EE23 ^ n) - -1695037223;
        }
        return class_13092.method_17682();
    }

    private static String zsdh_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1743645815;
            n4 = Integer.rotateLeft(n4 * 2056642191, 12) ^ 0x7EFAAD1F;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 10);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 14)) ^ 0xFF1C268E;
            if ((n5 ^ n4) == -14932338) break block0;
            int cfr_ignored_0 = (0x98F1CAF9 ^ n4) + 968663255;
        }
        return tjs.hzw(string, n, n2, n3);
    }

    private static float shj_4(int n) {
        block0: {
            int n2 = zd.syd(1187349479);
            int n3 = (n2 = n ^ n2) ^ 0xFDF5DA6D;
            if ((n3 ^ n2) == -34219411) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xBB30598A ^ n2, 10) + -1355254031;
        }
        return Float.intBitsToFloat(n);
    }

    private static float zqw_2(int n) {
        block0: {
            int n2 = zd.syd(691477027);
            int n3 = n2 ^ 0xB24EA09B;
            if ((n3 ^ n2) == -1303469925) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x9B79BAB8 ^ n2, 6) + -669303933) * -1686521159;
        }
        return Float.intBitsToFloat(n);
    }

    private static String drm(String string, int n, int n2, int n3) {
        block0: {
            int n4 = zd.syd(1027976123);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 14)) ^ 0xB360BF4F;
            if ((n5 ^ n4) == -1285505201) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x8E2514F4 ^ n4, 4) - 987441351) * -1910172427;
        }
        return tjs.hzw(string, n, n2, n3);
    }

    private static int shl_5(int n, int n2) {
        block0: {
            int n3 = 645714946;
            n3 = Integer.rotateLeft(n3 * -678783565, 3) ^ 0xE4DDB9F5;
            int n4 = (n3 = n ^ n3) ^ 0x7223A49D;
            if ((n4 ^ n3) == 1914938525) break block0;
            int cfr_ignored_0 = (0x545F709F ^ n3) + -308193923;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float zyz_3(int n) {
        block0: {
            int n2 = -1905552601;
            n2 = Integer.rotateLeft(n2 * -1984663077, 21) ^ 0x91B8BF97;
            int n3 = (n2 = Integer.rotateLeft(n ^ n2, 17)) ^ 0x95D1DD47;
            if ((n3 ^ n2) == -1781408441) break block0;
            int cfr_ignored_0 = (0x1BBA4E60 ^ n2) - -1319953206;
        }
        return Float.intBitsToFloat(n);
    }

    private static float dhath_2(int n) {
        block0: {
            int n2 = zd.syd(-2040168378);
            int n3 = n2 ^ 0xE2417F1A;
            if ((n3 ^ n2) == -499024102) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x6424FF5C ^ n2, 15) - 618171231) * 1680146269;
        }
        return Float.intBitsToFloat(n);
    }

    private static String shzq(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -519294101;
            n4 = Integer.rotateLeft(n4 * -1967597099, 27) ^ 0xA6F369DC;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 22)) ^ 0xEEC29436;
            if ((n5 ^ n4) == -289237962) break block0;
            int cfr_ignored_0 = (0xFCEA75D ^ n4) + -1365274834;
        }
        return tjs.hzw(string, n, n2, n3);
    }

    private static float ght_2(int n) {
        block0: {
            int n2 = zd.syd(1818520981);
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 24)) ^ 0x60AA89DE;
            if ((n3 ^ n2) == 1621789150) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xCCEE44B ^ n2, 4) + -1855241136;
        }
        return Float.intBitsToFloat(n);
    }

    private static float rkm(int n) {
        block0: {
            int n2 = 2137014491;
            int n3 = (n2 = Integer.rotateLeft(n2 * 2112499513, 24) ^ 0x1450F7CA) ^ 0x2DEE1491;
            if ((n3 ^ n2) == 770577553) break block0;
            int cfr_ignored_0 = (0x528E544A ^ n2) - 30671052;
        }
        return Float.intBitsToFloat(n);
    }

    private static float ddsh_2(int n) {
        block0: {
            int n2 = -1811343666;
            int n3 = (n2 = Integer.rotateLeft(n2 * -349971613, 11) ^ 0x58A6EDEF) ^ 0xF37E11E3;
            if ((n3 ^ n2) == -209841693) break block0;
            int cfr_ignored_0 = (0x6777072D ^ n2) - -401930095;
        }
        return Float.intBitsToFloat(n);
    }

    private static float jtr_2(int n) {
        block0: {
            int n2 = 423136082;
            n2 = Integer.rotateLeft(n2 * 1339924843, 10) ^ 0x438D5DE;
            int n3 = (n2 = n ^ n2) ^ 0xB3547959;
            if ((n3 ^ n2) == -1286309543) break block0;
            int cfr_ignored_0 = (0xAA6CF20B ^ n2) + 1358252681;
        }
        return Float.intBitsToFloat(n);
    }

    private static float khthw(int n) {
        block0: {
            int n2 = -703109388;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1713094709, 12) ^ 0x4FD32635) ^ 0xC12A2217;
            if ((n3 ^ n2) == -1054203369) break block0;
            int cfr_ignored_0 = (0x173D44E3 ^ n2) - 2032552899;
        }
        return Float.intBitsToFloat(n);
    }

    private static float zkhd(int n) {
        block0: {
            int n2 = -1222972521;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1332665611, 26) ^ 0x92185466) ^ 0x85BFDE94;
            if ((n3 ^ n2) == -2051023212) break block0;
            int cfr_ignored_0 = (0x32A53503 ^ n2) + -1210102988;
        }
        return Float.intBitsToFloat(n);
    }

    private static int qr(int n) {
        block0: {
            int n2 = zd.syd(-1662158934);
            int n3 = (n2 = n ^ n2) ^ 0x9F19186C;
            if ((n3 ^ n2) == -1625745300) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x3F46FC6 ^ n2, 3) - 2130126901;
        }
        return Integer.reverse(n);
    }

    private static float thghkh(int n) {
        block0: {
            int n2 = 867386846;
            n2 = Integer.rotateLeft(n2 * 1822383145, 8) ^ 0x47B57EE;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 22)) ^ 0xD5B4407F;
            if ((n3 ^ n2) == -709607297) break block0;
            int cfr_ignored_0 = (0xE60705A1 ^ n2) + -1612306184;
        }
        return Float.intBitsToFloat(n);
    }

    private static int khdw(int n, int n2) {
        block0: {
            int n3 = 1111472531;
            n3 = Integer.rotateLeft(n3 * -478072123, 26) ^ 0x19C6B622;
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 19)) ^ 0xF4C313AF;
            if ((n4 ^ n3) == -188542033) break block0;
            int cfr_ignored_0 = (0xB6FCAA3C ^ n3) - 816298414;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static float khdz(int n) {
        block0: {
            int n2 = 496395372;
            int n3 = (n2 = Integer.rotateLeft(n2 * 1865086467, 6) ^ 0xD921D948) ^ 0x821CD277;
            if ((n3 ^ n2) == -2112040329) break block0;
            int cfr_ignored_0 = (0x9F8AB61B ^ n2) + -1326925536;
        }
        return Float.intBitsToFloat(n);
    }

    private static float ghthw(int n) {
        block0: {
            int n2 = -33005435;
            n2 = Integer.rotateLeft(n2 * 1062277033, 4) ^ 0xDC3E3CC0;
            int n3 = (n2 = n ^ n2) ^ 0x2112AEB2;
            if ((n3 ^ n2) == 554872498) break block0;
            int cfr_ignored_0 = (0xDF1ACE37 ^ n2) + 1973435496;
        }
        return Float.intBitsToFloat(n);
    }

    private static float dak_4(int n) {
        block0: {
            int n2 = 371731147;
            n2 = Integer.rotateLeft(n2 * -1748425999, 18) ^ 0x9D1A03E6;
            int n3 = (n2 = n ^ n2) ^ 0xEB63A261;
            if ((n3 ^ n2) == -345791903) break block0;
            int cfr_ignored_0 = (0xFD4B88AA ^ n2) + 1210377108;
        }
        return Float.intBitsToFloat(n);
    }

    private static float ghbh_2(int n) {
        block0: {
            int n2 = -707474959;
            int n3 = (n2 = Integer.rotateLeft(n2 * 216057785, 9) ^ 0xAFEAB98E) ^ 0x58A85428;
            if ((n3 ^ n2) == 1487426600) break block0;
            int cfr_ignored_0 = (0x8D7C9DD9 ^ n2) - -1076031289;
        }
        return Float.intBitsToFloat(n);
    }

    private static int shfa(int n) {
        block0: {
            int n2 = zd.syd(-1976748584);
            int n3 = (n2 = n ^ n2) ^ 0x25D0D3DA;
            if ((n3 ^ n2) == 634442714) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xAFFDE602 ^ n2, 8) + 1411152249;
        }
        return Integer.reverse(n);
    }

    private static float bdhj(int n) {
        block0: {
            int n2 = zd.syd(-347025971);
            int n3 = n2 ^ 0x8B91BD8A;
            if ((n3 ^ n2) == -1953383030) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x60C17047 ^ n2, 15) - -1144375340;
        }
        return Float.intBitsToFloat(n);
    }

    private static String[] tthk_2(String string) {
        int n = 1371317680;
        n = Integer.rotateLeft(n * 233910481, 28) ^ 0xA2FD3C6C;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 16);
        int n2 = n ^ 0x3C80038B;
        if ((n2 ^ n) != 1015022475) {
            int cfr_ignored_0 = (0x6D3CA63B ^ n) - 1111479451;
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

    private static CallSite khhl_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1466044017;
            n3 = Integer.rotateLeft(n3 * -485711219, 12) ^ 0x49A46754;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x1AC98437;
            if ((n4 ^ n3) != 449414199) {
                int cfr_ignored_0 = (0xB25475B8 ^ n3) + 943292281;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ sath_3 ^ string.hashCode()) + (n2 + sqgh) + i ^ sath_3, 11) + sqgh);
            }
            String[] stringArray = tjs.tthk_2(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType3) : lookup.findVirtual(clazz, stringArray[0], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] rht9vu8jn2dxmj(String string) {
        return string.split("\u0001\u0017", -1);
    }

    private static CallSite eplwgrm4o(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ hbxqsrg8yy0 ^ string.hashCode()) + (n2 + dsu039q) + i ^ hbxqsrg8yy0, 27) + dsu039q);
            }
            String[] stringArray = tjs.rht9vu8jn2dxmj(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

