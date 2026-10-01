/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1043
 *  net.minecraft.class_1044
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import us.m0vy.moondlc.m0vyguard.bhdh;
import us.m0vy.moondlc.m0vyguard.brd_2;
import us.movy.moondlc.Moondlc;

public class bjk {
    private static final Map bma_2;
    private final String thsf_2;
    private final Path thdhk;
    private static final int vu1alfu = -120283802;
    private static final int ucr4dg55skdl = -933311259;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int g0btta62oqt;

    public static void bat_3() {
        bma_2.clear();
    }

    public bjk(String string, Path path) {
        this.thsf_2 = string;
        this.thdhk = path;
    }

    public String thkgh() {
        return this.thsf_2;
    }

    public File skh_3() {
        return this.thdhk.toFile();
    }

    public String drs_3() {
        long l = this.skh_3().exists() ? this.skh_3().lastModified() : System.currentTimeMillis();
        return new SimpleDateFormat("dd.MM.yyyy HH:mm").format(new Date(l));
    }

    public String rhy() {
        return bhdh.khsb().zfy_2(this.thsf_2);
    }

    public String btgh() {
        return bhdh.khsb().bnth(this.thsf_2);
    }

    public List ats_2() {
        return bhdh.khsb().rzk_2(this.thsf_2);
    }

    public void shndh(List list) {
        bhdh.khsb().dqa_2(this.thsf_2, list);
    }

    public void twh(String string, List list, String string2) {
        bhdh.khsb().bwr(this.thsf_2, string, list, string2);
    }

    public class_2960 hnb() {
        String string = this.btgh();
        if (string == null || string.trim().isEmpty()) {
            return null;
        }
        File file = new File(string.trim().replace("\"", ""));
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        String string2 = this.thsf_2 + "_" + file.lastModified() + "_" + file.getAbsolutePath();
        if (bma_2.containsKey(string2)) {
            return (class_2960)bma_2.get(string2);
        }
        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            if (bufferedImage != null) {
                class_2960 class_29602 = Moondlc.id("config_img_" + Math.abs(string2.hashCode()));
                class_310.method_1551().method_1531().method_4616(class_29602, (class_1044)new class_1043(brd_2.shghdh(bufferedImage, true)));
                bma_2.put(string2, class_29602);
                return class_29602;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return null;
    }

    public void dsa_5() {
        bhdh.khsb().rzs_4(this.thsf_2);
    }

    public void hghh_2() {
        bhdh.khsb().daw_3(this.thsf_2);
    }

    public void jtz_3() {
        bhdh.khsb().dhbt(this.thsf_2);
    }

    public String khhs_2() {
        return "ConfigFile{" + this.thsf_2 + "}";
    }

    private static String[] uw9dygxtzjk(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite eu5ody4z43k(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ vu1alfu ^ string.hashCode() ^ n2 + ucr4dg55skdl + i * 1595395567) + vu1alfu) ^ ucr4dg55skdl));
            }
            String[] stringArray = bjk.uw9dygxtzjk(new String(cArray));
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

