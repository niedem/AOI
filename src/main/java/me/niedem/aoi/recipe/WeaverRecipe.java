package me.niedem.aoi.recipe;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import me.niedem.aoi.item.ModItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLLog;

import java.util.Map;
import java.util.Map.Entry;


public class WeaverRecipe {

    private static final WeaverRecipe WEAVER = new WeaverRecipe();
    private final Table<ItemStack, ItemStack, ItemStack> WeaverList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    public static WeaverRecipe instance(){
        return WEAVER;
    }

    public void addWeaverRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience){
        if(getWeaverResult(input1, input2) != null) {
            FMLLog.info("Ignored weaver recipe with conflicting input: " + input1 + " and " + input2 + " = " + result);
            return;
        }
        this.WeaverList.put(input1, input2, result);
        this.experienceList.put(result, experience);
    }


    public ItemStack getWeaverResult(ItemStack input1, ItemStack input2){
        for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.WeaverList.columnMap().entrySet())
            if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
                for (Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
                    if(this.compareItemStacks(input2, (ItemStack)ent.getKey()))
                        return (ItemStack)ent.getValue();
        return new ItemStack((Item)null);
    }

    private WeaverRecipe(){
        this.addWeaverRecipe(new ItemStack(ModItem.flaxyarn), new ItemStack(ModItem.flaxyarn), new ItemStack(ModItem.linnen), 100.0F);
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2){
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Table<ItemStack, ItemStack, ItemStack> getWeaverList(){
        return this.WeaverList;
    }

    public float getWeaverExperience(ItemStack stack){
        for(Entry<ItemStack, Float> entry : this.experienceList.entrySet())
            if(this.compareItemStacks(stack, (ItemStack)entry.getKey()))
                return ((Float)entry.getValue()).floatValue();
        return 0.0F;
    }

}
