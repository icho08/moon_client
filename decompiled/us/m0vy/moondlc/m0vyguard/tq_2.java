/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import us.m0vy.moondlc.m0vyguard.bzw;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface tq_2 {
    public String name();

    public bzw category();

    public int key() default -1;

    public boolean disableOnQuit() default false;

    public boolean enabledByDefault() default false;

    public String desc() default "This function has no description";
}

