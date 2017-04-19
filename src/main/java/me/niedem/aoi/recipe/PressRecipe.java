package me.niedem.aoi.recipe;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLLog;

import java.util.Map;
import java.util.Map.Entry;


public class PressRecipe {

    private static final PressRecipe PRESSING = new PressRecipe();
    private final Table<ItemStack, ItemStack, ItemStack> PressList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    public static PressRecipe instance(){
        return PRESSING;
    }

    public void addPressRecipe(ItemStack input1, ItemStack input2, ItemStack result, float experience){
        if(getPressResult(input1, input2) != null) {
            FMLLog.info("Ignored presser recipe with conflicting input: " + input1 + " and " + input2 + " = " + result);
            return;
        }
        this.PressList.put(input1, input2, result);
        this.experienceList.put(result, Float.valueOf(experience));
    }


    public ItemStack getPressResult(ItemStack input1, ItemStack input2){
        for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.PressList.columnMap().entrySet())
            if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
                for (Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
                    if(this.compareItemStacks(input2, (ItemStack)ent.getKey()))
                        return (ItemStack)ent.getValue();
        return new ItemStack((Item)null);
    }

    private PressRecipe(){
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2){
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Table<ItemStack, ItemStack, ItemStack> getPressList(){
        return this.PressList;
    }

    public float getPressExperience(ItemStack stack){
        for(Entry<ItemStack, Float> entry : this.experienceList.entrySet())
            if(this.compareItemStacks(stack, (ItemStack)entry.getKey()))
                return ((Float)entry.getValue()).floatValue();
        return 0.0F;
    }

}
