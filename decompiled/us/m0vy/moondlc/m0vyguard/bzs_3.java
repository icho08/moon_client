/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_1011
 *  net.minecraft.class_1043
 *  net.minecraft.class_1044
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_3298
 *  net.minecraft.class_3300
 *  org.slf4j.Logger
 */
package us.m0vy.moondlc.m0vyguard;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import lombok.Generated;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3298;
import net.minecraft.class_3300;
import org.slf4j.Logger;
import us.m0vy.moondlc.m0vyguard.bkhth;
import us.m0vy.moondlc.m0vyguard.bkt_2;
import us.m0vy.moondlc.m0vyguard.bwb;
import us.m0vy.moondlc.m0vyguard.tshdh;

public class bzs_3 {
    private static final Logger hgh_2;
    private static final List thfh;
    private final Map dal = new HashMap();
    private final List hd_4 = new ArrayList();
    private class_2960 htr_2;
    private boolean zsq = false;
    private final int khjt;
    private final int snb;
    private static final int uyz18vk = 1068375958;
    private static final int ngmt0vq3v = 1224629392;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int ez3x9tj4r1oe;

    public static bzs_3 zash_2(int n, int n2) {
        for (bzs_3 bzs2 : thfh) {
            if (bzs2.khjt != n || bzs2.snb != n2 || bzs2.zmkh_2()) continue;
            return bzs2;
        }
        bzs_3 bzs3 = new bzs_3(n, n2);
        thfh.add(bzs3);
        return bzs3;
    }

    private bzs_3(int n, int n2) {
        this.khjt = n;
        this.snb = n2;
    }

    public void atsh(class_2960 class_29602, bkhth bkhth2, List list) {
        if (this.zsq) {
            throw new RuntimeException("Atlas already built!");
        }
        if (list.isEmpty()) {
            hgh_2.warn("Empty animation: {}", (Object)class_29602);
            return;
        }
        for (class_1011 class_10112 : list) {
            if (class_10112.method_4307() == this.khjt && class_10112.method_4323() == this.snb) continue;
            throw new RuntimeException("Frame size mismatch for " + String.valueOf(class_29602));
        }
        int n = this.hd_4.size();
        for (int i = 0; i < list.size(); ++i) {
            this.hd_4.add(new bkt_2(class_29602, i, (class_1011)list.get(i)));
        }
        this.dal.put(class_29602, new bwb(class_29602, bkhth2, n, list.size(), null));
    }

    public void khsm_2(class_2960 class_29602) {
        try {
            class_3300 class_33002 = class_310.method_1551().method_1478();
            Optional optional = class_33002.method_14486(class_29602);
            if (optional.isEmpty()) {
                throw new RuntimeException("File not found: " + String.valueOf(class_29602));
            }
            class_3298 class_32982 = (class_3298)optional.get();
            bkhth bkhth2 = null;
            ArrayList<class_1011> arrayList = new ArrayList<class_1011>();
            try (InputStream inputStream = class_32982.method_14482();
                 ZipInputStream zipInputStream = new ZipInputStream(inputStream);){
                Object object;
                Object object2;
                ZipEntry zipEntry;
                TreeMap<Object, byte[]> treeMap = new TreeMap<Object, byte[]>();
                while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                    object2 = zipEntry.getName();
                    if ("meta.json".equals(object2)) {
                        object = new ByteArrayOutputStream();
                        var13_18 = new byte[1024];
                        while ((var14_19 = zipInputStream.read(var13_18)) > 0) {
                            ((ByteArrayOutputStream)object).write(var13_18, 0, var14_19);
                        }
                        bkhth2 = bkhth.dddh_3(((ByteArrayOutputStream)object).toString(StandardCharsets.UTF_8));
                    } else if (((String)object2).startsWith("frames/") && ((String)object2).endsWith(".png")) {
                        object = new ByteArrayOutputStream();
                        var13_18 = new byte[1024];
                        while ((var14_19 = zipInputStream.read(var13_18)) > 0) {
                            ((ByteArrayOutputStream)object).write(var13_18, 0, var14_19);
                        }
                        treeMap.put(object2, ((ByteArrayOutputStream)object).toByteArray());
                    }
                    zipInputStream.closeEntry();
                }
                object2 = treeMap.values().iterator();
                while (object2.hasNext()) {
                    object = (byte[])object2.next();
                    arrayList.add(class_1011.method_4309((InputStream)new ByteArrayInputStream((byte[])object)));
                }
            }
            if (bkhth2 == null) {
                throw new RuntimeException("No meta.json in " + String.valueOf(class_29602));
            }
            if (arrayList.isEmpty()) {
                throw new RuntimeException("No frames in " + String.valueOf(class_29602));
            }
            this.atsh(class_29602, bkhth2, arrayList);
        }
        catch (Exception exception) {
            throw new RuntimeException("Error loading animation from " + String.valueOf(class_29602), exception);
        }
    }

    public void jaq() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.zsq || this.hd_4.isEmpty()) {
            return;
        }
        int n6 = this.hd_4.size();
        int n7 = (int)Math.ceil(Math.sqrt(n6));
        int n8 = (int)Math.ceil((double)n6 / (double)n7);
        int n9 = n7 * this.khjt;
        int n10 = n8 * this.snb;
        class_1011 class_10112 = new class_1011(n9, n10, false);
        for (n5 = 0; n5 < n9; ++n5) {
            for (n4 = 0; n4 < n10; ++n4) {
                class_10112.method_61941(n5, n4, 0);
            }
        }
        for (n5 = 0; n5 < n6; ++n5) {
            n4 = n5 % n7;
            int n11 = n5 / n7;
            int n12 = n4 * this.khjt;
            n3 = n11 * this.snb;
            class_1011 class_10113 = ((bkt_2)this.hd_4.get((int)n5)).zht_3;
            for (n2 = 0; n2 < this.khjt; ++n2) {
                for (n = 0; n < this.snb; ++n) {
                    class_10112.method_61941(n12 + n2, n3 + n, class_10113.method_61940(n2, n));
                }
            }
        }
        this.htr_2 = class_2960.method_60655((String)"moondlc", (String)("sprite_atlas_" + this.khjt + "x" + this.snb));
        class_1043 class_10432 = new class_1043(class_10112);
        class_310.method_1551().method_1531().method_4616(this.htr_2, (class_1044)class_10432);
        for (bwb bwb2 : this.dal.values()) {
            bwb2.zzsh_2 = this.htr_2;
            ArrayList<tshdh> arrayList = new ArrayList<tshdh>();
            for (n3 = 0; n3 < bwb2.tsgh_2; ++n3) {
                int n13 = bwb2.zyl + n3;
                n2 = n13 % n7;
                n = n13 / n7;
                float f = (float)n2 / (float)n7;
                float f2 = (float)n / (float)n8;
                float f3 = (float)(n2 + 1) / (float)n7;
                float f4 = (float)(n + 1) / (float)n8;
                arrayList.add(new tshdh(this.htr_2, f, f2, f3, f4, this.khjt, this.snb));
            }
            bwb2.tt_4 = arrayList;
        }
        this.zsq = true;
        hgh_2.info("Sprite atlas {}x{} built with {} animations, {} frames", new Object[]{this.khjt, this.snb, this.dal.size(), n6});
    }

    public static bwb rkhd(class_2960 class_29602) {
        for (bzs_3 bzs2 : thfh) {
            bwb bwb2 = (bwb)bzs2.dal.get(class_29602);
            if (bwb2 == null) continue;
            return bwb2;
        }
        return null;
    }

    public static void dnk() {
        for (bzs_3 bzs2 : thfh) {
            bzs2.zrl_2();
        }
        thfh.clear();
    }

    private void zrl_2() {
        if (this.htr_2 != null) {
            class_310.method_1551().method_1531().method_4615(this.htr_2);
        }
        for (bkt_2 bkt2_2 : this.hd_4) {
            try {
                bkt2_2.zht_3.close();
            }
            catch (Exception exception) {}
        }
        this.dal.clear();
        this.hd_4.clear();
        this.zsq = false;
    }

    @Generated
    public boolean zmkh_2() {
        return this.zsq;
    }

    private static String[] gn08twzqt(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite pssuiehic(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ uyz18vk ^ string.hashCode()) + (n2 + ngmt0vq3v) + i ^ uyz18vk, 25) + ngmt0vq3v);
            }
            String[] stringArray = bzs_3.gn08twzqt(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

