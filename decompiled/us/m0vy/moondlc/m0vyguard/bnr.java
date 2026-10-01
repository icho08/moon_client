/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3298;
import net.minecraft.class_3300;
import org.slf4j.Logger;
import us.m0vy.moondlc.m0vyguard.tth_2;
import us.m0vy.moondlc.m0vyguard.dkh_4;
import us.m0vy.moondlc.m0vyguard.ka;
import us.m0vy.moondlc.m0vyguard.yd;
import us.movy.moondlc.mixin.accessors.NativeImageAccessor;

public class bnr {
    private static final Logger khmy;
    private static final List khyd_2;
    private final Map zby = new HashMap();
    private final List rhl = new ArrayList();
    private class_2960 tsh_5;
    private boolean shndh = false;
    private final int dhmz_2;
    private final int dkhy;
    private static final int gzjrcm37ao = -2015516943;
    private static final int bh5j9xxyo6 = 775435338;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int wc5xmp6l;

    public static bnr thzf_2(int n, int n2) {
        for (bnr bnr2 : khyd_2) {
            if (bnr2.dhmz_2 != n || bnr2.dkhy != n2 || bnr2.khqsh()) continue;
            return bnr2;
        }
        bnr bnr3 = new bnr(n, n2);
        khyd_2.add(bnr3);
        return bnr3;
    }

    private bnr(int n, int n2) {
        this.dhmz_2 = n;
        this.dkhy = n2;
    }

    public void hjkh(class_2960 class_29602, yd yd2, List list) {
        if (this.shndh) {
            throw new RuntimeException("Atlas is already built! Register animations before calling buildAtlas()");
        }
        if (list.isEmpty()) {
            khmy.warn("Empty animation: {}", (Object)class_29602);
        } else {
            for (class_1011 class_10112 : list) {
                if (class_10112.method_4307() == this.dhmz_2 && class_10112.method_4323() == this.dkhy) continue;
                throw new RuntimeException(String.format("Frame size of animation %s (%dx%d) does not match the size of this atlas (%dx%d)", class_29602, class_10112.method_4307(), class_10112.method_4323(), this.dhmz_2, this.dkhy));
            }
            int n = this.rhl.size();
            for (int i = 0; i < list.size(); ++i) {
                this.rhl.add(new dkh_4(class_29602, i, (class_1011)list.get(i)));
            }
            ka ka2 = new ka(class_29602, yd2, n, list.size(), null);
            this.zby.put(class_29602, ka2);
            khmy.info("Registered animation {} with {} frames in atlas {}x{}", new Object[]{class_29602, list.size(), this.dhmz_2, this.dkhy});
        }
    }

    public void dwdh_2(class_2960 class_29602) {
        try {
            Object object;
            Object object2;
            InputStream inputStream = null;
            try {
                class_3300 class_33002 = object2 = class_310.method_1551() != null ? class_310.method_1551().method_1478() : null;
                if (object2 != null && ((Optional)(object = object2.method_14486(class_29602))).isPresent()) {
                    inputStream = ((class_3298)((Optional)object).get()).method_14482();
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            if (inputStream == null) {
                object2 = "assets/" + class_29602.method_12836() + "/" + class_29602.method_12832();
                inputStream = bnr.class.getClassLoader().getResourceAsStream((String)object2);
                if (inputStream == null) {
                    inputStream = bnr.class.getResourceAsStream("/" + (String)object2);
                }
                if (inputStream == null && Thread.currentThread().getContextClassLoader() != null) {
                    inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream((String)object2);
                }
            }
            if (inputStream == null) {
                throw new RuntimeException("File not found: " + String.valueOf(class_29602));
            }
            object2 = null;
            object = new ArrayList();
            try (InputStream inputStream2 = inputStream;
                 ZipInputStream zipInputStream = new ZipInputStream(inputStream2);){
                Object object3;
                Object object4;
                Object object5;
                ZipEntry zipEntry;
                TreeMap<Object, byte[]> treeMap = new TreeMap<Object, byte[]>();
                while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                    object5 = zipEntry.getName();
                    if ("meta.json".equals(object5)) {
                        object4 = new ByteArrayOutputStream();
                        object3 = new byte[1024];
                        while ((var12_18 = zipInputStream.read((byte[])object3)) > 0) {
                            ((ByteArrayOutputStream)object4).write((byte[])object3, 0, var12_18);
                        }
                        String string = ((ByteArrayOutputStream)object4).toString(StandardCharsets.UTF_8);
                        object2 = yd.haq(string);
                    } else if (((String)object5).startsWith("frames/") && ((String)object5).endsWith(".png")) {
                        object4 = new ByteArrayOutputStream();
                        object3 = new byte[1024];
                        while ((var12_18 = zipInputStream.read((byte[])object3)) > 0) {
                            ((ByteArrayOutputStream)object4).write((byte[])object3, 0, var12_18);
                        }
                        treeMap.put(object5, ((ByteArrayOutputStream)object4).toByteArray());
                    }
                    zipInputStream.closeEntry();
                }
                object5 = treeMap.values().iterator();
                while (object5.hasNext()) {
                    object4 = (byte[])object5.next();
                    object3 = class_1011.method_4309((InputStream)new ByteArrayInputStream((byte[])object4));
                    object.add(object3);
                }
            }
            if (object2 == null) {
                throw new RuntimeException("meta.json not found in " + String.valueOf(class_29602));
            }
            if (object.isEmpty()) {
                throw new RuntimeException("No frames for animation " + String.valueOf(class_29602));
            }
            if (((class_1011)object.get(0)).method_4307() != this.dhmz_2 || ((class_1011)object.get(0)).method_4323() != this.dkhy) {
                throw new RuntimeException(String.format("Frame size of animation %s (%dx%d) does not match the size of this atlas (%dx%d)", class_29602, ((class_1011)object.get(0)).method_4307(), ((class_1011)object.get(0)).method_4323(), this.dhmz_2, this.dkhy));
            }
            this.hjkh(class_29602, (yd)object2, (List)object);
        }
        catch (Exception exception) {
            throw new RuntimeException("Error loading animation from " + String.valueOf(class_29602), exception);
        }
    }

    public void thsgh_2() {
        if (this.shndh) {
            khmy.warn("Atlas is already built!");
        } else if (this.rhl.isEmpty()) {
            khmy.warn("No frames to build atlas!");
        } else {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6 = this.rhl.size();
            int n7 = (int)Math.ceil(Math.sqrt(n6));
            int n8 = (int)Math.ceil((double)n6 / (double)n7);
            int n9 = n7 * this.dhmz_2;
            int n10 = n8 * this.dkhy;
            class_1011 class_10112 = new class_1011(n9, n10, false);
            for (n5 = 0; n5 < n9; ++n5) {
                for (n4 = 0; n4 < n10; ++n4) {
                    ((NativeImageAccessor)class_10112).invokeSetColor(n5, n4, 0);
                }
            }
            for (n5 = 0; n5 < n6; ++n5) {
                n4 = n5 % n7;
                int n11 = n5 / n7;
                int n12 = n4 * this.dhmz_2;
                n3 = n11 * this.dkhy;
                class_1011 class_10113 = ((dkh_4)this.rhl.get((int)n5)).hm_2;
                for (n2 = 0; n2 < this.dhmz_2; ++n2) {
                    for (n = 0; n < this.dkhy; ++n) {
                        ((NativeImageAccessor)class_10112).invokeSetColor(n12 + n2, n3 + n, ((NativeImageAccessor)class_10113).invokeGetColor(n2, n));
                    }
                }
            }
            this.tsh_5 = class_2960.method_60655((String)"moondlc", (String)("global_animation_atlas_" + this.dhmz_2 + "x" + this.dkhy));
            class_1043 class_10432 = new class_1043(class_10112);
            class_310.method_1551().method_1531().method_4616(this.tsh_5, (class_1044)class_10432);
            for (ka ka2 : this.zby.values()) {
                ka2.sthz = this.tsh_5;
                ArrayList<tth_2> arrayList = new ArrayList<tth_2>();
                for (n3 = 0; n3 < ka2.shmm; ++n3) {
                    int n13 = ka2.thjw + n3;
                    n2 = n13 % n7;
                    n = n13 / n7;
                    float f = (float)n2 / (float)n7;
                    float f2 = (float)n / (float)n8;
                    float f3 = (float)(n2 + 1) / (float)n7;
                    float f4 = (float)(n + 1) / (float)n8;
                    tth_2 tth2_2 = new tth_2(this.tsh_5, f, f2, f3, f4, this.dhmz_2, this.dkhy);
                    arrayList.add(tth2_2);
                }
                ka2.hnh_2 = arrayList;
            }
            this.shndh = true;
            khmy.info("Atlas {}x{} built with {} animations and {} frames", new Object[]{this.dhmz_2, this.dkhy, this.zby.size(), n6});
        }
    }

    public static ka hn(class_2960 class_29602) {
        for (bnr bnr2 : khyd_2) {
            ka ka2 = (ka)bnr2.zby.get(class_29602);
            if (ka2 == null) continue;
            return ka2;
        }
        return null;
    }

    public class_2960 ghshdh() {
        return this.tsh_5;
    }

    public boolean khqsh() {
        return this.shndh;
    }

    public void tdhm() {
        if (this.tsh_5 != null) {
            class_310.method_1551().method_1531().method_4615(this.tsh_5);
        }
        for (dkh_4 dkh2 : this.rhl) {
            try {
                dkh2.hm_2.close();
            }
            catch (Exception exception) {}
        }
        this.zby.clear();
        this.rhl.clear();
        this.shndh = false;
    }

    public static void dmd_4() {
        for (bnr bnr2 : khyd_2) {
            bnr2.tdhm();
        }
        khyd_2.clear();
    }

    private static String[] x365snth4s(String string) {
        return string.split("\u0007\u001b", -1);
    }

    private static CallSite auhepkph1(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ gzjrcm37ao ^ string.hashCode()) + (n2 + bh5j9xxyo6) + i ^ gzjrcm37ao, 3) + bh5j9xxyo6);
            }
            String[] stringArray = bnr.x365snth4s(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

