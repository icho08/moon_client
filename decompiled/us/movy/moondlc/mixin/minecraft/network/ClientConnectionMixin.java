/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2535
 *  net.minecraft.class_2547
 *  net.minecraft.class_2596
 *  net.minecraft.class_310
 *  net.minecraft.class_7648
 *  net.minecraft.class_8042
 *  org.jetbrains.annotations.Nullable
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.network;

import java.util.ArrayList;
import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import net.minecraft.class_310;
import net.minecraft.class_7648;
import net.minecraft.class_8042;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.bdy_2;
import us.m0vy.moondlc.m0vyguard.bksh;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.thdh;
import us.m0vy.moondlc.m0vyguard.zth_3;
import us.m0vy.moondlc.m0vyguard.ghd_2;
import us.m0vy.moondlc.m0vyguard.ghh_2;
import us.m0vy.moondlc.m0vyguard.km;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_2535.class})
public class ClientConnectionMixin
implements tthy {
    @Unique
    private static boolean stackOverflowFix;

    @Inject(method={"handlePacket(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/listener/PacketListener;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private static <T extends class_2547> void triggerReceivePacketEvent(class_2596<T> packet, class_2547 listener, CallbackInfo ci) {
        boolean cancel = false;
        ArrayList<class_2596> passthroughPackets = new ArrayList<class_2596>();
        if (packet instanceof class_8042) {
            class_8042 bundlePacket = (class_8042)packet;
            for (class_2596 innerPacket : bundlePacket.method_48324()) {
                bksh newEvent = new bksh(innerPacket);
                Moondlc.getInstance().getEventManager().azj_2(newEvent);
                boolean oldCancelled = false;
                if (class_310.method_1551().field_1724 != null && class_310.method_1551().field_1687 != null) {
                    oldCancelled = ClientConnectionMixin.handleSinglePacketOld(innerPacket);
                }
                if (newEvent.tsm_3() || oldCancelled) {
                    cancel = true;
                    continue;
                }
                passthroughPackets.add(innerPacket);
            }
            if (cancel) {
                for (class_2596 passthroughPacket : passthroughPackets) {
                    ClientConnectionMixin.applyPacketDirect(passthroughPacket, listener);
                }
                ci.cancel();
            }
            return;
        }
        bksh event = new bksh(packet);
        Moondlc.getInstance().getEventManager().azj_2(event);
        boolean oldCancelled = false;
        if (class_310.method_1551().field_1724 != null && class_310.method_1551().field_1687 != null) {
            oldCancelled = ClientConnectionMixin.handleSinglePacketOld(packet);
        }
        if (event.tsm_3() || oldCancelled) {
            ci.cancel();
        }
    }

    @Inject(method={"send(Lnet/minecraft/network/packet/Packet;Lnet/minecraft/network/PacketCallbacks;Z)V"}, at={@At(value="HEAD")}, cancellable=true)
    public void triggerSendPacketEvent(class_2596<?> packet, @Nullable class_7648 callbacks, boolean flush, CallbackInfo ci) {
        if (km.zhm_2) {
            return;
        }
        if (!stackOverflowFix) {
            ghh_2 event = new ghh_2(packet);
            Moondlc.getInstance().getEventManager().azj_2(event);
            if (event.tsm_3()) {
                ci.cancel();
                return;
            }
            class_2596 newPacket = event.zjd();
            if (newPacket != packet) {
                ci.cancel();
                stackOverflowFix = true;
                ((class_2535)this).method_52906(newPacket, callbacks, flush);
                stackOverflowFix = false;
                return;
            }
        }
        if (class_310.method_1551().field_1724 == null || class_310.method_1551().field_1687 == null || thdh.dhshh_2()) {
            return;
        }
        if (zth_3.dzgh_3().zkhh(new ghd_2(packet, bdy_2.shwth))) {
            ci.cancel();
        }
    }

    @Unique
    private static boolean handleSinglePacketOld(class_2596<?> packet) {
        return zth_3.dzgh_3().zkhh(new ghd_2(packet, bdy_2.shyt_2));
    }

    @Unique
    private static void applyPacketDirect(class_2596<?> packet, class_2547 listener) {
        packet.method_65081(listener);
    }
}

