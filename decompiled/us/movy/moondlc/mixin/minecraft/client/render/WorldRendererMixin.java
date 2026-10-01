/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.Local
 *  net.minecraft.class_10209
 *  net.minecraft.class_1297
 *  net.minecraft.class_1920
 *  net.minecraft.class_2338
 *  net.minecraft.class_243
 *  net.minecraft.class_2680
 *  net.minecraft.class_4063
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_757
 *  net.minecraft.class_761
 *  net.minecraft.class_9779
 *  net.minecraft.class_9909
 *  net.minecraft.class_9922
 *  net.minecraft.class_9958
 *  org.joml.Matrix4f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyArgs
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  org.spongepowered.asm.mixin.injection.invoke.arg.Args
 */
package us.movy.moondlc.mixin.minecraft.client.render;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_10209;
import net.minecraft.class_1297;
import net.minecraft.class_1920;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_4063;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import net.minecraft.class_761;
import net.minecraft.class_9779;
import net.minecraft.class_9909;
import net.minecraft.class_9922;
import net.minecraft.class_9958;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import us.m0vy.moondlc.m0vyguard.bak;
import us.m0vy.moondlc.m0vyguard.btd_2;
import us.m0vy.moondlc.m0vyguard.bdht;
import us.m0vy.moondlc.m0vyguard.bra;
import us.m0vy.moondlc.m0vyguard.brs_2;
import us.m0vy.moondlc.m0vyguard.byq;
import us.m0vy.moondlc.m0vyguard.ttm;
import us.m0vy.moondlc.m0vyguard.tthy;
import us.m0vy.moondlc.m0vyguard.thd_2;
import us.m0vy.moondlc.m0vyguard.thl;
import us.m0vy.moondlc.m0vyguard.thr_3;
import us.m0vy.moondlc.m0vyguard.shw_3;
import us.movy.moondlc.Moondlc;

@Mixin(value={class_761.class})
public class WorldRendererMixin
implements tthy {
    @ModifyVariable(method={"render(Lnet/minecraft/client/util/ObjectAllocator;Lnet/minecraft/client/render/RenderTickCounter;ZLnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/GameRenderer;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;)V"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private boolean modifyRenderBlockOutline(boolean original) {
        if (btd_2.bzf_2()) {
            return original;
        }
        bak module = (bak)Moondlc.getInstance().getModuleManager().dfr_2(bak.class);
        if (module != null && module.rgha_2()) {
            return false;
        }
        return original;
    }

    @Inject(method={"render(Lnet/minecraft/client/util/ObjectAllocator;Lnet/minecraft/client/render/RenderTickCounter;ZLnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/GameRenderer;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;)V"}, at={@At(value="HEAD")})
    private void onRenderHead(class_9922 allocator, class_9779 tickCounter, boolean renderBlockOutline, class_4184 camera, class_757 gameRenderer, Matrix4f positionMatrix, Matrix4f projectionMatrix, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        thr_3.swd_4().skhs_4(allocator, positionMatrix, projectionMatrix, camera, gameRenderer);
    }

    @Inject(method={"render(Lnet/minecraft/client/util/ObjectAllocator;Lnet/minecraft/client/render/RenderTickCounter;ZLnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/GameRenderer;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;)V"}, at={@At(value="RETURN")})
    private void render(class_9922 allocator, class_9779 tickCounter, boolean renderBlockOutline, class_4184 camera, class_757 gameRenderer, Matrix4f positionMatrix, Matrix4f projectionMatrix, CallbackInfo ci) {
        class_10209.method_64146().method_15405(Moondlc.dds + "_renderWorld");
        btd_2.ls(positionMatrix, projectionMatrix, camera, tickCounter.method_60637(false));
        if (btd_2.bzf_2()) {
            return;
        }
        this.applyCustomFogDepthBlur(camera);
        brs_2 skyShader = (brs_2)Moondlc.getInstance().getModuleManager().dfr_2(brs_2.class);
        if (skyShader != null && skyShader.rgha_2()) {
            skyShader.zss_2();
        }
        class_4587 matrices = new class_4587();
        matrices.method_34425(positionMatrix);
        Moondlc.getInstance().getEventManager().azj_2(new shw_3(matrices, positionMatrix, projectionMatrix, camera, tickCounter.method_60637(false)));
        thr_3.swd_4().srn_2(allocator, positionMatrix, projectionMatrix, camera, gameRenderer);
    }

    @Inject(method={"getLightmapCoordinates(Lnet/minecraft/world/BlockRenderView;Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/BlockPos;)I"}, at={@At(value="RETURN")}, cancellable=true)
    private static void applyDynamicFullbright(class_1920 world, class_2680 state, class_2338 pos, CallbackInfoReturnable<Integer> info) {
        if (btd_2.bzf_2()) {
            return;
        }
        info.setReturnValue((Object)bra.dds_5(pos, info.getReturnValueI()));
    }

    @ModifyArgs(method={"renderEntities"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/OutlineVertexConsumerProvider;setColor(IIII)V"), require=0, expect=0)
    private void Moondlc$applyOutlineColor(Args args, @Local class_1297 entity) {
        if (entity == null || btd_2.bzf_2()) {
            return;
        }
        thd_2 module = (thd_2)Moondlc.getInstance().getModuleManager().dfr_2(thd_2.class);
        if (module == null || !module.rgha_2() || !module.szt_2(entity)) {
            return;
        }
        byq color = module.zlz_4();
        args.set(0, (Object)((int)color.sbk()));
        args.set(1, (Object)((int)color.srl()));
        args.set(2, (Object)((int)color.shsl_2()));
        args.set(3, (Object)((int)color.tzdh_2()));
    }

    @Inject(method={"renderSky"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderSky(class_9909 frameGraphBuilder, class_4184 camera, float tickDelta, class_9958 fog, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        brs_2 module = (brs_2)Moondlc.getInstance().getModuleManager().dfr_2(brs_2.class);
        if (module != null && module.rgha_2()) {
            ci.cancel();
        }
    }

    @Inject(method={"renderClouds"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderClouds(class_9909 frameGraphBuilder, Matrix4f matrix4f, Matrix4f matrix4f2, class_4063 cloudRenderMode, class_243 vec3d, float f, int i, float f2, CallbackInfo ci) {
        if (btd_2.bzf_2()) {
            return;
        }
        ttm optimization = ttm.zkhh_3();
        if (optimization != null && optimization.tmz_3()) {
            ci.cancel();
            return;
        }
        brs_2 module = (brs_2)Moondlc.getInstance().getModuleManager().dfr_2(brs_2.class);
        if (module != null && module.rgha_2()) {
            ci.cancel();
        }
    }

    private void applyCustomFogDepthBlur(class_4184 camera) {
        if (btd_2.bzf_2()) {
            return;
        }
        thl customFog = (thl)Moondlc.getInstance().getModuleManager().dfr_2(thl.class);
        if (customFog != null && bdht.rkhd_2 != null && customFog.dhsr_2(camera)) {
            float fogStart = customFog.zhn_4().hht();
            float fogEnd = customFog.zhn_4().awt_2();
            if (!(fogEnd <= fogStart)) {
                bdht.rkhd_2.zhk(fogStart, fogEnd, customFog.khkhq().thw_5(), 8, customFog.zbs_3().thw_5(), 0.0f, customFog.kd().shzl());
            }
        }
    }
}

