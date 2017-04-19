package me.niedem.aoi.armor;

import me.niedem.aoi.item.ModItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ArmorCrafting {

    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModArmor.clothHelmet), "LLL", "L L", 'L', ModItem.linnen);
        GameRegistry.addRecipe(new ItemStack(ModArmor.clothChestplate), "L L", "LLL", "LLL", 'L', ModItem.linnen);
        GameRegistry.addRecipe(new ItemStack(ModArmor.clothLeggings), "LLL", "L L", "L L", 'L', ModItem.linnen);
        GameRegistry.addRecipe(new ItemStack(ModArmor.clothBoots), "L L", "L L", 'L', ModItem.linnen);
    }

}
