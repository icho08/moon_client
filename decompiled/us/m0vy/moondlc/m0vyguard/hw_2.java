/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.StringRange
 *  com.mojang.brigadier.suggestion.Suggestion
 *  com.mojang.brigadier.suggestion.Suggestions
 *  lombok.Generated
 *  net.minecraft.class_2561
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import lombok.Generated;
import net.minecraft.class_2561;
import us.m0vy.moondlc.m0vyguard.bbm;
import us.m0vy.moondlc.m0vyguard.bth_3;
import us.m0vy.moondlc.m0vyguard.btha;
import us.m0vy.moondlc.m0vyguard.bths_2;
import us.m0vy.moondlc.m0vyguard.bthn;
import us.m0vy.moondlc.m0vyguard.bhz_2;
import us.m0vy.moondlc.m0vyguard.btw_2;
import us.m0vy.moondlc.m0vyguard.bzh_4;
import us.m0vy.moondlc.m0vyguard.tba_2;
import us.m0vy.moondlc.m0vyguard.thn;
import us.m0vy.moondlc.m0vyguard.tdth;
import us.m0vy.moondlc.m0vyguard.tzz_2;
import us.m0vy.moondlc.m0vyguard.ht_2;
import us.m0vy.moondlc.m0vyguard.dhm_3;
import us.m0vy.moondlc.m0vyguard.dhh_6;
import us.m0vy.moondlc.m0vyguard.shb_3;
import us.m0vy.moondlc.m0vyguard.sh_5;
import us.m0vy.moondlc.m0vyguard.dh_5;
import us.m0vy.moondlc.m0vyguard.t_3;
import us.m0vy.moondlc.m0vyguard.ah_2;
import us.m0vy.moondlc.m0vyguard.qj;
import us.m0vy.moondlc.m0vyguard.ws;
import us.m0vy.moondlc.m0vyguard.yf;

public class hw_2 {
    private final List shw = new ArrayList();
    private String hrb = ".";
    private static final int hhkh = -583800718;
    private static final int dhzr = 1796278392;
    private static final int sjz_4 = -1462138913;
    private static final int ras = 1908519908;
    private static final int x92p9qa1s = 446628155;
    private static final int yi4bqd6be24ns = 1040625902;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int uug9y1jgw;

    public void thyy(bthn bthn2) {
        int n = 539110309;
        n = Integer.rotateLeft(n * 1677666645, 21) ^ 0xD1AD446C;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xDFD27689;
        if ((n2 ^ n) != -539855223) {
            int cfr_ignored_0 = (0xFFF05D2C ^ n) + 1344095070;
        }
        this.shw.add(bthn2);
    }

    public void hrn() {
        int n = -1399006750;
        n = Integer.rotateLeft(n * 134912495, 24) ^ 0xA09B1CD8;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xFC91F61D;
        if ((n2 ^ n) != -57543139) {
            int cfr_ignored_0 = (0x500D2FFF ^ n) - 1522813811;
        }
        this.thyy(new thn().ttha_2());
        this.thyy(new tzz_2().dhl());
        this.thyy(new dhh_6().shhz_4());
        hw_2.hlh(this, new ws().dhshm());
        this.thyy(new ht_2().sld_2());
        hw_2.khmq(this, hw_2.thzz(new btw_2()));
        this.thyy(hw_2.btsh(new sh_5()));
        this.thyy(hw_2.zla_4(new tdth()));
        hw_2.djj_2(this, new btha().zdht_4());
        this.thyy(new bbm().khthth());
        hw_2.hqz_2(this, new dh_5().thth_7());
        this.thyy(hw_2.dhas_3(new tba_2()));
    }

    public List dyj() {
        block0: {
            int n = bhz_2.shlgh(-1315371288);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 26);
            int n2 = n ^ 0xB6E2B788;
            if ((n2 ^ n) == -1226655864) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x77BB160 ^ n, 3) + -329770533;
        }
        return Collections.unmodifiableList(this.shw);
    }

    public boolean ssq(String string) {
        int n = 716684032;
        n = Integer.rotateLeft(n * 1185407843, 7) ^ 0xA464C3B;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 15);
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 4);
        int n2 = n ^ 0x28B60774;
        if ((n2 ^ n) != 683018100) {
            int cfr_ignored_0 = (0x201BC74 ^ n) + 1101243663;
        }
        if (!string.startsWith(this.hrb)) {
            return false;
        }
        try {
            String[] stringArray = hw_2.drq(string, this.hrb.length()).split("\\s+");
            if (stringArray.length == 0 || hw_2.rnq(stringArray[0])) {
                return true;
            }
            List<String> list = Arrays.asList(stringArray);
            qj qj2 = this.jbf(list, null, 0);
            if (qj2 == null) {
                bzh_4.dhght_2(hw_2.jna_3("Unknown command."));
                return true;
            }
            bthn bthn2 = (bthn)qj2.command();
            int n3 = (Integer)qj2.index();
            if (!bthn2.executable()) {
                hw_2.shjd_2(class_2561.method_30163((String)"Command is not".concat(" executable.")));
                return true;
            }
            List list2 = this.sdhs_3(bthn2, stringArray, n3);
            if (list2 == null) {
                StringBuilder stringBuilder = new StringBuilder(hw_2.dtkh_3("䁽ၧ롭怒蠀〠\ud897Âꣳ僢₵좩煖餌䅾ᄃ뤢愯觘㇁\ud9eeƆ꧉凲輦≋쩋牢騕䉙", 0xB4E3DF20 ^ 0x18435461, Integer.reverse(1963835031) ^ 0x3423B4E9, hw_2.rwdh(0x86973754 ^ 0xBE2B86E0, 4)));
                hw_2.khzr_2(stringBuilder, this.hrb).append((String)bthn2.names().getFirst());
                for (shb_3 shb2 : bthn2.parameters()) {
                    stringBuilder.append(" ");
                    if (shb2.required()) {
                        hw_2.jshd_2(stringBuilder, "<").append(shb2.name()).append(">");
                        continue;
                    }
                    stringBuilder.append("[").append(shb2.name()).append("]");
                }
                bzh_4.dhght_2(class_2561.method_30163((String)stringBuilder.toString()));
                return true;
            }
            bthn2.handler().execute(new bths_2(bthn2, list2));
        }
        catch (Exception exception) {
            bzh_4.dhght_2(class_2561.method_30163((String)("Error executing command: " + exception.getMessage())));
            hw_2.dthn_2(exception);
        }
        return true;
    }

    private qj jbf(List list, bthn bthn2, int n) {
        List list2;
        int n2 = -2006037342;
        n2 = Integer.rotateLeft(n2 * 1156635477, 4) ^ 0xD452BDB1;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 7);
        bthn bthn3 = bthn2;
        n2 = (bthn3 != null ? System.identityHashCode(bthn3) : 0) ^ n2;
        int n3 = n2 ^ 0x9FC04AE3;
        if ((n3 ^ n2) != -1614787869) {
            int cfr_ignored_0 = (0x17AE0641 ^ n2) + -1169954471;
        }
        List list3 = list2 = bthn2 == null ? this.shw : bthn2.subcommands();
        if (n >= list.size()) {
            return hw_2.dhda_4(this, bthn2, n - 1);
        }
        String string = (String)list.get(n);
        for (bthn bthn4 : list2) {
            for (String string2 : bthn4.names()) {
                if (!string2.equalsIgnoreCase(string)) continue;
                qj qj2 = hw_2.tghgh(this, list, bthn4, n + 1);
                if (qj2 != null) {
                    return qj2;
                }
                return new qj(bthn4, n);
            }
        }
        return this.szz_4(bthn2, n - 1);
    }

    private qj szz_4(bthn bthn2, int n) {
        int n2 = bhz_2.shlgh(417236366);
        int n3 = n2 ^ 0xB8F137CF;
        if ((n3 ^ n2) != -1192151089) {
            int cfr_ignored_0 = Integer.rotateLeft(0xA02FB241 ^ n2, 7) + 1780757786;
            int cfr_ignored_1 = (int)(0x629D1C7C27D4EB4FL ^ (long)n2 ^ 0xC588831A2DB968EBL);
        }
        return bthn2 != null ? new qj(bthn2, n) : null;
    }

    private List sdhs_3(bthn bthn2, String[] stringArray, int n) {
        int n2 = 1559863299;
        n2 = Integer.rotateLeft(n2 * -1286311823, 18) ^ 0x9FA44615;
        n2 = System.identityHashCode(this) ^ n2;
        bthn bthn3 = bthn2;
        n2 = Integer.rotateRight((bthn3 != null ? System.identityHashCode(bthn3) : 0) ^ n2, 11);
        int n3 = n2 ^ 0xEFD148AF;
        if ((n3 ^ n2) != -271497041) {
            int cfr_ignored_0 = (0xB328E8AC ^ n2) + -1439396921;
        }
        if (!yf.khdha_2()) {
            hw_2.tkt_3();
        }
        List list = bthn2.parameters();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n4 = n + 1;
        int n5 = stringArray.length;
        for (shb_3 shb2 : list) {
            Object object;
            if (shb2.vararg()) {
                object = new ArrayList();
                for (int i = n4; i < n5; ++i) {
                    ah_2 ah2 = shb2.validator().validate(stringArray[i]);
                    if (ah2 instanceof dhm_3) {
                        return null;
                    }
                    object.add(((bth_3)ah2).value());
                }
                arrayList.add(object);
                return arrayList;
            }
            if (n4 >= n5) {
                if (shb2.required()) {
                    return null;
                }
                arrayList.add(null);
                continue;
            }
            object = hw_2.tdr_2(shb2).validate(stringArray[n4]);
            if (object instanceof dhm_3) {
                return null;
            }
            arrayList.add(((bth_3)object).value());
            ++n4;
        }
        return arrayList;
    }

    public CompletableFuture ghzl(String string, int n) {
        try {
            int n2 = 440038459;
            n2 = Integer.rotateLeft(n2 * 1510565833, 8) ^ 0x889DB27C;
            n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 27);
            String string2 = string;
            n2 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n2, 12);
            int n3 = n2 ^ 0x5930D87;
            if ((n3 ^ n2) != 93523335) {
                int cfr_ignored_0 = (0x1FA979BC ^ n2) - 589523343;
            }
            if ((0x2B6 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (string.startsWith(this.hrb) && n >= hw_2.thkhd(this.hrb)) {
            Object object;
            int n4;
            String string3 = string.substring(0, Math.min(n, string.length()));
            String string4 = string3.substring(this.hrb.length());
            boolean bl = string4.endsWith(" ");
            String string5 = string4.trim();
            String[] stringArray = string5.isEmpty() ? new String[]{} : hw_2.thbn(string5, "\\s+");
            List list = this.shw;
            Object object2 = null;
            int n5 = 0;
            for (n4 = 0; n4 < stringArray.length && (object = this.byn(list, stringArray[n4])) != null; ++n4) {
                object2 = object;
                n5 = n4 + 1;
                list = object.subcommands();
                if (list.isEmpty()) break;
            }
            n4 = stringArray.length - n5;
            object = !bl && stringArray.length > 0 ? stringArray[stringArray.length - 1] : "";
            int n6 = hw_2.dhdhr(this.hrb.length(), string.lastIndexOf(Integer.rotateLeft(0xD45D0B90 ^ 0xC45D0B90, 9), Math.max(0, n - 1)) + 1);
            StringRange stringRange = StringRange.between((int)n6, (int)n);
            ArrayList<Suggestion> arrayList = new ArrayList<Suggestion>();
            if (object2 == null) {
                String string6 = ((String)object).toLowerCase();
                for (bthn bthn2 : list) {
                    String string7 = (String)bthn2.names().getFirst();
                    if (!string7.toLowerCase().startsWith(string6)) continue;
                    arrayList.add(new Suggestion(stringRange, string7));
                }
            } else if (!list.isEmpty() && n4 == 0) {
                String string8 = ((String)object).toLowerCase();
                for (bthn bthn3 : list) {
                    String string9 = (String)bthn3.names().getFirst();
                    if (!hw_2.ttk_3(string9.toLowerCase(), string8)) continue;
                    arrayList.add(new Suggestion(stringRange, string9));
                }
            } else {
                List list2 = object2.parameters();
                int n7 = n4 - (bl ? 0 : 1);
                if (n7 < 0) {
                    n7 = 0;
                }
                shb_3 shb2 = null;
                if (n7 >= list2.size()) {
                    if (!list2.isEmpty() && ((shb_3)list2.getLast()).vararg()) {
                        shb2 = (shb_3)list2.getLast();
                    }
                } else {
                    shb2 = (shb_3)list2.get(n7);
                }
                if (shb2 != null) {
                    String string10 = ((String)object).toLowerCase();
                    for (String string11 : shb2.validator().suggestions(string10)) {
                        arrayList.add(new Suggestion(stringRange, string11));
                    }
                }
            }
            return !arrayList.isEmpty() ? CompletableFuture.completedFuture(new Suggestions(stringRange, arrayList)) : Suggestions.empty();
        }
        return Suggestions.empty();
    }

    private bthn byn(List list, String string) {
        int n = 1307289097;
        n = Integer.rotateLeft(n * -1265443199, 11) ^ 0x312F417;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 12);
        List list2 = list;
        n = (list2 != null ? System.identityHashCode(list2) : 0) ^ n;
        int n2 = n ^ 0xEB2C8349;
        if ((n2 ^ n) != -349404343) {
            int cfr_ignored_0 = (0xA6C72540 ^ n) + -48280649;
        }
        for (bthn bthn2 : list) {
            for (String string2 : bthn2.names()) {
                if (!string2.equalsIgnoreCase(string)) continue;
                return bthn2;
            }
        }
        return null;
    }

    @Generated
    public String sam() {
        block0: {
            int n = -1355130171;
            int n2 = (n = Integer.rotateLeft(n * -635173665, 13) ^ 0xBC93D7C3) ^ 0x98FB46F7;
            if ((n2 ^ n) == -1728362761) break block0;
            int cfr_ignored_0 = (0x37C11C32 ^ n) - -1982418937;
        }
        return this.hrb;
    }

    @Generated
    public void zsd_4(String string) {
        int n = -1913518438;
        int n2 = (n = Integer.rotateLeft(n * 1612137425, 15) ^ 0x7BD0CCDD) ^ 0xD0704094;
        if ((n2 ^ n) != -797949804) {
            int cfr_ignored_0 = (0x5D82460E ^ n) - -1996538176;
        }
        this.hrb = string;
    }

    private static String rmt(String string, int n, int n2, int n3) {
        int n4 = bhz_2.shlgh(-1181449650);
        n4 = Integer.rotateLeft(n ^ n4, 2);
        int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 14)) ^ 0x199224D1;
        if ((n5 ^ n4) != 429008081) {
            int cfr_ignored_0 = (Integer.rotateRight(0xA006A69F ^ n4, 7) - 1697369212) * -1610176865;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ n3 ^ 0xB79FD579 ^ n2 ^ i * 1344630807 ^ hhkh, 15) ^ dhzr));
        }
        return new String(cArray);
    }

    private static void hlh(hw_2 hw2, bthn bthn2) {
        int n = -572446807;
        n = Integer.rotateLeft(n * -482416767, 9) ^ 0x7E399C3F;
        bthn bthn3 = bthn2;
        n = Integer.rotateRight((bthn3 != null ? System.identityHashCode(bthn3) : 0) ^ n, 2);
        int n2 = n ^ 0xC8FCE913;
        if ((n2 ^ n) != -922949357) {
            int cfr_ignored_0 = (0x151DCEBA ^ n) + -142124772;
        }
        hw2.thyy(bthn2);
    }

    private static bthn thzz(btw_2 btw2_2) {
        block0: {
            int n = -2035065746;
            int n2 = (n = Integer.rotateLeft(n * 1926867073, 14) ^ 0x8B376514) ^ 0xF7C07911;
            if ((n2 ^ n) == -138381039) break block0;
            int cfr_ignored_0 = (0x7173257F ^ n) - -1626218344;
        }
        return btw2_2.dts_3();
    }

    private static void khmq(hw_2 hw2, bthn bthn2) {
        int n = bhz_2.shlgh(1806018636);
        hw_2 hw3 = hw2;
        n = Integer.rotateLeft((hw3 != null ? System.identityHashCode(hw3) : 0) ^ n, 15);
        bthn bthn3 = bthn2;
        n = Integer.rotateRight((bthn3 != null ? System.identityHashCode(bthn3) : 0) ^ n, 22);
        int n2 = n ^ 0x8BB8C21E;
        if ((n2 ^ n) != -1950825954) {
            int cfr_ignored_0 = (Integer.rotateRight(0xE01D6A52 ^ n, 15) + 669876009) * -534943149;
        }
        hw2.thyy(bthn2);
    }

    private static bthn btsh(sh_5 sh2_2) {
        block0: {
            int n = 206355988;
            int n2 = (n = Integer.rotateLeft(n * -1694716045, 17) ^ 0xCF6DD87E) ^ 0xD376D10C;
            if ((n2 ^ n) == -747187956) break block0;
            int cfr_ignored_0 = (0xDF3A6F18 ^ n) + 47700301;
        }
        return sh2_2.hds_4();
    }

    private static bthn zla_4(tdth tdth2) {
        block0: {
            int n = 1412814033;
            n = Integer.rotateLeft(n * -1926907009, 7) ^ 0xDA36927F;
            tdth tdth3 = tdth2;
            n = Integer.rotateRight((tdth3 != null ? System.identityHashCode(tdth3) : 0) ^ n, 28);
            int n2 = n ^ 0x76C6B328;
            if ((n2 ^ n) == 1992733480) break block0;
            int cfr_ignored_0 = (0x22F367F9 ^ n) + 2031235616;
        }
        return tdth2.ddhs();
    }

    private static void djj_2(hw_2 hw2, bthn bthn2) {
        int n = -42906604;
        n = Integer.rotateLeft(n * 984374763, 11) ^ 0xB404EBBD;
        bthn bthn3 = bthn2;
        n = Integer.rotateLeft((bthn3 != null ? System.identityHashCode(bthn3) : 0) ^ n, 9);
        int n2 = n ^ 0x1DD09512;
        if ((n2 ^ n) != 500208914) {
            int cfr_ignored_0 = (0xE0A1D906 ^ n) - 887882605;
        }
        hw2.thyy(bthn2);
    }

    private static void hqz_2(hw_2 hw2, bthn bthn2) {
        int n = bhz_2.shlgh(-1999101196);
        bthn bthn3 = bthn2;
        n = Integer.rotateRight((bthn3 != null ? System.identityHashCode(bthn3) : 0) ^ n, 22);
        int n2 = n ^ 0x264942F3;
        if ((n2 ^ n) != 642335475) {
            int cfr_ignored_0 = Integer.rotateRight(0xAE916007 ^ n, 8) - 670580756;
        }
        hw2.thyy(bthn2);
    }

    private static bthn dhas_3(tba_2 tba2) {
        block0: {
            int n = -602828456;
            int n2 = (n = Integer.rotateLeft(n * -1668916087, 16) ^ 0xC2E3D670) ^ 0xCF30E84D;
            if ((n2 ^ n) == -818878387) break block0;
            int cfr_ignored_0 = (0x13217915 ^ n) - 882285408;
        }
        return tba2.jhl_2();
    }

    private static String drq(String string, int n) {
        block0: {
            int n2 = -1198809673;
            n2 = Integer.rotateLeft(n2 * 1590689267, 18) ^ 0x62038026;
            String string2 = string;
            n2 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n2;
            int n3 = n2 ^ 0x5381C159;
            if ((n3 ^ n2) == 1401012569) break block0;
            int cfr_ignored_0 = (0xEB0A5CEE ^ n2) - -2083119805;
        }
        return string.substring(n);
    }

    private static String hsn(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -349111156;
            n4 = Integer.rotateLeft(n4 * 1930682239, 25) ^ 0xD5EAF3DA;
            n4 = Integer.rotateLeft(n ^ n4, 22);
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 9)) ^ 0xB0A5F215;
            if ((n5 ^ n4) == -1331301867) break block0;
            int cfr_ignored_0 = (0x5B950E99 ^ n4) - 1154179107;
        }
        return hw_2.rmt(string, n, n2, n3);
    }

    private static boolean rnq(String string) {
        block0: {
            int n = bhz_2.shlgh(1943549542);
            String string2 = string;
            n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 7);
            int n2 = n ^ 0x52436D2E;
            if ((n2 ^ n) == 1380150574) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x219B5B48 ^ n, 7) + 372092147;
        }
        return string.isEmpty();
    }

    private static String ghjk(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bhz_2.shlgh(1983995110);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n2 ^ n4) ^ 0xA332E1D2;
            if ((n5 ^ n4) == -1556946478) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xD573BD34 ^ n4, 13) - -580810617) * -713835211;
        }
        return hw_2.rmt(string, n, n2, n3);
    }

    private static class_2561 jna_3(String string) {
        block0: {
            int n = 47036401;
            int n2 = (n = Integer.rotateLeft(n * 93268671, 13) ^ 0x5B77ECAF) ^ 0xED5013C8;
            if ((n2 ^ n) == -313519160) break block0;
            int cfr_ignored_0 = (0xEF9DA439 ^ n) + 1368216670;
        }
        return class_2561.method_30163((String)string);
    }

    private static String hww(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1047834147;
            n4 = Integer.rotateLeft(n4 * -2074929115, 11) ^ 0xC7508B85;
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 21)) ^ 0xDB9E04F6;
            if ((n5 ^ n4) == -610401034) break block0;
            int cfr_ignored_0 = (0x1A15552B ^ n4) + 1349235969;
        }
        return hw_2.rmt(string, n, n2, n3);
    }

    private static void shjd_2(class_2561 class_25612) {
        int n = 228974921;
        n = Integer.rotateLeft(n * 1458932423, 10) ^ 0x3D318E5C;
        class_2561 class_25613 = class_25612;
        n = Integer.rotateLeft((class_25613 != null ? System.identityHashCode(class_25613) : 0) ^ n, 10);
        int n2 = n ^ 0xDF07C63;
        if ((n2 ^ n) != 233864291) {
            int cfr_ignored_0 = (0x559D2A ^ n) - -1981076798;
        }
        bzh_4.dhght_2(class_25612);
    }

    private static int rwdh(int n, int n2) {
        block0: {
            int n3 = -1219355940;
            n3 = Integer.rotateLeft(n3 * 196760443, 28) ^ 0x50DBEE45;
            int n4 = (n3 = Integer.rotateRight(n ^ n3, 26)) ^ 0xA1583AC1;
            if ((n4 ^ n3) == -1588053311) break block0;
            int cfr_ignored_0 = (0x160A201D ^ n3) + 33836807;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String dtkh_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bhz_2.shlgh(-77424593);
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 22);
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 10)) ^ 0x5BE1D11D;
            if ((n5 ^ n4) == 1541525789) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xA0834932 ^ n4, 7) + 1950579785) * -1602008781;
        }
        return hw_2.rmt(string, n, n2, n3);
    }

    private static StringBuilder khzr_2(StringBuilder stringBuilder, String string) {
        block0: {
            int n = 873636742;
            n = Integer.rotateLeft(n * -471741941, 15) ^ 0x945A2C32;
            StringBuilder stringBuilder2 = stringBuilder;
            n = Integer.rotateRight((stringBuilder2 != null ? System.identityHashCode(stringBuilder2) : 0) ^ n, 2);
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xC515136C;
            if ((n2 ^ n) == -988474516) break block0;
            int cfr_ignored_0 = (0xF107B0EA ^ n) - -428021867;
        }
        return stringBuilder.append(string);
    }

    private static StringBuilder jshd_2(StringBuilder stringBuilder, String string) {
        block0: {
            int n = bhz_2.shlgh(-985074697);
            int n2 = n ^ 0x73AF99F3;
            if ((n2 ^ n) == 1940888051) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xB6E76A04 ^ n, 9) - 711161271;
        }
        return stringBuilder.append(string);
    }

    private static String szl_4(String string, int n, int n2, int n3) {
        block0: {
            int n4 = bhz_2.shlgh(1046599681);
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 12);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 7)) ^ 0xDADED0DE;
            if ((n5 ^ n4) == -622931746) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xE4BF08DF ^ n4, 15) - -1216368068) * -457242401;
        }
        return hw_2.rmt(string, n, n2, n3);
    }

    private static String brs(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1023393391;
            n4 = Integer.rotateLeft(n4 * -797851795, 14) ^ 0x68606097;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 19);
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 18)) ^ 0x4121D8FA;
            if ((n5 ^ n4) == 1092737274) break block0;
            int cfr_ignored_0 = (0x7DDE6695 ^ n4) + 344876211;
        }
        return hw_2.rmt(string, n, n2, n3);
    }

    private static void dthn_2(Exception exception) {
        int n = -365263730;
        int n2 = (n = Integer.rotateLeft(n * 511582975, 22) ^ 0x79C96846) ^ 0xBA991DED;
        if ((n2 ^ n) != -1164370451) {
            int cfr_ignored_0 = (0x50A39963 ^ n) + -1858006128;
        }
        exception.printStackTrace();
    }

    private static qj dhda_4(hw_2 hw2, bthn bthn2, int n) {
        block0: {
            int n2 = 537129388;
            n2 = Integer.rotateLeft(n2 * -214868327, 23) ^ 0x472E75DD;
            bthn bthn3 = bthn2;
            n2 = Integer.rotateRight((bthn3 != null ? System.identityHashCode(bthn3) : 0) ^ n2, 29);
            int n3 = (n2 = n ^ n2) ^ 0xDE3C5BA8;
            if ((n3 ^ n2) == -566469720) break block0;
            int cfr_ignored_0 = (0xFE3FAA04 ^ n2) - 1153682730;
        }
        return hw2.szz_4(bthn2, n);
    }

    private static qj tghgh(hw_2 hw2, List list, bthn bthn2, int n) {
        block0: {
            int n2 = -46827576;
            n2 = Integer.rotateLeft(n2 * -998650813, 5) ^ 0xD690CBF0;
            hw_2 hw3 = hw2;
            n2 = (hw3 != null ? System.identityHashCode(hw3) : 0) ^ n2;
            int n3 = (n2 = n ^ n2) ^ 0xCFC63144;
            if ((n3 ^ n2) == -809094844) break block0;
            int cfr_ignored_0 = (0x32F3468C ^ n2) - 1194013103;
        }
        return hw2.jbf(list, bthn2, n);
    }

    private static void tkt_3() {
        int n = -855645866;
        int n2 = (n = Integer.rotateLeft(n * 2067511849, 5) ^ 0xBDD7BB4) ^ 0x7185C337;
        if ((n2 ^ n) != 1904591671) {
            int cfr_ignored_0 = (0xBD7A2261 ^ n) - 408025987;
        }
        yf.athz_2();
    }

    private static t_3 tdr_2(shb_3 shb2) {
        block0: {
            int n = 1222265856;
            n = Integer.rotateLeft(n * -2127559563, 22) ^ 0xD36CD5B8;
            shb_3 shb3 = shb2;
            n = Integer.rotateRight((shb3 != null ? System.identityHashCode(shb3) : 0) ^ n, 6);
            int n2 = n ^ 0xD43D2FD5;
            if ((n2 ^ n) == -734187563) break block0;
            int cfr_ignored_0 = (0x9CE763D5 ^ n) - -2123536447;
        }
        return shb2.validator();
    }

    private static int thkhd(String string) {
        block0: {
            int n = 1447741396;
            int n2 = (n = Integer.rotateLeft(n * -1400081287, 5) ^ 0x1B7BCD5B) ^ 0xF96EA485;
            if ((n2 ^ n) == -110189435) break block0;
            int cfr_ignored_0 = (0xAF246351 ^ n) - -215080040;
        }
        return string.length();
    }

    private static String[] thbn(String string, String string2) {
        block0: {
            int n = bhz_2.shlgh(575220442);
            int n2 = n ^ 0xDF9B7B9B;
            if ((n2 ^ n) == -543458405) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xFDD25141 ^ n, 18) + -1059752422;
            int cfr_ignored_1 = (int)(0x3F60FF7C27D4EB4FL ^ (long)n ^ 0x388831A2DB9D310L);
        }
        return string.split(string2);
    }

    private static int dhdhr(int n, int n2) {
        block0: {
            int n3 = -2034112900;
            n3 = Integer.rotateLeft(n3 * -546364837, 9) ^ 0x7D7E1DF8;
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 5)) ^ 0xF217CB9F;
            if ((n4 ^ n3) == -233321569) break block0;
            int cfr_ignored_0 = (0x74D62DE3 ^ n3) + -1742414096;
        }
        return Math.max(n, n2);
    }

    private static boolean ttk_3(String string, String string2) {
        block0: {
            int n = -1650134549;
            n = Integer.rotateLeft(n * 1651818077, 4) ^ 0xDD49D61;
            String string3 = string2;
            n = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n, 16);
            int n2 = n ^ 0xC3B501E9;
            if ((n2 ^ n) == -1011547671) break block0;
            int cfr_ignored_0 = (0x5E11F002 ^ n) - -608752704;
        }
        return string.startsWith(string2);
    }

    private static String[] tnr(String string) {
        int n = 1665176962;
        n = Integer.rotateLeft(n * -547303475, 20) ^ 0xD524E1B3;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 22);
        int n2 = n ^ 0xA2BD2ED2;
        if ((n2 ^ n) != -1564660014) {
            int cfr_ignored_0 = (0xC1FDBB50 ^ n) - 946536431;
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

    private static CallSite bkhd_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 427929697;
            n3 = Integer.rotateLeft(n3 * -583791829, 13) ^ 0x9FCF0228;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 7);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 27);
            int n4 = n3 ^ 0xA6086C42;
            if ((n4 ^ n3) != -1509397438) {
                int cfr_ignored_0 = (0xBF89DC23 ^ n3) - -608732232;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ sjz_4 ^ string.hashCode() ^ n2 + ras + i * -7574811) + sjz_4) ^ ras));
            }
            String[] stringArray = hw_2.tnr(new String(cArray));
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

    private static String[] ehfguajk(String string) {
        return string.split("\u0003\u001e", -1);
    }

    private static CallSite k8o2x918fm(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ x92p9qa1s ^ string.hashCode() ^ n2 + yi4bqd6be24ns ^ i * 1196815433 ^ x92p9qa1s, 11) ^ yi4bqd6be24ns));
            }
            String[] stringArray = hw_2.ehfguajk(new String(cArray));
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

