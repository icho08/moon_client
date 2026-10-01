/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ai.catboost.CatBoostError
 *  ai.catboost.CatBoostModel
 *  ai.catboost.CatBoostPredictions
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_746
 */
package us.m0vy.moondlc.m0vyguard;

import ai.catboost.CatBoostError;
import ai.catboost.CatBoostModel;
import ai.catboost.CatBoostPredictions;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_746;
import us.m0vy.moondlc.m0vyguard.bthy;
import us.m0vy.moondlc.m0vyguard.bsy_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.lb;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class zf
implements tthy {
    private long swm;
    private CatBoostModel shghl;
    private CatBoostModel khkhkh;
    private float zbk;
    private float zwa;
    private float bsa_4;
    private float jshw;
    private float zkhs;
    private lb da_2 = lb.thah_3;
    private final bql<bthy> sbt_4 = this::brz_2;
    private static final int shkz_2 = -2117593267;
    private static final int bwn = -1553032620;
    private static final int thdh_6 = 1665336858;
    private static final int dhshj = 757680819;
    private static final int gnx88c2 = 16146280;
    private static final int e40wwihbbq9g6 = -1191295774;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int sprpsh9g;

    public zf() {
        try {
            this.shghl = CatBoostModel.loadModel((String)zf.rkhz_2("鳈㌹槠䰔纊᯲瓬䝪诔〇\uddf3폗࣪ꖕ", 0xE78FB8A6 ^ 0x39700019, Integer.reverse(-1962202614) ^ 0x4E1FA817, Integer.rotateLeft(0x3B10445F ^ 0x7A6C22BC, 24)).concat(zf.rkhz_2("ᝲ耟䰍暭㐉驗㺠泾⩚芍휄ꬼ༗옪", -846436531 - -1198287004, Integer.reverse(673757836) ^ 0x4427563B, 1287320547 - 1769568125)));
            this.khkhkh = CatBoostModel.loadModel((String)zf.rkhz_2("枟鬷ᡃ역꾋ﴽ\ud943⚤酐㮽市㕖", 0x5C06D9AE ^ 0xD8916B59, Integer.reverse(2017708015) ^ 0x7EC4CF2A, 1542158432 - 2024406010).concat(zf.rkhz_2("릟Ῑ浊䦅錔㝋扯䬤蜠▎뽳ඖ낢힊:", -1313347896 + -194883613, Integer.rotateLeft(0xB0201F55 ^ 0xEE24C1EC, 22), 0x9087C4DC ^ 0x73C6B8BA)));
        }
        catch (CatBoostError catBoostError) {
            catBoostError.printStackTrace();
        }
        Moondlc.getInstance().getEventManager().sdz_4(this);
    }

    public lb zmh(lb lb2, class_1309 class_13092) {
        int n = 1047879133;
        n = Integer.rotateLeft(n * 2112062059, 3) ^ 0x96619B4D;
        class_1309 class_13093 = class_13092;
        n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
        int n2 = n ^ 0xF6A5E3D9;
        if ((n2 ^ n) != -156900391) {
            int cfr_ignored_0 = (0xC8D0BE04 ^ n) - -1921965398;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        long l = zf.dhq_5();
        double d = zf.mc.field_1724.method_23318() - class_13092.method_23318();
        float f = this.sthth(lb2, (class_1297)class_13092);
        float f2 = this.thft_2(lb2, (class_1297)class_13092);
        float f3 = zf.mc.field_1724.method_5739((class_1297)class_13092);
        float f4 = Math.min(0x55AFD3009B91CA47L ^ 0x55AFD3009B91CBB3L, l - this.swm);
        float[][] fArrayArray = new float[1][];
        float[] fArray = new float[-178430331 - -178430342];
        fArray[0] = f;
        fArray[1] = f2;
        fArray[2] = f3;
        fArray[3] = f4;
        fArray[4] = zf.mc.field_1724.field_6017;
        fArray[5] = (float)d;
        fArray[1903444797 + -1903444791] = this.bsa_4;
        fArray[0xE9C5D0DA ^ 0xE9C5D0DD] = this.jshw;
        fArray[0xAE5E0750 ^ 0xAE5E0758] = this.zbk;
        fArray[-887059538 + 887059547] = this.zwa;
        fArray[362148119 + -362148109] = this.zkhs;
        fArrayArray[0] = fArray;
        float[][] fArrayArray2 = fArrayArray;
        String[][] stringArray = new String[fArrayArray2.length][0];
        try {
            CatBoostPredictions catBoostPredictions = this.shghl.predict((float[][])fArrayArray2, stringArray);
            CatBoostPredictions catBoostPredictions2 = this.khkhkh.predict((float[][])fArrayArray2, stringArray);
            double d2 = zf.tlr_2(catBoostPredictions, 0, 0);
            double d3 = catBoostPredictions2.get(0, 0);
            this.bsa_4 = f;
            this.jshw = f2;
            this.zbk = this.dtz_5(this.da_2.sry() - zf.sra_3(lb2));
            this.zwa = this.dtz_5(this.da_2.khdhd_2() - lb2.khdhd_2());
            this.zkhs = f3;
            this.da_2 = new lb(lb2.sry(), zf.shs_6(lb2));
            return new lb((float)((double)lb2.sry() + d2), (float)((double)lb2.khdhd_2() - d3));
        }
        catch (CatBoostError catBoostError) {
            zf.htht(catBoostError);
            return lb2;
        }
    }

    private float dtz_5(float f) {
        float f2 = 0.0f;
        int n = 0;
        int n2 = 1935315642;
        n2 = Integer.rotateLeft(n2 * 337185817, 10) ^ 0xE11A87F9;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 21);
        n2 = Integer.rotateLeft(Float.floatToIntBits(f) ^ n2, 7);
        int n3 = (int)((long)Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE) ^ 0x8FB9D0CB2FCADF55L ^ 0x8FB9D0CB2FCADF55L);
        while (true) {
            block35: {
                block36: {
                    block38: {
                        block40: {
                            block50: {
                                block37: {
                                    block53: {
                                        block48: {
                                            block43: {
                                                block33: {
                                                    block44: {
                                                        block47: {
                                                            block42: {
                                                                block56: {
                                                                    block49: {
                                                                        block54: {
                                                                            block58: {
                                                                                block57: {
                                                                                    block41: {
                                                                                        block55: {
                                                                                            block34: {
                                                                                                block51: {
                                                                                                    block52: {
                                                                                                        block45: {
                                                                                                            block46: {
                                                                                                                block30: {
                                                                                                                    block39: {
                                                                                                                        block31: {
                                                                                                                            block32: {
                                                                                                                                if ((n = Integer.reverse(n3) ^ n2 ^ 0x57CB4FDE) > -103186129) break block30;
                                                                                                                                if (n > -1152182771) break block31;
                                                                                                                                if (n > -1600672429) break block32;
                                                                                                                                if (n == -1882483242) break block33;
                                                                                                                                if (n == -1600672429) break block34;
                                                                                                                                int cfr_ignored_0 = Integer.rotateLeft(0x9A581C64 ^ n2, 6) - -1257697449;
                                                                                                                                break block35;
                                                                                                                            }
                                                                                                                            if (n == -1565502765) break block36;
                                                                                                                            if (n == -1159081317) break block37;
                                                                                                                            if (n == -1152182771) break block38;
                                                                                                                            break block35;
                                                                                                                        }
                                                                                                                        if (n > -739401274) break block39;
                                                                                                                        if (n == -777806047) break block40;
                                                                                                                        if (n == -739401274) break block41;
                                                                                                                        int cfr_ignored_1 = (Integer.rotateRight(0x7EDCFDF2 ^ n2, 18) + 1629511561) * 2128412147;
                                                                                                                        break block35;
                                                                                                                    }
                                                                                                                    if (n == -172737509) break block42;
                                                                                                                    if (n == -146175486) break block43;
                                                                                                                    if (n == -103186129) break block44;
                                                                                                                    break block35;
                                                                                                                }
                                                                                                                if (n > 1096718393) break block45;
                                                                                                                if (n > 309509603) break block46;
                                                                                                                if (n == -97326128) break block47;
                                                                                                                if (n == 309509603) break block48;
                                                                                                                break block35;
                                                                                                            }
                                                                                                            if (n == 722279079) break block49;
                                                                                                            if (n == 901371837) break block50;
                                                                                                            int cfr_ignored_2 = Integer.rotateRight(0xE92FB0AE ^ n2, 16) - 1092879437;
                                                                                                            if (n == 1096718393) break block51;
                                                                                                            break block35;
                                                                                                        }
                                                                                                        if (n > 1495673510) break block52;
                                                                                                        if (n == 1197176306) break block53;
                                                                                                        if (n == 1301001349) break block54;
                                                                                                        int cfr_ignored_3 = Integer.rotateLeft(0x82861509 ^ n2, 3) + -761648302;
                                                                                                        int cfr_ignored_4 = (int)(0x4034BB3427D4EB4FL ^ (long)n2 ^ 0x8B18831A2DB92DB8L);
                                                                                                        if (n == 1495673510) break block55;
                                                                                                        break block35;
                                                                                                    }
                                                                                                    if (n == 1568059778) break block56;
                                                                                                    if (n == 1584339893) break block57;
                                                                                                    int cfr_ignored_5 = (Integer.rotateLeft(0xF7730B7D ^ n2, 17) - -78904482) * -143455363;
                                                                                                    int cfr_ignored_6 = (int)(0x35C1A54027D4EB4FL ^ (long)n2 ^ 0xB7F0831A2DB9C652L);
                                                                                                    if (n == 2091930469) break block58;
                                                                                                    break block35;
                                                                                                }
                                                                                                int cfr_ignored_7 = (Integer.rotateLeft(0x4DAF96B5 ^ n2, 12) - 1822482214) * 1303353013;
                                                                                                int cfr_ignored_8 = (int)(0x8F1D388827D4EB4FL ^ (long)n2 ^ 0x8C60831A2DB8B3EBL);
                                                                                                f2 = f;
                                                                                                n3 = Integer.reverse(n2 ^ 0xA2B052D3 ^ 0x57CB4FDE);
                                                                                                int cfr_ignored_9 = Integer.rotateRight(0xD71680F ^ n2, 4) - -1525073652;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_10 = (Integer.rotateLeft(0xA8133D55 ^ n2, 8) - 1588726918) * -1475134123;
                                                                                            int cfr_ignored_11 = (int)(0x6AA1936827D4EB4FL ^ (long)n2 ^ 0xDBA0831A2DB97892L);
                                                                                            zf.sjth();
                                                                                            throw null;
                                                                                        }
                                                                                        int cfr_ignored_12 = (Integer.rotateRight(0x3F519C1E ^ n2, 10) - -1354791203) * 1062312991;
                                                                                        zf.sjth();
                                                                                        throw null;
                                                                                    }
                                                                                    int cfr_ignored_13 = Integer.rotateLeft(0x16D56308 ^ n2, 5) + -936075981;
                                                                                    if (f < Float.intBitsToFloat(Integer.rotateLeft(0xBC404263 ^ 0x26404202, 25))) {
                                                                                        n3 = (int)((long)Integer.reverse(n2 ^ 0x4D8BB485 ^ 0x57CB4FDE) ^ 0xAE991C61AAC2F6B0L ^ 0xAE991C61AAC2F6B0L);
                                                                                        continue;
                                                                                    }
                                                                                    try {
                                                                                        n3 = Integer.reverse(n2 ^ 0x415E9839 ^ 0x57CB4FDE) ^ 0x5E1EB0F5 ^ 0x5E1EB0F5;
                                                                                    }
                                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x415E9839 ^ 0x57CB4FDE)));
                                                                                    }
                                                                                    --n;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_14 = (Integer.rotateLeft(0xC87BCAFD ^ n2, 12) - 1264268254) * -931411203;
                                                                                int cfr_ignored_15 = (int)(0xAC964C027D4EB4FL ^ (long)n2 ^ 0x34F0831A2DB9B843L);
                                                                                if (!yf.khdha_2()) {
                                                                                    try {
                                                                                        n -= 3;
                                                                                        if ((0xFCE5850DCB7EECBDL ^ (long)n2 | 1L) == 0L) {
                                                                                            throw new UnsupportedOperationException();
                                                                                        }
                                                                                        n3 = Integer.reverse(n2 ^ 0x59262AA6 ^ 0x57CB4FDE);
                                                                                    }
                                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                        n3 = Integer.reverse(n2 ^ 0x59262AA6 ^ 0x57CB4FDE) + 1071514269 - 1071514269;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_16 = (int)(0x1A4277FEA9EB09A2L ^ (long)n2 ^ 0x128D9F65E8639955L);
                                                                                n3 = (int)((long)Integer.reverse(n2 ^ 0x2B0D1AA7 ^ 0x57CB4FDE) ^ 0xD1A47C3FE4C41E91L ^ 0xD1A47C3FE4C41E91L);
                                                                                n += 5;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_17 = Integer.rotateLeft(0x40956E09 ^ n2, 11) + -696913326;
                                                                            int cfr_ignored_18 = (int)(0x8227C03427D4EB4FL ^ (long)n2 ^ 0x7D18831A2DB8A99EL);
                                                                            f -= Float.intBitsToFloat(0xA00D92C4 ^ 0xE3B992C4);
                                                                            try {
                                                                                n -= 3;
                                                                                if ((0xAEBED2DACA04EB85L ^ (long)n2 | 1L) == 0L) {
                                                                                    throw new IllegalArgumentException();
                                                                                }
                                                                                n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0xD3EDA1C6 ^ 0x57CB4FDE)));
                                                                            }
                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                n3 = Integer.reverse(n2 ^ 0xD3EDA1C6 ^ 0x57CB4FDE);
                                                                            }
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_19 = Integer.rotateRight(0x2DD8A6EE ^ n2, 8) - -1852189171;
                                                                        f += Float.intBitsToFloat(1419356425 + -283486473);
                                                                        int cfr_ignored_20 = (int)(0x10260D71FB4B52AAL ^ (long)n2 ^ 0xE7933A255E738D9DL);
                                                                        n3 = Integer.reverse(n2 ^ 0x415E9839 ^ 0x57CB4FDE) + 1202275581 - 1202275581;
                                                                        n -= 5;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_21 = (Integer.rotateLeft(0xAA1557B1 ^ n2, 8) + -1661780566) * -1441441871;
                                                                    int cfr_ignored_22 = (int)(0x68A7F98C27D4EB4FL ^ (long)n2 ^ 0xE68831A2DB97C9EL);
                                                                    f %= Float.intBitsToFloat(Integer.reverse(886958642) ^ 0xFE3BB2C);
                                                                    if (f > Float.intBitsToFloat(1520617182 + -393135838)) {
                                                                        n3 = Integer.reverse(n2 ^ 0x7CB05365 ^ 0x57CB4FDE) + -848309275 - -848309275;
                                                                        ++n;
                                                                        continue;
                                                                    }
                                                                    n3 = Integer.reverse(n2 ^ 0x4873C659 ^ 0x57CB4FDE) + 1128879618 - 1128879618;
                                                                    int cfr_ignored_23 = (Integer.rotateLeft(0x25923298 ^ n2, 7) + -1861107805) * 630338201;
                                                                    n3 = Integer.reverse(n2 ^ 0xD3EDA1C6 ^ 0x57CB4FDE) + -568735333 - -568735333;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_24 = (Integer.rotateLeft(0x531B7518 ^ n2, 13) + 347131171) * 1394308377;
                                                                n3 = Integer.reverse(n2 ^ 0xD3BEF097 ^ 0x57CB4FDE) ^ 0x99C82509 ^ 0x99C82509;
                                                                int cfr_ignored_25 = Integer.rotateLeft(0x412D1368 ^ n2, 11) + -388826925;
                                                                try {
                                                                    n -= 2;
                                                                    if ((0xFA2DB6AD2167BED9L ^ (long)n2 | 1L) == 0L) {
                                                                        throw new ArithmeticException();
                                                                    }
                                                                    n3 = Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE) + 809800083 - 809800083;
                                                                }
                                                                catch (ArithmeticException arithmeticException) {
                                                                    n3 = (int)((long)Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE) ^ 0x40A15A60D6B9FBCAL ^ 0x40A15A60D6B9FBCAL);
                                                                }
                                                                continue;
                                                            }
                                                            int cfr_ignored_26 = Integer.rotateRight(0x6A0D8C4B ^ n2, 16) + -603874224;
                                                            int cfr_ignored_27 = (int)(0xAF99D3C94F3553EL ^ (long)n2 ^ 0xC709E555515BB822L);
                                                            n3 = Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE) + -1053161435 - -1053161435;
                                                            n -= 4;
                                                            continue;
                                                        }
                                                        int cfr_ignored_28 = (Integer.rotateRight(0xE3262FD3 ^ n2, 15) + -2046989880) * -484036653;
                                                        n3 = Integer.reverse(n2 ^ 0x956DFC33 ^ 0x57CB4FDE) ^ 0x1707FCB2 ^ 0x1707FCB2;
                                                        int cfr_ignored_29 = Integer.rotateLeft(0x703DAA8D ^ n2, 17) - -1680521650;
                                                        int cfr_ignored_30 = (int)(0xB28F04B027D4EB4FL ^ (long)n2 ^ 0xF410831A2DB8C8CFL);
                                                        n3 = Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE) ^ 0x42BAE63F ^ 0x42BAE63F;
                                                        n += 4;
                                                        continue;
                                                    }
                                                    int cfr_ignored_31 = (Integer.rotateLeft(0xD01A3ABD ^ n2, 13) - 931839006) * -803587395;
                                                    int cfr_ignored_32 = (int)(0x12A8948027D4EB4FL ^ (long)n2 ^ 0xD470831A2DB98880L);
                                                    try {
                                                        --n;
                                                        if ((0x14DF00A00FAAE7CBL ^ (long)n2 | 1L) == 0L) {
                                                            throw new UnsupportedOperationException();
                                                        }
                                                        n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE)));
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        n3 = (int)((long)Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE) ^ 0x3494091410FAAD65L ^ 0x3494091410FAAD65L);
                                                    }
                                                    continue;
                                                }
                                                int cfr_ignored_33 = Integer.rotateLeft(0xD7CCD4C1 ^ n2, 13) + 640377498;
                                                int cfr_ignored_34 = (int)(0x157E7AFC27D4EB4FL ^ (long)n2 ^ 0x888831A2DB9872DL);
                                                n3 = (int)((long)Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE) ^ 0x1296DF840D264134L ^ 0x1296DF840D264134L);
                                                int cfr_ignored_35 = Integer.rotateLeft(0x46EFAF45 ^ n2, 11) - -1687955306;
                                                int cfr_ignored_36 = (int)(0x845D017827D4EB4FL ^ (long)n2 ^ 0xFF80831A2DB8A56BL);
                                                n -= 2;
                                                continue;
                                            }
                                            int cfr_ignored_37 = Integer.rotateLeft(0x84AE428D ^ n2, 3) - 360164942;
                                            int cfr_ignored_38 = (int)(0x461CECB027D4EB4FL ^ (long)n2 ^ 0x2410831A2DB921E8L);
                                            int cfr_ignored_39 = (int)(0x7EA686CD7F11675DL ^ (long)n2 ^ 0xF0EA3291359D509CL);
                                            n3 = Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE);
                                            continue;
                                        }
                                        int cfr_ignored_40 = (Integer.rotateLeft(0xB30CD1D4 ^ n2, 9) - -1293219865) * -1291005483;
                                        n3 = Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE);
                                        int cfr_ignored_41 = Integer.rotateRight(0x8940B52E ^ n2, 4) - -1556901939;
                                        n += 4;
                                        continue;
                                    }
                                    int cfr_ignored_42 = Integer.rotateLeft(0xBB4806ED ^ n2, 10) - -1307150866;
                                    int cfr_ignored_43 = (int)(0x79FAA8D027D4EB4FL ^ (long)n2 ^ 0xACD0831A2DB95E24L);
                                    try {
                                        n -= 3;
                                        if ((0x831A9FFECB40D6B5L ^ (long)n2 | 1L) == 0L) {
                                            throw new UnsupportedOperationException();
                                        }
                                        n3 = (int)((long)Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE) ^ 0xD1CF3C937C4D11BFL ^ 0xD1CF3C937C4D11BFL);
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        n3 = Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE) + 1171967186 - 1171967186;
                                    }
                                    n -= 2;
                                    continue;
                                }
                                int cfr_ignored_44 = Integer.rotateLeft(0x78CCEC20 ^ n2, 18) + -1523697893;
                                n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE)));
                                int cfr_ignored_45 = Integer.rotateLeft(0xB38C37C9 ^ n2, 9) + -1034395502;
                                int cfr_ignored_46 = (int)(0x713E99F427D4EB4FL ^ (long)n2 ^ 0xCE98831A2DB94FACL);
                                --n;
                                continue;
                            }
                            int cfr_ignored_47 = Integer.rotateRight(0xA1B9174E ^ n2, 7) - -1714982483;
                            n3 = (int)((long)Integer.reverse(n2 ^ 0x673F239D ^ 0x57CB4FDE) ^ 0xDE82D7BBA000AEF2L ^ 0xDE82D7BBA000AEF2L);
                            int cfr_ignored_48 = Integer.rotateLeft(0x528DDF25 ^ n2, 13) - 59483318;
                            int cfr_ignored_49 = (int)(0x903F711827D4EB4FL ^ (long)n2 ^ 0x1F40831A2DB88DAFL);
                            try {
                                if ((0x691C4BB01F067CCBL ^ (long)n2 | 1L) == 0L) {
                                    throw new NoSuchElementException();
                                }
                                n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE)));
                            }
                            catch (NoSuchElementException noSuchElementException) {
                                n3 = Integer.reverse(Integer.reverse(Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE)));
                            }
                            n += 4;
                            continue;
                        }
                        int cfr_ignored_50 = (Integer.rotateRight(0x66870FA ^ n2, 3) + -888975999) * 107507963;
                        n3 = Integer.reverse(n2 ^ 0xC59EE2B5 ^ 0x57CB4FDE);
                        int cfr_ignored_51 = Integer.rotateLeft(0xCC0CB6C8 ^ n2, 12) + -1175993997;
                        try {
                            if ((0xBBAFAB5332E5B92BL ^ (long)n2 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            n3 = Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE) + -1238737367 - -1238737367;
                        }
                        catch (NoSuchElementException noSuchElementException) {
                            n3 = Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE);
                        }
                        continue;
                    }
                    int cfr_ignored_52 = (Integer.rotateLeft(0x940ACDD4 ^ n2, 5) - -240350233) * -1811231275;
                    n3 = Integer.reverse(n2 ^ 0xDBD61268 ^ 0x57CB4FDE) ^ 0x4F94D4AB ^ 0x4F94D4AB;
                    int cfr_ignored_53 = Integer.rotateRight(0x937B6A0F ^ n2, 5) - -531663092;
                    try {
                        if ((0xDAB67C16E25D2945L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE) ^ 0xEBB3011 ^ 0xEBB3011;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE) + -792496605 - -792496605;
                    }
                    n += 5;
                    continue;
                }
                return f2;
            }
            int cfr_ignored_54 = Integer.rotateLeft(0xF2375BCD ^ n2, 17) - 1494334734;
            int cfr_ignored_55 = (int)(0x3085F5F027D4EB4FL ^ (long)n2 ^ 0x1690831A2DB9CCDAL);
            n3 = Integer.reverse(n2 ^ 0x5E6F1BB5 ^ 0x57CB4FDE);
        }
    }

    private float sthth(lb lb2, class_1297 class_12972) {
        try {
            int n = 1768712335;
            n = Integer.rotateLeft(n * -1934501259, 10) ^ 0x36E3E63;
            lb lb3 = lb2;
            n = (lb3 != null ? System.identityHashCode(lb3) : 0) ^ n;
            int n2 = n ^ 0x9A8CD5D8;
            if ((n2 ^ n) != -1702046248) {
                int cfr_ignored_0 = (0xF3E0BD57 ^ n) + -1063922121;
            }
            if ((0x19D & 0) != 0) {
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
        double d = zf.ghshy(class_12972) - zf.shts_3(zf.mc.field_1724);
        double d2 = zf.swr(class_12972) - zf.mc.field_1724.method_23321();
        float f = (float)(Math.toDegrees(Math.atan2(d2, d)) - Double.longBitsToDouble(0x611C44F6DE8C3DFDL ^ 0x214AC4F6DE8C3DFDL));
        return this.dtz_5(f - zf.sjn_2(lb2));
    }

    private float thft_2(lb lb2, class_1297 class_12972) {
        try {
            int n = 2108826233;
            n = Integer.rotateLeft(n * -1438488885, 14) ^ 0x8AA25716;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x6CEEF143;
            if ((n2 ^ n) != 1827598659) {
                int cfr_ignored_0 = (0x115CD33A ^ n) + 651661119;
            }
            if ((0xC0 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        double d = zf.srq_2(class_12972) - zf.thmw(zf.mc.field_1724);
        double d2 = class_12972.method_23321() - zf.mc.field_1724.method_23321();
        double d3 = class_12972.method_23320() - zf.mc.field_1724.method_23320();
        double d4 = Math.sqrt(d * d + d2 * d2);
        float f = (float)(-zf.rzj(Math.atan2(d3, d4)));
        return this.dtz_5(f - lb2.khdhd_2());
    }

    private void brz_2(bthy bthy2) {
        try {
            int n = 1900802255;
            n = Integer.rotateLeft(n * -1639103615, 28) ^ 0x98A5793;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 18);
            bthy bthy3 = bthy2;
            n = (bthy3 != null ? System.identityHashCode(bthy3) : 0) ^ n;
            int n2 = n ^ 0x983E32F9;
            if ((n2 ^ n) != -1740754183) {
                int cfr_ignored_0 = (0xE975C236 ^ n) + 838434727;
            }
            if ((0x214 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        class_1297 class_12972 = bthy2.khtf();
        if (class_12972 != null) {
            this.swm = System.currentTimeMillis();
        }
    }

    private static String rkhz_2(String string, int n, int n2, int n3) {
        int n4 = 2057397124;
        n4 = Integer.rotateLeft(n4 * -1033314125, 13) ^ 0x8D07B215;
        String string2 = string;
        n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 19);
        int n5 = (n4 = n ^ n4) ^ 0x614CA5B1;
        if ((n5 ^ n4) != 1632413105) {
            int cfr_ignored_0 = (0x1BEDC635 ^ n4) + -1237508205;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x7DE26C22) + n2 ^ i * 425322065) ^ shkz_2) + bwn);
        }
        return new String(cArray);
    }

    private static long dhq_5() {
        block0: {
            int n = bsy_2.hkhf(-146658828);
            int n2 = n ^ 0x61C94D84;
            if ((n2 ^ n) == 1640582532) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x968B6470 ^ n, 5) + 1061079243) * -1769249679;
        }
        return System.currentTimeMillis();
    }

    private static double tlr_2(CatBoostPredictions catBoostPredictions, int n, int n2) {
        block0: {
            int n3 = 1809699981;
            int n4 = (n3 = Integer.rotateLeft(n3 * 1359802509, 12) ^ 0x94878ABF) ^ 0x77E4D1F9;
            if ((n4 ^ n3) == 2011484665) break block0;
            int cfr_ignored_0 = (0x1C390574 ^ n3) - -1398404100;
        }
        return catBoostPredictions.get(n, n2);
    }

    private static float sra_3(lb lb2) {
        block0: {
            int n = -1756316316;
            n = Integer.rotateLeft(n * -276790637, 24) ^ 0xE3A14315;
            lb lb3 = lb2;
            n = Integer.rotateRight((lb3 != null ? System.identityHashCode(lb3) : 0) ^ n, 19);
            int n2 = n ^ 0xD9383CF4;
            if ((n2 ^ n) == -650625804) break block0;
            int cfr_ignored_0 = (0x4E688190 ^ n) + -1825728921;
        }
        return lb2.sry();
    }

    private static float shs_6(lb lb2) {
        block0: {
            int n = -879174147;
            n = Integer.rotateLeft(n * 669632915, 26) ^ 0x1BF4B621;
            lb lb3 = lb2;
            n = Integer.rotateLeft((lb3 != null ? System.identityHashCode(lb3) : 0) ^ n, 26);
            int n2 = n ^ 0x30C7561;
            if ((n2 ^ n) == 51148129) break block0;
            int cfr_ignored_0 = (0xC894A89C ^ n) - 962605729;
        }
        return lb2.khdhd_2();
    }

    private static void htht(CatBoostError catBoostError) {
        int n = 20004082;
        int n2 = (n = Integer.rotateLeft(n * 182528063, 17) ^ 0xA3AD7B7A) ^ 0x6D5422DE;
        if ((n2 ^ n) != 1834230494) {
            int cfr_ignored_0 = (0x6C651E2C ^ n) + -168182439;
        }
        catBoostError.printStackTrace();
    }

    private static void sjth() {
        int n = bsy_2.hkhf(-425525080);
        int n2 = n ^ 0x2D5F1F55;
        if ((n2 ^ n) != 761208661) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xCBFC1FFD ^ n, 12) - -1209696546) * -872669187;
            int cfr_ignored_1 = (int)(0x94EB1C027D4EB4FL ^ (long)n ^ 0x9EF0831A2DB9BF4CL);
        }
        yf.athz_2();
    }

    private static double ghshy(class_1297 class_12972) {
        block0: {
            int n = 896919291;
            n = Integer.rotateLeft(n * 224126857, 8) ^ 0x54ED80D;
            class_1297 class_12973 = class_12972;
            n = Integer.rotateLeft((class_12973 != null ? System.identityHashCode(class_12973) : 0) ^ n, 3);
            int n2 = n ^ 0xE983B796;
            if ((n2 ^ n) == -377243754) break block0;
            int cfr_ignored_0 = (0xDCF6516D ^ n) + -1390381610;
        }
        return class_12972.method_23317();
    }

    private static double shts_3(class_746 class_7462) {
        block0: {
            int n = 1403268466;
            n = Integer.rotateLeft(n * 740168245, 11) ^ 0x4A77592B;
            class_746 class_7463 = class_7462;
            n = (class_7463 != null ? System.identityHashCode(class_7463) : 0) ^ n;
            int n2 = n ^ 0x3F6A420D;
            if ((n2 ^ n) == 1063928333) break block0;
            int cfr_ignored_0 = (0x6CCE6F7F ^ n) - 531641042;
        }
        return class_7462.method_23317();
    }

    private static double swr(class_1297 class_12972) {
        block0: {
            int n = -1964183643;
            int n2 = (n = Integer.rotateLeft(n * -1399352607, 5) ^ 0x55A90F8F) ^ 0x124D9FBC;
            if ((n2 ^ n) == 307077052) break block0;
            int cfr_ignored_0 = (0x98A17019 ^ n) - 458141790;
        }
        return class_12972.method_23321();
    }

    private static float sjn_2(lb lb2) {
        block0: {
            int n = 1187668308;
            int n2 = (n = Integer.rotateLeft(n * 1711321079, 25) ^ 0x8DFE4034) ^ 0x3805CF0A;
            if ((n2 ^ n) == 939904778) break block0;
            int cfr_ignored_0 = (0x7ECFAE5E ^ n) - -501466328;
        }
        return lb2.sry();
    }

    private static double srq_2(class_1297 class_12972) {
        block0: {
            int n = bsy_2.hkhf(-685270142);
            int n2 = n ^ 0x3F001407;
            if ((n2 ^ n) == 1056969735) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xE8278F85 ^ n, 16) - 556269654;
            int cfr_ignored_1 = (int)(0x2A9521B827D4EB4FL ^ (long)n ^ 0xBE00831A2DB9F8FBL);
        }
        return class_12972.method_23317();
    }

    private static double thmw(class_746 class_7462) {
        block0: {
            int n = bsy_2.hkhf(2091883534);
            int n2 = n ^ 0x92999105;
            if ((n2 ^ n) == -1835429627) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xEE360D0B ^ n, 16) + -588696688;
        }
        return class_7462.method_23317();
    }

    private static double rzj(double d) {
        block0: {
            int n = -1585800246;
            n = Integer.rotateLeft(n * 1612087373, 27) ^ 0xECC8FCA8;
            n = Integer.rotateLeft((int)Double.doubleToLongBits(d) ^ n, 9);
            int n2 = n ^ 0x847FF8F7;
            if ((n2 ^ n) == -2071987977) break block0;
            int cfr_ignored_0 = (0x2505633D ^ n) + -1311079938;
        }
        return Math.toDegrees(d);
    }

    private static String[] tkt_4(String string) {
        int n = 1194974990;
        n = Integer.rotateLeft(n * 205838515, 15) ^ 0xE71D6193;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x8E335274;
        if ((n2 ^ n) != -1909239180) {
            int cfr_ignored_0 = (0xC90A8D7A ^ n) - 638787445;
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

    private static CallSite stj_4(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -359918492;
            n3 = Integer.rotateLeft(n3 * 1478033943, 22) ^ 0x1F3539B6;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            n3 = n ^ n3;
            int n4 = n3 ^ 0x2CB0AF00;
            if ((n4 ^ n3) != 749776640) {
                int cfr_ignored_0 = (0xC63CBB64 ^ n3) + 1418158003;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ thdh_6 ^ string.hashCode()) + (n2 + dhshj) + i ^ thdh_6, 22) + dhshj);
            }
            String[] stringArray = zf.tkt_4(new String(cArray));
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

    private static String[] xbl4ns2stl0phl(String string) {
        return string.split("\u0001\u0017", -1);
    }

    private static CallSite l21yg5agp(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ gnx88c2 ^ string.hashCode() ^ n2 + e40wwihbbq9g6 + i * -1846391029) + gnx88c2) ^ e40wwihbbq9g6));
            }
            String[] stringArray = zf.xbl4ns2stl0phl(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

