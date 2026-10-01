/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  lombok.Generated
 *  net.minecraft.class_1041
 *  net.minecraft.class_310
 *  net.minecraft.class_312
 */
package us.m0vy.moondlc.m0vyguard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import lombok.Generated;
import net.minecraft.class_1041;
import net.minecraft.class_310;
import net.minecraft.class_312;
import us.m0vy.moondlc.m0vyguard.brz;
import us.m0vy.moondlc.m0vyguard.bzz;
import us.m0vy.moondlc.m0vyguard.bsb;
import us.m0vy.moondlc.m0vyguard.dl;
import us.m0vy.moondlc.m0vyguard.rs;
import us.m0vy.moondlc.m0vyguard.kr;
import us.m0vy.moondlc.m0vyguard.lq;
import us.m0vy.moondlc.m0vyguard.ngh;
import us.m0vy.moondlc.m0vyguard.yf;

public class tbb
implements dl {
    @Expose
    @SerializedName(value="x")
    private float x;
    @Expose
    @SerializedName(value="y")
    private float y;
    public float initialXVal;
    public float initialYVal;
    private float startX;
    private float startY;
    private float dragStartX;
    private float dragStartY;
    private float resizeStartMouseX;
    private float resizeStartMouseY;
    private float resizeStartScale;
    private float resizeStartWidth;
    private float resizeStartHeight;
    private int shiftAxis;
    private boolean dragging;
    private boolean resizing;
    private float width = 0.0f;
    private float height = 0.0f;
    @Expose
    @SerializedName(value="scale")
    private float scale = 1.0f;
    @Expose
    @SerializedName(value="name")
    private final String name;
    private final bsb module;
    public static boolean dragBlocked;
    private static final int ds58rqbi9zjz = -1490255808;
    private static final int kvtwvl5j4q0o = 909886248;
    private static final int wk8a1bns = -99873073;
    private static final int f4w2dujze = -1933763921;
    private static final String AAAAAAAAAAAAAAAA = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ";
    private static volatile /* synthetic */ int fxdvuc3zw;

    public tbb(bsb bsb2, String string, float f, float f2) {
        this.module = bsb2;
        this.name = string;
        this.x = this.roundToHalf(f);
        this.y = this.roundToHalf(f2);
        this.initialXVal = f;
        this.initialYVal = f2;
        rs.tt().jkhh_2(new lq(-1, this::lambda$new$0));
    }

    public final void onDraw() {
        if (this.resizing) {
            float f = Math.max(20.0f, this.resizeStartWidth / Math.max(0.01f, this.resizeStartScale));
            float f2 = Math.max(20.0f, this.resizeStartHeight / Math.max(0.01f, this.resizeStartScale));
            float f3 = ((float)this.normaliseX() - this.resizeStartMouseX) / f;
            float f4 = ((float)this.normaliseY() - this.resizeStartMouseY) / f2;
            float f5 = Math.abs(f3) > Math.abs(f4) ? f3 : f4;
            this.setScale(this.roundToStep(this.resizeStartScale + f5, 0.02f));
            this.clampToScreen();
        } else if (this.dragging) {
            float f = (float)this.normaliseX() - this.startX;
            float f6 = (float)this.normaliseY() - this.startY;
            if (this.isShiftPressed()) {
                float f7;
                float f8;
                if (this.shiftAxis == 0 && Math.max(f8 = Math.abs(f - this.dragStartX), f7 = Math.abs(f6 - this.dragStartY)) > 2.0f) {
                    int n = this.shiftAxis = f8 >= f7 ? 1 : 2;
                }
                if (this.shiftAxis == 1) {
                    f6 = this.dragStartY;
                } else if (this.shiftAxis == 2) {
                    f = this.dragStartX;
                }
            } else {
                this.shiftAxis = 0;
            }
            this.x = this.roundToHalf(ngh.thnj(this.x, f, 0.15f));
            this.y = this.roundToHalf(ngh.thnj(this.y, f6, 0.15f));
            this.clampToScreen();
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void onClick(int var1_1) {
        var2_2 = false;
        var5_3 = 0;
        var3_4 = -1453191644;
        var3_4 = Integer.rotateLeft(var3_4 * -1591671221, 25) ^ 2063069889;
        var3_4 = Integer.rotateLeft(System.identityHashCode(this) ^ var3_4, 7);
        var4_5 = Integer.reverse(Integer.reverse(-731919532 * -181159063 + -1483452728 ^ var3_4));
        while (true) {
            block77: {
                block76: {
                    block87: {
                        block86: {
                            block83: {
                                block72: {
                                    block80: {
                                        block78: {
                                            block88: {
                                                block82: {
                                                    block71: {
                                                        block90: {
                                                            block91: {
                                                                block92: {
                                                                    block81: {
                                                                        block85: {
                                                                            block73: {
                                                                                block89: {
                                                                                    block74: {
                                                                                        block84: {
                                                                                            block75: {
                                                                                                block79: {
                                                                                                    block70: {
                                                                                                        var5_3 = ((var4_5 ^ var3_4) - -1483452728) * -370899751;
                                                                                                        switch (var5_3 & 15) {
                                                                                                            case 1: {
                                                                                                                if (var5_3 == -1603671423) break block70;
                                                                                                                if (var5_3 == 1165642129) break block71;
                                                                                                                if (var5_3 != 68135137) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block72;
                                                                                                            }
                                                                                                            case 4: {
                                                                                                                if (var5_3 == -731919532) break block73;
                                                                                                                if (var5_3 != -8975996) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block74;
                                                                                                            }
                                                                                                            case 5: {
                                                                                                                if (var5_3 != -1638506971) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block75;
                                                                                                            }
                                                                                                            case 6: {
                                                                                                                if (var5_3 == 1634876262) break block76;
                                                                                                                if (var5_3 != 871301862) {
                                                                                                                    (Integer.rotateRight(1005470519 ^ var3_4, 10) - 1178059492) * 1005470519;
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block77;
                                                                                                            }
                                                                                                            case 7: {
                                                                                                                if (var5_3 == 827625591) break block78;
                                                                                                                if (var5_3 == -2121628857) break;
                                                                                                                if (var5_3 != 58009575) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block79;
                                                                                                            }
                                                                                                            case 8: {
                                                                                                                if (var5_3 == 1510864264) break block80;
                                                                                                                if (var5_3 == 561372392) break block81;
                                                                                                                (Integer.rotateRight(-86789517 ^ var3_4, 18) + 1677736744) * -86789517;
                                                                                                                if (var5_3 != 1062910216) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block82;
                                                                                                            }
                                                                                                            case 9: {
                                                                                                                if (var5_3 != -1993801783) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block83;
                                                                                                            }
                                                                                                            case 10: {
                                                                                                                if (var5_3 != 1430408346) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block84;
                                                                                                            }
                                                                                                            case 12: {
                                                                                                                if (var5_3 != 708434300) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block85;
                                                                                                            }
                                                                                                            case 13: {
                                                                                                                if (var5_3 != -1947581507) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block86;
                                                                                                            }
                                                                                                            case 14: {
                                                                                                                if (var5_3 == -859497682) break block87;
                                                                                                                if (var5_3 == 1180995566) break block88;
                                                                                                                (Integer.rotateLeft(199877716 ^ var3_4, 4) - 1974486375) * 199877717;
                                                                                                                if (var5_3 == -2027903778) break block89;
                                                                                                                if (var5_3 != -292442658) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block90;
                                                                                                            }
                                                                                                            case 15: {
                                                                                                                if (var5_3 == -1854162673) break block91;
                                                                                                                if (var5_3 != -164870241) {
                                                                                                                    ** break;
                                                                                                                }
                                                                                                                break block92;
                                                                                                            }
                                                                                                        }
                                                                                                        Integer.rotateRight(300083019 ^ var3_4, 5) + 785883472;
                                                                                                        this.dragging = true;
                                                                                                        this.startX = (int)((float)this.normaliseX() - this.x);
                                                                                                        this.startY = (int)((float)tbb.wiiighayla3b29(this) - this.y);
                                                                                                        this.dragStartX = this.x;
                                                                                                        this.dragStartY = this.y;
                                                                                                        this.shiftAxis = 0;
                                                                                                        var4_5 = (int)((long)(1556263723 * -181159063 + -1483452728 ^ var3_4) ^ 4229690316777491641L ^ 4229690316777491641L);
                                                                                                        Integer.rotateRight(-882474809 ^ var3_4, 12) - -1513670828;
                                                                                                        var4_5 = Integer.reverse(Integer.reverse(1430408346 * -181159063 + -1483452728 ^ var3_4));
                                                                                                        continue;
                                                                                                    }
                                                                                                    (Integer.rotateLeft(676150365 ^ var3_4, 8) - -440930690) * 676150365;
                                                                                                    (int)(-1513330008090416305L ^ (long)var3_4 ^ -2760562423118661586L);
                                                                                                    if (var1_1 == 0) {
                                                                                                        var4_5 = 807495623 * -181159063 + -1483452728 ^ var3_4 ^ 847251048 ^ 847251048;
                                                                                                        (Integer.rotateLeft(1295091132 ^ var3_4, 12) - 1566363903) * 1295091133;
                                                                                                        var4_5 = (int)((long)(58009575 * -181159063 + -1483452728 ^ var3_4) ^ 1839118143744995756L ^ 1839118143744995756L);
                                                                                                        var5_3 += 4;
                                                                                                        continue;
                                                                                                    }
                                                                                                    try {
                                                                                                        if ((-930204458466644163L ^ (long)var3_4 | 1L) == 0L) {
                                                                                                            throw new UnsupportedOperationException();
                                                                                                        }
                                                                                                        var4_5 = -1638506971 * -181159063 + -1483452728 ^ var3_4 ^ 1594774446 ^ 1594774446;
                                                                                                    }
                                                                                                    catch (UnsupportedOperationException v0) {
                                                                                                        var4_5 = -1638506971 * -181159063 + -1483452728 ^ var3_4;
                                                                                                    }
                                                                                                    continue;
                                                                                                }
                                                                                                Integer.rotateRight(-205769074 ^ var3_4, 17) - -2010629523;
                                                                                                if (this.isHovering()) {
                                                                                                    var4_5 = (int)((long)(-8975996 * -181159063 + -1483452728 ^ var3_4) ^ -3431185237257008260L ^ -3431185237257008260L);
                                                                                                    continue;
                                                                                                }
                                                                                                var4_5 = 1822632301 * -181159063 + -1483452728 ^ var3_4;
                                                                                                Integer.rotateRight(-1591244978 ^ var3_4, 7) - -2010709587;
                                                                                                var4_5 = (int)((long)(1430408346 * -181159063 + -1483452728 ^ var3_4) ^ 6906585578399935553L ^ 6906585578399935553L);
                                                                                                var5_3 -= 3;
                                                                                                continue;
                                                                                            }
                                                                                            Integer.rotateRight(1694055887 ^ var3_4, 15) - 1049369420;
                                                                                            return;
                                                                                        }
                                                                                        (Integer.rotateRight(1365230718 ^ var3_4, 13) - -554276227) * 1365230719;
                                                                                        return;
                                                                                    }
                                                                                    (Integer.rotateLeft(-557922563 ^ var3_4, 14) - -42485794) * -557922563;
                                                                                    (int)(2021105507293784911L ^ (long)var3_4 ^ 3238232280538912201L);
                                                                                    var2_2 = tbb.ic6oxgke7u(tbb.pfjvvp8h7xu5(bzz.zhs_7())).stream().anyMatch((Predicate<tbb>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, isActive(), (Lus/m0vy/moondlc/m0vyguard/tbb;)Z)());
                                                                                    if (!var2_2) {
                                                                                        try {
                                                                                            var4_5 = -164870241 * -181159063 + -1483452728 ^ var3_4 ^ 1710567221 ^ 1710567221;
                                                                                        }
                                                                                        catch (IllegalArgumentException v1) {
                                                                                            var4_5 = (int)((long)(-164870241 * -181159063 + -1483452728 ^ var3_4) ^ -4575155166152288897L ^ -4575155166152288897L);
                                                                                        }
                                                                                        var5_3 += 2;
                                                                                        continue;
                                                                                    }
                                                                                    try {
                                                                                        var4_5 = -2027903778 * -181159063 + -1483452728 ^ var3_4;
                                                                                    }
                                                                                    catch (ArithmeticException v2) {
                                                                                        var4_5 = -2027903778 * -181159063 + -1483452728 ^ var3_4;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateRight(-112522466 ^ var3_4, 18) - 880015325) * -112522465;
                                                                                if (var2_2) {
                                                                                    try {
                                                                                        var5_3 += 3;
                                                                                        if ((187658150206071977L ^ (long)var3_4 | 1L) == 0L) {
                                                                                            throw new UnsupportedOperationException();
                                                                                        }
                                                                                        var4_5 = (int)((long)(-1638506971 * -181159063 + -1483452728 ^ var3_4) ^ -3577319329752131692L ^ -3577319329752131692L);
                                                                                    }
                                                                                    catch (UnsupportedOperationException v3) {
                                                                                        var4_5 = -1638506971 * -181159063 + -1483452728 ^ var3_4 ^ 1452307453 ^ 1452307453;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                var4_5 = (int)((long)(-354629362 * -181159063 + -1483452728 ^ var3_4) ^ -2580086828574524642L ^ -2580086828574524642L);
                                                                                (Integer.rotateLeft(-109252708 ^ var3_4, 18) - 981377823) * -109252707;
                                                                                var4_5 = -2121628857 * -181159063 + -1483452728 ^ var3_4;
                                                                                var5_3 += 4;
                                                                                continue;
                                                                            }
                                                                            Integer.rotateLeft(-1056144500 ^ var3_4, 11) - 1692503343;
                                                                            if (!tbb.dragBlocked) {
                                                                                var4_5 = (1467911764 * -181159063 + -1483452728 ^ var3_4) + -1517622915 - -1517622915;
                                                                                (Integer.rotateRight(-738820294 ^ var3_4, 13) + -1355348159) * -738820293;
                                                                                var4_5 = Integer.reverse(Integer.reverse(-1603671423 * -181159063 + -1483452728 ^ var3_4));
                                                                                continue;
                                                                            }
                                                                            (int)(-591326737489819656L ^ (long)var3_4 ^ -6656601969230724537L);
                                                                            var4_5 = 561372392 * -181159063 + -1483452728 ^ var3_4;
                                                                            var5_3 += 3;
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateLeft(-541120716 ^ var3_4, 14) - 478371463) * -541120715;
                                                                        this.resizing = true;
                                                                        this.resizeStartMouseX = tbb.jmxa2tdw7jcx5(this);
                                                                        this.resizeStartMouseY = this.normaliseY();
                                                                        this.resizeStartScale = this.scale;
                                                                        this.resizeStartWidth = this.getScaledWidth();
                                                                        this.resizeStartHeight = this.getScaledHeight();
                                                                        var4_5 = 740924499 * -181159063 + -1483452728 ^ var3_4 ^ 908867874 ^ 908867874;
                                                                        Integer.rotateLeft(139519041 ^ var3_4, 4) + 103367450;
                                                                        (int)(-3827414836206834865L ^ (long)var3_4 ^ 7604472119274518549L);
                                                                        var4_5 = (-1638506971 * -181159063 + -1483452728 ^ var3_4) + -1036791579 - -1036791579;
                                                                        var5_3 += 2;
                                                                        continue;
                                                                    }
                                                                    (Integer.rotateRight(616301747 ^ var3_4, 7) + 1998729448) * 616301747;
                                                                    return;
                                                                }
                                                                (Integer.rotateRight(-1292157286 ^ var3_4, 9) + -1328925727) * -1292157285;
                                                                if (this.isResizeHovering()) {
                                                                    try {
                                                                        if ((-7898895663055942203L ^ (long)var3_4 | 1L) == 0L) {
                                                                            throw new ArithmeticException();
                                                                        }
                                                                        var4_5 = (708434300 * -181159063 + -1483452728 ^ var3_4) + 8830661 - 8830661;
                                                                    }
                                                                    catch (ArithmeticException v4) {
                                                                        var4_5 = (int)((long)(708434300 * -181159063 + -1483452728 ^ var3_4) ^ -2357708796080095861L ^ -2357708796080095861L);
                                                                    }
                                                                    var5_3 += 5;
                                                                    continue;
                                                                }
                                                                try {
                                                                    var5_3 += 4;
                                                                    if ((1128034763948215905L ^ (long)var3_4 | 1L) == 0L) {
                                                                        throw new NoSuchElementException();
                                                                    }
                                                                    var4_5 = (int)((long)(-2027903778 * -181159063 + -1483452728 ^ var3_4) ^ 1295805157877160895L ^ 1295805157877160895L);
                                                                }
                                                                catch (NoSuchElementException v5) {
                                                                    var4_5 = (int)((long)(-2027903778 * -181159063 + -1483452728 ^ var3_4) ^ 8115097233301551555L ^ 8115097233301551555L);
                                                                }
                                                                var5_3 -= 4;
                                                                continue;
                                                            }
                                                            (Integer.rotateRight(-2004888290 ^ var3_4, 4) - -1948750371) * -2004888289;
                                                            var4_5 = (int)((long)(1437981643 * -181159063 + -1483452728 ^ var3_4) ^ 5921375765577759837L ^ 5921375765577759837L);
                                                            Integer.rotateRight(2025160966 ^ var3_4, 18) - -1571275019;
                                                            (int)(5112911033081063652L ^ (long)var3_4 ^ -7526287649822269384L);
                                                            var4_5 = (-731919532 * -181159063 + -1483452728 ^ var3_4) + 1066443562 - 1066443562;
                                                            continue;
                                                        }
                                                        Integer.rotateRight(-1993800989 ^ var3_4, 4) + -1605044040;
                                                        try {
                                                            var4_5 = (int)((long)(-731919532 * -181159063 + -1483452728 ^ var3_4) ^ 6080959629341115584L ^ 6080959629341115584L);
                                                        }
                                                        catch (NoSuchElementException v6) {
                                                            var4_5 = (int)((long)(-731919532 * -181159063 + -1483452728 ^ var3_4) ^ -6298092686471360499L ^ -6298092686471360499L);
                                                        }
                                                        --var5_3;
                                                        continue;
                                                    }
                                                    Integer.rotateRight(1647496647 ^ var3_4, 15) - -393967020;
                                                    var4_5 = (int)((long)(-1004102944 * -181159063 + -1483452728 ^ var3_4) ^ -8802317846858848283L ^ -8802317846858848283L);
                                                    (Integer.rotateLeft(-1414552071 ^ var3_4, 8) + -828196766) * -1414552071;
                                                    (int)(7574223085416803151L ^ (long)var3_4 ^ -1515317126150651925L);
                                                    var4_5 = Integer.reverse(Integer.reverse(-731919532 * -181159063 + -1483452728 ^ var3_4));
                                                    var5_3 -= 2;
                                                    continue;
                                                }
                                                (Integer.rotateRight(-1043153666 ^ var3_4, 11) - 2095219197) * -1043153665;
                                                try {
                                                    var5_3 -= 4;
                                                    if ((3214252509813026033L ^ (long)var3_4 | 1L) == 0L) {
                                                        throw new ArithmeticException();
                                                    }
                                                    var4_5 = (-731919532 * -181159063 + -1483452728 ^ var3_4) + -1194017773 - -1194017773;
                                                }
                                                catch (ArithmeticException v7) {
                                                    var4_5 = (int)((long)(-731919532 * -181159063 + -1483452728 ^ var3_4) ^ -7490007391079921410L ^ -7490007391079921410L);
                                                }
                                                var5_3 += 3;
                                                continue;
                                            }
                                            Integer.rotateLeft(1080302177 ^ var3_4, 11) + -797126406;
                                            (int)(-9018822895864583345L ^ (long)var3_4 ^ -7653723418256693124L);
                                            var4_5 = -731919532 * -181159063 + -1483452728 ^ var3_4 ^ 233598907 ^ 233598907;
                                            Integer.rotateRight(378593639 ^ var3_4, 5) - -1075254604;
                                            var5_3 -= 5;
                                            continue;
                                        }
                                        (Integer.rotateLeft(363270140 ^ var3_4, 5) - -1550283073) * 363270141;
                                        var4_5 = (int)((long)(-1718798447 * -181159063 + -1483452728 ^ var3_4) ^ -7560565171090681411L ^ -7560565171090681411L);
                                        (Integer.rotateLeft(-727018287 ^ var3_4, 13) + -989485942) * -727018287;
                                        (int)(1592087254230428495L ^ (long)var3_4 ^ -8599479340004441631L);
                                        try {
                                            ++var5_3;
                                            if ((9336164227992499L ^ (long)var3_4 | 1L) == 0L) {
                                                throw new UnsupportedOperationException();
                                            }
                                            var4_5 = -731919532 * -181159063 + -1483452728 ^ var3_4 ^ -145751680 ^ -145751680;
                                        }
                                        catch (UnsupportedOperationException v8) {
                                            var4_5 = (int)((long)(-731919532 * -181159063 + -1483452728 ^ var3_4) ^ -5363340257457015990L ^ -5363340257457015990L);
                                        }
                                        var5_3 -= 3;
                                        continue;
                                    }
                                    Integer.rotateLeft(1682116324 ^ var3_4, 15) - 679242967;
                                    var4_5 = (int)((long)(-1187000514 * -181159063 + -1483452728 ^ var3_4) ^ -1702595958711098057L ^ -1702595958711098057L);
                                    (Integer.rotateRight(228217279 ^ var3_4, 4) - -1441954468) * 228217279;
                                    try {
                                        var5_3 += 3;
                                        if ((1306633146402082175L ^ (long)var3_4 | 1L) == 0L) {
                                            throw new ArithmeticException();
                                        }
                                        var4_5 = (-731919532 * -181159063 + -1483452728 ^ var3_4) + 717229043 - 717229043;
                                    }
                                    catch (ArithmeticException v9) {
                                        var4_5 = -731919532 * -181159063 + -1483452728 ^ var3_4;
                                    }
                                    var5_3 += 5;
                                    continue;
                                }
                                Integer.rotateRight(525321347 ^ var3_4, 6) + -821662952;
                                try {
                                    if ((1137853483279855361L ^ (long)var3_4 | 1L) == 0L) {
                                        throw new NoSuchElementException();
                                    }
                                    var4_5 = Integer.reverse(Integer.reverse(-731919532 * -181159063 + -1483452728 ^ var3_4));
                                }
                                catch (NoSuchElementException v10) {
                                    var4_5 = Integer.reverse(Integer.reverse(-731919532 * -181159063 + -1483452728 ^ var3_4));
                                }
                                --var5_3;
                                continue;
                            }
                            (Integer.rotateLeft(1211033017 ^ var3_4, 12) + -1039437662) * 1211033017;
                            (int)(-8458802969132602545L ^ (long)var3_4 ^ 7672026113685108969L);
                            (int)(5292447786678878526L ^ (long)var3_4 ^ -1800993260360220876L);
                            var4_5 = -731919532 * -181159063 + -1483452728 ^ var3_4 ^ -786860268 ^ -786860268;
                            var5_3 += 4;
                            continue;
                        }
                        Integer.rotateRight(-147916818 ^ var3_4, 17) - -217209587;
                        var4_5 = -1378760203 * -181159063 + -1483452728 ^ var3_4;
                        (Integer.rotateRight(-490028649 ^ var3_4, 15) - 2062225540) * -490028649;
                        var4_5 = -731919532 * -181159063 + -1483452728 ^ var3_4;
                        var5_3 -= 3;
                        continue;
                    }
                    Integer.rotateLeft(1181886061 ^ var3_4, 11) - -1942993298;
                    (int)(-8880948587327591601L ^ (long)var3_4 ^ -1310403343105350576L);
                    try {
                        var4_5 = (int)((long)(-731919532 * -181159063 + -1483452728 ^ var3_4) ^ -6187115399116237540L ^ -6187115399116237540L);
                    }
                    catch (ArithmeticException v11) {
                        var4_5 = -731919532 * -181159063 + -1483452728 ^ var3_4 ^ -1182530848 ^ -1182530848;
                    }
                    var5_3 += 3;
                    continue;
                }
                (Integer.rotateLeft(2080984341 ^ var3_4, 18) - 159249606) * 2080984341;
                (int)(-4702915624251888817L ^ (long)var3_4 ^ 4260549395951964326L);
                try {
                    --var5_3;
                    if ((-1983350689175396143L ^ (long)var3_4 | 1L) == 0L) {
                        throw new ArithmeticException();
                    }
                    var4_5 = Integer.reverse(Integer.reverse(-731919532 * -181159063 + -1483452728 ^ var3_4));
                }
                catch (ArithmeticException v12) {
                    var4_5 = -731919532 * -181159063 + -1483452728 ^ var3_4 ^ 1198895156 ^ 1198895156;
                }
                var5_3 -= 4;
                continue;
            }
            Integer.rotateLeft(-768671839 ^ var3_4, 13) + 2014221242;
            (int)(1196921332098722639L ^ (long)var3_4 ^ 6793824186347916521L);
            try {
                --var5_3;
                var4_5 = (int)((long)(-731919532 * -181159063 + -1483452728 ^ var3_4) ^ 9092266960102289211L ^ 9092266960102289211L);
            }
            catch (ArithmeticException v13) {
                var4_5 = (-731919532 * -181159063 + -1483452728 ^ var3_4) + 1505027230 - 1505027230;
            }
            continue;
lbl384:
            // 13 sources

            Integer.rotateRight(-1495318193 ^ var3_4, 7) - 963020748;
            var4_5 = (-731919532 * -181159063 + -1483452728 ^ var3_4) + -247630930 - -247630930;
        }
    }

    public final void onRelease(int n) {
        int n2 = 1516601573;
        n2 = Integer.rotateLeft(n2 * 889450927, 21) ^ 0x7013FA34;
        n2 = Integer.rotateRight(System.identityHashCode(this) ^ n2, 21);
        int n3 = n2 ^ 0x55CB958C;
        if ((n3 ^ n2) != 1439405452) {
            int cfr_ignored_0 = (0xFAE1569 ^ n2) - -1875444139;
        }
        if (n == 0) {
            boolean bl = this.dragging || this.resizing;
            this.dragging = false;
            this.resizing = false;
            this.shiftAxis = 0;
            if (bl) {
                tbb.r62vrnaydwl().asd();
            }
        }
    }

    public boolean isHovering() {
        int n = -2049375775;
        int n2 = (n = Integer.rotateLeft(n * 545336183, 9) ^ 0xED13FFB6) ^ 0x8417B9AD;
        if ((n2 ^ n) != -2078819923) {
            int cfr_ignored_0 = (0x1CEB84C ^ n) - 1036560542;
        }
        return (float)this.normaliseX() > Math.min(this.x, this.x + tbb.psn40u1f(this)) && (float)tbb.h7uzuhy3(this) < tbb.x0k7zc7mujphl4z(this.x, this.x + this.getScaledWidth()) && (float)this.normaliseY() > Math.min(this.y, this.y + this.getScaledHeight()) && (float)this.normaliseY() < Math.max(this.y, this.y + this.getScaledHeight());
    }

    public boolean isResizeHovering() {
        int n = kr.rst_2(-1521668679);
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x60956657;
        if ((n2 ^ n) != 1620403799) {
            int cfr_ignored_0 = Integer.rotateRight(0xC5D84BEE ^ n, 11) - -108080883;
        }
        if (tbb.pkwa56kw5akd8(this) <= 0.0f || this.getScaledHeight() <= 0.0f) {
            return false;
        }
        float f = this.getResizeHandleSize();
        float f2 = this.x + tbb.s00u4cyod0a(this) - f;
        float f3 = this.y + this.getScaledHeight() - f;
        return (float)this.normaliseX() >= f2 && (float)tbb.q5qydajp151(this) <= f2 + f && (float)tbb.dqwzkw7fuw(this) >= f3 && (float)this.normaliseY() <= f3 + f;
    }

    public boolean isActive() {
        try {
            int n = -2005742596;
            n = Integer.rotateLeft(n * -657854881, 17) ^ 0xCB95224E;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x55D2B583;
            if ((n2 ^ n) != 1439872387) {
                int cfr_ignored_0 = (0xDDA07E7F ^ n) + -74037006;
            }
            if ((0x370 & 0) != 0) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw null;
        }
        if (!yf.khdha_2()) {
            tbb.ma16umsakzvf();
            throw null;
        }
        return this.dragging || this.resizing;
    }

    public float getScaledWidth() {
        block0: {
            int n = kr.rst_2(-1066109155);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x4166BE48;
            if ((n2 ^ n) == 1097252424) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0x8112C955 ^ n, 3) - -1515978618) * -2129475243;
            int cfr_ignored_1 = (int)(0x43A0676827D4EB4FL ^ (long)n ^ 0x33A0831A2DB92A91L);
        }
        return this.width * this.scale;
    }

    public float getScaledHeight() {
        block0: {
            int n = -1859643412;
            n = Integer.rotateLeft(n * 1870273001, 28) ^ 0x31EC9367;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 26);
            int n2 = n ^ 0x79094D17;
            if ((n2 ^ n) == 2030652695) break block0;
            int cfr_ignored_0 = (0xE8215AFB ^ n) - -1142294210;
        }
        return this.height * this.scale;
    }

    public float getResizeHandleSize() {
        block0: {
            int n = kr.rst_2(276612431);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
            int n2 = n ^ 0x49A58938;
            if ((n2 ^ n) == 1235585336) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x59D94C77 ^ n, 14) - -441589340) * 1507413111;
        }
        return Math.max(Float.intBitsToFloat(Integer.reverse(432838224) ^ 0x4AA93398), Float.intBitsToFloat(2143164094 - 1054742206) * Math.min(this.scale, Float.intBitsToFloat(-367803554 - -1435253922)));
    }

    /*
     * Unable to fully structure code
     */
    public void setScale(float var1_1) {
        var4_2 = 0;
        var2_3 = -211146415;
        var2_3 = Integer.rotateLeft(var2_3 * -293884209, 24) ^ 1264724889;
        var2_3 = Integer.rotateLeft(Float.floatToIntBits(var1_1) ^ var2_3, 13);
        var3_4 = var2_3 - 797984417;
        while (true) {
            block48: {
                block50: {
                    block59: {
                        block47: {
                            block58: {
                                block54: {
                                    block55: {
                                        block51: {
                                            block53: {
                                                block45: {
                                                    block57: {
                                                        block52: {
                                                            block56: {
                                                                block49: {
                                                                    block60: {
                                                                        block46: {
                                                                            block44: {
                                                                                var4_2 = var2_3 - var3_4;
                                                                                switch (var4_2 & 7) {
                                                                                    case 5: {
                                                                                        if (var4_2 == 817917765) break;
                                                                                        if (var4_2 != -136170603) {
                                                                                            Integer.rotateLeft(-233956955 ^ var2_3, 17) - 1410513462;
                                                                                            (int)(3511883673573321551L ^ (long)var2_3 ^ -7908176797203051352L);
                                                                                            ** break;
                                                                                        }
                                                                                        break block44;
                                                                                    }
                                                                                    case 6: {
                                                                                        if (var4_2 == 1427855150) break block45;
                                                                                        if (var4_2 == -768805898) break block46;
                                                                                        if (var4_2 != -2084529370) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block47;
                                                                                    }
                                                                                    case 2: {
                                                                                        if (var4_2 == -1036815526) break block48;
                                                                                        if (var4_2 != 1612832418) {
                                                                                            (Integer.rotateLeft(-723245487 ^ var2_3, 13) + -872529142) * -723245487;
                                                                                            (int)(1609623914937641807L ^ (long)var2_3 ^ -1321662342173720196L);
                                                                                            ** break;
                                                                                        }
                                                                                        break block49;
                                                                                    }
                                                                                    case 4: {
                                                                                        if (var4_2 == -1741215388) break block50;
                                                                                        if (var4_2 == -45455884) break block51;
                                                                                        (Integer.rotateRight(-9876033 ^ var2_3, 18) - -232912548) * -9876033;
                                                                                        if (var4_2 != 931016268) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block52;
                                                                                    }
                                                                                    case 3: {
                                                                                        if (var4_2 == 1246860147) break block53;
                                                                                        if (var4_2 == 1678994491) break block54;
                                                                                        if (var4_2 != -1106101549) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block55;
                                                                                    }
                                                                                    case 7: {
                                                                                        if (var4_2 != -93133857) {
                                                                                            ** break;
                                                                                        }
                                                                                        break block56;
                                                                                    }
                                                                                    case 0: {
                                                                                        if (var4_2 == -913463808) break block57;
                                                                                        if (var4_2 != -1227815656) {
                                                                                            Integer.rotateRight(-1665356126 ^ var2_3, 6) + -13187879;
                                                                                            ** break;
                                                                                        }
                                                                                        break block58;
                                                                                    }
                                                                                    case 1: {
                                                                                        if (var4_2 == 2108343953) break block59;
                                                                                        if (var4_2 != 797984417) {
                                                                                            (Integer.rotateLeft(2143651473 ^ var2_3, 18) + 2101930698) * 2143651473;
                                                                                            (int)(-4794318558444852401L ^ (long)var2_3 ^ -6041434751658043585L);
                                                                                            ** break;
                                                                                        }
                                                                                        break block60;
                                                                                    }
                                                                                }
                                                                                (Integer.rotateRight(-1988824325 ^ var2_3, 4) + -1450767456) * -1988824325;
                                                                                if (var1_1 <= tbb.izlmnlih22x(Integer.reverse(859162388) ^ 401563649)) {
                                                                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - 688442768));
                                                                                    Integer.rotateRight(-370210622 ^ var2_3, 16) + 1481617081;
                                                                                    var3_4 = var2_3 - 1612832418 ^ 984143345 ^ 984143345;
                                                                                    continue;
                                                                                }
                                                                                try {
                                                                                    var4_2 += 3;
                                                                                    if ((5441095226211979463L ^ (long)var2_3 | 1L) == 0L) {
                                                                                        throw new IllegalStateException();
                                                                                    }
                                                                                    var3_4 = var2_3 - -136170603 ^ 1360646812 ^ 1360646812;
                                                                                }
                                                                                catch (IllegalStateException v0) {
                                                                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - -136170603));
                                                                                }
                                                                                continue;
                                                                            }
                                                                            (Integer.rotateLeft(-1378269868 ^ var2_3, 8) - 296551527) * -1378269867;
                                                                            this.scale = Math.max(Float.intBitsToFloat(tbb.jfg3ellx(1795825259 ^ 1795825051, 20)), Math.min(2.0f, var1_1));
                                                                            return;
                                                                        }
                                                                        (Integer.rotateLeft(521978992 ^ var2_3, 6) + -925275957) * 521978993;
                                                                        throw null;
                                                                    }
                                                                    (Integer.rotateLeft(-2081373508 ^ var2_3, 3) - -24824833) * -2081373507;
                                                                    if (yf.dnkh()) {
                                                                        (int)(-8807687542896741527L ^ (long)var2_3 ^ 6971676335826839128L);
                                                                        var3_4 = var2_3 - -768805898 + 2121554022 - 2121554022;
                                                                        var4_2 += 2;
                                                                        continue;
                                                                    }
                                                                    try {
                                                                        --var4_2;
                                                                        if ((1783662423136130421L ^ (long)var2_3 | 1L) == 0L) {
                                                                            throw new IllegalArgumentException();
                                                                        }
                                                                        var3_4 = var2_3 - 817917765 ^ -1700161884 ^ -1700161884;
                                                                    }
                                                                    catch (IllegalArgumentException v1) {
                                                                        var3_4 = Integer.reverse(Integer.reverse(var2_3 - 817917765));
                                                                    }
                                                                    ++var4_2;
                                                                    continue;
                                                                }
                                                                Integer.rotateRight(-1424278810 ^ var2_3, 8) - -1129725675;
                                                                var1_1 = 1.0f;
                                                                (int)(-5496567242619588895L ^ (long)var2_3 ^ 8583521738328165025L);
                                                                var3_4 = var2_3 - -136170603 ^ 1515424258 ^ 1515424258;
                                                                var4_2 -= 4;
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(-2037359680 ^ var2_3, 3) + 1339603835;
                                                            var3_4 = var2_3 - -702471025 + -2038702383 - -2038702383;
                                                            (Integer.rotateRight(680432114 ^ var2_3, 8) + -308196471) * 680432115;
                                                            var3_4 = var2_3 - 797984417;
                                                            (Integer.rotateRight(-260267150 ^ var2_3, 17) + 594897417) * -260267149;
                                                            continue;
                                                        }
                                                        Integer.rotateLeft(-1077548475 ^ var2_3, 10) - 1028980118;
                                                        (int)(9040770059824589647L ^ (long)var2_3 ^ 8466911447916042047L);
                                                        var3_4 = (int)((long)(var2_3 - 1758625102) ^ -5386171252014988082L ^ -5386171252014988082L);
                                                        (Integer.rotateLeft(-672302188 ^ var2_3, 13) - 706713127) * -672302187;
                                                        var3_4 = var2_3 - 797984417;
                                                        var4_2 -= 5;
                                                        continue;
                                                    }
                                                    Integer.rotateLeft(1671834216 ^ var2_3, 15) + 360497619;
                                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - -35206200));
                                                    Integer.rotateRight(2045254727 ^ var2_3, 18) - -948368428;
                                                    var3_4 = var2_3 - 797984417 ^ -254847639 ^ -254847639;
                                                    (Integer.rotateLeft(1585238941 ^ var2_3, 14) - 1971011390) * 1585238941;
                                                    (int)(-7147637431773893809L ^ (long)var2_3 ^ 446000511569138765L);
                                                    --var4_2;
                                                    continue;
                                                }
                                                (Integer.rotateRight(-1302812265 ^ var2_3, 9) - -1659230076) * -1302812265;
                                                var3_4 = (int)((long)(var2_3 - -1770731465) ^ -3047866816388444763L ^ -3047866816388444763L);
                                                Integer.rotateLeft(-1432384731 ^ var2_3, 8) - -1381009226;
                                                (int)(7506696939574192975L ^ (long)var2_3 ^ -5242045817799737973L);
                                                var3_4 = var2_3 - 797984417 ^ -1920039285 ^ -1920039285;
                                                var4_2 -= 4;
                                                continue;
                                            }
                                            Integer.rotateRight(-77325905 ^ var2_3, 18) - 1971108716;
                                            try {
                                                --var4_2;
                                                if ((3777965095603926005L ^ (long)var2_3 | 1L) == 0L) {
                                                    throw new IllegalStateException();
                                                }
                                                var3_4 = Integer.reverse(Integer.reverse(var2_3 - 797984417));
                                            }
                                            catch (IllegalStateException v2) {
                                                var3_4 = var2_3 - 797984417;
                                            }
                                            var4_2 -= 5;
                                            continue;
                                        }
                                        (Integer.rotateLeft(1853404080 ^ var2_3, 16) + 1694196107) * 1853404081;
                                        try {
                                            var4_2 -= 2;
                                            var3_4 = var2_3 - 797984417;
                                        }
                                        catch (IllegalStateException v3) {
                                            var3_4 = Integer.reverse(Integer.reverse(var2_3 - 797984417));
                                        }
                                        --var4_2;
                                        continue;
                                    }
                                    (Integer.rotateLeft(-1095515527 ^ var2_3, 10) + 472001506) * -1095515527;
                                    (int)(8935542175661615951L ^ (long)var2_3 ^ 2736080922087085523L);
                                    var3_4 = var2_3 - -892412886;
                                    Integer.rotateLeft(1158481385 ^ var2_3, 11) + 1626429042;
                                    (int)(-8665018230347863217L ^ (long)var2_3 ^ -6136010343832837458L);
                                    var3_4 = (int)((long)(var2_3 - 797984417) ^ -6845730824864339449L ^ -6845730824864339449L);
                                    continue;
                                }
                                Integer.rotateRight(-1367003965 ^ var2_3, 8) + 645794520;
                                try {
                                    var4_2 -= 2;
                                    if ((1431080993822485649L ^ (long)var2_3 | 1L) == 0L) {
                                        throw new ArithmeticException();
                                    }
                                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - 797984417));
                                }
                                catch (ArithmeticException v4) {
                                    var3_4 = (int)((long)(var2_3 - 797984417) ^ -3146170786096480489L ^ -3146170786096480489L);
                                }
                                var4_2 += 5;
                                continue;
                            }
                            Integer.rotateRight(446627399 ^ var2_3, 6) - 1033791956;
                            var3_4 = (int)((long)(var2_3 - -1547232112) ^ 2189965199563310303L ^ 2189965199563310303L);
                            (Integer.rotateLeft(-500163 ^ var2_3, 18) - 57739422) * -500163;
                            (int)(4416606268049124175L ^ (long)var2_3 ^ 2121339572951045956L);
                            try {
                                var4_2 -= 2;
                                if ((-2689961246463992053L ^ (long)var2_3 | 1L) == 0L) {
                                    throw new NoSuchElementException();
                                }
                                var3_4 = var2_3 - 797984417;
                            }
                            catch (NoSuchElementException v5) {
                                var3_4 = var2_3 - 797984417 ^ -464042483 ^ -464042483;
                            }
                            var4_2 += 4;
                            continue;
                        }
                        Integer.rotateLeft(1576431393 ^ var2_3, 14) + 1697977402;
                        (int)(-6970233996591174833L ^ (long)var2_3 ^ 9171724789599474520L);
                        var3_4 = (int)((long)(var2_3 - 0x7C7070CC) ^ -5991212897712204450L ^ -5991212897712204450L);
                        (Integer.rotateRight(1889963959 ^ var2_3, 17) - -1467414940) * 1889963959;
                        try {
                            var4_2 -= 4;
                            if ((4493829292637274033L ^ (long)var2_3 | 1L) == 0L) {
                                throw new IllegalStateException();
                            }
                            var3_4 = Integer.reverse(Integer.reverse(var2_3 - 797984417));
                        }
                        catch (IllegalStateException v6) {
                            var3_4 = var2_3 - 797984417 ^ -415554483 ^ -415554483;
                        }
                        var4_2 += 4;
                        continue;
                    }
                    Integer.rotateRight(-595404470 ^ var2_3, 14) + -1204424911;
                    (int)(7070465689581861082L ^ (long)var2_3 ^ 6006162022299036143L);
                    var3_4 = (int)((long)(var2_3 - 1624116063) ^ -8093749395417330249L ^ -8093749395417330249L);
                    (int)(-4890098266249982868L ^ (long)var2_3 ^ 4495307552585602452L);
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - 797984417));
                    var4_2 += 3;
                    continue;
                }
                Integer.rotateLeft(-1787500252 ^ var2_3, 5) - 495311511;
                var3_4 = var2_3 - -696235213 ^ -122950436 ^ -122950436;
                (Integer.rotateRight(446002967 ^ var2_3, 6) - 1014434564) * 446002967;
                try {
                    var4_2 -= 4;
                    if ((5527297500235847571L ^ (long)var2_3 | 1L) == 0L) {
                        throw new NoSuchElementException();
                    }
                    var3_4 = var2_3 - 797984417 + 397144213 - 397144213;
                }
                catch (NoSuchElementException v7) {
                    var3_4 = Integer.reverse(Integer.reverse(var2_3 - 797984417));
                }
                continue;
            }
            (Integer.rotateRight(-950368258 ^ var2_3, 11) - 676599549) * -950368257;
            var3_4 = (int)((long)(var2_3 - -2035455575) ^ -8418061035931723361L ^ -8418061035931723361L);
            (Integer.rotateLeft(1163042456 ^ var2_3, 11) + 1767822243) * 1163042457;
            (int)(2135899818221292243L ^ (long)var2_3 ^ -8767904299586840935L);
            var3_4 = var2_3 - -1934735682;
            (int)(-1746451607129985265L ^ (long)var2_3 ^ 5366227544355398231L);
            var3_4 = (int)((long)(var2_3 - 797984417) ^ -658583584487826103L ^ -658583584487826103L);
            var4_2 -= 4;
            continue;
lbl291:
            // 9 sources

            Integer.rotateLeft(-1963284019 ^ var2_3, 4) - -659017970;
            (int)(5208421697095789391L ^ (long)var2_3 ^ -968129771425153727L);
            var3_4 = var2_3 - 797984417 + -681622917 - -681622917;
        }
    }

    public int normaliseX() {
        block0: {
            int n = kr.rst_2(-489121515);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x5B74EAB7;
            if ((n2 ^ n) == 1534388919) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xB9AC73A2 ^ n, 10) + -2143313959;
        }
        return (int)(tbb.mc.field_1729.method_1603() / mc.method_22683().method_4495());
    }

    public int normaliseY() {
        block0: {
            int n = 707564268;
            int n2 = (n = Integer.rotateLeft(n * 1194052705, 4) ^ 0x48142FF5) ^ 0x60D7133A;
            if ((n2 ^ n) == 1624707898) break block0;
            int cfr_ignored_0 = (0x4AFB81D6 ^ n) + -1696794064;
        }
        return (int)(tbb.ulhjygs4f3x4o4(tbb.mc.field_1729) / mc.method_22683().method_4495());
    }

    private float roundToHalf(float f) {
        block0: {
            int n = 1409617581;
            n = Integer.rotateLeft(n * 92514915, 16) ^ 0x59AFAF89;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 6);
            int n2 = n ^ 0xAD151E6E;
            if ((n2 ^ n) == -1391124882) break block0;
            int cfr_ignored_0 = (0xF91010C3 ^ n) + -1379245052;
        }
        return (float)Math.round(f * 2.0f) / 2.0f;
    }

    private float roundToStep(float f, float f2) {
        float f3 = 0.0f;
        int n = 0;
        int n2 = -380786647;
        n2 = Integer.rotateLeft(n2 * -2090694805, 16) ^ 0xBF4D4FD5;
        n2 = Integer.rotateLeft(System.identityHashCode(this) ^ n2, 16);
        n2 = Float.floatToIntBits(f) ^ n2;
        int n3 = n2 ^ 0xD24F5DA9;
        block28: while (true) {
            switch (n3 ^ n2) {
                case -766550615: {
                    int cfr_ignored_0 = Integer.rotateLeft(0xFB1F50AC ^ n2, 18) - 1831363599;
                    if (!yf.dnkh()) {
                        n3 = n2 ^ 0x4A00940E ^ 0x97B4E7E1 ^ 0x97B4E7E1;
                        int cfr_ignored_1 = Integer.rotateRight(0x1E23CA ^ n2, 3) + 134476977;
                        n3 = n2 ^ 0x1A3EE201;
                        n += 2;
                        continue block28;
                    }
                    n3 = (int)((long)(n2 ^ 0xEDB2AC76) ^ 0x5FB76445DAB09B9BL ^ 0x5FB76445DAB09B9BL);
                    int cfr_ignored_2 = (Integer.rotateLeft(0x5781ED11 ^ n2, 13) + -1659284406) * 1468132625;
                    int cfr_ignored_3 = (int)(0x9533432C27D4EB4FL ^ (long)n2 ^ 0x7B28831A2DB887B7L);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xB9E3F8E2));
                    n += 2;
                    continue block28;
                }
                case 440328705: {
                    int cfr_ignored_4 = (Integer.rotateLeft(0x2B7E8C35 ^ n2, 8) - 1219533222) * 729713717;
                    int cfr_ignored_5 = (int)(0xE9CC220827D4EB4FL ^ (long)n2 ^ 0xB960831A2DB87E49L);
                    f3 = (float)Math.round(f / f2) * f2;
                    n3 = (n2 ^ 0x5DFF686) + 1954776917 - 1954776917;
                    n += 5;
                    continue block28;
                }
                case -1176241950: {
                    int cfr_ignored_6 = (Integer.rotateRight(0x22D44EDE ^ n2, 7) - 1007889437) * 584339167;
                    throw null;
                }
                case 152212092: {
                    int cfr_ignored_7 = (Integer.rotateRight(0xCF80843F ^ n2, 12) - 619553500) * -813661121;
                    n3 = n2 ^ 0x61C6888 ^ 0x16A8D499 ^ 0x16A8D499;
                    int cfr_ignored_8 = Integer.rotateLeft(0x65AE8A65 ^ n2, 15) - 1417699702;
                    int cfr_ignored_9 = (int)(0xA71C245827D4EB4FL ^ (long)n2 ^ 0xB5C0831A2DB8E3E9L);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xAC0853FC));
                    int cfr_ignored_10 = Integer.rotateLeft(0xC2F4D449 ^ n2, 11) + -1610394606;
                    int cfr_ignored_11 = (int)(0x467A7427D4EB4FL ^ (long)n2 ^ 0x998831A2DB9AD5DL);
                    n3 = (n2 ^ 0xD24F5DA9) + 1925687652 - 1925687652;
                    ++n;
                    continue block28;
                }
                case -431043059: {
                    int cfr_ignored_12 = (Integer.rotateLeft(0xC64FF3D0 ^ n2, 11) + 135013739) * -967838767;
                    try {
                        n -= 2;
                        if ((0x94AF5F08D617BA95L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = n2 ^ 0xD24F5DA9;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 ^ 0xD24F5DA9;
                    }
                    n += 2;
                    continue block28;
                }
                case 386466192: {
                    int cfr_ignored_13 = (Integer.rotateLeft(0x238BC3F9 ^ n2, 7) + 1380604514) * 596362233;
                    int cfr_ignored_14 = (int)(0xE1396DC427D4EB4FL ^ (long)n2 ^ 0x26F8831A2DB86FA3L);
                    n3 = (int)((long)(n2 ^ 0x80C24D47) ^ 0xD911420AEFB9EA2AL ^ 0xD911420AEFB9EA2AL);
                    int cfr_ignored_15 = (Integer.rotateRight(0xF1775AB3 ^ n2, 17) + 1104255720) * -243836237;
                    try {
                        ++n;
                        n3 = (n2 ^ 0xD24F5DA9) + -511323171 - -511323171;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        n3 = n2 ^ 0xD24F5DA9;
                    }
                    n += 2;
                    continue block28;
                }
                case 1657018767: {
                    int cfr_ignored_16 = (Integer.rotateLeft(0xDA1917D8 ^ n2, 14) + 1835500131) * -635889703;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x80591F23));
                    int cfr_ignored_17 = (Integer.rotateLeft(0xA5FC7DC ^ n2, 4) - 1173803743) * 174049245;
                    try {
                        n -= 3;
                        if ((0xC540C4F96A7FA8DFL ^ (long)n2 | 1L) == 0L) {
                            throw new NoSuchElementException();
                        }
                        n3 = n2 ^ 0xD24F5DA9 ^ 0x887F168A ^ 0x887F168A;
                    }
                    catch (NoSuchElementException noSuchElementException) {
                        n3 = n2 ^ 0xD24F5DA9;
                    }
                    n -= 3;
                    continue block28;
                }
                case -1152860013: {
                    int cfr_ignored_18 = Integer.rotateRight(0xCC61A307 ^ n2, 12) - -1003463404;
                    int cfr_ignored_19 = (int)(0xA4B6892106F66AC8L ^ (long)n2 ^ 0xEF32C15F2EB6E4BCL);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x4438B674));
                    int cfr_ignored_20 = (int)(0x181BB50CF018E009L ^ (long)n2 ^ 0x97692C823B359DE6L);
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xD24F5DA9));
                    continue block28;
                }
                case -2078728913: {
                    int cfr_ignored_21 = (Integer.rotateRight(0xC616963E ^ n2, 11) - 18469053) * -971598273;
                    n3 = (int)((long)(n2 ^ 0x12999E6C) ^ 0x225BE780EFB087ABL ^ 0x225BE780EFB087ABL);
                    int cfr_ignored_22 = (Integer.rotateRight(0xE62CED1E ^ n2, 15) - -473016867) * -433263329;
                    int cfr_ignored_23 = (int)(0x70CB571CB49BFE9L ^ (long)n2 ^ 0x97935A2084F5A3C8L);
                    n3 = (int)((long)(n2 ^ 0xD24F5DA9) ^ 0x4A623F2987DFE5A2L ^ 0x4A623F2987DFE5A2L);
                    n += 5;
                    continue block28;
                }
                case -987790053: {
                    int cfr_ignored_24 = Integer.rotateRight(0x35D8FD26 ^ n2, 9) - -1985722667;
                    int cfr_ignored_25 = (int)(0x77DFAE59680A0B9DL ^ (long)n2 ^ 0xA1C21CA7EC1D426EL);
                    n3 = n2 ^ 0x628757BE ^ 0xD9EFB0D7 ^ 0xD9EFB0D7;
                    int cfr_ignored_26 = (int)(0xC0776454EE3DE7E6L ^ (long)n2 ^ 0x35D910C834EA2D3FL);
                    n3 = (int)((long)(n2 ^ 0xD24F5DA9) ^ 0x54DDD5016390166L ^ 0x54DDD5016390166L);
                    n += 4;
                    continue block28;
                }
                case -1570888095: {
                    int cfr_ignored_27 = (Integer.rotateRight(0xFBC2F0BB ^ n2, 18) + -2131180064) * -71110469;
                    n3 = (n2 ^ 0xD9D159DA) + -1224602502 - -1224602502;
                    int cfr_ignored_28 = Integer.rotateRight(0xFDA6BDC3 ^ n2, 18) + -1148282408;
                    try {
                        n -= 4;
                        if ((0xD05CC6D0088EA349L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = (n2 ^ 0xD24F5DA9) + 176772510 - 176772510;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = n2 ^ 0xD24F5DA9;
                    }
                    n += 3;
                    continue block28;
                }
                case -1496573690: {
                    int cfr_ignored_29 = Integer.rotateRight(0x5A24A402 ^ n2, 14) + -288523399;
                    n3 = (n2 ^ 0xDE2930B5) + 2049269733 - 2049269733;
                    int cfr_ignored_30 = (Integer.rotateLeft(0xE0D122F8 ^ n2, 15) + 1035000643) * -523164935;
                    try {
                        n -= 4;
                        n3 = (n2 ^ 0xD24F5DA9) + -1798113607 - -1798113607;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        n3 = n2 ^ 0xD24F5DA9 ^ 0xD69175AE ^ 0xD69175AE;
                    }
                    n -= 5;
                    continue block28;
                }
                case -483138296: {
                    int cfr_ignored_31 = (Integer.rotateRight(0x354D9E9F ^ n2, 9) - 2026099836) * 894279327;
                    n3 = (n2 ^ 0x216E932C) + 30816983 - 30816983;
                    int cfr_ignored_32 = (Integer.rotateLeft(0x94CA97FC ^ n2, 5) - 149292735) * -1798662147;
                    try {
                        if ((0xFBE7CD9AEBED2DF7L ^ (long)n2 | 1L) == 0L) {
                            throw new IllegalStateException();
                        }
                        n3 = n2 ^ 0xD24F5DA9;
                    }
                    catch (IllegalStateException illegalStateException) {
                        n3 = (int)((long)(n2 ^ 0xD24F5DA9) ^ 0x55546B83D063E9A9L ^ 0x55546B83D063E9A9L);
                    }
                    n -= 5;
                    continue block28;
                }
                case 98563718: {
                    return f3;
                }
            }
            int cfr_ignored_33 = (Integer.rotateRight(0x7EB194B7 ^ n2, 18) - 1541316964) * 2125567159;
            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xD24F5DA9));
        }
    }

    private boolean isShiftPressed() {
        return brz.rzdh(340) || brz.rzdh(344);
    }

    /*
     * Unable to fully structure code
     */
    private void clampToScreen() {
        var1_1 = 0.0f;
        var2_2 = 0.0f;
        var3_3 = 0.0f;
        var6_4 = 0;
        var4_5 = 711395975;
        var4_5 = Integer.rotateLeft(var4_5 * -192408675, 25) ^ 779094518;
        var4_5 = Integer.rotateRight(System.identityHashCode(this) ^ var4_5, 13);
        var5_6 = (int)((long)(65024152 + var4_5) ^ -4644366964545549717L ^ -4644366964545549717L);
        while (true) {
            block96: {
                block85: {
                    block78: {
                        block84: {
                            block97: {
                                block92: {
                                    block80: {
                                        block79: {
                                            block75: {
                                                block81: {
                                                    block86: {
                                                        block93: {
                                                            block98: {
                                                                block91: {
                                                                    block77: {
                                                                        block95: {
                                                                            block89: {
                                                                                block88: {
                                                                                    block87: {
                                                                                        block94: {
                                                                                            block76: {
                                                                                                block83: {
                                                                                                    block90: {
                                                                                                        block82: {
                                                                                                            var6_4 = var5_6 - var4_5;
                                                                                                            switch (var6_4 & 15) {
                                                                                                                case 0: {
                                                                                                                    if (var6_4 == 1773678048) break block75;
                                                                                                                    if (var6_4 != -428299920) {
                                                                                                                        (Integer.rotateLeft(2022407772 ^ var4_5, 18) - -1656624033) * 2022407773;
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block76;
                                                                                                                }
                                                                                                                case 1: {
                                                                                                                    if (var6_4 != -78248703) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block77;
                                                                                                                }
                                                                                                                case 2: {
                                                                                                                    if (var6_4 != -1912445742) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block78;
                                                                                                                }
                                                                                                                case 4: {
                                                                                                                    if (var6_4 == 364067812) break block79;
                                                                                                                    if (var6_4 == 510673668) break block80;
                                                                                                                    Integer.rotateLeft(-233975739 ^ var4_5, 17) - 1409931158;
                                                                                                                    (int)(3512665288901716815L ^ (long)var4_5 ^ 108230539516431535L);
                                                                                                                    if (var6_4 != -142349260) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block81;
                                                                                                                }
                                                                                                                case 5: {
                                                                                                                    if (var6_4 == -2081067403) break block82;
                                                                                                                    if (var6_4 != 18573381) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block83;
                                                                                                                }
                                                                                                                case 7: {
                                                                                                                    if (var6_4 == 1668268311) break block84;
                                                                                                                    if (var6_4 != 116951415) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block85;
                                                                                                                }
                                                                                                                case 8: {
                                                                                                                    if (var6_4 == -938394936) break block86;
                                                                                                                    if (var6_4 == 65024152) break block87;
                                                                                                                    (Integer.rotateLeft(864083793 ^ var4_5, 9) + 1090038282) * 864083793;
                                                                                                                    (int)(-1066665452394714289L ^ (long)var4_5 ^ 2281217359722598325L);
                                                                                                                    if (var6_4 != 239232296) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block88;
                                                                                                                }
                                                                                                                case 9: {
                                                                                                                    if (var6_4 == 771398217) break block89;
                                                                                                                    if (var6_4 == -1066863399) break block90;
                                                                                                                    Integer.rotateRight(1074702086 ^ var4_5, 11) - -970729227;
                                                                                                                    if (var6_4 == 1184490825) break block91;
                                                                                                                    if (var6_4 != -1047103335) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block92;
                                                                                                                }
                                                                                                                case 10: {
                                                                                                                    if (var6_4 != -1610733286) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block93;
                                                                                                                }
                                                                                                                case 12: {
                                                                                                                    if (var6_4 == -212675556) break block94;
                                                                                                                    if (var6_4 != -1138235204) {
                                                                                                                        (Integer.rotateLeft(1015525117 ^ var4_5, 10) - 1489752030) * 1015525117;
                                                                                                                        (int)(-129196189008204977L ^ (long)var4_5 ^ -220532233281711685L);
                                                                                                                        if (var6_4 == -1771195364) break;
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block95;
                                                                                                                }
                                                                                                                case 13: {
                                                                                                                    if (var6_4 != 1946305245) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block96;
                                                                                                                }
                                                                                                                case 14: {
                                                                                                                    if (var6_4 != 145460558) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block97;
                                                                                                                }
                                                                                                                case 15: {
                                                                                                                    if (var6_4 != 386703471) {
                                                                                                                        ** break;
                                                                                                                    }
                                                                                                                    break block98;
                                                                                                                }
                                                                                                            }
                                                                                                            Integer.rotateLeft(-1653410971 ^ var4_5, 6) - 357111926;
                                                                                                            (int)(6899617262338370383L ^ (long)var4_5 ^ 5170276520680821329L);
                                                                                                            this.y = var3_3 - this.getScaledHeight() - var1_1;
                                                                                                            var5_6 = -78248703 + var4_5;
                                                                                                            var6_4 -= 3;
                                                                                                            continue;
                                                                                                        }
                                                                                                        Integer.rotateLeft(1296247077 ^ var4_5, 12) - 1602198198;
                                                                                                        (int)(-8074524119081358513L ^ (long)var4_5 ^ -918590175524113870L);
                                                                                                        if (this.y < var1_1) {
                                                                                                            var5_6 = (int)((long)(1184490825 + var4_5) ^ 2008087753418385297L ^ 2008087753418385297L);
                                                                                                            (Integer.rotateRight(-203661769 ^ var4_5, 17) - -1945303068) * -203661769;
                                                                                                            var6_4 -= 2;
                                                                                                            continue;
                                                                                                        }
                                                                                                        try {
                                                                                                            var6_4 += 3;
                                                                                                            if ((2120225783741745095L ^ (long)var4_5 | 1L) == 0L) {
                                                                                                                throw new NoSuchElementException();
                                                                                                            }
                                                                                                            var5_6 = (int)((long)(-212675556 + var4_5) ^ -5682212489704437043L ^ -5682212489704437043L);
                                                                                                        }
                                                                                                        catch (NoSuchElementException v0) {
                                                                                                            var5_6 = -212675556 + var4_5 ^ 605168031 ^ 605168031;
                                                                                                        }
                                                                                                        var6_4 += 2;
                                                                                                        continue;
                                                                                                    }
                                                                                                    (Integer.rotateLeft(-969830339 ^ var4_5, 11) - 73275038) * -969830339;
                                                                                                    (int)(325171768489995087L ^ (long)var4_5 ^ -9119645096965724969L);
                                                                                                    this.x = var1_1;
                                                                                                    var5_6 = 1832277831 + var4_5 + -1059949231 - -1059949231;
                                                                                                    (Integer.rotateLeft(313764440 ^ var4_5, 5) + 1210007523) * 313764441;
                                                                                                    var5_6 = -2081067403 + var4_5 ^ -1000752767 ^ -1000752767;
                                                                                                    --var6_4;
                                                                                                    continue;
                                                                                                }
                                                                                                (Integer.rotateLeft(-1854293635 ^ var4_5, 5) - -1575283362) * -1854293635;
                                                                                                (int)(6037945289733892943L ^ (long)var4_5 ^ -3174893588836709817L);
                                                                                                tbb.f2z9jbwkqh();
                                                                                                throw null;
                                                                                            }
                                                                                            Integer.rotateLeft(619755145 ^ var4_5, 7) + 2105784786;
                                                                                            (int)(-1854892934481777841L ^ (long)var4_5 ^ -3740095342071750315L);
                                                                                            if (!(this.x + tbb.k7p0psifm251gf(this) > var2_2 - var1_1)) {
                                                                                                (int)(-953862162510520010L ^ (long)var4_5 ^ -7231178960614569897L);
                                                                                                var5_6 = -52372211 + var4_5;
                                                                                                (int)(7116680427536703716L ^ (long)var4_5 ^ -920438385629239210L);
                                                                                                var5_6 = -1138235204 + var4_5 ^ -658661045 ^ -658661045;
                                                                                                --var6_4;
                                                                                                continue;
                                                                                            }
                                                                                            var5_6 = Integer.reverse(Integer.reverse(958592331 + var4_5));
                                                                                            Integer.rotateLeft(-1555311327 ^ var4_5, 7) + -896766406;
                                                                                            (int)(7059809251737529167L ^ (long)var4_5 ^ 813043881199889955L);
                                                                                            var5_6 = 771398217 + var4_5 + -1844687761 - -1844687761;
                                                                                            continue;
                                                                                        }
                                                                                        (Integer.rotateLeft(1417603509 ^ var4_5, 13) - 1069280294) * 1417603509;
                                                                                        (int)(-7580605422661997745L ^ (long)var4_5 ^ 8241731466547462217L);
                                                                                        if (!(this.x + tbb.k7p0psifm251gf(this) > var2_2 - var1_1)) {
                                                                                            var5_6 = -1138235204 + var4_5 + -40947856 - -40947856;
                                                                                            kr.abt(2082850432, var4_5);
                                                                                            (int)(-2156451017887417323L ^ (long)var4_5 ^ -9006581161651312140L);
                                                                                            var6_4 -= 4;
                                                                                            continue;
                                                                                        }
                                                                                        var5_6 = Integer.reverse(Integer.reverse(771398217 + var4_5));
                                                                                        (Integer.rotateLeft(-1631842692 ^ var4_5, 6) - 1025728575) * -1631842691;
                                                                                        var6_4 += 2;
                                                                                        continue;
                                                                                    }
                                                                                    (Integer.rotateLeft(1509336341 ^ var4_5, 14) - -381969210) * 1509336341;
                                                                                    (int)(-7258664432319534257L ^ (long)var4_5 ^ -1504058127082284199L);
                                                                                    if (tbb.zi289kdbtz()) {
                                                                                        try {
                                                                                            if ((-894523362651166113L ^ (long)var4_5 | 1L) == 0L) {
                                                                                                throw new IllegalArgumentException();
                                                                                            }
                                                                                            var5_6 = (int)((long)(239232296 + var4_5) ^ 4663244873938866384L ^ 4663244873938866384L);
                                                                                        }
                                                                                        catch (IllegalArgumentException v1) {
                                                                                            var5_6 = Integer.reverse(Integer.reverse(239232296 + var4_5));
                                                                                        }
                                                                                        --var6_4;
                                                                                        continue;
                                                                                    }
                                                                                    try {
                                                                                        var6_4 -= 2;
                                                                                        var5_6 = (int)((long)(18573381 + var4_5) ^ -8748899202089048649L ^ -8748899202089048649L);
                                                                                    }
                                                                                    catch (NoSuchElementException v2) {
                                                                                        var5_6 = 18573381 + var4_5 ^ -112285952 ^ -112285952;
                                                                                    }
                                                                                    continue;
                                                                                }
                                                                                (Integer.rotateLeft(-776083308 ^ var4_5, 13) - 1784465703) * -776083307;
                                                                                var1_1 = Float.intBitsToFloat(876922212 + 201013916);
                                                                                var2_2 = tbb.mc.method_22683().method_4486();
                                                                                var3_3 = tbb.lvzk8raxiq(tbb.gaunpvga0(tbb.mc));
                                                                                if (!(this.x < var1_1)) {
                                                                                    try {
                                                                                        if ((-974114763998455691L ^ (long)var4_5 | 1L) == 0L) {
                                                                                            throw new IllegalArgumentException();
                                                                                        }
                                                                                        var5_6 = -2081067403 + var4_5 ^ -9743313 ^ -9743313;
                                                                                    }
                                                                                    catch (IllegalArgumentException v3) {
                                                                                        var5_6 = -2081067403 + var4_5 ^ -945596572 ^ -945596572;
                                                                                    }
                                                                                    var6_4 -= 4;
                                                                                    continue;
                                                                                }
                                                                                try {
                                                                                    if ((-1830413848050949655L ^ (long)var4_5 | 1L) == 0L) {
                                                                                        throw new UnsupportedOperationException();
                                                                                    }
                                                                                    var5_6 = (int)((long)(-1066863399 + var4_5) ^ -7723494768225031455L ^ -7723494768225031455L);
                                                                                }
                                                                                catch (UnsupportedOperationException v4) {
                                                                                    var5_6 = -1066863399 + var4_5;
                                                                                }
                                                                                var6_4 += 3;
                                                                                continue;
                                                                            }
                                                                            Integer.rotateLeft(767150597 ^ var4_5, 8) - -1914890794;
                                                                            (int)(-1221772681551746225L ^ (long)var4_5 ^ 3819196632469631943L);
                                                                            this.x = var2_2 - this.getScaledWidth() - var1_1;
                                                                            try {
                                                                                ++var6_4;
                                                                                if ((-8371841035750247595L ^ (long)var4_5 | 1L) == 0L) {
                                                                                    throw new UnsupportedOperationException();
                                                                                }
                                                                                var5_6 = Integer.reverse(Integer.reverse(-1138235204 + var4_5));
                                                                            }
                                                                            catch (UnsupportedOperationException v5) {
                                                                                var5_6 = Integer.reverse(Integer.reverse(-1138235204 + var4_5));
                                                                            }
                                                                            ++var6_4;
                                                                            continue;
                                                                        }
                                                                        (Integer.rotateLeft(645038296 ^ var4_5, 7) + -1405404829) * 645038297;
                                                                        if (!(this.y + this.getScaledHeight() > var3_3 - var1_1)) {
                                                                            try {
                                                                                var5_6 = -78248703 + var4_5 + -62931153 - -62931153;
                                                                            }
                                                                            catch (NoSuchElementException v6) {
                                                                                var5_6 = Integer.reverse(Integer.reverse(-78248703 + var4_5));
                                                                            }
                                                                            var6_4 -= 5;
                                                                            continue;
                                                                        }
                                                                        var5_6 = 741344199 + var4_5;
                                                                        (Integer.rotateRight(161463582 ^ var4_5, 4) - 783648221) * 161463583;
                                                                        var5_6 = -1771195364 + var4_5 ^ 1123477706 ^ 1123477706;
                                                                        var6_4 -= 4;
                                                                        continue;
                                                                    }
                                                                    (Integer.rotateRight(-1371555117 ^ var4_5, 8) + 504708808) * -1371555117;
                                                                    return;
                                                                }
                                                                Integer.rotateRight(120869547 ^ var4_5, 3) + -474766864;
                                                                this.y = var1_1;
                                                                var5_6 = -428299920 + var4_5 ^ 1944639233 ^ 1944639233;
                                                                (Integer.rotateRight(-1891467789 ^ var4_5, 4) + 1567285160) * -1891467789;
                                                                var6_4 -= 5;
                                                                continue;
                                                            }
                                                            Integer.rotateLeft(222006728 ^ var4_5, 4) + -1634481549;
                                                            try {
                                                                if ((-2067805827468630243L ^ (long)var4_5 | 1L) == 0L) {
                                                                    throw new ArithmeticException();
                                                                }
                                                                var5_6 = 65024152 + var4_5 + -1415233596 - -1415233596;
                                                            }
                                                            catch (ArithmeticException v7) {
                                                                var5_6 = (int)((long)(65024152 + var4_5) ^ 3478291635599263043L ^ 3478291635599263043L);
                                                            }
                                                            --var6_4;
                                                            continue;
                                                        }
                                                        (Integer.rotateRight(-619869482 ^ var4_5, 14) - -1962840283) * -619869481;
                                                        var5_6 = Integer.reverse(Integer.reverse(1470865581 + var4_5));
                                                        (Integer.rotateRight(19084310 ^ var4_5, 3) - 664858085) * 19084311;
                                                        try {
                                                            var6_4 += 5;
                                                            if ((-8686976106816221275L ^ (long)var4_5 | 1L) == 0L) {
                                                                throw new IllegalStateException();
                                                            }
                                                            var5_6 = 65024152 + var4_5 ^ -1768398629 ^ -1768398629;
                                                        }
                                                        catch (IllegalStateException v8) {
                                                            var5_6 = 65024152 + var4_5 + -311128163 - -311128163;
                                                        }
                                                        var6_4 -= 4;
                                                        continue;
                                                    }
                                                    Integer.rotateRight(2101787015 ^ var4_5, 18) - 804132500;
                                                    var5_6 = Integer.reverse(Integer.reverse(65024152 + var4_5));
                                                    var6_4 += 2;
                                                    continue;
                                                }
                                                (Integer.rotateRight(-229684142 ^ var4_5, 17) + 1542970665) * -229684141;
                                                var5_6 = -1509991480 + var4_5 + 1390906096 - 1390906096;
                                                (Integer.rotateLeft(-990600107 ^ var4_5, 11) - -570587770) * -990600107;
                                                (int)(452060255058455375L ^ (long)var4_5 ^ -1612144518139109027L);
                                                var5_6 = 252269642 + var4_5 ^ 1221914724 ^ 1221914724;
                                                Integer.rotateLeft(-1591448951 ^ var4_5, 7) + -2017032750;
                                                (int)(7176139334302886735L ^ (long)var4_5 ^ 8365580456300210940L);
                                                var5_6 = 65024152 + var4_5 + 851244119 - 851244119;
                                                var6_4 -= 5;
                                                continue;
                                            }
                                            Integer.rotateRight(13713775 ^ var4_5, 3) - 498371500;
                                            var5_6 = 677567032 + var4_5 ^ -851322702 ^ -851322702;
                                            Integer.rotateRight(557021507 ^ var4_5, 7) + 161042008;
                                            var5_6 = 65024152 + var4_5 + 2102853149 - 2102853149;
                                            (Integer.rotateLeft(2096226388 ^ var4_5, 18) - 631753063) * 2096226389;
                                            var6_4 += 5;
                                            continue;
                                        }
                                        (Integer.rotateLeft(-2134291204 ^ var4_5, 3) - -1665273409) * -2134291203;
                                        var5_6 = 1904427351 + var4_5;
                                        Integer.rotateRight(-1410378326 ^ var4_5, 8) + -698810671;
                                        (int)(-2395555568825777034L ^ (long)var4_5 ^ 8124155556879011923L);
                                        var5_6 = 168592368 + var4_5 ^ -1266111822 ^ -1266111822;
                                        (int)(-8404116258472706838L ^ (long)var4_5 ^ -3106170928100099220L);
                                        var5_6 = (int)((long)(65024152 + var4_5) ^ -8842547349648342327L ^ -8842547349648342327L);
                                        continue;
                                    }
                                    Integer.rotateRight(1690022531 ^ var4_5, 15) + 924335384;
                                    try {
                                        var6_4 += 2;
                                        if ((1886189765899001225L ^ (long)var4_5 | 1L) == 0L) {
                                            throw new UnsupportedOperationException();
                                        }
                                        var5_6 = 65024152 + var4_5;
                                    }
                                    catch (UnsupportedOperationException v9) {
                                        var5_6 = (int)((long)(65024152 + var4_5) ^ 6068865222465885008L ^ 6068865222465885008L);
                                    }
                                    continue;
                                }
                                kr.abt(-1203192448, var4_5);
                                (int)(2774151646711282709L ^ (long)var4_5 ^ 8431356595527344430L);
                                var5_6 = 1550973659 + var4_5;
                                (Integer.rotateLeft(1550988245 ^ var4_5, 14) - 909239814) * 1550988245;
                                (int)(-7007427399762252977L ^ (long)var4_5 ^ -4134160309466656688L);
                                try {
                                    var6_4 -= 2;
                                    if ((8733214080469228205L ^ (long)var4_5 | 1L) == 0L) {
                                        throw new IllegalStateException();
                                    }
                                    var5_6 = 65024152 + var4_5;
                                }
                                catch (IllegalStateException v10) {
                                    var5_6 = (int)((long)(65024152 + var4_5) ^ -670447575878833119L ^ -670447575878833119L);
                                }
                                var6_4 -= 3;
                                continue;
                            }
                            (Integer.rotateRight(1457927711 ^ var4_5, 13) - -1975636740) * 1457927711;
                            (int)(4396947950644621437L ^ (long)var4_5 ^ -3690101038282582053L);
                            var5_6 = 4327381 + var4_5 ^ -1159483236 ^ -1159483236;
                            (int)(8215534978876346904L ^ (long)var4_5 ^ 2189562794961488343L);
                            var5_6 = (int)((long)(65024152 + var4_5) ^ 748705424603194573L ^ 748705424603194573L);
                            continue;
                        }
                        Integer.rotateRight(171795042 ^ var4_5, 4) + 1103923481;
                        var5_6 = 1372596727 + var4_5;
                        Integer.rotateLeft(-1105135895 ^ var4_5, 10) + 173770098;
                        (int)(8976334675527396175L ^ (long)var4_5 ^ 5537319890311533813L);
                        try {
                            var6_4 -= 2;
                            if ((-51067545724633231L ^ (long)var4_5 | 1L) == 0L) {
                                throw new NoSuchElementException();
                            }
                            var5_6 = 65024152 + var4_5;
                        }
                        catch (NoSuchElementException v11) {
                            var5_6 = Integer.reverse(Integer.reverse(65024152 + var4_5));
                        }
                        continue;
                    }
                    (Integer.rotateLeft(1903106108 ^ var4_5, 17) - -1060008321) * 1903106109;
                    var5_6 = Integer.reverse(Integer.reverse(-1887496495 + var4_5));
                    Integer.rotateRight(1594318442 ^ var4_5, 14) + -2042491375;
                    try {
                        if ((7383359242277247975L ^ (long)var4_5 | 1L) == 0L) {
                            throw new IllegalArgumentException();
                        }
                        var5_6 = 65024152 + var4_5 ^ 737321798 ^ 737321798;
                    }
                    catch (IllegalArgumentException v12) {
                        var5_6 = 65024152 + var4_5 + -1245098530 - -1245098530;
                    }
                    ++var6_4;
                    continue;
                }
                (Integer.rotateRight(-231374221 ^ var4_5, 17) + 1490578216) * -231374221;
                try {
                    --var6_4;
                    if ((9146986139037676463L ^ (long)var4_5 | 1L) == 0L) {
                        throw new IllegalStateException();
                    }
                    var5_6 = (int)((long)(65024152 + var4_5) ^ -932160513134847721L ^ -932160513134847721L);
                }
                catch (IllegalStateException v13) {
                    var5_6 = (int)((long)(65024152 + var4_5) ^ 480903699846230672L ^ 480903699846230672L);
                }
                continue;
            }
            Integer.rotateRight(127091466 ^ var4_5, 3) + -281887375;
            var5_6 = 65024152 + var4_5 + 1715626309 - 1715626309;
            continue;
lbl437:
            // 14 sources

            Integer.rotateRight(1328608142 ^ var4_5, 12) - -1689576083;
            var5_6 = 65024152 + var4_5 ^ -729728631 ^ -729728631;
        }
    }

    @Generated
    public float getX() {
        block0: {
            int n = 121858987;
            int n2 = (n = Integer.rotateLeft(n * -334498367, 6) ^ 0x63BA489F) ^ 0xA341174F;
            if ((n2 ^ n) == -1556015281) break block0;
            int cfr_ignored_0 = (0xA4027CE4 ^ n) - -122831100;
        }
        return this.x;
    }

    @Generated
    public float getY() {
        block0: {
            int n = -636784662;
            n = Integer.rotateLeft(n * 17842353, 19) ^ 0xE9E0344D;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xE92DC2D1;
            if ((n2 ^ n) == -382876975) break block0;
            int cfr_ignored_0 = (0x3326AD3B ^ n) + 98812246;
        }
        return this.y;
    }

    @Generated
    public float getInitialXVal() {
        block0: {
            int n = -1810163336;
            int n2 = (n = Integer.rotateLeft(n * -90172725, 26) ^ 0xE3A9A942) ^ 0xBA5BB200;
            if ((n2 ^ n) == -1168395776) break block0;
            int cfr_ignored_0 = (0x2E40AB78 ^ n) - 1574093635;
        }
        return this.initialXVal;
    }

    @Generated
    public float getInitialYVal() {
        block0: {
            int n = -200270777;
            n = Integer.rotateLeft(n * -1893569003, 18) ^ 0x65ADEE3D;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 3);
            int n2 = n ^ 0xB1483091;
            if ((n2 ^ n) == -1320669039) break block0;
            int cfr_ignored_0 = (0x45582CD6 ^ n) + 1439351867;
        }
        return this.initialYVal;
    }

    @Generated
    public float getStartX() {
        block0: {
            int n = kr.rst_2(-555904932);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xA6587CDE;
            if ((n2 ^ n) == -1504150306) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x7885EC82 ^ n, 18) + -1667939591;
        }
        return this.startX;
    }

    @Generated
    public float getStartY() {
        block0: {
            int n = 317294584;
            n = Integer.rotateLeft(n * -565653349, 23) ^ 0x2C547AF8;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 14);
            int n2 = n ^ 0xF4537707;
            if ((n2 ^ n) == -195856633) break block0;
            int cfr_ignored_0 = (0xE6BAF0FF ^ n) - 1281599543;
        }
        return this.startY;
    }

    @Generated
    public float getDragStartX() {
        block0: {
            int n = 1357115357;
            n = Integer.rotateLeft(n * 722759227, 13) ^ 0xFF03D1A7;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x66130BC5;
            if ((n2 ^ n) == 1712524229) break block0;
            int cfr_ignored_0 = (0x36F0E418 ^ n) + 1690194466;
        }
        return this.dragStartX;
    }

    @Generated
    public float getDragStartY() {
        block0: {
            int n = kr.rst_2(-862087045);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xCE9CAB7D;
            if ((n2 ^ n) == -828593283) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0x2013306 ^ n, 3) - 1115868405;
        }
        return this.dragStartY;
    }

    @Generated
    public float getResizeStartMouseX() {
        return this.resizeStartMouseX;
    }

    @Generated
    public float getResizeStartMouseY() {
        return this.resizeStartMouseY;
    }

    @Generated
    public float getResizeStartScale() {
        block0: {
            int n = -1373842435;
            n = Integer.rotateLeft(n * 820224387, 22) ^ 0xBFAC18C5;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 20);
            int n2 = n ^ 0x36F48210;
            if ((n2 ^ n) == 921993744) break block0;
            int cfr_ignored_0 = (0x98E851ED ^ n) - 974373714;
        }
        return this.resizeStartScale;
    }

    @Generated
    public float getResizeStartWidth() {
        block0: {
            int n = -2898438;
            n = Integer.rotateLeft(n * -1305489267, 9) ^ 0x8F487DA9;
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 27);
            int n2 = n ^ 0x55876C84;
            if ((n2 ^ n) == 1434938500) break block0;
            int cfr_ignored_0 = (0xAA54A97E ^ n) + 1149476268;
        }
        return this.resizeStartWidth;
    }

    @Generated
    public float getResizeStartHeight() {
        block0: {
            int n = kr.rst_2(1949313046);
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0xD1B26963;
            if ((n2 ^ n) == -776836765) break block0;
            int cfr_ignored_0 = (Integer.rotateLeft(0xA5824175 ^ n, 7) - 253987942) * -1518190219;
            int cfr_ignored_1 = (int)(0x6730EF4827D4EB4FL ^ (long)n ^ 0x23E0831A2DB963B0L);
        }
        return this.resizeStartHeight;
    }

    @Generated
    public int getShiftAxis() {
        return this.shiftAxis;
    }

    @Generated
    public boolean isDragging() {
        block0: {
            int n = -647475395;
            n = Integer.rotateLeft(n * 1360014109, 3) ^ 0xE5256FB9;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x12C7EA3;
            if ((n2 ^ n) == 19693219) break block0;
            int cfr_ignored_0 = (0xD844319E ^ n) + 1927998149;
        }
        return this.dragging;
    }

    @Generated
    public boolean isResizing() {
        block0: {
            int n = kr.rst_2(-879323875);
            n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 20);
            int n2 = n ^ 0xFF2A6A90;
            if ((n2 ^ n) == -13997424) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0x34BCFF8D ^ n, 9) - 1732284750;
            int cfr_ignored_1 = (int)(0xF60E51B027D4EB4FL ^ (long)n ^ 0x5E10831A2DB841CDL);
        }
        return this.resizing;
    }

    @Generated
    public float getWidth() {
        block0: {
            int n = -1552803147;
            n = Integer.rotateLeft(n * -39998659, 20) ^ 0xFDB19EB8;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x2C56D8FF;
            if ((n2 ^ n) == 743889151) break block0;
            int cfr_ignored_0 = (0x8F24C24A ^ n) + 400983896;
        }
        return this.width;
    }

    @Generated
    public float getHeight() {
        block0: {
            int n = 866622704;
            n = Integer.rotateLeft(n * -880839355, 22) ^ 0xEC8ABF5A;
            n = Integer.rotateRight(System.identityHashCode(this) ^ n, 3);
            int n2 = n ^ 0x8F0146D5;
            if ((n2 ^ n) == -1895741739) break block0;
            int cfr_ignored_0 = (0xBCA6DA25 ^ n) - 1342691672;
        }
        return this.height;
    }

    @Generated
    public float getScale() {
        block0: {
            int n = -1897668036;
            n = Integer.rotateLeft(n * -379364841, 17) ^ 0xA4E5DC6D;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x7B87EE17;
            if ((n2 ^ n) == 2072505879) break block0;
            int cfr_ignored_0 = (0xF5640C2B ^ n) + -110382002;
        }
        return this.scale;
    }

    @Generated
    public String getName() {
        block0: {
            int n = 496363234;
            n = Integer.rotateLeft(n * 337270219, 7) ^ 0x9CBF701F;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x64B487DD;
            if ((n2 ^ n) == 1689552861) break block0;
            int cfr_ignored_0 = (0x7921613F ^ n) + 2089240154;
        }
        return this.name;
    }

    @Generated
    public bsb getModule() {
        block0: {
            int n = 96262544;
            n = Integer.rotateLeft(n * 856296277, 10) ^ 0xA9C2018D;
            n = System.identityHashCode(this) ^ n;
            int n2 = n ^ 0x6A538346;
            if ((n2 ^ n) == 1783857990) break block0;
            int cfr_ignored_0 = (0x6FEF5AD6 ^ n) - -1519927801;
        }
        return this.module;
    }

    @Generated
    public void setX(float f) {
        int n = -94449662;
        n = Integer.rotateLeft(n * -1491475307, 3) ^ 0xDABE2D0E;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 2);
        int n2 = n ^ 0x5BA4E2F2;
        if ((n2 ^ n) != 1537532658) {
            int cfr_ignored_0 = (0xA1FA32F0 ^ n) + -327235601;
        }
        this.x = f;
    }

    @Generated
    public void setY(float f) {
        int n = kr.rst_2(1101871147);
        n = System.identityHashCode(this) ^ n;
        n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 19);
        int n2 = n ^ 0x5A2EF2B3;
        if ((n2 ^ n) != 1513026227) {
            int cfr_ignored_0 = (Integer.rotateLeft(0x1B83CA98 ^ n, 6) + 1498621859) * 461621913;
        }
        this.y = f;
    }

    @Generated
    public void setInitialXVal(float f) {
        int n = -898670844;
        n = Integer.rotateLeft(n * 1889767025, 23) ^ 0xDD2F9FD8;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0xC94DF037;
        if ((n2 ^ n) != -917639113) {
            int cfr_ignored_0 = (0x322AF33 ^ n) + 617675295;
        }
        this.initialXVal = f;
    }

    @Generated
    public void setInitialYVal(float f) {
        int n = 1883317697;
        n = Integer.rotateLeft(n * -238988349, 16) ^ 0x69B094A;
        n = System.identityHashCode(this) ^ n;
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0xEADCEE4;
        if ((n2 ^ n) != 246271716) {
            int cfr_ignored_0 = (0x7EECEB25 ^ n) + 1203250072;
        }
        this.initialYVal = f;
    }

    @Generated
    public void setStartX(float f) {
        int n = 1173455508;
        n = Integer.rotateLeft(n * -984826169, 19) ^ 0x945269E2;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 7);
        n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 22);
        int n2 = n ^ 0x47534684;
        if ((n2 ^ n) != 1196639876) {
            int cfr_ignored_0 = (0x2A2C410 ^ n) - 1163758690;
        }
        this.startX = f;
    }

    @Generated
    public void setStartY(float f) {
        int n = kr.rst_2(-851020979);
        n = System.identityHashCode(this) ^ n;
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0x5BEF4F6C;
        if ((n2 ^ n) != 1542410092) {
            int cfr_ignored_0 = Integer.rotateLeft(0x96A93C21 ^ n, 5) + 1121707834;
            int cfr_ignored_1 = (int)(0x541B921C27D4EB4FL ^ (long)n ^ 0xD948831A2DB905E6L);
        }
        this.startY = f;
    }

    @Generated
    public void setDragStartX(float f) {
        int n = -1589601215;
        n = Integer.rotateLeft(n * -389553225, 8) ^ 0x233EADDF;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x5C6D8E2F;
        if ((n2 ^ n) != 1550683695) {
            int cfr_ignored_0 = (0xFD2D126E ^ n) - 275051199;
        }
        this.dragStartX = f;
    }

    @Generated
    public void setDragStartY(float f) {
        int n = -801571229;
        n = Integer.rotateLeft(n * 1584174003, 14) ^ 0x1F24DEB5;
        n = System.identityHashCode(this) ^ n;
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0x5103054A;
        if ((n2 ^ n) != 1359152458) {
            int cfr_ignored_0 = (0x813BFB29 ^ n) - -251799388;
        }
        this.dragStartY = f;
    }

    @Generated
    public void setResizeStartMouseX(float f) {
        this.resizeStartMouseX = f;
    }

    @Generated
    public void setResizeStartMouseY(float f) {
        this.resizeStartMouseY = f;
    }

    @Generated
    public void setResizeStartScale(float f) {
        int n = -468059392;
        n = Integer.rotateLeft(n * -1005247477, 3) ^ 0x746BEBA1;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 6);
        n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 19);
        int n2 = n ^ 0x708A79CF;
        if ((n2 ^ n) != 1888123343) {
            int cfr_ignored_0 = (0x949382CF ^ n) - -64185446;
        }
        this.resizeStartScale = f;
    }

    @Generated
    public void setResizeStartWidth(float f) {
        int n = -1076485901;
        n = Integer.rotateLeft(n * 679742621, 10) ^ 0x5F4AA141;
        n = Integer.rotateLeft(System.identityHashCode(this) ^ n, 14);
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0x786790F4;
        if ((n2 ^ n) != 2020053236) {
            int cfr_ignored_0 = (0xC7B1B007 ^ n) + -1281406290;
        }
        this.resizeStartWidth = f;
    }

    @Generated
    public void setResizeStartHeight(float f) {
        int n = 151016015;
        n = Integer.rotateLeft(n * 316037861, 8) ^ 0xEA66D5C8;
        n = System.identityHashCode(this) ^ n;
        n = Integer.rotateRight(Float.floatToIntBits(f) ^ n, 16);
        int n2 = n ^ 0xE9EF97CC;
        if ((n2 ^ n) != -370174004) {
            int cfr_ignored_0 = (0xE0EFC583 ^ n) - -740722256;
        }
        this.resizeStartHeight = f;
    }

    @Generated
    public void setShiftAxis(int n) {
        this.shiftAxis = n;
    }

    @Generated
    public void setDragging(boolean bl) {
        int n = 1408878231;
        n = Integer.rotateLeft(n * -1024909985, 28) ^ 0xB9B13270;
        n = System.identityHashCode(this) ^ n;
        int n2 = n ^ 0x7CB4B4F8;
        if ((n2 ^ n) != 2092217592) {
            int cfr_ignored_0 = (0x2F4D726F ^ n) - 383249319;
        }
        this.dragging = bl;
    }

    @Generated
    public void setResizing(boolean bl) {
        int n = 1424533633;
        n = Integer.rotateLeft(n * -2128082243, 14) ^ 0x2B05B6;
        n = Integer.rotateRight(System.identityHashCode(this) ^ n, 7);
        int n2 = n ^ 0x412F3060;
        if ((n2 ^ n) != 1093611616) {
            int cfr_ignored_0 = (0x15C798E1 ^ n) - -324119104;
        }
        this.resizing = bl;
    }

    @Generated
    public void setWidth(float f) {
        int n = 1187858294;
        n = Integer.rotateLeft(n * 1548668581, 22) ^ 0x41593497;
        n = System.identityHashCode(this) ^ n;
        n = Float.floatToIntBits(f) ^ n;
        int n2 = n ^ 0xD05085E1;
        if ((n2 ^ n) != -800029215) {
            int cfr_ignored_0 = (0x969DC297 ^ n) + 1288733655;
        }
        this.width = f;
    }

    @Generated
    public void setHeight(float f) {
        int n = -55292379;
        int n2 = (n = Integer.rotateLeft(n * 600596433, 21) ^ 0x86210355) ^ 0x7972307D;
        if ((n2 ^ n) != 2037526653) {
            int cfr_ignored_0 = (0x85C67E58 ^ n) - -2040759093;
        }
        this.height = f;
    }

    private void lambda$new$0(rs rs2) {
        int n = 0;
        int n2 = -1061818194;
        n2 = Integer.rotateLeft(n2 * -1493447451, 19) ^ 0xAA515AE5;
        n2 = System.identityHashCode(this) ^ n2;
        int n3 = n2 ^ 0x4A236968;
        while (true) {
            block29: {
                block27: {
                    block31: {
                        block33: {
                            block37: {
                                block28: {
                                    block41: {
                                        block49: {
                                            block30: {
                                                block42: {
                                                    block46: {
                                                        block45: {
                                                            block47: {
                                                                block36: {
                                                                    block35: {
                                                                        block48: {
                                                                            block34: {
                                                                                block40: {
                                                                                    block43: {
                                                                                        block44: {
                                                                                            block38: {
                                                                                                block39: {
                                                                                                    block24: {
                                                                                                        block32: {
                                                                                                            block25: {
                                                                                                                block26: {
                                                                                                                    if ((n = n3 ^ n2) > 488894510) break block24;
                                                                                                                    if (n > -1168616967) break block25;
                                                                                                                    if (n > -1324354920) break block26;
                                                                                                                    if (n == -1774020268) break block27;
                                                                                                                    if (n == -1324354920) break block28;
                                                                                                                    break block29;
                                                                                                                }
                                                                                                                if (n == -1236087576) break block30;
                                                                                                                if (n == -1168616967) break block31;
                                                                                                                int cfr_ignored_0 = (Integer.rotateRight(0xB241BB1B ^ n2, 9) + -1705818240) * -1304315109;
                                                                                                                break block29;
                                                                                                            }
                                                                                                            if (n > -527229366) break block32;
                                                                                                            if (n == -949125340) break block33;
                                                                                                            if (n == -527229366) break block34;
                                                                                                            int cfr_ignored_1 = Integer.rotateLeft(0xC4A43904 ^ n2, 11) - -733968713;
                                                                                                            break block29;
                                                                                                        }
                                                                                                        if (n == -242304769) break block35;
                                                                                                        if (n == 258979778) break block36;
                                                                                                        int cfr_ignored_2 = (Integer.rotateRight(0x4F78029A ^ n2, 12) + -1545211935) * 1333265051;
                                                                                                        if (n == 488894510) break block37;
                                                                                                        break block29;
                                                                                                    }
                                                                                                    if (n > 1243834728) break block38;
                                                                                                    if (n > 510921672) break block39;
                                                                                                    if (n == 504359780) break block40;
                                                                                                    if (n == 510921672) break block41;
                                                                                                    break block29;
                                                                                                }
                                                                                                if (n == 874209079) break block42;
                                                                                                if (n == 1243834728) break block43;
                                                                                                int cfr_ignored_3 = Integer.rotateLeft(0x997C8AC8 ^ n2, 6) + -1703776909;
                                                                                                break block29;
                                                                                            }
                                                                                            if (n > 1310412784) break block44;
                                                                                            if (n == 1308175581) break block45;
                                                                                            if (n == 1310412784) break block46;
                                                                                            int cfr_ignored_4 = (Integer.rotateLeft(0xD3567FF5 ^ n2, 13) - -1680400922) * -749305867;
                                                                                            int cfr_ignored_5 = (int)(0x11E4D1C827D4EB4FL ^ (long)n2 ^ 0x5EE0831A2DB98E18L);
                                                                                            break block29;
                                                                                        }
                                                                                        if (n == 1315066702) break block47;
                                                                                        if (n == 1573308006) break block48;
                                                                                        int cfr_ignored_6 = Integer.rotateLeft(0x33FEB249 ^ n2, 9) + 1345664530;
                                                                                        int cfr_ignored_7 = (int)(0xF14C1C7427D4EB4FL ^ (long)n2 ^ 0xC598831A2DB84F49L);
                                                                                        if (n == 2134056503) break block49;
                                                                                        break block29;
                                                                                    }
                                                                                    int cfr_ignored_8 = (Integer.rotateLeft(0x44F3FF1D ^ n2, 11) - 1575584702) * 1156841245;
                                                                                    int cfr_ignored_9 = (int)(0x8641512027D4EB4FL ^ (long)n2 ^ 0x5F30831A2DB8A153L);
                                                                                    if (!yf.khdha_2()) {
                                                                                        try {
                                                                                            n -= 4;
                                                                                            if ((0x27FA7496F18FD99DL ^ (long)n2 | 1L) == 0L) {
                                                                                                throw new NoSuchElementException();
                                                                                            }
                                                                                            n3 = (int)((long)(n2 ^ 0x5DC6C666) ^ 0x67A3D549E5FB77B7L ^ 0x67A3D549E5FB77B7L);
                                                                                        }
                                                                                        catch (NoSuchElementException noSuchElementException) {
                                                                                            n3 = n2 ^ 0x5DC6C666 ^ 0x344157F5 ^ 0x344157F5;
                                                                                        }
                                                                                        continue;
                                                                                    }
                                                                                    int cfr_ignored_10 = (int)(0xEB54215D59200CCFL ^ (long)n2 ^ 0xBFCA7EF3E2B87B79L);
                                                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xF18EB8FF));
                                                                                    continue;
                                                                                }
                                                                                int cfr_ignored_11 = (Integer.rotateLeft(0xE7FBB9D0 ^ n2, 15) + 467214187) * -402933295;
                                                                                return;
                                                                            }
                                                                            int cfr_ignored_12 = (Integer.rotateRight(0x15C31BB2 ^ n2, 5) + -1493304887) * 365108147;
                                                                            this.clampToScreen();
                                                                            try {
                                                                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x1E0FEB64));
                                                                            }
                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                n3 = (n2 ^ 0x1E0FEB64) + -514278030 - -514278030;
                                                                            }
                                                                            n += 5;
                                                                            continue;
                                                                        }
                                                                        int cfr_ignored_13 = Integer.rotateRight(0xC109C88A ^ n2, 11) + 1686956017;
                                                                        yf.athz_2();
                                                                        throw null;
                                                                    }
                                                                    int cfr_ignored_14 = Integer.rotateRight(0x63ED2D43 ^ n2, 15) + 504765016;
                                                                    if (this.dragging) {
                                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0xB278FA0D));
                                                                        int cfr_ignored_15 = Integer.rotateRight(0xFAFD9D8B ^ n2, 18) + 1762898704;
                                                                        n3 = n2 ^ 0xE0931E4A ^ 0x58DAB2B ^ 0x58DAB2B;
                                                                        --n;
                                                                        continue;
                                                                    }
                                                                    n3 = (n2 ^ 0xC5BCD2FF) + 1881809626 - 1881809626;
                                                                    int cfr_ignored_16 = (Integer.rotateLeft(0x42688551 ^ n2, 11) + 252036106) * 1114146129;
                                                                    int cfr_ignored_17 = (int)(0x80DA2B6C27D4EB4FL ^ (long)n2 ^ 0xABA8831A2DB8AC65L);
                                                                    n3 = n2 ^ 0x1E0FEB64;
                                                                    n -= 2;
                                                                    continue;
                                                                }
                                                                int cfr_ignored_18 = Integer.rotateRight(0x637A3C87 ^ n2, 15) - 271250324;
                                                                n3 = (int)((long)(n2 ^ 0x6E2868CD) ^ 0xBBDBDBA29914D7FBL ^ 0xBBDBDBA29914D7FBL);
                                                                int cfr_ignored_19 = Integer.rotateRight(0x2EAC290F ^ n2, 8) - -1422485492;
                                                                int cfr_ignored_20 = (int)(0xA27A79F432D777F3L ^ (long)n2 ^ 0xE98A91D14C0E925L);
                                                                n3 = n2 ^ 0x4A236968;
                                                                continue;
                                                            }
                                                            int cfr_ignored_21 = (Integer.rotateRight(0x96A2DAD6 ^ n2, 5) - 1108746021) * -1767712041;
                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0xFB4A0E94));
                                                            int cfr_ignored_22 = Integer.rotateRight(0x74CB5943 ^ n2, 17) + 687697496;
                                                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x4A236968));
                                                            int cfr_ignored_23 = Integer.rotateRight(0x35ADB1AE ^ n2, 9) - -2073681075;
                                                            continue;
                                                        }
                                                        int cfr_ignored_24 = (Integer.rotateLeft(0x6E429175 ^ n2, 16) - 1584217190) * 1849856373;
                                                        int cfr_ignored_25 = (int)(0xACF03F4827D4EB4FL ^ (long)n2 ^ 0x83E0831A2DB8F431L);
                                                        n3 = Integer.reverse(Integer.reverse(n2 ^ 0x4A236968));
                                                        int cfr_ignored_26 = Integer.rotateRight(0x7CCFCE26 ^ n2, 18) - 562533845;
                                                        continue;
                                                    }
                                                    int cfr_ignored_27 = (Integer.rotateRight(0xCF1D35D2 ^ n2, 12) + 417801129) * -820169261;
                                                    n3 = n2 ^ 0x3995E63C;
                                                    int cfr_ignored_28 = (Integer.rotateLeft(0x8E356459 ^ n2, 4) + 1020577282) * -1909103527;
                                                    int cfr_ignored_29 = (int)(0x4C87CA6427D4EB4FL ^ (long)n2 ^ 0x69B8831A2DB934DEL);
                                                    n3 = n2 ^ 0x4A236968 ^ 0xCAEC3167 ^ 0xCAEC3167;
                                                    n -= 4;
                                                    continue;
                                                }
                                                int cfr_ignored_30 = (Integer.rotateLeft(0x7BE63394 ^ n2, 18) - 87940647) * 2078684053;
                                                n3 = n2 ^ 0x3686E9F0 ^ 0xC58A182E ^ 0xC58A182E;
                                                int cfr_ignored_31 = Integer.rotateLeft(0xCC3BA6ED ^ n2, 12) - -1080633874;
                                                int cfr_ignored_32 = (int)(0xE8908D027D4EB4FL ^ (long)n2 ^ 0xECD0831A2DB9B0C3L);
                                                try {
                                                    n3 = (int)((long)(n2 ^ 0x4A236968) ^ 0x406AC4DDB329B08EL ^ 0x406AC4DDB329B08EL);
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0x4A236968));
                                                }
                                                n -= 5;
                                                continue;
                                            }
                                            int cfr_ignored_33 = (Integer.rotateRight(0x97DEE172 ^ n2, 5) + 1750789129) * -1747000973;
                                            n3 = n2 ^ 0x24DF3D74 ^ 0x8612B58C ^ 0x8612B58C;
                                            int cfr_ignored_34 = Integer.rotateLeft(0x5B4558A4 ^ n2, 14) - 298015511;
                                            try {
                                                n3 = (int)((long)(n2 ^ 0x4A236968) ^ 0x7A5FCEA42B4A840L ^ 0x7A5FCEA42B4A840L);
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                n3 = (int)((long)(n2 ^ 0x4A236968) ^ 0xB08223000B88B980L ^ 0xB08223000B88B980L);
                                            }
                                            continue;
                                        }
                                        int cfr_ignored_35 = (Integer.rotateRight(0xBC4EF2DE ^ n2, 10) - -772995043) * -1135676705;
                                        n3 = n2 ^ 0x3D81DFA1 ^ 0x2E84562 ^ 0x2E84562;
                                        int cfr_ignored_36 = Integer.rotateLeft(0xB2C57769 ^ n2, 9) + -1438182158;
                                        int cfr_ignored_37 = (int)(0x7077D95427D4EB4FL ^ (long)n2 ^ 0x4FD8831A2DB94D3EL);
                                        try {
                                            n += 4;
                                            if ((0xF37B566F7574E5BL ^ (long)n2 | 1L) == 0L) {
                                                throw new UnsupportedOperationException();
                                            }
                                            n3 = n2 ^ 0x4A236968;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            n3 = n2 ^ 0x4A236968;
                                        }
                                        n += 5;
                                        continue;
                                    }
                                    int cfr_ignored_38 = (Integer.rotateLeft(0x44CC6E78 ^ n2, 11) + 1495203779) * 1154248313;
                                    n3 = n2 ^ 0x1F7BD36A ^ 0x4E1E4CD7 ^ 0x4E1E4CD7;
                                    int cfr_ignored_39 = (Integer.rotateRight(0xB4C1957 ^ n2, 4) - 1653911748) * 189536599;
                                    int cfr_ignored_40 = (int)(0x7DA38005E57B275CL ^ (long)n2 ^ 0xFD7B0645B59F5696L);
                                    n3 = (int)((long)(n2 ^ 0xC1757BB4) ^ 0x7FA71887014ED6F0L ^ 0x7FA71887014ED6F0L);
                                    int cfr_ignored_41 = (int)(0xEDA08F50A70167B2L ^ (long)n2 ^ 0xE3D182B134427690L);
                                    n3 = (int)((long)(n2 ^ 0x4A236968) ^ 0x4EEEA8B2655BEE27L ^ 0x4EEEA8B2655BEE27L);
                                    n -= 2;
                                    continue;
                                }
                                int cfr_ignored_42 = Integer.rotateLeft(0xAE12506C ^ n2, 8) - 412441679;
                                try {
                                    n += 4;
                                    if ((0x64549255221FDB99L ^ (long)n2 | 1L) == 0L) {
                                        throw new UnsupportedOperationException();
                                    }
                                    n3 = (int)((long)(n2 ^ 0x4A236968) ^ 0xE7E318710F499FDDL ^ 0xE7E318710F499FDDL);
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    n3 = (n2 ^ 0x4A236968) + -359305525 - -359305525;
                                }
                                --n;
                                continue;
                            }
                            int cfr_ignored_43 = Integer.rotateRight(0x7FA1926B ^ n2, 18) + 2028886576;
                            n3 = Integer.reverse(Integer.reverse(n2 ^ 0x27FB329C));
                            int cfr_ignored_44 = Integer.rotateRight(0x19F0B2A2 ^ n2, 6) + 679690457;
                            try {
                                --n;
                                if ((0x2D8F970C18A51D8FL ^ (long)n2 | 1L) == 0L) {
                                    throw new UnsupportedOperationException();
                                }
                                n3 = Integer.reverse(Integer.reverse(n2 ^ 0x4A236968));
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                n3 = n2 ^ 0x4A236968 ^ 0x787C3B9C ^ 0x787C3B9C;
                            }
                            n += 5;
                            continue;
                        }
                        int cfr_ignored_45 = Integer.rotateRight(0x6F1528E3 ^ n2, 16) + 2012058296;
                        n3 = n2 ^ 0x513FD8A0 ^ 0x3478A561 ^ 0x3478A561;
                        int cfr_ignored_46 = (Integer.rotateRight(0xAC2712B6 ^ n2, 8) - -585571515) * -1406725449;
                        n3 = (n2 ^ 0x4A236968) + 1763651970 - 1763651970;
                        n += 2;
                        continue;
                    }
                    int cfr_ignored_47 = Integer.rotateRight(0x93669ECB ^ n2, 5) + -573908528;
                    n3 = Integer.reverse(Integer.reverse(n2 ^ 0xA60D2CDB));
                    int cfr_ignored_48 = (Integer.rotateRight(0x5DB7AC12 ^ n2, 14) + 1570469225) * 1572318227;
                    try {
                        if ((0xBA4DF3E30F2AEA1L ^ (long)n2 | 1L) == 0L) {
                            throw new ArithmeticException();
                        }
                        n3 = (int)((long)(n2 ^ 0x4A236968) ^ 0x1F5A836ADBFABC48L ^ 0x1F5A836ADBFABC48L);
                    }
                    catch (ArithmeticException arithmeticException) {
                        n3 = n2 ^ 0x4A236968;
                    }
                    continue;
                }
                int cfr_ignored_49 = Integer.rotateRight(0xE23D1ACF ^ n2, 15) - 1774444108;
                n3 = (int)((long)(n2 ^ 0x13B2E8E4) ^ 0x7D636AC690162984L ^ 0x7D636AC690162984L);
                int cfr_ignored_50 = (Integer.rotateRight(0x365914F7 ^ n2, 9) - -1725486812) * 911807735;
                int cfr_ignored_51 = (int)(0x23CE13EC891A7425L ^ (long)n2 ^ 0xDAA9DE87136DEA4DL);
                n3 = n2 ^ 0x4A236968 ^ 0xBAD616B8 ^ 0xBAD616B8;
                n -= 5;
                continue;
            }
            int cfr_ignored_52 = Integer.rotateRight(0x3EAEAA27 ^ n2, 10) - -1685833228;
            n3 = n2 ^ 0x4A236968;
        }
    }

    private static LinkedHashMap pfjvvp8h7xu5(bzz bzz2) {
        block0: {
            int n = kr.rst_2(-2002655452);
            int n2 = n ^ 0xE701B473;
            if ((n2 ^ n) == -419318669) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x6FA05357 ^ n, 16) - -2000177468) * 1872778071;
        }
        return bzz2.shzf();
    }

    private static Collection ic6oxgke7u(LinkedHashMap linkedHashMap) {
        block0: {
            int n = -728641368;
            int n2 = (n = Integer.rotateLeft(n * 636451935, 20) ^ 0xD379AC46) ^ 0x6B0DF271;
            if ((n2 ^ n) == 1796076145) break block0;
            int cfr_ignored_0 = (0xBF9C22D9 ^ n) + -1322587067;
        }
        return linkedHashMap.values();
    }

    private static int jmxa2tdw7jcx5(tbb tbb2) {
        block0: {
            int n = kr.rst_2(-811253111);
            tbb tbb3 = tbb2;
            n = Integer.rotateLeft((tbb3 != null ? System.identityHashCode(tbb3) : 0) ^ n, 16);
            int n2 = n ^ 0xD95F6D16;
            if ((n2 ^ n) == -648057578) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x16FA2F9F ^ n, 5) - -861314180) * 385494943;
        }
        return tbb2.normaliseX();
    }

    private static int wiiighayla3b29(tbb tbb2) {
        block0: {
            int n = -489708002;
            n = Integer.rotateLeft(n * -688114907, 25) ^ 0xFD420018;
            tbb tbb3 = tbb2;
            n = Integer.rotateLeft((tbb3 != null ? System.identityHashCode(tbb3) : 0) ^ n, 21);
            int n2 = n ^ 0x30F4E045;
            if ((n2 ^ n) == 821354565) break block0;
            int cfr_ignored_0 = (0xD23B465B ^ n) + 567359587;
        }
        return tbb2.normaliseY();
    }

    private static bzz r62vrnaydwl() {
        block0: {
            int n = kr.rst_2(-1982072724);
            int n2 = n ^ 0x42E0D436;
            if ((n2 ^ n) == 1122030646) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xCB3B2C5A ^ n, 12) + -1601700319) * -885314469;
        }
        return bzz.zhs_7();
    }

    private static float psn40u1f(tbb tbb2) {
        block0: {
            int n = -1872239452;
            n = Integer.rotateLeft(n * 1440765979, 16) ^ 0x86164A6C;
            tbb tbb3 = tbb2;
            n = Integer.rotateLeft((tbb3 != null ? System.identityHashCode(tbb3) : 0) ^ n, 14);
            int n2 = n ^ 0xFEB0EEE6;
            if ((n2 ^ n) == -21958938) break block0;
            int cfr_ignored_0 = (0x6ED70A42 ^ n) - -1821437666;
        }
        return tbb2.getScaledWidth();
    }

    private static int h7uzuhy3(tbb tbb2) {
        block0: {
            int n = kr.rst_2(-825692804);
            int n2 = n ^ 0x12C34DA6;
            if ((n2 ^ n) == 314789286) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0xDC0BA0DA ^ n, 14) + -1446635103) * -603217701;
        }
        return tbb2.normaliseX();
    }

    private static float x0k7zc7mujphl4z(float f, float f2) {
        block0: {
            int n = -1424567213;
            int n2 = (n = Integer.rotateLeft(n * -180715931, 9) ^ 0xD003EE4E) ^ 0x3B05C9D0;
            if ((n2 ^ n) == 990235088) break block0;
            int cfr_ignored_0 = (0x90131D83 ^ n) - 1330559671;
        }
        return Math.max(f, f2);
    }

    private static float pkwa56kw5akd8(tbb tbb2) {
        block0: {
            int n = kr.rst_2(-513267658);
            tbb tbb3 = tbb2;
            n = (tbb3 != null ? System.identityHashCode(tbb3) : 0) ^ n;
            int n2 = n ^ 0x1C3E95B;
            if ((n2 ^ n) == 29616475) break block0;
            int cfr_ignored_0 = Integer.rotateLeft(0xE0ABC16D ^ n, 15) - 959056750;
            int cfr_ignored_1 = (int)(0x22196F5027D4EB4FL ^ (long)n ^ 0x23D0831A2DB9E9E3L);
        }
        return tbb2.getScaledWidth();
    }

    private static float s00u4cyod0a(tbb tbb2) {
        block0: {
            int n = kr.rst_2(-947384873);
            tbb tbb3 = tbb2;
            n = (tbb3 != null ? System.identityHashCode(tbb3) : 0) ^ n;
            int n2 = n ^ 0x70A62278;
            if ((n2 ^ n) == 1889935992) break block0;
            int cfr_ignored_0 = Integer.rotateRight(0xB72E2FAF ^ n, 9) - 854943084;
        }
        return tbb2.getScaledWidth();
    }

    private static int q5qydajp151(tbb tbb2) {
        block0: {
            int n = 1184161622;
            n = Integer.rotateLeft(n * -1947429661, 15) ^ 0xA48D5644;
            tbb tbb3 = tbb2;
            n = Integer.rotateLeft((tbb3 != null ? System.identityHashCode(tbb3) : 0) ^ n, 19);
            int n2 = n ^ 0xFA7F13A3;
            if ((n2 ^ n) == -92335197) break block0;
            int cfr_ignored_0 = (0xBCEBCCF5 ^ n) + 1357569238;
        }
        return tbb2.normaliseX();
    }

    private static int dqwzkw7fuw(tbb tbb2) {
        block0: {
            int n = 1493034998;
            n = Integer.rotateLeft(n * 2105569929, 27) ^ 0xEAC11138;
            tbb tbb3 = tbb2;
            n = (tbb3 != null ? System.identityHashCode(tbb3) : 0) ^ n;
            int n2 = n ^ 0x25E2A43B;
            if ((n2 ^ n) == 635610171) break block0;
            int cfr_ignored_0 = (0x7D1F43CD ^ n) - -1216028812;
        }
        return tbb2.normaliseY();
    }

    private static void ma16umsakzvf() {
        int n = -1939244432;
        int n2 = (n = Integer.rotateLeft(n * -442966651, 8) ^ 0xD1675D1B) ^ 0xB902BE3E;
        if ((n2 ^ n) != -1191002562) {
            int cfr_ignored_0 = (0x356BC44E ^ n) - -1102808284;
        }
        yf.athz_2();
    }

    private static float izlmnlih22x(int n) {
        block0: {
            int n2 = -585634691;
            int n3 = (n2 = Integer.rotateLeft(n2 * -2065163971, 24) ^ 0xFC079DA3) ^ 0xC27FF1B4;
            if ((n3 ^ n2) == -1031802444) break block0;
            int cfr_ignored_0 = (0x1F681DC9 ^ n2) - 484615893;
        }
        return Float.intBitsToFloat(n);
    }

    private static int jfg3ellx(int n, int n2) {
        block0: {
            int n3 = kr.rst_2(-375633030);
            int n4 = (n3 = Integer.rotateLeft(n2 ^ n3, 19)) ^ 0xBC636FA8;
            if ((n4 ^ n3) == -1134334040) break block0;
            int cfr_ignored_0 = (Integer.rotateRight(0x55FF24D2 ^ n3, 13) + 1849889961) * 1442784467;
        }
        return Integer.rotateLeft(n, n2);
    }

    private static double ulhjygs4f3x4o4(class_312 class_3122) {
        block0: {
            int n = -1368140966;
            n = Integer.rotateLeft(n * -725720891, 25) ^ 0x7C923896;
            class_312 class_3123 = class_3122;
            n = (class_3123 != null ? System.identityHashCode(class_3123) : 0) ^ n;
            int n2 = n ^ 0x3E2D7F38;
            if ((n2 ^ n) == 1043169080) break block0;
            int cfr_ignored_0 = (0x905EAC62 ^ n) + 2054392581;
        }
        return class_3122.method_1604();
    }

    private static boolean zi289kdbtz() {
        block0: {
            int n = 2056047628;
            int n2 = (n = Integer.rotateLeft(n * 459315987, 25) ^ 0x894DEF6) ^ 0x994C1207;
            if ((n2 ^ n) == -1723067897) break block0;
            int cfr_ignored_0 = (0xE3C0DE0B ^ n) - -1694798928;
        }
        return yf.khdha_2();
    }

    private static void f2z9jbwkqh() {
        int n = -1490524377;
        int n2 = (n = Integer.rotateLeft(n * 1467443891, 27) ^ 0x43190E0D) ^ 0x766644B;
        if ((n2 ^ n) != 124150859) {
            int cfr_ignored_0 = (0xA04E036C ^ n) - -1545754864;
        }
        yf.athz_2();
    }

    private static class_1041 gaunpvga0(class_310 class_3102) {
        block0: {
            int n = 496957465;
            int n2 = (n = Integer.rotateLeft(n * 240147423, 27) ^ 0x507014F3) ^ 0x136E078F;
            if ((n2 ^ n) == 325977999) break block0;
            int cfr_ignored_0 = (0xEF0FF96 ^ n) + -1819270271;
        }
        return class_3102.method_22683();
    }

    private static int lvzk8raxiq(class_1041 class_10412) {
        block0: {
            int n = -1478739641;
            n = Integer.rotateLeft(n * 419846473, 25) ^ 0x64FEC919;
            class_1041 class_10413 = class_10412;
            n = (class_10413 != null ? System.identityHashCode(class_10413) : 0) ^ n;
            int n2 = n ^ 0x27A3801F;
            if ((n2 ^ n) == 665026591) break block0;
            int cfr_ignored_0 = (0x807FB958 ^ n) + -1675746956;
        }
        return class_10412.method_4502();
    }

    private static float k7p0psifm251gf(tbb tbb2) {
        block0: {
            int n = -700005557;
            n = Integer.rotateLeft(n * -700530151, 25) ^ 0x59365F27;
            tbb tbb3 = tbb2;
            n = (tbb3 != null ? System.identityHashCode(tbb3) : 0) ^ n;
            int n2 = n ^ 0x8601AF4E;
            if ((n2 ^ n) == -2046709938) break block0;
            int cfr_ignored_0 = (0x50476C05 ^ n) + -207025060;
        }
        return tbb2.getScaledWidth();
    }

    private static String[] kigehkegaqbjh(String string) {
        int n = 988503217;
        n = Integer.rotateLeft(n * 1256507919, 22) ^ 0x68A4BC91;
        String string2 = string;
        n = Integer.rotateRight((string2 != null ? System.identityHashCode(string2) : 0) ^ n, 21);
        int n2 = n ^ 0x41767B9E;
        if ((n2 ^ n) != 1098283934) {
            int cfr_ignored_0 = (0x7B9D272F ^ n) - -1458134116;
        }
        String[] stringArray = new String[4];
        int n3 = 0;
        for (int i = 0; i < 4; ++i) {
            char c = string.charAt(n3++);
            stringArray[i] = string.substring(n3, n3 + c);
            n3 += c;
        }
        return stringArray;
    }

    private static CallSite bcnby9jp1m(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            int n3 = -545512842;
            n3 = Integer.rotateLeft(n3 * 1895633301, 21) ^ 0x61FC636A;
            n3 = Integer.rotateLeft(n ^ n3, 24);
            Class clazz2 = clazz;
            n3 = (clazz2 != null ? System.identityHashCode(clazz2) : 0) ^ n3;
            int n4 = n3 ^ 0x2D93ECFA;
            if ((n4 ^ n3) != 764669178) {
                int cfr_ignored_0 = (0xF2EFCE8C ^ n3) - 1246134218;
            }
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ Integer.rotateRight((n ^ ds58rqbi9zjz ^ string.hashCode()) + (n2 + kvtwvl5j4q0o) + i ^ ds58rqbi9zjz, 24) + kvtwvl5j4q0o);
            }
            String[] stringArray = tbb.kigehkegaqbjh(new String(cArray));
            int n5 = Integer.parseInt(stringArray[3]);
            ClassLoader classLoader = lookup.lookupClass().getClassLoader();
            MethodType methodType2 = MethodType.fromMethodDescriptorString(stringArray[2], classLoader);
            MethodHandle methodHandle = n5 == 0 ? lookup.findStatic(clazz, stringArray[1], methodType2) : lookup.findVirtual(clazz, stringArray[1], methodType2);
            return new MutableCallSite(methodHandle.asType(methodType));
        }
        catch (Throwable throwable) {
            throw new BootstrapMethodError(throwable);
        }
    }

    private static String[] sofq4edvahjf(String string) {
        return string.split("\u0002\u0012", -1);
    }

    private static CallSite nlg0pkvfs6(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, int n, int n2, Class clazz) throws Throwable {
        try {
            char[] cArray = string2.toCharArray();
            for (int i = 0; i < cArray.length; ++i) {
                cArray[i] = (char)(cArray[i] ^ (Integer.reverse((n ^ wk8a1bns ^ string.hashCode() ^ n2 + f4w2dujze + i * 1392644317) + wk8a1bns) ^ f4w2dujze));
            }
            String[] stringArray = tbb.sofq4edvahjf(new String(cArray));
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

    private static void AAAAAAAAAAAAAAAA() {
    }
}

