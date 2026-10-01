/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1542
 *  net.minecraft.class_2338
 *  net.minecraft.class_2535
 *  net.minecraft.class_2586
 *  net.minecraft.class_2622
 *  net.minecraft.class_2672
 *  net.minecraft.class_2678
 *  net.minecraft.class_2708
 *  net.minecraft.class_2775
 *  net.minecraft.class_2818
 *  net.minecraft.class_310
 *  net.minecraft.class_634
 *  net.minecraft.class_8673
 *  net.minecraft.class_8675
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package us.movy.moondlc.mixin.minecraft.client.network;

import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_2338;
import net.minecraft.class_2535;
import net.minecraft.class_2586;
import net.minecraft.class_2622;
import net.minecraft.class_2672;
import net.minecraft.class_2678;
import net.minecraft.class_2708;
import net.minecraft.class_2775;
import net.minecraft.class_2818;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_8673;
import net.minecraft.class_8675;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import us.m0vy.moondlc.m0vyguard.bght_2;
import us.m0vy.moondlc.m0vyguard.byth;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.tdb;
import us.m0vy.moondlc.m0vyguard.lb;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_634.class})
public abstract class ClientPlayNetworkHandlerMixin
extends class_8673
implements tthy {
    @Unique
    private lb oldRotation = lb.thah_3;

    protected ClientPlayNetworkHandlerMixin(class_310 client, class_2535 connection, class_8675 connectionState) {
        super(client, connection, connectionState);
    }

    @Inject(method={"onItemPickupAnimation(Lnet/minecraft/network/packet/s2c/play/ItemPickupAnimationS2CPacket;)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/world/ClientWorld;getEntityById(I)Lnet/minecraft/entity/Entity;", ordinal=0)})
    private void onItemPickupAnimation(class_2775 packet, CallbackInfo info) {
        class_1297 itemEntity = this.field_45588.field_1687.method_8469(packet.method_11915());
        class_1297 entity = this.field_45588.field_1687.method_8469(packet.method_11912());
        if (itemEntity instanceof class_1542 && entity == this.field_45588.field_1724) {
            Moondlc.getInstance().getEventManager().azj_2(new byth(((class_1542)itemEntity).method_6983(), packet.method_11913()));
        }
    }

    @Inject(method={"onBlockEntityUpdate(Lnet/minecraft/network/packet/s2c/play/BlockEntityUpdateS2CPacket;)V"}, at={@At(value="TAIL")})
    private void onBlockEntityUpdate(class_2622 packet, CallbackInfo ci) {
        class_2338 pos;
        class_2586 blockEntity;
        if (ClientPlayNetworkHandlerMixin.mc.field_1687 != null && (blockEntity = ClientPlayNetworkHandlerMixin.mc.field_1687.method_8321(pos = packet.method_11293())) != null && !bght_2.sma_2.contains(blockEntity)) {
            bght_2.sma_2.add(blockEntity);
        }
    }

    @Inject(method={"onChunkData(Lnet/minecraft/network/packet/s2c/play/ChunkDataS2CPacket;)V"}, at={@At(value="TAIL")})
    private void onChunkData(class_2672 packet, CallbackInfo ci) {
        if (ClientPlayNetworkHandlerMixin.mc.field_1687 != null) {
            class_2818 chunk = ClientPlayNetworkHandlerMixin.mc.field_1687.method_8497(packet.method_11523(), packet.method_11524());
            chunk.method_12214().values().forEach(be -> {
                if (!bght_2.sma_2.contains(be)) {
                    bght_2.sma_2.add(be);
                }
            });
        }
    }

    @Inject(method={"onGameJoin(Lnet/minecraft/network/packet/s2c/play/GameJoinS2CPacket;)V"}, at={@At(value="TAIL")})
    private void onGameJoin(class_2678 packet, CallbackInfo ci) {
        bght_2.sma_2.clear();
        Moondlc.getInstance().getEventManager().azj_2(new tdb());
    }

    @Inject(method={"onPlayerPositionLook(Lnet/minecraft/network/packet/s2c/play/PlayerPositionLookS2CPacket;)V"}, at={@At(value="HEAD")})
    public void savePlayerRotation(class_2708 packet, CallbackInfo ci) {
        if (ClientPlayNetworkHandlerMixin.mc.field_1724 != null) {
            this.oldRotation = new lb(ClientPlayNetworkHandlerMixin.mc.field_1724.method_36454(), ClientPlayNetworkHandlerMixin.mc.field_1724.method_36455());
        }
    }

    @Inject(method={"onPlayerPositionLook(Lnet/minecraft/network/packet/s2c/play/PlayerPositionLookS2CPacket;)V"}, at={@At(value="RETURN")})
    public void modifyPlayerRotation(class_2708 packet, CallbackInfo ci) {
        if (ClientPlayNetworkHandlerMixin.mc.field_1724 != null) {
            new lb(packet.comp_3228().comp_3150(), packet.comp_3228().comp_3151());
        }
    }
}

