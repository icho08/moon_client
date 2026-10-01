/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$class_4534
 *  com.mojang.blaze3d.platform.GlStateManager$class_4535
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_10142
 *  net.minecraft.class_10156
 *  net.minecraft.class_243
 *  net.minecraft.class_286
 *  net.minecraft.class_287
 *  net.minecraft.class_289
 *  net.minecraft.class_290
 *  net.minecraft.class_293$class_5596
 *  net.minecraft.class_4587
 *  net.minecraft.class_746
 *  net.minecraft.class_9801
 *  org.joml.Matrix4f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import lombok.Generated;
import net.minecraft.class_10142;
import net.minecraft.class_10156;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import net.minecraft.class_746;
import net.minecraft.class_9801;
import org.joml.Matrix4f;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.tsh_3;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.nz_2;

@tq_2(name="Line Glyphs", category=bzw.OTHER, desc="Floating angular glyph lines in front of the player")
public class tkhsh
extends bnq {
    private static tkhsh dnh_2;
    private final tay dak = new tay(this, "Count").shth_7(Float.intBitsToFloat(Integer.reverse(-1534491537) ^ 0xB7019125)).dhbs_2(Float.intBitsToFloat(2061188438 + -932396374)).rkh_3(Float.intBitsToFloat(0x4CADB5F4 ^ 0xC0DB5F4)).ssd_5(Float.intBitsToFloat(Integer.reverse(1917743535) ^ 0xB702724E));
    private final badh_2 hthm = new badh_2(this, "Slow Speed").bts(false);
    private final khd zmt_2 = new khd(this, "Color");
    private final fy ththt = new fy(this.zmt_2, "Theme").rhh_3();
    private final fy dhsa_2 = new fy(this.zmt_2, "Rainbow");
    private final fy thsht_2 = new fy(this.zmt_2, "Single");
    private final List rkdh = new ArrayList();
    private final Random jnz = new Random(0xB850C0F5BFF31685L ^ 0xB850C0F5BFF2783FL);
    private final bql<btt> jkha = this::jjk;
    private final bql<shw_3> dhdt_3 = this::dmf;
    private static final int rmsh = 519026664;
    private static final int thrn = 1212293091;
    private static final int trs_2 = 660599657;
    private static final int hkhd_2 = -1662380055;
    private static final int q9t098vmtq1 = -1552567667;
    private static final int htij0uwf6f7 = -1705781167;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int mwzky4heph7uz;

    public tkhsh() {
        dnh_2 = this;
    }

    @Override
    public void nt() {
        int n = 1919778749;
        int n2 = (n = Integer.rotateLeft(n * -895775241, 28) ^ 0x246B7420) ^ 0xFE6D82BC;
        if ((n2 ^ n) != -26377540) {
            int cfr_ignored_0 = (0x8C00FD01 ^ n) - 1222237999;
        }
        this.rkdh.clear();
    }

    @Override
    public void nc() {
        int n = nz_2.thjf(823464770);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 12);
        int n2 = n ^ 0xA1709A43;
        if ((n2 ^ n) != -1586455997) {
            int cfr_ignored_0 = Integer.rotateLeft(0x90658901 ^ n, 5) + -2136394150;
            int cfr_ignored_1 = (int)(0x52D7273C27D4EB4FL ^ (long)n ^ 0xB308831A2DB9087FL);
        }
        this.rkdh.clear();
    }

    private void rth_2() {
        if (tkhsh.mc.field_1724 == null || tkhsh.mc.field_1687 == null) {
            this.rkdh.clear();
            return;
        }
        this.rkdh.removeIf(tsh_3::zaf);
        int n = (int)this.dak.hkj();
        while (this.rkdh.size() > n) {
            this.rkdh.removeFirst();
        }
        int n2 = 8;
        while (n2-- > 0 && this.rkdh.size() < n) {
            this.rkdh.add(new tsh_3(this, this.jqd_2(), this.jnz.nextInt(7, 13)));
        }
        this.rkdh.forEach(tsh_3::bhl);
    }

    private void smh_2(class_4587 class_45872, float f) {
        if (this.rkdh.isEmpty() || tkhsh.mc.field_1773 == null) {
            return;
        }
        class_243 class_2432 = tkhsh.mc.field_1773.method_19418().method_19326();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.setShader((class_10156)class_10142.field_53876);
        int n = 0;
        for (tsh_3 tsh2 : this.rkdh) {
            List list = tsh2.shshj(f);
            if (list.size() < 2) {
                ++n;
                continue;
            }
            float f2 = this.tqr_2(tsh2, class_2432);
            this.thwgh(class_45872, list, tsh2, class_2432, n, f2 * 3.0f, 0.35f);
            this.thwgh(class_45872, list, tsh2, class_2432, n, f2, 1.0f);
            ++n;
        }
        RenderSystem.lineWidth((float)1.0f);
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    }

    private void thwgh(class_4587 class_45872, List list, tsh_3 tsh2, class_243 class_2432, int n, float f, float f2) {
        if (f <= 0.01f) {
            return;
        }
        RenderSystem.lineWidth((float)f);
        class_287 class_2872 = class_289.method_1348().method_60827(class_293.class_5596.field_29345, class_290.field_1576);
        Matrix4f matrix4f = class_45872.method_23760().method_23761();
        int n2 = n;
        for (int i = 0; i < list.size(); ++i) {
            class_243 class_2433 = (class_243)list.get(i);
            float f3 = tsh2.ahl() * (0.25f + (float)i / (float)list.size() / 1.75f) * f2;
            Color color = this.jzth(n2, f3);
            class_2872.method_22918(matrix4f, (float)(class_2433.field_1352 - class_2432.field_1352), (float)(class_2433.field_1351 - class_2432.field_1351), (float)(class_2433.field_1350 - class_2432.field_1350)).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
            n2 += 180;
        }
        class_9801 class_98012 = class_2872.method_60794();
        if (class_98012 != null) {
            class_286.method_43433((class_9801)class_98012);
        }
    }

    private Color jzth(int n, float f) {
        int n2 = -37042921;
        n2 = Integer.rotateLeft(n2 * -1337561751, 9) ^ 0x2EF9693;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 28);
        int n3 = (n2 = Integer.rotateLeft(n ^ n2, 27)) ^ 0xEAE6EAC6;
        if ((n3 ^ n2) != -353965370) {
            int cfr_ignored_0 = (0x172C2FD1 ^ n2) + 1884228541;
        }
        String string = tkhsh.sjd_4(tkhsh.khfa(this.zmt_2));
        int n4 = -1;
        switch (tkhsh.shghd(string)) {
            case -1656737386: {
                if (!tkhsh.dbgh(string, "Rainbow")) break;
                n4 = 0;
                break;
            }
            case -1818398616: {
                if (!string.equals("Single")) break;
                n4 = 1;
            }
        }
        Color color = switch (n4) {
            case 0 -> {
                float var6_8 = ((float)System.currentTimeMillis() / Float.intBitsToFloat(105405596 + 995599204) + (float)n * 2.0f) % Float.intBitsToFloat(-1369955526 - 1789141818) / Float.intBitsToFloat(0x4DEBCD78 ^ 0xE5FCD78);
                yield Color.getHSBColor(var6_8, 1.0f, 1.0f);
            }
            case 1 -> bas_4.zsz_4();
            default -> bas_4.hmq(n);
        };
        int n5 = Math.max(0, tkhsh.zsgh_2(0x3CBD900D ^ 0x3CBD90F2, (int)(f * Float.intBitsToFloat(-1847385341 + -1315185411))));
        return new Color(color.getRed(), color.getGreen(), tkhsh.sll_2(color), n5);
    }

    private float tqr_2(tsh_3 tsh2, class_243 class_2432) {
        double d = 0.0;
        float f = 0.0f;
        float f2 = 0.0f;
        int n = 0;
        int n2 = -137518548;
        n2 = Integer.rotateLeft(n2 * 763196499, 23) ^ 0x1B36784D;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x7E4C05FE ^ 0xBE8CDD13)));
        block22: while (true) {
            switch (Integer.reverse(n3) ^ n2 ^ 0xBE8CDD13) {
                case -501439662: {
                    int cfr_ignored_0 = Integer.rotateRight(0x2F60F683 ^ n2, 8) + -1055164136;
                    int[] nArray = (int[])tsh2.shbd.getFirst();
                    class_243 class_2433 = new class_243((double)nArray[0], (double)nArray[1], (double)nArray[2]);
                    d = tkhsh.dght(class_2432, class_2433);
                    f = (float)tkhsh.skz_3(0.0, tkhsh.bzdh_2(1.0, 1.0 - d / Double.longBitsToDouble(0xF5819D96D1CF8CEFL ^ 0xB5B59D96D1CF8CEFL)));
                    f2 = Float.intBitsToFloat(21558988 - -1020306126) + Float.intBitsToFloat(Integer.reverse(2134262973) ^ 0xFD140A98) * f;
                    n3 = Integer.reverse(n2 ^ 0x6DA5E8E7 ^ 0xBE8CDD13) ^ 0x9ABA71B9 ^ 0x9ABA71B9;
                    int cfr_ignored_1 = (Integer.rotateRight(0xAE5197D6 ^ n2, 8) - 541000229) * -1370384425;
                    n3 = Integer.reverse(n2 ^ 0x536F67CA ^ 0xBE8CDD13);
                    n += 3;
                    continue block22;
                }
                case 2118911486: {
                    int cfr_ignored_2 = (Integer.rotateRight(0xED0D213B ^ n2, 16) + -1191926432) * -317906629;
                    if (tsh2.shbd.isEmpty()) {
                        int cfr_ignored_3 = (int)(0xD0B5D702DA2663FCL ^ (long)n2 ^ 0x537578FF3CDE0CBAL);
                        n3 = Integer.reverse(n2 ^ 0x811F9D0C ^ 0xBE8CDD13);
                        int cfr_ignored_4 = (int)(0x8982F6A4AA21C18EL ^ (long)n2 ^ 0x103998F0783ABED4L);
                        n3 = Integer.reverse(n2 ^ 0x56DE9D28 ^ 0xBE8CDD13);
                        n -= 5;
                        continue block22;
                    }
                    try {
                        ++n;
                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xE21CA352 ^ 0xBE8CDD13)));
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)Integer.reverse(n2 ^ 0xE21CA352 ^ 0xBE8CDD13) ^ 0x4896C8D6E5F0BDC8L ^ 0x4896C8D6E5F0BDC8L);
                    }
                    n -= 4;
                    continue block22;
                }
                case 1457429800: {
                    int cfr_ignored_5 = (Integer.rotateLeft(0xF2468CD8 ^ n2, 17) + 1525198179) * -230257447;
                    f2 = 1.0f;
                    n3 = Integer.reverse(n2 ^ 0xBB15169B ^ 0xBE8CDD13) ^ 0xD5EE4D6A ^ 0xD5EE4D6A;
                    int cfr_ignored_6 = Integer.rotateRight(0x2F0BDA2E ^ n2, 8) - -1228076339;
                    n3 = Integer.reverse(n2 ^ 0x536F67CA ^ 0xBE8CDD13) + -1331783652 - -1331783652;
                    n += 5;
                    continue block22;
                }
                case -1225686266: {
                    int cfr_ignored_7 = Integer.rotateRight(0x612EF802 ^ n2, 15) + -921852039;
                    int cfr_ignored_8 = (int)(0xB942F9350EF47217L ^ (long)n2 ^ 0xF1AD15B1F08DF54L);
                    n3 = Integer.reverse(n2 ^ 0xCEF9EBB5 ^ 0xBE8CDD13) + 431323470 - 431323470;
                    int cfr_ignored_9 = (int)(0x1FF7172EB30574D4L ^ (long)n2 ^ 0xD32DAAB9128F923FL);
                    n3 = Integer.reverse(n2 ^ 0x7E4C05FE ^ 0xBE8CDD13) + 1346364777 - 1346364777;
                    n += 2;
                    continue block22;
                }
                case 1011926588: {
                    int cfr_ignored_10 = Integer.rotateRight(0x2F5ABEAB ^ n2, 8) + -1067797008;
                    n3 = Integer.reverse(n2 ^ 0x76A1022F ^ 0xBE8CDD13) ^ 0x6C4FFC99 ^ 0x6C4FFC99;
                    int cfr_ignored_11 = Integer.rotateLeft(0x35EEE6C1 ^ n2, 9) + -1941204838;
                    int cfr_ignored_12 = (int)(0xF75C48FC27D4EB4FL ^ (long)n2 ^ 0x6C88831A2DB84369L);
                    try {
                        n -= 3;
                        if ((0x7CB1884FCA0DDAC1L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = Integer.reverse(n2 ^ 0x7E4C05FE ^ 0xBE8CDD13);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = (int)((long)Integer.reverse(n2 ^ 0x7E4C05FE ^ 0xBE8CDD13) ^ 0xBE8E7BB3A4F4F19L ^ 0xBE8E7BB3A4F4F19L);
                    }
                    n += 2;
                    continue block22;
                }
                case 1019332597: {
                    int cfr_ignored_13 = Integer.rotateLeft(0x323EC468 ^ n2, 9) + 435644371;
                    n3 = (int)((long)Integer.reverse(n2 ^ 0xF0A93E54 ^ 0xBE8CDD13) ^ 0x5B4BB8AAF2E7B53BL ^ 0x5B4BB8AAF2E7B53BL);
                    int cfr_ignored_14 = Integer.rotateRight(0x3C2EF9AA ^ n2, 10) + 1309530833;
                    n3 = Integer.reverse(n2 ^ 0x7E4C05FE ^ 0xBE8CDD13);
                    ++n;
                    continue block22;
                }
                case -160328456: {
                    int cfr_ignored_15 = (Integer.rotateLeft(0xA8D4675 ^ n2, 4) - 1266231142) * 177030773;
                    int cfr_ignored_16 = (int)(0xC83FE84827D4EB4FL ^ (long)n2 ^ 0x2DE0831A2DB83DAEL);
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xDA7CE85A ^ 0xBE8CDD13)));
                    int cfr_ignored_17 = Integer.rotateLeft(0xE7D46CC9 ^ n2, 15) + 387369874;
                    int cfr_ignored_18 = (int)(0x2566C2F427D4EB4FL ^ (long)n2 ^ 0x7898831A2DB9E71CL);
                    int cfr_ignored_19 = (int)(0x85794F3B543F7150L ^ (long)n2 ^ 0x630664CD1986A723L);
                    n3 = Integer.reverse(n2 ^ 0xFE1A1743 ^ 0xBE8CDD13) + -616666360 - -616666360;
                    int cfr_ignored_20 = (int)(0xA826ED28ADA3A2D2L ^ (long)n2 ^ 0x272197F4BE82FD9CL);
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x7E4C05FE ^ 0xBE8CDD13) ^ 0xAF71E5528D117CC1L ^ 0xAF71E5528D117CC1L);
                    --n;
                    continue block22;
                }
                case -799695144: {
                    int cfr_ignored_21 = (Integer.rotateRight(0xE9CAB31A ^ n2, 16) + 1407799137) * -372591845;
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xA8CD9993 ^ 0xBE8CDD13)));
                    int cfr_ignored_22 = (Integer.rotateRight(0x6BF8129F ^ n2, 16) - 392683644) * 1811419807;
                    n3 = Integer.reverse(n2 ^ 0xBF654951 ^ 0xBE8CDD13);
                    int cfr_ignored_23 = (Integer.rotateRight(0xCFAC0C57 ^ n2, 12) - 707993028) * -810808233;
                    n3 = Integer.reverse(n2 ^ 0x7E4C05FE ^ 0xBE8CDD13) + 1328121436 - 1328121436;
                    n += 5;
                    continue block22;
                }
                case 1661223072: {
                    int cfr_ignored_24 = Integer.rotateRight(0xB08A0866 ^ n2, 9) - 1695851413;
                    n3 = Integer.reverse(n2 ^ 0x4F9FF25 ^ 0xBE8CDD13) + -858598353 - -858598353;
                    int cfr_ignored_25 = (Integer.rotateLeft(0x7C0D2B70 ^ n2, 18) + 167109067) * 2081237873;
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x7E4C05FE ^ 0xBE8CDD13) ^ 0x2E5887A32A3B806EL ^ 0x2E5887A32A3B806EL);
                    n += 5;
                    continue block22;
                }
                case -1773243349: {
                    int cfr_ignored_26 = (Integer.rotateRight(0xEB09AED3 ^ n2, 16) + 2055850696) * -351686957;
                    n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xD3EA7794 ^ 0xBE8CDD13)));
                    int cfr_ignored_27 = (Integer.rotateRight(0xB5320A1A ^ n2, 9) + -177416095) * -1255011813;
                    n3 = Integer.reverse(n2 ^ 0x7E4C05FE ^ 0xBE8CDD13) + -1339902240 - -1339902240;
                    continue block22;
                }
                case -599490594: {
                    int cfr_ignored_28 = (Integer.rotateRight(0xBC10937A ^ n2, 10) + -899712255) * -1139764357;
                    try {
                        n += 4;
                        n3 = Integer.reverse(n2 ^ 0x7E4C05FE ^ 0xBE8CDD13) ^ 0x1E893BDD ^ 0x1E893BDD;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(n2 ^ 0x7E4C05FE ^ 0xBE8CDD13) ^ 0x8D21A461 ^ 0x8D21A461;
                    }
                    n += 5;
                    continue block22;
                }
                case -1870144838: {
                    int cfr_ignored_29 = (Integer.rotateLeft(0xF5CC1C91 ^ n2, 17) + -938142518) * -171172719;
                    int cfr_ignored_30 = (int)(0x377EB2AC27D4EB4FL ^ (long)n2 ^ 0x9828831A2DB9C32CL);
                    n3 = (int)((long)Integer.reverse(n2 ^ 0x867D31D8 ^ 0xBE8CDD13) ^ 0x5FBDBF3B6C4795E5L ^ 0x5FBDBF3B6C4795E5L);
                    int cfr_ignored_31 = (Integer.rotateRight(0x3598ECFF ^ n2, 9) - -2115874276) * 899214591;
                    n3 = Integer.reverse(n2 ^ 0x7E4C05FE ^ 0xBE8CDD13) + -1043135039 - -1043135039;
                    n += 3;
                    continue block22;
                }
                case -1907761207: {
                    int cfr_ignored_32 = Integer.rotateLeft(0x3E8899A1 ^ n2, 10) + -1763165766;
                    int cfr_ignored_33 = (int)(0xFC3A379C27D4EB4FL ^ (long)n2 ^ 0x9248831A2DB855A5L);
                    n3 = Integer.reverse(n2 ^ 0x60B533DD ^ 0xBE8CDD13);
                    int cfr_ignored_34 = Integer.rotateLeft(0x1C245560 ^ n2, 6) + 1824781787;
                    int cfr_ignored_35 = (int)(0xC9BEFBCF18ADBA32L ^ (long)n2 ^ 0xAEEFDE88F423EACL);
                    n3 = Integer.reverse(n2 ^ 0x7E4C05FE ^ 0xBE8CDD13) + -1083870802 - -1083870802;
                    n -= 5;
                    continue block22;
                }
                case 1399809994: {
                    return f2;
                }
            }
            int cfr_ignored_36 = Integer.rotateLeft(0x2E2DDBA1 ^ n2, 8) + -1679083590;
            int cfr_ignored_37 = (int)(0xEC9F759C27D4EB4FL ^ (long)n2 ^ 0x1648831A2DB874EFL);
            n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x7E4C05FE ^ 0xBE8CDD13)));
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int[] jqd_2() {
        var1_1 = 0.0;
        var3_2 = 0;
        var4_3 = 0;
        var5_4 = 0.0;
        var7_5 = 0.0;
        var9_6 = 0;
        var10_7 = 0;
        var11_8 = 0;
        var13_9 = null;
        var16_10 = 0;
        var14_11 = 1408465277;
        var14_11 = Integer.rotateLeft(var14_11 * -1451728465, 4) ^ 2123220277;
        var14_11 = System.identityHashCode(this) ^ var14_11;
        var15_12 = (int)((long)Integer.reverse(var14_11 ^ -789373408 ^ -1066121264) ^ 6763419945602922345L ^ 6763419945602922345L);
        block25: while (true) {
            if ((var16_10 = Integer.reverse(var15_12) ^ var14_11 ^ -1066121264) == 7341665) {
                return var13_9;
            }
            if (var16_10 == -1773511796) ** GOTO lbl-1000
            (Integer.rotateRight(239095670 ^ var14_11, 4) - -1104724347) * 239095671;
            if (var16_10 != 46233427) {
                switch (var16_10) {
                    case 443451155: {
                        (Integer.rotateRight(-97116902 ^ var14_11, 18) + 1357587809) * -97116901;
                        var5_4 = Math.toRadians(this.jnz.nextInt(var3_2, var4_3));
                        var7_5 = this.jnz.nextInt(1820292265 - 1820292259, 360237550 + -360237526);
                        var9_6 = (int)(-(Math.sin(var5_4) * var7_5));
                        var10_7 = this.jnz.nextInt(0, Integer.rotateLeft(1028407458 ^ 1028604066, 18));
                        var11_8 = (int)(Math.cos(var5_4) * var7_5);
                        var12_13 = tkhsh.rmm(tkhsh.mc.field_1724);
                        var13_9 = new int[]{(int)var12_13.field_1352 + var9_6, (int)var12_13.field_1351 + var10_7, (int)var12_13.field_1350 + var11_8};
                        (int)(-5473926730447813437L ^ (long)var14_11 ^ -7766212388006607424L);
                        var15_12 = Integer.reverse(var14_11 ^ 7341665 ^ -1066121264);
                        continue block25;
                    }
                    case -1986432170: {
                        Integer.rotateLeft(-861115859 ^ var14_11, 12) - -851543378;
                        (int)(1017466139499096911L ^ (long)var14_11 ^ 8453400649033953772L);
                        var4_3 = var3_2 + 1;
                        try {
                            if ((-3930154229052542221L ^ (long)var14_11 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var15_12 = Integer.reverse(var14_11 ^ 443451155 ^ -1066121264) + 2071361013 - 2071361013;
                        }
                        catch (ArithmeticException v0) {
                            var15_12 = (int)((long)Integer.reverse(var14_11 ^ 443451155 ^ -1066121264) ^ 3486137321687043763L ^ 3486137321687043763L);
                        }
                        continue block25;
                    }
                    case -789373408: {
                        (Integer.rotateLeft(-357288040 ^ var14_11, 16) + 1882217123) * -357288039;
                        var1_1 = ((Number)tkhsh.mc.field_1690.method_41808().method_41753()).doubleValue();
                        var3_2 = Math.round((float)((double)tkhsh.sjz(tkhsh.mc.field_1724) - var1_1 * Double.longBitsToDouble(-6340176117573911749L ^ -7499853021621814469L)));
                        var4_3 = Math.round((float)((double)tkhsh.mc.field_1724.method_36454() + var1_1 * tkhsh.shsy_2(2765237308564254758L ^ 1839747585139617830L))) + 1;
                        if (var4_3 <= var3_2) {
                            try {
                                var16_10 -= 4;
                                var15_12 = Integer.reverse(Integer.reverse(Integer.reverse(var14_11 ^ -1986432170 ^ -1066121264)));
                            }
                            catch (UnsupportedOperationException v1) {
                                var15_12 = Integer.reverse(Integer.reverse(Integer.reverse(var14_11 ^ -1986432170 ^ -1066121264)));
                            }
                            continue block25;
                        }
                        try {
                            var16_10 += 4;
                            if ((-7248993647955275541L ^ (long)var14_11 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var15_12 = Integer.reverse(var14_11 ^ 443451155 ^ -1066121264);
                        }
                        catch (IllegalStateException v2) {
                            var15_12 = Integer.reverse(var14_11 ^ 443451155 ^ -1066121264) ^ -114668378 ^ -114668378;
                        }
                        continue block25;
                    }
                    case 422831730: {
                        Integer.rotateLeft(-1451779540 ^ var14_11, 8) - -1982248305;
                        var15_12 = Integer.reverse(var14_11 ^ -999473521 ^ -1066121264);
                        (Integer.rotateLeft(-1249461091 ^ var14_11, 9) - -5343682) * -1249461091;
                        (int)(8589510868374711119L ^ (long)var14_11 ^ -2868648814175501383L);
                        (int)(-4337701412572296427L ^ (long)var14_11 ^ 4208771519709194827L);
                        var15_12 = Integer.reverse(var14_11 ^ 1202174639 ^ -1066121264);
                        (int)(6671752517325991019L ^ (long)var14_11 ^ 6508015520899470588L);
                        var15_12 = Integer.reverse(var14_11 ^ -789373408 ^ -1066121264) ^ 56998051 ^ 56998051;
                        var16_10 += 3;
                        continue block25;
                    }
                    case 1949626185: {
                        Integer.rotateRight(-1439652085 ^ var14_11, 8) + -1606297200;
                        var15_12 = (int)((long)Integer.reverse(var14_11 ^ -1772427792 ^ -1066121264) ^ -8395404330822109539L ^ -8395404330822109539L);
                        (Integer.rotateLeft(590004636 ^ var14_11, 7) - 1183519007) * 590004637;
                        (int)(7431664989243684937L ^ (long)var14_11 ^ -2689361922587532396L);
                        var15_12 = Integer.reverse(var14_11 ^ -1074340716 ^ -1066121264) + 1553701840 - 1553701840;
                        (int)(-1122514476407955707L ^ (long)var14_11 ^ -900957131062358775L);
                        var15_12 = Integer.reverse(var14_11 ^ -789373408 ^ -1066121264) + -1317213966 - -1317213966;
                        ++var16_10;
                        continue block25;
                    }
                    case 1798524004: {
                        Integer.rotateRight(-832381717 ^ var14_11, 12) + 39215024;
                        var15_12 = Integer.reverse(var14_11 ^ -1971463867 ^ -1066121264) ^ -1303858149 ^ -1303858149;
                        Integer.rotateRight(-329798041 ^ var14_11, 16) - -1560560204;
                        try {
                            var16_10 -= 3;
                            var15_12 = Integer.reverse(var14_11 ^ -789373408 ^ -1066121264) ^ -222249526 ^ -222249526;
                        }
                        catch (IllegalStateException v3) {
                            var15_12 = Integer.reverse(var14_11 ^ -789373408 ^ -1066121264);
                        }
                        var16_10 -= 5;
                        continue block25;
                    }
                }
            }
            ** GOTO lbl165
lbl-1000:
            // 1 sources

            {
                (Integer.rotateLeft(862128345 ^ var14_11, 9) + 1029419394) * 862128345;
                (int)(-1021852141585372337L ^ (long)var14_11 ^ -5712671978860032398L);
                var15_12 = (int)((long)Integer.reverse(var14_11 ^ -1256581716 ^ -1066121264) ^ -4271416299321160735L ^ -4271416299321160735L);
                (Integer.rotateRight(340298143 ^ var14_11, 5) - 2032552316) * 340298143;
                var15_12 = Integer.reverse(Integer.reverse(Integer.reverse(var14_11 ^ -789373408 ^ -1066121264)));
                var16_10 -= 5;
                continue block25;
                case -329730691: {
                    Integer.rotateLeft(845978816 ^ var14_11, 9) + 528783995;
                    var15_12 = Integer.reverse(var14_11 ^ 2064647469 ^ -1066121264);
                    Integer.rotateLeft(973450593 ^ var14_11, 10) + 185441786;
                    (int)(-524947137225233585L ^ (long)var14_11 ^ -303848826388063041L);
                    try {
                        var16_10 -= 3;
                        if ((1753240188133566183L ^ (long)var14_11 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        var15_12 = Integer.reverse(var14_11 ^ -789373408 ^ -1066121264) + 156882665 - 156882665;
                    }
                    catch (NoSuchElementException v4) {
                        var15_12 = Integer.reverse(Integer.reverse(Integer.reverse(var14_11 ^ -789373408 ^ -1066121264)));
                    }
                    continue block25;
                }
                case -176255252: {
                    Integer.rotateRight(-464447421 ^ var14_11, 15) + -1439723688;
                    var15_12 = Integer.reverse(var14_11 ^ -312085804 ^ -1066121264) + -134578188 - -134578188;
                    (Integer.rotateRight(329425278 ^ var14_11, 5) - 1695493501) * 329425279;
                    var15_12 = Integer.reverse(var14_11 ^ -789373408 ^ -1066121264) + -2147065584 - -2147065584;
                    continue block25;
                }
                case 978727467: {
                    (Integer.rotateLeft(-728704748 ^ var14_11, 13) - -1041766233) * -728704747;
                    var15_12 = Integer.reverse(Integer.reverse(Integer.reverse(var14_11 ^ 1963603124 ^ -1066121264)));
                    Integer.rotateRight(1749877767 ^ var14_11, 16) - -1515119596;
                    var15_12 = (int)((long)Integer.reverse(var14_11 ^ -789373408 ^ -1066121264) ^ 7186522177045318963L ^ 7186522177045318963L);
                    Integer.rotateLeft(1110300100 ^ var14_11, 11) - 132809207;
                    var16_10 -= 4;
                    continue block25;
                }
lbl165:
                // 1 sources

                Integer.rotateRight(1481709994 ^ var14_11, 14) + -1238385967;
                try {
                    var16_10 += 2;
                    if ((2486572301128674155L ^ (long)var14_11 | 1L) == 0L) {
                        throw new IllegalArgumentException();
                    }
                    var15_12 = Integer.reverse(Integer.reverse(Integer.reverse(var14_11 ^ -789373408 ^ -1066121264)));
                }
                catch (IllegalArgumentException v5) {
                    var15_12 = Integer.reverse(var14_11 ^ -789373408 ^ -1066121264);
                }
                var16_10 += 2;
                continue block25;
                case -1317995537: {
                    Integer.rotateLeft(-1275928092 ^ var14_11, 9) - -825820713;
                    var15_12 = Integer.reverse(var14_11 ^ 898673808 ^ -1066121264);
                    (Integer.rotateLeft(1717114741 ^ var14_11, 15) - 1764193894) * 1717114741;
                    (int)(-6562948312405316785L ^ (long)var14_11 ^ -8079313583043189754L);
                    var15_12 = Integer.reverse(var14_11 ^ -789373408 ^ -1066121264) ^ -56241739 ^ -56241739;
                    ++var16_10;
                    continue block25;
                }
                case 413724403: {
                    (Integer.rotateRight(-165512361 ^ var14_11, 17) - -762671420) * -165512361;
                    var15_12 = (int)((long)Integer.reverse(var14_11 ^ 1931852562 ^ -1066121264) ^ -2522013422524668061L ^ -2522013422524668061L);
                    (Integer.rotateRight(396501971 ^ var14_11, 5) + -520096312) * 396501971;
                    var15_12 = Integer.reverse(Integer.reverse(Integer.reverse(var14_11 ^ -789373408 ^ -1066121264)));
                }
            }
            (Integer.rotateRight(1910051550 ^ var14_11, 17) - -844699619) * 1910051551;
            var15_12 = Integer.reverse(var14_11 ^ -789373408 ^ -1066121264) + 1233990670 - 1233990670;
        }
    }

    private int[] thjy() {
        return new int[]{this.jnz.nextInt(0, 4) * 90, this.jnz.nextInt(-1, 2) * 90};
    }

    private int[] zght_3(int[] nArray) {
        int n;
        int n2;
        int n3 = nArray[0];
        int n4 = n2 = nArray[1];
        for (n = 150; n > 0 && Math.abs(n4 - n2) != 90; --n) {
            n4 = this.jnz.nextInt(-2, 2) * 90;
        }
        n = n3;
        for (int i = 5; i > 0 && Math.abs(n - n3) != 90; --i) {
            n = this.jnz.nextInt(0, 4) * 90;
        }
        return new int[]{n, n4};
    }

    private int[] rhr(int[] nArray, int[] nArray2, int n) {
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int[] nArray3 = null;
        int n5 = 0;
        int n6 = -1808555478;
        n6 = Integer.rotateLeft(n6 * -944492675, 25) ^ 0x5DC85EA2;
        n6 = Integer.rotateLeft(System.identityHashCode(this) ^ n6, 11);
        n6 = (nArray != null ? System.identityHashCode(nArray) : 0) ^ n6;
        int n7 = (int)((long)(n6 - 369021591) ^ 0xCCAA4F1E52860DCAL ^ 0xCCAA4F1E52860DCAL);
        block29: while (true) {
            switch (n6 - n7) {
                case -846343680: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x6D2CE9ED ^ n6, 16) - 1020130030;
                    int cfr_ignored_1 = (int)(0xAF9E47D027D4EB4FL ^ (long)n6 ^ 0x72D0831A2DB8F2EDL);
                    d3 = 0.0;
                    try {
                        n5 -= 3;
                        if ((0x515FD9893A7BB129L ^ (long)n6 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n7 = (int)((long)(n6 - -1148412147) ^ 0x9A40A1F4AA4C36FEL ^ 0x9A40A1F4AA4C36FEL);
                    }
                    catch (IllegalStateException illegalStateException) {
                        n7 = (int)((long)(n6 - -1148412147) ^ 0xC0DFC8BED930776AL ^ 0xC0DFC8BED930776AL);
                    }
                    n5 += 2;
                    continue block29;
                }
                case 369021591: {
                    int cfr_ignored_2 = Integer.rotateRight(0xF0081A2 ^ n6, 4) + -714255911;
                    d = Math.toRadians(nArray2[0]);
                    d2 = tkhsh.ghbgh(nArray2[1]);
                    d3 = n;
                    n2 = (int)(Math.sin(d2) * d3);
                    if (d2 != 0.0) {
                        try {
                            --n5;
                            n7 = (int)((long)(n6 - -846343680) ^ 0x723A67D062A6B6C3L ^ 0x723A67D062A6B6C3L);
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n7 = (int)((long)(n6 - -846343680) ^ 0x75125B57A9581D05L ^ 0x75125B57A9581D05L);
                        }
                        n5 -= 5;
                        continue block29;
                    }
                    try {
                        n7 = (int)((long)(n6 - -1148412147) ^ 0x84A0BBDEAEFED80BL ^ 0x84A0BBDEAEFED80BL);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n7 = (int)((long)(n6 - -1148412147) ^ 0xC5BBBBC483FD56B1L ^ 0xC5BBBBC483FD56B1L);
                    }
                    n5 += 3;
                    continue block29;
                }
                case -1148412147: {
                    int cfr_ignored_3 = (Integer.rotateLeft(0x68C12CF9 ^ n6, 16) + -1279127198) * 1757490425;
                    int cfr_ignored_4 = (int)(0xAA7382C427D4EB4FL ^ (long)n6 ^ 0xF8F8831A2DB8F936L);
                    n3 = (int)(-(Math.sin(d) * d3));
                    n4 = (int)(tkhsh.jaw(d) * d3);
                    nArray3 = new int[]{nArray[0] + n3, nArray[1] + n2, nArray[2] + n4};
                    n7 = Integer.reverse(Integer.reverse(n6 - -40483684));
                    int cfr_ignored_5 = (Integer.rotateRight(0x929C6436 ^ n6, 5) - -984759867) * -1835244489;
                    n5 += 3;
                    continue block29;
                }
                case -973051081: {
                    int cfr_ignored_6 = Integer.rotateRight(0x998E8C06 ^ n6, 6) - -1667197963;
                    n7 = (int)((long)(n6 - 1520440907) ^ 0x271191579B1D2935L ^ 0x271191579B1D2935L);
                    int cfr_ignored_7 = Integer.rotateLeft(0xEA2CCA04 ^ n6, 16) - 1607079351;
                    int cfr_ignored_8 = (int)(0xB0B4E50E983B7CFDL ^ (long)n6 ^ 0x376DFCC502DCCCB8L);
                    n7 = Integer.reverse(Integer.reverse(n6 - -106134014));
                    int cfr_ignored_9 = (int)(0x4B85B23CB69E4954L ^ (long)n6 ^ 0x9909A18F698F3ADAL);
                    n7 = Integer.reverse(Integer.reverse(n6 - 369021591));
                    n5 += 4;
                    continue block29;
                }
                case -1802709414: {
                    int cfr_ignored_10 = (Integer.rotateLeft(0xFCCABF90 ^ n6, 18) + -1595223637) * -53821551;
                    n7 = n6 - -1187757813 ^ 0x200C3D44 ^ 0x200C3D44;
                    int cfr_ignored_11 = Integer.rotateRight(0x20C44FE3 ^ n6, 7) + -64795720;
                    n7 = n6 - 369021591;
                    continue block29;
                }
                case 100214340: {
                    int cfr_ignored_12 = (Integer.rotateRight(0xA3A318FB ^ n6, 7) + -719477344) * -1549592325;
                    n7 = (int)((long)(n6 - 695353856) ^ 0x10F6F2507FC3DA31L ^ 0x10F6F2507FC3DA31L);
                    int cfr_ignored_13 = Integer.rotateRight(0xB533FE62 ^ n6, 9) + -173445863;
                    n7 = n6 - 369021591;
                    n5 += 2;
                    continue block29;
                }
                case -542678262: {
                    int cfr_ignored_14 = Integer.rotateLeft(0x80C85C49 ^ n6, 3) + -1667183598;
                    int cfr_ignored_15 = (int)(0x427AF27427D4EB4FL ^ (long)n6 ^ 0x1998831A2DB92924L);
                    n7 = n6 - 637402297 ^ 0xE035E1A2 ^ 0xE035E1A2;
                    int cfr_ignored_16 = (Integer.rotateRight(0xFC64B4BA ^ n6, 18) + -1802534463) * -60508997;
                    n7 = (int)((long)(n6 - 369021591) ^ 0x1E3162CF9A50D1DDL ^ 0x1E3162CF9A50D1DDL);
                    n5 -= 4;
                    continue block29;
                }
                case 684199686: {
                    int cfr_ignored_17 = Integer.rotateLeft(0x9A81C26C ^ n6, 6) - -1173083569;
                    n7 = n6 - -89963354;
                    int cfr_ignored_18 = Integer.rotateLeft(0x921A91CD ^ n6, 5) - -1248508146;
                    int cfr_ignored_19 = (int)(0x50A83FF027D4EB4FL ^ (long)n6 ^ 0x8290831A2DB90C81L);
                    try {
                        n5 -= 5;
                        n7 = (int)((long)(n6 - 369021591) ^ 0xAD9A67A28D3F27CBL ^ 0xAD9A67A28D3F27CBL);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n7 = Integer.reverse(Integer.reverse(n6 - 369021591));
                    }
                    n5 -= 5;
                    continue block29;
                }
                case 1199984749: {
                    int cfr_ignored_20 = (Integer.rotateLeft(0x46FB0374 ^ n6, 11) - -1664939449) * 1190855541;
                    n7 = n6 - 369021591 ^ 0x6E2E3C18 ^ 0x6E2E3C18;
                    int cfr_ignored_21 = Integer.rotateRight(0x6B4D854E ^ n6, 16) - 46187437;
                    continue block29;
                }
                case -160813767: {
                    int cfr_ignored_22 = Integer.rotateLeft(0x49673525 ^ n6, 12) - -404943178;
                    int cfr_ignored_23 = (int)(0x8BD59B1827D4EB4FL ^ (long)n6 ^ 0xCB40831A2DB8BA7AL);
                    try {
                        --n5;
                        if ((0x858F5F660984520FL ^ (long)n6 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n7 = n6 - 369021591 ^ 0x771306FE ^ 0x771306FE;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n7 = (int)((long)(n6 - 369021591) ^ 0xB3745C78176E9B8AL ^ 0xB3745C78176E9B8AL);
                    }
                    n5 -= 2;
                    continue block29;
                }
                case 1675219915: {
                    int cfr_ignored_24 = (Integer.rotateLeft(0x94B76495 ^ n6, 5) - 110284102) * -1799920491;
                    int cfr_ignored_25 = (int)(0x5605CAA827D4EB4FL ^ (long)n6 ^ 0x6820831A2DB901DAL);
                    n7 = n6 - 369021591;
                    n5 += 2;
                    continue block29;
                }
                case 648507300: {
                    int cfr_ignored_26 = Integer.rotateLeft(0x578C8389 ^ n6, 13) + -1637774126;
                    int cfr_ignored_27 = (int)(0x953E2DB427D4EB4FL ^ (long)n6 ^ 0xA618831A2DB887ADL);
                    n7 = n6 - 1614620039 ^ 0xBB13C49D ^ 0xBB13C49D;
                    int cfr_ignored_28 = Integer.rotateLeft(0x6C688764 ^ n6, 16) - 621151319;
                    try {
                        --n5;
                        if ((0xDEA4DBA35F92F35DL ^ (long)n6 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n7 = Integer.reverse(Integer.reverse(n6 - 369021591));
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n7 = n6 - 369021591 + 972805526 - 972805526;
                    }
                    n5 += 5;
                    continue block29;
                }
                case 473917415: {
                    int cfr_ignored_29 = Integer.rotateLeft(0x8CE5422D ^ n6, 4) - 337683118;
                    int cfr_ignored_30 = (int)(0x4E57EC1027D4EB4FL ^ (long)n6 ^ 0x2550831A2DB9317EL);
                    n7 = n6 - -1703674597;
                    int cfr_ignored_31 = Integer.rotateLeft(0x33F2A740 ^ n6, 9) + 1321197563;
                    n7 = n6 - 369021591 ^ 0xFEC42379 ^ 0xFEC42379;
                    continue block29;
                }
                case -603425171: {
                    int cfr_ignored_32 = Integer.rotateLeft(0xF48E5D0D ^ n6, 17) - -1583684658;
                    int cfr_ignored_33 = (int)(0x363CF33027D4EB4FL ^ (long)n6 ^ 0x1B10831A2DB9C1A8L);
                    n7 = n6 - -1205167332 ^ 0xD2FF1153 ^ 0xD2FF1153;
                    int cfr_ignored_34 = (Integer.rotateLeft(0x9C208BD9 ^ n6, 6) + -330396030) * -1675588647;
                    int cfr_ignored_35 = (int)(0x5E9225E427D4EB4FL ^ (long)n6 ^ 0xB6B8831A2DB910F5L);
                    n7 = n6 - 369021591;
                    continue block29;
                }
                case -40483684: {
                    return nArray3;
                }
            }
            int cfr_ignored_36 = Integer.rotateRight(0x362C64C3 ^ n6, 9) + -1816276264;
            n7 = n6 - 369021591;
        }
    }

    @Generated
    public static tkhsh zza_6() {
        block0: {
            int n = nz_2.thjf(-727317337);
            int n2 = n ^ 0xCD750CF6;
            if ((n2 ^ n) == -847966986) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x19D30851 ^ n, 6) + 619421962) * 433260625;
            int cfr_ignored_1 = (int)(0xDB61A66C27D4EB4FL ^ (long)n ^ 0xB1A8831A2DB81B12L);
        }
        return dnh_2;
    }

    private void dmf(shw_3 shw2) {
        int n = nz_2.thjf(-241022653);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 11);
        shw_3 shw3 = shw2;
        n = (shw3 != null ? System.identityHashCode(shw3) : 0) ^ n;
        int n2 = n ^ 0xD2DDF3D;
        if ((n2 ^ n) != 221110077) {
            int cfr_ignored_0 = (Integer.rotateRight(0xFC8F967E ^ n, 18) - -1715414915) * -57698689;
        }
        this.smh_2(shw2.ssha_2(), shw2.skz_4());
    }

    private void jjk(btt btt2) {
        int n = -1907595726;
        n = Integer.rotateLeft(n * 800053117, 18) ^ 0x791EAC36;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 11);
        int n2 = n ^ 0xA4AD54F6;
        if ((n2 ^ n) != -1532144394) {
            int cfr_ignored_0 = (0x2AE132C4 ^ n) - -420642382;
        }
        this.rth_2();
    }

    private static String saz_2(String string, int n, int n2, int n3) {
        int n4 = 2099609052;
        n4 = Integer.rotateLeft(n4 * -1654213809, 3) ^ 0xAFEB56F9;
        n4 = n2 ^ n4;
        int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 19)) ^ 0xE64C4D2F;
        if ((n5 ^ n4) != -431207121) {
            int cfr_ignored_0 = (0x9B6930F3 ^ n4) + 1223595137;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xB7F505BB ^ n2 - i) + thrn, 19) ^ rmsh + i * 1147859267));
        }
        return new String(cArray);
    }

    private static fy khfa(khd khd2) {
        block0: {
            int n = nz_2.thjf(61117999);
            int n2 = n ^ 0x42E7AFA0;
            if ((n2 ^ n) == 1122480032) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x4143398F ^ n, 11) - -343828596;
        }
        return khd2.sdh_2();
    }

    private static String sjd_4(fy fy2) {
        block0: {
            int n = 1387212895;
            n = Integer.rotateLeft(n * 1632197337, 6) ^ 0xDCE608E6;
            fy fy3 = fy2;
            n = Integer.rotateLeft((fy3 != null ? System.identityHashCode(fy3) : 0) ^ n, 16);
            int n2 = n ^ 0x9CC24183;
            if ((n2 ^ n) == -1664990845) break block0;
            int cfr_ignored_0 = (0xCE6D71DC ^ n) + 411916758;
        }
        return fy2.getName();
    }

    private static int shghd(String string) {
        block0: {
            int n = -1333707799;
            n = Integer.rotateLeft(n * 1597452511, 26) ^ 0x937FA701;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xE19F122E;
            if ((n2 ^ n) == -509668818) break block0;
            int cfr_ignored_0 = (0x511E29C7 ^ n) - -1540454799;
        }
        return string.hashCode();
    }

    private static String tds_5(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 546800624;
            n4 = Integer.rotateLeft(n4 * -2067268021, 7) ^ 0x1FDFA0EF;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 6);
            int n5 = (n4 = n ^ n4) ^ 0xAB5ACFC7;
            if ((n5 ^ n4) == -1420111929) break block0;
            int cfr_ignored_0 = (0x8BCD4C37 ^ n4) - 510110825;
        }
        return tkhsh.saz_2(string, n, n2, n3);
    }

    private static boolean dbgh(String string, Object object) {
        block0: {
            int n = 1612659602;
            int n2 = (n = Integer.rotateLeft(n * -1996029863, 23) ^ 0x38D49434) ^ 0x3B45B480;
            if ((n2 ^ n) == 994423936) break block0;
            int cfr_ignored_0 = (0x5B5A8F12 ^ n) - -1124905845;
        }
        return string.equals(object);
    }

    private static int zsgh_2(int n, int n2) {
        block0: {
            int n3 = 1783606212;
            n3 = Integer.rotateLeft(n3 * 1403824117, 16) ^ 0xDDB6E6B3;
            int n4 = (n3 = n ^ n3) ^ 0x4DC09912;
            if ((n4 ^ n3) == 1304467730) break block0;
            int cfr_ignored_0 = (0x278F32D6 ^ n3) - 1343385620;
        }
        return Math.min(n, n2);
    }

    private static int sll_2(Color color) {
        block0: {
            int n = 1237515389;
            n = Integer.rotateLeft(n * 608592649, 10) ^ 0xF8111D88;
            Color color2 = color;
            n = (color2 != null ? System.identityHashCode(color2) : 0) ^ n;
            int n2 = n ^ 0x13DA7D90;
            if ((n2 ^ n) == 333086096) break block0;
            int cfr_ignored_0 = (0x5A1881ED ^ n) + 986093944;
        }
        return color.getBlue();
    }

    private static double dght(class_243 class_2432, class_243 class_2433) {
        block0: {
            int n = 103604952;
            n = Integer.rotateLeft(n * 2140573629, 24) ^ 0x63E0B5F8;
            class_243 class_2434 = class_2432;
            n = (class_2434 != null ? System.identityHashCode(class_2434) : 0) ^ n;
            int n2 = n ^ 0x8D72545D;
            if ((n2 ^ n) == -1921887139) break block0;
            int cfr_ignored_0 = (0x8B5EB685 ^ n) - 430498562;
        }
        return class_2432.method_1022(class_2433);
    }

    private static double bzdh_2(double d, double d2) {
        block0: {
            int n = 1051056544;
            n = Integer.rotateLeft(n * 1840148969, 25) ^ 0xAA2F49D2;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 22);
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d2) ^ n, 17);
            int n2 = n ^ 0xC2DE40DC;
            if ((n2 ^ n) == -1025621796) break block0;
            int cfr_ignored_0 = (0xFC7B997C ^ n) + -1272789107;
        }
        return Math.min(d, d2);
    }

    private static double skz_3(double d, double d2) {
        block0: {
            int n = 3324107;
            n = Integer.rotateLeft(n * 960591753, 22) ^ 0xA555C2C5;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d2) ^ n, 21);
            int n2 = n ^ 0x461B4F68;
            if ((n2 ^ n) == 1176194920) break block0;
            int cfr_ignored_0 = (0x4629F7A3 ^ n) + 1595967785;
        }
        return Math.max(d, d2);
    }

    private static float sjz(class_746 class_7462) {
        block0: {
            int n = -110910231;
            n = Integer.rotateLeft(n * -1500378439, 15) ^ 0x5D6CA72C;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0x1A7B0ED4;
            if ((n2 ^ n) == 444272340) break block0;
            int cfr_ignored_0 = (0xE318AA3D ^ n) - 805079740;
        }
        return class_7462.method_36454();
    }

    private static double shsy_2(long l) {
        block0: {
            int n = 995164104;
            int n2 = (n = Integer.rotateLeft(n * -1175811607, 23) ^ 0x913F2F87) ^ 0x549E5005;
            if ((n2 ^ n) == 1419661317) break block0;
            int cfr_ignored_0 = (0x6FCEAFCD ^ n) - -1687777043;
        }
        return Double.longBitsToDouble(l);
    }

    private static class_243 rmm(class_746 class_7462) {
        block0: {
            int n = nz_2.thjf(-1492850871);
            class_746 class_7463 = class_7462;
            n = Integer.rotateLeft((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 6);
            int n2 = n ^ 0xC0D59C82;
            if ((n2 ^ n) == -1059742590) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x67D17BCB ^ n, 15) + -1766089520;
        }
        return class_7462.method_33571();
    }

    private static double ghbgh(double d) {
        block0: {
            int n = 509317364;
            n = Integer.rotateLeft(n * 835830313, 24) ^ 0x6786515;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 7);
            int n2 = n ^ 0xEE14B9E3;
            if ((n2 ^ n) == -300631581) break block0;
            int cfr_ignored_0 = (0xF04F2917 ^ n) + -565241912;
        }
        return Math.toRadians(d);
    }

    private static double jaw(double d) {
        block0: {
            int n = -752603700;
            n = Integer.rotateLeft(n * -2111439729, 18) ^ 0x7A99E076;
            n = Integer.rotateRight((int)Double.doubleToLongBits(d) ^ n, 3);
            int n2 = n ^ 0x10955CDB;
            if ((n2 ^ n) == 278224091) break block0;
            int cfr_ignored_0 = (0xC3B17117 ^ n) - 1861875133;
        }
        return Math.cos(d);
    }

    private static String[] tda_6(String string) {
        block0: {
            int n = -1451939380;
            int n2 = (n = Integer.rotateLeft(n * 406744863, 15) ^ 0xBDC6173C) ^ 0x29B94193;
            if ((n2 ^ n) == 700006803) break block0;
            int cfr_ignored_0 = (0x80CC685F ^ n) + 1085719946;
        }
        return string.split("\u0002\u0015", -1);
    }

    private static CallSite zt_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -565714997;
            n3 = Integer.rotateLeft(n3 * -1827192955, 27) ^ 0xC33517A4;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateRight((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 14);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 24);
            int n4 = n3 ^ 0x1BB36959;
            if ((n4 ^ n3) != 464742745) {
                int cfr_ignored_0 = (0xC5F4B692 ^ n3) + -598641087;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ trs_2 ^ string.hashCode() ^ n2 + hkhd_2 + i * 1909807613) + trs_2) ^ hkhd_2));
            }
            String[] stringArray = tkhsh.tda_6(new String(cArray));
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

    private static String[] gt81mwjeei75(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite e00wkboy(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ q9t098vmtq1 ^ string.hashCode() ^ n2 + htij0uwf6f7 ^ i * 770056313 ^ q9t098vmtq1, 23) ^ htij0uwf6f7));
            }
            String[] stringArray = tkhsh.gt81mwjeei75(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

