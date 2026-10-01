/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.LinkedHashMap;
import java.util.Map;
import us.m0vy.moondlc.m0vyguard.bdn;
import us.m0vy.moondlc.m0vyguard.bdhb;
import us.m0vy.moondlc.m0vyguard.taa;
import us.m0vy.moondlc.m0vyguard.thw_3;
import us.m0vy.moondlc.m0vyguard.at_2;

public class msh {
    private static final msh hrm;
    private final File khhz_4 = new File(bdhb.hya_2 + "/widget_settings.json");
    private final Gson bht = new GsonBuilder().setPrettyPrinting().create();
    private static final int qo4rs236d6rpg = -1873974878;
    private static final int c45cp6h1iru = 331605221;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int llc3zokt;

    public static msh jt_2() {
        return hrm;
    }

    private msh() {
    }

    public void ghsd() {
        try {
            if (!this.khhz_4.getParentFile().exists()) {
                this.khhz_4.getParentFile().mkdirs();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (thw_3 thw2_2 : taa.tdt_8().dab_4()) {
                if (thw2_2.bhh().isEmpty()) continue;
                LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<String, String>();
                for (bdn bdn2 : thw2_2.bhh()) {
                    linkedHashMap2.put(bdn2.getName(), bdn2.ttj());
                }
                linkedHashMap.put(thw2_2.skz(), linkedHashMap2);
            }
            Files.writeString(this.khhz_4.toPath(), (CharSequence)this.bht.toJson(linkedHashMap), new OpenOption[0]);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void tdh() {
        if (!this.khhz_4.exists()) {
            return;
        }
        try {
            String string = Files.readString(this.khhz_4.toPath());
            Map map = (Map)this.bht.fromJson(string, new at_2(this).getType());
            if (map == null) {
                return;
            }
            for (thw_3 thw2_2 : taa.tdt_8().dab_4()) {
                Map map2 = (Map)map.get(thw2_2.skz());
                if (map2 == null) continue;
                for (bdn bdn2 : thw2_2.bhh()) {
                    String string2 = (String)map2.get(bdn2.getName());
                    if (string2 == null) continue;
                    bdn2.tnz(string2);
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static String[] f3ys9rng2(String string) {
        return string.split("\u0004\u0017", -1);
    }

    private static CallSite pij7z3gv3h(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ qo4rs236d6rpg ^ string.hashCode() ^ n2 + c45cp6h1iru ^ i * 186672071 ^ qo4rs236d6rpg, 18) ^ c45cp6h1iru));
            }
            String[] stringArray = msh.f3ys9rng2(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

