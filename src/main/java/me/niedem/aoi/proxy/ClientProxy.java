package me.niedem.aoi.proxy;

import me.niedem.aoi.armor.DaedricArmor;
import me.niedem.aoi.armor.ModArmor;
import me.niedem.aoi.item.ModItem;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {
        ModItem.registerRenders();
        ModArmor.registerRenders();
        DaedricArmor.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}