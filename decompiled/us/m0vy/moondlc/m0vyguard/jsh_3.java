/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_418
 */
package us.m0vy.moondlc.m0vyguard;

import net.minecraft.class_2561;
import net.minecraft.class_418;
import us.m0vy.moondlc.m0vyguard.btt;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;

@tq_2(name="Death Coords", category=bzw.OTHER, desc="Saves and displays your death coordinates in chat")
public class jsh_3
extends bnq {
    private double hdz_2;
    private double dkkh;
    private double khnr;
    private boolean shab = false;
    private final bql<btt> swt_2 = this::thk;
    private static final int sat_6 = -198900693;
    private static final int rty_2 = 1031013574;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int niyg8uu1vbtxz8;

    private void thk(btt btt2) {
        boolean bl;
        try {
            int n = 2136250968;
            n = Integer.rotateLeft(n * 389640069, 7) ^ 0x5400D967;
            int n2 = n ^ 0x9511E568;
            if ((n2 ^ n) != -1793989272) {
                int cfr_ignored_0 = (0xEA457F30 ^ n) - -317281941;
            }
            if ((0x3AF & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
        }
        if (jsh_3.mc.field_1724 == null) {
            return;
        }
        boolean bl2 = bl = jsh_3.mc.field_1724.method_6032() <= 0.0f || jsh_3.mc.field_1755 instanceof class_418;
        if (bl && !this.shab) {
            this.hdz_2 = jsh_3.mc.field_1724.method_23317();
            this.dkkh = jsh_3.mc.field_1724.method_23318();
            this.khnr = jsh_3.mc.field_1724.method_23321();
            this.shab = true;
        }
        if (!bl && this.shab && jsh_3.mc.field_1724.method_5805()) {
            jsh_3.mc.field_1724.method_7353((class_2561)class_2561.method_43470((String)String.format("\u00a7a[Moondlc] \u00a7fDeath coords: \u00a7e%d, %d, %d", (int)this.hdz_2, (int)this.dkkh, (int)this.khnr)), false);
            this.shab = false;
        }
    }

    private static String asb_2(String string, int n, int n2, int n3) {
        try {
            int n4 = -1021630309;
            n4 = Integer.rotateLeft(n4 * -1168925141, 13) ^ 0xB48E3A19;
            n4 = n2 ^ n4;
            int n5 = n4 ^ 0x27F582D;
            if ((n5 ^ n4) != 41900077) {
                int cfr_ignored_0 = (0xC16470B6 ^ n4) + 1068892009;
            }
            if ((0x3E1 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0xDB1328EF) + n2 ^ i * 439215827) ^ sat_6) + rty_2);
        }
        return new String(cArray);
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

