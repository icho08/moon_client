/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import us.m0vy.moondlc.m0vyguard.bdj;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface tkhh_2 {
    public String name();

    public bdj category();

    public int bind() default -999;

    public String desc() default "";
}

