/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import us.m0vy.moondlc.m0vyguard.qz;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface ay {
    public String name();

    public qz category();

    public String description();
}

