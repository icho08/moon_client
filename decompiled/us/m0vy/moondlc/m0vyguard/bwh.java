/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bdz;
import us.m0vy.moondlc.m0vyguard.baj_2;
import us.m0vy.moondlc.m0vyguard.bhn_2;
import us.m0vy.moondlc.m0vyguard.tbdh;

public class bwh
extends baj_2 {
    private final List dhhz;
    private boolean zaz = false;
    private boolean bsm_2 = false;
    private final bhn_2 zaz_4 = new bhn_2(250L, bdz.shll);
    private static final int o33mlc02wkfe = 1653653585;
    private static final int wd5dp15yn = -1684708461;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int zak4g3je5dvut;

    public boolean tsl_3() {
        return this.zaz;
    }

    public void dss_6(boolean bl) {
        this.zaz = bl;
    }

    public boolean tshd_3() {
        return this.bsm_2;
    }

    public void khmd(boolean bl) {
        this.bsm_2 = bl;
    }

    public bhn_2 zghsh_2() {
        return this.zaz_4;
    }

    public bwh(String string) {
        super(string);
        this.dhhz = new ArrayList();
    }

    public bwh(String string, tbdh ... tbdhArray) {
        super(string);
        this.dhhz = new ArrayList<tbdh>(Arrays.asList(tbdhArray));
    }

    public tbdh zdhs_2(String string) {
        return this.dhhz.stream().filter(arg_0 -> bwh.dsm_4(string, arg_0)).findFirst().orElse(null);
    }

    public static bwh zft_3(String string, List list) {
        tbdh[] tbdhArray = (tbdh[])list.stream().map(bwh::dar_4).toArray(bwh::jkhz);
        return new bwh(string, tbdhArray);
    }

    public tbdh rshkh(int n) {
        return (tbdh)this.dhhz.get(n);
    }

    public boolean dghn(String string) {
        tbdh tbdh2 = this.zdhs_2(string);
        return tbdh2 != null && tbdh2.bzth();
    }

    public boolean thfa(int n) {
        if (n >= this.shbh().size()) {
            return false;
        }
        tbdh tbdh2 = this.rshkh(n);
        return tbdh2 != null && tbdh2.bzth();
    }

    public List shsq() {
        return this.dhhz.stream().filter(tbdh::bzth).collect(Collectors.toList());
    }

    public List szw_4() {
        return this.dhhz.stream().filter(tbdh::bzth).map(tbdh::getName).collect(Collectors.toList());
    }

    @Override
    public void bm(JsonObject jsonObject) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        for (tbdh tbdh2 : this.shbh()) {
            if (this.zdhs_2(tbdh2.getName()).bzth()) {
                stringBuilder.append(tbdh2.getName()).append("\n");
            }
            ++n;
        }
        jsonObject.addProperty(this.getName(), stringBuilder.toString());
    }

    @Override
    public void bzk_2(JsonObject jsonObject) {
        String[] stringArray;
        this.shbh().forEach(bwh::zfk_2);
        String[] stringArray2 = stringArray = jsonObject.get(String.valueOf(this.zkhkh)).getAsString().split("\n");
        int n = stringArray.length;
        for (int i = 0; i < n; ++i) {
            String string = stringArray2[i];
            tbdh tbdh2 = this.zdhs_2(string);
            if (tbdh2 == null) continue;
            this.zdhs_2(string).zky(true);
        }
    }

    @Generated
    public List shbh() {
        return this.dhhz;
    }

    private static void zfk_2(tbdh tbdh2) {
        tbdh2.zky(false);
    }

    private static tbdh[] jkhz(int n) {
        return new tbdh[n];
    }

    private static tbdh dar_4(String string) {
        return new tbdh(string, true);
    }

    private static boolean dsm_4(String string, tbdh tbdh2) {
        return tbdh2.getName().equalsIgnoreCase(string);
    }

    private static String[] tjiu77ypb(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite rw56ok1bmoo(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ o33mlc02wkfe ^ string.hashCode()) + (n2 + wd5dp15yn) + i ^ o33mlc02wkfe, 17) + wd5dp15yn);
            }
            String[] stringArray = bwh.tjiu77ypb(new String(cArray));
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

    private static void BBBBBBBBBBBBBBBBBB() {
    }
}

