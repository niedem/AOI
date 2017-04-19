package me.niedem.aoi.tab;

        import net.minecraft.creativetab.CreativeTabs;
        import net.minecraft.init.Items;
        import net.minecraft.item.ItemStack;

public class CreativeTabArmor extends CreativeTabs {

    public CreativeTabArmor(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack getTabIconItem(){
        return new ItemStack(Items.GOLDEN_CHESTPLATE);
    }
}
