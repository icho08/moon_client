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
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bsb;
import us.m0vy.moondlc.m0vyguard.bzdh_2;
import us.m0vy.moondlc.m0vyguard.bhth_2;
import us.m0vy.moondlc.m0vyguard.tdhf;
import us.m0vy.moondlc.m0vyguard.tzsh;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.dht_6;
import us.m0vy.moondlc.m0vyguard.tr_2;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.m0vy.moondlc.m0vyguard.qd;
import us.m0vy.moondlc.m0vyguard.qk;
import us.m0vy.moondlc.m0vyguard.yz;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public abstract class bnq
implements bsb {
    private final tq_2 hydh = this.getClass().getAnnotation(tq_2.class);
    private int shda;
    private bzw hsl_2;
    private boolean khzd_3;
    private boolean sssh_2;
    private boolean dhdq_2 = false;
    private String sha_3;
    private List zkha_2 = new ArrayList();
    private final fa_2 bjy = new fa_2(0xEDD2342F4059583L ^ 0xEDD2342F40594AFL, 0.0f, jkh.dzb);
    private static final int ththh = 958895131;
    private static final int zt = -187196671;
    private static final int hdz_4 = -1077917090;
    private static final int hhh_4 = -1634909248;
    private static final int d1yrgrmvo52h = -23813599;
    private static final int dargd944u = -416374991;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int wdgnhjflmric;

    public bnq() {
        this.sha_3 = bnq.tdl_4(this.hydh.name());
        tq_2 tq2 = this.hydh;
        this.hsl_2 = bnq.tdj_3(tq2.name(), tq2.category());
        this.shda = this.hydh.key();
    }

    @Override
    public void dwkh() {
        try {
            int n = 1746688585;
            n = Integer.rotateLeft(n * 238811309, 10) ^ 0x70CEA7C2;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x7EE63149;
            if ((n2 ^ n) != 2129015113) {
                int cfr_ignored_0 = (0x16FA6B00 ^ n) - 1403387312;
            }
            if ((0xCF & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            bnq.rghsh();
        }
        bnq.khhq(this, !this.khzd_3, false);
    }

    @Override
    public void nt() {
        block0: {
            int n = tzsh.zly(-534236703);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x3BCCDD19;
            if ((n2 ^ n) == 1003281689) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xDBE4ECF8 ^ n, 14) + -1525264061) * -605754119;
        }
    }

    @Override
    public void nc() {
        block0: {
            int n = -253209528;
            n = Integer.rotateLeft(n * -454809551, 19) ^ 0x42D6B240;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 21);
            int n2 = n ^ 0x404E4CA;
            if ((n2 ^ n) == 67429578) break block0;
            int cfr_ignored_0 = (0xF4ECB082 ^ n) - 1681695341;
        }
    }

    @Override
    public void ncK() {
    }

    @Override
    public void tskh_3() {
        int n = 2142556980;
        n = Integer.rotateLeft(n * -1229812449, 18) ^ 0x85C6763;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x79F976A4;
        if ((n2 ^ n) != 2046391972) {
            int cfr_ignored_0 = (0x64DA590 ^ n) - -119996359;
        }
        bnq.khksh(this, false, false);
    }

    @Override
    public void bsy() {
        int n = 546265105;
        n = Integer.rotateLeft(n * -361083635, 24) ^ 0x7B39092;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xAE4600CE;
        if ((n2 ^ n) != -1371143986) {
            int cfr_ignored_0 = (0x8EC958DF ^ n) - 139490362;
        }
        bnq.baq_2(this, true, false);
    }

    @Override
    public void dhaq(boolean bl, boolean bl2) {
        int n = -2145728679;
        n = Integer.rotateLeft(n * -1598251545, 22) ^ 0x1FA919D0;
        n = System.identityHashCode(this) ^ n;
        int n2 = (n = Integer.rotateLeft(bl2 ^ n, 27)) ^ 0xD7F14253;
        if ((n2 ^ n) != -672054701) {
            int cfr_ignored_0 = (0x57EB850A ^ n) - -203079958;
        }
        if (!bnq.khqr()) {
            yf.athz_2();
            throw null;
        }
        if (this.khzd_3 != bl) {
            this.khzd_3 = bl;
            if (!(this instanceof qd) && !bl2) {
                yz.tda_8(this.khzd_3);
            }
            if (this.khzd_3) {
                bnq.tghm(Moondlc.getInstance()).sdz_4(this);
                if (!bl2) {
                    bnq.bshq(Moondlc.getInstance().getNotificationManager(), qk.zhh_2, this.sha_3.replace(" ", "") + " " + bnq.ththq(bnq.zsn_3("㨎㨅㨊㨉㨇㨎㨏", bnq.ghrz_2(0xDF53176A ^ 0x38F03871, 21), Integer.rotateLeft(0x57447B5D ^ 0x8912DF62, 9), 0x7FF3EC84 ^ 0xAC400145)) + (tr_2.hqs() == tdhf.bkt ? bzdh_2.shst_4(this.sha_3) : ""));
                }
                bnq.tath_2(this);
            } else {
                Moondlc.getInstance().getEventManager().shbt_2(this);
                if (!bl2) {
                    bnq.zaw_3(Moondlc.getInstance()).khdhz_2(qk.tghs, this.sha_3.replace(" ", "") + " " + bnq.khja_2(bnq.ghta("㽼㽱㽫㽹㽺㽴㽽㽼", 0xB805F5A8 ^ 0x6475BE4B, bnq.stl_4(0x2B4B0DA6 ^ 0xABD6CD0C, 11), 499931541 + -1243114452)) + (bnq.stgh_2() == tdhf.bkt ? bzdh_2.shst_4(this.sha_3) : ""));
                }
                this.nc();
            }
        }
    }

    public String zdhb(String string) {
        block0: {
            int n = 1209236278;
            n = Integer.rotateLeft(n * -550930143, 20) ^ 0xE1C303F;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 11);
            int n2 = n ^ 0xD59EA200;
            if ((n2 ^ n) == -711024128) break block0;
            int cfr_ignored_0 = (0x9D8DD936 ^ n) - -1314286677;
        }
        return "modules.settings." + bnq.khthf(bnq.byw(this).toLowerCase(), bnq.zsth_2("꺺", Integer.rotateLeft(0x74FDF56F ^ 0x8685EA76, 29), Integer.rotateLeft(0xA7D51C0E ^ 0x49BB1449, 17), bnq.aza_4(0x52597533 ^ 0xBE7A5553, 3)), "_") + "." + string;
    }

    @Override
    @Generated
    public tq_2 hsdh_2() {
        block0: {
            int n = 116250946;
            n = Integer.rotateLeft(n * -1903937469, 20) ^ 0x5A67C26F;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xFE5DBDFD;
            if ((n2 ^ n) == -27410947) break block0;
            int cfr_ignored_0 = (0xF8B064BF ^ n) + 139503656;
        }
        return this.hydh;
    }

    @Override
    @Generated
    public int thaf() {
        block0: {
            int n = tzsh.zly(-597179467);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 20);
            int n2 = n ^ 0x1168DC7D;
            if ((n2 ^ n) == 292084861) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xCD0F1FC8 ^ n, 12) + -651003789;
        }
        return this.shda;
    }

    @Override
    @Generated
    public bzw dkb() {
        block0: {
            int n = -1393310375;
            int n2 = (n = Integer.rotateLeft(n * -1950210585, 24) ^ 0x5FCA45DF) ^ 0xDCD919B4;
            if ((n2 ^ n) == -589751884) break block0;
            int cfr_ignored_0 = (0x702ADCED ^ n) - -256599171;
        }
        return this.hsl_2;
    }

    @Override
    @Generated
    public boolean rgha_2() {
        block0: {
            int n = -333929580;
            int n2 = (n = Integer.rotateLeft(n * -1310228773, 6) ^ 0x839080A7) ^ 0x32A4E80C;
            if ((n2 ^ n) == 849668108) break block0;
            int cfr_ignored_0 = (0xDEBC4B98 ^ n) + -1461077300;
        }
        return this.khzd_3;
    }

    @Override
    @Generated
    public boolean dsd_4() {
        block0: {
            int n = tzsh.zly(-136618368);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 5);
            int n2 = n ^ 0x55A4519A;
            if ((n2 ^ n) == 1436832154) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xA27F0F1A ^ n, 7) + -1312787615) * -1568731365;
        }
        return this.sssh_2;
    }

    @Override
    @Generated
    public String getName() {
        block0: {
            int n = tzsh.zly(2028127630);
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0xE8868AEE;
            if ((n2 ^ n) == -393835794) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x90644F60 ^ n, 5) + -2138883109;
        }
        return this.sha_3;
    }

    @Override
    @Generated
    public List dty() {
        block0: {
            int n = -1332894334;
            n = Integer.rotateLeft(n * 2145293605, 3) ^ 0x4B27134E;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x5E4E13F;
            if ((n2 ^ n) == 98885951) break block0;
            int cfr_ignored_0 = (0xB56944BD ^ n) - 1228250428;
        }
        return this.zkha_2;
    }

    @Override
    @Generated
    public fa_2 hdw() {
        block0: {
            int n = 1930760684;
            n = Integer.rotateLeft(n * -69488517, 8) ^ 0xA6FAF0B4;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xFFAE3B3D;
            if ((n2 ^ n) == -5358787) break block0;
            int cfr_ignored_0 = (0x8CBB2AD1 ^ n) - -81164659;
        }
        return this.bjy;
    }

    @Override
    @Generated
    public void zhs_5(int n) {
        int n2 = tzsh.zly(-359194395);
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = n2 ^ 0xCB8CEBA8;
        if ((n3 ^ n2) != -879957080) {
            int cfr_ignored_0 = Integer.rotateLeft(0x211BCB4D ^ n2, 7) - 112934286;
            int cfr_ignored_1 = (int)(0xE3A9657027D4EB4FL ^ (long)n2 ^ 0x3790831A2DB86A83L);
        }
        this.shda = n;
    }

    @Generated
    public void bka_2(bzw bzw2) {
        int n = 597615794;
        int n2 = (n = Integer.rotateLeft(n * 121880381, 22) ^ 0x852AE278) ^ 0x8DCE7969;
        if ((n2 ^ n) != -1915848343) {
            int cfr_ignored_0 = (0xAE509DDB ^ n) + -554626076;
        }
        this.hsl_2 = bzw2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void tba(boolean var1_1) {
        var4_2 = 0;
        var2_3 = -2032332757;
        var2_3 = Integer.rotateLeft(var2_3 * -1767394597, 27) ^ 1756081557;
        var2_3 = System.identityHashCode(this) ^ var2_3;
        var2_3 = Integer.rotateLeft(var1_1 ^ var2_3, 28);
        var3_4 = -1284248517 + var2_3;
        while (true) {
            block32: {
                block31: {
                    block24: {
                        block26: {
                            block28: {
                                block25: {
                                    block29: {
                                        block23: {
                                            block27: {
                                                block34: {
                                                    block33: {
                                                        block30: {
                                                            var4_2 = var3_4 - var2_3;
                                                            switch (var4_2 & 7) {
                                                                case 0: {
                                                                    if (var4_2 == 400155128) break block23;
                                                                    if (var4_2 == -1235046544) break block24;
                                                                    (Integer.rotateLeft(1597179321 ^ var2_3, 14) + -1953804126) * 1597179321;
                                                                    (int)(-7097202953666892977L ^ (long)var2_3 ^ -6163031941597063470L);
                                                                    if (var4_2 != 757535576) {
                                                                        ** break;
                                                                    }
                                                                    break block25;
                                                                }
                                                                case 2: {
                                                                    if (var4_2 == -1065698502) break block26;
                                                                    if (var4_2 == 655553258) break block27;
                                                                    (Integer.rotateLeft(1448989496 ^ var2_3, 13) + 2042245891) * 1448989497;
                                                                    if (var4_2 != -1987196462) {
                                                                        ** break;
                                                                    }
                                                                    break block28;
                                                                }
                                                                case 3: {
                                                                    if (var4_2 == -565936309) break block29;
                                                                    if (var4_2 != -1284248517) {
                                                                        ** break;
                                                                    }
                                                                    break block30;
                                                                }
                                                                case 4: {
                                                                    if (var4_2 != -323104076) {
                                                                        ** break;
                                                                    }
                                                                    break block31;
                                                                }
                                                                case 5: {
                                                                    if (var4_2 != -1721391971) {
                                                                        if (var4_2 == -77307003) break;
                                                                        ** break;
                                                                    }
                                                                    break block32;
                                                                }
                                                                case 6: {
                                                                    if (var4_2 != 72059286) {
                                                                        ** break;
                                                                    }
                                                                    break block33;
                                                                }
                                                                case 7: {
                                                                    if (var4_2 != 2128592183) {
                                                                        ** break;
                                                                    }
                                                                    break block34;
                                                                }
                                                            }
                                                            Integer.rotateLeft(273275137 ^ var2_3, 5) + -45160870;
                                                            (int)(-3243868006340302001L ^ (long)var2_3 ^ 1371490234993739815L);
                                                            this.dhaq(var1_1, true);
                                                            return;
                                                        }
                                                        (Integer.rotateRight(-1714749518 ^ var2_3, 6) + -1544383031) * -1714749517;
                                                        if (!bnq.thdh()) {
                                                            (int)(4822333598679938144L ^ (long)var2_3 ^ 4667892831982397449L);
                                                            var3_4 = Integer.reverse(Integer.reverse(72059286 + var2_3));
                                                            --var4_2;
                                                            continue;
                                                        }
                                                        var3_4 = (int)((long)(-77307003 + var2_3) ^ 2227127519315135864L ^ 2227127519315135864L);
                                                        Integer.rotateRight(1927181291 ^ var2_3, 17) + -313677648;
                                                        var4_2 -= 4;
                                                        continue;
                                                    }
                                                    (Integer.rotateLeft(-328615371 ^ var2_3, 16) - -1523897434) * -328615371;
                                                    (int)(3376314370904877903L ^ (long)var2_3 ^ -3071310797407129497L);
                                                    bnq.zha_2();
                                                    throw null;
                                                }
                                                (Integer.rotateRight(-1292292909 ^ var2_3, 9) + -1333130040) * -1292292909;
                                                var3_4 = -1382605620 + var2_3 + -1436547382 - -1436547382;
                                                (Integer.rotateLeft(-1470416932 ^ var2_3, 8) - 1734959839) * -1470416931;
                                                (int)(-3748238792920518906L ^ (long)var2_3 ^ -3158639656763246042L);
                                                var3_4 = -1284248517 + var2_3;
                                                continue;
                                            }
                                            Integer.rotateLeft(2104609229 ^ var2_3, 18) - 891621134;
                                            (int)(-4628741710848660657L ^ (long)var2_3 ^ 3643556247002206807L);
                                            var3_4 = -1371835577 + var2_3;
                                            Integer.rotateRight(964168239 ^ var2_3, 10) - -102311188;
                                            var3_4 = (int)((long)(-1284248517 + var2_3) ^ 6254903717967048026L ^ 6254903717967048026L);
                                            var4_2 += 5;
                                            continue;
                                        }
                                        (Integer.rotateRight(228961814 ^ var2_3, 4) - -1418873883) * 228961815;
                                        var3_4 = -1938871350 + var2_3 ^ 230283512 ^ 230283512;
                                        Integer.rotateRight(1519712910 ^ var2_3, 14) - -60295571;
                                        var3_4 = -1284248517 + var2_3 + -770873989 - -770873989;
                                        var4_2 -= 5;
                                        continue;
                                    }
                                    Integer.rotateLeft(2007935168 ^ var2_3, 17) + -2105274757;
                                    var3_4 = Integer.reverse(Integer.reverse(-1617739889 + var2_3));
                                    (Integer.rotateLeft(-1084333935 ^ var2_3, 10) + 818630858) * -1084333935;
                                    (int)(9073854588042668879L ^ (long)var2_3 ^ 6928932175169017352L);
                                    var3_4 = (int)((long)(-1284248517 + var2_3) ^ -213556534041718645L ^ -213556534041718645L);
                                    ++var4_2;
                                    continue;
                                }
                                (Integer.rotateRight(651400882 ^ var2_3, 7) + -1208164663) * 651400883;
                                var3_4 = -1284248517 + var2_3;
                                var4_2 += 4;
                                continue;
                            }
                            Integer.rotateLeft(-1202521656 ^ var2_3, 10) + 1449778803;
                            try {
                                var3_4 = (int)((long)(-1284248517 + var2_3) ^ 5839052018075445562L ^ 5839052018075445562L);
                            }
                            catch (UnsupportedOperationException v0) {
                                var3_4 = Integer.reverse(Integer.reverse(-1284248517 + var2_3));
                            }
                            var4_2 += 3;
                            continue;
                        }
                        Integer.rotateRight(-1554103898 ^ var2_3, 7) - -859336107;
                        try {
                            if ((-3277974816346938845L ^ (long)var2_3 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            var3_4 = -1284248517 + var2_3;
                        }
                        catch (NoSuchElementException v1) {
                            var3_4 = -1284248517 + var2_3 ^ -2118527502 ^ -2118527502;
                        }
                        var4_2 += 4;
                        continue;
                    }
                    (Integer.rotateLeft(1739405533 ^ var2_3, 15) - -1839758850) * 1739405533;
                    (int)(-6548349443688305841L ^ (long)var2_3 ^ -3409080769459984402L);
                    var3_4 = Integer.reverse(Integer.reverse(2063267082 + var2_3));
                    (Integer.rotateLeft(1497982076 ^ var2_3, 14) - -733951425) * 1497982077;
                    (int)(1701885298329727467L ^ (long)var2_3 ^ 7071234695571276525L);
                    var3_4 = (int)((long)(-1284248517 + var2_3) ^ -1178274448811428477L ^ -1178274448811428477L);
                    var4_2 -= 5;
                    continue;
                }
                (Integer.rotateRight(-261881921 ^ var2_3, 17) - 544839516) * -261881921;
                var3_4 = -1325942314 + var2_3;
                (Integer.rotateRight(90785918 ^ var2_3, 3) - -1407359363) * 90785919;
                (int)(6444863940627029479L ^ (long)var2_3 ^ 9099471555828195120L);
                var3_4 = -1284248517 + var2_3 + 1857075638 - 1857075638;
                continue;
            }
            (Integer.rotateLeft(-368674567 ^ var2_3, 16) + 1529234786) * -368674567;
            (int)(2933205395295234895L ^ (long)var2_3 ^ 5834557465718029496L);
            var3_4 = 1918997898 + var2_3 ^ 387236112 ^ 387236112;
            Integer.rotateRight(-1237188474 ^ var2_3, 9) - 375107445;
            var3_4 = (int)((long)(-1284248517 + var2_3) ^ 4746884600225068178L ^ 4746884600225068178L);
            continue;
lbl179:
            // 8 sources

            (Integer.rotateLeft(-321337063 ^ var2_3, 16) + -1298269886) * -321337063;
            (int)(3344599078260763471L ^ (long)var2_3 ^ 3690844043089670405L);
            var3_4 = -1284248517 + var2_3 + 1166696250 - 1166696250;
        }
    }

    @Generated
    public void sdhdh(boolean bl) {
        int n = -1849959999;
        int n2 = (n = Integer.rotateLeft(n * -537138285, 4) ^ 0xDB22139C) ^ 0xB3F0F389;
        if ((n2 ^ n) != -1276054647) {
            int cfr_ignored_0 = (0x224B2A48 ^ n) - 197102995;
        }
        this.sssh_2 = bl;
    }

    @Generated
    public void drh(String string) {
        int n = 1496840906;
        n = Integer.rotateLeft(n * 1263330989, 26) ^ 0x646981B2;
        n = System.identityHashCode(this) ^ n;
        String string2 = string;
        n = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 24);
        int n2 = n ^ 0x4BAEAC08;
        if ((n2 ^ n) != 1269738504) {
            int cfr_ignored_0 = (0x129956C2 ^ n) - 305725114;
        }
        this.sha_3 = string;
    }

    @Generated
    public void bbk(List list) {
        int n = tzsh.zly(2046840619);
        List list2 = list;
        n = Integer.rotateLeft((list2 != null ? System.identityHashCode(list2) : 0) ^ n, 11);
        int n2 = n ^ 0xC7EAB9DE;
        if ((n2 ^ n) != -940918306) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xBDEAF6F5 ^ n, 10) - 64063206) * -1108674827;
            int cfr_ignored_1 = (int)(0x7F5858C827D4EB4FL ^ (long)n ^ 0x4CE0831A2DB95361L);
        }
        this.zkha_2 = list;
    }

    @Override
    public boolean shzr() {
        block0: {
            int n = 2118133518;
            n = Integer.rotateLeft(n * -1867990503, 8) ^ 0x72F27E9;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 18);
            int n2 = n ^ 0xB1B9629C;
            if ((n2 ^ n) == -1313250660) break block0;
            int cfr_ignored_0 = (0xCFF94592 ^ n) + 1171978919;
        }
        return this.dhdq_2;
    }

    @Override
    public void thshdh(boolean bl) {
        int n = 979083301;
        n = Integer.rotateLeft(n * -236007295, 17) ^ 0x808F4C01;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 25);
        int n2 = (n = bl ^ n) ^ 0xF69220CA;
        if ((n2 ^ n) != -158195510) {
            int cfr_ignored_0 = (0xCCC980EF ^ n) + 522351448;
        }
        this.dhdq_2 = bl;
    }

    private static String dlkh_2(String string) {
        try {
            int n = 1905658067;
            n = Integer.rotateLeft(n * -1316698689, 3) ^ 0x8BF66C30;
            int n2 = n ^ 0x5629034;
            if ((n2 ^ n) != 90345524) {
                int cfr_ignored_0 = (0x74F498E7 ^ n) - -1391976659;
            }
            if ((0x24F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (string == null) {
            return string;
        }
        if (string.length() < 2) {
            return string;
        }
        if (string.charAt(0) != (0x6874477E ^ 0x6874671D)) {
            return string;
        }
        int n = string.charAt(1) - (-1730090032 - -1730147888);
        if (n < 0 || n > -1133828306 + 1133828561) {
            return string;
        }
        int n3 = string.length() - 2;
        if ((n3 & 1) != 0) {
            return string;
        }
        int n4 = n3 >> 1;
        char[] cArray = new char[n4];
        for (int i = 0; i < n4; ++i) {
            int n5 = 2 + (i << 1);
            int n6 = string.charAt(n5) - (Integer.reverse(-1065173319) ^ 0x9D7DA103);
            int n7 = string.charAt(n5 + 1) - (Integer.reverse(-1823144594) ^ 0x76A04BC9);
            int n8 = (n6 & 508285529 - 508285274) << Integer.rotateLeft(0xA6A9F611 ^ 0xA2A9F611, 9) | n7 & -1846631853 + 1846632108;
            int n9 = (n * (-1070541782 - -1070541913) ^ i * Integer.rotateLeft(0xAC4144B0 ^ 0xAC414C30, 25) ^ -1957278193 - -1957302494) & (Integer.reverse(1328541864) ^ 0x150F0B0D);
            cArray[i] = n8 ^ n9;
        }
        return new String(cArray);
    }

    private static String tdl_4(String string) {
        try {
            int n = -213164795;
            n = Integer.rotateLeft(n * 263857949, 25) ^ 0xAB755693;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 20);
            int n2 = n ^ 0x82A224AB;
            if ((n2 ^ n) != -2103302997) {
                int cfr_ignored_0 = (0x71E979AE ^ n) + -970236495;
            }
            if ((0x1D6 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        String string3 = bnq.dlkh_2(string);
        int n = string3.indexOf(0);
        if (n >= 0) {
            return string3.substring(0, n);
        }
        return string3;
    }

    private static bzw tdj_3(String string, bzw bzw2) {
        String string2;
        int n;
        int n2 = -715792160;
        n2 = Integer.rotateLeft(n2 * 2098739125, 4) ^ 0x4E12F05E;
        bzw bzw3 = bzw2;
        n2 = Integer.rotateLeft((bzw3 != null ? System.identityHashCode((Object)bzw3) : 0) ^ n2, 26);
        int n3 = n2 ^ 0x765371A6;
        if ((n3 ^ n2) != 1985180070) {
            int cfr_ignored_0 = (0xA3069146 ^ n2) - -1127600937;
        }
        if ((n = (string2 = bnq.dlkh_2(string)).indexOf(0)) >= 0) {
            int n4 = string2.length() - 1;
            if (n < n4) {
                return bzw.valueOf(string2.substring(n + 1));
            }
        } else {
            return bzw2;
        }
        return bzw2;
    }

    private static String zddh_3(String string, int n, int n2, int n3) {
        try {
            int n4 = 1951374880;
            n4 = Integer.rotateLeft(n4 * 506402511, 6) ^ 0xBD50C743;
            String string2 = string;
            n4 = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 25);
            n4 = Integer.rotateRight(n ^ n4, 22);
            int n5 = n4 ^ 0xB7E232BA;
            if ((n5 ^ n4) != -1209912646) {
                int cfr_ignored_0 = (0xC3ADAC9A ^ n4) + 1811763200;
            }
            if ((0x237 & 0) != 0) {
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
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0xEBE5E1AD) + i ^ ththh, 12) ^ n2 + zt));
        }
        return new String(cArray);
    }

    private static void rghsh() {
        int n = tzsh.zly(1140526574);
        int n2 = n ^ 0xF5AFB6FF;
        if ((n2 ^ n) != -173033729) {
            int cfr_ignored_0 = (Integer.rotateLeft(0xB654BB11 ^ n, 9) + 413156938) * -1235961071;
            int cfr_ignored_1 = (int)(0x74E6152C27D4EB4FL ^ (long)n ^ 0xD728831A2DB9441DL);
        }
        yf.athz_2();
    }

    private static void khhq(bnq bnq2, boolean bl, boolean bl2) {
        int n = 68625017;
        n = Integer.rotateLeft(n * -1939444803, 3) ^ 0x34246041;
        n = Integer.rotateRight(bl ^ n, 14);
        int n2 = (n = Integer.rotateRight(bl2 ^ n, 2)) ^ 0xE5CAB125;
        if ((n2 ^ n) != -439701211) {
            int cfr_ignored_0 = (0xE1DD935C ^ n) - -2048117769;
        }
        bnq2.dhaq(bl, bl2);
    }

    private static void khksh(bnq bnq2, boolean bl, boolean bl2) {
        int n = tzsh.zly(-1313829329);
        bnq bnq3 = bnq2;
        n = (bnq3 != null ? System.identityHashCode(bnq3) : 0) ^ n;
        int n2 = (n = bl ^ n) ^ 0x1EBB2594;
        if ((n2 ^ n) != 515581332) {
            int cfr_ignored_0 = (Integer.rotateRight(0xAF0BABBB ^ n, 8) + 919038688) * -1358189637;
        }
        bnq2.dhaq(bl, bl2);
    }

    private static void baq_2(bnq bnq2, boolean bl, boolean bl2) {
        int n = 1445840957;
        n = Integer.rotateLeft(n * -976651089, 13) ^ 0xDB6FCAF6;
        bnq bnq3 = bnq2;
        n = Integer.rotateLeft((bnq3 != null ? System.identityHashCode(bnq3) : 0) ^ n, 3);
        int n2 = (n = bl2 ^ n) ^ 0x7CA739AA;
        if ((n2 ^ n) != 2091334058) {
            int cfr_ignored_0 = (0x2A8AF197 ^ n) + -437553217;
        }
        bnq2.dhaq(bl, bl2);
    }

    private static boolean khqr() {
        block0: {
            int n = tzsh.zly(-832261988);
            int n2 = n ^ 0x28571B43;
            if ((n2 ^ n) == 676797251) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xE633ABDF ^ n, 15) - -459313348) * -432821281;
        }
        return yf.khdha_2();
    }

    private static dht_6 tghm(Moondlc moondlc) {
        block0: {
            int n = tzsh.zly(-1814450661);
            int n2 = n ^ 0x173B5B3;
            if ((n2 ^ n) == 24360371) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x92AA1BA8 ^ n, 5) + -956893037;
        }
        return moondlc.getEventManager();
    }

    private static int ghrz_2(int n, int n2) {
        block0: {
            int n3 = -489269912;
            n3 = Integer.rotateLeft(n3 * 487399747, 11) ^ 0x287DDFFD;
            int n4 = (n3 = n ^ n3) ^ 0x6D7C2241;
            if ((n4 ^ n3) == 1836851777) break block0;
            int cfr_ignored_0 = (0x8FAA7729 ^ n3) - 1977641784;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String zsn_3(String string, int n, int n2, int n3) {
        block0: {
            int n4 = -1837101165;
            n4 = Integer.rotateLeft(n4 * -158272513, 5) ^ 0x2A688EAF;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 25);
            int n5 = (n4 = Integer.rotateRight(n3 ^ n4, 24)) ^ 0xFB11AB36;
            if ((n5 ^ n4) == -82728138) break block0;
            int cfr_ignored_0 = (0x6991A4A5 ^ n4) - 1636562285;
        }
        return bnq.zddh_3(string, n, n2, n3);
    }

    private static String ththq(String string) {
        block0: {
            int n = -1539796614;
            int n2 = (n = Integer.rotateLeft(n * -642672399, 3) ^ 0xFD32C261) ^ 0x2E4C5849;
            if ((n2 ^ n) == 776755273) break block0;
            int cfr_ignored_0 = (0x8A74C933 ^ n) + -1391439772;
        }
        return tr_2.ttq_3(string);
    }

    private static void bshq(bhth_2 bhth2, qk qk2, String string) {
        int n = -198198384;
        n = Integer.rotateLeft(n * 1792100451, 13) ^ 0xA2DC5024;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 3);
        int n2 = n ^ 0xE76FFDC4;
        if ((n2 ^ n) != -412090940) {
            int cfr_ignored_0 = (0x13404654 ^ n) + 2047891789;
        }
        bhth2.khdhz_2(qk2, string);
    }

    private static void tath_2(bnq bnq2) {
        int n = tzsh.zly(1241623989);
        bnq bnq3 = bnq2;
        n = (bnq3 != null ? System.identityHashCode(bnq3) : 0) ^ n;
        int n2 = n ^ 0xF20A77FF;
        if ((n2 ^ n) != -234194945) {
            int cfr_ignored_0 = Integer.rotateRight(0xB80BDA4A ^ n, 10) + 1305284145;
        }
        bnq2.nt();
    }

    private static bhth_2 zaw_3(Moondlc moondlc) {
        block0: {
            int n = -1938525391;
            n = Integer.rotateLeft(n * 1026473533, 19) ^ 0x73EF66A;
            Moondlc moondlc2 = moondlc;
            n = Integer.rotateLeft((moondlc2 != null ? System.identityHashCode(moondlc2) : 0) ^ n, 20);
            int n2 = n ^ 0xEFB99015;
            if ((n2 ^ n) == -273051627) break block0;
            int cfr_ignored_0 = (0x63CDE324 ^ n) + -234591026;
        }
        return moondlc.getNotificationManager();
    }

    private static int stl_4(int n, int n2) {
        block0: {
            int n3 = 289107234;
            n3 = Integer.rotateLeft(n3 * 601793663, 20) ^ 0x7BAEA46E;
            n3 = n ^ n3;
            int n4 = (n3 = n2 ^ n3) ^ 0x1D4F662C;
            if ((n4 ^ n3) == 491742764) break block0;
            int cfr_ignored_0 = (0xC740B0E ^ n3) + 1758409628;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String ghta(String string, int n, int n2, int n3) {
        block0: {
            int n4 = tzsh.zly(173310306);
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = n ^ n4) ^ 0x1A949FF6;
            if ((n5 ^ n4) == 445947894) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x10C01E94 ^ n4, 5) - 195121959) * 281026197;
        }
        return bnq.zddh_3(string, n, n2, n3);
    }

    private static String khja_2(String string) {
        block0: {
            int n = -1664864157;
            n = Integer.rotateLeft(n * 1219261949, 3) ^ 0xF9100803;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 16);
            int n2 = n ^ 0xC0E07888;
            if ((n2 ^ n) == -1059030904) break block0;
            int cfr_ignored_0 = (0x5C2448EB ^ n) + -1554602523;
        }
        return tr_2.ttq_3(string);
    }

    private static tdhf stgh_2() {
        block0: {
            int n = tzsh.zly(-1905037378);
            int n2 = n ^ 0x217A2AB6;
            if ((n2 ^ n) == 561654454) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xAF094508 ^ n, 8) + 914160435;
        }
        return tr_2.hqs();
    }

    private static String byw(bnq bnq2) {
        block0: {
            int n = tzsh.zly(-565360453);
            bnq bnq3 = bnq2;
            n = Integer.rotateLeft((bnq3 != null ? System.identityHashCode(bnq3) : 0) ^ n, 22);
            int n2 = n ^ 0xFA2C8BE;
            if ((n2 ^ n) == 262326462) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xD1EF8005 ^ n, 13) - 1885216726;
            int cfr_ignored_1 = (int)(0x135D2E3827D4EB4FL ^ (long)n ^ 0xA100831A2DB98B6BL);
        }
        return bnq2.getName();
    }

    private static int aza_4(int n, int n2) {
        block0: {
            int n3 = -133244903;
            n3 = Integer.rotateLeft(n3 * -904415019, 7) ^ 0x86CCDCDF;
            n3 = Integer.rotateLeft(n ^ n3, 22);
            int n4 = (n3 = n2 ^ n3) ^ 0x3011B399;
            if ((n4 ^ n3) == 806466457) break block0;
            int cfr_ignored_0 = (0xC81F6B80 ^ n3) - 345532214;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static String zsth_2(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 1657383423;
            n4 = Integer.rotateLeft(n4 * 1192959109, 26) ^ 0xD7978388;
            String string2 = string;
            n4 = Integer.rotateLeft((string2 != null ? System.identityHashCode(string2) : 0) ^ n4, 6);
            int n5 = (n4 = Integer.rotateLeft(n ^ n4, 13)) ^ 0xAA33D5BA;
            if ((n5 ^ n4) == -1439443526) break block0;
            int cfr_ignored_0 = (0xC8FA7C45 ^ n4) + -1693516838;
        }
        return bnq.zddh_3(string, n, n2, n3);
    }

    private static String zsw(String string, int n, int n2, int n3) {
        block0: {
            int n4 = 437117622;
            n4 = Integer.rotateLeft(n4 * 476122761, 22) ^ 0xE68B9067;
            String string2 = string;
            n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
            int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 4)) ^ 0xA4967A5D;
            if ((n5 ^ n4) == -1533642147) break block0;
            int cfr_ignored_0 = (0xBE9B98EB ^ n4) - -329531223;
        }
        return bnq.zddh_3(string, n, n2, n3);
    }

    private static String khthf(String string, CharSequence charSequence, CharSequence charSequence2) {
        block0: {
            int n = tzsh.zly(-368794301);
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 6);
            int n2 = n ^ 0x83425CF8;
            if ((n2 ^ n) == -2092802824) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x6946F9BB ^ n, 16) + -1007297312) * 1766259131;
        }
        return string.replace(charSequence, charSequence2);
    }

    private static boolean thdh() {
        block0: {
            int n = tzsh.zly(-1928016940);
            int n2 = n ^ 0x2A66107F;
            if ((n2 ^ n) == 711331967) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xA772DBAB ^ n, 7) + 1262893296;
        }
        return yf.khdha_2();
    }

    private static void zha_2() {
        int n = -653772124;
        int n2 = (n = Integer.rotateLeft(n * 1719621633, 10) ^ 0x3E7FF7B8) ^ 0xA298D549;
        if ((n2 ^ n) != -1567042231) {
            int cfr_ignored_0 = (0x7B90EFED ^ n) - 800805416;
        }
        yf.athz_2();
    }

    private static String[] hak_2(String string) {
        block0: {
            int n = -2067769736;
            n = Integer.rotateLeft(n * -714612759, 6) ^ 0xE33CD4CB;
            String string2 = string;
            n = (string2 != null ? System.identityHashCode(string2) : 0) ^ n;
            int n2 = n ^ 0xE4685B74;
            if ((n2 ^ n) == -462922892) break block0;
            int cfr_ignored_0 = (0x60A80D0C ^ n) - 1894879770;
        }
        return string.split("\u0005\u001b", -1);
    }

    private static CallSite rth_3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 540454001;
            n3 = Integer.rotateLeft(n3 * -1041445907, 21) ^ 0x9BBC82A6;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateLeft((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 27);
            int n4 = n3 ^ 0x228296AD;
            if ((n4 ^ n3) != 578983597) {
                int cfr_ignored_0 = (0x2B43ADC ^ n3) - 1764892214;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ hdz_4 ^ string.hashCode()) + (n2 + hhh_4) + i ^ hdz_4, 13) + hhh_4);
            }
            String[] stringArray = bnq.hak_2(new String(cArray));
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

    private static String[] euac73uddw(String string) {
        return string.split("\u0005\u0015", -1);
    }

    private static CallSite ee32156fmq51(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ d1yrgrmvo52h ^ string.hashCode() ^ n2 + dargd944u + i * -843004377) + d1yrgrmvo52h) ^ dargd944u));
            }
            String[] stringArray = bnq.euac73uddw(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

