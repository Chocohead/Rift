package org.dimdev.rift.mixin.hook.client;

import java.util.Map;
import net.minecraft.client.settings.KeyBinding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(KeyBinding.class)
public class MixinKeyBinding {
    @Shadow private static Map<String, Integer> CATEGORY_ORDER;
    @Inject(method = "<init>", at = @At("RETURN"))
    private void insertCategory(String description,
            int keycode, String category, CallbackInfo ci) {
        if (CATEGORY_ORDER.get(category)==null) {
            CATEGORY_ORDER.put(category, CATEGORY_ORDER.size());
        }
    }
}
