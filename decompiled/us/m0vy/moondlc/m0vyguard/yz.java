/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.bht_3;
import us.m0vy.moondlc.m0vyguard.tay;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.khgh;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fy;

@tq_2(name="Toggle Sounds", category=bzw.OTHER, desc="Plays a sound when toggling modules")
public class yz
extends bnq {
    private static yz hha_4;
    public final khd jwsh = new khd(this, "Sound");
    public final fy zdb = new fy(this.jwsh, "Smooth");
    public final fy jjt_2 = new fy(this.jwsh, "Celestial");
    public final fy khn = new fy(this.jwsh, "Nursultan");
    public final fy bghs = new fy(this.jwsh, "Akrien");
    public final fy khzw_2 = new fy(this.jwsh, "Tech");
    public final fy zdz_3 = new fy(this.jwsh, "Blop");
    public final fy dldh = new fy(this.jwsh, "MoonDLC");
    public final tay khrd = new tay(this, "Volume").shth_7(1.0f).dhbs_2(Float.intBitsToFloat(Integer.rotateLeft(0x31710FA2 ^ 0x4E310FAA, 27))).rkh_3(1.0f).ssd_5(Float.intBitsToFloat(314921645 + 799714643));
    private static final int khht_4 = -270551089;
    private static final int sshz_2 = -197070904;
    private static final int sft = 1693935587;
    private static final int bkgh = -800054124;
    private static final int zy4mtw0db9kg = 842759242;
    private static final int xongend7 = 1259273596;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ucu00hs5b1ia;

    public yz() {
        hha_4 = this;
    }

    public static void tda_8(boolean bl) {
        int n = 667797737;
        int n2 = (n = Integer.rotateLeft(n * 1806068385, 6) ^ 0x6ECA1EC3) ^ 0x515893D9;
        if ((n2 ^ n) != 1364759513) {
            int cfr_ignored_0 = (0x76955B30 ^ n) + 1970480024;
        }
        if (hha_4 == null || !hha_4.rgha_2()) {
            return;
        }
        String string = yz.hha_4.jwsh.sdh_2().getName();
        int n3 = -1;
        switch (string.hashCode()) {
            case 2792514: {
                if (!yz.sza_5(string, "Nursultan")) break;
                n3 = 0;
                break;
            }
            case -842721352: {
                if (!string.equals("Celestial")) break;
                n3 = 1;
                break;
            }
            case 1963211882: {
                if (!string.equals("Akrien")) break;
                n3 = 2;
                break;
            }
            case 2602678: {
                if (!yz.bzdh(string, yz.tqh_2("趂ᱜ㚚辰", 112529467 - -64756674, 554536655 + 217729146, yz.mz_2(0x1A042BC ^ 0xC89C2E59, 2)))) break;
                n3 = 3;
                break;
            }
            case 2073547: {
                if (!string.equals("Blop")) break;
                n3 = 4;
                break;
            }
            case -1814666802: {
                if (!string.equals("Smooth")) break;
                n3 = 5;
                break;
            }
            case -1392969222: {
                if (!string.equals("MoonDLC")) break;
                n3 = Integer.reverse(942337601) ^ 0x8277541A;
            }
        }
        khgh.khjt_2(switch (n3) {
            case 0 -> {
                if (bl) {
                    yield khgh.dwt;
                }
                yield khgh.dkht;
            }
            case 1 -> {
                if (bl) {
                    yield khgh.khfgh;
                }
                yield khgh.zhk_2;
            }
            case 2 -> {
                if (bl) {
                    yield khgh.jhw;
                }
                yield khgh.dhdht;
            }
            case 3 -> {
                if (bl) {
                    yield khgh.bhs_3;
                }
                yield khgh.dst_4;
            }
            case 4 -> {
                if (bl) {
                    yield khgh.shaa_4;
                }
                yield khgh.dysh;
            }
            case 5 -> {
                if (bl) {
                    yield khgh.khbt_2;
                }
                yield khgh.sj;
            }
            case 6 -> {
                if (bl) {
                    yield khgh.shh_4;
                }
                yield khgh.rssh;
            }
            default -> khgh.jhs_3;
        });
    }

    @Generated
    public static yz tzz_6() {
        block0: {
            int n = 147216068;
            int n2 = (n = Integer.rotateLeft(n * -1404620231, 7) ^ 0x729422D0) ^ 0xA01D4646;
            if ((n2 ^ n) == -1608694202) break block0;
            int cfr_ignored_0 = (0xA8DB1082 ^ n) - 0xCCCFCC7;
        }
        return hha_4;
    }

    private static String khrgh(String string, int n, int n2, int n3) {
        int n4 = 748240786;
        n4 = Integer.rotateLeft(n4 * -361742883, 3) ^ 0x80F86996;
        n4 = Integer.rotateRight(n ^ n4, 24);
        int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 2)) ^ 0x8FC89E96;
        if ((n5 ^ n4) != -1882677610) {
            int cfr_ignored_0 = (0xA351A104 ^ n4) + -637325485;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x7BECAC1B) + n2 ^ i * -28444775) ^ khht_4) + sshz_2);
        }
        return new String(cArray);
    }

    private static String ah_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 441791458;
            n4 = Integer.rotateLeft(n4 * 1958151413, 10) ^ 0xDECF4C03;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 7);
            int n5 = (n4 = n2 ^ n4) ^ 0xFA6E5723;
            if ((n5 ^ n4) == -93432029) break block0;
            int cfr_ignored_0 = (0xE03B64C1 ^ n4) - -1734337586;
        }
        return yz.khrgh(string, n, n2, n3);
    }

    private static boolean sza_5(String string, Object object) {
        block0: {
            int n = 1756525642;
            int n2 = (n = Integer.rotateLeft(n * -1405225781, 4) ^ 0xFDF4619D) ^ 0xEC2B6768;
            if ((n2 ^ n) == -332699800) break block0;
            int cfr_ignored_0 = (0x84991322 ^ n) - -1632327805;
        }
        return string.equals(object);
    }

    private static String rbh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 51946628;
            n4 = Integer.rotateLeft(n4 * -1559120501, 21) ^ 0xD5E8DEFF;
            int n5 = (n4 = Integer.rotateLeft(n3 ^ n4, 23)) ^ 0x3DBCF711;
            if ((n5 ^ n4) == 1035794193) break block0;
            int cfr_ignored_0 = (0x3EA45395 ^ n4) - -1375282081;
        }
        return yz.khrgh(string, n, n2, n3);
    }

    private static int mz_2(int n, int n2) {
        block0: {
            int n3 = -511273726;
            n3 = Integer.rotateLeft(n3 * -1339431767, 23) ^ 0xD5304A76;
            int n4 = (n3 = Integer.rotateLeft(n ^ n3, 17)) ^ 0xC819EFDA;
            if ((n4 ^ n3) == -937824294) break block0;
            int cfr_ignored_0 = (0x299F7AD8 ^ n3) - -69077924;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String tqh_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1009968750;
            n4 = Integer.rotateLeft(n4 * 2026796895, 6) ^ 0x5575926C;
            n4 = Integer.rotateLeft(n ^ n4, 2);
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 10)) ^ 0xD8679DA1;
            if ((n5 ^ n4) == -664298079) break block0;
            int cfr_ignored_0 = (0x1BAA8433 ^ n4) - -1833677225;
        }
        return yz.khrgh(string, n, n2, n3);
    }

    private static boolean bzdh(String string, Object object) {
        block0: {
            int n = bht_3.jyq(-1329042509);
            int n2 = n ^ 0xBB9A251C;
            if ((n2 ^ n) == -1147525860) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xB524EAF ^ n, 4) - 1666524780;
        }
        return string.equals(object);
    }

    private static String sth_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -808571289;
            n4 = Integer.rotateLeft(n4 * -1225144321, 11) ^ 0xC7331AFE;
            int n5 = (n4 = Integer.rotateLeft(n2 ^ n4, 6)) ^ 0x4E76EA13;
            if ((n5 ^ n4) == 1316416019) break block0;
            int cfr_ignored_0 = (0x81B8C474 ^ n4) + 828426360;
        }
        return yz.khrgh(string, n, n2, n3);
    }

    private static String sff(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1844720001;
            n4 = Integer.rotateLeft(n4 * -1067336483, 23) ^ 0x50C26EA6;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 7);
            int n5 = (n4 = Integer.rotateRight(n ^ n4, 8)) ^ 0xAF91887D;
            if ((n5 ^ n4) == -1349416835) break block0;
            int cfr_ignored_0 = (0xC265B9FC ^ n4) + -713052748;
        }
        return yz.khrgh(string, n, n2, n3);
    }

    private static String[] dns_3(String string) {
        int n = bht_3.jyq(-1760922098);
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0x5677A75F;
        if ((n2 ^ n) != 1450682207) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xC17DD151 ^ n, 11) + 1922693130) * -1048719023;
            int cfr_ignored_1 = (int)(0x3CF7F6C27D4EB4FL ^ (long)n ^ 0x3A8831A2DB9AA4FL);
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

    private static CallSite tbq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -131710351;
            n3 = Integer.rotateLeft(n3 * 1483829127, 27) ^ 0x7A84C972;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x958DB;
            if ((n4 ^ n3) != 612571) {
                int cfr_ignored_0 = (0xF82F1AAA ^ n3) - 431057007;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ sft ^ string.hashCode() ^ n2 + bkgh + i * -1133090073) + sft) ^ bkgh));
            }
            String[] stringArray = yz.dns_3(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] zda0dqpt46(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite tymf23in1ol7b7(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ zy4mtw0db9kg ^ string.hashCode()) + (n2 + xongend7) + i ^ zy4mtw0db9kg, 27) + xongend7);
            }
            String[] stringArray = yz.zda0dqpt46(new String(cArray));
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

