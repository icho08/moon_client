/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import us.m0vy.moondlc.m0vyguard.bkt;
import us.m0vy.moondlc.m0vyguard.tthw;
import us.m0vy.moondlc.m0vyguard.tjq;
import us.m0vy.moondlc.m0vyguard.thz;
import us.m0vy.moondlc.m0vyguard.thw;
import us.m0vy.moondlc.m0vyguard.tdm;
import us.m0vy.moondlc.m0vyguard.fd;
import us.m0vy.moondlc.m0vyguard.lsh;
import us.movy.moondlc.Moondlc;

public class bkhl {
    private thz szf;
    private final List dshw = new ArrayList();
    private final thz ddt_3 = new thz("MoonDLC", new Color(190, 141, 255).getRGB(), new Color(168, 108, 255).getRGB());
    private final thz dkhw = new thz("Dark", new Color(40, 40, 40).getRGB(), new Color(20, 20, 20).getRGB());
    private final thz ztz_2 = new thz("Light", new Color(240, 240, 240).getRGB(), new Color(200, 200, 200).getRGB());
    private static final int p605ys9uds = -2099194706;
    private static final int zidcqi6jj3l = -266623923;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int t5qtl59h8by;

    public bkhl() {
        this.dshw.add(this.ddt_3);
        this.dshw.add(this.dkhw);
        this.dshw.add(this.ztz_2);
        this.szf = this.ddt_3;
        try {
            if (tthw.sfs_3().ttt_6().isEmpty()) {
                tthw.sfs_3().jkw();
            }
            this.rsb_2();
        }
        catch (RuntimeException runtimeException) {
            Moondlc.dhrn.error("Failed to initialize ClickGUI themes", (Throwable)runtimeException);
        }
    }

    public void rsb_2() {
        Object object2;
        ArrayList<thz> arrayList = new ArrayList<thz>();
        arrayList.add(this.ddt_3);
        arrayList.add(this.dkhw);
        arrayList.add(this.ztz_2);
        try {
            for (Object object2 : tthw.sfs_3().ttt_6()) {
                String string;
                if (object2 == null || ((thw)object2).ttkh_3() == null || (string = ((thw)object2).ttkh_3().getName()).equalsIgnoreCase("MoonDLC") || string.equalsIgnoreCase("Dark") || string.equalsIgnoreCase("Light") || string.equalsIgnoreCase("Moondlc")) continue;
                int n = ((thw)object2).ttkh_3().rdm_2().getRGB();
                int n2 = ((thw)object2).ttkh_3().shthz().getRGB();
                thz thz2 = bkhl.addh_2(this.dshw, string);
                if (thz2 == null) {
                    thz2 = new thz(string, n, n2);
                } else if (thz2.rtd_3() != n || thz2.dhdhh() != n2) {
                    thz2.rzh_4(thz2.rtd_3(), thz2.dhdhh());
                    thz2.jhn(n);
                    thz2.dhbq(n2);
                }
                if (bkhl.addh_2(arrayList, string) != null) continue;
                arrayList.add(thz2);
            }
        }
        catch (RuntimeException runtimeException) {
            Moondlc.dhrn.error("Failed to refresh ClickGUI themes", (Throwable)runtimeException);
        }
        Iterator iterator = this.szf == null ? null : this.szf.getName();
        this.dshw.clear();
        this.dshw.addAll(arrayList);
        object2 = bkhl.addh_2(this.dshw, iterator);
        this.szf = object2 == null ? this.ddt_3 : object2;
    }

    public bkt jthth(int n) {
        thz thz2 = this.bzm();
        return thz2 == null ? new bkt(255, 255, 255, 255) : tjq.zas_7(3, n, thz2.bzy(), thz2.adth_2());
    }

    public thz bzm() {
        try {
            fd fd2 = tthw.sfs_3().stm_3();
            if (!(fd2 == null || this.szf != null && this.szf.getName().equalsIgnoreCase(fd2.getName()))) {
                thz thz2 = bkhl.addh_2(this.dshw, fd2.getName());
                if (thz2 != null) {
                    this.szf = thz2;
                } else {
                    int n = fd2.rdm_2().getRGB();
                    int n2 = fd2.shthz().getRGB();
                    thz2 = new thz(fd2.getName(), n, n2);
                    this.dshw.add(thz2);
                    this.szf = thz2;
                }
            }
        }
        catch (RuntimeException runtimeException) {
            Moondlc.dhrn.error("Failed to synchronize the selected ClickGUI theme", (Throwable)runtimeException);
        }
        if (this.szf == null) {
            this.szf = this.ddt_3;
        }
        this.szf.shan_2().thdhsh(1.0f);
        return this.szf;
    }

    public List thtdh_2() {
        for (thz thz2 : this.dshw) {
            thz2.shrq().sby_2(thz2 == this.szf);
        }
        return new ArrayList(this.dshw);
    }

    public thz thgh() {
        return this.ddt_3;
    }

    public void rty_2(thz thz2) {
        if (thz2 == null) {
            return;
        }
        thz thz3 = this.bzm();
        thz2.rzh_4(thz3.rtd_3(), thz3.dhdhh());
        this.szf = thz2;
        try {
            fd fd2 = null;
            for (thw thw2 : tthw.sfs_3().ttt_6()) {
                if (thw2 == null || thw2.ttkh_3() == null || !thw2.ttkh_3().getName().equalsIgnoreCase(thz2.getName())) continue;
                fd2 = thw2.ttkh_3();
                break;
            }
            if (fd2 == null) {
                fd2 = bkhl.sddh(thz2);
                tthw.sfs_3().ttt_6().add(new thw(fd2));
                tdm.zkm_2().ghhth(fd2);
            }
            tthw.sfs_3().ghtz_2(fd2);
            tthw.sfs_3().thhsh(true);
        }
        catch (RuntimeException runtimeException) {
            Moondlc.dhrn.error("Failed to persist selected theme '{}'", (Object)thz2.getName(), (Object)runtimeException);
        }
    }

    private static thz addh_2(List list, String string) {
        if (string == null) {
            return null;
        }
        for (thz thz2 : list) {
            if (thz2 == null || !thz2.getName().equalsIgnoreCase(string)) continue;
            return thz2;
        }
        return null;
    }

    private static fd sddh(thz thz2) {
        fd fd2 = new fd(thz2.getName());
        for (lsh lsh2 : fd2.tjz()) {
            if (lsh2.getName().equalsIgnoreCase("Primary")) {
                lsh2.rhm(new Color(thz2.rtd_3(), true));
                continue;
            }
            if (!lsh2.getName().equalsIgnoreCase("Secondary")) continue;
            lsh2.rhm(new Color(thz2.dhdhh(), true));
        }
        return fd2;
    }

    private static String[] baa5z0ich(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite ncgbsusmuj(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ p605ys9uds ^ string.hashCode() ^ n2 + zidcqi6jj3l + i * 334035405) + p605ys9uds) ^ zidcqi6jj3l));
            }
            String[] stringArray = bkhl.baa5z0ich(new String(cArray));
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

