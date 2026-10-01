/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tzq;
import us.m0vy.moondlc.m0vyguard.khd;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.ghr;
import us.m0vy.moondlc.m0vyguard.fy;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Stream Spoof", category=bzw.OTHER, desc="Hides the Minecraft window from supported capture APIs")
public class taz_2
extends bnq {
    private final khd dhghy = new khd(this, "Capture Mode");
    private final fy wh = new fy(this.dhghy, "Blackout").rhh_3();
    private final fy jlz = new fy(this.dhghy, "Exclude");
    private final fy swdh = new fy(this.dhghy, "Clean Game");
    private boolean shb;
    private String thshw = "";
    private final bql<btt> jbr = this::tshf;
    private static final int hghr = 1072857178;
    private static final int jtth = 2037826474;
    private static final int shdhz = 16370857;
    private static final int jyl = 1436792337;
    private static final int l47hvdhn4t5 = 1552740722;
    private static final int ebbia4zqwed = -1952529005;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int n7796zjpiiwr;

    @Override
    public void nt() {
        int n = -285088762;
        n = Integer.rotateLeft(n * -373620465, 8) ^ 0x6064A767;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x858C627F;
        if ((n2 ^ n) != -2054397313) {
            int cfr_ignored_0 = (0x6A8D8679 ^ n) - 58219559;
        }
        taz_2.shy(this);
    }

    @Override
    public void nc() {
        try {
            int n = 1995346921;
            n = Integer.rotateLeft(n * 1761032957, 7) ^ 0x9DB00F86;
            int n2 = n ^ 0x80F19E98;
            if ((n2 ^ n) != -2131648872) {
                int cfr_ignored_0 = (0xF61F0D71 ^ n) + 1294791038;
            }
            if ((0x284 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        ghr.tbd_3();
        btd_2.dnr_2();
        this.shb = false;
        this.thshw = "";
    }

    public boolean zbz_2() {
        try {
            int n = -284896733;
            n = Integer.rotateLeft(n * -976295011, 15) ^ 0x903CAA7;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x36F53574;
            if ((n2 ^ n) != 922039668) {
                int cfr_ignored_0 = (0xD9F1E757 ^ n) + 1595211902;
            }
            if ((0x122 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return this.rgha_2() && this.dhghy.skhth(this.swdh);
    }

    private void ssl() {
        int n = 1365510136;
        n = Integer.rotateLeft(n * -1283798657, 19) ^ 0xC08B53D;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xE69E8E6A;
        if ((n2 ^ n) != -425816470) {
            int cfr_ignored_0 = (0xB7FA8992 ^ n) + 1803243404;
        }
        if (this.dhghy.skhth(this.swdh)) {
            btd_2.dnr_2();
            this.shb = taz_2.bthdh();
            this.thshw = this.dhghy.sdh_2().getName();
            return;
        }
        this.shb = this.dhghy.skhth(this.wh) ? ghr.rry() : ghr.dwth_2();
        this.thshw = this.dhghy.sdh_2().getName();
    }

    private void tshf(btt btt2) {
        try {
            int n = -1886392732;
            n = Integer.rotateLeft(n * 1984403175, 11) ^ 0x9D604A69;
            n = System.identityHashCode(this) ^ n;
            btt btt3 = btt2;
            n = Integer.rotateLeft((btt3 != null ? System.identityHashCode(btt3) : 0) ^ n, 13);
            int n2 = n ^ 0xBD94ED95;
            if ((n2 ^ n) != -1114313323) {
                int cfr_ignored_0 = (0x321B03F1 ^ n) + -936313652;
            }
            if ((0x194 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (yf.dnkh()) {
            throw null;
        }
        String string = this.dhghy.sdh_2().getName();
        if (!this.shb || !this.thshw.equals(string)) {
            this.ssl();
        }
    }

    private static String ashm(String string, int n, int n2, int n3) {
        int n4 = -1030329374;
        n4 = Integer.rotateLeft(n4 * -1186180257, 3) ^ 0x29A8D9E4;
        n4 = n ^ n4;
        int n5 = (n4 = Integer.rotateRight(n2 ^ n4, 15)) ^ 0x8EA34B06;
        if ((n5 ^ n4) != -1901901050) {
            int cfr_ignored_0 = (0x4C3520E4 ^ n4) + -286291311;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ Integer.rotateLeft((n ^ n3 ^ 0x8825A789) + hghr ^ Integer.reverse(n2 + i * 1846842539), 15) - jtth);
        }
        return new String(cArray);
    }

    private static void shy(taz_2 taz2_2) {
        int n = tzq.sssh_2(375563641);
        taz_2 taz3_2 = taz2_2;
        n = (taz3_2 != null ? System.identityHashCode(taz3_2) : 0) ^ n;
        int n2 = n ^ 0x94257107;
        if ((n2 ^ n) != -1809485561) {
            int cfr_ignored_0 = (Integer.rotateRight(0x8247D47E ^ n, 3) - -888120707) * -2109221761;
        }
        taz2_2.ssl();
    }

    private static boolean bthdh() {
        block0: {
            int n = -344159329;
            int n2 = (n = Integer.rotateLeft(n * 1845816307, 7) ^ 0xA7AFF6E7) ^ 0x99714B44;
            if ((n2 ^ n) == -1720628412) break block0;
            int cfr_ignored_0 = (0x720DC0DB ^ n) + 230689897;
        }
        return ghr.dwth_2();
    }

    private static String[] zhz_6(String string) {
        block0: {
            int n = -378950433;
            int n2 = (n = Integer.rotateLeft(n * -1072014333, 12) ^ 0x8CCC07F) ^ 0x5BD6BA7D;
            if ((n2 ^ n) == 1540799101) break block0;
            int cfr_ignored_0 = (0xB2BF16A2 ^ n) + -1478954584;
        }
        return string.split("\u0007\u0014", -1);
    }

    private static CallSite jdhd_2(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 1241766550;
            n3 = Integer.rotateLeft(n3 * -1332629391, 19) ^ 0x428BE0E5;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = Integer.rotateLeft((lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3, 8);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 26);
            int n4 = n3 ^ 0xC1D57753;
            if ((n4 ^ n3) != -1042974893) {
                int cfr_ignored_0 = (0x8BD6ADC5 ^ n3) + -2078164157;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ shdhz ^ string.hashCode()) + (n2 + jyl) + i ^ shdhz, 15) + jyl);
            }
            String[] stringArray = taz_2.zhz_6(new String(cArray));
            int n5 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType3) : lookup.findVirtual(clazz, stringArray[2], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] rnojy61l(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite seeommdr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ l47hvdhn4t5 ^ string.hashCode()) + (n2 + ebbia4zqwed) + i ^ l47hvdhn4t5, 26) + ebbia4zqwed);
            }
            String[] stringArray = taz_2.rnojy61l(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[0], methodType2) : lookup.findVirtual(clazz, stringArray[0], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

