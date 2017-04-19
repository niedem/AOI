package me.niedem.aoi.armor;

import me.niedem.aoi.ittgardMod;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemCustomArmor extends net.minecraft.item.ItemArmor {

    public static ArmorMaterial CLOTH_ARMOR = EnumHelper.addArmorMaterial("CLOTH_ARMOR", "ittgarditemsmod:cloth", 2, new int[] {1, 1, 2, 1}, 5, SoundEvents.BLOCK_CLOTH_FALL, 0f);
    public static ArmorMaterial LIGHTPADDED_ARMOR = EnumHelper.addArmorMaterial("LIGHTPADDED_ARMOR", "ittgarditemsmod:cloth", 3, new int[] {1, 2, 2, 1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f);
    public static ArmorMaterial LAMELLAR_ARMOR = EnumHelper.addArmorMaterial("LAMELLAR_ARMOR", "ittgarditemsmod:cloth", 5, new int[]{1,2,3,1}, 5, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f);
    public static ArmorMaterial THICKPADDED_ARMOR = EnumHelper.addArmorMaterial("THICKPADDED_ARMOR", "ittgarditemsmod:cloth", 8, new int[]{1,2,3,2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f);
    public static ArmorMaterial PLATEDCHAINMAIL_ARMOR = EnumHelper.addArmorMaterial("PLATEDCHAINMAIL_ARMOR", "ittgarditemsmod:cloth", 18, new int[]{2,4,5,2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0f);
    public static ArmorMaterial BRIGANDINE_ARMOR = EnumHelper.addArmorMaterial("BRIGANDINE_ARMOR", "ittgarditemsmod:cloth", 20, new int[]{2,5,7,2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0f);
    public static ArmorMaterial PLATE_ARMOR = EnumHelper.addArmorMaterial("PLATE_ARMOR", "ittgarditemsmod:cloth", 22, new int[]{2,5,7,2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1f);
    public static ArmorMaterial SCALE_ARMOR = EnumHelper.addArmorMaterial("SCALE_ARMOR", "ittgarditemsmod:cloth", 23, new int[]{2,5,7,2}, 5, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2f);
    public static ArmorMaterial MITHRIL_ARMOR = EnumHelper.addArmorMaterial("MITHRIL_ARMOR", "ittgarditemsmod:cloth", 20, new int[]{3,6,7,3}, 5, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0f);
    public static ArmorMaterial DRAGONSCALE_ARMOR = EnumHelper.addArmorMaterial("DRAGONSCALE_ARMOR", "ittgarditemsmod:cloth", 20, new int[]{3,6,8,3}, 5, SoundEvents.BLOCK_STONE_BREAK, 3f);
    public static ArmorMaterial ANCIENT_ARMOR = EnumHelper.addArmorMaterial("ANCIENT_ARMOR", "ittgarditemsmod:cloth", 20, new int[]{3,6,9,4}, 5, SoundEvents.ENTITY_ENDERDRAGON_AMBIENT, 5f);
    public static ArmorMaterial DAEDRIC_ARMOR = EnumHelper.addArmorMaterial("DAEDRIC_ARMOR", "ittgarditemsmod:cloth", 80, new int[] {4, 7, 9, 4}, 35, SoundEvents.ITEM_BOTTLE_FILL_DRAGONBREATH, 10f);
    public static ArmorMaterial GOD_ARMOR = EnumHelper.addArmorMaterial("GOD_ARMOR", "ittgarditemsmod:cloth", 1000, new int[] {100, 100, 100, 100}, 100, SoundEvents.ENTITY_ENDERDRAGON_GROWL, 100f);

    public ItemCustomArmor(String unlocalizedName, ArmorMaterial material, int RenderIndex, EntityEquipmentSlot type) {
        super(material, RenderIndex, type);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ittgardMod.tabArmor);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (itemStack.getItem() == ModArmor.clothBoots) {
            player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 200));
        }

        if (itemStack.getItem() == DaedricArmor.daedricBootsDmg) {
            player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20, 2));
            if (player.inventory.getStackInSlot(103).getItem() == DaedricArmor.daedricHelmetDmg && player.inventory.getStackInSlot(102).getItem() == DaedricArmor.daedricChestplateDmg && player.inventory.getStackInSlot(101).getItem() == DaedricArmor.daedricLeggingsDmg){
                player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 200, 2));
            }
        }
    }

}
