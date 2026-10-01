/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import us.m0vy.moondlc.m0vyguard.bkha;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.ttk;
import us.m0vy.moondlc.m0vyguard.yf;
import us.movy.moondlc.Moondlc;

public class dht_6 {
    private final ConcurrentHashMap hghgh = new ConcurrentHashMap();
    private final Map hal_2 = new HashMap();
    private final Comparator jyd = Comparator.comparingInt(dht_6::hwz).reversed();
    private final BiConsumer trk = List::sort;
    private final Consumer sna = Throwable::printStackTrace;
    private static final int dfz = 391773569;
    private static final int rma = 1833562950;
    private static final int g7lwhp6f = -713670015;
    private static final int t3yh8arswf7 = 1966400429;
    private static final String DDDDDDDDDDDDDDDDDDDDDDDDDDD = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int cfz4u3f8tbvzz;

    public void sdz_4(Object object) {
        try {
            int n = 1420339400;
            n = Integer.rotateLeft(n * 2026704583, 10) ^ 0x29BFA198;
            n = System.identityHashCode(this) ^ n;
            Object object2 = object;
            n = Integer.rotateLeft((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 10);
            int n2 = n ^ 0xB41AABE0;
            if ((n2 ^ n) != -1273320480) {
                int cfr_ignored_0 = (0xE0B20328 ^ n) + -490395836;
            }
            if ((0x78 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            dht_6.ghtf_2();
        }
        dht_6.tdt_4(this, object, this::swy);
    }

    public void shbt_2(Object object) {
        int n = 0;
        int n2 = 1290993664;
        n2 = Integer.rotateLeft(n2 * 1608202203, 20) ^ 0xE918D8A8;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 17);
        int n3 = (n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210 ^ 0x30BCED6E ^ 0x30BCED6E;
        block29: while (true) {
            switch (n3 - 372016210 ^ 0x162C8452 ^ n2) {
                case 1048995770: {
                    int cfr_ignored_0 = Integer.rotateRight(0x2FD78BCF ^ n2, 8) - -814248628;
                    if (!yf.dnkh()) {
                        try {
                            ++n;
                            n3 = (n2 ^ 0xF4B0057D ^ 0x162C8452) + 372016210 ^ 0x7FC5B83A ^ 0x7FC5B83A;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            n3 = (n2 ^ 0xF4B0057D ^ 0x162C8452) + 372016210;
                        }
                        continue block29;
                    }
                    int cfr_ignored_1 = (int)(0xBA1176BEB96CF140L ^ (long)n2 ^ 0x100DBE6A19A6D9F3L);
                    n3 = (n2 ^ 0xCCB88B08 ^ 0x162C8452) + 372016210 + 151526514 - 151526514;
                    --n;
                    continue block29;
                }
                case -189790851: {
                    int cfr_ignored_2 = Integer.rotateLeft(0xA08DE0C9 ^ n2, 7) + 1972098962;
                    int cfr_ignored_3 = (int)(0x623F4EF427D4EB4FL ^ (long)n2 ^ 0x6098831A2DB969AFL);
                    this.tsdh_4(object, this::dha_10);
                    return;
                }
                case -860321016: {
                    int cfr_ignored_4 = Integer.rotateRight(0x29DC3DEE ^ n2, 8) - 369696525;
                    throw null;
                }
                case 1852037896: {
                    int cfr_ignored_5 = Integer.rotateLeft(0x74864661 ^ n2, 17) + 547366138;
                    int cfr_ignored_6 = (int)(0xB634E85C27D4EB4FL ^ (long)n2 ^ 0x2DC8831A2DB8C1B8L);
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xC6AF9125 ^ 0x162C8452) + 372016210));
                    int cfr_ignored_7 = Integer.rotateRight(0xF7B55E03 ^ n2, 17) + 55837080;
                    try {
                        n -= 2;
                        if ((0xC22E4137602637AFL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)((n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210) ^ 0xE33EE8FFBB67BDB3L ^ 0xE33EE8FFBB67BDB3L);
                    }
                    continue block29;
                }
                case -109679296: {
                    int cfr_ignored_8 = (Integer.rotateLeft(0x2C4D4A70 ^ n2, 8) + 1639555787) * 743262833;
                    try {
                        n3 = (n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210 ^ 0x2F0A56B ^ 0x2F0A56B;
                    }
                    continue block29;
                }
                case 1261768123: {
                    int cfr_ignored_9 = (Integer.rotateRight(0x61DD93 ^ n2, 3) + 272069640) * 6413715;
                    n3 = (n2 ^ 0xD63FAF15 ^ 0x162C8452) + 372016210 + 471649619 - 471649619;
                    int cfr_ignored_10 = (Integer.rotateLeft(0x2FB7747C ^ n2, 8) - -879445441) * 800552061;
                    n3 = (int)((long)((n2 ^ 0x8AD820F9 ^ 0x162C8452) + 372016210) ^ 0x10D81D2D540D5502L ^ 0x10D81D2D540D5502L);
                    int cfr_ignored_11 = Integer.rotateRight(0xFEF43DC3 ^ n2, 18) + -470738472;
                    n3 = (n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210 ^ 0xF7B98220 ^ 0xF7B98220;
                    n += 4;
                    continue block29;
                }
                case 699051066: {
                    int cfr_ignored_12 = (Integer.rotateRight(0x453EE032 ^ n2, 11) + 1727710537) * 1161748531;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xA2839F80 ^ 0x162C8452) + 372016210));
                    int cfr_ignored_13 = Integer.rotateLeft(0xCFE82CAC ^ n2, 12) - 830146575;
                    try {
                        n += 2;
                        if ((0x6735ECD92CCC2A2BL ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210;
                    }
                    n -= 5;
                    continue block29;
                }
                case -608016756: {
                    int cfr_ignored_14 = (Integer.rotateLeft(0x197FE6BD ^ n2, 6) - 450531358) * 427812541;
                    int cfr_ignored_15 = (int)(0xDBCD488027D4EB4FL ^ (long)n2 ^ 0x6C70831A2DB81A4BL);
                    n3 = (n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210;
                    n += 5;
                    continue block29;
                }
                case -40761027: {
                    int cfr_ignored_16 = Integer.rotateLeft(0xF8552729 ^ n2, 18) + 380460338;
                    int cfr_ignored_17 = (int)(0x3AE7891427D4EB4FL ^ (long)n2 ^ 0xEF58831A2DB9D81EL);
                    try {
                        if ((0x6323F11F18FF232BL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = (n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = (int)((long)((n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210) ^ 0x2288B96074C277FL ^ 0x2288B96074C277FL);
                    }
                    n -= 4;
                    continue block29;
                }
                case 3387378: {
                    int cfr_ignored_18 = Integer.rotateLeft(0xE1A20B68 ^ n2, 15) + 1459421395;
                    n3 = (int)((long)((n2 ^ 0x1422BB78 ^ 0x162C8452) + 372016210) ^ 0x762B7AB40A05FA9EL ^ 0x762B7AB40A05FA9EL);
                    int cfr_ignored_19 = Integer.rotateRight(0x8958B7E2 ^ n2, 4) + -1508121703;
                    int cfr_ignored_20 = (int)(0xBC26FFF06A37B267L ^ (long)n2 ^ 0x29018DC9FE8D59CL);
                    n3 = (n2 ^ 0xC07FFE2D ^ 0x162C8452) + 372016210 ^ 0x1FFA3697 ^ 0x1FFA3697;
                    int cfr_ignored_21 = (int)(0x26CAECA239666CDDL ^ (long)n2 ^ 0x2434BE7F229DE044L);
                    n3 = (n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210 + -1858306502 - -1858306502;
                    ++n;
                    continue block29;
                }
                case 161639408: {
                    int cfr_ignored_22 = Integer.rotateLeft(0xF0EA7EE5 ^ n2, 17) - 818085110;
                    int cfr_ignored_23 = (int)(0x3258D0D827D4EB4FL ^ (long)n2 ^ 0x5CC0831A2DB9C960L);
                    n3 = (n2 ^ 0xBFF03A9F ^ 0x162C8452) + 372016210;
                    int cfr_ignored_24 = Integer.rotateLeft(0x5CC69A1 ^ n2, 3) + -1205966406;
                    int cfr_ignored_25 = (int)(0xC77EC79C27D4EB4FL ^ (long)n2 ^ 0x7248831A2DB8232CL);
                    n3 = (n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210;
                    continue block29;
                }
                case 1121033748: {
                    int cfr_ignored_26 = Integer.rotateRight(0x46900ACB ^ n2, 11) + -1882264112;
                    n3 = (n2 ^ 0x44B482C8 ^ 0x162C8452) + 372016210;
                    int cfr_ignored_27 = Integer.rotateRight(0xBDCF100E ^ n2, 10) - 7377133;
                    try {
                        n -= 5;
                        if ((0x6902F438B611AE65L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210));
                    }
                    n -= 5;
                    continue block29;
                }
                case -2019178888: {
                    int cfr_ignored_28 = (Integer.rotateLeft(0x265AA1F4 ^ n2, 7) - -1453900857) * 643473909;
                    n3 = (n2 ^ 0x9362EC28 ^ 0x162C8452) + 372016210;
                    int cfr_ignored_29 = Integer.rotateRight(0x488CB72F ^ n2, 12) - -848835092;
                    try {
                        --n;
                        if ((0x859C8614F0E36FD1L ^ (long)n2 | 1L) == 0L) {
                            throw new UnsupportedOperationException();
                        }
                        n3 = (n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210 ^ 0x5EE67180 ^ 0x5EE67180;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = (int)((long)((n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210) ^ 0xC46A87C074057FB1L ^ 0xC46A87C074057FB1L);
                    }
                    n += 2;
                    continue block29;
                }
            }
            int cfr_ignored_30 = (Integer.rotateRight(0x65D90757 ^ n2, 15) - 1504019140) * 1708722007;
            n3 = (n2 ^ 0x3E8667BA ^ 0x162C8452) + 372016210;
        }
    }

    public void azj_2(ttk ttk2) {
        Class<?> clazz;
        List list;
        int n = 847435933;
        n = Integer.rotateLeft(n * -1629929331, 19) ^ 0x7EF20776;
        n = System.identityHashCode(this) ^ n;
        ttk ttk3 = ttk2;
        n = (ttk3 != null ? System.identityHashCode(ttk3) : 0) ^ n;
        int n2 = n ^ 0x52AA444E;
        if ((n2 ^ n) != 1386890318) {
            int cfr_ignored_0 = (0x60289CD3 ^ n) + -1795558501;
        }
        if ((list = (List)dht_6.tya(this.hghgh, clazz = ttk2.getClass())) != null && !Moondlc.INSTANCE.isPanic()) {
            for (bql bql2 : list) {
                try {
                    bql2.onEvent(ttk2);
                }
                catch (Throwable throwable) {
                    this.sna.accept(throwable);
                }
            }
        }
    }

    private void tsdh_4(Object object, BiConsumer biConsumer) {
        int n = bkha.jtd(-1907038850);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 11);
        Object object2 = object;
        n = (object2 != null ? System.identityHashCode(object2) : 0) ^ n;
        int n2 = n ^ 0xE0D3B54;
        if ((n2 ^ n) != 235748180) {
            int cfr_ignored_0 = Integer.rotateRight(0x8059DE2A ^ n, 3) + -1891662255;
        }
        for (Field field : dht_6.khda_4(this, object.getClass())) {
            bql bql2;
            if (field.getType() != bql.class || (bql2 = this.jfz(object, field)) == null) continue;
            Type type = ((ParameterizedType)field.getGenericType()).getActualTypeArguments()[0];
            biConsumer.accept(type, bql2);
        }
    }

    private Field[] tzs_3(Class clazz) {
        block0: {
            int n = -118314216;
            n = Integer.rotateLeft(n * -1927330027, 6) ^ 0x79894179;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x23D88420;
            if ((n2 ^ n) == 601392160) break block0;
            int cfr_ignored_0 = (0xDB2A2F38 ^ n) - -1047541694;
        }
        return this.hal_2.computeIfAbsent(clazz, dht_6::aqr);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private bql jfz(Object object, Field field) {
        Object var4_8;
        int n = 464575865;
        n = Integer.rotateLeft(n * 410683655, 4) ^ 0x41906C28;
        Field field2 = field;
        n = (field2 != null ? System.identityHashCode(field2) : 0) ^ n;
        int n2 = n ^ 0x7888A0AD;
        if ((n2 ^ n) != 2022219949) {
            int cfr_ignored_0 = (0x63387DD4 ^ n) + -2121891796;
        }
        boolean bl = field.canAccess(object);
        field.setAccessible(true);
        try {
            bql bql2 = (bql)field.get(object);
            return bql2;
        }
        catch (IllegalAccessException illegalAccessException) {
            this.sna.accept(illegalAccessException);
            var4_8 = null;
        }
        finally {
            field.setAccessible(bl);
        }
        return var4_8;
    }

    private static Field[] aqr(Class clazz) {
        int n = bkha.jtd(1128762458);
        Class clazz2 = clazz;
        n = Integer.rotateLeft((clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n, 16);
        int n2 = n ^ 0x7BF953B6;
        if ((n2 ^ n) != 2079937462) {
            int cfr_ignored_0 = Integer.rotateLeft(0x38BEDFEC ^ n, 10) - -478495537;
        }
        ArrayList<Field> arrayList = new ArrayList<Field>();
        for (Class clazz3 = clazz; clazz3 != null && clazz3 != Object.class; clazz3 = clazz3.getSuperclass()) {
            for (Field field : clazz3.getDeclaredFields()) {
                arrayList.add(field);
            }
        }
        return arrayList.toArray(new Field[0]);
    }

    private void dha_10(Type type, bql bql2) {
        int n = bkha.jtd(1295053105);
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 29);
        int n2 = n ^ 0x585239FF;
        if ((n2 ^ n) != 1481783807) {
            int cfr_ignored_0 = Integer.rotateRight(0x1562C8CE ^ n, 5) - -1688997843;
        }
        if (!yf.khdha_2()) {
            yf.athz_2();
            throw null;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList)this.hghgh.get(type);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(bql2);
            if (copyOnWriteArrayList.isEmpty()) {
                this.hghgh.remove(type);
            }
        }
    }

    private void swy(Type type, bql bql2) {
        int n = -1015888372;
        n = Integer.rotateLeft(n * -1313264075, 28) ^ 0xDD3F8A71;
        Type type2 = type;
        n = Integer.rotateRight((type2 != null ? System.identityHashCode(type2) : 0) ^ n, 7);
        bql bql3 = bql2;
        n = (bql3 != null ? System.identityHashCode(bql3) : 0) ^ n;
        int n2 = n ^ 0x9F90FE14;
        if ((n2 ^ n) != -1617887724) {
            int cfr_ignored_0 = (0x5CE23818 ^ n) - 1708568354;
        }
        this.hghgh.computeIfAbsent(type, dht_6::shys_2).add(bql2);
        this.trk.accept((List)this.hghgh.get(type), this.jyd);
    }

    private static CopyOnWriteArrayList shys_2(Type type) {
        int n = -982210299;
        int n2 = (n = Integer.rotateLeft(n * -778898189, 15) ^ 0x4502C437) ^ 0x353723C4;
        if ((n2 ^ n) != 892806084) {
            int cfr_ignored_0 = (0xF0438AC1 ^ n) - 158376657;
        }
        return new CopyOnWriteArrayList();
    }

    private static int hwz(bql bql2) {
        block0: {
            int n = 1153594219;
            int n2 = (n = Integer.rotateLeft(n * -1297823495, 10) ^ 0xF74C274A) ^ 0x62887896;
            if ((n2 ^ n) == 1653110934) break block0;
            int cfr_ignored_0 = (0x264A0BFD ^ n) - 1384785917;
        }
        return bql2.getPriority();
    }

    private static void ghtf_2() {
        int n = -505070289;
        int n2 = (n = Integer.rotateLeft(n * -1764188633, 6) ^ 0x4C65C1E9) ^ 0x3D0889CA;
        if ((n2 ^ n) != 1023969738) {
            int cfr_ignored_0 = (0xDCEDB4E5 ^ n) - -629604956;
        }
        yf.athz_2();
    }

    private static void tdt_4(dht_6 dht2, Object object, BiConsumer biConsumer) {
        int n = -1610725956;
        n = Integer.rotateLeft(n * -1388454003, 10) ^ 0x1FFB83C8;
        dht_6 dht3 = dht2;
        n = Integer.rotateRight((dht3 != null ? System.identityHashCode(dht3) : 0) ^ n, 22);
        BiConsumer biConsumer2 = biConsumer;
        n = (biConsumer2 != null ? System.identityHashCode(biConsumer2) : 0) ^ n;
        int n2 = n ^ 0x3A670DA2;
        if ((n2 ^ n) != 979832226) {
            int cfr_ignored_0 = (0xA599481E ^ n) - -1751001750;
        }
        dht2.tsdh_4(object, biConsumer);
    }

    private static Object tya(ConcurrentHashMap concurrentHashMap, Object object) {
        block0: {
            int n = -936433149;
            n = Integer.rotateLeft(n * 1575851273, 11) ^ 0x6214A305;
            ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
            n = (concurrentHashMap2 != null ? System.identityHashCode(concurrentHashMap2) : 0) ^ n;
            int n2 = n ^ 0xD96160A4;
            if ((n2 ^ n) == -647929692) break block0;
            int cfr_ignored_0 = (0x114E4AA7 ^ n) + 265533044;
        }
        return concurrentHashMap.get(object);
    }

    private static Field[] khda_4(dht_6 dht2, Class clazz) {
        block0: {
            int n = bkha.jtd(872370222);
            dht_6 dht3 = dht2;
            n = Integer.rotateRight((dht3 != null ? System.identityHashCode(dht3) : 0) ^ n, 19);
            Class clazz2 = clazz;
            n = Integer.rotateRight((clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n, 15);
            int n2 = n ^ 0xB9BA072;
            if ((n2 ^ n) == 194748530) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x3864F05C ^ n, 10) - -661210529) * 946139229;
        }
        return dht2.tzs_3(clazz);
    }

    private static String[] zdha_4(String string) {
        int n = bkha.jtd(-1729661818);
        int n2 = n ^ 0xBF51E80C;
        if ((n2 ^ n) != -1085151220) {
            int cfr_ignored_0 = Integer.rotateRight(0x27B69C8A ^ n, 7) + -746941455;
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite thmf(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1378059162;
            n3 = Integer.rotateLeft(n3 * -209577803, 25) ^ 0xBC703C64;
            MethodHandles.Lookup lookup2 = lookup;
            n3 = (lookup2 != null ? System.identityHashCode(lookup2) : 0) ^ n3;
            String string3 = string;
            n3 = (string3 != null ? System.identityHashCode(string3) : 0) ^ n3;
            int n4 = n3 ^ 0x90EE1EF9;
            if ((n4 ^ n3) != -1863442695) {
                int cfr_ignored_0 = (0x3D32629F ^ n3) - 1734317682;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ dfz ^ string.hashCode()) + (n2 + rma) + i ^ dfz, 5) + rma);
            }
            String[] stringArray = dht_6.zdha_4(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] ydgvx5rb(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite nil8b65v3s(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ g7lwhp6f ^ string.hashCode()) + (n2 + t3yh8arswf7) + i ^ g7lwhp6f, 7) + t3yh8arswf7);
            }
            String[] stringArray = dht_6.ydgvx5rb(new String(cArray));
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

    private static void DDDDDDDDDDDDDDDDDDDDDDDDDDD() {
    }
}

