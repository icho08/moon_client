/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_239
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_3966
 *  net.minecraft.class_9779
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3966;
import net.minecraft.class_9779;
import us.m0vy.moondlc.m0vyguard.btz_2;
import us.m0vy.moondlc.m0vyguard.bjd;
import us.m0vy.moondlc.m0vyguard.bjz;
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.tdhz_2;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.m0vy.moondlc.m0vyguard.ngh;

public abstract class tzth
implements dl {
    public static final bjz thdhs_2;
    public static final bjz ls_2;
    public static class_1309 sbh_2;
    public float sths_4 = 0.0f;
    public float khkkh = 0.0f;
    public static float zdk;
    public static float tkht_2;
    private static double hght_2;
    private static double jkt;
    private static double thhf_2;
    private static double dkhl;
    private static double dfs_2;
    private static double dhzn_2;
    private static final int k1f446rq7nx = 1598919053;
    private static final int vo17bko2l445 = -289417349;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int v06deefm;

    public float dhsht(float f) {
        block0: {
            int n = 1685705735;
            n = Integer.rotateLeft(n * 1954865843, 19) ^ 0x2A5808D4;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x53667CAD;
            if ((n2 ^ n) == 1399225517) break block0;
            int cfr_ignored_0 = (0x371FA8AA ^ n) + 658266467;
        }
        return class_3532.method_16439((float)f, (float)tkht_2, (float)zdk);
    }

    private class_1309 hkhdh() {
        if (tdhz_2.trb().zz_4().shzl()) {
            class_1297 class_12972;
            class_3966 class_39662;
            class_239 class_2392;
            if (tzth.mc.field_1687 != null && (class_2392 = tzth.mc.field_1765) instanceof class_3966 && (class_39662 = (class_3966)class_2392).method_17783() == class_239.class_240.field_1331 && (class_12972 = class_39662.method_17782()) instanceof class_1309) {
                class_2392 = (class_1309)class_12972;
                return class_2392;
            }
            return null;
        }
        return bjd.shfn();
    }

    public void ssd_2() {
        class_1309 class_13092 = this.hkhdh();
        if (class_13092 != null) {
            sbh_2 = class_13092;
        }
    }

    public class_1309 dhagh_2() {
        return sbh_2;
    }

    public float ghsht() {
        block0: {
            int n = 651235110;
            n = Integer.rotateLeft(n * 786687003, 10) ^ 0xD6490280;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x10F6DD53;
            if ((n2 ^ n) == 284613971) break block0;
            int cfr_ignored_0 = (0x3627D275 ^ n) + 1770621437;
        }
        return (float)thdhs_2.khbk();
    }

    public class_243 thnz_2(class_1309 class_13092) {
        int n = 81874425;
        n = Integer.rotateLeft(n * 1999161945, 8) ^ 0xDB301C3E;
        n = System.identityHashCode(this) ^ n;
        class_1309 class_13093 = class_13092;
        n = Integer.rotateLeft((class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n, 6);
        int n2 = n ^ 0x3B866478;
        if ((n2 ^ n) != 998663288) {
            int cfr_ignored_0 = (0x3F672981 ^ n) - -1966089199;
        }
        float f = tzth.dhdq_2(mc).method_60637(false);
        double d = ngh.dhsth(class_13092.field_6014, tzth.jhq(class_13092), f);
        double d2 = ngh.dhsth(class_13092.field_6036, class_13092.method_23318(), f);
        double d3 = ngh.dhsth(class_13092.field_5969, class_13092.method_23321(), f);
        return new class_243(d, d2, d3);
    }

    public void ssa_7(long l, String string, float f, float f2, float f3) {
        this.sths_4 = (float)thdhs_2.khbk();
        this.khkkh = (float)ls_2.khbk();
        ls_2.ddhdh();
        double d = switch (string) {
            case "In" -> f2;
            case "Out" -> f3;
            default -> f;
        };
        ls_2.shd_6(this.taj_2() ? (double)f : d, l, tbm.hrkh);
        thdhs_2.ddhdh();
        thdhs_2.shd_6(this.taj_2() ? 1.0 : 0.0, l, tbm.hrkh);
    }

    public boolean taj_2() {
        int n = 1330102139;
        n = Integer.rotateLeft(n * 1726860899, 11) ^ 0x89CC5F3C;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 5);
        int n2 = n ^ 0x1FB90ED9;
        if ((n2 ^ n) != 532221657) {
            int cfr_ignored_0 = (0x50FEB1A2 ^ n) + 1768031962;
        }
        if (tzth.dhdk().zz_4().shzl()) {
            class_3966 class_39662;
            class_239 class_2392;
            if (tzth.mc.field_1687 != null && (class_2392 = tzth.mc.field_1765) instanceof class_3966 && (class_39662 = (class_3966)class_2392).method_17783() == class_239.class_240.field_1331) {
                return class_39662.method_17782() instanceof class_1309;
            }
            return false;
        }
        return tzth.zdw_2() != null;
    }

    public boolean ssn_3() {
        if (tzth.mc.field_1724 == null || tzth.mc.field_1687 == null) {
            return false;
        }
        return thdhs_2.khbk() > 0.0;
    }

    public boolean dqkh() {
        block0: {
            int n = 1177648644;
            n = Integer.rotateLeft(n * -244560981, 9) ^ 0x935C9781;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xE28273A8;
            if ((n2 ^ n) == -494767192) break block0;
            int cfr_ignored_0 = (0xA4B30DAC ^ n) - -598156877;
        }
        return false;
    }

    public static void ghthj() {
        boolean bl;
        float f = (float)thdhs_2.khbk();
        float f2 = (float)thdhs_2.dthdh();
        boolean bl2 = tdhz_2.trb().khda_2.shzl();
        boolean bl3 = bl = bl2 && (double)f2 == 0.0 && f <= 0.9f;
        if (sbh_2 != null && !bl) {
            dkhl = ngh.hht_3((float)tzth.sbh_2.field_6014, (float)sbh_2.method_23317());
            dfs_2 = ngh.hht_3((float)tzth.sbh_2.field_6036, (float)sbh_2.method_23318());
            dhzn_2 = ngh.hht_3((float)tzth.sbh_2.field_5969, (float)sbh_2.method_23321());
        }
        hght_2 = dkhl;
        jkt = dfs_2;
        thhf_2 = dhzn_2;
        tkht_2 = zdk;
        boolean bl4 = tzth.mc.field_1724 != null && !tzth.mc.field_1724.method_24828() && !tzth.mc.field_1724.method_6101() && !tzth.mc.field_1724.method_5681();
        float f3 = bl4 ? 1.15f : 1.0f;
        zdk = class_3532.method_16439((float)0.1f, (float)zdk, (float)f3);
    }

    public abstract void ththd();

    public abstract void ht_2(shw_3 var1);

    @Generated
    public static double shkdh() {
        return hght_2;
    }

    @Generated
    public static double ghtb_2() {
        return jkt;
    }

    @Generated
    public static double qn() {
        return thhf_2;
    }

    private static class_9779 dhdq_2(class_310 class_3102) {
        block0: {
            int n = btz_2.jzq_2(-89190626);
            class_310 class_3103 = class_3102;
            n = (class_3103 != null ? System.identityHashCode(class_3103) : 0) ^ n;
            int n2 = n ^ 0x62D9C85C;
            if ((n2 ^ n) == 1658439772) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x9876C742 ^ n, 6) + 2059386937;
        }
        return class_3102.method_61966();
    }

    private static double jhq(class_1309 class_13092) {
        block0: {
            int n = btz_2.jzq_2(212726238);
            class_1309 class_13093 = class_13092;
            n = (class_13093 != null ? System.identityHashCode(class_13093) : 0) ^ n;
            int n2 = n ^ 0x407BA9E;
            if ((n2 ^ n) == 67615390) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x8AA4B40 ^ n, 4) + 284998651;
        }
        return class_13092.method_23317();
    }

    private static tdhz_2 dhdk() {
        block0: {
            int n = btz_2.jzq_2(1833347947);
            int n2 = n ^ 0x16BE06EE;
            if ((n2 ^ n) == 381552366) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x7BF8AD85 ^ n, 18) - 125477462;
            int cfr_ignored_1 = (int)(0xB94A03B827D4EB4FL ^ (long)n ^ 0xFA00831A2DB8DF45L);
        }
        return tdhz_2.trb();
    }

    private static class_1309 zdw_2() {
        block0: {
            int n = 448325753;
            int n2 = (n = Integer.rotateLeft(n * 2018695827, 3) ^ 0x7D23FE20) ^ 0x74FD4DE0;
            if ((n2 ^ n) == 1962757600) break block0;
            int cfr_ignored_0 = (0x6E45A599 ^ n) + 113101935;
        }
        return bjd.shfn();
    }

    private static String[] mjq27d6hpt(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite clgf5axmppz(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ k1f446rq7nx ^ string.hashCode() ^ n2 + vo17bko2l445 ^ i * -753830599 ^ k1f446rq7nx, 15) ^ vo17bko2l445));
            }
            String[] stringArray = tzth.mjq27d6hpt(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

