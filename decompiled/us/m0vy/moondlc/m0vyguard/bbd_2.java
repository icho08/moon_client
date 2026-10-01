/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import us.m0vy.moondlc.m0vyguard.bfkh;
import us.m0vy.moondlc.m0vyguard.hy;
import us.m0vy.moondlc.m0vyguard.s_3;

public class bbd_2
extends bfkh {
    private final List aa_2 = new ArrayList();
    private List zaa = new ArrayList();
    private boolean sthsh_2;
    private int zkhf;
    private boolean zsdh_2 = false;
    private static final int y0d4y47u = 1232132782;
    private static final int ae1r08bl = 1472341217;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int ah8hrq3wba8ra6;

    public boolean thhy() {
        return this.zsdh_2;
    }

    public bbd_2 sshm(boolean bl) {
        this.zsdh_2 = bl;
        return this;
    }

    public bbd_2(@NotNull hy hy2, String string, String string2, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public bbd_2(@NotNull hy hy2, String string, @NotNull BooleanSupplier booleanSupplier) {
        super(hy2, string, booleanSupplier);
    }

    public bbd_2(@NotNull hy hy2, String string, String string2) {
        super(hy2, string);
    }

    public bbd_2(@NotNull hy hy2, String string) {
        super(hy2, string);
    }

    public bbd_2 ssh_2() {
        this.sthsh_2 = true;
        return this;
    }

    public bbd_2 khzq_2(int n) {
        this.zkhf = Math.max(0, n);
        return this;
    }

    public void qth(s_3 s2) {
        this.aa_2.add(s2);
    }

    public void rss(s_3 s2) {
        if (!this.zaa.contains(s2)) {
            this.zaa.add(s2);
        }
    }

    @Override
    public JsonElement tdkh() {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (Object object : this.zaa) {
            jsonArray.add((JsonElement)new JsonPrimitive(((s_3)object).getName()));
        }
        jsonObject.add("selected", (JsonElement)jsonArray);
        JsonArray jsonArray2 = new JsonArray();
        for (s_3 s2 : this.aa_2) {
            jsonArray2.add((JsonElement)new JsonPrimitive(s2.getName()));
        }
        jsonObject.add("order", (JsonElement)jsonArray2);
        return jsonObject;
    }

    @Override
    public void ha(JsonElement jsonElement) {
        this.zaa.clear();
        if (jsonElement.isJsonObject()) {
            Object object;
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            if (jsonObject.has("order")) {
                Object object2 = jsonObject.getAsJsonArray("order");
                object4 = new ArrayList();
                object = object2.iterator();
                while (object.hasNext()) {
                    Object object3 = (JsonElement)object.next();
                    String string = object3.getAsString();
                    this.aa_2.stream().filter(arg_0 -> bbd_2.rbsh(string, arg_0)).findFirst().ifPresent(((List)object4)::add);
                }
                for (Object object3 : this.aa_2) {
                    if (object4.contains(object3)) continue;
                    object4.add(object3);
                }
                this.aa_2.clear();
                this.aa_2.addAll(object4);
            }
            if (jsonObject.has("selected")) {
                for (Object object4 : jsonObject.getAsJsonArray("selected")) {
                    object = object4.getAsString();
                    this.aa_2.stream().filter(arg_0 -> bbd_2.zghm((String)object, arg_0)).findFirst().ifPresent(this.zaa::add);
                }
            }
        } else if (jsonElement.isJsonArray()) {
            for (Object object2 : jsonElement.getAsJsonArray()) {
                object4 = object2.getAsString();
                this.aa_2.stream().filter(arg_0 -> bbd_2.bzt_4((String)object4, arg_0)).findFirst().ifPresent(this.zaa::add);
            }
        }
        for (Object object2 : this.aa_2) {
            if (!((s_3)object2).khshm() || this.zaa.contains(object2)) continue;
            this.zaa.add(object2);
        }
        if (this.zaa.size() < this.zkhf) {
            this.aa_2.stream().filter(this::zb).limit(this.zkhf - this.zaa.size()).forEach(this.zaa::add);
        }
    }

    @Generated
    public List zskh_3() {
        return this.aa_2;
    }

    @Generated
    public List tkgh_2() {
        return this.zaa;
    }

    @Generated
    public boolean tzn_3(String string) {
        for (s_3 s2 : this.aa_2) {
            if (!s2.getName().equals(string) || !s2.alh()) continue;
            return true;
        }
        return false;
    }

    public boolean tby() {
        return this.sthsh_2;
    }

    @Generated
    public int zwa_3() {
        return this.zkhf;
    }

    @Generated
    public void skkh(List list) {
        this.zaa = list;
    }

    @Generated
    public void jthj(boolean bl) {
        this.sthsh_2 = bl;
    }

    @Generated
    public void ghsdh(int n) {
        this.zkhf = n;
    }

    private boolean zb(s_3 s2) {
        return !this.zaa.contains(s2);
    }

    private static boolean bzt_4(String string, s_3 s2) {
        return s2.getName().equalsIgnoreCase(string);
    }

    private static boolean zghm(String string, s_3 s2) {
        return s2.getName().equalsIgnoreCase(string);
    }

    private static boolean rbsh(String string, s_3 s2) {
        return s2.getName().equalsIgnoreCase(string);
    }

    private static String[] pyqxlmav9mr8pv(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite w4tcqiqpqnjyn(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ y0d4y47u ^ string.hashCode()) + (n2 + ae1r08bl) + i ^ y0d4y47u, 19) + ae1r08bl);
            }
            String[] stringArray = bbd_2.pyqxlmav9mr8pv(new String(cArray));
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

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

