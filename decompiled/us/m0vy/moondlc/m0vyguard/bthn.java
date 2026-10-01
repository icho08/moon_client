/*
 * Decompiled with CFR 0.152.
 */
package us.m0vy.moondlc.m0vyguard;

import java.util.List;
import us.m0vy.moondlc.m0vyguard.ghkh;

public interface bthn {
    public List names();

    public String description();

    public List parameters();

    public List subcommands();

    public boolean executable();

    public ghkh handler();
}

