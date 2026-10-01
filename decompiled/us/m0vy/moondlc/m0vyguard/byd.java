/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bdhb;
import us.m0vy.moondlc.m0vyguard.khn;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.nh_2;

public class byd
implements dl {
    private static final byd thdz_3;
    private final File dhsr_2 = new File(bdhb.hya_2 + "/macros.json");
    private final List dhadh_2 = new ArrayList();
    private static final int hhvato7dw = -782717065;
    private static final int vwcgzyb = 1551319897;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int tspp7qnhztevtw;

    public void zzl_3() {
        khn.khshn().dhssh_2(this.dhsr_2, this.dhadh_2);
    }

    public void ghzth_2() {
        khn.khshn().thqd_2(this.dhsr_2, this.dhadh_2);
    }

    public void tdr(String string, String string2, int n) {
        this.dhadh_2.add(new nh_2(string, string2, n));
        this.ghzth_2();
    }

    public void shhq_2(String string) {
        this.dhadh_2.removeIf(arg_0 -> byd.zs_3(string, arg_0));
        this.ghzth_2();
    }

    public boolean zqj(String string) {
        return this.dhadh_2.stream().anyMatch(arg_0 -> byd.afs(string, arg_0));
    }

    public void thdhw() {
        this.dhadh_2.clear();
        this.ghzth_2();
    }

    public void n_2(int n) {
        if (byd.mc.field_1724 == null) {
            return;
        }
        this.dhadh_2.stream().filter(arg_0 -> byd.aths(n, arg_0)).findFirst().ifPresent(byd::sshs);
    }

    @Generated
    public File rthz_2() {
        return this.dhsr_2;
    }

    @Generated
    public List khakh() {
        return this.dhadh_2;
    }

    @Generated
    public static byd bykh() {
        return thdz_3;
    }

    private static void sshs(nh_2 nh2) {
        if (nh2.kt.startsWith("/")) {
            byd.mc.field_1724.field_3944.method_45730(nh2.kt.replace("/", ""));
        } else {
            byd.mc.field_1724.field_3944.method_45729(nh2.kt);
        }
    }

    private static boolean aths(int n, nh_2 nh2) {
        return nh2.sshj_2() == n;
    }

    private static boolean afs(String string, nh_2 nh2) {
        return nh2.getName().equalsIgnoreCase(string);
    }

    private static boolean zs_3(String string, nh_2 nh2) {
        return nh2.getName().equalsIgnoreCase(string);
    }

    private static String[] tshwb9yp7e6h(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite oqhgc9jwqr(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ hhvato7dw ^ string.hashCode() ^ n2 + vwcgzyb + i * 936745117) + hhvato7dw) ^ vwcgzyb));
            }
            String[] stringArray = byd.tshwb9yp7e6h(new String(cArray));
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

