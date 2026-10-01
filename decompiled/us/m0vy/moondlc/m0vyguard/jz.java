/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2708
 *  net.minecraft.class_2735
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import net.minecraft.class_2708;
import net.minecraft.class_2735;
import us.m0vy.moondlc.m0vyguard.bzw;
import us.m0vy.moondlc.m0vyguard.badh_2;
import us.m0vy.moondlc.m0vyguard.bql;
import us.m0vy.moondlc.m0vyguard.bksh;
import us.m0vy.moondlc.m0vyguard.bnq;
import us.m0vy.moondlc.m0vyguard.tq_2;
import us.m0vy.moondlc.m0vyguard.yf;
import us.m0vy.moondlc.m0vyguard.yn;
import us.movy.moondlc.mixin.accessors.PlayerPositionAccessor;

@tq_2(name="No Desync", category=bzw.OTHER, desc="Prevents client-server desynchronization")
public class jz
extends bnq {
    private final badh_2 tyq = new badh_2(this, "No Rotate").bts(true);
    private final bql<bksh> khthd = this::thwa_2;
    private static final int dhad_4 = -29511760;
    private static final int jadh = 295350290;
    private static final int xs8bjmv9y227i = 514548864;
    private static final int djakchi = -517387225;
    private static final String SSSSSSSSSSSSSSSSSSSSS = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ";
    private static volatile /* synthetic */ int kk7h79at7;

    private void thwa_2(bksh bksh2) {
        class_2708 class_27082;
        try {
            int n = 220145753;
            n = Integer.rotateLeft(n * 67543231, 18) ^ 0xB123E69C;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 22);
            bksh bksh3 = bksh2;
            n = Integer.rotateRight((bksh3 != null ? System.identityHashCode(bksh3) : 0) ^ n, 25);
            int n2 = n ^ 0x5E5CE6F2;
            if ((n2 ^ n) != 1583146738) {
                int cfr_ignored_0 = (0x5343CEAB ^ n) + -1392110880;
            }
            if ((0x2CB & 0) != 0) {
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
        if (jz.mc.field_1724 == null) {
            return;
        }
        if (bksh2.asw() instanceof class_2735) {
            bksh2.dhtd_2();
            yn.thsh(jz.mc.field_1724.method_31548().field_7545);
        }
        if (this.tyq.shzl() && bksh2.asw() instanceof class_2708 && (class_27082 = (class_2708)bksh2.asw()).comp_3228() != null) {
            PlayerPositionAccessor playerPositionAccessor = (PlayerPositionAccessor)class_27082.comp_3228();
            playerPositionAccessor.setYaw(jz.mc.field_1724.method_36454());
            playerPositionAccessor.setPitch(jz.mc.field_1724.method_36455());
        }
    }

    private static String thaq(String string, int n, int n2, int n3) {
        int n4 = -1645247651;
        n4 = Integer.rotateLeft(n4 * 121681843, 8) ^ 0xFC81CBB6;
        String string2 = string;
        n4 = (string2 != null ? System.identityHashCode(string2) : 0) ^ n4;
        int n5 = (n4 = n ^ n4) ^ 0x2AA5C5F1;
        if ((n5 ^ n4) != 715507185) {
            int cfr_ignored_0 = (0xB74A46AC ^ n4) - -1065728068;
        }
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length; ++i) {
            cArray[i] = (char)(cArray[i] ^ (Integer.rotateRight((n ^ n3 ^ 0x4E8A4645 ^ n2 - i) + jadh, 13) ^ dhad_4 + i * -125108621));
        }
        return new String(cArray);
    }

    private static String[] uvudvdh4eun(String string) {
        String[] stringArray = new String[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite xt1pkampeec(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ xs8bjmv9y227i ^ string.hashCode() ^ n2 + djakchi + i * 2033799563) + xs8bjmv9y227i) ^ djakchi));
            }
            String[] stringArray = jz.uvudvdh4eun(new String(cArray));
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

