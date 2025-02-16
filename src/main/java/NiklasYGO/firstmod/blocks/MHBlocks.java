package NiklasYGO.firstmod.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

public class MHBlocks {
    public static TutorialBlock tutorialBlock;
    public static final void init(){
        tutorialBlock = new TutorialBlock(Material.rock, "testrock");
        GameRegistry.registerBlock(tutorialBlock, tutorialBlock.getLocalizedName());

    }
}
