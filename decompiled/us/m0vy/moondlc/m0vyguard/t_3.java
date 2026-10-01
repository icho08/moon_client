/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.util.Collections;
import java.util.List;
import us.m0vy.moondlc.m0vyguard.ah_2;

@FunctionalInterface
public interface t_3 {
    public ah_2 validate(String var1);

    default public List suggestions(String string) {
        return Collections.emptyList();
    }
}

