package me.niedem.aoi;

import me.niedem.aoi.armor.ArmorCrafting;
import me.niedem.aoi.armor.DaedricArmor;
import me.niedem.aoi.armor.ModArmor;
import me.niedem.aoi.item.ModItem;
import me.niedem.aoi.proxy.CommonProxy;
import me.niedem.aoi.tab.CreativeTabArmor;
import me.niedem.aoi.tab.CreativeTabItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ittgardMod.MODID, version = ittgardMod.VERSION, name = ittgardMod.NAME)

public class ittgardMod {
    public static final String MODID = "ittgard mod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Ittgard Mod";

    @SidedProxy(clientSide = "me.niedem.aoi.proxy.ClientProxy", serverSide = "me.niedem.aoi.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabArmor tabArmor;
    public static CreativeTabItem tabItem;

    @Mod.Instance
    public static ittgardMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        tabArmor = new CreativeTabArmor(CreativeTabs.getNextID(), "tab_armor");
        tabItem = new CreativeTabItem(CreativeTabs.getNextID(), "tab_item");
        ModArmor.preInit();
        ModItem.preInit();
        proxy.preInit(event);
        DaedricArmor.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        ModItem.init();
        ArmorCrafting.init();
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        proxy.postInit(event);
    }
}