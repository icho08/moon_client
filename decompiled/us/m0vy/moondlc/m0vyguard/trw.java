/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_1044
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 */
package us.m0vy.moondlc.m0vyguard;

import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import net.minecraft.class_1044;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import us.m0vy.moondlc.m0vyguard.bhn;
import us.m0vy.moondlc.m0vyguard.bsh_2;
import us.m0vy.moondlc.m0vyguard.sf;
import us.m0vy.moondlc.m0vyguard.tn_2;
import us.m0vy.moondlc.m0vyguard.an;
import us.m0vy.moondlc.m0vyguard.yk;

public class trw {
    private String dsh_5;
    private class_2960 dhshy;
    private class_2960 bth;
    private static final int sdo66khc = 1222347639;
    private static final int vbhc93lb = 1130179331;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int m9ielgynp;

    public trw zshh_2(String string) {
        this.dsh_5 = string;
        this.dhshy = class_2960.method_60655((String)"MoonDLC".toLowerCase(), (String)("fonts/" + string + ".json"));
        this.bth = class_2960.method_60655((String)"MoonDLC".toLowerCase(), (String)("fonts/" + string + ".png"));
        return this;
    }

    public bsh_2 hghth() {
        sf sf2 = (sf)an.thkd(this.dhshy, sf.class);
        class_1044 class_10443 = class_310.method_1551().method_1531().method_4619(this.bth);
        if (sf2 == null) {
            throw new RuntimeException("Failed to read font data file: " + this.dhshy.toString() + "; Are you sure this is json file? Try to check the correctness of its syntax.");
        }
        RenderSystem.recordRenderCall(() -> trw.tghd_2(class_10443));
        float f = sf2.atlas().width();
        float f2 = sf2.atlas().height();
        Map<Integer, tn_2> map = sf2.glyphs().stream().collect(Collectors.toMap(bhn::unicode, arg_0 -> trw.dtha_3(f, f2, arg_0)));
        HashMap hashMap = new HashMap();
        sf2.kernings().forEach(arg_0 -> trw.zdk_2(hashMap, arg_0));
        return new bsh_2(this.dsh_5, class_10443, sf2.atlas(), sf2.metrics(), map, hashMap);
    }

    private static void zdk_2(Map map, yk yk2) {
        HashMap<Integer, Float> hashMap = (HashMap<Integer, Float>)map.get(yk2.leftChar());
        if (hashMap == null) {
            hashMap = new HashMap<Integer, Float>();
            map.put(yk2.leftChar(), hashMap);
        }
        hashMap.put(yk2.rightChar(), Float.valueOf(yk2.advance()));
    }

    private static tn_2 dtha_3(float f, float f2, bhn bhn2) {
        return new tn_2(bhn2, f, f2);
    }

    private static void tghd_2(class_1044 class_10443) {
        class_10443.method_4527(true, false);
    }

    private static String[] ul581ycdd47(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ydkf5pur2upe(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ sdo66khc ^ string.hashCode() ^ n2 + vbhc93lb ^ i * 917304093 ^ sdo66khc, 24) ^ vbhc93lb));
            }
            String[] stringArray = trw.ul581ycdd47(new String(cArray));
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

