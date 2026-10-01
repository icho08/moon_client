/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  lombok.Generated
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
import java.lang.reflect.Type;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bdhb;
import us.m0vy.moondlc.m0vyguard.bsb;
import us.m0vy.moondlc.m0vyguard.bsd;
import us.m0vy.moondlc.m0vyguard.tbb;
import us.m0vy.moondlc.m0vyguard.shl_3;
import us.m0vy.moondlc.m0vyguard.yf;

public class bzz {
    private static final bzz dns;
    private final LinkedHashMap shrl = new LinkedHashMap();
    private final File tkkh = new File(bdhb.hya_2 + "/drags.json");
    private final Gson ththdh = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();
    private static final int sth_5 = 1429608372;
    private static final int khdhs = -1695464118;
    private static final int stz_2 = 1764983255;
    private static final int hghb = 283975661;
    private static final int lcuauzgwgq = -125938733;
    private static final int vumdgvdl2 = 1664438998;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int vsdafbjm;

    public tbb jzt_3(bsb bsb2, String string, float f, float f2) {
        try {
            int n = -1402826211;
            n = Integer.rotateLeft(n * -894015119, 18) ^ 0x5209D89C;
            n = System.identityHashCode(this) ^ n;
            bsb bsb3 = bsb2;
            n = Integer.rotateLeft((bsb3 != null ? System.identityHashCode(bsb3) : 0) ^ n, 4);
            int n2 = n ^ 0x90B06722;
            if ((n2 ^ n) != -1867487454) {
                int cfr_ignored_0 = (0x3CD2F53F ^ n) + 1574097179;
            }
            if ((0x6F & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!bzz.zhs_2()) {
            bzz.tfq();
            throw null;
        }
        this.shrl.put(string, new tbb(bsb2, string, f, f2));
        return (tbb)this.shrl.get(string);
    }

    public tbb dtsh_2() {
        try {
            int n = -1100695777;
            n = Integer.rotateLeft(n * 1848725437, 22) ^ 0xF29697C;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x6F3DCBD6;
            if ((n2 ^ n) != 1866320854) {
                int cfr_ignored_0 = (0xD1597CC9 ^ n) - 858004662;
            }
            if ((0x3D7 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        return bzz.zsh_9(this.shrl).stream().filter(tbb::isActive).findFirst().orElse(null);
    }

    public void asd() {
        int n = -1669383032;
        n = Integer.rotateLeft(n * -337774109, 15) ^ 0x2BC42B2F;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
        int n2 = n ^ 0x1B09AE4D;
        if ((n2 ^ n) != 453619277) {
            int cfr_ignored_0 = (0x877692C5 ^ n) + -924674503;
        }
        if (!this.tkkh.exists()) {
            this.tkkh.getParentFile().mkdirs();
        }
        if (bzz.dkha_3(bzz.jsa_2(this.tkkh).getFileSystem())) {
            try {
                Files.writeString(bzz.khhl(this.tkkh), (CharSequence)this.ththdh.toJson((Object)this.shrl), new OpenOption[0]);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        } else {
            System.err.println("File system closed. Could not save drag data.");
        }
    }

    public void thrt_2() {
        int n = -1992532133;
        n = Integer.rotateLeft(n * 1601994429, 5) ^ 0xBD1A47D6;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x9FBD41A2;
        if ((n2 ^ n) != -1614986846) {
            int cfr_ignored_0 = (0x16811EF9 ^ n) - -1875985420;
        }
        if (!this.tkkh.exists()) {
            bzz.thdw_2(this.tkkh.getParentFile());
            return;
        }
        try {
            String string = Files.readString(this.tkkh.toPath());
            Map map = (Map)bzz.hma_2(this.ththdh, string, new bsd(this).getType());
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String string2 = (String)entry.getKey();
                    tbb tbb2 = (tbb)entry.getValue();
                    if (tbb2 == null) continue;
                    tbb tbb3 = (tbb)bzz.dzl(this.shrl, string2);
                    if (tbb3 == null) {
                        tbb3 = this.khld_2(string2);
                    }
                    if (tbb3 == null) continue;
                    tbb3.setX(tbb2.getX());
                    bzz.khah(tbb3, tbb2.getY());
                    tbb3.setScale(bzz.dhbkh(tbb2));
                    this.shrl.put(bzz.tdhm_2(tbb3), tbb3);
                }
            }
        }
        catch (IOException iOException) {
            bzz.sdhh(iOException);
        }
    }

    private tbb khld_2(String string) {
        int n = -1158390827;
        n = Integer.rotateLeft(n * 976744061, 28) ^ 0x7E8CB292;
        n = System.identityHashCode(this) ^ n;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 23);
        int n2 = n ^ 0x2147130C;
        if ((n2 ^ n) != 558306060) {
            int cfr_ignored_0 = (0x9BB348D9 ^ n) + -1826193255;
        }
        String string3 = this.shtf(string);
        return (tbb)bzz.jkhth(this.shrl.values().stream().filter(arg_0 -> this.zthy_2(string3, arg_0)).findFirst(), null);
    }

    private String shtf(String string) {
        int n;
        int n2 = 1117384933;
        n2 = Integer.rotateLeft(n2 * 1598562841, 27) ^ 0x7F9707C6;
        n2 = System.identityHashCode(this) ^ n2;
        String string2 = string;
        n2 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n2;
        int n3 = n2 ^ 0x4AAAF054;
        if ((n3 ^ n2) != 1252716628) {
            int cfr_ignored_0 = (0x83300B1 ^ n2) - 550272499;
        }
        return (n = string.indexOf(Integer.rotateLeft(0x46E03498 ^ 0x46E0B498, 22))) >= 0 ? string.substring(n + 1) : string;
    }

    @Generated
    public static bzz zhs_7() {
        block0: {
            int n = shl_3.ghdj(1551280123);
            int n2 = n ^ 0xDA984082;
            if ((n2 ^ n) == -627556222) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x86EEE779 ^ n, 3) + 1531684578) * -2031163527;
            int cfr_ignored_1 = (int)(0x445C494427D4EB4FL ^ (long)n ^ 0x6FF8831A2DB92569L);
        }
        return dns;
    }

    @Generated
    public LinkedHashMap shzf() {
        block0: {
            int n = shl_3.ghdj(1482082961);
            int n2 = n ^ 0x702C7533;
            if ((n2 ^ n) == 1881961779) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x287ABFA2 ^ n, 8) + -348466215;
        }
        return this.shrl;
    }

    private boolean zthy_2(String string, tbb tbb2) {
        int n;
        block4: {
            try {
                int n2 = -1307906895;
                n2 = Integer.rotateLeft(n2 * -1492147147, 9) ^ 0xE1616E99;
                n2 = System.identityHashCode(this) ^ n2;
                String string2 = string;
                n2 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n2;
                int n3 = n2 ^ 0x714A1499;
                if ((n3 ^ n2) != 1900680345) {
                    int cfr_ignored_0 = (0xC340F828 ^ n2) + 817903705;
                }
                if ((0x117 & 0) != 0) {
                    throw new RuntimeException();
                }
            }
            catch (RuntimeException runtimeException) {
                throw null;
            }
            n = this.shtf(tbb2.getName()).equalsIgnoreCase(string);
            if (yf.tdhth_2() != 0) break block4;
            n = n ^ 0x5092;
        }
        return n != 0;
    }

    private static String jhs(String string, int n, int n2, int n3) {
        try {
            int n4 = -2074341679;
            n4 = Integer.rotateLeft(n4 * 682786111, 28) ^ 0x2D5E96A;
            n4 = Integer.rotateLeft(n ^ n4, 3);
            n4 = n2 ^ n4;
            int n5 = n4 ^ 0x7A97DEA8;
            if ((n5 ^ n4) != 2056773288) {
                int cfr_ignored_0 = (0xFECBD079 ^ n4) + 1308663137;
            }
            if ((0x197 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ n3 ^ 0x7021725F) + n2 ^ i * -880680563) ^ sth_5) + khdhs);
        }
        return new String(cArray);
    }

    private static boolean zhs_2() {
        block0: {
            int n = shl_3.ghdj(1501489518);
            int n2 = n ^ 0x3C030EF1;
            if ((n2 ^ n) == 1006833393) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x657DE79F ^ n, 15) - 1318890364) * 1702750111;
        }
        return yf.khdha_2();
    }

    private static void tfq() {
        int n = -137683297;
        int n2 = (n = Integer.rotateLeft(n * -357557573, 11) ^ 0xEC53EBB9) ^ 0xABDFEA11;
        if ((n2 ^ n) != -1411388911) {
            int cfr_ignored_0 = (0x5C14F48E ^ n) + 698191396;
        }
        yf.athz_2();
    }

    private static Collection zsh_9(LinkedHashMap linkedHashMap) {
        block0: {
            int n = 178814192;
            int n2 = (n = Integer.rotateLeft(n * 1739772401, 26) ^ 0xBB2BD69A) ^ 0x24E1E32A;
            if ((n2 ^ n) == 618783530) break block0;
            int cfr_ignored_0 = (0x2E499FDA ^ n) + -723308856;
        }
        return linkedHashMap.values();
    }

    private static Path jsa_2(File file) {
        block0: {
            int n = shl_3.ghdj(1295016151);
            File file2 = file;
            n = Integer.rotateLeft((file2 != null ? System.identityHashCode(file2) : 0) ^ n, 3);
            int n2 = n ^ 0x52F6BD46;
            if ((n2 ^ n) == 1391902022) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x1FC6DD91 ^ n, 6) + -579701814) * 533126545;
            int cfr_ignored_1 = (int)(0xDD7473AC27D4EB4FL ^ (long)n ^ 0x1A28831A2DB81739L);
        }
        return file.toPath();
    }

    private static boolean dkha_3(FileSystem fileSystem) {
        block0: {
            int n = shl_3.ghdj(-2068649338);
            int n2 = n ^ 0xFB3DDB07;
            if ((n2 ^ n) == -79832313) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x7F8F3181 ^ n, 18) + 1991548378;
            int cfr_ignored_1 = (int)(0xBD3D9FBC27D4EB4FL ^ (long)n ^ 0xC208831A2DB8D7AAL);
        }
        return fileSystem.isOpen();
    }

    private static Path khhl(File file) {
        block0: {
            int n = shl_3.ghdj(829188679);
            File file2 = file;
            n = Integer.rotateLeft((file2 != null ? System.identityHashCode(file2) : 0) ^ n, 21);
            int n2 = n ^ 0x52ACE5CE;
            if ((n2 ^ n) == 1387062734) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x63C08F89 ^ n, 15) + 414122194;
            int cfr_ignored_1 = (int)(0xA17221B427D4EB4FL ^ (long)n ^ 0xBE18831A2DB8EF35L);
        }
        return file.toPath();
    }

    private static boolean thdw_2(File file) {
        block0: {
            int n = 814258909;
            int n2 = (n = Integer.rotateLeft(n * 1751357185, 8) ^ 0xEB8FACF0) ^ 0x784A5642;
            if ((n2 ^ n) == 2018137666) break block0;
            int cfr_ignored_0 = (0x48C2CC9F ^ n) + 2127951865;
        }
        return file.mkdirs();
    }

    private static Object hma_2(Gson gson, String string, Type type) {
        block0: {
            int n = 1434657268;
            n = Integer.rotateLeft(n * 1073401693, 10) ^ 0x93198B03;
            Gson gson2 = gson;
            n = (gson2 != null ? System.identityHashCode(gson2) : 0) ^ n;
            Type type2 = type;
            n = Integer.rotateRight((type2 != null ? System.identityHashCode(type2) : 0) ^ n, 29);
            int n2 = n ^ 0x58C0AFE6;
            if ((n2 ^ n) == 1489022950) break block0;
            int cfr_ignored_0 = (0xD438E12 ^ n) - 1844076653;
        }
        return gson.fromJson(string, type);
    }

    private static Object dzl(LinkedHashMap linkedHashMap, Object object) {
        block0: {
            int n = -537791078;
            n = Integer.rotateLeft(n * 920102677, 24) ^ 0xD6AB1C0D;
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            n = (linkedHashMap2 != null ? System.identityHashCode(linkedHashMap2) : 0) ^ n;
            int n2 = n ^ 0xA327E2CA;
            if ((n2 ^ n) == -1557667126) break block0;
            int cfr_ignored_0 = (0x7CD61750 ^ n) - 1157855061;
        }
        return linkedHashMap.get(object);
    }

    private static void khah(tbb tbb2, float f) {
        int n = -308426116;
        n = Integer.rotateLeft(n * -857630119, 18) ^ 0xB3C3EA43;
        tbb tbb3 = tbb2;
        n = Integer.rotateRight((tbb3 != null ? System.identityHashCode(tbb3) : 0) ^ n, 25);
        int n2 = n ^ 0x711F6898;
        if ((n2 ^ n) != 1897883800) {
            int cfr_ignored_0 = (0x9C82A2E4 ^ n) + -1997141210;
        }
        tbb2.setY(f);
    }

    private static float dhbkh(tbb tbb2) {
        block0: {
            int n = 1185071397;
            int n2 = (n = Integer.rotateLeft(n * 1848066501, 20) ^ 0xBD9048CE) ^ 0x60C892F3;
            if ((n2 ^ n) == 1623757555) break block0;
            int cfr_ignored_0 = (0x266A53D6 ^ n) - 1338578784;
        }
        return tbb2.getScale();
    }

    private static String tdhm_2(tbb tbb2) {
        block0: {
            int n = -332989822;
            n = Integer.rotateLeft(n * -1302563019, 5) ^ 0x56030FD9;
            tbb tbb3 = tbb2;
            n = Integer.rotateLeft((tbb3 != null ? System.identityHashCode(tbb3) : 0) ^ n, 3);
            int n2 = n ^ 0x213EFB66;
            if ((n2 ^ n) == 557775718) break block0;
            int cfr_ignored_0 = (0xCD1801E4 ^ n) + 735816084;
        }
        return tbb2.getName();
    }

    private static void sdhh(IOException iOException) {
        int n = 1664842119;
        n = Integer.rotateLeft(n * 1573844593, 6) ^ 0x591B48A2;
        IOException iOException2 = iOException;
        n = (iOException2 != null ? System.identityHashCode(iOException2) : 0) ^ n;
        int n2 = n ^ 0x84A51DD2;
        if ((n2 ^ n) != -2069553710) {
            int cfr_ignored_0 = (0xE79E6455 ^ n) - -753908197;
        }
        iOException.printStackTrace();
    }

    private static Object jkhth(Optional optional, Object object) {
        block0: {
            int n = 35388727;
            int n2 = (n = Integer.rotateLeft(n * -722028591, 27) ^ 0x5D1BF297) ^ 0x3222386;
            if ((n2 ^ n) == 52568966) break block0;
            int cfr_ignored_0 = (0x139DEB1 ^ n) - 358758795;
        }
        return optional.orElse(object);
    }

    private static String[] zlth(String string) {
        block0: {
            int n = -1961558557;
            n = Integer.rotateLeft(n * -106494865, 7) ^ 0xC5A2F175;
            String string2 = string;
            n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 18);
            int n2 = n ^ 0xD3C7AFCB;
            if ((n2 ^ n) == -741888053) break block0;
            int cfr_ignored_0 = (0x58D35228 ^ n) + -1927474505;
        }
        return string.split("\u0001\u0010", -1);
    }

    private static CallSite shsw(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = 410222195;
            n3 = Integer.rotateLeft(n3 * -434913321, 12) ^ 0xB7F85F6A;
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 27);
            String string3 = string2;
            n3 = Integer.rotateRight((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 27);
            int n4 = n3 ^ 0x4654B108;
            if ((n4 ^ n3) != 1179955464) {
                int cfr_ignored_0 = (0x5E27CF7B ^ n3) - -1619711208;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ stz_2 ^ string.hashCode() ^ n2 + hghb ^ i * -1009460639 ^ stz_2, 21) ^ hghb));
            }
            String[] stringArray = bzz.zlth(new String(cArray));
            int n5 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType3) : lookup.findVirtual(clazz, stringArray[3], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] l5p9l4a044gde(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ocrcev5wi(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ lcuauzgwgq ^ string.hashCode()) + (n2 + vumdgvdl2) + i ^ lcuauzgwgq, 28) + vumdgvdl2);
            }
            String[] stringArray = bzz.l5p9l4a044gde(new String(cArray));
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

