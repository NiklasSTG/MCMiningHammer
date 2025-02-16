package NiklasYGO.firstmod.blocks;
import NiklasYGO.firstmod.lib.ModVars;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TutorialBlock extends Block {

    protected TutorialBlock(Material material, String name) {
        super(material);
        this.setBlockName(name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockTextureName(ModVars.MOD_ID+":"+ this.getUnlocalizedName());
        this.setHardness(3.0F);
        this.setLightLevel(0.5F);
        this.setHarvestLevel("pickaxe", 2);
        this.setResistance(30.0F);
        this.setStepSound(soundTypeLadder);
    }
}
