/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_1297
 *  net.minecraft.class_1671
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1935
 *  net.minecraft.class_243
 *  net.minecraft.class_332
 *  org.joml.Vector2f
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_1671;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_243;
import net.minecraft.class_332;
import org.joml.Vector2f;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.bthw;
import us.m0vy.moondlc.m0vyguard.bdht;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bas_4;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.hz;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.st_4;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.zth_8;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Firework ESP", category=bzw.OTHER, desc="Shows indicators where fireworks were launched")
public class bqsh
extends bnq {
    private static bqsh jnw;
    private static final int ssf = 15;
    private static final String dthd = "Firework";
    private static final float khdd = 12.0f;
    private static final float hthh_2 = 4.0f;
    private static final float jz = 1.7f;
    private static final float zqf = 6.0f;
    private static final float sla = 0.55f;
    private static final float jhy_2 = 8.8f;
    private static final float jtj_2 = 2.5f;
    private static final float tskh = 7.1f;
    private static final float thghm = 2.1f;
    private final tay thsa_2 = new tay(this, "Fade Time (ms)").shth_7(Float.intBitsToFloat(-1622531004 + -1531978820)).dhbs_2(Float.intBitsToFloat(305508989 - -862358915)).rkh_3(Float.intBitsToFloat(Integer.rotateLeft(0x195DBFDC ^ 0x895DBF59, 23))).ssd_5(Float.intBitsToFloat(1198660862 - 46341374));
    private final Map khwa_2 = new ConcurrentHashMap();
    private final bql<shw_3> zfdh = this::btb;
    private final bql<bbgh> jghth = this::sthl_2;
    private static final int rgha_2 = -560385190;
    private static final int khzt_3 = -348033659;
    private static final int ghk = 1444330521;
    private static final int tthh = -1280903483;
    private static final int kc06v0ahjy6zl = -1052127146;
    private static final int lp3zfibxxn = -388015590;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int p5qeid36eha;

    public bqsh() {
        jnw = this;
    }

    @Override
    public void nt() {
        int n = 2084032430;
        n = Integer.rotateLeft(n * 1238197179, 14) ^ 0x7F275840;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x1190BF5C;
        if ((n2 ^ n) != 294698844) {
            int cfr_ignored_0 = (0x6DA770F2 ^ n) - -1451679073;
        }
        this.khwa_2.clear();
    }

    @Override
    public void nc() {
        int n = st_4.tham(-1288789570);
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 8);
        int n2 = n ^ 0xE49F3313;
        if ((n2 ^ n) != -459328749) {
            int cfr_ignored_0 = Integer.rotateLeft(0x57B192AD ^ n, 13) - -1562484178;
            int cfr_ignored_1 = (int)(0x95033C9027D4EB4FL ^ (long)n ^ 0x8450831A2DB887D7L);
        }
        this.khwa_2.clear();
    }

    private void zdz_4() {
        long l = System.currentTimeMillis();
        long l2 = (long)this.thsa_2.hkj();
        this.khwa_2.entrySet().removeIf(arg_0 -> bqsh.shhs_4(l, l2, arg_0));
        if (this.khwa_2.size() < 15) {
            for (class_1297 class_12972 : bqsh.mc.field_1687.method_18112()) {
                class_1671 class_16712;
                if (!(class_12972 instanceof class_1671) || this.khwa_2.containsKey((class_16712 = (class_1671)class_12972).method_5628())) continue;
                this.khwa_2.put(class_16712.method_5628(), new hz(class_16712.method_23317(), class_16712.method_23318(), class_16712.method_23321(), l, class_16712.method_7495()));
                if (this.khwa_2.size() < 15) continue;
                break;
            }
        }
    }

    private void zkk(class_332 class_3322, float f) {
        long l = System.currentTimeMillis();
        long l2 = (long)this.thsa_2.hkj();
        int n = 0;
        for (Map.Entry entry : this.khwa_2.entrySet()) {
            if (n >= 15) break;
            hz hz2 = (hz)entry.getValue();
            long l3 = l - hz2.thdhh_2;
            if (l3 > l2) continue;
            Vector2f vector2f = bthw.daz_7(new class_243(hz2.tzm_2, hz2.tsh_3, hz2.nh));
            if (vector2f.x == Float.MAX_VALUE || vector2f.y == Float.MAX_VALUE) continue;
            float f2 = 1.0f - (float)l3 / (float)l2;
            this.sqz_3(class_3322, hz2, vector2f.x, vector2f.y, f2);
            ++n;
        }
    }

    private void sqz_3(class_332 class_3322, hz hz2, float f, float f2, float f3) {
        int n = this.bfq(f3, 255);
        float f4 = brz_2.thtkh_2.shdf_2(dthd, 7.1f);
        float f5 = 19.3f + f4;
        float f6 = f - f5 / 2.0f;
        float f7 = f2 - 12.0f - 6.0f;
        Color color = new Color(0, 0, 0, this.bfq(f3, 100));
        Color color2 = this.aqb(bas_4.ghss(), n);
        bdht.sqr_2(class_3322.method_51448(), f6, f7, f5, 12.0f, zth_8.all(1.7f), byq.tkhw(color.getRGB()));
        float f8 = f6 + 4.0f;
        float f9 = f7 + 1.5999999f;
        this.bjl(class_3322, this.thydh(hz2), f8, f9, 0.55f, f3);
        brz_2.thtkh_2.zskh_4(class_3322.method_51448(), dthd, f8 + 8.8f + 2.5f, f7 + 2.1f, 7.1f, color2, 0.0f);
    }

    private class_1799 thydh(hz hz2) {
        class_1799 class_17992 = null;
        int n = 0;
        int n2 = 720372155;
        n2 = Integer.rotateLeft(n2 * 484879923, 19) ^ 0x18D544B7;
        int n3 = n2 ^ 0x24B3B66 ^ 0x3E353274 ^ 0x3E353274;
        while (true) {
            block26: {
                block43: {
                    block28: {
                        block39: {
                            block30: {
                                block24: {
                                    block31: {
                                        block41: {
                                            block38: {
                                                block37: {
                                                    block36: {
                                                        block25: {
                                                            block44: {
                                                                block42: {
                                                                    block32: {
                                                                        block33: {
                                                                            block27: {
                                                                                block40: {
                                                                                    block34: {
                                                                                        block35: {
                                                                                            block21: {
                                                                                                block29: {
                                                                                                    block22: {
                                                                                                        block23: {
                                                                                                            if ((n = n3 ^ n2) > 144679343) break block21;
                                                                                                            if (n > -476597648) break block22;
                                                                                                            if (n > -1365159171) break block23;
                                                                                                            if (n == -1708911500) break block24;
                                                                                                            if (n == -1365159171) break block25;
                                                                                                            int cfr_ignored_0 = (Integer.rotateLeft(0x219A9578 ^ n2, 7) + 370522307) * 563778937;
                                                                                                            break block26;
                                                                                                        }
                                                                                                        if (n == -690748953) break block27;
                                                                                                        if (n == -476597648) break block28;
                                                                                                        int cfr_ignored_1 = Integer.rotateLeft(0xCDF91161 ^ n2, 12) + -175719942;
                                                                                                        int cfr_ignored_2 = (int)(0xF4BBF5C27D4EB4FL ^ (long)n2 ^ 0x83C8831A2DB9B346L);
                                                                                                        break block26;
                                                                                                    }
                                                                                                    if (n > -89662300) break block29;
                                                                                                    if (n == -360324126) break block30;
                                                                                                    if (n == -89662300) break block31;
                                                                                                    break block26;
                                                                                                }
                                                                                                if (n == 38484838) break block32;
                                                                                                if (n == 144679343) break block33;
                                                                                                int cfr_ignored_3 = (Integer.rotateLeft(0xEBD3A3DC ^ n2, 16) - -1828817185) * -338451491;
                                                                                                break block26;
                                                                                            }
                                                                                            if (n > 1552032808) break block34;
                                                                                            if (n > 405562544) break block35;
                                                                                            if (n == 195371275) break block36;
                                                                                            if (n == 405562544) break block37;
                                                                                            break block26;
                                                                                        }
                                                                                        if (n == 657632641) break block38;
                                                                                        if (n == 1552032808) break block39;
                                                                                        int cfr_ignored_4 = Integer.rotateRight(0x58E8D2CB ^ n2, 14) + -930142768;
                                                                                        break block26;
                                                                                    }
                                                                                    if (n > 1935486088) break block40;
                                                                                    if (n == 1599605405) break block41;
                                                                                    if (n == 1935486088) break block42;
                                                                                    break block26;
                                                                                }
                                                                                if (n == 2039872625) break block43;
                                                                                if (n == 2055466557) break block44;
                                                                                break block26;
                                                                            }
                                                                            int cfr_ignored_5 = Integer.rotateLeft(0xDA981944 ^ n2, 14) - 2093526647;
                                                                            if (bqsh.addh(hz2.snz)) {
                                                                                n3 = n2 ^ 0xD73CC74B;
                                                                                int cfr_ignored_6 = (Integer.rotateLeft(0x2C229BD9 ^ n2, 8) + 1552842370) * 740465625;
                                                                                int cfr_ignored_7 = (int)(0xEE9035E427D4EB4FL ^ (long)n2 ^ 0x96B8831A2DB870F1L);
                                                                                n3 = (n2 ^ 0x89FA1AF) + 1544742068 - 1544742068;
                                                                                continue;
                                                                            }
                                                                            try {
                                                                                if ((0xCDE394F8D83412C9L ^ (long)n2 | 1L) == 0L) {
                                                                                    throw new ArithmeticException();
                                                                                }
                                                                                n3 = (n2 ^ 0x735D2C88) + -176928206 - -176928206;
                                                                            }
                                                                            catch (ArithmeticException arithmeticException) {
                                                                                n3 = n2 ^ 0x735D2C88;
                                                                            }
                                                                            n += 4;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_8 = (Integer.rotateRight(0x270E3A7E ^ n2, 7) - -1089031043) * 655243903;
                                                                        class_17992 = new class_1799((class_1935)class_1802.field_8639);
                                                                        int cfr_ignored_9 = (int)(0xBF87C0D512FE268FL ^ (long)n2 ^ 0x7CDAE94FB638D2DEL);
                                                                        n3 = n2 ^ 0xEAE57B7F;
                                                                        int cfr_ignored_10 = (int)(0xE538CF6A701ABC35L ^ (long)n2 ^ 0x63A42C86834C67A0L);
                                                                        n3 = n2 ^ 0x7995FC71 ^ 0x33D1BA3C ^ 0x33D1BA3C;
                                                                        --n;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_11 = (Integer.rotateRight(0x54EB6412 ^ n2, 13) + 1289665897) * 1424712723;
                                                                    if (hz2.snz == null) {
                                                                        try {
                                                                            n += 3;
                                                                            n3 = (n2 ^ 0x89FA1AF) + 611355644 - 611355644;
                                                                        }
                                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                                            n3 = n2 ^ 0x89FA1AF ^ 0xD6D8C21E ^ 0xD6D8C21E;
                                                                        }
                                                                        n -= 2;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        --n;
                                                                        n3 = (n2 ^ 0xD6D401E7) + 328402524 - 328402524;
                                                                    }
                                                                    catch (ArithmeticException arithmeticException) {
                                                                        n3 = (int)((long)(n2 ^ 0xD6D401E7) ^ 0xE7A98B2F2F8430C1L ^ 0xE7A98B2F2F8430C1L);
                                                                    }
                                                                    n += 2;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_12 = Integer.rotateLeft(0xD2F6049 ^ n2, 4) + -1659221998;
                                                                int cfr_ignored_13 = (int)(0xCF9DCE7427D4EB4FL ^ (long)n2 ^ 0x6198831A2DB832EAL);
                                                                class_17992 = hz2.snz;
                                                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x7995FC71));
                                                                int cfr_ignored_14 = Integer.rotateLeft(0xD55A4B0D ^ n2, 13) - -632506930;
                                                                int cfr_ignored_15 = (int)(0x17E8E53027D4EB4FL ^ (long)n2 ^ 0x3710831A2DB98200L);
                                                                n -= 3;
                                                                continue;
                                                            }
                                                            int cfr_ignored_16 = (Integer.rotateLeft(0x933BCADD ^ n2, 5) - -660918274) * -1824797987;
                                                            int cfr_ignored_17 = (int)(0x518964E027D4EB4FL ^ (long)n2 ^ 0x34B0831A2DB90EC3L);
                                                            n3 = n2 ^ 0x30870F0C ^ 0x98CD437F ^ 0x98CD437F;
                                                            int cfr_ignored_18 = (Integer.rotateLeft(0xFB4E855D ^ n2, 18) - 1927267710) * -78740131;
                                                            int cfr_ignored_19 = (int)(0x39FC2B6027D4EB4FL ^ (long)n2 ^ 0xABB0831A2DB9DE29L);
                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x24B3B66));
                                                            n += 5;
                                                            continue;
                                                        }
                                                        int cfr_ignored_20 = Integer.rotateLeft(0x5EDB7808 ^ n2, 14) + -2131679181;
                                                        int cfr_ignored_21 = (int)(0xFB9AABA001F85002L ^ (long)n2 ^ 0xAA30CF435B225AE4L);
                                                        n3 = (int)((long)(n2 ^ 0xF2DCD44D) ^ 0xADD588D5F0A4939FL ^ 0xADD588D5F0A4939FL);
                                                        int cfr_ignored_22 = (int)(0x4D90176416E26E02L ^ (long)n2 ^ 0xD3B8E177272336F1L);
                                                        n3 = (int)((long)(n2 ^ 0x24B3B66) ^ 0x9301D6A5DA66F7DL ^ 0x9301D6A5DA66F7DL);
                                                        n -= 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_23 = Integer.rotateRight(0xA60403C7 ^ n2, 7) - 517608532;
                                                    n3 = (n2 ^ 0x24B3B66) + -1993336176 - -1993336176;
                                                    n += 4;
                                                    continue;
                                                }
                                                int cfr_ignored_24 = Integer.rotateLeft(0x27B53B05 ^ n2, 7) - -749746986;
                                                int cfr_ignored_25 = (int)(0xE507953827D4EB4FL ^ (long)n2 ^ 0xD700831A2DB867DEL);
                                                n3 = n2 ^ 0x24B3B66 ^ 0xCC84C68C ^ 0xCC84C68C;
                                                n -= 2;
                                                continue;
                                            }
                                            int cfr_ignored_26 = Integer.rotateRight(0x692B35E2 ^ n2, 16) + -1063705191;
                                            try {
                                                if ((0xFFBA0FF2F0E4FC25L ^ (long)n2 | 1L) == 0L) {
                                                    throw new UnsupportedOperationException();
                                                }
                                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x24B3B66));
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                n3 = n2 ^ 0x24B3B66;
                                            }
                                            continue;
                                        }
                                        int cfr_ignored_27 = Integer.rotateRight(0x3359C5AB ^ n2, 9) + 1010601712;
                                        n3 = n2 ^ 0xB0E74DDF ^ 0x4AE01C17 ^ 0x4AE01C17;
                                        int cfr_ignored_28 = (Integer.rotateRight(0xC46FFBDA ^ n2, 11) + -840098143) * -999293989;
                                        n3 = n2 ^ 0x24B3B66;
                                        int cfr_ignored_29 = (Integer.rotateRight(0x2193581B ^ n2, 7) + 355814016) * 563304475;
                                        continue;
                                    }
                                    int cfr_ignored_30 = (Integer.rotateLeft(0x48C5B7B1 ^ n2, 12) + -733028950) * 1220917169;
                                    int cfr_ignored_31 = (int)(0x8A77198C27D4EB4FL ^ (long)n2 ^ 0xCE68831A2DB8B93FL);
                                    n3 = n2 ^ 0x10458635;
                                    int cfr_ignored_32 = (Integer.rotateRight(0xC0738336 ^ n2, 11) - 1381663429) * -1066171593;
                                    try {
                                        n -= 3;
                                        if ((0xEB1B75CD4FF3B4E3L ^ (long)n2 | 1L) == 0L) {
                                            throw new IllegalStateException();
                                        }
                                        n3 = n2 ^ 0x24B3B66 ^ 0x1D288C56 ^ 0x1D288C56;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        n3 = n2 ^ 0x24B3B66 ^ 0xA824AC6A ^ 0xA824AC6A;
                                    }
                                    continue;
                                }
                                int cfr_ignored_33 = Integer.rotateRight(0x18658DAB ^ n2, 6) + -123091216;
                                try {
                                    n += 3;
                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x24B3B66));
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x24B3B66));
                                }
                                n += 3;
                                continue;
                            }
                            int cfr_ignored_34 = Integer.rotateLeft(0x7A8AF2E1 ^ n2, 18) + -617543558;
                            int cfr_ignored_35 = (int)(0xB8385CDC27D4EB4FL ^ (long)n2 ^ 0x44C8831A2DB8DDA1L);
                            n3 = n2 ^ 0xE866BD64 ^ 0xB1E0D5A6 ^ 0xB1E0D5A6;
                            int cfr_ignored_36 = Integer.rotateLeft(0x7835541 ^ n2, 3) + -314248678;
                            int cfr_ignored_37 = (int)(0xC531FB7C27D4EB4FL ^ (long)n2 ^ 0xB88831A2DB827B2L);
                            int cfr_ignored_38 = (int)(0xFD74225A5CF66247L ^ (long)n2 ^ 0xB9C4755F3FA85739L);
                            n3 = n2 ^ 0x24B3B66 ^ 0xA83E25B9 ^ 0xA83E25B9;
                            continue;
                        }
                        int cfr_ignored_39 = Integer.rotateRight(0xCF4C79EE ^ n2, 12) - 513827597;
                        n3 = (int)((long)(n2 ^ 0xBE2799B) ^ 0x734A81A3697A0F5AL ^ 0x734A81A3697A0F5AL);
                        int cfr_ignored_40 = (Integer.rotateRight(0xCB04A336 ^ n2, 12) - -1712495931) * -888888521;
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x24B3B66));
                        continue;
                    }
                    int cfr_ignored_41 = Integer.rotateLeft(0x71703FED ^ n2, 17) - -1057661714;
                    int cfr_ignored_42 = (int)(0xB3C291D027D4EB4FL ^ (long)n2 ^ 0xDED0831A2DB8CA54L);
                    try {
                        ++n;
                        if ((0x72DCC568B04AB987L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (int)((long)(n2 ^ 0x24B3B66) ^ 0x80CFCDBD20CD437EL ^ 0x80CFCDBD20CD437EL);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x24B3B66));
                    }
                    n -= 3;
                    continue;
                }
                return class_17992;
            }
            int cfr_ignored_43 = (Integer.rotateLeft(0xDBBD16FC ^ n2, 14) - -1606195265) * -608364803;
            n3 = n2 ^ 0x24B3B66;
        }
    }

    private void bjl(class_332 class_3322, class_1799 class_17992, float f, float f2, float f3, float f4) {
        class_3322.method_51448().method_22903();
        class_3322.method_51448().method_46416(f, f2, 0.0f);
        class_3322.method_51448().method_22905(f3, f3, 1.0f);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)Math.max(0.0f, Math.min(1.0f, f4)));
        try {
            class_3322.method_51427(class_17992, 0, 0);
        }
        catch (Exception exception) {
            // empty catch block
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderSystem.disableBlend();
        class_3322.method_51448().method_22909();
    }

    private int bfq(float f, int n) {
        block0: {
            int n2 = -1714000602;
            n2 = Integer.rotateLeft(n2 * 1682266949, 18) ^ 0x3E655FBC;
            n2 = Float.floatToIntBits(f) ^ n2;
            int n3 = (n2 = n ^ n2) ^ 0x1A293F4E;
            if ((n3 ^ n2) == 438910798) break block0;
            int cfr_ignored_0 = (0x83FF5268 ^ n2) - -1377434145;
        }
        return Math.max(0, Math.min(n, Math.round((float)n * f)));
    }

    private Color aqb(Color color, int n) {
        Color color2 = null;
        int n2 = 0;
        int n3 = -442769773;
        n3 = Integer.rotateLeft(n3 * 1390982755, 5) ^ 0x9753800C;
        n3 = Integer.rotateLeft(System.identityHashCode(this) ^ n3, 20);
        n3 = Integer.rotateRight(n ^ n3, 25);
        int n4 = (int)((long)(795424549 + n3) ^ 0x4A9A0ECD3B6B795FL ^ 0x4A9A0ECD3B6B795FL);
        block27: while (true) {
            switch (n4 - n3) {
                case 795424549: {
                    int cfr_ignored_0 = (Integer.rotateLeft(0x1C469818 ^ n3, 6) + 1894386211) * 474388505;
                    if (yf.khdha_2()) {
                        try {
                            n4 = 91843688 + n3 + -386638191 - -386638191;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n4 = 91843688 + n3 ^ 0x114CCD71 ^ 0x114CCD71;
                        }
                        n2 += 3;
                        continue block27;
                    }
                    n4 = 1052780339 + n3 ^ 0x100E1508 ^ 0x100E1508;
                    ++n2;
                    continue block27;
                }
                case 1052780339: {
                    int cfr_ignored_1 = Integer.rotateLeft(0xBD0F64CD ^ n3, 10) - -382020594;
                    int cfr_ignored_2 = (int)(0x7FBDCAF027D4EB4FL ^ (long)n3 ^ 0x6890831A2DB952AAL);
                    yf.athz_2();
                    try {
                        n2 += 4;
                        n4 = (int)((long)(91843688 + n3) ^ 0x3B0E2A8E791C0D3AL ^ 0x3B0E2A8E791C0D3AL);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n4 = 91843688 + n3;
                    }
                    n2 -= 4;
                    continue block27;
                }
                case 91843688: {
                    int cfr_ignored_3 = Integer.rotateRight(0x511BB947 ^ n3, 13) - -692515116;
                    color2 = new Color(bqsh.rlth(color), bqsh.sdr(color), bqsh.sta_8(color), bqsh.khtth_2(0, bqsh.dakh_4(835975229 - 835974974, n)));
                    n4 = 1889209639 + n3;
                    int cfr_ignored_4 = (Integer.rotateRight(0x3AC967F2 ^ n3, 10) + 583087497) * 986277875;
                    n4 = 1103964826 + n3 + 1413407069 - 1413407069;
                    n2 += 5;
                    continue block27;
                }
                case -2121523867: {
                    int cfr_ignored_5 = Integer.rotateRight(0xF074274E ^ n3, 17) - 577659309;
                    n4 = -688942724 + n3 ^ 0x544522A0 ^ 0x544522A0;
                    int cfr_ignored_6 = Integer.rotateLeft(0xD8F36F65 ^ n3, 14) - 1238899830;
                    int cfr_ignored_7 = (int)(0x1A41C15827D4EB4FL ^ (long)n3 ^ 0x7FC0831A2DB99952L);
                    n4 = 795424549 + n3;
                    continue block27;
                }
                case 1940756162: {
                    int cfr_ignored_8 = Integer.rotateLeft(0x1FBC5D08 ^ n3, 6) + -601038029;
                    n4 = 1190131882 + n3 ^ 0xF7FB40E3 ^ 0xF7FB40E3;
                    int cfr_ignored_9 = (Integer.rotateLeft(0x84B89A30 ^ n3, 3) + 381176587) * -2068276687;
                    int cfr_ignored_10 = (int)(0x3CBFBA4427FC2123L ^ (long)n3 ^ 0x89F8834BB961D4AEL);
                    n4 = Integer.reverse(Integer.reverse(795424549 + n3));
                    n2 -= 4;
                    continue block27;
                }
                case 2029683503: {
                    int cfr_ignored_11 = Integer.rotateRight(0x9F5DD64A ^ n3, 6) + 1354404401;
                    n4 = Integer.reverse(Integer.reverse(1278857592 + n3));
                    int cfr_ignored_12 = (Integer.rotateRight(0x3DA1BDFE ^ n3, 10) - 2062786813) * 1034010111;
                    try {
                        --n2;
                        if ((0xC1BCB973CBC7CACBL ^ (long)n3 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n4 = (int)((long)(795424549 + n3) ^ 0x24E47DF0C22D9EAAL ^ 0x24E47DF0C22D9EAAL);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n4 = 795424549 + n3 ^ 0x2DAB906E ^ 0x2DAB906E;
                    }
                    n2 += 3;
                    continue block27;
                }
                case 1085664367: {
                    int cfr_ignored_13 = Integer.rotateLeft(0x440ECF85 ^ n3, 11) - 1109966934;
                    int cfr_ignored_14 = (int)(0x86BC61B827D4EB4FL ^ (long)n3 ^ 0x3E00831A2DB8A0A9L);
                    try {
                        n2 += 5;
                        if ((0xE95FF6C7A606D981L ^ (long)n3 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n4 = 795424549 + n3 ^ 0x81D259B5 ^ 0x81D259B5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n4 = (int)((long)(795424549 + n3) ^ 0x75B9D52566307825L ^ 0x75B9D52566307825L);
                    }
                    n2 -= 2;
                    continue block27;
                }
                case -1831878870: {
                    int cfr_ignored_15 = Integer.rotateRight(0xD9D52E8B ^ n3, 14) + 1697530384;
                    int cfr_ignored_16 = (int)(0x5C7CE81A3AD9A26L ^ (long)n3 ^ 0x60738BE8CF6BA65EL);
                    n4 = (int)((long)(1250365794 + n3) ^ 0xE68A99ED2CB85BADL ^ 0xE68A99ED2CB85BADL);
                    int cfr_ignored_17 = (int)(0x5C912395E5CFC6BFL ^ (long)n3 ^ 0xBA5B072C765914F3L);
                    n4 = Integer.reverse(Integer.reverse(795424549 + n3));
                    n2 += 5;
                    continue block27;
                }
                case 1216613085: {
                    int cfr_ignored_18 = Integer.rotateRight(0x44207FA2 ^ n3, 11) + 1145902041;
                    n4 = -1335656964 + n3 + -1106163905 - -1106163905;
                    int cfr_ignored_19 = (Integer.rotateLeft(0xC3860D19 ^ n3, 11) + -1315359422) * -1014624999;
                    int cfr_ignored_20 = (int)(0x134A32427D4EB4FL ^ (long)n3 ^ 0xBB38831A2DB9AFB8L);
                    int cfr_ignored_21 = (int)(0x9842CB99FABA0CCAL ^ (long)n3 ^ 0x6A4339C7E2B29D54L);
                    n4 = (int)((long)(-59587206 + n3) ^ 0x778D71144C3CA20L ^ 0x778D71144C3CA20L);
                    int cfr_ignored_22 = (int)(0x407BEEE94DB97CA7L ^ (long)n3 ^ 0x20A257C102692D26L);
                    n4 = 795424549 + n3 ^ 0x70678D90 ^ 0x70678D90;
                    continue block27;
                }
                case 1862866113: {
                    int cfr_ignored_23 = (Integer.rotateRight(0xAA30C6D6 ^ n3, 8) - -1606044891) * -1439643945;
                    n4 = 795424549 + n3;
                    int cfr_ignored_24 = (Integer.rotateLeft(0x26D7D490 ^ n3, 7) + -1199547221) * 651678865;
                    ++n2;
                    continue block27;
                }
                case 809950193: {
                    int cfr_ignored_25 = (Integer.rotateLeft(0x14E6A675 ^ n3, 5) - -1941190810) * 350660213;
                    int cfr_ignored_26 = (int)(0xD654084827D4EB4FL ^ (long)n3 ^ 0xEDE0831A2DB80179L);
                    n4 = 795424549 + n3;
                    continue block27;
                }
                case 581423923: {
                    int cfr_ignored_27 = Integer.rotateRight(0xE141AEE6 ^ n3, 15) - 1263652117;
                    try {
                        n2 -= 5;
                        n4 = 795424549 + n3 + 724920820 - 724920820;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n4 = Integer.reverse(Integer.reverse(795424549 + n3));
                    }
                    n2 -= 3;
                    continue block27;
                }
                case 511315836: {
                    int cfr_ignored_28 = Integer.rotateLeft(0xF4B87824 ^ n3, 17) - -1498141801;
                    n4 = Integer.reverse(Integer.reverse(-1871324222 + n3));
                    int cfr_ignored_29 = (Integer.rotateRight(0x842C9E36 ^ n3, 3) - 96782277) * -2077450697;
                    n4 = 795424549 + n3 ^ 0x14053110 ^ 0x14053110;
                    continue block27;
                }
                case 279780293: {
                    int cfr_ignored_30 = Integer.rotateRight(0x5B9C7EAF ^ n3, 14) - 475068012;
                    n4 = -347490890 + n3 ^ 0x4C23D72D ^ 0x4C23D72D;
                    int cfr_ignored_31 = Integer.rotateRight(0x516CF422 ^ n3, 13) + -527487143;
                    int cfr_ignored_32 = (int)(0xFCA707D683D2DAFCL ^ (long)n3 ^ 0xF2DDCB164EDE549FL);
                    n4 = Integer.reverse(Integer.reverse(795424549 + n3));
                    continue block27;
                }
                case 1103964826: {
                    return color2;
                }
            }
            int cfr_ignored_33 = Integer.rotateRight(0xB670FDA3 ^ n3, 9) + 470570488;
            n4 = (int)((long)(795424549 + n3) ^ 0x99F12FE86428C9C1L ^ 0x99F12FE86428C9C1L);
        }
    }

    @Generated
    public static bqsh taj_3() {
        block0: {
            int n = -1557062119;
            int n2 = (n = Integer.rotateLeft(n * -1073813721, 6) ^ 0x6D517BD5) ^ 0x29F2FFF6;
            if ((n2 ^ n) == 703791094) break block0;
            int cfr_ignored_0 = (0x8AC3E1EF ^ n) - -724159073;
        }
        return jnw;
    }

    private static boolean shhs_4(long l, long l2, Map.Entry entry) {
        return l - ((hz)entry.getValue()).thdhh_2 > l2;
    }

    private void sthl_2(bbgh bbgh2) {
        try {
            int n = 1795829692;
            n = Integer.rotateLeft(n * -2056088223, 10) ^ 0xE947825B;
            int n2 = n ^ 0x6126BCFE;
            if ((n2 ^ n) != 1629928702) {
                int cfr_ignored_0 = (0xA2C9342 ^ n) - 1120012881;
            }
            if ((0xA5 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bqsh.mc.field_1724 == null || bqsh.mc.field_1687 == null) {
            return;
        }
        this.zkk(bbgh2.dtn(), bbgh2.bhw());
    }

    private void btb(shw_3 shw2) {
        int n = 0;
        int n2 = -156012913;
        n2 = Integer.rotateLeft(n2 * -2074240325, 15) ^ 0xBFCAAA6A;
        shw_3 shw3 = shw2;
        n2 = (shw3 != null ? System.identityHashCode(shw3) : 0) ^ n2;
        int n3 = (n2 ^ 0xA763567A) + 310815262 - 310815262;
        block27: while (true) {
            switch (n3 ^ n2) {
                case -1486662022: {
                    int cfr_ignored_0 = Integer.rotateRight(0x54D9F383 ^ n2, 13) + 1254235160;
                    if (bqsh.mc.field_1724 == null) {
                        n3 = n2 ^ 0xDCC11132;
                        int cfr_ignored_1 = Integer.rotateLeft(0x175FFA0D ^ n2, 5) - -654514482;
                        int cfr_ignored_2 = (int)(0xD5ED543027D4EB4FL ^ (long)n2 ^ 0x5510831A2DB8060BL);
                        continue block27;
                    }
                    int cfr_ignored_3 = (int)(0x69E3CB4CDD2F9006L ^ (long)n2 ^ 0x6BE976ECDB2B7E16L);
                    n3 = (n2 ^ 0xBF1DAB7C) + 769450364 - 769450364;
                    n -= 4;
                    continue block27;
                }
                case 375632135: {
                    int cfr_ignored_4 = (Integer.rotateRight(0xB498441B ^ n2, 9) + -489824640) * -1265089509;
                    this.zdz_4();
                    return;
                }
                case -1088574596: {
                    int cfr_ignored_5 = Integer.rotateLeft(0xFBE13F68 ^ n2, 18) + -2069607213;
                    if (bqsh.mc.field_1687 == null) {
                        try {
                            if ((0x170755C43C2FD441L ^ (long)n2 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            n3 = n2 ^ 0xDCC11132;
                        }
                        catch (IllegalStateException illegalStateException) {
                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xDCC11132));
                        }
                        continue block27;
                    }
                    int cfr_ignored_6 = (int)(0xEB58FB22C98739ECL ^ (long)n2 ^ 0xB355FBD88FE7B60L);
                    n3 = n2 ^ 0xEF58FD49 ^ 0x976F7A10 ^ 0x976F7A10;
                    int cfr_ignored_7 = (int)(0x4F9646991F1178FCL ^ (long)n2 ^ 0x7042F2910ADF32FDL);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x1663B107));
                    n -= 5;
                    continue block27;
                }
                case -591326926: {
                    int cfr_ignored_8 = Integer.rotateRight(0xD13C85AB ^ n2, 13) + 1521602288;
                    return;
                }
                case 1161497381: {
                    int cfr_ignored_9 = (Integer.rotateLeft(0x9B5C0278 ^ n2, 6) + -729683005) * -1688468871;
                    try {
                        n -= 3;
                        if ((0x61B2AB5B9662BA73L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA763567A));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA763567A));
                    }
                    n -= 2;
                    continue block27;
                }
                case 723897572: {
                    int cfr_ignored_10 = (Integer.rotateLeft(0x2A176915 ^ n2, 8) - 489904326) * 706177301;
                    int cfr_ignored_11 = (int)(0xE8A5C72827D4EB4FL ^ (long)n2 ^ 0x7320831A2DB87C9AL);
                    n3 = n2 ^ 0xBF3BDB36 ^ 0xC90693ED ^ 0xC90693ED;
                    int cfr_ignored_12 = Integer.rotateLeft(0x760C2DED ^ n2, 17) - 1339502318;
                    int cfr_ignored_13 = (int)(0xB4BE83D027D4EB4FL ^ (long)n2 ^ 0xFAD0831A2DB8C4ACL);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA763567A));
                    n += 5;
                    continue block27;
                }
                case -2073586832: {
                    int cfr_ignored_14 = Integer.rotateLeft(0x172224A8 ^ n2, 5) + -780136557;
                    int cfr_ignored_15 = (int)(0x1E2B91AF63E852DEL ^ (long)n2 ^ 0xDE2E0B635E9B9186L);
                    n3 = (int)((long)(n2 ^ 0xA763567A) ^ 0xCF7D3532CD1CC451L ^ 0xCF7D3532CD1CC451L);
                    n += 2;
                    continue block27;
                }
                case -718427125: {
                    int cfr_ignored_16 = Integer.rotateLeft(0xB8A2774C ^ n2, 10) - 1611272559;
                    n3 = (int)((long)(n2 ^ 0xAEC6D780) ^ 0x77EED21569ED0FF4L ^ 0x77EED21569ED0FF4L);
                    int cfr_ignored_17 = (Integer.rotateRight(0xCC1873FF ^ n2, 12) - -1152144612) * -870812673;
                    try {
                        --n;
                        if ((0x4E924316A0052B45L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (n2 ^ 0xA763567A) + -1938175378 - -1938175378;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (n2 ^ 0xA763567A) + 1193330835 - 1193330835;
                    }
                    n += 5;
                    continue block27;
                }
                case -600580791: {
                    int cfr_ignored_18 = (Integer.rotateLeft(0x488DE83D ^ n2, 12) - -846414178) * 1217259581;
                    int cfr_ignored_19 = (int)(0x8A3F460027D4EB4FL ^ (long)n2 ^ 0x7170831A2DB8B9AFL);
                    n3 = (int)((long)(n2 ^ 0x74B622ED) ^ 0x9B891B3B484C5479L ^ 0x9B891B3B484C5479L);
                    int cfr_ignored_20 = Integer.rotateRight(0xB25A9F27 ^ n2, 9) - -1655249676;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA763567A));
                    n += 2;
                    continue block27;
                }
                case 1991000395: {
                    int cfr_ignored_21 = Integer.rotateRight(0xFC7442CF ^ n2, 18) - -1770932660;
                    int cfr_ignored_22 = (int)(0x4157EDEF3D2C41A8L ^ (long)n2 ^ 0x26AEB6EB78772F7EL);
                    n3 = (n2 ^ 0xE22D68FE) + 884386173 - 884386173;
                    int cfr_ignored_23 = (int)(0x63302894EEC64364L ^ (long)n2 ^ 0xAC59113F7DEF6BB1L);
                    n3 = (int)((long)(n2 ^ 0xA763567A) ^ 0x90990F303EF40295L ^ 0x90990F303EF40295L);
                    continue block27;
                }
                case -1916616178: {
                    int cfr_ignored_24 = Integer.rotateRight(0xBC088A6A ^ n2, 10) + -916037103;
                    n3 = n2 ^ 0x4707AF7A;
                    int cfr_ignored_25 = (Integer.rotateLeft(0xF3ED42B0 ^ n2, 17) + -1910984053) * -202554703;
                    n3 = (n2 ^ 0xA763567A) + -1517883631 - -1517883631;
                    continue block27;
                }
                case -971187610: {
                    int cfr_ignored_26 = Integer.rotateRight(0xC10837CB ^ n2, 11) + 1683775696;
                    n3 = n2 ^ 0xFB2B72AC ^ 0xCADE376F ^ 0xCADE376F;
                    int cfr_ignored_27 = Integer.rotateLeft(0x5896F808 ^ n2, 14) + -1096439757;
                    try {
                        n += 5;
                        if ((0xCBB4F20EF3552093L ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (int)((long)(n2 ^ 0xA763567A) ^ 0xED10152EAE8A391CL ^ 0xED10152EAE8A391CL);
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (n2 ^ 0xA763567A) + -156571113 - -156571113;
                    }
                    continue block27;
                }
                case -1573802548: {
                    int cfr_ignored_28 = (Integer.rotateLeft(0xEC8B5071 ^ n2, 16) + -1455661846) * -326414223;
                    int cfr_ignored_29 = (int)(0x2E39FE4C27D4EB4FL ^ (long)n2 ^ 0x1E8831A2DB9F1A2L);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x416C54B0));
                    int cfr_ignored_30 = Integer.rotateLeft(0x9165AF4D ^ n2, 5) - -1615996530;
                    int cfr_ignored_31 = (int)(0x53D7017027D4EB4FL ^ (long)n2 ^ 0xFF90831A2DB90A7FL);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA33EB836));
                    int cfr_ignored_32 = (Integer.rotateRight(0x3A16471B ^ n2, 10) + 219167616) * 974538523;
                    n3 = (int)((long)(n2 ^ 0xA763567A) ^ 0xA212D72276AD13C2L ^ 0xA212D72276AD13C2L);
                    ++n;
                    continue block27;
                }
                case -1174644043: {
                    int cfr_ignored_33 = Integer.rotateRight(0x5242B74A ^ n2, 13) + -93204175;
                    n3 = (n2 ^ 0x9DC00973) + -1422421654 - -1422421654;
                    int cfr_ignored_34 = (Integer.rotateRight(0x47C32636 ^ n2, 11) - -1258340411) * 1203971639;
                    n3 = n2 ^ 0xA763567A ^ 0x561D04A7 ^ 0x561D04A7;
                    continue block27;
                }
                case 787586515: {
                    int cfr_ignored_35 = Integer.rotateLeft(0xB9D918D ^ n2, 4) - 1819426638;
                    int cfr_ignored_36 = (int)(0xC92F3FB027D4EB4FL ^ (long)n2 ^ 0x8210831A2DB83F8FL);
                    try {
                        n += 5;
                        if ((0x4004FEF90CBEE63FL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (n2 ^ 0xA763567A) + 1669970633 - 1669970633;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA763567A));
                    }
                    n -= 3;
                    continue block27;
                }
            }
            int cfr_ignored_37 = (Integer.rotateLeft(0xB5D751 ^ n2, 3) + 442675722) * 11917137;
            int cfr_ignored_38 = (int)(0xC207796C27D4EB4FL ^ (long)n2 ^ 0xFA8831A2DB829DFL);
            n3 = n2 ^ 0xA763567A;
        }
    }

    private static String shta_4(String string, int n, int n2, int n3) {
        int n4 = -1106146292;
        int n5 = (n4 = Integer.rotateLeft(n4 * -816504601, 6) ^ 0x5A9AF88B) ^ 0x3D24DA28;
        if ((n5 ^ n4) != 1025825320) {
            int cfr_ignored_0 = (0x83355624 ^ n4) + 1760501259;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xA4575DB ^ n2 ^ i * 418186703 ^ rgha_2, 26) ^ khzt_3));
        }
        return new String(cArray);
    }

    private static boolean addh(class_1799 class_17992) {
        block0: {
            int n = st_4.tham(944675773);
            int n2 = n ^ 0x6B67D02D;
            if ((n2 ^ n) == 1801965613) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x53294B90 ^ n, 13) + 375244203) * 1395215249;
        }
        return class_17992.method_7960();
    }

    private static int rlth(Color color) {
        block0: {
            int n = st_4.tham(2050626355);
            Color color2 = color;
            n = Integer.rotateRight((color2 != null ? System.identityHashCode(color2) : 0) ^ n, 27);
            int n2 = n ^ 0x5A01EEAA;
            if ((n2 ^ n) == 1510076074) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x203BFD99 ^ n, 7) + -341748542) * 540802457;
            int cfr_ignored_1 = (int)(0xE28953A427D4EB4FL ^ (long)n ^ 0x5A38831A2DB868C3L);
        }
        return color.getRed();
    }

    private static int sdr(Color color) {
        block0: {
            int n = 1036147072;
            n = Integer.rotateLeft(n * 1503404687, 24) ^ 0x6A7AEFC0;
            Color color2 = color;
            n = Integer.rotateLeft((color2 != null ? System.identityHashCode(color2) : 0) ^ n, 20);
            int n2 = n ^ 0xCE609AF;
            if ((n2 ^ n) == 216402351) break block0;
            int cfr_ignored_0 = (0x3124502F ^ n) + -740594184;
        }
        return color.getGreen();
    }

    private static int sta_8(Color color) {
        block0: {
            int n = 2082960211;
            int n2 = (n = Integer.rotateLeft(n * 1557891229, 18) ^ 0x1B3DC01C) ^ 0x5ADC81EC;
            if ((n2 ^ n) == 1524400620) break block0;
            int cfr_ignored_0 = (0x26FBF2BF ^ n) - 483646460;
        }
        return color.getBlue();
    }

    private static int dakh_4(int n, int n2) {
        block0: {
            int n3 = 156165688;
            n3 = Integer.rotateLeft(n3 * 194618787, 11) ^ 0xA4AAAB22;
            int n4 = (n3 = n ^ n3) ^ 0x9CBD2336;
            if ((n4 ^ n3) == -1665326282) break block0;
            int cfr_ignored_0 = (0x95F3C50E ^ n3) - 1857424479;
        }
        return Math.min(n, n2);
    }

    private static int khtth_2(int n, int n2) {
        block0: {
            int n3 = 1195485614;
            n3 = Integer.rotateLeft(n3 * 1942128799, 13) ^ 0xBF39C7BE;
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0xF5390500;
            if ((n4 ^ n3) == -180812544) break block0;
            int cfr_ignored_0 = (0xB278ACAE ^ n3) + -244301931;
        }
        return Math.max(n, n2);
    }

    private static String[] tzgh(String string) {
        int n = 349108841;
        n = Integer.rotateLeft(n * -883754415, 19) ^ 0xCA4829A3;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 17);
        int n2 = n ^ 0xF4256FE4;
        if ((n2 ^ n) != -198873116) {
            int cfr_ignored_0 = (0xE0EB958D ^ n) + 1916226912;
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

    private static CallSite rwf(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 422564136;
            n3 = Integer.rotateLeft(n3 * -563892123, 3) ^ 0x9F7B311A;
            String string3 = string2;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 9);
            Class clazz2 = clazz;
            n3 = (clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n3;
            int n4 = n3 ^ 0xE11563D1;
            if ((n4 ^ n3) != -518691887) {
                int cfr_ignored_0 = (0xF83AB2F9 ^ n3) + -1450937960;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ghk ^ string.hashCode() ^ n2 + tthh ^ i * 773170989 ^ ghk, 10) ^ tthh));
            }
            String[] stringArray = bqsh.tzgh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] gm1qf0fpedvtv(String string) {
        return string.split("\u0004\u001a", -1);
    }

    private static CallSite vmtxd2dkn6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ kc06v0ahjy6zl ^ string.hashCode() ^ n2 + lp3zfibxxn ^ i * -1170505373 ^ kc06v0ahjy6zl, 27) ^ lp3zfibxxn));
            }
            String[] stringArray = bqsh.gm1qf0fpedvtv(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

