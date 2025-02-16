package NiklasYGO.firstmod.items;

import NiklasYGO.firstmod.lib.ModVars;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;


public class MHItems {

    public static Item ironHammer;
    public static final Item.ToolMaterial ironHammerMaterial = EnumHelper.addToolMaterial("ironHammerMaterial", 2, 300, 6.0F, 4.0F, 14 );

    public static final void init(){


        ironHammer = new MHIronHammer(ironHammerMaterial).setUnlocalizedName("ironHammer").setCreativeTab(CreativeTabs.tabTools);
        ironHammer.setTextureName(ModVars.MOD_ID+":"+ ironHammer.getUnlocalizedName()); // tutmod:tutorialItem
        GameRegistry.registerItem(ironHammer, ironHammer.getUnlocalizedName());

    }

}
