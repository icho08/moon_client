/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import us.m0vy.moondlc.m0vyguard.bfkh;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.fy;

public class khd
extends bfkh {
    private final List dd = new ArrayList();
    private fy dshsh;
    private boolean khy = false;
    private static final int ch21io6i3v15 = -1547520983;
    private static final int cudyjql8x4ue = -899350924;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int z83iiv9sevtu;

    public boolean zsm_2() {
        return this.khy;
    }

    public khd dhjdh(boolean bl) {
        this.khy = bl;
        return this;
    }

    public khd(@NotNull hy hy2, String string, String string2, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public khd(@NotNull hy hy2, String string, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public khd(@NotNull hy hy2, String string, String string2) {
        super(hy2, string);
    }

    public khd(@NotNull hy hy2, String string) {
        super(hy2, string);
    }

    public void ksh(fy fy2) {
        this.dd.add(fy2);
        if (this.dshsh == null) {
            this.dshsh = fy2;
        }
    }

    public boolean skhth(fy fy2) {
        return this.dshsh == fy2;
    }

    @Override
    public JsonElement tdkh() {
        return new JsonPrimitive(this.dshsh.getName());
    }

    public fy bfh_2() {
        List<fy> list = this.dd.stream().filter(fy::shghkh).toList();
        if (!list.isEmpty()) {
            Random random = new Random();
            return list.get(random.nextInt(list.size()));
        }
        return null;
    }

    @Override
    public void ha(JsonElement jsonElement) {
        String string = jsonElement.getAsString();
        for (fy fy2 : this.dd) {
            if (!fy2.getName().equalsIgnoreCase(string)) continue;
            this.dshsh = fy2;
            break;
        }
    }

    @Generated
    public List jsw() {
        return this.dd;
    }

    @Generated
    public fy sdh_2() {
        return this.dshsh;
    }

    @Generated
    public void dhtd_3(fy fy2) {
        this.dshsh = fy2;
    }

    public List swz_4() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (fy fy2 : this.dd) {
            arrayList.add(fy2.getName());
        }
        return arrayList;
    }

    public List rlz() {
        return this.swz_4();
    }

    public boolean dhbn(String string) {
        return this.dshsh != null && this.dshsh.getName().equalsIgnoreCase(string);
    }

    private static String[] pp1w6dr4ra(String string) {
        return string.split("\u0001\u0014", -1);
    }

    private static CallSite iy6i2zj3q(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ch21io6i3v15 ^ string.hashCode() ^ n2 + cudyjql8x4ue ^ i * 2136469245 ^ ch21io6i3v15, 15) ^ cudyjql8x4ue));
            }
            String[] stringArray = khd.pp1w6dr4ra(new String(cArray));
            int n3 = Integer.parseInt(stringArray[0]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[3], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[2], methodType2) : lookup.findVirtual(clazz, stringArray[2], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

