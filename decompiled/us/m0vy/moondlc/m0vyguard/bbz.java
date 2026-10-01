/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ai.catboost.CatBoostModel
 *  ai.catboost.CatBoostPredictions
 *  net.minecraft.class_1297
 *  net.minecraft.class_2246
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_5611
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import ai.catboost.CatBoostModel;
import ai.catboost.CatBoostPredictions;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import net.minecraft.class_1297;
import net.minecraft.class_2246;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_5611;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.bbdh;
import us.m0vy.moondlc.m0vyguard.bdhb;
import us.m0vy.moondlc.m0vyguard.brq;
import us.m0vy.moondlc.m0vyguard.bns;
import us.m0vy.moondlc.m0vyguard.taj;
import us.m0vy.moondlc.m0vyguard.tbs_2;
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.tht;
import us.m0vy.moondlc.m0vyguard.tkhk;
import us.m0vy.moondlc.m0vyguard.tsn;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.kf;
import us.m0vy.moondlc.m0vyguard.lq;
import us.m0vy.moondlc.m0vyguard.mm;
import us.m0vy.moondlc.m0vyguard.ngh;
import us.m0vy.moondlc.m0vyguard.nn;
import us.m0vy.moondlc.m0vyguard.yf;

public class bbz
extends tht
implements dl {
    private CatBoostModel raj;
    private CatBoostModel zmd;
    private final brq shdt = new brq();
    public bns rdt_2 = new bns();
    private static final String sshr = "https://raw.githubusercontent.com/Moondlc/assets/main/models/";
    private static final int rshw = -1097867348;
    private static final int dhjz = 1671585903;
    private static final int hkha = 2073913103;
    private static final int khbj = 126766192;
    private static final int l29sgpu = 721932205;
    private static final int mq8cdhjetcu = -589222394;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int ia257qqxmwwn;

    @Override
    public void thtj() {
        tbs_2 tbs2 = bbdh.dhthq().jkhh_2(new lq(this::zwsh_2));
        this.rsz_3(tbs2);
    }

    public void ygh(String string) {
        try {
            File file;
            try {
                int n = -2102091237;
                n = Integer.rotateLeft(n * 1717694145, 4) ^ 0xCA372C79;
                n = System.identityHashCode(this) ^ n;
                int n2 = n ^ 0xFC3C8CE;
                if ((n2 ^ n) != 264489166) {
                    int cfr_ignored_0 = (0x8D776AD5 ^ n) + -290681131;
                }
                if ((0x232 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            if (!bbz.thts()) {
                yf.athz_2();
            }
            if (!(file = new File(bdhb.shhm)).exists()) {
                file.mkdirs();
            }
            String string2 = bbz.zkl(string);
            File file2 = new File(file, string2 + "_yaw.model");
            File file3 = new File(file, string2 + "_pitch.model");
            if (string.equals("Default")) {
                bbz.tyth_2(this, file2, "https://raw.githubusercontent.com/Moondlc/assets/main/models/default_yaw.model");
                bbz.ddz_2(this, file3, bbz.sds_8("赴ꈷ僾䅁瘋撅ᗉਂ㬦⧺\udeb5켧﷗銞荊뀍ꛙ垱䑯甲毭ᢽक㿒Ⲋ\udd5f", bbz.dkhk_2(0xA8E1BD80 ^ 0x4F8B453D, 8), 1854891508 - 93486679, 508094341 + 1756609718).concat("t.com/Moondlc/assets/main").concat("/models/default_pitch.model"));
            }
            if (file2.exists() && file3.exists()) {
                this.raj = bbz.shh_3(file2.getAbsolutePath());
                this.zmd = CatBoostModel.loadModel((String)file3.getAbsolutePath());
            } else {
                System.err.println("AI Models not found on disk: " + file2.getName() + ", " + bbz.thnz(file3));
            }
        }
        catch (Exception exception) {
            System.err.println("Failed to load AI models: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    private void jha_3(File file, String string) {
        block17: {
            int n = -1212693752;
            n = Integer.rotateLeft(n * 880282035, 18) ^ 0x9C7DC70;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 10);
            File file2 = file;
            n = (file2 != null ? System.identityHashCode(file2) : 0) ^ n;
            int n2 = n ^ 0x67C1EBE3;
            if ((n2 ^ n) != 1740762083) {
                int cfr_ignored_0 = (0xD07628EB ^ n) - 572073157;
            }
            if (file.exists() && bbz.ndh(file) > 0L) {
                return;
            }
            try {
                System.out.println("Downloading AI model to: " + file.getAbsolutePath());
                URL uRL = new URI(string).toURL();
                URLConnection uRLConnection = uRL.openConnection();
                uRLConnection.setConnectTimeout(0x5772F20C ^ 0x5772D51C);
                bbz.thsd_3(uRLConnection, -897535633 - -897565633);
                try (InputStream inputStream = uRLConnection.getInputStream();
                     FileOutputStream fileOutputStream = new FileOutputStream(file);){
                    int n3;
                    byte[] byArray = new byte[-1634636810 - -1634645002];
                    while ((n3 = inputStream.read(byArray)) != -1) {
                        fileOutputStream.write(byArray, 0, n3);
                    }
                }
                System.out.println("AI model downloaded successfully: " + file.getName());
            }
            catch (Exception exception) {
                System.err.println("Failed to download AI model from " + string + ": " + exception.getMessage());
                if (!file.exists()) break block17;
                file.delete();
            }
        }
    }

    public boolean jkhn() {
        int n = -779481663;
        int n2 = (n = Integer.rotateLeft(n * -55625315, 25) ^ 0xE3F778AE) ^ 0x1EE6243A;
        if ((n2 ^ n) != 518399034) {
            int cfr_ignored_0 = (0xCF6C29FB ^ n) - -1580821652;
        }
        return this.raj != null && this.zmd != null;
    }

    public void rnkh() {
        int n = -1348948968;
        n = Integer.rotateLeft(n * -553515933, 9) ^ 0x5AA6E17A;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 20);
        int n2 = n ^ 0x2070323A;
        if ((n2 ^ n) != 544223802) {
            int cfr_ignored_0 = (0x8FE89E22 ^ n) + 1251722464;
        }
        if (this.raj != null) {
            bbz.rhq(this.raj);
        }
        if (this.zmd != null) {
            this.zmd.close();
        }
        this.raj = null;
        this.zmd = null;
    }

    public taj zss_6(class_1297 class_12972, taj taj2, taj taj3, class_5611 class_56112) {
        int n = 7953495;
        n = Integer.rotateLeft(n * 761211987, 21) ^ 0xB5C17ED;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 8);
        class_1297 class_12973 = class_12972;
        n = Integer.rotateRight((class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n, 27);
        int n2 = n ^ 0xFAC28D70;
        if ((n2 ^ n) != -87913104) {
            int cfr_ignored_0 = (0xFABBD127 ^ n) - 1968473808;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (!this.jkhn()) {
            return taj2;
        }
        class_243 class_2432 = bbz.mc.field_1724.method_19538();
        class_243 class_2433 = bbz.zghdh_2(class_12972);
        class_243 class_2434 = class_243.field_1353;
        class_243 class_2435 = class_243.field_1353;
        taj taj4 = bbz.jnsh(this, class_2433);
        float f = class_3532.method_15393((float)bbz.hfd(taj4));
        float f2 = bbz.rdr_2(bbz.aht(taj4), Float.intBitsToFloat(1141699550 + 2124876834), bbz.bmr(0x2E262E3D ^ 0x6C922E3D));
        nn nn2 = new nn(Math.abs(bbz.tms_2(taj2) - bbz.dhhm(taj3)), Math.abs(taj2.shyq() - bbz.ztq(taj3)), 0.0f, f2, bbz.bdhsh(this.shdt), (float)bbz.mc.field_1724.method_19538().method_1022(class_2433), bbz.dhlb(bbz.mc.field_1724) ? 1 : 0, bbz.zys_2(bbz.mc.field_1724) || bbz.ahgh_2(bbz.mc.field_1724) ? 1 : 0, class_3532.method_15393((float)taj2.dda_3()), bbz.dghd_2(taj2), (float)class_2432.field_1352, (float)class_2432.field_1351, (float)class_2432.field_1350, (float)class_2434.field_1352, (float)class_2434.field_1351, (float)class_2434.field_1350, (float)class_2433.field_1352, (float)class_2433.field_1351, (float)class_2433.field_1350, (float)class_2435.field_1352, (float)class_2435.field_1351, (float)class_2435.field_1350, 0.0f, 0.0f, 0.0f);
        float[] fArray = new float[bbz.atkh(-91403119) ^ 0x8932B146];
        fArray[0] = nn2.hbb();
        fArray[1] = nn2.dhsz_4();
        fArray[2] = bbz.shsn_2(nn2);
        fArray[3] = nn2.khkhkh();
        fArray[4] = nn2.dtsh_3();
        fArray[5] = bbz.hfs_2(nn2);
        fArray[0x679031A ^ 0x679031C] = bbz.skl_2(nn2);
        fArray[0xCAC017CB ^ 0xCAC017CC] = nn2.thngh();
        fArray[863045589 + -863045581] = nn2.hwdh();
        fArray[0x5987905C ^ 0x59879055] = bbz.syt(nn2);
        fArray[0xA4787B51 ^ 0xA4787B5B] = bbz.adhk(nn2);
        fArray[0x9533B179 ^ 0x9533B172] = nn2.dbb_2();
        fArray[34434557 - 34434545] = nn2.tdk_3();
        fArray[Integer.rotateLeft((int)(0x9D7DCC50 ^ 0x9D7DC150), (int)24)] = nn2.shdr_2();
        fArray[247016467 + -247016453] = nn2.anl();
        fArray[Integer.reverse((int)224077552) ^ 0xF64DABF] = nn2.ddn_4();
        fArray[1746967037 - 1746967021] = nn2.dzh_6();
        fArray[Integer.rotateLeft((int)(0xAF02FBF2 ^ 0xAF13FBF2), (int)16)] = nn2.afk();
        fArray[-1780212998 - -1780213016] = nn2.tsht();
        fArray[276823399 + -276823380] = nn2.dzw_2();
        fArray[1638332304 - 1638332284] = nn2.jbm();
        fArray[Integer.reverse((int)982826757) ^ 0xA0FD2949] = nn2.ddh_4();
        fArray[Integer.reverse((int)-1624567299) ^ 0xBF88D4EF] = nn2.ghhs();
        fArray[Integer.reverse((int)-1653761168) ^ 0xED9B6AE] = nn2.ththz_2();
        fArray[Integer.rotateLeft((int)(0xA558B2DB ^ 0xA55882DB), (int)23)] = nn2.bmkh();
        float[] fArray2 = fArray;
        String[] stringArray = new String[]{String.valueOf(nn2.tjt()), String.valueOf(nn2.thngh())};
        CatBoostPredictions catBoostPredictions = this.raj.predict(fArray2, stringArray);
        CatBoostPredictions catBoostPredictions2 = this.zmd.predict(fArray2, stringArray);
        float f3 = (float)catBoostPredictions.get(0, 0);
        float f4 = (float)catBoostPredictions2.get(0, 0);
        float f5 = ((f3 + f - this.rdt_2.qgh()) % Float.intBitsToFloat(Integer.rotateLeft(0x71EE1A24 ^ 0x19EE1AA3, 23)) + Float.intBitsToFloat(Integer.rotateLeft(0xED1ADBB ^ 0xEF3AE3B, 9))) % Float.intBitsToFloat(629276127 - -506593825) - Float.intBitsToFloat(851439427 + 276041917);
        float f6 = this.rdt_2.qgh() + f5;
        float f7 = f4 - this.rdt_2.awk();
        if (bbz.mc.field_1724.method_23318() > class_12972.method_23318() + (double)class_12972.method_17682()) {
            f7 = this.rghm(class_12972.method_19538().method_1031(0.0, (double)class_12972.method_17682(), 0.0)).shyq();
        }
        if (bbz.mc.field_1724.method_23318() + 1.0 < class_12972.method_23318()) {
            f7 = this.rghm(class_12972.method_19538().method_1031(0.0, Double.longBitsToDouble(0xC5A54E309BF45B67L ^ 0xFA454E309BF45B67L), 0.0)).shyq();
        }
        if (bbz.mc.field_1724.method_5681()) {
            f7 = this.rghm(class_12972.method_19538().method_1031(0.0, (double)(class_12972.method_17682() / 2.0f), 0.0)).shyq();
            class_56112 = new class_5611((float)ngh.tys_3(-412282173 - -412282373, 1539422512 - 1539422162), (float)ngh.tys_3(Integer.reverse(-40845243) ^ 0xA2030977, Integer.reverse(1288160087) ^ 0xEAC3E26C));
        }
        if (kf.sb_2(class_12972) && kf.tyt_2(0.0f, 2.0f, 0.0f) != class_2246.field_10124 && kf.tyt_2(0.0f, Float.intBitsToFloat(Integer.reverse(1168781501) ^ 0x28C55A2), 0.0f) != class_2246.field_10124 && kf.tyt_2(0.0f, 2.0f, 0.0f) != class_2246.field_10382 && kf.tyt_2(0.0f, Float.intBitsToFloat(Integer.reverse(1391490414) ^ 0xC92E0F4A), 0.0f) != class_2246.field_10382 || kf.sghh(class_12972, Float.intBitsToFloat(0x29D55705 ^ 0x96E66436))) {
            class_56112 = new class_5611(class_56112.method_32118() * Float.intBitsToFloat(809031248 + 261355133), class_56112.method_32119() * Float.intBitsToFloat(Integer.rotateLeft(0xCF70DF0E ^ 0x2916B991, 25)));
        }
        this.rdt_2.szsh_4(tbm.bthth).skhsh(new taj(f6, f7), (int)class_56112.method_32118(), (int)class_56112.method_32119());
        float f8 = class_56112.method_32118() == 0.0f ? f6 : this.rdt_2.qgh();
        float f9 = class_56112.method_32119() == 0.0f ? f7 : this.rdt_2.awk();
        return new taj(f8, f9);
    }

    private taj rghm(class_243 class_2432) {
        block0: {
            int n = -1565309820;
            n = Integer.rotateLeft(n * 914597443, 14) ^ 0x1545A706;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 7);
            int n2 = n ^ 0x44B4D556;
            if ((n2 ^ n) == 1152701782) break block0;
            int cfr_ignored_0 = (0xE60791D2 ^ n) - 136367346;
        }
        return tkhk.zthb_2(class_2432);
    }

    private void zwsh_2(mm mm2) {
        this.shdt.tshf_2();
    }

    private static String zhth_3(String string, int n, int n2, int n3) {
        try {
            int n4 = -842546015;
            n4 = Integer.rotateLeft(n4 * 1496024801, 14) ^ 0x4D3ED77E;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            n4 = n ^ n4;
            int n5 = n4 ^ 0xF24BF;
            if ((n5 ^ n4) != 992447) {
                int cfr_ignored_0 = (0xCDC8E01E ^ n4) + 100622032;
            }
            if ((0x2A0 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xEFFBFE63 ^ n2 - i) + dhjz, 9) ^ rshw + i * -428666553));
        }
        return new String(cArray);
    }

    private static boolean thts() {
        block0: {
            int n = 579770390;
            int n2 = (n = Integer.rotateLeft(n * -1417245185, 10) ^ 0xAB0A0FB8) ^ 0xADDD85CA;
            if ((n2 ^ n) == -1377991222) break block0;
            int cfr_ignored_0 = (0x8F531DDC ^ n) - 1280644101;
        }
        return yf.khdha_2();
    }

    private static String zkl(String string) {
        block0: {
            int n = 706143077;
            n = Integer.rotateLeft(n * 1187319813, 4) ^ 0xCC46D6C6;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0x686EB9FD;
            if ((n2 ^ n) == 1752087037) break block0;
            int cfr_ignored_0 = (0x42785A98 ^ n) - 1328171848;
        }
        return string.toLowerCase();
    }

    private static String tqb(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tsn.dshsh_2(1441659809);
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 17);
            int n5 = (n4 = n ^ n4) ^ 0x1CECBB60;
            if ((n5 ^ n4) == 485276512) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x490140C1 ^ n4, 12) + -612075878;
            int cfr_ignored_1 = (int)(0x8BB3EEFC27D4EB4FL ^ (long)n4 ^ 0x2088831A2DB8BAB6L);
        }
        return bbz.zhth_3(string, n, n2, n3);
    }

    private static void tyth_2(bbz bbz2, File file, String string) {
        int n = tsn.dshsh_2(-2056791550);
        File file2 = file;
        n = (file2 != null ? System.identityHashCode(file2) : 0) ^ n;
        int n2 = n ^ 0x2B1539CB;
        if ((n2 ^ n) != 722811339) {
            int cfr_ignored_0 = Integer.rotateLeft(0xAE72E3C9 ^ n, 8) + 608646290;
            int cfr_ignored_1 = (int)(0x6CC04DF427D4EB4FL ^ (long)n ^ 0x6698831A2DB97451L);
        }
        bbz2.jha_3(file, string);
    }

    private static int dkhk_2(int n, int n2) {
        block0: {
            int n3 = -214850606;
            n3 = Integer.rotateLeft(n3 * -926685065, 26) ^ 0x2E2ECB8A;
            n3 = n ^ n3;
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 29)) ^ 0xFDB9D2F3;
            if ((n4 ^ n3) == -38153485) break block0;
            int cfr_ignored_0 = (0xE887121 ^ n3) + 405165027;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String sds_8(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1593187907;
            n4 = Integer.rotateLeft(n4 * -1972944181, 16) ^ 0x12002A04;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 29);
            int n5 = n4 ^ 0xC7AD78A7;
            if ((n5 ^ n4) == -944932697) break block0;
            int cfr_ignored_0 = (0x66A4991A ^ n4) + 444457999;
        }
        return bbz.zhth_3(string, n, n2, n3);
    }

    private static void ddz_2(bbz bbz2, File file, String string) {
        int n = 860870376;
        n = Integer.rotateLeft(n * 1453529669, 3) ^ 0x419DDE1F;
        bbz bbz3 = bbz2;
        n = Integer.rotateRight((bbz3 != null ? System.identityHashCode(bbz3) : 0) ^ n, 11);
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 13);
        int n2 = n ^ 0x6B2C500A;
        if ((n2 ^ n) != 1798066186) {
            int cfr_ignored_0 = (0x586386E2 ^ n) - -127992439;
        }
        bbz2.jha_3(file, string);
    }

    private static CatBoostModel shh_3(String string) {
        block0: {
            int n = tsn.dshsh_2(687145185);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 26);
            int n2 = n ^ 0xE31966F0;
            if ((n2 ^ n) == -484874512) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xCBEC6611 ^ n, 12) + -1241646262) * -873699823;
            int cfr_ignored_1 = (int)(0x95EC82C27D4EB4FL ^ (long)n ^ 0x6D28831A2DB9BF6CL);
        }
        return CatBoostModel.loadModel((String)string);
    }

    private static String thnz(File file) {
        block0: {
            int n = 1010085600;
            n = Integer.rotateLeft(n * -779825401, 9) ^ 0xFC56CE60;
            File file2 = file;
            n = Integer.rotateLeft((file2 != null ? System.identityHashCode(file2) : 0) ^ n, 2);
            int n2 = n ^ 0x53A462C1;
            if ((n2 ^ n) == 1403282113) break block0;
            int cfr_ignored_0 = (0x6F90CC21 ^ n) - 212127061;
        }
        return file.getName();
    }

    private static long ndh(File file) {
        block0: {
            int n = -267476807;
            n = Integer.rotateLeft(n * 344247005, 28) ^ 0x53159CED;
            File file2 = file;
            n = Integer.rotateRight((file2 != null ? System.identityHashCode(file2) : 0) ^ n, 29);
            int n2 = n ^ 0xB71E3022;
            if ((n2 ^ n) == -1222758366) break block0;
            int cfr_ignored_0 = (0x4710909B ^ n) + -1662853936;
        }
        return file.length();
    }

    private static void thsd_3(URLConnection uRLConnection, int n) {
        int n2 = tsn.dshsh_2(-1124735891);
        URLConnection uRLConnection2 = uRLConnection;
        n2 = (uRLConnection2 != null ? System.identityHashCode(uRLConnection2) : 0) ^ n2;
        int n3 = (n2 = n ^ n2) ^ 0x8972D3E6;
        if ((n3 ^ n2) != -1988963354) {
            int cfr_ignored_0 = Integer.rotateRight(0x3587378B ^ n2, 9) + 2143115536;
        }
        uRLConnection.setReadTimeout(n);
    }

    private static void rhq(CatBoostModel catBoostModel) {
        int n = -1405463004;
        n = Integer.rotateLeft(n * -1214301155, 10) ^ 0xCD1BEAFC;
        CatBoostModel catBoostModel2 = catBoostModel;
        n = Integer.rotateRight((catBoostModel2 != null ? System.identityHashCode(catBoostModel2) : 0) ^ n, 5);
        int n2 = n ^ 0x892BF2C;
        if ((n2 ^ n) != 143834924) {
            int cfr_ignored_0 = (0xA4A8E908 ^ n) + -718808464;
        }
        catBoostModel.close();
    }

    private static class_243 zghdh_2(class_1297 class_12972) {
        block0: {
            int n = tsn.dshsh_2(-1170376769);
            class_1297 class_12973 = class_12972;
            n = (class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n;
            int n2 = n ^ 0x143E7547;
            if ((n2 ^ n) == 339637575) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xAE0302F8 ^ n, 8) + 381352771) * -1375534343;
        }
        return class_12972.method_19538();
    }

    private static taj jnsh(bbz bbz2, class_243 class_2432) {
        block0: {
            int n = -251204467;
            n = Integer.rotateLeft(n * 1612723635, 5) ^ 0xB2A6A386;
            bbz bbz3 = bbz2;
            n = (bbz3 != null ? System.identityHashCode(bbz3) : 0) ^ n;
            int n2 = n ^ 0xFC7B5DC8;
            if ((n2 ^ n) == -59023928) break block0;
            int cfr_ignored_0 = (0xD7DB145 ^ n) + -835091375;
        }
        return bbz2.rghm(class_2432);
    }

    private static float hfd(taj taj2) {
        block0: {
            int n = tsn.dshsh_2(-1045158525);
            taj taj3 = taj2;
            n = (taj3 != null ? System.identityHashCode(taj3) : 0) ^ n;
            int n2 = n ^ 0xF3AADAA8;
            if ((n2 ^ n) == -206906712) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x321EFF2B ^ n, 9) + 371098992;
        }
        return taj2.dda_3();
    }

    private static float aht(taj taj2) {
        block0: {
            int n = -600734190;
            int n2 = (n = Integer.rotateLeft(n * 2096666729, 19) ^ 0xAA7592CA) ^ 0x6FA1423E;
            if ((n2 ^ n) == 1872839230) break block0;
            int cfr_ignored_0 = (0xB390C42C ^ n) + 132297927;
        }
        return taj2.shyq();
    }

    private static float bmr(int n) {
        block0: {
            int n2 = 1293647842;
            n2 = Integer.rotateLeft(n2 * 1744117751, 7) ^ 0xFE73EDEF;
            int n3 = (n2 = n ^ n2) ^ 0xD8D99CED;
            if ((n3 ^ n2) == -656827155) break block0;
            int cfr_ignored_0 = (0x95C2E30F ^ n2) - 728377641;
        }
        return Float.intBitsToFloat(n);
    }

    private static float rdr_2(float f, float f2, float f3) {
        block0: {
            int n = -770354227;
            n = Integer.rotateLeft(n * 1510962077, 25) ^ 0xC20CDEC2;
            n = Integer.rotateRight(Float.floatToIntBits(f3) ^ n, 25);
            int n2 = n ^ 0xED835FFC;
            if ((n2 ^ n) == -310157316) break block0;
            int cfr_ignored_0 = (0x3F960C31 ^ n) + 1621298332;
        }
        return class_3532.method_15363((float)f, (float)f2, (float)f3);
    }

    private static float tms_2(taj taj2) {
        block0: {
            int n = -1422100541;
            int n2 = (n = Integer.rotateLeft(n * -105927923, 21) ^ 0xDC546654) ^ 0x829965E5;
            if ((n2 ^ n) == -2103876123) break block0;
            int cfr_ignored_0 = (0x29A51226 ^ n) - 312300376;
        }
        return taj2.dda_3();
    }

    private static float dhhm(taj taj2) {
        block0: {
            int n = 180781893;
            int n2 = (n = Integer.rotateLeft(n * 1123312129, 3) ^ 0x7C5E8657) ^ 0x53381A76;
            if ((n2 ^ n) == 1396185718) break block0;
            int cfr_ignored_0 = (0x59FE9933 ^ n) + -833457038;
        }
        return taj2.dda_3();
    }

    private static float ztq(taj taj2) {
        block0: {
            int n = 2087275162;
            int n2 = (n = Integer.rotateLeft(n * 855043315, 13) ^ 0x70425E73) ^ 0x714BAA37;
            if ((n2 ^ n) == 1900784183) break block0;
            int cfr_ignored_0 = (0xD22E0AD ^ n) + 626121800;
        }
        return taj2.shyq();
    }

    private static long bdhsh(brq brq2) {
        block0: {
            int n = tsn.dshsh_2(1989626931);
            int n2 = n ^ 0xE398E073;
            if ((n2 ^ n) == -476520333) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x950FAC40 ^ n, 5) + 289635067;
        }
        return brq2.shagh();
    }

    private static boolean dhlb(class_746 class_7462) {
        block0: {
            int n = 2069947029;
            int n2 = (n = Integer.rotateLeft(n * -686130025, 11) ^ 0x2AD8B558) ^ 0xDDC7707B;
            if ((n2 ^ n) == -574132101) break block0;
            int cfr_ignored_0 = (0xA6A792EE ^ n) + -998401563;
        }
        return class_7462.method_24828();
    }

    private static boolean zys_2(class_746 class_7462) {
        block0: {
            int n = 190516173;
            int n2 = (n = Integer.rotateLeft(n * -2122463247, 12) ^ 0x1ED2C18A) ^ 0xE292E050;
            if ((n2 ^ n) == -493690800) break block0;
            int cfr_ignored_0 = (0xE9C9EB9D ^ n) - -567051667;
        }
        return class_7462.method_6128();
    }

    private static boolean ahgh_2(class_746 class_7462) {
        block0: {
            int n = 238556304;
            n = Integer.rotateLeft(n * 779065109, 23) ^ 0x56858828;
            class_746 class_7463 = class_7462;
            n = Integer.rotateLeft((class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n, 18);
            int n2 = n ^ 0x5315B271;
            if ((n2 ^ n) == 1393930865) break block0;
            int cfr_ignored_0 = (0x5D2DA6E1 ^ n) - 1579521857;
        }
        return class_7462.method_5869();
    }

    private static float dghd_2(taj taj2) {
        block0: {
            int n = 1205842194;
            n = Integer.rotateLeft(n * -1559271447, 14) ^ 0x49E26B6F;
            taj taj3 = taj2;
            n = Integer.rotateRight((taj3 != null ? System.identityHashCode(taj3) : 0) ^ n, 25);
            int n2 = n ^ 0xDD1CDF40;
            if ((n2 ^ n) == -585310400) break block0;
            int cfr_ignored_0 = (0x9AC36E52 ^ n) - 1796079669;
        }
        return taj2.shyq();
    }

    private static int atkh(int n) {
        block0: {
            int n2 = -1609664059;
            n2 = Integer.rotateLeft(n2 * 258472303, 15) ^ 0x96D4AAA8;
            int n3 = (n2 = Integer.rotateRight(n ^ n2, 3)) ^ 0xAF435363;
            if ((n3 ^ n2) == -1354542237) break block0;
            int cfr_ignored_0 = (0xF4D2AA6 ^ n2) - -1673268946;
        }
        return Integer.reverse(n);
    }

    private static float shsn_2(nn nn2) {
        block0: {
            int n = 341665003;
            int n2 = (n = Integer.rotateLeft(n * -1278378755, 3) ^ 0xED9CDC2A) ^ 0x164C8856;
            if ((n2 ^ n) == 374114390) break block0;
            int cfr_ignored_0 = (0x211ECBD ^ n) + 612864956;
        }
        return nn2.zkhy();
    }

    private static float hfs_2(nn nn2) {
        block0: {
            int n = -587936302;
            n = Integer.rotateLeft(n * -1783076849, 4) ^ 0xF0217E59;
            nn nn3 = nn2;
            n = Integer.rotateRight((nn3 != null ? System.identityHashCode(nn3) : 0) ^ n, 23);
            int n2 = n ^ 0x54DE1884;
            if ((n2 ^ n) == 1423841412) break block0;
            int cfr_ignored_0 = (0x882AD556 ^ n) - -878566867;
        }
        return nn2.sqt_2();
    }

    private static int skl_2(nn nn2) {
        block0: {
            int n = -1967441254;
            int n2 = (n = Integer.rotateLeft(n * -1723186417, 11) ^ 0xD877CAA0) ^ 0x40B35D49;
            if ((n2 ^ n) == 1085496649) break block0;
            int cfr_ignored_0 = (0xCA0867D3 ^ n) + 1023540195;
        }
        return nn2.tjt();
    }

    private static float syt(nn nn2) {
        block0: {
            int n = tsn.dshsh_2(-64855938);
            int n2 = n ^ 0x8BE1BF74;
            if ((n2 ^ n) == -1948139660) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x77C3DF0A ^ n, 17) + -2062179983;
        }
        return nn2.tdgh_2();
    }

    private static float adhk(nn nn2) {
        block0: {
            int n = tsn.dshsh_2(644885232);
            nn nn3 = nn2;
            n = (nn3 != null ? System.identityHashCode(nn3) : 0) ^ n;
            int n2 = n ^ 0x92A1F304;
            if ((n2 ^ n) == -1834880252) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xB4D1D9F4 ^ n, 9) - -372833337) * -1261315595;
        }
        return nn2.dhtk();
    }

    private static String[] tdhkh_2(String string) {
        int n = tsn.dshsh_2(-245128304);
        int n2 = n ^ 0x2FB542D3;
        if ((n2 ^ n) != 800408275) {
            int cfr_ignored_0 = Integer.rotateRight(0xDED6E143 ^ n, 14) + 6481496;
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

    private static CallSite thb_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1096832623;
            n3 = Integer.rotateLeft(n3 * 1006326373, 23) ^ 0x5C842C1A;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 26);
            int n4 = n3 ^ 0xA4A9392;
            if ((n4 ^ n3) != 172659602) {
                int cfr_ignored_0 = (0xB4D53A03 ^ n3) + -1347655605;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ hkha ^ string.hashCode() ^ n2 + khbj ^ i * -1162381179 ^ hkha, 27) ^ khbj));
            }
            String[] stringArray = bbz.tdhkh_2(new String(cArray));
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

    private static String[] b3l17m50oqhh(String string) {
        return string.split("\b\u001d", -1);
    }

    private static CallSite wclya67z3qq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ l29sgpu ^ string.hashCode()) + (n2 + mq8cdhjetcu) + i ^ l29sgpu, 9) + mq8cdhjetcu);
            }
            String[] stringArray = bbz.b3l17m50oqhh(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

