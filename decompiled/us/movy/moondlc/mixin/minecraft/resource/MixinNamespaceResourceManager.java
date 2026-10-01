/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2960
 *  net.minecraft.class_3262
 *  net.minecraft.class_3294
 *  net.minecraft.class_3298
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package us.movy.moondlc.mixin.minecraft.resource;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import net.minecraft.class_2960;
import net.minecraft.class_3262;
import net.minecraft.class_3294;
import net.minecraft.class_3298;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_3294.class})
public class MixinNamespaceResourceManager {
    @Unique
    private static final class_3262 MOONDLC_MEMORY_PACK;

    @Unique
    private static byte[] moondlc$readMemoryResource(class_2960 id) {
        if (!"moondlc".equalsIgnoreCase(id.method_12836())) {
            return null;
        }
        String path = "assets/moondlc/" + id.method_12832();
        InputStream is = MixinNamespaceResourceManager.class.getClassLoader().getResourceAsStream(path);
        if (is == null) {
            is = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
        }
        if (is == null) {
            is = MixinNamespaceResourceManager.class.getResourceAsStream("/" + path);
        }
        if (is != null) {
            byte[] byArray;
            block12: {
                InputStream stream = is;
                try {
                    byArray = stream.readAllBytes();
                    if (stream == null) break block12;
                }
                catch (Throwable throwable) {
                    try {
                        if (stream != null) {
                            try {
                                stream.close();
                            }
                            catch (Throwable throwable2) {
                                throwable.addSuppressed(throwable2);
                            }
                        }
                        throw throwable;
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                }
                stream.close();
            }
            return byArray;
        }
        return null;
    }

    @Inject(method={"getResource"}, at={@At(value="RETURN")}, cancellable=true)
    private void moondlc$onGetResource(class_2960 id, CallbackInfoReturnable<Optional<class_3298>> cir) {
        byte[] data;
        if ((cir.getReturnValue() == null || ((Optional)cir.getReturnValue()).isEmpty()) && "moondlc".equalsIgnoreCase(id.method_12836()) && (data = MixinNamespaceResourceManager.moondlc$readMemoryResource(id)) != null) {
            cir.setReturnValue(Optional.of(new class_3298(MOONDLC_MEMORY_PACK, () -> new ByteArrayInputStream(data))));
        }
    }

    @Inject(method={"getAllResources"}, at={@At(value="RETURN")}, cancellable=true)
    private void moondlc$onGetAllResources(class_2960 id, CallbackInfoReturnable<List<class_3298>> cir) {
        byte[] data;
        if ((cir.getReturnValue() == null || ((List)cir.getReturnValue()).isEmpty()) && "moondlc".equalsIgnoreCase(id.method_12836()) && (data = MixinNamespaceResourceManager.moondlc$readMemoryResource(id)) != null) {
            cir.setReturnValue(Collections.singletonList(new class_3298(MOONDLC_MEMORY_PACK, () -> new ByteArrayInputStream(data))));
        }
    }
}

