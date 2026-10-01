/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bb;
import us.m0vy.moondlc.m0vyguard.bdhb;
import us.m0vy.moondlc.m0vyguard.bms;
import us.m0vy.moondlc.m0vyguard.bwj;
import us.m0vy.moondlc.m0vyguard.tthw;
import us.m0vy.moondlc.m0vyguard.thw;
import us.m0vy.moondlc.m0vyguard.fd;
import us.m0vy.moondlc.m0vyguard.lsh;
import us.movy.moondlc.Moondlc;

public class tdm {
    private static final tdm sbs_2;
    private final String ztkh;
    private final File shtf;
    private final File zqs_2;
    private static final Charset srw;
    private static final int p2yeey441p = 538314062;
    private static final int hnj3f8g = -1649267616;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int cbfh6s1d;

    public tdm(String string) {
        this.ztkh = string;
        this.shtf = new File(string);
        this.zqs_2 = new File(this.shtf, "last_selected");
        this.dhwa_2();
    }

    public tdm() {
        this(bdhb.rft_2);
    }

    public void ghhth(fd fd2) {
        if (fd2 == null) {
            return;
        }
        this.dhwa_2();
        Path path = this.shtf.toPath().resolve(this.shdz_3(fd2.getName()) + ".moon");
        ArrayList<CallSite> arrayList = new ArrayList<CallSite>();
        arrayList.add((CallSite)((Object)("name=" + fd2.getName())));
        for (lsh lsh2 : fd2.tjz()) {
            arrayList.add((CallSite)((Object)(lsh2.getName() + "=" + lsh2.snw_2().getRGB())));
        }
        try {
            Files.write(path, arrayList, srw, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void tda_2() {
        for (thw thw2 : tthw.sfs_3().ttt_6()) {
            if (thw2 == null || thw2.ttkh_3() == null) continue;
            this.ghhth(thw2.ttkh_3());
        }
    }

    public void zwdh(fd fd2) {
        if (fd2 == null) {
            return;
        }
        this.dhwa_2();
        try {
            Files.writeString(this.zqs_2.toPath(), (CharSequence)this.shdz_3(fd2.getName()), srw, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public boolean tsn_2(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        this.dhwa_2();
        File[] fileArray = this.shtf.listFiles(tdm::sqz_2);
        if (fileArray == null) {
            return false;
        }
        for (File file : fileArray) {
            try {
                String string2;
                try (Stream<String> stream = Files.lines(file.toPath(), srw);){
                    string2 = stream.findFirst().orElse("");
                }
                if (!string2.startsWith("name=") || !string.equalsIgnoreCase(string2.substring(5).trim())) continue;
                return Files.deleteIfExists(file.toPath());
            }
            catch (IOException iOException) {
                Moondlc.dhrn.error("Failed to remove theme file '{}'", (Object)file, (Object)iOException);
            }
        }
        return false;
    }

    public fd tfgh_2(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        File file = new File(this.shtf, this.shdz_3(string) + ".moon");
        return file.exists() ? this.sts_6(file) : null;
    }

    public fd sts_6(File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        Map map = this.ttk(file.toPath());
        String string = map.getOrDefault("name", this.zzd_2(file.getName()));
        fd fd2 = new fd(string);
        for (lsh lsh2 : fd2.tjz()) {
            String string2 = lsh2.getName();
            if (!map.containsKey(string2)) continue;
            try {
                int n = Integer.parseInt((String)map.get(string2));
                lsh2.rhm(new Color(n, true));
            }
            catch (NumberFormatException numberFormatException) {}
        }
        return fd2;
    }

    public void tthh_4() {
        List list = tthw.sfs_3().ttt_6();
        list.clear();
        this.dhwa_2();
        File[] fileArray = this.shtf.listFiles(tdm::ds_3);
        if (fileArray == null || fileArray.length == 0) {
            this.zghh();
            return;
        }
        Arrays.sort(fileArray, Comparator.comparing(File::getName, String.CASE_INSENSITIVE_ORDER));
        for (File file : fileArray) {
            fd fd2 = this.sts_6(file);
            if (fd2 == null) continue;
            list.add(new thw(fd2));
        }
    }

    public fd szt() {
        if (!this.zqs_2.exists()) {
            return null;
        }
        try {
            String string = Files.readString(this.zqs_2.toPath(), srw).trim();
            if (string.isEmpty()) {
                return null;
            }
            File file = new File(this.shtf, string + ".moon");
            return file.exists() ? this.sts_6(file) : null;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    private void dhwa_2() {
        if (!this.shtf.exists()) {
            this.shtf.mkdirs();
            this.zghh();
        }
    }

    private void zghh() {
        fd[] fdArray = new fd[]{new fd("MoonDLC"), new bb().rlt_2(), new bms().rlt_2(), new bwj().rlt_2()};
        ArrayList<thw> arrayList = new ArrayList<thw>();
        for (fd fd2 : fdArray) {
            arrayList.add(new thw(fd2));
        }
        tthw.sfs_3().ttt_6().addAll(arrayList);
    }

    private Map ttk(Path path) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        try {
            List<String> list = Files.readAllLines(path, srw);
            for (String string : list) {
                int n;
                String string2 = string.trim();
                if (string2.isEmpty() || string2.startsWith("#") || (n = string2.indexOf(61)) <= 0) continue;
                String string3 = string2.substring(0, n);
                String string4 = string2.substring(n + 1);
                hashMap.put(string3, string4);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return hashMap;
    }

    public String shdz_3(String string) {
        return string == null ? "theme" : string.replaceAll("[\\\\/:*?\"<>|]", "_");
    }

    private String zzd_2(String string) {
        int n = string.lastIndexOf(46);
        return n <= 0 ? string : string.substring(0, n);
    }

    @Generated
    public String shthw() {
        return this.ztkh;
    }

    @Generated
    public File ssh_5() {
        return this.shtf;
    }

    @Generated
    public File bta_2() {
        return this.zqs_2;
    }

    @Generated
    public static tdm zkm_2() {
        return sbs_2;
    }

    private static boolean ds_3(File file, String string) {
        return string.toLowerCase().endsWith(".moon");
    }

    private static boolean sqz_2(File file, String string) {
        return string.toLowerCase().endsWith(".moon");
    }

    private static String[] ci71cnxn(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite p9l1ubznirf7et(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ p2yeey441p ^ string.hashCode() ^ n2 + hnj3f8g + i * 1059607779) + p2yeey441p) ^ hnj3f8g));
            }
            String[] stringArray = tdm.ci71cnxn(new String(cArray));
            int n3 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType2) : lookup.findVirtual(clazz, stringArray[4], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void AAAAAAAAAAAAAAAA() {
    }
}

