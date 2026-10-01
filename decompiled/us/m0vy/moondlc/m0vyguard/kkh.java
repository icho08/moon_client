/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1011
 *  net.minecraft.class_1011$class_1012
 *  net.minecraft.class_1043
 *  net.minecraft.class_1044
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_429
 *  net.minecraft.class_437
 *  net.minecraft.class_500
 *  net.minecraft.class_526
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.List;
import java.util.Scanner;
import javax.imageio.ImageIO;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_429;
import net.minecraft.class_437;
import net.minecraft.class_500;
import net.minecraft.class_526;
import us.m0vy.moondlc.m0vyguard.bdhj;
import us.m0vy.moondlc.m0vyguard.bss_2;
import us.m0vy.moondlc.m0vyguard.btf_2;
import us.m0vy.moondlc.m0vyguard.bagh_2;
import us.m0vy.moondlc.m0vyguard.bhz_4;
import us.m0vy.moondlc.m0vyguard.tjz_2;
import us.m0vy.moondlc.m0vyguard.tkhr;
import us.m0vy.moondlc.m0vyguard.tdq;
import us.m0vy.moondlc.m0vyguard.jt;
import us.m0vy.moondlc.m0vyguard.khh;
import us.m0vy.moondlc.m0vyguard.sht_5;
import us.m0vy.moondlc.m0vyguard.da_3;
import us.m0vy.moondlc.m0vyguard.ghm;

public class kkh
extends jt {
    private static boolean khrs;
    private static final List bzl;
    public static class_2960 hkr;
    public static boolean khlth;
    private float jthw = 0.0f;
    private float bkd_2 = 0.0f;
    private static final float sghsh = 22.0f;
    private static final float shdh_7 = 16.0f;
    private static final float bhw_2 = 0.075f;
    private boolean jbh = false;
    private final tdq zghk = new tdq(1000L, 0.0f, btf_2.zdq);
    private String[] sln;
    private int har = 0;
    private int tnd_2 = 0;
    private boolean tgha = true;
    private boolean tzb_2 = false;
    private long dhwy = 0L;
    private static final long shkd_2 = 110L;
    private static final long dqs_2 = 55L;
    private static final long sqd = 3500L;
    private static final float taf_2 = 190.0f;
    private static final float sks = 92.0f;
    private static final float bam = 28.0f;
    private static final float shak = 5.0f;
    private static final int d4p6lhs2skxxx = -531440246;
    private static final int me9jpgdfrx0i5 = -1972600776;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int htnfa1r5xw98i;

    protected void method_25426() {
        String string = "image/mainmenu/icons/";
        if (!khrs) {
            bzl.clear();
            bzl.add(new sht_5(string + "single.png", 10.0f, "Single Player", this::lambda$init$0));
            bzl.add(new sht_5(string + "multi.png", 10.0f, "Multi Player", this::lambda$init$1));
            bzl.add(new sht_5(string + "settings.png", 10.0f, "Settings", this::lambda$init$2));
            bzl.add(new sht_5(string + "quit.png", 11.0f, "Quit", () -> ((class_310)this.field_22787).method_1490()));
            khrs = true;
        }
        this.sln = new String[]{"U made a right choice " + this.field_22787.method_1548().method_1676(), "Unleash the full potential of your game."};
        this.loadWallpaper();
        super.method_25426();
    }

    private void loadWallpaper() {
        Scanner scanner;
        Object object;
        if (khlth) {
            return;
        }
        khlth = true;
        Object object2 = null;
        String string = System.getenv("APPDATA");
        if (string != null && ((File)(object = new File(string, "Microsoft\\Windows\\Themes\\TranscodedWallpaper"))).exists() && ((File)object).length() > 0L) {
            object2 = object;
        }
        if (object2 == null) {
            try {
                object = Runtime.getRuntime().exec("reg query \"HKCU\\Control Panel\\Desktop\" /v Wallpaper");
                ((Process)object).waitFor();
                scanner = new Scanner(((Process)object).getInputStream());
                while (scanner.hasNextLine()) {
                    String string2 = scanner.nextLine();
                    if (!string2.contains("REG_SZ")) continue;
                    String string3 = string2.substring(string2.indexOf("REG_SZ") + 6).trim();
                    File file = new File(string3);
                    if (!file.exists()) break;
                    object2 = file;
                    break;
                }
                scanner.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (object2 != null) {
            try {
                object = ImageIO.read(object2);
                if (object != null) {
                    scanner = new class_1011(class_1011.class_1012.field_4997, ((BufferedImage)object).getWidth(), ((BufferedImage)object).getHeight(), false);
                    for (int i = 0; i < ((BufferedImage)object).getHeight(); ++i) {
                        for (int j = 0; j < ((BufferedImage)object).getWidth(); ++j) {
                            scanner.method_61941(j, i, ((BufferedImage)object).getRGB(j, i));
                        }
                    }
                    class_1043 class_10432 = new class_1043((class_1011)scanner);
                    class_2960 class_29602 = class_2960.method_60655((String)"moondlc", (String)"desktop_wallpaper");
                    this.field_22787.method_1531().method_4616(class_29602, (class_1044)class_10432);
                    hkr = class_29602;
                }
            }
            catch (Exception exception) {
                System.out.println("Failed to load custom desktop wallpaper: " + exception.getMessage());
            }
        }
    }

    @Override
    public void render(bagh_2 bagh2) {
        bdhj bdhj2 = bhz_4.zw.thds(65.0f);
        bdhj bdhj3 = bhz_4.twr.thds(16.0f);
        bdhj bdhj4 = bhz_4.bjf.thds(10.0f);
        this.zghk.zsht_2(this.jbh);
        float f = 255.0f * (0.5f + 0.5f * this.zghk.swd());
        float f2 = ghm.haa((float)this.field_22790 / 2.0f - 20.0f, 80.0, this.zghk.swd());
        bagh2.drawRoundedRect(0.0f, 0.0f, (float)this.field_22789, (float)this.field_22790, bss_2.khsh_5, new tjz_2(new khh(26.0f, 34.0f, 56.0f), new khh(5.0f, 3.0f, 12.0f)));
        float f3 = ((float)bagh2.getMouseX() - (float)this.field_22789 / 2.0f) / Math.max(1.0f, (float)this.field_22789 / 2.0f);
        float f4 = ((float)bagh2.getMouseY() - (float)this.field_22790 / 2.0f) / Math.max(1.0f, (float)this.field_22790 / 2.0f);
        f3 = Math.max(-1.0f, Math.min(1.0f, f3));
        f4 = Math.max(-1.0f, Math.min(1.0f, f4));
        float f5 = -f3 * 22.0f;
        float f6 = -f4 * 16.0f;
        this.jthw += (f5 - this.jthw) * 0.075f;
        this.bkd_2 += (f6 - this.bkd_2) * 0.075f;
        float f7 = 1.12f - 0.06f * this.zghk.swd();
        float f8 = 20.0f;
        bagh2.method_51448().method_22903();
        bagh2.method_51448().method_46416((float)this.field_22789 / 2.0f + this.jthw, (float)this.field_22790 / 2.0f + this.bkd_2, 0.0f);
        bagh2.method_51448().method_22905(f7, f7, 1.0f);
        bagh2.method_51448().method_46416((float)(-this.field_22789) / 2.0f, (float)(-this.field_22790) / 2.0f, 0.0f);
        class_2960 class_29602 = hkr != null ? hkr : class_2960.method_60655((String)"moondlc", (String)"image/mainmenu/background.png");
        bagh2.drawTexture(class_29602, -f8, -f8, (float)this.field_22789 + f8 * 2.0f, (float)this.field_22790 + f8 * 2.0f);
        bagh2.method_51448().method_22909();
        bagh2.drawRoundedRect(0.0f, 0.0f, (float)this.field_22789, (float)this.field_22790, bss_2.khsh_5, new khh(0.0f, 0.0f, 0.0f).khhh_3(80.0f));
        tkhr.khghy.afr();
        bagh2.drawCenteredText(bdhj2, "Moondlc", (float)this.field_22789 / 2.0f, f2, khh.dww.khhh_3(f));
        this.updateTypewriter();
        String string = this.sln != null ? this.sln[this.har] : "";
        String string2 = string.substring(0, Math.min(this.tnd_2, string.length())) + (System.currentTimeMillis() % 600L < 300L ? "|" : "");
        bagh2.drawCenteredText(bdhj3, string2, (float)this.field_22789 / 2.0f, f2 + bdhj2.rfs_2() + 4.0f, khh.dww.khhh_3(f));
        bagh2.drawRoundedRect((float)this.field_22789 / 2.0f - 36.0f, (float)(this.field_22790 - 5) - 3.0f * this.zghk.swd(), 72.0f, 3.0f, bss_2.all(1.0f), khh.dww.khhh_3(255.0f * this.zghk.swd()));
        bagh2.drawCenteredText(bdhj4, "Click to unlock", (float)this.field_22789 / 2.0f, (float)(this.field_22790 - 15) + 3.0f * this.zghk.swd(), khh.dww.khhh_3(155.0f * (1.0f - this.zghk.swd())));
        this.drawButtons(bagh2);
    }

    private void drawButtons(bagh_2 bagh2) {
        float f = this.zghk.swd();
        float f2 = (float)this.field_22789 / 2.0f;
        float f3 = (float)this.field_22790 - ((float)this.field_22790 / 2.0f + 20.0f);
        float f4 = 94.0f;
        float f5 = f3 < f4 + 20.0f ? (float)this.field_22790 - f4 - 20.0f : (float)this.field_22790 / 2.0f + 30.0f;
        sht_5 sht2 = (sht_5)bzl.get(0);
        sht_5 sht3 = (sht_5)bzl.get(1);
        sht_5 sht4 = (sht_5)bzl.get(2);
        sht_5 sht5 = (sht_5)bzl.get(3);
        float[] fArray = new float[]{0.2f, 0.4f, 0.6f, 0.6f};
        for (int i = 0; i < bzl.size(); ++i) {
            ((sht_5)bzl.get(i)).zzs_5().zsht_2(f > fArray[i]);
        }
        float f6 = f5;
        float f7 = f5 + 28.0f + 5.0f;
        float f8 = f5 + 66.0f;
        float f9 = 15.0f * (1.0f - sht2.zzs_5().swd());
        sht2.khjs_2(f2 - 95.0f, f6 + f9, 190.0f, 28.0f);
        sht2.bza(bagh2);
        float f10 = 15.0f * (1.0f - sht3.zzs_5().swd());
        sht3.khjs_2(f2 - 95.0f, f7 + f10, 190.0f, 28.0f);
        sht3.bza(bagh2);
        float f11 = 15.0f * (1.0f - sht4.zzs_5().swd());
        sht4.khjs_2(f2 - 95.0f, f8 + f11, 92.0f, 28.0f);
        sht4.bza(bagh2);
        float f12 = 15.0f * (1.0f - sht5.zzs_5().swd());
        sht5.khjs_2(f2 - 95.0f + 92.0f + 6.0f, f8 + f12, 92.0f, 28.0f);
        sht5.bza(bagh2);
    }

    private void updateTypewriter() {
        if (this.sln == null) {
            return;
        }
        long l = System.currentTimeMillis();
        String string = this.sln[this.har];
        if (this.tzb_2) {
            if (l - this.dhwy > 3500L) {
                this.tzb_2 = false;
                this.tgha = false;
                this.dhwy = l;
            }
        } else if (this.tgha) {
            if (l - this.dhwy > 110L) {
                this.tnd_2 = Math.min(this.tnd_2 + 1, string.length());
                this.dhwy = l;
                if (this.tnd_2 >= string.length()) {
                    this.tzb_2 = true;
                    this.dhwy = l;
                }
            }
        } else if (l - this.dhwy > 55L) {
            this.tnd_2 = Math.max(this.tnd_2 - 1, 0);
            this.dhwy = l;
            if (this.tnd_2 == 0) {
                this.har = (this.har + 1) % this.sln.length;
                this.tgha = true;
            }
        }
    }

    @Override
    public void onMouseClicked(double d, double d2, da_3 da2_2) {
        for (sht_5 sht2 : bzl) {
            if (!sht2.bdhh_2(d, d2) || sht2.zzs_5().swd() != 1.0f) continue;
            sht2.rlh(d, d2, da2_2.getButtonIndex());
            return;
        }
        this.jbh = !this.jbh;
        super.onMouseClicked(d, d2, da2_2);
    }

    @Override
    public void onMouseReleased(double d, double d2, da_3 da2_2) {
        super.onMouseReleased(d, d2, da2_2);
    }

    public boolean method_25404(int n, int n2, int n3) {
        if (class_437.method_25441() && n == 82) {
            this.field_22787.method_1507((class_437)new class_500((class_437)this));
        }
        if (class_437.method_25441() && n == 84) {
            this.field_22787.method_1507((class_437)new class_526((class_437)this));
        }
        return super.method_25404(n, n2, n3);
    }

    public boolean method_25422() {
        return false;
    }

    private void lambda$init$2() {
        this.field_22787.method_1507((class_437)new class_429((class_437)this, this.field_22787.field_1690));
    }

    private void lambda$init$1() {
        this.field_22787.method_1507((class_437)new class_500((class_437)this));
    }

    private void lambda$init$0() {
        this.field_22787.method_1507((class_437)new class_526((class_437)this));
    }

    private static String[] ae0p4wrw5o(String string) {
        return string.split("\u0004\u0013", -1);
    }

    private static CallSite rf19dfukt0(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ d4p6lhs2skxxx ^ string.hashCode()) + (n2 + me9jpgdfrx0i5) + i ^ d4p6lhs2skxxx, 8) + me9jpgdfrx0i5);
            }
            String[] stringArray = kkh.ae0p4wrw5o(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

