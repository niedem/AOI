package me.niedem.aoi.item;

import me.niedem.aoi.ittgardMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItem {

    //declaring items
    public static Item linnen;
    public static Item flax;
    public static Item flaxyarn;

    public static void preInit(){
        linnen = new Item().setUnlocalizedName("linnen").setCreativeTab(ittgardMod.tabItem);
        flax = new Item().setUnlocalizedName("flax").setCreativeTab(ittgardMod.tabItem);
        flaxyarn = new Item().setUnlocalizedName("flaxyarn").setCreativeTab(ittgardMod.tabItem);
        registerItems();
    }

    public static void init(){
        GameRegistry.addRecipe(new ItemStack(flaxyarn, 3), "FFF", 'F', flax);
        GameRegistry.addRecipe(new ItemStack(linnen, 4), "FFF", "FFF", "FFF", 'F', flaxyarn);
    }

    //registering items
    public static void registerItems(){
        GameRegistry.register(linnen, new ResourceLocation(ittgardMod.MODID, "linnen"));
        GameRegistry.register(flax, new ResourceLocation(ittgardMod.MODID, "flax"));
        GameRegistry.register(flaxyarn, new ResourceLocation(ittgardMod.MODID, "flaxyarn"));
    }

    //registering renders
    public static void registerRenders(){
        registerRender(linnen);
        registerRender(flax);
        registerRender(flaxyarn);
    }

    //setting texture files for register renders
    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ittgardMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
