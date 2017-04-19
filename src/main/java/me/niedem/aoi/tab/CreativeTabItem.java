package me.niedem.aoi.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CreativeTabItem extends CreativeTabs {

    public CreativeTabItem(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem(){
        return new ItemStack(Items.LEATHER);
    }
}
