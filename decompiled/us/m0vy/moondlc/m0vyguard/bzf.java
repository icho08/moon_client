/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1011
 *  net.minecraft.class_1043
 *  net.minecraft.class_1044
 *  net.minecraft.class_310
 */
package us.m0vy.moondlc.m0vyguard;

import dev.redstones.mediaplayerinfo.IMediaSession;
import dev.redstones.mediaplayerinfo.MediaPlayerInfo;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_310;
import us.m0vy.moondlc.m0vyguard.trz;
import us.m0vy.moondlc.m0vyguard.tss_2;
import us.m0vy.moondlc.m0vyguard.yf;

public class bzf {
    private static boolean thqsh;
    private static final ScheduledExecutorService dhbs_2;
    private static volatile trz dhwr;
    private static final Map hdhf;
    private static String tsa;
    private static final int bghd = 2071395557;
    private static final int skd_2 = 1553311171;
    private static final int zha = 1639854574;
    private static final int shtl_2 = -349439392;
    private static final int wqivfjvhrp9 = -467959548;
    private static final int kguf1ms3 = 1492885982;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ydufxbgvknz1a;

    public static trz dzj_2() {
        int n = 0;
        int n2 = 1410332352;
        n2 = Integer.rotateLeft(n2 * 1827851187, 25) ^ 0x1502E3F2;
        int n3 = (n2 ^ 0xC46AB05F) + -1563630525 - -1563630525;
        while (true) {
            block28: {
                block37: {
                    block29: {
                        block39: {
                            block25: {
                                block38: {
                                    block33: {
                                        block40: {
                                            block30: {
                                                block27: {
                                                    block35: {
                                                        block26: {
                                                            block34: {
                                                                block31: {
                                                                    block36: {
                                                                        block32: {
                                                                            block23: {
                                                                                block24: {
                                                                                    if ((n = n3 ^ n2) > -999640993) break block23;
                                                                                    if (n > -1427947266) break block24;
                                                                                    if (n == -2115827258) break block25;
                                                                                    if (n == -1760751001) break block26;
                                                                                    if (n == -1427947266) break block27;
                                                                                    break block28;
                                                                                }
                                                                                if (n == -1137147139) break block29;
                                                                                if (n == -1092025954) break block30;
                                                                                if (n == -999640993) break block31;
                                                                                break block28;
                                                                            }
                                                                            if (n > -241225395) break block32;
                                                                            if (n == -540408860) break block33;
                                                                            if (n == -358571294) break block34;
                                                                            int cfr_ignored_0 = Integer.rotateLeft(0x522F6921 ^ n2, 13) + -132425158;
                                                                            int cfr_ignored_1 = (int)(0x909DC71C27D4EB4FL ^ (long)n2 ^ 0x7348831A2DB88CEAL);
                                                                            if (n == -241225395) break block35;
                                                                            break block28;
                                                                        }
                                                                        if (n > 361102410) break block36;
                                                                        if (n == 78306455) break block37;
                                                                        if (n == 361102410) break block38;
                                                                        break block28;
                                                                    }
                                                                    if (n == 1112205960) break block39;
                                                                    if (n == 1768323091) break block40;
                                                                    break block28;
                                                                }
                                                                int cfr_ignored_2 = (Integer.rotateLeft(0xFC262DC ^ n2, 4) - -320366625) * 264397533;
                                                                if (thqsh) {
                                                                    try {
                                                                        if ((0x58850C5F3FB5E845L ^ (long)n2 | 1L) == 0L) {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                        n3 = (int)((long)(n2 ^ 0xEAA0A2E2) ^ 0xD32A0FAD7E45E30CL ^ 0xD32A0FAD7E45E30CL);
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        n3 = (int)((long)(n2 ^ 0xEAA0A2E2) ^ 0xC2BC01009CCAFD5EL ^ 0xC2BC01009CCAFD5EL);
                                                                    }
                                                                    continue;
                                                                }
                                                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x3804C4D8));
                                                                int cfr_ignored_3 = (Integer.rotateRight(0x3E089AF3 ^ n2, 10) + -2023202136) * 1040751347;
                                                                n3 = n2 ^ 0x970D1267 ^ 0x324C9163 ^ 0x324C9163;
                                                                n -= 3;
                                                                continue;
                                                            }
                                                            int cfr_ignored_4 = Integer.rotateLeft(0xE7AC920C ^ n2, 15) - 306400943;
                                                            return dhwr;
                                                        }
                                                        int cfr_ignored_5 = Integer.rotateRight(0x5D486DE6 ^ n2, 14) - 1344466453;
                                                        thqsh = true;
                                                        dhbs_2.scheduleAtFixedRate(bzf::thjm, 0L, 0x64F88E31CF4B72D0L ^ 0x64F88E31CF4B7138L, TimeUnit.MILLISECONDS);
                                                        try {
                                                            n3 = (n2 ^ 0xEAA0A2E2) + -1865052620 - -1865052620;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            n3 = (int)((long)(n2 ^ 0xEAA0A2E2) ^ 0x5618874FB3B8EF20L ^ 0x5618874FB3B8EF20L);
                                                        }
                                                        n += 2;
                                                        continue;
                                                    }
                                                    int cfr_ignored_6 = Integer.rotateLeft(0x7F0F8868 ^ n2, 18) + 1732191187;
                                                    n3 = n2 ^ 0x504D9FC7 ^ 0xEF71CD84 ^ 0xEF71CD84;
                                                    int cfr_ignored_7 = (Integer.rotateLeft(0xED374EF5 ^ n2, 16) - -1106235674) * -315142411;
                                                    int cfr_ignored_8 = (int)(0x2F85E0C827D4EB4FL ^ (long)n2 ^ 0x3CE0831A2DB9F2DAL);
                                                    n3 = n2 ^ 0xC46AB05F;
                                                    int cfr_ignored_9 = Integer.rotateLeft(0x2385DB4D ^ n2, 7) - 1368599950;
                                                    int cfr_ignored_10 = (int)(0xE137757027D4EB4FL ^ (long)n2 ^ 0x1790831A2DB86FBFL);
                                                    --n;
                                                    continue;
                                                }
                                                int cfr_ignored_11 = Integer.rotateRight(0x210F6F4B ^ n2, 7) + 87824720;
                                                try {
                                                    n -= 2;
                                                    if ((0x876227E9168466E9L ^ (long)n2 | 1L) == 0L) {
                                                        throw new UnsupportedOperationException();
                                                    }
                                                    n3 = n2 ^ 0xC46AB05F;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xC46AB05F));
                                                }
                                                continue;
                                            }
                                            int cfr_ignored_12 = Integer.rotateRight(0x95C12B2B ^ n2, 5) + 650238320;
                                            try {
                                                --n;
                                                n3 = n2 ^ 0xC46AB05F;
                                            }
                                            catch (NoSuchElementException noSuchElementException) {
                                                n3 = (n2 ^ 0xC46AB05F) + -395225316 - -395225316;
                                            }
                                            n -= 4;
                                            continue;
                                        }
                                        int cfr_ignored_13 = Integer.rotateRight(0x1B581C63 ^ n2, 6) + 1409879864;
                                        int cfr_ignored_14 = (int)(0x4E8A0DB4E6D7929CL ^ (long)n2 ^ 0xE619011CDE1F30C5L);
                                        n3 = (n2 ^ 0x43953F14) + -281290218 - -281290218;
                                        int cfr_ignored_15 = (int)(0x9A5EDFF93019B680L ^ (long)n2 ^ 0x4282AC809626996CL);
                                        n3 = (n2 ^ 0xC46AB05F) + -336085686 - -336085686;
                                        ++n;
                                        continue;
                                    }
                                    int cfr_ignored_16 = Integer.rotateRight(0xAD5262CA ^ n2, 8) + 22517169;
                                    try {
                                        ++n;
                                        if ((0x61F1631DD514254FL ^ (long)n2 | 1L) == 0L) {
                                            throw new IllegalStateException();
                                        }
                                        n3 = (int)((long)(n2 ^ 0xC46AB05F) ^ 0xC732050C66AFEF91L ^ 0xC732050C66AFEF91L);
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        n3 = n2 ^ 0xC46AB05F ^ 0x74A51C61 ^ 0x74A51C61;
                                    }
                                    n += 3;
                                    continue;
                                }
                                int cfr_ignored_17 = (Integer.rotateLeft(0x2B278B1D ^ n2, 8) - 1042773950) * 724011805;
                                int cfr_ignored_18 = (int)(0xE995252027D4EB4FL ^ (long)n2 ^ 0xB730831A2DB87EFBL);
                                n3 = (int)((long)(n2 ^ 0x37E85048) ^ 0xF2618D890EC0BB1L ^ 0xF2618D890EC0BB1L);
                                int cfr_ignored_19 = Integer.rotateRight(0x3267CD4E ^ n2, 9) - 519011245;
                                try {
                                    ++n;
                                    if ((0x13CF2D1A49C3B9BFL ^ (long)n2 | 1L) == 0L) {
                                        throw new NoSuchElementException();
                                    }
                                    n3 = n2 ^ 0xC46AB05F;
                                }
                                catch (NoSuchElementException noSuchElementException) {
                                    n3 = (int)((long)(n2 ^ 0xC46AB05F) ^ 0x19FFCDCA0677E541L ^ 0x19FFCDCA0677E541L);
                                }
                                n += 4;
                                continue;
                            }
                            int cfr_ignored_20 = Integer.rotateRight(0x2BDE7BEB ^ n2, 8) + 1414439088;
                            n3 = n2 ^ 0xC4C7B75B ^ 0x5505722E ^ 0x5505722E;
                            int cfr_ignored_21 = Integer.rotateRight(0x6A49C0EF ^ n2, 16) - -481559508;
                            int cfr_ignored_22 = (int)(0x5AE3DFD7B8C56A1EL ^ (long)n2 ^ 0x42DFBD392F1B1816L);
                            n3 = n2 ^ 0x5938E446;
                            int cfr_ignored_23 = (int)(0x16DF99201640A183L ^ (long)n2 ^ 0xCF30E032B821806EL);
                            n3 = (int)((long)(n2 ^ 0xC46AB05F) ^ 0xD97CA0C62313B9EBL ^ 0xD97CA0C62313B9EBL);
                            continue;
                        }
                        int cfr_ignored_24 = (Integer.rotateLeft(0x597808DD ^ n2, 14) - -639192578) * 1501038813;
                        int cfr_ignored_25 = (int)(0x9BCAA6E027D4EB4FL ^ (long)n2 ^ 0xB0B0831A2DB89A44L);
                        try {
                            n -= 3;
                            n3 = (int)((long)(n2 ^ 0xC46AB05F) ^ 0xCFABFA67F027B164L ^ 0xCFABFA67F027B164L);
                        }
                        catch (ArithmeticException arithmeticException) {
                            n3 = (int)((long)(n2 ^ 0xC46AB05F) ^ 0xB0458A0D2FFF4236L ^ 0xB0458A0D2FFF4236L);
                        }
                        ++n;
                        continue;
                    }
                    int cfr_ignored_26 = Integer.rotateLeft(0x9D7604C4 ^ n2, 6) - 363344631;
                    try {
                        n += 3;
                        if ((0xEA0515A6E05B90F1L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = n2 ^ 0xC46AB05F;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (n2 ^ 0xC46AB05F) + 260769437 - 260769437;
                    }
                    n += 4;
                    continue;
                }
                int cfr_ignored_27 = (Integer.rotateRight(0x7FCA48D7 ^ n2, 18) - 2111598916) * 2143963351;
                int cfr_ignored_28 = (int)(0xE064373992612310L ^ (long)n2 ^ 0x9303E871BD066D19L);
                n3 = n2 ^ 0x8094BB7F ^ 0x567FE220 ^ 0x567FE220;
                int cfr_ignored_29 = (int)(0x91BA17E06D6CB82BL ^ (long)n2 ^ 0xD2B0166A8B708EA5L);
                n3 = Integer.reverse(Integer.reverse(n2 ^ 0xC46AB05F));
                continue;
            }
            int cfr_ignored_30 = Integer.rotateLeft(0x167B3F68 ^ n2, 5) + -1119204141;
            n3 = n2 ^ 0xC46AB05F;
        }
    }

    private static class_1044 hshh(ByteBuffer byteBuffer) {
        try {
            byte[] byArray;
            BufferedImage bufferedImage;
            int n = 1756881355;
            n = Integer.rotateLeft(n * -1644260629, 23) ^ 0x5734ACC5;
            int n2 = n ^ 0x98763C2F;
            if ((n2 ^ n) != -1737081809) {
                int cfr_ignored_0 = (0xF0C1DDE4 ^ n) + 463146832;
            }
            if ((bufferedImage = ImageIO.read(new ByteArrayInputStream(byArray = bzf.ttth(byteBuffer)))) != null) {
                return bzf.ghsz_4(bufferedImage);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    private static class_1044 shll(BufferedImage bufferedImage) {
        int n = 1434193011;
        n = Integer.rotateLeft(n * 131689181, 8) ^ 0xF4C09888;
        BufferedImage bufferedImage2 = bufferedImage;
        n = (bufferedImage2 != null ? System.identityHashCode(bufferedImage2) : 0) ^ n;
        int n2 = n ^ 0xE96CF202;
        if ((n2 ^ n) != -378736126) {
            int cfr_ignored_0 = (0xBC10FE71 ^ n) - 312591470;
        }
        int n3 = bufferedImage.getWidth();
        int n4 = bufferedImage.getHeight();
        class_1011 class_10112 = new class_1011(n3, n4, false);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                bzf.bba_2(class_10112, j, i, bzf.rshh_2(bufferedImage, j, i));
            }
        }
        return new class_1043(class_10112);
    }

    private static String thdgh(ByteBuffer byteBuffer) {
        try {
            int n = -566073819;
            n = Integer.rotateLeft(n * 475942789, 27) ^ 0x2D494A5A;
            ByteBuffer byteBuffer2 = byteBuffer;
            n = (byteBuffer2 != null ? System.identityHashCode(byteBuffer2) : 0) ^ n;
            int n2 = n ^ 0xCB2F1931;
            if ((n2 ^ n) != -886105807) {
                int cfr_ignored_0 = (0x156D7F14 ^ n) + -239354043;
            }
            MessageDigest messageDigest = bzf.aly("MD5");
            messageDigest.update(bzf.ttth(byteBuffer));
            return bzf.dar(messageDigest.digest());
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    private static byte[] ttth(ByteBuffer byteBuffer) {
        int n = tss_2.zyy(-1791381445);
        int n2 = n ^ 0xAD37FEEB;
        if ((n2 ^ n) != -1388839189) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x380E4ED0 ^ n, 10) + -837211541) * 940461777;
        }
        ByteBuffer byteBuffer2 = byteBuffer.asReadOnlyBuffer();
        byteBuffer2.clear();
        byte[] byArray = new byte[byteBuffer2.remaining()];
        byteBuffer2.get(byArray);
        return byArray;
    }

    private static void zsd_3() {
        try {
            int n = 2048592517;
            n = Integer.rotateLeft(n * 1192800795, 6) ^ 0x48AA8271;
            int n2 = n ^ 0x6EF0F706;
            if ((n2 ^ n) != 1861285638) {
                int cfr_ignored_0 = (0x14EBFD83 ^ n) + 521157132;
            }
            if ((0x1A7 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!bzf.jty_2()) {
            bzf.dra();
            throw null;
        }
        class_310.method_1551().execute(bzf::zfs_2);
        tsa = "";
    }

    private static String dar(byte[] byArray) {
        int n = tss_2.zyy(-1276720793);
        n = (byArray != null ? System.identityHashCode(byArray) : 0) ^ n;
        int n2 = n ^ 0x8F14FBCE;
        if ((n2 ^ n) != -1894450226) {
            int cfr_ignored_0 = Integer.rotateLeft(0x3CF232A9 ^ n, 10) + 1706148274;
            int cfr_ignored_1 = (int)(0xFE409C9427D4EB4FL ^ (long)n ^ 0xC458831A2DB85150L);
        }
        if (yf.dnkh()) {
            throw null;
        }
        StringBuilder stringBuilder = new StringBuilder(byArray.length * 2);
        for (byte by : byArray) {
            bzf.ahb_2(stringBuilder, Character.forDigit(by >> 4 & (Integer.reverse(1290395768) ^ 0x1E07973D), -1089441144 - -1089441160));
            stringBuilder.append(Character.forDigit(by & -763917463 - -763917478, 1764950520 - 1764950504));
        }
        return bzf.jtht(stringBuilder);
    }

    private static void zfs_2() {
        int n = 0;
        int n2 = 398483874;
        n2 = Integer.rotateLeft(n2 * 537280703, 8) ^ 0x7919A96B;
        int n3 = Integer.reverse(Integer.reverse(438843605 * -280369117 + -1058928898 ^ n2));
        block25: while (true) {
            switch (((n3 ^ n2) - -1058928898) * 29493131) {
                case 438843605: {
                    int cfr_ignored_0 = Integer.rotateLeft(0x728E39EC ^ n2, 17) - -476667185;
                    if (!yf.khdha_2()) {
                        int cfr_ignored_1 = (int)(0x6C725132B7CA6C47L ^ (long)n2 ^ 0x5F15A32723A97535L);
                        n3 = Integer.reverse(Integer.reverse(-1371787314 * -280369117 + -1058928898 ^ n2));
                        int cfr_ignored_2 = (int)(0x5A7C374FE05ADC45L ^ (long)n2 ^ 0x93EF0C0643AD1929L);
                        n3 = (438843606 * -280369117 + -1058928898 ^ n2) + 258135213 - 258135213;
                        n -= 3;
                        continue block25;
                    }
                    n3 = (1339004835 * -280369117 + -1058928898 ^ n2) + 1575704961 - 1575704961;
                    int cfr_ignored_3 = (Integer.rotateLeft(0xEEBC8858 ^ n2, 16) + -315481629) * -289634215;
                    n3 = (int)((long)(438843607 * -280369117 + -1058928898 ^ n2) ^ 0xAC2BA2295D357ABDL ^ 0xAC2BA2295D357ABDL);
                    continue block25;
                }
                case 438843607: {
                    int cfr_ignored_4 = (Integer.rotateRight(0x8648CA17 ^ n2, 3) - 1194203140) * -2042050025;
                    hdhf.values().forEach(class_1044::close);
                    hdhf.clear();
                    return;
                }
                case 438843606: {
                    int cfr_ignored_5 = Integer.rotateLeft(0xF6AEC384 ^ n2, 17) - -477672393;
                    yf.athz_2();
                    throw null;
                }
                case 438843608: {
                    int cfr_ignored_6 = Integer.rotateLeft(0xD8D45F64 ^ n2, 14) - 1175792727;
                    int cfr_ignored_7 = (int)(0xF6421C2C5F64DF65L ^ (long)n2 ^ 0xC528727A45EC4155L);
                    n3 = Integer.reverse(Integer.reverse(1031635004 * -280369117 + -1058928898 ^ n2));
                    int cfr_ignored_8 = (int)(0x72D2F688C29740FBL ^ (long)n2 ^ 0x1061499D7AD14874L);
                    n3 = 438843605 * -280369117 + -1058928898 ^ n2;
                    continue block25;
                }
                case 438843609: {
                    int cfr_ignored_9 = Integer.rotateRight(0x864B77E3 ^ n2, 3) + 1199645624;
                    n3 = 59511565 * -280369117 + -1058928898 ^ n2;
                    int cfr_ignored_10 = Integer.rotateLeft(0xC0F8A805 ^ n2, 11) - 1652160470;
                    int cfr_ignored_11 = (int)(0x24A063827D4EB4FL ^ (long)n2 ^ 0xF100831A2DB9A945L);
                    try {
                        n += 2;
                        if ((0xF04EA06EB6639DF5L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(Integer.reverse(438843605 * -280369117 + -1058928898 ^ n2));
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = 438843605 * -280369117 + -1058928898 ^ n2 ^ 0x92A1777B ^ 0x92A1777B;
                    }
                    n -= 4;
                    continue block25;
                }
                case 438843610: {
                    int cfr_ignored_12 = Integer.rotateLeft(0xB55ADAC9 ^ n2, 9) + -94495342;
                    int cfr_ignored_13 = (int)(0x77E874F427D4EB4FL ^ (long)n2 ^ 0x1498831A2DB94201L);
                    n3 = (-442661749 * -280369117 + -1058928898 ^ n2) + 2067552023 - 2067552023;
                    int cfr_ignored_14 = (Integer.rotateLeft(0x1099B691 ^ n2, 5) + 117095114) * 278509201;
                    int cfr_ignored_15 = (int)(0xD22B18AC27D4EB4FL ^ (long)n2 ^ 0xCC28831A2DB80987L);
                    n3 = (int)((long)(-1526659523 * -280369117 + -1058928898 ^ n2) ^ 0x58ED7089F7A34DD6L ^ 0x58ED7089F7A34DD6L);
                    int cfr_ignored_16 = Integer.rotateRight(0xB8224642 ^ n2, 10) + 1350836537;
                    n3 = Integer.reverse(Integer.reverse(438843605 * -280369117 + -1058928898 ^ n2));
                    n += 4;
                    continue block25;
                }
                case 438843611: {
                    int cfr_ignored_17 = Integer.rotateLeft(0x3A4FED0C ^ n2, 10) - 336286639;
                    try {
                        n -= 2;
                        if ((0x7C379488D7CE6FDL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        n3 = 438843605 * -280369117 + -1058928898 ^ n2;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = 438843605 * -280369117 + -1058928898 ^ n2 ^ 0x2666F208 ^ 0x2666F208;
                    }
                    --n;
                    continue block25;
                }
                case 438843612: {
                    int cfr_ignored_18 = (Integer.rotateLeft(0xD4C33478 ^ n2, 13) + -939460157) * -725404551;
                    n3 = Integer.reverse(Integer.reverse(-2026844915 * -280369117 + -1058928898 ^ n2));
                    int cfr_ignored_19 = Integer.rotateLeft(0x750DD6A4 ^ n2, 17) - 822779159;
                    int cfr_ignored_20 = (int)(0x55043445DA9CD2AL ^ (long)n2 ^ 0x7BF877E06173A771L);
                    n3 = Integer.reverse(Integer.reverse(869463540 * -280369117 + -1058928898 ^ n2));
                    int cfr_ignored_21 = (int)(0x19397F1E7B59319AL ^ (long)n2 ^ 0x34C3A0198139FA3L);
                    n3 = (438843605 * -280369117 + -1058928898 ^ n2) + -607452362 - -607452362;
                    n += 5;
                    continue block25;
                }
                case 438843613: {
                    int cfr_ignored_22 = (Integer.rotateLeft(0x2262E539 ^ n2, 7) + 777478434) * 576906553;
                    int cfr_ignored_23 = (int)(0xE0D04B0427D4EB4FL ^ (long)n2 ^ 0x6B78831A2DB86C71L);
                    n3 = (int)((long)(-344155685 * -280369117 + -1058928898 ^ n2) ^ 0x2792AC8A03C96D6BL ^ 0x2792AC8A03C96D6BL);
                    int cfr_ignored_24 = (Integer.rotateRight(0x5C1E615A ^ n2, 14) + 738945313) * 1545494875;
                    try {
                        n -= 5;
                        n3 = (int)((long)(438843605 * -280369117 + -1058928898 ^ n2) ^ 0x3BE491F68B9AF8C4L ^ 0x3BE491F68B9AF8C4L);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = 438843605 * -280369117 + -1058928898 ^ n2 ^ 0xB054DBB0 ^ 0xB054DBB0;
                    }
                    --n;
                    continue block25;
                }
                case 438843614: {
                    int cfr_ignored_25 = (Integer.rotateLeft(0x2AED9811 ^ n2, 8) + 925043018) * 720214033;
                    int cfr_ignored_26 = (int)(0xE85F362C27D4EB4FL ^ (long)n2 ^ 0x9128831A2DB87D6FL);
                    int cfr_ignored_27 = (int)(0x35AA0E20C8D8FED4L ^ (long)n2 ^ 0xE1315D02068FC685L);
                    n3 = (-484437926 * -280369117 + -1058928898 ^ n2) + -1101741926 - -1101741926;
                    int cfr_ignored_28 = (int)(0x3519231DCA91B887L ^ (long)n2 ^ 0xBB4B59908A29C7E3L);
                    n3 = 438843605 * -280369117 + -1058928898 ^ n2;
                    continue block25;
                }
                case 438843615: {
                    int cfr_ignored_29 = Integer.rotateRight(0x28F6BAC7 ^ n2, 8) - -96584364;
                    n3 = (int)((long)(-52934205 * -280369117 + -1058928898 ^ n2) ^ 0x6AAAD0D75E7D55EL ^ 0x6AAAD0D75E7D55EL);
                    int cfr_ignored_30 = (Integer.rotateRight(0x17A5665F ^ n2, 5) - -513473348) * 396715615;
                    try {
                        n -= 5;
                        n3 = 438843605 * -280369117 + -1058928898 ^ n2 ^ 0x81E5045 ^ 0x81E5045;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)(438843605 * -280369117 + -1058928898 ^ n2) ^ 0xF0F8890EAEAD14F6L ^ 0xF0F8890EAEAD14F6L);
                    }
                    n += 2;
                    continue block25;
                }
                case 438843616: {
                    int cfr_ignored_31 = (Integer.rotateRight(0x1D753B76 ^ n2, 6) - -1785736571) * 494222199;
                    n3 = 4909059 * -280369117 + -1058928898 ^ n2;
                    int cfr_ignored_32 = Integer.rotateLeft(0x1EDCCDC0 ^ n2, 6) + -1055225477;
                    try {
                        --n;
                        if ((0xCD8430A1DF97BCEFL ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = 438843605 * -280369117 + -1058928898 ^ n2;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = 438843605 * -280369117 + -1058928898 ^ n2 ^ 0x90E4CA6E ^ 0x90E4CA6E;
                    }
                    continue block25;
                }
                case 438843617: {
                    int cfr_ignored_33 = (Integer.rotateRight(0xFFD0CB5B ^ n2, 18) + -22659264) * -3093669;
                    int cfr_ignored_34 = (int)(0x9A231A343B3DBFFCL ^ (long)n2 ^ 0xC918BAC884DE9997L);
                    n3 = (438843605 * -280369117 + -1058928898 ^ n2) + 1495169244 - 1495169244;
                    n += 3;
                    continue block25;
                }
            }
            int cfr_ignored_35 = Integer.rotateLeft(0x97520AE1 ^ n2, 5) + 1464660090;
            int cfr_ignored_36 = (int)(0x55E0A4DC27D4EB4FL ^ (long)n2 ^ 0xB4C8831A2DB90610L);
            n3 = 438843605 * -280369117 + -1058928898 ^ n2 ^ 0xE4ADB036 ^ 0xE4ADB036;
        }
    }

    private static void thjm() {
        try {
            int n = -1272335550;
            n = Integer.rotateLeft(n * -1290861801, 17) ^ 0x1D306785;
            int n2 = n ^ 0xEBD2EE7F;
            if ((n2 ^ n) != -338497921) {
                int cfr_ignored_0 = (0x5FFB5D3D ^ n) - -675649368;
            }
            MediaPlayerInfo.INSTANCE.getMediaSessions();
            List<IMediaSession> list = MediaPlayerInfo.INSTANCE.getMediaSessions();
            IMediaSession iMediaSession = list.stream().filter(bzf::shzf_2).findFirst().orElse(null);
            if (iMediaSession != null) {
                ByteBuffer byteBuffer;
                String string = "";
                byte[] byArray = iMediaSession.getMedia().getArtworkPng();
                if (byArray != null && byArray.length > 0 && !(string = bzf.thdgh(byteBuffer = ByteBuffer.wrap(byArray))).equals(tsa)) {
                    String string2 = string;
                    String string3 = tsa;
                    class_310.method_1551().execute(() -> bzf.dhtha(string3, byteBuffer, string2));
                    tsa = string;
                }
                dhwr = new trz(iMediaSession.getMedia().getTitle(), iMediaSession.getMedia().getArtist(), string, iMediaSession);
            } else {
                bzf.zsd_3();
                dhwr = null;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void dhtha(String string, ByteBuffer byteBuffer, String string2) {
        class_1044 class_10443;
        try {
            int n = 1293001717;
            n = Integer.rotateLeft(n * 1490437605, 12) ^ 0x299E4FA7;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            String string4 = string2;
            n = Integer.rotateRight((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 21);
            int n2 = n ^ 0x1FF5EB74;
            if ((n2 ^ n) != 536210292) {
                int cfr_ignored_0 = (0x52E44881 ^ n) + -273496177;
            }
            if ((0x37C & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_1044 class_10445 = (class_1044)hdhf.remove(string);
        if (class_10445 != null) {
            class_10445.close();
        }
        if ((class_10443 = bzf.hshh(byteBuffer)) != null) {
            hdhf.put(string2, class_10443);
        }
    }

    private static boolean shzf_2(IMediaSession iMediaSession) {
        try {
            int n = 400121849;
            n = Integer.rotateLeft(n * -888204717, 14) ^ 0xBF7837A4;
            int n2 = n ^ 0x479F26D3;
            if ((n2 ^ n) != 1201612499) {
                int cfr_ignored_0 = (0x5046792A ^ n) + 1891841049;
            }
            if ((0x236 & 0) != 0) {
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
        return !iMediaSession.getMedia().getArtist().isEmpty() && !iMediaSession.getMedia().getTitle().isEmpty();
    }

    private static String zash(String string, int n, int n2, int n3) {
        int n4 = tss_2.zyy(812269142);
        n4 = n2 ^ n4;
        int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 9)) ^ 0x815C0717;
        if ((n5 ^ n4) != -2124675305) {
            int cfr_ignored_0 = Integer.rotateLeft(0xB1363941 ^ n4, 9) + 2045677082;
            int cfr_ignored_1 = (int)(0x7384977C27D4EB4FL ^ (long)n4 ^ 0xD388831A2DB94AD8L);
        }
        if (yf.dnkh()) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x55B0A915 ^ n2 - i) + skd_2, 9) ^ bghd + i * -797094783));
        }
        return new String(cArray);
    }

    private static class_1044 ghsz_4(BufferedImage bufferedImage) {
        block0: {
            int n = tss_2.zyy(2085855054);
            int n2 = n ^ 0x13772DF7;
            if ((n2 ^ n) == 326577655) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x6F24B2B9 ^ n, 16) + 2043626402) * 1864676025;
            int cfr_ignored_1 = (int)(0xAD961C8427D4EB4FL ^ (long)n ^ 0xC478831A2DB8F6FDL);
        }
        return bzf.shll(bufferedImage);
    }

    private static int rshh_2(BufferedImage bufferedImage, int n, int n2) {
        block0: {
            int n3 = 275214241;
            n3 = Integer.rotateLeft(n3 * 897567391, 24) ^ 0x1E214927;
            BufferedImage bufferedImage2 = bufferedImage;
            n3 = Integer.rotateLeft((bufferedImage2 != null ? System.identityHashCode(bufferedImage2) : 0) ^ n3, 9);
            int n4 = n3 ^ 0x29CC8653;
            if ((n4 ^ n3) == 701269587) break block0;
            int cfr_ignored_0 = (0x39ABE9F2 ^ n3) - -216664509;
        }
        return bufferedImage.getRGB(n, n2);
    }

    private static void bba_2(class_1011 class_10112, int n, int n2, int n3) {
        int n4 = -1615374334;
        n4 = Integer.rotateLeft(n4 * -1766655189, 5) ^ 0x6267101;
        n4 = Integer.rotateRight(n ^ n4, 6);
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 10)) ^ 0x5A1CE79A;
        if ((n5 ^ n4) != 1511843738) {
            int cfr_ignored_0 = (0xC5ABBF98 ^ n4) + -2129763542;
        }
        class_10112.method_61941(n, n2, n3);
    }

    private static String skhw(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1989281063;
            n4 = Integer.rotateLeft(n4 * -725532189, 24) ^ 0xD47DC47D;
            n4 = Integer.rotateLeft(n ^ n4, 10);
            int n5 = (n4 = n3 ^ n4) ^ 0xC1985882;
            if ((n5 ^ n4) == -1046980478) break block0;
            int cfr_ignored_0 = (0x48F5A25B ^ n4) - 2063451881;
        }
        return bzf.zash(string, n, n2, n3);
    }

    private static MessageDigest aly(String string) {
        block0: {
            int n = tss_2.zyy(1814821350);
            int n2 = n ^ 0x669A189F;
            if ((n2 ^ n) == 1721374879) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xAB1E179 ^ n, 4) + 1340599522) * 179429753;
            int cfr_ignored_1 = (int)(0xC8034F4427D4EB4FL ^ (long)n ^ 0x63F8831A2DB83DD7L);
        }
        return MessageDigest.getInstance(string);
    }

    private static boolean jty_2() {
        block0: {
            int n = -600788890;
            int n2 = (n = Integer.rotateLeft(n * 1354328491, 12) ^ 0xB94F1291) ^ 0xDFBDCD02;
            if ((n2 ^ n) == -541209342) break block0;
            int cfr_ignored_0 = (0x38D7D64 ^ n) - -404939662;
        }
        return yf.khdha_2();
    }

    private static void dra() {
        int n = 1221588018;
        int n2 = (n = Integer.rotateLeft(n * -416626563, 15) ^ 0xC4D5424A) ^ 0x393F9B76;
        if ((n2 ^ n) != 960469878) {
            int cfr_ignored_0 = (0x71F06F44 ^ n) + 1315184738;
        }
        yf.athz_2();
    }

    private static StringBuilder ahb_2(StringBuilder stringBuilder, char c) {
        block0: {
            int n = -144284703;
            n = Integer.rotateLeft(n * 928727901, 13) ^ 0x439E8E2F;
            int n2 = (n = Integer.rotateRight(c ^ n, 28)) ^ 0xC20A9515;
            if ((n2 ^ n) == -1039493867) break block0;
            int cfr_ignored_0 = (0x356CF6F4 ^ n) - -1432847592;
        }
        return stringBuilder.append(c);
    }

    private static String jtht(StringBuilder stringBuilder) {
        block0: {
            int n = 1321416651;
            int n2 = (n = Integer.rotateLeft(n * 1841438153, 16) ^ 0x6BC32E9C) ^ 0x4305AD2F;
            if ((n2 ^ n) == 1124445487) break block0;
            int cfr_ignored_0 = (0xDC69AE4 ^ n) - -1524836234;
        }
        return stringBuilder.toString();
    }

    private static String[] thhs(String string) {
        int n = 538224228;
        n = Integer.rotateLeft(n * -1656454275, 14) ^ 0xBAE7F232;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 3);
        int n2 = n ^ 0x925217BA;
        if ((n2 ^ n) != -1840113734) {
            int cfr_ignored_0 = (0xB246B1DE ^ n) - -829543511;
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

    private static CallSite raq_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 2000358265;
            n3 = Integer.rotateLeft(n3 * -1314291275, 26) ^ 0x1CA1BF47;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 19);
            n3 = n ^ n3;
            int n4 = n3 ^ 0xBFBACB1;
            if ((n4 ^ n3) != 201043121) {
                int cfr_ignored_0 = (0x7CC0A7C8 ^ n3) - 126836259;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ zha ^ string.hashCode()) + (n2 + shtl_2) + i ^ zha, 26) + shtl_2);
            }
            String[] stringArray = bzf.thhs(new String(cArray));
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

    private static String[] oymqo7p233ft(String string) {
        return string.split("\u0007\u0019", -1);
    }

    private static CallSite eyq9v7uf48(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ wqivfjvhrp9 ^ string.hashCode() ^ n2 + kguf1ms3 ^ i * -1027203041 ^ wqivfjvhrp9, 23) ^ kguf1ms3));
            }
            String[] stringArray = bzf.oymqo7p233ft(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

