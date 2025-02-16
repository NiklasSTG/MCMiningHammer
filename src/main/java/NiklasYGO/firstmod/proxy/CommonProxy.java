package NiklasYGO.firstmod.proxy;

import NiklasYGO.firstmod.blocks.MHBlocks;
import NiklasYGO.firstmod.crafting.TutorialCrafting;
import NiklasYGO.firstmod.items.MHItems;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit( FMLPreInitializationEvent e ){
        MHItems.init();
        MHBlocks.init();


    }

    public void init(FMLInitializationEvent $e) {
        TutorialCrafting.init();
    }
    public void postInit(FMLPostInitializationEvent $e){

    }
}
