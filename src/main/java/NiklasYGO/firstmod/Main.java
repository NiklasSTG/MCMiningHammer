package NiklasYGO.firstmod;

import NiklasYGO.firstmod.lib.ModVars;
import NiklasYGO.firstmod.proxy.CommonProxy;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = ModVars.MOD_ID,  name = ModVars.MOD_Name, version = ModVars.MOD_Version)
public class Main {



    @Instance
    public static Main instance = new Main();

    @SidedProxy(clientSide = "NiklasYGO.firstmod.proxy.ClientProxy", serverSide = "NiklasYGO.firstmod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit( FMLPreInitializationEvent e ){
        proxy.preInit(e);


    }

    @EventHandler
    public void init( FMLInitializationEvent e ){
        proxy.init(e);


    }

    @EventHandler
    public void postInit( FMLPostInitializationEvent e ){
        proxy.postInit(e);


    }
}
