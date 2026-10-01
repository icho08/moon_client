/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  net.minecraft.class_2338
 *  net.minecraft.class_265
 *  net.minecraft.class_2680
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import lombok.Generated;
import net.minecraft.class_2338;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import us.m0vy.moondlc.m0vyguard.ttt;
import us.m0vy.moondlc.m0vyguard.lw;

public class bna_2
extends ttt {
    private final class_2680 dhwl;
    private final class_2338 shjn;
    private class_265 ha_3;
    private static final int oqjpjnozw2eyf = 1395370220;
    private static final int hd5a763et = -1722118660;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int g5su0arrfkbjk;

    @Generated
    public bna_2(class_2680 class_26802, class_2338 class_23382, class_265 class_2652) {
        this.dhwl = class_26802;
        this.shjn = class_23382;
        this.ha_3 = class_2652;
    }

    @Generated
    public class_2680 rkgh() {
        block0: {
            int n = 1954079752;
            n = Integer.rotateLeft(n * 1398694265, 14) ^ 0x7B4D4CC1;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xB0FC1154;
            if ((n2 ^ n) == -1325657772) break block0;
            int cfr_ignored_0 = (0xC484F55C ^ n) + -1040431576;
        }
        return this.dhwl;
    }

    @Generated
    public class_2338 hha_3() {
        block0: {
            int n = 525615308;
            n = Integer.rotateLeft(n * -1885203193, 8) ^ 0xD8939209;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 17);
            int n2 = n ^ 0xF5EFE441;
            if ((n2 ^ n) == -168827839) break block0;
            int cfr_ignored_0 = (0xEABBA48D ^ n) + 1077705057;
        }
        return this.shjn;
    }

    @Generated
    public class_265 sts_2() {
        block0: {
            int n = lw.jyw(-518037653);
            int n2 = n ^ 0xB71625DD;
            if ((n2 ^ n) == -1223285283) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x56097AB6 ^ n, 13) - 1870887749) * 1443461815;
        }
        return this.ha_3;
    }

    @Generated
    public void bghz_2(class_265 class_2652) {
        int n = -765827711;
        int n2 = (n = Integer.rotateLeft(n * 1660217105, 3) ^ 0xE416B1A9) ^ 0xAA69F448;
        if ((n2 ^ n) != -1435896760) {
            int cfr_ignored_0 = (0x783391C9 ^ n) + 2053365443;
        }
        this.ha_3 = class_2652;
    }

    private static String[] hix1srxxd(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite t2klkbyg(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ oqjpjnozw2eyf ^ string.hashCode() ^ n2 + hd5a763et + i * -1219194681) + oqjpjnozw2eyf) ^ hd5a763et));
            }
            String[] stringArray = bna_2.hix1srxxd(new String(cArray));
            int n3 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

