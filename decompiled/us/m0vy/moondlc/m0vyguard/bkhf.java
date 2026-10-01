/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.NonNull
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.NoSuchElementException;
import lombok.NonNull;
import us.m0vy.moondlc.m0vyguard.bsh_4;
import us.m0vy.moondlc.m0vyguard.btf_2;
import us.m0vy.moondlc.m0vyguard.tdq;
import us.m0vy.moondlc.m0vyguard.khh;
import us.m0vy.moondlc.m0vyguard.yf;

public class bkhf {
    private static final btf_2 dhqk;
    private final long shd_2;
    private final tdq bhh;
    private final tdq das;
    private final tdq thtth;
    private final tdq dhkt_2;
    private static final int shghq = 237800913;
    private static final int zrt = 1255491144;
    private static final int shghz_2 = -1873151943;
    private static final int bss_3 = 1012962179;
    private static final int o1gn3m09dqej = 1425628812;
    private static final int c5ptewcal = 1293393839;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int i0kf8xv2hy1g;

    public bkhf(long l, btf_2 btf2) {
        this.shd_2 = l;
        this.bhh = new tdq(l, btf2);
        this.das = new tdq(l, btf2);
        this.thtth = new tdq(l, btf2);
        this.dhkt_2 = new tdq(l, btf2);
    }

    public bkhf(long l) {
        this(l, dhqk);
    }

    public bkhf(long l, khh khh2, btf_2 btf2) {
        this.shd_2 = l;
        this.bhh = new tdq(l, khh2.tlz(), btf2);
        this.das = new tdq(l, khh2.rrm(), btf2);
        this.thtth = new tdq(l, khh2.rkhj(), btf2);
        this.dhkt_2 = new tdq(l, khh2.tas_3(), btf2);
    }

    public bkhf(long l, khh khh2) {
        this(l, khh2, dhqk);
    }

    public void ghsy(@NonNull khh khh2) {
        if (khh2 == null) {
            throw new NullPointerException("targetColor is marked non-null but is null");
        }
        this.bhh.znl_2(khh2.tlz());
        this.das.znl_2(khh2.rrm());
        this.thtth.znl_2(khh2.rkhj());
        this.dhkt_2.znl_2(khh2.tas_3());
    }

    public khh ghzd_3() {
        int n = -731249733;
        n = Integer.rotateLeft(n * -211853727, 13) ^ 0x6EDB548F;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 23);
        int n2 = n ^ 0x1E0F1A89;
        if ((n2 ^ n) != 504306313) {
            int cfr_ignored_0 = (0xCA651932 ^ n) + -1396406524;
        }
        return new khh((int)this.bhh.swd(), (int)this.das.swd(), (int)this.thtth.swd(), (int)bkhf.syr_2(this.dhkt_2));
    }

    public void dhkhth(btf_2 btf2) {
        try {
            int n = -1537921440;
            n = Integer.rotateLeft(n * 1840700485, 6) ^ 0xABE3686F;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 4);
            int n2 = n ^ 0x1FAEA659;
            if ((n2 ^ n) != 531539545) {
                int cfr_ignored_0 = (0xBBFB8839 ^ n) - 1729514909;
            }
            if ((0xCE & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (bkhf.tar_4()) {
            throw null;
        }
        this.bhh.zzb_4(btf2);
        this.das.zzb_4(btf2);
        bkhf.sny(this.thtth, btf2);
        this.dhkt_2.zzb_4(btf2);
    }

    public void tbs_4(long l) {
        int n = bsh_4.zghd_4(-766946683);
        int n2 = (n = Integer.rotateRight((int)l ^ n, 12)) ^ 0xBD0D858A;
        if ((n2 ^ n) != -1123187318) {
            int cfr_ignored_0 = Integer.rotateRight(0x6F44D70F ^ n, 16) - 2108926476;
        }
        this.bhh.zaz_5(l);
        this.das.zaz_5(l);
        this.thtth.zaz_5(l);
        bkhf.sdh(this.dhkt_2, l);
    }

    /*
     * Unable to fully structure code
     */
    public void zzt_3(@NonNull khh var1_1) {
        var4_2 = 0;
        var2_3 = 405856112;
        var2_3 = Integer.rotateLeft(var2_3 * -913340665, 21) ^ -1971319262;
        var2_3 = System.identityHashCode(this) ^ var2_3;
        v0 = var1_1;
        var2_3 = Integer.rotateRight((v0 != null ? System.identityHashCode(v0) : 0) ^ var2_3, 19);
        var3_4 = var2_3 - 795016031;
        block17: while (true) {
            block40: {
                block33: {
                    block32: {
                        block36: {
                            block30: {
                                block31: {
                                    block29: {
                                        block34: {
                                            block37: {
                                                block39: {
                                                    block35: {
                                                        block38: {
                                                            var4_2 = var2_3 - var3_4;
                                                            switch (var4_2 & 7) {
                                                                case 0: {
                                                                    if (var4_2 == 255184424) break block29;
                                                                    if (var4_2 == -1146212416) break;
                                                                    if (var4_2 != 1536849512) {
                                                                        ** break;
                                                                    }
                                                                    break block30;
                                                                }
                                                                case 1: {
                                                                    if (var4_2 != 1553407897) {
                                                                        ** break;
                                                                    }
                                                                    break block31;
                                                                }
                                                                case 3: {
                                                                    if (var4_2 != 636844819) {
                                                                        ** break;
                                                                    }
                                                                    break block32;
                                                                }
                                                                case 4: {
                                                                    if (var4_2 == -687903124) break block33;
                                                                    if (var4_2 != 372124564) {
                                                                        ** break;
                                                                    }
                                                                    break block34;
                                                                }
                                                                case 5: {
                                                                    if (var4_2 == -660096603) break block35;
                                                                    if (var4_2 == -1278536651) break block36;
                                                                    (Integer.rotateLeft(-1981323272 ^ var2_3, 4) + -1218234813) * -1981323271;
                                                                    if (var4_2 != 1484292493) {
                                                                        ** break;
                                                                    }
                                                                    break block37;
                                                                }
                                                                case 6: {
                                                                    if (var4_2 == 1015348254) break block38;
                                                                    if (var4_2 == -2092261730) break block39;
                                                                    (Integer.rotateRight(-1242597486 ^ var2_3, 9) + 207428073) * -1242597485;
                                                                    if (var4_2 != -1592116714) {
                                                                        ** break;
                                                                    }
                                                                    break block40;
                                                                }
                                                                case 7: {
                                                                    if (var4_2 != 795016031) ** break;
                                                                    Integer.rotateRight(1272338186 ^ var2_3, 12) + 861022577;
                                                                    if (var1_1 == null) {
                                                                        var3_4 = var2_3 - 1015348254;
                                                                        continue block17;
                                                                    }
                                                                    (int)(-6547666557378788268L ^ (long)var2_3 ^ -388774371053869163L);
                                                                    var3_4 = var2_3 - 744087933 + -913377793 - -913377793;
                                                                    (int)(6876552367102056216L ^ (long)var2_3 ^ 3067879649013338893L);
                                                                    var3_4 = var2_3 - -1146212416;
                                                                    continue block17;
                                                                }
                                                            }
                                                            Integer.rotateRight(-706524341 ^ var2_3, 13) + -354173616;
                                                            bkhf.zyn(this.bhh, bkhf.tys_2(var1_1));
                                                            this.das.khadh_2(var1_1.rrm());
                                                            this.thtth.khadh_2(var1_1.rkhj());
                                                            this.dhkt_2.khadh_2(var1_1.tas_3());
                                                            return;
                                                        }
                                                        (Integer.rotateRight(88158495 ^ var2_3, 3) - -1488809476) * 88158495;
                                                        throw new NullPointerException(bkhf.jhl("color is mar".concat("ked non-nul"), bkhf.hyb("盓銥㾘굵搙ݖ톁⃀๚읞눽徠", -1966627122 ^ 735872357, bkhf.hkhy(2036709441 ^ 1130036553, 26), 594557871 - -1119411890)));
                                                    }
                                                    (Integer.rotateLeft(-111716812 ^ var2_3, 18) - 904990599) * -111716811;
                                                    var3_4 = var2_3 - -231595096 + 224200923 - 224200923;
                                                    Integer.rotateLeft(70356965 ^ var2_3, 3) - -2040656906;
                                                    (int)(-4142430019985806513L ^ (long)var2_3 ^ -4701613862515367721L);
                                                    var3_4 = var2_3 - 795016031 + -598523063 - -598523063;
                                                    (Integer.rotateLeft(-1749301391 ^ var2_3, 5) + 1679476202) * -1749301391;
                                                    (int)(6127544543820966735L ^ (long)var2_3 ^ 3452153262838974403L);
                                                    --var4_2;
                                                    continue;
                                                }
                                                (Integer.rotateLeft(141598136 ^ var2_3, 4) + 167819395) * 141598137;
                                                var3_4 = Integer.reverse(Integer.reverse(var2_3 - 837565991));
                                                Integer.rotateRight(93985322 ^ var2_3, 3) + -1308177839;
                                                var3_4 = var2_3 - -115393947 ^ -1046730649 ^ -1046730649;
                                                Integer.rotateLeft(1934740068 ^ var2_3, 17) - -79355561;
                                                var3_4 = var2_3 - 795016031;
                                                continue;
                                            }
                                            (Integer.rotateLeft(210519348 ^ var2_3, 4) - -1990590329) * 210519349;
                                            var3_4 = var2_3 - 795016031 ^ 565174074 ^ 565174074;
                                            (Integer.rotateRight(1708336859 ^ var2_3, 15) + 1492079552) * 1708336859;
                                            var4_2 -= 3;
                                            continue;
                                        }
                                        Integer.rotateRight(-1445207993 ^ var2_3, 8) - -1778530348;
                                        var3_4 = var2_3 - 1939972375 ^ -2132137072 ^ -2132137072;
                                        Integer.rotateRight(1932324295 ^ var2_3, 17) - -154244524;
                                        try {
                                            var4_2 -= 4;
                                            if ((2687586346150851847L ^ (long)var2_3 | 1L) == 0L) {
                                                throw new NoSuchElementException();
                                            }
                                            var3_4 = Integer.reverse(Integer.reverse(var2_3 - 795016031));
                                        }
                                        catch (NoSuchElementException v1) {
                                            var3_4 = var2_3 - 795016031 + 1724437274 - 1724437274;
                                        }
                                        var4_2 += 5;
                                        continue;
                                    }
                                    (Integer.rotateRight(2024369591 ^ var2_3, 18) - -1595807644) * 2024369591;
                                    var3_4 = var2_3 - 502349178;
                                    Integer.rotateLeft(-1492339763 ^ var2_3, 7) - 1055352078;
                                    (int)(7331330160703368015L ^ (long)var2_3 ^ -4138663909093972307L);
                                    try {
                                        var4_2 -= 2;
                                        if ((-7417462819194093445L ^ (long)var2_3 | 1L) == 0L) {
                                            throw new UnsupportedOperationException();
                                        }
                                        var3_4 = (int)((long)(var2_3 - 795016031) ^ 2698728128303124607L ^ 2698728128303124607L);
                                    }
                                    catch (UnsupportedOperationException v2) {
                                        var3_4 = var2_3 - 795016031 ^ 1338446433 ^ 1338446433;
                                    }
                                    var4_2 -= 2;
                                    continue;
                                }
                                Integer.rotateLeft(-2126890643 ^ var2_3, 3) - -1435856018;
                                (int)(4866305767895264079L ^ (long)var2_3 ^ -3183900788091442496L);
                                try {
                                    var4_2 -= 3;
                                    if ((632112132974133517L ^ (long)var2_3 | 1L) == 0L) {
                                        throw new NoSuchElementException();
                                    }
                                    var3_4 = var2_3 - 795016031 ^ 641253633 ^ 641253633;
                                }
                                catch (NoSuchElementException v3) {
                                    var3_4 = var2_3 - 795016031 + 295431469 - 295431469;
                                }
                                var4_2 += 2;
                                continue;
                            }
                            (Integer.rotateLeft(1038091709 ^ var2_3, 10) - -2105650914) * 1038091709;
                            (int)(-48788079035225265L ^ (long)var2_3 ^ -6165283741410765964L);
                            try {
                                if ((-3673019357574975969L ^ (long)var2_3 | 1L) == 0L) {
                                    throw new NoSuchElementException();
                                }
                                var3_4 = var2_3 - 795016031;
                            }
                            catch (NoSuchElementException v4) {
                                var3_4 = Integer.reverse(Integer.reverse(var2_3 - 795016031));
                            }
                            var4_2 -= 2;
                            continue;
                        }
                        Integer.rotateRight(884274607 ^ var2_3, 9) - 1715953516;
                        (int)(4684935850375865475L ^ (long)var2_3 ^ -8801222273175310375L);
                        var3_4 = Integer.reverse(Integer.reverse(var2_3 - 600781411));
                        (int)(2818233455277693873L ^ (long)var2_3 ^ 4448003192558838761L);
                        var3_4 = var2_3 - 795016031 + 728393178 - 728393178;
                        continue;
                    }
                    Integer.rotateRight(1254042214 ^ var2_3, 12) - 293847445;
                    var3_4 = var2_3 - -1078841960 ^ 1029292793 ^ 1029292793;
                    (Integer.rotateLeft(540041620 ^ var2_3, 7) - -365334489) * 540041621;
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - -1599154592));
                    (Integer.rotateLeft(1094183957 ^ var2_3, 11) - -366791226) * 1094183957;
                    (int)(-8969690342604084401L ^ (long)var2_3 ^ 8728120226303486683L);
                    var3_4 = var2_3 - 795016031;
                    ++var4_2;
                    continue;
                }
                Integer.rotateRight(1269052874 ^ var2_3, 12) + 759177905;
                (int)(-4984734557019616842L ^ (long)var2_3 ^ -6207782428937103244L);
                var3_4 = var2_3 - -1979253195;
                (int)(2027623898499474602L ^ (long)var2_3 ^ -2372819772058135146L);
                var3_4 = var2_3 - 795016031 + -1173831988 - -1173831988;
                var4_2 += 2;
                continue;
            }
            Integer.rotateLeft(1915656012 ^ var2_3, 17) - -670961297;
            var3_4 = (int)((long)(var2_3 - 795016031) ^ -6047002961643398019L ^ -6047002961643398019L);
            continue;
lbl208:
            // 8 sources

            Integer.rotateRight(-244505529 ^ var2_3, 17) - 1083507668;
            var3_4 = (int)((long)(var2_3 - 795016031) ^ 5924070038609572636L ^ 5924070038609572636L);
        }
    }

    private static String hyb(String string, int n, int n2, int n3) {
        int n4 = 1755838109;
        n4 = Integer.rotateLeft(n4 * -1605463113, 5) ^ 0xAC73666A;
        n4 = Integer.rotateRight(n ^ n4, 6);
        int n5 = (n4 = n3 ^ n4) ^ 0x483A5B25;
        if ((n5 ^ n4) != 1211783973) {
            int cfr_ignored_0 = (0x209DADB8 ^ n4) - -30670905;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x83B6E518) + shghq ^ Integer.reverse(n2 + i * 348313523), 15) - zrt);
        }
        return new String(cArray);
    }

    private static float syr_2(tdq tdq2) {
        block0: {
            int n = bsh_4.zghd_4(1734360902);
            int n2 = n ^ 0x2389050A;
            if ((n2 ^ n) == 596182282) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x44E93A4C ^ n, 11) - 1553706607;
        }
        return tdq2.swd();
    }

    private static boolean tar_4() {
        block0: {
            int n = bsh_4.zghd_4(-920401263);
            int n2 = n ^ 0x1CAAF9C9;
            if ((n2 ^ n) == 480967113) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xD5893358 ^ n, 13) + -537209117) * -712428711;
        }
        return yf.dnkh();
    }

    private static void sny(tdq tdq2, btf_2 btf2) {
        int n = 1271428617;
        n = Integer.rotateLeft(n * -1132899535, 17) ^ 0x601EA7D9;
        btf_2 btf3 = btf2;
        n = (btf3 != null ? System.identityHashCode(btf3) : 0) ^ n;
        int n2 = n ^ 0xBB4A60DF;
        if ((n2 ^ n) != -1152753441) {
            int cfr_ignored_0 = (0xF08216D6 ^ n) + 1526998739;
        }
        tdq2.zzb_4(btf2);
    }

    private static void sdh(tdq tdq2, long l) {
        int n = 2136109754;
        n = Integer.rotateLeft(n * 1961894639, 11) ^ 0xD9E78AD8;
        int n2 = (n = (int)l ^ n) ^ 0xFED819AA;
        if ((n2 ^ n) != -19392086) {
            int cfr_ignored_0 = (0x818A6B10 ^ n) + -360514326;
        }
        tdq2.zaz_5(l);
    }

    private static int hkhy(int n, int n2) {
        block0: {
            int n3 = 1227622969;
            n3 = Integer.rotateLeft(n3 * 1341416255, 24) ^ 0x5D1C89F0;
            int n4 = (n3 = Integer.rotateRight(n2 ^ n3, 25)) ^ 0x1D0949C6;
            if ((n4 ^ n3) == 487147974) break block0;
            int cfr_ignored_0 = (0x542543FF ^ n3) + -183443299;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String jhl(String string, String string2) {
        block0: {
            int n = 636032160;
            n = Integer.rotateLeft(n * 278410249, 23) ^ 0x424DBECC;
            String string3 = string;
            n = (string3 != null ? System.identityHashCode(string3) : 0) ^ n;
            String string4 = string2;
            n = Integer.rotateRight((string4 != null ? System.identityHashCode(string4) : 0) ^ n, 6);
            int n2 = n ^ 0x4C53085;
            if ((n2 ^ n) == 80031877) break block0;
            int cfr_ignored_0 = (0x212C2425 ^ n) + -776983640;
        }
        return string.concat(string2);
    }

    private static float tys_2(khh khh2) {
        block0: {
            int n = bsh_4.zghd_4(-276006440);
            int n2 = n ^ 0x558BB211;
            if ((n2 ^ n) == 1435218449) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xBA07CBC9 ^ n, 10) + -1957737326;
            int cfr_ignored_1 = (int)(0x78B565F427D4EB4FL ^ (long)n ^ 0x3698831A2DB95CBBL);
        }
        return khh2.tlz();
    }

    private static void zyn(tdq tdq2, float f) {
        int n = -1571243775;
        n = Integer.rotateLeft(n * -539258369, 20) ^ 0xC4F566F8;
        tdq tdq3 = tdq2;
        n = Integer.rotateLeft((tdq3 != null ? System.identityHashCode(tdq3) : 0) ^ n, 7);
        n = Integer.rotateLeft(Float.floatToIntBits(f) ^ n, 28);
        int n2 = n ^ 0x2D6C65F2;
        if ((n2 ^ n) != 762078706) {
            int cfr_ignored_0 = (0x8F34DCF3 ^ n) + 1684998877;
        }
        tdq2.khadh_2(f);
    }

    private static String[] sthk_2(String string) {
        int n = 1409835543;
        n = Integer.rotateLeft(n * -1201081129, 22) ^ 0xD19DD9AC;
        String string2 = string;
        n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
        int n2 = n ^ 0xFD0CB3CF;
        if ((n2 ^ n) != -49499185) {
            int cfr_ignored_0 = (0xA904D1D8 ^ n) + 1641617762;
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

    private static CallSite shqq(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1025638183;
            n3 = Integer.rotateLeft(n3 * 1486958363, 22) ^ 0x50A8AD12;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 3);
            MethodType methodType2 = methodType;
            n3 = (methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3;
            int n4 = n3 ^ 0x762B2960;
            if ((n4 ^ n3) != 1982540128) {
                int cfr_ignored_0 = (0xB4F529B9 ^ n3) - -32917193;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ shghz_2 ^ string.hashCode() ^ n2 + bss_3 ^ i * -1302998695 ^ shghz_2, 26) ^ bss_3));
            }
            String[] stringArray = bkhf.sthk_2(new String(cArray));
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

    private static String[] q6dqfgs3hr(String string) {
        return string.split("\u0002\u000f", -1);
    }

    private static CallSite k7qzd2jhhu2c12(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ o1gn3m09dqej ^ string.hashCode()) + (n2 + c5ptewcal) + i ^ o1gn3m09dqej, 16) + c5ptewcal);
            }
            String[] stringArray = bkhf.q6dqfgs3hr(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

