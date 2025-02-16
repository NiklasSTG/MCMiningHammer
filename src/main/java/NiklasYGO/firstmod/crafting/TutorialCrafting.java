package NiklasYGO.firstmod.crafting;

import NiklasYGO.firstmod.items.MHItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TutorialCrafting {
    public static void init(){

        GameRegistry.addRecipe(new ItemStack(MHItems.ironHammer, 1), new Object[]{"ITI"," S "," S ", 'T', Items.iron_pickaxe, 'I', Items.iron_ingot, 'S', Items.stick } );
        //GameRegistry.addShapelessRecipe(new ItemStack(MHItems.tutorialItem), new Object[]{Items.iron_pickaxe, Items.iron_ingot});

    }
}
