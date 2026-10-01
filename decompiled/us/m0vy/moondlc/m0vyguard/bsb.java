/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.byh;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tshkh;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.tr_2;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.fa_2;

public interface bsb
extends tshkh,
tthy,
byh,
hy {
    public void tskh_3();

    public void bsy();

    public void ncK();

    public tq_2 hsdh_2();

    public String getName();

    default public String zhz() {
        String string;
        String string2 = "modules.descriptions.%s".formatted(this.getName().toLowerCase().replace(" ", "_"));
        if (!string2.equals(string = tr_2.ttq_3(string2)) && !string.isBlank()) {
            return string;
        }
        tq_2 tq2 = this.hsdh_2();
        if (tq2 != null && !bsb.dlkh_2(tq2.desc()).isBlank()) {
            return bsb.dlkh_2(tq2.desc());
        }
        return "No description available";
    }

    public int thaf();

    default public int zshsh_2() {
        return this.thaf();
    }

    default public boolean jmr() {
        return this.thaf() != -1 && this.thaf() != 0;
    }

    public bzw dkb();

    public boolean rgha_2();

    public boolean dsd_4();

    public fa_2 hdw();

    public void zhs_5(int var1);

    public void dhaq(boolean var1, boolean var2);

    default public void tba(boolean bl) {
        this.dhaq(bl, true);
    }

    default public boolean shzr() {
        return false;
    }

    default public void thshdh(boolean bl) {
    }

    public static String dlkh_2(String string) {
        if (string == null) {
            return string;
        }
        if (string.length() < 2) {
            return string;
        }
        if (string.charAt(0) != '⁣') {
            return string;
        }
        int n = string.charAt(1) - 57856;
        if (n < 0 || n > 255) {
            return string;
        }
        int n2 = string.length() - 2;
        if ((n2 & 1) != 0) {
            return string;
        }
        int n3 = n2 >> 1;
        char[] cArray = new char[n3];
        for (int i = 0; i < n3; ++i) {
            int n4 = 2 + (i << 1);
            int n5 = string.charAt(n4) - 57344;
            int n6 = string.charAt(n4 + 1) - 57600;
            int n7 = (n5 & 0xFF) << 8 | n6 & 0xFF;
            int n8 = (n * 131 ^ i * 17 ^ 0x5EED) & 0xFFFF;
            cArray[i] = n7 ^ n8;
        }
        return new String(cArray);
    }
}

