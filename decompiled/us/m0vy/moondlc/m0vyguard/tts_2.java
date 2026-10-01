/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.function.Predicate;
import us.m0vy.moondlc.m0vyguard.bad;
import us.m0vy.moondlc.m0vyguard.bad_2;
import us.m0vy.moondlc.m0vyguard.bsb;
import us.m0vy.moondlc.m0vyguard.hh_3;
import us.m0vy.moondlc.m0vyguard.yf;

public class tts_2 {
    private int zah_2 = 0;
    private final PriorityQueue jhk_2 = new PriorityQueue<bad_2>(Comparator.comparingInt(tts_2::ttr_3).reversed());
    private static final int bar = -762735023;
    private static final int twd_2 = 1236750197;
    private static final int ip4ipg3crj5u5 = -1045929353;
    private static final int j8pooei = 635764117;
    private static final String BBBBBBBBBBBBBBBBBB = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ";
    private static volatile /* synthetic */ int g8cil9plck7zl;

    public void hhk_2(int n) {
        this.zah_2 += n;
        while (!this.jhk_2.isEmpty() && ((bad_2)this.jhk_2.peek()).khkhk <= this.zah_2) {
            bad_2 bad2_2 = (bad_2)this.jhk_2.poll();
            bad2_2.khthk();
        }
    }

    public void zww(bad_2 bad2_2) {
        int n = hh_3.dzsh_4(-1839099228);
        int n2 = n ^ 0xAE35FC78;
        if ((n2 ^ n) != -1372193672) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x3C546EDC ^ n, 10) - 1385630687) * 1012166365;
        }
        tts_2.tbl_2(this.jhk_2, arg_0 -> tts_2.dkhth_2(bad2_2, arg_0));
        bad2_2.khkhk += this.zah_2;
        this.jhk_2.add(bad2_2);
    }

    public void hsh_4(Object object) {
        int n = -324601470;
        n = Integer.rotateLeft(n * 1988754219, 6) ^ 0x2EA4B1F5;
        Object object2 = object;
        n = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n, 8);
        int n2 = n ^ 0x27A50D95;
        if ((n2 ^ n) != 665128341) {
            int cfr_ignored_0 = (0xCB03F417 ^ n) - -1584468269;
        }
        this.jhk_2.removeIf(arg_0 -> tts_2.dhrl(object, arg_0));
    }

    public Object rghf() {
        Object object = null;
        int n = 0;
        int n2 = 1909424849;
        n2 = Integer.rotateLeft(n2 * 1489984325, 18) ^ 0xB1F80777;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = (n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604 ^ 0x49D9DFE1 ^ 0x49D9DFE1;
        while (true) {
            block40: {
                block46: {
                    block61: {
                        block57: {
                            block62: {
                                block53: {
                                    block47: {
                                        block50: {
                                            block49: {
                                                block48: {
                                                    block54: {
                                                        block64: {
                                                            block59: {
                                                                block55: {
                                                                    block45: {
                                                                        block56: {
                                                                            block60: {
                                                                                block43: {
                                                                                    block38: {
                                                                                        block63: {
                                                                                            block41: {
                                                                                                block39: {
                                                                                                    block42: {
                                                                                                        block58: {
                                                                                                            block51: {
                                                                                                                block52: {
                                                                                                                    block35: {
                                                                                                                        block44: {
                                                                                                                            block36: {
                                                                                                                                block37: {
                                                                                                                                    if ((n = n3 - -1821457604 ^ 0x936EC33C ^ n2) > -14571716) break block35;
                                                                                                                                    if (n > -1011398048) break block36;
                                                                                                                                    if (n > -1787287170) break block37;
                                                                                                                                    if (n == -1847685321) break block38;
                                                                                                                                    if (n == -1787287170) break block39;
                                                                                                                                    break block40;
                                                                                                                                }
                                                                                                                                if (n == -1608063319) break block41;
                                                                                                                                if (n == -1580223672) break block42;
                                                                                                                                int cfr_ignored_0 = Integer.rotateLeft(0xCCEF9D25 ^ n2, 12) - -715020618;
                                                                                                                                int cfr_ignored_1 = (int)(0xE5D331827D4EB4FL ^ (long)n2 ^ 0x9B40831A2DB9B16BL);
                                                                                                                                if (n == -1011398048) break block43;
                                                                                                                                break block40;
                                                                                                                            }
                                                                                                                            if (n > -696174485) break block44;
                                                                                                                            if (n == -920135278) break block45;
                                                                                                                            if (n == -740849058) break block46;
                                                                                                                            if (n == -696174485) break block47;
                                                                                                                            break block40;
                                                                                                                        }
                                                                                                                        if (n == -582675354) break block48;
                                                                                                                        if (n == -206681356) break block49;
                                                                                                                        if (n == -14571716) break block50;
                                                                                                                        break block40;
                                                                                                                    }
                                                                                                                    if (n > 906884635) break block51;
                                                                                                                    if (n > 303609817) break block52;
                                                                                                                    if (n == 7800621) break block53;
                                                                                                                    if (n == 303609817) break block54;
                                                                                                                    break block40;
                                                                                                                }
                                                                                                                if (n == 419792275) break block55;
                                                                                                                if (n == 692127600) break block56;
                                                                                                                if (n == 906884635) break block57;
                                                                                                                break block40;
                                                                                                            }
                                                                                                            if (n > 1401114367) break block58;
                                                                                                            if (n == 1177938046) break block59;
                                                                                                            if (n == 1237952317) break block60;
                                                                                                            if (n == 1401114367) break block61;
                                                                                                            break block40;
                                                                                                        }
                                                                                                        if (n == 1517352897) break block62;
                                                                                                        if (n == 1687205862) break block63;
                                                                                                        int cfr_ignored_2 = Integer.rotateLeft(0xADA492EC ^ n2, 8) - 189491663;
                                                                                                        if (n == 2074295779) break block64;
                                                                                                        break block40;
                                                                                                    }
                                                                                                    int cfr_ignored_3 = Integer.rotateRight(0x512173CF ^ n2, 13) - -680876724;
                                                                                                    if (!this.jhk_2.isEmpty()) {
                                                                                                        try {
                                                                                                            n -= 5;
                                                                                                            if ((0x236E86C5BD7AFDCBL ^ (long)n2 | 1L) == 0L) {
                                                                                                                throw new NoSuchElementException();
                                                                                                            }
                                                                                                            n3 = (n2 ^ 0xC3B74A60 ^ 0x936EC33C) + -1821457604;
                                                                                                        }
                                                                                                        catch (NoSuchElementException noSuchElementException) {
                                                                                                            n3 = (int)((long)((n2 ^ 0xC3B74A60 ^ 0x936EC33C) + -1821457604) ^ 0x2B1BB5B47589F1E9L ^ 0x2B1BB5B47589F1E9L);
                                                                                                        }
                                                                                                        n += 5;
                                                                                                        continue;
                                                                                                    }
                                                                                                    try {
                                                                                                        n -= 2;
                                                                                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x9578297E ^ 0x936EC33C) + -1821457604));
                                                                                                    }
                                                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                        n3 = Integer.reverse(Integer.reverse((n2 ^ 0x9578297E ^ 0x936EC33C) + -1821457604));
                                                                                                    }
                                                                                                    n += 3;
                                                                                                    continue;
                                                                                                }
                                                                                                int cfr_ignored_4 = (Integer.rotateLeft(0x65EF33B4 ^ n2, 15) - 1549066759) * 1710175157;
                                                                                                if (this.jhk_2.isEmpty()) {
                                                                                                    try {
                                                                                                        n += 3;
                                                                                                        if ((0x9F23D8D053AC74C3L ^ (long)n2 | 1L) == 0L) {
                                                                                                            throw new UnsupportedOperationException();
                                                                                                        }
                                                                                                        n3 = (int)((long)((n2 ^ 0x6490B7E6 ^ 0x936EC33C) + -1821457604) ^ 0xD49D569127EED0F5L ^ 0xD49D569127EED0F5L);
                                                                                                    }
                                                                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                                        n3 = (int)((long)((n2 ^ 0x6490B7E6 ^ 0x936EC33C) + -1821457604) ^ 0xB1F24CC29463A5D3L ^ 0xB1F24CC29463A5D3L);
                                                                                                    }
                                                                                                    n += 5;
                                                                                                    continue;
                                                                                                }
                                                                                                n3 = (n2 ^ 0xA026E6A9 ^ 0x936EC33C) + -1821457604 ^ 0x98E89FC6 ^ 0x98E89FC6;
                                                                                                int cfr_ignored_5 = Integer.rotateRight(0x9B39F6CE ^ n2, 6) - -798850515;
                                                                                                --n;
                                                                                                continue;
                                                                                            }
                                                                                            int cfr_ignored_6 = Integer.rotateRight(0xA7895F66 ^ n2, 7) - 1308634261;
                                                                                            object = ((bad_2)this.jhk_2.peek()).bdd_2;
                                                                                            try {
                                                                                                if ((0x18FFCABA195228CBL ^ (long)n2 | 1L) == 0L) {
                                                                                                    throw new NoSuchElementException();
                                                                                                }
                                                                                                n3 = Integer.reverse(Integer.reverse((n2 ^ 0xD3D78A5E ^ 0x936EC33C) + -1821457604));
                                                                                            }
                                                                                            catch (NoSuchElementException noSuchElementException) {
                                                                                                n3 = Integer.reverse(Integer.reverse((n2 ^ 0xD3D78A5E ^ 0x936EC33C) + -1821457604));
                                                                                            }
                                                                                            n -= 4;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_7 = Integer.rotateRight(0x2E6E2646 ^ n2, 8) - -1548467787;
                                                                                        object = null;
                                                                                        try {
                                                                                            if ((0x68848A258E55A4D1L ^ (long)n2 | 1L) == 0L) {
                                                                                                throw new UnsupportedOperationException();
                                                                                            }
                                                                                            n3 = (n2 ^ 0xD3D78A5E ^ 0x936EC33C) + -1821457604;
                                                                                        }
                                                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                                                            n3 = (n2 ^ 0xD3D78A5E ^ 0x936EC33C) + -1821457604;
                                                                                        }
                                                                                        n -= 2;
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_8 = (Integer.rotateLeft(0xD481735D ^ n2, 13) - -1073047682) * -729713827;
                                                                                    int cfr_ignored_9 = (int)(0x1633DD6027D4EB4FL ^ (long)n2 ^ 0x47B0831A2DB981B6L);
                                                                                    this.jhk_2.poll();
                                                                                    int cfr_ignored_10 = (int)(0x9CAC3DB7BDBAA750L ^ (long)n2 ^ 0x861FB7C6B5869489L);
                                                                                    n3 = (n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604 ^ 0x18AD034D ^ 0x18AD034D;
                                                                                    --n;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_11 = Integer.rotateRight(0xCF633D43 ^ n2, 12) + 560073304;
                                                                                if (((bad_2)tts_2.hrf((PriorityQueue)this.jhk_2)).khkhk > this.zah_2) {
                                                                                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x24435ABB ^ 0x936EC33C) + -1821457604));
                                                                                    int cfr_ignored_12 = (Integer.rotateRight(0xF2D44C5F ^ n2, 17) - 1813175996) * -220967841;
                                                                                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x49C9A73D ^ 0x936EC33C) + -1821457604));
                                                                                    continue;
                                                                                }
                                                                                try {
                                                                                    n += 4;
                                                                                    if ((0x5035F9E89C2F0BA1L ^ (long)n2 | 1L) == 0L) {
                                                                                        throw new ArithmeticException();
                                                                                    }
                                                                                    n3 = (n2 ^ 0x91DE8F37 ^ 0x936EC33C) + -1821457604;
                                                                                }
                                                                                catch (ArithmeticException arithmeticException) {
                                                                                    n3 = (n2 ^ 0x91DE8F37 ^ 0x936EC33C) + -1821457604 + -618983422 - -618983422;
                                                                                }
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_13 = (Integer.rotateRight(0x2F85DDBB ^ n2, 8) + -980191008) * 797302203;
                                                                            if (!tts_2.thza(((bad_2)this.jhk_2.peek()).zhkh)) {
                                                                                int cfr_ignored_14 = (int)(0xB5F6DA653AF99BA1L ^ (long)n2 ^ 0x49BAB940CC64C63CL);
                                                                                n3 = (n2 ^ 0x17FDDCDE ^ 0x936EC33C) + -1821457604 + 371674145 - 371674145;
                                                                                int cfr_ignored_15 = (int)(0x179915E83B93173DL ^ (long)n2 ^ 0xD6A0BB95D55D82E3L);
                                                                                n3 = (n2 ^ 0x91DE8F37 ^ 0x936EC33C) + -1821457604;
                                                                                n += 2;
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_16 = (int)(0xAD96F34AB91D18FAL ^ (long)n2 ^ 0x1BE5BE89CAD2F6FCL);
                                                                            n3 = (n2 ^ 0x6B5326B4 ^ 0x936EC33C) + -1821457604;
                                                                            int cfr_ignored_17 = (int)(0x37249A79091A946L ^ (long)n2 ^ 0x6E3FED90A9ABAB35L);
                                                                            n3 = (n2 ^ 0x9578297E ^ 0x936EC33C) + -1821457604;
                                                                            n -= 4;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_18 = (Integer.rotateLeft(0xAD8CE37C ^ n2, 8) - 141372223) * -1383275651;
                                                                        if (tts_2.thza(((bad_2)this.jhk_2.peek()).zhkh)) {
                                                                            n3 = (int)((long)((n2 ^ 0x9578297E ^ 0x936EC33C) + -1821457604) ^ 0xFC0ECFF1EE50A4B1L ^ 0xFC0ECFF1EE50A4B1L);
                                                                            n -= 5;
                                                                            continue;
                                                                        }
                                                                        try {
                                                                            if ((0xA412331AAD5A7DD7L ^ (long)n2 | 1L) == 0L) {
                                                                                throw new IllegalArgumentException();
                                                                            }
                                                                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0x91DE8F37 ^ 0x936EC33C) + -1821457604));
                                                                        }
                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                            n3 = (int)((long)((n2 ^ 0x91DE8F37 ^ 0x936EC33C) + -1821457604) ^ 0x9939FEBE6F498DB3L ^ 0x9939FEBE6F498DB3L);
                                                                        }
                                                                        n -= 4;
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_19 = (Integer.rotateRight(0x602D3DB6 ^ n2, 15) - -1445455803) * 1613577655;
                                                                    try {
                                                                        if ((0xCEDCD1FE8A2FBFA9L ^ (long)n2 | 1L) == 0L) {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                        n3 = (n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        n3 = (n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604 ^ 0xAD7D333B ^ 0xAD7D333B;
                                                                    }
                                                                    continue;
                                                                }
                                                                int cfr_ignored_20 = Integer.rotateRight(0x3D24FECA ^ n2, 10) + 1809349041;
                                                                n3 = (int)((long)((n2 ^ 0x37A778C9 ^ 0x936EC33C) + -1821457604) ^ 0x45F5C66734104D43L ^ 0x45F5C66734104D43L);
                                                                int cfr_ignored_21 = (Integer.rotateRight(0xB045C36 ^ n2, 4) - 1508166085) * 184835127;
                                                                n3 = (int)((long)((n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604) ^ 0xBE9D1A7B341BBF49L ^ 0xBE9D1A7B341BBF49L);
                                                                int cfr_ignored_22 = (Integer.rotateRight(0x727816BA ^ n2, 17) + -521642047) * 1920472763;
                                                                ++n;
                                                                continue;
                                                            }
                                                            int cfr_ignored_23 = Integer.rotateRight(0xAF2205EE ^ n2, 8) - 964450061;
                                                            n3 = (n2 ^ 0xFDB8C27A ^ 0x936EC33C) + -1821457604 ^ 0xD7BE2877 ^ 0xD7BE2877;
                                                            int cfr_ignored_24 = (Integer.rotateLeft(0xC624749C ^ n2, 11) - 46644767) * -970689379;
                                                            n3 = (n2 ^ 0xC4277B66 ^ 0x936EC33C) + -1821457604;
                                                            int cfr_ignored_25 = (Integer.rotateLeft(0x5395EA18 ^ n2, 13) + 595916835) * 1402333721;
                                                            n3 = Integer.reverse(Integer.reverse((n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604));
                                                            n -= 2;
                                                            continue;
                                                        }
                                                        int cfr_ignored_26 = Integer.rotateLeft(0xB8EE49CC ^ n2, 10) - 1765314287;
                                                        n3 = (n2 ^ 0x498382B9 ^ 0x936EC33C) + -1821457604;
                                                        int cfr_ignored_27 = (Integer.rotateLeft(0x727867FC ^ n2, 17) - -520997185) * 1920493565;
                                                        try {
                                                            if ((0x4044B3E349406A6BL ^ (long)n2 | 1L) == 0L) {
                                                                throw new IllegalArgumentException();
                                                            }
                                                            n3 = (n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604 ^ 0xFC2C3FEB ^ 0xFC2C3FEB;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            n3 = (n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604 + -1006736096 - -1006736096;
                                                        }
                                                        n += 5;
                                                        continue;
                                                    }
                                                    int cfr_ignored_28 = Integer.rotateRight(0x3B59780F ^ n2, 10) - 875768076;
                                                    n3 = (n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604 ^ 0xA5E27C8F ^ 0xA5E27C8F;
                                                    n += 2;
                                                    continue;
                                                }
                                                int cfr_ignored_29 = (Integer.rotateLeft(0xCFBBE71C ^ n2, 12) - 740203423) * -809769187;
                                                n3 = (int)((long)((n2 ^ 0x878B3175 ^ 0x936EC33C) + -1821457604) ^ 0x1BE21A1BC43AEA93L ^ 0x1BE21A1BC43AEA93L);
                                                int cfr_ignored_30 = (Integer.rotateLeft(0xB442525D ^ n2, 9) - -664430466) * -1270721955;
                                                int cfr_ignored_31 = (int)(0x76F0FC6027D4EB4FL ^ (long)n2 ^ 0x5B0831A2DB94030L);
                                                n3 = Integer.reverse(Integer.reverse((n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604));
                                                n += 2;
                                                continue;
                                            }
                                            int cfr_ignored_32 = (Integer.rotateLeft(0x644A37C ^ n2, 3) - -961713345) * 105161597;
                                            n3 = (n2 ^ 0x5C3F2CED ^ 0x936EC33C) + -1821457604 + -882632932 - -882632932;
                                            int cfr_ignored_33 = Integer.rotateRight(0xA5BE23A6 ^ n2, 7) - 375648341;
                                            n3 = (n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604 + -140099340 - -140099340;
                                            int cfr_ignored_34 = Integer.rotateRight(0x46B98886 ^ n2, 11) - -1797970059;
                                            continue;
                                        }
                                        int cfr_ignored_35 = Integer.rotateLeft(0xC58A2CC8 ^ n2, 11) + -266794125;
                                        n3 = (n2 ^ 0x49EA0B7B ^ 0x936EC33C) + -1821457604;
                                        int cfr_ignored_36 = (Integer.rotateLeft(0xBEF65D31 ^ n2, 10) + 607316010) * -1091150543;
                                        int cfr_ignored_37 = (int)(0x7C44F30C27D4EB4FL ^ (long)n2 ^ 0x1B68831A2DB95558L);
                                        n3 = (int)((long)((n2 ^ 0xE5AE7438 ^ 0x936EC33C) + -1821457604) ^ 0xD45DC6C2CBF46F11L ^ 0xD45DC6C2CBF46F11L);
                                        int cfr_ignored_38 = (Integer.rotateLeft(0xA2824FD0 ^ n2, 7) + -1306179221) * -1568518191;
                                        n3 = (n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604;
                                        continue;
                                    }
                                    int cfr_ignored_39 = Integer.rotateLeft(0x9C6867C9 ^ n2, 6) + -184405870;
                                    int cfr_ignored_40 = (int)(0x5EDAC9F427D4EB4FL ^ (long)n2 ^ 0x6E98831A2DB91064L);
                                    n3 = (int)((long)((n2 ^ 0x5660C6F4 ^ 0x936EC33C) + -1821457604) ^ 0x555DA9A518C6741CL ^ 0x555DA9A518C6741CL);
                                    int cfr_ignored_41 = Integer.rotateRight(0xA7719727 ^ n2, 7) - 1260317940;
                                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604));
                                    int cfr_ignored_42 = (Integer.rotateLeft(0xEF09C131 ^ n2, 16) + -158596054) * -284573391;
                                    int cfr_ignored_43 = (int)(0x2DBB6F0C27D4EB4FL ^ (long)n2 ^ 0x2368831A2DB9F6A7L);
                                    n += 3;
                                    continue;
                                }
                                int cfr_ignored_44 = Integer.rotateLeft(0xFEAEC628 ^ n2, 18) + -611869165;
                                n3 = Integer.reverse(Integer.reverse((n2 ^ 0x95D70B10 ^ 0x936EC33C) + -1821457604));
                                int cfr_ignored_45 = Integer.rotateRight(0xCC48384E ^ n2, 12) - -1055100755;
                                n3 = (int)((long)((n2 ^ 0xBA593FB7 ^ 0x936EC33C) + -1821457604) ^ 0x3FF80699B607B94CL ^ 0x3FF80699B607B94CL);
                                int cfr_ignored_46 = Integer.rotateRight(0x9C2891A7 ^ n2, 6) - -314097036;
                                n3 = (n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604;
                                --n;
                                continue;
                            }
                            int cfr_ignored_47 = Integer.rotateRight(0x7AE0AFAF ^ n2, 18) - -443357844;
                            n3 = (int)((long)((n2 ^ 0x4940E909 ^ 0x936EC33C) + -1821457604) ^ 0x9A529B62A305EBBCL ^ 0x9A529B62A305EBBCL);
                            int cfr_ignored_48 = (Integer.rotateLeft(0x3F260F78 ^ n2, 10) + -1443266877) * 1059458937;
                            n3 = (n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604;
                            n -= 3;
                            continue;
                        }
                        int cfr_ignored_49 = Integer.rotateRight(0x5129810A ^ n2, 13) + -664518799;
                        n3 = (int)((long)((n2 ^ 0xD29FDD81 ^ 0x936EC33C) + -1821457604) ^ 0xD47F407103197283L ^ 0xD47F407103197283L);
                        int cfr_ignored_50 = (Integer.rotateLeft(0x2CAAB3F1 ^ n2, 8) + 1829333354) * 749384689;
                        int cfr_ignored_51 = (int)(0xEE181DCC27D4EB4FL ^ (long)n2 ^ 0xC6E8831A2DB871E1L);
                        n3 = (n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604;
                        n += 4;
                        continue;
                    }
                    int cfr_ignored_52 = Integer.rotateRight(0xA5111B2A ^ n2, 7) + 24111441;
                    n3 = Integer.reverse(Integer.reverse((n2 ^ 0x874B13D0 ^ 0x936EC33C) + -1821457604));
                    int cfr_ignored_53 = Integer.rotateLeft(0xB2D3F884 ^ n2, 9) - -1408714953;
                    try {
                        --n;
                        if ((0xCD93F9B22155D4B3L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604 + 817382688 - 817382688;
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = (int)((long)((n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604) ^ 0x97FCE0D8B25EF3DBL ^ 0x97FCE0D8B25EF3DBL);
                    }
                    ++n;
                    continue;
                }
                return object;
            }
            int cfr_ignored_54 = Integer.rotateLeft(0xB5005BCD ^ n2, 9) - -278348530;
            int cfr_ignored_55 = (int)(0x77B2F5F027D4EB4FL ^ (long)n2 ^ 0x1690831A2DB942B4L);
            n3 = (n2 ^ 0xA1CFB348 ^ 0x936EC33C) + -1821457604;
        }
    }

    private static boolean thza(Object object) {
        boolean bl = false;
        int n = 0;
        int n2 = -60699017;
        n2 = Integer.rotateLeft(n2 * -1436974949, 25) ^ 0xDFF8C42E;
        Object object2 = object;
        n2 = Integer.rotateRight((object2 != null ? System.identityHashCode(object2) : 0) ^ n2, 4);
        int n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xA317ACDD, 25) ^ 0x1C108437488E1BB1L ^ 0x1C108437488E1BB1L);
        while (true) {
            block46: {
                block29: {
                    block40: {
                        block43: {
                            block39: {
                                block38: {
                                    block44: {
                                        block34: {
                                            block31: {
                                                block27: {
                                                    block36: {
                                                        block41: {
                                                            block42: {
                                                                block37: {
                                                                    block30: {
                                                                        block35: {
                                                                            block45: {
                                                                                block26: {
                                                                                    Object object3;
                                                                                    block32: {
                                                                                        block33: {
                                                                                            block28: {
                                                                                                if ((n = Integer.rotateRight(n3, 25) ^ n2) == 864193585) break block26;
                                                                                                if (n == -1668570095) break block27;
                                                                                                if (n == -1558729507) break block28;
                                                                                                if (n == -1754449505) break block29;
                                                                                                if (n == 1900734572) break block30;
                                                                                                if (n == -1910787482) break block31;
                                                                                                if (n == -1521916794) break block32;
                                                                                                if (n == 553433415) break block33;
                                                                                                if (n == -846900574) break block34;
                                                                                                if (n == -1609828113) break block35;
                                                                                                if (n == -2038040568) break block36;
                                                                                                if (n == -629727243) break block37;
                                                                                                if (n == 1310920447) break block38;
                                                                                                if (n == -2102096831) break block39;
                                                                                                if (n == 1035802548) break block40;
                                                                                                if (n == 272946407) break block41;
                                                                                                if (n == 847268562) break block42;
                                                                                                if (n == 487594099) break block43;
                                                                                                if (n == -465111170) break block44;
                                                                                                if (n == 598043308) break block45;
                                                                                                break block46;
                                                                                            }
                                                                                            int cfr_ignored_0 = Integer.rotateLeft(0x4D088280 ^ n2, 12) + 1483041979;
                                                                                            if (object instanceof bad) {
                                                                                                try {
                                                                                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x20FCB947, 25)));
                                                                                                }
                                                                                                catch (NoSuchElementException noSuchElementException) {
                                                                                                    n3 = Integer.rotateLeft(n2 ^ 0x20FCB947, 25);
                                                                                                }
                                                                                                n -= 2;
                                                                                                continue;
                                                                                            }
                                                                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x23A56AAC, 25)));
                                                                                            int cfr_ignored_1 = (Integer.rotateLeft(0x334E6ED1 ^ n2, 9) + 987564682) * 860778193;
                                                                                            int cfr_ignored_2 = (int)(0xF1FCC0EC27D4EB4FL ^ (long)n2 ^ 0x7CA8831A2DB84E28L);
                                                                                            n -= 3;
                                                                                            continue;
                                                                                        }
                                                                                        int cfr_ignored_3 = Integer.rotateRight(0xF14D2A6 ^ n2, 4) - -672980651;
                                                                                        object3 = (bad)object;
                                                                                        bl = tts_2.ryn((bad)object3);
                                                                                        try {
                                                                                            n3 = Integer.rotateLeft(n2 ^ 0x976D399F, 25) ^ 0x97BDB04E ^ 0x97BDB04E;
                                                                                        }
                                                                                        catch (ArithmeticException arithmeticException) {
                                                                                            n3 = Integer.rotateLeft(n2 ^ 0x976D399F, 25);
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_4 = (Integer.rotateLeft(0x942F3ED4 ^ n2, 5) - -166315289) * -1808843051;
                                                                                    object3 = (bsb)object;
                                                                                    bl = object3.rgha_2();
                                                                                    int cfr_ignored_5 = (int)(0x85640FA734A27719L ^ (long)n2 ^ 0xE23EA5F71514A719L);
                                                                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xEDFFD46C, 25) ^ 0x6AFDD25A8F5A9182L ^ 0x6AFDD25A8F5A9182L);
                                                                                    int cfr_ignored_6 = (int)(0x840BE56387471B21L ^ (long)n2 ^ 0x37B7C23DCD64A5C6L);
                                                                                    n3 = Integer.rotateLeft(n2 ^ 0x976D399F, 25) + 666593354 - 666593354;
                                                                                    ++n;
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_7 = (Integer.rotateRight(0x1663F63E ^ n2, 5) - -1166511939) * 375649855;
                                                                                bl = false;
                                                                                try {
                                                                                    n -= 2;
                                                                                    if ((0x993E2C8323D6BD33L ^ (long)n2 | 1L) == 0L) {
                                                                                        throw new ArithmeticException();
                                                                                    }
                                                                                    n3 = Integer.rotateLeft(n2 ^ 0x976D399F, 25);
                                                                                }
                                                                                catch (ArithmeticException arithmeticException) {
                                                                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x976D399F, 25) ^ 0xA0D68DA9A3764CF6L ^ 0xA0D68DA9A3764CF6L);
                                                                                }
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_8 = (Integer.rotateLeft(0x99E08E11 ^ n2, 6) + -1500589238) * -1713336815;
                                                                            int cfr_ignored_9 = (int)(0x5B52202C27D4EB4FL ^ (long)n2 ^ 0xBD28831A2DB91B75L);
                                                                            if (object instanceof bsb) {
                                                                                try {
                                                                                    n -= 5;
                                                                                    n3 = Integer.rotateLeft(n2 ^ 0xA5496486, 25);
                                                                                }
                                                                                catch (ArithmeticException arithmeticException) {
                                                                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xA5496486, 25)));
                                                                                }
                                                                                continue;
                                                                            }
                                                                            int cfr_ignored_10 = (int)(0x7DDE29F9D181472EL ^ (long)n2 ^ 0xAE836FB1757B566DL);
                                                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x1F23AFA9, 25)));
                                                                            int cfr_ignored_11 = (int)(0x9D659247C56F3CA9L ^ (long)n2 ^ 0xD9FF466D8274971AL);
                                                                            n3 = Integer.rotateLeft(n2 ^ 0x33828C31, 25) ^ 0xF4D44123 ^ 0xF4D44123;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_12 = Integer.rotateRight(0x616ABBC7 ^ n2, 15) - -800433068;
                                                                        n3 = Integer.rotateLeft(n2 ^ 0xAC9C7C19, 25);
                                                                        int cfr_ignored_13 = Integer.rotateLeft(0xD6931A1 ^ n2, 4) + -1541758534;
                                                                        int cfr_ignored_14 = (int)(0xCFDB9F9C27D4EB4FL ^ (long)n2 ^ 0xC248831A2DB83266L);
                                                                        try {
                                                                            ++n;
                                                                            n3 = Integer.rotateLeft(n2 ^ 0xA317ACDD, 25) ^ 0x6332CD89 ^ 0x6332CD89;
                                                                        }
                                                                        catch (IllegalStateException illegalStateException) {
                                                                            n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xA317ACDD, 25)));
                                                                        }
                                                                        continue;
                                                                    }
                                                                    int cfr_ignored_15 = Integer.rotateRight(0x485134CA ^ n2, 12) + -969735247;
                                                                    try {
                                                                        n3 = Integer.rotateLeft(n2 ^ 0xA317ACDD, 25) ^ 0x1C963170 ^ 0x1C963170;
                                                                    }
                                                                    catch (ArithmeticException arithmeticException) {
                                                                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xA317ACDD, 25)));
                                                                    }
                                                                    continue;
                                                                }
                                                                int cfr_ignored_16 = (Integer.rotateLeft(0xBAC9C171 ^ n2, 10) + -1563685910) * -1161182863;
                                                                int cfr_ignored_17 = (int)(0x787B6F4C27D4EB4FL ^ (long)n2 ^ 0x23E8831A2DB95D27L);
                                                                n3 = Integer.rotateLeft(n2 ^ 0xD12DCC4B, 25) + -340636958 - -340636958;
                                                                int cfr_ignored_18 = (Integer.rotateLeft(0x4BB095D0 ^ n2, 12) + 784319339) * 1269863889;
                                                                int cfr_ignored_19 = (int)(0x2E0CDAD5E12E4F63L ^ (long)n2 ^ 0x48DB0EEF65E1F1C8L);
                                                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x8BEC9540, 25) ^ 0x7026FC4F6751319DL ^ 0x7026FC4F6751319DL);
                                                                int cfr_ignored_20 = (int)(0x7F323AD263E5DCD1L ^ (long)n2 ^ 0x88D40B78428553B5L);
                                                                n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xA317ACDD, 25)));
                                                                n -= 2;
                                                                continue;
                                                            }
                                                            int cfr_ignored_21 = (Integer.rotateRight(0x66F1A95E ^ n2, 15) - 2074157469) * 1727113567;
                                                            n3 = Integer.rotateLeft(n2 ^ 0xA0051C3B, 25) + -1091207345 - -1091207345;
                                                            int cfr_ignored_22 = Integer.rotateLeft(0x28B3BAC1 ^ n2, 8) + -232702822;
                                                            int cfr_ignored_23 = (int)(0xEA0114FC27D4EB4FL ^ (long)n2 ^ 0xD488831A2DB879D3L);
                                                            int cfr_ignored_24 = (int)(0xA8774B7D1AD93EAEL ^ (long)n2 ^ 0x6B8AF901867AFD3FL);
                                                            n3 = Integer.rotateLeft(n2 ^ 0x696AD0C1, 25) ^ 0x94CAC73C ^ 0x94CAC73C;
                                                            int cfr_ignored_25 = (int)(0xCD7976A5DC30AC36L ^ (long)n2 ^ 0x103B74D2A34A3723L);
                                                            n3 = Integer.rotateLeft(n2 ^ 0xA317ACDD, 25);
                                                            n -= 2;
                                                            continue;
                                                        }
                                                        int cfr_ignored_26 = (Integer.rotateRight(0x7B8951FE ^ n2, 18) - -100758275) * 2072596991;
                                                        n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0x368AD420, 25)));
                                                        int cfr_ignored_27 = Integer.rotateRight(0x1A95934E ^ n2, 6) - 1014658477;
                                                        n3 = Integer.rotateLeft(n2 ^ 0xA317ACDD, 25) ^ 0x9C1BB64D ^ 0x9C1BB64D;
                                                        continue;
                                                    }
                                                    int cfr_ignored_28 = Integer.rotateLeft(0xC39432CD ^ n2, 11) - -1286617586;
                                                    int cfr_ignored_29 = (int)(0x1269CF027D4EB4FL ^ (long)n2 ^ 0xC490831A2DB9AF9CL);
                                                    n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x90E2E847, 25) ^ 0x61B6867518D57F6L ^ 0x61B6867518D57F6L);
                                                    int cfr_ignored_30 = Integer.rotateRight(0xCFCE6B6F ^ n2, 12) - 777822636;
                                                    n3 = Integer.rotateLeft(n2 ^ 0xA317ACDD, 25) + -1111787226 - -1111787226;
                                                    n -= 5;
                                                    continue;
                                                }
                                                int cfr_ignored_31 = Integer.rotateRight(0xF259DF0A ^ n2, 17) + 1564451185;
                                                try {
                                                    if ((0xC45031EF49843695L ^ (long)n2 | 1L) == 0L) {
                                                        throw new NoSuchElementException();
                                                    }
                                                    n3 = Integer.reverse(Integer.reverse(Integer.rotateLeft(n2 ^ 0xA317ACDD, 25)));
                                                }
                                                catch (NoSuchElementException noSuchElementException) {
                                                    n3 = Integer.rotateLeft(n2 ^ 0xA317ACDD, 25);
                                                }
                                                n += 5;
                                                continue;
                                            }
                                            int cfr_ignored_32 = (Integer.rotateRight(0xF37BC17 ^ n2, 4) - -602053116) * 255310871;
                                            try {
                                                n -= 2;
                                                if ((0xB4E1E9970559A265L ^ (long)n2 | 1L) == 0L) {
                                                    throw new IllegalArgumentException();
                                                }
                                                n3 = Integer.rotateLeft(n2 ^ 0xA317ACDD, 25) ^ 0xD42ED9CB ^ 0xD42ED9CB;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                n3 = Integer.rotateLeft(n2 ^ 0xA317ACDD, 25) ^ 0x2AF098C5 ^ 0x2AF098C5;
                                            }
                                            n -= 3;
                                            continue;
                                        }
                                        int cfr_ignored_33 = (Integer.rotateRight(0x57D2C39B ^ n2, 13) + -1495052544) * 1473430427;
                                        n3 = Integer.rotateLeft(n2 ^ 0x62CA581, 25) ^ 0x29D6E3BE ^ 0x29D6E3BE;
                                        int cfr_ignored_34 = (Integer.rotateRight(0x2C723717 ^ n2, 8) - 1714572036) * 745682711;
                                        try {
                                            n -= 3;
                                            n3 = Integer.rotateLeft(n2 ^ 0xA317ACDD, 25) + 1481645547 - 1481645547;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xA317ACDD, 25) ^ 0x3D3A0EC6360EC818L ^ 0x3D3A0EC6360EC818L);
                                        }
                                        continue;
                                    }
                                    int cfr_ignored_35 = Integer.rotateRight(0x371642C2 ^ n2, 9) + -1341147975;
                                    n3 = Integer.rotateLeft(n2 ^ 0x276D060F, 25) ^ 0xC3DA5E3C ^ 0xC3DA5E3C;
                                    int cfr_ignored_36 = (Integer.rotateLeft(0x28BA7DB4 ^ n2, 8) - -218966009) * 683310517;
                                    int cfr_ignored_37 = (int)(0xBB1AD72BE6B676AAL ^ (long)n2 ^ 0x532701DF1672DBE4L);
                                    n3 = Integer.rotateLeft(n2 ^ 0x7A24055B, 25) ^ 0x754A8FF4 ^ 0x754A8FF4;
                                    int cfr_ignored_38 = (int)(0x75777825F9629F3L ^ (long)n2 ^ 0x1274739FA8C1A37FL);
                                    n3 = Integer.rotateLeft(n2 ^ 0xA317ACDD, 25) ^ 0xA1F83C3C ^ 0xA1F83C3C;
                                    n -= 3;
                                    continue;
                                }
                                int cfr_ignored_39 = Integer.rotateRight(0xF148C00A ^ n2, 17) + 1009574001;
                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0x98B80B13, 25) ^ 0x331B701C81DF87AAL ^ 0x331B701C81DF87AAL);
                                int cfr_ignored_40 = Integer.rotateLeft(0x38AA3945 ^ n2, 10) - -520450410;
                                int cfr_ignored_41 = (int)(0xFA18977827D4EB4FL ^ (long)n2 ^ 0xD380831A2DB859E0L);
                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xC4D168E4, 25) ^ 0xA80D07A4C85D0E2L ^ 0xA80D07A4C85D0E2L);
                                int cfr_ignored_42 = Integer.rotateRight(0x60141FEB ^ n2, 15) + -1496482640;
                                n3 = Integer.rotateLeft(n2 ^ 0xA317ACDD, 25);
                                continue;
                            }
                            int cfr_ignored_43 = (Integer.rotateLeft(0x41C4531 ^ n2, 3) + -2083913686) * 68961585;
                            int cfr_ignored_44 = (int)(0xC6AEEB0C27D4EB4FL ^ (long)n2 ^ 0x2B68831A2DB8208CL);
                            try {
                                --n;
                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xA317ACDD, 25) ^ 0x1F102C55AFBB31DL ^ 0x1F102C55AFBB31DL);
                            }
                            catch (IllegalStateException illegalStateException) {
                                n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xA317ACDD, 25) ^ 0x20E89ABEE7FDAD4FL ^ 0x20E89ABEE7FDAD4FL);
                            }
                            continue;
                        }
                        int cfr_ignored_45 = Integer.rotateLeft(0x36B29B85 ^ n2, 9) - -1543605162;
                        int cfr_ignored_46 = (int)(0xF40035B827D4EB4FL ^ (long)n2 ^ 0x9600831A2DB845D1L);
                        n3 = Integer.rotateLeft(n2 ^ 0x89BED007, 25);
                        int cfr_ignored_47 = Integer.rotateLeft(0x3C04D281 ^ n2, 10) + 1223892186;
                        int cfr_ignored_48 = (int)(0xFEB67CBC27D4EB4FL ^ (long)n2 ^ 0x408831A2DB850BDL);
                        n3 = (int)((long)Integer.rotateLeft(n2 ^ 0xA317ACDD, 25) ^ 0x34ADAF7455CA1FEDL ^ 0x34ADAF7455CA1FEDL);
                        continue;
                    }
                    int cfr_ignored_49 = Integer.rotateRight(0x7411A787 ^ n2, 17) - 310438036;
                    n3 = Integer.rotateLeft(n2 ^ 0xA317ACDD, 25) ^ 0xEEAFFAB6 ^ 0xEEAFFAB6;
                    n += 2;
                    continue;
                }
                return bl;
            }
            int cfr_ignored_50 = Integer.rotateRight(0xE1416A0E ^ n2, 15) - 1263105773;
            n3 = Integer.rotateLeft(n2 ^ 0xA317ACDD, 25) ^ 0x1B82E318 ^ 0x1B82E318;
        }
    }

    private static boolean dhrl(Object object, bad_2 bad2_2) {
        int n = 129834775;
        n = Integer.rotateLeft(n * -1442019671, 16) ^ 0x376093EF;
        bad_2 bad3_2 = bad2_2;
        n = Integer.rotateLeft((bad3_2 != null ? System.identityHashCode(bad3_2) : 0) ^ n, 22);
        int n2 = n ^ 0xEE212749;
        if ((n2 ^ n) != -299817143) {
            int cfr_ignored_0 = (0xE99C385E ^ n) - 839747766;
        }
        return bad2_2.zhkh == object;
    }

    private static boolean dkhth_2(bad_2 bad2_2, bad_2 bad3_2) {
        int n = 841831648;
        n = Integer.rotateLeft(n * -1502760981, 14) ^ 0xD77E9160;
        bad_2 bad4 = bad2_2;
        n = (bad4 != null ? System.identityHashCode(bad4) : 0) ^ n;
        bad_2 bad5 = bad3_2;
        n = (bad5 != null ? System.identityHashCode(bad5) : 0) ^ n;
        int n2 = n ^ 0x64E9D590;
        if ((n2 ^ n) != 1693046160) {
            int cfr_ignored_0 = (0x56C48170 ^ n) + 1007189621;
        }
        if (yf.dnkh()) {
            throw null;
        }
        return bad3_2.zhkh == bad2_2.zhkh;
    }

    private static int ttr_3(bad_2 bad2_2) {
        block0: {
            int n = 210938054;
            n = Integer.rotateLeft(n * 356304675, 14) ^ 0x1E1AC9FD;
            bad_2 bad3_2 = bad2_2;
            n = (bad3_2 != null ? System.identityHashCode(bad3_2) : 0) ^ n;
            int n2 = n ^ 0xC7A5E34A;
            if ((n2 ^ n) == -945429686) break block0;
            int cfr_ignored_0 = (0xCB374B8C ^ n) + 1407985219;
        }
        return bad2_2.dsr;
    }

    private static boolean tbl_2(PriorityQueue priorityQueue, Predicate predicate) {
        block0: {
            int n = hh_3.dzsh_4(1071684994);
            PriorityQueue priorityQueue2 = priorityQueue;
            n = Integer.rotateLeft((priorityQueue2 != null ? System.identityHashCode(priorityQueue2) : 0) ^ n, 12);
            int n2 = n ^ 0x5171845;
            if ((n2 ^ n) == 85399621) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x3AF785C7 ^ n, 10) - 676778580;
        }
        return priorityQueue.removeIf(predicate);
    }

    private static Object hrf(PriorityQueue priorityQueue) {
        block0: {
            int n = 1176848821;
            n = Integer.rotateLeft(n * 2146009933, 23) ^ 0xF5826E10;
            PriorityQueue priorityQueue2 = priorityQueue;
            n = Integer.rotateLeft((priorityQueue2 != null ? System.identityHashCode(priorityQueue2) : 0) ^ n, 11);
            int n2 = n ^ 0x6CAE4CE3;
            if ((n2 ^ n) == 1823362275) break block0;
            int cfr_ignored_0 = (0x2A8B0556 ^ n) - -1482510689;
        }
        return priorityQueue.peek();
    }

    private static boolean ryn(bad bad2) {
        block0: {
            int n = 1764380520;
            int n2 = (n = Integer.rotateLeft(n * 1897558593, 24) ^ 0xB95BE42D) ^ 0xD296ED03;
            if ((n2 ^ n) == -761860861) break block0;
            int cfr_ignored_0 = (0xBBBCA26B ^ n) - -1031594574;
        }
        return bad2.hkha();
    }

    private static String[] dhaz_3(String string) {
        int n = 1428014527;
        int n2 = (n = Integer.rotateLeft(n * -316769465, 10) ^ 0xE2FB28E8) ^ 0xEF15211F;
        if ((n2 ^ n) != -283827937) {
            int cfr_ignored_0 = (0xBA08E4A0 ^ n) + -999951278;
        }
        String[] stringArray = new String[5];
        int n3 = 0;
        for (int i = 0; i < 5; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite hfgh(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -1575649721;
            n3 = Integer.rotateLeft(n3 * -628241123, 11) ^ 0xDD746B75;
            String string3 = string;
            n3 = Integer.rotateLeft((string3 != null ? System.identityHashCode(string3) : 0) ^ n3, 19);
            MethodType methodType2 = methodType;
            n3 = Integer.rotateRight((methodType2 != null ? System.identityHashCode(methodType2) : 0) ^ n3, 28);
            int n4 = n3 ^ 0xCBBF04AF;
            if ((n4 ^ n3) != -876673873) {
                int cfr_ignored_0 = (0x69AA7AE8 ^ n3) - 1323829045;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ bar ^ string.hashCode() ^ n2 + twd_2 + i * -1973558479) + bar) ^ twd_2));
            }
            String[] stringArray = tts_2.dhaz_3(new String(cArray));
            int n5 = Integer.parseInt(stringArray[1]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType3 = MethodType.fromMethodDescriptorString(stringArray[0], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[4], methodType3) : lookup.findVirtual(clazz, stringArray[4], methodType3);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] fui9zyh48dml(String string) {
        String[] stringArray = new String[4];
        int n = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n++);
            stringArray[i] = string.substring(n, n + c);
            n += c;
        }
        return stringArray;
    }

    private static CallSite o20blq817w45(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.rotateLeft(n ^ ip4ipg3crj5u5 ^ string.hashCode() ^ n2 + j8pooei ^ i * -666828007 ^ ip4ipg3crj5u5, 25) ^ j8pooei));
            }
            String[] stringArray = tts_2.fui9zyh48dml(new String(cArray));
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

