package com.matias.nightfallstalker.client.render;

import com.matias.nightfallstalker.NightfallStalkerMod;
import com.matias.nightfallstalker.entity.NightfallStalkerEntity;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.util.ResourceLocation;

public class NightfallStalkerRenderer extends BipedRenderer<NightfallStalkerEntity, BipedModel<NightfallStalkerEntity>> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(NightfallStalkerMod.MOD_ID, "textures/entity/nightfall_stalker.png");

    public NightfallStalkerRenderer(EntityRendererManager renderManager) {
        super(renderManager, new BipedModel<>(0.0F), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(NightfallStalkerEntity entity) {
        return TEXTURE;
    }
}
