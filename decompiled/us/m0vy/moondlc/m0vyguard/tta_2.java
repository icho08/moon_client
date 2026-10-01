/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3532
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_3532;
import us.m0vy.moondlc.m0vyguard.bbgh;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.ghdh_3;
import us.m0vy.moondlc.m0vyguard.ht_3;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Dash", category=bzw.OTHER, desc="Charges a short timer dash while sneaking")
public final class tta_2
extends bnq {
    private static final int khqb = 20;
    private static final int hdz = 3;
    private static final float thhgh_2 = 4.5f;
    private static final byq dhth_3;
    private static final byq shbf;
    private static volatile float rdkh_2;
    private int tsz_4;
    private int hzz_3;
    private int zkz_2;
    private int tkn;
    private int zakh_2;
    private final bql<btt> shym = this::sbj;
    private final bql<bbgh> bmy = this::zbs_4;
    private static final int pweod4u01v = 2078005103;
    private static final int q2zbagy2ia5t8 = -887281727;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int xww89098gq;

    public static float ghdhq() {
        block0: {
            int n = -1486098412;
            int n2 = (n = Integer.rotateLeft(n * 644295413, 23) ^ 0x6B2218BF) ^ 0xA5E34B09;
            if ((n2 ^ n) == -1511830775) break block0;
            int cfr_ignored_0 = (0x288BB1D ^ n) - 502780411;
        }
        return rdkh_2;
    }

    private void dyq_2() {
        boolean bl;
        this.hzz_3 = this.tsz_4;
        this.tkn = this.zkz_2;
        if (tta_2.mc.field_1724 == null || tta_2.mc.field_1687 == null) {
            this.ayth();
            return;
        }
        if (tta_2.mc.field_1724.method_5715()) {
            if (this.tsz_4 == 0) {
                this.zakh_2 = 3;
            }
            if (this.tsz_4 < 20) {
                ++this.tsz_4;
            }
        } else if (this.tsz_4 > 0) {
            if (this.tsz_4 < 20) {
                float f = 1.0f - (float)this.zakh_2 / 3.0f;
                this.zkz_2 = Math.max(1, Math.round(20.0f * f));
            }
            this.tsz_4 = 0;
        }
        boolean bl2 = bl = this.zakh_2 > 0 && tta_2.mc.field_1724.method_5715();
        if (this.zakh_2 > 0) {
            --this.zakh_2;
        }
        if (this.zkz_2 > 0) {
            --this.zkz_2;
        }
        rdkh_2 = bl ? 0.22222222f : (this.zkz_2 > 0 ? 4.5f : 1.0f);
    }

    private void shsk(bbgh bbgh2) {
        if (tta_2.mc.field_1724 == null || tta_2.mc.field_1690.field_1842) {
            return;
        }
        float f = class_3532.method_15363((float)bbgh2.bhw(), (float)0.0f, (float)1.0f);
        float f2 = class_3532.method_48781((float)f, (int)this.hzz_3, (int)this.tsz_4);
        float f3 = class_3532.method_48781((float)f, (int)this.tkn, (int)this.zkz_2);
        if (f2 <= 0.001f && f3 <= 0.001f) {
            return;
        }
        ghdh_3 ghdh2 = bbgh2.dtn();
        float f4 = 70.0f;
        float f5 = 10.0f;
        float f6 = ((float)mc.method_22683().method_4486() - f4) * 0.5f;
        float f7 = (float)mc.method_22683().method_4502() * 0.25f - f5 * 0.5f;
        float f8 = class_3532.method_15363((float)(f2 / 20.0f), (float)0.0f, (float)1.0f);
        float f9 = class_3532.method_15363((float)(f3 / 20.0f), (float)0.0f, (float)1.0f);
        ghdh2.drawRect(f6, f7, f4 * f8, f5 * 0.5f, dhth_3);
        ghdh2.drawRect(f6, f7 + f5 * 0.5f, f4 * f9, f5 * 0.5f, dhth_3);
        ghdh2.drawRect(f6 - 1.0f, f7 - 1.0f, f4 + 2.0f, 1.0f, shbf);
        ghdh2.drawRect(f6 - 1.0f, f7 + f5, f4 + 2.0f, 1.0f, shbf);
        ghdh2.drawRect(f6 - 1.0f, f7, 1.0f, f5, shbf);
        ghdh2.drawRect(f6 + f4, f7, 1.0f, f5, shbf);
        ghdh2.drawRect(f6, f7 + f5 * 0.5f - 0.5f, f4, 1.0f, shbf);
    }

    @Override
    public void nt() {
        int n = -726596687;
        int n2 = (n = Integer.rotateLeft(n * 1924282773, 5) ^ 0x309FE24F) ^ 0xEB547177;
        if ((n2 ^ n) != -346787465) {
            int cfr_ignored_0 = (0x3FE572C6 ^ n) - -375960066;
        }
        this.ayth();
    }

    @Override
    public void nc() {
        int n = -865718191;
        n = Integer.rotateLeft(n * -1781759091, 22) ^ 0x977BA240;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 12);
        int n2 = n ^ 0xC597757E;
        if ((n2 ^ n) != -979929730) {
            int cfr_ignored_0 = (0x9F1452F ^ n) + -1931717718;
        }
        this.ayth();
    }

    private void ayth() {
        try {
            int n = -827946312;
            n = Integer.rotateLeft(n * 1998778501, 25) ^ 0x3F834787;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x9ECD24CD;
            if ((n2 ^ n) != -1630722867) {
                int cfr_ignored_0 = (0x506BAE75 ^ n) + 458065551;
            }
            if ((0x238 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!tta_2.zbj()) {
            tta_2.hwr();
        }
        this.tsz_4 = 0;
        this.hzz_3 = 0;
        this.zkz_2 = 0;
        this.tkn = 0;
        this.zakh_2 = 0;
        rdkh_2 = 1.0f;
    }

    private void zbs_4(bbgh bbgh2) {
        int n = -1676686969;
        int n2 = (n = Integer.rotateLeft(n * 1669197013, 17) ^ 0x51E4C6EB) ^ 0xB460DAF4;
        if ((n2 ^ n) != -1268720908) {
            int cfr_ignored_0 = (0x286F1373 ^ n) + -2131021532;
        }
        this.shsk(bbgh2);
    }

    private void sbj(btt btt2) {
        int n = -393674042;
        int n2 = (n = Integer.rotateLeft(n * -1812847411, 9) ^ 0xFEE17DBF) ^ 0xA44BD124;
        if ((n2 ^ n) != -1538535132) {
            int cfr_ignored_0 = (0x4CC2D3E2 ^ n) - 18694503;
        }
        this.dyq_2();
    }

    private static boolean zbj() {
        block0: {
            int n = ht_3.ghaj(-673264985);
            int n2 = n ^ 0x3FA66E96;
            if ((n2 ^ n) == 1067871894) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xE878A431 ^ n, 16) + 720994602) * -394746831;
            int cfr_ignored_1 = (int)(0x2ACA0A0C27D4EB4FL ^ (long)n ^ 0xE968831A2DB9F845L);
        }
        return yf.khdha_2();
    }

    private static void hwr() {
        int n = ht_3.ghaj(941172738);
        int n2 = n ^ 0x29E3B259;
        if ((n2 ^ n) != 702788185) {
            int cfr_ignored_0 = (Integer.rotateRight(0x11FA9A5B ^ n, 5) + 834031680) * 301636187;
        }
        yf.athz_2();
    }

    private static String[] ow8y1ehn8kvp(String string) {
        return string.split("\u0005\u0015", -1);
    }

    private static CallSite jh1rfdgf6sgm4h(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ pweod4u01v ^ string.hashCode() ^ n2 + q2zbagy2ia5t8 ^ i * 646072171 ^ pweod4u01v, 3) ^ q2zbagy2ia5t8));
            }
            String[] stringArray = tta_2.ow8y1ehn8kvp(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

