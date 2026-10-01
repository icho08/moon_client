/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  lombok.Generated
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import us.m0vy.moondlc.m0vyguard.bdn;
import us.m0vy.moondlc.m0vyguard.brz_2;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.bsh_2;
import us.m0vy.moondlc.m0vyguard.bza_4;
import us.m0vy.moondlc.m0vyguard.bmb;
import us.m0vy.moondlc.m0vyguard.tbb;
import us.m0vy.moondlc.m0vyguard.tbm;
import us.m0vy.moondlc.m0vyguard.tkhkh;
import us.m0vy.moondlc.m0vyguard.tdj;
import us.m0vy.moondlc.m0vyguard.jkh;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.s_3;
import us.m0vy.moondlc.m0vyguard.fa_2;
import us.m0vy.moondlc.m0vyguard.wh_2;

public abstract class thw_3
implements dl,
tkhkh {
    private static final float khhh_4 = 0.001f;
    private final tbm hkhz_2 = tbm.hrkh;
    private final long ds = 100L;
    private final fa_2 rath = new fa_2(300L, 0.0f, jkh.shhj);
    private final tbb thdht;
    private boolean dhmh_2;
    private final List khll = new ArrayList();
    private static final int h5f4fcu3y63rk = 621078332;
    private static final int ydatpu0k9ylpd = 1711482905;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int k23for3ej;

    protected thw_3(float f, float f2) {
        this.thdht = this.sshgh(f, f2, this.getName());
    }

    public abstract String getName();

    public List bhh() {
        if (this.khll.isEmpty() && this.thdht != null) {
            tdj tdj2 = new tdj("Widget Size", 0.6f, 1.5f, 0.05f, this.thdht.getScale(), "%.1f");
            tdj2.tyt_3(this::ayt_2);
            this.khll.add(tdj2);
        }
        return this.khll;
    }

    public void rght(bdn bdn2) {
        this.khll.add(bdn2);
    }

    public boolean tat_2() {
        return bza_4.thtsh_2() != null && bza_4.thtsh_2().jry.tzn_3(this.skz());
    }

    public void ld_2(boolean bl) {
        this.dhmh_2 = bl;
        if (bza_4.thtsh_2() != null) {
            for (s_3 s2 : bza_4.thtsh_2().jry.zskh_3()) {
                if (!s2.getName().equals(this.skz())) continue;
                boolean bl2 = s2.alh();
                if (bl && !bl2) {
                    s2.thst();
                    break;
                }
                if (bl || !bl2) break;
                s2.drt();
                break;
            }
        }
    }

    public String zhsh_2() {
        String string = this.skz();
        if (string.toLowerCase().startsWith("moondlc ")) {
            string = string.substring("moondlc ".length());
        }
        if (string.equalsIgnoreCase("Target Info")) {
            return "Target HUD";
        }
        if (string.equalsIgnoreCase("Armor")) {
            return "Armor HUD";
        }
        if (string.equalsIgnoreCase("MusicBar")) {
            return "Music Bar";
        }
        if (string.equalsIgnoreCase("Speed Graph")) {
            return "Speed Graph";
        }
        if (string.equalsIgnoreCase("Keybinds")) {
            return "Keybinds";
        }
        if (string.equalsIgnoreCase("Potions")) {
            return "Potions";
        }
        if (string.equalsIgnoreCase("Cooldowns")) {
            return "Cooldowns";
        }
        if (string.equalsIgnoreCase("Staffs")) {
            return "Staff List";
        }
        if (string.equalsIgnoreCase("Inventory")) {
            return "Inventory";
        }
        if (string.equalsIgnoreCase("XYZ")) {
            return "XYZ";
        }
        if (string.equalsIgnoreCase("Watermark")) {
            return "Watermark";
        }
        if (string.equalsIgnoreCase("Radar")) {
            return "Radar";
        }
        if (string.equalsIgnoreCase("Notifications")) {
            return "Notifications";
        }
        return string;
    }

    public boolean thdr() {
        String string = this.skz().toLowerCase();
        return string.contains("keybind") || string.contains("potion") || string.contains("cooldown") || string.contains("staff") || string.contains("inventory") || string.contains("notification") || string.contains("xyz");
    }

    public bsh_2 dhdh_7() {
        String string = this.skz().toLowerCase();
        if (string.contains("notification") || string.contains("xyz") || string.contains("inventory") || string.contains("cooldown")) {
            return brz_2.khkhj;
        }
        return brz_2.tsf;
    }

    public String ghssh_2() {
        String string = this.skz().toLowerCase();
        if (string.contains("notification")) {
            return "i";
        }
        if (string.contains("cooldown")) {
            return "i";
        }
        if (string.contains("xyz")) {
            return "q";
        }
        if (string.contains("inventory")) {
            return "g";
        }
        if (string.contains("keybind")) {
            return "K";
        }
        if (string.contains("potion")) {
            return "P";
        }
        if (string.contains("staff")) {
            return "S";
        }
        return "";
    }

    public class_2960 ththz() {
        String string = this.skz().toLowerCase();
        if (string.contains("target")) {
            return class_2960.method_60655((String)"moondlc", (String)"textures/icons/widget_settings/target_hud.png");
        }
        if (string.contains("armor")) {
            return class_2960.method_60655((String)"moondlc", (String)"textures/icons/widget_settings/armor_hud.png");
        }
        if (string.contains("watermark")) {
            return class_2960.method_60655((String)"moondlc", (String)"textures/icons/widget_settings/watermark.png");
        }
        if (string.contains("radar")) {
            return class_2960.method_60655((String)"moondlc", (String)"textures/icons/widget_settings/radar.png");
        }
        if (string.contains("speed")) {
            return class_2960.method_60655((String)"moondlc", (String)"textures/icons/widget_settings/speed_graph.png");
        }
        if (string.contains("music")) {
            return class_2960.method_60655((String)"moondlc", (String)"textures/icons/widget_settings/music_bar.png");
        }
        return class_2960.method_60655((String)"moondlc", (String)"textures/icons/hud/drag.png");
    }

    public String skz() {
        return this.getName();
    }

    public boolean shrth() {
        return false;
    }

    private tbb sshgh(float f, float f2, String string) {
        return bzz.zhs_7().jzt_3(bza_4.thtsh_2(), string, f, f2);
    }

    public void lh(wh_2 wh2) {
        this.athf(wh2.matrixStack(), () -> this.tsth_2(wh2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void rsgh(wh_2 wh2, boolean bl) {
        this.rath.dam_2(bl ? jkh.shhj : jkh.hthd);
        this.rath.ddt_6(bl);
        float f = Math.max(0.0f, this.rath.tssh_2());
        if (!bl && f <= 0.001f) {
            return;
        }
        float f2 = Math.min(1.0f, f);
        float f3 = 0.5f + f * 0.5f;
        float f4 = this.thdht.getX() + this.thdht.getScaledWidth() * 0.5f;
        float f5 = this.thdht.getY() + this.thdht.getScaledHeight() * 0.5f;
        float[] fArray = RenderSystem.getShaderColor();
        float f6 = fArray[0];
        float f7 = fArray[1];
        float f8 = fArray[2];
        float f9 = fArray[3];
        class_4587 class_45872 = wh2.matrixStack();
        class_45872.method_22903();
        class_45872.method_46416(f4, f5, 0.0f);
        class_45872.method_22905(f3, f3, 1.0f);
        class_45872.method_46416(-f4, -f5, 0.0f);
        RenderSystem.setShaderColor((float)f6, (float)f7, (float)f8, (float)(f9 * f2));
        try {
            this.lh(wh2);
        }
        finally {
            RenderSystem.setShaderColor((float)f6, (float)f7, (float)f8, (float)f9);
            class_45872.method_22909();
        }
    }

    protected void athf(class_4587 class_45872, Runnable runnable) {
        float f = this.thdht.getScale();
        if (Math.abs(f - 1.0f) < 0.001f) {
            runnable.run();
            return;
        }
        class_45872.method_22903();
        class_45872.method_46416(this.thdht.getX(), this.thdht.getY(), 0.0f);
        class_45872.method_22905(f, f, 1.0f);
        class_45872.method_46416(-this.thdht.getX(), -this.thdht.getY(), 0.0f);
        runnable.run();
        class_45872.method_22909();
    }

    public float ada_4(float f) {
        return bmb.ath_2().swk(f);
    }

    public float zdsh_2() {
        return bmb.ath_2().dhna();
    }

    public float thshth() {
        return this.ada_4(3.0f);
    }

    public bsh_2 thdz_2() {
        return brz_2.ryk;
    }

    public bsh_2 dsgh_2() {
        return brz_2.thtkh_2;
    }

    @Generated
    public tbm zst_4() {
        return this.hkhz_2;
    }

    @Generated
    public long tshz_3() {
        return this.ds;
    }

    @Generated
    public fa_2 khmt_2() {
        return this.rath;
    }

    @Generated
    public tbb khta_3() {
        return this.thdht;
    }

    private void tsth_2(wh_2 wh2) {
        this.lh(wh2.matrixStack());
    }

    private void ayt_2(Float f) {
        this.thdht.setScale(f.floatValue());
        bzz.zhs_7().asd();
    }

    private static String[] kydx5w8mi9(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ilyoszd9c51y(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ h5f4fcu3y63rk ^ string.hashCode() ^ n2 + ydatpu0k9ylpd ^ i * 1681733915 ^ h5f4fcu3y63rk, 4) ^ ydatpu0k9ylpd));
            }
            String[] stringArray = thw_3.kydx5w8mi9(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

