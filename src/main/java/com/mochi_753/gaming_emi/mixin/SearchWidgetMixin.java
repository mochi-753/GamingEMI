package com.mochi_753.gaming_emi.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(dev.emi.emi.screen.widget.EmiSearchWidget.class)
public class SearchWidgetMixin {
    @Redirect(method = "renderWidget", at = @At(value = "INVOKE", target = "Ljava/lang/String;contains(Ljava/lang/CharSequence;)Z"))
    private boolean alwaysTrue(String instance, CharSequence sequence) {
        if ("jeb_".contentEquals(sequence)) {
            return true;
        }
        return instance.contains(sequence);
    }
}
