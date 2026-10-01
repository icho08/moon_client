/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package us.m0vy.moondlc.m0vyguard;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import lombok.Generated;
import us.m0vy.moondlc.m0vyguard.bdhb;
import us.m0vy.moondlc.m0vyguard.brq;
import us.m0vy.moondlc.m0vyguard.sh_5;

public class btw {
    private static final btw zdh_5;
    private final Path thbdh = Paths.get(bdhb.hya_2, "last_skin");
    private final brq dk = new brq();
    private static final int lhuq457haxo = -1322509373;
    private static final int je7t00ll6 = 472908510;
    private static final String CCCCCCCCCCCCCCCCCCCCCC = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int nn0m1zqkwt4e;

    public void khjh_2() {
        try {
            if (!Files.exists(this.thbdh.getParent(), new LinkOption[0])) {
                Files.createDirectories(this.thbdh.getParent(), new FileAttribute[0]);
            }
            if (!Files.exists(this.thbdh, new LinkOption[0])) {
                Files.createFile(this.thbdh, new FileAttribute[0]);
                Files.writeString(this.thbdh, (CharSequence)"", new OpenOption[0]);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.zza();
    }

    public void rww(String string) {
        try {
            if (string != null && !string.trim().isEmpty()) {
                Files.writeString(this.thbdh, (CharSequence)string.trim(), new OpenOption[0]);
            } else {
                Files.writeString(this.thbdh, (CharSequence)"", new OpenOption[0]);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public String zza() {
        try {
            if (Files.exists(this.thbdh, new LinkOption[0])) {
                String string = Files.readString(this.thbdh);
                boolean bl = string.isEmpty();
                if (!bl) {
                    sh_5.tad_4 = true;
                }
                return bl ? null : string;
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return null;
    }

    public void sjb() {
        if (sh_5.tad_4 && this.dk.sza(2000L)) {
            sh_5.skhw_2 = sh_5.zks_3(this.zza());
            this.dk.tshf_2();
        }
    }

    @Generated
    public static btw jbh_2() {
        return zdh_5;
    }

    private static String[] n981j5ch2mw9o(String string) {
        return string.split("\u0003\u0011", -1);
    }

    private static CallSite v8ebduknku(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ lhuq457haxo ^ string.hashCode() ^ n2 + je7t00ll6 + i * -1367777927) + lhuq457haxo) ^ je7t00ll6));
            }
            String[] stringArray = btw.n981j5ch2mw9o(new String(cArray));
            int n3 = Integer.parseInt(stringArray[2]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n3 == 0 ? lookup.findStatic(clazz, stringArray[3], methodType2) : lookup.findVirtual(clazz, stringArray[3], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static void CCCCCCCCCCCCCCCCCCCCCC() {
    }
}

