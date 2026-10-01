/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.GsonBuilder
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Type;
import java.util.List;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.baq;

public class khn {
    private static final khn shjh;
    private final GsonBuilder rss_2 = new GsonBuilder().setPrettyPrinting();
    private static final int ev1yayf = -413358167;
    private static final int uxsdb1cw09er = 743289501;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int tu4uat5qo;

    public void dhssh_2(File file, List list) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (Exception exception) {
                System.out.println(exception.getMessage());
                return;
            }
        }
        try (FileReader fileReader = new FileReader(file);){
            Type type = new baq(this).getType();
            List list2 = (List)this.rss_2.create().fromJson((Reader)fileReader, type);
            list.clear();
            if (list2 != null) {
                list.addAll(list2);
            }
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void thqd_2(File file, List list) {
        File file2 = file.getParentFile();
        if (file2 != null) {
            file2.mkdirs();
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (Exception exception) {
                System.out.println(exception.getMessage());
                return;
            }
        }
        try (FileWriter fileWriter = new FileWriter(file);){
            this.rss_2.create().toJson((Object)list, (Appendable)fileWriter);
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Generated
    public static khn khshn() {
        return shjh;
    }

    private static String[] vkmpo63t93(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite g9girnl6j(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ ev1yayf ^ string.hashCode() ^ n2 + uxsdb1cw09er + i * -1250316233) + ev1yayf) ^ uxsdb1cw09er));
            }
            String[] stringArray = khn.vkmpo63t93(new String(cArray));
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

    private static void SSSSSSSSSSSSSSSSSSSSS() {
    }
}

