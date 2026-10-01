/*
 * Decompiled with CFR 0.152.
 */
package dev.redstones.mediaplayerinfo;

import dev.redstones.mediaplayerinfo.IMediaSession;
import java.util.List;

public interface MediaPlayerInfo {
    public static final MediaPlayerInfo INSTANCE;

    public List<IMediaSession> getMediaSessions();
}

