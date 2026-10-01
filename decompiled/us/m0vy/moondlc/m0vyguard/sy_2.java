/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_3298
 */
package us.m0vy.moondlc.m0vyguard;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import java.util.Optional;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineEvent;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3298;
import us.m0vy.moondlc.m0vyguard.bqs_2;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.yf;

public class sy_2
implements dl {
    private static final int bdhz_2 = -1401430354;
    private static final int thhh_3 = -592843451;
    private static final int hst = -1476921547;
    private static final int dhjr = -1021695220;
    private static final int i5yxl6pwal4pp = -1364135420;
    private static final int ci5xslg0l = -1532884110;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ugot4c01iv;

    public static void ddhh_4(String string) {
        int n = 0;
        int n2 = 1898106834;
        n2 = Integer.rotateLeft(n2 * 1318976325, 23) ^ 0xC5941CDA;
        String string2 = string;
        n2 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n2;
        int n3 = 1175140990 + n2 ^ 0x9CCDD967 ^ 0x9CCDD967;
        while (true) {
            block27: {
                block33: {
                    block34: {
                        block32: {
                            block26: {
                                block37: {
                                    block24: {
                                        block29: {
                                            block28: {
                                                block25: {
                                                    block30: {
                                                        block38: {
                                                            block36: {
                                                                block35: {
                                                                    block31: {
                                                                        block22: {
                                                                            block23: {
                                                                                if ((n = n3 - n2) > -797380511) break block22;
                                                                                if (n > -1465900876) break block23;
                                                                                if (n == -1750839761) break block24;
                                                                                if (n == -1626993245) break block25;
                                                                                if (n == -1465900876) break block26;
                                                                                break block27;
                                                                            }
                                                                            if (n == -1405272302) break block28;
                                                                            if (n == -1352149069) break block29;
                                                                            if (n == -797380511) break block30;
                                                                            break block27;
                                                                        }
                                                                        if (n > 14753396) break block31;
                                                                        if (n == -718559297) break block32;
                                                                        if (n == -83033858) break block33;
                                                                        int cfr_ignored_0 = Integer.rotateRight(0xD4651C42 ^ n2, 13) + -1130624199;
                                                                        if (n == 14753396) break block34;
                                                                        break block27;
                                                                    }
                                                                    if (n > 478113250) break block35;
                                                                    if (n == 231382133) break block36;
                                                                    if (n == 478113250) break block37;
                                                                    break block27;
                                                                }
                                                                if (n == 774793399) break block38;
                                                                if (n == 1175140990) {
                                                                    int cfr_ignored_1 = Integer.rotateLeft(0x4BD02500 ^ n2, 12) + 848435771;
                                                                    if (!yf.dnkh()) {
                                                                        int cfr_ignored_2 = (int)(0x9ADD789D1380385DL ^ (long)n2 ^ 0xC4AEBB38B9C986BL);
                                                                        n3 = 774793399 + n2 ^ 0xF5F4742D ^ 0xF5F4742D;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        --n;
                                                                        if ((0x14928D82863906EBL ^ (long)n2 | 1L) == 0L) {
                                                                            throw new IllegalStateException();
                                                                        }
                                                                        n3 = 231382133 + n2;
                                                                    }
                                                                    catch (IllegalStateException illegalStateException) {
                                                                        n3 = (int)((long)(231382133 + n2) ^ 0x3E93469AE7F216B0L ^ 0x3E93469AE7F216B0L);
                                                                    }
                                                                    n += 5;
                                                                    continue;
                                                                }
                                                                break block27;
                                                            }
                                                            int cfr_ignored_3 = Integer.rotateRight(0x4E9D7627 ^ n2, 12) - -1989218828;
                                                            throw null;
                                                        }
                                                        int cfr_ignored_4 = Integer.rotateRight(0xDDD0288B ^ n2, 14) + -527267824;
                                                        class_2960 class_29602 = sy_2.dsy("moondlc", "sounds/" + string);
                                                        sy_2.thd_5(mc, () -> sy_2.rls_2(class_29602, string));
                                                        return;
                                                    }
                                                    int cfr_ignored_5 = Integer.rotateRight(0x368F0BAA ^ n2, 9) + -1615853359;
                                                    n3 = 1214183303 + n2 ^ 0x8FFBA621 ^ 0x8FFBA621;
                                                    int cfr_ignored_6 = Integer.rotateRight(0xC8D7EC6 ^ n2, 4) - -1988101835;
                                                    try {
                                                        n -= 3;
                                                        if ((0xA8C99F98146E6EA7L ^ (long)n2 | 1L) == 0L) {
                                                            throw new UnsupportedOperationException();
                                                        }
                                                        n3 = Integer.reverse(Integer.reverse(1175140990 + n2));
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        n3 = 1175140990 + n2 + -1892235991 - -1892235991;
                                                    }
                                                    n -= 3;
                                                    continue;
                                                }
                                                int cfr_ignored_7 = Integer.rotateRight(0x17B99243 ^ n2, 5) + -472492712;
                                                n3 = -717170956 + n2;
                                                int cfr_ignored_8 = (Integer.rotateLeft(0x91CF25F4 ^ n2, 5) - -1401735225) * -1848695307;
                                                n3 = -2086995336 + n2;
                                                int cfr_ignored_9 = Integer.rotateRight(0xC8FEB682 ^ n2, 12) + 1530247417;
                                                n3 = (int)((long)(1175140990 + n2) ^ 0x2A08A68C0E36E7DBL ^ 0x2A08A68C0E36E7DBL);
                                                n += 3;
                                                continue;
                                            }
                                            int cfr_ignored_10 = Integer.rotateRight(0xD5BA6422 ^ n2, 13) + -437272743;
                                            n3 = 586278061 + n2 ^ 0x2F7D994B ^ 0x2F7D994B;
                                            int cfr_ignored_11 = Integer.rotateRight(0xCC70F7EA ^ n2, 12) + -972315503;
                                            try {
                                                if ((0xF237B8F682CBB2D1L ^ (long)n2 | 1L) == 0L) {
                                                    throw new UnsupportedOperationException();
                                                }
                                                n3 = 1175140990 + n2 + -1689001283 - -1689001283;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                n3 = (int)((long)(1175140990 + n2) ^ 0x83A4E5AB55BCDC02L ^ 0x83A4E5AB55BCDC02L);
                                            }
                                            ++n;
                                            continue;
                                        }
                                        int cfr_ignored_12 = (Integer.rotateLeft(0xA02058F4 ^ n2, 7) - 1749574855) * -1608492811;
                                        n3 = -2072242875 + n2;
                                        int cfr_ignored_13 = (Integer.rotateRight(0x82C5337B ^ n2, 3) + -633414880) * -2101005445;
                                        try {
                                            n -= 5;
                                            if ((0x86A034A9D9113BBDL ^ (long)n2 | 1L) == 0L) {
                                                throw new IllegalStateException();
                                            }
                                            n3 = 1175140990 + n2;
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            n3 = Integer.reverse(Integer.reverse(1175140990 + n2));
                                        }
                                        ++n;
                                        continue;
                                    }
                                    int cfr_ignored_14 = Integer.rotateRight(0x2F7170EA ^ n2, 8) + -1021686895;
                                    try {
                                        n3 = (int)((long)(1175140990 + n2) ^ 0x57A655B04469B644L ^ 0x57A655B04469B644L);
                                    }
                                    catch (ArithmeticException arithmeticException) {
                                        n3 = 1175140990 + n2 ^ 0xA1FC0283 ^ 0xA1FC0283;
                                    }
                                    n -= 5;
                                    continue;
                                }
                                int cfr_ignored_15 = Integer.rotateLeft(0x36341DED ^ n2, 9) - -1800585490;
                                int cfr_ignored_16 = (int)(0xF486B3D027D4EB4FL ^ (long)n2 ^ 0x9AD0831A2DB844DCL);
                                n3 = Integer.reverse(Integer.reverse(1175140990 + n2));
                                n -= 4;
                                continue;
                            }
                            int cfr_ignored_17 = Integer.rotateLeft(0x29F1F0AC ^ n2, 8) - 413778959;
                            n3 = -1362239296 + n2 ^ 0x5F92C515 ^ 0x5F92C515;
                            int cfr_ignored_18 = (Integer.rotateRight(0x39BA45E ^ n2, 3) - 1949730461) * 60531807;
                            n3 = 1175140990 + n2 ^ 0xE4E78D50 ^ 0xE4E78D50;
                            continue;
                        }
                        int cfr_ignored_19 = Integer.rotateRight(0x3A48E86E ^ n2, 10) - 322028685;
                        n3 = Integer.reverse(Integer.reverse(-825787916 + n2));
                        int cfr_ignored_20 = (Integer.rotateLeft(0x466E1B4 ^ n2, 3) - -1932332025) * 73851317;
                        try {
                            ++n;
                            n3 = Integer.reverse(Integer.reverse(1175140990 + n2));
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = 1175140990 + n2 + 1857558973 - 1857558973;
                        }
                        continue;
                    }
                    int cfr_ignored_21 = (Integer.rotateLeft(0xBF2B73C ^ n2, 4) - 1992413055) * 200455997;
                    n3 = -1237105052 + n2 ^ 0xFC916EE4 ^ 0xFC916EE4;
                    int cfr_ignored_22 = Integer.rotateLeft(0xAC4C6805 ^ n2, 8) - -509724714;
                    int cfr_ignored_23 = (int)(0x6EFEC63827D4EB4FL ^ (long)n2 ^ 0x7100831A2DB9702CL);
                    int cfr_ignored_24 = (int)(0xDBDE4F4F4A1342B7L ^ (long)n2 ^ 0x63EE58957E481A6DL);
                    n3 = -2084739600 + n2 + -1164563028 - -1164563028;
                    int cfr_ignored_25 = (int)(0xD8D28D0C8D27EB10L ^ (long)n2 ^ 0xE769D6FC2D061C74L);
                    n3 = 1175140990 + n2;
                    continue;
                }
                int cfr_ignored_26 = Integer.rotateLeft(0x12BF64E4 ^ n2, 5) - 1233835735;
                n3 = (int)((long)(-1392648000 + n2) ^ 0xB77046C4E3B069A2L ^ 0xB77046C4E3B069A2L);
                int cfr_ignored_27 = (Integer.rotateLeft(0x249E05D8 ^ n2, 7) + 1937790051) * 614335961;
                try {
                    n -= 2;
                    if ((0x489E9C40FD2832EBL ^ (long)n2 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    n3 = (int)((long)(1175140990 + n2) ^ 0x8549BDC09D36FB13L ^ 0x8549BDC09D36FB13L);
                }
                catch (IllegalStateException illegalStateException) {
                    n3 = (int)((long)(1175140990 + n2) ^ 0x441EF55BA513A3BL ^ 0x441EF55BA513A3BL);
                }
                n -= 2;
                continue;
            }
            int cfr_ignored_28 = Integer.rotateRight(0xAE8F2D8E ^ n2, 8) - 666116973;
            n3 = 1175140990 + n2;
        }
    }

    public static void tzr_2(String string, int n) {
        int n2 = bqs_2.sbz_4(-1274682464);
        String string2 = string;
        n2 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n2, 17);
        int n3 = (n2 = n ^ n2) ^ 0xF0B87029;
        if ((n3 ^ n2) != -256348119) {
            int cfr_ignored_0 = Integer.rotateLeft(0x44BD9389 ^ n2, 11) + 1465023698;
            int cfr_ignored_1 = (int)(0x860F3DB427D4EB4FL ^ (long)n2 ^ 0x8618831A2DB8A1CFL);
        }
        class_2960 class_29602 = sy_2.dlsh_2("moondlc", "sounds/" + string);
        sy_2.thls_2(mc, () -> sy_2.dsm_2(class_29602, string, n));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void sdht_4(byte[] byArray, float f) {
        try {
            int n = 1666692377;
            n = Integer.rotateLeft(n * 1384671791, 14) ^ 0x977382A6;
            n = Integer.rotateRight((byArray != null ? System.identityHashCode(byArray) : 0) ^ n, 18);
            n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 19);
            int n2 = n ^ 0x1026F9B6;
            if ((n2 ^ n) != 270989750) {
                int cfr_ignored_0 = (0x73714CAF ^ n) + -1577828720;
            }
            if (yf.dnkh()) {
                throw null;
            }
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new ByteArrayInputStream(byArray));
            try {
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                if (clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                    FloatControl floatControl = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
                    float f2 = (float)(Double.longBitsToDouble(0xD546F7256521D6B9L ^ 0x9572F7256521D6B9L) * Math.log10(sy_2.khbf(sy_2.djs_4(-23192479 + 1032174249), f)));
                    floatControl.setValue(Math.min(Math.max(f2, floatControl.getMinimum()), floatControl.getMaximum()));
                }
                clip.start();
                clip.addLineListener(arg_0 -> sy_2.sak_4(clip, arg_0));
                if (audioInputStream == null) return;
            }
            catch (Throwable throwable) {
                if (audioInputStream == null) throw throwable;
                try {
                    sy_2.dhwk(audioInputStream);
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    sy_2.rghr(throwable, throwable2);
                }
                throw throwable;
            }
            audioInputStream.close();
            return;
        }
        catch (Exception exception) {
            sy_2.khqk(System.err, "Error playing sound: " + exception.getMessage());
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void sak_4(Clip var0, LineEvent var1_1) {
        var4_2 = 0;
        var2_3 = -1677892979;
        var2_3 = Integer.rotateLeft(var2_3 * 149261371, 15) ^ 1195679302;
        v0 = var1_1;
        var2_3 = Integer.rotateLeft((v0 != null ? System.identityHashCode(v0) : 0) ^ var2_3, 8);
        var3_4 = Integer.rotateLeft(var2_3 ^ 78736268, 13);
        while (true) {
            block32: {
                block39: {
                    block35: {
                        block36: {
                            block33: {
                                block38: {
                                    block41: {
                                        block40: {
                                            block37: {
                                                block42: {
                                                    block43: {
                                                        block34: {
                                                            var4_2 = Integer.rotateRight(var3_4, 13) ^ var2_3;
                                                            switch (var4_2 & 7) {
                                                                case 1: {
                                                                    if (var4_2 == 1370086681) break block32;
                                                                    if (var4_2 != 1862654785) {
                                                                        ** break;
                                                                    }
                                                                    break block33;
                                                                }
                                                                case 2: {
                                                                    if (var4_2 != 247427082) {
                                                                        ** break;
                                                                    }
                                                                    break block34;
                                                                }
                                                                case 3: {
                                                                    if (var4_2 != -399787429) {
                                                                        ** break;
                                                                    }
                                                                    break block35;
                                                                }
                                                                case 4: {
                                                                    if (var4_2 == 138535100) break block36;
                                                                    if (var4_2 == -1374311268) break block37;
                                                                    Integer.rotateRight(472306626 ^ var2_3, 6) + 1829847993;
                                                                    if (var4_2 != 888630396) {
                                                                        if (var4_2 == 78736268) break;
                                                                        ** break;
                                                                    }
                                                                    break block38;
                                                                }
                                                                case 5: {
                                                                    if (var4_2 != -1551640995) {
                                                                        ** break;
                                                                    }
                                                                    break block39;
                                                                }
                                                                case 6: {
                                                                    if (var4_2 == 1759801486) break block40;
                                                                    if (var4_2 == -1395550762) break block41;
                                                                    (Integer.rotateLeft(-1189658220 ^ var2_3, 10) - 1848545319) * -1189658219;
                                                                    if (var4_2 != -1748766938) {
                                                                        ** break;
                                                                    }
                                                                    break block42;
                                                                }
                                                                case 7: {
                                                                    if (var4_2 != -108318361) {
                                                                        ** break;
                                                                    }
                                                                    break block43;
                                                                }
                                                            }
                                                            Integer.rotateRight(768359919 ^ var2_3, 8) - -1877401812;
                                                            if (var1_1.getType() == LineEvent.Type.STOP) {
                                                                try {
                                                                    var4_2 -= 3;
                                                                    if ((2958123037486971235L ^ (long)var2_3 | 1L) == 0L) {
                                                                        throw new NoSuchElementException();
                                                                    }
                                                                    var3_4 = Integer.rotateLeft(var2_3 ^ -108318361, 13);
                                                                }
                                                                catch (NoSuchElementException v1) {
                                                                    var3_4 = Integer.rotateLeft(var2_3 ^ -108318361, 13);
                                                                }
                                                                continue;
                                                            }
                                                            (int)(4659356276643136956L ^ (long)var2_3 ^ 5386589008461507715L);
                                                            var3_4 = Integer.rotateLeft(var2_3 ^ 247427082, 13) + -1352835012 - -1352835012;
                                                            var4_2 -= 5;
                                                            continue;
                                                        }
                                                        (Integer.rotateLeft(-1725467695 ^ var2_3, 6) + -1876646518) * -1725467695;
                                                        (int)(6599424835331615567L ^ (long)var2_3 ^ 5091463527201839866L);
                                                        return;
                                                    }
                                                    Integer.rotateRight(-1458820126 ^ var2_3, 8) + 2094460825;
                                                    var0.close();
                                                    var3_4 = Integer.rotateLeft(var2_3 ^ 247427082, 13);
                                                    var4_2 += 3;
                                                    continue;
                                                }
                                                Integer.rotateLeft(-32827035 ^ var2_3, 18) - -944393610;
                                                (int)(4375730102220417871L ^ (long)var2_3 ^ -7800090406146157406L);
                                                var3_4 = Integer.rotateLeft(var2_3 ^ 57289355, 13) + -1300141917 - -1300141917;
                                                (Integer.rotateLeft(-1285765936 ^ var2_3, 9) + -1130793877) * -1285765935;
                                                var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -24551079, 13)));
                                                (Integer.rotateLeft(2121881209 ^ var2_3, 18) + 1427052514) * 2121881209;
                                                (int)(-4842504002697106609L ^ (long)var2_3 ^ 1006698665176781894L);
                                                var3_4 = Integer.rotateLeft(var2_3 ^ 78736268, 13) ^ 1290314833 ^ 1290314833;
                                                continue;
                                            }
                                            (Integer.rotateLeft(1042140092 ^ var2_3, 10) - -1980151041) * 1042140093;
                                            var3_4 = Integer.rotateLeft(var2_3 ^ -830873926, 13) + 176690779 - 176690779;
                                            (Integer.rotateLeft(-1784436039 ^ var2_3, 5) + 590302114) * -1784436039;
                                            (int)(6273800721554271055L ^ (long)var2_3 ^ -830769982790368269L);
                                            var3_4 = Integer.rotateLeft(var2_3 ^ 586528791, 13);
                                            (Integer.rotateRight(1393366807 ^ var2_3, 13) - 317942532) * 1393366807;
                                            var3_4 = Integer.rotateLeft(var2_3 ^ 78736268, 13);
                                            --var4_2;
                                            continue;
                                        }
                                        Integer.rotateLeft(1807289697 ^ var2_3, 16) + 264650234;
                                        (int)(-6265734840355329201L ^ (long)var2_3 ^ -4915534844815409210L);
                                        (int)(-8411388560996079491L ^ (long)var2_3 ^ -9212560929124992168L);
                                        var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ 78736268, 13)));
                                        continue;
                                    }
                                    Integer.rotateLeft(1033179488 ^ var2_3, 10) + 2037037531;
                                    try {
                                        --var4_2;
                                        if ((-5897434135247576343L ^ (long)var2_3 | 1L) == 0L) {
                                            throw new UnsupportedOperationException();
                                        }
                                        var3_4 = Integer.rotateLeft(var2_3 ^ 78736268, 13);
                                    }
                                    catch (UnsupportedOperationException v2) {
                                        var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 78736268, 13) ^ -253775874055881423L ^ -253775874055881423L);
                                    }
                                    var4_2 += 3;
                                    continue;
                                }
                                Integer.rotateRight(-272448217 ^ var2_3, 16) - 217284340;
                                var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -902853304, 13)));
                                Integer.rotateRight(-407768085 ^ var2_3, 15) + 317335728;
                                try {
                                    var3_4 = Integer.rotateLeft(var2_3 ^ 78736268, 13) + 1591936276 - 1591936276;
                                }
                                catch (IllegalArgumentException v3) {
                                    var3_4 = Integer.rotateLeft(var2_3 ^ 78736268, 13) + 1934451067 - 1934451067;
                                }
                                var4_2 += 5;
                                continue;
                            }
                            (Integer.rotateRight(161303639 ^ var2_3, 4) - 778689988) * 161303639;
                            (int)(-4832906224474773853L ^ (long)var2_3 ^ -2325301737740512243L);
                            var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 78736268, 13) ^ -577001583568422536L ^ -577001583568422536L);
                            var4_2 += 5;
                            continue;
                        }
                        Integer.rotateLeft(-1913088672 ^ var2_3, 4) + 897037787;
                        var3_4 = Integer.rotateLeft(var2_3 ^ -1646421195, 13) ^ 1713806123 ^ 1713806123;
                        (Integer.rotateRight(1717577242 ^ var2_3, 15) + 1778531425) * 1717577243;
                        try {
                            --var4_2;
                            if ((2286951901516797677L ^ (long)var2_3 | 1L) == 0L) {
                                throw new ArithmeticException();
                            }
                            var3_4 = Integer.rotateLeft(var2_3 ^ 78736268, 13);
                        }
                        catch (ArithmeticException v4) {
                            var3_4 = Integer.rotateLeft(var2_3 ^ 78736268, 13) + 1779217224 - 1779217224;
                        }
                        continue;
                    }
                    (Integer.rotateRight(1383026130 ^ var2_3, 13) + -2618455) * 1383026131;
                    var3_4 = Integer.rotateLeft(var2_3 ^ -1300737534, 13);
                    (Integer.rotateRight(1732520498 ^ var2_3, 15) + -2053194935) * 1732520499;
                    try {
                        var4_2 -= 3;
                        if ((-4181449432593802351L ^ (long)var2_3 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        var3_4 = Integer.rotateLeft(var2_3 ^ 78736268, 13) + -700731444 - -700731444;
                    }
                    catch (IllegalStateException v5) {
                        var3_4 = Integer.rotateLeft(var2_3 ^ 78736268, 13) + -1075167808 - -1075167808;
                    }
                    continue;
                }
                (Integer.rotateRight(-223440418 ^ var2_3, 17) - 1736526109) * -223440417;
                var3_4 = Integer.rotateLeft(var2_3 ^ 2107618702, 13) + 1983366797 - 1983366797;
                Integer.rotateLeft(-1923875703 ^ var2_3, 4) + 562639826;
                (int)(5755972732472060751L ^ (long)var2_3 ^ 6347967823238214163L);
                var3_4 = Integer.rotateLeft(var2_3 ^ 78736268, 13);
                continue;
            }
            Integer.rotateRight(-1024862385 ^ var2_3, 11) - -1632718388;
            var3_4 = Integer.reverse(Integer.reverse(Integer.rotateLeft(var2_3 ^ -1830896580, 13)));
            Integer.rotateLeft(-1598581043 ^ var2_3, 7) - 2056839694;
            (int)(7063114194712062799L ^ (long)var2_3 ^ -8318004363293791781L);
            (int)(-6168988203047235972L ^ (long)var2_3 ^ 5666433389958199575L);
            var3_4 = (int)((long)Integer.rotateLeft(var2_3 ^ 267372613, 13) ^ 8653769373931288607L ^ 8653769373931288607L);
            (int)(1733737224449238414L ^ (long)var2_3 ^ 924089932115058127L);
            var3_4 = Integer.rotateLeft(var2_3 ^ 78736268, 13) ^ 1704300955 ^ 1704300955;
            continue;
lbl205:
            // 8 sources

            (Integer.rotateRight(-1694365741 ^ var2_3, 6) + -912485944) * -1694365741;
            var3_4 = Integer.rotateLeft(var2_3 ^ 78736268, 13);
        }
    }

    private static void dsm_2(class_2960 class_29602, String string, int n) {
        try {
            Object object;
            try {
                int n2 = 256173004;
                n2 = Integer.rotateLeft(n2 * -1584591187, 7) ^ 0xEB98C5C7;
                class_2960 class_29603 = class_29602;
                n2 = (class_29603 != null ? System.identityHashCode(class_29603) : 0) ^ n2;
                n2 = n ^ n2;
                int n3 = n2 ^ 0x7EF0A41;
                if ((n3 ^ n2) != 133106241) {
                    int cfr_ignored_0 = (0x8ABE98D ^ n2) + 553191846;
                }
                if ((0x2F3 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            InputStream inputStream = null;
            if (mc.method_1478() != null && ((Optional)(object = mc.method_1478().method_14486(class_29602))).isPresent()) {
                inputStream = ((class_3298)((Optional)object).get()).method_14482();
            }
            if (inputStream == null) {
                inputStream = sy_2.class.getClassLoader().getResourceAsStream("assets/moondlc/sounds/" + string);
            }
            if (inputStream == null) {
                inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("assets/moondlc/sounds/" + string);
            }
            if (inputStream == null) {
                inputStream = sy_2.class.getResourceAsStream("/assets/moondlc/sounds/" + string);
            }
            if (inputStream == null) {
                System.err.println("Sound resource not found: " + String.valueOf(class_29602));
                return;
            }
            object = inputStream;
            try {
                byte[] byArray = ((InputStream)object).readAllBytes();
                float f = Math.max(Float.intBitsToFloat(0xA4371B5C ^ 0x9814CC56), (float)n / Float.intBitsToFloat(0xDDB2D79C ^ 0x9F7AD79C));
                new Thread(() -> sy_2.khthq(byArray, f)).start();
            }
            finally {
                if (object != null) {
                    ((InputStream)object).close();
                }
            }
        }
        catch (Exception exception) {
            System.err.println("Error loading sound: " + exception.getMessage());
        }
    }

    private static void khthq(byte[] byArray, float f) {
        int n = bqs_2.sbz_4(1617265523);
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 12);
        int n2 = n ^ 0x2922A86E;
        if ((n2 ^ n) != 690137198) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x49472B1D ^ n, 12) - -470034498) * 1229400861;
            int cfr_ignored_1 = (int)(0x8BF5852027D4EB4FL ^ (long)n ^ 0xF730831A2DB8BA3AL);
        }
        sy_2.sdht_4(byArray, f);
    }

    private static void rls_2(class_2960 class_29602, String string) {
        try {
            Object object;
            int n = 21786767;
            n = Integer.rotateLeft(n * 495885409, 7) ^ 0x362744C5;
            int n2 = n ^ 0xC0859AF8;
            if ((n2 ^ n) != -1064985864) {
                int cfr_ignored_0 = (0xC1C9EA77 ^ n) - 32279311;
            }
            InputStream inputStream = null;
            if (mc.method_1478() != null && ((Optional)(object = mc.method_1478().method_14486(class_29602))).isPresent()) {
                inputStream = ((class_3298)((Optional)object).get()).method_14482();
            }
            if (inputStream == null) {
                inputStream = sy_2.class.getClassLoader().getResourceAsStream("assets/moondlc/sounds/" + string);
            }
            if (inputStream == null) {
                inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("assets/moondlc/sounds/" + string);
            }
            if (inputStream == null) {
                inputStream = sy_2.class.getResourceAsStream("/assets/moondlc/sounds/" + string);
            }
            if (inputStream == null) {
                System.err.println("Sound resource not found: " + String.valueOf(class_29602));
                return;
            }
            object = inputStream;
            try {
                byte[] byArray = ((InputStream)object).readAllBytes();
                float f = 1.0f;
                new Thread(() -> sy_2.ddk(byArray, f)).start();
            }
            finally {
                if (object != null) {
                    ((InputStream)object).close();
                }
            }
        }
        catch (Exception exception) {
            System.err.println("Error loading sound: " + exception.getMessage());
        }
    }

    private static void ddk(byte[] byArray, float f) {
        int n = -1342851251;
        n = Integer.rotateLeft(n * -533433101, 22) ^ 0x6FCF1BA2;
        n = Integer.rotateRight((byArray != null ? System.identityHashCode(byArray) : 0) ^ n, 6);
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 17);
        int n2 = n ^ 0x2EDE97EF;
        if ((n2 ^ n) != 786339823) {
            int cfr_ignored_0 = (0x812B20A2 ^ n) + -944866488;
        }
        sy_2.sdht_4(byArray, f);
    }

    private static String than(String string, int n, int n2, int n3) {
        int n4 = -599081062;
        n4 = Integer.rotateLeft(n4 * -1371478627, 14) ^ 0xDCCD00CC;
        int n5 = (n4 = n ^ n4) ^ 0xB20A3F52;
        if ((n5 ^ n4) != -1307951278) {
            int cfr_ignored_0 = (0x6E4080C8 ^ n4) - 591207528;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0x88F4A63C ^ n2 ^ i * -1635771723 ^ bdhz_2, 22) ^ thhh_3));
        }
        return new String(cArray);
    }

    private static class_2960 dsy(String string, String string2) {
        block0: {
            int n = -1699009677;
            n = Integer.rotateLeft(n * -600871659, 6) ^ 0xC92195EE;
            String string3 = string2;
            n = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 3);
            int n2 = n ^ 0xB2478959;
            if ((n2 ^ n) == -1303934631) break block0;
            int cfr_ignored_0 = (0x28FCA22A ^ n) - -347205779;
        }
        return class_2960.method_60655((String)string, (String)string2);
    }

    private static void thd_5(class_310 class_3102, Runnable runnable) {
        int n = -1458771993;
        n = Integer.rotateLeft(n * 1909981131, 22) ^ 0xDE03CE0;
        class_310 class_3103 = class_3102;
        n = (class_3103 != null ? System.identityHashCode(class_3103) : 0) ^ n;
        Runnable runnable2 = runnable;
        n = (runnable2 != null ? System.identityHashCode(runnable2) : 0) ^ n;
        int n2 = n ^ 0x7E27D2F7;
        if ((n2 ^ n) != 2116539127) {
            int cfr_ignored_0 = (0xD72B3510 ^ n) + -1542410826;
        }
        class_3102.execute(runnable);
    }

    private static class_2960 dlsh_2(String string, String string2) {
        block0: {
            int n = -36016048;
            int n2 = (n = Integer.rotateLeft(n * -1652958945, 25) ^ 0x6A279F) ^ 0x5715ABA4;
            if ((n2 ^ n) == 1461037988) break block0;
            int cfr_ignored_0 = (0xAACFDBF4 ^ n) - -1776481834;
        }
        return class_2960.method_60655((String)string, (String)string2);
    }

    private static void thls_2(class_310 class_3102, Runnable runnable) {
        int n = 632845238;
        n = Integer.rotateLeft(n * -1654598935, 20) ^ 0x65916E57;
        class_310 class_3103 = class_3102;
        n = Integer.rotateRight((class_3103 != null ? System.identityHashCode(class_3103) : 0) ^ n, 22);
        int n2 = n ^ 0x79E38426;
        if ((n2 ^ n) != 2044953638) {
            int cfr_ignored_0 = (0x5C5BF790 ^ n) + -371964232;
        }
        class_3102.execute(runnable);
    }

    private static float djs_4(int n) {
        block0: {
            int n2 = 242603872;
            int n3 = (n2 = Integer.rotateLeft(n2 * -1995519969, 6) ^ 0x34364631) ^ 0x597D0AEC;
            if ((n3 ^ n2) == 1501367020) break block0;
            int cfr_ignored_0 = (0x5708DD8C ^ n2) + -238358647;
        }
        return Float.intBitsToFloat(n);
    }

    private static float khbf(float f, float f2) {
        block0: {
            int n = -1314186503;
            n = Integer.rotateLeft(n * -1678884213, 5) ^ 0xD663B8F;
            n = Float.floatToIntBits(f2) ^ n;
            int n2 = n ^ 0xBC091507;
            if ((n2 ^ n) == -1140255481) break block0;
            int cfr_ignored_0 = (0xDA20FFE ^ n) - 353529896;
        }
        return Math.max(f, f2);
    }

    private static void dhwk(AudioInputStream audioInputStream) {
        int n = 482854430;
        n = Integer.rotateLeft(n * -1402719829, 17) ^ 0xEC683EA3;
        AudioInputStream audioInputStream2 = audioInputStream;
        n = Integer.rotateRight((audioInputStream2 != null ? System.identityHashCode(audioInputStream2) : 0) ^ n, 10);
        int n2 = n ^ 0x88BAB2DD;
        if ((n2 ^ n) != -2001030435) {
            int cfr_ignored_0 = (0x947D74C3 ^ n) + 1246384183;
        }
        audioInputStream.close();
    }

    private static void rghr(Throwable throwable, Throwable throwable2) {
        int n = -196153729;
        n = Integer.rotateLeft(n * -859337773, 21) ^ 0xCA6481E;
        Throwable throwable3 = throwable;
        n = (throwable3 != null ? System.identityHashCode(throwable3) : 0) ^ n;
        Throwable throwable4 = throwable2;
        n = (throwable4 != null ? System.identityHashCode(throwable4) : 0) ^ n;
        int n2 = n ^ 0x4DBB3804;
        if ((n2 ^ n) != 1304115204) {
            int cfr_ignored_0 = (0xB9F5D67B ^ n) - 1104459026;
        }
        throwable.addSuppressed(throwable2);
    }

    private static void khqk(PrintStream printStream, String string) {
        int n = -613810096;
        n = Integer.rotateLeft(n * 1924360707, 26) ^ 0x60246049;
        PrintStream printStream2 = printStream;
        n = Integer.rotateLeft((printStream2 != null ? System.identityHashCode(printStream2) : 0) ^ n, 4);
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 2);
        int n2 = n ^ 0x724BE393;
        if ((n2 ^ n) != 1917576083) {
            int cfr_ignored_0 = (0xA921E3C3 ^ n) + 230418986;
        }
        printStream.println(string);
    }

    private static String[] bst_2(String string) {
        int n = -1934697239;
        n = Integer.rotateLeft(n * -1843931733, 23) ^ 0x3B3F72D2;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x9F421FE4;
        if ((n2 ^ n) != -1623056412) {
            int cfr_ignored_0 = (0x13ECC30D ^ n) + 1221423396;
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

    private static CallSite rtr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 342733004;
            n3 = Integer.rotateLeft(n3 * 277034583, 16) ^ 0x329C5CC9;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 13);
            n3 = Integer.rotateLeft(n2 ^ n3, 27);
            int n4 = n3 ^ 0x85E74E75;
            if ((n4 ^ n3) != -2048438667) {
                int cfr_ignored_0 = (0x918AFEB9 ^ n3) + -1630138300;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ hst ^ string.hashCode() ^ n2 + dhjr + i * -1068958457) + hst) ^ dhjr));
            }
            String[] stringArray = sy_2.bst_2(new String(cArray));
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

    private static String[] zaa3iezphk63(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite mawephy6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ i5yxl6pwal4pp ^ string.hashCode()) + (n2 + ci5xslg0l) + i ^ i5yxl6pwal4pp, 22) + ci5xslg0l);
            }
            String[] stringArray = sy_2.zaa3iezphk63(new String(cArray));
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

